import java.util.Iterator;

public final class mew$2 implements Iterable {
   public final mew apc;
   public final mew k_7;

   public mew$2(mew var1, mew var2) {
      this.apc = var1;
      this.k_7 = var2;
   }

   @Override
   public Iterator iterator() {
      return new mew$2$1(this);
   }
}
