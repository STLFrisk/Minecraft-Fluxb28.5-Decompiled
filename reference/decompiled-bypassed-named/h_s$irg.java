public class h_s$irg extends bww {
   private h_s x7t;
   private int fax;

   public h_s$irg(h_s var1) {
      super(var1);
      this.x7t = var1;
   }

   @Override
   public void nju() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01e
      // 009: getfield h_s$irg.ilc Z
      // 00c: ifeq 103
      // 00f: goto 016
      // 012: invokestatic h_s$irg.b (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic h_s$irg.b (Loov;)Loov;
      // 01d: athrow
      // 01e: getfield h_s$irg.c8c D
      // 021: aload 0
      // 022: getfield h_s$irg.x7t Lh_s;
      // 025: getfield h_s.o2v D
      // 028: dsub
      // 029: dstore 2
      // 02a: aload 0
      // 02b: getfield h_s$irg.ki4 D
      // 02e: aload 0
      // 02f: getfield h_s$irg.x7t Lh_s;
      // 032: getfield h_s.kfp D
      // 035: dsub
      // 036: dstore 4
      // 038: aload 0
      // 039: getfield h_s$irg.mkj D
      // 03c: aload 0
      // 03d: getfield h_s$irg.x7t Lh_s;
      // 040: getfield h_s.vbd D
      // 043: dsub
      // 044: dstore 6
      // 046: dload 2
      // 047: dload 2
      // 048: dmul
      // 049: dload 4
      // 04b: dload 4
      // 04d: dmul
      // 04e: dadd
      // 04f: dload 6
      // 051: dload 6
      // 053: dmul
      // 054: dadd
      // 055: dstore 8
      // 057: aload 0
      // 058: dup
      // 059: getfield h_s$irg.fax I
      // 05c: dup_x1
      // 05d: bipush 1
      // 05e: isub
      // 05f: putfield h_s$irg.fax I
      // 062: iload 1
      // 063: ifeq 0ab
      // 066: ifgt 103
      // 069: goto 070
      // 06c: invokestatic h_s$irg.b (Loov;)Loov;
      // 06f: athrow
      // 070: aload 0
      // 071: dup
      // 072: getfield h_s$irg.fax I
      // 075: aload 0
      // 076: getfield h_s$irg.x7t Lh_s;
      // 079: invokevirtual h_s.mbr ()Ljava/util/Random;
      // 07c: bipush 5
      // 07d: invokevirtual java/util/Random.nextInt (I)I
      // 080: bipush 2
      // 081: iadd
      // 082: iadd
      // 083: putfield h_s$irg.fax I
      // 086: dload 8
      // 088: invokestatic fe6.dii (D)F
      // 08b: f2d
      // 08c: dstore 8
      // 08e: aload 0
      // 08f: iload 1
      // 090: ifeq 0ff
      // 093: aload 0
      // 094: getfield h_s$irg.c8c D
      // 097: aload 0
      // 098: getfield h_s$irg.ki4 D
      // 09b: aload 0
      // 09c: getfield h_s$irg.mkj D
      // 09f: dload 8
      // 0a1: invokespecial h_s$irg.x2f (DDDD)Z
      // 0a4: goto 0ab
      // 0a7: invokestatic h_s$irg.b (Loov;)Loov;
      // 0aa: athrow
      // 0ab: ifeq 0f7
      // 0ae: aload 0
      // 0af: getfield h_s$irg.x7t Lh_s;
      // 0b2: dup
      // 0b3: getfield h_s.icv D
      // 0b6: dload 2
      // 0b7: dload 8
      // 0b9: ddiv
      // 0ba: ldc2_w 0.1
      // 0bd: dmul
      // 0be: dadd
      // 0bf: putfield h_s.icv D
      // 0c2: aload 0
      // 0c3: getfield h_s$irg.x7t Lh_s;
      // 0c6: dup
      // 0c7: getfield h_s.mop D
      // 0ca: dload 4
      // 0cc: dload 8
      // 0ce: ddiv
      // 0cf: ldc2_w 0.1
      // 0d2: dmul
      // 0d3: dadd
      // 0d4: putfield h_s.mop D
      // 0d7: aload 0
      // 0d8: getfield h_s$irg.x7t Lh_s;
      // 0db: dup
      // 0dc: getfield h_s.bw4 D
      // 0df: dload 6
      // 0e1: dload 8
      // 0e3: ddiv
      // 0e4: ldc2_w 0.1
      // 0e7: dmul
      // 0e8: dadd
      // 0e9: putfield h_s.bw4 D
      // 0ec: iload 1
      // 0ed: ifne 103
      // 0f0: goto 0f7
      // 0f3: invokestatic h_s$irg.b (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: goto 0ff
      // 0fb: invokestatic h_s$irg.b (Loov;)Loov;
      // 0fe: athrow
      // 0ff: bipush 0
      // 100: putfield h_s$irg.ilc Z
      // 103: return
   }

   private boolean x2f(double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 1
      // 01: aload 0
      // 02: getfield h_s$irg.x7t Lh_s;
      // 05: getfield h_s.o2v D
      // 08: dsub
      // 09: dload 7
      // 0b: ddiv
      // 0c: dstore 10
      // 0e: dload 3
      // 0f: aload 0
      // 10: getfield h_s$irg.x7t Lh_s;
      // 13: getfield h_s.kfp D
      // 16: dsub
      // 17: dload 7
      // 19: ddiv
      // 1a: dstore 12
      // 1c: dload 5
      // 1e: aload 0
      // 1f: getfield h_s$irg.x7t Lh_s;
      // 22: getfield h_s.vbd D
      // 25: dsub
      // 26: dload 7
      // 28: ddiv
      // 29: dstore 14
      // 2b: aload 0
      // 2c: getfield h_s$irg.x7t Lh_s;
      // 2f: invokevirtual h_s.aaw ()Lnh4;
      // 32: astore 16
      // 34: invokestatic OpaquePredicate.c ()I
      // 37: bipush 1
      // 38: istore 17
      // 3a: istore 9
      // 3c: iload 17
      // 3e: i2d
      // 3f: dload 7
      // 41: dcmpg
      // 42: ifge 90
      // 45: aload 16
      // 47: dload 10
      // 49: dload 12
      // 4b: dload 14
      // 4d: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 50: astore 16
      // 52: iload 9
      // 54: ifne 8b
      // 57: aload 0
      // 58: getfield h_s$irg.x7t Lh_s;
      // 5b: getfield h_s.oay Lt9d;
      // 5e: aload 0
      // 5f: getfield h_s$irg.x7t Lh_s;
      // 62: aload 16
      // 64: invokevirtual OpaquePredicate.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 67: invokeinterface java/util/List.isEmpty ()Z 1
      // 6c: iload 9
      // 6e: ifne 91
      // 71: goto 78
      // 74: invokestatic h_s$irg.b (Loov;)Loov;
      // 77: athrow
      // 78: ifne 88
      // 7b: goto 82
      // 7e: invokestatic h_s$irg.b (Loov;)Loov;
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
      // 84: invokestatic h_s$irg.b (Loov;)Loov;
      // 87: athrow
      // 88: iinc 17 1
      // 8b: iload 9
      // 8d: ifeq 3c
      // 90: bipush 1
      // 91: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
