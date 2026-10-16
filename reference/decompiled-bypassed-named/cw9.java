public class cw9 extends u7m {
   public cw9() {
      this.qfy(uja.qqf);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 9
      // 005: aload 3
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 9
      // 00b: ifeq 019
      // 00e: ifeq 01a
      // 011: goto 018
      // 014: invokestatic cw9.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 1
      // 019: ireturn
      // 01a: aload 5
      // 01c: getstatic vt2.rf3 Lvt2;
      // 01f: if_acmpeq 028
      // 022: bipush 0
      // 023: ireturn
      // 024: invokestatic cw9.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 3
      // 029: aload 4
      // 02b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 02e: astore 10
      // 030: aload 10
      // 032: invokeinterface zfz.r_y ()Le0x; 1
      // 037: astore 11
      // 039: aload 11
      // 03b: aload 3
      // 03c: aload 4
      // 03e: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 041: istore 12
      // 043: iload 12
      // 045: iload 9
      // 047: ifeq 071
      // 04a: ifne 05b
      // 04d: goto 054
      // 050: invokestatic cw9.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 4
      // 056: invokevirtual mew.nuv ()Lmew;
      // 059: astore 4
      // 05b: aload 2
      // 05c: getfield ha9.x5k F
      // 05f: ldc 4.0
      // 061: nop
      // 062: fmul
      // 063: ldc 360.0
      // 065: nop
      // 066: fdiv
      // 067: f2d
      // 068: ldc2_w 0.5
      // 06b: dadd
      // 06c: invokestatic fe6.jqf (D)I
      // 06f: bipush 3
      // 070: iand
      // 071: istore 13
      // 073: iload 13
      // 075: invokestatic vt2.bm6 (I)Lvt2;
      // 078: astore 14
      // 07a: aload 4
      // 07c: aload 14
      // 07e: invokevirtual mew.offset (Lvt2;)Lmew;
      // 081: astore 15
      // 083: aload 2
      // 084: aload 4
      // 086: aload 5
      // 088: aload 1
      // 089: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 08c: iload 9
      // 08e: ifeq 205
      // 091: ifeq 204
      // 094: goto 09b
      // 097: invokestatic cw9.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 2
      // 09c: aload 15
      // 09e: aload 5
      // 0a0: aload 1
      // 0a1: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 0a4: iload 9
      // 0a6: ifeq 205
      // 0a9: goto 0b0
      // 0ac: invokestatic cw9.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: ifeq 204
      // 0b3: goto 0ba
      // 0b6: invokestatic cw9.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 3
      // 0bb: aload 15
      // 0bd: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0c0: invokeinterface zfz.r_y ()Le0x; 1
      // 0c5: aload 3
      // 0c6: aload 15
      // 0c8: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 0cb: istore 16
      // 0cd: iload 12
      // 0cf: iload 9
      // 0d1: ifeq 0fb
      // 0d4: ifne 0fa
      // 0d7: goto 0de
      // 0da: invokestatic cw9.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 3
      // 0df: aload 4
      // 0e1: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 0e4: iload 9
      // 0e6: ifeq 0fb
      // 0e9: goto 0f0
      // 0ec: invokestatic cw9.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: ifeq 0fe
      // 0f3: goto 0fa
      // 0f6: invokestatic cw9.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: bipush 1
      // 0fb: goto 0ff
      // 0fe: bipush 0
      // 0ff: istore 17
      // 101: iload 16
      // 103: iload 9
      // 105: ifeq 12f
      // 108: ifne 12e
      // 10b: goto 112
      // 10e: invokestatic cw9.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 3
      // 113: aload 15
      // 115: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 118: iload 9
      // 11a: ifeq 12f
      // 11d: goto 124
      // 120: invokestatic cw9.a (Loov;)Loov;
      // 123: athrow
      // 124: ifeq 132
      // 127: goto 12e
      // 12a: invokestatic cw9.a (Loov;)Loov;
      // 12d: athrow
      // 12e: bipush 1
      // 12f: goto 133
      // 132: bipush 0
      // 133: istore 18
      // 135: iload 17
      // 137: iload 9
      // 139: ifeq 203
      // 13c: ifeq 202
      // 13f: goto 146
      // 142: invokestatic cw9.a (Loov;)Loov;
      // 145: athrow
      // 146: iload 18
      // 148: iload 9
      // 14a: ifeq 203
      // 14d: goto 154
      // 150: invokestatic cw9.a (Loov;)Loov;
      // 153: athrow
      // 154: ifeq 202
      // 157: goto 15e
      // 15a: invokestatic cw9.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 3
      // 15f: aload 4
      // 161: invokevirtual mew.eve ()Lmew;
      // 164: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 167: iload 9
      // 169: ifeq 203
      // 16c: goto 173
      // 16f: invokestatic cw9.a (Loov;)Loov;
      // 172: athrow
      // 173: ifeq 202
      // 176: goto 17d
      // 179: invokestatic cw9.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 3
      // 17e: aload 15
      // 180: invokevirtual mew.eve ()Lmew;
      // 183: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 186: iload 9
      // 188: ifeq 203
      // 18b: goto 192
      // 18e: invokestatic cw9.a (Loov;)Loov;
      // 191: athrow
      // 192: ifeq 202
      // 195: goto 19c
      // 198: invokestatic cw9.a (Loov;)Loov;
      // 19b: athrow
      // 19c: getstatic ox_.a6l Le0x;
      // 19f: invokevirtual e0x.l4i ()Lzfz;
      // 1a2: getstatic _8w.hyx Lh76;
      // 1a5: bipush 0
      // 1a6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1ae: getstatic _8w.em9 Lqx_;
      // 1b1: aload 14
      // 1b3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1b8: getstatic _8w.sqt Lzb_;
      // 1bb: getstatic _8w$mc6.jen L_8w$mc6;
      // 1be: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1c3: astore 19
      // 1c5: aload 3
      // 1c6: aload 4
      // 1c8: aload 19
      // 1ca: bipush 3
      // 1cb: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1ce: iload 9
      // 1d0: ifeq 201
      // 1d3: ifeq 1f6
      // 1d6: goto 1dd
      // 1d9: invokestatic cw9.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 19
      // 1df: getstatic _8w.sqt Lzb_;
      // 1e2: getstatic _8w$mc6.ang L_8w$mc6;
      // 1e5: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1ea: astore 20
      // 1ec: aload 3
      // 1ed: aload 15
      // 1ef: aload 20
      // 1f1: bipush 3
      // 1f2: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 1f5: pop
      // 1f6: aload 1
      // 1f7: dup
      // 1f8: getfield erg.qd2 I
      // 1fb: bipush 1
      // 1fc: isub
      // 1fd: putfield erg.qd2 I
      // 200: bipush 1
      // 201: ireturn
      // 202: bipush 0
      // 203: ireturn
      // 204: bipush 0
      // 205: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
