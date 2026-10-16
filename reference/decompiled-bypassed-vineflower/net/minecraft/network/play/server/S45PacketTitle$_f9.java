package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum S45PacketTitle$_f9 {
   public static final S45PacketTitle$_f9 r62;
   public static final S45PacketTitle$_f9 syq;
   public static final S45PacketTitle$_f9 oi9;
   public static final S45PacketTitle$_f9 k_0;
   public static final S45PacketTitle$_f9 enj;
   private static final S45PacketTitle$_f9[] lhl;

   public static S45PacketTitle$_f9 fwr(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S45PacketTitle$_f9.values ()[Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 03: astore 2
      // 04: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: astore 1
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: iload 4
      // 10: iload 3
      // 11: if_icmpge 4a
      // 14: aload 2
      // 15: iload 4
      // 17: aaload
      // 18: astore 5
      // 1a: aload 1
      // 1b: ifnull 46
      // 1e: aload 5
      // 20: aload 1
      // 21: ifnull 4d
      // 24: goto 2b
      // 27: invokestatic net/minecraft/network/play/server/S45PacketTitle$_f9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokevirtual net/minecraft/network/play/server/S45PacketTitle$_f9.name ()Ljava/lang/String;
      // 2e: aload 0
      // 2f: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 32: ifeq 43
      // 35: goto 3c
      // 38: invokestatic net/minecraft/network/play/server/S45PacketTitle$_f9.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 5
      // 3e: areturn
      // 3f: invokestatic net/minecraft/network/play/server/S45PacketTitle$_f9.a (Loov;)Loov;
      // 42: athrow
      // 43: iinc 4 1
      // 46: aload 1
      // 47: ifnonnull 0e
      // 4a: getstatic net/minecraft/network/play/server/S45PacketTitle$_f9.r62 Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 4d: areturn
   }

   public static String[] lnx() {
      String[] var1 = new String[values().length];
      String var10000 = S14PacketEntity.b();
      int var2 = 0;
      String var0 = var10000;
      S45PacketTitle$_f9[] var3 = values();
      int var4 = var3.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            S45PacketTitle$_f9 var6 = var3[var5];

            try {
               var10000 = var1;
               if (var0 == null) {
                  break;
               }

               var1[var2++] = var6.name().toLowerCase();
               var5++;
               if (var0 != null) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         var10000 = var1;
         break;
      }

      return var10000;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7380960764855493404L, -5029298799671026188L, MethodHandles.lookup().lookupClass()).a(121981402736843L);
      // $VF: monitorexit
      long var10 = var10000 ^ 50749640890462L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[5];
      int var6 = 0;
      String var5 = "çmh\u001d*\u0010¢£\b[sø\u0017wð\u0001è\u0010PÍio\u007f\u001b\u0084q¬Í\u001fWü2÷ß";
      int var7 = "çmh\u001d*\u0010¢£\b[sø\u0017wð\u0001è\u0010PÍio\u007f\u001b\u0084q¬Í\u001fWü2÷ß".length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     r62 = new S45PacketTitle$_f9();
                     syq = new S45PacketTitle$_f9();
                     oi9 = new S45PacketTitle$_f9();
                     k_0 = new S45PacketTitle$_f9();
                     enj = new S45PacketTitle$_f9();
                     lhl = new S45PacketTitle$_f9[]{r62, syq, oi9, k_0, enj};
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "Æyå° 6\u0089Ä\bq¨\u0092]\u001eÒ·Î";
                  var7 = "Æyå° 6\u0089Ä\bq¨\u0092]\u001eÒ·Î".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
}
