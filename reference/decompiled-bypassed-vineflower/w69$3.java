import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;

public class w69$3 implements FutureCallback {
   public final File z5m;
   public final SettableFuture j17;
   public final w69 re1;

   public w69$3(w69 var1, File var2, SettableFuture var3) {
      this.re1 = var1;
      this.z5m = var2;
      this.j17 = var3;
   }

   public void onSuccess(Object var1) {
      this.re1.rsf(this.z5m);
      this.j17.set(null);
   }

   public void onFailure(Throwable var1) {
      this.j17.setException(var1);
   }
}
