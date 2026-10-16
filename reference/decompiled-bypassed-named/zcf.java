import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging$pl2;

public class zcf extends Module {
   public Timer izc;
   private static final long a;
   private static final String f;

   public zcf() {
      long var1 = a ^ 36318875044507L;
      super(f, _aj.y49, false, new SubEngine[0]);
      this.izc = new Timer();
   }

   @EventHandler
   public void _fj(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: getstatic zcf.ek1 Lc05;
      // 07: getfield Minecraft.tij Lkh3;
      // 0a: ifnonnull 12
      // 0d: return
      // 0e: invokestatic zcf.a (Loov;)Loov;
      // 11: athrow
      // 12: bipush 6
      // 14: dup
      // 15: istore 3
      // 16: istore 4
      // 18: iload 4
      // 1a: iload 3
      // 1b: ineg
      // 1c: if_icmplt db
      // 1f: iload 3
      // 20: ineg
      // 21: istore 5
      // 23: iload 5
      // 25: iload 3
      // 26: if_icmpgt d4
      // 29: iload 3
      // 2a: ineg
      // 2b: iload 2
      // 2c: ifne 1a
      // 2f: istore 6
      // 31: iload 6
      // 33: iload 3
      // 34: if_icmpgt cd
      // 37: new mew
      // 3a: dup
      // 3b: getstatic zcf.ek1 Lc05;
      // 3e: getfield Minecraft.vg8 Ll86;
      // 41: getfield EntityPlayerSP.o2v D
      // 44: ldc2_w 0.5
      // 47: dsub
      // 48: iload 5
      // 4a: i2d
      // 4b: dadd
      // 4c: getstatic zcf.ek1 Lc05;
      // 4f: getfield Minecraft.vg8 Ll86;
      // 52: getfield EntityPlayerSP.kfp D
      // 55: ldc2_w 0.5
      // 58: dsub
      // 59: iload 4
      // 5b: i2d
      // 5c: dadd
      // 5d: getstatic zcf.ek1 Lc05;
      // 60: getfield Minecraft.vg8 Ll86;
      // 63: getfield EntityPlayerSP.vbd D
      // 66: ldc2_w 0.5
      // 69: dsub
      // 6a: iload 6
      // 6c: i2d
      // 6d: dadd
      // 6e: invokespecial mew.<init> (DDD)V
      // 71: astore 7
      // 73: getstatic zcf.ek1 Lc05;
      // 76: getfield Minecraft.tij Lkh3;
      // 79: aload 7
      // 7b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 7e: invokeinterface zfz.r_y ()Le0x; 1
      // 83: astore 8
      // 85: iload 2
      // 86: ifne d0
      // 89: iload 2
      // 8a: ifne c9
      // 8d: goto 94
      // 90: invokestatic zcf.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: aload 7
      // 97: invokespecial zcf.wo9 (Lmew;)Lvt2;
      // 9a: ifnull c6
      // 9d: goto a4
      // a0: invokestatic zcf.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 8
      // a6: instanceof n47
      // a9: ifne c6
      // ac: goto b3
      // af: invokestatic zcf.a (Loov;)Loov;
      // b2: athrow
      // b3: aload 0
      // b4: aload 7
      // b6: aload 0
      // b7: aload 7
      // b9: invokespecial zcf.wo9 (Lmew;)Lvt2;
      // bc: invokespecial zcf.pnu (Lmew;Lvt2;)V
      // bf: goto c6
      // c2: invokestatic zcf.a (Loov;)Loov;
      // c5: athrow
      // c6: iinc 6 1
      // c9: iload 2
      // ca: ifeq 31
      // cd: iinc 5 1
      // d0: iload 2
      // d1: ifeq 23
      // d4: iinc 4 -1
      // d7: iload 2
      // d8: ifeq 18
      // db: return
   }

   private void pnu(mew var1, vt2 var2) {
      ek1.vg8.lq7.sxi(new C07PacketPlayerDigging(C07PacketPlayerDigging$pl2.gi_, var1, var2));
      ek1.vg8.lq7.sxi(new C07PacketPlayerDigging(C07PacketPlayerDigging$pl2.x56, var1, var2));
   }

   private vt2 wo9(mew var1) {
      int var2 = OpaquePredicate.b();
      vt2 var3 = null;

      boolean var10000;
      label92: {
         try {
            var10000 = ek1.tij.getBlockState(var1.ec4(0, 1, 0)).r_y().lj1();
            if (var2 == 0) {
               break label92;
            }

            if (!var10000) {
               return vt2.rf3;
            }
         } catch (oov var8) {
            throw a(var8);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(0, -1, 0)).r_y().lj1();
      }

      label82: {
         try {
            if (var2 == 0) {
               break label82;
            }

            if (!var10000) {
               return vt2.m3r;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(1, 0, 0)).r_y().lj1();
      }

      label72: {
         try {
            if (var2 == 0) {
               break label72;
            }

            if (!var10000) {
               return vt2.zk4;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(-1, 0, 0)).r_y().lj1();
      }

      label62: {
         try {
            if (var2 == 0) {
               break label62;
            }

            if (!var10000) {
               return vt2.te4;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(0, 0, 1)).r_y().lj1();
      }

      label52: {
         try {
            if (var2 == 0) {
               break label52;
            }

            if (!var10000) {
               return vt2.mxp;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(0, 0, 1)).r_y().lj1();
      }

      if (!var10000) {
         var3 = vt2.z9q;
      }

      return var3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6973711431145595615L, 488645472229705460L, MethodHandles.lookup().lookupClass()).a(106122419016119L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 18129275713710L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("$B÷ÃÙ¤\u0085À".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
