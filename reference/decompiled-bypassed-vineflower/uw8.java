import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class uw8 implements a7q {
   private static final long a;
   private static final String b;

   public uw8(ha9 var1, ekw var2) {
      this.x50 = var1;
      this.rj9 = var2;
      this.z87 = new u42(var1, this);
   }

   @Override
   public ha9 rbk() {
      return this.x50;
   }

   @Override
   public void i2a(ha9 var1) {
   }

   @Override
   public skn zyi(ha9 var1) {
      return this.yw6;
   }

   @Override
   public void sw4(skn var1) {
      this.yw6 = var1;
   }

   @Override
   public void wyy(xxb var1) {
      var1.emv();
   }

   @Override
   public void uuf(erg var1) {
   }

   @Override
   public ekw xyw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uw8.a J
      // 03: ldc2_w 75221666258818
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield uw8.rj9 Lekw;
      // 10: iload 3
      // 11: ifne 29
      // 14: ifnull 2c
      // 17: goto 1e
      // 1a: invokestatic uw8.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield uw8.rj9 Lekw;
      // 22: goto 29
      // 25: invokestatic uw8.a (Loov;)Loov;
      // 28: athrow
      // 29: goto 3b
      // 2c: new hsu
      // 2f: dup
      // 30: getstatic uw8.b Ljava/lang/String;
      // 33: nop
      // 34: bipush 0
      // 35: anewarray 8
      // 38: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 3b: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2747126373034391423L, -9026163848673492706L, MethodHandles.lookup().lookupClass()).a(155990213088137L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 136481987607006L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("úØB\u0010ÀðO\f\u0013Qe;áâ#\u008a\u0085Û>Ì\u0080[ü+".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
