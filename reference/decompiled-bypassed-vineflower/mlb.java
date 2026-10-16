import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.DynamicLights;
import net.optifine.shaders.Shaders;
import org.lwjgl.opengl.GL11;

public class mlb {
   private static final gdz z9r;
   private static final gdz msz;
   private final c05 l1d;
   private erg xc8;
   private float n4w;
   private float c80;
   private final hr_ m39;
   private final y1w jbr;
   private int bky = -1;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public mlb(c05 var1) {
      this.l1d = var1;
      this.m39 = var1.ibs();
      this.jbr = var1.jiu();
   }

   public void xwn(g_3 param1, erg param2, flk$gbm param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifeq 16
      // 0b: ifnull ba
      // 0e: goto 15
      // 11: invokestatic mlb.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 2
      // 16: invokevirtual erg.gn1 ()Lu7m;
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 20: astore 6
      // 22: invokestatic hzu.dp2 ()V
      // 25: aload 0
      // 26: getfield mlb.jbr Ly1w;
      // 29: aload 2
      // 2a: invokevirtual y1w.g60 (Lerg;)Z
      // 2d: iload 4
      // 2f: ifeq a4
      // 32: ifeq 94
      // 35: goto 3c
      // 38: invokestatic mlb.a (Loov;)Loov;
      // 3b: athrow
      // 3c: fconst_2
      // 3d: fconst_2
      // 3e: fconst_2
      // 3f: invokestatic hzu.syc (FFF)V
      // 42: aload 0
      // 43: aload 6
      // 45: invokespecial mlb.qas (Le0x;)Z
      // 48: iload 4
      // 4a: ifeq a4
      // 4d: goto 54
      // 50: invokestatic mlb.a (Loov;)Loov;
      // 53: athrow
      // 54: ifeq 94
      // 57: goto 5e
      // 5a: invokestatic mlb.a (Loov;)Loov;
      // 5d: athrow
      // 5e: invokestatic hxt.ly3 ()Z
      // 61: iload 4
      // 63: ifeq 91
      // 66: goto 6d
      // 69: invokestatic mlb.a (Loov;)Loov;
      // 6c: athrow
      // 6d: ifeq 90
      // 70: goto 77
      // 73: invokestatic mlb.a (Loov;)Loov;
      // 76: athrow
      // 77: getstatic net/optifine/shaders/Shaders.renderItemKeepDepthMask Z
      // 7a: iload 4
      // 7c: ifeq a4
      // 7f: goto 86
      // 82: invokestatic mlb.a (Loov;)Loov;
      // 85: athrow
      // 86: ifne 94
      // 89: goto 90
      // 8c: invokestatic mlb.a (Loov;)Loov;
      // 8f: athrow
      // 90: bipush 0
      // 91: invokestatic hzu.jun (Z)V
      // 94: aload 0
      // 95: getfield mlb.jbr Ly1w;
      // 98: aload 2
      // 99: aload 1
      // 9a: aload 3
      // 9b: invokevirtual y1w.vfw (Lerg;Lg_3;Lflk$gbm;)V
      // 9e: aload 0
      // 9f: aload 6
      // a1: invokespecial mlb.qas (Le0x;)Z
      // a4: iload 4
      // a6: ifeq b4
      // a9: ifeq b7
      // ac: goto b3
      // af: invokestatic mlb.a (Loov;)Loov;
      // b2: athrow
      // b3: bipush 1
      // b4: invokestatic hzu.jun (Z)V
      // b7: invokestatic hzu.x3w ()V
      // ba: return
   }

   private boolean qas(e0x var1) {
      int var2 = t9d.b();

      e0x var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000.w3x() == w51.mem) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   private void tfw(float var1, float var2) {
      hzu.dp2();
      hzu.a2h(var1, 1.0F, 0.0F, 0.0F);
      hzu.a2h(var2, 0.0F, 1.0F, 0.0F);
      qpm.ne_();
      hzu.x3w();
   }

