import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.reflect.Reflector;
import net.optifine.render.RenderEnv;
import net.optifine.shaders.Shaders;

public class g_x {
   private static float e_6;
   private static boolean m2j;
   private static final w51[] ehb;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public g_x() {
      int var1 = t9d.c();
      super();
      boolean var10000 = Reflector.ForgeModContainer_forgeLightPipelineEnabled.exists();
      if (var1 == 0) {
         try {
            if (var10000) {
               Reflector.setFieldValue(Reflector.ForgeModContainer_forgeLightPipelineEnabled, false);
            }
         } catch (oov var2) {
            throw a(var2);
         }
      }
   }

   public boolean o1d(m5n var1, dbw var2, zfz var3, mew var4, q3g var5) {
      e0x var6 = var3.r_y();
      var6.c7i(var1, var4);
      return this.mh1(var1, var2, var3, var4, var5, true);
   }

   public boolean mh1(m5n param1, dbw param2, zfz param3, mew param4, q3g param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g_x.a J
      // 003: ldc2_w 119667335467728
      // 006: lxor
      // 007: lstore 7
      // 009: invokestatic t9d.c ()I
      // 00c: istore 9
      // 00e: invokestatic c05.mtz ()Z
      // 011: iload 9
      // 013: ifne 030
      // 016: ifeq 05f
      // 019: goto 020
      // 01c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 3
      // 021: invokeinterface zfz.r_y ()Le0x; 1
      // 026: invokevirtual e0x.ppt ()I
      // 029: goto 030
      // 02c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: iload 9
      // 032: ifne 04c
      // 035: ifne 05f
      // 038: goto 03f
      // 03b: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: aload 2
      // 040: invokeinterface dbw.abn ()Z 1
      // 045: goto 04c
      // 048: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: iload 9
      // 04e: ifne 05c
      // 051: ifeq 05f
      // 054: goto 05b
      // 057: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: bipush 1
      // 05c: goto 060
      // 05f: bipush 0
      // 060: istore 10
      // 062: invokestatic hxt.ly3 ()Z
      // 065: ifeq 078
      // 068: aload 3
      // 069: aload 4
      // 06b: aload 1
      // 06c: aload 5
      // 06e: invokestatic net/optifine/shaders/SVertexBuilder.pushEntity (Lzfz;Lmew;Lm5n;Lq3g;)V
      // 071: goto 078
      // 074: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 5
      // 07a: aload 3
      // 07b: aload 4
      // 07d: invokevirtual q3g.xgm (Lzfz;Lmew;)Lnet/optifine/render/RenderEnv;
      // 080: astore 11
      // 082: aload 2
      // 083: aload 3
      // 084: aload 11
      // 086: invokestatic net/optifine/model/BlockModelCustomizer.getRenderModel (Ldbw;Lzfz;Lnet/optifine/render/RenderEnv;)Ldbw;
      // 089: astore 2
      // 08a: iload 10
      // 08c: iload 9
      // 08e: ifne 0af
      // 091: ifeq 0b2
      // 094: goto 09b
      // 097: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 1
      // 09d: aload 2
      // 09e: aload 3
      // 09f: aload 4
      // 0a1: aload 5
      // 0a3: iload 6
      // 0a5: invokespecial g_x.wy6 (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 0a8: goto 0af
      // 0ab: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: goto 0bf
      // 0b2: aload 0
      // 0b3: aload 1
      // 0b4: aload 2
      // 0b5: aload 3
      // 0b6: aload 4
      // 0b8: aload 5
      // 0ba: iload 6
      // 0bc: invokevirtual g_x.utf (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 0bf: istore 12
      // 0c1: iload 12
      // 0c3: iload 9
      // 0c5: ifne 0ee
      // 0c8: ifeq 0eb
      // 0cb: goto 0d2
      // 0ce: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: aload 1
      // 0d4: aload 2
      // 0d5: aload 3
      // 0d6: aload 4
      // 0d8: aload 5
      // 0da: iload 6
      // 0dc: lconst_0
      // 0dd: aload 11
      // 0df: iload 10
      // 0e1: invokespecial g_x.l2u (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;ZJLnet/optifine/render/RenderEnv;Z)V
      // 0e4: goto 0eb
      // 0e7: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: invokestatic hxt.ly3 ()Z
      // 0ee: iload 9
      // 0f0: ifne 10b
      // 0f3: ifeq 109
      // 0f6: goto 0fd
      // 0f9: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 5
      // 0ff: invokestatic net/optifine/shaders/SVertexBuilder.popEntity (Lq3g;)V
      // 102: goto 109
      // 105: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 108: athrow
      // 109: iload 12
      // 10b: ireturn
      // 10c: astore 11
      // 10e: aload 11
      // 110: sipush 25689
      // 113: ldc2_w 326431363508910972
      // 116: lload 7
      // 118: lxor
      // 119: invokedynamic o (IJ)Ljava/lang/String; bsm=g_x.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: nop
      // 11f: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 122: astore 12
      // 124: aload 12
      // 126: sipush 13051
      // 129: ldc2_w 5780021140771728863
      // 12c: lload 7
      // 12e: lxor
      // 12f: invokedynamic o (IJ)Ljava/lang/String; bsm=g_x.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: nop
      // 135: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 138: astore 13
      // 13a: aload 13
      // 13c: aload 4
      // 13e: aload 3
      // 13f: invokestatic wsc.uxq (Lwsc;Lmew;Lzfz;)V
      // 142: aload 13
      // 144: sipush 26297
      // 147: ldc2_w 8009791647490455967
      // 14a: lload 7
      // 14c: lxor
      // 14d: invokedynamic o (IJ)Ljava/lang/String; bsm=g_x.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: nop
      // 153: iload 10
      // 155: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 158: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 15b: new oov
      // 15e: dup
      // 15f: aload 12
      // 161: invokespecial oov.<init> (Le1i;)V
      // 164: athrow
   }

   public boolean _4b(m5n var1, dbw var2, e0x var3, mew var4, q3g var5, boolean var6) {
      zfz var7 = var1.getBlockState(var4);
      return this.wy6(var1, var2, var7, var4, var5, var6);
   }

   private boolean wy6(m5n param1, dbw param2, zfz param3, mew param4, q3g param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 8
      // 003: aload 3
      // 004: invokeinterface zfz.r_y ()Le0x; 1
      // 009: astore 9
      // 00b: aload 5
      // 00d: aload 3
      // 00e: aload 4
      // 010: invokevirtual q3g.xgm (Lzfz;Lmew;)Lnet/optifine/render/RenderEnv;
      // 013: astore 10
      // 015: invokestatic t9d.b ()I
      // 018: aload 5
      // 01a: invokevirtual q3g.o9k ()Lw51;
      // 01d: astore 11
      // 01f: getstatic vt2.vbu [Lvt2;
      // 022: astore 12
      // 024: istore 7
      // 026: aload 12
      // 028: arraylength
      // 029: istore 13
      // 02b: bipush 0
      // 02c: istore 14
      // 02e: iload 14
      // 030: iload 13
      // 032: if_icmpge 0cd
      // 035: aload 12
      // 037: iload 14
      // 039: aaload
      // 03a: astore 15
      // 03c: aload 2
      // 03d: aload 15
      // 03f: invokeinterface dbw.ebu (Lvt2;)Ljava/util/List; 2
      // 044: astore 16
      // 046: iload 7
      // 048: ifeq 0c8
      // 04b: aload 16
      // 04d: iload 7
      // 04f: ifeq 0d3
      // 052: goto 059
      // 055: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: invokeinterface java/util/List.isEmpty ()Z 1
      // 05e: ifne 0c5
      // 061: goto 068
      // 064: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: aload 4
      // 06a: aload 15
      // 06c: invokevirtual mew.offset (Lvt2;)Lmew;
      // 06f: astore 17
      // 071: iload 6
      // 073: iload 7
      // 075: ifeq 0c3
      // 078: ifeq 0a2
      // 07b: goto 082
      // 07e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: aload 9
      // 084: aload 1
      // 085: aload 17
      // 087: aload 15
      // 089: invokevirtual e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 08c: iload 7
      // 08e: ifeq 0c3
      // 091: goto 098
      // 094: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: ifeq 0c5
      // 09b: goto 0a2
      // 09e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 16
      // 0a4: aload 1
      // 0a5: aload 3
      // 0a6: aload 4
      // 0a8: aload 15
      // 0aa: aload 11
      // 0ac: lconst_0
      // 0ad: aload 10
      // 0af: invokestatic net/optifine/model/BlockModelCustomizer.getRenderQuads (Ljava/util/List;Lm5n;Lzfz;Lmew;Lvt2;Lw51;JLnet/optifine/render/RenderEnv;)Ljava/util/List;
      // 0b2: astore 16
      // 0b4: aload 0
      // 0b5: aload 1
      // 0b6: aload 3
      // 0b7: aload 4
      // 0b9: aload 5
      // 0bb: aload 16
      // 0bd: aload 10
      // 0bf: invokespecial g_x.b3_ (Lm5n;Lzfz;Lmew;Lq3g;Ljava/util/List;Lnet/optifine/render/RenderEnv;)V
      // 0c2: bipush 1
      // 0c3: istore 8
      // 0c5: iinc 14 1
      // 0c8: iload 7
      // 0ca: ifne 02e
      // 0cd: aload 2
      // 0ce: invokeinterface dbw.in9 ()Ljava/util/List; 1
      // 0d3: astore 12
      // 0d5: aload 12
      // 0d7: invokeinterface java/util/List.size ()I 1
      // 0dc: iload 7
      // 0de: ifeq 112
      // 0e1: ifle 110
      // 0e4: goto 0eb
      // 0e7: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: aload 12
      // 0ed: aload 1
      // 0ee: aload 3
      // 0ef: aload 4
      // 0f1: aconst_null
      // 0f2: checkcast vt2
      // 0f5: aload 11
      // 0f7: lconst_0
      // 0f8: aload 10
      // 0fa: invokestatic net/optifine/model/BlockModelCustomizer.getRenderQuads (Ljava/util/List;Lm5n;Lzfz;Lmew;Lvt2;Lw51;JLnet/optifine/render/RenderEnv;)Ljava/util/List;
      // 0fd: astore 12
      // 0ff: aload 0
      // 100: aload 1
      // 101: aload 3
      // 102: aload 4
      // 104: aload 5
      // 106: aload 12
      // 108: aload 10
      // 10a: invokespecial g_x.b3_ (Lm5n;Lzfz;Lmew;Lq3g;Ljava/util/List;Lnet/optifine/render/RenderEnv;)V
      // 10d: bipush 1
      // 10e: istore 8
      // 110: iload 8
      // 112: ireturn
   }

