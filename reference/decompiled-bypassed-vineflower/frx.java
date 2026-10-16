import java.awt.Color;
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

public class frx extends ar7 {
   public static cn7 mro;
   public static crk w7c;
   public static crk gbn;
   private fqr sfg;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public frx() {
      long var1 = a ^ 135727982153057L;
      super(b<"f">(24843, 8131993193903190187L ^ var1), _aj.z3a, false, new j1s[0]);
   }

   @jev(
      jn1 = 3
   )
   private void gi4(fz2 param1) {
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
      // 05: invokevirtual fz2.lhw ()Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifne 52
      // 0f: goto 16
      // 12: invokestatic frx.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual fz2.elp ()Z
      // 1a: goto 21
      // 1d: invokestatic frx.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 4f
      // 25: ifne 52
      // 28: goto 2f
      // 2b: invokestatic frx.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: pop
      // 31: getstatic frx.ek1 Lc05;
      // 34: getfield c05.oxn Lmoh;
      // 37: getfield moh.oxt Lm7l;
      // 3a: iload 2
      // 3b: ifne 85
      // 3e: goto 45
      // 41: invokestatic frx.a (Loov;)Loov;
      // 44: athrow
      // 45: getfield m7l.m7n Z
      // 48: goto 4f
      // 4b: invokestatic frx.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifne 5c
      // 52: aload 0
      // 53: aconst_null
      // 54: putfield frx.sfg Lfqr;
      // 57: return
      // 58: invokestatic frx.a (Loov;)Loov;
      // 5b: athrow
      // 5c: invokestatic uj3.o1c ()Ljava/util/List;
      // 5f: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 64: aload 0
      // 65: invokedynamic test (Lfrx;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, frx.v3r (Lha9;)Z, (Lha9;)Z ]
      // 6a: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 6f: aload 0
      // 70: invokedynamic apply (Lfrx;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, frx.xym (Lha9;)Ljava/lang/Float;, (Lha9;)Ljava/lang/Float; ]
      // 75: invokestatic java/util/Comparator.comparing (Ljava/util/function/Function;)Ljava/util/Comparator;
      // 78: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 7d: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // 80: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 85: checkcast java/util/List
      // 88: astore 3
      // 89: iload 2
      // 8a: ifne c6
      // 8d: aload 3
      // 8e: invokeinterface java/util/List.size ()I 1
      // 93: ifgt a2
      // 96: goto 9d
      // 99: invokestatic frx.a (Loov;)Loov;
      // 9c: athrow
      // 9d: return
      // 9e: invokestatic frx.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 0
      // a3: aload 0
      // a4: aload 3
      // a5: bipush 0
      // a6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // ab: checkcast g_3
      // ae: getstatic frx.gbn Lcrk;
      // b1: invokevirtual crk.d7c ()Ljava/lang/Float;
      // b4: invokevirtual java/lang/Float.floatValue ()F
      // b7: getstatic frx.mro Lcn7;
      // ba: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // bd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // c0: invokespecial frx.l72 (Lg_3;FZ)Lfqr;
      // c3: putfield frx.sfg Lfqr;
      // c6: aload 0
      // c7: getfield frx.sfg Lfqr;
      // ca: invokestatic omb.b5h (Lfqr;)[F
      // cd: astore 4
      // cf: aload 1
      // d0: aload 4
      // d2: bipush 0
      // d3: faload
      // d4: invokevirtual fz2.h8j (F)V
      // d7: aload 1
      // d8: aload 4
      // da: bipush 1
      // db: faload
      // dc: invokevirtual fz2.ni7 (F)V
      // df: return
   }

