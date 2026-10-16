import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityEnderChest;

public class _he extends q9h {
   public void qhm(TileEntityEnderChest param1, double param2, double param4, double param6, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 10
      // 005: bipush 0
      // 006: istore 11
      // 008: aload 1
      // 009: invokevirtual net/minecraft/tileentity/TileEntityEnderChest.g8i ()Z
      // 00c: iload 10
      // 00e: ifne 023
      // 011: ifeq 021
      // 014: goto 01b
      // 017: invokestatic _he.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 1
      // 01c: invokevirtual net/minecraft/tileentity/TileEntityEnderChest.hvh ()I
      // 01f: istore 11
      // 021: iload 9
      // 023: iload 10
      // 025: ifne 065
      // 028: iflt 06d
      // 02b: goto 032
      // 02e: invokestatic _he.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: getstatic _he._oj [Lgdz;
      // 036: iload 9
      // 038: aaload
      // 039: invokevirtual _he.g3j (Lgdz;)V
      // 03c: sipush 5890
      // 03f: invokestatic hzu.ah8 (I)V
      // 042: invokestatic hzu.dp2 ()V
      // 045: ldc 4.0
      // 047: nop
      // 048: ldc 4.0
      // 04a: nop
      // 04b: fconst_1
      // 04c: invokestatic hzu.syc (FFF)V
      // 04f: ldc 0.0625
      // 051: nop
      // 052: ldc 0.0625
      // 054: nop
      // 055: ldc 0.0625
      // 057: nop
      // 058: invokestatic hzu.a4k (FFF)V
      // 05b: sipush 5888
      // 05e: goto 065
      // 061: invokestatic _he.a (Loov;)Loov;
      // 064: athrow
      // 065: invokestatic hzu.ah8 (I)V
      // 068: iload 10
      // 06a: ifeq 07b
      // 06d: aload 0
      // 06e: getstatic _he.rcu Lgdz;
      // 071: invokevirtual _he.g3j (Lgdz;)V
      // 074: goto 07b
      // 077: invokestatic _he.a (Loov;)Loov;
      // 07a: athrow
      // 07b: invokestatic hzu.dp2 ()V
      // 07e: invokestatic hzu.ixc ()V
      // 081: fconst_1
      // 082: fconst_1
      // 083: fconst_1
      // 084: fconst_1
      // 085: invokestatic hzu.wn0 (FFFF)V
      // 088: dload 2
      // 089: d2f
      // 08a: dload 4
      // 08c: d2f
      // 08d: fconst_1
      // 08e: fadd
      // 08f: dload 6
      // 091: d2f
      // 092: fconst_1
      // 093: fadd
      // 094: invokestatic hzu.a4k (FFF)V
      // 097: fconst_1
      // 098: ldc -1.0
      // 09a: nop
      // 09b: ldc -1.0
      // 09d: nop
      // 09e: invokestatic hzu.syc (FFF)V
      // 0a1: ldc 0.5
      // 0a3: nop
      // 0a4: ldc 0.5
      // 0a6: nop
      // 0a7: ldc 0.5
      // 0a9: nop
      // 0aa: invokestatic hzu.a4k (FFF)V
      // 0ad: bipush 0
      // 0ae: istore 12
      // 0b0: iload 11
      // 0b2: bipush 2
      // 0b3: iload 10
      // 0b5: ifne 0ca
      // 0b8: if_icmpne 0c7
      // 0bb: goto 0c2
      // 0be: invokestatic _he.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: sipush 180
      // 0c5: istore 12
      // 0c7: iload 11
      // 0c9: bipush 3
      // 0ca: iload 10
      // 0cc: ifne 0df
      // 0cf: if_icmpne 0dc
      // 0d2: goto 0d9
      // 0d5: invokestatic _he.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: bipush 0
      // 0da: istore 12
      // 0dc: iload 11
      // 0de: bipush 4
      // 0df: iload 10
      // 0e1: ifne 101
      // 0e4: if_icmpne 0f2
      // 0e7: goto 0ee
      // 0ea: invokestatic _he.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: bipush 90
      // 0f0: istore 12
      // 0f2: iload 11
      // 0f4: iload 10
      // 0f6: ifne 10a
      // 0f9: bipush 5
      // 0fa: goto 101
      // 0fd: invokestatic _he.a (Loov;)Loov;
      // 100: athrow
      // 101: if_icmpne 108
      // 104: bipush -90
      // 106: istore 12
      // 108: iload 12
      // 10a: i2f
      // 10b: fconst_0
      // 10c: fconst_1
      // 10d: fconst_0
      // 10e: invokestatic hzu.a2h (FFFF)V
      // 111: ldc -0.5
      // 113: nop
      // 114: ldc -0.5
      // 116: nop
      // 117: ldc -0.5
      // 119: nop
      // 11a: invokestatic hzu.a4k (FFF)V
      // 11d: aload 1
      // 11e: getfield net/minecraft/tileentity/TileEntityEnderChest.p4f F
      // 121: aload 1
      // 122: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 125: aload 1
      // 126: getfield net/minecraft/tileentity/TileEntityEnderChest.p4f F
      // 129: fsub
      // 12a: fload 8
      // 12c: fmul
      // 12d: fadd
      // 12e: fstore 13
      // 130: fconst_1
      // 131: fload 13
      // 133: fsub
      // 134: fstore 13
      // 136: fconst_1
      // 137: fload 13
      // 139: fload 13
      // 13b: fmul
      // 13c: fload 13
      // 13e: fmul
      // 13f: fsub
      // 140: fstore 13
      // 142: aload 0
      // 143: getfield _he.uml Lvu3;
      // 146: getfield vu3.e0v Ltf8;
      // 149: fload 13
      // 14b: ldc 3.1415927
      // 14d: nop
      // 14e: fmul
      // 14f: fconst_2
      // 150: fdiv
      // 151: fneg
      // 152: putfield tf8.pod F
      // 155: getstatic kgt.qt1 Lvvu;
      // 158: invokevirtual vvu.klu ()Z
      // 15b: iload 10
      // 15d: ifne 17a
      // 160: ifeq 18d
      // 163: goto 16a
      // 166: invokestatic _he.a (Loov;)Loov;
      // 169: athrow
      // 16a: getstatic vvu.exr Lcn7;
      // 16d: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 170: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 173: goto 17a
      // 176: invokestatic _he.a (Loov;)Loov;
      // 179: athrow
      // 17a: iload 10
      // 17c: ifne 18a
      // 17f: ifeq 18d
      // 182: goto 189
      // 185: invokestatic _he.a (Loov;)Loov;
      // 188: athrow
      // 189: bipush 1
      // 18a: goto 18e
      // 18d: bipush 0
      // 18e: istore 14
      // 190: iload 14
      // 192: iload 10
      // 194: ifne 1ac
      // 197: ifeq 203
      // 19a: goto 1a1
      // 19d: invokestatic _he.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 1
      // 1a2: invokevirtual net/minecraft/tileentity/TileEntityEnderChest.g8i ()Z
      // 1a5: goto 1ac
      // 1a8: invokestatic _he.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: iload 10
      // 1ae: ifne 1f1
      // 1b1: ifeq 203
      // 1b4: goto 1bb
      // 1b7: invokestatic _he.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: aload 0
      // 1bc: getfield _he.uml Lvu3;
      // 1bf: invokevirtual vu3.znj ()V
      // 1c2: invokestatic iyr.itn ()V
      // 1c5: aload 0
      // 1c6: getfield _he.uml Lvu3;
      // 1c9: invokevirtual vu3.znj ()V
      // 1cc: invokestatic iyr.e3_ ()V
      // 1cf: aload 0
      // 1d0: getfield _he.uml Lvu3;
      // 1d3: invokevirtual vu3.znj ()V
      // 1d6: invokestatic iyr.xby ()V
      // 1d9: new java/awt/Color
      // 1dc: dup
      // 1dd: bipush 26
      // 1df: sipush 129
      // 1e2: bipush 112
      // 1e4: invokespecial java/awt/Color.<init> (III)V
      // 1e7: invokevirtual java/awt/Color.getRGB ()I
      // 1ea: goto 1f1
      // 1ed: invokestatic _he.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: invokestatic iyr.zt6 (I)V
      // 1f4: aload 0
      // 1f5: getfield _he.uml Lvu3;
      // 1f8: invokevirtual vu3.znj ()V
      // 1fb: invokestatic iyr._nz ()V
      // 1fe: iload 10
      // 200: ifeq 211
      // 203: aload 0
      // 204: getfield _he.uml Lvu3;
      // 207: invokevirtual vu3.znj ()V
      // 20a: goto 211
      // 20d: invokestatic _he.a (Loov;)Loov;
      // 210: athrow
      // 211: invokestatic hzu.eiq ()V
      // 214: invokestatic hzu.x3w ()V
      // 217: fconst_1
      // 218: fconst_1
      // 219: fconst_1
      // 21a: fconst_1
      // 21b: invokestatic hzu.wn0 (FFFF)V
      // 21e: iload 9
      // 220: iload 10
      // 222: ifne 242
      // 225: iflt 245
      // 228: goto 22f
      // 22b: invokestatic _he.a (Loov;)Loov;
      // 22e: athrow
      // 22f: sipush 5890
      // 232: invokestatic hzu.ah8 (I)V
      // 235: invokestatic hzu.x3w ()V
      // 238: sipush 5888
      // 23b: goto 242
      // 23e: invokestatic _he.a (Loov;)Loov;
      // 241: athrow
      // 242: invokestatic hzu.ah8 (I)V
      // 245: return
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.qhm((TileEntityEnderChest)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8747258586234049L, 844699934658258483L, MethodHandles.lookup().lookupClass()).a(269189338465079L);
      // $VF: monitorexit
      long var4 = var10000 ^ 19004673270518L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0011©\u001d\u008c\u0002ÌÎB\u0003G\u0011QÄÎ\u0013\u0099vËû¼\u0005ä\u009b\u0094½\u0005\u001fj4Iúr".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      rcu = new gdz(var0);
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
}
