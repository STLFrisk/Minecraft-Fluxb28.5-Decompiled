import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yuq extends u7m {
   private static final long a;
   private static final String b;

   public yuq() {
      this.vgp = 16;
      this.qfy(uja.kdm);
   }

   @Override
   public erg r__(erg param1, t9d param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yuq.a J
      // 03: ldc2_w 87996357849285
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 3
      // 0f: getfield ha9.lls Lpj2;
      // 12: getfield pj2.g40 Z
      // 15: iload 6
      // 17: ifne 62
      // 1a: ifeq 2a
      // 1d: goto 24
      // 20: invokestatic yuq.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 1
      // 25: areturn
      // 26: invokestatic yuq.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: dup
      // 2c: getfield erg.qd2 I
      // 2f: bipush 1
      // 30: isub
      // 31: putfield erg.qd2 I
      // 34: aload 2
      // 35: aload 3
      // 36: getstatic yuq.b Ljava/lang/String;
      // 39: nop
      // 3a: ldc 0.5
      // 3c: nop
      // 3d: ldc 0.4
      // 3f: nop
      // 40: getstatic yuq.pq6 Ljava/util/Random;
      // 43: invokevirtual java/util/Random.nextFloat ()F
      // 46: ldc 0.4
      // 48: nop
      // 49: fmul
      // 4a: ldc 0.8
      // 4c: nop
      // 4d: fadd
      // 4e: fdiv
      // 4f: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 52: iload 6
      // 54: ifne 86
      // 57: aload 2
      // 58: getfield t9d.v0f Z
      // 5b: goto 62
      // 5e: invokestatic yuq.a (Loov;)Loov;
      // 61: athrow
      // 62: ifne 7a
      // 65: aload 2
      // 66: new jv0
      // 69: dup
      // 6a: aload 2
      // 6b: aload 3
      // 6c: invokespecial jv0.<init> (Lt9d;Lg_3;)V
      // 6f: invokevirtual t9d.xzq (Li2h;)Z
      // 72: pop
      // 73: goto 7a
      // 76: invokestatic yuq.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 3
      // 7b: getstatic l9p.foo [L_ss;
      // 7e: aload 0
      // 7f: invokestatic u7m._lo (Lu7m;)I
      // 82: aaload
      // 83: invokevirtual ha9.aex (L_ss;)V
      // 86: aload 1
      // 87: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3187633837449273260L, -3183881009632977682L, MethodHandles.lookup().lookupClass()).a(24107493725014L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 110654868055875L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("È¬£$=ÒICàÄ0õ?\u00850\u0097".getBytes("ISO-8859-1"));
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
