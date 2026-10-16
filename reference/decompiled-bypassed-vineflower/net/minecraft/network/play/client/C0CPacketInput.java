package net.minecraft.network.play.client;

public class C0CPacketInput implements mz2 {
   public C0CPacketInput() {
   }

   public C0CPacketInput(float var1, float var2, boolean var3, boolean var4) {
      this.ke4 = var1;
      this.aad = var2;
      this.uj2 = var3;
      this.nm7 = var4;
   }

   @Override
   public void ajj(nfj var1) {
      this.ke4 = var1.readFloat();
      i2h[] var10000 = C03PacketPlayer.b();
      this.aad = var1.readFloat();
      i2h[] var2 = var10000;
      byte var3 = var1.readByte();

      int var10001;
      label39: {
         label38: {
            try {
               var6 = this;
               var10001 = var3 & 1;
               if (var2 != null) {
                  break label39;
               }

               if (var10001 > 0) {
                  break label38;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10001 = 0;
            break label39;
         }

         var10001 = 1;
      }

      label30: {
         label29: {
            try {
               var6.uj2 = (boolean)var10001;
               var7 = this;
               var10001 = var3 & 2;
               if (var2 != null) {
                  break label30;
               }

               if (var10001 > 0) {
                  break label29;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10001 = 0;
            break label30;
         }

         var10001 = 1;
      }

      var7.nm7 = (boolean)var10001;
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
      // 02: getfield net/minecraft/network/play/client/C0CPacketInput.ke4 F
      // 05: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 08: pop
      // 09: aload 1
      // 0a: aload 0
      // 0b: getfield net/minecraft/network/play/client/C0CPacketInput.aad F
      // 0e: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 11: pop
      // 12: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 15: bipush 0
      // 16: istore 3
      // 17: astore 2
      // 18: aload 0
      // 19: getfield net/minecraft/network/play/client/C0CPacketInput.uj2 Z
      // 1c: aload 2
      // 1d: ifnonnull 33
      // 20: ifeq 2f
      // 23: goto 2a
      // 26: invokestatic net/minecraft/network/play/client/C0CPacketInput.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 3
      // 2b: bipush 1
      // 2c: ior
      // 2d: i2b
      // 2e: istore 3
      // 2f: aload 0
      // 30: getfield net/minecraft/network/play/client/C0CPacketInput.nm7 Z
      // 33: aload 2
      // 34: ifnonnull 4c
      // 37: ifeq 4d
      // 3a: goto 41
      // 3d: invokestatic net/minecraft/network/play/client/C0CPacketInput.a (Loov;)Loov;
      // 40: athrow
      // 41: iload 3
      // 42: bipush 2
      // 43: ior
      // 44: i2b
      // 45: goto 4c
      // 48: invokestatic net/minecraft/network/play/client/C0CPacketInput.a (Loov;)Loov;
      // 4b: athrow
      // 4c: istore 3
      // 4d: aload 1
      // 4e: iload 3
      // 4f: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 52: pop
      // 53: return
   }

   public void x17(no5 var1) {
      var1.k2j(this);
   }

   public float jrg() {
      return this.ke4;
   }

   public float thh() {
      return this.aad;
   }

   public boolean gnt() {
      return this.uj2;
   }

   public boolean jrv() {
      return this.nm7;
   }

   @Override
   public void ito(yw3 var1) {
      this.x17((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
