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

public class axk {
   public static final axk sar;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public axk(String var1) {
      this.ur_ = var1;
   }

   public boolean vol() {
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
      // 05: getfield axk.ur_ Ljava/lang/String;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic axk.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield axk.ur_ Ljava/lang/String;
      // 1a: goto 21
      // 1d: invokestatic axk.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual java/lang/String.isEmpty ()Z
      // 24: iload 1
      // 25: ifeq 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic axk.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public String o7p() {
      return this.ur_;
   }

   public void fze(bdo var1) {
      long var2 = a ^ 105836363703817L;
      var1.rjq(a<"h">(8551, 1647281217112938032L ^ var2), this.ur_);
   }

   public static axk yq_(bdo param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic axk.a J
      // 03: ldc2_w 24916711747355
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: sipush 11151
      // 10: ldc2_w 609333322832369099
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic h (IJ)Ljava/lang/String; bsm=axk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: iload 3
      // 1c: ifne 44
      // 1f: bipush 8
      // 21: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 24: ifeq 53
      // 27: goto 2e
      // 2a: invokestatic axk.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: sipush 11151
      // 32: ldc2_w 609333322832369099
      // 35: lload 1
      // 36: lxor
      // 37: invokedynamic h (IJ)Ljava/lang/String; bsm=axk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: goto 44
      // 40: invokestatic axk.a (Loov;)Loov;
      // 43: athrow
      // 44: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 47: astore 4
      // 49: new axk
      // 4c: dup
      // 4d: aload 4
      // 4f: invokespecial axk.<init> (Ljava/lang/String;)V
      // 52: areturn
      // 53: getstatic axk.sar Laxk;
      // 56: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(970783075760058203L, -2481412003115494518L, MethodHandles.lookup().lookupClass()).a(76308721149453L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 19914726339591L;
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
      String var6 = "pÄ\u001a\u009c\u0093c\u008d²L\u0080m:M\u00880X\u0010bd\u0003\u0003¦ÆXÆt£Ä-\u0007{«z";
      int var8 = "pÄ\u001a\u009c\u0093c\u008d²L\u0080m:M\u00880X\u0010bd\u0003\u0003¦ÆXÆt£Ä-\u0007{«z".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            sar = new axk("");
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31892;
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
            throw new RuntimeException("axk", var10);
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
         throw new RuntimeException("axk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
