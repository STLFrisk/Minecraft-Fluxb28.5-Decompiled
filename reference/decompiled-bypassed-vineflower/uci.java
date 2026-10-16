import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class uci {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public sa6 vp8(String var1) {
      return (sa6)this.hv4.get(var1);
   }

   public sa6 oda(String param1, z0w param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic uci.a J
      // 003: ldc2_w 7717134910670
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: invokevirtual java/lang/String.length ()I
      // 011: bipush 16
      // 013: if_icmple 052
      // 016: new java/lang/IllegalArgumentException
      // 019: dup
      // 01a: new java/lang/StringBuilder
      // 01d: dup
      // 01e: invokespecial java/lang/StringBuilder.<init> ()V
      // 021: sipush 19211
      // 024: ldc2_w 1387411107062168042
      // 027: lload 3
      // 028: lxor
      // 029: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: nop
      // 02f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 032: aload 1
      // 033: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 036: sipush 20495
      // 039: ldc2_w 2730379489960698596
      // 03c: lload 3
      // 03d: lxor
      // 03e: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: nop
      // 044: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 047: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 04a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 04d: athrow
      // 04e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 051: athrow
      // 052: aload 0
      // 053: aload 1
      // 054: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 057: astore 6
      // 059: aload 6
      // 05b: iload 5
      // 05d: ifne 0bc
      // 060: ifnull 0a6
      // 063: goto 06a
      // 066: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 069: athrow
      // 06a: new java/lang/IllegalArgumentException
      // 06d: dup
      // 06e: new java/lang/StringBuilder
      // 071: dup
      // 072: invokespecial java/lang/StringBuilder.<init> ()V
      // 075: sipush 25389
      // 078: ldc2_w 1869152547653423582
      // 07b: lload 3
      // 07c: lxor
      // 07d: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: nop
      // 083: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 086: aload 1
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: sipush 1851
      // 08d: ldc2_w 2725051723895600596
      // 090: lload 3
      // 091: lxor
      // 092: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0a1: athrow
      // 0a2: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a5: athrow
      // 0a6: new sa6
      // 0a9: dup
      // 0aa: aload 0
      // 0ab: aload 1
      // 0ac: aload 2
      // 0ad: invokespecial sa6.<init> (Luci;Ljava/lang/String;Lz0w;)V
      // 0b0: astore 6
      // 0b2: aload 0
      // 0b3: getfield uci.hry Ljava/util/Map;
      // 0b6: aload 2
      // 0b7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0bc: checkcast java/util/List
      // 0bf: astore 7
      // 0c1: aload 7
      // 0c3: iload 5
      // 0c5: ifne 0fa
      // 0c8: ifnonnull 0e4
      // 0cb: goto 0d2
      // 0ce: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d1: athrow
      // 0d2: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0d5: astore 7
      // 0d7: aload 0
      // 0d8: getfield uci.hry Ljava/util/Map;
      // 0db: aload 2
      // 0dc: aload 7
      // 0de: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e3: pop
      // 0e4: aload 7
      // 0e6: aload 6
      // 0e8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ed: pop
      // 0ee: aload 0
      // 0ef: getfield uci.hv4 Ljava/util/Map;
      // 0f2: aload 1
      // 0f3: aload 6
      // 0f5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fa: pop
      // 0fb: aload 0
      // 0fc: aload 6
      // 0fe: invokevirtual uci.d_2 (Lsa6;)V
      // 101: aload 6
      // 103: areturn
   }

   public Collection vre(z0w param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield uci.hry Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast java/util/Collection
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 2c
      // 17: ifnonnull 2b
      // 1a: goto 21
      // 1d: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 24: goto 2f
      // 27: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: aload 3
      // 2c: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 2f: areturn
   }

   public boolean g4w(String param1, sa6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield uci.hf9 Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast java/util/Map
      // 11: astore 4
      // 13: aload 4
      // 15: iload 3
      // 16: ifne 31
      // 19: ifnonnull 29
      // 1c: goto 23
      // 1f: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28: athrow
      // 29: aload 4
      // 2b: aload 2
      // 2c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 31: checkcast r11
      // 34: astore 5
      // 36: aload 5
      // 38: ifnull 43
      // 3b: bipush 1
      // 3c: goto 44
      // 3f: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: bipush 0
      // 44: ireturn
   }

   public r11 jte(String param1, sa6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uci.a J
      // 03: ldc2_w 106664489756261
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: iload 5
      // 10: ifne 68
      // 13: invokevirtual java/lang/String.length ()I
      // 16: bipush 40
      // 18: if_icmple 5e
      // 1b: goto 22
      // 1e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: new java/lang/IllegalArgumentException
      // 25: dup
      // 26: new java/lang/StringBuilder
      // 29: dup
      // 2a: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d: sipush 4630
      // 30: ldc2_w 1529267474262032985
      // 33: lload 3
      // 34: lxor
      // 35: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: aload 1
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: sipush 20495
      // 45: ldc2_w 2730350877055303759
      // 48: lload 3
      // 49: lxor
      // 4a: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 56: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 59: athrow
      // 5a: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield uci.hf9 Ljava/util/Map;
      // 62: aload 1
      // 63: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 68: checkcast java/util/Map
      // 6b: astore 6
      // 6d: aload 6
      // 6f: iload 5
      // 71: ifne 98
      // 74: ifnonnull 90
      // 77: goto 7e
      // 7a: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7d: athrow
      // 7e: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 81: astore 6
      // 83: aload 0
      // 84: getfield uci.hf9 Ljava/util/Map;
      // 87: aload 1
      // 88: aload 6
      // 8a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 8f: pop
      // 90: aload 6
      // 92: aload 2
      // 93: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 98: checkcast r11
      // 9b: astore 7
      // 9d: aload 7
      // 9f: iload 5
      // a1: ifne c7
      // a4: ifnonnull c5
      // a7: goto ae
      // aa: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ad: athrow
      // ae: new r11
      // b1: dup
      // b2: aload 0
      // b3: aload 2
      // b4: aload 1
      // b5: invokespecial r11.<init> (Luci;Lsa6;Ljava/lang/String;)V
      // b8: astore 7
      // ba: aload 6
      // bc: aload 2
      // bd: aload 7
      // bf: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // c4: pop
      // c5: aload 7
      // c7: areturn
   }

   public Collection oga(sa6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 3
      // 04: invokestatic t9d.b ()I
      // 07: aload 0
      // 08: getfield uci.hf9 Ljava/util/Map;
      // 0b: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 10: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 15: astore 4
      // 17: istore 2
      // 18: aload 4
      // 1a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f: ifeq 5f
      // 22: aload 4
      // 24: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 29: checkcast java/util/Map
      // 2c: astore 5
      // 2e: aload 5
      // 30: aload 1
      // 31: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 36: checkcast r11
      // 39: astore 6
      // 3b: iload 2
      // 3c: ifeq 66
      // 3f: aload 6
      // 41: ifnull 5b
      // 44: goto 4b
      // 47: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: aload 3
      // 4c: aload 6
      // 4e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 53: pop
      // 54: goto 5b
      // 57: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5a: athrow
      // 5b: iload 2
      // 5c: ifne 18
      // 5f: aload 3
      // 60: getstatic r11.pqd Ljava/util/Comparator;
      // 63: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 66: aload 3
      // 67: areturn
   }

   public Collection n2t() {
      return this.hv4.values();
   }

   public Collection ilv() {
      return this.hf9.keySet();
   }

   public void ex1(String param1, sa6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 48
      // 09: ifnonnull 37
      // 0c: goto 13
      // 0f: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aload 0
      // 14: getfield uci.hf9 Ljava/util/Map;
      // 17: aload 1
      // 18: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1d: checkcast java/util/Map
      // 20: astore 4
      // 22: aload 4
      // 24: ifnull 33
      // 27: aload 0
      // 28: aload 1
      // 29: invokevirtual uci.eqo (Ljava/lang/String;)V
      // 2c: goto 33
      // 2f: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: iload 3
      // 34: ifeq cb
      // 37: aload 0
      // 38: getfield uci.hf9 Ljava/util/Map;
      // 3b: aload 1
      // 3c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 41: goto 48
      // 44: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47: athrow
      // 48: checkcast java/util/Map
      // 4b: astore 4
      // 4d: aload 4
      // 4f: iload 3
      // 50: ifne 6c
      // 53: ifnull cb
      // 56: goto 5d
      // 59: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: aload 4
      // 5f: aload 2
      // 60: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 65: goto 6c
      // 68: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b: athrow
      // 6c: checkcast r11
      // 6f: astore 5
      // 71: aload 4
      // 73: iload 3
      // 74: ifne 9b
      // 77: invokeinterface java/util/Map.size ()I 1
      // 7c: bipush 1
      // 7d: if_icmpge b2
      // 80: goto 87
      // 83: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 86: athrow
      // 87: aload 0
      // 88: getfield uci.hf9 Ljava/util/Map;
      // 8b: aload 1
      // 8c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 91: checkcast java/util/Map
      // 94: goto 9b
      // 97: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9a: athrow
      // 9b: astore 6
      // 9d: aload 6
      // 9f: ifnull ae
      // a2: aload 0
      // a3: aload 1
      // a4: invokevirtual uci.eqo (Ljava/lang/String;)V
      // a7: goto ae
      // aa: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ad: athrow
      // ae: iload 3
      // af: ifeq cb
      // b2: aload 5
      // b4: ifnull cb
      // b7: goto be
      // ba: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bd: athrow
      // be: aload 0
      // bf: aload 1
      // c0: aload 2
      // c1: invokevirtual uci.in2 (Ljava/lang/String;Lsa6;)V
      // c4: goto cb
      // c7: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ca: athrow
      // cb: return
   }

   public Collection ura() {
      Collection var2 = this.hf9.values();
      ArrayList var3 = Lists.newArrayList();
      int var10000 = t9d.b();
      Iterator var4 = var2.iterator();
      int var1 = var10000;

      while (true) {
         if (var4.hasNext()) {
            Map var5 = (Map)var4.next();

            try {
               var7 = var3;
               if (var1 == 0) {
                  break;
               }

               var3.addAll(var5.values());
               if (var1 != 0) {
                  continue;
               }
            } catch (IllegalArgumentException var6) {
               throw a(var6);
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   public Map fc3(String var1) {
      int var2 = t9d.b();
      Map var3 = (Map)this.hf9.get(var1);

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 != null) {
            return var3;
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      return Maps.newHashMap();
   }

   public void hew(sa6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield uci.hv4 Ljava/util/Map;
      // 04: aload 1
      // 05: invokevirtual sa6.qkn ()Ljava/lang/String;
      // 08: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: pop
      // 0e: invokestatic t9d.c ()I
      // 11: bipush 0
      // 12: istore 3
      // 13: istore 2
      // 14: iload 3
      // 15: bipush 19
      // 17: if_icmpge 50
      // 1a: aload 0
      // 1b: iload 3
      // 1c: iload 2
      // 1d: ifne 42
      // 20: invokevirtual uci.d_n (I)Lsa6;
      // 23: iload 2
      // 24: ifne 5d
      // 27: goto 2e
      // 2a: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: if_acmpne 49
      // 32: goto 39
      // 35: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: aload 0
      // 3a: iload 3
      // 3b: goto 42
      // 3e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: aconst_null
      // 43: checkcast sa6
      // 46: invokevirtual uci.zux (ILsa6;)V
      // 49: iinc 3 1
      // 4c: iload 2
      // 4d: ifeq 14
      // 50: aload 0
      // 51: getfield uci.hry Ljava/util/Map;
      // 54: aload 1
      // 55: invokevirtual sa6.do2 ()Lz0w;
      // 58: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5d: checkcast java/util/List
      // 60: astore 3
      // 61: aload 3
      // 62: iload 2
      // 63: ifne 88
      // 66: ifnull 7f
      // 69: goto 70
      // 6c: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f: athrow
      // 70: aload 3
      // 71: aload 1
      // 72: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 77: pop
      // 78: goto 7f
      // 7b: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield uci.hf9 Ljava/util/Map;
      // 83: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 88: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 8d: astore 4
      // 8f: aload 4
      // 91: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 96: ifeq bd
      // 99: aload 4
      // 9b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a0: checkcast java/util/Map
      // a3: astore 5
      // a5: aload 5
      // a7: aload 1
      // a8: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // ad: pop
      // ae: iload 2
      // af: ifne c2
      // b2: iload 2
      // b3: ifeq 8f
      // b6: goto bd
      // b9: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // bc: athrow
      // bd: aload 0
      // be: aload 1
      // bf: invokevirtual uci.guh (Lsa6;)V
      // c2: return
   }

   public void zux(int var1, sa6 var2) {
      this.m8_[var1] = var2;
   }

   public sa6 d_n(int var1) {
      return this.m8_[var1];
   }

   public q2m l2u(String var1) {
      return (q2m)this.w3k.get(var1);
   }

   public q2m g_e(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uci.a J
      // 03: ldc2_w 19467428874256
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual java/lang/String.length ()I
      // 11: bipush 16
      // 13: if_icmple 52
      // 16: new java/lang/IllegalArgumentException
      // 19: dup
      // 1a: new java/lang/StringBuilder
      // 1d: dup
      // 1e: invokespecial java/lang/StringBuilder.<init> ()V
      // 21: sipush 18725
      // 24: ldc2_w 8742268113479677721
      // 27: lload 2
      // 28: lxor
      // 29: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: nop
      // 2f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32: aload 1
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36: sipush 20495
      // 39: ldc2_w 2730403061614095930
      // 3c: lload 2
      // 3d: lxor
      // 3e: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: nop
      // 44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 4d: athrow
      // 4e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51: athrow
      // 52: aload 0
      // 53: aload 1
      // 54: invokevirtual uci.l2u (Ljava/lang/String;)Lq2m;
      // 57: astore 5
      // 59: aload 5
      // 5b: iload 4
      // 5d: ifne c6
      // 60: ifnull a6
      // 63: goto 6a
      // 66: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: new java/lang/IllegalArgumentException
      // 6d: dup
      // 6e: new java/lang/StringBuilder
      // 71: dup
      // 72: invokespecial java/lang/StringBuilder.<init> ()V
      // 75: sipush 383
      // 78: ldc2_w 7074771319156113229
      // 7b: lload 2
      // 7c: lxor
      // 7d: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: nop
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: aload 1
      // 87: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8a: sipush 28289
      // 8d: ldc2_w 8045686832688697528
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // a1: athrow
      // a2: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a5: athrow
      // a6: new q2m
      // a9: dup
      // aa: aload 0
      // ab: aload 1
      // ac: invokespecial q2m.<init> (Luci;Ljava/lang/String;)V
      // af: astore 5
      // b1: aload 0
      // b2: getfield uci.w3k Ljava/util/Map;
      // b5: aload 1
      // b6: aload 5
      // b8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // bd: pop
      // be: aload 0
      // bf: aload 5
      // c1: invokevirtual uci.plf (Lq2m;)V
      // c4: aload 5
      // c6: areturn
   }

   public void bss(q2m var1) {
      this.w3k.remove(var1.fm9());
      int var10000 = t9d.c();
      Iterator var3 = var1.vsw().iterator();
      int var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();

            try {
               this.s4t.remove(var4);
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }
         }

         this.ga8(var1);
         break;
      }
   }

   public boolean g_l(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uci.a J
      // 03: ldc2_w 63061072937670
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: invokevirtual java/lang/String.length ()I
      // 11: iload 5
      // 13: ifeq 74
      // 16: bipush 40
      // 18: if_icmple 5e
      // 1b: goto 22
      // 1e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: new java/lang/IllegalArgumentException
      // 25: dup
      // 26: new java/lang/StringBuilder
      // 29: dup
      // 2a: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d: sipush 10198
      // 30: ldc2_w 5196429146319065902
      // 33: lload 3
      // 34: lxor
      // 35: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: aload 1
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: sipush 18376
      // 45: ldc2_w 520440920591069992
      // 48: lload 3
      // 49: lxor
      // 4a: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 56: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 59: athrow
      // 5a: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: aload 0
      // 5f: iload 5
      // 61: ifeq 7e
      // 64: getfield uci.w3k Ljava/util/Map;
      // 67: aload 2
      // 68: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 6d: goto 74
      // 70: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: ifne 7d
      // 77: bipush 0
      // 78: ireturn
      // 79: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 2
      // 7f: invokevirtual uci.l2u (Ljava/lang/String;)Lq2m;
      // 82: astore 6
      // 84: aload 0
      // 85: aload 1
      // 86: invokevirtual uci.zov (Ljava/lang/String;)Lq2m;
      // 89: iload 5
      // 8b: ifeq b4
      // 8e: ifnull a5
      // 91: goto 98
      // 94: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 97: athrow
      // 98: aload 0
      // 99: aload 1
      // 9a: invokevirtual uci.c1i (Ljava/lang/String;)Z
      // 9d: pop
      // 9e: goto a5
      // a1: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a4: athrow
      // a5: aload 0
      // a6: getfield uci.s4t Ljava/util/Map;
      // a9: aload 1
      // aa: aload 6
      // ac: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b1: pop
      // b2: aload 6
      // b4: invokevirtual q2m.vsw ()Ljava/util/Collection;
      // b7: aload 1
      // b8: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // bd: pop
      // be: bipush 1
      // bf: ireturn
   }

   public boolean c1i(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual uci.zov (Ljava/lang/String;)Lq2m;
      // 09: astore 3
      // 0a: iload 2
      // 0b: ifeq 26
      // 0e: aload 3
      // 0f: ifnull 28
      // 12: goto 19
      // 15: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: aload 3
      // 1c: invokevirtual uci.srl (Ljava/lang/String;Lq2m;)V
      // 1f: goto 26
      // 22: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: bipush 1
      // 27: ireturn
      // 28: bipush 0
      // 29: ireturn
   }

   public void srl(String param1, q2m param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uci.a J
      // 03: ldc2_w 18400499626401
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokevirtual uci.zov (Ljava/lang/String;)Lq2m;
      // 12: iload 5
      // 14: ifeq 6d
      // 17: aload 2
      // 18: if_acmpeq 61
      // 1b: goto 22
      // 1e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: new java/lang/IllegalStateException
      // 25: dup
      // 26: new java/lang/StringBuilder
      // 29: dup
      // 2a: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d: sipush 25162
      // 30: ldc2_w 7872076679517218255
      // 33: lload 3
      // 34: lxor
      // 35: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e: aload 2
      // 3f: invokevirtual q2m.fm9 ()Ljava/lang/String;
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45: sipush 18746
      // 48: ldc2_w 9090357021333622439
      // 4b: lload 3
      // 4c: lxor
      // 4d: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: nop
      // 53: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 56: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 59: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 5c: athrow
      // 5d: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 60: athrow
      // 61: aload 0
      // 62: getfield uci.s4t Ljava/util/Map;
      // 65: aload 1
      // 66: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6b: pop
      // 6c: aload 2
      // 6d: invokevirtual q2m.vsw ()Ljava/util/Collection;
      // 70: aload 1
      // 71: invokeinterface java/util/Collection.remove (Ljava/lang/Object;)Z 2
      // 76: pop
      // 77: return
   }

   public Collection o5s() {
      return this.w3k.keySet();
   }

   public Collection yhf() {
      return this.w3k.values();
   }

   public q2m zov(String var1) {
      return (q2m)this.s4t.get(var1);
   }

   public void d_2(sa6 var1) {
   }

   public void u75(sa6 var1) {
   }

   public void guh(sa6 var1) {
   }

   public void anw(r11 var1) {
   }

   public void eqo(String var1) {
   }

   public void in2(String var1, sa6 var2) {
   }

   public void plf(q2m var1) {
   }

   public void b_v(q2m var1) {
   }

   public void ga8(q2m var1) {
   }

   public static String e_2(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uci.a J
      // 03: ldc2_w 46775371294478
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: iload 0
      // 0d: iload 3
      // 0e: ifeq 62
      // 11: tableswitch 80 0 2 31 50 65
      // 2c: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f: athrow
      // 30: sipush 32479
      // 33: ldc2_w 4053573607813918705
      // 36: lload 1
      // 37: lxor
      // 38: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: nop
      // 3e: areturn
      // 3f: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: sipush 19901
      // 46: ldc2_w 1768778233656384669
      // 49: lload 1
      // 4a: lxor
      // 4b: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: nop
      // 51: areturn
      // 52: sipush 24297
      // 55: ldc2_w 8669694462541598660
      // 58: lload 1
      // 59: lxor
      // 5a: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: nop
      // 60: areturn
      // 61: iload 0
      // 62: bipush 3
      // 63: iload 3
      // 64: ifeq 7b
      // 67: if_icmplt d8
      // 6a: goto 71
      // 6d: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 70: athrow
      // 71: iload 0
      // 72: bipush 18
      // 74: goto 7b
      // 77: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7a: athrow
      // 7b: iload 3
      // 7c: ifeq 92
      // 7f: if_icmpgt d8
      // 82: goto 89
      // 85: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 88: athrow
      // 89: iload 0
      // 8a: bipush 3
      // 8b: goto 92
      // 8e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 91: athrow
      // 92: isub
      // 93: invokestatic syo.wgd (I)Lsyo;
      // 96: astore 4
      // 98: aload 4
      // 9a: iload 3
      // 9b: ifeq aa
      // 9e: ifnull d8
      // a1: goto a8
      // a4: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a7: athrow
      // a8: aload 4
      // aa: getstatic syo.w29 Lsyo;
      // ad: if_acmpeq d8
      // b0: new java/lang/StringBuilder
      // b3: dup
      // b4: invokespecial java/lang/StringBuilder.<init> ()V
      // b7: sipush 3200
      // ba: ldc2_w 8728564137581436329
      // bd: lload 1
      // be: lxor
      // bf: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: nop
      // c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c8: aload 4
      // ca: invokevirtual syo.ktw ()Ljava/lang/String;
      // cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d3: areturn
      // d4: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // d7: athrow
      // d8: aconst_null
      // d9: areturn
   }

   public static int ygh(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uci.a J
      // 03: ldc2_w 89833970328127
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: sipush 11745
      // 10: ldc2_w 933730759373027830
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 1e: iload 3
      // 1f: ifeq 44
      // 22: ifeq 32
      // 25: goto 2c
      // 28: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31: athrow
      // 32: aload 0
      // 33: sipush 9681
      // 36: ldc2_w 1101451790140502481
      // 39: lload 1
      // 3a: lxor
      // 3b: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 44: iload 3
      // 45: ifeq 6a
      // 48: ifeq 58
      // 4b: goto 52
      // 4e: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51: athrow
      // 52: bipush 1
      // 53: ireturn
      // 54: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 57: athrow
      // 58: aload 0
      // 59: sipush 12238
      // 5c: ldc2_w 3317976603715992538
      // 5f: lload 1
      // 60: lxor
      // 61: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 6a: iload 3
      // 6b: ifeq 90
      // 6e: ifeq 7e
      // 71: goto 78
      // 74: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77: athrow
      // 78: bipush 2
      // 79: ireturn
      // 7a: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: sipush 28822
      // 82: ldc2_w 650157573102707844
      // 85: lload 1
      // 86: lxor
      // 87: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: nop
      // 8d: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 90: iload 3
      // 91: ifeq ec
      // 94: ifeq eb
      // 97: goto 9e
      // 9a: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9d: athrow
      // 9e: aload 0
      // 9f: sipush 28822
      // a2: ldc2_w 650157573102707844
      // a5: lload 1
      // a6: lxor
      // a7: invokedynamic u (IJ)Ljava/lang/String; bsm=uci.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: nop
      // ad: invokevirtual java/lang/String.length ()I
      // b0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // b3: astore 4
      // b5: aload 4
      // b7: invokestatic syo.fok (Ljava/lang/String;)Lsyo;
      // ba: astore 5
      // bc: aload 5
      // be: iload 3
      // bf: ifeq ce
      // c2: ifnull eb
      // c5: goto cc
      // c8: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // cb: athrow
      // cc: aload 5
      // ce: invokevirtual syo.h6w ()I
      // d1: iload 3
      // d2: ifeq ec
      // d5: iflt eb
      // d8: goto df
      // db: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // de: athrow
      // df: aload 5
      // e1: invokevirtual syo.h6w ()I
      // e4: bipush 3
      // e5: iadd
      // e6: ireturn
      // e7: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // ea: athrow
      // eb: bipush -1
      // ec: ireturn
   }

   public static String[] e7c() {
      int var0 = t9d.b();

      try {
         if (var0 == 0) {
            return fdj;
         }

         if (fdj != null) {
            return fdj;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      fdj = new String[19];
      int var1 = 0;

      while (var1 < 19) {
         try {
            if (var0 == 0) {
               return fdj;
            }

            fdj[var1] = e_2(var1);
            var1++;
            if (var0 == 0) {
               break;
            }
         } catch (IllegalArgumentException var2) {
            throw a(var2);
         }
      }

      return fdj;
   }

   public void ypb(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull 55
      // 0c: goto 13
      // 0f: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aload 1
      // 14: instanceof ha9
      // 17: iload 2
      // 18: ifne 3b
      // 1b: ifne 55
      // 1e: goto 25
      // 21: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 1
      // 26: iload 2
      // 27: ifne 3f
      // 2a: goto 31
      // 2d: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: invokevirtual i2h.gzr ()Z
      // 34: goto 3b
      // 37: invokestatic uci.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: ifne 55
      // 3e: aload 1
      // 3f: invokevirtual i2h.b_q ()Ljava/util/UUID;
      // 42: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 45: astore 3
      // 46: aload 0
      // 47: aload 3
      // 48: aconst_null
      // 49: checkcast sa6
      // 4c: invokevirtual uci.ex1 (Ljava/lang/String;Lsa6;)V
      // 4f: aload 0
      // 50: aload 3
      // 51: invokevirtual uci.c1i (Ljava/lang/String;)Z
      // 54: pop
      // 55: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2976233988411142790L, -6960182003846232380L, MethodHandles.lookup().lookupClass()).a(220012692636528L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 126919677238216L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[20];
      int var7 = 0;
      String var6 = "\b\bUR@\u0081&ùe\u0083án\n\u008cµGµm\u001eBè»Xº\u00adòõE\b\u0011\u001c\u00068Ï¦8æº«p\u0010\u0019\u0017{ªÕ«ûÖ¨\u0097pZµëFO\u0018\u0087nÍ.Oisù\u0016\u0017×©ê\u008d\u0006\u0084\u0080\u0006\u009d{\u0087\u009fDj ¦¶\u0011\u0010æÇè\u0089vv\u0016çé¿Ô\u001fM|¶\"\u0006T\u0010áú¾ Mpt*²\u0018\u001a|\fÎ\u0083m1Ó÷b\u008cHWÆwÃ\u001eönâ\u0086¯\u008fö0Î,ø\u0006\u0002\u00834è!\u0011¬,\u0095cN\u0096Öû1\u0016Îom#®½\\J\u008fú\u001eN<9¥s\u008d\u009bç]\u0007\u001fé£\u0000m\u0010J(4\u001dÞÕ$\nõç\b\u007fÕYUÀb\f\u0082~`\u0094Y\\diñ´ïÚz·Q\u009a½¹.û\u000fbAZ\u0010(r³tÉ\u0097\u0017¼«]¢\u000e»O,³ \u0017\u0014\u0002\u0099`Æçî$\u0096ã\u0018í\f?`&Ã\u0007Â@¿\u001fûùyH¡\u0084\u009bÄr w\u0084Û» Ø\u00840ÆhhÝ\u0013§^\b)\u0082)&ët\u008e\u001cÆë3±i\u0088-¥ \u0081\u0091\u009f¤\u0014\u001f`¥9Éûÿµ\u0089\nËäÑm|Ü\u008d°úS\u0000¾øº~\u0098Ùx\u0089m\u00862Õ\u0082~\u0088A¤oV2~\u0014ÆÔ\u008fyîÖ\u009a\u000fÕ!¯´Ï\u001a\u0016\u009dS4R\u0006\u000f\u0015\u0018}$ýõ\u0084SèzT\u009eA»\u0093N\u009c«%¿\u0005\u0004\"\u0082î!\u0085*äÀ\u000fzÈbK\rø\u0017Ì\u0091\u0005Âßª\r\b¦Æ>\u0010N)\u0083<:¥Mîfï,¬-¢¸B\u000el\u008c°\u009d>5æb^\u008bQ\u009bX\u0082kóæ\u0018\fÊ\u008cÂÚÇÁú²/\u001a\u001e`\u001f\u0095ÂR\fô;£¡\u0092\u0002(Wú-\u0017\fúà\u008fLBAÞ>ßâ¶}ÕÖ\u009bØ\u009fÏ!ÅÖ©¯6\npß\u00adø\u0087WwXA\u0080(É]&ÔO&Þ_veÝy\u0097j\u0003/r\u0015=\u0081\u0097É¨iX0\u009aL³¨ßa¬\u001b£\r\u009f±±m\u0010í¬«e\u0005\u0097Lu?4=9\u001fÎ±M\u0010¬ÓHð9)\u001b!q\u0010p`\u0000\u0001y÷(\u0015\u0081ý\u0093P\u00adíè\u008a¶û¤mÍ\u0018^'\u0001\u0016W \u0011¥\u001f³V'\u0098æÝ°ÈO\u008bÏ¹1Çªq";
      int var8 = "\b\bUR@\u0081&ùe\u0083án\n\u008cµGµm\u001eBè»Xº\u00adòõE\b\u0011\u001c\u00068Ï¦8æº«p\u0010\u0019\u0017{ªÕ«ûÖ¨\u0097pZµëFO\u0018\u0087nÍ.Oisù\u0016\u0017×©ê\u008d\u0006\u0084\u0080\u0006\u009d{\u0087\u009fDj ¦¶\u0011\u0010æÇè\u0089vv\u0016çé¿Ô\u001fM|¶\"\u0006T\u0010áú¾ Mpt*²\u0018\u001a|\fÎ\u0083m1Ó÷b\u008cHWÆwÃ\u001eönâ\u0086¯\u008fö0Î,ø\u0006\u0002\u00834è!\u0011¬,\u0095cN\u0096Öû1\u0016Îom#®½\\J\u008fú\u001eN<9¥s\u008d\u009bç]\u0007\u001fé£\u0000m\u0010J(4\u001dÞÕ$\nõç\b\u007fÕYUÀb\f\u0082~`\u0094Y\\diñ´ïÚz·Q\u009a½¹.û\u000fbAZ\u0010(r³tÉ\u0097\u0017¼«]¢\u000e»O,³ \u0017\u0014\u0002\u0099`Æçî$\u0096ã\u0018í\f?`&Ã\u0007Â@¿\u001fûùyH¡\u0084\u009bÄr w\u0084Û» Ø\u00840ÆhhÝ\u0013§^\b)\u0082)&ët\u008e\u001cÆë3±i\u0088-¥ \u0081\u0091\u009f¤\u0014\u001f`¥9Éûÿµ\u0089\nËäÑm|Ü\u008d°úS\u0000¾øº~\u0098Ùx\u0089m\u00862Õ\u0082~\u0088A¤oV2~\u0014ÆÔ\u008fyîÖ\u009a\u000fÕ!¯´Ï\u001a\u0016\u009dS4R\u0006\u000f\u0015\u0018}$ýõ\u0084SèzT\u009eA»\u0093N\u009c«%¿\u0005\u0004\"\u0082î!\u0085*äÀ\u000fzÈbK\rø\u0017Ì\u0091\u0005Âßª\r\b¦Æ>\u0010N)\u0083<:¥Mîfï,¬-¢¸B\u000el\u008c°\u009d>5æb^\u008bQ\u009bX\u0082kóæ\u0018\fÊ\u008cÂÚÇÁú²/\u001a\u001e`\u001f\u0095ÂR\fô;£¡\u0092\u0002(Wú-\u0017\fúà\u008fLBAÞ>ßâ¶}ÕÖ\u009bØ\u009fÏ!ÅÖ©¯6\npß\u00adø\u0087WwXA\u0080(É]&ÔO&Þ_veÝy\u0097j\u0003/r\u0015=\u0081\u0097É¨iX0\u009aL³¨ßa¬\u001b£\r\u009f±±m\u0010í¬«e\u0005\u0097Lu?4=9\u001fÎ±M\u0010¬ÓHð9)\u001b!q\u0010p`\u0000\u0001y÷(\u0015\u0081ý\u0093P\u00adíè\u008a¶û¤mÍ\u0018^'\u0001\u0016W \u0011¥\u001f³V'\u0098æÝ°ÈO\u008bÏ¹1Çªq"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[20];
                     fdj = null;
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "?\u001e$\u009eÈF\u0085ôQz\u0016-\u00951ØV\u001d&Å!S§)è:«è\u0011e\u0097ÿ\u001dX*\u008fëî2\u0005Lx·6©º~ùl\u0017gÍ÷EZsþ\u0010÷|\u0091UfÅG2²P6Hâ%Â¯";
                  var8 = "?\u001e$\u009eÈF\u0085ôQz\u0016-\u00951ØV\u001d&Å!S§)è:«è\u0011e\u0097ÿ\u001dX*\u008fëî2\u0005Lx·6©º~ùl\u0017gÍ÷EZsþ\u0010÷|\u0091UfÅG2²P6Hâ%Â¯"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28971;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("uci", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("uci" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
