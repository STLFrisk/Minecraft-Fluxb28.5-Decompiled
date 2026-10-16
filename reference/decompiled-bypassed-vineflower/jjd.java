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

public class jjd implements gnj {
   public xx_ dai = new xx_();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public jjd(t_r var1) {
      this.e3l = var1;
   }

   public void y2e(ia2 param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jjd.a J
      // 003: ldc2_w 83101980833564
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic t9d.b ()I
      // 00c: istore 11
      // 00e: aload 1
      // 00f: invokevirtual ia2.pv5 ()Z
      // 012: iload 11
      // 014: ifeq 02c
      // 017: ifne 199
      // 01a: goto 021
      // 01d: invokestatic jjd.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 1
      // 022: invokevirtual ia2.h5u ()Z
      // 025: goto 02c
      // 028: invokestatic jjd.a (Loov;)Loov;
      // 02b: athrow
      // 02c: iload 11
      // 02e: ifeq 05c
      // 031: ifne 199
      // 034: goto 03b
      // 037: invokestatic jjd.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield jjd.e3l Lt_r;
      // 03f: getstatic jjd.ht4 Lgdz;
      // 042: invokevirtual t_r.gu4 (Lgdz;)V
      // 045: aload 1
      // 046: iload 11
      // 048: ifeq 145
      // 04b: goto 052
      // 04e: invokestatic jjd.a (Loov;)Loov;
      // 051: athrow
      // 052: invokevirtual ia2.qrh ()Z
      // 055: goto 05c
      // 058: invokestatic jjd.a (Loov;)Loov;
      // 05b: athrow
      // 05c: ifeq 13d
      // 05f: sipush 17958
      // 062: ldc2_w 6654601501474577458
      // 065: lload 9
      // 067: lxor
      // 068: invokedynamic d (IJ)Ljava/lang/String; bsm=jjd.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: nop
      // 06e: aload 1
      // 06f: invokevirtual ia2.hei ()Ljava/lang/String;
      // 072: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 075: iload 11
      // 077: ifeq 08d
      // 07a: goto 081
      // 07d: invokestatic jjd.a (Loov;)Loov;
      // 080: athrow
      // 081: ifeq 13d
      // 084: goto 08b
      // 087: invokestatic jjd.a (Loov;)Loov;
      // 08a: athrow
      // 08b: bipush 25
      // 08d: istore 12
      // 08f: aload 1
      // 090: getfield ia2.g25 I
      // 093: bipush 25
      // 095: idiv
      // 096: aload 1
      // 097: invokevirtual ia2.jwu ()I
      // 09a: iadd
      // 09b: istore 13
      // 09d: invokestatic qvg.values ()[Lqvg;
      // 0a0: arraylength
      // 0a1: istore 14
      // 0a3: iload 13
      // 0a5: iload 14
      // 0a7: irem
      // 0a8: istore 15
      // 0aa: iload 13
      // 0ac: bipush 1
      // 0ad: iadd
      // 0ae: iload 14
      // 0b0: irem
      // 0b1: istore 16
      // 0b3: aload 1
      // 0b4: getfield ia2.g25 I
      // 0b7: bipush 25
      // 0b9: irem
      // 0ba: i2f
      // 0bb: fload 4
      // 0bd: fadd
      // 0be: ldc 25.0
      // 0c0: nop
      // 0c1: fdiv
      // 0c2: fstore 17
      // 0c4: iload 15
      // 0c6: invokestatic qvg.hup (I)Lqvg;
      // 0c9: invokestatic ia2.kn7 (Lqvg;)[F
      // 0cc: astore 18
      // 0ce: iload 16
      // 0d0: invokestatic qvg.hup (I)Lqvg;
      // 0d3: invokestatic ia2.kn7 (Lqvg;)[F
      // 0d6: astore 19
      // 0d8: iload 11
      // 0da: ifeq 138
      // 0dd: invokestatic hxt.xe2 ()Z
      // 0e0: ifeq 102
      // 0e3: goto 0ea
      // 0e6: invokestatic jjd.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: iload 15
      // 0ec: invokestatic qvg.hup (I)Lqvg;
      // 0ef: aload 18
      // 0f1: invokestatic net/optifine/CustomColors.getSheepColors (Lqvg;[F)[F
      // 0f4: astore 18
      // 0f6: iload 16
      // 0f8: invokestatic qvg.hup (I)Lqvg;
      // 0fb: aload 19
      // 0fd: invokestatic net/optifine/CustomColors.getSheepColors (Lqvg;[F)[F
      // 100: astore 19
      // 102: aload 18
      // 104: bipush 0
      // 105: faload
      // 106: fconst_1
      // 107: fload 17
      // 109: fsub
      // 10a: fmul
      // 10b: aload 19
      // 10d: bipush 0
      // 10e: faload
      // 10f: fload 17
      // 111: fmul
      // 112: fadd
      // 113: aload 18
      // 115: bipush 1
      // 116: faload
      // 117: fconst_1
      // 118: fload 17
      // 11a: fsub
      // 11b: fmul
      // 11c: aload 19
      // 11e: bipush 1
      // 11f: faload
      // 120: fload 17
      // 122: fmul
      // 123: fadd
      // 124: aload 18
      // 126: bipush 2
      // 127: faload
      // 128: fconst_1
      // 129: fload 17
      // 12b: fsub
      // 12c: fmul
      // 12d: aload 19
      // 12f: bipush 2
      // 130: faload
      // 131: fload 17
      // 133: fmul
      // 134: fadd
      // 135: invokestatic hzu.oxa (FFF)V
      // 138: iload 11
      // 13a: ifne 16d
      // 13d: aload 1
      // 13e: goto 145
      // 141: invokestatic jjd.a (Loov;)Loov;
      // 144: athrow
      // 145: invokevirtual ia2.g2i ()Lqvg;
      // 148: invokestatic ia2.kn7 (Lqvg;)[F
      // 14b: astore 12
      // 14d: invokestatic hxt.xe2 ()Z
      // 150: ifeq 15e
      // 153: aload 1
      // 154: invokevirtual ia2.g2i ()Lqvg;
      // 157: aload 12
      // 159: invokestatic net/optifine/CustomColors.getSheepColors (Lqvg;[F)[F
      // 15c: astore 12
      // 15e: aload 12
      // 160: bipush 0
      // 161: faload
      // 162: aload 12
      // 164: bipush 1
      // 165: faload
      // 166: aload 12
      // 168: bipush 2
      // 169: faload
      // 16a: invokestatic hzu.oxa (FFF)V
      // 16d: aload 0
      // 16e: getfield jjd.dai Lxx_;
      // 171: aload 0
      // 172: getfield jjd.e3l Lt_r;
      // 175: invokevirtual t_r.fy4 ()Lg6r;
      // 178: invokevirtual xx_.jxr (Lg6r;)V
      // 17b: aload 0
      // 17c: getfield jjd.dai Lxx_;
      // 17f: aload 1
      // 180: fload 2
      // 181: fload 3
      // 182: fload 4
      // 184: invokevirtual xx_.v3g (Lg_3;FFF)V
      // 187: aload 0
      // 188: getfield jjd.dai Lxx_;
      // 18b: aload 1
      // 18c: fload 2
      // 18d: fload 3
      // 18e: fload 5
      // 190: fload 6
      // 192: fload 7
      // 194: fload 8
      // 196: invokevirtual xx_.s_q (Li2h;FFFFFF)V
      // 199: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return true;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.y2e((ia2)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8541192216324525963L, -1303585563328478805L, MethodHandles.lookup().lookupClass()).a(122807498432625L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 45770885732247L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "/âea8]Ì>{?v©-\u000f\u001a\u0006\u0096ôIHøÊq~àÕ\u0018Býà¶\u0093µ\u008a>Äf®4J»\u0095\u0094ÖT\u009c?º&W\f\u001f*ú\u008b\u000fù\u008f1½>\u001bÐ\u0005\u0010O\u0095Rè!\fô\u008d zö³brÂ\u0084";
      int var6 = "/âea8]Ì>{?v©-\u000f\u001a\u0006\u0096ôIHøÊq~àÕ\u0018Býà¶\u0093µ\u008a>Äf®4J»\u0095\u0094ÖT\u009c?º&W\f\u001f*ú\u008b\u000fù\u008f1½>\u001bÐ\u0005\u0010O\u0095Rè!\fô\u008d zö³brÂ\u0084"
         .length();
      char var3 = '@';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            ht4 = new gdz(a<"d">(4100, 7193067578646375066L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26823;
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
            throw new RuntimeException("jjd", var10);
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
         throw new RuntimeException("jjd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
