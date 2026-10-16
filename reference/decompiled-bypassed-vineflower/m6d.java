import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class m6d {
   public static final w9p t9k;
   public static final w9p wg4;
   public static final w9p nen;
   public static final w9p w7i;
   public static final w9p y3f;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static qhg sng(osd var0) {
      qhg var2 = new qhg();
      int var10000 = t9d.b();
      Iterator var3 = var0.vz0().iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            _4o var4 = (_4o)var3.next();

            try {
               var6 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.w2j(nco(var4));
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

   private static bdo nco(_4o param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic m6d.a J
      // 03: ldc2_w 139714581763754
      // 06: lxor
      // 07: lstore 1
      // 08: new bdo
      // 0b: dup
      // 0c: invokespecial bdo.<init> ()V
      // 0f: astore 4
      // 11: invokestatic t9d.c ()I
      // 14: aload 0
      // 15: invokeinterface _4o.vyz ()Lw9p; 1
      // 1a: astore 5
      // 1c: istore 3
      // 1d: aload 4
      // 1f: sipush 3632
      // 22: ldc2_w 8460831866950354448
      // 25: lload 1
      // 26: lxor
      // 27: invokedynamic d (IJ)Ljava/lang/String; bsm=m6d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: nop
      // 2d: aload 5
      // 2f: invokeinterface w9p.ugh ()Ljava/lang/String; 1
      // 34: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 37: aload 4
      // 39: sipush 12942
      // 3c: ldc2_w 8587936216887278243
      // 3f: lload 1
      // 40: lxor
      // 41: invokedynamic d (IJ)Ljava/lang/String; bsm=m6d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: aload 0
      // 48: invokeinterface _4o.zdx ()D 1
      // 4d: invokevirtual bdo.von (Ljava/lang/String;D)V
      // 50: aload 0
      // 51: invokeinterface _4o.mid ()Ljava/util/Collection; 1
      // 56: astore 6
      // 58: aload 6
      // 5a: iload 3
      // 5b: ifne 6a
      // 5e: ifnull d7
      // 61: goto 68
      // 64: invokestatic m6d.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 6
      // 6a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 6f: ifne d7
      // 72: new qhg
      // 75: dup
      // 76: invokespecial qhg.<init> ()V
      // 79: astore 7
      // 7b: aload 6
      // 7d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 82: astore 8
      // 84: aload 8
      // 86: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8b: ifeq c2
      // 8e: aload 8
      // 90: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 95: checkcast xk5
      // 98: astore 9
      // 9a: iload 3
      // 9b: ifne d7
      // 9e: aload 9
      // a0: invokevirtual xk5.aik ()Z
      // a3: ifeq be
      // a6: goto ad
      // a9: invokestatic m6d.a (Loov;)Loov;
      // ac: athrow
      // ad: aload 7
      // af: aload 9
      // b1: invokestatic m6d.vtj (Lxk5;)Lbdo;
      // b4: invokevirtual qhg.w2j (Lgdw;)V
      // b7: goto be
      // ba: invokestatic m6d.a (Loov;)Loov;
      // bd: athrow
      // be: iload 3
      // bf: ifeq 84
      // c2: aload 4
      // c4: sipush 7736
      // c7: ldc2_w 5888860211470734877
      // ca: lload 1
      // cb: lxor
      // cc: invokedynamic d (IJ)Ljava/lang/String; bsm=m6d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: nop
      // d2: aload 7
      // d4: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // d7: aload 4
      // d9: areturn
   }

   private static bdo vtj(xk5 var0) {
      long var1 = a ^ 102487633743835L;
      bdo var3 = new bdo();
      var3.rjq(a<"d">(31418, 8284042662917843963L ^ var1), var0.jhj());
      var3.von(a<"d">(30291, 7644176448941008661L ^ var1), var0._2u());
      var3.iin(a<"d">(23773, 8863229762939784597L ^ var1), var0.zdp());
      var3.xw9(a<"d">(25117, 5407562559616758623L ^ var1), var0.gac().getMostSignificantBits());
      var3.xw9(a<"d">(5517, 8202149390788871387L ^ var1), var0.gac().getLeastSignificantBits());
      return var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static void zig(osd var0, qhg var1) {
      long var2 = a ^ 38797705065246L;
      int var4 = t9d.b();
      int var5 = 0;

      while (var5 < var1.vek()) {
         bdo var6 = var1.kd6(var5);
         _4o var7 = var0.srq(var6.u14(a<"d">(3632, 8460774522738975652L ^ var2)));

         label53: {
            label41: {
               _4o var10000;
               label40: {
                  try {
                     var10000 = var7;
                     if (var4 == 0) {
                        break label40;
                     }

                     if (var7 == null) {
                        break label41;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  var10000 = var7;
               }

               try {
                  iqv(var10000, var6);
                  if (var4 != 0) {
                     break label53;
                  }
               } catch (oov var9) {
                  boolean var10001 = false;
                  throw a(var9);
               }
            }

            try {
               gj5.warn(a<"d">(16880, 2845164043903364192L ^ var2) + var6.u14(a<"d">(3632, 8460774522738975652L ^ var2)) + "'");
            } catch (oov var8) {
               boolean var12 = false;
               throw a(var8);
            }
         }

         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   private static void iqv(_4o param0, bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic m6d.a J
      // 03: ldc2_w 62282679519220
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: sipush 31674
      // 12: ldc2_w 2227245455547425502
      // 15: lload 2
      // 16: lxor
      // 17: invokedynamic d (IJ)Ljava/lang/String; bsm=m6d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: nop
      // 1d: invokevirtual bdo.m9p (Ljava/lang/String;)D
      // 20: invokeinterface _4o.zf7 (D)V 3
      // 25: aload 1
      // 26: sipush 715
      // 29: ldc2_w 7873334287981517729
      // 2c: lload 2
      // 2d: lxor
      // 2e: invokedynamic d (IJ)Ljava/lang/String; bsm=m6d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: nop
      // 34: bipush 9
      // 36: iload 4
      // 38: ifne 60
      // 3b: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 3e: ifeq c0
      // 41: goto 48
      // 44: invokestatic m6d.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 1
      // 49: sipush 7736
      // 4c: ldc2_w 5888782646470510403
      // 4f: lload 2
      // 50: lxor
      // 51: invokedynamic d (IJ)Ljava/lang/String; bsm=m6d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: nop
      // 57: bipush 10
      // 59: goto 60
      // 5c: invokestatic m6d.a (Loov;)Loov;
      // 5f: athrow
      // 60: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 63: astore 5
      // 65: bipush 0
      // 66: istore 6
      // 68: iload 6
      // 6a: aload 5
      // 6c: invokevirtual qhg.vek ()I
      // 6f: if_icmpge c0
      // 72: aload 5
      // 74: iload 6
      // 76: invokevirtual qhg.kd6 (I)Lbdo;
      // 79: invokestatic m6d.e2f (Lbdo;)Lxk5;
      // 7c: astore 7
      // 7e: iload 4
      // 80: ifne bb
      // 83: aload 7
      // 85: ifnull b8
      // 88: goto 8f
      // 8b: invokestatic m6d.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 0
      // 90: aload 7
      // 92: invokevirtual xk5.gac ()Ljava/util/UUID;
      // 95: invokeinterface _4o.aq3 (Ljava/util/UUID;)Lxk5; 2
      // 9a: astore 8
      // 9c: aload 8
      // 9e: ifnull b0
      // a1: aload 0
      // a2: aload 8
      // a4: invokeinterface _4o.se8 (Lxk5;)V 2
      // a9: goto b0
      // ac: invokestatic m6d.a (Loov;)Loov;
      // af: athrow
      // b0: aload 0
      // b1: aload 7
      // b3: invokeinterface _4o.vcr (Lxk5;)V 2
      // b8: iinc 6 1
      // bb: iload 4
      // bd: ifeq 68
      // c0: return
   }

   public static xk5 e2f(bdo var0) {
      long var1 = a ^ 67814101747874L;
      UUID var3 = new UUID(var0.yn0(a<"d">(18520, 5023336637887667810L ^ var1)), var0.yn0(a<"d">(7914, 7049656858468059351L ^ var1)));

      try {
         return new xk5(
            var3,
            var0.u14(a<"d">(3632, 8460763405619795992L ^ var1)),
            var0.m9p(a<"d">(22927, 4017533149985558449L ^ var1)),
            var0.uz7(a<"d">(10866, 6392946870811671643L ^ var1))
         );
      } catch (Exception var5) {
         gj5.warn(a<"d">(11840, 9135698991426943097L ^ var1) + var5.getMessage());
         return null;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(284270995702007188L, -5957776986747769246L, MethodHandles.lookup().lookupClass()).a(7119892231747L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 121328274287569L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[25];
      int var5 = 0;
      String var4 = "\u0091þ'Fÿ\u0082©\u009b muì'\u0097Ù\u0087\u0086È±\u0003\u0007¬ÁF(ê\\¬\u0088l@È\u0018ÚÕq\u0085)ó50\u0094\u00837n=²«Oß©÷!(áçÝ\u0010¶°\\Ta\u001c¯ðÐS& ñÑ\b\u0006\u0010\u008b\u0094qù©øÓs*©¹\u009c)%\u0015b8Çð\b¥Ö²\u00969d \u009bE©ïýô^µ:é~Áð{~ÄÈ\u008a³¼\u0002*Ùi!:î-\u0019]\tÒ\\=\u0010D\u009bº×\u0007\u0088þ§GÝ*\u0010à·P3öÊZAÑ]G\u0013ÞRªt\u0018ÿ¸%ä\u0083-\u008e\bt¹\u0000ª\u0092\u008d\u0098\u0001d´5æ@ÇCå\u0018|b\u001e¸^-b¬Ð£~\u0099-6\u0016\u001a\f§BË:?<ó(\u0081éäïéÇ\u00044í_ªz\u009c!î´ÑAö \u009f&\u0091FÈ\u0082é¼ß³K1r\u0091ÖFä¦tU Ò×,ú¨5\u009b\u0018\u001eåT \u008eÄMz2æU\u0006\f¤é·\u000bP<\u0018:(Â\u009a À\u008a?bV¦ò³H/\u0004qXå]O1\n\tk\u0010\u0005\u0016\bü´¯s\u0099ÛX\u0086 6\u0019k9ej\u0015#\u0083-ÞR`3\nö\u008b\u0002Ü*ò,Ò¥\u0005ëCUÜ#çt \u0090t\u0011¥Ò\u001a\u009c\u009füÄõ=ü\\>}V\u0086>1tZî!=\u001dÑ>F#ë10t]T¡_\r½*ú'ª\u0099\u0096à[ô&Z].²{\u0082êÅ$êµÐ3ÐÀÙcþ\u0002\"Ò¹\u001b¨Ã÷$õ\u0096E\u001b Eù.Á\u009b/_7éª(cg¤rE¶\u0088'Aö³é\\ðúÍ4\u009d®ó\u007f\u0010\u0002\u001foVÎ\u0016\\x\u0016ÊôýLe\"a\u0018fH\u0083¶8ÚÐ÷éõy\u0091vdm5\u008c.)ÿï\u008aa\u001e8ôýlræ7\u009aÖ²\\\u0094\u0003¾\u0019¢r¶â\u000e¯9ü/\u0099\u0081í¿ù\u0012¡¹µ9:zo¡uI!(×U\u0090w&\u008f³.E½\u009e\u008c¶Ö4 ±m»ç\u0001\u0013\u001eÕ|¾¼Å`ý¹Ï\u0014\u0085\u008c\u0092\u0093«,\u0090ù\u0082û;ÄÅe)(\u008eBå|N\u008fëì\fA'\u0014#\\½Ø]\u0081ée\u0014\u0005È:»Á¸²Ïv¸wµ\u009e/\u0012wë\u001b\u0083\u0018&\u0086ól Åg\b@x¯µ+È¯!5³\u000b\u0089b¬y¥\u0010\u0098\u009d;\u0097\u0088\u001fv\n#\u0097£\u0018Ë½ÿ\u0088(¯wù\u0015¼\u008c\u008cdKÛ ò[h\u009bðÌ#ÈÞ³Îl-àJ¤ê\u0081sÈ\u0011ê¡\u0089ïzø¼<";
      int var6 = "\u0091þ'Fÿ\u0082©\u009b muì'\u0097Ù\u0087\u0086È±\u0003\u0007¬ÁF(ê\\¬\u0088l@È\u0018ÚÕq\u0085)ó50\u0094\u00837n=²«Oß©÷!(áçÝ\u0010¶°\\Ta\u001c¯ðÐS& ñÑ\b\u0006\u0010\u008b\u0094qù©øÓs*©¹\u009c)%\u0015b8Çð\b¥Ö²\u00969d \u009bE©ïýô^µ:é~Áð{~ÄÈ\u008a³¼\u0002*Ùi!:î-\u0019]\tÒ\\=\u0010D\u009bº×\u0007\u0088þ§GÝ*\u0010à·P3öÊZAÑ]G\u0013ÞRªt\u0018ÿ¸%ä\u0083-\u008e\bt¹\u0000ª\u0092\u008d\u0098\u0001d´5æ@ÇCå\u0018|b\u001e¸^-b¬Ð£~\u0099-6\u0016\u001a\f§BË:?<ó(\u0081éäïéÇ\u00044í_ªz\u009c!î´ÑAö \u009f&\u0091FÈ\u0082é¼ß³K1r\u0091ÖFä¦tU Ò×,ú¨5\u009b\u0018\u001eåT \u008eÄMz2æU\u0006\f¤é·\u000bP<\u0018:(Â\u009a À\u008a?bV¦ò³H/\u0004qXå]O1\n\tk\u0010\u0005\u0016\bü´¯s\u0099ÛX\u0086 6\u0019k9ej\u0015#\u0083-ÞR`3\nö\u008b\u0002Ü*ò,Ò¥\u0005ëCUÜ#çt \u0090t\u0011¥Ò\u001a\u009c\u009füÄõ=ü\\>}V\u0086>1tZî!=\u001dÑ>F#ë10t]T¡_\r½*ú'ª\u0099\u0096à[ô&Z].²{\u0082êÅ$êµÐ3ÐÀÙcþ\u0002\"Ò¹\u001b¨Ã÷$õ\u0096E\u001b Eù.Á\u009b/_7éª(cg¤rE¶\u0088'Aö³é\\ðúÍ4\u009d®ó\u007f\u0010\u0002\u001foVÎ\u0016\\x\u0016ÊôýLe\"a\u0018fH\u0083¶8ÚÐ÷éõy\u0091vdm5\u008c.)ÿï\u008aa\u001e8ôýlræ7\u009aÖ²\\\u0094\u0003¾\u0019¢r¶â\u000e¯9ü/\u0099\u0081í¿ù\u0012¡¹µ9:zo¡uI!(×U\u0090w&\u008f³.E½\u009e\u008c¶Ö4 ±m»ç\u0001\u0013\u001eÕ|¾¼Å`ý¹Ï\u0014\u0085\u008c\u0092\u0093«,\u0090ù\u0082û;ÄÅe)(\u008eBå|N\u008fëì\fA'\u0014#\\½Ø]\u0081ée\u0014\u0005È:»Á¸²Ïv¸wµ\u009e/\u0012wë\u001b\u0083\u0018&\u0086ól Åg\b@x¯µ+È¯!5³\u000b\u0089b¬y¥\u0010\u0098\u009d;\u0097\u0088\u001fv\n#\u0097£\u0018Ë½ÿ\u0088(¯wù\u0015¼\u008c\u008cdKÛ ò[h\u009bðÌ#ÈÞ³Îl-àJ¤ê\u0081sÈ\u0011ê¡\u0089ïzø¼<"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[25];
                     gj5 = LogManager.getLogger();
                     t9k = new oik((w9p)null, a<"d">(16016, 6989215988196707277L ^ var9), 20.0, 0.0, 1024.0)
                        .c3y(a<"d">(4437, 6967152497667351568L ^ var9))
                        .g6f(true);
                     wg4 = new oik((w9p)null, a<"d">(12167, 8690617979115608798L ^ var9), 32.0, 0.0, 2048.0).c3y(a<"d">(20797, 6349149084604523642L ^ var9));
                     nen = new oik((w9p)null, a<"d">(11674, 5652730223334070489L ^ var9), 0.0, 0.0, 1.0).c3y(a<"d">(1887, 4043681826718790175L ^ var9));
                     w7i = new oik((w9p)null, a<"d">(21666, 4055890871130513892L ^ var9), 0.7F, 0.0, 1024.0)
                        .c3y(a<"d">(3775, 5288425253322603515L ^ var9))
                        .g6f(true);
                     y3f = new oik((w9p)null, a<"d">(32536, 961145714956814912L ^ var9), 2.0, 0.0, 2048.0);
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

                  var4 = "çòÝxg÷§uÙ\u0088¯Èa\u0083Ì¬ÝU+ARÂMÈ\u009aÁ,Ë\u007f\u0089ü\u0095\u0096PcA\u0010êó0\u0010ô Wk\u008fHÕ\u0089\u0017\u0006\u008e\u009aU%ÌÚ";
                  var6 = "çòÝxg÷§uÙ\u0088¯Èa\u0083Ì¬ÝU+ARÂMÈ\u009aÁ,Ë\u007f\u0089ü\u0095\u0096PcA\u0010êó0\u0010ô Wk\u008fHÕ\u0089\u0017\u0006\u008e\u009aU%ÌÚ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28620;
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
            throw new RuntimeException("m6d", var10);
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
         throw new RuntimeException("m6d" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
