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

public class gpo {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public gpo() {
   }

   public gpo(float var1, float var2, float var3, float var4) {
      this.uhk = var1;
      this.j6l = var2;
      this.av4 = var3;
      this.h2i = var4;
   }

   public float uw6() {
      return this.uhk;
   }

   public float fyx() {
      return this.j6l;
   }

   public float _92() {
      return this.av4;
   }

   public float zqn() {
      return this.h2i;
   }

   public void kej(float var1) {
      this.uhk = var1;
   }

   public void h1k(float var1) {
      this.j6l = var1;
   }

   public void re7(float var1) {
      this.av4 = var1;
   }

   public void tzl(float var1) {
      this.h2i = var1;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 0
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic gpo.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic gpo.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 33
      // 1f: instanceof gpo
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic gpo.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic gpo.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast gpo
      // 36: astore 3
      // 37: aload 3
      // 38: aload 0
      // 39: invokevirtual gpo.inj (Ljava/lang/Object;)Z
      // 3c: iload 2
      // 3d: ifne 5b
      // 40: ifne 50
      // 43: goto 4a
      // 46: invokestatic gpo.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: invokestatic gpo.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: invokevirtual gpo.uw6 ()F
      // 54: aload 3
      // 55: invokevirtual gpo.uw6 ()F
      // 58: invokestatic java/lang/Float.compare (FF)I
      // 5b: iload 2
      // 5c: ifne 7a
      // 5f: ifeq 6f
      // 62: goto 69
      // 65: invokestatic gpo.a (Loov;)Loov;
      // 68: athrow
      // 69: bipush 0
      // 6a: ireturn
      // 6b: invokestatic gpo.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: invokevirtual gpo.fyx ()F
      // 73: aload 3
      // 74: invokevirtual gpo.fyx ()F
      // 77: invokestatic java/lang/Float.compare (FF)I
      // 7a: iload 2
      // 7b: ifne 99
      // 7e: ifeq 8e
      // 81: goto 88
      // 84: invokestatic gpo.a (Loov;)Loov;
      // 87: athrow
      // 88: bipush 0
      // 89: ireturn
      // 8a: invokestatic gpo.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: invokevirtual gpo._92 ()F
      // 92: aload 3
      // 93: invokevirtual gpo._92 ()F
      // 96: invokestatic java/lang/Float.compare (FF)I
      // 99: iload 2
      // 9a: ifne b8
      // 9d: ifeq ad
      // a0: goto a7
      // a3: invokestatic gpo.a (Loov;)Loov;
      // a6: athrow
      // a7: bipush 0
      // a8: ireturn
      // a9: invokestatic gpo.a (Loov;)Loov;
      // ac: athrow
      // ad: aload 0
      // ae: invokevirtual gpo.zqn ()F
      // b1: aload 3
      // b2: invokevirtual gpo.zqn ()F
      // b5: invokestatic java/lang/Float.compare (FF)I
      // b8: iload 2
      // b9: ifne cd
      // bc: ifeq cc
      // bf: goto c6
      // c2: invokestatic gpo.a (Loov;)Loov;
      // c5: athrow
      // c6: bipush 0
      // c7: ireturn
      // c8: invokestatic gpo.a (Loov;)Loov;
      // cb: athrow
      // cc: bipush 1
      // cd: ireturn
   }

   public boolean inj(Object var1) {
      return var1 instanceof gpo;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.uw6());
      var2 = var2 * 59 + Float.floatToIntBits(this.fyx());
      var2 = var2 * 59 + Float.floatToIntBits(this._92());
      return var2 * 59 + Float.floatToIntBits(this.zqn());
   }

   @Override
   public String toString() {
      long var1 = a ^ 17798530830003L;
      return a<"q">(2159, 5195239944485622890L ^ var1)
         + this.uw6()
         + a<"q">(7806, 1851589404181611130L ^ var1)
         + this.fyx()
         + a<"q">(10555, 6131382296220103996L ^ var1)
         + this._92()
         + a<"q">(27307, 3996229644457260717L ^ var1)
         + this.zqn()
         + ")";
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2525005039118927264L, -4316434160280701068L, MethodHandles.lookup().lookupClass()).a(108557234378029L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 135870074616504L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u0082f\u0083öÊ7Þ \u0099üÔ_é^ëÍ\u0010W- h\u001b\nOÅyn=B2ë5¼";
      int var8 = "\u0082f\u0083öÊ7Þ \u0099üÔ_é^ëÍ\u0010W- h\u001b\nOÅyn=B2ë5¼".length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "¯\u0014Ìümüº?r«®¦\u009d\u001d=tzåÈ\u001a²Í\t_Êlvf«WØ¿ le\tg¬Kf\u0091\u00885\u0013\u008cÜíÒ\\D\u000fltD>æ«EÅ#ÎDàLè";
                  var8 = "¯\u0014Ìümüº?r«®¦\u009d\u001d=tzåÈ\u001a²Í\t_Êlvf«WØ¿ le\tg¬Kf\u0091\u00885\u0013\u008cÜíÒ\\D\u000fltD>æ«EÅ#ÎDàLè".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26829;
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
            throw new RuntimeException("gpo", var10);
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
         throw new RuntimeException("gpo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
