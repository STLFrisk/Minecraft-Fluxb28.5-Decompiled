import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class scc extends gt4 {
   private float zf9 = 1.0F;
   public boolean qrs;
   private String rr0;
   private final float wnj;
   private final float uss;
   private final gkx$lpc v_3;
   private scc$yp_ p2w;
   private static final long b;
   private static final String f;

   public scc(gkx$lpc var1, int var2, int var3, int var4, String var5, float var6, float var7, float var8, scc$yp_ var9) {
      super(var2, var3, var4, 150, 20, "");
      this.rr0 = var5;
      this.wnj = var6;
      this.uss = var7;
      this.zf9 = (var8 - var6) / (var7 - var6);
      this.p2w = var9;
      this.v_3 = var1;
      this.frg = this.fw0();
   }

   public float gat() {
      return this.wnj + (this.uss - this.wnj) * this.zf9;
   }

   public void gd5(float param1, boolean param2) {
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
      // 05: fload 1
      // 06: aload 0
      // 07: getfield scc.wnj F
      // 0a: fsub
      // 0b: aload 0
      // 0c: getfield scc.uss F
      // 0f: aload 0
      // 10: getfield scc.wnj F
      // 13: fsub
      // 14: fdiv
      // 15: putfield scc.zf9 F
      // 18: aload 0
      // 19: iload 3
      // 1a: ifeq 37
      // 1d: aload 0
      // 1e: invokespecial scc.fw0 ()Ljava/lang/String;
      // 21: putfield scc.frg Ljava/lang/String;
      // 24: iload 2
      // 25: ifeq 47
      // 28: goto 2f
      // 2b: invokestatic scc.c (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: goto 37
      // 33: invokestatic scc.c (Loov;)Loov;
      // 36: athrow
      // 37: getfield scc.v_3 Lgkx$lpc;
      // 3a: aload 0
      // 3b: getfield scc._me I
      // 3e: aload 0
      // 3f: invokevirtual scc.gat ()F
      // 42: invokeinterface gkx$lpc.ba0 (IF)V 3
      // 47: return
   }

   public float _q7() {
      return this.zf9;
   }

   private String fw0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic scc.b J
      // 03: ldc2_w 133788058019154
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield scc.p2w Lscc$yp_;
      // 10: iload 3
      // 11: ifne 4f
      // 14: ifnonnull 4b
      // 17: goto 1e
      // 1a: invokestatic scc.c (Loov;)Loov;
      // 1d: athrow
      // 1e: new java/lang/StringBuilder
      // 21: dup
      // 22: invokespecial java/lang/StringBuilder.<init> ()V
      // 25: aload 0
      // 26: getfield scc.rr0 Ljava/lang/String;
      // 29: bipush 0
      // 2a: anewarray 73
      // 2d: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 30: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33: getstatic scc.f Ljava/lang/String;
      // 36: nop
      // 37: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a: aload 0
      // 3b: invokevirtual scc.gat ()F
      // 3e: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 41: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 44: goto 67
      // 47: invokestatic scc.c (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield scc.p2w Lscc$yp_;
      // 4f: aload 0
      // 50: getfield scc._me I
      // 53: aload 0
      // 54: getfield scc.rr0 Ljava/lang/String;
      // 57: bipush 0
      // 58: anewarray 73
      // 5b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 5e: aload 0
      // 5f: invokevirtual scc.gat ()F
      // 62: invokeinterface scc$yp_.wd2 (ILjava/lang/String;F)Ljava/lang/String; 4
      // 67: areturn
   }

   @Override
   public int getHoverState(boolean var1) {
      return 0;
   }

   @Override
   public void mouseDragged(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield scc.c1s Z
      // 09: iload 4
      // 0b: ifeq 2f
      // 0e: ifeq f7
      // 11: goto 18
      // 14: invokestatic scc.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 4
      // 1b: ifeq d3
      // 1e: goto 25
      // 21: invokestatic scc.c (Loov;)Loov;
      // 24: athrow
      // 25: getfield scc.qrs Z
      // 28: goto 2f
      // 2b: invokestatic scc.c (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq aa
      // 32: aload 0
      // 33: iload 2
      // 34: aload 0
      // 35: getfield scc.ibo I
      // 38: bipush 4
      // 39: iadd
      // 3a: isub
      // 3b: i2f
      // 3c: aload 0
      // 3d: getfield scc.s22 I
      // 40: bipush 8
      // 42: isub
      // 43: i2f
      // 44: fdiv
      // 45: putfield scc.zf9 F
      // 48: aload 0
      // 49: getfield scc.zf9 F
      // 4c: fconst_0
      // 4d: fcmpg
      // 4e: iload 4
      // 50: ifeq 82
      // 53: goto 5a
      // 56: invokestatic scc.c (Loov;)Loov;
      // 59: athrow
      // 5a: ifge 70
      // 5d: goto 64
      // 60: invokestatic scc.c (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: fconst_0
      // 66: putfield scc.zf9 F
      // 69: goto 70
      // 6c: invokestatic scc.c (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: iload 4
      // 73: ifeq 9a
      // 76: getfield scc.zf9 F
      // 79: fconst_1
      // 7a: fcmpl
      // 7b: goto 82
      // 7e: invokestatic scc.c (Loov;)Loov;
      // 81: athrow
      // 82: ifle 91
      // 85: aload 0
      // 86: fconst_1
      // 87: putfield scc.zf9 F
      // 8a: goto 91
      // 8d: invokestatic scc.c (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: aload 0
      // 93: invokespecial scc.fw0 ()Ljava/lang/String;
      // 96: putfield scc.frg Ljava/lang/String;
      // 99: aload 0
      // 9a: getfield scc.v_3 Lgkx$lpc;
      // 9d: aload 0
      // 9e: getfield scc._me I
      // a1: aload 0
      // a2: invokevirtual scc.gat ()F
      // a5: invokeinterface gkx$lpc.ba0 (IF)V 3
      // aa: fconst_1
      // ab: fconst_1
      // ac: fconst_1
      // ad: fconst_1
      // ae: invokestatic hzu.wn0 (FFFF)V
      // b1: aload 0
      // b2: aload 0
      // b3: getfield scc.ibo I
      // b6: aload 0
      // b7: getfield scc.zf9 F
      // ba: aload 0
      // bb: getfield scc.s22 I
      // be: bipush 8
      // c0: isub
      // c1: i2f
      // c2: fmul
      // c3: f2i
      // c4: iadd
      // c5: aload 0
      // c6: getfield scc.mij I
      // c9: bipush 0
      // ca: bipush 66
      // cc: bipush 4
      // cd: bipush 20
      // cf: invokevirtual scc.mt4 (IIIIII)V
      // d2: aload 0
      // d3: aload 0
      // d4: getfield scc.ibo I
      // d7: aload 0
      // d8: getfield scc.zf9 F
      // db: aload 0
      // dc: getfield scc.s22 I
      // df: bipush 8
      // e1: isub
      // e2: i2f
      // e3: fmul
      // e4: f2i
      // e5: iadd
      // e6: bipush 4
      // e7: iadd
      // e8: aload 0
      // e9: getfield scc.mij I
      // ec: sipush 196
      // ef: bipush 66
      // f1: bipush 4
      // f2: bipush 20
      // f4: invokevirtual scc.mt4 (IIIIII)V
      // f7: return
   }

   public void s9t(float var1) {
      this.zf9 = var1;
      this.frg = this.fw0();
      this.v_3.ba0(this._me, this.gat());
   }

   @Override
   public boolean mousePressed(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: iload 2
      // 08: iload 3
      // 09: invokespecial gt4.mousePressed (Lc05;II)Z
      // 0c: iload 4
      // 0e: ifeq 9b
      // 11: ifeq 9a
      // 14: goto 1b
      // 17: invokestatic scc.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 2
      // 1d: aload 0
      // 1e: getfield scc.ibo I
      // 21: bipush 4
      // 22: iadd
      // 23: isub
      // 24: i2f
      // 25: aload 0
      // 26: getfield scc.s22 I
      // 29: bipush 8
      // 2b: isub
      // 2c: i2f
      // 2d: fdiv
      // 2e: putfield scc.zf9 F
      // 31: aload 0
      // 32: getfield scc.zf9 F
      // 35: fconst_0
      // 36: fcmpg
      // 37: iload 4
      // 39: ifeq 5f
      // 3c: goto 43
      // 3f: invokestatic scc.c (Loov;)Loov;
      // 42: athrow
      // 43: ifge 59
      // 46: goto 4d
      // 49: invokestatic scc.c (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: fconst_0
      // 4f: putfield scc.zf9 F
      // 52: goto 59
      // 55: invokestatic scc.c (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: getfield scc.zf9 F
      // 5d: fconst_1
      // 5e: fcmpl
      // 5f: iload 4
      // 61: ifeq 99
      // 64: ifle 7a
      // 67: goto 6e
      // 6a: invokestatic scc.c (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 0
      // 6f: fconst_1
      // 70: putfield scc.zf9 F
      // 73: goto 7a
      // 76: invokestatic scc.c (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: aload 0
      // 7c: invokespecial scc.fw0 ()Ljava/lang/String;
      // 7f: putfield scc.frg Ljava/lang/String;
      // 82: aload 0
      // 83: getfield scc.v_3 Lgkx$lpc;
      // 86: aload 0
      // 87: getfield scc._me I
      // 8a: aload 0
      // 8b: invokevirtual scc.gat ()F
      // 8e: invokeinterface gkx$lpc.ba0 (IF)V 3
      // 93: aload 0
      // 94: bipush 1
      // 95: putfield scc.qrs Z
      // 98: bipush 1
      // 99: ireturn
      // 9a: bipush 0
      // 9b: ireturn
   }

   @Override
   public void mouseReleased(int var1, int var2) {
      this.qrs = false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5895340574881156575L, 9009554204857721694L, MethodHandles.lookup().lookupClass()).a(2108094144673L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 88956411486201L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0093\u0018íÍ7;Û\n".getBytes("ISO-8859-1"));
      String var6 = c(var4).intern();
      byte var10001 = -1;
      f = var6;
   }

   private static oov c(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
