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
import net.optifine.gui.GuiButtonOF;

public class buk extends gbe {
   private final gbe qx7;
   private String r4o;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public buk(gbe var1) {
      this.qx7 = var1;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 118311913323776L;
      int var4 = 0;
      this.r4o = fc1.gx1(b<"w">(4451, 8744880501276962990L ^ var1), new Object[0]);
      int var10000 = t9d.c();
      ulc[] var5 = ulc.values();
      int var6 = var5.length;
      int var3 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            ulc var8 = var5[var7];

            try {
               this.khf.add(new buk$rcg(this, var8.jl_(), this.dt7 / 2 - 155 + var4 % 2 * 160, this.o1e / 6 + 24 * (var4 >> 1), 150, 20, var8, null));
               var4++;
               var7++;
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         byte var10001;
         label29: {
            label28: {
               try {
                  var10000 = var4 % 2;
                  var10001 = 1;
                  if (var3 != 0) {
                     break label29;
                  }

                  if (var10000 != 1) {
                     break label28;
                  }
               } catch (oov var9) {
                  throw a(var9);
               }

               var4++;
            }

            this.khf
               .add(
                  new GuiButtonOF(210, this.dt7 / 2 - 100, this.o1e / 6 + 24 * (var4 >> 1), fc1.gx1(b<"w">(6550, 7255801751694604376L ^ var1), new Object[0]))
               );
            var10000 = var4;
            var10001 = 2;
         }

         var4 = var10000 + var10001;
         this.khf.add(new gt4(200, this.dt7 / 2 - 100, this.o1e / 6 + 24 * (var4 >> 1), fc1.gx1(b<"w">(30061, 8191228192401298594L ^ var1), new Object[0])));
         break;
      }
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq b2
      // 0f: goto 16
      // 12: invokestatic buk.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic buk.a (Loov;)Loov;
      // 20: athrow
      // 21: sipush 210
      // 24: iload 2
      // 25: ifeq 5a
      // 28: if_icmpne 48
      // 2b: goto 32
      // 2e: invokestatic buk.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield buk.f41 Lc05;
      // 36: new net/optifine/gui/GuiScreenCapeOF
      // 39: dup
      // 3a: aload 0
      // 3b: invokespecial net/optifine/gui/GuiScreenCapeOF.<init> (Lgbe;)V
      // 3e: invokevirtual c05.z2i (Lgbe;)V
      // 41: goto 48
      // 44: invokestatic buk.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 1
      // 49: getfield gt4._me I
      // 4c: iload 2
      // 4d: ifeq 93
      // 50: sipush 200
      // 53: goto 5a
      // 56: invokestatic buk.a (Loov;)Loov;
      // 59: athrow
      // 5a: if_icmpne 7d
      // 5d: aload 0
      // 5e: getfield buk.f41 Lc05;
      // 61: getfield c05.oxn Lmoh;
      // 64: invokevirtual moh.cmo ()V
      // 67: aload 0
      // 68: getfield buk.f41 Lc05;
      // 6b: aload 0
      // 6c: getfield buk.qx7 Lgbe;
      // 6f: invokevirtual c05.z2i (Lgbe;)V
      // 72: iload 2
      // 73: ifne b2
      // 76: goto 7d
      // 79: invokestatic buk.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 1
      // 7e: iload 2
      // 7f: ifeq 97
      // 82: goto 89
      // 85: invokestatic buk.a (Loov;)Loov;
      // 88: athrow
      // 89: instanceof buk$rcg
      // 8c: goto 93
      // 8f: invokestatic buk.a (Loov;)Loov;
      // 92: athrow
      // 93: ifeq b2
      // 96: aload 1
      // 97: checkcast buk$rcg
      // 9a: invokestatic buk$rcg.py7 (Lbuk$rcg;)Lulc;
      // 9d: astore 3
      // 9e: aload 0
      // 9f: getfield buk.f41 Lc05;
      // a2: getfield c05.oxn Lmoh;
      // a5: aload 3
      // a6: invokevirtual moh._qk (Lulc;)V
      // a9: aload 1
      // aa: aload 0
      // ab: aload 3
      // ac: invokespecial buk.txj (Lulc;)Ljava/lang/String;
      // af: putfield gt4.frg Ljava/lang/String;
      // b2: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.poi(this.fex, this.r4o, this.dt7 / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   private String txj(ulc var1) {
      long var2 = a ^ 33815499567162L;
      int var4 = t9d.b();
      if (this.f41.oxn.c1l().contains(var1)) {
         String var5 = fc1.gx1(b<"w">(1084, 5110209564654528714L ^ var2), new Object[0]);
         if (var4 != 0) {
            return var1.z28()._2o() + b<"w">(7674, 5265586850191438091L ^ var2) + var5;
         }
      }

      String var6 = fc1.gx1(b<"w">(30691, 1376711639877786387L ^ var2), new Object[0]);
      return var1.z28()._2o() + b<"w">(7674, 5265586850191438091L ^ var2) + var6;
   }

