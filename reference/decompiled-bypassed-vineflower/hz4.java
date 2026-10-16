public class hz4 extends p8a {
   public hz4(yqv var1, t9d var2) {
      super(var1, var2);
   }

   @Override
   public usw yf2() {
      return new usw(new gyh());
   }

   @Override
   public boolean a52() {
      return this.y2a();
   }

   @Override
   public fqr a7k() {
      return new fqr(this.wxo.o2v, this.wxo.kfp + (double)this.wxo.ikl * 0.5, this.wxo.vbd);
   }

   @Override
   public void hqu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual hz4.a7k ()Lfqr;
      // 04: astore 2
      // 05: aload 0
      // 06: getfield hz4.wxo Lyqv;
      // 09: getfield yqv.uo6 F
      // 0c: aload 0
      // 0d: getfield hz4.wxo Lyqv;
      // 10: getfield yqv.uo6 F
      // 13: fmul
      // 14: fstore 3
      // 15: invokestatic t9d.c ()I
      // 18: bipush 6
      // 1a: istore 4
      // 1c: istore 1
      // 1d: aload 2
      // 1e: aload 0
      // 1f: getfield hz4.hvk Lt_2;
      // 22: aload 0
      // 23: getfield hz4.wxo Lyqv;
      // 26: aload 0
      // 27: getfield hz4.hvk Lt_2;
      // 2a: invokevirtual t_2.x03 ()I
      // 2d: invokevirtual t_2._qy (Li2h;I)Lfqr;
      // 30: invokevirtual fqr.y8x (Lfqr;)D
      // 33: fload 3
      // 34: f2d
      // 35: dcmpg
      // 36: iload 1
      // 37: ifne 68
      // 3a: ifge 52
      // 3d: goto 44
      // 40: invokestatic hz4.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield hz4.hvk Lt_2;
      // 48: invokevirtual t_2.kf1 ()V
      // 4b: goto 52
      // 4e: invokestatic hz4.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getfield hz4.hvk Lt_2;
      // 56: invokevirtual t_2.x03 ()I
      // 59: iload 4
      // 5b: iadd
      // 5c: aload 0
      // 5d: getfield hz4.hvk Lt_2;
      // 60: invokevirtual t_2.ov7 ()I
      // 63: bipush 1
      // 64: isub
      // 65: invokestatic java/lang/Math.min (II)I
      // 68: istore 5
      // 6a: iload 5
      // 6c: aload 0
      // 6d: getfield hz4.hvk Lt_2;
      // 70: invokevirtual t_2.x03 ()I
      // 73: if_icmple e9
      // 76: aload 0
      // 77: getfield hz4.hvk Lt_2;
      // 7a: aload 0
      // 7b: getfield hz4.wxo Lyqv;
      // 7e: iload 5
      // 80: invokevirtual t_2._qy (Li2h;I)Lfqr;
      // 83: astore 6
      // 85: iload 1
      // 86: ifne ee
      // 89: iload 1
      // 8a: ifne e5
      // 8d: goto 94
      // 90: invokestatic hz4.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 6
      // 96: aload 2
      // 97: invokevirtual fqr.y8x (Lfqr;)D
      // 9a: ldc2_w 36.0
      // 9d: dcmpg
      // 9e: ifgt db
      // a1: goto a8
      // a4: invokestatic hz4.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 0
      // a9: iload 1
      // aa: ifne cf
      // ad: goto b4
      // b0: invokestatic hz4.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 2
      // b5: aload 6
      // b7: bipush 0
      // b8: bipush 0
      // b9: bipush 0
      // ba: invokevirtual hz4.spw (Lfqr;Lfqr;III)Z
      // bd: ifeq db
      // c0: goto c7
      // c3: invokestatic hz4.a (Loov;)Loov;
      // c6: athrow
      // c7: aload 0
      // c8: goto cf
      // cb: invokestatic hz4.a (Loov;)Loov;
      // ce: athrow
      // cf: getfield hz4.hvk Lt_2;
      // d2: iload 5
      // d4: invokevirtual t_2.lkx (I)V
      // d7: iload 1
      // d8: ifeq e9
      // db: iinc 5 -1
      // de: goto e5
      // e1: invokestatic hz4.a (Loov;)Loov;
      // e4: athrow
      // e5: iload 1
      // e6: ifeq 6a
      // e9: aload 0
      // ea: aload 2
      // eb: invokevirtual hz4.isn (Lfqr;)V
      // ee: return
   }

   @Override
   public void fzq() {
      super.fzq();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public boolean spw(fqr var1, fqr var2, int var3, int var4, int var5) {
      int var6 = t9d.c();
      akm var7 = this.qwt.xjc(var1, new fqr(var2.lvi, var2.gn5 + (double)this.wxo.ikl * 0.5, var2.bn2), false, true, false);

      label34: {
         akm var10000;
         label33: {
            try {
               var10000 = var7;
               if (var6 != 0) {
                  break label33;
               }

               if (var7 == null) {
                  break label34;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var10000 = var7;
         }

         try {
            if (var10000.oyz != akm$qs6.du5) {
               return false;
            }
         } catch (oov var9) {
            boolean var10001 = false;
            throw a(var9);
         }
      }

      try {
         return true;
      } catch (oov var8) {
         boolean var13 = false;
         throw a(var8);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
