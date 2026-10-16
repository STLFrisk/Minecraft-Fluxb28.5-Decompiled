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

public class ju6 implements zn8 {
   public int gql = 500;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public String kv_() {
      long var1 = a ^ 85455126940183L;
      return a<"f">(6417, 8704584206686672297L ^ var1);
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield ju6.iql F
      // 008: fconst_1
      // 009: iload 1
      // 00a: ifne 04e
      // 00d: fcmpl
      // 00e: ifle 024
      // 011: goto 018
      // 014: invokestatic ju6.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: fconst_0
      // 01a: putfield ju6.iql F
      // 01d: goto 024
      // 020: invokestatic ju6.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 0
      // 025: dup
      // 026: getfield ju6.iql F
      // 029: ldc 0.001
      // 02b: nop
      // 02c: aload 0
      // 02d: getfield ju6._j3 Lnhs;
      // 030: invokevirtual nhs.ovy ()J
      // 033: l2f
      // 034: ldc 0.4
      // 036: nop
      // 037: fmul
      // 038: fmul
      // 039: fadd
      // 03a: putfield ju6.iql F
      // 03d: aload 0
      // 03e: getfield ju6._j3 Lnhs;
      // 041: invokevirtual nhs.zay ()V
      // 044: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 047: aload 0
      // 048: getfield ju6.iql F
      // 04b: ldc 0.5
      // 04d: nop
      // 04e: fconst_1
      // 04f: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
      // 052: putstatic zwr.jev Ljava/awt/Color;
      // 055: aload 0
      // 056: getfield ju6.iql F
      // 059: fstore 2
      // 05a: ldc 4.0
      // 05c: nop
      // 05d: getstatic jej.r0a F
      // 060: fadd
      // 061: fstore 3
      // 062: getstatic zwr.qkk Lzwr;
      // 065: invokevirtual zwr.zj2 ()Lkgt;
      // 068: getstatic jsr.dyb Lcyb;
      // 06b: invokevirtual kgt.cre (Ljava/lang/Object;)Ljava/util/List;
      // 06e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 073: astore 4
      // 075: aload 4
      // 077: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 07c: ifeq 144
      // 07f: aload 4
      // 081: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 086: checkcast ar7
      // 089: astore 5
      // 08b: aload 5
      // 08d: invokevirtual ar7.i4q ()Ljava/lang/String;
      // 090: astore 6
      // 092: iload 1
      // 093: ifne 147
      // 096: aload 5
      // 098: invokevirtual ar7.i4q ()Ljava/lang/String;
      // 09b: aload 5
      // 09d: invokevirtual ar7.m2d ()Ljava/lang/String;
      // 0a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a3: iload 1
      // 0a4: ifne 108
      // 0a7: goto 0ae
      // 0aa: invokestatic ju6.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: ifeq 0fa
      // 0b1: goto 0b8
      // 0b4: invokestatic ju6.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 5
      // 0ba: invokevirtual ar7.gbf ()Z
      // 0bd: iload 1
      // 0be: ifne 108
      // 0c1: goto 0c8
      // 0c4: invokestatic ju6.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: ifeq 0fa
      // 0cb: goto 0d2
      // 0ce: invokestatic ju6.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: new java/lang/StringBuilder
      // 0d5: dup
      // 0d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d9: aload 5
      // 0db: invokevirtual ar7.m2d ()Ljava/lang/String;
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: ldc " "
      // 0e3: nop
      // 0e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e7: getstatic syo.rl1 Lsyo;
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ed: aload 5
      // 0ef: invokevirtual ar7.o9i ()Ljava/lang/String;
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f8: astore 6
      // 0fa: fload 2
      // 0fb: fconst_1
      // 0fc: iload 1
      // 0fd: ifne 119
      // 100: fcmpl
      // 101: goto 108
      // 104: invokestatic ju6.a (Loov;)Loov;
      // 107: athrow
      // 108: ifle 10f
      // 10b: fload 2
      // 10c: fconst_1
      // 10d: fsub
      // 10e: fstore 2
      // 10f: fload 2
      // 110: getstatic ipp.t_q Lcrk;
      // 113: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 116: invokevirtual java/lang/Float.floatValue ()F
      // 119: getstatic ipp.iwr Lcrk;
      // 11c: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 11f: invokevirtual java/lang/Float.floatValue ()F
      // 122: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
      // 125: astore 7
      // 127: fload 2
      // 128: getstatic ipp.dra Lcrk;
      // 12b: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 12e: invokevirtual java/lang/Float.floatValue ()F
      // 131: ldc 10.0
      // 133: nop
      // 134: fdiv
      // 135: fadd
      // 136: fstore 2
      // 137: fload 3
      // 138: aload 6
      // 13a: aload 7
      // 13c: invokestatic ju6.v33 (FLjava/lang/String;Ljava/awt/Color;)F
      // 13f: fstore 3
      // 140: iload 1
      // 141: ifeq 075
      // 144: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 147: return
   }

   public static float v33(float var0, String var1, Color var2) {
      float var3 = (float)iyr.u0n().x05() - jsr.dyb.ax2(var1) - 4.5F;
      float var4 = 3.0F;
      iyr.rm2(
         (double)(var3 - 3.0F + 0.5F),
         (double)var0 - 1.0,
         (double)(var3 + jsr.dyb.ax2(var1) + 3.0F + 5.0F),
         (double)(var0 + jsr.dyb.wni(var1)) + 1.0,
         new Color(0, 0, 0, 130)
      );
      iyr.rm2((double)iyr.u0n().x05() - 1.5, (double)var0 - 1.0, (double)iyr.u0n().x05(), (double)(var0 + jsr.dyb.wni(var1)) + 1.0, var2);
      jsr.dyb.fzf(var1, var3, var0, var2.getRGB());
      return var0 + jsr.dyb.wni(var1) + 2.0F;
   }

   @Override
   public void fd7() {
      long var1 = a ^ 57064706693540L;
      jsr.ln8.ayi(a<"f">(6490, 4435000283973961296L ^ var1), 3.0F, 2.0F, Color.getHSBColor(this.iql, 0.5F, 1.0F).getRGB());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1433592476509182302L, 976385418601513030L, MethodHandles.lookup().lookupClass()).a(72833725879182L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 17430945713523L;
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
      String var6 = "OÔ\u00847Y#ª\u001eR\u008f\u0095Á\u000eÐ0s\u0010Ò\u008bi1ã1ÃWÜ\u009c%\u0082øY\f\u0016";
      int var8 = "OÔ\u00847Y#ª\u001eR\u008f\u0095Á\u000eÐ0s\u0010Ò\u008bi1ã1ÃWÜ\u009c%\u0082øY\f\u0016".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13038;
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
            throw new RuntimeException("ju6", var10);
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
         throw new RuntimeException("ju6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
