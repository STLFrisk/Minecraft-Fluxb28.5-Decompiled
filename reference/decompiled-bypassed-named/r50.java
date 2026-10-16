import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class r50 extends bc_ {
   public static final Pattern t8e;
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 64933549745612L;
      return b<"p">(16680, 1504801614718945012L ^ var1);
   }

   @Override
   public int bag() {
      return 3;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: invokestatic vr1._0v ()Lvr1;
      // 07: invokevirtual vr1.wh3 ()Lwlx;
      // 0a: invokevirtual wlx._rf ()Lo85;
      // 0d: invokevirtual o85.dc3 ()Z
      // 10: iload 2
      // 11: ifne 2a
      // 14: ifeq 3c
      // 17: goto 1e
      // 1a: invokestatic r50.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokespecial bc_.m6l (Le7r;)Z
      // 23: goto 2a
      // 26: invokestatic r50.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 2
      // 2b: ifne 39
      // 2e: ifeq 3c
      // 31: goto 38
      // 34: invokestatic r50.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 59308242762058L;
      return b<"p">(17202, 4877638232638429293L ^ var2);
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
      // 000: getstatic r50.a J
      // 003: ldc2_w 69326021546121
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 1
      // 010: iload 5
      // 012: ifne 02d
      // 015: if_icmplt 100
      // 018: goto 01f
      // 01b: invokestatic r50.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 2
      // 020: bipush 0
      // 021: aaload
      // 022: invokevirtual java/lang/String.length ()I
      // 025: bipush 1
      // 026: goto 02d
      // 029: invokestatic r50.a (Loov;)Loov;
      // 02c: athrow
      // 02d: iload 5
      // 02f: ifne 046
      // 032: if_icmple 100
      // 035: goto 03c
      // 038: invokestatic r50.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 2
      // 03d: arraylength
      // 03e: bipush 2
      // 03f: goto 046
      // 042: invokestatic r50.a (Loov;)Loov;
      // 045: athrow
      // 046: if_icmplt 056
      // 049: aload 1
      // 04a: aload 2
      // 04b: bipush 1
      // 04c: invokestatic r50.as_ (Le7r;[Ljava/lang/String;I)Lekw;
      // 04f: goto 057
      // 052: invokestatic r50.a (Loov;)Loov;
      // 055: athrow
      // 056: aconst_null
      // 057: astore 6
      // 059: getstatic r50.t8e Ljava/util/regex/Pattern;
      // 05c: aload 2
      // 05d: bipush 0
      // 05e: aaload
      // 05f: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 062: astore 7
      // 064: aload 7
      // 066: invokevirtual java/util/regex/Matcher.matches ()Z
      // 069: ifeq 0a0
      // 06c: aload 0
      // 06d: aload 1
      // 06e: aload 2
      // 06f: bipush 0
      // 070: aaload
      // 071: aload 6
      // 073: iload 5
      // 075: ifne 093
      // 078: goto 07f
      // 07b: invokestatic r50.a (Loov;)Loov;
      // 07e: athrow
      // 07f: ifnonnull 091
      // 082: goto 089
      // 085: invokestatic r50.a (Loov;)Loov;
      // 088: athrow
      // 089: aconst_null
      // 08a: goto 098
      // 08d: invokestatic r50.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 6
      // 093: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 098: invokevirtual r50.thn (Le7r;Ljava/lang/String;Ljava/lang/String;)V
      // 09b: iload 5
      // 09d: ifeq 0fb
      // 0a0: invokestatic vr1._0v ()Lvr1;
      // 0a3: invokevirtual vr1.wh3 ()Lwlx;
      // 0a6: aload 2
      // 0a7: bipush 0
      // 0a8: aaload
      // 0a9: invokevirtual wlx.f_q (Ljava/lang/String;)Lz96;
      // 0ac: astore 8
      // 0ae: aload 8
      // 0b0: ifnonnull 0d1
      // 0b3: new iez
      // 0b6: dup
      // 0b7: sipush 8902
      // 0ba: ldc2_w 4273396561292513374
      // 0bd: lload 3
      // 0be: lxor
      // 0bf: invokedynamic p (IJ)Ljava/lang/String; bsm=r50.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: nop
      // 0c5: bipush 0
      // 0c6: anewarray 96
      // 0c9: invokespecial iez.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0cc: athrow
      // 0cd: invokestatic r50.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: aload 8
      // 0d5: invokevirtual z96.zgv ()Ljava/lang/String;
      // 0d8: aload 6
      // 0da: iload 5
      // 0dc: ifne 0f3
      // 0df: ifnonnull 0f1
      // 0e2: goto 0e9
      // 0e5: invokestatic r50.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aconst_null
      // 0ea: goto 0f8
      // 0ed: invokestatic r50.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 6
      // 0f3: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 0f8: invokevirtual r50.thn (Le7r;Ljava/lang/String;Ljava/lang/String;)V
      // 0fb: iload 5
      // 0fd: ifeq 11e
      // 100: new w57
      // 103: dup
      // 104: sipush 972
      // 107: ldc2_w 6267086598896283991
      // 10a: lload 3
      // 10b: lxor
      // 10c: invokedynamic p (IJ)Ljava/lang/String; bsm=r50.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: nop
      // 112: bipush 0
      // 113: anewarray 96
      // 116: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 119: athrow
      // 11a: invokestatic r50.a (Loov;)Loov;
      // 11d: athrow
      // 11e: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpne 2b
      // 10: goto 17
      // 13: invokestatic r50.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic r50.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 25: invokestatic r50.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   public void thn(e7r var1, String var2, String var3) {
      long var4 = a ^ 24646794402675L;
      x6m var7 = new x6m(var2, (Date)null, var1.noc(), (Date)null, var3);
      vr1._0v().wh3()._rf().g7w(var7);
      List var8 = vr1._0v().wh3().ge5(var2);
      String[] var9 = new String[var8.size()];
      int var10000 = OpaquePredicate.b();
      int var10 = 0;
      int var6 = var10000;
      Iterator var11 = var8.iterator();

      while (true) {
         if (var11.hasNext()) {
            z96 var12 = (z96)var11.next();

            try {
               var12.rhh.wr4(b<"p">(21155, 7921252252980915139L ^ var4));
               var9[var10++] = var12.noc();
               if (var6 == 0) {
                  break;
               }

               if (var6 != 0) {
                  continue;
               }
            } catch (oov var14) {
               throw a(var14);
            }
         }

         try {
            if (var8.isEmpty()) {
               wxl(var1, this, b<"p">(24517, 7653688469369202337L ^ var4), new Object[]{var2});
               if (var6 != 0) {
                  return;
               }
            }
            break;
         } catch (oov var13) {
            throw a(var13);
         }
      }

      wxl(var1, this, b<"p">(32432, 4935404559165229015L ^ var4), new Object[]{var2, fgi(var9)});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1206913403236651600L, 8520876452481200485L, MethodHandles.lookup().lookupClass()).a(88974295164686L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 137334005801326L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "ººüÚ\u0005§Ëhþîà\u009d\u009b>° u \u0090tÛÉLý\fäkf\u000e\u001aäÍ.A\rt¦|QÝCB\u007fa\u00915ÀC(·\"·>úÎãû:\u009b´þ\\s\u0089Ê\u0013üÝÖp¥¸\u0011\b^Ëdû°ÏÑ\u0080rßÐËÆ\u009c9È\u0090(Z¤\u0005\u0099\u0007B\u00863ú\\ìÔ_S\u0088\u0004srã(\u009a\u009c¾Þ\u008b»\u0013Û¬\u008b-Ã\u008c\u0004mô)¶WO |Ê\n\u0091ûèr_ÍN¹\u0099'º%\u0004\u001a*|úFF\"¤ï\u001bLðwÈúæ¤Þ\u0001z\u0017¥îjë\u0010;\u0010m´\u008b|W¥veY\u0080~ ª\"\u0010\u007f\u0094¾¸÷\u0006ÇR[4Åå©_ÔÙä¾MI\u0088\u0006\u007f»GcùS¨%¡×ÜµýXjþU¡\u001d\u007f015K3[\u00814¦\u0013ÔáÔ%\u0016uÄ*â-iÇ°\u0011ò*»Gù7\fæ¢ø\u0085\u0081\u008c±Êp\u008f%y/\u0013K\u009b=ëã\u0005¤ZM\u0014â(\u001eGùi(LORöºèÑµ8×ãå\u008f¡2\u001b:ÔG\u0095º\u0092\u0003e\u0007TD\u0081á\u0091Ï±kA\u0003\u0010\u001dL\u0083Ç\u0000Ù\u0019òWÃn;d©y (W\u009d%D\u0007\u009d\u0002+<o¶/Ü®ñ'\u009ah\"^^z\u0094wêÓ§Ü\u0011TÜÀïd~ëÏ=ëÖ";
      int var6 = "ººüÚ\u0005§Ëhþîà\u009d\u009b>° u \u0090tÛÉLý\fäkf\u000e\u001aäÍ.A\rt¦|QÝCB\u007fa\u00915ÀC(·\"·>úÎãû:\u009b´þ\\s\u0089Ê\u0013üÝÖp¥¸\u0011\b^Ëdû°ÏÑ\u0080rßÐËÆ\u009c9È\u0090(Z¤\u0005\u0099\u0007B\u00863ú\\ìÔ_S\u0088\u0004srã(\u009a\u009c¾Þ\u008b»\u0013Û¬\u008b-Ã\u008c\u0004mô)¶WO |Ê\n\u0091ûèr_ÍN¹\u0099'º%\u0004\u001a*|úFF\"¤ï\u001bLðwÈúæ¤Þ\u0001z\u0017¥îjë\u0010;\u0010m´\u008b|W¥veY\u0080~ ª\"\u0010\u007f\u0094¾¸÷\u0006ÇR[4Åå©_ÔÙä¾MI\u0088\u0006\u007f»GcùS¨%¡×ÜµýXjþU¡\u001d\u007f015K3[\u00814¦\u0013ÔáÔ%\u0016uÄ*â-iÇ°\u0011ò*»Gù7\fæ¢ø\u0085\u0081\u008c±Êp\u008f%y/\u0013K\u009b=ëã\u0005¤ZM\u0014â(\u001eGùi(LORöºèÑµ8×ãå\u008f¡2\u001b:ÔG\u0095º\u0092\u0003e\u0007TD\u0081á\u0091Ï±kA\u0003\u0010\u001dL\u0083Ç\u0000Ù\u0019òWÃn;d©y (W\u009d%D\u0007\u009d\u0002+<o¶/Ü®ñ'\u009ah\"^^z\u0094wêÓ§Ü\u0011TÜÀïd~ëÏ=ëÖ"
         .length();
      char var3 = '0';
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
                     c = var7;
                     g = new String[8];
                     t8e = Pattern.compile(b<"p">(5758, 8545137342510535942L ^ var9));
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

                  var4 = "ë:E¨\u0012ßH*\u008d²\u0017\u0004d|\u0097\u001a\u0098g6\u009b©¯Ö7q\u0018\u007f§w\u0099ø°;\u0016+\u0098ä¿Ô\u008b8`R#¶>gi\u0081\u001f\u00952`Ý\f\u0095bù\u001dç\u0084ñ\u008bÀly@Ì\u0091j%¡5IëÑÁA)Àu\u0015AÑc\r¥FÜÁm\u0013:¸2éÍ";
                  var6 = "ë:E¨\u0012ßH*\u008d²\u0017\u0004d|\u0097\u001a\u0098g6\u009b©¯Ö7q\u0018\u007f§w\u0099ø°;\u0016+\u0098ä¿Ô\u008b8`R#¶>gi\u0081\u001f\u00952`Ý\f\u0095bù\u001dç\u0084ñ\u008bÀly@Ì\u0091j%¡5IëÑÁA)Àu\u0015AÑc\r¥FÜÁm\u0013:¸2éÍ"
                     .length();
                  var3 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24259;
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
            throw new RuntimeException("r50", var10);
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
         throw new RuntimeException("r50" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
