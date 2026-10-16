import com.google.common.base.Predicate;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntitySkull;

public class pld extends rw8 {
   public static final qx_ skr;
   public static final h76 _7c;
   private static final Predicate p9h;
   private r72 qkv;
   private r72 im2;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public pld() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(skr, vt2.z9q).zvi(_7c, false));
      this.xl4(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 87318974182512L;
      return orr.zgh(b<"c">(17425, 5675363793696227095L ^ var1));
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
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: getstatic pld$2.qty [I
      // 07: aload 1
      // 08: aload 2
      // 09: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0e: getstatic pld.skr Lqx_;
      // 11: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 16: checkcast vt2
      // 19: invokevirtual vt2.ordinal ()I
      // 1c: iaload
      // 1d: tableswitch 35 1 5 35 66 97 128 159
      // 40: aload 0
      // 41: ldc 0.25
      // 43: nop
      // 44: fconst_0
      // 45: ldc 0.25
      // 47: nop
      // 48: ldc 0.75
      // 4a: nop
      // 4b: ldc 0.5
      // 4d: nop
      // 4e: ldc 0.75
      // 50: nop
      // 51: invokevirtual pld.xl4 (FFFFFF)V
      // 54: iload 3
      // 55: ifne d7
      // 58: goto 5f
      // 5b: invokestatic pld.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: ldc 0.25
      // 62: nop
      // 63: ldc 0.25
      // 65: nop
      // 66: ldc 0.5
      // 68: nop
      // 69: ldc 0.75
      // 6b: nop
      // 6c: ldc 0.75
      // 6e: nop
      // 6f: fconst_1
      // 70: invokevirtual pld.xl4 (FFFFFF)V
      // 73: iload 3
      // 74: ifne d7
      // 77: goto 7e
      // 7a: invokestatic pld.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: ldc 0.25
      // 81: nop
      // 82: ldc 0.25
      // 84: nop
      // 85: fconst_0
      // 86: ldc 0.75
      // 88: nop
      // 89: ldc 0.75
      // 8b: nop
      // 8c: ldc 0.5
      // 8e: nop
      // 8f: invokevirtual pld.xl4 (FFFFFF)V
      // 92: iload 3
      // 93: ifne d7
      // 96: goto 9d
      // 99: invokestatic pld.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 0
      // 9e: ldc 0.5
      // a0: nop
      // a1: ldc 0.25
      // a3: nop
      // a4: ldc 0.25
      // a6: nop
      // a7: fconst_1
      // a8: ldc 0.75
      // aa: nop
      // ab: ldc 0.75
      // ad: nop
      // ae: invokevirtual pld.xl4 (FFFFFF)V
      // b1: iload 3
      // b2: ifne d7
      // b5: goto bc
      // b8: invokestatic pld.a (Loov;)Loov;
      // bb: athrow
      // bc: aload 0
      // bd: fconst_0
      // be: ldc 0.25
      // c0: nop
      // c1: ldc 0.25
      // c3: nop
      // c4: ldc 0.5
      // c6: nop
      // c7: ldc 0.75
      // c9: nop
      // ca: ldc 0.75
      // cc: nop
      // cd: invokevirtual pld.xl4 (FFFFFF)V
      // d0: goto d7
      // d3: invokestatic pld.a (Loov;)Loov;
      // d6: athrow
      // d7: return
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      this.c7i(var1, var2);
      return super.m__(var1, var2, var3);
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      return this.l4i().zvi(skr, var8.u0f()).zvi(_7c, false);
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntitySkull();
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.r9n;
   }

   @Override
   public int qu2(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 09: astore 4
      // 0b: aload 4
      // 0d: instanceof net/minecraft/tileentity/TileEntitySkull
      // 10: iload 3
      // 11: ifne 2d
      // 14: ifeq 30
      // 17: goto 1e
      // 1a: invokestatic pld.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 4
      // 20: checkcast net/minecraft/tileentity/TileEntitySkull
      // 23: invokevirtual net/minecraft/tileentity/TileEntitySkull.o4i ()I
      // 26: goto 2d
      // 29: invokestatic pld.a (Loov;)Loov;
      // 2c: athrow
      // 2d: goto 36
      // 30: aload 0
      // 31: aload 1
      // 32: aload 2
      // 33: invokespecial rw8.qu2 (Lt9d;Lmew;)I
      // 36: ireturn
   }

   @Override
   public void ix7(OpaquePredicate var1, mew var2, zfz var3, float var4, int var5) {
   }

   @Override
   public void f51(OpaquePredicate var1, mew var2, zfz var3, ha9 var4) {
      int var5 = OpaquePredicate.b();

      label20: {
         try {
            if (var5 == 0 || !var4.lls.g40) {
               break label20;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var3 = var3.zvi(_7c, true);
         var1.vct(var2, var3, 4);
      }

      super.f51(var1, var2, var3, var4);
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pld.b J
      // 03: ldc2_w 23083135772536
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 6
      // 0e: aload 1
      // 0f: getfield OpaquePredicate.v0f Z
      // 12: iload 6
      // 14: ifeq 37
      // 17: ifne e1
      // 1a: goto 21
      // 1d: invokestatic pld.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: getstatic pld._7c Lh76;
      // 25: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2a: checkcast java/lang/Boolean
      // 2d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 30: goto 37
      // 33: invokestatic pld.a (Loov;)Loov;
      // 36: athrow
      // 37: ifne da
      // 3a: aload 1
      // 3b: aload 2
      // 3c: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 3f: astore 7
      // 41: aload 7
      // 43: iload 6
      // 45: ifeq 5e
      // 48: instanceof net/minecraft/tileentity/TileEntitySkull
      // 4b: ifeq da
      // 4e: goto 55
      // 51: invokestatic pld.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 7
      // 57: goto 5e
      // 5a: invokestatic pld.a (Loov;)Loov;
      // 5d: athrow
      // 5e: checkcast net/minecraft/tileentity/TileEntitySkull
      // 61: astore 8
      // 63: new erg
      // 66: dup
      // 67: getstatic xbr.r9n Lu7m;
      // 6a: bipush 1
      // 6b: aload 0
      // 6c: aload 1
      // 6d: aload 2
      // 6e: invokevirtual pld.qu2 (Lt9d;Lmew;)I
      // 71: invokespecial erg.<init> (Lu7m;II)V
      // 74: astore 9
      // 76: aload 8
      // 78: iload 6
      // 7a: ifeq 94
      // 7d: invokevirtual net/minecraft/tileentity/TileEntitySkull.o4i ()I
      // 80: bipush 3
      // 81: if_icmpne d3
      // 84: goto 8b
      // 87: invokestatic pld.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 8
      // 8d: goto 94
      // 90: invokestatic pld.a (Loov;)Loov;
      // 93: athrow
      // 94: invokevirtual net/minecraft/tileentity/TileEntitySkull.j34 ()Lcom/mojang/authlib/GameProfile;
      // 97: ifnull d3
      // 9a: aload 9
      // 9c: new bdo
      // 9f: dup
      // a0: invokespecial bdo.<init> ()V
      // a3: invokevirtual erg.b67 (Lbdo;)V
      // a6: new bdo
      // a9: dup
      // aa: invokespecial bdo.<init> ()V
      // ad: astore 10
      // af: aload 10
      // b1: aload 8
      // b3: invokevirtual net/minecraft/tileentity/TileEntitySkull.j34 ()Lcom/mojang/authlib/GameProfile;
      // b6: invokestatic j44.f9e (Lbdo;Lcom/mojang/authlib/GameProfile;)Lbdo;
      // b9: pop
      // ba: aload 9
      // bc: invokevirtual erg.zso ()Lbdo;
      // bf: sipush 16895
      // c2: ldc2_w 6112669187460688374
      // c5: lload 4
      // c7: lxor
      // c8: invokedynamic c (IJ)Ljava/lang/String; bsm=pld.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: nop
      // ce: aload 10
      // d0: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // d3: aload 1
      // d4: aload 2
      // d5: aload 9
      // d7: invokestatic pld.ymu (Lt9d;Lmew;Lerg;)V
      // da: aload 0
      // db: aload 1
      // dc: aload 2
      // dd: aload 3
      // de: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // e1: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.r9n;
   }

   public boolean hin(OpaquePredicate param1, mew param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: invokevirtual erg.j6_ ()I
      // 09: bipush 1
      // 0a: iload 4
      // 0c: ifne 25
      // 0f: if_icmpne 72
      // 12: goto 19
      // 15: invokestatic pld.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 2
      // 1a: invokevirtual mew.getY ()I
      // 1d: bipush 2
      // 1e: goto 25
      // 21: invokestatic pld.a (Loov;)Loov;
      // 24: athrow
      // 25: if_icmplt 72
      // 28: aload 1
      // 29: iload 4
      // 2b: ifne 4d
      // 2e: goto 35
      // 31: invokestatic pld.a (Loov;)Loov;
      // 34: athrow
      // 35: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 38: getstatic v66.na2 Lv66;
      // 3b: if_acmpeq 72
      // 3e: goto 45
      // 41: invokestatic pld.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 1
      // 46: goto 4d
      // 49: invokestatic pld.a (Loov;)Loov;
      // 4c: athrow
      // 4d: getfield OpaquePredicate.v0f Z
      // 50: ifne 72
      // 53: aload 0
      // 54: invokevirtual pld.fzo ()Lr72;
      // 57: aload 1
      // 58: aload 2
      // 59: invokevirtual r72.clx (Lt9d;Lmew;)Lr72$kqk;
      // 5c: ifnull 6e
      // 5f: goto 66
      // 62: invokestatic pld.a (Loov;)Loov;
      // 65: athrow
      // 66: bipush 1
      // 67: goto 73
      // 6a: invokestatic pld.a (Loov;)Loov;
      // 6d: athrow
      // 6e: bipush 0
      // 6f: goto 73
      // 72: bipush 0
      // 73: ireturn
   }

   public void i4n(OpaquePredicate param1, mew param2, TileEntitySkull param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 3
      // 006: invokevirtual net/minecraft/tileentity/TileEntitySkull.o4i ()I
      // 009: bipush 1
      // 00a: iload 4
      // 00c: ifne 025
      // 00f: if_icmpne 280
      // 012: goto 019
      // 015: invokestatic pld.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 2
      // 01a: invokevirtual mew.getY ()I
      // 01d: bipush 2
      // 01e: goto 025
      // 021: invokestatic pld.a (Loov;)Loov;
      // 024: athrow
      // 025: if_icmplt 280
      // 028: aload 1
      // 029: iload 4
      // 02b: ifne 04d
      // 02e: goto 035
      // 031: invokestatic pld.a (Loov;)Loov;
      // 034: athrow
      // 035: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 038: getstatic v66.na2 Lv66;
      // 03b: if_acmpeq 280
      // 03e: goto 045
      // 041: invokestatic pld.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 1
      // 046: goto 04d
      // 049: invokestatic pld.a (Loov;)Loov;
      // 04c: athrow
      // 04d: getfield OpaquePredicate.v0f Z
      // 050: ifne 280
      // 053: aload 0
      // 054: invokevirtual pld.yfb ()Lr72;
      // 057: astore 5
      // 059: aload 5
      // 05b: aload 1
      // 05c: aload 2
      // 05d: invokevirtual r72.clx (Lt9d;Lmew;)Lr72$kqk;
      // 060: astore 6
      // 062: aload 6
      // 064: ifnull 280
      // 067: bipush 0
      // 068: istore 7
      // 06a: iload 7
      // 06c: bipush 3
      // 06d: if_icmpge 0ab
      // 070: aload 6
      // 072: iload 7
      // 074: bipush 0
      // 075: bipush 0
      // 076: invokevirtual r72$kqk.pfb (III)Ld2q;
      // 079: astore 8
      // 07b: aload 1
      // 07c: aload 8
      // 07e: invokevirtual d2q.i4m ()Lmew;
      // 081: aload 8
      // 083: invokevirtual d2q.uc6 ()Lzfz;
      // 086: getstatic pld._7c Lh76;
      // 089: bipush 1
      // 08a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 08d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 092: bipush 2
      // 093: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 096: pop
      // 097: iinc 7 1
      // 09a: iload 4
      // 09c: ifne 0ae
      // 09f: iload 4
      // 0a1: ifeq 06a
      // 0a4: goto 0ab
      // 0a7: invokestatic pld.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: bipush 0
      // 0ac: istore 7
      // 0ae: iload 7
      // 0b0: aload 5
      // 0b2: invokevirtual r72.k3i ()I
      // 0b5: if_icmpge 0fe
      // 0b8: bipush 0
      // 0b9: istore 8
      // 0bb: iload 8
      // 0bd: aload 5
      // 0bf: invokevirtual r72.sy_ ()I
      // 0c2: if_icmpge 0f6
      // 0c5: aload 6
      // 0c7: iload 7
      // 0c9: iload 8
      // 0cb: bipush 0
      // 0cc: invokevirtual r72$kqk.pfb (III)Ld2q;
      // 0cf: astore 9
      // 0d1: aload 1
      // 0d2: aload 9
      // 0d4: invokevirtual d2q.i4m ()Lmew;
      // 0d7: getstatic ox_.ibw Le0x;
      // 0da: invokevirtual e0x.l4i ()Lzfz;
      // 0dd: bipush 2
      // 0de: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0e1: pop
      // 0e2: iinc 8 1
      // 0e5: iload 4
      // 0e7: ifne 0f9
      // 0ea: iload 4
      // 0ec: ifeq 0bb
      // 0ef: goto 0f6
      // 0f2: invokestatic pld.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: iinc 7 1
      // 0f9: iload 4
      // 0fb: ifeq 0ae
      // 0fe: aload 6
      // 100: bipush 1
      // 101: bipush 0
      // 102: bipush 0
      // 103: invokevirtual r72$kqk.pfb (III)Ld2q;
      // 106: invokevirtual d2q.i4m ()Lmew;
      // 109: astore 7
      // 10b: new ju8
      // 10e: dup
      // 10f: aload 1
      // 110: invokespecial ju8.<init> (Lt9d;)V
      // 113: astore 8
      // 115: aload 6
      // 117: bipush 1
      // 118: bipush 2
      // 119: bipush 0
      // 11a: invokevirtual r72$kqk.pfb (III)Ld2q;
      // 11d: invokevirtual d2q.i4m ()Lmew;
      // 120: astore 9
      // 122: aload 8
      // 124: aload 9
      // 126: invokevirtual mew.getX ()I
      // 129: i2d
      // 12a: ldc2_w 0.5
      // 12d: dadd
      // 12e: aload 9
      // 130: invokevirtual mew.getY ()I
      // 133: i2d
      // 134: ldc2_w 0.55
      // 137: dadd
      // 138: aload 9
      // 13a: invokevirtual mew.getZ ()I
      // 13d: i2d
      // 13e: ldc2_w 0.5
      // 141: dadd
      // 142: aload 6
      // 144: invokevirtual r72$kqk.r97 ()Lvt2;
      // 147: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 14a: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 14d: if_acmpne 158
      // 150: fconst_0
      // 151: goto 15b
      // 154: invokestatic pld.a (Loov;)Loov;
      // 157: athrow
      // 158: ldc 90.0
      // 15a: nop
      // 15b: fconst_0
      // 15c: invokevirtual ju8.x24 (DDDFF)V
      // 15f: aload 8
      // 161: aload 6
      // 163: invokevirtual r72$kqk.r97 ()Lvt2;
      // 166: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 169: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 16c: if_acmpne 177
      // 16f: fconst_0
      // 170: goto 17a
      // 173: invokestatic pld.a (Loov;)Loov;
      // 176: athrow
      // 177: ldc 90.0
      // 179: nop
      // 17a: putfield ju8.ksw F
      // 17d: aload 8
      // 17f: invokevirtual ju8.jc1 ()V
      // 182: aload 1
      // 183: ldc ha9
      // 185: nop
      // 186: aload 8
      // 188: invokevirtual ju8.aaw ()Lnh4;
      // 18b: ldc2_w 50.0
      // 18e: ldc2_w 50.0
      // 191: ldc2_w 50.0
      // 194: invokevirtual nh4.c2h (DDD)Lnh4;
      // 197: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 19a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 19f: astore 10
      // 1a1: aload 10
      // 1a3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a8: ifeq 1d0
      // 1ab: aload 10
      // 1ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b2: checkcast ha9
      // 1b5: astore 11
      // 1b7: aload 11
      // 1b9: getstatic y8d.how Ll7l;
      // 1bc: invokevirtual ha9.aex (L_ss;)V
      // 1bf: iload 4
      // 1c1: ifne 1d7
      // 1c4: iload 4
      // 1c6: ifeq 1a1
      // 1c9: goto 1d0
      // 1cc: invokestatic pld.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 1
      // 1d1: aload 8
      // 1d3: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 1d6: pop
      // 1d7: bipush 0
      // 1d8: istore 10
      // 1da: iload 10
      // 1dc: bipush 120
      // 1de: if_icmpge 232
      // 1e1: aload 1
      // 1e2: getstatic w_0.t6l Lw_0;
      // 1e5: aload 7
      // 1e7: invokevirtual mew.getX ()I
      // 1ea: i2d
      // 1eb: aload 1
      // 1ec: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 1ef: invokevirtual java/util/Random.nextDouble ()D
      // 1f2: dadd
      // 1f3: aload 7
      // 1f5: invokevirtual mew.getY ()I
      // 1f8: bipush 2
      // 1f9: isub
      // 1fa: i2d
      // 1fb: aload 1
      // 1fc: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 1ff: invokevirtual java/util/Random.nextDouble ()D
      // 202: ldc2_w 3.9
      // 205: dmul
      // 206: dadd
      // 207: aload 7
      // 209: invokevirtual mew.getZ ()I
      // 20c: i2d
      // 20d: aload 1
      // 20e: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 211: invokevirtual java/util/Random.nextDouble ()D
      // 214: dadd
      // 215: dconst_0
      // 216: dconst_0
      // 217: dconst_0
      // 218: bipush 0
      // 219: newarray 10
      // 21b: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 21e: iinc 10 1
      // 221: iload 4
      // 223: ifne 235
      // 226: iload 4
      // 228: ifeq 1da
      // 22b: goto 232
      // 22e: invokestatic pld.a (Loov;)Loov;
      // 231: athrow
      // 232: bipush 0
      // 233: istore 10
      // 235: iload 10
      // 237: aload 5
      // 239: invokevirtual r72.k3i ()I
      // 23c: if_icmpge 280
      // 23f: bipush 0
      // 240: istore 11
      // 242: iload 11
      // 244: aload 5
      // 246: invokevirtual r72.sy_ ()I
      // 249: if_icmpge 278
      // 24c: aload 6
      // 24e: iload 10
      // 250: iload 11
      // 252: bipush 0
      // 253: invokevirtual r72$kqk.pfb (III)Ld2q;
      // 256: astore 12
      // 258: aload 1
      // 259: aload 12
      // 25b: invokevirtual d2q.i4m ()Lmew;
      // 25e: getstatic ox_.ibw Le0x;
      // 261: invokevirtual OpaquePredicate.cdo (Lmew;Le0x;)V
      // 264: iinc 11 1
      // 267: iload 4
      // 269: ifne 27b
      // 26c: iload 4
      // 26e: ifeq 242
      // 271: goto 278
      // 274: invokestatic pld.a (Loov;)Loov;
      // 277: athrow
      // 278: iinc 10 1
      // 27b: iload 4
      // 27d: ifeq 235
      // 280: return
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i().zvi(skr, vt2.jw6(var1 & 7));
         var10001 = _7c;
         int var10002 = var1 & 8;
         if (var2 != 0) {
            return var10000.zvi(_7c, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(_7c, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.c();
      var3 |= ((vt2)var1.dil(skr)).c3s();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(_7c);
         if (var2 != 0) {
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
      return new g92(this, new xny[]{skr, _7c});
   }

   public r72 fzo() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pld.b J
      // 03: ldc2_w 138790458918587
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield pld.qkv Lr72;
      // 10: iload 3
      // 11: ifeq 89
      // 14: ifnonnull 85
      // 17: goto 1e
      // 1a: invokestatic pld.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokestatic kv4._54 ()Lkv4;
      // 22: bipush 3
      // 23: anewarray 6
      // 26: dup
      // 27: bipush 0
      // 28: sipush 5256
      // 2b: ldc2_w 2720408553627983174
      // 2e: lload 1
      // 2f: lxor
      // 30: invokedynamic c (IJ)Ljava/lang/String; bsm=pld.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: aastore
      // 37: dup
      // 38: bipush 1
      // 39: sipush 12037
      // 3c: ldc2_w 9070189299595486913
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic c (IJ)Ljava/lang/String; bsm=pld.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: aastore
      // 48: dup
      // 49: bipush 2
      // 4a: sipush 18888
      // 4d: ldc2_w 6526979853415956481
      // 50: lload 1
      // 51: lxor
      // 52: invokedynamic c (IJ)Ljava/lang/String; bsm=pld.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: nop
      // 58: aastore
      // 59: invokevirtual kv4._gi ([Ljava/lang/String;)Lkv4;
      // 5c: bipush 35
      // 5e: getstatic ox_.p58 Le0x;
      // 61: invokestatic o9a.utk (Le0x;)Lo9a;
      // 64: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 67: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 6a: bipush 126
      // 6c: getstatic ox_.ibw Le0x;
      // 6f: invokestatic o9a.utk (Le0x;)Lo9a;
      // 72: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 75: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 78: invokevirtual kv4.m7f ()Lr72;
      // 7b: putfield pld.qkv Lr72;
      // 7e: goto 85
      // 81: invokestatic pld.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: getfield pld.qkv Lr72;
      // 89: areturn
   }

   public r72 yfb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pld.b J
      // 03: ldc2_w 55566668111039
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield pld.im2 Lr72;
      // 10: iload 3
      // 11: ifeq 91
      // 14: ifnonnull 8d
      // 17: goto 1e
      // 1a: invokestatic pld.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokestatic kv4._54 ()Lkv4;
      // 22: bipush 3
      // 23: anewarray 6
      // 26: dup
      // 27: bipush 0
      // 28: sipush 22073
      // 2b: ldc2_w 1506596991705040369
      // 2e: lload 1
      // 2f: lxor
      // 30: invokedynamic c (IJ)Ljava/lang/String; bsm=pld.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: aastore
      // 37: dup
      // 38: bipush 1
      // 39: sipush 31151
      // 3c: ldc2_w 4328450280066935392
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic c (IJ)Ljava/lang/String; bsm=pld.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: aastore
      // 48: dup
      // 49: bipush 2
      // 4a: sipush 314
      // 4d: ldc2_w 9069814373156950769
      // 50: lload 1
      // 51: lxor
      // 52: invokedynamic c (IJ)Ljava/lang/String; bsm=pld.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: nop
      // 58: aastore
      // 59: invokevirtual kv4._gi ([Ljava/lang/String;)Lkv4;
      // 5c: bipush 35
      // 5e: getstatic ox_.p58 Le0x;
      // 61: invokestatic o9a.utk (Le0x;)Lo9a;
      // 64: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 67: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 6a: bipush 94
      // 6c: getstatic pld.p9h Lcom/google/common/base/Predicate;
      // 6f: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 72: bipush 126
      // 74: getstatic ox_.ibw Le0x;
      // 77: invokestatic o9a.utk (Le0x;)Lo9a;
      // 7a: invokestatic d2q.k1e (Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 7d: invokevirtual kv4.l90 (CLcom/google/common/base/Predicate;)Lkv4;
      // 80: invokevirtual kv4.m7f ()Lr72;
      // 83: putfield pld.im2 Lr72;
      // 86: goto 8d
      // 89: invokestatic pld.a (Loov;)Loov;
      // 8c: athrow
      // 8d: aload 0
      // 8e: getfield pld.im2 Lr72;
      // 91: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6659645136489338925L, 2828553532261807712L, MethodHandles.lookup().lookupClass()).a(8569673451970L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 62303667470024L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "è9áÅ\u001dC^gÌuÞpY\u001eh90y®\u0017Q£8P²\u0091ÁßÕ1(Nã\u000eØjÄ\u0081¦\u009dãZÆ\u0096d\u00134+èY\u000b\u008d\u0010³\u0004¾ß /uÏ{lxÍ\u0010²O\u0087\f\u0019\u001bÙö¢ç\u0085gÇ\"\"Ã\u0010\u0011½¬ok\u0092×\u000eOàrJ$$+<\u0010\u0099æ\u001a_àø/S\u0099WÀ-;éì¥\u0010[ÜNbI¥MÒí;^%òe5] ±X\u0001, nÄ_\u0004\u008cªË\u0086M»tÖ¹~à\u0005\u008aC¥\u001dD\u0084Ö\fé\u0094\u0002\u0010õ\u001bø0\u001fÇì7ëdö×\u0088Õõ©";
      int var6 = "è9áÅ\u001dC^gÌuÞpY\u001eh90y®\u0017Q£8P²\u0091ÁßÕ1(Nã\u000eØjÄ\u0081¦\u009dãZÆ\u0096d\u00134+èY\u000b\u008d\u0010³\u0004¾ß /uÏ{lxÍ\u0010²O\u0087\f\u0019\u001bÙö¢ç\u0085gÇ\"\"Ã\u0010\u0011½¬ok\u0092×\u000eOàrJ$$+<\u0010\u0099æ\u001a_àø/S\u0099WÀ-;éì¥\u0010[ÜNbI¥MÒí;^%òe5] ±X\u0001, nÄ_\u0004\u008cªË\u0086M»tÖ¹~à\u0005\u008aC¥\u001dD\u0084Ö\fé\u0094\u0002\u0010õ\u001bø0\u001fÇì7ëdö×\u0088Õõ©"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[10];
                     skr = qx_.jap(b<"c">(24692, 2453906584717087183L ^ var9));
                     _7c = h76.d_1(b<"c">(12595, 993292049862983813L ^ var9));
                     p9h = new pld$1();
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u000fÀûå&1dòÑ'ì0\u0085ºsÏ\u0010m\u0091p\u009eWVð\u0096¢´[\u0082y\u0005\u0007\u008d";
                  var6 = "\u000fÀûå&1dòÑ'ì0\u0085ºsÏ\u0010m\u0091p\u009eWVð\u0096¢´[\u0082y\u0005\u0007\u008d".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 96;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("pld", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("pld" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
