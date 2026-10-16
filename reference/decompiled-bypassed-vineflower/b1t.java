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

public class b1t extends j1s {
   public double d8o;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public b1t() {
      long var1 = a ^ 2184763330594L;
      super(a<"i">(24843, 3639984259537314280L ^ var1), a<"i">(29298, 7092426244279251600L ^ var1));
   }

   @jev
   public void _xd(q8e param1) {
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
      // 005: getfield b1t.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getfield l86.lfk Z
      // 00e: iload 2
      // 00f: ifne 047
      // 012: ifeq 039
      // 015: goto 01c
      // 018: invokestatic b1t.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: bipush 0
      // 01e: putfield b1t.u8j Z
      // 021: aload 0
      // 022: bipush 0
      // 023: putfield b1t.zw_ Z
      // 026: aload 0
      // 027: aload 0
      // 028: getfield b1t.wyl Lc05;
      // 02b: getfield c05.vg8 Ll86;
      // 02e: getfield l86.kfp D
      // 031: putfield b1t.d8o D
      // 034: return
      // 035: invokestatic b1t.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield b1t.wyl Lc05;
      // 03d: getfield c05.vg8 Ll86;
      // 040: getfield l86.o_8 F
      // 043: ldc 3.0
      // 045: nop
      // 046: fcmpl
      // 047: iload 2
      // 048: ifne 087
      // 04b: ifle 07a
      // 04e: goto 055
      // 051: invokestatic b1t.a (Loov;)Loov;
      // 054: athrow
      // 055: aload 0
      // 056: getfield b1t.u8j Z
      // 059: iload 2
      // 05a: ifne 087
      // 05d: goto 064
      // 060: invokestatic b1t.a (Loov;)Loov;
      // 063: athrow
      // 064: ifne 07a
      // 067: goto 06e
      // 06a: invokestatic b1t.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: bipush 1
      // 070: putfield b1t.u8j Z
      // 073: goto 07a
      // 076: invokestatic b1t.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield b1t.wyl Lc05;
      // 07e: getfield c05.vg8 Ll86;
      // 081: getfield l86.g9g Lboa;
      // 084: getfield boa.s0a Z
      // 087: iload 2
      // 088: ifne 0a0
      // 08b: ifeq 19f
      // 08e: goto 095
      // 091: invokestatic b1t.a (Loov;)Loov;
      // 094: athrow
      // 095: aload 0
      // 096: getfield b1t.u8j Z
      // 099: goto 0a0
      // 09c: invokestatic b1t.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: iload 2
      // 0a1: ifne 0c3
      // 0a4: ifeq 19f
      // 0a7: goto 0ae
      // 0aa: invokestatic b1t.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield b1t.wyl Lc05;
      // 0b2: getfield c05.vg8 Ll86;
      // 0b5: getfield l86.o_8 F
      // 0b8: ldc 1.12
      // 0ba: nop
      // 0bb: fcmpl
      // 0bc: goto 0c3
      // 0bf: invokestatic b1t.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: iload 2
      // 0c4: ifne 0e9
      // 0c7: ifle 19f
      // 0ca: goto 0d1
      // 0cd: invokestatic b1t.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield b1t.wyl Lc05;
      // 0d5: getfield c05.vg8 Ll86;
      // 0d8: getfield l86.kfp D
      // 0db: aload 0
      // 0dc: getfield b1t.d8o D
      // 0df: dconst_1
      // 0e0: dsub
      // 0e1: dcmpg
      // 0e2: goto 0e9
      // 0e5: invokestatic b1t.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 2
      // 0ea: ifne 10d
      // 0ed: ifge 19f
      // 0f0: goto 0f7
      // 0f3: invokestatic b1t.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: iload 2
      // 0f9: ifne 156
      // 0fc: goto 103
      // 0ff: invokestatic b1t.a (Loov;)Loov;
      // 102: athrow
      // 103: getfield b1t.zw_ Z
      // 106: goto 10d
      // 109: invokestatic b1t.a (Loov;)Loov;
      // 10c: athrow
      // 10d: ifne 141
      // 110: aload 0
      // 111: bipush 1
      // 112: putfield b1t.zw_ Z
      // 115: aload 0
      // 116: getfield b1t.wyl Lc05;
      // 119: getfield c05.vg8 Ll86;
      // 11c: dconst_0
      // 11d: putfield l86.mop D
      // 120: aload 0
      // 121: getfield b1t.wyl Lc05;
      // 124: getfield c05.vg8 Ll86;
      // 127: dconst_0
      // 128: putfield l86.icv D
      // 12b: aload 0
      // 12c: getfield b1t.wyl Lc05;
      // 12f: getfield c05.vg8 Ll86;
      // 132: dconst_0
      // 133: putfield l86.bw4 D
      // 136: iload 2
      // 137: ifeq 19f
      // 13a: goto 141
      // 13d: invokestatic b1t.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: getfield b1t.wyl Lc05;
      // 145: getfield c05.vg8 Ll86;
      // 148: ldc2_w 0.41999998688697815
      // 14b: putfield l86.mop D
      // 14e: aload 0
      // 14f: goto 156
      // 152: invokestatic b1t.a (Loov;)Loov;
      // 155: athrow
      // 156: getfield b1t.wyl Lc05;
      // 159: getfield c05.vg8 Ll86;
      // 15c: getfield l86.x5k F
      // 15f: ldc 0.017453292
      // 161: nop
      // 162: fmul
      // 163: fstore 3
      // 164: aload 0
      // 165: getfield b1t.wyl Lc05;
      // 168: getfield c05.vg8 Ll86;
      // 16b: dup
      // 16c: getfield l86.icv D
      // 16f: fload 3
      // 170: invokestatic fe6.rtn (F)F
      // 173: ldc 0.07
      // 175: nop
      // 176: fmul
      // 177: f2d
      // 178: dsub
      // 179: putfield l86.icv D
      // 17c: aload 0
      // 17d: getfield b1t.wyl Lc05;
      // 180: getfield c05.vg8 Ll86;
      // 183: dup
      // 184: getfield l86.bw4 D
      // 187: fload 3
      // 188: invokestatic fe6.ssk (F)F
      // 18b: ldc 0.07
      // 18d: nop
      // 18e: fmul
      // 18f: f2d
      // 190: dadd
      // 191: putfield l86.bw4 D
      // 194: aload 0
      // 195: getfield b1t.wyl Lc05;
      // 198: getfield c05.vg8 Ll86;
      // 19b: fconst_0
      // 19c: putfield l86.o_8 F
      // 19f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-683546931784259611L, 7264324250949821144L, MethodHandles.lookup().lookupClass()).a(209020954815403L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 113150634280648L;
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
      String var6 = " Us\u0086¬\u0092Ç=\u0094c\u000e\u0089®£Rf\u0010ÛH\u0091Câ\"¾ãìD\u0002bÊÏ\\l";
      int var8 = " Us\u0086¬\u0092Ç=\u0094c\u000e\u0089®£Rf\u0010ÛH\u0091Câ\"¾ãìD\u0002bÊÏ\\l".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7733;
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
            throw new RuntimeException("b1t", var10);
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
         throw new RuntimeException("b1t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
