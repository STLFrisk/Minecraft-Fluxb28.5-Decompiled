import java.util.ArrayList;

public class qbw {
   private ue5 v9m;
   private ue5 ohz;
   private ArrayList cie = new ArrayList();
   private ArrayList v4w = new ArrayList();
   private ArrayList z8m = new ArrayList();
   private double m_o = 9.0;
   private boolean zpi = true;
   private static ue5[] zwl = new ue5[]{new ue5(1.0, 0.0, 0.0), new ue5(-1.0, 0.0, 0.0), new ue5(0.0, 0.0, 1.0), new ue5(0.0, 0.0, -1.0)};

   public qbw(ue5 var1, ue5 var2) {
      this.v9m = var1.cdr(0.0, 0.0, 0.0).opx();
      this.ohz = var2.cdr(0.0, 0.0, 0.0).opx();
   }

   public ArrayList cl7() {
      return this.cie;
   }

   public void pvm() {
      this.wmo(1000, 4);
   }

   public void wmo(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield qbw.cie Ljava/util/ArrayList;
      // 004: invokevirtual java/util/ArrayList.clear ()V
      // 007: aload 0
      // 008: getfield qbw.z8m Ljava/util/ArrayList;
      // 00b: invokevirtual java/util/ArrayList.clear ()V
      // 00e: invokestatic OpaquePredicate.c ()I
      // 011: new java/util/ArrayList
      // 014: dup
      // 015: invokespecial java/util/ArrayList.<init> ()V
      // 018: astore 4
      // 01a: aload 4
      // 01c: aload 0
      // 01d: getfield qbw.v9m Lue5;
      // 020: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 023: pop
      // 024: istore 3
      // 025: aload 0
      // 026: getfield qbw.z8m Ljava/util/ArrayList;
      // 029: new qbw$aj2
      // 02c: dup
      // 02d: aload 0
      // 02e: aload 0
      // 02f: getfield qbw.v9m Lue5;
      // 032: aconst_null
      // 033: aload 4
      // 035: aload 0
      // 036: getfield qbw.v9m Lue5;
      // 039: aload 0
      // 03a: getfield qbw.ohz Lue5;
      // 03d: invokevirtual ue5.glf (Lue5;)D
      // 040: dconst_0
      // 041: dconst_0
      // 042: invokespecial qbw$aj2.<init> (Lqbw;Lue5;Lqbw$aj2;Ljava/util/ArrayList;DDD)V
      // 045: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 048: pop
      // 049: bipush 0
      // 04a: istore 5
      // 04c: iload 5
      // 04e: iload 1
      // 04f: if_icmpge 1c4
      // 052: aload 0
      // 053: getfield qbw.z8m Ljava/util/ArrayList;
      // 056: new qbw$p3h
      // 059: dup
      // 05a: aload 0
      // 05b: invokespecial qbw$p3h.<init> (Lqbw;)V
      // 05e: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 061: bipush 0
      // 062: istore 6
      // 064: aload 0
      // 065: getfield qbw.z8m Ljava/util/ArrayList;
      // 068: iload 3
      // 069: ifne 092
      // 06c: invokevirtual java/util/ArrayList.size ()I
      // 06f: iload 3
      // 070: ifne 1d3
      // 073: goto 07a
      // 076: invokestatic qbw.a (Loov;)Loov;
      // 079: athrow
      // 07a: ifne 087
      // 07d: goto 084
      // 080: invokestatic qbw.a (Loov;)Loov;
      // 083: athrow
      // 084: goto 1c4
      // 087: new java/util/ArrayList
      // 08a: dup
      // 08b: aload 0
      // 08c: getfield qbw.z8m Ljava/util/ArrayList;
      // 08f: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 092: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 095: astore 7
      // 097: aload 7
      // 099: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09e: ifeq 1bd
      // 0a1: aload 7
      // 0a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a8: checkcast qbw$aj2
      // 0ab: astore 8
      // 0ad: iinc 6 1
      // 0b0: iload 6
      // 0b2: iload 3
      // 0b3: ifne 0db
      // 0b6: iload 2
      // 0b7: iload 3
      // 0b8: ifne 04f
      // 0bb: goto 0c2
      // 0be: invokestatic qbw.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: if_icmple 0c8
      // 0c5: goto 1bd
      // 0c8: aload 0
      // 0c9: getfield qbw.z8m Ljava/util/ArrayList;
      // 0cc: aload 8
      // 0ce: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
      // 0d1: pop
      // 0d2: aload 0
      // 0d3: getfield qbw.v4w Ljava/util/ArrayList;
      // 0d6: aload 8
      // 0d8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0db: pop
      // 0dc: getstatic qbw.zwl [Lue5;
      // 0df: astore 9
      // 0e1: aload 9
      // 0e3: arraylength
      // 0e4: istore 10
      // 0e6: bipush 0
      // 0e7: istore 11
      // 0e9: iload 11
      // 0eb: iload 10
      // 0ed: if_icmpge 13f
      // 0f0: aload 9
      // 0f2: iload 11
      // 0f4: aaload
      // 0f5: astore 12
      // 0f7: aload 8
      // 0f9: invokevirtual qbw$aj2.euw ()Lue5;
      // 0fc: aload 12
      // 0fe: invokevirtual ue5.chp (Lue5;)Lue5;
      // 101: invokevirtual ue5.opx ()Lue5;
      // 104: astore 13
      // 106: iload 3
      // 107: ifne 13b
      // 10a: aload 13
      // 10c: bipush 0
      // 10d: invokestatic qbw.ud4 (Lue5;Z)Z
      // 110: iload 3
      // 111: ifne 09e
      // 114: goto 11b
      // 117: invokestatic qbw.a (Loov;)Loov;
      // 11a: athrow
      // 11b: ifeq 138
      // 11e: aload 0
      // 11f: aload 8
      // 121: aload 13
      // 123: dconst_0
      // 124: invokevirtual qbw.tyr (Lqbw$aj2;Lue5;D)Z
      // 127: ifeq 138
      // 12a: goto 131
      // 12d: invokestatic qbw.a (Loov;)Loov;
      // 130: athrow
      // 131: goto 1c4
      // 134: invokestatic qbw.a (Loov;)Loov;
      // 137: athrow
      // 138: iinc 11 1
      // 13b: iload 3
      // 13c: ifeq 0e9
      // 13f: aload 8
      // 141: invokevirtual qbw$aj2.euw ()Lue5;
      // 144: dconst_0
      // 145: dconst_1
      // 146: dconst_0
      // 147: invokevirtual ue5.cdr (DDD)Lue5;
      // 14a: invokevirtual ue5.opx ()Lue5;
      // 14d: astore 9
      // 14f: aload 9
      // 151: iload 3
      // 152: ifne 18d
      // 155: bipush 0
      // 156: invokestatic qbw.ud4 (Lue5;Z)Z
      // 159: ifeq 17d
      // 15c: goto 163
      // 15f: invokestatic qbw.a (Loov;)Loov;
      // 162: athrow
      // 163: aload 0
      // 164: aload 8
      // 166: aload 9
      // 168: dconst_0
      // 169: invokevirtual qbw.tyr (Lqbw$aj2;Lue5;D)Z
      // 16c: ifeq 17d
      // 16f: goto 176
      // 172: invokestatic qbw.a (Loov;)Loov;
      // 175: athrow
      // 176: goto 1c4
      // 179: invokestatic qbw.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 8
      // 17f: invokevirtual qbw$aj2.euw ()Lue5;
      // 182: dconst_0
      // 183: ldc2_w -1.0
      // 186: dconst_0
      // 187: invokevirtual ue5.cdr (DDD)Lue5;
      // 18a: invokevirtual ue5.opx ()Lue5;
      // 18d: astore 10
      // 18f: aload 10
      // 191: bipush 0
      // 192: invokestatic qbw.ud4 (Lue5;Z)Z
      // 195: iload 3
      // 196: ifne 1b3
      // 199: ifeq 1b9
      // 19c: goto 1a3
      // 19f: invokestatic qbw.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: aload 0
      // 1a4: aload 8
      // 1a6: aload 10
      // 1a8: dconst_0
      // 1a9: invokevirtual qbw.tyr (Lqbw$aj2;Lue5;D)Z
      // 1ac: goto 1b3
      // 1af: invokestatic qbw.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: ifeq 1b9
      // 1b6: goto 1c4
      // 1b9: iload 3
      // 1ba: ifeq 097
      // 1bd: iinc 5 1
      // 1c0: iload 3
      // 1c1: ifeq 04c
      // 1c4: aload 0
      // 1c5: iload 3
      // 1c6: ifne 1ed
      // 1c9: getfield qbw.zpi Z
      // 1cc: goto 1d3
      // 1cf: invokestatic qbw.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: ifeq 1fe
      // 1d6: aload 0
      // 1d7: getfield qbw.v4w Ljava/util/ArrayList;
      // 1da: new qbw$p3h
      // 1dd: dup
      // 1de: aload 0
      // 1df: invokespecial qbw$p3h.<init> (Lqbw;)V
      // 1e2: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 1e5: aload 0
      // 1e6: goto 1ed
      // 1e9: invokestatic qbw.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: getfield qbw.v4w Ljava/util/ArrayList;
      // 1f1: bipush 0
      // 1f2: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1f5: checkcast qbw$aj2
      // 1f8: invokevirtual qbw$aj2.obz ()Ljava/util/ArrayList;
      // 1fb: putfield qbw.cie Ljava/util/ArrayList;
      // 1fe: return
   }