   private void cz3(x0l var1) {
      int var2 = t9d.c();
      int var3 = this.l1d.tij.getCombinedLight(new mew(var1.o2v, var1.kfp + (double)var1.c5y(), var1.vbd), 0);

      int var10000;
      label21: {
         label20: {
            try {
               var10000 = hxt.csr();
               if (var2 != 0) {
                  break label21;
               }

               if (var10000 == 0) {
                  break label20;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var3 = DynamicLights.getCombinedLight(this.l1d.nsd(), var3);
         }

         var10000 = var3 & 65535;
      }

      float var4 = (float)var10000;
      float var5 = (float)(var3 >> 16);
      gis.w9e(gis.exn, var4, var5);
   }

   private void zk1(l86 var1, float var2) {
      float var3 = var1.opd + (var1.dd5 - var1.opd) * var2;
      float var4 = var1.txh + (var1.yfu - var1.txh) * var2;
      hzu.a2h((var1.y2i - var3) * 0.1F, 1.0F, 0.0F, 0.0F);
      hzu.a2h((var1.x5k - var4) * 0.1F, 0.0F, 1.0F, 0.0F);
   }

   private float q02(float var1) {
      float var2 = 1.0F - var1 / 45.0F + 0.1F;
      var2 = fe6._f3(var2, 0.0F, 1.0F);
      return -fe6.ssk(var2 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void o23(hrb var1) {
      hzu.dp2();
      hzu.a2h(54.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(64.0F, 1.0F, 0.0F, 0.0F);
      hzu.a2h(-62.0F, 0.0F, 0.0F, 1.0F);
      hzu.a4k(0.25F, -0.85F, 0.75F);
      var1.oku(this.l1d.vg8);
      hzu.x3w();
   }

   private void hkn(hrb var1) {
      hzu.dp2();
      hzu.a2h(92.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(45.0F, 1.0F, 0.0F, 0.0F);
      hzu.a2h(41.0F, 0.0F, 0.0F, 1.0F);
      hzu.a4k(-0.3F, -1.1F, 0.45F);
      var1.yus(this.l1d.vg8);
      hzu.x3w();
   }

   private void cvt(x0l param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield mlb.l1d Lc05;
      // 04: invokevirtual c05.l22 ()Llc5;
      // 07: aload 1
      // 08: invokevirtual x0l.q06 ()Lgdz;
      // 0b: invokevirtual lc5.anl (Lgdz;)V
      // 0e: invokestatic t9d.b ()I
      // 11: aload 0
      // 12: getfield mlb.m39 Lhr_;
      // 15: aload 0
      // 16: getfield mlb.l1d Lc05;
      // 19: getfield c05.vg8 Ll86;
      // 1c: invokevirtual hr_.ihn (Li2h;)Lliu;
      // 1f: astore 3
      // 20: istore 2
      // 21: aload 3
      // 22: checkcast hrb
      // 25: astore 4
      // 27: iload 2
      // 28: ifeq 4f
      // 2b: aload 1
      // 2c: invokevirtual x0l.h5u ()Z
      // 2f: ifne 52
      // 32: goto 39
      // 35: invokestatic mlb.a (Loov;)Loov;
      // 38: athrow
      // 39: invokestatic hzu.o1b ()V
      // 3c: aload 0
      // 3d: aload 4
      // 3f: invokespecial mlb.o23 (Lhrb;)V
      // 42: aload 0
      // 43: aload 4
      // 45: invokespecial mlb.hkn (Lhrb;)V
      // 48: goto 4f
      // 4b: invokestatic mlb.a (Loov;)Loov;
      // 4e: athrow
      // 4f: invokestatic hzu.gp4 ()V
      // 52: return
   }

   private void pld(x0l var1, float var2, float var3, float var4) {
      float var5 = -0.4F * fe6.rtn(fe6.bug(var4) * (float) Math.PI);
      float var6 = 0.2F * fe6.rtn(fe6.bug(var4) * (float) Math.PI * 2.0F);
      float var7 = -0.2F * fe6.rtn(var4 * (float) Math.PI);
      hzu.a4k(var5, var6, var7);
      float var8 = this.q02(var2);
      hzu.a4k(0.0F, 0.04F, -0.72F);
      hzu.a4k(0.0F, var3 * -1.2F, 0.0F);
      hzu.a4k(0.0F, var8 * -0.5F, 0.0F);
      hzu.a2h(90.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(var8 * -85.0F, 0.0F, 0.0F, 1.0F);
      hzu.a2h(0.0F, 1.0F, 0.0F, 0.0F);
      this.cvt(var1);
      float var9 = fe6.rtn(var4 * var4 * (float) Math.PI);
      float var10 = fe6.rtn(fe6.bug(var4) * (float) Math.PI);
      hzu.a2h(var9 * -20.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(var10 * -20.0F, 0.0F, 0.0F, 1.0F);
      hzu.a2h(var10 * -80.0F, 1.0F, 0.0F, 0.0F);
      hzu.syc(0.38F, 0.38F, 0.38F);
      hzu.a2h(90.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(180.0F, 0.0F, 0.0F, 1.0F);
      hzu.a2h(0.0F, 1.0F, 0.0F, 0.0F);
      hzu.a4k(-1.0F, -1.0F, 0.0F);
      hzu.syc(0.015625F, 0.015625F, 0.015625F);
      this.l1d.l22().anl(z9r);
      jom var11 = jom.yut();
      q3g var12 = var11.zuq();
      GL11.glNormal3f(0.0F, 0.0F, -1.0F);
      var12.ezr(7, gnl._r5);
      var12.g5o(-7.0, 135.0, 0.0).h0a(0.0, 1.0).pzw();
      var12.g5o(135.0, 135.0, 0.0).h0a(1.0, 1.0).pzw();
      var12.g5o(135.0, -7.0, 0.0).h0a(1.0, 0.0).pzw();
      var12.g5o(-7.0, -7.0, 0.0).h0a(0.0, 0.0).pzw();
      var11.q7g();
      ucr var13 = xbr.kdv.h9y(this.xc8, this.l1d.tij);

      try {
         if (var13 != null) {
            this.l1d.x0p.g16().wzl(var13, false);
         }
      } catch (oov var14) {
         throw a(var14);
      }
   }

   private void ep_(x0l var1, float var2, float var3) {
      float var4 = -0.3F * fe6.rtn(fe6.bug(var3) * (float) Math.PI);
      float var5 = 0.4F * fe6.rtn(fe6.bug(var3) * (float) Math.PI * 2.0F);
      float var6 = -0.4F * fe6.rtn(var3 * (float) Math.PI);
      hzu.a4k(var4, var5, var6);
      hzu.a4k(0.64000005F, -0.6F, -0.71999997F);
      hzu.a4k(0.0F, var2 * -0.6F, 0.0F);
      hzu.a2h(45.0F, 0.0F, 1.0F, 0.0F);
      float var7 = fe6.rtn(var3 * var3 * (float) Math.PI);
      float var8 = fe6.rtn(fe6.bug(var3) * (float) Math.PI);
      hzu.a2h(var8 * 70.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(var7 * -20.0F, 0.0F, 0.0F, 1.0F);
      this.l1d.l22().anl(var1.q06());
      hzu.a4k(-1.0F, 3.6F, 3.5F);
      hzu.a2h(120.0F, 0.0F, 0.0F, 1.0F);
      hzu.a2h(200.0F, 1.0F, 0.0F, 0.0F);
      hzu.a2h(-135.0F, 0.0F, 1.0F, 0.0F);
      hzu.syc(1.0F, 1.0F, 1.0F);
      hzu.a4k(5.6F, 0.0F, 0.0F);
      liu var9 = this.m39.ihn(this.l1d.vg8);
      hzu.o1b();
      hrb var10 = (hrb)var9;
      var10.oku(this.l1d.vg8);
      hzu.gp4();
   }

   private void cxz(float var1) {
      float var2 = -0.4F * fe6.rtn(fe6.bug(var1) * (float) Math.PI);
      float var3 = 0.2F * fe6.rtn(fe6.bug(var1) * (float) Math.PI * 2.0F);
      float var4 = -0.2F * fe6.rtn(var1 * (float) Math.PI);
      hzu.a4k(var2, var3, var4);
   }

   private void qeh(x0l var1, float var2) {
      float var4 = (float)var1.m9h() - var2 + 1.0F;
      int var10000 = t9d.b();
      float var5 = var4 / (float)this.xc8.ifg();
      int var3 = var10000;
      float var6 = fe6.sqg(fe6.ssk(var4 / 4.0F * (float) Math.PI) * 0.1F);

      float var10001;
      label21: {
         label20: {
            try {
               var9 = var5;
               var10001 = 0.8F;
               if (var3 == 0) {
                  break label21;
               }

               if (!(var5 >= 0.8F)) {
                  break label20;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var6 = 0.0F;
         }

         hzu.a4k(0.0F, var6, 0.0F);
         var9 = 1.0F;
         var10001 = (float)Math.pow((double)var5, 27.0);
      }

      float var7 = var9 - var10001;
      hzu.a4k(var7 * 0.6F, var7 * -0.5F, var7 * 0.0F);
      hzu.a2h(var7 * 90.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(var7 * 10.0F, 1.0F, 0.0F, 0.0F);
      hzu.a2h(var7 * 30.0F, 0.0F, 0.0F, 1.0F);
   }

   private void f4o(float var1, float var2) {
      hzu.a4k(0.56F, -0.52F, -0.71999997F);
      hzu.a4k(0.0F, var1 * -0.6F, 0.0F);
      hzu.a2h(45.0F, 0.0F, 1.0F, 0.0F);
      float var3 = fe6.rtn(var2 * var2 * (float) Math.PI);
      float var4 = fe6.rtn(fe6.bug(var2) * (float) Math.PI);
      hzu.a2h(var3 * -20.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(var4 * -20.0F, 0.0F, 0.0F, 1.0F);
      hzu.a2h(var4 * -80.0F, 1.0F, 0.0F, 0.0F);
      hzu.syc(0.4F, 0.4F, 0.4F);
   }

   private void ttb(float var1, x0l var2) {
      hzu.a2h(-18.0F, 0.0F, 0.0F, 1.0F);
      hzu.a2h(-12.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(-8.0F, 1.0F, 0.0F, 0.0F);
      hzu.a4k(-0.9F, 0.2F, 0.0F);
      float var4 = (float)this.xc8.ifg() - ((float)var2.m9h() - var1 + 1.0F);
      int var10000 = t9d.b();
      float var5 = var4 / 20.0F;
      var5 = (var5 * var5 + var5 * 2.0F) / 3.0F;
      int var3 = var10000;

      float var10001;
      label39: {
         label34: {
            label33: {
               try {
                  float var14;
                  var10000 = (var14 = var5 - 1.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
                  if (var3 == 0) {
                     break label34;
                  }

                  if (var10000 <= 0) {
                     break label33;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }

               var5 = 1.0F;
            }

            try {
               var13 = var5;
               var10001 = 0.1F;
               if (var3 == 0) {
                  break label39;
               }

               float var15;
               var10000 = (var15 = var5 - 0.1F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            } catch (oov var9) {
               throw a(var9);
            }
         }

         if (var10000 > 0) {
            float var6 = fe6.rtn((var4 - 0.1F) * 1.3F);
            float var7 = var5 - 0.1F;
            float var8 = var6 * var7;
            hzu.a4k(var8 * 0.0F, var8 * 0.01F, var8 * 0.0F);
         }

         hzu.a4k(var5 * 0.0F, var5 * 0.0F, var5 * 0.1F);
         var13 = 1.0F;
         var10001 = 1.0F;
      }

      hzu.syc(var13, var10001, 1.0F + var5 * 0.2F);
   }

   private void m_5() {
      hzu.a4k(-0.5F, 0.2F, 0.0F);
      hzu.a2h(30.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(-80.0F, 1.0F, 0.0F, 0.0F);
      hzu.a2h(60.0F, 0.0F, 1.0F, 0.0F);
   }

   public void p79(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlb.a J
      // 003: ldc2_w 24150622370382
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: fload 1
      // 00e: getstatic nlh.ebm Lcrk;
      // 011: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 014: invokevirtual java/lang/Float.floatValue ()F
      // 017: fmul
      // 018: fstore 1
      // 019: iload 5
      // 01b: ifne 081
      // 01e: getstatic nlh.fam Lc_3;
      // 021: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 024: sipush 16443
      // 027: ldc2_w 2656803955593084590
      // 02a: lload 3
      // 02b: lxor
      // 02c: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 035: ifne 06c
      // 038: goto 03f
      // 03b: invokestatic mlb.a (Loov;)Loov;
      // 03e: athrow
      // 03f: getstatic nlh.fam Lc_3;
      // 042: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 045: sipush 11461
      // 048: ldc2_w 1520191199240032863
      // 04b: lload 3
      // 04c: lxor
      // 04d: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: nop
      // 053: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 056: iload 5
      // 058: ifne 0e1
      // 05b: goto 062
      // 05e: invokestatic mlb.a (Loov;)Loov;
      // 061: athrow
      // 062: ifeq 0c3
      // 065: goto 06c
      // 068: invokestatic mlb.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: fload 2
      // 06e: ldc 0.2
      // 070: nop
      // 071: fsub
      // 072: fconst_0
      // 073: invokespecial mlb.f4o (FF)V
      // 076: aload 0
      // 077: invokespecial mlb.m_5 ()V
      // 07a: goto 081
      // 07d: invokestatic mlb.a (Loov;)Loov;
      // 080: athrow
      // 081: fload 1
      // 082: invokestatic fe6.bug (F)F
      // 085: ldc 3.1415927
      // 087: nop
      // 088: fmul
      // 089: invokestatic fe6.rtn (F)F
      // 08c: fstore 7
      // 08e: ldc -0.05
      // 090: nop
      // 091: ldc 0.3
      // 093: nop
      // 094: fconst_0
      // 095: invokestatic hzu.a4k (FFF)V
      // 098: fload 7
      // 09a: fneg
      // 09b: ldc 70.0
      // 09d: nop
      // 09e: fmul
      // 09f: fconst_2
      // 0a0: fdiv
      // 0a1: ldc -8.0
      // 0a3: nop
      // 0a4: ldc -0.0
      // 0a6: nop
      // 0a7: ldc 9.0
      // 0a9: nop
      // 0aa: invokestatic hzu.a2h (FFFF)V
      // 0ad: fload 7
      // 0af: fneg
      // 0b0: ldc 70.0
      // 0b2: nop
      // 0b3: fmul
      // 0b4: fconst_1
      // 0b5: ldc -0.4
      // 0b7: nop
      // 0b8: ldc -0.0
      // 0ba: nop
      // 0bb: invokestatic hzu.a2h (FFFF)V
      // 0be: iload 5
      // 0c0: ifeq 75d
      // 0c3: getstatic nlh.fam Lc_3;
      // 0c6: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 0c9: sipush 31952
      // 0cc: ldc2_w 3089753868355355223
      // 0cf: lload 3
      // 0d0: lxor
      // 0d1: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: nop
      // 0d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0da: goto 0e1
      // 0dd: invokestatic mlb.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iload 5
      // 0e3: ifne 173
      // 0e6: ifeq 155
      // 0e9: goto 0f0
      // 0ec: invokestatic mlb.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: ldc 0.56
      // 0f2: nop
      // 0f3: ldc -0.52
      // 0f5: nop
      // 0f6: ldc -0.71999997
      // 0f8: nop
      // 0f9: invokestatic hzu.a4k (FFF)V
      // 0fc: fconst_0
      // 0fd: fload 2
      // 0fe: ldc -0.6
      // 100: nop
      // 101: fmul
      // 102: fconst_0
      // 103: invokestatic hzu.a4k (FFF)V
      // 106: ldc 45.0
      // 108: nop
      // 109: fconst_0
      // 10a: fconst_1
      // 10b: fconst_0
      // 10c: invokestatic hzu.a2h (FFFF)V
      // 10f: fload 1
      // 110: fload 1
      // 111: fmul
      // 112: ldc 3.1415927
      // 114: nop
      // 115: fmul
      // 116: invokestatic fe6.rtn (F)F
      // 119: fstore 7
      // 11b: fload 1
      // 11c: invokestatic fe6.bug (F)F
      // 11f: ldc 3.1415927
      // 121: nop
      // 122: fmul
      // 123: invokestatic fe6.rtn (F)F
      // 126: fstore 8
      // 128: fload 7
      // 12a: ldc -20.0
      // 12c: nop
      // 12d: fmul
      // 12e: fconst_0
      // 12f: fconst_1
      // 130: fconst_0
      // 131: invokestatic hzu.a2h (FFFF)V
      // 134: fload 8
      // 136: ldc -20.0
      // 138: nop
      // 139: fmul
      // 13a: fconst_0
      // 13b: fconst_0
      // 13c: fconst_1
      // 13d: invokestatic hzu.a2h (FFFF)V
      // 140: ldc 0.4
      // 142: nop
      // 143: ldc 0.4
      // 145: nop
      // 146: ldc 0.4
      // 148: nop
      // 149: invokestatic hzu.syc (FFF)V
      // 14c: aload 0
      // 14d: invokespecial mlb.m_5 ()V
      // 150: iload 5
      // 152: ifeq 75d
      // 155: getstatic nlh.fam Lc_3;
      // 158: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 15b: sipush 18052
      // 15e: ldc2_w 8952665794866575360
      // 161: lload 3
      // 162: lxor
      // 163: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: nop
      // 169: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16c: goto 173
      // 16f: invokestatic mlb.a (Loov;)Loov;
      // 172: athrow
      // 173: iload 5
      // 175: ifne 205
      // 178: ifeq 1e7
      // 17b: goto 182
      // 17e: invokestatic mlb.a (Loov;)Loov;
      // 181: athrow
      // 182: ldc 0.56
      // 184: nop
      // 185: ldc -0.52
      // 187: nop
      // 188: ldc -0.71999997
      // 18a: nop
      // 18b: invokestatic hzu.a4k (FFF)V
      // 18e: fconst_0
      // 18f: fload 2
      // 190: ldc -0.6
      // 192: nop
      // 193: fmul
      // 194: fconst_0
      // 195: invokestatic hzu.a4k (FFF)V
      // 198: ldc 45.0
      // 19a: nop
      // 19b: fconst_0
      // 19c: fconst_1
      // 19d: fconst_0
      // 19e: invokestatic hzu.a2h (FFFF)V
      // 1a1: fload 1
      // 1a2: fload 1
      // 1a3: fmul
      // 1a4: ldc 3.1415927
      // 1a6: nop
      // 1a7: fmul
      // 1a8: invokestatic fe6.rtn (F)F
      // 1ab: fstore 7
      // 1ad: fload 1
      // 1ae: invokestatic fe6.bug (F)F
      // 1b1: ldc 3.1415927
      // 1b3: nop
      // 1b4: fmul
      // 1b5: invokestatic fe6.rtn (F)F
      // 1b8: fstore 8
      // 1ba: fload 7
      // 1bc: ldc -20.0
      // 1be: nop
      // 1bf: fmul
      // 1c0: fconst_0
      // 1c1: fconst_1
      // 1c2: fconst_0
      // 1c3: invokestatic hzu.a2h (FFFF)V
      // 1c6: fload 7
      // 1c8: ldc -20.0
      // 1ca: nop
      // 1cb: fmul
      // 1cc: fconst_1
      // 1cd: fconst_0
      // 1ce: fconst_0
      // 1cf: invokestatic hzu.a2h (FFFF)V
      // 1d2: ldc 0.4
      // 1d4: nop
      // 1d5: ldc 0.4
      // 1d7: nop
      // 1d8: ldc 0.4
      // 1da: nop
      // 1db: invokestatic hzu.syc (FFF)V
      // 1de: aload 0
      // 1df: invokespecial mlb.m_5 ()V
      // 1e2: iload 5
      // 1e4: ifeq 75d
      // 1e7: getstatic nlh.fam Lc_3;
      // 1ea: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 1ed: sipush 8009
      // 1f0: ldc2_w 6274649335114834399
      // 1f3: lload 3
      // 1f4: lxor
      // 1f5: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: nop
      // 1fb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1fe: goto 205
      // 201: invokestatic mlb.a (Loov;)Loov;
      // 204: athrow
      // 205: iload 5
      // 207: ifne 275
      // 20a: ifeq 257
      // 20d: goto 214
      // 210: invokestatic mlb.a (Loov;)Loov;
      // 213: athrow
      // 214: aload 0
      // 215: fload 2
      // 216: fload 1
      // 217: invokespecial mlb.f4o (FF)V
      // 21a: aload 0
      // 21b: invokespecial mlb.m_5 ()V
      // 21e: dconst_1
      // 21f: ldc2_w -0.1
      // 222: ldc2_w 0.5
      // 225: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 228: ldc -1.0
      // 22a: nop
      // 22b: aload 0
      // 22c: getfield mlb.l1d Lc05;
      // 22f: getfield c05.vg8 Ll86;
      // 232: invokevirtual l86.hzv ()Z
      // 235: ifeq 249
      // 238: goto 23f
      // 23b: invokestatic mlb.a (Loov;)Loov;
      // 23e: athrow
      // 23f: ldc -0.2
      // 241: nop
      // 242: goto 24c
      // 245: invokestatic mlb.a (Loov;)Loov;
      // 248: athrow
      // 249: ldc -0.3
      // 24b: nop
      // 24c: ldc 0.1
      // 24e: nop
      // 24f: invokestatic org/lwjgl/opengl/GL11.glTranslatef (FFF)V
      // 252: iload 5
      // 254: ifeq 75d
      // 257: getstatic nlh.fam Lc_3;
      // 25a: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 25d: sipush 20522
      // 260: ldc2_w 2704218727556673208
      // 263: lload 3
      // 264: lxor
      // 265: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: nop
      // 26b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 26e: goto 275
      // 271: invokestatic mlb.a (Loov;)Loov;
      // 274: athrow
      // 275: iload 5
      // 277: ifne 2b8
      // 27a: ifeq 29a
      // 27d: goto 284
      // 280: invokestatic mlb.a (Loov;)Loov;
      // 283: athrow
      // 284: aload 0
      // 285: fload 2
      // 286: fload 1
      // 287: invokespecial mlb.f4o (FF)V
      // 28a: aload 0
      // 28b: invokespecial mlb.m_5 ()V
      // 28e: iload 5
      // 290: ifeq 75d
      // 293: goto 29a
      // 296: invokestatic mlb.a (Loov;)Loov;
      // 299: athrow
      // 29a: getstatic nlh.fam Lc_3;
      // 29d: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 2a0: sipush 26100
      // 2a3: ldc2_w 76313934121851761
      // 2a6: lload 3
      // 2a7: lxor
      // 2a8: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: nop
      // 2ae: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b1: goto 2b8
      // 2b4: invokestatic mlb.a (Loov;)Loov;
      // 2b7: athrow
      // 2b8: iload 5
      // 2ba: ifne 2fb
      // 2bd: ifeq 2dd
      // 2c0: goto 2c7
      // 2c3: invokestatic mlb.a (Loov;)Loov;
      // 2c6: athrow
      // 2c7: aload 0
      // 2c8: fload 2
      // 2c9: fconst_0
      // 2ca: invokespecial mlb.f4o (FF)V
      // 2cd: aload 0
      // 2ce: invokespecial mlb.m_5 ()V
      // 2d1: iload 5
      // 2d3: ifeq 75d
      // 2d6: goto 2dd
      // 2d9: invokestatic mlb.a (Loov;)Loov;
      // 2dc: athrow
      // 2dd: getstatic nlh.fam Lc_3;
      // 2e0: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 2e3: sipush 8310
      // 2e6: ldc2_w 1566137813363924709
      // 2e9: lload 3
      // 2ea: lxor
      // 2eb: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: nop
      // 2f1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f4: goto 2fb
      // 2f7: invokestatic mlb.a (Loov;)Loov;
      // 2fa: athrow
      // 2fb: iload 5
      // 2fd: ifne 343
      // 300: ifeq 325
      // 303: goto 30a
      // 306: invokestatic mlb.a (Loov;)Loov;
      // 309: athrow
      // 30a: aload 0
      // 30b: fload 1
      // 30c: invokespecial mlb.cxz (F)V
      // 30f: aload 0
      // 310: fload 2
      // 311: fconst_0
      // 312: invokespecial mlb.f4o (FF)V
      // 315: aload 0
      // 316: invokespecial mlb.m_5 ()V
      // 319: iload 5
      // 31b: ifeq 75d
      // 31e: goto 325
      // 321: invokestatic mlb.a (Loov;)Loov;
      // 324: athrow
      // 325: getstatic nlh.fam Lc_3;
      // 328: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 32b: sipush 26999
      // 32e: ldc2_w 7268202618565646304
      // 331: lload 3
      // 332: lxor
      // 333: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: nop
      // 339: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 33c: goto 343
      // 33f: invokestatic mlb.a (Loov;)Loov;
      // 342: athrow
      // 343: iload 5
      // 345: ifne 38b
      // 348: ifeq 36d
      // 34b: goto 352
      // 34e: invokestatic mlb.a (Loov;)Loov;
      // 351: athrow
      // 352: aload 0
      // 353: fload 1
      // 354: invokespecial mlb.cxz (F)V
      // 357: aload 0
      // 358: fload 2
      // 359: fload 1
      // 35a: invokespecial mlb.f4o (FF)V
      // 35d: aload 0
      // 35e: invokespecial mlb.m_5 ()V
      // 361: iload 5
      // 363: ifeq 75d
      // 366: goto 36d
      // 369: invokestatic mlb.a (Loov;)Loov;
      // 36c: athrow
      // 36d: getstatic nlh.fam Lc_3;
      // 370: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 373: sipush 28966
      // 376: ldc2_w 3373568225039732666
      // 379: lload 3
      // 37a: lxor
      // 37b: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: nop
      // 381: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 384: goto 38b
      // 387: invokestatic mlb.a (Loov;)Loov;
      // 38a: athrow
      // 38b: iload 5
      // 38d: ifne 3e4
      // 390: ifeq 3c6
      // 393: goto 39a
      // 396: invokestatic mlb.a (Loov;)Loov;
      // 399: athrow
      // 39a: ldc -0.16
      // 39c: nop
      // 39d: ldc -0.0
      // 39f: nop
      // 3a0: ldc -0.412
      // 3a2: nop
      // 3a3: invokestatic hzu.a4k (FFF)V
      // 3a6: ldc -0.04
      // 3a8: nop
      // 3a9: ldc 0.3
      // 3ab: nop
      // 3ac: fconst_0
      // 3ad: invokestatic hzu.a4k (FFF)V
      // 3b0: aload 0
      // 3b1: fload 2
      // 3b2: fload 1
      // 3b3: invokespecial mlb.f4o (FF)V
      // 3b6: aload 0
      // 3b7: invokespecial mlb.m_5 ()V
      // 3ba: iload 5
      // 3bc: ifeq 75d
      // 3bf: goto 3c6
      // 3c2: invokestatic mlb.a (Loov;)Loov;
      // 3c5: athrow
      // 3c6: getstatic nlh.fam Lc_3;
      // 3c9: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 3cc: sipush 10682
      // 3cf: ldc2_w 144357655978252067
      // 3d2: lload 3
      // 3d3: lxor
      // 3d4: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: nop
      // 3da: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3dd: goto 3e4
      // 3e0: invokestatic mlb.a (Loov;)Loov;
      // 3e3: athrow
      // 3e4: iload 5
      // 3e6: ifne 489
      // 3e9: ifeq 46b
      // 3ec: goto 3f3
      // 3ef: invokestatic mlb.a (Loov;)Loov;
      // 3f2: athrow
      // 3f3: ldc 0.56
      // 3f5: nop
      // 3f6: ldc -0.35
      // 3f8: nop
      // 3f9: ldc -0.71999997
      // 3fb: nop
      // 3fc: invokestatic hzu.a4k (FFF)V
      // 3ff: fconst_0
      // 400: fload 2
      // 401: ldc -0.6
      // 403: nop
      // 404: fmul
      // 405: fconst_0
      // 406: invokestatic hzu.a4k (FFF)V
      // 409: invokestatic ybv.eb0 ()F
      // 40c: fconst_0
      // 40d: fconst_1
      // 40e: fconst_0
      // 40f: invokestatic hzu.a2h (FFFF)V
      // 412: fload 1
      // 413: fload 1
      // 414: fmul
      // 415: ldc 3.1415927
      // 417: nop
      // 418: fmul
      // 419: invokestatic fe6.rtn (F)F
      // 41c: fstore 7
      // 41e: fload 1
      // 41f: invokestatic fe6.bug (F)F
      // 422: ldc 3.1415927
      // 424: nop
      // 425: fmul
      // 426: invokestatic fe6.rtn (F)F
      // 429: fstore 8
      // 42b: fload 7
      // 42d: ldc -20.0
      // 42f: nop
      // 430: fmul
      // 431: fconst_0
      // 432: fconst_1
      // 433: fconst_0
      // 434: invokestatic hzu.a2h (FFFF)V
      // 437: fload 8
      // 439: ldc -20.0
      // 43b: nop
      // 43c: fmul
      // 43d: fconst_0
      // 43e: fconst_0
      // 43f: fconst_1
      // 440: invokestatic hzu.a2h (FFFF)V
      // 443: fload 8
      // 445: ldc -80.0
      // 447: nop
      // 448: fmul
      // 449: fconst_1
      // 44a: fconst_0
      // 44b: fconst_0
      // 44c: invokestatic hzu.a2h (FFFF)V
      // 44f: ldc 60.0
      // 451: nop
      // 452: fconst_1
      // 453: fconst_0
      // 454: ldc 20.0
      // 456: nop
      // 457: invokestatic hzu.a2h (FFFF)V
      // 45a: ldc 0.34
      // 45c: nop
      // 45d: ldc 0.34
      // 45f: nop
      // 460: ldc 0.34
      // 462: nop
      // 463: invokestatic hzu.syc (FFF)V
      // 466: iload 5
      // 468: ifeq 75d
      // 46b: getstatic nlh.fam Lc_3;
      // 46e: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 471: sipush 228
      // 474: ldc2_w 2787121232369008244
      // 477: lload 3
      // 478: lxor
      // 479: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47e: nop
      // 47f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 482: goto 489
      // 485: invokestatic mlb.a (Loov;)Loov;
      // 488: athrow
      // 489: iload 5
      // 48b: ifne 500
      // 48e: ifeq 4e2
      // 491: goto 498
      // 494: invokestatic mlb.a (Loov;)Loov;
      // 497: athrow
      // 498: ldc 1.5
      // 49a: nop
      // 49b: ldc -1.3
      // 49d: nop
      // 49e: ldc -2.0
      // 4a0: nop
      // 4a1: invokestatic hzu.a4k (FFF)V
      // 4a4: ldc -150.0
      // 4a6: nop
      // 4a7: fconst_0
      // 4a8: fconst_1
      // 4a9: fconst_0
      // 4aa: invokestatic hzu.a2h (FFFF)V
      // 4ad: ldc -64.0
      // 4af: nop
      // 4b0: fconst_0
      // 4b1: fconst_1
      // 4b2: fconst_0
      // 4b3: invokestatic hzu.a2h (FFFF)V
      // 4b6: invokestatic ybv.eb0 ()F
      // 4b9: ldc 0.7
      // 4bb: nop
      // 4bc: fconst_1
      // 4bd: fconst_1
      // 4be: invokestatic hzu.a2h (FFFF)V
      // 4c1: ldc 64.0
      // 4c3: nop
      // 4c4: fconst_1
      // 4c5: fconst_1
      // 4c6: fconst_0
      // 4c7: invokestatic hzu.a2h (FFFF)V
      // 4ca: ldc 0.8
      // 4cc: nop
      // 4cd: ldc 0.8
      // 4cf: nop
      // 4d0: ldc 0.8
      // 4d2: nop
      // 4d3: invokestatic hzu.syc (FFF)V
      // 4d6: iload 5
      // 4d8: ifeq 75d
      // 4db: goto 4e2
      // 4de: invokestatic mlb.a (Loov;)Loov;
      // 4e1: athrow
      // 4e2: getstatic nlh.fam Lc_3;
      // 4e5: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 4e8: sipush 3678
      // 4eb: ldc2_w 4606261294394355919
      // 4ee: lload 3
      // 4ef: lxor
      // 4f0: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f5: nop
      // 4f6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f9: goto 500
      // 4fc: invokestatic mlb.a (Loov;)Loov;
      // 4ff: athrow
      // 500: iload 5
      // 502: ifne 58c
      // 505: ifeq 56e
      // 508: goto 50f
      // 50b: invokestatic mlb.a (Loov;)Loov;
      // 50e: athrow
      // 50f: aload 0
      // 510: fload 2
      // 511: fconst_1
      // 512: invokespecial mlb.f4o (FF)V
      // 515: ldc -50.0
      // 517: nop
      // 518: fconst_0
      // 519: fconst_1
      // 51a: fconst_0
      // 51b: invokestatic hzu.a2h (FFFF)V
      // 51e: ldc 0.56
      // 520: nop
      // 521: ldc 0.2
      // 523: nop
      // 524: ldc -0.11999997
      // 526: nop
      // 527: invokestatic hzu.a4k (FFF)V
      // 52a: ldc -0.4
      // 52c: nop
      // 52d: fload 1
      // 52e: invokestatic fe6.bug (F)F
      // 531: ldc 3.1415927
      // 533: nop
      // 534: fmul
      // 535: invokestatic fe6.rtn (F)F
      // 538: fmul
      // 539: fstore 7
      // 53b: ldc 0.2
      // 53d: nop
      // 53e: fload 1
      // 53f: invokestatic fe6.bug (F)F
      // 542: ldc 3.1415927
      // 544: nop
      // 545: fmul
      // 546: fconst_2
      // 547: fmul
      // 548: invokestatic fe6.rtn (F)F
      // 54b: fmul
      // 54c: fstore 8
      // 54e: ldc -0.2
      // 550: nop
      // 551: fload 1
      // 552: ldc 3.1415927
      // 554: nop
      // 555: fmul
      // 556: invokestatic fe6.rtn (F)F
      // 559: fmul
      // 55a: fstore 9
      // 55c: fload 7
      // 55e: fload 8
      // 560: fload 9
      // 562: invokestatic org/lwjgl/opengl/GL11.glTranslatef (FFF)V
      // 565: aload 0
      // 566: invokespecial mlb.m_5 ()V
      // 569: iload 5
      // 56b: ifeq 75d
      // 56e: getstatic nlh.fam Lc_3;
      // 571: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 574: sipush 19899
      // 577: ldc2_w 8271323788995654458
      // 57a: lload 3
      // 57b: lxor
      // 57c: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 581: nop
      // 582: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 585: goto 58c
      // 588: invokestatic mlb.a (Loov;)Loov;
      // 58b: athrow
      // 58c: iload 5
      // 58e: ifne 5d1
      // 591: ifeq 5b3
      // 594: goto 59b
      // 597: invokestatic mlb.a (Loov;)Loov;
      // 59a: athrow
      // 59b: aload 0
      // 59c: fload 2
      // 59d: fconst_2
      // 59e: fdiv
      // 59f: fload 1
      // 5a0: invokespecial mlb.f4o (FF)V
      // 5a3: aload 0
      // 5a4: invokespecial mlb.m_5 ()V
      // 5a7: iload 5
      // 5a9: ifeq 75d
      // 5ac: goto 5b3
      // 5af: invokestatic mlb.a (Loov;)Loov;
      // 5b2: athrow
      // 5b3: getstatic nlh.fam Lc_3;
      // 5b6: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 5b9: sipush 30999
      // 5bc: ldc2_w 1849029804388403087
      // 5bf: lload 3
      // 5c0: lxor
      // 5c1: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c6: nop
      // 5c7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5ca: goto 5d1
      // 5cd: invokestatic mlb.a (Loov;)Loov;
      // 5d0: athrow
      // 5d1: iload 5
      // 5d3: ifne 64a
      // 5d6: ifeq 62c
      // 5d9: goto 5e0
      // 5dc: invokestatic mlb.a (Loov;)Loov;
      // 5df: athrow
      // 5e0: aload 0
      // 5e1: fload 2
      // 5e2: fconst_2
      // 5e3: fdiv
      // 5e4: fload 1
      // 5e5: invokespecial mlb.f4o (FF)V
      // 5e8: fload 1
      // 5e9: invokestatic fe6.bug (F)F
      // 5ec: ldc 3.1415927
      // 5ee: nop
      // 5ef: fmul
      // 5f0: invokestatic fe6.rtn (F)F
      // 5f3: fstore 6
      // 5f5: fload 6
      // 5f7: ldc 30.0
      // 5f9: nop
      // 5fa: fmul
      // 5fb: fconst_2
      // 5fc: fdiv
      // 5fd: fload 6
      // 5ff: fneg
      // 600: ldc -0.0
      // 602: nop
      // 603: ldc 9.0
      // 605: nop
      // 606: invokestatic hzu.a2h (FFFF)V
      // 609: fload 6
      // 60b: ldc 40.0
      // 60d: nop
      // 60e: fmul
      // 60f: fconst_1
      // 610: fload 6
      // 612: fneg
      // 613: fconst_2
      // 614: fdiv
      // 615: ldc -0.0
      // 617: nop
      // 618: invokestatic hzu.a2h (FFFF)V
      // 61b: fconst_0
      // 61c: ldc 0.3
      // 61e: nop
      // 61f: fconst_0
      // 620: invokestatic hzu.a4k (FFF)V
      // 623: aload 0
      // 624: invokespecial mlb.m_5 ()V
      // 627: iload 5
      // 629: ifeq 75d
      // 62c: getstatic nlh.fam Lc_3;
      // 62f: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 632: sipush 22792
      // 635: ldc2_w 2120693678123542428
      // 638: lload 3
      // 639: lxor
      // 63a: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63f: nop
      // 640: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 643: goto 64a
      // 646: invokestatic mlb.a (Loov;)Loov;
      // 649: athrow
      // 64a: iload 5
      // 64c: ifne 6c4
      // 64f: ifeq 6a6
      // 652: goto 659
      // 655: invokestatic mlb.a (Loov;)Loov;
      // 658: athrow
      // 659: aload 0
      // 65a: fload 2
      // 65b: fconst_2
      // 65c: fdiv
      // 65d: fconst_0
      // 65e: invokespecial mlb.f4o (FF)V
      // 661: fload 1
      // 662: fload 1
      // 663: fmul
      // 664: ldc 3.1415927
      // 666: nop
      // 667: fmul
      // 668: invokestatic fe6.rtn (F)F
      // 66b: fstore 6
      // 66d: fload 6
      // 66f: fneg
      // 670: ldc 40.0
      // 672: nop
      // 673: fmul
      // 674: fconst_2
      // 675: fdiv
      // 676: fload 6
      // 678: fconst_2
      // 679: fdiv
      // 67a: ldc -0.0
      // 67c: nop
      // 67d: ldc 9.0
      // 67f: nop
      // 680: invokestatic hzu.a2h (FFFF)V
      // 683: fload 6
      // 685: fneg
      // 686: ldc 30.0
      // 688: nop
      // 689: fmul
      // 68a: fconst_1
      // 68b: fload 6
      // 68d: fconst_2
      // 68e: fdiv
      // 68f: ldc -0.0
      // 691: nop
      // 692: invokestatic hzu.a2h (FFFF)V
      // 695: fconst_0
      // 696: ldc 0.3
      // 698: nop
      // 699: fconst_0
      // 69a: invokestatic hzu.a4k (FFF)V
      // 69d: aload 0
      // 69e: invokespecial mlb.m_5 ()V
      // 6a1: iload 5
      // 6a3: ifeq 75d
      // 6a6: getstatic nlh.fam Lc_3;
      // 6a9: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 6ac: sipush 1311
      // 6af: ldc2_w 970647367573158788
      // 6b2: lload 3
      // 6b3: lxor
      // 6b4: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b9: nop
      // 6ba: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6bd: goto 6c4
      // 6c0: invokestatic mlb.a (Loov;)Loov;
      // 6c3: athrow
      // 6c4: ifeq 70f
      // 6c7: aload 0
      // 6c8: fload 2
      // 6c9: fconst_2
      // 6ca: fdiv
      // 6cb: fload 1
      // 6cc: invokespecial mlb.f4o (FF)V
      // 6cf: fload 1
      // 6d0: invokestatic fe6.bug (F)F
      // 6d3: ldc 3.1415927
      // 6d5: nop
      // 6d6: fmul
      // 6d7: invokestatic fe6.rtn (F)F
      // 6da: fstore 6
      // 6dc: fload 6
      // 6de: ldc 30.0
      // 6e0: nop
      // 6e1: fmul
      // 6e2: fload 6
      // 6e4: fneg
      // 6e5: ldc -0.0
      // 6e7: nop
      // 6e8: ldc 9.0
      // 6ea: nop
      // 6eb: invokestatic hzu.a2h (FFFF)V
      // 6ee: fload 6
      // 6f0: ldc 40.0
      // 6f2: nop
      // 6f3: fmul
      // 6f4: fconst_1
      // 6f5: fload 6
      // 6f7: fneg
      // 6f8: ldc -0.0
      // 6fa: nop
      // 6fb: invokestatic hzu.a2h (FFFF)V
      // 6fe: fconst_0
      // 6ff: ldc 0.3
      // 701: nop
      // 702: fconst_0
      // 703: invokestatic hzu.a4k (FFF)V
      // 706: aload 0
      // 707: invokespecial mlb.m_5 ()V
      // 70a: iload 5
      // 70c: ifeq 75d
      // 70f: aload 0
      // 710: fload 2
      // 711: fconst_2
      // 712: fdiv
      // 713: ldc -0.2
      // 715: nop
      // 716: invokespecial mlb.f4o (FF)V
      // 719: fload 1
      // 71a: fload 1
      // 71b: fmul
      // 71c: ldc 3.1415927
      // 71e: nop
      // 71f: fmul
      // 720: invokestatic fe6.rtn (F)F
      // 723: fstore 6
      // 725: fload 6
      // 727: fneg
      // 728: fconst_1
      // 729: fmul
      // 72a: ldc 19.0
      // 72c: nop
      // 72d: fdiv
      // 72e: fload 6
      // 730: ldc 20.0
      // 732: nop
      // 733: fdiv
      // 734: ldc -0.0
      // 736: nop
      // 737: ldc 9.0
      // 739: nop
      // 73a: invokestatic hzu.a2h (FFFF)V
      // 73d: fload 6
      // 73f: fneg
      // 740: ldc 30.0
      // 742: nop
      // 743: fmul
      // 744: ldc 10.0
      // 746: nop
      // 747: fload 6
      // 749: ldc 50.0
      // 74b: nop
      // 74c: fdiv
      // 74d: fconst_0
      // 74e: invokestatic hzu.a2h (FFFF)V
      // 751: fconst_0
      // 752: ldc 0.3
      // 754: nop
      // 755: fconst_0
      // 756: invokestatic hzu.a4k (FFF)V
      // 759: aload 0
      // 75a: invokespecial mlb.m_5 ()V
      // 75d: getstatic nlh.din Lcrk;
      // 760: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 763: invokevirtual java/lang/Float.floatValue ()F
      // 766: getstatic nlh.wre Lcrk;
      // 769: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 76c: invokevirtual java/lang/Float.floatValue ()F
      // 76f: getstatic nlh.f6y Lcrk;
      // 772: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 775: invokevirtual java/lang/Float.floatValue ()F
      // 778: invokestatic hzu.a4k (FFF)V
      // 77b: return
   }

   public void xu_(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic mlb.a J
      // 003: ldc2_w 124833997424647
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: invokestatic hxt.ly3 ()Z
      // 010: iload 4
      // 012: ifeq 022
      // 015: ifeq 025
      // 018: goto 01f
      // 01b: invokestatic mlb.a (Loov;)Loov;
      // 01e: athrow
      // 01f: invokestatic net/optifine/shaders/Shaders.isSkipRenderHand ()Z
      // 022: ifne 2d2
      // 025: fconst_1
      // 026: aload 0
      // 027: getfield mlb.c80 F
      // 02a: aload 0
      // 02b: getfield mlb.n4w F
      // 02e: aload 0
      // 02f: getfield mlb.c80 F
      // 032: fsub
      // 033: fload 1
      // 034: fmul
      // 035: fadd
      // 036: fsub
      // 037: fstore 5
      // 039: aload 0
      // 03a: getfield mlb.l1d Lc05;
      // 03d: getfield c05.vg8 Ll86;
      // 040: astore 6
      // 042: aload 6
      // 044: fload 1
      // 045: invokevirtual x0l.tcg (F)F
      // 048: fstore 7
      // 04a: aload 6
      // 04c: getfield x0l.j25 F
      // 04f: aload 6
      // 051: getfield x0l.y2i F
      // 054: aload 6
      // 056: getfield x0l.j25 F
      // 059: fsub
      // 05a: fload 1
      // 05b: fmul
      // 05c: fadd
      // 05d: fstore 8
      // 05f: aload 6
      // 061: getfield x0l.p3h F
      // 064: aload 6
      // 066: getfield x0l.x5k F
      // 069: aload 6
      // 06b: getfield x0l.p3h F
      // 06e: fsub
      // 06f: fload 1
      // 070: fmul
      // 071: fadd
      // 072: fstore 9
      // 074: aload 0
      // 075: fload 8
      // 077: fload 9
      // 079: invokespecial mlb.tfw (FF)V
      // 07c: aload 0
      // 07d: aload 6
      // 07f: invokespecial mlb.cz3 (Lx0l;)V
      // 082: aload 0
      // 083: aload 6
      // 085: checkcast l86
      // 088: fload 1
      // 089: invokespecial mlb.zk1 (Ll86;F)V
      // 08c: invokestatic hzu.ixc ()V
      // 08f: invokestatic hzu.dp2 ()V
      // 092: aload 0
      // 093: getfield mlb.xc8 Lerg;
      // 096: ifnull 2a9
      // 099: getstatic ce2.rrm Lce2;
      // 09c: astore 10
      // 09e: aload 0
      // 09f: iload 4
      // 0a1: ifeq 0bf
      // 0a4: getfield mlb.xc8 Lerg;
      // 0a7: invokevirtual erg.gn1 ()Lu7m;
      // 0aa: getstatic xbr.kdv Lf58;
      // 0ad: if_acmpne 0cf
      // 0b0: goto 0b7
      // 0b3: invokestatic mlb.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: goto 0bf
      // 0bb: invokestatic mlb.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 6
      // 0c1: fload 8
      // 0c3: fload 5
      // 0c5: fload 7
      // 0c7: invokespecial mlb.pld (Lx0l;FFF)V
      // 0ca: iload 4
      // 0cc: ifne 26a
      // 0cf: aload 6
      // 0d1: invokevirtual x0l.m9h ()I
      // 0d4: iload 4
      // 0d6: ifeq 191
      // 0d9: goto 0e0
      // 0dc: invokestatic mlb.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: ifle 184
      // 0e3: goto 0ea
      // 0e6: invokestatic mlb.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: getfield mlb.xc8 Lerg;
      // 0ee: invokevirtual erg.pdv ()Lce2;
      // 0f1: astore 10
      // 0f3: iload 4
      // 0f5: ifeq 136
      // 0f8: getstatic mlb$1.tvh [I
      // 0fb: aload 10
      // 0fd: invokevirtual ce2.ordinal ()I
      // 100: iaload
      // 101: tableswitch 126 1 5 39 58 58 85 105
      // 124: invokestatic mlb.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 0
      // 129: fload 5
      // 12b: fconst_0
      // 12c: invokespecial mlb.f4o (FF)V
      // 12f: goto 136
      // 132: invokestatic mlb.a (Loov;)Loov;
      // 135: athrow
      // 136: iload 4
      // 138: ifne 17f
      // 13b: aload 0
      // 13c: aload 6
      // 13e: fload 1
      // 13f: invokespecial mlb.qeh (Lx0l;F)V
      // 142: aload 0
      // 143: fload 5
      // 145: fload 7
      // 147: invokespecial mlb.f4o (FF)V
      // 14a: iload 4
      // 14c: ifne 17f
      // 14f: goto 156
      // 152: invokestatic mlb.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 0
      // 157: fload 7
      // 159: fload 5
      // 15b: invokevirtual mlb.p79 (FF)V
      // 15e: iload 4
      // 160: ifne 17f
      // 163: goto 16a
      // 166: invokestatic mlb.a (Loov;)Loov;
      // 169: athrow
      // 16a: aload 0
      // 16b: fload 5
      // 16d: fconst_0
      // 16e: invokespecial mlb.f4o (FF)V
      // 171: aload 0
      // 172: fload 1
      // 173: aload 6
      // 175: invokespecial mlb.ttb (FLx0l;)V
      // 178: goto 17f
      // 17b: invokestatic mlb.a (Loov;)Loov;
      // 17e: athrow
      // 17f: iload 4
      // 181: ifne 26a
      // 184: getstatic zwr.rut Lcn7;
      // 187: invokevirtual cn7.g7m ()Z
      // 18a: goto 191
      // 18d: invokestatic mlb.a (Loov;)Loov;
      // 190: athrow
      // 191: iload 4
      // 193: ifeq 1cd
      // 196: ifeq 1c3
      // 199: goto 1a0
      // 19c: invokestatic mlb.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: iload 4
      // 1a3: ifeq 228
      // 1a6: goto 1ad
      // 1a9: invokestatic mlb.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: getfield mlb.l1d Lc05;
      // 1b0: getfield c05.oxn Lmoh;
      // 1b3: getfield moh.oxt Lm7l;
      // 1b6: getfield m7l.m7n Z
      // 1b9: ifne 222
      // 1bc: goto 1c3
      // 1bf: invokestatic mlb.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: invokestatic fyk.szx ()Z
      // 1c6: goto 1cd
      // 1c9: invokestatic mlb.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: iload 4
      // 1cf: ifeq 252
      // 1d2: ifeq 234
      // 1d5: goto 1dc
      // 1d8: invokestatic mlb.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: getfield mlb.l1d Lc05;
      // 1e0: getfield c05.vg8 Ll86;
      // 1e3: invokevirtual l86.tsc ()Lerg;
      // 1e6: iload 4
      // 1e8: ifeq 20d
      // 1eb: goto 1f2
      // 1ee: invokestatic mlb.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: ifnull 234
      // 1f5: goto 1fc
      // 1f8: invokestatic mlb.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: getfield mlb.l1d Lc05;
      // 200: getfield c05.vg8 Ll86;
      // 203: invokevirtual l86.tsc ()Lerg;
      // 206: goto 20d
      // 209: invokestatic mlb.a (Loov;)Loov;
      // 20c: athrow
      // 20d: invokevirtual erg.gn1 ()Lu7m;
      // 210: instanceof za6
      // 213: iload 4
      // 215: ifeq 252
      // 218: ifeq 234
      // 21b: goto 222
      // 21e: invokestatic mlb.a (Loov;)Loov;
      // 221: athrow
      // 222: getstatic ce2.b7w Lce2;
      // 225: astore 10
      // 227: aload 0
      // 228: fload 7
      // 22a: fload 5
      // 22c: invokevirtual mlb.p79 (FF)V
      // 22f: iload 4
      // 231: ifne 26a
      // 234: getstatic nlh.fam Lc_3;
      // 237: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 23a: sipush 17904
      // 23d: ldc2_w 1030885988387162407
      // 240: lload 2
      // 241: lxor
      // 242: invokedynamic o (IJ)Ljava/lang/String; bsm=mlb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: nop
      // 248: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24b: goto 252
      // 24e: invokestatic mlb.a (Loov;)Loov;
      // 251: athrow
      // 252: ifne 262
      // 255: aload 0
      // 256: fload 7
      // 258: invokespecial mlb.cxz (F)V
      // 25b: goto 262
      // 25e: invokestatic mlb.a (Loov;)Loov;
      // 261: athrow
      // 262: aload 0
      // 263: fload 5
      // 265: fload 7
      // 267: invokespecial mlb.f4o (FF)V
      // 26a: aload 10
      // 26c: getstatic ce2.rrm Lce2;
      // 26f: if_acmpne 297
      // 272: getstatic nlh.fja Lcrk;
      // 275: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 278: invokevirtual java/lang/Float.floatValue ()F
      // 27b: getstatic nlh.coo Lcrk;
      // 27e: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 281: invokevirtual java/lang/Float.floatValue ()F
      // 284: getstatic nlh.hm4 Lcrk;
      // 287: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 28a: invokevirtual java/lang/Float.floatValue ()F
      // 28d: invokestatic hzu.a4k (FFF)V
      // 290: goto 297
      // 293: invokestatic mlb.a (Loov;)Loov;
      // 296: athrow
      // 297: aload 0
      // 298: aload 6
      // 29a: aload 0
      // 29b: getfield mlb.xc8 Lerg;
      // 29e: getstatic flk$gbm.t9v Lflk$gbm;
      // 2a1: invokevirtual mlb.xwn (Lg_3;Lerg;Lflk$gbm;)V
      // 2a4: iload 4
      // 2a6: ifne 2c9
      // 2a9: aload 6
      // 2ab: invokevirtual x0l.h5u ()Z
      // 2ae: ifne 2c9
      // 2b1: goto 2b8
      // 2b4: invokestatic mlb.a (Loov;)Loov;
      // 2b7: athrow
      // 2b8: aload 0
      // 2b9: aload 6
      // 2bb: fload 5
      // 2bd: fload 7
      // 2bf: invokespecial mlb.ep_ (Lx0l;FF)V
      // 2c2: goto 2c9
      // 2c5: invokestatic mlb.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: invokestatic hzu.x3w ()V
      // 2cc: invokestatic hzu.eiq ()V
      // 2cf: invokestatic qpm.cng ()V
      // 2d2: return
   }

   public void izc(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: invokestatic hzu.vtj ()V
      // 007: aload 0
      // 008: getfield mlb.l1d Lc05;
      // 00b: getfield c05.vg8 Ll86;
      // 00e: invokevirtual l86.sqy ()Z
      // 011: iload 2
      // 012: ifne 17f
      // 015: ifeq 175
      // 018: goto 01f
      // 01b: invokestatic mlb.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield mlb.l1d Lc05;
      // 023: getfield c05.tij Lkh3;
      // 026: new mew
      // 029: dup
      // 02a: aload 0
      // 02b: getfield mlb.l1d Lc05;
      // 02e: getfield c05.vg8 Ll86;
      // 031: invokespecial mew.<init> (Li2h;)V
      // 034: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 037: astore 3
      // 038: new mew
      // 03b: dup
      // 03c: aload 0
      // 03d: getfield mlb.l1d Lc05;
      // 040: getfield c05.vg8 Ll86;
      // 043: invokespecial mew.<init> (Li2h;)V
      // 046: astore 4
      // 048: aload 0
      // 049: getfield mlb.l1d Lc05;
      // 04c: getfield c05.vg8 Ll86;
      // 04f: astore 5
      // 051: bipush 0
      // 052: istore 6
      // 054: iload 6
      // 056: bipush 8
      // 058: if_icmpge 104
      // 05b: aload 5
      // 05d: getfield ha9.o2v D
      // 060: iload 6
      // 062: bipush 0
      // 063: ishr
      // 064: bipush 2
      // 065: irem
      // 066: i2f
      // 067: ldc 0.5
      // 069: nop
      // 06a: fsub
      // 06b: aload 5
      // 06d: getfield ha9.uo6 F
      // 070: fmul
      // 071: ldc 0.8
      // 073: nop
      // 074: fmul
      // 075: f2d
      // 076: dadd
      // 077: dstore 7
      // 079: aload 5
      // 07b: getfield ha9.kfp D
      // 07e: iload 6
      // 080: bipush 1
      // 081: ishr
      // 082: bipush 2
      // 083: irem
      // 084: i2f
      // 085: ldc 0.5
      // 087: nop
      // 088: fsub
      // 089: ldc 0.1
      // 08b: nop
      // 08c: fmul
      // 08d: f2d
      // 08e: dadd
      // 08f: dstore 9
      // 091: aload 5
      // 093: getfield ha9.vbd D
      // 096: iload 6
      // 098: bipush 2
      // 099: ishr
      // 09a: bipush 2
      // 09b: irem
      // 09c: i2f
      // 09d: ldc 0.5
      // 09f: nop
      // 0a0: fsub
      // 0a1: aload 5
      // 0a3: getfield ha9.uo6 F
      // 0a6: fmul
      // 0a7: ldc 0.8
      // 0a9: nop
      // 0aa: fmul
      // 0ab: f2d
      // 0ac: dadd
      // 0ad: dstore 11
      // 0af: new mew
      // 0b2: dup
      // 0b3: dload 7
      // 0b5: dload 9
      // 0b7: aload 5
      // 0b9: invokevirtual ha9.c5y ()F
      // 0bc: f2d
      // 0bd: dadd
      // 0be: dload 11
      // 0c0: invokespecial mew.<init> (DDD)V
      // 0c3: astore 13
      // 0c5: aload 0
      // 0c6: getfield mlb.l1d Lc05;
      // 0c9: getfield c05.tij Lkh3;
      // 0cc: aload 13
      // 0ce: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 0d1: astore 14
      // 0d3: iload 2
      // 0d4: ifne 100
      // 0d7: aload 14
      // 0d9: invokeinterface zfz.r_y ()Le0x; 1
      // 0de: invokevirtual e0x.zrr ()Z
      // 0e1: iload 2
      // 0e2: ifne 10d
      // 0e5: goto 0ec
      // 0e8: invokestatic mlb.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: ifeq 0fd
      // 0ef: goto 0f6
      // 0f2: invokestatic mlb.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 14
      // 0f8: astore 3
      // 0f9: aload 13
      // 0fb: astore 4
      // 0fd: iinc 6 1
      // 100: iload 2
      // 101: ifeq 054
      // 104: aload 3
      // 105: invokeinterface zfz.r_y ()Le0x; 1
      // 10a: invokevirtual e0x.kfj ()I
      // 10d: iload 2
      // 10e: ifne 17f
      // 111: bipush -1
      // 112: if_icmpeq 175
      // 115: goto 11c
      // 118: invokestatic mlb.a (Loov;)Loov;
      // 11b: athrow
      // 11c: getstatic net/optifine/reflect/Reflector.RenderBlockOverlayEvent_OverlayType_BLOCK Lnet/optifine/reflect/ReflectorField;
      // 11f: invokestatic net/optifine/reflect/Reflector.getFieldValue (Lnet/optifine/reflect/ReflectorField;)Ljava/lang/Object;
      // 122: astore 6
      // 124: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_renderBlockOverlay Lnet/optifine/reflect/ReflectorMethod;
      // 127: bipush 5
      // 128: anewarray 94
      // 12b: dup
      // 12c: bipush 0
      // 12d: aload 0
      // 12e: getfield mlb.l1d Lc05;
      // 131: getfield c05.vg8 Ll86;
      // 134: aastore
      // 135: dup
      // 136: bipush 1
      // 137: fload 1
      // 138: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 13b: aastore
      // 13c: dup
      // 13d: bipush 2
      // 13e: aload 6
      // 140: aastore
      // 141: dup
      // 142: bipush 3
      // 143: aload 3
      // 144: aastore
      // 145: dup
      // 146: bipush 4
      // 147: aload 4
      // 149: aastore
      // 14a: invokestatic net/optifine/reflect/Reflector.callBoolean (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 14d: iload 2
      // 14e: ifne 17f
      // 151: ifne 175
      // 154: goto 15b
      // 157: invokestatic mlb.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 0
      // 15c: fload 1
      // 15d: aload 0
      // 15e: getfield mlb.l1d Lc05;
      // 161: invokevirtual c05.dwz ()Lqfn;
      // 164: invokevirtual qfn.icl ()Lyig;
      // 167: aload 3
      // 168: invokevirtual yig.sqb (Lzfz;)Lsla;
      // 16b: invokespecial mlb.r1i (FLsla;)V
      // 16e: goto 175
      // 171: invokestatic mlb.a (Loov;)Loov;
      // 174: athrow
      // 175: aload 0
      // 176: getfield mlb.l1d Lc05;
      // 179: getfield c05.vg8 Ll86;
      // 17c: invokevirtual l86.myu ()Z
      // 17f: iload 2
      // 180: ifne 1a1
      // 183: ifne 234
      // 186: goto 18d
      // 189: invokestatic mlb.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield mlb.l1d Lc05;
      // 191: getfield c05.vg8 Ll86;
      // 194: getstatic p3y.six Lp3y;
      // 197: invokevirtual l86.v0c (Lp3y;)Z
      // 19a: goto 1a1
      // 19d: invokestatic mlb.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: iload 2
      // 1a2: ifne 1f5
      // 1a5: ifeq 1eb
      // 1a8: goto 1af
      // 1ab: invokestatic mlb.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_renderWaterOverlay Lnet/optifine/reflect/ReflectorMethod;
      // 1b2: bipush 2
      // 1b3: anewarray 94
      // 1b6: dup
      // 1b7: bipush 0
      // 1b8: aload 0
      // 1b9: getfield mlb.l1d Lc05;
      // 1bc: getfield c05.vg8 Ll86;
      // 1bf: aastore
      // 1c0: dup
      // 1c1: bipush 1
      // 1c2: fload 1
      // 1c3: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1c6: aastore
      // 1c7: invokestatic net/optifine/reflect/Reflector.callBoolean (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 1ca: iload 2
      // 1cb: ifne 1f5
      // 1ce: goto 1d5
      // 1d1: invokestatic mlb.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: ifne 1eb
      // 1d8: goto 1df
      // 1db: invokestatic mlb.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 0
      // 1e0: fload 1
      // 1e1: invokespecial mlb.t3c (F)V
      // 1e4: goto 1eb
      // 1e7: invokestatic mlb.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: getfield mlb.l1d Lc05;
      // 1ef: getfield c05.vg8 Ll86;
      // 1f2: invokevirtual l86.agj ()Z
      // 1f5: iload 2
      // 1f6: ifne 225
      // 1f9: ifeq 234
      // 1fc: goto 203
      // 1ff: invokestatic mlb.a (Loov;)Loov;
      // 202: athrow
      // 203: getstatic net/optifine/reflect/Reflector.ForgeEventFactory_renderFireOverlay Lnet/optifine/reflect/ReflectorMethod;
      // 206: bipush 2
      // 207: anewarray 94
      // 20a: dup
      // 20b: bipush 0
      // 20c: aload 0
      // 20d: getfield mlb.l1d Lc05;
      // 210: getfield c05.vg8 Ll86;
      // 213: aastore
      // 214: dup
      // 215: bipush 1
      // 216: fload 1
      // 217: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 21a: aastore
      // 21b: invokestatic net/optifine/reflect/Reflector.callBoolean (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 21e: goto 225
      // 221: invokestatic mlb.a (Loov;)Loov;
      // 224: athrow
      // 225: ifne 234
      // 228: aload 0
      // 229: fload 1
      // 22a: invokespecial mlb.bix (F)V
      // 22d: goto 234
      // 230: invokestatic mlb.a (Loov;)Loov;
      // 233: athrow
      // 234: invokestatic hzu.if9 ()V
      // 237: return
   }

   private void r1i(float var1, sla var2) {
      this.l1d.l22().anl(yu2.nu_);
      jom var3 = jom.yut();
      q3g var4 = var3.zuq();
      float var5 = 0.1F;
      hzu.wn0(0.1F, 0.1F, 0.1F, 0.5F);
      hzu.dp2();
      float var6 = -1.0F;
      float var7 = 1.0F;
      float var8 = -1.0F;
      float var9 = 1.0F;
      float var10 = -0.5F;
      float var11 = var2.l3u();
      float var12 = var2.w2b();
      float var13 = var2.bhi();
      float var14 = var2.e8_();
      var4.ezr(7, gnl._r5);
      var4.g5o(-1.0, -1.0, -0.5).h0a((double)var12, (double)var14).pzw();
      var4.g5o(1.0, -1.0, -0.5).h0a((double)var11, (double)var14).pzw();
      var4.g5o(1.0, 1.0, -0.5).h0a((double)var11, (double)var13).pzw();
      var4.g5o(-1.0, 1.0, -0.5).h0a((double)var12, (double)var13).pzw();
      var3.q7g();
      hzu.x3w();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void t3c(float var1) {
      int var2 = t9d.c();

      label24: {
         boolean var10000;
         label23: {
            try {
               var10000 = hxt.ly3();
               if (var2 != 0) {
                  break label23;
               }

               if (!var10000) {
                  break label24;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var10000 = Shaders.isUnderwaterOverlay();
         }

         if (!var10000) {
            return;
         }
      }

      this.l1d.l22().anl(msz);
      jom var3 = jom.yut();
      q3g var4 = var3.zuq();
      float var5 = this.l1d.vg8.xeu(var1);
      hzu.wn0(var5, var5, var5, 0.5F);
      hzu.spd();
      hzu.u39(770, 771, 1, 0);
      hzu.dp2();
      float var6 = 4.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -1.0F;
      float var10 = 1.0F;
      float var11 = -0.5F;
      float var12 = -this.l1d.vg8.x5k / 64.0F;
      float var13 = this.l1d.vg8.y2i / 64.0F;
      var4.ezr(7, gnl._r5);
      var4.g5o(-1.0, -1.0, -0.5).h0a((double)(4.0F + var12), (double)(4.0F + var13)).pzw();
      var4.g5o(1.0, -1.0, -0.5).h0a((double)(0.0F + var12), (double)(4.0F + var13)).pzw();
      var4.g5o(1.0, 1.0, -0.5).h0a((double)(0.0F + var12), (double)(0.0F + var13)).pzw();
      var4.g5o(-1.0, 1.0, -0.5).h0a((double)(4.0F + var12), (double)(0.0F + var13)).pzw();
      var3.q7g();
      hzu.x3w();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      hzu.ux6();
   }

   private void bix(float var1) {
      long var2 = a ^ 132554371674719L;
      jom var5 = jom.yut();
      q3g var6 = var5.zuq();
      int var10000 = t9d.b();
      hzu.wn0(1.0F, 1.0F, 1.0F, 0.9F);
      hzu.d14(519);
      hzu.jun(false);
      hzu.spd();
      hzu.u39(770, 771, 1, 0);
      float var7 = 1.0F;
      int var4 = var10000;
      int var8 = 0;

      while (true) {
         if (var8 < 2) {
            hzu.dp2();
            sla var9 = this.l1d.dd_().brw(a<"o">(31835, 682963768766892757L ^ var2));
            this.l1d.l22().anl(yu2.nu_);
            float var10 = var9.l3u();
            float var11 = var9.w2b();
            float var12 = var9.bhi();
            float var13 = var9.e8_();
            float var14 = (0.0F - var7) / 2.0F;
            float var15 = var14 + var7;
            float var16 = 0.0F - var7 / 2.0F;
            float var17 = var16 + var7;
            float var18 = -0.5F;

            try {
               hzu.a4k((float)(-(var8 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
               hzu.a2h((float)(var8 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
               var6.ezr(7, gnl._r5);
               var6.z_s(var9);
               var6.g5o((double)var14, (double)var16, (double)var18).h0a((double)var11, (double)var13).pzw();
               var6.g5o((double)var15, (double)var16, (double)var18).h0a((double)var10, (double)var13).pzw();
               var6.g5o((double)var15, (double)var17, (double)var18).h0a((double)var10, (double)var12).pzw();
               var6.g5o((double)var14, (double)var17, (double)var18).h0a((double)var11, (double)var12).pzw();
               var5.q7g();
               hzu.x3w();
               var8++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var19) {
               throw a(var19);
            }
         }

         hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
         hzu.ux6();
         hzu.jun(true);
         hzu.d14(515);
         break;
      }
   }

   public void krw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 0
      // 002: getfield mlb.n4w F
      // 005: putfield mlb.c80 F
      // 008: invokestatic t9d.c ()I
      // 00b: aload 0
      // 00c: getfield mlb.l1d Lc05;
      // 00f: getfield c05.vg8 Ll86;
      // 012: astore 2
      // 013: istore 1
      // 014: aload 2
      // 015: getfield ha9.up_ Ljnq;
      // 018: invokevirtual jnq.dxs ()Lerg;
      // 01b: astore 3
      // 01c: bipush 0
      // 01d: istore 4
      // 01f: aload 0
      // 020: getfield mlb.xc8 Lerg;
      // 023: iload 1
      // 024: ifne 106
      // 027: ifnull 0fb
      // 02a: goto 031
      // 02d: invokestatic mlb.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 3
      // 032: iload 1
      // 033: ifne 106
      // 036: goto 03d
      // 039: invokestatic mlb.a (Loov;)Loov;
      // 03c: athrow
      // 03d: ifnull 0fb
      // 040: goto 047
      // 043: invokestatic mlb.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield mlb.xc8 Lerg;
      // 04b: aload 3
      // 04c: invokevirtual erg.l1u (Lerg;)Z
      // 04f: iload 1
      // 050: ifne 071
      // 053: goto 05a
      // 056: invokestatic mlb.a (Loov;)Loov;
      // 059: athrow
      // 05a: ifne 122
      // 05d: goto 064
      // 060: invokestatic mlb.a (Loov;)Loov;
      // 063: athrow
      // 064: getstatic net/optifine/reflect/Reflector.ForgeItem_shouldCauseReequipAnimation Lnet/optifine/reflect/ReflectorMethod;
      // 067: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 06a: goto 071
      // 06d: invokestatic mlb.a (Loov;)Loov;
      // 070: athrow
      // 071: iload 1
      // 072: ifne 0f5
      // 075: ifeq 0f4
      // 078: goto 07f
      // 07b: invokestatic mlb.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield mlb.xc8 Lerg;
      // 083: invokevirtual erg.gn1 ()Lu7m;
      // 086: getstatic net/optifine/reflect/Reflector.ForgeItem_shouldCauseReequipAnimation Lnet/optifine/reflect/ReflectorMethod;
      // 089: bipush 3
      // 08a: anewarray 94
      // 08d: dup
      // 08e: bipush 0
      // 08f: aload 0
      // 090: getfield mlb.xc8 Lerg;
      // 093: aastore
      // 094: dup
      // 095: bipush 1
      // 096: aload 3
      // 097: aastore
      // 098: dup
      // 099: bipush 2
      // 09a: aload 0
      // 09b: getfield mlb.bky I
      // 09e: iload 1
      // 09f: ifne 0c2
      // 0a2: goto 0a9
      // 0a5: invokestatic mlb.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 2
      // 0aa: getfield ha9.up_ Ljnq;
      // 0ad: getfield jnq.nb5 I
      // 0b0: if_icmpeq 0c5
      // 0b3: goto 0ba
      // 0b6: invokestatic mlb.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: goto 0c2
      // 0be: invokestatic mlb.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: goto 0c6
      // 0c5: bipush 0
      // 0c6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c9: aastore
      // 0ca: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 0cd: istore 5
      // 0cf: iload 5
      // 0d1: iload 1
      // 0d2: ifne 0f5
      // 0d5: ifne 0f4
      // 0d8: goto 0df
      // 0db: invokestatic mlb.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: aload 3
      // 0e1: putfield mlb.xc8 Lerg;
      // 0e4: aload 0
      // 0e5: aload 2
      // 0e6: getfield ha9.up_ Ljnq;
      // 0e9: getfield jnq.nb5 I
      // 0ec: putfield mlb.bky I
      // 0ef: return
      // 0f0: invokestatic mlb.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: bipush 1
      // 0f5: istore 4
      // 0f7: iload 1
      // 0f8: ifeq 122
      // 0fb: aload 0
      // 0fc: getfield mlb.xc8 Lerg;
      // 0ff: goto 106
      // 102: invokestatic mlb.a (Loov;)Loov;
      // 105: athrow
      // 106: iload 1
      // 107: ifne 115
      // 10a: ifnonnull 11f
      // 10d: goto 114
      // 110: invokestatic mlb.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 3
      // 115: ifnonnull 11f
      // 118: bipush 0
      // 119: istore 4
      // 11b: iload 1
      // 11c: ifeq 122
      // 11f: bipush 1
      // 120: istore 4
      // 122: ldc 0.4
      // 124: nop
      // 125: fstore 5
      // 127: iload 4
      // 129: ifeq 134
      // 12c: fconst_0
      // 12d: goto 135
      // 130: invokestatic mlb.a (Loov;)Loov;
      // 133: athrow
      // 134: fconst_1
      // 135: fstore 6
      // 137: fload 6
      // 139: aload 0
      // 13a: getfield mlb.n4w F
      // 13d: fsub
      // 13e: fload 5
      // 140: fneg
      // 141: fload 5
      // 143: invokestatic fe6._f3 (FFF)F
      // 146: fstore 7
      // 148: aload 0
      // 149: dup
      // 14a: getfield mlb.n4w F
      // 14d: fload 7
      // 14f: fadd
      // 150: putfield mlb.n4w F
      // 153: aload 0
      // 154: getfield mlb.n4w F
      // 157: ldc 0.1
      // 159: nop
      // 15a: fcmpg
      // 15b: iload 1
      // 15c: ifne 183
      // 15f: ifge 191
      // 162: goto 169
      // 165: invokestatic mlb.a (Loov;)Loov;
      // 168: athrow
      // 169: aload 0
      // 16a: aload 3
      // 16b: putfield mlb.xc8 Lerg;
      // 16e: aload 0
      // 16f: aload 2
      // 170: getfield ha9.up_ Ljnq;
      // 173: getfield jnq.nb5 I
      // 176: putfield mlb.bky I
      // 179: invokestatic hxt.ly3 ()Z
      // 17c: goto 183
      // 17f: invokestatic mlb.a (Loov;)Loov;
      // 182: athrow
      // 183: ifeq 191
      // 186: aload 3
      // 187: invokestatic net/optifine/shaders/Shaders.setItemToRenderMain (Lerg;)V
      // 18a: goto 191
      // 18d: invokestatic mlb.a (Loov;)Loov;
      // 190: athrow
      // 191: return
   }

   public void ahu() {
      this.n4w = 0.0F;
   }

   public void hsl() {
      this.n4w = 0.0F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7227456176159581203L, 5096349786055587947L, MethodHandles.lookup().lookupClass()).a(279541198025925L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 21036155495443L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[21];
      int var5 = 0;
      String var4 = "£õÜ\u0094N\u00022Çó½,\u009d\u0012\n\"÷\u0018¯³\u0080ò\u008d£}bÈSd\u008d*¨üCe\u0012µ\u009d\\5©s\u0010\bø/\u0095ÿ\u0000\b\u007f\u0006\u0083\u0094Ç\u0080\u0083<_ Ù(\u007fWþ\f\u00882\u000f\u0085\u0093¶Pj\u0016ßfË³wÚIÍô\u0007\u001d\u001f\u009e\u0012)1\"\u0010?äÖc}G¤ÛgÂgÒÙ\u0006b9\u0010»\u0002ö\f9\u0082\u0001ùÌûý\u00041³ÆG\u0010ûm\u000e¥\u0000ï³\u0084\r¨\u0007 \u0096Iù \u0010A«GÕo»F\bÛ~Ö\u0000Ñyw\u009f8ñJÜC§4Ly§øò\u0005ë:\u0013ð:,\u0000ÚN\u0099Àó£O?«Ã3Cç\u0092kÊ\u00adç\u0011Ê%ì¨\u009bÎ·H7\u00136né¥í<¸_\u0010Yòk%¼ÕD©Q(/z³\u0087z[0À±\u001a¯±\u0003¿4ÇÞ\u0094ü\u0089Ý:¯Öì<\u0091M¼çi\u0015Ù9É}\u009c]\u0099\u0080\u008d»\u008b¢d&©-~.û[\u008c¶¯\u0018\u0000bÏ\fî\u0016Ð«Ó/_\u0013\u0093²9Ü;'Î\u000bÑ?b¶\u0010sÅ¼¡²\u0087b\u0095v\u008fª)çºåê\u0018Qø¹r(ùôcUès´%\u0090\u009bæ?ªU÷¢b9¼ ¸ ¬Ú\u007ftNÏ\u0088\u009b$b\u0010y#b[\neÝe,XøÏ%Ká¤\u0084*g \u0003\u00036\u001e\u008eqnµ Õe2ùZqâ\u0085\u0099\u001f;ê\u00070þ¤¢Jë\u001b#.¬\u0010b)Í\u009c\t\u001a«M ÖÊ=¨³\u0002R\u0010\u0012ww\u0011QÏµ\\\u0090í}3\u0097?\u00853\u0010\u0010Ý¢ÄUG¾m\u0087ê\u0086¦&\u0006Í=";
      int var6 = "£õÜ\u0094N\u00022Çó½,\u009d\u0012\n\"÷\u0018¯³\u0080ò\u008d£}bÈSd\u008d*¨üCe\u0012µ\u009d\\5©s\u0010\bø/\u0095ÿ\u0000\b\u007f\u0006\u0083\u0094Ç\u0080\u0083<_ Ù(\u007fWþ\f\u00882\u000f\u0085\u0093¶Pj\u0016ßfË³wÚIÍô\u0007\u001d\u001f\u009e\u0012)1\"\u0010?äÖc}G¤ÛgÂgÒÙ\u0006b9\u0010»\u0002ö\f9\u0082\u0001ùÌûý\u00041³ÆG\u0010ûm\u000e¥\u0000ï³\u0084\r¨\u0007 \u0096Iù \u0010A«GÕo»F\bÛ~Ö\u0000Ñyw\u009f8ñJÜC§4Ly§øò\u0005ë:\u0013ð:,\u0000ÚN\u0099Àó£O?«Ã3Cç\u0092kÊ\u00adç\u0011Ê%ì¨\u009bÎ·H7\u00136né¥í<¸_\u0010Yòk%¼ÕD©Q(/z³\u0087z[0À±\u001a¯±\u0003¿4ÇÞ\u0094ü\u0089Ý:¯Öì<\u0091M¼çi\u0015Ù9É}\u009c]\u0099\u0080\u008d»\u008b¢d&©-~.û[\u008c¶¯\u0018\u0000bÏ\fî\u0016Ð«Ó/_\u0013\u0093²9Ü;'Î\u000bÑ?b¶\u0010sÅ¼¡²\u0087b\u0095v\u008fª)çºåê\u0018Qø¹r(ùôcUès´%\u0090\u009bæ?ªU÷¢b9¼ ¸ ¬Ú\u007ftNÏ\u0088\u009b$b\u0010y#b[\neÝe,XøÏ%Ká¤\u0084*g \u0003\u00036\u001e\u008eqnµ Õe2ùZqâ\u0085\u0099\u001f;ê\u00070þ¤¢Jë\u001b#.¬\u0010b)Í\u009c\t\u001a«M ÖÊ=¨³\u0002R\u0010\u0012ww\u0011QÏµ\\\u0090í}3\u0097?\u00853\u0010\u0010Ý¢ÄUG¾m\u0087ê\u0086¦&\u0006Í="
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[21];
                     z9r = new gdz(a<"o">(29940, 8565400764638221359L ^ var9));
                     msz = new gdz(a<"o">(11810, 7011655064261332706L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "ËÞÚ\u000eú&G\u0012]D8vö\u00921\u001e¾7É«\u0010\u0096x>\u009c\u0084\u0092T\u001e(>'T\nÍ\u0000Dsc=\u008cÅ+W;of4 Ôî5\\8QO¨²\u001aß\u0098É:%Ñ\u0007XzÀEÓ$RDPkp\\Ð¼X";
                  var6 = "ËÞÚ\u000eú&G\u0012]D8vö\u00921\u001e¾7É«\u0010\u0096x>\u009c\u0084\u0092T\u001e(>'T\nÍ\u0000Dsc=\u008cÅ+W;of4 Ôî5\\8QO¨²\u001aß\u0098É:%Ñ\u0007XzÀEÓ$RDPkp\\Ð¼X"
                     .length();
                  var3 = '0';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26568;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("mlb", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("mlb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
