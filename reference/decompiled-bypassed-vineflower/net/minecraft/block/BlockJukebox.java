package net.minecraft.block;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class BlockJukebox extends rw8 {
   public static final h76 zgd;

   public BlockJukebox() {
      super(p3y.fdu, _mi.pzg);
      String[] var10000 = g_3.a();
      this.y8l(this._8_.c32().zvi(zgd, false));
      String[] var1 = var10000;

      try {
         this.i3l(uja.qqf);
         if (var1 == null) {
            i2h.b(new i2h[2]);
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   @Override
   public boolean cl2(t9d var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      String[] var9 = g_3.a();

      label27: {
         try {
            boolean var10000 = (Boolean)var3.dil(zgd);
            if (var9 == null) {
               return var10000;
            }

            if (var10000) {
               break label27;
            }
         } catch (oov var10) {
            throw a(var10);
         }

         return false;
      }

      this.rco(var1, var2, var3);
      var3 = var3.zvi(zgd, false);
      var1.vct(var2, var3, 2);
      return true;
   }

   public void m9i(t9d param1, mew param2, zfz param3, erg param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic g_3.a ()[Ljava/lang/String;
      // 03: astore 5
      // 05: aload 1
      // 06: aload 5
      // 08: ifnull 20
      // 0b: getfield t9d.v0f Z
      // 0e: ifne 6f
      // 11: goto 18
      // 14: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 24: astore 6
      // 26: aload 6
      // 28: instanceof net/minecraft/block/BlockJukebox$TileEntityJukebox
      // 2b: aload 5
      // 2d: ifnull 6e
      // 30: ifeq 6f
      // 33: goto 3a
      // 36: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 6
      // 3c: checkcast net/minecraft/block/BlockJukebox$TileEntityJukebox
      // 3f: new erg
      // 42: dup
      // 43: aload 4
      // 45: invokevirtual erg.gn1 ()Lu7m;
      // 48: bipush 1
      // 49: aload 4
      // 4b: invokevirtual erg.j6_ ()I
      // 4e: invokespecial erg.<init> (Lu7m;II)V
      // 51: invokevirtual net/minecraft/block/BlockJukebox$TileEntityJukebox.n50 (Lerg;)V
      // 54: aload 1
      // 55: aload 2
      // 56: aload 3
      // 57: getstatic net/minecraft/block/BlockJukebox.zgd Lh76;
      // 5a: bipush 1
      // 5b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 63: bipush 2
      // 64: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 67: goto 6e
      // 6a: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 6d: athrow
      // 6e: pop
      // 6f: return
   }

   private void rco(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic g_3.a ()[Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: aload 4
      // 008: ifnull 020
      // 00b: getfield t9d.v0f Z
      // 00e: ifne 107
      // 011: goto 018
      // 014: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: goto 020
      // 01c: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 2
      // 021: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 024: astore 5
      // 026: aload 5
      // 028: aload 4
      // 02a: ifnull 043
      // 02d: instanceof net/minecraft/block/BlockJukebox$TileEntityJukebox
      // 030: ifeq 107
      // 033: goto 03a
      // 036: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 5
      // 03c: goto 043
      // 03f: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 042: athrow
      // 043: checkcast net/minecraft/block/BlockJukebox$TileEntityJukebox
      // 046: astore 6
      // 048: aload 6
      // 04a: invokevirtual net/minecraft/block/BlockJukebox$TileEntityJukebox.abl ()Lerg;
      // 04d: astore 7
      // 04f: aload 4
      // 051: ifnull 082
      // 054: aload 7
      // 056: ifnull 107
      // 059: goto 060
      // 05c: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 1
      // 061: sipush 1005
      // 064: aload 2
      // 065: bipush 0
      // 066: invokevirtual t9d.qca (ILmew;I)V
      // 069: aload 1
      // 06a: aload 2
      // 06b: aconst_null
      // 06c: checkcast java/lang/String
      // 06f: invokevirtual t9d.moa (Lmew;Ljava/lang/String;)V
      // 072: aload 6
      // 074: aconst_null
      // 075: checkcast erg
      // 078: invokevirtual net/minecraft/block/BlockJukebox$TileEntityJukebox.n50 (Lerg;)V
      // 07b: goto 082
      // 07e: invokestatic net/minecraft/block/BlockJukebox.a (Loov;)Loov;
      // 081: athrow
      // 082: ldc 0.7
      // 084: nop
      // 085: fstore 8
      // 087: aload 1
      // 088: getfield t9d.fsy Ljava/util/Random;
      // 08b: invokevirtual java/util/Random.nextFloat ()F
      // 08e: fload 8
      // 090: fmul
      // 091: f2d
      // 092: fconst_1
      // 093: fload 8
      // 095: fsub
      // 096: f2d
      // 097: ldc2_w 0.5
      // 09a: dmul
      // 09b: dadd
      // 09c: dstore 9
      // 09e: aload 1
      // 09f: getfield t9d.fsy Ljava/util/Random;
      // 0a2: invokevirtual java/util/Random.nextFloat ()F
      // 0a5: fload 8
      // 0a7: fmul
      // 0a8: f2d
      // 0a9: fconst_1
      // 0aa: fload 8
      // 0ac: fsub
      // 0ad: f2d
      // 0ae: ldc2_w 0.2
      // 0b1: dmul
      // 0b2: dadd
      // 0b3: ldc2_w 0.6
      // 0b6: dadd
      // 0b7: dstore 11
      // 0b9: aload 1
      // 0ba: getfield t9d.fsy Ljava/util/Random;
      // 0bd: invokevirtual java/util/Random.nextFloat ()F
      // 0c0: fload 8
      // 0c2: fmul
      // 0c3: f2d
      // 0c4: fconst_1
      // 0c5: fload 8
      // 0c7: fsub
      // 0c8: f2d
      // 0c9: ldc2_w 0.5
      // 0cc: dmul
      // 0cd: dadd
      // 0ce: dstore 13
      // 0d0: aload 7
      // 0d2: invokevirtual erg.yaq ()Lerg;
      // 0d5: astore 15
      // 0d7: new nvf
      // 0da: dup
      // 0db: aload 1
      // 0dc: aload 2
      // 0dd: invokevirtual mew.getX ()I
      // 0e0: i2d
      // 0e1: dload 9
      // 0e3: dadd
      // 0e4: aload 2
      // 0e5: invokevirtual mew.getY ()I
      // 0e8: i2d
      // 0e9: dload 11
      // 0eb: dadd
      // 0ec: aload 2
      // 0ed: invokevirtual mew.getZ ()I
      // 0f0: i2d
      // 0f1: dload 13
      // 0f3: dadd
      // 0f4: aload 15
      // 0f6: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 0f9: astore 16
      // 0fb: aload 16
      // 0fd: invokevirtual nvf.zc4 ()V
      // 100: aload 1
      // 101: aload 16
      // 103: invokevirtual t9d.xzq (Li2h;)Z
      // 106: pop
      // 107: return
   }

   @Override
   public void b8f(t9d var1, mew var2, zfz var3) {
      this.rco(var1, var2, var3);
      super.b8f(var1, var2, var3);
   }

   @Override
   public void ix7(t9d var1, mew var2, zfz var3, float var4, int var5) {
      try {
         if (!var1.v0f) {
            super.ix7(var1, var2, var3, var4, 0);
         }
      } catch (oov var6) {
         throw a(var6);
      }
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new BlockJukebox$TileEntityJukebox();
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(t9d var1, mew var2) {
      String[] var3 = g_3.a();
      pyk var4 = var1.getTileEntity(var2);

      try {
         byte var10000 = var4 instanceof BlockJukebox$TileEntityJukebox;
         if (var3 == null) {
            return var10000;
         }

         if (var10000 == 0) {
            return 0;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      erg var5 = ((BlockJukebox$TileEntityJukebox)var4).abl();

      try {
         if (var3 == null) {
            return u7m._lo(var5.gn1()) + 1 - u7m._lo(xbr.o30);
         }

         if (var5 != null) {
            return u7m._lo(var5.gn1()) + 1 - u7m._lo(xbr.o30);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return 0;
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public zfz kig(int var1) {
      String[] var2 = g_3.a();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i();
         var10001 = zgd;
         if (var2 == null) {
            return var10000.zvi(zgd, Boolean.valueOf((boolean)var1));
         }

         if (var1 > 0) {
            return var10000.zvi(zgd, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      String[] var2 = g_3.a();

      try {
         byte var10000 = (Boolean)var1.dil(zgd);
         if (var2 == null) {
            return var10000;
         }

         if (var10000 != 0) {
            return 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{zgd});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4800461997489096835L, -6089720520429679204L, MethodHandles.lookup().lookupClass()).a(145936963770231L);
      // $VF: monitorexit
      long var4 = var10000 ^ 121681699672161L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("9\u001e¡\u0087jhÎ?FòL:ºÙÆ¤".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      zgd = h76.d_1(var0);
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
