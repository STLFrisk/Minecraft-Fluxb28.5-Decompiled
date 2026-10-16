import java.util.Iterator;

public class z7p implements y_f {
   public z7p(gdz var1, double var2, double var4, xdt var6) {
      this.k31 = var1;
      this.ah_ = var4;
      this.rn1 = var2;
      this.zg9 = var6;
   }

   @Override
   public int h_s() {
      int var2 = 0;
      int var10000 = t9d.c();
      Iterator var3 = this.pay.iterator();
      int var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            y_f var4 = (y_f)var3.next();
            var10000 = var2 + var4.h_s();
            if (var1 != 0) {
               break;
            }

            var2 = var10000;
            if (var1 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public vas npr() {
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
      // 05: invokevirtual z7p.h_s ()I
      // 08: istore 2
      // 09: aload 0
      // 0a: getfield z7p.pay Ljava/util/List;
      // 0d: invokeinterface java/util/List.isEmpty ()Z 1
      // 12: iload 1
      // 13: ifne 21
      // 16: ifne a3
      // 19: goto 20
      // 1c: invokestatic z7p.a (Loov;)Loov;
      // 1f: athrow
      // 20: iload 2
      // 21: iload 1
      // 22: ifne 3e
      // 25: ifeq a3
      // 28: goto 2f
      // 2b: invokestatic z7p.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield z7p.p3k Ljava/util/Random;
      // 33: iload 2
      // 34: invokevirtual java/util/Random.nextInt (I)I
      // 37: goto 3e
      // 3a: invokestatic z7p.a (Loov;)Loov;
      // 3d: athrow
      // 3e: istore 3
      // 3f: aload 0
      // 40: getfield z7p.pay Ljava/util/List;
      // 43: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 48: astore 4
      // 4a: aload 4
      // 4c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 51: ifeq 9f
      // 54: aload 4
      // 56: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5b: checkcast y_f
      // 5e: astore 5
      // 60: iload 3
      // 61: aload 5
      // 63: invokeinterface y_f.h_s ()I 1
      // 68: isub
      // 69: istore 3
      // 6a: iload 3
      // 6b: ifge 9b
      // 6e: aload 5
      // 70: invokeinterface y_f.npr ()Ljava/lang/Object; 1
      // 75: checkcast vas
      // 78: astore 6
      // 7a: aload 6
      // 7c: aload 6
      // 7e: invokevirtual vas.bjy ()D
      // 81: aload 0
      // 82: getfield z7p.rn1 D
      // 85: dmul
      // 86: invokevirtual vas.l4n (D)V
      // 89: aload 6
      // 8b: aload 6
      // 8d: invokevirtual vas.z3o ()D
      // 90: aload 0
      // 91: getfield z7p.ah_ D
      // 94: dmul
      // 95: invokevirtual vas.k8b (D)V
      // 98: aload 6
      // 9a: areturn
      // 9b: iload 1
      // 9c: ifeq 4a
      // 9f: getstatic dbu.e5c Lvas;
      // a2: areturn
      // a3: getstatic dbu.e5c Lvas;
      // a6: areturn
   }

   public void t57(y_f var1) {
      this.pay.add(var1);
   }

   public gdz b0n() {
      return this.k31;
   }

   public xdt w1m() {
      return this.zg9;
   }

   @Override
   public Object npr() {
      return this.npr();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