   public static String p0r(buk var0, ulc var1) {
      return var0.txj(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7737283141845824004L, -5722799978242703299L, MethodHandles.lookup().lookupClass()).a(265391586071016L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 95377965803240L;
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
      String var6 = "È\u0092\u0013þ\u0090m-£Õ\u0019ÂÔ\u009a7)\u0088\u0016}!Û\u0004\u0003\u0003H\u008d¾þjÑ\u0081M0k¨Â\u0089\u0086\u0014èêm\u0014Û9>n\u007fPêQ>ý\u0011?\u0013\u009a\u0018/i\u008fa\u0010\u0092ý\u008d?yÝ\t¦\u0015©i\u0090nè\u0006m¡p\u0097 Lç\u001fZìÉ\u008d{\u001cL\u000bÞ\u008e9²Oa\u0016\u0003«\u000b´î4A\u0097ùë\u0096ìbq8í®\u0086ëOô>Þi±.ß£ó?\u0089¿Û>]\u008dß\u0081\u0015QÐZ\u008e¨[\u0018\u0092zêñÙ\u009f\u009f¨ o/@´\u008dÍâ;êd£X)ì9Ú";
      int var8 = "È\u0092\u0013þ\u0090m-£Õ\u0019ÂÔ\u009a7)\u0088\u0016}!Û\u0004\u0003\u0003H\u008d¾þjÑ\u0081M0k¨Â\u0089\u0086\u0014èêm\u0014Û9>n\u007fPêQ>ý\u0011?\u0013\u009a\u0018/i\u008fa\u0010\u0092ý\u008d?yÝ\t¦\u0015©i\u0090nè\u0006m¡p\u0097 Lç\u001fZìÉ\u008d{\u001cL\u000bÞ\u008e9²Oa\u0016\u0003«\u000b´î4A\u0097ùë\u0096ìbq8í®\u0086ëOô>Þi±.ß£ó?\u0089¿Û>]\u008dß\u0081\u0015QÐZ\u008e¨[\u0018\u0092zêñÙ\u009f\u009f¨ o/@´\u008dÍâ;êd£X)ì9Ú"
         .length();
      char var5 = '8';
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

                  var6 = "r'Úþ·qy/¼`xÊ\u0091ÚÑ.KÁ\u0095Dó\u008e\u001c\"\u0010\u0011v£Ï\u001cµ\u0085(ú\u0000M*ÛÆ¢,";
                  var8 = "r'Úþ·qy/¼`xÊ\u0091ÚÑ.KÁ\u0095Dó\u008e\u001c\"\u0010\u0011v£Ï\u001cµ\u0085(ú\u0000M*ÛÆ¢,".length();
                  var5 = 24;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6851;
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
            throw new RuntimeException("buk", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("buk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
