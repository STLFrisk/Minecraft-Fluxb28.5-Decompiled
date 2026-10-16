import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b6f extends cjm {
   public t9d owp;
   public float yf2;
   public float cw5;
   private static final long a;
   private static final String b;

   public b6f(k9a var1, double var2, float var4, float var5) {
      long var6 = a ^ 24080447095051L;
      super();
      this.t6g = var1;
      this.owp = var1.oay;
      this.uy1 = var2;
      this.wp6 = var1.zq2();
      this.cw5 = var4;
      this.yf2 = var5;
      this.k23(3);
      if (!(var1.zq2() instanceof zvv)) {
         throw new IllegalArgumentException(b);
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield b6f.t6g Lk9a;
      // 08: invokevirtual k9a.ifk ()Lg_3;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifeq 22
      // 11: ifnonnull 21
      // 14: goto 1b
      // 17: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: aload 2
      // 22: instanceof ha9
      // 25: iload 1
      // 26: ifeq 5c
      // 29: ifeq 55
      // 2c: goto 33
      // 2f: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: aload 2
      // 34: checkcast ha9
      // 37: invokevirtual ha9.myu ()Z
      // 3a: iload 1
      // 3b: ifeq 5c
      // 3e: goto 45
      // 41: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: ifeq 55
      // 48: goto 4f
      // 4b: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: bipush 0
      // 50: ireturn
      // 51: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: aload 0
      // 56: getfield b6f.t6g Lk9a;
      // 59: invokevirtual k9a.ird ()Z
      // 5c: iload 1
      // 5d: ifeq 83
      // 60: ifeq 70
      // 63: goto 6a
      // 66: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 69: athrow
      // 6a: bipush 0
      // 6b: ireturn
      // 6c: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield b6f.t6g Lk9a;
      // 74: aload 2
      // 75: invokevirtual k9a.wxg (Li2h;)D
      // 78: aload 0
      // 79: getfield b6f.cw5 F
      // 7c: aload 0
      // 7d: getfield b6f.cw5 F
      // 80: fmul
      // 81: f2d
      // 82: dcmpg
      // 83: iload 1
      // 84: ifeq 9d
      // 87: ifge 97
      // 8a: goto 91
      // 8d: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 90: athrow
      // 91: bipush 0
      // 92: ireturn
      // 93: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 96: athrow
      // 97: aload 0
      // 98: aload 2
      // 99: putfield b6f.md8 Lg_3;
      // 9c: bipush 1
      // 9d: ireturn
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield b6f.wp6 Lp8a;
      // 08: invokevirtual p8a.j07 ()Z
      // 0b: iload 1
      // 0c: ifeq 36
      // 0f: ifne 64
      // 12: goto 19
      // 15: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield b6f.t6g Lk9a;
      // 1d: aload 0
      // 1e: getfield b6f.md8 Lg_3;
      // 21: invokevirtual k9a.wxg (Li2h;)D
      // 24: aload 0
      // 25: getfield b6f.yf2 F
      // 28: aload 0
      // 29: getfield b6f.yf2 F
      // 2c: fmul
      // 2d: f2d
      // 2e: dcmpl
      // 2f: goto 36
      // 32: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35: athrow
      // 36: iload 1
      // 37: ifeq 52
      // 3a: ifle 64
      // 3d: goto 44
      // 40: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield b6f.t6g Lk9a;
      // 48: invokevirtual k9a.ird ()Z
      // 4b: goto 52
      // 4e: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51: athrow
      // 52: iload 1
      // 53: ifeq 61
      // 56: ifne 64
      // 59: goto 60
      // 5c: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 65
      // 64: bipush 0
      // 65: ireturn
   }

   @Override
   public void mnp() {
      this.z7a = 0;
      this.r_8 = ((zvv)this.t6g.zq2()).cb4();
      ((zvv)this.t6g.zq2()).uuq(false);
   }

   @Override
   public void zly() {
      this.md8 = null;
      this.wp6.pj2();
      ((zvv)this.t6g.zq2()).uuq(true);
   }

   private boolean s8e(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield b6f.owp Lt9d;
      // 04: aload 1
      // 05: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 08: astore 3
      // 09: invokestatic t9d.c ()I
      // 0c: aload 3
      // 0d: invokeinterface zfz.r_y ()Le0x; 1
      // 12: astore 4
      // 14: istore 2
      // 15: aload 4
      // 17: iload 2
      // 18: ifne 32
      // 1b: getstatic ox_.ibw Le0x;
      // 1e: if_acmpne 30
      // 21: goto 28
      // 24: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27: athrow
      // 28: bipush 1
      // 29: goto 48
      // 2c: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f: athrow
      // 30: aload 4
      // 32: invokevirtual e0x.gck ()Z
      // 35: iload 2
      // 36: ifne 44
      // 39: ifne 47
      // 3c: goto 43
      // 3f: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: bipush 0
      // 48: ireturn
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield b6f.t6g Lk9a;
      // 008: invokevirtual k9a.ph8 ()Lknw;
      // 00b: aload 0
      // 00c: getfield b6f.md8 Lg_3;
      // 00f: ldc 10.0
      // 011: nop
      // 012: aload 0
      // 013: getfield b6f.t6g Lk9a;
      // 016: invokevirtual k9a.d1r ()I
      // 019: i2f
      // 01a: invokevirtual knw.rz3 (Li2h;FF)V
      // 01d: aload 0
      // 01e: getfield b6f.t6g Lk9a;
      // 021: invokevirtual k9a.ird ()Z
      // 024: iload 1
      // 025: ifne 044
      // 028: ifne 229
      // 02b: goto 032
      // 02e: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 031: athrow
      // 032: aload 0
      // 033: dup
      // 034: getfield b6f.z7a I
      // 037: bipush 1
      // 038: isub
      // 039: dup_x1
      // 03a: putfield b6f.z7a I
      // 03d: goto 044
      // 040: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 043: athrow
      // 044: iload 1
      // 045: ifne 06e
      // 048: ifgt 229
      // 04b: goto 052
      // 04e: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 051: athrow
      // 052: aload 0
      // 053: bipush 10
      // 055: putfield b6f.z7a I
      // 058: aload 0
      // 059: getfield b6f.wp6 Lp8a;
      // 05c: aload 0
      // 05d: getfield b6f.md8 Lg_3;
      // 060: aload 0
      // 061: getfield b6f.uy1 D
      // 064: invokevirtual p8a.p6m (Li2h;D)Z
      // 067: goto 06e
      // 06a: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06d: athrow
      // 06e: iload 1
      // 06f: ifne 08a
      // 072: ifne 229
      // 075: goto 07c
      // 078: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield b6f.t6g Lk9a;
      // 080: invokevirtual k9a.hk3 ()Z
      // 083: goto 08a
      // 086: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 089: athrow
      // 08a: iload 1
      // 08b: ifne 0ae
      // 08e: ifne 229
      // 091: goto 098
      // 094: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 097: athrow
      // 098: aload 0
      // 099: getfield b6f.t6g Lk9a;
      // 09c: aload 0
      // 09d: getfield b6f.md8 Lg_3;
      // 0a0: invokevirtual k9a.wxg (Li2h;)D
      // 0a3: ldc2_w 144.0
      // 0a6: dcmpl
      // 0a7: goto 0ae
      // 0aa: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ad: athrow
      // 0ae: iload 1
      // 0af: ifne 0cf
      // 0b2: iflt 229
      // 0b5: goto 0bc
      // 0b8: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield b6f.md8 Lg_3;
      // 0c0: getfield g_3.o2v D
      // 0c3: invokestatic fe6.jqf (D)I
      // 0c6: bipush 2
      // 0c7: isub
      // 0c8: goto 0cf
      // 0cb: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ce: athrow
      // 0cf: istore 2
      // 0d0: aload 0
      // 0d1: getfield b6f.md8 Lg_3;
      // 0d4: getfield g_3.vbd D
      // 0d7: invokestatic fe6.jqf (D)I
      // 0da: bipush 2
      // 0db: isub
      // 0dc: istore 3
      // 0dd: aload 0
      // 0de: getfield b6f.md8 Lg_3;
      // 0e1: invokevirtual g_3.aaw ()Lnh4;
      // 0e4: getfield nh4.bx_ D
      // 0e7: invokestatic fe6.jqf (D)I
      // 0ea: istore 4
      // 0ec: bipush 0
      // 0ed: istore 5
      // 0ef: iload 5
      // 0f1: bipush 4
      // 0f2: if_icmpgt 229
      // 0f5: bipush 0
      // 0f6: istore 6
      // 0f8: iload 6
      // 0fa: bipush 4
      // 0fb: if_icmpgt 222
      // 0fe: iload 5
      // 100: iload 1
      // 101: ifne 17c
      // 104: bipush 1
      // 105: iload 1
      // 106: ifne 0f2
      // 109: goto 110
      // 10c: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10f: athrow
      // 110: if_icmplt 15b
      // 113: iload 6
      // 115: iload 1
      // 116: ifne 17c
      // 119: goto 120
      // 11c: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11f: athrow
      // 120: bipush 1
      // 121: if_icmplt 15b
      // 124: goto 12b
      // 127: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12a: athrow
      // 12b: iload 5
      // 12d: iload 1
      // 12e: ifne 17c
      // 131: goto 138
      // 134: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 137: athrow
      // 138: bipush 3
      // 139: if_icmpgt 15b
      // 13c: goto 143
      // 13f: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 142: athrow
      // 143: iload 6
      // 145: iload 1
      // 146: ifne 17c
      // 149: goto 150
      // 14c: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14f: athrow
      // 150: bipush 3
      // 151: if_icmple 21b
      // 154: goto 15b
      // 157: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15a: athrow
      // 15b: aload 0
      // 15c: getfield b6f.owp Lt9d;
      // 15f: new mew
      // 162: dup
      // 163: iload 2
      // 164: iload 5
      // 166: iadd
      // 167: iload 4
      // 169: bipush 1
      // 16a: isub
      // 16b: iload 3
      // 16c: iload 6
      // 16e: iadd
      // 16f: invokespecial mew.<init> (III)V
      // 172: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 175: goto 17c
      // 178: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17b: athrow
      // 17c: iload 1
      // 17d: ifne 1a6
      // 180: ifeq 21b
      // 183: goto 18a
      // 186: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 189: athrow
      // 18a: aload 0
      // 18b: new mew
      // 18e: dup
      // 18f: iload 2
      // 190: iload 5
      // 192: iadd
      // 193: iload 4
      // 195: iload 3
      // 196: iload 6
      // 198: iadd
      // 199: invokespecial mew.<init> (III)V
      // 19c: invokespecial b6f.s8e (Lmew;)Z
      // 19f: goto 1a6
      // 1a2: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a5: athrow
      // 1a6: iload 1
      // 1a7: ifne 1dd
      // 1aa: ifeq 21b
      // 1ad: goto 1b4
      // 1b0: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: iload 1
      // 1b6: ifne 214
      // 1b9: goto 1c0
      // 1bc: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1bf: athrow
      // 1c0: new mew
      // 1c3: dup
      // 1c4: iload 2
      // 1c5: iload 5
      // 1c7: iadd
      // 1c8: iload 4
      // 1ca: bipush 1
      // 1cb: iadd
      // 1cc: iload 3
      // 1cd: iload 6
      // 1cf: iadd
      // 1d0: invokespecial mew.<init> (III)V
      // 1d3: invokespecial b6f.s8e (Lmew;)Z
      // 1d6: goto 1dd
      // 1d9: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1dc: athrow
      // 1dd: ifeq 21b
      // 1e0: aload 0
      // 1e1: getfield b6f.t6g Lk9a;
      // 1e4: iload 2
      // 1e5: iload 5
      // 1e7: iadd
      // 1e8: i2f
      // 1e9: ldc 0.5
      // 1eb: nop
      // 1ec: fadd
      // 1ed: f2d
      // 1ee: iload 4
      // 1f0: i2d
      // 1f1: iload 3
      // 1f2: iload 6
      // 1f4: iadd
      // 1f5: i2f
      // 1f6: ldc 0.5
      // 1f8: nop
      // 1f9: fadd
      // 1fa: f2d
      // 1fb: aload 0
      // 1fc: getfield b6f.t6g Lk9a;
      // 1ff: getfield k9a.x5k F
      // 202: aload 0
      // 203: getfield b6f.t6g Lk9a;
      // 206: getfield k9a.y2i F
      // 209: invokevirtual k9a.x24 (DDDFF)V
      // 20c: aload 0
      // 20d: goto 214
      // 210: invokestatic b6f.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 213: athrow
      // 214: getfield b6f.wp6 Lp8a;
      // 217: invokevirtual p8a.pj2 ()V
      // 21a: return
      // 21b: iinc 6 1
      // 21e: iload 1
      // 21f: ifeq 0f8
      // 222: iinc 5 1
      // 225: iload 1
      // 226: ifeq 0ef
      // 229: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7194665209353165314L, 7817188170874638245L, MethodHandles.lookup().lookupClass()).a(153005746132201L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 83937177570984L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\u008b\u0005iÇÛÏL÷$®÷\u0019w1FÖ\u001d\u0012-,^o6\u0092\u001b¤ô0Æ³\u009f\u0011B\u001dño\u000b¼fs\u0013Ú×ÉwkGë".getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
