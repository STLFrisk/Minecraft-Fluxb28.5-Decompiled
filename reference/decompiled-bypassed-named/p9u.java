import java.awt.image.BufferedImage;

public class p9u extends xe9 {
   public p9u(BufferedImage var1) {
      this(var1.getWidth(), var1.getHeight());
      var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), this.w0g, 0, var1.getWidth());
      this.oj6();
   }

   public p9u(int var1, int var2) {
      this.mho = var1;
      this.dpg = var2;
      this.w0g = new int[var1 * var2];
      p9t.kq3(this.getGlTextureId(), var1, var2);
   }

   @Override
   public void loadTexture(y99 var1) {
   }

   public void oj6() {
      p9t.b0p(this.getGlTextureId(), this.w0g, this.mho, this.dpg);
   }

   public int[] k8b() {
      return this.w0g;
   }
}
