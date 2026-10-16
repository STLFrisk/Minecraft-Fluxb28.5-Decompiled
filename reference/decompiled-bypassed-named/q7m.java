import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class q7m extends m54 {
   public static final _ku whz;

   public q7m() {
      this.y8l(this._8_.c32().zvi(whz, 0));
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual mew.eve ()Lmew;
      // 0a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0d: invokeinterface zfz.r_y ()Le0x; 1
      // 12: invokevirtual e0x.p1r ()Lp3y;
      // 15: invokevirtual p3y.gk6 ()Z
      // 18: iload 5
      // 1a: ifne 3b
      // 1d: ifne 3c
      // 20: goto 27
      // 23: invokestatic q7m.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: aload 2
      // 2a: aload 3
      // 2b: bipush 0
      // 2c: invokevirtual q7m.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 2f: aload 1
      // 30: aload 2
      // 31: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 34: goto 3b
      // 37: invokestatic q7m.a (Loov;)Loov;
      // 3a: athrow
      // 3b: pop
      // 3c: aload 0
      // 3d: aload 1
      // 3e: aload 2
      // 3f: aload 3
      // 40: aload 4
      // 42: invokespecial m54.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 45: return
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(whz, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(whz);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{whz});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6013096075978580947L, -2542049806079530340L, MethodHandles.lookup().lookupClass()).a(175413609132276L);
      // $VF: monitorexit
      long var4 = var10000 ^ 73267730604822L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("½Å8ÏlÅõ½ê\u0095áG!l\u0096?".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      whz = _ku.wgl(var0, 0, 15);
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
