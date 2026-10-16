package net.minecraft.block;

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

public class BlockJukebox$TileEntityJukebox extends pyk {
   private erg lul;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void agl(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/block/BlockJukebox$TileEntityJukebox.a J
      // 03: ldc2_w 67423824713354
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic g_3.a ()[Ljava/lang/String;
      // 0b: astore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial pyk.agl (Lbdo;)V
      // 12: aload 1
      // 13: sipush 11968
      // 16: ldc2_w 5338934829501781076
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/block/BlockJukebox$TileEntityJukebox.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: bipush 10
      // 23: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 26: aload 4
      // 28: ifnull 73
      // 2b: ifeq 5a
      // 2e: goto 35
      // 31: invokestatic net/minecraft/block/BlockJukebox$TileEntityJukebox.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: sipush 11968
      // 3a: ldc2_w 5338934829501781076
      // 3d: lload 2
      // 3e: lxor
      // 3f: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/block/BlockJukebox$TileEntityJukebox.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 48: invokestatic erg.qog (Lbdo;)Lerg;
      // 4b: invokevirtual net/minecraft/block/BlockJukebox$TileEntityJukebox.n50 (Lerg;)V
      // 4e: aload 4
      // 50: ifnonnull 9f
      // 53: goto 5a
      // 56: invokestatic net/minecraft/block/BlockJukebox$TileEntityJukebox.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 1
      // 5b: sipush 9147
      // 5e: ldc2_w 4361712392972474668
      // 61: lload 2
      // 62: lxor
      // 63: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/block/BlockJukebox$TileEntityJukebox.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: nop
      // 69: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 6c: goto 73
      // 6f: invokestatic net/minecraft/block/BlockJukebox$TileEntityJukebox.a (Loov;)Loov;
      // 72: athrow
      // 73: ifle 9f
      // 76: aload 0
      // 77: new erg
      // 7a: dup
      // 7b: aload 1
      // 7c: sipush 21899
      // 7f: ldc2_w 8036111458761338653
      // 82: lload 2
      // 83: lxor
      // 84: invokedynamic b (IJ)Ljava/lang/String; bsm=net/minecraft/block/BlockJukebox$TileEntityJukebox.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: nop
      // 8a: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 8d: invokestatic u7m.ltr (I)Lu7m;
      // 90: bipush 1
      // 91: bipush 0
      // 92: invokespecial erg.<init> (Lu7m;II)V
      // 95: invokevirtual net/minecraft/block/BlockJukebox$TileEntityJukebox.n50 (Lerg;)V
      // 98: goto 9f
      // 9b: invokestatic net/minecraft/block/BlockJukebox$TileEntityJukebox.a (Loov;)Loov;
      // 9e: athrow
      // 9f: invokestatic i2h.b ()[Li2h;
      // a2: ifnull b3
      // a5: bipush 5
      // a6: anewarray 1
      // a9: invokestatic g_3.b ([Ljava/lang/String;)V
      // ac: goto b3
      // af: invokestatic net/minecraft/block/BlockJukebox$TileEntityJukebox.a (Loov;)Loov;
      // b2: athrow
      // b3: return
   }

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 82377822597718L;

      try {
         super.m2a(var1);
         if (this.abl() != null) {
            var1.rzm(b<"b">(26558, 4007928014554020343L ^ var2), this.abl().zy4(new bdo()));
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public erg abl() {
      return this.lul;
   }

   public void n50(erg var1) {
      this.lul = var1;
      this.r5t();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8456370579815241601L, -2349292935318540612L, MethodHandles.lookup().lookupClass()).a(63987238920319L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 1268425833081L;
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
      String var6 = "gù+¢\bKz\u0010\u001f-*\u000f\u001b\u0092Öí\u00108W \u0094#Ûà\u009e\u0096Ù )§½/¶";
      int var8 = "gù+¢\bKz\u0010\u001f-*\u000f\u001b\u0092Öí\u00108W \u0094#Ûà\u009e\u0096Ù )§½/¶".length();
      char var5 = 16;
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
                     b = var9;
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

                  var6 = "j MóÈ² nQ\u0081\u0012.\u0016\u000eÑ¹\u009e\u009fè¬Y\u009f/4A\u008d[\n\r}~i \u0003C5ÛÏ\u0091¨P\u009a&Í'?DÉ\u009dÐµ\u008f\u0013\u0096\u0017u°}\n+ w\n\u001d¾";
                  var8 = "j MóÈ² nQ\u0081\u0012.\u0016\u000eÑ¹\u009e\u009fè¬Y\u009f/4A\u008d[\n\r}~i \u0003C5ÛÏ\u0091¨P\u009a&Í'?DÉ\u009dÐµ\u008f\u0013\u0096\u0017u°}\n+ w\n\u001d¾"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20408;
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
            throw new RuntimeException("net/minecraft/block/BlockJukebox$TileEntityJukebox", var10);
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
         throw new RuntimeException("net/minecraft/block/BlockJukebox$TileEntityJukebox" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
