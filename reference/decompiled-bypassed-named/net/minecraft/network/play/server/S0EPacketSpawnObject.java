package net.minecraft.network.play.server;

public class S0EPacketSpawnObject implements mz2 {
   public S0EPacketSpawnObject() {
   }

   public S0EPacketSpawnObject(EntityLivingBase var1, int var2) {
      this(var1, var2, 0);
   }

   public S0EPacketSpawnObject(EntityLivingBase var1, int var2, int var3) {
      String var10000 = S14PacketEntity.b();
      this.a3k = var1.jwu();
      String var4 = var10000;
      this.aj1 = fe6.jqf(var1.o2v * 32.0);
      this.vg0 = fe6.jqf(var1.kfp * 32.0);
      this.o4p = fe6.jqf(var1.vbd * 32.0);
      this.md1 = fe6.tpk(var1.y2i * 256.0F / 360.0F);
      this.vi3 = fe6.tpk(var1.x5k * 256.0F / 360.0F);
      this.ge8 = var2;
      this.nwv = var3;
      if (var3 > 0) {
         double var5 = var1.icv;
         double var7 = var1.mop;
         double var9 = var1.bw4;
         double var11 = 3.9;

         label103: {
            label102: {
               try {
                  double var21;
                  var19 = (var21 = var5 - -var11) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
                  if (var4 == null) {
                     break label103;
                  }

                  if (var19 >= 0) {
                     break label102;
                  }
               } catch (oov var18) {
                  throw a(var18);
               }

               var5 = -var11;
            }

            double var22;
            var19 = (var22 = var7 - -var11) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
         }

         label94: {
            label93: {
               try {
                  if (var4 == null) {
                     break label94;
                  }

                  if (var19 >= 0) {
                     break label93;
                  }
               } catch (oov var17) {
                  throw a(var17);
               }

               var7 = -var11;
            }

            double var23;
            var19 = (var23 = var9 - -var11) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
         }

         label85: {
            label84: {
               try {
                  if (var4 == null) {
                     break label85;
                  }

                  if (var19 >= 0) {
                     break label84;
                  }
               } catch (oov var16) {
                  throw a(var16);
               }

               var9 = -var11;
            }

            double var24;
            var19 = (var24 = var5 - var11) == 0.0 ? 0 : (var24 < 0.0 ? -1 : 1);
         }

         label76: {
            label75: {
               try {
                  if (var4 == null) {
                     break label76;
                  }

                  if (var19 <= 0) {
                     break label75;
                  }
               } catch (oov var15) {
                  throw a(var15);
               }

               var5 = var11;
            }

            double var25;
            var19 = (var25 = var7 - var11) == 0.0 ? 0 : (var25 < 0.0 ? -1 : 1);
         }

         label67: {
            label109: {
               label65: {
                  label64: {
                     try {
                        if (var4 == null) {
                           break label65;
                        }

                        if (var19 <= 0) {
                           break label64;
                        }
                     } catch (oov var14) {
                        throw a(var14);
                     }

                     var7 = var11;
                  }

                  try {
                     var20 = var9;
                     if (var4 == null) {
                        break label109;
                     }

                     double var26;
                     var19 = (var26 = var9 - var11) == 0.0 ? 0 : (var26 < 0.0 ? -1 : 1);
                  } catch (oov var13) {
                     throw a(var13);
                  }
               }

               if (var19 <= 0) {
                  break label67;
               }

               var20 = var11;
            }

            var9 = var20;
         }

         this.cl0 = (int)(var5 * 8000.0);
         this.jcx = (int)(var7 * 8000.0);
         this.ttx = (int)(var9 * 8000.0);
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
      // 05: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.a3k I
      // 08: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0b: aload 0
      // 0c: aload 1
      // 0d: invokevirtual nfj.readByte ()B
      // 10: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.ge8 I
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual nfj.readInt ()I
      // 18: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.aj1 I
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual nfj.readInt ()I
      // 20: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.vg0 I
      // 23: aload 0
      // 24: aload 1
      // 25: invokevirtual nfj.readInt ()I
      // 28: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.o4p I
      // 2b: aload 0
      // 2c: aload 1
      // 2d: invokevirtual nfj.readByte ()B
      // 30: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.md1 I
      // 33: astore 2
      // 34: aload 0
      // 35: aload 1
      // 36: invokevirtual nfj.readByte ()B
      // 39: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.vi3 I
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokevirtual nfj.readInt ()I
      // 41: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.nwv I
      // 44: aload 0
      // 45: aload 2
      // 46: ifnull 6e
      // 49: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.nwv I
      // 4c: ifle 75
      // 4f: goto 56
      // 52: invokestatic net/minecraft/network/play/server/S0EPacketSpawnObject.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: aload 1
      // 58: invokevirtual nfj.readShort ()S
      // 5b: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.cl0 I
      // 5e: aload 0
      // 5f: aload 1
      // 60: invokevirtual nfj.readShort ()S
      // 63: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.jcx I
      // 66: aload 0
      // 67: goto 6e
      // 6a: invokestatic net/minecraft/network/play/server/S0EPacketSpawnObject.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 1
      // 6f: invokevirtual nfj.readShort ()S
      // 72: putfield net/minecraft/network/play/server/S0EPacketSpawnObject.ttx I
      // 75: return
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
      // 02: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.a3k I
      // 05: invokevirtual nfj.tao (I)Lnfj;
      // 08: pop
      // 09: aload 1
      // 0a: aload 0
      // 0b: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.ge8 I
      // 0e: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 11: pop
      // 12: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 15: aload 1
      // 16: aload 0
      // 17: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.aj1 I
      // 1a: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 1d: pop
      // 1e: aload 1
      // 1f: aload 0
      // 20: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.vg0 I
      // 23: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 26: pop
      // 27: aload 1
      // 28: aload 0
      // 29: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.o4p I
      // 2c: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 2f: pop
      // 30: aload 1
      // 31: aload 0
      // 32: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.md1 I
      // 35: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 38: pop
      // 39: aload 1
      // 3a: aload 0
      // 3b: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.vi3 I
      // 3e: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 41: pop
      // 42: astore 2
      // 43: aload 1
      // 44: aload 0
      // 45: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.nwv I
      // 48: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 4b: pop
      // 4c: aload 2
      // 4d: ifnull 77
      // 50: aload 0
      // 51: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.nwv I
      // 54: ifle 80
      // 57: goto 5e
      // 5a: invokestatic net/minecraft/network/play/server/S0EPacketSpawnObject.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 1
      // 5f: aload 0
      // 60: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.cl0 I
      // 63: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 66: pop
      // 67: aload 1
      // 68: aload 0
      // 69: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.jcx I
      // 6c: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 6f: pop
      // 70: goto 77
      // 73: invokestatic net/minecraft/network/play/server/S0EPacketSpawnObject.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 1
      // 78: aload 0
      // 79: getfield net/minecraft/network/play/server/S0EPacketSpawnObject.ttx I
      // 7c: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 7f: pop
      // 80: return
   }

   public void t2c(jsv var1) {
      var1.tif(this);
   }

   public int a1o() {
      return this.a3k;
   }

   public int n2n() {
      return this.aj1;
   }

   public int gqw() {
      return this.vg0;
   }

   public int z7b() {
      return this.o4p;
   }

   public int k8l() {
      return this.cl0;
   }

   public int s13() {
      return this.jcx;
   }

   public int k4u() {
      return this.ttx;
   }

   public int m3g() {
      return this.md1;
   }

   public int ft_() {
      return this.vi3;
   }

   public int tg4() {
      return this.ge8;
   }

   public int ugk() {
      return this.nwv;
   }

   public void lw4(int var1) {
      this.aj1 = var1;
   }

   public void ofp(int var1) {
      this.vg0 = var1;
   }

   public void k5r(int var1) {
      this.o4p = var1;
   }

   public void bbp(int var1) {
      this.cl0 = var1;
   }

   public void gex(int var1) {
      this.jcx = var1;
   }

   public void blh(int var1) {
      this.ttx = var1;
   }

   public void a4t(int var1) {
      this.nwv = var1;
   }

   @Override
   public void ito(yw3 var1) {
      this.t2c((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
