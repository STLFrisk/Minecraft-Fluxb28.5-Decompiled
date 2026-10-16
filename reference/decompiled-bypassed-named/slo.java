import java.awt.Color;
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

public class slo implements zn8 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public String kv_() {
      long var1 = a ^ 98765565984653L;
      return a<"l">(26844, 411995266840267696L ^ var1);
   }

   @Override
   public void lml() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 03: ldc 4.0
      // 05: nop
      // 06: getstatic HudRenderer.r0a F
      // 09: fadd
      // 0a: fstore 2
      // 0b: invokestatic OpaquePredicate.b ()I
      // 0e: getstatic ClientState.qkk Lzwr;
      // 11: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 14: getstatic jsr.dyb Lcyb;
      // 17: invokevirtual ModuleRegistry.cre (Ljava/lang/Object;)Ljava/util/List;
      // 1a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1f: astore 3
      // 20: istore 1
      // 21: aload 3
      // 22: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 27: ifeq c6
      // 2a: aload 3
      // 2b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30: checkcast Module
      // 33: astore 4
      // 35: aload 4
      // 37: invokevirtual Module.i4q ()Ljava/lang/String;
      // 3a: astore 5
      // 3c: iload 1
      // 3d: ifeq c9
      // 40: aload 4
      // 42: invokevirtual Module.i4q ()Ljava/lang/String;
      // 45: aload 4
      // 47: invokevirtual Module.m2d ()Ljava/lang/String;
      // 4a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4d: iload 1
      // 4e: ifeq 6e
      // 51: goto 58
      // 54: invokestatic slo.a (Loov;)Loov;
      // 57: athrow
      // 58: ifeq 99
      // 5b: goto 62
      // 5e: invokestatic slo.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 4
      // 64: invokevirtual Module.gbf ()Z
      // 67: goto 6e
      // 6a: invokestatic slo.a (Loov;)Loov;
      // 6d: athrow
      // 6e: ifeq 99
      // 71: new java/lang/StringBuilder
      // 74: dup
      // 75: invokespecial java/lang/StringBuilder.<init> ()V
      // 78: aload 4
      // 7a: invokevirtual Module.m2d ()Ljava/lang/String;
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80: ldc " "
      // 82: nop
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: getstatic syo.rl1 Lsyo;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8c: aload 4
      // 8e: invokevirtual Module.o9i ()Ljava/lang/String;
      // 91: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 94: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 97: astore 5
      // 99: getstatic ipp.dra Lcrk;
      // 9c: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 9f: invokevirtual java/lang/Float.floatValue ()F
      // a2: getstatic ipp.t_q Lcrk;
      // a5: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // a8: invokevirtual java/lang/Float.floatValue ()F
      // ab: getstatic ipp.iwr Lcrk;
      // ae: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // b1: invokevirtual java/lang/Float.floatValue ()F
      // b4: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
      // b7: astore 6
      // b9: fload 2
      // ba: aload 5
      // bc: aload 6
      // be: invokestatic ju6.v33 (FLjava/lang/String;Ljava/awt/Color;)F
      // c1: fstore 2
      // c2: iload 1
      // c3: ifne 21
      // c6: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // c9: return
   }

   @Override
   public void fd7() {
      long var1 = a ^ 43488114109502L;
      jsr.ln8.ayi(a<"l">(26692, 1477620464029472922L ^ var1), 3.0F, 2.0F, Color.getHSBColor(ipp.dra.getValue(), ipp.t_q.getValue(), ipp.iwr.getValue()).getRGB());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2156687136866105504L, -3699662852896301366L, MethodHandles.lookup().lookupClass()).a(167696789199096L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 17985362142008L;
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
      String var6 = "Hò\u0016ñ²ë_\u0091R\u0095Fð\u009e\u001e\u008f0\u0010ð§ÉÀÞ°\u001eè°\u0002\"ÃæË¹ì";
      int var8 = "Hò\u0016ñ²ë_\u0091R\u0095Fð\u009e\u001e\u008f0\u0010ð§ÉÀÞ°\u001eè°\u0002\"ÃæË¹ì".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7482;
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
            throw new RuntimeException("slo", var10);
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
         throw new RuntimeException("slo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
