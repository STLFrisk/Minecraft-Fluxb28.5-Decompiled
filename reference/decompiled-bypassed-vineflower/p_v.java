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

public class p_v extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 43457770777497L;
      return b<"x">(16406, 9054873953695285394L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 45595631433503L;
      return b<"x">(24710, 1078313393829067907L ^ var2);
   }

   @Override
   public boolean m6l(e7r param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: invokestatic vr1._0v ()Lvr1;
      // 07: invokevirtual vr1.wh3 ()Lwlx;
      // 0a: invokevirtual wlx.w68 ()Lwxb;
      // 0d: invokevirtual wxb.dc3 ()Z
      // 10: iload 2
      // 11: ifne 2a
      // 14: ifeq 3c
      // 17: goto 1e
      // 1a: invokestatic p_v.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial bc_.m6l (Le7r;)Z
      // 23: goto 2a
      // 26: invokestatic p_v.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 2
      // 2b: ifne 39
      // 2e: ifeq 3c
      // 31: goto 38
      // 34: invokestatic p_v.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
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
      // 000: getstatic p_v.a J
      // 003: ldc2_w 39058184380124
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: iload 5
      // 011: ifne 02c
      // 014: bipush 1
      // 015: if_icmplt 105
      // 018: goto 01f
      // 01b: invokestatic p_v.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 2
      // 020: bipush 0
      // 021: aaload
      // 022: invokevirtual java/lang/String.length ()I
      // 025: goto 02c
      // 028: invokestatic p_v.a (Loov;)Loov;
      // 02b: athrow
      // 02c: ifle 105
      // 02f: invokestatic vr1._0v ()Lvr1;
      // 032: astore 6
      // 034: aload 6
      // 036: invokevirtual vr1.y71 ()Lkr3;
      // 039: aload 2
      // 03a: bipush 0
      // 03b: aaload
      // 03c: invokevirtual kr3.wjp (Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // 03f: astore 7
      // 041: aload 7
      // 043: ifnonnull 06a
      // 046: new uvb
      // 049: dup
      // 04a: sipush 15722
      // 04d: ldc2_w 2790448043357849774
      // 050: lload 3
      // 051: lxor
      // 052: invokedynamic x (IJ)Ljava/lang/String; bsm=p_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: nop
      // 058: bipush 1
      // 059: anewarray 70
      // 05c: dup
      // 05d: bipush 0
      // 05e: aload 2
      // 05f: bipush 0
      // 060: aaload
      // 061: aastore
      // 062: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 065: athrow
      // 066: invokestatic p_v.a (Loov;)Loov;
      // 069: athrow
      // 06a: aconst_null
      // 06b: astore 8
      // 06d: aload 2
      // 06e: arraylength
      // 06f: bipush 2
      // 070: if_icmplt 080
      // 073: aload 1
      // 074: aload 2
      // 075: bipush 1
      // 076: invokestatic p_v.as_ (Le7r;[Ljava/lang/String;I)Lekw;
      // 079: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 07e: astore 8
      // 080: new b06
      // 083: dup
      // 084: aload 7
      // 086: aconst_null
      // 087: checkcast java/util/Date
      // 08a: aload 1
      // 08b: invokeinterface e7r.noc ()Ljava/lang/String; 1
      // 090: aconst_null
      // 091: checkcast java/util/Date
      // 094: aload 8
      // 096: invokespecial b06.<init> (Lcom/mojang/authlib/GameProfile;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V
      // 099: astore 9
      // 09b: aload 6
      // 09d: invokevirtual vr1.wh3 ()Lwlx;
      // 0a0: invokevirtual wlx.w68 ()Lwxb;
      // 0a3: aload 9
      // 0a5: invokevirtual wxb.g7w (Lsyv;)V
      // 0a8: aload 6
      // 0aa: invokevirtual vr1.wh3 ()Lwlx;
      // 0ad: aload 2
      // 0ae: bipush 0
      // 0af: aaload
      // 0b0: invokevirtual wlx.f_q (Ljava/lang/String;)Lz96;
      // 0b3: astore 10
      // 0b5: aload 10
      // 0b7: iload 5
      // 0b9: ifne 0e4
      // 0bc: ifnull 0e3
      // 0bf: goto 0c6
      // 0c2: invokestatic p_v.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 10
      // 0c8: getfield z96.rhh Lmlk;
      // 0cb: sipush 30241
      // 0ce: ldc2_w 1715600719188394980
      // 0d1: lload 3
      // 0d2: lxor
      // 0d3: invokedynamic x (IJ)Ljava/lang/String; bsm=p_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: nop
      // 0d9: invokevirtual mlk.wr4 (Ljava/lang/String;)V
      // 0dc: goto 0e3
      // 0df: invokestatic p_v.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 1
      // 0e4: aload 0
      // 0e5: sipush 11010
      // 0e8: ldc2_w 5110458949596438210
      // 0eb: lload 3
      // 0ec: lxor
      // 0ed: invokedynamic x (IJ)Ljava/lang/String; bsm=p_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: nop
      // 0f3: bipush 1
      // 0f4: anewarray 70
      // 0f7: dup
      // 0f8: bipush 0
      // 0f9: aload 2
      // 0fa: bipush 0
      // 0fb: aaload
      // 0fc: aastore
      // 0fd: invokestatic p_v.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 100: iload 5
      // 102: ifeq 123
      // 105: new w57
      // 108: dup
      // 109: sipush 23286
      // 10c: ldc2_w 592233987755355953
      // 10f: lload 3
      // 110: lxor
      // 111: invokedynamic x (IJ)Ljava/lang/String; bsm=p_v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: nop
      // 117: bipush 0
      // 118: anewarray 70
      // 11b: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 11e: athrow
      // 11f: invokestatic p_v.a (Loov;)Loov;
      // 122: athrow
      // 123: return
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmplt 2b
      // 10: goto 17
      // 13: invokestatic p_v.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic p_v.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 25: invokestatic p_v.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5464601794258941460L, -8856982477018856569L, MethodHandles.lookup().lookupClass()).a(97322868952011L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 90851676879514L;
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
      String var6 = "]0\u008cÄ©*\u001c,\u0091\u0006ËJ'Í\rý\u0000\u001e%×\u0088¸[ÇÜ'S\u0004Ð\u008d\u0092ëQý\u0012\u0002]¸³\u008a@´\u009a\u0019jÑ\u008dÓgÛk¸ôEÔ\u0084îþ5\bS\u0087\u0016ÅhtiÃBåÛ\u0004\u0018¼1\u001c\u009c·\u0099\fÀ$\u000e\u0092æ¹sý\u001bò\u009fVþõ}¿NwÿÀ\u0017#\u001c\u0097ê(\u0003÷\u0014Î\u008dw[k\u0000È\u0087¸.\u008a\u009asE@Q\u0090q\u0087}\u0082Òp®\\lÞÙAX~H»h¼ë´(\u0089g\u0015ù{hé\u000eìú\u0098r~dx»Ñ*µ×\u009c\u008dÅ¹\u0012/ÿ,ìV<\u0092Y´gVWLÇV";
      int var8 = "]0\u008cÄ©*\u001c,\u0091\u0006ËJ'Í\rý\u0000\u001e%×\u0088¸[ÇÜ'S\u0004Ð\u008d\u0092ëQý\u0012\u0002]¸³\u008a@´\u009a\u0019jÑ\u008dÓgÛk¸ôEÔ\u0084îþ5\bS\u0087\u0016ÅhtiÃBåÛ\u0004\u0018¼1\u001c\u009c·\u0099\fÀ$\u000e\u0092æ¹sý\u001bò\u009fVþõ}¿NwÿÀ\u0017#\u001c\u0097ê(\u0003÷\u0014Î\u008dw[k\u0000È\u0087¸.\u008a\u009asE@Q\u0090q\u0087}\u0082Òp®\\lÞÙAX~H»h¼ë´(\u0089g\u0015ù{hé\u000eìú\u0098r~dx»Ñ*µ×\u009c\u008dÅ¹\u0012/ÿ,ìV<\u0092Y´gVWLÇV"
         .length();
      char var5 = '(';
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

                  var6 = "õ]-úVyR\u000fVéß\u009cf[\u000e¹]Qû!Èæ`g>\u009dÛEÇ\u001d\fj:2\u0080øqc\n²\u0010ÿÎF\u0013¹y\u0000\u0091cöù¸ö2\u000e\u009a";
                  var8 = "õ]-úVyR\u000fVéß\u009cf[\u000e¹]Qû!Èæ`g>\u009dÛEÇ\u001d\fj:2\u0080øqc\n²\u0010ÿÎF\u0013¹y\u0000\u0091cöù¸ö2\u000e\u009a".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22938;
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
            throw new RuntimeException("p_v", var10);
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
         throw new RuntimeException("p_v" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
