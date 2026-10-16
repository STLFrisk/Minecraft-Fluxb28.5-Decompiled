import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum jcc$whg implements v4k {
   public static final jcc$whg aow;
   public static final jcc$whg zlt;
   public static final jcc$whg i59;
   public static final jcc$whg hwh;
   public static final jcc$whg gch;
   public static final jcc$whg _ft;
   public static final jcc$whg y7n;
   private static final jcc$whg[] i0p;
   private final int eul;
   private final String ych;
   private final String c9p;
   private final _mi l6q;
   private static final jcc$whg[] lpv;

   private jcc$whg(int var3, _mi var4, String var5) {
      this(var3, var4, var5, var5);
   }

   private jcc$whg(int var3, _mi var4, String var5, String var6) {
      this.eul = var3;
      this.ych = var5;
      this.c9p = var6;
      this.l6q = var4;
   }

   public int rim() {
      return this.eul;
   }

   public _mi llp() {
      return this.l6q;
   }

   @Override
   public String toString() {
      return this.ych;
   }

   public static jcc$whg fgu(int param0) {
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
      // 0f: invokestatic jcc$whg.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifeq 35
      // 18: goto 1f
      // 1b: invokestatic jcc$whg.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic jcc$whg.i0p [Ljcc$whg;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic jcc$whg.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic jcc$whg.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic jcc$whg.i0p [Ljcc$whg;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.ych;
   }

   public String axs() {
      return this.c9p;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5470530120769716480L, -3936133636356548267L, MethodHandles.lookup().lookupClass()).a(132271887279912L);
      // $VF: monitorexit
      long var10 = var10000 ^ 69844382932814L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[17];
      int var6 = 0;
      String var5 = " Ñ·w¦\u0007\u0088<\u008cì\u001f?í[R\u008e\u0010Tèåù;\u0098û¸p\u0019P8\u001e\u0088.ý\b?)|¾¢bñ¾\u0010:«,ßl\u000f\u008e\u0013'´á1\u0001¾ûñ\b\u000b CÓ=©ÙÅ\b\u0099\u000b4ÛCÍh\u008c\bM\u001c}¦¯Í±¯\u0010;\u0018\u0016Íà\u0016\u0019\u008f§/~p tún\u0010½¨\u001bZXç\u0094ÍûÏ\u0097ps3vÓ\u0010«YX\u0001}\u0012uÀÑõ>.\u0091Jyâ\bÅ\u0093Ë>s\u0006/£\bØÇ\u0095u÷¯½/\u0010½¨\u001bZXç\u0094ÍÓãg\u0087\u000f¶ce\u0010©\u0080ê´\u008e#KþÇ°79»¬\u0013Ú\u0010î±_\u0017\u000e%í\u0087V]1g¼\u0010/Ö";
      int var7 = " Ñ·w¦\u0007\u0088<\u008cì\u001f?í[R\u008e\u0010Tèåù;\u0098û¸p\u0019P8\u001e\u0088.ý\b?)|¾¢bñ¾\u0010:«,ßl\u000f\u008e\u0013'´á1\u0001¾ûñ\b\u000b CÓ=©ÙÅ\b\u0099\u000b4ÛCÍh\u008c\bM\u001c}¦¯Í±¯\u0010;\u0018\u0016Íà\u0016\u0019\u008f§/~p tún\u0010½¨\u001bZXç\u0094ÍûÏ\u0097ps3vÓ\u0010«YX\u0001}\u0012uÀÑõ>.\u0091Jyâ\bÅ\u0093Ë>s\u0006/£\bØÇ\u0095u÷¯½/\u0010½¨\u001bZXç\u0094ÍÓãg\u0087\u000f¶ce\u0010©\u0080ê´\u008e#KþÇ°79»¬\u0013Ú\u0010î±_\u0017\u000e%í\u0087V]1g¼\u0010/Ö"
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
                     aow = new jcc$whg(0, _mi.eo9, var8[5]);
                     zlt = new jcc$whg(1, _mi.pzg, var8[4]);
                     i59 = new jcc$whg(2, _mi.pzg, var8[14], var8[15]);
                     hwh = new jcc$whg(3, _mi.xxi, var8[6]);
                     gch = new jcc$whg(4, _mi.xxi, var8[13], var8[0]);
                     _ft = new jcc$whg(5, _mi.eo9, var8[8]);
                     y7n = new jcc$whg(6, _mi.eo9, var8[7], var8[12]);
                     lpv = new jcc$whg[]{aow, zlt, i59, hwh, gch, _ft, y7n};
                     i0p = new jcc$whg[values().length];

                     for (jcc$whg var15 : values()) {
                        i0p[var15.rim()] = var15;
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

                  var5 = "ñ\u008f\u0081H¼\u0006æñ[=¤J»il\u0010\u0010:«,ßl\u000f\u008e\u0013ú<\u0093\u008dÔà\u0088\u008c";
                  var7 = "ñ\u008f\u0081H¼\u0006æñ[=¤J»il\u0010\u0010:«,ßl\u000f\u008e\u0013ú<\u0093\u008dÔà\u0088\u008c".length();
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
