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

public class e9a extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public e9a() {
      long var1 = a ^ 84570675030109L;
      super(a<"c">(12381, 4629693177749695292L ^ var1), a<"c">(23467, 8072905865690448075L ^ var1));
   }

   @jev
   public void riy(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 0.3
      // 003: dstore 3
      // 004: invokestatic t9d.b ()I
      // 007: aload 0
      // 008: getfield e9a.wyl Lc05;
      // 00b: getfield c05.vg8 Ll86;
      // 00e: getfield l86.x5k F
      // 011: ldc 90.0
      // 013: nop
      // 014: fadd
      // 015: f2d
      // 016: invokestatic java/lang/Math.toRadians (D)D
      // 019: invokestatic java/lang/Math.cos (D)D
      // 01c: dstore 5
      // 01e: istore 2
      // 01f: aload 0
      // 020: getfield e9a.wyl Lc05;
      // 023: getfield c05.vg8 Ll86;
      // 026: getfield l86.x5k F
      // 029: ldc 90.0
      // 02b: nop
      // 02c: fadd
      // 02d: f2d
      // 02e: invokestatic java/lang/Math.toRadians (D)D
      // 031: invokestatic java/lang/Math.sin (D)D
      // 034: dstore 7
      // 036: aload 0
      // 037: getfield e9a.wyl Lc05;
      // 03a: getfield c05.vg8 Ll86;
      // 03d: getfield l86.g9g Lboa;
      // 040: getfield boa._mw F
      // 043: f2d
      // 044: dload 3
      // 045: dmul
      // 046: dload 5
      // 048: dmul
      // 049: aload 0
      // 04a: getfield e9a.wyl Lc05;
      // 04d: getfield c05.vg8 Ll86;
      // 050: getfield l86.g9g Lboa;
      // 053: getfield boa.lrp F
      // 056: f2d
      // 057: dload 3
      // 058: dmul
      // 059: dload 7
      // 05b: dmul
      // 05c: dadd
      // 05d: dstore 9
      // 05f: aload 0
      // 060: getfield e9a.wyl Lc05;
      // 063: getfield c05.vg8 Ll86;
      // 066: getfield l86.g9g Lboa;
      // 069: getfield boa._mw F
      // 06c: f2d
      // 06d: dload 3
      // 06e: dmul
      // 06f: dload 7
      // 071: dmul
      // 072: aload 0
      // 073: getfield e9a.wyl Lc05;
      // 076: getfield c05.vg8 Ll86;
      // 079: getfield l86.g9g Lboa;
      // 07c: getfield boa.lrp F
      // 07f: f2d
      // 080: dload 3
      // 081: dmul
      // 082: dload 5
      // 084: dmul
      // 085: dsub
      // 086: dstore 11
      // 088: aload 0
      // 089: getfield e9a.wyl Lc05;
      // 08c: getfield c05.vg8 Ll86;
      // 08f: getfield l86.cbi Z
      // 092: iload 2
      // 093: ifeq 0b1
      // 096: ifeq 19b
      // 099: goto 0a0
      // 09c: invokestatic e9a.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield e9a.wyl Lc05;
      // 0a4: getfield c05.vg8 Ll86;
      // 0a7: invokevirtual l86.z2m ()Z
      // 0aa: goto 0b1
      // 0ad: invokestatic e9a.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: iload 2
      // 0b2: ifeq 0db
      // 0b5: ifne 19b
      // 0b8: goto 0bf
      // 0bb: invokestatic e9a.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield e9a.wyl Lc05;
      // 0c3: getfield c05.vg8 Ll86;
      // 0c6: iload 2
      // 0c7: ifeq 125
      // 0ca: goto 0d1
      // 0cd: invokestatic e9a.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: invokevirtual l86.hzv ()Z
      // 0d4: goto 0db
      // 0d7: invokestatic e9a.a (Loov;)Loov;
      // 0da: athrow
      // 0db: ifeq 19b
      // 0de: aload 0
      // 0df: getfield e9a.wyl Lc05;
      // 0e2: getfield c05.vg8 Ll86;
      // 0e5: getfield l86.lq7 Lp_k;
      // 0e8: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 0eb: dup
      // 0ec: aload 0
      // 0ed: getfield e9a.wyl Lc05;
      // 0f0: getfield c05.vg8 Ll86;
      // 0f3: getfield l86.o2v D
      // 0f6: dload 9
      // 0f8: dadd
      // 0f9: aload 0
      // 0fa: getfield e9a.wyl Lc05;
      // 0fd: getfield c05.vg8 Ll86;
      // 100: getfield l86.kfp D
      // 103: aload 0
      // 104: getfield e9a.wyl Lc05;
      // 107: getfield c05.vg8 Ll86;
      // 10a: getfield l86.vbd D
      // 10d: dload 11
      // 10f: dadd
      // 110: bipush 0
      // 111: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 114: invokevirtual p_k.sxi (Lmz2;)V
      // 117: aload 0
      // 118: getfield e9a.wyl Lc05;
      // 11b: getfield c05.vg8 Ll86;
      // 11e: goto 125
      // 121: invokestatic e9a.a (Loov;)Loov;
      // 124: athrow
      // 125: getfield l86.o2v D
      // 128: dstore 13
      // 12a: aload 0
      // 12b: getfield e9a.wyl Lc05;
      // 12e: getfield c05.vg8 Ll86;
      // 131: getfield l86.kfp D
      // 134: dstore 15
      // 136: aload 0
      // 137: getfield e9a.wyl Lc05;
      // 13a: getfield c05.vg8 Ll86;
      // 13d: getfield l86.lq7 Lp_k;
      // 140: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 143: dup
      // 144: dload 13
      // 146: dload 15
      // 148: invokestatic bk4.qq4 ()Z
      // 14b: ifeq 158
      // 14e: ldc2_w 9000.0
      // 151: goto 15b
      // 154: invokestatic e9a.a (Loov;)Loov;
      // 157: athrow
      // 158: ldc2_w 0.09
      // 15b: dsub
      // 15c: aload 0
      // 15d: getfield e9a.wyl Lc05;
      // 160: getfield c05.vg8 Ll86;
      // 163: getfield l86.vbd D
      // 166: bipush 0
      // 167: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 16a: invokevirtual p_k.sxi (Lmz2;)V
      // 16d: aload 0
      // 16e: getfield e9a.wyl Lc05;
      // 171: getfield c05.vg8 Ll86;
      // 174: aload 0
      // 175: getfield e9a.wyl Lc05;
      // 178: getfield c05.vg8 Ll86;
      // 17b: getfield l86.o2v D
      // 17e: dload 9
      // 180: dadd
      // 181: aload 0
      // 182: getfield e9a.wyl Lc05;
      // 185: getfield c05.vg8 Ll86;
      // 188: getfield l86.kfp D
      // 18b: aload 0
      // 18c: getfield e9a.wyl Lc05;
      // 18f: getfield c05.vg8 Ll86;
      // 192: getfield l86.vbd D
      // 195: dload 11
      // 197: dadd
      // 198: invokevirtual l86.m6_ (DDD)V
      // 19b: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7089578104858239720L, -8881781200459353197L, MethodHandles.lookup().lookupClass()).a(280208454964715L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 121462004345459L;
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
      String var6 = "\u000bi\u0080\u0088)nß_K\r\u0015$mGþ\n\u0010\u0007\f*.i[nùS©óI\u0086J\u007f$";
      int var8 = "\u000bi\u0080\u0088)nß_K\r\u0015$mGþ\n\u0010\u0007\f*.i[nùS©óI\u0086J\u007f$".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30943;
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
            throw new RuntimeException("e9a", var10);
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
         throw new RuntimeException("e9a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
