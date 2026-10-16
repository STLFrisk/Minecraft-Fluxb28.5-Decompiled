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

public abstract class s0i extends laq implements uv0 {
   private static final long d;
   private static final String[] h;
   private static final String[] s;
   private static final Map t = new HashMap(13);

   public s0i(t9d var1) {
      super(var1);
      this.dlk = 5;
   }

   @Override
   public void e_a() {
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
      // 05: invokevirtual s0i.inv ()V
      // 08: aload 0
      // 09: fconst_1
      // 0a: invokevirtual s0i.xeu (F)F
      // 0d: fstore 2
      // 0e: iload 1
      // 0f: ifne 36
      // 12: fload 2
      // 13: ldc 0.5
      // 15: nop
      // 16: fcmpl
      // 17: ifle 32
      // 1a: goto 21
      // 1d: invokestatic s0i.b (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: dup
      // 23: getfield s0i.dof I
      // 26: bipush 2
      // 27: iadd
      // 28: putfield s0i.dof I
      // 2b: goto 32
      // 2e: invokestatic s0i.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: invokespecial laq.e_a ()V
      // 36: return
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
      // 05: invokespecial laq.xx_ ()V
      // 08: aload 0
      // 09: getfield s0i.oay Lt9d;
      // 0c: iload 1
      // 0d: ifne 33
      // 10: getfield t9d.v0f Z
      // 13: ifne 47
      // 16: goto 1d
      // 19: invokestatic s0i.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: iload 1
      // 1f: ifne 44
      // 22: goto 29
      // 25: invokestatic s0i.b (Loov;)Loov;
      // 28: athrow
      // 29: getfield s0i.oay Lt9d;
      // 2c: goto 33
      // 2f: invokestatic s0i.b (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual t9d.rbk ()Lv66;
      // 36: getstatic v66.na2 Lv66;
      // 39: if_acmpne 47
      // 3c: aload 0
      // 3d: goto 44
      // 40: invokestatic s0i.b (Loov;)Loov;
      // 43: athrow
      // 44: invokevirtual s0i._kl ()V
      // 47: return
   }

   @Override
   public String ors() {
      long var1 = d ^ 111766539778782L;
      return d<"h">(30158, 289425141687788308L ^ var1);
   }

   @Override
   public String hux() {
      long var1 = d ^ 14084739292947L;
      return d<"h">(7393, 8406355286162976754L ^ var1);
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual s0i.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifne 23
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic s0i.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic s0i.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 1
      // 1f: fload 2
      // 20: invokespecial laq.m1t (Lofh;F)Z
      // 23: iload 3
      // 24: ifne 66
      // 27: ifeq 65
      // 2a: goto 31
      // 2d: invokestatic s0i.b (Loov;)Loov;
      // 30: athrow
      // 31: aload 1
      // 32: invokevirtual ofh.nra ()Li2h;
      // 35: astore 4
      // 37: aload 0
      // 38: getfield s0i.wgv Li2h;
      // 3b: aload 4
      // 3d: iload 3
      // 3e: ifne 58
      // 41: if_acmpeq 63
      // 44: goto 4b
      // 47: invokestatic s0i.b (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield s0i.hzp Li2h;
      // 4f: aload 4
      // 51: goto 58
      // 54: invokestatic s0i.b (Loov;)Loov;
      // 57: athrow
      // 58: if_acmpeq 63
      // 5b: bipush 1
      // 5c: goto 64
      // 5f: invokestatic s0i.b (Loov;)Loov;
      // 62: athrow
      // 63: bipush 1
      // 64: ireturn
      // 65: bipush 0
      // 66: ireturn
   }

