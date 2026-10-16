import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class msg extends y0y {
   public static final zb_ _6s;

   public msg() {
      super(false);
      this.y8l(this._8_.c32().zvi(_6s, y0y$_zr.ipg));
   }

   @Override
   public void bkl(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 4
      // 07: invokevirtual e0x.scl ()Z
      // 0a: iload 5
      // 0c: ifne 2e
      // 0f: ifeq 42
      // 12: goto 19
      // 15: invokestatic msg.a (Loov;)Loov;
      // 18: athrow
      // 19: new y0y$wa9
      // 1c: dup
      // 1d: aload 0
      // 1e: aload 1
      // 1f: aload 2
      // 20: aload 3
      // 21: invokespecial y0y$wa9.<init> (Ly0y;Lt9d;Lmew;Lzfz;)V
      // 24: invokevirtual y0y$wa9.bnc ()I
      // 27: goto 2e
      // 2a: invokestatic msg.a (Loov;)Loov;
      // 2d: athrow
      // 2e: bipush 3
      // 2f: if_icmpne 42
      // 32: aload 0
      // 33: aload 1
      // 34: aload 2
      // 35: aload 3
      // 36: bipush 0
      // 37: invokevirtual msg.yt7 (Lt9d;Lmew;Lzfz;Z)Lzfz;
      // 3a: pop
      // 3b: goto 42
      // 3e: invokestatic msg.a (Loov;)Loov;
      // 41: athrow
      // 42: return
   }

   @Override
   public xny fvr() {
      return _6s;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(_6s, y0y$_zr.ai5(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((y0y$_zr)var1.dil(_6s)).g_6();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{_6s});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5446232163093490924L, 2178656706825648284L, MethodHandles.lookup().lookupClass()).a(20613689551832L);
      // $VF: monitorexit
      long var4 = var10000 ^ 135914036732266L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0096$ààk¥=p".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      _6s = zb_.pq4(var0, y0y$_zr.class);
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
