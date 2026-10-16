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

public class tnf extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public tnf() {
      long var1 = a ^ 5950271565459L;
      super(a<"h">(3788, 3728546793161757276L ^ var1), a<"h">(23746, 9099997663707643987L ^ var1));
   }

   @Override
   public void w4v() {
      super.w4v();
   }

   @Override
   public void i__() {
      this.wyl.gze.qeu = 1.0F;
      this.wyl.vg8.utl = 0.02F;
      super.i__();
   }

   @jev
   public void ana(q8e param1) {
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
      // 05: getfield tnf.wyl Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: invokevirtual l86.mwv ()Z
      // 0e: iload 2
      // 0f: ifne 20
      // 12: ifeq 1d
      // 15: goto 1c
      // 18: invokestatic tnf.a (Loov;)Loov;
      // 1b: athrow
      // 1c: return
      // 1d: invokestatic q0r.f2f ()Z
      // 20: iload 2
      // 21: ifne 3f
      // 24: ifeq de
      // 27: goto 2e
      // 2a: invokestatic tnf.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield tnf.wyl Lc05;
      // 32: getfield c05.vg8 Ll86;
      // 35: getfield l86.lfk Z
      // 38: goto 3f
      // 3b: invokestatic tnf.a (Loov;)Loov;
      // 3e: athrow
      // 3f: iload 2
      // 40: ifne 87
      // 43: ifeq 78
      // 46: goto 4d
      // 49: invokestatic tnf.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield tnf.wyl Lc05;
      // 51: getfield c05.vg8 Ll86;
      // 54: invokevirtual l86.xv1 ()V
      // 57: aload 0
      // 58: getfield tnf.wyl Lc05;
      // 5b: getfield c05.vg8 Ll86;
      // 5e: ldc 0.0201
      // 60: nop
      // 61: putfield l86.utl F
      // 64: aload 0
      // 65: getfield tnf.wyl Lc05;
      // 68: getfield c05.gze Laba;
      // 6b: ldc 0.94
      // 6d: nop
      // 6e: putfield aba.qeu F
      // 71: goto 78
      // 74: invokestatic tnf.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: getfield tnf.wyl Lc05;
      // 7c: getfield c05.vg8 Ll86;
      // 7f: getfield l86.o_8 F
      // 82: f2d
      // 83: ldc2_w 0.7
      // 86: dcmpl
      // 87: iload 2
      // 88: ifne b6
      // 8b: ifle fb
      // 8e: goto 95
      // 91: invokestatic tnf.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 0
      // 96: getfield tnf.wyl Lc05;
      // 99: getfield c05.vg8 Ll86;
      // 9c: iload 2
      // 9d: ifne c7
      // a0: goto a7
      // a3: invokestatic tnf.a (Loov;)Loov;
      // a6: athrow
      // a7: getfield l86.o_8 F
      // aa: f2d
      // ab: ldc2_w 1.3
      // ae: dcmpg
      // af: goto b6
      // b2: invokestatic tnf.a (Loov;)Loov;
      // b5: athrow
      // b6: ifge fb
      // b9: aload 0
      // ba: getfield tnf.wyl Lc05;
      // bd: getfield c05.vg8 Ll86;
      // c0: goto c7
      // c3: invokestatic tnf.a (Loov;)Loov;
      // c6: athrow
      // c7: ldc 0.02
      // c9: nop
      // ca: putfield l86.utl F
      // cd: aload 0
      // ce: getfield tnf.wyl Lc05;
      // d1: getfield c05.gze Laba;
      // d4: ldc 1.8
      // d6: nop
      // d7: putfield aba.qeu F
      // da: iload 2
      // db: ifeq fb
      // de: aload 0
      // df: getfield tnf.wyl Lc05;
      // e2: getfield c05.vg8 Ll86;
      // e5: dconst_0
      // e6: putfield l86.icv D
      // e9: aload 0
      // ea: getfield tnf.wyl Lc05;
      // ed: getfield c05.vg8 Ll86;
      // f0: dconst_0
      // f1: putfield l86.bw4 D
      // f4: goto fb
      // f7: invokestatic tnf.a (Loov;)Loov;
      // fa: athrow
      // fb: return
   }

   @jev
   public void q1b(_qa var1) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6578804412206107338L, 1396559848725056237L, MethodHandles.lookup().lookupClass()).a(203238157579396L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 54629618689226L;
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
      String var6 = "\u0002O(\u008aa4\"\u0011t\u0095\u0000²\u0018?\u0092I ®Aµá\u0080ýàØ\u0080Tÿ$ÅjòSõ¢9\u0096|QÞ¢½R\u001aÝC\u0080\r·";
      int var8 = "\u0002O(\u008aa4\"\u0011t\u0095\u0000²\u0018?\u0092I ®Aµá\u0080ýàØ\u0080Tÿ$ÅjòSõ¢9\u0096|QÞ¢½R\u001aÝC\u0080\r·".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2111;
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
            throw new RuntimeException("tnf", var10);
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
         throw new RuntimeException("tnf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
