import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ncl {
   public static List bzy;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void dob(String var0) {
      long var1 = a ^ 56713579724856L;
      Minecraft.vz1().vg8.a0d(new tao(syo.c8f + a<"u">(29119, 3427441740218398717L ^ var1) + syo.qiz + var0));
   }

   public static void vhi(String var0) {
      Minecraft.vz1().vg8.vf0(var0);
   }

   public static void bt6(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ncl.a J
      // 03: ldc2_w 28826063662218
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: getstatic ncl.bzy Ljava/util/List;
      // 0f: aload 0
      // 10: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 15: iload 3
      // 16: ifeq 37
      // 19: ifne 45
      // 1c: goto 23
      // 1f: invokestatic ncl.a (Loov;)Loov;
      // 22: athrow
      // 23: invokestatic Minecraft.vz1 ()Lc05;
      // 26: getfield Minecraft.vg8 Ll86;
      // 29: invokevirtual EntityPlayerSP.noc ()Ljava/lang/String;
      // 2c: aload 0
      // 2d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 30: goto 37
      // 33: invokestatic ncl.a (Loov;)Loov;
      // 36: athrow
      // 37: iload 3
      // 38: ifeq 4f
      // 3b: ifeq 46
      // 3e: goto 45
      // 41: invokestatic ncl.a (Loov;)Loov;
      // 44: athrow
      // 45: return
      // 46: getstatic ncl.bzy Ljava/util/List;
      // 49: aload 0
      // 4a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4f: pop
      // 50: invokestatic Minecraft.vz1 ()Lc05;
      // 53: getfield Minecraft.vg8 Ll86;
      // 56: new java/lang/StringBuilder
      // 59: dup
      // 5a: invokespecial java/lang/StringBuilder.<init> ()V
      // 5d: sipush 5972
      // 60: ldc2_w 8680239118894300583
      // 63: lload 1
      // 64: lxor
      // 65: invokedynamic u (IJ)Ljava/lang/String; bsm=ncl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: nop
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: aload 0
      // 6f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 72: sipush 13386
      // 75: ldc2_w 3552332040212012731
      // 78: lload 1
      // 79: lxor
      // 7a: invokedynamic u (IJ)Ljava/lang/String; bsm=ncl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 86: invokevirtual EntityPlayerSP.vf0 (Ljava/lang/String;)V
      // 89: return
   }

   public static void zpu(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ncl.a J
      // 03: ldc2_w 9202485074461
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: getstatic ClientState.jut Z
      // 0f: iload 3
      // 10: ifne 24
      // 13: ifne 1e
      // 16: goto 1d
      // 19: invokestatic ncl.a (Loov;)Loov;
      // 1c: athrow
      // 1d: return
      // 1e: getstatic ModuleRegistry.trf Lar7;
      // 21: invokevirtual Module.klu ()Z
      // 24: ifne 28
      // 27: return
      // 28: invokestatic Minecraft.vz1 ()Lc05;
      // 2b: getfield Minecraft.vg8 Ll86;
      // 2e: iload 3
      // 2f: ifne 62
      // 32: ifnonnull 5c
      // 35: goto 3c
      // 38: invokestatic ncl.a (Loov;)Loov;
      // 3b: athrow
      // 3c: invokestatic Minecraft.vz1 ()Lc05;
      // 3f: iload 3
      // 40: ifne 5f
      // 43: goto 4a
      // 46: invokestatic ncl.a (Loov;)Loov;
      // 49: athrow
      // 4a: getfield Minecraft.tij Lkh3;
      // 4d: ifnonnull 5c
      // 50: goto 57
      // 53: invokestatic ncl.a (Loov;)Loov;
      // 56: athrow
      // 57: return
      // 58: invokestatic ncl.a (Loov;)Loov;
      // 5b: athrow
      // 5c: invokestatic Minecraft.vz1 ()Lc05;
      // 5f: getfield Minecraft.vg8 Ll86;
      // 62: new tao
      // 65: dup
      // 66: new java/lang/StringBuilder
      // 69: dup
      // 6a: invokespecial java/lang/StringBuilder.<init> ()V
      // 6d: sipush 14282
      // 70: ldc2_w 8464058132401204143
      // 73: lload 1
      // 74: lxor
      // 75: invokedynamic u (IJ)Ljava/lang/String; bsm=ncl.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7e: getstatic syo.qiz Lsyo;
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 84: aload 0
      // 85: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 88: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8b: invokespecial tao.<init> (Ljava/lang/String;)V
      // 8e: invokevirtual EntityPlayerSP.a0d (Lekw;)V
      // 91: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1588595905934663795L, -2575885366467048442L, MethodHandles.lookup().lookupClass()).a(239817625789857L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 24092624709598L;
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
      String var6 = "\u0099¹On4+í;àà\u0012Æj±§b/Æ<\u000e|'\u008aNÏ\u0091\u0007\u0018\u001c\u001d\u008c*þ\u0098\u008b¯ù°4»;{\u009f\u008a$\u009bgËÚÀ\u0002Ó±\u0012y·ÖB§uï&\u0094SnÏ\u00add\u0085à5ÛW>ç9\u0093QEú\u0091Eß´ç#}'\u0010Sÿ\u001c\u0000\u008ah.j\u0093ô,Zè)÷©";
      int var8 = "\u0099¹On4+í;àà\u0012Æj±§b/Æ<\u000e|'\u008aNÏ\u0091\u0007\u0018\u001c\u001d\u008c*þ\u0098\u008b¯ù°4»;{\u009f\u008a$\u009bgËÚÀ\u0002Ó±\u0012y·ÖB§uï&\u0094SnÏ\u00add\u0085à5ÛW>ç9\u0093QEú\u0091Eß´ç#}'\u0010Sÿ\u001c\u0000\u008ah.j\u0093ô,Zè)÷©"
         .length();
      char var5 = 'X';
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
                     bzy = new ArrayList();
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

                  var6 = "\u0016\u0007\u001eîM\u0094í/:Z\u0087³Å\u001dÂº\u0018\u008dýP\u008f4\u008b7\u0007ýMr¹¡9@ÁÉp=ë\u001d\u000b¾_";
                  var8 = "\u0016\u0007\u001eîM\u0094í/:Z\u0087³Å\u001dÂº\u0018\u008dýP\u008f4\u008b7\u0007ýMr¹¡9@ÁÉp=ë\u001d\u000b¾_".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14673;
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
            throw new RuntimeException("ncl", var10);
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
         throw new RuntimeException("ncl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