   public boolean lxw(m5n var1, dbw var2, e0x var3, mew var4, q3g var5, boolean var6) {
      zfz var7 = var1.getBlockState(var4);
      return this.utf(var1, var2, var7, var4, var5, var6);
   }

   public boolean utf(m5n param1, dbw param2, zfz param3, mew param4, q3g param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 8
      // 003: invokestatic t9d.c ()I
      // 006: aload 3
      // 007: invokeinterface zfz.r_y ()Le0x; 1
      // 00c: astore 9
      // 00e: istore 7
      // 010: aload 5
      // 012: aload 3
      // 013: aload 4
      // 015: invokevirtual q3g.xgm (Lzfz;Lmew;)Lnet/optifine/render/RenderEnv;
      // 018: astore 10
      // 01a: aload 5
      // 01c: invokevirtual q3g.o9k ()Lw51;
      // 01f: astore 11
      // 021: getstatic vt2.vbu [Lvt2;
      // 024: astore 12
      // 026: aload 12
      // 028: arraylength
      // 029: istore 13
      // 02b: bipush 0
      // 02c: istore 14
      // 02e: iload 14
      // 030: iload 13
      // 032: if_icmpge 0e3
      // 035: aload 12
      // 037: iload 14
      // 039: aaload
      // 03a: astore 15
      // 03c: aload 2
      // 03d: aload 15
      // 03f: invokeinterface dbw.ebu (Lvt2;)Ljava/util/List; 2
      // 044: astore 16
      // 046: iload 7
      // 048: ifne 0de
      // 04b: aload 16
      // 04d: iload 7
      // 04f: ifne 0e9
      // 052: goto 059
      // 055: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: invokeinterface java/util/List.isEmpty ()Z 1
      // 05e: ifne 0db
      // 061: goto 068
      // 064: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 067: athrow
      // 068: aload 4
      // 06a: aload 15
      // 06c: invokevirtual mew.offset (Lvt2;)Lmew;
      // 06f: astore 17
      // 071: iload 6
      // 073: iload 7
      // 075: ifne 0b1
      // 078: ifeq 0a2
      // 07b: goto 082
      // 07e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 081: athrow
      // 082: aload 9
      // 084: aload 1
      // 085: aload 17
      // 087: aload 15
      // 089: invokevirtual e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 08c: iload 7
      // 08e: ifne 0b1
      // 091: goto 098
      // 094: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: ifeq 0db
      // 09b: goto 0a2
      // 09e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: aload 9
      // 0a4: aload 1
      // 0a5: aload 17
      // 0a7: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 0aa: goto 0b1
      // 0ad: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: istore 18
      // 0b3: aload 16
      // 0b5: aload 1
      // 0b6: aload 3
      // 0b7: aload 4
      // 0b9: aload 15
      // 0bb: aload 11
      // 0bd: lconst_0
      // 0be: aload 10
      // 0c0: invokestatic net/optifine/model/BlockModelCustomizer.getRenderQuads (Ljava/util/List;Lm5n;Lzfz;Lmew;Lvt2;Lw51;JLnet/optifine/render/RenderEnv;)Ljava/util/List;
      // 0c3: astore 16
      // 0c5: aload 0
      // 0c6: aload 1
      // 0c7: aload 3
      // 0c8: aload 4
      // 0ca: aload 15
      // 0cc: iload 18
      // 0ce: bipush 0
      // 0cf: aload 5
      // 0d1: aload 16
      // 0d3: aload 10
      // 0d5: invokespecial g_x.h0s (Lm5n;Lzfz;Lmew;Lvt2;IZLq3g;Ljava/util/List;Lnet/optifine/render/RenderEnv;)V
      // 0d8: bipush 1
      // 0d9: istore 8
      // 0db: iinc 14 1
      // 0de: iload 7
      // 0e0: ifeq 02e
      // 0e3: aload 2
      // 0e4: invokeinterface dbw.in9 ()Ljava/util/List; 1
      // 0e9: astore 12
      // 0eb: aload 12
      // 0ed: invokeinterface java/util/List.size ()I 1
      // 0f2: iload 7
      // 0f4: ifne 12e
      // 0f7: ifle 12c
      // 0fa: goto 101
      // 0fd: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: aload 12
      // 103: aload 1
      // 104: aload 3
      // 105: aload 4
      // 107: aconst_null
      // 108: checkcast vt2
      // 10b: aload 11
      // 10d: lconst_0
      // 10e: aload 10
      // 110: invokestatic net/optifine/model/BlockModelCustomizer.getRenderQuads (Ljava/util/List;Lm5n;Lzfz;Lmew;Lvt2;Lw51;JLnet/optifine/render/RenderEnv;)Ljava/util/List;
      // 113: astore 12
      // 115: aload 0
      // 116: aload 1
      // 117: aload 3
      // 118: aload 4
      // 11a: aconst_null
      // 11b: checkcast vt2
      // 11e: bipush -1
      // 11f: bipush 1
      // 120: aload 5
      // 122: aload 12
      // 124: aload 10
      // 126: invokespecial g_x.h0s (Lm5n;Lzfz;Lmew;Lvt2;IZLq3g;Ljava/util/List;Lnet/optifine/render/RenderEnv;)V
      // 129: bipush 1
      // 12a: istore 8
      // 12c: iload 8
      // 12e: ireturn
   }

