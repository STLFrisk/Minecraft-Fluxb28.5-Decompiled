<#
.SYNOPSIS
    Flux-RE bootstrap: rebuild the whole analysis workspace from a Flux.jar you supply.

.DESCRIPTION
    Steps
      1  verify the target jar and extract its classes
      2  fetch the public Minecraft 1.8 dependency set (needed for class linking)
      3  decompile with CFR
      4  locate every ZKM encrypted-string call site
      5  neutralise the native anti-tamper gate so classes can initialise offline
      6  run the JVM harness that lets each class decrypt its own string table
      7  write the decrypted literals back into the decompiled sources
      8  regenerate mappings/

    Nothing here contacts any Flux endpoint. The only outbound traffic is the
    public Maven download in step 2.

.EXAMPLE
    powershell -ExecutionPolicy Bypass -File .\scripts\bootstrap.ps1 -FluxJar C:\samples\Flux.jar

.EXAMPLE
    # re-run only the mapping stage, after you edited tools/gen_mappings.py
    powershell -ExecutionPolicy Bypass -File .\scripts\bootstrap.ps1 -FluxJar C:\samples\Flux.jar -FromStep 8
#>
[CmdletBinding()]
param(
    [Parameter(Mandatory = $true)][string]$FluxJar,
    [string]$WorkDir,
    [ValidateRange(1, 8)][int]$FromStep = 1,
    [switch]$SkipDeps,
    [switch]$SkipDecompile
)

$ErrorActionPreference = 'Stop'
$repo = Split-Path -Parent $PSScriptRoot
if (-not $WorkDir) { $WorkDir = Join-Path $repo 'work' }
$WorkDir = [System.IO.Path]::GetFullPath($WorkDir)

$EXPECTED_SHA256 = '506D7B5659846F4F440CC6CB2BAB69D0A38262A213A4C7F43521C5DF1964FE2E'

function Step([int]$n, [string]$text) {
    Write-Host ''
    Write-Host ("=== [{0}/8] {1}" -f $n, $text) -ForegroundColor Cyan
}
function Need([string]$exe, [string]$hint) {
    $c = Get-Command $exe -ErrorAction SilentlyContinue
    if (-not $c) { throw "找不到 $exe。$hint" }
    return $c.Source
}
function Get-Python {
    if ($env:FLUXRE_PYTHON -and (Test-Path $env:FLUXRE_PYTHON)) { return $env:FLUXRE_PYTHON }
    foreach ($n in 'python', 'python3', 'py') {
        $c = Get-Command $n -ErrorAction SilentlyContinue
        if ($c) { return $c.Source }
    }
    throw '找不到 Python。设置 $env:FLUXRE_PYTHON 指向解释器。'
}
# Replace the given class entries inside a copy of the original jar.
function New-PatchedJar([string]$dst, [hashtable]$replacements) {
    Copy-Item $FluxJar $dst -Force
    Add-Type -AssemblyName System.IO.Compression.FileSystem
    $zip = [System.IO.Compression.ZipFile]::Open($dst, 'Update')
    try {
        foreach ($entry in $replacements.Keys) {
            $e = $zip.GetEntry($entry)
            if ($e) { $e.Delete() }
            $ne = $zip.CreateEntry($entry, [System.IO.Compression.CompressionLevel]::Optimal)
            $os = $ne.Open()
            $bytes = [System.IO.File]::ReadAllBytes($replacements[$entry])
            $os.Write($bytes, 0, $bytes.Length)
            $os.Dispose()
        }
    } finally { $zip.Dispose() }
}

$python = Get-Python
$env:PYTHONIOENCODING = 'utf-8'

Write-Host 'Flux-RE bootstrap' -ForegroundColor Green
Write-Host ("  target : {0}" -f $FluxJar)
Write-Host ("  work   : {0}" -f $WorkDir)

if (-not (Test-Path $FluxJar)) { throw "找不到目标 jar：$FluxJar" }

