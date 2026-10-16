package net.minecraft.network.play.server;

public class S36PacketSignEditorOpen implements mz2 {
   public S36PacketSignEditorOpen() {
   }

   public S36PacketSignEditorOpen(mew var1) {
      this.jph = var1;
   }

   public void o0l(jsv var1) {
      var1.qya(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.jph = var1.jh0();
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.jph);
   }

   public mew oeb() {
      return this.jph;
   }

   @Override
   public void ito(yw3 var1) {
      this.o0l((jsv)var1);
   }
}
