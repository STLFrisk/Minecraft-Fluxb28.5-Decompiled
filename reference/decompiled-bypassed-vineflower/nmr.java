import java.util.List;

public class nmr implements dbw {
   public final List x_d;
   public final List g1u;
   public final boolean fye;
   public final boolean cbs;
   public final sla _oa;
   public final flk s57;

   public nmr(List var1, List var2, boolean var3, boolean var4, sla var5, flk var6) {
      this.x_d = var1;
      this.g1u = var2;
      this.fye = var3;
      this.cbs = var4;
      this._oa = var5;
      this.s57 = var6;
   }

   @Override
   public List ebu(vt2 var1) {
      return (List)this.g1u.get(var1.ordinal());
   }

   @Override
   public List in9() {
      return this.x_d;
   }

   @Override
   public boolean abn() {
      return this.fye;
   }

   @Override
   public boolean egt() {
      return this.cbs;
   }

   @Override
   public boolean bm9() {
      return false;
   }

   @Override
   public sla yea() {
      return this._oa;
   }

   @Override
   public flk jzp() {
      return this.s57;
   }
}
