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

public class k47 extends g6r {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public k47(float param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k47.a J
      // 03: ldc2_w 44325167927244
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: invokespecial g6r.<init> ()V
      // 0c: invokestatic t9d.c ()I
      // 0f: aload 0
      // 10: new tf8
      // 13: dup
      // 14: aload 0
      // 15: sipush 19112
      // 18: ldc2_w 6481213309222552868
      // 1b: lload 3
      // 1c: lxor
      // 1d: invokedynamic x (IJ)Ljava/lang/String; bsm=k47.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: nop
      // 23: invokespecial tf8.<init> (Lg6r;Ljava/lang/String;)V
      // 26: putfield k47.zxd Ltf8;
      // 29: istore 5
      // 2b: aload 0
      // 2c: getfield k47.zxd Ltf8;
      // 2f: bipush 0
      // 30: bipush 0
      // 31: invokevirtual tf8.fc6 (II)Ltf8;
      // 34: ldc -4.0
      // 36: nop
      // 37: ldc -4.0
      // 39: nop
      // 3a: ldc -4.0
      // 3c: nop
      // 3d: bipush 8
      // 3f: bipush 8
      // 41: bipush 8
      // 43: invokevirtual tf8.ge4 (FFFIII)Ltf8;
      // 46: pop
      // 47: aload 0
      // 48: new tf8
      // 4b: dup
      // 4c: aload 0
      // 4d: sipush 15773
      // 50: ldc2_w 8636333697125708306
      // 53: lload 3
      // 54: lxor
      // 55: invokedynamic x (IJ)Ljava/lang/String; bsm=k47.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: nop
      // 5b: invokespecial tf8.<init> (Lg6r;Ljava/lang/String;)V
      // 5e: putfield k47.yef Ltf8;
      // 61: aload 0
      // 62: getfield k47.yef Ltf8;
      // 65: bipush 32
      // 67: bipush 0
      // 68: invokevirtual tf8.fc6 (II)Ltf8;
      // 6b: ldc -4.0
      // 6d: nop
      // 6e: ldc -4.0
      // 70: nop
      // 71: ldc -4.0
      // 73: nop
      // 74: bipush 8
      // 76: bipush 8
      // 78: bipush 8
      // 7a: invokevirtual tf8.ge4 (FFFIII)Ltf8;
      // 7d: pop
      // 7e: iload 5
      // 80: ifne af
      // 83: iload 2
      // 84: ifeq c9
      // 87: goto 8e
      // 8a: invokestatic k47.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: new tf8
      // 92: dup
      // 93: aload 0
      // 94: sipush 19167
      // 97: ldc2_w 4210349595925841233
      // 9a: lload 3
      // 9b: lxor
      // 9c: invokedynamic x (IJ)Ljava/lang/String; bsm=k47.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: nop
      // a2: invokespecial tf8.<init> (Lg6r;Ljava/lang/String;)V
      // a5: putfield k47.bw6 Ltf8;
      // a8: goto af
      // ab: invokestatic k47.a (Loov;)Loov;
      // ae: athrow
      // af: aload 0
      // b0: getfield k47.bw6 Ltf8;
      // b3: bipush 0
      // b4: bipush 16
      // b6: invokevirtual tf8.fc6 (II)Ltf8;
      // b9: ldc -6.0
      // bb: nop
      // bc: fconst_0
      // bd: ldc -6.0
      // bf: nop
      // c0: bipush 12
      // c2: bipush 4
      // c3: bipush 12
      // c5: invokevirtual tf8.ge4 (FFFIII)Ltf8;
      // c8: pop
      // c9: return
   }

