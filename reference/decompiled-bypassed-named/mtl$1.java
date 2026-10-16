import java.util.concurrent.CopyOnWriteArrayList;

public final class mtl$1 extends CopyOnWriteArrayList {
   private static final long serialVersionUID = 666L;
   public final EventBus$Handler zb3;

   public mtl$1(EventBus$Handler var1) {
      this.zb3 = var1;
      this.add(this.zb3);
   }
}
