import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum po4$i4c {
   public static final po4$i4c umn;
   public static final po4$i4c y9x;
   public static final po4$i4c gei;
   public static final po4$i4c dv9;
   private static final Map fl0;
   private final int ce9;
   private final String _zy;
   private final int m30;
   private final float s4u;
   private final int xx5;
   private final float a7p;
   private boolean _qh = false;
   private static final po4$i4c[] k9f;

   private po4$i4c(int var3, String var4, int var5, float var6, int var7, float var8) {
      this.ce9 = var3;
      this._zy = var4;
      this.m30 = var5;
      this.s4u = var6;
      this.xx5 = var7;
      this.a7p = var8;
      this._qh = true;
   }

   private po4$i4c(int var3, String var4, int var5, float var6) {
      this.ce9 = var3;
      this._zy = var4;
      this.m30 = var5;
      this.s4u = var6;
      this.xx5 = 0;
      this.a7p = 0.0F;
      this._qh = false;
   }

   public int iho() {
      return this.ce9;
   }

   public String u58() {
      return this._zy;
   }

   public int z0v() {
      return this.m30;
   }

   public float ri0() {
      return this.s4u;
   }

   public int dxz() {
      return this.xx5;
   }

   public float t05() {
      return this.a7p;
   }

   public boolean xkf() {
      return this._qh;
   }

   public static po4$i4c h8h(int var0) {
      int var1 = t9d.c();
      po4$i4c var2 = (po4$i4c)fl0.get(var0);

      try {
         if (var1 != 0) {
            return var2;
         }

         if (var2 == null) {
            return umn;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var2;
   }

   public static po4$i4c qya(erg param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual erg.gn1 ()Lu7m;
      // 08: instanceof po4
      // 0b: iload 1
      // 0c: ifeq 24
      // 0f: ifeq 2a
      // 12: goto 19
      // 15: invokestatic po4$i4c.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual erg.j6_ ()I
      // 1d: goto 24
      // 20: invokestatic po4$i4c.a (Loov;)Loov;
      // 23: athrow
      // 24: invokestatic po4$i4c.h8h (I)Lpo4$i4c;
      // 27: goto 2d
      // 2a: getstatic po4$i4c.umn Lpo4$i4c;
      // 2d: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(994621847730025221L, -1835892648570762277L, MethodHandles.lookup().lookupClass()).a(188589836898512L);
      // $VF: monitorexit
      long var10 = var10000 ^ 15696179666075L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[8];
      int var6 = 0;
      String var5 = "Tw \u008bw\u00054Á\u0010°¢GØñàvo\u00975J\u009b\u001a\u008fb \b<u¶²^Ý\u0098\u008f\b:£U«\u0004ÛQ`\bÂ\u0018\u001fï(\u001dhz\u0010\u0093yH\u008a0wRã\u0007°Û®æ§®Z";
      int var7 = "Tw \u008bw\u00054Á\u0010°¢GØñàvo\u00975J\u009b\u001a\u008fb \b<u¶²^Ý\u0098\u008f\b:£U«\u0004ÛQ`\bÂ\u0018\u001fï(\u001dhz\u0010\u0093yH\u008a0wRã\u0007°Û®æ§®Z"
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
                     umn = new po4$i4c(0, var8[0], 2, 0.1F, 5, 0.6F);
                     y9x = new po4$i4c(1, var8[2], 2, 0.1F, 6, 0.8F);
                     gei = new po4$i4c(2, var8[7], 1, 0.1F);
                     dv9 = new po4$i4c(3, var8[5], 1, 0.1F);
                     k9f = new po4$i4c[]{umn, y9x, gei, dv9};
                     fl0 = Maps.newHashMap();

                     for (po4$i4c var15 : values()) {
                        fl0.put(var15.iho(), var15);
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

                  var5 = "ïJ]sy\u0096q\u0087 ;\rç$\u008fü\u0012\u0010nÍ0$(Ýr\u0002Ï\u001f4ñÀkàß";
                  var7 = "ïJ]sy\u0096q\u0087 ;\rç$\u008fü\u0012\u0010nÍ0$(Ýr\u0002Ï\u001f4ñÀkàß".length();
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
