import io.netty.buffer.ByteBuf;

public class q2b$1 extends k6s {
   public final q2b isy;

   public q2b$1(q2b var1) {
      this.isy = var1;
   }

   @Override
   public void r73() {
      this.isy.a0c().c66(23, this.c4d());
      this.isy.a0c().c66(24, ekw$szt.odg(this.gay()));
   }

   @Override
   public int end() {
      return 1;
   }

   @Override
   public void p8w(ByteBuf var1) {
      var1.writeInt(this.isy.jwu());
   }

   @Override
   public mew d3d() {
      return new mew(this.isy.o2v, this.isy.kfp + 0.5, this.isy.vbd);
   }

   @Override
   public fqr i15() {
      return new fqr(this.isy.o2v, this.isy.kfp, this.isy.vbd);
   }

   @Override
   public t9d qha() {
      return this.isy.oay;
   }

   @Override
   public i2h zyd() {
      return this.isy;
   }
}
