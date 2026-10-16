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

public class r2j extends j1s {
   public static crk tuu;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public r2j() {
      long var1 = a ^ 75492402524245L;
      super(a<"j">(27484, 8428022239420600557L ^ var1), a<"j">(10718, 738263537115075182L ^ var1));
   }

   @jev
   public void bf6(edg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield r2j.wyl Lc05;
      // 04: getfield c05.vg8 Ll86;
      // 07: dconst_0
      // 08: putfield l86.icv D
      // 0b: invokestatic t9d.c ()I
      // 0e: aload 0
      // 0f: getfield r2j.wyl Lc05;
      // 12: getfield c05.vg8 Ll86;
      // 15: dconst_0
      // 16: putfield l86.mop D
      // 19: aload 0
      // 1a: getfield r2j.wyl Lc05;
      // 1d: getfield c05.vg8 Ll86;
      // 20: dconst_0
      // 21: putfield l86.bw4 D
      // 24: istore 2
      // 25: aload 0
      // 26: getfield r2j.wyl Lc05;
      // 29: getfield c05.oxn Lmoh;
      // 2c: getfield moh.nfb Lm7l;
      // 2f: invokevirtual m7l.t9w ()Z
      // 32: iload 2
      // 33: ifne 64
      // 36: ifeq 57
      // 39: goto 40
      // 3c: invokestatic r2j.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield r2j.wyl Lc05;
      // 44: getfield c05.vg8 Ll86;
      // 47: getstatic r2j.tuu Lcrk;
      // 4a: invokevirtual crk.u7t ()D
      // 4d: putfield l86.mop D
      // 50: goto 57
      // 53: invokestatic r2j.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: getfield r2j.wyl Lc05;
      // 5b: getfield c05.oxn Lmoh;
      // 5e: getfield moh.e5o Lm7l;
      // 61: invokevirtual m7l.t9w ()Z
      // 64: iload 2
      // 65: ifne 8d
      // 68: ifeq 8a
      // 6b: goto 72
      // 6e: invokestatic r2j.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: getfield r2j.wyl Lc05;
      // 76: getfield c05.vg8 Ll86;
      // 79: getstatic r2j.tuu Lcrk;
      // 7c: invokevirtual crk.u7t ()D
      // 7f: dneg
      // 80: putfield l86.mop D
      // 83: goto 8a
      // 86: invokestatic r2j.a (Loov;)Loov;
      // 89: athrow
      // 8a: invokestatic q0r.f2f ()Z
      // 8d: ifeq d8
      // 90: getstatic fyk.kfa Lg_3;
      // 93: ifnull c4
      // 96: goto 9d
      // 99: invokestatic r2j.a (Loov;)Loov;
      // 9c: athrow
      // 9d: aload 0
      // 9e: getfield r2j.wyl Lc05;
      // a1: getfield c05.gze Laba;
      // a4: fconst_1
      // a5: putfield aba.qeu F
      // a8: aconst_null
      // a9: getstatic r2j.tuu Lcrk;
      // ac: invokevirtual crk.u7t ()D
      // af: ldc2_w 3.0
      // b2: dmul
      // b3: getstatic fyk.kfa Lg_3;
      // b6: invokestatic vxv.kax (L_qa;DLi2h;)V
      // b9: iload 2
      // ba: ifeq d8
      // bd: goto c4
      // c0: invokestatic r2j.a (Loov;)Loov;
      // c3: athrow
      // c4: getstatic r2j.tuu Lcrk;
      // c7: invokevirtual crk.u7t ()D
      // ca: ldc2_w 3.0
      // cd: dmul
      // ce: invokestatic q0r.a8n (D)V
      // d1: goto d8
      // d4: invokestatic r2j.a (Loov;)Loov;
      // d7: athrow
      // d8: return
   }

   @Override
   public void i__() {
      this.wyl.vg8.icv = 0.0;
      this.wyl.vg8.mop = 0.0;
      this.wyl.vg8.bw4 = 0.0;
      super.i__();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8347125569844068285L, -5991580732786479999L, MethodHandles.lookup().lookupClass()).a(198879079875648L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 122253392018603L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "ãÔ\u0091%\u001b\u008aNJ%\u0088«3QÁh\u009a ö\u0005Ý$\\ÿf·l4\u0090Ò\u000e\u0004<a\u0086Å1k?\u0083¨Ëí\u0091\u0016Þ#ÚÌ\u008b";
      int var6 = "ãÔ\u0091%\u001b\u008aNJ%\u0088«3QÁh\u009a ö\u0005Ý$\\ÿf·l4\u0090Ò\u000e\u0004<a\u0086Å1k?\u0083¨Ëí\u0091\u0016Þ#ÚÌ\u008b".length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     e = new String[4];
                     tuu = new crk(a<"j">(21791, 4017700077185360467L ^ var9), a<"j">(16348, 5391945508541728913L ^ var9), 0.5F, 0.1F, 3.0F, 0.1F);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "½ë\u0018\u0086Ê\u008eä\rL¦ÚKû\u000fuÏ\u0010'îkæþ}Àa ¦¶F\nÅ\u0092%";
                  var6 = "½ë\u0018\u0086Ê\u008eä\rL¦ÚKû\u000fuÏ\u0010'îkæþ}Àa ¦¶F\nÅ\u0092%".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10330;
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
            throw new RuntimeException("r2j", var10);
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
         throw new RuntimeException("r2j" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