   @Override
   public String wcg() {
      long var1 = d ^ 131261656765352L;
      return d<"h">(4130, 5343401831325659019L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = d ^ 79265686955494L;
      return d<"h">(10623, 4083848425842827423L ^ var1);
   }

   @Override
   public String rz6(int var1) {
      long var2 = d ^ 108686679458574L;

      try {
         if (var1 > 4) {
            return d<"h">(4567, 7653259828182695644L ^ var2);
         }
      } catch (oov var4) {
         throw b(var4);
      }

      return d<"h">(31122, 3956320657643787931L ^ var2);
   }

   @Override
   public boolean _nm(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic m6d.y3f Lw9p;
      // 04: invokevirtual s0i.dgt (Lw9p;)L_4o;
      // 07: invokeinterface _4o.nz5 ()D 1
      // 0c: d2f
      // 0d: fstore 3
      // 0e: invokestatic t9d.b ()I
      // 11: bipush 0
      // 12: istore 4
      // 14: istore 2
      // 15: aload 1
      // 16: instanceof g_3
      // 19: iload 2
      // 1a: ifeq 4a
      // 1d: ifeq 41
      // 20: goto 27
      // 23: invokestatic s0i.b (Loov;)Loov;
      // 26: athrow
      // 27: fload 3
      // 28: aload 0
      // 29: invokevirtual s0i.tsc ()Lerg;
      // 2c: aload 1
      // 2d: checkcast g_3
      // 30: invokevirtual g_3.fhc ()Ln1e;
      // 33: invokestatic hc0.xpe (Lerg;Ln1e;)F
      // 36: fadd
      // 37: fstore 3
      // 38: iload 4
      // 3a: aload 0
      // 3b: invokestatic hc0.kzt (Lg_3;)I
      // 3e: iadd
      // 3f: istore 4
      // 41: aload 1
      // 42: aload 0
      // 43: invokestatic ofh.kun (Lg_3;)Lofh;
      // 46: fload 3
      // 47: invokevirtual i2h.m1t (Lofh;F)Z
      // 4a: istore 5
      // 4c: iload 5
      // 4e: iload 2
      // 4f: ifeq ec
      // 52: ifeq ea
      // 55: goto 5c
      // 58: invokestatic s0i.b (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 4
      // 5e: iload 2
      // 5f: ifeq ce
      // 62: goto 69
      // 65: invokestatic s0i.b (Loov;)Loov;
      // 68: athrow
      // 69: ifle ca
      // 6c: goto 73
      // 6f: invokestatic s0i.b (Loov;)Loov;
      // 72: athrow
      // 73: aload 1
      // 74: aload 0
      // 75: getfield s0i.x5k F
      // 78: ldc 3.1415927
      // 7a: nop
      // 7b: fmul
      // 7c: ldc 180.0
      // 7e: nop
      // 7f: fdiv
      // 80: invokestatic fe6.rtn (F)F
      // 83: fneg
      // 84: iload 4
      // 86: i2f
      // 87: fmul
      // 88: ldc 0.5
      // 8a: nop
      // 8b: fmul
      // 8c: f2d
      // 8d: ldc2_w 0.1
      // 90: aload 0
      // 91: getfield s0i.x5k F
      // 94: ldc 3.1415927
      // 96: nop
      // 97: fmul
      // 98: ldc 180.0
      // 9a: nop
      // 9b: fdiv
      // 9c: invokestatic fe6.ssk (F)F
      // 9f: iload 4
      // a1: i2f
      // a2: fmul
      // a3: ldc 0.5
      // a5: nop
      // a6: fmul
      // a7: f2d
      // a8: invokevirtual i2h.w7w (DDD)V
      // ab: aload 0
      // ac: dup
      // ad: getfield s0i.icv D
      // b0: ldc2_w 0.6
      // b3: dmul
      // b4: putfield s0i.icv D
      // b7: aload 0
      // b8: dup
      // b9: getfield s0i.bw4 D
      // bc: ldc2_w 0.6
      // bf: dmul
      // c0: putfield s0i.bw4 D
      // c3: goto ca
      // c6: invokestatic s0i.b (Loov;)Loov;
      // c9: athrow
      // ca: aload 0
      // cb: invokestatic hc0.ieh (Lg_3;)I
      // ce: istore 6
      // d0: iload 6
      // d2: ifle e4
      // d5: aload 1
      // d6: iload 6
      // d8: bipush 4
      // d9: imul
      // da: invokevirtual i2h.k03 (I)V
      // dd: goto e4
      // e0: invokestatic s0i.b (Loov;)Loov;
      // e3: athrow
      // e4: aload 0
      // e5: aload 0
      // e6: aload 1
      // e7: invokevirtual s0i.wm5 (Lg_3;Li2h;)V
      // ea: iload 5
      // ec: ireturn
   }

   @Override
   public float ncy(mew var1) {
      return 0.5F - this.oay.rgh(var1);
   }

   public boolean vef() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: new mew
      // 07: dup
      // 08: aload 0
      // 09: getfield s0i.o2v D
      // 0c: aload 0
      // 0d: invokevirtual s0i.aaw ()Lnh4;
      // 10: getfield nh4.bx_ D
      // 13: aload 0
      // 14: getfield s0i.vbd D
      // 17: invokespecial mew.<init> (DDD)V
      // 1a: astore 2
      // 1b: aload 0
      // 1c: getfield s0i.oay Lt9d;
      // 1f: getstatic qe5.sf9 Lqe5;
      // 22: aload 2
      // 23: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 26: iload 1
      // 27: ifeq 4b
      // 2a: aload 0
      // 2b: getfield s0i.z2d Ljava/util/Random;
      // 2e: bipush 32
      // 30: invokevirtual java/util/Random.nextInt (I)I
      // 33: if_icmple 43
      // 36: goto 3d
      // 39: invokestatic s0i.b (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic s0i.b (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: getfield s0i.oay Lt9d;
      // 47: aload 2
      // 48: invokevirtual t9d.rts (Lmew;)I
      // 4b: istore 3
      // 4c: aload 0
      // 4d: getfield s0i.oay Lt9d;
      // 50: invokevirtual t9d.aq0 ()Z
      // 53: iload 1
      // 54: ifeq 86
      // 57: ifeq 85
      // 5a: goto 61
      // 5d: invokestatic s0i.b (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: getfield s0i.oay Lt9d;
      // 65: invokevirtual t9d.e76 ()I
      // 68: istore 4
      // 6a: aload 0
      // 6b: getfield s0i.oay Lt9d;
      // 6e: bipush 10
      // 70: invokevirtual t9d.kc3 (I)V
      // 73: aload 0
      // 74: getfield s0i.oay Lt9d;
      // 77: aload 2
      // 78: invokevirtual t9d.rts (Lmew;)I
      // 7b: istore 3
      // 7c: aload 0
      // 7d: getfield s0i.oay Lt9d;
      // 80: iload 4
      // 82: invokevirtual t9d.kc3 (I)V
      // 85: iload 3
      // 86: iload 1
      // 87: ifeq a5
      // 8a: aload 0
      // 8b: getfield s0i.z2d Ljava/util/Random;
      // 8e: bipush 8
      // 90: invokevirtual java/util/Random.nextInt (I)I
      // 93: if_icmpgt a8
      // 96: goto 9d
      // 99: invokestatic s0i.b (Loov;)Loov;
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto a5
      // a1: invokestatic s0i.b (Loov;)Loov;
      // a4: athrow
      // a5: goto a9
      // a8: bipush 0
      // a9: ireturn
   }

