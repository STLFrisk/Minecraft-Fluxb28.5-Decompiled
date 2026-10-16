package net.minecraft.network.play.server;

public class S39PacketPlayerAbilities implements mz2 {
   public S39PacketPlayerAbilities() {
   }

   public S39PacketPlayerAbilities(pj2 var1) {
      this.aw2(var1.lez);
      this.q0a(var1.wzx);
      this.ub0(var1.wvp);
      this.i6s(var1.g40);
      this.hdp(var1.eay());
      this.s4z(var1.wjr());
   }

   @Override
   public void ajj(nfj var1) {
      String var2 = S14PacketEntity.b();
      byte var3 = var1.readByte();

      S39PacketPlayerAbilities var10000;
      int var10001;
      label73: {
         label72: {
            try {
               var10000 = this;
               var10001 = var3 & 1;
               if (var2 == null) {
                  break label73;
               }

               if (var10001 > 0) {
                  break label72;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var10001 = 0;
            break label73;
         }

         var10001 = 1;
      }

      label64: {
         label63: {
            try {
               var10000.aw2((boolean)var10001);
               var10000 = this;
               var10001 = var3 & 2;
               if (var2 == null) {
                  break label64;
               }

               if (var10001 > 0) {
                  break label63;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var10001 = 0;
            break label64;
         }

         var10001 = 1;
      }

      label55: {
         label54: {
            try {
               var10000.q0a((boolean)var10001);
               var10000 = this;
               var10001 = var3 & 4;
               if (var2 == null) {
                  break label55;
               }

               if (var10001 > 0) {
                  break label54;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10001 = 0;
            break label55;
         }

         var10001 = 1;
      }

      label46: {
         label45: {
            try {
               var10000.ub0((boolean)var10001);
               var10000 = this;
               var10001 = var3 & 8;
               if (var2 == null) {
                  break label46;
               }

               if (var10001 > 0) {
                  break label45;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10001 = 0;
            break label46;
         }

         var10001 = 1;
      }

      var10000.i6s((boolean)var10001);
      this.hdp(var1.readFloat());
      this.s4z(var1.readFloat());
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
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: aload 0
      // 07: invokevirtual net/minecraft/network/play/server/S39PacketPlayerAbilities.pps ()Z
      // 0a: aload 2
      // 0b: ifnull 21
      // 0e: ifeq 1d
      // 11: goto 18
      // 14: invokestatic net/minecraft/network/play/server/S39PacketPlayerAbilities.a (Loov;)Loov;
      // 17: athrow
      // 18: iload 3
      // 19: bipush 1
      // 1a: ior
      // 1b: i2b
      // 1c: istore 3
      // 1d: aload 0
      // 1e: invokevirtual net/minecraft/network/play/server/S39PacketPlayerAbilities.lbk ()Z
      // 21: aload 2
      // 22: ifnull 38
      // 25: ifeq 34
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/network/play/server/S39PacketPlayerAbilities.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 3
      // 30: bipush 2
      // 31: ior
      // 32: i2b
      // 33: istore 3
      // 34: aload 0
      // 35: invokevirtual net/minecraft/network/play/server/S39PacketPlayerAbilities.ujl ()Z
      // 38: aload 2
      // 39: ifnull 4f
      // 3c: ifeq 4b
      // 3f: goto 46
      // 42: invokestatic net/minecraft/network/play/server/S39PacketPlayerAbilities.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 3
      // 47: bipush 4
      // 48: ior
      // 49: i2b
      // 4a: istore 3
      // 4b: aload 0
      // 4c: invokevirtual net/minecraft/network/play/server/S39PacketPlayerAbilities.cbr ()Z
      // 4f: aload 2
      // 50: ifnull 69
      // 53: ifeq 6a
      // 56: goto 5d
      // 59: invokestatic net/minecraft/network/play/server/S39PacketPlayerAbilities.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 3
      // 5e: bipush 8
      // 60: ior
      // 61: i2b
      // 62: goto 69
      // 65: invokestatic net/minecraft/network/play/server/S39PacketPlayerAbilities.a (Loov;)Loov;
      // 68: athrow
      // 69: istore 3
      // 6a: aload 1
      // 6b: iload 3
      // 6c: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 6f: pop
      // 70: aload 1
      // 71: aload 0
      // 72: getfield net/minecraft/network/play/server/S39PacketPlayerAbilities.lgg F
      // 75: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 78: pop
      // 79: aload 1
      // 7a: aload 0
      // 7b: getfield net/minecraft/network/play/server/S39PacketPlayerAbilities.uwr F
      // 7e: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 81: pop
      // 82: return
   }

   public void mzu(jsv var1) {
      var1.j_n(this);
   }

   public boolean pps() {
      return this.iy8;
   }

   public void aw2(boolean var1) {
      this.iy8 = var1;
   }

   public boolean lbk() {
      return this.jwh;
   }

   public void q0a(boolean var1) {
      this.jwh = var1;
   }

   public boolean ujl() {
      return this.t16;
   }

   public void ub0(boolean var1) {
      this.t16 = var1;
   }

   public boolean cbr() {
      return this.g3l;
   }

   public void i6s(boolean var1) {
      this.g3l = var1;
   }

   public float d0w() {
      return this.lgg;
   }

   public void hdp(float var1) {
      this.lgg = var1;
   }

   public float sxo() {
      return this.uwr;
   }

   public void s4z(float var1) {
      this.uwr = var1;
   }

   @Override
   public void ito(yw3 var1) {
      this.mzu((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
