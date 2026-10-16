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

public class aih$vir extends zfj$yuc {
   private final bdo cl0;
   private final String g_c;
   public final aih pj9;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public aih$vir(aih var1, bdo var2) {
      long var3 = a ^ 41612228115789L;
      this(
         var1,
         var2.b__(a<"b">(25758, 8796801360774735481L ^ var3)),
         var2.u14(a<"b">(20763, 4919758811089015806L ^ var3)),
         var2.uz7(a<"b">(16094, 4738344603543534652L ^ var3))
      );
   }

   public aih$vir(aih var1, bdo var2, String var3) {
      this(var1, var2, var3, 1);
   }

   private aih$vir(aih param1, bdo param2, String param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic aih$vir.a J
      // 03: ldc2_w 108098645445579
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic t9d.b ()I
      // 0c: istore 7
      // 0e: aload 0
      // 0f: aload 1
      // 10: putfield aih$vir.pj9 Laih;
      // 13: aload 0
      // 14: iload 4
      // 16: invokespecial zfj$yuc.<init> (I)V
      // 19: iload 7
      // 1b: ifeq 84
      // 1e: aload 3
      // 1f: sipush 10229
      // 22: ldc2_w 2438738093805441943
      // 25: lload 5
      // 27: lxor
      // 28: invokedynamic b (IJ)Ljava/lang/String; bsm=aih$vir.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: nop
      // 2e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 31: ifeq 7a
      // 34: aload 2
      // 35: iload 7
      // 37: ifeq 4c
      // 3a: goto 41
      // 3d: invokestatic aih$vir.a (Loov;)Loov;
      // 40: athrow
      // 41: ifnull 6a
      // 44: goto 4b
      // 47: invokestatic aih$vir.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 2
      // 4c: sipush 27280
      // 4f: ldc2_w 8129492362983497463
      // 52: lload 5
      // 54: lxor
      // 55: invokedynamic b (IJ)Ljava/lang/String; bsm=aih$vir.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: nop
      // 5b: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 5e: invokestatic _f3$c3d.ja1 (I)L_f3$c3d;
      // 61: invokevirtual _f3$c3d.eob ()Ljava/lang/String;
      // 64: astore 3
      // 65: iload 7
      // 67: ifne 7a
      // 6a: sipush 18685
      // 6d: ldc2_w 921308566409346203
      // 70: lload 5
      // 72: lxor
      // 73: invokedynamic b (IJ)Ljava/lang/String; bsm=aih$vir.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: nop
      // 79: astore 3
      // 7a: aload 0
      // 7b: aload 2
      // 7c: putfield aih$vir.cl0 Lbdo;
      // 7f: aload 0
      // 80: aload 3
      // 81: putfield aih$vir.g_c Ljava/lang/String;
      // 84: return
   }

   public bdo dv9() {
      long var1 = a ^ 97302937368825L;
      bdo var3 = new bdo();
      var3.rzm(a<"b">(2392, 8047550270359440911L ^ var1), this.cl0);
      var3.rjq(a<"b">(20763, 4919623169563186762L ^ var1), this.g_c);
      var3.iin(a<"b">(29890, 6526993903908287376L ^ var1), this.ndz);
      return var3;
   }

   public static String pa8(aih$vir var0) {
      return var0.g_c;
   }

   public static bdo pmp(aih$vir var0) {
      return var0.cl0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2213653017997820416L, -1795331055208520562L, MethodHandles.lookup().lookupClass()).a(208348965873918L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 89457119432017L;
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
      String var6 = "û\u0011\u009e\u0080\u0013\u00ad\u0016\u0011Hlpà\u008eöYÜ²8Ó\u009dxNñ\u008fVb¯dC¦Yõ\u0012`~±Dº\u000f¦\u0010¡Û¤+\u001aSçªûqu\u008f¸\u0002[w\u0010ý¼\u0007ÆÙ\u000e:¾Uå\u001f\u0088·\u008d¿õ\u0018\u0084`ÞHÒH;\u001b\u0000r³\u001fß\u0092Xíf°RÑ(øÀ\u001b \f\u0085¢o\u001cÆN\u0088äg°ûÙ\u0095 Ãõ¨u§5;~ túÓà\u0016\bé\u0019\u0010ç?·@\u0089\u0097x!\u0087 \u009f\t?¶²\u0081";
      int var8 = "û\u0011\u009e\u0080\u0013\u00ad\u0016\u0011Hlpà\u008eöYÜ²8Ó\u009dxNñ\u008fVb¯dC¦Yõ\u0012`~±Dº\u000f¦\u0010¡Û¤+\u001aSçªûqu\u008f¸\u0002[w\u0010ý¼\u0007ÆÙ\u000e:¾Uå\u001f\u0088·\u008d¿õ\u0018\u0084`ÞHÒH;\u001b\u0000r³\u001fß\u0092Xíf°RÑ(øÀ\u001b \f\u0085¢o\u001cÆN\u0088äg°ûÙ\u0095 Ãõ¨u§5;~ túÓà\u0016\bé\u0019\u0010ç?·@\u0089\u0097x!\u0087 \u009f\t?¶²\u0081"
         .length();
      char var5 = '(';
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
                     c = new String[8];
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

                  var6 = "Ã\u0085\b3^«YÛFD\u009eÃ£ió\" ¬\u0003ypî#\u0088À©\u0099Ã\u0005§\u0081\u000b\u0018$Îb<\b),\u008dÎv\u0013\b ©ì¾";
                  var8 = "Ã\u0085\b3^«YÛFD\u009eÃ£ió\" ¬\u0003ypî#\u0088À©\u0099Ã\u0005§\u0081\u000b\u0018$Îb<\b),\u008dÎv\u0013\b ©ì¾".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14502;
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
            throw new RuntimeException("aih$vir", var10);
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
         throw new RuntimeException("aih$vir" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
