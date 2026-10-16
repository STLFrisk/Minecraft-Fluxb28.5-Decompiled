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
import net.minecraft.tileentity.TileEntityCommandBlock;

public class p2k extends rw8 {
   public static final h76 gpt;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public p2k() {
      super(p3y.e21, _mi.vbr);
      this.y8l(this._8_.c32().zvi(gpt, false));
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntityCommandBlock();
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifeq 24
      // 0e: ifne cf
      // 11: goto 18
      // 14: invokestatic p2k.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: invokevirtual OpaquePredicate.gxo (Lmew;)Z
      // 1d: goto 24
      // 20: invokestatic p2k.a (Loov;)Loov;
      // 23: athrow
      // 24: istore 6
      // 26: aload 3
      // 27: getstatic p2k.gpt Lh76;
      // 2a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2f: checkcast java/lang/Boolean
      // 32: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 35: istore 7
      // 37: iload 6
      // 39: iload 5
      // 3b: ifeq 94
      // 3e: ifeq 8b
      // 41: goto 48
      // 44: invokestatic p2k.a (Loov;)Loov;
      // 47: athrow
      // 48: iload 7
      // 4a: iload 5
      // 4c: ifeq 94
      // 4f: goto 56
      // 52: invokestatic p2k.a (Loov;)Loov;
      // 55: athrow
      // 56: ifne 8b
      // 59: goto 60
      // 5c: invokestatic p2k.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 1
      // 61: aload 2
      // 62: aload 3
      // 63: getstatic p2k.gpt Lh76;
      // 66: bipush 1
      // 67: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6f: bipush 4
      // 70: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 73: pop
      // 74: aload 1
      // 75: aload 2
      // 76: aload 0
      // 77: aload 0
      // 78: aload 1
      // 79: invokevirtual p2k.odp (Lt9d;)I
      // 7c: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 7f: iload 5
      // 81: ifne cf
      // 84: goto 8b
      // 87: invokestatic p2k.a (Loov;)Loov;
      // 8a: athrow
      // 8b: iload 6
      // 8d: goto 94
      // 90: invokestatic p2k.a (Loov;)Loov;
      // 93: athrow
      // 94: iload 5
      // 96: ifeq a5
      // 99: ifne cf
      // 9c: goto a3
      // 9f: invokestatic p2k.a (Loov;)Loov;
      // a2: athrow
      // a3: iload 7
      // a5: iload 5
      // a7: ifeq ce
      // aa: ifeq cf
      // ad: goto b4
      // b0: invokestatic p2k.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 1
      // b5: aload 2
      // b6: aload 3
      // b7: getstatic p2k.gpt Lh76;
      // ba: bipush 0
      // bb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // be: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // c3: bipush 4
      // c4: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // c7: goto ce
      // ca: invokestatic p2k.a (Loov;)Loov;
      // cd: athrow
      // ce: pop
      // cf: return
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 0a: astore 6
      // 0c: aload 6
      // 0e: iload 5
      // 10: ifne 29
      // 13: instanceof net/minecraft/tileentity/TileEntityCommandBlock
      // 16: ifeq 39
      // 19: goto 20
      // 1c: invokestatic p2k.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 6
      // 22: goto 29
      // 25: invokestatic p2k.a (Loov;)Loov;
      // 28: athrow
      // 29: checkcast net/minecraft/tileentity/TileEntityCommandBlock
      // 2c: invokevirtual net/minecraft/tileentity/TileEntityCommandBlock.n_g ()Lk6s;
      // 2f: aload 1
      // 30: invokevirtual k6s.k7h (Lt9d;)V
      // 33: aload 1
      // 34: aload 2
      // 35: aload 0
      // 36: invokevirtual OpaquePredicate.lw8 (Lmew;Le0x;)V
      // 39: return
   }

   @Override
   public int odp(OpaquePredicate var1) {
      return 1;
   }

