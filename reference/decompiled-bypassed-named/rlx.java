import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rlx extends Module {
   private static final long a;
   private static final String f;

   public rlx() {
      long var1 = a ^ 25604905447320L;
      super(f, _aj.y49, false, new SubEngine[0]);
   }

   @Override
   public void onEnable() {
      super.onEnable();
   }

   @Override
   public void onDisable() {
      super.onDisable();
   }

   @EventHandler
   private void l06(w1x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 21
      // 09: getfield w1x.huk Le0x;
      // 0c: instanceof kuv
      // 0f: ifeq 61
      // 12: goto 19
      // 15: invokestatic rlx.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: goto 21
      // 1d: invokestatic rlx.a (Loov;)Loov;
      // 20: athrow
      // 21: new nh4
      // 24: dup
      // 25: aload 1
      // 26: getfield w1x.caz Lmew;
      // 29: invokevirtual mew.getX ()I
      // 2c: i2d
      // 2d: aload 1
      // 2e: getfield w1x.caz Lmew;
      // 31: invokevirtual mew.getY ()I
      // 34: i2d
      // 35: aload 1
      // 36: getfield w1x.caz Lmew;
      // 39: invokevirtual mew.getZ ()I
      // 3c: i2d
      // 3d: aload 1
      // 3e: getfield w1x.caz Lmew;
      // 41: invokevirtual mew.getX ()I
      // 44: bipush 1
      // 45: iadd
      // 46: i2d
      // 47: aload 1
      // 48: getfield w1x.caz Lmew;
      // 4b: invokevirtual mew.getY ()I
      // 4e: bipush 1
      // 4f: iadd
      // 50: i2d
      // 51: aload 1
      // 52: getfield w1x.caz Lmew;
      // 55: invokevirtual mew.getZ ()I
      // 58: bipush 1
      // 59: iadd
      // 5a: i2d
      // 5b: invokespecial nh4.<init> (DDDDDD)V
      // 5e: putfield w1x.o04 Lnh4;
      // 61: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8902623903388956997L, -886990099474150640L, MethodHandles.lookup().lookupClass()).a(20925363099774L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 109131232335919L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Þ\u0086ÜylGú\u001e\u009fó,º,´\u0082\u001f".getBytes("ISO-8859-1"));
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
