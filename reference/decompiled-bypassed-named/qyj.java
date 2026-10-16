import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class qyj extends izd {
   public static final zb_ qpu;

   public qyj() {
      super(p3y.fdu);
      int var10000 = OpaquePredicate.b();
      zfz var2 = this._8_.c32();
      int var1 = var10000;

      label20: {
         try {
            if (var1 == 0) {
               return;
            }

            if (this.t7p()) {
               break label20;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var2 = var2.zvi(_9x, izd$jc0.ct4);
      }

      this.y8l(var2.zvi(qpu, x54$lti.mdr));
      this.i3l(uja.mqu);
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((x54$lti)var1.dil(qpu))._fn();
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.jp3);
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return u7m.gfm(ox_.jp3);
   }

   @Override
   public String uud(int var1) {
      return super.abc() + "." + x54$lti.mhp(var1).lfl();
   }

   @Override
   public xny ptp() {
      return qpu;
   }

   @Override
   public Object ulk(erg var1) {
      return x54$lti.mhp(var1.j6_() & 7);
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      int var4 = OpaquePredicate.c();
      if (var1 != u7m.gfm(ox_.pfr)) {
         for (x54$lti var8 : x54$lti.values()) {
            var3.add(new erg(var1, 1, var8.h8z()));
            if (var4 != 0) {
               break;
            }
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
      // 00: aload 0
      // 01: invokevirtual qyj.l4i ()Lzfz;
      // 04: getstatic qyj.qpu Lzb_;
      // 07: iload 1
      // 08: bipush 7
      // 0a: iand
      // 0b: invokestatic x54$lti.mhp (I)Lx54$lti;
      // 0e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 13: astore 2
      // 14: aload 0
      // 15: invokevirtual qyj.t7p ()Z
      // 18: ifne 40
      // 1b: aload 2
      // 1c: getstatic qyj._9x Lzb_;
      // 1f: iload 1
      // 20: bipush 8
      // 22: iand
      // 23: ifne 37
      // 26: goto 2d
      // 29: invokestatic qyj.a (Loov;)Loov;
      // 2c: athrow
      // 2d: getstatic izd$jc0.ct4 Lizd$jc0;
      // 30: goto 3a
      // 33: invokestatic qyj.a (Loov;)Loov;
      // 36: athrow
      // 37: getstatic izd$jc0.l7i Lizd$jc0;
      // 3a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3f: astore 2
      // 40: aload 2
      // 41: areturn
   }

   @Override
   public int hvp(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic OpaquePredicate.c ()I
      // 05: iload 3
      // 06: aload 1
      // 07: getstatic qyj.qpu Lzb_;
      // 0a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0f: checkcast x54$lti
      // 12: invokevirtual x54$lti.h8z ()I
      // 15: ior
      // 16: istore 3
      // 17: istore 2
      // 18: aload 0
      // 19: invokevirtual qyj.t7p ()Z
      // 1c: iload 2
      // 1d: ifne 46
      // 20: ifne 45
      // 23: goto 2a
      // 26: invokestatic qyj.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: getstatic qyj._9x Lzb_;
      // 2e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 33: getstatic izd$jc0.l7i Lizd$jc0;
      // 36: if_acmpne 45
      // 39: goto 40
      // 3c: invokestatic qyj.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 3
      // 41: bipush 8
      // 43: ior
      // 44: istore 3
      // 45: iload 3
      // 46: ireturn
   }

   @Override
   public g92 oz5() {
      try {
         if (this.t7p()) {
            return new g92(this, new xny[]{qpu});
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return new g92(this, new xny[]{_9x, qpu});
   }

   @Override
   public int crg(zfz var1) {
      return ((x54$lti)var1.dil(qpu)).h8z();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3542022648737891264L, -2945284619411573432L, MethodHandles.lookup().lookupClass()).a(86735323966929L);
      // $VF: monitorexit
      long var4 = var10000 ^ 34541351289040L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("tÿÆµ\u0018¥\fÐ".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      qpu = zb_.pq4(var0, x54$lti.class);
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
