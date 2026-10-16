import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import org.lwjgl.opengl.GL11;

public class h16 {
   public int jld = 1024;
   public int zid = 1024;
   private int sba;
   private h16$bzx[] m4l = new h16$bzx[2048];
   private final Font qcy;
   private boolean xz9;
   private int t42 = -1;
   private int j_2 = 8;

   public h16(Font var1, boolean var2, int var3, boolean var4, int var5) {
      this.qcy = var1;
      this.xz9 = var2;
      this.j_2 = var3;
      if (var3 == 0) {
         this.j_2 = 8;
      }

      this.cr8(var2, var4, var5);
   }

   public h16(Font var1, boolean var2, boolean var3, int var4) {
      this.qcy = var1;
      this.xz9 = var2;
      this.j_2 = 6;
      this.cr8(var2, var3, var4);
   }

   private void cr8(boolean var1, boolean var2, int var3) {
      try {
         if (this.qcy.getSize() <= 15) {
            this.jld = 256;
            this.zid = 256;
         }
      } catch (NullPointerException var15) {
         throw a(var15);
      }

      label76: {
         try {
            if (this.qcy.getSize() <= 43) {
               this.jld = 512;
               this.zid = 512;
               break label76;
            }
         } catch (NullPointerException var18) {
            throw a(var18);
         }

         try {
            if (this.qcy.getSize() <= 91) {
               this.jld = 1024;
               this.zid = 1024;
               break label76;
            }
         } catch (NullPointerException var17) {
            throw a(var17);
         }

         this.jld = 2048;
         this.zid = 2048;
      }

      try {
         if (var2) {
            this.m4l = new h16$bzx[65535];
            this.jld = 8192;
            this.zid = 8192;
         }
      } catch (NullPointerException var16) {
         throw a(var16);
      }

      BufferedImage var4 = new BufferedImage(this.jld, this.zid, 2);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      var5.setFont(this.qcy);
      var5.setColor(new Color(255, 255, 255, 0));
      var5.fillRect(0, 0, this.jld, this.zid);
      var5.setColor(Color.white);
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 0; var9 < this.m4l.length; var9++) {
         char var10 = (char)var9;
         BufferedImage var11 = this._fa(var10, var1, var3);
         h16$bzx var12 = new h16$bzx(this, null);
         var12.ue7 = var11.getWidth();
         var12._50 = var11.getHeight();
         if (var7 + var12.ue7 >= this.jld) {
            var7 = 0;
            var8 += var6;
            var6 = 0;
         }

         try {
            var12.kn5 = var7;
            var12.t75 = var8;
            if (var12._50 > this.t42) {
               this.t42 = var12._50;
            }
         } catch (NullPointerException var14) {
            throw a(var14);
         }

         if (var12._50 > var6) {
            var6 = var12._50;
         }

         this.m4l[var9] = var12;
         var5.drawImage(var11, var7, var8, null);
         var7 += var12.ue7;
      }

