public class tp4 implements m5n {
   public int mhd;
   public int _75;
   public tts[][] rxz;
   public boolean wve;
   public OpaquePredicate plo;

   public tp4(OpaquePredicate param1, mew param2, mew param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: aload 0
      // 005: aload 1
      // 006: putfield tp4.plo Lt9d;
      // 009: aload 0
      // 00a: aload 2
      // 00b: invokevirtual mew.getX ()I
      // 00e: iload 4
      // 010: isub
      // 011: bipush 4
      // 012: ishr
      // 013: putfield tp4.mhd I
      // 016: invokestatic OpaquePredicate.b ()I
      // 019: aload 0
      // 01a: aload 2
      // 01b: invokevirtual mew.getZ ()I
      // 01e: iload 4
      // 020: isub
      // 021: bipush 4
      // 022: ishr
      // 023: putfield tp4._75 I
      // 026: istore 5
      // 028: aload 3
      // 029: invokevirtual mew.getX ()I
      // 02c: iload 4
      // 02e: iadd
      // 02f: bipush 4
      // 030: ishr
      // 031: istore 6
      // 033: aload 3
      // 034: invokevirtual mew.getZ ()I
      // 037: iload 4
      // 039: iadd
      // 03a: bipush 4
      // 03b: ishr
      // 03c: istore 7
      // 03e: aload 0
      // 03f: iload 6
      // 041: aload 0
      // 042: getfield tp4.mhd I
      // 045: isub
      // 046: bipush 1
      // 047: iadd
      // 048: iload 7
      // 04a: aload 0
      // 04b: getfield tp4._75 I
      // 04e: isub
      // 04f: bipush 1
      // 050: iadd
      // 051: multianewarray 41 2
      // 055: putfield tp4.rxz [[Ltts;
      // 058: aload 0
      // 059: bipush 1
      // 05a: putfield tp4.wve Z
      // 05d: aload 0
      // 05e: getfield tp4.mhd I
      // 061: istore 8
      // 063: iload 8
      // 065: iload 6
      // 067: if_icmpgt 0b4
      // 06a: aload 0
      // 06b: getfield tp4._75 I
      // 06e: iload 5
      // 070: ifeq 0ba
      // 073: istore 9
      // 075: iload 9
      // 077: iload 7
      // 079: if_icmpgt 0ac
      // 07c: aload 0
      // 07d: getfield tp4.rxz [[Ltts;
      // 080: iload 8
      // 082: aload 0
      // 083: getfield tp4.mhd I
      // 086: isub
      // 087: aaload
      // 088: iload 9
      // 08a: aload 0
      // 08b: getfield tp4._75 I
      // 08e: isub
      // 08f: aload 1
      // 090: iload 8
      // 092: iload 9
      // 094: invokevirtual OpaquePredicate.o5h (II)Ltts;
      // 097: aastore
      // 098: iinc 9 1
      // 09b: iload 5
      // 09d: ifeq 0af
      // 0a0: iload 5
      // 0a2: ifne 075
      // 0a5: goto 0ac
      // 0a8: invokestatic tp4.b (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iinc 8 1
      // 0af: iload 5
      // 0b1: ifne 063
      // 0b4: aload 2
      // 0b5: invokevirtual mew.getX ()I
      // 0b8: bipush 4
      // 0b9: ishr
      // 0ba: istore 8
      // 0bc: iload 8
      // 0be: aload 3
      // 0bf: invokevirtual mew.getX ()I
      // 0c2: bipush 4
      // 0c3: ishr
      // 0c4: if_icmpgt 140
      // 0c7: aload 2
      // 0c8: invokevirtual mew.getZ ()I
      // 0cb: bipush 4
      // 0cc: ishr
      // 0cd: istore 9
      // 0cf: iload 9
      // 0d1: aload 3
      // 0d2: invokevirtual mew.getZ ()I
      // 0d5: bipush 4
      // 0d6: ishr
      // 0d7: if_icmpgt 138
      // 0da: aload 0
      // 0db: getfield tp4.rxz [[Ltts;
      // 0de: iload 8
      // 0e0: aload 0
      // 0e1: getfield tp4.mhd I
      // 0e4: isub
      // 0e5: aaload
      // 0e6: iload 9
      // 0e8: aload 0
      // 0e9: getfield tp4._75 I
      // 0ec: isub
      // 0ed: aaload
      // 0ee: astore 10
      // 0f0: iload 5
      // 0f2: ifeq 13b
      // 0f5: iload 5
      // 0f7: ifeq 133
      // 0fa: goto 101
      // 0fd: invokestatic tp4.b (Loov;)Loov;
      // 100: athrow
      // 101: aload 10
      // 103: ifnull 130
      // 106: goto 10d
      // 109: invokestatic tp4.b (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 10
      // 10f: aload 2
      // 110: invokevirtual mew.getY ()I
      // 113: aload 3
      // 114: invokevirtual mew.getY ()I
      // 117: invokevirtual tts.sal (II)Z
      // 11a: ifne 130
      // 11d: goto 124
      // 120: invokestatic tp4.b (Loov;)Loov;
      // 123: athrow
      // 124: aload 0
      // 125: bipush 0
      // 126: putfield tp4.wve Z
      // 129: goto 130
      // 12c: invokestatic tp4.b (Loov;)Loov;
      // 12f: athrow
      // 130: iinc 9 1
      // 133: iload 5
      // 135: ifne 0cf
      // 138: iinc 8 1
      // 13b: iload 5
      // 13d: ifne 0bc
      // 140: return
   }

