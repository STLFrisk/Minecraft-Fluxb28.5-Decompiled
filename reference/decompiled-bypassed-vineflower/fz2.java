import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fz2 extends u1p {
   public double mno;
   public double w2f;
   public double lvt;
   public float hoc;
   public float iq9;
   public boolean p3t;
   private static final long a;
   private static final String b;

   public fz2(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.w2f = var3;
      this.lvt = var5;
      this.mno = var1;
      this.hoc = var7;
      this.iq9 = var8;
      this.p3t = var9;
   }

   public void h8j(float var1) {
      this.hoc = var1;
      this.rcp = true;
   }

   public void ni7(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic fz2.a J
      // 03: ldc2_w 45574671873410
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: fload 1
      // 0e: invokestatic java/lang/Math.abs (F)F
      // 11: ldc 90.0
      // 13: nop
      // 14: fcmpl
      // 15: iload 4
      // 17: ifne 4b
      // 1a: iflt 5d
      // 1d: goto 24
      // 20: invokestatic fz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new java/lang/StringBuilder
      // 27: dup
      // 28: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b: getstatic fz2.b Ljava/lang/String;
      // 2e: nop
      // 2f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32: fload 1
      // 33: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 36: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 39: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 3c: iload 4
      // 3e: ifne 67
      // 41: goto 48
      // 44: invokestatic fz2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: getstatic zwr.jut Z
      // 4b: ifeq 5d
      // 4e: new java/lang/Exception
      // 51: dup
      // 52: invokespecial java/lang/Exception.<init> ()V
      // 55: athrow
      // 56: astore 5
      // 58: aload 5
      // 5a: invokevirtual java/lang/Exception.printStackTrace ()V
      // 5d: aload 0
      // 5e: fload 1
      // 5f: putfield fz2.iq9 F
      // 62: aload 0
      // 63: bipush 1
      // 64: putfield fz2.rcp Z
      // 67: return
   }

   public void cqr(float[] var1) {
      this.h8j(var1[0]);
      this.ni7(var1[1]);
      this.rcp = true;
   }

   public float m1r() {
      return this.hoc;
   }

   public float d9n() {
      return this.iq9;
   }

   public boolean lhw() {
      return this.rcp;
   }

   public void nxl(double var1) {
      this.mno = var1;
   }

   public void o4n(double var1) {
      this.w2f = var1;
   }

   public void idi(double var1) {
      this.lvt = var1;
   }

   public double e8j() {
      return this.mno;
   }

   public double fk0() {
      return this.w2f;
   }

   public double ean() {
      return this.lvt;
   }

   public void eff(boolean var1) {
      this.p3t = var1;
   }

   public boolean upz() {
      return this.p3t;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3883467106386835383L, -2145556054299798744L, MethodHandles.lookup().lookupClass()).a(185636636421298L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 47202773836537L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ísám3)Â¸OuÊ\u0015\u0097´L&õ,\u0005\u00114hR\u0088".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static Exception a(Exception var0) {
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
