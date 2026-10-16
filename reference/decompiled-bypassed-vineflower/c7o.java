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

public class c7o extends ofh {
   public i2h tje;
   private static final long a;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public c7o(String var1, i2h var2) {
      super(var1);
      this.tje = var2;
   }

   public c7o ach() {
      this.ph0 = true;
      return this;
   }

   public boolean tkn() {
      return this.ph0;
   }

   @Override
   public i2h nra() {
      return this.tje;
   }

   @Override
   public ekw ny3(g_3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c7o.a J
      // 03: ldc2_w 91389093591973
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield c7o.tje Li2h;
      // 11: iload 4
      // 13: ifeq 2e
      // 16: instanceof g_3
      // 19: ifeq 37
      // 1c: goto 23
      // 1f: invokestatic c7o.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield c7o.tje Li2h;
      // 27: goto 2e
      // 2a: invokestatic c7o.a (Loov;)Loov;
      // 2d: athrow
      // 2e: checkcast g_3
      // 31: invokevirtual g_3.tsc ()Lerg;
      // 34: goto 38
      // 37: aconst_null
      // 38: astore 5
      // 3a: new java/lang/StringBuilder
      // 3d: dup
      // 3e: invokespecial java/lang/StringBuilder.<init> ()V
      // 41: sipush 3088
      // 44: ldc2_w 7782215223902547175
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic b (IJ)Ljava/lang/String; bsm=c7o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 52: aload 0
      // 53: getfield c7o.rfm Ljava/lang/String;
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5c: astore 6
      // 5e: new java/lang/StringBuilder
      // 61: dup
      // 62: invokespecial java/lang/StringBuilder.<init> ()V
      // 65: aload 6
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a: sipush 8647
      // 6d: ldc2_w 6009646019130655025
      // 70: lload 2
      // 71: lxor
      // 72: invokedynamic b (IJ)Ljava/lang/String; bsm=c7o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: nop
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e: astore 7
      // 80: aload 5
      // 82: iload 4
      // 84: ifeq 93
      // 87: ifnull e1
      // 8a: goto 91
      // 8d: invokestatic c7o.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 5
      // 93: invokevirtual erg.x4w ()Z
      // 96: iload 4
      // 98: ifeq b1
      // 9b: ifeq e1
      // 9e: goto a5
      // a1: invokestatic c7o.a (Loov;)Loov;
      // a4: athrow
      // a5: aload 7
      // a7: invokestatic orr.okp (Ljava/lang/String;)Z
      // aa: goto b1
      // ad: invokestatic c7o.a (Loov;)Loov;
      // b0: athrow
      // b1: ifeq e1
      // b4: new hsu
      // b7: dup
      // b8: aload 7
      // ba: bipush 3
      // bb: anewarray 72
      // be: dup
      // bf: bipush 0
      // c0: aload 1
      // c1: invokevirtual g_3.xyw ()Lekw;
      // c4: aastore
      // c5: dup
      // c6: bipush 1
      // c7: aload 0
      // c8: getfield c7o.tje Li2h;
      // cb: invokevirtual i2h.xyw ()Lekw;
      // ce: aastore
      // cf: dup
      // d0: bipush 2
      // d1: aload 5
      // d3: invokevirtual erg.lob ()Lekw;
      // d6: aastore
      // d7: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // da: goto ff
      // dd: invokestatic c7o.a (Loov;)Loov;
      // e0: athrow
      // e1: new hsu
      // e4: dup
      // e5: aload 6
      // e7: bipush 2
      // e8: anewarray 72
      // eb: dup
      // ec: bipush 0
      // ed: aload 1
      // ee: invokevirtual g_3.xyw ()Lekw;
      // f1: aastore
      // f2: dup
      // f3: bipush 1
      // f4: aload 0
      // f5: getfield c7o.tje Li2h;
      // f8: invokevirtual i2h.xyw ()Lekw;
      // fb: aastore
      // fc: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // ff: areturn
   }

   @Override
   public boolean li9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield c7o.tje Li2h;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 52
      // 0f: goto 16
      // 12: invokestatic c7o.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield c7o.tje Li2h;
      // 1a: goto 21
      // 1d: invokestatic c7o.a (Loov;)Loov;
      // 20: athrow
      // 21: instanceof g_3
      // 24: iload 1
      // 25: ifne 40
      // 28: ifeq 52
      // 2b: goto 32
      // 2e: invokestatic c7o.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield c7o.tje Li2h;
      // 36: instanceof ha9
      // 39: goto 40
      // 3c: invokestatic c7o.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 1
      // 41: ifne 4f
      // 44: ifne 52
      // 47: goto 4e
      // 4a: invokestatic c7o.a (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1309672535504495525L, -4964774463427355552L, MethodHandles.lookup().lookupClass()).a(92180755128400L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 69940770124592L;
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
      String var6 = "îÕ\u0010r\u0091Á<}.=_\t³\u007fZ\u0098u\u0095¥A¢[\u009bÌ\u008f\u0002þëÏ:j0\u0010\u001aþ\tò¿<ã2^\u0001oçQDCd";
      int var8 = "îÕ\u0010r\u0091Á<}.=_\t³\u007fZ\u0098u\u0095¥A¢[\u009bÌ\u008f\u0002þëÏ:j0\u0010\u001aþ\tò¿<ã2^\u0001oçQDCd".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20264;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("c7o", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("c7o" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
