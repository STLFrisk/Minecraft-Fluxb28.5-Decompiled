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

public class al9$tup implements sjk {
   private final int of2;
   private final boolean ek3;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public al9$tup(int var1, boolean var2) {
      this.of2 = var1;
      this.ek3 = var2;
   }

   @Override
   public void z9x(al9 var1) {
      al9.f23(var1, this.of2);
   }

   @Override
   public ekw s34() {
      long var1 = a ^ 74151029419050L;

      try {
         if (this.of2 < 0) {
            return new tao(a<"z">(18188, 6514646070719826471L ^ var1));
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return new tao(a<"z">(24717, 5758176997093305767L ^ var1));
   }

   @Override
   public void b6x(float param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: invokestatic c05.vz1 ()Lc05;
      // 07: invokevirtual c05.l22 ()Llc5;
      // 0a: getstatic akr._rg Lgdz;
      // 0d: invokevirtual lc5.anl (Lgdz;)V
      // 10: aload 0
      // 11: getfield al9$tup.of2 I
      // 14: iload 3
      // 15: ifeq 48
      // 18: ifge 40
      // 1b: goto 22
      // 1e: invokestatic al9$tup.a (Loov;)Loov;
      // 21: athrow
      // 22: bipush 0
      // 23: bipush 0
      // 24: ldc 144.0
      // 26: nop
      // 27: fconst_0
      // 28: bipush 16
      // 2a: bipush 16
      // 2c: ldc 256.0
      // 2e: nop
      // 2f: ldc 256.0
      // 31: nop
      // 32: invokestatic b0t.vfo (IIFFIIFF)V
      // 35: iload 3
      // 36: ifne 5a
      // 39: goto 40
      // 3c: invokestatic al9$tup.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 0
      // 41: goto 48
      // 44: invokestatic al9$tup.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 0
      // 49: ldc 160.0
      // 4b: nop
      // 4c: fconst_0
      // 4d: bipush 16
      // 4f: bipush 16
      // 51: ldc 256.0
      // 53: nop
      // 54: ldc 256.0
      // 56: nop
      // 57: invokestatic b0t.vfo (IIFFIIFF)V
      // 5a: return
   }

   @Override
   public boolean v4p() {
      return this.ek3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7695715943831748037L, -5593234662374090702L, MethodHandles.lookup().lookupClass()).a(150366908986604L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 9758805503370L;
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
      String var6 = "ôÝ(|@øTÏ\u0018o;W®Ltqy\"¹¢\u0010«\tj\u0018Ö÷\u008d\u0096ý\u0010<Ñ¹Êï%\u001a¢9gS\n]E³\u0092\u0016\u0007";
      int var8 = "ôÝ(|@øTÏ\u0018o;W®Ltqy\"¹¢\u0010«\tj\u0018Ö÷\u008d\u0096ý\u0010<Ñ¹Êï%\u001a¢9gS\n]E³\u0092\u0016\u0007".length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6860;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("al9$tup", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("al9$tup" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
