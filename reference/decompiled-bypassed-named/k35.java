import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k35 extends ak9 {
   private static final long a;
   private static final String c;

   public k35(nm6 var1, int var2, int var3, String var4) {
      long var5 = a ^ 104347124857952L;
      super(var1, var2, var3, var4);
      this.vms = jvy.ypj;
      this.c1c = (int)(jsr.erx.wni(this.vy4) + 1.0F);
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: getstatic jsr.erx Lcyb;
      // 007: aload 0
      // 008: getfield k35.vy4 Ljava/lang/String;
      // 00b: aload 0
      // 00c: getfield k35.koa I
      // 00f: i2f
      // 010: aload 0
      // 011: getfield k35.vms I
      // 014: bipush 2
      // 015: idiv
      // 016: i2f
      // 017: getstatic jsr.erx Lcyb;
      // 01a: aload 0
      // 01b: getfield k35.vy4 Ljava/lang/String;
      // 01e: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 021: fconst_2
      // 022: fdiv
      // 023: fsub
      // 024: fadd
      // 025: f2i
      // 026: i2f
      // 027: aload 0
      // 028: getfield k35.mff I
      // 02b: i2f
      // 02c: aload 0
      // 02d: getfield k35.c1c I
      // 030: bipush 2
      // 031: idiv
      // 032: i2f
      // 033: getstatic jsr.erx Lcyb;
      // 036: aload 0
      // 037: getfield k35.vy4 Ljava/lang/String;
      // 03a: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 03d: fconst_2
      // 03e: fdiv
      // 03f: fsub
      // 040: fadd
      // 041: fconst_2
      // 042: fadd
      // 043: getstatic jvy.ck5 Z
      // 046: iload 3
      // 047: ifne 063
      // 04a: ifeq 061
      // 04d: goto 054
      // 050: invokestatic k35.a (Loov;)Loov;
      // 053: athrow
      // 054: getstatic z7e.kks Lz7e;
      // 057: getfield z7e.k0y I
      // 05a: goto 064
      // 05d: invokestatic k35.a (Loov;)Loov;
      // 060: athrow
      // 061: ldc 16777215
      // 063: nop
      // 064: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 067: pop
      // 068: aload 0
      // 069: getfield k35.vms I
      // 06c: i2f
      // 06d: getstatic jsr.erx Lcyb;
      // 070: aload 0
      // 071: getfield k35.vy4 Ljava/lang/String;
      // 074: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 077: fsub
      // 078: ldc 8.0
      // 07a: nop
      // 07b: fsub
      // 07c: fstore 4
      // 07e: fload 4
      // 080: iload 3
      // 081: ifne 09a
      // 084: fconst_2
      // 085: fcmpl
      // 086: ifle 10b
      // 089: goto 090
      // 08c: invokestatic k35.a (Loov;)Loov;
      // 08f: athrow
      // 090: ldc 0.5
      // 092: nop
      // 093: goto 09a
      // 096: invokestatic k35.a (Loov;)Loov;
      // 099: athrow
      // 09a: fstore 5
      // 09c: aload 0
      // 09d: getfield k35.koa I
      // 0a0: bipush 8
      // 0a2: iadd
      // 0a3: i2f
      // 0a4: aload 0
      // 0a5: getfield k35.mff I
      // 0a8: aload 0
      // 0a9: getfield k35.c1c I
      // 0ac: bipush 2
      // 0ad: idiv
      // 0ae: iadd
      // 0af: bipush 1
      // 0b0: iadd
      // 0b1: i2f
      // 0b2: fload 4
      // 0b4: fconst_2
      // 0b5: fdiv
      // 0b6: ldc 6.0
      // 0b8: nop
      // 0b9: fsub
      // 0ba: fload 5
      // 0bc: new java/awt/Color
      // 0bf: dup
      // 0c0: sipush 195
      // 0c3: sipush 195
      // 0c6: sipush 195
      // 0c9: invokespecial java/awt/Color.<init> (III)V
      // 0cc: invokestatic mkt.rn3 (FFFFLjava/awt/Color;)V
      // 0cf: aload 0
      // 0d0: getfield k35.koa I
      // 0d3: aload 0
      // 0d4: getfield k35.vms I
      // 0d7: iadd
      // 0d8: bipush 2
      // 0d9: isub
      // 0da: i2f
      // 0db: fload 4
      // 0dd: fconst_2
      // 0de: fdiv
      // 0df: fsub
      // 0e0: aload 0
      // 0e1: getfield k35.mff I
      // 0e4: aload 0
      // 0e5: getfield k35.c1c I
      // 0e8: bipush 2
      // 0e9: idiv
      // 0ea: iadd
      // 0eb: bipush 1
      // 0ec: iadd
      // 0ed: i2f
      // 0ee: fload 4
      // 0f0: fconst_2
      // 0f1: fdiv
      // 0f2: ldc 6.0
      // 0f4: nop
      // 0f5: fsub
      // 0f6: fload 5
      // 0f8: new java/awt/Color
      // 0fb: dup
      // 0fc: sipush 195
      // 0ff: sipush 195
      // 102: sipush 195
      // 105: invokespecial java/awt/Color.<init> (III)V
      // 108: invokestatic mkt.rn3 (FFFFLjava/awt/Color;)V
      // 10b: return
   }

   @Override
   public void x6o(int var1, int var2, boolean var3) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3105882663570892944L, -5894962722847731307L, MethodHandles.lookup().lookupClass()).a(16448838559868L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 97372354640572L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("9\u0011g;êK\u008bî\f\u008cúï\u008b]û\"".getBytes("ISO-8859-1"));
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