   @Override
   public void s_q(i2h param1, float param2, float param3, float param4, float param5, float param6, float param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic hzu.dp2 ()V
      // 03: fconst_2
      // 04: fconst_2
      // 05: fconst_2
      // 06: invokestatic hzu.syc (FFF)V
      // 09: invokestatic t9d.b ()I
      // 0c: fconst_0
      // 0d: ldc -0.5
      // 0f: nop
      // 10: fconst_0
      // 11: invokestatic hzu.a4k (FFF)V
      // 14: istore 8
      // 16: aload 0
      // 17: getfield k47.bw6 Ltf8;
      // 1a: iload 8
      // 1c: ifeq 5c
      // 1f: ifnull 39
      // 22: goto 29
      // 25: invokestatic k47.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield k47.bw6 Ltf8;
      // 2d: fload 7
      // 2f: invokevirtual tf8.vca (F)V
      // 32: goto 39
      // 35: invokestatic k47.a (Loov;)Loov;
      // 38: athrow
      // 39: fload 3
      // 3a: fconst_0
      // 3b: fconst_1
      // 3c: fconst_0
      // 3d: invokestatic hzu.a2h (FFFF)V
      // 40: fconst_0
      // 41: ldc 0.8
      // 43: nop
      // 44: fload 4
      // 46: fadd
      // 47: fconst_0
      // 48: invokestatic hzu.a4k (FFF)V
      // 4b: ldc 60.0
      // 4d: nop
      // 4e: ldc 0.7071
      // 50: nop
      // 51: fconst_0
      // 52: ldc 0.7071
      // 54: nop
      // 55: invokestatic hzu.a2h (FFFF)V
      // 58: aload 0
      // 59: getfield k47.zxd Ltf8;
      // 5c: fload 7
      // 5e: invokevirtual tf8.vca (F)V
      // 61: ldc 0.875
      // 63: nop
      // 64: fstore 9
      // 66: fload 9
      // 68: fload 9
      // 6a: fload 9
      // 6c: invokestatic hzu.syc (FFF)V
      // 6f: ldc 60.0
      // 71: nop
      // 72: ldc 0.7071
      // 74: nop
      // 75: fconst_0
      // 76: ldc 0.7071
      // 78: nop
      // 79: invokestatic hzu.a2h (FFFF)V
      // 7c: fload 3
      // 7d: fconst_0
      // 7e: fconst_1
      // 7f: fconst_0
      // 80: invokestatic hzu.a2h (FFFF)V
      // 83: aload 0
      // 84: getfield k47.zxd Ltf8;
      // 87: fload 7
      // 89: invokevirtual tf8.vca (F)V
      // 8c: fload 9
      // 8e: fload 9
      // 90: fload 9
      // 92: invokestatic hzu.syc (FFF)V
      // 95: ldc 60.0
      // 97: nop
      // 98: ldc 0.7071
      // 9a: nop
      // 9b: fconst_0
      // 9c: ldc 0.7071
      // 9e: nop
      // 9f: invokestatic hzu.a2h (FFFF)V
      // a2: fload 3
      // a3: fconst_0
      // a4: fconst_1
      // a5: fconst_0
      // a6: invokestatic hzu.a2h (FFFF)V
      // a9: aload 0
      // aa: getfield k47.yef Ltf8;
      // ad: fload 7
      // af: invokevirtual tf8.vca (F)V
      // b2: invokestatic hzu.x3w ()V
      // b5: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6809168057543039526L, 9123719774342716438L, MethodHandles.lookup().lookupClass()).a(21182784721296L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 55656446589376L;
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
      String var6 = "l\u0098ë\u0092»\\F9dc\u0080)<ÍæJ\u0010æ?{\u0017$Qd\u001d\rCL¬\u0095\u0005ú\u0085\u0010\u009aÁÀ@:\u0085üc_Ñ3XÁeýÇ";
      int var8 = "l\u0098ë\u0092»\\F9dc\u0080)<ÍæJ\u0010æ?{\u0017$Qd\u001d\rCL¬\u0095\u0005ú\u0085\u0010\u009aÁÀ@:\u0085üc_Ñ3XÁeýÇ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30959;
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
            throw new RuntimeException("k47", var10);
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
         throw new RuntimeException("k47" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
