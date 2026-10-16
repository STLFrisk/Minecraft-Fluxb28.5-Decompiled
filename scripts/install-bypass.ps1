# Flux 登录绕过 —— 一键安装 / 回滚
# 用法：
#   .\install-bypass.ps1 -MinecraftRoot <你的 .minecraft 路径>              安装
#   .\install-bypass.ps1 -MinecraftRoot <你的 .minecraft 路径> -Rollback    回滚
#   （-JreSource 仅在需要指向打过 java.awt.Color 补丁的 JRE 时给出）
param(
  [switch]$Rollback,
  # 必填：本机 .minecraft 目录，例如 ...\versions 的上一级
  [string]$MinecraftRoot,
  # 可选：打过 J1 补丁的 JRE，未给出时跳过 PCL 的 Java 指向配置
  [string]$JreSource
)

$ErrorActionPreference = 'Stop'
if (-not $MinecraftRoot) {
  throw '请用 -MinecraftRoot <你的 .minecraft 路径> 指定目标，脚本不预设任何本机路径。'
}
if (-not (Test-Path $MinecraftRoot)) {
  throw "找不到 .minecraft 目录: $MinecraftRoot"
}
$here     = Split-Path -Parent $PSScriptRoot
$version  = Join-Path $MinecraftRoot 'versions\Flux'
$jar      = Join-Path $version 'Flux.jar'
$jarBak   = Join-Path $version 'Flux.jar.pre-backup'
$pclCfg   = Join-Path $version 'PCL\config.json'
$pclBak   = "$pclCfg.flux-orig"
$jreDst   = Join-Path (Split-Path -Parent $MinecraftRoot) 'jre8-flux'

function Say($m){ Write-Host "  $m" }

if ($Rollback) {
  Say '== 回滚 =='
  if (Test-Path $jarBak) { Copy-Item $jarBak $jar -Force; Say "客户端 jar 已还原" }
  if (Test-Path $pclBak) { Copy-Item $pclBak $pclCfg -Force; Say "PCL 配置已还原" }
  if (Test-Path $jreDst) { Remove-Item $jreDst -Recurse -Force; Say "已删除补丁版 JRE 副本" }
  Say '完成。系统 JRE 从未改动。'
  exit 0
}

Say '== 1/3 安装补丁版 JRE =='
if (-not $JreSource) {
  Say '未提供 -JreSource，跳过这一步'
  Say '（仅当客户端因 java.awt.Color 越界而崩溃时才需要，见报告 J1）'
} elseif (Test-Path $jreDst) {
  Say "已存在，跳过：$jreDst"
} else {
  Copy-Item $JreSource $jreDst -Recurse -Force
  Copy-Item "$jreDst\lib\rt.jar" "$jreDst\lib\rt.jar.flux-orig" -Force
  Add-Type -AssemblyName System.IO.Compression.FileSystem
  $patched = Join-Path $here 'patches\java-awt-Color.patched.class'
  if (-not (Test-Path $patched)) { throw "缺少补丁后的 Color.class：$patched" }
  $zip = [System.IO.Compression.ZipFile]::Open("$jreDst\lib\rt.jar", 'Update')
  $e = $zip.GetEntry('java/awt/Color.class'); if ($e) { $e.Delete() }
  $ne = $zip.CreateEntry('java/awt/Color.class', [System.IO.Compression.CompressionLevel]::Optimal)
  $os = $ne.Open(); $b = [System.IO.File]::ReadAllBytes($patched); $os.Write($b,0,$b.Length); $os.Dispose()
  $zip.Dispose()
  Say "已创建 $jreDst（原始 rt.jar 备份为 rt.jar.flux-orig）"
}

Say '== 2/3 安装绕过版客户端 =='
if (-not (Test-Path $jarBak)) { Copy-Item $jar $jarBak -Force; Say "已备份原始 jar -> Flux.jar.pre-backup" }
Copy-Item (Join-Path $here 'releases\Flux_login_bypassed.jar') $jar -Force
Say ('已替换 Flux.jar  sha256=' + (Get-FileHash $jar -Algorithm SHA256).Hash.Substring(0,16))

Say '== 3/3 指向补丁版 JRE =='
if (-not $JreSource) {
  Say '跳过：未安装补丁版 JRE'
} elseif (-not (Test-Path $pclCfg)) {
  Say "跳过：找不到 $pclCfg"
} else {
  if (-not (Test-Path $pclBak)) { Copy-Item $pclCfg $pclBak -Force }
  $cfg = Get-Content $pclCfg -Raw -Encoding UTF8 | ConvertFrom-Json
  $cfg.InstanceForcedJava.Folder = ($jreDst + '\bin\')
  [System.IO.File]::WriteAllText($pclCfg, ($cfg | ConvertTo-Json -Depth 6), (New-Object System.Text.UTF8Encoding($false)))
  Say "PCL2 该版本 Java 已指向 $jreDst\bin\"
}

Say ''
Say '完成。用 PCL2 正常启动即可。'
Say "回滚：.\install-bypass.ps1 -MinecraftRoot <你的 .minecraft 路径> -Rollback"