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

public class MapGenVillage$Start extends ijb {
   private boolean j72;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public MapGenVillage$Start() {
   }

   public MapGenVillage$Start(t9d param1, Random param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: iload 3
      // 002: iload 4
      // 004: invokespecial ijb.<init> (II)V
      // 007: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 00a: aload 2
      // 00b: iload 5
      // 00d: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces.s5k (Ljava/util/Random;I)Ljava/util/List;
      // 010: astore 7
      // 012: astore 6
      // 014: new net/minecraft/world/gen/structure/StructureVillagePieces$Start
      // 017: dup
      // 018: aload 1
      // 019: invokevirtual t9d.ql0 ()Lcdp;
      // 01c: bipush 0
      // 01d: aload 2
      // 01e: iload 3
      // 01f: bipush 4
      // 020: ishl
      // 021: bipush 2
      // 022: iadd
      // 023: iload 4
      // 025: bipush 4
      // 026: ishl
      // 027: bipush 2
      // 028: iadd
      // 029: aload 7
      // 02b: iload 5
      // 02d: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Start.<init> (Lcdp;ILjava/util/Random;IILjava/util/List;I)V
      // 030: astore 8
      // 032: aload 0
      // 033: getfield net/minecraft/world/gen/structure/MapGenVillage$Start.x9y Ljava/util/LinkedList;
      // 036: aload 8
      // 038: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
      // 03b: pop
      // 03c: aload 8
      // 03e: aload 8
      // 040: aload 0
      // 041: getfield net/minecraft/world/gen/structure/MapGenVillage$Start.x9y Ljava/util/LinkedList;
      // 044: aload 2
      // 045: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Start.vxr (Lxi1;Ljava/util/List;Ljava/util/Random;)V
      // 048: aload 8
      // 04a: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.bc_ Ljava/util/List;
      // 04d: astore 9
      // 04f: aload 8
      // 051: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Start.t48 Ljava/util/List;
      // 054: astore 10
      // 056: aload 9
      // 058: invokeinterface java/util/List.isEmpty ()Z 1
      // 05d: ifeq 082
      // 060: aload 10
      // 062: invokeinterface java/util/List.isEmpty ()Z 1
      // 067: aload 6
      // 069: ifnull 090
      // 06c: aload 6
      // 06e: ifnull 0fc
      // 071: goto 078
      // 074: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 077: athrow
      // 078: ifne 0f7
      // 07b: goto 082
      // 07e: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 081: athrow
      // 082: aload 9
      // 084: invokeinterface java/util/List.isEmpty ()Z 1
      // 089: goto 090
      // 08c: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 08f: athrow
      // 090: aload 6
      // 092: ifnull 0d6
      // 095: ifeq 0cb
      // 098: goto 09f
      // 09b: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 2
      // 0a0: aload 10
      // 0a2: invokeinterface java/util/List.size ()I 1
      // 0a7: invokevirtual java/util/Random.nextInt (I)I
      // 0aa: istore 11
      // 0ac: aload 10
      // 0ae: iload 11
      // 0b0: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 0b5: checkcast xi1
      // 0b8: astore 12
      // 0ba: aload 12
      // 0bc: aload 8
      // 0be: aload 0
      // 0bf: getfield net/minecraft/world/gen/structure/MapGenVillage$Start.x9y Ljava/util/LinkedList;
      // 0c2: aload 2
      // 0c3: invokevirtual xi1.vxr (Lxi1;Ljava/util/List;Ljava/util/Random;)V
      // 0c6: aload 6
      // 0c8: ifnonnull 056
      // 0cb: aload 2
      // 0cc: aload 9
      // 0ce: invokeinterface java/util/List.size ()I 1
      // 0d3: invokevirtual java/util/Random.nextInt (I)I
      // 0d6: istore 11
      // 0d8: aload 9
      // 0da: iload 11
      // 0dc: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 0e1: checkcast xi1
      // 0e4: astore 12
      // 0e6: aload 12
      // 0e8: aload 8
      // 0ea: aload 0
      // 0eb: getfield net/minecraft/world/gen/structure/MapGenVillage$Start.x9y Ljava/util/LinkedList;
      // 0ee: aload 2
      // 0ef: invokevirtual xi1.vxr (Lxi1;Ljava/util/List;Ljava/util/Random;)V
      // 0f2: aload 6
      // 0f4: ifnonnull 056
      // 0f7: aload 0
      // 0f8: invokevirtual net/minecraft/world/gen/structure/MapGenVillage$Start.eok ()V
      // 0fb: bipush 0
      // 0fc: istore 11
      // 0fe: aload 0
      // 0ff: getfield net/minecraft/world/gen/structure/MapGenVillage$Start.x9y Ljava/util/LinkedList;
      // 102: invokevirtual java/util/LinkedList.iterator ()Ljava/util/Iterator;
      // 105: astore 12
      // 107: aload 12
      // 109: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10e: ifeq 140
      // 111: aload 12
      // 113: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 118: checkcast xi1
      // 11b: astore 13
      // 11d: aload 6
      // 11f: ifnull 162
      // 122: aload 13
      // 124: instanceof net/minecraft/world/gen/structure/StructureVillagePieces$Road
      // 127: ifne 13b
      // 12a: goto 131
      // 12d: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 130: athrow
      // 131: iinc 11 1
      // 134: goto 13b
      // 137: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 13a: athrow
      // 13b: aload 6
      // 13d: ifnonnull 107
      // 140: aload 0
      // 141: iload 11
      // 143: aload 6
      // 145: ifnull 15b
      // 148: bipush 2
      // 149: if_icmple 15e
      // 14c: goto 153
      // 14f: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 152: athrow
      // 153: bipush 1
      // 154: goto 15b
      // 157: invokestatic net/minecraft/world/gen/structure/MapGenVillage$Start.b (Loov;)Loov;
      // 15a: athrow
      // 15b: goto 15f
      // 15e: bipush 0
      // 15f: putfield net/minecraft/world/gen/structure/MapGenVillage$Start.j72 Z
      // 162: return
   }

   @Override
   public boolean z1p() {
      return this.j72;
   }

   @Override
   public void qle(bdo var1) {
      long var2 = b ^ 116746293126670L;
      super.qle(var1);
      var1.zyu(b<"r">(23074, 5119820968616999884L ^ var2), this.j72);
   }

   @Override
   public void fh4(bdo var1) {
      long var2 = b ^ 78609354287127L;
      super.fh4(var1);
      this.j72 = var1.dvl(b<"r">(8464, 1841061752299130598L ^ var2));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8425554817898262572L, -3468881643829494138L, MethodHandles.lookup().lookupClass()).a(17563384081412L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 77266886912832L;
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
      String var6 = "ê%¸ju\u0086dP\u0087<àá\u0083\u000bÅ¼\u00102ÄÜ+^E\u0094\u0007a.\u0082\u009aN°Æ\u0095";
      int var8 = "ê%¸ju\u0086dP\u0087<àá\u0083\u000bÅ¼\u00102ÄÜ+^E\u0094\u0007a.\u0082\u009aN°Æ\u0095".length();
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
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8728;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/MapGenVillage$Start", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/MapGenVillage$Start" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
