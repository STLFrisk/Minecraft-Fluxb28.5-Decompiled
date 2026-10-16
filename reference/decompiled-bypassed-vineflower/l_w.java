public class l_w extends vrx {
   private final z0_ jq6;
   private final ha9 zfa;
   private int fxw;

   public l_w(ha9 var1, z0_ var2, rsi var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.zfa = var1;
      this.jq6 = var2;
   }

   @Override
   public boolean xvl(erg var1) {
      return false;
   }

   @Override
   public erg xtx(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 32
      // 09: invokevirtual l_w.hf8 ()Z
      // 0c: ifeq 31
      // 0f: goto 16
      // 12: invokestatic l_w.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: dup
      // 18: getfield l_w.fxw I
      // 1b: iload 1
      // 1c: aload 0
      // 1d: invokevirtual l_w.x4s ()Lerg;
      // 20: getfield erg.qd2 I
      // 23: invokestatic java/lang/Math.min (II)I
      // 26: iadd
      // 27: putfield l_w.fxw I
      // 2a: goto 31
      // 2d: invokestatic l_w.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: iload 1
      // 33: invokespecial vrx.xtx (I)Lerg;
      // 36: areturn
   }

   @Override
   public void f2o(erg var1, int var2) {
      this.fxw += var2;
      this.erq(var1);
   }

   @Override
   public void erq(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 031
      // 009: getfield l_w.fxw I
      // 00c: ifle 030
      // 00f: goto 016
      // 012: invokestatic l_w.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 1
      // 017: aload 0
      // 018: getfield l_w.zfa Lha9;
      // 01b: getfield ha9.oay Lt9d;
      // 01e: aload 0
      // 01f: getfield l_w.zfa Lha9;
      // 022: aload 0
      // 023: getfield l_w.fxw I
      // 026: invokevirtual erg.fie (Lt9d;Lha9;I)V
      // 029: goto 030
      // 02c: invokestatic l_w.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: bipush 0
      // 032: putfield l_w.fxw I
      // 035: aload 1
      // 036: invokevirtual erg.gn1 ()Lu7m;
      // 039: iload 2
      // 03a: ifeq 062
      // 03d: getstatic ox_.nxz Le0x;
      // 040: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 043: if_acmpne 05e
      // 046: goto 04d
      // 049: invokestatic l_w.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield l_w.zfa Lha9;
      // 051: getstatic y8d.bfm Ll7l;
      // 054: invokevirtual ha9.aex (L_ss;)V
      // 057: goto 05e
      // 05a: invokestatic l_w.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 1
      // 05f: invokevirtual erg.gn1 ()Lu7m;
      // 062: iload 2
      // 063: ifeq 088
      // 066: instanceof f5h
      // 069: ifeq 084
      // 06c: goto 073
      // 06f: invokestatic l_w.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield l_w.zfa Lha9;
      // 077: getstatic y8d.z56 Ll7l;
      // 07a: invokevirtual ha9.aex (L_ss;)V
      // 07d: goto 084
      // 080: invokestatic l_w.a (Loov;)Loov;
      // 083: athrow
      // 084: aload 1
      // 085: invokevirtual erg.gn1 ()Lu7m;
      // 088: iload 2
      // 089: ifeq 0b1
      // 08c: getstatic ox_.o16 Le0x;
      // 08f: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 092: if_acmpne 0ad
      // 095: goto 09c
      // 098: invokestatic l_w.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield l_w.zfa Lha9;
      // 0a0: getstatic y8d.o4a Ll7l;
      // 0a3: invokevirtual ha9.aex (L_ss;)V
      // 0a6: goto 0ad
      // 0a9: invokestatic l_w.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 1
      // 0ae: invokevirtual erg.gn1 ()Lu7m;
      // 0b1: iload 2
      // 0b2: ifeq 0d7
      // 0b5: instanceof d1x
      // 0b8: ifeq 0d3
      // 0bb: goto 0c2
      // 0be: invokestatic l_w.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield l_w.zfa Lha9;
      // 0c6: getstatic y8d.yjc Ll7l;
      // 0c9: invokevirtual ha9.aex (L_ss;)V
      // 0cc: goto 0d3
      // 0cf: invokestatic l_w.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 1
      // 0d4: invokevirtual erg.gn1 ()Lu7m;
      // 0d7: getstatic xbr.nfb Lu7m;
      // 0da: iload 2
      // 0db: ifeq 10b
      // 0de: if_acmpne 0f9
      // 0e1: goto 0e8
      // 0e4: invokestatic l_w.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: getfield l_w.zfa Lha9;
      // 0ec: getstatic y8d.uq4 Ll7l;
      // 0ef: invokevirtual ha9.aex (L_ss;)V
      // 0f2: goto 0f9
      // 0f5: invokestatic l_w.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: invokevirtual erg.gn1 ()Lu7m;
      // 0fd: iload 2
      // 0fe: ifeq 123
      // 101: getstatic xbr.bsd Lu7m;
      // 104: goto 10b
      // 107: invokestatic l_w.a (Loov;)Loov;
      // 10a: athrow
      // 10b: if_acmpne 11f
      // 10e: aload 0
      // 10f: getfield l_w.zfa Lha9;
      // 112: getstatic y8d.n8p Ll7l;
      // 115: invokevirtual ha9.aex (L_ss;)V
      // 118: goto 11f
      // 11b: invokestatic l_w.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 1
      // 120: invokevirtual erg.gn1 ()Lu7m;
      // 123: instanceof f5h
      // 126: iload 2
      // 127: ifeq 179
      // 12a: ifeq 167
      // 12d: goto 134
      // 130: invokestatic l_w.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 1
      // 135: invokevirtual erg.gn1 ()Lu7m;
      // 138: checkcast f5h
      // 13b: iload 2
      // 13c: ifeq 16b
      // 13f: goto 146
      // 142: invokestatic l_w.a (Loov;)Loov;
      // 145: athrow
      // 146: invokevirtual f5h.mc4 ()Lu7m$vz9;
      // 149: getstatic u7m$vz9.dsi Lu7m$vz9;
      // 14c: if_acmpeq 167
      // 14f: goto 156
      // 152: invokestatic l_w.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 0
      // 157: getfield l_w.zfa Lha9;
      // 15a: getstatic y8d.n2y Ll7l;
      // 15d: invokevirtual ha9.aex (L_ss;)V
      // 160: goto 167
      // 163: invokestatic l_w.a (Loov;)Loov;
      // 166: athrow
      // 167: aload 1
      // 168: invokevirtual erg.gn1 ()Lu7m;
      // 16b: iload 2
      // 16c: ifeq 191
      // 16f: instanceof za6
      // 172: goto 179
      // 175: invokestatic l_w.a (Loov;)Loov;
      // 178: athrow
      // 179: ifeq 18d
      // 17c: aload 0
      // 17d: getfield l_w.zfa Lha9;
      // 180: getstatic y8d.ste Ll7l;
      // 183: invokevirtual ha9.aex (L_ss;)V
      // 186: goto 18d
      // 189: invokestatic l_w.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 1
      // 18e: invokevirtual erg.gn1 ()Lu7m;
      // 191: getstatic ox_.ozm Le0x;
      // 194: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 197: iload 2
      // 198: ifeq 1c0
      // 19b: if_acmpne 1b6
      // 19e: goto 1a5
      // 1a1: invokestatic l_w.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: getfield l_w.zfa Lha9;
      // 1a9: getstatic y8d.j0w Ll7l;
      // 1ac: invokevirtual ha9.aex (L_ss;)V
      // 1af: goto 1b6
      // 1b2: invokestatic l_w.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: aload 1
      // 1b7: invokevirtual erg.gn1 ()Lu7m;
      // 1ba: getstatic ox_.kzr Le0x;
      // 1bd: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 1c0: iload 2
      // 1c1: ifeq 1f1
      // 1c4: if_acmpne 1df
      // 1c7: goto 1ce
      // 1ca: invokestatic l_w.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: getfield l_w.zfa Lha9;
      // 1d2: getstatic y8d.jx3 Ll7l;
      // 1d5: invokevirtual ha9.aex (L_ss;)V
      // 1d8: goto 1df
      // 1db: invokestatic l_w.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 1
      // 1e0: iload 2
      // 1e1: ifeq 1f5
      // 1e4: invokevirtual erg.gn1 ()Lu7m;
      // 1e7: getstatic xbr.yyh Lu7m;
      // 1ea: goto 1f1
      // 1ed: invokestatic l_w.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: if_acmpne 20d
      // 1f4: aload 1
      // 1f5: invokevirtual erg.j6_ ()I
      // 1f8: bipush 1
      // 1f9: if_icmpne 20d
      // 1fc: aload 0
      // 1fd: getfield l_w.zfa Lha9;
      // 200: getstatic y8d.r06 Ll7l;
      // 203: invokevirtual ha9.aex (L_ss;)V
      // 206: goto 20d
      // 209: invokestatic l_w.a (Loov;)Loov;
      // 20c: athrow
      // 20d: return
   }

   @Override
   public void g1d(ha9 param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 2
      // 02: invokevirtual l_w.erq (Lerg;)V
      // 05: invokestatic t9d.b ()I
      // 08: invokestatic opt.c4k ()Lopt;
      // 0b: aload 0
      // 0c: getfield l_w.jq6 Lz0_;
      // 0f: aload 1
      // 10: getfield ha9.oay Lt9d;
      // 13: invokevirtual opt.a6x (Lz0_;Lt9d;)[Lerg;
      // 16: astore 4
      // 18: istore 3
      // 19: bipush 0
      // 1a: istore 5
      // 1c: iload 5
      // 1e: aload 4
      // 20: arraylength
      // 21: if_icmpge d6
      // 24: aload 0
      // 25: getfield l_w.jq6 Lz0_;
      // 28: iload 5
      // 2a: invokevirtual z0_.ibn (I)Lerg;
      // 2d: astore 6
      // 2f: aload 4
      // 31: iload 5
      // 33: aaload
      // 34: astore 7
      // 36: aload 6
      // 38: iload 3
      // 39: ifeq 5a
      // 3c: ifnull 58
      // 3f: goto 46
      // 42: invokestatic l_w.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getfield l_w.jq6 Lz0_;
      // 4a: iload 5
      // 4c: bipush 1
      // 4d: invokevirtual z0_.afc (II)Lerg;
      // 50: pop
      // 51: goto 58
      // 54: invokestatic l_w.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 7
      // 5a: iload 3
      // 5b: ifeq 83
      // 5e: ifnull cf
      // 61: goto 68
      // 64: invokestatic l_w.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: iload 3
      // 6a: ifeq a4
      // 6d: goto 74
      // 70: invokestatic l_w.a (Loov;)Loov;
      // 73: athrow
      // 74: getfield l_w.jq6 Lz0_;
      // 77: iload 5
      // 79: invokevirtual z0_.ibn (I)Lerg;
      // 7c: goto 83
      // 7f: invokestatic l_w.a (Loov;)Loov;
      // 82: athrow
      // 83: ifnonnull 9c
      // 86: aload 0
      // 87: getfield l_w.jq6 Lz0_;
      // 8a: iload 5
      // 8c: aload 7
      // 8e: invokevirtual z0_.cxl (ILerg;)V
      // 91: iload 3
      // 92: ifne cf
      // 95: goto 9c
      // 98: invokestatic l_w.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: goto a4
      // a0: invokestatic l_w.a (Loov;)Loov;
      // a3: athrow
      // a4: getfield l_w.zfa Lha9;
      // a7: iload 3
      // a8: ifeq c8
      // ab: getfield ha9.up_ Ljnq;
      // ae: aload 7
      // b0: invokevirtual jnq.phd (Lerg;)Z
      // b3: ifne cf
      // b6: goto bd
      // b9: invokestatic l_w.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 0
      // be: getfield l_w.zfa Lha9;
      // c1: goto c8
      // c4: invokestatic l_w.a (Loov;)Loov;
      // c7: athrow
      // c8: aload 7
      // ca: bipush 0
      // cb: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // ce: pop
      // cf: iinc 5 1
      // d2: iload 3
      // d3: ifne 1c
      // d6: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
