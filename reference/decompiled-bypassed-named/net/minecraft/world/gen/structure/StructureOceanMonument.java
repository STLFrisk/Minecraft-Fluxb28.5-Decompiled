package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
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

public class StructureOceanMonument extends fln {
   private int hm8 = 32;
   private int zam = 5;
   public static final List y8i;
   private static final List l_8;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public StructureOceanMonument() {
   }

   public StructureOceanMonument(Map param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/world/gen/structure/StructureOceanMonument.b J
      // 03: ldc2_w 87818839455689
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: invokespecial net/minecraft/world/gen/structure/StructureOceanMonument.<init> ()V
      // 0c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0f: aload 1
      // 10: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 15: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1a: astore 5
      // 1c: astore 4
      // 1e: aload 5
      // 20: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25: ifeq c7
      // 28: aload 5
      // 2a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f: checkcast java/util/Map$Entry
      // 32: astore 6
      // 34: aload 6
      // 36: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 3b: checkcast java/lang/String
      // 3e: sipush 29595
      // 41: ldc2_w 663448355546558076
      // 44: lload 2
      // 45: lxor
      // 46: invokedynamic f (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/StructureOceanMonument.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: nop
      // 4c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f: aload 4
      // 51: ifnull a2
      // 54: ifeq 80
      // 57: goto 5e
      // 5a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 6
      // 61: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 66: checkcast java/lang/String
      // 69: aload 0
      // 6a: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 6d: bipush 1
      // 6e: invokestatic fe6.rfv (Ljava/lang/String;II)I
      // 71: putfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 74: aload 4
      // 76: ifnonnull c2
      // 79: goto 80
      // 7c: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 6
      // 82: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 87: checkcast java/lang/String
      // 8a: sipush 31098
      // 8d: ldc2_w 1582563377207075999
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic f (IJ)Ljava/lang/String; bsm=net/minecraft/world/gen/structure/StructureOceanMonument.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9b: goto a2
      // 9e: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // a1: athrow
      // a2: ifeq c2
      // a5: aload 0
      // a6: aload 6
      // a8: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // ad: checkcast java/lang/String
      // b0: aload 0
      // b1: getfield net/minecraft/world/gen/structure/StructureOceanMonument.zam I
      // b4: bipush 1
      // b5: invokestatic fe6.rfv (Ljava/lang/String;II)I
      // b8: putfield net/minecraft/world/gen/structure/StructureOceanMonument.zam I
      // bb: goto c2
      // be: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // c1: athrow
      // c2: aload 4
      // c4: ifnonnull 1e
      // c7: return
   }

