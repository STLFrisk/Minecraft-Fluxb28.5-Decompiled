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

public class wkk {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void wnm(int var1, float var2) {
      this.w4s = Math.min(var1 + this.w4s, 20);
      this.zpo = Math.min(this.zpo + (float)var1 * var2 * 2.0F, (float)this.w4s);
   }

   public void yxc(itu var1, erg var2) {
      this.wnm(var1.ug7(var2), var1.fko(var2));
   }

   public void lsl(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wkk.a J
      // 003: ldc2_w 33041774381450
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: getfield ha9.oay Lt9d;
      // 00c: invokevirtual t9d.rbk ()Lv66;
      // 00f: astore 5
      // 011: invokestatic t9d.b ()I
      // 014: aload 0
      // 015: aload 0
      // 016: getfield wkk.w4s I
      // 019: putfield wkk.kdc I
      // 01c: istore 4
      // 01e: aload 0
      // 01f: getfield wkk.y0n F
      // 022: ldc 4.0
      // 024: nop
      // 025: fcmpl
      // 026: iload 4
      // 028: ifeq 0b3
      // 02b: ifle 09b
      // 02e: goto 035
      // 031: invokestatic wkk.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: dup
      // 037: getfield wkk.y0n F
      // 03a: ldc 4.0
      // 03c: nop
      // 03d: fsub
      // 03e: putfield wkk.y0n F
      // 041: aload 0
      // 042: iload 4
      // 044: ifeq 065
      // 047: goto 04e
      // 04a: invokestatic wkk.a (Loov;)Loov;
      // 04d: athrow
      // 04e: getfield wkk.zpo F
      // 051: fconst_0
      // 052: fcmpl
      // 053: ifle 077
      // 056: goto 05d
      // 059: invokestatic wkk.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: goto 065
      // 061: invokestatic wkk.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 0
      // 066: getfield wkk.zpo F
      // 069: fconst_1
      // 06a: fsub
      // 06b: fconst_0
      // 06c: invokestatic java/lang/Math.max (FF)F
      // 06f: putfield wkk.zpo F
      // 072: iload 4
      // 074: ifne 09b
      // 077: aload 5
      // 079: getstatic v66.na2 Lv66;
      // 07c: if_acmpeq 09b
      // 07f: goto 086
      // 082: invokestatic wkk.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 0
      // 087: aload 0
      // 088: getfield wkk.w4s I
      // 08b: bipush 1
      // 08c: isub
      // 08d: bipush 0
      // 08e: invokestatic java/lang/Math.max (II)I
      // 091: putfield wkk.w4s I
      // 094: goto 09b
      // 097: invokestatic wkk.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 1
      // 09c: getfield ha9.oay Lt9d;
      // 09f: invokevirtual t9d.eir ()Lef9;
      // 0a2: sipush 7898
      // 0a5: ldc2_w 201997185231894601
      // 0a8: lload 2
      // 0a9: lxor
      // 0aa: invokedynamic e (IJ)Ljava/lang/String; bsm=wkk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: nop
      // 0b0: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0b3: iload 4
      // 0b5: ifeq 152
      // 0b8: ifeq 13b
      // 0bb: goto 0c2
      // 0be: invokestatic wkk.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield wkk.w4s I
      // 0c6: iload 4
      // 0c8: ifeq 152
      // 0cb: goto 0d2
      // 0ce: invokestatic wkk.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: bipush 18
      // 0d4: if_icmplt 13b
      // 0d7: goto 0de
      // 0da: invokestatic wkk.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 1
      // 0df: invokevirtual ha9.g00 ()Z
      // 0e2: iload 4
      // 0e4: ifeq 152
      // 0e7: goto 0ee
      // 0ea: invokestatic wkk.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: ifeq 13b
      // 0f1: goto 0f8
      // 0f4: invokestatic wkk.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: dup
      // 0fa: getfield wkk._db I
      // 0fd: bipush 1
      // 0fe: iadd
      // 0ff: putfield wkk._db I
      // 102: aload 0
      // 103: iload 4
      // 105: ifeq 132
      // 108: goto 10f
      // 10b: invokestatic wkk.a (Loov;)Loov;
      // 10e: athrow
      // 10f: getfield wkk._db I
      // 112: bipush 80
      // 114: if_icmplt 1ed
      // 117: goto 11e
      // 11a: invokestatic wkk.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 1
      // 11f: fconst_1
      // 120: invokevirtual ha9.rwd (F)V
      // 123: aload 0
      // 124: ldc 3.0
      // 126: nop
      // 127: invokevirtual wkk.qvy (F)V
      // 12a: aload 0
      // 12b: goto 132
      // 12e: invokestatic wkk.a (Loov;)Loov;
      // 131: athrow
      // 132: bipush 0
      // 133: putfield wkk._db I
      // 136: iload 4
      // 138: ifne 1ed
      // 13b: aload 0
      // 13c: iload 4
      // 13e: ifeq 1e9
      // 141: goto 148
      // 144: invokestatic wkk.a (Loov;)Loov;
      // 147: athrow
      // 148: getfield wkk.w4s I
      // 14b: goto 152
      // 14e: invokestatic wkk.a (Loov;)Loov;
      // 151: athrow
      // 152: ifgt 1e1
      // 155: aload 0
      // 156: dup
      // 157: getfield wkk._db I
      // 15a: bipush 1
      // 15b: iadd
      // 15c: putfield wkk._db I
      // 15f: aload 0
      // 160: getfield wkk._db I
      // 163: iload 4
      // 165: ifeq 18a
      // 168: goto 16f
      // 16b: invokestatic wkk.a (Loov;)Loov;
      // 16e: athrow
      // 16f: bipush 80
      // 171: if_icmplt 1ed
      // 174: goto 17b
      // 177: invokestatic wkk.a (Loov;)Loov;
      // 17a: athrow
      // 17b: aload 1
      // 17c: invokevirtual ha9.i55 ()F
      // 17f: ldc 10.0
      // 181: nop
      // 182: fcmpl
      // 183: goto 18a
      // 186: invokestatic wkk.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 4
      // 18c: ifeq 1d6
      // 18f: ifgt 1c7
      // 192: goto 199
      // 195: invokestatic wkk.a (Loov;)Loov;
      // 198: athrow
      // 199: aload 5
      // 19b: getstatic v66.csg Lv66;
      // 19e: if_acmpeq 1c7
      // 1a1: goto 1a8
      // 1a4: invokestatic wkk.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 1
      // 1a9: invokevirtual ha9.i55 ()F
      // 1ac: fconst_1
      // 1ad: fcmpl
      // 1ae: ifle 1d7
      // 1b1: goto 1b8
      // 1b4: invokestatic wkk.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: aload 5
      // 1ba: getstatic v66.b_4 Lv66;
      // 1bd: if_acmpne 1d7
      // 1c0: goto 1c7
      // 1c3: invokestatic wkk.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 1
      // 1c8: getstatic ofh.y_6 Lofh;
      // 1cb: fconst_1
      // 1cc: invokevirtual ha9.m1t (Lofh;F)Z
      // 1cf: goto 1d6
      // 1d2: invokestatic wkk.a (Loov;)Loov;
      // 1d5: athrow
      // 1d6: pop
      // 1d7: aload 0
      // 1d8: bipush 0
      // 1d9: putfield wkk._db I
      // 1dc: iload 4
      // 1de: ifne 1ed
      // 1e1: aload 0
      // 1e2: goto 1e9
      // 1e5: invokestatic wkk.a (Loov;)Loov;
      // 1e8: athrow
      // 1e9: bipush 0
      // 1ea: putfield wkk._db I
      // 1ed: return
   }

