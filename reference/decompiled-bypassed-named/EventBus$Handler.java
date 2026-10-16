import java.lang.reflect.Method;

public final class EventBus$Handler {
   private final Object wt3;
   private final Method cu6;
   private final byte ka0;

   public EventBus$Handler(Object var1, Method var2, byte var3) {
      this.wt3 = var1;
      this.cu6 = var2;
      this.ka0 = var3;
   }

   public Object getTarget() {
      return this.wt3;
   }

   public Method getMethod() {
      return this.cu6;
   }

   public byte k51() {
      return this.ka0;
   }
}
