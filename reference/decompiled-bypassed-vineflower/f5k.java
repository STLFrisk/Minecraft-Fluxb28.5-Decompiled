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

public class f5k extends ar7 {
   public static cn7 d1m;
   public static cn7 q0s;
   public static cn7 rzn;
   public static cn7 pje;
   public static cn7 dwu;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public f5k() {
      long var1 = a ^ 100580540628820L;
      super(b<"g">(14914, 4230809749917936680L ^ var1), _aj.sxc, false, new j1s[0]);
   }

   @jev
   public void kji(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: pop
      // 02: invokestatic t9d.c ()I
      // 05: getstatic f5k.ek1 Lc05;
      // 08: getfield c05.tij Lkh3;
      // 0b: getfield kh3.guf Ljava/util/List;
      // 0e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 13: astore 3
      // 14: istore 2
      // 15: aload 3
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 6f
      // 1e: aload 3
      // 1f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 24: astore 4
      // 26: aload 4
      // 28: instanceof nvf
      // 2b: iload 2
      // 2c: ifne 54
      // 2f: ifeq 6b
      // 32: goto 39
      // 35: invokestatic f5k.a (Loov;)Loov;
      // 38: athrow
      // 39: getstatic f5k.d1m Lcn7;
      // 3c: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 3f: iload 2
      // 40: ifne 59
      // 43: goto 4a
      // 46: invokestatic f5k.a (Loov;)Loov;
      // 49: athrow
      // 4a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4d: goto 54
      // 50: invokestatic f5k.a (Loov;)Loov;
      // 53: athrow
      // 54: ifeq 6b
      // 57: aload 4
      // 59: checkcast nvf
      // 5c: astore 5
      // 5e: aload 0
      // 5f: pop
      // 60: getstatic f5k.ek1 Lc05;
      // 63: getfield c05.tij Lkh3;
      // 66: aload 5
      // 68: invokevirtual kh3.rqa (Li2h;)V
      // 6b: iload 2
      // 6c: ifeq 15
      // 6f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4401691319304048993L, 2904919364761180701L, MethodHandles.lookup().lookupClass()).a(58001628484240L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 94597515306052L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "_Á_aðusq\u000f\u009f_Ë\u0000åî,\u0010å\u0086\u008ejÿæv\r\u0001lh)°7D\u0003 \u000eµï|l\u0098\u000bX\r¹£´ð¢\u008e8±\u0095©Î/-\u0099K\u0099éâMuO\u0099\u0089\u0018\u0084x±ÂY@¶\u0098t;>Ù%@Ä¯\u0014¢\u009c±¤àãñ c[/v\u001eYÿiw\u001b%²ÉµÏºç¯\t*Â¨\u0099¤\fhÃX3&¸\u009a";
      int var6 = "_Á_aðusq\u000f\u009f_Ë\u0000åî,\u0010å\u0086\u008ejÿæv\r\u0001lh)°7D\u0003 \u000eµï|l\u0098\u000bX\r¹£´ð¢\u008e8±\u0095©Î/-\u0099K\u0099éâMuO\u0099\u0089\u0018\u0084x±ÂY@¶\u0098t;>Ù%@Ä¯\u0014¢\u009c±¤àãñ c[/v\u001eYÿiw\u001b%²ÉµÏºç¯\t*Â¨\u0099¤\fhÃX3&¸\u009a"
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
                     g = new String[7];
                     d1m = new cn7(b<"g">(19220, 3905236506061211243L ^ var9), b<"g">(29253, 8108519617653423931L ^ var9), false);
                     q0s = new cn7(b<"g">(14914, 4230804737826551608L ^ var9), b<"g">(301, 9108848878143294544L ^ var9), true);
                     rzn = new cn7(b<"g">(14914, 4230804737826551608L ^ var9), b<"g">(11194, 4578996943718540995L ^ var9), true);
                     pje = new cn7(b<"g">(14914, 4230804737826551608L ^ var9), b<"g">(16061, 2681864134195868609L ^ var9), false);
                     dwu = new cn7(b<"g">(14914, 4230804737826551608L ^ var9), b<"g">(4996, 2296706974652423932L ^ var9), false);
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

                  var4 = "Ó0üûzæÈâ´^alå\u0097x5 ï\u0097æäÈ\u0013\u009dt\u0083ÓJMÔi\nÆð¼dy\u007f\u001cÑJÃ\u001eZÜ}ÿz<";
                  var6 = "Ó0üûzæÈâ´^alå\u0097x5 ï\u0097æäÈ\u0013\u009dt\u0083ÓJMÔi\nÆð¼dy\u007f\u001cÑJÃ\u001eZÜ}ÿz<".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23540;
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
            throw new RuntimeException("f5k", var10);
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
         throw new RuntimeException("f5k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
