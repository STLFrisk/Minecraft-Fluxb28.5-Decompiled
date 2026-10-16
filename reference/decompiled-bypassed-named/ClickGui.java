import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Mouse;

public class ClickGui extends ShaderHelper {
   public static int e0a;
   public static int computeRotation;
   public static float m2e;
   public static float bq1;
   public int geu = -1;
   public int y6q = -1;
   public int kfn;
   public int qqg;
   public boolean zyj = false;
   public boolean euy = false;
   public boolean gnd = false;
   private fkf$m01 ap4 = new fkf$m01(0);
   public float ipy = -1.0F;
   public float bf9 = -1.0F;
   public float nn1 = -1.0F;
   public float nh5 = 0.0F;
   public Module sin = null;
   public fkf$r79 h6q = null;
   public Module vi0;
   public ArrayList z4w;
   public ArrayList yjc;
   public GuiPanel tvz;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ClickGui() {
      int var10000 = OpaquePredicate.b();
      this.vi0 = null;
      this.z4w = new ArrayList();
      this.yjc = new ArrayList();
      _aj[] var2 = _aj.values();
      int var3 = var2.length;
      int var4 = 0;
      int var1 = var10000;

      while (true) {
         if (var4 < var3) {
            _aj var5 = var2[var4];
            fkf$r79 var6 = new fkf$r79(this, var5);
            this.z4w.add(var6);
            fkf$afe var7 = new fkf$afe(this, var5);

            try {
               this.yjc.add(var7);
               var4++;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         this.tvz = new GuiPanel(this);
         break;
      }
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: new eka
      // 007: dup
      // 008: aload 0
      // 009: getfield ClickGui.f41 Lc05;
      // 00c: invokespecial eka.<init> (Lc05;)V
      // 00f: astore 2
      // 010: aload 0
      // 011: getfield ClickGui.ipy F
      // 014: ldc 270.0
      // 016: nop
      // 017: fcmpg
      // 018: iload 1
      // 019: ifeq 05e
      // 01c: ifge 056
      // 01f: goto 026
      // 022: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: getstatic ClickGui.m2e F
      // 029: iload 1
      // 02a: ifeq 04c
      // 02d: goto 034
      // 030: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: ldc 270.0
      // 036: nop
      // 037: fcmpg
      // 038: ifge 04f
      // 03b: goto 042
      // 03e: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: ldc 395.0
      // 044: nop
      // 045: goto 04c
      // 048: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: putstatic ClickGui.m2e F
      // 04f: aload 0
      // 050: getstatic ClickGui.m2e F
      // 053: putfield ClickGui.ipy F
      // 056: aload 0
      // 057: getfield ClickGui.bf9 F
      // 05a: ldc 250.0
      // 05c: nop
      // 05d: fcmpg
      // 05e: iload 1
      // 05f: ifeq 0a0
      // 062: ifge 09c
      // 065: goto 06c
      // 068: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06b: athrow
      // 06c: getstatic ClickGui.bq1 F
      // 06f: iload 1
      // 070: ifeq 092
      // 073: goto 07a
      // 076: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: ldc 250.0
      // 07c: nop
      // 07d: fcmpg
      // 07e: ifge 095
      // 081: goto 088
      // 084: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: ldc 280.0
      // 08a: nop
      // 08b: goto 092
      // 08e: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: putstatic ClickGui.bq1 F
      // 095: aload 0
      // 096: getstatic ClickGui.bq1 F
      // 099: putfield ClickGui.bf9 F
      // 09c: aload 0
      // 09d: getfield ClickGui.geu I
      // 0a0: iload 1
      // 0a1: ifeq 0e8
      // 0a4: ifge 0e4
      // 0a7: goto 0ae
      // 0aa: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: getstatic ClickGui.e0a I
      // 0b1: iload 1
      // 0b2: ifeq 0da
      // 0b5: goto 0bc
      // 0b8: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bb: athrow
      // 0bc: ifge 0dd
      // 0bf: goto 0c6
      // 0c2: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 2
      // 0c7: invokevirtual eka.x05 ()I
      // 0ca: i2f
      // 0cb: aload 0
      // 0cc: getfield ClickGui.ipy F
      // 0cf: fsub
      // 0d0: fconst_2
      // 0d1: fdiv
      // 0d2: f2i
      // 0d3: goto 0da
      // 0d6: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: putstatic ClickGui.e0a I
      // 0dd: aload 0
      // 0de: getstatic ClickGui.e0a I
      // 0e1: putfield ClickGui.geu I
      // 0e4: aload 0
      // 0e5: getfield ClickGui.y6q I
      // 0e8: iload 1
      // 0e9: ifeq 12f
      // 0ec: ifge 12c
      // 0ef: goto 0f6
      // 0f2: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: getstatic ClickGui.computeRotation I
      // 0f9: iload 1
      // 0fa: ifeq 122
      // 0fd: goto 104
      // 100: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: ifge 125
      // 107: goto 10e
      // 10a: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: aload 2
      // 10f: invokevirtual eka.lrx ()I
      // 112: i2f
      // 113: aload 0
      // 114: getfield ClickGui.bf9 F
      // 117: fsub
      // 118: fconst_2
      // 119: fdiv
      // 11a: f2i
      // 11b: goto 122
      // 11e: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: putstatic ClickGui.computeRotation I
      // 125: aload 0
      // 126: getstatic ClickGui.computeRotation I
      // 129: putfield ClickGui.y6q I
      // 12c: invokestatic org/lwjgl/input/Cursor.getMinCursorSize ()I
      // 12f: istore 3
      // 130: iload 3
      // 131: iload 3
      // 132: imul
      // 133: invokestatic org/lwjgl/BufferUtils.createIntBuffer (I)Ljava/nio/IntBuffer;
      // 136: astore 4
      // 138: new org/lwjgl/input/Cursor
      // 13b: dup
      // 13c: iload 3
      // 13d: iload 3
      // 13e: iload 3
      // 13f: bipush 2
      // 140: idiv
      // 141: iload 3
      // 142: bipush 2
      // 143: idiv
      // 144: bipush 1
      // 145: aload 4
      // 147: aconst_null
      // 148: invokespecial org/lwjgl/input/Cursor.<init> (IIIIILjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
      // 14b: astore 5
      // 14d: aload 5
      // 14f: invokestatic org/lwjgl/input/Mouse.setNativeCursor (Lorg/lwjgl/input/Cursor;)Lorg/lwjgl/input/Cursor;
      // 152: pop
      // 153: goto 15b
      // 156: astore 3
      // 157: aload 3
      // 158: invokevirtual java/lang/Exception.printStackTrace ()V
      // 15b: aload 0
      // 15c: getfield ClickGui.tvz Lers;
      // 15f: invokevirtual GuiPanel.dvt ()V
      // 162: return
   }

   public static void i90(int param0, int param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic Minecraft.vz1 ()Lc05;
      // 03: astore 5
      // 05: bipush 1
      // 06: istore 6
      // 08: aload 5
      // 0a: getfield Minecraft.oxn Lmoh;
      // 0d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 10: pop
      // 11: invokestatic OpaquePredicate.c ()I
      // 14: bipush 2
      // 15: istore 7
      // 17: istore 4
      // 19: iload 7
      // 1b: iload 4
      // 1d: ifne 31
      // 20: ifne 2f
      // 23: goto 2a
      // 26: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: sipush 1000
      // 2d: istore 7
      // 2f: iload 6
      // 31: iload 7
      // 33: if_icmpge 97
      // 36: aload 5
      // 38: getfield Minecraft.pfr I
      // 3b: iload 6
      // 3d: bipush 1
      // 3e: iadd
      // 3f: idiv
      // 40: sipush 320
      // 43: iload 4
      // 45: ifne ab
      // 48: goto 4f
      // 4b: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: iload 4
      // 51: ifne ab
      // 54: goto 5b
      // 57: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: if_icmplt 97
      // 5e: goto 65
      // 61: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: aload 5
      // 67: getfield Minecraft.ry7 I
      // 6a: iload 6
      // 6c: bipush 1
      // 6d: iadd
      // 6e: idiv
      // 6f: sipush 240
      // 72: iload 4
      // 74: ifne ab
      // 77: goto 7e
      // 7a: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: if_icmplt 97
      // 81: goto 88
      // 84: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: iinc 6 1
      // 8b: iload 4
      // 8d: ifeq 2f
      // 90: goto 97
      // 93: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96: athrow
      // 97: iload 0
      // 98: iload 6
      // 9a: imul
      // 9b: aload 5
      // 9d: getfield Minecraft.ry7 I
      // a0: i2f
      // a1: iload 1
      // a2: i2f
      // a3: fload 3
      // a4: fadd
      // a5: iload 6
      // a7: i2f
      // a8: fmul
      // a9: fsub
      // aa: f2i
      // ab: fload 2
      // ac: iload 6
      // ae: i2f
      // af: fmul
      // b0: f2i
      // b1: fload 3
      // b2: iload 6
      // b4: i2f
      // b5: fmul
      // b6: f2i
      // b7: invokestatic org/lwjgl/opengl/GL11.glScissor (IIII)V
      // ba: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ClickGui.a J
      // 003: ldc2_w 45397676818244
      // 006: lxor
      // 007: lstore 4
      // 009: getstatic ClientState.qkk Lzwr;
      // 00c: pop
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: getstatic ClientState.gki Lc_3;
      // 013: sipush 15744
      // 016: ldc2_w 3083325741928364784
      // 019: lload 4
      // 01b: lxor
      // 01c: invokedynamic p (IJ)Ljava/lang/String; bsm=ClickGui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: nop
      // 022: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 025: istore 7
      // 027: istore 6
      // 029: getstatic ClientState.cdn Lcn7;
      // 02c: invokevirtual BooleanSetting.g7m ()Z
      // 02f: iload 6
      // 031: ifeq 041
      // 034: ifne 057
      // 037: goto 03e
      // 03a: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: invokestatic hxt.veb ()Z
      // 041: ifne 057
      // 044: getstatic ClientState.hg9 Lcrk;
      // 047: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 04a: invokevirtual java/lang/Float.floatValue ()F
      // 04d: invokestatic hmp.f43 (F)V
      // 050: goto 057
      // 053: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: new eka
      // 05a: dup
      // 05b: aload 0
      // 05c: getfield ClickGui.f41 Lc05;
      // 05f: invokespecial eka.<init> (Lc05;)V
      // 062: astore 8
      // 064: aload 0
      // 065: getfield ClickGui.tvz Lers;
      // 068: aload 8
      // 06a: iload 1
      // 06b: iload 2
      // 06c: fload 3
      // 06d: invokevirtual GuiPanel.jet (Leka;IIF)V
      // 070: aload 0
      // 071: getfield ClickGui.geu I
      // 074: i2f
      // 075: aload 0
      // 076: getfield ClickGui.y6q I
      // 079: i2f
      // 07a: aload 0
      // 07b: getfield ClickGui.geu I
      // 07e: i2f
      // 07f: aload 0
      // 080: getfield ClickGui.ipy F
      // 083: fadd
      // 084: aload 0
      // 085: getfield ClickGui.y6q I
      // 088: i2f
      // 089: aload 0
      // 08a: getfield ClickGui.bf9 F
      // 08d: fadd
      // 08e: iload 7
      // 090: iload 6
      // 092: ifeq 0ab
      // 095: ifeq 0a9
      // 098: goto 09f
      // 09b: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: ldc -13486789
      // 0a1: nop
      // 0a2: goto 0ac
      // 0a5: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: ldc -921103
      // 0ab: nop
      // 0ac: invokestatic hhf.hxa (FFFFI)V
      // 0af: aload 0
      // 0b0: aload 0
      // 0b1: getfield ClickGui.geu I
      // 0b4: i2f
      // 0b5: aload 0
      // 0b6: getfield ClickGui.y6q I
      // 0b9: i2f
      // 0ba: aload 0
      // 0bb: getfield ClickGui.geu I
      // 0be: bipush 100
      // 0c0: iadd
      // 0c1: i2f
      // 0c2: aload 0
      // 0c3: getfield ClickGui.y6q I
      // 0c6: i2f
      // 0c7: aload 0
      // 0c8: getfield ClickGui.bf9 F
      // 0cb: fadd
      // 0cc: iload 7
      // 0ce: iload 6
      // 0d0: ifeq 0e7
      // 0d3: ifeq 0ea
      // 0d6: goto 0dd
      // 0d9: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: ldc -13684426
      // 0df: nop
      // 0e0: goto 0e7
      // 0e3: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: goto 0eb
      // 0ea: bipush -1
      // 0eb: invokevirtual ClickGui.h05 (FFFFI)V
      // 0ee: getstatic jsr.qla Lcyb;
      // 0f1: ldc "q"
      // 0f3: nop
      // 0f4: aload 0
      // 0f5: getfield ClickGui.geu I
      // 0f8: i2f
      // 0f9: ldc 8.0
      // 0fb: nop
      // 0fc: fadd
      // 0fd: aload 0
      // 0fe: getfield ClickGui.y6q I
      // 101: i2f
      // 102: ldc 11.0
      // 104: nop
      // 105: fadd
      // 106: iload 7
      // 108: iload 6
      // 10a: ifeq 133
      // 10d: ifeq 131
      // 110: goto 117
      // 113: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: new java/awt/Color
      // 11a: dup
      // 11b: sipush 255
      // 11e: sipush 255
      // 121: sipush 255
      // 124: invokespecial java/awt/Color.<init> (III)V
      // 127: invokevirtual java/awt/Color.getRGB ()I
      // 12a: goto 134
      // 12d: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: ldc -12165889
      // 133: nop
      // 134: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 137: pop
      // 138: getstatic jsr.cz0 Lcyb;
      // 13b: sipush 21557
      // 13e: ldc2_w 1540803509852164934
      // 141: lload 4
      // 143: lxor
      // 144: invokedynamic p (IJ)Ljava/lang/String; bsm=ClickGui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: nop
      // 14a: invokevirtual java/lang/String.toUpperCase ()Ljava/lang/String;
      // 14d: aload 0
      // 14e: getfield ClickGui.geu I
      // 151: i2f
      // 152: ldc 24.0
      // 154: nop
      // 155: fadd
      // 156: aload 0
      // 157: getfield ClickGui.y6q I
      // 15a: i2f
      // 15b: ldc 10.0
      // 15d: nop
      // 15e: fadd
      // 15f: iload 7
      // 161: iload 6
      // 163: ifeq 18c
      // 166: ifeq 18a
      // 169: goto 170
      // 16c: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: new java/awt/Color
      // 173: dup
      // 174: sipush 255
      // 177: sipush 255
      // 17a: sipush 255
      // 17d: invokespecial java/awt/Color.<init> (III)V
      // 180: invokevirtual java/awt/Color.getRGB ()I
      // 183: goto 18d
      // 186: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: ldc -12165889
      // 18c: nop
      // 18d: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 190: pop
      // 191: getstatic jsr.rs4 Lcyb;
      // 194: sipush 24798
      // 197: ldc2_w 4210395653319747503
      // 19a: lload 4
      // 19c: lxor
      // 19d: invokedynamic p (IJ)Ljava/lang/String; bsm=ClickGui.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: nop
      // 1a3: aload 0
      // 1a4: getfield ClickGui.geu I
      // 1a7: i2f
      // 1a8: ldc 62.0
      // 1aa: nop
      // 1ab: fadd
      // 1ac: aload 0
      // 1ad: getfield ClickGui.y6q I
      // 1b0: i2f
      // 1b1: ldc 13.5
      // 1b3: nop
      // 1b4: fadd
      // 1b5: iload 7
      // 1b7: iload 6
      // 1b9: ifeq 1e2
      // 1bc: ifeq 1e0
      // 1bf: goto 1c6
      // 1c2: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c5: athrow
      // 1c6: new java/awt/Color
      // 1c9: dup
      // 1ca: sipush 220
      // 1cd: sipush 221
      // 1d0: sipush 222
      // 1d3: invokespecial java/awt/Color.<init> (III)V
      // 1d6: invokevirtual java/awt/Color.getRGB ()I
      // 1d9: goto 1e3
      // 1dc: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: ldc -3881788
      // 1e2: nop
      // 1e3: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1e6: pop
      // 1e7: aload 0
      // 1e8: aload 0
      // 1e9: getfield ClickGui.geu I
      // 1ec: bipush 100
      // 1ee: iadd
      // 1ef: i2f
      // 1f0: aload 0
      // 1f1: getfield ClickGui.y6q I
      // 1f4: i2f
      // 1f5: ldc 0.5
      // 1f7: nop
      // 1f8: fsub
      // 1f9: aload 0
      // 1fa: getfield ClickGui.geu I
      // 1fd: bipush 110
      // 1ff: iadd
      // 200: i2f
      // 201: aload 0
      // 202: getfield ClickGui.y6q I
      // 205: i2f
      // 206: aload 0
      // 207: getfield ClickGui.bf9 F
      // 20a: fadd
      // 20b: ldc 0.5
      // 20d: nop
      // 20e: fadd
      // 20f: getstatic z7e.ret Lz7e;
      // 212: getfield z7e.k0y I
      // 215: ldc 0.15
      // 217: nop
      // 218: invokestatic hhf.kjo (IF)I
      // 21b: getstatic z7e.ret Lz7e;
      // 21e: getfield z7e.k0y I
      // 221: fconst_0
      // 222: invokestatic hhf.kjo (IF)I
      // 225: invokevirtual ClickGui._ty (FFFFII)V
      // 228: aload 0
      // 229: iload 6
      // 22b: ifeq 252
      // 22e: getfield ClickGui.h6q Lfkf$r79;
      // 231: ifnonnull 251
      // 234: goto 23b
      // 237: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23a: athrow
      // 23b: aload 0
      // 23c: aload 0
      // 23d: getfield ClickGui.z4w Ljava/util/ArrayList;
      // 240: bipush 0
      // 241: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 244: checkcast fkf$r79
      // 247: putfield ClickGui.h6q Lfkf$r79;
      // 24a: goto 251
      // 24d: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: aload 0
      // 252: iload 6
      // 254: ifeq 28a
      // 257: getfield ClickGui.zyj Z
      // 25a: ifne 282
      // 25d: goto 264
      // 260: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 263: athrow
      // 264: aload 0
      // 265: iload 6
      // 267: ifeq 2a1
      // 26a: goto 271
      // 26d: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 270: athrow
      // 271: getfield ClickGui.nn1 F
      // 274: ldc -1.0
      // 276: nop
      // 277: fcmpg
      // 278: ifgt 299
      // 27b: goto 282
      // 27e: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 281: athrow
      // 282: aload 0
      // 283: goto 28a
      // 286: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 289: athrow
      // 28a: aload 0
      // 28b: getfield ClickGui.h6q Lfkf$r79;
      // 28e: getfield fkf$r79.rbx F
      // 291: putfield ClickGui.nn1 F
      // 294: iload 6
      // 296: ifne 2d1
      // 299: aload 0
      // 29a: goto 2a1
      // 29d: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a0: athrow
      // 2a1: aload 0
      // 2a2: getfield ClickGui.nn1 F
      // 2a5: aload 0
      // 2a6: getfield ClickGui.h6q Lfkf$r79;
      // 2a9: getfield fkf$r79.rbx F
      // 2ac: ldc 10.0
      // 2ae: nop
      // 2af: aload 0
      // 2b0: getfield ClickGui.nn1 F
      // 2b3: aload 0
      // 2b4: getfield ClickGui.h6q Lfkf$r79;
      // 2b7: getfield fkf$r79.rbx F
      // 2ba: fsub
      // 2bb: invokestatic java/lang/Math.abs (F)F
      // 2be: ldc 35.0
      // 2c0: nop
      // 2c1: fmul
      // 2c2: invokestatic java/lang/Math.max (FF)F
      // 2c5: f2d
      // 2c6: ldc2_w 0.3
      // 2c9: dmul
      // 2ca: d2f
      // 2cb: invokestatic InputState.lvf (FFF)F
      // 2ce: putfield ClickGui.nn1 F
      // 2d1: aload 0
      // 2d2: getfield ClickGui.geu I
      // 2d5: i2f
      // 2d6: ldc 0.5
      // 2d8: nop
      // 2d9: fsub
      // 2da: aload 0
      // 2db: getfield ClickGui.nn1 F
      // 2de: aload 0
      // 2df: getfield ClickGui.geu I
      // 2e2: i2f
      // 2e3: ldc 100.0
      // 2e5: nop
      // 2e6: fadd
      // 2e7: aload 0
      // 2e8: getfield ClickGui.nn1 F
      // 2eb: ldc 25.0
      // 2ed: nop
      // 2ee: fadd
      // 2ef: ldc -12417291
      // 2f1: nop
      // 2f2: invokestatic hhf.cuu (FFFFI)V
      // 2f5: aload 0
      // 2f6: getfield ClickGui.y6q I
      // 2f9: bipush 35
      // 2fb: iadd
      // 2fc: i2f
      // 2fd: fstore 9
      // 2ff: aload 0
      // 300: getfield ClickGui.z4w Ljava/util/ArrayList;
      // 303: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 306: astore 10
      // 308: aload 10
      // 30a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 30f: ifeq 33c
      // 312: aload 10
      // 314: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 319: checkcast fkf$r79
      // 31c: astore 11
      // 31e: aload 11
      // 320: aload 0
      // 321: getfield ClickGui.geu I
      // 324: i2f
      // 325: fload 9
      // 327: invokevirtual fkf$r79.g2i (FF)V
      // 32a: fload 9
      // 32c: ldc 25.0
      // 32e: nop
      // 32f: fadd
      // 330: iload 6
      // 332: ifeq 344
      // 335: fstore 9
      // 337: iload 6
      // 339: ifne 308
      // 33c: aload 0
      // 33d: getfield ClickGui.y6q I
      // 340: bipush 35
      // 342: iadd
      // 343: i2f
      // 344: fstore 10
      // 346: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 349: sipush 3089
      // 34c: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 34f: aload 0
      // 350: getfield ClickGui.geu I
      // 353: aload 0
      // 354: getfield ClickGui.nn1 F
      // 357: f2i
      // 358: ldc 99.0
      // 35a: nop
      // 35b: ldc 25.0
      // 35d: nop
      // 35e: invokestatic ClickGui.i90 (IIFF)V
      // 361: aload 0
      // 362: getfield ClickGui.z4w Ljava/util/ArrayList;
      // 365: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 368: astore 11
      // 36a: aload 11
      // 36c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 371: ifeq 3a5
      // 374: aload 11
      // 376: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37b: checkcast fkf$r79
      // 37e: astore 12
      // 380: aload 12
      // 382: aload 0
      // 383: getfield ClickGui.geu I
      // 386: i2f
      // 387: fload 10
      // 389: invokevirtual fkf$r79.tmz (FF)V
      // 38c: fload 10
      // 38e: ldc 25.0
      // 390: nop
      // 391: fadd
      // 392: fstore 10
      // 394: iload 6
      // 396: ifeq 3ce
      // 399: iload 6
      // 39b: ifne 36a
      // 39e: goto 3a5
      // 3a1: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: sipush 3089
      // 3a8: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 3ab: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 3ae: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 3b1: sipush 3089
      // 3b4: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 3b7: aload 0
      // 3b8: pop
      // 3b9: aload 0
      // 3ba: getfield ClickGui.geu I
      // 3bd: bipush 1
      // 3be: isub
      // 3bf: aload 0
      // 3c0: getfield ClickGui.y6q I
      // 3c3: aload 0
      // 3c4: getfield ClickGui.ipy F
      // 3c7: aload 0
      // 3c8: getfield ClickGui.bf9 F
      // 3cb: invokestatic ClickGui.i90 (IIFF)V
      // 3ce: aload 0
      // 3cf: getfield ClickGui.yjc Ljava/util/ArrayList;
      // 3d2: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 3d5: astore 11
      // 3d7: aload 11
      // 3d9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3de: ifeq 436
      // 3e1: aload 11
      // 3e3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3e8: checkcast fkf$afe
      // 3eb: astore 12
      // 3ed: iload 6
      // 3ef: ifeq 445
      // 3f2: aload 12
      // 3f4: iload 6
      // 3f6: ifeq 41d
      // 3f9: goto 400
      // 3fc: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ff: athrow
      // 400: getfield fkf$afe.f4b L_aj;
      // 403: aload 0
      // 404: getfield ClickGui.h6q Lfkf$r79;
      // 407: getfield fkf$r79.bv5 L_aj;
      // 40a: if_acmpne 431
      // 40d: goto 414
      // 410: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 413: athrow
      // 414: aload 12
      // 416: goto 41d
      // 419: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41c: athrow
      // 41d: aload 0
      // 41e: getfield ClickGui.geu I
      // 421: bipush 100
      // 423: iadd
      // 424: i2f
      // 425: aload 0
      // 426: getfield ClickGui.y6q I
      // 429: i2f
      // 42a: iload 1
      // 42b: i2f
      // 42c: iload 2
      // 42d: i2f
      // 42e: invokevirtual fkf$afe.g71 (FFFF)V
      // 431: iload 6
      // 433: ifne 3d7
      // 436: sipush 3089
      // 439: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 43c: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 43f: aload 0
      // 440: iload 1
      // 441: iload 2
      // 442: invokespecial ClickGui.r01 (II)V
      // 445: aload 8
      // 447: invokevirtual eka.x05 ()I
      // 44a: i2f
      // 44b: fstore 11
      // 44d: aload 8
      // 44f: invokevirtual eka.lrx ()I
      // 452: i2f
      // 453: fstore 12
      // 455: invokestatic org/lwjgl/input/Mouse.getX ()I
      // 458: i2f
      // 459: fload 11
      // 45b: fmul
      // 45c: aload 0
      // 45d: getfield ClickGui.f41 Lc05;
      // 460: getfield Minecraft.pfr I
      // 463: i2f
      // 464: fdiv
      // 465: ldc 0.5
      // 467: nop
      // 468: fsub
      // 469: fstore 13
      // 46b: fload 12
      // 46d: invokestatic org/lwjgl/input/Mouse.getY ()I
      // 470: i2f
      // 471: fload 12
      // 473: fmul
      // 474: aload 0
      // 475: getfield ClickGui.f41 Lc05;
      // 478: getfield Minecraft.ry7 I
      // 47b: i2f
      // 47c: fdiv
      // 47d: fsub
      // 47e: ldc 0.5
      // 480: nop
      // 481: fsub
      // 482: fstore 14
      // 484: aload 0
      // 485: getfield ClickGui.gnd Z
      // 488: ifeq 49a
      // 48b: fload 13
      // 48d: ldc 1.8
      // 48f: nop
      // 490: fsub
      // 491: fconst_1
      // 492: fsub
      // 493: goto 4a2
      // 496: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 499: athrow
      // 49a: fload 13
      // 49c: ldc 0.8
      // 49e: nop
      // 49f: fadd
      // 4a0: fconst_1
      // 4a1: fsub
      // 4a2: fstore 15
      // 4a4: aload 0
      // 4a5: getfield ClickGui.gnd Z
      // 4a8: ifeq 4b8
      // 4ab: fload 14
      // 4ad: ldc 4.5
      // 4af: nop
      // 4b0: fsub
      // 4b1: goto 4be
      // 4b4: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b7: athrow
      // 4b8: fload 14
      // 4ba: ldc 0.5
      // 4bc: nop
      // 4bd: fadd
      // 4be: fstore 16
      // 4c0: aload 0
      // 4c1: getfield ClickGui.gnd Z
      // 4c4: ifeq 4d4
      // 4c7: fload 13
      // 4c9: ldc 4.0
      // 4cb: nop
      // 4cc: fsub
      // 4cd: goto 4d8
      // 4d0: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d3: athrow
      // 4d4: fload 13
      // 4d6: fconst_1
      // 4d7: fsub
      // 4d8: fstore 17
      // 4da: aload 0
      // 4db: getfield ClickGui.gnd Z
      // 4de: ifeq 4ee
      // 4e1: fload 14
      // 4e3: ldc 5.0
      // 4e5: nop
      // 4e6: fsub
      // 4e7: goto 4f0
      // 4ea: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ed: athrow
      // 4ee: fload 14
      // 4f0: fstore 18
      // 4f2: getstatic jsr.kq6 Lcyb;
      // 4f5: aload 0
      // 4f6: getfield ClickGui.gnd Z
      // 4f9: ifeq 506
      // 4fc: ldc "o"
      // 4fe: nop
      // 4ff: goto 509
      // 502: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 505: athrow
      // 506: ldc "p"
      // 508: nop
      // 509: fload 15
      // 50b: fload 16
      // 50d: ldc -16777216
      // 50f: nop
      // 510: ldc 0.45
      // 512: nop
      // 513: invokestatic hhf.kjo (IF)I
      // 516: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 519: pop
      // 51a: getstatic jsr.kq6 Lcyb;
      // 51d: aload 0
      // 51e: getfield ClickGui.gnd Z
      // 521: ifeq 52e
      // 524: ldc "o"
      // 526: nop
      // 527: goto 531
      // 52a: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52d: athrow
      // 52e: ldc "p"
      // 530: nop
      // 531: fload 17
      // 533: fload 18
      // 535: getstatic GuiHandler.vll Lcn7;
      // 538: invokevirtual BooleanSetting.g7m ()Z
      // 53b: iload 6
      // 53d: ifeq 558
      // 540: ifeq 55b
      // 543: goto 54a
      // 546: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 549: athrow
      // 54a: aload 0
      // 54b: sipush 200
      // 54e: invokevirtual ClickGui.kfo (I)I
      // 551: goto 558
      // 554: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 557: athrow
      // 558: goto 586
      // 55b: new java/awt/Color
      // 55e: dup
      // 55f: getstatic GuiHandler.fvr Lcrk;
      // 562: invokevirtual NumberSetting.u7t ()D
      // 565: d2f
      // 566: ldc 255.0
      // 568: nop
      // 569: fdiv
      // 56a: getstatic GuiHandler.t3o Lcrk;
      // 56d: invokevirtual NumberSetting.u7t ()D
      // 570: d2f
      // 571: ldc 255.0
      // 573: nop
      // 574: fdiv
      // 575: getstatic GuiHandler.jv9 Lcrk;
      // 578: invokevirtual NumberSetting.u7t ()D
      // 57b: d2f
      // 57c: ldc 255.0
      // 57e: nop
      // 57f: fdiv
      // 580: invokespecial java/awt/Color.<init> (FFF)V
      // 583: invokevirtual java/awt/Color.getRGB ()I
      // 586: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 589: pop
      // 58a: return
   }

   public int kfo(int var1) {
      double var2 = Math.ceil((double)(System.currentTimeMillis() + (long)var1) / 10.0);
      double var4;
      return Color.getHSBColor((float)((var4 = var2 % 360.0) / 360.0), 0.35F, 1.0F).getRGB();
   }

   private void r01(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: bipush 0
      // 005: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 008: iload 3
      // 009: ifne 0d1
      // 00c: ifne 062
      // 00f: goto 016
      // 012: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 015: athrow
      // 016: aload 0
      // 017: iload 3
      // 018: ifne 055
      // 01b: goto 022
      // 01e: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: getfield ClickGui.zyj Z
      // 025: ifne 048
      // 028: goto 02f
      // 02b: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield ClickGui.euy Z
      // 033: iload 3
      // 034: ifne 0d1
      // 037: goto 03e
      // 03a: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: ifeq 062
      // 041: goto 048
      // 044: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 0
      // 049: bipush 0
      // 04a: putfield ClickGui.zyj Z
      // 04d: aload 0
      // 04e: goto 055
      // 051: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: bipush 0
      // 056: putfield ClickGui.euy Z
      // 059: getstatic ClientState.qkk Lzwr;
      // 05c: invokevirtual ClientState.getConfigManager ()Lszk;
      // 05f: invokevirtual ConfigManager.ax1 ()V
      // 062: getstatic jsr.q6n Lcyb;
      // 065: ldc "l"
      // 067: nop
      // 068: aload 0
      // 069: getfield ClickGui.geu I
      // 06c: i2f
      // 06d: aload 0
      // 06e: getfield ClickGui.ipy F
      // 071: fadd
      // 072: ldc 6.0
      // 074: nop
      // 075: fsub
      // 076: aload 0
      // 077: getfield ClickGui.y6q I
      // 07a: i2f
      // 07b: aload 0
      // 07c: getfield ClickGui.bf9 F
      // 07f: fadd
      // 080: ldc 6.0
      // 082: nop
      // 083: fsub
      // 084: getstatic z7e.kks Lz7e;
      // 087: getfield z7e.k0y I
      // 08a: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 08d: pop
      // 08e: aload 0
      // 08f: iload 1
      // 090: iload 3
      // 091: ifne 118
      // 094: i2f
      // 095: iload 2
      // 096: i2f
      // 097: aload 0
      // 098: getfield ClickGui.geu I
      // 09b: i2f
      // 09c: aload 0
      // 09d: getfield ClickGui.ipy F
      // 0a0: fadd
      // 0a1: ldc 6.0
      // 0a3: nop
      // 0a4: fsub
      // 0a5: aload 0
      // 0a6: getfield ClickGui.y6q I
      // 0a9: i2f
      // 0aa: aload 0
      // 0ab: getfield ClickGui.bf9 F
      // 0ae: fadd
      // 0af: ldc 6.0
      // 0b1: nop
      // 0b2: fsub
      // 0b3: aload 0
      // 0b4: getfield ClickGui.geu I
      // 0b7: i2f
      // 0b8: aload 0
      // 0b9: getfield ClickGui.ipy F
      // 0bc: fadd
      // 0bd: aload 0
      // 0be: getfield ClickGui.y6q I
      // 0c1: i2f
      // 0c2: aload 0
      // 0c3: getfield ClickGui.bf9 F
      // 0c6: fadd
      // 0c7: invokevirtual ClickGui.imv (FFFFFF)Z
      // 0ca: goto 0d1
      // 0cd: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: ifeq 10f
      // 0d4: aload 0
      // 0d5: bipush 1
      // 0d6: putfield ClickGui.gnd Z
      // 0d9: aload 0
      // 0da: getfield ClickGui.ap4 Lfkf$m01;
      // 0dd: invokevirtual fkf$m01.mxf ()Z
      // 0e0: iload 3
      // 0e1: ifne 11f
      // 0e4: goto 0eb
      // 0e7: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: ifeq 11b
      // 0ee: goto 0f5
      // 0f1: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: bipush 1
      // 0f7: putfield ClickGui.euy Z
      // 0fa: aload 0
      // 0fb: iload 1
      // 0fc: putfield ClickGui.kfn I
      // 0ff: aload 0
      // 100: iload 2
      // 101: putfield ClickGui.qqg I
      // 104: iload 3
      // 105: ifeq 11b
      // 108: goto 10f
      // 10b: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 0
      // 110: bipush 0
      // 111: goto 118
      // 114: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: putfield ClickGui.gnd Z
      // 11b: aload 0
      // 11c: getfield ClickGui.euy Z
      // 11f: iload 3
      // 120: ifne 1e3
      // 123: ifeq 1c1
      // 126: goto 12d
      // 129: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: aload 0
      // 12e: bipush 1
      // 12f: putfield ClickGui.gnd Z
      // 132: aload 0
      // 133: dup
      // 134: getfield ClickGui.ipy F
      // 137: iload 1
      // 138: aload 0
      // 139: getfield ClickGui.kfn I
      // 13c: isub
      // 13d: i2f
      // 13e: fadd
      // 13f: putfield ClickGui.ipy F
      // 142: aload 0
      // 143: iload 3
      // 144: ifne 179
      // 147: goto 14e
      // 14a: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: getfield ClickGui.ipy F
      // 151: ldc 270.0
      // 153: nop
      // 154: fcmpg
      // 155: ifge 171
      // 158: goto 15f
      // 15b: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: aload 0
      // 160: ldc 270.0
      // 162: nop
      // 163: putfield ClickGui.ipy F
      // 166: iload 3
      // 167: ifeq 17d
      // 16a: goto 171
      // 16d: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: aload 0
      // 172: goto 179
      // 175: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: iload 1
      // 17a: putfield ClickGui.kfn I
      // 17d: aload 0
      // 17e: dup
      // 17f: getfield ClickGui.bf9 F
      // 182: iload 2
      // 183: aload 0
      // 184: getfield ClickGui.qqg I
      // 187: isub
      // 188: i2f
      // 189: fadd
      // 18a: putfield ClickGui.bf9 F
      // 18d: aload 0
      // 18e: iload 3
      // 18f: ifne 1bd
      // 192: getfield ClickGui.bf9 F
      // 195: ldc 250.0
      // 197: nop
      // 198: fcmpg
      // 199: ifge 1b5
      // 19c: goto 1a3
      // 19f: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: aload 0
      // 1a4: ldc 250.0
      // 1a6: nop
      // 1a7: putfield ClickGui.bf9 F
      // 1aa: iload 3
      // 1ab: ifeq 1c1
      // 1ae: goto 1b5
      // 1b1: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: goto 1bd
      // 1b9: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: iload 2
      // 1be: putfield ClickGui.qqg I
      // 1c1: aload 0
      // 1c2: iload 1
      // 1c3: i2f
      // 1c4: iload 2
      // 1c5: i2f
      // 1c6: aload 0
      // 1c7: getfield ClickGui.geu I
      // 1ca: i2f
      // 1cb: aload 0
      // 1cc: getfield ClickGui.y6q I
      // 1cf: i2f
      // 1d0: aload 0
      // 1d1: getfield ClickGui.geu I
      // 1d4: bipush 99
      // 1d6: iadd
      // 1d7: i2f
      // 1d8: aload 0
      // 1d9: getfield ClickGui.y6q I
      // 1dc: bipush 34
      // 1de: iadd
      // 1df: i2f
      // 1e0: invokevirtual ClickGui.imv (FFFFFF)Z
      // 1e3: iload 3
      // 1e4: ifne 23c
      // 1e7: ifeq 22d
      // 1ea: goto 1f1
      // 1ed: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: getfield ClickGui.ap4 Lfkf$m01;
      // 1f5: invokevirtual fkf$m01.mxf ()Z
      // 1f8: iload 3
      // 1f9: ifne 23c
      // 1fc: goto 203
      // 1ff: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: ifeq 22d
      // 206: goto 20d
      // 209: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: aload 0
      // 20e: bipush 1
      // 20f: putfield ClickGui.zyj Z
      // 212: aload 0
      // 213: iload 1
      // 214: aload 0
      // 215: getfield ClickGui.geu I
      // 218: isub
      // 219: putfield ClickGui.kfn I
      // 21c: aload 0
      // 21d: iload 2
      // 21e: aload 0
      // 21f: getfield ClickGui.y6q I
      // 222: isub
      // 223: putfield ClickGui.qqg I
      // 226: goto 22d
      // 229: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: aload 0
      // 22e: iload 3
      // 22f: ifne 251
      // 232: getfield ClickGui.zyj Z
      // 235: goto 23c
      // 238: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: ifeq 25a
      // 23f: aload 0
      // 240: iload 1
      // 241: aload 0
      // 242: getfield ClickGui.kfn I
      // 245: isub
      // 246: putfield ClickGui.geu I
      // 249: aload 0
      // 24a: goto 251
      // 24d: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: iload 2
      // 252: aload 0
      // 253: getfield ClickGui.qqg I
      // 256: isub
      // 257: putfield ClickGui.y6q I
      // 25a: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      int var4 = OpaquePredicate.b();
      Iterator var5 = this.z4w.iterator();

      while (true) {
         if (var5.hasNext()) {
            fkf$r79 var6 = (fkf$r79)var5.next();

            try {
               var6.x5_(var1, var2);
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         this.tvz.cpq(var1, var2, var3);
         super.mouseClicked(var1, var2, var3);
         break;
      }
   }

   @Override
   public void updateScreen() {
      super.updateScreen();
   }

   @Override
   public void onGuiClosed() {
      try {
         Mouse.setNativeCursor(null);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      this.tvz._ql();
      ClientState.qkk.getConfigManager().t0k();
      super.onGuiClosed();
   }

   @Override
   public boolean a99() {
      return false;
   }

   public void h05(float var1, float var2, float var3, float var4, int var5) {
      hhf.cuu(var1 - 0.5F, var2 + 0.5F, var1, var4 - 0.5F, var5);
      hhf.cuu(var1 + 0.5F, var2 + 0.5F, var3 - 0.5F, var2, var5);
      hhf.cuu(var1 + 0.5F, var4, var3 - 0.5F, var4 + 0.5F, var5);
      hhf.cuu(var1, var2, var3, var4, var5);
   }

   public boolean imv(float param1, float param2, float param3, float param4, float param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 7
      // 05: fload 1
      // 06: aload 0
      // 07: getfield ClickGui.geu I
      // 0a: i2f
      // 0b: fcmpl
      // 0c: iload 7
      // 0e: ifne 2e
      // 11: ifle e7
      // 14: goto 1b
      // 17: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: fload 1
      // 1c: aload 0
      // 1d: getfield ClickGui.geu I
      // 20: i2f
      // 21: aload 0
      // 22: getfield ClickGui.ipy F
      // 25: fadd
      // 26: fcmpg
      // 27: goto 2e
      // 2a: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: iload 7
      // 30: ifne 4b
      // 33: ifge e7
      // 36: goto 3d
      // 39: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: fload 2
      // 3e: aload 0
      // 3f: getfield ClickGui.y6q I
      // 42: i2f
      // 43: fcmpl
      // 44: goto 4b
      // 47: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: iload 7
      // 4d: ifne 6d
      // 50: ifle e7
      // 53: goto 5a
      // 56: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: fload 2
      // 5b: aload 0
      // 5c: getfield ClickGui.y6q I
      // 5f: i2f
      // 60: aload 0
      // 61: getfield ClickGui.bf9 F
      // 64: fadd
      // 65: fcmpg
      // 66: goto 6d
      // 69: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c: athrow
      // 6d: iload 7
      // 6f: ifne 86
      // 72: ifge e7
      // 75: goto 7c
      // 78: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: fload 1
      // 7d: fload 3
      // 7e: fcmpl
      // 7f: goto 86
      // 82: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: iload 7
      // 88: ifne a0
      // 8b: ifle e7
      // 8e: goto 95
      // 91: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94: athrow
      // 95: fload 1
      // 96: fload 5
      // 98: fcmpg
      // 99: goto a0
      // 9c: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f: athrow
      // a0: iload 7
      // a2: ifne ba
      // a5: ifge e7
      // a8: goto af
      // ab: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: fload 2
      // b0: fload 4
      // b2: fcmpl
      // b3: goto ba
      // b6: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b9: athrow
      // ba: iload 7
      // bc: ifne d4
      // bf: ifle e7
      // c2: goto c9
      // c5: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c8: athrow
      // c9: fload 2
      // ca: fload 6
      // cc: fcmpg
      // cd: goto d4
      // d0: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d3: athrow
      // d4: iload 7
      // d6: ifne e4
      // d9: ifge e7
      // dc: goto e3
      // df: invokestatic ClickGui.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e2: athrow
      // e3: bipush 1
      // e4: goto e8
      // e7: bipush 0
      // e8: ireturn
   }

   public void _ty(float var1, float var2, float var3, float var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var5 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var6 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      jom var15 = jom.yut();
      q3g var16 = var15.zuq();
      var16.ezr(7, gnl.gec);
      var16.g5o((double)var3, (double)var2, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var16.g5o((double)var1, (double)var2, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var4, (double)this.o3s).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var3, (double)var4, (double)this.o3s).gs4(var12, var13, var14, var11).pzw();
      var15.q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4089433234938232591L, 4411539728531826525L, MethodHandles.lookup().lookupClass()).a(32116872030607L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4092602059314L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\n¯©6iz\n¹|\u000b¡M\u00ad«À\u0002\u0010\u008dÉK¤É\u0082\u0004\u009b\u0006?È, Ù\u008dX\u0010H\u000f\u0000EG7ü2²\u0011\u008f\r\u00142R\u0001";
      int var8 = "\n¯©6iz\n¹|\u000b¡M\u00ad«À\u0002\u0010\u008dÉK¤É\u0082\u0004\u009b\u0006?È, Ù\u008dX\u0010H\u000f\u0000EG7ü2²\u0011\u008f\r\u00142R\u0001"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[3];
            e0a = -1;
            computeRotation = -1;
            m2e = -1.0F;
            bq1 = -1.0F;
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Exception a(Exception var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10051;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ClickGui", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("ClickGui" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
