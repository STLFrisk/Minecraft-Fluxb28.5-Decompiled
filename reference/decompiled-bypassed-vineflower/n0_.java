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

public class n0_ extends rdv {
   public n0_$kmh u16;
   private static final long b;
   private static final String[] h;
   private static final String[] i;
   private static final Map m = new HashMap(13);

   public n0_(t9d var1) {
      super(var1);
   }

   public n0_(t9d param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: invokespecial rdv.<init> (Lt9d;Lmew;)V
      // 06: invokestatic t9d.b ()I
      // 09: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0c: astore 5
      // 0e: invokestatic n0_$kmh.values ()[Ln0_$kmh;
      // 11: astore 6
      // 13: aload 6
      // 15: arraylength
      // 16: istore 7
      // 18: bipush 0
      // 19: istore 8
      // 1b: istore 4
      // 1d: iload 8
      // 1f: iload 7
      // 21: if_icmpge 6e
      // 24: aload 6
      // 26: iload 8
      // 28: aaload
      // 29: astore 9
      // 2b: aload 0
      // 2c: aload 9
      // 2e: putfield n0_.u16 Ln0_$kmh;
      // 31: aload 0
      // 32: aload 3
      // 33: invokevirtual n0_.qht (Lvt2;)V
      // 36: iload 4
      // 38: ifeq 69
      // 3b: aload 0
      // 3c: invokevirtual n0_.lgc ()Z
      // 3f: iload 4
      // 41: ifeq 75
      // 44: goto 4b
      // 47: invokestatic n0_.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ifeq 66
      // 4e: goto 55
      // 51: invokestatic n0_.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 5
      // 57: aload 9
      // 59: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5e: pop
      // 5f: goto 66
      // 62: invokestatic n0_.a (Loov;)Loov;
      // 65: athrow
      // 66: iinc 8 1
      // 69: iload 4
      // 6b: ifne 1d
      // 6e: aload 5
      // 70: invokeinterface java/util/List.isEmpty ()Z 1
      // 75: ifne 9b
      // 78: aload 0
      // 79: aload 5
      // 7b: aload 0
      // 7c: getfield n0_.z2d Ljava/util/Random;
      // 7f: aload 5
      // 81: invokeinterface java/util/List.size ()I 1
      // 86: invokevirtual java/util/Random.nextInt (I)I
      // 89: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 8e: checkcast n0_$kmh
      // 91: putfield n0_.u16 Ln0_$kmh;
      // 94: goto 9b
      // 97: invokestatic n0_.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 0
      // 9c: aload 3
      // 9d: invokevirtual n0_.qht (Lvt2;)V
      // a0: return
   }

   public n0_(t9d param1, mew param2, vt2 param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: invokespecial n0_.<init> (Lt9d;Lmew;Lvt2;)V
      // 07: invokestatic t9d.c ()I
      // 0a: invokestatic n0_$kmh.values ()[Ln0_$kmh;
      // 0d: astore 6
      // 0f: aload 6
      // 11: arraylength
      // 12: istore 7
      // 14: bipush 0
      // 15: istore 8
      // 17: istore 5
      // 19: iload 8
      // 1b: iload 7
      // 1d: if_icmpge 6d
      // 20: aload 6
      // 22: iload 8
      // 24: aaload
      // 25: astore 9
      // 27: iload 5
      // 29: ifne 72
      // 2c: iload 5
      // 2e: ifne 68
      // 31: goto 38
      // 34: invokestatic n0_.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 9
      // 3a: getfield n0_$kmh.kw2 Ljava/lang/String;
      // 3d: aload 4
      // 3f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42: ifeq 5e
      // 45: goto 4c
      // 48: invokestatic n0_.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 9
      // 4f: putfield n0_.u16 Ln0_$kmh;
      // 52: iload 5
      // 54: ifeq 6d
      // 57: goto 5e
      // 5a: invokestatic n0_.a (Loov;)Loov;
      // 5d: athrow
      // 5e: iinc 8 1
      // 61: goto 68
      // 64: invokestatic n0_.a (Loov;)Loov;
      // 67: athrow
      // 68: iload 5
      // 6a: ifeq 19
      // 6d: aload 0
      // 6e: aload 3
      // 6f: invokevirtual n0_.qht (Lvt2;)V
      // 72: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = b ^ 100588901416219L;
      var1.rjq(c<"g">(26116, 6998706695703359433L ^ var2), this.u16.kw2);
      super.srs(var1);
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
      // 00: getstatic n0_.b J
      // 03: ldc2_w 50381726142896
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: sipush 11241
      // 0c: ldc2_w 5326348211954503308
      // 0f: lload 2
      // 10: lxor
      // 11: invokedynamic g (IJ)Ljava/lang/String; bsm=n0_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: nop
      // 17: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 1a: astore 5
      // 1c: invokestatic n0_$kmh.values ()[Ln0_$kmh;
      // 1f: astore 6
      // 21: invokestatic t9d.b ()I
      // 24: aload 6
      // 26: arraylength
      // 27: istore 7
      // 29: bipush 0
      // 2a: istore 8
      // 2c: istore 4
      // 2e: iload 8
      // 30: iload 7
      // 32: if_icmpge 76
      // 35: aload 6
      // 37: iload 8
      // 39: aaload
      // 3a: astore 9
      // 3c: iload 4
      // 3e: ifeq 71
      // 41: aload 9
      // 43: iload 4
      // 45: ifeq 86
      // 48: goto 4f
      // 4b: invokestatic n0_.a (Loov;)Loov;
      // 4e: athrow
      // 4f: getfield n0_$kmh.kw2 Ljava/lang/String;
      // 52: aload 5
      // 54: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 57: ifeq 6e
      // 5a: goto 61
      // 5d: invokestatic n0_.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: aload 9
      // 64: putfield n0_.u16 Ln0_$kmh;
      // 67: goto 6e
      // 6a: invokestatic n0_.a (Loov;)Loov;
      // 6d: athrow
      // 6e: iinc 8 1
      // 71: iload 4
      // 73: ifne 2e
      // 76: aload 0
      // 77: iload 4
      // 79: ifeq 98
      // 7c: getfield n0_.u16 Ln0_$kmh;
      // 7f: goto 86
      // 82: invokestatic n0_.a (Loov;)Loov;
      // 85: athrow
      // 86: ifnonnull 97
      // 89: aload 0
      // 8a: getstatic n0_$kmh.gqf Ln0_$kmh;
      // 8d: putfield n0_.u16 Ln0_$kmh;
      // 90: goto 97
      // 93: invokestatic n0_.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 0
      // 98: aload 1
      // 99: invokespecial rdv.cjb (Lbdo;)V
      // 9c: return
   }

