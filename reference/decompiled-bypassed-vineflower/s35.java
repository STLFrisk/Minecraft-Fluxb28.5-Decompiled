import java.util.Random;

public class s35 extends cdu {
   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 3
      // 006: invokevirtual mew.getY ()I
      // 009: sipush 128
      // 00c: if_icmpge 126
      // 00f: aload 1
      // 010: aload 3
      // 011: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 014: iload 4
      // 016: ifne 127
      // 019: ifeq 100
      // 01c: goto 023
      // 01f: invokestatic s35.a (Loov;)Loov;
      // 022: athrow
      // 023: getstatic vt2$unz.fzl Lvt2$unz;
      // 026: invokevirtual vt2$unz.qn1 ()[Lvt2;
      // 029: astore 5
      // 02b: aload 5
      // 02d: arraylength
      // 02e: istore 6
      // 030: bipush 0
      // 031: istore 7
      // 033: iload 7
      // 035: iload 6
      // 037: if_icmpge 0fb
      // 03a: aload 5
      // 03c: iload 7
      // 03e: aaload
      // 03f: astore 8
      // 041: iload 4
      // 043: ifne 0f6
      // 046: getstatic ox_.s25 Le0x;
      // 049: aload 1
      // 04a: aload 3
      // 04b: aload 8
      // 04d: invokevirtual e0x.d9o (Lt9d;Lmew;Lvt2;)Z
      // 050: iload 4
      // 052: ifne 009
      // 055: goto 05c
      // 058: invokestatic s35.a (Loov;)Loov;
      // 05b: athrow
      // 05c: ifeq 0ec
      // 05f: getstatic ox_.s25 Le0x;
      // 062: invokevirtual e0x.l4i ()Lzfz;
      // 065: getstatic pcl.qme Lh76;
      // 068: aload 8
      // 06a: getstatic vt2.z9q Lvt2;
      // 06d: if_acmpne 07f
      // 070: goto 077
      // 073: invokestatic s35.a (Loov;)Loov;
      // 076: athrow
      // 077: bipush 1
      // 078: goto 080
      // 07b: invokestatic s35.a (Loov;)Loov;
      // 07e: athrow
      // 07f: bipush 0
      // 080: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 083: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 088: getstatic pcl.t6u Lh76;
      // 08b: aload 8
      // 08d: getstatic vt2.zk4 Lvt2;
      // 090: if_acmpne 09b
      // 093: bipush 1
      // 094: goto 09c
      // 097: invokestatic s35.a (Loov;)Loov;
      // 09a: athrow
      // 09b: bipush 0
      // 09c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 09f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0a4: getstatic pcl.leq Lh76;
      // 0a7: aload 8
      // 0a9: getstatic vt2.mxp Lvt2;
      // 0ac: if_acmpne 0b7
      // 0af: bipush 1
      // 0b0: goto 0b8
      // 0b3: invokestatic s35.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: bipush 0
      // 0b8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0bb: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0c0: getstatic pcl.m4e Lh76;
      // 0c3: aload 8
      // 0c5: getstatic vt2.te4 Lvt2;
      // 0c8: if_acmpne 0d3
      // 0cb: bipush 1
      // 0cc: goto 0d4
      // 0cf: invokestatic s35.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: bipush 0
      // 0d4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d7: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0dc: astore 9
      // 0de: aload 1
      // 0df: aload 3
      // 0e0: aload 9
      // 0e2: bipush 2
      // 0e3: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0e6: pop
      // 0e7: iload 4
      // 0e9: ifeq 0fb
      // 0ec: iinc 7 1
      // 0ef: goto 0f6
      // 0f2: invokestatic s35.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: iload 4
      // 0f8: ifeq 033
      // 0fb: iload 4
      // 0fd: ifeq 11c
      // 100: aload 3
      // 101: aload 2
      // 102: bipush 4
      // 103: invokevirtual java/util/Random.nextInt (I)I
      // 106: aload 2
      // 107: bipush 4
      // 108: invokevirtual java/util/Random.nextInt (I)I
      // 10b: isub
      // 10c: bipush 0
      // 10d: aload 2
      // 10e: bipush 4
      // 10f: invokevirtual java/util/Random.nextInt (I)I
      // 112: aload 2
      // 113: bipush 4
      // 114: invokevirtual java/util/Random.nextInt (I)I
      // 117: isub
      // 118: invokevirtual mew.ec4 (III)Lmew;
      // 11b: astore 3
      // 11c: aload 3
      // 11d: invokevirtual mew.nuv ()Lmew;
      // 120: astore 3
      // 121: iload 4
      // 123: ifeq 005
      // 126: bipush 1
      // 127: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
