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

public class a59 extends SubEngine {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public a59() {
      long var1 = a ^ 52984452790321L;
      super(a<"q">(22516, 7213443122818202905L ^ var1), a<"q">(25749, 578943394416397945L ^ var1));
      this.e_x = null;
      this.nhs = null;
      this.eve = null;
      this.e40 = new Timer();
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
   }

   @Override
   public void onRender() {
      this.wyl.oxn.e5o.m7n = false;
      super.onRender();
   }

   @EventHandler
   public void zy8(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aconst_null
      // 002: putfield a59.e_x Lmew;
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: aload 0
      // 009: aconst_null
      // 00a: putfield a59.nhs Lmew;
      // 00d: istore 2
      // 00e: aload 0
      // 00f: getfield a59.wyl Lc05;
      // 012: getfield Minecraft.vg8 Ll86;
      // 015: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 018: iload 2
      // 019: ifne 037
      // 01c: ifnull 06d
      // 01f: goto 026
      // 022: invokestatic a59.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 0
      // 027: getfield a59.wyl Lc05;
      // 02a: getfield Minecraft.vg8 Ll86;
      // 02d: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 030: goto 037
      // 033: invokestatic a59.a (Loov;)Loov;
      // 036: athrow
      // 037: invokevirtual erg.gn1 ()Lu7m;
      // 03a: iload 2
      // 03b: ifne 067
      // 03e: ifnull 06d
      // 041: goto 048
      // 044: invokestatic a59.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: getfield a59.wyl Lc05;
      // 04c: getfield Minecraft.vg8 Ll86;
      // 04f: iload 2
      // 050: ifne 079
      // 053: goto 05a
      // 056: invokestatic a59.a (Loov;)Loov;
      // 059: athrow
      // 05a: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 05d: invokevirtual erg.gn1 ()Lu7m;
      // 060: goto 067
      // 063: invokestatic a59.a (Loov;)Loov;
      // 066: athrow
      // 067: instanceof gun
      // 06a: ifne 072
      // 06d: return
      // 06e: invokestatic a59.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: getfield a59.wyl Lc05;
      // 076: getfield Minecraft.vg8 Ll86;
      // 079: bipush 0
      // 07a: invokevirtual EntityPlayerSP.fqc (Z)V
      // 07d: new mew
      // 080: dup
      // 081: aload 0
      // 082: getfield a59.wyl Lc05;
      // 085: getfield Minecraft.vg8 Ll86;
      // 088: getfield EntityPlayerSP.o2v D
      // 08b: aload 0
      // 08c: getfield a59.wyl Lc05;
      // 08f: getfield Minecraft.vg8 Ll86;
      // 092: getfield EntityPlayerSP.kfp D
      // 095: ldc2_w 0.01
      // 098: dsub
      // 099: aload 0
      // 09a: getfield a59.wyl Lc05;
      // 09d: getfield Minecraft.vg8 Ll86;
      // 0a0: getfield EntityPlayerSP.vbd D
      // 0a3: invokespecial mew.<init> (DDD)V
      // 0a6: astore 3
      // 0a7: iload 2
      // 0a8: ifne 0cb
      // 0ab: aload 3
      // 0ac: invokestatic bk4._82 (Lmew;)Le0x;
      // 0af: invokevirtual e0x.p1r ()Lp3y;
      // 0b2: getstatic p3y.cei Lp3y;
      // 0b5: if_acmpne 13a
      // 0b8: goto 0bf
      // 0bb: invokestatic a59.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: aload 3
      // 0c1: putfield a59.e_x Lmew;
      // 0c4: goto 0cb
      // 0c7: invokestatic a59.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: invokestatic vt2.values ()[Lvt2;
      // 0ce: astore 4
      // 0d0: aload 4
      // 0d2: arraylength
      // 0d3: istore 5
      // 0d5: bipush 0
      // 0d6: istore 6
      // 0d8: iload 6
      // 0da: iload 5
      // 0dc: if_icmpge 13a
      // 0df: aload 4
      // 0e1: iload 6
      // 0e3: aaload
      // 0e4: astore 7
      // 0e6: aload 0
      // 0e7: getfield a59.e_x Lmew;
      // 0ea: aload 7
      // 0ec: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0ef: astore 8
      // 0f1: iload 2
      // 0f2: ifne 182
      // 0f5: iload 2
      // 0f6: ifne 136
      // 0f9: goto 100
      // 0fc: invokestatic a59.a (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 8
      // 102: invokestatic bk4._82 (Lmew;)Le0x;
      // 105: invokevirtual e0x.p1r ()Lp3y;
      // 108: getstatic p3y.cei Lp3y;
      // 10b: if_acmpeq 12c
      // 10e: goto 115
      // 111: invokestatic a59.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 0
      // 116: aload 7
      // 118: putfield a59.eve Lvt2;
      // 11b: aload 0
      // 11c: aload 8
      // 11e: putfield a59.nhs Lmew;
      // 121: iload 2
      // 122: ifeq 13a
      // 125: goto 12c
      // 128: invokestatic a59.a (Loov;)Loov;
      // 12b: athrow
      // 12c: iinc 6 1
      // 12f: goto 136
      // 132: invokestatic a59.a (Loov;)Loov;
      // 135: athrow
      // 136: iload 2
      // 137: ifeq 0d8
      // 13a: aload 1
      // 13b: aload 0
      // 13c: getfield a59.wyl Lc05;
      // 13f: getfield Minecraft.vg8 Ll86;
      // 142: getfield EntityPlayerSP.x5k F
      // 145: fconst_0
      // 146: iload 2
      // 147: ifne 177
      // 14a: fcmpl
      // 14b: ifle 16a
      // 14e: goto 155
      // 151: invokestatic a59.a (Loov;)Loov;
      // 154: athrow
      // 155: aload 0
      // 156: getfield a59.wyl Lc05;
      // 159: getfield Minecraft.vg8 Ll86;
      // 15c: getfield EntityPlayerSP.x5k F
      // 15f: ldc 180.0
      // 161: nop
      // 162: fsub
      // 163: goto 178
      // 166: invokestatic a59.a (Loov;)Loov;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield a59.wyl Lc05;
      // 16e: getfield Minecraft.vg8 Ll86;
      // 171: getfield EntityPlayerSP.x5k F
      // 174: ldc 180.0
      // 176: nop
      // 177: fadd
      // 178: invokevirtual PlayerUpdateEvent.h8j (F)V
      // 17b: aload 1
      // 17c: ldc 82.0
      // 17e: nop
      // 17f: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 182: return
   }

