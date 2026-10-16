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

public class f2j extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public f2j() {
      long var1 = a ^ 15413171054747L;
      super(a<"m">(7414, 8319308266965295869L ^ var1), a<"m">(5126, 5973469936556042764L ^ var1));
      this.jwd = 6.5;
      this.fbt = 1;
      this.le4 = 0.1873;
   }

   @Override
   public void w4v() {
      super.w4v();
      this.fbt = 1;
      this.le4 = 0.1873;
      this.hsi = false;
      this.wyl.z8v().qeu = 1.0F;
   }

   @Override
   public void i__() {
      super.i__();
      this.wyl.gze.qeu = 1.0F;
      this.le4 = 0.1873;
      this.c9d = 0.0;
      this.fbt = 4;
      this.hsi = false;
      this.wyl.z8v().qeu = 1.0F;
   }

   @jev
   public void qs5(_qa param1) {
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
      // 005: getfield f2j.wyl Lc05;
      // 008: invokevirtual c05.z8v ()Laba;
      // 00b: fconst_1
      // 00c: putfield aba.qeu F
      // 00f: aload 0
      // 010: getfield f2j.wyl Lc05;
      // 013: getfield c05.vg8 Ll86;
      // 016: getfield l86.kfp D
      // 019: aload 0
      // 01a: getfield f2j.wyl Lc05;
      // 01d: getfield c05.vg8 Ll86;
      // 020: getfield l86.kfp D
      // 023: d2i
      // 024: i2d
      // 025: dsub
      // 026: bipush 3
      // 027: invokestatic rak.meb (DI)D
      // 02a: ldc2_w 0.41
      // 02d: bipush 3
      // 02e: invokestatic rak.meb (DI)D
      // 031: dcmpl
      // 032: iload 2
      // 033: ifeq 05e
      // 036: ifne 052
      // 039: goto 040
      // 03c: invokestatic f2j.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield f2j.wyl Lc05;
      // 044: getfield c05.vg8 Ll86;
      // 047: dconst_0
      // 048: putfield l86.mop D
      // 04b: goto 052
      // 04e: invokestatic f2j.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: getfield f2j.wyl Lc05;
      // 056: getfield c05.vg8 Ll86;
      // 059: getfield l86.z66 F
      // 05c: fconst_0
      // 05d: fcmpg
      // 05e: iload 2
      // 05f: ifeq 0bc
      // 062: ifge 099
      // 065: goto 06c
      // 068: invokestatic f2j.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: getfield f2j.wyl Lc05;
      // 070: getfield c05.vg8 Ll86;
      // 073: getfield l86.ooc F
      // 076: fconst_0
      // 077: fcmpg
      // 078: iload 2
      // 079: ifeq 0bc
      // 07c: goto 083
      // 07f: invokestatic f2j.a (Loov;)Loov;
      // 082: athrow
      // 083: ifge 099
      // 086: goto 08d
      // 089: invokestatic f2j.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: bipush 1
      // 08f: putfield f2j.fbt I
      // 092: goto 099
      // 095: invokestatic f2j.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield f2j.wyl Lc05;
      // 09d: getfield c05.vg8 Ll86;
      // 0a0: getfield l86.kfp D
      // 0a3: aload 0
      // 0a4: getfield f2j.wyl Lc05;
      // 0a7: getfield c05.vg8 Ll86;
      // 0aa: getfield l86.kfp D
      // 0ad: d2i
      // 0ae: i2d
      // 0af: dsub
      // 0b0: bipush 3
      // 0b1: invokestatic rak.b5b (DI)D
      // 0b4: ldc2_w 0.943
      // 0b7: bipush 3
      // 0b8: invokestatic rak.b5b (DI)D
      // 0bb: dcmpl
      // 0bc: iload 2
      // 0bd: ifeq 0e0
      // 0c0: ifne 0dc
      // 0c3: goto 0ca
      // 0c6: invokestatic f2j.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield f2j.wyl Lc05;
      // 0ce: getfield c05.vg8 Ll86;
      // 0d1: dconst_0
      // 0d2: putfield l86.mop D
      // 0d5: goto 0dc
      // 0d8: invokestatic f2j.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: getfield f2j.fbt I
      // 0e0: bipush 1
      // 0e1: iload 2
      // 0e2: ifeq 199
      // 0e5: if_icmpne 18d
      // 0e8: goto 0ef
      // 0eb: invokestatic f2j.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield f2j.wyl Lc05;
      // 0f3: getfield c05.vg8 Ll86;
      // 0f6: getfield l86.ooc F
      // 0f9: fconst_0
      // 0fa: fcmpl
      // 0fb: iload 2
      // 0fc: ifeq 142
      // 0ff: goto 106
      // 102: invokestatic f2j.a (Loov;)Loov;
      // 105: athrow
      // 106: ifne 131
      // 109: goto 110
      // 10c: invokestatic f2j.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield f2j.wyl Lc05;
      // 114: getfield c05.vg8 Ll86;
      // 117: getfield l86.z66 F
      // 11a: fconst_0
      // 11b: fcmpl
      // 11c: iload 2
      // 11d: ifeq 198
      // 120: goto 127
      // 123: invokestatic f2j.a (Loov;)Loov;
      // 126: athrow
      // 127: ifeq 18d
      // 12a: goto 131
      // 12d: invokestatic f2j.a (Loov;)Loov;
      // 130: athrow
      // 131: aload 0
      // 132: getfield f2j.wyl Lc05;
      // 135: getfield c05.vg8 Ll86;
      // 138: getfield l86.fcv Z
      // 13b: goto 142
      // 13e: invokestatic f2j.a (Loov;)Loov;
      // 141: athrow
      // 142: iload 2
      // 143: ifeq 198
      // 146: ifeq 18d
      // 149: goto 150
      // 14c: invokestatic f2j.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 0
      // 151: bipush 2
      // 152: putfield f2j.fbt I
      // 155: aload 0
      // 156: aload 0
      // 157: getfield f2j.jwd D
      // 15a: ldc2_w 0.1873
      // 15d: dmul
      // 15e: ldc2_w 0.01
      // 161: dsub
      // 162: putfield f2j.le4 D
      // 165: aload 0
      // 166: getfield f2j.wyl Lc05;
      // 169: invokevirtual c05.z8v ()Laba;
      // 16c: ldc 0.1
      // 16e: nop
      // 16f: putfield aba.qeu F
      // 172: bipush 70
      // 174: invokestatic opd.de2 (I)V
      // 177: aload 0
      // 178: getfield f2j.wyl Lc05;
      // 17b: invokevirtual c05.z8v ()Laba;
      // 17e: fconst_1
      // 17f: putfield aba.qeu F
      // 182: iload 2
      // 183: ifne 314
      // 186: goto 18d
      // 189: invokestatic f2j.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield f2j.fbt I
      // 191: goto 198
      // 194: invokestatic f2j.a (Loov;)Loov;
      // 197: athrow
      // 198: bipush 2
      // 199: iload 2
      // 19a: ifeq 1e8
      // 19d: if_icmpne 1dc
      // 1a0: goto 1a7
      // 1a3: invokestatic f2j.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: aload 0
      // 1a8: bipush 3
      // 1a9: putfield f2j.fbt I
      // 1ac: aload 0
      // 1ad: getfield f2j.wyl Lc05;
      // 1b0: getfield c05.vg8 Ll86;
      // 1b3: ldc2_w 0.399
      // 1b6: putfield l86.mop D
      // 1b9: aload 1
      // 1ba: ldc2_w 0.399
      // 1bd: putfield _qa.wam D
      // 1c0: aload 0
      // 1c1: dup
      // 1c2: getfield f2j.le4 D
      // 1c5: ldc2_w 2.149802
      // 1c8: dmul
      // 1c9: putfield f2j.le4 D
      // 1cc: aload 0
      // 1cd: bipush 1
      // 1ce: putfield f2j.hsi Z
      // 1d1: iload 2
      // 1d2: ifne 314
      // 1d5: goto 1dc
      // 1d8: invokestatic f2j.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: getfield f2j.fbt I
      // 1e0: bipush 3
      // 1e1: goto 1e8
      // 1e4: invokestatic f2j.a (Loov;)Loov;
      // 1e7: athrow
      // 1e8: iload 2
      // 1e9: ifeq 22d
      // 1ec: if_icmpne 216
      // 1ef: goto 1f6
      // 1f2: invokestatic f2j.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: bipush 4
      // 1f8: putfield f2j.fbt I
      // 1fb: ldc2_w 0.66
      // 1fe: aload 0
      // 1ff: getfield f2j.c9d D
      // 202: ldc2_w 0.1873
      // 205: dsub
      // 206: dmul
      // 207: dstore 3
      // 208: aload 0
      // 209: aload 0
      // 20a: getfield f2j.c9d D
      // 20d: dload 3
      // 20e: dsub
      // 20f: putfield f2j.le4 D
      // 212: iload 2
      // 213: ifne 314
      // 216: aload 0
      // 217: iload 2
      // 218: ifeq 315
      // 21b: goto 222
      // 21e: invokestatic f2j.a (Loov;)Loov;
      // 221: athrow
      // 222: getfield f2j.fbt I
      // 225: bipush 4
      // 226: goto 22d
      // 229: invokestatic f2j.a (Loov;)Loov;
      // 22c: athrow
      // 22d: if_icmpne 314
      // 230: aload 0
      // 231: aload 0
      // 232: getfield f2j.c9d D
      // 235: aload 0
      // 236: getfield f2j.c9d D
      // 239: ldc2_w 159.0
      // 23c: ddiv
      // 23d: dsub
      // 23e: putfield f2j.le4 D
      // 241: aload 0
      // 242: getfield f2j.wyl Lc05;
      // 245: getfield c05.tij Lkh3;
      // 248: aload 0
      // 249: getfield f2j.wyl Lc05;
      // 24c: getfield c05.vg8 Ll86;
      // 24f: aload 0
      // 250: getfield f2j.wyl Lc05;
      // 253: getfield c05.vg8 Ll86;
      // 256: invokevirtual l86.aaw ()Lnh4;
      // 259: dconst_0
      // 25a: aload 0
      // 25b: getfield f2j.wyl Lc05;
      // 25e: getfield c05.vg8 Ll86;
      // 261: getfield l86.mop D
      // 264: dconst_0
      // 265: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 268: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 26b: invokeinterface java/util/List.size ()I 1
      // 270: iload 2
      // 271: ifeq 2b9
      // 274: goto 27b
      // 277: invokestatic f2j.a (Loov;)Loov;
      // 27a: athrow
      // 27b: ifgt 2a4
      // 27e: goto 285
      // 281: invokestatic f2j.a (Loov;)Loov;
      // 284: athrow
      // 285: aload 0
      // 286: iload 2
      // 287: ifeq 315
      // 28a: goto 291
      // 28d: invokestatic f2j.a (Loov;)Loov;
      // 290: athrow
      // 291: getfield f2j.wyl Lc05;
      // 294: getfield c05.vg8 Ll86;
      // 297: getfield l86.fcv Z
      // 29a: ifeq 314
      // 29d: goto 2a4
      // 2a0: invokestatic f2j.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: aload 0
      // 2a5: bipush 1
      // 2a6: putfield f2j.fbt I
      // 2a9: getstatic iri.o89 Lcn7;
      // 2ac: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 2af: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b2: goto 2b9
      // 2b5: invokestatic f2j.a (Loov;)Loov;
      // 2b8: athrow
      // 2b9: iload 2
      // 2ba: ifeq 2fe
      // 2bd: ifeq 2ed
      // 2c0: goto 2c7
      // 2c3: invokestatic f2j.a (Loov;)Loov;
      // 2c6: athrow
      // 2c7: aload 0
      // 2c8: getfield f2j.hsi Z
      // 2cb: iload 2
      // 2cc: ifeq 2fe
      // 2cf: goto 2d6
      // 2d2: invokestatic f2j.a (Loov;)Loov;
      // 2d5: athrow
      // 2d6: ifeq 2ed
      // 2d9: goto 2e0
      // 2dc: invokestatic f2j.a (Loov;)Loov;
      // 2df: athrow
      // 2e0: getstatic kgt.ce6 Liri;
      // 2e3: invokevirtual iri.tp_ ()V
      // 2e6: goto 2ed
      // 2e9: invokestatic f2j.a (Loov;)Loov;
      // 2ec: athrow
      // 2ed: aload 1
      // 2ee: iload 2
      // 2ef: ifeq 323
      // 2f2: getfield _qa.wam D
      // 2f5: dconst_0
      // 2f6: dcmpg
      // 2f7: goto 2fe
      // 2fa: invokestatic f2j.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: ifge 314
      // 301: aload 1
      // 302: dup
      // 303: getfield _qa.wam D
      // 306: ldc2_w 0.2
      // 309: dmul
      // 30a: putfield _qa.wam D
      // 30d: goto 314
      // 310: invokestatic f2j.a (Loov;)Loov;
      // 313: athrow
      // 314: aload 0
      // 315: aload 0
      // 316: getfield f2j.le4 D
      // 319: ldc2_w 0.1873
      // 31c: invokestatic java/lang/Math.max (DD)D
      // 31f: putfield f2j.le4 D
      // 322: aload 1
      // 323: aload 0
      // 324: getfield f2j.le4 D
      // 327: invokestatic ohv.qjs (L_qa;D)V
      // 32a: return
   }

   @jev
   public void mb9(q8e var1) {
      double var2 = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
      double var4 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
      this.c9d = Math.sqrt(var2 * var2 + var4 * var4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(395415027277346707L, 2306066043379857992L, MethodHandles.lookup().lookupClass()).a(24342971044657L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 43553507734293L;
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
      String var6 = "e;\u009aÅ2è\u008cÙ2%Xj5\u0016$! 0:Íénù\"\u009b<MQå\u001dÅ\u00adÜSô\u0006\u009duâÕ\u0087Y\u000e\u000b%Äó\u009c\u008a";
      int var8 = "e;\u009aÅ2è\u008cÙ2%Xj5\u0016$! 0:Íénù\"\u009b<MQå\u001dÅ\u00adÜSô\u0006\u009duâÕ\u0087Y\u000e\u000b%Äó\u009c\u008a".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3911;
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
            throw new RuntimeException("f2j", var10);
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
         throw new RuntimeException("f2j" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
