import java.util.List;

public class kqv implements dbw {
   private final int b95;
   private final List qpm;
   private final dbw q0u;

   public kqv(List var1) {
      this.qpm = var1;
      this.b95 = zfj._db(var1);
      this.q0u = ((kqv$ju0)var1.get(0)).qwd;
   }

   @Override
   public List ebu(vt2 var1) {
      return this.q0u.ebu(var1);
   }

   @Override
   public List in9() {
      return this.q0u.in9();
   }

   @Override
   public boolean abn() {
      return this.q0u.abn();
   }

   @Override
   public boolean egt() {
      return this.q0u.egt();
   }

   @Override
   public boolean bm9() {
      return this.q0u.bm9();
   }

   @Override
   public sla yea() {
      return this.q0u.yea();
   }

   @Override
   public flk jzp() {
      return this.q0u.jzp();
   }

   public dbw h1z(long var1) {
      return ((kqv$ju0)zfj.dgq(this.qpm, Math.abs((int)var1 >> 16) % this.b95)).qwd;
   }
}
