import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class og6 extends ak9 {
   private static final long a;
   private static final String c;

   public og6(nm6 var1, int var2, int var3, String var4) {
      long var5 = a ^ 31905581743813L;
      super(var1, var2, var3, var4);
      this.vms = jvy.ypj;
      this.c1c = (int)(jsr.erx.wni(this.vy4) + 3.0F);
      this.bqh = c;
   }

   @Override
   public void g1p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: getstatic jsr.erx Lcyb;
      // 007: aload 0
      // 008: getfield og6.vy4 Ljava/lang/String;
      // 00b: aload 0
      // 00c: getfield og6.koa I
      // 00f: i2f
      // 010: aload 0
      // 011: getfield og6.vms I
      // 014: bipush 2
      // 015: idiv
      // 016: i2f
      // 017: getstatic jsr.erx Lcyb;
      // 01a: aload 0
      // 01b: getfield og6.vy4 Ljava/lang/String;
      // 01e: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 021: fconst_2
      // 022: fdiv
      // 023: fsub
      // 024: fadd
      // 025: f2i
      // 026: i2f
      // 027: aload 0
      // 028: getfield og6.mff I
      // 02b: i2f
      // 02c: aload 0
      // 02d: getfield og6.c1c I
      // 030: bipush 2
      // 031: idiv
      // 032: i2f
      // 033: getstatic jsr.erx Lcyb;
      // 036: aload 0
      // 037: getfield og6.vy4 Ljava/lang/String;
      // 03a: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 03d: fconst_2
      // 03e: fdiv
      // 03f: fsub
      // 040: fadd
      // 041: fconst_2
      // 042: fadd
      // 043: getstatic jvy.ck5 Z
      // 046: iload 3
      // 047: ifeq 063
      // 04a: ifeq 061
      // 04d: goto 054
      // 050: invokestatic og6.a (Loov;)Loov;
      // 053: athrow
      // 054: getstatic z7e.kks Lz7e;
      // 057: getfield z7e.k0y I
      // 05a: goto 064
      // 05d: invokestatic og6.a (Loov;)Loov;
      // 060: athrow
      // 061: ldc 16777215
      // 063: nop
      // 064: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 067: pop
      // 068: aload 0
      // 069: getfield og6.vms I
      // 06c: i2f
      // 06d: getstatic jsr.erx Lcyb;
      // 070: aload 0
      // 071: getfield og6.vy4 Ljava/lang/String;
      // 074: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 077: fsub
      // 078: ldc 8.0
      // 07a: nop
      // 07b: fsub
      // 07c: fstore 4
      // 07e: fload 4
      // 080: iload 3
      // 081: ifeq 09a
      // 084: fconst_2
      // 085: fcmpl
      // 086: ifle 102
      // 089: goto 090
      // 08c: invokestatic og6.a (Loov;)Loov;
      // 08f: athrow
      // 090: ldc 0.5
      // 092: nop
      // 093: goto 09a
      // 096: invokestatic og6.a (Loov;)Loov;
      // 099: athrow
      // 09a: fstore 5
      // 09c: aload 0
      // 09d: getfield og6.koa I
      // 0a0: bipush 2
      // 0a1: iadd
      // 0a2: i2f
      // 0a3: aload 0
      // 0a4: getfield og6.mff I
      // 0a7: aload 0
      // 0a8: getfield og6.c1c I
      // 0ab: bipush 2
      // 0ac: idiv
      // 0ad: iadd
      // 0ae: bipush 1
      // 0af: iadd
      // 0b0: i2f
      // 0b1: fload 4
      // 0b3: fconst_2
      // 0b4: fdiv
      // 0b5: fload 5
      // 0b7: new java/awt/Color
      // 0ba: dup
      // 0bb: sipush 195
      // 0be: sipush 195
      // 0c1: sipush 195
      // 0c4: invokespecial java/awt/Color.<init> (III)V
      // 0c7: invokestatic mkt.rn3 (FFFFLjava/awt/Color;)V
      // 0ca: aload 0
      // 0cb: getfield og6.koa I
      // 0ce: aload 0
      // 0cf: getfield og6.vms I
      // 0d2: iadd
      // 0d3: bipush 2
      // 0d4: isub
      // 0d5: i2f
      // 0d6: fload 4
      // 0d8: fconst_2
      // 0d9: fdiv
      // 0da: fsub
      // 0db: aload 0
      // 0dc: getfield og6.mff I
      // 0df: aload 0
      // 0e0: getfield og6.c1c I
      // 0e3: bipush 2
      // 0e4: idiv
      // 0e5: iadd
      // 0e6: bipush 1
      // 0e7: iadd
      // 0e8: i2f
      // 0e9: fload 4
      // 0eb: fconst_2
      // 0ec: fdiv
      // 0ed: fload 5
      // 0ef: new java/awt/Color
      // 0f2: dup
      // 0f3: sipush 195
      // 0f6: sipush 195
      // 0f9: sipush 195
      // 0fc: invokespecial java/awt/Color.<init> (III)V
      // 0ff: invokestatic mkt.rn3 (FFFFLjava/awt/Color;)V
      // 102: return
   }

   @Override
   public void x6o(int var1, int var2, boolean var3) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2171267511934847025L, 8559529165628140438L, MethodHandles.lookup().lookupClass()).a(51474526332939L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 128381910289849L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("nq\nP\u009eü\u009a\u0014".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      c = var6;
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
