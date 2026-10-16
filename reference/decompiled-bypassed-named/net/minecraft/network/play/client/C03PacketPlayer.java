package net.minecraft.network.play.client;

public class C03PacketPlayer implements mz2 {
   public double mjd;
   public double q9m;
   public double nzt;
   public float l73;
   public float m3m;
   public boolean er7;
   public boolean z3f;
   public boolean sfy;
   private static EntityLivingBase[] a;

   public C03PacketPlayer() {
   }

   public C03PacketPlayer(boolean var1) {
      this.er7 = var1;
   }

   public void ucy(no5 var1) {
      var1.cs0(this);
   }

   @Override
   public void ajj(nfj var1) {
      EntityLivingBase[] var2 = b();

      C03PacketPlayer var10000;
      short var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var1.readUnsignedByte();
               if (var2 != null) {
                  break label22;
               }

               if (var10001 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var10000.er7 = (boolean)var10001;
   }

   @Override
   public void ddd(nfj var1) {
      EntityLivingBase[] var2 = b();

      nfj var10000;
      byte var10001;
      label22: {
         label21: {
            try {
               var10000 = var1;
               var10001 = this.er7;
               if (var2 != null) {
                  break label22;
               }

               if (this.er7) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var10000.writeByte(var10001);
   }

   public double yle() {
      return this.mjd;
   }

   public double pow() {
      return this.q9m;
   }

   public double i50() {
      return this.nzt;
   }

   public void frn(double var1) {
      this.mjd = var1;
   }

   public void ubs(double var1) {
      this.q9m = var1;
   }

   public void cad(double var1) {
      this.nzt = var1;
   }

   public float ijl() {
      return this.l73;
   }

   public float l94() {
      return this.m3m;
   }

   public boolean n43() {
      return this.er7;
   }

   public boolean k8x() {
      return this.z3f;
   }

   public boolean vi8() {
      return this.sfy;
   }

   public void xju(boolean var1) {
      this.z3f = var1;
   }

   @Override
   public void ito(yw3 var1) {
      this.ucy((no5)var1);
   }

   public static void b(EntityLivingBase[] var0) {
      a = var0;
   }

   public static EntityLivingBase[] b() {
      return a;
   }

   private static oov a(oov var0) {
      return var0;
   }

   static {
      if (b() != null) {
         b(new EntityLivingBase[2]);
      }
   }
}
