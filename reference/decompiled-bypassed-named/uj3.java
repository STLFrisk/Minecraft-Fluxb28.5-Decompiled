import java.util.Arrays;
import java.util.List;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;

public class uj3 {
   public static List kao() {
      return Arrays.asList(Minecraft.vz1().tij.guf.stream().filter(uj3::miq).filter(uj3::ak1).map(uj3::asf).toArray(uj3::my9));
   }

   public static List xju() {
      return Arrays.asList(Minecraft.vz1().tij.guf.stream().filter(uj3::dgp).toArray(uj3::nxs));
   }

   public static List o1c() {
      return Arrays.asList(Minecraft.vz1().tij.guf.stream().filter(uj3::gq9).filter(uj3::t2e).map(uj3::ung).toArray(uj3::jpv));
   }

   public static List uux() {
      return Minecraft.vz1().tij.cn6;
   }

   public static List ejm() {
      return Arrays.asList(Minecraft.vz1().tij.cn6.stream().filter(uj3::ry2).map(uj3::r_v).toArray(uj3::gj0));
   }

   public static List pd3() {
      return Arrays.asList(Minecraft.vz1().tij.cn6.stream().filter(uj3::iti).map(uj3::pnx).toArray(uj3::wa3));
   }

   private static TileEntityEnderChest[] wa3(int var0) {
      return new TileEntityEnderChest[var0];
   }

   private static TileEntityEnderChest pnx(pyk var0) {
      return (TileEntityEnderChest)var0;
   }

   private static boolean iti(pyk var0) {
      return var0 instanceof TileEntityEnderChest;
   }

   private static TileEntityChest[] gj0(int var0) {
      return new TileEntityChest[var0];
   }

   private static TileEntityChest r_v(pyk var0) {
      return (TileEntityChest)var0;
   }

   private static boolean ry2(pyk var0) {
      return var0 instanceof TileEntityChest;
   }

   private static ha9[] jpv(int var0) {
      return new ha9[var0];
   }

   private static ha9 ung(EntityLivingBase var0) {
      return (ha9)var0;
   }

   private static boolean t2e(EntityLivingBase var0) {
      try {
         if (var0 != Minecraft.vz1().vg8) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   private static boolean gq9(EntityLivingBase var0) {
      return var0 instanceof ha9;
   }

   private static EntityLivingBase[] nxs(int var0) {
      return new EntityLivingBase[var0];
   }

   private static boolean dgp(EntityLivingBase var0) {
      try {
         if (var0 != Minecraft.vz1().vg8) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   private static Entity[] my9(int var0) {
      return new Entity[var0];
   }

   private static Entity asf(EntityLivingBase var0) {
      return (Entity)var0;
   }

   private static boolean ak1(EntityLivingBase var0) {
      try {
         if (var0 != Minecraft.vz1().vg8) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   private static boolean miq(EntityLivingBase var0) {
      return var0 instanceof Entity;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