   public void i9r(bdo var1) {
      long var2 = a ^ 33168376528854L;

      try {
         if (var1.inh(a<"e">(26229, 9016665099225904825L ^ var2), 99)) {
            this.w4s = var1.uz7(a<"e">(24639, 4116662033897631986L ^ var2));
            this._db = var1.uz7(a<"e">(7579, 8543480242441801042L ^ var2));
            this.zpo = var1.blg(a<"e">(27853, 8200046691640359941L ^ var2));
            this.y0n = var1.blg(a<"e">(12005, 2003377815792909870L ^ var2));
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public void sgq(bdo var1) {
      long var2 = a ^ 70663226524590L;
      var1.iin(a<"e">(24639, 4116584870317575306L ^ var2), this.w4s);
      var1.iin(a<"e">(7486, 4158242808505643400L ^ var2), this._db);
      var1._i9(a<"e">(30223, 27297996470114999L ^ var2), this.zpo);
      var1._i9(a<"e">(11560, 7293833757027467674L ^ var2), this.y0n);
   }

   public int f1i() {
      return this.w4s;
   }

   public int xzi() {
      return this.kdc;
   }

   public boolean njl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield wkk.w4s I
      // 08: iload 1
      // 09: ifeq 20
      // 0c: bipush 20
      // 0e: if_icmpge 23
      // 11: goto 18
      // 14: invokestatic wkk.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 20
      // 1c: invokestatic wkk.a (Loov;)Loov;
      // 1f: athrow
      // 20: goto 24
      // 23: bipush 0
      // 24: ireturn
   }

   public void qvy(float var1) {
      this.y0n = Math.min(this.y0n + var1, 40.0F);
   }

   public float n88() {
      return this.zpo;
   }

   public void _fj(int var1) {
      this.w4s = var1;
   }

   public void tew(float var1) {
      this.zpo = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2861817394817574601L, 1320858581498014295L, MethodHandles.lookup().lookupClass()).a(257082545342995L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 48781055221680L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "Ú ç$òyô\u008c(d\u0000Òv\u0004zq_µnIÕ\u001d\u0085åá·\rkÚ\u0082EÛ»ñ°`\u009e 2\u0083\u0018<ÚèA2\u009fXÉÄ/Þ\u0007Þ\u008f(\u0015r\u0015DHZ@â·([Èëã)J¢©×e\u000f\u009cÐ\t?\u001fX\u00ad \u008d¨J\r®¿\u001eKÙ4\u001e³±\u0093úBËñ\u0088\u0089Å(F³¤[Òá\u0007\u0080Çö\u0000½U\u009cº\u00adxµ\u008b\u0000\bñqu\u0082o/g|³Û;,m\tU7j|\u000b \"çùôiÂ2µ°®?Ívä Ô\u0090}\nò3t\fØÆ®eu\u0086\u0096[É (\u00adÊü\u000f\u001aHÙ´7|o\u0084\u0099¦\u009d`ÖË üÞu¹PÄ\u0011¦bpOà OÞ\u0085\n\u0014\u0006ö¹@,\u009e:T£à§C³\u009ehâ\u0091ü\u0096Òø6pÓ\u0094{\u008f";
      int var8 = "Ú ç$òyô\u008c(d\u0000Òv\u0004zq_µnIÕ\u001d\u0085åá·\rkÚ\u0082EÛ»ñ°`\u009e 2\u0083\u0018<ÚèA2\u009fXÉÄ/Þ\u0007Þ\u008f(\u0015r\u0015DHZ@â·([Èëã)J¢©×e\u000f\u009cÐ\t?\u001fX\u00ad \u008d¨J\r®¿\u001eKÙ4\u001e³±\u0093úBËñ\u0088\u0089Å(F³¤[Òá\u0007\u0080Çö\u0000½U\u009cº\u00adxµ\u008b\u0000\bñqu\u0082o/g|³Û;,m\tU7j|\u000b \"çùôiÂ2µ°®?Ívä Ô\u0090}\nò3t\fØÆ®eu\u0086\u0096[É (\u00adÊü\u000f\u001aHÙ´7|o\u0084\u0099¦\u009d`ÖË üÞu¹PÄ\u0011¦bpOà OÞ\u0085\n\u0014\u0006ö¹@,\u009e:T£à§C³\u009ehâ\u0091ü\u0096Òø6pÓ\u0094{\u008f"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[9];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "%+\u0015L³HI6'»ÀR\u0015xD½\u0094fÐ2×¾\u008eÞ(dÌ~ã<3÷JAU\u0098¡Pg'(5Wt^®Wn\u0000£\u0087}ï\u0016\nÖ\u001da:\u001aå¹Cm\u0080\u0096Ñ2\u008eÖî\u001bë«\u0080z²E0ó&";
                  var8 = "%+\u0015L³HI6'»ÀR\u0015xD½\u0094fÐ2×¾\u008eÞ(dÌ~ã<3÷JAU\u0098¡Pg'(5Wt^®Wn\u0000£\u0087}ï\u0016\nÖ\u001da:\u001aå¹Cm\u0080\u0096Ñ2\u008eÖî\u001bë«\u0080z²E0ó&"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6412;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("wkk", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("wkk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
