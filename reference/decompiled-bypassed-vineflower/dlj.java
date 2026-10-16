import com.google.common.collect.Sets;
import java.util.Set;

public class dlj extends arf {
   private static final Set ga2 = Sets.newHashSet(new e0x[]{ox_.wb7, ox_.kzr, ox_.uom, ox_.a4y, ox_.cug, ox_.jzx, ox_.pj4, ox_.gdb, ox_.h49});

   public dlj(u7m$vz9 var1) {
      super(3.0F, var1, ga2);
   }

   @Override
   public float v1f(erg param1, e0x param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual e0x.p1r ()Lp3y;
      // 08: getstatic p3y.fdu Lp3y;
      // 0b: iload 3
      // 0c: ifeq 27
      // 0f: if_acmpeq 53
      // 12: goto 19
      // 15: invokestatic dlj.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 2
      // 1a: invokevirtual e0x.p1r ()Lp3y;
      // 1d: getstatic p3y.nc7 Lp3y;
      // 20: goto 27
      // 23: invokestatic dlj.b (Loov;)Loov;
      // 26: athrow
      // 27: iload 3
      // 28: ifeq 43
      // 2b: if_acmpeq 53
      // 2e: goto 35
      // 31: invokestatic dlj.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 2
      // 36: invokevirtual e0x.p1r ()Lp3y;
      // 39: getstatic p3y.wui Lp3y;
      // 3c: goto 43
      // 3f: invokestatic dlj.b (Loov;)Loov;
      // 42: athrow
      // 43: if_acmpeq 53
      // 46: aload 0
      // 47: aload 1
      // 48: aload 2
      // 49: invokespecial arf.v1f (Lerg;Le0x;)F
      // 4c: goto 57
      // 4f: invokestatic dlj.b (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield dlj.qng F
      // 57: freturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
