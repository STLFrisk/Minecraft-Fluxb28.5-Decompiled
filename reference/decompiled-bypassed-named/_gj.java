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

public class _gj extends j37 {
   private static final long c;
   private static final String[] h;
   private static final String[] y;
   private static final Map z = new HashMap(13);

   public _gj(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.9F, 0.9F);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(1, new p1g(this, 1.25));
      this.r1d.tn8(2, this.bbz = new bdv(this, 0.3F));
      this.r1d.tn8(3, new rg_(this, 1.0));
      this.r1d.tn8(4, new ttn(this, 1.2, xbr.nz4, false));
      this.r1d.tn8(4, new ttn(this, 1.2, xbr.aar, false));
      this.r1d.tn8(5, new bun(this, 1.1));
      this.r1d.tn8(6, new _tb(this, 1.0));
      this.r1d.tn8(7, new bdq(this, ha9.class, 6.0F));
      this.r1d.tn8(8, new ov6(this));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(10.0);
      this.dgt(m6d.w7i).zf7(0.25);
   }

   @Override
   public boolean t1g() {
      int var1 = OpaquePredicate.b();
      erg var2 = ((ha9)this.wgv).tsc();

      erg var10000;
      label27: {
         try {
            var10000 = var2;
            if (var1 == 0) {
               break label27;
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
         if (var10000.gn1() == xbr.nz4) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, (byte)0);
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 80955200993261L;
      super.srs(var1);
      var1.zyu(f<"j">(13630, 8651740960345592102L ^ var2), this.vlb());
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 69331989830470L;
      super.cjb(var1);
      this.hfu(var1.dvl(f<"j">(19397, 4367418484986970995L ^ var2)));
   }

   @Override
   public String _n1() {
      long var1 = c ^ 79845850107291L;
      return f<"j">(11183, 9155970665869981127L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 90433854194403L;
      return f<"j">(5939, 7525537195283482148L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 120160345191597L;
      return f<"j">(1624, 374291089930690820L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = c ^ 27709553815009L;
      this.lhu(f<"j">(21495, 355523072840543716L ^ var3), 0.15F, 1.0F);
   }

   @Override
   public boolean hp6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial j37.hp6 (Lha9;)Z
      // 09: iload 2
      // 0a: ifne 21
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic _gj.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: ireturn
      // 19: invokestatic _gj.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual _gj.vlb ()Z
      // 21: iload 2
      // 22: ifne 7b
      // 25: ifeq 73
      // 28: goto 2f
      // 2b: invokestatic _gj.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield _gj.oay Lt9d;
      // 33: getfield OpaquePredicate.v0f Z
      // 36: iload 2
      // 37: ifne 7b
      // 3a: goto 41
      // 3d: invokestatic _gj.a (Loov;)Loov;
      // 40: athrow
      // 41: ifne 73
      // 44: goto 4b
      // 47: invokestatic _gj.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield _gj.wgv Li2h;
      // 4f: iload 2
      // 50: ifne 6f
      // 53: goto 5a
      // 56: invokestatic _gj.a (Loov;)Loov;
      // 59: athrow
      // 5a: ifnull 7c
      // 5d: goto 64
      // 60: invokestatic _gj.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: getfield _gj.wgv Li2h;
      // 68: goto 6f
      // 6b: invokestatic _gj.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 1
      // 70: if_acmpeq 7c
      // 73: bipush 0
      // 74: goto 7b
      // 77: invokestatic _gj.a (Loov;)Loov;
      // 7a: athrow
      // 7b: ireturn
      // 7c: aload 1
      // 7d: aload 0
      // 7e: invokevirtual ha9.nw9 (Li2h;)V
      // 81: bipush 1
      // 82: ireturn
   }

   @Override
   public u7m q4n() {
      try {
         if (this.agj()) {
            return xbr.li3;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return xbr.tf4;
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
      // 00: aload 0
      // 01: getfield _gj.z2d Ljava/util/Random;
      // 04: bipush 3
      // 05: invokevirtual java/util/Random.nextInt (I)I
      // 08: bipush 1
      // 09: iadd
      // 0a: aload 0
      // 0b: getfield _gj.z2d Ljava/util/Random;
      // 0e: bipush 1
      // 0f: iload 2
      // 10: iadd
      // 11: invokevirtual java/util/Random.nextInt (I)I
      // 14: iadd
      // 15: istore 4
      // 17: invokestatic OpaquePredicate.c ()I
      // 1a: bipush 0
      // 1b: istore 5
      // 1d: istore 3
      // 1e: iload 5
      // 20: iload 4
      // 22: if_icmpge 6d
      // 25: aload 0
      // 26: iload 3
      // 27: ifne 5e
      // 2a: invokevirtual _gj.agj ()Z
      // 2d: iload 3
      // 2e: ifne 7c
      // 31: goto 38
      // 34: invokestatic _gj.a (Loov;)Loov;
      // 37: athrow
      // 38: ifeq 56
      // 3b: goto 42
      // 3e: invokestatic _gj.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getstatic xbr.li3 Lu7m;
      // 46: bipush 1
      // 47: invokevirtual _gj.e70 (Lu7m;I)Lnvf;
      // 4a: pop
      // 4b: iload 3
      // 4c: ifeq 66
      // 4f: goto 56
      // 52: invokestatic _gj.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: goto 5e
      // 5a: invokestatic _gj.a (Loov;)Loov;
      // 5d: athrow
      // 5e: getstatic xbr.tf4 Lu7m;
      // 61: bipush 1
      // 62: invokevirtual _gj.e70 (Lu7m;I)Lnvf;
      // 65: pop
      // 66: iinc 5 1
      // 69: iload 3
      // 6a: ifeq 1e
      // 6d: aload 0
      // 6e: iload 3
      // 6f: ifne 80
      // 72: invokevirtual _gj.vlb ()Z
      // 75: goto 7c
      // 78: invokestatic _gj.a (Loov;)Loov;
      // 7b: athrow
      // 7c: ifeq 88
      // 7f: aload 0
      // 80: getstatic xbr.fpq Lu7m;
      // 83: bipush 1
      // 84: invokevirtual _gj.e70 (Lu7m;I)Lnvf;
      // 87: pop
      // 88: return
   }

   public boolean vlb() {
      int var1 = OpaquePredicate.b();

      try {
         int var10000 = this.oit.miz(16) & 1;
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void hfu(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: ifeq 20
      // 08: aload 0
      // 09: getfield _gj.oit Lwl1;
      // 0c: bipush 16
      // 0e: bipush 1
      // 0f: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 12: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 15: iload 2
      // 16: ifne 34
      // 19: goto 20
      // 1c: invokestatic _gj.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield _gj.oit Lwl1;
      // 24: bipush 16
      // 26: bipush 0
      // 27: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2a: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2d: goto 34
      // 30: invokestatic _gj.a (Loov;)Loov;
      // 33: athrow
      // 34: return
   }

   @Override
   public void nzg(_6b param1) {
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
      // 05: getfield _gj.oay Lt9d;
      // 08: getfield OpaquePredicate.v0f Z
      // 0b: iload 2
      // 0c: ifeq 24
      // 0f: ifne 98
      // 12: goto 19
      // 15: invokestatic _gj.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield _gj.ma9 Z
      // 1d: goto 24
      // 20: invokestatic _gj.a (Loov;)Loov;
      // 23: athrow
      // 24: ifne 98
      // 27: new v9i
      // 2a: dup
      // 2b: aload 0
      // 2c: getfield _gj.oay Lt9d;
      // 2f: invokespecial v9i.<init> (Lt9d;)V
      // 32: astore 3
      // 33: aload 3
      // 34: bipush 0
      // 35: new erg
      // 38: dup
      // 39: getstatic xbr.g8a Lu7m;
      // 3c: invokespecial erg.<init> (Lu7m;)V
      // 3f: invokevirtual v9i.fga (ILerg;)V
      // 42: aload 3
      // 43: aload 0
      // 44: getfield _gj.o2v D
      // 47: aload 0
      // 48: getfield _gj.kfp D
      // 4b: aload 0
      // 4c: getfield _gj.vbd D
      // 4f: aload 0
      // 50: getfield _gj.x5k F
      // 53: aload 0
      // 54: getfield _gj.y2i F
      // 57: invokevirtual v9i.x24 (DDDFF)V
      // 5a: aload 3
      // 5b: aload 0
      // 5c: invokevirtual _gj.r1t ()Z
      // 5f: invokevirtual v9i.x53 (Z)V
      // 62: aload 0
      // 63: invokevirtual _gj.qrh ()Z
      // 66: iload 2
      // 67: ifeq 93
      // 6a: ifeq 8b
      // 6d: goto 74
      // 70: invokestatic _gj.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 3
      // 75: aload 0
      // 76: invokevirtual _gj.hei ()Ljava/lang/String;
      // 79: invokevirtual v9i.x84 (Ljava/lang/String;)V
      // 7c: aload 3
      // 7d: aload 0
      // 7e: invokevirtual _gj.bpc ()Z
      // 81: invokevirtual v9i.krn (Z)V
      // 84: goto 8b
      // 87: invokestatic _gj.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield _gj.oay Lt9d;
      // 8f: aload 3
      // 90: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 93: pop
      // 94: aload 0
      // 95: invokevirtual _gj._kl ()V
      // 98: return
   }

   @Override
   public void ibc(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: fload 1
      // 06: fload 2
      // 07: invokespecial j37.ibc (FF)V
      // 0a: fload 1
      // 0b: ldc 5.0
      // 0d: nop
      // 0e: fcmpl
      // 0f: iload 3
      // 10: ifne 36
      // 13: ifle 4d
      // 16: goto 1d
      // 19: invokestatic _gj.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield _gj.wgv Li2h;
      // 21: iload 3
      // 22: ifne 44
      // 25: goto 2c
      // 28: invokestatic _gj.a (Loov;)Loov;
      // 2b: athrow
      // 2c: instanceof ha9
      // 2f: goto 36
      // 32: invokestatic _gj.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 4d
      // 39: aload 0
      // 3a: getfield _gj.wgv Li2h;
      // 3d: goto 44
      // 40: invokestatic _gj.a (Loov;)Loov;
      // 43: athrow
      // 44: checkcast ha9
      // 47: getstatic y8d.jno Ll7l;
      // 4a: invokevirtual ha9.aex (L_ss;)V
      // 4d: return
   }

   public _gj kv0(dms var1) {
      return new _gj(this.oay);
   }

   @Override
   public boolean _cv(erg var1) {
      int var2 = OpaquePredicate.b();

      erg var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000.gn1() == xbr.aar) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public bdv hl4() {
      return this.bbz;
   }

   @Override
   public dms kv0(dms var1) {
      return this.kv0(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7677972379842162792L, -369113134298103612L, MethodHandles.lookup().lookupClass()).a(131487555550397L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 29739943416635L;
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
      String var6 = "ce\u0082WXDý\u008c\u009a$\u0087¹JM-Û tn¾5_bÐ\u0011\u0018p'Xðßø,t(Y\u0097/r¼=l\u0016l½ëq?õ f°\u0013\u008a¿\u0092Üô\u001a\u001c?pø\u0015`ó\t\u000e¹\u0092\u001bÉ\u008c\bðB \u0007\u0085°h\u0093\u0018Âw®ðõå\u00ad\u0010iÑ[:¯µ\u001aq{\u0086&CGÞÙù";
      int var8 = "ce\u0082WXDý\u008c\u009a$\u0087¹JM-Û tn¾5_bÐ\u0011\u0018p'Xðßø,t(Y\u0097/r¼=l\u0016l½ëq?õ f°\u0013\u008a¿\u0092Üô\u001a\u001c?pø\u0015`ó\t\u000e¹\u0092\u001bÉ\u008c\bðB \u0007\u0085°h\u0093\u0018Âw®ðõå\u00ad\u0010iÑ[:¯µ\u001aq{\u0086&CGÞÙù"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = g(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     h = var9;
                     y = new String[6];
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

                  var6 = "øQ\u001e··\u0007[Ä\u0092*Xª\u009cÀ½9Á¥0°0Ã0 \u0010\u0010mp\u0096*\u0010×ÈëXYÄã\u009cG\u0094";
                  var8 = "øQ\u001e··\u0007[Ä\u0092*Xª\u009cÀ½9Á¥0°0Ã0 \u0010\u0010mp\u0096*\u0010×ÈëXYÄã\u009cG\u0094".length();
                  var5 = 24;
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

   private static String g(byte[] var0) {
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

   private static String f(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6257;
      if (y[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])z.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               z.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("_gj", var10);
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
         y[var5] = g(((Cipher)var4[0]).doFinal(var9));
      }

      return y[var5];
   }

   private static Object f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("_gj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
