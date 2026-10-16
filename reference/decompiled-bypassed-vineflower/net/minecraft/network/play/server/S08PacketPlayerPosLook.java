package net.minecraft.network.play.server;

import java.util.Set;

public class S08PacketPlayerPosLook implements mz2 {
   private double ojd;
   private double fnl;
   private double frh;
   private float ogk;
   private float zta;
   private Set dsj;

   public S08PacketPlayerPosLook() {
   }

   public S08PacketPlayerPosLook(double var1, double var3, double var5, float var7, float var8, Set var9) {
      this.ojd = var1;
      this.fnl = var3;
      this.frh = var5;
      this.ogk = var7;
      this.zta = var8;
      this.dsj = var9;
   }

   @Override
   public void ajj(nfj var1) {
      this.ojd = var1.readDouble();
      this.fnl = var1.readDouble();
      this.frh = var1.readDouble();
      this.ogk = var1.readFloat();
      this.zta = var1.readFloat();
      this.dsj = S08PacketPlayerPosLook$bdv.x1l(var1.readUnsignedByte());
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeDouble(this.ojd);
      var1.writeDouble(this.fnl);
      var1.writeDouble(this.frh);
      var1.writeFloat(this.ogk);
      var1.writeFloat(this.zta);
      var1.writeByte(S08PacketPlayerPosLook$bdv.xz5(this.dsj));
   }

   public void _4v(jsv var1) {
      var1.th7(this);
   }

   public double xr4() {
      return this.ojd;
   }

   public double mvt() {
      return this.fnl;
   }

   public double isl() {
      return this.frh;
   }

   public float q30() {
      return this.ogk;
   }

   public float ovw() {
      return this.zta;
   }

   public Set _7h() {
      return this.dsj;
   }

   public void nqk(float var1) {
      this.ogk = var1;
   }

   public void yn2(float var1) {
      this.zta = var1;
   }

   @Override
   public void ito(yw3 var1) {
      this._4v((jsv)var1);
   }
}
