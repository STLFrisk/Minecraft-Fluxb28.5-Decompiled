import java.util.Comparator;

public class g92$2 implements Comparator {
   public final g92 ip8;

   public g92$2(g92 var1) {
      this.ip8 = var1;
   }

   public int xc_(xny var1, xny var2) {
      return var1.w6i().compareTo(var2.w6i());
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.xc_((xny)var1, (xny)var2);
   }
}
