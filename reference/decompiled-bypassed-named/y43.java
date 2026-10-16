public class y43 extends _jc {
   public y43(jnq var1, a7q var2, OpaquePredicate var3) {
      this.fr6 = var2;
      int var10000 = OpaquePredicate.c();
      this.ie4 = var3;
      this.dzo = new u42(var1.jsr, var2);
      this.zmp(new vrx(this.dzo, 0, 36, 53));
      this.zmp(new vrx(this.dzo, 1, 62, 53));
      int var4 = var10000;
      this.zmp(new q51(var1.jsr, var2, this.dzo, 2, 120, 53));
      int var5 = 0;

      while (true) {
         if (var5 < 3) {
            var9 = 0;
            if (var4 != 0) {
               break;
            }

            int var6 = 0;

            label42: {
               while (var6 < 9) {
                  try {
                     this.zmp(new vrx(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
                     var6++;
                     if (var4 != 0) {
                        break label42;
                     }

                     if (var4 != 0) {
                        break;
                     }
                  } catch (oov var7) {
                     throw a(var7);
                  }
               }

               var5++;
            }

            if (var4 == 0) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      var5 = var9;

      while (var5 < 9) {
         this.zmp(new vrx(var1, var5, 8 + var5 * 18, 142));
         var5++;
         if (var4 != 0) {
            break;
         }
      }
   }

   public u42 x0a() {
      return this.dzo;
   }

   @Override
   public void c_j(flv var1) {
      super.c_j(var1);
   }

   @Override
   public void n4z() {
      super.n4z();
   }

   @Override
   public void ih9(rsi var1) {
      this.dzo.jcn();
      super.ih9(var1);
   }

   public void _aw(int var1) {
      this.dzo.oec(var1);
   }

   @Override
   public void l0n(int var1, int var2) {
   }

   @Override
   public boolean spj(ha9 var1) {
      try {
         if (this.fr6.rbk() == var1) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
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
      // 007: getfield y43.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifne 028
      // 01c: ifnull 1b6
      // 01f: goto 026
      // 022: invokestatic y43.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifne 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 1b6
      // 032: goto 039
      // 035: invokestatic y43.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic y43.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifne 08d
      // 053: bipush 2
      // 054: if_icmpne 085
      // 057: goto 05e
      // 05a: invokestatic y43.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 6
      // 061: bipush 3
      // 062: bipush 39
      // 064: bipush 1
      // 065: invokevirtual y43.ghh (Lerg;IIZ)Z
      // 068: ifne 078
      // 06b: goto 072
      // 06e: invokestatic y43.a (Loov;)Loov;
      // 071: athrow
      // 072: aconst_null
      // 073: areturn
      // 074: invokestatic y43.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 5
      // 07a: aload 6
      // 07c: aload 4
      // 07e: invokevirtual vrx._0c (Lerg;Lerg;)V
      // 081: iload 3
      // 082: ifeq 173
      // 085: iload 2
      // 086: goto 08d
      // 089: invokestatic y43.a (Loov;)Loov;
      // 08c: athrow
      // 08d: iload 3
      // 08e: ifne 15f
      // 091: ifeq 155
      // 094: goto 09b
      // 097: invokestatic y43.a (Loov;)Loov;
      // 09a: athrow
      // 09b: iload 2
      // 09c: iload 3
      // 09d: ifne 15f
      // 0a0: goto 0a7
      // 0a3: invokestatic y43.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: bipush 1
      // 0a8: if_icmpeq 155
      // 0ab: goto 0b2
      // 0ae: invokestatic y43.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: iload 2
      // 0b3: bipush 3
      // 0b4: iload 3
      // 0b5: ifne 115
      // 0b8: goto 0bf
      // 0bb: invokestatic y43.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: if_icmplt 107
      // 0c2: goto 0c9
      // 0c5: invokestatic y43.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: iload 2
      // 0ca: bipush 30
      // 0cc: iload 3
      // 0cd: ifne 115
      // 0d0: goto 0d7
      // 0d3: invokestatic y43.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: if_icmpge 107
      // 0da: goto 0e1
      // 0dd: invokestatic y43.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: aload 6
      // 0e4: bipush 30
      // 0e6: bipush 39
      // 0e8: bipush 0
      // 0e9: invokevirtual y43.ghh (Lerg;IIZ)Z
      // 0ec: iload 3
      // 0ed: ifne 178
      // 0f0: goto 0f7
      // 0f3: invokestatic y43.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: ifne 173
      // 0fa: goto 101
      // 0fd: invokestatic y43.a (Loov;)Loov;
      // 100: athrow
      // 101: aconst_null
      // 102: areturn
      // 103: invokestatic y43.a (Loov;)Loov;
      // 106: athrow
      // 107: iload 2
      // 108: iload 3
      // 109: ifne 178
      // 10c: bipush 30
      // 10e: goto 115
      // 111: invokestatic y43.a (Loov;)Loov;
      // 114: athrow
      // 115: if_icmplt 173
      // 118: iload 2
      // 119: iload 3
      // 11a: ifne 178
      // 11d: goto 124
      // 120: invokestatic y43.a (Loov;)Loov;
      // 123: athrow
      // 124: bipush 39
      // 126: if_icmpge 173
      // 129: goto 130
      // 12c: invokestatic y43.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 0
      // 131: aload 6
      // 133: bipush 3
      // 134: bipush 30
      // 136: bipush 0
      // 137: invokevirtual y43.ghh (Lerg;IIZ)Z
      // 13a: iload 3
      // 13b: ifne 178
      // 13e: goto 145
      // 141: invokestatic y43.a (Loov;)Loov;
      // 144: athrow
      // 145: ifne 173
      // 148: goto 14f
      // 14b: invokestatic y43.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aconst_null
      // 150: areturn
      // 151: invokestatic y43.a (Loov;)Loov;
      // 154: athrow
      // 155: aload 0
      // 156: aload 6
      // 158: bipush 3
      // 159: bipush 39
      // 15b: bipush 0
      // 15c: invokevirtual y43.ghh (Lerg;IIZ)Z
      // 15f: iload 3
      // 160: ifne 178
      // 163: ifne 173
      // 166: goto 16d
      // 169: invokestatic y43.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aconst_null
      // 16e: areturn
      // 16f: invokestatic y43.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 6
      // 175: getfield erg.qd2 I
      // 178: ifne 18f
      // 17b: aload 5
      // 17d: aconst_null
      // 17e: checkcast erg
      // 181: invokevirtual vrx.yn7 (Lerg;)V
      // 184: iload 3
      // 185: ifeq 19b
      // 188: goto 18f
      // 18b: invokestatic y43.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 5
      // 191: invokevirtual vrx.vc1 ()V
      // 194: goto 19b
      // 197: invokestatic y43.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 6
      // 19d: getfield erg.qd2 I
      // 1a0: aload 4
      // 1a2: getfield erg.qd2 I
      // 1a5: if_icmpne 1ae
      // 1a8: aconst_null
      // 1a9: areturn
      // 1aa: invokestatic y43.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: aload 5
      // 1b0: aload 1
      // 1b1: aload 6
      // 1b3: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 1b6: aload 4
      // 1b8: areturn
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
      // 05: aload 0
      // 06: getfield y43.fr6 La7q;
      // 09: aconst_null
      // 0a: checkcast ha9
      // 0d: invokeinterface a7q.i2a (Lha9;)V 2
      // 12: invokestatic OpaquePredicate.b ()I
      // 15: aload 0
      // 16: aload 1
      // 17: invokespecial _jc.qi6 (Lha9;)V
      // 1a: istore 2
      // 1b: aload 0
      // 1c: iload 2
      // 1d: ifeq 38
      // 20: getfield y43.ie4 Lt9d;
      // 23: getfield OpaquePredicate.v0f Z
      // 26: ifne 78
      // 29: goto 30
      // 2c: invokestatic y43.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic y43.a (Loov;)Loov;
      // 37: athrow
      // 38: getfield y43.dzo Lu42;
      // 3b: bipush 0
      // 3c: invokevirtual u42.yvk (I)Lerg;
      // 3f: astore 3
      // 40: aload 3
      // 41: iload 2
      // 42: ifeq 67
      // 45: ifnull 5d
      // 48: goto 4f
      // 4b: invokestatic y43.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 1
      // 50: aload 3
      // 51: bipush 0
      // 52: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 55: pop
      // 56: goto 5d
      // 59: invokestatic y43.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield y43.dzo Lu42;
      // 61: bipush 1
      // 62: invokevirtual u42.yvk (I)Lerg;
      // 65: astore 3
      // 66: aload 3
      // 67: ifnull 78
      // 6a: aload 1
      // 6b: aload 3
      // 6c: bipush 0
      // 6d: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 70: pop
      // 71: goto 78
      // 74: invokestatic y43.a (Loov;)Loov;
      // 77: athrow
      // 78: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
