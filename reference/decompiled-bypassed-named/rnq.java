import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rnq {
   private final int tjk;
   private final Set sh7 = Sets.newHashSetWithExpectedSize(256);
   private final List k6n = Lists.newArrayListWithCapacity(256);
   private int e5q;
   private int lb3;
   private final int s_n;
   private final int aqh;
   private final boolean l3c;
   private final int ao2;
   private static final long a;
   private static final String b;

   public rnq(int var1, int var2, boolean var3, int var4, int var5) {
      this.tjk = var5;
      this.s_n = var1;
      this.aqh = var2;
      this.l3c = var3;
      this.ao2 = var4;
   }

   public int zl9() {
      return this.e5q;
   }

   public int x3k() {
      return this.lb3;
   }

   public void hmj(sla param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: new rnq$ffv
      // 07: dup
      // 08: aload 1
      // 09: aload 0
      // 0a: getfield rnq.tjk I
      // 0d: invokespecial rnq$ffv.<init> (Lsla;I)V
      // 10: astore 3
      // 11: aload 0
      // 12: getfield rnq.ao2 I
      // 15: iload 2
      // 16: ifne 3c
      // 19: ifle 32
      // 1c: goto 23
      // 1f: invokestatic rnq.a (Lchb;)Lchb;
      // 22: athrow
      // 23: aload 3
      // 24: aload 0
      // 25: getfield rnq.ao2 I
      // 28: invokevirtual rnq$ffv.l66 (I)V
      // 2b: goto 32
      // 2e: invokestatic rnq.a (Lchb;)Lchb;
      // 31: athrow
      // 32: aload 0
      // 33: getfield rnq.sh7 Ljava/util/Set;
      // 36: aload 3
      // 37: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 3c: pop
      // 3d: return
   }

   public void v7r() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rnq.a J
      // 003: ldc2_w 119980603808110
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield rnq.sh7 Ljava/util/Set;
      // 00c: aload 0
      // 00d: getfield rnq.sh7 Ljava/util/Set;
      // 010: invokeinterface java/util/Set.size ()I 1
      // 015: anewarray 13
      // 018: invokeinterface java/util/Set.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 01d: checkcast [Lrnq$ffv;
      // 020: checkcast [Lrnq$ffv;
      // 023: checkcast [Lrnq$ffv;
      // 026: astore 4
      // 028: invokestatic OpaquePredicate.c ()I
      // 02b: aload 4
      // 02d: checkcast [Ljava/lang/Object;
      // 030: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;)V
      // 033: aload 4
      // 035: astore 5
      // 037: istore 3
      // 038: aload 5
      // 03a: arraylength
      // 03b: istore 6
      // 03d: bipush 0
      // 03e: istore 7
      // 040: iload 7
      // 042: iload 6
      // 044: if_icmpge 0de
      // 047: aload 5
      // 049: iload 7
      // 04b: aaload
      // 04c: astore 8
      // 04e: iload 3
      // 04f: ifne 0da
      // 052: aload 0
      // 053: aload 8
      // 055: invokespecial rnq.y5q (Lrnq$ffv;)Z
      // 058: iload 3
      // 059: ifne 0ed
      // 05c: goto 063
      // 05f: invokestatic rnq.a (Lchb;)Lchb;
      // 062: athrow
      // 063: ifne 0d7
      // 066: goto 06d
      // 069: invokestatic rnq.a (Lchb;)Lchb;
      // 06c: athrow
      // 06d: getstatic rnq.b Ljava/lang/String;
      // 070: nop
      // 071: bipush 7
      // 073: anewarray 8
      // 076: dup
      // 077: bipush 0
      // 078: aload 8
      // 07a: invokevirtual rnq$ffv.wyi ()Lsla;
      // 07d: invokevirtual sla.nfl ()Ljava/lang/String;
      // 080: aastore
      // 081: dup
      // 082: bipush 1
      // 083: aload 8
      // 085: invokevirtual rnq$ffv.wyi ()Lsla;
      // 088: invokevirtual sla.jkj ()I
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: aastore
      // 08f: dup
      // 090: bipush 2
      // 091: aload 8
      // 093: invokevirtual rnq$ffv.wyi ()Lsla;
      // 096: invokevirtual sla.yva ()I
      // 099: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09c: aastore
      // 09d: dup
      // 09e: bipush 3
      // 09f: aload 0
      // 0a0: getfield rnq.e5q I
      // 0a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a6: aastore
      // 0a7: dup
      // 0a8: bipush 4
      // 0a9: aload 0
      // 0aa: getfield rnq.lb3 I
      // 0ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b0: aastore
      // 0b1: dup
      // 0b2: bipush 5
      // 0b3: aload 0
      // 0b4: getfield rnq.s_n I
      // 0b7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ba: aastore
      // 0bb: dup
      // 0bc: bipush 6
      // 0be: aload 0
      // 0bf: getfield rnq.aqh I
      // 0c2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c5: aastore
      // 0c6: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0c9: astore 9
      // 0cb: new chb
      // 0ce: dup
      // 0cf: aload 8
      // 0d1: aload 9
      // 0d3: invokespecial chb.<init> (Lrnq$ffv;Ljava/lang/String;)V
      // 0d6: athrow
      // 0d7: iinc 7 1
      // 0da: iload 3
      // 0db: ifeq 040
      // 0de: aload 0
      // 0df: iload 3
      // 0e0: ifne 103
      // 0e3: getfield rnq.l3c Z
      // 0e6: goto 0ed
      // 0e9: invokestatic rnq.a (Lchb;)Lchb;
      // 0ec: athrow
      // 0ed: ifeq 10d
      // 0f0: aload 0
      // 0f1: aload 0
      // 0f2: getfield rnq.e5q I
      // 0f5: invokestatic fe6.l0o (I)I
      // 0f8: putfield rnq.e5q I
      // 0fb: aload 0
      // 0fc: goto 103
      // 0ff: invokestatic rnq.a (Lchb;)Lchb;
      // 102: athrow
      // 103: aload 0
      // 104: getfield rnq.lb3 I
      // 107: invokestatic fe6.l0o (I)I
      // 10a: putfield rnq.lb3 I
      // 10d: return
   }

   public List jp3() {
      ArrayList var2 = Lists.newArrayList();
      int var10000 = OpaquePredicate.c();
      Iterator var3 = this.k6n.iterator();
      int var1 = var10000;

      while (var3.hasNext()) {
         rnq$p7s var4 = (rnq$p7s)var3.next();
         var4.x_v(var2);
         if (var1 != 0) {
            break;
         }
      }

      ArrayList var9 = Lists.newArrayList();
      Iterator var10 = var2.iterator();

      while (true) {
         if (var10.hasNext()) {
            rnq$p7s var5 = (rnq$p7s)var10.next();
            rnq$ffv var6 = var5.rm0();
            sla var7 = var6.wyi();

            try {
               var7.f2h(this.e5q, this.lb3, var5.ybe(), var5.cqo(), var6.kd5());
               var11 = var9;
               if (var1 != 0) {
                  break;
               }

               var9.add(var7);
               if (var1 == 0) {
                  continue;
               }
            } catch (chb var8) {
               throw a(var8);
            }
         }

         var11 = var9;
         break;
      }

      return var11;
   }

   private static int jfx(int var0, int var1) {
      int var2 = OpaquePredicate.b();

      int var10000;
      try {
         var10000 = var0 >> var1;
         int var10001 = var0 & (1 << var1) - 1;
         if (var2 == 0) {
            return var10000 + var10001 << var1;
         }

         if (var10001 == 0) {
            return var10000 + 0 << var1;
         }
      } catch (chb var3) {
         throw a(var3);
      }

      return var10000 + 1 << var1;
   }

   private boolean y5q(rnq$ffv param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 0
      // 08: getfield rnq.k6n Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 77
      // 13: aload 0
      // 14: getfield rnq.k6n Ljava/util/List;
      // 17: iload 3
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast rnq$p7s
      // 20: aload 1
      // 21: invokevirtual rnq$p7s._1f (Lrnq$ffv;)Z
      // 24: iload 2
      // 25: ifne 7c
      // 28: iload 2
      // 29: ifne 63
      // 2c: goto 33
      // 2f: invokestatic rnq.a (Lchb;)Lchb;
      // 32: athrow
      // 33: ifeq 43
      // 36: goto 3d
      // 39: invokestatic rnq.a (Lchb;)Lchb;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: ireturn
      // 3f: invokestatic rnq.a (Lchb;)Lchb;
      // 42: athrow
      // 43: aload 1
      // 44: invokevirtual rnq$ffv.gfm ()V
      // 47: iload 2
      // 48: ifne 73
      // 4b: aload 0
      // 4c: getfield rnq.k6n Ljava/util/List;
      // 4f: iload 3
      // 50: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 55: checkcast rnq$p7s
      // 58: aload 1
      // 59: invokevirtual rnq$p7s._1f (Lrnq$ffv;)Z
      // 5c: goto 63
      // 5f: invokestatic rnq.a (Lchb;)Lchb;
      // 62: athrow
      // 63: ifeq 6c
      // 66: bipush 1
      // 67: ireturn
      // 68: invokestatic rnq.a (Lchb;)Lchb;
      // 6b: athrow
      // 6c: aload 1
      // 6d: invokevirtual rnq$ffv.gfm ()V
      // 70: iinc 3 1
      // 73: iload 2
      // 74: ifeq 06
      // 77: aload 0
      // 78: aload 1
      // 79: invokespecial rnq.lda (Lrnq$ffv;)Z
      // 7c: ireturn
   }

   private boolean lda(rnq$ffv param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual rnq$ffv.fsh ()I
      // 008: aload 1
      // 009: invokevirtual rnq$ffv.smw ()I
      // 00c: invokestatic java/lang/Math.min (II)I
      // 00f: istore 3
      // 010: aload 0
      // 011: getfield rnq.e5q I
      // 014: iload 2
      // 015: ifne 02d
      // 018: ifne 03f
      // 01b: goto 022
      // 01e: invokestatic rnq.a (Lchb;)Lchb;
      // 021: athrow
      // 022: aload 0
      // 023: getfield rnq.lb3 I
      // 026: goto 02d
      // 029: invokestatic rnq.a (Lchb;)Lchb;
      // 02c: athrow
      // 02d: iload 2
      // 02e: ifne 03c
      // 031: ifne 03f
      // 034: goto 03b
      // 037: invokestatic rnq.a (Lchb;)Lchb;
      // 03a: athrow
      // 03b: bipush 1
      // 03c: goto 040
      // 03f: bipush 0
      // 040: istore 4
      // 042: aload 0
      // 043: getfield rnq.l3c Z
      // 046: iload 2
      // 047: ifne 1aa
      // 04a: ifeq 19d
      // 04d: goto 054
      // 050: invokestatic rnq.a (Lchb;)Lchb;
      // 053: athrow
      // 054: aload 0
      // 055: getfield rnq.e5q I
      // 058: invokestatic fe6.l0o (I)I
      // 05b: istore 6
      // 05d: aload 0
      // 05e: getfield rnq.lb3 I
      // 061: invokestatic fe6.l0o (I)I
      // 064: istore 7
      // 066: aload 0
      // 067: getfield rnq.e5q I
      // 06a: iload 3
      // 06b: iadd
      // 06c: invokestatic fe6.l0o (I)I
      // 06f: istore 8
      // 071: aload 0
      // 072: getfield rnq.lb3 I
      // 075: iload 3
      // 076: iadd
      // 077: invokestatic fe6.l0o (I)I
      // 07a: istore 9
      // 07c: iload 8
      // 07e: iload 2
      // 07f: ifne 098
      // 082: aload 0
      // 083: getfield rnq.s_n I
      // 086: if_icmpgt 09b
      // 089: goto 090
      // 08c: invokestatic rnq.a (Lchb;)Lchb;
      // 08f: athrow
      // 090: bipush 1
      // 091: goto 098
      // 094: invokestatic rnq.a (Lchb;)Lchb;
      // 097: athrow
      // 098: goto 09c
      // 09b: bipush 0
      // 09c: istore 10
      // 09e: iload 9
      // 0a0: iload 2
      // 0a1: ifne 0ba
      // 0a4: aload 0
      // 0a5: getfield rnq.aqh I
      // 0a8: if_icmpgt 0bd
      // 0ab: goto 0b2
      // 0ae: invokestatic rnq.a (Lchb;)Lchb;
      // 0b1: athrow
      // 0b2: bipush 1
      // 0b3: goto 0ba
      // 0b6: invokestatic rnq.a (Lchb;)Lchb;
      // 0b9: athrow
      // 0ba: goto 0be
      // 0bd: bipush 0
      // 0be: istore 11
      // 0c0: iload 10
      // 0c2: iload 2
      // 0c3: ifne 0ef
      // 0c6: ifne 0ed
      // 0c9: goto 0d0
      // 0cc: invokestatic rnq.a (Lchb;)Lchb;
      // 0cf: athrow
      // 0d0: iload 11
      // 0d2: iload 2
      // 0d3: ifne 0ef
      // 0d6: goto 0dd
      // 0d9: invokestatic rnq.a (Lchb;)Lchb;
      // 0dc: athrow
      // 0dd: ifne 0ed
      // 0e0: goto 0e7
      // 0e3: invokestatic rnq.a (Lchb;)Lchb;
      // 0e6: athrow
      // 0e7: bipush 0
      // 0e8: ireturn
      // 0e9: invokestatic rnq.a (Lchb;)Lchb;
      // 0ec: athrow
      // 0ed: iload 6
      // 0ef: iload 2
      // 0f0: ifne 107
      // 0f3: iload 8
      // 0f5: if_icmpeq 10a
      // 0f8: goto 0ff
      // 0fb: invokestatic rnq.a (Lchb;)Lchb;
      // 0fe: athrow
      // 0ff: bipush 1
      // 100: goto 107
      // 103: invokestatic rnq.a (Lchb;)Lchb;
      // 106: athrow
      // 107: goto 10b
      // 10a: bipush 0
      // 10b: istore 12
      // 10d: iload 7
      // 10f: iload 2
      // 110: ifne 127
      // 113: iload 9
      // 115: if_icmpeq 12a
      // 118: goto 11f
      // 11b: invokestatic rnq.a (Lchb;)Lchb;
      // 11e: athrow
      // 11f: bipush 1
      // 120: goto 127
      // 123: invokestatic rnq.a (Lchb;)Lchb;
      // 126: athrow
      // 127: goto 12b
      // 12a: bipush 0
      // 12b: istore 13
      // 12d: iload 12
      // 12f: iload 13
      // 131: ixor
      // 132: iload 2
      // 133: ifne 16b
      // 136: ifeq 162
      // 139: goto 140
      // 13c: invokestatic rnq.a (Lchb;)Lchb;
      // 13f: athrow
      // 140: iload 12
      // 142: iload 2
      // 143: ifne 158
      // 146: goto 14d
      // 149: invokestatic rnq.a (Lchb;)Lchb;
      // 14c: athrow
      // 14d: ifne 15b
      // 150: goto 157
      // 153: invokestatic rnq.a (Lchb;)Lchb;
      // 156: athrow
      // 157: bipush 1
      // 158: goto 15c
      // 15b: bipush 0
      // 15c: istore 5
      // 15e: iload 2
      // 15f: ifeq 199
      // 162: iload 10
      // 164: goto 16b
      // 167: invokestatic rnq.a (Lchb;)Lchb;
      // 16a: athrow
      // 16b: iload 2
      // 16c: ifne 17b
      // 16f: ifeq 196
      // 172: goto 179
      // 175: invokestatic rnq.a (Lchb;)Lchb;
      // 178: athrow
      // 179: iload 6
      // 17b: iload 2
      // 17c: ifne 193
      // 17f: iload 7
      // 181: if_icmpgt 196
      // 184: goto 18b
      // 187: invokestatic rnq.a (Lchb;)Lchb;
      // 18a: athrow
      // 18b: bipush 1
      // 18c: goto 193
      // 18f: invokestatic rnq.a (Lchb;)Lchb;
      // 192: athrow
      // 193: goto 197
      // 196: bipush 0
      // 197: istore 5
      // 199: iload 2
      // 19a: ifeq 268
      // 19d: aload 0
      // 19e: getfield rnq.e5q I
      // 1a1: iload 3
      // 1a2: iadd
      // 1a3: goto 1aa
      // 1a6: invokestatic rnq.a (Lchb;)Lchb;
      // 1a9: athrow
      // 1aa: iload 2
      // 1ab: ifne 1c4
      // 1ae: aload 0
      // 1af: getfield rnq.s_n I
      // 1b2: if_icmpgt 1c7
      // 1b5: goto 1bc
      // 1b8: invokestatic rnq.a (Lchb;)Lchb;
      // 1bb: athrow
      // 1bc: bipush 1
      // 1bd: goto 1c4
      // 1c0: invokestatic rnq.a (Lchb;)Lchb;
      // 1c3: athrow
      // 1c4: goto 1c8
      // 1c7: bipush 0
      // 1c8: istore 6
      // 1ca: aload 0
      // 1cb: getfield rnq.lb3 I
      // 1ce: iload 3
      // 1cf: iadd
      // 1d0: iload 2
      // 1d1: ifne 1ea
      // 1d4: aload 0
      // 1d5: getfield rnq.aqh I
      // 1d8: if_icmpgt 1ed
      // 1db: goto 1e2
      // 1de: invokestatic rnq.a (Lchb;)Lchb;
      // 1e1: athrow
      // 1e2: bipush 1
      // 1e3: goto 1ea
      // 1e6: invokestatic rnq.a (Lchb;)Lchb;
      // 1e9: athrow
      // 1ea: goto 1ee
      // 1ed: bipush 0
      // 1ee: istore 7
      // 1f0: iload 6
      // 1f2: iload 2
      // 1f3: ifne 21f
      // 1f6: ifne 21d
      // 1f9: goto 200
      // 1fc: invokestatic rnq.a (Lchb;)Lchb;
      // 1ff: athrow
      // 200: iload 7
      // 202: iload 2
      // 203: ifne 21f
      // 206: goto 20d
      // 209: invokestatic rnq.a (Lchb;)Lchb;
      // 20c: athrow
      // 20d: ifne 21d
      // 210: goto 217
      // 213: invokestatic rnq.a (Lchb;)Lchb;
      // 216: athrow
      // 217: bipush 0
      // 218: ireturn
      // 219: invokestatic rnq.a (Lchb;)Lchb;
      // 21c: athrow
      // 21d: iload 6
      // 21f: iload 2
      // 220: ifne 22f
      // 223: ifeq 265
      // 226: goto 22d
      // 229: invokestatic rnq.a (Lchb;)Lchb;
      // 22c: athrow
      // 22d: iload 4
      // 22f: iload 2
      // 230: ifne 262
      // 233: ifne 25a
      // 236: goto 23d
      // 239: invokestatic rnq.a (Lchb;)Lchb;
      // 23c: athrow
      // 23d: aload 0
      // 23e: getfield rnq.e5q I
      // 241: iload 2
      // 242: ifne 262
      // 245: goto 24c
      // 248: invokestatic rnq.a (Lchb;)Lchb;
      // 24b: athrow
      // 24c: aload 0
      // 24d: getfield rnq.lb3 I
      // 250: if_icmpgt 265
      // 253: goto 25a
      // 256: invokestatic rnq.a (Lchb;)Lchb;
      // 259: athrow
      // 25a: bipush 1
      // 25b: goto 262
      // 25e: invokestatic rnq.a (Lchb;)Lchb;
      // 261: athrow
      // 262: goto 266
      // 265: bipush 0
      // 266: istore 5
      // 268: aload 1
      // 269: invokevirtual rnq$ffv.fsh ()I
      // 26c: aload 1
      // 26d: invokevirtual rnq$ffv.smw ()I
      // 270: invokestatic java/lang/Math.max (II)I
      // 273: istore 6
      // 275: iload 5
      // 277: iload 2
      // 278: ifne 290
      // 27b: ifne 293
      // 27e: goto 285
      // 281: invokestatic rnq.a (Lchb;)Lchb;
      // 284: athrow
      // 285: aload 0
      // 286: getfield rnq.lb3 I
      // 289: goto 290
      // 28c: invokestatic rnq.a (Lchb;)Lchb;
      // 28f: athrow
      // 290: goto 297
      // 293: aload 0
      // 294: getfield rnq.e5q I
      // 297: iload 6
      // 299: iadd
      // 29a: invokestatic fe6.l0o (I)I
      // 29d: iload 5
      // 29f: iload 2
      // 2a0: ifne 2b8
      // 2a3: ifne 2bb
      // 2a6: goto 2ad
      // 2a9: invokestatic rnq.a (Lchb;)Lchb;
      // 2ac: athrow
      // 2ad: aload 0
      // 2ae: getfield rnq.aqh I
      // 2b1: goto 2b8
      // 2b4: invokestatic rnq.a (Lchb;)Lchb;
      // 2b7: athrow
      // 2b8: goto 2bf
      // 2bb: aload 0
      // 2bc: getfield rnq.s_n I
      // 2bf: if_icmple 2c8
      // 2c2: bipush 0
      // 2c3: ireturn
      // 2c4: invokestatic rnq.a (Lchb;)Lchb;
      // 2c7: athrow
      // 2c8: iload 5
      // 2ca: iload 2
      // 2cb: ifne 2e3
      // 2ce: ifeq 340
      // 2d1: goto 2d8
      // 2d4: invokestatic rnq.a (Lchb;)Lchb;
      // 2d7: athrow
      // 2d8: aload 1
      // 2d9: invokevirtual rnq$ffv.fsh ()I
      // 2dc: goto 2e3
      // 2df: invokestatic rnq.a (Lchb;)Lchb;
      // 2e2: athrow
      // 2e3: iload 2
      // 2e4: ifne 30f
      // 2e7: aload 1
      // 2e8: invokevirtual rnq$ffv.smw ()I
      // 2eb: if_icmple 300
      // 2ee: goto 2f5
      // 2f1: invokestatic rnq.a (Lchb;)Lchb;
      // 2f4: athrow
      // 2f5: aload 1
      // 2f6: invokevirtual rnq$ffv.gfm ()V
      // 2f9: goto 300
      // 2fc: invokestatic rnq.a (Lchb;)Lchb;
      // 2ff: athrow
      // 300: aload 0
      // 301: iload 2
      // 302: ifne 313
      // 305: getfield rnq.lb3 I
      // 308: goto 30f
      // 30b: invokestatic rnq.a (Lchb;)Lchb;
      // 30e: athrow
      // 30f: ifne 31a
      // 312: aload 0
      // 313: aload 1
      // 314: invokevirtual rnq$ffv.smw ()I
      // 317: putfield rnq.lb3 I
      // 31a: new rnq$p7s
      // 31d: dup
      // 31e: aload 0
      // 31f: getfield rnq.e5q I
      // 322: bipush 0
      // 323: aload 1
      // 324: invokevirtual rnq$ffv.fsh ()I
      // 327: aload 0
      // 328: getfield rnq.lb3 I
      // 32b: invokespecial rnq$p7s.<init> (IIII)V
      // 32e: astore 7
      // 330: aload 0
      // 331: dup
      // 332: getfield rnq.e5q I
      // 335: aload 1
      // 336: invokevirtual rnq$ffv.fsh ()I
      // 339: iadd
      // 33a: putfield rnq.e5q I
      // 33d: goto 363
      // 340: new rnq$p7s
      // 343: dup
      // 344: bipush 0
      // 345: aload 0
      // 346: getfield rnq.lb3 I
      // 349: aload 0
      // 34a: getfield rnq.e5q I
      // 34d: aload 1
      // 34e: invokevirtual rnq$ffv.smw ()I
      // 351: invokespecial rnq$p7s.<init> (IIII)V
      // 354: astore 7
      // 356: aload 0
      // 357: dup
      // 358: getfield rnq.lb3 I
      // 35b: aload 1
      // 35c: invokevirtual rnq$ffv.smw ()I
      // 35f: iadd
      // 360: putfield rnq.lb3 I
      // 363: aload 7
      // 365: aload 1
      // 366: invokevirtual rnq$p7s._1f (Lrnq$ffv;)Z
      // 369: pop
      // 36a: aload 0
      // 36b: getfield rnq.k6n Ljava/util/List;
      // 36e: aload 7
      // 370: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 375: pop
      // 376: bipush 1
      // 377: ireturn
   }

   public static int py8(int var0, int var1) {
      return jfx(var0, var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7386316539217008327L, 6941570301862875073L, MethodHandles.lookup().lookupClass()).a(79149980023435L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 20123505705140L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "Ü[\u008a\u0001\u0096\u00adk%açrØ»»Ê¹P·q\u000bÚò`\u009b<4æ\u007f\rZ\u0016½\u0091\u008b\tb²\u008a\u0004\u001dD\f\u0016ùÒí\u0084)ìåë³·Â}Ì\u001fS\u008aoi\u0084\u0019¸8<ôJ¬íd\\\rÂ\u0094-¶&ñÎb\u0092}wNö¿\u009f\u008eé\u001d«9ZäY\u00adN©\u0099\u0085vE..DX\u009a\u0096-×ú"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static chb a(chb var0) {
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
}
