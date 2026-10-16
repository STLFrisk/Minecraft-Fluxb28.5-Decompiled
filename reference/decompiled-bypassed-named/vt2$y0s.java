import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;

public enum vt2$y0s implements Predicate, v4k {
   public static final vt2$y0s wvd = new vt2$y0s("x", vt2$unz.fzl);
   public static final vt2$y0s abn = new vt2$y0s("y", vt2$unz.vrc);
   public static final vt2$y0s EntitySpider = new vt2$y0s("z", vt2$unz.fzl);
   private static final Map ndu = Maps.newHashMap();
   private final String ucp;
   private final vt2$unz ho_;
   private static final vt2$y0s[] r3y = new vt2$y0s[]{wvd, abn, EntitySpider};

   private vt2$y0s(String var3, vt2$unz var4) {
      this.ucp = var3;
      this.ho_ = var4;
   }

   public static vt2$y0s we_(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 27
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic vt2$y0s.a (Loov;)Loov;
      // 12: athrow
      // 13: aconst_null
      // 14: goto 2a
      // 17: invokestatic vt2$y0s.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic vt2$y0s.ndu Ljava/util/Map;
      // 1e: aload 0
      // 1f: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 22: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 27: checkcast vt2$y0s
      // 2a: areturn
   }

   public String pyb() {
      return this.ucp;
   }

   public boolean juw() {
      try {
         if (this.ho_ == vt2$unz.vrc) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean pyt() {
      try {
         if (this.ho_ == vt2$unz.fzl) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   @Override
   public String toString() {
      return this.ucp;
   }

   public boolean sl7(vt2 var1) {
      int var2 = OpaquePredicate.c();

      vt2 var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000.e30() == this) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public vt2$unz yop() {
      return this.ho_;
   }

   @Override
   public String mo3() {
      return this.ucp;
   }

   public boolean apply(Object var1) {
      return this.sl7((vt2)var1);
   }

   static {
      for (vt2$y0s var3 : values()) {
         ndu.put(var3.pyb().toLowerCase(), var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
