import net.minecraft.network.play.server.S38PacketPlayerListItem$a1f;
import net.minecraft.network.play.server.S45PacketTitle$_f9;

// $VF: synthetic class
public class p_k$4 {
   public static final int[] ja0;
   public static final int[] rd_ = new int[S38PacketPlayerListItem$a1f.values().length];

   static {
      try {
         rd_[S38PacketPlayerListItem$a1f.om8.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         rd_[S38PacketPlayerListItem$a1f.esa.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         rd_[S38PacketPlayerListItem$a1f.qwp.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         rd_[S38PacketPlayerListItem$a1f.qq8.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      ja0 = new int[S45PacketTitle$_f9.values().length];

      try {
         ja0[S45PacketTitle$_f9.r62.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         ja0[S45PacketTitle$_f9.syq.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         ja0[S45PacketTitle$_f9.enj.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }
   }
}
