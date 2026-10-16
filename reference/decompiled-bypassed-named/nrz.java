import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class nrz extends dxd {
   private final s9r krb;
   private final List d5l = Lists.newArrayList();
   private final List uqv = Lists.newArrayList();
   private final dxd$v9l c40 = new nat();
   private int kxb = -1;

   public nrz(s9r var1, Minecraft var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.krb = var1;
   }

   @Override
   public dxd$v9l jb4(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: aload 0
      // 06: getfield nrz.d5l Ljava/util/List;
      // 09: invokeinterface java/util/List.size ()I 1
      // 0e: iload 2
      // 0f: ifeq 38
      // 12: if_icmpge 2e
      // 15: goto 1c
      // 18: invokestatic nrz.c (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield nrz.d5l Ljava/util/List;
      // 20: iload 1
      // 21: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 26: checkcast dxd$v9l
      // 29: areturn
      // 2a: invokestatic nrz.c (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 1
      // 2f: aload 0
      // 30: getfield nrz.d5l Ljava/util/List;
      // 33: invokeinterface java/util/List.size ()I 1
      // 38: isub
      // 39: istore 1
      // 3a: iload 2
      // 3b: ifeq 55
      // 3e: iload 1
      // 3f: ifne 52
      // 42: goto 49
      // 45: invokestatic nrz.c (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield nrz.c40 Ldxd$v9l;
      // 4d: areturn
      // 4e: invokestatic nrz.c (Loov;)Loov;
      // 51: athrow
      // 52: iinc 1 -1
      // 55: aload 0
      // 56: getfield nrz.uqv Ljava/util/List;
      // 59: iload 1
      // 5a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5f: checkcast dxd$v9l
      // 62: areturn
   }

   @Override
   public int getSize() {
      return this.d5l.size() + 1 + this.uqv.size();
   }

   public void uc2(int var1) {
      this.kxb = var1;
   }

   @Override
   public boolean isSelected(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 1f
      // 09: aload 0
      // 0a: getfield nrz.kxb I
      // 0d: if_icmpne 22
      // 10: goto 17
      // 13: invokestatic nrz.c (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic nrz.c (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   public int cil() {
      return this.kxb;
   }

   public void m7q(fh6 var1) {
      this.d5l.clear();
      int var10000 = OpaquePredicate.c();
      int var3 = 0;
      int var2 = var10000;

      while (var3 < var1.aik()) {
         this.d5l.add(new bbv(this.krb, var1.da_(var3)));
         var3++;
         if (var2 != 0) {
            break;
         }
      }
   }

   public void u33(List var1) {
      this.uqv.clear();
      int var10000 = OpaquePredicate.b();
      Iterator var3 = var1.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         b1f$pll var4 = (b1f$pll)var3.next();
         this.uqv.add(new ks6(this.krb, var4));
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public int getScrollBarX() {
      return super.getScrollBarX() + 30;
   }

   @Override
   public int getListWidth() {
      return super.getListWidth() + 85;
   }

   private static oov c(oov var0) {
      return var0;
   }
}
