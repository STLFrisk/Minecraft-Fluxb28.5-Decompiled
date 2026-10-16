import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f1w extends Module {
   private static final long a;
   private static final String f;

   public f1w() {
      long var1 = a ^ 109310153071769L;
      super(f, _aj.z3a, false, new SubEngine[0]);
      this.crf = true;
   }

   @Override
   public void onDisable() {
      super.onDisable();
      ek1.vg8.iau();
      this.crf = false;
   }

   @EventHandler
   public void j3m(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic f1w.ek1 Lc05;
      // 07: iload 2
      // 08: ifeq 20
      // 0b: getfield Minecraft.tij Lkh3;
      // 0e: ifnonnull 1d
      // 11: goto 18
      // 14: invokestatic f1w.a (Loov;)Loov;
      // 17: athrow
      // 18: return
      // 19: invokestatic f1w.a (Loov;)Loov;
      // 1c: athrow
      // 1d: getstatic f1w.ek1 Lc05;
      // 20: getfield Minecraft.vg8 Ll86;
      // 23: iload 2
      // 24: ifeq 68
      // 27: invokevirtual EntityPlayerSP.i55 ()F
      // 2a: fconst_0
      // 2b: fcmpl
      // 2c: ifne 86
      // 2f: goto 36
      // 32: invokestatic f1w.a (Loov;)Loov;
      // 35: athrow
      // 36: getstatic f1w.ek1 Lc05;
      // 39: getfield Minecraft.vg8 Ll86;
      // 3c: ldc 20.0
      // 3e: nop
      // 3f: invokevirtual EntityPlayerSP.uh3 (F)V
      // 42: getstatic f1w.ek1 Lc05;
      // 45: getfield Minecraft.vg8 Ll86;
      // 48: bipush 0
      // 49: putfield EntityPlayerSP.ma9 Z
      // 4c: aload 0
      // 4d: bipush 1
      // 4e: putfield f1w.crf Z
      // 51: getstatic f1w.ek1 Lc05;
      // 54: aconst_null
      // 55: checkcast ShaderHelper
      // 58: invokevirtual Minecraft.z2i (Lgbe;)V
      // 5b: getstatic f1w.ek1 Lc05;
      // 5e: getfield Minecraft.vg8 Ll86;
      // 61: goto 68
      // 64: invokestatic f1w.a (Loov;)Loov;
      // 67: athrow
      // 68: getstatic f1w.ek1 Lc05;
      // 6b: getfield Minecraft.vg8 Ll86;
      // 6e: getfield EntityPlayerSP.o2v D
      // 71: getstatic f1w.ek1 Lc05;
      // 74: getfield Minecraft.vg8 Ll86;
      // 77: getfield EntityPlayerSP.kfp D
      // 7a: getstatic f1w.ek1 Lc05;
      // 7d: getfield Minecraft.vg8 Ll86;
      // 80: getfield EntityPlayerSP.vbd D
      // 83: invokevirtual EntityPlayerSP.clj (DDD)V
      // 86: return
   }

   @EventHandler
   public void ru7(ihr param1) {
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
      // 05: getfield f1w.crf Z
      // 08: iload 2
      // 09: ifeq 2f
      // 0c: ifeq 37
      // 0f: goto 16
      // 12: invokestatic f1w.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: iload 2
      // 18: ifeq 33
      // 1b: goto 22
      // 1e: invokestatic f1w.a (Loov;)Loov;
      // 21: athrow
      // 22: invokevirtual ihr.bbi ()Lmz2;
      // 25: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 28: goto 2f
      // 2b: invokestatic f1w.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 37
      // 32: aload 1
      // 33: bipush 1
      // 34: invokevirtual ihr.wxi (Z)V
      // 37: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8923313566880928235L, 1621533312436440174L, MethodHandles.lookup().lookupClass()).a(159310984808930L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 29063997925830L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¡±\u0007¥\u0083\u0013òY".getBytes("ISO-8859-1"));
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
