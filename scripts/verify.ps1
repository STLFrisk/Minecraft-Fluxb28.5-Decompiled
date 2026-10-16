# NOTE: 本脚本覆盖 P1-P3 阶段的流水线/验证，保留作为方法记录。
# 当前 34 组补丁的权威构建是 tools/build-jar.ps1。
<#
.SYNOPSIS
    Run the three-way verification of the Flux-RE patches.

.DESCRIPTION
    1  static reachability proof   - the login block must become unreachable while
                                     every menu-path hop stays reachable, with the
                                     method entry AND all exception handler PCs as roots
    2  JVM bytecode verification   - patched classes must LINK; plus a deliberately
                                     corrupted control that must be rejected
    3  dynamic gate test           - unauthenticated drawScreen(): the original build
                                     must enter qih.<init>, the patched build must not

    Writes a log to evidence/ and exits non-zero if any check fails.

.EXAMPLE
    powershell -ExecutionPolicy Bypass -File .\scripts\verify.ps1
#>
[CmdletBinding()]
param(
    [string]$WorkDir
)

$ErrorActionPreference = 'Stop'
$repo = Split-Path -Parent $PSScriptRoot
if (-not $WorkDir) { $WorkDir = Join-Path $repo 'work' }
$WorkDir = [System.IO.Path]::GetFullPath($WorkDir)

function Get-Python {
    if ($env:FLUXRE_PYTHON -and (Test-Path $env:FLUXRE_PYTHON)) { return $env:FLUXRE_PYTHON }
    foreach ($n in 'python', 'python3', 'py') {
        $c = Get-Command $n -ErrorAction SilentlyContinue
        if ($c) { return $c.Source }
    }
    throw '找不到 Python。设置 $env:FLUXRE_PYTHON 指向解释器。'
}
$python = Get-Python
$env:PYTHONIOENCODING = 'utf-8'

$failures = @()
$evidence = Join-Path $repo 'evidence'
New-Item -ItemType Directory -Force -Path $evidence | Out-Null

$classes = Join-Path $WorkDir 'FluxClasses'
$out2 = Join-Path $WorkDir 'patch_out2'
$rel = Join-Path $repo 'releases'
$build = Join-Path $WorkDir 'build'

foreach ($p in @($classes, $out2)) {
    if (-not (Test-Path $p)) { throw "缺少 $p，请先运行 scripts/bootstrap.ps1 与 scripts/build.ps1" }
}

# ------------------------------------------------------------------ 1
Write-Host ''
Write-Host '=== [1/3] 静态可达性证明 ===' -ForegroundColor Cyan
$log = Join-Path $evidence 'validation_reachability.txt'
& $python (Join-Path $repo 'tools\validate_patch.py') $classes $out2 2>&1 | Tee-Object -FilePath $log
if ($LASTEXITCODE -ne 0) { $failures += '可达性证明' }

# the control arm: the same analysis must find the login block REACHABLE in the original
Write-Host '  对照（原版类，登录块应当可达）...'
$ctrl = & $python -c @"
import sys, io
sys.path.insert(0, r'$($repo)\tools')
import callscan, patch_login, validate_patch as V
blob = io.open(r'$classes\q08.class','rb').read()
for mname, mdesc, cfo, code, pool in patch_login.code_arrays(blob):
    if mname != 'drawScreen': continue
    insns = callscan.decode_instructions(code)
    logins = V.new_of(pool, insns, 'qih')
    seen = V.reachable(insns, code, {0})
    print('REACHABLE' if any(l in seen for l in logins) else 'UNREACHABLE')
"@
if ($ctrl -notcontains 'REACHABLE') {
    Write-Host '  对照失败：原版登录块竟然不可达 —— 可达性分析本身有问题' -ForegroundColor Red
    $failures += '可达性对照'
} else {
    Write-Host '  对照通过：原版登录块可达' -ForegroundColor Green
}

# ------------------------------------------------------------------ 2
Write-Host ''
Write-Host '=== [2/3] JVM 字节码校验 ===' -ForegroundColor Cyan
$java = (Get-Command java -ErrorAction SilentlyContinue).Source
if (-not $java) { throw '找不到 java，安装 JDK 17+。' }
$javac = Join-Path (Split-Path (Split-Path $java)) 'javac.exe'
if (-not (Test-Path $javac)) { $javac = (Get-Command javac -ErrorAction SilentlyContinue).Source }
if (-not $javac) { throw '找不到 javac，安装完整 JDK（不是 JRE）。' }

$hc = Join-Path $WorkDir 'harness-classes'
New-Item -ItemType Directory -Force -Path $hc | Out-Null
& $javac -d $hc (Join-Path $repo 'tools\VerifyPatch.java') (Join-Path $repo 'tools\DynamicGateTest.java')
if ($LASTEXITCODE -ne 0) { throw '校验夹具编译失败' }

foreach ($jarName in 'Flux_login_bypassed.jar', 'Flux_login_bypassed_offline.jar') {
    $jar = Join-Path $rel $jarName
    if (-not (Test-Path $jar)) { Write-Host "  跳过 $jarName（未构建）" -ForegroundColor Yellow; continue }
    Write-Host "  -- $jarName"
    $out = & $java -cp $hc VerifyPatch $jar q08 jiz 2>&1
    $out | ForEach-Object { Write-Host ("     " + $_) }
    if ($out -notcontains 'RESULT: every class linked and passed bytecode verification') {
        $failures += "字节码校验 $jarName"
    }
}

