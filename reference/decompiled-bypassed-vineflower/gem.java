public class gem extends _jc {
   private rsi xnw;
   private final vrx rlf;
   private int inx;

   public gem(jnq var1, rsi var2) {
      this.xnw = var2;
      int var10000 = t9d.b();
      this.zmp(new gem$kog(var1.jsr, var2, 0, 56, 46));
      this.zmp(new gem$kog(var1.jsr, var2, 1, 79, 53));
      this.zmp(new gem$kog(var1.jsr, var2, 2, 102, 46));
      this.rlf = this.zmp(new gem$s7_(this, var2, 3, 79, 17));
      int var3 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < 3) {
            var8 = 0;
            if (var3 == 0) {
               break;
            }

            int var5 = 0;

            label42: {
               while (var5 < 9) {
                  try {
                     this.zmp(new vrx(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
                     var5++;
                     if (var3 == 0) {
                        break label42;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  } catch (oov var6) {
                     throw a(var6);
                  }
               }

               var4++;
            }

            if (var3 != 0) {
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
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void c_j(flv var1) {
      super.c_j(var1);
      var1.pr4(this, this.xnw);
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
      // 00: aload 0
      // 01: invokespecial _jc.n4z ()V
      // 04: invokestatic t9d.b ()I
      // 07: bipush 0
      // 08: istore 2
      // 09: istore 1
      // 0a: iload 2
      // 0b: aload 0
      // 0c: getfield gem.b57 Ljava/util/List;
      // 0f: invokeinterface java/util/List.size ()I 1
      // 14: if_icmpge 6c
      // 17: aload 0
      // 18: getfield gem.b57 Ljava/util/List;
      // 1b: iload 2
      // 1c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21: checkcast flv
      // 24: astore 3
      // 25: iload 1
      // 26: ifeq 68
      // 29: aload 0
      // 2a: iload 1
      // 2b: ifeq 6d
      // 2e: goto 35
      // 31: invokestatic gem.a (Loov;)Loov;
      // 34: athrow
      // 35: getfield gem.inx I
      // 38: aload 0
      // 39: getfield gem.xnw Lrsi;
      // 3c: bipush 0
      // 3d: invokeinterface rsi.czu (I)I 2
      // 42: if_icmpeq 65
      // 45: goto 4c
      // 48: invokestatic gem.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 3
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: aload 0
      // 50: getfield gem.xnw Lrsi;
      // 53: bipush 0
      // 54: invokeinterface rsi.czu (I)I 2
      // 59: invokeinterface flv.vhx (L_jc;II)V 4
      // 5e: goto 65
      // 61: invokestatic gem.a (Loov;)Loov;
      // 64: athrow
      // 65: iinc 2 1
      // 68: iload 1
      // 69: ifne 0a
      // 6c: aload 0
      // 6d: aload 0
      // 6e: getfield gem.xnw Lrsi;
      // 71: bipush 0
      // 72: invokeinterface rsi.czu (I)I 2
      // 77: putfield gem.inx I
      // 7a: return
   }

   @Override
   public void l0n(int var1, int var2) {
      this.xnw.r8i(var1, var2);
   }

   @Override
   public boolean spj(ha9 var1) {
      return this.xnw.dnv(var1);
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
      // 007: getfield gem.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifeq 028
      // 01c: ifnull 239
      // 01f: goto 026
      // 022: invokestatic gem.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifeq 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 239
      // 032: goto 039
      // 035: invokestatic gem.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic gem.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifeq 07c
      // 053: iflt 074
      // 056: goto 05d
      // 059: invokestatic gem.a (Loov;)Loov;
      // 05c: athrow
      // 05d: iload 2
      // 05e: iload 3
      // 05f: ifeq 1e4
      // 062: goto 069
      // 065: invokestatic gem.a (Loov;)Loov;
      // 068: athrow
      // 069: bipush 2
      // 06a: if_icmple 1da
      // 06d: goto 074
      // 070: invokestatic gem.a (Loov;)Loov;
      // 073: athrow
      // 074: iload 2
      // 075: goto 07c
      // 078: invokestatic gem.a (Loov;)Loov;
      // 07b: athrow
      // 07c: iload 3
      // 07d: ifeq 1e4
      // 080: bipush 3
      // 081: if_icmpeq 1da
      // 084: goto 08b
      // 087: invokestatic gem.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 0
      // 08c: getfield gem.rlf Lvrx;
      // 08f: invokevirtual vrx.hf8 ()Z
      // 092: iload 3
      // 093: ifeq 0ee
      // 096: goto 09d
      // 099: invokestatic gem.a (Loov;)Loov;
      // 09c: athrow
      // 09d: ifne 0e9
      // 0a0: goto 0a7
      // 0a3: invokestatic gem.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield gem.rlf Lvrx;
      // 0ab: aload 6
      // 0ad: invokevirtual vrx.xvl (Lerg;)Z
      // 0b0: iload 3
      // 0b1: ifeq 0ee
      // 0b4: goto 0bb
      // 0b7: invokestatic gem.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: ifeq 0e9
      // 0be: goto 0c5
      // 0c1: invokestatic gem.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: aload 6
      // 0c8: bipush 3
      // 0c9: bipush 4
      // 0ca: bipush 0
      // 0cb: invokevirtual gem.ghh (Lerg;IIZ)Z
      // 0ce: iload 3
      // 0cf: ifeq 1fb
      // 0d2: goto 0d9
      // 0d5: invokestatic gem.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: ifne 1f6
      // 0dc: goto 0e3
      // 0df: invokestatic gem.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aconst_null
      // 0e4: areturn
      // 0e5: invokestatic gem.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 4
      // 0eb: invokestatic gem$kog.lvh (Lerg;)Z
      // 0ee: iload 3
      // 0ef: ifeq 121
      // 0f2: ifeq 120
      // 0f5: goto 0fc
      // 0f8: invokestatic gem.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: aload 6
      // 0ff: bipush 0
      // 100: bipush 3
      // 101: bipush 0
      // 102: invokevirtual gem.ghh (Lerg;IIZ)Z
      // 105: iload 3
      // 106: ifeq 1fb
      // 109: goto 110
      // 10c: invokestatic gem.a (Loov;)Loov;
      // 10f: athrow
      // 110: ifne 1f6
      // 113: goto 11a
      // 116: invokestatic gem.a (Loov;)Loov;
      // 119: athrow
      // 11a: aconst_null
      // 11b: areturn
      // 11c: invokestatic gem.a (Loov;)Loov;
      // 11f: athrow
      // 120: iload 2
      // 121: bipush 4
      // 122: iload 3
      // 123: ifeq 17c
      // 126: if_icmplt 16e
      // 129: goto 130
      // 12c: invokestatic gem.a (Loov;)Loov;
      // 12f: athrow
      // 130: iload 2
      // 131: bipush 31
      // 133: iload 3
      // 134: ifeq 17c
      // 137: goto 13e
      // 13a: invokestatic gem.a (Loov;)Loov;
      // 13d: athrow
      // 13e: if_icmpge 16e
      // 141: goto 148
      // 144: invokestatic gem.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 0
      // 149: aload 6
      // 14b: bipush 31
      // 14d: bipush 40
      // 14f: bipush 0
      // 150: invokevirtual gem.ghh (Lerg;IIZ)Z
      // 153: iload 3
      // 154: ifeq 1fb
      // 157: goto 15e
      // 15a: invokestatic gem.a (Loov;)Loov;
      // 15d: athrow
      // 15e: ifne 1f6
      // 161: goto 168
      // 164: invokestatic gem.a (Loov;)Loov;
      // 167: athrow
      // 168: aconst_null
      // 169: areturn
      // 16a: invokestatic gem.a (Loov;)Loov;
      // 16d: athrow
      // 16e: iload 2
      // 16f: iload 3
      // 170: ifeq 1c6
      // 173: bipush 31
      // 175: goto 17c
      // 178: invokestatic gem.a (Loov;)Loov;
      // 17b: athrow
      // 17c: if_icmplt 1bc
      // 17f: iload 2
      // 180: iload 3
      // 181: ifeq 1c6
      // 184: goto 18b
      // 187: invokestatic gem.a (Loov;)Loov;
      // 18a: athrow
      // 18b: bipush 40
      // 18d: if_icmpge 1bc
      // 190: goto 197
      // 193: invokestatic gem.a (Loov;)Loov;
      // 196: athrow
      // 197: aload 0
      // 198: aload 6
      // 19a: bipush 4
      // 19b: bipush 31
      // 19d: bipush 0
      // 19e: invokevirtual gem.ghh (Lerg;IIZ)Z
      // 1a1: iload 3
      // 1a2: ifeq 1fb
      // 1a5: goto 1ac
      // 1a8: invokestatic gem.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: ifne 1f6
      // 1af: goto 1b6
      // 1b2: invokestatic gem.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: aconst_null
      // 1b7: areturn
      // 1b8: invokestatic gem.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: aload 0
      // 1bd: aload 6
      // 1bf: bipush 4
      // 1c0: bipush 40
      // 1c2: bipush 0
      // 1c3: invokevirtual gem.ghh (Lerg;IIZ)Z
      // 1c6: iload 3
      // 1c7: ifeq 1fb
      // 1ca: ifne 1f6
      // 1cd: goto 1d4
      // 1d0: invokestatic gem.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: aconst_null
      // 1d5: areturn
      // 1d6: invokestatic gem.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: aload 0
      // 1db: aload 6
      // 1dd: bipush 4
      // 1de: bipush 40
      // 1e0: bipush 1
      // 1e1: invokevirtual gem.ghh (Lerg;IIZ)Z
      // 1e4: ifne 1ed
      // 1e7: aconst_null
      // 1e8: areturn
      // 1e9: invokestatic gem.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: aload 5
      // 1ef: aload 6
      // 1f1: aload 4
      // 1f3: invokevirtual vrx._0c (Lerg;Lerg;)V
      // 1f6: aload 6
      // 1f8: getfield erg.qd2 I
      // 1fb: ifne 212
      // 1fe: aload 5
      // 200: aconst_null
      // 201: checkcast erg
      // 204: invokevirtual vrx.yn7 (Lerg;)V
      // 207: iload 3
      // 208: ifne 21e
      // 20b: goto 212
      // 20e: invokestatic gem.a (Loov;)Loov;
      // 211: athrow
      // 212: aload 5
      // 214: invokevirtual vrx.vc1 ()V
      // 217: goto 21e
      // 21a: invokestatic gem.a (Loov;)Loov;
      // 21d: athrow
      // 21e: aload 6
      // 220: getfield erg.qd2 I
      // 223: aload 4
      // 225: getfield erg.qd2 I
      // 228: if_icmpne 231
      // 22b: aconst_null
      // 22c: areturn
      // 22d: invokestatic gem.a (Loov;)Loov;
      // 230: athrow
      // 231: aload 5
      // 233: aload 1
      // 234: aload 6
      // 236: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 239: aload 4
      // 23b: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
