package net.minecraft.network.play.server;

import java.util.Collection;

public class S20PacketEntityProperties$bw1 {
   private final String zpv;
   private final double by0;
   private final Collection ewx;
   public final S20PacketEntityProperties d4g;

   public S20PacketEntityProperties$bw1(S20PacketEntityProperties var1, String var2, double var3, Collection var5) {
      this.d4g = var1;
      this.zpv = var2;
      this.by0 = var3;
      this.ewx = var5;
   }

   public String zpz() {
      return this.zpv;
   }

   public double p76() {
      return this.by0;
   }

   public Collection wa2() {
      return this.ewx;
   }
}
