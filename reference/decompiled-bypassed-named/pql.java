import com.google.common.base.Function;

public class pql extends gun {
   public final e0x vyn;
   public final Function j0w;

   public pql(e0x var1, e0x var2, Function var3) {
      super(var1);
      this.vyn = var2;
      this.j0w = var3;
      this.rlr(0);
      this.oml(true);
   }

   public pql(e0x var1, e0x var2, String[] var3) {
      this(var1, var2, new pql$1(var3));
   }

   @Override
   public int v05(int var1) {
      return var1;
   }

   @Override
   public String g56(erg var1) {
      return super.ayn() + "." + (String)this.j0w.apply(var1);
   }
}
