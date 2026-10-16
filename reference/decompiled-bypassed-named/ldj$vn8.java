import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ldj$vn8 implements v4k {
   public static final ldj$vn8 abu;
   public static final ldj$vn8 pnm;
   public static final ldj$vn8 h4k;
   public static final ldj$vn8 t7o;
   public static final ldj$vn8 sp9;
   public static final ldj$vn8 mal;
   private static final ldj$vn8[] kx6;
   private final int u67;
   private final String e95;
   private final String t5j;
   private static final ldj$vn8[] ygf;

   private ldj$vn8(int var3, String var4) {
      this(var3, var4, var4);
   }

   private ldj$vn8(int var3, String var4, String var5) {
      this.u67 = var3;
      this.e95 = var4;
      this.t5j = var5;
   }

   public int gp7() {
      return this.u67;
   }

   @Override
   public String toString() {
      return this.e95;
   }

   public static ldj$vn8 voe(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic ldj$vn8.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic ldj$vn8.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic ldj$vn8.kx6 [Lldj$vn8;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic ldj$vn8.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic ldj$vn8.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic ldj$vn8.kx6 [Lldj$vn8;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.e95;
   }

   public String w6k() {
      return this.t5j;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8359469667171450560L, -5460331579353304333L, MethodHandles.lookup().lookupClass()).a(248659632068986L);
      // $VF: monitorexit
      long var10 = var10000 ^ 9837913965259L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[15];
      int var6 = 0;
      String var5 = "¶uXÎÅÝ\u0099u;z°OW\u00932á\b\u00ad©\u0013 bjÁi\b´n#^Xð\u0010¶\u0010nq±§º^\u000eÖ\u0094Î+äë ¬<\u0010\u0090ÅþÒ1\u008a\u008b\u009dû\u0018b\u000e§alÝ\b\u009eFæVPXµ\u0002\u0010¼î³yPÅ-*¡äØ%ËFY\u000b\bÒþ+wr4(\u0013\bçæ D\u008a\u001f\u0091\f\bMc¬ö\u0096î\u0089ó\bÅª\r¿\b\u009dïè\u0010iB'ê\u0003k\u0010Ã`|\bZGa=Â\bvzûÿ\u009d\u0081í2";
      int var7 = "¶uXÎÅÝ\u0099u;z°OW\u00932á\b\u00ad©\u0013 bjÁi\b´n#^Xð\u0010¶\u0010nq±§º^\u000eÖ\u0094Î+äë ¬<\u0010\u0090ÅþÒ1\u008a\u008b\u009dû\u0018b\u000e§alÝ\b\u009eFæVPXµ\u0002\u0010¼î³yPÅ-*¡äØ%ËFY\u000b\bÒþ+wr4(\u0013\bçæ D\u008a\u001f\u0091\f\bMc¬ö\u0096î\u0089ó\bÅª\r¿\b\u009dïè\u0010iB'ê\u0003k\u0010Ã`|\bZGa=Â\bvzûÿ\u009d\u0081í2"
         .length();
      char var4 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var5.substring(++var17, var17 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var25;
                  if ((var17 += var4) >= var7) {
                     abu = new ldj$vn8(0, var8[3]);
                     pnm = new ldj$vn8(1, var8[12]);
                     h4k = new ldj$vn8(2, var8[6], var8[9]);
                     t7o = new ldj$vn8(3, var8[11], var8[5]);
                     sp9 = new ldj$vn8(4, var8[0], var8[10]);
                     mal = new ldj$vn8(5, var8[13]);
                     ygf = new ldj$vn8[]{abu, pnm, h4k, t7o, sp9, mal};
                     kx6 = new ldj$vn8[values().length];

                     for (ldj$vn8 var15 : values()) {
                        kx6[var15.gp7()] = var15;
                     }

                     return;
                  }

                  var4 = var5.charAt(var17);
                  break;
               default:
                  var8[var6++] = var25;
                  if ((var17 += var4) < var7) {
                     var4 = var5.charAt(var17);
                     continue label37;
                  }

                  var5 = "³6\u001cl\u009d\u0085V\u008d\b{a\u001eÛ\t\u008d4¾";
                  var7 = "³6\u001cl\u009d\u0085V\u008d\b{a\u001eÛ\t\u008d4¾".length();
                  var4 = '\b';
                  var17 = -1;
            }

            var19 = var5.substring(++var17, var17 + var4);
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