   @jev
   private void kjk(b5k var1) {
      int var2 = t9d.b();

      fqr var10000;
      label22: {
         try {
            var10000 = this.sfg;
            if (var2 == 0) {
               break label22;
            }

            if (this.sfg == null) {
               return;
            }
         } catch (oov var9) {
            throw a(var9);
         }

         var10000 = this.sfg;
      }

      double var3 = var10000.lvi - ek1.ibs().yky();
      double var5 = this.sfg.gn5 - ek1.ibs().fxk();
      double var7 = this.sfg.bn2 - ek1.ibs().kux();
      iyr.jil(var3 - 0.5, var5 - 0.5, var7 - 0.5, new Color(255, 0, 0, 100).getRGB(), new Color(16771328).getRGB(), 1.0F);
   }

   private fqr l72(g_3 param1, float param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getfield g_3.o2v D
      // 09: aload 1
      // 0a: getfield g_3.o2v D
      // 0d: aload 1
      // 0e: getfield g_3.ivp D
      // 11: dsub
      // 12: fload 2
      // 13: f2d
      // 14: dmul
      // 15: dadd
      // 16: dstore 5
      // 18: aload 1
      // 19: getfield g_3.kfp D
      // 1c: aload 1
      // 1d: getfield g_3.kfp D
      // 20: aload 1
      // 21: getfield g_3.c54 D
      // 24: dsub
      // 25: fload 2
      // 26: f2d
      // 27: ldc2_w 0.3
      // 2a: dmul
      // 2b: dmul
      // 2c: iload 4
      // 2e: ifne 49
      // 31: dadd
      // 32: iload 3
      // 33: ifeq 4c
      // 36: goto 3d
      // 39: invokestatic frx.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 1
      // 3e: invokevirtual g_3.c5y ()F
      // 41: f2d
      // 42: goto 49
      // 45: invokestatic frx.a (Loov;)Loov;
      // 48: athrow
      // 49: goto 4d
      // 4c: dconst_1
      // 4d: dadd
      // 4e: dstore 7
      // 50: aload 1
      // 51: getfield g_3.vbd D
      // 54: aload 1
      // 55: getfield g_3.vbd D
      // 58: aload 1
      // 59: getfield g_3.e2b D
      // 5c: dsub
      // 5d: fload 2
      // 5e: f2d
      // 5f: dmul
      // 60: dadd
      // 61: dstore 9
      // 63: new fqr
      // 66: dup
      // 67: dload 5
      // 69: dload 7
      // 6b: dload 9
      // 6d: invokespecial fqr.<init> (DDD)V
      // 70: areturn
   }

