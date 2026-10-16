import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum hvn$dyo implements v4k {
   public static final hvn$dyo jf7;
   public static final hvn$dyo oy2;
   public static final hvn$dyo dj5;
   public static final hvn$dyo qsx;
   public static final hvn$dyo b3p;
   public static final hvn$dyo ooj;
   public static final hvn$dyo bbo;
   public static final hvn$dyo u0j;
   private static final hvn$dyo[] qah;
   private final int u1e;
   private final _mi czl;
   private final String v4o;
   private final String ggt;
   private static final hvn$dyo[] ubi;

   private hvn$dyo(int var3, _mi var4, String var5) {
      this(var3, var4, var5, var5);
   }

   private hvn$dyo(int var3, _mi var4, String var5, String var6) {
      this.u1e = var3;
      this.czl = var4;
      this.v4o = var5;
      this.ggt = var6;
   }

   public int run() {
      return this.u1e;
   }

   public _mi qjp() {
      return this.czl;
   }

   @Override
   public String toString() {
      return this.v4o;
   }

   public static hvn$dyo gbq(int param0) {
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
      // 0f: invokestatic hvn$dyo.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifne 35
      // 18: goto 1f
      // 1b: invokestatic hvn$dyo.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic hvn$dyo.qah [Lhvn$dyo;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic hvn$dyo.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic hvn$dyo.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic hvn$dyo.qah [Lhvn$dyo;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.v4o;
   }

   public String gsv() {
      return this.ggt;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4816875584150570416L, -6981248227912495272L, MethodHandles.lookup().lookupClass()).a(94768557559519L);
      // $VF: monitorexit
      long var10 = var10000 ^ 94940933640282L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[21];
      int var6 = 0;
      String var5 = "øØ\u009dò·\u008a9þ\u008a/r\u0010»£\u0016\u001c\u0010ßLöa\u0081ÅõV\u009a\u0007Ïrü\u0085¨\u008c\u0010Pò\u0017\u0099\rÂYI\u000fÏü\u0000¸O\u009d\u0018\bêI«/\u00169e3\u0010\u0095\u0006[|FÑæ\u0010Yü\\ðé\u0012\u009b¢\b³\u00ad¾Ô=\u0089±Ø\u0010\u0014\u001e¶\u0012)x\u0089zHQÃ\u0093\u0004Z<\u0015\b\u0089Û/¥p\tõó\u00101\"kùý¾\u0084'¸Cö q.¶§\b^¦/5tà2º\u0018\u0099Ù\u009c\u0081b³VJ\u009fqJ²\u0090ÔlÅ1\f.¿8\u0088#\u001a\bõ\u0014\u0005ÚÇ\u0082IØ\u0010\u0016I\u001f\u0096\u000fØôíY'w\u001dÿó¥À\b¹\u0098ï\u0000\b:ª£\bá^¦\u008a}\u0001úm\bäb$J\u008dLÕ\u008e\b÷H\u0086Zþ\u0006¦Ú\u00108L\u0019\u001cûà\u0001\u0003gè\u0092\u009a\u009c! \u009b\u0010*ãìi\u008e\u0090±pTª/0\f; æ";
      int var7 = "øØ\u009dò·\u008a9þ\u008a/r\u0010»£\u0016\u001c\u0010ßLöa\u0081ÅõV\u009a\u0007Ïrü\u0085¨\u008c\u0010Pò\u0017\u0099\rÂYI\u000fÏü\u0000¸O\u009d\u0018\bêI«/\u00169e3\u0010\u0095\u0006[|FÑæ\u0010Yü\\ðé\u0012\u009b¢\b³\u00ad¾Ô=\u0089±Ø\u0010\u0014\u001e¶\u0012)x\u0089zHQÃ\u0093\u0004Z<\u0015\b\u0089Û/¥p\tõó\u00101\"kùý¾\u0084'¸Cö q.¶§\b^¦/5tà2º\u0018\u0099Ù\u009c\u0081b³VJ\u009fqJ²\u0090ÔlÅ1\f.¿8\u0088#\u001a\bõ\u0014\u0005ÚÇ\u0082IØ\u0010\u0016I\u001f\u0096\u000fØôíY'w\u001dÿó¥À\b¹\u0098ï\u0000\b:ª£\bá^¦\u008a}\u0001úm\bäb$J\u008dLÕ\u008e\b÷H\u0086Zþ\u0006¦Ú\u00108L\u0019\u001cûà\u0001\u0003gè\u0092\u009a\u009c! \u009b\u0010*ãìi\u008e\u0090±pTª/0\f; æ"
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
                     jf7 = new hvn$dyo(0, _mi.eo9, var8[13]);
                     oy2 = new hvn$dyo(1, _mi.e0k, var8[2], var8[15]);
                     dj5 = new hvn$dyo(2, _mi.uwd, var8[4], var8[19]);
                     qsx = new hvn$dyo(3, _mi.eo9, var8[0], var8[3]);
                     b3p = new hvn$dyo(4, _mi.v0s, var8[14]);
                     ooj = new hvn$dyo(5, _mi.eo9, var8[1], var8[10]);
                     bbo = new hvn$dyo(6, _mi.l5z, var8[6], var8[8]);
                     u0j = new hvn$dyo(7, _mi.xxi, var8[7]);
                     ubi = new hvn$dyo[]{jf7, oy2, dj5, qsx, b3p, ooj, bbo, u0j};
                     qah = new hvn$dyo[values().length];

                     for (hvn$dyo var15 : values()) {
                        qah[var15.run()] = var15;
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

                  var5 = "à\u0095\u0001¤Óë¨j\bZö;ÞÇ\u001e\u0087|";
                  var7 = "à\u0095\u0001¤Óë¨j\bZö;ÞÇ\u001e\u0087|".length();
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
