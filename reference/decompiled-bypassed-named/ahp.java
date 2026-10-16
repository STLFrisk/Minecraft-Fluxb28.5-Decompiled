import java.util.Random;

public class ahp extends ffn {
   public ahp(zfz var1, zfz var2) {
      super(false);
      this.es3 = var1;
      this.c6z = var2;
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 00a: invokeinterface zfz.r_y ()Le0x; 1
      // 00f: dup
      // 010: astore 5
      // 012: invokevirtual e0x.p1r ()Lp3y;
      // 015: getstatic p3y.cei Lp3y;
      // 018: if_acmpeq 03e
      // 01b: aload 5
      // 01d: iload 4
      // 01f: ifne 073
      // 022: iload 4
      // 024: ifne 073
      // 027: goto 02e
      // 02a: invokestatic ahp.a (Loov;)Loov;
      // 02d: athrow
      // 02e: invokevirtual e0x.p1r ()Lp3y;
      // 031: getstatic p3y.hh1 Lp3y;
      // 034: if_acmpne 069
      // 037: goto 03e
      // 03a: invokestatic ahp.a (Loov;)Loov;
      // 03d: athrow
      // 03e: aload 3
      // 03f: iload 4
      // 041: ifne 063
      // 044: goto 04b
      // 047: invokestatic ahp.a (Loov;)Loov;
      // 04a: athrow
      // 04b: invokevirtual mew.getY ()I
      // 04e: ifle 069
      // 051: goto 058
      // 054: invokestatic ahp.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 3
      // 059: invokevirtual mew.eve ()Lmew;
      // 05c: goto 063
      // 05f: invokestatic ahp.a (Loov;)Loov;
      // 062: athrow
      // 063: astore 3
      // 064: iload 4
      // 066: ifeq 005
      // 069: aload 1
      // 06a: aload 3
      // 06b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 06e: invokeinterface zfz.r_y ()Le0x; 1
      // 073: astore 6
      // 075: iload 4
      // 077: ifne 0a7
      // 07a: aload 6
      // 07c: getstatic ox_.kqk Le0x;
      // 07f: if_acmpeq 098
      // 082: goto 089
      // 085: invokestatic ahp.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 6
      // 08b: getstatic ox_.l11 Lx82;
      // 08e: if_acmpne 1aa
      // 091: goto 098
      // 094: invokestatic ahp.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 3
      // 099: invokevirtual mew.nuv ()Lmew;
      // 09c: astore 3
      // 09d: aload 0
      // 09e: aload 1
      // 09f: aload 3
      // 0a0: aload 0
      // 0a1: getfield ahp.es3 Lzfz;
      // 0a4: invokevirtual ahp.u0f (Lt9d;Lmew;Lzfz;)V
      // 0a7: aload 3
      // 0a8: invokevirtual mew.getY ()I
      // 0ab: istore 7
      // 0ad: iload 7
      // 0af: aload 3
      // 0b0: invokevirtual mew.getY ()I
      // 0b3: bipush 2
      // 0b4: iadd
      // 0b5: if_icmpgt 1aa
      // 0b8: iload 7
      // 0ba: aload 3
      // 0bb: invokevirtual mew.getY ()I
      // 0be: isub
      // 0bf: istore 8
      // 0c1: bipush 2
      // 0c2: iload 8
      // 0c4: isub
      // 0c5: istore 9
      // 0c7: aload 3
      // 0c8: invokevirtual mew.getX ()I
      // 0cb: iload 9
      // 0cd: isub
      // 0ce: iload 4
      // 0d0: ifne 1ab
      // 0d3: istore 10
      // 0d5: iload 10
      // 0d7: aload 3
      // 0d8: invokevirtual mew.getX ()I
      // 0db: iload 9
      // 0dd: iadd
      // 0de: if_icmpgt 1a2
      // 0e1: iload 10
      // 0e3: aload 3
      // 0e4: invokevirtual mew.getX ()I
      // 0e7: isub
      // 0e8: istore 11
      // 0ea: aload 3
      // 0eb: invokevirtual mew.getZ ()I
      // 0ee: iload 9
      // 0f0: isub
      // 0f1: iload 4
      // 0f3: ifne 0af
      // 0f6: istore 12
      // 0f8: iload 12
      // 0fa: aload 3
      // 0fb: invokevirtual mew.getZ ()I
      // 0fe: iload 9
      // 100: iadd
      // 101: if_icmpgt 19a
      // 104: iload 12
      // 106: aload 3
      // 107: invokevirtual mew.getZ ()I
      // 10a: isub
      // 10b: istore 13
      // 10d: iload 11
      // 10f: invokestatic java/lang/Math.abs (I)I
      // 112: iload 9
      // 114: iload 4
      // 116: ifne 0de
      // 119: iload 4
      // 11b: ifne 142
      // 11e: if_icmpne 154
      // 121: goto 128
      // 124: invokestatic ahp.a (Loov;)Loov;
      // 127: athrow
      // 128: iload 13
      // 12a: invokestatic java/lang/Math.abs (I)I
      // 12d: iload 4
      // 12f: ifne 151
      // 132: goto 139
      // 135: invokestatic ahp.a (Loov;)Loov;
      // 138: athrow
      // 139: iload 9
      // 13b: goto 142
      // 13e: invokestatic ahp.a (Loov;)Loov;
      // 141: athrow
      // 142: if_icmpne 154
      // 145: aload 2
      // 146: bipush 2
      // 147: invokevirtual java/util/Random.nextInt (I)I
      // 14a: goto 151
      // 14d: invokestatic ahp.a (Loov;)Loov;
      // 150: athrow
      // 151: ifeq 192
      // 154: new mew
      // 157: dup
      // 158: iload 10
      // 15a: iload 7
      // 15c: iload 12
      // 15e: invokespecial mew.<init> (III)V
      // 161: astore 14
      // 163: iload 4
      // 165: ifne 195
      // 168: aload 1
      // 169: aload 14
      // 16b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 16e: invokeinterface zfz.r_y ()Le0x; 1
      // 173: invokevirtual e0x.z4c ()Z
      // 176: ifne 192
      // 179: goto 180
      // 17c: invokestatic ahp.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: aload 1
      // 182: aload 14
      // 184: aload 0
      // 185: getfield ahp.c6z Lzfz;
      // 188: invokevirtual ahp.u0f (Lt9d;Lmew;Lzfz;)V
      // 18b: goto 192
      // 18e: invokestatic ahp.a (Loov;)Loov;
      // 191: athrow
      // 192: iinc 12 1
      // 195: iload 4
      // 197: ifeq 0f8
      // 19a: iinc 10 1
      // 19d: iload 4
      // 19f: ifeq 0d5
      // 1a2: iinc 7 1
      // 1a5: iload 4
      // 1a7: ifeq 0ad
      // 1aa: bipush 1
      // 1ab: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
