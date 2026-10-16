import com.google.common.base.Predicate;

public class s24 extends wel {
   public final Class k4p;
   private final int fy3;
   public final s24$tx3 q3q;
   public Predicate p6x;
   public Entity h94;

   public s24(EntityPlayer var1, Class var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public s24(EntityPlayer var1, Class var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, (Predicate)null);
   }

   public s24(EntityPlayer var1, Class var2, int var3, boolean var4, boolean var5, Predicate var6) {
      super(var1, var4, var5);
      this.k4p = var2;
      this.fy3 = var3;
      this.q3q = new s24$tx3(var1);
      this.k23(1);
      this.p6x = new s24$1(this, var6);
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 40
      // 09: getfield s24.fy3 I
      // 0c: ifle 3f
      // 0f: goto 16
      // 12: invokestatic s24.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 40
      // 1b: goto 22
      // 1e: invokestatic s24.b (Loov;)Loov;
      // 21: athrow
      // 22: getfield s24.pf7 Llaq;
      // 25: invokevirtual EntityPlayer.mbr ()Ljava/util/Random;
      // 28: aload 0
      // 29: getfield s24.fy3 I
      // 2c: invokevirtual java/util/Random.nextInt (I)I
      // 2f: ifeq 3f
      // 32: goto 39
      // 35: invokestatic s24.b (Loov;)Loov;
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
      // 3b: invokestatic s24.b (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual s24.uyl ()D
      // 43: dstore 2
      // 44: aload 0
      // 45: getfield s24.pf7 Llaq;
      // 48: getfield EntityPlayer.oay Lt9d;
      // 4b: aload 0
      // 4c: getfield s24.k4p Ljava/lang/Class;
      // 4f: aload 0
      // 50: getfield s24.pf7 Llaq;
      // 53: invokevirtual EntityPlayer.aaw ()Lnh4;
      // 56: dload 2
      // 57: ldc2_w 4.0
      // 5a: dload 2
      // 5b: invokevirtual nh4.c2h (DDD)Lnh4;
      // 5e: aload 0
      // 5f: getfield s24.p6x Lcom/google/common/base/Predicate;
      // 62: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 65: invokestatic com/google/common/base/Predicates.and (Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 68: invokevirtual OpaquePredicate.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 6b: astore 4
      // 6d: aload 4
      // 6f: aload 0
      // 70: getfield s24.q3q Ls24$tx3;
      // 73: invokestatic java/util/Collections.sort (Ljava/util/List;Ljava/util/Comparator;)V
      // 76: aload 4
      // 78: invokeinterface java/util/List.isEmpty ()Z 1
      // 7d: iload 1
      // 7e: ifne a1
      // 81: ifeq 91
      // 84: goto 8b
      // 87: invokestatic s24.b (Loov;)Loov;
      // 8a: athrow
      // 8b: bipush 0
      // 8c: ireturn
      // 8d: invokestatic s24.b (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: aload 4
      // 94: bipush 0
      // 95: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 9a: checkcast Entity
      // 9d: putfield s24.h94 Lg_3;
      // a0: bipush 1
      // a1: ireturn
   }

   @Override
   public void mnp() {
      this.pf7.ux8(this.h94);
      super.mnp();
   }

   private static oov b(oov var0) {
      return var0;
   }
}