   private void b3_(m5n param1, zfz param2, mew param3, q3g param4, List param5, RenderEnv param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: invokeinterface zfz.r_y ()Le0x; 1
      // 006: astore 8
      // 008: invokestatic t9d.b ()I
      // 00b: aload 6
      // 00d: invokevirtual net/optifine/render/RenderEnv.getQuadBounds ()[F
      // 010: astore 9
      // 012: aload 6
      // 014: invokevirtual net/optifine/render/RenderEnv.getBoundsFlags ()Ljava/util/BitSet;
      // 017: astore 10
      // 019: aload 6
      // 01b: invokevirtual net/optifine/render/RenderEnv.getAoFace ()Lg_x$ov1;
      // 01e: astore 11
      // 020: aload 3
      // 021: invokevirtual mew.getX ()I
      // 024: i2d
      // 025: dstore 12
      // 027: istore 7
      // 029: aload 3
      // 02a: invokevirtual mew.getY ()I
      // 02d: i2d
      // 02e: dstore 14
      // 030: aload 3
      // 031: invokevirtual mew.getZ ()I
      // 034: i2d
      // 035: dstore 16
      // 037: aload 8
      // 039: invokevirtual e0x.jkr ()Le0x$hep;
      // 03c: astore 18
      // 03e: aload 18
      // 040: getstatic e0x$hep.j0y Le0x$hep;
      // 043: if_acmpeq 0b2
      // 046: aload 3
      // 047: invokestatic fe6.n88 (Lwgo;)J
      // 04a: lstore 19
      // 04c: dload 12
      // 04e: lload 19
      // 050: bipush 16
      // 052: lshr
      // 053: ldc2_w 15
      // 056: land
      // 057: l2f
      // 058: ldc 15.0
      // 05a: nop
      // 05b: fdiv
      // 05c: f2d
      // 05d: ldc2_w 0.5
      // 060: dsub
      // 061: ldc2_w 0.5
      // 064: dmul
      // 065: dadd
      // 066: dstore 12
      // 068: dload 16
      // 06a: lload 19
      // 06c: bipush 24
      // 06e: lshr
      // 06f: ldc2_w 15
      // 072: land
      // 073: l2f
      // 074: ldc 15.0
      // 076: nop
      // 077: fdiv
      // 078: f2d
      // 079: ldc2_w 0.5
      // 07c: dsub
      // 07d: ldc2_w 0.5
      // 080: dmul
      // 081: dadd
      // 082: iload 7
      // 084: ifeq 0b0
      // 087: dstore 16
      // 089: aload 18
      // 08b: getstatic e0x$hep.w9u Le0x$hep;
      // 08e: if_acmpne 0b2
      // 091: dload 14
      // 093: lload 19
      // 095: bipush 20
      // 097: lshr
      // 098: ldc2_w 15
      // 09b: land
      // 09c: l2f
      // 09d: ldc 15.0
      // 09f: nop
      // 0a0: fdiv
      // 0a1: f2d
      // 0a2: dconst_1
      // 0a3: dsub
      // 0a4: ldc2_w 0.2
      // 0a7: dmul
      // 0a8: dadd
      // 0a9: goto 0b0
      // 0ac: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: dstore 14
      // 0b2: aload 5
      // 0b4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b9: astore 19
      // 0bb: aload 19
      // 0bd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c2: ifeq 418
      // 0c5: aload 19
      // 0c7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0cc: checkcast oa4
      // 0cf: astore 20
      // 0d1: aload 0
      // 0d2: aload 8
      // 0d4: aload 20
      // 0d6: invokevirtual oa4.fnb ()[I
      // 0d9: aload 20
      // 0db: invokevirtual oa4.fih ()Lvt2;
      // 0de: aload 9
      // 0e0: aload 10
      // 0e2: invokespecial g_x.jmj (Le0x;[ILvt2;[FLjava/util/BitSet;)V
      // 0e5: aload 11
      // 0e7: aload 1
      // 0e8: aload 8
      // 0ea: aload 3
      // 0eb: aload 20
      // 0ed: invokevirtual oa4.fih ()Lvt2;
      // 0f0: aload 9
      // 0f2: aload 10
      // 0f4: invokevirtual g_x$ov1.bc6 (Lm5n;Le0x;Lmew;Lvt2;[FLjava/util/BitSet;)V
      // 0f7: aload 20
      // 0f9: invokevirtual oa4.enl ()Lsla;
      // 0fc: getfield sla.kr7 Z
      // 0ff: iload 7
      // 101: ifeq 12b
      // 104: ifeq 11a
      // 107: goto 10e
      // 10a: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: aload 11
      // 110: invokevirtual g_x$ov1.j6m ()V
      // 113: goto 11a
      // 116: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 4
      // 11c: iload 7
      // 11e: ifeq 14d
      // 121: invokevirtual q3g.qq_ ()Z
      // 124: goto 12b
      // 127: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: ifeq 144
      // 12e: aload 4
      // 130: aload 20
      // 132: invokevirtual oa4.akn ()[I
      // 135: invokevirtual q3g.sug ([I)V
      // 138: iload 7
      // 13a: ifne 155
      // 13d: goto 144
      // 140: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: aload 4
      // 146: goto 14d
      // 149: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: aload 20
      // 14f: invokevirtual oa4.fnb ()[I
      // 152: invokevirtual q3g.sug ([I)V
      // 155: aload 4
      // 157: aload 20
      // 159: invokevirtual oa4.enl ()Lsla;
      // 15c: invokevirtual q3g.kpp (Lsla;)V
      // 15f: aload 4
      // 161: aload 11
      // 163: invokestatic g_x$ov1.l46 (Lg_x$ov1;)[I
      // 166: bipush 0
      // 167: iaload
      // 168: aload 11
      // 16a: invokestatic g_x$ov1.l46 (Lg_x$ov1;)[I
      // 16d: bipush 1
      // 16e: iaload
      // 16f: aload 11
      // 171: invokestatic g_x$ov1.l46 (Lg_x$ov1;)[I
      // 174: bipush 2
      // 175: iaload
      // 176: aload 11
      // 178: invokestatic g_x$ov1.l46 (Lg_x$ov1;)[I
      // 17b: bipush 3
      // 17c: iaload
      // 17d: invokevirtual q3g.hic (IIII)V
      // 180: aload 20
      // 182: aload 2
      // 183: aload 1
      // 184: aload 3
      // 185: aload 6
      // 187: invokestatic net/optifine/CustomColors.getColorMultiplier (Loa4;Lzfz;Lm5n;Lmew;Lnet/optifine/render/RenderEnv;)I
      // 18a: istore 21
      // 18c: aload 20
      // 18e: invokevirtual oa4.k3w ()Z
      // 191: iload 7
      // 193: ifeq 293
      // 196: ifne 28a
      // 199: goto 1a0
      // 19c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: iload 21
      // 1a2: bipush -1
      // 1a3: iload 7
      // 1a5: ifeq 2a0
      // 1a8: goto 1af
      // 1ab: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: if_icmpne 28a
      // 1b2: goto 1b9
      // 1b5: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: getstatic g_x.m2j Z
      // 1bc: ifeq 212
      // 1bf: goto 1c6
      // 1c2: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: aload 4
      // 1c8: fconst_1
      // 1c9: fconst_1
      // 1ca: fconst_1
      // 1cb: aload 11
      // 1cd: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 1d0: bipush 0
      // 1d1: faload
      // 1d2: bipush 4
      // 1d3: invokevirtual q3g.e9w (FFFFI)V
      // 1d6: aload 4
      // 1d8: fconst_1
      // 1d9: fconst_1
      // 1da: fconst_1
      // 1db: aload 11
      // 1dd: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 1e0: bipush 1
      // 1e1: faload
      // 1e2: bipush 3
      // 1e3: invokevirtual q3g.e9w (FFFFI)V
      // 1e6: aload 4
      // 1e8: fconst_1
      // 1e9: fconst_1
      // 1ea: fconst_1
      // 1eb: aload 11
      // 1ed: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 1f0: bipush 2
      // 1f1: faload
      // 1f2: bipush 2
      // 1f3: invokevirtual q3g.e9w (FFFFI)V
      // 1f6: aload 4
      // 1f8: fconst_1
      // 1f9: fconst_1
      // 1fa: fconst_1
      // 1fb: aload 11
      // 1fd: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 200: bipush 3
      // 201: faload
      // 202: bipush 1
      // 203: invokevirtual q3g.e9w (FFFFI)V
      // 206: iload 7
      // 208: ifne 408
      // 20b: goto 212
      // 20e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 211: athrow
      // 212: aload 4
      // 214: aload 11
      // 216: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 219: bipush 0
      // 21a: faload
      // 21b: aload 11
      // 21d: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 220: bipush 0
      // 221: faload
      // 222: aload 11
      // 224: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 227: bipush 0
      // 228: faload
      // 229: bipush 4
      // 22a: invokevirtual q3g.m95 (FFFI)V
      // 22d: aload 4
      // 22f: aload 11
      // 231: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 234: bipush 1
      // 235: faload
      // 236: aload 11
      // 238: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 23b: bipush 1
      // 23c: faload
      // 23d: aload 11
      // 23f: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 242: bipush 1
      // 243: faload
      // 244: bipush 3
      // 245: invokevirtual q3g.m95 (FFFI)V
      // 248: aload 4
      // 24a: aload 11
      // 24c: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 24f: bipush 2
      // 250: faload
      // 251: aload 11
      // 253: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 256: bipush 2
      // 257: faload
      // 258: aload 11
      // 25a: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 25d: bipush 2
      // 25e: faload
      // 25f: bipush 2
      // 260: invokevirtual q3g.m95 (FFFI)V
      // 263: aload 4
      // 265: aload 11
      // 267: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 26a: bipush 3
      // 26b: faload
      // 26c: aload 11
      // 26e: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 271: bipush 3
      // 272: faload
      // 273: aload 11
      // 275: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 278: bipush 3
      // 279: faload
      // 27a: bipush 1
      // 27b: invokevirtual q3g.m95 (FFFI)V
      // 27e: iload 7
      // 280: ifne 408
      // 283: goto 28a
      // 286: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 289: athrow
      // 28a: iload 21
      // 28c: goto 293
      // 28f: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 292: athrow
      // 293: iload 7
      // 295: ifeq 2bf
      // 298: bipush -1
      // 299: goto 2a0
      // 29c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29f: athrow
      // 2a0: if_icmpeq 2ac
      // 2a3: iload 21
      // 2a5: istore 22
      // 2a7: iload 7
      // 2a9: ifne 2c1
      // 2ac: aload 8
      // 2ae: aload 1
      // 2af: aload 3
      // 2b0: aload 20
      // 2b2: invokevirtual oa4.m4h ()I
      // 2b5: invokevirtual e0x.j24 (Lm5n;Lmew;I)I
      // 2b8: goto 2bf
      // 2bb: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2be: athrow
      // 2bf: istore 22
      // 2c1: getstatic v3i.v0c Z
      // 2c4: iload 7
      // 2c6: ifeq 2e3
      // 2c9: ifeq 2da
      // 2cc: goto 2d3
      // 2cf: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d2: athrow
      // 2d3: iload 22
      // 2d5: invokestatic p9t.t5j (I)I
      // 2d8: istore 22
      // 2da: iload 22
      // 2dc: bipush 16
      // 2de: ishr
      // 2df: sipush 255
      // 2e2: iand
      // 2e3: i2f
      // 2e4: ldc 255.0
      // 2e6: nop
      // 2e7: fdiv
      // 2e8: fstore 23
      // 2ea: iload 22
      // 2ec: bipush 8
      // 2ee: ishr
      // 2ef: sipush 255
      // 2f2: iand
      // 2f3: i2f
      // 2f4: ldc 255.0
      // 2f6: nop
      // 2f7: fdiv
      // 2f8: fstore 24
      // 2fa: iload 22
      // 2fc: sipush 255
      // 2ff: iand
      // 300: i2f
      // 301: ldc 255.0
      // 303: nop
      // 304: fdiv
      // 305: fstore 25
      // 307: iload 7
      // 309: ifeq 3e4
      // 30c: getstatic g_x.m2j Z
      // 30f: ifeq 371
      // 312: goto 319
      // 315: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 318: athrow
      // 319: aload 4
      // 31b: fload 23
      // 31d: fload 24
      // 31f: fload 25
      // 321: aload 11
      // 323: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 326: bipush 0
      // 327: faload
      // 328: bipush 4
      // 329: invokevirtual q3g.e9w (FFFFI)V
      // 32c: aload 4
      // 32e: fload 23
      // 330: fload 24
      // 332: fload 25
      // 334: aload 11
      // 336: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 339: bipush 1
      // 33a: faload
      // 33b: bipush 3
      // 33c: invokevirtual q3g.e9w (FFFFI)V
      // 33f: aload 4
      // 341: fload 23
      // 343: fload 24
      // 345: fload 25
      // 347: aload 11
      // 349: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 34c: bipush 2
      // 34d: faload
      // 34e: bipush 2
      // 34f: invokevirtual q3g.e9w (FFFFI)V
      // 352: aload 4
      // 354: fload 23
      // 356: fload 24
      // 358: fload 25
      // 35a: aload 11
      // 35c: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 35f: bipush 3
      // 360: faload
      // 361: bipush 1
      // 362: invokevirtual q3g.e9w (FFFFI)V
      // 365: iload 7
      // 367: ifne 408
      // 36a: goto 371
      // 36d: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 370: athrow
      // 371: aload 4
      // 373: aload 11
      // 375: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 378: bipush 0
      // 379: faload
      // 37a: fload 23
      // 37c: fmul
      // 37d: aload 11
      // 37f: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 382: bipush 0
      // 383: faload
      // 384: fload 24
      // 386: fmul
      // 387: aload 11
      // 389: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 38c: bipush 0
      // 38d: faload
      // 38e: fload 25
      // 390: fmul
      // 391: bipush 4
      // 392: invokevirtual q3g.m95 (FFFI)V
      // 395: aload 4
      // 397: aload 11
      // 399: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 39c: bipush 1
      // 39d: faload
      // 39e: fload 23
      // 3a0: fmul
      // 3a1: aload 11
      // 3a3: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3a6: bipush 1
      // 3a7: faload
      // 3a8: fload 24
      // 3aa: fmul
      // 3ab: aload 11
      // 3ad: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3b0: bipush 1
      // 3b1: faload
      // 3b2: fload 25
      // 3b4: fmul
      // 3b5: bipush 3
      // 3b6: invokevirtual q3g.m95 (FFFI)V
      // 3b9: aload 4
      // 3bb: aload 11
      // 3bd: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3c0: bipush 2
      // 3c1: faload
      // 3c2: fload 23
      // 3c4: fmul
      // 3c5: aload 11
      // 3c7: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3ca: bipush 2
      // 3cb: faload
      // 3cc: fload 24
      // 3ce: fmul
      // 3cf: aload 11
      // 3d1: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3d4: bipush 2
      // 3d5: faload
      // 3d6: fload 25
      // 3d8: fmul
      // 3d9: bipush 2
      // 3da: invokevirtual q3g.m95 (FFFI)V
      // 3dd: goto 3e4
      // 3e0: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e3: athrow
      // 3e4: aload 4
      // 3e6: aload 11
      // 3e8: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3eb: bipush 3
      // 3ec: faload
      // 3ed: fload 23
      // 3ef: fmul
      // 3f0: aload 11
      // 3f2: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3f5: bipush 3
      // 3f6: faload
      // 3f7: fload 24
      // 3f9: fmul
      // 3fa: aload 11
      // 3fc: invokestatic g_x$ov1.n8x (Lg_x$ov1;)[F
      // 3ff: bipush 3
      // 400: faload
      // 401: fload 25
      // 403: fmul
      // 404: bipush 1
      // 405: invokevirtual q3g.m95 (FFFI)V
      // 408: aload 4
      // 40a: dload 12
      // 40c: dload 14
      // 40e: dload 16
      // 410: invokevirtual q3g.em3 (DDD)V
      // 413: iload 7
      // 415: ifne 0bb
      // 418: return
   }

