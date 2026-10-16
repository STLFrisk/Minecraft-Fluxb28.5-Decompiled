import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class u42 implements rsi {
   private static final long a;
   private static final String b;

   public u42(ha9 var1, a7q var2) {
      this.r4k = var1;
      this.c99 = var2;
   }

   @Override
   public int opt() {
      return this.qz4.length;
   }

   @Override
   public erg ibn(int var1) {
      return this.qz4[var1];
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield u42.qz4 [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: ifnull c9
      // 0d: iload 1
      // 0e: bipush 2
      // 0f: iload 3
      // 10: ifeq 4b
      // 13: goto 1a
      // 16: invokestatic u42.a (Loov;)Loov;
      // 19: athrow
      // 1a: if_icmpne 36
      // 1d: goto 24
      // 20: invokestatic u42.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield u42.qz4 [Lerg;
      // 28: iload 1
      // 29: aaload
      // 2a: astore 4
      // 2c: aload 0
      // 2d: getfield u42.qz4 [Lerg;
      // 30: iload 1
      // 31: aconst_null
      // 32: aastore
      // 33: aload 4
      // 35: areturn
      // 36: aload 0
      // 37: getfield u42.qz4 [Lerg;
      // 3a: iload 1
      // 3b: aaload
      // 3c: iload 3
      // 3d: ifeq 88
      // 40: getfield erg.qd2 I
      // 43: iload 2
      // 44: goto 4b
      // 47: invokestatic u42.a (Loov;)Loov;
      // 4a: athrow
      // 4b: if_icmpgt 7e
      // 4e: aload 0
      // 4f: getfield u42.qz4 [Lerg;
      // 52: iload 1
      // 53: aaload
      // 54: astore 4
      // 56: aload 0
      // 57: getfield u42.qz4 [Lerg;
      // 5a: iload 1
      // 5b: aconst_null
      // 5c: aastore
      // 5d: aload 0
      // 5e: iload 3
      // 5f: ifeq 78
      // 62: iload 1
      // 63: invokespecial u42.w4d (I)Z
      // 66: ifeq 7b
      // 69: goto 70
      // 6c: invokestatic u42.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: goto 78
      // 74: invokestatic u42.a (Loov;)Loov;
      // 77: athrow
      // 78: invokevirtual u42.jcn ()V
      // 7b: aload 4
      // 7d: areturn
      // 7e: aload 0
      // 7f: getfield u42.qz4 [Lerg;
      // 82: iload 1
      // 83: aaload
      // 84: iload 2
      // 85: invokevirtual erg.amj (I)Lerg;
      // 88: astore 4
      // 8a: aload 0
      // 8b: getfield u42.qz4 [Lerg;
      // 8e: iload 1
      // 8f: aaload
      // 90: getfield erg.qd2 I
      // 93: iload 3
      // 94: ifeq bf
      // 97: ifne af
      // 9a: goto a1
      // 9d: invokestatic u42.a (Loov;)Loov;
      // a0: athrow
      // a1: aload 0
      // a2: getfield u42.qz4 [Lerg;
      // a5: iload 1
      // a6: aconst_null
      // a7: aastore
      // a8: goto af
      // ab: invokestatic u42.a (Loov;)Loov;
      // ae: athrow
      // af: aload 0
      // b0: iload 3
      // b1: ifeq c3
      // b4: iload 1
      // b5: invokespecial u42.w4d (I)Z
      // b8: goto bf
      // bb: invokestatic u42.a (Loov;)Loov;
      // be: athrow
      // bf: ifeq c6
      // c2: aload 0
      // c3: invokevirtual u42.jcn ()V
      // c6: aload 4
      // c8: areturn
      // c9: aconst_null
      // ca: areturn
   }

   private boolean w4d(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 32
      // 09: ifeq 2a
      // 0c: goto 13
      // 0f: invokestatic u42.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 1
      // 14: iload 2
      // 15: ifeq 32
      // 18: goto 1f
      // 1b: invokestatic u42.a (Loov;)Loov;
      // 1e: athrow
      // 1f: bipush 1
      // 20: if_icmpne 35
      // 23: goto 2a
      // 26: invokestatic u42.a (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 32
      // 2e: invokestatic u42.a (Loov;)Loov;
      // 31: athrow
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield u42.qz4 [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: iload 2
      // 0b: ifeq 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic u42.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield u42.qz4 [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic u42.a (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield u42.qz4 [Lerg;
      // 2a: iload 1
      // 2b: aconst_null
      // 2c: aastore
      // 2d: aload 3
      // 2e: areturn
      // 2f: aconst_null
      // 30: areturn
   }

   @Override
   public void cxl(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 47
      // 09: getfield u42.qz4 [Lerg;
      // 0c: iload 1
      // 0d: aload 2
      // 0e: aastore
      // 0f: aload 2
      // 10: ifnull 46
      // 13: goto 1a
      // 16: invokestatic u42.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: getfield erg.qd2 I
      // 1e: iload 3
      // 1f: ifeq 56
      // 22: goto 29
      // 25: invokestatic u42.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: invokevirtual u42.v6l ()I
      // 2d: if_icmple 46
      // 30: goto 37
      // 33: invokestatic u42.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 2
      // 38: aload 0
      // 39: invokevirtual u42.v6l ()I
      // 3c: putfield erg.qd2 I
      // 3f: goto 46
      // 42: invokestatic u42.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: iload 3
      // 48: ifeq 5a
      // 4b: iload 1
      // 4c: invokespecial u42.w4d (I)Z
      // 4f: goto 56
      // 52: invokestatic u42.a (Loov;)Loov;
      // 55: athrow
      // 56: ifeq 5d
      // 59: aload 0
      // 5a: invokevirtual u42.jcn ()V
      // 5d: return
   }

   @Override
   public String noc() {
      long var1 = a ^ 27772445342652L;
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
   public int v6l() {
      return 64;
   }

   @Override
   public boolean dnv(ha9 var1) {
      try {
         if (this.c99.rbk() == var1) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
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
   public void r5t() {
      this.jcn();
   }

   public void jcn() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aconst_null
      // 002: putfield u42.edc Lxxb;
      // 005: aload 0
      // 006: getfield u42.qz4 [Lerg;
      // 009: bipush 0
      // 00a: aaload
      // 00b: astore 2
      // 00c: invokestatic OpaquePredicate.b ()I
      // 00f: aload 0
      // 010: getfield u42.qz4 [Lerg;
      // 013: bipush 1
      // 014: aaload
      // 015: astore 3
      // 016: istore 1
      // 017: aload 2
      // 018: iload 1
      // 019: ifeq 02b
      // 01c: ifnonnull 02a
      // 01f: goto 026
      // 022: invokestatic u42.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 3
      // 027: astore 2
      // 028: aconst_null
      // 029: astore 3
      // 02a: aload 2
      // 02b: ifnonnull 042
      // 02e: aload 0
      // 02f: bipush 2
      // 030: aconst_null
      // 031: checkcast erg
      // 034: invokevirtual u42.cxl (ILerg;)V
      // 037: iload 1
      // 038: ifne 11d
      // 03b: goto 042
      // 03e: invokestatic u42.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: getfield u42.c99 La7q;
      // 046: aload 0
      // 047: getfield u42.r4k Lha9;
      // 04a: invokeinterface a7q.zyi (Lha9;)Lskn; 2
      // 04f: astore 4
      // 051: iload 1
      // 052: ifeq 12b
      // 055: aload 4
      // 057: ifnull 11d
      // 05a: goto 061
      // 05d: invokestatic u42.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 4
      // 063: aload 2
      // 064: aload 3
      // 065: aload 0
      // 066: getfield u42.giz I
      // 069: invokevirtual skn.gvw (Lerg;Lerg;I)Lxxb;
      // 06c: astore 5
      // 06e: aload 5
      // 070: iload 1
      // 071: ifeq 080
      // 074: ifnull 0a4
      // 077: goto 07e
      // 07a: invokestatic u42.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 5
      // 080: invokevirtual xxb.f_e ()Z
      // 083: ifne 0a4
      // 086: aload 0
      // 087: aload 5
      // 089: putfield u42.edc Lxxb;
      // 08c: aload 0
      // 08d: bipush 2
      // 08e: aload 5
      // 090: invokevirtual xxb.fjy ()Lerg;
      // 093: invokevirtual erg.yaq ()Lerg;
      // 096: invokevirtual u42.cxl (ILerg;)V
      // 099: iload 1
      // 09a: ifne 11d
      // 09d: goto 0a4
      // 0a0: invokestatic u42.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 3
      // 0a5: ifnull 10d
      // 0a8: goto 0af
      // 0ab: invokestatic u42.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 4
      // 0b1: aload 3
      // 0b2: aload 2
      // 0b3: aload 0
      // 0b4: getfield u42.giz I
      // 0b7: invokevirtual skn.gvw (Lerg;Lerg;I)Lxxb;
      // 0ba: astore 5
      // 0bc: iload 1
      // 0bd: ifeq 109
      // 0c0: aload 5
      // 0c2: ifnull 0f9
      // 0c5: goto 0cc
      // 0c8: invokestatic u42.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 5
      // 0ce: invokevirtual xxb.f_e ()Z
      // 0d1: ifne 0f9
      // 0d4: goto 0db
      // 0d7: invokestatic u42.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: aload 5
      // 0de: putfield u42.edc Lxxb;
      // 0e1: aload 0
      // 0e2: bipush 2
      // 0e3: aload 5
      // 0e5: invokevirtual xxb.fjy ()Lerg;
      // 0e8: invokevirtual erg.yaq ()Lerg;
      // 0eb: invokevirtual u42.cxl (ILerg;)V
      // 0ee: iload 1
      // 0ef: ifne 11d
      // 0f2: goto 0f9
      // 0f5: invokestatic u42.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: bipush 2
      // 0fb: aconst_null
      // 0fc: checkcast erg
      // 0ff: invokevirtual u42.cxl (ILerg;)V
      // 102: goto 109
      // 105: invokestatic u42.a (Loov;)Loov;
      // 108: athrow
      // 109: iload 1
      // 10a: ifne 11d
      // 10d: aload 0
      // 10e: bipush 2
      // 10f: aconst_null
      // 110: checkcast erg
      // 113: invokevirtual u42.cxl (ILerg;)V
      // 116: goto 11d
      // 119: invokestatic u42.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield u42.c99 La7q;
      // 121: aload 0
      // 122: bipush 2
      // 123: invokevirtual u42.ibn (I)Lerg;
      // 126: invokeinterface a7q.uuf (Lerg;)V 2
      // 12b: return
   }

   public xxb ces() {
      return this.edc;
   }

   public void oec(int var1) {
      this.giz = var1;
      this.jcn();
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
      int var1 = OpaquePredicate.b();
      int var2 = 0;

      while (var2 < this.qz4.length) {
         this.qz4[var2] = null;
         var2++;
         if (var1 == 0) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5182614466607143L, 1630553811222502073L, MethodHandles.lookup().lookupClass()).a(12088644431216L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 61749092387205L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("²60YépI¾u?¶×¶IÑj".getBytes("ISO-8859-1"));
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
