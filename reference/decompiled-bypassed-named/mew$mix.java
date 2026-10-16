public final class mew$mix extends mew {
   private int lmm;
   private int rs_;
   private int k9r;

   public mew$mix() {
      this(0, 0, 0);
   }

   public mew$mix(int var1, int var2, int var3) {
      super(0, 0, 0);
      this.lmm = var1;
      this.rs_ = var2;
      this.k9r = var3;
   }

   @Override
   public int getX() {
      return this.lmm;
   }

   @Override
   public int getY() {
      return this.rs_;
   }

   @Override
   public int getZ() {
      return this.k9r;
   }

   public mew$mix bj0(int var1, int var2, int var3) {
      this.lmm = var1;
      this.rs_ = var2;
      this.k9r = var3;
      return this;
   }

   @Override
   public wgo ufc(wgo var1) {
      return super.ufc(var1);
   }

   public static int zvf(mew$mix var0, int var1) {
      return var0.lmm = var1;
   }

   public static int jir(mew$mix var0, int var1) {
      return var0.rs_ = var1;
   }

   public static int irw(mew$mix var0, int var1) {
      return var0.k9r = var1;
   }
}
