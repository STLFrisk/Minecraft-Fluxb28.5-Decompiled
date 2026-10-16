import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kpj {
   public kpj(Minecraft var1) {
      this.ji2 = var1;
   }

   public void d54(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield kpj.ji2 Lc05;
      // 008: invokevirtual Minecraft.vnk ()Ltyh;
      // 00b: invokeinterface tyh.tvw ()Z 1
      // 010: iload 3
      // 011: ifne 034
      // 014: ifeq 132
      // 017: goto 01e
      // 01a: invokestatic kpj.a (Loov;)Loov;
      // 01d: athrow
      // 01e: invokestatic hzu.spd ()V
      // 021: aload 0
      // 022: getfield kpj.ji2 Lc05;
      // 025: invokevirtual Minecraft.vnk ()Ltyh;
      // 028: invokeinterface tyh.g62 ()I 1
      // 02d: goto 034
      // 030: invokestatic kpj.a (Loov;)Loov;
      // 033: athrow
      // 034: istore 4
      // 036: iload 3
      // 037: ifne 126
      // 03a: iload 4
      // 03c: ifle 11b
      // 03f: goto 046
      // 042: invokestatic kpj.a (Loov;)Loov;
      // 045: athrow
      // 046: new java/lang/StringBuilder
      // 049: dup
      // 04a: invokespecial java/lang/StringBuilder.<init> ()V
      // 04d: ldc ""
      // 04f: nop
      // 050: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 053: iload 4
      // 055: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 058: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05b: astore 5
      // 05d: aload 0
      // 05e: getfield kpj.ji2 Lc05;
      // 061: getfield Minecraft.tx1 Lowt;
      // 064: aload 5
      // 066: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 069: istore 6
      // 06b: bipush 20
      // 06d: istore 7
      // 06f: iload 1
      // 070: iload 6
      // 072: isub
      // 073: bipush 1
      // 074: isub
      // 075: istore 8
      // 077: iload 2
      // 078: bipush 20
      // 07a: iadd
      // 07b: bipush 1
      // 07c: isub
      // 07d: istore 9
      // 07f: iload 2
      // 080: bipush 20
      // 082: iadd
      // 083: aload 0
      // 084: getfield kpj.ji2 Lc05;
      // 087: getfield Minecraft.tx1 Lowt;
      // 08a: getfield owt.rr7 I
      // 08d: iadd
      // 08e: bipush 1
      // 08f: isub
      // 090: istore 10
      // 092: invokestatic hzu.m_1 ()V
      // 095: invokestatic jom.yut ()Ljom;
      // 098: astore 11
      // 09a: aload 11
      // 09c: invokevirtual jom.zuq ()Lq3g;
      // 09f: astore 12
      // 0a1: fconst_0
      // 0a2: fconst_0
      // 0a3: fconst_0
      // 0a4: ldc 0.65
      // 0a6: nop
      // 0a7: ldc 0.35000002
      // 0a9: nop
      // 0aa: aload 0
      // 0ab: getfield kpj.law F
      // 0ae: fmul
      // 0af: fadd
      // 0b0: fconst_2
      // 0b1: fdiv
      // 0b2: invokestatic hzu.wn0 (FFFF)V
      // 0b5: aload 12
      // 0b7: bipush 7
      // 0b9: getstatic gnl.gx3 Lbe7;
      // 0bc: invokevirtual q3g.ezr (ILbe7;)V
      // 0bf: aload 12
      // 0c1: iload 8
      // 0c3: i2d
      // 0c4: iload 10
      // 0c6: i2d
      // 0c7: dconst_0
      // 0c8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0cb: invokevirtual q3g.pzw ()V
      // 0ce: aload 12
      // 0d0: iload 1
      // 0d1: i2d
      // 0d2: iload 10
      // 0d4: i2d
      // 0d5: dconst_0
      // 0d6: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0d9: invokevirtual q3g.pzw ()V
      // 0dc: aload 12
      // 0de: iload 1
      // 0df: i2d
      // 0e0: iload 9
      // 0e2: i2d
      // 0e3: dconst_0
      // 0e4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0e7: invokevirtual q3g.pzw ()V
      // 0ea: aload 12
      // 0ec: iload 8
      // 0ee: i2d
      // 0ef: iload 9
      // 0f1: i2d
      // 0f2: dconst_0
      // 0f3: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f6: invokevirtual q3g.pzw ()V
      // 0f9: aload 11
      // 0fb: invokevirtual jom.q7g ()V
      // 0fe: invokestatic hzu.rqj ()V
      // 101: aload 0
      // 102: getfield kpj.ji2 Lc05;
      // 105: getfield Minecraft.tx1 Lowt;
      // 108: aload 5
      // 10a: iload 1
      // 10b: iload 6
      // 10d: isub
      // 10e: i2f
      // 10f: iload 2
      // 110: bipush 20
      // 112: iadd
      // 113: i2f
      // 114: ldc 16777215
      // 116: nop
      // 117: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 11a: pop
      // 11b: aload 0
      // 11c: iload 1
      // 11d: iload 2
      // 11e: aload 0
      // 11f: invokespecial kpj.wuo ()I
      // 122: bipush 0
      // 123: invokespecial kpj.hso (IIII)V
      // 126: aload 0
      // 127: iload 1
      // 128: iload 2
      // 129: aload 0
      // 12a: invokespecial kpj.ki8 ()I
      // 12d: bipush 17
      // 12f: invokespecial kpj.hso (IIII)V
      // 132: return
   }

   private void hso(int var1, int var2, int var3, int var4) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 0.65F + 0.35000002F * this.law);
      this.ji2.l22().anl(mej);
      float var5 = 150.0F;
      float var6 = 0.0F;
      float var7 = (float)var3 * 0.015625F;
      float var8 = 1.0F;
      float var9 = (float)(var3 + 16) * 0.015625F;
      jom var10 = jom.yut();
      q3g var11 = var10.zuq();
      var11.ezr(7, gnl._r5);
      var11.g5o((double)(var1 - 16 - var4), (double)(var2 + 16), (double)var5).h0a((double)var6, (double)var9).pzw();
      var11.g5o((double)(var1 - var4), (double)(var2 + 16), (double)var5).h0a((double)var8, (double)var9).pzw();
      var11.g5o((double)(var1 - var4), (double)(var2 + 0), (double)var5).h0a((double)var8, (double)var7).pzw();
      var11.g5o((double)(var1 - 16 - var4), (double)(var2 + 0), (double)var5).h0a((double)var6, (double)var7).pzw();
      var10.q7g();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private int wuo() {
      int var1 = OpaquePredicate.b();

      try {
         byte var10000 = this.ji2.vnk().yg8();
         if (var1 == 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 16;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return 0;
   }

   private int ki8() {
      int var1 = OpaquePredicate.c();

      try {
         byte var10000 = this.ji2.vnk().dh3();
         if (var1 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 48;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return 32;
   }

   public void fhg() {
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
      // 05: iload 1
      // 06: ifeq a7
      // 09: getfield kpj.ji2 Lc05;
      // 0c: invokevirtual Minecraft.vnk ()Ltyh;
      // 0f: invokeinterface tyh.tvw ()Z 1
      // 14: ifeq 9a
      // 17: goto 1e
      // 1a: invokestatic kpj.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: dup
      // 20: getfield kpj.law F
      // 23: ldc 0.025
      // 25: nop
      // 26: aload 0
      // 27: getfield kpj._n_ I
      // 2a: i2f
      // 2b: fmul
      // 2c: fadd
      // 2d: putfield kpj.law F
      // 30: aload 0
      // 31: getfield kpj.law F
      // 34: fconst_0
      // 35: fcmpg
      // 36: iload 1
      // 37: ifeq 7d
      // 3a: goto 41
      // 3d: invokestatic kpj.a (Loov;)Loov;
      // 40: athrow
      // 41: ifge 65
      // 44: goto 4b
      // 47: invokestatic kpj.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: dup
      // 4d: getfield kpj._n_ I
      // 50: bipush -1
      // 51: imul
      // 52: putfield kpj._n_ I
      // 55: aload 0
      // 56: fconst_0
      // 57: putfield kpj.law F
      // 5a: iload 1
      // 5b: ifne ab
      // 5e: goto 65
      // 61: invokestatic kpj.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: iload 1
      // 67: ifeq 92
      // 6a: goto 71
      // 6d: invokestatic kpj.a (Loov;)Loov;
      // 70: athrow
      // 71: getfield kpj.law F
      // 74: fconst_1
      // 75: fcmpl
      // 76: goto 7d
      // 79: invokestatic kpj.a (Loov;)Loov;
      // 7c: athrow
      // 7d: ifle ab
      // 80: aload 0
      // 81: dup
      // 82: getfield kpj._n_ I
      // 85: bipush -1
      // 86: imul
      // 87: putfield kpj._n_ I
      // 8a: aload 0
      // 8b: goto 92
      // 8e: invokestatic kpj.a (Loov;)Loov;
      // 91: athrow
      // 92: fconst_1
      // 93: putfield kpj.law F
      // 96: iload 1
      // 97: ifne ab
      // 9a: aload 0
      // 9b: fconst_1
      // 9c: putfield kpj.law F
      // 9f: aload 0
      // a0: goto a7
      // a3: invokestatic kpj.a (Loov;)Loov;
      // a6: athrow
      // a7: bipush 1
      // a8: putfield kpj._n_ I
      // ab: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(556672837391828036L, -6677295987787428971L, MethodHandles.lookup().lookupClass()).a(34306328673054L);
      // $VF: monitorexit
      long var4 = var10000 ^ 131269631207618L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("-\n\u0019yÌ\u008bD7ä\u0097Ö\u008cÖÌn¢/ \u00999\u001bcÊ?\u000ee©'vª\u0000¢n;õ¸Ø\u0099\u001a\u001e".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      mej = new gdz(var0);
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
}
