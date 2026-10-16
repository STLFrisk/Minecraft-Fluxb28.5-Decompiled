import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f_b extends e0x {
   public static final qx_ ibr;

   public f_b() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(ibr, vt2.z9q));
      this.i3l(uja.qqf);
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      this.c7i(var1, var2);
      return super.m__(var1, var2, var3);
   }

   @Override
   public nh4 j54(t9d var1, mew var2) {
      this.c7i(var1, var2);
      return super.j54(var1, var2);
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: astore 4
      // 0d: aload 4
      // 0f: invokeinterface zfz.r_y ()Le0x; 1
      // 14: aload 0
      // 15: if_acmpne b0
      // 18: ldc 0.125
      // 1a: nop
      // 1b: fstore 5
      // 1d: iload 3
      // 1e: ifeq 6c
      // 21: getstatic f_b$1.ray [I
      // 24: aload 4
      // 26: getstatic f_b.ibr Lqx_;
      // 29: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2e: checkcast vt2
      // 31: invokevirtual vt2.ordinal ()I
      // 34: iaload
      // 35: tableswitch 105 1 4 35 59 81 105
      // 54: invokestatic f_b.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: fconst_0
      // 5a: fconst_0
      // 5b: fconst_1
      // 5c: fload 5
      // 5e: fsub
      // 5f: fconst_1
      // 60: fconst_1
      // 61: fconst_1
      // 62: invokevirtual f_b.xl4 (FFFFFF)V
      // 65: goto 6c
      // 68: invokestatic f_b.a (Loov;)Loov;
      // 6b: athrow
      // 6c: iload 3
      // 6d: ifne b0
      // 70: aload 0
      // 71: fconst_0
      // 72: fconst_0
      // 73: fconst_0
      // 74: fconst_1
      // 75: fconst_1
      // 76: fload 5
      // 78: invokevirtual f_b.xl4 (FFFFFF)V
      // 7b: iload 3
      // 7c: ifne b0
      // 7f: goto 86
      // 82: invokestatic f_b.a (Loov;)Loov;
      // 85: athrow
      // 86: aload 0
      // 87: fconst_1
      // 88: fload 5
      // 8a: fsub
      // 8b: fconst_0
      // 8c: fconst_0
      // 8d: fconst_1
      // 8e: fconst_1
      // 8f: fconst_1
      // 90: invokevirtual f_b.xl4 (FFFFFF)V
      // 93: iload 3
      // 94: ifne b0
      // 97: goto 9e
      // 9a: invokestatic f_b.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 0
      // 9f: fconst_0
      // a0: fconst_0
      // a1: fconst_0
      // a2: fload 5
      // a4: fconst_1
      // a5: fconst_1
      // a6: invokevirtual f_b.xl4 (FFFFFF)V
      // a9: goto b0
      // ac: invokestatic f_b.a (Loov;)Loov;
      // af: athrow
      // b0: return
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
   public boolean ctq(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual mew.y8e ()Lmew;
      // 09: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: invokevirtual e0x.y0n ()Z
      // 14: iload 3
      // 15: ifne 3a
      // 18: ifeq 2a
      // 1b: goto 22
      // 1e: invokestatic f_b.a (Loov;)Loov;
      // 21: athrow
      // 22: bipush 1
      // 23: goto 86
      // 26: invokestatic f_b.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: aload 2
      // 2c: invokevirtual mew.o_8 ()Lmew;
      // 2f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 32: invokeinterface zfz.r_y ()Le0x; 1
      // 37: invokevirtual e0x.y0n ()Z
      // 3a: iload 3
      // 3b: ifne 6b
      // 3e: ifeq 50
      // 41: goto 48
      // 44: invokestatic f_b.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 86
      // 4c: invokestatic f_b.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: aload 2
      // 52: invokevirtual mew.idu ()Lmew;
      // 55: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 58: invokeinterface zfz.r_y ()Le0x; 1
      // 5d: iload 3
      // 5e: ifne 83
      // 61: invokevirtual e0x.y0n ()Z
      // 64: goto 6b
      // 67: invokestatic f_b.a (Loov;)Loov;
      // 6a: athrow
      // 6b: ifeq 76
      // 6e: bipush 1
      // 6f: goto 86
      // 72: invokestatic f_b.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 1
      // 77: aload 2
      // 78: invokevirtual mew.z6x ()Lmew;
      // 7b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7e: invokeinterface zfz.r_y ()Le0x; 1
      // 83: invokevirtual e0x.y0n ()Z
      // 86: ireturn
   }

   @Override
   public zfz qk_(t9d param1, mew param2, vt2 param3, float param4, float param5, float param6, int param7, g_3 param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 3
      // 06: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 09: invokevirtual vt2$y0s.pyt ()Z
      // 0c: iload 9
      // 0e: ifeq 35
      // 11: ifeq 46
      // 14: goto 1b
      // 17: invokestatic f_b.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 9
      // 1e: ifeq 39
      // 21: goto 28
      // 24: invokestatic f_b.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 1
      // 29: aload 2
      // 2a: aload 3
      // 2b: invokevirtual f_b.v61 (Lt9d;Lmew;Lvt2;)Z
      // 2e: goto 35
      // 31: invokestatic f_b.a (Loov;)Loov;
      // 34: athrow
      // 35: ifeq 46
      // 38: aload 0
      // 39: invokevirtual f_b.l4i ()Lzfz;
      // 3c: getstatic f_b.ibr Lqx_;
      // 3f: aload 3
      // 40: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 45: areturn
      // 46: getstatic vt2$unz.fzl Lvt2$unz;
      // 49: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 4c: astore 10
      // 4e: aload 10
      // 50: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55: ifeq a2
      // 58: aload 10
      // 5a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5f: checkcast vt2
      // 62: astore 11
      // 64: aload 0
      // 65: iload 9
      // 67: ifeq a3
      // 6a: iload 9
      // 6c: ifeq 8f
      // 6f: goto 76
      // 72: invokestatic f_b.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 1
      // 77: aload 2
      // 78: aload 11
      // 7a: invokevirtual f_b.v61 (Lt9d;Lmew;Lvt2;)Z
      // 7d: ifeq 9d
      // 80: goto 87
      // 83: invokestatic f_b.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 0
      // 88: goto 8f
      // 8b: invokestatic f_b.a (Loov;)Loov;
      // 8e: athrow
      // 8f: invokevirtual f_b.l4i ()Lzfz;
      // 92: getstatic f_b.ibr Lqx_;
      // 95: aload 11
      // 97: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 9c: areturn
      // 9d: iload 9
      // 9f: ifne 4e
      // a2: aload 0
      // a3: invokevirtual f_b.l4i ()Lzfz;
      // a6: areturn
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic f_b.ibr Lqx_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast vt2
      // 11: astore 6
      // 13: aload 0
      // 14: aload 1
      // 15: aload 2
      // 16: iload 5
      // 18: ifne 42
      // 1b: aload 6
      // 1d: invokevirtual f_b.v61 (Lt9d;Lmew;Lvt2;)Z
      // 20: ifne 3f
      // 23: goto 2a
      // 26: invokestatic f_b.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 1
      // 2c: aload 2
      // 2d: aload 3
      // 2e: bipush 0
      // 2f: invokevirtual f_b.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 32: aload 1
      // 33: aload 2
      // 34: invokevirtual t9d.i6x (Lmew;)Z
      // 37: pop
      // 38: goto 3f
      // 3b: invokestatic f_b.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: aload 1
      // 41: aload 2
      // 42: aload 3
      // 43: aload 4
      // 45: invokespecial e0x.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 48: return
   }

   public boolean v61(t9d var1, mew var2, vt2 var3) {
      return var1.getBlockState(var2.offset(var3.b4b())).r_y().y0n();
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
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
      // 1a: invokestatic f_b.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic vt2.z9q Lvt2;
      // 21: goto 28
      // 24: invokestatic f_b.a (Loov;)Loov;
      // 27: athrow
      // 28: astore 3
      // 29: aload 0
      // 2a: invokevirtual f_b.l4i ()Lzfz;
      // 2d: getstatic f_b.ibr Lqx_;
      // 30: aload 3
      // 31: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36: areturn
   }

   @Override
   public int hvp(zfz var1) {
      return ((vt2)var1.dil(ibr)).c3s();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{ibr});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9216265114058385519L, -8593603982357879382L, MethodHandles.lookup().lookupClass()).a(184083060581131L);
      // $VF: monitorexit
      long var4 = var10000 ^ 37294254692896L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("º\u0091\u000eìÃU<y".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      ibr = qx_.q0o(var0, vt2$unz.fzl);
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
