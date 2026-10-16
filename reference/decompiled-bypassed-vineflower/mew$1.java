import java.util.Iterator;

public final class mew$1 implements Iterable {
   public final mew ogp;
   public final mew w1z;

   public mew$1(mew var1, mew var2) {
      this.ogp = var1;
      this.w1z = var2;
   }

   @Override
   public Iterator iterator() {
      return new mew$1$1(this);
   }
}
