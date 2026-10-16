import java.util.Random;
import net.minecraft.tileentity.TileEntityPiston;

public class myw extends rw8 {
   public static final qx_ lw_ = u4_.dju;
   public static final zb_ _yy = u4_.x38;

   public myw() {
      super(p3y.f41);
      this.y8l(this._8_.c32().zvi(lw_, vt2.z9q).zvi(_yy, u4_$vxa.ek6));
      this.q6h(-1.0F);
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return null;
   }

   public static pyk ck1(zfz var0, vt2 var1, boolean var2, boolean var3) {
      return new TileEntityPiston(var0, var1, var2, var3);
   }

   @Override
   public void b8f(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 0a: astore 5
      // 0c: aload 5
      // 0e: iload 4
      // 10: ifeq 29
      // 13: instanceof net/minecraft/tileentity/TileEntityPiston
      // 16: ifeq 34
      // 19: goto 20
      // 1c: invokestatic myw.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 5
      // 22: goto 29
      // 25: invokestatic myw.a (Loov;)Loov;
      // 28: athrow
      // 29: checkcast net/minecraft/tileentity/TileEntityPiston
      // 2c: invokevirtual net/minecraft/tileentity/TileEntityPiston.jm_ ()V
      // 2f: iload 4
      // 31: ifne 42
      // 34: aload 0
      // 35: aload 1
      // 36: aload 2
      // 37: aload 3
      // 38: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // 3b: goto 42
      // 3e: invokestatic myw.a (Loov;)Loov;
      // 41: athrow
      // 42: return
   }

   @Override
   public boolean ctq(t9d var1, mew var2) {
      return false;
   }

   @Override
   public boolean d9o(t9d var1, mew var2, vt2 var3) {
      return false;
   }

