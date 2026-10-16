import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum rv2$nlt$dj6 {
   public static final rv2$nlt$dj6 sh3;
   public static final rv2$nlt$dj6 hcp;
   private final String sus;
   private static final rv2$nlt$dj6[] bl1;

   private rv2$nlt$dj6(String var3) {
      this.sus = var3;
   }

   public static rv2$nlt$dj6 r0k(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic rv2$nlt$dj6.values ()[Lrv2$nlt$dj6;
      // 03: astore 2
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: istore 1
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: iload 4
      // 10: iload 3
      // 11: if_icmpge 3f
      // 14: aload 2
      // 15: iload 4
      // 17: aaload
      // 18: astore 5
      // 1a: iload 1
      // 1b: ifeq 3b
      // 1e: aload 5
      // 20: getfield rv2$nlt$dj6.sus Ljava/lang/String;
      // 23: aload 0
      // 24: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27: ifeq 38
      // 2a: goto 31
      // 2d: invokestatic rv2$nlt$dj6.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 5
      // 33: areturn
      // 34: invokestatic rv2$nlt$dj6.a (Loov;)Loov;
      // 37: athrow
      // 38: iinc 4 1
      // 3b: iload 1
      // 3c: ifne 0e
      // 3f: aconst_null
      // 40: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6242248727487697383L, -3423419851869612000L, MethodHandles.lookup().lookupClass()).a(171346005056321L);
      // $VF: monitorexit
      long var10 = var10000 ^ 90075081428271L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "í0¹©jÔê#\u0010\u0015Úé®D03¶êji\u0004StÙV";
      int var7 = "í0¹©jÔê#\u0010\u0015Úé®D03¶êji\u0004StÙV".length();
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
                     sh3 = new rv2$nlt$dj6(var8[0]);
                     hcp = new rv2$nlt$dj6(var8[3]);
                     bl1 = new rv2$nlt$dj6[]{sh3, hcp};
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

                  var5 = "¦\u0091\u0092³\u0094;\u009d\u0010\b§!»\u0080dÒèä";
                  var7 = "¦\u0091\u0092³\u0094;\u009d\u0010\b§!»\u0080dÒèä".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
}
