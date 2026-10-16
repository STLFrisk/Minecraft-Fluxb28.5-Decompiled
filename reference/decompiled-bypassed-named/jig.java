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

public class jig extends p7s implements vtv {
   private boolean ecl = true;
   private int fqs = -1;
   private mew k87 = mew._9b;
   private static final long c;
   private static final String[] o;
   private static final String[] p;
   private static final Map q = new HashMap(13);

   public jig(OpaquePredicate var1) {
      super(var1);
   }

   public jig(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public _f3$c3d x38() {
      return _f3$c3d.o4g;
   }

   @Override
   public zfz hcw() {
      return ox_.cwg.l4i();
   }

   @Override
   public int a45() {
      return 1;
   }

   @Override
   public int opt() {
      return 5;
   }

   @Override
   public boolean k25(ha9 param1) {
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
      // 05: getfield jig.oay Lt9d;
      // 08: getfield OpaquePredicate.v0f Z
      // 0b: iload 2
      // 0c: ifeq 26
      // 0f: ifne 25
      // 12: goto 19
      // 15: invokestatic jig.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: aload 0
      // 1b: invokevirtual ha9.a_o (Lrsi;)V
      // 1e: goto 25
      // 21: invokestatic jig.b (Loov;)Loov;
      // 24: athrow
      // 25: bipush 1
      // 26: ireturn
   }

   @Override
   public void xr9(int var1, int var2, int var3, boolean var4) {
      int var5 = OpaquePredicate.c();

      boolean var10000;
      label32: {
         label31: {
            try {
               var10000 = var4;
               if (var5 != 0) {
                  break label32;
               }

               if (!var4) {
                  break label31;
               }
            } catch (oov var8) {
               throw b(var8);
            }

            var10000 = false;
            break label32;
         }

         var10000 = true;
      }

      boolean var6 = var10000;

      try {
         if (var6 != this.u81()) {
            this.oh4(var6);
         }
      } catch (oov var7) {
         throw b(var7);
      }
   }

   public boolean u81() {
      return this.ecl;
   }

   public void oh4(boolean var1) {
      this.ecl = var1;
   }

   @Override
   public OpaquePredicate yi7() {
      return this.oay;
   }

   @Override
   public double dk4() {
      return this.o2v;
   }

   @Override
   public double j35() {
      return this.kfp + 0.5;
   }

   @Override
   public double bd2() {
      return this.vbd;
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial p7s.xx_ ()V
      // 08: aload 0
      // 09: getfield jig.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: iload 1
      // 10: ifeq 28
      // 13: ifne c4
      // 16: goto 1d
      // 19: invokestatic jig.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual jig.gzr ()Z
      // 21: goto 28
      // 24: invokestatic jig.b (Loov;)Loov;
      // 27: athrow
      // 28: iload 1
      // 29: ifeq 41
      // 2c: ifeq c4
      // 2f: goto 36
      // 32: invokestatic jig.b (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: invokevirtual jig.u81 ()Z
      // 3a: goto 41
      // 3d: invokestatic jig.b (Loov;)Loov;
      // 40: athrow
      // 41: ifeq c4
      // 44: new mew
      // 47: dup
      // 48: aload 0
      // 49: invokespecial mew.<init> (Li2h;)V
      // 4c: astore 2
      // 4d: iload 1
      // 4e: ifeq 74
      // 51: aload 2
      // 52: aload 0
      // 53: getfield jig.k87 Lmew;
      // 56: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 59: ifeq 78
      // 5c: goto 63
      // 5f: invokestatic jig.b (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: dup
      // 65: getfield jig.fqs I
      // 68: bipush 1
      // 69: isub
      // 6a: putfield jig.fqs I
      // 6d: goto 74
      // 70: invokestatic jig.b (Loov;)Loov;
      // 73: athrow
      // 74: iload 1
      // 75: ifne 84
      // 78: aload 0
      // 79: bipush 0
      // 7a: invokevirtual jig.ji_ (I)V
      // 7d: goto 84
      // 80: invokestatic jig.b (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: invokevirtual jig.la2 ()Z
      // 88: iload 1
      // 89: ifeq b1
      // 8c: ifne c4
      // 8f: goto 96
      // 92: invokestatic jig.b (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: bipush 0
      // 98: invokevirtual jig.ji_ (I)V
      // 9b: aload 0
      // 9c: iload 1
      // 9d: ifeq c1
      // a0: goto a7
      // a3: invokestatic jig.b (Loov;)Loov;
      // a6: athrow
      // a7: invokevirtual jig.vt4 ()Z
      // aa: goto b1
      // ad: invokestatic jig.b (Loov;)Loov;
      // b0: athrow
      // b1: ifeq c4
      // b4: aload 0
      // b5: bipush 4
      // b6: invokevirtual jig.ji_ (I)V
      // b9: aload 0
      // ba: goto c1
      // bd: invokestatic jig.b (Loov;)Loov;
      // c0: athrow
      // c1: invokevirtual jig.r5t ()V
      // c4: return
   }

   public boolean vt4() {
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
      // 05: iload 1
      // 06: ifne 1d
      // 09: invokestatic net/minecraft/tileentity/TileEntityHopper.m_l (Lvtv;)Z
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic jig.b (Loov;)Loov;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic jig.b (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield jig.oay Lt9d;
      // 20: ldc nvf
      // 22: nop
      // 23: aload 0
      // 24: invokevirtual jig.aaw ()Lnh4;
      // 27: ldc2_w 0.25
      // 2a: dconst_0
      // 2b: ldc2_w 0.25
      // 2e: invokevirtual nh4.c2h (DDD)Lnh4;
      // 31: getstatic k0_.q01 Lcom/google/common/base/Predicate;
      // 34: invokevirtual OpaquePredicate.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 37: astore 2
      // 38: aload 2
      // 39: invokeinterface java/util/List.size ()I 1
      // 3e: iload 1
      // 3f: ifne 63
      // 42: ifle 62
      // 45: goto 4c
      // 48: invokestatic jig.b (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 2
      // 4e: bipush 0
      // 4f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 54: checkcast nvf
      // 57: invokestatic net/minecraft/tileentity/TileEntityHopper.hm_ (Lrsi;Lnvf;)Z
      // 5a: pop
      // 5b: goto 62
      // 5e: invokestatic jig.b (Loov;)Loov;
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
   }

   @Override
   public void szd(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic jig.c J
      // 03: ldc2_w 34424434236030
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial p7s.szd (Lofh;)V
      // 12: aload 0
      // 13: iload 4
      // 15: ifne 41
      // 18: getfield jig.oay Lt9d;
      // 1b: invokevirtual OpaquePredicate.eir ()Lef9;
      // 1e: sipush 24617
      // 21: ldc2_w 6763436270726163449
      // 24: lload 2
      // 25: lxor
      // 26: invokedynamic a (IJ)Ljava/lang/String; bsm=jig.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 2f: ifeq 4d
      // 32: goto 39
      // 35: invokestatic jig.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: goto 41
      // 3d: invokestatic jig.b (Loov;)Loov;
      // 40: athrow
      // 41: getstatic ox_.cwg La4v;
      // 44: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 47: bipush 1
      // 48: fconst_0
      // 49: invokevirtual jig.bhk (Lu7m;IF)Lnvf;
      // 4c: pop
      // 4d: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 37382373046438L;
      super.srs(var1);
      var1.iin(d<"a">(32125, 856598581753762934L ^ var2), this.fqs);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 96007657329677L;
      super.cjb(var1);
      this.fqs = var1.uz7(d<"a">(22355, 6914483395733951217L ^ var2));
   }

   public void ji_(int var1) {
      this.fqs = var1;
   }

   public boolean la2() {
      int var1 = OpaquePredicate.b();

      try {
         if (var1 == 0) {
            return (boolean)this.fqs;
         }

         if (this.fqs > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return (boolean)0;
   }

   @Override
   public String q4l() {
      long var1 = c ^ 64127116808318L;
      return d<"a">(10524, 292999094801328334L ^ var1);
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      return new i3n(var1, this, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2726677483136767229L, -5522317094838883358L, MethodHandles.lookup().lookupClass()).a(54140793941603L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 124896279674785L;
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
      String var6 = "tI^mO\u007fC>cÑãQ\u0099uéÍ>âû\u009d¤õ\u0097ô¢°$ò\u0080\u008d{\u0087Ûhã|´z¯,(\t\u008fþZ\u001a±R,#Ô>C\u001f\u008d\u0010\u000eXÉ\u0082%E'\u0007}m¾ý\u0004ØúøWPfJøµ \u008b®";
      int var8 = "tI^mO\u007fC>cÑãQ\u0099uéÍ>âû\u009d¤õ\u0097ô¢°$ò\u0080\u008d{\u0087Ûhã|´z¯,(\t\u008fþZ\u001a±R,#Ô>C\u001f\u008d\u0010\u000eXÉ\u0082%E'\u0007}m¾ý\u0004ØúøWPfJøµ \u008b®"
         .length();
      char var5 = '(';
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
                     o = var9;
                     p = new String[4];
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

                  var6 = "a\u000bx|\u0096ã<\n£\u0005Uø(Õ\u000eÆ,\u001fî\u0080^[@Ï(1ªy\u0015\u0093û¾U\u001b×Ï´·]$AÅ\u000fs_)ÿ\u009e\u0099]\u000f(X·:ÛÌs`z>Õ\u0005P8";
                  var8 = "a\u000bx|\u0096ã<\n£\u0005Uø(Õ\u000eÆ,\u001fî\u0080^[@Ï(1ªy\u0015\u0093û¾U\u001b×Ï´·]$AÅ\u000fs_)ÿ\u009e\u0099]\u000f(X·:ÛÌs`z>Õ\u0005P8"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5478;
      if (p[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])q.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("jig", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = o[var5].getBytes("ISO-8859-1");
         p[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return p[var5];
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
         throw new RuntimeException("jig" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
