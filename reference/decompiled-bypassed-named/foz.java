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

public abstract class foz extends e0x {
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public foz(p3y var1) {
      this(var1, var1.up9());
   }

   public foz(p3y var1, _mi var2) {
      super(var1, var2);
      this.i3l(uja.yj_);
      this._p_(true);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.zos(var1.getBlockState(var2));
   }

   public void zos(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual foz.eqv (Lzfz;)I
      // 09: iload 2
      // 0a: ifne 18
      // 0d: ifle 1b
      // 10: goto 17
      // 13: invokestatic foz.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1c
      // 1b: bipush 0
      // 1c: istore 3
      // 1d: ldc 0.0625
      // 1f: nop
      // 20: fstore 4
      // 22: iload 2
      // 23: ifne 4c
      // 26: iload 3
      // 27: ifeq 50
      // 2a: goto 31
      // 2d: invokestatic foz.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: ldc 0.0625
      // 34: nop
      // 35: fconst_0
      // 36: ldc 0.0625
      // 38: nop
      // 39: ldc 0.9375
      // 3b: nop
      // 3c: ldc 0.03125
      // 3e: nop
      // 3f: ldc 0.9375
      // 41: nop
      // 42: invokevirtual foz.xl4 (FFFFFF)V
      // 45: goto 4c
      // 48: invokestatic foz.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 2
      // 4d: ifeq 6b
      // 50: aload 0
      // 51: ldc 0.0625
      // 53: nop
      // 54: fconst_0
      // 55: ldc 0.0625
      // 57: nop
      // 58: ldc 0.9375
      // 5a: nop
      // 5b: ldc 0.0625
      // 5d: nop
      // 5e: ldc 0.9375
      // 60: nop
      // 61: invokevirtual foz.xl4 (FFFFFF)V
      // 64: goto 6b
      // 67: invokestatic foz.a (Loov;)Loov;
      // 6a: athrow
      // 6b: return
   }