   @Override
   public boolean extendedLevelsInChunkCache() {
      return this.wve;
   }

   @Override
   public pyk getTileEntity(mew var1) {
      int var2 = (var1.getX() >> 4) - this.mhd;
      int var3 = (var1.getZ() >> 4) - this._75;
      return this.rxz[var2][var3].y58(var1, tts$cl0.sku);
   }

   @Override
   public int getCombinedLight(mew var1, int var2) {
      int var4 = this.mxg(qe5.sf9, var1);
      int var10000 = OpaquePredicate.b();
      int var5 = this.mxg(qe5.lm8, var1);
      int var3 = var10000;

      try {
         if (var3 == 0) {
            return var5 | var2;
         }

         if (var5 >= var2) {
            return var4 << 20 | var5 << 4;
         }
      } catch (oov var6) {
         throw b(var6);
      }

      return var4 << 20 | var2 << 4;
   }

   @Override
   public zfz getBlockState(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual mew.getY ()I
      // 08: iload 2
      // 09: ifeq 21
      // 0c: iflt ba
      // 0f: goto 16
      // 12: invokestatic tp4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual mew.getY ()I
      // 1a: goto 21
      // 1d: invokestatic tp4.b (Loov;)Loov;
      // 20: athrow
      // 21: sipush 256
      // 24: iload 2
      // 25: ifeq 43
      // 28: if_icmpge ba
      // 2b: goto 32
      // 2e: invokestatic tp4.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: invokevirtual mew.getX ()I
      // 36: bipush 4
      // 37: ishr
      // 38: aload 0
      // 39: getfield tp4.mhd I
      // 3c: goto 43
      // 3f: invokestatic tp4.b (Loov;)Loov;
      // 42: athrow
      // 43: isub
      // 44: istore 3
      // 45: aload 1
      // 46: invokevirtual mew.getZ ()I
      // 49: bipush 4
      // 4a: ishr
      // 4b: aload 0
      // 4c: getfield tp4._75 I
      // 4f: isub
      // 50: istore 4
      // 52: iload 3
      // 53: iload 2
      // 54: ifeq 62
      // 57: iflt ba
      // 5a: goto 61
      // 5d: invokestatic tp4.b (Loov;)Loov;
      // 60: athrow
      // 61: iload 3
      // 62: iload 2
      // 63: ifeq 7e
      // 66: aload 0
      // 67: getfield tp4.rxz [[Ltts;
      // 6a: arraylength
      // 6b: if_icmpge ba
      // 6e: goto 75
      // 71: invokestatic tp4.b (Loov;)Loov;
      // 74: athrow
      // 75: iload 4
      // 77: goto 7e
      // 7a: invokestatic tp4.b (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 2
      // 7f: ifeq 8e
      // 82: iflt ba
      // 85: goto 8c
      // 88: invokestatic tp4.b (Loov;)Loov;
      // 8b: athrow
      // 8c: iload 4
      // 8e: aload 0
      // 8f: getfield tp4.rxz [[Ltts;
      // 92: iload 3
      // 93: aaload
      // 94: arraylength
      // 95: if_icmpge ba
      // 98: aload 0
      // 99: getfield tp4.rxz [[Ltts;
      // 9c: iload 3
      // 9d: aaload
      // 9e: iload 4
      // a0: aaload
      // a1: astore 5
      // a3: aload 5
      // a5: iload 2
      // a6: ifeq b5
      // a9: ifnull ba
      // ac: goto b3
      // af: invokestatic tp4.b (Loov;)Loov;
      // b2: athrow
      // b3: aload 5
      // b5: aload 1
      // b6: invokevirtual tts.dk4 (Lmew;)Lzfz;
      // b9: areturn
      // ba: getstatic ox_.ibw Le0x;
      // bd: invokevirtual e0x.l4i ()Lzfz;
      // c0: areturn
   }

