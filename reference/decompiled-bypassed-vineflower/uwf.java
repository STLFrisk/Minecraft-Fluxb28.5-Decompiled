import java.util.Random;

public class uwf extends r45 {
   public uwf(Random var1, int var2) {
      this._s5 = var2;
      this.i83 = new j1k[var2];
      int var3 = 0;

      try {
         while (var3 < var2) {
            this.i83[var3] = new j1k(var1);
            var3++;
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public double oj4(double var1, double var3) {
      double var6 = 0.0;
      int var10000 = t9d.b();
      double var8 = 1.0;
      int var5 = var10000;
      int var10 = 0;

      while (true) {
         if (var10 < this._s5) {
            var6 += this.i83[var10].aea(var1 * var8, var3 * var8) / var8;
            var11 = var8 / 2.0;
            if (var5 == 0) {
               break;
            }

            var8 = var11;
            var10++;
            if (var5 != 0) {
               continue;
            }
         }

         var11 = var6;
         break;
      }

      return var11;
   }

   public double[] w76(double[] var1, double var2, double var4, int var6, int var7, double var8, double var10, double var12) {
      return this.yeq(var1, var2, var4, var6, var7, var8, var10, var12, 0.5);
   }

   public double[] yeq(double[] param1, double param2, double param4, int param6, int param7, double param8, double param10, double param12, double param14) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 16
      // 05: aload 1
      // 06: iload 16
      // 08: ifeq 68
      // 0b: ifnull 5a
      // 0e: goto 15
      // 11: invokestatic uwf.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 1
      // 16: arraylength
      // 17: iload 6
      // 19: iload 7
      // 1b: imul
      // 1c: iload 16
      // 1e: ifeq 65
      // 21: goto 28
      // 24: invokestatic uwf.a (Loov;)Loov;
      // 27: athrow
      // 28: if_icmplt 5a
      // 2b: goto 32
      // 2e: invokestatic uwf.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 0
      // 33: istore 17
      // 35: iload 17
      // 37: aload 1
      // 38: arraylength
      // 39: if_icmpge 55
      // 3c: aload 1
      // 3d: iload 17
      // 3f: dconst_0
      // 40: dastore
      // 41: iinc 17 1
      // 44: iload 16
      // 46: ifeq 69
      // 49: iload 16
      // 4b: ifne 35
      // 4e: goto 55
      // 51: invokestatic uwf.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 16
      // 57: ifne 69
      // 5a: iload 6
      // 5c: iload 7
      // 5e: goto 65
      // 61: invokestatic uwf.a (Loov;)Loov;
      // 64: athrow
      // 65: imul
      // 66: newarray 7
      // 68: astore 1
      // 69: dconst_1
      // 6a: dstore 17
      // 6c: dconst_1
      // 6d: dstore 19
      // 6f: bipush 0
      // 70: istore 21
      // 72: iload 21
      // 74: aload 0
      // 75: getfield uwf._s5 I
      // 78: if_icmpge b9
      // 7b: aload 0
      // 7c: getfield uwf.i83 [Lj1k;
      // 7f: iload 21
      // 81: aaload
      // 82: aload 1
      // 83: dload 2
      // 84: dload 4
      // 86: iload 6
      // 88: iload 7
      // 8a: dload 8
      // 8c: dload 19
      // 8e: dmul
      // 8f: dload 17
      // 91: dmul
      // 92: dload 10
      // 94: dload 19
      // 96: dmul
      // 97: dload 17
      // 99: dmul
      // 9a: ldc2_w 0.55
      // 9d: dload 17
      // 9f: ddiv
      // a0: invokevirtual j1k.quj ([DDDIIDDD)V
      // a3: dload 19
      // a5: dload 12
      // a7: dmul
      // a8: dstore 19
      // aa: dload 17
      // ac: dload 14
      // ae: dmul
      // af: dstore 17
      // b1: iinc 21 1
      // b4: iload 16
      // b6: ifne 72
      // b9: aload 1
      // ba: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