# ----------------------------------------------------------------- 1
if ($FromStep -le 1) {
    Step 1 '校验目标并解包 class'
    $sha = (Get-FileHash $FluxJar -Algorithm SHA256).Hash
    if ($sha -ne $EXPECTED_SHA256) {
        Write-Host ("  警告：SHA-256 与分析时不一致") -ForegroundColor Yellow
        Write-Host ("        期望 {0}" -f $EXPECTED_SHA256)
        Write-Host ("        实际 {0}" -f $sha)
        Write-Host '        类名偏移与补丁偏移可能全部失效。' -ForegroundColor Yellow
    } else {
        Write-Host '  SHA-256 匹配分析样本' -ForegroundColor Green
    }

    $classes = Join-Path $WorkDir 'FluxClasses'
    New-Item -ItemType Directory -Force -Path $classes, (Join-Path $WorkDir 'index') | Out-Null
    Add-Type -AssemblyName System.IO.Compression.FileSystem
    $zip = [System.IO.Compression.ZipFile]::OpenRead($FluxJar)
    try {
        $n = 0
        foreach ($e in $zip.Entries) {
            if (-not $e.Name.EndsWith('.class')) { continue }
            $dest = Join-Path $classes ($e.FullName -replace '/', '\')
            New-Item -ItemType Directory -Force -Path (Split-Path $dest) | Out-Null
            [System.IO.Compression.ZipFileExtensions]::ExtractToFile($e, $dest, $true)
            $n++
        }
    } finally { $zip.Dispose() }
    Write-Host ("  解出 {0} 个 class -> {1}" -f $n, $classes) -ForegroundColor Green

    # the dropped native module, for static PE triage only (never loaded)
    $soterSrc = Join-Path $WorkDir 'native\Soter'
    if (-not (Test-Path $soterSrc)) {
        New-Item -ItemType Directory -Force -Path (Split-Path $soterSrc) | Out-Null
        $zip = [System.IO.Compression.ZipFile]::OpenRead($FluxJar)
        try {
            $e = $zip.Entries | Where-Object { $_.FullName -eq 'META-INF/Soter' } | Select-Object -First 1
            if ($e) {
                [System.IO.Compression.ZipFileExtensions]::ExtractToFile($e, $soterSrc, $true)
                Write-Host ("  META-INF/Soter -> {0}（仅静态解析，不加载）" -f $soterSrc) -ForegroundColor Green
            }
        } finally { $zip.Dispose() }
    }
}

# ----------------------------------------------------------------- 2
if ($FromStep -le 2 -and -not $SkipDeps) {
    Step 2 '下载 Minecraft 1.8 公开依赖库'
    $node = Need 'node' '安装 Node.js 18+，或用 -SkipDeps 跳过（会影响字符串解密覆盖率）。'
    $libs = Join-Path $WorkDir 'libs'
    & $node (Join-Path $repo 'tools\fetchlibs.js') $libs
    $jarCount = (Get-ChildItem $libs -Filter *.jar -File -ErrorAction SilentlyContinue).Count
    Write-Host ("  依赖库：{0} 个 jar" -f $jarCount) -ForegroundColor Green

    $cfr = Join-Path $repo 'tools\cfr.jar'
    if (-not (Test-Path $cfr)) {
        Write-Host '  下载 CFR 0.152 ...'
        & $node (Join-Path $repo 'tools\dl.js') $cfr
        $h = (Get-FileHash $cfr -Algorithm SHA256).Hash
        Write-Host ("  cfr.jar sha256 {0}" -f $h)
        if ($h -ne 'F686E8F3DED377D7BC87D216A90E9E9512DF4156E75B06C655A16648AE8765B2') {
            Write-Host '  注意：CFR 哈希与已知版本不同，反编译输出可能有差异。' -ForegroundColor Yellow
        }
    }
}

# ----------------------------------------------------------------- 3
if ($FromStep -le 3 -and -not $SkipDecompile) {
    Step 3 'CFR 反编译'
    $java = Need 'java' '安装 JDK 17+。'
    $cfr = Join-Path $repo 'tools\cfr.jar'
    if (-not (Test-Path $cfr)) {
        Write-Host '  跳过：缺少 tools/cfr.jar（见 tools/README.md）' -ForegroundColor Yellow
    } else {
        $out = Join-Path $repo 'reference\decompiled'
        New-Item -ItemType Directory -Force -Path $out | Out-Null
        $cp = ((Get-ChildItem (Join-Path $WorkDir 'libs') -Filter *.jar -File -ErrorAction SilentlyContinue).FullName) -join ';'
        if ($cp) {
            & $java -jar $cfr --extraclasspath $cp --outputdir $out $FluxJar
        } else {
            & $java -jar $cfr --outputdir $out $FluxJar
        }
        Write-Host ("  源码 -> {0}" -f $out) -ForegroundColor Green
    }
}

# ----------------------------------------------------------------- 4
if ($FromStep -le 4) {
    Step 4 '定位 ZKM 加密字符串调用点'
    & $python (Join-Path $repo 'tools\harvest.py') (Join-Path $WorkDir 'FluxClasses') (Join-Path $WorkDir 'index')
    & $python (Join-Path $repo 'tools\callscan.py') (Join-Path $WorkDir 'FluxClasses') (Join-Path $WorkDir 'index')
    Write-Host '  index/ 完成' -ForegroundColor Green
}

# ----------------------------------------------------------------- 5
$patchedJar = Join-Path $WorkDir 'Flux_patched.jar'
if ($FromStep -le 5) {
    Step 5 '中和原生反篡改门禁 v6ma.Ex'
    $src = Join-Path $WorkDir 'FluxClasses'
    $dst = Join-Path $WorkDir 'FluxClasses_patched'
    & $python (Join-Path $repo 'tools\patch_native.py') $src $dst 'v6ma' 'Ex' '(I)V'
    if ($LASTEXITCODE -ne 0) { throw 'patch_native.py 失败' }

    $rep = @{}
    Get-ChildItem $dst -Recurse -Filter *.class -File | ForEach-Object {
        $rel = $_.FullName.Substring($dst.Length).TrimStart('\') -replace '\\', '/'
        $rep[$rel] = $_.FullName
    }
    New-PatchedJar $patchedJar $rep
    Write-Host ("  改写 {0} 个类 -> {1}" -f $rep.Count, $patchedJar) -ForegroundColor Green
}

# ----------------------------------------------------------------- 6
$plainDir = Join-Path $WorkDir 'plain2'
if ($FromStep -le 6) {
    Step 6 'JVM 夹具解密字符串表'
    $java = Need 'java' '安装 JDK 17+。'
    $javac = Join-Path (Split-Path (Split-Path $java)) 'javac.exe'
    if (-not (Test-Path $javac)) { $javac = (Need 'javac' '安装完整 JDK（不是 JRE）。') }
    $cls = Join-Path $WorkDir 'harness-classes'
    New-Item -ItemType Directory -Force -Path $cls, $plainDir | Out-Null
    & $javac -d $cls (Join-Path $repo 'tools\DumpStrings.java')
    if ($LASTEXITCODE -ne 0) { throw 'DumpStrings.java 编译失败' }

    $cp = "$cls;$patchedJar;" + (((Get-ChildItem (Join-Path $WorkDir 'libs') -Filter *.jar -File -ErrorAction SilentlyContinue).FullName) -join ';')
    & $java -cp $cp DumpStrings (Join-Path $WorkDir 'index\callsites.tsv') $plainDir 30000 $patchedJar
    $ok = 0; $bad = 0
    $p = Join-Path $plainDir 'strings_plain.tsv'
    if (Test-Path $p) { $ok = (Get-Content $p | Measure-Object -Line).Lines - 1 }
    $e = Join-Path $plainDir 'strings_errors.tsv'
    if (Test-Path $e) { $bad = (Get-Content $e | Measure-Object -Line).Lines - 1 }
    Write-Host ("  恢复 {0} 条字面量，{1} 个调用点失败" -f $ok, $bad) -ForegroundColor Green
}

# ----------------------------------------------------------------- 7
if ($FromStep -le 7) {
    Step 7 '把明文写回反编译源码'
    $src = Join-Path $repo 'reference\decompiled'
    $out = Join-Path $repo 'reference\decompiled-annotated'
    $plain = Join-Path $plainDir 'strings_plain.tsv'
    if (-not (Test-Path $src)) {
        Write-Host '  跳过：reference/decompiled 不存在（第 3 步被跳过？）' -ForegroundColor Yellow
    } elseif (-not (Test-Path $plain)) {
        Write-Host '  跳过：缺少 strings_plain.tsv' -ForegroundColor Yellow
    } else {
        New-Item -ItemType Directory -Force -Path $out | Out-Null
        $files = Get-ChildItem $src -Recurse -Filter *.java -File
        $batch = @()
        foreach ($f in $files) {
            $batch += $f.FullName
            if ($batch.Count -ge 150) {
                & $python (Join-Path $repo 'tools\annotate.py') $plain $out @batch
                $batch = @()
            }
        }
        if ($batch.Count) { & $python (Join-Path $repo 'tools\annotate.py') $plain $out @batch }
        Write-Host ("  标注 {0} 个源文件 -> {1}" -f $files.Count, $out) -ForegroundColor Green
    }
}

# ----------------------------------------------------------------- 8
if ($FromStep -le 8) {
    Step 8 '生成 mappings/'
    & $python (Join-Path $repo 'tools\gen_mappings.py') $WorkDir (Join-Path $WorkDir 'FluxClasses') (Join-Path $repo 'mappings')
    Write-Host '  mappings/ 完成' -ForegroundColor Green
}

Write-Host ''
Write-Host 'bootstrap 完成。下一步：' -ForegroundColor Green
Write-Host '  powershell -ExecutionPolicy Bypass -File .\scripts\build.ps1'
Write-Host '  powershell -ExecutionPolicy Bypass -File .\scripts\verify.ps1'
