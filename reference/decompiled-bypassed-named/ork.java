import java.util.Random;

public class ork extends cdu {
   private e0x t3j;

   public ork(e0x var1) {
      this.t3j = var1;
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 00a: iload 4
      // 00c: ifne 210
      // 00f: ifeq 20f
      // 012: goto 019
      // 015: invokestatic ork.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 1
      // 01a: aload 3
      // 01b: invokevirtual mew.eve ()Lmew;
      // 01e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 021: invokeinterface zfz.r_y ()Le0x; 1
      // 026: aload 0
      // 027: getfield ork.t3j Le0x;
      // 02a: if_acmpne 20f
      // 02d: goto 034
      // 030: invokestatic ork.a (Loov;)Loov;
      // 033: athrow
      // 034: aload 2
      // 035: bipush 32
      // 037: invokevirtual java/util/Random.nextInt (I)I
      // 03a: bipush 6
      // 03c: iadd
      // 03d: istore 5
      // 03f: aload 2
      // 040: bipush 4
      // 041: invokevirtual java/util/Random.nextInt (I)I
      // 044: bipush 1
      // 045: iadd
      // 046: istore 6
      // 048: new mew$mix
      // 04b: dup
      // 04c: invokespecial mew$mix.<init> ()V
      // 04f: astore 7
      // 051: aload 3
      // 052: invokevirtual mew.getX ()I
      // 055: iload 6
      // 057: isub
      // 058: istore 8
      // 05a: iload 8
      // 05c: aload 3
      // 05d: invokevirtual mew.getX ()I
      // 060: iload 6
      // 062: iadd
      // 063: if_icmpgt 0f4
      // 066: aload 3
      // 067: invokevirtual mew.getZ ()I
      // 06a: iload 6
      // 06c: isub
      // 06d: iload 4
      // 06f: ifne 0f8
      // 072: istore 9
      // 074: iload 9
      // 076: aload 3
      // 077: invokevirtual mew.getZ ()I
      // 07a: iload 6
      // 07c: iadd
      // 07d: if_icmpgt 0ec
      // 080: iload 8
      // 082: aload 3
      // 083: invokevirtual mew.getX ()I
      // 086: isub
      // 087: istore 10
      // 089: iload 9
      // 08b: aload 3
      // 08c: invokevirtual mew.getZ ()I
      // 08f: isub
      // 090: istore 11
      // 092: iload 4
      // 094: ifne 0e7
      // 097: iload 10
      // 099: iload 10
      // 09b: imul
      // 09c: iload 11
      // 09e: iload 11
      // 0a0: imul
      // 0a1: iadd
      // 0a2: iload 6
      // 0a4: iload 6
      // 0a6: imul
      // 0a7: bipush 1
      // 0a8: iadd
      // 0a9: iload 4
      // 0ab: ifne 063
      // 0ae: goto 0b5
      // 0b1: invokestatic ork.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: if_icmpgt 0e4
      // 0b8: aload 1
      // 0b9: aload 7
      // 0bb: iload 8
      // 0bd: aload 3
      // 0be: invokevirtual mew.getY ()I
      // 0c1: bipush 1
      // 0c2: isub
      // 0c3: iload 9
      // 0c5: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0c8: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0cb: invokeinterface zfz.r_y ()Le0x; 1
      // 0d0: aload 0
      // 0d1: getfield ork.t3j Le0x;
      // 0d4: if_acmpeq 0e4
      // 0d7: goto 0de
      // 0da: invokestatic ork.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: bipush 0
      // 0df: ireturn
      // 0e0: invokestatic ork.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: iinc 9 1
      // 0e7: iload 4
      // 0e9: ifeq 074
      // 0ec: iinc 8 1
      // 0ef: iload 4
      // 0f1: ifeq 05a
      // 0f4: aload 3
      // 0f5: invokevirtual mew.getY ()I
      // 0f8: istore 8
      // 0fa: iload 8
      // 0fc: aload 3
      // 0fd: invokevirtual mew.getY ()I
      // 100: iload 5
      // 102: iadd
      // 103: if_icmpge 1c0
      // 106: iload 8
      // 108: sipush 256
      // 10b: iload 4
      // 10d: ifne 127
      // 110: if_icmpge 1c0
      // 113: goto 11a
      // 116: invokestatic ork.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 3
      // 11b: invokevirtual mew.getX ()I
      // 11e: iload 6
      // 120: goto 127
      // 123: invokestatic ork.a (Loov;)Loov;
      // 126: athrow
      // 127: isub
      // 128: istore 9
      // 12a: iload 9
      // 12c: aload 3
      // 12d: invokevirtual mew.getX ()I
      // 130: iload 6
      // 132: iadd
      // 133: if_icmpgt 1b8
      // 136: aload 3
      // 137: invokevirtual mew.getZ ()I
      // 13a: iload 6
      // 13c: isub
      // 13d: iload 4
      // 13f: ifne 0fc
      // 142: istore 10
      // 144: iload 10
      // 146: aload 3
      // 147: invokevirtual mew.getZ ()I
      // 14a: iload 6
      // 14c: iadd
      // 14d: if_icmpgt 1b0
      // 150: iload 9
      // 152: aload 3
      // 153: invokevirtual mew.getX ()I
      // 156: isub
      // 157: istore 11
      // 159: iload 10
      // 15b: aload 3
      // 15c: invokevirtual mew.getZ ()I
      // 15f: isub
      // 160: istore 12
      // 162: iload 4
      // 164: ifne 1ab
      // 167: iload 11
      // 169: iload 11
      // 16b: imul
      // 16c: iload 12
      // 16e: iload 12
      // 170: imul
      // 171: iadd
      // 172: iload 6
      // 174: iload 6
      // 176: imul
      // 177: bipush 1
      // 178: iadd
      // 179: iload 4
      // 17b: ifne 133
      // 17e: goto 185
      // 181: invokestatic ork.a (Loov;)Loov;
      // 184: athrow
      // 185: if_icmpgt 1a8
      // 188: aload 1
      // 189: new mew
      // 18c: dup
      // 18d: iload 9
      // 18f: iload 8
      // 191: iload 10
      // 193: invokespecial mew.<init> (III)V
      // 196: getstatic ox_.j4y Le0x;
      // 199: invokevirtual e0x.l4i ()Lzfz;
      // 19c: bipush 2
      // 19d: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1a0: pop
      // 1a1: goto 1a8
      // 1a4: invokestatic ork.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iinc 10 1
      // 1ab: iload 4
      // 1ad: ifeq 144
      // 1b0: iinc 9 1
      // 1b3: iload 4
      // 1b5: ifeq 12a
      // 1b8: iinc 8 1
      // 1bb: iload 4
      // 1bd: ifeq 0fa
      // 1c0: new edl
      // 1c3: dup
      // 1c4: aload 1
      // 1c5: invokespecial edl.<init> (Lt9d;)V
      // 1c8: astore 8
      // 1ca: aload 8
      // 1cc: aload 3
      // 1cd: invokevirtual mew.getX ()I
      // 1d0: i2f
      // 1d1: ldc 0.5
      // 1d3: nop
      // 1d4: fadd
      // 1d5: f2d
      // 1d6: aload 3
      // 1d7: invokevirtual mew.getY ()I
      // 1da: iload 5
      // 1dc: iadd
      // 1dd: i2d
      // 1de: aload 3
      // 1df: invokevirtual mew.getZ ()I
      // 1e2: i2f
      // 1e3: ldc 0.5
      // 1e5: nop
      // 1e6: fadd
      // 1e7: f2d
      // 1e8: aload 2
      // 1e9: invokevirtual java/util/Random.nextFloat ()F
      // 1ec: ldc 360.0
      // 1ee: nop
      // 1ef: fmul
      // 1f0: fconst_0
      // 1f1: invokevirtual EntityLivingBase.x24 (DDDFF)V
      // 1f4: aload 1
      // 1f5: aload 8
      // 1f7: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 1fa: pop
      // 1fb: aload 1
      // 1fc: aload 3
      // 1fd: iload 5
      // 1ff: invokevirtual mew.z89 (I)Lmew;
      // 202: getstatic ox_.n6z Le0x;
      // 205: invokevirtual e0x.l4i ()Lzfz;
      // 208: bipush 2
      // 209: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 20c: pop
      // 20d: bipush 1
      // 20e: ireturn
      // 20f: bipush 0
      // 210: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
