import java.util.Set;

public class xrf$2 implements d48 {
   public final Set qfk;
   public final xrf kji;

   public xrf$2(xrf var1, Set var2) {
      this.kji = var1;
      this.qfk = var2;
   }

   @Override
   public void qwy(yu2 var1) {
      int var2 = OpaquePredicate.b();

      for (gdz var4 : this.qfk) {
         sla var5 = var1.qlr(var4);
         xrf.rdp(this.kji).put(var4, var5);
         if (var2 == 0) {
            break;
         }
      }
   }
}
