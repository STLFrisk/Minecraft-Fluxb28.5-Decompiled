import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class afi extends e0x {
   public static final _ku hdd;

   public afi() {
      super(p3y.tyq);
      this.y8l(this._8_.c32().zvi(hdd, 0));
      this._p_(true);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      float var3 = 0.0625F;
      float var4 = (float)(1 + (Integer)var1.getBlockState(var2).dil(hdd) * 2) / 16.0F;
      float var5 = 0.5F;
      this.xl4(var4, 0.0F, var3, 1.0F - var3, var5, 1.0F - var3);
   }

   @Override
   public void bf6() {
      float var1 = 0.0625F;
      float var2 = 0.5F;
      this.xl4(var1, 0.0F, var1, 1.0F - var1, var2, 1.0F - var1);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      float var4 = 0.0625F;
      float var5 = (float)(1 + (Integer)var3.dil(hdd) * 2) / 16.0F;
      float var6 = 0.5F;
      return new nh4(
         (double)((float)var2.getX() + var5),
         (double)var2.getY(),
         (double)((float)var2.getZ() + var4),
         (double)((float)(var2.getX() + 1) - var4),
         (double)((float)var2.getY() + var6),
         (double)((float)(var2.getZ() + 1) - var4)
      );
   }

   @Override
   public nh4 j54(OpaquePredicate var1, mew var2) {
      return this.m__(var1, var2, var1.getBlockState(var2));
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean cl2(OpaquePredicate var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      this.zwd(var1, var2, var3, var4);
      return true;
   }

   @Override
   public void uqb(OpaquePredicate var1, mew var2, ha9 var3) {
      this.zwd(var1, var2, var1.getBlockState(var2), var3);
   }

   private void zwd(OpaquePredicate param1, mew param2, zfz param3, ha9 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 4
      // 07: bipush 0
      // 08: invokevirtual ha9.ca2 (Z)Z
      // 0b: iload 5
      // 0d: ifne 44
      // 10: ifeq 89
      // 13: goto 1a
      // 16: invokestatic afi.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 4
      // 1c: getstatic l9p.ayi L_ss;
      // 1f: invokevirtual ha9.aex (L_ss;)V
      // 22: aload 4
      // 24: invokevirtual ha9.wvq ()Lwkk;
      // 27: bipush 2
      // 28: ldc 0.1
      // 2a: nop
      // 2b: invokevirtual wkk.wnm (IF)V
      // 2e: aload 3
      // 2f: getstatic afi.hdd L_ku;
      // 32: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 37: checkcast java/lang/Integer
      // 3a: invokevirtual java/lang/Integer.intValue ()I
      // 3d: goto 44
      // 40: invokestatic afi.a (Loov;)Loov;
      // 43: athrow
      // 44: istore 6
      // 46: iload 6
      // 48: iload 5
      // 4a: ifne 88
      // 4d: bipush 6
      // 4f: if_icmpge 7c
      // 52: goto 59
      // 55: invokestatic afi.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 1
      // 5a: aload 2
      // 5b: aload 3
      // 5c: getstatic afi.hdd L_ku;
      // 5f: iload 6
      // 61: bipush 1
      // 62: iadd
      // 63: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 66: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6b: bipush 3
      // 6c: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 6f: pop
      // 70: iload 5
      // 72: ifeq 89
      // 75: goto 7c
      // 78: invokestatic afi.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 1
      // 7d: aload 2
      // 7e: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 81: goto 88
      // 84: invokestatic afi.a (Loov;)Loov;
      // 87: athrow
      // 88: pop
      // 89: return
   }

   @Override
   public boolean ctq(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial e0x.ctq (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 25
      // 0e: ifeq 28
      // 11: goto 18
      // 14: invokestatic afi.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokespecial afi.zrr (Lt9d;Lmew;)Z
      // 1e: goto 25
      // 21: invokestatic afi.a (Loov;)Loov;
      // 24: athrow
      // 25: goto 29
      // 28: bipush 0
      // 29: ireturn
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokespecial afi.zrr (Lt9d;Lmew;)Z
      // 0b: iload 5
      // 0d: ifeq 26
      // 10: ifne 27
      // 13: goto 1a
      // 16: invokestatic afi.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 2
      // 1c: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 1f: goto 26
      // 22: invokestatic afi.a (Loov;)Loov;
      // 25: athrow
      // 26: pop
      // 27: return
   }

   private boolean zrr(OpaquePredicate var1, mew var2) {
      return var1.getBlockState(var2.eve()).r_y().p1r().gk6();
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.bsd;
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(hdd, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(hdd);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{hdd});
   }

   @Override
   public int mya(OpaquePredicate var1, mew var2) {
      return (7 - (Integer)var1.getBlockState(var2).dil(hdd)) * 2;
   }

   @Override
   public boolean ge5() {
      return true;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2710723127628960175L, 1503326656219822945L, MethodHandles.lookup().lookupClass()).a(194558857601740L);
      // $VF: monitorexit
      long var4 = var10000 ^ 121727424801630L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("þ,\u0012h±ýB[".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      hdd = _ku.wgl(var0, 0, 6);
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
