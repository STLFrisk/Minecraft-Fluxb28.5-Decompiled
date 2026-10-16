import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class i96 extends rrw {
   public static final _ku h3a;

   public i96() {
      super(p3y.nc7, _mi.v0s);
      this.y8l(this._8_.c32().zvi(h3a, 0));
      this._p_(true);
      float var1 = 0.5F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.i3l((uja)null);
   }

   @Override
   public boolean ib4(e0x var1) {
      try {
         if (var1 == ox_.p58) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public boolean _h0(OpaquePredicate var1, mew var2, zfz var3) {
      return this.ib4(var1.getBlockState(var2.eve()).r_y());
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic i96.h3a L_ku;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 6
      // 16: iload 5
      // 18: ifne 67
      // 1b: iload 6
      // 1d: bipush 3
      // 1e: if_icmpge 5e
      // 21: goto 28
      // 24: invokestatic i96.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 4
      // 2a: bipush 10
      // 2c: invokevirtual java/util/Random.nextInt (I)I
      // 2f: iload 5
      // 31: ifne 5d
      // 34: goto 3b
      // 37: invokestatic i96.a (Loov;)Loov;
      // 3a: athrow
      // 3b: ifne 5e
      // 3e: goto 45
      // 41: invokestatic i96.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 3
      // 46: getstatic i96.h3a L_ku;
      // 49: iload 6
      // 4b: bipush 1
      // 4c: iadd
      // 4d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 50: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 55: astore 3
      // 56: aload 1
      // 57: aload 2
      // 58: aload 3
      // 59: bipush 2
      // 5a: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 5d: pop
      // 5e: aload 0
      // 5f: aload 1
      // 60: aload 2
      // 61: aload 3
      // 62: aload 4
      // 64: invokespecial rrw.zvy (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 67: return
   }

   @Override
   public void ix7(OpaquePredicate var1, mew var2, zfz var3, float var4, int var5) {
      int var6 = OpaquePredicate.b();

      byte var10000;
      label59: {
         try {
            var10000 = var1.v0f;
            if (var6 == 0) {
               break label59;
            }

            if (var1.v0f) {
               return;
            }
         } catch (oov var11) {
            throw a(var11);
         }

         var10000 = 1;
      }

      int var7 = var10000;

      label50: {
         label65: {
            try {
               var10000 = (Integer)var3.dil(h3a);
               if (var6 == 0) {
                  break label50;
               }

               if (var10000 < 3) {
                  break label65;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var7 = 2 + var1.fsy.nextInt(3);

            try {
               var10000 = var5;
               if (var6 == 0) {
                  break label50;
               }

               if (var5 <= 0) {
                  break label65;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var7 += var1.fsy.nextInt(var5 + 1);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < var7) {
         ymu(var1, var2, new erg(xbr.jgt));
         var8++;
         if (var6 == 0) {
            break;
         }
      }
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.jgt;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(h3a, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(h3a);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{h3a});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3105522827276310809L, -6813409092188681660L, MethodHandles.lookup().lookupClass()).a(195252237268093L);
      // $VF: monitorexit
      long var4 = var10000 ^ 58094301777860L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("`¾Ø\u0000gÏÄI".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      h3a = _ku.wgl(var0, 0, 3);
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
