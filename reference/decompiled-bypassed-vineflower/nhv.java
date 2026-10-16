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

public class nhv extends c7o {
   private static final long b;
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   public nhv(String var1, i2h var2, i2h var3) {
      super(var1, var2);
      this.gc2 = var3;
   }

   @Override
   public i2h f8d() {
      return this.tje;
   }

   @Override
   public i2h nra() {
      return this.gc2;
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
      // 000: getstatic nhv.b J
      // 003: ldc2_w 113001833919624
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield nhv.gc2 Li2h;
      // 011: iload 4
      // 013: ifne 032
      // 016: ifnonnull 02e
      // 019: goto 020
      // 01c: invokestatic nhv.b (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield nhv.tje Li2h;
      // 024: invokevirtual i2h.xyw ()Lekw;
      // 027: goto 035
      // 02a: invokestatic nhv.b (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 0
      // 02f: getfield nhv.gc2 Li2h;
      // 032: invokevirtual i2h.xyw ()Lekw;
      // 035: astore 5
      // 037: aload 0
      // 038: getfield nhv.gc2 Li2h;
      // 03b: iload 4
      // 03d: ifne 058
      // 040: instanceof g_3
      // 043: ifeq 061
      // 046: goto 04d
      // 049: invokestatic nhv.b (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield nhv.gc2 Li2h;
      // 051: goto 058
      // 054: invokestatic nhv.b (Loov;)Loov;
      // 057: athrow
      // 058: checkcast g_3
      // 05b: invokevirtual g_3.tsc ()Lerg;
      // 05e: goto 062
      // 061: aconst_null
      // 062: astore 6
      // 064: new java/lang/StringBuilder
      // 067: dup
      // 068: invokespecial java/lang/StringBuilder.<init> ()V
      // 06b: sipush 31880
      // 06e: ldc2_w 2847705265852017456
      // 071: lload 2
      // 072: lxor
      // 073: invokedynamic o (IJ)Ljava/lang/String; bsm=nhv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07c: aload 0
      // 07d: getfield nhv.rfm Ljava/lang/String;
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 086: astore 7
      // 088: new java/lang/StringBuilder
      // 08b: dup
      // 08c: invokespecial java/lang/StringBuilder.<init> ()V
      // 08f: aload 7
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: sipush 30936
      // 097: ldc2_w 2274403781113474913
      // 09a: lload 2
      // 09b: lxor
      // 09c: invokedynamic o (IJ)Ljava/lang/String; bsm=nhv.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a8: astore 8
      // 0aa: aload 6
      // 0ac: iload 4
      // 0ae: ifne 0bd
      // 0b1: ifnull 106
      // 0b4: goto 0bb
      // 0b7: invokestatic nhv.b (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 6
      // 0bd: invokevirtual erg.x4w ()Z
      // 0c0: iload 4
      // 0c2: ifne 0db
      // 0c5: ifeq 106
      // 0c8: goto 0cf
      // 0cb: invokestatic nhv.b (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 8
      // 0d1: invokestatic orr.okp (Ljava/lang/String;)Z
      // 0d4: goto 0db
      // 0d7: invokestatic nhv.b (Loov;)Loov;
      // 0da: athrow
      // 0db: ifeq 106
      // 0de: new hsu
      // 0e1: dup
      // 0e2: aload 8
      // 0e4: bipush 3
      // 0e5: anewarray 77
      // 0e8: dup
      // 0e9: bipush 0
      // 0ea: aload 1
      // 0eb: invokevirtual g_3.xyw ()Lekw;
      // 0ee: aastore
      // 0ef: dup
      // 0f0: bipush 1
      // 0f1: aload 5
      // 0f3: aastore
      // 0f4: dup
      // 0f5: bipush 2
      // 0f6: aload 6
      // 0f8: invokevirtual erg.lob ()Lekw;
      // 0fb: aastore
      // 0fc: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0ff: goto 11f
      // 102: invokestatic nhv.b (Loov;)Loov;
      // 105: athrow
      // 106: new hsu
      // 109: dup
      // 10a: aload 7
      // 10c: bipush 2
      // 10d: anewarray 77
      // 110: dup
      // 111: bipush 0
      // 112: aload 1
      // 113: invokevirtual g_3.xyw ()Lekw;
      // 116: aastore
      // 117: dup
      // 118: bipush 1
      // 119: aload 5
      // 11b: aastore
      // 11c: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 11f: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5005497344704663110L, 3868797533170863970L, MethodHandles.lookup().lookupClass()).a(193622965849946L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 5913572543176L;
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
      String var6 = "o£Ë:@+Ø{\rÉ{ú¥w\u009e\u008b+ùëÞeÏCÏ\u0088lBÇÛ2\u0085±\u0010\u00adX$\u009fë!Wh·ë?í6#[\u0013";
      int var8 = "o£Ë:@+Ø{\rÉ{ú¥w\u009e\u008b+ùëÞeÏCÏ\u0088lBÇÛ2\u0085±\u0010\u00adX$\u009fë!Wh·ë?í6#[\u0013".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            j = var9;
            k = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30823;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("nhv", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("nhv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
