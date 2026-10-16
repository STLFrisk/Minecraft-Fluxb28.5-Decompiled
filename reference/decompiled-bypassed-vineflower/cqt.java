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

public class cqt {
   public String ypu;
   public ers l27;
   public boolean r12;
   public float emz = 0.0F;
   public boolean jz6 = false;
   public boolean ylh = false;
   public float yr_;
   public float q3h;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public cqt(ers var1, String var2, boolean var3) {
      this.l27 = var1;
      this.ypu = var2;
      this.r12 = var3;
   }

   public void ej_(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fload 1
      // 002: putfield cqt.yr_ F
      // 005: invokestatic t9d.b ()I
      // 008: aload 0
      // 009: fload 2
      // 00a: putfield cqt.q3h F
      // 00d: istore 3
      // 00e: aload 0
      // 00f: getfield cqt.ylh Z
      // 012: iload 3
      // 013: ifeq 02b
      // 016: ifeq 043
      // 019: goto 020
      // 01c: invokestatic cqt.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield cqt.r12 Z
      // 024: goto 02b
      // 027: invokestatic cqt.a (Loov;)Loov;
      // 02a: athrow
      // 02b: iload 3
      // 02c: ifeq 03b
      // 02f: ifne 03e
      // 032: goto 039
      // 035: invokestatic cqt.a (Loov;)Loov;
      // 038: athrow
      // 039: bipush 15
      // 03b: goto 03f
      // 03e: bipush 0
      // 03f: i2f
      // 040: goto 044
      // 043: fconst_0
      // 044: fstore 4
      // 046: aload 0
      // 047: aload 0
      // 048: getfield cqt.emz F
      // 04b: fload 4
      // 04d: ldc 10.0
      // 04f: nop
      // 050: aload 0
      // 051: getfield cqt.emz F
      // 054: fload 4
      // 056: fsub
      // 057: invokestatic java/lang/Math.abs (F)F
      // 05a: ldc 40.0
      // 05c: nop
      // 05d: fmul
      // 05e: invokestatic java/lang/Math.max (FF)F
      // 061: ldc 0.3
      // 063: nop
      // 064: fmul
      // 065: invokestatic ybv.lvf (FFF)F
      // 068: putfield cqt.emz F
      // 06b: getstatic jsr.rfr Lcyb;
      // 06e: aload 0
      // 06f: getfield cqt.ypu Ljava/lang/String;
      // 072: fload 1
      // 073: ldc 15.0
      // 075: nop
      // 076: fadd
      // 077: fload 2
      // 078: ldc 20.0
      // 07a: nop
      // 07b: fsub
      // 07c: aload 0
      // 07d: getfield cqt.l27 Lers;
      // 080: getfield ers.mom I
      // 083: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 086: pop
      // 087: fload 1
      // 088: ldc 88.0
      // 08a: nop
      // 08b: fadd
      // 08c: aload 0
      // 08d: getfield cqt.emz F
      // 090: fsub
      // 091: fload 2
      // 092: ldc 23.0
      // 094: nop
      // 095: fsub
      // 096: fload 1
      // 097: ldc 90.0
      // 099: nop
      // 09a: fadd
      // 09b: fload 2
      // 09c: ldc 5.0
      // 09e: nop
      // 09f: fsub
      // 0a0: aload 0
      // 0a1: getfield cqt.l27 Lers;
      // 0a4: getfield ers.jky I
      // 0a7: invokestatic hhf.cuu (FFFFI)V
      // 0aa: aload 0
      // 0ab: getfield cqt.l27 Lers;
      // 0ae: fload 1
      // 0af: ldc 68.0
      // 0b1: nop
      // 0b2: fadd
      // 0b3: aload 0
      // 0b4: getfield cqt.emz F
      // 0b7: fsub
      // 0b8: fload 2
      // 0b9: ldc 23.0
      // 0bb: nop
      // 0bc: fsub
      // 0bd: fload 1
      // 0be: ldc 88.0
      // 0c0: nop
      // 0c1: fadd
      // 0c2: aload 0
      // 0c3: getfield cqt.emz F
      // 0c6: fsub
      // 0c7: fload 2
      // 0c8: ldc 5.0
      // 0ca: nop
      // 0cb: fsub
      // 0cc: aload 0
      // 0cd: getfield cqt.l27 Lers;
      // 0d0: getfield ers.jky I
      // 0d3: fconst_0
      // 0d4: invokestatic hhf.kjo (IF)I
      // 0d7: aload 0
      // 0d8: getfield cqt.l27 Lers;
      // 0db: getfield ers.jky I
      // 0de: fconst_1
      // 0df: invokestatic hhf.kjo (IF)I
      // 0e2: invokevirtual ers.ps0 (FFFFII)V
      // 0e5: getstatic jsr.tyz Lcyb;
      // 0e8: aload 0
      // 0e9: getfield cqt.ypu Ljava/lang/String;
      // 0ec: aload 0
      // 0ed: getfield cqt.l27 Lers;
      // 0f0: getfield ers.gn0 Ljava/lang/String;
      // 0f3: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0f6: iload 3
      // 0f7: ifeq 112
      // 0fa: ifeq 10e
      // 0fd: goto 104
      // 100: invokestatic cqt.a (Loov;)Loov;
      // 103: athrow
      // 104: ldc "v"
      // 106: nop
      // 107: goto 122
      // 10a: invokestatic cqt.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 0
      // 10f: getfield cqt.r12 Z
      // 112: ifeq 11f
      // 115: ldc "y"
      // 117: nop
      // 118: goto 122
      // 11b: invokestatic cqt.a (Loov;)Loov;
      // 11e: athrow
      // 11f: ldc "x"
      // 121: nop
      // 122: fload 1
      // 123: ldc 5.0
      // 125: nop
      // 126: fadd
      // 127: fload 2
      // 128: ldc 18.0
      // 12a: nop
      // 12b: fsub
      // 12c: aload 0
      // 12d: getfield cqt.l27 Lers;
      // 130: getfield ers.mom I
      // 133: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 136: pop
      // 137: getstatic jsr.tyz Lcyb;
      // 13a: aload 0
      // 13b: getfield cqt.r12 Z
      // 13e: ifne 14b
      // 141: ldc "w"
      // 143: nop
      // 144: goto 14e
      // 147: invokestatic cqt.a (Loov;)Loov;
      // 14a: athrow
      // 14b: ldc ""
      // 14d: nop
      // 14e: fload 1
      // 14f: ldc 91.5
      // 151: nop
      // 152: fadd
      // 153: aload 0
      // 154: getfield cqt.emz F
      // 157: fsub
      // 158: fload 2
      // 159: ldc 18.0
      // 15b: nop
      // 15c: fsub
      // 15d: aload 0
      // 15e: getfield cqt.l27 Lers;
      // 161: getfield ers.mom I
      // 164: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 167: pop
      // 168: return
   }

