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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MapGenScatteredFeature extends fln {
   private static final List rw7;
   private List hnc = Lists.newArrayList();
   private int qo8 = 32;
   private int rkb = 8;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public MapGenScatteredFeature() {
      this.hnc.add(new gyu$dwn(EntitySpider.class, 1, 1, 1));
   }

   public MapGenScatteredFeature(Map var1) {
      long var2 = b ^ 92806530420370L;
      this();
      EntityLivingBase[] var10000 = StructureStrongholdPieces$Stronghold.b();
      Iterator var5 = var1.entrySet().iterator();
      EntityLivingBase[] var4 = var10000;

      while (var5.hasNext()) {
         Entry var6 = (Entry)var5.next();

         try {
            if (((String)var6.getKey()).equals(b<"j">(30183, 2528649417606594711L ^ var2))) {
               this.qo8 = fe6.rfv((String)var6.getValue(), this.qo8, this.rkb + 1);
            }
         } catch (oov var7) {
            throw a(var7);
         }

         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public String tqd() {
      long var1 = b ^ 7561652533015L;
      return b<"j">(510, 3230659671375006986L ^ var1);
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
      // 015: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 1
      // 01a: aload 0
      // 01b: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 01e: bipush 1
      // 01f: isub
      // 020: isub
      // 021: istore 1
      // 022: iload 2
      // 023: aload 3
      // 024: ifnull 040
      // 027: ifge 03a
      // 02a: goto 031
      // 02d: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 030: athrow
      // 031: iload 2
      // 032: aload 0
      // 033: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 036: bipush 1
      // 037: isub
      // 038: isub
      // 039: istore 2
      // 03a: iload 1
      // 03b: aload 0
      // 03c: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 03f: idiv
      // 040: istore 6
      // 042: iload 2
      // 043: aload 0
      // 044: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 047: idiv
      // 048: istore 7
      // 04a: aload 0
      // 04b: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.pr9 Lt9d;
      // 04e: iload 6
      // 050: iload 7
      // 052: ldc 14357617
      // 054: nop
      // 055: invokevirtual OpaquePredicate.v1h (III)Ljava/util/Random;
      // 058: astore 8
      // 05a: iload 6
      // 05c: aload 0
      // 05d: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 060: imul
      // 061: istore 6
      // 063: iload 7
      // 065: aload 0
      // 066: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 069: imul
      // 06a: istore 7
      // 06c: iload 6
      // 06e: aload 8
      // 070: aload 0
      // 071: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 074: aload 0
      // 075: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.rkb I
      // 078: isub
      // 079: invokevirtual java/util/Random.nextInt (I)I
      // 07c: iadd
      // 07d: istore 6
      // 07f: iload 7
      // 081: aload 8
      // 083: aload 0
      // 084: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.qo8 I
      // 087: aload 0
      // 088: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.rkb I
      // 08b: isub
      // 08c: invokevirtual java/util/Random.nextInt (I)I
      // 08f: iadd
      // 090: istore 7
      // 092: iload 4
      // 094: aload 3
      // 095: ifnull 11e
      // 098: iload 6
      // 09a: if_icmpne 11d
      // 09d: goto 0a4
      // 0a0: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: iload 5
      // 0a6: aload 3
      // 0a7: ifnull 11e
      // 0aa: goto 0b1
      // 0ad: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: iload 7
      // 0b3: if_icmpne 11d
      // 0b6: goto 0bd
      // 0b9: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: getfield net/minecraft/world/gen/structure/MapGenScatteredFeature.pr9 Lt9d;
      // 0c1: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // 0c4: new mew
      // 0c7: dup
      // 0c8: iload 4
      // 0ca: bipush 16
      // 0cc: imul
      // 0cd: bipush 8
      // 0cf: iadd
      // 0d0: bipush 0
      // 0d1: iload 5
      // 0d3: bipush 16
      // 0d5: imul
      // 0d6: bipush 8
      // 0d8: iadd
      // 0d9: invokespecial mew.<init> (III)V
      // 0dc: invokevirtual cdp.owx (Lmew;)Lgyu;
      // 0df: astore 9
      // 0e1: aload 9
      // 0e3: ifnonnull 0ec
      // 0e6: bipush 0
      // 0e7: ireturn
      // 0e8: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: getstatic net/minecraft/world/gen/structure/MapGenScatteredFeature.rw7 Ljava/util/List;
      // 0ef: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f4: astore 10
      // 0f6: aload 10
      // 0f8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0fd: ifeq 11d
      // 100: aload 10
      // 102: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 107: checkcast gyu
      // 10a: astore 11
      // 10c: aload 9
      // 10e: aload 11
      // 110: if_acmpne 119
      // 113: bipush 1
      // 114: ireturn
      // 115: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 3
      // 11a: ifnonnull 0f6
      // 11d: bipush 0
      // 11e: ireturn
   }

   @Override
   public ijb sph(int var1, int var2) {
      return new MapGenScatteredFeature$Start(this.pr9, this.a0f, var1, var2);
   }

   public boolean s28(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual net/minecraft/world/gen/structure/MapGenScatteredFeature.aki (Lmew;)Lijb;
      // 09: astore 3
      // 0a: aload 3
      // 0b: aload 2
      // 0c: ifnull 1a
      // 0f: ifnull 59
      // 12: goto 19
      // 15: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 3
      // 1a: instanceof net/minecraft/world/gen/structure/MapGenScatteredFeature$Start
      // 1d: aload 2
      // 1e: ifnull 5a
      // 21: ifeq 59
      // 24: goto 2b
      // 27: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 3
      // 2c: getfield ijb.attack Ljava/util/LinkedList;
      // 2f: invokevirtual java/util/LinkedList.isEmpty ()Z
      // 32: aload 2
      // 33: ifnull 5a
      // 36: goto 3d
      // 39: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 3c: athrow
      // 3d: ifne 59
      // 40: goto 47
      // 43: invokestatic net/minecraft/world/gen/structure/MapGenScatteredFeature.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 3
      // 48: getfield ijb.attack Ljava/util/LinkedList;
      // 4b: invokevirtual java/util/LinkedList.getFirst ()Ljava/lang/Object;
      // 4e: checkcast xi1
      // 51: astore 4
      // 53: aload 4
      // 55: instanceof net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$SwampHut
      // 58: ireturn
      // 59: bipush 0
      // 5a: ireturn
   }

   public List wyu() {
      return this.hnc;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5980861568172362570L, -7978786168846832817L, MethodHandles.lookup().lookupClass()).a(56188877523655L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 95540653243454L;
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
      String var6 = "r\u0011º\u008aÊõ7\u0004U\u001f\u0085EèU7( ÃG\u008fa\u001c\u00adº\u000e\u000f\u0082=pÒæS\u008aøÿt¡\u009dNx±h\u008eì~dXÿJ";
      int var8 = "r\u0011º\u008aÊõ7\u0004U\u001f\u0085EèU7( ÃG\u008fa\u001c\u00adº\u000e\u000f\u0082=pÒæS\u008aøÿt¡\u009dNx±h\u008eì~dXÿJ".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[2];
            rw7 = Arrays.asList(gyu._cz, gyu.txo, gyu.bli, gyu.tlt, gyu.bpg);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29956;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/MapGenScatteredFeature", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/MapGenScatteredFeature" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