   @EventHandler
   public void _qm(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new mew
      // 03: dup
      // 04: aload 0
      // 05: getfield a59.wyl Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: getfield EntityPlayerSP.o2v D
      // 0e: aload 0
      // 0f: getfield a59.wyl Lc05;
      // 12: getfield Minecraft.vg8 Ll86;
      // 15: getfield EntityPlayerSP.icv D
      // 18: ldc2_w 2.0
      // 1b: dmul
      // 1c: dadd
      // 1d: aload 0
      // 1e: getfield a59.wyl Lc05;
      // 21: getfield Minecraft.vg8 Ll86;
      // 24: getfield EntityPlayerSP.kfp D
      // 27: ldc2_w 0.01
      // 2a: dsub
      // 2b: aload 0
      // 2c: getfield a59.wyl Lc05;
      // 2f: getfield Minecraft.vg8 Ll86;
      // 32: getfield EntityPlayerSP.vbd D
      // 35: aload 0
      // 36: getfield a59.wyl Lc05;
      // 39: getfield Minecraft.vg8 Ll86;
      // 3c: getfield EntityPlayerSP.bw4 D
      // 3f: ldc2_w 2.0
      // 42: dmul
      // 43: dadd
      // 44: invokespecial mew.<init> (DDD)V
      // 47: astore 3
      // 48: invokestatic OpaquePredicate.b ()I
      // 4b: new mew
      // 4e: dup
      // 4f: aload 0
      // 50: getfield a59.wyl Lc05;
      // 53: getfield Minecraft.vg8 Ll86;
      // 56: getfield EntityPlayerSP.o2v D
      // 59: aload 0
      // 5a: getfield a59.wyl Lc05;
      // 5d: getfield Minecraft.vg8 Ll86;
      // 60: getfield EntityPlayerSP.kfp D
      // 63: ldc2_w 0.01
      // 66: dsub
      // 67: aload 0
      // 68: getfield a59.wyl Lc05;
      // 6b: getfield Minecraft.vg8 Ll86;
      // 6e: getfield EntityPlayerSP.vbd D
      // 71: invokespecial mew.<init> (DDD)V
      // 74: astore 4
      // 76: istore 2
      // 77: aload 3
      // 78: invokestatic bk4._82 (Lmew;)Le0x;
      // 7b: invokevirtual e0x.p1r ()Lp3y;
      // 7e: getstatic p3y.cei Lp3y;
      // 81: iload 2
      // 82: ifeq a1
      // 85: if_acmpeq b5
      // 88: goto 8f
      // 8b: invokestatic a59.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 4
      // 91: invokestatic bk4._82 (Lmew;)Le0x;
      // 94: invokevirtual e0x.p1r ()Lp3y;
      // 97: getstatic p3y.cei Lp3y;
      // 9a: goto a1
      // 9d: invokestatic a59.a (Loov;)Loov;
      // a0: athrow
      // a1: if_acmpne a7
      // a4: goto b5
      // a7: aload 0
      // a8: getfield a59.wyl Lc05;
      // ab: getfield Minecraft.oxn Lmoh;
      // ae: getfield moh.e5o Lm7l;
      // b1: bipush 0
      // b2: putfield m7l.m7n Z
      // b5: return
   }

