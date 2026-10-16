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

public class fi5 extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public fi5() {
      long var1 = a ^ 24539790387906L;
      super(a<"c">(5165, 7151708381938462869L ^ var1), a<"c">(2146, 7421276691426094299L ^ var1));
   }

   @jev
   public void dbq(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: ldc 0.05
      // 06: nop
      // 07: fstore 3
      // 08: aload 0
      // 09: getfield fi5.wyl Lc05;
      // 0c: getfield c05.vg8 Ll86;
      // 0f: getfield l86.lfk Z
      // 12: iload 2
      // 13: ifeq 89
      // 16: ifeq 7f
      // 19: goto 20
      // 1c: invokestatic fi5.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield fi5.wyl Lc05;
      // 24: getfield c05.vg8 Ll86;
      // 27: getfield l86.ooc F
      // 2a: iload 2
      // 2b: ifeq 7e
      // 2e: goto 35
      // 31: invokestatic fi5.a (Loov;)Loov;
      // 34: athrow
      // 35: fconst_0
      // 36: fcmpl
      // 37: ifne 62
      // 3a: goto 41
      // 3d: invokestatic fi5.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: getfield fi5.wyl Lc05;
      // 45: getfield c05.vg8 Ll86;
      // 48: getfield l86.z66 F
      // 4b: fconst_0
      // 4c: fcmpl
      // 4d: iload 2
      // 4e: ifeq 89
      // 51: goto 58
      // 54: invokestatic fi5.a (Loov;)Loov;
      // 57: athrow
      // 58: ifeq 7f
      // 5b: goto 62
      // 5e: invokestatic fi5.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 1
      // 63: aload 0
      // 64: getfield fi5.wyl Lc05;
      // 67: getfield c05.vg8 Ll86;
      // 6a: ldc2_w 0.4
      // 6d: dup2_x1
      // 6e: putfield l86.mop D
      // 71: invokevirtual _qa.ziq (D)V
      // 74: ldc 0.704
      // 76: nop
      // 77: goto 7e
      // 7a: invokestatic fi5.a (Loov;)Loov;
      // 7d: athrow
      // 7e: fstore 3
      // 7f: aload 0
      // 80: getfield fi5.wyl Lc05;
      // 83: getfield c05.vg8 Ll86;
      // 86: getfield l86.lfk Z
      // 89: iload 2
      // 8a: ifeq aa
      // 8d: ifne b1
      // 90: goto 97
      // 93: invokestatic fi5.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 0
      // 98: getfield fi5.wyl Lc05;
      // 9b: getfield c05.vg8 Ll86;
      // 9e: getfield l86.g25 I
      // a1: bipush 2
      // a2: irem
      // a3: goto aa
      // a6: invokestatic fi5.a (Loov;)Loov;
      // a9: athrow
      // aa: ifne b1
      // ad: ldc 0.704
      // af: nop
      // b0: fstore 3
      // b1: aload 1
      // b2: fload 3
      // b3: f2d
      // b4: invokestatic ohv.qjs (L_qa;D)V
      // b7: return
   }

   private double u7w() {
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
      // 09: getfield fi5.wyl Lc05;
      // 0c: getfield c05.vg8 Ll86;
      // 0f: getstatic mcs.uwx Lmcs;
      // 12: invokevirtual l86.cab (Lmcs;)Z
      // 15: iload 1
      // 16: ifeq 3a
      // 19: ifeq 4a
      // 1c: goto 23
      // 1f: invokestatic fi5.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield fi5.wyl Lc05;
      // 27: getfield c05.vg8 Ll86;
      // 2a: getstatic mcs.uwx Lmcs;
      // 2d: invokevirtual l86.dhd (Lmcs;)Lsdj;
      // 30: invokevirtual sdj.tus ()I
      // 33: goto 3a
      // 36: invokestatic fi5.a (Loov;)Loov;
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
      long var10000 = c.a(-3708270163056252905L, 2434591882840326008L, MethodHandles.lookup().lookupClass()).a(257733916111381L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 109784015724480L;
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
      String var6 = " 3\u001ahL\u0000}\u0092+\u009fà\u009a¡Ò$º\u0010\u008aÜ×\u001eÙ-\u008f¥\u008fFÔ\u0013/\u001c¾U";
      int var8 = " 3\u001ahL\u0000}\u0092+\u009fà\u009a¡Ò$º\u0010\u008aÜ×\u001eÙ-\u008f¥\u008fFÔ\u0013/\u001c¾U".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29591;
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
            throw new RuntimeException("fi5", var10);
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
         throw new RuntimeException("fi5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
