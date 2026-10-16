package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class S27PacketExplosion implements mz2 {
   public S27PacketExplosion() {
   }

   public S27PacketExplosion(double param1, double param3, double param5, float param7, List param8, fqr param9) {
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
      // 05: dload 1
      // 06: putfield net/minecraft/network/play/server/S27PacketExplosion.cxp D
      // 09: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0c: aload 0
      // 0d: dload 3
      // 0e: putfield net/minecraft/network/play/server/S27PacketExplosion.lat D
      // 11: astore 10
      // 13: aload 0
      // 14: dload 5
      // 16: putfield net/minecraft/network/play/server/S27PacketExplosion.kue D
      // 19: aload 0
      // 1a: fload 7
      // 1c: putfield net/minecraft/network/play/server/S27PacketExplosion.bmy F
      // 1f: aload 0
      // 20: aload 8
      // 22: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 25: putfield net/minecraft/network/play/server/S27PacketExplosion.kzb Ljava/util/List;
      // 28: aload 10
      // 2a: ifnull 54
      // 2d: aload 9
      // 2f: ifnull 5e
      // 32: goto 39
      // 35: invokestatic net/minecraft/network/play/server/S27PacketExplosion.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 9
      // 3c: getfield fqr.lvi D
      // 3f: d2f
      // 40: putfield net/minecraft/network/play/server/S27PacketExplosion.g9r F
      // 43: aload 0
      // 44: aload 9
      // 46: getfield fqr.gn5 D
      // 49: d2f
      // 4a: putfield net/minecraft/network/play/server/S27PacketExplosion.aez F
      // 4d: goto 54
      // 50: invokestatic net/minecraft/network/play/server/S27PacketExplosion.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: aload 9
      // 57: getfield fqr.bn2 D
      // 5a: d2f
      // 5b: putfield net/minecraft/network/play/server/S27PacketExplosion.lcy F
      // 5e: return
   }

   @Override
   public void ajj(nfj var1) {
      this.cxp = (double)var1.readFloat();
      this.lat = (double)var1.readFloat();
      this.kue = (double)var1.readFloat();
      this.bmy = var1.readFloat();
      String var10000 = S14PacketEntity.b();
      int var3 = var1.readInt();
      this.kzb = Lists.newArrayListWithCapacity(var3);
      int var4 = (int)this.cxp;
      int var5 = (int)this.lat;
      String var2 = var10000;
      int var6 = (int)this.kue;
      int var7 = 0;

      while (true) {
         if (var7 < var3) {
            int var8 = var1.readByte() + var4;
            int var9 = var1.readByte() + var5;
            int var10 = var1.readByte() + var6;

            try {
               this.kzb.add(new mew(var8, var9, var10));
               var7++;
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            } catch (oov var11) {
               throw a(var11);
            }
         }

         this.g9r = var1.readFloat();
         this.aez = var1.readFloat();
         this.lcy = var1.readFloat();
         break;
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeFloat((float)this.cxp);
      var1.writeFloat((float)this.lat);
      String var10000 = S14PacketEntity.b();
      var1.writeFloat((float)this.kue);
      var1.writeFloat(this.bmy);
      var1.writeInt(this.kzb.size());
      int var3 = (int)this.cxp;
      String var2 = var10000;
      int var4 = (int)this.lat;
      int var5 = (int)this.kue;
      Iterator var6 = this.kzb.iterator();

      while (true) {
         if (var6.hasNext()) {
            mew var7 = (mew)var6.next();
            int var8 = var7.getX() - var3;
            int var9 = var7.getY() - var4;
            int var10 = var7.getZ() - var5;

            try {
               var1.writeByte(var8);
               var1.writeByte(var9);
               var1.writeByte(var10);
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            } catch (oov var11) {
               throw a(var11);
            }
         }

         var1.writeFloat(this.g9r);
         var1.writeFloat(this.aez);
         var1.writeFloat(this.lcy);
         break;
      }
   }

   public void ae4(jsv var1) {
      var1.jay(this);
   }

   public float gri() {
      return this.g9r;
   }

   public float jpf() {
      return this.aez;
   }

   public float dtb() {
      return this.lcy;
   }

   public void lub(float var1) {
      this.g9r = var1;
   }

   public void b1n(float var1) {
      this.aez = var1;
   }

   public void cuv(float var1) {
      this.lcy = var1;
   }

   public double v5n() {
      return this.cxp;
   }

   public double h_4() {
      return this.lat;
   }

   public double lw7() {
      return this.kue;
   }

   public float y3k() {
      return this.bmy;
   }

   public List njs() {
      return this.kzb;
   }

   @Override
   public void ito(yw3 var1) {
      this.ae4((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
