package net.minecraft.tileentity;

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

public class TileEntityEnderChest extends pyk implements xcy {
   public float bmi;
   public float p4f;
   public int juo;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic net/minecraft/tileentity/TileEntityEnderChest.a J
      // 003: ldc2_w 106270843215034
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 00b: astore 3
      // 00c: aload 0
      // 00d: dup
      // 00e: getfield net/minecraft/tileentity/TileEntityEnderChest._lv I
      // 011: bipush 1
      // 012: iadd
      // 013: dup_x1
      // 014: putfield net/minecraft/tileentity/TileEntityEnderChest._lv I
      // 017: bipush 20
      // 019: irem
      // 01a: bipush 4
      // 01b: imul
      // 01c: aload 3
      // 01d: ifnonnull 053
      // 020: ifne 044
      // 023: goto 02a
      // 026: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield net/minecraft/tileentity/TileEntityEnderChest.yh_ Lt9d;
      // 02e: aload 0
      // 02f: getfield net/minecraft/tileentity/TileEntityEnderChest.al2 Lmew;
      // 032: getstatic ox_.xoy Le0x;
      // 035: bipush 1
      // 036: aload 0
      // 037: getfield net/minecraft/tileentity/TileEntityEnderChest.juo I
      // 03a: invokevirtual OpaquePredicate.dfj (Lmew;Le0x;II)V
      // 03d: goto 044
      // 040: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: aload 0
      // 046: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 049: putfield net/minecraft/tileentity/TileEntityEnderChest.p4f F
      // 04c: aload 0
      // 04d: getfield net/minecraft/tileentity/TileEntityEnderChest.al2 Lmew;
      // 050: invokevirtual mew.getX ()I
      // 053: istore 4
      // 055: aload 0
      // 056: getfield net/minecraft/tileentity/TileEntityEnderChest.al2 Lmew;
      // 059: invokevirtual mew.getY ()I
      // 05c: istore 5
      // 05e: aload 0
      // 05f: getfield net/minecraft/tileentity/TileEntityEnderChest.al2 Lmew;
      // 062: invokevirtual mew.getZ ()I
      // 065: istore 6
      // 067: ldc 0.1
      // 069: nop
      // 06a: fstore 7
      // 06c: aload 0
      // 06d: getfield net/minecraft/tileentity/TileEntityEnderChest.juo I
      // 070: aload 3
      // 071: ifnonnull 0e4
      // 074: ifle 0e0
      // 077: goto 07e
      // 07a: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 082: fconst_0
      // 083: fcmpl
      // 084: aload 3
      // 085: ifnonnull 0e4
      // 088: goto 08f
      // 08b: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 08e: athrow
      // 08f: ifne 0e0
      // 092: goto 099
      // 095: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 098: athrow
      // 099: iload 4
      // 09b: i2d
      // 09c: ldc2_w 0.5
      // 09f: dadd
      // 0a0: dstore 8
      // 0a2: iload 6
      // 0a4: i2d
      // 0a5: ldc2_w 0.5
      // 0a8: dadd
      // 0a9: dstore 10
      // 0ab: aload 0
      // 0ac: getfield net/minecraft/tileentity/TileEntityEnderChest.yh_ Lt9d;
      // 0af: dload 8
      // 0b1: iload 5
      // 0b3: i2d
      // 0b4: ldc2_w 0.5
      // 0b7: dadd
      // 0b8: dload 10
      // 0ba: sipush 21138
      // 0bd: ldc2_w 4359407582867083115
      // 0c0: lload 1
      // 0c1: lxor
      // 0c2: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityEnderChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: ldc 0.5
      // 0ca: nop
      // 0cb: aload 0
      // 0cc: getfield net/minecraft/tileentity/TileEntityEnderChest.yh_ Lt9d;
      // 0cf: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 0d2: invokevirtual java/util/Random.nextFloat ()F
      // 0d5: ldc 0.1
      // 0d7: nop
      // 0d8: fmul
      // 0d9: ldc 0.9
      // 0db: nop
      // 0dc: fadd
      // 0dd: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 0e0: aload 0
      // 0e1: getfield net/minecraft/tileentity/TileEntityEnderChest.juo I
      // 0e4: aload 3
      // 0e5: ifnonnull 118
      // 0e8: ifne 10d
      // 0eb: goto 0f2
      // 0ee: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 0f6: aload 3
      // 0f7: ifnonnull 14c
      // 0fa: goto 101
      // 0fd: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 100: athrow
      // 101: fconst_0
      // 102: fcmpl
      // 103: ifgt 141
      // 106: goto 10d
      // 109: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 0
      // 10e: getfield net/minecraft/tileentity/TileEntityEnderChest.juo I
      // 111: goto 118
      // 114: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 3
      // 119: ifnonnull 13e
      // 11c: ifle 23c
      // 11f: goto 126
      // 122: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 12a: aload 3
      // 12b: ifnonnull 14c
      // 12e: goto 135
      // 131: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 134: athrow
      // 135: fconst_1
      // 136: fcmpg
      // 137: goto 13e
      // 13a: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 13d: athrow
      // 13e: ifge 23c
      // 141: aload 0
      // 142: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 145: goto 14c
      // 148: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 14b: athrow
      // 14c: fstore 8
      // 14e: aload 0
      // 14f: aload 3
      // 150: ifnonnull 17e
      // 153: getfield net/minecraft/tileentity/TileEntityEnderChest.juo I
      // 156: ifle 176
      // 159: goto 160
      // 15c: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 15f: athrow
      // 160: aload 0
      // 161: dup
      // 162: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 165: fload 7
      // 167: fadd
      // 168: putfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 16b: aload 3
      // 16c: ifnull 188
      // 16f: goto 176
      // 172: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: goto 17e
      // 17a: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 17d: athrow
      // 17e: dup
      // 17f: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 182: fload 7
      // 184: fsub
      // 185: putfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 188: aload 0
      // 189: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 18c: aload 3
      // 18d: ifnonnull 1ab
      // 190: fconst_1
      // 191: fcmpl
      // 192: ifle 1a8
      // 195: goto 19c
      // 198: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 19b: athrow
      // 19c: aload 0
      // 19d: fconst_1
      // 19e: putfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 1a1: goto 1a8
      // 1a4: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: ldc 0.5
      // 1aa: nop
      // 1ab: fstore 9
      // 1ad: aload 0
      // 1ae: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 1b1: fload 9
      // 1b3: fcmpg
      // 1b4: aload 3
      // 1b5: ifnonnull 234
      // 1b8: ifge 223
      // 1bb: goto 1c2
      // 1be: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: fload 8
      // 1c4: fload 9
      // 1c6: fcmpl
      // 1c7: aload 3
      // 1c8: ifnonnull 234
      // 1cb: goto 1d2
      // 1ce: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: iflt 223
      // 1d5: goto 1dc
      // 1d8: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: iload 4
      // 1de: i2d
      // 1df: ldc2_w 0.5
      // 1e2: dadd
      // 1e3: dstore 10
      // 1e5: iload 6
      // 1e7: i2d
      // 1e8: ldc2_w 0.5
      // 1eb: dadd
      // 1ec: dstore 12
      // 1ee: aload 0
      // 1ef: getfield net/minecraft/tileentity/TileEntityEnderChest.yh_ Lt9d;
      // 1f2: dload 10
      // 1f4: iload 5
      // 1f6: i2d
      // 1f7: ldc2_w 0.5
      // 1fa: dadd
      // 1fb: dload 12
      // 1fd: sipush 3319
      // 200: ldc2_w 7948744237306351887
      // 203: lload 1
      // 204: lxor
      // 205: invokedynamic e (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityEnderChest.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: nop
      // 20b: ldc 0.5
      // 20d: nop
      // 20e: aload 0
      // 20f: getfield net/minecraft/tileentity/TileEntityEnderChest.yh_ Lt9d;
      // 212: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 215: invokevirtual java/util/Random.nextFloat ()F
      // 218: ldc 0.1
      // 21a: nop
      // 21b: fmul
      // 21c: ldc 0.9
      // 21e: nop
      // 21f: fadd
      // 220: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 223: aload 0
      // 224: aload 3
      // 225: ifnonnull 238
      // 228: getfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 22b: fconst_0
      // 22c: fcmpg
      // 22d: goto 234
      // 230: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 233: athrow
      // 234: ifge 23c
      // 237: aload 0
      // 238: fconst_0
      // 239: putfield net/minecraft/tileentity/TileEntityEnderChest.bmi F
      // 23c: return
   }

   @Override
   public boolean hjo(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: iload 1
      // 05: aload 3
      // 06: ifnonnull 25
      // 09: bipush 1
      // 0a: if_icmpne 1f
      // 0d: goto 14
      // 10: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 13: athrow
      // 14: aload 0
      // 15: iload 2
      // 16: putfield net/minecraft/tileentity/TileEntityEnderChest.juo I
      // 19: bipush 1
      // 1a: ireturn
      // 1b: invokestatic net/minecraft/tileentity/TileEntityEnderChest.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: iload 2
      // 22: invokespecial pyk.hjo (II)Z
      // 25: ireturn
   }

   @Override
   public void whd() {
      this.xur();
      super.whd();
   }

   public void o7o() {
      this.juo++;
      this.yh_.dfj(this.al2, ox_.xoy, 1, this.juo);
   }

   public void cb_() {
      this.juo--;
      this.yh_.dfj(this.al2, ox_.xoy, 1, this.juo);
   }

   public boolean cue(ha9 var1) {
      int[] var2 = TileEntityBeacon$yv7.b();

      try {
         if (this.yh_.getTileEntity(this.al2) != this) {
            return (boolean)0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         double var5;
         int var10000 = (var5 = var1.p53((double)this.al2.getX() + 0.5, (double)this.al2.getY() + 0.5, (double)this.al2.getZ() + 0.5) - 64.0) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
         if (var2 != null) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-407191639206185847L, 5152427043169564325L, MethodHandles.lookup().lookupClass()).a(121717440412500L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 63619200148624L;
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
      String var6 = "\u0010\u0002m\u0087$B\u0018?Ä×¡\u001bJ\bs3\u008fØõ\"«(\u00adçnù ¿¦-\u0098æ\u0093=¨p=/\u0018\u0089(\u0018ÂÏ\u0091¤¦S\u0094Ó\u0083ø7G\u000b6%o\u0088è\u007fqÄîÅF\u0003\u0082\u0083\u0083»ð5½¼\u008dZ\u009fe\u0018Þ";
      int var8 = "\u0010\u0002m\u0087$B\u0018?Ä×¡\u001bJ\bs3\u008fØõ\"«(\u00adçnù ¿¦-\u0098æ\u0093=¨p=/\u0018\u0089(\u0018ÂÏ\u0091¤¦S\u0094Ó\u0083ø7G\u000b6%o\u0088è\u007fqÄîÅF\u0003\u0082\u0083\u0083»ð5½¼\u008dZ\u009fe\u0018Þ"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7235;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityEnderChest", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityEnderChest" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
