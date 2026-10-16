package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StructureMineshaftPieces {
   private static final List ppp;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void _pd() {
      long var0 = a ^ 114579742065714L;
      v8a.kem(StructureMineshaftPieces$Corridor.class, a<"i">(31405, 7506312104286917444L ^ var0));
      v8a.kem(StructureMineshaftPieces$Cross.class, a<"i">(12892, 4455908935026531254L ^ var0));
      v8a.kem(StructureMineshaftPieces$Room.class, a<"i">(29574, 7066498671677348461L ^ var0));
      v8a.kem(StructureMineshaftPieces$Stairs.class, a<"i">(28435, 620833394307827451L ^ var0));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static xi1 ire(List var0, Random var1, int var2, int var3, int var4, vt2 var5, int var6) {
      EntityLivingBase[] var7 = StructureStrongholdPieces$Stronghold.b();
      int var8 = var1.nextInt(100);

      int var10000;
      byte var10001;
      label78: {
         label71: {
            try {
               var10000 = var8;
               var10001 = 80;
               if (var7 == null) {
                  break label78;
               }

               if (var8 < 80) {
                  break label71;
               }
            } catch (oov var15) {
               throw a(var15);
            }

            yve var9 = StructureMineshaftPieces$Cross.hxa(var0, var1, var2, var3, var4, var5);

            try {
               if (var9 != null) {
                  return new StructureMineshaftPieces$Cross(var6, var1, var9, var5);
               }
            } catch (oov var12) {
               throw a(var12);
            }

            try {
               if (var7 != null) {
                  return null;
               }
            } catch (oov var14) {
               boolean var19 = false;
               throw a(var14);
            }
         }

         try {
            var10000 = var8;
            var10001 = 70;
         } catch (oov var13) {
            boolean var20 = false;
            throw a(var13);
         }
      }

      if (var10000 >= var10001) {
         yve var16 = StructureMineshaftPieces$Stairs.p2i(var0, var1, var2, var3, var4, var5);

         try {
            if (var16 != null) {
               return new StructureMineshaftPieces$Stairs(var6, var1, var16, var5);
            }
         } catch (oov var11) {
            throw a(var11);
         }

         if (var7 != null) {
            return null;
         }
      }

      yve var17 = StructureMineshaftPieces$Corridor.i8b(var0, var1, var2, var3, var4, var5);

      try {
         if (var17 != null) {
            return new StructureMineshaftPieces$Corridor(var6, var1, var17, var5);
         }
      } catch (oov var10) {
         throw a(var10);
      }

      return null;
   }

   private static xi1 e7l(xi1 param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 8
      // 05: iload 7
      // 07: bipush 8
      // 09: aload 8
      // 0b: ifnull 2c
      // 0e: if_icmple 1e
      // 11: goto 18
      // 14: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.a (Loov;)Loov;
      // 17: athrow
      // 18: aconst_null
      // 19: areturn
      // 1a: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.a (Loov;)Loov;
      // 1d: athrow
      // 1e: iload 3
      // 1f: aload 0
      // 20: invokevirtual xi1.q1q ()Lyve;
      // 23: getfield yve.gdj I
      // 26: isub
      // 27: invokestatic java/lang/Math.abs (I)I
      // 2a: bipush 80
      // 2c: aload 8
      // 2e: ifnull 51
      // 31: if_icmpgt 92
      // 34: goto 3b
      // 37: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.a (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 5
      // 3d: aload 0
      // 3e: invokevirtual xi1.q1q ()Lyve;
      // 41: getfield yve.ob0 I
      // 44: isub
      // 45: invokestatic java/lang/Math.abs (I)I
      // 48: bipush 80
      // 4a: goto 51
      // 4d: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.a (Loov;)Loov;
      // 50: athrow
      // 51: if_icmpgt 92
      // 54: aload 1
      // 55: aload 2
      // 56: iload 3
      // 57: iload 4
      // 59: iload 5
      // 5b: aload 6
      // 5d: iload 7
      // 5f: bipush 1
      // 60: iadd
      // 61: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.ire (Ljava/util/List;Ljava/util/Random;IIILvt2;I)Lxi1;
      // 64: astore 9
      // 66: aload 9
      // 68: aload 8
      // 6a: ifnull 91
      // 6d: ifnull 8f
      // 70: goto 77
      // 73: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 1
      // 78: aload 9
      // 7a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7f: pop
      // 80: aload 9
      // 82: aload 0
      // 83: aload 1
      // 84: aload 2
      // 85: invokevirtual xi1.vxr (Lxi1;Ljava/util/List;Ljava/util/Random;)V
      // 88: goto 8f
      // 8b: invokestatic net/minecraft/world/gen/structure/StructureMineshaftPieces.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 9
      // 91: areturn
      // 92: aconst_null
      // 93: areturn
   }

   public static xi1 tba(xi1 var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7) {
      return e7l(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static List _e6() {
      return ppp;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8231347371833349743L, 1089954728234030773L, MethodHandles.lookup().lookupClass()).a(80915463997596L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 61866230203867L;
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
      String var6 = "\u0007áé¿Ý\u0093r°¡\u0015ÙÎ\u008a*¨Ê(Ð`%õÕûÀ 5\u0010¼6\u008fI¦d\u000fâD)¤\u0094\u0018\u000e¸¤{\u0092É\u0084ÊjÖe` \u0082²\u0012{";
      int var8 = "\u0007áé¿Ý\u0093r°¡\u0015ÙÎ\u008a*¨Ê(Ð`%õÕûÀ 5\u0010¼6\u008fI¦d\u000fâD)¤\u0094\u0018\u000e¸¤{\u0092É\u0084ÊjÖe` \u0082²\u0012{".length();
      char var5 = 24;
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
                     c = new String[4];
                     ppp = Lists.newArrayList(
                        new ypi[]{
                           new ypi(xbr.icz, 0, 1, 5, 10),
                           new ypi(xbr.jtr, 0, 1, 3, 5),
                           new ypi(xbr.deg, 0, 4, 9, 5),
                           new ypi(xbr.nnn, qvg.o71.b9d(), 4, 9, 5),
                           new ypi(xbr.exg, 0, 1, 2, 3),
                           new ypi(xbr.thr, 0, 3, 8, 10),
                           new ypi(xbr.nfb, 0, 1, 3, 15),
                           new ypi(xbr.l4f, 0, 1, 1, 1),
                           new ypi(u7m.gfm(ox_.r_v), 0, 4, 8, 1),
                           new ypi(xbr.k_k, 0, 2, 4, 10),
                           new ypi(xbr.d0o, 0, 2, 4, 10),
                           new ypi(xbr.fpq, 0, 1, 1, 3),
                           new ypi(xbr.mhm, 0, 1, 1, 1)
                        }
                     );
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

                  var6 = "ìó\u009eþÄ\u0019\u009bKù\u0016\u008et'´GÔ S\u0082%o\u0081'Û#á\u009fÅªG\u009ay\u0082ó°E\u0082hZ#2§L\u008cÁ\u0089\u0084Vâ";
                  var8 = "ìó\u009eþÄ\u0019\u009bKù\u0016\u008et'´GÔ S\u0082%o\u0081'Û#á\u009fÅªG\u009ay\u0082ó°E\u0082hZ#2§L\u008cÁ\u0089\u0084Vâ".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13485;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureMineshaftPieces" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
