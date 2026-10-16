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

public class llv extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public llv() {
      long var1 = a ^ 31855702067400L;
      super(a<"c">(28167, 3347586282276060370L ^ var1), a<"c">(14938, 4035003154637465742L ^ var1));
      this.oit = 1.48;
      this.tx_ = new nhs();
   }

   @Override
   public void w4v() {
      super.w4v();
      this.wyl.vg8.nr7 = 0.0F;
      this.wyl.gze.qeu = 1.0F;
      this.drj = 0.0;
      this.vi4 = 0;
      this.c18 = 0.0;
   }

   @Override
   public void i__() {
      super.i__();
      this.wyl.gze.qeu = 1.0F;
      this.c18 = ohv.reg();
      this.wyl.vg8.nr7 = 0.6F;
   }

   @jev
   public void tux(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield llv.wyl Lc05;
      // 08: iload 2
      // 09: ifne 53
      // 0c: getfield c05.vg8 Ll86;
      // 0f: invokevirtual l86.mwv ()Z
      // 12: ifne 48
      // 15: goto 1c
      // 18: invokestatic llv.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield llv.wyl Lc05;
      // 20: iload 2
      // 21: ifne 53
      // 24: goto 2b
      // 27: invokestatic llv.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield c05.vg8 Ll86;
      // 2e: invokevirtual l86.b2u ()Z
      // 31: ifne 48
      // 34: goto 3b
      // 37: invokestatic llv.a (Loov;)Loov;
      // 3a: athrow
      // 3b: invokestatic bk4.m2x ()Z
      // 3e: ifeq 60
      // 41: goto 48
      // 44: invokestatic llv.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield llv.wyl Lc05;
      // 4c: goto 53
      // 4f: invokestatic llv.a (Loov;)Loov;
      // 52: athrow
      // 53: getfield c05.gze Laba;
      // 56: fconst_1
      // 57: putfield aba.qeu F
      // 5a: aload 0
      // 5b: dconst_0
      // 5c: putfield llv.drj D
      // 5f: return
      // 60: aload 0
      // 61: getfield llv.wyl Lc05;
      // 64: getfield c05.vg8 Ll86;
      // 67: getfield l86.o2v D
      // 6a: aload 0
      // 6b: getfield llv.wyl Lc05;
      // 6e: getfield c05.vg8 Ll86;
      // 71: getfield l86.bc1 D
      // 74: dsub
      // 75: dstore 3
      // 76: aload 0
      // 77: getfield llv.wyl Lc05;
      // 7a: getfield c05.vg8 Ll86;
      // 7d: getfield l86.vbd D
      // 80: aload 0
      // 81: getfield llv.wyl Lc05;
      // 84: getfield c05.vg8 Ll86;
      // 87: getfield l86.a4d D
      // 8a: dsub
      // 8b: dstore 5
      // 8d: aload 0
      // 8e: dload 3
      // 8f: dload 3
      // 90: dmul
      // 91: dload 5
      // 93: dload 5
      // 95: dmul
      // 96: dadd
      // 97: invokestatic java/lang/Math.sqrt (D)D
      // 9a: putfield llv.drj D
      // 9d: return
   }

   @jev
   public void _58(_qa param1) {
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
      // 005: getfield llv.wyl Lc05;
      // 008: iload 2
      // 009: ifeq 068
      // 00c: getfield c05.vg8 Ll86;
      // 00f: invokevirtual l86.mwv ()Z
      // 012: ifne 05d
      // 015: goto 01c
      // 018: invokestatic llv.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield llv.wyl Lc05;
      // 020: iload 2
      // 021: ifeq 068
      // 024: goto 02b
      // 027: invokestatic llv.a (Loov;)Loov;
      // 02a: athrow
      // 02b: getfield c05.vg8 Ll86;
      // 02e: invokevirtual l86.b2u ()Z
      // 031: ifne 05d
      // 034: goto 03b
      // 037: invokestatic llv.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield llv.wyl Lc05;
      // 03f: getfield c05.vg8 Ll86;
      // 042: getfield l86.lls Lpj2;
      // 045: getfield pj2.wzx Z
      // 048: iload 2
      // 049: ifeq 07a
      // 04c: goto 053
      // 04f: invokestatic llv.a (Loov;)Loov;
      // 052: athrow
      // 053: ifeq 070
      // 056: goto 05d
      // 059: invokestatic llv.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield llv.wyl Lc05;
      // 061: goto 068
      // 064: invokestatic llv.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield c05.gze Laba;
      // 06b: fconst_1
      // 06c: putfield aba.qeu F
      // 06f: return
      // 070: aload 0
      // 071: getfield llv.wyl Lc05;
      // 074: getfield c05.vg8 Ll86;
      // 077: getfield l86.lfk Z
      // 07a: iload 2
      // 07b: ifeq 0c2
      // 07e: ifeq 0be
      // 081: goto 088
      // 084: invokestatic llv.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: getfield llv.wyl Lc05;
      // 08c: getfield c05.vg8 Ll86;
      // 08f: getfield l86.fcv Z
      // 092: iload 2
      // 093: ifeq 0c2
      // 096: goto 09d
      // 099: invokestatic llv.a (Loov;)Loov;
      // 09c: athrow
      // 09d: ifeq 0be
      // 0a0: goto 0a7
      // 0a3: invokestatic llv.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: bipush 2
      // 0a9: putfield llv.vi4 I
      // 0ac: aload 0
      // 0ad: getfield llv.wyl Lc05;
      // 0b0: getfield c05.gze Laba;
      // 0b3: fconst_1
      // 0b4: putfield aba.qeu F
      // 0b7: goto 0be
      // 0ba: invokestatic llv.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield llv.vi4 I
      // 0c2: bipush 2
      // 0c3: iload 2
      // 0c4: ifeq 12a
      // 0c7: if_icmpne 113
      // 0ca: goto 0d1
      // 0cd: invokestatic llv.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield llv.wyl Lc05;
      // 0d5: getfield c05.vg8 Ll86;
      // 0d8: getfield l86.ooc F
      // 0db: fconst_0
      // 0dc: fcmpl
      // 0dd: iload 2
      // 0de: ifeq 20c
      // 0e1: goto 0e8
      // 0e4: invokestatic llv.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: ifne 1f0
      // 0eb: goto 0f2
      // 0ee: invokestatic llv.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield llv.wyl Lc05;
      // 0f6: getfield c05.vg8 Ll86;
      // 0f9: getfield l86.z66 F
      // 0fc: fconst_0
      // 0fd: fcmpl
      // 0fe: iload 2
      // 0ff: ifeq 20c
      // 102: goto 109
      // 105: invokestatic llv.a (Loov;)Loov;
      // 108: athrow
      // 109: ifne 1f0
      // 10c: goto 113
      // 10f: invokestatic llv.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 0
      // 114: getfield llv.vi4 I
      // 117: iload 2
      // 118: ifeq 1ad
      // 11b: goto 122
      // 11e: invokestatic llv.a (Loov;)Loov;
      // 121: athrow
      // 122: bipush 3
      // 123: goto 12a
      // 126: invokestatic llv.a (Loov;)Loov;
      // 129: athrow
      // 12a: if_icmpne 16c
      // 12d: ldc2_w 0.66
      // 130: aload 0
      // 131: getfield llv.drj D
      // 134: invokestatic ohv.reg ()D
      // 137: dsub
      // 138: dmul
      // 139: dstore 3
      // 13a: aload 0
      // 13b: aload 0
      // 13c: getfield llv.drj D
      // 13f: dload 3
      // 140: dsub
      // 141: putfield llv.c18 D
      // 144: aload 0
      // 145: iload 2
      // 146: ifeq 162
      // 149: getfield llv.c18 D
      // 14c: ldc2_w 0.3
      // 14f: dcmpg
      // 150: ifge 168
      // 153: goto 15a
      // 156: invokestatic llv.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 0
      // 15b: goto 162
      // 15e: invokestatic llv.a (Loov;)Loov;
      // 161: athrow
      // 162: ldc2_w 0.3
      // 165: putfield llv.c18 D
      // 168: iload 2
      // 169: ifne 260
      // 16c: aload 0
      // 16d: iload 2
      // 16e: ifeq 1d7
      // 171: goto 178
      // 174: invokestatic llv.a (Loov;)Loov;
      // 177: athrow
      // 178: getfield llv.wyl Lc05;
      // 17b: getfield c05.tij Lkh3;
      // 17e: aload 0
      // 17f: getfield llv.wyl Lc05;
      // 182: getfield c05.vg8 Ll86;
      // 185: aload 0
      // 186: getfield llv.wyl Lc05;
      // 189: getfield c05.vg8 Ll86;
      // 18c: invokevirtual l86.aaw ()Lnh4;
      // 18f: dconst_0
      // 190: aload 0
      // 191: getfield llv.wyl Lc05;
      // 194: getfield c05.vg8 Ll86;
      // 197: getfield l86.mop D
      // 19a: dconst_0
      // 19b: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 19e: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 1a1: invokeinterface java/util/List.size ()I 1
      // 1a6: goto 1ad
      // 1a9: invokestatic llv.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: ifgt 1cf
      // 1b0: aload 0
      // 1b1: iload 2
      // 1b2: ifeq 1dc
      // 1b5: goto 1bc
      // 1b8: invokestatic llv.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: getfield llv.wyl Lc05;
      // 1bf: getfield c05.vg8 Ll86;
      // 1c2: getfield l86.lfk Z
      // 1c5: ifeq 1db
      // 1c8: goto 1cf
      // 1cb: invokestatic llv.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: goto 1d7
      // 1d3: invokestatic llv.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: bipush 1
      // 1d8: putfield llv.vi4 I
      // 1db: aload 0
      // 1dc: aload 0
      // 1dd: getfield llv.drj D
      // 1e0: aload 0
      // 1e1: getfield llv.drj D
      // 1e4: ldc2_w 159.0
      // 1e7: ddiv
      // 1e8: dsub
      // 1e9: putfield llv.c18 D
      // 1ec: iload 2
      // 1ed: ifne 260
      // 1f0: aload 0
      // 1f1: iload 2
      // 1f2: ifeq 277
      // 1f5: goto 1fc
      // 1f8: invokestatic llv.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: getfield llv.wyl Lc05;
      // 1ff: getfield c05.vg8 Ll86;
      // 202: getfield l86.lfk Z
      // 205: goto 20c
      // 208: invokestatic llv.a (Loov;)Loov;
      // 20b: athrow
      // 20c: ifeq 260
      // 20f: aload 0
      // 210: iload 2
      // 211: ifeq 277
      // 214: goto 21b
      // 217: invokestatic llv.a (Loov;)Loov;
      // 21a: athrow
      // 21b: getfield llv.wyl Lc05;
      // 21e: getfield c05.vg8 Ll86;
      // 221: getfield l86.fcv Z
      // 224: ifeq 260
      // 227: goto 22e
      // 22a: invokestatic llv.a (Loov;)Loov;
      // 22d: athrow
      // 22e: aload 1
      // 22f: aload 0
      // 230: getfield llv.wyl Lc05;
      // 233: getfield c05.vg8 Ll86;
      // 236: ldc2_w 0.42
      // 239: dup2_x1
      // 23a: putfield l86.mop D
      // 23d: invokevirtual _qa.ziq (D)V
      // 240: aload 0
      // 241: dup
      // 242: getfield llv.c18 D
      // 245: ldc2_w 1.48
      // 248: dmul
      // 249: putfield llv.c18 D
      // 24c: aload 0
      // 24d: getfield llv.wyl Lc05;
      // 250: getfield c05.gze Laba;
      // 253: ldc 1.06
      // 255: nop
      // 256: putfield aba.qeu F
      // 259: goto 260
      // 25c: invokestatic llv.a (Loov;)Loov;
      // 25f: athrow
      // 260: aload 0
      // 261: aload 0
      // 262: getfield llv.c18 D
      // 265: invokestatic ohv.reg ()D
      // 268: invokestatic java/lang/Math.max (DD)D
      // 26b: putfield llv.c18 D
      // 26e: aload 1
      // 26f: aload 0
      // 270: getfield llv.c18 D
      // 273: invokestatic ohv.qjs (L_qa;D)V
      // 276: aload 0
      // 277: dup
      // 278: getfield llv.vi4 I
      // 27b: bipush 1
      // 27c: iadd
      // 27d: putfield llv.vi4 I
      // 280: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6687460946665324094L, 6582070601621290966L, MethodHandles.lookup().lookupClass()).a(29990782049155L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 82967368212613L;
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
      String var6 = "Ër|\u0099Êg¿£öJ\r\u001f\u0096X½2\u0010\u000f\u009bô\u0098ñÉH\u008e\u0015\u0014MÍLn\u001d¬";
      int var8 = "Ër|\u0099Êg¿£öJ\r\u001f\u0096X½2\u0010\u000f\u009bô\u0098ñÉH\u008e\u0015\u0014MÍLn\u001d¬".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12188;
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
            throw new RuntimeException("llv", var10);
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
         throw new RuntimeException("llv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