   @Override
   public boolean iaw() {
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
      // 05: iload 1
      // 06: ifne 24
      // 09: getfield s0i.oay Lt9d;
      // 0c: invokevirtual t9d.rbk ()Lv66;
      // 0f: getstatic v66.na2 Lv66;
      // 12: if_acmpeq 52
      // 15: goto 1c
      // 18: invokestatic s0i.b (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: goto 24
      // 20: invokestatic s0i.b (Loov;)Loov;
      // 23: athrow
      // 24: invokevirtual s0i.vef ()Z
      // 27: iload 1
      // 28: ifne 40
      // 2b: ifeq 52
      // 2e: goto 35
      // 31: invokestatic s0i.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: invokespecial laq.iaw ()Z
      // 39: goto 40
      // 3c: invokestatic s0i.b (Loov;)Loov;
      // 3f: athrow
      // 40: iload 1
      // 41: ifne 4f
      // 44: ifeq 52
      // 47: goto 4e
      // 4a: invokestatic s0i.b (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   @Override
   public void nyy() {
      super.nyy();
      this.s_a().ylc(m6d.y3f);
   }

   @Override
   public boolean cz_() {
      return true;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3993181701647322169L, 6527988225576481775L, MethodHandles.lookup().lookupClass()).a(19955284626445L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 125413894380326L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "9\u001c \u008a\u001eJo¬S£Ão6}\u008aÜ>\u0093\nz\\\u008cXiÂïpÕizç+\u008c\u001a\u008b\u0093ü¯¹VHÛ\u0089À\u0095<!uÊh\r¬\u001féU_(\u0017ÀdÍz+(N»)\u0017%î¬Á»Ê#\u0084;¬~\u0019ø\u009fI\u0082®Ã7põ½\u0016£x{ú^,0eÈýsãAÜ-\u00164¹în\u009d{tN¶\u001cÏÙZ\u0099âÜÙ\u001e](\u0091\nï\f·\u0090e8öUûMø\u0010O\u0091å\u0089\u0087(£6\u0001\\ii«ÂM</}í×õFËFW¢RIa\u008a\u000b\u009duÁ×ò\u0080ýH\u0003§\u009b$Ç\u0004e";
      int var8 = "9\u001c \u008a\u001eJo¬S£Ão6}\u008aÜ>\u0093\nz\\\u008cXiÂïpÕizç+\u008c\u001a\u008b\u0093ü¯¹VHÛ\u0089À\u0095<!uÊh\r¬\u001féU_(\u0017ÀdÍz+(N»)\u0017%î¬Á»Ê#\u0084;¬~\u0019ø\u009fI\u0082®Ã7põ½\u0016£x{ú^,0eÈýsãAÜ-\u00164¹în\u009d{tN¶\u001cÏÙZ\u0099âÜÙ\u001e](\u0091\nï\f·\u0090e8öUûMø\u0010O\u0091å\u0089\u0087(£6\u0001\\ii«ÂM</}í×õFËFW¢RIa\u008a\u000b\u009duÁ×ò\u0080ýH\u0003§\u009b$Ç\u0004e"
         .length();
      char var5 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = e(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     h = var9;
                     s = new String[6];
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

                  var6 = "t\u0083dÑ«É@êá>\u0017\u001a\u0002U»\u007fb/\u0014î\r¶\u0014þ²»7ðó\u007f\u0001\u009di\u0017k®nÄÜp8\u0090\u001aëeÌy^\u000fLæ\u0088ÿ\u0088\u0081\u0096\u001aÜââ.Eö\u00adW\u0010û·à°Bÿ\u0090tüÙ\u0098ñÀ\u0097Y-\u000bì\u001d\u009dx\u0001\u009d\u0003v\\h\u000b\u0099zç";
                  var8 = "t\u0083dÑ«É@êá>\u0017\u001a\u0002U»\u007fb/\u0014î\r¶\u0014þ²»7ðó\u007f\u0001\u009di\u0017k®nÄÜp8\u0090\u001aëeÌy^\u000fLæ\u0088ÿ\u0088\u0081\u0096\u001aÜââ.Eö\u00adW\u0010û·à°Bÿ\u0090tüÙ\u0098ñÀ\u0097Y-\u000bì\u001d\u009dx\u0001\u009d\u0003v\\h\u000b\u0099zç"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String e(byte[] var0) {
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

   private static String d(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30415;
      if (s[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])t.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               t.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("s0i", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         s[var5] = e(((Cipher)var4[0]).doFinal(var9));
      }

      return s[var5];
   }

   private static Object d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("s0i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