   private void jmj(e0x param1, int[] param2, vt2 param3, float[] param4, BitSet param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 32.0
      // 002: nop
      // 003: fstore 7
      // 005: ldc 32.0
      // 007: nop
      // 008: fstore 8
      // 00a: ldc 32.0
      // 00c: nop
      // 00d: fstore 9
      // 00f: invokestatic t9d.c ()I
      // 012: ldc -32.0
      // 014: nop
      // 015: fstore 10
      // 017: ldc -32.0
      // 019: nop
      // 01a: fstore 11
      // 01c: ldc -32.0
      // 01e: nop
      // 01f: fstore 12
      // 021: aload 2
      // 022: arraylength
      // 023: bipush 4
      // 024: idiv
      // 025: istore 13
      // 027: istore 6
      // 029: bipush 0
      // 02a: istore 14
      // 02c: iload 14
      // 02e: bipush 4
      // 02f: if_icmpge 0a4
      // 032: aload 2
      // 033: iload 14
      // 035: iload 13
      // 037: imul
      // 038: iaload
      // 039: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 03c: fstore 15
      // 03e: aload 2
      // 03f: iload 14
      // 041: iload 13
      // 043: imul
      // 044: bipush 1
      // 045: iadd
      // 046: iaload
      // 047: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 04a: fstore 16
      // 04c: aload 2
      // 04d: iload 14
      // 04f: iload 13
      // 051: imul
      // 052: bipush 2
      // 053: iadd
      // 054: iaload
      // 055: invokestatic java/lang/Float.intBitsToFloat (I)F
      // 058: fstore 17
      // 05a: fload 7
      // 05c: fload 15
      // 05e: invokestatic java/lang/Math.min (FF)F
      // 061: fstore 7
      // 063: fload 8
      // 065: fload 16
      // 067: invokestatic java/lang/Math.min (FF)F
      // 06a: fstore 8
      // 06c: fload 9
      // 06e: fload 17
      // 070: invokestatic java/lang/Math.min (FF)F
      // 073: fstore 9
      // 075: fload 10
      // 077: fload 15
      // 079: invokestatic java/lang/Math.max (FF)F
      // 07c: fstore 10
      // 07e: fload 11
      // 080: fload 16
      // 082: invokestatic java/lang/Math.max (FF)F
      // 085: fstore 11
      // 087: fload 12
      // 089: fload 17
      // 08b: invokestatic java/lang/Math.max (FF)F
      // 08e: fstore 12
      // 090: iinc 14 1
      // 093: iload 6
      // 095: ifne 15d
      // 098: iload 6
      // 09a: ifeq 02c
      // 09d: goto 0a4
      // 0a0: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a3: athrow
      // 0a4: aload 4
      // 0a6: iload 6
      // 0a8: ifne 14f
      // 0ab: ifnull 15d
      // 0ae: goto 0b5
      // 0b1: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: aload 4
      // 0b7: getstatic vt2.te4 Lvt2;
      // 0ba: invokevirtual vt2.c3s ()I
      // 0bd: fload 7
      // 0bf: fastore
      // 0c0: aload 4
      // 0c2: getstatic vt2.zk4 Lvt2;
      // 0c5: invokevirtual vt2.c3s ()I
      // 0c8: fload 10
      // 0ca: fastore
      // 0cb: aload 4
      // 0cd: getstatic vt2.m3r Lvt2;
      // 0d0: invokevirtual vt2.c3s ()I
      // 0d3: fload 8
      // 0d5: fastore
      // 0d6: aload 4
      // 0d8: getstatic vt2.rf3 Lvt2;
      // 0db: invokevirtual vt2.c3s ()I
      // 0de: fload 11
      // 0e0: fastore
      // 0e1: aload 4
      // 0e3: getstatic vt2.z9q Lvt2;
      // 0e6: invokevirtual vt2.c3s ()I
      // 0e9: fload 9
      // 0eb: fastore
      // 0ec: aload 4
      // 0ee: getstatic vt2.mxp Lvt2;
      // 0f1: invokevirtual vt2.c3s ()I
      // 0f4: fload 12
      // 0f6: fastore
      // 0f7: getstatic vt2.vbu [Lvt2;
      // 0fa: arraylength
      // 0fb: istore 14
      // 0fd: aload 4
      // 0ff: getstatic vt2.te4 Lvt2;
      // 102: invokevirtual vt2.c3s ()I
      // 105: iload 14
      // 107: iadd
      // 108: fconst_1
      // 109: fload 7
      // 10b: fsub
      // 10c: fastore
      // 10d: aload 4
      // 10f: getstatic vt2.zk4 Lvt2;
      // 112: invokevirtual vt2.c3s ()I
      // 115: iload 14
      // 117: iadd
      // 118: fconst_1
      // 119: fload 10
      // 11b: fsub
      // 11c: fastore
      // 11d: aload 4
      // 11f: getstatic vt2.m3r Lvt2;
      // 122: invokevirtual vt2.c3s ()I
      // 125: iload 14
      // 127: iadd
      // 128: fconst_1
      // 129: fload 8
      // 12b: fsub
      // 12c: fastore
      // 12d: aload 4
      // 12f: getstatic vt2.rf3 Lvt2;
      // 132: invokevirtual vt2.c3s ()I
      // 135: iload 14
      // 137: iadd
      // 138: fconst_1
      // 139: fload 11
      // 13b: fsub
      // 13c: fastore
      // 13d: aload 4
      // 13f: getstatic vt2.z9q Lvt2;
      // 142: invokevirtual vt2.c3s ()I
      // 145: iload 14
      // 147: iadd
      // 148: fconst_1
      // 149: fload 9
      // 14b: fsub
      // 14c: fastore
      // 14d: aload 4
      // 14f: getstatic vt2.mxp Lvt2;
      // 152: invokevirtual vt2.c3s ()I
      // 155: iload 14
      // 157: iadd
      // 158: fconst_1
      // 159: fload 12
      // 15b: fsub
      // 15c: fastore
      // 15d: ldc 1.0E-4
      // 15f: nop
      // 160: fstore 14
      // 162: ldc 0.9999
      // 164: nop
      // 165: fstore 15
      // 167: getstatic g_x$1.nam [I
      // 16a: aload 3
      // 16b: invokevirtual vt2.ordinal ()I
      // 16e: iaload
      // 16f: tableswitch 1310 1 6 37 250 463 676 889 1102
      // 194: aload 5
      // 196: bipush 1
      // 197: fload 7
      // 199: ldc 1.0E-4
      // 19b: nop
      // 19c: fcmpl
      // 19d: iload 6
      // 19f: ifne 208
      // 1a2: goto 1a9
      // 1a5: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a8: athrow
      // 1a9: ifge 207
      // 1ac: goto 1b3
      // 1af: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b2: athrow
      // 1b3: fload 9
      // 1b5: ldc 1.0E-4
      // 1b7: nop
      // 1b8: fcmpl
      // 1b9: iload 6
      // 1bb: ifne 208
      // 1be: goto 1c5
      // 1c1: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: ifge 207
      // 1c8: goto 1cf
      // 1cb: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ce: athrow
      // 1cf: fload 10
      // 1d1: ldc 0.9999
      // 1d3: nop
      // 1d4: fcmpg
      // 1d5: iload 6
      // 1d7: ifne 208
      // 1da: goto 1e1
      // 1dd: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e0: athrow
      // 1e1: ifle 207
      // 1e4: goto 1eb
      // 1e7: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: fload 12
      // 1ed: ldc 0.9999
      // 1ef: nop
      // 1f0: fcmpg
      // 1f1: iload 6
      // 1f3: ifne 208
      // 1f6: goto 1fd
      // 1f9: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fc: athrow
      // 1fd: ifgt 20b
      // 200: goto 207
      // 203: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 206: athrow
      // 207: bipush 1
      // 208: goto 20c
      // 20b: bipush 0
      // 20c: invokevirtual java/util/BitSet.set (IZ)V
      // 20f: aload 5
      // 211: bipush 0
      // 212: fload 8
      // 214: ldc 1.0E-4
      // 216: nop
      // 217: fcmpg
      // 218: iload 6
      // 21a: ifne 24d
      // 21d: iflt 241
      // 220: goto 227
      // 223: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 226: athrow
      // 227: aload 1
      // 228: invokevirtual e0x.gck ()Z
      // 22b: iload 6
      // 22d: ifne 24d
      // 230: goto 237
      // 233: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 236: athrow
      // 237: ifeq 260
      // 23a: goto 241
      // 23d: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: fload 8
      // 243: fload 11
      // 245: fcmpl
      // 246: goto 24d
      // 249: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: iload 6
      // 24f: ifne 25d
      // 252: ifne 260
      // 255: goto 25c
      // 258: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25b: athrow
      // 25c: bipush 1
      // 25d: goto 261
      // 260: bipush 0
      // 261: invokevirtual java/util/BitSet.set (IZ)V
      // 264: iload 6
      // 266: ifeq 68d
      // 269: aload 5
      // 26b: bipush 1
      // 26c: fload 7
      // 26e: ldc 1.0E-4
      // 270: nop
      // 271: fcmpl
      // 272: iload 6
      // 274: ifne 2dd
      // 277: goto 27e
      // 27a: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27d: athrow
      // 27e: ifge 2dc
      // 281: goto 288
      // 284: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 287: athrow
      // 288: fload 9
      // 28a: ldc 1.0E-4
      // 28c: nop
      // 28d: fcmpl
      // 28e: iload 6
      // 290: ifne 2dd
      // 293: goto 29a
      // 296: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 299: athrow
      // 29a: ifge 2dc
      // 29d: goto 2a4
      // 2a0: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a3: athrow
      // 2a4: fload 10
      // 2a6: ldc 0.9999
      // 2a8: nop
      // 2a9: fcmpg
      // 2aa: iload 6
      // 2ac: ifne 2dd
      // 2af: goto 2b6
      // 2b2: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: ifle 2dc
      // 2b9: goto 2c0
      // 2bc: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bf: athrow
      // 2c0: fload 12
      // 2c2: ldc 0.9999
      // 2c4: nop
      // 2c5: fcmpg
      // 2c6: iload 6
      // 2c8: ifne 2dd
      // 2cb: goto 2d2
      // 2ce: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d1: athrow
      // 2d2: ifgt 2e0
      // 2d5: goto 2dc
      // 2d8: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: bipush 1
      // 2dd: goto 2e1
      // 2e0: bipush 0
      // 2e1: invokevirtual java/util/BitSet.set (IZ)V
      // 2e4: aload 5
      // 2e6: bipush 0
      // 2e7: fload 11
      // 2e9: ldc 0.9999
      // 2eb: nop
      // 2ec: fcmpl
      // 2ed: iload 6
      // 2ef: ifne 322
      // 2f2: ifgt 316
      // 2f5: goto 2fc
      // 2f8: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fb: athrow
      // 2fc: aload 1
      // 2fd: invokevirtual e0x.gck ()Z
      // 300: iload 6
      // 302: ifne 322
      // 305: goto 30c
      // 308: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30b: athrow
      // 30c: ifeq 335
      // 30f: goto 316
      // 312: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 315: athrow
      // 316: fload 8
      // 318: fload 11
      // 31a: fcmpl
      // 31b: goto 322
      // 31e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 321: athrow
      // 322: iload 6
      // 324: ifne 332
      // 327: ifne 335
      // 32a: goto 331
      // 32d: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 330: athrow
      // 331: bipush 1
      // 332: goto 336
      // 335: bipush 0
      // 336: invokevirtual java/util/BitSet.set (IZ)V
      // 339: iload 6
      // 33b: ifeq 68d
      // 33e: aload 5
      // 340: bipush 1
      // 341: fload 7
      // 343: ldc 1.0E-4
      // 345: nop
      // 346: fcmpl
      // 347: iload 6
      // 349: ifne 3b2
      // 34c: goto 353
      // 34f: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 352: athrow
      // 353: ifge 3b1
      // 356: goto 35d
      // 359: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35c: athrow
      // 35d: fload 8
      // 35f: ldc 1.0E-4
      // 361: nop
      // 362: fcmpl
      // 363: iload 6
      // 365: ifne 3b2
      // 368: goto 36f
      // 36b: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36e: athrow
      // 36f: ifge 3b1
      // 372: goto 379
      // 375: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 378: athrow
      // 379: fload 10
      // 37b: ldc 0.9999
      // 37d: nop
      // 37e: fcmpg
      // 37f: iload 6
      // 381: ifne 3b2
      // 384: goto 38b
      // 387: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38a: athrow
      // 38b: ifle 3b1
      // 38e: goto 395
      // 391: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 394: athrow
      // 395: fload 11
      // 397: ldc 0.9999
      // 399: nop
      // 39a: fcmpg
      // 39b: iload 6
      // 39d: ifne 3b2
      // 3a0: goto 3a7
      // 3a3: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a6: athrow
      // 3a7: ifgt 3b5
      // 3aa: goto 3b1
      // 3ad: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b0: athrow
      // 3b1: bipush 1
      // 3b2: goto 3b6
      // 3b5: bipush 0
      // 3b6: invokevirtual java/util/BitSet.set (IZ)V
      // 3b9: aload 5
      // 3bb: bipush 0
      // 3bc: fload 9
      // 3be: ldc 1.0E-4
      // 3c0: nop
      // 3c1: fcmpg
      // 3c2: iload 6
      // 3c4: ifne 3f7
      // 3c7: iflt 3eb
      // 3ca: goto 3d1
      // 3cd: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d0: athrow
      // 3d1: aload 1
      // 3d2: invokevirtual e0x.gck ()Z
      // 3d5: iload 6
      // 3d7: ifne 3f7
      // 3da: goto 3e1
      // 3dd: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e0: athrow
      // 3e1: ifeq 40a
      // 3e4: goto 3eb
      // 3e7: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ea: athrow
      // 3eb: fload 9
      // 3ed: fload 12
      // 3ef: fcmpl
      // 3f0: goto 3f7
      // 3f3: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f6: athrow
      // 3f7: iload 6
      // 3f9: ifne 407
      // 3fc: ifne 40a
      // 3ff: goto 406
      // 402: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 405: athrow
      // 406: bipush 1
      // 407: goto 40b
      // 40a: bipush 0
      // 40b: invokevirtual java/util/BitSet.set (IZ)V
      // 40e: iload 6
      // 410: ifeq 68d
      // 413: aload 5
      // 415: bipush 1
      // 416: fload 7
      // 418: ldc 1.0E-4
      // 41a: nop
      // 41b: fcmpl
      // 41c: iload 6
      // 41e: ifne 487
      // 421: goto 428
      // 424: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 427: athrow
      // 428: ifge 486
      // 42b: goto 432
      // 42e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 431: athrow
      // 432: fload 8
      // 434: ldc 1.0E-4
      // 436: nop
      // 437: fcmpl
      // 438: iload 6
      // 43a: ifne 487
      // 43d: goto 444
      // 440: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 443: athrow
      // 444: ifge 486
      // 447: goto 44e
      // 44a: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44d: athrow
      // 44e: fload 10
      // 450: ldc 0.9999
      // 452: nop
      // 453: fcmpg
      // 454: iload 6
      // 456: ifne 487
      // 459: goto 460
      // 45c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45f: athrow
      // 460: ifle 486
      // 463: goto 46a
      // 466: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 469: athrow
      // 46a: fload 11
      // 46c: ldc 0.9999
      // 46e: nop
      // 46f: fcmpg
      // 470: iload 6
      // 472: ifne 487
      // 475: goto 47c
      // 478: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47b: athrow
      // 47c: ifgt 48a
      // 47f: goto 486
      // 482: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 485: athrow
      // 486: bipush 1
      // 487: goto 48b
      // 48a: bipush 0
      // 48b: invokevirtual java/util/BitSet.set (IZ)V
      // 48e: aload 5
      // 490: bipush 0
      // 491: fload 12
      // 493: ldc 0.9999
      // 495: nop
      // 496: fcmpl
      // 497: iload 6
      // 499: ifne 4cc
      // 49c: ifgt 4c0
      // 49f: goto 4a6
      // 4a2: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a5: athrow
      // 4a6: aload 1
      // 4a7: invokevirtual e0x.gck ()Z
      // 4aa: iload 6
      // 4ac: ifne 4cc
      // 4af: goto 4b6
      // 4b2: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b5: athrow
      // 4b6: ifeq 4df
      // 4b9: goto 4c0
      // 4bc: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4bf: athrow
      // 4c0: fload 9
      // 4c2: fload 12
      // 4c4: fcmpl
      // 4c5: goto 4cc
      // 4c8: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4cb: athrow
      // 4cc: iload 6
      // 4ce: ifne 4dc
      // 4d1: ifne 4df
      // 4d4: goto 4db
      // 4d7: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4da: athrow
      // 4db: bipush 1
      // 4dc: goto 4e0
      // 4df: bipush 0
      // 4e0: invokevirtual java/util/BitSet.set (IZ)V
      // 4e3: iload 6
      // 4e5: ifeq 68d
      // 4e8: aload 5
      // 4ea: bipush 1
      // 4eb: fload 8
      // 4ed: ldc 1.0E-4
      // 4ef: nop
      // 4f0: fcmpl
      // 4f1: iload 6
      // 4f3: ifne 55c
      // 4f6: goto 4fd
      // 4f9: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4fc: athrow
      // 4fd: ifge 55b
      // 500: goto 507
      // 503: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 506: athrow
      // 507: fload 9
      // 509: ldc 1.0E-4
      // 50b: nop
      // 50c: fcmpl
      // 50d: iload 6
      // 50f: ifne 55c
      // 512: goto 519
      // 515: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 518: athrow
      // 519: ifge 55b
      // 51c: goto 523
      // 51f: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 522: athrow
      // 523: fload 11
      // 525: ldc 0.9999
      // 527: nop
      // 528: fcmpg
      // 529: iload 6
      // 52b: ifne 55c
      // 52e: goto 535
      // 531: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 534: athrow
      // 535: ifle 55b
      // 538: goto 53f
      // 53b: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53e: athrow
      // 53f: fload 12
      // 541: ldc 0.9999
      // 543: nop
      // 544: fcmpg
      // 545: iload 6
      // 547: ifne 55c
      // 54a: goto 551
      // 54d: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 550: athrow
      // 551: ifgt 55f
      // 554: goto 55b
      // 557: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55a: athrow
      // 55b: bipush 1
      // 55c: goto 560
      // 55f: bipush 0
      // 560: invokevirtual java/util/BitSet.set (IZ)V
      // 563: aload 5
      // 565: bipush 0
      // 566: fload 7
      // 568: ldc 1.0E-4
      // 56a: nop
      // 56b: fcmpg
      // 56c: iload 6
      // 56e: ifne 5a1
      // 571: iflt 595
      // 574: goto 57b
      // 577: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57a: athrow
      // 57b: aload 1
      // 57c: invokevirtual e0x.gck ()Z
      // 57f: iload 6
      // 581: ifne 5a1
      // 584: goto 58b
      // 587: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58a: athrow
      // 58b: ifeq 5b4
      // 58e: goto 595
      // 591: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 594: athrow
      // 595: fload 7
      // 597: fload 10
      // 599: fcmpl
      // 59a: goto 5a1
      // 59d: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a0: athrow
      // 5a1: iload 6
      // 5a3: ifne 5b1
      // 5a6: ifne 5b4
      // 5a9: goto 5b0
      // 5ac: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5af: athrow
      // 5b0: bipush 1
      // 5b1: goto 5b5
      // 5b4: bipush 0
      // 5b5: invokevirtual java/util/BitSet.set (IZ)V
      // 5b8: iload 6
      // 5ba: ifeq 68d
      // 5bd: aload 5
      // 5bf: bipush 1
      // 5c0: fload 8
      // 5c2: ldc 1.0E-4
      // 5c4: nop
      // 5c5: fcmpl
      // 5c6: iload 6
      // 5c8: ifne 631
      // 5cb: goto 5d2
      // 5ce: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d1: athrow
      // 5d2: ifge 630
      // 5d5: goto 5dc
      // 5d8: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5db: athrow
      // 5dc: fload 9
      // 5de: ldc 1.0E-4
      // 5e0: nop
      // 5e1: fcmpl
      // 5e2: iload 6
      // 5e4: ifne 631
      // 5e7: goto 5ee
      // 5ea: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5ed: athrow
      // 5ee: ifge 630
      // 5f1: goto 5f8
      // 5f4: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f7: athrow
      // 5f8: fload 11
      // 5fa: ldc 0.9999
      // 5fc: nop
      // 5fd: fcmpg
      // 5fe: iload 6
      // 600: ifne 631
      // 603: goto 60a
      // 606: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 609: athrow
      // 60a: ifle 630
      // 60d: goto 614
      // 610: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 613: athrow
      // 614: fload 12
      // 616: ldc 0.9999
      // 618: nop
      // 619: fcmpg
      // 61a: iload 6
      // 61c: ifne 631
      // 61f: goto 626
      // 622: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 625: athrow
      // 626: ifgt 634
      // 629: goto 630
      // 62c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62f: athrow
      // 630: bipush 1
      // 631: goto 635
      // 634: bipush 0
      // 635: invokevirtual java/util/BitSet.set (IZ)V
      // 638: aload 5
      // 63a: bipush 0
      // 63b: fload 10
      // 63d: ldc 0.9999
      // 63f: nop
      // 640: fcmpl
      // 641: iload 6
      // 643: ifne 676
      // 646: ifgt 66a
      // 649: goto 650
      // 64c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64f: athrow
      // 650: aload 1
      // 651: invokevirtual e0x.gck ()Z
      // 654: iload 6
      // 656: ifne 676
      // 659: goto 660
      // 65c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65f: athrow
      // 660: ifeq 689
      // 663: goto 66a
      // 666: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 669: athrow
      // 66a: fload 7
      // 66c: fload 10
      // 66e: fcmpl
      // 66f: goto 676
      // 672: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 675: athrow
      // 676: iload 6
      // 678: ifne 686
      // 67b: ifne 689
      // 67e: goto 685
      // 681: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 684: athrow
      // 685: bipush 1
      // 686: goto 68a
      // 689: bipush 0
      // 68a: invokevirtual java/util/BitSet.set (IZ)V
      // 68d: return
   }

