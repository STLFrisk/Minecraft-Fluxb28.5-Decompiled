import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class v8g implements z08 {
   public v8g(List var1, int var2, int var3, int var4, boolean var5) {
      this.i2w = var1;
      this.htm = var2;
      this.cgu = var3;
      this.c0_ = var4;
      this.q82 = var5;
   }

   public int i56() {
      return this.cgu;
   }

   public int n2m() {
      return this.htm;
   }

   public int kgk() {
      return this.i2w.size();
   }

   public int jxg() {
      return this.c0_;
   }

   public boolean wf_() {
      return this.q82;
   }

   private spe foq(int var1) {
      return (spe)this.i2w.get(var1);
   }

   public int ocq(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial v8g.foq (I)Lspe;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 28
      // 0f: invokevirtual spe.x1t ()Z
      // 12: ifeq 27
      // 15: goto 1c
      // 18: invokestatic v8g.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield v8g.c0_ I
      // 20: goto 2b
      // 23: invokestatic v8g.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 3
      // 28: invokevirtual spe.kko ()I
      // 2b: ireturn
   }

   public boolean mlt(int var1) {
      int var2 = OpaquePredicate.b();

      try {
         boolean var10000 = ((spe)this.i2w.get(var1)).x1t();
         if (var2 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public int _af(int var1) {
      return ((spe)this.i2w.get(var1)).o28();
   }

   public Set xbj() {
      HashSet var2 = Sets.newHashSet();
      int var10000 = OpaquePredicate.c();
      Iterator var3 = this.i2w.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            spe var4 = (spe)var3.next();

            try {
               var6 = var2;
               if (var1 != 0) {
                  break;
               }

               var2.add(var4.o28());
               if (var1 == 0) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
