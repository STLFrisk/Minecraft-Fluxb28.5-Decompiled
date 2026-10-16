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

public class a34 extends wdh {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public a34() {
      this.qfy(uja.kdm);
   }

   @Override
   public erg r__(erg param1, t9d param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a34.a J
      // 03: ldc2_w 114332977012669
      // 06: lxor
      // 07: lstore 4
      // 09: new erg
      // 0c: dup
      // 0d: getstatic xbr.kdv Lf58;
      // 10: bipush 1
      // 11: aload 2
      // 12: sipush 17953
      // 15: ldc2_w 3471724586878586490
      // 18: lload 4
      // 1a: lxor
      // 1b: invokedynamic u (IJ)Ljava/lang/String; bsm=a34.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual t9d.xbc (Ljava/lang/String;)I
      // 24: invokespecial erg.<init> (Lu7m;II)V
      // 27: astore 7
      // 29: new java/lang/StringBuilder
      // 2c: dup
      // 2d: invokespecial java/lang/StringBuilder.<init> ()V
      // 30: sipush 664
      // 33: ldc2_w 7465885371129367234
      // 36: lload 4
      // 38: lxor
      // 39: invokedynamic u (IJ)Ljava/lang/String; bsm=a34.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42: aload 7
      // 44: invokevirtual erg.j6_ ()I
      // 47: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4d: astore 8
      // 4f: invokestatic t9d.c ()I
      // 52: new ucr
      // 55: dup
      // 56: aload 8
      // 58: invokespecial ucr.<init> (Ljava/lang/String;)V
      // 5b: astore 9
      // 5d: aload 2
      // 5e: aload 8
      // 60: aload 9
      // 62: invokevirtual t9d.m5k (Ljava/lang/String;Lwob;)V
      // 65: istore 6
      // 67: aload 9
      // 69: bipush 0
      // 6a: putfield ucr.rqi B
      // 6d: aload 9
      // 6f: aload 3
      // 70: getfield ha9.o2v D
      // 73: aload 3
      // 74: getfield ha9.vbd D
      // 77: aload 9
      // 79: getfield ucr.rqi B
      // 7c: invokevirtual ucr.snl (DDI)V
      // 7f: aload 9
      // 81: aload 2
      // 82: getfield t9d.vzz Lupn;
      // 85: invokevirtual upn.gs_ ()I
      // 88: i2b
      // 89: putfield ucr.d_r B
      // 8c: aload 9
      // 8e: invokevirtual ucr.hcs ()V
      // 91: aload 1
      // 92: dup
      // 93: getfield erg.qd2 I
      // 96: bipush 1
      // 97: isub
      // 98: putfield erg.qd2 I
      // 9b: aload 1
      // 9c: getfield erg.qd2 I
      // 9f: iload 6
      // a1: ifne cd
      // a4: ifgt b5
      // a7: goto ae
      // aa: invokestatic a34.a (Loov;)Loov;
      // ad: athrow
      // ae: aload 7
      // b0: areturn
      // b1: invokestatic a34.a (Loov;)Loov;
      // b4: athrow
      // b5: aload 3
      // b6: iload 6
      // b8: ifne e0
      // bb: getfield ha9.up_ Ljnq;
      // be: aload 7
      // c0: invokevirtual erg.yaq ()Lerg;
      // c3: invokevirtual jnq.phd (Lerg;)Z
      // c6: goto cd
      // c9: invokestatic a34.a (Loov;)Loov;
      // cc: athrow
      // cd: ifne df
      // d0: aload 3
      // d1: aload 7
      // d3: bipush 0
      // d4: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // d7: pop
      // d8: goto df
      // db: invokestatic a34.a (Loov;)Loov;
      // de: athrow
      // df: aload 3
      // e0: getstatic l9p.foo [L_ss;
      // e3: aload 0
      // e4: invokestatic u7m._lo (Lu7m;)I
      // e7: aaload
      // e8: invokevirtual ha9.aex (L_ss;)V
      // eb: aload 1
      // ec: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2807440075128984770L, 3202498527596078370L, MethodHandles.lookup().lookupClass()).a(271721609096724L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 74197787697037L;
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
      String var6 = "u!5ÿ¥I¯T26ÜU\u0084\u00022F\u0018¯\u0090´NMÍfA^H-ÍlîUÿÐ\"\u0006×\u008aêâw";
      int var8 = "u!5ÿ¥I¯T26ÜU\u0084\u00022F\u0018¯\u0090´NMÍfA^H-ÍlîUÿÐ\"\u0006×\u008aêâw".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22192;
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
            throw new RuntimeException("a34", var10);
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
         throw new RuntimeException("a34" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
