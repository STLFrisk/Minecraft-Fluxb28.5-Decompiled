import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class inv extends yem {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public inv(String var1, String var2) {
      this.n8b = var1;
      this.gvx = var2;
   }

   public String cf1() {
      return this.n8b;
   }

   public String tj1() {
      return this.gvx;
   }

   public void h2r(String var1) {
      this.lqp = var1;
   }

   @Override
   public String cpz() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic inv.a J
      // 03: ldc2_w 20804527176533
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: invokestatic vr1._0v ()Lvr1;
      // 0f: astore 4
      // 11: aload 4
      // 13: iload 3
      // 14: ifeq 23
      // 17: ifnull c9
      // 1a: goto 21
      // 1d: invokestatic inv.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 4
      // 23: invokevirtual vr1.i6_ ()Z
      // 26: iload 3
      // 27: ifeq 4d
      // 2a: ifeq c9
      // 2d: goto 34
      // 30: invokestatic inv.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: getfield inv.lqp Ljava/lang/String;
      // 38: iload 3
      // 39: ifeq cd
      // 3c: goto 43
      // 3f: invokestatic inv.a (Loov;)Loov;
      // 42: athrow
      // 43: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 46: goto 4d
      // 49: invokestatic inv.a (Loov;)Loov;
      // 4c: athrow
      // 4d: ifeq c9
      // 50: aload 4
      // 52: bipush 0
      // 53: invokevirtual vr1.hrw (I)Ldug;
      // 56: invokevirtual dug.fgp ()Luci;
      // 59: astore 5
      // 5b: aload 5
      // 5d: aload 0
      // 5e: getfield inv.gvx Ljava/lang/String;
      // 61: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 64: astore 6
      // 66: aload 5
      // 68: aload 0
      // 69: getfield inv.n8b Ljava/lang/String;
      // 6c: aload 6
      // 6e: iload 3
      // 6f: ifeq 8e
      // 72: invokevirtual uci.g4w (Ljava/lang/String;Lsa6;)Z
      // 75: ifeq bb
      // 78: goto 7f
      // 7b: invokestatic inv.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 5
      // 81: aload 0
      // 82: getfield inv.n8b Ljava/lang/String;
      // 85: aload 6
      // 87: goto 8e
      // 8a: invokestatic inv.a (Loov;)Loov;
      // 8d: athrow
      // 8e: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 91: astore 7
      // 93: aload 0
      // 94: sipush 8310
      // 97: ldc2_w 5194540343576469428
      // 9a: lload 1
      // 9b: lxor
      // 9c: invokedynamic j (IJ)Ljava/lang/String; bsm=inv.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: nop
      // a2: bipush 1
      // a3: anewarray 79
      // a6: dup
      // a7: bipush 0
      // a8: aload 7
      // aa: invokevirtual r11.fge ()I
      // ad: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b0: aastore
      // b1: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // b4: invokevirtual inv.h2r (Ljava/lang/String;)V
      // b7: iload 3
      // b8: ifne c9
      // bb: aload 0
      // bc: ldc ""
      // be: nop
      // bf: putfield inv.lqp Ljava/lang/String;
      // c2: goto c9
      // c5: invokestatic inv.a (Loov;)Loov;
      // c8: athrow
      // c9: aload 0
      // ca: getfield inv.lqp Ljava/lang/String;
      // cd: areturn
   }

   public inv qy8() {
      inv var2 = new inv(this.n8b, this.gvx);
      var2.h2r(this.lqp);
      int var10000 = OpaquePredicate.b();
      var2.di5(this.f4q().esg());
      Iterator var3 = this.iwv().iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            ekw var4 = (ekw)var3.next();

            try {
               var6 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.vha(var4.qy8());
               if (var1 != 0) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6;
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic inv.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic inv.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 33
      // 1f: instanceof inv
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic inv.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic inv.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast inv
      // 36: astore 3
      // 37: aload 0
      // 38: getfield inv.n8b Ljava/lang/String;
      // 3b: aload 3
      // 3c: getfield inv.n8b Ljava/lang/String;
      // 3f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42: iload 2
      // 43: ifne 62
      // 46: ifeq 8e
      // 49: goto 50
      // 4c: invokestatic inv.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield inv.gvx Ljava/lang/String;
      // 54: aload 3
      // 55: getfield inv.gvx Ljava/lang/String;
      // 58: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5b: goto 62
      // 5e: invokestatic inv.a (Loov;)Loov;
      // 61: athrow
      // 62: iload 2
      // 63: ifne 7c
      // 66: ifeq 8e
      // 69: goto 70
      // 6c: invokestatic inv.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 1
      // 72: invokespecial yem.equals (Ljava/lang/Object;)Z
      // 75: goto 7c
      // 78: invokestatic inv.a (Loov;)Loov;
      // 7b: athrow
      // 7c: iload 2
      // 7d: ifne 8b
      // 80: ifeq 8e
      // 83: goto 8a
      // 86: invokestatic inv.a (Loov;)Loov;
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 8f
      // 8e: bipush 0
      // 8f: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 78482046580738L;
      return b<"j">(13042, 1201255252830178917L ^ var1)
         + this.n8b
         + '\''
         + b<"j">(20783, 1212495731416903097L ^ var1)
         + this.gvx
         + '\''
         + b<"j">(26231, 4621580631371356903L ^ var1)
         + this.asp
         + b<"j">(4822, 45500913013550658L ^ var1)
         + this.f4q()
         + '}';
   }

   @Override
   public ekw qy8() {
      return this.qy8();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7141480444365336870L, -5973463197445863945L, MethodHandles.lookup().lookupClass()).a(194464246839223L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 62653400099849L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "Qôh?ß\u0000\u0001\u0084 \u0019é-VY\u008b\u0013\u0081t;zëtû;Z5b\u0016Æ¶Tì\u0010\u009fâ¢\u0014Ù\u0016\u008d\u0085|o\u0017ý\u007fe]w\u0018Î*Tà\u0005JÞ_H³(çÍ{\u0091DÖ¬P5´\u0007e\u0010";
      int var8 = "Qôh?ß\u0000\u0001\u0084 \u0019é-VY\u008b\u0013\u0081t;zëtû;Z5b\u0016Æ¶Tì\u0010\u009fâ¢\u0014Ù\u0016\u008d\u0085|o\u0017ý\u007fe]w\u0018Î*Tà\u0005JÞ_H³(çÍ{\u0091DÖ¬P5´\u0007e\u0010"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[5];
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

                  var6 = "ú@oQ÷\n~\u0096\u0096MÐ\u0098¿a³É5\u009a¶ _Í[ã\u008fú}c\u0085\u009cÕE\n)Wø~ \u0013C 2\u0010r\u0019Í1\u0013¤\u0096cD\tÇÛ)¨¸h\u009cqÏl\u0094¢ZøïÈ\\U\u001cN";
                  var8 = "ú@oQ÷\n~\u0096\u0096MÐ\u0098¿a³É5\u009a¶ _Í[ã\u008fú}c\u0085\u009cÕE\n)Wø~ \u0013C 2\u0010r\u0019Í1\u0013¤\u0096cD\tÇÛ)¨¸h\u009cqÏl\u0094¢ZøïÈ\\U\u001cN"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20527;
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
            throw new RuntimeException("inv", var10);
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
         throw new RuntimeException("inv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
