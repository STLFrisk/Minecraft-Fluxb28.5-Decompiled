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
import net.minecraft.tileentity.TileEntityBrewingStand;

public class all extends rw8 {
   public static final h76[] yky;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public all() {
      super(p3y.e21);
      this.y8l(this._8_.c32().zvi(yky[0], false).zvi(yky[1], false).zvi(yky[2], false));
   }

   @Override
   public String ieu() {
      long var1 = b ^ 109626421133668L;
      return orr.zgh(b<"c">(21766, 3647319936032216119L ^ var1));
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public int kfj() {
      return 3;
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntityBrewingStand();
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public void c76(OpaquePredicate var1, mew var2, zfz var3, nh4 var4, List var5, EntityLivingBase var6) {
      this.xl4(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.bf6();
      super.c76(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void bf6() {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 9
      // 05: aload 1
      // 06: iload 9
      // 08: ifeq 1f
      // 0b: getfield OpaquePredicate.v0f Z
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic all.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic all.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 23: astore 10
      // 25: aload 10
      // 27: instanceof net/minecraft/tileentity/TileEntityBrewingStand
      // 2a: iload 9
      // 2c: ifeq 53
      // 2f: ifeq 52
      // 32: goto 39
      // 35: invokestatic all.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 4
      // 3b: aload 10
      // 3d: checkcast net/minecraft/tileentity/TileEntityBrewingStand
      // 40: invokevirtual ha9.a_o (Lrsi;)V
      // 43: aload 4
      // 45: getstatic l9p.af6 L_ss;
      // 48: invokevirtual ha9.aex (L_ss;)V
      // 4b: goto 52
      // 4e: invokestatic all.a (Loov;)Loov;
      // 51: athrow
      // 52: bipush 1
      // 53: ireturn
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 5
      // 07: invokevirtual erg.x4w ()Z
      // 0a: ifeq 3c
      // 0d: aload 1
      // 0e: aload 2
      // 0f: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 12: astore 7
      // 14: aload 7
      // 16: iload 6
      // 18: ifne 31
      // 1b: instanceof net/minecraft/tileentity/TileEntityBrewingStand
      // 1e: ifeq 3c
      // 21: goto 28
      // 24: invokestatic all.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 7
      // 2a: goto 31
      // 2d: invokestatic all.a (Loov;)Loov;
      // 30: athrow
      // 31: checkcast net/minecraft/tileentity/TileEntityBrewingStand
      // 34: aload 5
      // 36: invokevirtual erg.zow ()Ljava/lang/String;
      // 39: invokevirtual net/minecraft/tileentity/TileEntityBrewingStand.f9y (Ljava/lang/String;)V
      // 3c: return
   }

   @Override
   public void kyo(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
      double var5 = (double)((float)var2.getX() + 0.4F + var4.nextFloat() * 0.2F);
      double var7 = (double)((float)var2.getY() + 0.7F + var4.nextFloat() * 0.3F);
      double var9 = (double)((float)var2.getZ() + 0.4F + var4.nextFloat() * 0.2F);
      var1.zvy(w_0.bac, var5, var7, var9, 0.0, 0.0, 0.0, new int[0]);
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 0a: astore 5
      // 0c: iload 4
      // 0e: ifne 38
      // 11: aload 5
      // 13: instanceof net/minecraft/tileentity/TileEntityBrewingStand
      // 16: ifeq 31
      // 19: goto 20
      // 1c: invokestatic all.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: aload 5
      // 24: checkcast net/minecraft/tileentity/TileEntityBrewingStand
      // 27: invokestatic py1.hkj (Lt9d;Lmew;Lrsi;)V
      // 2a: goto 31
      // 2d: invokestatic all.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: aload 2
      // 34: aload 3
      // 35: invokespecial rw8.b8f (Lt9d;Lmew;Lzfz;)V
      // 38: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.os1;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.os1;
   }

   @Override
   public boolean ge5() {
      return true;
   }

   @Override
   public int mya(OpaquePredicate var1, mew var2) {
      return _jc.nuj(var1.getTileEntity(var2));
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual all.l4i ()Lzfz;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: bipush 0
      // 09: istore 4
      // 0b: istore 2
      // 0c: iload 4
      // 0e: bipush 3
      // 0f: if_icmpge 4d
      // 12: aload 3
      // 13: iload 2
      // 14: ifeq 4e
      // 17: getstatic all.yky [Lh76;
      // 1a: iload 4
      // 1c: aaload
      // 1d: iload 1
      // 1e: bipush 1
      // 1f: iload 4
      // 21: ishl
      // 22: iand
      // 23: iload 2
      // 24: ifeq 39
      // 27: goto 2e
      // 2a: invokestatic all.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifle 3c
      // 31: goto 38
      // 34: invokestatic all.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 40: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 45: astore 3
      // 46: iinc 4 1
      // 49: iload 2
      // 4a: ifne 0c
      // 4d: aload 3
      // 4e: areturn
   }

   @Override
   public int hvp(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic OpaquePredicate.c ()I
      // 05: bipush 0
      // 06: istore 4
      // 08: istore 2
      // 09: iload 4
      // 0b: bipush 3
      // 0c: if_icmpge 4f
      // 0f: aload 1
      // 10: getstatic all.yky [Lh76;
      // 13: iload 4
      // 15: aaload
      // 16: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1b: checkcast java/lang/Boolean
      // 1e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 21: iload 2
      // 22: ifne 50
      // 25: iload 2
      // 26: ifne 47
      // 29: goto 30
      // 2c: invokestatic all.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifeq 48
      // 33: goto 3a
      // 36: invokestatic all.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 3
      // 3b: bipush 1
      // 3c: iload 4
      // 3e: ishl
      // 3f: ior
      // 40: goto 47
      // 43: invokestatic all.a (Loov;)Loov;
      // 46: athrow
      // 47: istore 3
      // 48: iinc 4 1
      // 4b: iload 2
      // 4c: ifeq 09
      // 4f: iload 3
      // 50: ireturn
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{yky[0], yky[1], yky[2]});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7542382000566126647L, -6545787873015924383L, MethodHandles.lookup().lookupClass()).a(260837412825816L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 132910836473395L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "M2\\\u000fFUt\u001d®Ñ/ÍÏ3\u0081h-ä\u00884\u0099R7\u001e(à\u001ek9\u0098{;\u0080¯]_åµ}aà\u000f¤ÙÙÍ`²mØÕbò\u0081\u001cÊ[A\u001c\u0094\u0089,°\u001f\u0086";
      int var6 = "M2\\\u000fFUt\u001d®Ñ/ÍÏ3\u0081h-ä\u00884\u0099R7\u001e(à\u001ek9\u0098{;\u0080¯]_åµ}aà\u000f¤ÙÙÍ`²mØÕbò\u0081\u001cÊ[A\u001c\u0094\u0089,°\u001f\u0086"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[4];
                     yky = new h76[]{
                        h76.d_1(b<"c">(3607, 138665535692263538L ^ var9)),
                        h76.d_1(b<"c">(23675, 3097737775006679580L ^ var9)),
                        h76.d_1(b<"c">(19428, 1646612010382529920L ^ var9))
                     };
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "§Ñ\u0085û\u009dÒ'vqâ\u008eÎ2ÿ\"\u0004\u0007¥ãÃ\f\u0083iÁ\u0018 uoPeM-ç¸\u001f\u0015Ðø\u0017H]Ñ\u001a\"Ê\u0083Í\u0097\u000e";
                  var6 = "§Ñ\u0085û\u009dÒ'vqâ\u008eÎ2ÿ\"\u0004\u0007¥ãÃ\f\u0083iÁ\u0018 uoPeM-ç¸\u001f\u0015Ðø\u0017H]Ñ\u001a\"Ê\u0083Í\u0097\u000e".length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31319;
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
            throw new RuntimeException("all", var10);
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
         throw new RuntimeException("all" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
