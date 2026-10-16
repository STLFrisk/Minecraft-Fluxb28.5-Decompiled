import io.netty.util.internal.ThreadLocalRandom;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.Validate;

public class xk5 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public xk5(String var1, double var2, int var4) {
      this(fe6._g4(ThreadLocalRandom.current()), var1, var2, var4);
   }

   public xk5(UUID var1, String var2, double var3, int var5) {
      long var6 = a ^ 56486790178480L;
      super();
      this.pfc = true;
      this.m98 = var1;
      this.qw4 = var2;
      this.fjx = var3;
      this.h60 = var5;
      Validate.notEmpty(var2, a<"b">(19015, 4635832851037117347L ^ var6), new Object[0]);
      Validate.inclusiveBetween(0L, 2L, (long)var5, a<"b">(29554, 4838048687338054291L ^ var6));
   }

   public UUID gac() {
      return this.m98;
   }

   public String jhj() {
      return this.qw4;
   }

   public int zdp() {
      return this.h60;
   }

   public double _2u() {
      return this.fjx;
   }

   public boolean aik() {
      return this.pfc;
   }

   public xk5 d2_(boolean var1) {
      this.pfc = var1;
      return this;
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic xk5.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic xk5.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull 8e
      // 1e: aload 0
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: iload 2
      // 23: ifne 43
      // 26: goto 2d
      // 29: invokestatic xk5.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpne 8e
      // 34: goto 3b
      // 37: invokestatic xk5.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: goto 43
      // 3f: invokestatic xk5.a (Loov;)Loov;
      // 42: athrow
      // 43: checkcast xk5
      // 46: astore 3
      // 47: aload 0
      // 48: getfield xk5.m98 Ljava/util/UUID;
      // 4b: iload 2
      // 4c: ifne 83
      // 4f: ifnull 7f
      // 52: goto 59
      // 55: invokestatic xk5.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield xk5.m98 Ljava/util/UUID;
      // 5d: aload 3
      // 5e: getfield xk5.m98 Ljava/util/UUID;
      // 61: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 64: iload 2
      // 65: ifne 8d
      // 68: goto 6f
      // 6b: invokestatic xk5.a (Loov;)Loov;
      // 6e: athrow
      // 6f: ifne 8c
      // 72: goto 79
      // 75: invokestatic xk5.a (Loov;)Loov;
      // 78: athrow
      // 79: bipush 0
      // 7a: ireturn
      // 7b: invokestatic xk5.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 3
      // 80: getfield xk5.m98 Ljava/util/UUID;
      // 83: ifnull 8c
      // 86: bipush 0
      // 87: ireturn
      // 88: invokestatic xk5.a (Loov;)Loov;
      // 8b: athrow
      // 8c: bipush 1
      // 8d: ireturn
      // 8e: bipush 0
      // 8f: ireturn
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield xk5.m98 Ljava/util/UUID;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 27
      // 0f: goto 16
      // 12: invokestatic xk5.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield xk5.m98 Ljava/util/UUID;
      // 1a: goto 21
      // 1d: invokestatic xk5.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/util/UUID.hashCode ()I
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 19045604235885L;
      return a<"b">(24298, 954671044342739920L ^ var1)
         + this.fjx
         + a<"b">(27281, 8807388786210391980L ^ var1)
         + this.h60
         + a<"b">(32201, 5372573155458601207L ^ var1)
         + this.qw4
         + '\''
         + a<"b">(11112, 9147451836757542483L ^ var1)
         + this.m98
         + a<"b">(23060, 8829842245512754987L ^ var1)
         + this.pfc
         + '}';
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6543535604623127832L, -579514703797676012L, MethodHandles.lookup().lookupClass()).a(281360994489769L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 88003103277725L;
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
      String var6 = "Rû[\u001a\\\u001a£fÊ°\u0082´\u0094U*±Òâö,¯JÆ4êÔÇpÞ2æû \u001e®ó\u00056\u000fõ=gn2DV\u009a\u001f*4\u009bÁ\u0096[É(£\u00947NÄ\u000b\u0010ûé j\u001fÜÛ+\u0092uHrd«}Ä\u0005GÐÐ\u008f\u0002\u00ad\"\u007f\u009aí¹\u009a¤Ñ\u0019c·\u0082(É\u009b\u000ekHw\u0099\\mÊzxä\u008a´\u0002pù,ójÈ\u000f<3L\u0084\u00921×\u001bE± ý¢Ð}\u0099\u0084\u0010;\u008cAæç\u0088-[/·Oþ\u007f\u0093Þ·";
      int var8 = "Rû[\u001a\\\u001a£fÊ°\u0082´\u0094U*±Òâö,¯JÆ4êÔÇpÞ2æû \u001e®ó\u00056\u000fõ=gn2DV\u009a\u001f*4\u009bÁ\u0096[É(£\u00947NÄ\u000b\u0010ûé j\u001fÜÛ+\u0092uHrd«}Ä\u0005GÐÐ\u008f\u0002\u00ad\"\u007f\u009aí¹\u009a¤Ñ\u0019c·\u0082(É\u009b\u000ekHw\u0099\\mÊzxä\u008a´\u0002pù,ójÈ\u000f<3L\u0084\u00921×\u001bE± ý¢Ð}\u0099\u0084\u0010;\u008cAæç\u0088-[/·Oþ\u007f\u0093Þ·"
         .length();
      char var5 = ' ';
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

                  var6 = "¸ìÚÝ3\u0089M8õjó\u0097fw}\"\u0086Ò«}0Å%Å±\u0080øÇYnT\u0019B\u0012\u008f\u009c\u008e¨\u0014G\u009b¼1\\\u0097Ò\b0ìo Ø.ô.b0\u0086ø\u0094ßÕÿ°t\u0081ç\u0006¡ñ¦\u0010væ\u001c(Å=\u008e \u0016\u000bàå²¿\u007ftL\u001d\u00948ÈÆ\u0099\u008dß\u000f#\u0085\u009e¼ ã¾";
                  var8 = "¸ìÚÝ3\u0089M8õjó\u0097fw}\"\u0086Ò«}0Å%Å±\u0080øÇYnT\u0019B\u0012\u008f\u009c\u008e¨\u0014G\u009b¼1\\\u0097Ò\b0ìo Ø.ô.b0\u0086ø\u0094ßÕÿ°t\u0081ç\u0006¡ñ¦\u0010væ\u001c(Å=\u008e \u0016\u000bàå²¿\u007ftL\u001d\u00948ÈÆ\u0099\u008dß\u000f#\u0085\u009e¼ ã¾"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20949;
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
            throw new RuntimeException("xk5", var10);
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
         throw new RuntimeException("xk5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