   private void h0s(m5n param1, zfz param2, mew param3, vt2 param4, int param5, boolean param6, q3g param7, List param8, RenderEnv param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: invokeinterface zfz.r_y ()Le0x; 1
      // 006: astore 11
      // 008: invokestatic t9d.b ()I
      // 00b: aload 9
      // 00d: invokevirtual net/optifine/render/RenderEnv.getBoundsFlags ()Ljava/util/BitSet;
      // 010: astore 12
      // 012: istore 10
      // 014: aload 3
      // 015: invokevirtual mew.getX ()I
      // 018: i2d
      // 019: dstore 13
      // 01b: aload 3
      // 01c: invokevirtual mew.getY ()I
      // 01f: i2d
      // 020: dstore 15
      // 022: aload 3
      // 023: invokevirtual mew.getZ ()I
      // 026: i2d
      // 027: dstore 17
      // 029: aload 11
      // 02b: invokevirtual e0x.jkr ()Le0x$hep;
      // 02e: astore 19
      // 030: aload 19
      // 032: getstatic e0x$hep.j0y Le0x$hep;
      // 035: if_acmpeq 0cd
      // 038: aload 3
      // 039: invokevirtual mew.getX ()I
      // 03c: istore 20
      // 03e: aload 3
      // 03f: invokevirtual mew.getZ ()I
      // 042: istore 21
      // 044: iload 20
      // 046: ldc 3129871
      // 048: nop
      // 049: imul
      // 04a: i2l
      // 04b: iload 21
      // 04d: i2l
      // 04e: ldc2_w 116129781
      // 051: lmul
      // 052: lxor
      // 053: lstore 22
      // 055: lload 22
      // 057: lload 22
      // 059: lmul
      // 05a: ldc2_w 42317861
      // 05d: lmul
      // 05e: lload 22
      // 060: ldc2_w 11
      // 063: lmul
      // 064: ladd
      // 065: lstore 22
      // 067: dload 13
      // 069: lload 22
      // 06b: bipush 16
      // 06d: lshr
      // 06e: ldc2_w 15
      // 071: land
      // 072: l2f
      // 073: ldc 15.0
      // 075: nop
      // 076: fdiv
      // 077: f2d
      // 078: ldc2_w 0.5
      // 07b: dsub
      // 07c: ldc2_w 0.5
      // 07f: dmul
      // 080: dadd
      // 081: dstore 13
      // 083: dload 17
      // 085: lload 22
      // 087: bipush 24
      // 089: lshr
      // 08a: ldc2_w 15
      // 08d: land
      // 08e: l2f
      // 08f: ldc 15.0
      // 091: nop
      // 092: fdiv
      // 093: f2d
      // 094: ldc2_w 0.5
      // 097: dsub
      // 098: ldc2_w 0.5
      // 09b: dmul
      // 09c: dadd
      // 09d: iload 10
      // 09f: ifeq 0cb
      // 0a2: dstore 17
      // 0a4: aload 19
      // 0a6: getstatic e0x$hep.w9u Le0x$hep;
      // 0a9: if_acmpne 0cd
      // 0ac: dload 15
      // 0ae: lload 22
      // 0b0: bipush 20
      // 0b2: lshr
      // 0b3: ldc2_w 15
      // 0b6: land
      // 0b7: l2f
      // 0b8: ldc 15.0
      // 0ba: nop
      // 0bb: fdiv
      // 0bc: f2d
      // 0bd: dconst_1
      // 0be: dsub
      // 0bf: ldc2_w 0.2
      // 0c2: dmul
      // 0c3: dadd
      // 0c4: goto 0cb
      // 0c7: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: dstore 15
      // 0cd: aload 8
      // 0cf: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d4: astore 20
      // 0d6: aload 20
      // 0d8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0dd: ifeq 2b1
      // 0e0: aload 20
      // 0e2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e7: checkcast oa4
      // 0ea: astore 21
      // 0ec: iload 6
      // 0ee: iload 10
      // 0f0: ifeq 159
      // 0f3: ifeq 151
      // 0f6: goto 0fd
      // 0f9: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: aload 11
      // 100: aload 21
      // 102: invokevirtual oa4.fnb ()[I
      // 105: aload 21
      // 107: invokevirtual oa4.fih ()Lvt2;
      // 10a: aconst_null
      // 10b: checkcast [F
      // 10e: aload 12
      // 110: invokespecial g_x.jmj (Le0x;[ILvt2;[FLjava/util/BitSet;)V
      // 113: aload 12
      // 115: bipush 0
      // 116: invokevirtual java/util/BitSet.get (I)Z
      // 119: iload 10
      // 11b: ifeq 145
      // 11e: goto 125
      // 121: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: ifeq 148
      // 128: goto 12f
      // 12b: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: aload 11
      // 131: aload 1
      // 132: aload 3
      // 133: aload 21
      // 135: invokevirtual oa4.fih ()Lvt2;
      // 138: invokevirtual mew.offset (Lvt2;)Lmew;
      // 13b: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 13e: goto 145
      // 141: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: goto 14f
      // 148: aload 11
      // 14a: aload 1
      // 14b: aload 3
      // 14c: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 14f: istore 5
      // 151: aload 21
      // 153: invokevirtual oa4.enl ()Lsla;
      // 156: getfield sla.kr7 Z
      // 159: iload 10
      // 15b: ifeq 181
      // 15e: ifeq 170
      // 161: goto 168
      // 164: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: iload 5
      // 16a: sipush 240
      // 16d: ior
      // 16e: istore 5
      // 170: aload 7
      // 172: iload 10
      // 174: ifeq 1a3
      // 177: invokevirtual q3g.qq_ ()Z
      // 17a: goto 181
      // 17d: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 180: athrow
      // 181: ifeq 19a
      // 184: aload 7
      // 186: aload 21
      // 188: invokevirtual oa4.akn ()[I
      // 18b: invokevirtual q3g.sug ([I)V
      // 18e: iload 10
      // 190: ifne 1ab
      // 193: goto 19a
      // 196: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: aload 7
      // 19c: goto 1a3
      // 19f: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: aload 21
      // 1a5: invokevirtual oa4.fnb ()[I
      // 1a8: invokevirtual q3g.sug ([I)V
      // 1ab: aload 7
      // 1ad: aload 21
      // 1af: invokevirtual oa4.enl ()Lsla;
      // 1b2: invokevirtual q3g.kpp (Lsla;)V
      // 1b5: aload 7
      // 1b7: iload 5
      // 1b9: iload 5
      // 1bb: iload 5
      // 1bd: iload 5
      // 1bf: invokevirtual q3g.hic (IIII)V
      // 1c2: aload 21
      // 1c4: aload 2
      // 1c5: aload 1
      // 1c6: aload 3
      // 1c7: aload 9
      // 1c9: invokestatic net/optifine/CustomColors.getColorMultiplier (Loa4;Lzfz;Lm5n;Lmew;Lnet/optifine/render/RenderEnv;)I
      // 1cc: istore 22
      // 1ce: aload 21
      // 1d0: invokevirtual oa4.k3w ()Z
      // 1d3: iload 10
      // 1d5: ifeq 1fd
      // 1d8: ifne 1fb
      // 1db: goto 1e2
      // 1de: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e1: athrow
      // 1e2: iload 22
      // 1e4: bipush -1
      // 1e5: iload 10
      // 1e7: ifeq 20a
      // 1ea: goto 1f1
      // 1ed: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f0: athrow
      // 1f1: if_icmpeq 2a1
      // 1f4: goto 1fb
      // 1f7: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fa: athrow
      // 1fb: iload 22
      // 1fd: iload 10
      // 1ff: ifeq 229
      // 202: bipush -1
      // 203: goto 20a
      // 206: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: if_icmpeq 216
      // 20d: iload 22
      // 20f: istore 23
      // 211: iload 10
      // 213: ifne 22b
      // 216: aload 11
      // 218: aload 1
      // 219: aload 3
      // 21a: aload 21
      // 21c: invokevirtual oa4.m4h ()I
      // 21f: invokevirtual e0x.j24 (Lm5n;Lmew;I)I
      // 222: goto 229
      // 225: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 228: athrow
      // 229: istore 23
      // 22b: getstatic v3i.v0c Z
      // 22e: iload 10
      // 230: ifeq 24d
      // 233: ifeq 244
      // 236: goto 23d
      // 239: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: iload 23
      // 23f: invokestatic p9t.t5j (I)I
      // 242: istore 23
      // 244: iload 23
      // 246: bipush 16
      // 248: ishr
      // 249: sipush 255
      // 24c: iand
      // 24d: i2f
      // 24e: ldc 255.0
      // 250: nop
      // 251: fdiv
      // 252: fstore 24
      // 254: iload 23
      // 256: bipush 8
      // 258: ishr
      // 259: sipush 255
      // 25c: iand
      // 25d: i2f
      // 25e: ldc 255.0
      // 260: nop
      // 261: fdiv
      // 262: fstore 25
      // 264: iload 23
      // 266: sipush 255
      // 269: iand
      // 26a: i2f
      // 26b: ldc 255.0
      // 26d: nop
      // 26e: fdiv
      // 26f: fstore 26
      // 271: aload 7
      // 273: fload 24
      // 275: fload 25
      // 277: fload 26
      // 279: bipush 4
      // 27a: invokevirtual q3g.m95 (FFFI)V
      // 27d: aload 7
      // 27f: fload 24
      // 281: fload 25
      // 283: fload 26
      // 285: bipush 3
      // 286: invokevirtual q3g.m95 (FFFI)V
      // 289: aload 7
      // 28b: fload 24
      // 28d: fload 25
      // 28f: fload 26
      // 291: bipush 2
      // 292: invokevirtual q3g.m95 (FFFI)V
      // 295: aload 7
      // 297: fload 24
      // 299: fload 25
      // 29b: fload 26
      // 29d: bipush 1
      // 29e: invokevirtual q3g.m95 (FFFI)V
      // 2a1: aload 7
      // 2a3: dload 13
      // 2a5: dload 15
      // 2a7: dload 17
      // 2a9: invokevirtual q3g.em3 (DDD)V
      // 2ac: iload 10
      // 2ae: ifne 0d6
      // 2b1: return
   }

