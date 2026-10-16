package net.minecraft.network.login.server;

import java.security.PublicKey;

public class S01PacketEncryptionRequest implements mz2 {
   public S01PacketEncryptionRequest() {
   }

   public S01PacketEncryptionRequest(String var1, PublicKey var2, byte[] var3) {
      this.gwn = var1;
      this.fee = var2;
      this.smf = var3;
   }

   @Override
   public void ajj(nfj var1) {
      this.gwn = var1.oa5(20);
      this.fee = vk8.n13(var1.z7_());
      this.smf = var1.z7_();
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.gwn);
      var1.a4q(this.fee.getEncoded());
      var1.a4q(this.smf);
   }

   public void vow(ryn var1) {
      var1.gtz(this);
   }

   public String lx5() {
      return this.gwn;
   }

   public PublicKey yba() {
      return this.fee;
   }

   public byte[] kck() {
      return this.smf;
   }

   @Override
   public void ito(yw3 var1) {
      this.vow((ryn)var1);
   }
}
