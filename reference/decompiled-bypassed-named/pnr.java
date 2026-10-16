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

public class pnr extends ak9 {
   public boolean hmr;
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public pnr(nm6 var1, int var2, int var3, String var4) {
      long var5 = a ^ 12086595918914L;
      super(var1, var2, var3, var4);
      this.hmr = false;
      this.vms = Math.max(jvy.s15, var1.oe7);
      this.c1c = jvy.s15;
      this.bqh = b<"i">(255, 4142567833811735426L ^ var5);
      this.n0w = false;
   }

   @Override
   public void g1p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pnr.a J
      // 03: ldc2_w 30910506545460
      // 06: lxor
      // 07: lstore 3
      // 08: getstatic jsr.dyb Lcyb;
      // 0b: aload 0
      // 0c: getfield pnr.vy4 Ljava/lang/String;
      // 0f: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 12: fstore 6
      // 14: aload 0
      // 15: getfield pnr.mff I
      // 18: istore 7
      // 1a: invokestatic OpaquePredicate.c ()I
      // 1d: new java/lang/StringBuilder
      // 20: dup
      // 21: invokespecial java/lang/StringBuilder.<init> ()V
      // 24: sipush 13620
      // 27: ldc2_w 7310008412588034877
      // 2a: lload 3
      // 2b: lxor
      // 2c: invokedynamic i (IJ)Ljava/lang/String; bsm=pnr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35: invokestatic Minecraft.vz1 ()Lc05;
      // 38: getfield Minecraft.vg8 Ll86;
      // 3b: getfield EntityPlayerSP.o2v D
      // 3e: d2i
      // 3f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 42: sipush 16495
      // 45: ldc2_w 5573033062394412645
      // 48: lload 3
      // 49: lxor
      // 4a: invokedynamic i (IJ)Ljava/lang/String; bsm=pnr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: invokestatic Minecraft.vz1 ()Lc05;
      // 56: getfield Minecraft.vg8 Ll86;
      // 59: getfield EntityPlayerSP.kfp D
      // 5c: d2i
      // 5d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 60: sipush 6073
      // 63: ldc2_w 8034994693805762993
      // 66: lload 3
      // 67: lxor
      // 68: invokedynamic i (IJ)Ljava/lang/String; bsm=pnr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: invokestatic Minecraft.vz1 ()Lc05;
      // 74: getfield Minecraft.vg8 Ll86;
      // 77: getfield EntityPlayerSP.vbd D
      // 7a: d2i
      // 7b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: astore 8
      // 83: istore 5
      // 85: aload 0
      // 86: getfield pnr.koa I
      // 89: i2f
      // 8a: iload 7
      // 8c: i2f
      // 8d: aload 0
      // 8e: getfield pnr.vms I
      // 91: i2f
      // 92: ldc 14.0
      // 94: nop
      // 95: getstatic jvy.ogc I
      // 98: invokestatic mkt.uk7 (FFFFI)V
      // 9b: getstatic jsr.dyb Lcyb;
      // 9e: aload 8
      // a0: aload 0
      // a1: getfield pnr.koa I
      // a4: bipush 2
      // a5: iadd
      // a6: i2f
      // a7: iload 7
      // a9: bipush 7
      // ab: iadd
      // ac: i2f
      // ad: fload 6
      // af: fconst_2
      // b0: fdiv
      // b1: fsub
      // b2: ldc 16777215
      // b4: nop
      // b5: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // b8: pop
      // b9: iinc 7 14
      // bc: iinc 7 14
      // bf: aload 0
      // c0: iload 7
      // c2: aload 0
      // c3: getfield pnr.mff I
      // c6: isub
      // c7: putfield pnr.c1c I
      // ca: aload 0
      // cb: iload 5
      // cd: ifne ea
      // d0: getfield pnr.hmr Z
      // d3: ifne f0
      // d6: goto dd
      // d9: invokestatic pnr.a (Loov;)Loov;
      // dc: athrow
      // dd: aload 0
      // de: bipush 1
      // df: putfield pnr.hmr Z
      // e2: aload 0
      // e3: goto ea
      // e6: invokestatic pnr.a (Loov;)Loov;
      // e9: athrow
      // ea: getfield pnr.loa Lnm6;
      // ed: invokevirtual nm6.met ()V
      // f0: return
   }

   @Override
   public void x6o(int var1, int var2, boolean var3) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(663975073877726177L, -1588189110886790791L, MethodHandles.lookup().lookupClass()).a(47854073642386L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4537142543107L;
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
      String var6 = "\\É¤m\u0010.\u0016m[ÈÖPåì\u0002Ã\u0010H\u0099\u0019ÑSÆ\u0082ðm¦-ß\u0016ö$\u0091";
      int var8 = "\\É¤m\u0010.\u0016m[ÈÖPåì\u0002Ã\u0010H\u0099\u0019ÑSÆ\u0082ðm¦-ß\u0016ö$\u0091".length();
      char var5 = 16;
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

                  var6 = "l¢óó\u000fa\u009b±0hTûw<,\r\u0010ú&ÍE9v¹\u009fØ,KÜd¤Q+";
                  var8 = "l¢óó\u000fa\u009b±0hTûw<,\r\u0010ú&ÍE9v¹\u009fØ,KÜd¤Q+".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23536;
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
            throw new RuntimeException("pnr", var10);
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
         throw new RuntimeException("pnr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
