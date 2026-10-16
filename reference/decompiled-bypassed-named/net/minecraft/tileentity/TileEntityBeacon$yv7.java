package net.minecraft.tileentity;

public class TileEntityBeacon$yv7 {
   private final float[] kp0;
   private int d6l;
   private static int[] a;

   public TileEntityBeacon$yv7(float[] var1) {
      this.kp0 = var1;
      this.d6l = 1;
   }

   public void h9w() {
      this.d6l++;
   }

   public float[] tow() {
      return this.kp0;
   }

   public int x8n() {
      return this.d6l;
   }

   public static void b(int[] var0) {
      a = var0;
   }

   public static int[] b() {
      return a;
   }

   static {
      if (b() != null) {
         b(new int[3]);
      }
   }
}
