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

public class wmo extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public wmo() {
      long var1 = a ^ 69949123266139L;
      super(a<"s">(7692, 8599457071411445805L ^ var1), a<"s">(6738, 2435836844569740402L ^ var1));
      this.m9p = 4.4;
      this.wtp = 1;
      this.trv = 0.1873;
   }

   @Override
   public void w4v() {
      super.w4v();
      this.wtp = 1;
      this.trv = 0.1873;
      this.qb1 = false;
   }

   @Override
   public void i__() {
      super.i__();
      this.wyl.gze.qeu = 1.0F;
      this.trv = 0.1873;
      this.tgl = 0.0;
      this.wtp = 4;
      this.qb1 = false;
   }

   @jev
   public void gny(_qa param1) {
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
      // 005: getfield wmo.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getfield l86.kfp D
      // 00e: aload 0
      // 00f: getfield wmo.wyl Lc05;
      // 012: getfield c05.vg8 Ll86;
      // 015: getfield l86.kfp D
      // 018: d2i
      // 019: i2d
      // 01a: dsub
      // 01b: bipush 3
      // 01c: invokestatic rak.meb (DI)D
      // 01f: ldc2_w 0.41
      // 022: bipush 3
      // 023: invokestatic rak.meb (DI)D
      // 026: dcmpl
      // 027: iload 2
      // 028: ifeq 053
      // 02b: ifne 047
      // 02e: goto 035
      // 031: invokestatic wmo.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: getfield wmo.wyl Lc05;
      // 039: getfield c05.vg8 Ll86;
      // 03c: dconst_0
      // 03d: putfield l86.mop D
      // 040: goto 047
      // 043: invokestatic wmo.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield wmo.wyl Lc05;
      // 04b: getfield c05.vg8 Ll86;
      // 04e: getfield l86.z66 F
      // 051: fconst_0
      // 052: fcmpg
      // 053: iload 2
      // 054: ifeq 0b1
      // 057: ifge 08e
      // 05a: goto 061
      // 05d: invokestatic wmo.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield wmo.wyl Lc05;
      // 065: getfield c05.vg8 Ll86;
      // 068: getfield l86.ooc F
      // 06b: fconst_0
      // 06c: fcmpg
      // 06d: iload 2
      // 06e: ifeq 0b1
      // 071: goto 078
      // 074: invokestatic wmo.a (Loov;)Loov;
      // 077: athrow
      // 078: ifge 08e
      // 07b: goto 082
      // 07e: invokestatic wmo.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: bipush 1
      // 084: putfield wmo.wtp I
      // 087: goto 08e
      // 08a: invokestatic wmo.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield wmo.wyl Lc05;
      // 092: getfield c05.vg8 Ll86;
      // 095: getfield l86.kfp D
      // 098: aload 0
      // 099: getfield wmo.wyl Lc05;
      // 09c: getfield c05.vg8 Ll86;
      // 09f: getfield l86.kfp D
      // 0a2: d2i
      // 0a3: i2d
      // 0a4: dsub
      // 0a5: bipush 3
      // 0a6: invokestatic rak.b5b (DI)D
      // 0a9: ldc2_w 0.943
      // 0ac: bipush 3
      // 0ad: invokestatic rak.b5b (DI)D
      // 0b0: dcmpl
      // 0b1: iload 2
      // 0b2: ifeq 0d5
      // 0b5: ifne 0d1
      // 0b8: goto 0bf
      // 0bb: invokestatic wmo.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield wmo.wyl Lc05;
      // 0c3: getfield c05.vg8 Ll86;
      // 0c6: dconst_0
      // 0c7: putfield l86.mop D
      // 0ca: goto 0d1
      // 0cd: invokestatic wmo.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield wmo.wtp I
      // 0d5: bipush 1
      // 0d6: iload 2
      // 0d7: ifeq 171
      // 0da: if_icmpne 165
      // 0dd: goto 0e4
      // 0e0: invokestatic wmo.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield wmo.wyl Lc05;
      // 0e8: getfield c05.vg8 Ll86;
      // 0eb: getfield l86.ooc F
      // 0ee: fconst_0
      // 0ef: fcmpl
      // 0f0: iload 2
      // 0f1: ifeq 137
      // 0f4: goto 0fb
      // 0f7: invokestatic wmo.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: ifne 126
      // 0fe: goto 105
      // 101: invokestatic wmo.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: getfield wmo.wyl Lc05;
      // 109: getfield c05.vg8 Ll86;
      // 10c: getfield l86.z66 F
      // 10f: fconst_0
      // 110: fcmpl
      // 111: iload 2
      // 112: ifeq 170
      // 115: goto 11c
      // 118: invokestatic wmo.a (Loov;)Loov;
      // 11b: athrow
      // 11c: ifeq 165
      // 11f: goto 126
      // 122: invokestatic wmo.a (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: getfield wmo.wyl Lc05;
      // 12a: getfield c05.vg8 Ll86;
      // 12d: getfield l86.fcv Z
      // 130: goto 137
      // 133: invokestatic wmo.a (Loov;)Loov;
      // 136: athrow
      // 137: iload 2
      // 138: ifeq 170
      // 13b: ifeq 165
      // 13e: goto 145
      // 141: invokestatic wmo.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 0
      // 146: bipush 2
      // 147: putfield wmo.wtp I
      // 14a: aload 0
      // 14b: aload 0
      // 14c: getfield wmo.m9p D
      // 14f: ldc2_w 0.1873
      // 152: dmul
      // 153: ldc2_w 0.01
      // 156: dsub
      // 157: putfield wmo.trv D
      // 15a: iload 2
      // 15b: ifne 2ec
      // 15e: goto 165
      // 161: invokestatic wmo.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 0
      // 166: getfield wmo.wtp I
      // 169: goto 170
      // 16c: invokestatic wmo.a (Loov;)Loov;
      // 16f: athrow
      // 170: bipush 2
      // 171: iload 2
      // 172: ifeq 1c0
      // 175: if_icmpne 1b4
      // 178: goto 17f
      // 17b: invokestatic wmo.a (Loov;)Loov;
      // 17e: athrow
      // 17f: aload 0
      // 180: bipush 3
      // 181: putfield wmo.wtp I
      // 184: aload 0
      // 185: getfield wmo.wyl Lc05;
      // 188: getfield c05.vg8 Ll86;
      // 18b: ldc2_w 0.399
      // 18e: putfield l86.mop D
      // 191: aload 1
      // 192: ldc2_w 0.399
      // 195: putfield _qa.wam D
      // 198: aload 0
      // 199: dup
      // 19a: getfield wmo.trv D
      // 19d: ldc2_w 2.149802
      // 1a0: dmul
      // 1a1: putfield wmo.trv D
      // 1a4: aload 0
      // 1a5: bipush 1
      // 1a6: putfield wmo.qb1 Z
      // 1a9: iload 2
      // 1aa: ifne 2ec
      // 1ad: goto 1b4
      // 1b0: invokestatic wmo.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: getfield wmo.wtp I
      // 1b8: bipush 3
      // 1b9: goto 1c0
      // 1bc: invokestatic wmo.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: iload 2
      // 1c1: ifeq 205
      // 1c4: if_icmpne 1ee
      // 1c7: goto 1ce
      // 1ca: invokestatic wmo.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: bipush 4
      // 1d0: putfield wmo.wtp I
      // 1d3: ldc2_w 0.66
      // 1d6: aload 0
      // 1d7: getfield wmo.tgl D
      // 1da: ldc2_w 0.1873
      // 1dd: dsub
      // 1de: dmul
      // 1df: dstore 3
      // 1e0: aload 0
      // 1e1: aload 0
      // 1e2: getfield wmo.tgl D
      // 1e5: dload 3
      // 1e6: dsub
      // 1e7: putfield wmo.trv D
      // 1ea: iload 2
      // 1eb: ifne 2ec
      // 1ee: aload 0
      // 1ef: iload 2
      // 1f0: ifeq 2ed
      // 1f3: goto 1fa
      // 1f6: invokestatic wmo.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: getfield wmo.wtp I
      // 1fd: bipush 4
      // 1fe: goto 205
      // 201: invokestatic wmo.a (Loov;)Loov;
      // 204: athrow
      // 205: if_icmpne 2ec
      // 208: aload 0
      // 209: aload 0
      // 20a: getfield wmo.tgl D
      // 20d: aload 0
      // 20e: getfield wmo.tgl D
      // 211: ldc2_w 159.0
      // 214: ddiv
      // 215: dsub
      // 216: putfield wmo.trv D
      // 219: aload 0
      // 21a: getfield wmo.wyl Lc05;
      // 21d: getfield c05.tij Lkh3;
      // 220: aload 0
      // 221: getfield wmo.wyl Lc05;
      // 224: getfield c05.vg8 Ll86;
      // 227: aload 0
      // 228: getfield wmo.wyl Lc05;
      // 22b: getfield c05.vg8 Ll86;
      // 22e: invokevirtual l86.aaw ()Lnh4;
      // 231: dconst_0
      // 232: aload 0
      // 233: getfield wmo.wyl Lc05;
      // 236: getfield c05.vg8 Ll86;
      // 239: getfield l86.mop D
      // 23c: dconst_0
      // 23d: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 240: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 243: invokeinterface java/util/List.size ()I 1
      // 248: iload 2
      // 249: ifeq 291
      // 24c: goto 253
      // 24f: invokestatic wmo.a (Loov;)Loov;
      // 252: athrow
      // 253: ifgt 27c
      // 256: goto 25d
      // 259: invokestatic wmo.a (Loov;)Loov;
      // 25c: athrow
      // 25d: aload 0
      // 25e: getfield wmo.wyl Lc05;
      // 261: getfield c05.vg8 Ll86;
      // 264: getfield l86.fcv Z
      // 267: iload 2
      // 268: ifeq 2d6
      // 26b: goto 272
      // 26e: invokestatic wmo.a (Loov;)Loov;
      // 271: athrow
      // 272: ifeq 2c5
      // 275: goto 27c
      // 278: invokestatic wmo.a (Loov;)Loov;
      // 27b: athrow
      // 27c: aload 0
      // 27d: bipush 1
      // 27e: putfield wmo.wtp I
      // 281: getstatic iri.o89 Lcn7;
      // 284: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 287: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 28a: goto 291
      // 28d: invokestatic wmo.a (Loov;)Loov;
      // 290: athrow
      // 291: iload 2
      // 292: ifeq 2d6
      // 295: ifeq 2c5
      // 298: goto 29f
      // 29b: invokestatic wmo.a (Loov;)Loov;
      // 29e: athrow
      // 29f: aload 0
      // 2a0: getfield wmo.qb1 Z
      // 2a3: iload 2
      // 2a4: ifeq 2d6
      // 2a7: goto 2ae
      // 2aa: invokestatic wmo.a (Loov;)Loov;
      // 2ad: athrow
      // 2ae: ifeq 2c5
      // 2b1: goto 2b8
      // 2b4: invokestatic wmo.a (Loov;)Loov;
      // 2b7: athrow
      // 2b8: getstatic kgt.ce6 Liri;
      // 2bb: invokevirtual iri.tp_ ()V
      // 2be: goto 2c5
      // 2c1: invokestatic wmo.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: aload 1
      // 2c6: iload 2
      // 2c7: ifeq 2fb
      // 2ca: getfield _qa.wam D
      // 2cd: dconst_0
      // 2ce: dcmpg
      // 2cf: goto 2d6
      // 2d2: invokestatic wmo.a (Loov;)Loov;
      // 2d5: athrow
      // 2d6: ifge 2ec
      // 2d9: aload 1
      // 2da: dup
      // 2db: getfield _qa.wam D
      // 2de: ldc2_w 0.7
      // 2e1: dmul
      // 2e2: putfield _qa.wam D
      // 2e5: goto 2ec
      // 2e8: invokestatic wmo.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: aload 0
      // 2ed: aload 0
      // 2ee: getfield wmo.trv D
      // 2f1: ldc2_w 0.1873
      // 2f4: invokestatic java/lang/Math.max (DD)D
      // 2f7: putfield wmo.trv D
      // 2fa: aload 1
      // 2fb: aload 0
      // 2fc: getfield wmo.trv D
      // 2ff: invokestatic ohv.qjs (L_qa;D)V
      // 302: return
   }

   @jev
   public void f9s(q8e var1) {
      double var2 = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
      double var4 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
      this.tgl = Math.sqrt(var2 * var2 + var4 * var4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1904110933607070576L, -5747449690540518966L, MethodHandles.lookup().lookupClass()).a(171819296725722L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100666118479862L;
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
      String var6 = "¥dÐ>ñ\u0089iÇGïÏ%®L3\u0080Ä\u001cÇrä\u0098ËÇ\u0091ÕST8\\úÕ\u0010\u007fÕ¤Zy/\u009aõ\u0080\u001a²òN$Ôr";
      int var8 = "¥dÐ>ñ\u0089iÇGïÏ%®L3\u0080Ä\u001cÇrä\u0098ËÇ\u0091ÕST8\\úÕ\u0010\u007fÕ¤Zy/\u009aõ\u0080\u001a²òN$Ôr".length();
      char var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16830;
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
            throw new RuntimeException("wmo", var10);
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
         throw new RuntimeException("wmo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
