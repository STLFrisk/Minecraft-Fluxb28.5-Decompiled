import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r5m extends u7m {
   public static final String[] i1y;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public r5m() {
      this.vgp = 1;
      this.rlr(384);
      this.qfy(uja.hrg);
   }

   @Override
   public void u8x(erg param1, t9d param2, ha9 param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic r5m.a J
      // 003: ldc2_w 94667409086246
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.c ()I
      // 00c: istore 7
      // 00e: aload 3
      // 00f: getfield ha9.lls Lpj2;
      // 012: getfield pj2.g40 Z
      // 015: iload 7
      // 017: ifne 045
      // 01a: ifne 044
      // 01d: goto 024
      // 020: invokestatic r5m.a (Loov;)Loov;
      // 023: athrow
      // 024: getstatic vef._8i Lvef;
      // 027: getfield vef.bbf I
      // 02a: aload 1
      // 02b: invokestatic hc0.qa_ (ILerg;)I
      // 02e: iload 7
      // 030: ifne 045
      // 033: goto 03a
      // 036: invokestatic r5m.a (Loov;)Loov;
      // 039: athrow
      // 03a: ifle 048
      // 03d: goto 044
      // 040: invokestatic r5m.a (Loov;)Loov;
      // 043: athrow
      // 044: bipush 1
      // 045: goto 049
      // 048: bipush 0
      // 049: istore 8
      // 04b: iload 8
      // 04d: iload 7
      // 04f: ifne 08b
      // 052: ifne 07c
      // 055: goto 05c
      // 058: invokestatic r5m.a (Loov;)Loov;
      // 05b: athrow
      // 05c: aload 3
      // 05d: getfield ha9.up_ Ljnq;
      // 060: getstatic xbr.tzx Lu7m;
      // 063: invokevirtual jnq.wa3 (Lu7m;)Z
      // 066: iload 7
      // 068: ifne 08b
      // 06b: goto 072
      // 06e: invokestatic r5m.a (Loov;)Loov;
      // 071: athrow
      // 072: ifeq 222
      // 075: goto 07c
      // 078: invokestatic r5m.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: aload 1
      // 07e: invokevirtual r5m.hdm (Lerg;)I
      // 081: iload 4
      // 083: isub
      // 084: goto 08b
      // 087: invokestatic r5m.a (Loov;)Loov;
      // 08a: athrow
      // 08b: istore 9
      // 08d: iload 9
      // 08f: i2f
      // 090: ldc 20.0
      // 092: nop
      // 093: fdiv
      // 094: fstore 10
      // 096: fload 10
      // 098: fload 10
      // 09a: fmul
      // 09b: fload 10
      // 09d: fconst_2
      // 09e: fmul
      // 09f: fadd
      // 0a0: ldc 3.0
      // 0a2: nop
      // 0a3: fdiv
      // 0a4: fstore 10
      // 0a6: fload 10
      // 0a8: f2d
      // 0a9: ldc2_w 0.1
      // 0ac: dcmpg
      // 0ad: iload 7
      // 0af: ifne 0cd
      // 0b2: ifge 0bd
      // 0b5: goto 0bc
      // 0b8: invokestatic r5m.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: return
      // 0bd: fload 10
      // 0bf: iload 7
      // 0c1: ifne 0d1
      // 0c4: fconst_1
      // 0c5: fcmpl
      // 0c6: goto 0cd
      // 0c9: invokestatic r5m.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: ifle 0d3
      // 0d0: fconst_1
      // 0d1: fstore 10
      // 0d3: new hy9
      // 0d6: dup
      // 0d7: aload 2
      // 0d8: aload 3
      // 0d9: fload 10
      // 0db: fconst_2
      // 0dc: fmul
      // 0dd: invokespecial hy9.<init> (Lt9d;Lg_3;F)V
      // 0e0: astore 11
      // 0e2: fload 10
      // 0e4: fconst_1
      // 0e5: fcmpl
      // 0e6: iload 7
      // 0e8: ifne 10c
      // 0eb: ifne 102
      // 0ee: goto 0f5
      // 0f1: invokestatic r5m.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 11
      // 0f7: bipush 1
      // 0f8: invokevirtual hy9.mmj (Z)V
      // 0fb: goto 102
      // 0fe: invokestatic r5m.a (Loov;)Loov;
      // 101: athrow
      // 102: getstatic vef.s61 Lvef;
      // 105: getfield vef.bbf I
      // 108: aload 1
      // 109: invokestatic hc0.qa_ (ILerg;)I
      // 10c: istore 12
      // 10e: iload 12
      // 110: iload 7
      // 112: ifne 146
      // 115: ifle 13c
      // 118: goto 11f
      // 11b: invokestatic r5m.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 11
      // 121: aload 11
      // 123: invokevirtual hy9.h1p ()D
      // 126: iload 12
      // 128: i2d
      // 129: ldc2_w 0.5
      // 12c: dmul
      // 12d: dadd
      // 12e: ldc2_w 0.5
      // 131: dadd
      // 132: invokevirtual hy9.l4o (D)V
      // 135: goto 13c
      // 138: invokestatic r5m.a (Loov;)Loov;
      // 13b: athrow
      // 13c: getstatic vef.t24 Lvef;
      // 13f: getfield vef.bbf I
      // 142: aload 1
      // 143: invokestatic hc0.qa_ (ILerg;)I
      // 146: istore 13
      // 148: iload 13
      // 14a: iload 7
      // 14c: ifne 171
      // 14f: ifle 167
      // 152: goto 159
      // 155: invokestatic r5m.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 11
      // 15b: iload 13
      // 15d: invokevirtual hy9.ilm (I)V
      // 160: goto 167
      // 163: invokestatic r5m.a (Loov;)Loov;
      // 166: athrow
      // 167: getstatic vef.pxu Lvef;
      // 16a: getfield vef.bbf I
      // 16d: aload 1
      // 16e: invokestatic hc0.qa_ (ILerg;)I
      // 171: iload 7
      // 173: ifne 1c2
      // 176: ifle 18e
      // 179: goto 180
      // 17c: invokestatic r5m.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 11
      // 182: bipush 100
      // 184: invokevirtual hy9.k03 (I)V
      // 187: goto 18e
      // 18a: invokestatic r5m.a (Loov;)Loov;
      // 18d: athrow
      // 18e: aload 1
      // 18f: bipush 1
      // 190: aload 3
      // 191: invokevirtual erg.ybw (ILg_3;)V
      // 194: aload 2
      // 195: aload 3
      // 196: sipush 20196
      // 199: ldc2_w 2932040638630394506
      // 19c: lload 5
      // 19e: lxor
      // 19f: invokedynamic y (IJ)Ljava/lang/String; bsm=r5m.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: nop
      // 1a5: fconst_1
      // 1a6: fconst_1
      // 1a7: getstatic r5m.pq6 Ljava/util/Random;
      // 1aa: invokevirtual java/util/Random.nextFloat ()F
      // 1ad: ldc 0.4
      // 1af: nop
      // 1b0: fmul
      // 1b1: ldc 1.2
      // 1b3: nop
      // 1b4: fadd
      // 1b5: fdiv
      // 1b6: fload 10
      // 1b8: ldc 0.5
      // 1ba: nop
      // 1bb: fmul
      // 1bc: fadd
      // 1bd: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 1c0: iload 8
      // 1c2: iload 7
      // 1c4: ifne 1f4
      // 1c7: ifeq 1e3
      // 1ca: goto 1d1
      // 1cd: invokestatic r5m.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: aload 11
      // 1d3: bipush 2
      // 1d4: putfield hy9.mku I
      // 1d7: iload 7
      // 1d9: ifeq 1f5
      // 1dc: goto 1e3
      // 1df: invokestatic r5m.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: aload 3
      // 1e4: getfield ha9.up_ Ljnq;
      // 1e7: getstatic xbr.tzx Lu7m;
      // 1ea: invokevirtual jnq.fw5 (Lu7m;)Z
      // 1ed: goto 1f4
      // 1f0: invokestatic r5m.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: pop
      // 1f5: aload 3
      // 1f6: getstatic l9p.foo [L_ss;
      // 1f9: aload 0
      // 1fa: invokestatic u7m._lo (Lu7m;)I
      // 1fd: aaload
      // 1fe: invokevirtual ha9.aex (L_ss;)V
      // 201: aload 2
      // 202: getfield t9d.v0f Z
      // 205: iload 7
      // 207: ifne 221
      // 20a: ifne 222
      // 20d: goto 214
      // 210: invokestatic r5m.a (Loov;)Loov;
      // 213: athrow
      // 214: aload 2
      // 215: aload 11
      // 217: invokevirtual t9d.xzq (Li2h;)Z
      // 21a: goto 221
      // 21d: invokestatic r5m.a (Loov;)Loov;
      // 220: athrow
      // 221: pop
      // 222: return
   }

   @Override
   public erg q20(erg var1, t9d var2, ha9 var3) {
      return var1;
   }

   @Override
   public int hdm(erg var1) {
      return 72000;
   }

   @Override
   public ce2 uf6(erg var1) {
      return ce2.rie;
   }

   @Override
   public erg r__(erg param1, t9d param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifeq 43
      // 0b: getfield ha9.lls Lpj2;
      // 0e: getfield pj2.g40 Z
      // 11: ifne 3b
      // 14: goto 1b
      // 17: invokestatic r5m.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: iload 4
      // 1e: ifeq 43
      // 21: goto 28
      // 24: invokestatic r5m.a (Loov;)Loov;
      // 27: athrow
      // 28: getfield ha9.up_ Ljnq;
      // 2b: getstatic xbr.tzx Lu7m;
      // 2e: invokevirtual jnq.wa3 (Lu7m;)Z
      // 31: ifeq 4c
      // 34: goto 3b
      // 37: invokestatic r5m.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 3
      // 3c: goto 43
      // 3f: invokestatic r5m.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 1
      // 44: aload 0
      // 45: aload 1
      // 46: invokevirtual r5m.hdm (Lerg;)I
      // 49: invokevirtual ha9.qez (Lerg;I)V
      // 4c: aload 1
      // 4d: areturn
   }

   @Override
   public int k7x() {
      return 1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4586272551859410092L, 344690433984163082L, MethodHandles.lookup().lookupClass()).a(167001297885970L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 68703703471889L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "GE\u008e x\u008d\béµLÄ\b%«\u009b¯Ô§O\\KbÒ\u0094Ü0\u008f/?Îµ{ ;SyÖü©\u009fNä\rF\u0093.p\u009f_tkÏUÊ$w!Vé¿2\u0096j+i";
      int var6 = "GE\u008e x\u008d\béµLÄ\b%«\u009b¯Ô§O\\KbÒ\u0094Ü0\u008f/?Îµ{ ;SyÖü©\u009fNä\rF\u0093.p\u009f_tkÏUÊ$w!Vé¿2\u0096j+i".length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[4];
                     i1y = new String[]{
                        b<"y">(17765, 1961677773727347005L ^ var9), b<"y">(21853, 8918246913440686342L ^ var9), b<"y">(6274, 6362339181505768664L ^ var9)
                     };
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Z\u0097ê\u0083úÞ\u0093y»ûm¼n6Ã¹\u0083\u0011\u00ad\u0086½-Ìí ¹û\\-°/9P1Àùl#Í3°\u0098Ê\u0096æý_¸,¥Ïy=\u0085\u0095\u009fî";
                  var6 = "Z\u0097ê\u0083úÞ\u0093y»ûm¼n6Ã¹\u0083\u0011\u00ad\u0086½-Ìí ¹û\\-°/9P1Àùl#Í3°\u0098Ê\u0096æý_¸,¥Ïy=\u0085\u0095\u009fî".length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29668;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("r5m", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("r5m" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
