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

public class jr9 extends Module {
   public static boolean xev;
   public static ModeSetting jfb;
   public t_e em9;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public jr9() {
      long var1 = a ^ 6766828822697L;
      super(b<"v">(29954, 6697845423484477591L ^ var1), _aj.z3a, jfb);
      this.em9 = new t_e();
      this.r6x = true;
   }

   @Override
   public void onDisable() {
      EventBus.unregister(this.em9);
      super.onDisable();
   }

   @EventHandler
   public void ypk(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic jr9.a J
      // 03: ldc2_w 91858985660847
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: bipush 0
      // 0e: putstatic jr9.xev Z
      // 11: aload 0
      // 12: getfield jr9.enabled Z
      // 15: iload 4
      // 17: ifne 52
      // 1a: ifeq 92
      // 1d: goto 24
      // 20: invokestatic jr9.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: iload 4
      // 27: ifne 64
      // 2a: goto 31
      // 2d: invokestatic jr9.a (Loov;)Loov;
      // 30: athrow
      // 31: getfield jr9.em9 Lt_e;
      // 34: invokestatic EventBus.unregister (Ljava/lang/Object;)V
      // 37: getstatic jr9.jfb Lc_3;
      // 3a: sipush 11260
      // 3d: ldc2_w 2188992670772555626
      // 40: lload 2
      // 41: lxor
      // 42: invokedynamic v (IJ)Ljava/lang/String; bsm=jr9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 4b: goto 52
      // 4e: invokestatic jr9.a (Loov;)Loov;
      // 51: athrow
      // 52: ifeq 63
      // 55: aload 0
      // 56: getfield jr9.em9 Lt_e;
      // 59: invokestatic EventBus.register (Ljava/lang/Object;)V
      // 5c: goto 63
      // 5f: invokestatic jr9.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: new java/lang/StringBuilder
      // 67: dup
      // 68: invokespecial java/lang/StringBuilder.<init> ()V
      // 6b: aload 0
      // 6c: invokevirtual jr9.m2d ()Ljava/lang/String;
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72: sipush 310
      // 75: ldc2_w 6642049925013980577
      // 78: lload 2
      // 79: lxor
      // 7a: invokedynamic v (IJ)Ljava/lang/String; bsm=jr9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: getstatic jr9.jfb Lc_3;
      // 86: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8f: invokevirtual jr9.n5o (Ljava/lang/String;)V
      // 92: return
   }

   @EventHandler
   public void i38(PlayerUpdateEvent var1) {
      this.enabled = j83.ef8.gln();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2035729836744345141L, 5783009516530091282L, MethodHandles.lookup().lookupClass()).a(269572194462374L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 131815536062854L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "\u001fÍ\u0081K\u0017à\u0099\u0096sµ;:Côw¤\u008a.»¹\u0016Ëbð\u0095\u0091»w\u0099·©Ø\u0010\u0012o\u0081\u0093\u009aû\u001aõ\u0090ëÑ}\u008co\u000f\u009e\u0010«¢\u0016Mºså°#q]\f\u0016¡¸\u0086\u00188_U\u0087\u009fãg6{í\u0080\u0012\u009d\u0099t'ñ\u001fXxãg´ë";
      int var6 = "\u001fÍ\u0081K\u0017à\u0099\u0096sµ;:Côw¤\u008a.»¹\u0016Ëbð\u0095\u0091»w\u0099·©Ø\u0010\u0012o\u0081\u0093\u009aû\u001aõ\u0090ëÑ}\u008co\u000f\u009e\u0010«¢\u0016Mºså°#q]\f\u0016¡¸\u0086\u00188_U\u0087\u009fãg6{í\u0080\u0012\u009d\u0099t'ñ\u001fXxãg´ë"
         .length();
      char var3 = ' ';
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
                     g = new String[6];
                     jfb = new ModeSetting(
                        b<"v">(23643, 3745106557204224231L ^ var9),
                        b<"v">(6685, 2488499303160061600L ^ var9),
                        b<"v">(19882, 1157294301133490449L ^ var9),
                        new String[]{b<"v">(19882, 1157294301133490449L ^ var9)}
                     );
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

                  var4 = "\bÛÐ\bÀU¡t£3ß%\u0019.6\u001b4ï³\u008c\u0016± ;\u0005\u000f|°Ø\u0004\u001c\u0081 ½Æ=²\bÖ°0Et\u0002ã\u0096\t\u00ad_QþÀÓ±\u001fþÄ¸¥I&çä\u008eD";
                  var6 = "\bÛÐ\bÀU¡t£3ß%\u0019.6\u001b4ï³\u008c\u0016± ;\u0005\u000f|°Ø\u0004\u001c\u0081 ½Æ=²\bÖ°0Et\u0002ã\u0096\t\u00ad_QþÀÓ±\u001fþÄ¸¥I&çä\u008eD"
                     .length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5820;
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
            throw new RuntimeException("jr9", var10);
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
         throw new RuntimeException("jr9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
