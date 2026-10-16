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

public class ek8 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 7632714323636L;
      return b<"r">(14031, 4158946450501038051L ^ var1);
   }

   @Override
   public int bag() {
      return 1;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 8862173137458L;
      return b<"r">(17949, 4855111519212585908L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ek8.a J
      // 03: ldc2_w 3241038324721
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: arraylength
      // 0f: iload 5
      // 11: ifeq 2b
      // 14: ifle 6c
      // 17: goto 1e
      // 1a: invokestatic ek8.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 2
      // 1f: bipush 0
      // 20: aaload
      // 21: invokevirtual java/lang/String.length ()I
      // 24: goto 2b
      // 27: invokestatic ek8.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifle 6c
      // 2e: aload 1
      // 2f: aload 2
      // 30: bipush 0
      // 31: bipush 1
      // 32: invokestatic ek8.h1l (Le7r;[Ljava/lang/String;IZ)Lekw;
      // 35: astore 6
      // 37: invokestatic vr1._0v ()Lvr1;
      // 3a: invokevirtual vr1.wh3 ()Lwlx;
      // 3d: new hsu
      // 40: dup
      // 41: sipush 26409
      // 44: ldc2_w 1540283402987260737
      // 47: lload 3
      // 48: lxor
      // 49: invokedynamic r (IJ)Ljava/lang/String; bsm=ek8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: bipush 2
      // 50: anewarray 48
      // 53: dup
      // 54: bipush 0
      // 55: aload 1
      // 56: invokeinterface e7r.xyw ()Lekw; 1
      // 5b: aastore
      // 5c: dup
      // 5d: bipush 1
      // 5e: aload 6
      // 60: aastore
      // 61: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 64: invokevirtual wlx.d3z (Lekw;)V
      // 67: iload 5
      // 69: ifne 8a
      // 6c: new w57
      // 6f: dup
      // 70: sipush 21380
      // 73: ldc2_w 5612655959737335791
      // 76: lload 3
      // 77: lxor
      // 78: invokedynamic r (IJ)Ljava/lang/String; bsm=ek8.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: nop
      // 7e: bipush 0
      // 7f: anewarray 48
      // 82: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 85: athrow
      // 86: invokestatic ek8.a (Loov;)Loov;
      // 89: athrow
      // 8a: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmplt 2b
      // 10: goto 17
      // 13: invokestatic ek8.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic ek8.a (Loov;)Loov;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 25: invokestatic ek8.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5623791270537841800L, -8073565962762309830L, MethodHandles.lookup().lookupClass()).a(264775722513228L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 113056004034648L;
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
      String var6 = "}Îº\u0086yFúe\u0089/V\u0011¢\u009bFÉ\u0004X\u0016¢\u0097OæiM¥Ð\u0086zï\tõým|B$t\u0087è\u0010N+ºØº4Zp\\Ëf\u0095ü\t\u0012G";
      int var8 = "}Îº\u0086yFúe\u0089/V\u0011¢\u009bFÉ\u0004X\u0016¢\u0097OæiM¥Ð\u0086zï\tõým|B$t\u0087è\u0010N+ºØº4Zp\\Ëf\u0095ü\t\u0012G".length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[4];
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

                  var6 = "á\u0019ÑÛ\u0003Gú*Æ\u000fRÚÂ\u0099$XQ ÿu¸@\u0010Ñ\nvÚ\u0002ª±f[ÿ/2\u001ddÖæ½(5V{37H÷\u000euÑ\u00ad£«\u0007¨D\u0002×\tEx\u009d.«OÆ©p¹\u0095Æ\u001fK\f¸¢¼ç¢\u009f";
                  var8 = "á\u0019ÑÛ\u0003Gú*Æ\u000fRÚÂ\u0099$XQ ÿu¸@\u0010Ñ\nvÚ\u0002ª±f[ÿ/2\u001ddÖæ½(5V{37H÷\u000euÑ\u00ad£«\u0007¨D\u0002×\tEx\u009d.«OÆ©p¹\u0095Æ\u001fK\f¸¢¼ç¢\u009f"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 54;
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
            throw new RuntimeException("ek8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("ek8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
