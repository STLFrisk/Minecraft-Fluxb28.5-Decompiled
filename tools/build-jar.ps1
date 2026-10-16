# Rebuild the Flux deliverable jar from the pristine original.
#
# Hard-won rules, each of which cost a debugging round:
#   1. Verify EVERY source file exists BEFORE opening the zip. A missing file
#      after $e.Delete() leaves the archive with a corrupt entry, because the
#      exception escapes the loop and the zip is never disposed.
#   2. Never delete the entry until the replacement bytes are in memory.
#   3. Verify each written entry's bytes back out of the finished zip; a size
#      comparison is not enough (a wrong entry of coincidentally equal size
#      slipped through once).
#   4. A class that carries more than one patch must be built from its own
#      composed artifact, never rebuilt from the pristine class - that silently
#      dropped P7 from kh3 and produced a startup crash.
param(
  [switch]$Install,
  # Where the patched client is copied when -Install is given.  No default: the
  # install location is machine-specific and this script is published.
  [string]$MinecraftJar
)
$ErrorActionPreference='Stop'
# Derived from this script's own location (Flux-RE/tools/), so the checkout can
# live anywhere.  $ws is the parent of the repository, which is where the class
# staging directories under work/ are kept.
$repo = Split-Path -Parent $PSScriptRoot
$ws   = Split-Path -Parent $repo
$w="$ws\work"
$rel="$repo\releases"
$orig="$repo\archive\sample\Flux-b28.5-original.jar"
$out="$rel\Flux_login_bypassed.jar"

$map=[ordered]@{
 'q08.class'="$w\patch_stage\q08.class"          # P1 P3 P5
 'jiz.class'="$w\patch_stage\jiz.class"          # P2
 'qih.class'="$w\patch_stage\qih.class"          # P4
 'ybv.class'="$w\patch_stage\ybv.class"          # P6
 'kh3.class'="$w\patch_kh3\kh3_final.class"      # P7 + P22 (composed)
 'kgt.class'="$w\patch_kgt\kgt.class"            # P9 + P23
 'zwr.class'="$w\patch_zwr\zwr.class"            # P8 P10 P21
 'lxj.class'="$w\patch_single\lxj.class"         # P10
 'jej.class'="$w\patch_jej\jej2.class"           # P12 P14
 'ar7.class'="$w\bus_out2\ar7_p30.class"         # P11 P13 P15 P17 P26 P29 P30
 'u1p.class'="$w\bus_out\u1p.class"              # P16
 'szk.class'="$w\patch_cfg\szk_probe.class"      # P18 + P24 + runtime probe
 'yn6.class'="$w\patch_yn6\yn6.class"            # P20
 'c05.class'="$w\patch_c05\c05.class"            # diagnostics: LineNumberTable on tur()
 'FluxDiag.class'="$w\diag\FluxDiag.class"       # NEW: in-process runtime probe
 'xbs.class'="$w\patch_xbs\xbs.class"            # NEW (P28): register the aura engine
 'FluxBus.class'="$w\diag\FluxBus.class"         # NEW (P29): sub-object register/unregister
}

# rule 1: all inputs present, and distinct
$missing=@()
$hashes=@{}
foreach($k in $map.Keys){
  if(-not (Test-Path $map[$k])){ $missing+=$k; continue }
  $h=(Get-FileHash $map[$k] -Algorithm SHA256).Hash
  if($hashes.ContainsKey($h)){ Write-Output ("  ★ $k 与 " + $hashes[$h] + " 内容相同") }
  $hashes[$h]=$k
}
if($missing.Count){ throw ("缺少源文件: " + ($missing -join ', ')) }
if(-not (Test-Path $orig)){ throw "缺少原始 jar" }

# rule 2: read every replacement into memory first
$bytes=@{}
foreach($k in $map.Keys){ $bytes[$k]=[System.IO.File]::ReadAllBytes($map[$k]) }

Add-Type -AssemblyName System.IO.Compression.FileSystem
Copy-Item $orig $out -Force

$zip=[System.IO.Compression.ZipFile]::Open($out,'Update')
try{
  foreach($k in $map.Keys){
    $e=$zip.GetEntry($k)
    if($e){ $e.Delete() }   # absent entries are allowed: new classes are added
    $ne=$zip.CreateEntry($k,[System.IO.Compression.CompressionLevel]::Optimal)
    $os=$ne.Open()
    try { $os.Write($bytes[$k],0,$bytes[$k].Length) } finally { $os.Dispose() }
  }
} finally { $zip.Dispose() }

# rule 3: read every patched entry back and compare bytes
$zip=[System.IO.Compression.ZipFile]::OpenRead($out)
$bad=@()
try{
  foreach($k in $map.Keys){
    $e=$zip.GetEntry($k)
    if(-not $e){ $bad+="$k(缺失)"; continue }
    $ms=New-Object System.IO.MemoryStream
    $s=$e.Open(); $s.CopyTo($ms); $s.Dispose()
    $got=$ms.ToArray(); $ms.Dispose()
    $want=$bytes[$k]
    if($got.Length -ne $want.Length){ $bad+="$k(长度 $($got.Length) != $($want.Length))"; continue }
    for($i=0;$i -lt $got.Length;$i++){ if($got[$i] -ne $want[$i]){ $bad+="$k(字节 $i 不同)"; break } }
  }
} finally { $zip.Dispose() }

if($bad.Count){ throw ("写回校验失败: " + ($bad -join ', ')) }

$h=(Get-FileHash $out -Algorithm SHA256).Hash
Write-Output ("  jar {0} 字节  sha256 {1}" -f (Get-Item $out).Length,$h)
Write-Output ("  13 个补丁类全部写回校验通过")

if($Install){
  if(-not $MinecraftJar){
    throw "-Install 需要 -MinecraftJar <目标 Flux.jar 的完整路径>"
  }
  if(-not (Test-Path $MinecraftJar)){
    throw "找不到目标: $MinecraftJar"
  }
  Copy-Item $out $MinecraftJar -Force
  Write-Output ("  已安装 -> " + (Get-FileHash $MinecraftJar -Algorithm SHA256).Hash)
}
