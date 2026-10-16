package net.minecraft.network.play.server;

public class S10PacketSpawnPainting implements mz2 {
   private int zc0;
   private mew fm1;
   private vt2 t8s;
   private String ofl;

   public S10PacketSpawnPainting() {
   }

   public S10PacketSpawnPainting(n0_ var1) {
      this.zc0 = var1.jwu();
      this.fm1 = var1.liv();
      this.t8s = var1.vv_;
      this.ofl = var1.u16.kw2;
   }

   @Override
   public void ajj(nfj var1) {
      this.zc0 = var1.gux();
      this.ofl = var1.oa5(n0_$kmh.izw);
      this.fm1 = var1.jh0();
      this.t8s = vt2.bm6(var1.readUnsignedByte());
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.zc0);
      var1.p3z(this.ofl);
      var1.l3a(this.fm1);
      var1.writeByte(this.t8s.tmy());
   }

   public void _u7(jsv var1) {
      var1.qsp(this);
   }

   public int hkk() {
      return this.zc0;
   }

   public mew htd() {
      return this.fm1;
   }

   public vt2 saz() {
      return this.t8s;
   }

   public String q0d() {
      return this.ofl;
   }

   @Override
   public void ito(yw3 var1) {
      this._u7((jsv)var1);
   }
}
