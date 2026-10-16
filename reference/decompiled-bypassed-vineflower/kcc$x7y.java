import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.StringUtils;

public class kcc$x7y {
   private String eng = null;
   private final List z3l = Lists.newArrayList();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private kcc$x7y() {
   }

   private void xni(String var1) {
      this.z3l.add(0, var1);
   }

   public String bat() {
      long var1 = a ^ 80872097266330L;
      return StringUtils.join(this.z3l, a<"a">(29681, 6513482124268443041L ^ var1));
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic kcc$x7y.a J
      // 03: ldc2_w 120208549382831
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 69
      // 11: getfield kcc$x7y.eng Ljava/lang/String;
      // 14: ifnull 68
      // 17: goto 1e
      // 1a: invokestatic kcc$x7y.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: iload 3
      // 20: ifne 62
      // 23: goto 2a
      // 26: invokestatic kcc$x7y.a (Loov;)Loov;
      // 29: athrow
      // 2a: getfield kcc$x7y.z3l Ljava/util/List;
      // 2d: invokeinterface java/util/List.isEmpty ()Z 1
      // 32: ifne 61
      // 35: goto 3c
      // 38: invokestatic kcc$x7y.a (Loov;)Loov;
      // 3b: athrow
      // 3c: new java/lang/StringBuilder
      // 3f: dup
      // 40: invokespecial java/lang/StringBuilder.<init> ()V
      // 43: aload 0
      // 44: getfield kcc$x7y.eng Ljava/lang/String;
      // 47: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a: ldc " "
      // 4c: nop
      // 4d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50: aload 0
      // 51: invokevirtual kcc$x7y.bat ()Ljava/lang/String;
      // 54: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5a: goto ab
      // 5d: invokestatic kcc$x7y.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: getfield kcc$x7y.eng Ljava/lang/String;
      // 65: goto ab
      // 68: aload 0
      // 69: getfield kcc$x7y.z3l Ljava/util/List;
      // 6c: invokeinterface java/util/List.isEmpty ()Z 1
      // 71: ifne 9d
      // 74: new java/lang/StringBuilder
      // 77: dup
      // 78: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b: sipush 25413
      // 7e: ldc2_w 6633616284761109794
      // 81: lload 1
      // 82: lxor
      // 83: invokedynamic a (IJ)Ljava/lang/String; bsm=kcc$x7y.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: nop
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: aload 0
      // 8d: invokevirtual kcc$x7y.bat ()Ljava/lang/String;
      // 90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 96: goto ab
      // 99: invokestatic kcc$x7y.a (Loov;)Loov;
      // 9c: athrow
      // 9d: sipush 9629
      // a0: ldc2_w 2605308750042330105
      // a3: lload 1
      // a4: lxor
      // a5: invokedynamic a (IJ)Ljava/lang/String; bsm=kcc$x7y.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: nop
      // ab: areturn
   }

   public kcc$x7y(kcc$1 var1) {
      this();
   }

   public static void y4r(kcc$x7y var0, String var1) {
      var0.xni(var1);
   }

   public static String anc(kcc$x7y var0, String var1) {
      return var0.eng = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7735489687160187743L, 3557158170145912902L, MethodHandles.lookup().lookupClass()).a(108351429818174L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 78127024574059L;
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
      String var6 = "K\u001f\u0085r.l§:Ò í\u000b\u008d\u0097\u0006\u009e\u0018a©wÁ¦¿\u0087`3d\u0014\u0005èP<ñ\u009a){tY\u0015®ñ\u0018v±»3D\u000fPT=2k\u0083%\u0095+ÑE\u008f\u0001\u009eêpÜ²";
      int var8 = "K\u001f\u0085r.l§:Ò í\u000b\u008d\u0097\u0006\u009e\u0018a©wÁ¦¿\u0087`3d\u0014\u0005èP<ñ\u009a){tY\u0015®ñ\u0018v±»3D\u000fPT=2k\u0083%\u0095+ÑE\u008f\u0001\u009eêpÜ²"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16980;
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
            throw new RuntimeException("kcc$x7y", var10);
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
         throw new RuntimeException("kcc$x7y" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
