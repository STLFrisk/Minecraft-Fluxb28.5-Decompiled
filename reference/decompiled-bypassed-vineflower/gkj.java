import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gkj extends rrw implements jrp {
   public static final _ku tkz;
   public static final qx_ tzc;
   private final e0x che;

   public gkj(e0x var1) {
      this.y8l(this._8_.c32().zvi(tkz, 0).zvi(tzc, vt2.rf3));
      this.che = var1;
      this._p_(true);
      float var2 = 0.125F;
      this.xl4(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
      this.i3l((uja)null);
   }

   @Override
   public zfz w1b(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getstatic gkj.tzc Lqx_;
      // 04: getstatic vt2.rf3 Lvt2;
      // 07: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0c: astore 1
      // 0d: invokestatic t9d.b ()I
      // 10: getstatic vt2$unz.fzl Lvt2$unz;
      // 13: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 16: astore 5
      // 18: istore 4
      // 1a: aload 5
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq 84
      // 24: aload 5
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast vt2
      // 2e: astore 6
      // 30: aload 2
      // 31: aload 3
      // 32: aload 6
      // 34: invokevirtual mew.offset (Lvt2;)Lmew;
      // 37: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 3c: iload 4
      // 3e: ifeq 85
      // 41: iload 4
      // 43: ifeq 72
      // 46: goto 4d
      // 49: invokestatic gkj.a (Loov;)Loov;
      // 4c: athrow
      // 4d: invokeinterface zfz.r_y ()Le0x; 1
      // 52: aload 0
      // 53: getfield gkj.che Le0x;
      // 56: if_acmpne 78
      // 59: goto 60
      // 5c: invokestatic gkj.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 1
      // 61: getstatic gkj.tzc Lqx_;
      // 64: aload 6
      // 66: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6b: goto 72
      // 6e: invokestatic gkj.a (Loov;)Loov;
      // 71: athrow
      // 72: astore 1
      // 73: iload 4
      // 75: ifne 84
      // 78: iload 4
      // 7a: ifne 1a
      // 7d: goto 84
      // 80: invokestatic gkj.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 1
      // 85: areturn
   }

   @Override
   public boolean ib4(e0x var1) {
      try {
         if (var1 == ox_._5i) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void zvy(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: aload 0
      // 006: aload 1
      // 007: aload 2
      // 008: iload 5
      // 00a: ifne 031
      // 00d: aload 3
      // 00e: aload 4
      // 010: invokespecial rrw.zvy (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 013: aload 1
      // 014: aload 2
      // 015: invokevirtual mew.nuv ()Lmew;
      // 018: invokevirtual t9d.rts (Lmew;)I
      // 01b: bipush 9
      // 01d: if_icmplt 173
      // 020: goto 027
      // 023: invokestatic gkj.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 0
      // 028: aload 1
      // 029: aload 2
      // 02a: goto 031
      // 02d: invokestatic gkj.a (Loov;)Loov;
      // 030: athrow
      // 031: invokestatic ql4.l_7 (Le0x;Lt9d;Lmew;)F
      // 034: fstore 6
      // 036: aload 4
      // 038: ldc 25.0
      // 03a: nop
      // 03b: fload 6
      // 03d: fdiv
      // 03e: f2i
      // 03f: bipush 1
      // 040: iadd
      // 041: invokevirtual java/util/Random.nextInt (I)I
      // 044: iload 5
      // 046: ifne 069
      // 049: ifne 173
      // 04c: goto 053
      // 04f: invokestatic gkj.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 3
      // 054: getstatic gkj.tkz L_ku;
      // 057: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 05c: checkcast java/lang/Integer
      // 05f: invokevirtual java/lang/Integer.intValue ()I
      // 062: goto 069
      // 065: invokestatic gkj.a (Loov;)Loov;
      // 068: athrow
      // 069: istore 7
      // 06b: iload 7
      // 06d: iload 5
      // 06f: ifne 096
      // 072: bipush 7
      // 074: if_icmpge 09c
      // 077: goto 07e
      // 07a: invokestatic gkj.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 3
      // 07f: getstatic gkj.tkz L_ku;
      // 082: iload 7
      // 084: bipush 1
      // 085: iadd
      // 086: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 089: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 08e: astore 3
      // 08f: aload 1
      // 090: aload 2
      // 091: aload 3
      // 092: bipush 2
      // 093: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 096: pop
      // 097: iload 5
      // 099: ifeq 173
      // 09c: getstatic vt2$unz.fzl Lvt2$unz;
      // 09f: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 0a2: astore 8
      // 0a4: aload 8
      // 0a6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ab: ifeq 0e6
      // 0ae: aload 8
      // 0b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b5: checkcast vt2
      // 0b8: astore 9
      // 0ba: aload 1
      // 0bb: aload 2
      // 0bc: aload 9
      // 0be: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0c1: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c4: invokeinterface zfz.r_y ()Le0x; 1
      // 0c9: iload 5
      // 0cb: ifne 100
      // 0ce: aload 0
      // 0cf: getfield gkj.che Le0x;
      // 0d2: if_acmpne 0e1
      // 0d5: goto 0dc
      // 0d8: invokestatic gkj.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: return
      // 0dd: invokestatic gkj.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: iload 5
      // 0e3: ifeq 0a4
      // 0e6: aload 2
      // 0e7: getstatic vt2$unz.fzl Lvt2$unz;
      // 0ea: aload 4
      // 0ec: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 0ef: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0f2: astore 2
      // 0f3: aload 1
      // 0f4: aload 2
      // 0f5: invokevirtual mew.eve ()Lmew;
      // 0f8: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0fb: invokeinterface zfz.r_y ()Le0x; 1
      // 100: astore 8
      // 102: aload 1
      // 103: aload 2
      // 104: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 107: invokeinterface zfz.r_y ()Le0x; 1
      // 10c: iload 5
      // 10e: ifne 12a
      // 111: getfield e0x.kgd Lp3y;
      // 114: getstatic p3y.cei Lp3y;
      // 117: if_acmpne 173
      // 11a: goto 121
      // 11d: invokestatic gkj.a (Loov;)Loov;
      // 120: athrow
      // 121: aload 8
      // 123: goto 12a
      // 126: invokestatic gkj.a (Loov;)Loov;
      // 129: athrow
      // 12a: getstatic ox_._5i Le0x;
      // 12d: iload 5
      // 12f: ifne 154
      // 132: if_acmpeq 15f
      // 135: goto 13c
      // 138: invokestatic gkj.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 8
      // 13e: iload 5
      // 140: ifne 159
      // 143: goto 14a
      // 146: invokestatic gkj.a (Loov;)Loov;
      // 149: athrow
      // 14a: getstatic ox_.kqk Le0x;
      // 14d: goto 154
      // 150: invokestatic gkj.a (Loov;)Loov;
      // 153: athrow
      // 154: if_acmpeq 15f
      // 157: aload 8
      // 159: getstatic ox_.l11 Lx82;
      // 15c: if_acmpne 173
      // 15f: aload 1
      // 160: aload 2
      // 161: aload 0
      // 162: getfield gkj.che Le0x;
      // 165: invokevirtual e0x.l4i ()Lzfz;
      // 168: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 16b: pop
      // 16c: goto 173
      // 16f: invokestatic gkj.a (Loov;)Loov;
      // 172: athrow
      // 173: return
   }

   public void bz3(t9d var1, mew var2, zfz var3) {
      int var4 = (Integer)var3.dil(tkz) + fe6.pzp(var1.fsy, 2, 5);
      var1.vct(var2, var3.zvi(tkz, Math.min(7, var4)), 2);
   }

   @Override
   public int ieb(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 24
      // 09: invokeinterface zfz.r_y ()Le0x; 1
      // 0e: aload 0
      // 0f: if_acmpeq 23
      // 12: goto 19
      // 15: invokestatic gkj.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokespecial rrw.ieb (Lzfz;)I
      // 1e: ireturn
      // 1f: invokestatic gkj.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: getstatic gkj.tkz L_ku;
      // 27: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2c: checkcast java/lang/Integer
      // 2f: invokevirtual java/lang/Integer.intValue ()I
      // 32: istore 3
      // 33: iload 3
      // 34: bipush 32
      // 36: imul
      // 37: istore 4
      // 39: sipush 255
      // 3c: iload 3
      // 3d: bipush 8
      // 3f: imul
      // 40: isub
      // 41: istore 5
      // 43: iload 3
      // 44: bipush 4
      // 45: imul
      // 46: istore 6
      // 48: iload 4
      // 4a: bipush 16
      // 4c: ishl
      // 4d: iload 5
      // 4f: bipush 8
      // 51: ishl
      // 52: ior
      // 53: iload 6
      // 55: ior
      // 56: ireturn
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      return this.ieb(var1.getBlockState(var2));
   }

   @Override
   public void bf6() {
      float var1 = 0.125F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.lpg = (double)((float)((Integer)var1.getBlockState(var2).dil(tkz) * 2 + 2) / 16.0F);
      float var3 = 0.125F;
      this.xl4(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, (float)this.lpg, 0.5F + var3);
   }

   @Override
   public void ix7(t9d param1, mew param2, zfz param3, float param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: iload 6
      // 08: ifne 2b
      // 0b: aload 1
      // 0c: aload 2
      // 0d: aload 3
      // 0e: fload 4
      // 10: iload 5
      // 12: invokespecial rrw.ix7 (Lt9d;Lmew;Lzfz;FI)V
      // 15: aload 1
      // 16: getfield t9d.v0f Z
      // 19: ifne 86
      // 1c: goto 23
      // 1f: invokestatic gkj.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: goto 2b
      // 27: invokestatic gkj.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokevirtual gkj.wc3 ()Lu7m;
      // 2e: astore 7
      // 30: aload 7
      // 32: ifnull 86
      // 35: aload 3
      // 36: getstatic gkj.tkz L_ku;
      // 39: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 3e: checkcast java/lang/Integer
      // 41: invokevirtual java/lang/Integer.intValue ()I
      // 44: istore 8
      // 46: bipush 0
      // 47: istore 9
      // 49: iload 9
      // 4b: bipush 3
      // 4c: if_icmpge 86
      // 4f: aload 1
      // 50: iload 6
      // 52: ifne 71
      // 55: getfield t9d.fsy Ljava/util/Random;
      // 58: bipush 15
      // 5a: invokevirtual java/util/Random.nextInt (I)I
      // 5d: iload 8
      // 5f: if_icmpgt 7e
      // 62: goto 69
      // 65: invokestatic gkj.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 1
      // 6a: goto 71
      // 6d: invokestatic gkj.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 2
      // 72: new erg
      // 75: dup
      // 76: aload 7
      // 78: invokespecial erg.<init> (Lu7m;)V
      // 7b: invokestatic gkj.ymu (Lt9d;Lmew;Lerg;)V
      // 7e: iinc 9 1
      // 81: iload 6
      // 83: ifeq 49
      // 86: return
   }

   public u7m wc3() {
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
      // 05: getfield gkj.che Le0x;
      // 08: getstatic ox_.jzx Le0x;
      // 0b: iload 1
      // 0c: ifne 2a
      // 0f: if_acmpne 23
      // 12: goto 19
      // 15: invokestatic gkj.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic xbr.d0o Lu7m;
      // 1c: goto 38
      // 1f: invokestatic gkj.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield gkj.che Le0x;
      // 27: getstatic ox_.gdb Le0x;
      // 2a: if_acmpne 37
      // 2d: getstatic xbr.k_k Lu7m;
      // 30: goto 38
      // 33: invokestatic gkj.a (Loov;)Loov;
      // 36: athrow
      // 37: aconst_null
      // 38: areturn
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      int var3 = t9d.b();
      u7m var4 = this.wc3();

      try {
         if (var3 == 0) {
            return var4;
         }

         if (var4 != null) {
            return var4;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return null;
   }

   @Override
   public boolean z3t(t9d param1, mew param2, zfz param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic gkj.tkz L_ku;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: iload 5
      // 16: ifeq 2d
      // 19: bipush 7
      // 1b: if_icmpeq 30
      // 1e: goto 25
      // 21: invokestatic gkj.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2d
      // 29: invokestatic gkj.a (Loov;)Loov;
      // 2c: athrow
      // 2d: goto 31
      // 30: bipush 0
      // 31: ireturn
   }

   @Override
   public boolean y4n(t9d var1, Random var2, mew var3, zfz var4) {
      return true;
   }

   @Override
   public void tu1(t9d var1, Random var2, mew var3, zfz var4) {
      this.bz3(var1, var3, var4);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(tkz, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(tkz);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{tkz, tzc});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-832776013852557641L, 436975255494121545L, MethodHandles.lookup().lookupClass()).a(16940800901987L);
      // $VF: monitorexit
      long var10 = var10000 ^ 52837652181629L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "0é×\u0003¿Ì\u00adX\b46±-Rù~M";
      int var7 = "0é×\u0003¿Ì\u00adX\b46±-Rù~M".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            tkz = _ku.wgl(var8[1], 0, 7);
            tzc = qx_.q0o(var8[0], new gkj$1());
            return;
         }

         var4 = var5.charAt(var3);
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
