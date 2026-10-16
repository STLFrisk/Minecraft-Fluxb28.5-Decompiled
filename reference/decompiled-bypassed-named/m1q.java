import com.google.common.base.Predicate;
import java.util.Random;

public class m1q extends cdu {
   public m1q(zfz var1, int var2) {
      this(var1, var2, ppl.gbe(ox_.pu8));
   }

   public m1q(zfz var1, int var2, Predicate var3) {
      this.cay = var1;
      this.wrh = var2;
      this.r9g = var3;
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
      // 000: aload 2
      // 001: invokevirtual java/util/Random.nextFloat ()F
      // 004: ldc 3.1415927
      // 006: nop
      // 007: fmul
      // 008: fstore 5
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: aload 3
      // 00e: invokevirtual mew.getX ()I
      // 011: bipush 8
      // 013: iadd
      // 014: i2f
      // 015: fload 5
      // 017: invokestatic fe6.rtn (F)F
      // 01a: aload 0
      // 01b: getfield m1q.wrh I
      // 01e: i2f
      // 01f: fmul
      // 020: ldc 8.0
      // 022: nop
      // 023: fdiv
      // 024: fadd
      // 025: f2d
      // 026: dstore 6
      // 028: aload 3
      // 029: invokevirtual mew.getX ()I
      // 02c: bipush 8
      // 02e: iadd
      // 02f: i2f
      // 030: fload 5
      // 032: invokestatic fe6.rtn (F)F
      // 035: aload 0
      // 036: getfield m1q.wrh I
      // 039: i2f
      // 03a: fmul
      // 03b: ldc 8.0
      // 03d: nop
      // 03e: fdiv
      // 03f: fsub
      // 040: f2d
      // 041: dstore 8
      // 043: aload 3
      // 044: invokevirtual mew.getZ ()I
      // 047: bipush 8
      // 049: iadd
      // 04a: i2f
      // 04b: fload 5
      // 04d: invokestatic fe6.ssk (F)F
      // 050: aload 0
      // 051: getfield m1q.wrh I
      // 054: i2f
      // 055: fmul
      // 056: ldc 8.0
      // 058: nop
      // 059: fdiv
      // 05a: fadd
      // 05b: f2d
      // 05c: dstore 10
      // 05e: istore 4
      // 060: aload 3
      // 061: invokevirtual mew.getZ ()I
      // 064: bipush 8
      // 066: iadd
      // 067: i2f
      // 068: fload 5
      // 06a: invokestatic fe6.ssk (F)F
      // 06d: aload 0
      // 06e: getfield m1q.wrh I
      // 071: i2f
      // 072: fmul
      // 073: ldc 8.0
      // 075: nop
      // 076: fdiv
      // 077: fsub
      // 078: f2d
      // 079: dstore 12
      // 07b: aload 3
      // 07c: invokevirtual mew.getY ()I
      // 07f: aload 2
      // 080: bipush 3
      // 081: invokevirtual java/util/Random.nextInt (I)I
      // 084: iadd
      // 085: bipush 2
      // 086: isub
      // 087: i2d
      // 088: dstore 14
      // 08a: aload 3
      // 08b: invokevirtual mew.getY ()I
      // 08e: aload 2
      // 08f: bipush 3
      // 090: invokevirtual java/util/Random.nextInt (I)I
      // 093: iadd
      // 094: bipush 2
      // 095: isub
      // 096: i2d
      // 097: dstore 16
      // 099: bipush 0
      // 09a: istore 18
      // 09c: iload 18
      // 09e: aload 0
      // 09f: getfield m1q.wrh I
      // 0a2: if_icmpge 286
      // 0a5: iload 18
      // 0a7: i2f
      // 0a8: aload 0
      // 0a9: getfield m1q.wrh I
      // 0ac: i2f
      // 0ad: fdiv
      // 0ae: fstore 19
      // 0b0: dload 6
      // 0b2: dload 8
      // 0b4: dload 6
      // 0b6: dsub
      // 0b7: fload 19
      // 0b9: f2d
      // 0ba: dmul
      // 0bb: dadd
      // 0bc: dstore 20
      // 0be: dload 14
      // 0c0: dload 16
      // 0c2: dload 14
      // 0c4: dsub
      // 0c5: fload 19
      // 0c7: f2d
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: dstore 22
      // 0cc: dload 10
      // 0ce: dload 12
      // 0d0: dload 10
      // 0d2: dsub
      // 0d3: fload 19
      // 0d5: f2d
      // 0d6: dmul
      // 0d7: dadd
      // 0d8: dstore 24
      // 0da: aload 2
      // 0db: invokevirtual java/util/Random.nextDouble ()D
      // 0de: aload 0
      // 0df: getfield m1q.wrh I
      // 0e2: i2d
      // 0e3: dmul
      // 0e4: ldc2_w 16.0
      // 0e7: ddiv
      // 0e8: dstore 26
      // 0ea: ldc 3.1415927
      // 0ec: nop
      // 0ed: fload 19
      // 0ef: fmul
      // 0f0: invokestatic fe6.rtn (F)F
      // 0f3: fconst_1
      // 0f4: fadd
      // 0f5: f2d
      // 0f6: dload 26
      // 0f8: dmul
      // 0f9: dconst_1
      // 0fa: dadd
      // 0fb: dstore 28
      // 0fd: ldc 3.1415927
      // 0ff: nop
      // 100: fload 19
      // 102: fmul
      // 103: invokestatic fe6.rtn (F)F
      // 106: fconst_1
      // 107: fadd
      // 108: f2d
      // 109: dload 26
      // 10b: dmul
      // 10c: dconst_1
      // 10d: dadd
      // 10e: dstore 30
      // 110: dload 20
      // 112: dload 28
      // 114: ldc2_w 2.0
      // 117: ddiv
      // 118: dsub
      // 119: invokestatic fe6.jqf (D)I
      // 11c: istore 32
      // 11e: dload 22
      // 120: dload 30
      // 122: ldc2_w 2.0
      // 125: ddiv
      // 126: dsub
      // 127: invokestatic fe6.jqf (D)I
      // 12a: istore 33
      // 12c: dload 24
      // 12e: dload 28
      // 130: ldc2_w 2.0
      // 133: ddiv
      // 134: dsub
      // 135: invokestatic fe6.jqf (D)I
      // 138: istore 34
      // 13a: dload 20
      // 13c: dload 28
      // 13e: ldc2_w 2.0
      // 141: ddiv
      // 142: dadd
      // 143: invokestatic fe6.jqf (D)I
      // 146: istore 35
      // 148: dload 22
      // 14a: dload 30
      // 14c: ldc2_w 2.0
      // 14f: ddiv
      // 150: dadd
      // 151: invokestatic fe6.jqf (D)I
      // 154: istore 36
      // 156: dload 24
      // 158: dload 28
      // 15a: ldc2_w 2.0
      // 15d: ddiv
      // 15e: dadd
      // 15f: invokestatic fe6.jqf (D)I
      // 162: istore 37
      // 164: iload 32
      // 166: iload 4
      // 168: ifeq 287
      // 16b: istore 38
      // 16d: iload 38
      // 16f: iload 35
      // 171: if_icmpgt 27e
      // 174: iload 38
      // 176: i2d
      // 177: ldc2_w 0.5
      // 17a: dadd
      // 17b: dload 20
      // 17d: dsub
      // 17e: dload 28
      // 180: ldc2_w 2.0
      // 183: ddiv
      // 184: ddiv
      // 185: dstore 39
      // 187: iload 4
      // 189: ifeq 279
      // 18c: dload 39
      // 18e: dload 39
      // 190: dmul
      // 191: dconst_1
      // 192: dcmpg
      // 193: iload 4
      // 195: ifeq 09e
      // 198: goto 19f
      // 19b: invokestatic m1q.a (Loov;)Loov;
      // 19e: athrow
      // 19f: ifge 276
      // 1a2: iload 33
      // 1a4: istore 41
      // 1a6: iload 41
      // 1a8: iload 36
      // 1aa: if_icmpgt 276
      // 1ad: iload 41
      // 1af: i2d
      // 1b0: ldc2_w 0.5
      // 1b3: dadd
      // 1b4: dload 22
      // 1b6: dsub
      // 1b7: dload 30
      // 1b9: ldc2_w 2.0
      // 1bc: ddiv
      // 1bd: ddiv
      // 1be: dstore 42
      // 1c0: iload 4
      // 1c2: ifeq 271
      // 1c5: dload 39
      // 1c7: dload 39
      // 1c9: dmul
      // 1ca: dload 42
      // 1cc: dload 42
      // 1ce: dmul
      // 1cf: dadd
      // 1d0: dconst_1
      // 1d1: dcmpg
      // 1d2: iload 4
      // 1d4: ifeq 16f
      // 1d7: goto 1de
      // 1da: invokestatic m1q.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: ifge 26e
      // 1e1: iload 34
      // 1e3: istore 44
      // 1e5: iload 44
      // 1e7: iload 37
      // 1e9: if_icmpgt 26e
      // 1ec: iload 44
      // 1ee: i2d
      // 1ef: ldc2_w 0.5
      // 1f2: dadd
      // 1f3: dload 24
      // 1f5: dsub
      // 1f6: dload 28
      // 1f8: ldc2_w 2.0
      // 1fb: ddiv
      // 1fc: ddiv
      // 1fd: dstore 45
      // 1ff: iload 4
      // 201: ifeq 269
      // 204: dload 39
      // 206: dload 39
      // 208: dmul
      // 209: dload 42
      // 20b: dload 42
      // 20d: dmul
      // 20e: dadd
      // 20f: dload 45
      // 211: dload 45
      // 213: dmul
      // 214: dadd
      // 215: dconst_1
      // 216: dcmpg
      // 217: iload 4
      // 219: ifeq 1a8
      // 21c: goto 223
      // 21f: invokestatic m1q.a (Loov;)Loov;
      // 222: athrow
      // 223: ifge 266
      // 226: new mew
      // 229: dup
      // 22a: iload 38
      // 22c: iload 41
      // 22e: iload 44
      // 230: invokespecial mew.<init> (III)V
      // 233: astore 47
      // 235: iload 4
      // 237: ifeq 269
      // 23a: aload 0
      // 23b: getfield m1q.r9g Lcom/google/common/base/Predicate;
      // 23e: aload 1
      // 23f: aload 47
      // 241: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 244: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 249: ifeq 266
      // 24c: goto 253
      // 24f: invokestatic m1q.a (Loov;)Loov;
      // 252: athrow
      // 253: aload 1
      // 254: aload 47
      // 256: aload 0
      // 257: getfield m1q.cay Lzfz;
      // 25a: bipush 2
      // 25b: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 25e: pop
      // 25f: goto 266
      // 262: invokestatic m1q.a (Loov;)Loov;
      // 265: athrow
      // 266: iinc 44 1
      // 269: iload 4
      // 26b: ifne 1e5
      // 26e: iinc 41 1
      // 271: iload 4
      // 273: ifne 1a6
      // 276: iinc 38 1
      // 279: iload 4
      // 27b: ifne 16d
      // 27e: iinc 18 1
      // 281: iload 4
      // 283: ifne 09c
      // 286: bipush 1
      // 287: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
