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

public class roz extends b0t {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public roz(Minecraft var1) {
      this.mg8 = var1;
      this.yax = var1.jiu();
   }

   public void ky_(l7l var1) {
      long var2 = a ^ 70056364941937L;
      this.h8k = fc1.gx1(a<"o">(18058, 7192884565099133535L ^ var2), new Object[0]);
      this.r1e = var1.xn7().rnh();
      this.hex = Minecraft.qgs();
      this.ng0 = var1;
      this._k_ = false;
   }

   public void vax(l7l var1) {
      this.h8k = var1.xn7().rnh();
      this.r1e = var1.h7c();
      this.hex = Minecraft.qgs() + 2500L;
      this.ng0 = var1;
      this._k_ = true;
   }

   private void n_b() {
      hzu.fb6(0, 0, this.mg8.pfr, this.mg8.ry7);
      hzu.ah8(5889);
      hzu.zwy();
      hzu.ah8(5888);
      hzu.zwy();
      this.u85 = this.mg8.pfr;
      this.bxf = this.mg8.ry7;
      eka var1 = new eka(this.mg8);
      this.u85 = var1.x05();
      this.bxf = var1.lrx();
      hzu.yg5(256);
      hzu.ah8(5889);
      hzu.zwy();
      hzu.bj8(0.0, (double)this.u85, (double)this.bxf, 0.0, 1000.0, 3000.0);
      hzu.ah8(5888);
      hzu.zwy();
      hzu.a4k(0.0F, 0.0F, -2000.0F);
   }

