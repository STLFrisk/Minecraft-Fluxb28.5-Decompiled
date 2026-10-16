import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityDispenser;

public class okn extends rw8 {
   public static final qx_ mfy;
   public static final h76 vka;
   public static final b_3 r4s;
   public Random ylh = new Random();

   public okn() {
      super(p3y.zs8);
      this.y8l(this._8_.c32().zvi(mfy, vt2.z9q).zvi(vka, false));
      this.i3l(uja.yj_);
   }

   @Override
   public int odp(t9d var1) {
      return 4;
   }

   @Override
   public void tfc(t9d var1, mew var2, zfz var3) {
      super.tfc(var1, var2, var3);
      this.g26(var1, var2, var3);
   }

   private void g26(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: getfield t9d.v0f Z
      // 009: ifne 18a
      // 00c: aload 3
      // 00d: getstatic okn.mfy Lqx_;
      // 010: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 015: checkcast vt2
      // 018: astore 5
      // 01a: aload 1
      // 01b: aload 2
      // 01c: invokevirtual mew.idu ()Lmew;
      // 01f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 022: invokeinterface zfz.r_y ()Le0x; 1
      // 027: invokevirtual e0x.z4c ()Z
      // 02a: istore 6
      // 02c: aload 1
      // 02d: aload 2
      // 02e: invokevirtual mew.z6x ()Lmew;
      // 031: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 034: invokeinterface zfz.r_y ()Le0x; 1
      // 039: invokevirtual e0x.z4c ()Z
      // 03c: istore 7
      // 03e: aload 5
      // 040: getstatic vt2.z9q Lvt2;
      // 043: iload 4
      // 045: ifne 085
      // 048: if_acmpne 079
      // 04b: goto 052
      // 04e: invokestatic okn.a (Loov;)Loov;
      // 051: athrow
      // 052: iload 6
      // 054: iload 4
      // 056: ifne 06c
      // 059: goto 060
      // 05c: invokestatic okn.a (Loov;)Loov;
      // 05f: athrow
      // 060: ifeq 079
      // 063: goto 06a
      // 066: invokestatic okn.a (Loov;)Loov;
      // 069: athrow
      // 06a: iload 7
      // 06c: ifne 079
      // 06f: getstatic vt2.mxp Lvt2;
      // 072: astore 5
      // 074: iload 4
      // 076: ifeq 16c
      // 079: aload 5
      // 07b: getstatic vt2.mxp Lvt2;
      // 07e: goto 085
      // 081: invokestatic okn.a (Loov;)Loov;
      // 084: athrow
      // 085: if_acmpne 0c2
      // 088: iload 7
      // 08a: iload 4
      // 08c: ifne 0d9
      // 08f: goto 096
      // 092: invokestatic okn.a (Loov;)Loov;
      // 095: athrow
      // 096: ifeq 0c2
      // 099: goto 0a0
      // 09c: invokestatic okn.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: iload 6
      // 0a2: iload 4
      // 0a4: ifne 0d9
      // 0a7: goto 0ae
      // 0aa: invokestatic okn.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: ifne 0c2
      // 0b1: goto 0b8
      // 0b4: invokestatic okn.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: getstatic vt2.z9q Lvt2;
      // 0bb: astore 5
      // 0bd: iload 4
      // 0bf: ifeq 16c
      // 0c2: aload 1
      // 0c3: aload 2
      // 0c4: invokevirtual mew.y8e ()Lmew;
      // 0c7: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0ca: invokeinterface zfz.r_y ()Le0x; 1
      // 0cf: invokevirtual e0x.z4c ()Z
      // 0d2: goto 0d9
      // 0d5: invokestatic okn.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: istore 8
      // 0db: aload 1
      // 0dc: aload 2
      // 0dd: invokevirtual mew.o_8 ()Lmew;
      // 0e0: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0e3: invokeinterface zfz.r_y ()Le0x; 1
      // 0e8: invokevirtual e0x.z4c ()Z
      // 0eb: istore 9
      // 0ed: aload 5
      // 0ef: getstatic vt2.te4 Lvt2;
      // 0f2: iload 4
      // 0f4: ifne 134
      // 0f7: if_acmpne 128
      // 0fa: goto 101
      // 0fd: invokestatic okn.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 8
      // 103: iload 4
      // 105: ifne 11b
      // 108: goto 10f
      // 10b: invokestatic okn.a (Loov;)Loov;
      // 10e: athrow
      // 10f: ifeq 128
      // 112: goto 119
      // 115: invokestatic okn.a (Loov;)Loov;
      // 118: athrow
      // 119: iload 9
      // 11b: ifne 128
      // 11e: getstatic vt2.zk4 Lvt2;
      // 121: astore 5
      // 123: iload 4
      // 125: ifeq 16c
      // 128: aload 5
      // 12a: getstatic vt2.zk4 Lvt2;
      // 12d: goto 134
      // 130: invokestatic okn.a (Loov;)Loov;
      // 133: athrow
      // 134: if_acmpne 16c
      // 137: iload 9
      // 139: iload 4
      // 13b: ifne 189
      // 13e: goto 145
      // 141: invokestatic okn.a (Loov;)Loov;
      // 144: athrow
      // 145: ifeq 16c
      // 148: goto 14f
      // 14b: invokestatic okn.a (Loov;)Loov;
      // 14e: athrow
      // 14f: iload 8
      // 151: iload 4
      // 153: ifne 189
      // 156: goto 15d
      // 159: invokestatic okn.a (Loov;)Loov;
      // 15c: athrow
      // 15d: ifne 16c
      // 160: goto 167
      // 163: invokestatic okn.a (Loov;)Loov;
      // 166: athrow
      // 167: getstatic vt2.te4 Lvt2;
      // 16a: astore 5
      // 16c: aload 1
      // 16d: aload 2
      // 16e: aload 3
      // 16f: getstatic okn.mfy Lqx_;
      // 172: aload 5
      // 174: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 179: getstatic okn.vka Lh76;
      // 17c: bipush 0
      // 17d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 180: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 185: bipush 2
      // 186: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 189: pop
      // 18a: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 1
      // 06: iload 9
      // 08: ifeq 1f
      // 0b: getfield t9d.v0f Z
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic okn.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic okn.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntityDispenser
      // 2a: iload 9
      // 2c: ifeq 82
      // 2f: ifeq 81
      // 32: goto 39
      // 35: invokestatic okn.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: iload 9
      // 3d: ifeq 7b
      // 40: goto 47
      // 43: invokestatic okn.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 10
      // 49: checkcast net/minecraft/tileentity/TileEntityDispenser
      // 4c: invokevirtual ha9.a_o (Lrsi;)V
      // 4f: aload 10
      // 51: instanceof net/minecraft/tileentity/TileEntityDropper
      // 54: ifeq 72
      // 57: goto 5e
      // 5a: invokestatic okn.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 4
      // 60: getstatic l9p.gi3 L_ss;
      // 63: invokevirtual ha9.aex (L_ss;)V
      // 66: iload 9
      // 68: ifne 81
      // 6b: goto 72
      // 6e: invokestatic okn.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 4
      // 74: goto 7b
      // 77: invokestatic okn.a (Loov;)Loov;
      // 7a: athrow
      // 7b: getstatic l9p.y35 L_ss;
      // 7e: invokevirtual ha9.aex (L_ss;)V
      // 81: bipush 1
      // 82: ireturn
   }

