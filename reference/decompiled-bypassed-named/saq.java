import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityFurnace;

public class saq extends zg9 {
   public saq(jnq var1, rsi var2) {
      super(new q7x(var1, var2));
      this.k1c = var1;
      this.p01 = var2;
   }

   @Override
   public void qw3(int var1, int var2) {
      String var3 = this.p01.xyw().rnh();
      this.fex.eh6(var3, (float)(this.poy / 2 - this.fex.ezt(var3) / 2), 6.0F, 4210752);
      this.fex.eh6(this.k1c.xyw().rnh(), 8.0F, (float)(this.g6l - 96 + 2), 4210752);
   }

   @Override
   public void cft(float var1, int var2, int var3) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(wzg);
      int var5 = (this.dt7 - this.poy) / 2;
      int var10000 = OpaquePredicate.b();
      int var6 = (this.o1e - this.g6l) / 2;
      int var4 = var10000;

      label21: {
         label20: {
            try {
               this.mt4(var5, var6, 0, 0, this.poy, this.g6l);
               var10000 = TileEntityFurnace.wql(this.p01);
               if (var4 == 0) {
                  break label21;
               }

               if (var10000 == 0) {
                  break label20;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            int var7 = this.rw2(13);
            this.mt4(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 1);
         }

         var10000 = this.vo6(24);
      }

      int var9 = var10000;
      this.mt4(var5 + 79, var6 + 34, 176, 14, var9 + 1, 16);
   }

   private int vo6(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield saq.p01 Lrsi;
      // 04: bipush 2
      // 05: invokeinterface rsi.czu (I)I 2
      // 0a: istore 3
      // 0b: invokestatic OpaquePredicate.c ()I
      // 0e: aload 0
      // 0f: getfield saq.p01 Lrsi;
      // 12: bipush 3
      // 13: invokeinterface rsi.czu (I)I 2
      // 18: istore 4
      // 1a: istore 2
      // 1b: iload 4
      // 1d: iload 2
      // 1e: ifne 2c
      // 21: ifeq 4a
      // 24: goto 2b
      // 27: invokestatic saq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 3
      // 2c: iload 2
      // 2d: ifne 47
      // 30: ifeq 4a
      // 33: goto 3a
      // 36: invokestatic saq.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 3
      // 3b: iload 1
      // 3c: imul
      // 3d: iload 4
      // 3f: idiv
      // 40: goto 47
      // 43: invokestatic saq.a (Loov;)Loov;
      // 46: athrow
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   private int rw2(int var1) {
      int var2 = OpaquePredicate.c();
      int var3 = this.p01.czu(1);

      try {
         if (var2 != 0) {
            return var3;
         }

         if (var3 != 0) {
            return this.p01.czu(0) * var1 / var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      short var5 = 200;
      return this.p01.czu(0) * var1 / var5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7715073299584060747L, 2597510580600048292L, MethodHandles.lookup().lookupClass()).a(217367602646691L);
      // $VF: monitorexit
      long var4 = var10000 ^ 127714245144574L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("'\u0015N\u009d\u0094M\u001aa?ô^}$\u008cw hÇûÛ\u0080\u0089u\u0082=b4ÄD³i\u0097¶\u0090½´\u008bmÓ$".getBytes("ISO-8859-1"));
      String var7 = d(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      wzg = new gdz(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
