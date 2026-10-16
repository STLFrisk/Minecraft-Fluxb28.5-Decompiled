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

public class da9 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 105910375649531L;
      return b<"j">(15199, 6464891485760022555L ^ var1);
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 121691150142589L;
      return b<"j">(26266, 6251714608092375386L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic da9.a J
      // 003: ldc2_w 110297236399550
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic vr1._0v ()Lvr1;
      // 00b: astore 6
      // 00d: invokestatic t9d.b ()I
      // 010: aload 1
      // 011: new hsu
      // 014: dup
      // 015: sipush 17521
      // 018: ldc2_w 450278609399898743
      // 01b: lload 3
      // 01c: lxor
      // 01d: invokedynamic j (IJ)Ljava/lang/String; bsm=da9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: nop
      // 023: bipush 0
      // 024: anewarray 36
      // 027: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02a: invokeinterface e7r.a0d (Lekw;)V 2
      // 02f: istore 5
      // 031: aload 6
      // 033: invokevirtual vr1.wh3 ()Lwlx;
      // 036: iload 5
      // 038: ifeq 051
      // 03b: ifnull 054
      // 03e: goto 045
      // 041: invokestatic da9.a (Ld3f;)Ld3f;
      // 044: athrow
      // 045: aload 6
      // 047: invokevirtual vr1.wh3 ()Lwlx;
      // 04a: goto 051
      // 04d: invokestatic da9.a (Ld3f;)Ld3f;
      // 050: athrow
      // 051: invokevirtual wlx.b8x ()V
      // 054: bipush 0
      // 055: istore 7
      // 057: iload 7
      // 059: aload 6
      // 05b: getfield vr1.p_y [Ldug;
      // 05e: arraylength
      // 05f: if_icmpge 0bc
      // 062: aload 6
      // 064: getfield vr1.p_y [Ldug;
      // 067: iload 7
      // 069: aaload
      // 06a: iload 5
      // 06c: ifeq 13f
      // 06f: iload 5
      // 071: ifeq 094
      // 074: goto 07b
      // 077: invokestatic da9.a (Ld3f;)Ld3f;
      // 07a: athrow
      // 07b: ifnull 0b4
      // 07e: goto 085
      // 081: invokestatic da9.a (Ld3f;)Ld3f;
      // 084: athrow
      // 085: aload 6
      // 087: getfield vr1.p_y [Ldug;
      // 08a: iload 7
      // 08c: aaload
      // 08d: goto 094
      // 090: invokestatic da9.a (Ld3f;)Ld3f;
      // 093: athrow
      // 094: astore 8
      // 096: aload 8
      // 098: getfield dug.b4a Z
      // 09b: istore 9
      // 09d: aload 8
      // 09f: bipush 0
      // 0a0: putfield dug.b4a Z
      // 0a3: aload 8
      // 0a5: bipush 1
      // 0a6: aconst_null
      // 0a7: checkcast sw6
      // 0aa: invokevirtual dug.w3w (ZLsw6;)V
      // 0ad: aload 8
      // 0af: iload 9
      // 0b1: putfield dug.b4a Z
      // 0b4: iinc 7 1
      // 0b7: iload 5
      // 0b9: ifne 057
      // 0bc: aload 2
      // 0bd: arraylength
      // 0be: iload 5
      // 0c0: ifeq 0e8
      // 0c3: ifle 19f
      // 0c6: goto 0cd
      // 0c9: invokestatic da9.a (Ld3f;)Ld3f;
      // 0cc: athrow
      // 0cd: sipush 25365
      // 0d0: ldc2_w 7033517728573900049
      // 0d3: lload 3
      // 0d4: lxor
      // 0d5: invokedynamic j (IJ)Ljava/lang/String; bsm=da9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: nop
      // 0db: aload 2
      // 0dc: bipush 0
      // 0dd: aaload
      // 0de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e1: goto 0e8
      // 0e4: invokestatic da9.a (Ld3f;)Ld3f;
      // 0e7: athrow
      // 0e8: iload 5
      // 0ea: ifeq 11e
      // 0ed: ifeq 19f
      // 0f0: goto 0f7
      // 0f3: invokestatic da9.a (Ld3f;)Ld3f;
      // 0f6: athrow
      // 0f7: aload 1
      // 0f8: new hsu
      // 0fb: dup
      // 0fc: sipush 28424
      // 0ff: ldc2_w 2131113706098182413
      // 102: lload 3
      // 103: lxor
      // 104: invokedynamic j (IJ)Ljava/lang/String; bsm=da9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: nop
      // 10a: bipush 0
      // 10b: anewarray 36
      // 10e: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 111: invokeinterface e7r.a0d (Lekw;)V 2
      // 116: bipush 0
      // 117: goto 11e
      // 11a: invokestatic da9.a (Ld3f;)Ld3f;
      // 11d: athrow
      // 11e: istore 7
      // 120: iload 7
      // 122: aload 6
      // 124: getfield vr1.p_y [Ldug;
      // 127: arraylength
      // 128: if_icmpge 180
      // 12b: aload 6
      // 12d: iload 5
      // 12f: ifeq 181
      // 132: getfield vr1.p_y [Ldug;
      // 135: iload 7
      // 137: aaload
      // 138: goto 13f
      // 13b: invokestatic da9.a (Ld3f;)Ld3f;
      // 13e: athrow
      // 13f: iload 5
      // 141: ifeq 15d
      // 144: ifnull 178
      // 147: goto 14e
      // 14a: invokestatic da9.a (Ld3f;)Ld3f;
      // 14d: athrow
      // 14e: aload 6
      // 150: getfield vr1.p_y [Ldug;
      // 153: iload 7
      // 155: aaload
      // 156: goto 15d
      // 159: invokestatic da9.a (Ld3f;)Ld3f;
      // 15c: athrow
      // 15d: astore 8
      // 15f: aload 8
      // 161: getfield dug.b4a Z
      // 164: istore 9
      // 166: aload 8
      // 168: bipush 0
      // 169: putfield dug.b4a Z
      // 16c: aload 8
      // 16e: invokevirtual dug.bt7 ()V
      // 171: aload 8
      // 173: iload 9
      // 175: putfield dug.b4a Z
      // 178: iinc 7 1
      // 17b: iload 5
      // 17d: ifne 120
      // 180: aload 1
      // 181: new hsu
      // 184: dup
      // 185: sipush 23585
      // 188: ldc2_w 8550487920576690726
      // 18b: lload 3
      // 18c: lxor
      // 18d: invokedynamic j (IJ)Ljava/lang/String; bsm=da9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: nop
      // 193: bipush 0
      // 194: anewarray 36
      // 197: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 19a: invokeinterface e7r.a0d (Lekw;)V 2
      // 19f: goto 1c4
      // 1a2: astore 7
      // 1a4: aload 1
      // 1a5: aload 0
      // 1a6: sipush 31974
      // 1a9: ldc2_w 933943580003490532
      // 1ac: lload 3
      // 1ad: lxor
      // 1ae: invokedynamic j (IJ)Ljava/lang/String; bsm=da9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: nop
      // 1b4: bipush 1
      // 1b5: anewarray 36
      // 1b8: dup
      // 1b9: bipush 0
      // 1ba: aload 7
      // 1bc: invokevirtual d3f.getMessage ()Ljava/lang/String;
      // 1bf: aastore
      // 1c0: invokestatic da9.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1c3: return
      // 1c4: aload 1
      // 1c5: aload 0
      // 1c6: sipush 26959
      // 1c9: ldc2_w 8267981082418073423
      // 1cc: lload 3
      // 1cd: lxor
      // 1ce: invokedynamic j (IJ)Ljava/lang/String; bsm=da9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: nop
      // 1d4: bipush 0
      // 1d5: anewarray 36
      // 1d8: invokestatic da9.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1db: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6954547087601975451L, 6370488362357072351L, MethodHandles.lookup().lookupClass()).a(201924320339705L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 1175510611502L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "#&\u0089Â\u0093³Ð]\u001fLj\u00931\u0097o\u0003\u008e<j `\u0017a\u009f= 4-\u0001Ï\u0017Æ!C øË/uN(¡\u00adÿÂ9\u000b¿ia\b°\u0013{Áw\u0082SÒf§ò }$\u0095@4\u0000î\u001e®l\u009b%\u0089Ê\u009a¼a¡(MûiÍt\u008b¢\u0099}½¥ç\u001dù\u009bq8\u00ad\u008eíÛjÙC\u0012®\u00198üwòDÆ\u0010Cy\u009cER×\u0018Nè\u008cÆMrâo\u001b\u008c\u001bF[q\u008b×§Wv4uð\u0094|(c¼+\u0087Kv;\u0001I*\u001e}\u0091\u0083QhÁ÷=iÐ\r«\u0090¹¼\u0000(\u009bï¡Þö\u0006\u0099\u0099x)fm(D\u0093£l\u000bóýÓõ*mßS\u009cü¿\u009b\u0017\u0002(\u0083\u001eß\u008f\u0082¸(\u0096÷ø¿\u0013\u0087\u0006{8ï»þ\u0005";
      int var8 = "#&\u0089Â\u0093³Ð]\u001fLj\u00931\u0097o\u0003\u008e<j `\u0017a\u009f= 4-\u0001Ï\u0017Æ!C øË/uN(¡\u00adÿÂ9\u000b¿ia\b°\u0013{Áw\u0082SÒf§ò }$\u0095@4\u0000î\u001e®l\u009b%\u0089Ê\u009a¼a¡(MûiÍt\u008b¢\u0099}½¥ç\u001dù\u009bq8\u00ad\u008eíÛjÙC\u0012®\u00198üwòDÆ\u0010Cy\u009cER×\u0018Nè\u008cÆMrâo\u001b\u008c\u001bF[q\u008b×§Wv4uð\u0094|(c¼+\u0087Kv;\u0001I*\u001e}\u0091\u0083QhÁ÷=iÐ\r«\u0090¹¼\u0000(\u009bï¡Þö\u0006\u0099\u0099x)fm(D\u0093£l\u000bóýÓõ*mßS\u009cü¿\u009b\u0017\u0002(\u0083\u001eß\u008f\u0082¸(\u0096÷ø¿\u0013\u0087\u0006{8ï»þ\u0005"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[8];
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

                  var6 = "ô-Çb\u0092·j\t_+ð4ønf 8ò-RC·\u0086\u00adÅÅ04)\u0086j\u001cA¨T¶ÎMÞ\u0010§\u008a×ñ%\u008d÷ïqÎ\u0088rJ\u001bøPg\u000e/ðê_Eù\u0000\u0089ÆÆÕR\u0007Ç\u0012";
                  var8 = "ô-Çb\u0092·j\t_+ð4ønf 8ò-RC·\u0086\u00adÅÅ04)\u0086j\u001cA¨T¶ÎMÞ\u0010§\u008a×ñ%\u008d÷ïqÎ\u0088rJ\u001bøPg\u000e/ðê_Eù\u0000\u0089ÆÆÕR\u0007Ç\u0012"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static d3f a(d3f var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2652;
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
            throw new RuntimeException("da9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("da9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
