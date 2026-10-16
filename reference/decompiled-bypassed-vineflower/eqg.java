import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class eqg extends AbstractSet {
   private static final Set aw_;
   private final Map zem = Maps.newHashMap();
   private final Set hr3 = Sets.newIdentityHashSet();
   private final Class b76;
   private final List cdo = Lists.newArrayList();
   public boolean b16;
   private static final long a;
   private static final String b;

   public eqg(Class var1) {
      this.b76 = var1;
      this.hr3.add(var1);
      this.zem.put(var1, this.cdo);

      for (Class var3 : aw_) {
         this.e_q(var3);
      }

      eqg var10000;
      boolean var10001;
      label19: {
         try {
            var10000 = this;
            if (this.cdo.size() == 0) {
               var10001 = true;
               break label19;
            }
         } catch (IllegalArgumentException var4) {
            throw a(var4);
         }

         var10001 = false;
      }

      var10000.b16 = var10001;
   }

   public void e_q(Class var1) {
      aw_.add(var1);
      int var2 = this.cdo.size();

      for (int var3 = 0; var3 < var2; var3++) {
         Object var4 = this.cdo.get(var3);

         try {
            if (var1.isAssignableFrom(var4.getClass())) {
               this.js1(var4, var1);
            }
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }
      }

      this.hr3.add(var1);
   }

   public Class aun(Class param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic eqg.a J
      // 03: ldc2_w 129197561522364
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield eqg.b76 Ljava/lang/Class;
      // 11: aload 1
      // 12: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 15: iload 4
      // 17: ifeq 41
      // 1a: ifeq 4b
      // 1d: goto 24
      // 20: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 0
      // 25: iload 4
      // 27: ifeq 45
      // 2a: goto 31
      // 2d: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: getfield eqg.hr3 Ljava/util/Set;
      // 34: aload 1
      // 35: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 3a: goto 41
      // 3d: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40: athrow
      // 41: ifne 49
      // 44: aload 0
      // 45: aload 1
      // 46: invokevirtual eqg.e_q (Ljava/lang/Class;)V
      // 49: aload 1
      // 4a: areturn
      // 4b: new java/lang/IllegalArgumentException
      // 4e: dup
      // 4f: new java/lang/StringBuilder
      // 52: dup
      // 53: invokespecial java/lang/StringBuilder.<init> ()V
      // 56: getstatic eqg.b Ljava/lang/String;
      // 59: nop
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: aload 1
      // 5e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 61: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 64: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 67: athrow
   }

   @Override
   public boolean add(Object param1) {
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
      // 05: getfield eqg.hr3 Ljava/util/Set;
      // 08: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 4b
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast java/lang/Class
      // 20: astore 4
      // 22: aload 4
      // 24: aload 1
      // 25: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 28: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 2b: iload 2
      // 2c: ifne 6c
      // 2f: ifeq 47
      // 32: goto 39
      // 35: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: aload 0
      // 3a: aload 1
      // 3b: aload 4
      // 3d: invokespecial eqg.js1 (Ljava/lang/Object;Ljava/lang/Class;)V
      // 40: goto 47
      // 43: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: iload 2
      // 48: ifeq 0e
      // 4b: aload 0
      // 4c: aload 0
      // 4d: getfield eqg.cdo Ljava/util/List;
      // 50: invokeinterface java/util/List.size ()I 1
      // 55: iload 2
      // 56: ifne 64
      // 59: ifne 67
      // 5c: goto 63
      // 5f: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: bipush 0
      // 68: putfield eqg.b16 Z
      // 6b: bipush 1
      // 6c: ireturn
   }

   private void js1(Object var1, Class var2) {
      List var3 = (List)this.zem.get(var2);

      label29: {
         try {
            if (var3 == null) {
               this.zem.put(var2, Lists.newArrayList(new Object[]{var1}));
               break label29;
            }
         } catch (IllegalArgumentException var5) {
            throw a(var5);
         }

         var3.add(var1);
      }

      eqg var10000;
      boolean var10001;
      label22: {
         try {
            var10000 = this;
            if (this.cdo.size() == 0) {
               var10001 = true;
               break label22;
            }
         } catch (IllegalArgumentException var4) {
            throw a(var4);
         }

         var10001 = false;
      }

      var10000.b16 = var10001;
   }

   @Override
   public boolean remove(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: astore 3
      // 02: invokestatic t9d.c ()I
      // 05: bipush 0
      // 06: istore 4
      // 08: istore 2
      // 09: aload 0
      // 0a: getfield eqg.hr3 Ljava/util/Set;
      // 0d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12: astore 5
      // 14: aload 5
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 90
      // 1e: aload 5
      // 20: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25: checkcast java/lang/Class
      // 28: astore 6
      // 2a: aload 6
      // 2c: iload 2
      // 2d: ifne 5e
      // 30: aload 3
      // 31: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 34: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 37: iload 2
      // 38: ifne b2
      // 3b: goto 42
      // 3e: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41: athrow
      // 42: ifeq 8c
      // 45: goto 4c
      // 48: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield eqg.zem Ljava/util/Map;
      // 50: aload 6
      // 52: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 57: goto 5e
      // 5a: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5d: athrow
      // 5e: checkcast java/util/List
      // 61: astore 7
      // 63: aload 7
      // 65: iload 2
      // 66: ifne 75
      // 69: ifnull 8c
      // 6c: goto 73
      // 6f: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 72: athrow
      // 73: aload 7
      // 75: aload 3
      // 76: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 7b: iload 2
      // 7c: ifne 8a
      // 7f: ifeq 8c
      // 82: goto 89
      // 85: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 88: athrow
      // 89: bipush 1
      // 8a: istore 4
      // 8c: iload 2
      // 8d: ifeq 14
      // 90: aload 0
      // 91: aload 0
      // 92: getfield eqg.cdo Ljava/util/List;
      // 95: invokeinterface java/util/List.size ()I 1
      // 9a: iload 2
      // 9b: ifne a9
      // 9e: ifne ac
      // a1: goto a8
      // a4: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // a7: athrow
      // a8: bipush 1
      // a9: goto ad
      // ac: bipush 0
      // ad: putfield eqg.b16 Z
      // b0: iload 4
      // b2: ireturn
   }

   @Override
   public boolean contains(Object var1) {
      return Iterators.contains(this.x_n(var1.getClass()).iterator(), var1);
   }

   public Iterable x_n(Class var1) {
      return new eqg$1(this, var1);
   }

   @Override
   public Iterator iterator() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield eqg.cdo Ljava/util/List;
      // 08: iload 1
      // 09: ifne 29
      // 0c: invokeinterface java/util/List.isEmpty ()Z 1
      // 11: ifeq 25
      // 14: goto 1b
      // 17: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: invokestatic com/google/common/collect/Iterators.emptyIterator ()Lcom/google/common/collect/UnmodifiableIterator;
      // 1e: goto 2c
      // 21: invokestatic eqg.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24: athrow
      // 25: aload 0
      // 26: getfield eqg.cdo Ljava/util/List;
      // 29: invokestatic net/optifine/util/IteratorCache.getReadOnly (Ljava/util/List;)Ljava/util/Iterator;
      // 2c: areturn
   }

   @Override
   public int size() {
      return this.cdo.size();
   }

   @Override
   public boolean isEmpty() {
      return this.b16;
   }

   public static Map dd1(eqg var0) {
      return var0.zem;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5945257652988335356L, 736663082485435391L, MethodHandles.lookup().lookupClass()).a(133853943313198L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 122184364913839L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ýÅÈ\u0093\t 8}I£Ì¥±ÑòROÈyÒuíY?»\u0093öX\u0080\u0005õ\u0084".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      aw_ = Collections.newSetFromMap(new ConcurrentHashMap());
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
}
