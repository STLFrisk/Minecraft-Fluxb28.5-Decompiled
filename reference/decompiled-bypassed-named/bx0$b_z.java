import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum bx0$b_z implements v4k {
   public static final bx0$b_z rg3;
   public static final bx0$b_z ryg;
   public static final bx0$b_z sos;
   private static final bx0$b_z[] o3a;
   private final int qii;
   private final String i5w;
   private final String q3b;
   private final _mi ak0;
   private static final bx0$b_z[] swl;

   private bx0$b_z(int var3, String var4, _mi var5) {
      this(var3, var4, var4, var5);
   }

   private bx0$b_z(int var3, String var4, String var5, _mi var6) {
      this.qii = var3;
      this.i5w = var4;
      this.q3b = var5;
      this.ak0 = var6;
   }

   public int d74() {
      return this.qii;
   }

   public String w9d() {
      return this.q3b;
   }

   public _mi vf1() {
      return this.ak0;
   }

   @Override
   public String toString() {
      return this.i5w;
   }

   public static bx0$b_z brn(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 35
      // 09: iflt 2d
      // 0c: goto 13
      // 0f: invokestatic bx0$b_z.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 0
      // 14: iload 1
      // 15: ifeq 35
      // 18: goto 1f
      // 1b: invokestatic bx0$b_z.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic bx0$b_z.o3a [Lbx0$b_z;
      // 22: arraylength
      // 23: if_icmplt 36
      // 26: goto 2d
      // 29: invokestatic bx0$b_z.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 35
      // 31: invokestatic bx0$b_z.a (Loov;)Loov;
      // 34: athrow
      // 35: istore 0
      // 36: getstatic bx0$b_z.o3a [Lbx0$b_z;
      // 39: iload 0
      // 3a: aaload
      // 3b: areturn
   }

   @Override
   public String mo3() {
      return this.i5w;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(976418986277356902L, 5029433798927009438L, MethodHandles.lookup().lookupClass()).a(108826239604417L);
      // $VF: monitorexit
      long var10 = var10000 ^ 12246910488665L;
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
      String var5 = "c\u0099\u0002\u0092`ë\u001aæS\u0012·È\u0007®:á\u0010½\u001cçýP!)v\u009bÓ\u009b³£ÕÆô\bg3f\u0012§ñ,\u0017\bQJÉ©¼\u0018ªN\bëØ'àoDñN\b®Ë\u0001\u000f÷®\u0011\u0018";
      int var7 = "c\u0099\u0002\u0092`ë\u001aæS\u0012·È\u0007®:á\u0010½\u001cçýP!)v\u009bÓ\u009b³£ÕÆô\bg3f\u0012§ñ,\u0017\bQJÉ©¼\u0018ªN\bëØ'àoDñN\b®Ë\u0001\u000f÷®\u0011\u0018"
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
                     rg3 = new bx0$b_z(0, var8[6], var8[4], _mi.pzg);
                     ryg = new bx0$b_z(1, var8[0], var8[7], _mi.pzg);
                     sos = new bx0$b_z(2, var8[5], _mi._bd);
                     swl = new bx0$b_z[]{rg3, ryg, sos};
                     o3a = new bx0$b_z[values().length];

                     for (bx0$b_z var15 : values()) {
                        o3a[var15.d74()] = var15;
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

                  var5 = "ð\u009f\u0010\u0097·N\u0084É\b[\u0014]´\u009eO\u000f\u0080";
                  var7 = "ð\u009f\u0010\u0097·N\u0084É\b[\u0014]´\u009eO\u000f\u0080".length();
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
