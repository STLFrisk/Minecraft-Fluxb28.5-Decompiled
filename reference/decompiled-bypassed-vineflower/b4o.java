import java.util.ArrayList;
import java.util.List;

public class b4o {
   private static List k1w = new ArrayList();

   public static void xcu(String param0, boolean param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: new hrs
      // 08: dup
      // 09: aload 0
      // 0a: ldc "#"
      // 0c: nop
      // 0d: ldc ""
      // 0f: nop
      // 10: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 13: invokespecial hrs.<init> (Ljava/lang/String;)V
      // 16: astore 5
      // 18: iload 1
      // 19: iload 4
      // 1b: ifeq 66
      // 1e: ifeq 65
      // 21: goto 28
      // 24: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 5
      // 2a: invokevirtual hrs.fcq ()Ljava/util/List;
      // 2d: getstatic zwr.qkk Lzwr;
      // 30: invokevirtual zwr.zj2 ()Lkgt;
      // 33: invokevirtual kgt.wau ()Ljava/util/ArrayList;
      // 36: invokevirtual java/util/ArrayList.stream ()Ljava/util/stream/Stream;
      // 39: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ar7.klu ()Z, (Lar7;)Z ]
      // 3e: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 43: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, ar7.m2d ()Ljava/lang/String;, (Lar7;)Ljava/lang/String; ]
      // 48: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // 4d: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // 50: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 55: checkcast java/util/Collection
      // 58: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 5d: pop
      // 5e: goto 65
      // 61: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64: athrow
      // 65: iload 2
      // 66: iload 4
      // 68: ifeq a6
      // 6b: ifeq a5
      // 6e: goto 75
      // 71: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 5
      // 77: invokevirtual hrs.rww ()Ljava/util/HashMap;
      // 7a: getstatic zwr.qkk Lzwr;
      // 7d: invokevirtual zwr.zj2 ()Lkgt;
      // 80: invokevirtual kgt.wau ()Ljava/util/ArrayList;
      // 83: invokevirtual java/util/ArrayList.stream ()Ljava/util/stream/Stream;
      // 86: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, ar7.m2d ()Ljava/lang/String;, (Lar7;)Ljava/lang/String; ]
      // 8b: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, ar7.x_i ()I, (Lar7;)Ljava/lang/Integer; ]
      // 90: invokestatic java/util/stream/Collectors.toMap (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/stream/Collector;
      // 93: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 98: checkcast java/util/Map
      // 9b: invokevirtual java/util/HashMap.putAll (Ljava/util/Map;)V
      // 9e: goto a5
      // a1: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: iload 3
      // a6: iload 4
      // a8: ifeq ec
      // ab: ifeq e2
      // ae: goto b5
      // b1: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4: athrow
      // b5: aload 5
      // b7: invokevirtual hrs.zgp ()Ljava/util/List;
      // ba: getstatic _x3.wig Ljava/util/ArrayList;
      // bd: invokevirtual java/util/ArrayList.stream ()Ljava/util/stream/Stream;
      // c0: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, b4o.sc3 (Ldzm;)Ljava/lang/String;, (Ldzm;)Ljava/lang/String; ]
      // c5: invokeinterface java/util/stream/Stream.map (Ljava/util/function/Function;)Ljava/util/stream/Stream; 2
      // ca: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // cd: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // d2: checkcast java/util/Collection
      // d5: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // da: pop
      // db: goto e2
      // de: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e1: athrow
      // e2: getstatic b4o.k1w Ljava/util/List;
      // e5: aload 5
      // e7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // ec: pop
      // ed: return
   }

