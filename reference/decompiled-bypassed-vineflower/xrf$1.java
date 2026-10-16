import java.util.Comparator;

public class xrf$1 implements Comparator {
   public final xrf utc;

   public xrf$1(xrf var1) {
      this.utc = var1;
   }

   public int m2n(zlz var1, zlz var2) {
      return var1.toString().compareTo(var2.toString());
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.m2n((zlz)var1, (zlz)var2);
   }
}
