import java.awt.Color;
import java.io.Serializable;

public class oj6 extends lnz implements Serializable {
   public static final long serialVersionUID = -105080578052502155L;

   public oj6(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4);
   }

   public oj6(byte[] var1) {
      super(var1);
   }

   public oj6(oj6 var1) {
      super(var1);
   }

   public oj6(lnz var1) {
      super(var1);
   }

   public oj6(Color var1) {
      super((byte)var1.getRed(), (byte)var1.getGreen(), (byte)var1.getBlue(), (byte)var1.getAlpha());
   }

   public oj6() {
   }

   public final void s2g(Color var1) {
      this.qv5 = (byte)var1.getRed();
      this.aun = (byte)var1.getGreen();
      this.yhg = (byte)var1.getBlue();
      this.wln = (byte)var1.getAlpha();
   }

   public final Color cd9() {
      int var1 = this.qv5 & 255;
      int var2 = this.aun & 255;
      int var3 = this.yhg & 255;
      int var4 = this.wln & 255;
      return new Color(var1, var2, var3, var4);
   }
}
