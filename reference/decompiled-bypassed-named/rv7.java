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

public class rv7 extends Module {
   public NumberSetting adn;
   public NumberSetting qwf;
   public NumberSetting rpz;
   public ModeSetting b98;
   public q6h m9i;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public rv7() {
      long var1 = a ^ 16686186472923L;
      super(b<"q">(6519, 7331983578380380981L ^ var1), _aj.p3z, false, new SubEngine[0]);
      this.adn = new NumberSetting(b<"q">(23818, 7887929961694850892L ^ var1), b<"q">(4735, 6151673956088913976L ^ var1), 7.0F, 1.0F, 9.0F, 1.0F);
      this.qwf = new NumberSetting(b<"q">(23818, 7887929961694850892L ^ var1), b<"q">(24651, 4203280388996256264L ^ var1), 0.0F, 0.0F, 2.0F, 0.05F);
      this.rpz = new NumberSetting(b<"q">(23818, 7887929961694850892L ^ var1), b<"q">(27357, 4144078115742570648L ^ var1), 14.0F, 1.0F, 20.0F, 0.5F);
      this.b98 = new ModeSetting(
         b<"q">(23818, 7887929961694850892L ^ var1),
         b<"q">(5799, 1708029727120139494L ^ var1),
         b<"q">(29476, 540560400406004073L ^ var1),
         new String[]{b<"q">(30680, 8944442205583558044L ^ var1), b<"q">(2057, 332801016064227913L ^ var1)}
      );
      this.m9i = new q6h();
   }

   @EventHandler
   public void jnp(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rv7.a J
      // 003: ldc2_w 80086851565414
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield rv7.m9i Lq6h;
      // 011: aload 0
      // 012: getfield rv7.qwf Lcrk;
      // 015: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 018: invokevirtual java/lang/Float.floatValue ()F
      // 01b: ldc 1000.0
      // 01d: nop
      // 01e: fmul
      // 01f: f2d
      // 020: invokevirtual q6h.hqu (D)Z
      // 023: iload 4
      // 025: ifne 048
      // 028: ifne 033
      // 02b: goto 032
      // 02e: invokestatic rv7.a (Loov;)Loov;
      // 031: athrow
      // 032: return
      // 033: aload 0
      // 034: getfield rv7.b98 Lc_3;
      // 037: sipush 26320
      // 03a: ldc2_w 5427130360958830113
      // 03d: lload 2
      // 03e: lxor
      // 03f: invokedynamic q (IJ)Ljava/lang/String; bsm=rv7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: nop
      // 045: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 048: iload 4
      // 04a: ifne 0b9
      // 04d: ifeq 0a4
      // 050: goto 057
      // 053: invokestatic rv7.a (Loov;)Loov;
      // 056: athrow
      // 057: getstatic rv7.ek1 Lc05;
      // 05a: getfield Minecraft.vg8 Ll86;
      // 05d: invokevirtual EntityPlayerSP.i55 ()F
      // 060: aload 0
      // 061: getfield rv7.rpz Lcrk;
      // 064: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 067: invokevirtual java/lang/Float.floatValue ()F
      // 06a: fcmpl
      // 06b: iload 4
      // 06d: ifne 094
      // 070: goto 077
      // 073: invokestatic rv7.a (Loov;)Loov;
      // 076: athrow
      // 077: ifge 0a3
      // 07a: goto 081
      // 07d: invokestatic rv7.a (Loov;)Loov;
      // 080: athrow
      // 081: getstatic rv7.ek1 Lc05;
      // 084: getfield Minecraft.vg8 Ll86;
      // 087: getstatic mcs.kkg Lmcs;
      // 08a: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 08d: goto 094
      // 090: invokestatic rv7.a (Loov;)Loov;
      // 093: athrow
      // 094: iload 4
      // 096: ifne 0b9
      // 099: ifeq 0a4
      // 09c: goto 0a3
      // 09f: invokestatic rv7.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: return
      // 0a4: aload 0
      // 0a5: getfield rv7.b98 Lc_3;
      // 0a8: sipush 2057
      // 0ab: ldc2_w 332737753840396532
      // 0ae: lload 2
      // 0af: lxor
      // 0b0: invokedynamic q (IJ)Ljava/lang/String; bsm=rv7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: nop
      // 0b6: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 0b9: iload 4
      // 0bb: ifne 0e6
      // 0be: ifeq 0ea
      // 0c1: goto 0c8
      // 0c4: invokestatic rv7.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: getstatic rv7.ek1 Lc05;
      // 0cb: getfield Minecraft.vg8 Ll86;
      // 0ce: iload 4
      // 0d0: ifne 0f0
      // 0d3: goto 0da
      // 0d6: invokestatic rv7.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: invokevirtual EntityPlayerSP._xk ()F
      // 0dd: fconst_0
      // 0de: fcmpl
      // 0df: goto 0e6
      // 0e2: invokestatic rv7.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: ifeq 0ea
      // 0e9: return
      // 0ea: getstatic rv7.ek1 Lc05;
      // 0ed: getfield Minecraft.vg8 Ll86;
      // 0f0: getfield EntityPlayerSP.up_ Ljnq;
      // 0f3: astore 5
      // 0f5: aload 0
      // 0f6: invokespecial rv7.oej ()I
      // 0f9: istore 6
      // 0fb: iload 6
      // 0fd: iload 4
      // 0ff: ifne 117
      // 102: bipush -1
      // 103: if_icmpne 112
      // 106: goto 10d
      // 109: invokestatic rv7.a (Loov;)Loov;
      // 10c: athrow
      // 10d: return
      // 10e: invokestatic rv7.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 5
      // 114: getfield jnq.nb5 I
      // 117: istore 7
      // 119: iload 6
      // 11b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11e: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 121: getstatic rv7.ek1 Lc05;
      // 124: getfield Minecraft.vg8 Ll86;
      // 127: getfield EntityPlayerSP.lq7 Lp_k;
      // 12a: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 12d: dup
      // 12e: iload 6
      // 130: bipush 36
      // 132: isub
      // 133: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 136: invokevirtual p_k.sxi (Lmz2;)V
      // 139: getstatic rv7.ek1 Lc05;
      // 13c: getfield Minecraft.vg8 Ll86;
      // 13f: getfield EntityPlayerSP.lq7 Lp_k;
      // 142: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
      // 145: dup
      // 146: aload 5
      // 148: invokevirtual jnq.dxs ()Lerg;
      // 14b: invokespecial net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.<init> (Lerg;)V
      // 14e: invokevirtual p_k.sxi (Lmz2;)V
      // 151: getstatic rv7.ek1 Lc05;
      // 154: getfield Minecraft.vg8 Ll86;
      // 157: getfield EntityPlayerSP.lq7 Lp_k;
      // 15a: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 15d: dup
      // 15e: iload 7
      // 160: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 163: invokevirtual p_k.sxi (Lmz2;)V
      // 166: aload 0
      // 167: getfield rv7.m9i Lq6h;
      // 16a: invokevirtual q6h.u1k ()V
      // 16d: return
   }

