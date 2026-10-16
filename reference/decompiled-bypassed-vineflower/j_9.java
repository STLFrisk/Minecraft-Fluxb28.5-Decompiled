public class j_9 extends _jc {
   public j_9(rsi var1, rsi var2, ha9 var3) {
      int var10000 = t9d.b();
      sm0.pbl.u1k();
      this.j8d = var2;
      int var4 = var10000;
      this.szd = var2.opt() / 9;
      var2.dk0(var3);
      int var5 = (this.szd - 4) * 18;
      int var6 = 0;

      while (true) {
         if (var6 < this.szd) {
            var13 = 0;
            if (var4 == 0) {
               break;
            }

            int var7 = 0;

            label76: {
               while (var7 < 9) {
                  try {
                     this.zmp(new vrx(var2, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
                     var7++;
                     if (var4 == 0) {
                        break label76;
                     }

                     if (var4 == 0) {
                        break;
                     }
                  } catch (oov var9) {
                     throw a(var9);
                  }
               }

               var6++;
            }

            if (var4 != 0) {
               continue;
            }
         }

         var13 = 0;
         break;
      }

      var6 = var13;

      while (true) {
         if (var6 < 3) {
            var14 = 0;
            if (var4 == 0) {
               break;
            }

            int var12 = 0;

            label55: {
               while (var12 < 9) {
                  try {
                     this.zmp(new vrx(var1, var12 + var6 * 9 + 9, 8 + var12 * 18, 103 + var6 * 18 + var5));
                     var12++;
                     if (var4 == 0) {
                        break label55;
                     }

                     if (var4 == 0) {
                        break;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }
               }

               var6++;
            }

            if (var4 != 0) {
               continue;
            }
         }

         var14 = 0;
         break;
      }

      var6 = var14;

      while (var6 < 9) {
         this.zmp(new vrx(var1, var6, 8 + var6 * 18, 161 + var5));
         var6++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public boolean spj(ha9 var1) {
      return this.j8d.dnv(var1);
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
      // 00: aconst_null
      // 01: astore 4
      // 03: invokestatic t9d.c ()I
      // 06: aload 0
      // 07: getfield j_9.wjd Ljava/util/List;
      // 0a: iload 2
      // 0b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10: checkcast vrx
      // 13: astore 5
      // 15: istore 3
      // 16: aload 5
      // 18: iload 3
      // 19: ifne 28
      // 1c: ifnull e1
      // 1f: goto 26
      // 22: invokestatic j_9.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 5
      // 28: iload 3
      // 29: ifne 42
      // 2c: invokevirtual vrx.hf8 ()Z
      // 2f: ifeq e1
      // 32: goto 39
      // 35: invokestatic j_9.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 5
      // 3b: goto 42
      // 3e: invokestatic j_9.a (Loov;)Loov;
      // 41: athrow
      // 42: invokevirtual vrx.x4s ()Lerg;
      // 45: astore 6
      // 47: aload 6
      // 49: invokevirtual erg.yaq ()Lerg;
      // 4c: astore 4
      // 4e: iload 2
      // 4f: iload 3
      // 50: ifne a5
      // 53: aload 0
      // 54: getfield j_9.szd I
      // 57: bipush 9
      // 59: imul
      // 5a: if_icmpge 96
      // 5d: goto 64
      // 60: invokestatic j_9.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: aload 6
      // 67: aload 0
      // 68: getfield j_9.szd I
      // 6b: bipush 9
      // 6d: imul
      // 6e: aload 0
      // 6f: getfield j_9.wjd Ljava/util/List;
      // 72: invokeinterface java/util/List.size ()I 1
      // 77: bipush 1
      // 78: invokevirtual j_9.ghh (Lerg;IIZ)Z
      // 7b: iload 3
      // 7c: ifne be
      // 7f: goto 86
      // 82: invokestatic j_9.a (Loov;)Loov;
      // 85: athrow
      // 86: ifne b9
      // 89: goto 90
      // 8c: invokestatic j_9.a (Loov;)Loov;
      // 8f: athrow
      // 90: aconst_null
      // 91: areturn
      // 92: invokestatic j_9.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: aload 6
      // 99: bipush 0
      // 9a: aload 0
      // 9b: getfield j_9.szd I
      // 9e: bipush 9
      // a0: imul
      // a1: bipush 0
      // a2: invokevirtual j_9.ghh (Lerg;IIZ)Z
      // a5: iload 3
      // a6: ifne be
      // a9: ifne b9
      // ac: goto b3
      // af: invokestatic j_9.a (Loov;)Loov;
      // b2: athrow
      // b3: aconst_null
      // b4: areturn
      // b5: invokestatic j_9.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 6
      // bb: getfield erg.qd2 I
      // be: ifne d5
      // c1: aload 5
      // c3: aconst_null
      // c4: checkcast erg
      // c7: invokevirtual vrx.yn7 (Lerg;)V
      // ca: iload 3
      // cb: ifeq e1
      // ce: goto d5
      // d1: invokestatic j_9.a (Loov;)Loov;
      // d4: athrow
      // d5: aload 5
      // d7: invokevirtual vrx.vc1 ()V
      // da: goto e1
      // dd: invokestatic j_9.a (Loov;)Loov;
      // e0: athrow
      // e1: aload 4
      // e3: areturn
   }

   @Override
   public void qi6(ha9 var1) {
      super.qi6(var1);
      this.j8d.vhz(var1);
   }

   public rsi giu() {
      return this.j8d;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