   @Override
   public boolean cl2(OpaquePredicate param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 0a: astore 10
      // 0c: aload 10
      // 0e: instanceof net/minecraft/tileentity/TileEntityCommandBlock
      // 11: iload 9
      // 13: ifne 34
      // 16: ifeq 37
      // 19: goto 20
      // 1c: invokestatic p2k.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 10
      // 22: checkcast net/minecraft/tileentity/TileEntityCommandBlock
      // 25: invokevirtual net/minecraft/tileentity/TileEntityCommandBlock.n_g ()Lk6s;
      // 28: aload 4
      // 2a: invokevirtual k6s.bna (Lha9;)Z
      // 2d: goto 34
      // 30: invokestatic p2k.a (Loov;)Loov;
      // 33: athrow
      // 34: goto 38
      // 37: bipush 0
      // 38: ireturn
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 09: astore 4
      // 0b: aload 4
      // 0d: instanceof net/minecraft/tileentity/TileEntityCommandBlock
      // 10: iload 3
      // 11: ifne 30
      // 14: ifeq 33
      // 17: goto 1e
      // 1a: invokestatic p2k.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 4
      // 20: checkcast net/minecraft/tileentity/TileEntityCommandBlock
      // 23: invokevirtual net/minecraft/tileentity/TileEntityCommandBlock.n_g ()Lk6s;
      // 26: invokevirtual k6s.v8x ()I
      // 29: goto 30
      // 2c: invokestatic p2k.a (Loov;)Loov;
      // 2f: athrow
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   @Override
   public void qh0(OpaquePredicate param1, mew param2, zfz param3, Entity param4, erg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic p2k.b J
      // 03: ldc2_w 28507174968568
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 8
      // 0e: aload 1
      // 0f: aload 2
      // 10: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 13: astore 9
      // 15: aload 9
      // 17: iload 8
      // 19: ifne 32
      // 1c: instanceof net/minecraft/tileentity/TileEntityCommandBlock
      // 1f: ifeq 88
      // 22: goto 29
      // 25: invokestatic p2k.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 9
      // 2b: goto 32
      // 2e: invokestatic p2k.a (Loov;)Loov;
      // 31: athrow
      // 32: checkcast net/minecraft/tileentity/TileEntityCommandBlock
      // 35: invokevirtual net/minecraft/tileentity/TileEntityCommandBlock.n_g ()Lk6s;
      // 38: astore 10
      // 3a: aload 5
      // 3c: invokevirtual erg.x4w ()Z
      // 3f: iload 8
      // 41: ifne 63
      // 44: ifeq 5f
      // 47: goto 4e
      // 4a: invokestatic p2k.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 10
      // 50: aload 5
      // 52: invokevirtual erg.zow ()Ljava/lang/String;
      // 55: invokevirtual k6s.rbf (Ljava/lang/String;)V
      // 58: goto 5f
      // 5b: invokestatic p2k.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 1
      // 60: getfield OpaquePredicate.v0f Z
      // 63: ifne 88
      // 66: aload 10
      // 68: aload 1
      // 69: invokevirtual OpaquePredicate.eir ()Lef9;
      // 6c: sipush 7799
      // 6f: ldc2_w 8836110084466869080
      // 72: lload 6
      // 74: lxor
      // 75: invokedynamic z (IJ)Ljava/lang/String; bsm=p2k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 7e: invokevirtual k6s.mhc (Z)V
      // 81: goto 88
      // 84: invokestatic p2k.a (Loov;)Loov;
      // 87: athrow
      // 88: return
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.b();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i();
         var10001 = gpt;
         int var10002 = var1 & 1;
         if (var2 == 0) {
            return var10000.zvi(gpt, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(gpt, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = OpaquePredicate.b();
      byte var3 = 0;

      try {
         byte var10000 = (Boolean)var1.dil(gpt);
         if (var2 == 0) {
            return var10000;
         }

         if (var10000 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 1;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{gpt});
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      return this.l4i().zvi(gpt, false);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6675536933039440970L, 520299404237870843L, MethodHandles.lookup().lookupClass()).a(271694815436927L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 19278585391475L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "Pfïí¥P¤ì\u009eVø®]J+\u009c.ôIÁÄJØL(Ú¨X\u0086íÚÌÑ\u0002H\u008b\u0003V\u0092é(Ý$8Ã\u009f\u000fë\u001c©`_Øæ\u0007\u0089\u008f\u000eg\u001aa\u0001ø\u0081¿";
      int var6 = "Pfïí¥P¤ì\u009eVø®]J+\u009c.ôIÁÄJØL(Ú¨X\u0086íÚÌÑ\u0002H\u008b\u0003V\u0092é(Ý$8Ã\u009f\u000fë\u001c©`_Øæ\u0007\u0089\u008f\u000eg\u001aa\u0001ø\u0081¿"
         .length();
      char var3 = 24;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[2];
            gpt = h76.d_1(b<"z">(15794, 4855303993487906071L ^ var9));
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4454;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("p2k", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("p2k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
