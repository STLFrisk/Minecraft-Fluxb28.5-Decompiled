import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pjd extends ar7 {
   public static final String afg;
   public static q6h dkr;
   public static cn7 n5_;
   public static cn7 qq7;
   public static cn7 vvx;
   public static List fv5;
   public static c_3 otq;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public pjd() {
      long var1 = a ^ 66874792584919L;
      super(b<"j">(21764, 8861779017940293529L ^ var1), _aj.y49, otq);
      gjm.add(
         new vb2(
            b<"j">(22305, 7054198466747585973L ^ var1),
            b<"j">(28819, 8530075604030583300L ^ var1),
            b<"j">(18416, 5018368544032900458L ^ var1),
            b<"j">(7783, 7199257339326405886L ^ var1),
            b<"j">(9848, 4927062747360044267L ^ var1),
            b<"j">(17829, 7219065504542607156L ^ var1)
         )
      );
   }

   public static String l4v(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pjd.a J
      // 03: ldc2_w 133479931113346
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: ldc ""
      // 0e: nop
      // 0f: astore 4
      // 11: getstatic pjd.otq Lc_3;
      // 14: sipush 4793
      // 17: ldc2_w 4440179028883069303
      // 1a: lload 1
      // 1b: lxor
      // 1c: invokedynamic j (IJ)Ljava/lang/String; bsm=pjd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: nop
      // 22: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 25: iload 3
      // 26: ifne 4a
      // 29: ifeq 36
      // 2c: goto 33
      // 2f: invokestatic pjd.a (Loov;)Loov;
      // 32: athrow
      // 33: goto 52
      // 36: getstatic pjd.otq Lc_3;
      // 39: sipush 7015
      // 3c: ldc2_w 6581688882773905570
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic j (IJ)Ljava/lang/String; bsm=pjd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 4a: ifeq 52
      // 4d: invokestatic deo.doq ()Ljava/lang/String;
      // 50: astore 4
      // 52: new java/lang/StringBuilder
      // 55: dup
      // 56: invokespecial java/lang/StringBuilder.<init> ()V
      // 59: sipush 6220
      // 5c: ldc2_w 2656691584644731802
      // 5f: lload 1
      // 60: lxor
      // 61: invokedynamic j (IJ)Ljava/lang/String; bsm=pjd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: iload 3
      // 68: ifne 95
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: getstatic pjd.vvx Lcn7;
      // 71: invokevirtual cn7.g7m ()Z
      // 74: ifeq 93
      // 77: goto 7e
      // 7a: invokestatic pjd.a (Loov;)Loov;
      // 7d: athrow
      // 7e: sipush 15359
      // 81: ldc2_w 4729448541772083256
      // 84: lload 1
      // 85: lxor
      // 86: invokedynamic j (IJ)Ljava/lang/String; bsm=pjd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: nop
      // 8c: goto 96
      // 8f: invokestatic pjd.a (Loov;)Loov;
      // 92: athrow
      // 93: ldc ""
      // 95: nop
      // 96: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 99: aload 0
      // 9a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9d: sipush 5767
      // a0: ldc2_w 6469170831516851527
      // a3: lload 1
      // a4: lxor
      // a5: invokedynamic j (IJ)Ljava/lang/String; bsm=pjd.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: nop
      // ab: iload 3
      // ac: ifne e0
      // af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b2: getstatic pjd.n5_ Lcn7;
      // b5: invokevirtual cn7.g7m ()Z
      // b8: ifeq de
      // bb: goto c2
      // be: invokestatic pjd.a (Loov;)Loov;
      // c1: athrow
      // c2: new java/lang/StringBuilder
      // c5: dup
      // c6: invokespecial java/lang/StringBuilder.<init> ()V
      // c9: ldc " "
      // cb: nop
      // cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cf: aload 4
      // d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d7: goto e1
      // da: invokestatic pjd.a (Loov;)Loov;
      // dd: athrow
      // de: ldc ""
      // e0: nop
      // e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // e4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e7: areturn
   }

   public static String z_n() {
      return ((vb2)gjm.get(new Random().nextInt(gjm.size())))._2d();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4961829558771771071L, 1652897206060847844L, MethodHandles.lookup().lookupClass()).a(169191634152122L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 100820297333421L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[19];
      int var5 = 0;
      String var4 = "Æôy\u0016\u0087Ýj\u0095óE\u0096¨F\u0086¡\u0097\u0089þdRSª\u008eo\u009dbi\u0004~\u0097s4\u0010\u0096\u0095üú¬\u0007i0U`\u0083Åü\u0087·Ú X:oÈ\u000b¤V©\u0099\u0004ªÎ\u0018\u008d¶1²\u009f.=d®±åE°¬w\\Ü\u001e\u0087\u0010´Db\u00add)R\u0090\u007fõ{k.{Fæ8y5'\u0089/þ\bSó2ç!õ Ï³\nþ®B$Ývä4\u0084\u0089*]Î[\u0004\u0096\u0012Øëf\u001f\u0091\u009e \u001en@@¬ý\u0018ÿC\u0088\u000b×Ä\u008eõ\u0010ª´½®n÷\u0098ÌZ\u007f\u000e'xÛêí\u0010ìß¿1âQöù LÂ\u0082\u008cc\u008dÉ k\u00ad\u001a\u0083}V§E\u009cNçSµØi«\rÖf_\u0000\u0091\u001dºo\u0007¬ÜÈ®ß\u007f\u0010\u0080ÙG\u009bqrñüÏ.\u001dp9öß¢ \u0013\u0082ænV\u001eÁ_w¢\u0010Ò7<\u0019ÉQ\u0013c©¡e0\u0015Ø\u0098x^\u0097zö:\u0010>@ë\u001b\u0005´EÍ7Oêxp\u0084Ä\u0014\u0010\u0088òöy\u0092ÀL\u0006\f>³Y`\u009c<X n\\ÿ\u0015ó\u001d\u0094øòÐnþãíd\u0081C\u00060Íü¸ÜÝ\u0098\u0091\u0018õ¸öÉT\u0010RN\u0002.ª¼\u0007a¨6§\u000f^?/*\u0010j÷öÖÍ\u0097î1Éø,ú{\"Å\u009b \u0004O%\u0081èº0¨¤q-\u0012\u0080\te°Ò\u0015U\u0012S\u0002¬y~\u0014\u0097<iS\u0014\u008b\u0010\u0084\fç\u0010Ð}/\u001a#®º\u009eO!DM";
      int var6 = "Æôy\u0016\u0087Ýj\u0095óE\u0096¨F\u0086¡\u0097\u0089þdRSª\u008eo\u009dbi\u0004~\u0097s4\u0010\u0096\u0095üú¬\u0007i0U`\u0083Åü\u0087·Ú X:oÈ\u000b¤V©\u0099\u0004ªÎ\u0018\u008d¶1²\u009f.=d®±åE°¬w\\Ü\u001e\u0087\u0010´Db\u00add)R\u0090\u007fõ{k.{Fæ8y5'\u0089/þ\bSó2ç!õ Ï³\nþ®B$Ývä4\u0084\u0089*]Î[\u0004\u0096\u0012Øëf\u001f\u0091\u009e \u001en@@¬ý\u0018ÿC\u0088\u000b×Ä\u008eõ\u0010ª´½®n÷\u0098ÌZ\u007f\u000e'xÛêí\u0010ìß¿1âQöù LÂ\u0082\u008cc\u008dÉ k\u00ad\u001a\u0083}V§E\u009cNçSµØi«\rÖf_\u0000\u0091\u001dºo\u0007¬ÜÈ®ß\u007f\u0010\u0080ÙG\u009bqrñüÏ.\u001dp9öß¢ \u0013\u0082ænV\u001eÁ_w¢\u0010Ò7<\u0019ÉQ\u0013c©¡e0\u0015Ø\u0098x^\u0097zö:\u0010>@ë\u001b\u0005´EÍ7Oêxp\u0084Ä\u0014\u0010\u0088òöy\u0092ÀL\u0006\f>³Y`\u009c<X n\\ÿ\u0015ó\u001d\u0094øòÐnþãíd\u0081C\u00060Íü¸ÜÝ\u0098\u0091\u0018õ¸öÉT\u0010RN\u0002.ª¼\u0007a¨6§\u000f^?/*\u0010j÷öÖÍ\u0097î1Éø,ú{\"Å\u009b \u0004O%\u0081èº0¨¤q-\u0012\u0080\te°Ò\u0015U\u0012S\u0002¬y~\u0014\u0097<iS\u0014\u008b\u0010\u0084\fç\u0010Ð}/\u001a#®º\u009eO!DM"
         .length();
      char var3 = ' ';
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
                     g = new String[19];
                     afg = b<"j">(6636, 864824714014000916L ^ var9);
                     dkr = new q6h();
                     n5_ = new cn7(b<"j">(263, 7119464668072943589L ^ var9), b<"j">(18136, 5892869461745227811L ^ var9), false);
                     qq7 = new cn7(b<"j">(21764, 8861740945097673699L ^ var9), b<"j">(31233, 1416541911758824677L ^ var9), false);
                     vvx = new cn7(b<"j">(21764, 8861740945097673699L ^ var9), b<"j">(1769, 2757011733497026572L ^ var9), true);
                     fv5 = new ArrayList();
                     otq = new c_3(
                        b<"j">(21764, 8861740945097673699L ^ var9),
                        b<"j">(11437, 4131845834131550795L ^ var9),
                        b<"j">(24704, 6460638270137269868L ^ var9),
                        new String[0]
                     );
                     gjm = new ArrayList();
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

                  var4 = "\u0006×þÎñ/Wb|y=§_n$åìªöPª)¯\u0093\u0010`\u009b·mîð`o_UYä.\u0003¡\u000e";
                  var6 = "\u0006×þÎñ/Wb|y=§_n$åìªöPª)¯\u0093\u0010`\u009b·mîð`o_UYä.\u0003¡\u000e".length();
                  var3 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16479;
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
            throw new RuntimeException("pjd", var10);
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
         throw new RuntimeException("pjd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
