import java.util.List;

public class p_i {
   public static String bty(String param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 23
      // 09: ifne 31
      // 0c: goto 13
      // 0f: invokestatic p_i.a (Loov;)Loov;
      // 12: athrow
      // 13: invokestatic Minecraft.vz1 ()Lc05;
      // 16: getfield Minecraft.oxn Lmoh;
      // 19: getfield moh.y5h Z
      // 1c: goto 23
      // 1f: invokestatic p_i.a (Loov;)Loov;
      // 22: athrow
      // 23: ifne 31
      // 26: aload 0
      // 27: invokestatic syo.fan (Ljava/lang/String;)Ljava/lang/String;
      // 2a: goto 32
      // 2d: invokestatic p_i.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: areturn
   }

   public static List vtz(ekw param0, int param1, owt param2, boolean param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 6
      // 003: new tao
      // 006: dup
      // 007: ldc ""
      // 009: nop
      // 00a: invokespecial tao.<init> (Ljava/lang/String;)V
      // 00d: astore 7
      // 00f: invokestatic OpaquePredicate.b ()I
      // 012: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 015: astore 8
      // 017: aload 0
      // 018: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 01b: astore 9
      // 01d: bipush 0
      // 01e: istore 10
      // 020: istore 5
      // 022: iload 10
      // 024: aload 9
      // 026: invokeinterface java/util/List.size ()I 1
      // 02b: if_icmpge 328
      // 02e: aload 9
      // 030: iload 10
      // 032: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 037: checkcast ekw
      // 03a: astore 11
      // 03c: aload 11
      // 03e: invokeinterface ekw.cpz ()Ljava/lang/String; 1
      // 043: astore 12
      // 045: bipush 0
      // 046: istore 13
      // 048: aload 12
      // 04a: iload 5
      // 04c: ifeq 0d7
      // 04f: ldc "\n"
      // 051: nop
      // 052: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 055: iload 5
      // 057: ifeq 331
      // 05a: goto 061
      // 05d: invokestatic p_i.a (Loov;)Loov;
      // 060: athrow
      // 061: ifeq 0b6
      // 064: goto 06b
      // 067: invokestatic p_i.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 12
      // 06d: bipush 10
      // 06f: invokevirtual java/lang/String.indexOf (I)I
      // 072: istore 14
      // 074: aload 12
      // 076: iload 14
      // 078: bipush 1
      // 079: iadd
      // 07a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 07d: astore 15
      // 07f: aload 12
      // 081: bipush 0
      // 082: iload 14
      // 084: bipush 1
      // 085: iadd
      // 086: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 089: astore 12
      // 08b: new tao
      // 08e: dup
      // 08f: aload 15
      // 091: invokespecial tao.<init> (Ljava/lang/String;)V
      // 094: astore 16
      // 096: aload 16
      // 098: aload 11
      // 09a: invokeinterface ekw.f4q ()Lpoy; 1
      // 09f: invokevirtual poy.esg ()Lpoy;
      // 0a2: invokevirtual tao.di5 (Lpoy;)Lekw;
      // 0a5: pop
      // 0a6: aload 9
      // 0a8: iload 10
      // 0aa: bipush 1
      // 0ab: iadd
      // 0ac: aload 16
      // 0ae: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 0b3: bipush 1
      // 0b4: istore 13
      // 0b6: new java/lang/StringBuilder
      // 0b9: dup
      // 0ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bd: aload 11
      // 0bf: invokeinterface ekw.f4q ()Lpoy; 1
      // 0c4: invokevirtual poy.tmo ()Ljava/lang/String;
      // 0c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ca: aload 12
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d2: iload 4
      // 0d4: invokestatic p_i.bty (Ljava/lang/String;Z)Ljava/lang/String;
      // 0d7: astore 14
      // 0d9: aload 14
      // 0db: iload 5
      // 0dd: ifeq 104
      // 0e0: ldc "\n"
      // 0e2: nop
      // 0e3: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0e6: ifeq 107
      // 0e9: goto 0f0
      // 0ec: invokestatic p_i.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 14
      // 0f2: bipush 0
      // 0f3: aload 14
      // 0f5: invokevirtual java/lang/String.length ()I
      // 0f8: bipush 1
      // 0f9: isub
      // 0fa: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0fd: goto 104
      // 100: invokestatic p_i.a (Loov;)Loov;
      // 103: athrow
      // 104: goto 109
      // 107: aload 14
      // 109: astore 15
      // 10b: getstatic jsr.yk7 Lcyb;
      // 10e: aload 15
      // 110: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 113: fstore 16
      // 115: new tao
      // 118: dup
      // 119: aload 15
      // 11b: invokespecial tao.<init> (Ljava/lang/String;)V
      // 11e: astore 17
      // 120: aload 17
      // 122: aload 11
      // 124: invokeinterface ekw.f4q ()Lpoy; 1
      // 129: invokevirtual poy.esg ()Lpoy;
      // 12c: invokevirtual tao.di5 (Lpoy;)Lekw;
      // 12f: pop
      // 130: iload 6
      // 132: i2f
      // 133: fload 16
      // 135: fadd
      // 136: iload 1
      // 137: i2f
      // 138: fcmpl
      // 139: iload 5
      // 13b: ifeq 2be
      // 13e: ifle 2b5
      // 141: goto 148
      // 144: invokestatic p_i.a (Loov;)Loov;
      // 147: athrow
      // 148: getstatic jsr.yk7 Lcyb;
      // 14b: aload 14
      // 14d: iload 1
      // 14e: iload 6
      // 150: isub
      // 151: bipush 0
      // 152: invokevirtual cyb.abn (Ljava/lang/String;IZ)Ljava/lang/String;
      // 155: astore 18
      // 157: aload 18
      // 159: iload 5
      // 15b: ifeq 181
      // 15e: invokevirtual java/lang/String.length ()I
      // 161: aload 14
      // 163: invokevirtual java/lang/String.length ()I
      // 166: if_icmpge 184
      // 169: goto 170
      // 16c: invokestatic p_i.a (Loov;)Loov;
      // 16f: athrow
      // 170: aload 14
      // 172: aload 18
      // 174: invokevirtual java/lang/String.length ()I
      // 177: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 17a: goto 181
      // 17d: invokestatic p_i.a (Loov;)Loov;
      // 180: athrow
      // 181: goto 185
      // 184: aconst_null
      // 185: astore 19
      // 187: iload 5
      // 189: ifeq 2b2
      // 18c: aload 19
      // 18e: ifnull 28d
      // 191: goto 198
      // 194: invokestatic p_i.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 19
      // 19a: invokevirtual java/lang/String.length ()I
      // 19d: iload 5
      // 19f: ifeq 2b3
      // 1a2: goto 1a9
      // 1a5: invokestatic p_i.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: ifle 28d
      // 1ac: goto 1b3
      // 1af: invokestatic p_i.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 18
      // 1b5: ldc " "
      // 1b7: nop
      // 1b8: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 1bb: istore 20
      // 1bd: iload 20
      // 1bf: iload 5
      // 1c1: ifeq 22f
      // 1c4: iflt 226
      // 1c7: goto 1ce
      // 1ca: invokestatic p_i.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: getstatic jsr.yk7 Lcyb;
      // 1d1: aload 14
      // 1d3: bipush 0
      // 1d4: iload 20
      // 1d6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1d9: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 1dc: fconst_0
      // 1dd: fcmpl
      // 1de: iload 5
      // 1e0: ifeq 22f
      // 1e3: goto 1ea
      // 1e6: invokestatic p_i.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: ifle 226
      // 1ed: goto 1f4
      // 1f0: invokestatic p_i.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: aload 14
      // 1f6: bipush 0
      // 1f7: iload 20
      // 1f9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1fc: astore 18
      // 1fe: iload 5
      // 200: ifeq 221
      // 203: iload 3
      // 204: ifeq 218
      // 207: goto 20e
      // 20a: invokestatic p_i.a (Loov;)Loov;
      // 20d: athrow
      // 20e: iinc 20 1
      // 211: goto 218
      // 214: invokestatic p_i.a (Loov;)Loov;
      // 217: athrow
      // 218: aload 14
      // 21a: iload 20
      // 21c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 21f: astore 19
      // 221: iload 5
      // 223: ifne 265
      // 226: iload 6
      // 228: goto 22f
      // 22b: invokestatic p_i.a (Loov;)Loov;
      // 22e: athrow
      // 22f: iload 5
      // 231: ifeq 259
      // 234: ifle 265
      // 237: goto 23e
      // 23a: invokestatic p_i.a (Loov;)Loov;
      // 23d: athrow
      // 23e: aload 14
      // 240: iload 5
      // 242: ifeq 263
      // 245: goto 24c
      // 248: invokestatic p_i.a (Loov;)Loov;
      // 24b: athrow
      // 24c: ldc " "
      // 24e: nop
      // 24f: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 252: goto 259
      // 255: invokestatic p_i.a (Loov;)Loov;
      // 258: athrow
      // 259: ifne 265
      // 25c: ldc ""
      // 25e: nop
      // 25f: astore 18
      // 261: aload 14
      // 263: astore 19
      // 265: new tao
      // 268: dup
      // 269: aload 19
      // 26b: invokespecial tao.<init> (Ljava/lang/String;)V
      // 26e: astore 21
      // 270: aload 21
      // 272: aload 11
      // 274: invokeinterface ekw.f4q ()Lpoy; 1
      // 279: invokevirtual poy.esg ()Lpoy;
      // 27c: invokevirtual tao.di5 (Lpoy;)Lekw;
      // 27f: pop
      // 280: aload 9
      // 282: iload 10
      // 284: bipush 1
      // 285: iadd
      // 286: aload 21
      // 288: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 28d: getstatic jsr.yk7 Lcyb;
      // 290: aload 18
      // 292: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 295: fstore 16
      // 297: new tao
      // 29a: dup
      // 29b: aload 18
      // 29d: invokespecial tao.<init> (Ljava/lang/String;)V
      // 2a0: astore 17
      // 2a2: aload 17
      // 2a4: aload 11
      // 2a6: invokeinterface ekw.f4q ()Lpoy; 1
      // 2ab: invokevirtual poy.esg ()Lpoy;
      // 2ae: invokevirtual tao.di5 (Lpoy;)Lekw;
      // 2b1: pop
      // 2b2: bipush 1
      // 2b3: istore 13
      // 2b5: iload 6
      // 2b7: i2f
      // 2b8: fload 16
      // 2ba: fadd
      // 2bb: iload 1
      // 2bc: i2f
      // 2bd: fcmpg
      // 2be: iload 5
      // 2c0: ifeq 2ed
      // 2c3: ifgt 2e5
      // 2c6: goto 2cd
      // 2c9: invokestatic p_i.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: iload 6
      // 2cf: i2f
      // 2d0: fload 16
      // 2d2: fadd
      // 2d3: f2i
      // 2d4: istore 6
      // 2d6: aload 7
      // 2d8: aload 17
      // 2da: invokeinterface ekw.vha (Lekw;)Lekw; 2
      // 2df: pop
      // 2e0: iload 5
      // 2e2: ifne 2ef
      // 2e5: bipush 1
      // 2e6: goto 2ed
      // 2e9: invokestatic p_i.a (Loov;)Loov;
      // 2ec: athrow
      // 2ed: istore 13
      // 2ef: iload 13
      // 2f1: iload 5
      // 2f3: ifeq 312
      // 2f6: ifeq 320
      // 2f9: goto 300
      // 2fc: invokestatic p_i.a (Loov;)Loov;
      // 2ff: athrow
      // 300: aload 8
      // 302: aload 7
      // 304: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 309: pop
      // 30a: bipush 0
      // 30b: goto 312
      // 30e: invokestatic p_i.a (Loov;)Loov;
      // 311: athrow
      // 312: istore 6
      // 314: new tao
      // 317: dup
      // 318: ldc ""
      // 31a: nop
      // 31b: invokespecial tao.<init> (Ljava/lang/String;)V
      // 31e: astore 7
      // 320: iinc 10 1
      // 323: iload 5
      // 325: ifne 022
      // 328: aload 8
      // 32a: aload 7
      // 32c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 331: pop
      // 332: aload 8
      // 334: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
