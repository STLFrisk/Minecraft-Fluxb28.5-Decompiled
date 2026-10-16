package net.minecraft.network.play.server;

public class S22PacketMultiBlockChange$_to {
   private final short zqe;
   private final zfz x0h;
   public final S22PacketMultiBlockChange mc0;

   public S22PacketMultiBlockChange$_to(S22PacketMultiBlockChange var1, short var2, zfz var3) {
      this.mc0 = var1;
      this.zqe = var2;
      this.x0h = var3;
   }

   public S22PacketMultiBlockChange$_to(S22PacketMultiBlockChange var1, short var2, tts var3) {
      this.mc0 = var1;
      this.zqe = var2;
      this.x0h = var3.dk4(this.p31());
   }

   public mew p31() {
      return new mew(S22PacketMultiBlockChange.vbp(this.mc0).kpy(this.zqe >> 12 & 15, this.zqe & 255, this.zqe >> 8 & 15));
   }

   public short ej7() {
      return this.zqe;
   }

   public zfz il5() {
      return this.x0h;
   }
}