# corrupted-patch control: must be rejected with VerifyError
$badDir = Join-Path $WorkDir 'patch_bad'
New-Item -ItemType Directory -Force -Path $badDir | Out-Null
& $python -c @"
import io
blob = bytearray(io.open(r'$out2\q08.class','rb').read())
# Break the displacement of the injected `pop;nop;nop;goto` sequence. The verifier
# must reject the result with VerifyError; a checker that always passes is useless.
patched = False
for off in range(len(blob) - 6):
    if blob[off] == 0x57 and blob[off+1] == 0 and blob[off+2] == 0 and blob[off+3] == 0xA7:
        blob[off+5] = 0x7F
        patched = True
        break
if not patched:
    raise SystemExit('FAIL: could not locate the injected goto sequence')
io.open(r'$badDir\q08.class','wb').write(bytes(blob))
print('corrupted control class written')
"@
if ($LASTEXITCODE -ne 0) { throw '生成畸形对照类失败' }
$ctrlJar = Join-Path $WorkDir 'build\Flux_control_bad.jar'
if (Test-Path (Join-Path $build 'Flux_control.jar')) {
    Copy-Item (Join-Path $build 'Flux_control.jar') $ctrlJar -Force
    Add-Type -AssemblyName System.IO.Compression.FileSystem
    $zip = [System.IO.Compression.ZipFile]::Open($ctrlJar, 'Update')
    try {
        $e = $zip.GetEntry('q08.class'); if ($e) { $e.Delete() }
        $ne = $zip.CreateEntry('q08.class')
        $os = $ne.Open(); $b = [System.IO.File]::ReadAllBytes("$badDir\q08.class"); $os.Write($b, 0, $b.Length); $os.Dispose()
    } finally { $zip.Dispose() }
    Write-Host '  -- 对照：故意改错的补丁应当被拒绝'
    $cout = & $java -cp $hc VerifyPatch $ctrlJar q08 2>&1
    $cout | Select-Object -First 6 | ForEach-Object { Write-Host ("     " + $_) }
    if ($cout -match 'VERIFICATION FAILURE') {
        Write-Host '     对照通过：VerifyError 被检出' -ForegroundColor Green
    } else {
        Write-Host '     对照失败：畸形补丁竟然通过了校验' -ForegroundColor Red
        $failures += '畸形补丁对照'
    }
}

# ------------------------------------------------------------------ 3
Write-Host ''
Write-Host '=== [3/3] 动态门禁对照实验 ===' -ForegroundColor Cyan
# The harness needs the Minecraft dependency set AND the flux:* libraries:
# zwr.<clinit> touches us.myles.ViaVersion, so without flux:* the class cannot
# initialise and the experiment would be inconclusive rather than a bypass.
$libs = @()
$libs += (Get-ChildItem (Join-Path $WorkDir 'libs') -Filter *.jar -File -ErrorAction SilentlyContinue).FullName
$libs += (Get-ChildItem (Join-Path $repo 'releases\bundled-libraries') -Recurse -Filter *.jar -File -ErrorAction SilentlyContinue).FullName
$cp = "$hc;" + ($libs -join ';')
Write-Host ("  classpath jars: {0}" -f $libs.Count)
$arms = @(
    @{ Jar = (Join-Path $build 'Flux_control.jar');  Expect = 'LOGIN GATE ACTIVE'; Log = 'dynamic_test_control.txt';  Label = '对照（门禁完好）' },
    @{ Jar = (Join-Path $build 'Flux_bypassed.jar'); Expect = 'LOGIN BYPASSED';    Log = 'dynamic_test_patched.txt'; Label = '补丁版' }
)
foreach ($arm in $arms) {
    if (-not (Test-Path $arm.Jar)) { Write-Host ("  跳过 {0}（未构建）" -f $arm.Label) -ForegroundColor Yellow; continue }
    Write-Host ("  -- {0}" -f $arm.Label)
    # 2>&1 (not 2>$null): with $ErrorActionPreference=Stop a native command that
    # writes to stderr raises a terminating error even when stderr is discarded.
    $prevEap = $ErrorActionPreference
    $ErrorActionPreference = 'Continue'
    try { $out = & $java -cp $cp DynamicGateTest $arm.Jar 2>&1 | ForEach-Object { "$_" } }
    finally { $ErrorActionPreference = $prevEap }
    $out | ForEach-Object { Write-Host ("     " + $_) }
    $out | Set-Content (Join-Path $evidence $arm.Log) -Encoding UTF8
    $verdict = ($out | Where-Object { $_ -match 'VERDICT' }) -join ''
    if ($verdict -match 'INCONCLUSIVE') {
        Write-Host '     结论无效：环境不完整，门禁根本没被求值' -ForegroundColor Red
        $failures += "动态实验 $($arm.Label)（INCONCLUSIVE）"
    } elseif ($verdict -notmatch $arm.Expect) {
        Write-Host ("     期望包含 '{0}'，未匹配" -f $arm.Expect) -ForegroundColor Red
        $failures += "动态实验 $($arm.Label)"
    } else {
        Write-Host '     通过' -ForegroundColor Green
    }
}

# ------------------------------------------------------------------ 结果
Write-Host ''
if ($failures.Count -eq 0) {
    Write-Host '全部验证通过。' -ForegroundColor Green
    Write-Host ("证据写入 {0}" -f $evidence)
    exit 0
}
Write-Host '验证未通过：' -ForegroundColor Red
$failures | ForEach-Object { Write-Host ("  - " + $_) -ForegroundColor Red }
exit 1
