import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class zfj {
   public static int _db(Collection var0) {
      int var2 = 0;
      int var10000 = OpaquePredicate.b();
      Iterator var3 = var0.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            zfj$yuc var4 = (zfj$yuc)var3.next();
            var10000 = var2 + var4.ndz;
            if (var1 == 0) {
               break;
            }

            var2 = var10000;
            if (var1 != 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public static zfj$yuc fon(Random param0, Collection param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 24
      // 09: ifgt 1f
      // 0c: goto 13
      // 0f: invokestatic zfj.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: new java/lang/IllegalArgumentException
      // 16: dup
      // 17: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 1a: athrow
      // 1b: invokestatic zfj.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 2
      // 21: invokevirtual java/util/Random.nextInt (I)I
      // 24: istore 4
      // 26: aload 1
      // 27: iload 4
      // 29: invokestatic zfj.dgq (Ljava/util/Collection;I)Lzfj$yuc;
      // 2c: areturn
   }

   public static zfj$yuc dgq(Collection var0, int var1) {
      int var2 = OpaquePredicate.c();
      Iterator var3 = var0.iterator();

      zfj$yuc var10000;
      while (true) {
         if (var3.hasNext()) {
            var10000 = (zfj$yuc)var3.next();
            if (var2 != 0) {
               break;
            }

            zfj$yuc var4 = var10000;
            var1 -= var4.ndz;

            try {
               if (var1 < 0) {
                  return var4;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }

            if (var2 == 0) {
               continue;
            }
         }

         var10000 = (zfj$yuc)null;
         break;
      }

      return var10000;
   }

   public static zfj$yuc h82(Random var0, Collection var1) {
      return fon(var0, var1, _db(var1));
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
