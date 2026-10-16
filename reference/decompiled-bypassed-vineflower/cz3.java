import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class cz3 {
   private final t9d hgm;
   private final mew ebl;
   private final mew x01;
   private final vt2 nv3;
   private final List djq;
   private final List go6;

   public cz3(t9d param1, mew param2, vt2 param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic t9d.b ()I
      // 07: aload 0
      // 08: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0b: putfield cz3.djq Ljava/util/List;
      // 0e: aload 0
      // 0f: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 12: putfield cz3.go6 Ljava/util/List;
      // 15: istore 5
      // 17: aload 0
      // 18: aload 1
      // 19: putfield cz3.hgm Lt9d;
      // 1c: aload 0
      // 1d: aload 2
      // 1e: putfield cz3.ebl Lmew;
      // 21: iload 5
      // 23: ifeq 5b
      // 26: iload 4
      // 28: ifeq 4c
      // 2b: goto 32
      // 2e: invokestatic cz3.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: aload 3
      // 34: putfield cz3.nv3 Lvt2;
      // 37: aload 0
      // 38: aload 2
      // 39: aload 3
      // 3a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 3d: putfield cz3.x01 Lmew;
      // 40: iload 5
      // 42: ifne 65
      // 45: goto 4c
      // 48: invokestatic cz3.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 3
      // 4e: invokevirtual vt2.b4b ()Lvt2;
      // 51: putfield cz3.nv3 Lvt2;
      // 54: goto 5b
      // 57: invokestatic cz3.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: aload 2
      // 5d: aload 3
      // 5e: bipush 2
      // 5f: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 62: putfield cz3.x01 Lmew;
      // 65: return
   }

   public boolean h2m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield cz3.djq Ljava/util/List;
      // 04: invokeinterface java/util/List.clear ()V 1
      // 09: invokestatic t9d.c ()I
      // 0c: aload 0
      // 0d: getfield cz3.go6 Ljava/util/List;
      // 10: invokeinterface java/util/List.clear ()V 1
      // 15: aload 0
      // 16: getfield cz3.hgm Lt9d;
      // 19: aload 0
      // 1a: getfield cz3.x01 Lmew;
      // 1d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 20: invokeinterface zfz.r_y ()Le0x; 1
      // 25: astore 2
      // 26: istore 1
      // 27: aload 2
      // 28: aload 0
      // 29: getfield cz3.hgm Lt9d;
      // 2c: aload 0
      // 2d: getfield cz3.x01 Lmew;
      // 30: aload 0
      // 31: getfield cz3.nv3 Lvt2;
      // 34: bipush 0
      // 35: invokestatic aog.eh5 (Le0x;Lt9d;Lmew;Lvt2;Z)Z
      // 38: iload 1
      // 39: ifne 7e
      // 3c: ifne 76
      // 3f: goto 46
      // 42: invokestatic cz3.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 2
      // 47: invokevirtual e0x.quv ()I
      // 4a: iload 1
      // 4b: ifne 75
      // 4e: goto 55
      // 51: invokestatic cz3.a (Loov;)Loov;
      // 54: athrow
      // 55: bipush 1
      // 56: if_icmpeq 66
      // 59: goto 60
      // 5c: invokestatic cz3.a (Loov;)Loov;
      // 5f: athrow
      // 60: bipush 0
      // 61: ireturn
      // 62: invokestatic cz3.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: getfield cz3.go6 Ljava/util/List;
      // 6a: aload 0
      // 6b: getfield cz3.x01 Lmew;
      // 6e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 73: pop
      // 74: bipush 1
      // 75: ireturn
      // 76: aload 0
      // 77: aload 0
      // 78: getfield cz3.x01 Lmew;
      // 7b: invokespecial cz3.hzy (Lmew;)Z
      // 7e: iload 1
      // 7f: ifne 93
      // 82: ifne 92
      // 85: goto 8c
      // 88: invokestatic cz3.a (Loov;)Loov;
      // 8b: athrow
      // 8c: bipush 0
      // 8d: ireturn
      // 8e: invokestatic cz3.a (Loov;)Loov;
      // 91: athrow
      // 92: bipush 0
      // 93: istore 3
      // 94: iload 3
      // 95: aload 0
      // 96: getfield cz3.djq Ljava/util/List;
      // 99: invokeinterface java/util/List.size ()I 1
      // 9e: if_icmpge f3
      // a1: aload 0
      // a2: getfield cz3.djq Ljava/util/List;
      // a5: iload 3
      // a6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // ab: checkcast mew
      // ae: astore 4
      // b0: iload 1
      // b1: ifne ef
      // b4: aload 0
      // b5: getfield cz3.hgm Lt9d;
      // b8: aload 4
      // ba: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // bd: invokeinterface zfz.r_y ()Le0x; 1
      // c2: getstatic ox_.ehh Le0x;
      // c5: if_acmpne ec
      // c8: goto cf
      // cb: invokestatic cz3.a (Loov;)Loov;
      // ce: athrow
      // cf: aload 0
      // d0: aload 4
      // d2: invokespecial cz3.xwg (Lmew;)Z
      // d5: iload 1
      // d6: ifne eb
      // d9: goto e0
      // dc: invokestatic cz3.a (Loov;)Loov;
      // df: athrow
      // e0: ifne ec
      // e3: goto ea
      // e6: invokestatic cz3.a (Loov;)Loov;
      // e9: athrow
      // ea: bipush 0
      // eb: ireturn
      // ec: iinc 3 1
      // ef: iload 1
      // f0: ifeq 94
      // f3: bipush 1
      // f4: ireturn
   }

   private boolean hzy(mew param1) {
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
      // 005: getfield cz3.hgm Lt9d;
      // 008: aload 1
      // 009: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 00c: invokeinterface zfz.r_y ()Le0x; 1
      // 011: astore 3
      // 012: aload 3
      // 013: iload 2
      // 014: ifeq 02e
      // 017: invokevirtual e0x.p1r ()Lp3y;
      // 01a: getstatic p3y.cei Lp3y;
      // 01d: if_acmpne 02d
      // 020: goto 027
      // 023: invokestatic cz3.a (Loov;)Loov;
      // 026: athrow
      // 027: bipush 1
      // 028: ireturn
      // 029: invokestatic cz3.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 3
      // 02e: aload 0
      // 02f: getfield cz3.hgm Lt9d;
      // 032: aload 1
      // 033: aload 0
      // 034: getfield cz3.nv3 Lvt2;
      // 037: bipush 0
      // 038: invokestatic aog.eh5 (Le0x;Lt9d;Lmew;Lvt2;Z)Z
      // 03b: iload 2
      // 03c: ifeq 057
      // 03f: ifne 04f
      // 042: goto 049
      // 045: invokestatic cz3.a (Loov;)Loov;
      // 048: athrow
      // 049: bipush 1
      // 04a: ireturn
      // 04b: invokestatic cz3.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 1
      // 050: aload 0
      // 051: getfield cz3.ebl Lmew;
      // 054: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 057: iload 2
      // 058: ifeq 075
      // 05b: ifeq 06b
      // 05e: goto 065
      // 061: invokestatic cz3.a (Loov;)Loov;
      // 064: athrow
      // 065: bipush 1
      // 066: ireturn
      // 067: invokestatic cz3.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield cz3.djq Ljava/util/List;
      // 06f: aload 1
      // 070: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 075: iload 2
      // 076: ifeq 08a
      // 079: ifeq 089
      // 07c: goto 083
      // 07f: invokestatic cz3.a (Loov;)Loov;
      // 082: athrow
      // 083: bipush 1
      // 084: ireturn
      // 085: invokestatic cz3.a (Loov;)Loov;
      // 088: athrow
      // 089: bipush 1
      // 08a: istore 4
      // 08c: iload 4
      // 08e: aload 0
      // 08f: getfield cz3.djq Ljava/util/List;
      // 092: invokeinterface java/util/List.size ()I 1
      // 097: iadd
      // 098: iload 2
      // 099: ifeq 0b0
      // 09c: bipush 12
      // 09e: if_icmple 0b1
      // 0a1: goto 0a8
      // 0a4: invokestatic cz3.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: bipush 0
      // 0a9: goto 0b0
      // 0ac: invokestatic cz3.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: ireturn
      // 0b1: aload 3
      // 0b2: getstatic ox_.ehh Le0x;
      // 0b5: if_acmpne 15c
      // 0b8: aload 1
      // 0b9: aload 0
      // 0ba: getfield cz3.nv3 Lvt2;
      // 0bd: invokevirtual vt2.b4b ()Lvt2;
      // 0c0: iload 4
      // 0c2: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 0c5: astore 5
      // 0c7: aload 0
      // 0c8: getfield cz3.hgm Lt9d;
      // 0cb: aload 5
      // 0cd: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0d0: invokeinterface zfz.r_y ()Le0x; 1
      // 0d5: astore 3
      // 0d6: aload 3
      // 0d7: iload 2
      // 0d8: ifeq 0f3
      // 0db: invokevirtual e0x.p1r ()Lp3y;
      // 0de: getstatic p3y.cei Lp3y;
      // 0e1: if_acmpeq 15c
      // 0e4: goto 0eb
      // 0e7: invokestatic cz3.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 3
      // 0ec: goto 0f3
      // 0ef: invokestatic cz3.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: getfield cz3.hgm Lt9d;
      // 0f7: aload 5
      // 0f9: aload 0
      // 0fa: getfield cz3.nv3 Lvt2;
      // 0fd: bipush 0
      // 0fe: invokestatic aog.eh5 (Le0x;Lt9d;Lmew;Lvt2;Z)Z
      // 101: iload 2
      // 102: ifeq 15d
      // 105: ifeq 15c
      // 108: goto 10f
      // 10b: invokestatic cz3.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 5
      // 111: aload 0
      // 112: getfield cz3.ebl Lmew;
      // 115: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 118: iload 2
      // 119: ifeq 13f
      // 11c: goto 123
      // 11f: invokestatic cz3.a (Loov;)Loov;
      // 122: athrow
      // 123: ifeq 130
      // 126: goto 12d
      // 129: invokestatic cz3.a (Loov;)Loov;
      // 12c: athrow
      // 12d: goto 15c
      // 130: iinc 4 1
      // 133: iload 4
      // 135: aload 0
      // 136: getfield cz3.djq Ljava/util/List;
      // 139: invokeinterface java/util/List.size ()I 1
      // 13e: iadd
      // 13f: iload 2
      // 140: ifeq 157
      // 143: bipush 12
      // 145: if_icmple 158
      // 148: goto 14f
      // 14b: invokestatic cz3.a (Loov;)Loov;
      // 14e: athrow
      // 14f: bipush 0
      // 150: goto 157
      // 153: invokestatic cz3.a (Loov;)Loov;
      // 156: athrow
      // 157: ireturn
      // 158: iload 2
      // 159: ifne 0b1
      // 15c: bipush 0
      // 15d: istore 5
      // 15f: iload 4
      // 161: bipush 1
      // 162: isub
      // 163: istore 6
      // 165: iload 6
      // 167: iflt 196
      // 16a: aload 0
      // 16b: getfield cz3.djq Ljava/util/List;
      // 16e: aload 1
      // 16f: aload 0
      // 170: getfield cz3.nv3 Lvt2;
      // 173: invokevirtual vt2.b4b ()Lvt2;
      // 176: iload 6
      // 178: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 17b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 180: pop
      // 181: iinc 5 1
      // 184: iinc 6 -1
      // 187: iload 2
      // 188: ifeq 199
      // 18b: iload 2
      // 18c: ifne 165
      // 18f: goto 196
      // 192: invokestatic cz3.a (Loov;)Loov;
      // 195: athrow
      // 196: bipush 1
      // 197: istore 6
      // 199: aload 1
      // 19a: aload 0
      // 19b: getfield cz3.nv3 Lvt2;
      // 19e: iload 6
      // 1a0: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 1a3: astore 7
      // 1a5: aload 0
      // 1a6: getfield cz3.djq Ljava/util/List;
      // 1a9: aload 7
      // 1ab: invokeinterface java/util/List.indexOf (Ljava/lang/Object;)I 2
      // 1b0: istore 8
      // 1b2: iload 8
      // 1b4: bipush -1
      // 1b5: if_icmple 22d
      // 1b8: aload 0
      // 1b9: iload 5
      // 1bb: iload 8
      // 1bd: invokespecial cz3.zcd (II)V
      // 1c0: bipush 0
      // 1c1: iload 2
      // 1c2: ifeq 266
      // 1c5: goto 1cc
      // 1c8: invokestatic cz3.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: istore 9
      // 1ce: iload 9
      // 1d0: iload 8
      // 1d2: iload 5
      // 1d4: iadd
      // 1d5: if_icmpgt 22b
      // 1d8: aload 0
      // 1d9: getfield cz3.djq Ljava/util/List;
      // 1dc: iload 9
      // 1de: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1e3: checkcast mew
      // 1e6: astore 10
      // 1e8: iload 2
      // 1e9: ifeq 227
      // 1ec: aload 0
      // 1ed: getfield cz3.hgm Lt9d;
      // 1f0: aload 10
      // 1f2: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1f5: invokeinterface zfz.r_y ()Le0x; 1
      // 1fa: getstatic ox_.ehh Le0x;
      // 1fd: if_acmpne 224
      // 200: goto 207
      // 203: invokestatic cz3.a (Loov;)Loov;
      // 206: athrow
      // 207: aload 0
      // 208: aload 10
      // 20a: invokespecial cz3.xwg (Lmew;)Z
      // 20d: iload 2
      // 20e: ifeq 223
      // 211: goto 218
      // 214: invokestatic cz3.a (Loov;)Loov;
      // 217: athrow
      // 218: ifne 224
      // 21b: goto 222
      // 21e: invokestatic cz3.a (Loov;)Loov;
      // 221: athrow
      // 222: bipush 0
      // 223: ireturn
      // 224: iinc 9 1
      // 227: iload 2
      // 228: ifne 1ce
      // 22b: bipush 1
      // 22c: ireturn
      // 22d: aload 0
      // 22e: getfield cz3.hgm Lt9d;
      // 231: aload 7
      // 233: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 236: invokeinterface zfz.r_y ()Le0x; 1
      // 23b: astore 3
      // 23c: aload 3
      // 23d: iload 2
      // 23e: ifeq 258
      // 241: invokevirtual e0x.p1r ()Lp3y;
      // 244: getstatic p3y.cei Lp3y;
      // 247: if_acmpne 257
      // 24a: goto 251
      // 24d: invokestatic cz3.a (Loov;)Loov;
      // 250: athrow
      // 251: bipush 1
      // 252: ireturn
      // 253: invokestatic cz3.a (Loov;)Loov;
      // 256: athrow
      // 257: aload 3
      // 258: aload 0
      // 259: getfield cz3.hgm Lt9d;
      // 25c: aload 7
      // 25e: aload 0
      // 25f: getfield cz3.nv3 Lvt2;
      // 262: bipush 1
      // 263: invokestatic aog.eh5 (Le0x;Lt9d;Lmew;Lvt2;Z)Z
      // 266: iload 2
      // 267: ifeq 293
      // 26a: ifeq 292
      // 26d: goto 274
      // 270: invokestatic cz3.a (Loov;)Loov;
      // 273: athrow
      // 274: aload 7
      // 276: aload 0
      // 277: getfield cz3.ebl Lmew;
      // 27a: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 27d: iload 2
      // 27e: ifeq 298
      // 281: goto 288
      // 284: invokestatic cz3.a (Loov;)Loov;
      // 287: athrow
      // 288: ifeq 294
      // 28b: goto 292
      // 28e: invokestatic cz3.a (Loov;)Loov;
      // 291: athrow
      // 292: bipush 0
      // 293: ireturn
      // 294: aload 3
      // 295: invokevirtual e0x.quv ()I
      // 298: bipush 1
      // 299: iload 2
      // 29a: ifeq 2cf
      // 29d: if_icmpne 2b9
      // 2a0: goto 2a7
      // 2a3: invokestatic cz3.a (Loov;)Loov;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: getfield cz3.go6 Ljava/util/List;
      // 2ab: aload 7
      // 2ad: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2b2: pop
      // 2b3: bipush 1
      // 2b4: ireturn
      // 2b5: invokestatic cz3.a (Loov;)Loov;
      // 2b8: athrow
      // 2b9: aload 0
      // 2ba: getfield cz3.djq Ljava/util/List;
      // 2bd: invokeinterface java/util/List.size ()I 1
      // 2c2: iload 2
      // 2c3: ifeq 2e3
      // 2c6: bipush 12
      // 2c8: goto 2cf
      // 2cb: invokestatic cz3.a (Loov;)Loov;
      // 2ce: athrow
      // 2cf: if_icmplt 2d8
      // 2d2: bipush 0
      // 2d3: ireturn
      // 2d4: invokestatic cz3.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: aload 0
      // 2d9: getfield cz3.djq Ljava/util/List;
      // 2dc: aload 7
      // 2de: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2e3: pop
      // 2e4: iinc 5 1
      // 2e7: iinc 6 1
      // 2ea: goto 199
   }

   private void zcd(int var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      var3.addAll(this.djq.subList(0, var2));
      var4.addAll(this.djq.subList(this.djq.size() - var1, this.djq.size()));
      var5.addAll(this.djq.subList(var2, this.djq.size() - var1));
      this.djq.clear();
      this.djq.addAll(var3);
      this.djq.addAll(var4);
      this.djq.addAll(var5);
   }

   private boolean xwg(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic vt2.values ()[Lvt2;
      // 03: astore 3
      // 04: aload 3
      // 05: arraylength
      // 06: istore 4
      // 08: invokestatic t9d.b ()I
      // 0b: bipush 0
      // 0c: istore 5
      // 0e: istore 2
      // 0f: iload 5
      // 11: iload 4
      // 13: if_icmpge 5e
      // 16: aload 3
      // 17: iload 5
      // 19: aaload
      // 1a: astore 6
      // 1c: iload 2
      // 1d: ifeq 5a
      // 20: aload 6
      // 22: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 25: aload 0
      // 26: getfield cz3.nv3 Lvt2;
      // 29: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 2c: if_acmpeq 57
      // 2f: goto 36
      // 32: invokestatic cz3.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: aload 1
      // 38: aload 6
      // 3a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 3d: invokespecial cz3.hzy (Lmew;)Z
      // 40: iload 2
      // 41: ifeq 56
      // 44: goto 4b
      // 47: invokestatic cz3.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ifne 57
      // 4e: goto 55
      // 51: invokestatic cz3.a (Loov;)Loov;
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: iinc 5 1
      // 5a: iload 2
      // 5b: ifne 0f
      // 5e: bipush 1
      // 5f: ireturn
   }

   public List sxx() {
      return this.djq;
   }

   public List _h2() {
      return this.go6;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
