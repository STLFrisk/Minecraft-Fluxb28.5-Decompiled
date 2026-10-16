public class i3n extends _jc {
   public i3n(jnq var1, rsi var2, ha9 var3) {
      int var10000 = OpaquePredicate.c();
      this.t4u = var2;
      var2.dk0(var3);
      int var4 = var10000;
      byte var5 = 51;
      int var6 = 0;

      while (true) {
         if (var6 < var2.opt()) {
            try {
               this.zmp(new vrx(var2, var6, 44 + var6 * 18, 20));
               var6++;
               if (var4 != 0) {
                  break;
               }

               if (var4 == 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         var6 = 0;
         break;
      }

      label60: {
         label59:
         do {
            try {
               if (var6 >= 3) {
                  break;
               }

               var12 = 0;
               if (var4 != 0) {
                  break label60;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            int var7 = var12;

            while (var7 < 9) {
               try {
                  this.zmp(new vrx(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, var6 * 18 + var5));
                  var7++;
                  if (var4 != 0) {
                     continue label59;
                  }

                  if (var4 != 0) {
                     break;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }
            }

            var6++;
         } while (var4 == 0);

         var12 = 0;
      }

      var6 = var12;

      while (var6 < 9) {
         this.zmp(new vrx(var1, var6, 8 + var6 * 18, 58 + var5));
         var6++;
         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public boolean spj(ha9 var1) {
      return this.t4u.dnv(var1);
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
      // 03: invokestatic OpaquePredicate.c ()I
      // 06: aload 0
      // 07: getfield i3n.wjd Ljava/util/List;
      // 0a: iload 2
      // 0b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10: checkcast vrx
      // 13: astore 5
      // 15: istore 3
      // 16: aload 5
      // 18: iload 3
      // 19: ifne 28
      // 1c: ifnull e7
      // 1f: goto 26
      // 22: invokestatic i3n.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 5
      // 28: iload 3
      // 29: ifne 42
      // 2c: invokevirtual vrx.hf8 ()Z
      // 2f: ifeq e7
      // 32: goto 39
      // 35: invokestatic i3n.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 5
      // 3b: goto 42
      // 3e: invokestatic i3n.a (Loov;)Loov;
      // 41: athrow
      // 42: invokevirtual vrx.x4s ()Lerg;
      // 45: astore 6
      // 47: aload 6
      // 49: invokevirtual erg.yaq ()Lerg;
      // 4c: astore 4
      // 4e: iload 2
      // 4f: iload 3
      // 50: ifne ab
      // 53: aload 0
      // 54: getfield i3n.t4u Lrsi;
      // 57: invokeinterface rsi.opt ()I 1
      // 5c: if_icmpge 9a
      // 5f: goto 66
      // 62: invokestatic i3n.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: aload 6
      // 69: aload 0
      // 6a: getfield i3n.t4u Lrsi;
      // 6d: invokeinterface rsi.opt ()I 1
      // 72: aload 0
      // 73: getfield i3n.wjd Ljava/util/List;
      // 76: invokeinterface java/util/List.size ()I 1
      // 7b: bipush 1
      // 7c: invokevirtual i3n.ghh (Lerg;IIZ)Z
      // 7f: iload 3
      // 80: ifne c4
      // 83: goto 8a
      // 86: invokestatic i3n.a (Loov;)Loov;
      // 89: athrow
      // 8a: ifne bf
      // 8d: goto 94
      // 90: invokestatic i3n.a (Loov;)Loov;
      // 93: athrow
      // 94: aconst_null
      // 95: areturn
      // 96: invokestatic i3n.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 0
      // 9b: aload 6
      // 9d: bipush 0
      // 9e: aload 0
      // 9f: getfield i3n.t4u Lrsi;
      // a2: invokeinterface rsi.opt ()I 1
      // a7: bipush 0
      // a8: invokevirtual i3n.ghh (Lerg;IIZ)Z
      // ab: iload 3
      // ac: ifne c4
      // af: ifne bf
      // b2: goto b9
      // b5: invokestatic i3n.a (Loov;)Loov;
      // b8: athrow
      // b9: aconst_null
      // ba: areturn
      // bb: invokestatic i3n.a (Loov;)Loov;
      // be: athrow
      // bf: aload 6
      // c1: getfield erg.qd2 I
      // c4: ifne db
      // c7: aload 5
      // c9: aconst_null
      // ca: checkcast erg
      // cd: invokevirtual vrx.yn7 (Lerg;)V
      // d0: iload 3
      // d1: ifeq e7
      // d4: goto db
      // d7: invokestatic i3n.a (Loov;)Loov;
      // da: athrow
      // db: aload 5
      // dd: invokevirtual vrx.vc1 ()V
      // e0: goto e7
      // e3: invokestatic i3n.a (Loov;)Loov;
      // e6: athrow
      // e7: aload 4
      // e9: areturn
   }

   @Override
   public void qi6(ha9 var1) {
      super.qi6(var1);
      this.t4u.vhz(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