   public void w5w(dbw var1, float var2, float var3, float var4, float var5) {
      vt2[] var7 = vt2.vbu;
      int var10000 = t9d.b();
      int var8 = var7.length;
      int var6 = var10000;
      int var9 = 0;

      while (true) {
         if (var9 < var8) {
            vt2 var10 = var7[var9];

            try {
               this.ser(var2, var3, var4, var5, var1.ebu(var10));
               var9++;
               if (var6 == 0) {
                  break;
               }

               if (var6 != 0) {
                  continue;
               }
            } catch (oov var11) {
               throw a(var11);
            }
         }

         this.ser(var2, var3, var4, var5, var1.in9());
         break;
      }
   }

   public void v2f(dbw param1, zfz param2, float param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokeinterface zfz.r_y ()Le0x; 1
      // 06: astore 6
      // 08: aload 6
      // 0a: invokevirtual e0x.bf6 ()V
      // 0d: invokestatic t9d.c ()I
      // 10: ldc 90.0
      // 12: nop
      // 13: fconst_0
      // 14: fconst_1
      // 15: fconst_0
      // 16: invokestatic hzu.a2h (FFFF)V
      // 19: istore 5
      // 1b: aload 6
      // 1d: aload 6
      // 1f: aload 2
      // 20: invokevirtual e0x.v1x (Lzfz;)Lzfz;
      // 23: invokevirtual e0x.ieb (Lzfz;)I
      // 26: istore 7
      // 28: getstatic v3i.v0c Z
      // 2b: iload 5
      // 2d: ifne 4a
      // 30: ifeq 41
      // 33: goto 3a
      // 36: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: iload 7
      // 3c: invokestatic p9t.t5j (I)I
      // 3f: istore 7
      // 41: iload 7
      // 43: bipush 16
      // 45: ishr
      // 46: sipush 255
      // 49: iand
      // 4a: i2f
      // 4b: ldc 255.0
      // 4d: nop
      // 4e: fdiv
      // 4f: fstore 8
      // 51: iload 7
      // 53: bipush 8
      // 55: ishr
      // 56: sipush 255
      // 59: iand
      // 5a: i2f
      // 5b: ldc 255.0
      // 5d: nop
      // 5e: fdiv
      // 5f: fstore 9
      // 61: iload 7
      // 63: sipush 255
      // 66: iand
      // 67: i2f
      // 68: ldc 255.0
      // 6a: nop
      // 6b: fdiv
      // 6c: fstore 10
      // 6e: iload 5
      // 70: ifne 99
      // 73: iload 4
      // 75: ifne 8d
      // 78: goto 7f
      // 7b: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: fload 3
      // 80: fload 3
      // 81: fload 3
      // 82: fconst_1
      // 83: invokestatic hzu.wn0 (FFFF)V
      // 86: goto 8d
      // 89: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 0
      // 8e: aload 1
      // 8f: fload 3
      // 90: fload 8
      // 92: fload 9
      // 94: fload 10
      // 96: invokevirtual g_x.w5w (Ldbw;FFFF)V
      // 99: return
   }

