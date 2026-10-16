import java.util.concurrent.Callable;

public class c05$13 implements Callable {
   public final c05 _9g;

   public c05$13(c05 var1) {
      this._9g = var1;
   }

   public String call() {
      return c05.lql(this._9g).o0m().toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
