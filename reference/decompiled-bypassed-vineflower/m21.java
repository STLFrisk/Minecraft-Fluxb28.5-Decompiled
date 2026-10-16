import net.optifine.render.VboRegion;

public class m21 extends ofj {
   @Override
   public void ebu(w51 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield m21.rc3 Z
      // 008: iload 2
      // 009: ifeq 019
      // 00c: ifeq 177
      // 00f: goto 016
      // 012: invokestatic m21.a (Loov;)Loov;
      // 015: athrow
      // 016: invokestatic hxt._al ()Z
      // 019: iload 2
      // 01a: ifeq 08e
      // 01d: ifne 084
      // 020: goto 027
      // 023: invokestatic m21.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 0
      // 028: getfield m21.f2k Ljava/util/List;
      // 02b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 030: astore 3
      // 031: aload 3
      // 032: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 037: ifeq 080
      // 03a: aload 3
      // 03b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 040: checkcast kqk
      // 043: astore 4
      // 045: aload 4
      // 047: aload 1
      // 048: invokevirtual w51.ordinal ()I
      // 04b: invokevirtual kqk.lry (I)Lfab;
      // 04e: astore 5
      // 050: invokestatic hzu.dp2 ()V
      // 053: aload 0
      // 054: aload 4
      // 056: invokevirtual m21.g19 (Lkqk;)V
      // 059: aload 4
      // 05b: invokevirtual kqk.ft_ ()V
      // 05e: aload 5
      // 060: invokevirtual fab.qez ()V
      // 063: aload 0
      // 064: invokevirtual m21.yck ()V
      // 067: aload 5
      // 069: bipush 7
      // 06b: invokevirtual fab.stg (I)V
      // 06e: invokestatic hzu.x3w ()V
      // 071: iload 2
      // 072: ifeq 16e
      // 075: iload 2
      // 076: ifne 031
      // 079: goto 080
      // 07c: invokestatic m21.a (Loov;)Loov;
      // 07f: athrow
      // 080: iload 2
      // 081: ifne 164
      // 084: ldc -2147483648
      // 086: nop
      // 087: goto 08e
      // 08a: invokestatic m21.a (Loov;)Loov;
      // 08d: athrow
      // 08e: istore 3
      // 08f: ldc -2147483648
      // 091: nop
      // 092: istore 4
      // 094: aconst_null
      // 095: astore 5
      // 097: aload 0
      // 098: getfield m21.f2k Ljava/util/List;
      // 09b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a0: astore 6
      // 0a2: aload 6
      // 0a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a9: ifeq 14f
      // 0ac: aload 6
      // 0ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b3: checkcast kqk
      // 0b6: astore 7
      // 0b8: aload 7
      // 0ba: aload 1
      // 0bb: invokevirtual w51.ordinal ()I
      // 0be: invokevirtual kqk.lry (I)Lfab;
      // 0c1: astore 8
      // 0c3: aload 8
      // 0c5: invokevirtual fab.qb8 ()Lnet/optifine/render/VboRegion;
      // 0c8: astore 9
      // 0ca: aload 9
      // 0cc: iload 2
      // 0cd: ifeq 151
      // 0d0: iload 2
      // 0d1: ifeq 115
      // 0d4: goto 0db
      // 0d7: invokestatic m21.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 5
      // 0dd: if_acmpne 113
      // 0e0: goto 0e7
      // 0e3: invokestatic m21.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 3
      // 0e8: aload 7
      // 0ea: getfield kqk.bxz I
      // 0ed: iload 2
      // 0ee: ifeq 110
      // 0f1: goto 0f8
      // 0f4: invokestatic m21.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: if_icmpne 113
      // 0fb: goto 102
      // 0fe: invokestatic m21.a (Loov;)Loov;
      // 101: athrow
      // 102: iload 4
      // 104: aload 7
      // 106: getfield kqk.m9o I
      // 109: goto 110
      // 10c: invokestatic m21.a (Loov;)Loov;
      // 10f: athrow
      // 110: if_icmpeq 144
      // 113: aload 5
      // 115: iload 2
      // 116: ifeq 142
      // 119: ifnull 133
      // 11c: goto 123
      // 11f: invokestatic m21.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 0
      // 124: iload 3
      // 125: iload 4
      // 127: aload 5
      // 129: invokespecial m21.z2w (IILnet/optifine/render/VboRegion;)V
      // 12c: goto 133
      // 12f: invokestatic m21.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 7
      // 135: getfield kqk.bxz I
      // 138: istore 3
      // 139: aload 7
      // 13b: getfield kqk.m9o I
      // 13e: istore 4
      // 140: aload 9
      // 142: astore 5
      // 144: aload 8
      // 146: bipush 7
      // 148: invokevirtual fab.stg (I)V
      // 14b: iload 2
      // 14c: ifne 0a2
      // 14f: aload 5
      // 151: ifnull 164
      // 154: aload 0
      // 155: iload 3
      // 156: iload 4
      // 158: aload 5
      // 15a: invokespecial m21.z2w (IILnet/optifine/render/VboRegion;)V
      // 15d: goto 164
      // 160: invokestatic m21.a (Loov;)Loov;
      // 163: athrow
      // 164: getstatic gis.m0a I
      // 167: bipush 0
      // 168: invokestatic gis.h99 (II)V
      // 16b: invokestatic hzu.u49 ()V
      // 16e: aload 0
      // 16f: getfield m21.f2k Ljava/util/List;
      // 172: invokeinterface java/util/List.clear ()V 1
      // 177: return
   }

