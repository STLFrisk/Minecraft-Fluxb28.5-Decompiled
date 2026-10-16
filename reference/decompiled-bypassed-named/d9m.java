public class d9m extends _jc {
   public d9m(rsi var1, rsi var2) {
      this._be = var2;
      int var10000 = OpaquePredicate.c();
      int var4 = 0;
      int var3 = var10000;

      while (true) {
         if (var4 < 3) {
            var11 = 0;
            if (var3 != 0) {
               break;
            }

            int var5 = 0;

            label76: {
               while (var5 < 3) {
                  try {
                     this.zmp(new vrx(var2, var5 + var4 * 3, 62 + var5 * 18, 17 + var4 * 18));
                     var5++;
                     if (var3 != 0) {
                        break label76;
                     }

                     if (var3 != 0) {
                        break;
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }
               }

               var4++;
            }

            if (var3 == 0) {
               continue;
            }
         }

         var11 = 0;
         break;
      }

      var4 = var11;

      while (true) {
         if (var4 < 3) {
            var12 = 0;
            if (var3 != 0) {
               break;
            }

            int var10 = 0;

            label55: {
               while (var10 < 9) {
                  try {
                     this.zmp(new vrx(var1, var10 + var4 * 9 + 9, 8 + var10 * 18, 84 + var4 * 18));
                     var10++;
                     if (var3 != 0) {
                        break label55;
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

         var12 = 0;
         break;
      }

      var4 = var12;

      while (var4 < 9) {
         this.zmp(new vrx(var1, var4, 8 + var4 * 18, 142));
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   @Override
   public boolean spj(ha9 var1) {
      return this._be.dnv(var1);
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
      // 03: invokestatic OpaquePredicate.b ()I
      // 06: aload 0
      // 07: getfield d9m.wjd Ljava/util/List;
      // 0a: iload 2
      // 0b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10: checkcast vrx
      // 13: astore 5
      // 15: istore 3
      // 16: aload 5
      // 18: iload 3
      // 19: ifeq 28
      // 1c: ifnull e6
      // 1f: goto 26
      // 22: invokestatic d9m.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 5
      // 28: iload 3
      // 29: ifeq 42
      // 2c: invokevirtual vrx.hf8 ()Z
      // 2f: ifeq e6
      // 32: goto 39
      // 35: invokestatic d9m.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 5
      // 3b: goto 42
      // 3e: invokestatic d9m.a (Loov;)Loov;
      // 41: athrow
      // 42: invokevirtual vrx.x4s ()Lerg;
      // 45: astore 6
      // 47: aload 6
      // 49: invokevirtual erg.yaq ()Lerg;
      // 4c: astore 4
      // 4e: iload 2
      // 4f: iload 3
      // 50: ifeq 8f
      // 53: bipush 9
      // 55: if_icmpge 85
      // 58: goto 5f
      // 5b: invokestatic d9m.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 6
      // 62: bipush 9
      // 64: bipush 45
      // 66: bipush 1
      // 67: invokevirtual d9m.ghh (Lerg;IIZ)Z
      // 6a: iload 3
      // 6b: ifeq a8
      // 6e: goto 75
      // 71: invokestatic d9m.a (Loov;)Loov;
      // 74: athrow
      // 75: ifne a3
      // 78: goto 7f
      // 7b: invokestatic d9m.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aconst_null
      // 80: areturn
      // 81: invokestatic d9m.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: aload 6
      // 88: bipush 0
      // 89: bipush 9
      // 8b: bipush 0
      // 8c: invokevirtual d9m.ghh (Lerg;IIZ)Z
      // 8f: iload 3
      // 90: ifeq a8
      // 93: ifne a3
      // 96: goto 9d
      // 99: invokestatic d9m.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aconst_null
      // 9e: areturn
      // 9f: invokestatic d9m.a (Loov;)Loov;
      // a2: athrow
      // a3: aload 6
      // a5: getfield erg.qd2 I
      // a8: ifne bf
      // ab: aload 5
      // ad: aconst_null
      // ae: checkcast erg
      // b1: invokevirtual vrx.yn7 (Lerg;)V
      // b4: iload 3
      // b5: ifne cb
      // b8: goto bf
      // bb: invokestatic d9m.a (Loov;)Loov;
      // be: athrow
      // bf: aload 5
      // c1: invokevirtual vrx.vc1 ()V
      // c4: goto cb
      // c7: invokestatic d9m.a (Loov;)Loov;
      // ca: athrow
      // cb: aload 6
      // cd: getfield erg.qd2 I
      // d0: aload 4
      // d2: getfield erg.qd2 I
      // d5: if_icmpne de
      // d8: aconst_null
      // d9: areturn
      // da: invokestatic d9m.a (Loov;)Loov;
      // dd: athrow
      // de: aload 5
      // e0: aload 1
      // e1: aload 6
      // e3: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // e6: aload 4
      // e8: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
