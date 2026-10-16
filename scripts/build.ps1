# NOTE: 本脚本覆盖 P1-P3 阶段的流水线/验证，保留作为方法记录。
# 当前 34 组补丁的权威构建是 tools/build-jar.ps1。
<#
.SYNOPSIS
    Apply the Flux-RE patches and produce the launchable artefacts.

.DESCRIPTION
    Produces, in order:
      work/patch_out/    P1 (login gate) + P2 (self-destruct trap)
      work/patch_out2/   + P3 (unauthenticated session null-guard)
      releases/Flux_login_bypassed.jar          P1+P2+P3, native gate left intact
      releases/Flux_login_bypassed_offline.jar  P1+P2+P3 + v6ma.Ex neutralised
      work/build/Flux_control.jar               v6ma only  -> dynamic control arm
      work/build/Flux_bypassed.jar              v6ma + P1+P2+P3 -> dynamic test arm

    Run scripts/bootstrap.ps1 first: this needs work/FluxClasses and work/index.

.EXAMPLE
    powershell -ExecutionPolicy Bypass -File .\scripts\build.ps1
#>
[CmdletBinding()]
param(
    [string]$WorkDir,
    [string]$FluxJar
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

$classes = Join-Path $WorkDir 'FluxClasses'
if (-not (Test-Path $classes)) { throw "缺少 $classes，请先运行 scripts/bootstrap.ps1" }

# The unpatched source jar is needed as the repack base. Prefer an explicit
# -FluxJar, then the cached copy bootstrap left behind, then the sibling
# CheatClient extraction if the caller kept one.
if (-not $FluxJar) {
    foreach ($cand in @(
        (Join-Path $repo 'work\Flux.jar'),
        (Join-Path $repo '..\CheatClient\.minecraft\versions\Flux\Flux.jar')
    )) {
        if (Test-Path $cand) { $FluxJar = [System.IO.Path]::GetFullPath($cand); break }
    }
}
if (-not $FluxJar -or -not (Test-Path $FluxJar)) {
    throw '找不到原始 Flux.jar。用 -FluxJar <path> 指定，或让 bootstrap.ps1 缓存一份到 work/Flux.jar。'
}
Write-Host ("base jar : {0}" -f $FluxJar) -ForegroundColor Green
Write-Host ("sha256   : {0}" -f (Get-FileHash $FluxJar -Algorithm SHA256).Hash)

function New-PatchedJar([string]$dst, [string[]]$localPaths, [string]$root) {
    New-Item -ItemType Directory -Force -Path (Split-Path $dst) | Out-Null
    Copy-Item $FluxJar $dst -Force
    Add-Type -AssemblyName System.IO.Compression.FileSystem
    $zip = [System.IO.Compression.ZipFile]::Open($dst, 'Update')
    try {
        foreach ($p in $localPaths) {
            $rel = $p.Substring($root.Length).TrimStart('\') -replace '\\', '/'
            $e = $zip.GetEntry($rel)
            if ($e) { $e.Delete() }
            $ne = $zip.CreateEntry($rel, [System.IO.Compression.CompressionLevel]::Optimal)
            $os = $ne.Open()
            $bytes = [System.IO.File]::ReadAllBytes($p)
            $os.Write($bytes, 0, $bytes.Length)
            $os.Dispose()
        }
    } finally { $zip.Dispose() }
}

# ------------------------------------------------------------------ P1 + P2
Write-Host ''
Write-Host '=== P1 登录门禁 + P2 自毁陷阱 ===' -ForegroundColor Cyan
$out1 = Join-Path $WorkDir 'patch_out'
Remove-Item $out1 -Recurse -Force -ErrorAction SilentlyContinue
& $python (Join-Path $repo 'tools\patch_login.py') $classes $out1
if ($LASTEXITCODE -ne 0) { throw 'patch_login.py 失败（fail-closed）' }

# ------------------------------------------------------------------ P3
Write-Host ''
Write-Host '=== P3 未登录会话空指针保护 ===' -ForegroundColor Cyan
$out2 = Join-Path $WorkDir 'patch_out2'
Remove-Item $out2 -Recurse -Force -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path $out2 | Out-Null
& $python (Join-Path $repo 'tools\patch_welcome.py') (Join-Path $out1 'q08.class') (Join-Path $out2 'q08.class')
if ($LASTEXITCODE -ne 0) { throw 'patch_welcome.py 失败（fail-closed）' }
Copy-Item (Join-Path $out1 'jiz.class') (Join-Path $out2 'jiz.class') -Force

# ------------------------------------------------------------------ 补丁报告
Write-Host ''
Write-Host '=== 生成补丁报告 ===' -ForegroundColor Cyan
& $python (Join-Path $repo 'tools\make_patch_report.py') $WorkDir (Join-Path $repo 'patches')
if ($LASTEXITCODE -ne 0) { throw 'make_patch_report.py 失败' }

# ------------------------------------------------------------------ 发行产物
Write-Host ''
Write-Host '=== 打包 releases/ ===' -ForegroundColor Cyan
$rel = Join-Path $repo 'releases'
New-Item -ItemType Directory -Force -Path $rel | Out-Null

New-PatchedJar (Join-Path $rel 'Flux_login_bypassed.jar') `
    @((Join-Path $out2 'q08.class'), (Join-Path $out2 'jiz.class')) $out2

# offline variant: also replace every class bootstrap patched for v6ma.Ex.
# patch_native.py writes a full copy of the tree, but only the classes listed in
# _patch_report.tsv actually changed — replacing byte-identical copies would just
# re-compress 3,394 entries for nothing.
# $stage lives under $build, so $build must be created and cleaned BEFORE staging.
$patchedTree = Join-Path $WorkDir 'FluxClasses_patched'
$build = Join-Path $WorkDir 'build'
Remove-Item $build -Recurse -Force -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path $build | Out-Null
$stage = Join-Path $build 'stage'
New-Item -ItemType Directory -Force -Path $stage | Out-Null

$patchReport = Join-Path $patchedTree '_patch_report.tsv'
$touched = @()
if (Test-Path $patchReport) {
    $touched = Get-Content $patchReport |
        ForEach-Object { ($_ -split "`t")[0] } |
        Where-Object { $_ } | Sort-Object -Unique
}
if ($touched.Count -gt 0) {
    foreach ($cls in $touched) {
        $relPath = ($cls -replace '\.', '\') + '.class'
        $srcFile = Join-Path $patchedTree $relPath
        if (-not (Test-Path $srcFile)) { throw "补丁报告里的 $cls 在 patched 树中不存在" }
        $dstFile = Join-Path $stage $relPath
        New-Item -ItemType Directory -Force -Path (Split-Path $dstFile) | Out-Null
        Copy-Item $srcFile $dstFile -Force
    }
    Write-Host ("  v6ma 实际改写：{0} 个类" -f $touched.Count)
} elseif (Test-Path $patchedTree) {
    Write-Host '  注意：找不到 _patch_report.tsv，offline 变体只含 P1-P3' -ForegroundColor Yellow
}
Copy-Item (Join-Path $out2 'q08.class') $stage -Force
Copy-Item (Join-Path $out2 'jiz.class') $stage -Force
New-PatchedJar (Join-Path $rel 'Flux_login_bypassed_offline.jar') `
    (Get-ChildItem $stage -Recurse -Filter *.class -File).FullName $stage

# ------------------------------------------------------------------ 动态对照两臂
Write-Host ''
Write-Host '=== 打包动态对照实验用 jar ===' -ForegroundColor Cyan
# $build was cleaned before staging; do not remove it again or $stage disappears
# and the bypassed arm silently becomes an unpatched copy of the client.

# control: v6ma neutralised only, login gate untouched
if (Test-Path $patchedTree) {
    New-PatchedJar (Join-Path $build 'Flux_control.jar') `
        (Get-ChildItem $patchedTree -Recurse -Filter *.class -File).FullName $patchedTree
} else {
    Write-Host '  跳过对照 jar：work/FluxClasses_patched 不存在' -ForegroundColor Yellow
}
# bypassed: v6ma neutralised + all three patches
$stageFiles = (Get-ChildItem $stage -Recurse -Filter *.class -File).FullName
if (-not $stageFiles -or $stageFiles.Count -lt 2) {
    throw "stage 目录为空（$stage）—— 拒绝生成一个未打补丁的 Flux_bypassed.jar"
}
New-PatchedJar (Join-Path $build 'Flux_bypassed.jar') $stageFiles $stage
Write-Host ("  Flux_bypassed.jar 内含 {0} 个改写类" -f $stageFiles.Count)

Write-Host ''
Write-Host '构建完成：' -ForegroundColor Green
Get-ChildItem $rel -Filter *.jar -File | ForEach-Object {
    Write-Host ("  {0,12}  {1}" -f $_.Length, $_.Name)
}
Write-Host ''
Write-Host '下一步：powershell -ExecutionPolicy Bypass -File .\scripts\verify.ps1'
