import us.myles.ViaVersion.api.PacketWrapper;
import us.myles.ViaVersion.api.remapper.ValueTransformer;
import us.myles.ViaVersion.api.type.Type;

public class zj4$1$1 extends ValueTransformer {
   public final zj4$1 _6o;

   public zj4$1$1(zj4$1 var1, Type var2) {
      super(var2);
      this._6o = var1;
   }

   public String u8_(PacketWrapper var1, String var2) {
      return var2;
   }

   public Object transform(PacketWrapper var1, Object var2) {
      return this.u8_(var1, (String)var2);
   }
}
