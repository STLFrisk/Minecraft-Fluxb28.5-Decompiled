package net.minecraft.network.play.client;

public class C13PacketPlayerAbilities implements mz2 {
   public float my8;
   public float xjj;

   public C13PacketPlayerAbilities() {
   }

   public C13PacketPlayerAbilities(pj2 var1) {
      this.qas(var1.lez);
      this.jwb(var1.wzx);
      this.r_q(var1.wvp);
      this.qv6(var1.g40);
      this.lsx(var1.eay());
      this.by_(var1.wjr());
   }

   @Override
   public void ajj(nfj var1) {
      EntityLivingBase[] var2 = C03PacketPlayer.b();
      byte var3 = var1.readByte();

      C13PacketPlayerAbilities var10000;
      int var10001;
      label81: {
         label80: {
            try {
               var10000 = this;
               var10001 = var3 & 1;
               if (var2 != null) {
                  break label81;
               }

               if (var10001 > 0) {
                  break label80;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var10001 = 0;
            break label81;
         }

         var10001 = 1;
      }

      label72: {
         label71: {
            try {
               var10000.qas((boolean)var10001);
               var10000 = this;
               var10001 = var3 & 2;
               if (var2 != null) {
                  break label72;
               }

               if (var10001 > 0) {
                  break label71;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var10001 = 0;
            break label72;
         }

         var10001 = 1;
      }

      label63: {
         label62: {
            try {
               var10000.jwb((boolean)var10001);
               var10000 = this;
               var10001 = var3 & 4;
               if (var2 != null) {
                  break label63;
               }

               if (var10001 > 0) {
                  break label62;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var10001 = 0;
            break label63;
         }

         var10001 = 1;
      }

      label54: {
         label53: {
            try {
               var10000.r_q((boolean)var10001);
               var10000 = this;
               var10001 = var3 & 8;
               if (var2 != null) {
                  break label54;
               }

               if (var10001 > 0) {
                  break label53;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10001 = 0;
            break label54;
         }

         var10001 = 1;
      }

      try {
         var10000.qv6((boolean)var10001);
         this.lsx(var1.readFloat());
         this.by_(var1.readFloat());
         if (var2 != null) {
            EntityLivingBase.b(new EntityLivingBase[3]);
         }
      } catch (oov var4) {
         throw a(var4);
      }
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
      // 00: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 03: astore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: aload 0
      // 07: invokevirtual net/minecraft/network/play/client/C13PacketPlayerAbilities.xkh ()Z
      // 0a: aload 2
      // 0b: ifnonnull 21
      // 0e: ifeq 1d
      // 11: goto 18
      // 14: invokestatic net/minecraft/network/play/client/C13PacketPlayerAbilities.a (Loov;)Loov;
      // 17: athrow
      // 18: iload 3
      // 19: bipush 1
      // 1a: ior
      // 1b: i2b
      // 1c: istore 3
      // 1d: aload 0
      // 1e: invokevirtual net/minecraft/network/play/client/C13PacketPlayerAbilities.xgg ()Z
      // 21: aload 2
      // 22: ifnonnull 38
      // 25: ifeq 34
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/network/play/client/C13PacketPlayerAbilities.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 3
      // 30: bipush 2
      // 31: ior
      // 32: i2b
      // 33: istore 3
      // 34: aload 0
      // 35: invokevirtual net/minecraft/network/play/client/C13PacketPlayerAbilities.lu4 ()Z
      // 38: aload 2
      // 39: ifnonnull 4f
      // 3c: ifeq 4b
      // 3f: goto 46
      // 42: invokestatic net/minecraft/network/play/client/C13PacketPlayerAbilities.a (Loov;)Loov;
      // 45: athrow
      // 46: iload 3
      // 47: bipush 4
      // 48: ior
      // 49: i2b
      // 4a: istore 3
      // 4b: aload 0
      // 4c: invokevirtual net/minecraft/network/play/client/C13PacketPlayerAbilities.iis ()Z
      // 4f: aload 2
      // 50: ifnonnull 69
      // 53: ifeq 6a
      // 56: goto 5d
      // 59: invokestatic net/minecraft/network/play/client/C13PacketPlayerAbilities.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 3
      // 5e: bipush 8
      // 60: ior
      // 61: i2b
      // 62: goto 69
      // 65: invokestatic net/minecraft/network/play/client/C13PacketPlayerAbilities.a (Loov;)Loov;
      // 68: athrow
      // 69: istore 3
      // 6a: aload 1
      // 6b: iload 3
      // 6c: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 6f: pop
      // 70: aload 1
      // 71: aload 0
      // 72: getfield net/minecraft/network/play/client/C13PacketPlayerAbilities.my8 F
      // 75: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 78: pop
      // 79: aload 1
      // 7a: aload 0
      // 7b: getfield net/minecraft/network/play/client/C13PacketPlayerAbilities.xjj F
      // 7e: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 81: pop
      // 82: return
   }

   public void j_y(no5 var1) {
      var1.kh5(this);
   }

   public boolean xkh() {
      return this.lrh;
   }

   public void qas(boolean var1) {
      this.lrh = var1;
   }

   public boolean xgg() {
      return this.l1u;
   }

   public void jwb(boolean var1) {
      this.l1u = var1;
   }

   public boolean lu4() {
      return this.cni;
   }

   public void r_q(boolean var1) {
      this.cni = var1;
   }

   public boolean iis() {
      return this.srt;
   }

   public void qv6(boolean var1) {
      this.srt = var1;
   }

   public void lsx(float var1) {
      this.my8 = var1;
   }

   public void by_(float var1) {
      this.xjj = var1;
   }

   @Override
   public void ito(yw3 var1) {
      this.j_y((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
