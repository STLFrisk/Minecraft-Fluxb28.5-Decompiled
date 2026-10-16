import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class hhf {
   public static void hxa(float var0, float var1, float var2, float var3, int var4) {
      cuu(var0 - 0.5F, var1 + 0.5F, var0, var3 - 0.5F, var4);
      cuu(var2, var1 + 0.5F, var2 + 0.5F, var3 - 0.5F, var4);
      cuu(var0 + 0.5F, var1 - 0.5F, var2 - 0.5F, var1, var4);
      cuu(var0 + 0.5F, var3, var2 - 0.5F, var3 + 0.5F, var4);
      cuu(var0, var1, var2, var3, var4);
   }

   public static void pee(float var0, float var1, float var2, float var3, float var4, int var5) {
      cuu(var0 - var4, var1, var0, var3, var5);
      cuu(var2, var1, var2 + var4, var3, var5);
      cuu(var0, var1 + var4, var2, var1, var5);
      cuu(var0, var3, var2, var3 + var4, var5);
   }

   public static void oll(gdz var0, int var1, int var2, float var3, float var4, float var5) {
      new eka(c05.vz1());
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glDepthMask(false);
      gis.y03(770, 771, 1, 0);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var5);
      c05.vz1().l22().anl(var0);
      b0t.vfo(var1, var2, 0.0F, 0.0F, (int)var3, (int)var4, var3, var4);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
   }

   public static void e_y(gdz var0, float var1, float var2, float var3, float var4) {
      new eka(c05.vz1());
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glDepthMask(false);
      gis.y03(770, 771, 1, 0);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      c05.vz1().l22().anl(var0);
      b0t.byz(var1, var2, 0.0F, 0.0F, var3, var4, var3, var4);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
   }

   public static int kjo(int var0, float var1) {
      Color var2 = new Color(var0);
      float var3 = 0.003921569F * (float)var2.getRed();
      float var4 = 0.003921569F * (float)var2.getGreen();
      float var5 = 0.003921569F * (float)var2.getBlue();
      return new Color(var3, var4, var5, var1).getRGB();
   }

   public static boolean md3(float param0, float param1, float param2, float param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: fload 0
      // 06: fload 2
      // 07: fcmpl
      // 08: iload 6
      // 0a: ifeq 22
      // 0d: ifle 68
      // 10: goto 17
      // 13: invokestatic hhf.a (Loov;)Loov;
      // 16: athrow
      // 17: fload 0
      // 18: fload 4
      // 1a: fcmpg
      // 1b: goto 22
      // 1e: invokestatic hhf.a (Loov;)Loov;
      // 21: athrow
      // 22: iload 6
      // 24: ifeq 3b
      // 27: ifge 68
      // 2a: goto 31
      // 2d: invokestatic hhf.a (Loov;)Loov;
      // 30: athrow
      // 31: fload 1
      // 32: fload 3
      // 33: fcmpl
      // 34: goto 3b
      // 37: invokestatic hhf.a (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 6
      // 3d: ifeq 55
      // 40: ifle 68
      // 43: goto 4a
      // 46: invokestatic hhf.a (Loov;)Loov;
      // 49: athrow
      // 4a: fload 1
      // 4b: fload 5
      // 4d: fcmpg
      // 4e: goto 55
      // 51: invokestatic hhf.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 6
      // 57: ifeq 65
      // 5a: ifge 68
      // 5d: goto 64
      // 60: invokestatic hhf.a (Loov;)Loov;
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   public static void wt9(float var0, float var1, float var2, float var3, int var4, int var5) {
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glDepthMask(true);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glHint(3155, 4354);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      float var6;
      float var7;
      float var9;
      zck(var6 = var0 * 2.0F, (var7 = var1 * 2.0F) + 1.0F, (var9 = var3 * 2.0F) - 2.0F, var4);
      float var8;
      zck((var8 = var2 * 2.0F) - 1.0F, var7 + 1.0F, var9 - 2.0F, var4);
      qis(var6 + 2.0F, var8 - 3.0F, var7, var4);
      qis(var6 + 2.0F, var8 - 3.0F, var9 - 1.0F, var4);
      qis(var6 + 1.0F, var6 + 1.0F, var7 + 1.0F, var4);
      qis(var8 - 2.0F, var8 - 2.0F, var7 + 1.0F, var4);
      qis(var8 - 2.0F, var8 - 2.0F, var9 - 2.0F, var4);
      qis(var6 + 1.0F, var6 + 1.0F, var9 - 2.0F, var4);
      cuu(var6 + 1.0F, var7 + 1.0F, var8 - 1.0F, var9 - 1.0F, var5);
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glHint(3154, 4352);
      GL11.glHint(3155, 4352);
   }

   public static void qis(float var0, float var1, float var2, int var3) {
      int var4 = t9d.c();

      float var10000;
      float var10001;
      label21: {
         label20: {
            try {
               var10000 = var1;
               var10001 = var0;
               if (var4 != 0) {
                  break label21;
               }

               if (!(var1 < var0)) {
                  break label20;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            float var5 = var0;
            var0 = var1;
            var1 = var5;
         }

         var10000 = var0;
         var10001 = var2;
      }

      cuu(var10000, var10001, var1 + 1.0F, var2 + 1.0F, var3);
   }

   public static void zck(float var0, float var1, float var2, int var3) {
      int var4 = t9d.b();

      float var10000;
      float var10001;
      label21: {
         label20: {
            try {
               var10000 = var2;
               var10001 = var1;
               if (var4 == 0) {
                  break label21;
               }

               if (!(var2 < var1)) {
                  break label20;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            float var5 = var1;
            var1 = var2;
            var2 = var5;
         }

         var10000 = var0;
         var10001 = var1 + 1.0F;
      }

      cuu(var10000, var10001, var0 + 1.0F, var2, var3);
   }

   public static void cuu(float var0, float var1, float var2, float var3, int var4) {
      int var5 = t9d.c();

      int var10000;
      label37: {
         label36: {
            try {
               float var15;
               var10000 = (var15 = var0 - var2) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
               if (var5 != 0) {
                  break label37;
               }

               if (var10000 >= 0) {
                  break label36;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            float var6 = var0;
            var0 = var2;
            var2 = var6;
         }

         float var16;
         var10000 = (var16 = var1 - var3) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
      }

      label28: {
         label27: {
            try {
               if (var5 != 0) {
                  break label28;
               }

               if (var10000 >= 0) {
                  break label27;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            float var14 = var1;
            var1 = var3;
            var3 = var14;
         }

         var10000 = var4 >> 24 & 0xFF;
      }

      float var7 = (float)var10000 / 255.0F;
      float var8 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var4 & 0xFF) / 255.0F;
      q3g var11 = jom.yut().zuq();
      hzu.spd();
      hzu.m_1();
      hzu.u39(770, 771, 1, 0);
      hzu.wn0(var8, var9, var10, var7);
      var11.ezr(7, gnl.gx3);
      var11.g5o((double)var0, (double)var3, 0.0).pzw();
      var11.g5o((double)var2, (double)var3, 0.0).pzw();
      var11.g5o((double)var2, (double)var1, 0.0).pzw();
      var11.g5o((double)var0, (double)var1, 0.0).pzw();
      jom.yut().q7g();
      hzu.rqj();
      hzu.ux6();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void fte(int var0, float var1, int var2, float var3, float var4, int var5) {
      byte var7 = 18;
      float var8 = 5.0F;
      GL11.glDisable(2884);
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      gis.y03(770, 771, 1, 0);
      rs_(var5);
      GL11.glBegin(5);
      GL11.glVertex2f((float)var0 + var4, var1);
      GL11.glVertex2f((float)var0 + var4, var3);
      GL11.glVertex2f((float)var2 - var4, var1);
      GL11.glVertex2f((float)var2 - var4, var3);
      GL11.glEnd();
      GL11.glBegin(5);
      int var10000 = t9d.c();
      GL11.glVertex2f((float)var0, var1 + var4);
      GL11.glVertex2f((float)var0 + var4, var1 + var4);
      GL11.glVertex2f((float)var0, var3 - var4);
      GL11.glVertex2f((float)var0 + var4, var3 - var4);
      GL11.glEnd();
      GL11.glBegin(5);
      GL11.glVertex2f((float)var2, var1 + var4);
      GL11.glVertex2f((float)var2 - var4, var1 + var4);
      GL11.glVertex2f((float)var2, var3 - var4);
      GL11.glVertex2f((float)var2 - var4, var3 - var4);
      GL11.glEnd();
      GL11.glBegin(6);
      float var9 = (float)var2 - var4;
      float var10 = var1 + var4;
      GL11.glVertex2f(var9, var10);
      int var11 = 0;
      int var6 = var10000;
      var11 = 0;

      while (true) {
         if (var11 <= 18) {
            float var12 = (float)var11 * 5.0F;

            try {
               GL11.glVertex2f(
                  (float)((double)var9 + (double)var4 * Math.cos(Math.toRadians((double)var12))),
                  (float)((double)var10 - (double)var4 * Math.sin(Math.toRadians((double)var12)))
               );
               var11++;
               if (var6 != 0) {
                  break;
               }

               if (var6 == 0) {
                  continue;
               }
            } catch (oov var16) {
               throw a(var16);
            }
         }

         GL11.glEnd();
         GL11.glBegin(6);
         var9 = (float)var0 + var4;
         var10 = var1 + var4;
         GL11.glVertex2f(var9, var10);
         break;
      }

      var11 = 0;

      while (true) {
         if (var11 <= 18) {
            float var21 = (float)var11 * 5.0F;

            try {
               GL11.glVertex2f(
                  (float)((double)var9 - (double)var4 * Math.cos(Math.toRadians((double)var21))),
                  (float)((double)var10 - (double)var4 * Math.sin(Math.toRadians((double)var21)))
               );
               var11++;
               if (var6 != 0) {
                  break;
               }

               if (var6 == 0) {
                  continue;
               }
            } catch (oov var15) {
               throw a(var15);
            }
         }

         GL11.glEnd();
         GL11.glBegin(6);
         var9 = (float)var0 + var4;
         var10 = var3 - var4;
         GL11.glVertex2f(var9, var10);
         break;
      }

      var11 = 0;

      while (true) {
         if (var11 <= 18) {
            float var22 = (float)var11 * 5.0F;

            try {
               GL11.glVertex2f(
                  (float)((double)var9 - (double)var4 * Math.cos(Math.toRadians((double)var22))),
                  (float)((double)var10 + (double)var4 * Math.sin(Math.toRadians((double)var22)))
               );
               var11++;
               if (var6 != 0) {
                  break;
               }

               if (var6 == 0) {
                  continue;
               }
            } catch (oov var14) {
               throw a(var14);
            }
         }

         GL11.glEnd();
         GL11.glBegin(6);
         var9 = (float)var2 - var4;
         var10 = var3 - var4;
         GL11.glVertex2f(var9, var10);
         break;
      }

      var11 = 0;

      while (true) {
         if (var11 <= 18) {
            float var23 = (float)var11 * 5.0F;

            try {
               GL11.glVertex2f(
                  (float)((double)var9 + (double)var4 * Math.cos(Math.toRadians((double)var23))),
                  (float)((double)var10 + (double)var4 * Math.sin(Math.toRadians((double)var23)))
               );
               var11++;
               if (var6 != 0) {
                  break;
               }

               if (var6 == 0) {
                  continue;
               }
            } catch (oov var13) {
               throw a(var13);
            }
         }

         GL11.glEnd();
         GL11.glEnable(3553);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         hzu.rqj();
         hzu.ux6();
         break;
      }
   }

   public static int ocl() {
      return new eka(c05.vz1()).x05();
   }

   public static int tgg() {
      return new eka(c05.vz1()).lrx();
   }

   public static void htg(float var0, float var1, float var2, float var3, float var4, int var5) {
      var0 = (float)((double)var0 + (double)(var4 / 2.0F) + 0.5);
      var1 = (float)((double)var1 + (double)(var4 / 2.0F) + 0.5);
      var2 = (float)((double)var2 - ((double)(var4 / 2.0F) + 0.5));
      var3 = (float)((double)var3 - ((double)(var4 / 2.0F) + 0.5));
      cuu(var0, var1, var2, var3, var5);
      fdt(var2 - var4 / 2.0F, var1 + var4 / 2.0F, var4, var5);
      fdt(var0 + var4 / 2.0F, var3 - var4 / 2.0F, var4, var5);
      fdt(var0 + var4 / 2.0F, var1 + var4 / 2.0F, var4, var5);
      fdt(var2 - var4 / 2.0F, var3 - var4 / 2.0F, var4, var5);
      cuu(var0 - var4 / 2.0F - 0.5F, var1 + var4 / 2.0F, var2, var3 - var4 / 2.0F, var5);
      cuu(var0, var1 + var4 / 2.0F, var2 + var4 / 2.0F + 0.5F, var3 - var4 / 2.0F, var5);
      cuu(var0 + var4 / 2.0F, var1 - var4 / 2.0F - 0.5F, var2 - var4 / 2.0F, var3 - var4 / 2.0F, var5);
      cuu(var0 + var4 / 2.0F, var1, var2 - var4 / 2.0F, var3 + var4 / 2.0F + 0.5F, var5);
   }

   public static void fdt(float var0, float var1, float var2, int var3) {
      em2(var0, var1, 0.0F, 360.0F, var2, var3);
   }

   public static void em2(float var0, float var1, float var2, float var3, float var4, int var5) {
      g3p(var0, var1, var2, var3, var4, var4, var5);
   }

   public static void rs_(int var0) {
      float var1 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      float var2 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var3 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var4 = (float)(var0 & 0xFF) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
   }

   public static void g3p(float var0, float var1, float var2, float var3, float var4, float var5, int var6) {
      hzu.oxa(0.0F, 0.0F, 0.0F);
      int var10000 = t9d.b();
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      int var7 = var10000;
      float var11 = 0.0F;

      label81: {
         label80: {
            try {
               float var28;
               var10000 = (var28 = var2 - var3) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
               if (var7 == 0) {
                  break label81;
               }

               if (var10000 <= 0) {
                  break label80;
               }
            } catch (oov var21) {
               throw a(var21);
            }

            var11 = var3;
            var3 = var2;
            var2 = var11;
         }

         var10000 = var6 >> 24 & 0xFF;
      }

      float var12 = (float)var10000 / 255.0F;
      float var13 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var14 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var15 = (float)(var6 & 0xFF) / 255.0F;
      jom var16 = jom.yut();
      q3g var17 = var16.zuq();

      label71: {
         label85: {
            try {
               hzu.spd();
               hzu.m_1();
               hzu.u39(770, 771, 1, 0);
               hzu.wn0(var13, var14, var15, var12);
               float var29;
               var10000 = (var29 = var12 - 0.5F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
               if (var7 == 0) {
                  break label71;
               }

               if (var10000 <= 0) {
                  break label85;
               }
            } catch (oov var20) {
               throw a(var20);
            }

            GL11.glEnable(2848);
            GL11.glLineWidth(2.0F);
            GL11.glBegin(3);
            float var10 = var3;

            label63: {
               while (var10 >= var2) {
                  float var9 = (float)Math.cos((double)var10 * Math.PI / 180.0) * var4 * 1.001F;
                  float var8 = (float)Math.sin((double)var10 * Math.PI / 180.0) * var5 * 1.001F;
                  GL11.glVertex2f(var0 + var9, var1 + var8);
                  var10 -= 4.0F;

                  try {
                     if (var7 == 0) {
                        break label63;
                     }

                     if (var7 == 0) {
                        break;
                     }
                  } catch (oov var19) {
                     throw a(var19);
                  }
               }

               GL11.glEnd();
            }

            GL11.glDisable(2848);
         }

         var10000 = 6;
      }

      GL11.glBegin(var10000);
      float var24 = var3;

      while (true) {
         if (var24 >= var2) {
            float var23 = (float)Math.cos((double)var24 * Math.PI / 180.0) * var4;
            float var22 = (float)Math.sin((double)var24 * Math.PI / 180.0) * var5;
            GL11.glVertex2f(var0 + var23, var1 + var22);
            var24 -= 4.0F;

            try {
               if (var7 == 0) {
                  break;
               }

               if (var7 != 0) {
                  continue;
               }
            } catch (oov var18) {
               throw a(var18);
            }
         }

         GL11.glEnd();
         hzu.rqj();
         hzu.ux6();
         break;
      }
   }

   public static void kvl(float var0, float var1, int var2, int var3, float var4, int var5) {
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glEnable(2881);
      int var10000 = t9d.b();
      GL11.glBlendFunc(770, 771);
      rs_(var5);
      int var6 = var10000;
      GL11.glBegin(9);
      int var7 = var2;

      while (true) {
         if (var7 <= var3) {
            double var8 = Math.sin((double)var7 * Math.PI / 180.0) * (double)var4;
            double var10 = Math.cos((double)var7 * Math.PI / 180.0) * (double)var4;

            try {
               GL11.glVertex3d((double)var0 + var8, (double)var1 + var10, 0.0);
               var7++;
               if (var6 == 0) {
                  break;
               }

               if (var6 != 0) {
                  continue;
               }
            } catch (oov var12) {
               throw a(var12);
            }
         }

         GL11.glEnd();
         GL11.glDisable(2881);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         break;
      }
   }

   public static void iqd(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
      cuu(var0, var1, var2, var3, var4);
      cuu(var0 + 0.5F, var1 + 0.5F, var2 - 0.5F, var3 - 0.5F, var5);
      cuu(var0 + 1.0F, var1 + 1.0F, var2 - 1.0F, var3 - 1.0F, var6);
   }

   public static void cuj(nh4 var0) {
      jom var1 = jom.yut();
      q3g var2 = var1.zuq();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(3, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(1, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var1.q7g();
   }

   public static void m5o(nh4 var0) {
      jom var1 = jom.yut();
      q3g var2 = var1.zuq();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var1.q7g();
      var2.ezr(7, gnl.gx3);
      var2.g5o(var0.rlc, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.oqj).pzw();
      var2.g5o(var0.rlc, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.rlc, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.t8n).pzw();
      var2.g5o(var0.t_2, var0.i2c, var0.oqj).pzw();
      var2.g5o(var0.t_2, var0.bx_, var0.oqj).pzw();
      var1.q7g();
   }

   public static void cwu(double var0, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      GL11.glColor4f(var10, var11, var12, 1.0F);
      cuj(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glColor4f(var10, var11, var12, var13);
      m5o(new nh4(var0 - var6, var2, var4 - var6, var0 + var6, var2 + var8, var4 + var6));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void m4t(double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      GL11.glColor4f(var12, var13, var14, 1.0F);
      cuj(new nh4(var0, var2, var4, var6, var8, var10));
      GL11.glColor4f(var12, var13, var14, var15);
      m5o(new nh4(var0, var2, var4, var6, var8, var10));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void uxa(nh4 var0, float var1, float var2, float var3, float var4) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(1.0F);
      GL11.glColor4f(var1, var2, var3, 1.0F);
      cuj(var0);
      GL11.glColor4f(var1, var2, var3, var4);
      m5o(var0);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void xbo(float param0, float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic c05.vz1 ()Lc05;
      // 03: astore 5
      // 05: invokestatic t9d.c ()I
      // 08: bipush 1
      // 09: istore 6
      // 0b: istore 4
      // 0d: aload 5
      // 0f: getfield c05.oxn Lmoh;
      // 12: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 15: pop
      // 16: bipush 2
      // 17: istore 7
      // 19: iload 7
      // 1b: iload 4
      // 1d: ifne 31
      // 20: ifne 2f
      // 23: goto 2a
      // 26: invokestatic hhf.a (Loov;)Loov;
      // 29: athrow
      // 2a: sipush 1000
      // 2d: istore 7
      // 2f: iload 6
      // 31: iload 7
      // 33: if_icmpge 97
      // 36: aload 5
      // 38: getfield c05.pfr I
      // 3b: iload 6
      // 3d: bipush 1
      // 3e: iadd
      // 3f: idiv
      // 40: sipush 320
      // 43: iload 4
      // 45: ifne ac
      // 48: goto 4f
      // 4b: invokestatic hhf.a (Loov;)Loov;
      // 4e: athrow
      // 4f: iload 4
      // 51: ifne ac
      // 54: goto 5b
      // 57: invokestatic hhf.a (Loov;)Loov;
      // 5a: athrow
      // 5b: if_icmplt 97
      // 5e: goto 65
      // 61: invokestatic hhf.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 5
      // 67: getfield c05.ry7 I
      // 6a: iload 6
      // 6c: bipush 1
      // 6d: iadd
      // 6e: idiv
      // 6f: sipush 240
      // 72: iload 4
      // 74: ifne ac
      // 77: goto 7e
      // 7a: invokestatic hhf.a (Loov;)Loov;
      // 7d: athrow
      // 7e: if_icmplt 97
      // 81: goto 88
      // 84: invokestatic hhf.a (Loov;)Loov;
      // 87: athrow
      // 88: iinc 6 1
      // 8b: iload 4
      // 8d: ifeq 2f
      // 90: goto 97
      // 93: invokestatic hhf.a (Loov;)Loov;
      // 96: athrow
      // 97: fload 0
      // 98: iload 6
      // 9a: i2f
      // 9b: fmul
      // 9c: f2i
      // 9d: aload 5
      // 9f: getfield c05.ry7 I
      // a2: i2f
      // a3: fload 1
      // a4: fload 3
      // a5: fadd
      // a6: iload 6
      // a8: i2f
      // a9: fmul
      // aa: fsub
      // ab: f2i
      // ac: fload 2
      // ad: iload 6
      // af: i2f
      // b0: fmul
      // b1: f2i
      // b2: fload 3
      // b3: iload 6
      // b5: i2f
      // b6: fmul
      // b7: f2i
      // b8: invokestatic org/lwjgl/opengl/GL11.glScissor (IIII)V
      // bb: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
