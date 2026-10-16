import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hkm extends m54 {
   public static final qx_ fdx;

   public hkm() {
      this.y8l(this._8_.c32().zvi(fdx, vt2.z9q));
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
      // 00: aload 1
      // 01: aload 2
      // 02: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 07: getstatic hkm.fdx Lqx_;
      // 0a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0f: checkcast vt2
      // 12: astore 4
      // 14: invokestatic t9d.c ()I
      // 17: ldc 0.28125
      // 19: nop
      // 1a: fstore 5
      // 1c: istore 3
      // 1d: ldc 0.78125
      // 1f: nop
      // 20: fstore 6
      // 22: fconst_0
      // 23: fstore 7
      // 25: fconst_1
      // 26: fstore 8
      // 28: ldc 0.125
      // 2a: nop
      // 2b: fstore 9
      // 2d: aload 0
      // 2e: fconst_0
      // 2f: fconst_0
      // 30: fconst_0
      // 31: fconst_1
      // 32: fconst_1
      // 33: fconst_1
      // 34: invokevirtual hkm.xl4 (FFFFFF)V
      // 37: iload 3
      // 38: ifne 80
      // 3b: getstatic hkm$1.bon [I
      // 3e: aload 4
      // 40: invokevirtual vt2.ordinal ()I
      // 43: iaload
      // 44: tableswitch 140 1 4 36 64 90 118
      // 64: invokestatic hkm.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: fload 7
      // 6b: fload 5
      // 6d: fconst_1
      // 6e: fload 9
      // 70: fsub
      // 71: fload 8
      // 73: fload 6
      // 75: fconst_1
      // 76: invokevirtual hkm.xl4 (FFFFFF)V
      // 79: goto 80
      // 7c: invokestatic hkm.a (Loov;)Loov;
      // 7f: athrow
      // 80: iload 3
      // 81: ifeq d0
      // 84: aload 0
      // 85: fload 7
      // 87: fload 5
      // 89: fconst_0
      // 8a: fload 8
      // 8c: fload 6
      // 8e: fload 9
      // 90: invokevirtual hkm.xl4 (FFFFFF)V
      // 93: iload 3
      // 94: ifeq d0
      // 97: goto 9e
      // 9a: invokestatic hkm.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 0
      // 9f: fconst_1
      // a0: fload 9
      // a2: fsub
      // a3: fload 5
      // a5: fload 7
      // a7: fconst_1
      // a8: fload 6
      // aa: fload 8
      // ac: invokevirtual hkm.xl4 (FFFFFF)V
      // af: iload 3
      // b0: ifeq d0
      // b3: goto ba
      // b6: invokestatic hkm.a (Loov;)Loov;
      // b9: athrow
      // ba: aload 0
      // bb: fconst_0
      // bc: fload 5
      // be: fload 7
      // c0: fload 9
      // c2: fload 6
      // c4: fload 8
      // c6: invokevirtual hkm.xl4 (FFFFFF)V
      // c9: goto d0
      // cc: invokestatic hkm.a (Loov;)Loov;
      // cf: athrow
      // d0: return
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
      // 06: getstatic hkm.fdx Lqx_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast vt2
      // 11: astore 6
      // 13: iload 5
      // 15: ifne 58
      // 18: aload 1
      // 19: aload 2
      // 1a: aload 6
      // 1c: invokevirtual vt2.b4b ()Lvt2;
      // 1f: invokevirtual mew.offset (Lvt2;)Lmew;
      // 22: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 25: invokeinterface zfz.r_y ()Le0x; 1
      // 2a: invokevirtual e0x.p1r ()Lp3y;
      // 2d: invokevirtual p3y.gk6 ()Z
      // 30: ifne 4f
      // 33: goto 3a
      // 36: invokestatic hkm.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: aload 3
      // 3e: bipush 0
      // 3f: invokevirtual hkm.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 42: aload 1
      // 43: aload 2
      // 44: invokevirtual t9d.i6x (Lmew;)Z
      // 47: pop
      // 48: goto 4f
      // 4b: invokestatic hkm.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: aload 1
      // 51: aload 2
      // 52: aload 3
      // 53: aload 4
      // 55: invokespecial m54.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 58: return
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: invokestatic vt2.jw6 (I)Lvt2;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 28
      // 0e: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 11: getstatic vt2$y0s.abn Lvt2$y0s;
      // 14: if_acmpne 29
      // 17: goto 1e
      // 1a: invokestatic hkm.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic vt2.z9q Lvt2;
      // 21: goto 28
      // 24: invokestatic hkm.a (Loov;)Loov;
      // 27: athrow
      // 28: astore 3
      // 29: aload 0
      // 2a: invokevirtual hkm.l4i ()Lzfz;
      // 2d: getstatic hkm.fdx Lqx_;
      // 30: aload 3
      // 31: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36: areturn
   }

   @Override
   public int hvp(zfz var1) {
      return ((vt2)var1.dil(fdx)).c3s();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{fdx});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6749050428981730954L, -3039658012309808702L, MethodHandles.lookup().lookupClass()).a(27923950559688L);
      // $VF: monitorexit
      long var4 = var10000 ^ 84565457850179L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u008eQGi\u001b\u009a!¬".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      fdx = qx_.q0o(var0, vt2$unz.fzl);
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