   public static void u4c(hrs param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokevirtual hrs.fcq ()Ljava/util/List;
      // 008: invokeinterface java/util/List.size ()I 1
      // 00d: iload 1
      // 00e: ifeq 059
      // 011: ifle 050
      // 014: goto 01b
      // 017: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: getstatic zwr.qkk Lzwr;
      // 01e: invokevirtual zwr.zj2 ()Lkgt;
      // 021: invokevirtual kgt.wau ()Ljava/util/ArrayList;
      // 024: invokevirtual java/util/ArrayList.stream ()Ljava/util/stream/Stream;
      // 027: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ar7.klu ()Z, (Lar7;)Z ]
      // 02c: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 031: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, ar7.kkj ()V, (Lar7;)V ]
      // 036: invokeinterface java/util/stream/Stream.forEach (Ljava/util/function/Consumer;)V 2
      // 03b: aload 0
      // 03c: invokevirtual hrs.fcq ()Ljava/util/List;
      // 03f: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, b4o.xc9 (Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 044: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 049: goto 050
      // 04c: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: aload 0
      // 051: invokevirtual hrs.v35 ()Ljava/util/List;
      // 054: invokeinterface java/util/List.size ()I 1
      // 059: iload 1
      // 05a: ifeq 083
      // 05d: ifle 07c
      // 060: goto 067
      // 063: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 0
      // 068: invokevirtual hrs.v35 ()Ljava/util/List;
      // 06b: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, b4o.zh4 (Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 070: invokeinterface java/util/List.forEach (Ljava/util/function/Consumer;)V 2
      // 075: goto 07c
      // 078: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: aload 0
      // 07d: invokevirtual hrs.rww ()Ljava/util/HashMap;
      // 080: invokevirtual java/util/HashMap.size ()I
      // 083: iload 1
      // 084: ifeq 0c9
      // 087: ifle 0b5
      // 08a: goto 091
      // 08d: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: getstatic zwr.qkk Lzwr;
      // 094: invokevirtual zwr.zj2 ()Lkgt;
      // 097: invokevirtual kgt.wau ()Ljava/util/ArrayList;
      // 09a: invokedynamic accept ()Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, b4o.j2b (Lar7;)V, (Lar7;)V ]
      // 09f: invokevirtual java/util/ArrayList.forEach (Ljava/util/function/Consumer;)V
      // 0a2: aload 0
      // 0a3: invokevirtual hrs.rww ()Ljava/util/HashMap;
      // 0a6: invokedynamic accept ()Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, b4o.y88 (Ljava/lang/String;Ljava/lang/Integer;)V, (Ljava/lang/String;Ljava/lang/Integer;)V ]
      // 0ab: invokevirtual java/util/HashMap.forEach (Ljava/util/function/BiConsumer;)V
      // 0ae: goto 0b5
      // 0b1: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: invokevirtual hrs.zgp ()Ljava/util/List;
      // 0b9: iload 1
      // 0ba: ifeq 0d7
      // 0bd: invokeinterface java/util/List.size ()I 1
      // 0c2: goto 0c9
      // 0c5: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: ifle 1a3
      // 0cc: aload 0
      // 0cd: invokevirtual hrs.zgp ()Ljava/util/List;
      // 0d0: goto 0d7
      // 0d3: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0dc: astore 2
      // 0dd: aload 2
      // 0de: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e3: ifeq 1a3
      // 0e6: aload 2
      // 0e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ec: checkcast java/lang/String
      // 0ef: astore 3
      // 0f0: aload 3
      // 0f1: ldc ":"
      // 0f3: nop
      // 0f4: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 0f7: bipush 0
      // 0f8: aaload
      // 0f9: astore 4
      // 0fb: aload 3
      // 0fc: ldc ":"
      // 0fe: nop
      // 0ff: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 102: bipush 1
      // 103: aaload
      // 104: astore 5
      // 106: aload 3
      // 107: ldc ":"
      // 109: nop
      // 10a: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 10d: bipush 2
      // 10e: aaload
      // 10f: astore 6
      // 111: aload 4
      // 113: aload 5
      // 115: invokestatic _x3.fv0 (Ljava/lang/String;Ljava/lang/String;)Ldzm;
      // 118: astore 7
      // 11a: aload 7
      // 11c: iload 1
      // 11d: ifeq 12c
      // 120: ifnull 19f
      // 123: goto 12a
      // 126: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: aload 7
      // 12c: instanceof crk
      // 12f: iload 1
      // 130: ifeq 156
      // 133: ifeq 151
      // 136: goto 13d
      // 139: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: aload 7
      // 13f: checkcast crk
      // 142: aload 6
      // 144: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 147: invokevirtual crk.ms1 (F)V
      // 14a: goto 151
      // 14d: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: aload 7
      // 153: instanceof cn7
      // 156: iload 1
      // 157: ifeq 188
      // 15a: ifeq 178
      // 15d: goto 164
      // 160: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 7
      // 166: aload 6
      // 168: invokestatic java/lang/Boolean.parseBoolean (Ljava/lang/String;)Z
      // 16b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 16e: invokevirtual dzm.aze (Ljava/lang/Object;)V
      // 171: goto 178
      // 174: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: aload 7
      // 17a: iload 1
      // 17b: ifeq 18d
      // 17e: instanceof c_3
      // 181: goto 188
      // 184: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: ifeq 195
      // 18b: aload 7
      // 18d: checkcast c_3
      // 190: aload 6
      // 192: invokevirtual c_3.n1j (Ljava/lang/String;)V
      // 195: goto 19f
      // 198: astore 8
      // 19a: aload 8
      // 19c: invokevirtual java/lang/Exception.printStackTrace ()V
      // 19f: iload 1
      // 1a0: ifne 0dd
      // 1a3: return
   }

