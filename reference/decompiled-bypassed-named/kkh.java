public class kkh extends gt4 {
   private float cmx = 1.0F;
   public boolean q0k;
   private moh$_ru w3t;
   private final float z6p;
   private final float b6s;

   public kkh(int var1, int var2, int var3, moh$_ru var4) {
      this(var1, var2, var3, var4, 0.0F, 1.0F);
   }

   public kkh(int var1, int var2, int var3, moh$_ru var4, float var5, float var6) {
      super(var1, var2, var3, 150, 20, "");
      this.w3t = var4;
      this.z6p = var5;
      this.b6s = var6;
      Minecraft var7 = Minecraft.vz1();
      this.cmx = var4.gou(var7.oxn.yel(var4));
      this.frg = var7.oxn.ycx(var4);
   }

   @Override
   public int getHoverState(boolean var1) {
      return 0;
   }

   @Override
   public void mouseDragged(Minecraft param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield kkh.c1s Z
      // 09: iload 4
      // 0b: ifne 23
      // 0e: ifeq f6
      // 11: goto 18
      // 14: invokestatic kkh.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield kkh.q0k Z
      // 1c: goto 23
      // 1f: invokestatic kkh.c (Loov;)Loov;
      // 22: athrow
      // 23: iload 4
      // 25: ifne af
      // 28: ifeq 8b
      // 2b: goto 32
      // 2e: invokestatic kkh.c (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: iload 2
      // 34: aload 0
      // 35: getfield kkh.ibo I
      // 38: bipush 4
      // 39: iadd
      // 3a: isub
      // 3b: i2f
      // 3c: aload 0
      // 3d: getfield kkh.s22 I
      // 40: bipush 8
      // 42: isub
      // 43: i2f
      // 44: fdiv
      // 45: putfield kkh.cmx F
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield kkh.cmx F
      // 4d: fconst_0
      // 4e: fconst_1
      // 4f: invokestatic fe6._f3 (FFF)F
      // 52: putfield kkh.cmx F
      // 55: aload 0
      // 56: getfield kkh.w3t Lmoh$_ru;
      // 59: aload 0
      // 5a: getfield kkh.cmx F
      // 5d: invokevirtual moh$_ru.yr1 (F)F
      // 60: fstore 5
      // 62: aload 1
      // 63: getfield Minecraft.oxn Lmoh;
      // 66: aload 0
      // 67: getfield kkh.w3t Lmoh$_ru;
      // 6a: fload 5
      // 6c: invokevirtual moh.pra (Lmoh$_ru;F)V
      // 6f: aload 0
      // 70: aload 0
      // 71: getfield kkh.w3t Lmoh$_ru;
      // 74: fload 5
      // 76: invokevirtual moh$_ru.gou (F)F
      // 79: putfield kkh.cmx F
      // 7c: aload 0
      // 7d: aload 1
      // 7e: getfield Minecraft.oxn Lmoh;
      // 81: aload 0
      // 82: getfield kkh.w3t Lmoh$_ru;
      // 85: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 88: putfield kkh.frg Ljava/lang/String;
      // 8b: aload 1
      // 8c: invokevirtual Minecraft.l22 ()Llc5;
      // 8f: getstatic kkh.lib Lgdz;
      // 92: invokevirtual lc5.anl (Lgdz;)V
      // 95: fconst_1
      // 96: fconst_1
      // 97: fconst_1
      // 98: fconst_1
      // 99: invokestatic hzu.wn0 (FFFF)V
      // 9c: aload 0
      // 9d: getfield kkh.ibo I
      // a0: aload 0
      // a1: getfield kkh.cmx F
      // a4: aload 0
      // a5: getfield kkh.s22 I
      // a8: bipush 8
      // aa: isub
      // ab: i2f
      // ac: fmul
      // ad: f2i
      // ae: iadd
      // af: istore 5
      // b1: iload 5
      // b3: i2f
      // b4: ldc 1.5
      // b6: nop
      // b7: fadd
      // b8: aload 0
      // b9: getfield kkh.mij I
      // bc: i2f
      // bd: iload 5
      // bf: i2f
      // c0: ldc 6.5
      // c2: nop
      // c3: fadd
      // c4: aload 0
      // c5: getfield kkh.mij I
      // c8: bipush 20
      // ca: iadd
      // cb: i2f
      // cc: getstatic java/awt/Color.black Ljava/awt/Color;
      // cf: invokevirtual java/awt/Color.getRGB ()I
      // d2: invokestatic b0t.df9 (FFFFI)V
      // d5: iload 5
      // d7: bipush 2
      // d8: iadd
      // d9: i2f
      // da: aload 0
      // db: getfield kkh.mij I
      // de: i2f
      // df: iload 5
      // e1: bipush 6
      // e3: iadd
      // e4: i2f
      // e5: aload 0
      // e6: getfield kkh.mij I
      // e9: bipush 20
      // eb: iadd
      // ec: i2f
      // ed: getstatic java/awt/Color.white Ljava/awt/Color;
      // f0: invokevirtual java/awt/Color.getRGB ()I
      // f3: invokestatic b0t.df9 (FFFFI)V
      // f6: return
   }

   @Override
   public boolean mousePressed(Minecraft param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: iload 2
      // 08: iload 3
      // 09: invokespecial gt4.mousePressed (Lc05;II)Z
      // 0c: iload 4
      // 0e: ifeq 6f
      // 11: ifeq 6e
      // 14: goto 1b
      // 17: invokestatic kkh.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 2
      // 1d: aload 0
      // 1e: getfield kkh.ibo I
      // 21: bipush 4
      // 22: iadd
      // 23: isub
      // 24: i2f
      // 25: aload 0
      // 26: getfield kkh.s22 I
      // 29: bipush 8
      // 2b: isub
      // 2c: i2f
      // 2d: fdiv
      // 2e: putfield kkh.cmx F
      // 31: aload 0
      // 32: aload 0
      // 33: getfield kkh.cmx F
      // 36: fconst_0
      // 37: fconst_1
      // 38: invokestatic fe6._f3 (FFF)F
      // 3b: putfield kkh.cmx F
      // 3e: aload 1
      // 3f: getfield Minecraft.oxn Lmoh;
      // 42: aload 0
      // 43: getfield kkh.w3t Lmoh$_ru;
      // 46: aload 0
      // 47: getfield kkh.w3t Lmoh$_ru;
      // 4a: aload 0
      // 4b: getfield kkh.cmx F
      // 4e: invokevirtual moh$_ru.yr1 (F)F
      // 51: invokevirtual moh.pra (Lmoh$_ru;F)V
      // 54: aload 0
      // 55: aload 1
      // 56: getfield Minecraft.oxn Lmoh;
      // 59: aload 0
      // 5a: getfield kkh.w3t Lmoh$_ru;
      // 5d: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 60: putfield kkh.frg Ljava/lang/String;
      // 63: aload 0
      // 64: bipush 1
      // 65: putfield kkh.q0k Z
      // 68: bipush 1
      // 69: ireturn
      // 6a: invokestatic kkh.c (Loov;)Loov;
      // 6d: athrow
      // 6e: bipush 0
      // 6f: ireturn
   }

   @Override
   public void mouseReleased(int var1, int var2) {
      this.q0k = false;
   }

   private static oov c(oov var0) {
      return var0;
   }
}
