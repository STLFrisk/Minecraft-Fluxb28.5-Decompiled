import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum rh2$j7i implements v4k {
   public static final rh2$j7i w_6;
   public static final rh2$j7i jd3;
   public static final rh2$j7i hqk;
   private static final rh2$j7i[] x6y;
   private final int od8;
   private final String bl8;
   private static final rh2$j7i[] fq8;

   private rh2$j7i(int var3, String var4) {
      this.od8 = var3;
      this.bl8 = var4;
   }

   public int sqd() {
      return this.od8;
   }

   @Override
   public String toString() {
      return this.bl8;
   }

   public static rh2$j7i xdi(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic rh2$j7i.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic rh2$j7i.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic rh2$j7i.x6y [Lrh2$j7i;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic rh2$j7i.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic rh2$j7i.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic rh2$j7i.x6y [Lrh2$j7i;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.bl8;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3098401313343919552L, -1248500279428552883L, MethodHandles.lookup().lookupClass()).a(266416509543495L);
      // $VF: monitorexit
      long var10 = var10000 ^ 137192754691509L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[6];
      int var6 = 0;
      String var5 = "\u0013\u008b¬K\u009d+c}NÆ\u0014}HÁÒg\u0010è\u0014º¸¢PM\u009a\u009byPVË\u009ea'\bÄÓ\u001e²0Y!\u0088\u0010Sz¨ç\u009e\u0019õ>Ä\u0013'×(ªëo";
      int var7 = "\u0013\u008b¬K\u009d+c}NÆ\u0014}HÁÒg\u0010è\u0014º¸¢PM\u009a\u009byPVË\u009ea'\bÄÓ\u001e²0Y!\u0088\u0010Sz¨ç\u009e\u0019õ>Ä\u0013'×(ªëo"
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
                     w_6 = new rh2$j7i(0, var8[0]);
                     jd3 = new rh2$j7i(1, var8[3]);
                     hqk = new rh2$j7i(2, var8[4]);
                     fq8 = new rh2$j7i[]{w_6, jd3, hqk};
                     x6y = new rh2$j7i[values().length];

                     for (rh2$j7i var15 : values()) {
                        x6y[var15.sqd()] = var15;
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

                  var5 = "Ñ¼Á*Ñ¹µ\u009b\b\u00958Çï]S J";
                  var7 = "Ñ¼Á*Ñ¹µ\u009b\b\u00958Çï]S J".length();
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
