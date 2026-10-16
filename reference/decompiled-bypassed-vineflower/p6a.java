import com.google.common.collect.Lists;

public class p6a extends b0t {
   public int ddy = 200;
   public int gqz = 20;
   public int bkw;
   public int y1g;
   public int mzk;
   public boolean xiq = true;

   public p6a(owt var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this._j_ = var1;
      this.mzk = var2;
      this.bkw = var3;
      this.y1g = var4;
      this.ddy = var5;
      this.gqz = var6;
      this.tim = Lists.newArrayList();
      this.cp4 = false;
      this.hyg = false;
      this.wre = var7;
      this.qk5 = -1;
      this.ood = -1;
      this.vke = -1;
      this.sit = 0;
   }

   public void d26(String var1) {
      this.tim.add(fc1.gx1(var1, new Object[0]));
   }

   public p6a o4e() {
      this.cp4 = true;
      return this;
   }

   public void bij(c05 param1, int param2, int param3) {
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
      // 06: getfield p6a.xiq Z
      // 09: iload 4
      // 0b: ifeq 46
      // 0e: ifeq ed
      // 11: goto 18
      // 14: invokestatic p6a.a (Loov;)Loov;
      // 17: athrow
      // 18: invokestatic hzu.spd ()V
      // 1b: sipush 770
      // 1e: sipush 771
      // 21: bipush 1
      // 22: bipush 0
      // 23: invokestatic hzu.u39 (IIII)V
      // 26: aload 0
      // 27: aload 1
      // 28: iload 2
      // 29: iload 3
      // 2a: invokevirtual p6a.fkw (Lc05;II)V
      // 2d: aload 0
      // 2e: getfield p6a.y1g I
      // 31: aload 0
      // 32: getfield p6a.gqz I
      // 35: bipush 2
      // 36: idiv
      // 37: iadd
      // 38: aload 0
      // 39: getfield p6a.sit I
      // 3c: bipush 2
      // 3d: idiv
      // 3e: iadd
      // 3f: goto 46
      // 42: invokestatic p6a.a (Loov;)Loov;
      // 45: athrow
      // 46: istore 5
      // 48: iload 5
      // 4a: aload 0
      // 4b: getfield p6a.tim Ljava/util/List;
      // 4e: invokeinterface java/util/List.size ()I 1
      // 53: bipush 10
      // 55: imul
      // 56: bipush 2
      // 57: idiv
      // 58: isub
      // 59: istore 6
      // 5b: bipush 0
      // 5c: istore 7
      // 5e: iload 7
      // 60: aload 0
      // 61: getfield p6a.tim Ljava/util/List;
      // 64: invokeinterface java/util/List.size ()I 1
      // 69: if_icmpge ed
      // 6c: aload 0
      // 6d: iload 4
      // 6f: ifeq c0
      // 72: getfield p6a.cp4 Z
      // 75: ifeq b8
      // 78: goto 7f
      // 7b: invokestatic p6a.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 0
      // 80: aload 0
      // 81: getfield p6a._j_ Lowt;
      // 84: aload 0
      // 85: getfield p6a.tim Ljava/util/List;
      // 88: iload 7
      // 8a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 8f: checkcast java/lang/String
      // 92: aload 0
      // 93: getfield p6a.bkw I
      // 96: aload 0
      // 97: getfield p6a.ddy I
      // 9a: bipush 2
      // 9b: idiv
      // 9c: iadd
      // 9d: iload 6
      // 9f: iload 7
      // a1: bipush 10
      // a3: imul
      // a4: iadd
      // a5: aload 0
      // a6: getfield p6a.wre I
      // a9: invokevirtual p6a.poi (Lowt;Ljava/lang/String;III)V
      // ac: iload 4
      // ae: ifne e5
      // b1: goto b8
      // b4: invokestatic p6a.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 0
      // b9: goto c0
      // bc: invokestatic p6a.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 0
      // c1: getfield p6a._j_ Lowt;
      // c4: aload 0
      // c5: getfield p6a.tim Ljava/util/List;
      // c8: iload 7
      // ca: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // cf: checkcast java/lang/String
      // d2: aload 0
      // d3: getfield p6a.bkw I
      // d6: iload 6
      // d8: iload 7
      // da: bipush 10
      // dc: imul
      // dd: iadd
      // de: aload 0
      // df: getfield p6a.wre I
      // e2: invokevirtual p6a.c_t (Lowt;Ljava/lang/String;III)V
      // e5: iinc 7 1
      // e8: iload 4
      // ea: ifne 5e
      // ed: return
   }

   public void fkw(c05 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield p6a.hyg Z
      // 09: iload 4
      // 0b: ifne 2a
      // 0e: ifeq b2
      // 11: goto 18
      // 14: invokestatic p6a.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield p6a.ddy I
      // 1c: aload 0
      // 1d: getfield p6a.sit I
      // 20: bipush 2
      // 21: imul
      // 22: iadd
      // 23: goto 2a
      // 26: invokestatic p6a.a (Loov;)Loov;
      // 29: athrow
      // 2a: istore 5
      // 2c: aload 0
      // 2d: getfield p6a.gqz I
      // 30: aload 0
      // 31: getfield p6a.sit I
      // 34: bipush 2
      // 35: imul
      // 36: iadd
      // 37: istore 6
      // 39: aload 0
      // 3a: getfield p6a.bkw I
      // 3d: aload 0
      // 3e: getfield p6a.sit I
      // 41: isub
      // 42: istore 7
      // 44: aload 0
      // 45: getfield p6a.y1g I
      // 48: aload 0
      // 49: getfield p6a.sit I
      // 4c: isub
      // 4d: istore 8
      // 4f: iload 7
      // 51: i2f
      // 52: iload 8
      // 54: i2f
      // 55: iload 7
      // 57: iload 5
      // 59: iadd
      // 5a: i2f
      // 5b: iload 8
      // 5d: iload 6
      // 5f: iadd
      // 60: i2f
      // 61: aload 0
      // 62: getfield p6a.qk5 I
      // 65: invokestatic p6a.df9 (FFFFI)V
      // 68: aload 0
      // 69: iload 7
      // 6b: iload 7
      // 6d: iload 5
      // 6f: iadd
      // 70: iload 8
      // 72: aload 0
      // 73: getfield p6a.ood I
      // 76: invokevirtual p6a.yaj (IIII)V
      // 79: aload 0
      // 7a: iload 7
      // 7c: iload 7
      // 7e: iload 5
      // 80: iadd
      // 81: iload 8
      // 83: iload 6
      // 85: iadd
      // 86: aload 0
      // 87: getfield p6a.vke I
      // 8a: invokevirtual p6a.yaj (IIII)V
      // 8d: aload 0
      // 8e: iload 7
      // 90: iload 8
      // 92: iload 8
      // 94: iload 6
      // 96: iadd
      // 97: aload 0
      // 98: getfield p6a.ood I
      // 9b: invokevirtual p6a.x3f (IIII)V
      // 9e: aload 0
      // 9f: iload 7
      // a1: iload 5
      // a3: iadd
      // a4: iload 8
      // a6: iload 8
      // a8: iload 6
      // aa: iadd
      // ab: aload 0
      // ac: getfield p6a.vke I
      // af: invokevirtual p6a.x3f (IIII)V
      // b2: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