   @Override
   public String tqd() {
      long var1 = b ^ 138975530347341L;
      return b<"f">(28766, 7263005659930063166L ^ var1);
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
      // 000: iload 1
      // 001: istore 4
      // 003: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 006: iload 2
      // 007: istore 5
      // 009: astore 3
      // 00a: iload 1
      // 00b: aload 3
      // 00c: ifnull 023
      // 00f: ifge 022
      // 012: goto 019
      // 015: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 1
      // 01a: aload 0
      // 01b: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 01e: bipush 1
      // 01f: isub
      // 020: isub
      // 021: istore 1
      // 022: iload 2
      // 023: aload 3
      // 024: ifnull 040
      // 027: ifge 03a
      // 02a: goto 031
      // 02d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 030: athrow
      // 031: iload 2
      // 032: aload 0
      // 033: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 036: bipush 1
      // 037: isub
      // 038: isub
      // 039: istore 2
      // 03a: iload 1
      // 03b: aload 0
      // 03c: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 03f: idiv
      // 040: istore 6
      // 042: iload 2
      // 043: aload 0
      // 044: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 047: idiv
      // 048: istore 7
      // 04a: aload 0
      // 04b: getfield net/minecraft/world/gen/structure/StructureOceanMonument.pr9 Lt9d;
      // 04e: iload 6
      // 050: iload 7
      // 052: ldc 10387313
      // 054: nop
      // 055: invokevirtual OpaquePredicate.v1h (III)Ljava/util/Random;
      // 058: astore 8
      // 05a: iload 6
      // 05c: aload 0
      // 05d: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 060: imul
      // 061: istore 6
      // 063: iload 7
      // 065: aload 0
      // 066: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 069: imul
      // 06a: istore 7
      // 06c: iload 6
      // 06e: aload 8
      // 070: aload 0
      // 071: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 074: aload 0
      // 075: getfield net/minecraft/world/gen/structure/StructureOceanMonument.zam I
      // 078: isub
      // 079: invokevirtual java/util/Random.nextInt (I)I
      // 07c: aload 8
      // 07e: aload 0
      // 07f: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 082: aload 0
      // 083: getfield net/minecraft/world/gen/structure/StructureOceanMonument.zam I
      // 086: isub
      // 087: invokevirtual java/util/Random.nextInt (I)I
      // 08a: iadd
      // 08b: bipush 2
      // 08c: idiv
      // 08d: iadd
      // 08e: istore 6
      // 090: iload 7
      // 092: aload 8
      // 094: aload 0
      // 095: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 098: aload 0
      // 099: getfield net/minecraft/world/gen/structure/StructureOceanMonument.zam I
      // 09c: isub
      // 09d: invokevirtual java/util/Random.nextInt (I)I
      // 0a0: aload 8
      // 0a2: aload 0
      // 0a3: getfield net/minecraft/world/gen/structure/StructureOceanMonument.hm8 I
      // 0a6: aload 0
      // 0a7: getfield net/minecraft/world/gen/structure/StructureOceanMonument.zam I
      // 0aa: isub
      // 0ab: invokevirtual java/util/Random.nextInt (I)I
      // 0ae: iadd
      // 0af: bipush 2
      // 0b0: idiv
      // 0b1: iadd
      // 0b2: istore 7
      // 0b4: iload 4
      // 0b6: aload 3
      // 0b7: ifnull 158
      // 0ba: iload 6
      // 0bc: if_icmpne 157
      // 0bf: goto 0c6
      // 0c2: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: iload 5
      // 0c8: aload 3
      // 0c9: ifnull 158
      // 0cc: goto 0d3
      // 0cf: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 7
      // 0d5: if_icmpne 157
      // 0d8: goto 0df
      // 0db: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: getfield net/minecraft/world/gen/structure/StructureOceanMonument.pr9 Lt9d;
      // 0e3: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // 0e6: aload 3
      // 0e7: ifnull 127
      // 0ea: goto 0f1
      // 0ed: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: new mew
      // 0f4: dup
      // 0f5: iload 4
      // 0f7: bipush 16
      // 0f9: imul
      // 0fa: bipush 8
      // 0fc: iadd
      // 0fd: bipush 64
      // 0ff: iload 5
      // 101: bipush 16
      // 103: imul
      // 104: bipush 8
      // 106: iadd
      // 107: invokespecial mew.<init> (III)V
      // 10a: aconst_null
      // 10b: checkcast gyu
      // 10e: invokevirtual cdp.gwg (Lmew;Lgyu;)Lgyu;
      // 111: getstatic gyu.knf Lgyu;
      // 114: if_acmpeq 120
      // 117: goto 11e
      // 11a: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 11d: athrow
      // 11e: bipush 0
      // 11f: ireturn
      // 120: aload 0
      // 121: getfield net/minecraft/world/gen/structure/StructureOceanMonument.pr9 Lt9d;
      // 124: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // 127: iload 4
      // 129: bipush 16
      // 12b: imul
      // 12c: bipush 8
      // 12e: iadd
      // 12f: iload 5
      // 131: bipush 16
      // 133: imul
      // 134: bipush 8
      // 136: iadd
      // 137: bipush 29
      // 139: getstatic net/minecraft/world/gen/structure/StructureOceanMonument.y8i Ljava/util/List;
      // 13c: invokevirtual cdp.h4l (IIILjava/util/List;)Z
      // 13f: istore 9
      // 141: iload 9
      // 143: aload 3
      // 144: ifnull 158
      // 147: ifeq 157
      // 14a: goto 151
      // 14d: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 150: athrow
      // 151: bipush 1
      // 152: ireturn
      // 153: invokestatic net/minecraft/world/gen/structure/StructureOceanMonument.a (Loov;)Loov;
      // 156: athrow
      // 157: bipush 0
      // 158: ireturn
   }

   @Override
   public ijb sph(int var1, int var2) {
      return new StructureOceanMonument$StartMonument(this.pr9, this.a0f, var1, var2);
   }

   public List f8d() {
      return l_8;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2656323194140675382L, -4068945571676519438L, MethodHandles.lookup().lookupClass()).a(50261989217262L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 32714062927842L;
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
      String var6 = "¤ïu£ âÃ \u0099Ç\u007f\u0089Ö¼\u0095\u0098¼Þ¢ÞÜàüV]S\u001e´¯ðM[ æ\u009cÇ\u007fDÖ|¯±IÿÈCc\u0084\u008fÆâtÛ±EXµ|\u0088^p#Ya\"\u0010¾ \u0092¤ºË|Éî\u0011DmþN\u007fÒ";
      int var8 = "¤ïu£ âÃ \u0099Ç\u007f\u0089Ö¼\u0095\u0098¼Þ¢ÞÜàüV]S\u001e´¯ðM[ æ\u009cÇ\u007fDÖ|¯±IÿÈCc\u0084\u008fÆâtÛ±EXµ|\u0088^p#Ya\"\u0010¾ \u0092¤ºË|Éî\u0011DmþN\u007fÒ"
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
            y8i = Arrays.asList(gyu.jzy, gyu.knf, gyu.sgl, gyu.wlo, gyu.wrz);
            l_8 = Lists.newArrayList();
            l_8.add(new gyu$dwn(c9p.class, 1, 2, 4));
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14481;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureOceanMonument", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureOceanMonument" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
