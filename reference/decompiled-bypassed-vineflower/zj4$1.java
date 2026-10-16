import us.myles.ViaVersion.api.remapper.PacketRemapper;
import us.myles.ViaVersion.api.type.Type;

public class zj4$1 extends PacketRemapper {
   public final zj4 l1l;

   public zj4$1(zj4 var1) {
      this.l1l = var1;
   }

   public void registerMap() {
      this.map(Type.VAR_INT);
      this.map(Type.STRING, new zj4$1$1(this, Type.STRING));
   }
}
