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

public class StructureVillagePieces$Field2 extends StructureVillagePieces$Village {
   private e0x cup;
   private e0x f83;
   private static final long a;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public StructureVillagePieces$Field2() {
   }

   public StructureVillagePieces$Field2(StructureVillagePieces$Start var1, int var2, Random var3, yve var4, vt2 var5) {
      super(var1, var2);
      this.p7m = var5;
      this.yqm = var4;
      this.cup = this.axo(var3);
      this.f83 = this.axo(var3);
   }

   @Override
   public void z0d(bdo var1) {
      long var2 = a ^ 64633666861799L;
      super.z0d(var1);
      var1.iin(c<"u">(7972, 8246729540737592805L ^ var2), e0x.db8.fbj(this.cup));
      var1.iin(c<"u">(10617, 4340707543567686586L ^ var2), e0x.db8.fbj(this.f83));
   }

   @Override
   public void oqf(bdo var1) {
      long var2 = a ^ 75433038623628L;
      super.oqf(var1);
      this.cup = e0x.csc(var1.uz7(c<"u">(11728, 6565361545709622907L ^ var2)));
      this.f83 = e0x.csc(var1.uz7(c<"u">(2183, 1549904352375485230L ^ var2)));
   }

   private e0x axo(Random var1) {
      try {
         switch (var1.nextInt(5)) {
            case 0:
               return ox_.r9b;
            case 1:
               return ox_.wl2;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return ox_.gi5;
   }

   public static StructureVillagePieces$Field2 dq0(
      StructureVillagePieces$Start param0, List param1, Random param2, int param3, int param4, int param5, vt2 param6, int param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: iload 4
      // 03: iload 5
      // 05: bipush 0
      // 06: bipush 0
      // 07: bipush 0
      // 08: bipush 7
      // 0a: bipush 4
      // 0b: bipush 9
      // 0d: aload 6
      // 0f: invokestatic yve.sgq (IIIIIIIIILvt2;)Lyve;
      // 12: astore 8
      // 14: aload 8
      // 16: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.r60 (Lyve;)Z
      // 19: ifeq 42
      // 1c: aload 1
      // 1d: aload 8
      // 1f: invokestatic xi1.qvo (Ljava/util/List;Lyve;)Lxi1;
      // 22: ifnonnull 42
      // 25: goto 2c
      // 28: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 2b: athrow
      // 2c: new net/minecraft/world/gen/structure/StructureVillagePieces$Field2
      // 2f: dup
      // 30: aload 0
      // 31: iload 7
      // 33: aload 2
      // 34: aload 8
      // 36: aload 6
      // 38: invokespecial net/minecraft/world/gen/structure/StructureVillagePieces$Field2.<init> (Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;ILjava/util/Random;Lyve;Lvt2;)V
      // 3b: goto 43
      // 3e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
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
      // 000: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 003: astore 4
      // 005: aload 0
      // 006: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.e_j I
      // 009: aload 4
      // 00b: ifnull 12f
      // 00e: ifge 05b
      // 011: goto 018
      // 014: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 0
      // 01a: aload 1
      // 01b: aload 3
      // 01c: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.rh3 (Lt9d;Lyve;)I
      // 01f: putfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.e_j I
      // 022: aload 0
      // 023: aload 4
      // 025: ifnull 043
      // 028: goto 02f
      // 02b: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.e_j I
      // 032: ifge 042
      // 035: goto 03c
      // 038: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: ireturn
      // 03e: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.yqm Lyve;
      // 046: bipush 0
      // 047: aload 0
      // 048: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.e_j I
      // 04b: aload 0
      // 04c: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.yqm Lyve;
      // 04f: getfield yve.ixv I
      // 052: isub
      // 053: bipush 4
      // 054: iadd
      // 055: bipush 1
      // 056: isub
      // 057: bipush 0
      // 058: invokevirtual yve.gbw (III)V
      // 05b: aload 0
      // 05c: aload 1
      // 05d: aload 3
      // 05e: bipush 0
      // 05f: bipush 1
      // 060: bipush 0
      // 061: bipush 6
      // 063: bipush 4
      // 064: bipush 8
      // 066: getstatic ox_.ibw Le0x;
      // 069: invokevirtual e0x.l4i ()Lzfz;
      // 06c: getstatic ox_.ibw Le0x;
      // 06f: invokevirtual e0x.l4i ()Lzfz;
      // 072: bipush 0
      // 073: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 076: aload 0
      // 077: aload 1
      // 078: aload 3
      // 079: bipush 1
      // 07a: bipush 0
      // 07b: bipush 1
      // 07c: bipush 2
      // 07d: bipush 0
      // 07e: bipush 7
      // 080: getstatic ox_._5i Le0x;
      // 083: invokevirtual e0x.l4i ()Lzfz;
      // 086: getstatic ox_._5i Le0x;
      // 089: invokevirtual e0x.l4i ()Lzfz;
      // 08c: bipush 0
      // 08d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 090: aload 0
      // 091: aload 1
      // 092: aload 3
      // 093: bipush 4
      // 094: bipush 0
      // 095: bipush 1
      // 096: bipush 5
      // 097: bipush 0
      // 098: bipush 7
      // 09a: getstatic ox_._5i Le0x;
      // 09d: invokevirtual e0x.l4i ()Lzfz;
      // 0a0: getstatic ox_._5i Le0x;
      // 0a3: invokevirtual e0x.l4i ()Lzfz;
      // 0a6: bipush 0
      // 0a7: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: aload 3
      // 0ad: bipush 0
      // 0ae: bipush 0
      // 0af: bipush 0
      // 0b0: bipush 0
      // 0b1: bipush 0
      // 0b2: bipush 8
      // 0b4: getstatic ox_.uom Le0x;
      // 0b7: invokevirtual e0x.l4i ()Lzfz;
      // 0ba: getstatic ox_.uom Le0x;
      // 0bd: invokevirtual e0x.l4i ()Lzfz;
      // 0c0: bipush 0
      // 0c1: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: aload 3
      // 0c7: bipush 6
      // 0c9: bipush 0
      // 0ca: bipush 0
      // 0cb: bipush 6
      // 0cd: bipush 0
      // 0ce: bipush 8
      // 0d0: getstatic ox_.uom Le0x;
      // 0d3: invokevirtual e0x.l4i ()Lzfz;
      // 0d6: getstatic ox_.uom Le0x;
      // 0d9: invokevirtual e0x.l4i ()Lzfz;
      // 0dc: bipush 0
      // 0dd: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0e0: aload 0
      // 0e1: aload 1
      // 0e2: aload 3
      // 0e3: bipush 1
      // 0e4: bipush 0
      // 0e5: bipush 0
      // 0e6: bipush 5
      // 0e7: bipush 0
      // 0e8: bipush 0
      // 0e9: getstatic ox_.uom Le0x;
      // 0ec: invokevirtual e0x.l4i ()Lzfz;
      // 0ef: getstatic ox_.uom Le0x;
      // 0f2: invokevirtual e0x.l4i ()Lzfz;
      // 0f5: bipush 0
      // 0f6: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 0f9: aload 0
      // 0fa: aload 1
      // 0fb: aload 3
      // 0fc: bipush 1
      // 0fd: bipush 0
      // 0fe: bipush 8
      // 100: bipush 5
      // 101: bipush 0
      // 102: bipush 8
      // 104: getstatic ox_.uom Le0x;
      // 107: invokevirtual e0x.l4i ()Lzfz;
      // 10a: getstatic ox_.uom Le0x;
      // 10d: invokevirtual e0x.l4i ()Lzfz;
      // 110: bipush 0
      // 111: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 114: aload 0
      // 115: aload 1
      // 116: aload 3
      // 117: bipush 3
      // 118: bipush 0
      // 119: bipush 1
      // 11a: bipush 3
      // 11b: bipush 0
      // 11c: bipush 7
      // 11e: getstatic ox_.gdz Les2;
      // 121: invokevirtual es2.l4i ()Lzfz;
      // 124: getstatic ox_.gdz Les2;
      // 127: invokevirtual es2.l4i ()Lzfz;
      // 12a: bipush 0
      // 12b: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.gys (Lt9d;Lyve;IIIIIILzfz;Lzfz;Z)V
      // 12e: bipush 1
      // 12f: istore 5
      // 131: iload 5
      // 133: bipush 7
      // 135: if_icmpgt 1ac
      // 138: aload 0
      // 139: aload 1
      // 13a: aload 0
      // 13b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.cup Le0x;
      // 13e: aload 2
      // 13f: bipush 2
      // 140: bipush 7
      // 142: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 145: invokevirtual e0x.kig (I)Lzfz;
      // 148: bipush 1
      // 149: bipush 1
      // 14a: iload 5
      // 14c: aload 3
      // 14d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 150: aload 0
      // 151: aload 1
      // 152: aload 0
      // 153: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.cup Le0x;
      // 156: aload 2
      // 157: bipush 2
      // 158: bipush 7
      // 15a: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 15d: invokevirtual e0x.kig (I)Lzfz;
      // 160: bipush 2
      // 161: bipush 1
      // 162: iload 5
      // 164: aload 3
      // 165: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 168: aload 0
      // 169: aload 1
      // 16a: aload 0
      // 16b: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.f83 Le0x;
      // 16e: aload 2
      // 16f: bipush 2
      // 170: bipush 7
      // 172: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 175: invokevirtual e0x.kig (I)Lzfz;
      // 178: bipush 4
      // 179: bipush 1
      // 17a: iload 5
      // 17c: aload 3
      // 17d: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 180: aload 0
      // 181: aload 1
      // 182: aload 0
      // 183: getfield net/minecraft/world/gen/structure/StructureVillagePieces$Field2.f83 Le0x;
      // 186: aload 2
      // 187: bipush 2
      // 188: bipush 7
      // 18a: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 18d: invokevirtual e0x.kig (I)Lzfz;
      // 190: bipush 5
      // 191: bipush 1
      // 192: iload 5
      // 194: aload 3
      // 195: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.lzy (Lt9d;Lzfz;IIILyve;)V
      // 198: iinc 5 1
      // 19b: aload 4
      // 19d: ifnull 1af
      // 1a0: aload 4
      // 1a2: ifnonnull 131
      // 1a5: goto 1ac
      // 1a8: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: bipush 0
      // 1ad: istore 5
      // 1af: iload 5
      // 1b1: bipush 9
      // 1b3: if_icmpge 204
      // 1b6: bipush 0
      // 1b7: aload 4
      // 1b9: ifnull 205
      // 1bc: goto 1c3
      // 1bf: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: istore 6
      // 1c5: iload 6
      // 1c7: bipush 7
      // 1c9: if_icmpge 1fc
      // 1cc: aload 0
      // 1cd: aload 1
      // 1ce: iload 6
      // 1d0: bipush 4
      // 1d1: iload 5
      // 1d3: aload 3
      // 1d4: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.epu (Lt9d;IIILyve;)V
      // 1d7: aload 0
      // 1d8: aload 1
      // 1d9: getstatic ox_.kqk Le0x;
      // 1dc: invokevirtual e0x.l4i ()Lzfz;
      // 1df: iload 6
      // 1e1: bipush -1
      // 1e2: iload 5
      // 1e4: aload 3
      // 1e5: invokevirtual net/minecraft/world/gen/structure/StructureVillagePieces$Field2.doc (Lt9d;Lzfz;IIILyve;)V
      // 1e8: iinc 6 1
      // 1eb: aload 4
      // 1ed: ifnull 1ff
      // 1f0: aload 4
      // 1f2: ifnonnull 1c5
      // 1f5: goto 1fc
      // 1f8: invokestatic net/minecraft/world/gen/structure/StructureVillagePieces$Field2.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: iinc 5 1
      // 1ff: aload 4
      // 201: ifnonnull 1af
      // 204: bipush 1
      // 205: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4101225194675231223L, -2067137612666529834L, MethodHandles.lookup().lookupClass()).a(134932384282204L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 88802859413789L;
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
      String var6 = "nì\u001e;\fßõù\u0089-N\u001d\u008b·2:\u0010H\u008a/\u0010\u008d#î\u009b\u0093ô¦õæD,Å";
      int var8 = "nì\u001e;\fßõù\u0089-N\u001d\u008b·2:\u0010H\u008a/\u0010\u008d#î\u009b\u0093ô¦õæD,Å".length();
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
                     j = var9;
                     k = new String[4];
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

                  var6 = "P'>°x£\u0083Kß\u009cY\u0001àüúÌ\u00107ß1\u000emG§ºÃ¶\u009dc.íC\u0092";
                  var8 = "P'>°x£\u0083Kß\u009cY\u0001àüúÌ\u00107ß1\u000emG§ºÃ¶\u009dc.íC\u0092".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14215;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Field2", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("net/minecraft/world/gen/structure/StructureVillagePieces$Field2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
