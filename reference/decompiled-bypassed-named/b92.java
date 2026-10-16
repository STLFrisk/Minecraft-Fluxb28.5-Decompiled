import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b92 extends ShaderHelper {
   private static final Logger r9o;
   private final ekw b7i;
   private final ShaderHelper q3q;
   private final b92$pwe nz3;
   private final List bo1;
   private final List kf5;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public b92(ShaderHelper var1, b92$pwe var2) {
      this(var1, var2, (List)null);
   }

   public b92(ShaderHelper var1, b92$pwe var2, List var3) {
      long var4 = a ^ 139780939646918L;
      super();
      this.b7i = new hsu(b<"b">(29729, 2428410725784439782L ^ var4), new Object[0]);
      this.kf5 = Lists.newArrayList();
      this.q3q = var1;
      this.nz3 = var2;
      this.bo1 = var3;
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
      // 000: getstatic b92.a J
      // 003: ldc2_w 42585655450919
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: iload 3
      // 00e: ifne 0b0
      // 011: getfield b92.kf5 Ljava/util/List;
      // 014: invokeinterface java/util/List.isEmpty ()Z 1
      // 019: ifeq 0af
      // 01c: goto 023
      // 01f: invokestatic b92.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: getfield b92.kf5 Ljava/util/List;
      // 027: aload 0
      // 028: getfield b92.fex Lowt;
      // 02b: aload 0
      // 02c: getfield b92.nz3 Lb92$pwe;
      // 02f: invokevirtual b92$pwe.yfb ()Lekw;
      // 032: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 037: aload 0
      // 038: getfield b92.dt7 I
      // 03b: i2f
      // 03c: ldc 0.75
      // 03e: nop
      // 03f: fmul
      // 040: f2i
      // 041: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 044: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 049: pop
      // 04a: aload 0
      // 04b: iload 3
      // 04c: ifne 0b0
      // 04f: goto 056
      // 052: invokestatic b92.a (Loov;)Loov;
      // 055: athrow
      // 056: getfield b92.bo1 Ljava/util/List;
      // 059: ifnull 0af
      // 05c: goto 063
      // 05f: invokestatic b92.a (Loov;)Loov;
      // 062: athrow
      // 063: aload 0
      // 064: getfield b92.kf5 Ljava/util/List;
      // 067: ldc ""
      // 069: nop
      // 06a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 06f: pop
      // 070: aload 0
      // 071: getfield b92.bo1 Ljava/util/List;
      // 074: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 079: astore 4
      // 07b: aload 4
      // 07d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 082: ifeq 0af
      // 085: aload 4
      // 087: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 08c: checkcast hsu
      // 08f: astore 5
      // 091: aload 0
      // 092: getfield b92.kf5 Ljava/util/List;
      // 095: aload 5
      // 097: invokevirtual hsu.cpz ()Ljava/lang/String;
      // 09a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09f: pop
      // 0a0: iload 3
      // 0a1: ifne 14b
      // 0a4: iload 3
      // 0a5: ifeq 07b
      // 0a8: goto 0af
      // 0ab: invokestatic b92.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: iload 3
      // 0b1: ifne 14c
      // 0b4: getfield b92.nz3 Lb92$pwe;
      // 0b7: invokevirtual b92$pwe.vw2 ()Lekw;
      // 0ba: ifnull 14b
      // 0bd: goto 0c4
      // 0c0: invokestatic b92.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield b92.khf Ljava/util/List;
      // 0c8: new gt4
      // 0cb: dup
      // 0cc: bipush 0
      // 0cd: aload 0
      // 0ce: getfield b92.dt7 I
      // 0d1: bipush 2
      // 0d2: idiv
      // 0d3: sipush 155
      // 0d6: isub
      // 0d7: aload 0
      // 0d8: getfield b92.o1e I
      // 0db: bipush 50
      // 0dd: isub
      // 0de: sipush 150
      // 0e1: bipush 20
      // 0e3: sipush 26746
      // 0e6: ldc2_w 1054905810171612505
      // 0e9: lload 1
      // 0ea: lxor
      // 0eb: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: nop
      // 0f1: bipush 0
      // 0f2: anewarray 61
      // 0f5: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0f8: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 0fb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 100: pop
      // 101: aload 0
      // 102: getfield b92.khf Ljava/util/List;
      // 105: new gt4
      // 108: dup
      // 109: bipush 1
      // 10a: aload 0
      // 10b: getfield b92.dt7 I
      // 10e: bipush 2
      // 10f: idiv
      // 110: sipush 155
      // 113: isub
      // 114: sipush 160
      // 117: iadd
      // 118: aload 0
      // 119: getfield b92.o1e I
      // 11c: bipush 50
      // 11e: isub
      // 11f: sipush 150
      // 122: bipush 20
      // 124: aload 0
      // 125: getfield b92.nz3 Lb92$pwe;
      // 128: invokevirtual b92$pwe.vw2 ()Lekw;
      // 12b: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 130: bipush 0
      // 131: anewarray 61
      // 134: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 137: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 13a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13f: pop
      // 140: iload 3
      // 141: ifeq 187
      // 144: goto 14b
      // 147: invokestatic b92.a (Loov;)Loov;
      // 14a: athrow
      // 14b: aload 0
      // 14c: getfield b92.khf Ljava/util/List;
      // 14f: new gt4
      // 152: dup
      // 153: bipush 0
      // 154: aload 0
      // 155: getfield b92.dt7 I
      // 158: bipush 2
      // 159: idiv
      // 15a: bipush 75
      // 15c: isub
      // 15d: aload 0
      // 15e: getfield b92.o1e I
      // 161: bipush 50
      // 163: isub
      // 164: sipush 150
      // 167: bipush 20
      // 169: sipush 22920
      // 16c: ldc2_w 1165148986219560101
      // 16f: lload 1
      // 170: lxor
      // 171: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: nop
      // 177: bipush 0
      // 178: anewarray 61
      // 17b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 17e: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 181: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 186: pop
      // 187: return
   }

   @Override
   public void onGuiClosed() {
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      int var5 = Math.max((int)((double)this.o1e * 0.85 / 2.0 - (double)((float)(this.kf5.size() * this.fex.rr7) / 2.0F)), 50);
      int var10000 = OpaquePredicate.c();
      this.poi(this.fex, this.b7i._2o(), this.dt7 / 2, var5 - this.fex.rr7 * 2, 16777215);
      int var4 = var10000;
      Iterator var6 = this.kf5.iterator();

      while (true) {
         if (var6.hasNext()) {
            String var7 = (String)var6.next();
            this.poi(this.fex, var7, this.dt7 / 2, var5, 10526880);
            var5 += this.fex.rr7;

            try {
               if (var4 != 0) {
                  break;
               }

               if (var4 == 0) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         super.drawScreen(var1, var2, var3);
         break;
      }
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic b92.a J
      // 03: ldc2_w 74836690175164
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: getfield gt4.c9a Z
      // 11: iload 4
      // 13: ifne 2b
      // 16: ifeq f6
      // 19: goto 20
      // 1c: invokestatic b92.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield gt4._me I
      // 24: goto 2b
      // 27: invokestatic b92.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 4
      // 2d: ifne 4d
      // 30: bipush 1
      // 31: if_icmpne eb
      // 34: goto 3b
      // 37: invokestatic b92.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getstatic b92$1.sc2 [I
      // 3e: aload 0
      // 3f: getfield b92.nz3 Lb92$pwe;
      // 42: invokevirtual b92$pwe.ordinal ()I
      // 45: iaload
      // 46: goto 4d
      // 49: invokestatic b92.a (Loov;)Loov;
      // 4c: athrow
      // 4d: tableswitch 158 1 7 43 43 73 103 133 133 133
      // 78: aload 0
      // 79: sipush 23170
      // 7c: ldc2_w 1823120779705378358
      // 7f: lload 2
      // 80: lxor
      // 81: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: nop
      // 87: invokespecial b92.kg4 (Ljava/lang/String;)V
      // 8a: iload 4
      // 8c: ifeq eb
      // 8f: goto 96
      // 92: invokestatic b92.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: sipush 12130
      // 9a: ldc2_w 5920752562753999824
      // 9d: lload 2
      // 9e: lxor
      // 9f: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: nop
      // a5: invokespecial b92.kg4 (Ljava/lang/String;)V
      // a8: iload 4
      // aa: ifeq eb
      // ad: goto b4
      // b0: invokestatic b92.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 0
      // b5: sipush 29389
      // b8: ldc2_w 2680132223776345724
      // bb: lload 2
      // bc: lxor
      // bd: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: nop
      // c3: invokespecial b92.kg4 (Ljava/lang/String;)V
      // c6: iload 4
      // c8: ifeq eb
      // cb: goto d2
      // ce: invokestatic b92.a (Loov;)Loov;
      // d1: athrow
      // d2: aload 0
      // d3: sipush 3613
      // d6: ldc2_w 7162996182947934884
      // d9: lload 2
      // da: lxor
      // db: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: nop
      // e1: invokespecial b92.kg4 (Ljava/lang/String;)V
      // e4: goto eb
      // e7: invokestatic b92.a (Loov;)Loov;
      // ea: athrow
      // eb: aload 0
      // ec: getfield b92.f41 Lc05;
      // ef: aload 0
      // f0: getfield b92.q3q Lgbe;
      // f3: invokevirtual Minecraft.z2i (Lgbe;)V
      // f6: return
   }

   private void kg4(String var1) {
      long var2 = a ^ 121434386367205L;

      try {
         Class var4 = Class.forName(b<"b">(29620, 7701393029863917900L ^ var2));
         Object var5 = var4.getMethod(b<"b">(9915, 603308747038006353L ^ var2)).invoke(null);
         var4.getMethod(b<"b">(10450, 2642093829617160759L ^ var2), URI.class).invoke(var5, new URI(var1));
      } catch (Throwable var6) {
         r9o.error(b<"b">(16543, 5512153433123388019L ^ var2), var6);
      }
   }

   public static void c1n(ShaderHelper param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic b92.a J
      // 003: ldc2_w 50824584379466
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic Minecraft.vz1 ()Lc05;
      // 00b: astore 4
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: aload 4
      // 012: invokevirtual Minecraft.vnk ()Ltyh;
      // 015: astore 5
      // 017: istore 3
      // 018: getstatic gis.c75 Z
      // 01b: iload 3
      // 01c: ifeq 101
      // 01f: ifne 0f5
      // 022: goto 029
      // 025: invokestatic b92.a (Loov;)Loov;
      // 028: athrow
      // 029: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 02c: astore 6
      // 02e: aload 6
      // 030: new hsu
      // 033: dup
      // 034: sipush 22044
      // 037: ldc2_w 7563283314164355674
      // 03a: lload 1
      // 03b: lxor
      // 03c: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: nop
      // 042: bipush 1
      // 043: anewarray 61
      // 046: dup
      // 047: bipush 0
      // 048: sipush 7938
      // 04b: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 04e: aastore
      // 04f: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 052: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 057: pop
      // 058: aload 6
      // 05a: new hsu
      // 05d: dup
      // 05e: sipush 3964
      // 061: ldc2_w 5840370488480434992
      // 064: lload 1
      // 065: lxor
      // 066: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: nop
      // 06c: bipush 1
      // 06d: anewarray 61
      // 070: dup
      // 071: bipush 0
      // 072: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 075: getfield org/lwjgl/opengl/ContextCapabilities.GL_EXT_blend_func_separate Z
      // 078: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07b: aastore
      // 07c: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 07f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 084: pop
      // 085: aload 6
      // 087: new hsu
      // 08a: dup
      // 08b: sipush 6988
      // 08e: ldc2_w 2249831836706316037
      // 091: lload 1
      // 092: lxor
      // 093: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: nop
      // 099: bipush 1
      // 09a: anewarray 61
      // 09d: dup
      // 09e: bipush 0
      // 09f: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 0a2: getfield org/lwjgl/opengl/ContextCapabilities.GL_ARB_framebuffer_object Z
      // 0a5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0a8: aastore
      // 0a9: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0ac: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b1: pop
      // 0b2: aload 6
      // 0b4: new hsu
      // 0b7: dup
      // 0b8: sipush 18787
      // 0bb: ldc2_w 24833881333419317
      // 0be: lload 1
      // 0bf: lxor
      // 0c0: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: nop
      // 0c6: bipush 1
      // 0c7: anewarray 61
      // 0ca: dup
      // 0cb: bipush 0
      // 0cc: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 0cf: getfield org/lwjgl/opengl/ContextCapabilities.GL_EXT_framebuffer_object Z
      // 0d2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d5: aastore
      // 0d6: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0d9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0de: pop
      // 0df: aload 4
      // 0e1: new b92
      // 0e4: dup
      // 0e5: aload 0
      // 0e6: getstatic b92$pwe.hre Lb92$pwe;
      // 0e9: aload 6
      // 0eb: invokespecial b92.<init> (Lgbe;Lb92$pwe;Ljava/util/List;)V
      // 0ee: invokevirtual Minecraft.z2i (Lgbe;)V
      // 0f1: iload 3
      // 0f2: ifne 386
      // 0f5: aload 5
      // 0f7: instanceof hux
      // 0fa: goto 101
      // 0fd: invokestatic b92.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 3
      // 102: ifeq 179
      // 105: ifeq 16b
      // 108: goto 10f
      // 10b: invokestatic b92.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 5
      // 111: checkcast hux
      // 114: invokevirtual hux.u21 ()Ljava/lang/Throwable;
      // 117: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 11a: sipush 19286
      // 11d: ldc2_w 6396838131191205659
      // 120: lload 1
      // 121: lxor
      // 122: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: nop
      // 128: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 12b: ifeq 150
      // 12e: goto 135
      // 131: invokestatic b92.a (Loov;)Loov;
      // 134: athrow
      // 135: aload 4
      // 137: new b92
      // 13a: dup
      // 13b: aload 0
      // 13c: getstatic b92$pwe.nnb Lb92$pwe;
      // 13f: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 142: invokevirtual Minecraft.z2i (Lgbe;)V
      // 145: iload 3
      // 146: ifne 386
      // 149: goto 150
      // 14c: invokestatic b92.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 4
      // 152: new b92
      // 155: dup
      // 156: aload 0
      // 157: getstatic b92$pwe.n5r Lb92$pwe;
      // 15a: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 15d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 160: iload 3
      // 161: ifne 386
      // 164: goto 16b
      // 167: invokestatic b92.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 5
      // 16d: invokeinterface tyh.cqw ()Z 1
      // 172: goto 179
      // 175: invokestatic b92.a (Loov;)Loov;
      // 178: athrow
      // 179: iload 3
      // 17a: ifeq 232
      // 17d: ifne 215
      // 180: goto 187
      // 183: invokestatic b92.a (Loov;)Loov;
      // 186: athrow
      // 187: aload 5
      // 189: invokeinterface tyh.qcn ()Ltv/twitch/ErrorCode; 1
      // 18e: getstatic tv/twitch/ErrorCode.TTV_EC_OS_TOO_OLD Ltv/twitch/ErrorCode;
      // 191: if_acmpne 215
      // 194: goto 19b
      // 197: invokestatic b92.a (Loov;)Loov;
      // 19a: athrow
      // 19b: getstatic b92$1.lqv [I
      // 19e: invokestatic gqf.oa6 ()Lgqf$auu;
      // 1a1: invokevirtual gqf$auu.ordinal ()I
      // 1a4: iaload
      // 1a5: lookupswitch 85 2 1 31 2 58
      // 1c0: invokestatic b92.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 4
      // 1c6: new b92
      // 1c9: dup
      // 1ca: aload 0
      // 1cb: getstatic b92$pwe.ch4 Lb92$pwe;
      // 1ce: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 1d1: invokevirtual Minecraft.z2i (Lgbe;)V
      // 1d4: iload 3
      // 1d5: ifne 386
      // 1d8: goto 1df
      // 1db: invokestatic b92.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 4
      // 1e1: new b92
      // 1e4: dup
      // 1e5: aload 0
      // 1e6: getstatic b92$pwe.das Lb92$pwe;
      // 1e9: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 1ec: invokevirtual Minecraft.z2i (Lgbe;)V
      // 1ef: iload 3
      // 1f0: ifne 386
      // 1f3: goto 1fa
      // 1f6: invokestatic b92.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: aload 4
      // 1fc: new b92
      // 1ff: dup
      // 200: aload 0
      // 201: getstatic b92$pwe.da5 Lb92$pwe;
      // 204: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 207: invokevirtual Minecraft.z2i (Lgbe;)V
      // 20a: iload 3
      // 20b: ifne 386
      // 20e: goto 215
      // 211: invokestatic b92.a (Loov;)Loov;
      // 214: athrow
      // 215: aload 4
      // 217: invokevirtual Minecraft.ka0 ()Lcom/mojang/authlib/properties/PropertyMap;
      // 21a: sipush 16861
      // 21d: ldc2_w 5076238874557957532
      // 220: lload 1
      // 221: lxor
      // 222: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: nop
      // 228: invokevirtual com/mojang/authlib/properties/PropertyMap.containsKey (Ljava/lang/Object;)Z
      // 22b: goto 232
      // 22e: invokestatic b92.a (Loov;)Loov;
      // 231: athrow
      // 232: iload 3
      // 233: ifeq 2af
      // 236: ifne 296
      // 239: goto 240
      // 23c: invokestatic b92.a (Loov;)Loov;
      // 23f: athrow
      // 240: aload 4
      // 242: iload 3
      // 243: ifeq 284
      // 246: goto 24d
      // 249: invokestatic b92.a (Loov;)Loov;
      // 24c: athrow
      // 24d: invokevirtual Minecraft.ee0 ()Lrh0;
      // 250: invokevirtual rh0.hlp ()Lrh0$dzx;
      // 253: getstatic rh0$dzx.hnt Lrh0$dzx;
      // 256: if_acmpne 27b
      // 259: goto 260
      // 25c: invokestatic b92.a (Loov;)Loov;
      // 25f: athrow
      // 260: aload 4
      // 262: new b92
      // 265: dup
      // 266: aload 0
      // 267: getstatic b92$pwe.w9s Lb92$pwe;
      // 26a: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 26d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 270: iload 3
      // 271: ifne 386
      // 274: goto 27b
      // 277: invokestatic b92.a (Loov;)Loov;
      // 27a: athrow
      // 27b: aload 4
      // 27d: goto 284
      // 280: invokestatic b92.a (Loov;)Loov;
      // 283: athrow
      // 284: new b92
      // 287: dup
      // 288: aload 0
      // 289: getstatic b92$pwe.wr8 Lb92$pwe;
      // 28c: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 28f: invokevirtual Minecraft.z2i (Lgbe;)V
      // 292: iload 3
      // 293: ifne 386
      // 296: aload 5
      // 298: iload 3
      // 299: ifeq 31f
      // 29c: goto 2a3
      // 29f: invokestatic b92.a (Loov;)Loov;
      // 2a2: athrow
      // 2a3: invokeinterface tyh.q_2 ()Z 1
      // 2a8: goto 2af
      // 2ab: invokestatic b92.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: ifne 316
      // 2b2: getstatic b92$1.gbl [I
      // 2b5: aload 5
      // 2b7: invokeinterface tyh.n1g ()Ltyh$s04; 1
      // 2bc: invokevirtual tyh$s04.ordinal ()I
      // 2bf: iaload
      // 2c0: lookupswitch 59 2 1 32 2 59
      // 2dc: invokestatic b92.a (Loov;)Loov;
      // 2df: athrow
      // 2e0: aload 4
      // 2e2: new b92
      // 2e5: dup
      // 2e6: aload 0
      // 2e7: getstatic b92$pwe._xb Lb92$pwe;
      // 2ea: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 2ed: invokevirtual Minecraft.z2i (Lgbe;)V
      // 2f0: iload 3
      // 2f1: ifne 386
      // 2f4: goto 2fb
      // 2f7: invokestatic b92.a (Loov;)Loov;
      // 2fa: athrow
      // 2fb: aload 4
      // 2fd: new b92
      // 300: dup
      // 301: aload 0
      // 302: getstatic b92$pwe.fb3 Lb92$pwe;
      // 305: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 308: invokevirtual Minecraft.z2i (Lgbe;)V
      // 30b: iload 3
      // 30c: ifne 386
      // 30f: goto 316
      // 312: invokestatic b92.a (Loov;)Loov;
      // 315: athrow
      // 316: aload 5
      // 318: goto 31f
      // 31b: invokestatic b92.a (Loov;)Loov;
      // 31e: athrow
      // 31f: invokeinterface tyh.qcn ()Ltv/twitch/ErrorCode; 1
      // 324: ifnull 36f
      // 327: bipush 1
      // 328: anewarray 59
      // 32b: dup
      // 32c: bipush 0
      // 32d: new hsu
      // 330: dup
      // 331: sipush 10968
      // 334: ldc2_w 2262836083138309776
      // 337: lload 1
      // 338: lxor
      // 339: invokedynamic b (IJ)Ljava/lang/String; bsm=b92.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: nop
      // 33f: bipush 1
      // 340: anewarray 61
      // 343: dup
      // 344: bipush 0
      // 345: aload 5
      // 347: invokeinterface tyh.qcn ()Ltv/twitch/ErrorCode; 1
      // 34c: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 34f: aastore
      // 350: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 353: aastore
      // 354: invokestatic java/util/Arrays.asList ([Ljava/lang/Object;)Ljava/util/List;
      // 357: astore 6
      // 359: aload 4
      // 35b: new b92
      // 35e: dup
      // 35f: aload 0
      // 360: getstatic b92$pwe.v4t Lb92$pwe;
      // 363: aload 6
      // 365: invokespecial b92.<init> (Lgbe;Lb92$pwe;Ljava/util/List;)V
      // 368: invokevirtual Minecraft.z2i (Lgbe;)V
      // 36b: iload 3
      // 36c: ifne 386
      // 36f: aload 4
      // 371: new b92
      // 374: dup
      // 375: aload 0
      // 376: getstatic b92$pwe.cf4 Lb92$pwe;
      // 379: invokespecial b92.<init> (Lgbe;Lb92$pwe;)V
      // 37c: invokevirtual Minecraft.z2i (Lgbe;)V
      // 37f: goto 386
      // 382: invokestatic b92.a (Loov;)Loov;
      // 385: athrow
      // 386: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7974962758789007766L, 4952111529128424076L, MethodHandles.lookup().lookupClass()).a(28371917841495L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100856793868704L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[18];
      int var7 = 0;
      String var6 = "Â)Sùñ\u0019a:\u0011È\u008få\u0003\u0091ÖÅy$D§\u0098\u0014ol\u0003\u0006Åó[òÐ,\u0099\u0088\u001f¬\u0085 QM\u0099m@&\tÊ\fô³;\u0093 d^oÝ@HKj·\fÂ\u0087³½\u0092ó¾ú¾\u001b_ðÜ\u000b\u0016M\u001c^\u0017Î\u0005¡S\u008eT\u0083Åc}*í\u0085À\u0005#Ô\\*¢÷\u0006°d\u0098ÎÍ\u009aÙ|\u001dçJ@å:\u0083æç\u000b\u0018Þ\u0080\u008f½i\u0090ÿ\u000fÂbùÄñ\u0091¹]\n\u00052\u0002D'z¿@2 \u009f\u0097¹@\u000ex\u0013<b\u0001úð'<ÀF¤!Û?ly\u0095XLþFî¦è\u0015GrQF\u0002+i7uÉ²ÝxrÛÃ[âäåU\u000b«Fí\u0093á~KÌ\u001a(\u0015\u001aôe\u0012\r¶\u001c©:x¸\u001dM\u0017g)ÏCoÝ\u0097ÀnÕ\u00ad¦\u0017þ)¯v}\u0019xùd¼M\u008d@2\u0015\u000bkl´\u0089á¹À×\u0006\u0017±ä\u008e)}hm´$\u0083KÊ\u0080ÍÚ¯\u0010GÔ\u0084\u0019íÿ\u001e\u00849d\u000fï\u008dÓ¼ï\u009dvÍÏNÂ»¹kF\u009b\u001b\u0006©#3\u009b3(ÇÀ\u008cS\u001bÒãÏ\u0000\t\u0015à\u0006§H\u0000/\u009a\u0004*T\u000f^\u0086ü2\nÜr§#×\u0003\u0018\rL\u00ad\u0013T© \u001e÷\u0014PhuXÐ¥\u0002\u001bDõ\u009bÜG|\u008e'Ã\u007f³\u0014\u000b(\fý)\u0016\u0097È\u000fH;\u0099a\u009dÛ\u0007\u0093Õz|\u0013\u008aÍ\u008b>o;g[@ö\u0016}\u0007`²£\u0082'@\u0083¤\u009cG¦÷Zz\u001cál\u001e±\u000e\u001f WiÒ8\u0012î\u0019 âí#\u0014\u001f\u009dû:þ\u001a\u0088>~COM\u0084ê\u0018¥)Í9\u0086µ%F\u0093\u0014|ûÔúk\u0010À¿¡\u0010®½Å5P¥½å\u0013È\u008e\b\u0019\f©¬\u009bLÎ_JI\u0019ÚHÐ$E«|\u009eý\u0002;Lãö\u0093â§+P8k¼n\u0092Âã\\ÞÃYÛÈ°\u0081\u009f/:\u009d~IÎÔ¶\u0003\u0011[ÔÛ!ÍÈèh\u0080Ð93O\u00127SQ8ÉVà\u000fËqñÙû\u00ad\u0006Å\u00814¤}Ìø~\u0097z\u001c\u000bGªöüKüòÏ\u0086Öx¸\u009f\u009dEJ r\u0017 ¯OÜ9\u000b6Ó\u000fÄ³w\u009b\u000b0\u0080<=#\u0099\u009d{ÿ¼\u00ad¬r¯\u0015\u0083²$äân\u0002(\u00912VmO\u0093LÐr\u0094ÖhË\u008dÎ\"`\u0004 \u009bÔÁg\u009a\u009cÊ\u0010åAtI# xe\u008ex\u0012m8á\u0013Ö8q\u001cUü\u0091¸\u0016ÑÖr\u0093Ú\u0090ìB\u007fîO\u001czÚxT¡\u001bÕt\u0006q\u00adQª,¨\u008d\u0084O05ÙÛ<\u008d?ç9õU*¤\u0087Y¶°\u0091dH¾®w\u008f±M÷Lq²íAvOÞ\u0006\u0088\u0005\u0016ig%\u001fkQ«¨\u0092\u0098\u009d3.Ó;J\u0013Dmää¡Ç\u0093\u0095Æà`¶ØÝ^Î{N¦½°Ú\u0011íÂåfÐ\u0003\u0084Ê\u0011\u008beôQ";
      int var8 = "Â)Sùñ\u0019a:\u0011È\u008få\u0003\u0091ÖÅy$D§\u0098\u0014ol\u0003\u0006Åó[òÐ,\u0099\u0088\u001f¬\u0085 QM\u0099m@&\tÊ\fô³;\u0093 d^oÝ@HKj·\fÂ\u0087³½\u0092ó¾ú¾\u001b_ðÜ\u000b\u0016M\u001c^\u0017Î\u0005¡S\u008eT\u0083Åc}*í\u0085À\u0005#Ô\\*¢÷\u0006°d\u0098ÎÍ\u009aÙ|\u001dçJ@å:\u0083æç\u000b\u0018Þ\u0080\u008f½i\u0090ÿ\u000fÂbùÄñ\u0091¹]\n\u00052\u0002D'z¿@2 \u009f\u0097¹@\u000ex\u0013<b\u0001úð'<ÀF¤!Û?ly\u0095XLþFî¦è\u0015GrQF\u0002+i7uÉ²ÝxrÛÃ[âäåU\u000b«Fí\u0093á~KÌ\u001a(\u0015\u001aôe\u0012\r¶\u001c©:x¸\u001dM\u0017g)ÏCoÝ\u0097ÀnÕ\u00ad¦\u0017þ)¯v}\u0019xùd¼M\u008d@2\u0015\u000bkl´\u0089á¹À×\u0006\u0017±ä\u008e)}hm´$\u0083KÊ\u0080ÍÚ¯\u0010GÔ\u0084\u0019íÿ\u001e\u00849d\u000fï\u008dÓ¼ï\u009dvÍÏNÂ»¹kF\u009b\u001b\u0006©#3\u009b3(ÇÀ\u008cS\u001bÒãÏ\u0000\t\u0015à\u0006§H\u0000/\u009a\u0004*T\u000f^\u0086ü2\nÜr§#×\u0003\u0018\rL\u00ad\u0013T© \u001e÷\u0014PhuXÐ¥\u0002\u001bDõ\u009bÜG|\u008e'Ã\u007f³\u0014\u000b(\fý)\u0016\u0097È\u000fH;\u0099a\u009dÛ\u0007\u0093Õz|\u0013\u008aÍ\u008b>o;g[@ö\u0016}\u0007`²£\u0082'@\u0083¤\u009cG¦÷Zz\u001cál\u001e±\u000e\u001f WiÒ8\u0012î\u0019 âí#\u0014\u001f\u009dû:þ\u001a\u0088>~COM\u0084ê\u0018¥)Í9\u0086µ%F\u0093\u0014|ûÔúk\u0010À¿¡\u0010®½Å5P¥½å\u0013È\u008e\b\u0019\f©¬\u009bLÎ_JI\u0019ÚHÐ$E«|\u009eý\u0002;Lãö\u0093â§+P8k¼n\u0092Âã\\ÞÃYÛÈ°\u0081\u009f/:\u009d~IÎÔ¶\u0003\u0011[ÔÛ!ÍÈèh\u0080Ð93O\u00127SQ8ÉVà\u000fËqñÙû\u00ad\u0006Å\u00814¤}Ìø~\u0097z\u001c\u000bGªöüKüòÏ\u0086Öx¸\u009f\u009dEJ r\u0017 ¯OÜ9\u000b6Ó\u000fÄ³w\u009b\u000b0\u0080<=#\u0099\u009d{ÿ¼\u00ad¬r¯\u0015\u0083²$äân\u0002(\u00912VmO\u0093LÐr\u0094ÖhË\u008dÎ\"`\u0004 \u009bÔÁg\u009a\u009cÊ\u0010åAtI# xe\u008ex\u0012m8á\u0013Ö8q\u001cUü\u0091¸\u0016ÑÖr\u0093Ú\u0090ìB\u007fîO\u001czÚxT¡\u001bÕt\u0006q\u00adQª,¨\u008d\u0084O05ÙÛ<\u008d?ç9õU*¤\u0087Y¶°\u0091dH¾®w\u008f±M÷Lq²íAvOÞ\u0006\u0088\u0005\u0016ig%\u001fkQ«¨\u0092\u0098\u009d3.Ó;J\u0013Dmää¡Ç\u0093\u0095Æà`¶ØÝ^Î{N¦½°Ú\u0011íÂåfÐ\u0003\u0084Ê\u0011\u008beôQ"
         .length();
      char var5 = '8';
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
                     g = new String[18];
                     r9o = LogManager.getLogger();
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

                  var6 = "\u0087s6¹\u001d-Z×äzwÃ\u0097f\u0095\u0091xÑVíí¼Í!<o\u0012\u0080.¿Ô\u008b\r\u0093\u0085,\u0005x\f]0uþÑ¯¾¾SO\u000eE\u0007\u009cõó!\u0089Ò¶<sco\u0006w\u0098\u0018äWã`w\u0004®õM\u0087J¬\u001a\u008f¾\u009ay(áæ\u0095\u0086";
                  var8 = "\u0087s6¹\u001d-Z×äzwÃ\u0097f\u0095\u0091xÑVíí¼Í!<o\u0012\u0080.¿Ô\u008b\r\u0093\u0085,\u0005x\f]0uþÑ¯¾¾SO\u000eE\u0007\u009cõó!\u0089Ò¶<sco\u0006w\u0098\u0018äWã`w\u0004®õM\u0087J¬\u001a\u008f¾\u009ay(áæ\u0095\u0086"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24103;
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
            throw new RuntimeException("b92", var10);
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
         throw new RuntimeException("b92" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
