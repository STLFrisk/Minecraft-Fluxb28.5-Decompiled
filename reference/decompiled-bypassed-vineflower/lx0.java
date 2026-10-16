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

public class lx0 extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public lx0() {
      long var1 = a ^ 104826061123757L;
      super(a<"w">(30409, 1676503663765932507L ^ var1), a<"w">(23114, 6666983351732364633L ^ var1));
      this._8e = new q6h();
   }

   @Override
   public void w4v() {
      this.ip2 = 0;
      this.t8k = 0.0;
      this.ate = 0.0;
      this.ful = false;
      this._8e.u1k();
      super.w4v();
   }

   @Override
   public void i__() {
      this.wyl.gze.qeu = 1.0F;
      this.wyl.vg8.icv = 0.0;
      this.wyl.vg8.bw4 = 0.0;
      super.i__();
   }

   @jev
   public void y52(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield lx0.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getstatic mcs.uwx Lmcs;
      // 00e: invokevirtual l86.cab (Lmcs;)Z
      // 011: ifeq 01e
      // 014: ldc2_w 1.71
      // 017: goto 021
      // 01a: invokestatic lx0.a (Loov;)Loov;
      // 01d: athrow
      // 01e: ldc2_w 1.83
      // 021: dstore 3
      // 022: aload 0
      // 023: getfield lx0.wyl Lc05;
      // 026: getfield c05.vg8 Ll86;
      // 029: getfield l86.fcv Z
      // 02c: iload 2
      // 02d: ifeq 097
      // 030: ifeq 094
      // 033: goto 03a
      // 036: invokestatic lx0.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 0
      // 03b: getfield lx0.wyl Lc05;
      // 03e: getfield c05.vg8 Ll86;
      // 041: getfield l86.lfk Z
      // 044: iload 2
      // 045: ifeq 097
      // 048: goto 04f
      // 04b: invokestatic lx0.a (Loov;)Loov;
      // 04e: athrow
      // 04f: ifeq 094
      // 052: goto 059
      // 055: invokestatic lx0.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield lx0.ful Z
      // 05d: iload 2
      // 05e: ifeq 097
      // 061: goto 068
      // 064: invokestatic lx0.a (Loov;)Loov;
      // 067: athrow
      // 068: ifne 094
      // 06b: goto 072
      // 06e: invokestatic lx0.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 1
      // 073: aload 0
      // 074: getfield lx0.wyl Lc05;
      // 077: getfield c05.vg8 Ll86;
      // 07a: ldc2_w 0.42
      // 07d: dup2_x1
      // 07e: putfield l86.mop D
      // 081: invokevirtual _qa.ziq (D)V
      // 084: bipush 1
      // 085: invokestatic opd.de2 (I)V
      // 088: aload 0
      // 089: bipush 1
      // 08a: putfield lx0.ful Z
      // 08d: goto 094
      // 090: invokestatic lx0.a (Loov;)Loov;
      // 093: athrow
      // 094: invokestatic q0r.f2f ()Z
      // 097: iload 2
      // 098: ifeq 0bb
      // 09b: ifeq 136
      // 09e: goto 0a5
      // 0a1: invokestatic lx0.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: iload 2
      // 0a7: ifeq 107
      // 0aa: goto 0b1
      // 0ad: invokestatic lx0.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: getfield lx0.ip2 I
      // 0b4: goto 0bb
      // 0b7: invokestatic lx0.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: lookupswitch 68 2 0 25 1 45
      // 0d4: aload 0
      // 0d5: dload 3
      // 0d6: invokestatic p_c.tz6 ()D
      // 0d9: dmul
      // 0da: putfield lx0.ate D
      // 0dd: iload 2
      // 0de: ifne 117
      // 0e1: goto 0e8
      // 0e4: invokestatic lx0.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: dup
      // 0ea: getfield lx0.ate D
      // 0ed: ldc2_w 2.0
      // 0f0: dmul
      // 0f1: putfield lx0.ate D
      // 0f4: iload 2
      // 0f5: ifne 117
      // 0f8: goto 0ff
      // 0fb: invokestatic lx0.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: goto 107
      // 103: invokestatic lx0.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 0
      // 108: getfield lx0.t8k D
      // 10b: aload 0
      // 10c: getfield lx0.t8k D
      // 10f: ldc2_w 159.0
      // 112: ddiv
      // 113: dsub
      // 114: putfield lx0.ate D
      // 117: aload 0
      // 118: aload 0
      // 119: getfield lx0.ate D
      // 11c: invokestatic p_c.tz6 ()D
      // 11f: invokestatic java/lang/Math.max (DD)D
      // 122: putfield lx0.ate D
      // 125: aload 0
      // 126: getfield lx0.ate D
      // 129: invokestatic q0r.a8n (D)V
      // 12c: aload 0
      // 12d: dup
      // 12e: getfield lx0.ip2 I
      // 131: bipush 1
      // 132: iadd
      // 133: putfield lx0.ip2 I
      // 136: return
   }

   @jev
   public final void seo(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield lx0.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getfield l86.lfk Z
      // 00e: iload 2
      // 00f: ifeq 052
      // 012: ifeq 04e
      // 015: goto 01c
      // 018: invokestatic lx0.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield lx0.wyl Lc05;
      // 020: getfield c05.vg8 Ll86;
      // 023: getfield l86.fcv Z
      // 026: iload 2
      // 027: ifeq 052
      // 02a: goto 031
      // 02d: invokestatic lx0.a (Loov;)Loov;
      // 030: athrow
      // 031: ifeq 04e
      // 034: goto 03b
      // 037: invokestatic lx0.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 1
      // 03c: aload 1
      // 03d: invokevirtual fz2.fk0 ()D
      // 040: ldc2_w 7.435E-4
      // 043: dadd
      // 044: invokevirtual fz2.o4n (D)V
      // 047: goto 04e
      // 04a: invokestatic lx0.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield lx0.ip2 I
      // 052: iload 2
      // 053: ifeq 0cc
      // 056: bipush 1
      // 057: if_icmple 0b7
      // 05a: goto 061
      // 05d: invokestatic lx0.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield lx0.wyl Lc05;
      // 065: getfield c05.vg8 Ll86;
      // 068: dconst_0
      // 069: putfield l86.mop D
      // 06c: iload 2
      // 06d: ifeq 0a0
      // 070: goto 077
      // 073: invokestatic lx0.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: getfield lx0.wyl Lc05;
      // 07b: getfield c05.vg8 Ll86;
      // 07e: getfield l86.g25 I
      // 081: bipush 2
      // 082: irem
      // 083: ifne 0a4
      // 086: goto 08d
      // 089: invokestatic lx0.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 1
      // 08e: aload 1
      // 08f: invokevirtual fz2.fk0 ()D
      // 092: ldc2_w 2.3E-6
      // 095: dadd
      // 096: invokevirtual fz2.o4n (D)V
      // 099: goto 0a0
      // 09c: invokestatic lx0.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: iload 2
      // 0a1: ifne 0b7
      // 0a4: aload 1
      // 0a5: aload 1
      // 0a6: invokevirtual fz2.fk0 ()D
      // 0a9: ldc2_w 2.3E-6
      // 0ac: dsub
      // 0ad: invokevirtual fz2.o4n (D)V
      // 0b0: goto 0b7
      // 0b3: invokestatic lx0.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: iload 2
      // 0b9: ifeq 115
      // 0bc: getfield lx0._8e Lq6h;
      // 0bf: ldc2_w 100.0
      // 0c2: invokevirtual q6h.hqu (D)Z
      // 0c5: goto 0cc
      // 0c8: invokestatic lx0.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: ifeq 10d
      // 0cf: aload 0
      // 0d0: iload 2
      // 0d1: ifeq 115
      // 0d4: goto 0db
      // 0d7: invokestatic lx0.a (Loov;)Loov;
      // 0da: athrow
      // 0db: getfield lx0._8e Lq6h;
      // 0de: ldc2_w 500.0
      // 0e1: invokevirtual q6h.hqu (D)Z
      // 0e4: ifne 10d
      // 0e7: goto 0ee
      // 0ea: invokestatic lx0.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getfield lx0.wyl Lc05;
      // 0f2: getfield c05.gze Laba;
      // 0f5: ldc 2.2
      // 0f7: nop
      // 0f8: putfield aba.qeu F
      // 0fb: aload 0
      // 0fc: getfield lx0._8e Lq6h;
      // 0ff: invokevirtual q6h.u1k ()V
      // 102: iload 2
      // 103: ifne 11f
      // 106: goto 10d
      // 109: invokestatic lx0.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 0
      // 10e: goto 115
      // 111: invokestatic lx0.a (Loov;)Loov;
      // 114: athrow
      // 115: getfield lx0.wyl Lc05;
      // 118: getfield c05.gze Laba;
      // 11b: fconst_1
      // 11c: putfield aba.qeu F
      // 11f: aload 0
      // 120: getfield lx0.wyl Lc05;
      // 123: getfield c05.vg8 Ll86;
      // 126: getfield l86.o2v D
      // 129: aload 0
      // 12a: getfield lx0.wyl Lc05;
      // 12d: getfield c05.vg8 Ll86;
      // 130: getfield l86.bc1 D
      // 133: dsub
      // 134: dstore 3
      // 135: aload 0
      // 136: getfield lx0.wyl Lc05;
      // 139: getfield c05.vg8 Ll86;
      // 13c: getfield l86.vbd D
      // 13f: aload 0
      // 140: getfield lx0.wyl Lc05;
      // 143: getfield c05.vg8 Ll86;
      // 146: getfield l86.a4d D
      // 149: dsub
      // 14a: dstore 5
      // 14c: aload 0
      // 14d: dload 3
      // 14e: dload 3
      // 14f: dmul
      // 150: dload 5
      // 152: dload 5
      // 154: dmul
      // 155: dadd
      // 156: invokestatic java/lang/Math.sqrt (D)D
      // 159: putfield lx0.t8k D
      // 15c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6280863245373271686L, 6116114180621043980L, MethodHandles.lookup().lookupClass()).a(125274182416972L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 116008997524809L;
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
      String var6 = "\u0019)ü\u000eîI\u0083\u0087\\b)W\u0011¾\bÁ ï%µ@wJC\u00182ª\u00adg\\\u0017Fð6ìo[£\u0017G,}\u009cúÓ\u0010ó¯\u009b";
      int var8 = "\u0019)ü\u000eîI\u0083\u0087\\b)W\u0011¾\bÁ ï%µ@wJC\u00182ª\u00adg\\\u0017Fð6ìo[£\u0017G,}\u009cúÓ\u0010ó¯\u009b".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8002;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("lx0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("lx0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
