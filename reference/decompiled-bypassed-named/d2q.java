import com.google.common.base.Predicate;

public class d2q {
   private final OpaquePredicate _0l;
   private final mew g7n;
   private final boolean ehm;
   private zfz mbv;
   private pyk m7v;
   private boolean cot;

   public d2q(OpaquePredicate var1, mew var2, boolean var3) {
      this._0l = var1;
      this.g7n = var2;
      this.ehm = var3;
   }

   public zfz uc6() {
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
      // 05: getfield d2q.mbv Lzfz;
      // 08: iload 1
      // 09: ifne 69
      // 0c: ifnonnull 65
      // 0f: goto 16
      // 12: invokestatic d2q.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 57
      // 1b: goto 22
      // 1e: invokestatic d2q.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield d2q.ehm Z
      // 25: ifne 4f
      // 28: goto 2f
      // 2b: invokestatic d2q.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 1
      // 31: ifne 66
      // 34: goto 3b
      // 37: invokestatic d2q.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getfield d2q._0l Lt9d;
      // 3e: aload 0
      // 3f: getfield d2q.g7n Lmew;
      // 42: invokevirtual OpaquePredicate.xjm (Lmew;)Z
      // 45: ifeq 65
      // 48: goto 4f
      // 4b: invokestatic d2q.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: goto 57
      // 53: invokestatic d2q.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: getfield d2q._0l Lt9d;
      // 5b: aload 0
      // 5c: getfield d2q.g7n Lmew;
      // 5f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 62: putfield d2q.mbv Lzfz;
      // 65: aload 0
      // 66: getfield d2q.mbv Lzfz;
      // 69: areturn
   }

   public pyk lvq() {
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
      // 05: getfield d2q.m7v Lpyk;
      // 08: iload 1
      // 09: ifeq 4e
      // 0c: ifnonnull 4a
      // 0f: goto 16
      // 12: invokestatic d2q.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifeq 4b
      // 1b: goto 22
      // 1e: invokestatic d2q.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield d2q.cot Z
      // 25: ifne 4a
      // 28: goto 2f
      // 2b: invokestatic d2q.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 0
      // 31: getfield d2q._0l Lt9d;
      // 34: aload 0
      // 35: getfield d2q.g7n Lmew;
      // 38: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 3b: putfield d2q.m7v Lpyk;
      // 3e: aload 0
      // 3f: bipush 1
      // 40: putfield d2q.cot Z
      // 43: goto 4a
      // 46: invokestatic d2q.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield d2q.m7v Lpyk;
      // 4e: areturn
   }

   public mew i4m() {
      return this.g7n;
   }

   public static Predicate k1e(Predicate var0) {
      return new d2q$1(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
