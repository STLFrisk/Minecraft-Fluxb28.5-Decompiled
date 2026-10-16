public class aud extends ttt {
   public aud(long var1, ttt var3, ttt var4) {
      super(var1);
      this.b0j = var3;
      this.c68 = var4;
   }

   @Override
   public void uz5(long var1) {
      this.b0j.uz5(var1);
      this.c68.uz5(var1);
      super.uz5(var1);
   }

   @Override
   public int[] ub9(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield aud.b0j Lttt;
      // 004: iload 1
      // 005: iload 2
      // 006: iload 3
      // 007: iload 4
      // 009: invokevirtual ttt.ub9 (IIII)[I
      // 00c: astore 6
      // 00e: invokestatic t9d.b ()I
      // 011: aload 0
      // 012: getfield aud.c68 Lttt;
      // 015: iload 1
      // 016: iload 2
      // 017: iload 3
      // 018: iload 4
      // 01a: invokevirtual ttt.ub9 (IIII)[I
      // 01d: astore 7
      // 01f: iload 3
      // 020: iload 4
      // 022: imul
      // 023: invokestatic z97.web (I)[I
      // 026: astore 8
      // 028: istore 5
      // 02a: bipush 0
      // 02b: istore 9
      // 02d: iload 9
      // 02f: iload 3
      // 030: iload 4
      // 032: imul
      // 033: if_icmpge 178
      // 036: aload 6
      // 038: iload 5
      // 03a: ifeq 17a
      // 03d: iload 9
      // 03f: iload 5
      // 041: ifeq 16a
      // 044: goto 04b
      // 047: invokestatic aud.a (Loov;)Loov;
      // 04a: athrow
      // 04b: iaload
      // 04c: getstatic gyu.jzy Lgyu;
      // 04f: getfield gyu.mu9 I
      // 052: if_icmpeq 15f
      // 055: goto 05c
      // 058: invokestatic aud.a (Loov;)Loov;
      // 05b: athrow
      // 05c: aload 6
      // 05e: iload 9
      // 060: iload 5
      // 062: ifeq 16a
      // 065: goto 06c
      // 068: invokestatic aud.a (Loov;)Loov;
      // 06b: athrow
      // 06c: iaload
      // 06d: getstatic gyu.knf Lgyu;
      // 070: getfield gyu.mu9 I
      // 073: if_icmpeq 15f
      // 076: goto 07d
      // 079: invokestatic aud.a (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 7
      // 07f: iload 9
      // 081: iload 5
      // 083: ifeq 154
      // 086: goto 08d
      // 089: invokestatic aud.a (Loov;)Loov;
      // 08c: athrow
      // 08d: iaload
      // 08e: getstatic gyu.sgl Lgyu;
      // 091: getfield gyu.mu9 I
      // 094: if_icmpne 149
      // 097: goto 09e
      // 09a: invokestatic aud.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 6
      // 0a0: iload 9
      // 0a2: iaload
      // 0a3: getstatic gyu.rv2 Lgyu;
      // 0a6: getfield gyu.mu9 I
      // 0a9: iload 5
      // 0ab: ifeq 0f4
      // 0ae: goto 0b5
      // 0b1: invokestatic aud.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: if_icmpne 0d6
      // 0b8: goto 0bf
      // 0bb: invokestatic aud.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 8
      // 0c1: iload 9
      // 0c3: getstatic gyu.wrz Lgyu;
      // 0c6: getfield gyu.mu9 I
      // 0c9: iastore
      // 0ca: iload 5
      // 0cc: ifne 170
      // 0cf: goto 0d6
      // 0d2: invokestatic aud.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 6
      // 0d8: iload 9
      // 0da: iload 5
      // 0dc: ifeq 13d
      // 0df: goto 0e6
      // 0e2: invokestatic aud.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: iaload
      // 0e7: getstatic gyu._2p Lgyu;
      // 0ea: getfield gyu.mu9 I
      // 0ed: goto 0f4
      // 0f0: invokestatic aud.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: if_icmpeq 132
      // 0f7: aload 6
      // 0f9: iload 9
      // 0fb: iload 5
      // 0fd: ifeq 13d
      // 100: goto 107
      // 103: invokestatic aud.a (Loov;)Loov;
      // 106: athrow
      // 107: iaload
      // 108: getstatic gyu.mcb Lgyu;
      // 10b: getfield gyu.mu9 I
      // 10e: if_icmpeq 132
      // 111: goto 118
      // 114: invokestatic aud.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 8
      // 11a: iload 9
      // 11c: aload 7
      // 11e: iload 9
      // 120: iaload
      // 121: sipush 255
      // 124: iand
      // 125: iastore
      // 126: iload 5
      // 128: ifne 170
      // 12b: goto 132
      // 12e: invokestatic aud.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 8
      // 134: iload 9
      // 136: goto 13d
      // 139: invokestatic aud.a (Loov;)Loov;
      // 13c: athrow
      // 13d: getstatic gyu.mcb Lgyu;
      // 140: getfield gyu.mu9 I
      // 143: iastore
      // 144: iload 5
      // 146: ifne 170
      // 149: aload 8
      // 14b: iload 9
      // 14d: goto 154
      // 150: invokestatic aud.a (Loov;)Loov;
      // 153: athrow
      // 154: aload 6
      // 156: iload 9
      // 158: iaload
      // 159: iastore
      // 15a: iload 5
      // 15c: ifne 170
      // 15f: aload 8
      // 161: iload 9
      // 163: goto 16a
      // 166: invokestatic aud.a (Loov;)Loov;
      // 169: athrow
      // 16a: aload 6
      // 16c: iload 9
      // 16e: iaload
      // 16f: iastore
      // 170: iinc 9 1
      // 173: iload 5
      // 175: ifne 02d
      // 178: aload 8
      // 17a: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
