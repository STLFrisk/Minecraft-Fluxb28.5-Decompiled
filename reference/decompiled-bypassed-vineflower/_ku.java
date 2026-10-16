import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ku extends ev3 {
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public _ku(String var1, int var2, int var3) {
      long var4 = a ^ 136053000197416L;
      super(var1, Integer.class);
      if (var2 < 0) {
         throw new IllegalArgumentException(b<"e">(3627, 6138640945069808528L ^ var4) + var1 + b<"e">(4980, 2081971009231242956L ^ var4));
      } else {
         try {
            if (var3 <= var2) {
               throw new IllegalArgumentException(b<"e">(4856, 767878042794870593L ^ var4) + var1 + b<"e">(28031, 1571398701390215365L ^ var4) + var2 + ")");
            }
         } catch (IllegalArgumentException var9) {
            throw a(var9);
         }

         HashSet var6 = Sets.newHashSet();
         int var7 = var2;

         try {
            while (var7 <= var3) {
               var6.add(var7);
               var7++;
            }
         } catch (IllegalArgumentException var8) {
            throw a(var8);
         }

         this.lvs = ImmutableSet.copyOf(var6);
      }
   }

   @Override
   public Collection isr() {
      return this.lvs;
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
      // 10: invokestatic _ku.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic _ku.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 19: athrow
      // 1a: aload 1
      // 1b: ifnull 6c
      // 1e: aload 0
      // 1f: iload 2
      // 20: ifne 43
      // 23: goto 2a
      // 26: invokestatic _ku.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29: athrow
      // 2a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2d: aload 1
      // 2e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 31: if_acmpne 6c
      // 34: goto 3b
      // 37: invokestatic _ku.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: goto 43
      // 3f: invokestatic _ku.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42: athrow
      // 43: iload 2
      // 44: ifne 5f
      // 47: aload 1
      // 48: invokespecial ev3.equals (Ljava/lang/Object;)Z
      // 4b: ifne 5b
      // 4e: goto 55
      // 51: invokestatic _ku.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: invokestatic _ku.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5a: athrow
      // 5b: aload 1
      // 5c: checkcast _ku
      // 5f: astore 3
      // 60: aload 0
      // 61: getfield _ku.lvs Lcom/google/common/collect/ImmutableSet;
      // 64: aload 3
      // 65: getfield _ku.lvs Lcom/google/common/collect/ImmutableSet;
      // 68: invokevirtual com/google/common/collect/ImmutableSet.equals (Ljava/lang/Object;)Z
      // 6b: ireturn
      // 6c: bipush 0
      // 6d: ireturn
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      return 31 * var1 + this.lvs.hashCode();
   }

   public static _ku wgl(String var0, int var1, int var2) {
      return new _ku(var0, var1, var2);
   }

   public String vpp(Integer var1) {
      return var1.toString();
   }

   @Override
   public String _lf(Comparable var1) {
      return this.vpp((Integer)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7843965105894675237L, -5674146622996556179L, MethodHandles.lookup().lookupClass()).a(263251872242118L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 113133220954492L;
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
      String var6 = "\u0007þÀe\u0004\fñõ8²ñõ\u0011¶HV3¾\u0096f]7E$\u0007i\u0086\u001b|æ\u0086\u008fvsé¥:7RÐ\u0018\u0015Ä!|Ì»ß\u0019=&\u001eù´s¬\u0013z\u0090G\rø'0Ï";
      int var8 = "\u0007þÀe\u0004\fñõ8²ñõ\u0011¶HV3¾\u0096f]7E$\u0007i\u0086\u001b|æ\u0086\u008fvsé¥:7RÐ\u0018\u0015Ä!|Ì»ß\u0019=&\u001eù´s¬\u0013z\u0090G\rø'0Ï"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     f = var9;
                     g = new String[4];
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

                  var6 = "T\u008fI]5½\\W\u007f´5,äÂ\u0089¨ßÂË~TÌ¿(Èt\u0007\u008d\u009fÚ\u000eGCk\u008b\\\u007f\u000bú¥\u0082pìTËÅù9 Dí¨Y(a}%$q®mL\u001fD-b\u0016\u0017\tÇê\u0096\u000fÜ¸ó$ê1\u0087¾";
                  var8 = "T\u008fI]5½\\W\u007f´5,äÂ\u0089¨ßÂË~TÌ¿(Èt\u0007\u008d\u009fÚ\u000eGCk\u008b\\\u007f\u000bú¥\u0082pìTËÅù9 Dí¨Y(a}%$q®mL\u001fD-b\u0016\u0017\tÇê\u0096\u000fÜ¸ó$ê1\u0087¾"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10651;
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
            throw new RuntimeException("_ku", var10);
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
         throw new RuntimeException("_ku" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
