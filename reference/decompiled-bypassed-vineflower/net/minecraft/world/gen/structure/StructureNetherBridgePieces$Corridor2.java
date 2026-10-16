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

public class StructureNetherBridgePieces$Corridor2 extends StructureNetherBridgePieces$Piece {
   private boolean i_4;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map h = new HashMap(13);

   public StructureNetherBridgePieces$Corridor2() {
   }

   public StructureNetherBridgePieces$Corridor2(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      i2h[] var10000 = StructureStrongholdPieces$Stronghold.b();
      this.yqm = var3;
      i2h[] var5 = var10000;

      int var10001;
      label22: {
         label21: {
            try {
               var7 = this;
               var10001 = var2.nextInt(3);
               if (var5 == null) {
                  break label22;
               }

               if (var10001 == 0) {
                  break label21;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var7.i_4 = (boolean)var10001;
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 126481515574115L;
      super.oqf(var1);
      this.i_4 = var1.dvl(b<"k">(25119, 7444119177555368627L ^ var2));
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 14686245763592L;
      super.z0d(var1);
      var1.zyu(b<"k">(12554, 2346967552422920396L ^ var2), this.i_4);
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.fkt((StructureNetherBridgePieces$Start)var1, var2, var3, 0, 1, true);
   }

   public static StructureNetherBridgePieces$Corridor2 x0h(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 05: bipush 0
      // 06: bipush 0
      // 07: bipush 5
      // 08: bipush 7
      // 0a: bipush 5
      // 0b: aload 5
      // 0d: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 10: astore 7
      // 12: aload 7
      // 14: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.ulp (Lyve;)Z
      // 17: ifeq 3f
      // 1a: aload 0
      // 1b: aload 7
      // 1d: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 20: ifnonnull 3f
      // 23: goto 2a
      // 26: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.a (Loov;)Loov;
      // 29: athrow
      // 2a: new net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2
      // 2d: dup
      // 2e: iload 6
      // 30: aload 1
      // 31: aload 7
      // 33: aload 5
      // 35: invokespecial net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 38: goto 40
      // 3b: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aconst_null
      // 40: areturn
   }

   @Override
   public boolean d__(t9d param1, Random param2, yve param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 3
      // 003: bipush 0
      // 004: bipush 0
      // 005: bipush 0
      // 006: bipush 4
      // 007: bipush 1
      // 008: bipush 4
      // 009: getstatic ox_.cbk Le0x;
      // 00c: invokevirtual e0x.l4i ()Lzfz;
      // 00f: getstatic ox_.cbk Le0x;
      // 012: invokevirtual e0x.l4i ()Lzfz;
      // 015: bipush 0
      // 016: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 019: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 01c: aload 0
      // 01d: aload 1
      // 01e: aload 3
      // 01f: bipush 0
      // 020: bipush 2
      // 021: bipush 0
      // 022: bipush 4
      // 023: bipush 5
      // 024: bipush 4
      // 025: getstatic ox_.ibw Le0x;
      // 028: invokevirtual e0x.l4i ()Lzfz;
      // 02b: getstatic ox_.ibw Le0x;
      // 02e: invokevirtual e0x.l4i ()Lzfz;
      // 031: bipush 0
      // 032: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 035: astore 4
      // 037: aload 0
      // 038: aload 1
      // 039: aload 3
      // 03a: bipush 0
      // 03b: bipush 2
      // 03c: bipush 0
      // 03d: bipush 0
      // 03e: bipush 5
      // 03f: bipush 4
      // 040: getstatic ox_.cbk Le0x;
      // 043: invokevirtual e0x.l4i ()Lzfz;
      // 046: getstatic ox_.cbk Le0x;
      // 049: invokevirtual e0x.l4i ()Lzfz;
      // 04c: bipush 0
      // 04d: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 050: aload 0
      // 051: aload 1
      // 052: aload 3
      // 053: bipush 0
      // 054: bipush 3
      // 055: bipush 1
      // 056: bipush 0
      // 057: bipush 4
      // 058: bipush 1
      // 059: getstatic ox_.laa Le0x;
      // 05c: invokevirtual e0x.l4i ()Lzfz;
      // 05f: getstatic ox_.laa Le0x;
      // 062: invokevirtual e0x.l4i ()Lzfz;
      // 065: bipush 0
      // 066: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 069: aload 0
      // 06a: aload 1
      // 06b: aload 3
      // 06c: bipush 0
      // 06d: bipush 3
      // 06e: bipush 3
      // 06f: bipush 0
      // 070: bipush 4
      // 071: bipush 3
      // 072: getstatic ox_.laa Le0x;
      // 075: invokevirtual e0x.l4i ()Lzfz;
      // 078: getstatic ox_.laa Le0x;
      // 07b: invokevirtual e0x.l4i ()Lzfz;
      // 07e: bipush 0
      // 07f: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 082: aload 0
      // 083: aload 1
      // 084: aload 3
      // 085: bipush 4
      // 086: bipush 2
      // 087: bipush 0
      // 088: bipush 4
      // 089: bipush 5
      // 08a: bipush 0
      // 08b: getstatic ox_.cbk Le0x;
      // 08e: invokevirtual e0x.l4i ()Lzfz;
      // 091: getstatic ox_.cbk Le0x;
      // 094: invokevirtual e0x.l4i ()Lzfz;
      // 097: bipush 0
      // 098: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 09b: aload 0
      // 09c: aload 1
      // 09d: aload 3
      // 09e: bipush 1
      // 09f: bipush 2
      // 0a0: bipush 4
      // 0a1: bipush 4
      // 0a2: bipush 5
      // 0a3: bipush 4
      // 0a4: getstatic ox_.cbk Le0x;
      // 0a7: invokevirtual e0x.l4i ()Lzfz;
      // 0aa: getstatic ox_.cbk Le0x;
      // 0ad: invokevirtual e0x.l4i ()Lzfz;
      // 0b0: bipush 0
      // 0b1: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0b4: aload 0
      // 0b5: aload 1
      // 0b6: aload 3
      // 0b7: bipush 1
      // 0b8: bipush 3
      // 0b9: bipush 4
      // 0ba: bipush 1
      // 0bb: bipush 4
      // 0bc: bipush 4
      // 0bd: getstatic ox_.laa Le0x;
      // 0c0: invokevirtual e0x.l4i ()Lzfz;
      // 0c3: getstatic ox_.cbk Le0x;
      // 0c6: invokevirtual e0x.l4i ()Lzfz;
      // 0c9: bipush 0
      // 0ca: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0cd: aload 0
      // 0ce: aload 1
      // 0cf: aload 3
      // 0d0: bipush 3
      // 0d1: bipush 3
      // 0d2: bipush 4
      // 0d3: bipush 3
      // 0d4: bipush 4
      // 0d5: bipush 4
      // 0d6: getstatic ox_.laa Le0x;
      // 0d9: invokevirtual e0x.l4i ()Lzfz;
      // 0dc: getstatic ox_.cbk Le0x;
      // 0df: invokevirtual e0x.l4i ()Lzfz;
      // 0e2: bipush 0
      // 0e3: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e6: aload 0
      // 0e7: getfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.i_4 Z
      // 0ea: aload 4
      // 0ec: ifnull 168
      // 0ef: ifeq 14c
      // 0f2: goto 0f9
      // 0f5: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 3
      // 0fa: new mew
      // 0fd: dup
      // 0fe: aload 0
      // 0ff: bipush 1
      // 100: bipush 3
      // 101: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.q__ (II)I
      // 104: aload 0
      // 105: bipush 2
      // 106: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2._tw (I)I
      // 109: aload 0
      // 10a: bipush 1
      // 10b: bipush 3
      // 10c: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2._ye (II)I
      // 10f: invokespecial mew.<init> (III)V
      // 112: invokevirtual yve.vwy (Lwgo;)Z
      // 115: aload 4
      // 117: ifnull 168
      // 11a: goto 121
      // 11d: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.a (Loov;)Loov;
      // 120: athrow
      // 121: ifeq 14c
      // 124: goto 12b
      // 127: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 0
      // 12c: bipush 0
      // 12d: putfield net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.i_4 Z
      // 130: aload 0
      // 131: aload 1
      // 132: aload 3
      // 133: aload 2
      // 134: bipush 1
      // 135: bipush 2
      // 136: bipush 3
      // 137: getstatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.rop Ljava/util/List;
      // 13a: bipush 2
      // 13b: aload 2
      // 13c: bipush 4
      // 13d: invokevirtual java/util/Random.nextInt (I)I
      // 140: iadd
      // 141: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 144: pop
      // 145: goto 14c
      // 148: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.a (Loov;)Loov;
      // 14b: athrow
      // 14c: aload 0
      // 14d: aload 1
      // 14e: aload 3
      // 14f: bipush 0
      // 150: bipush 6
      // 152: bipush 0
      // 153: bipush 4
      // 154: bipush 6
      // 156: bipush 4
      // 157: getstatic ox_.cbk Le0x;
      // 15a: invokevirtual e0x.l4i ()Lzfz;
      // 15d: getstatic ox_.cbk Le0x;
      // 160: invokevirtual e0x.l4i ()Lzfz;
      // 163: bipush 0
      // 164: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 167: bipush 0
      // 168: istore 5
      // 16a: iload 5
      // 16c: bipush 4
      // 16d: if_icmpgt 1ab
      // 170: bipush 0
      // 171: aload 4
      // 173: ifnull 1ac
      // 176: istore 6
      // 178: iload 6
      // 17a: bipush 4
      // 17b: if_icmpgt 1a3
      // 17e: aload 0
      // 17f: aload 1
      // 180: getstatic ox_.cbk Le0x;
      // 183: invokevirtual e0x.l4i ()Lzfz;
      // 186: iload 5
      // 188: bipush -1
      // 189: iload 6
      // 18b: aload 3
      // 18c: invokevirtual net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.doc (Lt9d;Lzfz;IIILyve;)V
      // 18f: iinc 6 1
      // 192: aload 4
      // 194: ifnull 1a6
      // 197: aload 4
      // 199: ifnonnull 178
      // 19c: goto 1a3
      // 19f: invokestatic net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: iinc 5 1
      // 1a6: aload 4
      // 1a8: ifnonnull 16a
      // 1ab: bipush 1
      // 1ac: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5370781414750280935L, 2663125642649473661L, MethodHandles.lookup().lookupClass()).a(200792848243630L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 117978063587376L;
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
      String var6 = "æ\u009eÄd\u0016\u0006©«Æ\u007fú=\u0086ÄÌ\u0005\u0010\u0006\u0095(\u0011ñ\u001esR\u0004\u008c¹\u0085\u0001\u0005\u001bo";
      int var8 = "æ\u009eÄd\u0016\u0006©«Æ\u007fú=\u0086ÄÌ\u0005\u0010\u0006\u0095(\u0011ñ\u001esR\u0004\u008c¹\u0085\u0001\u0005\u001bo".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13441;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
