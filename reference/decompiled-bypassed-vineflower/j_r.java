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

public class j_r extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public j_r() {
      long var1 = a ^ 41244235818368L;
      super(a<"g">(10279, 6817649248962327353L ^ var1), a<"g">(7714, 3204541293063275837L ^ var1));
   }

   @Override
   public void w4v() {
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
      // 05: invokespecial j1s.w4v ()V
      // 08: aload 0
      // 09: iload 1
      // 0a: ifne 32
      // 0d: getfield j_r.wyl Lc05;
      // 10: getfield c05.vg8 Ll86;
      // 13: ifnull 2c
      // 16: goto 1d
      // 19: invokestatic j_r.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 0
      // 1f: invokespecial j_r.zsg ()D
      // 22: putfield j_r.t0o D
      // 25: goto 2c
      // 28: invokestatic j_r.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: dconst_0
      // 2e: putfield j_r.alp D
      // 31: aload 0
      // 32: ldc2_w 2.0
      // 35: putfield j_r.fpa D
      // 38: return
   }

   @Override
   public void i__() {
      super.i__();
      this.wyl.gze.qeu = 1.0F;
      this.t0o = this.zsg();
      this.wyl.vg8.icv = 0.0;
      this.wyl.vg8.bw4 = 0.0;
      this.wyl.vg8.nr7 = 0.6F;
   }

   @jev
   public void s26(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield j_r.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getfield l86.lfk Z
      // 00e: iload 2
      // 00f: ifne 04a
      // 012: ifne 039
      // 015: goto 01c
      // 018: invokestatic j_r.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield j_r.fpa D
      // 020: ldc2_w 3.0
      // 023: dcmpl
      // 024: iload 2
      // 025: ifne 04a
      // 028: goto 02f
      // 02b: invokestatic j_r.a (Loov;)Loov;
      // 02e: athrow
      // 02f: ifne 1c3
      // 032: goto 039
      // 035: invokestatic j_r.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield j_r.wyl Lc05;
      // 03d: getfield c05.vg8 Ll86;
      // 040: getfield l86.cbi Z
      // 043: goto 04a
      // 046: invokestatic j_r.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 2
      // 04b: ifne 097
      // 04e: ifne 079
      // 051: goto 058
      // 054: invokestatic j_r.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 0
      // 059: getfield j_r.wyl Lc05;
      // 05c: getfield c05.vg8 Ll86;
      // 05f: getfield l86.ooc F
      // 062: fconst_0
      // 063: fcmpl
      // 064: iload 2
      // 065: ifne 0a9
      // 068: goto 06f
      // 06b: invokestatic j_r.a (Loov;)Loov;
      // 06e: athrow
      // 06f: ifne 09a
      // 072: goto 079
      // 075: invokestatic j_r.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: getfield j_r.wyl Lc05;
      // 07d: iload 2
      // 07e: ifne 1a8
      // 081: goto 088
      // 084: invokestatic j_r.a (Loov;)Loov;
      // 087: athrow
      // 088: getfield c05.vg8 Ll86;
      // 08b: getfield l86.z66 F
      // 08e: fconst_0
      // 08f: fcmpl
      // 090: goto 097
      // 093: invokestatic j_r.a (Loov;)Loov;
      // 096: athrow
      // 097: ifeq 19d
      // 09a: aload 0
      // 09b: getfield j_r.fpa D
      // 09e: ldc2_w 2.0
      // 0a1: dcmpl
      // 0a2: goto 0a9
      // 0a5: invokestatic j_r.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: iload 2
      // 0aa: ifne 0fc
      // 0ad: ifne 0e2
      // 0b0: goto 0b7
      // 0b3: invokestatic j_r.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: dup
      // 0b9: getfield j_r.t0o D
      // 0bc: ldc2_w 1.4800000190734863
      // 0bf: dmul
      // 0c0: putfield j_r.t0o D
      // 0c3: aload 0
      // 0c4: ldc2_w 3.0
      // 0c7: putfield j_r.fpa D
      // 0ca: aload 0
      // 0cb: getfield j_r.wyl Lc05;
      // 0ce: getfield c05.gze Laba;
      // 0d1: ldc 1.08
      // 0d3: nop
      // 0d4: putfield aba.qeu F
      // 0d7: iload 2
      // 0d8: ifeq 1af
      // 0db: goto 0e2
      // 0de: invokestatic j_r.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: iload 2
      // 0e4: ifne 137
      // 0e7: goto 0ee
      // 0ea: invokestatic j_r.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: getfield j_r.fpa D
      // 0f1: ldc2_w 3.0
      // 0f4: dcmpl
      // 0f5: goto 0fc
      // 0f8: invokestatic j_r.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: ifne 12f
      // 0ff: aload 0
      // 100: ldc2_w 2.0
      // 103: putfield j_r.fpa D
      // 106: ldc2_w 0.88
      // 109: aload 0
      // 10a: getfield j_r.alp D
      // 10d: aload 0
      // 10e: invokespecial j_r.zsg ()D
      // 111: dsub
      // 112: dmul
      // 113: dstore 3
      // 114: aload 0
      // 115: aload 0
      // 116: getfield j_r.alp D
      // 119: dload 3
      // 11a: dsub
      // 11b: putfield j_r.t0o D
      // 11e: aload 0
      // 11f: getfield j_r.wyl Lc05;
      // 122: getfield c05.gze Laba;
      // 125: ldc 1.08
      // 127: nop
      // 128: putfield aba.qeu F
      // 12b: iload 2
      // 12c: ifeq 1af
      // 12f: aload 0
      // 130: goto 137
      // 133: invokestatic j_r.a (Loov;)Loov;
      // 136: athrow
      // 137: getfield j_r.wyl Lc05;
      // 13a: getfield c05.tij Lkh3;
      // 13d: aload 0
      // 13e: getfield j_r.wyl Lc05;
      // 141: getfield c05.vg8 Ll86;
      // 144: aload 0
      // 145: getfield j_r.wyl Lc05;
      // 148: getfield c05.vg8 Ll86;
      // 14b: invokevirtual l86.aaw ()Lnh4;
      // 14e: dconst_0
      // 14f: aload 0
      // 150: getfield j_r.wyl Lc05;
      // 153: getfield c05.vg8 Ll86;
      // 156: getfield l86.mop D
      // 159: dconst_0
      // 15a: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 15d: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 160: astore 3
      // 161: aload 3
      // 162: invokeinterface java/util/List.size ()I 1
      // 167: iload 2
      // 168: ifne 191
      // 16b: ifgt 194
      // 16e: goto 175
      // 171: invokestatic j_r.a (Loov;)Loov;
      // 174: athrow
      // 175: aload 0
      // 176: iload 2
      // 177: ifne 195
      // 17a: goto 181
      // 17d: invokestatic j_r.a (Loov;)Loov;
      // 180: athrow
      // 181: getfield j_r.wyl Lc05;
      // 184: getfield c05.vg8 Ll86;
      // 187: getfield l86.fcv Z
      // 18a: goto 191
      // 18d: invokestatic j_r.a (Loov;)Loov;
      // 190: athrow
      // 191: ifeq 199
      // 194: aload 0
      // 195: dconst_1
      // 196: putfield j_r.fpa D
      // 199: iload 2
      // 19a: ifeq 1af
      // 19d: aload 0
      // 19e: getfield j_r.wyl Lc05;
      // 1a1: goto 1a8
      // 1a4: invokestatic j_r.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: getfield c05.gze Laba;
      // 1ab: fconst_1
      // 1ac: putfield aba.qeu F
      // 1af: aload 1
      // 1b0: aload 0
      // 1b1: aload 0
      // 1b2: getfield j_r.t0o D
      // 1b5: aload 0
      // 1b6: invokespecial j_r.zsg ()D
      // 1b9: invokestatic java/lang/Math.max (DD)D
      // 1bc: dup2_x1
      // 1bd: putfield j_r.t0o D
      // 1c0: invokestatic ohv.qjs (L_qa;D)V
      // 1c3: return
   }

   @jev
   public void u47(fz2 param1) {
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
      // 05: getfield j_r.fpa D
      // 08: ldc2_w 3.0
      // 0b: iload 2
      // 0c: ifeq 41
      // 0f: dcmpl
      // 10: ifne 2d
      // 13: goto 1a
      // 16: invokestatic j_r.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: dup
      // 1c: getfield fz2.w2f D
      // 1f: ldc2_w 0.3994
      // 22: dadd
      // 23: putfield fz2.w2f D
      // 26: goto 2d
      // 29: invokestatic j_r.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield j_r.wyl Lc05;
      // 31: getfield c05.vg8 Ll86;
      // 34: getfield l86.o2v D
      // 37: aload 0
      // 38: getfield j_r.wyl Lc05;
      // 3b: getfield c05.vg8 Ll86;
      // 3e: getfield l86.bc1 D
      // 41: dsub
      // 42: dstore 3
      // 43: aload 0
      // 44: getfield j_r.wyl Lc05;
      // 47: getfield c05.vg8 Ll86;
      // 4a: getfield l86.vbd D
      // 4d: aload 0
      // 4e: getfield j_r.wyl Lc05;
      // 51: getfield c05.vg8 Ll86;
      // 54: getfield l86.a4d D
      // 57: dsub
      // 58: dstore 5
      // 5a: aload 0
      // 5b: dload 3
      // 5c: dload 3
      // 5d: dmul
      // 5e: dload 5
      // 60: dload 5
      // 62: dmul
      // 63: dadd
      // 64: invokestatic java/lang/Math.sqrt (D)D
      // 67: putfield j_r.alp D
      // 6a: return
   }

   private double zsg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: ldc2_w 0.2872
      // 07: dstore 2
      // 08: aload 0
      // 09: getfield j_r.wyl Lc05;
      // 0c: getfield c05.vg8 Ll86;
      // 0f: getstatic mcs.uwx Lmcs;
      // 12: invokevirtual l86.cab (Lmcs;)Z
      // 15: iload 1
      // 16: ifeq 3a
      // 19: ifeq 4a
      // 1c: goto 23
      // 1f: invokestatic j_r.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield j_r.wyl Lc05;
      // 27: getfield c05.vg8 Ll86;
      // 2a: getstatic mcs.uwx Lmcs;
      // 2d: invokevirtual l86.dhd (Lmcs;)Lsdj;
      // 30: invokevirtual sdj.tus ()I
      // 33: goto 3a
      // 36: invokestatic j_r.a (Loov;)Loov;
      // 39: athrow
      // 3a: istore 4
      // 3c: dload 2
      // 3d: dconst_1
      // 3e: ldc2_w 0.2
      // 41: iload 4
      // 43: bipush 1
      // 44: iadd
      // 45: i2d
      // 46: dmul
      // 47: dadd
      // 48: dmul
      // 49: dstore 2
      // 4a: dload 2
      // 4b: dreturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4959694980882618720L, -851820798246908565L, MethodHandles.lookup().lookupClass()).a(105069414020037L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 16547414328180L;
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
      String var6 = "/´\u009d^\u0092ÊÅZ³\u009d\u00168\\ù×¨\u0010¤Ð×Þãw\tBïqÅ3=Íg¤";
      int var8 = "/´\u009d^\u0092ÊÅZ³\u009d\u00168\\ù×¨\u0010¤Ð×Þãw\tBïqÅ3=Íg¤".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16538;
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
            throw new RuntimeException("j_r", var10);
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
         throw new RuntimeException("j_r" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
