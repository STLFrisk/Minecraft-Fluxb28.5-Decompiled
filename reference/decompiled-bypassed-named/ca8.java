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
import net.minecraft.tileentity.TileEntitySign;

public class ca8 extends q9h {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void qg6(TileEntitySign param1, double param2, double param4, double param6, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ca8.a J
      // 003: ldc2_w 72782398721534
      // 006: lxor
      // 007: lstore 10
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 12
      // 00e: aload 1
      // 00f: invokevirtual net/minecraft/tileentity/TileEntitySign.qwl ()Le0x;
      // 012: astore 13
      // 014: invokestatic hzu.dp2 ()V
      // 017: ldc 0.6666667
      // 019: nop
      // 01a: fstore 14
      // 01c: iload 12
      // 01e: ifne 051
      // 021: aload 13
      // 023: getstatic ox_.w0z Le0x;
      // 026: if_acmpne 079
      // 029: goto 030
      // 02c: invokestatic ca8.a (Loov;)Loov;
      // 02f: athrow
      // 030: dload 2
      // 031: d2f
      // 032: ldc 0.5
      // 034: nop
      // 035: fadd
      // 036: dload 4
      // 038: d2f
      // 039: ldc 0.75
      // 03b: nop
      // 03c: fload 14
      // 03e: fmul
      // 03f: fadd
      // 040: dload 6
      // 042: d2f
      // 043: ldc 0.5
      // 045: nop
      // 046: fadd
      // 047: invokestatic hzu.a4k (FFF)V
      // 04a: goto 051
      // 04d: invokestatic ca8.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 1
      // 052: invokevirtual net/minecraft/tileentity/TileEntitySign.hvh ()I
      // 055: sipush 360
      // 058: imul
      // 059: i2f
      // 05a: ldc 16.0
      // 05c: nop
      // 05d: fdiv
      // 05e: fstore 15
      // 060: fload 15
      // 062: fneg
      // 063: fconst_0
      // 064: fconst_1
      // 065: fconst_0
      // 066: invokestatic hzu.a2h (FFFF)V
      // 069: aload 0
      // 06a: getfield ca8.bvu Lttj;
      // 06d: getfield ttj.jjx Ltf8;
      // 070: bipush 1
      // 071: putfield tf8.b16 Z
      // 074: iload 12
      // 076: ifeq 0f3
      // 079: aload 1
      // 07a: invokevirtual net/minecraft/tileentity/TileEntitySign.hvh ()I
      // 07d: istore 15
      // 07f: fconst_0
      // 080: fstore 16
      // 082: iload 15
      // 084: bipush 2
      // 085: iload 12
      // 087: ifne 09c
      // 08a: if_icmpne 099
      // 08d: goto 094
      // 090: invokestatic ca8.a (Loov;)Loov;
      // 093: athrow
      // 094: ldc 180.0
      // 096: nop
      // 097: fstore 16
      // 099: iload 15
      // 09b: bipush 4
      // 09c: iload 12
      // 09e: ifne 0b3
      // 0a1: if_icmpne 0b0
      // 0a4: goto 0ab
      // 0a7: invokestatic ca8.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: ldc 90.0
      // 0ad: nop
      // 0ae: fstore 16
      // 0b0: iload 15
      // 0b2: bipush 5
      // 0b3: if_icmpne 0bb
      // 0b6: ldc -90.0
      // 0b8: nop
      // 0b9: fstore 16
      // 0bb: dload 2
      // 0bc: d2f
      // 0bd: ldc 0.5
      // 0bf: nop
      // 0c0: fadd
      // 0c1: dload 4
      // 0c3: d2f
      // 0c4: ldc 0.75
      // 0c6: nop
      // 0c7: fload 14
      // 0c9: fmul
      // 0ca: fadd
      // 0cb: dload 6
      // 0cd: d2f
      // 0ce: ldc 0.5
      // 0d0: nop
      // 0d1: fadd
      // 0d2: invokestatic hzu.a4k (FFF)V
      // 0d5: fload 16
      // 0d7: fneg
      // 0d8: fconst_0
      // 0d9: fconst_1
      // 0da: fconst_0
      // 0db: invokestatic hzu.a2h (FFFF)V
      // 0de: fconst_0
      // 0df: ldc -0.3125
      // 0e1: nop
      // 0e2: ldc -0.4375
      // 0e4: nop
      // 0e5: invokestatic hzu.a4k (FFF)V
      // 0e8: aload 0
      // 0e9: getfield ca8.bvu Lttj;
      // 0ec: getfield ttj.jjx Ltf8;
      // 0ef: bipush 0
      // 0f0: putfield tf8.b16 Z
      // 0f3: iload 9
      // 0f5: iload 12
      // 0f7: ifne 135
      // 0fa: iflt 13d
      // 0fd: goto 104
      // 100: invokestatic ca8.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: getstatic ca8._oj [Lgdz;
      // 108: iload 9
      // 10a: aaload
      // 10b: invokevirtual ca8.g3j (Lgdz;)V
      // 10e: sipush 5890
      // 111: invokestatic hzu.ah8 (I)V
      // 114: invokestatic hzu.dp2 ()V
      // 117: ldc 4.0
      // 119: nop
      // 11a: fconst_2
      // 11b: fconst_1
      // 11c: invokestatic hzu.syc (FFF)V
      // 11f: ldc 0.0625
      // 121: nop
      // 122: ldc 0.0625
      // 124: nop
      // 125: ldc 0.0625
      // 127: nop
      // 128: invokestatic hzu.a4k (FFF)V
      // 12b: sipush 5888
      // 12e: goto 135
      // 131: invokestatic ca8.a (Loov;)Loov;
      // 134: athrow
      // 135: invokestatic hzu.ah8 (I)V
      // 138: iload 12
      // 13a: ifeq 14b
      // 13d: aload 0
      // 13e: getstatic ca8.iwg Lgdz;
      // 141: invokevirtual ca8.g3j (Lgdz;)V
      // 144: goto 14b
      // 147: invokestatic ca8.a (Loov;)Loov;
      // 14a: athrow
      // 14b: invokestatic hzu.ixc ()V
      // 14e: invokestatic hzu.dp2 ()V
      // 151: fload 14
      // 153: fload 14
      // 155: fneg
      // 156: fload 14
      // 158: fneg
      // 159: invokestatic hzu.syc (FFF)V
      // 15c: aload 0
      // 15d: getfield ca8.bvu Lttj;
      // 160: invokevirtual ttj.s42 ()V
      // 163: invokestatic hzu.x3w ()V
      // 166: aload 1
      // 167: invokestatic ca8.zjh (Lnet/minecraft/tileentity/TileEntitySign;)Z
      // 16a: iload 12
      // 16c: ifne 317
      // 16f: ifeq 307
      // 172: goto 179
      // 175: invokestatic ca8.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 0
      // 17a: invokevirtual ca8.srv ()Lowt;
      // 17d: astore 15
      // 17f: ldc 0.015625
      // 181: nop
      // 182: fload 14
      // 184: fmul
      // 185: fstore 16
      // 187: fconst_0
      // 188: ldc 0.5
      // 18a: nop
      // 18b: fload 14
      // 18d: fmul
      // 18e: ldc 0.07
      // 190: nop
      // 191: fload 14
      // 193: fmul
      // 194: invokestatic hzu.a4k (FFF)V
      // 197: fload 16
      // 199: fload 16
      // 19b: fneg
      // 19c: fload 16
      // 19e: invokestatic hzu.syc (FFF)V
      // 1a1: fconst_0
      // 1a2: fconst_0
      // 1a3: ldc -1.0
      // 1a5: nop
      // 1a6: fload 16
      // 1a8: fmul
      // 1a9: invokestatic org/lwjgl/opengl/GL11.glNormal3f (FFF)V
      // 1ac: bipush 0
      // 1ad: invokestatic hzu.jun (Z)V
      // 1b0: bipush 0
      // 1b1: istore 17
      // 1b3: invokestatic hxt.xe2 ()Z
      // 1b6: iload 12
      // 1b8: ifne 1ce
      // 1bb: ifeq 1cc
      // 1be: goto 1c5
      // 1c1: invokestatic ca8.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: iload 17
      // 1c7: invokestatic net/optifine/CustomColors.getSignTextColor (I)I
      // 1ca: istore 17
      // 1cc: iload 9
      // 1ce: iload 12
      // 1d0: ifne 317
      // 1d3: ifge 307
      // 1d6: goto 1dd
      // 1d9: invokestatic ca8.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: bipush 0
      // 1de: istore 18
      // 1e0: iload 18
      // 1e2: aload 1
      // 1e3: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 1e6: arraylength
      // 1e7: if_icmpge 307
      // 1ea: aload 1
      // 1eb: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 1ee: iload 18
      // 1f0: aaload
      // 1f1: iload 12
      // 1f3: ifne 20e
      // 1f6: ifnull 2ff
      // 1f9: goto 200
      // 1fc: invokestatic ca8.a (Loov;)Loov;
      // 1ff: athrow
      // 200: aload 1
      // 201: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 204: iload 18
      // 206: aaload
      // 207: goto 20e
      // 20a: invokestatic ca8.a (Loov;)Loov;
      // 20d: athrow
      // 20e: astore 19
      // 210: aload 19
      // 212: bipush 90
      // 214: aload 15
      // 216: bipush 0
      // 217: bipush 1
      // 218: invokestatic p_i.vtz (Lekw;ILowt;ZZ)Ljava/util/List;
      // 21b: astore 20
      // 21d: aload 20
      // 21f: iload 12
      // 221: ifne 230
      // 224: ifnull 25e
      // 227: goto 22e
      // 22a: invokestatic ca8.a (Loov;)Loov;
      // 22d: athrow
      // 22e: aload 20
      // 230: iload 12
      // 232: ifne 253
      // 235: invokeinterface java/util/List.size ()I 1
      // 23a: ifle 25e
      // 23d: goto 244
      // 240: invokestatic ca8.a (Loov;)Loov;
      // 243: athrow
      // 244: aload 20
      // 246: bipush 0
      // 247: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 24c: goto 253
      // 24f: invokestatic ca8.a (Loov;)Loov;
      // 252: athrow
      // 253: checkcast ekw
      // 256: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 25b: goto 261
      // 25e: ldc ""
      // 260: nop
      // 261: astore 21
      // 263: iload 18
      // 265: iload 12
      // 267: ifne 2fe
      // 26a: aload 1
      // 26b: getfield net/minecraft/tileentity/TileEntitySign.mjm I
      // 26e: if_icmpne 2d5
      // 271: goto 278
      // 274: invokestatic ca8.a (Loov;)Loov;
      // 277: athrow
      // 278: new java/lang/StringBuilder
      // 27b: dup
      // 27c: invokespecial java/lang/StringBuilder.<init> ()V
      // 27f: sipush 22190
      // 282: ldc2_w 7605355996155999767
      // 285: lload 10
      // 287: lxor
      // 288: invokedynamic v (IJ)Ljava/lang/String; bsm=ca8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: nop
      // 28e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 291: aload 21
      // 293: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 296: sipush 22996
      // 299: ldc2_w 8143041769278568812
      // 29c: lload 10
      // 29e: lxor
      // 29f: invokedynamic v (IJ)Ljava/lang/String; bsm=ca8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a4: nop
      // 2a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ab: astore 21
      // 2ad: aload 15
      // 2af: aload 21
      // 2b1: aload 15
      // 2b3: aload 21
      // 2b5: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 2b8: ineg
      // 2b9: bipush 2
      // 2ba: idiv
      // 2bb: i2f
      // 2bc: iload 18
      // 2be: bipush 10
      // 2c0: imul
      // 2c1: aload 1
      // 2c2: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 2c5: arraylength
      // 2c6: bipush 5
      // 2c7: imul
      // 2c8: isub
      // 2c9: i2f
      // 2ca: iload 17
      // 2cc: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 2cf: pop
      // 2d0: iload 12
      // 2d2: ifeq 2ff
      // 2d5: aload 15
      // 2d7: aload 21
      // 2d9: aload 15
      // 2db: aload 21
      // 2dd: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 2e0: ineg
      // 2e1: bipush 2
      // 2e2: idiv
      // 2e3: i2f
      // 2e4: iload 18
      // 2e6: bipush 10
      // 2e8: imul
      // 2e9: aload 1
      // 2ea: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 2ed: arraylength
      // 2ee: bipush 5
      // 2ef: imul
      // 2f0: isub
      // 2f1: i2f
      // 2f2: iload 17
      // 2f4: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 2f7: goto 2fe
      // 2fa: invokestatic ca8.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: pop
      // 2ff: iinc 18 1
      // 302: iload 12
      // 304: ifeq 1e0
      // 307: bipush 1
      // 308: invokestatic hzu.jun (Z)V
      // 30b: fconst_1
      // 30c: fconst_1
      // 30d: fconst_1
      // 30e: fconst_1
      // 30f: invokestatic hzu.wn0 (FFFF)V
      // 312: invokestatic hzu.x3w ()V
      // 315: iload 9
      // 317: iload 12
      // 319: ifne 339
      // 31c: iflt 33c
      // 31f: goto 326
      // 322: invokestatic ca8.a (Loov;)Loov;
      // 325: athrow
      // 326: sipush 5890
      // 329: invokestatic hzu.ah8 (I)V
      // 32c: invokestatic hzu.x3w ()V
      // 32f: sipush 5888
      // 332: goto 339
      // 335: invokestatic ca8.a (Loov;)Loov;
      // 338: athrow
      // 339: invokestatic hzu.ah8 (I)V
      // 33c: return
   }

