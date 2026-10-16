import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public final class dbu$1 implements ParameterizedType {
   @Override
   public Type[] getActualTypeArguments() {
      return new Type[]{String.class, rv2.class};
   }

   @Override
   public Type getRawType() {
      return Map.class;
   }

   @Override
   public Type getOwnerType() {
      return null;
   }
}
