import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventBus {
   private static final Map yh7 = new HashMap();

   private EventBus() {
   }

   public static void register(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 04: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 07: astore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: aload 2
      // 0c: arraylength
      // 0d: istore 3
      // 0e: bipush 0
      // 0f: istore 4
      // 11: istore 1
      // 12: iload 4
      // 14: iload 3
      // 15: if_icmpge 45
      // 18: aload 2
      // 19: iload 4
      // 1b: aaload
      // 1c: astore 5
      // 1e: aload 5
      // 20: iload 1
      // 21: ifeq 3a
      // 24: invokestatic EventBus.nnj (Ljava/lang/reflect/Method;)Z
      // 27: ifeq 38
      // 2a: goto 31
      // 2d: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: goto 3e
      // 34: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 5
      // 3a: aload 0
      // 3b: invokestatic EventBus.invokeHandler (Ljava/lang/reflect/Method;Ljava/lang/Object;)V
      // 3e: iinc 4 1
      // 41: iload 1
      // 42: ifne 12
      // 45: return
   }

   public static void ohb(Object param0, Class param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 04: invokevirtual java/lang/Class.getDeclaredMethods ()[Ljava/lang/reflect/Method;
      // 07: astore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 3
      // 0c: arraylength
      // 0d: istore 4
      // 0f: istore 2
      // 10: bipush 0
      // 11: istore 5
      // 13: iload 5
      // 15: iload 4
      // 17: if_icmpge 48
      // 1a: aload 3
      // 1b: iload 5
      // 1d: aaload
      // 1e: astore 6
      // 20: aload 6
      // 22: aload 1
      // 23: iload 2
      // 24: ifne 3e
      // 27: invokestatic EventBus.jyx (Ljava/lang/reflect/Method;Ljava/lang/Class;)Z
      // 2a: ifeq 3b
      // 2d: goto 34
      // 30: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: goto 41
      // 37: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 6
      // 3d: aload 0
      // 3e: invokestatic EventBus.invokeHandler (Ljava/lang/reflect/Method;Ljava/lang/Object;)V
      // 41: iinc 5 1
      // 44: iload 2
      // 45: ifeq 13
      // 48: return
   }

   public static void unregister(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic EventBus.yh7 Ljava/util/Map;
      // 07: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 11: astore 2
      // 12: aload 2
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 7a
      // 1b: aload 2
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast java/util/List
      // 24: astore 3
      // 25: iload 1
      // 26: ifeq 7e
      // 29: aload 3
      // 2a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 4
      // 31: aload 4
      // 33: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 38: ifeq 76
      // 3b: aload 4
      // 3d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 42: checkcast EventBus$Handler
      // 45: astore 5
      // 47: aload 5
      // 49: invokevirtual EventBus$Handler.getTarget ()Ljava/lang/Object;
      // 4c: aload 0
      // 4d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 50: iload 1
      // 51: ifeq 18
      // 54: iload 1
      // 55: ifeq 71
      // 58: ifeq 72
      // 5b: goto 62
      // 5e: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61: athrow
      // 62: aload 3
      // 63: aload 5
      // 65: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 6a: goto 71
      // 6d: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 70: athrow
      // 71: pop
      // 72: iload 1
      // 73: ifne 31
      // 76: iload 1
      // 77: ifne 12
      // 7a: bipush 1
      // 7b: invokestatic EventBus.lbd (Z)V
      // 7e: return
   }

   public static void bej(Object param0, Class param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic EventBus.yh7 Ljava/util/Map;
      // 07: aload 1
      // 08: iload 2
      // 09: ifeq 26
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: ifeq 8d
      // 14: goto 1b
      // 17: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: getstatic EventBus.yh7 Ljava/util/Map;
      // 1e: aload 1
      // 1f: goto 26
      // 22: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b: checkcast java/util/List
      // 2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 33: astore 3
      // 34: aload 3
      // 35: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3a: ifeq 89
      // 3d: aload 3
      // 3e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 43: checkcast EventBus$Handler
      // 46: astore 4
      // 48: aload 4
      // 4a: invokevirtual EventBus$Handler.getTarget ()Ljava/lang/Object;
      // 4d: aload 0
      // 4e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 51: iload 2
      // 52: ifeq 8a
      // 55: iload 2
      // 56: ifeq 84
      // 59: goto 60
      // 5c: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f: athrow
      // 60: ifeq 85
      // 63: goto 6a
      // 66: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: getstatic EventBus.yh7 Ljava/util/Map;
      // 6d: aload 1
      // 6e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 73: checkcast java/util/List
      // 76: aload 4
      // 78: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 7d: goto 84
      // 80: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 83: athrow
      // 84: pop
      // 85: iload 2
      // 86: ifne 34
      // 89: bipush 1
      // 8a: invokestatic EventBus.lbd (Z)V
      // 8d: return
   }

   private static void invokeHandler(Method param0, Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 04: bipush 0
      // 05: aaload
      // 06: astore 3
      // 07: invokestatic OpaquePredicate.c ()I
      // 0a: new EventBus$Handler
      // 0d: dup
      // 0e: aload 1
      // 0f: aload 0
      // 10: aload 0
      // 11: ldc EventHandler
      // 13: nop
      // 14: invokevirtual java/lang/reflect/Method.getAnnotation (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
      // 17: checkcast EventHandler
      // 1a: invokeinterface EventHandler.jn1 ()B 1
      // 1f: invokespecial EventBus$Handler.<init> (Ljava/lang/Object;Ljava/lang/reflect/Method;B)V
      // 22: astore 4
      // 24: istore 2
      // 25: aload 4
      // 27: invokevirtual EventBus$Handler.getMethod ()Ljava/lang/reflect/Method;
      // 2a: invokevirtual java/lang/reflect/Method.isAccessible ()Z
      // 2d: iload 2
      // 2e: ifne 5f
      // 31: ifne 4b
      // 34: goto 3b
      // 37: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 4
      // 3d: invokevirtual EventBus$Handler.getMethod ()Ljava/lang/reflect/Method;
      // 40: bipush 1
      // 41: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 44: goto 4b
      // 47: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: getstatic EventBus.yh7 Ljava/util/Map;
      // 4e: aload 3
      // 4f: iload 2
      // 50: ifne b8
      // 53: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 58: goto 5f
      // 5b: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e: athrow
      // 5f: ifeq ad
      // 62: getstatic EventBus.yh7 Ljava/util/Map;
      // 65: aload 3
      // 66: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6b: checkcast java/util/List
      // 6e: aload 4
      // 70: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 75: iload 2
      // 76: ifne a4
      // 79: goto 80
      // 7c: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7f: athrow
      // 80: ifne c7
      // 83: goto 8a
      // 86: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 89: athrow
      // 8a: getstatic EventBus.yh7 Ljava/util/Map;
      // 8d: aload 3
      // 8e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 93: checkcast java/util/List
      // 96: aload 4
      // 98: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9d: goto a4
      // a0: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a3: athrow
      // a4: pop
      // a5: aload 3
      // a6: invokestatic EventBus.lgh (Ljava/lang/Class;)V
      // a9: iload 2
      // aa: ifeq c7
      // ad: getstatic EventBus.yh7 Ljava/util/Map;
      // b0: aload 3
      // b1: goto b8
      // b4: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // b7: athrow
      // b8: new mtl$1
      // bb: dup
      // bc: aload 4
      // be: invokespecial mtl$1.<init> (Lmtl$_2w;)V
      // c1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // c6: pop
      // c7: return
   }

   public static void ues(Class var0) {
      int var1 = OpaquePredicate.b();
      Iterator var2 = yh7.entrySet().iterator();

      while (var2.hasNext()) {
         Object var10000 = ((Entry)var2.next()).getKey();

         while (((Class)var10000).equals(var0)) {
            var10000 = var2;
            if (var1 != 0) {
               var2.remove();
               return;
            }
         }
      }
   }

   public static void lbd(boolean param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic EventBus.yh7 Ljava/util/Map;
      // 07: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 11: astore 2
      // 12: aload 2
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 5f
      // 1b: iload 0
      // 1c: iload 1
      // 1d: ifne 52
      // 20: ifeq 55
      // 23: goto 2a
      // 26: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: aload 2
      // 2b: iload 1
      // 2c: ifne 56
      // 2f: goto 36
      // 32: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b: checkcast java/util/Map$Entry
      // 3e: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 43: checkcast java/util/List
      // 46: invokeinterface java/util/List.isEmpty ()Z 1
      // 4b: goto 52
      // 4e: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51: athrow
      // 52: ifeq 12
      // 55: aload 2
      // 56: invokeinterface java/util/Iterator.remove ()V 1
      // 5b: iload 1
      // 5c: ifeq 12
      // 5f: return
   }

   private static void lgh(Class var0) {
      CopyOnWriteArrayList var2 = new CopyOnWriteArrayList();
      byte[] var3 = uc2.zyb;
      int var10000 = OpaquePredicate.c();
      int var4 = var3.length;
      int var5 = 0;
      int var1 = var10000;

      label57:
      while (true) {
         var10000 = var5;
         int var10001 = var4;

         label54:
         while (var10000 < var10001) {
            byte var6 = var3[var5];
            Iterator var12 = ((List)yh7.get(var0)).iterator();
            if (var1 != 0) {
               return;
            }

            Iterator var7 = var12;

            while (var7.hasNext()) {
               EventBus$Handler var8 = (EventBus$Handler)var7.next();

               label47: {
                  try {
                     var10000 = var8.k51();
                     if (var1 != 0) {
                        break label47;
                     }

                     var10001 = var6;
                     if (var1 != 0) {
                        continue label54;
                     }
                  } catch (IllegalArgumentException var10) {
                     throw a(var10);
                  }

                  try {
                     if (var10000 == var10001) {
                        var2.add(var8);
                     }
                  } catch (IllegalArgumentException var9) {
                     throw a(var9);
                  }
               }

               if (var1 != 0) {
                  break;
               }
            }

            var5++;
            if (var1 == 0) {
               continue label57;
            }
            break;
         }

         yh7.put(var0, var2);
         return;
      }
   }

   private static boolean nnj(Method param0) {
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
      // 05: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 08: arraylength
      // 09: iload 1
      // 0a: ifeq 35
      // 0d: bipush 1
      // 0e: if_icmpne 34
      // 11: goto 18
      // 14: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17: athrow
      // 18: aload 0
      // 19: ldc EventHandler
      // 1b: nop
      // 1c: invokevirtual java/lang/reflect/Method.isAnnotationPresent (Ljava/lang/Class;)Z
      // 1f: iload 1
      // 20: ifeq 35
      // 23: goto 2a
      // 26: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: ifne 38
      // 2d: goto 34
      // 30: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   private static boolean jyx(Method param0, Class param1) {
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
      // 05: invokestatic EventBus.nnj (Ljava/lang/reflect/Method;)Z
      // 08: iload 2
      // 09: ifeq 36
      // 0c: ifne 35
      // 0f: goto 16
      // 12: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 1a: bipush 0
      // 1b: aaload
      // 1c: aload 1
      // 1d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 20: iload 2
      // 21: ifeq 36
      // 24: goto 2b
      // 27: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: ifne 39
      // 2e: goto 35
      // 31: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   public static final Event esg(Event param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic ClientEvent.jcs I
      // 07: bipush 1
      // 08: if_icmpne b0
      // 0b: getstatic EventBus.yh7 Ljava/util/Map;
      // 0e: aload 0
      // 0f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 12: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 17: checkcast java/util/List
      // 1a: astore 2
      // 1b: aload 2
      // 1c: ifnull ae
      // 1f: aload 0
      // 20: iload 1
      // 21: ifeq 40
      // 24: goto 2b
      // 27: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: instanceof z56
      // 2e: ifeq 89
      // 31: goto 38
      // 34: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 0
      // 39: goto 40
      // 3c: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f: athrow
      // 40: checkcast z56
      // 43: astore 3
      // 44: aload 2
      // 45: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4a: astore 4
      // 4c: aload 4
      // 4e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 53: ifeq 85
      // 56: aload 4
      // 58: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5d: checkcast EventBus$Handler
      // 60: astore 5
      // 62: aload 5
      // 64: aload 0
      // 65: invokestatic EventBus.dispatchTo (Lmtl$_2w;Lvlc;)V
      // 68: aload 3
      // 69: iload 1
      // 6a: ifeq af
      // 6d: invokevirtual z56.vkw ()Z
      // 70: ifeq 81
      // 73: goto 7a
      // 76: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 79: athrow
      // 7a: goto 85
      // 7d: invokestatic EventBus.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 80: athrow
      // 81: iload 1
      // 82: ifne 4c
      // 85: iload 1
      // 86: ifne ae
      // 89: aload 2
      // 8a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8f: astore 3
      // 90: aload 3
      // 91: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 96: ifeq ae
      // 99: aload 3
      // 9a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 9f: checkcast EventBus$Handler
      // a2: astore 4
      // a4: aload 4
      // a6: aload 0
      // a7: invokestatic EventBus.dispatchTo (Lmtl$_2w;Lvlc;)V
      // aa: iload 1
      // ab: ifne 90
      // ae: aload 0
      // af: areturn
      // b0: aconst_null
      // b1: areturn
   }

   private static void dispatchTo(EventBus$Handler var0, Event var1) {
      try {
         var0.getMethod().invoke(var0.getTarget(), var1);
      } catch (IllegalAccessException var3) {
      } catch (IllegalArgumentException var4) {
      } catch (InvocationTargetException var5) {
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
