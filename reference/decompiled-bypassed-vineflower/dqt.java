import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dqt extends e0x {
   public static final h76 q8i;
   public static final h76 f8w;
   public static final h76 zre;
   public static final h76 hvw;

   public dqt(p3y var1) {
      this(var1, var1.up9());
   }

   public dqt(p3y var1, _mi var2) {
      super(var1, var2);
      this.y8l(this._8_.c32().zvi(q8i, false).zvi(f8w, false).zvi(zre, false).zvi(hvw, false));
      this.i3l(uja.qqf);
   }

   @Override
   public void c76(t9d param1, mew param2, zfz param3, nh4 param4, List param5, i2h param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 2
      // 003: invokevirtual mew.idu ()Lmew;
      // 006: invokevirtual dqt.pj8 (Lm5n;Lmew;)Z
      // 009: istore 8
      // 00b: aload 0
      // 00c: aload 1
      // 00d: aload 2
      // 00e: invokevirtual mew.z6x ()Lmew;
      // 011: invokevirtual dqt.pj8 (Lm5n;Lmew;)Z
      // 014: istore 9
      // 016: aload 0
      // 017: aload 1
      // 018: aload 2
      // 019: invokevirtual mew.y8e ()Lmew;
      // 01c: invokevirtual dqt.pj8 (Lm5n;Lmew;)Z
      // 01f: istore 10
      // 021: invokestatic t9d.c ()I
      // 024: aload 0
      // 025: aload 1
      // 026: aload 2
      // 027: invokevirtual mew.o_8 ()Lmew;
      // 02a: invokevirtual dqt.pj8 (Lm5n;Lmew;)Z
      // 02d: istore 11
      // 02f: istore 7
      // 031: ldc 0.375
      // 033: nop
      // 034: fstore 12
      // 036: ldc 0.625
      // 038: nop
      // 039: fstore 13
      // 03b: ldc 0.375
      // 03d: nop
      // 03e: fstore 14
      // 040: ldc 0.625
      // 042: nop
      // 043: fstore 15
      // 045: iload 8
      // 047: iload 7
      // 049: ifne 05b
      // 04c: ifeq 059
      // 04f: goto 056
      // 052: invokestatic dqt.a (Loov;)Loov;
      // 055: athrow
      // 056: fconst_0
      // 057: fstore 14
      // 059: iload 9
      // 05b: iload 7
      // 05d: ifne 06f
      // 060: ifeq 06d
      // 063: goto 06a
      // 066: invokestatic dqt.a (Loov;)Loov;
      // 069: athrow
      // 06a: fconst_1
      // 06b: fstore 15
      // 06d: iload 8
      // 06f: iload 7
      // 071: ifne 080
      // 074: ifne 08f
      // 077: goto 07e
      // 07a: invokestatic dqt.a (Loov;)Loov;
      // 07d: athrow
      // 07e: iload 9
      // 080: iload 7
      // 082: ifne 0bf
      // 085: ifeq 0b3
      // 088: goto 08f
      // 08b: invokestatic dqt.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: fload 12
      // 092: fconst_0
      // 093: fload 14
      // 095: fload 13
      // 097: ldc 1.5
      // 099: nop
      // 09a: fload 15
      // 09c: invokevirtual dqt.xl4 (FFFFFF)V
      // 09f: aload 0
      // 0a0: aload 1
      // 0a1: aload 2
      // 0a2: aload 3
      // 0a3: aload 4
      // 0a5: aload 5
      // 0a7: aload 6
      // 0a9: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 0ac: goto 0b3
      // 0af: invokestatic dqt.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: ldc 0.375
      // 0b5: nop
      // 0b6: fstore 14
      // 0b8: ldc 0.625
      // 0ba: nop
      // 0bb: fstore 15
      // 0bd: iload 10
      // 0bf: iload 7
      // 0c1: ifne 0d3
      // 0c4: ifeq 0d1
      // 0c7: goto 0ce
      // 0ca: invokestatic dqt.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: fconst_0
      // 0cf: fstore 12
      // 0d1: iload 11
      // 0d3: iload 7
      // 0d5: ifne 0e7
      // 0d8: ifeq 0e5
      // 0db: goto 0e2
      // 0de: invokestatic dqt.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: fconst_1
      // 0e3: fstore 13
      // 0e5: iload 10
      // 0e7: iload 7
      // 0e9: ifne 0f8
      // 0ec: ifne 130
      // 0ef: goto 0f6
      // 0f2: invokestatic dqt.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: iload 11
      // 0f8: iload 7
      // 0fa: ifne 109
      // 0fd: ifne 130
      // 100: goto 107
      // 103: invokestatic dqt.a (Loov;)Loov;
      // 106: athrow
      // 107: iload 8
      // 109: iload 7
      // 10b: ifne 156
      // 10e: ifne 154
      // 111: goto 118
      // 114: invokestatic dqt.a (Loov;)Loov;
      // 117: athrow
      // 118: iload 9
      // 11a: iload 7
      // 11c: ifne 156
      // 11f: goto 126
      // 122: invokestatic dqt.a (Loov;)Loov;
      // 125: athrow
      // 126: ifne 154
      // 129: goto 130
      // 12c: invokestatic dqt.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 0
      // 131: fload 12
      // 133: fconst_0
      // 134: fload 14
      // 136: fload 13
      // 138: ldc 1.5
      // 13a: nop
      // 13b: fload 15
      // 13d: invokevirtual dqt.xl4 (FFFFFF)V
      // 140: aload 0
      // 141: aload 1
      // 142: aload 2
      // 143: aload 3
      // 144: aload 4
      // 146: aload 5
      // 148: aload 6
      // 14a: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 14d: goto 154
      // 150: invokestatic dqt.a (Loov;)Loov;
      // 153: athrow
      // 154: iload 8
      // 156: iload 7
      // 158: ifne 16a
      // 15b: ifeq 168
      // 15e: goto 165
      // 161: invokestatic dqt.a (Loov;)Loov;
      // 164: athrow
      // 165: fconst_0
      // 166: fstore 14
      // 168: iload 9
      // 16a: ifeq 170
      // 16d: fconst_1
      // 16e: fstore 15
      // 170: aload 0
      // 171: fload 12
      // 173: fconst_0
      // 174: fload 14
      // 176: fload 13
      // 178: fconst_1
      // 179: fload 15
      // 17b: invokevirtual dqt.xl4 (FFFFFF)V
      // 17e: return
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      boolean var4 = this.pj8(var1, var2.idu());
      boolean var5 = this.pj8(var1, var2.z6x());
      boolean var6 = this.pj8(var1, var2.y8e());
      boolean var7 = this.pj8(var1, var2.o_8());
      int var10000 = t9d.b();
      float var8 = 0.375F;
      int var3 = var10000;
      float var9 = 0.625F;
      float var10 = 0.375F;
      float var11 = 0.625F;

      label57: {
         label56: {
            try {
               var15 = var4;
               if (var3 == 0) {
                  break label57;
               }

               if (!var4) {
                  break label56;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var10 = 0.0F;
         }

         var15 = var5;
      }

      label48: {
         label47: {
            try {
               if (var3 == 0) {
                  break label48;
               }

               if (!var15) {
                  break label47;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            var11 = 1.0F;
         }

         var15 = var6;
      }

      label39: {
         label38: {
            try {
               if (var3 == 0) {
                  break label39;
               }

               if (!var15) {
                  break label38;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            var8 = 0.0F;
         }

         var15 = var7;
      }

      if (var15) {
         var9 = 1.0F;
      }

      this.xl4(var8, 0.0F, var10, var9, 1.0F, var11);
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean iwf(m5n var1, mew var2) {
      return false;
   }

   public boolean pj8(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: invokeinterface zfz.r_y ()Le0x; 1
      // 10: astore 4
      // 12: aload 4
      // 14: iload 3
      // 15: ifeq 2f
      // 18: getstatic ox_.c28 Le0x;
      // 1b: if_acmpne 2d
      // 1e: goto 25
      // 21: invokestatic dqt.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 0
      // 26: goto d2
      // 29: invokestatic dqt.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 4
      // 2f: instanceof dqt
      // 32: iload 3
      // 33: ifeq 6a
      // 36: ifeq 5e
      // 39: goto 40
      // 3c: invokestatic dqt.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 4
      // 42: iload 3
      // 43: ifeq 67
      // 46: goto 4d
      // 49: invokestatic dqt.a (Loov;)Loov;
      // 4c: athrow
      // 4d: getfield e0x.kgd Lp3y;
      // 50: aload 0
      // 51: getfield dqt.kgd Lp3y;
      // 54: if_acmpeq d1
      // 57: goto 5e
      // 5a: invokestatic dqt.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 4
      // 60: goto 67
      // 63: invokestatic dqt.a (Loov;)Loov;
      // 66: athrow
      // 67: instanceof u98
      // 6a: iload 3
      // 6b: ifeq 87
      // 6e: ifne d1
      // 71: goto 78
      // 74: invokestatic dqt.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 4
      // 7a: getfield e0x.kgd Lp3y;
      // 7d: invokevirtual p3y.u4h ()Z
      // 80: goto 87
      // 83: invokestatic dqt.a (Loov;)Loov;
      // 86: athrow
      // 87: iload 3
      // 88: ifeq ce
      // 8b: ifeq cd
      // 8e: goto 95
      // 91: invokestatic dqt.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 4
      // 97: invokevirtual e0x.gck ()Z
      // 9a: iload 3
      // 9b: ifeq ce
      // 9e: goto a5
      // a1: invokestatic dqt.a (Loov;)Loov;
      // a4: athrow
      // a5: ifeq cd
      // a8: goto af
      // ab: invokestatic dqt.a (Loov;)Loov;
      // ae: athrow
      // af: aload 4
      // b1: getfield e0x.kgd Lp3y;
      // b4: getstatic p3y.clf Lp3y;
      // b7: if_acmpeq c9
      // ba: goto c1
      // bd: invokestatic dqt.a (Loov;)Loov;
      // c0: athrow
      // c1: bipush 1
      // c2: goto d2
      // c5: invokestatic dqt.a (Loov;)Loov;
      // c8: athrow
      // c9: bipush 0
      // ca: goto d2
      // cd: bipush 0
      // ce: goto d2
      // d1: bipush 1
      // d2: ireturn
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      return true;
   }

   @Override
   public boolean cl2(t9d var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      int var9 = t9d.b();

      try {
         if (var9 == 0) {
            return var1.v0f;
         }

         if (var1.v0f) {
            return true;
         }
      } catch (oov var10) {
         throw a(var10);
      }

      return vba.f_s(var4, var1, var2);
   }

   @Override
   public int hvp(zfz var1) {
      return 0;
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      return var1.zvi(q8i, this.pj8(var2, var3.idu()))
         .zvi(f8w, this.pj8(var2, var3.o_8()))
         .zvi(zre, this.pj8(var2, var3.z6x()))
         .zvi(hvw, this.pj8(var2, var3.y8e()));
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{q8i, f8w, hvw, zre});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8691823666073045858L, -6366690480812290531L, MethodHandles.lookup().lookupClass()).a(64153112026668L);
      // $VF: monitorexit
      long var10 = var10000 ^ 83070444721405L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "Ë\u0089\\ï9\u001bÎÔ\b\u008b\u007f]xp\u0000\u001fÍ";
      int var7 = "Ë\u0089\\ï9\u001bÎÔ\b\u008b\u007f]xp\u0000\u001fÍ".length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = b(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     q8i = h76.d_1(var8[1]);
                     f8w = h76.d_1(var8[2]);
                     zre = h76.d_1(var8[0]);
                     hvw = h76.d_1(var8[3]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "\u000eÇ\u0098$\u0016¡Db\bÏ´¼ý$âÒ3";
                  var7 = "\u000eÇ\u0098$\u0016¡Db\bÏ´¼ý$âÒ3".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
