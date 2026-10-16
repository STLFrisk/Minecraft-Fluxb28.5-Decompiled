import java.util.Random;

public class bgc {
   public bgc(float var1, float var2, float var3, float var4) {
      this.r1c = var1;
      this.j04 = var2;
      this.ri6 = var3;
      this.lxd = var4;
      this.lbu = new Random();
      this.b4c = new tt9(0.0F, 0.0F, 0.0F);
      this.z9j = new bb_(0.0F, 0.0F);
   }

   public float lrx(float var1, float var2) {
      return var1 + this.lbu.nextFloat() * (var2 - var1);
   }

   public bb_ tzp(tt9 var1, tt9 var2) {
      bb_ var3 = new bb_(0.0F, 0.0F);
      this.b4c
         .s6x(Float.valueOf(var1.sl2().floatValue() - var2.sl2().floatValue()))
         .j2k(var1.c3r().floatValue() + this.qwu - (var2.c3r().floatValue() + this.qwu))
         .nfq(var1.cg8().floatValue() - var2.cg8().floatValue());
      double var4 = Math.hypot(this.b4c.sl2().doubleValue(), this.b4c.cg8().doubleValue());
      float var6 = (float)Math.atan2((double)this.b4c.cg8().floatValue(), (double)this.b4c.sl2().floatValue());
      float var7 = (float)Math.atan2((double)this.b4c.c3r().floatValue(), var4);
      float var8 = (float) (180.0 / Math.PI);
      float var9 = var6 * var8 - 90.0F;
      float var10 = -(var7 * var8);
      return var3.hem(var9).lhk(var10).o8s();
   }

   public void g27(float var1) {
      this.qwu = var1;
   }

   public bb_ sj0(bb_ param1, bb_ param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: getfield bgc.z9j Lbb_;
      // 09: aload 2
      // 0a: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 0d: invokevirtual java/lang/Float.floatValue ()F
      // 10: aload 1
      // 11: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 14: invokevirtual java/lang/Float.floatValue ()F
      // 17: fsub
      // 18: aload 2
      // 19: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 1c: invokevirtual java/lang/Float.floatValue ()F
      // 1f: aload 1
      // 20: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 23: invokevirtual java/lang/Float.floatValue ()F
      // 26: fsub
      // 27: invokestatic java/lang/Math.abs (F)F
      // 2a: ldc 5.0
      // 2c: nop
      // 2d: iload 5
      // 2f: ifeq 6c
      // 32: fcmpl
      // 33: ifle 70
      // 36: goto 3d
      // 39: invokestatic bgc.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 2
      // 3e: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 41: invokevirtual java/lang/Float.floatValue ()F
      // 44: aload 1
      // 45: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 48: invokevirtual java/lang/Float.floatValue ()F
      // 4b: fsub
      // 4c: invokestatic java/lang/Math.abs (F)F
      // 4f: aload 2
      // 50: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 53: invokevirtual java/lang/Float.floatValue ()F
      // 56: aload 1
      // 57: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 5a: invokevirtual java/lang/Float.floatValue ()F
      // 5d: fsub
      // 5e: invokestatic java/lang/Math.abs (F)F
      // 61: fdiv
      // 62: fconst_2
      // 63: fmul
      // 64: fconst_2
      // 65: goto 6c
      // 68: invokestatic bgc.a (Loov;)Loov;
      // 6b: athrow
      // 6c: fdiv
      // 6d: goto 71
      // 70: fconst_0
      // 71: fsub
      // 72: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 75: invokevirtual bb_.hem (Ljava/lang/Float;)Lbb_;
      // 78: aload 2
      // 79: invokevirtual bb_.jub ()Ljava/lang/Float;
      // 7c: invokevirtual java/lang/Float.floatValue ()F
      // 7f: aload 1
      // 80: invokevirtual bb_.jub ()Ljava/lang/Float;
      // 83: invokevirtual java/lang/Float.floatValue ()F
      // 86: fsub
      // 87: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 8a: invokevirtual bb_.lhk (Ljava/lang/Float;)Lbb_;
      // 8d: invokevirtual bb_.o8s ()Lbb_;
      // 90: aload 2
      // 91: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 94: invokevirtual java/lang/Float.floatValue ()F
      // 97: aload 0
      // 98: getfield bgc.z9j Lbb_;
      // 9b: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 9e: invokevirtual java/lang/Float.floatValue ()F
      // a1: fload 4
      // a3: fdiv
      // a4: aload 0
      // a5: aload 0
      // a6: getfield bgc.r1c F
      // a9: aload 0
      // aa: getfield bgc.j04 F
      // ad: invokevirtual bgc.lrx (FF)F
      // b0: fmul
      // b1: fsub
      // b2: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // b5: invokevirtual bb_.hem (Ljava/lang/Float;)Lbb_;
      // b8: invokevirtual bb_.o8s ()Lbb_;
      // bb: aload 2
      // bc: invokevirtual bb_.jub ()Ljava/lang/Float;
      // bf: invokevirtual java/lang/Float.floatValue ()F
      // c2: aload 0
      // c3: getfield bgc.z9j Lbb_;
      // c6: invokevirtual bb_.jub ()Ljava/lang/Float;
      // c9: invokevirtual java/lang/Float.floatValue ()F
      // cc: fload 3
      // cd: fdiv
      // ce: aload 0
      // cf: aload 0
      // d0: getfield bgc.ri6 F
      // d3: aload 0
      // d4: getfield bgc.lxd F
      // d7: invokevirtual bgc.lrx (FF)F
      // da: fmul
      // db: fsub
      // dc: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // df: invokevirtual bb_.lhk (Ljava/lang/Float;)Lbb_;
      // e2: invokevirtual bb_.o8s ()Lbb_;
      // e5: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
