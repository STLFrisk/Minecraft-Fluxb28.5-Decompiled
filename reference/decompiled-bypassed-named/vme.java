import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vme extends e0x {
   public static final _ku vx3;

   public vme() {
      super(p3y.nc7);
      this.y8l(this._8_.c32().zvi(vx3, 0));
      float var1 = 0.375F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 1.0F, 0.5F + var1);
      this._p_(true);
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: aload 1
      // 006: aload 2
      // 007: invokevirtual mew.eve ()Lmew;
      // 00a: iload 5
      // 00c: ifne 04d
      // 00f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 012: invokeinterface zfz.r_y ()Le0x; 1
      // 017: getstatic ox_.x65 Lvme;
      // 01a: if_acmpeq 041
      // 01d: goto 024
      // 020: invokestatic vme.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: aload 1
      // 026: aload 2
      // 027: aload 3
      // 028: invokevirtual vme.nqu (Lt9d;Lmew;Lzfz;)Z
      // 02b: iload 5
      // 02d: ifne 050
      // 030: goto 037
      // 033: invokestatic vme.a (Loov;)Loov;
      // 036: athrow
      // 037: ifeq 111
      // 03a: goto 041
      // 03d: invokestatic vme.a (Loov;)Loov;
      // 040: athrow
      // 041: aload 1
      // 042: aload 2
      // 043: invokevirtual mew.nuv ()Lmew;
      // 046: goto 04d
      // 049: invokestatic vme.a (Loov;)Loov;
      // 04c: athrow
      // 04d: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 050: iload 5
      // 052: ifne 060
      // 055: ifeq 111
      // 058: goto 05f
      // 05b: invokestatic vme.a (Loov;)Loov;
      // 05e: athrow
      // 05f: bipush 1
      // 060: istore 6
      // 062: aload 1
      // 063: aload 2
      // 064: iload 6
      // 066: invokevirtual mew.rb6 (I)Lmew;
      // 069: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 06c: invokeinterface zfz.r_y ()Le0x; 1
      // 071: aload 0
      // 072: if_acmpne 089
      // 075: iinc 6 1
      // 078: iload 5
      // 07a: ifne 111
      // 07d: iload 5
      // 07f: ifeq 062
      // 082: goto 089
      // 085: invokestatic vme.a (Loov;)Loov;
      // 088: athrow
      // 089: iload 6
      // 08b: iload 5
      // 08d: ifne 0b1
      // 090: bipush 3
      // 091: if_icmpge 111
      // 094: goto 09b
      // 097: invokestatic vme.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 3
      // 09c: getstatic vme.vx3 L_ku;
      // 09f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0a4: checkcast java/lang/Integer
      // 0a7: invokevirtual java/lang/Integer.intValue ()I
      // 0aa: goto 0b1
      // 0ad: invokestatic vme.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: istore 7
      // 0b3: iload 7
      // 0b5: iload 5
      // 0b7: ifne 110
      // 0ba: bipush 15
      // 0bc: if_icmpne 0f3
      // 0bf: goto 0c6
      // 0c2: invokestatic vme.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 1
      // 0c7: aload 2
      // 0c8: invokevirtual mew.nuv ()Lmew;
      // 0cb: aload 0
      // 0cc: invokevirtual vme.l4i ()Lzfz;
      // 0cf: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 0d2: pop
      // 0d3: aload 1
      // 0d4: aload 2
      // 0d5: aload 3
      // 0d6: getstatic vme.vx3 L_ku;
      // 0d9: bipush 0
      // 0da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0dd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0e2: bipush 4
      // 0e3: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0e6: pop
      // 0e7: iload 5
      // 0e9: ifeq 111
      // 0ec: goto 0f3
      // 0ef: invokestatic vme.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: aload 2
      // 0f5: aload 3
      // 0f6: getstatic vme.vx3 L_ku;
      // 0f9: iload 7
      // 0fb: bipush 1
      // 0fc: iadd
      // 0fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 100: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 105: bipush 4
      // 106: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 109: goto 110
      // 10c: invokestatic vme.a (Loov;)Loov;
      // 10f: athrow
      // 110: pop
      // 111: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual mew.eve ()Lmew;
      // 09: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: astore 4
      // 13: aload 4
      // 15: iload 3
      // 16: ifne 2c
      // 19: aload 0
      // 1a: if_acmpne 2a
      // 1d: goto 24
      // 20: invokestatic vme.a (Loov;)Loov;
      // 23: athrow
      // 24: bipush 1
      // 25: ireturn
      // 26: invokestatic vme.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 4
      // 2c: getstatic ox_.l11 Lx82;
      // 2f: iload 3
      // 30: ifne 54
      // 33: if_acmpeq 65
      // 36: goto 3d
      // 39: invokestatic vme.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 4
      // 3f: iload 3
      // 40: ifne 59
      // 43: goto 4a
      // 46: invokestatic vme.a (Loov;)Loov;
      // 49: athrow
      // 4a: getstatic ox_.kqk Le0x;
      // 4d: goto 54
      // 50: invokestatic vme.a (Loov;)Loov;
      // 53: athrow
      // 54: if_acmpeq 65
      // 57: aload 4
      // 59: getstatic ox_.vd0 Lpmc;
      // 5c: if_acmpeq 65
      // 5f: bipush 0
      // 60: ireturn
      // 61: invokestatic vme.a (Loov;)Loov;
      // 64: athrow
      // 65: getstatic vt2$unz.fzl Lvt2$unz;
      // 68: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 6b: astore 5
      // 6d: aload 5
      // 6f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 74: ifeq a8
      // 77: aload 5
      // 79: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7e: checkcast vt2
      // 81: astore 6
      // 83: aload 1
      // 84: aload 2
      // 85: aload 6
      // 87: invokevirtual mew.offset (Lvt2;)Lmew;
      // 8a: invokevirtual mew.eve ()Lmew;
      // 8d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 90: invokeinterface zfz.r_y ()Le0x; 1
      // 95: invokevirtual e0x.p1r ()Lp3y;
      // 98: getstatic p3y.six Lp3y;
      // 9b: if_acmpne a4
      // 9e: bipush 1
      // 9f: ireturn
      // a0: invokestatic vme.a (Loov;)Loov;
      // a3: athrow
      // a4: iload 3
      // a5: ifeq 6d
      // a8: bipush 0
      // a9: ireturn
   }

   @Override
   public void z3l(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
      this.nqu(var1, var2, var3);
   }

   public final boolean nqu(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual vme.rbp (Lt9d;Lmew;)Z
      // 0b: iload 4
      // 0d: ifeq 2f
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic vme.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic vme.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: bipush 0
      // 25: invokevirtual vme.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 28: aload 1
      // 29: aload 2
      // 2a: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 2d: pop
      // 2e: bipush 0
      // 2f: ireturn
   }

   public boolean rbp(OpaquePredicate var1, mew var2) {
      return this.ctq(var1, var2);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.cc5;
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
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.cc5;
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      return var1.getBiomeGenForCoords(var2).bib(var2);
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(vx3, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(vx3);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{vx3});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1377675577628266652L, 3966771088691541655L, MethodHandles.lookup().lookupClass()).a(228656324490264L);
      // $VF: monitorexit
      long var4 = var10000 ^ 16030295195572L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("{ë5\u00047½\u0085µ".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      vx3 = _ku.wgl(var0, 0, 15);
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
