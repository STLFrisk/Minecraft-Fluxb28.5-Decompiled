public class q2b extends _f3 {
   private final k6s g8r = new q2b$1(this);
   private int uqc = 0;

   public q2b(t9d var1) {
      super(var1);
   }

   public q2b(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.a0c().kp2(23, "");
      this.a0c().kp2(24, "");
   }

   @Override
   public void cjb(bdo var1) {
      super.cjb(var1);
      this.g8r.uvc(var1);
      this.a0c().c66(23, this.rxe().c4d());
      this.a0c().c66(24, ekw$szt.odg(this.rxe().gay()));
   }

   @Override
   public void srs(bdo var1) {
      super.srs(var1);
      this.g8r.vdi(var1);
   }

   @Override
   public _f3$c3d x38() {
      return _f3$c3d.sfv;
   }

   @Override
   public zfz hcw() {
      return ox_.pol.l4i();
   }

   public k6s rxe() {
      return this.g8r;
   }

   @Override
   public void xr9(int param1, int param2, int param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: iload 4
      // 07: iload 5
      // 09: ifne 32
      // 0c: ifeq 50
      // 0f: goto 16
      // 12: invokestatic q2b.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 5
      // 19: ifne 49
      // 1c: goto 23
      // 1f: invokestatic q2b.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: getfield q2b.g25 I
      // 26: aload 0
      // 27: getfield q2b.uqc I
      // 2a: isub
      // 2b: goto 32
      // 2e: invokestatic q2b.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: bipush 4
      // 33: if_icmplt 50
      // 36: aload 0
      // 37: invokevirtual q2b.rxe ()Lk6s;
      // 3a: aload 0
      // 3b: getfield q2b.oay Lt9d;
      // 3e: invokevirtual k6s.k7h (Lt9d;)V
      // 41: aload 0
      // 42: goto 49
      // 45: invokestatic q2b.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield q2b.g25 I
      // 4d: putfield q2b.uqc I
      // 50: return
   }

   @Override
   public boolean k25(ha9 var1) {
      this.g8r.bna(var1);
      return false;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void jcg(int var1) {
      int var2 = t9d.c();

      int var10000;
      byte var10001;
      label45: {
         label51: {
            try {
               super.jcg(var1);
               var10000 = var1;
               var10001 = 24;
               if (var2 != 0) {
                  break label45;
               }

               if (var1 != 24) {
                  break label51;
               }
            } catch (Throwable var8) {
               throw b(var8);
            }

            try {
               this.g8r.wyo(ekw$szt.wnw(this.a0c().bsd(24)));
               return;
            } catch (Throwable var5) {
            }

            try {
               if (var2 == 0) {
                  return;
               }
            } catch (Throwable var7) {
               boolean var10 = false;
               throw b(var7);
            }
         }

         try {
            var10000 = var1;
            var10001 = 23;
         } catch (Throwable var6) {
            boolean var11 = false;
            throw b(var6);
         }
      }

      try {
         if (var10000 == var10001) {
            this.g8r.y6j(this.a0c().bsd(23));
         }
      } catch (Throwable var4) {
         throw b(var4);
      }
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }
}