   public void nvy(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cqt.a J
      // 003: ldc2_w 31662311423896
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.c ()I
      // 00c: istore 6
      // 00e: fload 3
      // 00f: fconst_0
      // 010: fcmpl
      // 011: iload 6
      // 013: ifne 117
      // 016: ifne 114
      // 019: goto 020
      // 01c: invokestatic cqt.a (Loov;)Loov;
      // 01f: athrow
      // 020: fload 1
      // 021: fload 2
      // 022: aload 0
      // 023: getfield cqt.yr_ F
      // 026: ldc 15.0
      // 028: nop
      // 029: fadd
      // 02a: aload 0
      // 02b: getfield cqt.q3h F
      // 02e: ldc 23.0
      // 030: nop
      // 031: fsub
      // 032: aload 0
      // 033: getfield cqt.yr_ F
      // 036: ldc 90.0
      // 038: nop
      // 039: fadd
      // 03a: aload 0
      // 03b: getfield cqt.q3h F
      // 03e: ldc 5.0
      // 040: nop
      // 041: fsub
      // 042: invokestatic hhf.md3 (FFFFFF)Z
      // 045: iload 6
      // 047: ifne 117
      // 04a: goto 051
      // 04d: invokestatic cqt.a (Loov;)Loov;
      // 050: athrow
      // 051: ifeq 114
      // 054: goto 05b
      // 057: invokestatic cqt.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 0
      // 05c: iload 6
      // 05e: ifne 110
      // 061: goto 068
      // 064: invokestatic cqt.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield cqt.ylh Z
      // 06b: ifne 0b0
      // 06e: goto 075
      // 071: invokestatic cqt.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 0
      // 076: getfield cqt.l27 Lers;
      // 079: new java/lang/StringBuilder
      // 07c: dup
      // 07d: invokespecial java/lang/StringBuilder.<init> ()V
      // 080: aload 0
      // 081: getfield cqt.r12 Z
      // 084: ifeq 098
      // 087: goto 08e
      // 08a: invokestatic cqt.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ldc "#"
      // 090: nop
      // 091: goto 09b
      // 094: invokestatic cqt.a (Loov;)Loov;
      // 097: athrow
      // 098: ldc ""
      // 09a: nop
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: aload 0
      // 09f: getfield cqt.ypu Ljava/lang/String;
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a8: invokevirtual ers.car (Ljava/lang/String;)V
      // 0ab: iload 6
      // 0ad: ifeq 114
      // 0b0: invokestatic c05.vz1 ()Lc05;
      // 0b3: new kf9
      // 0b6: dup
      // 0b7: aload 0
      // 0b8: invokedynamic confirmClicked (Lcqt;)Lha_; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (ZI)V, cqt.kgj (ZI)V, (ZI)V ]
      // 0bd: new java/lang/StringBuilder
      // 0c0: dup
      // 0c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c4: sipush 15816
      // 0c7: ldc2_w 7204096656140712153
      // 0ca: lload 4
      // 0cc: lxor
      // 0cd: invokedynamic l (IJ)Ljava/lang/String; bsm=cqt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: nop
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: getstatic syo.iyk Lsyo;
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0dc: aload 0
      // 0dd: getfield cqt.ypu Ljava/lang/String;
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: getstatic syo.w29 Lsyo;
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e9: sipush 1872
      // 0ec: ldc2_w 8869202401196606016
      // 0ef: lload 4
      // 0f1: lxor
      // 0f2: invokedynamic l (IJ)Ljava/lang/String; bsm=cqt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: nop
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fe: ldc ""
      // 100: nop
      // 101: bipush 0
      // 102: invokespecial kf9.<init> (Lha_;Ljava/lang/String;Ljava/lang/String;I)V
      // 105: invokevirtual c05.z2i (Lgbe;)V
      // 108: aload 0
      // 109: goto 110
      // 10c: invokestatic cqt.a (Loov;)Loov;
      // 10f: athrow
      // 110: bipush 0
      // 111: putfield cqt.ylh Z
      // 114: fload 3
      // 115: fconst_1
      // 116: fcmpl
      // 117: iload 6
      // 119: ifne 152
      // 11c: ifne 189
      // 11f: goto 126
      // 122: invokestatic cqt.a (Loov;)Loov;
      // 125: athrow
      // 126: fload 1
      // 127: fload 2
      // 128: aload 0
      // 129: getfield cqt.yr_ F
      // 12c: ldc 15.0
      // 12e: nop
      // 12f: fadd
      // 130: aload 0
      // 131: getfield cqt.q3h F
      // 134: ldc 23.0
      // 136: nop
      // 137: fsub
      // 138: aload 0
      // 139: getfield cqt.yr_ F
      // 13c: ldc 90.0
      // 13e: nop
      // 13f: fadd
      // 140: aload 0
      // 141: getfield cqt.q3h F
      // 144: ldc 5.0
      // 146: nop
      // 147: fsub
      // 148: invokestatic hhf.md3 (FFFFFF)Z
      // 14b: goto 152
      // 14e: invokestatic cqt.a (Loov;)Loov;
      // 151: athrow
      // 152: ifeq 17d
      // 155: aload 0
      // 156: aload 0
      // 157: getfield cqt.ylh Z
      // 15a: iload 6
      // 15c: ifne 171
      // 15f: goto 166
      // 162: invokestatic cqt.a (Loov;)Loov;
      // 165: athrow
      // 166: ifne 174
      // 169: goto 170
      // 16c: invokestatic cqt.a (Loov;)Loov;
      // 16f: athrow
      // 170: bipush 1
      // 171: goto 175
      // 174: bipush 0
      // 175: putfield cqt.ylh Z
      // 178: iload 6
      // 17a: ifeq 189
      // 17d: aload 0
      // 17e: bipush 0
      // 17f: putfield cqt.ylh Z
      // 182: goto 189
      // 185: invokestatic cqt.a (Loov;)Loov;
      // 188: athrow
      // 189: return
   }

