import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityHopper;

public class a4v extends rw8 {
   public static final qx_ gu0;
   public static final h76 tzd;

   public a4v() {
      super(p3y.e21, _mi.eo9);
      this.y8l(this._8_.c32().zvi(gu0, vt2.m3r).zvi(tzd, true));
      this.i3l(uja.yj_);
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void c76(OpaquePredicate var1, mew var2, zfz var3, nh4 var4, List var5, EntityLivingBase var6) {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      float var7 = 0.125F;
      this.xl4(0.0F, 0.0F, 0.0F, var7, 1.0F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var7);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(1.0F - var7, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(0.0F, 0.0F, 1.0F - var7, 1.0F, 1.0F, 1.0F);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public zfz qk_(OpaquePredicate param1, mew param2, vt2 param3, float param4, float param5, float param6, int param7, Entity param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 3
      // 06: invokevirtual vt2.b4b ()Lvt2;
      // 09: astore 10
      // 0b: aload 10
      // 0d: iload 9
      // 0f: ifne 29
      // 12: getstatic vt2.rf3 Lvt2;
      // 15: if_acmpne 2b
      // 18: goto 1f
      // 1b: invokestatic a4v.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getstatic vt2.m3r Lvt2;
      // 22: goto 29
      // 25: invokestatic a4v.a (Loov;)Loov;
      // 28: athrow
      // 29: astore 10
      // 2b: aload 0
      // 2c: invokevirtual a4v.l4i ()Lzfz;
      // 2f: getstatic a4v.gu0 Lqx_;
      // 32: aload 10
      // 34: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 39: getstatic a4v.tzd Lh76;
      // 3c: bipush 1
      // 3d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 40: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 45: areturn
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntityHopper();
   }

   @Override
   public void qh0(OpaquePredicate param1, mew param2, zfz param3, Entity param4, erg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: aload 4
      // 0b: aload 5
      // 0d: invokespecial rw8.qh0 (Lt9d;Lmew;Lzfz;Lg_3;Lerg;)V
      // 10: aload 5
      // 12: invokevirtual erg.x4w ()Z
      // 15: ifeq 47
      // 18: aload 1
      // 19: aload 2
      // 1a: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 1d: astore 7
      // 1f: aload 7
      // 21: iload 6
      // 23: ifne 3c
      // 26: instanceof net/minecraft/tileentity/TileEntityHopper
      // 29: ifeq 47
      // 2c: goto 33
      // 2f: invokestatic a4v.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 7
      // 35: goto 3c
      // 38: invokestatic a4v.a (Loov;)Loov;
      // 3b: athrow
      // 3c: checkcast net/minecraft/tileentity/TileEntityHopper
      // 3f: aload 5
      // 41: invokevirtual erg.zow ()Ljava/lang/String;
      // 44: invokevirtual net/minecraft/tileentity/TileEntityHopper.owa (Ljava/lang/String;)V
      // 47: return
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      this.isv(var1, var2, var3);
   }

   @Override
   public boolean cl2(OpaquePredicate param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: iload 9
      // 08: ifne 1f
      // 0b: getfield OpaquePredicate.v0f Z
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic a4v.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic a4v.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntityHopper
      // 2a: iload 9
      // 2c: ifne 53
      // 2f: ifeq 52
      // 32: goto 39
      // 35: invokestatic a4v.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: aload 10
      // 3d: checkcast net/minecraft/tileentity/TileEntityHopper
      // 40: invokevirtual ha9.a_o (Lrsi;)V
      // 43: aload 4
      // 45: getstatic l9p.x79 L_ss;
      // 48: invokevirtual ha9.aex (L_ss;)V
      // 4b: goto 52
      // 4e: invokestatic a4v.a (Loov;)Loov;
      // 51: athrow
      // 52: bipush 1
      // 53: ireturn
   }

   @Override
   public void z3l(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
      this.isv(var1, var2, var3);
   }

   private void isv(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 0a: iload 4
      // 0c: ifeq 1a
      // 0f: ifne 1d
      // 12: goto 19
      // 15: invokestatic a4v.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 1e
      // 1d: bipush 0
      // 1e: istore 5
      // 20: iload 5
      // 22: iload 4
      // 24: ifeq 5b
      // 27: aload 3
      // 28: getstatic a4v.tzd Lh76;
      // 2b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 30: checkcast java/lang/Boolean
      // 33: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 36: if_icmpeq 5c
      // 39: goto 40
      // 3c: invokestatic a4v.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 1
      // 41: aload 2
      // 42: aload 3
      // 43: getstatic a4v.tzd Lh76;
      // 46: iload 5
      // 48: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 50: bipush 4
      // 51: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 54: goto 5b
      // 57: invokestatic a4v.a (Loov;)Loov;
      // 5a: athrow
      // 5b: pop
      // 5c: return
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 0a: astore 5
      // 0c: iload 4
      // 0e: ifeq 3e
      // 11: aload 5
      // 13: instanceof net/minecraft/tileentity/TileEntityHopper
      // 16: ifeq 37
      // 19: goto 20
      // 1c: invokestatic a4v.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: aload 5
      // 24: checkcast net/minecraft/tileentity/TileEntityHopper
      // 27: invokestatic py1.hkj (Lt9d;Lmew;Lrsi;)V
      // 2a: aload 1
      // 2b: aload 2
      // 2c: aload 0
      // 2d: invokevirtual OpaquePredicate.lw8 (Lmew;Le0x;)V
      // 30: goto 37
      // 33: invokestatic a4v.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: aload 2
      // 3a: aload 3
      // 3b: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // 3e: return
   }

   @Override
   public int kfj() {
      return 3;
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
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      return true;
   }

   public static vt2 fb4(int var0) {
      return vt2.jw6(var0 & 7);
   }

   public static boolean wu4(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: bipush 8
      // 07: iand
      // 08: iload 1
      // 09: ifeq 20
      // 0c: bipush 8
      // 0e: if_icmpeq 23
      // 11: goto 18
      // 14: invokestatic a4v.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 20
      // 1c: invokestatic a4v.a (Loov;)Loov;
      // 1f: athrow
      // 20: goto 24
      // 23: bipush 0
      // 24: ireturn
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(OpaquePredicate var1, mew var2) {
      return _jc.nuj(var1.getTileEntity(var2));
   }

   @Override
   public w51 w3x() {
      return w51.oja;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(gu0, fb4(var1)).zvi(tzd, wu4(var1));
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.c();
      var3 |= ((vt2)var1.dil(gu0)).c3s();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(tzd);
         if (var2 != 0) {
            return var6;
         }

         if (var6 != 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 8;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{gu0, tzd});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7613030100103452532L, 2683325696930862045L, MethodHandles.lookup().lookupClass()).a(101843808039452L);
      // $VF: monitorexit
      long var10 = var10000 ^ 110616499038441L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "7~ÀÃá\u0007EJ\bû\u009b\no\u0002O¾\u001e";
      int var7 = "7~ÀÃá\u0007EJ\bû\u009b\no\u0002O¾\u001e".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            gu0 = qx_.q0o(var8[1], new a4v$1());
            tzd = h76.d_1(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
      }
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
