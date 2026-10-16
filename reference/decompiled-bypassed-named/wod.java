import java.util.List;

public class wod extends itu {
   public wod(int var1, float var2, boolean var3) {
      super(var1, var2, var3);
      this.oml(true);
   }

   @Override
   public boolean lsj(erg var1) {
      int var2 = OpaquePredicate.c();

      try {
         int var10000 = var1.j6_();
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw b(var3);
      }

      return (boolean)0;
   }

   @Override
   public b64 c1w(erg var1) {
      try {
         if (var1.j6_() == 0) {
            return b64.t6i;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return b64.sfj;
   }

   @Override
   public void lb1(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 4
      // 0b: ifne 38
      // 0e: ifne 34
      // 11: goto 18
      // 14: invokestatic wod.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 3
      // 19: new sdj
      // 1c: dup
      // 1d: getstatic mcs.m13 Lmcs;
      // 20: getfield mcs.zr9 I
      // 23: sipush 2400
      // 26: bipush 0
      // 27: invokespecial sdj.<init> (III)V
      // 2a: invokevirtual ha9.gmn (Lsdj;)V
      // 2d: goto 34
      // 30: invokestatic wod.b (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: invokevirtual erg.j6_ ()I
      // 38: iload 4
      // 3a: ifne 52
      // 3d: ifle a0
      // 40: goto 47
      // 43: invokestatic wod.b (Loov;)Loov;
      // 46: athrow
      // 47: aload 2
      // 48: getfield OpaquePredicate.v0f Z
      // 4b: goto 52
      // 4e: invokestatic wod.b (Loov;)Loov;
      // 51: athrow
      // 52: ifne ae
      // 55: aload 3
      // 56: new sdj
      // 59: dup
      // 5a: getstatic mcs.kkg Lmcs;
      // 5d: getfield mcs.zr9 I
      // 60: sipush 600
      // 63: bipush 4
      // 64: invokespecial sdj.<init> (III)V
      // 67: invokevirtual ha9.gmn (Lsdj;)V
      // 6a: aload 3
      // 6b: new sdj
      // 6e: dup
      // 6f: getstatic mcs.y3z Lmcs;
      // 72: getfield mcs.zr9 I
      // 75: sipush 6000
      // 78: bipush 0
      // 79: invokespecial sdj.<init> (III)V
      // 7c: invokevirtual ha9.gmn (Lsdj;)V
      // 7f: aload 3
      // 80: new sdj
      // 83: dup
      // 84: getstatic mcs.sw1 Lmcs;
      // 87: getfield mcs.zr9 I
      // 8a: sipush 6000
      // 8d: bipush 0
      // 8e: invokespecial sdj.<init> (III)V
      // 91: invokevirtual ha9.gmn (Lsdj;)V
      // 94: iload 4
      // 96: ifeq ae
      // 99: goto a0
      // 9c: invokestatic wod.b (Loov;)Loov;
      // 9f: athrow
      // a0: aload 0
      // a1: aload 1
      // a2: aload 2
      // a3: aload 3
      // a4: invokespecial itu.lb1 (Lerg;Lt9d;Lha9;)V
      // a7: goto ae
      // aa: invokestatic wod.b (Loov;)Loov;
      // ad: athrow
      // ae: return
   }

   @Override
   public void jlj(u7m var1, uja var2, List var3) {
      var3.add(new erg(var1, 1, 0));
      var3.add(new erg(var1, 1, 1));
   }

   private static oov b(oov var0) {
      return var0;
   }
}
