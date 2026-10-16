package net.minecraft.world.gen.structure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ComponentScatteredFeaturePieces$Feature extends xi1 {
   public int cu2;
   public int n8e;
   public int kr0;
   public int opl = -1;
   private static final long b;
   private static final String[] c;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public ComponentScatteredFeaturePieces$Feature() {
   }

   public ComponentScatteredFeaturePieces$Feature(Random param1, int param2, int param3, int param4, int param5, int param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: invokespecial xi1.<init> (I)V
      // 05: aload 0
      // 06: bipush -1
      // 07: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.opl I
      // 0a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0d: aload 0
      // 0e: iload 5
      // 10: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.cu2 I
      // 13: astore 8
      // 15: aload 0
      // 16: iload 6
      // 18: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.n8e I
      // 1b: aload 0
      // 1c: iload 7
      // 1e: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.kr0 I
      // 21: aload 0
      // 22: aload 8
      // 24: ifnull 92
      // 27: getstatic vt2$unz.fzl Lvt2$unz;
      // 2a: aload 1
      // 2b: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 2e: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.p7m Lvt2;
      // 31: getstatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$1.quh [I
      // 34: aload 0
      // 35: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.p7m Lvt2;
      // 38: invokevirtual vt2.ordinal ()I
      // 3b: iaload
      // 3c: lookupswitch 78 2 1 32 2 32
      // 58: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: new yve
      // 60: dup
      // 61: iload 2
      // 62: iload 3
      // 63: iload 4
      // 65: iload 2
      // 66: iload 5
      // 68: iadd
      // 69: bipush 1
      // 6a: isub
      // 6b: iload 3
      // 6c: iload 6
      // 6e: iadd
      // 6f: bipush 1
      // 70: isub
      // 71: iload 4
      // 73: iload 7
      // 75: iadd
      // 76: bipush 1
      // 77: isub
      // 78: invokespecial yve.<init> (IIIIII)V
      // 7b: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // 7e: aload 8
      // 80: ifnonnull b3
      // 83: goto 8a
      // 86: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: goto 92
      // 8e: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // 91: athrow
      // 92: new yve
      // 95: dup
      // 96: iload 2
      // 97: iload 3
      // 98: iload 4
      // 9a: iload 2
      // 9b: iload 7
      // 9d: iadd
      // 9e: bipush 1
      // 9f: isub
      // a0: iload 3
      // a1: iload 6
      // a3: iadd
      // a4: bipush 1
      // a5: isub
      // a6: iload 4
      // a8: iload 5
      // aa: iadd
      // ab: bipush 1
      // ac: isub
      // ad: invokespecial yve.<init> (IIIIII)V
      // b0: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // b3: return
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 29513803812340L;
      var1.iin(b<"n">(14222, 8017459166669939199L ^ var2), this.cu2);
      var1.iin(b<"n">(29657, 2419195046338553263L ^ var2), this.n8e);
      var1.iin(b<"n">(20840, 6789356572484618013L ^ var2), this.kr0);
      var1.iin(b<"n">(8120, 9137339190738422219L ^ var2), this.opl);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 110518542173343L;
      this.cu2 = var1.uz7(b<"n">(28496, 8293956929353822281L ^ var2));
      this.n8e = var1.uz7(b<"n">(10663, 3179376113113167544L ^ var2));
      this.kr0 = var1.uz7(b<"n">(26664, 5150658800061036339L ^ var2));
      this.opl = var1.uz7(b<"n">(19568, 5088649375759537004L ^ var2));
   }

   public boolean s8h(OpaquePredicate param1, yve param2, int param3) {
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
      // 06: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.opl I
      // 09: aload 4
      // 0b: ifnull 1f
      // 0e: iflt 1e
      // 11: goto 18
      // 14: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: istore 5
      // 21: bipush 0
      // 22: istore 6
      // 24: new mew$mix
      // 27: dup
      // 28: invokespecial mew$mix.<init> ()V
      // 2b: astore 7
      // 2d: aload 0
      // 2e: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // 31: getfield yve.ob0 I
      // 34: istore 8
      // 36: iload 8
      // 38: aload 0
      // 39: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // 3c: getfield yve.nwc I
      // 3f: if_icmpgt ad
      // 42: aload 0
      // 43: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // 46: getfield yve.gdj I
      // 49: aload 4
      // 4b: ifnull af
      // 4e: istore 9
      // 50: iload 9
      // 52: aload 0
      // 53: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // 56: getfield yve.kwp I
      // 59: if_icmpgt a5
      // 5c: aload 7
      // 5e: iload 9
      // 60: bipush 64
      // 62: iload 8
      // 64: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 67: pop
      // 68: aload 4
      // 6a: ifnull a0
      // 6d: aload 2
      // 6e: aload 7
      // 70: invokevirtual yve.vwy (Lwgo;)Z
      // 73: aload 4
      // 75: ifnull 38
      // 78: goto 7f
      // 7b: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // 7e: athrow
      // 7f: ifeq 9d
      // 82: iload 5
      // 84: aload 1
      // 85: aload 7
      // 87: invokevirtual OpaquePredicate.pnv (Lmew;)Lmew;
      // 8a: invokevirtual mew.getY ()I
      // 8d: aload 1
      // 8e: getfield OpaquePredicate.vzz Lupn;
      // 91: invokevirtual upn.z9e ()I
      // 94: invokestatic java/lang/Math.max (II)I
      // 97: iadd
      // 98: istore 5
      // 9a: iinc 6 1
      // 9d: iinc 9 1
      // a0: aload 4
      // a2: ifnonnull 50
      // a5: iinc 8 1
      // a8: aload 4
      // aa: ifnonnull 36
      // ad: iload 6
      // af: aload 4
      // b1: ifnull e5
      // b4: ifne c4
      // b7: goto be
      // ba: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // bd: athrow
      // be: bipush 0
      // bf: ireturn
      // c0: invokestatic net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.b (Loov;)Loov;
      // c3: athrow
      // c4: aload 0
      // c5: iload 5
      // c7: iload 6
      // c9: idiv
      // ca: putfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.opl I
      // cd: aload 0
      // ce: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // d1: bipush 0
      // d2: aload 0
      // d3: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.opl I
      // d6: aload 0
      // d7: getfield net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature.yqm Lyve;
      // da: getfield yve._3o I
      // dd: isub
      // de: iload 3
      // df: iadd
      // e0: bipush 0
      // e1: invokevirtual yve.gbw (III)V
      // e4: bipush 1
      // e5: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3629677065664139698L, -4967298359168779453L, MethodHandles.lookup().lookupClass()).a(119748969440294L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 5700089294098L;
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
      String var6 = "ý±ròÝ«öæ×»*À\u001dd®º\u0010\u0097ºý]\u001d2^_×\u0094§Ô¨\u008aäA\u0010¬7\u00077;*Õé\u0014Á\u0012ò\u0019ñq2\u0010§\u0014ÿ\u0002g\u0093:ãQÓnÃcmi=\u0010ò\u0095ô\u0011\u000f{('(Â\u0090Õ®O\u0019\u0095\u0010\u0085G¯\nû6¿\u000fÒÜ¿ß=u¿â";
      int var8 = "ý±ròÝ«öæ×»*À\u001dd®º\u0010\u0097ºý]\u001d2^_×\u0094§Ô¨\u008aäA\u0010¬7\u00077;*Õé\u0014Á\u0012ò\u0019ñq2\u0010§\u0014ÿ\u0002g\u0093:ãQÓnÃcmi=\u0010ò\u0095ô\u0011\u000f{('(Â\u0090Õ®O\u0019\u0095\u0010\u0085G¯\nû6¿\u000fÒÜ¿ß=u¿â"
         .length();
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
                     c = var9;
                     h = new String[8];
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

                  var6 = "ÈåÙ°Î¥\u009f9ë×÷6\u0090\u008fèÀ\u0010°ø4\u001f\u009còé\u0018yC\u0000\u00064-7Ø";
                  var8 = "ÈåÙ°Î¥\u009f9ë×÷6\u0090\u008fèÀ\u0010°ø4\u001f\u009còé\u0018yC\u0000\u00064-7Ø".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21300;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
