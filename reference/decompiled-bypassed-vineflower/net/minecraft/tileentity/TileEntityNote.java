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

public class TileEntityNote extends pyk {
   public byte i1n;
   public boolean evi;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 69972684303573L;
      super.m2a(var1);
      var1.atr(b<"q">(8632, 4045861928320578633L ^ var2), this.i1n);
   }

   @Override
   public void agl(bdo var1) {
      long var2 = a ^ 79291693434889L;
      super.agl(var1);
      this.i1n = var1.r_t(b<"q">(5816, 7710372758986221460L ^ var2));
      this.i1n = (byte)fe6.faa(this.i1n, 0, 24);
   }

   public void xzp() {
      this.i1n = (byte)((this.i1n + 1) % 25);
      this.r5t();
   }

   public void gcb(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual mew.nuv ()Lmew;
      // 09: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: invokevirtual e0x.p1r ()Lp3y;
      // 14: aload 3
      // 15: ifnonnull 3c
      // 18: getstatic p3y.cei Lp3y;
      // 1b: if_acmpne 9c
      // 1e: goto 25
      // 21: invokestatic net/minecraft/tileentity/TileEntityNote.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: invokevirtual mew.eve ()Lmew;
      // 2a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2d: invokeinterface zfz.r_y ()Le0x; 1
      // 32: invokevirtual e0x.p1r ()Lp3y;
      // 35: goto 3c
      // 38: invokestatic net/minecraft/tileentity/TileEntityNote.a (Loov;)Loov;
      // 3b: athrow
      // 3c: astore 4
      // 3e: bipush 0
      // 3f: istore 5
      // 41: aload 4
      // 43: getstatic p3y.zs8 Lp3y;
      // 46: aload 3
      // 47: ifnonnull 5c
      // 4a: if_acmpne 57
      // 4d: goto 54
      // 50: invokestatic net/minecraft/tileentity/TileEntityNote.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 1
      // 55: istore 5
      // 57: aload 4
      // 59: getstatic p3y.y_4 Lp3y;
      // 5c: aload 3
      // 5d: ifnonnull 72
      // 60: if_acmpne 6d
      // 63: goto 6a
      // 66: invokestatic net/minecraft/tileentity/TileEntityNote.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 2
      // 6b: istore 5
      // 6d: aload 4
      // 6f: getstatic p3y.mg6 Lp3y;
      // 72: aload 3
      // 73: ifnonnull 88
      // 76: if_acmpne 83
      // 79: goto 80
      // 7c: invokestatic net/minecraft/tileentity/TileEntityNote.a (Loov;)Loov;
      // 7f: athrow
      // 80: bipush 3
      // 81: istore 5
      // 83: aload 4
      // 85: getstatic p3y.fdu Lp3y;
      // 88: if_acmpne 8e
      // 8b: bipush 4
      // 8c: istore 5
      // 8e: aload 1
      // 8f: aload 2
      // 90: getstatic ox_.syu Le0x;
      // 93: iload 5
      // 95: aload 0
      // 96: getfield net/minecraft/tileentity/TileEntityNote.i1n B
      // 99: invokevirtual t9d.dfj (Lmew;Le0x;II)V
      // 9c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7121311843557563702L, -5918798777150628395L, MethodHandles.lookup().lookupClass()).a(152564532774198L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 107033262272935L;
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
      String var6 = "\u0098\tÄR¨ðù\u0086#\u0080jdÐ¿\u001eG\u001036Ò(\u0018d\u0019S(-¬j\u00ad¾º\u0091";
      int var8 = "\u0098\tÄR¨ðù\u0086#\u0080jdÐ¿\u001eG\u001036Ò(\u0018d\u0019S(-¬j\u00ad¾º\u0091".length();
      char var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1027;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityNote", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityNote" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
