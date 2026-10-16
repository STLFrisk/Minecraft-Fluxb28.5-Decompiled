import java.io.ByteArrayOutputStream;

public class ylx$y96 extends ByteArrayOutputStream {
   private int zxl;
   private int qpl;
   public final ylx yfh;

   public ylx$y96(ylx var1, int var2, int var3) {
      super(8096);
      this.yfh = var1;
      this.zxl = var2;
      this.qpl = var3;
   }

   @Override
   public void close() {
      this.yfh.i3q(this.zxl, this.qpl, this.buf, this.count);
   }
}
