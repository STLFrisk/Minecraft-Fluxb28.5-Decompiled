import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class itu extends u7m {
   public final int u0x = 32;
   private static final long a;
   private static final String g;

   public itu(int var1, float var2, boolean var3) {
      this.v7g = var1;
      this.wta = var3;
      this._z2 = var2;
      this.qfy(uja.jjv);
   }

   public itu(int var1, boolean var2) {
      this(var1, 0.6F, var2);
   }

   @Override
   public erg q20(erg var1, OpaquePredicate var2, ha9 var3) {
      long var4 = a ^ 84743745824473L;
      var1.qd2--;
      var3.wvq().yxc(this, var1);
      var2.yfq(var3, g, 0.5F, var2.fsy.nextFloat() * 0.1F + 0.9F);
      this.lb1(var1, var2, var3);
      var3.aex(l9p.foo[u7m._lo(this)]);
      return var1;
   }

   public void lb1(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 4
      // 0b: ifne 23
      // 0e: ifne 69
      // 11: goto 18
      // 14: invokestatic itu.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield itu.qxy I
      // 1c: goto 23
      // 1f: invokestatic itu.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 4
      // 25: ifne 45
      // 28: ifle 69
      // 2b: goto 32
      // 2e: invokestatic itu.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 2
      // 33: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 36: invokevirtual java/util/Random.nextFloat ()F
      // 39: aload 0
      // 3a: getfield itu.pvq F
      // 3d: fcmpg
      // 3e: goto 45
      // 41: invokestatic itu.a (Loov;)Loov;
      // 44: athrow
      // 45: ifge 69
      // 48: aload 3
      // 49: new sdj
      // 4c: dup
      // 4d: aload 0
      // 4e: getfield itu.qxy I
      // 51: aload 0
      // 52: getfield itu.yy4 I
      // 55: bipush 20
      // 57: imul
      // 58: aload 0
      // 59: getfield itu.o59 I
      // 5c: invokespecial sdj.<init> (III)V
      // 5f: invokevirtual ha9.gmn (Lsdj;)V
      // 62: goto 69
      // 65: invokestatic itu.a (Loov;)Loov;
      // 68: athrow
      // 69: return
   }

   @Override
   public int hdm(erg var1) {
      return 32;
   }

   @Override
   public ce2 uf6(erg var1) {
      return ce2.b46;
   }

   @Override
   public erg r__(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifne 24
      // 0b: aload 0
      // 0c: getfield itu.sa4 Z
      // 0f: invokevirtual ha9.ca2 (Z)Z
      // 12: ifeq 2d
      // 15: goto 1c
      // 18: invokestatic itu.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 3
      // 1d: goto 24
      // 20: invokestatic itu.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 1
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual itu.hdm (Lerg;)I
      // 2a: invokevirtual ha9.qez (Lerg;I)V
      // 2d: aload 1
      // 2e: areturn
   }

   public int ug7(erg var1) {
      return this.v7g;
   }

   public float fko(erg var1) {
      return this._z2;
   }

   public boolean r07() {
      return this.wta;
   }

   public itu kfj(int var1, int var2, int var3, float var4) {
      this.qxy = var1;
      this.yy4 = var2;
      this.o59 = var3;
      this.pvq = var4;
      return this;
   }

   public itu z_i() {
      this.sa4 = true;
      return this;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2418638172004012829L, -5136018284966673357L, MethodHandles.lookup().lookupClass()).a(100146255520157L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 123581891922286L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u001c-I\u000b½\"\u0091\u0002b´1XÉ\u0099éÝ".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      g = var6;
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
