import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xer extends _cv {
   public static final zb_ cq8;

   public xer() {
      this.y8l(this._8_.c32().zvi(cq8, x54$lti.y2x).zvi(sdu, true).zvi(g07, true));
   }

   @Override
   public void j00(OpaquePredicate param1, mew param2, zfz param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic xer.cq8 Lzb_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: getstatic x54$lti.jtj Lx54$lti;
      // 11: if_acmpne 4b
      // 14: aload 1
      // 15: iload 5
      // 17: ifne 3b
      // 1a: goto 21
      // 1d: invokestatic xer.c (Loov;)Loov;
      // 20: athrow
      // 21: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 24: iload 4
      // 26: invokevirtual java/util/Random.nextInt (I)I
      // 29: ifne 4b
      // 2c: goto 33
      // 2f: invokestatic xer.c (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: goto 3b
      // 37: invokestatic xer.c (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 2
      // 3c: new erg
      // 3f: dup
      // 40: getstatic xbr.lym Lu7m;
      // 43: bipush 1
      // 44: bipush 0
      // 45: invokespecial erg.<init> (Lu7m;II)V
      // 48: invokestatic xer.ymu (Lt9d;Lmew;Lerg;)V
      // 4b: return
   }

   @Override
   public int crg(zfz var1) {
      return ((x54$lti)var1.dil(cq8)).h8z();
   }

   @Override
   public int qu2(OpaquePredicate var1, mew var2) {
      zfz var3 = var1.getBlockState(var2);
      return var3.r_y().hvp(var3) & 3;
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, 0));
      var3.add(new erg(var1, 1, 1));
   }

   @Override
   public erg b4a(zfz var1) {
      return new erg(u7m.gfm(this), 1, ((x54$lti)var1.dil(cq8)).h8z() - 4);
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      int var10002;
      label39: {
         label38: {
            try {
               var10000 = this.l4i().zvi(cq8, this.d14(var1));
               var10001 = g07;
               var10002 = var1 & 4;
               if (var2 != 0) {
                  break label39;
               }

               if (var10002 == 0) {
                  break label38;
               }
            } catch (oov var4) {
               throw c(var4);
            }

            var10002 = 0;
            break label39;
         }

         var10002 = 1;
      }

      try {
         var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
         var10001 = sdu;
         var10002 = var1 & 8;
         if (var2 != 0) {
            return var10000.zvi(sdu, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(sdu, true);
         }
      } catch (oov var3) {
         throw c(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.b();
      var3 |= ((x54$lti)var1.dil(cq8)).h8z() - 4;
      int var2 = var10000;

      label37: {
         label36: {
            try {
               var7 = (Boolean)var1.dil(g07);
               if (var2 == 0) {
                  break label37;
               }

               if (var7 != 0) {
                  break label36;
               }
            } catch (oov var5) {
               throw c(var5);
            }

            var3 |= 4;
         }

         var7 = (Boolean)var1.dil(sdu);
      }

      try {
         if (var2 == 0) {
            return var7;
         }

         if (var7 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw c(var4);
      }

      var3 |= 8;
      return var3;
   }

   @Override
   public x54$lti d14(int var1) {
      return x54$lti.mhp((var1 & 3) + 4);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{cq8, sdu, g07});
   }

   @Override
   public void i4u(OpaquePredicate param1, ha9 param2, mew param3, zfz param4, pyk param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: ifne 81
      // 0c: aload 2
      // 0d: invokevirtual ha9.b5z ()Lerg;
      // 10: iload 6
      // 12: ifne 3d
      // 15: goto 1c
      // 18: invokestatic xer.c (Loov;)Loov;
      // 1b: athrow
      // 1c: ifnull 81
      // 1f: goto 26
      // 22: invokestatic xer.c (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: iload 6
      // 29: ifne 4e
      // 2c: goto 33
      // 2f: invokestatic xer.c (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual ha9.b5z ()Lerg;
      // 36: goto 3d
      // 39: invokestatic xer.c (Loov;)Loov;
      // 3c: athrow
      // 3d: invokevirtual erg.gn1 ()Lu7m;
      // 40: getstatic xbr.qsl Lguw;
      // 43: if_acmpne 81
      // 46: aload 2
      // 47: goto 4e
      // 4a: invokestatic xer.c (Loov;)Loov;
      // 4d: athrow
      // 4e: getstatic l9p.hf_ [L_ss;
      // 51: aload 0
      // 52: invokestatic e0x.mxb (Le0x;)I
      // 55: aaload
      // 56: invokevirtual ha9.aex (L_ss;)V
      // 59: aload 1
      // 5a: aload 3
      // 5b: new erg
      // 5e: dup
      // 5f: aload 0
      // 60: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 63: bipush 1
      // 64: aload 4
      // 66: getstatic xer.cq8 Lzb_;
      // 69: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 6e: checkcast x54$lti
      // 71: invokevirtual x54$lti.h8z ()I
      // 74: bipush 4
      // 75: isub
      // 76: invokespecial erg.<init> (Lu7m;II)V
      // 79: invokestatic xer.ymu (Lt9d;Lmew;Lerg;)V
      // 7c: iload 6
      // 7e: ifeq 93
      // 81: aload 0
      // 82: aload 1
      // 83: aload 2
      // 84: aload 3
      // 85: aload 4
      // 87: aload 5
      // 89: invokespecial _cv.i4u (Lt9d;Lha9;Lmew;Lzfz;Lpyk;)V
      // 8c: goto 93
      // 8f: invokestatic xer.c (Loov;)Loov;
      // 92: athrow
      // 93: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5035819444955788550L, -8331351147742047738L, MethodHandles.lookup().lookupClass()).a(253936259402410L);
      // $VF: monitorexit
      long var4 = var10000 ^ 123032306811448L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("£!\u0083FÎ\u0018\u0093H".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      cq8 = zb_._m6(var0, x54$lti.class, new xer$1());
   }

   private static oov c(oov var0) {
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