   private int oej() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: bipush 36
      // 06: istore 2
      // 07: iload 2
      // 08: bipush 45
      // 0a: if_icmpge 69
      // 0d: getstatic rv7.ek1 Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.fv9 L_jc;
      // 16: iload 2
      // 17: invokevirtual _jc.ajr (I)Lvrx;
      // 1a: invokevirtual vrx.x4s ()Lerg;
      // 1d: astore 3
      // 1e: aload 3
      // 1f: invokevirtual erg.gn1 ()Lu7m;
      // 22: invokestatic amb.gjz (Lu7m;)Z
      // 25: iload 1
      // 26: ifeq 6b
      // 29: iload 1
      // 2a: ifeq 48
      // 2d: goto 34
      // 30: invokestatic rv7.a (Loov;)Loov;
      // 33: athrow
      // 34: ifeq 41
      // 37: goto 3e
      // 3a: invokestatic rv7.a (Loov;)Loov;
      // 3d: athrow
      // 3e: goto 62
      // 41: aload 3
      // 42: invokevirtual erg.gn1 ()Lu7m;
      // 45: invokestatic u7m._lo (Lu7m;)I
      // 48: iload 1
      // 49: ifeq 61
      // 4c: sipush 397
      // 4f: if_icmpeq 60
      // 52: goto 59
      // 55: invokestatic rv7.a (Loov;)Loov;
      // 58: athrow
      // 59: goto 62
      // 5c: invokestatic rv7.a (Loov;)Loov;
      // 5f: athrow
      // 60: iload 2
      // 61: ireturn
      // 62: iinc 2 1
      // 65: iload 1
      // 66: ifne 07
      // 69: bipush 9
      // 6b: istore 2
      // 6c: iload 2
      // 6d: bipush 36
      // 6f: if_icmpge f4
      // 72: getstatic rv7.ek1 Lc05;
      // 75: getfield Minecraft.vg8 Ll86;
      // 78: getfield EntityPlayerSP.fv9 L_jc;
      // 7b: iload 2
      // 7c: invokevirtual _jc.ajr (I)Lvrx;
      // 7f: invokevirtual vrx.x4s ()Lerg;
      // 82: astore 3
      // 83: aload 3
      // 84: invokevirtual erg.gn1 ()Lu7m;
      // 87: invokestatic amb.gjz (Lu7m;)Z
      // 8a: iload 1
      // 8b: ifeq f5
      // 8e: iload 1
      // 8f: ifeq b8
      // 92: goto 99
      // 95: invokestatic rv7.a (Loov;)Loov;
      // 98: athrow
      // 99: ifeq a6
      // 9c: goto a3
      // 9f: invokestatic rv7.a (Loov;)Loov;
      // a2: athrow
      // a3: goto ed
      // a6: aload 3
      // a7: iload 1
      // a8: ifeq ec
      // ab: invokevirtual erg.gn1 ()Lu7m;
      // ae: invokestatic u7m._lo (Lu7m;)I
      // b1: goto b8
      // b4: invokestatic rv7.a (Loov;)Loov;
      // b7: athrow
      // b8: sipush 397
      // bb: if_icmpeq c5
      // be: goto ed
      // c1: invokestatic rv7.a (Loov;)Loov;
      // c4: athrow
      // c5: getstatic rv7.ek1 Lc05;
      // c8: getfield Minecraft.l7q Lhh6;
      // cb: getstatic rv7.ek1 Lc05;
      // ce: getfield Minecraft.vg8 Ll86;
      // d1: getfield EntityPlayerSP.daw L_jc;
      // d4: getfield _jc.h7l I
      // d7: iload 2
      // d8: aload 0
      // d9: getfield rv7.adn Lcrk;
      // dc: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // df: invokevirtual java/lang/Float.intValue ()I
      // e2: bipush 2
      // e3: getstatic rv7.ek1 Lc05;
      // e6: getfield Minecraft.vg8 Ll86;
      // e9: invokevirtual hh6.efg (IIIILha9;)Lerg;
      // ec: pop
      // ed: iinc 2 1
      // f0: iload 1
      // f1: ifne 6c
      // f4: bipush -1
      // f5: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3348157086320532699L, 6986542900387902670L, MethodHandles.lookup().lookupClass()).a(138022201736323L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11309192672291L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "¢$\u008d!Ò\u0093ñ\u0002Ê\u001f\u0086è6$ A\u0010\u0000Gidû?@\u0004D®\\t(ml.\u0018ÌÂ\u0019<\u00921hÈ\u001eH\u0003cÌ\u000e#[\u0091ù6>y¡_¥\u0010'K§å\u0091¸\u001fi]NDËI\u0018ÜJ\u0018Ùÿ.D`7ÛÞ\u0019\u007fòÉ\u009bÇ×\u009ey\u0017î\u0099\u009du\u0091º\u0018!×êï÷½\u001d\u0017ée¿U7eP·ÛÞjèLÏÖu\u0018>àÇ|\u0012\u0082ë]WÂÃp\u0090\u0087\u001a\u009cò.D\u0083ÞGðµ\u0010¡>[Ö4º\u0003Ur\u008d(ÝP·OÙ";
      int var8 = "¢$\u008d!Ò\u0093ñ\u0002Ê\u001f\u0086è6$ A\u0010\u0000Gidû?@\u0004D®\\t(ml.\u0018ÌÂ\u0019<\u00921hÈ\u001eH\u0003cÌ\u000e#[\u0091ù6>y¡_¥\u0010'K§å\u0091¸\u001fi]NDËI\u0018ÜJ\u0018Ùÿ.D`7ÛÞ\u0019\u007fòÉ\u009bÇ×\u009ey\u0017î\u0099\u009du\u0091º\u0018!×êï÷½\u001d\u0017ée¿U7eP·ÛÞjèLÏÖu\u0018>àÇ|\u0012\u0082ë]WÂÃp\u0090\u0087\u001a\u009cò.D\u0083ÞGðµ\u0010¡>[Ö4º\u0003Ur\u008d(ÝP·OÙ"
         .length();
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
                     f = var9;
                     g = new String[10];
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

                  var6 = "\u0010h\u008aJÀ\u009cY1\u0096&´:JÁF\u0098\u0018²BnkRº¹{G¾=íësz8æ\\+\u008aáÅ\u008a\u001a";
                  var8 = "\u0010h\u008aJÀ\u009cY1\u0096&´:JÁF\u0098\u0018²BnkRº¹{G¾=íësz8æ\\+\u008aáÅ\u008a\u001a".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25951;
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
            throw new RuntimeException("rv7", var10);
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
         throw new RuntimeException("rv7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
