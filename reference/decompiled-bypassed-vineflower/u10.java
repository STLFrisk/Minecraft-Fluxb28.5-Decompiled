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

public class u10 extends s0i {
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public u10(t9d var1) {
      super(var1);
      this.yxc(1.4F, 0.9F);
      this.r1d.tn8(1, new dnq(this));
      this.r1d.tn8(3, new epq(this, 0.4F));
      this.r1d.tn8(4, new u10$nlg(this, ha9.class));
      this.r1d.tn8(4, new u10$nlg(this, osf.class));
      this.r1d.tn8(5, new _tb(this, 0.8));
      this.r1d.tn8(6, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(6, new ov6(this));
      this.g9o.tn8(1, new z7z(this, false, new Class[0]));
      this.g9o.tn8(2, new u10$red(this, ha9.class));
      this.g9o.tn8(3, new u10$red(this, osf.class));
   }

   @Override
   public double yyb() {
      return (double)(this.ikl * 0.5F);
   }

   @Override
   public p8a ri_(t9d var1) {
      return new epx(this, var1);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, new Byte((byte)0));
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial s0i.xx_ ()V
      // 08: aload 0
      // 09: iload 1
      // 0a: ifne 25
      // 0d: getfield u10.oay Lt9d;
      // 10: getfield t9d.v0f Z
      // 13: ifne 2c
      // 16: goto 1d
      // 19: invokestatic u10.d (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: goto 25
      // 21: invokestatic u10.d (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield u10.cbi Z
      // 29: invokevirtual u10.nly (Z)V
      // 2c: return
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(16.0);
      this.dgt(m6d.w7i).zf7(0.3F);
   }

