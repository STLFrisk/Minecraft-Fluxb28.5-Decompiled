import java.util.Random;

public class yau$m1x extends py3 {
   public yau$m1x(int var1, gyu var2) {
      super(var1, var2);
      this.dmv.c10 = 2;
      this.dmv.k9k = 2;
      this.dmv.qy9 = 5;
   }

   @Override
   public void rci(t9d param1, Random param2, lno param3, int param4, int param5, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic ox_.l11 Lx82;
      // 04: invokevirtual x82.l4i ()Lzfz;
      // 07: putfield yau$m1x.ke4 Lzfz;
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 0
      // 0e: getstatic ox_.kqk Le0x;
      // 11: invokevirtual e0x.l4i ()Lzfz;
      // 14: putfield yau$m1x.kro Lzfz;
      // 17: istore 8
      // 19: dload 6
      // 1b: ldc2_w 1.75
      // 1e: dcmpl
      // 1f: iload 8
      // 21: ifeq 5b
      // 24: ifle 4e
      // 27: goto 2e
      // 2a: invokestatic yau$m1x.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getstatic ox_.pu8 Le0x;
      // 32: invokevirtual e0x.l4i ()Lzfz;
      // 35: putfield yau$m1x.ke4 Lzfz;
      // 38: aload 0
      // 39: getstatic ox_.pu8 Le0x;
      // 3c: invokevirtual e0x.l4i ()Lzfz;
      // 3f: putfield yau$m1x.kro Lzfz;
      // 42: iload 8
      // 44: ifne 7a
      // 47: goto 4e
      // 4a: invokestatic yau$m1x.a (Loov;)Loov;
      // 4d: athrow
      // 4e: dload 6
      // 50: ldc2_w -0.5
      // 53: dcmpl
      // 54: goto 5b
      // 57: invokestatic yau$m1x.a (Loov;)Loov;
      // 5a: athrow
      // 5b: ifle 7a
      // 5e: aload 0
      // 5f: getstatic ox_.kqk Le0x;
      // 62: invokevirtual e0x.l4i ()Lzfz;
      // 65: getstatic bx0.nln Lzb_;
      // 68: getstatic bx0$b_z.ryg Lbx0$b_z;
      // 6b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 70: putfield yau$m1x.ke4 Lzfz;
      // 73: goto 7a
      // 76: invokestatic yau$m1x.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: aload 1
      // 7c: aload 2
      // 7d: aload 3
      // 7e: iload 4
      // 80: iload 5
      // 82: dload 6
      // 84: invokevirtual yau$m1x.mj9 (Lt9d;Ljava/util/Random;Llno;IID)V
      // 87: return
   }

   @Override
   public void u0r(t9d var1, Random var2, mew var3) {
      this.dmv.dvs(var1, var2, this, var3);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
