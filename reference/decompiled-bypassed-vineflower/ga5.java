import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ga5 extends zg9 {
   public ga5(rsi var1, rsi var2, zfo var3) {
      super(new qyi(var1, var2, var3, c05.vz1().vg8));
      this.ixj = var1;
      this._tp = var2;
      this.nz7 = var3;
      this.w2p = false;
   }

   @Override
   public void qw3(int var1, int var2) {
      this.fex.eh6(this._tp.xyw().rnh(), 8.0F, 6.0F, 4210752);
      this.fex.eh6(this.ixj.xyw().rnh(), 8.0F, (float)(this.g6l - 96 + 2), 4210752);
   }

   @Override
   public void cft(float param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fconst_1
      // 01: fconst_1
      // 02: fconst_1
      // 03: fconst_1
      // 04: invokestatic hzu.wn0 (FFFF)V
      // 07: aload 0
      // 08: getfield ga5.f41 Lc05;
      // 0b: invokevirtual c05.l22 ()Llc5;
      // 0e: getstatic ga5.c6h Lgdz;
      // 11: invokevirtual lc5.anl (Lgdz;)V
      // 14: aload 0
      // 15: getfield ga5.dt7 I
      // 18: aload 0
      // 19: getfield ga5.poy I
      // 1c: isub
      // 1d: bipush 2
      // 1e: idiv
      // 1f: istore 5
      // 21: invokestatic t9d.b ()I
      // 24: aload 0
      // 25: getfield ga5.o1e I
      // 28: aload 0
      // 29: getfield ga5.g6l I
      // 2c: isub
      // 2d: bipush 2
      // 2e: idiv
      // 2f: istore 6
      // 31: istore 4
      // 33: aload 0
      // 34: iload 5
      // 36: iload 6
      // 38: bipush 0
      // 39: bipush 0
      // 3a: aload 0
      // 3b: getfield ga5.poy I
      // 3e: aload 0
      // 3f: getfield ga5.g6l I
      // 42: invokevirtual ga5.mt4 (IIIIII)V
      // 45: aload 0
      // 46: getfield ga5.nz7 Lzfo;
      // 49: invokevirtual zfo.dlx ()Z
      // 4c: iload 4
      // 4e: ifeq 80
      // 51: ifeq 79
      // 54: goto 5b
      // 57: invokestatic ga5.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: iload 5
      // 5e: bipush 79
      // 60: iadd
      // 61: iload 6
      // 63: bipush 17
      // 65: iadd
      // 66: bipush 0
      // 67: aload 0
      // 68: getfield ga5.g6l I
      // 6b: bipush 90
      // 6d: bipush 54
      // 6f: invokevirtual ga5.mt4 (IIIIII)V
      // 72: goto 79
      // 75: invokestatic ga5.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield ga5.nz7 Lzfo;
      // 7d: invokevirtual zfo.sp4 ()Z
      // 80: iload 4
      // 82: ifeq b5
      // 85: ifeq b0
      // 88: goto 8f
      // 8b: invokestatic ga5.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 0
      // 90: iload 5
      // 92: bipush 7
      // 94: iadd
      // 95: iload 6
      // 97: bipush 35
      // 99: iadd
      // 9a: bipush 0
      // 9b: aload 0
      // 9c: getfield ga5.g6l I
      // 9f: bipush 54
      // a1: iadd
      // a2: bipush 18
      // a4: bipush 18
      // a6: invokevirtual ga5.mt4 (IIIIII)V
      // a9: goto b0
      // ac: invokestatic ga5.a (Loov;)Loov;
      // af: athrow
      // b0: iload 5
      // b2: bipush 51
      // b4: iadd
      // b5: iload 6
      // b7: bipush 60
      // b9: iadd
      // ba: bipush 17
      // bc: iload 5
      // be: bipush 51
      // c0: iadd
      // c1: i2f
      // c2: aload 0
      // c3: getfield ga5.fk9 F
      // c6: fsub
      // c7: iload 6
      // c9: bipush 75
      // cb: iadd
      // cc: bipush 50
      // ce: isub
      // cf: i2f
      // d0: aload 0
      // d1: getfield ga5.uba F
      // d4: fsub
      // d5: aload 0
      // d6: getfield ga5.nz7 Lzfo;
      // d9: invokestatic w4v.fe8 (IIIFFLg_3;)V
      // dc: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.fk9 = (float)var1;
      this.uba = (float)var2;
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4387070556990904892L, -104414122824555913L, MethodHandles.lookup().lookupClass()).a(258985201241210L);
      // $VF: monitorexit
      long var4 = var10000 ^ 23641984894058L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "¼Í\u000f\u0006(\u0004×\u00adìKÕÿà5me\u008c\u0010Üu\u009b\u0015\u0097(\u007fmí\u009cBÁ¶\\ë=\u001fª,\u0004\u0001\u0013".getBytes("ISO-8859-1")
      );
      String var7 = d(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      c6h = new gdz(var0);
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