   @EventHandler
   public void ei2(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: bipush 1
      // 06: invokevirtual _qa.yu1 (Z)V
      // 09: iload 2
      // 0a: ifeq 63
      // 0d: aload 0
      // 0e: getfield a59.wyl Lc05;
      // 11: getfield Minecraft.vg8 Ll86;
      // 14: getfield EntityPlayerSP.lfk Z
      // 17: ifeq 57
      // 1a: goto 21
      // 1d: invokestatic a59.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield a59.wyl Lc05;
      // 25: getfield Minecraft.vg8 Ll86;
      // 28: getfield EntityPlayerSP.fcv Z
      // 2b: iload 2
      // 2c: ifeq 54
      // 2f: goto 36
      // 32: invokestatic a59.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 57
      // 39: goto 40
      // 3c: invokestatic a59.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield a59.wyl Lc05;
      // 44: getfield Minecraft.vg8 Ll86;
      // 47: getfield EntityPlayerSP.g9g Lboa;
      // 4a: getfield boa.s0a Z
      // 4d: goto 54
      // 50: invokestatic a59.a (Loov;)Loov;
      // 53: athrow
      // 54: ifeq 68
      // 57: aload 1
      // 58: dconst_0
      // 59: putfield _qa.c6l D
      // 5c: goto 63
      // 5f: invokestatic a59.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: dconst_0
      // 65: putfield _qa.faq D
      // 68: return
   }

