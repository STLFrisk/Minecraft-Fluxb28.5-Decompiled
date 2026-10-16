import java.util.Map;

public final class pt5 {
   public static Minecraft ofe = Minecraft.vz1();

   public static final e0x mzw(mew var0) {
      int var1 = OpaquePredicate.c();
      WorldClient var2 = ofe.tij;

      WorldClient var10000;
      label35: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label35;
            }

            if (var2 == null) {
               return null;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var10000 = var2;
      }

      zfz var4 = var10000.getBlockState(var0);

      try {
         if (var1 != 0) {
            return var4.r_y();
         }

         if (var4 == null) {
            return null;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return var4.r_y();
   }

   public static final p3y _p5(mew var0) {
      int var1 = OpaquePredicate.c();
      e0x var2 = mzw(var0);

      try {
         if (var1 != 0) {
            return var2.p1r();
         }

         if (var2 == null) {
            return null;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var2.p1r();
   }

   public static final boolean cx3(mew var0) {
      int var1 = OpaquePredicate.b();
      p3y var2 = _p5(var0);

      p3y var10000;
      label33: {
         try {
            var10000 = var2;
            if (var1 == 0) {
               break label33;
            }

            if (var2 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var2;
      }

      try {
         boolean var5 = var10000.gt9();
         if (var1 == 0) {
            return var5;
         }

         if (var5) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public static final zfz jf7(mew var0) {
      return ofe.tij.getBlockState(var0);
   }

   public static final boolean h0b(mew var0) {
      int var1 = OpaquePredicate.c();
      e0x var2 = mzw(var0);

      e0x var10000;
      label46: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label46;
            }

            if (var2 == null) {
               return false;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var10000 = var2;
      }

      try {
         boolean var8 = var10000.qc_(jf7(var0), false);
         if (var1 != 0) {
            return var8;
         }

         if (!var8) {
            return false;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      WorldClient var4 = ofe.tij;

      try {
         boolean var9 = var4.fve().hka(var0);
         if (var1 != 0) {
            return var9;
         }

         if (var9) {
            return true;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return false;
   }

   public static final String fz0(int var0) {
      e0x var1 = e0x.csc(var0);
      return var1.ieu();
   }

   public static final boolean fey(mew param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokestatic pt5.mzw (Lmew;)Le0x;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 19
      // 0e: ifnull 9f
      // 11: goto 18
      // 14: invokestatic pt5.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 2
      // 19: getstatic pt5.ofe Lc05;
      // 1c: getfield Minecraft.tij Lkh3;
      // 1f: aload 0
      // 20: aload 0
      // 21: invokestatic pt5.jf7 (Lmew;)Lzfz;
      // 24: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 27: astore 3
      // 28: aload 3
      // 29: iload 1
      // 2a: ifeq 38
      // 2d: ifnull 9f
      // 30: goto 37
      // 33: invokestatic pt5.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 3
      // 38: astore 4
      // 3a: aload 4
      // 3c: getfield nh4.t_2 D
      // 3f: aload 4
      // 41: getfield nh4.rlc D
      // 44: dsub
      // 45: dconst_1
      // 46: dcmpl
      // 47: iload 1
      // 48: ifeq 69
      // 4b: ifne 9d
      // 4e: goto 55
      // 51: invokestatic pt5.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 4
      // 57: getfield nh4.i2c D
      // 5a: aload 4
      // 5c: getfield nh4.bx_ D
      // 5f: dsub
      // 60: dconst_1
      // 61: dcmpl
      // 62: goto 69
      // 65: invokestatic pt5.a (Loov;)Loov;
      // 68: athrow
      // 69: iload 1
      // 6a: ifeq 8b
      // 6d: ifne 9d
      // 70: goto 77
      // 73: invokestatic pt5.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 4
      // 79: getfield nh4.oqj D
      // 7c: aload 4
      // 7e: getfield nh4.t8n D
      // 81: dsub
      // 82: dconst_1
      // 83: dcmpl
      // 84: goto 8b
      // 87: invokestatic pt5.a (Loov;)Loov;
      // 8a: athrow
      // 8b: iload 1
      // 8c: ifeq 9a
      // 8f: ifne 9d
      // 92: goto 99
      // 95: invokestatic pt5.a (Loov;)Loov;
      // 98: athrow
      // 99: bipush 1
      // 9a: goto 9e
      // 9d: bipush 0
      // 9e: ireturn
      // 9f: bipush 0
      // a0: ireturn
   }

   public static final double vlg(mew var0) {
      return ofe.vg8.qww((double)var0.getX() + 0.5, (double)var0.getY() + 0.5, (double)var0.getZ() + 0.5);
   }

   public static final Map smp(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic OpaquePredicate.c ()I
      // 05: new java/util/LinkedHashMap
      // 08: dup
      // 09: invokespecial java/util/LinkedHashMap.<init> ()V
      // 0c: astore 3
      // 0d: istore 1
      // 0e: iload 0
      // 0f: istore 4
      // 11: iload 0
      // 12: ineg
      // 13: bipush 1
      // 14: iadd
      // 15: istore 5
      // 17: iload 0
      // 18: iload 1
      // 19: ifne 30
      // 1c: iload 5
      // 1e: if_icmplt e6
      // 21: goto 28
      // 24: invokestatic pt5.a (Loov;)Loov;
      // 27: athrow
      // 28: iload 0
      // 29: goto 30
      // 2c: invokestatic pt5.a (Loov;)Loov;
      // 2f: athrow
      // 30: istore 6
      // 32: iload 0
      // 33: ineg
      // 34: bipush 1
      // 35: iadd
      // 36: istore 7
      // 38: iload 0
      // 39: iload 7
      // 3b: if_icmplt d5
      // 3e: iload 0
      // 3f: istore 8
      // 41: iload 0
      // 42: ineg
      // 43: bipush 1
      // 44: iadd
      // 45: istore 9
      // 47: iload 0
      // 48: iload 9
      // 4a: iload 1
      // 4b: ifne d9
      // 4e: if_icmplt c0
      // 51: new mew
      // 54: dup
      // 55: getstatic pt5.ofe Lc05;
      // 58: getfield Minecraft.vg8 Ll86;
      // 5b: getfield EntityPlayerSP.o2v D
      // 5e: d2i
      // 5f: iload 4
      // 61: iadd
      // 62: getstatic pt5.ofe Lc05;
      // 65: getfield Minecraft.vg8 Ll86;
      // 68: getfield EntityPlayerSP.kfp D
      // 6b: d2i
      // 6c: iload 6
      // 6e: iadd
      // 6f: getstatic pt5.ofe Lc05;
      // 72: getfield Minecraft.vg8 Ll86;
      // 75: getfield EntityPlayerSP.vbd D
      // 78: d2i
      // 79: iload 8
      // 7b: iadd
      // 7c: invokespecial mew.<init> (III)V
      // 7f: astore 10
      // 81: aload 10
      // 83: invokestatic pt5.mzw (Lmew;)Le0x;
      // 86: astore 11
      // 88: iload 1
      // 89: ifne d1
      // 8c: aload 11
      // 8e: ifnull ab
      // 91: aload 11
      // 93: astore 12
      // 95: aload 3
      // 96: iload 1
      // 97: ifne e7
      // 9a: aload 10
      // 9c: aload 12
      // 9e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a3: pop
      // a4: goto ab
      // a7: invokestatic pt5.a (Loov;)Loov;
      // aa: athrow
      // ab: iload 8
      // ad: iload 9
      // af: if_icmpne b9
      // b2: goto c0
      // b5: invokestatic pt5.a (Loov;)Loov;
      // b8: athrow
      // b9: iinc 8 -1
      // bc: iload 1
      // bd: ifeq 51
      // c0: iload 6
      // c2: iload 7
      // c4: if_icmpne ce
      // c7: goto d5
      // ca: invokestatic pt5.a (Loov;)Loov;
      // cd: athrow
      // ce: iinc 6 -1
      // d1: iload 1
      // d2: ifeq 3e
      // d5: iload 4
      // d7: iload 5
      // d9: if_icmpne df
      // dc: goto e6
      // df: iinc 4 -1
      // e2: iload 1
      // e3: ifeq 28
      // e6: aload 3
      // e7: areturn
   }

   public static final boolean bbs(nh4 var0, pt5$x7w var1) {
      EntityPlayerSP var3 = ofe.vg8;
      int var10000 = OpaquePredicate.b();
      int var4 = fe6.jqf(var3.aaw().rlc);
      int var2 = var10000;
      var3 = ofe.vg8;
      int var5 = fe6.jqf(var3.aaw().t_2) + 1;

      label62:
      while (true) {
         var10000 = var4;

         label58:
         while (var10000 < var5) {
            var3 = ofe.vg8;
            int var6 = fe6.jqf(var3.aaw().t8n);
            var3 = ofe.vg8;
            var10000 = fe6.jqf(var3.aaw().oqj) + 1;
            if (var2 == 0) {
               return (boolean)var10000;
            }

            int var7 = var10000;

            while (var6 < var7) {
               e0x var8 = mzw(new mew((double)var4, var0.bx_, (double)var6));

               label67: {
                  try {
                     if (var2 == 0) {
                        break label67;
                     }

                     var10000 = var1.bde(var8);
                     if (var2 == 0) {
                        continue label58;
                     }
                  } catch (oov var9) {
                     throw a(var9);
                  }

                  try {
                     if (var10000 == 0) {
                        return false;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  var6++;
               }

               if (var2 == 0) {
                  break;
               }
            }

            var4++;
            if (var2 != 0) {
               continue label62;
            }
            break;
         }

         return (boolean)1;
      }
   }

   public static final boolean sp7(nh4 param0, pt5$x7w param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic pt5.ofe Lc05;
      // 003: getfield Minecraft.vg8 Ll86;
      // 006: astore 3
      // 007: invokestatic OpaquePredicate.b ()I
      // 00a: aload 3
      // 00b: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 00e: getfield nh4.rlc D
      // 011: invokestatic fe6.jqf (D)I
      // 014: istore 4
      // 016: getstatic pt5.ofe Lc05;
      // 019: getfield Minecraft.vg8 Ll86;
      // 01c: astore 3
      // 01d: istore 2
      // 01e: aload 3
      // 01f: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 022: getfield nh4.t_2 D
      // 025: invokestatic fe6.jqf (D)I
      // 028: bipush 1
      // 029: iadd
      // 02a: istore 5
      // 02c: iload 4
      // 02e: iload 5
      // 030: if_icmpge 10b
      // 033: getstatic pt5.ofe Lc05;
      // 036: getfield Minecraft.vg8 Ll86;
      // 039: astore 3
      // 03a: aload 3
      // 03b: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 03e: getfield nh4.t8n D
      // 041: invokestatic fe6.jqf (D)I
      // 044: istore 6
      // 046: getstatic pt5.ofe Lc05;
      // 049: getfield Minecraft.vg8 Ll86;
      // 04c: astore 3
      // 04d: aload 3
      // 04e: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 051: getfield nh4.oqj D
      // 054: invokestatic fe6.jqf (D)I
      // 057: bipush 1
      // 058: iadd
      // 059: iload 2
      // 05a: ifeq 10c
      // 05d: istore 7
      // 05f: iload 6
      // 061: iload 7
      // 063: if_icmpge 104
      // 066: new mew
      // 069: dup
      // 06a: iload 4
      // 06c: i2d
      // 06d: aload 0
      // 06e: getfield nh4.bx_ D
      // 071: iload 6
      // 073: i2d
      // 074: invokespecial mew.<init> (DDD)V
      // 077: astore 8
      // 079: aload 8
      // 07b: invokestatic pt5.mzw (Lmew;)Le0x;
      // 07e: astore 9
      // 080: iload 2
      // 081: ifeq 100
      // 084: aload 1
      // 085: aload 9
      // 087: invokeinterface pt5$x7w.bde (Le0x;)Z 2
      // 08c: iload 2
      // 08d: ifeq 02e
      // 090: goto 097
      // 093: invokestatic pt5.a (Loov;)Loov;
      // 096: athrow
      // 097: ifeq 0fd
      // 09a: aload 9
      // 09c: iload 2
      // 09d: ifeq 0b3
      // 0a0: goto 0a7
      // 0a3: invokestatic pt5.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: ifnull 0fd
      // 0aa: goto 0b1
      // 0ad: invokestatic pt5.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 9
      // 0b3: getstatic pt5.ofe Lc05;
      // 0b6: getfield Minecraft.tij Lkh3;
      // 0b9: aload 8
      // 0bb: aload 8
      // 0bd: invokestatic pt5.jf7 (Lmew;)Lzfz;
      // 0c0: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 0c3: astore 10
      // 0c5: iload 2
      // 0c6: ifeq 100
      // 0c9: aload 10
      // 0cb: ifnull 0fd
      // 0ce: goto 0d5
      // 0d1: invokestatic pt5.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aload 10
      // 0d7: astore 11
      // 0d9: getstatic pt5.ofe Lc05;
      // 0dc: getfield Minecraft.vg8 Ll86;
      // 0df: astore 3
      // 0e0: iload 2
      // 0e1: ifeq 100
      // 0e4: aload 3
      // 0e5: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 0e8: aload 11
      // 0ea: invokevirtual nh4.epq (Lnh4;)Z
      // 0ed: ifeq 0fd
      // 0f0: goto 0f7
      // 0f3: invokestatic pt5.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: bipush 1
      // 0f8: ireturn
      // 0f9: invokestatic pt5.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: iinc 6 1
      // 100: iload 2
      // 101: ifne 05f
      // 104: iinc 4 1
      // 107: iload 2
      // 108: ifne 02c
      // 10b: bipush 0
      // 10c: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
