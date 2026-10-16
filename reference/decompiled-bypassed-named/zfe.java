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

public class zfe extends Module {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public zfe() {
      long var1 = a ^ 63475344264171L;
      super(b<"g">(19898, 3744916594406447354L ^ var1), _aj.z3a, false, new SubEngine[0]);
   }

   @EventHandler
   public void _yz(xiz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zfe.a J
      // 003: ldc2_w 17971280841584
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: pop
      // 00f: getstatic zfe.ek1 Lc05;
      // 012: getfield Minecraft.dzk Lakm;
      // 015: getfield akm.sc8 Li2h;
      // 018: iload 4
      // 01a: ifeq 03c
      // 01d: instanceof ha9
      // 020: ifeq 113
      // 023: goto 02a
      // 026: invokestatic zfe.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: pop
      // 02c: getstatic zfe.ek1 Lc05;
      // 02f: getfield Minecraft.dzk Lakm;
      // 032: getfield akm.sc8 Li2h;
      // 035: goto 03c
      // 038: invokestatic zfe.a (Loov;)Loov;
      // 03b: athrow
      // 03c: checkcast ha9
      // 03f: astore 5
      // 041: getstatic ClientState.qkk Lzwr;
      // 044: invokevirtual ClientState.w34 ()Lf62;
      // 047: aload 5
      // 049: invokevirtual ha9.noc ()Ljava/lang/String;
      // 04c: iload 4
      // 04e: ifeq 0cd
      // 051: invokevirtual f62.jzk (Ljava/lang/String;)Z
      // 054: ifeq 0bb
      // 057: goto 05e
      // 05a: invokestatic zfe.a (Loov;)Loov;
      // 05d: athrow
      // 05e: getstatic ClientState.qkk Lzwr;
      // 061: invokevirtual ClientState.w34 ()Lf62;
      // 064: aload 5
      // 066: invokevirtual ha9.noc ()Ljava/lang/String;
      // 069: invokevirtual f62.vca (Ljava/lang/String;)V
      // 06c: new java/lang/StringBuilder
      // 06f: dup
      // 070: invokespecial java/lang/StringBuilder.<init> ()V
      // 073: sipush 7518
      // 076: ldc2_w 2039923698238113921
      // 079: lload 2
      // 07a: lxor
      // 07b: invokedynamic g (IJ)Ljava/lang/String; bsm=zfe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: nop
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: getstatic syo.u4m Lsyo;
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 08a: aload 5
      // 08c: invokevirtual ha9.noc ()Ljava/lang/String;
      // 08f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 092: getstatic syo.w29 Lsyo;
      // 095: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 098: sipush 7298
      // 09b: ldc2_w 7947632334770391384
      // 09e: lload 2
      // 09f: lxor
      // 0a0: invokedynamic g (IJ)Ljava/lang/String; bsm=zfe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: nop
      // 0a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ac: invokestatic ncl.dob (Ljava/lang/String;)V
      // 0af: iload 4
      // 0b1: ifne 113
      // 0b4: goto 0bb
      // 0b7: invokestatic zfe.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: getstatic ClientState.qkk Lzwr;
      // 0be: invokevirtual ClientState.w34 ()Lf62;
      // 0c1: aload 5
      // 0c3: invokevirtual ha9.noc ()Ljava/lang/String;
      // 0c6: goto 0cd
      // 0c9: invokestatic zfe.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: invokevirtual f62.fu7 (Ljava/lang/String;)V
      // 0d0: new java/lang/StringBuilder
      // 0d3: dup
      // 0d4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d7: sipush 29656
      // 0da: ldc2_w 4527509656652883457
      // 0dd: lload 2
      // 0de: lxor
      // 0df: invokedynamic g (IJ)Ljava/lang/String; bsm=zfe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: getstatic syo.u4m Lsyo;
      // 0eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ee: aload 5
      // 0f0: invokevirtual ha9.noc ()Ljava/lang/String;
      // 0f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f6: getstatic syo.w29 Lsyo;
      // 0f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0fc: sipush 25278
      // 0ff: ldc2_w 4023252150209492838
      // 102: lload 2
      // 103: lxor
      // 104: invokedynamic g (IJ)Ljava/lang/String; bsm=zfe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: nop
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 110: invokestatic ncl.dob (Ljava/lang/String;)V
      // 113: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-436367254995091859L, -6540040202984536822L, MethodHandles.lookup().lookupClass()).a(107173220410593L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 57724206106334L;
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
      String var6 = "A×óÍÃÖÐÊ\u0097\u001aW³\u009cð\u008c\u008e´ÓaH°\"Ï\u0018¬\u007f`\u0090Q%p\u0010 \u00185@*çN wTc\u0014{\u0003iµü«Ö×·jkxÔ¸íÇiS\u00ad¹)\u0010\u0013y\u0099;Ýps+¼ø¬¯ÓJ\u0094µ";
      int var8 = "A×óÍÃÖÐÊ\u0097\u001aW³\u009cð\u008c\u008e´ÓaH°\"Ï\u0018¬\u007f`\u0090Q%p\u0010 \u00185@*çN wTc\u0014{\u0003iµü«Ö×·jkxÔ¸íÇiS\u00ad¹)\u0010\u0013y\u0099;Ýps+¼ø¬¯ÓJ\u0094µ"
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

                  var6 = "\"r\r6UÇ{ÚÕW\u0082\u0099.Ç\u001cÏk´Í<\u000b§*\u0018+ß\u0097Î\u0093ã½² XBQ\u0092ý¢/\r©\u0003LôDs\u0004¹ñDÙ\u0080)\u009dé<t~bS\u001b}\u001fI";
                  var8 = "\"r\r6UÇ{ÚÕW\u0082\u0099.Ç\u001cÏk´Í<\u000b§*\u0018+ß\u0097Î\u0093ã½² XBQ\u0092ý¢/\r©\u0003LôDs\u0004¹ñDÙ\u0080)\u009dé<t~bS\u001b}\u001fI"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23669;
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
            throw new RuntimeException("zfe", var10);
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
         throw new RuntimeException("zfe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
