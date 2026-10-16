import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fqr {
   public double lvi;
   public double gn5;
   public double bn2;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public fqr(double var1, double var3, double var5) {
      if (var1 == -0.0) {
         var1 = 0.0;
      }

      if (var3 == -0.0) {
         var3 = 0.0;
      }

      if (var5 == -0.0) {
         var5 = 0.0;
      }

      this.lvi = var1;
      this.gn5 = var3;
      this.bn2 = var5;
   }

   public fqr(wgo var1) {
      this((double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
   }

   public fqr vei(fqr var1) {
      return new fqr(var1.lvi - this.lvi, var1.gn5 - this.gn5, var1.bn2 - this.bn2);
   }

   public fqr kec() {
      double var1 = (double)fe6.dii(this.lvi * this.lvi + this.gn5 * this.gn5 + this.bn2 * this.bn2);

      try {
         if (var1 < 1.0E-4) {
            return new fqr(0.0, 0.0, 0.0);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return new fqr(this.lvi / var1, this.gn5 / var1, this.bn2 / var1);
   }

   public double xvl(fqr var1) {
      return this.lvi * var1.lvi + this.gn5 * var1.gn5 + this.bn2 * var1.bn2;
   }

   public fqr ajp(fqr var1) {
      return new fqr(this.gn5 * var1.bn2 - this.bn2 * var1.gn5, this.bn2 * var1.lvi - this.lvi * var1.bn2, this.lvi * var1.gn5 - this.gn5 * var1.lvi);
   }

   public fqr _kk(fqr var1) {
      return this.l8u(var1.lvi, var1.gn5, var1.bn2);
   }

   public fqr l8u(double var1, double var3, double var5) {
      return this.r2x(-var1, -var3, -var5);
   }

   public fqr lle(fqr var1) {
      return this.r2x(var1.lvi, var1.gn5, var1.bn2);
   }

   public fqr r2x(double var1, double var3, double var5) {
      return new fqr(this.lvi + var1, this.gn5 + var3, this.bn2 + var5);
   }

   public double b4d(fqr var1) {
      double var2 = var1.lvi - this.lvi;
      double var4 = var1.gn5 - this.gn5;
      double var6 = var1.bn2 - this.bn2;
      return (double)fe6.dii(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double y8x(fqr var1) {
      double var2 = var1.lvi - this.lvi;
      double var4 = var1.gn5 - this.gn5;
      double var6 = var1.bn2 - this.bn2;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double vtb() {
      return (double)fe6.dii(this.lvi * this.lvi + this.gn5 * this.gn5 + this.bn2 * this.bn2);
   }

   public fqr t0u(fqr param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield fqr.lvi D
      // 04: aload 0
      // 05: getfield fqr.lvi D
      // 08: dsub
      // 09: dstore 5
      // 0b: aload 1
      // 0c: getfield fqr.gn5 D
      // 0f: aload 0
      // 10: getfield fqr.gn5 D
      // 13: dsub
      // 14: dstore 7
      // 16: invokestatic t9d.b ()I
      // 19: aload 1
      // 1a: getfield fqr.bn2 D
      // 1d: aload 0
      // 1e: getfield fqr.bn2 D
      // 21: dsub
      // 22: dstore 9
      // 24: istore 4
      // 26: dload 5
      // 28: dload 5
      // 2a: dmul
      // 2b: ldc2_w 1.0000000116860974E-7
      // 2e: iload 4
      // 30: ifeq 4c
      // 33: dcmpg
      // 34: ifge 44
      // 37: goto 3e
      // 3a: invokestatic fqr.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aconst_null
      // 3f: areturn
      // 40: invokestatic fqr.a (Loov;)Loov;
      // 43: athrow
      // 44: dload 2
      // 45: aload 0
      // 46: getfield fqr.lvi D
      // 49: dsub
      // 4a: dload 5
      // 4c: ddiv
      // 4d: dstore 11
      // 4f: dload 11
      // 51: dconst_0
      // 52: dcmpl
      // 53: iload 4
      // 55: ifeq 6d
      // 58: iflt 9c
      // 5b: goto 62
      // 5e: invokestatic fqr.a (Loov;)Loov;
      // 61: athrow
      // 62: dload 11
      // 64: dconst_1
      // 65: dcmpg
      // 66: goto 6d
      // 69: invokestatic fqr.a (Loov;)Loov;
      // 6c: athrow
      // 6d: ifgt 9c
      // 70: new fqr
      // 73: dup
      // 74: aload 0
      // 75: getfield fqr.lvi D
      // 78: dload 5
      // 7a: dload 11
      // 7c: dmul
      // 7d: dadd
      // 7e: aload 0
      // 7f: getfield fqr.gn5 D
      // 82: dload 7
      // 84: dload 11
      // 86: dmul
      // 87: dadd
      // 88: aload 0
      // 89: getfield fqr.bn2 D
      // 8c: dload 9
      // 8e: dload 11
      // 90: dmul
      // 91: dadd
      // 92: invokespecial fqr.<init> (DDD)V
      // 95: goto 9d
      // 98: invokestatic fqr.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aconst_null
      // 9d: areturn
   }

   public fqr _5q(fqr param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield fqr.lvi D
      // 04: aload 0
      // 05: getfield fqr.lvi D
      // 08: dsub
      // 09: dstore 5
      // 0b: invokestatic t9d.b ()I
      // 0e: aload 1
      // 0f: getfield fqr.gn5 D
      // 12: aload 0
      // 13: getfield fqr.gn5 D
      // 16: dsub
      // 17: dstore 7
      // 19: istore 4
      // 1b: aload 1
      // 1c: getfield fqr.bn2 D
      // 1f: aload 0
      // 20: getfield fqr.bn2 D
      // 23: dsub
      // 24: dstore 9
      // 26: dload 7
      // 28: dload 7
      // 2a: dmul
      // 2b: ldc2_w 1.0000000116860974E-7
      // 2e: iload 4
      // 30: ifeq 4c
      // 33: dcmpg
      // 34: ifge 44
      // 37: goto 3e
      // 3a: invokestatic fqr.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aconst_null
      // 3f: areturn
      // 40: invokestatic fqr.a (Loov;)Loov;
      // 43: athrow
      // 44: dload 2
      // 45: aload 0
      // 46: getfield fqr.gn5 D
      // 49: dsub
      // 4a: dload 7
      // 4c: ddiv
      // 4d: dstore 11
      // 4f: dload 11
      // 51: dconst_0
      // 52: dcmpl
      // 53: iload 4
      // 55: ifeq 6d
      // 58: iflt 9c
      // 5b: goto 62
      // 5e: invokestatic fqr.a (Loov;)Loov;
      // 61: athrow
      // 62: dload 11
      // 64: dconst_1
      // 65: dcmpg
      // 66: goto 6d
      // 69: invokestatic fqr.a (Loov;)Loov;
      // 6c: athrow
      // 6d: ifgt 9c
      // 70: new fqr
      // 73: dup
      // 74: aload 0
      // 75: getfield fqr.lvi D
      // 78: dload 5
      // 7a: dload 11
      // 7c: dmul
      // 7d: dadd
      // 7e: aload 0
      // 7f: getfield fqr.gn5 D
      // 82: dload 7
      // 84: dload 11
      // 86: dmul
      // 87: dadd
      // 88: aload 0
      // 89: getfield fqr.bn2 D
      // 8c: dload 9
      // 8e: dload 11
      // 90: dmul
      // 91: dadd
      // 92: invokespecial fqr.<init> (DDD)V
      // 95: goto 9d
      // 98: invokestatic fqr.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aconst_null
      // 9d: areturn
   }

   public fqr p9z(fqr param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield fqr.lvi D
      // 04: aload 0
      // 05: getfield fqr.lvi D
      // 08: dsub
      // 09: dstore 5
      // 0b: invokestatic t9d.c ()I
      // 0e: aload 1
      // 0f: getfield fqr.gn5 D
      // 12: aload 0
      // 13: getfield fqr.gn5 D
      // 16: dsub
      // 17: dstore 7
      // 19: aload 1
      // 1a: getfield fqr.bn2 D
      // 1d: aload 0
      // 1e: getfield fqr.bn2 D
      // 21: dsub
      // 22: dstore 9
      // 24: istore 4
      // 26: dload 9
      // 28: dload 9
      // 2a: dmul
      // 2b: ldc2_w 1.0000000116860974E-7
      // 2e: iload 4
      // 30: ifne 4c
      // 33: dcmpg
      // 34: ifge 44
      // 37: goto 3e
      // 3a: invokestatic fqr.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aconst_null
      // 3f: areturn
      // 40: invokestatic fqr.a (Loov;)Loov;
      // 43: athrow
      // 44: dload 2
      // 45: aload 0
      // 46: getfield fqr.bn2 D
      // 49: dsub
      // 4a: dload 9
      // 4c: ddiv
      // 4d: dstore 11
      // 4f: dload 11
      // 51: dconst_0
      // 52: dcmpl
      // 53: iload 4
      // 55: ifne 6d
      // 58: iflt 9c
      // 5b: goto 62
      // 5e: invokestatic fqr.a (Loov;)Loov;
      // 61: athrow
      // 62: dload 11
      // 64: dconst_1
      // 65: dcmpg
      // 66: goto 6d
      // 69: invokestatic fqr.a (Loov;)Loov;
      // 6c: athrow
      // 6d: ifgt 9c
      // 70: new fqr
      // 73: dup
      // 74: aload 0
      // 75: getfield fqr.lvi D
      // 78: dload 5
      // 7a: dload 11
      // 7c: dmul
      // 7d: dadd
      // 7e: aload 0
      // 7f: getfield fqr.gn5 D
      // 82: dload 7
      // 84: dload 11
      // 86: dmul
      // 87: dadd
      // 88: aload 0
      // 89: getfield fqr.bn2 D
      // 8c: dload 9
      // 8e: dload 11
      // 90: dmul
      // 91: dadd
      // 92: invokespecial fqr.<init> (DDD)V
      // 95: goto 9d
      // 98: invokestatic fqr.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aconst_null
      // 9d: areturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 137017619254341L;
      return "(" + this.lvi + a<"l">(14857, 985404665025006995L ^ var1) + this.gn5 + a<"l">(18523, 6084737732489707456L ^ var1) + this.bn2 + ")";
   }

   public fqr mx1(float var1) {
      float var2 = fe6.ssk(var1);
      float var3 = fe6.rtn(var1);
      double var4 = this.lvi;
      double var6 = this.gn5 * (double)var2 + this.bn2 * (double)var3;
      double var8 = this.bn2 * (double)var2 - this.gn5 * (double)var3;
      return new fqr(var4, var6, var8);
   }

   public fqr av2(float var1) {
      float var2 = fe6.ssk(var1);
      float var3 = fe6.rtn(var1);
      double var4 = this.lvi * (double)var2 + this.bn2 * (double)var3;
      double var6 = this.gn5;
      double var8 = this.bn2 * (double)var2 - this.lvi * (double)var3;
      return new fqr(var4, var6, var8);
   }

   public fqr zc9(double var1) {
      return new fqr(this.lvi * var1, this.gn5 * var1, this.bn2 * var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5765727035093301882L, -736981646531913518L, MethodHandles.lookup().lookupClass()).a(130307752896372L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 118188651978205L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u0001·_ð[ªv\"_?\u008dê\u0001+Ô²\u0010¬\u001f¿9\u001bjã\u000ez·AÈÚy\u000e\u008f";
      int var8 = "\u0001·_ð[ªv\"_?\u008dê\u0001+Ô²\u0010¬\u001f¿9\u001bjã\u000ez·AÈÚy\u000e\u008f".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21512;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("fqr", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("fqr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
