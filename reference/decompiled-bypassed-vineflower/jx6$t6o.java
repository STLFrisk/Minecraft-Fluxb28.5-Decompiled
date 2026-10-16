import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum jx6$t6o implements v4k {
   public static final jx6$t6o u3y;
   public static final jx6$t6o ad3;
   public static final jx6$t6o hoh;
   public static final jx6$t6o x_l;
   public static final jx6$t6o f86;
   public static final jx6$t6o asn;
   public static final jx6$t6o lib;
   public static final jx6$t6o jd_;
   public static final jx6$t6o wia;
   public static final jx6$t6o sm7;
   public static final jx6$t6o vo8;
   public static final jx6$t6o ize;
   public static final jx6$t6o kn6;
   private static final jx6$t6o[] i00;
   private final int wcw;
   private final String i8o;
   private static final jx6$t6o[] t3r;

   private jx6$t6o(int var3, String var4) {
      this.wcw = var3;
      this.i8o = var4;
   }

   public int ovk() {
      return this.wcw;
   }

   @Override
   public String toString() {
      return this.i8o;
   }

   public static jx6$t6o ycn(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic jx6$t6o.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifeq 35
      // 18: goto 1f
      // 1b: invokestatic jx6$t6o.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic jx6$t6o.i00 [Ljx6$t6o;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic jx6$t6o.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic jx6$t6o.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic jx6$t6o.i00 [Ljx6$t6o;
      // 39: iload 0
      // 3a: aaload
      // 3b: astore 2
      // 3c: aload 2
      // 3d: iload 1
      // 3e: ifeq 57
      // 41: ifnonnull 5a
      // 44: goto 4b
      // 47: invokestatic jx6$t6o.a (Loov;)Loov;
      // 4a: athrow
      // 4b: getstatic jx6$t6o.i00 [Ljx6$t6o;
      // 4e: bipush 0
      // 4f: aaload
      // 50: goto 57
      // 53: invokestatic jx6$t6o.a (Loov;)Loov;
      // 56: athrow
      // 57: goto 5b
      // 5a: aload 2
      // 5b: areturn
   }

   @Override
   public String mo3() {
      return this.i8o;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5716419059308000884L, 7107135363414393018L, MethodHandles.lookup().lookupClass()).a(33683140868339L);
      // $VF: monitorexit
      long var10 = var10000 ^ 9371923406201L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[26];
      int var6 = 0;
      String var5 = "\u001dð])\u008fç´¿\u0010bUü\"î\t1Ùã\u009a\u0098º,{($\b\u0095p±>u\u0099¤2\b1HñcHM\u001a\u0005\b\u0007õ\u0007-Õ\u0010¸î\bÆ\u0004¤¢\"#\u0012ò\u0010ÒÞN2s¢@à7ÇâÔÆ\u0095\u009fó\bn\f>¦oÍ.\u008f\bÖü±\u001fÿ*\u001eõ\u0010X3Vç)'x>\u0006\"É\u0005òR¦Ú\u0010\u0088-6I¾GDøF\u0010v\u0082/Äõæ\u0010n¢Äà¾âáÛr?L\u0099\u0013-ô°\bÚÎ\u0001\bNcß\u000f\bÑ<É*AÙ\u009dM\bAÑÔ\u0017=ãË\u001c\u0010\u0000D\u0001/ÌBà\u0099-7\u008fü*ZóW\u0010w\u00adÞnÇG\u009c\u0094Ö7]ûHöÌô\u0010Ô\u009bzØ|\u000fy\u0086²Ú{¯´-(*\b\u0083\u0093ßtØÖdl\u0010Ê\u0017ÍD.&\u001f(\u009b§\u009bät?\u0002Ø\u0010QÓVß\u007fß\u0095Þ´±¨þöLIÂ\b\u0002F\u0090\u00adB#V\u008c\u0010ÁàZIiå\u0095e\u001dÚÜ\u0004i\u00013Í\u0010¯æ&B¹L\u0011¬|'?&àm\u0095{";
      int var7 = "\u001dð])\u008fç´¿\u0010bUü\"î\t1Ùã\u009a\u0098º,{($\b\u0095p±>u\u0099¤2\b1HñcHM\u001a\u0005\b\u0007õ\u0007-Õ\u0010¸î\bÆ\u0004¤¢\"#\u0012ò\u0010ÒÞN2s¢@à7ÇâÔÆ\u0095\u009fó\bn\f>¦oÍ.\u008f\bÖü±\u001fÿ*\u001eõ\u0010X3Vç)'x>\u0006\"É\u0005òR¦Ú\u0010\u0088-6I¾GDøF\u0010v\u0082/Äõæ\u0010n¢Äà¾âáÛr?L\u0099\u0013-ô°\bÚÎ\u0001\bNcß\u000f\bÑ<É*AÙ\u009dM\bAÑÔ\u0017=ãË\u001c\u0010\u0000D\u0001/ÌBà\u0099-7\u008fü*ZóW\u0010w\u00adÞnÇG\u009c\u0094Ö7]ûHöÌô\u0010Ô\u009bzØ|\u000fy\u0086²Ú{¯´-(*\b\u0083\u0093ßtØÖdl\u0010Ê\u0017ÍD.&\u001f(\u009b§\u009bät?\u0002Ø\u0010QÓVß\u007fß\u0095Þ´±¨þöLIÂ\b\u0002F\u0090\u00adB#V\u008c\u0010ÁàZIiå\u0095e\u001dÚÜ\u0004i\u00013Í\u0010¯æ&B¹L\u0011¬|'?&àm\u0095{"
         .length();
      char var4 = '\b';
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
                     u3y = new jx6$t6o(1, var8[17]);
                     ad3 = new jx6$t6o(2, var8[13]);
                     hoh = new jx6$t6o(3, var8[16]);
                     x_l = new jx6$t6o(4, var8[18]);
                     f86 = new jx6$t6o(5, var8[7]);
                     asn = new jx6$t6o(6, var8[8]);
                     lib = new jx6$t6o(7, var8[1]);
                     jd_ = new jx6$t6o(8, var8[2]);
                     wia = new jx6$t6o(9, var8[10]);
                     sm7 = new jx6$t6o(10, var8[14]);
                     vo8 = new jx6$t6o(0, var8[19]);
                     ize = new jx6$t6o(14, var8[11]);
                     kn6 = new jx6$t6o(15, var8[6]);
                     t3r = new jx6$t6o[]{u3y, ad3, hoh, x_l, f86, asn, lib, jd_, wia, sm7, vo8, ize, kn6};
                     i00 = new jx6$t6o[16];

                     for (jx6$t6o var15 : values()) {
                        i00[var15.ovk()] = var15;
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

                  var5 = "\u0096\u000b\u0017^ê1A\u0005ø\u008a\u0097m¦I\u0006Ì\u0010C\u000bAÔß]¹ÙÙ¦é)\u00ad/¥\u0005";
                  var7 = "\u0096\u000b\u0017^ê1A\u0005ø\u008a\u0097m¦I\u0006Ì\u0010C\u000bAÔß]¹ÙÙ¦é)\u00ad/¥\u0005".length();
                  var4 = 16;
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