   public void p87(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new dul
      // 03: dup
      // 04: aload 1
      // 05: aload 2
      // 06: invokespecial dul.<init> (Lt9d;Lmew;)V
      // 09: astore 4
      // 0b: invokestatic t9d.c ()I
      // 0e: aload 4
      // 10: invokevirtual dul.ztz ()Lpyk;
      // 13: checkcast net/minecraft/tileentity/TileEntityDispenser
      // 16: astore 5
      // 18: istore 3
      // 19: aload 5
      // 1b: iload 3
      // 1c: ifne 2b
      // 1f: ifnull a5
      // 22: goto 29
      // 25: invokestatic okn.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 5
      // 2b: invokevirtual net/minecraft/tileentity/TileEntityDispenser._ob ()I
      // 2e: istore 6
      // 30: iload 3
      // 31: ifne 50
      // 34: iload 6
      // 36: ifge 54
      // 39: goto 40
      // 3c: invokestatic okn.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 1
      // 41: sipush 1001
      // 44: aload 2
      // 45: bipush 0
      // 46: invokevirtual t9d.qca (ILmew;I)V
      // 49: goto 50
      // 4c: invokestatic okn.a (Loov;)Loov;
      // 4f: athrow
      // 50: iload 3
      // 51: ifeq a5
      // 54: aload 5
      // 56: iload 6
      // 58: invokevirtual net/minecraft/tileentity/TileEntityDispenser.ibn (I)Lerg;
      // 5b: astore 7
      // 5d: aload 0
      // 5e: aload 7
      // 60: invokevirtual okn.a6_ (Lerg;)Lm1p;
      // 63: astore 8
      // 65: aload 8
      // 67: iload 3
      // 68: ifne 81
      // 6b: getstatic m1p.gpg Lm1p;
      // 6e: if_acmpeq a5
      // 71: goto 78
      // 74: invokestatic okn.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 8
      // 7a: goto 81
      // 7d: invokestatic okn.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 4
      // 83: aload 7
      // 85: invokeinterface m1p.r0k (Lsdf;Lerg;)Lerg; 3
      // 8a: astore 9
      // 8c: aload 5
      // 8e: iload 6
      // 90: aload 9
      // 92: getfield erg.qd2 I
      // 95: ifgt a0
      // 98: aconst_null
      // 99: goto a2
      // 9c: invokestatic okn.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 9
      // a2: invokevirtual net/minecraft/tileentity/TileEntityDispenser.cxl (ILerg;)V
      // a5: return
   }

