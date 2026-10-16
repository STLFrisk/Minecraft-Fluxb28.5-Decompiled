import net.minecraft.network.play.client.C07PacketPlayerDigging$pl2;
import net.minecraft.network.play.client.C0BPacketEntityAction$ck7;
import net.minecraft.network.play.client.C16PacketClientStatus$v78;

// $VF: synthetic class
public class mlk$4 {
   public static final int[] zr4;
   public static final int[] mz1;
   public static final int[] ewa = new int[C16PacketClientStatus$v78.values().length];

   static {
      try {
         ewa[C16PacketClientStatus$v78.ggv.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         ewa[C16PacketClientStatus$v78.gfl.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         ewa[C16PacketClientStatus$v78.s_c.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      mz1 = new int[C0BPacketEntityAction$ck7.values().length];

      try {
         mz1[C0BPacketEntityAction$ck7.cqg.ordinal()] = 1;
      } catch (NoSuchFieldError var13) {
      }

      try {
         mz1[C0BPacketEntityAction$ck7.lxs.ordinal()] = 2;
      } catch (NoSuchFieldError var12) {
      }

      try {
         mz1[C0BPacketEntityAction$ck7.mft.ordinal()] = 3;
      } catch (NoSuchFieldError var11) {
      }

      try {
         mz1[C0BPacketEntityAction$ck7.dbx.ordinal()] = 4;
      } catch (NoSuchFieldError var10) {
      }

      try {
         mz1[C0BPacketEntityAction$ck7.a79.ordinal()] = 5;
      } catch (NoSuchFieldError var9) {
      }

      try {
         mz1[C0BPacketEntityAction$ck7.y56.ordinal()] = 6;
      } catch (NoSuchFieldError var8) {
      }

      try {
         mz1[C0BPacketEntityAction$ck7.lqv.ordinal()] = 7;
      } catch (NoSuchFieldError var7) {
      }

      zr4 = new int[C07PacketPlayerDigging$pl2.values().length];

      try {
         zr4[C07PacketPlayerDigging$pl2.etu.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         zr4[C07PacketPlayerDigging$pl2.r69.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         zr4[C07PacketPlayerDigging$pl2.md_.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         zr4[C07PacketPlayerDigging$pl2.gi_.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         zr4[C07PacketPlayerDigging$pl2.t2e.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      try {
         zr4[C07PacketPlayerDigging$pl2.x56.ordinal()] = 6;
      } catch (NoSuchFieldError var1) {
      }
   }
}