   @Override
   public int odp(OpaquePredicate var1) {
      return 20;
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
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
   public boolean iwf(m5n var1, mew var2) {
      return true;
   }

   @Override
   public boolean jdk() {
      return true;
   }

   @Override
   public boolean ctq(OpaquePredicate var1, mew var2) {
      return this.rti(var1, var2.eve());
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual mew.eve ()Lmew;
      // 0b: invokespecial foz.rti (Lt9d;Lmew;)Z
      // 0e: iload 5
      // 10: ifeq 31
      // 13: ifne 32
      // 16: goto 1d
      // 19: invokestatic foz.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 1
      // 1f: aload 2
      // 20: aload 3
      // 21: bipush 0
      // 22: invokevirtual foz.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 25: aload 1
      // 26: aload 2
      // 27: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 2a: goto 31
      // 2d: invokestatic foz.a (Loov;)Loov;
      // 30: athrow
      // 31: pop
      // 32: return
   }

   private boolean rti(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 09: iload 3
      // 0a: ifeq 3a
      // 0d: ifne 39
      // 10: goto 17
      // 13: invokestatic foz.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: aload 2
      // 19: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1c: invokeinterface zfz.r_y ()Le0x; 1
      // 21: instanceof dqt
      // 24: iload 3
      // 25: ifeq 3a
      // 28: goto 2f
      // 2b: invokestatic foz.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 3d
      // 32: goto 39
      // 35: invokestatic foz.a (Loov;)Loov;
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   @Override
   public void ff3(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifeq 24
      // 0e: ifne 3b
      // 11: goto 18
      // 14: invokestatic foz.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 3
      // 1a: invokevirtual foz.eqv (Lzfz;)I
      // 1d: goto 24
      // 20: invokestatic foz.a (Loov;)Loov;
      // 23: athrow
      // 24: istore 6
      // 26: iload 6
      // 28: ifle 3b
      // 2b: aload 0
      // 2c: aload 1
      // 2d: aload 2
      // 2e: aload 3
      // 2f: iload 6
      // 31: invokevirtual foz.wvz (Lt9d;Lmew;Lzfz;I)V
      // 34: goto 3b
      // 37: invokestatic foz.a (Loov;)Loov;
      // 3a: athrow
      // 3b: return
   }

   @Override
   public void n9e(OpaquePredicate param1, mew param2, zfz param3, EntityLivingBase param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifeq 24
      // 0e: ifne 3b
      // 11: goto 18
      // 14: invokestatic foz.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 3
      // 1a: invokevirtual foz.eqv (Lzfz;)I
      // 1d: goto 24
      // 20: invokestatic foz.a (Loov;)Loov;
      // 23: athrow
      // 24: istore 6
      // 26: iload 6
      // 28: ifne 3b
      // 2b: aload 0
      // 2c: aload 1
      // 2d: aload 2
      // 2e: aload 3
      // 2f: iload 6
      // 31: invokevirtual foz.wvz (Lt9d;Lmew;Lzfz;I)V
      // 34: goto 3b
      // 37: invokestatic foz.a (Loov;)Loov;
      // 3a: athrow
      // 3b: return
   }

   public void wvz(OpaquePredicate param1, mew param2, zfz param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic foz.b J
      // 003: ldc2_w 1848813708079
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 7
      // 00e: aload 0
      // 00f: aload 1
      // 010: aload 2
      // 011: invokevirtual foz.af7 (Lt9d;Lmew;)I
      // 014: istore 8
      // 016: iload 4
      // 018: iload 7
      // 01a: ifeq 028
      // 01d: ifle 02b
      // 020: goto 027
      // 023: invokestatic foz.a (Loov;)Loov;
      // 026: athrow
      // 027: bipush 1
      // 028: goto 02c
      // 02b: bipush 0
      // 02c: istore 9
      // 02e: iload 8
      // 030: iload 7
      // 032: ifeq 040
      // 035: ifle 043
      // 038: goto 03f
      // 03b: invokestatic foz.a (Loov;)Loov;
      // 03e: athrow
      // 03f: bipush 1
      // 040: goto 044
      // 043: bipush 0
      // 044: istore 10
      // 046: iload 4
      // 048: iload 7
      // 04a: ifeq 077
      // 04d: iload 8
      // 04f: if_icmpeq 075
      // 052: goto 059
      // 055: invokestatic foz.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: aload 3
      // 05b: iload 8
      // 05d: invokevirtual foz.u0_ (Lzfz;I)Lzfz;
      // 060: astore 3
      // 061: aload 1
      // 062: aload 2
      // 063: aload 3
      // 064: bipush 2
      // 065: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 068: pop
      // 069: aload 0
      // 06a: aload 1
      // 06b: aload 2
      // 06c: invokevirtual foz.clo (Lt9d;Lmew;)V
      // 06f: aload 1
      // 070: aload 2
      // 071: aload 2
      // 072: invokevirtual OpaquePredicate.bi9 (Lmew;Lmew;)V
      // 075: iload 10
      // 077: iload 7
      // 079: ifeq 0e7
      // 07c: ifne 0de
      // 07f: goto 086
      // 082: invokestatic foz.a (Loov;)Loov;
      // 085: athrow
      // 086: iload 9
      // 088: iload 7
      // 08a: ifeq 0e7
      // 08d: goto 094
      // 090: invokestatic foz.a (Loov;)Loov;
      // 093: athrow
      // 094: ifeq 0de
      // 097: goto 09e
      // 09a: invokestatic foz.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 1
      // 09f: aload 2
      // 0a0: invokevirtual mew.getX ()I
      // 0a3: i2d
      // 0a4: ldc2_w 0.5
      // 0a7: dadd
      // 0a8: aload 2
      // 0a9: invokevirtual mew.getY ()I
      // 0ac: i2d
      // 0ad: ldc2_w 0.1
      // 0b0: dadd
      // 0b1: aload 2
      // 0b2: invokevirtual mew.getZ ()I
      // 0b5: i2d
      // 0b6: ldc2_w 0.5
      // 0b9: dadd
      // 0ba: sipush 19570
      // 0bd: ldc2_w 4373660846503034875
      // 0c0: lload 5
      // 0c2: lxor
      // 0c3: invokedynamic u (IJ)Ljava/lang/String; bsm=foz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: nop
      // 0c9: ldc 0.3
      // 0cb: nop
      // 0cc: ldc 0.5
      // 0ce: nop
      // 0cf: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 0d2: iload 7
      // 0d4: ifne 149
      // 0d7: goto 0de
      // 0da: invokestatic foz.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: iload 10
      // 0e0: goto 0e7
      // 0e3: invokestatic foz.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 7
      // 0e9: ifeq 14b
      // 0ec: ifeq 149
      // 0ef: goto 0f6
      // 0f2: invokestatic foz.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: iload 9
      // 0f8: iload 7
      // 0fa: ifeq 14b
      // 0fd: goto 104
      // 100: invokestatic foz.a (Loov;)Loov;
      // 103: athrow
      // 104: ifne 149
      // 107: goto 10e
      // 10a: invokestatic foz.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 1
      // 10f: aload 2
      // 110: invokevirtual mew.getX ()I
      // 113: i2d
      // 114: ldc2_w 0.5
      // 117: dadd
      // 118: aload 2
      // 119: invokevirtual mew.getY ()I
      // 11c: i2d
      // 11d: ldc2_w 0.1
      // 120: dadd
      // 121: aload 2
      // 122: invokevirtual mew.getZ ()I
      // 125: i2d
      // 126: ldc2_w 0.5
      // 129: dadd
      // 12a: sipush 28767
      // 12d: ldc2_w 7988347389036970967
      // 130: lload 5
      // 132: lxor
      // 133: invokedynamic u (IJ)Ljava/lang/String; bsm=foz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: nop
      // 139: ldc 0.3
      // 13b: nop
      // 13c: ldc 0.6
      // 13e: nop
      // 13f: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 142: goto 149
      // 145: invokestatic foz.a (Loov;)Loov;
      // 148: athrow
      // 149: iload 10
      // 14b: ifeq 160
      // 14e: aload 1
      // 14f: aload 2
      // 150: aload 0
      // 151: aload 0
      // 152: aload 1
      // 153: invokevirtual foz.odp (Lt9d;)I
      // 156: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 159: goto 160
      // 15c: invokestatic foz.a (Loov;)Loov;
      // 15f: athrow
      // 160: return
   }

   public nh4 ae9(mew var1) {
      float var2 = 0.125F;
      return new nh4(
         (double)((float)var1.getX() + 0.125F),
         (double)var1.getY(),
         (double)((float)var1.getZ() + 0.125F),
         (double)((float)(var1.getX() + 1) - 0.125F),
         (double)var1.getY() + 0.25,
         (double)((float)(var1.getZ() + 1) - 0.125F)
      );
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifeq 27
      // 0b: aload 3
      // 0c: invokevirtual foz.eqv (Lzfz;)I
      // 0f: ifle 26
      // 12: goto 19
      // 15: invokestatic foz.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: aload 2
      // 1c: invokevirtual foz.clo (Lt9d;Lmew;)V
      // 1f: goto 26
      // 22: invokestatic foz.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: aload 2
      // 29: aload 3
      // 2a: invokespecial e0x.b8f (Lt9d;Lmew;Lzfz;)V
      // 2d: return
   }

   public void clo(OpaquePredicate var1, mew var2) {
      var1._0o(var2, this);
      var1._0o(var2.eve(), this);
   }

   @Override
   public int gpi(m5n var1, mew var2, zfz var3, vt2 var4) {
      return this.eqv(var3);
   }

   @Override
   public int sqt(m5n var1, mew var2, zfz var3, vt2 var4) {
      try {
         if (var4 == vt2.rf3) {
            return this.eqv(var3);
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return 0;
   }

   @Override
   public boolean scl() {
      return true;
   }

   @Override
   public void bf6() {
      float var1 = 0.5F;
      float var2 = 0.125F;
      float var3 = 0.5F;
      this.xl4(0.0F, 0.375F, 0.0F, 1.0F, 0.625F, 1.0F);
   }

   @Override
   public int quv() {
      return 1;
   }

   public abstract int af7(OpaquePredicate var1, mew var2);

   public abstract int eqv(zfz var1);

   public abstract zfz u0_(zfz var1, int var2);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4387273556251424784L, 1642059412348221343L, MethodHandles.lookup().lookupClass()).a(112020750000636L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 133930116498376L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u001c\u0005u¾'ëññúNÎa\u0017&\u0095\u000bõ\r\u0001ÛKG¸E\u0095Ãý4\u0081á<x «\t¼q\u000fL\u009c2]åÁïç\u0081ª>!ò¢Ù°\u008189,\u0082áøä4Ô\b";
      int var8 = "\u001c\u0005u¾'ëññúNÎa\u0017&\u0095\u000bõ\r\u0001ÛKG¸E\u0095Ãý4\u0081á<x «\t¼q\u000fL\u009c2]åÁïç\u0081ª>!ò¢Ù°\u008189,\u0082áøä4Ô\b"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            h = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5832;
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
            throw new RuntimeException("foz", var10);
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
         throw new RuntimeException("foz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
