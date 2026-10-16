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

public class ejf extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 92785899232915L;
      return b<"e">(1456, 8695976861006924883L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 99630977581589L;
      return b<"e">(20945, 7080878370850145457L ^ var2);
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
      // 000: getstatic ejf.a J
      // 003: ldc2_w 88376927169494
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 2
      // 010: if_icmpge 031
      // 013: new w57
      // 016: dup
      // 017: sipush 7614
      // 01a: ldc2_w 8373113986840322329
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic e (IJ)Ljava/lang/String; bsm=ejf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 32
      // 029: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02c: athrow
      // 02d: invokestatic ejf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: aload 2
      // 033: bipush 0
      // 034: aaload
      // 035: invokestatic ejf.kot (Le7r;Ljava/lang/String;)Li2h;
      // 038: astore 6
      // 03a: aload 6
      // 03c: instanceof ha9
      // 03f: ifeq 068
      // 042: new uvb
      // 045: dup
      // 046: sipush 25115
      // 049: ldc2_w 3732639530376961726
      // 04c: lload 3
      // 04d: lxor
      // 04e: invokedynamic e (IJ)Ljava/lang/String; bsm=ejf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: nop
      // 054: bipush 1
      // 055: anewarray 32
      // 058: dup
      // 059: bipush 0
      // 05a: aload 6
      // 05c: invokevirtual i2h.xyw ()Lekw;
      // 05f: aastore
      // 060: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 063: athrow
      // 064: invokestatic ejf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: new bdo
      // 06b: dup
      // 06c: invokespecial bdo.<init> ()V
      // 06f: astore 7
      // 071: aload 6
      // 073: aload 7
      // 075: invokevirtual i2h.c97 (Lbdo;)V
      // 078: aload 7
      // 07a: invokevirtual bdo.h33 ()Lgdw;
      // 07d: checkcast bdo
      // 080: astore 8
      // 082: aload 1
      // 083: aload 2
      // 084: bipush 1
      // 085: invokestatic ejf.as_ (Le7r;[Ljava/lang/String;I)Lekw;
      // 088: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 08d: invokestatic sza.mft (Ljava/lang/String;)Lbdo;
      // 090: astore 9
      // 092: goto 0b9
      // 095: astore 10
      // 097: new uvb
      // 09a: dup
      // 09b: sipush 24296
      // 09e: ldc2_w 764989361136443968
      // 0a1: lload 3
      // 0a2: lxor
      // 0a3: invokedynamic e (IJ)Ljava/lang/String; bsm=ejf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: nop
      // 0a9: bipush 1
      // 0aa: anewarray 32
      // 0ad: dup
      // 0ae: bipush 0
      // 0af: aload 10
      // 0b1: invokevirtual npr.getMessage ()Ljava/lang/String;
      // 0b4: aastore
      // 0b5: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0b8: athrow
      // 0b9: aload 9
      // 0bb: sipush 17384
      // 0be: ldc2_w 7239942130225069897
      // 0c1: lload 3
      // 0c2: lxor
      // 0c3: invokedynamic e (IJ)Ljava/lang/String; bsm=ejf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: nop
      // 0c9: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 0cc: aload 9
      // 0ce: sipush 20125
      // 0d1: ldc2_w 588791937977954877
      // 0d4: lload 3
      // 0d5: lxor
      // 0d6: invokedynamic e (IJ)Ljava/lang/String; bsm=ejf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: nop
      // 0dc: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 0df: aload 7
      // 0e1: aload 9
      // 0e3: invokevirtual bdo.uhv (Lbdo;)V
      // 0e6: iload 5
      // 0e8: ifne 148
      // 0eb: aload 7
      // 0ed: aload 8
      // 0ef: invokevirtual bdo.equals (Ljava/lang/Object;)Z
      // 0f2: ifeq 122
      // 0f5: goto 0fc
      // 0f8: invokestatic ejf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: new uvb
      // 0ff: dup
      // 100: sipush 8948
      // 103: ldc2_w 7868768176072416854
      // 106: lload 3
      // 107: lxor
      // 108: invokedynamic e (IJ)Ljava/lang/String; bsm=ejf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: nop
      // 10e: bipush 1
      // 10f: anewarray 32
      // 112: dup
      // 113: bipush 0
      // 114: aload 7
      // 116: invokevirtual bdo.toString ()Ljava/lang/String;
      // 119: aastore
      // 11a: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 11d: athrow
      // 11e: invokestatic ejf.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: aload 6
      // 124: aload 7
      // 126: invokevirtual i2h.a1f (Lbdo;)V
      // 129: aload 1
      // 12a: aload 0
      // 12b: sipush 24107
      // 12e: ldc2_w 5424358995978691215
      // 131: lload 3
      // 132: lxor
      // 133: invokedynamic e (IJ)Ljava/lang/String; bsm=ejf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: nop
      // 139: bipush 1
      // 13a: anewarray 32
      // 13d: dup
      // 13e: bipush 0
      // 13f: aload 7
      // 141: invokevirtual bdo.toString ()Ljava/lang/String;
      // 144: aastore
      // 145: invokestatic ejf.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 148: return
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.b();

      try {
         if (var3 == 0) {
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
      long var10000 = c.a(272531482271976320L, -3543008302804924797L, MethodHandles.lookup().lookupClass()).a(122217035165719L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130749474140969L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u001015½SÖõSíZó¦.Îè\u001aÂYý\u009b\u0096\u0005X\u009d¬÷|)m\u0098\u009bë aW-F\u008fuíC9cÓ9DÄÎýÊ\u0092u\u009cPöÓÝ\t*¤²\u0014ìyå0R¾\u0093Ù\u0094\u0006â¯È]~\u0091n\u0001\u009bv;\u0098=®\u0093Ýè\\ÙA@\u0003;2cdQÛ1\u0012\u001b£v\u00897ÚÀÔwÛåÌ8ú^V5®<\u0006\u001aÁï:\u0013M\u0096P9\t\u0098qI@ó5\u0093#&\u000f|;¹\u0010È\u0007N<O*t\u009bz?ü\u001fud\u0003ý¢Â\u0085\u0088\u000f\u0097\u0082G\u00120á_µxO:¯û\u008dÃöì ´\u0016\u0010·¬\u0004\u001fBÀ'ÛÿàÇÉæPÕÐ¾®T?ãò©NÖ¿²àØ8Gý8òø<dYð¾£iÊ2§µ±\u000eEªcðD1\u0010\u008a|çÞ\bÇ`Mc\fG\u0001o$h\u009a°(üçl\u0019ÈÑt\u0017+9\u0093°ÿ\u0018l4 Ð\"q\u0015*T_çN¤²á\u001c?ºfmP¨®Ô*\u001eªl\u0087ÉzºÉ\u009en";
      int var8 = "\u001015½SÖõSíZó¦.Îè\u001aÂYý\u009b\u0096\u0005X\u009d¬÷|)m\u0098\u009bë aW-F\u008fuíC9cÓ9DÄÎýÊ\u0092u\u009cPöÓÝ\t*¤²\u0014ìyå0R¾\u0093Ù\u0094\u0006â¯È]~\u0091n\u0001\u009bv;\u0098=®\u0093Ýè\\ÙA@\u0003;2cdQÛ1\u0012\u001b£v\u00897ÚÀÔwÛåÌ8ú^V5®<\u0006\u001aÁï:\u0013M\u0096P9\t\u0098qI@ó5\u0093#&\u000f|;¹\u0010È\u0007N<O*t\u009bz?ü\u001fud\u0003ý¢Â\u0085\u0088\u000f\u0097\u0082G\u00120á_µxO:¯û\u008dÃöì ´\u0016\u0010·¬\u0004\u001fBÀ'ÛÿàÇÉæPÕÐ¾®T?ãò©NÖ¿²àØ8Gý8òø<dYð¾£iÊ2§µ±\u000eEªcðD1\u0010\u008a|çÞ\bÇ`Mc\fG\u0001o$h\u009a°(üçl\u0019ÈÑt\u0017+9\u0093°ÿ\u0018l4 Ð\"q\u0015*T_çN¤²á\u001c?ºfmP¨®Ô*\u001eªl\u0087ÉzºÉ\u009en"
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
                     c = var9;
                     g = new String[9];
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

                  var6 = "\b\u0010ëþ\u0001\u0013}\u0013ÿ\u0083\u00ad\u000f=``\u0017f^E¼E\u0090÷¬vg5\fw'I\u000bZG\u0093[§K\u0012)eÿ²HCÒ<Q\u000f\u009cV5@ük\u007f0\u000b\u0091`º\u009f\u0095ÿRÚ]êQ0¥æ>K¦â\u00ad\u009fÀZÒ\u0002\u009cÌÕ¹\u008d\u0084\u000ej\u0093æ¸&VÿÿËP\u008eò£h\u0099Á";
                  var8 = "\b\u0010ëþ\u0001\u0013}\u0013ÿ\u0083\u00ad\u000f=``\u0017f^E¼E\u0090÷¬vg5\fw'I\u000bZG\u0093[§K\u0012)eÿ²HCÒ<Q\u000f\u009cV5@ük\u007f0\u000b\u0091`º\u009f\u0095ÿRÚ]êQ0¥æ>K¦â\u00ad\u009fÀZÒ\u0002\u009cÌÕ¹\u008d\u0084\u000ej\u0093æ¸&VÿÿËP\u008eò£h\u0099Á"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20734;
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
            throw new RuntimeException("ejf", var10);
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
         throw new RuntimeException("ejf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
