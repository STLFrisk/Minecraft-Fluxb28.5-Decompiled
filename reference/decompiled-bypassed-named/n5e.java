import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction$ck7;

public class n5e extends _ov {
   private static final long b;
   private static final String h;

   @Override
   public void initGui() {
      long var1 = b ^ 85893374743219L;
      super.initGui();
      this.khf.add(new gt4(1, this.dt7 / 2 - 100, this.o1e - 40, fc1.gx1(h, new Object[0])));
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: bipush 1
      // 06: iload 3
      // 07: ifeq 2d
      // 0a: if_icmpne 23
      // 0d: goto 14
      // 10: invokestatic n5e.c (Loov;)Loov;
      // 13: athrow
      // 14: aload 0
      // 15: invokespecial n5e.zkl ()V
      // 18: iload 3
      // 19: ifne a3
      // 1c: goto 23
      // 1f: invokestatic n5e.c (Loov;)Loov;
      // 22: athrow
      // 23: iload 2
      // 24: bipush 28
      // 26: goto 2d
      // 29: invokestatic n5e.c (Loov;)Loov;
      // 2c: athrow
      // 2d: iload 3
      // 2e: ifeq 46
      // 31: if_icmpeq 5a
      // 34: goto 3b
      // 37: invokestatic n5e.c (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 2
      // 3c: sipush 156
      // 3f: goto 46
      // 42: invokestatic n5e.c (Loov;)Loov;
      // 45: athrow
      // 46: if_icmpeq 5a
      // 49: aload 0
      // 4a: iload 1
      // 4b: iload 2
      // 4c: invokespecial _ov.dig (CI)V
      // 4f: iload 3
      // 50: ifne a3
      // 53: goto 5a
      // 56: invokestatic n5e.c (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield n5e.i7w Ljqk;
      // 5e: invokevirtual jqk.xct ()Ljava/lang/String;
      // 61: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 64: astore 4
      // 66: iload 3
      // 67: ifeq 96
      // 6a: aload 4
      // 6c: invokevirtual java/lang/String.isEmpty ()Z
      // 6f: ifne 8c
      // 72: goto 79
      // 75: invokestatic n5e.c (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield n5e.f41 Lc05;
      // 7d: getfield Minecraft.vg8 Ll86;
      // 80: aload 4
      // 82: invokevirtual EntityPlayerSP.vf0 (Ljava/lang/String;)V
      // 85: goto 8c
      // 88: invokestatic n5e.c (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: getfield n5e.i7w Ljqk;
      // 90: ldc ""
      // 92: nop
      // 93: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 96: aload 0
      // 97: getfield n5e.f41 Lc05;
      // 9a: getfield Minecraft.t43 Ld1f;
      // 9d: invokevirtual d1f.lcg ()Lsxg;
      // a0: invokevirtual sxg.f7w ()V
      // a3: return
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4._me I
      // 08: bipush 1
      // 09: if_icmpne 1b
      // 0c: aload 0
      // 0d: invokespecial n5e.zkl ()V
      // 10: iload 2
      // 11: ifeq 27
      // 14: goto 1b
      // 17: invokestatic n5e.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokespecial _ov.actionPerformed (Lgt4;)V
      // 20: goto 27
      // 23: invokestatic n5e.c (Loov;)Loov;
      // 26: athrow
      // 27: return
   }

   private void zkl() {
      p_k var1 = this.f41.vg8.lq7;
      var1.sxi(new C0BPacketEntityAction(this.f41.vg8, C0BPacketEntityAction$ck7.a79));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3880038706833814249L, -7745765889909003055L, MethodHandles.lookup().lookupClass()).a(215535648720297L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 65270685599864L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u007f£¥Î\u009d~É(/ ú\u0004\u0081¥nÃ\u00079_¼Z\u000eQï´3\u001a\u0007T\u0097z_".getBytes("ISO-8859-1"));
      String var6 = d(var4).intern();
      byte var10001 = -1;
      h = var6;
   }

   private static oov c(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
