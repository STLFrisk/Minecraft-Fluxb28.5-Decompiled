import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ywl extends e0x {
   public static final zb_ _tj;

   public ywl() {
      super(p3y.zs8);
      this.y8l(this._8_.c32().zvi(_tj, ywl$iai.o86));
      this.i3l(uja.mqu);
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
      // 05: iload 7
      // 07: getstatic ywl$iai.vo4 Lywl$iai;
      // 0a: invokevirtual ywl$iai.ofo ()I
      // 0d: iload 9
      // 0f: ifne 80
      // 12: if_icmpne 78
      // 15: goto 1c
      // 18: invokestatic ywl.a (Loov;)Loov;
      // 1b: athrow
      // 1c: getstatic ywl$1.q88 [I
      // 1f: aload 3
      // 20: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 23: invokevirtual vt2$y0s.ordinal ()I
      // 26: iaload
      // 27: tableswitch 65 1 3 29 49 65
      // 40: invokestatic ywl.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: invokevirtual ywl.l4i ()Lzfz;
      // 48: getstatic ywl._tj Lzb_;
      // 4b: getstatic ywl$iai.xhn Lywl$iai;
      // 4e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 53: areturn
      // 54: invokestatic ywl.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: invokevirtual ywl.l4i ()Lzfz;
      // 5c: getstatic ywl._tj Lzb_;
      // 5f: getstatic ywl$iai.fy_ Lywl$iai;
      // 62: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 67: areturn
      // 68: aload 0
      // 69: invokevirtual ywl.l4i ()Lzfz;
      // 6c: getstatic ywl._tj Lzb_;
      // 6f: getstatic ywl$iai.vo4 Lywl$iai;
      // 72: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 77: areturn
      // 78: iload 7
      // 7a: getstatic ywl$iai.r24 Lywl$iai;
      // 7d: invokevirtual ywl$iai.ofo ()I
      // 80: if_icmpne 99
      // 83: aload 0
      // 84: invokevirtual ywl.l4i ()Lzfz;
      // 87: getstatic ywl._tj Lzb_;
      // 8a: getstatic ywl$iai.r24 Lywl$iai;
      // 8d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 92: goto a8
      // 95: invokestatic ywl.a (Loov;)Loov;
      // 98: athrow
      // 99: aload 0
      // 9a: invokevirtual ywl.l4i ()Lzfz;
      // 9d: getstatic ywl._tj Lzb_;
      // a0: getstatic ywl$iai.o86 Lywl$iai;
      // a3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // a8: areturn
   }

   @Override
   public int crg(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic ywl._tj Lzb_;
      // 08: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d: checkcast ywl$iai
      // 10: astore 3
      // 11: aload 3
      // 12: iload 2
      // 13: ifeq 4a
      // 16: getstatic ywl$iai.fy_ Lywl$iai;
      // 19: if_acmpeq 47
      // 1c: goto 23
      // 1f: invokestatic ywl.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 3
      // 24: iload 2
      // 25: ifeq 4a
      // 28: goto 2f
      // 2b: invokestatic ywl.a (Loov;)Loov;
      // 2e: athrow
      // 2f: getstatic ywl$iai.xhn Lywl$iai;
      // 32: if_acmpeq 47
      // 35: goto 3c
      // 38: invokestatic ywl.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 3
      // 3d: invokevirtual ywl$iai.ofo ()I
      // 40: goto 4d
      // 43: invokestatic ywl.a (Loov;)Loov;
      // 46: athrow
      // 47: getstatic ywl$iai.vo4 Lywl$iai;
      // 4a: invokevirtual ywl$iai.ofo ()I
      // 4d: ireturn
   }

   @Override
   public erg b4a(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic ywl._tj Lzb_;
      // 08: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d: checkcast ywl$iai
      // 10: astore 3
      // 11: aload 3
      // 12: getstatic ywl$iai.fy_ Lywl$iai;
      // 15: iload 2
      // 16: ifne 2e
      // 19: if_acmpeq 3d
      // 1c: goto 23
      // 1f: invokestatic ywl.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 3
      // 24: getstatic ywl$iai.xhn Lywl$iai;
      // 27: goto 2e
      // 2a: invokestatic ywl.a (Loov;)Loov;
      // 2d: athrow
      // 2e: if_acmpeq 3d
      // 31: aload 0
      // 32: aload 1
      // 33: invokespecial e0x.b4a (Lzfz;)Lerg;
      // 36: goto 4f
      // 39: invokestatic ywl.a (Loov;)Loov;
      // 3c: athrow
      // 3d: new erg
      // 40: dup
      // 41: aload 0
      // 42: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 45: bipush 1
      // 46: getstatic ywl$iai.vo4 Lywl$iai;
      // 49: invokevirtual ywl$iai.ofo ()I
      // 4c: invokespecial erg.<init> (Lu7m;II)V
      // 4f: areturn
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, ywl$iai.o86.ofo()));
      var3.add(new erg(var1, 1, ywl$iai.r24.ofo()));
      var3.add(new erg(var1, 1, ywl$iai.vo4.ofo()));
   }

   @Override
   public _mi uoz(zfz var1) {
      return _mi.xxi;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(_tj, ywl$iai.s0h(var1));
   }

   @Override
   public int hvp(zfz var1) {
      return ((ywl$iai)var1.dil(_tj)).ofo();
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{_tj});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2203652271598196416L, 7230982955452146421L, MethodHandles.lookup().lookupClass()).a(45416362098276L);
      // $VF: monitorexit
      long var4 = var10000 ^ 11094588561209L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("¦rÆÉØÐ³È".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      _tj = zb_.pq4(var0, ywl$iai.class);
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
