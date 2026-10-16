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

public class tgr {
   private final tgr$a3_ edc;
   private final String njd;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public tgr(tgr$a3_ var1, String var2) {
      this.edc = var1;
      this.njd = var2;
   }

   public tgr$a3_ vex() {
      return this.edc;
   }

   public String uxt() {
      return this.njd;
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
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic tgr.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic tgr.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull aa
      // 1e: aload 0
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: iload 2
      // 23: ifne 43
      // 26: goto 2d
      // 29: invokestatic tgr.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpne aa
      // 34: goto 3b
      // 37: invokestatic tgr.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: goto 43
      // 3f: invokestatic tgr.a (Loov;)Loov;
      // 42: athrow
      // 43: checkcast tgr
      // 46: astore 3
      // 47: aload 0
      // 48: iload 2
      // 49: ifne 64
      // 4c: getfield tgr.edc Ltgr$a3_;
      // 4f: aload 3
      // 50: getfield tgr.edc Ltgr$a3_;
      // 53: if_acmpeq 63
      // 56: goto 5d
      // 59: invokestatic tgr.a (Loov;)Loov;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: invokestatic tgr.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: getfield tgr.njd Ljava/lang/String;
      // 67: iload 2
      // 68: ifne 9f
      // 6b: ifnull 9b
      // 6e: goto 75
      // 71: invokestatic tgr.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 0
      // 76: getfield tgr.njd Ljava/lang/String;
      // 79: aload 3
      // 7a: getfield tgr.njd Ljava/lang/String;
      // 7d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 80: iload 2
      // 81: ifne a9
      // 84: goto 8b
      // 87: invokestatic tgr.a (Loov;)Loov;
      // 8a: athrow
      // 8b: ifne a8
      // 8e: goto 95
      // 91: invokestatic tgr.a (Loov;)Loov;
      // 94: athrow
      // 95: bipush 0
      // 96: ireturn
      // 97: invokestatic tgr.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 3
      // 9c: getfield tgr.njd Ljava/lang/String;
      // 9f: ifnull a8
      // a2: bipush 0
      // a3: ireturn
      // a4: invokestatic tgr.a (Loov;)Loov;
      // a7: athrow
      // a8: bipush 1
      // a9: ireturn
      // aa: bipush 0
      // ab: ireturn
   }

   @Override
   public String toString() {
      long var1 = a ^ 122632587422643L;
      return a<"u">(2464, 8479288929185040305L ^ var1) + this.edc + a<"u">(7752, 4623662014470918232L ^ var1) + this.njd + '\'' + '}';
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield tgr.edc Ltgr$a3_;
      // 08: invokevirtual tgr$a3_.hashCode ()I
      // 0b: istore 2
      // 0c: bipush 31
      // 0e: iload 2
      // 0f: imul
      // 10: aload 0
      // 11: getfield tgr.njd Ljava/lang/String;
      // 14: iload 1
      // 15: ifeq 2d
      // 18: ifnull 33
      // 1b: goto 22
      // 1e: invokestatic tgr.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield tgr.njd Ljava/lang/String;
      // 26: goto 2d
      // 29: invokestatic tgr.a (Loov;)Loov;
      // 2c: athrow
      // 2d: invokevirtual java/lang/String.hashCode ()I
      // 30: goto 34
      // 33: bipush 0
      // 34: iadd
      // 35: istore 2
      // 36: iload 2
      // 37: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3496383590285814785L, 2571967482324588470L, MethodHandles.lookup().lookupClass()).a(221716499658759L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 107940675257875L;
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
      String var6 = "òçìs¥ÕN2ñdÅX¤\u008f\u008a\u0014¹ºÍ*Þ§zTS\u0091,¡nÄËdL\u0019¡\u0011§À,ù\u0018Å¥Çµª3æSõ\u0006Id¢ÁÍ@\\±îDª§jV";
      int var8 = "òçìs¥ÕN2ñdÅX¤\u008f\u008a\u0014¹ºÍ*Þ§zTS\u0091,¡nÄËdL\u0019¡\u0011§À,ù\u0018Å¥Çµª3æSõ\u0006Id¢ÁÍ@\\±îDª§jV".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24422;
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
            throw new RuntimeException("tgr", var10);
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
         throw new RuntimeException("tgr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
