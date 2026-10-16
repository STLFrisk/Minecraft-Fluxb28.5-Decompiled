import com.google.common.cache.CacheLoader;

public class r72$ct2 extends CacheLoader {
   private final t9d blx;
   private final boolean ll4;

   public r72$ct2(t9d var1, boolean var2) {
      this.blx = var1;
      this.ll4 = var2;
   }

   public d2q v9i(mew var1) {
      return new d2q(this.blx, var1, this.ll4);
   }

   public Object load(Object var1) {
      return this.v9i((mew)var1);
   }
}
