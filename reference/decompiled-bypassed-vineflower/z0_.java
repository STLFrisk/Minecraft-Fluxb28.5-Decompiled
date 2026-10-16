import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class z0_ implements rsi {
   private static final long a;
   private static final String b;

   public z0_(_jc var1, int var2, int var3) {
      int var4 = var2 * var3;
      this.veq = new erg[var4];
      this.zph = var1;
      this.ewh = var2;
      this.b5m = var3;
   }

   @Override
   public int opt() {
      return this.veq.length;
   }

   @Override
   public erg ibn(int var1) {
      try {
         if (var1 >= this.opt()) {
            return null;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return this.veq[var1];
   }

   public erg grp(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifeq 14
      // 09: iflt 57
      // 0c: goto 13
      // 0f: invokestatic z0_.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 1
      // 14: iload 3
      // 15: ifeq 2e
      // 18: aload 0
      // 19: getfield z0_.ewh I
      // 1c: if_icmpge 57
      // 1f: goto 26
      // 22: invokestatic z0_.a (Loov;)Loov;
      // 25: athrow
      // 26: iload 2
      // 27: goto 2e
      // 2a: invokestatic z0_.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 3
      // 2f: ifeq 3d
      // 32: iflt 57
      // 35: goto 3c
      // 38: invokestatic z0_.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 2
      // 3d: aload 0
      // 3e: getfield z0_.b5m I
      // 41: if_icmpgt 57
      // 44: aload 0
      // 45: iload 1
      // 46: iload 2
      // 47: aload 0
      // 48: getfield z0_.ewh I
      // 4b: imul
      // 4c: iadd
      // 4d: invokevirtual z0_.ibn (I)Lerg;
      // 50: goto 58
      // 53: invokestatic z0_.a (Loov;)Loov;
      // 56: athrow
      // 57: aconst_null
      // 58: areturn
   }

   @Override
   public String noc() {
      long var1 = a ^ 135394855783911L;
      return b;
   }

   @Override
   public boolean qrh() {
      return false;
   }

   @Override
   public ekw xyw() {
      try {
         if (this.qrh()) {
            return new tao(this.noc());
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return new hsu(this.noc(), new Object[0]);
   }

   @Override
   public erg yvk(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield z0_.veq [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: iload 2
      // 0b: ifne 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic z0_.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield z0_.veq [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic z0_.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield z0_.veq [Lerg;
      // 2a: iload 1
      // 2b: aconst_null
      // 2c: aastore
      // 2d: aload 3
      // 2e: areturn
      // 2f: aconst_null
      // 30: areturn
   }

   @Override
   public erg afc(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield z0_.veq [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: iload 3
      // 0b: ifeq 25
      // 0e: ifnull 8d
      // 11: goto 18
      // 14: invokestatic z0_.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield z0_.veq [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic z0_.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 3
      // 26: ifeq 5b
      // 29: getfield erg.qd2 I
      // 2c: iload 2
      // 2d: if_icmpgt 51
      // 30: goto 37
      // 33: invokestatic z0_.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield z0_.veq [Lerg;
      // 3b: iload 1
      // 3c: aaload
      // 3d: astore 4
      // 3f: aload 0
      // 40: getfield z0_.veq [Lerg;
      // 43: iload 1
      // 44: aconst_null
      // 45: aastore
      // 46: aload 0
      // 47: getfield z0_.zph L_jc;
      // 4a: aload 0
      // 4b: invokevirtual _jc.ih9 (Lrsi;)V
      // 4e: aload 4
      // 50: areturn
      // 51: aload 0
      // 52: getfield z0_.veq [Lerg;
      // 55: iload 1
      // 56: aaload
      // 57: iload 2
      // 58: invokevirtual erg.amj (I)Lerg;
      // 5b: astore 4
      // 5d: aload 0
      // 5e: getfield z0_.veq [Lerg;
      // 61: iload 1
      // 62: aaload
      // 63: iload 3
      // 64: ifeq 8c
      // 67: getfield erg.qd2 I
      // 6a: ifne 82
      // 6d: goto 74
      // 70: invokestatic z0_.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: getfield z0_.veq [Lerg;
      // 78: iload 1
      // 79: aconst_null
      // 7a: aastore
      // 7b: goto 82
      // 7e: invokestatic z0_.a (Loov;)Loov;
      // 81: athrow
      // 82: aload 0
      // 83: getfield z0_.zph L_jc;
      // 86: aload 0
      // 87: invokevirtual _jc.ih9 (Lrsi;)V
      // 8a: aload 4
      // 8c: areturn
      // 8d: aconst_null
      // 8e: areturn
   }

   @Override
   public void cxl(int var1, erg var2) {
      this.veq[var1] = var2;
      this.zph.ih9(this);
   }

   @Override
   public int v6l() {
      return 64;
   }

   @Override
   public void r5t() {
   }

   @Override
   public boolean dnv(ha9 var1) {
      return true;
   }

   @Override
   public void dk0(ha9 var1) {
   }

   @Override
   public void vhz(ha9 var1) {
   }

   @Override
   public boolean er2(int var1, erg var2) {
      return true;
   }

   @Override
   public int czu(int var1) {
      return 0;
   }

   @Override
   public void r8i(int var1, int var2) {
   }

   @Override
   public int xa3() {
      return 0;
   }

   @Override
   public void nec() {
      int var1 = t9d.c();
      int var2 = 0;

      while (var2 < this.veq.length) {
         this.veq[var2] = null;
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   public int fv2() {
      return this.b5m;
   }

   public int gx0() {
      return this.ewh;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6147941122464709312L, 3279104857231109955L, MethodHandles.lookup().lookupClass()).a(211010642487188L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 135575904237714L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Jõî\u001ej')×¾\u0002»\u0014sûä\u0012öb8}\u009c\u0088qd".getBytes("ISO-8859-1"));
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