      try {
         this.sba = p9t.fyc(p9t.gi2(), var4, false, false);
      } catch (NullPointerException var13) {
         var13.printStackTrace();
      }
   }

   private BufferedImage _fa(char var1, boolean var2, int var3) {
      BufferedImage var4 = new BufferedImage(1, 1, 2);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();

      label39: {
         try {
            if (var2) {
               var5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
               break label39;
            }
         } catch (NullPointerException var14) {
            throw a(var14);
         }

         var5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      }

      var5.setFont(this.qcy);
      FontMetrics var6 = var5.getFontMetrics();
      int var7 = var6.charWidth(var1) + 7;
      if (var7 <= 0) {
         var7 = 7;
      }

      int var8 = var6.getHeight() + 1 + var3;
      if (var8 <= 0) {
         var8 = this.qcy.getSize();
      }

      BufferedImage var9 = new BufferedImage(var7, var8, 2);
      Graphics2D var10 = (Graphics2D)var9.getGraphics();

      label28: {
         try {
            if (var2) {
               var10.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
               break label28;
            }
         } catch (NullPointerException var13) {
            throw a(var13);
         }

         var10.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      }

      var10.setFont(this.qcy);
      var10.setColor(Color.WHITE);
      byte var11 = 3;
      boolean var12 = true;
      var10.drawString(String.valueOf(var1), 3, 1 + var6.getAscent());
      return var9;
   }

   public void qun(char var1, float var2, float var3) {
      try {
         this.tr6(
            var2,
            var3,
            (float)this.m4l[var1].ue7,
            (float)this.m4l[var1]._50,
            (float)this.m4l[var1].kn5,
            (float)this.m4l[var1].t75,
            (float)this.m4l[var1].ue7,
            (float)this.m4l[var1]._50
         );
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   private void tr6(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var5 / (float)this.jld;
      float var10 = var6 / (float)this.zid;
      float var11 = var7 / (float)this.jld;
      float var12 = var8 / (float)this.zid;
      GL11.glBegin(4);
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(var1 + var3), (double)var2);
      GL11.glTexCoord2f(var9, var10);
      GL11.glVertex2d((double)var1, (double)var2);
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)var1, (double)(var2 + var4));
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)var1, (double)(var2 + var4));
      GL11.glTexCoord2f(var9 + var11, var10 + var12);
      GL11.glVertex2d((double)(var1 + var3), (double)(var2 + var4));
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(var1 + var3), (double)var2);
      GL11.glEnd();
   }

   public void zyr(String param1, double param2, double param4, Color param6, boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 2
      // 01: ldc2_w 3.0
      // 04: dsub
      // 05: dstore 2
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: dload 4
      // 0b: dconst_1
      // 0c: dsub
      // 0d: dstore 4
      // 0f: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 12: aload 0
      // 13: getfield h16.sba I
      // 16: invokestatic hzu.t30 (I)V
      // 19: istore 8
      // 1b: aload 0
      // 1c: iload 7
      // 1e: ifeq 42
      // 21: new java/awt/Color
      // 24: dup
      // 25: ldc 0.05
      // 27: nop
      // 28: ldc 0.05
      // 2a: nop
      // 2b: ldc 0.05
      // 2d: nop
      // 2e: aload 6
      // 30: invokevirtual java/awt/Color.getAlpha ()I
      // 33: i2f
      // 34: ldc 255.0
      // 36: nop
      // 37: fdiv
      // 38: invokespecial java/awt/Color.<init> (FFFF)V
      // 3b: goto 44
      // 3e: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 41: athrow
      // 42: aload 6
      // 44: invokevirtual h16.rh0 (Ljava/awt/Color;)V
      // 47: aload 1
      // 48: invokevirtual java/lang/String.length ()I
      // 4b: istore 9
      // 4d: bipush 0
      // 4e: istore 10
      // 50: iload 10
      // 52: iload 9
      // 54: if_icmpge b3
      // 57: aload 1
      // 58: iload 10
      // 5a: invokevirtual java/lang/String.charAt (I)C
      // 5d: istore 11
      // 5f: iload 8
      // 61: ifne b6
      // 64: iload 8
      // 66: ifne ae
      // 69: goto 70
      // 6c: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 6f: athrow
      // 70: iload 11
      // 72: aload 0
      // 73: getfield h16.m4l [Lh16$bzx;
      // 76: arraylength
      // 77: if_icmpge ab
      // 7a: goto 81
      // 7d: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 80: athrow
      // 81: iload 11
      // 83: iflt ab
      // 86: goto 8d
      // 89: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 8c: athrow
      // 8d: aload 0
      // 8e: iload 11
      // 90: dload 2
      // 91: d2f
      // 92: dload 4
      // 94: d2f
      // 95: invokevirtual h16.qun (CFF)V
      // 98: dload 2
      // 99: aload 0
      // 9a: getfield h16.m4l [Lh16$bzx;
      // 9d: iload 11
      // 9f: aaload
      // a0: getfield h16$bzx.ue7 I
      // a3: aload 0
      // a4: getfield h16.j_2 I
      // a7: isub
      // a8: i2d
      // a9: dadd
      // aa: dstore 2
      // ab: iinc 10 1
      // ae: iload 8
      // b0: ifeq 50
      // b3: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // b6: return
   }

   public void ckt(String param1, double param2, double param4, int param6, boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 2
      // 01: ldc2_w 3.0
      // 04: dsub
      // 05: dstore 2
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: dload 4
      // 0b: dconst_1
      // 0c: dsub
      // 0d: dstore 4
      // 0f: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 12: aload 0
      // 13: getfield h16.sba I
      // 16: invokestatic hzu.t30 (I)V
      // 19: iload 6
      // 1b: invokestatic hhf.rs_ (I)V
      // 1e: istore 8
      // 20: aload 1
      // 21: invokevirtual java/lang/String.length ()I
      // 24: istore 9
      // 26: bipush 0
      // 27: istore 10
      // 29: iload 10
      // 2b: iload 9
      // 2d: if_icmpge 8c
      // 30: aload 1
      // 31: iload 10
      // 33: invokevirtual java/lang/String.charAt (I)C
      // 36: istore 11
      // 38: iload 8
      // 3a: ifne 8f
      // 3d: iload 8
      // 3f: ifne 87
      // 42: goto 49
      // 45: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 48: athrow
      // 49: iload 11
      // 4b: aload 0
      // 4c: getfield h16.m4l [Lh16$bzx;
      // 4f: arraylength
      // 50: if_icmpge 84
      // 53: goto 5a
      // 56: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 59: athrow
      // 5a: iload 11
      // 5c: iflt 84
      // 5f: goto 66
      // 62: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 65: athrow
      // 66: aload 0
      // 67: iload 11
      // 69: dload 2
      // 6a: d2f
      // 6b: dload 4
      // 6d: d2f
      // 6e: invokevirtual h16.qun (CFF)V
      // 71: dload 2
      // 72: aload 0
      // 73: getfield h16.m4l [Lh16$bzx;
      // 76: iload 11
      // 78: aaload
      // 79: getfield h16$bzx.ue7 I
      // 7c: aload 0
      // 7d: getfield h16.j_2 I
      // 80: isub
      // 81: i2d
      // 82: dadd
      // 83: dstore 2
      // 84: iinc 10 1
      // 87: iload 8
      // 89: ifeq 29
      // 8c: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 8f: return
   }

   public void rh0(Color var1) {
      float var2 = (float)var1.getRed() / 255.0F;
      float var3 = (float)var1.getGreen() / 255.0F;
      float var4 = (float)var1.getBlue() / 255.0F;
      float var5 = (float)var1.getAlpha() / 255.0F;
      GL11.glColor4f(var2, var3, var4, var5);
   }

   public int lwd(String var1) {
      int var2 = 1;

      for (char var6 : var1.toCharArray()) {
         try {
            if (var6 == '\n') {
               var2++;
            }
         } catch (NullPointerException var7) {
            throw a(var7);
         }
      }

      return this.t42 * var2;
   }

   public int ppy() {
      return this.t42;
   }

   public int p3e(String var1) {
      int var2 = 0;

      for (char var6 : var1.toCharArray()) {
         try {
            if (var6 >= this.m4l.length || var6 < 0) {
               continue;
            }
         } catch (NullPointerException var7) {
            throw a(var7);
         }

         var2 += this.m4l[var6].ue7 - this.j_2;
      }

      return var2;
   }

   public boolean mci() {
      return this.xz9;
   }

   public void hex(boolean param1, boolean param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 26
      // 0b: getfield h16.xz9 Z
      // 0e: iload 1
      // 0f: if_icmpeq 2c
      // 12: goto 19
      // 15: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: putfield h16.xz9 Z
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic h16.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 25: athrow
      // 26: iload 1
      // 27: iload 2
      // 28: iload 3
      // 29: invokespecial h16.cr8 (ZZI)V
      // 2c: return
   }

   public Font b48() {
      return this.qcy;
   }

   private static NullPointerException a(NullPointerException var0) {
      return var0;
   }
}
