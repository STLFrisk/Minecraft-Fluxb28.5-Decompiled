import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class gkx$plo extends gkx$nul {
   private final Predicate qz4;

   public gkx$plo(int var1, String var2, boolean var3, Predicate var4) {
      super(var1, var2, var3);
      this.qz4 = (Predicate)Objects.firstNonNull(var4, Predicates.alwaysTrue());
   }

   public Predicate ozw() {
      return this.qz4;
   }
}
