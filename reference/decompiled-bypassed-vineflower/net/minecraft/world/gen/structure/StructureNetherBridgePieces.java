package net.minecraft.world.gen.structure;

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

public class StructureNetherBridgePieces {
   private static final StructureNetherBridgePieces$r67[] h__;
   private static final StructureNetherBridgePieces$r67[] vzr;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void zit() {
      long var0 = a ^ 61670871297011L;
      v8a.kem(StructureNetherBridgePieces$Crossing3.class, a<"r">(23073, 4239710729044254637L ^ var0));
      v8a.kem(StructureNetherBridgePieces$End.class, a<"r">(8417, 4522453602922734944L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Straight.class, a<"r">(19579, 6463558265972115953L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Corridor3.class, a<"r">(28137, 7553247244015364202L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Corridor4.class, a<"r">(14517, 5289046489507708210L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Entrance.class, a<"r">(6079, 5097114256875754038L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Crossing2.class, a<"r">(23325, 2312359173727215257L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Corridor.class, a<"r">(23831, 3982932595816552594L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Corridor5.class, a<"r">(7737, 4737553967165873073L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Corridor2.class, a<"r">(29387, 5340183072157235014L ^ var0));
      v8a.kem(StructureNetherBridgePieces$NetherStalkRoom.class, a<"r">(26445, 650627717712143043L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Throne.class, a<"r">(16877, 115975799770793069L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Crossing.class, a<"r">(4763, 1460185468061390621L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Stairs.class, a<"r">(13889, 4798383661172732878L ^ var0));
      v8a.kem(StructureNetherBridgePieces$Start.class, a<"r">(9634, 3855589478163226656L ^ var0));
   }

   private static StructureNetherBridgePieces$Piece e9f(
      StructureNetherBridgePieces$r67 var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7
   ) {
      Class var9 = var0.h14;
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      StructureNetherBridgePieces$NetherStalkRoom var10 = null;
      i2h[] var8 = var10000;

      Class<StructureNetherBridgePieces$Straight> var10001;
      label211: {
         try {
            var23 = var9;
            var10001 = StructureNetherBridgePieces$Straight.class;
            if (var8 == null) {
               break label211;
            }

            if (var9 == StructureNetherBridgePieces$Straight.class) {
               return StructureNetherBridgePieces$Straight.v5r(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var22) {
            throw a(var22);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Crossing3.class;
      }

      label201: {
         try {
            if (var8 == null) {
               break label201;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Crossing3.pfx(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var21) {
            throw a(var21);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Crossing.class;
      }

      label191: {
         try {
            if (var8 == null) {
               break label191;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Crossing.t_q(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var20) {
            throw a(var20);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Stairs.class;
      }

      label181: {
         try {
            if (var8 == null) {
               break label181;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Stairs.xwq(var1, var2, var3, var4, var5, var7, var6);
            }
         } catch (oov var19) {
            throw a(var19);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Throne.class;
      }

      label171: {
         try {
            if (var8 == null) {
               break label171;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Throne.c3w(var1, var2, var3, var4, var5, var7, var6);
            }
         } catch (oov var18) {
            throw a(var18);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Entrance.class;
      }

      label161: {
         try {
            if (var8 == null) {
               break label161;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Entrance.b03(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var17) {
            throw a(var17);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Corridor5.class;
      }

      label151: {
         try {
            if (var8 == null) {
               break label151;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Corridor5.ujs(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var16) {
            throw a(var16);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Corridor2.class;
      }

      label141: {
         try {
            if (var8 == null) {
               break label141;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Corridor2.x0h(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var15) {
            throw a(var15);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Corridor.class;
      }

      label131: {
         try {
            if (var8 == null) {
               break label131;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Corridor.cy9(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var14) {
            throw a(var14);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Corridor3.class;
      }

      label121: {
         try {
            if (var8 == null) {
               break label121;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Corridor3.lne(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var13) {
            throw a(var13);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Corridor4.class;
      }

      label111: {
         try {
            if (var8 == null) {
               break label111;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Corridor4.fpu(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var12) {
            throw a(var12);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$Crossing2.class;
      }

      label101: {
         try {
            if (var8 == null) {
               break label101;
            }

            if (var23 == var10001) {
               return StructureNetherBridgePieces$Crossing2.tx5(var1, var2, var3, var4, var5, var6, var7);
            }
         } catch (oov var11) {
            throw a(var11);
         }

         var23 = var9;
         var10001 = StructureNetherBridgePieces$NetherStalkRoom.class;
      }

      if (var23 == var10001) {
         var10 = StructureNetherBridgePieces$NetherStalkRoom.uka(var1, var2, var3, var4, var5, var6, var7);
      }

      return var10;
   }

   public static StructureNetherBridgePieces$Piece nt0(
      StructureNetherBridgePieces$r67 var0, List var1, Random var2, int var3, int var4, int var5, vt2 var6, int var7
   ) {
      return e9f(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static StructureNetherBridgePieces$r67[] wrz() {
      return h__;
   }

   public static StructureNetherBridgePieces$r67[] jz0() {
      return vzr;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3125150527218449819L, -267711697190401142L, MethodHandles.lookup().lookupClass()).a(153121051771813L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 79640570866432L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "<CWùø\r¨7\u009f\u0017\rRC\u0013GÀ\u0010óÏ¤@¹0\u0080W(íÎÓ\u009dW\u0090¬\u0010U\u001bå\u009b\u009f£âÔ\tZe«\u0002ñÇ#\u0010\u008dÿÉ\u008aÃ\u008eLÎd'YÛ\u009f\u0084\u0017\u0083\u0010\u000fX=GßK{\u0001¸\u007f\u0091$ØIB4\u0010Ü¡ÓÄp´ß-I\u001dÒ\rÃÖXÕ\u0010\u0096`ãI3«©±\u0011ìdq¤\u0019Hs\u0010vèK/Í,\u0089½WrÊ£\n·ûÖ\u0010ìjyjth\u0011ý¢(kºÍdÓ\n\u0010¢\u0086Ù¾\u001bY\u0095ð7ï`ûKlZ\u000f\u00101TÁ5 l\u001eøRRuÊ\u009f¶½(\u0010\u0094\u0005ü#<ÊÜr\u0016ÃÞµ\u000b¨è\u000f\u0010rø*|ZÑ\bDõwþ\u0005à²¯h";
      int var8 = "<CWùø\r¨7\u009f\u0017\rRC\u0013GÀ\u0010óÏ¤@¹0\u0080W(íÎÓ\u009dW\u0090¬\u0010U\u001bå\u009b\u009f£âÔ\tZe«\u0002ñÇ#\u0010\u008dÿÉ\u008aÃ\u008eLÎd'YÛ\u009f\u0084\u0017\u0083\u0010\u000fX=GßK{\u0001¸\u007f\u0091$ØIB4\u0010Ü¡ÓÄp´ß-I\u001dÒ\rÃÖXÕ\u0010\u0096`ãI3«©±\u0011ìdq¤\u0019Hs\u0010vèK/Í,\u0089½WrÊ£\n·ûÖ\u0010ìjyjth\u0011ý¢(kºÍdÓ\n\u0010¢\u0086Ù¾\u001bY\u0095ð7ï`ûKlZ\u000f\u00101TÁ5 l\u001eøRRuÊ\u009f¶½(\u0010\u0094\u0005ü#<ÊÜr\u0016ÃÞµ\u000b¨è\u000f\u0010rø*|ZÑ\bDõwþ\u0005à²¯h"
         .length();
      char var5 = 16;
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
                     c = new String[15];
                     h__ = new StructureNetherBridgePieces$r67[]{
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Straight.class, 30, 0, true),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Crossing3.class, 10, 4),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Crossing.class, 10, 4),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Stairs.class, 10, 3),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Throne.class, 5, 2),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Entrance.class, 5, 1)
                     };
                     vzr = new StructureNetherBridgePieces$r67[]{
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Corridor5.class, 25, 0, true),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Crossing2.class, 15, 5),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Corridor2.class, 5, 10),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Corridor.class, 5, 10),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Corridor3.class, 10, 3, true),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$Corridor4.class, 7, 2),
                        new StructureNetherBridgePieces$r67(StructureNetherBridgePieces$NetherStalkRoom.class, 5, 2)
                     };
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

                  var6 = "é\u001cÝ\u0083\u008ff§ü\u0002IðË\u008a\u0002\u001eÐ\u0010Ó|Ü\u009e\u000f\u001dÄ3°a\u0086op\u0086Ø\u009e";
                  var8 = "é\u001cÝ\u0083\u008ff§ü\u0002IðË\u008a\u0002\u001eÐ\u0010Ó|Ü\u009e\u000f\u001dÄ3°a\u0086op\u0086Ø\u009e".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20384;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