   private boolean v3r(ha9 param1) {
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
      // 05: getfield ha9.ma9 Z
      // 08: iload 2
      // 09: ifne 32
      // 0c: ifne 31
      // 0f: goto 16
      // 12: invokestatic frx.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual ha9.i55 ()F
      // 1a: fconst_0
      // 1b: fcmpg
      // 1c: iload 2
      // 1d: ifne 49
      // 20: goto 27
      // 23: invokestatic frx.a (Loov;)Loov;
      // 26: athrow
      // 27: ifgt 33
      // 2a: goto 31
      // 2d: invokestatic frx.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: aload 0
      // 34: pop
      // 35: getstatic frx.ek1 Lc05;
      // 38: getfield c05.vg8 Ll86;
      // 3b: aload 1
      // 3c: invokevirtual l86.tm6 (Li2h;)F
      // 3f: getstatic frx.w7c Lcrk;
      // 42: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 45: invokevirtual java/lang/Float.floatValue ()F
      // 48: fcmpl
      // 49: iload 2
      // 4a: ifne 69
      // 4d: ifle 5d
      // 50: goto 57
      // 53: invokestatic frx.a (Loov;)Loov;
      // 56: athrow
      // 57: bipush 0
      // 58: ireturn
      // 59: invokestatic frx.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: pop
      // 5f: getstatic frx.ek1 Lc05;
      // 62: getfield c05.vg8 Ll86;
      // 65: aload 1
      // 66: invokevirtual l86.e7y (Li2h;)Z
      // 69: iload 2
      // 6a: ifne 81
      // 6d: ifne 7d
      // 70: goto 77
      // 73: invokestatic frx.a (Loov;)Loov;
      // 76: athrow
      // 77: bipush 0
      // 78: ireturn
      // 79: invokestatic frx.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 1
      // 7e: invokestatic f62.a92 (Lha9;)Z
      // 81: iload 2
      // 82: ifne b9
      // 85: ifeq b3
      // 88: goto 8f
      // 8b: invokestatic frx.a (Loov;)Loov;
      // 8e: athrow
      // 8f: getstatic zwr.o1s Lcn7;
      // 92: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 95: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 98: iload 2
      // 99: ifne b9
      // 9c: goto a3
      // 9f: invokestatic frx.a (Loov;)Loov;
      // a2: athrow
      // a3: ifeq b3
      // a6: goto ad
      // a9: invokestatic frx.a (Loov;)Loov;
      // ac: athrow
      // ad: bipush 0
      // ae: ireturn
      // af: invokestatic frx.a (Loov;)Loov;
      // b2: athrow
      // b3: getstatic kgt.p71 Lar9;
      // b6: invokevirtual ar9.klu ()Z
      // b9: iload 2
      // ba: ifne ea
      // bd: ifeq e9
      // c0: goto c7
      // c3: invokestatic frx.a (Loov;)Loov;
      // c6: athrow
      // c7: getstatic kgt.p71 Lar9;
      // ca: aload 1
      // cb: invokevirtual ar9.kh5 (Lg_3;)Z
      // ce: iload 2
      // cf: ifne ea
      // d2: goto d9
      // d5: invokestatic frx.a (Loov;)Loov;
      // d8: athrow
      // d9: ifeq e9
      // dc: goto e3
      // df: invokestatic frx.a (Loov;)Loov;
      // e2: athrow
      // e3: bipush 0
      // e4: ireturn
      // e5: invokestatic frx.a (Loov;)Loov;
      // e8: athrow
      // e9: bipush 1
      // ea: ireturn
   }

   private Float xym(ha9 var1) {
      return ek1.vg8.tm6(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7950785158945940551L, 7392889561526017959L, MethodHandles.lookup().lookupClass()).a(164724079741458L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 14204158712398L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "øëü¬¢jÂÀ\u0089å¶°\u0082Û\u0010T ÅD4\\÷É\u0089\u008cX\u008bÕ@<ùÚ'ºæ\u0007\"ïÃP\u0002÷;\u008eªCñy½\u0010\u001aÂ\\Å¯Ô\u0083ÆßÎ\u0004,\u0087\u0006l\u008e";
      int var6 = "øëü¬¢jÂÀ\u0089å¶°\u0082Û\u0010T ÅD4\\÷É\u0089\u008cX\u008bÕ@<ùÚ'ºæ\u0007\"ïÃP\u0002÷;\u008eªCñy½\u0010\u001aÂ\\Å¯Ô\u0083ÆßÎ\u0004,\u0087\u0006l\u008e"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[5];
                     mro = new cn7(b<"f">(21338, 2822630161314665943L ^ var9), b<"f">(5960, 2407069029726294470L ^ var9), false);
                     w7c = new crk(b<"f">(24843, 8132044224674817924L ^ var9), b<"f">(27818, 3210669626052012582L ^ var9), 100.0F, 1.0F, 500.0F, 5.0F);
                     gbn = new crk(b<"f">(24843, 8132044224674817924L ^ var9), b<"f">(3187, 6434099850056108792L ^ var9), 1.5F, 0.0F, 10.0F, 0.1F);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0016\u0093<\u008bæ\u0099ï4Àf¡^µå£p\u0018Ï>YiªECsàSþ\u0092u&\u0088°cÂe\u008cYÓ\u0018\t";
                  var6 = "\u0016\u0093<\u008bæ\u0099ï4Àf¡^µå£p\u0018Ï>YiªECsàSþ\u0092u&\u0088°cÂe\u008cYÓ\u0018\t".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22131;
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
            throw new RuntimeException("frx", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("frx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
