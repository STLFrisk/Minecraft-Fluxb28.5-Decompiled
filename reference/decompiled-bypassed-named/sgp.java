import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class sgp extends Module {
   private static final long a;
   private static final String f;

   public sgp() {
      long var1 = a ^ 122817958825807L;
      super(f, _aj.twm, false, new SubEngine[0]);
   }

   public e0x z1z(mew var1) {
      return ek1.tij.getBlockState(var1).r_y();
   }

   public e0x lx7(ha9 var1) {
      return this.z1z(new mew(var1.o2v, var1.kfp - 1.0, var1.vbd));
   }

   @EventHandler
   public void c6_(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getstatic sgp.ek1 Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: invokevirtual sgp.lx7 (Lha9;)Le0x;
      // 0e: instanceof n47
      // 11: iload 2
      // 12: ifeq 68
      // 15: ifeq 58
      // 18: goto 1f
      // 1b: invokestatic sgp.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic sgp.ek1 Lc05;
      // 22: getfield Minecraft.vg8 Ll86;
      // 25: getfield EntityPlayerSP.lfk Z
      // 28: iload 2
      // 29: ifeq 50
      // 2c: goto 33
      // 2f: invokestatic sgp.a (Loov;)Loov;
      // 32: athrow
      // 33: ifeq 8d
      // 36: goto 3d
      // 39: invokestatic sgp.a (Loov;)Loov;
      // 3c: athrow
      // 3d: getstatic sgp.ek1 Lc05;
      // 40: getfield Minecraft.oxn Lmoh;
      // 43: getfield moh.e5o Lm7l;
      // 46: invokevirtual m7l.xbs ()I
      // 49: goto 50
      // 4c: invokestatic sgp.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 1
      // 51: invokestatic m7l.qkn (IZ)V
      // 54: iload 2
      // 55: ifne 8d
      // 58: getstatic sgp.ek1 Lc05;
      // 5b: getfield Minecraft.vg8 Ll86;
      // 5e: getfield EntityPlayerSP.lfk Z
      // 61: goto 68
      // 64: invokestatic sgp.a (Loov;)Loov;
      // 67: athrow
      // 68: iload 2
      // 69: ifeq 89
      // 6c: ifeq 8d
      // 6f: goto 76
      // 72: invokestatic sgp.a (Loov;)Loov;
      // 75: athrow
      // 76: getstatic sgp.ek1 Lc05;
      // 79: getfield Minecraft.oxn Lmoh;
      // 7c: getfield moh.e5o Lm7l;
      // 7f: invokevirtual m7l.xbs ()I
      // 82: goto 89
      // 85: invokestatic sgp.a (Loov;)Loov;
      // 88: athrow
      // 89: bipush 0
      // 8a: invokestatic m7l.qkn (IZ)V
      // 8d: return
   }

   @Override
   public void onEnable() {
      ek1.vg8.rh_(false);
      super.onEnable();
   }

   @Override
   public void onDisable() {
      m7l.qkn(ek1.oxn.e5o.xbs(), false);
      super.onDisable();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6455888992284884823L, -2092832628984900548L, MethodHandles.lookup().lookupClass()).a(246634718004070L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 71576965689391L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("`\u009e\u009dùLÚyñ".getBytes("ISO-8859-1"));
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
