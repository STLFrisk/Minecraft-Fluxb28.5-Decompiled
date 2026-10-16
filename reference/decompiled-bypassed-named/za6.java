import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class za6 extends u7m {
   private float eey;
   private final u7m$vz9 i6g;
   private static final long a;
   private static final String b;

   public za6(u7m$vz9 var1) {
      this.i6g = var1;
      this.vgp = 1;
      this.rlr(var1.sqv());
      this.qfy(uja.hrg);
      this.eey = 4.0F + var1.zua();
   }

   public float ngv() {
      return this.i6g.zua();
   }

   @Override
   public float v1f(erg param1, e0x param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 1f
      // 09: getstatic ox_.gna Le0x;
      // 0c: if_acmpne 1e
      // 0f: goto 16
      // 12: invokestatic za6.a (Loov;)Loov;
      // 15: athrow
      // 16: ldc 15.0
      // 18: nop
      // 19: freturn
      // 1a: invokestatic za6.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokevirtual e0x.p1r ()Lp3y;
      // 22: astore 4
      // 24: aload 4
      // 26: getstatic p3y.nc7 Lp3y;
      // 29: iload 3
      // 2a: ifeq 43
      // 2d: if_acmpeq 9c
      // 30: goto 37
      // 33: invokestatic za6.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 4
      // 39: getstatic p3y.wui Lp3y;
      // 3c: goto 43
      // 3f: invokestatic za6.a (Loov;)Loov;
      // 42: athrow
      // 43: iload 3
      // 44: ifeq 5d
      // 47: if_acmpeq 9c
      // 4a: goto 51
      // 4d: invokestatic za6.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 4
      // 53: getstatic p3y.mv0 Lp3y;
      // 56: goto 5d
      // 59: invokestatic za6.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 3
      // 5e: ifeq 77
      // 61: if_acmpeq 9c
      // 64: goto 6b
      // 67: invokestatic za6.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 4
      // 6d: getstatic p3y.hh1 Lp3y;
      // 70: goto 77
      // 73: invokestatic za6.a (Loov;)Loov;
      // 76: athrow
      // 77: iload 3
      // 78: ifeq 91
      // 7b: if_acmpeq 9c
      // 7e: goto 85
      // 81: invokestatic za6.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 4
      // 87: getstatic p3y.clf Lp3y;
      // 8a: goto 91
      // 8d: invokestatic za6.a (Loov;)Loov;
      // 90: athrow
      // 91: if_acmpeq 9c
      // 94: fconst_1
      // 95: goto 9f
      // 98: invokestatic za6.a (Loov;)Loov;
      // 9b: athrow
      // 9c: ldc 1.5
      // 9e: nop
      // 9f: freturn
   }

   @Override
   public boolean gtk(erg var1, Entity var2, Entity var3) {
      var1.ybw(1, var3);
      return true;
   }

   @Override
   public boolean ziu(erg param1, OpaquePredicate param2, e0x param3, mew param4, Entity param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 3
      // 06: aload 2
      // 07: aload 4
      // 09: invokevirtual e0x.wnt (Lt9d;Lmew;)F
      // 0c: f2d
      // 0d: dconst_0
      // 0e: dcmpl
      // 0f: iload 6
      // 11: ifne 2d
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic za6.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: bipush 2
      // 20: aload 5
      // 22: invokevirtual erg.ybw (ILg_3;)V
      // 25: goto 2c
      // 28: invokestatic za6.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
   }

   @Override
   public boolean t0m() {
      return true;
   }

   @Override
   public ce2 uf6(erg var1) {
      return ce2.b7w;
   }

   @Override
   public int hdm(erg var1) {
      return 72000;
   }

   @Override
   public erg r__(erg var1, OpaquePredicate var2, ha9 var3) {
      var3.qez(var1, this.hdm(var1));
      return var1;
   }

   @Override
   public boolean azl(e0x var1) {
      try {
         if (var1 == ox_.gna) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public int k7x() {
      return this.i6g.pmc();
   }

   public String h6t() {
      return this.i6g.toString();
   }

   @Override
   public boolean nur(erg param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 26
      // 09: getfield za6.i6g Lu7m$vz9;
      // 0c: invokevirtual u7m$vz9.jw6 ()Lu7m;
      // 0f: aload 2
      // 10: invokevirtual erg.gn1 ()Lu7m;
      // 13: if_acmpne 25
      // 16: goto 1d
      // 19: invokestatic za6.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 2b
      // 21: invokestatic za6.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: aload 2
      // 28: invokespecial u7m.nur (Lerg;Lerg;)Z
      // 2b: ireturn
   }

   @Override
   public Multimap hv4() {
      long var1 = a ^ 118293909133902L;
      Multimap var3 = super.hv4();
      var3.put(m6d.y3f.ugh(), new xk5(lz8, b, (double)this.eey, 0));
      return var3;
   }

   public float mpm() {
      return this.eey;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7187395691833773622L, -4739902754027737918L, MethodHandles.lookup().lookupClass()).a(28504059978779L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 121980732553123L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0086#\n\u00196ÆX\u001f)ÀdWtr\u009a\u0000".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      b = var6;
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
