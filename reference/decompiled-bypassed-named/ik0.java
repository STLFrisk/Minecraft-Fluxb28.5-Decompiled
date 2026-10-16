import com.google.common.collect.Maps;
import java.util.Map;

public class ik0 {
   public final Map q48 = Maps.newConcurrentMap();

   public boolean ktg(l7l var1) {
      int var2 = OpaquePredicate.b();

      try {
         int var10000 = this.zgq(var1);
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   public boolean ha1(l7l param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield l7l.b4b Ll7l;
      // 08: ifnull 28
      // 0b: aload 0
      // 0c: aload 1
      // 0d: getfield l7l.b4b Ll7l;
      // 10: invokevirtual ik0.ktg (Ll7l;)Z
      // 13: iload 2
      // 14: ifne 29
      // 17: goto 1e
      // 1a: invokestatic ik0.a (Loov;)Loov;
      // 1d: athrow
      // 1e: ifeq 2c
      // 21: goto 28
      // 24: invokestatic ik0.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 1
      // 29: goto 2d
      // 2c: bipush 0
      // 2d: ireturn
   }

   public int hd1(l7l param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual ik0.ktg (Ll7l;)Z
      // 09: iload 2
      // 0a: ifeq 1e
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic ik0.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic ik0.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: istore 3
      // 1f: aload 1
      // 20: getfield l7l.b4b Ll7l;
      // 23: astore 4
      // 25: aload 4
      // 27: ifnull 57
      // 2a: aload 0
      // 2b: aload 4
      // 2d: invokevirtual ik0.ktg (Ll7l;)Z
      // 30: iload 2
      // 31: ifeq 58
      // 34: iload 2
      // 35: ifeq 58
      // 38: goto 3f
      // 3b: invokestatic ik0.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifne 57
      // 42: goto 49
      // 45: invokestatic ik0.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 4
      // 4b: getfield l7l.b4b Ll7l;
      // 4e: astore 4
      // 50: iinc 3 1
      // 53: iload 2
      // 54: ifne 25
      // 57: iload 3
      // 58: ireturn
   }

   public void _gw(ha9 param1, _ss param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: invokevirtual _ss.koi ()Z
      // 09: iload 4
      // 0b: ifne 33
      // 0e: ifeq 36
      // 11: goto 18
      // 14: invokestatic ik0.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 4
      // 1b: ifne 37
      // 1e: goto 25
      // 21: invokestatic ik0.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 2
      // 26: checkcast l7l
      // 29: invokevirtual ik0.ha1 (Ll7l;)Z
      // 2c: goto 33
      // 2f: invokestatic ik0.a (Loov;)Loov;
      // 32: athrow
      // 33: ifeq 43
      // 36: aload 0
      // 37: aload 1
      // 38: aload 2
      // 39: aload 0
      // 3a: aload 2
      // 3b: invokevirtual ik0.zgq (L_ss;)I
      // 3e: iload 3
      // 3f: iadd
      // 40: invokevirtual ik0.xzh (Lha9;L_ss;I)V
      // 43: return
   }

   public void xzh(ha9 var1, _ss var2, int var3) {
      int var4 = OpaquePredicate.b();
      blu var5 = (blu)this.q48.get(var2);

      blu var10000;
      label21: {
         label20: {
            try {
               var10000 = var5;
               if (var4 == 0) {
                  break label21;
               }

               if (var5 != null) {
                  break label20;
               }
            } catch (oov var6) {
               throw a(var6);
            }

            var5 = new blu();
            this.q48.put(var2, var5);
         }

         var10000 = var5;
      }

      var10000.uvg(var3);
   }

   public int zgq(_ss param1) {
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
      // 05: getfield ik0.q48 Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast blu
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 2a
      // 17: ifnonnull 29
      // 1a: goto 21
      // 1d: invokestatic ik0.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: goto 2d
      // 25: invokestatic ik0.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 3
      // 2a: invokevirtual blu.tsb ()I
      // 2d: ireturn
   }

   public lhm xna(_ss var1) {
      int var2 = OpaquePredicate.c();
      blu var3 = (blu)this.q48.get(var1);

      try {
         if (var2 != 0) {
            return var3.q12();
         }

         if (var3 == null) {
            return null;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3.q12();
   }

   public lhm guw(_ss var1, lhm var2) {
      int var3 = OpaquePredicate.c();
      blu var4 = (blu)this.q48.get(var1);

      blu var10000;
      label21: {
         label20: {
            try {
               var10000 = var4;
               if (var3 != 0) {
                  break label21;
               }

               if (var4 != null) {
                  break label20;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var4 = new blu();
            this.q48.put(var1, var4);
         }

         var10000 = var4;
      }

      var10000.jkb(var2);
      return var2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
