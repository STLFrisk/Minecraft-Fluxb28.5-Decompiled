public class je4 extends _jc {
   private rsi tle;
   private final je4$b3l e4_;

   public je4(rsi var1, rsi var2) {
      this.tle = var2;
      int var10000 = OpaquePredicate.b();
      this.zmp(this.e4_ = new je4$b3l(this, var2, 0, 136, 110));
      byte var4 = 36;
      int var3 = var10000;
      short var5 = 137;
      int var6 = 0;

      while (true) {
         if (var6 < 3) {
            var10 = 0;
            if (var3 == 0) {
               break;
            }

            int var7 = 0;

            label42: {
               while (var7 < 9) {
                  try {
                     this.zmp(new vrx(var1, var7 + var6 * 9 + 9, var4 + var7 * 18, var5 + var6 * 18));
                     var7++;
                     if (var3 == 0) {
                        break label42;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }
               }

               var6++;
            }

            if (var3 != 0) {
               continue;
            }
         }

         var10 = 0;
         break;
      }

      var6 = var10;

      while (var6 < 9) {
         this.zmp(new vrx(var1, var6, var4 + var6 * 18, 58 + var5));
         var6++;
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void c_j(flv var1) {
      super.c_j(var1);
      var1.pr4(this, this.tle);
   }

   @Override
   public void l0n(int var1, int var2) {
      this.tle.r8i(var1, var2);
   }

   public rsi gip() {
      return this.tle;
   }

   @Override
   public void qi6(ha9 var1) {
      int var2 = OpaquePredicate.b();

      ha9 var10000;
      label30: {
         try {
            super.qi6(var1);
            var10000 = var1;
            if (var2 == 0) {
               break label30;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var1;
      }

      if (!var10000.oay.v0f) {
         erg var3 = this.e4_.xtx(this.e4_.c1r());

         try {
            if (var3 != null) {
               var1.ejq(var3, false);
            }
         } catch (oov var4) {
            throw a(var4);
         }
      }
   }

   @Override
   public boolean spj(ha9 var1) {
      return this.tle.dnv(var1);
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
      // 003: invokestatic OpaquePredicate.c ()I
      // 006: aload 0
      // 007: getfield je4.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifne 028
      // 01c: ifnull 1fa
      // 01f: goto 026
      // 022: invokestatic je4.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifne 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 1fa
      // 032: goto 039
      // 035: invokestatic je4.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic je4.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifne 092
      // 053: ifne 084
      // 056: goto 05d
      // 059: invokestatic je4.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: aload 6
      // 060: bipush 1
      // 061: bipush 37
      // 063: bipush 1
      // 064: invokevirtual je4.ghh (Lerg;IIZ)Z
      // 067: ifne 077
      // 06a: goto 071
      // 06d: invokestatic je4.a (Loov;)Loov;
      // 070: athrow
      // 071: aconst_null
      // 072: areturn
      // 073: invokestatic je4.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 5
      // 079: aload 6
      // 07b: aload 4
      // 07d: invokevirtual vrx._0c (Lerg;Lerg;)V
      // 080: iload 3
      // 081: ifeq 1b7
      // 084: aload 0
      // 085: getfield je4.e4_ Lje4$b3l;
      // 088: invokevirtual je4$b3l.hf8 ()Z
      // 08b: goto 092
      // 08e: invokestatic je4.a (Loov;)Loov;
      // 091: athrow
      // 092: iload 3
      // 093: ifne 0fe
      // 096: ifne 0fd
      // 099: goto 0a0
      // 09c: invokestatic je4.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield je4.e4_ Lje4$b3l;
      // 0a4: aload 6
      // 0a6: invokevirtual je4$b3l.xvl (Lerg;)Z
      // 0a9: iload 3
      // 0aa: ifne 0fe
      // 0ad: goto 0b4
      // 0b0: invokestatic je4.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: ifeq 0fd
      // 0b7: goto 0be
      // 0ba: invokestatic je4.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 6
      // 0c0: getfield erg.qd2 I
      // 0c3: bipush 1
      // 0c4: iload 3
      // 0c5: ifne 0ff
      // 0c8: goto 0cf
      // 0cb: invokestatic je4.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: if_icmpne 0fd
      // 0d2: goto 0d9
      // 0d5: invokestatic je4.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: aload 6
      // 0dc: bipush 0
      // 0dd: bipush 1
      // 0de: bipush 0
      // 0df: invokevirtual je4.ghh (Lerg;IIZ)Z
      // 0e2: iload 3
      // 0e3: ifne 1bc
      // 0e6: goto 0ed
      // 0e9: invokestatic je4.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: ifne 1b7
      // 0f0: goto 0f7
      // 0f3: invokestatic je4.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aconst_null
      // 0f8: areturn
      // 0f9: invokestatic je4.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: bipush 1
      // 0ff: iload 3
      // 100: ifne 159
      // 103: if_icmplt 14b
      // 106: goto 10d
      // 109: invokestatic je4.a (Loov;)Loov;
      // 10c: athrow
      // 10d: iload 2
      // 10e: bipush 28
      // 110: iload 3
      // 111: ifne 159
      // 114: goto 11b
      // 117: invokestatic je4.a (Loov;)Loov;
      // 11a: athrow
      // 11b: if_icmpge 14b
      // 11e: goto 125
      // 121: invokestatic je4.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: aload 6
      // 128: bipush 28
      // 12a: bipush 37
      // 12c: bipush 0
      // 12d: invokevirtual je4.ghh (Lerg;IIZ)Z
      // 130: iload 3
      // 131: ifne 1bc
      // 134: goto 13b
      // 137: invokestatic je4.a (Loov;)Loov;
      // 13a: athrow
      // 13b: ifne 1b7
      // 13e: goto 145
      // 141: invokestatic je4.a (Loov;)Loov;
      // 144: athrow
      // 145: aconst_null
      // 146: areturn
      // 147: invokestatic je4.a (Loov;)Loov;
      // 14a: athrow
      // 14b: iload 2
      // 14c: iload 3
      // 14d: ifne 1a3
      // 150: bipush 28
      // 152: goto 159
      // 155: invokestatic je4.a (Loov;)Loov;
      // 158: athrow
      // 159: if_icmplt 199
      // 15c: iload 2
      // 15d: iload 3
      // 15e: ifne 1a3
      // 161: goto 168
      // 164: invokestatic je4.a (Loov;)Loov;
      // 167: athrow
      // 168: bipush 37
      // 16a: if_icmpge 199
      // 16d: goto 174
      // 170: invokestatic je4.a (Loov;)Loov;
      // 173: athrow
      // 174: aload 0
      // 175: aload 6
      // 177: bipush 1
      // 178: bipush 28
      // 17a: bipush 0
      // 17b: invokevirtual je4.ghh (Lerg;IIZ)Z
      // 17e: iload 3
      // 17f: ifne 1bc
      // 182: goto 189
      // 185: invokestatic je4.a (Loov;)Loov;
      // 188: athrow
      // 189: ifne 1b7
      // 18c: goto 193
      // 18f: invokestatic je4.a (Loov;)Loov;
      // 192: athrow
      // 193: aconst_null
      // 194: areturn
      // 195: invokestatic je4.a (Loov;)Loov;
      // 198: athrow
      // 199: aload 0
      // 19a: aload 6
      // 19c: bipush 1
      // 19d: bipush 37
      // 19f: bipush 0
      // 1a0: invokevirtual je4.ghh (Lerg;IIZ)Z
      // 1a3: iload 3
      // 1a4: ifne 1bc
      // 1a7: ifne 1b7
      // 1aa: goto 1b1
      // 1ad: invokestatic je4.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: aconst_null
      // 1b2: areturn
      // 1b3: invokestatic je4.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 6
      // 1b9: getfield erg.qd2 I
      // 1bc: ifne 1d3
      // 1bf: aload 5
      // 1c1: aconst_null
      // 1c2: checkcast erg
      // 1c5: invokevirtual vrx.yn7 (Lerg;)V
      // 1c8: iload 3
      // 1c9: ifeq 1df
      // 1cc: goto 1d3
      // 1cf: invokestatic je4.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: aload 5
      // 1d5: invokevirtual vrx.vc1 ()V
      // 1d8: goto 1df
      // 1db: invokestatic je4.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 6
      // 1e1: getfield erg.qd2 I
      // 1e4: aload 4
      // 1e6: getfield erg.qd2 I
      // 1e9: if_icmpne 1f2
      // 1ec: aconst_null
      // 1ed: areturn
      // 1ee: invokestatic je4.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: aload 5
      // 1f4: aload 1
      // 1f5: aload 6
      // 1f7: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 1fa: aload 4
      // 1fc: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
