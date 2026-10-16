package net.minecraft.network.play.server;

import java.util.List;

public class S0FPacketSpawnMob implements mz2 {
   private int e5u;
   private int c38;
   private int r4g;
   private int pxn;
   private int nyh;
   private int k8u;
   private int rq9;
   private int yuy;
   private byte ws8;
   private byte rtr;
   private byte ena;
   private wl1 w_d;
   private List c7z;

   public S0FPacketSpawnMob() {
   }

   public S0FPacketSpawnMob(Entity var1) {
      this.e5u = var1.jwu();
      this.c38 = (byte)y65.duj(var1);
      this.r4g = fe6.jqf(var1.o2v * 32.0);
      this.pxn = fe6.jqf(var1.kfp * 32.0);
      String var10000 = S14PacketEntity.b();
      this.nyh = fe6.jqf(var1.vbd * 32.0);
      this.ws8 = (byte)((int)(var1.x5k * 256.0F / 360.0F));
      this.rtr = (byte)((int)(var1.y2i * 256.0F / 360.0F));
      this.ena = (byte)((int)(var1.q6c * 256.0F / 360.0F));
      String var2 = var10000;
      double var3 = 3.9;
      double var5 = var1.icv;
      double var7 = var1.mop;
      double var9 = var1.bw4;

      label109: {
         label108: {
            try {
               double var20;
               var18 = (var20 = var5 - -var3) == 0.0 ? 0 : (var20 < 0.0 ? -1 : 1);
               if (var2 == null) {
                  break label109;
               }

               if (var18 >= 0) {
                  break label108;
               }
            } catch (oov var17) {
               throw a(var17);
            }

            var5 = -var3;
         }

         double var21;
         var18 = (var21 = var7 - -var3) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
      }

      label100: {
         label99: {
            try {
               if (var2 == null) {
                  break label100;
               }

               if (var18 >= 0) {
                  break label99;
               }
            } catch (oov var16) {
               throw a(var16);
            }

            var7 = -var3;
         }

         double var22;
         var18 = (var22 = var9 - -var3) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
      }

      label91: {
         label90: {
            try {
               if (var2 == null) {
                  break label91;
               }

               if (var18 >= 0) {
                  break label90;
               }
            } catch (oov var15) {
               throw a(var15);
            }

            var9 = -var3;
         }

         double var23;
         var18 = (var23 = var5 - var3) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
      }

      label82: {
         label81: {
            try {
               if (var2 == null) {
                  break label82;
               }

               if (var18 <= 0) {
                  break label81;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            var5 = var3;
         }

         double var24;
         var18 = (var24 = var7 - var3) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
      }

      label73: {
         label113: {
            label71: {
               label70: {
                  try {
                     if (var2 == null) {
                        break label71;
                     }

                     if (var18 <= 0) {
                        break label70;
                     }
                  } catch (oov var13) {
                     throw a(var13);
                  }

                  var7 = var3;
               }

               try {
                  var19 = var9;
                  if (var2 == null) {
                     break label113;
                  }

                  double var25;
                  var18 = (var25 = var9 - var3) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
               } catch (oov var12) {
                  throw a(var12);
               }
            }

            if (var18 <= 0) {
               break label73;
            }

            var19 = var3;
         }

         var9 = var19;
      }

      try {
         this.k8u = (int)(var5 * 8000.0);
         this.rq9 = (int)(var7 * 8000.0);
         this.yuy = (int)(var9 * 8000.0);
         this.w_d = var1.a0c();
         if (var2 == null) {
            EntityLivingBase.b(new EntityLivingBase[2]);
         }
      } catch (oov var11) {
         throw a(var11);
      }
   }

   @Override
   public void ajj(nfj var1) {
      this.e5u = var1.gux();
      this.c38 = var1.readByte() & 255;
      this.r4g = var1.readInt();
      this.pxn = var1.readInt();
      this.nyh = var1.readInt();
      this.ws8 = var1.readByte();
      this.rtr = var1.readByte();
      this.ena = var1.readByte();
      this.k8u = var1.readShort();
      this.rq9 = var1.readShort();
      this.yuy = var1.readShort();
      this.c7z = wl1.glq(var1);
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.e5u);
      var1.writeByte(this.c38 & 0xFF);
      var1.writeInt(this.r4g);
      var1.writeInt(this.pxn);
      var1.writeInt(this.nyh);
      var1.writeByte(this.ws8);
      var1.writeByte(this.rtr);
      var1.writeByte(this.ena);
      var1.writeShort(this.k8u);
      var1.writeShort(this.rq9);
      var1.writeShort(this.yuy);
      this.w_d.i3t(var1);
   }

   public void g4t(jsv var1) {
      var1.xts(this);
   }

   public List gd4() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield net/minecraft/network/play/server/S0FPacketSpawnMob.c7z Ljava/util/List;
      // 08: aload 1
      // 09: ifnull 2c
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic net/minecraft/network/play/server/S0FPacketSpawnMob.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield net/minecraft/network/play/server/S0FPacketSpawnMob.w_d Lwl1;
      // 1b: invokevirtual wl1.bc2 ()Ljava/util/List;
      // 1e: putfield net/minecraft/network/play/server/S0FPacketSpawnMob.c7z Ljava/util/List;
      // 21: goto 28
      // 24: invokestatic net/minecraft/network/play/server/S0FPacketSpawnMob.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/network/play/server/S0FPacketSpawnMob.c7z Ljava/util/List;
      // 2c: areturn
   }

   public int pkf() {
      return this.e5u;
   }

   public int tpt() {
      return this.c38;
   }

   public int als() {
      return this.r4g;
   }

   public int vlp() {
      return this.pxn;
   }

   public int s_z() {
      return this.nyh;
   }

   public int m6c() {
      return this.k8u;
   }

   public int opk() {
      return this.rq9;
   }

   public int po_() {
      return this.yuy;
   }

   public byte arc() {
      return this.ws8;
   }

   public byte xhx() {
      return this.rtr;
   }

   public byte s9d() {
      return this.ena;
   }

   @Override
   public void ito(yw3 var1) {
      this.g4t((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
