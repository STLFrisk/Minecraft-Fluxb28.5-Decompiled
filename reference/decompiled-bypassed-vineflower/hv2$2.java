import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

// $VF: synthetic class
public class hv2$2 {
   public static final int[] pq7 = new int[Type.values().length];

   static {
      try {
         pq7[Type.SKIN.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         pq7[Type.CAPE.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }
   }
}
