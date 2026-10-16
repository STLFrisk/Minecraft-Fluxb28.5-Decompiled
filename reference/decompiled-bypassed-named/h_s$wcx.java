import java.util.Random;

public class h_s$wcx extends cjm {
   private h_s jqi;

   public h_s$wcx(h_s var1) {
      this.jqi = var1;
      this.k23(1);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield h_s$wcx.jqi Lh_s;
      // 08: invokevirtual h_s.gvh ()Lbww;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifeq 25
      // 11: invokevirtual bww.c68 ()Z
      // 14: ifne 24
      // 17: goto 1e
      // 1a: invokestatic h_s$wcx.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: ireturn
      // 20: invokestatic h_s$wcx.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 2
      // 25: invokevirtual bww.bgt ()D
      // 28: aload 0
      // 29: getfield h_s$wcx.jqi Lh_s;
      // 2c: getfield h_s.o2v D
      // 2f: dsub
      // 30: dstore 3
      // 31: aload 2
      // 32: invokevirtual bww.wbk ()D
      // 35: aload 0
      // 36: getfield h_s$wcx.jqi Lh_s;
      // 39: getfield h_s.kfp D
      // 3c: dsub
      // 3d: dstore 5
      // 3f: aload 2
      // 40: invokevirtual bww.hda ()D
      // 43: aload 0
      // 44: getfield h_s$wcx.jqi Lh_s;
      // 47: getfield h_s.vbd D
      // 4a: dsub
      // 4b: dstore 7
      // 4d: dload 3
      // 4e: dload 3
      // 4f: dmul
      // 50: dload 5
      // 52: dload 5
      // 54: dmul
      // 55: dadd
      // 56: dload 7
      // 58: dload 7
      // 5a: dmul
      // 5b: dadd
      // 5c: dstore 9
      // 5e: dload 9
      // 60: dconst_1
      // 61: dcmpg
      // 62: iload 1
      // 63: ifeq 8c
      // 66: iflt 8b
      // 69: goto 70
      // 6c: invokestatic h_s$wcx.a (Loov;)Loov;
      // 6f: athrow
      // 70: dload 9
      // 72: ldc2_w 3600.0
      // 75: dcmpl
      // 76: iload 1
      // 77: ifeq 8c
      // 7a: goto 81
      // 7d: invokestatic h_s$wcx.a (Loov;)Loov;
      // 80: athrow
      // 81: ifle 8f
      // 84: goto 8b
      // 87: invokestatic h_s$wcx.a (Loov;)Loov;
      // 8a: athrow
      // 8b: bipush 1
      // 8c: goto 90
      // 8f: bipush 0
      // 90: ireturn
   }

   @Override
   public boolean wh3() {
      return false;
   }

   @Override
   public void mnp() {
      Random var1 = this.jqi.mbr();
      double var2 = this.jqi.o2v + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var4 = this.jqi.kfp + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var6 = this.jqi.vbd + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      this.jqi.gvh().n5p(var2, var4, var6, 1.0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