   private void kgj(boolean var1, int var2) {
      try {
         if (var1) {
            this.l27.thf(this.ypu);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      c05.vz1().z2i(this.l27.usm);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2343965584012797521L, 1368330435156209609L, MethodHandles.lookup().lookupClass()).a(47266090637354L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 60784356175214L;
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
      String var6 = "\u007f\u008c>\u0000#d&ù/Mµ^\u008eböü\u0090vEw>·Ïö¢S·ù\u000b±Ê\u0000LÖi.\u0014·Ä\u008cá°~»\u0080\u008f¯C\u0080_\\êÛgg9\u0000ÞÜb~?-å\u0095\u0004Ì\nêë_^\u0083ÍTäA\u0083\u001fÞ\u0010««\u009b\u000e¬-\u0014LK&®XwVA2";
      int var8 = "\u007f\u008c>\u0000#d&ù/Mµ^\u008eböü\u0090vEw>·Ïö¢S·ù\u000b±Ê\u0000LÖi.\u0014·Ä\u008cá°~»\u0080\u008f¯C\u0080_\\êÛgg9\u0000ÞÜb~?-å\u0095\u0004Ì\nêë_^\u0083ÍTäA\u0083\u001fÞ\u0010««\u009b\u000e¬-\u0014LK&®XwVA2"
         .length();
      char var5 = 'P';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23037;
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
            throw new RuntimeException("cqt", var10);
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
         throw new RuntimeException("cqt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
