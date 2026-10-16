import com.google.common.collect.Sets;
import java.util.Set;

public class svo extends arf {
   private static final Set bxs = Sets.newHashSet(new e0x[]{ox_.rs4, ox_.kqk, ox_._5i, ox_.l11, ox_.bqn, ox_.pl8, ox_.vd0, ox_._mc, ox_.dxo, ox_.p58});

   public svo(u7m$vz9 var1) {
      super(1.0F, var1, bxs);
   }

   @Override
   public boolean azl(e0x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic ox_.dxo Le0x;
      // 08: iload 2
      // 09: ifeq 22
      // 0c: if_acmpne 1e
      // 0f: goto 16
      // 12: invokestatic svo.b (Loov;)Loov;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 2e
      // 1a: invokestatic svo.b (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getstatic ox_._mc Le0x;
      // 22: if_acmpne 2d
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic svo.b (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
