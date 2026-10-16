public class nrk$ayj extends gt4 {
   private final gdz ty_;
   private final int kd0;
   private final int tc2;
   private boolean quh;

   public nrk$ayj(int var1, int var2, int var3, gdz var4, int var5, int var6) {
      super(var1, var2, var3, 22, 22, "");
      this.ty_ = var4;
      this.kd0 = var5;
      this.tc2 = var6;
   }

   @Override
   public void drawButton(Minecraft param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifne 031
      // 00b: getfield nrk$ayj.c1s Z
      // 00e: ifeq 181
      // 011: goto 018
      // 014: invokestatic nrk$ayj.c (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: invokevirtual Minecraft.l22 ()Llc5;
      // 01c: invokestatic nrk._7t ()Lgdz;
      // 01f: invokevirtual lc5.anl (Lgdz;)V
      // 022: fconst_1
      // 023: fconst_1
      // 024: fconst_1
      // 025: fconst_1
      // 026: invokestatic hzu.wn0 (FFFF)V
      // 029: aload 0
      // 02a: goto 031
      // 02d: invokestatic nrk$ayj.c (Loov;)Loov;
      // 030: athrow
      // 031: iload 2
      // 032: aload 0
      // 033: getfield nrk$ayj.ibo I
      // 036: iload 4
      // 038: ifne 051
      // 03b: if_icmplt 0a4
      // 03e: goto 045
      // 041: invokestatic nrk$ayj.c (Loov;)Loov;
      // 044: athrow
      // 045: iload 3
      // 046: aload 0
      // 047: getfield nrk$ayj.mij I
      // 04a: goto 051
      // 04d: invokestatic nrk$ayj.c (Loov;)Loov;
      // 050: athrow
      // 051: iload 4
      // 053: ifne 071
      // 056: if_icmplt 0a4
      // 059: goto 060
      // 05c: invokestatic nrk$ayj.c (Loov;)Loov;
      // 05f: athrow
      // 060: iload 2
      // 061: aload 0
      // 062: getfield nrk$ayj.ibo I
      // 065: aload 0
      // 066: getfield nrk$ayj.s22 I
      // 069: iadd
      // 06a: goto 071
      // 06d: invokestatic nrk$ayj.c (Loov;)Loov;
      // 070: athrow
      // 071: iload 4
      // 073: ifne 09d
      // 076: if_icmpge 0a4
      // 079: goto 080
      // 07c: invokestatic nrk$ayj.c (Loov;)Loov;
      // 07f: athrow
      // 080: iload 3
      // 081: iload 4
      // 083: ifne 0a1
      // 086: goto 08d
      // 089: invokestatic nrk$ayj.c (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield nrk$ayj.mij I
      // 091: aload 0
      // 092: getfield nrk$ayj.gqs I
      // 095: iadd
      // 096: goto 09d
      // 099: invokestatic nrk$ayj.c (Loov;)Loov;
      // 09c: athrow
      // 09d: if_icmpge 0a4
      // 0a0: bipush 1
      // 0a1: goto 0a5
      // 0a4: bipush 0
      // 0a5: putfield nrk$ayj.f9x Z
      // 0a8: sipush 219
      // 0ab: istore 5
      // 0ad: bipush 0
      // 0ae: istore 6
      // 0b0: aload 0
      // 0b1: getfield nrk$ayj.c9a Z
      // 0b4: iload 4
      // 0b6: ifne 0de
      // 0b9: ifne 0d3
      // 0bc: goto 0c3
      // 0bf: invokestatic nrk$ayj.c (Loov;)Loov;
      // 0c2: athrow
      // 0c3: iload 6
      // 0c5: aload 0
      // 0c6: getfield nrk$ayj.s22 I
      // 0c9: bipush 2
      // 0ca: imul
      // 0cb: iadd
      // 0cc: istore 6
      // 0ce: iload 4
      // 0d0: ifeq 122
      // 0d3: aload 0
      // 0d4: getfield nrk$ayj.quh Z
      // 0d7: goto 0de
      // 0da: invokestatic nrk$ayj.c (Loov;)Loov;
      // 0dd: athrow
      // 0de: iload 4
      // 0e0: ifne 108
      // 0e3: ifeq 0fd
      // 0e6: goto 0ed
      // 0e9: invokestatic nrk$ayj.c (Loov;)Loov;
      // 0ec: athrow
      // 0ed: iload 6
      // 0ef: aload 0
      // 0f0: getfield nrk$ayj.s22 I
      // 0f3: bipush 1
      // 0f4: imul
      // 0f5: iadd
      // 0f6: istore 6
      // 0f8: iload 4
      // 0fa: ifeq 122
      // 0fd: aload 0
      // 0fe: getfield nrk$ayj.f9x Z
      // 101: goto 108
      // 104: invokestatic nrk$ayj.c (Loov;)Loov;
      // 107: athrow
      // 108: iload 4
      // 10a: ifne 150
      // 10d: ifeq 122
      // 110: goto 117
      // 113: invokestatic nrk$ayj.c (Loov;)Loov;
      // 116: athrow
      // 117: iload 6
      // 119: aload 0
      // 11a: getfield nrk$ayj.s22 I
      // 11d: bipush 3
      // 11e: imul
      // 11f: iadd
      // 120: istore 6
      // 122: aload 0
      // 123: aload 0
      // 124: getfield nrk$ayj.ibo I
      // 127: aload 0
      // 128: getfield nrk$ayj.mij I
      // 12b: iload 6
      // 12d: iload 5
      // 12f: aload 0
      // 130: getfield nrk$ayj.s22 I
      // 133: aload 0
      // 134: getfield nrk$ayj.gqs I
      // 137: iload 4
      // 139: ifne 17e
      // 13c: invokevirtual nrk$ayj.mt4 (IIIIII)V
      // 13f: invokestatic nrk._7t ()Lgdz;
      // 142: aload 0
      // 143: getfield nrk$ayj.ty_ Lgdz;
      // 146: invokevirtual gdz.equals (Ljava/lang/Object;)Z
      // 149: goto 150
      // 14c: invokestatic nrk$ayj.c (Loov;)Loov;
      // 14f: athrow
      // 150: ifne 165
      // 153: aload 1
      // 154: invokevirtual Minecraft.l22 ()Llc5;
      // 157: aload 0
      // 158: getfield nrk$ayj.ty_ Lgdz;
      // 15b: invokevirtual lc5.anl (Lgdz;)V
      // 15e: goto 165
      // 161: invokestatic nrk$ayj.c (Loov;)Loov;
      // 164: athrow
      // 165: aload 0
      // 166: aload 0
      // 167: getfield nrk$ayj.ibo I
      // 16a: bipush 2
      // 16b: iadd
      // 16c: aload 0
      // 16d: getfield nrk$ayj.mij I
      // 170: bipush 2
      // 171: iadd
      // 172: aload 0
      // 173: getfield nrk$ayj.kd0 I
      // 176: aload 0
      // 177: getfield nrk$ayj.tc2 I
      // 17a: bipush 18
      // 17c: bipush 18
      // 17e: invokevirtual nrk$ayj.mt4 (IIIIII)V
      // 181: return
   }

   public boolean m4g() {
      return this.quh;
   }

   public void n_c(boolean var1) {
      this.quh = var1;
   }

   private static oov c(oov var0) {
      return var0;
   }
}
