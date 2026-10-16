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

public class rty implements Comparable {
   public final mew weq;
   public long pjb;
   public int afq;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public rty(mew var1, e0x var2) {
      this.b_m = yr8++;
      this.weq = var1;
      this.el5 = var2;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: instanceof rty
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic rty.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic rty.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast rty
      // 20: astore 3
      // 21: aload 0
      // 22: getfield rty.weq Lmew;
      // 25: aload 3
      // 26: getfield rty.weq Lmew;
      // 29: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 2c: iload 2
      // 2d: ifne 4c
      // 30: ifeq 5e
      // 33: goto 3a
      // 36: invokestatic rty.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield rty.el5 Le0x;
      // 3e: aload 3
      // 3f: getfield rty.el5 Le0x;
      // 42: invokestatic e0x.wma (Le0x;Le0x;)Z
      // 45: goto 4c
      // 48: invokestatic rty.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 2
      // 4d: ifne 5b
      // 50: ifeq 5e
      // 53: goto 5a
      // 56: invokestatic rty.a (Loov;)Loov;
      // 59: athrow
      // 5a: bipush 1
      // 5b: goto 5f
      // 5e: bipush 0
      // 5f: ireturn
   }

   @Override
   public int hashCode() {
      return this.weq.hashCode();
   }

   public rty wsc(long var1) {
      this.pjb = var1;
      return this;
   }

   public void pep(int var1) {
      this.afq = var1;
   }

   public int iuo(rty param1) {
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
      // 05: getfield rty.pjb J
      // 08: aload 1
      // 09: getfield rty.pjb J
      // 0c: lcmp
      // 0d: iload 2
      // 0e: ifne 2c
      // 11: ifge 23
      // 14: goto 1b
      // 17: invokestatic rty.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush -1
      // 1c: goto a3
      // 1f: invokestatic rty.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield rty.pjb J
      // 27: aload 1
      // 28: getfield rty.pjb J
      // 2b: lcmp
      // 2c: iload 2
      // 2d: ifne 46
      // 30: ifle 42
      // 33: goto 3a
      // 36: invokestatic rty.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto a3
      // 3e: invokestatic rty.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getfield rty.afq I
      // 46: iload 2
      // 47: ifne 71
      // 4a: aload 1
      // 4b: getfield rty.afq I
      // 4e: if_icmpeq 68
      // 51: goto 58
      // 54: invokestatic rty.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getfield rty.afq I
      // 5c: aload 1
      // 5d: getfield rty.afq I
      // 60: isub
      // 61: goto a3
      // 64: invokestatic rty.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: getfield rty.b_m J
      // 6c: aload 1
      // 6d: getfield rty.b_m J
      // 70: lcmp
      // 71: iload 2
      // 72: ifne 90
      // 75: ifge 87
      // 78: goto 7f
      // 7b: invokestatic rty.a (Loov;)Loov;
      // 7e: athrow
      // 7f: bipush -1
      // 80: goto a3
      // 83: invokestatic rty.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 0
      // 88: getfield rty.b_m J
      // 8b: aload 1
      // 8c: getfield rty.b_m J
      // 8f: lcmp
      // 90: iload 2
      // 91: ifne 9f
      // 94: ifle a2
      // 97: goto 9e
      // 9a: invokestatic rty.a (Loov;)Loov;
      // 9d: athrow
      // 9e: bipush 1
      // 9f: goto a3
      // a2: bipush 0
      // a3: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 15018450927293L;
      return e0x.mxb(this.el5)
         + a<"y">(374, 2433939684433953234L ^ var1)
         + this.weq
         + a<"y">(19948, 8854816686856064330L ^ var1)
         + this.pjb
         + a<"y">(19362, 8792554312929561351L ^ var1)
         + this.afq
         + a<"y">(19362, 8792554312929561351L ^ var1)
         + this.b_m;
   }

   public e0x qny() {
      return this.el5;
   }

   @Override
   public int compareTo(Object var1) {
      return this.iuo((rty)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4424572015374523801L, -4384893992838195782L, MethodHandles.lookup().lookupClass()).a(131914493646296L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 81794078331791L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u0089õ®Ã,\u0011\u0090K?µÀ1i\u001b\u0011Ú\u0010¦±\u0003éä±2f°\u009aß\u001d( Çq\u0010ÙDÕA\u009b\u009bG:þ\b\u00195\u0089ÒÜ?";
      int var8 = "\u0089õ®Ã,\u0011\u0090K?µÀ1i\u001b\u0011Ú\u0010¦±\u0003éä±2f°\u009aß\u001d( Çq\u0010ÙDÕA\u009b\u009bG:þ\b\u00195\u0089ÒÜ?".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7558;
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
            throw new RuntimeException("rty", var10);
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
         throw new RuntimeException("rty" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
