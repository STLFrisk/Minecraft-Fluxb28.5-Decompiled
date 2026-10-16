import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cmk extends zg9 {
   public cmk(jnq var1, rsi var2) {
      super(new gem(var1, var2));
      this.luq = var1;
      this.ve8 = var2;
   }

   @Override
   public void qw3(int var1, int var2) {
      String var3 = this.ve8.xyw().rnh();
      this.fex.eh6(var3, (float)(this.poy / 2 - this.fex.ezt(var3) / 2), 6.0F, 4210752);
      this.fex.eh6(this.luq.xyw().rnh(), 8.0F, (float)(this.g6l - 96 + 2), 4210752);
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
      // 000: fconst_1
      // 001: fconst_1
      // 002: fconst_1
      // 003: fconst_1
      // 004: invokestatic hzu.wn0 (FFFF)V
      // 007: aload 0
      // 008: getfield cmk.f41 Lc05;
      // 00b: invokevirtual Minecraft.l22 ()Llc5;
      // 00e: getstatic cmk.l5k Lgdz;
      // 011: invokevirtual lc5.anl (Lgdz;)V
      // 014: invokestatic OpaquePredicate.c ()I
      // 017: aload 0
      // 018: getfield cmk.dt7 I
      // 01b: aload 0
      // 01c: getfield cmk.poy I
      // 01f: isub
      // 020: bipush 2
      // 021: idiv
      // 022: istore 5
      // 024: aload 0
      // 025: getfield cmk.o1e I
      // 028: aload 0
      // 029: getfield cmk.g6l I
      // 02c: isub
      // 02d: bipush 2
      // 02e: idiv
      // 02f: istore 6
      // 031: aload 0
      // 032: iload 5
      // 034: iload 6
      // 036: bipush 0
      // 037: bipush 0
      // 038: aload 0
      // 039: getfield cmk.poy I
      // 03c: aload 0
      // 03d: getfield cmk.g6l I
      // 040: invokevirtual cmk.mt4 (IIIIII)V
      // 043: aload 0
      // 044: getfield cmk.ve8 Lrsi;
      // 047: bipush 0
      // 048: invokeinterface rsi.czu (I)I 2
      // 04d: istore 7
      // 04f: istore 4
      // 051: iload 7
      // 053: iload 4
      // 055: ifne 077
      // 058: ifle 149
      // 05b: goto 062
      // 05e: invokestatic cmk.a (Loov;)Loov;
      // 061: athrow
      // 062: ldc 28.0
      // 064: nop
      // 065: fconst_1
      // 066: iload 7
      // 068: i2f
      // 069: ldc 400.0
      // 06b: nop
      // 06c: fdiv
      // 06d: fsub
      // 06e: fmul
      // 06f: f2i
      // 070: goto 077
      // 073: invokestatic cmk.a (Loov;)Loov;
      // 076: athrow
      // 077: istore 8
      // 079: iload 8
      // 07b: iload 4
      // 07d: ifne 0ae
      // 080: ifle 0a7
      // 083: goto 08a
      // 086: invokestatic cmk.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 0
      // 08b: iload 5
      // 08d: bipush 97
      // 08f: iadd
      // 090: iload 6
      // 092: bipush 16
      // 094: iadd
      // 095: sipush 176
      // 098: bipush 0
      // 099: bipush 9
      // 09b: iload 8
      // 09d: invokevirtual cmk.mt4 (IIIIII)V
      // 0a0: goto 0a7
      // 0a3: invokestatic cmk.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: iload 7
      // 0a9: bipush 2
      // 0aa: idiv
      // 0ab: bipush 7
      // 0ad: irem
      // 0ae: istore 9
      // 0b0: iload 9
      // 0b2: iload 4
      // 0b4: ifne 11f
      // 0b7: tableswitch 102 0 6 45 54 63 72 81 90 99
      // 0e0: invokestatic cmk.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: bipush 29
      // 0e6: istore 8
      // 0e8: iload 4
      // 0ea: ifeq 11d
      // 0ed: bipush 24
      // 0ef: istore 8
      // 0f1: iload 4
      // 0f3: ifeq 11d
      // 0f6: bipush 20
      // 0f8: istore 8
      // 0fa: iload 4
      // 0fc: ifeq 11d
      // 0ff: bipush 16
      // 101: istore 8
      // 103: iload 4
      // 105: ifeq 11d
      // 108: bipush 11
      // 10a: istore 8
      // 10c: iload 4
      // 10e: ifeq 11d
      // 111: bipush 6
      // 113: istore 8
      // 115: iload 4
      // 117: ifeq 11d
      // 11a: bipush 0
      // 11b: istore 8
      // 11d: iload 8
      // 11f: ifle 149
      // 122: aload 0
      // 123: iload 5
      // 125: bipush 65
      // 127: iadd
      // 128: iload 6
      // 12a: bipush 14
      // 12c: iadd
      // 12d: bipush 29
      // 12f: iadd
      // 130: iload 8
      // 132: isub
      // 133: sipush 185
      // 136: bipush 29
      // 138: iload 8
      // 13a: isub
      // 13b: bipush 12
      // 13d: iload 8
      // 13f: invokevirtual cmk.mt4 (IIIIII)V
      // 142: goto 149
      // 145: invokestatic cmk.a (Loov;)Loov;
      // 148: athrow
      // 149: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-337666981955413073L, -2063276991567822590L, MethodHandles.lookup().lookupClass()).a(101874691886285L);
      // $VF: monitorexit
      long var4 = var10000 ^ 67818336180742L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "\u0085/\u0004·,÷û0ôÍ\u0017\u0093Ô5?Ï=ý(\u0087T3pb÷-Tã\u009b¿xàëC\u000eq\u008dÇ\u0080Å\u0005¬\u008f\u0094\u008ad©P".getBytes("ISO-8859-1")
      );
      String var7 = d(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      l5k = new gdz(var0);
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
