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

public class StructureStrongholdPieces$Corridor extends StructureStrongholdPieces$Stronghold {
   private int q3h;
   private static final long b;
   private static final String[] k;
   private static final String[] l;
   private static final Map m = new HashMap(13);

   public StructureStrongholdPieces$Corridor() {
   }

   public StructureStrongholdPieces$Corridor(int param1, Random param2, yve param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 1
      // 02: invokespecial net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.<init> (I)V
      // 05: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 08: aload 0
      // 09: aload 4
      // 0b: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.p7m Lvt2;
      // 0e: astore 5
      // 10: aload 0
      // 11: aload 3
      // 12: aload 5
      // 14: ifnull 45
      // 17: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.yqm Lyve;
      // 1a: aload 0
      // 1b: aload 4
      // 1d: getstatic vt2.z9q Lvt2;
      // 20: if_acmpeq 44
      // 23: goto 2a
      // 26: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 4
      // 2c: getstatic vt2.mxp Lvt2;
      // 2f: if_acmpeq 44
      // 32: goto 39
      // 35: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 3
      // 3a: invokevirtual yve.num ()I
      // 3d: goto 48
      // 40: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 3
      // 45: invokevirtual yve.ut6 ()I
      // 48: putfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.q3h I
      // 4b: return
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = b ^ 18559944528828L;
      super.z0d(var1);
      var1.iin(c<"a">(875, 6483564457974927575L ^ var2), this.q3h);
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = b ^ 121715067640535L;
      super.oqf(var1);
      this.q3h = var1.uz7(c<"a">(1223, 7287178914294095377L ^ var2));
   }

