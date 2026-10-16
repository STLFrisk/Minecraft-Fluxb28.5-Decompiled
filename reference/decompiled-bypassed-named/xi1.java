import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class xi1 {
   public yve yqm;
   public vt2 p7m;
   public int bl0;
   private static final long d;
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);

   public xi1() {
   }

   public xi1(int var1) {
      this.bl0 = var1;
   }

   public bdo ecx() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic xi1.d J
      // 03: ldc2_w 28074227334437
      // 06: lxor
      // 07: lstore 1
      // 08: new bdo
      // 0b: dup
      // 0c: invokespecial bdo.<init> ()V
      // 0f: astore 4
      // 11: aload 4
      // 13: sipush 6840
      // 16: ldc2_w 4101682653537751240
      // 19: lload 1
      // 1a: lxor
      // 1b: invokedynamic c (IJ)Ljava/lang/String; bsm=xi1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: aload 0
      // 22: invokestatic v8a.o8h (Lxi1;)Ljava/lang/String;
      // 25: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 28: invokestatic OpaquePredicate.b ()I
      // 2b: aload 4
      // 2d: sipush 6819
      // 30: ldc2_w 7909098195698831570
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic c (IJ)Ljava/lang/String; bsm=xi1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: aload 0
      // 3c: getfield xi1.yqm Lyve;
      // 3f: invokevirtual yve.ubs ()Lmvq;
      // 42: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 45: istore 3
      // 46: aload 4
      // 48: ldc "O"
      // 4a: nop
      // 4b: aload 0
      // 4c: getfield xi1.p7m Lvt2;
      // 4f: iload 3
      // 50: ifeq 69
      // 53: ifnonnull 65
      // 56: goto 5d
      // 59: invokestatic xi1.d (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush -1
      // 5e: goto 6c
      // 61: invokestatic xi1.d (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: getfield xi1.p7m Lvt2;
      // 69: invokevirtual vt2.tmy ()I
      // 6c: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 6f: aload 4
      // 71: sipush 15381
      // 74: ldc2_w 4162358650226112097
      // 77: lload 1
      // 78: lxor
      // 79: invokedynamic c (IJ)Ljava/lang/String; bsm=xi1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: nop
      // 7f: aload 0
      // 80: getfield xi1.bl0 I
      // 83: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 86: aload 0
      // 87: aload 4
      // 89: invokevirtual xi1.z0d (Lbdo;)V
      // 8c: aload 4
      // 8e: areturn
   }

   public abstract void z0d(bdo var1);

   public void LoginScreen(OpaquePredicate param1, bdo param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic xi1.d J
      // 03: ldc2_w 8865710785295
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: sipush 9235
      // 11: ldc2_w 7026440133259350091
      // 14: lload 3
      // 15: lxor
      // 16: invokedynamic c (IJ)Ljava/lang/String; bsm=xi1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // 1f: iload 5
      // 21: ifne 59
      // 24: ifeq 52
      // 27: goto 2e
      // 2a: invokestatic xi1.d (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: new yve
      // 32: dup
      // 33: aload 2
      // 34: sipush 6819
      // 37: ldc2_w 7909116438560763640
      // 3a: lload 3
      // 3b: lxor
      // 3c: invokedynamic c (IJ)Ljava/lang/String; bsm=xi1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: nop
      // 42: invokevirtual bdo.hkr (Ljava/lang/String;)[I
      // 45: invokespecial yve.<init> ([I)V
      // 48: putfield xi1.yqm Lyve;
      // 4b: goto 52
      // 4e: invokestatic xi1.d (Loov;)Loov;
      // 51: athrow
      // 52: aload 2
      // 53: ldc "O"
      // 55: nop
      // 56: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 59: istore 6
      // 5b: aload 0
      // 5c: iload 6
      // 5e: iload 5
      // 60: ifne 78
      // 63: bipush -1
      // 64: if_icmpne 76
      // 67: goto 6e
      // 6a: invokestatic xi1.d (Loov;)Loov;
      // 6d: athrow
      // 6e: aconst_null
      // 6f: goto 7b
      // 72: invokestatic xi1.d (Loov;)Loov;
      // 75: athrow
      // 76: iload 6
      // 78: invokestatic vt2.bm6 (I)Lvt2;
      // 7b: putfield xi1.p7m Lvt2;
      // 7e: aload 0
      // 7f: aload 2
      // 80: sipush 31680
      // 83: ldc2_w 9096034330901057433
      // 86: lload 3
      // 87: lxor
      // 88: invokedynamic c (IJ)Ljava/lang/String; bsm=xi1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: nop
      // 8e: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 91: putfield xi1.bl0 I
      // 94: aload 0
      // 95: aload 2
      // 96: invokevirtual xi1.oqf (Lbdo;)V
      // 99: return
   }

   public abstract void oqf(bdo var1);

   public void vxr(xi1 var1, List var2, Random var3) {
   }

   public abstract boolean d__(OpaquePredicate var1, Random var2, yve var3);

   public yve q1q() {
      return this.yqm;
   }

   public int gd3() {
      return this.bl0;
   }

   public static xi1 qvo(List param0, yve param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a: astore 3
      // 0b: aload 3
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 5e
      // 14: aload 3
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast xi1
      // 1d: astore 4
      // 1f: aload 4
      // 21: invokevirtual xi1.q1q ()Lyve;
      // 24: iload 2
      // 25: ifeq 49
      // 28: ifnull 5a
      // 2b: goto 32
      // 2e: invokestatic xi1.d (Loov;)Loov;
      // 31: athrow
      // 32: aload 4
      // 34: iload 2
      // 35: ifeq 59
      // 38: goto 3f
      // 3b: invokestatic xi1.d (Loov;)Loov;
      // 3e: athrow
      // 3f: invokevirtual xi1.q1q ()Lyve;
      // 42: goto 49
      // 45: invokestatic xi1.d (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: invokevirtual yve.fsa (Lyve;)Z
      // 4d: ifeq 5a
      // 50: aload 4
      // 52: goto 59
      // 55: invokestatic xi1.d (Loov;)Loov;
      // 58: athrow
      // 59: areturn
      // 5a: iload 2
      // 5b: ifne 0b
      // 5e: aconst_null
      // 5f: areturn
   }

   public mew xqt() {
      return new mew(this.yqm.d6k());
   }

   public boolean knc(OpaquePredicate param1, yve param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield xi1.yqm Lyve;
      // 004: getfield yve.gdj I
      // 007: bipush 1
      // 008: isub
      // 009: aload 2
      // 00a: getfield yve.gdj I
      // 00d: invokestatic java/lang/Math.max (II)I
      // 010: istore 4
      // 012: aload 0
      // 013: getfield xi1.yqm Lyve;
      // 016: getfield yve._3o I
      // 019: bipush 1
      // 01a: isub
      // 01b: aload 2
      // 01c: getfield yve._3o I
      // 01f: invokestatic java/lang/Math.max (II)I
      // 022: istore 5
      // 024: aload 0
      // 025: getfield xi1.yqm Lyve;
      // 028: getfield yve.ob0 I
      // 02b: bipush 1
      // 02c: isub
      // 02d: aload 2
      // 02e: getfield yve.ob0 I
      // 031: invokestatic java/lang/Math.max (II)I
      // 034: istore 6
      // 036: invokestatic OpaquePredicate.c ()I
      // 039: aload 0
      // 03a: getfield xi1.yqm Lyve;
      // 03d: getfield yve.kwp I
      // 040: bipush 1
      // 041: iadd
      // 042: aload 2
      // 043: getfield yve.kwp I
      // 046: invokestatic java/lang/Math.min (II)I
      // 049: istore 7
      // 04b: aload 0
      // 04c: getfield xi1.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: bipush 1
      // 053: iadd
      // 054: aload 2
      // 055: getfield yve.ixv I
      // 058: invokestatic java/lang/Math.min (II)I
      // 05b: istore 8
      // 05d: aload 0
      // 05e: getfield xi1.yqm Lyve;
      // 061: getfield yve.nwc I
      // 064: bipush 1
      // 065: iadd
      // 066: aload 2
      // 067: getfield yve.nwc I
      // 06a: invokestatic java/lang/Math.min (II)I
      // 06d: istore 9
      // 06f: istore 3
      // 070: new mew$mix
      // 073: dup
      // 074: invokespecial mew$mix.<init> ()V
      // 077: astore 10
      // 079: iload 4
      // 07b: istore 11
      // 07d: iload 11
      // 07f: iload 7
      // 081: if_icmpgt 0fd
      // 084: iload 6
      // 086: iload 3
      // 087: ifne 0ff
      // 08a: istore 12
      // 08c: iload 12
      // 08e: iload 9
      // 090: if_icmpgt 0f6
      // 093: aload 1
      // 094: aload 10
      // 096: iload 11
      // 098: iload 5
      // 09a: iload 12
      // 09c: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 09f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a2: invokeinterface zfz.r_y ()Le0x; 1
      // 0a7: invokevirtual e0x.p1r ()Lp3y;
      // 0aa: invokevirtual p3y.l7j ()Z
      // 0ad: iload 3
      // 0ae: ifne 07f
      // 0b1: iload 3
      // 0b2: ifne 0df
      // 0b5: ifeq 0c5
      // 0b8: goto 0bf
      // 0bb: invokestatic xi1.d (Loov;)Loov;
      // 0be: athrow
      // 0bf: bipush 1
      // 0c0: ireturn
      // 0c1: invokestatic xi1.d (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 1
      // 0c6: aload 10
      // 0c8: iload 11
      // 0ca: iload 8
      // 0cc: iload 12
      // 0ce: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0d1: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0d4: invokeinterface zfz.r_y ()Le0x; 1
      // 0d9: invokevirtual e0x.p1r ()Lp3y;
      // 0dc: invokevirtual p3y.l7j ()Z
      // 0df: iload 3
      // 0e0: ifne 0ee
      // 0e3: ifeq 0ef
      // 0e6: goto 0ed
      // 0e9: invokestatic xi1.d (Loov;)Loov;
      // 0ec: athrow
      // 0ed: bipush 1
      // 0ee: ireturn
      // 0ef: iinc 12 1
      // 0f2: iload 3
      // 0f3: ifeq 08c
      // 0f6: iinc 11 1
      // 0f9: iload 3
      // 0fa: ifeq 07d
      // 0fd: iload 4
      // 0ff: istore 11
      // 101: iload 11
      // 103: iload 7
      // 105: if_icmpgt 181
      // 108: iload 5
      // 10a: iload 3
      // 10b: ifne 183
      // 10e: istore 12
      // 110: iload 12
      // 112: iload 8
      // 114: if_icmpgt 17a
      // 117: aload 1
      // 118: aload 10
      // 11a: iload 11
      // 11c: iload 12
      // 11e: iload 6
      // 120: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 123: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 126: invokeinterface zfz.r_y ()Le0x; 1
      // 12b: invokevirtual e0x.p1r ()Lp3y;
      // 12e: invokevirtual p3y.l7j ()Z
      // 131: iload 3
      // 132: ifne 103
      // 135: iload 3
      // 136: ifne 163
      // 139: ifeq 149
      // 13c: goto 143
      // 13f: invokestatic xi1.d (Loov;)Loov;
      // 142: athrow
      // 143: bipush 1
      // 144: ireturn
      // 145: invokestatic xi1.d (Loov;)Loov;
      // 148: athrow
      // 149: aload 1
      // 14a: aload 10
      // 14c: iload 11
      // 14e: iload 12
      // 150: iload 9
      // 152: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 155: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 158: invokeinterface zfz.r_y ()Le0x; 1
      // 15d: invokevirtual e0x.p1r ()Lp3y;
      // 160: invokevirtual p3y.l7j ()Z
      // 163: iload 3
      // 164: ifne 172
      // 167: ifeq 173
      // 16a: goto 171
      // 16d: invokestatic xi1.d (Loov;)Loov;
      // 170: athrow
      // 171: bipush 1
      // 172: ireturn
      // 173: iinc 12 1
      // 176: iload 3
      // 177: ifeq 110
      // 17a: iinc 11 1
      // 17d: iload 3
      // 17e: ifeq 101
      // 181: iload 6
      // 183: istore 11
      // 185: iload 11
      // 187: iload 9
      // 189: if_icmpgt 205
      // 18c: iload 5
      // 18e: iload 3
      // 18f: ifne 206
      // 192: istore 12
      // 194: iload 12
      // 196: iload 8
      // 198: if_icmpgt 1fe
      // 19b: aload 1
      // 19c: aload 10
      // 19e: iload 4
      // 1a0: iload 12
      // 1a2: iload 11
      // 1a4: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 1a7: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1aa: invokeinterface zfz.r_y ()Le0x; 1
      // 1af: invokevirtual e0x.p1r ()Lp3y;
      // 1b2: invokevirtual p3y.l7j ()Z
      // 1b5: iload 3
      // 1b6: ifne 187
      // 1b9: iload 3
      // 1ba: ifne 1e7
      // 1bd: ifeq 1cd
      // 1c0: goto 1c7
      // 1c3: invokestatic xi1.d (Loov;)Loov;
      // 1c6: athrow
      // 1c7: bipush 1
      // 1c8: ireturn
      // 1c9: invokestatic xi1.d (Loov;)Loov;
      // 1cc: athrow
      // 1cd: aload 1
      // 1ce: aload 10
      // 1d0: iload 7
      // 1d2: iload 12
      // 1d4: iload 11
      // 1d6: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 1d9: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1dc: invokeinterface zfz.r_y ()Le0x; 1
      // 1e1: invokevirtual e0x.p1r ()Lp3y;
      // 1e4: invokevirtual p3y.l7j ()Z
      // 1e7: iload 3
      // 1e8: ifne 1f6
      // 1eb: ifeq 1f7
      // 1ee: goto 1f5
      // 1f1: invokestatic xi1.d (Loov;)Loov;
      // 1f4: athrow
      // 1f5: bipush 1
      // 1f6: ireturn
      // 1f7: iinc 12 1
      // 1fa: iload 3
      // 1fb: ifeq 194
      // 1fe: iinc 11 1
      // 201: iload 3
      // 202: ifeq 185
      // 205: bipush 0
      // 206: ireturn
   }

   public int q__(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield xi1.p7m Lvt2;
      // 08: ifnonnull 11
      // 0b: iload 1
      // 0c: ireturn
      // 0d: invokestatic xi1.d (Loov;)Loov;
      // 10: athrow
      // 11: getstatic xi1$1.wyc [I
      // 14: aload 0
      // 15: getfield xi1.p7m Lvt2;
      // 18: invokevirtual vt2.ordinal ()I
      // 1b: iaload
      // 1c: iload 3
      // 1d: ifne 67
      // 20: tableswitch 70 1 4 36 36 50 60
      // 40: invokestatic xi1.d (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield xi1.yqm Lyve;
      // 48: getfield yve.gdj I
      // 4b: iload 1
      // 4c: iadd
      // 4d: ireturn
      // 4e: invokestatic xi1.d (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getfield xi1.yqm Lyve;
      // 56: getfield yve.kwp I
      // 59: iload 2
      // 5a: isub
      // 5b: ireturn
      // 5c: aload 0
      // 5d: getfield xi1.yqm Lyve;
      // 60: getfield yve.gdj I
      // 63: iload 2
      // 64: iadd
      // 65: ireturn
      // 66: iload 1
      // 67: ireturn
   }

   public int _tw(int var1) {
      try {
         if (this.p7m == null) {
            return var1;
         }
      } catch (oov var2) {
         throw d(var2);
      }

      return var1 + this.yqm._3o;
   }

   public int _ye(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield xi1.p7m Lvt2;
      // 08: ifnonnull 11
      // 0b: iload 2
      // 0c: ireturn
      // 0d: invokestatic xi1.d (Loov;)Loov;
      // 10: athrow
      // 11: getstatic xi1$1.wyc [I
      // 14: aload 0
      // 15: getfield xi1.p7m Lvt2;
      // 18: invokevirtual vt2.ordinal ()I
      // 1b: iaload
      // 1c: iload 3
      // 1d: ifne 67
      // 20: tableswitch 70 1 4 36 50 60 60
      // 40: invokestatic xi1.d (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield xi1.yqm Lyve;
      // 48: getfield yve.nwc I
      // 4b: iload 2
      // 4c: isub
      // 4d: ireturn
      // 4e: invokestatic xi1.d (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getfield xi1.yqm Lyve;
      // 56: getfield yve.ob0 I
      // 59: iload 2
      // 5a: iadd
      // 5b: ireturn
      // 5c: aload 0
      // 5d: getfield xi1.yqm Lyve;
      // 60: getfield yve.ob0 I
      // 63: iload 1
      // 64: iadd
      // 65: ireturn
      // 66: iload 2
      // 67: ireturn
   }

   public int ujv(e0x param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifeq 063
      // 009: getstatic ox_.r_v Le0x;
      // 00c: if_acmpne 062
      // 00f: goto 016
      // 012: invokestatic xi1.d (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield xi1.p7m Lvt2;
      // 01a: getstatic vt2.te4 Lvt2;
      // 01d: iload 3
      // 01e: ifeq 040
      // 021: goto 028
      // 024: invokestatic xi1.d (Loov;)Loov;
      // 027: athrow
      // 028: if_acmpeq 043
      // 02b: goto 032
      // 02e: invokestatic xi1.d (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: getfield xi1.p7m Lvt2;
      // 036: getstatic vt2.zk4 Lvt2;
      // 039: goto 040
      // 03c: invokestatic xi1.d (Loov;)Loov;
      // 03f: athrow
      // 040: if_acmpne 916
      // 043: iload 2
      // 044: iload 3
      // 045: ifeq 061
      // 048: goto 04f
      // 04b: invokestatic xi1.d (Loov;)Loov;
      // 04e: athrow
      // 04f: bipush 1
      // 050: if_icmpne 060
      // 053: goto 05a
      // 056: invokestatic xi1.d (Loov;)Loov;
      // 059: athrow
      // 05a: bipush 0
      // 05b: ireturn
      // 05c: invokestatic xi1.d (Loov;)Loov;
      // 05f: athrow
      // 060: bipush 1
      // 061: ireturn
      // 062: aload 1
      // 063: iload 3
      // 064: ifeq 0f6
      // 067: instanceof w4e
      // 06a: ifeq 0f5
      // 06d: goto 074
      // 070: invokestatic xi1.d (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: getfield xi1.p7m Lvt2;
      // 078: getstatic vt2.mxp Lvt2;
      // 07b: iload 3
      // 07c: ifeq 0c9
      // 07f: goto 086
      // 082: invokestatic xi1.d (Loov;)Loov;
      // 085: athrow
      // 086: if_acmpne 0c2
      // 089: goto 090
      // 08c: invokestatic xi1.d (Loov;)Loov;
      // 08f: athrow
      // 090: iload 2
      // 091: iload 3
      // 092: ifeq 0ad
      // 095: goto 09c
      // 098: invokestatic xi1.d (Loov;)Loov;
      // 09b: athrow
      // 09c: ifne 0ac
      // 09f: goto 0a6
      // 0a2: invokestatic xi1.d (Loov;)Loov;
      // 0a5: athrow
      // 0a6: bipush 2
      // 0a7: ireturn
      // 0a8: invokestatic xi1.d (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 2
      // 0ad: iload 3
      // 0ae: ifeq 917
      // 0b1: bipush 2
      // 0b2: if_icmpne 916
      // 0b5: goto 0bc
      // 0b8: invokestatic xi1.d (Loov;)Loov;
      // 0bb: athrow
      // 0bc: bipush 0
      // 0bd: ireturn
      // 0be: invokestatic xi1.d (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield xi1.p7m Lvt2;
      // 0c6: getstatic vt2.te4 Lvt2;
      // 0c9: iload 3
      // 0ca: ifeq 0e8
      // 0cd: if_acmpne 0e1
      // 0d0: goto 0d7
      // 0d3: invokestatic xi1.d (Loov;)Loov;
      // 0d6: athrow
      // 0d7: iload 2
      // 0d8: bipush 1
      // 0d9: iadd
      // 0da: bipush 3
      // 0db: iand
      // 0dc: ireturn
      // 0dd: invokestatic xi1.d (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield xi1.p7m Lvt2;
      // 0e5: getstatic vt2.zk4 Lvt2;
      // 0e8: if_acmpne 916
      // 0eb: iload 2
      // 0ec: bipush 3
      // 0ed: iadd
      // 0ee: bipush 3
      // 0ef: iand
      // 0f0: ireturn
      // 0f1: invokestatic xi1.d (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 1
      // 0f6: getstatic ox_.l3f Le0x;
      // 0f9: iload 3
      // 0fa: ifeq 112
      // 0fd: if_acmpeq 7ec
      // 100: goto 107
      // 103: invokestatic xi1.d (Loov;)Loov;
      // 106: athrow
      // 107: aload 1
      // 108: getstatic ox_.olk Le0x;
      // 10b: goto 112
      // 10e: invokestatic xi1.d (Loov;)Loov;
      // 111: athrow
      // 112: iload 3
      // 113: ifeq 12b
      // 116: if_acmpeq 7ec
      // 119: goto 120
      // 11c: invokestatic xi1.d (Loov;)Loov;
      // 11f: athrow
      // 120: aload 1
      // 121: getstatic ox_.aek Le0x;
      // 124: goto 12b
      // 127: invokestatic xi1.d (Loov;)Loov;
      // 12a: athrow
      // 12b: iload 3
      // 12c: ifeq 144
      // 12f: if_acmpeq 7ec
      // 132: goto 139
      // 135: invokestatic xi1.d (Loov;)Loov;
      // 138: athrow
      // 139: aload 1
      // 13a: getstatic ox_.clp Le0x;
      // 13d: goto 144
      // 140: invokestatic xi1.d (Loov;)Loov;
      // 143: athrow
      // 144: iload 3
      // 145: ifeq 15d
      // 148: if_acmpeq 7ec
      // 14b: goto 152
      // 14e: invokestatic xi1.d (Loov;)Loov;
      // 151: athrow
      // 152: aload 1
      // 153: getstatic ox_.qci Le0x;
      // 156: goto 15d
      // 159: invokestatic xi1.d (Loov;)Loov;
      // 15c: athrow
      // 15d: iload 3
      // 15e: ifeq 176
      // 161: if_acmpeq 7ec
      // 164: goto 16b
      // 167: invokestatic xi1.d (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 1
      // 16c: getstatic ox_.h49 Le0x;
      // 16f: goto 176
      // 172: invokestatic xi1.d (Loov;)Loov;
      // 175: athrow
      // 176: iload 3
      // 177: ifeq 323
      // 17a: if_acmpne 314
      // 17d: goto 184
      // 180: invokestatic xi1.d (Loov;)Loov;
      // 183: athrow
      // 184: aload 0
      // 185: getfield xi1.p7m Lvt2;
      // 188: getstatic vt2.mxp Lvt2;
      // 18b: iload 3
      // 18c: ifeq 1ee
      // 18f: goto 196
      // 192: invokestatic xi1.d (Loov;)Loov;
      // 195: athrow
      // 196: if_acmpne 1e7
      // 199: goto 1a0
      // 19c: invokestatic xi1.d (Loov;)Loov;
      // 19f: athrow
      // 1a0: iload 2
      // 1a1: getstatic vt2.z9q Lvt2;
      // 1a4: invokevirtual vt2.c3s ()I
      // 1a7: iload 3
      // 1a8: ifeq 1d9
      // 1ab: goto 1b2
      // 1ae: invokestatic xi1.d (Loov;)Loov;
      // 1b1: athrow
      // 1b2: if_icmpne 1c7
      // 1b5: goto 1bc
      // 1b8: invokestatic xi1.d (Loov;)Loov;
      // 1bb: athrow
      // 1bc: getstatic vt2.mxp Lvt2;
      // 1bf: invokevirtual vt2.c3s ()I
      // 1c2: ireturn
      // 1c3: invokestatic xi1.d (Loov;)Loov;
      // 1c6: athrow
      // 1c7: iload 2
      // 1c8: iload 3
      // 1c9: ifeq 917
      // 1cc: getstatic vt2.mxp Lvt2;
      // 1cf: invokevirtual vt2.c3s ()I
      // 1d2: goto 1d9
      // 1d5: invokestatic xi1.d (Loov;)Loov;
      // 1d8: athrow
      // 1d9: if_icmpne 916
      // 1dc: getstatic vt2.z9q Lvt2;
      // 1df: invokevirtual vt2.c3s ()I
      // 1e2: ireturn
      // 1e3: invokestatic xi1.d (Loov;)Loov;
      // 1e6: athrow
      // 1e7: aload 0
      // 1e8: getfield xi1.p7m Lvt2;
      // 1eb: getstatic vt2.te4 Lvt2;
      // 1ee: iload 3
      // 1ef: ifeq 28a
      // 1f2: if_acmpne 283
      // 1f5: goto 1fc
      // 1f8: invokestatic xi1.d (Loov;)Loov;
      // 1fb: athrow
      // 1fc: iload 2
      // 1fd: getstatic vt2.z9q Lvt2;
      // 200: invokevirtual vt2.c3s ()I
      // 203: iload 3
      // 204: ifeq 22a
      // 207: goto 20e
      // 20a: invokestatic xi1.d (Loov;)Loov;
      // 20d: athrow
      // 20e: if_icmpne 223
      // 211: goto 218
      // 214: invokestatic xi1.d (Loov;)Loov;
      // 217: athrow
      // 218: getstatic vt2.te4 Lvt2;
      // 21b: invokevirtual vt2.c3s ()I
      // 21e: ireturn
      // 21f: invokestatic xi1.d (Loov;)Loov;
      // 222: athrow
      // 223: iload 2
      // 224: getstatic vt2.mxp Lvt2;
      // 227: invokevirtual vt2.c3s ()I
      // 22a: iload 3
      // 22b: ifeq 24a
      // 22e: if_icmpne 243
      // 231: goto 238
      // 234: invokestatic xi1.d (Loov;)Loov;
      // 237: athrow
      // 238: getstatic vt2.zk4 Lvt2;
      // 23b: invokevirtual vt2.c3s ()I
      // 23e: ireturn
      // 23f: invokestatic xi1.d (Loov;)Loov;
      // 242: athrow
      // 243: iload 2
      // 244: getstatic vt2.te4 Lvt2;
      // 247: invokevirtual vt2.c3s ()I
      // 24a: iload 3
      // 24b: ifeq 275
      // 24e: if_icmpne 263
      // 251: goto 258
      // 254: invokestatic xi1.d (Loov;)Loov;
      // 257: athrow
      // 258: getstatic vt2.z9q Lvt2;
      // 25b: invokevirtual vt2.c3s ()I
      // 25e: ireturn
      // 25f: invokestatic xi1.d (Loov;)Loov;
      // 262: athrow
      // 263: iload 2
      // 264: iload 3
      // 265: ifeq 917
      // 268: getstatic vt2.zk4 Lvt2;
      // 26b: invokevirtual vt2.c3s ()I
      // 26e: goto 275
      // 271: invokestatic xi1.d (Loov;)Loov;
      // 274: athrow
      // 275: if_icmpne 916
      // 278: getstatic vt2.mxp Lvt2;
      // 27b: invokevirtual vt2.c3s ()I
      // 27e: ireturn
      // 27f: invokestatic xi1.d (Loov;)Loov;
      // 282: athrow
      // 283: aload 0
      // 284: getfield xi1.p7m Lvt2;
      // 287: getstatic vt2.zk4 Lvt2;
      // 28a: if_acmpne 916
      // 28d: iload 2
      // 28e: getstatic vt2.z9q Lvt2;
      // 291: invokevirtual vt2.c3s ()I
      // 294: iload 3
      // 295: ifeq 2bb
      // 298: goto 29f
      // 29b: invokestatic xi1.d (Loov;)Loov;
      // 29e: athrow
      // 29f: if_icmpne 2b4
      // 2a2: goto 2a9
      // 2a5: invokestatic xi1.d (Loov;)Loov;
      // 2a8: athrow
      // 2a9: getstatic vt2.zk4 Lvt2;
      // 2ac: invokevirtual vt2.c3s ()I
      // 2af: ireturn
      // 2b0: invokestatic xi1.d (Loov;)Loov;
      // 2b3: athrow
      // 2b4: iload 2
      // 2b5: getstatic vt2.mxp Lvt2;
      // 2b8: invokevirtual vt2.c3s ()I
      // 2bb: iload 3
      // 2bc: ifeq 2db
      // 2bf: if_icmpne 2d4
      // 2c2: goto 2c9
      // 2c5: invokestatic xi1.d (Loov;)Loov;
      // 2c8: athrow
      // 2c9: getstatic vt2.te4 Lvt2;
      // 2cc: invokevirtual vt2.c3s ()I
      // 2cf: ireturn
      // 2d0: invokestatic xi1.d (Loov;)Loov;
      // 2d3: athrow
      // 2d4: iload 2
      // 2d5: getstatic vt2.te4 Lvt2;
      // 2d8: invokevirtual vt2.c3s ()I
      // 2db: iload 3
      // 2dc: ifeq 306
      // 2df: if_icmpne 2f4
      // 2e2: goto 2e9
      // 2e5: invokestatic xi1.d (Loov;)Loov;
      // 2e8: athrow
      // 2e9: getstatic vt2.z9q Lvt2;
      // 2ec: invokevirtual vt2.c3s ()I
      // 2ef: ireturn
      // 2f0: invokestatic xi1.d (Loov;)Loov;
      // 2f3: athrow
      // 2f4: iload 2
      // 2f5: iload 3
      // 2f6: ifeq 917
      // 2f9: getstatic vt2.zk4 Lvt2;
      // 2fc: invokevirtual vt2.c3s ()I
      // 2ff: goto 306
      // 302: invokestatic xi1.d (Loov;)Loov;
      // 305: athrow
      // 306: if_icmpne 916
      // 309: getstatic vt2.mxp Lvt2;
      // 30c: invokevirtual vt2.c3s ()I
      // 30f: ireturn
      // 310: invokestatic xi1.d (Loov;)Loov;
      // 313: athrow
      // 314: aload 1
      // 315: iload 3
      // 316: ifeq 453
      // 319: getstatic ox_.oiw Le0x;
      // 31c: goto 323
      // 31f: invokestatic xi1.d (Loov;)Loov;
      // 322: athrow
      // 323: if_acmpne 452
      // 326: aload 0
      // 327: getfield xi1.p7m Lvt2;
      // 32a: getstatic vt2.mxp Lvt2;
      // 32d: iload 3
      // 32e: ifeq 37c
      // 331: goto 338
      // 334: invokestatic xi1.d (Loov;)Loov;
      // 337: athrow
      // 338: if_acmpne 375
      // 33b: goto 342
      // 33e: invokestatic xi1.d (Loov;)Loov;
      // 341: athrow
      // 342: iload 2
      // 343: bipush 3
      // 344: iload 3
      // 345: ifeq 36c
      // 348: goto 34f
      // 34b: invokestatic xi1.d (Loov;)Loov;
      // 34e: athrow
      // 34f: if_icmpne 35f
      // 352: goto 359
      // 355: invokestatic xi1.d (Loov;)Loov;
      // 358: athrow
      // 359: bipush 4
      // 35a: ireturn
      // 35b: invokestatic xi1.d (Loov;)Loov;
      // 35e: athrow
      // 35f: iload 2
      // 360: iload 3
      // 361: ifeq 917
      // 364: bipush 4
      // 365: goto 36c
      // 368: invokestatic xi1.d (Loov;)Loov;
      // 36b: athrow
      // 36c: if_icmpne 916
      // 36f: bipush 3
      // 370: ireturn
      // 371: invokestatic xi1.d (Loov;)Loov;
      // 374: athrow
      // 375: aload 0
      // 376: getfield xi1.p7m Lvt2;
      // 379: getstatic vt2.te4 Lvt2;
      // 37c: iload 3
      // 37d: ifeq 3f0
      // 380: if_acmpne 3e9
      // 383: goto 38a
      // 386: invokestatic xi1.d (Loov;)Loov;
      // 389: athrow
      // 38a: iload 2
      // 38b: bipush 3
      // 38c: iload 3
      // 38d: ifeq 3a9
      // 390: goto 397
      // 393: invokestatic xi1.d (Loov;)Loov;
      // 396: athrow
      // 397: if_icmpne 3a7
      // 39a: goto 3a1
      // 39d: invokestatic xi1.d (Loov;)Loov;
      // 3a0: athrow
      // 3a1: bipush 1
      // 3a2: ireturn
      // 3a3: invokestatic xi1.d (Loov;)Loov;
      // 3a6: athrow
      // 3a7: iload 2
      // 3a8: bipush 4
      // 3a9: iload 3
      // 3aa: ifeq 3bf
      // 3ad: if_icmpne 3bd
      // 3b0: goto 3b7
      // 3b3: invokestatic xi1.d (Loov;)Loov;
      // 3b6: athrow
      // 3b7: bipush 2
      // 3b8: ireturn
      // 3b9: invokestatic xi1.d (Loov;)Loov;
      // 3bc: athrow
      // 3bd: iload 2
      // 3be: bipush 2
      // 3bf: iload 3
      // 3c0: ifeq 3e0
      // 3c3: if_icmpne 3d3
      // 3c6: goto 3cd
      // 3c9: invokestatic xi1.d (Loov;)Loov;
      // 3cc: athrow
      // 3cd: bipush 3
      // 3ce: ireturn
      // 3cf: invokestatic xi1.d (Loov;)Loov;
      // 3d2: athrow
      // 3d3: iload 2
      // 3d4: iload 3
      // 3d5: ifeq 917
      // 3d8: bipush 1
      // 3d9: goto 3e0
      // 3dc: invokestatic xi1.d (Loov;)Loov;
      // 3df: athrow
      // 3e0: if_icmpne 916
      // 3e3: bipush 4
      // 3e4: ireturn
      // 3e5: invokestatic xi1.d (Loov;)Loov;
      // 3e8: athrow
      // 3e9: aload 0
      // 3ea: getfield xi1.p7m Lvt2;
      // 3ed: getstatic vt2.zk4 Lvt2;
      // 3f0: if_acmpne 916
      // 3f3: iload 2
      // 3f4: bipush 3
      // 3f5: iload 3
      // 3f6: ifeq 412
      // 3f9: goto 400
      // 3fc: invokestatic xi1.d (Loov;)Loov;
      // 3ff: athrow
      // 400: if_icmpne 410
      // 403: goto 40a
      // 406: invokestatic xi1.d (Loov;)Loov;
      // 409: athrow
      // 40a: bipush 2
      // 40b: ireturn
      // 40c: invokestatic xi1.d (Loov;)Loov;
      // 40f: athrow
      // 410: iload 2
      // 411: bipush 4
      // 412: iload 3
      // 413: ifeq 428
      // 416: if_icmpne 426
      // 419: goto 420
      // 41c: invokestatic xi1.d (Loov;)Loov;
      // 41f: athrow
      // 420: bipush 1
      // 421: ireturn
      // 422: invokestatic xi1.d (Loov;)Loov;
      // 425: athrow
      // 426: iload 2
      // 427: bipush 2
      // 428: iload 3
      // 429: ifeq 449
      // 42c: if_icmpne 43c
      // 42f: goto 436
      // 432: invokestatic xi1.d (Loov;)Loov;
      // 435: athrow
      // 436: bipush 3
      // 437: ireturn
      // 438: invokestatic xi1.d (Loov;)Loov;
      // 43b: athrow
      // 43c: iload 2
      // 43d: iload 3
      // 43e: ifeq 917
      // 441: bipush 1
      // 442: goto 449
      // 445: invokestatic xi1.d (Loov;)Loov;
      // 448: athrow
      // 449: if_icmpne 916
      // 44c: bipush 4
      // 44d: ireturn
      // 44e: invokestatic xi1.d (Loov;)Loov;
      // 451: athrow
      // 452: aload 1
      // 453: iload 3
      // 454: ifeq 46c
      // 457: getstatic ox_.r11 Ll2c;
      // 45a: if_acmpeq 669
      // 45d: goto 464
      // 460: invokestatic xi1.d (Loov;)Loov;
      // 463: athrow
      // 464: aload 1
      // 465: goto 46c
      // 468: invokestatic xi1.d (Loov;)Loov;
      // 46b: athrow
      // 46c: instanceof sq9
      // 46f: iload 3
      // 470: ifeq 66a
      // 473: ifne 669
      // 476: goto 47d
      // 479: invokestatic xi1.d (Loov;)Loov;
      // 47c: athrow
      // 47d: aload 1
      // 47e: getstatic ox_.nc0 Laog;
      // 481: iload 3
      // 482: ifeq 4a1
      // 485: goto 48c
      // 488: invokestatic xi1.d (Loov;)Loov;
      // 48b: athrow
      // 48c: if_acmpeq 4d6
      // 48f: goto 496
      // 492: invokestatic xi1.d (Loov;)Loov;
      // 495: athrow
      // 496: aload 1
      // 497: getstatic ox_.wdk Laog;
      // 49a: goto 4a1
      // 49d: invokestatic xi1.d (Loov;)Loov;
      // 4a0: athrow
      // 4a1: iload 3
      // 4a2: ifeq 4ba
      // 4a5: if_acmpeq 4d6
      // 4a8: goto 4af
      // 4ab: invokestatic xi1.d (Loov;)Loov;
      // 4ae: athrow
      // 4af: aload 1
      // 4b0: getstatic ox_.lqx Le0x;
      // 4b3: goto 4ba
      // 4b6: invokestatic xi1.d (Loov;)Loov;
      // 4b9: athrow
      // 4ba: iload 3
      // 4bb: ifeq 4d3
      // 4be: if_acmpeq 4d6
      // 4c1: goto 4c8
      // 4c4: invokestatic xi1.d (Loov;)Loov;
      // 4c7: athrow
      // 4c8: aload 1
      // 4c9: getstatic ox_.e1f Le0x;
      // 4cc: goto 4d3
      // 4cf: invokestatic xi1.d (Loov;)Loov;
      // 4d2: athrow
      // 4d3: if_acmpne 916
      // 4d6: aload 0
      // 4d7: getfield xi1.p7m Lvt2;
      // 4da: getstatic vt2.mxp Lvt2;
      // 4dd: iload 3
      // 4de: ifeq 543
      // 4e1: goto 4e8
      // 4e4: invokestatic xi1.d (Loov;)Loov;
      // 4e7: athrow
      // 4e8: if_acmpne 53c
      // 4eb: goto 4f2
      // 4ee: invokestatic xi1.d (Loov;)Loov;
      // 4f1: athrow
      // 4f2: iload 2
      // 4f3: iload 3
      // 4f4: ifeq 53b
      // 4f7: goto 4fe
      // 4fa: invokestatic xi1.d (Loov;)Loov;
      // 4fd: athrow
      // 4fe: getstatic vt2.z9q Lvt2;
      // 501: invokevirtual vt2.c3s ()I
      // 504: if_icmpeq 52a
      // 507: goto 50e
      // 50a: invokestatic xi1.d (Loov;)Loov;
      // 50d: athrow
      // 50e: iload 2
      // 50f: iload 3
      // 510: ifeq 917
      // 513: goto 51a
      // 516: invokestatic xi1.d (Loov;)Loov;
      // 519: athrow
      // 51a: getstatic vt2.mxp Lvt2;
      // 51d: invokevirtual vt2.c3s ()I
      // 520: if_icmpne 916
      // 523: goto 52a
      // 526: invokestatic xi1.d (Loov;)Loov;
      // 529: athrow
      // 52a: iload 2
      // 52b: invokestatic vt2.jw6 (I)Lvt2;
      // 52e: invokevirtual vt2.b4b ()Lvt2;
      // 531: invokevirtual vt2.c3s ()I
      // 534: goto 53b
      // 537: invokestatic xi1.d (Loov;)Loov;
      // 53a: athrow
      // 53b: ireturn
      // 53c: aload 0
      // 53d: getfield xi1.p7m Lvt2;
      // 540: getstatic vt2.te4 Lvt2;
      // 543: iload 3
      // 544: ifeq 5df
      // 547: if_acmpne 5d8
      // 54a: goto 551
      // 54d: invokestatic xi1.d (Loov;)Loov;
      // 550: athrow
      // 551: iload 2
      // 552: getstatic vt2.z9q Lvt2;
      // 555: invokevirtual vt2.c3s ()I
      // 558: iload 3
      // 559: ifeq 57f
      // 55c: goto 563
      // 55f: invokestatic xi1.d (Loov;)Loov;
      // 562: athrow
      // 563: if_icmpne 578
      // 566: goto 56d
      // 569: invokestatic xi1.d (Loov;)Loov;
      // 56c: athrow
      // 56d: getstatic vt2.te4 Lvt2;
      // 570: invokevirtual vt2.c3s ()I
      // 573: ireturn
      // 574: invokestatic xi1.d (Loov;)Loov;
      // 577: athrow
      // 578: iload 2
      // 579: getstatic vt2.mxp Lvt2;
      // 57c: invokevirtual vt2.c3s ()I
      // 57f: iload 3
      // 580: ifeq 59f
      // 583: if_icmpne 598
      // 586: goto 58d
      // 589: invokestatic xi1.d (Loov;)Loov;
      // 58c: athrow
      // 58d: getstatic vt2.zk4 Lvt2;
      // 590: invokevirtual vt2.c3s ()I
      // 593: ireturn
      // 594: invokestatic xi1.d (Loov;)Loov;
      // 597: athrow
      // 598: iload 2
      // 599: getstatic vt2.te4 Lvt2;
      // 59c: invokevirtual vt2.c3s ()I
      // 59f: iload 3
      // 5a0: ifeq 5ca
      // 5a3: if_icmpne 5b8
      // 5a6: goto 5ad
      // 5a9: invokestatic xi1.d (Loov;)Loov;
      // 5ac: athrow
      // 5ad: getstatic vt2.z9q Lvt2;
      // 5b0: invokevirtual vt2.c3s ()I
      // 5b3: ireturn
      // 5b4: invokestatic xi1.d (Loov;)Loov;
      // 5b7: athrow
      // 5b8: iload 2
      // 5b9: iload 3
      // 5ba: ifeq 917
      // 5bd: getstatic vt2.zk4 Lvt2;
      // 5c0: invokevirtual vt2.c3s ()I
      // 5c3: goto 5ca
      // 5c6: invokestatic xi1.d (Loov;)Loov;
      // 5c9: athrow
      // 5ca: if_icmpne 916
      // 5cd: getstatic vt2.mxp Lvt2;
      // 5d0: invokevirtual vt2.c3s ()I
      // 5d3: ireturn
      // 5d4: invokestatic xi1.d (Loov;)Loov;
      // 5d7: athrow
      // 5d8: aload 0
      // 5d9: getfield xi1.p7m Lvt2;
      // 5dc: getstatic vt2.zk4 Lvt2;
      // 5df: if_acmpne 916
      // 5e2: iload 2
      // 5e3: getstatic vt2.z9q Lvt2;
      // 5e6: invokevirtual vt2.c3s ()I
      // 5e9: iload 3
      // 5ea: ifeq 610
      // 5ed: goto 5f4
      // 5f0: invokestatic xi1.d (Loov;)Loov;
      // 5f3: athrow
      // 5f4: if_icmpne 609
      // 5f7: goto 5fe
      // 5fa: invokestatic xi1.d (Loov;)Loov;
      // 5fd: athrow
      // 5fe: getstatic vt2.zk4 Lvt2;
      // 601: invokevirtual vt2.c3s ()I
      // 604: ireturn
      // 605: invokestatic xi1.d (Loov;)Loov;
      // 608: athrow
      // 609: iload 2
      // 60a: getstatic vt2.mxp Lvt2;
      // 60d: invokevirtual vt2.c3s ()I
      // 610: iload 3
      // 611: ifeq 630
      // 614: if_icmpne 629
      // 617: goto 61e
      // 61a: invokestatic xi1.d (Loov;)Loov;
      // 61d: athrow
      // 61e: getstatic vt2.te4 Lvt2;
      // 621: invokevirtual vt2.c3s ()I
      // 624: ireturn
      // 625: invokestatic xi1.d (Loov;)Loov;
      // 628: athrow
      // 629: iload 2
      // 62a: getstatic vt2.te4 Lvt2;
      // 62d: invokevirtual vt2.c3s ()I
      // 630: iload 3
      // 631: ifeq 65b
      // 634: if_icmpne 649
      // 637: goto 63e
      // 63a: invokestatic xi1.d (Loov;)Loov;
      // 63d: athrow
      // 63e: getstatic vt2.z9q Lvt2;
      // 641: invokevirtual vt2.c3s ()I
      // 644: ireturn
      // 645: invokestatic xi1.d (Loov;)Loov;
      // 648: athrow
      // 649: iload 2
      // 64a: iload 3
      // 64b: ifeq 917
      // 64e: getstatic vt2.zk4 Lvt2;
      // 651: invokevirtual vt2.c3s ()I
      // 654: goto 65b
      // 657: invokestatic xi1.d (Loov;)Loov;
      // 65a: athrow
      // 65b: if_icmpne 916
      // 65e: getstatic vt2.mxp Lvt2;
      // 661: invokevirtual vt2.c3s ()I
      // 664: ireturn
      // 665: invokestatic xi1.d (Loov;)Loov;
      // 668: athrow
      // 669: iload 2
      // 66a: invokestatic vt2.bm6 (I)Lvt2;
      // 66d: astore 4
      // 66f: aload 0
      // 670: getfield xi1.p7m Lvt2;
      // 673: getstatic vt2.mxp Lvt2;
      // 676: iload 3
      // 677: ifeq 6cf
      // 67a: if_acmpne 6c8
      // 67d: goto 684
      // 680: invokestatic xi1.d (Loov;)Loov;
      // 683: athrow
      // 684: aload 4
      // 686: iload 3
      // 687: ifeq 6c4
      // 68a: goto 691
      // 68d: invokestatic xi1.d (Loov;)Loov;
      // 690: athrow
      // 691: getstatic vt2.mxp Lvt2;
      // 694: if_acmpeq 6b8
      // 697: goto 69e
      // 69a: invokestatic xi1.d (Loov;)Loov;
      // 69d: athrow
      // 69e: aload 4
      // 6a0: iload 3
      // 6a1: ifeq 6c4
      // 6a4: goto 6ab
      // 6a7: invokestatic xi1.d (Loov;)Loov;
      // 6aa: athrow
      // 6ab: getstatic vt2.z9q Lvt2;
      // 6ae: if_acmpne 7e8
      // 6b1: goto 6b8
      // 6b4: invokestatic xi1.d (Loov;)Loov;
      // 6b7: athrow
      // 6b8: aload 4
      // 6ba: invokevirtual vt2.b4b ()Lvt2;
      // 6bd: goto 6c4
      // 6c0: invokestatic xi1.d (Loov;)Loov;
      // 6c3: athrow
      // 6c4: invokevirtual vt2.tmy ()I
      // 6c7: ireturn
      // 6c8: aload 0
      // 6c9: getfield xi1.p7m Lvt2;
      // 6cc: getstatic vt2.te4 Lvt2;
      // 6cf: iload 3
      // 6d0: ifeq 75f
      // 6d3: if_acmpne 758
      // 6d6: goto 6dd
      // 6d9: invokestatic xi1.d (Loov;)Loov;
      // 6dc: athrow
      // 6dd: aload 4
      // 6df: getstatic vt2.z9q Lvt2;
      // 6e2: iload 3
      // 6e3: ifeq 707
      // 6e6: goto 6ed
      // 6e9: invokestatic xi1.d (Loov;)Loov;
      // 6ec: athrow
      // 6ed: if_acmpne 702
      // 6f0: goto 6f7
      // 6f3: invokestatic xi1.d (Loov;)Loov;
      // 6f6: athrow
      // 6f7: getstatic vt2.te4 Lvt2;
      // 6fa: invokevirtual vt2.tmy ()I
      // 6fd: ireturn
      // 6fe: invokestatic xi1.d (Loov;)Loov;
      // 701: athrow
      // 702: aload 4
      // 704: getstatic vt2.mxp Lvt2;
      // 707: iload 3
      // 708: ifeq 725
      // 70b: if_acmpne 720
      // 70e: goto 715
      // 711: invokestatic xi1.d (Loov;)Loov;
      // 714: athrow
      // 715: getstatic vt2.zk4 Lvt2;
      // 718: invokevirtual vt2.tmy ()I
      // 71b: ireturn
      // 71c: invokestatic xi1.d (Loov;)Loov;
      // 71f: athrow
      // 720: aload 4
      // 722: getstatic vt2.te4 Lvt2;
      // 725: iload 3
      // 726: ifeq 74e
      // 729: if_acmpne 73e
      // 72c: goto 733
      // 72f: invokestatic xi1.d (Loov;)Loov;
      // 732: athrow
      // 733: getstatic vt2.z9q Lvt2;
      // 736: invokevirtual vt2.tmy ()I
      // 739: ireturn
      // 73a: invokestatic xi1.d (Loov;)Loov;
      // 73d: athrow
      // 73e: aload 4
      // 740: iload 3
      // 741: ifeq 754
      // 744: getstatic vt2.zk4 Lvt2;
      // 747: goto 74e
      // 74a: invokestatic xi1.d (Loov;)Loov;
      // 74d: athrow
      // 74e: if_acmpne 7e8
      // 751: getstatic vt2.mxp Lvt2;
      // 754: invokevirtual vt2.tmy ()I
      // 757: ireturn
      // 758: aload 0
      // 759: getfield xi1.p7m Lvt2;
      // 75c: getstatic vt2.zk4 Lvt2;
      // 75f: iload 3
      // 760: ifeq 779
      // 763: if_acmpne 7e8
      // 766: goto 76d
      // 769: invokestatic xi1.d (Loov;)Loov;
      // 76c: athrow
      // 76d: aload 4
      // 76f: getstatic vt2.z9q Lvt2;
      // 772: goto 779
      // 775: invokestatic xi1.d (Loov;)Loov;
      // 778: athrow
      // 779: iload 3
      // 77a: ifeq 797
      // 77d: if_acmpne 792
      // 780: goto 787
      // 783: invokestatic xi1.d (Loov;)Loov;
      // 786: athrow
      // 787: getstatic vt2.zk4 Lvt2;
      // 78a: invokevirtual vt2.tmy ()I
      // 78d: ireturn
      // 78e: invokestatic xi1.d (Loov;)Loov;
      // 791: athrow
      // 792: aload 4
      // 794: getstatic vt2.mxp Lvt2;
      // 797: iload 3
      // 798: ifeq 7b5
      // 79b: if_acmpne 7b0
      // 79e: goto 7a5
      // 7a1: invokestatic xi1.d (Loov;)Loov;
      // 7a4: athrow
      // 7a5: getstatic vt2.te4 Lvt2;
      // 7a8: invokevirtual vt2.tmy ()I
      // 7ab: ireturn
      // 7ac: invokestatic xi1.d (Loov;)Loov;
      // 7af: athrow
      // 7b0: aload 4
      // 7b2: getstatic vt2.te4 Lvt2;
      // 7b5: iload 3
      // 7b6: ifeq 7de
      // 7b9: if_acmpne 7ce
      // 7bc: goto 7c3
      // 7bf: invokestatic xi1.d (Loov;)Loov;
      // 7c2: athrow
      // 7c3: getstatic vt2.z9q Lvt2;
      // 7c6: invokevirtual vt2.tmy ()I
      // 7c9: ireturn
      // 7ca: invokestatic xi1.d (Loov;)Loov;
      // 7cd: athrow
      // 7ce: aload 4
      // 7d0: iload 3
      // 7d1: ifeq 7e4
      // 7d4: getstatic vt2.zk4 Lvt2;
      // 7d7: goto 7de
      // 7da: invokestatic xi1.d (Loov;)Loov;
      // 7dd: athrow
      // 7de: if_acmpne 7e8
      // 7e1: getstatic vt2.mxp Lvt2;
      // 7e4: invokevirtual vt2.tmy ()I
      // 7e7: ireturn
      // 7e8: iload 3
      // 7e9: ifne 916
      // 7ec: aload 0
      // 7ed: getfield xi1.p7m Lvt2;
      // 7f0: getstatic vt2.mxp Lvt2;
      // 7f3: iload 3
      // 7f4: ifeq 842
      // 7f7: goto 7fe
      // 7fa: invokestatic xi1.d (Loov;)Loov;
      // 7fd: athrow
      // 7fe: if_acmpne 83b
      // 801: goto 808
      // 804: invokestatic xi1.d (Loov;)Loov;
      // 807: athrow
      // 808: iload 2
      // 809: bipush 2
      // 80a: iload 3
      // 80b: ifeq 832
      // 80e: goto 815
      // 811: invokestatic xi1.d (Loov;)Loov;
      // 814: athrow
      // 815: if_icmpne 825
      // 818: goto 81f
      // 81b: invokestatic xi1.d (Loov;)Loov;
      // 81e: athrow
      // 81f: bipush 3
      // 820: ireturn
      // 821: invokestatic xi1.d (Loov;)Loov;
      // 824: athrow
      // 825: iload 2
      // 826: iload 3
      // 827: ifeq 917
      // 82a: bipush 3
      // 82b: goto 832
      // 82e: invokestatic xi1.d (Loov;)Loov;
      // 831: athrow
      // 832: if_icmpne 916
      // 835: bipush 2
      // 836: ireturn
      // 837: invokestatic xi1.d (Loov;)Loov;
      // 83a: athrow
      // 83b: aload 0
      // 83c: getfield xi1.p7m Lvt2;
      // 83f: getstatic vt2.te4 Lvt2;
      // 842: iload 3
      // 843: ifeq 8b5
      // 846: if_acmpne 8ae
      // 849: goto 850
      // 84c: invokestatic xi1.d (Loov;)Loov;
      // 84f: athrow
      // 850: iload 2
      // 851: iload 3
      // 852: ifeq 86d
      // 855: goto 85c
      // 858: invokestatic xi1.d (Loov;)Loov;
      // 85b: athrow
      // 85c: ifne 86c
      // 85f: goto 866
      // 862: invokestatic xi1.d (Loov;)Loov;
      // 865: athrow
      // 866: bipush 2
      // 867: ireturn
      // 868: invokestatic xi1.d (Loov;)Loov;
      // 86b: athrow
      // 86c: iload 2
      // 86d: bipush 1
      // 86e: iload 3
      // 86f: ifeq 884
      // 872: if_icmpne 882
      // 875: goto 87c
      // 878: invokestatic xi1.d (Loov;)Loov;
      // 87b: athrow
      // 87c: bipush 3
      // 87d: ireturn
      // 87e: invokestatic xi1.d (Loov;)Loov;
      // 881: athrow
      // 882: iload 2
      // 883: bipush 2
      // 884: iload 3
      // 885: ifeq 8a5
      // 888: if_icmpne 898
      // 88b: goto 892
      // 88e: invokestatic xi1.d (Loov;)Loov;
      // 891: athrow
      // 892: bipush 0
      // 893: ireturn
      // 894: invokestatic xi1.d (Loov;)Loov;
      // 897: athrow
      // 898: iload 2
      // 899: iload 3
      // 89a: ifeq 917
      // 89d: bipush 3
      // 89e: goto 8a5
      // 8a1: invokestatic xi1.d (Loov;)Loov;
      // 8a4: athrow
      // 8a5: if_icmpne 916
      // 8a8: bipush 1
      // 8a9: ireturn
      // 8aa: invokestatic xi1.d (Loov;)Loov;
      // 8ad: athrow
      // 8ae: aload 0
      // 8af: getfield xi1.p7m Lvt2;
      // 8b2: getstatic vt2.zk4 Lvt2;
      // 8b5: if_acmpne 916
      // 8b8: iload 2
      // 8b9: iload 3
      // 8ba: ifeq 8d5
      // 8bd: goto 8c4
      // 8c0: invokestatic xi1.d (Loov;)Loov;
      // 8c3: athrow
      // 8c4: ifne 8d4
      // 8c7: goto 8ce
      // 8ca: invokestatic xi1.d (Loov;)Loov;
      // 8cd: athrow
      // 8ce: bipush 2
      // 8cf: ireturn
      // 8d0: invokestatic xi1.d (Loov;)Loov;
      // 8d3: athrow
      // 8d4: iload 2
      // 8d5: bipush 1
      // 8d6: iload 3
      // 8d7: ifeq 8ec
      // 8da: if_icmpne 8ea
      // 8dd: goto 8e4
      // 8e0: invokestatic xi1.d (Loov;)Loov;
      // 8e3: athrow
      // 8e4: bipush 3
      // 8e5: ireturn
      // 8e6: invokestatic xi1.d (Loov;)Loov;
      // 8e9: athrow
      // 8ea: iload 2
      // 8eb: bipush 2
      // 8ec: iload 3
      // 8ed: ifeq 90d
      // 8f0: if_icmpne 900
      // 8f3: goto 8fa
      // 8f6: invokestatic xi1.d (Loov;)Loov;
      // 8f9: athrow
      // 8fa: bipush 1
      // 8fb: ireturn
      // 8fc: invokestatic xi1.d (Loov;)Loov;
      // 8ff: athrow
      // 900: iload 2
      // 901: iload 3
      // 902: ifeq 917
      // 905: bipush 3
      // 906: goto 90d
      // 909: invokestatic xi1.d (Loov;)Loov;
      // 90c: athrow
      // 90d: if_icmpne 916
      // 910: bipush 0
      // 911: ireturn
      // 912: invokestatic xi1.d (Loov;)Loov;
      // 915: athrow
      // 916: iload 2
      // 917: ireturn
   }

   public void lzy(OpaquePredicate param1, zfz param2, int param3, int param4, int param5, yve param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 7
      // 05: new mew
      // 08: dup
      // 09: aload 0
      // 0a: iload 3
      // 0b: iload 5
      // 0d: invokevirtual xi1.q__ (II)I
      // 10: aload 0
      // 11: iload 4
      // 13: invokevirtual xi1._tw (I)I
      // 16: aload 0
      // 17: iload 3
      // 18: iload 5
      // 1a: invokevirtual xi1._ye (II)I
      // 1d: invokespecial mew.<init> (III)V
      // 20: astore 8
      // 22: aload 6
      // 24: aload 8
      // 26: invokevirtual yve.vwy (Lwgo;)Z
      // 29: iload 7
      // 2b: ifeq 47
      // 2e: ifeq 48
      // 31: goto 38
      // 34: invokestatic xi1.d (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: aload 8
      // 3b: aload 2
      // 3c: bipush 2
      // 3d: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 40: goto 47
      // 43: invokestatic xi1.d (Loov;)Loov;
      // 46: athrow
      // 47: pop
      // 48: return
   }

   public zfz t90(OpaquePredicate var1, int var2, int var3, int var4, yve var5) {
      int var6 = this.q__(var2, var4);
      int var7 = this._tw(var3);
      int var8 = this._ye(var2, var4);
      mew var9 = new mew(var6, var7, var8);

      try {
         if (!var5.vwy(var9)) {
            return ox_.ibw.l4i();
         }
      } catch (oov var10) {
         throw d(var10);
      }

      return var1.getBlockState(var9);
   }

   public void t_a(OpaquePredicate var1, yve var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = OpaquePredicate.b();
      int var10 = var4;

      label49:
      while (true) {
         int var10000 = var10;

         label47:
         while (var10000 <= var7) {
            int var11 = var3;

            while (var11 <= var6) {
               var10000 = var5;
               if (var9 == 0) {
                  continue label47;
               }

               int var12 = var5;

               while (true) {
                  if (var12 <= var8) {
                     try {
                        this.lzy(var1, ox_.ibw.l4i(), var11, var10, var12, var2);
                        var12++;
                        if (var9 == 0) {
                           break;
                        }

                        if (var9 != 0) {
                           continue;
                        }
                     } catch (oov var13) {
                        throw d(var13);
                     }
                  }

                  var11++;
                  break;
               }

               if (var9 == 0) {
                  break;
               }
            }

            var10++;
            if (var9 == 0) {
               return;
            }
            continue label49;
         }

         return;
      }
   }

   public void gys(OpaquePredicate param1, yve param2, int param3, int param4, int param5, int param6, int param7, int param8, zfz param9, zfz param10, boolean param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 12
      // 005: iload 4
      // 007: istore 13
      // 009: iload 13
      // 00b: iload 7
      // 00d: if_icmpgt 137
      // 010: iload 3
      // 011: istore 14
      // 013: iload 14
      // 015: iload 6
      // 017: if_icmpgt 12f
      // 01a: iload 5
      // 01c: iload 12
      // 01e: ifne 00b
      // 021: istore 15
      // 023: iload 15
      // 025: iload 8
      // 027: if_icmpgt 127
      // 02a: iload 11
      // 02c: iload 12
      // 02e: ifne 015
      // 031: iload 12
      // 033: ifne 06a
      // 036: ifeq 061
      // 039: goto 040
      // 03c: invokestatic xi1.d (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: aload 1
      // 042: iload 14
      // 044: iload 13
      // 046: iload 15
      // 048: aload 2
      // 049: invokevirtual xi1.t90 (Lt9d;IIILyve;)Lzfz;
      // 04c: invokeinterface zfz.r_y ()Le0x; 1
      // 051: invokevirtual e0x.p1r ()Lp3y;
      // 054: getstatic p3y.cei Lp3y;
      // 057: if_acmpeq 11f
      // 05a: goto 061
      // 05d: invokestatic xi1.d (Loov;)Loov;
      // 060: athrow
      // 061: iload 13
      // 063: goto 06a
      // 066: invokestatic xi1.d (Loov;)Loov;
      // 069: athrow
      // 06a: iload 4
      // 06c: iload 12
      // 06e: ifne 086
      // 071: if_icmpeq 10a
      // 074: goto 07b
      // 077: invokestatic xi1.d (Loov;)Loov;
      // 07a: athrow
      // 07b: iload 13
      // 07d: iload 7
      // 07f: goto 086
      // 082: invokestatic xi1.d (Loov;)Loov;
      // 085: athrow
      // 086: iload 12
      // 088: ifne 09f
      // 08b: if_icmpeq 10a
      // 08e: goto 095
      // 091: invokestatic xi1.d (Loov;)Loov;
      // 094: athrow
      // 095: iload 14
      // 097: iload 3
      // 098: goto 09f
      // 09b: invokestatic xi1.d (Loov;)Loov;
      // 09e: athrow
      // 09f: iload 12
      // 0a1: ifne 0b9
      // 0a4: if_icmpeq 10a
      // 0a7: goto 0ae
      // 0aa: invokestatic xi1.d (Loov;)Loov;
      // 0ad: athrow
      // 0ae: iload 14
      // 0b0: iload 6
      // 0b2: goto 0b9
      // 0b5: invokestatic xi1.d (Loov;)Loov;
      // 0b8: athrow
      // 0b9: iload 12
      // 0bb: ifne 0d3
      // 0be: if_icmpeq 10a
      // 0c1: goto 0c8
      // 0c4: invokestatic xi1.d (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 15
      // 0ca: iload 5
      // 0cc: goto 0d3
      // 0cf: invokestatic xi1.d (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 12
      // 0d5: ifne 0ed
      // 0d8: if_icmpeq 10a
      // 0db: goto 0e2
      // 0de: invokestatic xi1.d (Loov;)Loov;
      // 0e1: athrow
      // 0e2: iload 15
      // 0e4: iload 8
      // 0e6: goto 0ed
      // 0e9: invokestatic xi1.d (Loov;)Loov;
      // 0ec: athrow
      // 0ed: if_icmpeq 10a
      // 0f0: aload 0
      // 0f1: aload 1
      // 0f2: aload 10
      // 0f4: iload 14
      // 0f6: iload 13
      // 0f8: iload 15
      // 0fa: aload 2
      // 0fb: invokevirtual xi1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0fe: iload 12
      // 100: ifeq 11f
      // 103: goto 10a
      // 106: invokestatic xi1.d (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: aload 1
      // 10c: aload 9
      // 10e: iload 14
      // 110: iload 13
      // 112: iload 15
      // 114: aload 2
      // 115: invokevirtual xi1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 118: goto 11f
      // 11b: invokestatic xi1.d (Loov;)Loov;
      // 11e: athrow
      // 11f: iinc 15 1
      // 122: iload 12
      // 124: ifeq 023
      // 127: iinc 14 1
      // 12a: iload 12
      // 12c: ifeq 013
      // 12f: iinc 13 1
      // 132: iload 12
      // 134: ifeq 009
      // 137: return
   }

   public void xre(
      OpaquePredicate param1, yve param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, Random param10, xi1$e0c param11
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 12
      // 005: iload 4
      // 007: istore 13
      // 009: iload 13
      // 00b: iload 7
      // 00d: if_icmpgt 132
      // 010: iload 3
      // 011: istore 14
      // 013: iload 14
      // 015: iload 6
      // 017: if_icmpgt 12a
      // 01a: iload 5
      // 01c: iload 12
      // 01e: ifeq 00b
      // 021: istore 15
      // 023: iload 15
      // 025: iload 8
      // 027: if_icmpgt 122
      // 02a: iload 9
      // 02c: iload 12
      // 02e: ifeq 015
      // 031: ifeq 055
      // 034: aload 0
      // 035: aload 1
      // 036: iload 14
      // 038: iload 13
      // 03a: iload 15
      // 03c: aload 2
      // 03d: invokevirtual xi1.t90 (Lt9d;IIILyve;)Lzfz;
      // 040: invokeinterface zfz.r_y ()Le0x; 1
      // 045: invokevirtual e0x.p1r ()Lp3y;
      // 048: getstatic p3y.cei Lp3y;
      // 04b: if_acmpeq 11a
      // 04e: goto 055
      // 051: invokestatic xi1.d (Loov;)Loov;
      // 054: athrow
      // 055: aload 11
      // 057: aload 10
      // 059: iload 14
      // 05b: iload 13
      // 05d: iload 15
      // 05f: iload 13
      // 061: iload 12
      // 063: ifeq 102
      // 066: goto 06d
      // 069: invokestatic xi1.d (Loov;)Loov;
      // 06c: athrow
      // 06d: iload 4
      // 06f: if_icmpeq 0fa
      // 072: goto 079
      // 075: invokestatic xi1.d (Loov;)Loov;
      // 078: athrow
      // 079: iload 13
      // 07b: iload 12
      // 07d: ifeq 102
      // 080: goto 087
      // 083: invokestatic xi1.d (Loov;)Loov;
      // 086: athrow
      // 087: iload 7
      // 089: if_icmpeq 0fa
      // 08c: goto 093
      // 08f: invokestatic xi1.d (Loov;)Loov;
      // 092: athrow
      // 093: iload 14
      // 095: iload 12
      // 097: ifeq 102
      // 09a: goto 0a1
      // 09d: invokestatic xi1.d (Loov;)Loov;
      // 0a0: athrow
      // 0a1: iload 3
      // 0a2: if_icmpeq 0fa
      // 0a5: goto 0ac
      // 0a8: invokestatic xi1.d (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 14
      // 0ae: iload 12
      // 0b0: ifeq 102
      // 0b3: goto 0ba
      // 0b6: invokestatic xi1.d (Loov;)Loov;
      // 0b9: athrow
      // 0ba: iload 6
      // 0bc: if_icmpeq 0fa
      // 0bf: goto 0c6
      // 0c2: invokestatic xi1.d (Loov;)Loov;
      // 0c5: athrow
      // 0c6: iload 15
      // 0c8: iload 12
      // 0ca: ifeq 102
      // 0cd: goto 0d4
      // 0d0: invokestatic xi1.d (Loov;)Loov;
      // 0d3: athrow
      // 0d4: iload 5
      // 0d6: if_icmpeq 0fa
      // 0d9: goto 0e0
      // 0dc: invokestatic xi1.d (Loov;)Loov;
      // 0df: athrow
      // 0e0: iload 15
      // 0e2: iload 12
      // 0e4: ifeq 102
      // 0e7: goto 0ee
      // 0ea: invokestatic xi1.d (Loov;)Loov;
      // 0ed: athrow
      // 0ee: iload 8
      // 0f0: if_icmpne 105
      // 0f3: goto 0fa
      // 0f6: invokestatic xi1.d (Loov;)Loov;
      // 0f9: athrow
      // 0fa: bipush 1
      // 0fb: goto 102
      // 0fe: invokestatic xi1.d (Loov;)Loov;
      // 101: athrow
      // 102: goto 106
      // 105: bipush 0
      // 106: invokevirtual xi1$e0c.phr (Ljava/util/Random;IIIZ)V
      // 109: aload 0
      // 10a: aload 1
      // 10b: aload 11
      // 10d: invokevirtual xi1$e0c.vqm ()Lzfz;
      // 110: iload 14
      // 112: iload 13
      // 114: iload 15
      // 116: aload 2
      // 117: invokevirtual xi1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 11a: iinc 15 1
      // 11d: iload 12
      // 11f: ifne 023
      // 122: iinc 14 1
      // 125: iload 12
      // 127: ifne 013
      // 12a: iinc 13 1
      // 12d: iload 12
      // 12f: ifne 009
      // 132: return
   }

   public void ne7(
      OpaquePredicate param1,
      yve param2,
      Random param3,
      float param4,
      int param5,
      int param6,
      int param7,
      int param8,
      int param9,
      int param10,
      zfz param11,
      zfz param12,
      boolean param13
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 14
      // 005: iload 6
      // 007: istore 15
      // 009: iload 15
      // 00b: iload 9
      // 00d: if_icmpgt 14f
      // 010: iload 5
      // 012: istore 16
      // 014: iload 16
      // 016: iload 8
      // 018: if_icmpgt 147
      // 01b: iload 7
      // 01d: iload 14
      // 01f: ifne 00b
      // 022: istore 17
      // 024: iload 17
      // 026: iload 10
      // 028: if_icmpgt 13f
      // 02b: aload 3
      // 02c: invokevirtual java/util/Random.nextFloat ()F
      // 02f: fload 4
      // 031: fcmpg
      // 032: iload 14
      // 034: ifne 016
      // 037: iload 14
      // 039: ifne 048
      // 03c: ifgt 137
      // 03f: goto 046
      // 042: invokestatic xi1.d (Loov;)Loov;
      // 045: athrow
      // 046: iload 13
      // 048: iload 14
      // 04a: ifne 081
      // 04d: ifeq 078
      // 050: goto 057
      // 053: invokestatic xi1.d (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: aload 1
      // 059: iload 16
      // 05b: iload 15
      // 05d: iload 17
      // 05f: aload 2
      // 060: invokevirtual xi1.t90 (Lt9d;IIILyve;)Lzfz;
      // 063: invokeinterface zfz.r_y ()Le0x; 1
      // 068: invokevirtual e0x.p1r ()Lp3y;
      // 06b: getstatic p3y.cei Lp3y;
      // 06e: if_acmpeq 137
      // 071: goto 078
      // 074: invokestatic xi1.d (Loov;)Loov;
      // 077: athrow
      // 078: iload 15
      // 07a: goto 081
      // 07d: invokestatic xi1.d (Loov;)Loov;
      // 080: athrow
      // 081: iload 6
      // 083: iload 14
      // 085: ifne 09d
      // 088: if_icmpeq 122
      // 08b: goto 092
      // 08e: invokestatic xi1.d (Loov;)Loov;
      // 091: athrow
      // 092: iload 15
      // 094: iload 9
      // 096: goto 09d
      // 099: invokestatic xi1.d (Loov;)Loov;
      // 09c: athrow
      // 09d: iload 14
      // 09f: ifne 0b7
      // 0a2: if_icmpeq 122
      // 0a5: goto 0ac
      // 0a8: invokestatic xi1.d (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 16
      // 0ae: iload 5
      // 0b0: goto 0b7
      // 0b3: invokestatic xi1.d (Loov;)Loov;
      // 0b6: athrow
      // 0b7: iload 14
      // 0b9: ifne 0d1
      // 0bc: if_icmpeq 122
      // 0bf: goto 0c6
      // 0c2: invokestatic xi1.d (Loov;)Loov;
      // 0c5: athrow
      // 0c6: iload 16
      // 0c8: iload 8
      // 0ca: goto 0d1
      // 0cd: invokestatic xi1.d (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 14
      // 0d3: ifne 0eb
      // 0d6: if_icmpeq 122
      // 0d9: goto 0e0
      // 0dc: invokestatic xi1.d (Loov;)Loov;
      // 0df: athrow
      // 0e0: iload 17
      // 0e2: iload 7
      // 0e4: goto 0eb
      // 0e7: invokestatic xi1.d (Loov;)Loov;
      // 0ea: athrow
      // 0eb: iload 14
      // 0ed: ifne 105
      // 0f0: if_icmpeq 122
      // 0f3: goto 0fa
      // 0f6: invokestatic xi1.d (Loov;)Loov;
      // 0f9: athrow
      // 0fa: iload 17
      // 0fc: iload 10
      // 0fe: goto 105
      // 101: invokestatic xi1.d (Loov;)Loov;
      // 104: athrow
      // 105: if_icmpeq 122
      // 108: aload 0
      // 109: aload 1
      // 10a: aload 12
      // 10c: iload 16
      // 10e: iload 15
      // 110: iload 17
      // 112: aload 2
      // 113: invokevirtual xi1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 116: iload 14
      // 118: ifeq 137
      // 11b: goto 122
      // 11e: invokestatic xi1.d (Loov;)Loov;
      // 121: athrow
      // 122: aload 0
      // 123: aload 1
      // 124: aload 11
      // 126: iload 16
      // 128: iload 15
      // 12a: iload 17
      // 12c: aload 2
      // 12d: invokevirtual xi1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 130: goto 137
      // 133: invokestatic xi1.d (Loov;)Loov;
      // 136: athrow
      // 137: iinc 17 1
      // 13a: iload 14
      // 13c: ifeq 024
      // 13f: iinc 16 1
      // 142: iload 14
      // 144: ifeq 014
      // 147: iinc 15 1
      // 14a: iload 14
      // 14c: ifeq 009
      // 14f: return
   }

   public void cyn(OpaquePredicate var1, yve var2, Random var3, float var4, int var5, int var6, int var7, zfz var8) {
      try {
         if (var3.nextFloat() < var4) {
            this.lzy(var1, var8, var5, var6, var7, var2);
         }
      } catch (oov var9) {
         throw d(var9);
      }
   }

   public void iep(OpaquePredicate param1, yve param2, int param3, int param4, int param5, int param6, int param7, int param8, zfz param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 6
      // 002: iload 3
      // 003: isub
      // 004: bipush 1
      // 005: iadd
      // 006: i2f
      // 007: fstore 12
      // 009: iload 7
      // 00b: iload 4
      // 00d: isub
      // 00e: bipush 1
      // 00f: iadd
      // 010: i2f
      // 011: fstore 13
      // 013: invokestatic OpaquePredicate.b ()I
      // 016: iload 8
      // 018: iload 5
      // 01a: isub
      // 01b: bipush 1
      // 01c: iadd
      // 01d: i2f
      // 01e: fstore 14
      // 020: iload 3
      // 021: i2f
      // 022: fload 12
      // 024: fconst_2
      // 025: fdiv
      // 026: fadd
      // 027: fstore 15
      // 029: istore 11
      // 02b: iload 5
      // 02d: i2f
      // 02e: fload 14
      // 030: fconst_2
      // 031: fdiv
      // 032: fadd
      // 033: fstore 16
      // 035: iload 4
      // 037: istore 17
      // 039: iload 17
      // 03b: iload 7
      // 03d: if_icmpgt 103
      // 040: iload 17
      // 042: iload 4
      // 044: isub
      // 045: i2f
      // 046: fload 13
      // 048: fdiv
      // 049: fstore 18
      // 04b: iload 3
      // 04c: istore 19
      // 04e: iload 19
      // 050: iload 6
      // 052: if_icmpgt 0fb
      // 055: iload 19
      // 057: i2f
      // 058: fload 15
      // 05a: fsub
      // 05b: fload 12
      // 05d: ldc 0.5
      // 05f: nop
      // 060: fmul
      // 061: fdiv
      // 062: fstore 20
      // 064: iload 5
      // 066: iload 11
      // 068: ifeq 03b
      // 06b: istore 21
      // 06d: iload 21
      // 06f: iload 8
      // 071: if_icmpgt 0f3
      // 074: iload 21
      // 076: i2f
      // 077: fload 16
      // 079: fsub
      // 07a: fload 14
      // 07c: ldc 0.5
      // 07e: nop
      // 07f: fmul
      // 080: fdiv
      // 081: fstore 22
      // 083: iload 10
      // 085: iload 11
      // 087: ifeq 050
      // 08a: ifeq 0ae
      // 08d: aload 0
      // 08e: aload 1
      // 08f: iload 19
      // 091: iload 17
      // 093: iload 21
      // 095: aload 2
      // 096: invokevirtual xi1.t90 (Lt9d;IIILyve;)Lzfz;
      // 099: invokeinterface zfz.r_y ()Le0x; 1
      // 09e: invokevirtual e0x.p1r ()Lp3y;
      // 0a1: getstatic p3y.cei Lp3y;
      // 0a4: if_acmpeq 0eb
      // 0a7: goto 0ae
      // 0aa: invokestatic xi1.d (Loov;)Loov;
      // 0ad: athrow
      // 0ae: fload 20
      // 0b0: fload 20
      // 0b2: fmul
      // 0b3: fload 18
      // 0b5: fload 18
      // 0b7: fmul
      // 0b8: fadd
      // 0b9: fload 22
      // 0bb: fload 22
      // 0bd: fmul
      // 0be: fadd
      // 0bf: fstore 23
      // 0c1: iload 11
      // 0c3: ifeq 0ee
      // 0c6: fload 23
      // 0c8: ldc 1.05
      // 0ca: nop
      // 0cb: fcmpg
      // 0cc: ifgt 0eb
      // 0cf: goto 0d6
      // 0d2: invokestatic xi1.d (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: aload 1
      // 0d8: aload 9
      // 0da: iload 19
      // 0dc: iload 17
      // 0de: iload 21
      // 0e0: aload 2
      // 0e1: invokevirtual xi1.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0e4: goto 0eb
      // 0e7: invokestatic xi1.d (Loov;)Loov;
      // 0ea: athrow
      // 0eb: iinc 21 1
      // 0ee: iload 11
      // 0f0: ifne 06d
      // 0f3: iinc 19 1
      // 0f6: iload 11
      // 0f8: ifne 04e
      // 0fb: iinc 17 1
      // 0fe: iload 11
      // 100: ifne 039
      // 103: return
   }

   public void epu(OpaquePredicate param1, int param2, int param3, int param4, yve param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 6
      // 05: new mew
      // 08: dup
      // 09: aload 0
      // 0a: iload 2
      // 0b: iload 4
      // 0d: invokevirtual xi1.q__ (II)I
      // 10: aload 0
      // 11: iload 3
      // 12: invokevirtual xi1._tw (I)I
      // 15: aload 0
      // 16: iload 2
      // 17: iload 4
      // 19: invokevirtual xi1._ye (II)I
      // 1c: invokespecial mew.<init> (III)V
      // 1f: astore 7
      // 21: aload 5
      // 23: aload 7
      // 25: invokevirtual yve.vwy (Lwgo;)Z
      // 28: iload 6
      // 2a: ifeq 44
      // 2d: ifeq 86
      // 30: goto 37
      // 33: invokestatic xi1.d (Loov;)Loov;
      // 36: athrow
      // 37: aload 1
      // 38: aload 7
      // 3a: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 3d: goto 44
      // 40: invokestatic xi1.d (Loov;)Loov;
      // 43: athrow
      // 44: ifne 86
      // 47: aload 7
      // 49: invokevirtual mew.getY ()I
      // 4c: iload 6
      // 4e: ifeq 79
      // 51: goto 58
      // 54: invokestatic xi1.d (Loov;)Loov;
      // 57: athrow
      // 58: sipush 255
      // 5b: if_icmpge 86
      // 5e: goto 65
      // 61: invokestatic xi1.d (Loov;)Loov;
      // 64: athrow
      // 65: aload 1
      // 66: aload 7
      // 68: getstatic ox_.ibw Le0x;
      // 6b: invokevirtual e0x.l4i ()Lzfz;
      // 6e: bipush 2
      // 6f: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 72: goto 79
      // 75: invokestatic xi1.d (Loov;)Loov;
      // 78: athrow
      // 79: pop
      // 7a: aload 7
      // 7c: invokevirtual mew.nuv ()Lmew;
      // 7f: astore 7
      // 81: iload 6
      // 83: ifne 37
      // 86: return
   }

   public void doc(OpaquePredicate param1, zfz param2, int param3, int param4, int param5, yve param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 3
      // 02: iload 5
      // 04: invokevirtual xi1.q__ (II)I
      // 07: istore 8
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: aload 0
      // 0d: iload 4
      // 0f: invokevirtual xi1._tw (I)I
      // 12: istore 9
      // 14: istore 7
      // 16: aload 0
      // 17: iload 3
      // 18: iload 5
      // 1a: invokevirtual xi1._ye (II)I
      // 1d: istore 10
      // 1f: aload 6
      // 21: new mew
      // 24: dup
      // 25: iload 8
      // 27: iload 9
      // 29: iload 10
      // 2b: invokespecial mew.<init> (III)V
      // 2e: invokevirtual yve.vwy (Lwgo;)Z
      // 31: iload 7
      // 33: ifne 58
      // 36: ifeq ce
      // 39: goto 40
      // 3c: invokestatic xi1.d (Loov;)Loov;
      // 3f: athrow
      // 40: aload 1
      // 41: new mew
      // 44: dup
      // 45: iload 8
      // 47: iload 9
      // 49: iload 10
      // 4b: invokespecial mew.<init> (III)V
      // 4e: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 51: goto 58
      // 54: invokestatic xi1.d (Loov;)Loov;
      // 57: athrow
      // 58: ifne 99
      // 5b: aload 1
      // 5c: new mew
      // 5f: dup
      // 60: iload 8
      // 62: iload 9
      // 64: iload 10
      // 66: invokespecial mew.<init> (III)V
      // 69: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 6c: invokeinterface zfz.r_y ()Le0x; 1
      // 71: invokevirtual e0x.p1r ()Lp3y;
      // 74: invokevirtual p3y.l7j ()Z
      // 77: iload 7
      // 79: ifne 9b
      // 7c: goto 83
      // 7f: invokestatic xi1.d (Loov;)Loov;
      // 82: athrow
      // 83: iload 7
      // 85: ifne 9b
      // 88: goto 8f
      // 8b: invokestatic xi1.d (Loov;)Loov;
      // 8e: athrow
      // 8f: ifeq ce
      // 92: goto 99
      // 95: invokestatic xi1.d (Loov;)Loov;
      // 98: athrow
      // 99: iload 9
      // 9b: iload 7
      // 9d: ifne c5
      // a0: bipush 1
      // a1: if_icmple ce
      // a4: goto ab
      // a7: invokestatic xi1.d (Loov;)Loov;
      // aa: athrow
      // ab: aload 1
      // ac: new mew
      // af: dup
      // b0: iload 8
      // b2: iload 9
      // b4: iload 10
      // b6: invokespecial mew.<init> (III)V
      // b9: aload 2
      // ba: bipush 2
      // bb: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // be: goto c5
      // c1: invokestatic xi1.d (Loov;)Loov;
      // c4: athrow
      // c5: pop
      // c6: iinc 9 -1
      // c9: iload 7
      // cb: ifeq 40
      // ce: return
   }

   public boolean y6k(OpaquePredicate param1, yve param2, Random param3, int param4, int param5, int param6, List param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: new mew
      // 08: dup
      // 09: aload 0
      // 0a: iload 4
      // 0c: iload 6
      // 0e: invokevirtual xi1.q__ (II)I
      // 11: aload 0
      // 12: iload 5
      // 14: invokevirtual xi1._tw (I)I
      // 17: aload 0
      // 18: iload 4
      // 1a: iload 6
      // 1c: invokevirtual xi1._ye (II)I
      // 1f: invokespecial mew.<init> (III)V
      // 22: astore 10
      // 24: aload 2
      // 25: aload 10
      // 27: invokevirtual yve.vwy (Lwgo;)Z
      // 2a: iload 9
      // 2c: ifne b2
      // 2f: ifeq b1
      // 32: goto 39
      // 35: invokestatic xi1.d (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: aload 10
      // 3c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3f: iload 9
      // 41: ifne 6a
      // 44: goto 4b
      // 47: invokestatic xi1.d (Loov;)Loov;
      // 4a: athrow
      // 4b: invokeinterface zfz.r_y ()Le0x; 1
      // 50: getstatic ox_.cug Lhrd;
      // 53: if_acmpeq b1
      // 56: goto 5d
      // 59: invokestatic xi1.d (Loov;)Loov;
      // 5c: athrow
      // 5d: getstatic ox_.cug Lhrd;
      // 60: invokevirtual hrd.l4i ()Lzfz;
      // 63: goto 6a
      // 66: invokestatic xi1.d (Loov;)Loov;
      // 69: athrow
      // 6a: astore 11
      // 6c: aload 1
      // 6d: aload 10
      // 6f: getstatic ox_.cug Lhrd;
      // 72: aload 1
      // 73: aload 10
      // 75: aload 11
      // 77: invokevirtual hrd.a1g (Lt9d;Lmew;Lzfz;)Lzfz;
      // 7a: bipush 2
      // 7b: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 7e: pop
      // 7f: aload 1
      // 80: aload 10
      // 82: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 85: astore 12
      // 87: aload 12
      // 89: instanceof net/minecraft/tileentity/TileEntityChest
      // 8c: iload 9
      // 8e: ifne b0
      // 91: ifeq af
      // 94: goto 9b
      // 97: invokestatic xi1.d (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 3
      // 9c: aload 7
      // 9e: aload 12
      // a0: checkcast net/minecraft/tileentity/TileEntityChest
      // a3: iload 8
      // a5: invokestatic ypi.hut (Ljava/util/Random;Ljava/util/List;Lrsi;I)V
      // a8: goto af
      // ab: invokestatic xi1.d (Loov;)Loov;
      // ae: athrow
      // af: bipush 1
      // b0: ireturn
      // b1: bipush 0
      // b2: ireturn
   }

   public boolean xzy(OpaquePredicate param1, yve param2, Random param3, int param4, int param5, int param6, int param7, List param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 10
      // 05: new mew
      // 08: dup
      // 09: aload 0
      // 0a: iload 4
      // 0c: iload 6
      // 0e: invokevirtual xi1.q__ (II)I
      // 11: aload 0
      // 12: iload 5
      // 14: invokevirtual xi1._tw (I)I
      // 17: aload 0
      // 18: iload 4
      // 1a: iload 6
      // 1c: invokevirtual xi1._ye (II)I
      // 1f: invokespecial mew.<init> (III)V
      // 22: astore 11
      // 24: aload 2
      // 25: aload 11
      // 27: invokevirtual yve.vwy (Lwgo;)Z
      // 2a: iload 10
      // 2c: ifeq ae
      // 2f: ifeq ad
      // 32: goto 39
      // 35: invokestatic xi1.d (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: aload 11
      // 3c: iload 10
      // 3e: ifeq 7e
      // 41: goto 48
      // 44: invokestatic xi1.d (Loov;)Loov;
      // 47: athrow
      // 48: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 4b: invokeinterface zfz.r_y ()Le0x; 1
      // 50: getstatic ox_.e1f Le0x;
      // 53: if_acmpeq ad
      // 56: goto 5d
      // 59: invokestatic xi1.d (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 1
      // 5e: aload 11
      // 60: getstatic ox_.e1f Le0x;
      // 63: aload 0
      // 64: getstatic ox_.e1f Le0x;
      // 67: iload 7
      // 69: invokevirtual xi1.ujv (Le0x;I)I
      // 6c: invokevirtual e0x.kig (I)Lzfz;
      // 6f: bipush 2
      // 70: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 73: pop
      // 74: aload 1
      // 75: aload 11
      // 77: goto 7e
      // 7a: invokestatic xi1.d (Loov;)Loov;
      // 7d: athrow
      // 7e: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 81: astore 12
      // 83: aload 12
      // 85: instanceof net/minecraft/tileentity/TileEntityDispenser
      // 88: iload 10
      // 8a: ifeq ac
      // 8d: ifeq ab
      // 90: goto 97
      // 93: invokestatic xi1.d (Loov;)Loov;
      // 96: athrow
      // 97: aload 3
      // 98: aload 8
      // 9a: aload 12
      // 9c: checkcast net/minecraft/tileentity/TileEntityDispenser
      // 9f: iload 9
      // a1: invokestatic ypi.ow2 (Ljava/util/Random;Ljava/util/List;Lnet/minecraft/tileentity/TileEntityDispenser;I)V
      // a4: goto ab
      // a7: invokestatic xi1.d (Loov;)Loov;
      // aa: athrow
      // ab: bipush 1
      // ac: ireturn
      // ad: bipush 0
      // ae: ireturn
   }

   public void us5(OpaquePredicate var1, yve var2, Random var3, int var4, int var5, int var6, vt2 var7) {
      mew var8 = new mew(this.q__(var4, var6), this._tw(var5), this._ye(var4, var6));

      try {
         if (var2.vwy(var8)) {
            a_k.o08(var1, var8, var7.tgw(), ox_.o0v);
         }
      } catch (oov var9) {
         throw d(var9);
      }
   }

   public void zqi(int var1, int var2, int var3) {
      this.yqm.gbw(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5484993618483098475L, -5525507946674820871L, MethodHandles.lookup().lookupClass()).a(201728814443004L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 113965242682590L;
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
      String var6 = "»su>½¯u\u0006ÿ¶È(ø×ýÙ\u0010¯D\u0098\u001a\u0002ó01\u0083uÏ:\u0090\u0010ô\u001d\u0010GN\u0011Ó©\u0007ûMVa®î; 2a";
      int var8 = "»su>½¯u\u0006ÿ¶È(ø×ýÙ\u0010¯D\u0098\u001a\u0002ó01\u0083uÏ:\u0090\u0010ô\u001d\u0010GN\u0011Ó©\u0007ûMVa®î; 2a".length();
      char var5 = 16;
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
                     e = var9;
                     f = new String[5];
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

                  var6 = "·\u0095A\u007fR\u0004ô\u0016Ñíl6\u0082\u009b\u001en\u0010M\u009bî\u0081-\u000eD\u0007\u0091õh´\bú«z";
                  var8 = "·\u0095A\u007fR\u0004ô\u0016Ñíl6\u0082\u009b\u001en\u0010M\u009bî\u0081-\u000eD\u0007\u0091õh´\bú«z".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov d(oov var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16140;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("xi1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("xi1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
