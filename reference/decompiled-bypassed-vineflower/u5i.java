import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityEnderChest;

public class u5i extends rw8 {
   public static final qx_ rqs;

   public u5i() {
      super(p3y.zs8);
      this.y8l(this._8_.c32().zvi(rqs, vt2.z9q));
      this.i3l(uja.qqf);
      this.xl4(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public int kfj() {
      return 2;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.j4y);
   }

   @Override
   public int bzr(Random var1) {
      return 8;
   }

   @Override
   public boolean row() {
      return true;
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      return this.l4i().zvi(rqs, var8.u0f().b4b());
   }

   @Override
   public void qh0(t9d var1, mew var2, zfz var3, g_3 var4, erg var5) {
      var1.vct(var2, var3.zvi(rqs, var4.u0f().b4b()), 2);
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 4
      // 02: invokevirtual ha9.uzq ()Lctr;
      // 05: astore 10
      // 07: invokestatic t9d.b ()I
      // 0a: aload 1
      // 0b: aload 2
      // 0c: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 0f: astore 11
      // 11: istore 9
      // 13: aload 10
      // 15: ifnull 93
      // 18: aload 11
      // 1a: instanceof net/minecraft/tileentity/TileEntityEnderChest
      // 1d: iload 9
      // 1f: ifeq 94
      // 22: goto 29
      // 25: invokestatic u5i.a (Loov;)Loov;
      // 28: athrow
      // 29: ifeq 93
      // 2c: goto 33
      // 2f: invokestatic u5i.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: aload 2
      // 35: invokevirtual mew.nuv ()Lmew;
      // 38: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3b: invokeinterface zfz.r_y ()Le0x; 1
      // 40: invokevirtual e0x.y0n ()Z
      // 43: iload 9
      // 45: ifeq 63
      // 48: goto 4f
      // 4b: invokestatic u5i.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifeq 5f
      // 52: goto 59
      // 55: invokestatic u5i.a (Loov;)Loov;
      // 58: athrow
      // 59: bipush 1
      // 5a: ireturn
      // 5b: invokestatic u5i.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 1
      // 60: getfield t9d.v0f Z
      // 63: iload 9
      // 65: ifeq 92
      // 68: ifeq 78
      // 6b: goto 72
      // 6e: invokestatic u5i.a (Loov;)Loov;
      // 71: athrow
      // 72: bipush 1
      // 73: ireturn
      // 74: invokestatic u5i.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 10
      // 7a: aload 11
      // 7c: checkcast net/minecraft/tileentity/TileEntityEnderChest
      // 7f: invokevirtual ctr.rzk (Lnet/minecraft/tileentity/TileEntityEnderChest;)V
      // 82: aload 4
      // 84: aload 10
      // 86: invokevirtual ha9.a_o (Lrsi;)V
      // 89: aload 4
      // 8b: getstatic l9p.d_b L_ss;
      // 8e: invokevirtual ha9.aex (L_ss;)V
      // 91: bipush 1
      // 92: ireturn
      // 93: bipush 1
      // 94: ireturn
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityEnderChest();
   }

   @Override
   public void kyo(t9d var1, mew var2, zfz var3, Random var4) {
      int var5 = t9d.c();
      int var6 = 0;

      while (var6 < 3) {
         int var7 = var4.nextInt(2) * 2 - 1;
         int var8 = var4.nextInt(2) * 2 - 1;
         double var9 = (double)var2.getX() + 0.5 + 0.25 * (double)var7;
         double var11 = (double)((float)var2.getY() + var4.nextFloat());
         double var13 = (double)var2.getZ() + 0.5 + 0.25 * (double)var8;
         double var15 = (double)(var4.nextFloat() * (float)var7);
         double var17 = ((double)var4.nextFloat() - 0.5) * 0.125;
         double var19 = (double)(var4.nextFloat() * (float)var8);
         var1.zvy(w_0.t9k, var9, var11, var13, var15, var17, var19, new int[0]);
         var6++;
         if (var5 != 0) {
            break;
         }
      }
   }

   @Override
   public zfz kig(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: invokestatic vt2.jw6 (I)Lvt2;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifeq 28
      // 0e: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 11: getstatic vt2$y0s.abn Lvt2$y0s;
      // 14: if_acmpne 29
      // 17: goto 1e
      // 1a: invokestatic u5i.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic vt2.z9q Lvt2;
      // 21: goto 28
      // 24: invokestatic u5i.a (Loov;)Loov;
      // 27: athrow
      // 28: astore 3
      // 29: aload 0
      // 2a: invokevirtual u5i.l4i ()Lzfz;
      // 2d: getstatic u5i.rqs Lqx_;
      // 30: aload 3
      // 31: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36: areturn
   }

   @Override
   public int hvp(zfz var1) {
      return ((vt2)var1.dil(rqs)).c3s();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{rqs});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7274655477351228843L, -2521478382575921289L, MethodHandles.lookup().lookupClass()).a(67105656781608L);
      // $VF: monitorexit
      long var4 = var10000 ^ 102314766781961L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("ÐÂ×\u0084t!Qf".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      rqs = qx_.q0o(var0, vt2$unz.fzl);
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
