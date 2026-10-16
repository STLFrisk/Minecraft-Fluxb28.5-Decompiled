package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class S14PacketEntity implements mz2 {
   public int t5v;
   public byte zgi;
   public byte nj5;
   public byte z3q;
   public byte ufq;
   public byte azt;
   public boolean ro5;
   public boolean wta;
   private static String a;
   private static final long b;
   private static final String c;

   public S14PacketEntity() {
   }

   public S14PacketEntity(int var1) {
      this.t5v = var1;
   }

   @Override
   public void ajj(nfj var1) {
      this.t5v = var1.gux();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.t5v);
   }

   public void klg(jsv var1) {
      var1.qlx(this);
   }

   @Override
   public String toString() {
      long var1 = b ^ 97592032687292L;
      return c + super.toString();
   }

   public i2h dgu(t9d var1) {
      return var1.oks(this.t5v);
   }

   public byte cjz() {
      return this.zgi;
   }

   public byte h2w() {
      return this.nj5;
   }

   public byte _m2() {
      return this.z3q;
   }

   public byte v4q() {
      return this.ufq;
   }

   public byte _xs() {
      return this.azt;
   }

   public boolean mqm() {
      return this.wta;
   }

   public boolean gf6() {
      return this.ro5;
   }

   @Override
   public void ito(yw3 var1) {
      this.klg((jsv)var1);
   }

   public static void b(String var0) {
      a = var0;
   }

   public static String b() {
      return a;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6678096046942972392L, 8714543021442007902L, MethodHandles.lookup().lookupClass()).a(13272490421606L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 119557504089250L;
      b("eWqU");
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("dÒ\u0097«R¤ E".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