   public static boolean ud4(ue5 var0, boolean var1) {
      return sif((int)var0.h25(), (int)var0.mji(), (int)var0.va0(), var1);
   }

   public static boolean sif(int param0, int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new mew
      // 03: dup
      // 04: iload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial mew.<init> (III)V
      // 0a: astore 5
      // 0c: invokestatic OpaquePredicate.c ()I
      // 0f: new mew
      // 12: dup
      // 13: iload 0
      // 14: iload 1
      // 15: bipush 1
      // 16: iadd
      // 17: iload 2
      // 18: invokespecial mew.<init> (III)V
      // 1b: astore 6
      // 1d: new mew
      // 20: dup
      // 21: iload 0
      // 22: iload 1
      // 23: bipush 1
      // 24: isub
      // 25: iload 2
      // 26: invokespecial mew.<init> (III)V
      // 29: astore 7
      // 2b: istore 4
      // 2d: aload 5
      // 2f: invokestatic qbw.fsz (Lmew;)Z
      // 32: iload 4
      // 34: ifne 4d
      // 37: ifne ad
      // 3a: goto 41
      // 3d: invokestatic qbw.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 6
      // 43: invokestatic qbw.fsz (Lmew;)Z
      // 46: goto 4d
      // 49: invokestatic qbw.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 4
      // 4f: ifne 68
      // 52: ifne ad
      // 55: goto 5c
      // 58: invokestatic qbw.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 7
      // 5e: invokestatic qbw.fsz (Lmew;)Z
      // 61: goto 68
      // 64: invokestatic qbw.a (Loov;)Loov;
      // 67: athrow
      // 68: iload 4
      // 6a: ifne 9a
      // 6d: ifne 8e
      // 70: goto 77
      // 73: invokestatic qbw.a (Loov;)Loov;
      // 76: athrow
      // 77: iload 3
      // 78: iload 4
      // 7a: ifne 9a
      // 7d: goto 84
      // 80: invokestatic qbw.a (Loov;)Loov;
      // 83: athrow
      // 84: ifne ad
      // 87: goto 8e
      // 8a: invokestatic qbw.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 7
      // 90: invokestatic qbw.tee (Lmew;)Z
      // 93: goto 9a
      // 96: invokestatic qbw.a (Loov;)Loov;
      // 99: athrow
      // 9a: iload 4
      // 9c: ifne aa
      // 9f: ifeq ad
      // a2: goto a9
      // a5: invokestatic qbw.a (Loov;)Loov;
      // a8: athrow
      // a9: bipush 1
      // aa: goto ae
      // ad: bipush 0
      // ae: ireturn
   }