   @Override
   public gyu getBiomeGenForCoords(mew var1) {
      return this.plo.getBiomeGenForCoords(var1);
   }

   private int mxg(qe5 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: getstatic qe5.sf9 Lqe5;
      // 008: if_acmpne 030
      // 00b: aload 0
      // 00c: getfield tp4.plo Lt9d;
      // 00f: getfield OpaquePredicate.vzz Lupn;
      // 012: invokevirtual upn.qyc ()Z
      // 015: iload 3
      // 016: ifeq 034
      // 019: goto 020
      // 01c: invokestatic tp4.b (Loov;)Loov;
      // 01f: athrow
      // 020: ifeq 030
      // 023: goto 02a
      // 026: invokestatic tp4.b (Loov;)Loov;
      // 029: athrow
      // 02a: bipush 0
      // 02b: ireturn
      // 02c: invokestatic tp4.b (Loov;)Loov;
      // 02f: athrow
      // 030: aload 2
      // 031: invokevirtual mew.getY ()I
      // 034: iload 3
      // 035: ifeq 119
      // 038: iflt 115
      // 03b: goto 042
      // 03e: invokestatic tp4.b (Loov;)Loov;
      // 041: athrow
      // 042: aload 2
      // 043: invokevirtual mew.getY ()I
      // 046: iload 3
      // 047: ifeq 119
      // 04a: goto 051
      // 04d: invokestatic tp4.b (Loov;)Loov;
      // 050: athrow
      // 051: sipush 256
      // 054: if_icmpge 115
      // 057: goto 05e
      // 05a: invokestatic tp4.b (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 2
      // 060: invokevirtual tp4.getBlockState (Lmew;)Lzfz;
      // 063: invokeinterface zfz.r_y ()Le0x; 1
      // 068: invokevirtual e0x.hry ()Z
      // 06b: iload 3
      // 06c: ifeq 0f6
      // 06f: goto 076
      // 072: invokestatic tp4.b (Loov;)Loov;
      // 075: athrow
      // 076: ifeq 0eb
      // 079: goto 080
      // 07c: invokestatic tp4.b (Loov;)Loov;
      // 07f: athrow
      // 080: bipush 0
      // 081: istore 4
      // 083: invokestatic vt2.values ()[Lvt2;
      // 086: astore 5
      // 088: aload 5
      // 08a: arraylength
      // 08b: istore 6
      // 08d: bipush 0
      // 08e: istore 7
      // 090: iload 7
      // 092: iload 6
      // 094: if_icmpge 0e8
      // 097: aload 5
      // 099: iload 7
      // 09b: aaload
      // 09c: astore 8
      // 09e: aload 0
      // 09f: aload 1
      // 0a0: aload 2
      // 0a1: aload 8
      // 0a3: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0a6: invokevirtual tp4.q3h (Lqe5;Lmew;)I
      // 0a9: istore 9
      // 0ab: iload 9
      // 0ad: iload 3
      // 0ae: ifeq 0ea
      // 0b1: iload 4
      // 0b3: iload 3
      // 0b4: ifeq 0db
      // 0b7: goto 0be
      // 0ba: invokestatic tp4.b (Loov;)Loov;
      // 0bd: athrow
      // 0be: if_icmple 0cc
      // 0c1: goto 0c8
      // 0c4: invokestatic tp4.b (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 9
      // 0ca: istore 4
      // 0cc: iload 4
      // 0ce: iload 3
      // 0cf: ifeq 0e0
      // 0d2: bipush 15
      // 0d4: goto 0db
      // 0d7: invokestatic tp4.b (Loov;)Loov;
      // 0da: athrow
      // 0db: if_icmplt 0e1
      // 0de: iload 4
      // 0e0: ireturn
      // 0e1: iinc 7 1
      // 0e4: iload 3
      // 0e5: ifne 090
      // 0e8: iload 4
      // 0ea: ireturn
      // 0eb: aload 2
      // 0ec: invokevirtual mew.getX ()I
      // 0ef: bipush 4
      // 0f0: ishr
      // 0f1: aload 0
      // 0f2: getfield tp4.mhd I
      // 0f5: isub
      // 0f6: istore 4
      // 0f8: aload 2
      // 0f9: invokevirtual mew.getZ ()I
      // 0fc: bipush 4
      // 0fd: ishr
      // 0fe: aload 0
      // 0ff: getfield tp4._75 I
      // 102: isub
      // 103: istore 5
      // 105: aload 0
      // 106: getfield tp4.rxz [[Ltts;
      // 109: iload 4
      // 10b: aaload
      // 10c: iload 5
      // 10e: aaload
      // 10f: aload 1
      // 110: aload 2
      // 111: invokevirtual tts.uje (Lqe5;Lmew;)I
      // 114: ireturn
      // 115: aload 1
      // 116: getfield qe5.de2 I
      // 119: ireturn
   }

