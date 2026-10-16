public class eij {
   public float ikn;
   public float z7o;

   public eij(float var1, float var2) {
      this.ikn = var1;
      this.z7o = var2;
   }

   public float r8p() {
      return this.ikn;
   }

   public float jqw() {
      return this.z7o;
   }

   public void k6h(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield eij.ikn F
      // 08: invokestatic java/lang/Float.isNaN (F)Z
      // 0b: iload 2
      // 0c: ifeq 32
      // 0f: ifne 35
      // 12: goto 19
      // 15: invokestatic eij.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifeq 37
      // 1e: goto 25
      // 21: invokestatic eij.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield eij.z7o F
      // 28: invokestatic java/lang/Float.isNaN (F)Z
      // 2b: goto 32
      // 2e: invokestatic eij.a (Loov;)Loov;
      // 31: athrow
      // 32: ifeq 36
      // 35: return
      // 36: aload 0
      // 37: invokestatic c05.vz1 ()Lc05;
      // 3a: getfield c05.oxn Lmoh;
      // 3d: getfield moh.igw F
      // 40: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 43: invokevirtual eij.eft (Ljava/lang/Float;)V
      // 46: aload 1
      // 47: aload 0
      // 48: getfield eij.ikn F
      // 4b: putfield ha9.x5k F
      // 4e: aload 1
      // 4f: aload 0
      // 50: getfield eij.z7o F
      // 53: putfield ha9.y2i F
      // 56: return
   }

   public void eft(Float var1) {
      float var2 = var1 * 0.6F + 0.2F;
      float var3 = var2 * var2 * var2 * 1.2F;
      this.ikn = this.ikn - this.ikn % var3;
      this.z7o = this.z7o - this.z7o % var3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