   private void ser(float param1, float param2, float param3, float param4, List param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic jom.yut ()Ljom;
      // 03: astore 7
      // 05: invokestatic t9d.c ()I
      // 08: aload 7
      // 0a: invokevirtual jom.zuq ()Lq3g;
      // 0d: astore 8
      // 0f: istore 6
      // 11: aload 5
      // 13: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 18: astore 9
      // 1a: aload 9
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq b7
      // 24: aload 9
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast oa4
      // 2e: astore 10
      // 30: aload 8
      // 32: bipush 7
      // 34: getstatic gnl.jur Lbe7;
      // 37: invokevirtual q3g.ezr (ILbe7;)V
      // 3a: aload 8
      // 3c: aload 10
      // 3e: invokevirtual oa4.fnb ()[I
      // 41: invokevirtual q3g.sug ([I)V
      // 44: aload 8
      // 46: iload 6
      // 48: ifne 86
      // 4b: aload 10
      // 4d: invokevirtual oa4.enl ()Lsla;
      // 50: invokevirtual q3g.kpp (Lsla;)V
      // 53: aload 10
      // 55: invokevirtual oa4.k3w ()Z
      // 58: ifeq 7d
      // 5b: goto 62
      // 5e: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: aload 8
      // 64: fload 2
      // 65: fload 1
      // 66: fmul
      // 67: fload 3
      // 68: fload 1
      // 69: fmul
      // 6a: fload 4
      // 6c: fload 1
      // 6d: fmul
      // 6e: invokevirtual q3g.ql7 (FFF)V
      // 71: iload 6
      // 73: ifeq 8c
      // 76: goto 7d
      // 79: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 8
      // 7f: goto 86
      // 82: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: fload 1
      // 87: fload 1
      // 88: fload 1
      // 89: invokevirtual q3g.ql7 (FFF)V
      // 8c: aload 10
      // 8e: invokevirtual oa4.fih ()Lvt2;
      // 91: invokevirtual vt2.et1 ()Lwgo;
      // 94: astore 11
      // 96: aload 8
      // 98: aload 11
      // 9a: invokevirtual wgo.getX ()I
      // 9d: i2f
      // 9e: aload 11
      // a0: invokevirtual wgo.getY ()I
      // a3: i2f
      // a4: aload 11
      // a6: invokevirtual wgo.getZ ()I
      // a9: i2f
      // aa: invokevirtual q3g.sk4 (FFF)V
      // ad: aload 7
      // af: invokevirtual jom.q7g ()V
      // b2: iload 6
      // b4: ifeq 1a
      // b7: return
   }

   public static float irr(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: fload 0
      // 05: iload 1
      // 06: ifeq 21
      // 09: ldc 0.2
      // 0b: nop
      // 0c: fcmpl
      // 0d: ifne 24
      // 10: goto 17
      // 13: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: getstatic g_x.e_6 F
      // 1a: goto 21
      // 1d: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: fload 0
      // 25: freturn
   }

