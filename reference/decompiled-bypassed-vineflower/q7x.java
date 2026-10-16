public class q7x extends _jc {
   public q7x(jnq var1, rsi var2) {
      int var10000 = t9d.c();
      this.dvg = var2;
      this.zmp(new vrx(var2, 0, 56, 17));
      this.zmp(new a0r(var2, 1, 56, 53));
      int var3 = var10000;
      this.zmp(new f_9(var1.jsr, var2, 2, 116, 35));
      int var4 = 0;

      while (true) {
         if (var4 < 3) {
            var8 = 0;
            if (var3 != 0) {
               break;
            }

            int var5 = 0;

            label42: {
               while (var5 < 9) {
                  try {
                     this.zmp(new vrx(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
                     var5++;
                     if (var3 != 0) {
                        break label42;
                     }

                     if (var3 != 0) {
                        break;
                     }
                  } catch (oov var6) {
                     throw a(var6);
                  }
               }

               var4++;
            }

            if (var3 == 0) {
               continue;
            }
         }

         var8 = 0;
         break;
      }

      var4 = var8;

      while (var4 < 9) {
         this.zmp(new vrx(var1, var4, 8 + var4 * 18, 142));
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   @Override
   public void c_j(flv var1) {
      super.c_j(var1);
      var1.pr4(this, this.dvg);
   }

   @Override
   public void n4z() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial _jc.n4z ()V
      // 004: invokestatic t9d.c ()I
      // 007: bipush 0
      // 008: istore 2
      // 009: istore 1
      // 00a: iload 2
      // 00b: aload 0
      // 00c: getfield q7x.b57 Ljava/util/List;
      // 00f: invokeinterface java/util/List.size ()I 1
      // 014: if_icmpge 100
      // 017: aload 0
      // 018: getfield q7x.b57 Ljava/util/List;
      // 01b: iload 2
      // 01c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 021: checkcast flv
      // 024: astore 3
      // 025: aload 0
      // 026: iload 1
      // 027: ifne 12b
      // 02a: getfield q7x.d6c I
      // 02d: aload 0
      // 02e: getfield q7x.dvg Lrsi;
      // 031: bipush 2
      // 032: invokeinterface rsi.czu (I)I 2
      // 037: iload 1
      // 038: ifne 073
      // 03b: goto 042
      // 03e: invokestatic q7x.a (Loov;)Loov;
      // 041: athrow
      // 042: if_icmpeq 065
      // 045: goto 04c
      // 048: invokestatic q7x.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 3
      // 04d: aload 0
      // 04e: bipush 2
      // 04f: aload 0
      // 050: getfield q7x.dvg Lrsi;
      // 053: bipush 2
      // 054: invokeinterface rsi.czu (I)I 2
      // 059: invokeinterface flv.vhx (L_jc;II)V 4
      // 05e: goto 065
      // 061: invokestatic q7x.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 0
      // 066: getfield q7x.c68 I
      // 069: aload 0
      // 06a: getfield q7x.dvg Lrsi;
      // 06d: bipush 0
      // 06e: invokeinterface rsi.czu (I)I 2
      // 073: iload 1
      // 074: ifne 0a8
      // 077: if_icmpeq 09a
      // 07a: goto 081
      // 07d: invokestatic q7x.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 3
      // 082: aload 0
      // 083: bipush 0
      // 084: aload 0
      // 085: getfield q7x.dvg Lrsi;
      // 088: bipush 0
      // 089: invokeinterface rsi.czu (I)I 2
      // 08e: invokeinterface flv.vhx (L_jc;II)V 4
      // 093: goto 09a
      // 096: invokestatic q7x.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield q7x.m2k I
      // 09e: aload 0
      // 09f: getfield q7x.dvg Lrsi;
      // 0a2: bipush 1
      // 0a3: invokeinterface rsi.czu (I)I 2
      // 0a8: iload 1
      // 0a9: ifne 0dd
      // 0ac: if_icmpeq 0cf
      // 0af: goto 0b6
      // 0b2: invokestatic q7x.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 3
      // 0b7: aload 0
      // 0b8: bipush 1
      // 0b9: aload 0
      // 0ba: getfield q7x.dvg Lrsi;
      // 0bd: bipush 1
      // 0be: invokeinterface rsi.czu (I)I 2
      // 0c3: invokeinterface flv.vhx (L_jc;II)V 4
      // 0c8: goto 0cf
      // 0cb: invokestatic q7x.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield q7x.yku I
      // 0d3: aload 0
      // 0d4: getfield q7x.dvg Lrsi;
      // 0d7: bipush 3
      // 0d8: invokeinterface rsi.czu (I)I 2
      // 0dd: if_icmpeq 0f9
      // 0e0: aload 3
      // 0e1: aload 0
      // 0e2: bipush 3
      // 0e3: aload 0
      // 0e4: getfield q7x.dvg Lrsi;
      // 0e7: bipush 3
      // 0e8: invokeinterface rsi.czu (I)I 2
      // 0ed: invokeinterface flv.vhx (L_jc;II)V 4
      // 0f2: goto 0f9
      // 0f5: invokestatic q7x.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: iinc 2 1
      // 0fc: iload 1
      // 0fd: ifeq 00a
      // 100: aload 0
      // 101: aload 0
      // 102: getfield q7x.dvg Lrsi;
      // 105: bipush 2
      // 106: invokeinterface rsi.czu (I)I 2
      // 10b: putfield q7x.d6c I
      // 10e: aload 0
      // 10f: aload 0
      // 110: getfield q7x.dvg Lrsi;
      // 113: bipush 0
      // 114: invokeinterface rsi.czu (I)I 2
      // 119: putfield q7x.c68 I
      // 11c: aload 0
      // 11d: aload 0
      // 11e: getfield q7x.dvg Lrsi;
      // 121: bipush 1
      // 122: invokeinterface rsi.czu (I)I 2
      // 127: putfield q7x.m2k I
      // 12a: aload 0
      // 12b: aload 0
      // 12c: getfield q7x.dvg Lrsi;
      // 12f: bipush 3
      // 130: invokeinterface rsi.czu (I)I 2
      // 135: putfield q7x.yku I
      // 138: return
   }

   @Override
   public void l0n(int var1, int var2) {
      this.dvg.r8i(var1, var2);
   }

   @Override
   public boolean spj(ha9 var1) {
      return this.dvg.dnv(var1);
   }

   @Override
   public erg za4(ha9 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 4
      // 003: invokestatic t9d.b ()I
      // 006: aload 0
      // 007: getfield q7x.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifeq 028
      // 01c: ifnull 227
      // 01f: goto 026
      // 022: invokestatic q7x.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifeq 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 227
      // 032: goto 039
      // 035: invokestatic q7x.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic q7x.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: bipush 2
      // 050: iload 3
      // 051: ifeq 099
      // 054: if_icmpne 085
      // 057: goto 05e
      // 05a: invokestatic q7x.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 6
      // 061: bipush 3
      // 062: bipush 39
      // 064: bipush 1
      // 065: invokevirtual q7x.ghh (Lerg;IIZ)Z
      // 068: ifne 078
      // 06b: goto 072
      // 06e: invokestatic q7x.a (Loov;)Loov;
      // 071: athrow
      // 072: aconst_null
      // 073: areturn
      // 074: invokestatic q7x.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 5
      // 07a: aload 6
      // 07c: aload 4
      // 07e: invokevirtual vrx._0c (Lerg;Lerg;)V
      // 081: iload 3
      // 082: ifne 1e4
      // 085: iload 2
      // 086: iload 3
      // 087: ifeq 1d0
      // 08a: goto 091
      // 08d: invokestatic q7x.a (Loov;)Loov;
      // 090: athrow
      // 091: bipush 1
      // 092: goto 099
      // 095: invokestatic q7x.a (Loov;)Loov;
      // 098: athrow
      // 099: if_icmpeq 1c6
      // 09c: iload 2
      // 09d: iload 3
      // 09e: ifeq 1d0
      // 0a1: goto 0a8
      // 0a4: invokestatic q7x.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifeq 1c6
      // 0ab: goto 0b2
      // 0ae: invokestatic q7x.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: invokestatic x65.eor ()Lx65;
      // 0b5: aload 6
      // 0b7: invokevirtual x65.jsl (Lerg;)Lerg;
      // 0ba: iload 3
      // 0bb: ifeq 0f5
      // 0be: goto 0c5
      // 0c1: invokestatic q7x.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: ifnull 0f3
      // 0c8: goto 0cf
      // 0cb: invokestatic q7x.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: aload 6
      // 0d2: bipush 0
      // 0d3: bipush 1
      // 0d4: bipush 0
      // 0d5: invokevirtual q7x.ghh (Lerg;IIZ)Z
      // 0d8: iload 3
      // 0d9: ifeq 1e9
      // 0dc: goto 0e3
      // 0df: invokestatic q7x.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: ifne 1e4
      // 0e6: goto 0ed
      // 0e9: invokestatic q7x.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aconst_null
      // 0ee: areturn
      // 0ef: invokestatic q7x.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 6
      // 0f5: invokestatic net/minecraft/tileentity/TileEntityFurnace.wlb (Lerg;)Z
      // 0f8: iload 3
      // 0f9: ifeq 12b
      // 0fc: ifeq 12a
      // 0ff: goto 106
      // 102: invokestatic q7x.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: aload 6
      // 109: bipush 1
      // 10a: bipush 2
      // 10b: bipush 0
      // 10c: invokevirtual q7x.ghh (Lerg;IIZ)Z
      // 10f: iload 3
      // 110: ifeq 1e9
      // 113: goto 11a
      // 116: invokestatic q7x.a (Loov;)Loov;
      // 119: athrow
      // 11a: ifne 1e4
      // 11d: goto 124
      // 120: invokestatic q7x.a (Loov;)Loov;
      // 123: athrow
      // 124: aconst_null
      // 125: areturn
      // 126: invokestatic q7x.a (Loov;)Loov;
      // 129: athrow
      // 12a: iload 2
      // 12b: bipush 3
      // 12c: iload 3
      // 12d: ifeq 186
      // 130: if_icmplt 178
      // 133: goto 13a
      // 136: invokestatic q7x.a (Loov;)Loov;
      // 139: athrow
      // 13a: iload 2
      // 13b: bipush 30
      // 13d: iload 3
      // 13e: ifeq 186
      // 141: goto 148
      // 144: invokestatic q7x.a (Loov;)Loov;
      // 147: athrow
      // 148: if_icmpge 178
      // 14b: goto 152
      // 14e: invokestatic q7x.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 0
      // 153: aload 6
      // 155: bipush 30
      // 157: bipush 39
      // 159: bipush 0
      // 15a: invokevirtual q7x.ghh (Lerg;IIZ)Z
      // 15d: iload 3
      // 15e: ifeq 1e9
      // 161: goto 168
      // 164: invokestatic q7x.a (Loov;)Loov;
      // 167: athrow
      // 168: ifne 1e4
      // 16b: goto 172
      // 16e: invokestatic q7x.a (Loov;)Loov;
      // 171: athrow
      // 172: aconst_null
      // 173: areturn
      // 174: invokestatic q7x.a (Loov;)Loov;
      // 177: athrow
      // 178: iload 2
      // 179: iload 3
      // 17a: ifeq 1e9
      // 17d: bipush 30
      // 17f: goto 186
      // 182: invokestatic q7x.a (Loov;)Loov;
      // 185: athrow
      // 186: if_icmplt 1e4
      // 189: iload 2
      // 18a: iload 3
      // 18b: ifeq 1e9
      // 18e: goto 195
      // 191: invokestatic q7x.a (Loov;)Loov;
      // 194: athrow
      // 195: bipush 39
      // 197: if_icmpge 1e4
      // 19a: goto 1a1
      // 19d: invokestatic q7x.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: aload 6
      // 1a4: bipush 3
      // 1a5: bipush 30
      // 1a7: bipush 0
      // 1a8: invokevirtual q7x.ghh (Lerg;IIZ)Z
      // 1ab: iload 3
      // 1ac: ifeq 1e9
      // 1af: goto 1b6
      // 1b2: invokestatic q7x.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: ifne 1e4
      // 1b9: goto 1c0
      // 1bc: invokestatic q7x.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: aconst_null
      // 1c1: areturn
      // 1c2: invokestatic q7x.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: aload 6
      // 1c9: bipush 3
      // 1ca: bipush 39
      // 1cc: bipush 0
      // 1cd: invokevirtual q7x.ghh (Lerg;IIZ)Z
      // 1d0: iload 3
      // 1d1: ifeq 1e9
      // 1d4: ifne 1e4
      // 1d7: goto 1de
      // 1da: invokestatic q7x.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: aconst_null
      // 1df: areturn
      // 1e0: invokestatic q7x.a (Loov;)Loov;
      // 1e3: athrow
      // 1e4: aload 6
      // 1e6: getfield erg.qd2 I
      // 1e9: ifne 200
      // 1ec: aload 5
      // 1ee: aconst_null
      // 1ef: checkcast erg
      // 1f2: invokevirtual vrx.yn7 (Lerg;)V
      // 1f5: iload 3
      // 1f6: ifne 20c
      // 1f9: goto 200
      // 1fc: invokestatic q7x.a (Loov;)Loov;
      // 1ff: athrow
      // 200: aload 5
      // 202: invokevirtual vrx.vc1 ()V
      // 205: goto 20c
      // 208: invokestatic q7x.a (Loov;)Loov;
      // 20b: athrow
      // 20c: aload 6
      // 20e: getfield erg.qd2 I
      // 211: aload 4
      // 213: getfield erg.qd2 I
      // 216: if_icmpne 21f
      // 219: aconst_null
      // 21a: areturn
      // 21b: invokestatic q7x.a (Loov;)Loov;
      // 21e: athrow
      // 21f: aload 5
      // 221: aload 1
      // 222: aload 6
      // 224: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 227: aload 4
      // 229: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
