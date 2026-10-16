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

public class y3k {
   public float[] i9w;
   public final int fv4;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public y3k(float[] var1, int var2) {
      this.i9w = var1;
      this.fv4 = var2;
   }

   public float f81(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic y3k.a J
      // 03: ldc2_w 112653932840872
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 3b
      // 13: getfield y3k.i9w [F
      // 16: ifnonnull 3a
      // 19: goto 20
      // 1c: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: new java/lang/NullPointerException
      // 23: dup
      // 24: sipush 32097
      // 27: ldc2_w 8248221081429052588
      // 2a: lload 2
      // 2b: lxor
      // 2c: invokedynamic h (IJ)Ljava/lang/String; bsm=y3k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: invokespecial y3k.iy7 (I)I
      // 3f: istore 5
      // 41: iload 5
      // 43: iload 4
      // 45: ifne 54
      // 48: ifeq 65
      // 4b: goto 52
      // 4e: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 51: athrow
      // 52: iload 5
      // 54: bipush 1
      // 55: if_icmpeq 65
      // 58: aload 0
      // 59: getfield y3k.i9w [F
      // 5c: bipush 2
      // 5d: faload
      // 5e: goto 6b
      // 61: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 64: athrow
      // 65: aload 0
      // 66: getfield y3k.i9w [F
      // 69: bipush 0
      // 6a: faload
      // 6b: freturn
   }

   public float tek(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic y3k.a J
      // 03: ldc2_w 14251843594957
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 3b
      // 13: getfield y3k.i9w [F
      // 16: ifnonnull 3a
      // 19: goto 20
      // 1c: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1f: athrow
      // 20: new java/lang/NullPointerException
      // 23: dup
      // 24: sipush 27317
      // 27: ldc2_w 8174295401137206812
      // 2a: lload 2
      // 2b: lxor
      // 2c: invokedynamic h (IJ)Ljava/lang/String; bsm=y3k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 35: athrow
      // 36: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: invokespecial y3k.iy7 (I)I
      // 3f: istore 5
      // 41: iload 5
      // 43: iload 4
      // 45: ifeq 54
      // 48: ifeq 65
      // 4b: goto 52
      // 4e: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 51: athrow
      // 52: iload 5
      // 54: bipush 3
      // 55: if_icmpeq 65
      // 58: aload 0
      // 59: getfield y3k.i9w [F
      // 5c: bipush 3
      // 5d: faload
      // 5e: goto 6b
      // 61: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 64: athrow
      // 65: aload 0
      // 66: getfield y3k.i9w [F
      // 69: bipush 1
      // 6a: faload
      // 6b: freturn
   }

   private int iy7(int var1) {
      return (var1 + this.fv4 / 90) % 4;
   }

   public int tg7(int var1) {
      return (var1 + (4 - this.fv4 / 90)) % 4;
   }

   public void p71(float[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1e
      // 09: getfield y3k.i9w [F
      // 0c: ifnonnull 22
      // 0f: goto 16
      // 12: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic y3k.a (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
      // 1d: athrow
      // 1e: aload 1
      // 1f: putfield y3k.i9w [F
      // 22: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1488508188290979931L, 4364174346497878630L, MethodHandles.lookup().lookupClass()).a(197232676824672L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 79956009806663L;
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
      String var6 = "ó\u0010ÒíØ\u0083q×\u0094Â\u0001d\u0097\u0005¥<\u0010\u0096\u0007¬)\u0003\u0085M\t\u0012\u0014l(|8\u0002a";
      int var8 = "ó\u0010ÒíØ\u0083q×\u0094Â\u0001d\u0097\u0005¥<\u0010\u0096\u0007¬)\u0003\u0085M\t\u0012\u0014l(|8\u0002a".length();
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
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static NullPointerException a(NullPointerException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5837;
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
            throw new RuntimeException("y3k", var10);
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
         throw new RuntimeException("y3k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
