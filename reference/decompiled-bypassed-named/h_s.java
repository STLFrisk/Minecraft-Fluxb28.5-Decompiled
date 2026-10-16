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

public class h_s extends mg1 implements uv0 {
   private int rxb = 1;
   private static final long c;
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public h_s(OpaquePredicate var1) {
      super(var1);
      this.yxc(4.0F, 4.0F);
      this.cuj = true;
      this.dlk = 5;
      this.i1n = new h_s$irg(this);
      this.r1d.tn8(5, new h_s$wcx(this));
      this.r1d.tn8(7, new h_s$dpn(this));
      this.r1d.tn8(7, new h_s$s03(this));
      this.g9o.tn8(1, new zy4(this));
   }

   public boolean osy() {
      int var1 = OpaquePredicate.c();

      try {
         byte var10000 = this.oit.miz(16);
         if (var1 != 0) {
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

   public void f8s(boolean var1) {
      int var2 = OpaquePredicate.b();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.oit;
               var10001 = 16;
               var10002 = var1;
               if (var2 == 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.c66(var10001, (byte)var10002);
   }

   public int nwa() {
      return this.rxb;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial mg1.xx_ ()V
      // 08: aload 0
      // 09: getfield h_s.oay Lt9d;
      // 0c: iload 1
      // 0d: ifne 33
      // 10: getfield OpaquePredicate.v0f Z
      // 13: ifne 47
      // 16: goto 1d
      // 19: invokestatic h_s.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: iload 1
      // 1f: ifne 44
      // 22: goto 29
      // 25: invokestatic h_s.a (Loov;)Loov;
      // 28: athrow
      // 29: getfield h_s.oay Lt9d;
      // 2c: goto 33
      // 2f: invokestatic h_s.a (Loov;)Loov;
      // 32: athrow
      // 33: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 36: getstatic v66.na2 Lv66;
      // 39: if_acmpne 47
      // 3c: aload 0
      // 3d: goto 44
      // 40: invokestatic h_s.a (Loov;)Loov;
      // 43: athrow
      // 44: invokevirtual h_s._kl ()V
      // 47: return
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
      // 00: getstatic h_s.c J
      // 03: ldc2_w 63680192173671
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokevirtual h_s.nss (Lofh;)Z
      // 12: iload 5
      // 14: ifeq 3c
      // 17: ifeq 27
      // 1a: goto 21
      // 1d: invokestatic h_s.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic h_s.a (Loov;)Loov;
      // 26: athrow
      // 27: sipush 30699
      // 2a: ldc2_w 3326016883003918285
      // 2d: lload 3
      // 2e: lxor
      // 2f: invokedynamic q (IJ)Ljava/lang/String; bsm=h_s.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: nop
      // 35: aload 1
      // 36: invokevirtual ofh.p_f ()Ljava/lang/String;
      // 39: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3c: iload 5
      // 3e: ifeq 8a
      // 41: ifeq 84
      // 44: goto 4b
      // 47: invokestatic h_s.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 1
      // 4c: invokevirtual ofh.nra ()Li2h;
      // 4f: instanceof ha9
      // 52: iload 5
      // 54: ifeq 8a
      // 57: goto 5e
      // 5a: invokestatic h_s.a (Loov;)Loov;
      // 5d: athrow
      // 5e: ifeq 84
      // 61: goto 68
      // 64: invokestatic h_s.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: aload 1
      // 6a: ldc 1000.0
      // 6c: nop
      // 6d: invokespecial mg1.m1t (Lofh;F)Z
      // 70: pop
      // 71: aload 1
      // 72: invokevirtual ofh.nra ()Li2h;
      // 75: checkcast ha9
      // 78: getstatic y8d.u58 Ll7l;
      // 7b: invokevirtual ha9.aex (L_ss;)V
      // 7e: bipush 1
      // 7f: ireturn
      // 80: invokestatic h_s.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: aload 1
      // 86: fload 2
      // 87: invokespecial mg1.m1t (Lofh;F)Z
      // 8a: ireturn
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, (byte)0);
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(10.0);
      this.dgt(m6d.wg4).zf7(100.0);
   }

   @Override
   public String _n1() {
      long var1 = c ^ 118745726683905L;
      return d<"q">(18067, 5169317737329552343L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 124652543444089L;
      return d<"q">(16694, 134660709576237835L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 85934408413751L;
      return d<"q">(22869, 550965351023103266L ^ var1);
   }

   @Override
   public u7m q4n() {
      return xbr.hgt;
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var4 = this.z2d.nextInt(2) + this.z2d.nextInt(1 + var2);
      int var10000 = OpaquePredicate.b();
      int var5 = 0;
      int var3 = var10000;

      while (true) {
         if (var5 < var4) {
            try {
               this.e70(xbr.spd, 1);
               var5++;
               if (var3 == 0) {
                  break;
               }

               if (var3 != 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         var4 = this.z2d.nextInt(3) + this.z2d.nextInt(1 + var2);
         break;
      }

      var5 = 0;

      while (var5 < var4) {
         this.e70(xbr.hgt, 1);
         var5++;
         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public float o23() {
      return 10.0F;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield h_s.z2d Ljava/util/Random;
      // 08: bipush 20
      // 0a: invokevirtual java/util/Random.nextInt (I)I
      // 0d: iload 1
      // 0e: ifne 31
      // 11: ifne 49
      // 14: goto 1b
      // 17: invokestatic h_s.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 1
      // 1d: ifne 35
      // 20: goto 27
      // 23: invokestatic h_s.a (Loov;)Loov;
      // 26: athrow
      // 27: invokespecial mg1.iaw ()Z
      // 2a: goto 31
      // 2d: invokestatic h_s.a (Loov;)Loov;
      // 30: athrow
      // 31: ifeq 49
      // 34: aload 0
      // 35: getfield h_s.oay Lt9d;
      // 38: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 3b: getstatic v66.na2 Lv66;
      // 3e: if_acmpeq 49
      // 41: bipush 1
      // 42: goto 4a
      // 45: invokestatic h_s.a (Loov;)Loov;
      // 48: athrow
      // 49: bipush 0
      // 4a: ireturn
   }

   @Override
   public int inu() {
      return 1;
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 117381232636279L;
      super.srs(var1);
      var1.iin(d<"q">(21821, 5996811712976273929L ^ var2), this.rxb);
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic h_s.c J
      // 03: ldc2_w 31266153160156
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: iload 4
      // 11: ifeq 3e
      // 14: invokespecial mg1.cjb (Lbdo;)V
      // 17: aload 1
      // 18: sipush 2516
      // 1b: ldc2_w 7179301210247098954
      // 1e: lload 2
      // 1f: lxor
      // 20: invokedynamic q (IJ)Ljava/lang/String; bsm=h_s.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: nop
      // 26: bipush 99
      // 28: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2b: ifeq 52
      // 2e: goto 35
      // 31: invokestatic h_s.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: goto 3e
      // 3a: invokestatic h_s.a (Loov;)Loov;
      // 3d: athrow
      // 3e: sipush 21821
      // 41: ldc2_w 5996686756349816482
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic q (IJ)Ljava/lang/String; bsm=h_s.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 4f: putfield h_s.rxb I
      // 52: return
   }

   @Override
   public float c5y() {
      return 2.6F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6679647952879838896L, -7681538162393973854L, MethodHandles.lookup().lookupClass()).a(33883207907748L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 111348967224541L;
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
      String var6 = "K\u0006Úþ\u009a\u00888þa>:\u009a,\u001d[à\u0098¹\u008eìÿ0Á³nèî_Ùk\u0080· ã8\u000bøÈ\\\u000bi{\u0088\u0018±ÚìÌJ:}Ñd>×®µj¥H>ä½o\u001e {kÉÑ\b\tãW;^êÆ¬Þ·\u00882OóW\u0019\u0014\u0018P>°\u0003< D\u0007Û 1L\u0096n\u008e\u00030mÈ\u0099\u000e\\\u0013Ð²\u0006çy\u001f¨¦tJ(,s²ý\"ß(H";
      int var8 = "K\u0006Úþ\u009a\u00888þa>:\u009a,\u001d[à\u0098¹\u008eìÿ0Á³nèî_Ùk\u0080· ã8\u000bøÈ\\\u000bi{\u0088\u0018±ÚìÌJ:}Ñd>×®µj¥H>ä½o\u001e {kÉÑ\b\tãW;^êÆ¬Þ·\u00882OóW\u0019\u0014\u0018P>°\u0003< D\u0007Û 1L\u0096n\u008e\u00030mÈ\u0099\u000e\\\u0013Ð²\u0006çy\u001f¨¦tJ(,s²ý\"ß(H"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     g = new String[6];
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

                  var6 = "Öòav¡ã!nÕ\u0083©ABÎÚÁ÷E¢º~²\u0017ioÄÀ°\tcµ6(\n\b\u0014ì\u0083~\u0092°\u001efq\u0086:\\Ã\u0098V\u0010\u0001\u001e!¼±\u0088!\u009d\u0090ncüýó\u000e¨©Ù\u001aª\u0006\u000f";
                  var8 = "Öòav¡ã!nÕ\u0083©ABÎÚÁ÷E¢º~²\u0017ioÄÀ°\tcµ6(\n\b\u0014ì\u0083~\u0092°\u001efq\u0086:\\Ã\u0098V\u0010\u0001\u001e!¼±\u0088!\u009d\u0090ncüýó\u000e¨©Ù\u001aª\u0006\u000f"
                     .length();
                  var5 = ' ';
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

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11098;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("h_s", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("h_s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
