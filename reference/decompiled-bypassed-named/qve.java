import com.google.common.base.Predicate;

public class qve implements Predicate {
   public final v3i s0l;

   public qve(v3i var1) {
      this.s0l = var1;
   }

   public boolean sop(EntityLivingBase var1) {
      return var1.mzu();
   }

   public boolean apply(Object var1) {
      return this.sop((EntityLivingBase)var1);
   }
}
