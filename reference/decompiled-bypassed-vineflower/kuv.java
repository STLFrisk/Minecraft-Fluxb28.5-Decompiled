import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kuv extends e0x {
   public static final _ku he2;

   public kuv() {
      super(p3y.kjn);
      this.y8l(this._8_.c32().zvi(he2, 0));
      this._p_(true);
      this.i3l(uja.qqf);
   }

   @Override
   public void zvy(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 2
      // 06: invokevirtual mew.nuv ()Lmew;
      // 09: astore 6
      // 0b: aload 1
      // 0c: aload 6
      // 0e: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 11: iload 5
      // 13: ifeq 21
      // 16: ifeq d7
      // 19: goto 20
      // 1c: invokestatic kuv.a (Loov;)Loov;
      // 1f: athrow
      // 20: bipush 1
      // 21: istore 7
      // 23: aload 1
      // 24: aload 2
      // 25: iload 7
      // 27: invokevirtual mew.rb6 (I)Lmew;
      // 2a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2d: invokeinterface zfz.r_y ()Le0x; 1
      // 32: aload 0
      // 33: if_acmpne 4a
      // 36: iinc 7 1
      // 39: iload 5
      // 3b: ifeq d7
      // 3e: iload 5
      // 40: ifne 23
      // 43: goto 4a
      // 46: invokestatic kuv.a (Loov;)Loov;
      // 49: athrow
      // 4a: iload 7
      // 4c: iload 5
      // 4e: ifeq 72
      // 51: bipush 3
      // 52: if_icmpge d7
      // 55: goto 5c
      // 58: invokestatic kuv.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 3
      // 5d: getstatic kuv.he2 L_ku;
      // 60: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 65: checkcast java/lang/Integer
      // 68: invokevirtual java/lang/Integer.intValue ()I
      // 6b: goto 72
      // 6e: invokestatic kuv.a (Loov;)Loov;
      // 71: athrow
      // 72: istore 8
      // 74: iload 8
      // 76: iload 5
      // 78: ifeq d6
      // 7b: bipush 15
      // 7d: if_icmpne b9
      // 80: goto 87
      // 83: invokestatic kuv.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 1
      // 88: aload 6
      // 8a: aload 0
      // 8b: invokevirtual kuv.l4i ()Lzfz;
      // 8e: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 91: pop
      // 92: aload 3
      // 93: getstatic kuv.he2 L_ku;
      // 96: bipush 0
      // 97: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 9f: astore 9
      // a1: aload 1
      // a2: aload 2
      // a3: aload 9
      // a5: bipush 4
      // a6: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // a9: pop
      // aa: aload 0
      // ab: aload 1
      // ac: aload 6
      // ae: aload 9
      // b0: aload 0
      // b1: invokevirtual kuv.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // b4: iload 5
      // b6: ifne d7
      // b9: aload 1
      // ba: aload 2
      // bb: aload 3
      // bc: getstatic kuv.he2 L_ku;
      // bf: iload 8
      // c1: bipush 1
      // c2: iadd
      // c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c6: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // cb: bipush 4
      // cc: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // cf: goto d6
      // d2: invokestatic kuv.a (Loov;)Loov;
      // d5: athrow
      // d6: pop
      // d7: return
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      float var4 = 0.0625F;
      return new nh4(
         (double)((float)var2.getX() + var4),
         (double)var2.getY(),
         (double)((float)var2.getZ() + var4),
         (double)((float)(var2.getX() + 1) - var4),
         (double)((float)(var2.getY() + 1) - var4),
         (double)((float)(var2.getZ() + 1) - var4)
      );
   }

   @Override
   public nh4 j54(t9d var1, mew var2) {
      float var3 = 0.0625F;
      return new nh4(
         (double)((float)var2.getX() + var3),
         (double)var2.getY(),
         (double)((float)var2.getZ() + var3),
         (double)((float)(var2.getX() + 1) - var3),
         (double)(var2.getY() + 1),
         (double)((float)(var2.getZ() + 1) - var3)
      );
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
   public boolean ctq(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial e0x.ctq (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 25
      // 0e: ifeq 28
      // 11: goto 18
      // 14: invokestatic kuv.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokevirtual kuv.cwa (Lt9d;Lmew;)Z
      // 1e: goto 25
      // 21: invokestatic kuv.a (Loov;)Loov;
      // 24: athrow
      // 25: goto 29
      // 28: bipush 0
      // 29: ireturn
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual kuv.cwa (Lt9d;Lmew;)Z
      // 0b: iload 5
      // 0d: ifeq 27
      // 10: ifne 28
      // 13: goto 1a
      // 16: invokestatic kuv.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: aload 2
      // 1c: bipush 1
      // 1d: invokevirtual t9d.yir (Lmew;Z)Z
      // 20: goto 27
      // 23: invokestatic kuv.a (Loov;)Loov;
      // 26: athrow
      // 27: pop
      // 28: return
   }

   public boolean cwa(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: getstatic vt2$unz.fzl Lvt2$unz;
      // 07: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 0a: astore 4
      // 0c: aload 4
      // 0e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13: ifeq 56
      // 16: aload 4
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast vt2
      // 20: astore 5
      // 22: aload 1
      // 23: aload 2
      // 24: aload 5
      // 26: invokevirtual mew.offset (Lvt2;)Lmew;
      // 29: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2c: invokeinterface zfz.r_y ()Le0x; 1
      // 31: iload 3
      // 32: ifne 63
      // 35: invokevirtual e0x.p1r ()Lp3y;
      // 38: invokevirtual p3y.gk6 ()Z
      // 3b: iload 3
      // 3c: ifne 51
      // 3f: goto 46
      // 42: invokestatic kuv.a (Loov;)Loov;
      // 45: athrow
      // 46: ifeq 52
      // 49: goto 50
      // 4c: invokestatic kuv.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 0
      // 51: ireturn
      // 52: iload 3
      // 53: ifeq 0c
      // 56: aload 1
      // 57: aload 2
      // 58: invokevirtual mew.eve ()Lmew;
      // 5b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 5e: invokeinterface zfz.r_y ()Le0x; 1
      // 63: astore 4
      // 65: aload 4
      // 67: iload 3
      // 68: ifne 81
      // 6b: getstatic ox_.hio Lkuv;
      // 6e: if_acmpeq 87
      // 71: goto 78
      // 74: invokestatic kuv.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 4
      // 7a: goto 81
      // 7d: invokestatic kuv.a (Loov;)Loov;
      // 80: athrow
      // 81: getstatic ox_.vd0 Lpmc;
      // 84: if_acmpne 8f
      // 87: bipush 1
      // 88: goto 90
      // 8b: invokestatic kuv.a (Loov;)Loov;
      // 8e: athrow
      // 8f: bipush 0
      // 90: ireturn
   }

   @Override
   public void n9e(t9d var1, mew var2, zfz var3, i2h var4) {
      var4.m1t(ofh.xv5, 1.0F);
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(he2, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(he2);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{he2});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5466872773428473559L, 1004724744631023913L, MethodHandles.lookup().lookupClass()).a(239997612144612L);
      // $VF: monitorexit
      long var4 = var10000 ^ 79557140837501L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("BýÇ\u0003\u008b#\u00871".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      he2 = _ku.wgl(var0, 0, 15);
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