   private static boolean fsz(mew param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: invokestatic Minecraft.vz1 ()Lc05;
      // 007: getfield Minecraft.tij Lkh3;
      // 00a: aload 0
      // 00b: invokevirtual mew.getX ()I
      // 00e: aload 0
      // 00f: invokevirtual mew.getY ()I
      // 012: aload 0
      // 013: invokevirtual mew.getZ ()I
      // 016: invokevirtual WorldClient.tj9 (III)Le0x;
      // 019: invokevirtual e0x.z4c ()Z
      // 01c: iload 1
      // 01d: ifeq 2ce
      // 020: ifne 2cd
      // 023: goto 02a
      // 026: invokestatic qbw.a (Loov;)Loov;
      // 029: athrow
      // 02a: invokestatic Minecraft.vz1 ()Lc05;
      // 02d: getfield Minecraft.tij Lkh3;
      // 030: aload 0
      // 031: invokevirtual mew.getX ()I
      // 034: aload 0
      // 035: invokevirtual mew.getY ()I
      // 038: aload 0
      // 039: invokevirtual mew.getZ ()I
      // 03c: invokevirtual WorldClient.tj9 (III)Le0x;
      // 03f: instanceof izd
      // 042: iload 1
      // 043: ifeq 2ce
      // 046: goto 04d
      // 049: invokestatic qbw.a (Loov;)Loov;
      // 04c: athrow
      // 04d: ifne 2cd
      // 050: goto 057
      // 053: invokestatic qbw.a (Loov;)Loov;
      // 056: athrow
      // 057: invokestatic Minecraft.vz1 ()Lc05;
      // 05a: getfield Minecraft.tij Lkh3;
      // 05d: aload 0
      // 05e: invokevirtual mew.getX ()I
      // 061: aload 0
      // 062: invokevirtual mew.getY ()I
      // 065: aload 0
      // 066: invokevirtual mew.getZ ()I
      // 069: invokevirtual WorldClient.tj9 (III)Le0x;
      // 06c: instanceof g7u
      // 06f: iload 1
      // 070: ifeq 2ce
      // 073: goto 07a
      // 076: invokestatic qbw.a (Loov;)Loov;
      // 079: athrow
      // 07a: ifne 2cd
      // 07d: goto 084
      // 080: invokestatic qbw.a (Loov;)Loov;
      // 083: athrow
      // 084: invokestatic Minecraft.vz1 ()Lc05;
      // 087: getfield Minecraft.tij Lkh3;
      // 08a: aload 0
      // 08b: invokevirtual mew.getX ()I
      // 08e: aload 0
      // 08f: invokevirtual mew.getY ()I
      // 092: aload 0
      // 093: invokevirtual mew.getZ ()I
      // 096: invokevirtual WorldClient.tj9 (III)Le0x;
      // 099: instanceof kuv
      // 09c: iload 1
      // 09d: ifeq 2ce
      // 0a0: goto 0a7
      // 0a3: invokestatic qbw.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: ifne 2cd
      // 0aa: goto 0b1
      // 0ad: invokestatic qbw.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: invokestatic Minecraft.vz1 ()Lc05;
      // 0b4: getfield Minecraft.tij Lkh3;
      // 0b7: aload 0
      // 0b8: invokevirtual mew.getX ()I
      // 0bb: aload 0
      // 0bc: invokevirtual mew.getY ()I
      // 0bf: aload 0
      // 0c0: invokevirtual mew.getZ ()I
      // 0c3: invokevirtual WorldClient.tj9 (III)Le0x;
      // 0c6: instanceof hrd
      // 0c9: iload 1
      // 0ca: ifeq 2ce
      // 0cd: goto 0d4
      // 0d0: invokestatic qbw.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: ifne 2cd
      // 0d7: goto 0de
      // 0da: invokestatic qbw.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: invokestatic Minecraft.vz1 ()Lc05;
      // 0e1: getfield Minecraft.tij Lkh3;
      // 0e4: aload 0
      // 0e5: invokevirtual mew.getX ()I
      // 0e8: aload 0
      // 0e9: invokevirtual mew.getY ()I
      // 0ec: aload 0
      // 0ed: invokevirtual mew.getZ ()I
      // 0f0: invokevirtual WorldClient.tj9 (III)Le0x;
      // 0f3: instanceof u5i
      // 0f6: iload 1
      // 0f7: ifeq 2ce
      // 0fa: goto 101
      // 0fd: invokestatic qbw.a (Loov;)Loov;
      // 100: athrow
      // 101: ifne 2cd
      // 104: goto 10b
      // 107: invokestatic qbw.a (Loov;)Loov;
      // 10a: athrow
      // 10b: invokestatic Minecraft.vz1 ()Lc05;
      // 10e: getfield Minecraft.tij Lkh3;
      // 111: aload 0
      // 112: invokevirtual mew.getX ()I
      // 115: aload 0
      // 116: invokevirtual mew.getY ()I
      // 119: aload 0
      // 11a: invokevirtual mew.getZ ()I
      // 11d: invokevirtual WorldClient.tj9 (III)Le0x;
      // 120: instanceof pld
      // 123: iload 1
      // 124: ifeq 2ce
      // 127: goto 12e
      // 12a: invokestatic qbw.a (Loov;)Loov;
      // 12d: athrow
      // 12e: ifne 2cd
      // 131: goto 138
      // 134: invokestatic qbw.a (Loov;)Loov;
      // 137: athrow
      // 138: invokestatic Minecraft.vz1 ()Lc05;
      // 13b: getfield Minecraft.tij Lkh3;
      // 13e: aload 0
      // 13f: invokevirtual mew.getX ()I
      // 142: aload 0
      // 143: invokevirtual mew.getY ()I
      // 146: aload 0
      // 147: invokevirtual mew.getZ ()I
      // 14a: invokevirtual WorldClient.tj9 (III)Le0x;
      // 14d: instanceof ob6
      // 150: iload 1
      // 151: ifeq 2ce
      // 154: goto 15b
      // 157: invokestatic qbw.a (Loov;)Loov;
      // 15a: athrow
      // 15b: ifne 2cd
      // 15e: goto 165
      // 161: invokestatic qbw.a (Loov;)Loov;
      // 164: athrow
      // 165: invokestatic Minecraft.vz1 ()Lc05;
      // 168: getfield Minecraft.tij Lkh3;
      // 16b: aload 0
      // 16c: invokevirtual mew.getX ()I
      // 16f: aload 0
      // 170: invokevirtual mew.getY ()I
      // 173: aload 0
      // 174: invokevirtual mew.getZ ()I
      // 177: invokevirtual WorldClient.tj9 (III)Le0x;
      // 17a: instanceof dqt
      // 17d: iload 1
      // 17e: ifeq 2ce
      // 181: goto 188
      // 184: invokestatic qbw.a (Loov;)Loov;
      // 187: athrow
      // 188: ifne 2cd
      // 18b: goto 192
      // 18e: invokestatic qbw.a (Loov;)Loov;
      // 191: athrow
      // 192: invokestatic Minecraft.vz1 ()Lc05;
      // 195: getfield Minecraft.tij Lkh3;
      // 198: aload 0
      // 199: invokevirtual mew.getX ()I
      // 19c: aload 0
      // 19d: invokevirtual mew.getY ()I
      // 1a0: aload 0
      // 1a1: invokevirtual mew.getZ ()I
      // 1a4: invokevirtual WorldClient.tj9 (III)Le0x;
      // 1a7: instanceof f86
      // 1aa: iload 1
      // 1ab: ifeq 2ce
      // 1ae: goto 1b5
      // 1b1: invokestatic qbw.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: ifne 2cd
      // 1b8: goto 1bf
      // 1bb: invokestatic qbw.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: invokestatic Minecraft.vz1 ()Lc05;
      // 1c2: getfield Minecraft.tij Lkh3;
      // 1c5: aload 0
      // 1c6: invokevirtual mew.getX ()I
      // 1c9: aload 0
      // 1ca: invokevirtual mew.getY ()I
      // 1cd: aload 0
      // 1ce: invokevirtual mew.getZ ()I
      // 1d1: invokevirtual WorldClient.tj9 (III)Le0x;
      // 1d4: instanceof itn
      // 1d7: iload 1
      // 1d8: ifeq 2ce
      // 1db: goto 1e2
      // 1de: invokestatic qbw.a (Loov;)Loov;
      // 1e1: athrow
      // 1e2: ifne 2cd
      // 1e5: goto 1ec
      // 1e8: invokestatic qbw.a (Loov;)Loov;
      // 1eb: athrow
      // 1ec: invokestatic Minecraft.vz1 ()Lc05;
      // 1ef: getfield Minecraft.tij Lkh3;
      // 1f2: aload 0
      // 1f3: invokevirtual mew.getX ()I
      // 1f6: aload 0
      // 1f7: invokevirtual mew.getY ()I
      // 1fa: aload 0
      // 1fb: invokevirtual mew.getZ ()I
      // 1fe: invokevirtual WorldClient.tj9 (III)Le0x;
      // 201: instanceof aog
      // 204: iload 1
      // 205: ifeq 2ce
      // 208: goto 20f
      // 20b: invokestatic qbw.a (Loov;)Loov;
      // 20e: athrow
      // 20f: ifne 2cd
      // 212: goto 219
      // 215: invokestatic qbw.a (Loov;)Loov;
      // 218: athrow
      // 219: invokestatic Minecraft.vz1 ()Lc05;
      // 21c: getfield Minecraft.tij Lkh3;
      // 21f: aload 0
      // 220: invokevirtual mew.getX ()I
      // 223: aload 0
      // 224: invokevirtual mew.getY ()I
      // 227: aload 0
      // 228: invokevirtual mew.getZ ()I
      // 22b: invokevirtual WorldClient.tj9 (III)Le0x;
      // 22e: instanceof u4_
      // 231: iload 1
      // 232: ifeq 2ce
      // 235: goto 23c
      // 238: invokestatic qbw.a (Loov;)Loov;
      // 23b: athrow
      // 23c: ifne 2cd
      // 23f: goto 246
      // 242: invokestatic qbw.a (Loov;)Loov;
      // 245: athrow
      // 246: invokestatic Minecraft.vz1 ()Lc05;
      // 249: getfield Minecraft.tij Lkh3;
      // 24c: aload 0
      // 24d: invokevirtual mew.getX ()I
      // 250: aload 0
      // 251: invokevirtual mew.getY ()I
      // 254: aload 0
      // 255: invokevirtual mew.getZ ()I
      // 258: invokevirtual WorldClient.tj9 (III)Le0x;
      // 25b: instanceof myw
      // 25e: iload 1
      // 25f: ifeq 2ce
      // 262: goto 269
      // 265: invokestatic qbw.a (Loov;)Loov;
      // 268: athrow
      // 269: ifne 2cd
      // 26c: goto 273
      // 26f: invokestatic qbw.a (Loov;)Loov;
      // 272: athrow
      // 273: invokestatic Minecraft.vz1 ()Lc05;
      // 276: getfield Minecraft.tij Lkh3;
      // 279: aload 0
      // 27a: invokevirtual mew.getX ()I
      // 27d: aload 0
      // 27e: invokevirtual mew.getY ()I
      // 281: aload 0
      // 282: invokevirtual mew.getZ ()I
      // 285: invokevirtual WorldClient.tj9 (III)Le0x;
      // 288: instanceof owm
      // 28b: iload 1
      // 28c: ifeq 2ce
      // 28f: goto 296
      // 292: invokestatic qbw.a (Loov;)Loov;
      // 295: athrow
      // 296: ifne 2cd
      // 299: goto 2a0
      // 29c: invokestatic qbw.a (Loov;)Loov;
      // 29f: athrow
      // 2a0: invokestatic Minecraft.vz1 ()Lc05;
      // 2a3: getfield Minecraft.tij Lkh3;
      // 2a6: aload 0
      // 2a7: invokevirtual mew.getX ()I
      // 2aa: aload 0
      // 2ab: invokevirtual mew.getY ()I
      // 2ae: aload 0
      // 2af: invokevirtual mew.getZ ()I
      // 2b2: invokevirtual WorldClient.tj9 (III)Le0x;
      // 2b5: instanceof ell
      // 2b8: iload 1
      // 2b9: ifeq 2ce
      // 2bc: goto 2c3
      // 2bf: invokestatic qbw.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: ifeq 2d1
      // 2c6: goto 2cd
      // 2c9: invokestatic qbw.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: bipush 1
      // 2ce: goto 2d2
      // 2d1: bipush 0
      // 2d2: ireturn
   }

