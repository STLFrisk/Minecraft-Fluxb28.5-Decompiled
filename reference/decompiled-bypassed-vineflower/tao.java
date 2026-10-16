import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tao extends yem {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public tao(String var1) {
      this.avm = var1;
   }

   public String rcd() {
      return this.avm;
   }

   @Override
   public String cpz() {
      return this.avm;
   }

   public tao qy8() {
      tao var2 = new tao(this.avm);
      int var10000 = t9d.c();
      var2.di5(this.f4q().esg());
      int var1 = var10000;
      Iterator var3 = this.iwv().iterator();

      while (true) {
         if (var3.hasNext()) {
            ekw var4 = (ekw)var3.next();

            try {
               var6 = var2;
               if (var1 != 0) {
                  break;
               }

               var2.vha(var4.qy8());
               if (var1 == 0) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         var6 = var2;
         break;
      }

      return var6;
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic tao.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic tao.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifeq 33
      // 1f: instanceof tao
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic tao.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic tao.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast tao
      // 36: astore 3
      // 37: aload 0
      // 38: getfield tao.avm Ljava/lang/String;
      // 3b: aload 3
      // 3c: invokevirtual tao.rcd ()Ljava/lang/String;
      // 3f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42: iload 2
      // 43: ifeq 5c
      // 46: ifeq 6e
      // 49: goto 50
      // 4c: invokestatic tao.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 1
      // 52: invokespecial yem.equals (Ljava/lang/Object;)Z
      // 55: goto 5c
      // 58: invokestatic tao.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 2
      // 5d: ifeq 6b
      // 60: ifeq 6e
      // 63: goto 6a
      // 66: invokestatic tao.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 6f
      // 6e: bipush 0
      // 6f: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 139585568187601L;
      return b<"e">(17181, 1657451692778433785L ^ var1)
         + this.avm
         + '\''
         + b<"e">(5278, 3782876310434511737L ^ var1)
         + this.asp
         + b<"e">(9851, 5598263506043980189L ^ var1)
         + this.f4q()
         + '}';
   }

   @Override
   public ekw qy8() {
      return this.qy8();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3672755025784111349L, 4689394500806409356L, MethodHandles.lookup().lookupClass()).a(134772242038071L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 60681085359623L;
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
      String var6 = "\"CgÞ¼\u00adoÓK\u009ag½{äÖf²Y³Ý*1¼È\u0018hÃmmû0\u0090öGÂ\b~Íg\u009aHÃ\u0096<+\u0091éaÔ(#ÂÊ\u0082H®Fpú$¸F\u0088TÕáð\u0092h/\u0013ôì\u007fo\u0006\u008bé\u000es~\u0080>ë×}\u0002Ü_T";
      int var8 = "\"CgÞ¼\u00adoÓK\u009ag½{äÖf²Y³Ý*1¼È\u0018hÃmmû0\u0090öGÂ\b~Íg\u009aHÃ\u0096<+\u0091éaÔ(#ÂÊ\u0082H®Fpú$¸F\u0088TÕáð\u0092h/\u0013ôì\u007fo\u0006\u008bé\u000es~\u0080>ë×}\u0002Ü_T"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6073;
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
            throw new RuntimeException("tao", var10);
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
         throw new RuntimeException("tao" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
