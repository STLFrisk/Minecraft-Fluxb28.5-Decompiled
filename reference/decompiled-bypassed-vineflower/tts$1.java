import java.util.concurrent.Callable;

public class tts$1 implements Callable {
   public final int _ts;
   public final int d73;
   public final int luv;
   public final tts z30;

   public tts$1(tts var1, int var2, int var3, int var4) {
      this.z30 = var1;
      this._ts = var2;
      this.d73 = var3;
      this.luv = var4;
   }

   public String call() {
      return wsc.ffw(new mew(this.z30.nzx * 16 + this._ts, this.d73, this.z30.yxl * 16 + this.luv));
   }

   @Override
   public Object call() {
      return this.call();
   }
}
