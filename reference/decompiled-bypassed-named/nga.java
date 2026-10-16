import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

public class nga extends c8g implements gjv {
   public final x_0 y1o = new x_0();
   public final Map z9i = ((BiMap)this.jvn).inverse();

   public void pk2(int var1, Object var2, Object var3) {
      this.y1o.gzd(var3, var1);
      this.emn(var2, var3);
   }

   @Override
   public Map tn6() {
      return HashBiMap.create();
   }

   @Override
   public Object _gz(Object var1) {
      return super._gz(var1);
   }

   public Object csx(Object var1) {
      return this.z9i.get(var1);
   }

   @Override
   public boolean vqt(Object var1) {
      return super.vqt(var1);
   }

   public int fbj(Object var1) {
      return this.y1o.zt5(var1);
   }

   public Object ju3(int var1) {
      return this.y1o.gcd(var1);
   }

   @Override
   public Iterator iterator() {
      return this.y1o.iterator();
   }
}
