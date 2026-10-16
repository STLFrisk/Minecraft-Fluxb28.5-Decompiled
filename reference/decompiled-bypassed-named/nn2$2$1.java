import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

public class nn2$2$1 extends JFileChooser {
   public final nn2$2 pdp;

   public nn2$2$1(nn2$2 var1) {
      this.pdp = var1;
   }

   @Override
   public JDialog createDialog(Component var1) {
      JDialog var2 = super.createDialog(var1);
      var2.setAlwaysOnTop(true);
      return var2;
   }
}
