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

public class gxq {
   public static final gxq[] n44;
   public static final gxq qg6;
   public static final gxq itf;
   public static final gxq m_m;
   public static final gxq _12;
   public static final gxq jhx;
   public static final gxq gl_;
   public static final gxq ugm;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public String j45() {
      return this.snw;
   }

   public String ud5() {
      long var1 = a ^ 74726973168347L;
      return a<"n">(25867, 6701745667080833723L ^ var1) + this.snw;
   }

   public String lcd() {
      long var1 = a ^ 75646362462281L;
      return this.ud5() + a<"n">(9227, 2083561390038448431L ^ var1);
   }

   public int p79() {
      return this.m5t;
   }

   public gxq pwr(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic gxq.qg6 Lgxq;
      // 04: if_acmpne 1c
      // 07: iload 1
      // 08: ifne 1c
      // 0b: goto 12
      // 0e: invokestatic gxq.a (Loov;)Loov;
      // 11: athrow
      // 12: getstatic gxq.ugm Lgxq;
      // 15: goto 1d
      // 18: invokestatic gxq.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: areturn
   }

   private gxq uqc(boolean var1) {
      this.be9 = var1;
      return this;
   }

   public boolean edr() {
      return this.be9;
   }

   private gxq bn_() {
      this.xxk = true;
      return this;
   }

   public boolean z79() {
      return this.xxk;
   }

   public static gxq s8v(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: getstatic gxq.n44 [Lgxq;
      // 0a: arraylength
      // 0b: if_icmpge 56
      // 0e: getstatic gxq.n44 [Lgxq;
      // 11: iload 2
      // 12: aaload
      // 13: iload 1
      // 14: ifne 2d
      // 17: ifnull 4f
      // 1a: goto 21
      // 1d: invokestatic gxq.a (Loov;)Loov;
      // 20: athrow
      // 21: getstatic gxq.n44 [Lgxq;
      // 24: iload 2
      // 25: aaload
      // 26: goto 2d
      // 29: invokestatic gxq.a (Loov;)Loov;
      // 2c: athrow
      // 2d: iload 1
      // 2e: ifne 4e
      // 31: getfield gxq.snw Ljava/lang/String;
      // 34: aload 0
      // 35: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 38: ifeq 4f
      // 3b: goto 42
      // 3e: invokestatic gxq.a (Loov;)Loov;
      // 41: athrow
      // 42: getstatic gxq.n44 [Lgxq;
      // 45: iload 2
      // 46: aaload
      // 47: goto 4e
      // 4a: invokestatic gxq.a (Loov;)Loov;
      // 4d: athrow
      // 4e: areturn
      // 4f: iinc 2 1
      // 52: iload 1
      // 53: ifeq 06
      // 56: aconst_null
      // 57: areturn
   }

   public int vwm() {
      return this.uym;
   }

   public boolean czg() {
      return this.kqb;
   }

   private gxq si4() {
      this.kqb = true;
      return this;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7195467458135595477L, -4091284218837300009L, MethodHandles.lookup().lookupClass()).a(36259137952038L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 24563162446021L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[9];
      int var5 = 0;
      String var4 = "\u0093\u0006åì?\u001dZ¸ÿ8\u0014\u0083ï\u0017áq\u0018·ýv{ð\u001a\u000e\u0081a\r³\f)9Ïy\u0016Ùâ5§Óüg +\u009cj\u0094M\u0088ÅG£\u0086ãhxÒ\u000b»u¿è>1ÝA~¡ÎÕi\u0096;\u0093ó \u0081+»-é\u0002\u0090\u001a÷Ö\u008dêÚª\u0089s¤\u0084/¹¿¨®\u0080I¾5e\u001d\u009fÁ\u009b\u0010ÚY¶Ö\n\u008d\u0099Ú\u008d#:\u0000g²X[ [±\u0012R¥\u0011\u008f]ÜWÈ{ÕË$\u008bÓÁÑÆÌ\u0087=;ê\u0088\u000f7*\u008d\u008b5(4OìgÊ\fj(LöðÜö\u0090ÈX¼èsGß\u0010¡¤\u0097\u0013\u0093$lÁ!£BnñÂX4ãº";
      int var6 = "\u0093\u0006åì?\u001dZ¸ÿ8\u0014\u0083ï\u0017áq\u0018·ýv{ð\u001a\u000e\u0081a\r³\f)9Ïy\u0016Ùâ5§Óüg +\u009cj\u0094M\u0088ÅG£\u0086ãhxÒ\u000b»u¿è>1ÝA~¡ÎÕi\u0096;\u0093ó \u0081+»-é\u0002\u0090\u001a÷Ö\u008dêÚª\u0089s¤\u0084/¹¿¨®\u0080I¾5e\u001d\u009fÁ\u009b\u0010ÚY¶Ö\n\u008d\u0099Ú\u008d#:\u0000g²X[ [±\u0012R¥\u0011\u008f]ÜWÈ{ÕË$\u008bÓÁÑÆÌ\u0087=;ê\u0088\u000f7*\u008d\u008b5(4OìgÊ\fj(LöðÜö\u0090ÈX¼èsGß\u0010¡¤\u0097\u0013\u0093$lÁ!£BnñÂX4ãº"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[9];
                     n44 = new gxq[16];
                     qg6 = new gxq(0, a<"n">(9979, 4829503738807429975L ^ var9), 1).bn_();
                     itf = new gxq(1, a<"n">(18449, 7673100664321131962L ^ var9));
                     m_m = new gxq(2, a<"n">(30794, 688924376736855525L ^ var9));
                     _12 = new gxq(3, a<"n">(27727, 1586798471427351019L ^ var9)).si4();
                     jhx = new gxq(4, a<"n">(13015, 7737463204915330938L ^ var9));
                     gl_ = new gxq(5, a<"n">(23570, 949126740839485880L ^ var9));
                     ugm = new gxq(8, a<"n">(10753, 1657053110963447720L ^ var9), 0).uqc(false);
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

                  var4 = "4\"æºûp\u0010\u000fû?ò½ÐI1» z\u008cK\u0010Æ+~ý¦ÉÈYµÂ#\u0011Ð6'n\u0081\u0083ÞI[V\u0099\t!S¯¹";
                  var6 = "4\"æºûp\u0010\u000fû?ò½ÐI1» z\u008cK\u0010Æ+~ý¦ÉÈYµÂ#\u0011Ð6'n\u0081\u0083ÞI[V\u0099\t!S¯¹".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31622;
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
            throw new RuntimeException("gxq", var10);
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
         throw new RuntimeException("gxq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