   @Override
   public String _n1() {
      long var1 = c ^ 4913025548856L;
      return e<"z">(2240, 9153873704155487758L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 33907381472576L;
      return e<"z">(27675, 1889025265589974447L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 36972858718990L;
      return e<"z">(25336, 6241445285496081665L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = c ^ 94398191788610L;
      this.lhu(e<"z">(8983, 1146505689452926368L ^ var3), 0.15F, 1.0F);
   }

   @Override
   public u7m q4n() {
      return xbr.eij;
   }

   @Override
   public void ir3(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial s0i.ir3 (ZI)V
      // 0a: iload 1
      // 0b: iload 3
      // 0c: ifeq 33
      // 0f: ifeq 65
      // 12: goto 19
      // 15: invokestatic u10.d (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 3
      // 1b: ifeq 5d
      // 1e: goto 25
      // 21: invokestatic u10.d (Loov;)Loov;
      // 24: athrow
      // 25: getfield u10.z2d Ljava/util/Random;
      // 28: bipush 3
      // 29: invokevirtual java/util/Random.nextInt (I)I
      // 2c: goto 33
      // 2f: invokestatic u10.d (Loov;)Loov;
      // 32: athrow
      // 33: ifeq 55
      // 36: aload 0
      // 37: iload 3
      // 38: ifeq 5d
      // 3b: goto 42
      // 3e: invokestatic u10.d (Loov;)Loov;
      // 41: athrow
      // 42: getfield u10.z2d Ljava/util/Random;
      // 45: bipush 1
      // 46: iload 2
      // 47: iadd
      // 48: invokevirtual java/util/Random.nextInt (I)I
      // 4b: ifle 65
      // 4e: goto 55
      // 51: invokestatic u10.d (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: goto 5d
      // 59: invokestatic u10.d (Loov;)Loov;
      // 5c: athrow
      // 5d: getstatic xbr.mrm Lu7m;
      // 60: bipush 1
      // 61: invokevirtual u10.e70 (Lu7m;I)Lnvf;
      // 64: pop
      // 65: return
   }

   @Override
   public boolean z2m() {
      return this.n4s();
   }

   @Override
   public void wx3() {
   }

   @Override
   public n1e fhc() {
      return n1e.mw4;
   }

   @Override
   public boolean xav(sdj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual sdj._na ()I
      // 08: iload 2
      // 09: ifeq 24
      // 0c: getstatic mcs.veq Lmcs;
      // 0f: getfield mcs.zr9 I
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic u10.d (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: goto 24
      // 20: invokestatic u10.d (Loov;)Loov;
      // 23: athrow
      // 24: goto 2c
      // 27: aload 0
      // 28: aload 1
      // 29: invokespecial s0i.xav (Lsdj;)Z
      // 2c: ireturn
   }

   public boolean n4s() {
      int var1 = t9d.b();

      try {
         int var10000 = this.oit.miz(16) & 1;
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw d(var2);
      }

      return (boolean)0;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void nly(boolean var1) {
      int var2 = t9d.c();
      byte var3 = this.oit.miz(16);

      label37: {
         byte var10000;
         label44: {
            label41: {
               try {
                  var10000 = var1;
                  if (var2 != 0) {
                     break label44;
                  }

                  if (var1 == 0) {
                     break label41;
                  }
               } catch (oov var6) {
                  throw d(var6);
               }

               var3 = (byte)(var3 | 1);

               try {
                  if (var2 == 0) {
                     break label37;
                  }
               } catch (oov var5) {
                  boolean var10001 = false;
                  throw d(var5);
               }
            }

            try {
               var10000 = (byte)(var3 & -2);
            } catch (oov var4) {
               boolean var8 = false;
               throw d(var4);
            }
         }

         var3 = var10000;
      }

      this.oit.c66(16, var3);
   }

   @Override
   public ps6 hx8(css param1, ps6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: aload 2
      // 007: invokespecial s0i.hx8 (Lcss;Lps6;)Lps6;
      // 00a: iload 3
      // 00b: ifne 05d
      // 00e: astore 2
      // 00f: aload 0
      // 010: getfield u10.oay Lt9d;
      // 013: getfield t9d.fsy Ljava/util/Random;
      // 016: bipush 100
      // 018: invokevirtual java/util/Random.nextInt (I)I
      // 01b: ifne 05c
      // 01e: new jzg
      // 021: dup
      // 022: aload 0
      // 023: getfield u10.oay Lt9d;
      // 026: invokespecial jzg.<init> (Lt9d;)V
      // 029: astore 4
      // 02b: aload 4
      // 02d: aload 0
      // 02e: getfield u10.o2v D
      // 031: aload 0
      // 032: getfield u10.kfp D
      // 035: aload 0
      // 036: getfield u10.vbd D
      // 039: aload 0
      // 03a: getfield u10.x5k F
      // 03d: fconst_0
      // 03e: invokevirtual jzg.x24 (DDDFF)V
      // 041: aload 4
      // 043: aload 1
      // 044: aconst_null
      // 045: checkcast ps6
      // 048: invokevirtual jzg.hx8 (Lcss;Lps6;)Lps6;
      // 04b: pop
      // 04c: aload 0
      // 04d: getfield u10.oay Lt9d;
      // 050: aload 4
      // 052: invokevirtual t9d.xzq (Li2h;)Z
      // 055: pop
      // 056: aload 4
      // 058: aload 0
      // 059: invokevirtual jzg.nw9 (Li2h;)V
      // 05c: aload 2
      // 05d: iload 3
      // 05e: ifne 0c9
      // 061: ifnonnull 0c8
      // 064: goto 06b
      // 067: invokestatic u10.d (Loov;)Loov;
      // 06a: athrow
      // 06b: new u10$kme
      // 06e: dup
      // 06f: invokespecial u10$kme.<init> ()V
      // 072: iload 3
      // 073: ifne 0c9
      // 076: goto 07d
      // 079: invokestatic u10.d (Loov;)Loov;
      // 07c: athrow
      // 07d: astore 2
      // 07e: aload 0
      // 07f: getfield u10.oay Lt9d;
      // 082: invokevirtual t9d.rbk ()Lv66;
      // 085: getstatic v66.csg Lv66;
      // 088: if_acmpne 0c8
      // 08b: aload 0
      // 08c: getfield u10.oay Lt9d;
      // 08f: getfield t9d.fsy Ljava/util/Random;
      // 092: invokevirtual java/util/Random.nextFloat ()F
      // 095: ldc 0.1
      // 097: nop
      // 098: aload 1
      // 099: invokevirtual css.os2 ()F
      // 09c: fmul
      // 09d: fcmpg
      // 09e: iload 3
      // 09f: ifne 0d7
      // 0a2: goto 0a9
      // 0a5: invokestatic u10.d (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ifge 0c8
      // 0ac: goto 0b3
      // 0af: invokestatic u10.d (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 2
      // 0b4: checkcast u10$kme
      // 0b7: aload 0
      // 0b8: getfield u10.oay Lt9d;
      // 0bb: getfield t9d.fsy Ljava/util/Random;
      // 0be: invokevirtual u10$kme.rqa (Ljava/util/Random;)V
      // 0c1: goto 0c8
      // 0c4: invokestatic u10.d (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 2
      // 0c9: iload 3
      // 0ca: ifne 11b
      // 0cd: instanceof u10$kme
      // 0d0: goto 0d7
      // 0d3: invokestatic u10.d (Loov;)Loov;
      // 0d6: athrow
      // 0d7: ifeq 11a
      // 0da: aload 2
      // 0db: checkcast u10$kme
      // 0de: iload 3
      // 0df: ifne 11b
      // 0e2: goto 0e9
      // 0e5: invokestatic u10.d (Loov;)Loov;
      // 0e8: athrow
      // 0e9: getfield u10$kme.yzh I
      // 0ec: istore 4
      // 0ee: iload 4
      // 0f0: ifle 11a
      // 0f3: getstatic mcs.ip9 [Lmcs;
      // 0f6: iload 4
      // 0f8: aaload
      // 0f9: ifnull 11a
      // 0fc: goto 103
      // 0ff: invokestatic u10.d (Loov;)Loov;
      // 102: athrow
      // 103: aload 0
      // 104: new sdj
      // 107: dup
      // 108: iload 4
      // 10a: ldc 2147483647
      // 10c: nop
      // 10d: invokespecial sdj.<init> (II)V
      // 110: invokevirtual u10.gmn (Lsdj;)V
      // 113: goto 11a
      // 116: invokestatic u10.d (Loov;)Loov;
      // 119: athrow
      // 11a: aload 2
      // 11b: areturn
   }

   @Override
   public float c5y() {
      return 0.65F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3766717264864368524L, 403320597204922044L, MethodHandles.lookup().lookupClass()).a(51276327922984L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 110593271157771L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u009aG\u001aem17Æc¬N$¹ù\"zA\ný\u009f\u009d:ÚM5xÃ\f\u0002ÄÆ?ÜÌ!¤\u0095àø³ ~9\u009a\u0017ñ\u008c\u001bxm\u0096+â¤¸\u0006BÚÉ&<'ùÒ\u0093\u001dÞ±ùÏ\u0003\u008cì";
      int var8 = "\u009aG\u001aem17Æc¬N$¹ù\"zA\ný\u009f\u009d:ÚM5xÃ\f\u0002ÄÆ?ÜÌ!¤\u0095àø³ ~9\u009a\u0017ñ\u008c\u001bxm\u0096+â¤¸\u0006BÚÉ&<'ùÒ\u0093\u001dÞ±ùÏ\u0003\u008cì"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = f(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     u = new String[4];
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

                  var6 = "6Ìm¼î¤ch²\u0003¶\bZó\u001båÂô\"\u0093Ç^g:ä}ÆÊ\u0089\u008cG;\u0018Ë\u0013\u008bëpe\u0081\u0017[m\u0098ØXMÙÌÕþòH¹`ê$";
                  var8 = "6Ìm¼î¤ch²\u0003¶\bZó\u001båÂô\"\u0093Ç^g:ä}ÆÊ\u0089\u008cG;\u0018Ë\u0013\u008bëpe\u0081\u0017[m\u0098ØXMÙÌÕþòH¹`ê$".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov d(oov var0) {
      return var0;
   }

   private static String f(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4309;
      if (u[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("u10", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         u[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return u[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("u10" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
