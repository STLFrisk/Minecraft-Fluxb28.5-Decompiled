import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SubEngine {
   private String oo3;
   private String k0c;
   private boolean d8h;
   public Minecraft wyl;
   public int u2v;
   private static final long b;
   private static final String c;

   public SubEngine(String var1, String var2) {
      long var3 = b ^ 71147361592052L;
      super();
      this.wyl = Minecraft.vz1();
      this.oo3 = var1;
      this.k0c = var2;
      this.setOwner(c);
   }

   public native void setOwner(String var1);

   public native void onUpdate();

   public native void onRender();

   public native int registerNative(String var1, String var2);

   public native void setActive(boolean var1);

   public String getName() {
      return this.oo3;
   }

   public String getDescription() {
      return this.k0c;
   }

   public void e2i(String var1) {
      this.oo3 = var1;
   }

   public void q6n(String var1) {
      this.k0c = var1;
   }

   public boolean prepare() {
      return this.d8h;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2746291753642583472L, 4123409752184200712L, MethodHandles.lookup().lookupClass()).a(5646817552717L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 109994163669961L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0015Ýu\u0089¼\b'\u0010".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
      NativeLoader.verifyIntegrity(7);
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