   @Override
   public boolean isAirBlock(mew var1) {
      try {
         if (this.getBlockState(var1).r_y().p1r() == p3y.cei) {
            return true;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return false;
   }

   public int q3h(qe5 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual mew.getY ()I
      // 08: iload 3
      // 09: ifne 60
      // 0c: iflt 5c
      // 0f: goto 16
      // 12: invokestatic tp4.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 2
      // 17: invokevirtual mew.getY ()I
      // 1a: iload 3
      // 1b: ifne 60
      // 1e: goto 25
      // 21: invokestatic tp4.b (Loov;)Loov;
      // 24: athrow
      // 25: sipush 256
      // 28: if_icmpge 5c
      // 2b: goto 32
      // 2e: invokestatic tp4.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 2
      // 33: invokevirtual mew.getX ()I
      // 36: bipush 4
      // 37: ishr
      // 38: aload 0
      // 39: getfield tp4.mhd I
      // 3c: isub
      // 3d: istore 4
      // 3f: aload 2
      // 40: invokevirtual mew.getZ ()I
      // 43: bipush 4
      // 44: ishr
      // 45: aload 0
      // 46: getfield tp4._75 I
      // 49: isub
      // 4a: istore 5
      // 4c: aload 0
      // 4d: getfield tp4.rxz [[Ltts;
      // 50: iload 4
      // 52: aaload
      // 53: iload 5
      // 55: aaload
      // 56: aload 1
      // 57: aload 2
      // 58: invokevirtual tts.uje (Lqe5;Lmew;)I
      // 5b: ireturn
      // 5c: aload 1
      // 5d: getfield qe5.de2 I
      // 60: ireturn
   }

   @Override
   public int getStrongPower(mew var1, vt2 var2) {
      zfz var3 = this.getBlockState(var1);
      return var3.r_y().sqt(this, var1, var3, var2);
   }

   @Override
   public gxq getWorldType() {
      return this.plo.getWorldType();
   }

   private static oov b(oov var0) {
      return var0;
   }
}
