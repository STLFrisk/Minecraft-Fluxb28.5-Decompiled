import java.util.Random;

public class b_x extends r45 {
   public b_x(Random var1, int var2) {
      int var10000 = t9d.b();
      this.gph = var2;
      int var3 = var10000;
      this.epp = new g_p[var2];
      int var4 = 0;

      while (var4 < var2) {
         this.epp[var4] = new g_p(var1);
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   public double[] w4w(double[] param1, int param2, int param3, int param4, int param5, int param6, int param7, double param8, double param10, double param12) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 14
      // 05: aload 1
      // 06: iload 14
      // 08: ifeq 26
      // 0b: ifnonnull 2c
      // 0e: goto 15
      // 11: invokestatic b_x.a (Loov;)Loov;
      // 14: athrow
      // 15: iload 5
      // 17: iload 6
      // 19: imul
      // 1a: iload 7
      // 1c: imul
      // 1d: newarray 7
      // 1f: goto 26
      // 22: invokestatic b_x.a (Loov;)Loov;
      // 25: athrow
      // 26: astore 1
      // 27: iload 14
      // 29: ifne 43
      // 2c: bipush 0
      // 2d: istore 15
      // 2f: iload 15
      // 31: aload 1
      // 32: arraylength
      // 33: if_icmpge 43
      // 36: aload 1
      // 37: iload 15
      // 39: dconst_0
      // 3a: dastore
      // 3b: iinc 15 1
      // 3e: iload 14
      // 40: ifne 2f
      // 43: dconst_1
      // 44: dstore 15
      // 46: bipush 0
      // 47: istore 17
      // 49: iload 17
      // 4b: aload 0
      // 4c: getfield b_x.gph I
      // 4f: if_icmpge e7
      // 52: iload 2
      // 53: i2d
      // 54: dload 15
      // 56: dmul
      // 57: dload 8
      // 59: dmul
      // 5a: dstore 18
      // 5c: iload 3
      // 5d: i2d
      // 5e: dload 15
      // 60: dmul
      // 61: dload 10
      // 63: dmul
      // 64: dstore 20
      // 66: iload 4
      // 68: i2d
      // 69: dload 15
      // 6b: dmul
      // 6c: dload 12
      // 6e: dmul
      // 6f: dstore 22
      // 71: dload 18
      // 73: invokestatic fe6.lfr (D)J
      // 76: lstore 24
      // 78: dload 22
      // 7a: invokestatic fe6.lfr (D)J
      // 7d: lstore 26
      // 7f: dload 18
      // 81: lload 24
      // 83: l2d
      // 84: dsub
      // 85: dstore 18
      // 87: dload 22
      // 89: lload 26
      // 8b: l2d
      // 8c: dsub
      // 8d: dstore 22
      // 8f: lload 24
      // 91: ldc2_w 16777216
      // 94: lrem
      // 95: lstore 24
      // 97: lload 26
      // 99: ldc2_w 16777216
      // 9c: lrem
      // 9d: lstore 26
      // 9f: dload 18
      // a1: lload 24
      // a3: l2d
      // a4: dadd
      // a5: dstore 18
      // a7: dload 22
      // a9: lload 26
      // ab: l2d
      // ac: dadd
      // ad: dstore 22
      // af: aload 0
      // b0: getfield b_x.epp [Lg_p;
      // b3: iload 17
      // b5: aaload
      // b6: aload 1
      // b7: dload 18
      // b9: dload 20
      // bb: dload 22
      // bd: iload 5
      // bf: iload 6
      // c1: iload 7
      // c3: dload 8
      // c5: dload 15
      // c7: dmul
      // c8: dload 10
      // ca: dload 15
      // cc: dmul
      // cd: dload 12
      // cf: dload 15
      // d1: dmul
      // d2: dload 15
      // d4: invokevirtual g_p.t7b ([DDDDIIIDDDD)V
      // d7: dload 15
      // d9: ldc2_w 2.0
      // dc: ddiv
      // dd: dstore 15
      // df: iinc 17 1
      // e2: iload 14
      // e4: ifne 49
      // e7: aload 1
      // e8: areturn
   }

   public double[] svg(double[] var1, int var2, int var3, int var4, int var5, double var6, double var8, double var10) {
      return this.w4w(var1, var2, 10, var3, var4, 1, var5, var6, 1.0, var8);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
