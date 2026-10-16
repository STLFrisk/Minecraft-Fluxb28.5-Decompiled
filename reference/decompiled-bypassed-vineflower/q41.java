import java.util.Random;

public class q41 extends gyu {
   private boolean h01;
   private static final zfz duu = ox_.uom.l4i().zvi(qv5.yuo, x54$lti.jnw);
   private static final zfz leu = ox_.rwl.l4i().zvi(uav.nps, x54$lti.jnw).zvi(_cv.sdu, false);
   private static final zfz mkw = ox_.rwl.l4i().zvi(uav.nps, x54$lti.mdr).zvi(_cv.sdu, false);

   public q41(int var1, boolean var2) {
      super(var1);
      this.h01 = var2;
      if (var2) {
         this.dmv.c10 = 2;
      } else {
         this.dmv.c10 = 50;
      }

      try {
         this.dmv.qy9 = 25;
         this.dmv.k9k = 4;
         if (!var2) {
            this.wq_.add(new gyu$dwn(hu3.class, 2, 1, 1));
         }
      } catch (oov var3) {
         throw a(var3);
      }

      this.c1d.add(new gyu$dwn(n78.class, 10, 4, 4));
   }

   @Override
   public e9q jk9(Random param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: bipush 10
      // 07: invokevirtual java/util/Random.nextInt (I)I
      // 0a: iload 2
      // 0b: ifne 28
      // 0e: ifne 23
      // 11: goto 18
      // 14: invokestatic q41.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield q41.yie Ls9p;
      // 1c: goto 9b
      // 1f: invokestatic q41.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: bipush 2
      // 25: invokevirtual java/util/Random.nextInt (I)I
      // 28: iload 2
      // 29: ifne 4e
      // 2c: ifne 4a
      // 2f: goto 36
      // 32: invokestatic q41.a (Loov;)Loov;
      // 35: athrow
      // 36: new ahp
      // 39: dup
      // 3a: getstatic q41.duu Lzfz;
      // 3d: getstatic q41.mkw Lzfz;
      // 40: invokespecial ahp.<init> (Lzfz;Lzfz;)V
      // 43: goto 9b
      // 46: invokestatic q41.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield q41.h01 Z
      // 4e: iload 2
      // 4f: ifne 68
      // 52: ifne 84
      // 55: goto 5c
      // 58: invokestatic q41.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 1
      // 5d: bipush 3
      // 5e: invokevirtual java/util/Random.nextInt (I)I
      // 61: goto 68
      // 64: invokestatic q41.a (Loov;)Loov;
      // 67: athrow
      // 68: ifne 84
      // 6b: new h9k
      // 6e: dup
      // 6f: bipush 0
      // 70: bipush 10
      // 72: bipush 20
      // 74: getstatic q41.duu Lzfz;
      // 77: getstatic q41.leu Lzfz;
      // 7a: invokespecial h9k.<init> (ZIILzfz;Lzfz;)V
      // 7d: goto 9b
      // 80: invokestatic q41.a (Loov;)Loov;
      // 83: athrow
      // 84: new ffn
      // 87: dup
      // 88: bipush 0
      // 89: bipush 4
      // 8a: aload 1
      // 8b: bipush 7
      // 8d: invokevirtual java/util/Random.nextInt (I)I
      // 90: iadd
      // 91: getstatic q41.duu Lzfz;
      // 94: getstatic q41.leu Lzfz;
      // 97: bipush 1
      // 98: invokespecial ffn.<init> (ZILzfz;Lzfz;Z)V
      // 9b: areturn
   }

   @Override
   public cdu ncq(Random var1) {
      try {
         if (var1.nextInt(4) == 0) {
            return new ffi(rh2$j7i.hqk);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return new ffi(rh2$j7i.jd3);
   }

   @Override
   public void u0r(t9d var1, Random var2, mew var3) {
      super.u0r(var1, var2, var3);
      int var10000 = t9d.b();
      int var5 = var2.nextInt(16) + 8;
      int var4 = var10000;
      int var6 = var2.nextInt(16) + 8;
      int var7 = var2.nextInt(var1.p9y(var3.ec4(var5, 0, var6)).getY() * 2);
      new ofx().v3g(var1, var2, var3.ec4(var5, var7, var6));
      s35 var8 = new s35();
      var6 = 0;

      while (var6 < 50) {
         var7 = var2.nextInt(16) + 8;
         short var9 = 128;
         int var10 = var2.nextInt(16) + 8;
         var8.v3g(var1, var2, var3.ec4(var7, 128, var10));
         var6++;
         if (var4 == 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