   private static boolean zjh(TileEntitySign param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 07: iload 1
      // 08: ifne 24
      // 0b: ifeq 1b
      // 0e: goto 15
      // 11: invokestatic ca8.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: ireturn
      // 17: invokestatic ca8.a (Loov;)Loov;
      // 1a: athrow
      // 1b: invokestatic hxt.a59 ()Lc05;
      // 1e: getfield Minecraft.u0y Lgbe;
      // 21: instanceof ptg
      // 24: iload 1
      // 25: ifne 3b
      // 28: ifeq 38
      // 2b: goto 32
      // 2e: invokestatic ca8.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: ireturn
      // 34: invokestatic ca8.a (Loov;)Loov;
      // 37: athrow
      // 38: getstatic hxt.shm Z
      // 3b: iload 1
      // 3c: ifne 94
      // 3f: ifne 93
      // 42: goto 49
      // 45: invokestatic ca8.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield net/minecraft/tileentity/TileEntitySign.mjm I
      // 4d: iload 1
      // 4e: ifne 94
      // 51: goto 58
      // 54: invokestatic ca8.a (Loov;)Loov;
      // 57: athrow
      // 58: ifge 93
      // 5b: goto 62
      // 5e: invokestatic ca8.a (Loov;)Loov;
      // 61: athrow
      // 62: invokestatic hxt.a59 ()Lc05;
      // 65: invokevirtual Minecraft.nsd ()Li2h;
      // 68: astore 2
      // 69: aload 0
      // 6a: aload 2
      // 6b: getfield EntityLivingBase.o2v D
      // 6e: aload 2
      // 6f: getfield EntityLivingBase.kfp D
      // 72: aload 2
      // 73: getfield EntityLivingBase.vbd D
      // 76: invokevirtual net/minecraft/tileentity/TileEntitySign.vor (DDD)D
      // 79: dstore 3
      // 7a: dload 3
      // 7b: getstatic ca8.v83 D
      // 7e: dcmpl
      // 7f: iload 1
      // 80: ifne 94
      // 83: ifle 93
      // 86: goto 8d
      // 89: invokestatic ca8.a (Loov;)Loov;
      // 8c: athrow
      // 8d: bipush 0
      // 8e: ireturn
      // 8f: invokestatic ca8.a (Loov;)Loov;
      // 92: athrow
      // 93: bipush 1
      // 94: ireturn
   }