   public void yck() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 1
      // 08: ifne 61
      // 0b: ifeq 23
      // 0e: goto 15
      // 11: invokestatic m21.a (Loov;)Loov;
      // 14: athrow
      // 15: invokestatic net/optifine/shaders/ShadersRender.setupArrayPointersVbo ()V
      // 18: iload 1
      // 19: ifeq 64
      // 1c: goto 23
      // 1f: invokestatic m21.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 3
      // 24: sipush 5126
      // 27: bipush 28
      // 29: lconst_0
      // 2a: invokestatic org/lwjgl/opengl/GL11.glVertexPointer (IIIJ)V
      // 2d: bipush 4
      // 2e: sipush 5121
      // 31: bipush 28
      // 33: ldc2_w 12
      // 36: invokestatic org/lwjgl/opengl/GL11.glColorPointer (IIIJ)V
      // 39: bipush 2
      // 3a: sipush 5126
      // 3d: bipush 28
      // 3f: ldc2_w 16
      // 42: invokestatic org/lwjgl/opengl/GL11.glTexCoordPointer (IIIJ)V
      // 45: getstatic gis.exn I
      // 48: invokestatic gis.vt4 (I)V
      // 4b: bipush 2
      // 4c: sipush 5122
      // 4f: bipush 28
      // 51: ldc2_w 24
      // 54: invokestatic org/lwjgl/opengl/GL11.glTexCoordPointer (IIIJ)V
      // 57: getstatic gis.z1w I
      // 5a: goto 61
      // 5d: invokestatic m21.a (Loov;)Loov;
      // 60: athrow
      // 61: invokestatic gis.vt4 (I)V
      // 64: return
   }

   @Override
   public void wyf(double var1, double var3, double var5) {
      this.gq1 = var1;
      this.sa_ = var3;
      this.s4q = var5;
      super.wyf(var1, var3, var5);
   }

   private void z2w(int var1, int var2, VboRegion var3) {
      hzu.dp2();
      this.mkz(var1, 0, var2);
      var3.finishDraw(this);
      hzu.x3w();
   }

   public void mkz(int var1, int var2, int var3) {
      hzu.a4k((float)((double)var1 - this.gq1), (float)((double)var2 - this.sa_), (float)((double)var3 - this.s4q));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
