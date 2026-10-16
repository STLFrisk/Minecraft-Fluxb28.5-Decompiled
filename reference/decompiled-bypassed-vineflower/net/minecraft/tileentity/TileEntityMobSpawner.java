package net.minecraft.tileentity;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileEntityMobSpawner extends pyk implements xcy {
   private final aih tsm = new TileEntityMobSpawner$1(this);
   private static final long a;
   private static final String b;

   @Override
   public void agl(bdo var1) {
      super.agl(var1);
      this.tsm.n8j(var1);
   }

   @Override
   public void m2a(bdo var1) {
      super.m2a(var1);
      this.tsm.ymq(var1);
   }

   @Override
   public void _21() {
      this.tsm.laq();
   }

   @Override
   public mz2 ptb() {
      long var1 = a ^ 92609456251006L;
      bdo var3 = new bdo();
      this.m2a(var3);
      var3.bkn(b);
      return new S35PacketUpdateTileEntity(this.al2, 1, var3);
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
      // 04: aload 0
      // 05: aload 3
      // 06: ifnonnull 23
      // 09: getfield net/minecraft/tileentity/TileEntityMobSpawner.tsm Laih;
      // 0c: iload 1
      // 0d: invokevirtual aih.h99 (I)Z
      // 10: ifeq 22
      // 13: goto 1a
      // 16: invokestatic net/minecraft/tileentity/TileEntityMobSpawner.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 28
      // 1e: invokestatic net/minecraft/tileentity/TileEntityMobSpawner.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: iload 1
      // 24: iload 2
      // 25: invokespecial pyk.hjo (II)Z
      // 28: ireturn
   }

   @Override
   public boolean v3u() {
      return true;
   }

   public aih ebe() {
      return this.tsm;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4762091284157493825L, -962100586654844554L, MethodHandles.lookup().lookupClass()).a(6529172160914L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 138170969899970L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("°ýÐ\u0013~\u0087Í¬\u0083ô\u001a'ÃûXj".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      b = var6;
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
