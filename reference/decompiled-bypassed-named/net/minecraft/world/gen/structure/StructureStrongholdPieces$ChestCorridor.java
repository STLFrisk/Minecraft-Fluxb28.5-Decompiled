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

public class StructureStrongholdPieces$ChestCorridor extends StructureStrongholdPieces$Stronghold {
   private static final List gms;
   private boolean ubb;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$ChestCorridor() {
   }

   public StructureStrongholdPieces$ChestCorridor(int var1, Random var2, yve var3, vt2 var4) {
      super(var1);
      this.p7m = var4;
      this.ppu = this.i2t(var2);
      this.yqm = var3;
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 124361258788648L;
      super.z0d(var1);
      var1.zyu(c<"m">(24284, 5499147576495251134L ^ var2), this.ubb);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 16804883672643L;
      super.oqf(var1);
      this.ubb = var1.dvl(c<"m">(3686, 7794207940651845486L ^ var2));
   }

   @Override
   public void vxr(xi1 var1, List var2, Random var3) {
      this.bmb((StructureStrongholdPieces$Stairs2)var1, var2, var3, 1, 1);
   }

   public static StructureStrongholdPieces$ChestCorridor k7k(List param0, Random param1, int param2, int param3, int param4, vt2 param5, int param6) {
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
      // 14: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.jty (Lyve;)Z
      // 17: ifeq 3f
      // 1a: aload 0
      // 1b: aload 7
      // 1d: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 20: ifnonnull 3f
      // 23: goto 2a
      // 26: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
      // 29: athrow
      // 2a: new net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor
      // 2d: dup
      // 2e: iload 6
      // 30: aload 1
      // 31: aload 7
      // 33: aload 5
      // 35: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.<init> (ILjava/util/Random;Lyve;Lvt2;)V
      // 38: goto 40
      // 3b: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
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
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 0bc
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
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
      // 02f: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.xre (Lt9d;Lyve;IIIIIIZLjava/util/Random;Lxi1$e0c;)V
      // 032: aload 0
      // 033: aload 1
      // 034: aload 2
      // 035: aload 3
      // 036: aload 0
      // 037: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.ppu Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 03a: bipush 1
      // 03b: bipush 1
      // 03c: bipush 0
      // 03d: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 040: aload 0
      // 041: aload 1
      // 042: aload 2
      // 043: aload 3
      // 044: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy.waj Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;
      // 047: bipush 1
      // 048: bipush 1
      // 049: bipush 6
      // 04b: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.gjd (Lt9d;Ljava/util/Random;Lyve;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$gjy;III)V
      // 04e: aload 0
      // 04f: aload 1
      // 050: aload 3
      // 051: bipush 3
      // 052: bipush 1
      // 053: bipush 2
      // 054: bipush 3
      // 055: bipush 1
      // 056: bipush 4
      // 057: getstatic ox_.ow_ Le0x;
      // 05a: invokevirtual e0x.l4i ()Lzfz;
      // 05d: getstatic ox_.ow_ Le0x;
      // 060: invokevirtual e0x.l4i ()Lzfz;
      // 063: bipush 0
      // 064: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 067: aload 0
      // 068: aload 1
      // 069: getstatic ox_.bj8 Lizd;
      // 06c: getstatic hvn$dyo.ooj Lhvn$dyo;
      // 06f: invokevirtual hvn$dyo.run ()I
      // 072: invokevirtual izd.kig (I)Lzfz;
      // 075: bipush 3
      // 076: bipush 1
      // 077: bipush 1
      // 078: aload 3
      // 079: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 07c: aload 0
      // 07d: aload 1
      // 07e: getstatic ox_.bj8 Lizd;
      // 081: getstatic hvn$dyo.ooj Lhvn$dyo;
      // 084: invokevirtual hvn$dyo.run ()I
      // 087: invokevirtual izd.kig (I)Lzfz;
      // 08a: bipush 3
      // 08b: bipush 1
      // 08c: bipush 5
      // 08d: aload 3
      // 08e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 091: aload 0
      // 092: aload 1
      // 093: getstatic ox_.bj8 Lizd;
      // 096: getstatic hvn$dyo.ooj Lhvn$dyo;
      // 099: invokevirtual hvn$dyo.run ()I
      // 09c: invokevirtual izd.kig (I)Lzfz;
      // 09f: bipush 3
      // 0a0: bipush 2
      // 0a1: bipush 2
      // 0a2: aload 3
      // 0a3: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0a6: aload 0
      // 0a7: aload 1
      // 0a8: getstatic ox_.bj8 Lizd;
      // 0ab: getstatic hvn$dyo.ooj Lhvn$dyo;
      // 0ae: invokevirtual hvn$dyo.run ()I
      // 0b1: invokevirtual izd.kig (I)Lzfz;
      // 0b4: bipush 3
      // 0b5: bipush 2
      // 0b6: bipush 4
      // 0b7: aload 3
      // 0b8: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0bb: bipush 2
      // 0bc: istore 5
      // 0be: iload 5
      // 0c0: bipush 4
      // 0c1: if_icmpgt 0ee
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: getstatic ox_.bj8 Lizd;
      // 0c9: getstatic hvn$dyo.ooj Lhvn$dyo;
      // 0cc: invokevirtual hvn$dyo.run ()I
      // 0cf: invokevirtual izd.kig (I)Lzfz;
      // 0d2: bipush 2
      // 0d3: bipush 1
      // 0d4: iload 5
      // 0d6: aload 3
      // 0d7: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0da: iinc 5 1
      // 0dd: aload 4
      // 0df: ifnull 165
      // 0e2: aload 4
      // 0e4: ifnonnull 0be
      // 0e7: goto 0ee
      // 0ea: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.ubb Z
      // 0f2: aload 4
      // 0f4: ifnull 166
      // 0f7: ifne 165
      // 0fa: goto 101
      // 0fd: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 3
      // 102: new mew
      // 105: dup
      // 106: aload 0
      // 107: bipush 3
      // 108: bipush 3
      // 109: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.q__ (II)I
      // 10c: aload 0
      // 10d: bipush 2
      // 10e: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor._tw (I)I
      // 111: aload 0
      // 112: bipush 3
      // 113: bipush 3
      // 114: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor._ye (II)I
      // 117: invokespecial mew.<init> (III)V
      // 11a: invokevirtual yve.vwy (Lwgo;)Z
      // 11d: aload 4
      // 11f: ifnull 166
      // 122: goto 129
      // 125: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
      // 128: athrow
      // 129: ifeq 165
      // 12c: goto 133
      // 12f: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 0
      // 134: bipush 1
      // 135: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.ubb Z
      // 138: aload 0
      // 139: aload 1
      // 13a: aload 3
      // 13b: aload 2
      // 13c: bipush 3
      // 13d: bipush 2
      // 13e: bipush 3
      // 13f: getstatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.gms Ljava/util/List;
      // 142: bipush 1
      // 143: anewarray 178
      // 146: dup
      // 147: bipush 0
      // 148: getstatic xbr.frz Lnmo;
      // 14b: aload 2
      // 14c: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // 14f: aastore
      // 150: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 153: bipush 2
      // 154: aload 2
      // 155: bipush 2
      // 156: invokevirtual java/util/Random.nextInt (I)I
      // 159: iadd
      // 15a: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.y6k (Lt9d;Lyve;Ljava/util/Random;IIILjava/util/List;I)Z
      // 15d: pop
      // 15e: goto 165
      // 161: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor.a (Loov;)Loov;
      // 164: athrow
      // 165: bipush 1
      // 166: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6341915710974797442L, 4026715026270815657L, MethodHandles.lookup().lookupClass()).a(54950043768223L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 90192033791436L;
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
      String var6 = "q\u00ad§ìÐ\u000f\u0000\u0005«ZÌYzÖ[x\u0010¬:\u0014åE±\u0099\u0099\u009cK\u001at(\u0012w\u0086";
      int var8 = "q\u00ad§ìÐ\u000f\u0000\u0005«ZÌYzÖ[x\u0010¬:\u0014åE±\u0099\u0099\u009cK\u001at(\u0012w\u0086".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            k = var9;
            l = new String[2];
            gms = Lists.newArrayList(
               new ypi[]{
                  new ypi(xbr.odc, 0, 1, 1, 10),
                  new ypi(xbr.exg, 0, 1, 3, 3),
                  new ypi(xbr.icz, 0, 1, 5, 10),
                  new ypi(xbr.jtr, 0, 1, 3, 5),
                  new ypi(xbr.deg, 0, 4, 9, 5),
                  new ypi(xbr.nfb, 0, 1, 3, 15),
                  new ypi(xbr.lym, 0, 1, 3, 15),
                  new ypi(xbr.l4f, 0, 1, 1, 5),
                  new ypi(xbr.jfo, 0, 1, 1, 5),
                  new ypi(xbr.w41, 0, 1, 1, 5),
                  new ypi(xbr.c2v, 0, 1, 1, 5),
                  new ypi(xbr.hfp, 0, 1, 1, 5),
                  new ypi(xbr.tfe, 0, 1, 1, 5),
                  new ypi(xbr.yyh, 0, 1, 1, 1),
                  new ypi(xbr.fpq, 0, 1, 1, 1),
                  new ypi(xbr.mhm, 0, 1, 1, 1),
                  new ypi(xbr.fps, 0, 1, 1, 1),
                  new ypi(xbr.krl, 0, 1, 1, 1)
               }
            );
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1316;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$ChestCorridor" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
