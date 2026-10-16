public class c82 extends g6r {
   public tf8[] tgl;
   public tf8 u_5;

   public c82() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial g6r.<init> ()V
      // 04: invokestatic t9d.c ()I
      // 07: aload 0
      // 08: bipush 8
      // 0a: anewarray 18
      // 0d: putfield c82.tgl [Ltf8;
      // 10: istore 1
      // 11: bipush 0
      // 12: istore 2
      // 13: iload 2
      // 14: aload 0
      // 15: getfield c82.tgl [Ltf8;
      // 18: arraylength
      // 19: if_icmpge 97
      // 1c: bipush 0
      // 1d: istore 3
      // 1e: iload 2
      // 1f: istore 4
      // 21: iload 1
      // 22: ifne ba
      // 25: iload 2
      // 26: bipush 2
      // 27: iload 1
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic c82.a (Loov;)Loov;
      // 31: athrow
      // 32: if_icmpne 47
      // 35: goto 3c
      // 38: invokestatic c82.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 24
      // 3e: istore 3
      // 3f: bipush 10
      // 41: istore 4
      // 43: iload 1
      // 44: ifeq 65
      // 47: iload 2
      // 48: iload 1
      // 49: ifne 63
      // 4c: goto 53
      // 4f: invokestatic c82.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 3
      // 54: goto 5b
      // 57: invokestatic c82.a (Loov;)Loov;
      // 5a: athrow
      // 5b: if_icmpne 65
      // 5e: bipush 24
      // 60: istore 3
      // 61: bipush 19
      // 63: istore 4
      // 65: aload 0
      // 66: getfield c82.tgl [Ltf8;
      // 69: iload 2
      // 6a: new tf8
      // 6d: dup
      // 6e: aload 0
      // 6f: iload 3
      // 70: iload 4
      // 72: invokespecial tf8.<init> (Lg6r;II)V
      // 75: aastore
      // 76: aload 0
      // 77: getfield c82.tgl [Ltf8;
      // 7a: iload 2
      // 7b: aaload
      // 7c: ldc -4.0
      // 7e: nop
      // 7f: bipush 16
      // 81: iload 2
      // 82: iadd
      // 83: i2f
      // 84: ldc -4.0
      // 86: nop
      // 87: bipush 8
      // 89: bipush 1
      // 8a: bipush 8
      // 8c: invokevirtual tf8.ge4 (FFFIII)Ltf8;
      // 8f: pop
      // 90: iinc 2 1
      // 93: iload 1
      // 94: ifeq 13
      // 97: aload 0
      // 98: new tf8
      // 9b: dup
      // 9c: aload 0
      // 9d: bipush 0
      // 9e: bipush 16
      // a0: invokespecial tf8.<init> (Lg6r;II)V
      // a3: putfield c82.u_5 Ltf8;
      // a6: aload 0
      // a7: getfield c82.u_5 Ltf8;
      // aa: ldc -2.0
      // ac: nop
      // ad: ldc 18.0
      // af: nop
      // b0: ldc -2.0
      // b2: nop
      // b3: bipush 4
      // b4: bipush 4
      // b5: bipush 4
      // b6: invokevirtual tf8.ge4 (FFFIII)Ltf8;
      // b9: pop
      // ba: return
   }

   @Override
   public void v3g(g_3 var1, float var2, float var3, float var4) {
      b41 var6 = (b41)var1;
      int var10000 = t9d.c();
      float var7 = var6.un8 + (var6.mhp - var6.un8) * var4;
      int var5 = var10000;

      label31: {
         label30: {
            try {
               float var11;
               var10000 = (var11 = var7 - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
               if (var5 != 0) {
                  break label31;
               }

               if (var10000 >= 0) {
                  break label30;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var7 = 0.0F;
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < this.tgl.length) {
         this.tgl[var8].ca7 = (float)(-(4 - var8)) * var7 * 1.7F;
         var8++;
         if (var5 != 0) {
            break;
         }
      }
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      int var10000 = t9d.b();
      this.u_5.vca(var7);
      int var8 = var10000;
      int var9 = 0;

      while (var9 < this.tgl.length) {
         this.tgl[var9].vca(var7);
         var9++;
         if (var8 == 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