   public static void _2n() {
      Minecraft var0 = hxt.a59();
      double var1 = (double)hxt.zkb(var0.oxn.bpa, 1.0F, 120.0F);
      double var3 = Math.max(1.5 * (double)var0.ry7 / var1, 16.0);
      v83 = var3 * var3;
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.qg6((TileEntitySign)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-402353521029401597L, -6387921132051673555L, MethodHandles.lookup().lookupClass()).a(119176146904186L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 132785708838250L;
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
      String var4 = "\u001a\u0097«DÛS9Êpá¡\f\u0082@e!\u0010ç\u000f\u001b ý\u0096ªz\u00955Ï´¹\u009f}\u009c8¯wN\u0001\u0088\u00942\u0005ëT\u001d\u0083\u0005{úÅ©\u009d·Ö\tDuCãfÆõ³ýþ\u0087ñð[\u0015\u0014«\f\u0093o2e\\Õú\u009b\u0004zK\t¨\u009fï\u009aº";
      int var6 = "\u001a\u0097«DÛS9Êpá¡\f\u0082@e!\u0010ç\u000f\u001b ý\u0096ªz\u00955Ï´¹\u009f}\u009c8¯wN\u0001\u0088\u00942\u0005ëT\u001d\u0083\u0005{úÅ©\u009d·Ö\tDuCãfÆõ³ýþ\u0087ñð[\u0015\u0014«\f\u0093o2e\\Õú\u009b\u0004zK\t¨\u009fï\u009aº"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            iwg = new gdz(a<"v">(27213, 2923657257749801570L ^ var9));
            v83 = 4096.0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16518;
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
            throw new RuntimeException("ca8", var10);
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
         throw new RuntimeException("ca8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
