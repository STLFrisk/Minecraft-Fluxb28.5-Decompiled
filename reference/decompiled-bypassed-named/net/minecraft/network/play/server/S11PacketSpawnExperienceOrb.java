package net.minecraft.network.play.server;

public class S11PacketSpawnExperienceOrb implements mz2 {
   public S11PacketSpawnExperienceOrb() {
   }

   public S11PacketSpawnExperienceOrb(uno var1) {
      this.qw0 = var1.jwu();
      this.esp = fe6.jqf(var1.o2v * 32.0);
      this.wjb = fe6.jqf(var1.kfp * 32.0);
      this.kwg = fe6.jqf(var1.vbd * 32.0);
      this.cct = var1._pa();
   }

   @Override
   public void ajj(nfj var1) {
      this.qw0 = var1.gux();
      this.esp = var1.readInt();
      this.wjb = var1.readInt();
      this.kwg = var1.readInt();
      this.cct = var1.readShort();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.qw0);
      var1.writeInt(this.esp);
      var1.writeInt(this.wjb);
      var1.writeInt(this.kwg);
      var1.writeShort(this.cct);
   }

   public void oc1(jsv var1) {
      var1.xwb(this);
   }

   public int nes() {
      return this.qw0;
   }

   public int orx() {
      return this.esp;
   }

   public int rp4() {
      return this.wjb;
   }

   public int x0_() {
      return this.kwg;
   }

   public int na2() {
      return this.cct;
   }

   @Override
   public void ito(yw3 var1) {
      this.oc1((jsv)var1);
   }
}
