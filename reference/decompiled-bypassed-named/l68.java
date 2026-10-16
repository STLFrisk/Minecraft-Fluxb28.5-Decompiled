import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class l68 extends cjm {
   public yqv r2g;
   public mew yz3;
   public w4e xiw;
   public boolean esv;
   public float pta;
   public float q3x;
   private static final long a;
   private static final String c;

   public l68(yqv var1) {
      long var2 = a ^ 139935013222860L;
      super();
      this.yz3 = mew._9b;
      this.r2g = var1;
      if (!(var1.zq2() instanceof zvv)) {
         throw new IllegalArgumentException(c);
      }
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield l68.r2g Lyqv;
      // 008: iload 1
      // 009: ifeq 023
      // 00c: getfield yqv.cbi Z
      // 00f: ifne 01f
      // 012: goto 019
      // 015: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 018: athrow
      // 019: bipush 0
      // 01a: ireturn
      // 01b: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield l68.r2g Lyqv;
      // 023: invokevirtual yqv.zq2 ()Lp8a;
      // 026: checkcast zvv
      // 029: astore 2
      // 02a: aload 2
      // 02b: invokevirtual zvv.v_4 ()Lt_2;
      // 02e: astore 3
      // 02f: aload 3
      // 030: iload 1
      // 031: ifeq 03f
      // 034: ifnull 13e
      // 037: goto 03e
      // 03a: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03d: athrow
      // 03e: aload 3
      // 03f: invokevirtual t_2.gdm ()Z
      // 042: iload 1
      // 043: ifeq 13f
      // 046: ifne 13e
      // 049: goto 050
      // 04c: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04f: athrow
      // 050: aload 2
      // 051: invokevirtual zvv.cuu ()Z
      // 054: iload 1
      // 055: ifeq 13f
      // 058: goto 05f
      // 05b: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: ifeq 13e
      // 062: goto 069
      // 065: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 068: athrow
      // 069: bipush 0
      // 06a: istore 4
      // 06c: iload 4
      // 06e: aload 3
      // 06f: invokevirtual t_2.x03 ()I
      // 072: bipush 2
      // 073: iadd
      // 074: aload 3
      // 075: invokevirtual t_2.ov7 ()I
      // 078: invokestatic java/lang/Math.min (II)I
      // 07b: if_icmpge 10f
      // 07e: aload 3
      // 07f: iload 4
      // 081: invokevirtual t_2.q6_ (I)Lmux;
      // 084: astore 5
      // 086: aload 0
      // 087: new mew
      // 08a: dup
      // 08b: aload 5
      // 08d: getfield mux.ksp I
      // 090: aload 5
      // 092: getfield mux.ztw I
      // 095: bipush 1
      // 096: iadd
      // 097: aload 5
      // 099: getfield mux.gf3 I
      // 09c: invokespecial mew.<init> (III)V
      // 09f: putfield l68.yz3 Lmew;
      // 0a2: iload 1
      // 0a3: ifeq 10b
      // 0a6: aload 0
      // 0a7: getfield l68.r2g Lyqv;
      // 0aa: aload 0
      // 0ab: getfield l68.yz3 Lmew;
      // 0ae: invokevirtual mew.getX ()I
      // 0b1: i2d
      // 0b2: aload 0
      // 0b3: getfield l68.r2g Lyqv;
      // 0b6: getfield yqv.kfp D
      // 0b9: aload 0
      // 0ba: getfield l68.yz3 Lmew;
      // 0bd: invokevirtual mew.getZ ()I
      // 0c0: i2d
      // 0c1: invokevirtual yqv.p53 (DDD)D
      // 0c4: ldc2_w 2.25
      // 0c7: dcmpg
      // 0c8: iload 1
      // 0c9: ifeq 13d
      // 0cc: goto 0d3
      // 0cf: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d2: athrow
      // 0d3: ifgt 108
      // 0d6: goto 0dd
      // 0d9: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: aload 0
      // 0df: aload 0
      // 0e0: getfield l68.yz3 Lmew;
      // 0e3: invokespecial l68.lpl (Lmew;)Lw4e;
      // 0e6: putfield l68.xiw Lw4e;
      // 0e9: iload 1
      // 0ea: ifeq 10b
      // 0ed: goto 0f4
      // 0f0: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: getfield l68.xiw Lw4e;
      // 0f8: ifnull 108
      // 0fb: goto 102
      // 0fe: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 101: athrow
      // 102: bipush 1
      // 103: ireturn
      // 104: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 107: athrow
      // 108: iinc 4 1
      // 10b: iload 1
      // 10c: ifne 06c
      // 10f: aload 0
      // 110: new mew
      // 113: dup
      // 114: aload 0
      // 115: getfield l68.r2g Lyqv;
      // 118: invokespecial mew.<init> (Li2h;)V
      // 11b: invokevirtual mew.nuv ()Lmew;
      // 11e: putfield l68.yz3 Lmew;
      // 121: aload 0
      // 122: aload 0
      // 123: aload 0
      // 124: getfield l68.yz3 Lmew;
      // 127: invokespecial l68.lpl (Lmew;)Lw4e;
      // 12a: putfield l68.xiw Lw4e;
      // 12d: aload 0
      // 12e: getfield l68.xiw Lw4e;
      // 131: ifnull 13c
      // 134: bipush 1
      // 135: goto 13d
      // 138: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13b: athrow
      // 13c: bipush 0
      // 13d: ireturn
      // 13e: bipush 0
      // 13f: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = OpaquePredicate.c();

      try {
         if (var1 != 0) {
            return this.esv;
         }

         if (!this.esv) {
            return true;
         }
      } catch (IllegalArgumentException var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void mnp() {
      this.esv = false;
      this.pta = (float)((double)((float)this.yz3.getX() + 0.5F) - this.r2g.o2v);
      this.q3x = (float)((double)((float)this.yz3.getZ() + 0.5F) - this.r2g.vbd);
   }

   @Override
   public void iad() {
      float var1 = (float)((double)((float)this.yz3.getX() + 0.5F) - this.r2g.o2v);
      float var2 = (float)((double)((float)this.yz3.getZ() + 0.5F) - this.r2g.vbd);
      float var3 = this.pta * var1 + this.q3x * var2;

      try {
         if (var3 < 0.0F) {
            this.esv = true;
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }
   }

   private w4e lpl(mew param1) {
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
      // 05: getfield l68.r2g Lyqv;
      // 08: getfield yqv.oay Lt9d;
      // 0b: aload 1
      // 0c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0f: invokeinterface zfz.r_y ()Le0x; 1
      // 14: astore 3
      // 15: aload 3
      // 16: iload 2
      // 17: ifeq 2f
      // 1a: instanceof w4e
      // 1d: ifeq 51
      // 20: goto 27
      // 23: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26: athrow
      // 27: aload 3
      // 28: goto 2f
      // 2b: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e: athrow
      // 2f: iload 2
      // 30: ifeq 4b
      // 33: invokevirtual e0x.p1r ()Lp3y;
      // 36: getstatic p3y.fdu Lp3y;
      // 39: if_acmpne 51
      // 3c: goto 43
      // 3f: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 3
      // 44: goto 4b
      // 47: invokestatic l68.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: checkcast w4e
      // 4e: goto 52
      // 51: aconst_null
      // 52: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2274315021275061034L, -7580442896199764172L, MethodHandles.lookup().lookupClass()).a(128005878607543L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 117244035431580L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\u0004Gä\u00138²Ñ\u0015`\u0083\u0000\u0096hª\u009b\u0092Î\u0085\u0003\u0018w<}\u0099½õ4\u0001Õ\u0011¨È\u0081åo]£Ôß _Æ\u0007\u0094a\u0003\u009fF"
            .getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      c = var6;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
