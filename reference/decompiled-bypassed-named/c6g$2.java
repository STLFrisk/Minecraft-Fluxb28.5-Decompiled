import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public final class c6g$2 extends URLStreamHandler {
   public final gdz t67;

   public c6g$2(gdz var1) {
      this.t67 = var1;
   }

   @Override
   public URLConnection openConnection(URL var1) {
      return new c6g$2$1(this, var1);
   }
}
