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

public class rt5 extends kf9 {
   private static final long b;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public rt5(ha_ param1, String param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic rt5.b J
      // 03: ldc2_w 74168037024861
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic t9d.c ()I
      // 0c: istore 7
      // 0e: aload 0
      // 0f: aload 1
      // 10: iload 4
      // 12: ifeq 27
      // 15: sipush 14719
      // 18: ldc2_w 7396496389057040
      // 1b: lload 5
      // 1d: lxor
      // 1e: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: nop
      // 24: goto 36
      // 27: sipush 30380
      // 2a: ldc2_w 658233900428256711
      // 2d: lload 5
      // 2f: lxor
      // 30: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: bipush 0
      // 37: anewarray 28
      // 3a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 3d: aload 2
      // 3e: iload 3
      // 3f: invokespecial kf9.<init> (Lha_;Ljava/lang/String;Ljava/lang/String;I)V
      // 42: aload 0
      // 43: bipush 1
      // 44: putfield rt5.xm_ Z
      // 47: aload 0
      // 48: iload 4
      // 4a: ifeq 5f
      // 4d: sipush 11200
      // 50: ldc2_w 7382838296919357609
      // 53: lload 5
      // 55: lxor
      // 56: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: nop
      // 5c: goto 6e
      // 5f: sipush 25590
      // 62: ldc2_w 5896979900616601754
      // 65: lload 5
      // 67: lxor
      // 68: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: bipush 0
      // 6f: anewarray 28
      // 72: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 75: iload 7
      // 77: ifne ae
      // 7a: putfield rt5.zde Ljava/lang/String;
      // 7d: aload 0
      // 7e: iload 4
      // 80: ifeq a0
      // 83: goto 8a
      // 86: invokestatic rt5.c (Loov;)Loov;
      // 89: athrow
      // 8a: sipush 7341
      // 8d: ldc2_w 3517037578224242627
      // 90: lload 5
      // 92: lxor
      // 93: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: nop
      // 99: goto af
      // 9c: invokestatic rt5.c (Loov;)Loov;
      // 9f: athrow
      // a0: sipush 296
      // a3: ldc2_w 6054500676364374597
      // a6: lload 5
      // a8: lxor
      // a9: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: nop
      // af: bipush 0
      // b0: anewarray 28
      // b3: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // b6: putfield rt5._m_ Ljava/lang/String;
      // b9: aload 0
      // ba: sipush 12167
      // bd: ldc2_w 5183774484614135021
      // c0: lload 5
      // c2: lxor
      // c3: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: nop
      // c9: bipush 0
      // ca: anewarray 28
      // cd: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // d0: putfield rt5.wuk Ljava/lang/String;
      // d3: aload 0
      // d4: sipush 14281
      // d7: ldc2_w 4623993580515992737
      // da: lload 5
      // dc: lxor
      // dd: invokedynamic n (IJ)Ljava/lang/String; bsm=rt5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: nop
      // e3: bipush 0
      // e4: anewarray 28
      // e7: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // ea: putfield rt5.fsk Ljava/lang/String;
      // ed: aload 0
      // ee: aload 2
      // ef: putfield rt5.qg2 Ljava/lang/String;
      // f2: return
   }

   @Override
   public void initGui() {
      super.initGui();
      this.khf.clear();
      this.khf.add(new gt4(0, this.dt7 / 2 - 50 - 105, this.o1e / 6 + 96, 100, 20, this.zde));
      this.khf.add(new gt4(2, this.dt7 / 2 - 50, this.o1e / 6 + 96, 100, 20, this.wuk));
      this.khf.add(new gt4(1, this.dt7 / 2 - 50 + 105, this.o1e / 6 + 96, 100, 20, this._m_));
   }

   @Override
   public void actionPerformed(gt4 var1) {
      int var2 = t9d.c();

      try {
         if (var1._me == 2) {
            this.bar();
         }
      } catch (oov var3) {
         throw c(var3);
      }

      ha_ var10000;
      int var10001;
      label30: {
         label29: {
            try {
               var10000 = this.dj4;
               var10001 = var1._me;
               if (var2 != 0) {
                  break label30;
               }

               if (var1._me == 0) {
                  break label29;
               }
            } catch (oov var4) {
               throw c(var4);
            }

            var10001 = 0;
            break label30;
         }

         var10001 = 1;
      }

      var10000.confirmClicked((boolean)var10001, this.w7d);
   }

