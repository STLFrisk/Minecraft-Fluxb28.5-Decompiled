import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class kpb$em2 {
   private xny vm1;
   private String j2s;
   private final List in_ = Lists.newArrayList();

   public kpb$em2 i4i(xny var1) {
      this.vm1 = var1;
      return this;
   }

   public kpb$em2 nb7(String var1) {
      this.j2s = var1;
      return this;
   }

   public kpb$em2 vgh(xny[] var1) {
      Collections.addAll(this.in_, var1);
      return this;
   }

   public kpb c9x() {
      return new kpb(this.vm1, this.j2s, this.in_, null);
   }
}
