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

public class qfn implements lv1 {
   private yig qsi;
   private final moh qrd;
   private final g_x lrq = new g_x();
   private final sqm bs4 = new sqm();
   private final hqj k0m = new hqj();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public qfn(yig var1, moh var2) {
      this.qsi = var1;
      this.qrd = var2;
   }

   public yig icl() {
      return this.qsi;
   }

   public void bgf(zfz var1, mew var2, sla var3, m5n var4) {
      int var5 = OpaquePredicate.b();
      e0x var6 = var1.r_y();
      int var7 = var6.kfj();

      label20: {
         try {
            if (var5 == 0) {
               break label20;
            }

            if (var7 != 3) {
               return;
            }
         } catch (oov var10) {
            throw a(var10);
         }

         var1 = var6.w1b(var1, var4, var2);
      }

      dbw var8 = this.qsi.__s(var1);
      dbw var9 = new nmr$pb4(var8, var3).y8d();
      this.lrq.o1d(var4, var9, var1, var2, jom.yut().zuq());
   }

   public boolean nxw(zfz var1, mew var2, m5n var3, q3g var4) {
      long var5 = a ^ 93133427590563L;
      int var7 = OpaquePredicate.c();

      try {
         int var8 = var1.r_y().kfj();

         int var10000;
         label59: {
            try {
               var10000 = var8;
               if (var7 != 0) {
                  break label59;
               }

               if (var8 == -1) {
                  return false;
               }
            } catch (Throwable var12) {
               throw a(var12);
            }

            var10000 = var8;
         }

         label74: {
            try {
               if (var7 != 0) {
                  return (boolean)var10000;
               }

               switch (var10000) {
                  case 1:
                     return this.k0m.q5q(var3, var1, var2, var4);
                  case 2:
                     return false;
                  case 3:
                     break label74;
               }
            } catch (Throwable var11) {
               throw a(var11);
            }

            return (boolean)0;
         }

         dbw var14 = this.b5n(var1, var3, var2);
         return this.lrq.o1d(var3, var14, var1, var2, var4);
      } catch (Throwable var13) {
         e1i var9 = e1i.cor(var13, a<"z">(23857, 746105984587450983L ^ var5));
         wsc var10 = var9.i_r(a<"z">(14847, 8125740455354707624L ^ var5));
         wsc.kyk(var10, var2, var1.r_y(), var1.r_y().hvp(var1));
         throw new oov(var9);
      }
   }

   public g_x mpi() {
      return this.lrq;
   }

   private dbw _q_(zfz param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield qfn.qsi Lyig;
      // 08: aload 1
      // 09: invokevirtual yig.__s (Lzfz;)Ldbw;
      // 0c: astore 4
      // 0e: aload 2
      // 0f: ifnull 56
      // 12: aload 0
      // 13: getfield qfn.qrd Lmoh;
      // 16: getfield moh.yp8 Z
      // 19: iload 3
      // 1a: ifeq 45
      // 1d: goto 24
      // 20: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: ifeq 56
      // 27: goto 2e
      // 2a: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: aload 4
      // 30: iload 3
      // 31: ifeq 58
      // 34: goto 3b
      // 37: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: instanceof kqv
      // 3e: goto 45
      // 41: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: ifeq 56
      // 48: aload 4
      // 4a: checkcast kqv
      // 4d: aload 2
      // 4e: invokestatic fe6.n88 (Lwgo;)J
      // 51: invokevirtual kqv.h1z (J)Ldbw;
      // 54: astore 4
      // 56: aload 4
      // 58: areturn
   }

