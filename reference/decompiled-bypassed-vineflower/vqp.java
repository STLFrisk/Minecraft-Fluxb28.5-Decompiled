import java.util.List;
import java.util.Random;

public class vqp extends cdu {
   public vqp(List var1, int var2) {
      this.f1y = var1;
      this.e2g = var2;
   }

   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 00a: invokeinterface zfz.r_y ()Le0x; 1
      // 00f: dup
      // 010: astore 5
      // 012: invokevirtual e0x.p1r ()Lp3y;
      // 015: getstatic p3y.cei Lp3y;
      // 018: if_acmpeq 026
      // 01b: aload 5
      // 01d: invokevirtual e0x.p1r ()Lp3y;
      // 020: getstatic p3y.hh1 Lp3y;
      // 023: if_acmpne 04b
      // 026: aload 3
      // 027: invokevirtual mew.getY ()I
      // 02a: bipush 1
      // 02b: iload 4
      // 02d: ifne 05c
      // 030: goto 037
      // 033: invokestatic vqp.a (Loov;)Loov;
      // 036: athrow
      // 037: if_icmple 04b
      // 03a: goto 041
      // 03d: invokestatic vqp.a (Loov;)Loov;
      // 040: athrow
      // 041: aload 3
      // 042: invokevirtual mew.eve ()Lmew;
      // 045: astore 3
      // 046: iload 4
      // 048: ifeq 005
      // 04b: aload 3
      // 04c: invokevirtual mew.getY ()I
      // 04f: iload 4
      // 051: ifne 06b
      // 054: bipush 1
      // 055: goto 05c
      // 058: invokestatic vqp.a (Loov;)Loov;
      // 05b: athrow
      // 05c: if_icmpge 065
      // 05f: bipush 0
      // 060: ireturn
      // 061: invokestatic vqp.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 3
      // 066: invokevirtual mew.nuv ()Lmew;
      // 069: astore 3
      // 06a: bipush 0
      // 06b: istore 6
      // 06d: iload 6
      // 06f: bipush 4
      // 070: if_icmpge 261
      // 073: aload 3
      // 074: aload 2
      // 075: bipush 4
      // 076: invokevirtual java/util/Random.nextInt (I)I
      // 079: aload 2
      // 07a: bipush 4
      // 07b: invokevirtual java/util/Random.nextInt (I)I
      // 07e: isub
      // 07f: aload 2
      // 080: bipush 3
      // 081: invokevirtual java/util/Random.nextInt (I)I
      // 084: aload 2
      // 085: bipush 3
      // 086: invokevirtual java/util/Random.nextInt (I)I
      // 089: isub
      // 08a: aload 2
      // 08b: bipush 4
      // 08c: invokevirtual java/util/Random.nextInt (I)I
      // 08f: aload 2
      // 090: bipush 4
      // 091: invokevirtual java/util/Random.nextInt (I)I
      // 094: isub
      // 095: invokevirtual mew.ec4 (III)Lmew;
      // 098: astore 7
      // 09a: iload 4
      // 09c: ifne 25c
      // 09f: aload 1
      // 0a0: aload 7
      // 0a2: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 0a5: iload 4
      // 0a7: ifne 262
      // 0aa: goto 0b1
      // 0ad: invokestatic vqp.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: ifeq 259
      // 0b4: goto 0bb
      // 0b7: invokestatic vqp.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: aload 7
      // 0be: invokevirtual mew.eve ()Lmew;
      // 0c1: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 0c4: iload 4
      // 0c6: ifne 0ee
      // 0c9: goto 0d0
      // 0cc: invokestatic vqp.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: ifeq 259
      // 0d3: goto 0da
      // 0d6: invokestatic vqp.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 1
      // 0db: aload 7
      // 0dd: getstatic ox_.cug Lhrd;
      // 0e0: invokevirtual hrd.l4i ()Lzfz;
      // 0e3: bipush 2
      // 0e4: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0e7: goto 0ee
      // 0ea: invokestatic vqp.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: pop
      // 0ef: aload 1
      // 0f0: aload 7
      // 0f2: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 0f5: astore 8
      // 0f7: aload 8
      // 0f9: instanceof net/minecraft/tileentity/TileEntityChest
      // 0fc: ifeq 117
      // 0ff: aload 2
      // 100: aload 0
      // 101: getfield vqp.f1y Ljava/util/List;
      // 104: aload 8
      // 106: checkcast net/minecraft/tileentity/TileEntityChest
      // 109: aload 0
      // 10a: getfield vqp.e2g I
      // 10d: invokestatic ypi.hut (Ljava/util/Random;Ljava/util/List;Lrsi;I)V
      // 110: goto 117
      // 113: invokestatic vqp.a (Loov;)Loov;
      // 116: athrow
      // 117: aload 7
      // 119: invokevirtual mew.o_8 ()Lmew;
      // 11c: astore 9
      // 11e: aload 7
      // 120: invokevirtual mew.y8e ()Lmew;
      // 123: astore 10
      // 125: aload 7
      // 127: invokevirtual mew.idu ()Lmew;
      // 12a: astore 11
      // 12c: aload 7
      // 12e: invokevirtual mew.z6x ()Lmew;
      // 131: astore 12
      // 133: aload 1
      // 134: aload 10
      // 136: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 139: iload 4
      // 13b: ifne 182
      // 13e: ifeq 17c
      // 141: goto 148
      // 144: invokestatic vqp.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 1
      // 149: aload 10
      // 14b: invokevirtual mew.eve ()Lmew;
      // 14e: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 151: iload 4
      // 153: ifne 182
      // 156: goto 15d
      // 159: invokestatic vqp.a (Loov;)Loov;
      // 15c: athrow
      // 15d: ifeq 17c
      // 160: goto 167
      // 163: invokestatic vqp.a (Loov;)Loov;
      // 166: athrow
      // 167: aload 1
      // 168: aload 10
      // 16a: getstatic ox_.gt8 Le0x;
      // 16d: invokevirtual e0x.l4i ()Lzfz;
      // 170: bipush 2
      // 171: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 174: pop
      // 175: goto 17c
      // 178: invokestatic vqp.a (Loov;)Loov;
      // 17b: athrow
      // 17c: aload 1
      // 17d: aload 9
      // 17f: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 182: iload 4
      // 184: ifne 1cb
      // 187: ifeq 1c5
      // 18a: goto 191
      // 18d: invokestatic vqp.a (Loov;)Loov;
      // 190: athrow
      // 191: aload 1
      // 192: aload 9
      // 194: invokevirtual mew.eve ()Lmew;
      // 197: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 19a: iload 4
      // 19c: ifne 1cb
      // 19f: goto 1a6
      // 1a2: invokestatic vqp.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: ifeq 1c5
      // 1a9: goto 1b0
      // 1ac: invokestatic vqp.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: aload 1
      // 1b1: aload 9
      // 1b3: getstatic ox_.gt8 Le0x;
      // 1b6: invokevirtual e0x.l4i ()Lzfz;
      // 1b9: bipush 2
      // 1ba: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1bd: pop
      // 1be: goto 1c5
      // 1c1: invokestatic vqp.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 1
      // 1c6: aload 11
      // 1c8: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 1cb: iload 4
      // 1cd: ifne 214
      // 1d0: ifeq 20e
      // 1d3: goto 1da
      // 1d6: invokestatic vqp.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: aload 1
      // 1db: aload 11
      // 1dd: invokevirtual mew.eve ()Lmew;
      // 1e0: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 1e3: iload 4
      // 1e5: ifne 214
      // 1e8: goto 1ef
      // 1eb: invokestatic vqp.a (Loov;)Loov;
      // 1ee: athrow
      // 1ef: ifeq 20e
      // 1f2: goto 1f9
      // 1f5: invokestatic vqp.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: aload 1
      // 1fa: aload 11
      // 1fc: getstatic ox_.gt8 Le0x;
      // 1ff: invokevirtual e0x.l4i ()Lzfz;
      // 202: bipush 2
      // 203: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 206: pop
      // 207: goto 20e
      // 20a: invokestatic vqp.a (Loov;)Loov;
      // 20d: athrow
      // 20e: aload 1
      // 20f: aload 12
      // 211: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 214: iload 4
      // 216: ifne 258
      // 219: ifeq 257
      // 21c: goto 223
      // 21f: invokestatic vqp.a (Loov;)Loov;
      // 222: athrow
      // 223: aload 1
      // 224: aload 12
      // 226: invokevirtual mew.eve ()Lmew;
      // 229: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 22c: iload 4
      // 22e: ifne 258
      // 231: goto 238
      // 234: invokestatic vqp.a (Loov;)Loov;
      // 237: athrow
      // 238: ifeq 257
      // 23b: goto 242
      // 23e: invokestatic vqp.a (Loov;)Loov;
      // 241: athrow
      // 242: aload 1
      // 243: aload 12
      // 245: getstatic ox_.gt8 Le0x;
      // 248: invokevirtual e0x.l4i ()Lzfz;
      // 24b: bipush 2
      // 24c: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 24f: pop
      // 250: goto 257
      // 253: invokestatic vqp.a (Loov;)Loov;
      // 256: athrow
      // 257: bipush 1
      // 258: ireturn
      // 259: iinc 6 1
      // 25c: iload 4
      // 25e: ifeq 06d
      // 261: bipush 0
      // 262: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
