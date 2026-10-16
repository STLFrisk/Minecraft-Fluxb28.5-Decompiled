import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityBanner;

public class axx extends q9h {
   private static final Map cgw;
   private static final gdz fhr;
   private kkn x1a = new kkn();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void ec9(TileEntityBanner param1, double param2, double param4, double param6, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 10
      // 005: aload 1
      // 006: invokevirtual net/minecraft/tileentity/TileEntityBanner.yi7 ()Lt9d;
      // 009: ifnull 014
      // 00c: bipush 1
      // 00d: goto 015
      // 010: invokestatic axx.a (Loov;)Loov;
      // 013: athrow
      // 014: bipush 0
      // 015: istore 11
      // 017: iload 11
      // 019: iload 10
      // 01b: ifne 041
      // 01e: ifeq 039
      // 021: goto 028
      // 024: invokestatic axx.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 1
      // 029: invokevirtual net/minecraft/tileentity/TileEntityBanner.qwl ()Le0x;
      // 02c: getstatic ox_.e2n Le0x;
      // 02f: if_acmpne 044
      // 032: goto 039
      // 035: invokestatic axx.a (Loov;)Loov;
      // 038: athrow
      // 039: bipush 1
      // 03a: goto 041
      // 03d: invokestatic axx.a (Loov;)Loov;
      // 040: athrow
      // 041: goto 045
      // 044: bipush 0
      // 045: istore 12
      // 047: iload 11
      // 049: iload 10
      // 04b: ifne 063
      // 04e: ifeq 066
      // 051: goto 058
      // 054: invokestatic axx.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 1
      // 059: invokevirtual net/minecraft/tileentity/TileEntityBanner.hvh ()I
      // 05c: goto 063
      // 05f: invokestatic axx.a (Loov;)Loov;
      // 062: athrow
      // 063: goto 067
      // 066: bipush 0
      // 067: istore 13
      // 069: iload 11
      // 06b: ifeq 07c
      // 06e: aload 1
      // 06f: invokevirtual net/minecraft/tileentity/TileEntityBanner.yi7 ()Lt9d;
      // 072: invokevirtual OpaquePredicate.p2b ()J
      // 075: goto 07d
      // 078: invokestatic axx.a (Loov;)Loov;
      // 07b: athrow
      // 07c: lconst_0
      // 07d: lstore 14
      // 07f: invokestatic hzu.dp2 ()V
      // 082: ldc 0.6666667
      // 084: nop
      // 085: fstore 16
      // 087: iload 12
      // 089: iload 10
      // 08b: ifne 0bf
      // 08e: ifeq 0df
      // 091: goto 098
      // 094: invokestatic axx.a (Loov;)Loov;
      // 097: athrow
      // 098: dload 2
      // 099: d2f
      // 09a: ldc 0.5
      // 09c: nop
      // 09d: fadd
      // 09e: dload 4
      // 0a0: d2f
      // 0a1: ldc 0.75
      // 0a3: nop
      // 0a4: fload 16
      // 0a6: fmul
      // 0a7: fadd
      // 0a8: dload 6
      // 0aa: d2f
      // 0ab: ldc 0.5
      // 0ad: nop
      // 0ae: fadd
      // 0af: invokestatic hzu.a4k (FFF)V
      // 0b2: iload 13
      // 0b4: sipush 360
      // 0b7: imul
      // 0b8: goto 0bf
      // 0bb: invokestatic axx.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: i2f
      // 0c0: ldc 16.0
      // 0c2: nop
      // 0c3: fdiv
      // 0c4: fstore 17
      // 0c6: fload 17
      // 0c8: fneg
      // 0c9: fconst_0
      // 0ca: fconst_1
      // 0cb: fconst_0
      // 0cc: invokestatic hzu.a2h (FFFF)V
      // 0cf: aload 0
      // 0d0: getfield axx.x1a Lkkn;
      // 0d3: getfield kkn._g7 Ltf8;
      // 0d6: bipush 1
      // 0d7: putfield tf8.b16 Z
      // 0da: iload 10
      // 0dc: ifeq 153
      // 0df: fconst_0
      // 0e0: fstore 17
      // 0e2: iload 13
      // 0e4: bipush 2
      // 0e5: iload 10
      // 0e7: ifne 0fc
      // 0ea: if_icmpne 0f9
      // 0ed: goto 0f4
      // 0f0: invokestatic axx.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: ldc 180.0
      // 0f6: nop
      // 0f7: fstore 17
      // 0f9: iload 13
      // 0fb: bipush 4
      // 0fc: iload 10
      // 0fe: ifne 113
      // 101: if_icmpne 110
      // 104: goto 10b
      // 107: invokestatic axx.a (Loov;)Loov;
      // 10a: athrow
      // 10b: ldc 90.0
      // 10d: nop
      // 10e: fstore 17
      // 110: iload 13
      // 112: bipush 5
      // 113: if_icmpne 11b
      // 116: ldc -90.0
      // 118: nop
      // 119: fstore 17
      // 11b: dload 2
      // 11c: d2f
      // 11d: ldc 0.5
      // 11f: nop
      // 120: fadd
      // 121: dload 4
      // 123: d2f
      // 124: ldc 0.25
      // 126: nop
      // 127: fload 16
      // 129: fmul
      // 12a: fsub
      // 12b: dload 6
      // 12d: d2f
      // 12e: ldc 0.5
      // 130: nop
      // 131: fadd
      // 132: invokestatic hzu.a4k (FFF)V
      // 135: fload 17
      // 137: fneg
      // 138: fconst_0
      // 139: fconst_1
      // 13a: fconst_0
      // 13b: invokestatic hzu.a2h (FFFF)V
      // 13e: fconst_0
      // 13f: ldc -0.3125
      // 141: nop
      // 142: ldc -0.4375
      // 144: nop
      // 145: invokestatic hzu.a4k (FFF)V
      // 148: aload 0
      // 149: getfield axx.x1a Lkkn;
      // 14c: getfield kkn._g7 Ltf8;
      // 14f: bipush 0
      // 150: putfield tf8.b16 Z
      // 153: aload 1
      // 154: invokevirtual net/minecraft/tileentity/TileEntityBanner.y8_ ()Lmew;
      // 157: astore 17
      // 159: aload 17
      // 15b: invokevirtual mew.getX ()I
      // 15e: bipush 7
      // 160: imul
      // 161: aload 17
      // 163: invokevirtual mew.getY ()I
      // 166: bipush 9
      // 168: imul
      // 169: iadd
      // 16a: aload 17
      // 16c: invokevirtual mew.getZ ()I
      // 16f: bipush 13
      // 171: imul
      // 172: iadd
      // 173: i2f
      // 174: lload 14
      // 176: l2f
      // 177: fadd
      // 178: fload 8
      // 17a: fadd
      // 17b: fstore 18
      // 17d: aload 0
      // 17e: getfield axx.x1a Lkkn;
      // 181: getfield kkn.iz6 Ltf8;
      // 184: ldc -0.0125
      // 186: nop
      // 187: ldc 0.01
      // 189: nop
      // 18a: fload 18
      // 18c: ldc 3.1415927
      // 18e: nop
      // 18f: fmul
      // 190: ldc 0.02
      // 192: nop
      // 193: fmul
      // 194: invokestatic fe6.ssk (F)F
      // 197: fmul
      // 198: fadd
      // 199: ldc 3.1415927
      // 19b: nop
      // 19c: fmul
      // 19d: putfield tf8.pod F
      // 1a0: invokestatic hzu.ixc ()V
      // 1a3: aload 0
      // 1a4: aload 1
      // 1a5: invokespecial axx.we6 (Lnet/minecraft/tileentity/TileEntityBanner;)Lgdz;
      // 1a8: astore 19
      // 1aa: iload 10
      // 1ac: ifne 1ea
      // 1af: aload 19
      // 1b1: ifnull 1e0
      // 1b4: goto 1bb
      // 1b7: invokestatic axx.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: aload 0
      // 1bc: aload 19
      // 1be: invokevirtual axx.g3j (Lgdz;)V
      // 1c1: invokestatic hzu.dp2 ()V
      // 1c4: fload 16
      // 1c6: fload 16
      // 1c8: fneg
      // 1c9: fload 16
      // 1cb: fneg
      // 1cc: invokestatic hzu.syc (FFF)V
      // 1cf: aload 0
      // 1d0: getfield axx.x1a Lkkn;
      // 1d3: invokevirtual kkn.xgu ()V
      // 1d6: invokestatic hzu.x3w ()V
      // 1d9: goto 1e0
      // 1dc: invokestatic axx.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: fconst_1
      // 1e1: fconst_1
      // 1e2: fconst_1
      // 1e3: fconst_1
      // 1e4: invokestatic hzu.wn0 (FFFF)V
      // 1e7: invokestatic hzu.x3w ()V
      // 1ea: return
   }

