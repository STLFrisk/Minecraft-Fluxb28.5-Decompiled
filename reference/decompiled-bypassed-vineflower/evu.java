import java.awt.Color;
import java.io.Serializable;

public class evu extends fy3 implements Serializable {
   public static final long serialVersionUID = 6632576088353444794L;

   public evu(byte var1, byte var2, byte var3) {
      super(var1, var2, var3);
   }

   public evu(byte[] var1) {
      super(var1);
   }

   public evu(evu var1) {
      super(var1);
   }

   public evu(fy3 var1) {
      super(var1);
   }

   public evu(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue());
   }

   public evu() {
   }

   public final void w3r(Color var1) {
      this.vxv = (byte)var1.getRed();
      this.dia = (byte)var1.getGreen();
      this.urv = (byte)var1.getBlue();
   }

   public final Color xz9() {
      int var1 = this.vxv & 255;
      int var2 = this.dia & 255;
      int var3 = this.urv & 255;
      return new Color(var1, var2, var3);
   }
}