   public static boolean xim(String var0) {
      try {
         if (d2s(var0) == null) {
            return false;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      k1w.remove(d2s(var0));
      zwr.qkk.up0().ulq(var0);
      return true;
   }

   public static boolean c1p(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: getstatic b4o.k1w Ljava/util/List;
      // 07: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 0c: aload 0
      // 0d: invokedynamic test (Ljava/lang/String;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, b4o.isy (Ljava/lang/String;Lhrs;)Z, (Lhrs;)Z ]
      // 12: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 17: iload 1
      // 18: ifne 4d
      // 1b: invokeinterface java/util/stream/Stream.count ()J 1
      // 20: lconst_0
      // 21: lcmp
      // 22: ifgt 32
      // 25: goto 2c
      // 28: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: getstatic b4o.k1w Ljava/util/List;
      // 35: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 3a: aload 0
      // 3b: invokedynamic test (Ljava/lang/String;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, b4o.mp2 (Ljava/lang/String;Lhrs;)Z, (Lhrs;)Z ]
      // 40: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 45: invokeinterface java/util/stream/Stream.findFirst ()Ljava/util/Optional; 1
      // 4a: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 4d: checkcast hrs
      // 50: astore 2
      // 51: aload 2
      // 52: invokestatic b4o.u4c (Lhrs;)V
      // 55: bipush 1
      // 56: ireturn
   }

   public static hrs d2s(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: getstatic b4o.k1w Ljava/util/List;
      // 07: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 0c: aload 0
      // 0d: invokedynamic test (Ljava/lang/String;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, b4o.klp (Ljava/lang/String;Lhrs;)Z, (Lhrs;)Z ]
      // 12: iload 1
      // 13: ifne 3b
      // 16: invokeinterface java/util/stream/Stream.noneMatch (Ljava/util/function/Predicate;)Z 2
      // 1b: ifeq 2d
      // 1e: goto 25
      // 21: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aconst_null
      // 26: goto 4b
      // 29: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: getstatic b4o.k1w Ljava/util/List;
      // 30: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 35: aload 0
      // 36: invokedynamic test (Ljava/lang/String;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, b4o.zd1 (Ljava/lang/String;Lhrs;)Z, (Lhrs;)Z ]
      // 3b: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 40: invokeinterface java/util/stream/Stream.findFirst ()Ljava/util/Optional; 1
      // 45: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 48: checkcast hrs
      // 4b: areturn
   }

   public static List zq1() {
      return k1w;
   }

   private static boolean zd1(String var0, hrs var1) {
      return var1.thb().equalsIgnoreCase(var0);
   }

   private static boolean klp(String var0, hrs var1) {
      return var1.thb().equalsIgnoreCase(var0);
   }

   private static boolean mp2(String var0, hrs var1) {
      return var1.thb().equalsIgnoreCase(var0);
   }

   private static boolean isy(String var0, hrs var1) {
      return var1.thb().equalsIgnoreCase(var0);
   }

   private static void y88(String param0, Integer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: getstatic zwr.qkk Lzwr;
      // 07: invokevirtual zwr.zj2 ()Lkgt;
      // 0a: aload 0
      // 0b: invokevirtual kgt.wv4 (Ljava/lang/String;)Lar7;
      // 0e: iload 2
      // 0f: ifne 2d
      // 12: ifnull 34
      // 15: goto 1c
      // 18: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: getstatic zwr.qkk Lzwr;
      // 1f: invokevirtual zwr.zj2 ()Lkgt;
      // 22: aload 0
      // 23: invokevirtual kgt.wv4 (Ljava/lang/String;)Lar7;
      // 26: goto 2d
      // 29: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Integer.intValue ()I
      // 31: invokevirtual ar7.nm8 (I)V
      // 34: return
   }

   private static void j2b(ar7 var0) {
      var0.nm8(0);
   }

   private static void zh4(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: getstatic zwr.qkk Lzwr;
      // 07: invokevirtual zwr.zj2 ()Lkgt;
      // 0a: aload 0
      // 0b: invokevirtual kgt.wv4 (Ljava/lang/String;)Lar7;
      // 0e: iload 1
      // 0f: ifeq 2d
      // 12: ifnull 30
      // 15: goto 1c
      // 18: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: getstatic zwr.qkk Lzwr;
      // 1f: invokevirtual zwr.zj2 ()Lkgt;
      // 22: aload 0
      // 23: invokevirtual kgt.wv4 (Ljava/lang/String;)Lar7;
      // 26: goto 2d
      // 29: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokevirtual ar7.kkj ()V
      // 30: return
   }

   private static void xc9(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: getstatic zwr.qkk Lzwr;
      // 07: invokevirtual zwr.zj2 ()Lkgt;
      // 0a: aload 0
      // 0b: invokevirtual kgt.wv4 (Ljava/lang/String;)Lar7;
      // 0e: iload 1
      // 0f: ifeq 2d
      // 12: ifnull 30
      // 15: goto 1c
      // 18: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: getstatic zwr.qkk Lzwr;
      // 1f: invokevirtual zwr.zj2 ()Lkgt;
      // 22: aload 0
      // 23: invokevirtual kgt.wv4 (Ljava/lang/String;)Lar7;
      // 26: goto 2d
      // 29: invokestatic b4o.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokevirtual ar7.z5z ()V
      // 30: return
   }

   private static String sc3(dzm var0) {
      return var0.l08() + ":" + var0.o7h() + ":" + var0.d7c();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
