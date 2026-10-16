import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class c6g$2$1 extends URLConnection {
   public final c6g$2 k5d;

   public c6g$2$1(c6g$2 var1, URL var2) {
      super(var2);
      this.k5d = var1;
   }

   @Override
   public void connect() {
   }

   @Override
   public InputStream getInputStream() {
      return c05.vz1().mpf().td5(this.k5d.t67).f_4();
   }
}