   public void oec() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 01e
      // 009: getfield roz.ng0 Ll7l;
      // 00c: ifnull 1ef
      // 00f: goto 016
      // 012: invokestatic roz.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic roz.a (Loov;)Loov;
      // 01d: athrow
      // 01e: getfield roz.hex J
      // 021: lconst_0
      // 022: lcmp
      // 023: ifeq 1ef
      // 026: invokestatic Minecraft.vz1 ()Lc05;
      // 029: getfield Minecraft.vg8 Ll86;
      // 02c: ifnull 1ef
      // 02f: goto 036
      // 032: invokestatic roz.a (Loov;)Loov;
      // 035: athrow
      // 036: invokestatic Minecraft.qgs ()J
      // 039: aload 0
      // 03a: getfield roz.hex J
      // 03d: lsub
      // 03e: l2d
      // 03f: ldc2_w 3000.0
      // 042: ddiv
      // 043: dstore 2
      // 044: aload 0
      // 045: getfield roz._k_ Z
      // 048: iload 1
      // 049: ifne 095
      // 04c: ifne 090
      // 04f: goto 056
      // 052: invokestatic roz.a (Loov;)Loov;
      // 055: athrow
      // 056: dload 2
      // 057: dconst_0
      // 058: dcmpg
      // 059: iload 1
      // 05a: ifne 078
      // 05d: goto 064
      // 060: invokestatic roz.a (Loov;)Loov;
      // 063: athrow
      // 064: iflt 086
      // 067: goto 06e
      // 06a: invokestatic roz.a (Loov;)Loov;
      // 06d: athrow
      // 06e: dload 2
      // 06f: dconst_1
      // 070: dcmpl
      // 071: goto 078
      // 074: invokestatic roz.a (Loov;)Loov;
      // 077: athrow
      // 078: iload 1
      // 079: ifne 0af
      // 07c: ifle 0a7
      // 07f: goto 086
      // 082: invokestatic roz.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 0
      // 087: lconst_0
      // 088: putfield roz.hex J
      // 08b: return
      // 08c: invokestatic roz.a (Loov;)Loov;
      // 08f: athrow
      // 090: dload 2
      // 091: ldc2_w 0.5
      // 094: dcmpl
      // 095: iload 1
      // 096: ifne 0af
      // 099: ifle 0a7
      // 09c: goto 0a3
      // 09f: invokestatic roz.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: ldc2_w 0.5
      // 0a6: dstore 2
      // 0a7: aload 0
      // 0a8: invokespecial roz.n_b ()V
      // 0ab: invokestatic hzu._o4 ()V
      // 0ae: bipush 0
      // 0af: invokestatic hzu.jun (Z)V
      // 0b2: dload 2
      // 0b3: ldc2_w 2.0
      // 0b6: dmul
      // 0b7: dstore 4
      // 0b9: dload 4
      // 0bb: dconst_1
      // 0bc: dcmpl
      // 0bd: iload 1
      // 0be: ifne 0e5
      // 0c1: ifle 0d3
      // 0c4: goto 0cb
      // 0c7: invokestatic roz.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: ldc2_w 2.0
      // 0ce: dload 4
      // 0d0: dsub
      // 0d1: dstore 4
      // 0d3: dload 4
      // 0d5: ldc2_w 4.0
      // 0d8: dmul
      // 0d9: dstore 4
      // 0db: dconst_1
      // 0dc: dload 4
      // 0de: dsub
      // 0df: dstore 4
      // 0e1: dload 4
      // 0e3: dconst_0
      // 0e4: dcmpg
      // 0e5: iload 1
      // 0e6: ifne 10c
      // 0e9: ifge 0f6
      // 0ec: goto 0f3
      // 0ef: invokestatic roz.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: dconst_0
      // 0f4: dstore 4
      // 0f6: dload 4
      // 0f8: dload 4
      // 0fa: dmul
      // 0fb: dstore 4
      // 0fd: dload 4
      // 0ff: dload 4
      // 101: dmul
      // 102: dstore 4
      // 104: aload 0
      // 105: getfield roz.u85 I
      // 108: sipush 160
      // 10b: isub
      // 10c: istore 6
      // 10e: bipush 0
      // 10f: dload 4
      // 111: ldc2_w 36.0
      // 114: dmul
      // 115: d2i
      // 116: isub
      // 117: istore 7
      // 119: fconst_1
      // 11a: fconst_1
      // 11b: fconst_1
      // 11c: fconst_1
      // 11d: invokestatic hzu.wn0 (FFFF)V
      // 120: invokestatic hzu.rqj ()V
      // 123: aload 0
      // 124: getfield roz.mg8 Lc05;
      // 127: invokevirtual Minecraft.l22 ()Llc5;
      // 12a: getstatic roz.jxv Lgdz;
      // 12d: invokevirtual lc5.anl (Lgdz;)V
      // 130: invokestatic hzu.fpt ()V
      // 133: aload 0
      // 134: iload 6
      // 136: iload 7
      // 138: bipush 96
      // 13a: sipush 202
      // 13d: sipush 160
      // 140: bipush 32
      // 142: invokevirtual roz.mt4 (IIIIII)V
      // 145: aload 0
      // 146: getfield roz._k_ Z
      // 149: iload 1
      // 14a: ifne 1bd
      // 14d: ifeq 17d
      // 150: goto 157
      // 153: invokestatic roz.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 0
      // 158: getfield roz.mg8 Lc05;
      // 15b: getfield Minecraft.tx1 Lowt;
      // 15e: aload 0
      // 15f: getfield roz.r1e Ljava/lang/String;
      // 162: iload 6
      // 164: bipush 30
      // 166: iadd
      // 167: iload 7
      // 169: bipush 7
      // 16b: iadd
      // 16c: bipush 120
      // 16e: bipush -1
      // 16f: invokevirtual owt.bsn (Ljava/lang/String;IIII)V
      // 172: iload 1
      // 173: ifeq 1be
      // 176: goto 17d
      // 179: invokestatic roz.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 0
      // 17e: getfield roz.mg8 Lc05;
      // 181: getfield Minecraft.tx1 Lowt;
      // 184: aload 0
      // 185: getfield roz.h8k Ljava/lang/String;
      // 188: iload 6
      // 18a: bipush 30
      // 18c: iadd
      // 18d: i2f
      // 18e: iload 7
      // 190: bipush 7
      // 192: iadd
      // 193: i2f
      // 194: sipush -256
      // 197: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 19a: pop
      // 19b: aload 0
      // 19c: getfield roz.mg8 Lc05;
      // 19f: getfield Minecraft.tx1 Lowt;
      // 1a2: aload 0
      // 1a3: getfield roz.r1e Ljava/lang/String;
      // 1a6: iload 6
      // 1a8: bipush 30
      // 1aa: iadd
      // 1ab: i2f
      // 1ac: iload 7
      // 1ae: bipush 18
      // 1b0: iadd
      // 1b1: i2f
      // 1b2: bipush -1
      // 1b3: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 1b6: goto 1bd
      // 1b9: invokestatic roz.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: pop
      // 1be: invokestatic qpm.gdb ()V
      // 1c1: invokestatic hzu.fpt ()V
      // 1c4: invokestatic hzu.ixc ()V
      // 1c7: invokestatic hzu.avm ()V
      // 1ca: invokestatic hzu.s7q ()V
      // 1cd: aload 0
      // 1ce: getfield roz.yax Ly1w;
      // 1d1: aload 0
      // 1d2: getfield roz.ng0 Ll7l;
      // 1d5: getfield l7l.o5g Lerg;
      // 1d8: iload 6
      // 1da: bipush 8
      // 1dc: iadd
      // 1dd: iload 7
      // 1df: bipush 8
      // 1e1: iadd
      // 1e2: invokevirtual y1w.px5 (Lerg;II)V
      // 1e5: invokestatic hzu.fpt ()V
      // 1e8: bipush 1
      // 1e9: invokestatic hzu.jun (Z)V
      // 1ec: invokestatic hzu.m45 ()V
      // 1ef: return
   }

   public void nn1() {
      this.ng0 = null;
      this.hex = 0L;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1003407475902425864L, -238273737197773021L, MethodHandles.lookup().lookupClass()).a(196559995545710L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 117366056370315L;
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
      String var4 = "ùhÞ4á\u0002ÔÉ\u009a×4\u008fò\u0081\u009f½há'VQQÍ\u000fXõDêKSS5~Æû²!é\u009d¹©\u0005¡8Ðaô²&ÒÉOY£\u009cú_\u0096\u0080^\u008b\u009c\u0011·¡ØÁ\\\u0091bþx¶\u007fË'ÿ\u008dë\u001aSõ\u000bÅ¬ðüG\u0085Ì,Æ,\u0085X\u001de@]_ÏñÁ8<ç%\")\fm¶x";
      int var6 = "ùhÞ4á\u0002ÔÉ\u009a×4\u008fò\u0081\u009f½há'VQQÍ\u000fXõDêKSS5~Æû²!é\u009d¹©\u0005¡8Ðaô²&ÒÉOY£\u009cú_\u0096\u0080^\u008b\u009c\u0011·¡ØÁ\\\u0091bþx¶\u007fË'ÿ\u008dë\u001aSõ\u000bÅ¬ðüG\u0085Ì,Æ,\u0085X\u001de@]_ÏñÁ8<ç%\")\fm¶x"
         .length();
      char var3 = 24;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            jxv = new gdz(a<"o">(27178, 6944093784895484932L ^ var9));
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6460;
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
            throw new RuntimeException("roz", var10);
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
         throw new RuntimeException("roz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
