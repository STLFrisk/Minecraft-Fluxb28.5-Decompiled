package net.minecraft.client.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class Main$1 extends Authenticator {
   public final String mkq;
   public final String cev;

   public Main$1(String var1, String var2) {
      this.mkq = var1;
      this.cev = var2;
   }

   @Override
   public PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.mkq, this.cev.toCharArray());
   }
}
