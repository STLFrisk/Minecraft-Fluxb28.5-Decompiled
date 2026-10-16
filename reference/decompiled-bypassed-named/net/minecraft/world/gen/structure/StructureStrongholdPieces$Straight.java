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

public class StructureStrongholdPieces$Straight extends StructureStrongholdPieces$Stronghold {
   private boolean g2k;
   private boolean dfs;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$Straight() {
   }

   public StructureStrongholdPieces$Straight(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.p7m = var4;
      this.ppu = this.i2t(var2);
      EntityLivingBase[] var5 = var10000;

      int var10001;
      label39: {
         label38: {
            try {
               this.yqm = var3;
               var8 = this;
               var10001 = var2.nextInt(2);
               if (var5 == null) {
                  break label39;
               }

               if (var10001 == 0) {
                  break label38;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var10001 = 0;
            break label39;
         }

         var10001 = 1;
      }

      label30: {
         label29: {
            try {
               var8.g2k = (boolean)var10001;
               var9 = this;
               var10001 = var2.nextInt(2);
               if (var5 == null) {
                  break label30;
               }

               if (var10001 == 0) {
                  break label29;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var10001 = 0;
            break label30;
         }

         var10001 = 1;
      }

      var9.dfs = (boolean)var10001;
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 76590153941276L;
      super.z0d(var1);
      var1.zyu(c<"l">(9145, 2709042804220580262L ^ var2), this.g2k);
      var1.zyu(c<"l">(15645, 2143239994937822976L ^ var2), this.dfs);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 65949849028727L;
      super.oqf(var1);
      this.g2k = var1.dvl(c<"l">(8486, 8270963221071796819L ^ var2));
      this.dfs = var1.dvl(c<"l">(3440, 3436630739956643335L ^ var2));
   }

   @Override
   public void vxr(xi1 param1, List param2, Random param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 4
      // 05: aload 0
      // 06: aload 1
      // 07: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 0a: aload 2
      // 0b: aload 3
      // 0c: bipush 1
      // 0d: bipush 1
      // 0e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.bmb (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 11: pop
      // 12: aload 0
      // 13: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.g2k Z
      // 16: aload 4
      // 18: ifnull 49
      // 1b: ifeq 39
      // 1e: goto 25
      // 21: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 2a: aload 2
      // 2b: aload 3
      // 2c: bipush 1
      // 2d: bipush 2
      // 2e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.go3 (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 31: pop
      // 32: goto 39
      // 35: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 4
      // 3c: ifnull 5f
      // 3f: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.dfs Z
      // 42: goto 49
      // 45: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 48: athrow
      // 49: ifeq 60
      // 4c: aload 0
      // 4d: aload 1
      // 4e: checkcast net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2
      // 51: aload 2
      // 52: aload 3
      // 53: bipush 1
      // 54: bipush 2
      // 55: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.ywi (Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lxi1;
      // 58: goto 5f
      // 5b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 5e: athrow
      // 5f: pop
      // 60: return
   }

   public static StructureStrongholdPieces$Straight mc_(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 05: bipush -1
      // 06: bipush 0
      // 07: bipush 5
      // 08: bipush 5
      // 09: bipush 7
      // 0b: aload 5
      // 0d: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 10: astore 7
      // 12: aload 7
      // 14: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.jty (Lyve;)Z
      // 17: ifeq 3f
      // 1a: aload 0
      // 1b: aload 7
      // 1d: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 20: ifnonnull 3f
      // 23: goto 2a
      // 26: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 29: athrow
      // 2a: new net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight
      // 2d: dup
      // 2e: iload 6
      // 30: aload 1
      // 31: aload 7
      // 33: aload 5
      // 35: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 38: goto 40
      // 3b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aconst_null
      // 40: areturn
   }

   @Override
   public boolean d__(OpaquePredicate param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: aload 1
      // 007: aload 3
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 09e
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 1
      // 022: aload 3
      // 023: bipush 0
      // 024: bipush 0
      // 025: bipush 0
      // 026: bipush 4
      // 027: bipush 4
      // 028: bipush 6
      // 02a: bipush 1
      // 02b: aload 2
      // 02c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces.y2t ()Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$cw5;
      // 02f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 032: aload 0
      // 033: aload 1
      // 034: aload 2
      // 035: aload 3
      // 036: aload 0
      // 037: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 03a: bipush 1
      // 03b: bipush 1
      // 03c: bipush 0
      // 03d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 040: aload 0
      // 041: aload 1
      // 042: aload 2
      // 043: aload 3
      // 044: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy.waj Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 047: bipush 1
      // 048: bipush 1
      // 049: bipush 6
      // 04b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 04e: aload 0
      // 04f: aload 1
      // 050: aload 3
      // 051: aload 2
      // 052: ldc 0.1
      // 054: nop
      // 055: bipush 1
      // 056: bipush 2
      // 057: bipush 1
      // 058: getstatic ox_.gt8 Le0x;
      // 05b: invokevirtual e0x.l4i ()Lzfz;
      // 05e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 061: aload 0
      // 062: aload 1
      // 063: aload 3
      // 064: aload 2
      // 065: ldc 0.1
      // 067: nop
      // 068: bipush 3
      // 069: bipush 2
      // 06a: bipush 1
      // 06b: getstatic ox_.gt8 Le0x;
      // 06e: invokevirtual e0x.l4i ()Lzfz;
      // 071: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 074: aload 0
      // 075: aload 1
      // 076: aload 3
      // 077: aload 2
      // 078: ldc 0.1
      // 07a: nop
      // 07b: bipush 1
      // 07c: bipush 2
      // 07d: bipush 5
      // 07e: getstatic ox_.gt8 Le0x;
      // 081: invokevirtual e0x.l4i ()Lzfz;
      // 084: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 087: aload 0
      // 088: aload 1
      // 089: aload 3
      // 08a: aload 2
      // 08b: ldc 0.1
      // 08d: nop
      // 08e: bipush 3
      // 08f: bipush 2
      // 090: bipush 5
      // 091: getstatic ox_.gt8 Le0x;
      // 094: invokevirtual e0x.l4i ()Lzfz;
      // 097: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.cyn (Lt9d;Lyve;Ljava/util/Random;FIIILzfz;)V
      // 09a: aload 0
      // 09b: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.g2k Z
      // 09e: aload 4
      // 0a0: ifnull 0d1
      // 0a3: ifeq 0cd
      // 0a6: goto 0ad
      // 0a9: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: aload 3
      // 0b0: bipush 0
      // 0b1: bipush 1
      // 0b2: bipush 2
      // 0b3: bipush 0
      // 0b4: bipush 3
      // 0b5: bipush 4
      // 0b6: getstatic ox_.ibw Le0x;
      // 0b9: invokevirtual e0x.l4i ()Lzfz;
      // 0bc: getstatic ox_.ibw Le0x;
      // 0bf: invokevirtual e0x.l4i ()Lzfz;
      // 0c2: bipush 0
      // 0c3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c6: goto 0cd
      // 0c9: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.dfs Z
      // 0d1: aload 4
      // 0d3: ifnull 101
      // 0d6: ifeq 100
      // 0d9: goto 0e0
      // 0dc: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: aload 1
      // 0e2: aload 3
      // 0e3: bipush 4
      // 0e4: bipush 1
      // 0e5: bipush 2
      // 0e6: bipush 4
      // 0e7: bipush 3
      // 0e8: bipush 4
      // 0e9: getstatic ox_.ibw Le0x;
      // 0ec: invokevirtual e0x.l4i ()Lzfz;
      // 0ef: getstatic ox_.ibw Le0x;
      // 0f2: invokevirtual e0x.l4i ()Lzfz;
      // 0f5: bipush 0
      // 0f6: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f9: goto 100
      // 0fc: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight.a (Loov;)Loov;
      // 0ff: athrow
      // 100: bipush 1
      // 101: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4808942437469986657L, 8797088964860966347L, MethodHandles.lookup().lookupClass()).a(64827718561983L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 54512764294556L;
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
      String var6 = "û\u001f(\u000b\u001aª§G,WøA@pÀ\u0093\u0010õ\\\".\u0097=p\u0011½¶uéôuc\t";
      int var8 = "û\u001f(\u000b\u001aª§G,WøA@pÀ\u0093\u0010õ\\\".\u0097=p\u0011½¶uéôuc\t".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     k = var9;
                     l = new String[4];
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

                  var6 = "M\u0089\u001c\u008b)sD½ÇjÜdµ}\u0010S\u0010bþðz. ®]$\u0001Ié\u0090.\u0011?";
                  var8 = "M\u0089\u001c\u008b)sD½ÇjÜdµ}\u0010S\u0010bþðz. ®]$\u0001Ié\u0090.\u0011?".length();
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14170;
      if (l[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         l[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return l[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Straight" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
