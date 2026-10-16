import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tn9 extends l68 {
   private static final long b;
   private static final String d;

   public tn9(yqv var1) {
      super(var1);
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic tn9.b J
      // 03: ldc2_w 111849565165037
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokespecial l68.vle ()Z
      // 10: iload 3
      // 11: ifne 40
      // 14: ifne 24
      // 17: goto 1e
      // 1a: invokestatic tn9.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic tn9.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: iload 3
      // 26: ifne 4a
      // 29: getfield tn9.r2g Lyqv;
      // 2c: getfield yqv.oay Lt9d;
      // 2f: invokevirtual OpaquePredicate.eir ()Lef9;
      // 32: getstatic tn9.d Ljava/lang/String;
      // 35: nop
      // 36: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 39: goto 40
      // 3c: invokestatic tn9.a (Loov;)Loov;
      // 3f: athrow
      // 40: ifne 49
      // 43: bipush 0
      // 44: ireturn
      // 45: invokestatic tn9.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield tn9.xiw Lw4e;
      // 4d: astore 4
      // 4f: aload 0
      // 50: getfield tn9.r2g Lyqv;
      // 53: getfield yqv.oay Lt9d;
      // 56: aload 0
      // 57: getfield tn9.yz3 Lmew;
      // 5a: invokestatic w4e.rg9 (Lm5n;Lmew;)Z
      // 5d: iload 3
      // 5e: ifne 6c
      // 61: ifne 6f
      // 64: goto 6b
      // 67: invokestatic tn9.a (Loov;)Loov;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 70
      // 6f: bipush 0
      // 70: ireturn
   }

   @Override
   public void mnp() {
      super.mnp();
      this.r_y = 0;
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield tn9.r2g Lyqv;
      // 08: aload 0
      // 09: getfield tn9.yz3 Lmew;
      // 0c: invokevirtual yqv.csm (Lmew;)D
      // 0f: dstore 2
      // 10: aload 0
      // 11: getfield tn9.r_y I
      // 14: iload 1
      // 15: ifne 68
      // 18: sipush 240
      // 1b: if_icmpgt 67
      // 1e: goto 25
      // 21: invokestatic tn9.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield tn9.xiw Lw4e;
      // 29: astore 5
      // 2b: aload 0
      // 2c: getfield tn9.r2g Lyqv;
      // 2f: getfield yqv.oay Lt9d;
      // 32: aload 0
      // 33: getfield tn9.yz3 Lmew;
      // 36: invokestatic w4e.rg9 (Lm5n;Lmew;)Z
      // 39: iload 1
      // 3a: ifne 68
      // 3d: ifne 67
      // 40: goto 47
      // 43: invokestatic tn9.a (Loov;)Loov;
      // 46: athrow
      // 47: dload 2
      // 48: ldc2_w 4.0
      // 4b: dcmpg
      // 4c: iload 1
      // 4d: ifne 68
      // 50: goto 57
      // 53: invokestatic tn9.a (Loov;)Loov;
      // 56: athrow
      // 57: ifge 67
      // 5a: goto 61
      // 5d: invokestatic tn9.a (Loov;)Loov;
      // 60: athrow
      // 61: bipush 1
      // 62: istore 4
      // 64: iload 4
      // 66: ireturn
      // 67: bipush 0
      // 68: istore 4
      // 6a: iload 4
      // 6c: ireturn
   }

   @Override
   public void zly() {
      super.zly();
      this.r2g.oay.vn_(this.r2g.jwu(), this.yz3, -1);
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial l68.iad ()V
      // 08: aload 0
      // 09: getfield tn9.r2g Lyqv;
      // 0c: invokevirtual yqv.mbr ()Ljava/util/Random;
      // 0f: bipush 20
      // 11: invokevirtual java/util/Random.nextInt (I)I
      // 14: iload 1
      // 15: ifeq 53
      // 18: ifne 3b
      // 1b: goto 22
      // 1e: invokestatic tn9.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield tn9.r2g Lyqv;
      // 26: getfield yqv.oay Lt9d;
      // 29: sipush 1010
      // 2c: aload 0
      // 2d: getfield tn9.yz3 Lmew;
      // 30: bipush 0
      // 31: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // 34: goto 3b
      // 37: invokestatic tn9.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: dup
      // 3d: getfield tn9.r_y I
      // 40: bipush 1
      // 41: iadd
      // 42: putfield tn9.r_y I
      // 45: aload 0
      // 46: getfield tn9.r_y I
      // 49: i2f
      // 4a: ldc 240.0
      // 4c: nop
      // 4d: fdiv
      // 4e: ldc 10.0
      // 50: nop
      // 51: fmul
      // 52: f2i
      // 53: istore 2
      // 54: iload 2
      // 55: aload 0
      // 56: getfield tn9.mex I
      // 59: iload 1
      // 5a: ifeq 9b
      // 5d: if_icmpeq 89
      // 60: goto 67
      // 63: invokestatic tn9.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 0
      // 68: getfield tn9.r2g Lyqv;
      // 6b: getfield yqv.oay Lt9d;
      // 6e: aload 0
      // 6f: getfield tn9.r2g Lyqv;
      // 72: invokevirtual yqv.jwu ()I
      // 75: aload 0
      // 76: getfield tn9.yz3 Lmew;
      // 79: iload 2
      // 7a: invokevirtual OpaquePredicate.vn_ (ILmew;I)V
      // 7d: aload 0
      // 7e: iload 2
      // 7f: putfield tn9.mex I
      // 82: goto 89
      // 85: invokestatic tn9.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 0
      // 8a: iload 1
      // 8b: ifeq 9f
      // 8e: getfield tn9.r_y I
      // 91: sipush 240
      // 94: goto 9b
      // 97: invokestatic tn9.a (Loov;)Loov;
      // 9a: athrow
      // 9b: if_icmpne f9
      // 9e: aload 0
      // 9f: getfield tn9.r2g Lyqv;
      // a2: getfield yqv.oay Lt9d;
      // a5: iload 1
      // a6: ifeq e8
      // a9: invokevirtual OpaquePredicate.rbk ()Lv66;
      // ac: getstatic v66.csg Lv66;
      // af: if_acmpne f9
      // b2: goto b9
      // b5: invokestatic tn9.a (Loov;)Loov;
      // b8: athrow
      // b9: aload 0
      // ba: getfield tn9.r2g Lyqv;
      // bd: getfield yqv.oay Lt9d;
      // c0: aload 0
      // c1: getfield tn9.yz3 Lmew;
      // c4: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // c7: pop
      // c8: aload 0
      // c9: getfield tn9.r2g Lyqv;
      // cc: getfield yqv.oay Lt9d;
      // cf: sipush 1012
      // d2: aload 0
      // d3: getfield tn9.yz3 Lmew;
      // d6: bipush 0
      // d7: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // da: aload 0
      // db: getfield tn9.r2g Lyqv;
      // de: getfield yqv.oay Lt9d;
      // e1: goto e8
      // e4: invokestatic tn9.a (Loov;)Loov;
      // e7: athrow
      // e8: sipush 2001
      // eb: aload 0
      // ec: getfield tn9.yz3 Lmew;
      // ef: aload 0
      // f0: getfield tn9.xiw Lw4e;
      // f3: invokestatic e0x.mxb (Le0x;)I
      // f6: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // f9: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3164738783259738273L, -706854335418952183L, MethodHandles.lookup().lookupClass()).a(173514574891682L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 77099878347326L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u001b\u0092\u001ea>TÀÎ*òch\u0012l\u0011ä".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      d = var6;
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
