import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ekz$1 extends TimerTask {
   public final ekz n6c;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ekz$1(ekz var1) {
      this.n6c = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ekz$1.a J
      // 03: ldc2_w 131554818892067
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield ekz$1.n6c Lekz;
      // 10: invokestatic ekz.p0l (Lekz;)Lzgw;
      // 13: iload 3
      // 14: ifne 34
      // 17: invokeinterface zgw.i6i ()Z 1
      // 1c: ifeq c7
      // 1f: goto 26
      // 22: invokestatic ekz$1.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield ekz$1.n6c Lekz;
      // 2a: invokestatic ekz.y0h (Lekz;)Ljava/lang/Object;
      // 2d: goto 34
      // 30: invokestatic ekz$1.a (Loov;)Loov;
      // 33: athrow
      // 34: dup
      // 35: astore 5
      // 37: monitorenter
      // 38: aload 0
      // 39: getfield ekz$1.n6c Lekz;
      // 3c: invokestatic ekz.uyh (Lekz;)Ljava/util/Map;
      // 3f: invokestatic com/google/common/collect/Maps.newHashMap (Ljava/util/Map;)Ljava/util/HashMap;
      // 42: astore 4
      // 44: aload 0
      // 45: getfield ekz$1.n6c Lekz;
      // 48: iload 3
      // 49: ifne ad
      // 4c: invokestatic ekz.a_g (Lekz;)I
      // 4f: ifne 6e
      // 52: goto 59
      // 55: invokestatic ekz$1.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 4
      // 5b: aload 0
      // 5c: getfield ekz$1.n6c Lekz;
      // 5f: invokestatic ekz.nh0 (Lekz;)Ljava/util/Map;
      // 62: invokeinterface java/util/Map.putAll (Ljava/util/Map;)V 2
      // 67: goto 6e
      // 6a: invokestatic ekz$1.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 4
      // 70: sipush 11008
      // 73: ldc2_w 7876249130073986532
      // 76: lload 1
      // 77: lxor
      // 78: invokedynamic j (IJ)Ljava/lang/String; bsm=ekz$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: nop
      // 7e: aload 0
      // 7f: getfield ekz$1.n6c Lekz;
      // 82: invokestatic ekz.wl1 (Lekz;)I
      // 85: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 88: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 8d: pop
      // 8e: aload 4
      // 90: sipush 10089
      // 93: ldc2_w 8429856488841222540
      // 96: lload 1
      // 97: lxor
      // 98: invokedynamic j (IJ)Ljava/lang/String; bsm=ekz$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: nop
      // 9e: aload 0
      // 9f: getfield ekz$1.n6c Lekz;
      // a2: invokestatic ekz.byx (Lekz;)Ljava/lang/String;
      // a5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // aa: pop
      // ab: aload 5
      // ad: monitorexit
      // ae: goto b9
      // b1: astore 6
      // b3: aload 5
      // b5: monitorexit
      // b6: aload 6
      // b8: athrow
      // b9: aload 0
      // ba: getfield ekz$1.n6c Lekz;
      // bd: invokestatic ekz.wrk (Lekz;)Ljava/net/URL;
      // c0: aload 4
      // c2: bipush 1
      // c3: invokestatic crb.zv4 (Ljava/net/URL;Ljava/util/Map;Z)Ljava/lang/String;
      // c6: pop
      // c7: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7178724582331419225L, 8252264633336396313L, MethodHandles.lookup().lookupClass()).a(98737928324585L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 126571936021976L;
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
      String var6 = "á\u001fkÞG\u0081\\éxÕï\u008dö\u0006c\u000b[>»ÖÂ©\bL ¼j3\u001cv*¦ü6\u008bzÀV³è&R\u0003&¸\u0015\b\u008b:Ê 7ê=\nNj";
      int var8 = "á\u001fkÞG\u0081\\éxÕï\u008dö\u0006c\u000b[>»ÖÂ©\bL ¼j3\u001cv*¦ü6\u008bzÀV³è&R\u0003&¸\u0015\b\u008b:Ê 7ê=\nNj".length();
      char var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25193;
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
            throw new RuntimeException("ekz$1", var10);
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
         throw new RuntimeException("ekz$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
