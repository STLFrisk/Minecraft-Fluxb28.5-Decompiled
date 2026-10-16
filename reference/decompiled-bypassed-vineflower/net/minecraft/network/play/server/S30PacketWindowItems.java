package net.minecraft.network.play.server;

import java.util.List;

public class S30PacketWindowItems implements mz2 {
   public S30PacketWindowItems() {
   }

   public S30PacketWindowItems(int param1, List param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: iload 1
      // 06: putfield net/minecraft/network/play/server/S30PacketWindowItems.dxf I
      // 09: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0c: aload 0
      // 0d: aload 2
      // 0e: invokeinterface java/util/List.size ()I 1
      // 13: anewarray 26
      // 16: putfield net/minecraft/network/play/server/S30PacketWindowItems.nkx [Lerg;
      // 19: bipush 0
      // 1a: istore 4
      // 1c: astore 3
      // 1d: iload 4
      // 1f: aload 0
      // 20: getfield net/minecraft/network/play/server/S30PacketWindowItems.nkx [Lerg;
      // 23: arraylength
      // 24: if_icmpge 5f
      // 27: aload 2
      // 28: iload 4
      // 2a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2f: checkcast erg
      // 32: astore 5
      // 34: aload 0
      // 35: getfield net/minecraft/network/play/server/S30PacketWindowItems.nkx [Lerg;
      // 38: iload 4
      // 3a: aload 5
      // 3c: aload 3
      // 3d: ifnull 54
      // 40: ifnonnull 52
      // 43: goto 4a
      // 46: invokestatic net/minecraft/network/play/server/S30PacketWindowItems.a (Loov;)Loov;
      // 49: athrow
      // 4a: aconst_null
      // 4b: goto 57
      // 4e: invokestatic net/minecraft/network/play/server/S30PacketWindowItems.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 5
      // 54: invokevirtual erg.yaq ()Lerg;
      // 57: aastore
      // 58: iinc 4 1
      // 5b: aload 3
      // 5c: ifnonnull 1d
      // 5f: return
   }

   @Override
   public void ajj(nfj var1) {
      this.dxf = var1.readUnsignedByte();
      short var3 = var1.readShort();
      this.nkx = new erg[var3];
      String var10000 = S14PacketEntity.b();
      int var4 = 0;
      String var2 = var10000;

      while (var4 < var3) {
         this.nkx[var4] = var1.x4d();
         var4++;
         if (var2 == null) {
            break;
         }
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.dxf);
      String var10000 = S14PacketEntity.b();
      var1.writeShort(this.nkx.length);
      erg[] var3 = this.nkx;
      int var4 = var3.length;
      String var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         erg var6 = var3[var5];
         var1.a6a(var6);
         var5++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void w7e(jsv var1) {
      var1.d70(this);
   }

   public int e_2() {
      return this.dxf;
   }

   public erg[] rwk() {
      return this.nkx;
   }

   @Override
   public void ito(yw3 var1) {
      this.w7e((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
