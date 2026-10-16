package net.minecraft.world.gen.structure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MapGenVillage extends fln {
   public static final List a3x;
   private int m6e;
   private int ej7 = 32;
   private int hsa = 8;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public MapGenVillage() {
   }

   public MapGenVillage(Map param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/world/gen/structure/MapGenVillage.b J
      // 03: ldc2_w 38491972697304
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: invokespecial net/minecraft/world/gen/structure/MapGenVillage.<init> ()V
      // 0c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0f: aload 1
      // 10: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 15: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1a: astore 5
      // 1c: astore 4
      // 1e: aload 5
      // 20: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25: ifeq cc
      // 28: aload 5
      // 2a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f: checkcast java/util/Map$Entry
      // 32: astore 6
      // 34: aload 6
      // 36: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 3b: checkcast java/lang/String
      // 3e: sipush 18287
      // 41: ldc2_w 4153014356129082471
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic u (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/MapGenVillage.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f: aload 4
      // 51: ifnull a2
      // 54: ifeq 80
      // 57: goto 5e
      // 5a: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 6
      // 61: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 66: checkcast java/lang/String
      // 69: aload 0
      // 6a: getfield net/minecraft/world/gen/structure/MapGenVillage.m6e I
      // 6d: bipush 0
      // 6e: invokestatic fe6.rfv (Ljava/lang/String;II)I
      // 71: putfield net/minecraft/world/gen/structure/MapGenVillage.m6e I
      // 74: aload 4
      // 76: ifnonnull c7
      // 79: goto 80
      // 7c: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 6
      // 82: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 87: checkcast java/lang/String
      // 8a: sipush 7366
      // 8d: ldc2_w 4651970774594467788
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic u (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/MapGenVillage.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9b: goto a2
      // 9e: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // a1: athrow
      // a2: ifeq c7
      // a5: aload 0
      // a6: aload 6
      // a8: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // ad: checkcast java/lang/String
      // b0: aload 0
      // b1: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // b4: aload 0
      // b5: getfield net/minecraft/world/gen/structure/MapGenVillage.hsa I
      // b8: bipush 1
      // b9: iadd
      // ba: invokestatic fe6.rfv (Ljava/lang/String;II)I
      // bd: putfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // c0: goto c7
      // c3: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // c6: athrow
      // c7: aload 4
      // c9: ifnonnull 1e
      // cc: return
   }

   @Override
   public String tqd() {
      long var1 = b ^ 90504900694108L;
      return b<"u">(5509, 8408112680004162058L ^ var1);
   }

   @Override
   public boolean ary(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: istore 4
      // 03: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 06: iload 2
      // 07: istore 5
      // 09: astore 3
      // 0a: iload 1
      // 0b: aload 3
      // 0c: ifnull 23
      // 0f: ifge 22
      // 12: goto 19
      // 15: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // 18: athrow
      // 19: iload 1
      // 1a: aload 0
      // 1b: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 1e: bipush 1
      // 1f: isub
      // 20: isub
      // 21: istore 1
      // 22: iload 2
      // 23: aload 3
      // 24: ifnull 40
      // 27: ifge 3a
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 2
      // 32: aload 0
      // 33: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 36: bipush 1
      // 37: isub
      // 38: isub
      // 39: istore 2
      // 3a: iload 1
      // 3b: aload 0
      // 3c: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 3f: idiv
      // 40: istore 6
      // 42: iload 2
      // 43: aload 0
      // 44: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 47: idiv
      // 48: istore 7
      // 4a: aload 0
      // 4b: getfield net/minecraft/world/gen/structure/MapGenVillage.pr9 Lt9d;
      // 4e: iload 6
      // 50: iload 7
      // 52: ldc 10387312
      // 54: nop
      // 55: invokevirtual OpaquePredicate.v1h (III)Ljava/util/Random;
      // 58: astore 8
      // 5a: iload 6
      // 5c: aload 0
      // 5d: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 60: imul
      // 61: istore 6
      // 63: iload 7
      // 65: aload 0
      // 66: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 69: imul
      // 6a: istore 7
      // 6c: iload 6
      // 6e: aload 8
      // 70: aload 0
      // 71: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 74: aload 0
      // 75: getfield net/minecraft/world/gen/structure/MapGenVillage.hsa I
      // 78: isub
      // 79: invokevirtual java/util/Random.nextInt (I)I
      // 7c: iadd
      // 7d: istore 6
      // 7f: iload 7
      // 81: aload 8
      // 83: aload 0
      // 84: getfield net/minecraft/world/gen/structure/MapGenVillage.ej7 I
      // 87: aload 0
      // 88: getfield net/minecraft/world/gen/structure/MapGenVillage.hsa I
      // 8b: isub
      // 8c: invokevirtual java/util/Random.nextInt (I)I
      // 8f: iadd
      // 90: istore 7
      // 92: iload 4
      // 94: aload 3
      // 95: ifnull f4
      // 98: iload 6
      // 9a: if_icmpne f3
      // 9d: goto a4
      // a0: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // a3: athrow
      // a4: iload 5
      // a6: aload 3
      // a7: ifnull f4
      // aa: goto b1
      // ad: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // b0: athrow
      // b1: iload 7
      // b3: if_icmpne f3
      // b6: goto bd
      // b9: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 0
      // be: getfield net/minecraft/world/gen/structure/MapGenVillage.pr9 Lt9d;
      // c1: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // c4: iload 4
      // c6: bipush 16
      // c8: imul
      // c9: bipush 8
      // cb: iadd
      // cc: iload 5
      // ce: bipush 16
      // d0: imul
      // d1: bipush 8
      // d3: iadd
      // d4: bipush 0
      // d5: getstatic net/minecraft/world/gen/structure/MapGenVillage.a3x Ljava/util/List;
      // d8: invokevirtual cdp.h4l (IIILjava/util/List;)Z
      // db: istore 9
      // dd: iload 9
      // df: aload 3
      // e0: ifnull f4
      // e3: ifeq f3
      // e6: goto ed
      // e9: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // ec: athrow
      // ed: bipush 1
      // ee: ireturn
      // ef: invokestatic net/minecraft/world/gen/structure/MapGenVillage.a (Loov;)Loov;
      // f2: athrow
      // f3: bipush 0
      // f4: ireturn
   }

   @Override
   public ijb sph(int var1, int var2) {
      return new MapGenVillage$Start(this.pr9, this.a0f, var1, var2, this.m6e);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(268067139603591491L, 2140813606386423755L, MethodHandles.lookup().lookupClass()).a(178565747620256L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 35429247970177L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "]\u0000\u008d\u0016¶uÉ²ÈNqüÀÛ\\\u0003~t¡²^\u0019±\u0010f¶øÏdýæ\u008e\u0010\u00ad\u0004\u0087Ã/\u0086*\u0090\n\u0082\u0003v0\u0080\u0011d\u00106éúO\u0001R\"\u0090\u0087Óé ëÂÁ\u008a";
      int var8 = "]\u0000\u008d\u0016¶uÉ²ÈNqüÀÛ\\\u0003~t¡²^\u0019±\u0010f¶øÏdýæ\u008e\u0010\u00ad\u0004\u0087Ã/\u0086*\u0090\n\u0082\u0003v0\u0080\u0011d\u00106éúO\u0001R\"\u0090\u0087Óé ëÂÁ\u008a"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[3];
            a3x = Arrays.asList(gyu.wqh, gyu._cz, gyu.qgg);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15998;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/MapGenVillage", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("net/minecraft/world/gen/structure/MapGenVillage" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
