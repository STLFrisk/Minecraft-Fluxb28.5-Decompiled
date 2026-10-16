import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fo1 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 128027570609269L;
      return b<"g">(30133, 825949151351471058L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 134754570158323L;
      return b<"g">(30014, 6542408585140086748L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic fo1.a J
      // 03: ldc2_w 123639225116976
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifeq 58
      // 14: bipush 1
      // 15: if_icmple 56
      // 18: goto 1f
      // 1b: invokestatic fo1.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: arraylength
      // 21: iload 5
      // 23: ifeq 58
      // 26: goto 2d
      // 29: invokestatic fo1.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 4
      // 2e: if_icmpge 56
      // 31: goto 38
      // 34: invokestatic fo1.a (Loov;)Loov;
      // 37: athrow
      // 38: new w57
      // 3b: dup
      // 3c: sipush 2130
      // 3f: ldc2_w 2238828212083815281
      // 42: lload 3
      // 43: lxor
      // 44: invokedynamic g (IJ)Ljava/lang/String; bsm=fo1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: nop
      // 4a: bipush 0
      // 4b: anewarray 30
      // 4e: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 51: athrow
      // 52: invokestatic fo1.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 2
      // 57: arraylength
      // 58: ifle 69
      // 5b: aload 1
      // 5c: aload 2
      // 5d: bipush 0
      // 5e: aaload
      // 5f: invokestatic fo1.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 62: goto 6d
      // 65: invokestatic fo1.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 1
      // 6a: invokestatic fo1.cfc (Le7r;)Lz96;
      // 6d: astore 6
      // 6f: aload 2
      // 70: arraylength
      // 71: bipush 3
      // 72: if_icmple 83
      // 75: aload 1
      // 76: aload 2
      // 77: bipush 1
      // 78: bipush 1
      // 79: invokestatic fo1.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 7c: goto 88
      // 7f: invokestatic fo1.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 6
      // 85: invokevirtual z96.d3d ()Lmew;
      // 88: astore 7
      // 8a: aload 6
      // 8c: iload 5
      // 8e: ifeq ae
      // 91: getfield z96.oay Lt9d;
      // 94: ifnull ed
      // 97: goto 9e
      // 9a: invokestatic fo1.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 6
      // a0: aload 7
      // a2: bipush 1
      // a3: invokevirtual z96.i9g (Lmew;Z)V
      // a6: aload 1
      // a7: goto ae
      // aa: invokestatic fo1.a (Loov;)Loov;
      // ad: athrow
      // ae: aload 0
      // af: sipush 681
      // b2: ldc2_w 7046855133461838217
      // b5: lload 3
      // b6: lxor
      // b7: invokedynamic g (IJ)Ljava/lang/String; bsm=fo1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: nop
      // bd: bipush 4
      // be: anewarray 30
      // c1: dup
      // c2: bipush 0
      // c3: aload 6
      // c5: invokevirtual z96.noc ()Ljava/lang/String;
      // c8: aastore
      // c9: dup
      // ca: bipush 1
      // cb: aload 7
      // cd: invokevirtual mew.getX ()I
      // d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d3: aastore
      // d4: dup
      // d5: bipush 2
      // d6: aload 7
      // d8: invokevirtual mew.getY ()I
      // db: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // de: aastore
      // df: dup
      // e0: bipush 3
      // e1: aload 7
      // e3: invokevirtual mew.getZ ()I
      // e6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // e9: aastore
      // ea: invokestatic fo1.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // ed: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: bipush 1
      // 08: iload 4
      // 0a: ifeq 2b
      // 0d: if_icmpne 28
      // 10: goto 17
      // 13: invokestatic fo1.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: invokestatic vr1._0v ()Lvr1;
      // 1b: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 1e: invokestatic fo1.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 21: goto 5d
      // 24: invokestatic fo1.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 2
      // 29: arraylength
      // 2a: bipush 1
      // 2b: iload 4
      // 2d: ifeq 50
      // 30: if_icmple 5c
      // 33: goto 3a
      // 36: invokestatic fo1.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 2
      // 3b: iload 4
      // 3d: ifeq 54
      // 40: goto 47
      // 43: invokestatic fo1.a (Loov;)Loov;
      // 46: athrow
      // 47: arraylength
      // 48: bipush 4
      // 49: goto 50
      // 4c: invokestatic fo1.a (Loov;)Loov;
      // 4f: athrow
      // 50: if_icmpgt 5c
      // 53: aload 2
      // 54: bipush 1
      // 55: aload 3
      // 56: invokestatic fo1.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 59: goto 5d
      // 5c: aconst_null
      // 5d: areturn
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = OpaquePredicate.c();

      try {
         if (var3 != 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4072110841109195047L, 2128020250767508076L, MethodHandles.lookup().lookupClass()).a(203253130850664L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 72410790444930L;
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
      String var6 = "\u0013îUÏ*\u0017âÖ\u00adü+\u001e5\u0082û\\Ø\u009a!$\u0010á^¨;»\u0014×\u0007b\u0015æìÇ>´°Íµ¢È ¾QHòÈ\u009dV9'_`ú\u0001\u000f0\rÛ\u0011¥6\u0017.ýf¶ô\u0093!óm\u009d\"\u0002<\u0007ëñÀ:]O·ë!Â>ñÑ¸Ù\u001aîßé\u0019)¿:u_F\u0000Î";
      int var8 = "\u0013îUÏ*\u0017âÖ\u00adü+\u001e5\u0082û\\Ø\u009a!$\u0010á^¨;»\u0014×\u0007b\u0015æìÇ>´°Íµ¢È ¾QHòÈ\u009dV9'_`ú\u0001\u000f0\rÛ\u0011¥6\u0017.ýf¶ô\u0093!óm\u009d\"\u0002<\u0007ëñÀ:]O·ë!Â>ñÑ¸Ù\u001aîßé\u0019)¿:u_F\u0000Î"
         .length();
      char var5 = '8';
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
                     c = var9;
                     g = new String[4];
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

                  var6 = "kY¼Ô\t\u001dÒß\u0007\u000e£ìj³\u0015pÂ\u0000vþ/N¸\u0098\u0082Q«Õ$\u0014f\u0080µ\u0012\u008aI¨\\\u001d\u0000\u0010Ï\u001es\u008bý\u0016õ2\u0094\u009a\f$7QQ \u000bÌ:Ì\u0012´b\u009fýt¼SÅ\u007f\u009daø6PsÖè¼¼,ë\u009f\u0099\u0093Û\u0094þ";
                  var8 = "kY¼Ô\t\u001dÒß\u0007\u000e£ìj³\u0015pÂ\u0000vþ/N¸\u0098\u0082Q«Õ$\u0014f\u0080µ\u0012\u008aI¨\\\u001d\u0000\u0010Ï\u001es\u008bý\u0016õ2\u0094\u009a\f$7QQ \u000bÌ:Ì\u0012´b\u009fýt¼SÅ\u007f\u009daø6PsÖè¼¼,ë\u009f\u0099\u0093Û\u0094þ"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22399;
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
            throw new RuntimeException("fo1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("fo1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
