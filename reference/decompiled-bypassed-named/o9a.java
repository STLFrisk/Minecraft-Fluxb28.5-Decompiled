import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o9a implements Predicate {
   private final g92 zpf;
   private final Map qmd = Maps.newHashMap();
   private static final long a;
   private static final String b;

   private o9a(g92 var1) {
      this.zpf = var1;
   }

   public static o9a utk(e0x var0) {
      return new o9a(var0.w_4());
   }

   public boolean no2(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 14
      // 09: ifnull 98
      // 0c: goto 13
      // 0f: invokestatic o9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 12: athrow
      // 13: aload 1
      // 14: invokeinterface zfz.r_y ()Le0x; 1
      // 19: aload 0
      // 1a: getfield o9a.zpf Lg92;
      // 1d: invokevirtual g92.m68 ()Le0x;
      // 20: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 23: iload 2
      // 24: ifeq 99
      // 27: ifeq 98
      // 2a: goto 31
      // 2d: invokestatic o9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30: athrow
      // 31: aload 0
      // 32: getfield o9a.qmd Ljava/util/Map;
      // 35: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 3a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 3f: astore 3
      // 40: aload 3
      // 41: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 46: ifeq 96
      // 49: aload 3
      // 4a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4f: checkcast java/util/Map$Entry
      // 52: astore 4
      // 54: aload 1
      // 55: aload 4
      // 57: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 5c: checkcast xny
      // 5f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 64: astore 5
      // 66: aload 4
      // 68: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 6d: checkcast com/google/common/base/Predicate
      // 70: aload 5
      // 72: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 77: iload 2
      // 78: ifeq 97
      // 7b: iload 2
      // 7c: ifeq 91
      // 7f: goto 86
      // 82: invokestatic o9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 85: athrow
      // 86: ifne 92
      // 89: goto 90
      // 8c: invokestatic o9a.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8f: athrow
      // 90: bipush 0
      // 91: ireturn
      // 92: iload 2
      // 93: ifne 40
      // 96: bipush 1
      // 97: ireturn
      // 98: bipush 0
      // 99: ireturn
   }

   public o9a zpr(xny var1, Predicate var2) {
      long var3 = a ^ 56427251817945L;

      try {
         if (!this.zpf.o0r().contains(var1)) {
            throw new IllegalArgumentException(this.zpf + b + var1);
         }
      } catch (IllegalArgumentException var5) {
         throw a(var5);
      }

      this.qmd.put(var1, var2);
      return this;
   }

   public boolean apply(Object var1) {
      return this.no2((zfz)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6281609646327272395L, -1257290972500929705L, MethodHandles.lookup().lookupClass()).a(15489341064411L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 5517684223156L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("V³öG\u000fLUKaT\u001c\u0013\u0006a\u0098h\u0007Tª±dÐ\u009c\u0083¡ù\u009b§\u0083¡\u0081\u00ad".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
