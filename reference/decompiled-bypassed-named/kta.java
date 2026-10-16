public class kta extends _jc {
   public z0_ lgh;
   public rsi wu6;
   public boolean n7x;
   private final ha9 _9a;

   public kta(jnq var1, boolean var2, ha9 var3) {
      int var10000 = OpaquePredicate.b();
      this.lgh = new z0_(this, 2, 2);
      this.wu6 = new pod();
      this.n7x = var2;
      int var4 = var10000;
      this._9a = var3;
      this.zmp(new l_w(var1.jsr, this.lgh, this.wu6, 0, 144, 36));
      int var5 = 0;

      while (true) {
         if (var5 < 2) {
            var16 = 0;
            if (var4 == 0) {
               break;
            }

            int var6 = 0;

            label108: {
               while (var6 < 2) {
                  try {
                     this.zmp(new vrx(this.lgh, var6 + var5 * 2, 88 + var6 * 18, 26 + var5 * 18));
                     var6++;
                     if (var4 == 0) {
                        break label108;
                     }

                     if (var4 == 0) {
                        break;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }
               }

               var5++;
            }

            if (var4 != 0) {
               continue;
            }
         }

         var16 = 0;
         break;
      }

      var5 = var16;

      while (true) {
         if (var5 < 4) {
            int var14 = var5;

            try {
               this.zmp(new kta$1(this, var1, var1.opt() - 1 - var5, 8, 8 + var5 * 18, var14));
               var5++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         var5 = 0;
         break;
      }

      label82: {
         label81:
         do {
            try {
               if (var5 >= 3) {
                  break;
               }

               var17 = 0;
               if (var4 == 0) {
                  break label82;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            int var15 = var17;

            while (var15 < 9) {
               try {
                  this.zmp(new vrx(var1, var15 + (var5 + 1) * 9, 8 + var15 * 18, 84 + var5 * 18));
                  var15++;
                  if (var4 == 0) {
                     continue label81;
                  }

                  if (var4 == 0) {
                     break;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }
            }

            var5++;
         } while (var4 != 0);

         var17 = 0;
      }

      var5 = var17;

      while (true) {
         if (var5 < 9) {
            try {
               this.zmp(new vrx(var1, var5, 8 + var5 * 18, 142));
               var5++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         this.ih9(this.lgh);
         break;
      }
   }

   @Override
   public void ih9(rsi var1) {
      this.wu6.cxl(0, opt.c4k().bhr(this.lgh, this._9a.oay));
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
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial _jc.qi6 (Lha9;)V
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: bipush 0
      // 09: istore 3
      // 0a: istore 2
      // 0b: iload 3
      // 0c: bipush 4
      // 0d: if_icmpge 4b
      // 10: aload 0
      // 11: getfield kta.lgh Lz0_;
      // 14: iload 3
      // 15: invokevirtual z0_.yvk (I)Lerg;
      // 18: astore 4
      // 1a: iload 2
      // 1b: ifeq 59
      // 1e: iload 2
      // 1f: ifeq 47
      // 22: goto 29
      // 25: invokestatic kta.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 4
      // 2b: ifnull 44
      // 2e: goto 35
      // 31: invokestatic kta.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 1
      // 36: aload 4
      // 38: bipush 0
      // 39: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 3c: pop
      // 3d: goto 44
      // 40: invokestatic kta.a (Loov;)Loov;
      // 43: athrow
      // 44: iinc 3 1
      // 47: iload 2
      // 48: ifne 0b
      // 4b: aload 0
      // 4c: getfield kta.wu6 Lrsi;
      // 4f: bipush 0
      // 50: aconst_null
      // 51: checkcast erg
      // 54: invokeinterface rsi.cxl (ILerg;)V 3
      // 59: return
   }

   @Override
   public boolean spj(ha9 var1) {
      return true;
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
      // 007: getfield kta.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifeq 028
      // 01c: ifnull 29e
      // 01f: goto 026
      // 022: invokestatic kta.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifeq 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 29e
      // 032: goto 039
      // 035: invokestatic kta.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic kta.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifeq 08d
      // 053: ifne 085
      // 056: goto 05d
      // 059: invokestatic kta.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: aload 6
      // 060: bipush 9
      // 062: bipush 45
      // 064: bipush 1
      // 065: invokevirtual kta.ghh (Lerg;IIZ)Z
      // 068: ifne 078
      // 06b: goto 072
      // 06e: invokestatic kta.a (Loov;)Loov;
      // 071: athrow
      // 072: aconst_null
      // 073: areturn
      // 074: invokestatic kta.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 5
      // 07a: aload 6
      // 07c: aload 4
      // 07e: invokevirtual vrx._0c (Lerg;Lerg;)V
      // 081: iload 3
      // 082: ifne 25b
      // 085: iload 2
      // 086: goto 08d
      // 089: invokestatic kta.a (Loov;)Loov;
      // 08c: athrow
      // 08d: bipush 1
      // 08e: iload 3
      // 08f: ifeq 0e6
      // 092: if_icmplt 0d9
      // 095: goto 09c
      // 098: invokestatic kta.a (Loov;)Loov;
      // 09b: athrow
      // 09c: iload 2
      // 09d: bipush 5
      // 09e: iload 3
      // 09f: ifeq 0e6
      // 0a2: goto 0a9
      // 0a5: invokestatic kta.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: if_icmpge 0d9
      // 0ac: goto 0b3
      // 0af: invokestatic kta.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: aload 6
      // 0b6: bipush 9
      // 0b8: bipush 45
      // 0ba: bipush 0
      // 0bb: invokevirtual kta.ghh (Lerg;IIZ)Z
      // 0be: iload 3
      // 0bf: ifeq 260
      // 0c2: goto 0c9
      // 0c5: invokestatic kta.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: ifne 25b
      // 0cc: goto 0d3
      // 0cf: invokestatic kta.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aconst_null
      // 0d4: areturn
      // 0d5: invokestatic kta.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iload 2
      // 0da: iload 3
      // 0db: ifeq 12f
      // 0de: bipush 5
      // 0df: goto 0e6
      // 0e2: invokestatic kta.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: if_icmplt 127
      // 0e9: iload 2
      // 0ea: iload 3
      // 0eb: ifeq 12f
      // 0ee: goto 0f5
      // 0f1: invokestatic kta.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: bipush 9
      // 0f7: if_icmpge 127
      // 0fa: goto 101
      // 0fd: invokestatic kta.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: aload 6
      // 104: bipush 9
      // 106: bipush 45
      // 108: bipush 0
      // 109: invokevirtual kta.ghh (Lerg;IIZ)Z
      // 10c: iload 3
      // 10d: ifeq 260
      // 110: goto 117
      // 113: invokestatic kta.a (Loov;)Loov;
      // 116: athrow
      // 117: ifne 25b
      // 11a: goto 121
      // 11d: invokestatic kta.a (Loov;)Loov;
      // 120: athrow
      // 121: aconst_null
      // 122: areturn
      // 123: invokestatic kta.a (Loov;)Loov;
      // 126: athrow
      // 127: aload 4
      // 129: invokevirtual erg.gn1 ()Lu7m;
      // 12c: instanceof jpt
      // 12f: iload 3
      // 130: ifeq 19f
      // 133: ifeq 197
      // 136: goto 13d
      // 139: invokestatic kta.a (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield kta.wjd Ljava/util/List;
      // 141: bipush 5
      // 142: aload 4
      // 144: invokevirtual erg.gn1 ()Lu7m;
      // 147: checkcast jpt
      // 14a: getfield jpt.nbs I
      // 14d: iadd
      // 14e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 153: checkcast vrx
      // 156: invokevirtual vrx.hf8 ()Z
      // 159: iload 3
      // 15a: ifeq 19f
      // 15d: goto 164
      // 160: invokestatic kta.a (Loov;)Loov;
      // 163: athrow
      // 164: ifne 197
      // 167: goto 16e
      // 16a: invokestatic kta.a (Loov;)Loov;
      // 16d: athrow
      // 16e: bipush 5
      // 16f: aload 4
      // 171: invokevirtual erg.gn1 ()Lu7m;
      // 174: checkcast jpt
      // 177: getfield jpt.nbs I
      // 17a: iadd
      // 17b: istore 7
      // 17d: aload 0
      // 17e: aload 6
      // 180: iload 7
      // 182: iload 7
      // 184: bipush 1
      // 185: iadd
      // 186: bipush 0
      // 187: invokevirtual kta.ghh (Lerg;IIZ)Z
      // 18a: ifne 193
      // 18d: aconst_null
      // 18e: areturn
      // 18f: invokestatic kta.a (Loov;)Loov;
      // 192: athrow
      // 193: iload 3
      // 194: ifne 25b
      // 197: iload 2
      // 198: goto 19f
      // 19b: invokestatic kta.a (Loov;)Loov;
      // 19e: athrow
      // 19f: bipush 9
      // 1a1: iload 3
      // 1a2: ifeq 1fb
      // 1a5: if_icmplt 1ed
      // 1a8: goto 1af
      // 1ab: invokestatic kta.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: iload 2
      // 1b0: bipush 36
      // 1b2: iload 3
      // 1b3: ifeq 1fb
      // 1b6: goto 1bd
      // 1b9: invokestatic kta.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: if_icmpge 1ed
      // 1c0: goto 1c7
      // 1c3: invokestatic kta.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: aload 6
      // 1ca: bipush 36
      // 1cc: bipush 45
      // 1ce: bipush 0
      // 1cf: invokevirtual kta.ghh (Lerg;IIZ)Z
      // 1d2: iload 3
      // 1d3: ifeq 260
      // 1d6: goto 1dd
      // 1d9: invokestatic kta.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: ifne 25b
      // 1e0: goto 1e7
      // 1e3: invokestatic kta.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: aconst_null
      // 1e8: areturn
      // 1e9: invokestatic kta.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: iload 2
      // 1ee: iload 3
      // 1ef: ifeq 247
      // 1f2: bipush 36
      // 1f4: goto 1fb
      // 1f7: invokestatic kta.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: if_icmplt 23c
      // 1fe: iload 2
      // 1ff: iload 3
      // 200: ifeq 247
      // 203: goto 20a
      // 206: invokestatic kta.a (Loov;)Loov;
      // 209: athrow
      // 20a: bipush 45
      // 20c: if_icmpge 23c
      // 20f: goto 216
      // 212: invokestatic kta.a (Loov;)Loov;
      // 215: athrow
      // 216: aload 0
      // 217: aload 6
      // 219: bipush 9
      // 21b: bipush 36
      // 21d: bipush 0
      // 21e: invokevirtual kta.ghh (Lerg;IIZ)Z
      // 221: iload 3
      // 222: ifeq 260
      // 225: goto 22c
      // 228: invokestatic kta.a (Loov;)Loov;
      // 22b: athrow
      // 22c: ifne 25b
      // 22f: goto 236
      // 232: invokestatic kta.a (Loov;)Loov;
      // 235: athrow
      // 236: aconst_null
      // 237: areturn
      // 238: invokestatic kta.a (Loov;)Loov;
      // 23b: athrow
      // 23c: aload 0
      // 23d: aload 6
      // 23f: bipush 9
      // 241: bipush 45
      // 243: bipush 0
      // 244: invokevirtual kta.ghh (Lerg;IIZ)Z
      // 247: iload 3
      // 248: ifeq 260
      // 24b: ifne 25b
      // 24e: goto 255
      // 251: invokestatic kta.a (Loov;)Loov;
      // 254: athrow
      // 255: aconst_null
      // 256: areturn
      // 257: invokestatic kta.a (Loov;)Loov;
      // 25a: athrow
      // 25b: aload 6
      // 25d: getfield erg.qd2 I
      // 260: ifne 277
      // 263: aload 5
      // 265: aconst_null
      // 266: checkcast erg
      // 269: invokevirtual vrx.yn7 (Lerg;)V
      // 26c: iload 3
      // 26d: ifne 283
      // 270: goto 277
      // 273: invokestatic kta.a (Loov;)Loov;
      // 276: athrow
      // 277: aload 5
      // 279: invokevirtual vrx.vc1 ()V
      // 27c: goto 283
      // 27f: invokestatic kta.a (Loov;)Loov;
      // 282: athrow
      // 283: aload 6
      // 285: getfield erg.qd2 I
      // 288: aload 4
      // 28a: getfield erg.qd2 I
      // 28d: if_icmpne 296
      // 290: aconst_null
      // 291: areturn
      // 292: invokestatic kta.a (Loov;)Loov;
      // 295: athrow
      // 296: aload 5
      // 298: aload 1
      // 299: aload 6
      // 29b: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 29e: aload 4
      // 2a0: areturn
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: getfield vrx.k0y Lrsi;
      // 08: aload 0
      // 09: getfield kta.wu6 Lrsi;
      // 0c: if_acmpeq 2e
      // 0f: aload 0
      // 10: aload 1
      // 11: aload 2
      // 12: invokespecial _jc.c6n (Lerg;Lvrx;)Z
      // 15: iload 3
      // 16: ifne 2b
      // 19: goto 20
      // 1c: invokestatic kta.a (Loov;)Loov;
      // 1f: athrow
      // 20: ifeq 2e
      // 23: goto 2a
      // 26: invokestatic kta.a (Loov;)Loov;
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
