import com.google.common.base.Predicate;

public class g_3$1 implements Predicate {
   public final Entity k84;

   public g_3$1(Entity var1) {
      this.k84 = var1;
   }

   public boolean u6u(EntityLivingBase var1) {
      return var1.tfh();
   }

   public boolean apply(Object var1) {
      return this.u6u((EntityLivingBase)var1);
   }
}
