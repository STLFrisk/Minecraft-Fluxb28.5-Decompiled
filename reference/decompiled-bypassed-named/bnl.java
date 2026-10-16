import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class bnl {
   public int wln;
   public int lls;

   public void _5l() {
      Mouse.setGrabbed(true);
      this.wln = 0;
      this.lls = 0;
   }

   public void a0w() {
      Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
      Mouse.setGrabbed(false);
   }

   public void dgn() {
      this.wln = Mouse.getDX();
      this.lls = Mouse.getDY();
   }
}
