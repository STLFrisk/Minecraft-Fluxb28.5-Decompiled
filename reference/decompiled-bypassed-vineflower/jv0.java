import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jv0 extends xg0 {
   private static final long b;
   private static final String h;

   public jv0(t9d var1) {
      super(var1);
   }

   public jv0(t9d var1, g_3 var2) {
      super(var1, var2);
      this.pq_ = var2;
   }

   public jv0(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public void _7u(akm param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jv0.b J
      // 003: ldc2_w 72151552171509
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: invokevirtual jv0.lmd ()Lg_3;
      // 011: astore 5
      // 013: aload 1
      // 014: getfield akm.sc8 Li2h;
      // 017: iload 4
      // 019: ifne 031
      // 01c: ifnull 058
      // 01f: goto 026
      // 022: invokestatic jv0.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 1
      // 027: getfield akm.sc8 Li2h;
      // 02a: goto 031
      // 02d: invokestatic jv0.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 0
      // 032: iload 4
      // 034: ifne 04e
      // 037: getfield jv0.pq_ Lg_3;
      // 03a: if_acmpne 049
      // 03d: goto 044
      // 040: invokestatic jv0.a (Loov;)Loov;
      // 043: athrow
      // 044: return
      // 045: invokestatic jv0.a (Loov;)Loov;
      // 048: athrow
      // 049: aload 1
      // 04a: getfield akm.sc8 Li2h;
      // 04d: aload 0
      // 04e: aload 5
      // 050: invokestatic ofh.lr9 (Li2h;Li2h;)Lofh;
      // 053: fconst_0
      // 054: invokevirtual i2h.m1t (Lofh;F)Z
      // 057: pop
      // 058: bipush 0
      // 059: istore 6
      // 05b: iload 6
      // 05d: bipush 32
      // 05f: if_icmpge 0aa
      // 062: aload 0
      // 063: getfield jv0.oay Lt9d;
      // 066: getstatic w_0.t9k Lw_0;
      // 069: aload 0
      // 06a: getfield jv0.o2v D
      // 06d: aload 0
      // 06e: getfield jv0.kfp D
      // 071: aload 0
      // 072: getfield jv0.z2d Ljava/util/Random;
      // 075: invokevirtual java/util/Random.nextDouble ()D
      // 078: ldc2_w 2.0
      // 07b: dmul
      // 07c: dadd
      // 07d: aload 0
      // 07e: getfield jv0.vbd D
      // 081: aload 0
      // 082: getfield jv0.z2d Ljava/util/Random;
      // 085: invokevirtual java/util/Random.nextGaussian ()D
      // 088: dconst_0
      // 089: aload 0
      // 08a: getfield jv0.z2d Ljava/util/Random;
      // 08d: invokevirtual java/util/Random.nextGaussian ()D
      // 090: bipush 0
      // 091: newarray 10
      // 093: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 096: iinc 6 1
      // 099: iload 4
      // 09b: ifne 233
      // 09e: iload 4
      // 0a0: ifeq 05b
      // 0a3: goto 0aa
      // 0a6: invokestatic jv0.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: getfield jv0.oay Lt9d;
      // 0ae: getfield t9d.v0f Z
      // 0b1: iload 4
      // 0b3: ifne 0d8
      // 0b6: ifne 233
      // 0b9: goto 0c0
      // 0bc: invokestatic jv0.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 5
      // 0c2: iload 4
      // 0c4: ifne 202
      // 0c7: goto 0ce
      // 0ca: invokestatic jv0.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: instanceof z96
      // 0d1: goto 0d8
      // 0d4: invokestatic jv0.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: ifeq 200
      // 0db: aload 5
      // 0dd: checkcast z96
      // 0e0: astore 6
      // 0e2: aload 6
      // 0e4: iload 4
      // 0e6: ifne 105
      // 0e9: getfield z96.rhh Lmlk;
      // 0ec: invokevirtual mlk.hss ()Lhv0;
      // 0ef: invokevirtual hv0.jy3 ()Z
      // 0f2: ifeq 1fd
      // 0f5: goto 0fc
      // 0f8: invokestatic jv0.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 6
      // 0fe: goto 105
      // 101: invokestatic jv0.a (Loov;)Loov;
      // 104: athrow
      // 105: iload 4
      // 107: ifne 124
      // 10a: getfield z96.oay Lt9d;
      // 10d: aload 0
      // 10e: getfield jv0.oay Lt9d;
      // 111: if_acmpne 1fd
      // 114: goto 11b
      // 117: invokestatic jv0.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 6
      // 11d: goto 124
      // 120: invokestatic jv0.a (Loov;)Loov;
      // 123: athrow
      // 124: invokevirtual z96.ofg ()Z
      // 127: iload 4
      // 129: ifne 148
      // 12c: ifne 1fd
      // 12f: goto 136
      // 132: invokestatic jv0.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 0
      // 137: getfield jv0.z2d Ljava/util/Random;
      // 13a: invokevirtual java/util/Random.nextFloat ()F
      // 13d: ldc 0.05
      // 13f: nop
      // 140: fcmpg
      // 141: goto 148
      // 144: invokestatic jv0.a (Loov;)Loov;
      // 147: athrow
      // 148: iload 4
      // 14a: ifne 1bb
      // 14d: ifge 1b6
      // 150: goto 157
      // 153: invokestatic jv0.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 0
      // 158: getfield jv0.oay Lt9d;
      // 15b: invokevirtual t9d.eir ()Lef9;
      // 15e: getstatic jv0.h Ljava/lang/String;
      // 161: nop
      // 162: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 165: iload 4
      // 167: ifne 1bb
      // 16a: goto 171
      // 16d: invokestatic jv0.a (Loov;)Loov;
      // 170: athrow
      // 171: ifeq 1b6
      // 174: goto 17b
      // 177: invokestatic jv0.a (Loov;)Loov;
      // 17a: athrow
      // 17b: new tl9
      // 17e: dup
      // 17f: aload 0
      // 180: getfield jv0.oay Lt9d;
      // 183: invokespecial tl9.<init> (Lt9d;)V
      // 186: astore 7
      // 188: aload 7
      // 18a: bipush 1
      // 18b: invokevirtual tl9.yxe (Z)V
      // 18e: aload 7
      // 190: aload 5
      // 192: getfield g_3.o2v D
      // 195: aload 5
      // 197: getfield g_3.kfp D
      // 19a: aload 5
      // 19c: getfield g_3.vbd D
      // 19f: aload 5
      // 1a1: getfield g_3.x5k F
      // 1a4: aload 5
      // 1a6: getfield g_3.y2i F
      // 1a9: invokevirtual tl9.x24 (DDDFF)V
      // 1ac: aload 0
      // 1ad: getfield jv0.oay Lt9d;
      // 1b0: aload 7
      // 1b2: invokevirtual t9d.xzq (Li2h;)Z
      // 1b5: pop
      // 1b6: aload 5
      // 1b8: invokevirtual g_3.i0e ()Z
      // 1bb: iload 4
      // 1bd: ifne 1fc
      // 1c0: ifeq 1da
      // 1c3: goto 1ca
      // 1c6: invokestatic jv0.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: aload 5
      // 1cc: aconst_null
      // 1cd: checkcast i2h
      // 1d0: invokevirtual g_3.nw9 (Li2h;)V
      // 1d3: goto 1da
      // 1d6: invokestatic jv0.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: aload 5
      // 1dc: aload 0
      // 1dd: getfield jv0.o2v D
      // 1e0: aload 0
      // 1e1: getfield jv0.kfp D
      // 1e4: aload 0
      // 1e5: getfield jv0.vbd D
      // 1e8: invokevirtual g_3.clj (DDD)V
      // 1eb: aload 5
      // 1ed: fconst_0
      // 1ee: putfield g_3.o_8 F
      // 1f1: aload 5
      // 1f3: getstatic ofh.m8d Lofh;
      // 1f6: ldc 5.0
      // 1f8: nop
      // 1f9: invokevirtual g_3.m1t (Lofh;F)Z
      // 1fc: pop
      // 1fd: goto 22f
      // 200: aload 5
      // 202: iload 4
      // 204: ifne 22b
      // 207: ifnull 22f
      // 20a: goto 211
      // 20d: invokestatic jv0.a (Loov;)Loov;
      // 210: athrow
      // 211: aload 5
      // 213: aload 0
      // 214: getfield jv0.o2v D
      // 217: aload 0
      // 218: getfield jv0.kfp D
      // 21b: aload 0
      // 21c: getfield jv0.vbd D
      // 21f: invokevirtual g_3.clj (DDD)V
      // 222: aload 5
      // 224: goto 22b
      // 227: invokestatic jv0.a (Loov;)Loov;
      // 22a: athrow
      // 22b: fconst_0
      // 22c: putfield g_3.o_8 F
      // 22f: aload 0
      // 230: invokevirtual jv0._kl ()V
      // 233: return
   }

   @Override
   public void xx_() {
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
      // 05: invokevirtual jv0.lmd ()Lg_3;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 19
      // 0e: ifnull 47
      // 11: goto 18
      // 14: invokestatic jv0.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 2
      // 19: instanceof ha9
      // 1c: iload 1
      // 1d: ifeq 35
      // 20: ifeq 47
      // 23: goto 2a
      // 26: invokestatic jv0.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual g_3.gzr ()Z
      // 2e: goto 35
      // 31: invokestatic jv0.a (Loov;)Loov;
      // 34: athrow
      // 35: ifne 47
      // 38: aload 0
      // 39: invokevirtual jv0._kl ()V
      // 3c: iload 1
      // 3d: ifne 52
      // 40: goto 47
      // 43: invokestatic jv0.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: invokespecial xg0.xx_ ()V
      // 4b: goto 52
      // 4e: invokestatic jv0.a (Loov;)Loov;
      // 51: athrow
      // 52: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7457855431381963234L, 2090831350399499896L, MethodHandles.lookup().lookupClass()).a(62655011712421L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 50530384538288L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(":-\"#Åóîº|2Z\u00813.,b".getBytes("ISO-8859-1"));
      String var6 = c(var4).intern();
      byte var10001 = -1;
      h = var6;
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
