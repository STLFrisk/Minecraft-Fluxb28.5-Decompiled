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

public class o27 extends ar7 {
   public static c_3 feq;
   public static crk an1;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public o27() {
      long var1 = a ^ 7292416441504L;
      super(b<"l">(8173, 7849257712343929298L ^ var1), _aj.p3z, feq);
   }

   @jev
   public void pup(ccn var1) {
      long var2 = a ^ 70977103500133L;
      this.n5o(this.m2d() + b<"l">(10640, 6293477859110799471L ^ var2) + feq.d7c());
   }

   @jev
   private void lqd(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic o27.a J
      // 003: ldc2_w 8688021940762
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: getstatic o27.feq Lc_3;
      // 010: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 013: sipush 2742
      // 016: ldc2_w 3468910496678105648
      // 019: lload 2
      // 01a: lxor
      // 01b: invokedynamic l (IJ)Ljava/lang/String; bsm=o27.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 024: iload 4
      // 026: ifne 173
      // 029: ifeq 15c
      // 02c: goto 033
      // 02f: invokestatic o27.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: pop
      // 035: getstatic o27.ek1 Lc05;
      // 038: getfield c05.vg8 Ll86;
      // 03b: iload 4
      // 03d: ifne 066
      // 040: goto 047
      // 043: invokestatic o27.a (Loov;)Loov;
      // 046: athrow
      // 047: getstatic mcs.kkg Lmcs;
      // 04a: invokevirtual l86.dhd (Lmcs;)Lsdj;
      // 04d: ifnull 15c
      // 050: goto 057
      // 053: invokestatic o27.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: pop
      // 059: getstatic o27.ek1 Lc05;
      // 05c: getfield c05.vg8 Ll86;
      // 05f: goto 066
      // 062: invokestatic o27.a (Loov;)Loov;
      // 065: athrow
      // 066: getfield l86.lfk Z
      // 069: iload 4
      // 06b: ifne 0e1
      // 06e: ifne 0c3
      // 071: goto 078
      // 074: invokestatic o27.a (Loov;)Loov;
      // 077: athrow
      // 078: invokestatic bk4.ncv ()Z
      // 07b: iload 4
      // 07d: ifne 0e1
      // 080: goto 087
      // 083: invokestatic o27.a (Loov;)Loov;
      // 086: athrow
      // 087: ifne 0c3
      // 08a: goto 091
      // 08d: invokestatic o27.a (Loov;)Loov;
      // 090: athrow
      // 091: invokestatic bk4.icg ()Z
      // 094: iload 4
      // 096: ifne 0e1
      // 099: goto 0a0
      // 09c: invokestatic o27.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: ifne 0c3
      // 0a3: goto 0aa
      // 0a6: invokestatic o27.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: invokestatic bk4.qq4 ()Z
      // 0ad: iload 4
      // 0af: ifne 173
      // 0b2: goto 0b9
      // 0b5: invokestatic o27.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: ifeq 15c
      // 0bc: goto 0c3
      // 0bf: invokestatic o27.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: pop
      // 0c5: getstatic o27.ek1 Lc05;
      // 0c8: getfield c05.vg8 Ll86;
      // 0cb: invokevirtual l86.i55 ()F
      // 0ce: aload 0
      // 0cf: pop
      // 0d0: getstatic o27.ek1 Lc05;
      // 0d3: getfield c05.vg8 Ll86;
      // 0d6: invokevirtual l86.axb ()F
      // 0d9: fcmpg
      // 0da: goto 0e1
      // 0dd: invokestatic o27.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iload 4
      // 0e3: ifne 173
      // 0e6: ifge 15c
      // 0e9: goto 0f0
      // 0ec: invokestatic o27.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: bipush 0
      // 0f1: istore 5
      // 0f3: iload 5
      // 0f5: i2f
      // 0f6: aload 0
      // 0f7: pop
      // 0f8: getstatic o27.ek1 Lc05;
      // 0fb: getfield c05.vg8 Ll86;
      // 0fe: invokevirtual l86.axb ()F
      // 101: aload 0
      // 102: pop
      // 103: getstatic o27.ek1 Lc05;
      // 106: getfield c05.vg8 Ll86;
      // 109: invokevirtual l86.i55 ()F
      // 10c: fsub
      // 10d: fcmpg
      // 10e: ifge 15c
      // 111: aload 0
      // 112: pop
      // 113: getstatic o27.ek1 Lc05;
      // 116: iload 4
      // 118: ifne 146
      // 11b: getfield c05.vg8 Ll86;
      // 11e: iload 4
      // 120: ifne 191
      // 123: goto 12a
      // 126: invokestatic o27.a (Loov;)Loov;
      // 129: athrow
      // 12a: getstatic mcs.kkg Lmcs;
      // 12d: invokevirtual l86.dhd (Lmcs;)Lsdj;
      // 130: ifnonnull 141
      // 133: goto 13a
      // 136: invokestatic o27.a (Loov;)Loov;
      // 139: athrow
      // 13a: goto 15c
      // 13d: invokestatic o27.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: pop
      // 143: getstatic o27.ek1 Lc05;
      // 146: invokevirtual c05.c02 ()Lp_k;
      // 149: new net/minecraft/network/play/client/C03PacketPlayer
      // 14c: dup
      // 14d: bipush 1
      // 14e: invokespecial net/minecraft/network/play/client/C03PacketPlayer.<init> (Z)V
      // 151: invokevirtual p_k.sxi (Lmz2;)V
      // 154: iinc 5 1
      // 157: iload 4
      // 159: ifeq 0f3
      // 15c: getstatic o27.feq Lc_3;
      // 15f: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 162: sipush 4559
      // 165: ldc2_w 8422328513586743629
      // 168: lload 2
      // 169: lxor
      // 16a: invokedynamic l (IJ)Ljava/lang/String; bsm=o27.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: nop
      // 170: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 173: iload 4
      // 175: ifne 1a0
      // 178: ifeq 204
      // 17b: goto 182
      // 17e: invokestatic o27.a (Loov;)Loov;
      // 181: athrow
      // 182: aload 0
      // 183: pop
      // 184: getstatic o27.ek1 Lc05;
      // 187: getfield c05.vg8 Ll86;
      // 18a: goto 191
      // 18d: invokestatic o27.a (Loov;)Loov;
      // 190: athrow
      // 191: invokevirtual l86.i55 ()F
      // 194: aload 0
      // 195: pop
      // 196: getstatic o27.ek1 Lc05;
      // 199: getfield c05.vg8 Ll86;
      // 19c: invokevirtual l86.axb ()F
      // 19f: fcmpg
      // 1a0: iload 4
      // 1a2: ifne 1c4
      // 1a5: ifge 204
      // 1a8: goto 1af
      // 1ab: invokestatic o27.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 0
      // 1b0: pop
      // 1b1: getstatic o27.ek1 Lc05;
      // 1b4: getfield c05.vg8 Ll86;
      // 1b7: invokevirtual l86.wvq ()Lwkk;
      // 1ba: invokevirtual wkk.f1i ()I
      // 1bd: goto 1c4
      // 1c0: invokestatic o27.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: iload 4
      // 1c6: ifne 1d4
      // 1c9: ifle 204
      // 1cc: goto 1d3
      // 1cf: invokestatic o27.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: bipush 0
      // 1d4: istore 5
      // 1d6: iload 5
      // 1d8: i2f
      // 1d9: getstatic o27.an1 Lcrk;
      // 1dc: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 1df: invokevirtual java/lang/Float.floatValue ()F
      // 1e2: fcmpg
      // 1e3: ifge 204
      // 1e6: aload 0
      // 1e7: pop
      // 1e8: getstatic o27.ek1 Lc05;
      // 1eb: getfield c05.vg8 Ll86;
      // 1ee: getfield l86.lq7 Lp_k;
      // 1f1: new net/minecraft/network/play/client/C03PacketPlayer
      // 1f4: dup
      // 1f5: bipush 1
      // 1f6: invokespecial net/minecraft/network/play/client/C03PacketPlayer.<init> (Z)V
      // 1f9: invokevirtual p_k.sxi (Lmz2;)V
      // 1fc: iinc 5 1
      // 1ff: iload 4
      // 201: ifeq 1d6
      // 204: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7310919195575904717L, 6407655126374136928L, MethodHandles.lookup().lookupClass()).a(213906902084705L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 57628880408633L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "Ã\u0007çÞnZ dU=Mä])\u009f%\u0010tY;êP<Ö\u007fñ¾\u0016^\u008d2\u00ad®\u0010\u000f\u0012\u008bj\\\u0098í'\u000eè\n\u0081FT\u0006@\u0010Ñ\u001b\u0096FÜÐÞ\u001c\u0092AõOÔuGú\u0010'r©\u0005=\u0088ïË\u0016°Ý©ågy+\u0010\u0017\u0007QØ¤Næ\u0002«\u001ehþ\u0000)ì\u0097\u0010gÙÂÐ\u0083\u0019lú>\u0094\tF³ÈêI";
      int var6 = "Ã\u0007çÞnZ dU=Mä])\u009f%\u0010tY;êP<Ö\u007fñ¾\u0016^\u008d2\u00ad®\u0010\u000f\u0012\u008bj\\\u0098í'\u000eè\n\u0081FT\u0006@\u0010Ñ\u001b\u0096FÜÐÞ\u001c\u0092AõOÔuGú\u0010'r©\u0005=\u0088ïË\u0016°Ý©ågy+\u0010\u0017\u0007QØ¤Næ\u0002«\u001ehþ\u0000)ì\u0097\u0010gÙÂÐ\u0083\u0019lú>\u0094\tF³ÈêI"
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
                     f = var7;
                     g = new String[9];
                     feq = new c_3(
                        b<"l">(29971, 3411818585463887799L ^ var9),
                        b<"l">(30566, 7591587389246019014L ^ var9),
                        b<"l">(5571, 2151465540397496164L ^ var9),
                        new String[]{b<"l">(5571, 2151465540397496164L ^ var9), b<"l">(16518, 7768316972492202536L ^ var9)}
                     );
                     an1 = new crk(b<"l">(29971, 3411818585463887799L ^ var9), b<"l">(11054, 8152175036555676044L ^ var9), 30.0F, 10.0F, 100.0F, 10.0F);
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

                  var4 = "¤À^\u0080\u0080Ç à\u0081á/XÒ\u0099Úb\u0010Á¡\u0097%pmd,R8\u001a\u009c\u0004¸à÷";
                  var6 = "¤À^\u0080\u0080Ç à\u0081á/XÒ\u0099Úb\u0010Á¡\u0097%pmd,R8\u001a\u009c\u0004¸à÷".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30229;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("o27", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("o27" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
