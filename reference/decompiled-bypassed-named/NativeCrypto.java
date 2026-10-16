public class NativeCrypto {
   private char[] p52;
   private int fr4;
   private int hzv;
   private int[] nm5;

   public NativeCrypto(int var1) {
      this.m3n(var1);
   }

   public native void m3n(int var1);

   public native String jrp(byte[] var1);

   public native byte[] otn(String var1);

   private native byte hsw(byte[] var1, int var2);

   private native byte e2v(byte[] var1, int var2);

   private native byte[] uyt(byte[] var1, int var2, int var3);

   static {
      NativeLoader.verifyIntegrity(12);
   }
}