   @Override
   public int bli() {
      return this.u16.ons;
   }

   @Override
   public int cgb() {
      return this.u16.zbf;
   }

   @Override
   public void r4_(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic n0_.b J
      // 03: ldc2_w 65706843592328
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield n0_.oay Lt9d;
      // 11: invokevirtual t9d.eir ()Lef9;
      // 14: sipush 3167
      // 17: ldc2_w 5886291089019792896
      // 1a: lload 2
      // 1b: lxor
      // 1c: invokedynamic g (IJ)Ljava/lang/String; bsm=n0_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: nop
      // 22: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 25: iload 4
      // 27: ifne 4b
      // 2a: ifeq 74
      // 2d: goto 34
      // 30: invokestatic n0_.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: iload 4
      // 37: ifne 4f
      // 3a: goto 41
      // 3d: invokestatic n0_.a (Loov;)Loov;
      // 40: athrow
      // 41: instanceof ha9
      // 44: goto 4b
      // 47: invokestatic n0_.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ifeq 64
      // 4e: aload 1
      // 4f: checkcast ha9
      // 52: astore 5
      // 54: aload 5
      // 56: getfield ha9.lls Lpj2;
      // 59: getfield pj2.g40 Z
      // 5c: ifeq 64
      // 5f: return
      // 60: invokestatic n0_.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: new erg
      // 68: dup
      // 69: getstatic xbr.zrk Lu7m;
      // 6c: invokespecial erg.<init> (Lu7m;)V
      // 6f: fconst_0
      // 70: invokevirtual n0_.qji (Lerg;F)Lnvf;
      // 73: pop
      // 74: return
   }

   @Override
   public void x24(double var1, double var3, double var5, float var7, float var8) {
      mew var9 = this.aie.f_0(var1 - this.o2v, var3 - this.kfp, var5 - this.vbd);
      this.m6_((double)var9.getX(), (double)var9.getY(), (double)var9.getZ());
   }

   @Override
   public void ltu(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      mew var11 = this.aie.f_0(var1 - this.o2v, var3 - this.kfp, var5 - this.vbd);
      this.m6_((double)var11.getX(), (double)var11.getY(), (double)var11.getZ());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2766498519675220674L, 492208535556004820L, MethodHandles.lookup().lookupClass()).a(196471844654971L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 21359412783498L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "ÆÕÒ¡Ý£\u0091\u0085ê÷GiÛ8i±êqwIßçö¦\u001f\u0081°cæõÂ(\u0010Ý·Þ|\u000b¡|\u0081¡2)úð\u0002\u0092\u009d\u0010É\b/\u0088É\u0004\u0088_óØØ\u0015Ý,r¶";
      int var8 = "ÆÕÒ¡Ý£\u0091\u0085ê÷GiÛ8i±êqwIßçö¦\u001f\u0081°cæõÂ(\u0010Ý·Þ|\u000b¡|\u0081¡2)úð\u0002\u0092\u009d\u0010É\b/\u0088É\u0004\u0088_óØØ\u0015Ý,r¶"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            h = var9;
            i = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13728;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("n0_", var10);
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
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("n0_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
