import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public final class z83$12 implements Comparator {
   public final mew l61;

   public z83$12(mew var1) {
      this.l61 = var1;
   }

   public int zkn(EntityLivingBase var1, EntityLivingBase var2) {
      return ComparisonChain.start().compare(var1.csm(this.l61), var2.csm(this.l61)).result();
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.zkn((EntityLivingBase)var1, (EntityLivingBase)var2);
   }
}
