import net.optifine.render.VboRegion;

public class c1s {
   public final crp uwu;
   public final t9d jhd;
   public int dtu;
   public int bjx;
   public int q7z;
   public kqk[] mzt;

   public c1s(t9d var1, int var2, crp var3, eg6 var4) {
      this.uwu = var3;
      this.jhd = var1;
      this.ixd(var2);
      this.vdv(var4);
   }

   public void vdv(eg6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield c1s.bjx I
      // 004: aload 0
      // 005: getfield c1s.dtu I
      // 008: imul
      // 009: aload 0
      // 00a: getfield c1s.q7z I
      // 00d: imul
      // 00e: istore 3
      // 00f: invokestatic t9d.c ()I
      // 012: aload 0
      // 013: iload 3
      // 014: anewarray 47
      // 017: putfield c1s.mzt [Lkqk;
      // 01a: bipush 0
      // 01b: istore 4
      // 01d: istore 2
      // 01e: bipush 0
      // 01f: istore 5
      // 021: iload 5
      // 023: aload 0
      // 024: getfield c1s.bjx I
      // 027: if_icmpge 0db
      // 02a: bipush 0
      // 02b: iload 2
      // 02c: ifne 0dc
      // 02f: istore 6
      // 031: iload 6
      // 033: aload 0
      // 034: getfield c1s.dtu I
      // 037: if_icmpge 0d4
      // 03a: bipush 0
      // 03b: iload 2
      // 03c: ifne 023
      // 03f: istore 7
      // 041: iload 7
      // 043: aload 0
      // 044: getfield c1s.q7z I
      // 047: if_icmpge 0cd
      // 04a: iload 7
      // 04c: aload 0
      // 04d: getfield c1s.dtu I
      // 050: imul
      // 051: iload 6
      // 053: iadd
      // 054: aload 0
      // 055: getfield c1s.bjx I
      // 058: imul
      // 059: iload 5
      // 05b: iadd
      // 05c: istore 8
      // 05e: new mew
      // 061: dup
      // 062: iload 5
      // 064: bipush 16
      // 066: imul
      // 067: iload 6
      // 069: bipush 16
      // 06b: imul
      // 06c: iload 7
      // 06e: bipush 16
      // 070: imul
      // 071: invokespecial mew.<init> (III)V
      // 074: astore 9
      // 076: aload 0
      // 077: getfield c1s.mzt [Lkqk;
      // 07a: iload 8
      // 07c: aload 1
      // 07d: aload 0
      // 07e: getfield c1s.jhd Lt9d;
      // 081: aload 0
      // 082: getfield c1s.uwu Lcrp;
      // 085: aload 9
      // 087: iload 4
      // 089: iinc 4 1
      // 08c: invokeinterface eg6.rek (Lt9d;Lcrp;Lmew;I)Lkqk; 5
      // 091: aastore
      // 092: iload 2
      // 093: ifne 0c9
      // 096: invokestatic hxt.x74 ()Z
      // 099: iload 2
      // 09a: ifne 033
      // 09d: goto 0a4
      // 0a0: invokestatic c1s.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: ifeq 0c6
      // 0a7: invokestatic hxt._al ()Z
      // 0aa: ifeq 0c6
      // 0ad: goto 0b4
      // 0b0: invokestatic c1s.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: aload 0
      // 0b6: getfield c1s.mzt [Lkqk;
      // 0b9: iload 8
      // 0bb: aaload
      // 0bc: invokespecial c1s.cpz (Lkqk;)V
      // 0bf: goto 0c6
      // 0c2: invokestatic c1s.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: iinc 7 1
      // 0c9: iload 2
      // 0ca: ifeq 041
      // 0cd: iinc 6 1
      // 0d0: iload 2
      // 0d1: ifeq 031
      // 0d4: iinc 5 1
      // 0d7: iload 2
      // 0d8: ifeq 021
      // 0db: bipush 0
      // 0dc: istore 5
      // 0de: iload 5
      // 0e0: aload 0
      // 0e1: getfield c1s.mzt [Lkqk;
      // 0e4: arraylength
      // 0e5: if_icmpge 138
      // 0e8: aload 0
      // 0e9: getfield c1s.mzt [Lkqk;
      // 0ec: iload 5
      // 0ee: aaload
      // 0ef: astore 6
      // 0f1: bipush 0
      // 0f2: istore 7
      // 0f4: iload 7
      // 0f6: getstatic vt2.vbu [Lvt2;
      // 0f9: arraylength
      // 0fa: if_icmpge 131
      // 0fd: getstatic vt2.vbu [Lvt2;
      // 100: iload 7
      // 102: aaload
      // 103: astore 8
      // 105: aload 6
      // 107: aload 8
      // 109: invokevirtual kqk.a8d (Lvt2;)Lmew;
      // 10c: astore 9
      // 10e: aload 0
      // 10f: aload 9
      // 111: invokevirtual c1s.bes (Lmew;)Lkqk;
      // 114: astore 10
      // 116: aload 6
      // 118: aload 8
      // 11a: aload 10
      // 11c: invokevirtual kqk.cfx (Lvt2;Lkqk;)V
      // 11f: iinc 7 1
      // 122: iload 2
      // 123: ifne 134
      // 126: iload 2
      // 127: ifeq 0f4
      // 12a: goto 131
      // 12d: invokestatic c1s.a (Loov;)Loov;
      // 130: athrow
      // 131: iinc 5 1
      // 134: iload 2
      // 135: ifeq 0de
      // 138: return
   }