   @Override
   public void bf0(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: aload 3
      // 02: getstatic myw.lw_ Lqx_;
      // 05: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0a: checkcast vt2
      // 0d: invokevirtual vt2.b4b ()Lvt2;
      // 10: invokevirtual mew.offset (Lvt2;)Lmew;
      // 13: astore 5
      // 15: invokestatic t9d.c ()I
      // 18: aload 1
      // 19: aload 5
      // 1b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1e: astore 6
      // 20: istore 4
      // 22: aload 6
      // 24: invokeinterface zfz.r_y ()Le0x; 1
      // 29: instanceof aog
      // 2c: iload 4
      // 2e: ifne 52
      // 31: ifeq 6f
      // 34: goto 3b
      // 37: invokestatic myw.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 6
      // 3d: getstatic aog.cv2 Lh76;
      // 40: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 45: checkcast java/lang/Boolean
      // 48: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4b: goto 52
      // 4e: invokestatic myw.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 4
      // 54: ifne 6e
      // 57: ifeq 6f
      // 5a: goto 61
      // 5d: invokestatic myw.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 1
      // 62: aload 5
      // 64: invokevirtual t9d.i6x (Lmew;)Z
      // 67: goto 6e
      // 6a: invokestatic myw.a (Loov;)Loov;
      // 6d: athrow
      // 6e: pop
      // 6f: return
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 9
      // 0b: ifne 43
      // 0e: ifne 42
      // 11: goto 18
      // 14: invokestatic myw.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: iload 9
      // 1c: ifne 3c
      // 1f: goto 26
      // 22: invokestatic myw.a (Loov;)Loov;
      // 25: athrow
      // 26: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 29: ifnonnull 42
      // 2c: goto 33
      // 2f: invokestatic myw.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: aload 2
      // 35: goto 3c
      // 38: invokestatic myw.a (Loov;)Loov;
      // 3b: athrow
      // 3c: invokevirtual t9d.i6x (Lmew;)Z
      // 3f: pop
      // 40: bipush 1
      // 41: ireturn
      // 42: bipush 0
      // 43: ireturn
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public void ix7(t9d var1, mew var2, zfz var3, float var4, int var5) {
      int var6 = t9d.b();
      if (!var1.v0f) {
         TileEntityPiston var7 = this.m_u(var1, var2);

         TileEntityPiston var10000;
         label21: {
            try {
               var10000 = var7;
               if (var6 == 0) {
                  break label21;
               }

               if (var7 == null) {
                  return;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var10000 = var7;
         }

         zfz var8 = var10000.x1g();
         var8.r_y().lf0(var1, var2, var8, 0);
      }
   }

   @Override
   public akm mns(t9d var1, mew var2, fqr var3, fqr var4) {
      return null;
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: iload 5
      // 08: ifeq 20
      // 0b: getfield t9d.v0f Z
      // 0e: ifne 25
      // 11: goto 18
      // 14: invokestatic myw.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic myw.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 24: pop
      // 25: return
   }

   @Override
   public nh4 m__(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokespecial myw.m_u (Lm5n;Lmew;)Lnet/minecraft/tileentity/TileEntityPiston;
      // 0b: astore 5
      // 0d: aload 5
      // 0f: iload 4
      // 11: ifeq 26
      // 14: ifnonnull 24
      // 17: goto 1e
      // 1a: invokestatic myw.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aconst_null
      // 1f: areturn
      // 20: invokestatic myw.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 5
      // 26: fconst_0
      // 27: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 2a: fstore 6
      // 2c: aload 5
      // 2e: invokevirtual net/minecraft/tileentity/TileEntityPiston._2v ()Z
      // 31: ifeq 3a
      // 34: fconst_1
      // 35: fload 6
      // 37: fsub
      // 38: fstore 6
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: aload 5
      // 3f: invokevirtual net/minecraft/tileentity/TileEntityPiston.x1g ()Lzfz;
      // 42: fload 6
      // 44: aload 5
      // 46: invokevirtual net/minecraft/tileentity/TileEntityPiston.mja ()Lvt2;
      // 49: invokevirtual myw.kfw (Lt9d;Lmew;Lzfz;FLvt2;)Lnh4;
      // 4c: areturn
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: aload 2
      // 007: invokespecial myw.m_u (Lm5n;Lmew;)Lnet/minecraft/tileentity/TileEntityPiston;
      // 00a: astore 4
      // 00c: aload 4
      // 00e: iload 3
      // 00f: ifeq 01e
      // 012: ifnull 120
      // 015: goto 01c
      // 018: invokestatic myw.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 4
      // 01e: invokevirtual net/minecraft/tileentity/TileEntityPiston.x1g ()Lzfz;
      // 021: astore 5
      // 023: aload 5
      // 025: invokeinterface zfz.r_y ()Le0x; 1
      // 02a: astore 6
      // 02c: aload 6
      // 02e: iload 3
      // 02f: ifeq 046
      // 032: aload 0
      // 033: if_acmpeq 04f
      // 036: goto 03d
      // 039: invokestatic myw.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 6
      // 03f: goto 046
      // 042: invokestatic myw.a (Loov;)Loov;
      // 045: athrow
      // 046: invokevirtual e0x.p1r ()Lp3y;
      // 049: getstatic p3y.cei Lp3y;
      // 04c: if_acmpne 054
      // 04f: return
      // 050: invokestatic myw.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 4
      // 056: fconst_0
      // 057: invokevirtual net/minecraft/tileentity/TileEntityPiston.vnk (F)F
      // 05a: fstore 7
      // 05c: iload 3
      // 05d: ifeq 07c
      // 060: aload 4
      // 062: invokevirtual net/minecraft/tileentity/TileEntityPiston._2v ()Z
      // 065: ifeq 075
      // 068: goto 06f
      // 06b: invokestatic myw.a (Loov;)Loov;
      // 06e: athrow
      // 06f: fconst_1
      // 070: fload 7
      // 072: fsub
      // 073: fstore 7
      // 075: aload 6
      // 077: aload 1
      // 078: aload 2
      // 079: invokevirtual e0x.c7i (Lm5n;Lmew;)V
      // 07c: aload 6
      // 07e: getstatic ox_.nc0 Laog;
      // 081: iload 3
      // 082: ifeq 09b
      // 085: if_acmpeq 09e
      // 088: goto 08f
      // 08b: invokestatic myw.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 6
      // 091: getstatic ox_.wdk Laog;
      // 094: goto 09b
      // 097: invokestatic myw.a (Loov;)Loov;
      // 09a: athrow
      // 09b: if_acmpne 0a1
      // 09e: fconst_0
      // 09f: fstore 7
      // 0a1: aload 4
      // 0a3: invokevirtual net/minecraft/tileentity/TileEntityPiston.mja ()Lvt2;
      // 0a6: astore 8
      // 0a8: aload 0
      // 0a9: aload 6
      // 0ab: invokevirtual e0x.v00 ()D
      // 0ae: aload 8
      // 0b0: invokevirtual vt2.n67 ()I
      // 0b3: i2f
      // 0b4: fload 7
      // 0b6: fmul
      // 0b7: f2d
      // 0b8: dsub
      // 0b9: putfield myw.d80 D
      // 0bc: aload 0
      // 0bd: aload 6
      // 0bf: invokevirtual e0x._y3 ()D
      // 0c2: aload 8
      // 0c4: invokevirtual vt2.g5t ()I
      // 0c7: i2f
      // 0c8: fload 7
      // 0ca: fmul
      // 0cb: f2d
      // 0cc: dsub
      // 0cd: putfield myw.tcq D
      // 0d0: aload 0
      // 0d1: aload 6
      // 0d3: invokevirtual e0x.z69 ()D
      // 0d6: aload 8
      // 0d8: invokevirtual vt2.ozy ()I
      // 0db: i2f
      // 0dc: fload 7
      // 0de: fmul
      // 0df: f2d
      // 0e0: dsub
      // 0e1: putfield myw.iac D
      // 0e4: aload 0
      // 0e5: aload 6
      // 0e7: invokevirtual e0x.ohw ()D
      // 0ea: aload 8
      // 0ec: invokevirtual vt2.n67 ()I
      // 0ef: i2f
      // 0f0: fload 7
      // 0f2: fmul
      // 0f3: f2d
      // 0f4: dsub
      // 0f5: putfield myw.smy D
      // 0f8: aload 0
      // 0f9: aload 6
      // 0fb: invokevirtual e0x.vn4 ()D
      // 0fe: aload 8
      // 100: invokevirtual vt2.g5t ()I
      // 103: i2f
      // 104: fload 7
      // 106: fmul
      // 107: f2d
      // 108: dsub
      // 109: putfield myw.lpg D
      // 10c: aload 0
      // 10d: aload 6
      // 10f: invokevirtual e0x.ttv ()D
      // 112: aload 8
      // 114: invokevirtual vt2.ozy ()I
      // 117: i2f
      // 118: fload 7
      // 11a: fmul
      // 11b: f2d
      // 11c: dsub
      // 11d: putfield myw.nlu D
      // 120: return
   }

   public nh4 kfw(t9d param1, mew param2, zfz param3, float param4, vt2 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 6
      // 005: aload 3
      // 006: invokeinterface zfz.r_y ()Le0x; 1
      // 00b: iload 6
      // 00d: ifeq 028
      // 010: aload 0
      // 011: if_acmpeq 134
      // 014: goto 01b
      // 017: invokestatic myw.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 3
      // 01c: invokeinterface zfz.r_y ()Le0x; 1
      // 021: goto 028
      // 024: invokestatic myw.a (Loov;)Loov;
      // 027: athrow
      // 028: iload 6
      // 02a: ifeq 04a
      // 02d: invokevirtual e0x.p1r ()Lp3y;
      // 030: getstatic p3y.cei Lp3y;
      // 033: if_acmpeq 134
      // 036: goto 03d
      // 039: invokestatic myw.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 3
      // 03e: invokeinterface zfz.r_y ()Le0x; 1
      // 043: goto 04a
      // 046: invokestatic myw.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 1
      // 04b: aload 2
      // 04c: aload 3
      // 04d: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 050: astore 7
      // 052: aload 7
      // 054: iload 6
      // 056: ifeq 06b
      // 059: ifnonnull 069
      // 05c: goto 063
      // 05f: invokestatic myw.a (Loov;)Loov;
      // 062: athrow
      // 063: aconst_null
      // 064: areturn
      // 065: invokestatic myw.a (Loov;)Loov;
      // 068: athrow
      // 069: aload 7
      // 06b: getfield nh4.rlc D
      // 06e: dstore 8
      // 070: aload 7
      // 072: getfield nh4.bx_ D
      // 075: dstore 10
      // 077: aload 7
      // 079: getfield nh4.t8n D
      // 07c: dstore 12
      // 07e: aload 7
      // 080: getfield nh4.t_2 D
      // 083: dstore 14
      // 085: aload 7
      // 087: getfield nh4.i2c D
      // 08a: dstore 16
      // 08c: aload 7
      // 08e: getfield nh4.oqj D
      // 091: dstore 18
      // 093: iload 6
      // 095: ifeq 0b6
      // 098: aload 5
      // 09a: invokevirtual vt2.n67 ()I
      // 09d: ifge 0bb
      // 0a0: goto 0a7
      // 0a3: invokestatic myw.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: dload 8
      // 0a9: aload 5
      // 0ab: invokevirtual vt2.n67 ()I
      // 0ae: i2f
      // 0af: fload 4
      // 0b1: fmul
      // 0b2: f2d
      // 0b3: dsub
      // 0b4: dstore 8
      // 0b6: iload 6
      // 0b8: ifne 0ca
      // 0bb: dload 14
      // 0bd: aload 5
      // 0bf: invokevirtual vt2.n67 ()I
      // 0c2: i2f
      // 0c3: fload 4
      // 0c5: fmul
      // 0c6: f2d
      // 0c7: dsub
      // 0c8: dstore 14
      // 0ca: aload 5
      // 0cc: invokevirtual vt2.g5t ()I
      // 0cf: ifge 0e6
      // 0d2: dload 10
      // 0d4: aload 5
      // 0d6: invokevirtual vt2.g5t ()I
      // 0d9: i2f
      // 0da: fload 4
      // 0dc: fmul
      // 0dd: f2d
      // 0de: dsub
      // 0df: dstore 10
      // 0e1: iload 6
      // 0e3: ifne 0f5
      // 0e6: dload 16
      // 0e8: aload 5
      // 0ea: invokevirtual vt2.g5t ()I
      // 0ed: i2f
      // 0ee: fload 4
      // 0f0: fmul
      // 0f1: f2d
      // 0f2: dsub
      // 0f3: dstore 16
      // 0f5: aload 5
      // 0f7: invokevirtual vt2.ozy ()I
      // 0fa: ifge 111
      // 0fd: dload 12
      // 0ff: aload 5
      // 101: invokevirtual vt2.ozy ()I
      // 104: i2f
      // 105: fload 4
      // 107: fmul
      // 108: f2d
      // 109: dsub
      // 10a: dstore 12
      // 10c: iload 6
      // 10e: ifne 120
      // 111: dload 18
      // 113: aload 5
      // 115: invokevirtual vt2.ozy ()I
      // 118: i2f
      // 119: fload 4
      // 11b: fmul
      // 11c: f2d
      // 11d: dsub
      // 11e: dstore 18
      // 120: new nh4
      // 123: dup
      // 124: dload 8
      // 126: dload 10
      // 128: dload 12
      // 12a: dload 14
      // 12c: dload 16
      // 12e: dload 18
      // 130: invokespecial nh4.<init> (DDDDDD)V
      // 133: areturn
      // 134: aconst_null
      // 135: areturn
   }

   private TileEntityPiston m_u(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getTileEntity (Lmew;)Lpyk; 2
      // 0b: astore 4
      // 0d: aload 4
      // 0f: iload 3
      // 10: ifne 29
      // 13: instanceof net/minecraft/tileentity/TileEntityPiston
      // 16: ifeq 2f
      // 19: goto 20
      // 1c: invokestatic myw.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 4
      // 22: goto 29
      // 25: invokestatic myw.a (Loov;)Loov;
      // 28: athrow
      // 29: checkcast net/minecraft/tileentity/TileEntityPiston
      // 2c: goto 30
      // 2f: aconst_null
      // 30: areturn
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return null;
   }

   @Override
   public zfz kig(int var1) {
      zfz var10000;
      zb_ var10001;
      try {
         var10000 = this.l4i().zvi(lw_, u4_.r8f(var1));
         var10001 = _yy;
         if ((var1 & 8) > 0) {
            return var10000.zvi(_yy, u4_$vxa.voo);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return var10000.zvi(var10001, u4_$vxa.ek6);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = t9d.b();
      int var3 = 0;
      int var10000 = var3 | ((vt2)var1.dil(lw_)).c3s();
      if (var2 != 0) {
         var3 = var10000;
         if (var1.dil(_yy) == u4_$vxa.voo) {
            var3 |= 8;
         }

         var10000 = var3;
      }

      return var10000;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{lw_, _yy});
   }

   private static oov a(oov var0) {
      return var0;
   }
}
