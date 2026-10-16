import com.google.common.collect.Lists;
import java.util.List;

public abstract class ofj {
   public List f2k = Lists.newArrayListWithCapacity(17424);
   public boolean rc3;

   public void wyf(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 1
      // 02: putfield ofj.rc3 Z
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: getfield ofj.f2k Ljava/util/List;
      // 0c: invokeinterface java/util/List.clear ()V 1
      // 11: istore 7
      // 13: aload 0
      // 14: dload 1
      // 15: putfield ofj.n55 D
      // 18: aload 0
      // 19: dload 3
      // 1a: putfield ofj.a9j D
      // 1d: aload 0
      // 1e: iload 7
      // 20: ifne 85
      // 23: dload 5
      // 25: putfield ofj.mnx D
      // 28: invokestatic net/optifine/SmartAnimations.isActive ()Z
      // 2b: ifeq 7d
      // 2e: goto 35
      // 31: invokestatic ofj.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: iload 7
      // 38: ifne 6a
      // 3b: goto 42
      // 3e: invokestatic ofj.b (Loov;)Loov;
      // 41: athrow
      // 42: getfield ofj.i18 Ljava/util/BitSet;
      // 45: ifnull 62
      // 48: goto 4f
      // 4b: invokestatic ofj.b (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield ofj.i18 Ljava/util/BitSet;
      // 53: invokestatic net/optifine/SmartAnimations.spritesRendered (Ljava/util/BitSet;)V
      // 56: iload 7
      // 58: ifeq 71
      // 5b: goto 62
      // 5e: invokestatic ofj.b (Loov;)Loov;
      // 61: athrow
      // 62: aload 0
      // 63: goto 6a
      // 66: invokestatic ofj.b (Loov;)Loov;
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield ofj.ln5 Ljava/util/BitSet;
      // 6e: putfield ofj.i18 Ljava/util/BitSet;
      // 71: aload 0
      // 72: getfield ofj.i18 Ljava/util/BitSet;
      // 75: invokevirtual java/util/BitSet.clear ()V
      // 78: iload 7
      // 7a: ifeq aa
      // 7d: aload 0
      // 7e: goto 85
      // 81: invokestatic ofj.b (Loov;)Loov;
      // 84: athrow
      // 85: getfield ofj.i18 Ljava/util/BitSet;
      // 88: iload 7
      // 8a: ifne a2
      // 8d: ifnull aa
      // 90: goto 97
      // 93: invokestatic ofj.b (Loov;)Loov;
      // 96: athrow
      // 97: aload 0
      // 98: getfield ofj.i18 Ljava/util/BitSet;
      // 9b: goto a2
      // 9e: invokestatic ofj.b (Loov;)Loov;
      // a1: athrow
      // a2: invokestatic net/optifine/SmartAnimations.spritesRendered (Ljava/util/BitSet;)V
      // a5: aload 0
      // a6: aconst_null
      // a7: putfield ofj.i18 Ljava/util/BitSet;
      // aa: return
   }

   public void g19(kqk var1) {
      mew var2 = var1.a7g();
      hzu.a4k((float)((double)var2.getX() - this.n55), (float)((double)var2.getY() - this.a9j), (float)((double)var2.getZ() - this.mnx));
   }

   public void j6c(kqk param1, w51 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield ofj.f2k Ljava/util/List;
      // 08: aload 1
      // 09: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e: pop
      // 0f: aload 0
      // 10: getfield ofj.i18 Ljava/util/BitSet;
      // 13: iload 3
      // 14: ifeq 30
      // 17: ifnull 52
      // 1a: goto 21
      // 1d: invokestatic ofj.b (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: getfield kqk.ltn Lcbc;
      // 25: aload 2
      // 26: invokevirtual cbc.pry (Lw51;)Ljava/util/BitSet;
      // 29: goto 30
      // 2c: invokestatic ofj.b (Loov;)Loov;
      // 2f: athrow
      // 30: astore 4
      // 32: aload 4
      // 34: iload 3
      // 35: ifeq 4d
      // 38: ifnull 52
      // 3b: goto 42
      // 3e: invokestatic ofj.b (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getfield ofj.i18 Ljava/util/BitSet;
      // 46: goto 4d
      // 49: invokestatic ofj.b (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 4
      // 4f: invokevirtual java/util/BitSet.or (Ljava/util/BitSet;)V
      // 52: return
   }

   public abstract void ebu(w51 var1);

   private static oov b(oov var0) {
      return var0;
   }
}
