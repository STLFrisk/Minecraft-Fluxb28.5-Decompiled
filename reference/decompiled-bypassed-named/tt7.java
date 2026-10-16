import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tt7 extends so9 {
   public ota knw = (ota)this.m5v;

   public tt7(hr_ var1) {
      super(var1, new ota(0.0F), 0.5F);
      this.d4f(new fp0(this));
      this.d4f(new p9l());
   }

   public void j_g(fcs param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: bipush 7
      // 03: fload 4
      // 05: invokevirtual fcs.gv2 (IF)[D
      // 08: bipush 0
      // 09: daload
      // 0a: d2f
      // 0b: fstore 6
      // 0d: invokestatic OpaquePredicate.b ()I
      // 10: aload 1
      // 11: bipush 5
      // 12: fload 4
      // 14: invokevirtual fcs.gv2 (IF)[D
      // 17: bipush 1
      // 18: daload
      // 19: aload 1
      // 1a: bipush 10
      // 1c: fload 4
      // 1e: invokevirtual fcs.gv2 (IF)[D
      // 21: bipush 1
      // 22: daload
      // 23: dsub
      // 24: d2f
      // 25: fstore 7
      // 27: istore 5
      // 29: fload 6
      // 2b: fneg
      // 2c: fconst_0
      // 2d: fconst_1
      // 2e: fconst_0
      // 2f: invokestatic hzu.a2h (FFFF)V
      // 32: fload 7
      // 34: ldc 10.0
      // 36: nop
      // 37: fmul
      // 38: fconst_1
      // 39: fconst_0
      // 3a: fconst_0
      // 3b: invokestatic hzu.a2h (FFFF)V
      // 3e: fconst_0
      // 3f: fconst_0
      // 40: fconst_1
      // 41: invokestatic hzu.a4k (FFF)V
      // 44: aload 1
      // 45: getfield fcs.qur I
      // 48: iload 5
      // 4a: ifeq 62
      // 4d: ifle 9d
      // 50: goto 57
      // 53: invokestatic tt7.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 1
      // 58: getfield fcs.qur I
      // 5b: goto 62
      // 5e: invokestatic tt7.a (Loov;)Loov;
      // 61: athrow
      // 62: i2f
      // 63: fload 4
      // 65: fadd
      // 66: fconst_1
      // 67: fsub
      // 68: ldc 20.0
      // 6a: nop
      // 6b: fdiv
      // 6c: ldc 1.6
      // 6e: nop
      // 6f: fmul
      // 70: fstore 8
      // 72: fload 8
      // 74: invokestatic fe6.bug (F)F
      // 77: fstore 8
      // 79: fload 8
      // 7b: fconst_1
      // 7c: iload 5
      // 7e: ifeq 98
      // 81: fcmpl
      // 82: ifle 8f
      // 85: goto 8c
      // 88: invokestatic tt7.a (Loov;)Loov;
      // 8b: athrow
      // 8c: fconst_1
      // 8d: fstore 8
      // 8f: fload 8
      // 91: aload 0
      // 92: aload 1
      // 93: invokevirtual tt7.hz_ (Lg_3;)F
      // 96: fmul
      // 97: fconst_0
      // 98: fconst_0
      // 99: fconst_1
      // 9a: invokestatic hzu.a2h (FFFF)V
      // 9d: return
   }

   public void bqt(fcs param1, float param2, float param3, float param4, float param5, float param6, float param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 8
      // 05: aload 1
      // 06: getfield fcs.jkn I
      // 09: iload 8
      // 0b: ifeq 78
      // 0e: ifle 5c
      // 11: goto 18
      // 14: invokestatic tt7.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: getfield fcs.jkn I
      // 1c: i2f
      // 1d: ldc 200.0
      // 1f: nop
      // 20: fdiv
      // 21: fstore 9
      // 23: sipush 515
      // 26: invokestatic hzu.d14 (I)V
      // 29: invokestatic hzu.if9 ()V
      // 2c: sipush 516
      // 2f: fload 9
      // 31: invokestatic hzu.fak (IF)V
      // 34: aload 0
      // 35: getstatic tt7.apw Lgdz;
      // 38: invokevirtual tt7.gu4 (Lgdz;)V
      // 3b: aload 0
      // 3c: getfield tt7.m5v Lg6r;
      // 3f: aload 1
      // 40: fload 2
      // 41: fload 3
      // 42: fload 4
      // 44: fload 5
      // 46: fload 6
      // 48: fload 7
      // 4a: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 4d: sipush 516
      // 50: ldc 0.1
      // 52: nop
      // 53: invokestatic hzu.fak (IF)V
      // 56: sipush 514
      // 59: invokestatic hzu.d14 (I)V
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokevirtual tt7.sat (Li2h;)Z
      // 61: pop
      // 62: aload 0
      // 63: getfield tt7.m5v Lg6r;
      // 66: aload 1
      // 67: fload 2
      // 68: fload 3
      // 69: fload 4
      // 6b: fload 5
      // 6d: fload 6
      // 6f: fload 7
      // 71: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 74: aload 1
      // 75: getfield fcs.gx0 I
      // 78: iload 8
      // 7a: ifeq c7
      // 7d: ifle ca
      // 80: goto 87
      // 83: invokestatic tt7.a (Loov;)Loov;
      // 86: athrow
      // 87: sipush 514
      // 8a: invokestatic hzu.d14 (I)V
      // 8d: invokestatic hzu.m_1 ()V
      // 90: invokestatic hzu.spd ()V
      // 93: sipush 770
      // 96: sipush 771
      // 99: invokestatic hzu.ru7 (II)V
      // 9c: fconst_1
      // 9d: fconst_0
      // 9e: fconst_0
      // 9f: ldc 0.5
      // a1: nop
      // a2: invokestatic hzu.wn0 (FFFF)V
      // a5: aload 0
      // a6: getfield tt7.m5v Lg6r;
      // a9: aload 1
      // aa: fload 2
      // ab: fload 3
      // ac: fload 4
      // ae: fload 5
      // b0: fload 6
      // b2: fload 7
      // b4: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // b7: invokestatic hzu.rqj ()V
      // ba: invokestatic hzu.ux6 ()V
      // bd: sipush 515
      // c0: goto c7
      // c3: invokestatic tt7.a (Loov;)Loov;
      // c6: athrow
      // c7: invokestatic hzu.d14 (I)V
      // ca: return
   }

   public void b7n(fcs param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 10
      // 05: aload 1
      // 06: bipush 0
      // 07: invokestatic pq9.ojo (Lt6u;Z)V
      // 0a: aload 0
      // 0b: aload 1
      // 0c: dload 2
      // 0d: dload 4
      // 0f: dload 6
      // 11: fload 8
      // 13: iload 10
      // 15: ifne 3b
      // 18: fload 9
      // 1a: invokespecial so9.w_x (Lyqv;DDDFF)V
      // 1d: aload 1
      // 1e: getfield fcs.xs_ Ledl;
      // 21: ifnull 3e
      // 24: goto 2b
      // 27: invokestatic tt7.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: aload 1
      // 2d: dload 2
      // 2e: dload 4
      // 30: dload 6
      // 32: fload 9
      // 34: goto 3b
      // 37: invokestatic tt7.a (Loov;)Loov;
      // 3a: athrow
      // 3b: invokevirtual tt7.br3 (Lfcs;DDDF)V
      // 3e: return
   }

   public void br3(fcs var1, double var2, double var4, double var6, float var8) {
      float var10 = (float)var1.xs_.cjr + var8;
      float var11 = fe6.rtn(var10 * 0.2F) / 2.0F + 0.5F;
      var11 = (var11 * var11 + var11) * 0.2F;
      float var12 = (float)(var1.xs_.o2v - var1.o2v - (var1.bc1 - var1.o2v) * (double)(1.0F - var8));
      float var13 = (float)((double)var11 + var1.xs_.kfp - 1.0 - var1.kfp - (var1.o_z - var1.kfp) * (double)(1.0F - var8));
      float var14 = (float)(var1.xs_.vbd - var1.vbd - (var1.a4d - var1.vbd) * (double)(1.0F - var8));
      float var15 = fe6.bug(var12 * var12 + var14 * var14);
      float var16 = fe6.bug(var12 * var12 + var13 * var13 + var14 * var14);
      hzu.dp2();
      hzu.a4k((float)var2, (float)var4 + 2.0F, (float)var6);
      int var10000 = OpaquePredicate.c();
      hzu.a2h((float)(-Math.atan2((double)var14, (double)var12)) * 180.0F / (float) Math.PI - 90.0F, 0.0F, 1.0F, 0.0F);
      int var9 = var10000;
      hzu.a2h((float)(-Math.atan2((double)var15, (double)var13)) * 180.0F / (float) Math.PI - 90.0F, 1.0F, 0.0F, 0.0F);
      jom var17 = jom.yut();
      q3g var18 = var17.zuq();
      qpm.cng();
      hzu.o1b();
      this.gu4(_wo);
      hzu.nn9(7425);
      float var19 = 0.0F - ((float)var1.g25 + var8) * 0.01F;
      float var20 = fe6.bug(var12 * var12 + var13 * var13 + var14 * var14) / 32.0F - ((float)var1.g25 + var8) * 0.01F;
      var18.ezr(5, gnl.rad);
      byte var21 = 8;
      int var22 = 0;

      while (true) {
         if (var22 <= 8) {
            float var23 = fe6.rtn((float)(var22 % 8) * (float) Math.PI * 2.0F / 8.0F) * 0.75F;
            float var24 = fe6.ssk((float)(var22 % 8) * (float) Math.PI * 2.0F / 8.0F) * 0.75F;
            float var25 = (float)(var22 % 8) * 1.0F / 8.0F;

            try {
               var18.g5o((double)(var23 * 0.2F), (double)(var24 * 0.2F), 0.0).h0a((double)var25, (double)var20).fje(0, 0, 0, 255).pzw();
               var18.g5o((double)var23, (double)var24, (double)var16).h0a((double)var25, (double)var19).fje(255, 255, 255, 255).pzw();
               var22++;
               if (var9 != 0) {
                  break;
               }

               if (var9 == 0) {
                  continue;
               }
            } catch (oov var26) {
               throw a(var26);
            }
         }

         var17.q7g();
         hzu.gp4();
         hzu.nn9(7424);
         qpm.ne_();
         hzu.x3w();
         break;
      }
   }

   public gdz aw6(fcs var1) {
      return vpj;
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.b7n((fcs)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public void ur9(Entity var1, float var2, float var3, float var4) {
      this.j_g((fcs)var1, var2, var3, var4);
   }

   @Override
   public void o7f(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.bqt((fcs)var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void l1o(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.b7n((fcs)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.aw6((fcs)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.b7n((fcs)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5603116413277522394L, 2290282424970730243L, MethodHandles.lookup().lookupClass()).a(138043431273145L);
      // $VF: monitorexit
      long var10 = var10000 ^ 50420250102456L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "\u0087÷ìSzÿëë\u000f_Þ´å\n â±¿\u00026Æd×û\"\u0019h\u0098é=äÿkÀÑ\u0001V°ú¼8\u0087÷ìSzÿëë\u000f_Þ´å\n â±¿\u00026Æd×û\"\u0019h\u0098é=äÿ¬q5zbê¡ç·ÉMn·\ttf\u008ceÐ\u0015\u0017\u000fÓ\u008c8\u0087÷ìSzÿëë\u000f_Þ´å\n â\u0006EèÈôÀ\u0082å¥\u009a\u0011ü\u009fN\u0083gAïèWÐä/Aã\u009d\u001d\u001d7>§EõÞ\u00138éI-\u0098";
      int var7 = "\u0087÷ìSzÿëë\u000f_Þ´å\n â±¿\u00026Æd×û\"\u0019h\u0098é=äÿkÀÑ\u0001V°ú¼8\u0087÷ìSzÿëë\u000f_Þ´å\n â±¿\u00026Æd×û\"\u0019h\u0098é=äÿ¬q5zbê¡ç·ÉMn·\ttf\u008ceÐ\u0015\u0017\u000fÓ\u008c8\u0087÷ìSzÿëë\u000f_Þ´å\n â\u0006EèÈôÀ\u0082å¥\u009a\u0011ü\u009fN\u0083gAïèWÐä/Aã\u009d\u001d\u001d7>§EõÞ\u00138éI-\u0098"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = c(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            _wo = new gdz(var8[2]);
            apw = new gdz(var8[1]);
            vpj = new gdz(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
      }
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
