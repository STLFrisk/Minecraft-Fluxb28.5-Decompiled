import java.util.List;

public class _sc extends rrw {
   public _sc() {
      float var1 = 0.5F;
      float var2 = 0.015625F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var2, 0.5F + var1);
      this.i3l(uja.qqf);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void c76(t9d var1, mew var2, zfz var3, nh4 var4, List var5, i2h var6) {
      int var7 = t9d.c();

      label37: {
         label36: {
            i2h var10000;
            label35: {
               try {
                  var10000 = var6;
                  if (var7 != 0) {
                     break label35;
                  }

                  if (var6 == null) {
                     break label36;
                  }
               } catch (oov var11) {
                  throw a(var11);
               }

               var10000 = var6;
            }

            try {
               if (var10000 instanceof w54) {
                  break label37;
               }
            } catch (oov var10) {
               boolean var10001 = false;
               throw a(var10);
            }
         }

         try {
            super.c76(var1, var2, var3, var4, var5, var6);
         } catch (oov var9) {
            boolean var13 = false;
            throw a(var9);
         }
      }

      try {
         ;
      } catch (oov var8) {
         boolean var14 = false;
         throw a(var8);
      }
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      return new nh4(
         (double)var2.getX() + this.d80,
         (double)var2.getY() + this.tcq,
         (double)var2.getZ() + this.iac,
         (double)var2.getX() + this.smy,
         (double)var2.getY() + this.lpg,
         (double)var2.getZ() + this.nlu
      );
   }

   @Override
   public int ldy() {
      return 7455580;
   }

   @Override
   public int ieb(zfz var1) {
      return 7455580;
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      return 2129968;
   }

   @Override
   public boolean ib4(e0x var1) {
      try {
         if (var1 == ox_.gdz) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public boolean _h0(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: invokevirtual mew.getY ()I
      // 09: iload 4
      // 0b: ifeq 88
      // 0e: iflt 87
      // 11: goto 18
      // 14: invokestatic _sc.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual mew.getY ()I
      // 1c: iload 4
      // 1e: ifeq 88
      // 21: goto 28
      // 24: invokestatic _sc.a (Loov;)Loov;
      // 27: athrow
      // 28: sipush 256
      // 2b: if_icmpge 87
      // 2e: goto 35
      // 31: invokestatic _sc.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 1
      // 36: aload 2
      // 37: invokevirtual mew.eve ()Lmew;
      // 3a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3d: astore 5
      // 3f: aload 5
      // 41: iload 4
      // 43: ifeq 64
      // 46: invokeinterface zfz.r_y ()Le0x; 1
      // 4b: invokevirtual e0x.p1r ()Lp3y;
      // 4e: getstatic p3y.six Lp3y;
      // 51: if_acmpne 85
      // 54: goto 5b
      // 57: invokestatic _sc.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 5
      // 5d: goto 64
      // 60: invokestatic _sc.a (Loov;)Loov;
      // 63: athrow
      // 64: getstatic hmv.nfg L_ku;
      // 67: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 6c: checkcast java/lang/Integer
      // 6f: invokevirtual java/lang/Integer.intValue ()I
      // 72: iload 4
      // 74: ifeq 82
      // 77: ifne 85
      // 7a: goto 81
      // 7d: invokestatic _sc.a (Loov;)Loov;
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
      // 87: bipush 0
      // 88: ireturn
   }

   @Override
   public int hvp(zfz var1) {
      return 0;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