   public m1p a6_(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: getstatic okn.r4s Lb_3;
      // 07: aload 1
      // 08: iload 2
      // 09: ifeq 1f
      // 0c: ifnonnull 1e
      // 0f: goto 16
      // 12: invokestatic okn.a (Loov;)Loov;
      // 15: athrow
      // 16: aconst_null
      // 17: goto 22
      // 1a: invokestatic okn.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual erg.gn1 ()Lu7m;
      // 22: invokevirtual b_3._gz (Ljava/lang/Object;)Ljava/lang/Object;
      // 25: checkcast m1p
      // 28: areturn
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
      // 06: aload 2
      // 07: invokevirtual t9d.gxo (Lmew;)Z
      // 0a: iload 5
      // 0c: ifeq 38
      // 0f: ifne 37
      // 12: goto 19
      // 15: invokestatic okn.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokevirtual mew.nuv ()Lmew;
      // 1e: invokevirtual t9d.gxo (Lmew;)Z
      // 21: iload 5
      // 23: ifeq 38
      // 26: goto 2d
      // 29: invokestatic okn.a (Loov;)Loov;
      // 2c: athrow
      // 2d: ifeq 3b
      // 30: goto 37
      // 33: invokestatic okn.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: istore 6
      // 3e: aload 3
      // 3f: getstatic okn.vka Lh76;
      // 42: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 47: checkcast java/lang/Boolean
      // 4a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4d: istore 7
      // 4f: iload 6
      // 51: iload 5
      // 53: ifeq ac
      // 56: ifeq a3
      // 59: goto 60
      // 5c: invokestatic okn.a (Loov;)Loov;
      // 5f: athrow
      // 60: iload 7
      // 62: iload 5
      // 64: ifeq ac
      // 67: goto 6e
      // 6a: invokestatic okn.a (Loov;)Loov;
      // 6d: athrow
      // 6e: ifne a3
      // 71: goto 78
      // 74: invokestatic okn.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 1
      // 79: aload 2
      // 7a: aload 0
      // 7b: aload 0
      // 7c: aload 1
      // 7d: invokevirtual okn.odp (Lt9d;)I
      // 80: invokevirtual t9d.cjk (Lmew;Le0x;I)V
      // 83: aload 1
      // 84: aload 2
      // 85: aload 3
      // 86: getstatic okn.vka Lh76;
      // 89: bipush 1
      // 8a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 8d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 92: bipush 4
      // 93: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 96: pop
      // 97: iload 5
      // 99: ifne e7
      // 9c: goto a3
      // 9f: invokestatic okn.a (Loov;)Loov;
      // a2: athrow
      // a3: iload 6
      // a5: goto ac
      // a8: invokestatic okn.a (Loov;)Loov;
      // ab: athrow
      // ac: iload 5
      // ae: ifeq bd
      // b1: ifne e7
      // b4: goto bb
      // b7: invokestatic okn.a (Loov;)Loov;
      // ba: athrow
      // bb: iload 7
      // bd: iload 5
      // bf: ifeq e6
      // c2: ifeq e7
      // c5: goto cc
      // c8: invokestatic okn.a (Loov;)Loov;
      // cb: athrow
      // cc: aload 1
      // cd: aload 2
      // ce: aload 3
      // cf: getstatic okn.vka Lh76;
      // d2: bipush 0
      // d3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // d6: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // db: bipush 4
      // dc: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // df: goto e6
      // e2: invokestatic okn.a (Loov;)Loov;
      // e5: athrow
      // e6: pop
      // e7: return
   }

