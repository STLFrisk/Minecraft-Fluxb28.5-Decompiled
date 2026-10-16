package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class S34PacketMaps implements mz2 {
   private static final long a;
   private static final String b;

   public S34PacketMaps() {
   }

   public S34PacketMaps(int var1, byte var2, Collection var3, byte[] var4, int var5, int var6, int var7, int var8) {
      String var10000 = S14PacketEntity.b();
      this.nhp = var1;
      this.qzs = var2;
      this.kjk = var3.toArray(new lib[var3.size()]);
      this.iy6 = var5;
      this.gez = var6;
      this.l04 = var7;
      this.z_f = var8;
      this.jxy = new byte[var7 * var8];
      int var10 = 0;
      String var9 = var10000;

      while (var10 < var7) {
         int var11 = 0;

         while (true) {
            if (var11 < var8) {
               try {
                  this.jxy[var10 + var11 * var7] = var4[var5 + var10 + (var6 + var11) * 128];
                  var11++;
                  if (var9 == null) {
                     break;
                  }

                  if (var9 != null) {
                     continue;
                  }
               } catch (oov var12) {
                  throw a(var12);
               }
            }

            var10++;
            break;
         }

         if (var9 == null) {
            break;
         }
      }
   }

   @Override
   public void ajj(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual nfj.gux ()I
      // 05: putfield net/minecraft/network/play/server/S34PacketMaps.nhp I
      // 08: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0b: aload 0
      // 0c: aload 1
      // 0d: invokevirtual nfj.readByte ()B
      // 10: putfield net/minecraft/network/play/server/S34PacketMaps.qzs B
      // 13: astore 2
      // 14: aload 0
      // 15: aload 1
      // 16: invokevirtual nfj.gux ()I
      // 19: anewarray 40
      // 1c: putfield net/minecraft/network/play/server/S34PacketMaps.kjk [Llib;
      // 1f: bipush 0
      // 20: istore 3
      // 21: iload 3
      // 22: aload 0
      // 23: getfield net/minecraft/network/play/server/S34PacketMaps.kjk [Llib;
      // 26: arraylength
      // 27: if_icmpge 66
      // 2a: aload 1
      // 2b: invokevirtual nfj.readByte ()B
      // 2e: i2s
      // 2f: istore 4
      // 31: aload 0
      // 32: getfield net/minecraft/network/play/server/S34PacketMaps.kjk [Llib;
      // 35: iload 3
      // 36: new lib
      // 39: dup
      // 3a: iload 4
      // 3c: bipush 4
      // 3d: ishr
      // 3e: bipush 15
      // 40: iand
      // 41: i2b
      // 42: aload 1
      // 43: invokevirtual nfj.readByte ()B
      // 46: aload 1
      // 47: invokevirtual nfj.readByte ()B
      // 4a: iload 4
      // 4c: bipush 15
      // 4e: iand
      // 4f: i2b
      // 50: invokespecial lib.<init> (BBBB)V
      // 53: aastore
      // 54: iinc 3 1
      // 57: aload 2
      // 58: ifnull 6e
      // 5b: aload 2
      // 5c: ifnonnull 21
      // 5f: goto 66
      // 62: invokestatic net/minecraft/network/play/server/S34PacketMaps.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: aload 1
      // 68: invokevirtual nfj.readUnsignedByte ()S
      // 6b: putfield net/minecraft/network/play/server/S34PacketMaps.l04 I
      // 6e: aload 0
      // 6f: aload 2
      // 70: ifnull a0
      // 73: getfield net/minecraft/network/play/server/S34PacketMaps.l04 I
      // 76: ifle a7
      // 79: goto 80
      // 7c: invokestatic net/minecraft/network/play/server/S34PacketMaps.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 0
      // 81: aload 1
      // 82: invokevirtual nfj.readUnsignedByte ()S
      // 85: putfield net/minecraft/network/play/server/S34PacketMaps.z_f I
      // 88: aload 0
      // 89: aload 1
      // 8a: invokevirtual nfj.readUnsignedByte ()S
      // 8d: putfield net/minecraft/network/play/server/S34PacketMaps.iy6 I
      // 90: aload 0
      // 91: aload 1
      // 92: invokevirtual nfj.readUnsignedByte ()S
      // 95: putfield net/minecraft/network/play/server/S34PacketMaps.gez I
      // 98: aload 0
      // 99: goto a0
      // 9c: invokestatic net/minecraft/network/play/server/S34PacketMaps.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 1
      // a1: invokevirtual nfj.z7_ ()[B
      // a4: putfield net/minecraft/network/play/server/S34PacketMaps.jxy [B
      // a7: return
   }

   @Override
   public void ddd(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: getfield net/minecraft/network/play/server/S34PacketMaps.nhp I
      // 05: invokevirtual nfj.tao (I)Lnfj;
      // 08: pop
      // 09: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0c: aload 1
      // 0d: aload 0
      // 0e: getfield net/minecraft/network/play/server/S34PacketMaps.qzs B
      // 11: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 14: pop
      // 15: aload 1
      // 16: aload 0
      // 17: getfield net/minecraft/network/play/server/S34PacketMaps.kjk [Llib;
      // 1a: arraylength
      // 1b: invokevirtual nfj.tao (I)Lnfj;
      // 1e: pop
      // 1f: aload 0
      // 20: getfield net/minecraft/network/play/server/S34PacketMaps.kjk [Llib;
      // 23: astore 3
      // 24: aload 3
      // 25: arraylength
      // 26: istore 4
      // 28: astore 2
      // 29: bipush 0
      // 2a: istore 5
      // 2c: iload 5
      // 2e: iload 4
      // 30: if_icmpge 77
      // 33: aload 3
      // 34: iload 5
      // 36: aaload
      // 37: astore 6
      // 39: aload 1
      // 3a: aload 6
      // 3c: invokevirtual lib.c0r ()B
      // 3f: bipush 15
      // 41: iand
      // 42: bipush 4
      // 43: ishl
      // 44: aload 6
      // 46: invokevirtual lib.txm ()B
      // 49: bipush 15
      // 4b: iand
      // 4c: ior
      // 4d: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 50: pop
      // 51: aload 1
      // 52: aload 6
      // 54: invokevirtual lib.fr4 ()B
      // 57: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 5a: pop
      // 5b: aload 1
      // 5c: aload 6
      // 5e: invokevirtual lib.rxw ()B
      // 61: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 64: pop
      // 65: iinc 5 1
      // 68: aload 2
      // 69: ifnull 80
      // 6c: aload 2
      // 6d: ifnonnull 2c
      // 70: goto 77
      // 73: invokestatic net/minecraft/network/play/server/S34PacketMaps.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 1
      // 78: aload 0
      // 79: getfield net/minecraft/network/play/server/S34PacketMaps.l04 I
      // 7c: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 7f: pop
      // 80: aload 2
      // 81: ifnull b4
      // 84: aload 0
      // 85: getfield net/minecraft/network/play/server/S34PacketMaps.l04 I
      // 88: ifle bd
      // 8b: goto 92
      // 8e: invokestatic net/minecraft/network/play/server/S34PacketMaps.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 1
      // 93: aload 0
      // 94: getfield net/minecraft/network/play/server/S34PacketMaps.z_f I
      // 97: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 9a: pop
      // 9b: aload 1
      // 9c: aload 0
      // 9d: getfield net/minecraft/network/play/server/S34PacketMaps.iy6 I
      // a0: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // a3: pop
      // a4: aload 1
      // a5: aload 0
      // a6: getfield net/minecraft/network/play/server/S34PacketMaps.gez I
      // a9: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // ac: pop
      // ad: goto b4
      // b0: invokestatic net/minecraft/network/play/server/S34PacketMaps.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 1
      // b5: aload 0
      // b6: getfield net/minecraft/network/play/server/S34PacketMaps.jxy [B
      // b9: invokevirtual nfj.a4q ([B)Lnfj;
      // bc: pop
      // bd: return
   }

   public void u5w(jsv var1) {
      var1.msb(this);
   }

   public int bki() {
      return this.nhp;
   }

   public void uou(ucr var1) {
      long var2 = a ^ 52937693659571L;
      var1.rqi = this.qzs;
      var1.xoj.clear();
      String var10000 = S14PacketEntity.b();
      int var5 = 0;
      String var4 = var10000;

      while (true) {
         if (var5 < this.kjk.length) {
            lib var6 = this.kjk[var5];

            try {
               var1.xoj.put(b + var5, var6);
               var5++;
               if (var4 == null) {
                  break;
               }

               if (var4 != null) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         var5 = 0;
         break;
      }

      while (var5 < this.l04) {
         int var9 = 0;

         while (true) {
            if (var9 < this.z_f) {
               try {
                  var1.quz[this.iy6 + var5 + (this.gez + var9) * 128] = this.jxy[var5 + var9 * this.l04];
                  var9++;
                  if (var4 == null) {
                     break;
                  }

                  if (var4 != null) {
                     continue;
                  }
               } catch (oov var7) {
                  throw a(var7);
               }
            }

            var5++;
            break;
         }

         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public void ito(yw3 var1) {
      this.u5w((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7240020732315500277L, -1543342943556417817L, MethodHandles.lookup().lookupClass()).a(48427277251072L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 76363296770830L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ý\u001e·W4mýÀ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
