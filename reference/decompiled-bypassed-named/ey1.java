import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ey1 {
   private static final Logger o6d = LogManager.getLogger();
   private final dug ylg;
   private final List o75 = Lists.newArrayList();
   private final yo9 mg1 = new yo9();
   private final List r5p = Lists.newArrayList();
   private final List rdd = Lists.newArrayList();
   private int rnz;
   private long sm8;
   private final int[][] ou5 = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
   private final Map g5r = new HashMap();

   public ey1(dug var1) {
      this.ylg = var1;
      this.ke1(var1.ve6().wh3().pci());
   }

   public dug g37() {
      return this.ylg;
   }

   public void d6c() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield ey1.g5r Ljava/util/Map;
      // 004: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 009: astore 2
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: aload 2
      // 00e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 013: astore 3
      // 014: istore 1
      // 015: aload 3
      // 016: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 01b: ifeq 104
      // 01e: aload 3
      // 01f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 024: checkcast java/util/Map$Entry
      // 027: astore 4
      // 029: aload 4
      // 02b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 030: checkcast java/util/Set
      // 033: astore 5
      // 035: aload 5
      // 037: iload 1
      // 038: ifeq 058
      // 03b: invokeinterface java/util/Set.isEmpty ()Z 1
      // 040: ifne 100
      // 043: goto 04a
      // 046: invokestatic ey1.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 4
      // 04c: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 051: goto 058
      // 054: invokestatic ey1.a (Loov;)Loov;
      // 057: athrow
      // 058: checkcast z96
      // 05b: astore 6
      // 05d: iload 1
      // 05e: ifeq 081
      // 061: aload 6
      // 063: getfield z96.oay Lt9d;
      // 066: aload 0
      // 067: getfield ey1.ylg Ldug;
      // 06a: if_acmpeq 085
      // 06d: goto 074
      // 070: invokestatic ey1.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 3
      // 075: invokeinterface java/util/Iterator.remove ()V 1
      // 07a: goto 081
      // 07d: invokestatic ey1.a (Loov;)Loov;
      // 080: athrow
      // 081: iload 1
      // 082: ifne 100
      // 085: aload 0
      // 086: getfield ey1.rnz I
      // 089: bipush 3
      // 08a: idiv
      // 08b: bipush 1
      // 08c: iadd
      // 08d: istore 7
      // 08f: invokestatic hxt.jwp ()Z
      // 092: iload 1
      // 093: ifeq 0af
      // 096: ifne 0b1
      // 099: goto 0a0
      // 09c: invokestatic ey1.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield ey1.rnz I
      // 0a4: bipush 2
      // 0a5: imul
      // 0a6: bipush 1
      // 0a7: iadd
      // 0a8: goto 0af
      // 0ab: invokestatic ey1.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: istore 7
      // 0b1: aload 0
      // 0b2: aload 5
      // 0b4: aload 6
      // 0b6: iload 7
      // 0b8: invokespecial ey1.pys (Ljava/util/Set;Lz96;I)Ljava/util/PriorityQueue;
      // 0bb: invokevirtual java/util/PriorityQueue.iterator ()Ljava/util/Iterator;
      // 0be: astore 8
      // 0c0: aload 8
      // 0c2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c7: ifeq 100
      // 0ca: aload 8
      // 0cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d1: checkcast h2f
      // 0d4: astore 9
      // 0d6: aload 0
      // 0d7: aload 9
      // 0d9: getfield h2f.jnd I
      // 0dc: aload 9
      // 0de: getfield h2f.km5 I
      // 0e1: bipush 1
      // 0e2: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 0e5: astore 10
      // 0e7: aload 10
      // 0e9: aload 6
      // 0eb: invokevirtual ey1$d08.n82 (Lz96;)V
      // 0ee: aload 5
      // 0f0: aload 9
      // 0f2: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 0f7: pop
      // 0f8: iload 1
      // 0f9: ifeq 015
      // 0fc: iload 1
      // 0fd: ifne 0c0
      // 100: iload 1
      // 101: ifne 015
      // 104: aload 0
      // 105: getfield ey1.ylg Ldug;
      // 108: invokevirtual dug.p2b ()J
      // 10b: lstore 4
      // 10d: lload 4
      // 10f: aload 0
      // 110: getfield ey1.sm8 J
      // 113: lsub
      // 114: ldc2_w 8000
      // 117: lcmp
      // 118: iload 1
      // 119: ifeq 175
      // 11c: ifle 16d
      // 11f: goto 126
      // 122: invokestatic ey1.a (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: lload 4
      // 129: putfield ey1.sm8 J
      // 12c: bipush 0
      // 12d: istore 6
      // 12f: iload 6
      // 131: aload 0
      // 132: getfield ey1.rdd Ljava/util/List;
      // 135: invokeinterface java/util/List.size ()I 1
      // 13a: if_icmpge 169
      // 13d: aload 0
      // 13e: getfield ey1.rdd Ljava/util/List;
      // 141: iload 6
      // 143: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 148: checkcast ey1$d08
      // 14b: astore 7
      // 14d: aload 7
      // 14f: invokevirtual ey1$d08.q84 ()V
      // 152: aload 7
      // 154: invokevirtual ey1$d08.bii ()V
      // 157: iinc 6 1
      // 15a: iload 1
      // 15b: ifeq 1b5
      // 15e: iload 1
      // 15f: ifne 12f
      // 162: goto 169
      // 165: invokestatic ey1.a (Loov;)Loov;
      // 168: athrow
      // 169: iload 1
      // 16a: ifne 1ac
      // 16d: bipush 0
      // 16e: goto 175
      // 171: invokestatic ey1.a (Loov;)Loov;
      // 174: athrow
      // 175: istore 6
      // 177: iload 6
      // 179: aload 0
      // 17a: getfield ey1.r5p Ljava/util/List;
      // 17d: invokeinterface java/util/List.size ()I 1
      // 182: if_icmpge 1ac
      // 185: aload 0
      // 186: getfield ey1.r5p Ljava/util/List;
      // 189: iload 6
      // 18b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 190: checkcast ey1$d08
      // 193: astore 7
      // 195: aload 7
      // 197: invokevirtual ey1$d08.q84 ()V
      // 19a: iinc 6 1
      // 19d: iload 1
      // 19e: ifeq 1b5
      // 1a1: iload 1
      // 1a2: ifne 177
      // 1a5: goto 1ac
      // 1a8: invokestatic ey1.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: aload 0
      // 1ad: getfield ey1.r5p Ljava/util/List;
      // 1b0: invokeinterface java/util/List.clear ()V 1
      // 1b5: aload 0
      // 1b6: iload 1
      // 1b7: ifeq 1d4
      // 1ba: getfield ey1.o75 Ljava/util/List;
      // 1bd: invokeinterface java/util/List.isEmpty ()Z 1
      // 1c2: ifeq 1f5
      // 1c5: goto 1cc
      // 1c8: invokestatic ey1.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: goto 1d4
      // 1d0: invokestatic ey1.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: getfield ey1.ylg Ldug;
      // 1d7: getfield dug.vzz Lupn;
      // 1da: astore 6
      // 1dc: aload 6
      // 1de: invokevirtual upn.vm6 ()Z
      // 1e1: ifne 1f5
      // 1e4: aload 0
      // 1e5: getfield ey1.ylg Ldug;
      // 1e8: getfield dug.kil Lgvi;
      // 1eb: invokevirtual gvi.hps ()V
      // 1ee: goto 1f5
      // 1f1: invokestatic ey1.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: return
   }

   public boolean cwk(int var1, int var2) {
      long var3 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;

      try {
         if (this.mg1.hhm(var3) != null) {
            return true;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return false;
   }

   private ey1$d08 w7h(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: ldc2_w 2147483647
      // 05: ladd
      // 06: iload 2
      // 07: i2l
      // 08: ldc2_w 2147483647
      // 0b: ladd
      // 0c: bipush 32
      // 0e: lshl
      // 0f: lor
      // 10: lstore 5
      // 12: invokestatic OpaquePredicate.b ()I
      // 15: aload 0
      // 16: getfield ey1.mg1 Lyo9;
      // 19: lload 5
      // 1b: invokevirtual yo9.hhm (J)Ljava/lang/Object;
      // 1e: checkcast ey1$d08
      // 21: astore 7
      // 23: istore 4
      // 25: aload 7
      // 27: iload 4
      // 29: ifeq 72
      // 2c: ifnonnull 70
      // 2f: goto 36
      // 32: invokestatic ey1.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 3
      // 37: iload 4
      // 39: ifeq 6f
      // 3c: goto 43
      // 3f: invokestatic ey1.a (Loov;)Loov;
      // 42: athrow
      // 43: ifeq 70
      // 46: goto 4d
      // 49: invokestatic ey1.a (Loov;)Loov;
      // 4c: athrow
      // 4d: new ey1$d08
      // 50: dup
      // 51: aload 0
      // 52: iload 1
      // 53: iload 2
      // 54: invokespecial ey1$d08.<init> (Ley1;II)V
      // 57: astore 7
      // 59: aload 0
      // 5a: getfield ey1.mg1 Lyo9;
      // 5d: lload 5
      // 5f: aload 7
      // 61: invokevirtual yo9.pab (JLjava/lang/Object;)V
      // 64: aload 0
      // 65: getfield ey1.rdd Ljava/util/List;
      // 68: aload 7
      // 6a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6f: pop
      // 70: aload 7
      // 72: areturn
   }

   public void ana(mew var1) {
      int var3 = var1.getX() >> 4;
      int var10000 = OpaquePredicate.b();
      int var4 = var1.getZ() >> 4;
      int var2 = var10000;
      ey1$d08 var5 = this.w7h(var3, var4, false);

      label20: {
         try {
            var7 = var5;
            if (var2 == 0) {
               break label20;
            }

            if (var5 == null) {
               return;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var7 = var5;
      }

      var7.gma(var1.getX() & 15, var1.getY(), var1.getZ() & 15);
   }

   public void x0z(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield z96.o2v D
      // 004: d2i
      // 005: bipush 4
      // 006: ishr
      // 007: istore 3
      // 008: aload 1
      // 009: getfield z96.vbd D
      // 00c: d2i
      // 00d: bipush 4
      // 00e: ishr
      // 00f: istore 4
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 1
      // 015: aload 1
      // 016: getfield z96.o2v D
      // 019: putfield z96.yj0 D
      // 01c: aload 1
      // 01d: aload 1
      // 01e: getfield z96.vbd D
      // 021: putfield z96.pgx D
      // 024: aload 0
      // 025: getfield ey1.rnz I
      // 028: bipush 8
      // 02a: invokestatic java/lang/Math.min (II)I
      // 02d: istore 5
      // 02f: iload 3
      // 030: iload 5
      // 032: isub
      // 033: istore 6
      // 035: istore 2
      // 036: iload 3
      // 037: iload 5
      // 039: iadd
      // 03a: istore 7
      // 03c: iload 4
      // 03e: iload 5
      // 040: isub
      // 041: istore 8
      // 043: iload 4
      // 045: iload 5
      // 047: iadd
      // 048: istore 9
      // 04a: aload 0
      // 04b: aload 1
      // 04c: invokespecial ey1.avs (Lz96;)Ljava/util/Set;
      // 04f: astore 10
      // 051: iload 3
      // 052: aload 0
      // 053: getfield ey1.rnz I
      // 056: isub
      // 057: istore 11
      // 059: iload 11
      // 05b: iload 3
      // 05c: aload 0
      // 05d: getfield ey1.rnz I
      // 060: iadd
      // 061: if_icmpgt 11e
      // 064: iload 4
      // 066: aload 0
      // 067: getfield ey1.rnz I
      // 06a: isub
      // 06b: iload 2
      // 06c: ifeq 128
      // 06f: istore 12
      // 071: iload 12
      // 073: iload 4
      // 075: aload 0
      // 076: getfield ey1.rnz I
      // 079: iadd
      // 07a: if_icmpgt 117
      // 07d: iload 11
      // 07f: iload 2
      // 080: ifeq 10f
      // 083: iload 6
      // 085: iload 2
      // 086: ifeq 061
      // 089: goto 090
      // 08c: invokestatic ey1.a (Loov;)Loov;
      // 08f: athrow
      // 090: if_icmplt 0f6
      // 093: iload 11
      // 095: iload 2
      // 096: ifeq 10f
      // 099: goto 0a0
      // 09c: invokestatic ey1.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: iload 7
      // 0a2: if_icmpgt 0f6
      // 0a5: goto 0ac
      // 0a8: invokestatic ey1.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 12
      // 0ae: iload 2
      // 0af: ifeq 10f
      // 0b2: goto 0b9
      // 0b5: invokestatic ey1.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: iload 8
      // 0bb: if_icmplt 0f6
      // 0be: goto 0c5
      // 0c1: invokestatic ey1.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: iload 12
      // 0c7: iload 2
      // 0c8: ifeq 10f
      // 0cb: goto 0d2
      // 0ce: invokestatic ey1.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: iload 9
      // 0d4: if_icmpgt 0f6
      // 0d7: goto 0de
      // 0da: invokestatic ey1.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: iload 11
      // 0e1: iload 12
      // 0e3: bipush 1
      // 0e4: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 0e7: aload 1
      // 0e8: invokevirtual ey1$d08.n82 (Lz96;)V
      // 0eb: iload 2
      // 0ec: ifne 110
      // 0ef: goto 0f6
      // 0f2: invokestatic ey1.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 10
      // 0f8: new h2f
      // 0fb: dup
      // 0fc: iload 11
      // 0fe: iload 12
      // 100: invokespecial h2f.<init> (II)V
      // 103: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 108: goto 10f
      // 10b: invokestatic ey1.a (Loov;)Loov;
      // 10e: athrow
      // 10f: pop
      // 110: iinc 12 1
      // 113: iload 2
      // 114: ifne 071
      // 117: iinc 11 1
      // 11a: iload 2
      // 11b: ifne 059
      // 11e: aload 0
      // 11f: getfield ey1.o75 Ljava/util/List;
      // 122: aload 1
      // 123: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 128: pop
      // 129: aload 0
      // 12a: aload 1
      // 12b: invokevirtual ey1.cya (Lz96;)V
      // 12e: return
   }

   public void cya(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield z96.u8j Ljava/util/List;
      // 004: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 007: astore 3
      // 008: bipush 0
      // 009: istore 4
      // 00b: invokestatic OpaquePredicate.b ()I
      // 00e: aload 0
      // 00f: getfield ey1.rnz I
      // 012: istore 5
      // 014: aload 1
      // 015: getfield z96.o2v D
      // 018: d2i
      // 019: bipush 4
      // 01a: ishr
      // 01b: istore 6
      // 01d: aload 1
      // 01e: getfield z96.vbd D
      // 021: d2i
      // 022: bipush 4
      // 023: ishr
      // 024: istore 7
      // 026: bipush 0
      // 027: istore 8
      // 029: bipush 0
      // 02a: istore 9
      // 02c: aload 0
      // 02d: iload 6
      // 02f: iload 7
      // 031: bipush 1
      // 032: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 035: invokestatic ey1$d08.cbu (Ley1$d08;)Lh2f;
      // 038: astore 10
      // 03a: istore 2
      // 03b: aload 1
      // 03c: getfield z96.u8j Ljava/util/List;
      // 03f: invokeinterface java/util/List.clear ()V 1
      // 044: aload 3
      // 045: aload 10
      // 047: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 04c: iload 2
      // 04d: ifeq 06e
      // 050: ifeq 06d
      // 053: goto 05a
      // 056: invokestatic ey1.a (Loov;)Loov;
      // 059: athrow
      // 05a: aload 1
      // 05b: getfield z96.u8j Ljava/util/List;
      // 05e: aload 10
      // 060: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 065: pop
      // 066: goto 06d
      // 069: invokestatic ey1.a (Loov;)Loov;
      // 06c: athrow
      // 06d: bipush 1
      // 06e: istore 11
      // 070: iload 11
      // 072: iload 5
      // 074: bipush 2
      // 075: imul
      // 076: if_icmpgt 10a
      // 079: bipush 0
      // 07a: iload 2
      // 07b: ifeq 111
      // 07e: istore 12
      // 080: iload 12
      // 082: bipush 2
      // 083: if_icmpge 103
      // 086: aload 0
      // 087: getfield ey1.ou5 [[I
      // 08a: iload 4
      // 08c: iinc 4 1
      // 08f: bipush 4
      // 090: irem
      // 091: aaload
      // 092: astore 13
      // 094: bipush 0
      // 095: iload 2
      // 096: ifeq 072
      // 099: istore 14
      // 09b: iload 14
      // 09d: iload 11
      // 09f: if_icmpge 0fc
      // 0a2: iload 8
      // 0a4: aload 13
      // 0a6: bipush 0
      // 0a7: iaload
      // 0a8: iadd
      // 0a9: istore 8
      // 0ab: iload 9
      // 0ad: aload 13
      // 0af: bipush 1
      // 0b0: iaload
      // 0b1: iadd
      // 0b2: istore 9
      // 0b4: aload 0
      // 0b5: iload 6
      // 0b7: iload 8
      // 0b9: iadd
      // 0ba: iload 7
      // 0bc: iload 9
      // 0be: iadd
      // 0bf: bipush 1
      // 0c0: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 0c3: invokestatic ey1$d08.cbu (Ley1$d08;)Lh2f;
      // 0c6: astore 10
      // 0c8: iload 2
      // 0c9: ifeq 0f8
      // 0cc: aload 3
      // 0cd: aload 10
      // 0cf: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0d4: iload 2
      // 0d5: ifeq 082
      // 0d8: goto 0df
      // 0db: invokestatic ey1.a (Loov;)Loov;
      // 0de: athrow
      // 0df: ifeq 0f5
      // 0e2: aload 1
      // 0e3: getfield z96.u8j Ljava/util/List;
      // 0e6: aload 10
      // 0e8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ed: pop
      // 0ee: goto 0f5
      // 0f1: invokestatic ey1.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: iinc 14 1
      // 0f8: iload 2
      // 0f9: ifne 09b
      // 0fc: iinc 12 1
      // 0ff: iload 2
      // 100: ifne 080
      // 103: iinc 11 1
      // 106: iload 2
      // 107: ifne 070
      // 10a: iload 4
      // 10c: bipush 4
      // 10d: irem
      // 10e: istore 4
      // 110: bipush 0
      // 111: istore 11
      // 113: iload 11
      // 115: iload 5
      // 117: bipush 2
      // 118: imul
      // 119: if_icmpge 17c
      // 11c: iload 8
      // 11e: aload 0
      // 11f: getfield ey1.ou5 [[I
      // 122: iload 4
      // 124: aaload
      // 125: bipush 0
      // 126: iaload
      // 127: iadd
      // 128: istore 8
      // 12a: iload 9
      // 12c: aload 0
      // 12d: getfield ey1.ou5 [[I
      // 130: iload 4
      // 132: aaload
      // 133: bipush 1
      // 134: iaload
      // 135: iadd
      // 136: istore 9
      // 138: aload 0
      // 139: iload 6
      // 13b: iload 8
      // 13d: iadd
      // 13e: iload 7
      // 140: iload 9
      // 142: iadd
      // 143: bipush 1
      // 144: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 147: invokestatic ey1$d08.cbu (Ley1$d08;)Lh2f;
      // 14a: astore 10
      // 14c: iload 2
      // 14d: ifeq 178
      // 150: aload 3
      // 151: aload 10
      // 153: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 158: ifeq 175
      // 15b: goto 162
      // 15e: invokestatic ey1.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 1
      // 163: getfield z96.u8j Ljava/util/List;
      // 166: aload 10
      // 168: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16d: pop
      // 16e: goto 175
      // 171: invokestatic ey1.a (Loov;)Loov;
      // 174: athrow
      // 175: iinc 11 1
      // 178: iload 2
      // 179: ifne 113
      // 17c: return
   }

   public void pt7(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield ey1.g5r Ljava/util/Map;
      // 04: aload 1
      // 05: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a: pop
      // 0b: invokestatic OpaquePredicate.b ()I
      // 0e: aload 1
      // 0f: getfield z96.yj0 D
      // 12: d2i
      // 13: bipush 4
      // 14: ishr
      // 15: istore 3
      // 16: istore 2
      // 17: aload 1
      // 18: getfield z96.pgx D
      // 1b: d2i
      // 1c: bipush 4
      // 1d: ishr
      // 1e: istore 4
      // 20: iload 3
      // 21: aload 0
      // 22: getfield ey1.rnz I
      // 25: isub
      // 26: istore 5
      // 28: iload 5
      // 2a: iload 3
      // 2b: aload 0
      // 2c: getfield ey1.rnz I
      // 2f: iadd
      // 30: if_icmpgt 8d
      // 33: iload 4
      // 35: aload 0
      // 36: getfield ey1.rnz I
      // 39: isub
      // 3a: iload 2
      // 3b: ifeq 97
      // 3e: istore 6
      // 40: iload 6
      // 42: iload 4
      // 44: aload 0
      // 45: getfield ey1.rnz I
      // 48: iadd
      // 49: if_icmpgt 86
      // 4c: aload 0
      // 4d: iload 5
      // 4f: iload 6
      // 51: bipush 0
      // 52: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 55: astore 7
      // 57: iload 2
      // 58: ifeq 89
      // 5b: iload 2
      // 5c: ifeq 82
      // 5f: goto 66
      // 62: invokestatic ey1.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 7
      // 68: ifnull 7f
      // 6b: goto 72
      // 6e: invokestatic ey1.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 7
      // 74: aload 1
      // 75: invokevirtual ey1$d08.fwh (Lz96;)V
      // 78: goto 7f
      // 7b: invokestatic ey1.a (Loov;)Loov;
      // 7e: athrow
      // 7f: iinc 6 1
      // 82: iload 2
      // 83: ifne 40
      // 86: iinc 5 1
      // 89: iload 2
      // 8a: ifne 28
      // 8d: aload 0
      // 8e: getfield ey1.o75 Ljava/util/List;
      // 91: aload 1
      // 92: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 97: pop
      // 98: return
   }

   private boolean oyf(int param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: iload 3
      // 02: isub
      // 03: istore 7
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: iload 2
      // 09: iload 4
      // 0b: isub
      // 0c: istore 8
      // 0e: istore 6
      // 10: iload 7
      // 12: iload 5
      // 14: ineg
      // 15: iload 6
      // 17: ifne 2f
      // 1a: if_icmplt 7f
      // 1d: goto 24
      // 20: invokestatic ey1.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 7
      // 26: iload 5
      // 28: goto 2f
      // 2b: invokestatic ey1.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 6
      // 31: ifne 56
      // 34: if_icmpgt 7f
      // 37: goto 3e
      // 3a: invokestatic ey1.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 8
      // 40: iload 6
      // 42: ifne 7c
      // 45: goto 4c
      // 48: invokestatic ey1.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 5
      // 4e: ineg
      // 4f: goto 56
      // 52: invokestatic ey1.a (Loov;)Loov;
      // 55: athrow
      // 56: if_icmplt 7b
      // 59: iload 8
      // 5b: iload 6
      // 5d: ifne 7c
      // 60: goto 67
      // 63: invokestatic ey1.a (Loov;)Loov;
      // 66: athrow
      // 67: iload 5
      // 69: if_icmpgt 7b
      // 6c: goto 73
      // 6f: invokestatic ey1.a (Loov;)Loov;
      // 72: athrow
      // 73: bipush 1
      // 74: goto 80
      // 77: invokestatic ey1.a (Loov;)Loov;
      // 7a: athrow
      // 7b: bipush 0
      // 7c: goto 80
      // 7f: bipush 0
      // 80: ireturn
   }

   public void tc5(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield z96.o2v D
      // 004: d2i
      // 005: bipush 4
      // 006: ishr
      // 007: istore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: aload 1
      // 00c: getfield z96.vbd D
      // 00f: d2i
      // 010: bipush 4
      // 011: ishr
      // 012: istore 4
      // 014: istore 2
      // 015: aload 1
      // 016: getfield z96.yj0 D
      // 019: aload 1
      // 01a: getfield z96.o2v D
      // 01d: dsub
      // 01e: dstore 5
      // 020: aload 1
      // 021: getfield z96.pgx D
      // 024: aload 1
      // 025: getfield z96.vbd D
      // 028: dsub
      // 029: dstore 7
      // 02b: dload 5
      // 02d: dload 5
      // 02f: dmul
      // 030: dload 7
      // 032: dload 7
      // 034: dmul
      // 035: dadd
      // 036: dstore 9
      // 038: dload 9
      // 03a: ldc2_w 64.0
      // 03d: dcmpl
      // 03e: iload 2
      // 03f: ifeq 05a
      // 042: iflt 1b0
      // 045: goto 04c
      // 048: invokestatic ey1.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 1
      // 04d: getfield z96.yj0 D
      // 050: d2i
      // 051: bipush 4
      // 052: ishr
      // 053: goto 05a
      // 056: invokestatic ey1.a (Loov;)Loov;
      // 059: athrow
      // 05a: istore 11
      // 05c: aload 1
      // 05d: getfield z96.pgx D
      // 060: d2i
      // 061: bipush 4
      // 062: ishr
      // 063: istore 12
      // 065: aload 0
      // 066: getfield ey1.rnz I
      // 069: istore 13
      // 06b: iload 3
      // 06c: iload 11
      // 06e: isub
      // 06f: istore 14
      // 071: iload 4
      // 073: iload 12
      // 075: isub
      // 076: istore 15
      // 078: iload 14
      // 07a: iload 2
      // 07b: ifeq 08a
      // 07e: ifne 08d
      // 081: goto 088
      // 084: invokestatic ey1.a (Loov;)Loov;
      // 087: athrow
      // 088: iload 15
      // 08a: ifeq 1b0
      // 08d: aload 0
      // 08e: aload 1
      // 08f: invokespecial ey1.avs (Lz96;)Ljava/util/Set;
      // 092: astore 16
      // 094: iload 3
      // 095: iload 13
      // 097: isub
      // 098: istore 17
      // 09a: iload 17
      // 09c: iload 3
      // 09d: iload 13
      // 09f: iadd
      // 0a0: if_icmpgt 19b
      // 0a3: iload 4
      // 0a5: iload 13
      // 0a7: isub
      // 0a8: istore 18
      // 0aa: iload 18
      // 0ac: iload 4
      // 0ae: iload 13
      // 0b0: iadd
      // 0b1: if_icmpgt 194
      // 0b4: aload 0
      // 0b5: iload 17
      // 0b7: iload 18
      // 0b9: iload 11
      // 0bb: iload 12
      // 0bd: iload 13
      // 0bf: invokespecial ey1.oyf (IIIII)Z
      // 0c2: iload 2
      // 0c3: ifeq 09c
      // 0c6: iload 2
      // 0c7: ifeq 131
      // 0ca: ifne 11e
      // 0cd: goto 0d4
      // 0d0: invokestatic ey1.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: invokestatic hxt.jwp ()Z
      // 0d7: iload 2
      // 0d8: ifeq 105
      // 0db: goto 0e2
      // 0de: invokestatic ey1.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ifeq 10a
      // 0e5: goto 0ec
      // 0e8: invokestatic ey1.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 16
      // 0ee: new h2f
      // 0f1: dup
      // 0f2: iload 17
      // 0f4: iload 18
      // 0f6: invokespecial h2f.<init> (II)V
      // 0f9: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0fe: goto 105
      // 101: invokestatic ey1.a (Loov;)Loov;
      // 104: athrow
      // 105: pop
      // 106: iload 2
      // 107: ifne 11e
      // 10a: aload 0
      // 10b: iload 17
      // 10d: iload 18
      // 10f: bipush 1
      // 110: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 113: aload 1
      // 114: invokevirtual ey1$d08.n82 (Lz96;)V
      // 117: goto 11e
      // 11a: invokestatic ey1.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 0
      // 11f: iload 17
      // 121: iload 14
      // 123: isub
      // 124: iload 18
      // 126: iload 15
      // 128: isub
      // 129: iload 3
      // 12a: iload 4
      // 12c: iload 13
      // 12e: invokespecial ey1.oyf (IIIII)Z
      // 131: iload 2
      // 132: ifeq 15e
      // 135: ifne 18d
      // 138: goto 13f
      // 13b: invokestatic ey1.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 16
      // 141: new h2f
      // 144: dup
      // 145: iload 17
      // 147: iload 14
      // 149: isub
      // 14a: iload 18
      // 14c: iload 15
      // 14e: isub
      // 14f: invokespecial h2f.<init> (II)V
      // 152: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 157: goto 15e
      // 15a: invokestatic ey1.a (Loov;)Loov;
      // 15d: athrow
      // 15e: pop
      // 15f: aload 0
      // 160: iload 17
      // 162: iload 14
      // 164: isub
      // 165: iload 18
      // 167: iload 15
      // 169: isub
      // 16a: bipush 0
      // 16b: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 16e: astore 19
      // 170: iload 2
      // 171: ifeq 190
      // 174: aload 19
      // 176: ifnull 18d
      // 179: goto 180
      // 17c: invokestatic ey1.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 19
      // 182: aload 1
      // 183: invokevirtual ey1$d08.fwh (Lz96;)V
      // 186: goto 18d
      // 189: invokestatic ey1.a (Loov;)Loov;
      // 18c: athrow
      // 18d: iinc 18 1
      // 190: iload 2
      // 191: ifne 0aa
      // 194: iinc 17 1
      // 197: iload 2
      // 198: ifne 09a
      // 19b: aload 0
      // 19c: aload 1
      // 19d: invokevirtual ey1.cya (Lz96;)V
      // 1a0: aload 1
      // 1a1: aload 1
      // 1a2: getfield z96.o2v D
      // 1a5: putfield z96.yj0 D
      // 1a8: aload 1
      // 1a9: aload 1
      // 1aa: getfield z96.vbd D
      // 1ad: putfield z96.pgx D
      // 1b0: return
   }

   public boolean ydq(z96 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 2
      // 07: iload 3
      // 08: bipush 0
      // 09: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 0c: astore 5
      // 0e: aload 5
      // 10: iload 4
      // 12: ifeq 21
      // 15: ifnull 61
      // 18: goto 1f
      // 1b: invokestatic ey1.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 5
      // 21: invokestatic ey1$d08.sz3 (Ley1$d08;)Ljava/util/List;
      // 24: aload 1
      // 25: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 2a: iload 4
      // 2c: ifeq 4e
      // 2f: ifeq 61
      // 32: goto 39
      // 35: invokestatic ey1.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: getfield z96.u8j Ljava/util/List;
      // 3d: aload 5
      // 3f: invokestatic ey1$d08.cbu (Ley1$d08;)Lh2f;
      // 42: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 47: goto 4e
      // 4a: invokestatic ey1.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 4
      // 50: ifeq 5e
      // 53: ifne 61
      // 56: goto 5d
      // 59: invokestatic ey1.a (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: ireturn
   }

   public void ke1(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: iload 1
      // 005: bipush 3
      // 006: bipush 64
      // 008: invokestatic fe6.faa (III)I
      // 00b: istore 1
      // 00c: iload 1
      // 00d: aload 0
      // 00e: getfield ey1.rnz I
      // 011: iload 2
      // 012: ifeq 02b
      // 015: if_icmpeq 1cd
      // 018: goto 01f
      // 01b: invokestatic ey1.a (Loov;)Loov;
      // 01e: athrow
      // 01f: iload 1
      // 020: aload 0
      // 021: getfield ey1.rnz I
      // 024: goto 02b
      // 027: invokestatic ey1.a (Loov;)Loov;
      // 02a: athrow
      // 02b: isub
      // 02c: istore 3
      // 02d: aload 0
      // 02e: getfield ey1.o75 Ljava/util/List;
      // 031: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 034: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 037: astore 4
      // 039: aload 4
      // 03b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 040: ifeq 1c8
      // 043: aload 4
      // 045: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04a: checkcast z96
      // 04d: astore 5
      // 04f: aload 5
      // 051: getfield z96.o2v D
      // 054: d2i
      // 055: bipush 4
      // 056: ishr
      // 057: istore 6
      // 059: aload 5
      // 05b: getfield z96.vbd D
      // 05e: d2i
      // 05f: bipush 4
      // 060: ishr
      // 061: istore 7
      // 063: aload 0
      // 064: aload 5
      // 066: invokespecial ey1.avs (Lz96;)Ljava/util/Set;
      // 069: astore 8
      // 06b: iload 2
      // 06c: ifeq 1cd
      // 06f: iload 3
      // 070: iload 2
      // 071: ifeq 12d
      // 074: goto 07b
      // 077: invokestatic ey1.a (Loov;)Loov;
      // 07a: athrow
      // 07b: ifle 11f
      // 07e: goto 085
      // 081: invokestatic ey1.a (Loov;)Loov;
      // 084: athrow
      // 085: iload 6
      // 087: iload 1
      // 088: isub
      // 089: istore 9
      // 08b: iload 9
      // 08d: iload 6
      // 08f: iload 1
      // 090: iadd
      // 091: if_icmpgt 11b
      // 094: iload 7
      // 096: iload 1
      // 097: isub
      // 098: iload 2
      // 099: ifeq 040
      // 09c: istore 10
      // 09e: iload 10
      // 0a0: iload 7
      // 0a2: iload 1
      // 0a3: iadd
      // 0a4: if_icmpgt 114
      // 0a7: invokestatic hxt.jwp ()Z
      // 0aa: iload 2
      // 0ab: ifeq 08d
      // 0ae: iload 2
      // 0af: ifeq 0d5
      // 0b2: ifeq 0da
      // 0b5: goto 0bc
      // 0b8: invokestatic ey1.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 8
      // 0be: new h2f
      // 0c1: dup
      // 0c2: iload 9
      // 0c4: iload 10
      // 0c6: invokespecial h2f.<init> (II)V
      // 0c9: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0ce: goto 0d5
      // 0d1: invokestatic ey1.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: pop
      // 0d6: iload 2
      // 0d7: ifne 10d
      // 0da: aload 0
      // 0db: iload 9
      // 0dd: iload 10
      // 0df: bipush 1
      // 0e0: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 0e3: astore 11
      // 0e5: iload 2
      // 0e6: ifeq 110
      // 0e9: aload 11
      // 0eb: invokestatic ey1$d08.sz3 (Ley1$d08;)Ljava/util/List;
      // 0ee: aload 5
      // 0f0: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0f5: ifne 10d
      // 0f8: goto 0ff
      // 0fb: invokestatic ey1.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 11
      // 101: aload 5
      // 103: invokevirtual ey1$d08.n82 (Lz96;)V
      // 106: goto 10d
      // 109: invokestatic ey1.a (Loov;)Loov;
      // 10c: athrow
      // 10d: iinc 10 1
      // 110: iload 2
      // 111: ifne 09e
      // 114: iinc 9 1
      // 117: iload 2
      // 118: ifne 08b
      // 11b: iload 2
      // 11c: ifne 1c4
      // 11f: iload 6
      // 121: aload 0
      // 122: getfield ey1.rnz I
      // 125: isub
      // 126: goto 12d
      // 129: invokestatic ey1.a (Loov;)Loov;
      // 12c: athrow
      // 12d: istore 9
      // 12f: iload 9
      // 131: iload 6
      // 133: aload 0
      // 134: getfield ey1.rnz I
      // 137: iadd
      // 138: if_icmpgt 1c4
      // 13b: iload 7
      // 13d: aload 0
      // 13e: getfield ey1.rnz I
      // 141: isub
      // 142: iload 2
      // 143: ifeq 040
      // 146: istore 10
      // 148: iload 10
      // 14a: iload 7
      // 14c: aload 0
      // 14d: getfield ey1.rnz I
      // 150: iadd
      // 151: if_icmpgt 1bd
      // 154: aload 0
      // 155: iload 9
      // 157: iload 10
      // 159: iload 6
      // 15b: iload 7
      // 15d: iload 1
      // 15e: invokespecial ey1.oyf (IIIII)Z
      // 161: iload 2
      // 162: ifeq 131
      // 165: iload 2
      // 166: ifeq 18c
      // 169: ifne 1b6
      // 16c: goto 173
      // 16f: invokestatic ey1.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 8
      // 175: new h2f
      // 178: dup
      // 179: iload 9
      // 17b: iload 10
      // 17d: invokespecial h2f.<init> (II)V
      // 180: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 185: goto 18c
      // 188: invokestatic ey1.a (Loov;)Loov;
      // 18b: athrow
      // 18c: pop
      // 18d: aload 0
      // 18e: iload 9
      // 190: iload 10
      // 192: bipush 1
      // 193: invokespecial ey1.w7h (IIZ)Ley1$d08;
      // 196: astore 11
      // 198: iload 2
      // 199: ifeq 1b9
      // 19c: aload 11
      // 19e: ifnull 1b6
      // 1a1: goto 1a8
      // 1a4: invokestatic ey1.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 11
      // 1aa: aload 5
      // 1ac: invokevirtual ey1$d08.fwh (Lz96;)V
      // 1af: goto 1b6
      // 1b2: invokestatic ey1.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: iinc 10 1
      // 1b9: iload 2
      // 1ba: ifne 148
      // 1bd: iinc 9 1
      // 1c0: iload 2
      // 1c1: ifne 12f
      // 1c4: iload 2
      // 1c5: ifne 039
      // 1c8: aload 0
      // 1c9: iload 1
      // 1ca: putfield ey1.rnz I
      // 1cd: return
   }

   public static int _97(int var0) {
      return var0 * 16 - 16;
   }

   private PriorityQueue pys(Set param1, z96 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 2
      // 006: getfield z96.x5k F
      // 009: ldc 90.0
      // 00b: nop
      // 00c: fadd
      // 00d: fstore 5
      // 00f: fload 5
      // 011: ldc -180.0
      // 013: nop
      // 014: fcmpg
      // 015: ifgt 031
      // 018: fload 5
      // 01a: ldc 360.0
      // 01c: nop
      // 01d: fadd
      // 01e: fstore 5
      // 020: iload 4
      // 022: ifeq 04c
      // 025: iload 4
      // 027: ifne 00f
      // 02a: goto 031
      // 02d: invokestatic ey1.a (Loov;)Loov;
      // 030: athrow
      // 031: fload 5
      // 033: ldc 180.0
      // 035: nop
      // 036: fcmpl
      // 037: ifle 04c
      // 03a: fload 5
      // 03c: ldc 360.0
      // 03e: nop
      // 03f: fsub
      // 040: iload 4
      // 042: ifeq 04e
      // 045: fstore 5
      // 047: iload 4
      // 049: ifne 031
      // 04c: fload 5
      // 04e: f2d
      // 04f: ldc2_w 0.017453292519943295
      // 052: dmul
      // 053: dstore 6
      // 055: aload 2
      // 056: getfield z96.y2i F
      // 059: f2d
      // 05a: dstore 8
      // 05c: dload 8
      // 05e: ldc2_w 0.017453292519943295
      // 061: dmul
      // 062: dstore 10
      // 064: new net/optifine/ChunkPosComparator
      // 067: dup
      // 068: aload 2
      // 069: getfield z96.jw4 I
      // 06c: aload 2
      // 06d: getfield z96.e6l I
      // 070: dload 6
      // 072: dload 10
      // 074: invokespecial net/optifine/ChunkPosComparator.<init> (IIDD)V
      // 077: astore 12
      // 079: aload 12
      // 07b: invokestatic java/util/Collections.reverseOrder (Ljava/util/Comparator;)Ljava/util/Comparator;
      // 07e: astore 13
      // 080: new java/util/PriorityQueue
      // 083: dup
      // 084: iload 3
      // 085: aload 13
      // 087: invokespecial java/util/PriorityQueue.<init> (ILjava/util/Comparator;)V
      // 08a: astore 14
      // 08c: aload 1
      // 08d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 092: astore 15
      // 094: aload 15
      // 096: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09b: ifeq 122
      // 09e: aload 15
      // 0a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a5: checkcast h2f
      // 0a8: astore 16
      // 0aa: aload 14
      // 0ac: iload 4
      // 0ae: ifeq 124
      // 0b1: iload 4
      // 0b3: ifeq 0eb
      // 0b6: goto 0bd
      // 0b9: invokestatic ey1.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: invokevirtual java/util/PriorityQueue.size ()I
      // 0c0: iload 3
      // 0c1: if_icmpge 0df
      // 0c4: goto 0cb
      // 0c7: invokestatic ey1.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 14
      // 0cd: aload 16
      // 0cf: invokevirtual java/util/PriorityQueue.add (Ljava/lang/Object;)Z
      // 0d2: pop
      // 0d3: iload 4
      // 0d5: ifne 11d
      // 0d8: goto 0df
      // 0db: invokestatic ey1.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 14
      // 0e1: invokevirtual java/util/PriorityQueue.peek ()Ljava/lang/Object;
      // 0e4: goto 0eb
      // 0e7: invokestatic ey1.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: checkcast h2f
      // 0ee: astore 17
      // 0f0: aload 12
      // 0f2: aload 16
      // 0f4: aload 17
      // 0f6: invokevirtual net/optifine/ChunkPosComparator.compare (Lh2f;Lh2f;)I
      // 0f9: iload 4
      // 0fb: ifeq 11c
      // 0fe: ifge 11d
      // 101: goto 108
      // 104: invokestatic ey1.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 14
      // 10a: invokevirtual java/util/PriorityQueue.remove ()Ljava/lang/Object;
      // 10d: pop
      // 10e: aload 14
      // 110: aload 16
      // 112: invokevirtual java/util/PriorityQueue.add (Ljava/lang/Object;)Z
      // 115: goto 11c
      // 118: invokestatic ey1.a (Loov;)Loov;
      // 11b: athrow
      // 11c: pop
      // 11d: iload 4
      // 11f: ifne 094
      // 122: aload 14
      // 124: areturn
   }

   private Set avs(z96 var1) {
      int var2 = OpaquePredicate.b();
      Set var3 = (Set)this.g5r.get(var1);

      label30: {
         try {
            if (var2 == 0) {
               return var3;
            }

            if (var3 == null) {
               break label30;
            }
         } catch (oov var9) {
            throw a(var9);
         }

         return var3;
      }

      int var4 = Math.min(this.rnz, 8);
      int var5 = this.rnz * 2 + 1;
      int var6 = var4 * 2 + 1;
      int var7 = var5 * var5 - var6 * var6;
      var7 = Math.max(var7, 16);
      HashSet var8 = new HashSet(var7);
      this.g5r.put(var1, var8);
      return var8;
   }

   public static Logger srl() {
      return o6d;
   }

   public static dug u4y(ey1 var0) {
      return var0.ylg;
   }

   public static yo9 tq6(ey1 var0) {
      return var0.mg1;
   }

   public static List xsj(ey1 var0) {
      return var0.rdd;
   }

   public static List h7m(ey1 var0) {
      return var0.r5p;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
