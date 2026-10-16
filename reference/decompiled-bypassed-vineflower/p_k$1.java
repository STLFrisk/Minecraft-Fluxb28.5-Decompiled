import com.google.common.util.concurrent.FutureCallback;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import net.minecraft.network.play.client.C19PacketResourcePackStatus$lun;

public class p_k$1 implements FutureCallback {
   public final String ga5;
   public final p_k elb;

   public p_k$1(p_k var1, String var2) {
      this.elb = var1;
      this.ga5 = var2;
   }

   public void onSuccess(Object var1) {
      p_k.c1i(this.elb).k7f(new C19PacketResourcePackStatus(this.ga5, C19PacketResourcePackStatus$lun.q9e));
   }

   public void onFailure(Throwable var1) {
      p_k.c1i(this.elb).k7f(new C19PacketResourcePackStatus(this.ga5, C19PacketResourcePackStatus$lun.htm));
   }
}
