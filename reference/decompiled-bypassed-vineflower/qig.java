public class qig extends cjm {
   public qig(ysf var1, double var2) {
      this.ibv = var1;
      this.i8h = var2;
      this.k23(1);
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield qig.ibv Lysf;
      // 008: invokevirtual ysf.ktm ()I
      // 00b: iload 1
      // 00c: ifeq 037
      // 00f: iflt 01f
      // 012: goto 019
      // 015: invokestatic qig.a (Loov;)Loov;
      // 018: athrow
      // 019: bipush 0
      // 01a: ireturn
      // 01b: invokestatic qig.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield qig.ibv Lysf;
      // 023: iload 1
      // 024: ifeq 044
      // 027: invokevirtual ysf.mbr ()Ljava/util/Random;
      // 02a: sipush 400
      // 02d: invokevirtual java/util/Random.nextInt (I)I
      // 030: goto 037
      // 033: invokestatic qig.a (Loov;)Loov;
      // 036: athrow
      // 037: ifeq 040
      // 03a: bipush 0
      // 03b: ireturn
      // 03c: invokestatic qig.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield qig.ibv Lysf;
      // 044: getfield ysf.oay Lt9d;
      // 047: ldc ysf
      // 049: nop
      // 04a: aload 0
      // 04b: getfield qig.ibv Lysf;
      // 04e: invokevirtual ysf.aaw ()Lnh4;
      // 051: ldc2_w 6.0
      // 054: ldc2_w 3.0
      // 057: ldc2_w 6.0
      // 05a: invokevirtual nh4.c2h (DDD)Lnh4;
      // 05d: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 060: astore 2
      // 061: ldc2_w 1.7976931348623157E308
      // 064: dstore 3
      // 065: aload 2
      // 066: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 06b: astore 5
      // 06d: aload 5
      // 06f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 074: ifeq 107
      // 077: aload 5
      // 079: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07e: checkcast ysf
      // 081: astore 6
      // 083: aload 6
      // 085: iload 1
      // 086: ifeq 116
      // 089: iload 1
      // 08a: ifeq 0ab
      // 08d: goto 094
      // 090: invokestatic qig.a (Loov;)Loov;
      // 093: athrow
      // 094: aload 0
      // 095: getfield qig.ibv Lysf;
      // 098: if_acmpeq 103
      // 09b: goto 0a2
      // 09e: invokestatic qig.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 6
      // 0a4: goto 0ab
      // 0a7: invokestatic qig.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: invokevirtual ysf._mf ()Z
      // 0ae: iload 1
      // 0af: ifeq 0d3
      // 0b2: ifne 103
      // 0b5: goto 0bc
      // 0b8: invokestatic qig.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 6
      // 0be: iload 1
      // 0bf: ifeq 0d8
      // 0c2: goto 0c9
      // 0c5: invokestatic qig.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: invokevirtual ysf.ktm ()I
      // 0cc: goto 0d3
      // 0cf: invokestatic qig.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: ifge 103
      // 0d6: aload 6
      // 0d8: aload 0
      // 0d9: getfield qig.ibv Lysf;
      // 0dc: invokevirtual ysf.wxg (Li2h;)D
      // 0df: dstore 7
      // 0e1: dload 7
      // 0e3: iload 1
      // 0e4: ifeq 0fc
      // 0e7: dload 3
      // 0e8: dcmpg
      // 0e9: ifgt 103
      // 0ec: goto 0f3
      // 0ef: invokestatic qig.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: dload 7
      // 0f5: goto 0fc
      // 0f8: invokestatic qig.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: dstore 3
      // 0fd: aload 0
      // 0fe: aload 6
      // 100: putfield qig.mnk Lg_3;
      // 103: iload 1
      // 104: ifne 06d
      // 107: aload 0
      // 108: iload 1
      // 109: ifeq 11a
      // 10c: getfield qig.mnk Lg_3;
      // 10f: goto 116
      // 112: invokestatic qig.a (Loov;)Loov;
      // 115: athrow
      // 116: ifnonnull 130
      // 119: aload 0
      // 11a: getfield qig.ibv Lysf;
      // 11d: bipush 16
      // 11f: bipush 3
      // 120: invokestatic zim.jb8 (Llaq;II)Lfqr;
      // 123: astore 5
      // 125: aload 5
      // 127: ifnonnull 130
      // 12a: bipush 0
      // 12b: ireturn
      // 12c: invokestatic qig.a (Loov;)Loov;
      // 12f: athrow
      // 130: bipush 1
      // 131: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = t9d.c();

      try {
         if (var1 != 0) {
            return (boolean)this.zoc;
         }

         if (this.zoc > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public void mnp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 26
      // 09: getfield qig.mnk Lg_3;
      // 0c: ifnull 25
      // 0f: goto 16
      // 12: invokestatic qig.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield qig.ibv Lysf;
      // 1a: bipush 1
      // 1b: invokevirtual ysf.wnt (Z)V
      // 1e: goto 25
      // 21: invokestatic qig.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: sipush 1000
      // 29: putfield qig.zoc I
      // 2c: return
   }

   @Override
   public void zly() {
      this.ibv.wnt(false);
      this.mnk = null;
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: dup
      // 06: getfield qig.zoc I
      // 09: bipush 1
      // 0a: isub
      // 0b: putfield qig.zoc I
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifeq 6a
      // 13: getfield qig.mnk Lg_3;
      // 16: ifnull 62
      // 19: goto 20
      // 1c: invokestatic qig.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield qig.ibv Lysf;
      // 24: aload 0
      // 25: getfield qig.mnk Lg_3;
      // 28: invokevirtual ysf.wxg (Li2h;)D
      // 2b: ldc2_w 4.0
      // 2e: dcmpl
      // 2f: iload 1
      // 30: ifeq 5d
      // 33: goto 3a
      // 36: invokestatic qig.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifle b7
      // 3d: goto 44
      // 40: invokestatic qig.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield qig.ibv Lysf;
      // 48: invokevirtual ysf.zq2 ()Lp8a;
      // 4b: aload 0
      // 4c: getfield qig.mnk Lg_3;
      // 4f: aload 0
      // 50: getfield qig.i8h D
      // 53: invokevirtual p8a.p6m (Li2h;D)Z
      // 56: goto 5d
      // 59: invokestatic qig.a (Loov;)Loov;
      // 5c: athrow
      // 5d: pop
      // 5e: iload 1
      // 5f: ifne b7
      // 62: aload 0
      // 63: goto 6a
      // 66: invokestatic qig.a (Loov;)Loov;
      // 69: athrow
      // 6a: getfield qig.ibv Lysf;
      // 6d: iload 1
      // 6e: ifeq 8c
      // 71: invokevirtual ysf.zq2 ()Lp8a;
      // 74: invokevirtual p8a.j07 ()Z
      // 77: ifeq b7
      // 7a: goto 81
      // 7d: invokestatic qig.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 0
      // 82: getfield qig.ibv Lysf;
      // 85: goto 8c
      // 88: invokestatic qig.a (Loov;)Loov;
      // 8b: athrow
      // 8c: bipush 16
      // 8e: bipush 3
      // 8f: invokestatic zim.jb8 (Llaq;II)Lfqr;
      // 92: astore 2
      // 93: aload 2
      // 94: ifnonnull 9c
      // 97: return
      // 98: invokestatic qig.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: getfield qig.ibv Lysf;
      // a0: invokevirtual ysf.zq2 ()Lp8a;
      // a3: aload 2
      // a4: getfield fqr.lvi D
      // a7: aload 2
      // a8: getfield fqr.gn5 D
      // ab: aload 2
      // ac: getfield fqr.bn2 D
      // af: aload 0
      // b0: getfield qig.i8h D
      // b3: invokevirtual p8a.ni_ (DDDD)Z
      // b6: pop
      // b7: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
