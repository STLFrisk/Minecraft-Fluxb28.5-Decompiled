import java.util.ArrayList;

public class zet {
   private static final ArrayList xx2 = new ArrayList();

   @jev
   public void a_y(da6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: getstatic ipp.p_z Lcn7;
      // 07: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifeq ab
      // 11: ifeq 93
      // 14: goto 1b
      // 17: invokestatic zet.a (Loov;)Loov;
      // 1a: athrow
      // 1b: new eka
      // 1e: dup
      // 1f: invokestatic c05.vz1 ()Lc05;
      // 22: invokespecial eka.<init> (Lc05;)V
      // 25: astore 3
      // 26: aload 3
      // 27: invokevirtual eka.lrx ()I
      // 2a: bipush 24
      // 2c: isub
      // 2d: i2f
      // 2e: fstore 4
      // 30: getstatic zet.xx2 Ljava/util/ArrayList;
      // 33: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 36: astore 5
      // 38: aload 5
      // 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f: ifeq 83
      // 42: aload 5
      // 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49: checkcast jgv
      // 4c: astore 6
      // 4e: iload 2
      // 4f: ifeq 8f
      // 52: aload 6
      // 54: iload 2
      // 55: ifeq 6e
      // 58: goto 5f
      // 5b: invokestatic zet.a (Loov;)Loov;
      // 5e: athrow
      // 5f: ifnonnull 6c
      // 62: goto 69
      // 65: invokestatic zet.a (Loov;)Loov;
      // 68: athrow
      // 69: goto 38
      // 6c: aload 6
      // 6e: fload 4
      // 70: invokevirtual jgv.ijf (F)V
      // 73: fload 4
      // 75: aload 6
      // 77: invokevirtual jgv.blk ()F
      // 7a: fconst_1
      // 7b: fadd
      // 7c: fsub
      // 7d: fstore 4
      // 7f: iload 2
      // 80: ifne 38
      // 83: getstatic zet.xx2 Ljava/util/ArrayList;
      // 86: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, jgv.wqd ()Z, (Ljgv;)Z ]
      // 8b: invokevirtual java/util/ArrayList.removeIf (Ljava/util/function/Predicate;)Z
      // 8e: pop
      // 8f: iload 2
      // 90: ifne b4
      // 93: getstatic zet.xx2 Ljava/util/ArrayList;
      // 96: iload 2
      // 97: ifeq b1
      // 9a: goto a1
      // 9d: invokestatic zet.a (Loov;)Loov;
      // a0: athrow
      // a1: invokevirtual java/util/ArrayList.isEmpty ()Z
      // a4: goto ab
      // a7: invokestatic zet.a (Loov;)Loov;
      // aa: athrow
      // ab: ifne b4
      // ae: getstatic zet.xx2 Ljava/util/ArrayList;
      // b1: invokevirtual java/util/ArrayList.clear ()V
      // b4: return
   }

   public static void gn0(String var0, String var1, jgv$vro var2) {
      xx2.add(new jgv(var0, var1, var2, 2500L));
   }

   public static void f9h(String var0, String var1, jgv$vro var2, long var3) {
      xx2.add(new jgv(var0, var1, var2, var3));
   }

   public static void sh0(String var0, String var1, ar7 var2) {
      xx2.add(new jgv(var0, var1, jgv$vro.gi9, 2500L, var2));
   }

   private static oov a(oov var0) {
      return var0;
   }
}
