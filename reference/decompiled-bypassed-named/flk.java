public class flk {
   public static final flk i7m = new flk();
   public static float mzw = 0.0F;
   public static float s34 = 0.0F;
   public static float pij = 0.0F;
   public static float ja3 = 0.0F;
   public static float hl8 = 0.0F;
   public static float q_i = 0.0F;
   public static float hxb = 0.0F;
   public static float p2n = 0.0F;
   public static float tg8 = 0.0F;
   public final hej pgd;
   public final hej x6y;
   public final hej tvs;
   public final hej q31;
   public final hej pj2;
   public final hej c8l;

   private flk() {
      this(hej.i26, hej.i26, hej.i26, hej.i26, hej.i26, hej.i26);
   }

   public flk(flk var1) {
      this.pgd = var1.pgd;
      this.x6y = var1.x6y;
      this.tvs = var1.tvs;
      this.q31 = var1.q31;
      this.pj2 = var1.pj2;
      this.c8l = var1.c8l;
   }

   public flk(hej var1, hej var2, hej var3, hej var4, hej var5, hej var6) {
      this.pgd = var1;
      this.x6y = var2;
      this.tvs = var3;
      this.q31 = var4;
      this.pj2 = var5;
      this.c8l = var6;
   }

   public void vqs(flk$gbm param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual flk.zem (Lflk$gbm;)Lhej;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 7b
      // 0f: getstatic hej.i26 Lhej;
      // 12: if_acmpeq 9e
      // 15: goto 1c
      // 18: invokestatic flk.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 3
      // 1d: getfield hej.tas Lorg/lwjgl/util/vector/Vector3f;
      // 20: getfield org/lwjgl/util/vector/Vector3f.x F
      // 23: getstatic flk.mzw F
      // 26: fadd
      // 27: aload 3
      // 28: getfield hej.tas Lorg/lwjgl/util/vector/Vector3f;
      // 2b: getfield org/lwjgl/util/vector/Vector3f.y F
      // 2e: getstatic flk.s34 F
      // 31: fadd
      // 32: aload 3
      // 33: getfield hej.tas Lorg/lwjgl/util/vector/Vector3f;
      // 36: getfield org/lwjgl/util/vector/Vector3f.z F
      // 39: getstatic flk.pij F
      // 3c: fadd
      // 3d: invokestatic hzu.a4k (FFF)V
      // 40: aload 3
      // 41: getfield hej.eip Lorg/lwjgl/util/vector/Vector3f;
      // 44: getfield org/lwjgl/util/vector/Vector3f.y F
      // 47: getstatic flk.hl8 F
      // 4a: fadd
      // 4b: fconst_0
      // 4c: fconst_1
      // 4d: fconst_0
      // 4e: invokestatic hzu.a2h (FFFF)V
      // 51: aload 3
      // 52: getfield hej.eip Lorg/lwjgl/util/vector/Vector3f;
      // 55: getfield org/lwjgl/util/vector/Vector3f.x F
      // 58: getstatic flk.ja3 F
      // 5b: fadd
      // 5c: fconst_1
      // 5d: fconst_0
      // 5e: fconst_0
      // 5f: invokestatic hzu.a2h (FFFF)V
      // 62: aload 3
      // 63: getfield hej.eip Lorg/lwjgl/util/vector/Vector3f;
      // 66: getfield org/lwjgl/util/vector/Vector3f.z F
      // 69: getstatic flk.q_i F
      // 6c: fadd
      // 6d: fconst_0
      // 6e: fconst_0
      // 6f: fconst_1
      // 70: invokestatic hzu.a2h (FFFF)V
      // 73: aload 3
      // 74: goto 7b
      // 77: invokestatic flk.a (Loov;)Loov;
      // 7a: athrow
      // 7b: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 7e: getfield org/lwjgl/util/vector/Vector3f.x F
      // 81: getstatic flk.hxb F
      // 84: fadd
      // 85: aload 3
      // 86: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 89: getfield org/lwjgl/util/vector/Vector3f.y F
      // 8c: getstatic flk.p2n F
      // 8f: fadd
      // 90: aload 3
      // 91: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 94: getfield org/lwjgl/util/vector/Vector3f.z F
      // 97: getstatic flk.tg8 F
      // 9a: fadd
      // 9b: invokestatic hzu.syc (FFF)V
      // 9e: return
   }

   public hej zem(flk$gbm var1) {
      try {
         switch (flk$1.r60[var1.ordinal()]) {
            case 1:
               return this.pgd;
            case 2:
               return this.x6y;
            case 3:
               return this.tvs;
            case 4:
               return this.q31;
            case 5:
               return this.pj2;
            case 6:
               return this.c8l;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return hej.i26;
   }

   public boolean qgt(flk$gbm var1) {
      int var2 = OpaquePredicate.b();

      try {
         boolean var10000 = this.zem(var1).equals(hej.i26);
         if (var2 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
