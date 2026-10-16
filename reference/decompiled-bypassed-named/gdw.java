import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class gdw {
   public static final String[] msg;

   public abstract void b_8(DataOutput var1);

   public abstract void zwk(DataInput var1, int var2, btc var3);

   @Override
   public abstract String toString();

   public abstract byte ky0();

   public static gdw nt6(byte var0) {
      try {
         switch (var0) {
            case 0:
               return new zv6();
            case 1:
               return new yyt();
            case 2:
               return new wmr();
            case 3:
               return new t5o();
            case 4:
               return new tju();
            case 5:
               return new n8i();
            case 6:
               return new ok6();
            case 7:
               return new cny();
            case 8:
               return new bgg();
            case 9:
               return new qhg();
            case 10:
               return new bdo();
            case 11:
               return new mvq();
            default:
               return null;
         }
      } catch (oov var1) {
         throw b(var1);
      }
   }

   public abstract gdw h33();

   public boolean dq5() {
      return false;
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
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: instanceof gdw
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic gdw.b (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic gdw.b (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast gdw
      // 20: astore 3
      // 21: aload 0
      // 22: invokevirtual gdw.ky0 ()B
      // 25: iload 2
      // 26: ifne 3f
      // 29: aload 3
      // 2a: invokevirtual gdw.ky0 ()B
      // 2d: if_icmpne 42
      // 30: goto 37
      // 33: invokestatic gdw.b (Loov;)Loov;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3f
      // 3b: invokestatic gdw.b (Loov;)Loov;
      // 3e: athrow
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
   }

   @Override
   public int hashCode() {
      return this.ky0();
   }

   public String ocr() {
      return this.toString();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5376882035516947644L, -2326695801311788095L, MethodHandles.lookup().lookupClass()).a(148913291328251L);
      // $VF: monitorexit
      long var10 = var10000 ^ 92674976492398L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[12];
      int var6 = 0;
      String var5 = "i\u008e²vÛÑ\u0084(\b\u009c\u0086gÝ3\u0090\u008cº\bn\u0001·6rDÐ<\b¤â£É\t»1.\bm³Ë\u0083|\u0018ÿ}\b\u008f@\u0002¹\u0001Ô`U\bµUvÈÆÔý\u0017\bí$\u009cºeoò\u0099\b2ttD\u0003æxQ\u0010/?@BÊ\u0018yÙ\tyÛCØÉ:ñ";
      int var7 = "i\u008e²vÛÑ\u0084(\b\u009c\u0086gÝ3\u0090\u008cº\bn\u0001·6rDÐ<\b¤â£É\t»1.\bm³Ë\u0083|\u0018ÿ}\b\u008f@\u0002¹\u0001Ô`U\bµUvÈÆÔý\u0017\bí$\u009cºeoò\u0099\b2ttD\u0003æxQ\u0010/?@BÊ\u0018yÙ\tyÛCØÉ:ñ"
         .length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     msg = new String[]{var8[3], var8[7], var8[6], var8[1], var8[4], var8[11], var8[8], var8[5], var8[10], var8[0], var8[9], var8[2]};
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "1Ôo\u00ad=`\u00867\bÁr¶\u0080³\u0093ÿ\u0001";
                  var7 = "1Ôo\u00ad=`\u00867\bÁr¶\u0080³\u0093ÿ\u0001".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
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
}
