import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gji extends q4x {
   private final c9p b7t;
   private static final long a;
   private static final String b;

   public gji(c9p var1) {
      long var2 = a ^ 35162281043065L;
      super(new gdz(b));
      this.b7t = var1;
      this.gcf = jp4$y3u.d5l;
      this.v4c = true;
      this.bye = 0;
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 86
      // 09: getfield gji.b7t Lc9p;
      // 0c: getfield c9p.ma9 Z
      // 0f: ifne 7e
      // 12: goto 19
      // 15: invokestatic gji.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifeq 86
      // 1e: goto 25
      // 21: invokestatic gji.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield gji.b7t Lc9p;
      // 28: invokevirtual c9p._sb ()Z
      // 2b: ifeq 7e
      // 2e: goto 35
      // 31: invokestatic gji.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 0
      // 37: getfield gji.b7t Lc9p;
      // 3a: getfield c9p.o2v D
      // 3d: d2f
      // 3e: putfield gji.gsm F
      // 41: aload 0
      // 42: aload 0
      // 43: getfield gji.b7t Lc9p;
      // 46: getfield c9p.kfp D
      // 49: d2f
      // 4a: putfield gji.w2a F
      // 4d: aload 0
      // 4e: aload 0
      // 4f: getfield gji.b7t Lc9p;
      // 52: getfield c9p.vbd D
      // 55: d2f
      // 56: putfield gji.uso F
      // 59: aload 0
      // 5a: getfield gji.b7t Lc9p;
      // 5d: fconst_0
      // 5e: invokevirtual c9p.z3d (F)F
      // 61: fstore 2
      // 62: aload 0
      // 63: fconst_0
      // 64: fconst_1
      // 65: fload 2
      // 66: fmul
      // 67: fload 2
      // 68: fmul
      // 69: fadd
      // 6a: putfield gji.n1s F
      // 6d: aload 0
      // 6e: ldc 0.7
      // 70: nop
      // 71: ldc 0.5
      // 73: nop
      // 74: fload 2
      // 75: fmul
      // 76: fadd
      // 77: putfield gji.mqg F
      // 7a: iload 1
      // 7b: ifne 8a
      // 7e: aload 0
      // 7f: goto 86
      // 82: invokestatic gji.a (Loov;)Loov;
      // 85: athrow
      // 86: bipush 1
      // 87: putfield gji.h5_ Z
      // 8a: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4091924427060195604L, -7090355744686827168L, MethodHandles.lookup().lookupClass()).a(113534479524159L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 10675922907318L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Û\u008ahf\u009a\u0012ñ\u000b¹ôÙ\u009dÒÅNz\u009bKÜ\u009a\u0007Xì\u0019\"\u007fRà\u0087\u007ft\u0090".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
