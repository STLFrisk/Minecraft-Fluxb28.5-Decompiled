#!/usr/bin/env python3
"""Rename the decompiled tree from ZKM opaque tokens to readable identifiers.

Three tiers, because a blanket rename would be wrong:

  A. CLASSES - global.  Class names are unique tokens, and the replacement uses a
     boundary that refuses to match after '.', so a field that happens to share a
     class's name is left alone.

  B. MEMBERS declared by exactly one class - global.  check_rename_safety.py lists
     these from the bytecode, so `b6k` (only fyk) and `zkf` (only j1s) are safe,
     while `ron` (34 declaring classes) is not.

  C. MODULE LIFECYCLE - only inside ar7 itself and inside files whose type extends
     the renamed Module.  In those files `.ron()` is the module enable hook; in the
     other 33 classes that declare `ron` it means something else entirely, so a
     global rename there would merge unrelated methods.

Every mapping is recorded in mappings/rename-map.tsv so the rename stays auditable,
and names not covered here keep their original token.
"""
import collections
import io
import os
import re
import sys

TREE = sys.argv[1]
OUT_TREE = sys.argv[2]
MAP_OUT = sys.argv[3]

# ---------------------------------------------------------------- tier A: classes
CLASSES = {
    # client / world / entity
    'c05': 'Minecraft',
    'kh3': 'WorldClient',
    'l86': 'EntityPlayerSP',
    'g_3': 'Entity',
    'i2h': 'EntityLivingBase',
    'osf': 'EntityIronGolem',
    'w8s': 'EntityMob',
    'l5f': 'EntityAnimal',
    'dge': 'EntityVillager',
    'laq': 'EntityPlayer',
    'we7': 'EntityCreeper',
    'gze': 'EntitySkeleton',
    'ia2': 'EntityZombie',
    'zty': 'EntitySpider',
    # module framework
    'ar7': 'Module',
    'j1s': 'SubEngine',
    'kgt': 'ModuleRegistry',
    'zwr': 'ClientState',
    'mtl': 'EventBus',
    'mtl$_2w': 'EventBus$Handler',
    'vlc': 'Event',
    'u1p': 'ClientEvent',
    'fz2': 'PlayerUpdateEvent',
    'q8e': 'Event',
    'gnk': 'Event',
    'axn': 'Event',
    'ccn': 'TickEvent',
    'fha': 'RenderEvent',
    'jev': 'EventHandler',
    'nhs': 'Timer',
    'szk': 'ConfigManager',
    'yn6': 'ConfigName',
    '_x3': 'SettingRegistry',
    'lxj': 'FriendManager',
    'v6ma': 'NativeLoader',
    't9d': 'OpaquePredicate',
    # settings
    'dzm': 'Setting',
    'cn7': 'BooleanSetting',
    'crk': 'NumberSetting',
    'c_3': 'ModeSetting',
    'lva': 'SettingCategory',
    'c_3$a': 'ModeSetting$1',
    # KillAura
    'fyk': 'KillAura',
    'xbs': 'AuraEngine',
    'fyk$r1f': 'KillAura$TargetFilter',
    'e9p': 'AuraEngineAAC',
    'bb5': 'RotationHelper',
    # auth
    'q08': 'MainMenuScreen',
    'qih': 'LoginScreen',
    'prq': 'Session',
    'jiz': 'TokenGuard',
    'cfu': 'HttpClient',
    'an9': 'NativeCrypto',
    'dr9': 'HwidProvider',
    'q08$_r5': 'MainMenuScreen$1',
    # gui
    'fkf': 'ClickGui',
    'ers': 'GuiPanel',
    'ib3': 'GuiHandler',
    'ybv': 'InputState',
    'jej': 'HudRenderer',
    'n9l': 'TabGui',
    'gbe': 'ShaderHelper',
    'g5m': 'ShaderProgram',
    'ni3': 'ShaderBase',
    # misc
    'f5k': 'Rotation',
    'ar9': 'AntiBots',
    'oow': 'AimAssist',
    'i4o': 'Fly',
    'ohv': 'Speed',
    '_lk': 'Scaffold',
    'n9n': 'Velocity',
    'bb5': 'RotationHelper',
}

