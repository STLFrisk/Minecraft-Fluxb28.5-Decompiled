import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class qpm {
   public static void cng() {
      hzu.fpt();
      hzu.w60(0);
      hzu.w60(1);
      hzu.ync();
   }

   public static void ne_() {
      hzu.s7q();
      hzu.tzg(0);
      hzu.tzg(1);
      hzu.avm();
      hzu.p8z(1032, 5634);
      float var0 = 0.4F;
      float var1 = 0.6F;
      float var2 = 0.0F;
      GL11.glLight(16384, 4611, s5y(ggn.lvi, ggn.gn5, ggn.bn2, 0.0));
      GL11.glLight(16384, 4609, qra(var1, var1, var1, 1.0F));
      GL11.glLight(16384, 4608, qra(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16384, 4610, qra(var2, var2, var2, 1.0F));
      GL11.glLight(16385, 4611, s5y(s6g.lvi, s6g.gn5, s6g.bn2, 0.0));
      GL11.glLight(16385, 4609, qra(var1, var1, var1, 1.0F));
      GL11.glLight(16385, 4608, qra(0.0F, 0.0F, 0.0F, 1.0F));
      GL11.glLight(16385, 4610, qra(var2, var2, var2, 1.0F));
      hzu.nn9(7424);
      GL11.glLightModel(2899, qra(var0, var0, var0, 1.0F));
   }

   private static FloatBuffer s5y(double var0, double var2, double var4, double var6) {
      return qra((float)var0, (float)var2, (float)var4, (float)var6);
   }

   private static FloatBuffer qra(float var0, float var1, float var2, float var3) {
      ((Buffer)bqv).clear();
      bqv.put(var0).put(var1).put(var2).put(var3);
      ((Buffer)bqv).flip();
      return bqv;
   }

   public static void gdb() {
      hzu.dp2();
      hzu.a2h(-30.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(165.0F, 1.0F, 0.0F, 0.0F);
      ne_();
      hzu.x3w();
   }
}
