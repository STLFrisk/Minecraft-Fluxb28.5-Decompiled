import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class uav extends _cv {
   public static final zb_ nps;

   public uav() {
      this.y8l(this._8_.c32().zvi(nps, x54$lti.mdr).zvi(sdu, true).zvi(g07, true));
   }

   @Override
   public int ieb(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 24
      // 09: invokeinterface zfz.r_y ()Le0x; 1
      // 0e: aload 0
      // 0f: if_acmpeq 23
      // 12: goto 19
      // 15: invokestatic uav.c (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokespecial _cv.ieb (Lzfz;)I
      // 1e: ireturn
      // 1f: invokestatic uav.c (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: getstatic uav.nps Lzb_;
      // 27: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2c: checkcast x54$lti
      // 2f: astore 3
      // 30: aload 3
      // 31: getstatic x54$lti.b4p Lx54$lti;
      // 34: iload 2
      // 35: ifeq 50
      // 38: if_acmpne 4c
      // 3b: goto 42
      // 3e: invokestatic uav.c (Loov;)Loov;
      // 41: athrow
      // 42: invokestatic h7z.nt3 ()I
      // 45: goto 62
      // 48: invokestatic uav.c (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 3
      // 4d: getstatic x54$lti.yk5 Lx54$lti;
      // 50: if_acmpne 5d
      // 53: invokestatic h7z.zp6 ()I
      // 56: goto 62
      // 59: invokestatic uav.c (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: aload 1
      // 5f: invokespecial _cv.ieb (Lzfz;)I
      // 62: ireturn
   }

   @Override
   public int j24(m5n param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0c: astore 5
      // 0e: aload 5
      // 10: iload 4
      // 12: ifne 2e
      // 15: invokeinterface zfz.r_y ()Le0x; 1
      // 1a: aload 0
      // 1b: if_acmpne 67
      // 1e: goto 25
      // 21: invokestatic uav.c (Loov;)Loov;
      // 24: athrow
      // 25: aload 5
      // 27: goto 2e
      // 2a: invokestatic uav.c (Loov;)Loov;
      // 2d: athrow
      // 2e: getstatic uav.nps Lzb_;
      // 31: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 36: checkcast x54$lti
      // 39: astore 6
      // 3b: aload 6
      // 3d: getstatic x54$lti.b4p Lx54$lti;
      // 40: iload 4
      // 42: ifne 5c
      // 45: if_acmpne 57
      // 48: goto 4f
      // 4b: invokestatic uav.c (Loov;)Loov;
      // 4e: athrow
      // 4f: invokestatic h7z.nt3 ()I
      // 52: ireturn
      // 53: invokestatic uav.c (Loov;)Loov;
      // 56: athrow
      // 57: aload 6
      // 59: getstatic x54$lti.yk5 Lx54$lti;
      // 5c: if_acmpne 67
      // 5f: invokestatic h7z.zp6 ()I
      // 62: ireturn
      // 63: invokestatic uav.c (Loov;)Loov;
      // 66: athrow
      // 67: aload 0
      // 68: aload 1
      // 69: aload 2
      // 6a: iload 3
      // 6b: invokespecial _cv.j24 (Lm5n;Lmew;I)I
      // 6e: ireturn
   }

   @Override
   public void j00(t9d param1, mew param2, zfz param3, int param4) {
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
      // 06: getstatic uav.nps Lzb_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: getstatic x54$lti.mdr Lx54$lti;
      // 11: if_acmpne 4b
      // 14: aload 1
      // 15: iload 5
      // 17: ifne 3b
      // 1a: goto 21
      // 1d: invokestatic uav.c (Loov;)Loov;
      // 20: athrow
      // 21: getfield t9d.fsy Ljava/util/Random;
      // 24: iload 4
      // 26: invokevirtual java/util/Random.nextInt (I)I
      // 29: ifne 4b
      // 2c: goto 33
      // 2f: invokestatic uav.c (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: goto 3b
      // 37: invokestatic uav.c (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 2
      // 3c: new erg
      // 3f: dup
      // 40: getstatic xbr.lym Lu7m;
      // 43: bipush 1
      // 44: bipush 0
      // 45: invokespecial erg.<init> (Lu7m;II)V
      // 48: invokestatic uav.ymu (Lt9d;Lmew;Lerg;)V
      // 4b: return
   }

   @Override
   public int b9m(zfz var1) {
      try {
         if (var1.dil(nps) == x54$lti.jnw) {
            return 40;
         }
      } catch (oov var2) {
         throw c(var2);
      }

      return super.b9m(var1);
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, x54$lti.mdr.h8z()));
      var3.add(new erg(var1, 1, x54$lti.b4p.h8z()));
      var3.add(new erg(var1, 1, x54$lti.yk5.h8z()));
      var3.add(new erg(var1, 1, x54$lti.jnw.h8z()));
   }

   @Override
   public erg b4a(zfz var1) {
      return new erg(u7m.gfm(this), 1, ((x54$lti)var1.dil(nps)).h8z());
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.c();

      zfz var10000;
      h76 var10001;
      int var10002;
      label39: {
         label38: {
            try {
               var10000 = this.l4i().zvi(nps, this.d14(var1));
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
      int var10000 = t9d.c();
      var3 |= ((x54$lti)var1.dil(nps)).h8z();
      int var2 = var10000;

      label37: {
         label36: {
            try {
               var7 = (Boolean)var1.dil(g07);
               if (var2 != 0) {
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
         if (var2 != 0) {
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
      return x54$lti.mhp((var1 & 3) % 4);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{nps, sdu, g07});
   }

   @Override
   public int crg(zfz var1) {
      return ((x54$lti)var1.dil(nps)).h8z();
   }

   @Override
   public void i4u(t9d param1, ha9 param2, mew param3, zfz param4, pyk param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: ifne 7f
      // 0c: aload 2
      // 0d: invokevirtual ha9.b5z ()Lerg;
      // 10: iload 6
      // 12: ifne 3d
      // 15: goto 1c
      // 18: invokestatic uav.c (Loov;)Loov;
      // 1b: athrow
      // 1c: ifnull 7f
      // 1f: goto 26
      // 22: invokestatic uav.c (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: iload 6
      // 29: ifne 4e
      // 2c: goto 33
      // 2f: invokestatic uav.c (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual ha9.b5z ()Lerg;
      // 36: goto 3d
      // 39: invokestatic uav.c (Loov;)Loov;
      // 3c: athrow
      // 3d: invokevirtual erg.gn1 ()Lu7m;
      // 40: getstatic xbr.qsl Lguw;
      // 43: if_acmpne 7f
      // 46: aload 2
      // 47: goto 4e
      // 4a: invokestatic uav.c (Loov;)Loov;
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
      // 66: getstatic uav.nps Lzb_;
      // 69: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 6e: checkcast x54$lti
      // 71: invokevirtual x54$lti.h8z ()I
      // 74: invokespecial erg.<init> (Lu7m;II)V
      // 77: invokestatic uav.ymu (Lt9d;Lmew;Lerg;)V
      // 7a: iload 6
      // 7c: ifeq 91
      // 7f: aload 0
      // 80: aload 1
      // 81: aload 2
      // 82: aload 3
      // 83: aload 4
      // 85: aload 5
      // 87: invokespecial _cv.i4u (Lt9d;Lha9;Lmew;Lzfz;Lpyk;)V
      // 8a: goto 91
      // 8d: invokestatic uav.c (Loov;)Loov;
      // 90: athrow
      // 91: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7013138917451188123L, -1945179467358789292L, MethodHandles.lookup().lookupClass()).a(34564675795234L);
      // $VF: monitorexit
      long var4 = var10000 ^ 51837630405950L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("¾¸WaÄhÞ\u009c".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      nps = zb_._m6(var0, x54$lti.class, new uav$1());
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
