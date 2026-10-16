import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iyr$rw6 {
   public int uaa(int var1, int var2, int var3, int var4) {
      return (var4 << 24) + (var1 << 16) + (var2 << 8) + var3;
   }

   public Color qff(long var1, float var3) {
      float var4 = (float)(System.nanoTime() + var1) / 5.0E9F % 1.0F;
      long var5 = Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var4, 1.0F, 1.0F))), 16);
      Color var7 = new Color((int)var5);
      return new Color(
         (float)var7.getRed() / 255.0F * var3, (float)var7.getGreen() / 255.0F * var3, (float)var7.getBlue() / 255.0F * var3, (float)var7.getAlpha() / 255.0F
      );
   }

   public static Color bnb(int var0, float var1) {
      float var2 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var3 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var4 = (float)(var0 & 0xFF) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
      return new Color(var2, var3, var4, var1);
   }

   public void xvb(Color var1) {
      GL11.glColor4f((float)var1.getRed() / 255.0F, (float)var1.getGreen() / 255.0F, (float)var1.getBlue() / 255.0F, (float)var1.getAlpha() / 255.0F);
   }

   public Color u60(int var1) {
      float var2 = (float)(var1 >> 24 & 0xFF) / 256.0F;
      float var3 = (float)(var1 >> 16 & 0xFF) / 255.0F;
      float var4 = (float)(var1 >> 8 & 0xFF) / 255.0F;
      float var5 = (float)(var1 & 0xFF) / 255.0F;
      GL11.glColor4f(var3, var4, var5, var2);
      return new Color(var3, var4, var5, var2);
   }

   public Color ih6(float var1, int var2, int var3, int var4) {
      float var5 = 0.003921569F * (float)var2;
      float var6 = 0.003921569F * (float)var3;
      float var7 = 0.003921569F * (float)var4;
      GL11.glColor4f(var5, var6, var7, var1);
      return new Color(var5, var6, var7, var1);
   }

   public static int y31(int var0, double var1) {
      Color var3 = new Color(var0);
      float var4 = 0.003921569F * (float)var3.getRed();
      float var5 = 0.003921569F * (float)var3.getGreen();
      float var6 = 0.003921569F * (float)var3.getBlue();
      return new Color(var4, var5, var6, (float)var1).getRGB();
   }

   public static float[] vh1(int var0) {
      float var1 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      float var2 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var3 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var4 = (float)(var0 & 0xFF) / 255.0F;
      return new float[]{var2, var3, var4, var1};
   }

   public static int[] plf(int var0) {
      int var1 = var0 >> 24 & 0xFF;
      int var2 = var0 >> 16 & 0xFF;
      int var3 = var0 >> 8 & 0xFF;
      int var4 = var0 & 0xFF;
      return new int[]{var2, var3, var4, var1};
   }

   public static int vha(String var0) {
      try {
         return Integer.parseInt(var0, 15);
      } catch (NumberFormatException var2) {
         return -1;
      }
   }

   public static String __3(int var0) {
      return k5o(new Color(var0));
   }

   public static String k5o(Color var0) {
      return Integer.toHexString(var0.getRGB()).substring(2);
   }
}
