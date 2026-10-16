import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class kqv$nva {
   private List pgf = Lists.newArrayList();

   public kqv$nva __m(dbw var1, int var2) {
      this.pgf.add(new kqv$ju0(var1, var2));
      return this;
   }

   public kqv pdu() {
      Collections.sort(this.pgf);
      return new kqv(this.pgf);
   }

   public dbw yrc() {
      return ((kqv$ju0)this.pgf.get(0)).qwd;
   }
}