   private static boolean tee(mew param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: getfield Minecraft.tij Lkh3;
      // 0a: aload 0
      // 0b: invokevirtual mew.getX ()I
      // 0e: aload 0
      // 0f: invokevirtual mew.getY ()I
      // 12: aload 0
      // 13: invokevirtual mew.getZ ()I
      // 16: invokevirtual WorldClient.tj9 (III)Le0x;
      // 19: instanceof dqt
      // 1c: iload 1
      // 1d: ifeq 49
      // 20: ifne 5b
      // 23: goto 2a
      // 26: invokestatic qbw.a (Loov;)Loov;
      // 29: athrow
      // 2a: invokestatic Minecraft.vz1 ()Lc05;
      // 2d: getfield Minecraft.tij Lkh3;
      // 30: aload 0
      // 31: invokevirtual mew.getX ()I
      // 34: aload 0
      // 35: invokevirtual mew.getY ()I
      // 38: aload 0
      // 39: invokevirtual mew.getZ ()I
      // 3c: invokevirtual WorldClient.tj9 (III)Le0x;
      // 3f: instanceof f86
      // 42: goto 49
      // 45: invokestatic qbw.a (Loov;)Loov;
      // 48: athrow
      // 49: iload 1
      // 4a: ifeq 58
      // 4d: ifne 5b
      // 50: goto 57
      // 53: invokestatic qbw.a (Loov;)Loov;
      // 56: athrow
      // 57: bipush 1
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   public qbw$aj2 cjo(ue5 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield qbw.v4w Ljava/util/ArrayList;
      // 008: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 00b: astore 3
      // 00c: aload 3
      // 00d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 012: ifeq 091
      // 015: aload 3
      // 016: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 01b: checkcast qbw$aj2
      // 01e: astore 4
      // 020: aload 4
      // 022: invokevirtual qbw$aj2.euw ()Lue5;
      // 025: invokevirtual ue5.h25 ()D
      // 028: aload 1
      // 029: invokevirtual ue5.h25 ()D
      // 02c: dcmpl
      // 02d: iload 2
      // 02e: ifeq 09f
      // 031: iload 2
      // 032: ifeq 05a
      // 035: goto 03c
      // 038: invokestatic qbw.a (Loov;)Loov;
      // 03b: athrow
      // 03c: ifne 08d
      // 03f: goto 046
      // 042: invokestatic qbw.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 4
      // 048: invokevirtual qbw$aj2.euw ()Lue5;
      // 04b: invokevirtual ue5.mji ()D
      // 04e: aload 1
      // 04f: invokevirtual ue5.mji ()D
      // 052: dcmpl
      // 053: goto 05a
      // 056: invokestatic qbw.a (Loov;)Loov;
      // 059: athrow
      // 05a: iload 2
      // 05b: ifeq 087
      // 05e: ifne 08d
      // 061: goto 068
      // 064: invokestatic qbw.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 4
      // 06a: iload 2
      // 06b: ifeq 08c
      // 06e: goto 075
      // 071: invokestatic qbw.a (Loov;)Loov;
      // 074: athrow
      // 075: invokevirtual qbw$aj2.euw ()Lue5;
      // 078: invokevirtual ue5.va0 ()D
      // 07b: aload 1
      // 07c: invokevirtual ue5.va0 ()D
      // 07f: dcmpl
      // 080: goto 087
      // 083: invokestatic qbw.a (Loov;)Loov;
      // 086: athrow
      // 087: ifne 08d
      // 08a: aload 4
      // 08c: areturn
      // 08d: iload 2
      // 08e: ifne 00c
      // 091: aload 0
      // 092: getfield qbw.z8m Ljava/util/ArrayList;
      // 095: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 098: astore 3
      // 099: aload 3
      // 09a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09f: ifeq 113
      // 0a2: aload 3
      // 0a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a8: checkcast qbw$aj2
      // 0ab: astore 4
      // 0ad: aload 4
      // 0af: invokevirtual qbw$aj2.euw ()Lue5;
      // 0b2: invokevirtual ue5.h25 ()D
      // 0b5: aload 1
      // 0b6: invokevirtual ue5.h25 ()D
      // 0b9: dcmpl
      // 0ba: iload 2
      // 0bb: ifeq 0dc
      // 0be: ifne 10f
      // 0c1: goto 0c8
      // 0c4: invokestatic qbw.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 4
      // 0ca: invokevirtual qbw$aj2.euw ()Lue5;
      // 0cd: invokevirtual ue5.mji ()D
      // 0d0: aload 1
      // 0d1: invokevirtual ue5.mji ()D
      // 0d4: dcmpl
      // 0d5: goto 0dc
      // 0d8: invokestatic qbw.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: iload 2
      // 0dd: ifeq 109
      // 0e0: ifne 10f
      // 0e3: goto 0ea
      // 0e6: invokestatic qbw.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 4
      // 0ec: iload 2
      // 0ed: ifeq 10e
      // 0f0: goto 0f7
      // 0f3: invokestatic qbw.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: invokevirtual qbw$aj2.euw ()Lue5;
      // 0fa: invokevirtual ue5.va0 ()D
      // 0fd: aload 1
      // 0fe: invokevirtual ue5.va0 ()D
      // 101: dcmpl
      // 102: goto 109
      // 105: invokestatic qbw.a (Loov;)Loov;
      // 108: athrow
      // 109: ifne 10f
      // 10c: aload 4
      // 10e: areturn
      // 10f: iload 2
      // 110: ifne 099
      // 113: aconst_null
      // 114: areturn
   }

   public boolean tyr(qbw$aj2 param1, ue5 param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 2
      // 002: invokevirtual qbw.cjo (Lue5;)Lqbw$aj2;
      // 005: astore 6
      // 007: invokestatic OpaquePredicate.b ()I
      // 00a: dload 3
      // 00b: dstore 7
      // 00d: istore 5
      // 00f: aload 1
      // 010: iload 5
      // 012: ifeq 02a
      // 015: ifnull 028
      // 018: goto 01f
      // 01b: invokestatic qbw.a (Loov;)Loov;
      // 01e: athrow
      // 01f: dload 7
      // 021: aload 1
      // 022: invokevirtual qbw$aj2.vpi ()D
      // 025: dadd
      // 026: dstore 7
      // 028: aload 6
      // 02a: iload 5
      // 02c: ifeq 140
      // 02f: ifnonnull 137
      // 032: goto 039
      // 035: invokestatic qbw.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 2
      // 03a: invokevirtual ue5.h25 ()D
      // 03d: aload 0
      // 03e: getfield qbw.ohz Lue5;
      // 041: invokevirtual ue5.h25 ()D
      // 044: dcmpl
      // 045: iload 5
      // 047: ifeq 0ac
      // 04a: goto 051
      // 04d: invokestatic qbw.a (Loov;)Loov;
      // 050: athrow
      // 051: ifne 09f
      // 054: goto 05b
      // 057: invokestatic qbw.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 2
      // 05c: invokevirtual ue5.mji ()D
      // 05f: aload 0
      // 060: getfield qbw.ohz Lue5;
      // 063: invokevirtual ue5.mji ()D
      // 066: dcmpl
      // 067: iload 5
      // 069: ifeq 0ac
      // 06c: goto 073
      // 06f: invokestatic qbw.a (Loov;)Loov;
      // 072: athrow
      // 073: ifne 09f
      // 076: goto 07d
      // 079: invokestatic qbw.a (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 2
      // 07e: invokevirtual ue5.va0 ()D
      // 081: aload 0
      // 082: getfield qbw.ohz Lue5;
      // 085: invokevirtual ue5.va0 ()D
      // 088: dcmpl
      // 089: iload 5
      // 08b: ifeq 0fe
      // 08e: goto 095
      // 091: invokestatic qbw.a (Loov;)Loov;
      // 094: athrow
      // 095: ifeq 0de
      // 098: goto 09f
      // 09b: invokestatic qbw.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: getfield qbw.m_o D
      // 0a3: dconst_0
      // 0a4: dcmpl
      // 0a5: goto 0ac
      // 0a8: invokestatic qbw.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 5
      // 0ae: ifeq 0cf
      // 0b1: ifeq 0ff
      // 0b4: goto 0bb
      // 0b7: invokestatic qbw.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 2
      // 0bc: aload 0
      // 0bd: getfield qbw.ohz Lue5;
      // 0c0: invokevirtual ue5.glf (Lue5;)D
      // 0c3: aload 0
      // 0c4: getfield qbw.m_o D
      // 0c7: dcmpg
      // 0c8: goto 0cf
      // 0cb: invokestatic qbw.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 5
      // 0d1: ifeq 0fe
      // 0d4: ifgt 0ff
      // 0d7: goto 0de
      // 0da: invokestatic qbw.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield qbw.cie Ljava/util/ArrayList;
      // 0e2: invokevirtual java/util/ArrayList.clear ()V
      // 0e5: aload 0
      // 0e6: aload 1
      // 0e7: invokevirtual qbw$aj2.obz ()Ljava/util/ArrayList;
      // 0ea: putfield qbw.cie Ljava/util/ArrayList;
      // 0ed: aload 0
      // 0ee: getfield qbw.cie Ljava/util/ArrayList;
      // 0f1: aload 2
      // 0f2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0f5: pop
      // 0f6: bipush 1
      // 0f7: goto 0fe
      // 0fa: invokestatic qbw.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: ireturn
      // 0ff: new java/util/ArrayList
      // 102: dup
      // 103: aload 1
      // 104: invokevirtual qbw$aj2.obz ()Ljava/util/ArrayList;
      // 107: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 10a: astore 9
      // 10c: aload 9
      // 10e: aload 2
      // 10f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 112: pop
      // 113: aload 0
      // 114: getfield qbw.z8m Ljava/util/ArrayList;
      // 117: new qbw$aj2
      // 11a: dup
      // 11b: aload 0
      // 11c: aload 2
      // 11d: aload 1
      // 11e: aload 9
      // 120: aload 2
      // 121: aload 0
      // 122: getfield qbw.ohz Lue5;
      // 125: invokevirtual ue5.glf (Lue5;)D
      // 128: dload 3
      // 129: dload 7
      // 12b: invokespecial qbw$aj2.<init> (Lqbw;Lue5;Lqbw$aj2;Ljava/util/ArrayList;DDD)V
      // 12e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 131: pop
      // 132: iload 5
      // 134: ifne 195
      // 137: aload 6
      // 139: goto 140
      // 13c: invokestatic qbw.a (Loov;)Loov;
      // 13f: athrow
      // 140: invokevirtual qbw$aj2.tlt ()D
      // 143: dload 3
      // 144: dcmpl
      // 145: iload 5
      // 147: ifeq 196
      // 14a: ifle 195
      // 14d: goto 154
      // 150: invokestatic qbw.a (Loov;)Loov;
      // 153: athrow
      // 154: new java/util/ArrayList
      // 157: dup
      // 158: aload 1
      // 159: invokevirtual qbw$aj2.obz ()Ljava/util/ArrayList;
      // 15c: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 15f: astore 9
      // 161: aload 9
      // 163: aload 2
      // 164: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 167: pop
      // 168: aload 6
      // 16a: aload 2
      // 16b: invokevirtual qbw$aj2.rbl (Lue5;)V
      // 16e: aload 6
      // 170: aload 1
      // 171: invokevirtual qbw$aj2.tih (Lqbw$aj2;)V
      // 174: aload 6
      // 176: aload 9
      // 178: invokevirtual qbw$aj2.l50 (Ljava/util/ArrayList;)V
      // 17b: aload 6
      // 17d: aload 2
      // 17e: aload 0
      // 17f: getfield qbw.ohz Lue5;
      // 182: invokevirtual ue5.glf (Lue5;)D
      // 185: invokevirtual qbw$aj2.yya (D)V
      // 188: aload 6
      // 18a: dload 3
      // 18b: invokevirtual qbw$aj2.to4 (D)V
      // 18e: aload 6
      // 190: dload 7
      // 192: invokevirtual qbw$aj2.uy2 (D)V
      // 195: bipush 0
      // 196: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
