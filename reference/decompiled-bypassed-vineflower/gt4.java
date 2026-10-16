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

public class gt4 extends b0t {
   public static final gdz lib;
   public int s22;
   public int gqs;
   public int ibo;
   public int mij;
   public String frg;
   public int _me;
   public boolean c9a;
   public boolean c1s;
   public boolean f9x;
   private static final long a;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public gt4(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   public gt4(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.s22 = 200;
      this.gqs = 20;
      this.c9a = true;
      this.c1s = true;
      this._me = var1;
      this.ibo = var2;
      this.mij = var3;
      this.s22 = var4;
      this.gqs = var5;
      this.frg = var6;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public int getHoverState(boolean var1) {
      int var2 = t9d.b();
      byte var3 = 1;

      byte var10000;
      label47: {
         label55: {
            try {
               var10000 = this.c9a;
               if (var2 == 0) {
                  break label47;
               }

               if (this.c9a) {
                  break label55;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var3 = 0;

            try {
               if (var2 != 0) {
                  return var3;
               }
            } catch (oov var6) {
               boolean var10001 = false;
               throw a(var6);
            }
         }

         try {
            var10000 = var1;
         } catch (oov var5) {
            boolean var9 = false;
            throw a(var5);
         }
      }

      try {
         if (var2 == 0) {
            return var10000;
         }

         if (var10000 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return 2;
   }

   public void drawButton(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield gt4.c1s Z
      // 009: iload 4
      // 00b: ifne 032
      // 00e: ifeq 227
      // 011: goto 018
      // 014: invokestatic gt4.a (Loov;)Loov;
      // 017: athrow
      // 018: new java/awt/Color
      // 01b: dup
      // 01c: sipush 255
      // 01f: sipush 255
      // 022: sipush 255
      // 025: invokespecial java/awt/Color.<init> (III)V
      // 028: invokevirtual java/awt/Color.getRGB ()I
      // 02b: goto 032
      // 02e: invokestatic gt4.a (Loov;)Loov;
      // 031: athrow
      // 032: istore 5
      // 034: new java/awt/Color
      // 037: dup
      // 038: sipush 177
      // 03b: sipush 177
      // 03e: sipush 177
      // 041: invokespecial java/awt/Color.<init> (III)V
      // 044: invokevirtual java/awt/Color.getRGB ()I
      // 047: istore 6
      // 049: aload 1
      // 04a: invokevirtual c05.l22 ()Llc5;
      // 04d: getstatic gt4.lib Lgdz;
      // 050: invokevirtual lc5.anl (Lgdz;)V
      // 053: fconst_1
      // 054: fconst_1
      // 055: fconst_1
      // 056: fconst_1
      // 057: invokestatic hzu.wn0 (FFFF)V
      // 05a: aload 0
      // 05b: iload 2
      // 05c: aload 0
      // 05d: getfield gt4.ibo I
      // 060: iload 4
      // 062: ifne 07b
      // 065: if_icmplt 0ce
      // 068: goto 06f
      // 06b: invokestatic gt4.a (Loov;)Loov;
      // 06e: athrow
      // 06f: iload 3
      // 070: aload 0
      // 071: getfield gt4.mij I
      // 074: goto 07b
      // 077: invokestatic gt4.a (Loov;)Loov;
      // 07a: athrow
      // 07b: iload 4
      // 07d: ifne 09b
      // 080: if_icmplt 0ce
      // 083: goto 08a
      // 086: invokestatic gt4.a (Loov;)Loov;
      // 089: athrow
      // 08a: iload 2
      // 08b: aload 0
      // 08c: getfield gt4.ibo I
      // 08f: aload 0
      // 090: getfield gt4.s22 I
      // 093: iadd
      // 094: goto 09b
      // 097: invokestatic gt4.a (Loov;)Loov;
      // 09a: athrow
      // 09b: iload 4
      // 09d: ifne 0c7
      // 0a0: if_icmpge 0ce
      // 0a3: goto 0aa
      // 0a6: invokestatic gt4.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: iload 3
      // 0ab: iload 4
      // 0ad: ifne 0cb
      // 0b0: goto 0b7
      // 0b3: invokestatic gt4.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: getfield gt4.mij I
      // 0bb: aload 0
      // 0bc: getfield gt4.gqs I
      // 0bf: iadd
      // 0c0: goto 0c7
      // 0c3: invokestatic gt4.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: if_icmpge 0ce
      // 0ca: bipush 1
      // 0cb: goto 0cf
      // 0ce: bipush 0
      // 0cf: putfield gt4.f9x Z
      // 0d2: aload 0
      // 0d3: getfield gt4.thk Lnhs;
      // 0d6: ldc2_w 20.0
      // 0d9: invokevirtual nhs.yrv (D)Z
      // 0dc: iload 4
      // 0de: ifne 12e
      // 0e1: ifeq 104
      // 0e4: goto 0eb
      // 0e7: invokestatic gt4.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield gt4.f5c Lsbi;
      // 0ef: aload 0
      // 0f0: getfield gt4.f9x Z
      // 0f3: invokevirtual sbi.qtk (Z)V
      // 0f6: aload 0
      // 0f7: getfield gt4.thk Lnhs;
      // 0fa: invokevirtual nhs.zay ()V
      // 0fd: goto 104
      // 100: invokestatic gt4.a (Loov;)Loov;
      // 103: athrow
      // 104: invokestatic hzu.spd ()V
      // 107: sipush 770
      // 10a: sipush 771
      // 10d: bipush 1
      // 10e: bipush 0
      // 10f: invokestatic hzu.u39 (IIII)V
      // 112: sipush 770
      // 115: sipush 771
      // 118: invokestatic hzu.ru7 (II)V
      // 11b: aload 0
      // 11c: aload 1
      // 11d: iload 2
      // 11e: iload 3
      // 11f: invokevirtual gt4.mouseDragged (Lc05;II)V
      // 122: aload 0
      // 123: getfield gt4.f5c Lsbi;
      // 126: invokevirtual sbi.ds7 ()D
      // 129: ldc2_w 100.0
      // 12c: dmul
      // 12d: d2i
      // 12e: istore 7
      // 130: iload 7
      // 132: iload 4
      // 134: ifne 15d
      // 137: bipush 1
      // 138: if_icmplt 15c
      // 13b: goto 142
      // 13e: invokestatic gt4.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: getfield gt4.c9a Z
      // 146: iload 4
      // 148: ifne 199
      // 14b: goto 152
      // 14e: invokestatic gt4.a (Loov;)Loov;
      // 151: athrow
      // 152: ifne 15f
      // 155: goto 15c
      // 158: invokestatic gt4.a (Loov;)Loov;
      // 15b: athrow
      // 15c: bipush 1
      // 15d: istore 7
      // 15f: aload 0
      // 160: getfield gt4.ibo I
      // 163: i2f
      // 164: ldc 0.4
      // 166: nop
      // 167: fadd
      // 168: aload 0
      // 169: getfield gt4.mij I
      // 16c: i2f
      // 16d: ldc 0.4
      // 16f: nop
      // 170: fadd
      // 171: aload 0
      // 172: getfield gt4.s22 I
      // 175: i2f
      // 176: aload 0
      // 177: getfield gt4.gqs I
      // 17a: i2f
      // 17b: fconst_1
      // 17c: new java/awt/Color
      // 17f: dup
      // 180: sipush 255
      // 183: sipush 255
      // 186: sipush 255
      // 189: iload 7
      // 18b: invokespecial java/awt/Color.<init> (IIII)V
      // 18e: invokevirtual java/awt/Color.getRGB ()I
      // 191: bipush 0
      // 192: invokestatic mkt.cju (FFFFFII)V
      // 195: aload 0
      // 196: getfield gt4.ibo I
      // 199: i2f
      // 19a: aload 0
      // 19b: getfield gt4.mij I
      // 19e: i2f
      // 19f: aload 0
      // 1a0: getfield gt4.s22 I
      // 1a3: i2f
      // 1a4: aload 0
      // 1a5: getfield gt4.gqs I
      // 1a8: i2f
      // 1a9: fconst_1
      // 1aa: new java/awt/Color
      // 1ad: dup
      // 1ae: sipush 255
      // 1b1: sipush 255
      // 1b4: sipush 255
      // 1b7: iload 7
      // 1b9: invokespecial java/awt/Color.<init> (IIII)V
      // 1bc: invokevirtual java/awt/Color.getRGB ()I
      // 1bf: aload 0
      // 1c0: getfield gt4.c9a Z
      // 1c3: iload 4
      // 1c5: ifne 1d4
      // 1c8: ifeq 1d7
      // 1cb: goto 1d2
      // 1ce: invokestatic gt4.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: iload 5
      // 1d4: goto 1d9
      // 1d7: iload 6
      // 1d9: invokestatic mkt.cju (FFFFFII)V
      // 1dc: getstatic jsr.yk7 Lcyb;
      // 1df: aload 0
      // 1e0: getfield gt4.frg Ljava/lang/String;
      // 1e3: aload 0
      // 1e4: getfield gt4.ibo I
      // 1e7: aload 0
      // 1e8: getfield gt4.s22 I
      // 1eb: bipush 2
      // 1ec: idiv
      // 1ed: iadd
      // 1ee: i2f
      // 1ef: aload 0
      // 1f0: getfield gt4.mij I
      // 1f3: i2f
      // 1f4: aload 0
      // 1f5: getfield gt4.gqs I
      // 1f8: bipush 8
      // 1fa: isub
      // 1fb: i2f
      // 1fc: fconst_2
      // 1fd: fdiv
      // 1fe: fadd
      // 1ff: ldc 1.5
      // 201: nop
      // 202: fsub
      // 203: aload 0
      // 204: getfield gt4.c9a Z
      // 207: iload 4
      // 209: ifne 21f
      // 20c: ifeq 21e
      // 20f: goto 216
      // 212: invokestatic gt4.a (Loov;)Loov;
      // 215: athrow
      // 216: bipush -1
      // 217: goto 224
      // 21a: invokestatic gt4.a (Loov;)Loov;
      // 21d: athrow
      // 21e: bipush -1
      // 21f: bipush 50
      // 221: invokestatic mkt.kgs (II)I
      // 224: invokevirtual cyb.os_ (Ljava/lang/String;FFI)V
      // 227: return
   }

   public void mouseDragged(c05 var1, int var2, int var3) {
   }

   public void mouseReleased(int var1, int var2) {
   }

   public boolean mousePressed(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield gt4.c9a Z
      // 09: iload 4
      // 0b: ifeq 23
      // 0e: ifeq a5
      // 11: goto 18
      // 14: invokestatic gt4.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield gt4.c1s Z
      // 1c: goto 23
      // 1f: invokestatic gt4.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 4
      // 25: ifeq 33
      // 28: ifeq a5
      // 2b: goto 32
      // 2e: invokestatic gt4.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 2
      // 33: aload 0
      // 34: getfield gt4.ibo I
      // 37: iload 4
      // 39: ifeq 52
      // 3c: if_icmplt a5
      // 3f: goto 46
      // 42: invokestatic gt4.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 3
      // 47: aload 0
      // 48: getfield gt4.mij I
      // 4b: goto 52
      // 4e: invokestatic gt4.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 4
      // 54: ifeq 72
      // 57: if_icmplt a5
      // 5a: goto 61
      // 5d: invokestatic gt4.a (Loov;)Loov;
      // 60: athrow
      // 61: iload 2
      // 62: aload 0
      // 63: getfield gt4.ibo I
      // 66: aload 0
      // 67: getfield gt4.s22 I
      // 6a: iadd
      // 6b: goto 72
      // 6e: invokestatic gt4.a (Loov;)Loov;
      // 71: athrow
      // 72: iload 4
      // 74: ifeq 9e
      // 77: if_icmpge a5
      // 7a: goto 81
      // 7d: invokestatic gt4.a (Loov;)Loov;
      // 80: athrow
      // 81: iload 3
      // 82: iload 4
      // 84: ifeq a2
      // 87: goto 8e
      // 8a: invokestatic gt4.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield gt4.mij I
      // 92: aload 0
      // 93: getfield gt4.gqs I
      // 96: iadd
      // 97: goto 9e
      // 9a: invokestatic gt4.a (Loov;)Loov;
      // 9d: athrow
      // 9e: if_icmpge a5
      // a1: bipush 1
      // a2: goto a6
      // a5: bipush 0
      // a6: ireturn
   }

   public boolean n5l() {
      return this.f9x;
   }

   public void ssq(int var1, int var2) {
   }

   public void f06(dbu var1) {
      long var2 = a ^ 70265036733298L;
      var1.mak(vs1._e_(new gdz(a<"x">(30266, 4306626525192036585L ^ var2)), 1.0F));
   }

   public int t53() {
      return this.s22;
   }

   public void l1a(int var1) {
      this.s22 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7647963679374183798L, 8576255988174723394L, MethodHandles.lookup().lookupClass()).a(183633221160919L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 94565531104836L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "½Ï\u0007VY\u0006a[¦ôu\u008dLÆá:]q4k\u0016\u0011\u0081\u0092cÑÃù\u0016\u001ayf\u00adÑo\rc\u008eÝ]8£ß<Ö\b\u000f£¨\u000e\u0015ñ\u0010V-µåx²\u0015hö8×@ø\u0013îûjÍöÒ2\u0086i]\u008e0\u0013\u0003ÿTü\u0001\u008f¨t\u000fÆ\u0010x@\u0098.\u000eá";
      int var6 = "½Ï\u0007VY\u0006a[¦ôu\u008dLÆá:]q4k\u0016\u0011\u0081\u0092cÑÃù\u0016\u001ayf\u00adÑo\rc\u008eÝ]8£ß<Ö\b\u000f£¨\u000e\u0015ñ\u0010V-µåx²\u0015hö8×@ø\u0013îûjÍöÒ2\u0086i]\u008e0\u0013\u0003ÿTü\u0001\u008f¨t\u000fÆ\u0010x@\u0098.\u000eá"
         .length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[2];
            lib = new gdz(a<"x">(4136, 349247641906744268L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21189;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("gt4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("gt4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