   public dbw b5n(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: invokeinterface zfz.r_y ()Le0x; 1
      // 0b: astore 5
      // 0d: iload 4
      // 0f: ifne 2e
      // 12: aload 2
      // 13: invokeinterface m5n.getWorldType ()Lgxq; 1
      // 18: getstatic gxq.gl_ Lgxq;
      // 1b: if_acmpeq 33
      // 1e: goto 25
      // 21: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 5
      // 27: aload 1
      // 28: aload 2
      // 29: aload 3
      // 2a: invokevirtual e0x.w1b (Lzfz;Lm5n;Lmew;)Lzfz;
      // 2d: astore 1
      // 2e: goto 33
      // 31: astore 6
      // 33: aload 0
      // 34: getfield qfn.qsi Lyig;
      // 37: aload 1
      // 38: invokevirtual yig.__s (Lzfz;)Ldbw;
      // 3b: astore 6
      // 3d: aload 3
      // 3e: ifnull 87
      // 41: aload 0
      // 42: getfield qfn.qrd Lmoh;
      // 45: getfield moh.yp8 Z
      // 48: iload 4
      // 4a: ifne 76
      // 4d: goto 54
      // 50: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: ifeq 87
      // 57: goto 5e
      // 5a: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 6
      // 60: iload 4
      // 62: ifne 89
      // 65: goto 6c
      // 68: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: instanceof kqv
      // 6f: goto 76
      // 72: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: ifeq 87
      // 79: aload 6
      // 7b: checkcast kqv
      // 7e: aload 3
      // 7f: invokestatic fe6.n88 (Lwgo;)J
      // 82: invokevirtual kqv.h1z (J)Ldbw;
      // 85: astore 6
      // 87: aload 6
      // 89: areturn
   }

   public void _qd(zfz param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokeinterface zfz.r_y ()Le0x; 1
      // 0a: invokevirtual e0x.kfj ()I
      // 0d: istore 4
      // 0f: iload 4
      // 11: iload 3
      // 12: ifeq 29
      // 15: bipush -1
      // 16: if_icmpeq 7f
      // 19: goto 20
      // 1c: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: iload 4
      // 22: goto 29
      // 25: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: tableswitch 27 1 3 27 38 63
      // 44: iload 3
      // 45: ifne 7f
      // 48: goto 4f
      // 4b: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield qfn.bs4 Lsqm;
      // 53: aload 1
      // 54: invokeinterface zfz.r_y ()Le0x; 1
      // 59: fload 2
      // 5a: invokevirtual sqm.ida (Le0x;F)V
      // 5d: iload 3
      // 5e: ifne 7f
      // 61: goto 68
      // 64: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 0
      // 69: aload 1
      // 6a: aconst_null
      // 6b: checkcast mew
      // 6e: invokespecial qfn._q_ (Lzfz;Lmew;)Ldbw;
      // 71: astore 5
      // 73: aload 0
      // 74: getfield qfn.lrq Lg_x;
      // 77: aload 5
      // 79: aload 1
      // 7a: fload 2
      // 7b: bipush 1
      // 7c: invokevirtual g_x.v2f (Ldbw;Lzfz;FZ)V
      // 7f: return
   }

   public boolean p7d(e0x param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifeq 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual e0x.kfj ()I
      // 1d: istore 4
      // 1f: iload 4
      // 21: bipush 3
      // 22: iload 3
      // 23: ifeq 46
      // 26: if_icmpne 38
      // 29: goto 30
      // 2c: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: bipush 0
      // 31: goto 4e
      // 34: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: iload 4
      // 3a: iload 3
      // 3b: ifeq 4a
      // 3e: bipush 2
      // 3f: goto 46
      // 42: invokestatic qfn.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: if_icmpne 4d
      // 49: bipush 1
      // 4a: goto 4e
      // 4d: bipush 0
      // 4e: ireturn
   }

   @Override
   public void onResourceManagerReload(y99 var1) {
      this.k0m.z05();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-294698605511471988L, 8684385424581046503L, MethodHandles.lookup().lookupClass()).a(172505272420114L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 96049271597155L;
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
      String var6 = "j«çB¹\u0098\u00960©/Æ[F\u001bqùç\u009aêOß\u0005\u008f\u00931t¦¢uw)ì\u0005bU[¥+O\u0097C\u00120v¡ó-\t(\u0092\u0014\u0082kÁ\u0081ð5G\u009bf\u0015ÔAú§-u\u000eç1\u008bX$Èzô©KF\u0084E@\u0096l\bÌù[Ä";
      int var8 = "j«çB¹\u0098\u00960©/Æ[F\u001bqùç\u009aêOß\u0005\u008f\u00931t¦¢uw)ì\u0005bU[¥+O\u0097C\u00120v¡ó-\t(\u0092\u0014\u0082kÁ\u0081ð5G\u009bf\u0015ÔAú§-u\u000eç1\u008bX$Èzô©KF\u0084E@\u0096l\bÌù[Ä"
         .length();
      char var5 = '0';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12985;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("qfn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("qfn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
