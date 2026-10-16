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

public class l7l extends _ss {
   public final int orx;
   public final int e8s;
   public final l7l b4b;
   public final erg o5g;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public l7l(String var1, String var2, int var3, int var4, u7m var5, l7l var6) {
      this(var1, var2, var3, var4, new erg(var5), var6);
   }

   public l7l(String var1, String var2, int var3, int var4, e0x var5, l7l var6) {
      this(var1, var2, var3, var4, new erg(var5), var6);
   }

   public l7l(String var1, String var2, int var3, int var4, erg var5, l7l var6) {
      long var7 = b ^ 104071637929327L;
      super(var1, new hsu(b<"a">(20801, 5628825051076475156L ^ var7) + var2, new Object[0]));
      this.o5g = var5;
      this.m1_ = b<"a">(32555, 4558272721122858879L ^ var7) + var2 + b<"a">(17589, 5108662629271776483L ^ var7);
      this.orx = var3;
      this.e8s = var4;
      if (var3 < y8d.aaf) {
         y8d.aaf = var3;
      }

      try {
         if (var4 < y8d.udt) {
            y8d.udt = var4;
         }
      } catch (oov var11) {
         throw a(var11);
      }

      try {
         if (var3 > y8d.ff5) {
            y8d.ff5 = var3;
         }
      } catch (oov var9) {
         throw a(var9);
      }

      try {
         if (var4 > y8d.cdb) {
            y8d.cdb = var4;
         }
      } catch (oov var10) {
         throw a(var10);
      }

      this.b4b = var6;
   }

   public l7l rem() {
      this.qy7 = true;
      return this;
   }

   public l7l o1e() {
      this.jfx = true;
      return this;
   }

   public l7l ft0() {
      super.ft0();
      y8d.i0s.add(this);
      return this;
   }

   @Override
   public boolean koi() {
      return true;
   }

   @Override
   public ekw xn7() {
      ekw var1 = super.xn7();

      poy var10000;
      syo var10001;
      label17: {
         try {
            var10000 = var1.f4q();
            if (this.xe7()) {
               var10001 = syo.iis;
               break label17;
            }
         } catch (oov var2) {
            throw a(var2);
         }

         var10001 = syo.qjc;
      }

      var10000.vyb(var10001);
      return var1;
   }

   public l7l en2(Class var1) {
      return (l7l)super.en2(var1);
   }

   public String h7c() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 2e
      // 09: getfield l7l.ihn Lc8o;
      // 0c: ifnull 2d
      // 0f: goto 16
      // 12: invokestatic l7l.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield l7l.ihn Lc8o;
      // 1a: aload 0
      // 1b: getfield l7l.m1_ Ljava/lang/String;
      // 1e: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 21: invokeinterface c8o.sag (Ljava/lang/String;)Ljava/lang/String; 2
      // 26: goto 34
      // 29: invokestatic l7l.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield l7l.m1_ Ljava/lang/String;
      // 31: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 34: areturn
   }

   public l7l c37(c8o var1) {
      this.ihn = var1;
      return this;
   }

   public boolean xe7() {
      return this.jfx;
   }

   @Override
   public _ss en2(Class var1) {
      return this.en2(var1);
   }

   @Override
   public _ss ft0() {
      return this.ft0();
   }

   @Override
   public _ss rem() {
      return this.rem();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6865514813519682281L, -542235716045694039L, MethodHandles.lookup().lookupClass()).a(203455251826088L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 3590287696744L;
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
      String var6 = "f¾wNô\u0086Ãò\u001cÊ%\u0013a\u0015AÈæzÉª:±\u0002ú\u0018\u007feËéá\t¤\nmetØ\\\u0083\u001ajÚTåvY/\u00adÁ\u0010\u0019Éö¶ÃÄT\u001c*}\u0002Z\u009cgz¦";
      int var8 = "f¾wNô\u0086Ãò\u001cÊ%\u0013a\u0015AÈæzÉª:±\u0002ú\u0018\u007feËéá\t¤\nmetØ\\\u0083\u001ajÚTåvY/\u00adÁ\u0010\u0019Éö¶ÃÄT\u001c*}\u0002Z\u009cgz¦"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[3];
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12865;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("l7l", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("l7l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