   public static void o20() {
      int var0 = t9d.b();

      boolean var10000;
      label36: {
         label35: {
            label34: {
               label33: {
                  try {
                     e_6 = 1.0F - hxt.btr() * 0.8F;
                     var10000 = hxt.ly3();
                     if (var0 == 0) {
                        break label33;
                     }

                     if (!var10000) {
                        break label34;
                     }
                  } catch (oov var2) {
                     throw a(var2);
                  }

                  var10000 = Shaders.isSeparateAo();
               }

               try {
                  if (var0 == 0) {
                     break label36;
                  }

                  if (var10000) {
                     break label35;
                  }
               } catch (oov var1) {
                  throw a(var1);
               }
            }

            var10000 = false;
            break label36;
         }

         var10000 = true;
      }

      m2j = var10000;
   }

   private void l2u(m5n param1, dbw param2, zfz param3, mew param4, q3g param5, boolean param6, long param7, RenderEnv param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 11
      // 005: aload 9
      // 007: invokevirtual net/optifine/render/RenderEnv.isOverlaysRendered ()Z
      // 00a: iload 11
      // 00c: ifeq 18d
      // 00f: ifeq 18a
      // 012: goto 019
      // 015: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: bipush 0
      // 01a: istore 12
      // 01c: iload 12
      // 01e: getstatic g_x.ehb [Lw51;
      // 021: arraylength
      // 022: if_icmpge 18a
      // 025: getstatic g_x.ehb [Lw51;
      // 028: iload 12
      // 02a: aaload
      // 02b: astore 13
      // 02d: aload 9
      // 02f: aload 13
      // 031: invokevirtual net/optifine/render/RenderEnv.getListQuadsOverlay (Lw51;)Lnet/optifine/model/ListQuadsOverlay;
      // 034: astore 14
      // 036: iload 11
      // 038: ifeq 185
      // 03b: aload 14
      // 03d: invokevirtual net/optifine/model/ListQuadsOverlay.size ()I
      // 040: iload 11
      // 042: ifeq 18d
      // 045: goto 04c
      // 048: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: ifle 182
      // 04f: goto 056
      // 052: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: aload 9
      // 058: invokevirtual net/optifine/render/RenderEnv.getRegionRenderCacheBuilder ()Lwi5;
      // 05b: astore 15
      // 05d: aload 15
      // 05f: iload 11
      // 061: ifeq 070
      // 064: ifnull 17d
      // 067: goto 06e
      // 06a: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 15
      // 070: aload 13
      // 072: invokevirtual wi5._0d (Lw51;)Lq3g;
      // 075: astore 16
      // 077: aload 16
      // 079: invokevirtual q3g.rbv ()Z
      // 07c: iload 11
      // 07e: ifeq 0b1
      // 081: ifne 0b0
      // 084: goto 08b
      // 087: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: aload 16
      // 08d: bipush 7
      // 08f: getstatic gnl.n6w Lbe7;
      // 092: invokevirtual q3g.ezr (ILbe7;)V
      // 095: aload 16
      // 097: aload 5
      // 099: invokevirtual q3g._7s ()D
      // 09c: aload 5
      // 09e: invokevirtual q3g.m6k ()D
      // 0a1: aload 5
      // 0a3: invokevirtual q3g.tvo ()D
      // 0a6: invokevirtual q3g.nbz (DDD)V
      // 0a9: goto 0b0
      // 0ac: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: bipush 0
      // 0b1: istore 17
      // 0b3: iload 17
      // 0b5: aload 14
      // 0b7: invokevirtual net/optifine/model/ListQuadsOverlay.size ()I
      // 0ba: if_icmpge 17d
      // 0bd: aload 14
      // 0bf: iload 17
      // 0c1: invokevirtual net/optifine/model/ListQuadsOverlay.getQuad (I)Loa4;
      // 0c4: astore 18
      // 0c6: aload 14
      // 0c8: aload 18
      // 0ca: invokevirtual net/optifine/model/ListQuadsOverlay.getListQuadsSingle (Loa4;)Ljava/util/List;
      // 0cd: astore 19
      // 0cf: aload 14
      // 0d1: iload 17
      // 0d3: invokevirtual net/optifine/model/ListQuadsOverlay.getBlockState (I)Lzfz;
      // 0d6: astore 20
      // 0d8: iload 11
      // 0da: ifeq 185
      // 0dd: iload 11
      // 0df: ifeq 114
      // 0e2: goto 0e9
      // 0e5: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: aload 18
      // 0eb: invokevirtual oa4.cnr ()Loa4;
      // 0ee: ifnull 10b
      // 0f1: goto 0f8
      // 0f4: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: aload 14
      // 0fa: aload 18
      // 0fc: invokevirtual oa4.cnr ()Loa4;
      // 0ff: aload 20
      // 101: invokevirtual net/optifine/model/ListQuadsOverlay.addQuad (Loa4;Lzfz;)V
      // 104: goto 10b
      // 107: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10a: athrow
      // 10b: aload 9
      // 10d: aload 20
      // 10f: aload 4
      // 111: invokevirtual net/optifine/render/RenderEnv.reset (Lzfz;Lmew;)V
      // 114: iload 10
      // 116: iload 11
      // 118: ifeq 15c
      // 11b: ifeq 140
      // 11e: goto 125
      // 121: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 0
      // 126: aload 1
      // 127: aload 20
      // 129: aload 4
      // 12b: aload 16
      // 12d: aload 19
      // 12f: aload 9
      // 131: invokespecial g_x.b3_ (Lm5n;Lzfz;Lmew;Lq3g;Ljava/util/List;Lnet/optifine/render/RenderEnv;)V
      // 134: iload 11
      // 136: ifne 175
      // 139: goto 140
      // 13c: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: aload 20
      // 142: invokeinterface zfz.r_y ()Le0x; 1
      // 147: aload 1
      // 148: aload 4
      // 14a: aload 18
      // 14c: invokevirtual oa4.fih ()Lvt2;
      // 14f: invokevirtual mew.offset (Lvt2;)Lmew;
      // 152: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 155: goto 15c
      // 158: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: istore 21
      // 15e: aload 0
      // 15f: aload 1
      // 160: aload 20
      // 162: aload 4
      // 164: aload 18
      // 166: invokevirtual oa4.fih ()Lvt2;
      // 169: iload 21
      // 16b: bipush 0
      // 16c: aload 16
      // 16e: aload 19
      // 170: aload 9
      // 172: invokespecial g_x.h0s (Lm5n;Lzfz;Lmew;Lvt2;IZLq3g;Ljava/util/List;Lnet/optifine/render/RenderEnv;)V
      // 175: iinc 17 1
      // 178: iload 11
      // 17a: ifne 0b3
      // 17d: aload 14
      // 17f: invokevirtual net/optifine/model/ListQuadsOverlay.clear ()V
      // 182: iinc 12 1
      // 185: iload 11
      // 187: ifne 01c
      // 18a: invokestatic hxt.h9k ()Z
      // 18d: iload 11
      // 18f: ifeq 1a8
      // 192: ifeq 1e2
      // 195: goto 19c
      // 198: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 9
      // 19e: invokevirtual net/optifine/render/RenderEnv.isBreakingAnimation ()Z
      // 1a1: goto 1a8
      // 1a4: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: iload 11
      // 1aa: ifeq 1c5
      // 1ad: ifne 1e2
      // 1b0: goto 1b7
      // 1b3: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b6: athrow
      // 1b7: aload 1
      // 1b8: aload 3
      // 1b9: aload 4
      // 1bb: invokestatic net/optifine/BetterSnow.shouldRender (Lm5n;Lzfz;Lmew;)Z
      // 1be: goto 1c5
      // 1c1: invokestatic g_x.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: ifeq 1e2
      // 1c8: invokestatic net/optifine/BetterSnow.getModelSnowLayer ()Ldbw;
      // 1cb: astore 12
      // 1cd: invokestatic net/optifine/BetterSnow.getStateSnowLayer ()Lzfz;
      // 1d0: astore 13
      // 1d2: aload 0
      // 1d3: aload 1
      // 1d4: aload 12
      // 1d6: aload 13
      // 1d8: aload 4
      // 1da: aload 5
      // 1dc: iload 6
      // 1de: invokevirtual g_x.mh1 (Lm5n;Ldbw;Lzfz;Lmew;Lq3g;Z)Z
      // 1e1: pop
      // 1e2: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8515553265079291768L, 7775859284426686824L, MethodHandles.lookup().lookupClass()).a(4309812146110L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 78807677291624L;
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
      String var6 = "×÷l!lM\u001c)ÞR&æÖÞiþ\u009dt¹\u009b$¾IÑ²¼\u009d;\u0006¢á8L:-\u00938@\u0099\u0083ÎÏsöak¿NçÞ})\u0005Áö¯(\u0014d\u0001$k°°éëknÉû\u0093¯\u0017HÐ2S\u0090¹\u0003Ä\u008d:gÔe¾vþbÎÕ\u0011\u001bcxå j5~\u007f,ø1.}\u0090ÎèYÿ\u0018+Üp\nÇ°tqn\u001c,\u0084Û§?DË";
      int var8 = "×÷l!lM\u001c)ÞR&æÖÞiþ\u009dt¹\u009b$¾IÑ²¼\u009d;\u0006¢á8L:-\u00938@\u0099\u0083ÎÏsöak¿NçÞ})\u0005Áö¯(\u0014d\u0001$k°°éëknÉû\u0093¯\u0017HÐ2S\u0090¹\u0003Ä\u008d:gÔe¾vþbÎÕ\u0011\u001bcxå j5~\u007f,ø1.}\u0090ÎèYÿ\u0018+Üp\nÇ°tqn\u001c,\u0084Û§?DË"
         .length();
      char var5 = '8';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            e_6 = 0.2F;
            m2j = false;
            ehb = new w51[]{w51.gx9, w51.oja, w51.mem};
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25248;
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
            throw new RuntimeException("g_x", var10);
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
         throw new RuntimeException("g_x" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
