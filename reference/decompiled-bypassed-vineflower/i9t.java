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

public class i9t extends u7m {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public i9t() {
      this.cb3(1);
   }

   @Override
   public erg r__(erg var1, t9d var2, ha9 var3) {
      var3.rlk(var1);
      var3.aex(l9p.foo[u7m._lo(this)]);
      return var1;
   }

   public static boolean uhi(bdo param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic i9t.a J
      // 03: ldc2_w 73715194205158
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 22
      // 11: ifnonnull 21
      // 14: goto 1b
      // 17: invokestatic i9t.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic i9t.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: sipush 10466
      // 25: ldc2_w 2577882298893891156
      // 28: lload 1
      // 29: lxor
      // 2a: invokedynamic e (IJ)Ljava/lang/String; bsm=i9t.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: nop
      // 30: bipush 9
      // 32: iload 3
      // 33: ifeq 5a
      // 36: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 39: ifne 49
      // 3c: goto 43
      // 3f: invokestatic i9t.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 0
      // 44: ireturn
      // 45: invokestatic i9t.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: sipush 29016
      // 4d: ldc2_w 6223833508811878383
      // 50: lload 1
      // 51: lxor
      // 52: invokedynamic e (IJ)Ljava/lang/String; bsm=i9t.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: nop
      // 58: bipush 8
      // 5a: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 5d: astore 4
      // 5f: bipush 0
      // 60: istore 5
      // 62: iload 5
      // 64: aload 4
      // 66: invokevirtual qhg.vek ()I
      // 69: if_icmpge b1
      // 6c: aload 4
      // 6e: iload 5
      // 70: invokevirtual qhg.mqs (I)Ljava/lang/String;
      // 73: astore 6
      // 75: aload 6
      // 77: iload 3
      // 78: ifeq 8d
      // 7b: ifnonnull 8b
      // 7e: goto 85
      // 81: invokestatic i9t.a (Loov;)Loov;
      // 84: athrow
      // 85: bipush 0
      // 86: ireturn
      // 87: invokestatic i9t.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 6
      // 8d: invokevirtual java/lang/String.length ()I
      // 90: iload 3
      // 91: ifeq a9
      // 94: sipush 32767
      // 97: if_icmple aa
      // 9a: goto a1
      // 9d: invokestatic i9t.a (Loov;)Loov;
      // a0: athrow
      // a1: bipush 0
      // a2: goto a9
      // a5: invokestatic i9t.a (Loov;)Loov;
      // a8: athrow
      // a9: ireturn
      // aa: iinc 5 1
      // ad: iload 3
      // ae: ifne 62
      // b1: bipush 1
      // b2: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7393672523153837613L, -6933884534121051029L, MethodHandles.lookup().lookupClass()).a(126156495190315L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11177536428697L;
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
      String var6 = "\u001fÃÌ\u0097ýáð·P\u009f?éÆ^§û\u0010Åëcç!ì-F¡ÞSï\u009do²`";
      int var8 = "\u001fÃÌ\u0097ýáð·P\u009f?éÆ^§û\u0010Åëcç!ì-F¡ÞSï\u009do²`".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20477;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("i9t", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("i9t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
