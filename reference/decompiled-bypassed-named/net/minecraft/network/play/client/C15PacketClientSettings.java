package net.minecraft.network.play.client;

public class C15PacketClientSettings implements mz2 {
   private String ucs;
   private int dvr;
   private ha9$c4q ozl;
   private boolean qm0;
   private int z42;

   public C15PacketClientSettings() {
   }

   public C15PacketClientSettings(String var1, int var2, ha9$c4q var3, boolean var4, int var5) {
      this.ucs = var1;
      this.dvr = var2;
      this.ozl = var3;
      this.qm0 = var4;
      this.z42 = var5;
   }

   @Override
   public void ajj(nfj var1) {
      this.ucs = var1.oa5(7);
      this.dvr = var1.readByte();
      this.ozl = ha9$c4q.oub(var1.readByte());
      this.qm0 = var1.readBoolean();
      this.z42 = var1.readUnsignedByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.ucs);
      var1.writeByte(this.dvr);
      var1.writeByte(this.ozl.ih5());
      var1.writeBoolean(this.qm0);
      var1.writeByte(this.z42);
   }

   public void yhh(no5 var1) {
      var1.myd(this);
   }

   public String yot() {
      return this.ucs;
   }

   public ha9$c4q qbd() {
      return this.ozl;
   }

   public boolean q72() {
      return this.qm0;
   }

   public int v5_() {
      return this.z42;
   }

   @Override
   public void ito(yw3 var1) {
      this.yhh((no5)var1);
   }
}
