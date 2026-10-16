import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e1s extends ar7 {
   private static final long a;
   private static final String f;

   public e1s() {
      long var1 = a ^ 48743107719410L;
      super(f, _aj._lm, false, new j1s[0]);
   }

   @Override
   public void ron() {
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
      // 05: pop
      // 06: iload 1
      // 07: ifeq 7c
      // 0a: getstatic e1s.ek1 Lc05;
      // 0d: getfield c05.vg8 Ll86;
      // 10: ifnull 77
      // 13: goto 1a
      // 16: invokestatic e1s.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: pop
      // 1c: iload 1
      // 1d: ifeq 7c
      // 20: goto 27
      // 23: invokestatic e1s.a (Loov;)Loov;
      // 26: athrow
      // 27: getstatic e1s.ek1 Lc05;
      // 2a: getfield c05.tij Lkh3;
      // 2d: ifnull 77
      // 30: goto 37
      // 33: invokestatic e1s.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: pop
      // 39: getstatic e1s.ek1 Lc05;
      // 3c: getfield c05.vg8 Ll86;
      // 3f: getfield l86.lq7 Lp_k;
      // 42: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 45: dup
      // 46: aload 0
      // 47: pop
      // 48: getstatic e1s.ek1 Lc05;
      // 4b: getfield c05.vg8 Ll86;
      // 4e: getfield l86.o2v D
      // 51: aload 0
      // 52: pop
      // 53: getstatic e1s.ek1 Lc05;
      // 56: getfield c05.vg8 Ll86;
      // 59: getfield l86.kfp D
      // 5c: dconst_1
      // 5d: dadd
      // 5e: aload 0
      // 5f: pop
      // 60: getstatic e1s.ek1 Lc05;
      // 63: getfield c05.vg8 Ll86;
      // 66: getfield l86.vbd D
      // 69: bipush 0
      // 6a: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 6d: invokevirtual p_k.sxi (Lmz2;)V
      // 70: goto 77
      // 73: invokestatic e1s.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 0
      // 78: bipush 0
      // 79: invokevirtual e1s.yse (Z)V
      // 7c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4654884850882839968L, -5504042086455153597L, MethodHandles.lookup().lookupClass()).a(234402637033573L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 8157782040605L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("só\\ü\u0086É\u0005Áã¡\u000b\u009fÈ{7Ð".getBytes("ISO-8859-1"));
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