   public void dfb() {
      kqk[] var2 = this.mzt;
      int var3 = var2.length;
      int var10000 = t9d.c();
      int var4 = 0;
      int var1 = var10000;

      while (true) {
         if (var4 < var3) {
            kqk var5 = var2[var4];

            try {
               var5.qv0();
               var4++;
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         this.tkk();
         break;
      }
   }

   public void ixd(int var1) {
      int var2 = var1 * 2 + 1;
      this.bjx = var2;
      this.dtu = 16;
      this.q7z = var2;
   }

   public void b4a(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dload 1
      // 001: invokestatic fe6.jqf (D)I
      // 004: bipush 8
      // 006: isub
      // 007: istore 6
      // 009: invokestatic t9d.b ()I
      // 00c: dload 3
      // 00d: invokestatic fe6.jqf (D)I
      // 010: bipush 8
      // 012: isub
      // 013: istore 7
      // 015: istore 5
      // 017: aload 0
      // 018: getfield c1s.bjx I
      // 01b: bipush 16
      // 01d: imul
      // 01e: istore 8
      // 020: bipush 0
      // 021: istore 9
      // 023: iload 9
      // 025: aload 0
      // 026: getfield c1s.bjx I
      // 029: if_icmpge 132
      // 02c: aload 0
      // 02d: iload 6
      // 02f: iload 8
      // 031: iload 9
      // 033: invokespecial c1s.kfw (III)I
      // 036: istore 10
      // 038: bipush 0
      // 039: istore 11
      // 03b: iload 11
      // 03d: aload 0
      // 03e: getfield c1s.q7z I
      // 041: if_icmpge 12a
      // 044: aload 0
      // 045: iload 7
      // 047: iload 8
      // 049: iload 11
      // 04b: invokespecial c1s.kfw (III)I
      // 04e: istore 12
      // 050: bipush 0
      // 051: iload 5
      // 053: ifeq 025
      // 056: istore 13
      // 058: iload 13
      // 05a: aload 0
      // 05b: getfield c1s.dtu I
      // 05e: if_icmpge 122
      // 061: iload 13
      // 063: bipush 16
      // 065: imul
      // 066: istore 14
      // 068: aload 0
      // 069: getfield c1s.mzt [Lkqk;
      // 06c: iload 11
      // 06e: aload 0
      // 06f: getfield c1s.dtu I
      // 072: imul
      // 073: iload 13
      // 075: iadd
      // 076: aload 0
      // 077: getfield c1s.bjx I
      // 07a: imul
      // 07b: iload 9
      // 07d: iadd
      // 07e: aaload
      // 07f: astore 15
      // 081: aload 15
      // 083: invokevirtual kqk.a7g ()Lmew;
      // 086: astore 16
      // 088: aload 16
      // 08a: iload 5
      // 08c: ifeq 0f1
      // 08f: invokevirtual mew.getX ()I
      // 092: iload 10
      // 094: iload 5
      // 096: ifeq 041
      // 099: goto 0a0
      // 09c: invokestatic c1s.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: if_icmpne 0dd
      // 0a3: aload 16
      // 0a5: iload 5
      // 0a7: ifeq 0f1
      // 0aa: goto 0b1
      // 0ad: invokestatic c1s.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: invokevirtual mew.getY ()I
      // 0b4: iload 14
      // 0b6: if_icmpne 0dd
      // 0b9: goto 0c0
      // 0bc: invokestatic c1s.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 16
      // 0c2: iload 5
      // 0c4: ifeq 0f1
      // 0c7: goto 0ce
      // 0ca: invokestatic c1s.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: invokevirtual mew.getZ ()I
      // 0d1: iload 12
      // 0d3: if_icmpeq 11a
      // 0d6: goto 0dd
      // 0d9: invokestatic c1s.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: new mew
      // 0e0: dup
      // 0e1: iload 10
      // 0e3: iload 14
      // 0e5: iload 12
      // 0e7: invokespecial mew.<init> (III)V
      // 0ea: goto 0f1
      // 0ed: invokestatic c1s.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: astore 17
      // 0f3: iload 5
      // 0f5: ifeq 11d
      // 0f8: aload 17
      // 0fa: aload 15
      // 0fc: invokevirtual kqk.a7g ()Lmew;
      // 0ff: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 102: ifne 11a
      // 105: goto 10c
      // 108: invokestatic c1s.a (Loov;)Loov;
      // 10b: athrow
      // 10c: aload 15
      // 10e: aload 17
      // 110: invokevirtual kqk.pap (Lmew;)V
      // 113: goto 11a
      // 116: invokestatic c1s.a (Loov;)Loov;
      // 119: athrow
      // 11a: iinc 13 1
      // 11d: iload 5
      // 11f: ifne 058
      // 122: iinc 11 1
      // 125: iload 5
      // 127: ifne 03b
      // 12a: iinc 9 1
      // 12d: iload 5
      // 12f: ifne 023
      // 132: return
   }

   private int kfw(int var1, int var2, int var3) {
      int var5 = var3 * 16;
      int var10000 = t9d.b();
      int var6 = var5 - var1 + var2 / 2;
      int var4 = var10000;

      try {
         if (var4 == 0) {
            return var6;
         }

         if (var6 >= 0) {
            return var5 - var6 / var2 * var2;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      var6 -= var2 - 1;
      return var5 - var6 / var2 * var2;
   }

   public void rid(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = fe6.zji(var1, 16);
      int var9 = fe6.zji(var2, 16);
      int var10 = fe6.zji(var3, 16);
      int var11 = fe6.zji(var4, 16);
      int var12 = fe6.zji(var5, 16);
      int var10000 = t9d.c();
      int var13 = fe6.zji(var6, 16);
      int var14 = var8;
      int var7 = var10000;

      label97:
      while (true) {
         var10000 = var14;

         label95:
         while (var10000 <= var11) {
            int var15 = var14 % this.bjx;

            label92: {
               label91: {
                  try {
                     var10000 = var15;
                     if (var7 != 0) {
                        break label92;
                     }

                     if (var15 >= 0) {
                        break label91;
                     }
                  } catch (oov var24) {
                     throw a(var24);
                  }

                  var15 += this.bjx;
               }

               var10000 = var9;
            }

            int var16 = var10000;

            label82:
            while (true) {
               var10000 = var16;

               label80:
               while (true) {
                  if (var10000 > var12) {
                     break label82;
                  }

                  int var17 = var16 % this.dtu;
                  var10000 = var17;
                  if (var7 != 0) {
                     continue label95;
                  }

                  label77: {
                     label76: {
                        try {
                           if (var7 != 0) {
                              break label77;
                           }

                           if (var10000 >= 0) {
                              break label76;
                           }
                        } catch (oov var23) {
                           throw a(var23);
                        }

                        var17 += this.dtu;
                     }

                     var10000 = var10;
                  }

                  int var18 = var10000;

                  while (var18 <= var13) {
                     int var19 = var18 % this.q7z;
                     var10000 = var19;
                     if (var7 != 0) {
                        continue label80;
                     }

                     label64: {
                        label63: {
                           try {
                              if (var7 != 0) {
                                 break label64;
                              }

                              if (var10000 >= 0) {
                                 break label63;
                              }
                           } catch (oov var22) {
                              throw a(var22);
                           }

                           var19 += this.q7z;
                        }

                        var10000 = (var19 * this.dtu + var17) * this.bjx + var15;
                     }

                     int var20 = var10000;
                     kqk var21 = this.mzt[var20];
                     var21.sf6(true);
                     var18++;
                     if (var7 != 0) {
                        break;
                     }
                  }

                  var16++;
                  if (var7 != 0) {
                     break label82;
                  }
                  break;
               }
            }

            var14++;
            if (var7 != 0) {
               return;
            }
            continue label97;
         }

         return;
      }
   }

   public kqk bes(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual mew.getX ()I
      // 04: bipush 4
      // 05: ishr
      // 06: istore 3
      // 07: aload 1
      // 08: invokevirtual mew.getY ()I
      // 0b: bipush 4
      // 0c: ishr
      // 0d: istore 4
      // 0f: invokestatic t9d.b ()I
      // 12: aload 1
      // 13: invokevirtual mew.getZ ()I
      // 16: bipush 4
      // 17: ishr
      // 18: istore 5
      // 1a: istore 2
      // 1b: iload 4
      // 1d: iload 2
      // 1e: ifeq 2d
      // 21: iflt a0
      // 24: goto 2b
      // 27: invokestatic c1s.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 4
      // 2d: aload 0
      // 2e: getfield c1s.dtu I
      // 31: iload 2
      // 32: ifeq 4b
      // 35: if_icmpge a0
      // 38: goto 3f
      // 3b: invokestatic c1s.a (Loov;)Loov;
      // 3e: athrow
      // 3f: iload 3
      // 40: aload 0
      // 41: getfield c1s.bjx I
      // 44: goto 4b
      // 47: invokestatic c1s.a (Loov;)Loov;
      // 4a: athrow
      // 4b: irem
      // 4c: istore 3
      // 4d: iload 3
      // 4e: iload 2
      // 4f: ifeq 6e
      // 52: ifge 63
      // 55: goto 5c
      // 58: invokestatic c1s.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 3
      // 5d: aload 0
      // 5e: getfield c1s.bjx I
      // 61: iadd
      // 62: istore 3
      // 63: iload 5
      // 65: aload 0
      // 66: getfield c1s.q7z I
      // 69: irem
      // 6a: istore 5
      // 6c: iload 5
      // 6e: iload 2
      // 6f: ifeq 96
      // 72: ifge 85
      // 75: goto 7c
      // 78: invokestatic c1s.a (Loov;)Loov;
      // 7b: athrow
      // 7c: iload 5
      // 7e: aload 0
      // 7f: getfield c1s.q7z I
      // 82: iadd
      // 83: istore 5
      // 85: iload 5
      // 87: aload 0
      // 88: getfield c1s.dtu I
      // 8b: imul
      // 8c: iload 4
      // 8e: iadd
      // 8f: aload 0
      // 90: getfield c1s.bjx I
      // 93: imul
      // 94: iload 3
      // 95: iadd
      // 96: istore 6
      // 98: aload 0
      // 99: getfield c1s.mzt [Lkqk;
      // 9c: iload 6
      // 9e: aaload
      // 9f: areturn
      // a0: aconst_null
      // a1: areturn
   }

   private void cpz(kqk param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual kqk.a7g ()Lmew;
      // 04: astore 3
      // 05: aload 3
      // 06: invokevirtual mew.getX ()I
      // 09: bipush 8
      // 0b: ishr
      // 0c: bipush 8
      // 0e: ishl
      // 0f: istore 4
      // 11: invokestatic t9d.c ()I
      // 14: aload 3
      // 15: invokevirtual mew.getZ ()I
      // 18: bipush 8
      // 1a: ishr
      // 1b: bipush 8
      // 1d: ishl
      // 1e: istore 5
      // 20: new h2f
      // 23: dup
      // 24: iload 4
      // 26: iload 5
      // 28: invokespecial h2f.<init> (II)V
      // 2b: astore 6
      // 2d: getstatic kqk.pxj [Lw51;
      // 30: astore 7
      // 32: aload 0
      // 33: getfield c1s.hk1 Ljava/util/Map;
      // 36: aload 6
      // 38: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3d: checkcast [Lnet/optifine/render/VboRegion;
      // 40: checkcast [Lnet/optifine/render/VboRegion;
      // 43: astore 8
      // 45: istore 2
      // 46: aload 8
      // 48: iload 2
      // 49: ifne 63
      // 4c: ifnonnull a1
      // 4f: goto 56
      // 52: invokestatic c1s.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 7
      // 58: arraylength
      // 59: anewarray 162
      // 5c: goto 63
      // 5f: invokestatic c1s.a (Loov;)Loov;
      // 62: athrow
      // 63: astore 8
      // 65: bipush 0
      // 66: istore 9
      // 68: iload 9
      // 6a: aload 7
      // 6c: arraylength
      // 6d: if_icmpge 93
      // 70: aload 8
      // 72: iload 9
      // 74: new net/optifine/render/VboRegion
      // 77: dup
      // 78: aload 7
      // 7a: iload 9
      // 7c: aaload
      // 7d: invokespecial net/optifine/render/VboRegion.<init> (Lw51;)V
      // 80: aastore
      // 81: iinc 9 1
      // 84: iload 2
      // 85: ifne a1
      // 88: iload 2
      // 89: ifeq 68
      // 8c: goto 93
      // 8f: invokestatic c1s.a (Loov;)Loov;
      // 92: athrow
      // 93: aload 0
      // 94: getfield c1s.hk1 Ljava/util/Map;
      // 97: aload 6
      // 99: aload 8
      // 9b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a0: pop
      // a1: bipush 0
      // a2: istore 9
      // a4: iload 9
      // a6: aload 7
      // a8: arraylength
      // a9: if_icmpge dc
      // ac: aload 8
      // ae: iload 9
      // b0: aaload
      // b1: astore 10
      // b3: iload 2
      // b4: ifne d8
      // b7: aload 10
      // b9: ifnull d5
      // bc: goto c3
      // bf: invokestatic c1s.a (Loov;)Loov;
      // c2: athrow
      // c3: aload 1
      // c4: iload 9
      // c6: invokevirtual kqk.lry (I)Lfab;
      // c9: aload 10
      // cb: invokevirtual fab.fb5 (Lnet/optifine/render/VboRegion;)V
      // ce: goto d5
      // d1: invokestatic c1s.a (Loov;)Loov;
      // d4: athrow
      // d5: iinc 9 1
      // d8: iload 2
      // d9: ifeq a4
      // dc: return
   }

   public void tkk() {
      int var1 = t9d.c();

      for (h2f var3 : this.hk1.keySet()) {
         Object var10000 = this.hk1.get(var3);

         label52:
         while (true) {
            VboRegion[] var4 = (VboRegion[])var10000;
            if (var1 != 0) {
               return;
            }

            int var5 = 0;

            while (true) {
               if (var5 >= var4.length) {
                  break label52;
               }

               VboRegion var6 = var4[var5];

               label64: {
                  try {
                     if (var1 != 0) {
                        break label64;
                     }

                     var10000 = var6;
                     if (var1 != 0) {
                        break;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }

                  try {
                     if (var10000 != null) {
                        var6.deleteGlBuffers();
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }

                  var4[var5] = null;
                  var5++;
               }

               if (var1 != 0) {
                  break label52;
               }
            }
         }

         if (var1 != 0) {
            break;
         }
      }

      this.hk1.clear();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
