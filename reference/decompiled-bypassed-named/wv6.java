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

public class wv6 extends Module {
   public boolean mft;
   public erg h_2;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public wv6() {
      long var1 = a ^ 108239549391064L;
      super(b<"l">(21647, 557663207720094520L ^ var1), _aj.y49, false, new SubEngine[0]);
      this.mft = false;
      this.h_2 = new erg(ox_.j4y);
   }

   @EventHandler
   public void c9v(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wv6.a J
      // 03: ldc2_w 136741785914170
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: new mew
      // 10: dup
      // 11: getstatic wv6.ek1 Lc05;
      // 14: getfield Minecraft.vg8 Ll86;
      // 17: getfield EntityPlayerSP.o2v D
      // 1a: getstatic wv6.ek1 Lc05;
      // 1d: getfield Minecraft.vg8 Ll86;
      // 20: getfield EntityPlayerSP.kfp D
      // 23: dconst_1
      // 24: dadd
      // 25: getstatic wv6.ek1 Lc05;
      // 28: getfield Minecraft.vg8 Ll86;
      // 2b: getfield EntityPlayerSP.vbd D
      // 2e: invokespecial mew.<init> (DDD)V
      // 31: astore 5
      // 33: getstatic wv6.ek1 Lc05;
      // 36: getfield Minecraft.tij Lkh3;
      // 39: aload 5
      // 3b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 3e: invokeinterface zfz.r_y ()Le0x; 1
      // 43: instanceof t5h
      // 46: iload 4
      // 48: ifeq 60
      // 4b: ifeq ae
      // 4e: goto 55
      // 51: invokestatic wv6.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: getfield wv6.mft Z
      // 59: goto 60
      // 5c: invokestatic wv6.a (Loov;)Loov;
      // 5f: athrow
      // 60: iload 4
      // 62: ifeq a8
      // 65: ifne 9d
      // 68: goto 6f
      // 6b: invokestatic wv6.a (Loov;)Loov;
      // 6e: athrow
      // 6f: sipush 30187
      // 72: ldc2_w 1121637204614545852
      // 75: lload 2
      // 76: lxor
      // 77: invokedynamic l (IJ)Ljava/lang/String; bsm=wv6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: nop
      // 7d: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 80: sipush 355
      // 83: ldc2_w 3890403574529226039
      // 86: lload 2
      // 87: lxor
      // 88: invokedynamic l (IJ)Ljava/lang/String; bsm=wv6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: nop
      // 8e: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 91: aload 0
      // 92: bipush 1
      // 93: putfield wv6.mft Z
      // 96: goto 9d
      // 99: invokestatic wv6.a (Loov;)Loov;
      // 9c: athrow
      // 9d: getstatic wv6.ek1 Lc05;
      // a0: getfield Minecraft.tij Lkh3;
      // a3: aload 5
      // a5: invokevirtual WorldClient.i6x (Lmew;)Z
      // a8: pop
      // a9: iload 4
      // ab: ifne ba
      // ae: aload 0
      // af: bipush 0
      // b0: putfield wv6.mft Z
      // b3: goto ba
      // b6: invokestatic wv6.a (Loov;)Loov;
      // b9: athrow
      // ba: return
   }

   @EventHandler
   public void lc1(RenderEvent var1) {
      if (this.mft) {
         eka var2 = new eka(ek1);
         float var3 = (float)var2.x05();
         float var4 = (float)var2.lrx();
         this.fd7(this.h_2, var3 / 2.0F - 8.0F, var4 / 2.0F + 15.0F);
      }
   }

   private void fd7(erg var1, float var2, float var3) {
      int var4 = Math.max(0, Math.min(255, (int)(Math.sin((double)System.currentTimeMillis() / 150.0) * 255.0 / 2.0 + 127.5)));
      Color var5 = new Color(var4, 0, 0, 255);
      hzu.dp2();
      hzu.o1b();
      qpm.gdb();
      ek1.jiu().b3l = -150.0F;
      ek1.jiu().nq6(var1, var2, var3);
      ek1.jiu().vms(ek1.tx1, var1, var2, var3, "!", var5.getRGB());
      ek1.jiu().b3l = 0.0F;
      hzu.gp4();
      qpm.cng();
      hzu.x3w();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7426490024297732948L, 5274118213626240576L, MethodHandles.lookup().lookupClass()).a(232888286426954L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 64645550289933L;
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
      String var6 = " gÓ\u0091ä$è2\rY¬].Ûñß¦«xw\u0088àÐ\u009aæ\u009dPP;ª§cHPÎÊWó\u0017s?\u000eV>\u0010D\u0095Ñ^ñ\u0016.pÊ3Ú\u0000Gcñ\u009a\u0016ùieýZc_÷ÎüÄGè¦j/8æÎà\u0094Ù\u00002j\u0084¼ÿ:=È\u0080;\u0083§rÇ%÷6ð:\u0085hÜ\u0002rD;¡¹¾2D[\u009cj#\u0017·Ðõ¤Ö\u008b\u0001%ù\u009d\u0084«\u000bÎòí\t\u000eÜ\u0014\"EÂr{\u0097¦¦Ö\u0017\u001cW±g\u009dÜüþ®\n\u0019\u0097d\u007fó\u0007cÁJ\u009e*ÎÛÃ\u0013D\u0087qàß\u0015\u0015I[ÅY\\Fò-ZL$0\u001a\rq¶ñÊê¥*Ø\u0092çeµ£";
      int var8 = " gÓ\u0091ä$è2\rY¬].Ûñß¦«xw\u0088àÐ\u009aæ\u009dPP;ª§cHPÎÊWó\u0017s?\u000eV>\u0010D\u0095Ñ^ñ\u0016.pÊ3Ú\u0000Gcñ\u009a\u0016ùieýZc_÷ÎüÄGè¦j/8æÎà\u0094Ù\u00002j\u0084¼ÿ:=È\u0080;\u0083§rÇ%÷6ð:\u0085hÜ\u0002rD;¡¹¾2D[\u009cj#\u0017·Ðõ¤Ö\u008b\u0001%ù\u009d\u0084«\u000bÎòí\t\u000eÜ\u0014\"EÂr{\u0097¦¦Ö\u0017\u001cW±g\u009dÜüþ®\n\u0019\u0097d\u007fó\u0007cÁJ\u009e*ÎÛÃ\u0013D\u0087qàß\u0015\u0015I[ÅY\\Fò-ZL$0\u001a\rq¶ñÊê¥*Ø\u0092çeµ£"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[3];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22547;
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
            throw new RuntimeException("wv6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("wv6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
