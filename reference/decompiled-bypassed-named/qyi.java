public class qyi extends _jc {
   private rsi x4q;
   private zfo wi5;

   public qyi(rsi var1, rsi var2, zfo var3, ha9 var4) {
      this.x4q = var2;
      int var10000 = OpaquePredicate.c();
      this.wi5 = var3;
      int var5 = var10000;
      byte var6 = 3;
      var2.dk0(var4);
      int var7 = (var6 - 4) * 18;

      label96: {
         label100: {
            try {
               this.zmp(new qyi$1(this, var2, 0, 8, 18));
               this.zmp(new qyi$2(this, var2, 1, 8, 36, var3));
               var16 = var3.dlx();
               if (var5 != 0) {
                  break label96;
               }

               if (var16 == 0) {
                  break label100;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            int var8 = 0;

            while (var8 < var6) {
               var16 = 0;
               if (var5 != 0) {
                  break label96;
               }

               int var9 = 0;

               label86: {
                  while (var9 < 5) {
                     try {
                        this.zmp(new vrx(var2, 2 + var9 + var8 * 5, 80 + var9 * 18, 18 + var8 * 18));
                        var9++;
                        if (var5 != 0) {
                           break label86;
                        }

                        if (var5 != 0) {
                           break;
                        }
                     } catch (oov var11) {
                        throw a(var11);
                     }
                  }

                  var8++;
               }

               if (var5 != 0) {
                  break;
               }
            }
         }

         var16 = 0;
      }

      int var13 = var16;

      while (true) {
         if (var13 < 3) {
            var17 = 0;
            if (var5 != 0) {
               break;
            }

            int var15 = 0;

            label61: {
               while (var15 < 9) {
                  try {
                     this.zmp(new vrx(var1, var15 + var13 * 9 + 9, 8 + var15 * 18, 102 + var13 * 18 + var7));
                     var15++;
                     if (var5 != 0) {
                        break label61;
                     }

                     if (var5 != 0) {
                        break;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }
               }

               var13++;
            }

            if (var5 == 0) {
               continue;
            }
         }

         var17 = 0;
         break;
      }

      var13 = var17;

      while (var13 < 9) {
         this.zmp(new vrx(var1, var13, 8 + var13 * 18, 160 + var7));
         var13++;
         if (var5 != 0) {
            break;
         }
      }
   }

   @Override
   public boolean spj(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qyi.x4q Lrsi;
      // 08: aload 1
      // 09: invokeinterface rsi.dnv (Lha9;)Z 2
      // 0e: iload 2
      // 0f: ifeq 2a
      // 12: ifeq 5d
      // 15: goto 1c
      // 18: invokestatic qyi.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qyi.wi5 Lzfo;
      // 20: invokevirtual zfo.gzr ()Z
      // 23: goto 2a
      // 26: invokestatic qyi.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 2
      // 2b: ifeq 4b
      // 2e: ifeq 5d
      // 31: goto 38
      // 34: invokestatic qyi.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield qyi.wi5 Lzfo;
      // 3c: aload 1
      // 3d: invokevirtual zfo.tm6 (Li2h;)F
      // 40: ldc 8.0
      // 42: nop
      // 43: fcmpg
      // 44: goto 4b
      // 47: invokestatic qyi.a (Loov;)Loov;
      // 4a: athrow
      // 4b: iload 2
      // 4c: ifeq 5a
      // 4f: ifge 5d
      // 52: goto 59
      // 55: invokestatic qyi.a (Loov;)Loov;
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
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
      // 003: invokestatic OpaquePredicate.b ()I
      // 006: aload 0
      // 007: getfield qyi.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifeq 028
      // 01c: ifnull 19b
      // 01f: goto 026
      // 022: invokestatic qyi.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifeq 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 19b
      // 032: goto 039
      // 035: invokestatic qyi.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic qyi.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifeq 0a4
      // 053: aload 0
      // 054: getfield qyi.x4q Lrsi;
      // 057: invokeinterface rsi.opt ()I 1
      // 05c: if_icmpge 09a
      // 05f: goto 066
      // 062: invokestatic qyi.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: aload 6
      // 069: aload 0
      // 06a: getfield qyi.x4q Lrsi;
      // 06d: invokeinterface rsi.opt ()I 1
      // 072: aload 0
      // 073: getfield qyi.wjd Ljava/util/List;
      // 076: invokeinterface java/util/List.size ()I 1
      // 07b: bipush 1
      // 07c: invokevirtual qyi.ghh (Lerg;IIZ)Z
      // 07f: iload 3
      // 080: ifeq 178
      // 083: goto 08a
      // 086: invokestatic qyi.a (Loov;)Loov;
      // 089: athrow
      // 08a: ifne 173
      // 08d: goto 094
      // 090: invokestatic qyi.a (Loov;)Loov;
      // 093: athrow
      // 094: aconst_null
      // 095: areturn
      // 096: invokestatic qyi.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 0
      // 09b: bipush 1
      // 09c: invokevirtual qyi.ajr (I)Lvrx;
      // 09f: aload 6
      // 0a1: invokevirtual vrx.xvl (Lerg;)Z
      // 0a4: iload 3
      // 0a5: ifeq 0fd
      // 0a8: ifeq 0f3
      // 0ab: goto 0b2
      // 0ae: invokestatic qyi.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: bipush 1
      // 0b4: invokevirtual qyi.ajr (I)Lvrx;
      // 0b7: invokevirtual vrx.hf8 ()Z
      // 0ba: iload 3
      // 0bb: ifeq 0fd
      // 0be: goto 0c5
      // 0c1: invokestatic qyi.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: ifne 0f3
      // 0c8: goto 0cf
      // 0cb: invokestatic qyi.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: aload 6
      // 0d2: bipush 1
      // 0d3: bipush 2
      // 0d4: bipush 0
      // 0d5: invokevirtual qyi.ghh (Lerg;IIZ)Z
      // 0d8: iload 3
      // 0d9: ifeq 178
      // 0dc: goto 0e3
      // 0df: invokestatic qyi.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: ifne 173
      // 0e6: goto 0ed
      // 0e9: invokestatic qyi.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aconst_null
      // 0ee: areturn
      // 0ef: invokestatic qyi.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: bipush 0
      // 0f5: invokevirtual qyi.ajr (I)Lvrx;
      // 0f8: aload 6
      // 0fa: invokevirtual vrx.xvl (Lerg;)Z
      // 0fd: iload 3
      // 0fe: ifeq 138
      // 101: ifeq 12f
      // 104: goto 10b
      // 107: invokestatic qyi.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: aload 6
      // 10e: bipush 0
      // 10f: bipush 1
      // 110: bipush 0
      // 111: invokevirtual qyi.ghh (Lerg;IIZ)Z
      // 114: iload 3
      // 115: ifeq 178
      // 118: goto 11f
      // 11b: invokestatic qyi.a (Loov;)Loov;
      // 11e: athrow
      // 11f: ifne 173
      // 122: goto 129
      // 125: invokestatic qyi.a (Loov;)Loov;
      // 128: athrow
      // 129: aconst_null
      // 12a: areturn
      // 12b: invokestatic qyi.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield qyi.x4q Lrsi;
      // 133: invokeinterface rsi.opt ()I 1
      // 138: iload 3
      // 139: ifeq 15f
      // 13c: bipush 2
      // 13d: if_icmple 16d
      // 140: goto 147
      // 143: invokestatic qyi.a (Loov;)Loov;
      // 146: athrow
      // 147: aload 0
      // 148: aload 6
      // 14a: bipush 2
      // 14b: aload 0
      // 14c: getfield qyi.x4q Lrsi;
      // 14f: invokeinterface rsi.opt ()I 1
      // 154: bipush 0
      // 155: invokevirtual qyi.ghh (Lerg;IIZ)Z
      // 158: goto 15f
      // 15b: invokestatic qyi.a (Loov;)Loov;
      // 15e: athrow
      // 15f: iload 3
      // 160: ifeq 178
      // 163: ifne 173
      // 166: goto 16d
      // 169: invokestatic qyi.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aconst_null
      // 16e: areturn
      // 16f: invokestatic qyi.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 6
      // 175: getfield erg.qd2 I
      // 178: ifne 18f
      // 17b: aload 5
      // 17d: aconst_null
      // 17e: checkcast erg
      // 181: invokevirtual vrx.yn7 (Lerg;)V
      // 184: iload 3
      // 185: ifne 19b
      // 188: goto 18f
      // 18b: invokestatic qyi.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 5
      // 191: invokevirtual vrx.vc1 ()V
      // 194: goto 19b
      // 197: invokestatic qyi.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 4
      // 19d: areturn
   }

   @Override
   public void qi6(ha9 var1) {
      super.qi6(var1);
      this.x4q.vhz(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
