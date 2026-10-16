public class z7z extends wel {
   public z7z(EntityPlayer var1, boolean var2, Class[] var3) {
      super(var1, false);
      this.wlg = var2;
      this.rb3 = var3;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield z7z.pf7 Llaq;
      // 08: invokevirtual EntityPlayer.ii0 ()I
      // 0b: istore 2
      // 0c: iload 2
      // 0d: iload 1
      // 0e: ifne 32
      // 11: aload 0
      // 12: getfield z7z.c8e I
      // 15: if_icmpeq 44
      // 18: goto 1f
      // 1b: invokestatic z7z.b (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: getfield z7z.pf7 Llaq;
      // 24: invokevirtual EntityPlayer.myo ()Lg_3;
      // 27: bipush 0
      // 28: invokevirtual z7z.paa (Lg_3;Z)Z
      // 2b: goto 32
      // 2e: invokestatic z7z.b (Loov;)Loov;
      // 31: athrow
      // 32: iload 1
      // 33: ifne 41
      // 36: ifeq 44
      // 39: goto 40
      // 3c: invokestatic z7z.b (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 45
      // 44: bipush 0
      // 45: ireturn
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
      // 000: aload 0
      // 001: getfield z7z.pf7 Llaq;
      // 004: aload 0
      // 005: getfield z7z.pf7 Llaq;
      // 008: invokevirtual EntityPlayer.myo ()Lg_3;
      // 00b: invokevirtual EntityPlayer.ux8 (Lg_3;)V
      // 00e: invokestatic OpaquePredicate.b ()I
      // 011: aload 0
      // 012: aload 0
      // 013: getfield z7z.pf7 Llaq;
      // 016: invokevirtual EntityPlayer.ii0 ()I
      // 019: putfield z7z.c8e I
      // 01c: istore 1
      // 01d: aload 0
      // 01e: iload 1
      // 01f: ifeq 158
      // 022: getfield z7z.wlg Z
      // 025: ifeq 157
      // 028: goto 02f
      // 02b: invokestatic z7z.b (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokevirtual z7z.uyl ()D
      // 033: dstore 2
      // 034: aload 0
      // 035: getfield z7z.pf7 Llaq;
      // 038: getfield EntityPlayer.oay Lt9d;
      // 03b: aload 0
      // 03c: getfield z7z.pf7 Llaq;
      // 03f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 042: new nh4
      // 045: dup
      // 046: aload 0
      // 047: getfield z7z.pf7 Llaq;
      // 04a: getfield EntityPlayer.o2v D
      // 04d: aload 0
      // 04e: getfield z7z.pf7 Llaq;
      // 051: getfield EntityPlayer.kfp D
      // 054: aload 0
      // 055: getfield z7z.pf7 Llaq;
      // 058: getfield EntityPlayer.vbd D
      // 05b: aload 0
      // 05c: getfield z7z.pf7 Llaq;
      // 05f: getfield EntityPlayer.o2v D
      // 062: dconst_1
      // 063: dadd
      // 064: aload 0
      // 065: getfield z7z.pf7 Llaq;
      // 068: getfield EntityPlayer.kfp D
      // 06b: dconst_1
      // 06c: dadd
      // 06d: aload 0
      // 06e: getfield z7z.pf7 Llaq;
      // 071: getfield EntityPlayer.vbd D
      // 074: dconst_1
      // 075: dadd
      // 076: invokespecial nh4.<init> (DDDDDD)V
      // 079: dload 2
      // 07a: ldc2_w 10.0
      // 07d: dload 2
      // 07e: invokevirtual nh4.c2h (DDD)Lnh4;
      // 081: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 084: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 089: astore 4
      // 08b: aload 4
      // 08d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 092: ifeq 157
      // 095: aload 4
      // 097: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 09c: checkcast EntityPlayer
      // 09f: astore 5
      // 0a1: aload 0
      // 0a2: iload 1
      // 0a3: ifeq 158
      // 0a6: getfield z7z.pf7 Llaq;
      // 0a9: iload 1
      // 0aa: ifeq 0d0
      // 0ad: aload 5
      // 0af: if_acmpeq 153
      // 0b2: goto 0b9
      // 0b5: invokestatic z7z.b (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 5
      // 0bb: iload 1
      // 0bc: ifeq 0d5
      // 0bf: goto 0c6
      // 0c2: invokestatic z7z.b (Loov;)Loov;
      // 0c5: athrow
      // 0c6: invokevirtual EntityPlayer.q4v ()Lg_3;
      // 0c9: goto 0d0
      // 0cc: invokestatic z7z.b (Loov;)Loov;
      // 0cf: athrow
      // 0d0: ifnonnull 153
      // 0d3: aload 5
      // 0d5: aload 0
      // 0d6: getfield z7z.pf7 Llaq;
      // 0d9: invokevirtual EntityPlayer.myo ()Lg_3;
      // 0dc: invokevirtual EntityPlayer.g7h (Lg_3;)Z
      // 0df: iload 1
      // 0e0: ifeq 0ee
      // 0e3: ifne 153
      // 0e6: goto 0ed
      // 0e9: invokestatic z7z.b (Loov;)Loov;
      // 0ec: athrow
      // 0ed: bipush 0
      // 0ee: istore 6
      // 0f0: aload 0
      // 0f1: getfield z7z.rb3 [Ljava/lang/Class;
      // 0f4: astore 7
      // 0f6: aload 7
      // 0f8: arraylength
      // 0f9: istore 8
      // 0fb: bipush 0
      // 0fc: istore 9
      // 0fe: iload 9
      // 100: iload 8
      // 102: if_icmpge 13a
      // 105: aload 7
      // 107: iload 9
      // 109: aaload
      // 10a: astore 10
      // 10c: iload 1
      // 10d: ifeq 136
      // 110: aload 5
      // 112: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 115: iload 1
      // 116: ifeq 09c
      // 119: goto 120
      // 11c: invokestatic z7z.b (Loov;)Loov;
      // 11f: athrow
      // 120: aload 10
      // 122: if_acmpne 12c
      // 125: bipush 1
      // 126: istore 6
      // 128: iload 1
      // 129: ifne 13a
      // 12c: iinc 9 1
      // 12f: goto 136
      // 132: invokestatic z7z.b (Loov;)Loov;
      // 135: athrow
      // 136: iload 1
      // 137: ifne 0fe
      // 13a: iload 6
      // 13c: ifne 153
      // 13f: aload 0
      // 140: aload 5
      // 142: aload 0
      // 143: getfield z7z.pf7 Llaq;
      // 146: invokevirtual EntityPlayer.myo ()Lg_3;
      // 149: invokevirtual z7z.sb0 (Llaq;Lg_3;)V
      // 14c: goto 153
      // 14f: invokestatic z7z.b (Loov;)Loov;
      // 152: athrow
      // 153: iload 1
      // 154: ifne 08b
      // 157: aload 0
      // 158: invokespecial wel.mnp ()V
      // 15b: return
   }

   public void sb0(EntityPlayer var1, Entity var2) {
      var1.ux8(var2);
   }

   private static oov b(oov var0) {
      return var0;
   }
}
