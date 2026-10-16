import java.nio.Buffer;
import java.nio.IntBuffer;

public class ko7 extends ofj {
   public IntBuffer vbf = nkx._5e(16);

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
      // 005: getfield ko7.rc3 Z
      // 008: iload 2
      // 009: ifeq 019
      // 00c: ifeq 1bc
      // 00f: goto 016
      // 012: invokestatic ko7.a (Loov;)Loov;
      // 015: athrow
      // 016: invokestatic hxt._al ()Z
      // 019: iload 2
      // 01a: ifeq 083
      // 01d: ifne 079
      // 020: goto 027
      // 023: invokestatic ko7.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 0
      // 028: getfield ko7.f2k Ljava/util/List;
      // 02b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 030: astore 3
      // 031: aload 3
      // 032: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 037: ifeq 075
      // 03a: aload 3
      // 03b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 040: checkcast kqk
      // 043: astore 4
      // 045: aload 4
      // 047: checkcast cbo
      // 04a: astore 5
      // 04c: invokestatic hzu.dp2 ()V
      // 04f: aload 0
      // 050: aload 4
      // 052: invokevirtual ko7.g19 (Lkqk;)V
      // 055: aload 5
      // 057: aload 1
      // 058: aload 5
      // 05a: invokevirtual cbo.fw8 ()Lcbc;
      // 05d: invokevirtual cbo._yp (Lw51;Lcbc;)I
      // 060: invokestatic org/lwjgl/opengl/GL11.glCallList (I)V
      // 063: invokestatic hzu.x3w ()V
      // 066: iload 2
      // 067: ifeq 1a7
      // 06a: iload 2
      // 06b: ifne 031
      // 06e: goto 075
      // 071: invokestatic ko7.a (Loov;)Loov;
      // 074: athrow
      // 075: iload 2
      // 076: ifne 1a7
      // 079: ldc -2147483648
      // 07b: nop
      // 07c: goto 083
      // 07f: invokestatic ko7.a (Loov;)Loov;
      // 082: athrow
      // 083: istore 3
      // 084: ldc -2147483648
      // 086: nop
      // 087: istore 4
      // 089: aload 0
      // 08a: getfield ko7.f2k Ljava/util/List;
      // 08d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 092: astore 5
      // 094: aload 5
      // 096: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09b: ifeq 180
      // 09e: aload 5
      // 0a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a5: checkcast kqk
      // 0a8: astore 6
      // 0aa: aload 6
      // 0ac: checkcast cbo
      // 0af: astore 7
      // 0b1: iload 3
      // 0b2: iload 2
      // 0b3: ifeq 187
      // 0b6: iload 2
      // 0b7: ifeq 0fa
      // 0ba: goto 0c1
      // 0bd: invokestatic ko7.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 6
      // 0c3: getfield kqk.bxz I
      // 0c6: if_icmpne 0ec
      // 0c9: goto 0d0
      // 0cc: invokestatic ko7.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: iload 4
      // 0d2: aload 6
      // 0d4: getfield kqk.m9o I
      // 0d7: iload 2
      // 0d8: ifeq 140
      // 0db: goto 0e2
      // 0de: invokestatic ko7.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: if_icmpeq 127
      // 0e5: goto 0ec
      // 0e8: invokestatic ko7.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 0f0: invokevirtual java/nio/IntBuffer.position ()I
      // 0f3: goto 0fa
      // 0f6: invokestatic ko7.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 2
      // 0fb: ifeq 125
      // 0fe: ifle 11a
      // 101: goto 108
      // 104: invokestatic ko7.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: iload 3
      // 10a: iload 4
      // 10c: aload 0
      // 10d: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 110: invokespecial ko7.ht6 (IILjava/nio/IntBuffer;)V
      // 113: goto 11a
      // 116: invokestatic ko7.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 6
      // 11c: getfield kqk.bxz I
      // 11f: istore 3
      // 120: aload 6
      // 122: getfield kqk.m9o I
      // 125: istore 4
      // 127: aload 0
      // 128: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 12b: iload 2
      // 12c: ifeq 17b
      // 12f: invokevirtual java/nio/IntBuffer.position ()I
      // 132: aload 0
      // 133: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 136: invokevirtual java/nio/IntBuffer.capacity ()I
      // 139: goto 140
      // 13c: invokestatic ko7.a (Loov;)Loov;
      // 13f: athrow
      // 140: if_icmplt 169
      // 143: aload 0
      // 144: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 147: invokevirtual java/nio/IntBuffer.capacity ()I
      // 14a: bipush 2
      // 14b: imul
      // 14c: invokestatic nkx._5e (I)Ljava/nio/IntBuffer;
      // 14f: astore 8
      // 151: aload 0
      // 152: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 155: invokevirtual java/nio/IntBuffer.flip ()Ljava/nio/Buffer;
      // 158: pop
      // 159: aload 8
      // 15b: aload 0
      // 15c: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 15f: invokevirtual java/nio/IntBuffer.put (Ljava/nio/IntBuffer;)Ljava/nio/IntBuffer;
      // 162: pop
      // 163: aload 0
      // 164: aload 8
      // 166: putfield ko7.vbf Ljava/nio/IntBuffer;
      // 169: aload 0
      // 16a: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 16d: aload 7
      // 16f: aload 1
      // 170: aload 7
      // 172: invokevirtual cbo.fw8 ()Lcbc;
      // 175: invokevirtual cbo._yp (Lw51;Lcbc;)I
      // 178: invokevirtual java/nio/IntBuffer.put (I)Ljava/nio/IntBuffer;
      // 17b: pop
      // 17c: iload 2
      // 17d: ifne 094
      // 180: aload 0
      // 181: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 184: invokevirtual java/nio/IntBuffer.position ()I
      // 187: iload 2
      // 188: ifeq 1aa
      // 18b: ifle 1a7
      // 18e: goto 195
      // 191: invokestatic ko7.a (Loov;)Loov;
      // 194: athrow
      // 195: aload 0
      // 196: iload 3
      // 197: iload 4
      // 199: aload 0
      // 19a: getfield ko7.vbf Ljava/nio/IntBuffer;
      // 19d: invokespecial ko7.ht6 (IILjava/nio/IntBuffer;)V
      // 1a0: goto 1a7
      // 1a3: invokestatic ko7.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: invokestatic hxt.jty ()Z
      // 1aa: ifeq 1b0
      // 1ad: invokestatic hzu.s_l ()V
      // 1b0: invokestatic hzu.u49 ()V
      // 1b3: aload 0
      // 1b4: getfield ko7.f2k Ljava/util/List;
      // 1b7: invokeinterface java/util/List.clear ()V 1
      // 1bc: return
   }

   @Override
   public void wyf(double var1, double var3, double var5) {
      this.lb0 = var1;
      this.y48 = var3;
      this.b3w = var5;
      super.wyf(var1, var3, var5);
   }

   private void ht6(int var1, int var2, IntBuffer var3) {
      hzu.dp2();
      this.tjt(var1, 0, var2);
      ((Buffer)var3).flip();
      hzu.jzt(var3);
      ((Buffer)var3).clear();
      hzu.x3w();
   }

   public void tjt(int var1, int var2, int var3) {
      hzu.a4k((float)((double)var1 - this.lb0), (float)((double)var2 - this.y48), (float)((double)var3 - this.b3w));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
