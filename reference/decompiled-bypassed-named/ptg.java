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
import org.lwjgl.input.Keyboard;

public class ptg extends ShaderHelper {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ptg(TileEntitySign var1) {
      this.bwx = var1;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 36731833232313L;
      this.khf.clear();
      Keyboard.enableRepeatEvents(true);
      this.khf.add(this.cgz = new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 120, fc1.gx1(b<"i">(4129, 2194788784211878907L ^ var1), new Object[0])));
      this.bwx.bf1(false);
   }

   @Override
   public void onGuiClosed() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: invokestatic org/lwjgl/input/Keyboard.enableRepeatEvents (Z)V
      // 08: aload 0
      // 09: getfield ptg.f41 Lc05;
      // 0c: invokevirtual Minecraft.c02 ()Lp_k;
      // 0f: astore 2
      // 10: iload 1
      // 11: ifne 47
      // 14: aload 2
      // 15: ifnull 3f
      // 18: goto 1f
      // 1b: invokestatic ptg.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 2
      // 20: new net/minecraft/network/play/client/C12PacketUpdateSign
      // 23: dup
      // 24: aload 0
      // 25: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 28: invokevirtual net/minecraft/tileentity/TileEntitySign.y8_ ()Lmew;
      // 2b: aload 0
      // 2c: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 2f: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 32: invokespecial net/minecraft/network/play/client/C12PacketUpdateSign.<init> (Lmew;[Lekw;)V
      // 35: invokevirtual p_k.sxi (Lmz2;)V
      // 38: goto 3f
      // 3b: invokestatic ptg.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 43: bipush 1
      // 44: invokevirtual net/minecraft/tileentity/TileEntitySign.bf1 (Z)V
      // 47: return
   }

   @Override
   public void updateScreen() {
      this.nsn++;
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 3d
      // 0f: goto 16
      // 12: invokestatic ptg.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic ptg.a (Loov;)Loov;
      // 20: athrow
      // 21: ifne 3d
      // 24: aload 0
      // 25: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 28: invokevirtual net/minecraft/tileentity/TileEntitySign.r5t ()V
      // 2b: aload 0
      // 2c: getfield ptg.f41 Lc05;
      // 2f: aconst_null
      // 30: checkcast ShaderHelper
      // 33: invokevirtual Minecraft.z2i (Lgbe;)V
      // 36: goto 3d
      // 39: invokestatic ptg.a (Loov;)Loov;
      // 3c: athrow
      // 3d: return
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: iload 2
      // 005: sipush 200
      // 008: iload 3
      // 009: ifne 02d
      // 00c: if_icmpne 029
      // 00f: goto 016
      // 012: invokestatic ptg.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: aload 0
      // 018: getfield ptg.w8a I
      // 01b: bipush 1
      // 01c: isub
      // 01d: bipush 3
      // 01e: iand
      // 01f: putfield ptg.w8a I
      // 022: goto 029
      // 025: invokestatic ptg.a (Loov;)Loov;
      // 028: athrow
      // 029: iload 2
      // 02a: sipush 208
      // 02d: iload 3
      // 02e: ifne 045
      // 031: if_icmpeq 061
      // 034: goto 03b
      // 037: invokestatic ptg.a (Loov;)Loov;
      // 03a: athrow
      // 03b: iload 2
      // 03c: bipush 28
      // 03e: goto 045
      // 041: invokestatic ptg.a (Loov;)Loov;
      // 044: athrow
      // 045: iload 3
      // 046: ifne 05e
      // 049: if_icmpeq 061
      // 04c: goto 053
      // 04f: invokestatic ptg.a (Loov;)Loov;
      // 052: athrow
      // 053: iload 2
      // 054: sipush 156
      // 057: goto 05e
      // 05a: invokestatic ptg.a (Loov;)Loov;
      // 05d: athrow
      // 05e: if_icmpne 074
      // 061: aload 0
      // 062: aload 0
      // 063: getfield ptg.w8a I
      // 066: bipush 1
      // 067: iadd
      // 068: bipush 3
      // 069: iand
      // 06a: putfield ptg.w8a I
      // 06d: goto 074
      // 070: invokestatic ptg.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 078: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 07b: aload 0
      // 07c: getfield ptg.w8a I
      // 07f: aaload
      // 080: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 085: astore 4
      // 087: iload 2
      // 088: iload 3
      // 089: ifne 0c5
      // 08c: bipush 14
      // 08e: if_icmpne 0c1
      // 091: goto 098
      // 094: invokestatic ptg.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 4
      // 09a: invokevirtual java/lang/String.length ()I
      // 09d: iload 3
      // 09e: ifne 0c5
      // 0a1: goto 0a8
      // 0a4: invokestatic ptg.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifle 0c1
      // 0ab: goto 0b2
      // 0ae: invokestatic ptg.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 4
      // 0b4: bipush 0
      // 0b5: aload 4
      // 0b7: invokevirtual java/lang/String.length ()I
      // 0ba: bipush 1
      // 0bb: isub
      // 0bc: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0bf: astore 4
      // 0c1: iload 1
      // 0c2: invokestatic _xi._m2 (C)Z
      // 0c5: iload 3
      // 0c6: ifne 13a
      // 0c9: ifeq 119
      // 0cc: goto 0d3
      // 0cf: invokestatic ptg.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield ptg.fex Lowt;
      // 0d7: new java/lang/StringBuilder
      // 0da: dup
      // 0db: invokespecial java/lang/StringBuilder.<init> ()V
      // 0de: aload 4
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: iload 1
      // 0e4: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ea: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 0ed: bipush 90
      // 0ef: iload 3
      // 0f0: ifne 13b
      // 0f3: goto 0fa
      // 0f6: invokestatic ptg.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: if_icmpgt 119
      // 0fd: goto 104
      // 100: invokestatic ptg.a (Loov;)Loov;
      // 103: athrow
      // 104: new java/lang/StringBuilder
      // 107: dup
      // 108: invokespecial java/lang/StringBuilder.<init> ()V
      // 10b: aload 4
      // 10d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 110: iload 1
      // 111: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 114: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 117: astore 4
      // 119: aload 0
      // 11a: iload 3
      // 11b: ifne 13f
      // 11e: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 121: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 124: aload 0
      // 125: getfield ptg.w8a I
      // 128: new tao
      // 12b: dup
      // 12c: aload 4
      // 12e: invokespecial tao.<init> (Ljava/lang/String;)V
      // 131: aastore
      // 132: iload 2
      // 133: goto 13a
      // 136: invokestatic ptg.a (Loov;)Loov;
      // 139: athrow
      // 13a: bipush 1
      // 13b: if_icmpne 146
      // 13e: aload 0
      // 13f: aload 0
      // 140: getfield ptg.cgz Lgt4;
      // 143: invokevirtual ptg.actionPerformed (Lgt4;)V
      // 146: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ptg.a J
      // 003: ldc2_w 62887272116358
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: invokevirtual ptg.xmz ()V
      // 00d: aload 0
      // 00e: aload 0
      // 00f: getfield ptg.fex Lowt;
      // 012: sipush 21035
      // 015: ldc2_w 2048930102385605327
      // 018: lload 4
      // 01a: lxor
      // 01b: invokedynamic i (IJ)Ljava/lang/String; bsm=ptg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: bipush 0
      // 022: anewarray 61
      // 025: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 028: aload 0
      // 029: getfield ptg.dt7 I
      // 02c: bipush 2
      // 02d: idiv
      // 02e: bipush 40
      // 030: ldc 16777215
      // 032: nop
      // 033: invokevirtual ptg.poi (Lowt;Ljava/lang/String;III)V
      // 036: fconst_1
      // 037: fconst_1
      // 038: fconst_1
      // 039: fconst_1
      // 03a: invokestatic hzu.wn0 (FFFF)V
      // 03d: invokestatic hzu.dp2 ()V
      // 040: aload 0
      // 041: getfield ptg.dt7 I
      // 044: bipush 2
      // 045: idiv
      // 046: i2f
      // 047: fconst_0
      // 048: ldc 50.0
      // 04a: nop
      // 04b: invokestatic hzu.a4k (FFF)V
      // 04e: invokestatic OpaquePredicate.b ()I
      // 051: ldc 93.75
      // 053: nop
      // 054: fstore 7
      // 056: istore 6
      // 058: fload 7
      // 05a: fneg
      // 05b: fload 7
      // 05d: fneg
      // 05e: fload 7
      // 060: fneg
      // 061: invokestatic hzu.syc (FFF)V
      // 064: ldc 180.0
      // 066: nop
      // 067: fconst_0
      // 068: fconst_1
      // 069: fconst_0
      // 06a: invokestatic hzu.a2h (FFFF)V
      // 06d: aload 0
      // 06e: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 071: invokevirtual net/minecraft/tileentity/TileEntitySign.qwl ()Le0x;
      // 074: astore 8
      // 076: aload 8
      // 078: getstatic ox_.w0z Le0x;
      // 07b: if_acmpne 0a5
      // 07e: aload 0
      // 07f: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 082: invokevirtual net/minecraft/tileentity/TileEntitySign.hvh ()I
      // 085: sipush 360
      // 088: imul
      // 089: i2f
      // 08a: ldc 16.0
      // 08c: nop
      // 08d: fdiv
      // 08e: fstore 9
      // 090: fload 9
      // 092: fconst_0
      // 093: fconst_1
      // 094: fconst_0
      // 095: invokestatic hzu.a2h (FFFF)V
      // 098: fconst_0
      // 099: ldc -1.0625
      // 09b: nop
      // 09c: fconst_0
      // 09d: invokestatic hzu.a4k (FFF)V
      // 0a0: iload 6
      // 0a2: ifne 0fa
      // 0a5: aload 0
      // 0a6: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 0a9: invokevirtual net/minecraft/tileentity/TileEntitySign.hvh ()I
      // 0ac: istore 9
      // 0ae: fconst_0
      // 0af: fstore 10
      // 0b1: iload 9
      // 0b3: bipush 2
      // 0b4: iload 6
      // 0b6: ifeq 0cb
      // 0b9: if_icmpne 0c8
      // 0bc: goto 0c3
      // 0bf: invokestatic ptg.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: ldc 180.0
      // 0c5: nop
      // 0c6: fstore 10
      // 0c8: iload 9
      // 0ca: bipush 4
      // 0cb: iload 6
      // 0cd: ifeq 0e2
      // 0d0: if_icmpne 0df
      // 0d3: goto 0da
      // 0d6: invokestatic ptg.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: ldc 90.0
      // 0dc: nop
      // 0dd: fstore 10
      // 0df: iload 9
      // 0e1: bipush 5
      // 0e2: if_icmpne 0ea
      // 0e5: ldc -90.0
      // 0e7: nop
      // 0e8: fstore 10
      // 0ea: fload 10
      // 0ec: fconst_0
      // 0ed: fconst_1
      // 0ee: fconst_0
      // 0ef: invokestatic hzu.a2h (FFFF)V
      // 0f2: fconst_0
      // 0f3: ldc -1.0625
      // 0f5: nop
      // 0f6: fconst_0
      // 0f7: invokestatic hzu.a4k (FFF)V
      // 0fa: aload 0
      // 0fb: iload 6
      // 0fd: ifeq 144
      // 100: getfield ptg.nsn I
      // 103: bipush 6
      // 105: idiv
      // 106: bipush 2
      // 107: irem
      // 108: ifne 124
      // 10b: goto 112
      // 10e: invokestatic ptg.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 116: aload 0
      // 117: getfield ptg.w8a I
      // 11a: putfield net/minecraft/tileentity/TileEntitySign.mjm I
      // 11d: goto 124
      // 120: invokestatic ptg.a (Loov;)Loov;
      // 123: athrow
      // 124: getstatic xv4.b2r Lxv4;
      // 127: aload 0
      // 128: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 12b: ldc2_w -0.5
      // 12e: ldc2_w -0.75
      // 131: ldc2_w -0.5
      // 134: fconst_0
      // 135: invokevirtual xv4.h74 (Lpyk;DDDF)V
      // 138: aload 0
      // 139: getfield ptg.bwx Lnet/minecraft/tileentity/TileEntitySign;
      // 13c: bipush -1
      // 13d: putfield net/minecraft/tileentity/TileEntitySign.mjm I
      // 140: invokestatic hzu.x3w ()V
      // 143: aload 0
      // 144: iload 1
      // 145: iload 2
      // 146: fload 3
      // 147: invokespecial ShaderHelper.drawScreen (IIF)V
      // 14a: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2917270786819630758L, -267686458707398111L, MethodHandles.lookup().lookupClass()).a(33908947162037L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 68218374529838L;
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
      String var6 = "©\u0003¾nBÚÎÿ]\u008b\u0098\u009d¯éLîQý4eO\u0015\u0084Ø|Ïè\u0087Ûw\u0010Ó \u0084 Îh2ãM9ª_?;¼tØj\u0086@\u0096\u0004g;Õ\u0019w©å0ºËß\b";
      int var8 = "©\u0003¾nBÚÎÿ]\u008b\u0098\u009d¯éLîQý4eO\u0015\u0084Ø|Ïè\u0087Ûw\u0010Ó \u0084 Îh2ãM9ª_?;¼tØj\u0086@\u0096\u0004g;Õ\u0019w©å0ºËß\b".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2263;
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
            throw new RuntimeException("ptg", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("ptg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
