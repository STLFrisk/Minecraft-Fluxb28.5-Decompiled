import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class br6 {
   public float azm;
   public float h87;
   public float zas;
   public float jgs;
   public boolean gbw;
   public fkf$m01 u9d;
   public String pnw;
   public String nc_;
   public float zv5;
   public float hlm;
   public boolean fkl;
   public boolean gr6;
   public Minecraft hsv;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public br6(String param1, String param2, float param3, float param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 0
      // 08: fconst_0
      // 09: putfield br6.azm F
      // 0c: aload 0
      // 0d: fconst_0
      // 0e: putfield br6.h87 F
      // 11: aload 0
      // 12: bipush 0
      // 13: putfield br6.gbw Z
      // 16: aload 0
      // 17: new fkf$m01
      // 1a: dup
      // 1b: bipush 0
      // 1c: invokespecial fkf$m01.<init> (I)V
      // 1f: putfield br6.u9d Lfkf$m01;
      // 22: istore 6
      // 24: aload 0
      // 25: bipush 0
      // 26: putfield br6.fkl Z
      // 29: aload 0
      // 2a: bipush 0
      // 2b: putfield br6.gr6 Z
      // 2e: aload 0
      // 2f: invokestatic Minecraft.vz1 ()Lc05;
      // 32: putfield br6.hsv Lc05;
      // 35: aload 0
      // 36: aload 1
      // 37: putfield br6.pnw Ljava/lang/String;
      // 3a: aload 0
      // 3b: aload 2
      // 3c: putfield br6.nc_ Ljava/lang/String;
      // 3f: aload 0
      // 40: fload 3
      // 41: putfield br6.zv5 F
      // 44: aload 0
      // 45: iload 6
      // 47: ifeq 63
      // 4a: fload 4
      // 4c: putfield br6.hlm F
      // 4f: iload 5
      // 51: ifeq 66
      // 54: goto 5b
      // 57: invokestatic br6.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 63
      // 5f: invokestatic br6.a (Loov;)Loov;
      // 62: athrow
      // 63: invokevirtual br6.p1b ()V
      // 66: return
   }

   public void rqr(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic br6.a J
      // 003: ldc2_w 68186364134635
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: iload 1
      // 00a: iload 2
      // 00b: invokevirtual br6.gf6 (II)V
      // 00e: invokestatic OpaquePredicate.c ()I
      // 011: aload 0
      // 012: getfield br6.azm F
      // 015: aload 0
      // 016: getfield br6.h87 F
      // 019: aload 0
      // 01a: getfield br6.zv5 F
      // 01d: aload 0
      // 01e: getfield br6.hlm F
      // 021: fconst_2
      // 022: ldc -10719102
      // 024: nop
      // 025: ldc 0.1
      // 027: nop
      // 028: bipush 0
      // 029: invokestatic mkt.o8m (FFFFFIFI)V
      // 02c: aload 0
      // 02d: getfield br6.azm F
      // 030: aload 0
      // 031: getfield br6.h87 F
      // 034: aload 0
      // 035: getfield br6.zv5 F
      // 038: ldc 15.0
      // 03a: nop
      // 03b: fconst_2
      // 03c: ldc -10636054
      // 03e: nop
      // 03f: ldc 0.1
      // 041: nop
      // 042: bipush 0
      // 043: invokestatic mkt.o8m (FFFFFIFI)V
      // 046: istore 5
      // 048: aload 0
      // 049: getfield br6.azm F
      // 04c: aload 0
      // 04d: getfield br6.h87 F
      // 050: ldc 13.0
      // 052: nop
      // 053: fadd
      // 054: aload 0
      // 055: getfield br6.azm F
      // 058: aload 0
      // 059: getfield br6.zv5 F
      // 05c: fadd
      // 05d: aload 0
      // 05e: getfield br6.h87 F
      // 061: ldc 16.0
      // 063: nop
      // 064: fadd
      // 065: ldc -10636054
      // 067: nop
      // 068: invokestatic hhf.cuu (FFFFI)V
      // 06b: getstatic jsr.rfr Lcyb;
      // 06e: aload 0
      // 06f: getfield br6.pnw Ljava/lang/String;
      // 072: aload 0
      // 073: getfield br6.azm F
      // 076: ldc 5.0
      // 078: nop
      // 079: fadd
      // 07a: aload 0
      // 07b: getfield br6.h87 F
      // 07e: fconst_2
      // 07f: fadd
      // 080: getstatic z7e.a2_ Lz7e;
      // 083: getfield z7e.k0y I
      // 086: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 089: pop
      // 08a: getstatic jsr.rfr Lcyb;
      // 08d: aload 0
      // 08e: getfield br6.nc_ Ljava/lang/String;
      // 091: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 094: fstore 6
      // 096: getstatic jsr.rfr Lcyb;
      // 099: aload 0
      // 09a: getfield br6.nc_ Ljava/lang/String;
      // 09d: aload 0
      // 09e: getfield br6.azm F
      // 0a1: aload 0
      // 0a2: getfield br6.zv5 F
      // 0a5: fconst_2
      // 0a6: fdiv
      // 0a7: fadd
      // 0a8: fload 6
      // 0aa: fconst_2
      // 0ab: fdiv
      // 0ac: fsub
      // 0ad: aload 0
      // 0ae: getfield br6.h87 F
      // 0b1: aload 0
      // 0b2: getfield br6.hlm F
      // 0b5: fconst_2
      // 0b6: fdiv
      // 0b7: fadd
      // 0b8: ldc 7.0
      // 0ba: nop
      // 0bb: fsub
      // 0bc: getstatic z7e.a2_ Lz7e;
      // 0bf: getfield z7e.k0y I
      // 0c2: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 0c5: pop
      // 0c6: iload 1
      // 0c7: i2f
      // 0c8: iload 2
      // 0c9: i2f
      // 0ca: aload 0
      // 0cb: getfield br6.azm F
      // 0ce: aload 0
      // 0cf: getfield br6.zv5 F
      // 0d2: fconst_2
      // 0d3: fdiv
      // 0d4: fadd
      // 0d5: aload 0
      // 0d6: getfield br6.zv5 F
      // 0d9: ldc 4.0
      // 0db: nop
      // 0dc: fdiv
      // 0dd: fsub
      // 0de: aload 0
      // 0df: getfield br6.h87 F
      // 0e2: aload 0
      // 0e3: getfield br6.hlm F
      // 0e6: fadd
      // 0e7: ldc 18.0
      // 0e9: nop
      // 0ea: fsub
      // 0eb: aload 0
      // 0ec: getfield br6.azm F
      // 0ef: aload 0
      // 0f0: getfield br6.zv5 F
      // 0f3: fconst_2
      // 0f4: fdiv
      // 0f5: fadd
      // 0f6: aload 0
      // 0f7: getfield br6.zv5 F
      // 0fa: ldc 4.0
      // 0fc: nop
      // 0fd: fdiv
      // 0fe: fadd
      // 0ff: aload 0
      // 100: getfield br6.h87 F
      // 103: aload 0
      // 104: getfield br6.hlm F
      // 107: fadd
      // 108: ldc 3.0
      // 10a: nop
      // 10b: fsub
      // 10c: invokestatic hhf.md3 (FFFFFF)Z
      // 10f: iload 5
      // 111: ifne 12a
      // 114: ifeq 128
      // 117: goto 11e
      // 11a: invokestatic br6.a (Loov;)Loov;
      // 11d: athrow
      // 11e: ldc -10636054
      // 120: nop
      // 121: goto 12b
      // 124: invokestatic br6.a (Loov;)Loov;
      // 127: athrow
      // 128: ldc -12231829
      // 12a: nop
      // 12b: istore 7
      // 12d: aload 0
      // 12e: getfield br6.azm F
      // 131: aload 0
      // 132: getfield br6.zv5 F
      // 135: fconst_2
      // 136: fdiv
      // 137: fadd
      // 138: aload 0
      // 139: getfield br6.zv5 F
      // 13c: ldc 4.0
      // 13e: nop
      // 13f: fdiv
      // 140: fsub
      // 141: aload 0
      // 142: getfield br6.h87 F
      // 145: aload 0
      // 146: getfield br6.hlm F
      // 149: fadd
      // 14a: ldc 18.0
      // 14c: nop
      // 14d: fsub
      // 14e: aload 0
      // 14f: getfield br6.zv5 F
      // 152: fconst_2
      // 153: fdiv
      // 154: ldc 15.0
      // 156: nop
      // 157: fconst_2
      // 158: iload 7
      // 15a: ldc 0.1
      // 15c: nop
      // 15d: iload 7
      // 15f: invokestatic mkt.o8m (FFFFFIFI)V
      // 162: getstatic jsr.rfr Lcyb;
      // 165: sipush 11631
      // 168: ldc2_w 8092932824224501544
      // 16b: lload 3
      // 16c: lxor
      // 16d: invokedynamic s (IJ)Ljava/lang/String; bsm=br6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: nop
      // 173: aload 0
      // 174: getfield br6.azm F
      // 177: aload 0
      // 178: getfield br6.zv5 F
      // 17b: fconst_2
      // 17c: fdiv
      // 17d: fadd
      // 17e: getstatic jsr.rfr Lcyb;
      // 181: sipush 10201
      // 184: ldc2_w 2571199350801958303
      // 187: lload 3
      // 188: lxor
      // 189: invokedynamic s (IJ)Ljava/lang/String; bsm=br6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: nop
      // 18f: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 192: fconst_2
      // 193: fdiv
      // 194: fsub
      // 195: aload 0
      // 196: getfield br6.h87 F
      // 199: aload 0
      // 19a: getfield br6.hlm F
      // 19d: fadd
      // 19e: ldc 16.0
      // 1a0: nop
      // 1a1: fsub
      // 1a2: getstatic z7e.a2_ Lz7e;
      // 1a5: getfield z7e.k0y I
      // 1a8: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1ab: pop
      // 1ac: return
   }

   public void nml(int var1, int var2, int var3) {
      int var4 = OpaquePredicate.c();

      int var10000;
      label26: {
         try {
            var10000 = hhf.md3(
               (float)var1,
               (float)var2,
               this.azm + this.zv5 / 2.0F - this.zv5 / 4.0F,
               this.h87 + this.hlm - 18.0F,
               this.azm + this.zv5 / 2.0F + this.zv5 / 4.0F,
               this.h87 + this.hlm - 3.0F
            );
            if (var4 != 0) {
               break label26;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var10000 = var3;
      }

      try {
         if (var10000 == 0) {
            this.gr6 = true;
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   public void gf6(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 08: iload 3
      // 09: ifeq 5b
      // 0c: ifne 3b
      // 0f: goto 16
      // 12: invokestatic br6.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield br6.gbw Z
      // 1a: iload 3
      // 1b: ifeq 5b
      // 1e: goto 25
      // 21: invokestatic br6.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 3b
      // 28: goto 2f
      // 2b: invokestatic br6.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: bipush 0
      // 31: putfield br6.gbw Z
      // 34: goto 3b
      // 37: invokestatic br6.a (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 1
      // 3c: i2f
      // 3d: iload 2
      // 3e: i2f
      // 3f: aload 0
      // 40: getfield br6.azm F
      // 43: aload 0
      // 44: getfield br6.h87 F
      // 47: aload 0
      // 48: getfield br6.azm F
      // 4b: aload 0
      // 4c: getfield br6.zv5 F
      // 4f: fadd
      // 50: aload 0
      // 51: getfield br6.h87 F
      // 54: ldc 16.0
      // 56: nop
      // 57: fadd
      // 58: invokestatic hhf.md3 (FFFFFF)Z
      // 5b: iload 3
      // 5c: ifeq b6
      // 5f: ifeq a7
      // 62: goto 69
      // 65: invokestatic br6.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield br6.u9d Lfkf$m01;
      // 6d: invokevirtual fkf$m01.mxf ()Z
      // 70: iload 3
      // 71: ifeq b6
      // 74: goto 7b
      // 77: invokestatic br6.a (Loov;)Loov;
      // 7a: athrow
      // 7b: ifeq a7
      // 7e: goto 85
      // 81: invokestatic br6.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: bipush 1
      // 87: putfield br6.gbw Z
      // 8a: aload 0
      // 8b: iload 1
      // 8c: i2f
      // 8d: aload 0
      // 8e: getfield br6.azm F
      // 91: fsub
      // 92: putfield br6.zas F
      // 95: aload 0
      // 96: iload 2
      // 97: i2f
      // 98: aload 0
      // 99: getfield br6.h87 F
      // 9c: fsub
      // 9d: putfield br6.jgs F
      // a0: goto a7
      // a3: invokestatic br6.a (Loov;)Loov;
      // a6: athrow
      // a7: aload 0
      // a8: iload 3
      // a9: ifeq cc
      // ac: getfield br6.gbw Z
      // af: goto b6
      // b2: invokestatic br6.a (Loov;)Loov;
      // b5: athrow
      // b6: ifeq d6
      // b9: aload 0
      // ba: iload 1
      // bb: i2f
      // bc: aload 0
      // bd: getfield br6.zas F
      // c0: fsub
      // c1: putfield br6.azm F
      // c4: aload 0
      // c5: goto cc
      // c8: invokestatic br6.a (Loov;)Loov;
      // cb: athrow
      // cc: iload 2
      // cd: i2f
      // ce: aload 0
      // cf: getfield br6.jgs F
      // d2: fsub
      // d3: putfield br6.h87 F
      // d6: return
   }

   public void p1b() {
      eka var1 = new eka(this.hsv);
      this.azm = (float)var1.x05() / 2.0F - this.zv5 / 2.0F;
      this.h87 = (float)var1.lrx() / 2.0F - this.hlm / 2.0F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6628904636691383082L, 2727472073330332909L, MethodHandles.lookup().lookupClass()).a(106102639477466L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 40865976457434L;
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
      String var6 = "úP\u0005\u009fõ!\u0081ó}NWÍ\u00adÒ\u008a¿\u0010\rçn£\u0081ý\u0090A\u009f\b7\u0000o¹x\u00ad";
      int var8 = "úP\u0005\u009fõ!\u0081ó}NWÍ\u00adÒ\u008a¿\u0010\rçn£\u0081ý\u0090A\u009f\b7\u0000o¹x\u00ad".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 183;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("br6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("br6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
