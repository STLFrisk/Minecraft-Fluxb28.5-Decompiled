public class zek extends gun {
   private final _cv ur1;

   public zek(_cv var1) {
      super(var1);
      this.ur1 = var1;
      this.rlr(0);
      this.oml(true);
   }

   @Override
   public int v05(int var1) {
      return var1 | 4;
   }

   @Override
   public int bu9(erg var1, int var2) {
      return this.ur1.ieb(this.ur1.kig(var1.j6_()));
   }

   @Override
   public String g56(erg var1) {
      return super.ayn() + "." + this.ur1.d14(var1.j6_()).lfl();
   }
}
