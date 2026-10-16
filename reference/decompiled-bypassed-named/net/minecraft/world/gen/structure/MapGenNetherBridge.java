package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MapGenNetherBridge extends fln {
   private List kg5 = Lists.newArrayList();
   private static final long b;
   private static final String f;

   public MapGenNetherBridge() {
      this.kg5.add(new gyu$dwn(j91.class, 10, 2, 3));
      this.kg5.add(new gyu$dwn(v9i.class, 5, 4, 4));
      this.kg5.add(new gyu$dwn(jzg.class, 10, 4, 4));
      this.kg5.add(new gyu$dwn(b41.class, 3, 4, 4));
   }

   @Override
   public String tqd() {
      long var1 = b ^ 126037034992978L;
      return f;
   }

   public List u7j() {
      return this.kg5;
   }

   @Override
   public boolean ary(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: bipush 4
      // 02: ishr
      // 03: istore 4
      // 05: iload 2
      // 06: bipush 4
      // 07: ishr
      // 08: istore 5
      // 0a: invokestatic net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold.b ()[Li2h;
      // 0d: aload 0
      // 0e: getfield net/minecraft/world/gen/structure/MapGenNetherBridge.a0f Ljava/util/Random;
      // 11: iload 4
      // 13: iload 5
      // 15: bipush 4
      // 16: ishl
      // 17: ixor
      // 18: i2l
      // 19: aload 0
      // 1a: getfield net/minecraft/world/gen/structure/MapGenNetherBridge.pr9 Lt9d;
      // 1d: invokevirtual OpaquePredicate.x2p ()J
      // 20: lxor
      // 21: invokevirtual java/util/Random.setSeed (J)V
      // 24: aload 0
      // 25: getfield net/minecraft/world/gen/structure/MapGenNetherBridge.a0f Ljava/util/Random;
      // 28: invokevirtual java/util/Random.nextInt ()I
      // 2b: pop
      // 2c: astore 3
      // 2d: aload 0
      // 2e: getfield net/minecraft/world/gen/structure/MapGenNetherBridge.a0f Ljava/util/Random;
      // 31: bipush 3
      // 32: invokevirtual java/util/Random.nextInt (I)I
      // 35: aload 3
      // 36: ifnull 4c
      // 39: ifeq 4b
      // 3c: goto 43
      // 3f: invokestatic net/minecraft/world/gen/structure/MapGenNetherBridge.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 0
      // 44: goto 96
      // 47: invokestatic net/minecraft/world/gen/structure/MapGenNetherBridge.a (Loov;)Loov;
      // 4a: athrow
      // 4b: iload 1
      // 4c: iload 4
      // 4e: bipush 4
      // 4f: ishl
      // 50: bipush 4
      // 51: iadd
      // 52: aload 0
      // 53: getfield net/minecraft/world/gen/structure/MapGenNetherBridge.a0f Ljava/util/Random;
      // 56: bipush 8
      // 58: invokevirtual java/util/Random.nextInt (I)I
      // 5b: iadd
      // 5c: aload 3
      // 5d: ifnull 8e
      // 60: if_icmpeq 72
      // 63: goto 6a
      // 66: invokestatic net/minecraft/world/gen/structure/MapGenNetherBridge.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 0
      // 6b: goto 96
      // 6e: invokestatic net/minecraft/world/gen/structure/MapGenNetherBridge.a (Loov;)Loov;
      // 71: athrow
      // 72: iload 2
      // 73: aload 3
      // 74: ifnull 92
      // 77: iload 5
      // 79: bipush 4
      // 7a: ishl
      // 7b: bipush 4
      // 7c: iadd
      // 7d: aload 0
      // 7e: getfield net/minecraft/world/gen/structure/MapGenNetherBridge.a0f Ljava/util/Random;
      // 81: bipush 8
      // 83: invokevirtual java/util/Random.nextInt (I)I
      // 86: iadd
      // 87: goto 8e
      // 8a: invokestatic net/minecraft/world/gen/structure/MapGenNetherBridge.a (Loov;)Loov;
      // 8d: athrow
      // 8e: if_icmpne 95
      // 91: bipush 1
      // 92: goto 96
      // 95: bipush 0
      // 96: ireturn
   }

   @Override
   public ijb sph(int var1, int var2) {
      return new MapGenNetherBridge$Start(this.pr9, this.a0f, var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2026873293430455745L, 4309260925868583424L, MethodHandles.lookup().lookupClass()).a(133386280685629L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 96364775078043L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("üè\u001eh\\Ü°Í¿åO¾4ñ4ê".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
