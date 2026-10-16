import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cqp {
   private static final long a;
   private static final String b;

   public mux h4k(mux param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic cqp.a J
      // 03: ldc2_w 125700092327446
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: getfield mux.cy6 I
      // 11: iload 4
      // 13: ifeq 40
      // 16: iflt 30
      // 19: goto 20
      // 1c: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f: athrow
      // 20: new java/lang/IllegalStateException
      // 23: dup
      // 24: getstatic cqp.b Ljava/lang/String;
      // 27: nop
      // 28: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 2b: athrow
      // 2c: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2f: athrow
      // 30: aload 0
      // 31: iload 4
      // 33: ifeq 7b
      // 36: getfield cqp.b92 I
      // 39: goto 40
      // 3c: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield cqp.s2r [Lmux;
      // 44: arraylength
      // 45: if_icmpne 68
      // 48: aload 0
      // 49: getfield cqp.b92 I
      // 4c: bipush 1
      // 4d: ishl
      // 4e: anewarray 19
      // 51: astore 5
      // 53: aload 0
      // 54: getfield cqp.s2r [Lmux;
      // 57: bipush 0
      // 58: aload 5
      // 5a: bipush 0
      // 5b: aload 0
      // 5c: getfield cqp.b92 I
      // 5f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 62: aload 0
      // 63: aload 5
      // 65: putfield cqp.s2r [Lmux;
      // 68: aload 0
      // 69: getfield cqp.s2r [Lmux;
      // 6c: aload 0
      // 6d: getfield cqp.b92 I
      // 70: aload 1
      // 71: aastore
      // 72: aload 1
      // 73: aload 0
      // 74: getfield cqp.b92 I
      // 77: putfield mux.cy6 I
      // 7a: aload 0
      // 7b: aload 0
      // 7c: dup
      // 7d: getfield cqp.b92 I
      // 80: dup_x1
      // 81: bipush 1
      // 82: iadd
      // 83: putfield cqp.b92 I
      // 86: invokespecial cqp.s1z (I)V
      // 89: aload 1
      // 8a: areturn
   }

   public void md6() {
      this.b92 = 0;
   }

   public mux qgk() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield cqp.s2r [Lmux;
      // 04: bipush 0
      // 05: aaload
      // 06: astore 2
      // 07: invokestatic t9d.b ()I
      // 0a: aload 0
      // 0b: getfield cqp.s2r [Lmux;
      // 0e: bipush 0
      // 0f: aload 0
      // 10: getfield cqp.s2r [Lmux;
      // 13: aload 0
      // 14: dup
      // 15: getfield cqp.b92 I
      // 18: bipush 1
      // 19: isub
      // 1a: dup_x1
      // 1b: putfield cqp.b92 I
      // 1e: aaload
      // 1f: aastore
      // 20: istore 1
      // 21: aload 0
      // 22: getfield cqp.s2r [Lmux;
      // 25: aload 0
      // 26: getfield cqp.b92 I
      // 29: aconst_null
      // 2a: aastore
      // 2b: iload 1
      // 2c: ifeq 4e
      // 2f: aload 0
      // 30: getfield cqp.b92 I
      // 33: ifle 49
      // 36: goto 3d
      // 39: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 0
      // 3f: invokespecial cqp.me6 (I)V
      // 42: goto 49
      // 45: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 48: athrow
      // 49: aload 2
      // 4a: bipush -1
      // 4b: putfield mux.cy6 I
      // 4e: aload 2
      // 4f: areturn
   }

   public void ukf(mux param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: getfield mux.ujv F
      // 08: fstore 4
      // 0a: aload 1
      // 0b: fload 2
      // 0c: putfield mux.ujv F
      // 0f: iload 3
      // 10: ifne 30
      // 13: fload 2
      // 14: fload 4
      // 16: fcmpg
      // 17: ifge 34
      // 1a: goto 21
      // 1d: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20: athrow
      // 21: aload 0
      // 22: aload 1
      // 23: getfield mux.cy6 I
      // 26: invokespecial cqp.s1z (I)V
      // 29: goto 30
      // 2c: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2f: athrow
      // 30: iload 3
      // 31: ifeq 43
      // 34: aload 0
      // 35: aload 1
      // 36: getfield mux.cy6 I
      // 39: invokespecial cqp.me6 (I)V
      // 3c: goto 43
      // 3f: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 42: athrow
      // 43: return
   }

   private void s1z(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield cqp.s2r [Lmux;
      // 04: iload 1
      // 05: aaload
      // 06: astore 3
      // 07: invokestatic t9d.c ()I
      // 0a: aload 3
      // 0b: getfield mux.ujv F
      // 0e: fstore 5
      // 10: istore 2
      // 11: iload 1
      // 12: ifle 5e
      // 15: iload 1
      // 16: bipush 1
      // 17: isub
      // 18: bipush 1
      // 19: ishr
      // 1a: istore 4
      // 1c: aload 0
      // 1d: getfield cqp.s2r [Lmux;
      // 20: iload 4
      // 22: aaload
      // 23: astore 6
      // 25: iload 2
      // 26: ifne 6a
      // 29: fload 5
      // 2b: aload 6
      // 2d: getfield mux.ujv F
      // 30: fcmpl
      // 31: iload 2
      // 32: ifne 59
      // 35: goto 3c
      // 38: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: iflt 49
      // 3f: goto 46
      // 42: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 45: athrow
      // 46: goto 5e
      // 49: aload 0
      // 4a: getfield cqp.s2r [Lmux;
      // 4d: iload 1
      // 4e: aload 6
      // 50: aastore
      // 51: aload 6
      // 53: iload 1
      // 54: putfield mux.cy6 I
      // 57: iload 4
      // 59: istore 1
      // 5a: iload 2
      // 5b: ifeq 11
      // 5e: aload 0
      // 5f: getfield cqp.s2r [Lmux;
      // 62: iload 1
      // 63: aload 3
      // 64: aastore
      // 65: aload 3
      // 66: iload 1
      // 67: putfield mux.cy6 I
      // 6a: return
   }

   private void me6(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield cqp.s2r [Lmux;
      // 04: iload 1
      // 05: aaload
      // 06: astore 3
      // 07: invokestatic t9d.b ()I
      // 0a: aload 3
      // 0b: getfield mux.ujv F
      // 0e: fstore 4
      // 10: istore 2
      // 11: bipush 1
      // 12: iload 1
      // 13: bipush 1
      // 14: ishl
      // 15: iadd
      // 16: istore 5
      // 18: iload 5
      // 1a: bipush 1
      // 1b: iadd
      // 1c: istore 6
      // 1e: iload 5
      // 20: aload 0
      // 21: getfield cqp.b92 I
      // 24: if_icmplt 2a
      // 27: goto d6
      // 2a: aload 0
      // 2b: getfield cqp.s2r [Lmux;
      // 2e: iload 5
      // 30: aaload
      // 31: astore 7
      // 33: aload 7
      // 35: getfield mux.ujv F
      // 38: fstore 8
      // 3a: iload 6
      // 3c: aload 0
      // 3d: getfield cqp.b92 I
      // 40: if_icmplt 4f
      // 43: aconst_null
      // 44: astore 9
      // 46: ldc Infinity
      // 48: nop
      // 49: fstore 10
      // 4b: iload 2
      // 4c: ifne 5f
      // 4f: aload 0
      // 50: getfield cqp.s2r [Lmux;
      // 53: iload 6
      // 55: aaload
      // 56: astore 9
      // 58: aload 9
      // 5a: getfield mux.ujv F
      // 5d: fstore 10
      // 5f: fload 8
      // 61: fload 10
      // 63: fcmpg
      // 64: iload 2
      // 65: ifeq b0
      // 68: ifge a4
      // 6b: goto 72
      // 6e: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 71: athrow
      // 72: fload 8
      // 74: fload 4
      // 76: fcmpl
      // 77: iload 2
      // 78: ifeq 9f
      // 7b: goto 82
      // 7e: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 81: athrow
      // 82: iflt 8f
      // 85: goto 8c
      // 88: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8b: athrow
      // 8c: goto d6
      // 8f: aload 0
      // 90: getfield cqp.s2r [Lmux;
      // 93: iload 1
      // 94: aload 7
      // 96: aastore
      // 97: aload 7
      // 99: iload 1
      // 9a: putfield mux.cy6 I
      // 9d: iload 5
      // 9f: istore 1
      // a0: iload 2
      // a1: ifne d2
      // a4: fload 10
      // a6: fload 4
      // a8: fcmpl
      // a9: goto b0
      // ac: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // af: athrow
      // b0: iload 2
      // b1: ifeq d1
      // b4: iflt c1
      // b7: goto be
      // ba: invokestatic cqp.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // bd: athrow
      // be: goto d6
      // c1: aload 0
      // c2: getfield cqp.s2r [Lmux;
      // c5: iload 1
      // c6: aload 9
      // c8: aastore
      // c9: aload 9
      // cb: iload 1
      // cc: putfield mux.cy6 I
      // cf: iload 6
      // d1: istore 1
      // d2: iload 2
      // d3: ifne 11
      // d6: aload 0
      // d7: getfield cqp.s2r [Lmux;
      // da: iload 1
      // db: aload 3
      // dc: aastore
      // dd: aload 3
      // de: iload 1
      // df: putfield mux.cy6 I
      // e2: return
   }

   public boolean a1s() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return (boolean)this.b92;
         }

         if (this.b92 == 0) {
            return (boolean)1;
         }
      } catch (IllegalStateException var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6346184569594041919L, -3336901885156153465L, MethodHandles.lookup().lookupClass()).a(200112230599821L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 113195691441784L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("7\u001fbK\u0013Z÷LdªMG½\u008f¢\u0003".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static IllegalStateException a(IllegalStateException var0) {
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
