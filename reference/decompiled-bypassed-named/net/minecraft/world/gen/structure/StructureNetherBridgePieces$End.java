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

public class StructureNetherBridgePieces$End extends StructureNetherBridgePieces$Piece {
   private int i6q;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map h = new HashMap(13);

   public StructureNetherBridgePieces$End() {
   }

   public StructureNetherBridgePieces$End(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.yqm = var3;
      this.i6q = var2.nextInt();
   }

   public static StructureNetherBridgePieces$End d81(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: iload 3
      // 02: iload 4
      // 04: bipush -1
      // 05: bipush -3
      // 07: bipush 0
      // 08: bipush 5
      // 09: bipush 10
      // 0b: bipush 8
      // 0d: aload 5
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 7
      // 14: aload 7
      // 16: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$End.ulp (Lyve;)Z
      // 19: ifeq 41
      // 1c: aload 0
      // 1d: aload 7
      // 1f: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 22: ifnonnull 41
      // 25: goto 2c
      // 28: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$End.a (Loov;)Loov;
      // 2b: athrow
      // 2c: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$End
      // 2f: dup
      // 30: iload 6
      // 32: aload 1
      // 33: aload 7
      // 35: aload 5
      // 37: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$End.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 3a: goto 42
      // 3d: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$End.a (Loov;)Loov;
      // 40: athrow
      // 41: aconst_null
      // 42: areturn
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 59325986443944L;
      super.oqf(var1);
      this.i6q = var1.uz7(b<"g">(10502, 3442519166307906693L ^ var2));
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 83181804018627L;
      super.z0d(var1);
      var1.iin(b<"g">(14083, 3758912010884670442L ^ var2), this.i6q);
   }

   @Override
   public boolean d__(OpaquePredicate var1, Random var2, yve var3) {
      Random var5 = new Random((long)this.i6q);
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      int var6 = 0;
      EntityLivingBase[] var4 = var10000;

      while (true) {
         if (var6 <= 4) {
            var19 = 3;
            if (var4 == null) {
               break;
            }

            int var7 = 3;

            label94: {
               while (var7 <= 4) {
                  int var8 = var5.nextInt(8);

                  try {
                     this.gys(var1, var3, var6, var7, 0, var6, var7, var8, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
                     var7++;
                     if (var4 == null) {
                        break label94;
                     }

                     if (var4 == null) {
                        break;
                     }
                  } catch (oov var12) {
                     throw a(var12);
                  }
               }

               var6++;
            }

            if (var4 != null) {
               continue;
            }
         }

         var6 = var5.nextInt(8);
         this.gys(var1, var3, 0, 5, 0, 0, 5, var6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
         var6 = var5.nextInt(8);
         this.gys(var1, var3, 4, 5, 0, 4, 5, var6, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
         var19 = 0;
         break;
      }

      var6 = var19;

      while (true) {
         if (var6 <= 4) {
            int var16 = var5.nextInt(5);

            try {
               this.gys(var1, var3, var6, 2, 0, var6, 2, var16, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
               var6++;
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  continue;
               }
            } catch (oov var11) {
               throw a(var11);
            }
         }

         var6 = 0;
         break;
      }

      label66:
      do {
         try {
            if (var6 > 4) {
               break;
            }

            var20 = 0;
            if (var4 == null) {
               return (boolean)0;
            }
         } catch (oov var10) {
            throw a(var10);
         }

         int var17 = var20;

         while (var17 <= 1) {
            int var18 = var5.nextInt(3);

            try {
               this.gys(var1, var3, var6, var17, 0, var6, var17, var18, ox_.cbk.l4i(), ox_.cbk.l4i(), false);
               var17++;
               if (var4 == null) {
                  continue label66;
               }

               if (var4 == null) {
                  break;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         var6++;
      } while (var4 != null);

      return (boolean)1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5763574682486382126L, 6819001424287204820L, MethodHandles.lookup().lookupClass()).a(220559475925290L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 125430162003088L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "?\u0004(Àw\u009e-\u008aî¡_\u0006jÀÎ\u0004\u0010Oóãë¹aCþèË\u0083<\u0081Ëø\u0080";
      int var8 = "?\u0004(Àw\u009e-\u008aî¡_\u0006jÀÎ\u0004\u0010Oóãë¹aCþèË\u0083<\u0081Ëø\u0080".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4527;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces$End", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces$End" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
