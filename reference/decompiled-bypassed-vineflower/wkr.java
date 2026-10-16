import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wkr extends cjm {
   private static final long a;
   private static final String b;

   public wkr(n6g var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public wkr(n6g var1, double var2, int var4, int var5, float var6) {
      long var7 = a ^ 93587148802774L;
      int var9 = t9d.c();
      super();
      this.lsz = -1;
      if (var9 == 0) {
         try {
            if (!(var1 instanceof g_3)) {
               throw new IllegalArgumentException(b);
            }
         } catch (IllegalArgumentException var10) {
            throw a(var10);
         }

         this.tbl = var1;
         this.o3t = (yqv)var1;
         this.pu0 = var2;
         this.l7e = var4;
         this.x4j = var5;
         this.y1g = var6;
         this.wp0 = var6 * var6;
         this.k23(3);
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
      // 05: getfield wkr.o3t Lyqv;
      // 08: invokevirtual yqv.q4v ()Lg_3;
      // 0b: astore 2
      // 0c: iload 1
      // 0d: ifeq 26
      // 10: aload 2
      // 11: ifnonnull 21
      // 14: goto 1b
      // 17: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20: athrow
      // 21: aload 0
      // 22: aload 2
      // 23: putfield wkr.tjw Lg_3;
      // 26: bipush 1
      // 27: ireturn
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
      // 05: invokevirtual wkr.vle ()Z
      // 08: iload 1
      // 09: ifeq 36
      // 0c: ifne 35
      // 0f: goto 16
      // 12: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield wkr.o3t Lyqv;
      // 1a: invokevirtual yqv.zq2 ()Lp8a;
      // 1d: invokevirtual p8a.j07 ()Z
      // 20: iload 1
      // 21: ifeq 36
      // 24: goto 2b
      // 27: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a: athrow
      // 2b: ifne 39
      // 2e: goto 35
      // 31: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   @Override
   public void zly() {
      this.tjw = null;
      this.fgq = 0;
      this.lsz = -1;
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield wkr.o3t Lyqv;
      // 008: aload 0
      // 009: getfield wkr.tjw Lg_3;
      // 00c: getfield g_3.o2v D
      // 00f: aload 0
      // 010: getfield wkr.tjw Lg_3;
      // 013: invokevirtual g_3.aaw ()Lnh4;
      // 016: getfield nh4.bx_ D
      // 019: aload 0
      // 01a: getfield wkr.tjw Lg_3;
      // 01d: getfield g_3.vbd D
      // 020: invokevirtual yqv.p53 (DDD)D
      // 023: dstore 2
      // 024: aload 0
      // 025: getfield wkr.o3t Lyqv;
      // 028: invokevirtual yqv.dov ()Ld6l;
      // 02b: aload 0
      // 02c: getfield wkr.tjw Lg_3;
      // 02f: invokevirtual d6l.ik5 (Li2h;)Z
      // 032: istore 4
      // 034: iload 1
      // 035: ifeq 055
      // 038: iload 4
      // 03a: ifeq 059
      // 03d: goto 044
      // 040: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 043: athrow
      // 044: aload 0
      // 045: dup
      // 046: getfield wkr.fgq I
      // 049: bipush 1
      // 04a: iadd
      // 04b: putfield wkr.fgq I
      // 04e: goto 055
      // 051: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 054: athrow
      // 055: iload 1
      // 056: ifne 065
      // 059: aload 0
      // 05a: bipush 0
      // 05b: putfield wkr.fgq I
      // 05e: goto 065
      // 061: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 064: athrow
      // 065: dload 2
      // 066: aload 0
      // 067: getfield wkr.wp0 F
      // 06a: f2d
      // 06b: dcmpg
      // 06c: iload 1
      // 06d: ifeq 0c3
      // 070: ifgt 0aa
      // 073: goto 07a
      // 076: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield wkr.fgq I
      // 07e: iload 1
      // 07f: ifeq 0c3
      // 082: goto 089
      // 085: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 088: athrow
      // 089: bipush 20
      // 08b: if_icmplt 0aa
      // 08e: goto 095
      // 091: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 094: athrow
      // 095: aload 0
      // 096: getfield wkr.o3t Lyqv;
      // 099: invokevirtual yqv.zq2 ()Lp8a;
      // 09c: invokevirtual p8a.pj2 ()V
      // 09f: iload 1
      // 0a0: ifne 0c4
      // 0a3: goto 0aa
      // 0a6: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield wkr.o3t Lyqv;
      // 0ae: invokevirtual yqv.zq2 ()Lp8a;
      // 0b1: aload 0
      // 0b2: getfield wkr.tjw Lg_3;
      // 0b5: aload 0
      // 0b6: getfield wkr.pu0 D
      // 0b9: invokevirtual p8a.p6m (Li2h;D)Z
      // 0bc: goto 0c3
      // 0bf: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: pop
      // 0c4: aload 0
      // 0c5: getfield wkr.o3t Lyqv;
      // 0c8: invokevirtual yqv.ph8 ()Lknw;
      // 0cb: aload 0
      // 0cc: getfield wkr.tjw Lg_3;
      // 0cf: ldc 30.0
      // 0d1: nop
      // 0d2: ldc 30.0
      // 0d4: nop
      // 0d5: invokevirtual knw.rz3 (Li2h;FF)V
      // 0d8: aload 0
      // 0d9: dup
      // 0da: getfield wkr.lsz I
      // 0dd: bipush 1
      // 0de: isub
      // 0df: dup_x1
      // 0e0: putfield wkr.lsz I
      // 0e3: iload 1
      // 0e4: ifeq 161
      // 0e7: ifne 156
      // 0ea: goto 0f1
      // 0ed: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0f0: athrow
      // 0f1: dload 2
      // 0f2: aload 0
      // 0f3: getfield wkr.wp0 F
      // 0f6: f2d
      // 0f7: dcmpl
      // 0f8: iload 1
      // 0f9: ifeq 10f
      // 0fc: goto 103
      // 0ff: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 102: athrow
      // 103: ifgt 112
      // 106: goto 10d
      // 109: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10c: athrow
      // 10d: iload 4
      // 10f: ifne 113
      // 112: return
      // 113: dload 2
      // 114: invokestatic fe6.dii (D)F
      // 117: aload 0
      // 118: getfield wkr.y1g F
      // 11b: fdiv
      // 11c: fstore 5
      // 11e: fload 5
      // 120: ldc 0.1
      // 122: nop
      // 123: fconst_1
      // 124: invokestatic fe6._f3 (FFF)F
      // 127: fstore 6
      // 129: aload 0
      // 12a: getfield wkr.tbl Ln6g;
      // 12d: aload 0
      // 12e: getfield wkr.tjw Lg_3;
      // 131: fload 6
      // 133: invokeinterface n6g.mx4 (Lg_3;F)V 3
      // 138: aload 0
      // 139: fload 5
      // 13b: aload 0
      // 13c: getfield wkr.x4j I
      // 13f: aload 0
      // 140: getfield wkr.l7e I
      // 143: isub
      // 144: i2f
      // 145: fmul
      // 146: aload 0
      // 147: getfield wkr.l7e I
      // 14a: i2f
      // 14b: fadd
      // 14c: invokestatic fe6.tpk (F)I
      // 14f: putfield wkr.lsz I
      // 152: iload 1
      // 153: ifne 189
      // 156: aload 0
      // 157: getfield wkr.lsz I
      // 15a: goto 161
      // 15d: invokestatic wkr.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 160: athrow
      // 161: ifge 189
      // 164: dload 2
      // 165: invokestatic fe6.dii (D)F
      // 168: aload 0
      // 169: getfield wkr.y1g F
      // 16c: fdiv
      // 16d: fstore 5
      // 16f: aload 0
      // 170: fload 5
      // 172: aload 0
      // 173: getfield wkr.x4j I
      // 176: aload 0
      // 177: getfield wkr.l7e I
      // 17a: isub
      // 17b: i2f
      // 17c: fmul
      // 17d: aload 0
      // 17e: getfield wkr.l7e I
      // 181: i2f
      // 182: fadd
      // 183: invokestatic fe6.tpk (F)I
      // 186: putfield wkr.lsz I
      // 189: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5396341159277600945L, 225373067268551412L, MethodHandles.lookup().lookupClass()).a(189181551584773L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51802197046047L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "_Ä>¨\u0005i°\u007fAæbh¸µ£'(\u0081\u009b¨\u008d¼\u0091HgSµ±\u008b\tÀ$\u0087\n×ßl\u0000ý\u0083=»_\\æ÷òNÄ¥¹2\u0007õD¤".getBytes("ISO-8859-1")
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
