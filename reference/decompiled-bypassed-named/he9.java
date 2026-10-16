import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class he9 {
   private final HashMap r5w;
   private static final Lookup _os;
   private static Field efl;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public he9(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic he9.a J
      // 03: ldc2_w 73556789897165
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: invokespecial java/lang/Object.<init> ()V
      // 0c: invokestatic OpaquePredicate.c ()I
      // 0f: aload 0
      // 10: new java/util/HashMap
      // 13: dup
      // 14: invokespecial java/util/HashMap.<init> ()V
      // 17: putfield he9.r5w Ljava/util/HashMap;
      // 1a: istore 4
      // 1c: aload 1
      // 1d: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 20: astore 5
      // 22: getstatic he9.efl Ljava/lang/reflect/Field;
      // 25: astore 6
      // 27: aload 5
      // 29: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 2c: astore 7
      // 2e: aload 7
      // 30: arraylength
      // 31: istore 8
      // 33: bipush 0
      // 34: istore 9
      // 36: iload 9
      // 38: iload 8
      // 3a: if_icmpge ae
      // 3d: aload 7
      // 3f: iload 9
      // 41: aaload
      // 42: astore 10
      // 44: aload 10
      // 46: bipush 1
      // 47: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 4a: aload 10
      // 4c: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 4f: istore 11
      // 51: iload 4
      // 53: ifne e1
      // 56: iload 11
      // 58: invokestatic java/lang/reflect/Modifier.isFinal (I)Z
      // 5b: ifeq 78
      // 5e: goto 65
      // 61: invokestatic he9.a (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 64: athrow
      // 65: aload 6
      // 67: aload 10
      // 69: iload 11
      // 6b: bipush -17
      // 6d: iand
      // 6e: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 71: goto 78
      // 74: invokestatic he9.a (Ljava/lang/ClassNotFoundException;)Ljava/lang/ClassNotFoundException;
      // 77: athrow
      // 78: getstatic he9._os Ljava/lang/invoke/MethodHandles$Lookup;
      // 7b: aload 10
      // 7d: invokevirtual java/lang/invoke/MethodHandles$Lookup.unreflectSetter (Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;
      // 80: astore 12
      // 82: aload 12
      // 84: aload 12
      // 86: invokevirtual java/lang/invoke/MethodHandle.type ()Ljava/lang/invoke/MethodType;
      // 89: invokevirtual java/lang/invoke/MethodType.generic ()Ljava/lang/invoke/MethodType;
      // 8c: getstatic java/lang/Void.TYPE Ljava/lang/Class;
      // 8f: invokevirtual java/lang/invoke/MethodType.changeReturnType (Ljava/lang/Class;)Ljava/lang/invoke/MethodType;
      // 92: invokevirtual java/lang/invoke/MethodHandle.asType (Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
      // 95: astore 12
      // 97: aload 0
      // 98: getfield he9.r5w Ljava/util/HashMap;
      // 9b: aload 10
      // 9d: invokevirtual java/lang/reflect/Field.getName ()Ljava/lang/String;
      // a0: aload 12
      // a2: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // a5: pop
      // a6: iinc 9 1
      // a9: iload 4
      // ab: ifeq 36
      // ae: goto e1
      // b1: astore 5
      // b3: new java/lang/RuntimeException
      // b6: dup
      // b7: sipush 9627
      // ba: ldc2_w 682179712618925183
      // bd: lload 2
      // be: lxor
      // bf: invokedynamic q (IJ)Ljava/lang/String; bsm=he9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: nop
      // c5: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // c8: athrow
      // c9: astore 5
      // cb: new java/lang/RuntimeException
      // ce: dup
      // cf: sipush 18618
      // d2: ldc2_w 954049766463299932
      // d5: lload 2
      // d6: lxor
      // d7: invokedynamic q (IJ)Ljava/lang/String; bsm=he9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc: nop
      // dd: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // e0: athrow
      // e1: return
   }

   public void f64(String var1, Object var2) {
      Optional.ofNullable(this.r5w.get(var1)).ifPresent(he9::dkw);
   }

   private static void dkw(Object var0, MethodHandle var1) {
      try {
         var1.invokeExact((Object)var0);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1702635437528442648L, -3897823253042891453L, MethodHandles.lookup().lookupClass()).a(179977001336025L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 114441858664627L;
      Cipher var0;
      Cipher var17 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "\u009cè/>\u0097\u0013?\u0099Í\u0091\u0081ix\u009e\u0080Ø\u009a\u0014xó\u000fÃò'wd\u0011Ç\u00adc@º/\u0003[Zp\u0096uÅR\u008d\u0010CH&róãü²¹\u008ce\u009aQ´úq:ÞåÃt\u0018·æÁK\u0015l<]8N´bïç'0úØ;ÿ\u009b°A\u0082";
      int var6 = "\u009cè/>\u0097\u0013?\u0099Í\u0091\u0081ix\u009e\u0080Ø\u009a\u0014xó\u000fÃò'wd\u0011Ç\u00adc@º/\u0003[Zp\u0096uÅR\u008d\u0010CH&róãü²¹\u008ce\u009aQ´úq:ÞåÃt\u0018·æÁK\u0015l<]8N´bïç'0úØ;ÿ\u009b°A\u0082"
         .length();
      char var3 = '@';
      int var16 = -1;

      label42:
      while (true) {
         String var18 = var4.substring(++var16, var16 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var18.getBytes("ISO-8859-1"));
            String var24 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var24;
                  if ((var16 += var3) >= var6) {
                     b = var7;
                     c = new String[4];

                     try {
                        efl = Field.class.getDeclaredField(a<"q">(29733, 3345986657827238590L ^ var9));
                        efl.setAccessible(true);
                     } catch (NoSuchFieldException var14) {
                        var14.printStackTrace();
                     }

                     Lookup var11;
                     try {
                        Field var12 = Lookup.class.getDeclaredField(a<"q">(7775, 15351704614361286L ^ var9));
                        var12.setAccessible(true);
                        var11 = (Lookup)var12.get(null);
                     } catch (ReflectiveOperationException var13) {
                        var11 = MethodHandles.lookup();
                     }

                     _os = var11;
                     return;
                  }

                  var3 = var4.charAt(var16);
                  break;
               default:
                  var7[var5++] = var24;
                  if ((var16 += var3) < var6) {
                     var3 = var4.charAt(var16);
                     continue label42;
                  }

                  var4 = "TÔº\u0015Ù¡\u00995#Ç\u0080\fQ\u0017;#\u008dFUæ(P\u008c\u008e{\u008d¤ó«\u0099õê\u0004®R¸{Qµ\u000e#&\u0094ÁÛÂLá\u000f\u009ck\u0095C\u0004O7\u001b¬qpAp§\u001aß1 \u0082=µIOî Ñ\u0002lN7M égI¶iI\u0093E\u0005ó\u001b\u001bjx#çHw\u001cc!\u0086Ö¹T\u0094}Ö(ØÛi";
                  var6 = "TÔº\u0015Ù¡\u00995#Ç\u0080\fQ\u0017;#\u008dFUæ(P\u008c\u008e{\u008d¤ó«\u0099õê\u0004®R¸{Qµ\u000e#&\u0094ÁÛÂLá\u000f\u009ck\u0095C\u0004O7\u001b¬qpAp§\u001aß1 \u0082=µIOî Ñ\u0002lN7M égI¶iI\u0093E\u0005ó\u001b\u001bjx#çHw\u001cc!\u0086Ö¹T\u0094}Ö(ØÛi"
                     .length();
                  var3 = 'P';
                  var16 = -1;
            }

            var18 = var4.substring(++var16, var16 + var3);
            var10001 = 0;
         }
      }
   }

   private static ClassNotFoundException a(ClassNotFoundException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28286;
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
            throw new RuntimeException("he9", var10);
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
         throw new RuntimeException("he9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
