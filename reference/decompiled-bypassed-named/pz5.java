import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pz5 extends so9 {
   public pz5(hr_ var1, nss var2, float var3) {
      super(var1, var2, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void gis(zfo var1, float var2) {
      float var4 = 1.0F;
      int var10000 = OpaquePredicate.b();
      int var5 = var1.zz6();
      int var3 = var10000;

      label39: {
         byte var10001;
         label46: {
            label43: {
               try {
                  var10000 = var5;
                  var10001 = 1;
                  if (var3 == 0) {
                     break label46;
                  }

                  if (var5 != 1) {
                     break label43;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               var4 *= 0.87F;

               try {
                  if (var3 != 0) {
                     break label39;
                  }
               } catch (oov var7) {
                  boolean var11 = false;
                  throw a(var7);
               }
            }

            try {
               var10000 = var5;
               var10001 = 2;
            } catch (oov var6) {
               boolean var12 = false;
               throw a(var6);
            }
         }

         if (var10000 == var10001) {
            var4 *= 0.92F;
         }
      }

      hzu.syc(var4, var4, var4);
      super.e2w(var1, var2);
   }

   public gdz lwg(zfo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual zfo.m2v ()Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifne 5c
      // 0f: goto 16
      // 12: invokestatic pz5.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual zfo.zz6 ()I
      // 1a: goto 21
      // 1d: invokestatic pz5.a (Loov;)Loov;
      // 20: athrow
      // 21: tableswitch 35 0 4 35 43 47 51 55
      // 44: getstatic pz5.fdd Lgdz;
      // 47: areturn
      // 48: invokestatic pz5.a (Loov;)Loov;
      // 4b: athrow
      // 4c: getstatic pz5.xph Lgdz;
      // 4f: areturn
      // 50: getstatic pz5.bzb Lgdz;
      // 53: areturn
      // 54: getstatic pz5.yi_ Lgdz;
      // 57: areturn
      // 58: getstatic pz5.m48 Lgdz;
      // 5b: areturn
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokespecial pz5.pco (Lzfo;)Lgdz;
      // 61: areturn
   }

   private gdz pco(zfo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual zfo.vg9 ()Ljava/lang/String;
      // 08: astore 3
      // 09: aload 1
      // 0a: iload 2
      // 0b: ifne 2a
      // 0e: invokevirtual zfo.nja ()Z
      // 11: ifne 21
      // 14: goto 1b
      // 17: invokestatic pz5.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aconst_null
      // 1c: areturn
      // 1d: invokestatic pz5.a (Loov;)Loov;
      // 20: athrow
      // 21: getstatic pz5.x6j Ljava/util/Map;
      // 24: aload 3
      // 25: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a: checkcast gdz
      // 2d: astore 4
      // 2f: aload 4
      // 31: iload 2
      // 32: ifne 6e
      // 35: ifnonnull 6c
      // 38: goto 3f
      // 3b: invokestatic pz5.a (Loov;)Loov;
      // 3e: athrow
      // 3f: new gdz
      // 42: dup
      // 43: aload 3
      // 44: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 47: astore 4
      // 49: invokestatic Minecraft.vz1 ()Lc05;
      // 4c: invokevirtual Minecraft.l22 ()Llc5;
      // 4f: aload 4
      // 51: new ofr
      // 54: dup
      // 55: aload 1
      // 56: invokevirtual zfo.aln ()[Ljava/lang/String;
      // 59: invokespecial ofr.<init> ([Ljava/lang/String;)V
      // 5c: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 5f: pop
      // 60: getstatic pz5.x6j Ljava/util/Map;
      // 63: aload 3
      // 64: aload 4
      // 66: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6b: pop
      // 6c: aload 4
      // 6e: areturn
   }

   @Override
   public void e2w(Entity var1, float var2) {
      this.gis((zfo)var1, var2);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.lwg((zfo)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(67563900950443284L, 7530439947760820640L, MethodHandles.lookup().lookupClass()).a(34604131926463L);
      // $VF: monitorexit
      long var10 = var10000 ^ 105510656606229L;
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
      String var5 = "«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009fêÏ+&NLºR¤\u009cõû\u0096x`ÇâÅDÍ\u0011\u001f\r\u0001öv.¶÷6¼\u0090(«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009f\u0086{\u0081÷þt\u0015q¹Î_*Ot\u0016&\u0010\tÛüÉ^û\u0000(«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009fêÏ+&NLºR\u0015w\u0086²¿m|n#D\u007fÀ.øÖF";
      int var7 = "«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009fêÏ+&NLºR¤\u009cõû\u0096x`ÇâÅDÍ\u0011\u001f\r\u0001öv.¶÷6¼\u0090(«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009f\u0086{\u0081÷þt\u0015q¹Î_*Ot\u0016&\u0010\tÛüÉ^û\u0000(«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009fêÏ+&NLºR\u0015w\u0086²¿m|n#D\u007fÀ.øÖF"
         .length();
      char var4 = '0';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = c(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     x6j = Maps.newHashMap();
                     fdd = new gdz(var8[3]);
                     bzb = new gdz(var8[4]);
                     xph = new gdz(var8[1]);
                     yi_ = new gdz(var8[2]);
                     m48 = new gdz(var8[0]);
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

                  var5 = "«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009fêÏ+&NLºR®×Zr4ÑÄS÷\u0099dä\u009eTD\t «\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009f$µ£]Ä\u008c·\u0005\t\u0013ySUJÃ¬";
                  var7 = "«\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009fêÏ+&NLºR®×Zr4ÑÄS÷\u0099dä\u009eTD\t «\u0092±ÀOaÕçñ4ë\u0087M\u0010\u0000\u009f$µ£]Ä\u008c·\u0005\t\u0013ySUJÃ¬"
                     .length();
                  var4 = '(';
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

   private static String c(byte[] var0) {
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
