import java.util.Random;

public class m03 extends cdu {
   public m03(e0x var1, int var2) {
      super(false);
      this.w0q = var1;
      this.lq6 = var2;
   }

   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 3
      // 006: invokevirtual mew.getY ()I
      // 009: bipush 3
      // 00a: if_icmple 08a
      // 00d: aload 1
      // 00e: aload 3
      // 00f: invokevirtual mew.eve ()Lmew;
      // 012: iload 4
      // 014: ifeq 03f
      // 017: goto 01e
      // 01a: invokestatic m03.a (Loov;)Loov;
      // 01d: athrow
      // 01e: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 021: iload 4
      // 023: ifeq 08e
      // 026: goto 02d
      // 029: invokestatic m03.a (Loov;)Loov;
      // 02c: athrow
      // 02d: ifeq 03a
      // 030: goto 037
      // 033: invokestatic m03.a (Loov;)Loov;
      // 036: athrow
      // 037: goto 1aa
      // 03a: aload 1
      // 03b: aload 3
      // 03c: invokevirtual mew.eve ()Lmew;
      // 03f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 042: invokeinterface zfz.r_y ()Le0x; 1
      // 047: astore 5
      // 049: aload 5
      // 04b: getstatic ox_.l11 Lx82;
      // 04e: iload 4
      // 050: ifeq 069
      // 053: if_acmpeq 08a
      // 056: goto 05d
      // 059: invokestatic m03.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 5
      // 05f: getstatic ox_.kqk Le0x;
      // 062: goto 069
      // 065: invokestatic m03.a (Loov;)Loov;
      // 068: athrow
      // 069: iload 4
      // 06b: ifeq 084
      // 06e: if_acmpeq 08a
      // 071: goto 078
      // 074: invokestatic m03.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 5
      // 07a: getstatic ox_.pu8 Le0x;
      // 07d: goto 084
      // 080: invokestatic m03.a (Loov;)Loov;
      // 083: athrow
      // 084: if_acmpeq 08a
      // 087: goto 1aa
      // 08a: aload 3
      // 08b: invokevirtual mew.getY ()I
      // 08e: iload 4
      // 090: ifeq 0a8
      // 093: bipush 3
      // 094: if_icmpgt 0a4
      // 097: goto 09e
      // 09a: invokestatic m03.a (Loov;)Loov;
      // 09d: athrow
      // 09e: bipush 0
      // 09f: ireturn
      // 0a0: invokestatic m03.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield m03.lq6 I
      // 0a8: istore 5
      // 0aa: bipush 0
      // 0ab: istore 6
      // 0ad: iload 5
      // 0af: iflt 1a8
      // 0b2: iload 6
      // 0b4: iload 4
      // 0b6: ifeq 1a9
      // 0b9: iload 4
      // 0bb: ifeq 1a9
      // 0be: goto 0c5
      // 0c1: invokestatic m03.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: bipush 3
      // 0c6: if_icmpge 1a8
      // 0c9: goto 0d0
      // 0cc: invokestatic m03.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: iload 5
      // 0d2: aload 2
      // 0d3: bipush 2
      // 0d4: invokevirtual java/util/Random.nextInt (I)I
      // 0d7: iadd
      // 0d8: istore 7
      // 0da: iload 5
      // 0dc: aload 2
      // 0dd: bipush 2
      // 0de: invokevirtual java/util/Random.nextInt (I)I
      // 0e1: iadd
      // 0e2: istore 8
      // 0e4: iload 5
      // 0e6: aload 2
      // 0e7: bipush 2
      // 0e8: invokevirtual java/util/Random.nextInt (I)I
      // 0eb: iadd
      // 0ec: istore 9
      // 0ee: iload 7
      // 0f0: iload 8
      // 0f2: iadd
      // 0f3: iload 9
      // 0f5: iadd
      // 0f6: i2f
      // 0f7: ldc 0.333
      // 0f9: nop
      // 0fa: fmul
      // 0fb: ldc 0.5
      // 0fd: nop
      // 0fe: fadd
      // 0ff: fstore 10
      // 101: aload 3
      // 102: iload 7
      // 104: ineg
      // 105: iload 8
      // 107: ineg
      // 108: iload 9
      // 10a: ineg
      // 10b: invokevirtual mew.ec4 (III)Lmew;
      // 10e: aload 3
      // 10f: iload 7
      // 111: iload 8
      // 113: iload 9
      // 115: invokevirtual mew.ec4 (III)Lmew;
      // 118: invokestatic mew.kil (Lmew;Lmew;)Ljava/lang/Iterable;
      // 11b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 120: astore 11
      // 122: aload 11
      // 124: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 129: ifeq 174
      // 12c: aload 11
      // 12e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 133: checkcast mew
      // 136: astore 12
      // 138: aload 12
      // 13a: aload 3
      // 13b: invokevirtual mew.t0u (Lwgo;)D
      // 13e: fload 10
      // 140: fload 10
      // 142: fmul
      // 143: f2d
      // 144: dcmpg
      // 145: iload 4
      // 147: ifeq 0af
      // 14a: iload 4
      // 14c: ifeq 16e
      // 14f: ifgt 16f
      // 152: goto 159
      // 155: invokestatic m03.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 1
      // 15a: aload 12
      // 15c: aload 0
      // 15d: getfield m03.w0q Le0x;
      // 160: invokevirtual e0x.l4i ()Lzfz;
      // 163: bipush 4
      // 164: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 167: goto 16e
      // 16a: invokestatic m03.a (Loov;)Loov;
      // 16d: athrow
      // 16e: pop
      // 16f: iload 4
      // 171: ifne 122
      // 174: aload 3
      // 175: iload 5
      // 177: bipush 1
      // 178: iadd
      // 179: ineg
      // 17a: aload 2
      // 17b: bipush 2
      // 17c: iload 5
      // 17e: bipush 2
      // 17f: imul
      // 180: iadd
      // 181: invokevirtual java/util/Random.nextInt (I)I
      // 184: iadd
      // 185: bipush 0
      // 186: aload 2
      // 187: bipush 2
      // 188: invokevirtual java/util/Random.nextInt (I)I
      // 18b: isub
      // 18c: iload 5
      // 18e: bipush 1
      // 18f: iadd
      // 190: ineg
      // 191: aload 2
      // 192: bipush 2
      // 193: iload 5
      // 195: bipush 2
      // 196: imul
      // 197: iadd
      // 198: invokevirtual java/util/Random.nextInt (I)I
      // 19b: iadd
      // 19c: invokevirtual mew.ec4 (III)Lmew;
      // 19f: astore 3
      // 1a0: iinc 6 1
      // 1a3: iload 4
      // 1a5: ifne 0ad
      // 1a8: bipush 1
      // 1a9: ireturn
      // 1aa: aload 3
      // 1ab: invokevirtual mew.eve ()Lmew;
      // 1ae: astore 3
      // 1af: goto 005
   }

   private static oov a(oov var0) {
      return var0;
   }
}
