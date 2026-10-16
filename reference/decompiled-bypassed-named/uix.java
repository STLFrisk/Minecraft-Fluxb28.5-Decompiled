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
import org.lwjgl.util.vector.Matrix4f;

public class uix {
   public final oru n7w;
   public final oru d1h;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public uix(y99 var1, String var2, oru var3, oru var4) {
      this.etj = new jn3(var1, var2);
      this.n7w = var3;
      this.d1h = var4;
   }

   public void l53() {
      this.etj.kne();
   }

   public void edt(String var1, Object var2, int var3, int var4) {
      this.p7c.add(this.p7c.size(), var1);
      this.hfo.add(this.hfo.size(), var2);
      this.qhp.add(this.qhp.size(), var3);
      this.mhw.add(this.mhw.size(), var4);
   }

   private void _pf() {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      hzu.ux6();
      hzu._o4();
      hzu.vtj();
      hzu.gcp();
      hzu.fpt();
      hzu.ync();
      hzu.rqj();
      hzu.t30(0);
   }

   public void cv2(Matrix4f var1) {
      this.uyz = var1;
   }

   public void dk4(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic uix.a J
      // 003: ldc2_w 53433902313585
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: invokespecial uix._pf ()V
      // 00c: aload 0
      // 00d: getfield uix.n7w Loru;
      // 010: invokevirtual oru._zc ()V
      // 013: aload 0
      // 014: getfield uix.d1h Loru;
      // 017: getfield oru.ntc I
      // 01a: i2f
      // 01b: fstore 5
      // 01d: invokestatic OpaquePredicate.b ()I
      // 020: aload 0
      // 021: getfield uix.d1h Loru;
      // 024: getfield oru.f86 I
      // 027: i2f
      // 028: fstore 6
      // 02a: bipush 0
      // 02b: bipush 0
      // 02c: fload 5
      // 02e: f2i
      // 02f: fload 6
      // 031: f2i
      // 032: invokestatic hzu.fb6 (IIII)V
      // 035: aload 0
      // 036: getfield uix.etj Ljn3;
      // 039: sipush 30012
      // 03c: ldc2_w 6020132812067726771
      // 03f: lload 2
      // 040: lxor
      // 041: invokedynamic y (IJ)Ljava/lang/String; bsm=uix.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: nop
      // 047: aload 0
      // 048: getfield uix.n7w Loru;
      // 04b: invokevirtual jn3.uya (Ljava/lang/String;Ljava/lang/Object;)V
      // 04e: bipush 0
      // 04f: istore 7
      // 051: istore 4
      // 053: iload 7
      // 055: aload 0
      // 056: getfield uix.hfo Ljava/util/List;
      // 059: invokeinterface java/util/List.size ()I 1
      // 05e: if_icmpge 0e3
      // 061: aload 0
      // 062: getfield uix.etj Ljn3;
      // 065: aload 0
      // 066: getfield uix.p7c Ljava/util/List;
      // 069: iload 7
      // 06b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 070: checkcast java/lang/String
      // 073: aload 0
      // 074: getfield uix.hfo Ljava/util/List;
      // 077: iload 7
      // 079: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 07e: invokevirtual jn3.uya (Ljava/lang/String;Ljava/lang/Object;)V
      // 081: aload 0
      // 082: getfield uix.etj Ljn3;
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: sipush 2086
      // 08f: ldc2_w 27675704335571114
      // 092: lload 2
      // 093: lxor
      // 094: invokedynamic y (IJ)Ljava/lang/String; bsm=uix.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: nop
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: iload 7
      // 09f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a5: invokevirtual jn3.ekl (Ljava/lang/String;)Lboo;
      // 0a8: aload 0
      // 0a9: getfield uix.qhp Ljava/util/List;
      // 0ac: iload 7
      // 0ae: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0b3: checkcast java/lang/Integer
      // 0b6: invokevirtual java/lang/Integer.intValue ()I
      // 0b9: i2f
      // 0ba: aload 0
      // 0bb: getfield uix.mhw Ljava/util/List;
      // 0be: iload 7
      // 0c0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c5: checkcast java/lang/Integer
      // 0c8: invokevirtual java/lang/Integer.intValue ()I
      // 0cb: i2f
      // 0cc: invokevirtual boo.utn (FF)V
      // 0cf: iinc 7 1
      // 0d2: iload 4
      // 0d4: ifeq 15c
      // 0d7: iload 4
      // 0d9: ifne 053
      // 0dc: goto 0e3
      // 0df: invokestatic uix.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: getfield uix.etj Ljn3;
      // 0e7: sipush 20411
      // 0ea: ldc2_w 5558602153060818738
      // 0ed: lload 2
      // 0ee: lxor
      // 0ef: invokedynamic y (IJ)Ljava/lang/String; bsm=uix.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: nop
      // 0f5: invokevirtual jn3.ekl (Ljava/lang/String;)Lboo;
      // 0f8: aload 0
      // 0f9: getfield uix.uyz Lorg/lwjgl/util/vector/Matrix4f;
      // 0fc: invokevirtual boo.i9w (Lorg/lwjgl/util/vector/Matrix4f;)V
      // 0ff: aload 0
      // 100: getfield uix.etj Ljn3;
      // 103: sipush 8098
      // 106: ldc2_w 2644444865557040936
      // 109: lload 2
      // 10a: lxor
      // 10b: invokedynamic y (IJ)Ljava/lang/String; bsm=uix.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: nop
      // 111: invokevirtual jn3.ekl (Ljava/lang/String;)Lboo;
      // 114: aload 0
      // 115: getfield uix.n7w Loru;
      // 118: getfield oru.ntc I
      // 11b: i2f
      // 11c: aload 0
      // 11d: getfield uix.n7w Loru;
      // 120: getfield oru.f86 I
      // 123: i2f
      // 124: invokevirtual boo.utn (FF)V
      // 127: aload 0
      // 128: getfield uix.etj Ljn3;
      // 12b: sipush 22622
      // 12e: ldc2_w 2691568490090186963
      // 131: lload 2
      // 132: lxor
      // 133: invokedynamic y (IJ)Ljava/lang/String; bsm=uix.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: nop
      // 139: invokevirtual jn3.ekl (Ljava/lang/String;)Lboo;
      // 13c: fload 5
      // 13e: fload 6
      // 140: invokevirtual boo.utn (FF)V
      // 143: aload 0
      // 144: getfield uix.etj Ljn3;
      // 147: sipush 370
      // 14a: ldc2_w 5438213441970868729
      // 14d: lload 2
      // 14e: lxor
      // 14f: invokedynamic y (IJ)Ljava/lang/String; bsm=uix.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: nop
      // 155: invokevirtual jn3.ekl (Ljava/lang/String;)Lboo;
      // 158: fload 1
      // 159: invokevirtual boo.scn (F)V
      // 15c: invokestatic Minecraft.vz1 ()Lc05;
      // 15f: astore 7
      // 161: aload 0
      // 162: getfield uix.etj Ljn3;
      // 165: sipush 2004
      // 168: ldc2_w 4431661689330997084
      // 16b: lload 2
      // 16c: lxor
      // 16d: invokedynamic y (IJ)Ljava/lang/String; bsm=uix.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: nop
      // 173: invokevirtual jn3.ekl (Ljava/lang/String;)Lboo;
      // 176: aload 7
      // 178: getfield Minecraft.pfr I
      // 17b: i2f
      // 17c: aload 7
      // 17e: getfield Minecraft.ry7 I
      // 181: i2f
      // 182: invokevirtual boo.utn (FF)V
      // 185: aload 0
      // 186: getfield uix.etj Ljn3;
      // 189: invokevirtual jn3.l1d ()V
      // 18c: aload 0
      // 18d: getfield uix.d1h Loru;
      // 190: invokevirtual oru.xix ()V
      // 193: aload 0
      // 194: getfield uix.d1h Loru;
      // 197: bipush 0
      // 198: invokevirtual oru.mou (Z)V
      // 19b: bipush 0
      // 19c: invokestatic hzu.jun (Z)V
      // 19f: bipush 1
      // 1a0: bipush 1
      // 1a1: bipush 1
      // 1a2: bipush 1
      // 1a3: invokestatic hzu.y4q (ZZZZ)V
      // 1a6: invokestatic jom.yut ()Ljom;
      // 1a9: astore 8
      // 1ab: aload 8
      // 1ad: invokevirtual jom.zuq ()Lq3g;
      // 1b0: astore 9
      // 1b2: aload 9
      // 1b4: bipush 7
      // 1b6: getstatic gnl.gec Lbe7;
      // 1b9: invokevirtual q3g.ezr (ILbe7;)V
      // 1bc: aload 9
      // 1be: dconst_0
      // 1bf: fload 6
      // 1c1: f2d
      // 1c2: ldc2_w 500.0
      // 1c5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1c8: sipush 255
      // 1cb: sipush 255
      // 1ce: sipush 255
      // 1d1: sipush 255
      // 1d4: invokevirtual q3g.fje (IIII)Lq3g;
      // 1d7: invokevirtual q3g.pzw ()V
      // 1da: aload 9
      // 1dc: fload 5
      // 1de: f2d
      // 1df: fload 6
      // 1e1: f2d
      // 1e2: ldc2_w 500.0
      // 1e5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1e8: sipush 255
      // 1eb: sipush 255
      // 1ee: sipush 255
      // 1f1: sipush 255
      // 1f4: invokevirtual q3g.fje (IIII)Lq3g;
      // 1f7: invokevirtual q3g.pzw ()V
      // 1fa: aload 9
      // 1fc: fload 5
      // 1fe: f2d
      // 1ff: dconst_0
      // 200: ldc2_w 500.0
      // 203: invokevirtual q3g.g5o (DDD)Lq3g;
      // 206: sipush 255
      // 209: sipush 255
      // 20c: sipush 255
      // 20f: sipush 255
      // 212: invokevirtual q3g.fje (IIII)Lq3g;
      // 215: invokevirtual q3g.pzw ()V
      // 218: aload 9
      // 21a: dconst_0
      // 21b: dconst_0
      // 21c: ldc2_w 500.0
      // 21f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 222: sipush 255
      // 225: sipush 255
      // 228: sipush 255
      // 22b: sipush 255
      // 22e: invokevirtual q3g.fje (IIII)Lq3g;
      // 231: invokevirtual q3g.pzw ()V
      // 234: aload 8
      // 236: invokevirtual jom.q7g ()V
      // 239: bipush 1
      // 23a: invokestatic hzu.jun (Z)V
      // 23d: bipush 1
      // 23e: bipush 1
      // 23f: bipush 1
      // 240: bipush 1
      // 241: invokestatic hzu.y4q (ZZZZ)V
      // 244: aload 0
      // 245: getfield uix.etj Ljn3;
      // 248: invokevirtual jn3.oti ()V
      // 24b: aload 0
      // 24c: getfield uix.d1h Loru;
      // 24f: invokevirtual oru._zc ()V
      // 252: aload 0
      // 253: getfield uix.n7w Loru;
      // 256: invokevirtual oru.ihk ()V
      // 259: aload 0
      // 25a: getfield uix.hfo Ljava/util/List;
      // 25d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 262: astore 10
      // 264: aload 10
      // 266: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 26b: ifeq 29f
      // 26e: aload 10
      // 270: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 275: astore 11
      // 277: aload 11
      // 279: iload 4
      // 27b: ifeq 294
      // 27e: instanceof oru
      // 281: ifeq 29a
      // 284: goto 28b
      // 287: invokestatic uix.a (Loov;)Loov;
      // 28a: athrow
      // 28b: aload 11
      // 28d: goto 294
      // 290: invokestatic uix.a (Loov;)Loov;
      // 293: athrow
      // 294: checkcast oru
      // 297: invokevirtual oru.ihk ()V
      // 29a: iload 4
      // 29c: ifne 264
      // 29f: return
   }

