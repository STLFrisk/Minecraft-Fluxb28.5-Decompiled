public class l3j extends _jc {
   public z0_ ya4 = new z0_(this, 3, 3);
   public rsi hr4 = new pod();

   public l3j(jnq var1, t9d var2, mew var3) {
      this.vca = var2;
      int var10000 = t9d.c();
      this.cr1 = var3;
      int var4 = var10000;
      this.zmp(new l_w(var1.jsr, this.ya4, this.hr4, 0, 124, 35));
      int var5 = 0;

      while (true) {
         if (var5 < 3) {
            var13 = 0;
            if (var4 != 0) {
               break;
            }

            int var6 = 0;

            label84: {
               while (var6 < 3) {
                  try {
                     this.zmp(new vrx(this.ya4, var6 + var5 * 3, 30 + var6 * 18, 17 + var5 * 18));
                     var6++;
                     if (var4 != 0) {
                        break label84;
                     }

                     if (var4 != 0) {
                        break;
                     }
                  } catch (oov var9) {
                     throw a(var9);
                  }
               }

               var5++;
            }

            if (var4 == 0) {
               continue;
            }
         }

         var13 = 0;
         break;
      }

      var5 = var13;

      while (true) {
         if (var5 < 3) {
            var14 = 0;
            if (var4 != 0) {
               break;
            }

            int var12 = 0;

            label63: {
               while (var12 < 9) {
                  try {
                     this.zmp(new vrx(var1, var12 + var5 * 9 + 9, 8 + var12 * 18, 84 + var5 * 18));
                     var12++;
                     if (var4 != 0) {
                        break label63;
                     }

                     if (var4 != 0) {
                        break;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }
               }

               var5++;
            }

            if (var4 == 0) {
               continue;
            }
         }

         var14 = 0;
         break;
      }

      var5 = var14;

      while (true) {
         if (var5 < 9) {
            try {
               this.zmp(new vrx(var1, var5, 8 + var5 * 18, 142));
               var5++;
               if (var4 != 0) {
                  break;
               }

               if (var4 == 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         this.ih9(this.ya4);
         break;
      }
   }

   @Override
   public void ih9(rsi var1) {
      this.hr4.cxl(0, opt.c4k().bhr(this.ya4, this.vca));
   }

   @Override
   public void qi6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial _jc.qi6 (Lha9;)V
      // 09: aload 0
      // 0a: getfield l3j.vca Lt9d;
      // 0d: getfield t9d.v0f Z
      // 10: iload 2
      // 11: ifeq 1f
      // 14: ifne 56
      // 17: goto 1e
      // 1a: invokestatic l3j.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: istore 3
      // 20: iload 3
      // 21: bipush 9
      // 23: if_icmpge 56
      // 26: aload 0
      // 27: getfield l3j.ya4 Lz0_;
      // 2a: iload 3
      // 2b: invokevirtual z0_.yvk (I)Lerg;
      // 2e: astore 4
      // 30: iload 2
      // 31: ifeq 52
      // 34: aload 4
      // 36: ifnull 4f
      // 39: goto 40
      // 3c: invokestatic l3j.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 1
      // 41: aload 4
      // 43: bipush 0
      // 44: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 47: pop
      // 48: goto 4f
      // 4b: invokestatic l3j.a (Loov;)Loov;
      // 4e: athrow
      // 4f: iinc 3 1
      // 52: iload 2
      // 53: ifne 20
      // 56: return
   }

   @Override
   public boolean spj(ha9 var1) {
      int var2 = t9d.c();

      try {
         if (this.vca.getBlockState(this.cr1).r_y() != ox_.nxz) {
            return (boolean)0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         double var5;
         int var10000 = (var5 = var1.p53((double)this.cr1.getX() + 0.5, (double)this.cr1.getY() + 0.5, (double)this.cr1.getZ() + 0.5) - 64.0) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
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
      // 003: invokestatic t9d.c ()I
      // 006: aload 0
      // 007: getfield l3j.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifne 028
      // 01c: ifnull 18c
      // 01f: goto 026
      // 022: invokestatic l3j.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifne 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 18c
      // 032: goto 039
      // 035: invokestatic l3j.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic l3j.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifne 08d
      // 053: ifne 085
      // 056: goto 05d
      // 059: invokestatic l3j.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: aload 6
      // 060: bipush 10
      // 062: bipush 46
      // 064: bipush 1
      // 065: invokevirtual l3j.ghh (Lerg;IIZ)Z
      // 068: ifne 078
      // 06b: goto 072
      // 06e: invokestatic l3j.a (Loov;)Loov;
      // 071: athrow
      // 072: aconst_null
      // 073: areturn
      // 074: invokestatic l3j.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 5
      // 07a: aload 6
      // 07c: aload 4
      // 07e: invokevirtual vrx._0c (Lerg;Lerg;)V
      // 081: iload 3
      // 082: ifeq 149
      // 085: iload 2
      // 086: goto 08d
      // 089: invokestatic l3j.a (Loov;)Loov;
      // 08c: athrow
      // 08d: bipush 10
      // 08f: iload 3
      // 090: ifne 0e9
      // 093: if_icmplt 0db
      // 096: goto 09d
      // 099: invokestatic l3j.a (Loov;)Loov;
      // 09c: athrow
      // 09d: iload 2
      // 09e: bipush 37
      // 0a0: iload 3
      // 0a1: ifne 0e9
      // 0a4: goto 0ab
      // 0a7: invokestatic l3j.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: if_icmpge 0db
      // 0ae: goto 0b5
      // 0b1: invokestatic l3j.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: aload 6
      // 0b8: bipush 37
      // 0ba: bipush 46
      // 0bc: bipush 0
      // 0bd: invokevirtual l3j.ghh (Lerg;IIZ)Z
      // 0c0: iload 3
      // 0c1: ifne 14e
      // 0c4: goto 0cb
      // 0c7: invokestatic l3j.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: ifne 149
      // 0ce: goto 0d5
      // 0d1: invokestatic l3j.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aconst_null
      // 0d6: areturn
      // 0d7: invokestatic l3j.a (Loov;)Loov;
      // 0da: athrow
      // 0db: iload 2
      // 0dc: iload 3
      // 0dd: ifne 135
      // 0e0: bipush 37
      // 0e2: goto 0e9
      // 0e5: invokestatic l3j.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: if_icmplt 12a
      // 0ec: iload 2
      // 0ed: iload 3
      // 0ee: ifne 135
      // 0f1: goto 0f8
      // 0f4: invokestatic l3j.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: bipush 46
      // 0fa: if_icmpge 12a
      // 0fd: goto 104
      // 100: invokestatic l3j.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: aload 6
      // 107: bipush 10
      // 109: bipush 37
      // 10b: bipush 0
      // 10c: invokevirtual l3j.ghh (Lerg;IIZ)Z
      // 10f: iload 3
      // 110: ifne 14e
      // 113: goto 11a
      // 116: invokestatic l3j.a (Loov;)Loov;
      // 119: athrow
      // 11a: ifne 149
      // 11d: goto 124
      // 120: invokestatic l3j.a (Loov;)Loov;
      // 123: athrow
      // 124: aconst_null
      // 125: areturn
      // 126: invokestatic l3j.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 0
      // 12b: aload 6
      // 12d: bipush 10
      // 12f: bipush 46
      // 131: bipush 0
      // 132: invokevirtual l3j.ghh (Lerg;IIZ)Z
      // 135: iload 3
      // 136: ifne 14e
      // 139: ifne 149
      // 13c: goto 143
      // 13f: invokestatic l3j.a (Loov;)Loov;
      // 142: athrow
      // 143: aconst_null
      // 144: areturn
      // 145: invokestatic l3j.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 6
      // 14b: getfield erg.qd2 I
      // 14e: ifne 165
      // 151: aload 5
      // 153: aconst_null
      // 154: checkcast erg
      // 157: invokevirtual vrx.yn7 (Lerg;)V
      // 15a: iload 3
      // 15b: ifeq 171
      // 15e: goto 165
      // 161: invokestatic l3j.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 5
      // 167: invokevirtual vrx.vc1 ()V
      // 16a: goto 171
      // 16d: invokestatic l3j.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 6
      // 173: getfield erg.qd2 I
      // 176: aload 4
      // 178: getfield erg.qd2 I
      // 17b: if_icmpne 184
      // 17e: aconst_null
      // 17f: areturn
      // 180: invokestatic l3j.a (Loov;)Loov;
      // 183: athrow
      // 184: aload 5
      // 186: aload 1
      // 187: aload 6
      // 189: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 18c: aload 4
      // 18e: areturn
   }

   @Override
   public boolean c6n(erg param1, vrx param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: getfield vrx.k0y Lrsi;
      // 08: aload 0
      // 09: getfield l3j.hr4 Lrsi;
      // 0c: if_acmpeq 2e
      // 0f: aload 0
      // 10: aload 1
      // 11: aload 2
      // 12: invokespecial _jc.c6n (Lerg;Lvrx;)Z
      // 15: iload 3
      // 16: ifne 2b
      // 19: goto 20
      // 1c: invokestatic l3j.a (Loov;)Loov;
      // 1f: athrow
      // 20: ifeq 2e
      // 23: goto 2a
      // 26: invokestatic l3j.a (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 2f
      // 2e: bipush 0
      // 2f: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
