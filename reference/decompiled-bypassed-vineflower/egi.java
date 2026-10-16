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

public class egi extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public egi() {
      long var1 = a ^ 100758571969940L;
      super(a<"v">(7577, 5360117521940145861L ^ var1), a<"v">(18468, 5966470716269245305L ^ var1));
      this.c4c = 2.1;
   }

   @Override
   public void w4v() {
      super.w4v();
      this.wyl.gze.qeu = 1.0F;
      this.tn6 = 0.0;
      this.b3a = 2;
      this.vke = 0.0;
   }

   @Override
   public void i__() {
      super.i__();
      this.wyl.gze.qeu = 1.0F;
      this.vke = ohv.reg();
   }

   @jev
   public void wwq(q8e param1) {
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
      // 05: getfield egi.wyl Lc05;
      // 08: iload 2
      // 09: ifeq 46
      // 0c: getfield c05.vg8 Ll86;
      // 0f: invokevirtual l86.mwv ()Z
      // 12: ifne 3b
      // 15: goto 1c
      // 18: invokestatic egi.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield egi.wyl Lc05;
      // 20: getfield c05.vg8 Ll86;
      // 23: iload 2
      // 24: ifeq 5a
      // 27: goto 2e
      // 2a: invokestatic egi.a (Loov;)Loov;
      // 2d: athrow
      // 2e: invokevirtual l86.b2u ()Z
      // 31: ifeq 53
      // 34: goto 3b
      // 37: invokestatic egi.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield egi.wyl Lc05;
      // 3f: goto 46
      // 42: invokestatic egi.a (Loov;)Loov;
      // 45: athrow
      // 46: getfield c05.gze Laba;
      // 49: fconst_1
      // 4a: putfield aba.qeu F
      // 4d: aload 0
      // 4e: dconst_0
      // 4f: putfield egi.tn6 D
      // 52: return
      // 53: aload 0
      // 54: getfield egi.wyl Lc05;
      // 57: getfield c05.vg8 Ll86;
      // 5a: getfield l86.o2v D
      // 5d: aload 0
      // 5e: getfield egi.wyl Lc05;
      // 61: getfield c05.vg8 Ll86;
      // 64: getfield l86.bc1 D
      // 67: dsub
      // 68: dstore 3
      // 69: aload 0
      // 6a: getfield egi.wyl Lc05;
      // 6d: getfield c05.vg8 Ll86;
      // 70: getfield l86.vbd D
      // 73: aload 0
      // 74: getfield egi.wyl Lc05;
      // 77: getfield c05.vg8 Ll86;
      // 7a: getfield l86.a4d D
      // 7d: dsub
      // 7e: dstore 5
      // 80: aload 0
      // 81: dload 3
      // 82: dload 3
      // 83: dmul
      // 84: dload 5
      // 86: dload 5
      // 88: dmul
      // 89: dadd
      // 8a: invokestatic java/lang/Math.sqrt (D)D
      // 8d: putfield egi.tn6 D
      // 90: return
   }

   @jev
   public void th5(_qa param1) {
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
      // 005: getfield egi.wyl Lc05;
      // 008: iload 2
      // 009: ifeq 068
      // 00c: getfield c05.vg8 Ll86;
      // 00f: invokevirtual l86.mwv ()Z
      // 012: ifne 05d
      // 015: goto 01c
      // 018: invokestatic egi.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield egi.wyl Lc05;
      // 020: iload 2
      // 021: ifeq 068
      // 024: goto 02b
      // 027: invokestatic egi.a (Loov;)Loov;
      // 02a: athrow
      // 02b: getfield c05.vg8 Ll86;
      // 02e: invokevirtual l86.b2u ()Z
      // 031: ifne 05d
      // 034: goto 03b
      // 037: invokestatic egi.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield egi.wyl Lc05;
      // 03f: getfield c05.vg8 Ll86;
      // 042: getfield l86.lls Lpj2;
      // 045: getfield pj2.wzx Z
      // 048: iload 2
      // 049: ifeq 07a
      // 04c: goto 053
      // 04f: invokestatic egi.a (Loov;)Loov;
      // 052: athrow
      // 053: ifeq 070
      // 056: goto 05d
      // 059: invokestatic egi.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield egi.wyl Lc05;
      // 061: goto 068
      // 064: invokestatic egi.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield c05.gze Laba;
      // 06b: fconst_1
      // 06c: putfield aba.qeu F
      // 06f: return
      // 070: aload 0
      // 071: getfield egi.wyl Lc05;
      // 074: getfield c05.vg8 Ll86;
      // 077: getfield l86.lfk Z
      // 07a: iload 2
      // 07b: ifeq 0e8
      // 07e: ifeq 0c5
      // 081: goto 088
      // 084: invokestatic egi.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: getfield egi.wyl Lc05;
      // 08c: getfield c05.vg8 Ll86;
      // 08f: getfield l86.fcv Z
      // 092: iload 2
      // 093: ifeq 0e8
      // 096: goto 09d
      // 099: invokestatic egi.a (Loov;)Loov;
      // 09c: athrow
      // 09d: ifeq 0c5
      // 0a0: goto 0a7
      // 0a3: invokestatic egi.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: invokestatic q0r.ibc ()D
      // 0ab: putfield egi.vke D
      // 0ae: aload 0
      // 0af: bipush 2
      // 0b0: putfield egi.b3a I
      // 0b3: aload 0
      // 0b4: getfield egi.wyl Lc05;
      // 0b7: getfield c05.gze Laba;
      // 0ba: fconst_1
      // 0bb: putfield aba.qeu F
      // 0be: goto 0c5
      // 0c1: invokestatic egi.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield egi.wyl Lc05;
      // 0c9: getfield c05.vg8 Ll86;
      // 0cc: getfield l86.kfp D
      // 0cf: aload 0
      // 0d0: getfield egi.wyl Lc05;
      // 0d3: getfield c05.vg8 Ll86;
      // 0d6: getfield l86.kfp D
      // 0d9: d2i
      // 0da: i2d
      // 0db: dsub
      // 0dc: bipush 3
      // 0dd: invokestatic rak.b5b (DI)D
      // 0e0: ldc2_w 0.138
      // 0e3: bipush 3
      // 0e4: invokestatic rak.b5b (DI)D
      // 0e7: dcmpl
      // 0e8: iload 2
      // 0e9: ifeq 12f
      // 0ec: ifne 12b
      // 0ef: goto 0f6
      // 0f2: invokestatic egi.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: getfield egi.wyl Lc05;
      // 0fa: getfield c05.vg8 Ll86;
      // 0fd: dup
      // 0fe: getfield l86.mop D
      // 101: dconst_1
      // 102: dsub
      // 103: putfield l86.mop D
      // 106: aload 1
      // 107: aload 1
      // 108: invokevirtual _qa.op7 ()D
      // 10b: ldc2_w 0.0931
      // 10e: dsub
      // 10f: invokevirtual _qa.ziq (D)V
      // 112: aload 0
      // 113: getfield egi.wyl Lc05;
      // 116: getfield c05.vg8 Ll86;
      // 119: dup
      // 11a: getfield l86.kfp D
      // 11d: ldc2_w 0.0931
      // 120: dsub
      // 121: putfield l86.kfp D
      // 124: goto 12b
      // 127: invokestatic egi.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 0
      // 12c: getfield egi.b3a I
      // 12f: bipush 2
      // 130: iload 2
      // 131: ifeq 197
      // 134: if_icmpne 180
      // 137: goto 13e
      // 13a: invokestatic egi.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: getfield egi.wyl Lc05;
      // 142: getfield c05.vg8 Ll86;
      // 145: getfield l86.ooc F
      // 148: fconst_0
      // 149: fcmpl
      // 14a: iload 2
      // 14b: ifeq 28e
      // 14e: goto 155
      // 151: invokestatic egi.a (Loov;)Loov;
      // 154: athrow
      // 155: ifne 272
      // 158: goto 15f
      // 15b: invokestatic egi.a (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield egi.wyl Lc05;
      // 163: getfield c05.vg8 Ll86;
      // 166: getfield l86.z66 F
      // 169: fconst_0
      // 16a: fcmpl
      // 16b: iload 2
      // 16c: ifeq 28e
      // 16f: goto 176
      // 172: invokestatic egi.a (Loov;)Loov;
      // 175: athrow
      // 176: ifne 272
      // 179: goto 180
      // 17c: invokestatic egi.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: getfield egi.b3a I
      // 184: iload 2
      // 185: ifeq 21a
      // 188: goto 18f
      // 18b: invokestatic egi.a (Loov;)Loov;
      // 18e: athrow
      // 18f: bipush 3
      // 190: goto 197
      // 193: invokestatic egi.a (Loov;)Loov;
      // 196: athrow
      // 197: if_icmpne 1d9
      // 19a: ldc2_w 0.66
      // 19d: aload 0
      // 19e: getfield egi.tn6 D
      // 1a1: invokestatic ohv.reg ()D
      // 1a4: dsub
      // 1a5: dmul
      // 1a6: dstore 3
      // 1a7: aload 0
      // 1a8: aload 0
      // 1a9: getfield egi.tn6 D
      // 1ac: dload 3
      // 1ad: dsub
      // 1ae: putfield egi.vke D
      // 1b1: aload 0
      // 1b2: iload 2
      // 1b3: ifeq 1cf
      // 1b6: getfield egi.vke D
      // 1b9: ldc2_w 0.3
      // 1bc: dcmpg
      // 1bd: ifge 1d5
      // 1c0: goto 1c7
      // 1c3: invokestatic egi.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: goto 1cf
      // 1cb: invokestatic egi.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: ldc2_w 0.3
      // 1d2: putfield egi.vke D
      // 1d5: iload 2
      // 1d6: ifne 2e2
      // 1d9: aload 0
      // 1da: iload 2
      // 1db: ifeq 244
      // 1de: goto 1e5
      // 1e1: invokestatic egi.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: getfield egi.wyl Lc05;
      // 1e8: getfield c05.tij Lkh3;
      // 1eb: aload 0
      // 1ec: getfield egi.wyl Lc05;
      // 1ef: getfield c05.vg8 Ll86;
      // 1f2: aload 0
      // 1f3: getfield egi.wyl Lc05;
      // 1f6: getfield c05.vg8 Ll86;
      // 1f9: invokevirtual l86.aaw ()Lnh4;
      // 1fc: dconst_0
      // 1fd: aload 0
      // 1fe: getfield egi.wyl Lc05;
      // 201: getfield c05.vg8 Ll86;
      // 204: getfield l86.mop D
      // 207: dconst_0
      // 208: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 20b: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 20e: invokeinterface java/util/List.size ()I 1
      // 213: goto 21a
      // 216: invokestatic egi.a (Loov;)Loov;
      // 219: athrow
      // 21a: ifgt 23c
      // 21d: aload 0
      // 21e: iload 2
      // 21f: ifeq 25e
      // 222: goto 229
      // 225: invokestatic egi.a (Loov;)Loov;
      // 228: athrow
      // 229: getfield egi.wyl Lc05;
      // 22c: getfield c05.vg8 Ll86;
      // 22f: getfield l86.lfk Z
      // 232: ifeq 25d
      // 235: goto 23c
      // 238: invokestatic egi.a (Loov;)Loov;
      // 23b: athrow
      // 23c: aload 0
      // 23d: goto 244
      // 240: invokestatic egi.a (Loov;)Loov;
      // 243: athrow
      // 244: invokestatic q0r.f2f ()Z
      // 247: iload 2
      // 248: ifeq 256
      // 24b: ifeq 259
      // 24e: goto 255
      // 251: invokestatic egi.a (Loov;)Loov;
      // 254: athrow
      // 255: bipush 1
      // 256: goto 25a
      // 259: bipush 0
      // 25a: putfield egi.b3a I
      // 25d: aload 0
      // 25e: aload 0
      // 25f: getfield egi.tn6 D
      // 262: aload 0
      // 263: getfield egi.tn6 D
      // 266: ldc2_w 159.0
      // 269: ddiv
      // 26a: dsub
      // 26b: putfield egi.vke D
      // 26e: iload 2
      // 26f: ifne 2e2
      // 272: aload 0
      // 273: iload 2
      // 274: ifeq 2f9
      // 277: goto 27e
      // 27a: invokestatic egi.a (Loov;)Loov;
      // 27d: athrow
      // 27e: getfield egi.wyl Lc05;
      // 281: getfield c05.vg8 Ll86;
      // 284: getfield l86.lfk Z
      // 287: goto 28e
      // 28a: invokestatic egi.a (Loov;)Loov;
      // 28d: athrow
      // 28e: ifeq 2e2
      // 291: aload 0
      // 292: iload 2
      // 293: ifeq 2f9
      // 296: goto 29d
      // 299: invokestatic egi.a (Loov;)Loov;
      // 29c: athrow
      // 29d: getfield egi.wyl Lc05;
      // 2a0: getfield c05.vg8 Ll86;
      // 2a3: getfield l86.fcv Z
      // 2a6: ifeq 2e2
      // 2a9: goto 2b0
      // 2ac: invokestatic egi.a (Loov;)Loov;
      // 2af: athrow
      // 2b0: aload 1
      // 2b1: aload 0
      // 2b2: getfield egi.wyl Lc05;
      // 2b5: getfield c05.vg8 Ll86;
      // 2b8: ldc2_w 0.415
      // 2bb: dup2_x1
      // 2bc: putfield l86.mop D
      // 2bf: invokevirtual _qa.ziq (D)V
      // 2c2: aload 0
      // 2c3: dup
      // 2c4: getfield egi.vke D
      // 2c7: ldc2_w 1.9
      // 2ca: dmul
      // 2cb: putfield egi.vke D
      // 2ce: aload 0
      // 2cf: getfield egi.wyl Lc05;
      // 2d2: getfield c05.gze Laba;
      // 2d5: ldc 1.08
      // 2d7: nop
      // 2d8: putfield aba.qeu F
      // 2db: goto 2e2
      // 2de: invokestatic egi.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: aload 0
      // 2e3: aload 0
      // 2e4: getfield egi.vke D
      // 2e7: invokestatic ohv.reg ()D
      // 2ea: invokestatic java/lang/Math.max (DD)D
      // 2ed: putfield egi.vke D
      // 2f0: aload 1
      // 2f1: aload 0
      // 2f2: getfield egi.vke D
      // 2f5: invokestatic ohv.qjs (L_qa;D)V
      // 2f8: aload 0
      // 2f9: dup
      // 2fa: getfield egi.b3a I
      // 2fd: bipush 1
      // 2fe: iadd
      // 2ff: putfield egi.b3a I
      // 302: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5977738835412158294L, -3295065748666919234L, MethodHandles.lookup().lookupClass()).a(240226874871898L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 17775093995567L;
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
      String var6 = "Ü\u009bðËâ\u0082}\"Uñ\u001dy©\u009d\u000be\u0010\u009c\u007f[mê\tá.#\u0014S¿væá\u009c";
      int var8 = "Ü\u009bðËâ\u0082}\"Uñ\u001dy©\u009d\u000be\u0010\u009c\u007f[mê\tá.#\u0014S¿væá\u009c".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29536;
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
            throw new RuntimeException("egi", var10);
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
         throw new RuntimeException("egi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
