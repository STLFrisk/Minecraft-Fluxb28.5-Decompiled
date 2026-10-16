import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tdq extends e0x {
   public static final _ku irx;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public tdq() {
      super(p3y.v19);
      this.y8l(this._8_.c32().zvi(irx, 0));
      this._p_(true);
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.opa(255);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return new nh4(
         (double)var2.getX(), (double)var2.getY(), (double)var2.getZ(), (double)(var2.getX() + 1), (double)(var2.getY() + 1), (double)(var2.getZ() + 1)
      );
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic tdq.irx L_ku;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 6
      // 16: aload 0
      // 17: aload 1
      // 18: aload 2
      // 19: invokespecial tdq.gxf (Lt9d;Lmew;)Z
      // 1c: iload 5
      // 1e: ifeq c1
      // 21: ifne b8
      // 24: goto 2b
      // 27: invokestatic tdq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 1
      // 2c: aload 2
      // 2d: invokevirtual mew.nuv ()Lmew;
      // 30: invokevirtual OpaquePredicate.eyz (Lmew;)Z
      // 33: iload 5
      // 35: ifeq c1
      // 38: goto 3f
      // 3b: invokestatic tdq.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifne b8
      // 42: goto 49
      // 45: invokestatic tdq.a (Loov;)Loov;
      // 48: athrow
      // 49: iload 6
      // 4b: iload 5
      // 4d: ifeq 91
      // 50: goto 57
      // 53: invokestatic tdq.a (Loov;)Loov;
      // 56: athrow
      // 57: ifle 84
      // 5a: goto 61
      // 5d: invokestatic tdq.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 1
      // 62: aload 2
      // 63: aload 3
      // 64: getstatic tdq.irx L_ku;
      // 67: iload 6
      // 69: bipush 1
      // 6a: isub
      // 6b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 73: bipush 2
      // 74: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 77: pop
      // 78: iload 5
      // 7a: ifne ee
      // 7d: goto 84
      // 80: invokestatic tdq.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: aload 1
      // 86: aload 2
      // 87: invokespecial tdq.x1h (Lt9d;Lmew;)Z
      // 8a: goto 91
      // 8d: invokestatic tdq.a (Loov;)Loov;
      // 90: athrow
      // 91: iload 5
      // 93: ifeq b2
      // 96: ifne ee
      // 99: goto a0
      // 9c: invokestatic tdq.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 1
      // a1: aload 2
      // a2: getstatic ox_.kqk Le0x;
      // a5: invokevirtual e0x.l4i ()Lzfz;
      // a8: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // ab: goto b2
      // ae: invokestatic tdq.a (Loov;)Loov;
      // b1: athrow
      // b2: pop
      // b3: iload 5
      // b5: ifne ee
      // b8: iload 6
      // ba: goto c1
      // bd: invokestatic tdq.a (Loov;)Loov;
      // c0: athrow
      // c1: iload 5
      // c3: ifeq ed
      // c6: bipush 7
      // c8: if_icmpge ee
      // cb: goto d2
      // ce: invokestatic tdq.a (Loov;)Loov;
      // d1: athrow
      // d2: aload 1
      // d3: aload 2
      // d4: aload 3
      // d5: getstatic tdq.irx L_ku;
      // d8: bipush 7
      // da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // dd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // e2: bipush 2
      // e3: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // e6: goto ed
      // e9: invokestatic tdq.a (Loov;)Loov;
      // ec: athrow
      // ed: pop
      // ee: return
   }

   @Override
   public void b2c(OpaquePredicate param1, mew param2, EntityLivingBase param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic tdq.b J
      // 03: ldc2_w 42935809367964
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 7
      // 0e: aload 3
      // 0f: instanceof Entity
      // 12: iload 7
      // 14: ifeq 2c
      // 17: ifeq bb
      // 1a: goto 21
      // 1d: invokestatic tdq.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: getfield OpaquePredicate.v0f Z
      // 25: goto 2c
      // 28: invokestatic tdq.a (Loov;)Loov;
      // 2b: athrow
      // 2c: iload 7
      // 2e: ifeq 50
      // 31: ifne b2
      // 34: goto 3b
      // 37: invokestatic tdq.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 3f: invokevirtual java/util/Random.nextFloat ()F
      // 42: fload 4
      // 44: ldc 0.5
      // 46: nop
      // 47: fsub
      // 48: fcmpg
      // 49: goto 50
      // 4c: invokestatic tdq.a (Loov;)Loov;
      // 4f: athrow
      // 50: iload 7
      // 52: ifeq 6a
      // 55: ifge b2
      // 58: goto 5f
      // 5b: invokestatic tdq.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 3
      // 60: instanceof ha9
      // 63: goto 6a
      // 66: invokestatic tdq.a (Loov;)Loov;
      // 69: athrow
      // 6a: iload 7
      // 6c: ifeq b1
      // 6f: ifne a6
      // 72: goto 79
      // 75: invokestatic tdq.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 1
      // 7a: invokevirtual OpaquePredicate.eir ()Lef9;
      // 7d: sipush 3884
      // 80: ldc2_w 7816248476897859039
      // 83: lload 5
      // 85: lxor
      // 86: invokedynamic t (IJ)Ljava/lang/String; bsm=tdq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: nop
      // 8c: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 8f: iload 7
      // 91: ifeq b1
      // 94: goto 9b
      // 97: invokestatic tdq.a (Loov;)Loov;
      // 9a: athrow
      // 9b: ifne a6
      // 9e: goto a5
      // a1: invokestatic tdq.a (Loov;)Loov;
      // a4: athrow
      // a5: return
      // a6: aload 1
      // a7: aload 2
      // a8: getstatic ox_.kqk Le0x;
      // ab: invokevirtual e0x.l4i ()Lzfz;
      // ae: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // b1: pop
      // b2: aload 0
      // b3: aload 1
      // b4: aload 2
      // b5: aload 3
      // b6: fload 4
      // b8: invokespecial e0x.b2c (Lt9d;Lmew;Li2h;F)V
      // bb: return
   }

   private boolean x1h(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual mew.nuv ()Lmew;
      // 09: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: astore 4
      // 13: aload 4
      // 15: instanceof ql4
      // 18: iload 3
      // 19: ifne 41
      // 1c: ifne 40
      // 1f: goto 26
      // 22: invokestatic tdq.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 4
      // 28: instanceof gkj
      // 2b: iload 3
      // 2c: ifne 41
      // 2f: goto 36
      // 32: invokestatic tdq.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 44
      // 39: goto 40
      // 3c: invokestatic tdq.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 45
      // 44: bipush 0
      // 45: ireturn
   }

   private boolean gxf(OpaquePredicate var1, mew var2) {
      int var3 = OpaquePredicate.b();

      for (mew$mix var5 : mew.getAllInBoxMutable(var2.ec4(-4, 0, -4), var2.ec4(4, 1, 4))) {
         try {
            if (var1.getBlockState(var5).r_y().p1r() == p3y.six) {
               return true;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         if (var3 == 0) {
            break;
         }
      }

      return false;
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: aload 4
      // 0b: invokespecial e0x.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 0e: aload 1
      // 0f: aload 2
      // 10: invokevirtual mew.nuv ()Lmew;
      // 13: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 16: invokeinterface zfz.r_y ()Le0x; 1
      // 1b: invokevirtual e0x.p1r ()Lp3y;
      // 1e: invokevirtual p3y.gk6 ()Z
      // 21: iload 5
      // 23: ifeq 42
      // 26: ifeq 43
      // 29: goto 30
      // 2c: invokestatic tdq.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: aload 2
      // 32: getstatic ox_.kqk Le0x;
      // 35: invokevirtual e0x.l4i ()Lzfz;
      // 38: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 3b: goto 42
      // 3e: invokestatic tdq.a (Loov;)Loov;
      // 41: athrow
      // 42: pop
      // 43: return
   }

   @Override
   public boolean ron(m5n param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: getstatic tdq$1.aho [I
      // 08: aload 3
      // 09: invokevirtual vt2.ordinal ()I
      // 0c: iaload
      // 0d: iload 4
      // 0f: ifne 80
      // 12: tableswitch 103 1 5 38 44 44 44 44
      // 34: invokestatic tdq.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: ireturn
      // 3a: invokestatic tdq.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 1
      // 3f: aload 2
      // 40: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 45: invokeinterface zfz.r_y ()Le0x; 1
      // 4a: astore 5
      // 4c: aload 5
      // 4e: iload 4
      // 50: ifne 69
      // 53: invokevirtual e0x.ko5 ()Z
      // 56: ifne 77
      // 59: goto 60
      // 5c: invokestatic tdq.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 5
      // 62: goto 69
      // 65: invokestatic tdq.a (Loov;)Loov;
      // 68: athrow
      // 69: getstatic ox_._5i Le0x;
      // 6c: if_acmpeq 77
      // 6f: bipush 1
      // 70: goto 78
      // 73: invokestatic tdq.a (Loov;)Loov;
      // 76: athrow
      // 77: bipush 0
      // 78: ireturn
      // 79: aload 0
      // 7a: aload 1
      // 7b: aload 2
      // 7c: aload 3
      // 7d: invokespecial e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 80: ireturn
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return ox_.kqk.j39(ox_.kqk.l4i().zvi(bx0.nln, bx0$b_z.rg3), var2, var3);
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return u7m.gfm(ox_.kqk);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(irx, var1 & 7);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(irx);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{irx});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3107748682492432417L, 172723519639116281L, MethodHandles.lookup().lookupClass()).a(124304858891211L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 15206704175248L;
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
      String var4 = "bð>Rs\u0002n\u008b\u008cÃ9\u0098c\u000f%6\u0000WØè#\u009aØ\u007fÅÇ\u001cò\u0019\u0013ÞM !ÔÆÙ\u0082×äEËÙûqrð\u000bùv¯\u0007\u001fÿ¡©\u0083ó \u008e\u0081Áâ¯\u0014";
      int var6 = "bð>Rs\u0002n\u008b\u008cÃ9\u0098c\u000f%6\u0000WØè#\u009aØ\u007fÅÇ\u001cò\u0019\u0013ÞM !ÔÆÙ\u0082×äEËÙûqrð\u000bùv¯\u0007\u001fÿ¡©\u0083ó \u008e\u0081Áâ¯\u0014"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[2];
            irx = _ku.wgl(b<"t">(22756, 2962364561746593050L ^ var9), 0, 7);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31048;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("tdq", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("tdq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
