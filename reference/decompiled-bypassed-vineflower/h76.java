import java.util.Collection;

public class h76 extends ev3 {
   public h76(String var1) {
      super(var1, Boolean.class);
   }

   @Override
   public Collection isr() {
      return this._lc;
   }

   public static h76 d_1(String var0) {
      return new h76(var0);
   }

   public String y06(Boolean var1) {
      return var1.toString();
   }

   @Override
   public String _lf(Comparable var1) {
      return this.y06((Boolean)var1);
   }
}
