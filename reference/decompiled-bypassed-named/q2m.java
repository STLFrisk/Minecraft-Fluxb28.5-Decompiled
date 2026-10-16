import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class q2m extends n_0 {
   private final uci ic4;
   private final String _9e;
   private final Set kmw = Sets.newHashSet();
   private String _2h;
   private String kdj = "";
   private String maq = "";
   private boolean lun = true;
   private boolean ty9 = true;
   private n_0$ajs dqh = n_0$ajs.yyy;
   private n_0$ajs flb = n_0$ajs.yyy;
   private syo hv9 = syo.w29;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public q2m(uci var1, String var2) {
      this.ic4 = var1;
      this._9e = var2;
      this._2h = var2;
   }

   @Override
   public String fm9() {
      return this._9e;
   }

   public String m6i() {
      return this._2h;
   }

   public void l7j(String var1) {
      long var2 = a ^ 133962290928158L;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"p">(14129, 5816576789583059690L ^ var2));
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      this._2h = var1;
      this.ic4.b_v(this);
   }

   @Override
   public Collection vsw() {
      return this.kmw;
   }

   public String wyj() {
      return this.kdj;
   }

   public void b6t(String var1) {
      long var2 = a ^ 18964160819901L;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"p">(2829, 2874135706400542324L ^ var2));
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      this.kdj = var1;
      this.ic4.b_v(this);
   }

   public String zme() {
      return this.maq;
   }

   public void kln(String var1) {
      this.maq = var1;
      this.ic4.b_v(this);
   }

   @Override
   public String s1c(String var1) {
      return this.wyj() + var1 + this.zme();
   }

   public static String x0i(n_0 param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic q2m.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aload 1
      // 14: goto 20
      // 17: invokestatic q2m.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual n_0.s1c (Ljava/lang/String;)Ljava/lang/String;
      // 20: areturn
   }

   @Override
   public boolean w7v() {
      return this.lun;
   }

   public void swm(boolean var1) {
      this.lun = var1;
      this.ic4.b_v(this);
   }

   @Override
   public boolean g33() {
      return this.ty9;
   }

   public void ooe(boolean var1) {
      this.ty9 = var1;
      this.ic4.b_v(this);
   }

   @Override
   public n_0$ajs xge() {
      return this.dqh;
   }

   @Override
   public n_0$ajs aej() {
      return this.flb;
   }

   public void f59(n_0$ajs var1) {
      this.dqh = var1;
      this.ic4.b_v(this);
   }

   public void xn7(n_0$ajs var1) {
      this.flb = var1;
      this.ic4.b_v(this);
   }

   public int w14() {
      int var1 = OpaquePredicate.b();
      byte var2 = 0;

      byte var10000;
      label37: {
         label36: {
            try {
               var10000 = this.w7v();
               if (var1 == 0) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (IllegalArgumentException var4) {
               throw a(var4);
            }

            var2 |= 1;
         }

         var10000 = this.g33();
      }

      try {
         if (var1 == 0) {
            return var10000;
         }

         if (var10000 == 0) {
            return var2;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      var2 |= 2;
      return var2;
   }

   public void nrr(int var1) {
      int var2 = OpaquePredicate.c();

      q2m var10000;
      int var10001;
      label39: {
         label38: {
            try {
               var10000 = this;
               var10001 = var1 & 1;
               if (var2 != 0) {
                  break label39;
               }

               if (var10001 > 0) {
                  break label38;
               }
            } catch (IllegalArgumentException var4) {
               throw a(var4);
            }

            var10001 = 0;
            break label39;
         }

         var10001 = 1;
      }

      label30: {
         label29: {
            try {
               var10000.swm((boolean)var10001);
               var10000 = this;
               var10001 = var1 & 2;
               if (var2 != 0) {
                  break label30;
               }

               if (var10001 > 0) {
                  break label29;
               }
            } catch (IllegalArgumentException var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label30;
         }

         var10001 = 1;
      }

      var10000.ooe((boolean)var10001);
   }

   public void w8o(syo var1) {
      this.hv9 = var1;
   }

   public syo z84() {
      return this.hv9;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2350375758883762553L, 8405138238320502543L, MethodHandles.lookup().lookupClass()).a(206056986494705L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 54965159011495L;
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
      String var6 = "£J+c¡\u0080ùÕ©©\u000eLÞä×,\f\u0093\u008eZ*\u0085ó\u0012<P_¶\u0089\u00959S\u0088\u000bûz\u0083&5\u0091(\u0019+ÂýëC\u0017Ðª\n¢ù\u0098\u0098l´ð¤\u0011r\u001eo3ÍmcÍì\u001d\u0007/\u0089jÞfJ_c\u009ff";
      int var8 = "£J+c¡\u0080ùÕ©©\u000eLÞä×,\f\u0093\u008eZ*\u0085ó\u0012<P_¶\u0089\u00959S\u0088\u000bûz\u0083&5\u0091(\u0019+ÂýëC\u0017Ðª\n¢ù\u0098\u0098l´ð¤\u0011r\u001eo3ÍmcÍì\u001d\u0007/\u0089jÞfJ_c\u009ff"
         .length();
      char var5 = '(';
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

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22601;
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
            throw new RuntimeException("q2m", var10);
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
         throw new RuntimeException("q2m" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
