import java.util.Comparator;

public class qbw$p3h implements Comparator {
   public final qbw vh2;

   public qbw$p3h(qbw var1) {
      this.vh2 = var1;
   }

   public int zlh(qbw$aj2 var1, qbw$aj2 var2) {
      return (int)(var1.gxq() + var1.vpi() - (var2.gxq() + var2.vpi()));
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.zlh((qbw$aj2)var1, (qbw$aj2)var2);
   }
}
