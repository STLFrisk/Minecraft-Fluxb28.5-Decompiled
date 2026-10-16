import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kqz extends ar7 {
   private static final long a;
   private static final String f;

   public kqz() {
      long var1 = a ^ 271911196376L;
      super(f, _aj._lm, false, new j1s[0]);
   }

   @jev
   private void tls(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: getstatic kgt.kd6 Lohv;
      // 07: invokevirtual ohv.klu ()Z
      // 0a: iload 2
      // 0b: ifne 25
      // 0e: ifne 33
      // 11: goto 18
      // 14: invokestatic kqz.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic kgt.ce6 Liri;
      // 1b: invokevirtual iri.klu ()Z
      // 1e: goto 25
      // 21: invokestatic kqz.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 2
      // 26: ifne 3d
      // 29: ifeq 34
      // 2c: goto 33
      // 2f: invokestatic kqz.a (Loov;)Loov;
      // 32: athrow
      // 33: return
      // 34: getstatic kqz.ek1 Lc05;
      // 37: getfield c05.vg8 Ll86;
      // 3a: getfield l86.lfk Z
      // 3d: iload 2
      // 3e: ifne 5e
      // 41: ifne 6e
      // 44: goto 4b
      // 47: invokestatic kqz.a (Loov;)Loov;
      // 4a: athrow
      // 4b: getstatic kqz.ek1 Lc05;
      // 4e: getfield c05.oxn Lmoh;
      // 51: getfield moh.nfb Lm7l;
      // 54: getfield m7l.m7n Z
      // 57: goto 5e
      // 5a: invokestatic kqz.a (Loov;)Loov;
      // 5d: athrow
      // 5e: ifeq 6e
      // 61: invokestatic q0r.x28 ()D
      // 64: invokestatic q0r.a8n (D)V
      // 67: goto 6e
      // 6a: invokestatic kqz.a (Loov;)Loov;
      // 6d: athrow
      // 6e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6133209001717521124L, -4067367226178419279L, MethodHandles.lookup().lookupClass()).a(206720863391699L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 23920203179585L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ë\u0090\bê\u000f\u0094ÅU".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