# ------------------------------------------------- tier B: single-declaring members
MEMBERS = {
    # ar7 (Module) - unique within ar7
    'tp_': 'toggle',
    'z5z': 'enable',
    'kkj': 'disable',
    'tb8': 'hasSubEngineNamed',
    # j1s (SubEngine)
    'zkf': 'getName',
    'e0r': 'getDescription',
    'qza': 'prepare',
    'd2z': 'setActive',
    'w4v': 'onUpdate',
    'i__': 'onRender',
    'a8n': 'setOwner',
    'ixy': 'registerNative',
    'jpe': 'addSubEngine',
    # settings - d7c/aze are declared by several classes but mean the same thing
    'd7c': 'getValue',
    'n1j': 'setValue',
    'aze': 'setValueRaw',
    'wyk': 'isAllowedValue',
    'ms1': 'setNumber',
    'rxi': 'getCategory',
    'dyh': 'getOptions',
    # event bus
    '__x': 'register',
    'mn9': 'unregister',
    'vpm': 'invokeHandler',
    'a65': 'dispatchTo',
    'tss': 'getMethod',
    '_5a': 'getTarget',
    # config
    'zj2': 'getModuleRegistry',
    'up0': 'getConfigManager',
    '_k4': 'loadConfig',
    'a2k': 'loadBinds',
    'j02': 'saveBinds',
    't8a': 'loadNamedConfig',
    'gqz': 'configGuardTick',
    'bxh': 'loadPreset',
    'm0g': 'saveConfig',
    # KillAura
    'b6k': 'isValidTarget',
    'k27': 'onRenderTargets',
    'ohn': 'onNotify',
    'cag': 'renderTargetHud',
    'nf1': 'onPlayerUpdate',
    # AuraEngine
    'o_a': 'onMotionEvent',
    'rzy': 'onUpdateEvent',
    'rxj': 'onTickEvent',
    'x9y': 'attack',
    'a3o': 'computeRotation',
    'o1r': 'passesFilter',
    'q1i': 'passesFilterEx',
    'h1s': 'resolveEntity',
    'y6j': 'collectTargets',
    'rl9': 'currentEvent',
    'spr': 'active',
    'lo6': 'targets',
    'mrm': 'targetsSorted',
    # native loader
    'Ex': 'verifyIntegrity',
}

# ------------------------------------------- tier C: module lifecycle, scoped files
MODULE_MEMBERS = {
    'ron': 'onEnable',
    'ne2': 'onDisable',
    'asw': 'setSubEnginesEnabled',
    'dv9': 'setEnabled',
    'yse': 'onEnabledChanged',
    'klu': 'isEnabled',
    'x_i': 'getKey',
    'nm8': 'setKey',
    'rb6': 'getName',
    'k9o': 'getDescription',
    'iio': 'enabled',
    'vlm': 'registrationEnabled',
    '_w6': 'subEngines',
    'isg': 'modeSetting',
    'lr0': 'alwaysRegistered',
}

WRITE_LOG = []


def rename_classes(text):
    for old, new in sorted(CLASSES.items(), key=lambda kv: -len(kv[0])):
        # refuse a match that follows '.' (a field/param sharing the class name)
        pat = re.compile(r'(?<![\w$.])' + re.escape(old) + r'(?![\w$])')
        text, n = pat.subn(new, text)
        if n:
            WRITE_LOG.append(('class', old, new, n))
    return text


def rename_members(text):
    for old, new in sorted(MEMBERS.items(), key=lambda kv: -len(kv[0])):
        pat = re.compile(r'(?<![\w$])' + re.escape(old) + r'(?![\w$])')
        text, n = pat.subn(new, text)
        if n:
            WRITE_LOG.append(('member', old, new, n))
    return text


def rename_module_members(text):
    for old, new in sorted(MODULE_MEMBERS.items(), key=lambda kv: -len(kv[0])):
        pat = re.compile(r'(?<![\w$])' + re.escape(old) + r'(?![\w$])')
        text, n = pat.subn(new, text)
        if n:
            WRITE_LOG.append(('module', old, new, n))
    return text


def main():
    files = []
    for dp, _, fns in os.walk(TREE):
        for fn in fns:
            if fn.endswith('.java'):
                files.append(os.path.join(dp, fn))
    print('  处理 %d 个 .java' % len(files))

    # The raw obfuscated-name tree is kept intact: it is the ground truth that the
    # rename can be checked against, and some files decompile more cleanly there.
    if os.path.exists(OUT_TREE):
        import shutil
        shutil.rmtree(OUT_TREE)

    renamed_files = 0
    for path in files:
        raw = io.open(path, encoding='utf-8', errors='replace').read()
        text = rename_classes(raw)
        text = rename_members(text)
        # tier C: ar7 itself, and every type that extends the renamed Module
        if re.search(r'\bextends\s+Module\b', text) or re.search(r'\bclass\s+Module\b', text):
            text = rename_module_members(text)
        rel = os.path.relpath(path, TREE)
        dst = os.path.join(OUT_TREE, rel)
        d = os.path.dirname(dst)
        if d and not os.path.isdir(d):
            os.makedirs(d)
        io.open(dst, 'w', encoding='utf-8').write(text)
        if text != raw:
            renamed_files += 1
    print('  已输出到 %s' % OUT_TREE)
    print('  其中 %d 个文件含重命名' % renamed_files)

    total = collections.Counter()
    for t, o, n, c in WRITE_LOG:
        total[(t, o, n)] += c
    with io.open(MAP_OUT, 'w', encoding='utf-8') as f:
        f.write('tier\toriginal\trenamed\thits\n')
        for (t, o, n), c in sorted(total.items()):
            f.write('%s\t%s\t%s\t%d\n' % (t, o, n, c))
    print('  映射表 -> %s  (%d 条)' % (MAP_OUT, len(total)))


if __name__ == '__main__':
    main()
