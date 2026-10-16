package net.minecraft.network.play.server;

import java.util.List;

public class S26PacketMapChunkBulk implements mz2 {
   private int[] t2o;
   private int[] ymm;
   private S21PacketChunkData$qjp[] m0w;
   private boolean c8k;

   public S26PacketMapChunkBulk() {
   }

   public S26PacketMapChunkBulk(List var1) {
      int var3 = var1.size();
      this.t2o = new int[var3];
      this.ymm = new int[var3];
      String var10000 = S14PacketEntity.b();
      this.m0w = new S21PacketChunkData$qjp[var3];
      String var2 = var10000;

      boolean var10001;
      label32: {
         label31: {
            try {
               var8 = this;
               var10001 = ((tts)var1.get(0)).v8m().vzz.qyc();
               if (var2 == null) {
                  break label32;
               }

               if (!var10001) {
                  break label31;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var10001 = false;
            break label32;
         }

         var10001 = true;
      }

      var8.c8k = var10001;
      int var4 = 0;

      while (var4 < var3) {
         tts var5 = (tts)var1.get(var4);
         S21PacketChunkData$qjp var6 = S21PacketChunkData.d_9(var5, true, this.c8k, 65535);
         this.t2o[var4] = var5.nzx;
         this.ymm[var4] = var5.yxl;
         this.m0w[var4] = var6;
         var4++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void ajj(nfj var1) {
      this.c8k = var1.readBoolean();
      String var10000 = S14PacketEntity.b();
      int var3 = var1.gux();
      this.t2o = new int[var3];
      this.ymm = new int[var3];
      String var2 = var10000;
      this.m0w = new S21PacketChunkData$qjp[var3];
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            try {
               this.t2o[var4] = var1.readInt();
               this.ymm[var4] = var1.readInt();
               this.m0w[var4] = new S21PacketChunkData$qjp();
               this.m0w[var4].kvj = var1.readShort() & '\uffff';
               this.m0w[var4].rww = new byte[S21PacketChunkData.m6n(Integer.bitCount(this.m0w[var4].kvj), this.c8k, true)];
               var4++;
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         var4 = 0;
         break;
      }

      try {
         while (var4 < var3) {
            var1.readBytes(this.m0w[var4].rww);
            var4++;
            if (var2 == null) {
               break;
            }
         }
      } catch (oov var5) {
         throw a(var5);
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeBoolean(this.c8k);
      String var10000 = S14PacketEntity.b();
      var1.tao(this.m0w.length);
      String var2 = var10000;
      int var3 = 0;

      while (true) {
         if (var3 < this.t2o.length) {
            try {
               var1.writeInt(this.t2o[var3]);
               var1.writeInt(this.ymm[var3]);
               var1.writeShort((short)(this.m0w[var3].kvj & 65535));
               var3++;
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         var3 = 0;
         break;
      }

      try {
         while (var3 < this.t2o.length) {
            var1.writeBytes(this.m0w[var3].rww);
            var3++;
            if (var2 == null) {
               break;
            }
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public void btp(jsv var1) {
      var1.k0h(this);
   }

   public int lu7(int var1) {
      return this.t2o[var1];
   }

   public int _d7(int var1) {
      return this.ymm[var1];
   }

   public int rpa() {
      return this.t2o.length;
   }

   public byte[] s15(int var1) {
      return this.m0w[var1].rww;
   }

   public int jwi(int var1) {
      return this.m0w[var1].kvj;
   }

   @Override
   public void ito(yw3 var1) {
      this.btp((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