   public static yve s5g(List param0, Random param1, int param2, int param3, int param4, vt2 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 3
      // 01: istore 7
      // 03: iload 2
      // 04: iload 3
      // 05: iload 4
      // 07: bipush -1
      // 08: bipush -1
      // 09: bipush 0
      // 0a: bipush 5
      // 0b: bipush 5
      // 0c: bipush 4
      // 0d: aload 5
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 8
      // 14: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 17: aload 0
      // 18: aload 8
      // 1a: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 1d: astore 9
      // 1f: astore 6
      // 21: aload 9
      // 23: aload 6
      // 25: ifnull 3a
      // 28: ifnonnull 38
      // 2b: goto 32
      // 2e: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 31: athrow
      // 32: aconst_null
      // 33: areturn
      // 34: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 9
      // 3a: invokevirtual xi1.q1q ()Lyve;
      // 3d: getfield yve._3o I
      // 40: aload 6
      // 42: ifnull 5c
      // 45: aload 8
      // 47: getfield yve._3o I
      // 4a: if_icmpne ae
      // 4d: goto 54
      // 50: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 3
      // 55: goto 5c
      // 58: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 5b: athrow
      // 5c: istore 10
      // 5e: iload 10
      // 60: bipush 1
      // 61: if_icmplt ae
      // 64: iload 2
      // 65: iload 3
      // 66: iload 4
      // 68: bipush -1
      // 69: bipush -1
      // 6a: bipush 0
      // 6b: bipush 5
      // 6c: bipush 5
      // 6d: iload 10
      // 6f: bipush 1
      // 70: isub
      // 71: aload 5
      // 73: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 76: astore 8
      // 78: aload 6
      // 7a: ifnull a9
      // 7d: aload 9
      // 7f: invokevirtual xi1.q1q ()Lyve;
      // 82: aload 8
      // 84: invokevirtual yve.fsa (Lyve;)Z
      // 87: ifne a6
      // 8a: goto 91
      // 8d: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 90: athrow
      // 91: iload 2
      // 92: iload 3
      // 93: iload 4
      // 95: bipush -1
      // 96: bipush -1
      // 97: bipush 0
      // 98: bipush 5
      // 99: bipush 5
      // 9a: iload 10
      // 9c: aload 5
      // 9e: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // a1: areturn
      // a2: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // a5: athrow
      // a6: iinc 10 -1
      // a9: aload 6
      // ab: ifnonnull 5e
      // ae: aconst_null
      // af: areturn
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
      // 008: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.knc (Lt9d;Lyve;)Z
      // 00b: aload 4
      // 00d: ifnull 021
      // 010: ifeq 020
      // 013: goto 01a
      // 016: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 019: athrow
      // 01a: bipush 0
      // 01b: ireturn
      // 01c: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 01f: athrow
      // 020: bipush 0
      // 021: istore 5
      // 023: iload 5
      // 025: aload 0
      // 026: getfield net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.q3h I
      // 029: if_icmpge 14b
      // 02c: aload 0
      // 02d: aload 1
      // 02e: getstatic ox_.ow_ Le0x;
      // 031: invokevirtual e0x.l4i ()Lzfz;
      // 034: bipush 0
      // 035: bipush 0
      // 036: iload 5
      // 038: aload 3
      // 039: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 03c: aload 0
      // 03d: aload 1
      // 03e: getstatic ox_.ow_ Le0x;
      // 041: invokevirtual e0x.l4i ()Lzfz;
      // 044: bipush 1
      // 045: bipush 0
      // 046: iload 5
      // 048: aload 3
      // 049: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 04c: aload 0
      // 04d: aload 1
      // 04e: getstatic ox_.ow_ Le0x;
      // 051: invokevirtual e0x.l4i ()Lzfz;
      // 054: bipush 2
      // 055: bipush 0
      // 056: iload 5
      // 058: aload 3
      // 059: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 05c: aload 0
      // 05d: aload 1
      // 05e: getstatic ox_.ow_ Le0x;
      // 061: invokevirtual e0x.l4i ()Lzfz;
      // 064: bipush 3
      // 065: bipush 0
      // 066: iload 5
      // 068: aload 3
      // 069: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 06c: aload 0
      // 06d: aload 1
      // 06e: getstatic ox_.ow_ Le0x;
      // 071: invokevirtual e0x.l4i ()Lzfz;
      // 074: bipush 4
      // 075: bipush 0
      // 076: iload 5
      // 078: aload 3
      // 079: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 07c: bipush 1
      // 07d: aload 4
      // 07f: ifnull 14c
      // 082: istore 6
      // 084: iload 6
      // 086: bipush 3
      // 087: if_icmpgt 0f3
      // 08a: aload 0
      // 08b: aload 1
      // 08c: getstatic ox_.ow_ Le0x;
      // 08f: invokevirtual e0x.l4i ()Lzfz;
      // 092: bipush 0
      // 093: iload 6
      // 095: iload 5
      // 097: aload 3
      // 098: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 09b: aload 0
      // 09c: aload 1
      // 09d: getstatic ox_.ibw Le0x;
      // 0a0: invokevirtual e0x.l4i ()Lzfz;
      // 0a3: bipush 1
      // 0a4: iload 6
      // 0a6: iload 5
      // 0a8: aload 3
      // 0a9: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getstatic ox_.ibw Le0x;
      // 0b1: invokevirtual e0x.l4i ()Lzfz;
      // 0b4: bipush 2
      // 0b5: iload 6
      // 0b7: iload 5
      // 0b9: aload 3
      // 0ba: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: getstatic ox_.ibw Le0x;
      // 0c2: invokevirtual e0x.l4i ()Lzfz;
      // 0c5: bipush 3
      // 0c6: iload 6
      // 0c8: iload 5
      // 0ca: aload 3
      // 0cb: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0ce: aload 0
      // 0cf: aload 1
      // 0d0: getstatic ox_.ow_ Le0x;
      // 0d3: invokevirtual e0x.l4i ()Lzfz;
      // 0d6: bipush 4
      // 0d7: iload 6
      // 0d9: iload 5
      // 0db: aload 3
      // 0dc: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 0df: iinc 6 1
      // 0e2: aload 4
      // 0e4: ifnull 146
      // 0e7: aload 4
      // 0e9: ifnonnull 084
      // 0ec: goto 0f3
      // 0ef: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: getstatic ox_.ow_ Le0x;
      // 0f8: invokevirtual e0x.l4i ()Lzfz;
      // 0fb: bipush 0
      // 0fc: bipush 4
      // 0fd: iload 5
      // 0ff: aload 3
      // 100: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 103: aload 0
      // 104: aload 1
      // 105: getstatic ox_.ow_ Le0x;
      // 108: invokevirtual e0x.l4i ()Lzfz;
      // 10b: bipush 1
      // 10c: bipush 4
      // 10d: iload 5
      // 10f: aload 3
      // 110: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 113: aload 0
      // 114: aload 1
      // 115: getstatic ox_.ow_ Le0x;
      // 118: invokevirtual e0x.l4i ()Lzfz;
      // 11b: bipush 2
      // 11c: bipush 4
      // 11d: iload 5
      // 11f: aload 3
      // 120: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 123: aload 0
      // 124: aload 1
      // 125: getstatic ox_.ow_ Le0x;
      // 128: invokevirtual e0x.l4i ()Lzfz;
      // 12b: bipush 3
      // 12c: bipush 4
      // 12d: iload 5
      // 12f: aload 3
      // 130: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 133: aload 0
      // 134: aload 1
      // 135: getstatic ox_.ow_ Le0x;
      // 138: invokevirtual e0x.l4i ()Lzfz;
      // 13b: bipush 4
      // 13c: bipush 4
      // 13d: iload 5
      // 13f: aload 3
      // 140: invokevirtual net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor.lzy (Lt9d;Lzfz;IIILyve;)V
      // 143: iinc 5 1
      // 146: aload 4
      // 148: ifnonnull 023
      // 14b: bipush 1
      // 14c: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5069171136829731629L, -5149750533797615883L, MethodHandles.lookup().lookupClass()).a(47179530462769L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 106624202461835L;
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
      String var6 = "tâÓhÃ%i\u0012\t^Ú¢\u000b\u00826/\u0010Ì\u0096o$\u0080î83|pkâ§yû\u0013";
      int var8 = "tâÓhÃ%i\u0012\t^Ú¢\u000b\u00826/\u0010Ì\u0096o$\u0080î83|pkâ§yû\u0013".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22267;
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
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor", var10);
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureStrongholdPieces$Corridor" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
