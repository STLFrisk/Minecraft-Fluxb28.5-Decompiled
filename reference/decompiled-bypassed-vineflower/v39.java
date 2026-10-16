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
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction$ck7;

public class v39 extends ar7 {
   public int i4j;
   public static cn7 y70;
   public static cn7 _md;
   private boolean gzr;
   private nhs lsj;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public v39() {
      long var1 = a ^ 909586272489L;
      super(b<"j">(4060, 4310665772997870063L ^ var1), _aj.i9j, false, new j1s[0]);
      this.i4j = 0;
      this.lsj = new nhs();
   }

   @Override
   public void ne2() {
      super.ne2();
      ek1.vg8.lq7.sxi(new C0BPacketEntityAction(ek1.vg8, C0BPacketEntityAction$ck7.lxs));
   }

   @jev(
      jn1 = 4
   )
   private void w9v(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: getstatic v39.y70 Lcn7;
      // 07: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifeq 7f
      // 11: ifeq 76
      // 14: goto 1b
      // 17: invokestatic v39.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual fz2.lhw ()Z
      // 1f: iload 2
      // 20: ifeq 7f
      // 23: goto 2a
      // 26: invokestatic v39.a (Loov;)Loov;
      // 29: athrow
      // 2a: ifne 76
      // 2d: goto 34
      // 30: invokestatic v39.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: dup
      // 36: getfield v39.i4j I
      // 39: bipush 1
      // 3a: iadd
      // 3b: putfield v39.i4j I
      // 3e: iload 2
      // 3f: ifeq 6f
      // 42: goto 49
      // 45: invokestatic v39.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield v39.i4j I
      // 4d: sipush 360
      // 50: if_icmple 66
      // 53: goto 5a
      // 56: invokestatic v39.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: bipush 0
      // 5c: putfield v39.i4j I
      // 5f: goto 66
      // 62: invokestatic v39.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 1
      // 67: aload 0
      // 68: getfield v39.i4j I
      // 6b: i2f
      // 6c: invokevirtual fz2.h8j (F)V
      // 6f: aload 1
      // 70: ldc 10.0
      // 72: nop
      // 73: invokevirtual fz2.ni7 (F)V
      // 76: getstatic v39._md Lcn7;
      // 79: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 7c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7f: iload 2
      // 80: ifeq 98
      // 83: ifeq c0
      // 86: goto 8d
      // 89: invokestatic v39.a (Loov;)Loov;
      // 8c: athrow
      // 8d: aload 0
      // 8e: getfield v39.gzr Z
      // 91: goto 98
      // 94: invokestatic v39.a (Loov;)Loov;
      // 97: athrow
      // 98: ifeq c0
      // 9b: getstatic v39.ek1 Lc05;
      // 9e: getfield c05.vg8 Ll86;
      // a1: getfield l86.lq7 Lp_k;
      // a4: new net/minecraft/network/play/client/C0BPacketEntityAction
      // a7: dup
      // a8: aload 0
      // a9: pop
      // aa: getstatic v39.ek1 Lc05;
      // ad: getfield c05.vg8 Ll86;
      // b0: getstatic net/minecraft/network/play/client/C0BPacketEntityAction$ck7.lxs Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;
      // b3: invokespecial net/minecraft/network/play/client/C0BPacketEntityAction.<init> (Li2h;Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;)V
      // b6: invokevirtual p_k.sxi (Lmz2;)V
      // b9: goto c0
      // bc: invokestatic v39.a (Loov;)Loov;
      // bf: athrow
      // c0: return
   }

   @jev(
      jn1 = 4
   )
   private void gxn(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: getstatic v39._md Lcn7;
      // 07: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifeq 2c
      // 11: ifeq 8f
      // 14: goto 1b
      // 17: invokestatic v39.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield v39.lsj Lnhs;
      // 1f: ldc2_w 100.0
      // 22: invokevirtual nhs.yrv (D)Z
      // 25: goto 2c
      // 28: invokestatic v39.a (Loov;)Loov;
      // 2b: athrow
      // 2c: iload 2
      // 2d: ifeq 67
      // 30: ifeq 63
      // 33: goto 3a
      // 36: invokestatic v39.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 0
      // 3c: getfield v39.gzr Z
      // 3f: iload 2
      // 40: ifeq 55
      // 43: goto 4a
      // 46: invokestatic v39.a (Loov;)Loov;
      // 49: athrow
      // 4a: ifne 58
      // 4d: goto 54
      // 50: invokestatic v39.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: putfield v39.gzr Z
      // 5c: aload 0
      // 5d: getfield v39.lsj Lnhs;
      // 60: invokevirtual nhs.zay ()V
      // 63: aload 0
      // 64: getfield v39.gzr Z
      // 67: ifeq 8f
      // 6a: getstatic v39.ek1 Lc05;
      // 6d: getfield c05.vg8 Ll86;
      // 70: getfield l86.lq7 Lp_k;
      // 73: new net/minecraft/network/play/client/C0BPacketEntityAction
      // 76: dup
      // 77: aload 0
      // 78: pop
      // 79: getstatic v39.ek1 Lc05;
      // 7c: getfield c05.vg8 Ll86;
      // 7f: getstatic net/minecraft/network/play/client/C0BPacketEntityAction$ck7.cqg Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;
      // 82: invokespecial net/minecraft/network/play/client/C0BPacketEntityAction.<init> (Li2h;Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;)V
      // 85: invokevirtual p_k.sxi (Lmz2;)V
      // 88: goto 8f
      // 8b: invokestatic v39.a (Loov;)Loov;
      // 8e: athrow
      // 8f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6225361429664667981L, -544575265135088845L, MethodHandles.lookup().lookupClass()).a(153972219673928L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 127107808951249L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "POË\"ú ¡¸pl¤\u000b\u009a\u00adÊ*\u0010\u008fôjü`i!\t\fæusüI\fS";
      int var6 = "POË\"ú ¡¸pl¤\u000b\u009a\u00adÊ*\u0010\u008fôjü`i!\t\fæusüI\fS".length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[4];
                     y70 = new cn7(b<"j">(18731, 6201929578449218595L ^ var9), b<"j">(13518, 4713277957472768452L ^ var9), true);
                     _md = new cn7(b<"j">(18731, 6201929578449218595L ^ var9), b<"j">(13786, 1483842468118614227L ^ var9), true);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "-J<nó0ìyéùg\u0083×I~c\u0010§Ë\u00adÔ^\u008få\\\u008bqá\u0088Yz\u0017?";
                  var6 = "-J<nó0ìyéùg\u0083×I~c\u0010§Ë\u00adÔ^\u008få\\\u008bqá\u0088Yz\u0017?".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24625;
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
            throw new RuntimeException("v39", var10);
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
         throw new RuntimeException("v39" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