   @Override
   public void zvy(t9d var1, mew var2, zfz var3, Random var4) {
      try {
         if (!var1.v0f) {
            this.p87(var1, var2);
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityDispenser();
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      return this.l4i().zvi(mfy, aog.wf_(var1, var2, var8)).zvi(vka, false);
   }

   @Override
   public void qh0(t9d param1, mew param2, zfz param3, g_3 param4, erg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: aload 1
      // 06: aload 2
      // 07: iload 6
      // 09: ifne 39
      // 0c: aload 3
      // 0d: getstatic okn.mfy Lqx_;
      // 10: aload 1
      // 11: aload 2
      // 12: aload 4
      // 14: invokestatic aog.wf_ (Lt9d;Lmew;Lg_3;)Lvt2;
      // 17: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1c: bipush 2
      // 1d: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 20: pop
      // 21: aload 5
      // 23: invokevirtual erg.x4w ()Z
      // 26: ifeq 66
      // 29: goto 30
      // 2c: invokestatic okn.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: aload 2
      // 32: goto 39
      // 35: invokestatic okn.a (Loov;)Loov;
      // 38: athrow
      // 39: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 3c: astore 7
      // 3e: aload 7
      // 40: iload 6
      // 42: ifne 5b
      // 45: instanceof net/minecraft/tileentity/TileEntityDispenser
      // 48: ifeq 66
      // 4b: goto 52
      // 4e: invokestatic okn.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 7
      // 54: goto 5b
      // 57: invokestatic okn.a (Loov;)Loov;
      // 5a: athrow
      // 5b: checkcast net/minecraft/tileentity/TileEntityDispenser
      // 5e: aload 5
      // 60: invokevirtual erg.zow ()Ljava/lang/String;
      // 63: invokevirtual net/minecraft/tileentity/TileEntityDispenser.rww (Ljava/lang/String;)V
      // 66: return
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
      // 0c: iload 4
      // 0e: ifeq 3e
      // 11: aload 5
      // 13: instanceof net/minecraft/tileentity/TileEntityDispenser
      // 16: ifeq 37
      // 19: goto 20
      // 1c: invokestatic okn.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: aload 5
      // 24: checkcast net/minecraft/tileentity/TileEntityDispenser
      // 27: invokestatic py1.hkj (Lt9d;Lmew;Lrsi;)V
      // 2a: aload 1
      // 2b: aload 2
      // 2c: aload 0
      // 2d: invokevirtual t9d.lw8 (Lmew;Le0x;)V
      // 30: goto 37
      // 33: invokestatic okn.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: aload 2
      // 3a: aload 3
      // 3b: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // 3e: return
   }

   public static tym lx6(sdf var0) {
      vt2 var1 = dwc(var0.lcq());
      double var2 = var0.tai() + 0.7 * (double)var1.n67();
      double var4 = var0.q_1() + 0.7 * (double)var1.g5t();
      double var6 = var0.wgy() + 0.7 * (double)var1.ozy();
      return new gg1(var2, var4, var6);
   }

   public static vt2 dwc(int var0) {
      return vt2.jw6(var0 & 7);
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(t9d var1, mew var2) {
      return _jc.nuj(var1.getTileEntity(var2));
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public zfz v1x(zfz var1) {
      return this.l4i().zvi(mfy, vt2.mxp);
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i().zvi(mfy, dwc(var1));
         var10001 = vka;
         int var10002 = var1 & 8;
         if (var2 == 0) {
            return var10000.zvi(vka, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(vka, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = t9d.b();
      var3 |= ((vt2)var1.dil(mfy)).c3s();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(vka);
         if (var2 == 0) {
            return var6;
         }

         if (var6 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 8;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{mfy, vka});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5016751614924045736L, 177947478859840202L, MethodHandles.lookup().lookupClass()).a(202318671885171L);
      // $VF: monitorexit
      long var10 = var10000 ^ 36662697465999L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "\u0015æh7\u0018k\u008bCq\u0007±NAì\rª\bÂ<*qÎ3÷M";
      int var7 = "\u0015æh7\u0018k\u008bCq\u0007±NAì\rª\bÂ<*qÎ3÷M".length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            mfy = qx_.jap(var8[1]);
            vka = h76.d_1(var8[0]);
            r4s = new b_3(new kea());
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
