public class h3t extends gt4 {
   private boolean m46 = false;

   public h3t(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, "");
   }

   public boolean _in() {
      return this.m46;
   }

   public void fjm(boolean var1) {
      this.m46 = var1;
   }

   @Override
   public void drawButton(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield h3t.c1s Z
      // 009: iload 4
      // 00b: ifeq 031
      // 00e: ifeq 15a
      // 011: goto 018
      // 014: invokestatic h3t.c (Loov;)Loov;
      // 017: athrow
      // 018: aload 1
      // 019: invokevirtual c05.l22 ()Llc5;
      // 01c: getstatic gt4.lib Lgdz;
      // 01f: invokevirtual lc5.anl (Lgdz;)V
      // 022: fconst_1
      // 023: fconst_1
      // 024: fconst_1
      // 025: fconst_1
      // 026: invokestatic hzu.wn0 (FFFF)V
      // 029: iload 2
      // 02a: goto 031
      // 02d: invokestatic h3t.c (Loov;)Loov;
      // 030: athrow
      // 031: aload 0
      // 032: getfield h3t.ibo I
      // 035: iload 4
      // 037: ifeq 050
      // 03a: if_icmplt 0a3
      // 03d: goto 044
      // 040: invokestatic h3t.c (Loov;)Loov;
      // 043: athrow
      // 044: iload 3
      // 045: aload 0
      // 046: getfield h3t.mij I
      // 049: goto 050
      // 04c: invokestatic h3t.c (Loov;)Loov;
      // 04f: athrow
      // 050: iload 4
      // 052: ifeq 070
      // 055: if_icmplt 0a3
      // 058: goto 05f
      // 05b: invokestatic h3t.c (Loov;)Loov;
      // 05e: athrow
      // 05f: iload 2
      // 060: aload 0
      // 061: getfield h3t.ibo I
      // 064: aload 0
      // 065: getfield h3t.s22 I
      // 068: iadd
      // 069: goto 070
      // 06c: invokestatic h3t.c (Loov;)Loov;
      // 06f: athrow
      // 070: iload 4
      // 072: ifeq 09c
      // 075: if_icmpge 0a3
      // 078: goto 07f
      // 07b: invokestatic h3t.c (Loov;)Loov;
      // 07e: athrow
      // 07f: iload 3
      // 080: iload 4
      // 082: ifeq 0a0
      // 085: goto 08c
      // 088: invokestatic h3t.c (Loov;)Loov;
      // 08b: athrow
      // 08c: aload 0
      // 08d: getfield h3t.mij I
      // 090: aload 0
      // 091: getfield h3t.gqs I
      // 094: iadd
      // 095: goto 09c
      // 098: invokestatic h3t.c (Loov;)Loov;
      // 09b: athrow
      // 09c: if_icmpge 0a3
      // 09f: bipush 1
      // 0a0: goto 0a4
      // 0a3: bipush 0
      // 0a4: istore 5
      // 0a6: aload 0
      // 0a7: getfield h3t.m46 Z
      // 0aa: iload 4
      // 0ac: ifeq 108
      // 0af: ifeq 0fd
      // 0b2: goto 0b9
      // 0b5: invokestatic h3t.c (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: getfield h3t.c9a Z
      // 0bd: iload 4
      // 0bf: ifeq 0e6
      // 0c2: goto 0c9
      // 0c5: invokestatic h3t.c (Loov;)Loov;
      // 0c8: athrow
      // 0c9: ifne 0dd
      // 0cc: goto 0d3
      // 0cf: invokestatic h3t.c (Loov;)Loov;
      // 0d2: athrow
      // 0d3: getstatic h3t$wlo.dky Lh3t$wlo;
      // 0d6: astore 6
      // 0d8: iload 4
      // 0da: ifne 13c
      // 0dd: iload 5
      // 0df: goto 0e6
      // 0e2: invokestatic h3t.c (Loov;)Loov;
      // 0e5: athrow
      // 0e6: ifeq 0f3
      // 0e9: getstatic h3t$wlo.dui Lh3t$wlo;
      // 0ec: astore 6
      // 0ee: iload 4
      // 0f0: ifne 13c
      // 0f3: getstatic h3t$wlo.nvg Lh3t$wlo;
      // 0f6: astore 6
      // 0f8: iload 4
      // 0fa: ifne 13c
      // 0fd: aload 0
      // 0fe: getfield h3t.c9a Z
      // 101: goto 108
      // 104: invokestatic h3t.c (Loov;)Loov;
      // 107: athrow
      // 108: iload 4
      // 10a: ifeq 12a
      // 10d: ifne 121
      // 110: goto 117
      // 113: invokestatic h3t.c (Loov;)Loov;
      // 116: athrow
      // 117: getstatic h3t$wlo.oxa Lh3t$wlo;
      // 11a: astore 6
      // 11c: iload 4
      // 11e: ifne 13c
      // 121: iload 5
      // 123: goto 12a
      // 126: invokestatic h3t.c (Loov;)Loov;
      // 129: athrow
      // 12a: ifeq 137
      // 12d: getstatic h3t$wlo.znb Lh3t$wlo;
      // 130: astore 6
      // 132: iload 4
      // 134: ifne 13c
      // 137: getstatic h3t$wlo.nfg Lh3t$wlo;
      // 13a: astore 6
      // 13c: aload 0
      // 13d: aload 0
      // 13e: getfield h3t.ibo I
      // 141: aload 0
      // 142: getfield h3t.mij I
      // 145: aload 6
      // 147: invokevirtual h3t$wlo.r5p ()I
      // 14a: aload 6
      // 14c: invokevirtual h3t$wlo.xas ()I
      // 14f: aload 0
      // 150: getfield h3t.s22 I
      // 153: aload 0
      // 154: getfield h3t.gqs I
      // 157: invokevirtual h3t.mt4 (IIIIII)V
      // 15a: return
   }

   private static oov c(oov var0) {
      return var0;
   }
}
