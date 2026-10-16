import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableTable;
import java.util.Collection;
import java.util.Iterator;

public abstract class j0s implements zfz {
   private static final Joiner ik4 = Joiner.on(',');
   private static final Function jp8 = new j0s$1();
   private int jeg = -1;
   private int ho9 = -1;
   private int yz9 = -1;
   private gdz ngu = null;

   public int zse() {
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
      // 05: getfield j0s.jeg I
      // 08: iload 1
      // 09: ifne 2c
      // 0c: ifge 28
      // 0f: goto 16
      // 12: invokestatic j0s.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual j0s.r_y ()Le0x;
      // 1b: invokestatic e0x.mxb (Le0x;)I
      // 1e: putfield j0s.jeg I
      // 21: goto 28
      // 24: invokestatic j0s.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield j0s.jeg I
      // 2c: ireturn
   }

   public int kqo() {
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
      // 05: getfield j0s.ho9 I
      // 08: iload 1
      // 09: ifne 29
      // 0c: ifge 25
      // 0f: goto 16
      // 12: invokestatic j0s.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokestatic e0x.r2y (Lzfz;)I
      // 1b: putfield j0s.ho9 I
      // 1e: goto 25
      // 21: invokestatic j0s.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield j0s.ho9 I
      // 29: ireturn
   }

   public int u5e() {
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
      // 05: getfield j0s.yz9 I
      // 08: iload 1
      // 09: ifne 2d
      // 0c: ifge 29
      // 0f: goto 16
      // 12: invokestatic j0s.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual j0s.r_y ()Le0x;
      // 1b: aload 0
      // 1c: invokevirtual e0x.hvp (Lzfz;)I
      // 1f: putfield j0s.yz9 I
      // 22: goto 29
      // 25: invokestatic j0s.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield j0s.yz9 I
      // 2d: ireturn
   }

   public gdz djt() {
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
      // 05: getfield j0s.ngu Lgdz;
      // 08: iload 1
      // 09: ifne 32
      // 0c: ifnonnull 2e
      // 0f: goto 16
      // 12: invokestatic j0s.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic e0x.db8 Ljnv;
      // 1a: aload 0
      // 1b: invokevirtual j0s.r_y ()Le0x;
      // 1e: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 21: checkcast gdz
      // 24: putfield j0s.ngu Lgdz;
      // 27: goto 2e
      // 2a: invokestatic j0s.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield j0s.ngu Lgdz;
      // 32: areturn
   }

   public ImmutableTable cmi() {
      return null;
   }

   @Override
   public zfz dm4(xny var1) {
      return this.zvi(var1, (Comparable)wxa(var1.isr(), this.dil(var1)));
   }

   public static Object wxa(Collection var0, Object var1) {
      int var2 = t9d.b();
      Iterator var3 = var0.iterator();

      while (var3.hasNext()) {
         boolean var10000 = var3.next().equals(var1);

         while (var10000) {
            try {
               if (var2 == 0) {
                  return var3;
               }

               var10000 = var3.hasNext();
               if (var2 == 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            try {
               if (var10000) {
                  return var3.next();
               }
            } catch (oov var5) {
               throw a(var5);
            }

            return var0.iterator().next();
         }
      }

      return var3.next();
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: new java/lang/StringBuilder
      // 07: dup
      // 08: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b: astore 2
      // 0c: aload 2
      // 0d: getstatic e0x.db8 Ljnv;
      // 10: aload 0
      // 11: invokevirtual j0s.r_y ()Le0x;
      // 14: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 17: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a: iload 1
      // 1b: ifne 5d
      // 1e: pop
      // 1f: aload 0
      // 20: invokevirtual j0s.q2y ()Lcom/google/common/collect/ImmutableMap;
      // 23: invokevirtual com/google/common/collect/ImmutableMap.isEmpty ()Z
      // 26: ifne 5c
      // 29: goto 30
      // 2c: invokestatic j0s.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 2
      // 31: ldc "["
      // 33: nop
      // 34: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37: pop
      // 38: getstatic j0s.ik4 Lcom/google/common/base/Joiner;
      // 3b: aload 2
      // 3c: aload 0
      // 3d: invokevirtual j0s.q2y ()Lcom/google/common/collect/ImmutableMap;
      // 40: invokevirtual com/google/common/collect/ImmutableMap.entrySet ()Lcom/google/common/collect/ImmutableSet;
      // 43: getstatic j0s.jp8 Lcom/google/common/base/Function;
      // 46: invokestatic com/google/common/collect/Iterables.transform (Ljava/lang/Iterable;Lcom/google/common/base/Function;)Ljava/lang/Iterable;
      // 49: invokevirtual com/google/common/base/Joiner.appendTo (Ljava/lang/StringBuilder;Ljava/lang/Iterable;)Ljava/lang/StringBuilder;
      // 4c: pop
      // 4d: aload 2
      // 4e: ldc "]"
      // 50: nop
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: pop
      // 55: goto 5c
      // 58: invokestatic j0s.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 2
      // 5d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