   private gdz we6(TileEntityBanner param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic axx.a J
      // 003: ldc2_w 108279009632080
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual net/minecraft/tileentity/TileEntityBanner.uq3 ()Ljava/lang/String;
      // 011: astore 5
      // 013: aload 5
      // 015: iload 4
      // 017: ifeq 037
      // 01a: invokevirtual java/lang/String.isEmpty ()Z
      // 01d: ifeq 02d
      // 020: goto 027
      // 023: invokestatic axx.a (Loov;)Loov;
      // 026: athrow
      // 027: aconst_null
      // 028: areturn
      // 029: invokestatic axx.a (Loov;)Loov;
      // 02c: athrow
      // 02d: getstatic axx.cgw Ljava/util/Map;
      // 030: aload 5
      // 032: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 037: checkcast axx$_a1
      // 03a: astore 6
      // 03c: aload 6
      // 03e: iload 4
      // 040: ifeq 1c0
      // 043: ifnonnull 1b6
      // 046: goto 04d
      // 049: invokestatic axx.a (Loov;)Loov;
      // 04c: athrow
      // 04d: getstatic axx.cgw Ljava/util/Map;
      // 050: invokeinterface java/util/Map.size ()I 1
      // 055: sipush 256
      // 058: if_icmplt 0f7
      // 05b: goto 062
      // 05e: invokestatic axx.a (Loov;)Loov;
      // 061: athrow
      // 062: invokestatic java/lang/System.currentTimeMillis ()J
      // 065: lstore 7
      // 067: getstatic axx.cgw Ljava/util/Map;
      // 06a: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 06f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 074: astore 9
      // 076: aload 9
      // 078: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07d: ifeq 0e3
      // 080: aload 9
      // 082: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 087: checkcast java/lang/String
      // 08a: astore 10
      // 08c: getstatic axx.cgw Ljava/util/Map;
      // 08f: aload 10
      // 091: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 096: checkcast axx$_a1
      // 099: astore 11
      // 09b: iload 4
      // 09d: ifeq 0d7
      // 0a0: lload 7
      // 0a2: aload 11
      // 0a4: getfield axx$_a1.jhw J
      // 0a7: lsub
      // 0a8: ldc2_w 60000
      // 0ab: lcmp
      // 0ac: iload 4
      // 0ae: ifeq 0eb
      // 0b1: goto 0b8
      // 0b4: invokestatic axx.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: ifle 0de
      // 0bb: goto 0c2
      // 0be: invokestatic axx.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: invokestatic Minecraft.vz1 ()Lc05;
      // 0c5: invokevirtual Minecraft.l22 ()Llc5;
      // 0c8: aload 11
      // 0ca: getfield axx$_a1.du_ Lgdz;
      // 0cd: invokevirtual lc5.cez (Lgdz;)V
      // 0d0: goto 0d7
      // 0d3: invokestatic axx.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: aload 9
      // 0d9: invokeinterface java/util/Iterator.remove ()V 1
      // 0de: iload 4
      // 0e0: ifne 076
      // 0e3: getstatic axx.cgw Ljava/util/Map;
      // 0e6: invokeinterface java/util/Map.size ()I 1
      // 0eb: sipush 256
      // 0ee: if_icmplt 0f7
      // 0f1: aconst_null
      // 0f2: areturn
      // 0f3: invokestatic axx.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 1
      // 0f8: invokevirtual net/minecraft/tileentity/TileEntityBanner.u88 ()Ljava/util/List;
      // 0fb: astore 7
      // 0fd: aload 1
      // 0fe: invokevirtual net/minecraft/tileentity/TileEntityBanner.s1t ()Ljava/util/List;
      // 101: astore 8
      // 103: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 106: astore 9
      // 108: aload 7
      // 10a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 10f: astore 10
      // 111: aload 10
      // 113: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 118: ifeq 174
      // 11b: aload 10
      // 11d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 122: checkcast net/minecraft/tileentity/TileEntityBanner$swh
      // 125: astore 11
      // 127: aload 9
      // 129: new java/lang/StringBuilder
      // 12c: dup
      // 12d: invokespecial java/lang/StringBuilder.<init> ()V
      // 130: sipush 9650
      // 133: ldc2_w 2124866665961441333
      // 136: lload 2
      // 137: lxor
      // 138: invokedynamic y (IJ)Ljava/lang/String; bsm=axx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: nop
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: aload 11
      // 143: invokevirtual net/minecraft/tileentity/TileEntityBanner$swh.u4i ()Ljava/lang/String;
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: sipush 18435
      // 14c: ldc2_w 234602996680729991
      // 14f: lload 2
      // 150: lxor
      // 151: invokedynamic y (IJ)Ljava/lang/String; bsm=axx.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: nop
      // 157: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 162: pop
      // 163: iload 4
      // 165: ifeq 1a9
      // 168: iload 4
      // 16a: ifne 111
      // 16d: goto 174
      // 170: invokestatic axx.a (Loov;)Loov;
      // 173: athrow
      // 174: new axx$_a1
      // 177: dup
      // 178: aconst_null
      // 179: invokespecial axx$_a1.<init> (Laxx$1;)V
      // 17c: astore 6
      // 17e: aload 6
      // 180: new gdz
      // 183: dup
      // 184: aload 5
      // 186: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 189: putfield axx$_a1.du_ Lgdz;
      // 18c: invokestatic Minecraft.vz1 ()Lc05;
      // 18f: invokevirtual Minecraft.l22 ()Llc5;
      // 192: aload 6
      // 194: getfield axx$_a1.du_ Lgdz;
      // 197: new ia_
      // 19a: dup
      // 19b: getstatic axx.fhr Lgdz;
      // 19e: aload 9
      // 1a0: aload 8
      // 1a2: invokespecial ia_.<init> (Lgdz;Ljava/util/List;Ljava/util/List;)V
      // 1a5: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 1a8: pop
      // 1a9: getstatic axx.cgw Ljava/util/Map;
      // 1ac: aload 5
      // 1ae: aload 6
      // 1b0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1b5: pop
      // 1b6: aload 6
      // 1b8: invokestatic java/lang/System.currentTimeMillis ()J
      // 1bb: putfield axx$_a1.jhw J
      // 1be: aload 6
      // 1c0: getfield axx$_a1.du_ Lgdz;
      // 1c3: areturn
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.ec9((TileEntityBanner)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6972456213149068508L, 5136396280020000197L, MethodHandles.lookup().lookupClass()).a(196259169658251L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 71326500521072L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u0092\u009a¯ðT\u001e¬FDñ4y\u000fÖYè1-\nDÔEñÉ%ì´\u008fÁp\u0013r¼t\u0007»ê\u0002Süá\u0099UI\u0006\u008e\u0099/±$\u001aB\b\u0000»ó\u0010\u001aè]\u0092¾â;\u0094¨c\u009a\u009båûSÿ(}í\u0013ËK¦:\u0006\u0094ËÖaêH!\u0016\u001f¦ú{KeÙ\u00180\f\u0018wo\u001b\u0013þÐ,ðx·\rRé";
      int var6 = "\u0092\u009a¯ðT\u001e¬FDñ4y\u000fÖYè1-\nDÔEñÉ%ì´\u008fÁp\u0013r¼t\u0007»ê\u0002Süá\u0099UI\u0006\u008e\u0099/±$\u001aB\b\u0000»ó\u0010\u001aè]\u0092¾â;\u0094¨c\u009a\u009båûSÿ(}í\u0013ËK¦:\u0006\u0094ËÖaêH!\u0016\u001f¦ú{KeÙ\u00180\f\u0018wo\u001b\u0013þÐ,ðx·\rRé"
         .length();
      char var3 = '8';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            cgw = Maps.newHashMap();
            fhr = new gdz(a<"y">(27426, 866036862526709127L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27140;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("axx", var10);
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

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("axx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
