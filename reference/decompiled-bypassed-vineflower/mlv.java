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

public class mlv implements gnj {
   private final tf8 c78;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public mlv(tf8 var1) {
      this.c78 = var1;
   }

   @Override
   public void doRenderLayer(g_3 param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlv.a J
      // 003: ldc2_w 112035415187879
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic t9d.b ()I
      // 00c: istore 11
      // 00e: aload 1
      // 00f: bipush 3
      // 010: invokevirtual g_3.wfg (I)Lerg;
      // 013: astore 12
      // 015: aload 12
      // 017: iload 11
      // 019: ifeq 028
      // 01c: ifnull 2cb
      // 01f: goto 026
      // 022: invokestatic mlv.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 12
      // 028: invokevirtual erg.gn1 ()Lu7m;
      // 02b: iload 11
      // 02d: ifeq 046
      // 030: ifnull 2cb
      // 033: goto 03a
      // 036: invokestatic mlv.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 12
      // 03c: invokevirtual erg.gn1 ()Lu7m;
      // 03f: goto 046
      // 042: invokestatic mlv.a (Loov;)Loov;
      // 045: athrow
      // 046: astore 13
      // 048: invokestatic c05.vz1 ()Lc05;
      // 04b: astore 14
      // 04d: invokestatic hzu.dp2 ()V
      // 050: aload 1
      // 051: invokevirtual g_3.hzv ()Z
      // 054: iload 11
      // 056: ifeq 076
      // 059: ifeq 072
      // 05c: goto 063
      // 05f: invokestatic mlv.a (Loov;)Loov;
      // 062: athrow
      // 063: fconst_0
      // 064: ldc 0.2
      // 066: nop
      // 067: fconst_0
      // 068: invokestatic hzu.a4k (FFF)V
      // 06b: goto 072
      // 06e: invokestatic mlv.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 1
      // 073: instanceof ysf
      // 076: iload 11
      // 078: ifeq 0bd
      // 07b: ifne 0bc
      // 07e: goto 085
      // 081: invokestatic mlv.a (Loov;)Loov;
      // 084: athrow
      // 085: aload 1
      // 086: instanceof we7
      // 089: iload 11
      // 08b: ifeq 0ad
      // 08e: goto 095
      // 091: invokestatic mlv.a (Loov;)Loov;
      // 094: athrow
      // 095: ifeq 0c0
      // 098: goto 09f
      // 09b: invokestatic mlv.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 1
      // 0a0: checkcast we7
      // 0a3: invokevirtual we7.okv ()Z
      // 0a6: goto 0ad
      // 0a9: invokestatic mlv.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: iload 11
      // 0af: ifeq 0bd
      // 0b2: ifeq 0c0
      // 0b5: goto 0bc
      // 0b8: invokestatic mlv.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: bipush 1
      // 0bd: goto 0c1
      // 0c0: bipush 0
      // 0c1: istore 15
      // 0c3: iload 15
      // 0c5: iload 11
      // 0c7: ifeq 135
      // 0ca: ifne 113
      // 0cd: goto 0d4
      // 0d0: invokestatic mlv.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 1
      // 0d5: invokevirtual g_3.ejl ()Z
      // 0d8: iload 11
      // 0da: ifeq 135
      // 0dd: goto 0e4
      // 0e0: invokestatic mlv.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: ifeq 113
      // 0e7: goto 0ee
      // 0ea: invokestatic mlv.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: fconst_2
      // 0ef: fstore 16
      // 0f1: ldc 1.4
      // 0f3: nop
      // 0f4: fstore 17
      // 0f6: fload 17
      // 0f8: fload 16
      // 0fa: fdiv
      // 0fb: fload 17
      // 0fd: fload 16
      // 0ff: fdiv
      // 100: fload 17
      // 102: fload 16
      // 104: fdiv
      // 105: invokestatic hzu.syc (FFF)V
      // 108: fconst_0
      // 109: ldc 16.0
      // 10b: nop
      // 10c: fload 8
      // 10e: fmul
      // 10f: fconst_0
      // 110: invokestatic hzu.a4k (FFF)V
      // 113: aload 0
      // 114: getfield mlv.c78 Ltf8;
      // 117: ldc 0.0625
      // 119: nop
      // 11a: invokevirtual tf8.f2u (F)V
      // 11d: fconst_1
      // 11e: fconst_1
      // 11f: fconst_1
      // 120: fconst_1
      // 121: invokestatic hzu.wn0 (FFFF)V
      // 124: aload 13
      // 126: iload 11
      // 128: ifeq 195
      // 12b: instanceof gun
      // 12e: goto 135
      // 131: invokestatic mlv.a (Loov;)Loov;
      // 134: athrow
      // 135: ifeq 18c
      // 138: ldc 0.625
      // 13a: nop
      // 13b: fstore 16
      // 13d: fconst_0
      // 13e: ldc -0.25
      // 140: nop
      // 141: fconst_0
      // 142: invokestatic hzu.a4k (FFF)V
      // 145: ldc 180.0
      // 147: nop
      // 148: fconst_0
      // 149: fconst_1
      // 14a: fconst_0
      // 14b: invokestatic hzu.a2h (FFFF)V
      // 14e: fload 16
      // 150: fload 16
      // 152: fneg
      // 153: fload 16
      // 155: fneg
      // 156: invokestatic hzu.syc (FFF)V
      // 159: iload 11
      // 15b: ifeq 187
      // 15e: iload 15
      // 160: ifeq 179
      // 163: goto 16a
      // 166: invokestatic mlv.a (Loov;)Loov;
      // 169: athrow
      // 16a: fconst_0
      // 16b: ldc 0.1875
      // 16d: nop
      // 16e: fconst_0
      // 16f: invokestatic hzu.a4k (FFF)V
      // 172: goto 179
      // 175: invokestatic mlv.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 14
      // 17b: invokevirtual c05.xoy ()Lmlb;
      // 17e: aload 1
      // 17f: aload 12
      // 181: getstatic flk$gbm.h9h Lflk$gbm;
      // 184: invokevirtual mlb.xwn (Lg_3;Lerg;Lflk$gbm;)V
      // 187: iload 11
      // 189: ifne 2c8
      // 18c: aload 13
      // 18e: goto 195
      // 191: invokestatic mlv.a (Loov;)Loov;
      // 194: athrow
      // 195: getstatic xbr.r9n Lu7m;
      // 198: if_acmpne 2c8
      // 19b: ldc 1.1875
      // 19d: nop
      // 19e: fstore 16
      // 1a0: fload 16
      // 1a2: fload 16
      // 1a4: fneg
      // 1a5: fload 16
      // 1a7: fneg
      // 1a8: iload 11
      // 1aa: ifeq 1c8
      // 1ad: invokestatic hzu.syc (FFF)V
      // 1b0: iload 15
      // 1b2: ifeq 1cb
      // 1b5: goto 1bc
      // 1b8: invokestatic mlv.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: fconst_0
      // 1bd: ldc 0.0625
      // 1bf: nop
      // 1c0: fconst_0
      // 1c1: goto 1c8
      // 1c4: invokestatic mlv.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: invokestatic hzu.a4k (FFF)V
      // 1cb: aconst_null
      // 1cc: astore 17
      // 1ce: aload 12
      // 1d0: iload 11
      // 1d2: ifeq 1eb
      // 1d5: invokevirtual erg.w8b ()Z
      // 1d8: ifeq 2ad
      // 1db: goto 1e2
      // 1de: invokestatic mlv.a (Loov;)Loov;
      // 1e1: athrow
      // 1e2: aload 12
      // 1e4: goto 1eb
      // 1e7: invokestatic mlv.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: invokevirtual erg.zso ()Lbdo;
      // 1ee: astore 18
      // 1f0: aload 18
      // 1f2: sipush 11010
      // 1f5: ldc2_w 7687113565383593705
      // 1f8: lload 9
      // 1fa: lxor
      // 1fb: invokedynamic t (IJ)Ljava/lang/String; bsm=mlv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: nop
      // 201: bipush 10
      // 203: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 206: iload 11
      // 208: ifeq 253
      // 20b: ifeq 231
      // 20e: goto 215
      // 211: invokestatic mlv.a (Loov;)Loov;
      // 214: athrow
      // 215: aload 18
      // 217: sipush 14100
      // 21a: ldc2_w 232456427352986366
      // 21d: lload 9
      // 21f: lxor
      // 220: invokedynamic t (IJ)Ljava/lang/String; bsm=mlv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: nop
      // 226: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 229: invokestatic j44.j31 (Lbdo;)Lcom/mojang/authlib/GameProfile;
      // 22c: astore 17
      // 22e: goto 2ad
      // 231: aload 18
      // 233: sipush 14100
      // 236: ldc2_w 232456427352986366
      // 239: lload 9
      // 23b: lxor
      // 23c: invokedynamic t (IJ)Ljava/lang/String; bsm=mlv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: nop
      // 242: iload 11
      // 244: ifeq 26e
      // 247: bipush 8
      // 249: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 24c: goto 253
      // 24f: invokestatic mlv.a (Loov;)Loov;
      // 252: athrow
      // 253: ifeq 2ad
      // 256: aload 18
      // 258: sipush 14100
      // 25b: ldc2_w 232456427352986366
      // 25e: lload 9
      // 260: lxor
      // 261: invokedynamic t (IJ)Ljava/lang/String; bsm=mlv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: nop
      // 267: goto 26e
      // 26a: invokestatic mlv.a (Loov;)Loov;
      // 26d: athrow
      // 26e: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 271: astore 19
      // 273: aload 19
      // 275: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 278: ifne 2ad
      // 27b: new com/mojang/authlib/GameProfile
      // 27e: dup
      // 27f: aconst_null
      // 280: checkcast java/util/UUID
      // 283: aload 19
      // 285: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 288: invokestatic net/minecraft/tileentity/TileEntitySkull.cms (Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 28b: astore 17
      // 28d: aload 18
      // 28f: sipush 14100
      // 292: ldc2_w 232456427352986366
      // 295: lload 9
      // 297: lxor
      // 298: invokedynamic t (IJ)Ljava/lang/String; bsm=mlv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: nop
      // 29e: new bdo
      // 2a1: dup
      // 2a2: invokespecial bdo.<init> ()V
      // 2a5: aload 17
      // 2a7: invokestatic j44.f9e (Lbdo;Lcom/mojang/authlib/GameProfile;)Lbdo;
      // 2aa: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 2ad: getstatic tqh.mzj Ltqh;
      // 2b0: ldc -0.5
      // 2b2: nop
      // 2b3: fconst_0
      // 2b4: ldc -0.5
      // 2b6: nop
      // 2b7: getstatic vt2.rf3 Lvt2;
      // 2ba: ldc 180.0
      // 2bc: nop
      // 2bd: aload 12
      // 2bf: invokevirtual erg.j6_ ()I
      // 2c2: aload 17
      // 2c4: bipush -1
      // 2c5: invokevirtual tqh.ykr (FFFLvt2;FILcom/mojang/authlib/GameProfile;I)V
      // 2c8: invokestatic hzu.x3w ()V
      // 2cb: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return true;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2759208468570062457L, -7421450088949000520L, MethodHandles.lookup().lookupClass()).a(202318288021103L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 95301583635873L;
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
      String var6 = "6yl\u0097åDÂ\u009b\u009aíQ2¹\u0019åx:\u009c\u0016KWØo\u000fõâ\u0005¸çýrö\u0018Ái\u0093óu%\u008f\u0011\u0090È\u00adKLûÇ\u0092`Á{ºI;0&";
      int var8 = "6yl\u0097åDÂ\u009b\u009aíQ2¹\u0019åx:\u009c\u0016KWØo\u000fõâ\u0005¸çýrö\u0018Ái\u0093óu%\u008f\u0011\u0090È\u00adKLûÇ\u0092`Á{ºI;0&"
         .length();
      char var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16587;
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
            throw new RuntimeException("mlv", var10);
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
         throw new RuntimeException("mlv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
