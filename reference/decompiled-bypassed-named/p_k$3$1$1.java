import com.google.common.util.concurrent.FutureCallback;
import net.minecraft.network.play.client.C19PacketResourcePackStatus;
import net.minecraft.network.play.client.C19PacketResourcePackStatus$lun;

public class p_k$3$1$1 implements FutureCallback {
   public final p_k$3$1 vsf;

   public p_k$3$1$1(p_k$3$1 var1) {
      this.vsf = var1;
   }

   public void onSuccess(Object var1) {
      p_k.c1i(this.vsf._de.zer).k7f(new C19PacketResourcePackStatus(this.vsf._de.lkd, C19PacketResourcePackStatus$lun.q9e));
   }

   public void onFailure(Throwable var1) {
      p_k.c1i(this.vsf._de.zer).k7f(new C19PacketResourcePackStatus(this.vsf._de.lkd, C19PacketResourcePackStatus$lun.htm));
   }
}