   public void bar() {
      vjv(this.qg2);
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 1
      // 07: iload 2
      // 08: fload 3
      // 09: invokespecial kf9.drawScreen (IIF)V
      // 0c: aload 0
      // 0d: iload 4
      // 0f: ifne 27
      // 12: getfield rt5.xm_ Z
      // 15: ifeq 3d
      // 18: goto 1f
      // 1b: invokestatic rt5.c (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic rt5.c (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield rt5.fex Lowt;
      // 2b: aload 0
      // 2c: getfield rt5.fsk Ljava/lang/String;
      // 2f: aload 0
      // 30: getfield rt5.dt7 I
      // 33: bipush 2
      // 34: idiv
      // 35: bipush 110
      // 37: ldc 16764108
      // 39: nop
      // 3a: invokevirtual rt5.poi (Lowt;Ljava/lang/String;III)V
      // 3d: return
   }

   public void jqi() {
      this.xm_ = false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8466853159456283852L, 3612350172131799213L, MethodHandles.lookup().lookupClass()).a(121675062225968L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 61600705200419L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "½ÍUÂßÙ*\u0018k#rGÃü\u0018\"\u0010[y\u001e\u0007ü³\u0019\"ý-ÀØü¢ø]0tÒ¨\u0017Ør{È9¬\u0087æd@¿K\u008b7Ýh\u0014êþ\u001c\u0003\u0093Ìc\u0089\u0019\u009dHA¥íÀ\u00854í!\u009d¾\u00845+×ÃO\u0018\u0001\u00126îÜ\u001c\u0095~ÿµ%Z\u001b\u008cõHCÚ4\u0017\u007fC\u0017\u0005 8³\u0017\u0090Ý1\u0011\u0095\f\u0010dN9\u0097ÿ\u0088FÑ\u0084\u0096ãö\u00ad¨ö\u0087\u008eÞ¸ÐýT(«ó!\\ºEN\u000bÙ.ßkÿJ\u009e\u0018ênGÇ\u0094×\u0094XÅ\u0012·àÅ×bK\u001bi\u0090\r¹²\u0007h";
      int var8 = "½ÍUÂßÙ*\u0018k#rGÃü\u0018\"\u0010[y\u001e\u0007ü³\u0019\"ý-ÀØü¢ø]0tÒ¨\u0017Ør{È9¬\u0087æd@¿K\u008b7Ýh\u0014êþ\u001c\u0003\u0093Ìc\u0089\u0019\u009dHA¥íÀ\u00854í!\u009d¾\u00845+×ÃO\u0018\u0001\u00126îÜ\u001c\u0095~ÿµ%Z\u001b\u008cõHCÚ4\u0017\u007fC\u0017\u0005 8³\u0017\u0090Ý1\u0011\u0095\f\u0010dN9\u0097ÿ\u0088FÑ\u0084\u0096ãö\u00ad¨ö\u0087\u008eÞ¸ÐýT(«ó!\\ºEN\u000bÙ.ßkÿJ\u009e\u0018ênGÇ\u0094×\u0094XÅ\u0012·àÅ×bK\u001bi\u0090\r¹²\u0007h"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     j = var9;
                     k = new String[8];
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

                  var6 = "\n¿DÎöJkò½PÓ\u0087¹\u0098\u0005ÄÔëZ_í)@}Èÿ÷¤qMü ÈÚ\u0014Pä/4:+ô\u0091¶éäa\u0083 «¤\u008bu\\uÝe\u0090\u009a\u0090e\u0081)\u001a\u0002\u0093PÐñó]G\u000bkdñó®°ÂË";
                  var8 = "\n¿DÎöJkò½PÓ\u0087¹\u0098\u0005ÄÔëZ_í)@}Èÿ÷¤qMü ÈÚ\u0014Pä/4:+ô\u0091¶éäa\u0083 «¤\u008bu\\uÝe\u0090\u009a\u0090e\u0081)\u001a\u0002\u0093PÐñó]G\u000bkdñó®°ÂË"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov c(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1491;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("rt5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("rt5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
