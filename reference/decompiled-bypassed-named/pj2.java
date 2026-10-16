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

public class pj2 {
   public boolean lez;
   public boolean wzx;
   public boolean wvp;
   public boolean g40;
   public boolean x4a = true;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void e9k(bdo var1) {
      long var2 = a ^ 96782903730164L;
      bdo var4 = new bdo();
      var4.zyu(a<"l">(20172, 8799599231261251138L ^ var2), this.lez);
      var4.zyu(a<"l">(18150, 1677191303167516269L ^ var2), this.wzx);
      var4.zyu(a<"l">(21535, 868209372417264787L ^ var2), this.wvp);
      var4.zyu(a<"l">(18325, 3469944445367361296L ^ var2), this.g40);
      var4.zyu(a<"l">(7036, 7328953953145537521L ^ var2), this.x4a);
      var4._i9(a<"l">(5190, 2921636016056356038L ^ var2), this.gf1);
      var4._i9(a<"l">(32524, 6415547728985335686L ^ var2), this.uy6);
      var1.rzm(a<"l">(27491, 6429721719549408236L ^ var2), var4);
   }

   public void q9u(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic pj2.a J
      // 003: ldc2_w 17591843205789
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: sipush 22485
      // 011: ldc2_w 2676948153895379508
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: iload 4
      // 01e: ifeq 046
      // 021: bipush 10
      // 023: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 026: ifeq 135
      // 029: goto 030
      // 02c: invokestatic pj2.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 1
      // 031: sipush 27491
      // 034: ldc2_w 6429629743310790277
      // 037: lload 2
      // 038: lxor
      // 039: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: nop
      // 03f: goto 046
      // 042: invokestatic pj2.a (Loov;)Loov;
      // 045: athrow
      // 046: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 049: astore 5
      // 04b: aload 0
      // 04c: aload 5
      // 04e: sipush 12227
      // 051: ldc2_w 428755414059162153
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: nop
      // 05c: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 05f: putfield pj2.lez Z
      // 062: aload 0
      // 063: aload 5
      // 065: sipush 21440
      // 068: ldc2_w 8325003358743389741
      // 06b: lload 2
      // 06c: lxor
      // 06d: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: nop
      // 073: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 076: putfield pj2.wzx Z
      // 079: aload 0
      // 07a: aload 5
      // 07c: sipush 15106
      // 07f: ldc2_w 5965416561748381418
      // 082: lload 2
      // 083: lxor
      // 084: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: nop
      // 08a: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 08d: putfield pj2.wvp Z
      // 090: aload 0
      // 091: aload 5
      // 093: sipush 9997
      // 096: ldc2_w 6272879006013887206
      // 099: lload 2
      // 09a: lxor
      // 09b: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: nop
      // 0a1: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 0a4: putfield pj2.g40 Z
      // 0a7: aload 5
      // 0a9: sipush 2499
      // 0ac: ldc2_w 1878568784598678573
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: nop
      // 0b7: bipush 99
      // 0b9: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0bc: iload 4
      // 0be: ifeq 114
      // 0c1: ifeq 100
      // 0c4: goto 0cb
      // 0c7: invokestatic pj2.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: aload 5
      // 0ce: sipush 5190
      // 0d1: ldc2_w 2921687734526321071
      // 0d4: lload 2
      // 0d5: lxor
      // 0d6: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: nop
      // 0dc: invokevirtual bdo.blg (Ljava/lang/String;)F
      // 0df: putfield pj2.gf1 F
      // 0e2: aload 0
      // 0e3: aload 5
      // 0e5: sipush 31835
      // 0e8: ldc2_w 4578543226083527092
      // 0eb: lload 2
      // 0ec: lxor
      // 0ed: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: nop
      // 0f3: invokevirtual bdo.blg (Ljava/lang/String;)F
      // 0f6: putfield pj2.uy6 F
      // 0f9: goto 100
      // 0fc: invokestatic pj2.a (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 5
      // 102: sipush 10828
      // 105: ldc2_w 8704025070668488620
      // 108: lload 2
      // 109: lxor
      // 10a: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: nop
      // 110: bipush 1
      // 111: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 114: ifeq 135
      // 117: aload 0
      // 118: aload 5
      // 11a: sipush 7036
      // 11d: ldc2_w 7329040168657563288
      // 120: lload 2
      // 121: lxor
      // 122: invokedynamic l (IJ)Ljava/lang/String; bsm=pj2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: nop
      // 128: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 12b: putfield pj2.x4a Z
      // 12e: goto 135
      // 131: invokestatic pj2.a (Loov;)Loov;
      // 134: athrow
      // 135: return
   }

   public float eay() {
      return this.gf1;
   }

   public void e7s(float var1) {
      this.gf1 = var1;
   }

