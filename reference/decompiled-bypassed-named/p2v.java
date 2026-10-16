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

public class p2v extends ShaderHelper {
   private final ShaderHelper jzk;
   private String hz7;
   private p2v$m1_ j9q;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public p2v(ShaderHelper var1) {
      this.jzk = var1;
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic p2v.a J
      // 03: ldc2_w 21662784065893
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: sipush 5756
      // 0c: ldc2_w 5318910495336613361
      // 0f: lload 1
      // 10: lxor
      // 11: invokedynamic s (IJ)Ljava/lang/String; bsm=p2v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: nop
      // 17: bipush 0
      // 18: anewarray 34
      // 1b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1e: putfield p2v.hz7 Ljava/lang/String;
      // 21: invokestatic OpaquePredicate.c ()I
      // 24: aload 0
      // 25: new p2v$m1_
      // 28: dup
      // 29: aload 0
      // 2a: aload 0
      // 2b: getfield p2v.f41 Lc05;
      // 2e: invokespecial p2v$m1_.<init> (Lp2v;Lc05;)V
      // 31: putfield p2v.j9q Lp2v$m1_;
      // 34: istore 3
      // 35: aload 0
      // 36: getfield p2v.f41 Lc05;
      // 39: invokevirtual Minecraft.vnk ()Ltyh;
      // 3c: invokeinterface tyh.xy0 ()Z 1
      // 41: iload 3
      // 42: ifne df
      // 45: ifne 62
      // 48: goto 4f
      // 4b: invokestatic p2v.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield p2v.f41 Lc05;
      // 53: invokevirtual Minecraft.vnk ()Ltyh;
      // 56: invokeinterface tyh.e09 ()V 1
      // 5b: goto 62
      // 5e: invokestatic p2v.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 0
      // 63: getfield p2v.khf Ljava/util/List;
      // 66: new gt4
      // 69: dup
      // 6a: bipush 1
      // 6b: aload 0
      // 6c: getfield p2v.dt7 I
      // 6f: bipush 2
      // 70: idiv
      // 71: sipush 155
      // 74: isub
      // 75: aload 0
      // 76: getfield p2v.o1e I
      // 79: bipush 24
      // 7b: isub
      // 7c: bipush 6
      // 7e: isub
      // 7f: sipush 150
      // 82: bipush 20
      // 84: sipush 27241
      // 87: ldc2_w 122211546833041893
      // 8a: lload 1
      // 8b: lxor
      // 8c: invokedynamic s (IJ)Ljava/lang/String; bsm=p2v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: nop
      // 92: bipush 0
      // 93: anewarray 34
      // 96: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 99: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // 9c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a1: pop
      // a2: aload 0
      // a3: getfield p2v.khf Ljava/util/List;
      // a6: new gt4
      // a9: dup
      // aa: bipush 2
      // ab: aload 0
      // ac: getfield p2v.dt7 I
      // af: bipush 2
      // b0: idiv
      // b1: bipush 5
      // b2: iadd
      // b3: aload 0
      // b4: getfield p2v.o1e I
      // b7: bipush 24
      // b9: isub
      // ba: bipush 6
      // bc: isub
      // bd: sipush 150
      // c0: bipush 20
      // c2: sipush 27084
      // c5: ldc2_w 1419266186391861826
      // c8: lload 1
      // c9: lxor
      // ca: invokedynamic s (IJ)Ljava/lang/String; bsm=p2v.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: nop
      // d0: bipush 0
      // d1: anewarray 34
      // d4: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // d7: invokespecial gt4.<init> (IIIIILjava/lang/String;)V
      // da: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // df: pop
      // e0: return
   }

   @Override
   public void handleMouseInput() {
      super.handleMouseInput();
      this.j9q.gzb();
   }

   @Override
   public void onGuiClosed() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield p2v.f41 Lc05;
      // 08: invokevirtual Minecraft.vnk ()Ltyh;
      // 0b: iload 1
      // 0c: ifne 2c
      // 0f: invokeinterface tyh.xy0 ()Z 1
      // 14: ifeq 34
      // 17: goto 1e
      // 1a: invokestatic p2v.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield p2v.f41 Lc05;
      // 22: invokevirtual Minecraft.vnk ()Ltyh;
      // 25: goto 2c
      // 28: invokestatic p2v.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokeinterface tyh.fsy ()Lsso; 1
      // 31: invokevirtual sso.t1b ()V
      // 34: return
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq 59
      // 0f: goto 16
      // 12: invokestatic p2v.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic p2v.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: if_icmpne 3b
      // 25: aload 0
      // 26: getfield p2v.f41 Lc05;
      // 29: aload 0
      // 2a: getfield p2v.jzk Lgbe;
      // 2d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 30: iload 2
      // 31: ifne 59
      // 34: goto 3b
      // 37: invokestatic p2v.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield p2v.f41 Lc05;
      // 3f: getfield Minecraft.oxn Lmoh;
      // 42: ldc ""
      // 44: nop
      // 45: putfield moh.qqs Ljava/lang/String;
      // 48: aload 0
      // 49: getfield p2v.f41 Lc05;
      // 4c: getfield Minecraft.oxn Lmoh;
      // 4f: invokevirtual moh.cmo ()V
      // 52: goto 59
      // 55: invokestatic p2v.a (Loov;)Loov;
      // 58: athrow
      // 59: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.j9q.j46(var1, var2, var3);
      this.poi(this.fex, this.hz7, this.dt7 / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   public static owt _0w(p2v var0) {
      return var0.fex;
   }

   public static owt k6o(p2v var0) {
      return var0.fex;
   }

   public static owt v2r(p2v var0) {
      return var0.fex;
   }

   public static owt jtu(p2v var0) {
      return var0.fex;
   }

   public static owt gbs(p2v var0) {
      return var0.fex;
   }

   public static owt _vh(p2v var0) {
      return var0.fex;
   }

   public static owt et9(p2v var0) {
      return var0.fex;
   }

   public static owt n_6(p2v var0) {
      return var0.fex;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-905042942257484592L, 6318565671817864574L, MethodHandles.lookup().lookupClass()).a(163633028480976L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 123050958154145L;
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
      String var6 = "òSDtoÿ½¬ïyd4¨µ½\u0005»ì¸K\u001bAÒÆ8ÞÊÄC\u0096[8a#h`I\u0087ö\u009a?VÔC_ã\u009b$ïj$\u007fú\u0012Ê4%EöB\ræ:3Êa\u0013âäFº\fEø\u009c¢ô¬ÚÜÔ8Û§'\u0086Ø0\u0093\u0002+\u0090#¶@¨áÅ\u0010\u00admU\u001bÕuíE¼\u0080¼2\f«#\u008f\u009fåõñ%\u0098¾\"}\u0013\u000b¿¡öB\u0014¢¯\u0015câq\\";
      int var8 = "òSDtoÿ½¬ïyd4¨µ½\u0005»ì¸K\u001bAÒÆ8ÞÊÄC\u0096[8a#h`I\u0087ö\u009a?VÔC_ã\u009b$ïj$\u007fú\u0012Ê4%EöB\ræ:3Êa\u0013âäFº\fEø\u009c¢ô¬ÚÜÔ8Û§'\u0086Ø0\u0093\u0002+\u0090#¶@¨áÅ\u0010\u00admU\u001bÕuíE¼\u0080¼2\f«#\u008f\u009fåõñ%\u0098¾\"}\u0013\u000b¿¡öB\u0014¢¯\u0015câq\\"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[3];
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10369;
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
            throw new RuntimeException("p2v", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("p2v" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
