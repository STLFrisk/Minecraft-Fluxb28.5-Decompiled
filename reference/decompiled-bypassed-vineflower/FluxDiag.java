import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class FluxDiag implements Runnable {
   private static final String OUT = "flux-diag.txt";
   private static final int ROUNDS = 900;
   private static final String[] INTEREST = new String[]{"Fly", "Speed", "KillAura", "Scaffold", "Velocity", "Sprint"};
   private static Object lastWorld;
   private static boolean modesApplied;

   @Override
   public void run() {
      loop();
   }

   public static void start() {
   }

   private static void ensureConfigLoaded() {
      try {
         Class var12 = Class.forName("zwr");
         Class var1 = Class.forName("c05");
         Method var2 = var1.getDeclaredMethod("vz1");
         var2.setAccessible(true);
         Object var3 = var2.invoke(null);
         Object var4 = fieldAny(var3, "tij");
         if (var4 == null) {
            lastWorld = null;
            return;
         }

         if (var4 == lastWorld) {
            return;
         }

         lastWorld = var4;
         Object var5 = staticObj(var12, "qkk");
         call(var5, "zj2");
         Object var6 = call(var5, "up0");
         if (var6 == null) {
            return;
         }

         for (int var7 = 0; var7 < 2; var7++) {
            String var8 = var7 == 0 ? "a2k" : "_k4";
            Method var9 = var6.getClass().getDeclaredMethod(var8);
            var9.setAccessible(true);
            var9.invoke(var6);
         }

         write("* config re-applied for a new world: a2k() then _k4()\n");
      } catch (Throwable var11) {
         Throwable var0 = var11;

         try {
            write("* config re-apply failed: " + var0 + "\n");
         } catch (Throwable var10) {
         }
      }
   }

   private static void applyModesOnce() {
      if (!modesApplied) {
         StringBuilder var0 = new StringBuilder();

         try {
            File var1 = new File("flux/prs-hypixel_best_config.txt");
            if (!var1.exists()) {
               var1 = new File("prs-hypixel_best_config.txt");
            }

            if (!var1.exists()) {
               return;
            }

            BufferedReader var2 = new BufferedReader(new InputStreamReader(new FileInputStream(var1), "UTF-8"));
            ArrayList var3 = new ArrayList();

            String var4;
            while ((var4 = var2.readLine()) != null) {
               var3.add(var4);
            }

            var2.close();
            Object var5 = staticObj(Class.forName("zwr"), "qkk");
            Object var6 = call(var5, "zj2");
            Object var7 = call(var6, "wau");
            if (!(var7 instanceof List)) {
               return;
            }

            List var8 = (List)var7;

            for (int var9 = 0; var9 < var8.size(); var9++) {
               Object var10 = var8.get(var9);
               if (var10 != null) {
                  Object var11 = fieldAny(var10, "rb6");
                  Object var12 = fieldAny(var10, "isg");
                  if (var11 != null && var12 != null) {
                     String var13 = "s#" + var11 + ":Mode:";

                     for (int var14 = 0; var14 < var3.size(); var14++) {
                        String var15 = (String)var3.get(var14);
                        if (var15.startsWith(var13)) {
                           String var16 = var15.substring(var13.length());
                           Object var17 = call(var12, "d7c");
                           var0.append("* mode ").append(var11).append(": ").append(var17).append(" -> ").append(var16).append('\n');
                           if (!var16.equals(String.valueOf(var17))) {
                              Method var18 = var12.getClass().getDeclaredMethod("n1j", String.class);
                              var18.setAccessible(true);
                              var18.invoke(var12, var16);
                              Object var19 = call(var5, "up0");
                              if (var19 != null) {
                                 Method var20 = var19.getClass().getDeclaredMethod("_k4");
                                 var20.setAccessible(true);
                                 var20.invoke(var19);
                              }
                           }
                        }
                     }
                  }
               }
            }

            modesApplied = true;
         } catch (Throwable var21) {
            var0.append("* applyModes failed: ").append(var21).append('\n');
         }

         write(var0.toString());
      }
   }

   private static void loop() {
      for (int var0 = 0; var0 < 900; var0++) {
         StringBuilder var1 = new StringBuilder();
         var1.append("=== FluxDiag round ").append(var0).append(" ===\n");

         try {
            applyModesOnce();
            dump(var1);
            ensureConfigLoaded();
         } catch (Throwable var4) {
            var1.append("DUMP ERROR ").append(var4).append('\n');
         }

         write(var1.toString());

         try {
            Thread.sleep(2000L);
         } catch (InterruptedException var3) {
            return;
         }
      }
   }

   private static void dump(StringBuilder var0) throws Exception {
      Class var1 = Class.forName("zwr");
      Object var2 = staticObj(var1, "qkk");
      var0.append("zwr.qkk          = ").append(var2).append('\n');
      Object var3 = null;
      if (var2 != null) {
         var3 = call(var2, "zj2");
         var0.append("zwr.qkk.zj2()    = ").append(var3).append('\n');
      }

      Class var4 = Class.forName("u1p");
      var0.append("u1p.jcs          = ").append(staticInt(var4, "jcs")).append('\n');
      Class var5 = Class.forName("ar7");
      var0.append("ar7.vlm          = ").append(staticInt(var5, "vlm")).append('\n');
      Class var6 = Class.forName("c05");
      Object var7 = callStatic(var6, "vz1");
      Object var8 = var7 == null ? null : fieldAny(var7, "tij");
      var0.append("c05.vz1().tij    = ").append(var8).append('\n');
      var0.append("zwr.bxb.d7c()    = ").append(call(staticObj(var1, "bxb"), "d7c")).append('\n');
      Class var9 = Class.forName("mtl");
      Object var10 = staticObj(var9, "yh7");
      if (var10 instanceof Map) {
         Map var11 = (Map)var10;
         var0.append("mtl.yh7 (bus)    = ").append(var11.size()).append(" event types\n");

         for (Entry var13 : var11.entrySet()) {
            Object var14 = var13.getValue();
            int var15 = var14 instanceof List ? ((List)var14).size() : -1;
            var0.append("    ").append(name(var13.getKey())).append("  listeners=").append(var15).append('\n');
            if (var14 instanceof List) {
               List var16 = (List)var14;

               for (int var17 = 0; var17 < var16.size(); var17++) {
                  Object var18 = var16.get(var17);
                  Object var19 = call(var18, "tss");
                  if (var19 instanceof Method) {
                     Method var20 = (Method)var19;
                     String var21 = var20.getDeclaringClass().getName();
                     if ("fyk".equals(var21) || "xbs".equals(var21) || "j1s".equals(var21)) {
                        Object var22 = call(var18, "_5a");
                        var0.append("        HOOK ")
                           .append(var21)
                           .append("  event=")
                           .append(name(var13.getKey()))
                           .append("  method=")
                           .append(var20.getName())
                           .append('(')
                           .append(types(var20))
                           .append(')')
                           .append("  on=")
                           .append(var22 == null ? "null" : var22.getClass().getName())
                           .append('\n');
                     }
                  }
               }
            }
         }
      }

      if (var3 == null) {
         var0.append("!! no registry: zj2() returned null\n");
      } else {
         Object var23 = call(var3, "wau");
         if (!(var23 instanceof List)) {
            var0.append("!! wau() did not return a List: ").append(var23).append('\n');
         } else {
            List var24 = (List)var23;
            int var25 = 0;
            var0.append("registry size    = ").append(var24.size()).append('\n');
            var0.append("---- modules ----\n");

            for (Object var27 : var24) {
               if (var27 == null) {
                  var0.append("    <null module in registry>\n");
               } else {
                  Object var28 = fieldAny(var27, "iio");
                  if (Boolean.TRUE.equals(var28)) {
                     var25++;
                  }

                  String var29 = String.valueOf(fieldAny(var27, "rb6"));
                  String var30 = String.valueOf(fieldAny(var27, "k9o"));
                  var0.append("    ")
                     .append(pad(var27.getClass().getName(), 8))
                     .append(" name=")
                     .append(pad(var29, 18))
                     .append(" enabled=")
                     .append(var28)
                     .append(" key=")
                     .append(call(var27, "x_i"))
                     .append("  desc=")
                     .append(var30)
                     .append('\n');
                  if (interesting(var29) || interesting(var27.getClass().getName())) {
                     dumpSettings(var0, var27);
                  }
               }
            }

            var0.append("enabled modules  = ").append(var25).append('\n');
            var0.append("zwr.up0() (szk)  = ").append(var2 == null ? null : call(var2, "up0")).append('\n');
            dumpAuraInputs(var0, var24, var8);
         }
      }
   }

   private static void dumpAuraInputs(StringBuilder var0, List<?> var1, Object var2) {
      var0.append("---- aura inputs ----\n");

      try {
         Class var3 = Class.forName("xbs");
         Object var4 = staticObj(var3, "lo6");
         Object var5 = staticObj(var3, "mrm");
         var0.append("xbs.lo6          = ").append(listInfo(var4)).append('\n');
         var0.append("xbs.mrm          = ").append(listInfo(var5)).append('\n');
         var0.append("fyk.kfa (target) = ").append(staticObj(Class.forName("fyk"), "kfa")).append('\n');
         var0.append("fyk.kfa declared in = ").append(Class.forName("fyk").getDeclaredField("kfa").getType().getName()).append('\n');
      } catch (Throwable var12) {
         var0.append("xbs probe error  = ").append(var12).append('\n');
      }

      Object var16 = fieldAny(var2, "guf");
      if (var16 instanceof List) {
         List var17 = (List)var16;
         var0.append("c05.tij.guf      = List size=").append(var17.size()).append('\n');
         int var19 = 0;

         for (int var6 = 0; var6 < var17.size() && var19 < 12; var6++) {
            Object var7 = var17.get(var6);
            var0.append("    [").append(var6).append("] ").append(var7 == null ? "null" : var7.getClass().getName()).append('\n');
            var19++;
         }
      } else {
         var0.append("c05.tij.guf      = ").append(var16).append('\n');
      }

      Object var18 = null;

      for (int var20 = 0; var20 < var1.size(); var20++) {
         Object var22 = var1.get(var20);
         if (var22 != null && "fyk".equals(var22.getClass().getName())) {
            var18 = var22;
            break;
         }
      }

      if (var18 == null) {
         var0.append("fyk (KillAura)   = not in registry\n");
      } else {
         var0.append("---- fyk (KillAura) fields ----\n");
         Object var21 = fieldAny(var18, "_w6");
         if (var21 instanceof List) {
            List var23 = (List)var21;
            var0.append("fyk._w6 (engines) = size ").append(var23.size()).append('\n');

            for (int var26 = 0; var26 < var23.size(); var26++) {
               Object var8 = var23.get(var26);
               var0.append("    [")
                  .append(var26)
                  .append("] ")
                  .append(var8 == null ? "null" : var8.getClass().getName())
                  .append("  name=")
                  .append(var8 == null ? "-" : call(var8, "zkf"))
                  .append("  desc=")
                  .append(var8 == null ? "-" : call(var8, "e0r"))
                  .append('\n');
            }
         }

         try {
            Method var24 = Class.forName("ar7").getDeclaredMethod("tb8", String.class);
            var24.setAccessible(true);
            String[] var27 = new String[]{"Switch", "Single", "Multi", "Vanilla", "Hypixel"};

            for (int var29 = 0; var29 < var27.length; var29++) {
               var0.append("    tb8(\"").append(var27[var29]).append("\") = ").append(var24.invoke(var18, var27[var29])).append('\n');
            }
         } catch (Throwable var15) {
            var0.append("    tb8 probe failed: ").append(var15).append('\n');
         }

         for (Class var25 = var18.getClass(); var25 != null; var25 = var25.getSuperclass()) {
            Field[] var28;
            try {
               var28 = var25.getDeclaredFields();
            } catch (Throwable var14) {
               continue;
            }

            for (int var30 = 0; var30 < var28.length; var30++) {
               String var9 = var28[var30].getName();
               if (var9.length() == 3) {
                  Object var10;
                  try {
                     var28[var30].setAccessible(true);
                     var10 = var28[var30].get(var18);
                  } catch (Throwable var13) {
                     continue;
                  }

                  if (var10 == null) {
                     var0.append("    fyk.").append(var9).append(" = null\n");
                  } else if (isSetting(var10.getClass())) {
                     var0.append("    fyk.")
                        .append(var9)
                        .append(" = ")
                        .append(var10.getClass().getName())
                        .append("[")
                        .append(settingName(var10))
                        .append("]")
                        .append("=")
                        .append(settingValue(var10))
                        .append("  raw=")
                        .append(fieldAny(var10, "ktv"))
                        .append('\n');
                  } else {
                     var0.append("    fyk.").append(var9).append(" = ").append(var10.getClass().getName()).append('\n');
                  }
               }
            }
         }
      }
   }

   private static void dumpSettings(StringBuilder var0, Object var1) {
      int var2 = 0;

      for (Class var3 = var1.getClass(); var3 != null; var3 = var3.getSuperclass()) {
         Field[] var4;
         try {
            var4 = var3.getDeclaredFields();
         } catch (Throwable var10) {
            continue;
         }

         for (int var5 = 0; var5 < var4.length; var5++) {
            Field var6 = var4[var5];

            Object var7;
            try {
               var6.setAccessible(true);
               var7 = var6.get(var1);
            } catch (Throwable var9) {
               continue;
            }

            if (var7 != null) {
               String var8 = var7.getClass().getName();
               if (isSetting(var7.getClass())) {
                  var0.append("        .")
                     .append(var6.getName())
                     .append("  a=")
                     .append(fieldAny(var7, "rn2"))
                     .append("  b=")
                     .append(fieldAny(var7, "h4c"))
                     .append("  value=")
                     .append(fieldAny(var7, "ktv"))
                     .append('\n');
                  var2++;
               }
            }
         }
      }

      if (var2 == 0) {
         var0.append("        (no cn7 fields)\n");
      }
   }

   private static String settingName(Object var0) {
      Object var1 = fieldAny(var0, "h4c");
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         var1 = fieldAny(var0, "rn2");
         if (var1 instanceof String) {
            return (String)var1;
         } else {
            var1 = call(var0, "fht");
            return var1 instanceof String ? (String)var1 : String.valueOf(var1);
         }
      }
   }

   private static String settingValue(Object var0) {
      Object var1 = call(var0, "d7c");
      return var1 != null && !String.valueOf(var1).startsWith("<") ? String.valueOf(var1) : String.valueOf(fieldAny(var0, "ktv"));
   }

   private static boolean isSetting(Class<?> var0) {
      try {
         Class var1 = Class.forName("dzm");
         if (var1.isAssignableFrom(var0)) {
            return true;
         }
      } catch (Throwable var2) {
      }

      return "cn7".equals(var0.getName()) || "dzm".equals(var0.getName()) || "crk".equals(var0.getName());
   }

   private static String listInfo(Object var0) {
      if (!(var0 instanceof List)) {
         return String.valueOf(var0);
      } else {
         List var1 = (List)var0;
         StringBuilder var2 = new StringBuilder("List size=").append(var1.size());

         for (int var3 = 0; var3 < var1.size() && var3 < 4; var3++) {
            Object var4 = var1.get(var3);
            var2.append("  [").append(var3).append("]=").append(var4 == null ? "null" : var4.getClass().getName());
         }

         return var2.toString();
      }
   }

   private static String types(Method var0) {
      Class[] var1;
      try {
         var1 = var0.getParameterTypes();
      } catch (Throwable var4) {
         return "?";
      }

      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var3 > 0) {
            var2.append(',');
         }

         var2.append(var1[var3].getName());
      }

      return var2.toString();
   }

   private static boolean interesting(String var0) {
      if (var0 == null) {
         return false;
      } else {
         for (int var1 = 0; var1 < INTEREST.length; var1++) {
            if (var0.indexOf(INTEREST[var1]) >= 0) {
               return true;
            }
         }

         return false;
      }
   }

   private static String pad(String var0, int var1) {
      if (var0 == null) {
         var0 = "null";
      }

      while (var0.length() < var1) {
         var0 = var0 + " ";
      }

      return var0;
   }

   private static String name(Object var0) {
      if (var0 == null) {
         return "null";
      } else {
         return var0 instanceof Class ? ((Class)var0).getName() : var0.getClass().getName();
      }
   }

   private static Object callStatic(Class<?> var0, String var1) {
      try {
         Method var2 = var0.getDeclaredMethod(var1);
         var2.setAccessible(true);
         return var2.invoke(null);
      } catch (Throwable var3) {
         return "<" + var3 + ">";
      }
   }

   private static Object call(Object var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         Class var2 = var0.getClass();

         while (var2 != null) {
            try {
               Method var3 = var2.getDeclaredMethod(var1);
               var3.setAccessible(true);
               return var3.invoke(var0);
            } catch (NoSuchMethodException var4) {
               var2 = var2.getSuperclass();
            } catch (Throwable var5) {
               return "<" + var5 + ">";
            }
         }

         return "<no method " + var1 + ">";
      }
   }

   private static Object fieldAny(Object var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         Class var2 = var0.getClass();

         while (var2 != null) {
            try {
               Field var3 = var2.getDeclaredField(var1);
               var3.setAccessible(true);
               return var3.get(var0);
            } catch (NoSuchFieldException var4) {
               var2 = var2.getSuperclass();
            } catch (Throwable var5) {
               return "<" + var5 + ">";
            }
         }

         return "<no field " + var1 + ">";
      }
   }

   private static Object staticObj(Class<?> var0, String var1) {
      try {
         Field var2 = var0.getDeclaredField(var1);
         var2.setAccessible(true);
         return var2.get(null);
      } catch (Throwable var3) {
         return "<" + var3 + ">";
      }
   }

   private static int staticInt(Class<?> var0, String var1) {
      try {
         Field var2 = var0.getDeclaredField(var1);
         var2.setAccessible(true);
         return var2.getInt(null);
      } catch (Throwable var3) {
         return -999;
      }
   }

   private static void write(String var0) {
      PrintWriter var1 = null;

      try {
         var1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File("flux-diag.txt")), "UTF-8"));
         var1.print(var0);
      } catch (Throwable var6) {
      } finally {
         if (var1 != null) {
            var1.close();
         }
      }
   }

   static {
      Thread var0 = new Thread(new FluxDiag(), "FluxDiag");
      var0.setDaemon(true);
      var0.start();
   }
}