   public jn3 q5g() {
      return this.etj;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6427107308594489270L, -3011589980367752194L, MethodHandles.lookup().lookupClass()).a(264016911994362L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 59325266506476L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "÷\u0010\u00873\u001b·Òf&\u008ap9Òªþ\u00ad\u0018w\u007f´\u008fé\u008bS,è\u009cÉ\n=×Aàù\u0083É\u0087$\u0092\u001f¼\u0010°+\u009cá\u000bZÓö\u0080õtßÏ4BI\u0010~Ú»6øÝ}-6u\u0089VT Dñ\u0010\u009eãK'?<Ð'\u008dÉº±\u0091Q8I";
      int var8 = "÷\u0010\u00873\u001b·Òf&\u008ap9Òªþ\u00ad\u0018w\u007f´\u008fé\u008bS,è\u009cÉ\n=×Aàù\u0083É\u0087$\u0092\u001f¼\u0010°+\u009cá\u000bZÓö\u0080õtßÏ4BI\u0010~Ú»6øÝ}-6u\u0089VT Dñ\u0010\u009eãK'?<Ð'\u008dÉº±\u0091Q8I"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[7];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "»`±bÎç\u000f\u009f\u0083\u0095dC\u008e±\u0087ë $ü\u000ezv R-w¯ñ»\u0001\u008eYMú¶ÙÛ§\u000fÚe'\u00824°\u008eJ\u0088Ü";
                  var8 = "»`±bÎç\u000f\u009f\u0083\u0095dC\u008e±\u0087ë $ü\u000ezv R-w¯ñ»\u0001\u008eYMú¶ÙÛ§\u000fÚe'\u00824°\u008eJ\u0088Ü".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7947;
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
            throw new RuntimeException("uix", var10);
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
         throw new RuntimeException("uix" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