   @EventHandler
   public void wd3(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield a59.e_x Lmew;
      // 08: iload 2
      // 09: ifeq 2c
      // 0c: ifnull 47
      // 0f: goto 16
      // 12: invokestatic a59.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: ifeq 30
      // 1b: goto 22
      // 1e: invokestatic a59.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield a59.nhs Lmew;
      // 25: goto 2c
      // 28: invokestatic a59.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifnull 47
      // 2f: aload 0
      // 30: iload 2
      // 31: ifeq 4d
      // 34: getfield a59.e40 Lnhs;
      // 37: ldc2_w 300.0
      // 3a: invokevirtual Timer.yrv (D)Z
      // 3d: ifne 4c
      // 40: goto 47
      // 43: invokestatic a59.a (Loov;)Loov;
      // 46: athrow
      // 47: return
      // 48: invokestatic a59.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield a59.wyl Lc05;
      // 50: getfield Minecraft.tij Lkh3;
      // 53: aload 0
      // 54: aload 0
      // 55: getfield a59.e_x Lmew;
      // 58: invokespecial a59.tsl (Lmew;)Lfqr;
      // 5b: ldc2_w 0.5
      // 5e: ldc2_w 0.5
      // 61: ldc2_w 0.5
      // 64: invokevirtual fqr.r2x (DDD)Lfqr;
      // 67: aload 0
      // 68: aload 0
      // 69: getfield a59.nhs Lmew;
      // 6c: invokespecial a59.tsl (Lmew;)Lfqr;
      // 6f: ldc2_w 0.5
      // 72: ldc2_w 0.5
      // 75: ldc2_w 0.5
      // 78: invokevirtual fqr.r2x (DDD)Lfqr;
      // 7b: invokevirtual WorldClient.caq (Lfqr;Lfqr;)Lakm;
      // 7e: astore 3
      // 7f: aload 3
      // 80: iload 2
      // 81: ifeq 90
      // 84: ifnonnull 8f
      // 87: goto 8e
      // 8a: invokestatic a59.a (Loov;)Loov;
      // 8d: athrow
      // 8e: return
      // 8f: aload 3
      // 90: getfield akm.jhn Lfqr;
      // 93: astore 4
      // 95: aload 0
      // 96: getfield a59.wyl Lc05;
      // 99: getfield Minecraft.vg8 Ll86;
      // 9c: invokevirtual EntityPlayerSP.hgb ()V
      // 9f: aload 0
      // a0: getfield a59.wyl Lc05;
      // a3: getfield Minecraft.l7q Lhh6;
      // a6: aload 0
      // a7: getfield a59.wyl Lc05;
      // aa: getfield Minecraft.vg8 Ll86;
      // ad: aload 0
      // ae: getfield a59.wyl Lc05;
      // b1: getfield Minecraft.tij Lkh3;
      // b4: aload 0
      // b5: getfield a59.wyl Lc05;
      // b8: getfield Minecraft.vg8 Ll86;
      // bb: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // be: aload 0
      // bf: getfield a59.nhs Lmew;
      // c2: aload 3
      // c3: getfield akm.m_f Lvt2;
      // c6: aload 4
      // c8: invokevirtual hh6.onPlayerRightClick (Ll86;Lkh3;Lerg;Lmew;Lvt2;Lfqr;)Z
      // cb: pop
      // cc: aload 0
      // cd: getfield a59.e40 Lnhs;
      // d0: invokevirtual Timer.zay ()V
      // d3: return
   }

   private fqr tsl(mew var1) {
      return new fqr((double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-659642410375599123L, 7101314832914264119L, MethodHandles.lookup().lookupClass()).a(280651375583810L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 116395601859132L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u000fß6Z%R\u00819\u0001ûä\u0001jV!\u0089 ºß\u001d&¿Ò\u0001ö¦¦þ»a\u009d\u0097\u0011w*XXâ\u009f³â[\bí-\u001bîBÈ";
      int var8 = "\u000fß6Z%R\u00819\u0001ûä\u0001jV!\u0089 ºß\u001d&¿Ò\u0001ö¦¦þ»a\u009d\u0097\u0011w*XXâ\u009f³â[\bí-\u001bîBÈ".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9952;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("a59", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("a59" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
