import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class jvy extends ShaderHelper {
   public List brz = new ArrayList();
   private int r4j;
   private int n3p;
   public static int s15;
   public static int ypj;
   public static int nwy;
   public static int cec;
   public static int ynu;
   public static int dbl;
   public static int rz5;
   public static int ogc;
   public static int cnm;
   public static int hb0;
   public static int seg;
   public static int ts6;
   public static int xll;
   public static boolean ck5;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public jvy() {
      this.w2p = true;
      this.fwo();
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
      // 000: getstatic jvy.a J
      // 003: ldc2_w 24491309372210
      // 006: lxor
      // 007: lstore 4
      // 009: getstatic ClientState.gki Lc_3;
      // 00c: sipush 22772
      // 00f: ldc2_w 3111280065040975981
      // 012: lload 4
      // 014: lxor
      // 015: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: nop
      // 01b: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 01e: putstatic jvy.ck5 Z
      // 021: invokestatic OpaquePredicate.b ()I
      // 024: new eka
      // 027: dup
      // 028: aload 0
      // 029: getfield jvy.f41 Lc05;
      // 02c: invokespecial eka.<init> (Lc05;)V
      // 02f: astore 7
      // 031: istore 6
      // 033: getstatic gis.jap Z
      // 036: iload 6
      // 038: ifeq 0a4
      // 03b: ifeq 097
      // 03e: goto 045
      // 041: invokestatic jvy.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: getfield jvy.f41 Lc05;
      // 049: invokevirtual Minecraft.nsd ()Li2h;
      // 04c: instanceof ha9
      // 04f: iload 6
      // 051: ifeq 0a4
      // 054: goto 05b
      // 057: invokestatic jvy.a (Loov;)Loov;
      // 05a: athrow
      // 05b: ifeq 097
      // 05e: goto 065
      // 061: invokestatic jvy.a (Loov;)Loov;
      // 064: athrow
      // 065: getstatic ClientState.cdn Lcn7;
      // 068: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 06b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06e: iload 6
      // 070: ifeq 0a4
      // 073: goto 07a
      // 076: invokestatic jvy.a (Loov;)Loov;
      // 079: athrow
      // 07a: ifne 097
      // 07d: goto 084
      // 080: invokestatic jvy.a (Loov;)Loov;
      // 083: athrow
      // 084: getstatic ClientState.hg9 Lcrk;
      // 087: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 08a: invokevirtual java/lang/Float.floatValue ()F
      // 08d: invokestatic hmp.f43 (F)V
      // 090: goto 097
      // 093: invokestatic jvy.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: invokevirtual jvy.hmu ()V
      // 09b: aload 0
      // 09c: invokevirtual jvy.ads ()V
      // 09f: aload 7
      // 0a1: invokevirtual eka.x05 ()I
      // 0a4: i2f
      // 0a5: fstore 8
      // 0a7: aload 7
      // 0a9: invokevirtual eka.lrx ()I
      // 0ac: i2f
      // 0ad: fstore 9
      // 0af: invokestatic org/lwjgl/input/Mouse.getX ()I
      // 0b2: i2f
      // 0b3: fload 8
      // 0b5: fmul
      // 0b6: aload 0
      // 0b7: getfield jvy.f41 Lc05;
      // 0ba: getfield Minecraft.pfr I
      // 0bd: i2f
      // 0be: fdiv
      // 0bf: ldc 0.5
      // 0c1: nop
      // 0c2: fsub
      // 0c3: fstore 10
      // 0c5: fload 9
      // 0c7: invokestatic org/lwjgl/input/Mouse.getY ()I
      // 0ca: i2f
      // 0cb: fload 9
      // 0cd: fmul
      // 0ce: aload 0
      // 0cf: getfield jvy.f41 Lc05;
      // 0d2: getfield Minecraft.ry7 I
      // 0d5: i2f
      // 0d6: fdiv
      // 0d7: fsub
      // 0d8: ldc 0.5
      // 0da: nop
      // 0db: fsub
      // 0dc: fstore 11
      // 0de: getstatic jsr.kq6 Lcyb;
      // 0e1: ldc "p"
      // 0e3: nop
      // 0e4: fload 10
      // 0e6: ldc 0.6
      // 0e8: nop
      // 0e9: fadd
      // 0ea: fconst_1
      // 0eb: fsub
      // 0ec: fload 11
      // 0ee: ldc 0.3
      // 0f0: nop
      // 0f1: fadd
      // 0f2: ldc -16777216
      // 0f4: nop
      // 0f5: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 0f8: pop
      // 0f9: getstatic jsr.kq6 Lcyb;
      // 0fc: ldc "p"
      // 0fe: nop
      // 0ff: fload 10
      // 101: fconst_1
      // 102: fsub
      // 103: fload 11
      // 105: getstatic GuiHandler.vll Lcn7;
      // 108: invokevirtual BooleanSetting.g7m ()Z
      // 10b: iload 6
      // 10d: ifeq 128
      // 110: ifeq 12b
      // 113: goto 11a
      // 116: invokestatic jvy.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 0
      // 11b: sipush 200
      // 11e: invokevirtual jvy.__a (I)I
      // 121: goto 128
      // 124: invokestatic jvy.a (Loov;)Loov;
      // 127: athrow
      // 128: goto 156
      // 12b: new java/awt/Color
      // 12e: dup
      // 12f: getstatic GuiHandler.fvr Lcrk;
      // 132: invokevirtual NumberSetting.u7t ()D
      // 135: d2f
      // 136: ldc 255.0
      // 138: nop
      // 139: fdiv
      // 13a: getstatic GuiHandler.t3o Lcrk;
      // 13d: invokevirtual NumberSetting.u7t ()D
      // 140: d2f
      // 141: ldc 255.0
      // 143: nop
      // 144: fdiv
      // 145: getstatic GuiHandler.jv9 Lcrk;
      // 148: invokevirtual NumberSetting.u7t ()D
      // 14b: d2f
      // 14c: ldc 255.0
      // 14e: nop
      // 14f: fdiv
      // 150: invokespecial java/awt/Color.<init> (FFF)V
      // 153: invokevirtual java/awt/Color.getRGB ()I
      // 156: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 159: pop
      // 15a: aload 0
      // 15b: iload 1
      // 15c: iload 2
      // 15d: fload 3
      // 15e: invokespecial ShaderHelper.drawScreen (IIF)V
      // 161: return
   }

   @Override
   public void r1_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic org/lwjgl/input/Mouse.isCreated ()Z
      // 07: iload 1
      // 08: ifeq 19
      // 0b: ifne 16
      // 0e: goto 15
      // 11: invokestatic jvy.a (Loov;)Loov;
      // 14: athrow
      // 15: return
      // 16: invokestatic org/lwjgl/input/Mouse.next ()Z
      // 19: ifeq 2b
      // 1c: aload 0
      // 1d: invokevirtual jvy.handleMouseInput ()V
      // 20: iload 1
      // 21: ifne 16
      // 24: goto 2b
      // 27: invokestatic jvy.a (Loov;)Loov;
      // 2a: athrow
      // 2b: return
   }

   public void hmu() {
      this.r4j = (int)rak.u1m((float)Mouse.getX(), 0.0F, (float)Display.getWidth(), 0.0F, (float)mkt.b_f());
      this.n3p = (int)rak.u1m((float)(Display.getHeight() - Mouse.getY()), 0.0F, (float)Display.getHeight(), 0.0F, (float)mkt.e_m());
      this.brz.forEach(this::jjv);
      this.brz.forEach(this::s_j);
   }

   public int __a(int var1) {
      double var2 = Math.ceil((double)(System.currentTimeMillis() + (long)var1) / 10.0);
      double var4;
      return Color.getHSBColor((float)((var4 = var2 % 360.0) / 360.0), 0.35F, 1.0F).getRGB();
   }

   @Override
   public void onGuiClosed() {
      this.brz.forEach(jvy::a25);

      try {
         Mouse.setNativeCursor(null);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      ClientState.qkk.getConfigManager().t0k();
   }

   @Override
   public void initGui() {
      try {
         int var1 = Cursor.getMinCursorSize();
         IntBuffer var2 = BufferUtils.createIntBuffer(var1 * var1);
         Cursor var3 = new Cursor(var1, var1, var1 / 2, var1 / 2, 1, var2, null);
         Mouse.setNativeCursor(var3);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   @Override
   public void handleMouseInput() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: invokestatic org/lwjgl/input/Mouse.getEventDWheel ()I
      // 07: ifeq 24
      // 0a: aload 0
      // 0b: getfield jvy.brz Ljava/util/List;
      // 0e: aload 0
      // 0f: invokedynamic accept (Ljvy;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, jvy.z4l (Lnm6;)V, (Lnm6;)V ]
      // 14: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 19: iload 1
      // 1a: ifeq 39
      // 1d: goto 24
      // 20: invokestatic jvy.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield jvy.brz Ljava/util/List;
      // 28: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, nm6.dz1 ()V, (Lnm6;)V ]
      // 2d: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 32: goto 39
      // 35: invokestatic jvy.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokespecial ShaderHelper.handleMouseInput ()V
      // 3d: return
   }

   public void ads() {
      this.brz.stream().filter(jvy::uky).forEach(this::xz0);
   }

   public void nzl() {
      int var2 = this.brz.stream().sorted(Comparator.comparing(nm6::fs7).reversed()).toArray(jvy::tws)[0].ybp;
      int var10000 = OpaquePredicate.b();
      byte var3 = 10;
      int var4 = 10;
      int var1 = var10000;
      Iterator var5 = this.brz.iterator();

      while (true) {
         if (var5.hasNext()) {
            nm6 var6 = (nm6)var5.next();
            var6.ait = var4;
            var6.po6 = var3;
            var4 += var6.oe7 + 5;

            try {
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         this.brz.forEach(nm6::met);
         break;
      }
   }

   private void fwo() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jvy.a J
      // 003: ldc2_w 56741245734063
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield jvy.brz Ljava/util/List;
      // 00c: invokeinterface java/util/List.clear ()V 1
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: invokestatic _aj.values ()[L_aj;
      // 017: astore 4
      // 019: istore 3
      // 01a: aload 4
      // 01c: arraylength
      // 01d: istore 5
      // 01f: bipush 0
      // 020: istore 6
      // 022: iload 6
      // 024: iload 5
      // 026: if_icmpge 319
      // 029: aload 4
      // 02b: iload 6
      // 02d: aaload
      // 02e: astore 7
      // 030: aload 7
      // 032: getstatic _aj.il8 L_aj;
      // 035: if_acmpne 03b
      // 038: goto 312
      // 03b: new nm6
      // 03e: dup
      // 03f: aload 7
      // 041: invokevirtual _aj.name ()Ljava/lang/String;
      // 044: bipush 0
      // 045: bipush 0
      // 046: invokespecial nm6.<init> (Ljava/lang/String;II)V
      // 049: astore 8
      // 04b: aload 8
      // 04d: getfield nm6.yys Ljava/util/List;
      // 050: new b_l
      // 053: dup
      // 054: aload 8
      // 056: bipush 0
      // 057: bipush 0
      // 058: bipush 3
      // 059: invokespecial b_l.<init> (Lnm6;III)V
      // 05c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 061: pop
      // 062: aconst_null
      // 063: astore 9
      // 065: getstatic ClientState.qkk Lzwr;
      // 068: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 06b: invokevirtual ModuleRegistry.wau ()Ljava/util/ArrayList;
      // 06e: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 071: astore 10
      // 073: aload 10
      // 075: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07a: ifeq 2d9
      // 07d: aload 10
      // 07f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 084: checkcast Module
      // 087: astore 11
      // 089: aload 11
      // 08b: iload 3
      // 08c: ifeq 0c7
      // 08f: invokevirtual Module.oxx ()L_aj;
      // 092: aload 7
      // 094: iload 3
      // 095: ifeq 035
      // 098: goto 09f
      // 09b: invokestatic jvy.a (Loov;)Loov;
      // 09e: athrow
      // 09f: if_acmpeq 0a5
      // 0a2: goto 073
      // 0a5: aload 8
      // 0a7: getfield nm6.yys Ljava/util/List;
      // 0aa: new _nc
      // 0ad: dup
      // 0ae: aload 8
      // 0b0: bipush 0
      // 0b1: bipush 0
      // 0b2: aload 11
      // 0b4: invokevirtual Module.m2d ()Ljava/lang/String;
      // 0b7: ldc ""
      // 0b9: nop
      // 0ba: aload 11
      // 0bc: invokespecial _nc.<init> (Lnm6;IILjava/lang/String;Ljava/lang/String;Lar7;)V
      // 0bf: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c4: pop
      // 0c5: aload 11
      // 0c7: invokevirtual Module.m2d ()Ljava/lang/String;
      // 0ca: invokestatic SettingRegistry.faw (Ljava/lang/String;)Ljava/util/List;
      // 0cd: invokeinterface java/util/List.isEmpty ()Z 1
      // 0d2: ifeq 0dc
      // 0d5: goto 073
      // 0d8: invokestatic jvy.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: new tne
      // 0df: dup
      // 0e0: aload 8
      // 0e2: bipush 0
      // 0e3: bipush 0
      // 0e4: new java/lang/StringBuilder
      // 0e7: dup
      // 0e8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0eb: aload 11
      // 0ed: invokevirtual Module.m2d ()Ljava/lang/String;
      // 0f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f3: sipush 25138
      // 0f6: ldc2_w 8137993081127824689
      // 0f9: lload 1
      // 0fa: lxor
      // 0fb: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: nop
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 107: invokespecial tne.<init> (Lnm6;IILjava/lang/String;)V
      // 10a: astore 12
      // 10c: aload 12
      // 10e: new java/lang/StringBuilder
      // 111: dup
      // 112: invokespecial java/lang/StringBuilder.<init> ()V
      // 115: aload 11
      // 117: invokevirtual Module.m2d ()Ljava/lang/String;
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: sipush 14906
      // 120: ldc2_w 5233801785950385471
      // 123: lload 1
      // 124: lxor
      // 125: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: nop
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 131: putfield tne.q4d Ljava/lang/String;
      // 134: aload 12
      // 136: astore 9
      // 138: aload 8
      // 13a: getfield nm6.yys Ljava/util/List;
      // 13d: aload 12
      // 13f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 144: pop
      // 145: aload 8
      // 147: invokevirtual nm6.met ()V
      // 14a: aload 11
      // 14c: invokevirtual Module.m2d ()Ljava/lang/String;
      // 14f: invokestatic SettingRegistry.faw (Ljava/lang/String;)Ljava/util/List;
      // 152: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 157: astore 13
      // 159: aload 13
      // 15b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 160: ifeq 1e3
      // 163: aload 13
      // 165: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16a: checkcast Setting
      // 16d: astore 14
      // 16f: aload 14
      // 171: instanceof ModeSetting
      // 174: iload 3
      // 175: ifeq 1f9
      // 178: ifeq 1df
      // 17b: goto 182
      // 17e: invokestatic jvy.a (Loov;)Loov;
      // 181: athrow
      // 182: new k35
      // 185: dup
      // 186: aload 8
      // 188: bipush 0
      // 189: bipush 0
      // 18a: aload 14
      // 18c: checkcast ModeSetting
      // 18f: invokevirtual ModeSetting.o7h ()Ljava/lang/String;
      // 192: invokespecial k35.<init> (Lnm6;IILjava/lang/String;)V
      // 195: astore 15
      // 197: aload 12
      // 199: aload 15
      // 19b: invokevirtual tne.csc (Lak9;)V
      // 19e: new oso
      // 1a1: dup
      // 1a2: aload 14
      // 1a4: checkcast ModeSetting
      // 1a7: aload 8
      // 1a9: bipush 0
      // 1aa: bipush 0
      // 1ab: invokespecial oso.<init> (Lc_3;Lnm6;II)V
      // 1ae: astore 16
      // 1b0: aload 16
      // 1b2: new java/lang/StringBuilder
      // 1b5: dup
      // 1b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b9: aload 11
      // 1bb: invokevirtual Module.m2d ()Ljava/lang/String;
      // 1be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c1: sipush 31337
      // 1c4: ldc2_w 2630516876572783977
      // 1c7: lload 1
      // 1c8: lxor
      // 1c9: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: nop
      // 1cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d5: putfield oso.q4d Ljava/lang/String;
      // 1d8: aload 12
      // 1da: aload 16
      // 1dc: invokevirtual tne.csc (Lak9;)V
      // 1df: iload 3
      // 1e0: ifne 159
      // 1e3: aload 11
      // 1e5: invokevirtual Module.m2d ()Ljava/lang/String;
      // 1e8: invokestatic SettingRegistry.faw (Ljava/lang/String;)Ljava/util/List;
      // 1eb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1f0: astore 13
      // 1f2: aload 13
      // 1f4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f9: ifeq 2d0
      // 1fc: aload 13
      // 1fe: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 203: checkcast Setting
      // 206: astore 14
      // 208: aload 14
      // 20a: instanceof NumberSetting
      // 20d: iload 3
      // 20e: ifeq 07a
      // 211: iload 3
      // 212: ifeq 284
      // 215: ifeq 26d
      // 218: goto 21f
      // 21b: invokestatic jvy.a (Loov;)Loov;
      // 21e: athrow
      // 21f: aload 14
      // 221: checkcast NumberSetting
      // 224: astore 15
      // 226: new w4k
      // 229: dup
      // 22a: aload 15
      // 22c: aload 8
      // 22e: bipush 0
      // 22f: bipush 0
      // 230: aload 15
      // 232: invokevirtual NumberSetting.o7h ()Ljava/lang/String;
      // 235: invokespecial w4k.<init> (Lcrk;Lnm6;IILjava/lang/String;)V
      // 238: astore 16
      // 23a: aload 16
      // 23c: new java/lang/StringBuilder
      // 23f: dup
      // 240: invokespecial java/lang/StringBuilder.<init> ()V
      // 243: aload 11
      // 245: invokevirtual Module.m2d ()Ljava/lang/String;
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: sipush 31337
      // 24e: ldc2_w 2630516876572783977
      // 251: lload 1
      // 252: lxor
      // 253: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: nop
      // 259: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25f: putfield w4k.q4d Ljava/lang/String;
      // 262: aload 12
      // 264: aload 16
      // 266: invokevirtual tne.csc (Lak9;)V
      // 269: iload 3
      // 26a: ifne 2cc
      // 26d: aload 14
      // 26f: iload 3
      // 270: ifeq 289
      // 273: goto 27a
      // 276: invokestatic jvy.a (Loov;)Loov;
      // 279: athrow
      // 27a: instanceof BooleanSetting
      // 27d: goto 284
      // 280: invokestatic jvy.a (Loov;)Loov;
      // 283: athrow
      // 284: ifeq 2cc
      // 287: aload 14
      // 289: checkcast BooleanSetting
      // 28c: astore 15
      // 28e: new yy6
      // 291: dup
      // 292: aload 15
      // 294: aload 8
      // 296: bipush 0
      // 297: bipush 0
      // 298: invokespecial yy6.<init> (Lcn7;Lnm6;II)V
      // 29b: astore 16
      // 29d: aload 16
      // 29f: new java/lang/StringBuilder
      // 2a2: dup
      // 2a3: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a6: aload 11
      // 2a8: invokevirtual Module.m2d ()Ljava/lang/String;
      // 2ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ae: sipush 31337
      // 2b1: ldc2_w 2630516876572783977
      // 2b4: lload 1
      // 2b5: lxor
      // 2b6: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: nop
      // 2bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c2: putfield yy6.q4d Ljava/lang/String;
      // 2c5: aload 12
      // 2c7: aload 16
      // 2c9: invokevirtual tne.csc (Lak9;)V
      // 2cc: iload 3
      // 2cd: ifne 1f2
      // 2d0: aload 12
      // 2d2: invokevirtual tne.kzo ()V
      // 2d5: iload 3
      // 2d6: ifne 073
      // 2d9: aload 9
      // 2db: iload 3
      // 2dc: ifeq 2f8
      // 2df: ifnull 2fb
      // 2e2: goto 2e9
      // 2e5: invokestatic jvy.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: aload 9
      // 2eb: bipush 1
      // 2ec: invokevirtual tne._0w (Z)V
      // 2ef: aload 9
      // 2f1: goto 2f8
      // 2f4: invokestatic jvy.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: invokevirtual tne.kzo ()V
      // 2fb: aload 8
      // 2fd: bipush 1
      // 2fe: putfield nm6.tru Z
      // 301: aload 8
      // 303: invokevirtual nm6.met ()V
      // 306: aload 0
      // 307: getfield jvy.brz Ljava/util/List;
      // 30a: aload 8
      // 30c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 311: pop
      // 312: iinc 6 1
      // 315: iload 3
      // 316: ifne 022
      // 319: new nm6
      // 31c: dup
      // 31d: sipush 30372
      // 320: ldc2_w 5395571893465807270
      // 323: lload 1
      // 324: lxor
      // 325: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: nop
      // 32b: bipush 5
      // 32c: bipush 5
      // 32d: invokespecial nm6.<init> (Ljava/lang/String;II)V
      // 330: astore 4
      // 332: aload 4
      // 334: getfield nm6.yys Ljava/util/List;
      // 337: new u_s
      // 33a: dup
      // 33b: aload 4
      // 33d: bipush 0
      // 33e: bipush 0
      // 33f: invokespecial u_s.<init> (Lnm6;II)V
      // 342: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 347: pop
      // 348: aload 4
      // 34a: bipush 1
      // 34b: putfield nm6.tru Z
      // 34e: aload 4
      // 350: invokevirtual nm6.met ()V
      // 353: aload 0
      // 354: getfield jvy.brz Ljava/util/List;
      // 357: aload 4
      // 359: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 35e: pop
      // 35f: new nm6
      // 362: dup
      // 363: sipush 9363
      // 366: ldc2_w 2724706248748051348
      // 369: lload 1
      // 36a: lxor
      // 36b: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: nop
      // 371: bipush 5
      // 372: bipush 5
      // 373: invokespecial nm6.<init> (Ljava/lang/String;II)V
      // 376: astore 5
      // 378: sipush 11823
      // 37b: ldc2_w 6002438155500364073
      // 37e: lload 1
      // 37f: lxor
      // 380: invokedynamic n (IJ)Ljava/lang/String; bsm=jvy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: nop
      // 386: invokestatic SettingRegistry.faw (Ljava/lang/String;)Ljava/util/List;
      // 389: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 38e: astore 6
      // 390: aload 6
      // 392: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 397: ifeq 47b
      // 39a: aload 6
      // 39c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3a1: checkcast Setting
      // 3a4: astore 7
      // 3a6: aload 7
      // 3a8: instanceof NumberSetting
      // 3ab: iload 3
      // 3ac: ifeq 491
      // 3af: iload 3
      // 3b0: ifeq 3f1
      // 3b3: goto 3ba
      // 3b6: invokestatic jvy.a (Loov;)Loov;
      // 3b9: athrow
      // 3ba: ifeq 3ec
      // 3bd: goto 3c4
      // 3c0: invokestatic jvy.a (Loov;)Loov;
      // 3c3: athrow
      // 3c4: aload 5
      // 3c6: getfield nm6.yys Ljava/util/List;
      // 3c9: new w4k
      // 3cc: dup
      // 3cd: aload 7
      // 3cf: checkcast NumberSetting
      // 3d2: aload 5
      // 3d4: bipush -5
      // 3d6: bipush 0
      // 3d7: aload 7
      // 3d9: invokevirtual Setting.o7h ()Ljava/lang/String;
      // 3dc: invokespecial w4k.<init> (Lcrk;Lnm6;IILjava/lang/String;)V
      // 3df: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3e4: pop
      // 3e5: goto 3ec
      // 3e8: invokestatic jvy.a (Loov;)Loov;
      // 3eb: athrow
      // 3ec: aload 7
      // 3ee: instanceof BooleanSetting
      // 3f1: iload 3
      // 3f2: ifeq 429
      // 3f5: ifeq 424
      // 3f8: goto 3ff
      // 3fb: invokestatic jvy.a (Loov;)Loov;
      // 3fe: athrow
      // 3ff: aload 5
      // 401: getfield nm6.yys Ljava/util/List;
      // 404: new yy6
      // 407: dup
      // 408: aload 7
      // 40a: checkcast BooleanSetting
      // 40d: aload 5
      // 40f: bipush -5
      // 411: bipush 0
      // 412: bipush -3
      // 414: invokespecial yy6.<init> (Lcn7;Lnm6;III)V
      // 417: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 41c: pop
      // 41d: goto 424
      // 420: invokestatic jvy.a (Loov;)Loov;
      // 423: athrow
      // 424: aload 7
      // 426: instanceof ModeSetting
      // 429: iload 3
      // 42a: ifeq 476
      // 42d: ifeq 477
      // 430: goto 437
      // 433: invokestatic jvy.a (Loov;)Loov;
      // 436: athrow
      // 437: aload 5
      // 439: getfield nm6.yys Ljava/util/List;
      // 43c: new og6
      // 43f: dup
      // 440: aload 5
      // 442: bipush 0
      // 443: bipush 0
      // 444: aload 7
      // 446: invokevirtual Setting.o7h ()Ljava/lang/String;
      // 449: invokespecial og6.<init> (Lnm6;IILjava/lang/String;)V
      // 44c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 451: pop
      // 452: aload 5
      // 454: getfield nm6.yys Ljava/util/List;
      // 457: new oso
      // 45a: dup
      // 45b: aload 7
      // 45d: checkcast ModeSetting
      // 460: aload 5
      // 462: bipush -5
      // 464: bipush 0
      // 465: bipush -3
      // 467: invokespecial oso.<init> (Lc_3;Lnm6;III)V
      // 46a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 46f: goto 476
      // 472: invokestatic jvy.a (Loov;)Loov;
      // 475: athrow
      // 476: pop
      // 477: iload 3
      // 478: ifne 390
      // 47b: aload 5
      // 47d: bipush 1
      // 47e: putfield nm6.tru Z
      // 481: aload 5
      // 483: invokevirtual nm6.met ()V
      // 486: aload 0
      // 487: getfield jvy.brz Ljava/util/List;
      // 48a: aload 5
      // 48c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 491: pop
      // 492: aload 0
      // 493: invokevirtual jvy.nzl ()V
      // 496: return
   }

   public void ia8(String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield jvy.brz Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 4
      // 0f: aload 4
      // 11: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16: ifeq 92
      // 19: aload 4
      // 1b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 20: checkcast nm6
      // 23: astore 5
      // 25: aload 5
      // 27: getfield nm6.yys Ljava/util/List;
      // 2a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 6
      // 31: aload 6
      // 33: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 38: ifeq 89
      // 3b: aload 6
      // 3d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 42: checkcast ak9
      // 45: astore 7
      // 47: aload 7
      // 49: getfield ak9.q4d Ljava/lang/String;
      // 4c: aload 1
      // 4d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 50: iload 3
      // 51: ifeq 16
      // 54: iload 3
      // 55: ifeq 79
      // 58: ifeq 85
      // 5b: goto 62
      // 5e: invokestatic jvy.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 7
      // 64: iload 3
      // 65: ifeq 7e
      // 68: goto 6f
      // 6b: invokestatic jvy.a (Loov;)Loov;
      // 6e: athrow
      // 6f: instanceof tne
      // 72: goto 79
      // 75: invokestatic jvy.a (Loov;)Loov;
      // 78: athrow
      // 79: ifeq 85
      // 7c: aload 7
      // 7e: checkcast tne
      // 81: iload 2
      // 82: invokevirtual tne.g2y (Z)V
      // 85: iload 3
      // 86: ifne 31
      // 89: aload 5
      // 8b: invokevirtual nm6.met ()V
      // 8e: iload 3
      // 8f: ifne 0f
      // 92: return
   }

   public boolean k7u(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield jvy.brz Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq a0
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast nm6
      // 20: astore 4
      // 22: aload 4
      // 24: getfield nm6.yys Ljava/util/List;
      // 27: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2c: astore 5
      // 2e: aload 5
      // 30: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 35: ifeq 9c
      // 38: aload 5
      // 3a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3f: checkcast ak9
      // 42: astore 6
      // 44: aload 6
      // 46: getfield ak9.q4d Ljava/lang/String;
      // 49: aload 1
      // 4a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4d: iload 2
      // 4e: ifne 14
      // 51: iload 2
      // 52: ifne 6b
      // 55: ifeq 98
      // 58: goto 5f
      // 5b: invokestatic jvy.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 6
      // 61: instanceof tne
      // 64: goto 6b
      // 67: invokestatic jvy.a (Loov;)Loov;
      // 6a: athrow
      // 6b: iload 2
      // 6c: ifne 88
      // 6f: ifeq 98
      // 72: goto 79
      // 75: invokestatic jvy.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 6
      // 7b: checkcast tne
      // 7e: invokevirtual tne.z2s ()Z
      // 81: goto 88
      // 84: invokestatic jvy.a (Loov;)Loov;
      // 87: athrow
      // 88: iload 2
      // 89: ifne 97
      // 8c: ifeq 98
      // 8f: goto 96
      // 92: invokestatic jvy.a (Loov;)Loov;
      // 95: athrow
      // 96: bipush 1
      // 97: ireturn
      // 98: iload 2
      // 99: ifeq 2e
      // 9c: iload 2
      // 9d: ifeq 0e
      // a0: bipush 0
      // a1: ireturn
   }

   @Override
   public boolean a99() {
      return false;
   }

   private static nm6[] tws(int var0) {
      return new nm6[var0];
   }

   private void xz0(nm6 var1) {
      var1.mm6(this.r4j, this.n3p);
   }

   private static boolean uky(nm6 var0) {
      return var0.tru;
   }

   private void z4l(nm6 var1) {
      var1.bxr(this.r4j, this.n3p, Mouse.isButtonDown(0));
   }

   private static void a25(nm6 var0) {
      var0.esm._ka();
   }

   private void s_j(nm6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield jvy.r4j I
      // 09: aload 0
      // 0a: getfield jvy.n3p I
      // 0d: bipush 0
      // 0e: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 11: iload 2
      // 12: ifeq 39
      // 15: ifne 38
      // 18: goto 1f
      // 1b: invokestatic jvy.a (Loov;)Loov;
      // 1e: athrow
      // 1f: bipush 1
      // 20: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 23: iload 2
      // 24: ifeq 39
      // 27: goto 2e
      // 2a: invokestatic jvy.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifeq 3c
      // 31: goto 38
      // 34: invokestatic jvy.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: invokevirtual nm6.vsr (IIZ)V
      // 40: return
   }

   private void jjv(nm6 var1) {
      var1.c7j(this.r4j, this.n3p);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5579119146623992947L, 7079777328650230075L, MethodHandles.lookup().lookupClass()).a(157985846737316L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130286765436571L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "þÕ]ó\u009a/\u000f©k\u000fU¤¶`SÌ\u0010í\r'¾XÌ0\tQ\u001b\u0004\u0004\u0096=M@\u0010¯Õ§\u0091\u008fm\u001f\u0094&÷$fzh¶\u0011\u0018?`â\u009dPuHT\u0011:f\u0085ÀN\u008b\t´\u0001\bßY5\u009eï\u0010ò\u001f\u0084±:c¯¼Þª^ÕK\u0089âÀ";
      int var8 = "þÕ]ó\u009a/\u000f©k\u000fU¤¶`SÌ\u0010í\r'¾XÌ0\tQ\u001b\u0004\u0004\u0096=M@\u0010¯Õ§\u0091\u008fm\u001f\u0094&÷$fzh¶\u0011\u0018?`â\u009dPuHT\u0011:f\u0085ÀN\u008b\t´\u0001\bßY5\u009eï\u0010ò\u001f\u0084±:c¯¼Þª^ÕK\u0089âÀ"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     g = new String[7];
                     s15 = 80;
                     ypj = 80;
                     nwy = 12;
                     cec = 13;
                     ynu = 1;
                     dbl = 100;
                     rz5 = 330;
                     ogc = new Color(24, 24, 24, 220).getRGB();
                     cnm = new Color(171, 71, 188).getRGB();
                     hb0 = new Color(175, 174, 175, 220).getRGB();
                     seg = new Color(255, 255, 255, 220).getRGB();
                     ts6 = new Color(29, 160, 255).getRGB();
                     xll = new Color(175, 174, 175, 220).getRGB();
                     ck5 = false;
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "ã\u009aIT!\t°Þ\u001aIã\nÐLÕ\u0007\u0018\u00887e³\u0001\u009d¾\u00930\u009fI\u0092\u0095!\u0006T!}+\u0010ñKÆ\u0080";
                  var8 = "ã\u009aIT!\t°Þ\u001aIã\nÐLÕ\u0007\u0018\u00887e³\u0001\u009d¾\u00930\u009fI\u0092\u0095!\u0006T!}+\u0010ñKÆ\u0080".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28841;
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
            throw new RuntimeException("jvy", var10);
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
         throw new RuntimeException("jvy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
