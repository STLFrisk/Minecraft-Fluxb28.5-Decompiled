import java.lang.reflect.Array;

public class kja {
   public kja(Class var1, int var2) {
      this.k2y = var1;
      this.gqh = (Object[])Array.newInstance(var1, var2);
   }

   public Object ClientEvent(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield kja.q9b Ljava/util/concurrent/locks/ReadWriteLock;
      // 04: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock ()Ljava/util/concurrent/locks/Lock; 1
      // 09: invokeinterface java/util/concurrent/locks/Lock.lock ()V 1
      // 0e: aload 0
      // 0f: getfield kja.gqh [Ljava/lang/Object;
      // 12: aload 0
      // 13: getfield kja.egm I
      // 16: aload 1
      // 17: aastore
      // 18: invokestatic OpaquePredicate.b ()I
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getfield kja.egm I
      // 20: bipush 1
      // 21: iadd
      // 22: aload 0
      // 23: invokevirtual kja.g0m ()I
      // 26: irem
      // 27: putfield kja.egm I
      // 2a: istore 2
      // 2b: aload 0
      // 2c: iload 2
      // 2d: ifeq 61
      // 30: getfield kja.g5r I
      // 33: aload 0
      // 34: invokevirtual kja.g0m ()I
      // 37: if_icmpge 52
      // 3a: goto 41
      // 3d: invokestatic kja.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: dup
      // 43: getfield kja.g5r I
      // 46: bipush 1
      // 47: iadd
      // 48: putfield kja.g5r I
      // 4b: goto 52
      // 4e: invokestatic kja.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getfield kja.q9b Ljava/util/concurrent/locks/ReadWriteLock;
      // 56: invokeinterface java/util/concurrent/locks/ReadWriteLock.writeLock ()Ljava/util/concurrent/locks/Lock; 1
      // 5b: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
      // 60: aload 1
      // 61: areturn
   }

   public int g0m() {
      this.q9b.readLock().lock();
      int var1 = this.gqh.length;
      this.q9b.readLock().unlock();
      return var1;
   }

   public Object[] fqw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield kja.k2y Ljava/lang/Class;
      // 04: aload 0
      // 05: getfield kja.g5r I
      // 08: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 0b: checkcast [Ljava/lang/Object;
      // 0e: checkcast [Ljava/lang/Object;
      // 11: checkcast [Ljava/lang/Object;
      // 14: astore 2
      // 15: aload 0
      // 16: getfield kja.q9b Ljava/util/concurrent/locks/ReadWriteLock;
      // 19: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock ()Ljava/util/concurrent/locks/Lock; 1
      // 1e: invokeinterface java/util/concurrent/locks/Lock.lock ()V 1
      // 23: invokestatic OpaquePredicate.c ()I
      // 26: bipush 0
      // 27: istore 3
      // 28: istore 1
      // 29: iload 3
      // 2a: aload 0
      // 2b: getfield kja.g5r I
      // 2e: if_icmpge 78
      // 31: aload 0
      // 32: getfield kja.egm I
      // 35: aload 0
      // 36: getfield kja.g5r I
      // 39: isub
      // 3a: iload 3
      // 3b: iadd
      // 3c: aload 0
      // 3d: invokevirtual kja.g0m ()I
      // 40: irem
      // 41: istore 4
      // 43: iload 1
      // 44: ifne 86
      // 47: iload 1
      // 48: ifne 74
      // 4b: goto 52
      // 4e: invokestatic kja.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 4
      // 54: ifge 67
      // 57: goto 5e
      // 5a: invokestatic kja.a (Loov;)Loov;
      // 5d: athrow
      // 5e: iload 4
      // 60: aload 0
      // 61: invokevirtual kja.g0m ()I
      // 64: iadd
      // 65: istore 4
      // 67: aload 2
      // 68: iload 3
      // 69: aload 0
      // 6a: getfield kja.gqh [Ljava/lang/Object;
      // 6d: iload 4
      // 6f: aaload
      // 70: aastore
      // 71: iinc 3 1
      // 74: iload 1
      // 75: ifeq 29
      // 78: aload 0
      // 79: getfield kja.q9b Ljava/util/concurrent/locks/ReadWriteLock;
      // 7c: invokeinterface java/util/concurrent/locks/ReadWriteLock.readLock ()Ljava/util/concurrent/locks/Lock; 1
      // 81: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
      // 86: aload 2
      // 87: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
