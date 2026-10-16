import java.util.Random;

public class h_q extends cdu {
   public h_q(int var1) {
      this.s79 = var1;
   }

   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 00a: ifeq 03e
      // 00d: aload 3
      // 00e: iload 4
      // 010: ifeq 038
      // 013: invokevirtual mew.getY ()I
      // 016: bipush 2
      // 017: iload 4
      // 019: ifeq 05f
      // 01c: goto 023
      // 01f: invokestatic h_q.a (Loov;)Loov;
      // 022: athrow
      // 023: if_icmple 03e
      // 026: goto 02d
      // 029: invokestatic h_q.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 3
      // 02e: invokevirtual mew.eve ()Lmew;
      // 031: goto 038
      // 034: invokestatic h_q.a (Loov;)Loov;
      // 037: athrow
      // 038: astore 3
      // 039: iload 4
      // 03b: ifne 005
      // 03e: aload 1
      // 03f: aload 3
      // 040: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 043: invokeinterface zfz.r_y ()Le0x; 1
      // 048: getstatic ox_._mc Le0x;
      // 04b: if_acmpeq 054
      // 04e: bipush 0
      // 04f: ireturn
      // 050: invokestatic h_q.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 2
      // 055: aload 0
      // 056: getfield h_q.s79 I
      // 059: bipush 2
      // 05a: isub
      // 05b: invokevirtual java/util/Random.nextInt (I)I
      // 05e: bipush 2
      // 05f: iadd
      // 060: istore 5
      // 062: bipush 1
      // 063: istore 6
      // 065: aload 3
      // 066: invokevirtual mew.getX ()I
      // 069: iload 5
      // 06b: isub
      // 06c: istore 7
      // 06e: iload 7
      // 070: aload 3
      // 071: invokevirtual mew.getX ()I
      // 074: iload 5
      // 076: iadd
      // 077: if_icmpgt 173
      // 07a: aload 3
      // 07b: invokevirtual mew.getZ ()I
      // 07e: iload 5
      // 080: isub
      // 081: iload 4
      // 083: ifeq 174
      // 086: istore 8
      // 088: iload 8
      // 08a: aload 3
      // 08b: invokevirtual mew.getZ ()I
      // 08e: iload 5
      // 090: iadd
      // 091: if_icmpgt 16b
      // 094: iload 7
      // 096: aload 3
      // 097: invokevirtual mew.getX ()I
      // 09a: isub
      // 09b: istore 9
      // 09d: iload 8
      // 09f: aload 3
      // 0a0: invokevirtual mew.getZ ()I
      // 0a3: isub
      // 0a4: istore 10
      // 0a6: iload 4
      // 0a8: ifeq 166
      // 0ab: iload 9
      // 0ad: iload 9
      // 0af: imul
      // 0b0: iload 10
      // 0b2: iload 10
      // 0b4: imul
      // 0b5: iadd
      // 0b6: iload 5
      // 0b8: iload 5
      // 0ba: imul
      // 0bb: iload 4
      // 0bd: ifeq 077
      // 0c0: goto 0c7
      // 0c3: invokestatic h_q.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: if_icmpgt 163
      // 0ca: aload 3
      // 0cb: invokevirtual mew.getY ()I
      // 0ce: iload 6
      // 0d0: isub
      // 0d1: istore 11
      // 0d3: iload 11
      // 0d5: aload 3
      // 0d6: invokevirtual mew.getY ()I
      // 0d9: iload 6
      // 0db: iadd
      // 0dc: if_icmpgt 163
      // 0df: new mew
      // 0e2: dup
      // 0e3: iload 7
      // 0e5: iload 11
      // 0e7: iload 8
      // 0e9: invokespecial mew.<init> (III)V
      // 0ec: astore 12
      // 0ee: aload 1
      // 0ef: aload 12
      // 0f1: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0f4: invokeinterface zfz.r_y ()Le0x; 1
      // 0f9: astore 13
      // 0fb: iload 4
      // 0fd: ifeq 166
      // 100: aload 13
      // 102: getstatic ox_.kqk Le0x;
      // 105: iload 4
      // 107: ifeq 127
      // 10a: goto 111
      // 10d: invokestatic h_q.a (Loov;)Loov;
      // 110: athrow
      // 111: if_acmpeq 145
      // 114: goto 11b
      // 117: invokestatic h_q.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 13
      // 11d: getstatic ox_._mc Le0x;
      // 120: goto 127
      // 123: invokestatic h_q.a (Loov;)Loov;
      // 126: athrow
      // 127: iload 4
      // 129: ifeq 142
      // 12c: if_acmpeq 145
      // 12f: goto 136
      // 132: invokestatic h_q.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 13
      // 138: getstatic ox_.f02 Le0x;
      // 13b: goto 142
      // 13e: invokestatic h_q.a (Loov;)Loov;
      // 141: athrow
      // 142: if_acmpne 15b
      // 145: aload 1
      // 146: aload 12
      // 148: aload 0
      // 149: getfield h_q.u0b Le0x;
      // 14c: invokevirtual e0x.l4i ()Lzfz;
      // 14f: bipush 2
      // 150: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 153: pop
      // 154: goto 15b
      // 157: invokestatic h_q.a (Loov;)Loov;
      // 15a: athrow
      // 15b: iinc 11 1
      // 15e: iload 4
      // 160: ifne 0d3
      // 163: iinc 8 1
      // 166: iload 4
      // 168: ifne 088
      // 16b: iinc 7 1
      // 16e: iload 4
      // 170: ifne 06e
      // 173: bipush 1
      // 174: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
