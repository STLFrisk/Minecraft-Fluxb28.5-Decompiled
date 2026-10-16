import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zvn extends cjm {
   private static final long a;
   private static final String b;

   public zvn(laq var1, double var2, boolean var4) {
      long var5 = a ^ 106707699712679L;
      super();
      this.grp = Lists.newArrayList();
      this.s5a = var1;
      this.g_3 = var2;
      this.nry = var4;
      this.k23(1);
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokespecial zvn.sgs ()V
      // 008: aload 0
      // 009: iload 1
      // 00a: ifeq 040
      // 00d: getfield zvn.nry Z
      // 010: ifeq 03f
      // 013: goto 01a
      // 016: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 019: athrow
      // 01a: aload 0
      // 01b: getfield zvn.s5a Llaq;
      // 01e: getfield laq.oay Lt9d;
      // 021: iload 1
      // 022: ifeq 046
      // 025: goto 02c
      // 028: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02b: athrow
      // 02c: invokevirtual t9d.m40 ()Z
      // 02f: ifeq 03f
      // 032: goto 039
      // 035: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 038: athrow
      // 039: bipush 0
      // 03a: ireturn
      // 03b: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield zvn.s5a Llaq;
      // 043: getfield laq.oay Lt9d;
      // 046: invokevirtual t9d.hd9 ()Lbg8;
      // 049: new mew
      // 04c: dup
      // 04d: aload 0
      // 04e: getfield zvn.s5a Llaq;
      // 051: invokespecial mew.<init> (Li2h;)V
      // 054: bipush 0
      // 055: invokevirtual bg8.pom (Lmew;I)Lj7z;
      // 058: astore 2
      // 059: iload 1
      // 05a: ifeq 077
      // 05d: aload 2
      // 05e: ifnonnull 06e
      // 061: goto 068
      // 064: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 067: athrow
      // 068: bipush 0
      // 069: ireturn
      // 06a: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06d: athrow
      // 06e: aload 0
      // 06f: aload 0
      // 070: aload 2
      // 071: invokespecial zvn.j25 (Lj7z;)Lwdx;
      // 074: putfield zvn.fsu Lwdx;
      // 077: aload 0
      // 078: iload 1
      // 079: ifeq 090
      // 07c: getfield zvn.fsu Lwdx;
      // 07f: ifnonnull 08f
      // 082: goto 089
      // 085: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 088: athrow
      // 089: bipush 0
      // 08a: ireturn
      // 08b: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08e: athrow
      // 08f: aload 0
      // 090: getfield zvn.s5a Llaq;
      // 093: invokevirtual laq.zq2 ()Lp8a;
      // 096: checkcast zvv
      // 099: astore 3
      // 09a: aload 3
      // 09b: invokevirtual zvv.cuu ()Z
      // 09e: istore 4
      // 0a0: aload 3
      // 0a1: bipush 0
      // 0a2: invokevirtual zvv.w2o (Z)V
      // 0a5: aload 0
      // 0a6: aload 3
      // 0a7: aload 0
      // 0a8: getfield zvn.fsu Lwdx;
      // 0ab: invokevirtual wdx._d5 ()Lmew;
      // 0ae: invokevirtual zvv.ty_ (Lmew;)Lt_2;
      // 0b1: putfield zvn.tl3 Lt_2;
      // 0b4: aload 3
      // 0b5: iload 4
      // 0b7: invokevirtual zvv.w2o (Z)V
      // 0ba: aload 0
      // 0bb: iload 1
      // 0bc: ifeq 0d3
      // 0bf: getfield zvn.tl3 Lt_2;
      // 0c2: ifnull 0d2
      // 0c5: goto 0cc
      // 0c8: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0cb: athrow
      // 0cc: bipush 1
      // 0cd: ireturn
      // 0ce: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield zvn.s5a Llaq;
      // 0d6: bipush 10
      // 0d8: bipush 7
      // 0da: new fqr
      // 0dd: dup
      // 0de: aload 0
      // 0df: getfield zvn.fsu Lwdx;
      // 0e2: invokevirtual wdx._d5 ()Lmew;
      // 0e5: invokevirtual mew.getX ()I
      // 0e8: i2d
      // 0e9: aload 0
      // 0ea: getfield zvn.fsu Lwdx;
      // 0ed: invokevirtual wdx._d5 ()Lmew;
      // 0f0: invokevirtual mew.getY ()I
      // 0f3: i2d
      // 0f4: aload 0
      // 0f5: getfield zvn.fsu Lwdx;
      // 0f8: invokevirtual wdx._d5 ()Lmew;
      // 0fb: invokevirtual mew.getZ ()I
      // 0fe: i2d
      // 0ff: invokespecial fqr.<init> (DDD)V
      // 102: invokestatic zim.ity (Llaq;IILfqr;)Lfqr;
      // 105: astore 5
      // 107: iload 1
      // 108: ifeq 145
      // 10b: aload 5
      // 10d: ifnonnull 11d
      // 110: goto 117
      // 113: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 116: athrow
      // 117: bipush 0
      // 118: ireturn
      // 119: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11c: athrow
      // 11d: aload 3
      // 11e: bipush 0
      // 11f: invokevirtual zvv.w2o (Z)V
      // 122: aload 0
      // 123: aload 0
      // 124: getfield zvn.s5a Llaq;
      // 127: invokevirtual laq.zq2 ()Lp8a;
      // 12a: aload 5
      // 12c: getfield fqr.lvi D
      // 12f: aload 5
      // 131: getfield fqr.gn5 D
      // 134: aload 5
      // 136: getfield fqr.bn2 D
      // 139: invokevirtual p8a.yex (DDD)Lt_2;
      // 13c: putfield zvn.tl3 Lt_2;
      // 13f: aload 3
      // 140: iload 4
      // 142: invokevirtual zvv.w2o (Z)V
      // 145: aload 0
      // 146: getfield zvn.tl3 Lt_2;
      // 149: ifnull 154
      // 14c: bipush 1
      // 14d: goto 155
      // 150: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 153: athrow
      // 154: bipush 0
      // 155: ireturn
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield zvn.s5a Llaq;
      // 08: iload 1
      // 09: ifne 26
      // 0c: invokevirtual laq.zq2 ()Lp8a;
      // 0f: invokevirtual p8a.j07 ()Z
      // 12: ifeq 22
      // 15: goto 1c
      // 18: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21: athrow
      // 22: aload 0
      // 23: getfield zvn.s5a Llaq;
      // 26: getfield laq.uo6 F
      // 29: ldc 4.0
      // 2b: nop
      // 2c: fadd
      // 2d: fstore 2
      // 2e: aload 0
      // 2f: getfield zvn.s5a Llaq;
      // 32: aload 0
      // 33: getfield zvn.fsu Lwdx;
      // 36: invokevirtual wdx._d5 ()Lmew;
      // 39: invokevirtual laq.csm (Lmew;)D
      // 3c: fload 2
      // 3d: fload 2
      // 3e: fmul
      // 3f: f2d
      // 40: dcmpl
      // 41: iload 1
      // 42: ifne 50
      // 45: ifle 53
      // 48: goto 4f
      // 4b: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   @Override
   public void mnp() {
      this.s5a.zq2().sh7(this.tl3, this.g_3);
   }

   @Override
   public void zly() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield zvn.s5a Llaq;
      // 08: invokevirtual laq.zq2 ()Lp8a;
      // 0b: invokevirtual p8a.j07 ()Z
      // 0e: iload 1
      // 0f: ifne 57
      // 12: ifne 43
      // 15: goto 1c
      // 18: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield zvn.s5a Llaq;
      // 20: aload 0
      // 21: getfield zvn.fsu Lwdx;
      // 24: invokevirtual wdx._d5 ()Lmew;
      // 27: invokevirtual laq.csm (Lmew;)D
      // 2a: ldc2_w 16.0
      // 2d: dcmpg
      // 2e: iload 1
      // 2f: ifne 57
      // 32: goto 39
      // 35: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: ifge 58
      // 3c: goto 43
      // 3f: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield zvn.grp Ljava/util/List;
      // 47: aload 0
      // 48: getfield zvn.fsu Lwdx;
      // 4b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 50: goto 57
      // 53: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 56: athrow
      // 57: pop
      // 58: return
   }

   private wdx j25(j7z param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 3
      // 02: ldc 2147483647
      // 04: nop
      // 05: istore 4
      // 07: invokestatic t9d.b ()I
      // 0a: aload 1
      // 0b: invokevirtual j7z.z3b ()Ljava/util/List;
      // 0e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 13: astore 5
      // 15: istore 2
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 8d
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast wdx
      // 2a: astore 6
      // 2c: aload 6
      // 2e: iload 2
      // 2f: ifeq 8e
      // 32: aload 0
      // 33: getfield zvn.s5a Llaq;
      // 36: getfield laq.o2v D
      // 39: invokestatic fe6.jqf (D)I
      // 3c: aload 0
      // 3d: getfield zvn.s5a Llaq;
      // 40: getfield laq.kfp D
      // 43: invokestatic fe6.jqf (D)I
      // 46: aload 0
      // 47: getfield zvn.s5a Llaq;
      // 4a: getfield laq.vbd D
      // 4d: invokestatic fe6.jqf (D)I
      // 50: invokevirtual wdx.v_6 (III)I
      // 53: istore 7
      // 55: iload 7
      // 57: iload 2
      // 58: ifeq 74
      // 5b: iload 4
      // 5d: if_icmpge 89
      // 60: goto 67
      // 63: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 66: athrow
      // 67: aload 0
      // 68: aload 6
      // 6a: invokespecial zvn.gn3 (Lwdx;)Z
      // 6d: goto 74
      // 70: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 73: athrow
      // 74: iload 2
      // 75: ifeq 87
      // 78: ifne 89
      // 7b: goto 82
      // 7e: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 81: athrow
      // 82: aload 6
      // 84: astore 3
      // 85: iload 7
      // 87: istore 4
      // 89: iload 2
      // 8a: ifne 16
      // 8d: aload 3
      // 8e: areturn
   }

   private boolean gn3(wdx param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield zvn.grp Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 4d
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast wdx
      // 20: astore 4
      // 22: aload 1
      // 23: invokevirtual wdx._d5 ()Lmew;
      // 26: aload 4
      // 28: invokevirtual wdx._d5 ()Lmew;
      // 2b: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 2e: iload 2
      // 2f: ifeq 4e
      // 32: iload 2
      // 33: ifeq 48
      // 36: goto 3d
      // 39: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: ifeq 49
      // 40: goto 47
      // 43: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 46: athrow
      // 47: bipush 1
      // 48: ireturn
      // 49: iload 2
      // 4a: ifne 0e
      // 4d: bipush 0
      // 4e: ireturn
   }

   private void sgs() {
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
      // 05: getfield zvn.grp Ljava/util/List;
      // 08: iload 1
      // 09: ifeq 2e
      // 0c: invokeinterface java/util/List.size ()I 1
      // 11: bipush 15
      // 13: if_icmple 2f
      // 16: goto 1d
      // 19: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield zvn.grp Ljava/util/List;
      // 21: bipush 0
      // 22: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 27: goto 2e
      // 2a: invokestatic zvn.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d: athrow
      // 2e: pop
      // 2f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4924008608892628861L, 8522347540341870875L, MethodHandles.lookup().lookupClass()).a(151204146882773L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 110172022468595L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\u0018ÉÈgP\u0086\u0099^L\u0006â4âo\u000eõúûç\tØÿÞf\f\u0083ncRO\u001f\u0010ß\u009e³,3\u008ecST_©ö\u001cj\u0092Â".getBytes("ISO-8859-1")
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
