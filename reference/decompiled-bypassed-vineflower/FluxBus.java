import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public final class FluxBus implements Consumer {
   public static final FluxBus REG = new FluxBus(true);
   public static final FluxBus UNREG = new FluxBus(false);
   private final boolean reg;
   private static Method add;
   private static Method remove;
   private static Object lastWorld;
   private static int ticks;
   private static final Map modeCache = new HashMap();

   private FluxBus(boolean var1) {
      this.reg = var1;
   }

   public static void ensureConfig() {
      try {
         Class var0 = Class.forName("c05");
         Method var1 = var0.getDeclaredMethod("vz1");
         var1.setAccessible(true);
         Object var2 = var1.invoke(null);
         if (var2 == null) {
            return;
         }

         Field var3 = findField(var2.getClass(), "tij");
         if (var3 == null) {
            return;
         }

         Object var4 = var3.get(var2);
         if (var4 == null) {
            lastWorld = null;
            return;
         }

         if (var4 == lastWorld) {
            return;
         }

         lastWorld = var4;
         Class var5 = Class.forName("zwr");
         Field var6 = findFieldStatic(var5, "qkk");
         if (var6 == null) {
            return;
         }

         Object var7 = var6.get(null);
         if (var7 == null) {
            return;
         }

         Method var8 = var5.getDeclaredMethod("zj2");
         var8.setAccessible(true);
         var8.invoke(var7);
         Method var9 = var5.getDeclaredMethod("up0");
         var9.setAccessible(true);
         Object var10 = var9.invoke(var7);
         if (var10 == null) {
            return;
         }

         String[] var11 = new String[]{"a2k", "_k4"};

         for (int var12 = 0; var12 < var11.length; var12++) {
            Method var13 = var10.getClass().getDeclaredMethod(var11[var12]);
            var13.setAccessible(true);
            var13.invoke(var10);
         }
      } catch (Throwable var14) {
      }

      pollModes();
   }

   private static void pollModes() {
      ticks++;
      if (ticks % 20 == 0) {
         try {
            Class var0 = Class.forName("zwr");
            Field var1 = findField(var0, "qkk");
            Object var2 = var1 == null ? null : var1.get(null);
            if (var2 == null) {
               return;
            }

            Method var3 = var0.getDeclaredMethod("zj2");
            var3.setAccessible(true);
            Object var4 = var3.invoke(var2);
            Method var5 = var4.getClass().getDeclaredMethod("wau");
            var5.setAccessible(true);
            Object var6 = var5.invoke(var4);
            if (!(var6 instanceof List)) {
               return;
            }

            List var7 = (List)var6;

            for (int var8 = 0; var8 < var7.size(); var8++) {
               Object var9 = var7.get(var8);
               if (var9 != null) {
                  Field var10 = findField(var9.getClass(), "isg");
                  if (var10 != null) {
                     Object var11 = var10.get(var9);
                     if (var11 != null) {
                        Method var12 = var11.getClass().getMethod("d7c");
                        Object var13 = var12.invoke(var11);
                        String var14 = String.valueOf(var13);
                        Object var15 = modeCache.get(var9);
                        if (var15 == null) {
                           modeCache.put(var9, var14);
                        } else if (!var15.equals(var14)) {
                           modeCache.put(var9, var14);
                           sync(var9);
                        }
                     }
                  }
               }
            }
         } catch (Throwable var16) {
         }
      }
   }

   private static Field findFieldStatic(Class<?> var0, String var1) {
      return findField(var0, var1);
   }

   public static void modeChanged(Object var0) {
      if (var0 != null) {
         try {
            Object var1 = findField(var0.getClass(), "rn2") != null ? findField(var0.getClass(), "rn2").get(var0) : null;
            if (!(var1 instanceof String)) {
               return;
            }

            Class var2 = Class.forName("zwr");
            Field var3 = findField(var2, "qkk");
            Object var4 = var3 == null ? null : var3.get(null);
            if (var4 == null) {
               return;
            }

            Method var5 = var2.getDeclaredMethod("zj2");
            var5.setAccessible(true);
            Object var6 = var5.invoke(var4);
            Method var7 = var6.getClass().getDeclaredMethod("wau");
            var7.setAccessible(true);
            Object var8 = var7.invoke(var6);
            if (!(var8 instanceof List)) {
               return;
            }

            List var9 = (List)var8;

            for (int var10 = 0; var10 < var9.size(); var10++) {
               Object var11 = var9.get(var10);
               if (var11 != null) {
                  Field var12 = findField(var11.getClass(), "rb6");
                  if (var12 != null && var1.equals(var12.get(var11))) {
                     sync(var11);
                     return;
                  }
               }
            }
         } catch (Throwable var13) {
         }
      }
   }

   public static void sync(Object var0) {
      if (var0 != null) {
         try {
            Field var1 = findField(var0.getClass(), "iio");
            if (var1 == null) {
               return;
            }

            boolean var2 = var1.getBoolean(var0);
            Method var3 = Class.forName("ar7").getDeclaredMethod("ne2");
            var3.setAccessible(true);
            var3.invoke(var0);
            if (var2) {
               Method var4 = Class.forName("ar7").getDeclaredMethod("ron");
               var4.setAccessible(true);
               var4.invoke(var0);
            }
         } catch (Throwable var5) {
         }
      }
   }

   private static Field findField(Class<?> var0, String var1) {
      for (Class var2 = var0; var2 != null; var2 = var2.getSuperclass()) {
         try {
            Field var3 = var2.getDeclaredField(var1);
            var3.setAccessible(true);
            return var3;
         } catch (Throwable var4) {
         }
      }

      return null;
   }

   @Override
   public void accept(Object var1) {
      if (var1 != null) {
         try {
            Method var2 = this.reg ? add() : remove();
            if (var2 != null) {
               var2.invoke(null, var1);
            }
         } catch (Throwable var3) {
         }
      }
   }

   private static synchronized Method add() {
      if (add == null) {
         add = lookup("__x");
      }

      return add;
   }

   private static synchronized Method remove() {
      if (remove == null) {
         remove = lookup("mn9");
      }

      return remove;
   }

   private static Method lookup(String var0) {
      try {
         Method var1 = Class.forName("mtl").getDeclaredMethod(var0, Object.class);
         var1.setAccessible(true);
         return var1;
      } catch (Throwable var2) {
         return null;
      }
   }
}
