import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class neh extends gbe implements sw6 {
   private static final long a;
   private static final String b;

   @Override
   public void pg4(String var1) {
      this.qph(var1);
   }

   @Override
   public void qph(String var1) {
      long var2 = a ^ 100120367117078L;
      this.wgt = var1;
      this.an6(b);
   }

   @Override
   public void an6(String var1) {
      this.mn4 = var1;
      this.e2w(0);
   }

   @Override
   public void e2w(int var1) {
      this.hsr = var1;
   }

   @Override
   public void ij4() {
      this.imm = true;
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifeq 054
      // 00b: getfield neh.imm Z
      // 00e: ifeq 04c
      // 011: goto 018
      // 014: invokestatic neh.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: getfield neh.f41 Lc05;
      // 01c: iload 4
      // 01e: ifeq 040
      // 021: goto 028
      // 024: invokestatic neh.a (Loov;)Loov;
      // 027: athrow
      // 028: invokevirtual c05.h65 ()Z
      // 02b: ifne 118
      // 02e: goto 035
      // 031: invokestatic neh.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: getfield neh.f41 Lc05;
      // 039: goto 040
      // 03c: invokestatic neh.a (Loov;)Loov;
      // 03f: athrow
      // 040: aconst_null
      // 041: checkcast gbe
      // 044: invokevirtual c05.z2i (Lgbe;)V
      // 047: iload 4
      // 049: ifne 118
      // 04c: aload 0
      // 04d: goto 054
      // 050: invokestatic neh.a (Loov;)Loov;
      // 053: athrow
      // 054: iload 4
      // 056: ifeq 0a6
      // 059: getfield neh.dcw Lnet/optifine/CustomLoadingScreen;
      // 05c: ifnull 09e
      // 05f: goto 066
      // 062: invokestatic neh.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: iload 4
      // 069: ifeq 0a6
      // 06c: goto 073
      // 06f: invokestatic neh.a (Loov;)Loov;
      // 072: athrow
      // 073: getfield neh.f41 Lc05;
      // 076: getfield c05.tij Lkh3;
      // 079: ifnonnull 09e
      // 07c: goto 083
      // 07f: invokestatic neh.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 0
      // 084: getfield neh.dcw Lnet/optifine/CustomLoadingScreen;
      // 087: aload 0
      // 088: getfield neh.dt7 I
      // 08b: aload 0
      // 08c: getfield neh.o1e I
      // 08f: invokevirtual net/optifine/CustomLoadingScreen.drawBackground (II)V
      // 092: iload 4
      // 094: ifne 0a9
      // 097: goto 09e
      // 09a: invokestatic neh.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 0
      // 09f: goto 0a6
      // 0a2: invokestatic neh.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: invokevirtual neh.xmz ()V
      // 0a9: aload 0
      // 0aa: iload 4
      // 0ac: ifeq 112
      // 0af: getfield neh.hsr I
      // 0b2: ifle 111
      // 0b5: goto 0bc
      // 0b8: invokestatic neh.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: aload 0
      // 0be: getfield neh.fex Lowt;
      // 0c1: aload 0
      // 0c2: getfield neh.wgt Ljava/lang/String;
      // 0c5: aload 0
      // 0c6: getfield neh.dt7 I
      // 0c9: bipush 2
      // 0ca: idiv
      // 0cb: bipush 70
      // 0cd: ldc 16777215
      // 0cf: nop
      // 0d0: invokevirtual neh.poi (Lowt;Ljava/lang/String;III)V
      // 0d3: aload 0
      // 0d4: aload 0
      // 0d5: getfield neh.fex Lowt;
      // 0d8: new java/lang/StringBuilder
      // 0db: dup
      // 0dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0df: aload 0
      // 0e0: getfield neh.mn4 Ljava/lang/String;
      // 0e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e6: ldc " "
      // 0e8: nop
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: aload 0
      // 0ed: getfield neh.hsr I
      // 0f0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0f3: ldc "%"
      // 0f5: nop
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fc: aload 0
      // 0fd: getfield neh.dt7 I
      // 100: bipush 2
      // 101: idiv
      // 102: bipush 90
      // 104: ldc 16777215
      // 106: nop
      // 107: invokevirtual neh.poi (Lowt;Ljava/lang/String;III)V
      // 10a: goto 111
      // 10d: invokestatic neh.a (Loov;)Loov;
      // 110: athrow
      // 111: aload 0
      // 112: iload 1
      // 113: iload 2
      // 114: fload 3
      // 115: invokespecial gbe.drawScreen (IIF)V
      // 118: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8052093896298731760L, 331483309371568290L, MethodHandles.lookup().lookupClass()).a(58775361030789L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 61981920905453L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("KÒ/Þï\u00adç3æp\u0094 LQ\u0004 ".getBytes("ISO-8859-1"));
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