   public float wjr() {
      return this.uy6;
   }

   public void ftd(float var1) {
      this.uy6 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5875046110969215577L, 7721667290833616442L, MethodHandles.lookup().lookupClass()).a(78304825311836L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 133926305994696L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[16];
      int var7 = 0;
      String var6 = "ã¶\u0085:³ó\u0001.Ô°B\u0099n\f\u0006öWÝ\u0013\u0000\u009cñJ\u001b#®\u008bjé\u001c\u009cg êE#;\u008e\beNÅvÇ]û2ð\"Ð©Ä;þäó¬µêÖP\u008a¨\u0004i\u0018N-8(á\u0000\u0081òg¶Í\u0005\u0097\u0099YéyB\t\u0091_OoÚ\u0010£¸Y\u0005Ò\"sÚ1\u0001¢ô.\u0088×%\u0018\u0089KÝH\u0003\u0094é\u0015}\u0084S§ÿ\u0013íyã}\u008eT\u0082Ê®Ó\u0018\u001ccaÂxâòr¿\u0087¦T\u0089É3!\u0003\u0097³ÏÕ\u0015Æy\u0010{)÷Ñü9wXSåj©Ë$ïh ~\u000bs\u0084\n:\u00882 ©\u0096\u008eá7eüÿ\u0092QÄá·Ó>=ø\u008býå<u4 \to.-²¨\u0016\u0017\u007f\fÙ-³Ø¦â$\u00894VG\u00adÙ\u008coÏa@\u0096æÁº 1)\u00169\u001a¥dC\u008a\u009fFbº\u0091Ñ\u007fæ°ÝÒf¤¸Ö .\u0018\u0092\u0097Úè\u0016\u0018\u00110á?âOUÁÖõb\u001b¸Î\u0083fXdÈqoL\u00adï\u0010\u009b°\u001c\u001dÀ\u0087ùÎ×M Ç¥\u007fñ^\u0010£.Gó9À'\u0094¹/lw¤\u0098ÄÎ \u0092\u009dÍq\u000f]5Ù¾<yÌi\u009e\u0089ýOnÏ\u008d\u009a»\u0000° \u0011me\u009f%{.";
      int var8 = "ã¶\u0085:³ó\u0001.Ô°B\u0099n\f\u0006öWÝ\u0013\u0000\u009cñJ\u001b#®\u008bjé\u001c\u009cg êE#;\u008e\beNÅvÇ]û2ð\"Ð©Ä;þäó¬µêÖP\u008a¨\u0004i\u0018N-8(á\u0000\u0081òg¶Í\u0005\u0097\u0099YéyB\t\u0091_OoÚ\u0010£¸Y\u0005Ò\"sÚ1\u0001¢ô.\u0088×%\u0018\u0089KÝH\u0003\u0094é\u0015}\u0084S§ÿ\u0013íyã}\u008eT\u0082Ê®Ó\u0018\u001ccaÂxâòr¿\u0087¦T\u0089É3!\u0003\u0097³ÏÕ\u0015Æy\u0010{)÷Ñü9wXSåj©Ë$ïh ~\u000bs\u0084\n:\u00882 ©\u0096\u008eá7eüÿ\u0092QÄá·Ó>=ø\u008býå<u4 \to.-²¨\u0016\u0017\u007f\fÙ-³Ø¦â$\u00894VG\u00adÙ\u008coÏa@\u0096æÁº 1)\u00169\u001a¥dC\u008a\u009fFbº\u0091Ñ\u007fæ°ÝÒf¤¸Ö .\u0018\u0092\u0097Úè\u0016\u0018\u00110á?âOUÁÖõb\u001b¸Î\u0083fXdÈqoL\u00adï\u0010\u009b°\u001c\u001dÀ\u0087ùÎ×M Ç¥\u007fñ^\u0010£.Gó9À'\u0094¹/lw¤\u0098ÄÎ \u0092\u009dÍq\u000f]5Ù¾<yÌi\u009e\u0089ýOnÏ\u008d\u009a»\u0000° \u0011me\u009f%{."
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[16];
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

                  var6 = "\u001b\u0007)¤4cV\"Y[!38_æk\u009dä*#û¤\u008a\u001c\tñikÕ\u0013ª9 >\u008fO\u000egg;¶\u0018r^ÏáB($\u0088PJËÍFBå\u001a}@cJ\u0080»@";
                  var8 = "\u001b\u0007)¤4cV\"Y[!38_æk\u009dä*#û¤\u008a\u001c\tñikÕ\u0013ª9 >\u008fO\u000egg;¶\u0018r^ÏáB($\u0088PJËÍFBå\u001a}@cJ\u0080»@"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27790;
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
            throw new RuntimeException("pj2", var10);
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
         throw new RuntimeException("pj2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
