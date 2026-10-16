import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w8n extends u7m {
   private static final long a;
   private static final String b;

   public w8n() {
      this.vgp = 1;
      this.qfy(uja.qes);
   }

   @Override
   public boolean g1y(erg param1, ha9 param2, g_3 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic w8n.a J
      // 03: ldc2_w 66878553906673
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 3
      // 0f: instanceof _gj
      // 12: iload 6
      // 14: ifne 82
      // 17: ifeq 81
      // 1a: goto 21
      // 1d: invokestatic w8n.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: checkcast _gj
      // 25: astore 7
      // 27: aload 7
      // 29: invokevirtual _gj.vlb ()Z
      // 2c: iload 6
      // 2e: ifne 80
      // 31: ifne 7f
      // 34: goto 3b
      // 37: invokestatic w8n.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 7
      // 3d: invokevirtual _gj.ejl ()Z
      // 40: iload 6
      // 42: ifne 80
      // 45: goto 4c
      // 48: invokestatic w8n.a (Loov;)Loov;
      // 4b: athrow
      // 4c: ifne 7f
      // 4f: goto 56
      // 52: invokestatic w8n.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 7
      // 58: bipush 1
      // 59: invokevirtual _gj.hfu (Z)V
      // 5c: aload 7
      // 5e: getfield _gj.oay Lt9d;
      // 61: aload 7
      // 63: getstatic w8n.b Ljava/lang/String;
      // 66: nop
      // 67: ldc 0.5
      // 69: nop
      // 6a: fconst_1
      // 6b: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 6e: aload 1
      // 6f: dup
      // 70: getfield erg.qd2 I
      // 73: bipush 1
      // 74: isub
      // 75: putfield erg.qd2 I
      // 78: goto 7f
      // 7b: invokestatic w8n.a (Loov;)Loov;
      // 7e: athrow
      // 7f: bipush 1
      // 80: ireturn
      // 81: bipush 0
      // 82: ireturn
   }

   @Override
   public boolean gtk(erg var1, g_3 var2, g_3 var3) {
      this.g1y(var1, (ha9)null, var2);
      return true;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4457892488607947284L, -1174177213993348248L, MethodHandles.lookup().lookupClass()).a(18425823033394L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 119520382132267L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ë¿¼ ûø\u008e¤oéÕ|Ñ\u0082åG9\u000b~®¢V\u0083Ú".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      b = var6;
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
