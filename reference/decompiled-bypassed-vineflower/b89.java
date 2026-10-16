import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b89 extends gbe {
   private static final moh$_ru[] qmp;
   private static final moh$_ru[] urg;
   private final gbe sna;
   private final moh euy;
   private String don;
   private String mj0;
   private int acp;
   private boolean je9 = false;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public b89(gbe var1, moh var2) {
      this.sna = var1;
      this.euy = var2;
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
      // 000: getstatic b89.a J
      // 003: ldc2_w 136814827487729
      // 006: lxor
      // 007: lstore 1
      // 008: bipush 0
      // 009: istore 4
      // 00b: aload 0
      // 00c: sipush 9161
      // 00f: ldc2_w 2159978389963327772
      // 012: lload 1
      // 013: lxor
      // 014: invokedynamic t (IJ)Ljava/lang/String; bsm=b89.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: nop
      // 01a: bipush 0
      // 01b: anewarray 48
      // 01e: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 021: putfield b89.don Ljava/lang/String;
      // 024: invokestatic t9d.c ()I
      // 027: aload 0
      // 028: sipush 5997
      // 02b: ldc2_w 4863758566861176253
      // 02e: lload 1
      // 02f: lxor
      // 030: invokedynamic t (IJ)Ljava/lang/String; bsm=b89.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: bipush 0
      // 037: anewarray 48
      // 03a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 03d: putfield b89.mj0 Ljava/lang/String;
      // 040: getstatic b89.qmp [Lmoh$_ru;
      // 043: astore 5
      // 045: istore 3
      // 046: aload 5
      // 048: arraylength
      // 049: istore 6
      // 04b: bipush 0
      // 04c: istore 7
      // 04e: iload 7
      // 050: iload 6
      // 052: if_icmpge 113
      // 055: aload 5
      // 057: iload 7
      // 059: aaload
      // 05a: astore 8
      // 05c: aload 8
      // 05e: invokevirtual moh$_ru.on0 ()Z
      // 061: iload 3
      // 062: ifne 117
      // 065: iload 3
      // 066: ifne 108
      // 069: goto 070
      // 06c: invokestatic b89.a (Loov;)Loov;
      // 06f: athrow
      // 070: ifeq 0bf
      // 073: goto 07a
      // 076: invokestatic b89.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield b89.khf Ljava/util/List;
      // 07e: new kkh
      // 081: dup
      // 082: aload 8
      // 084: invokevirtual moh$_ru.ehz ()I
      // 087: aload 0
      // 088: getfield b89.dt7 I
      // 08b: bipush 2
      // 08c: idiv
      // 08d: sipush 155
      // 090: isub
      // 091: iload 4
      // 093: bipush 2
      // 094: irem
      // 095: sipush 160
      // 098: imul
      // 099: iadd
      // 09a: aload 0
      // 09b: getfield b89.o1e I
      // 09e: bipush 6
      // 0a0: idiv
      // 0a1: bipush 24
      // 0a3: iload 4
      // 0a5: bipush 1
      // 0a6: ishr
      // 0a7: imul
      // 0a8: iadd
      // 0a9: aload 8
      // 0ab: invokespecial kkh.<init> (IIILmoh$_ru;)V
      // 0ae: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b3: pop
      // 0b4: iload 3
      // 0b5: ifeq 109
      // 0b8: goto 0bf
      // 0bb: invokestatic b89.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield b89.khf Ljava/util/List;
      // 0c3: new cm_
      // 0c6: dup
      // 0c7: aload 8
      // 0c9: invokevirtual moh$_ru.ehz ()I
      // 0cc: aload 0
      // 0cd: getfield b89.dt7 I
      // 0d0: bipush 2
      // 0d1: idiv
      // 0d2: sipush 155
      // 0d5: isub
      // 0d6: iload 4
      // 0d8: bipush 2
      // 0d9: irem
      // 0da: sipush 160
      // 0dd: imul
      // 0de: iadd
      // 0df: aload 0
      // 0e0: getfield b89.o1e I
      // 0e3: bipush 6
      // 0e5: idiv
      // 0e6: bipush 24
      // 0e8: iload 4
      // 0ea: bipush 1
      // 0eb: ishr
      // 0ec: imul
      // 0ed: iadd
      // 0ee: aload 8
      // 0f0: aload 0
      // 0f1: getfield b89.euy Lmoh;
      // 0f4: aload 8
      // 0f6: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 0f9: invokespecial cm_.<init> (IIILmoh$_ru;Ljava/lang/String;)V
      // 0fc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 101: goto 108
      // 104: invokestatic b89.a (Loov;)Loov;
      // 107: athrow
      // 108: pop
      // 109: iinc 4 1
      // 10c: iinc 7 1
      // 10f: iload 3
      // 110: ifeq 04e
      // 113: iload 4
      // 115: bipush 2
      // 116: irem
      // 117: bipush 1
      // 118: iload 3
      // 119: ifne 142
      // 11c: if_icmpne 129
      // 11f: goto 126
      // 122: invokestatic b89.a (Loov;)Loov;
      // 125: athrow
      // 126: iinc 4 1
      // 129: aload 0
      // 12a: aload 0
      // 12b: getfield b89.o1e I
      // 12e: bipush 6
      // 130: idiv
      // 131: bipush 24
      // 133: iload 4
      // 135: bipush 1
      // 136: ishr
      // 137: imul
      // 138: iadd
      // 139: bipush 6
      // 13b: iadd
      // 13c: putfield b89.acp I
      // 13f: iload 4
      // 141: bipush 2
      // 142: iadd
      // 143: istore 4
      // 145: getstatic b89.urg [Lmoh$_ru;
      // 148: astore 5
      // 14a: aload 5
      // 14c: arraylength
      // 14d: istore 6
      // 14f: bipush 0
      // 150: istore 7
      // 152: iload 7
      // 154: iload 6
      // 156: if_icmpge 217
      // 159: aload 5
      // 15b: iload 7
      // 15d: aaload
      // 15e: astore 8
      // 160: aload 8
      // 162: invokevirtual moh$_ru.on0 ()Z
      // 165: iload 3
      // 166: ifne 259
      // 169: iload 3
      // 16a: ifne 20c
      // 16d: goto 174
      // 170: invokestatic b89.a (Loov;)Loov;
      // 173: athrow
      // 174: ifeq 1c3
      // 177: goto 17e
      // 17a: invokestatic b89.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 0
      // 17f: getfield b89.khf Ljava/util/List;
      // 182: new kkh
      // 185: dup
      // 186: aload 8
      // 188: invokevirtual moh$_ru.ehz ()I
      // 18b: aload 0
      // 18c: getfield b89.dt7 I
      // 18f: bipush 2
      // 190: idiv
      // 191: sipush 155
      // 194: isub
      // 195: iload 4
      // 197: bipush 2
      // 198: irem
      // 199: sipush 160
      // 19c: imul
      // 19d: iadd
      // 19e: aload 0
      // 19f: getfield b89.o1e I
      // 1a2: bipush 6
      // 1a4: idiv
      // 1a5: bipush 24
      // 1a7: iload 4
      // 1a9: bipush 1
      // 1aa: ishr
      // 1ab: imul
      // 1ac: iadd
      // 1ad: aload 8
      // 1af: invokespecial kkh.<init> (IIILmoh$_ru;)V
      // 1b2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1b7: pop
      // 1b8: iload 3
      // 1b9: ifeq 20d
      // 1bc: goto 1c3
      // 1bf: invokestatic b89.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: getfield b89.khf Ljava/util/List;
      // 1c7: new cm_
      // 1ca: dup
      // 1cb: aload 8
      // 1cd: invokevirtual moh$_ru.ehz ()I
      // 1d0: aload 0
      // 1d1: getfield b89.dt7 I
      // 1d4: bipush 2
      // 1d5: idiv
      // 1d6: sipush 155
      // 1d9: isub
      // 1da: iload 4
      // 1dc: bipush 2
      // 1dd: irem
      // 1de: sipush 160
      // 1e1: imul
      // 1e2: iadd
      // 1e3: aload 0
      // 1e4: getfield b89.o1e I
      // 1e7: bipush 6
      // 1e9: idiv
      // 1ea: bipush 24
      // 1ec: iload 4
      // 1ee: bipush 1
      // 1ef: ishr
      // 1f0: imul
      // 1f1: iadd
      // 1f2: aload 8
      // 1f4: aload 0
      // 1f5: getfield b89.euy Lmoh;
      // 1f8: aload 8
      // 1fa: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 1fd: invokespecial cm_.<init> (IIILmoh$_ru;Ljava/lang/String;)V
      // 200: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 205: goto 20c
      // 208: invokestatic b89.a (Loov;)Loov;
      // 20b: athrow
      // 20c: pop
      // 20d: iinc 4 1
      // 210: iinc 7 1
      // 213: iload 3
      // 214: ifeq 152
      // 217: aload 0
      // 218: getfield b89.khf Ljava/util/List;
      // 21b: new gt4
      // 21e: dup
      // 21f: sipush 200
      // 222: aload 0
      // 223: getfield b89.dt7 I
      // 226: bipush 2
      // 227: idiv
      // 228: sipush 155
      // 22b: isub
      // 22c: aload 0
      // 22d: getfield b89.o1e I
      // 230: bipush 6
      // 232: idiv
      // 233: sipush 168
      // 236: iadd
      // 237: sipush 150
      // 23a: bipush 20
      // 23c: sipush 17566
      // 23f: ldc2_w 2063531573235723848
      // 242: lload 1
      // 243: lxor
      // 244: invokedynamic t (IJ)Ljava/lang/String; bsm=b89.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: nop
      // 24a: bipush 0
      // 24b: anewarray 48
      // 24e: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 251: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 254: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 259: pop
      // 25a: new gt4
      // 25d: dup
      // 25e: sipush 201
      // 261: aload 0
      // 262: getfield b89.dt7 I
      // 265: bipush 2
      // 266: idiv
      // 267: bipush 5
      // 268: iadd
      // 269: aload 0
      // 26a: getfield b89.o1e I
      // 26d: bipush 6
      // 26f: idiv
      // 270: sipush 168
      // 273: iadd
      // 274: sipush 150
      // 277: bipush 20
      // 279: sipush 13490
      // 27c: ldc2_w 165920177498938981
      // 27f: lload 1
      // 280: lxor
      // 281: invokedynamic t (IJ)Ljava/lang/String; bsm=b89.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: nop
      // 287: bipush 0
      // 288: anewarray 48
      // 28b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 28e: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 291: astore 5
      // 293: aload 5
      // 295: aload 0
      // 296: getfield b89.f41 Lc05;
      // 299: invokevirtual c05.vnk ()Ltyh;
      // 29c: invokeinterface tyh.s45 ()Z 1
      // 2a1: iload 3
      // 2a2: ifne 2e4
      // 2a5: ifeq 2d1
      // 2a8: goto 2af
      // 2ab: invokestatic b89.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: getfield b89.f41 Lc05;
      // 2b3: invokevirtual c05.vnk ()Ltyh;
      // 2b6: invokeinterface tyh.pjx ()[Ltv/twitch/broadcast/IngestServer; 1
      // 2bb: arraylength
      // 2bc: iload 3
      // 2bd: ifne 2f3
      // 2c0: goto 2c7
      // 2c3: invokestatic b89.a (Loov;)Loov;
      // 2c6: athrow
      // 2c7: ifgt 2f2
      // 2ca: goto 2d1
      // 2cd: invokestatic b89.a (Loov;)Loov;
      // 2d0: athrow
      // 2d1: aload 0
      // 2d2: getfield b89.f41 Lc05;
      // 2d5: invokevirtual c05.vnk ()Ltyh;
      // 2d8: invokeinterface tyh.xy0 ()Z 1
      // 2dd: goto 2e4
      // 2e0: invokestatic b89.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: iload 3
      // 2e5: ifne 2f3
      // 2e8: ifeq 2f6
      // 2eb: goto 2f2
      // 2ee: invokestatic b89.a (Loov;)Loov;
      // 2f1: athrow
      // 2f2: bipush 1
      // 2f3: goto 2f7
      // 2f6: bipush 0
      // 2f7: putfield gt4.c9a Z
      // 2fa: aload 0
      // 2fb: getfield b89.khf Ljava/util/List;
      // 2fe: aload 5
      // 300: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 305: pop
      // 306: return
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield gt4.c9a Z
      // 008: iload 2
      // 009: ifeq 021
      // 00c: ifeq 1cb
      // 00f: goto 016
      // 012: invokestatic b89.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 1
      // 017: getfield gt4._me I
      // 01a: goto 021
      // 01d: invokestatic b89.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 2
      // 022: ifeq 0be
      // 025: bipush 100
      // 027: if_icmpge 0b3
      // 02a: goto 031
      // 02d: invokestatic b89.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 1
      // 032: instanceof cm_
      // 035: iload 2
      // 036: ifeq 0be
      // 039: goto 040
      // 03c: invokestatic b89.a (Loov;)Loov;
      // 03f: athrow
      // 040: ifeq 0b3
      // 043: goto 04a
      // 046: invokestatic b89.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 1
      // 04b: checkcast cm_
      // 04e: invokevirtual cm_.t4j ()Lmoh$_ru;
      // 051: astore 3
      // 052: aload 0
      // 053: getfield b89.euy Lmoh;
      // 056: aload 3
      // 057: bipush 1
      // 058: invokevirtual moh.d13 (Lmoh$_ru;I)V
      // 05b: aload 1
      // 05c: aload 0
      // 05d: getfield b89.euy Lmoh;
      // 060: aload 1
      // 061: getfield gt4._me I
      // 064: invokestatic moh$_ru.jit (I)Lmoh$_ru;
      // 067: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 06a: putfield gt4.frg Ljava/lang/String;
      // 06d: aload 0
      // 06e: getfield b89.f41 Lc05;
      // 071: invokevirtual c05.vnk ()Ltyh;
      // 074: invokeinterface tyh.tvw ()Z 1
      // 079: ifeq 0af
      // 07c: aload 3
      // 07d: getstatic moh$_ru.sys Lmoh$_ru;
      // 080: iload 2
      // 081: ifeq 0a0
      // 084: goto 08b
      // 087: invokestatic b89.a (Loov;)Loov;
      // 08a: athrow
      // 08b: if_acmpeq 0af
      // 08e: goto 095
      // 091: invokestatic b89.a (Loov;)Loov;
      // 094: athrow
      // 095: aload 3
      // 096: getstatic moh$_ru.sag Lmoh$_ru;
      // 099: goto 0a0
      // 09c: invokestatic b89.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: if_acmpeq 0af
      // 0a3: aload 0
      // 0a4: bipush 1
      // 0a5: putfield b89.je9 Z
      // 0a8: goto 0af
      // 0ab: invokestatic b89.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: iload 2
      // 0b0: ifne 165
      // 0b3: aload 1
      // 0b4: instanceof kkh
      // 0b7: goto 0be
      // 0ba: invokestatic b89.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: iload 2
      // 0bf: ifeq 169
      // 0c2: ifeq 165
      // 0c5: goto 0cc
      // 0c8: invokestatic b89.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 1
      // 0cd: getfield gt4._me I
      // 0d0: getstatic moh$_ru.buz Lmoh$_ru;
      // 0d3: invokevirtual moh$_ru.ehz ()I
      // 0d6: iload 2
      // 0d7: ifeq 11e
      // 0da: goto 0e1
      // 0dd: invokestatic b89.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: if_icmpne 102
      // 0e4: goto 0eb
      // 0e7: invokestatic b89.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield b89.f41 Lc05;
      // 0ef: invokevirtual c05.vnk ()Ltyh;
      // 0f2: invokeinterface tyh.h1g ()V 1
      // 0f7: iload 2
      // 0f8: ifne 165
      // 0fb: goto 102
      // 0fe: invokestatic b89.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 1
      // 103: getfield gt4._me I
      // 106: iload 2
      // 107: ifeq 14b
      // 10a: goto 111
      // 10d: invokestatic b89.a (Loov;)Loov;
      // 110: athrow
      // 111: getstatic moh$_ru.lz2 Lmoh$_ru;
      // 114: invokevirtual moh$_ru.ehz ()I
      // 117: goto 11e
      // 11a: invokestatic b89.a (Loov;)Loov;
      // 11d: athrow
      // 11e: if_icmpne 138
      // 121: aload 0
      // 122: getfield b89.f41 Lc05;
      // 125: invokevirtual c05.vnk ()Ltyh;
      // 128: invokeinterface tyh.h1g ()V 1
      // 12d: iload 2
      // 12e: ifne 165
      // 131: goto 138
      // 134: invokestatic b89.a (Loov;)Loov;
      // 137: athrow
      // 138: aload 0
      // 139: getfield b89.f41 Lc05;
      // 13c: invokevirtual c05.vnk ()Ltyh;
      // 13f: invokeinterface tyh.tvw ()Z 1
      // 144: goto 14b
      // 147: invokestatic b89.a (Loov;)Loov;
      // 14a: athrow
      // 14b: iload 2
      // 14c: ifeq 169
      // 14f: ifeq 165
      // 152: goto 159
      // 155: invokestatic b89.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 0
      // 15a: bipush 1
      // 15b: putfield b89.je9 Z
      // 15e: goto 165
      // 161: invokestatic b89.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 1
      // 166: getfield gt4._me I
      // 169: sipush 200
      // 16c: iload 2
      // 16d: ifeq 1a8
      // 170: if_icmpne 19a
      // 173: goto 17a
      // 176: invokestatic b89.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: getfield b89.f41 Lc05;
      // 17e: getfield c05.oxn Lmoh;
      // 181: invokevirtual moh.cmo ()V
      // 184: aload 0
      // 185: getfield b89.f41 Lc05;
      // 188: aload 0
      // 189: getfield b89.sna Lgbe;
      // 18c: invokevirtual c05.z2i (Lgbe;)V
      // 18f: iload 2
      // 190: ifne 1cb
      // 193: goto 19a
      // 196: invokestatic b89.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 1
      // 19b: getfield gt4._me I
      // 19e: sipush 201
      // 1a1: goto 1a8
      // 1a4: invokestatic b89.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: if_icmpne 1cb
      // 1ab: aload 0
      // 1ac: getfield b89.f41 Lc05;
      // 1af: getfield c05.oxn Lmoh;
      // 1b2: invokevirtual moh.cmo ()V
      // 1b5: aload 0
      // 1b6: getfield b89.f41 Lc05;
      // 1b9: new p2v
      // 1bc: dup
      // 1bd: aload 0
      // 1be: invokespecial p2v.<init> (Lgbe;)V
      // 1c1: invokevirtual c05.z2i (Lgbe;)V
      // 1c4: goto 1cb
      // 1c7: invokestatic b89.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: return
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
      // 00: getstatic b89.a J
      // 03: ldc2_w 110178551569102
      // 06: lxor
      // 07: lstore 4
      // 09: aload 0
      // 0a: invokevirtual b89.xmz ()V
      // 0d: invokestatic t9d.c ()I
      // 10: aload 0
      // 11: aload 0
      // 12: getfield b89.fex Lowt;
      // 15: aload 0
      // 16: getfield b89.don Ljava/lang/String;
      // 19: aload 0
      // 1a: getfield b89.dt7 I
      // 1d: bipush 2
      // 1e: idiv
      // 1f: bipush 20
      // 21: ldc 16777215
      // 23: nop
      // 24: invokevirtual b89.poi (Lowt;Ljava/lang/String;III)V
      // 27: aload 0
      // 28: aload 0
      // 29: getfield b89.fex Lowt;
      // 2c: aload 0
      // 2d: getfield b89.mj0 Ljava/lang/String;
      // 30: aload 0
      // 31: getfield b89.dt7 I
      // 34: bipush 2
      // 35: idiv
      // 36: aload 0
      // 37: getfield b89.acp I
      // 3a: ldc 16777215
      // 3c: nop
      // 3d: invokevirtual b89.poi (Lowt;Ljava/lang/String;III)V
      // 40: istore 6
      // 42: aload 0
      // 43: iload 6
      // 45: ifne a1
      // 48: getfield b89.je9 Z
      // 4b: ifeq a0
      // 4e: goto 55
      // 51: invokestatic b89.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: aload 0
      // 57: getfield b89.fex Lowt;
      // 5a: new java/lang/StringBuilder
      // 5d: dup
      // 5e: invokespecial java/lang/StringBuilder.<init> ()V
      // 61: getstatic syo.aez Lsyo;
      // 64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 67: sipush 32520
      // 6a: ldc2_w 3907161808132493027
      // 6d: lload 4
      // 6f: lxor
      // 70: invokedynamic t (IJ)Ljava/lang/String; bsm=b89.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: nop
      // 76: bipush 0
      // 77: anewarray 48
      // 7a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 83: aload 0
      // 84: getfield b89.dt7 I
      // 87: bipush 2
      // 88: idiv
      // 89: bipush 20
      // 8b: aload 0
      // 8c: getfield b89.fex Lowt;
      // 8f: getfield owt.rr7 I
      // 92: iadd
      // 93: ldc 16777215
      // 95: nop
      // 96: invokevirtual b89.poi (Lowt;Ljava/lang/String;III)V
      // 99: goto a0
      // 9c: invokestatic b89.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 0
      // a1: iload 1
      // a2: iload 2
      // a3: fload 3
      // a4: invokespecial gbe.drawScreen (IIF)V
      // a7: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7892424066911507344L, 4247185746618324224L, MethodHandles.lookup().lookupClass()).a(123399193147527L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 77487900756910L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "\u009cV\u0002ëxå±\u00107sZyôøf(d@£?}¨\u0017Íe\u0003º¶QU\u009ar}\u0098àn\u008a³Ä~(Ò\u001cø\u0019\u000eàû%þk\u001fiÍì\u009dz2¿DÓA \u001aùËÀDýËl\u0094\b\u00101\u009fö\u0084à¸Ç\u0018\u0081¶8õ\u007f\u0013¿Újq\u0091¬â\u000b\u0000\u0081\u001el?\u000f®2J#";
      int var8 = "\u009cV\u0002ëxå±\u00107sZyôøf(d@£?}¨\u0017Íe\u0003º¶QU\u009ar}\u0098àn\u008a³Ä~(Ò\u001cø\u0019\u000eàû%þk\u001fiÍì\u009dz2¿DÓA \u001aùËÀDýËl\u0094\b\u00101\u009fö\u0084à¸Ç\u0018\u0081¶8õ\u007f\u0013¿Újq\u0091¬â\u000b\u0000\u0081\u001el?\u000f®2J#"
         .length();
      char var5 = '(';
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
                     g = new String[5];
                     qmp = new moh$_ru[]{moh$_ru.qki, moh$_ru.egw, moh$_ru.rwj, moh$_ru.bpk, moh$_ru.buz, moh$_ru.lz2, moh$_ru.hnb, moh$_ru.q98};
                     urg = new moh$_ru[]{moh$_ru.sys, moh$_ru.sag};
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

                  var6 = "ò/Oë5\u0085I³¦!Á°\u0007²Ù¨A\u000e@ðh~!\u0017±ë¢f«Ø\"ÁÞàÍÖ-\u0089\u0013¦:çuù\u0084ú[\u0018\u0096òÖ\u001d,ý)×8\u0096\u000bÓnÐZ\u008eË\u00adßâ\u0018R\u0098\u0011\u001aV\u001c \u008fU\u000f'\u0015\rÒ-x5\u0012\u0013q$\tI=%£ã\u009abÚ*\u008c\nà@\f¾}å\u0015\u0015\u009cÆø";
                  var8 = "ò/Oë5\u0085I³¦!Á°\u0007²Ù¨A\u000e@ðh~!\u0017±ë¢f«Ø\"ÁÞàÍÖ-\u0089\u0013¦:çuù\u0084ú[\u0018\u0096òÖ\u001d,ý)×8\u0096\u000bÓnÐZ\u008eË\u00adßâ\u0018R\u0098\u0011\u001aV\u001c \u008fU\u000f'\u0015\rÒ-x5\u0012\u0013q$\tI=%£ã\u009abÚ*\u008c\nà@\f¾}å\u0015\u0015\u009cÆø"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4569;
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
            throw new RuntimeException("b89", var10);
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
         throw new RuntimeException("b89" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
