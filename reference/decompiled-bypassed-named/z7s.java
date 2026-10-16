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

public class z7s extends Module {
   public static BooleanSetting acb;
   public static BooleanSetting dcm;
   public static NumberSetting e76;
   public static NumberSetting xu_;
   private fqr z6u;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public z7s() {
      long var1 = a ^ 2257235773360L;
      super(b<"n">(3032, 4910332348395043685L ^ var1), _aj.z3a, false, new SubEngine[0]);
   }

   @EventHandler(
      jn1 = 3
   )
   private void mfr(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual PlayerUpdateEvent.lhw ()Z
      // 008: iload 2
      // 009: ifne 021
      // 00c: ifne 06d
      // 00f: goto 016
      // 012: invokestatic z7s.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 1
      // 017: invokevirtual PlayerUpdateEvent.elp ()Z
      // 01a: goto 021
      // 01d: invokestatic z7s.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 2
      // 022: ifne 04f
      // 025: ifne 06d
      // 028: goto 02f
      // 02b: invokestatic z7s.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: pop
      // 031: getstatic z7s.ek1 Lc05;
      // 034: getfield Minecraft.oxn Lmoh;
      // 037: getfield moh.oxt Lm7l;
      // 03a: iload 2
      // 03b: ifne 0a0
      // 03e: goto 045
      // 041: invokestatic z7s.a (Loov;)Loov;
      // 044: athrow
      // 045: getfield m7l.m7n Z
      // 048: goto 04f
      // 04b: invokestatic z7s.a (Loov;)Loov;
      // 04e: athrow
      // 04f: ifne 077
      // 052: getstatic z7s.dcm Lcn7;
      // 055: iload 2
      // 056: ifne 0a0
      // 059: goto 060
      // 05c: invokestatic z7s.a (Loov;)Loov;
      // 05f: athrow
      // 060: invokevirtual BooleanSetting.g7m ()Z
      // 063: ifne 077
      // 066: goto 06d
      // 069: invokestatic z7s.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 0
      // 06e: aconst_null
      // 06f: putfield z7s.z6u Lfqr;
      // 072: return
      // 073: invokestatic z7s.a (Loov;)Loov;
      // 076: athrow
      // 077: invokestatic uj3.kao ()Ljava/util/List;
      // 07a: invokeinterface java/util/List.stream ()Ljava/util/stream/Stream; 1
      // 07f: aload 0
      // 080: invokedynamic test (Lz7s;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, z7s.fh0 (Lg_3;)Z, (Lg_3;)Z ]
      // 085: invokeinterface java/util/stream/Stream.filter (Ljava/util/function/Predicate;)Ljava/util/stream/Stream; 2
      // 08a: aload 0
      // 08b: invokedynamic apply (Lz7s;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, z7s.wel (Lg_3;)Ljava/lang/Float;, (Lg_3;)Ljava/lang/Float; ]
      // 090: invokestatic java/util/Comparator.comparing (Ljava/util/function/Function;)Ljava/util/Comparator;
      // 093: invokeinterface java/util/stream/Stream.sorted (Ljava/util/Comparator;)Ljava/util/stream/Stream; 2
      // 098: invokestatic java/util/stream/Collectors.toList ()Ljava/util/stream/Collector;
      // 09b: invokeinterface java/util/stream/Stream.collect (Ljava/util/stream/Collector;)Ljava/lang/Object; 2
      // 0a0: checkcast java/util/List
      // 0a3: astore 3
      // 0a4: iload 2
      // 0a5: ifne 0e1
      // 0a8: aload 3
      // 0a9: invokeinterface java/util/List.size ()I 1
      // 0ae: ifgt 0bd
      // 0b1: goto 0b8
      // 0b4: invokestatic z7s.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: return
      // 0b9: invokestatic z7s.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aload 0
      // 0bf: aload 3
      // 0c0: bipush 0
      // 0c1: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c6: checkcast Entity
      // 0c9: getstatic z7s.xu_ Lcrk;
      // 0cc: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 0cf: invokevirtual java/lang/Float.floatValue ()F
      // 0d2: getstatic z7s.acb Lcn7;
      // 0d5: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0d8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0db: invokespecial z7s.yo7 (Lg_3;FZ)Lfqr;
      // 0de: putfield z7s.z6u Lfqr;
      // 0e1: aload 0
      // 0e2: getfield z7s.z6u Lfqr;
      // 0e5: invokestatic omb.b5h (Lfqr;)[F
      // 0e8: astore 4
      // 0ea: aload 1
      // 0eb: aload 4
      // 0ed: bipush 0
      // 0ee: faload
      // 0ef: invokevirtual PlayerUpdateEvent.h8j (F)V
      // 0f2: aload 1
      // 0f3: aload 4
      // 0f5: bipush 1
      // 0f6: faload
      // 0f7: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 0fa: iload 2
      // 0fb: ifne 126
      // 0fe: getstatic z7s.dcm Lcn7;
      // 101: invokevirtual BooleanSetting.g7m ()Z
      // 104: ifeq 133
      // 107: goto 10e
      // 10a: invokestatic z7s.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 0
      // 10f: pop
      // 110: getstatic z7s.ek1 Lc05;
      // 113: getfield Minecraft.oxn Lmoh;
      // 116: getfield moh.oxt Lm7l;
      // 119: bipush 1
      // 11a: putfield m7l.m7n Z
      // 11d: aload 0
      // 11e: pop
      // 11f: goto 126
      // 122: invokestatic z7s.a (Loov;)Loov;
      // 125: athrow
      // 126: getstatic z7s.ek1 Lc05;
      // 129: getfield Minecraft.oxn Lmoh;
      // 12c: getfield moh.oxt Lm7l;
      // 12f: bipush 0
      // 130: putfield m7l.m7n Z
      // 133: return
   }

   @EventHandler
   private void c2u(b5k var1) {
      int var2 = OpaquePredicate.b();

      fqr var10000;
      label22: {
         try {
            var10000 = this.z6u;
            if (var2 == 0) {
               break label22;
            }

            if (this.z6u == null) {
               return;
            }
         } catch (oov var9) {
            throw a(var9);
         }

         var10000 = this.z6u;
      }

      double var3 = var10000.lvi - ek1.ibs().yky();
      double var5 = this.z6u.gn5 - ek1.ibs().fxk();
      double var7 = this.z6u.bn2 - ek1.ibs().kux();
      iyr.jil(var3 - 0.5, var5 - 0.5, var7 - 0.5, new Color(255, 0, 0, 100).getRGB(), new Color(16771328).getRGB(), 1.0F);
   }

   private fqr yo7(Entity param1, float param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getfield Entity.o2v D
      // 09: aload 1
      // 0a: getfield Entity.o2v D
      // 0d: aload 1
      // 0e: getfield Entity.ivp D
      // 11: dsub
      // 12: fload 2
      // 13: f2d
      // 14: dmul
      // 15: dadd
      // 16: dstore 5
      // 18: aload 1
      // 19: getfield Entity.kfp D
      // 1c: aload 1
      // 1d: getfield Entity.kfp D
      // 20: aload 1
      // 21: getfield Entity.c54 D
      // 24: dsub
      // 25: fload 2
      // 26: f2d
      // 27: ldc2_w 0.3
      // 2a: dmul
      // 2b: dmul
      // 2c: iload 4
      // 2e: ifeq 49
      // 31: dadd
      // 32: iload 3
      // 33: ifeq 4c
      // 36: goto 3d
      // 39: invokestatic z7s.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 1
      // 3e: invokevirtual Entity.c5y ()F
      // 41: f2d
      // 42: goto 49
      // 45: invokestatic z7s.a (Loov;)Loov;
      // 48: athrow
      // 49: goto 4d
      // 4c: dconst_1
      // 4d: dadd
      // 4e: dstore 7
      // 50: aload 1
      // 51: getfield Entity.vbd D
      // 54: aload 1
      // 55: getfield Entity.vbd D
      // 58: aload 1
      // 59: getfield Entity.e2b D
      // 5c: dsub
      // 5d: fload 2
      // 5e: f2d
      // 5f: dmul
      // 60: dadd
      // 61: dstore 9
      // 63: new fqr
      // 66: dup
      // 67: dload 5
      // 69: dload 7
      // 6b: dload 9
      // 6d: invokespecial fqr.<init> (DDD)V
      // 70: areturn
   }

   private boolean fh0(Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof EntityCreeper
      // 08: iload 2
      // 09: ifne 20
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic z7s.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic z7s.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: getfield Entity.ma9 Z
      // 20: iload 2
      // 21: ifne 4a
      // 24: ifne 49
      // 27: goto 2e
      // 2a: invokestatic z7s.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 1
      // 2f: invokevirtual Entity.i55 ()F
      // 32: fconst_0
      // 33: fcmpg
      // 34: iload 2
      // 35: ifne 61
      // 38: goto 3f
      // 3b: invokestatic z7s.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifgt 4b
      // 42: goto 49
      // 45: invokestatic z7s.a (Loov;)Loov;
      // 48: athrow
      // 49: bipush 0
      // 4a: ireturn
      // 4b: aload 0
      // 4c: pop
      // 4d: getstatic z7s.ek1 Lc05;
      // 50: getfield Minecraft.vg8 Ll86;
      // 53: aload 1
      // 54: invokevirtual EntityPlayerSP.tm6 (Li2h;)F
      // 57: getstatic z7s.e76 Lcrk;
      // 5a: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 5d: invokevirtual java/lang/Float.floatValue ()F
      // 60: fcmpl
      // 61: iload 2
      // 62: ifne 81
      // 65: ifle 75
      // 68: goto 6f
      // 6b: invokestatic z7s.a (Loov;)Loov;
      // 6e: athrow
      // 6f: bipush 0
      // 70: ireturn
      // 71: invokestatic z7s.a (Loov;)Loov;
      // 74: athrow
      // 75: aload 0
      // 76: pop
      // 77: getstatic z7s.ek1 Lc05;
      // 7a: getfield Minecraft.vg8 Ll86;
      // 7d: aload 1
      // 7e: invokevirtual EntityPlayerSP.e7y (Li2h;)Z
      // 81: iload 2
      // 82: ifne 9b
      // 85: ifne 95
      // 88: goto 8f
      // 8b: invokestatic z7s.a (Loov;)Loov;
      // 8e: athrow
      // 8f: bipush 0
      // 90: ireturn
      // 91: invokestatic z7s.a (Loov;)Loov;
      // 94: athrow
      // 95: getstatic ModuleRegistry.p71 Lar9;
      // 98: invokevirtual AntiBots.isEnabled ()Z
      // 9b: iload 2
      // 9c: ifne cc
      // 9f: ifeq cb
      // a2: goto a9
      // a5: invokestatic z7s.a (Loov;)Loov;
      // a8: athrow
      // a9: getstatic ModuleRegistry.p71 Lar9;
      // ac: aload 1
      // ad: invokevirtual AntiBots.kh5 (Lg_3;)Z
      // b0: iload 2
      // b1: ifne cc
      // b4: goto bb
      // b7: invokestatic z7s.a (Loov;)Loov;
      // ba: athrow
      // bb: ifeq cb
      // be: goto c5
      // c1: invokestatic z7s.a (Loov;)Loov;
      // c4: athrow
      // c5: bipush 0
      // c6: ireturn
      // c7: invokestatic z7s.a (Loov;)Loov;
      // ca: athrow
      // cb: bipush 1
      // cc: ireturn
   }

   private Float wel(Entity var1) {
      return ek1.vg8.tm6(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7230529745436419389L, 203133739461236062L, MethodHandles.lookup().lookupClass()).a(200928682888179L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 27591882488291L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "¾Ú\u001eÌ\u000b\u0015\u008cå-b@Zó±0¢ ÛÀ¬_\u008b2]ÖWÜðí\u0003õ\u000b¯Øÿû6a ¼µ6\u0094\u000b\u008e\u001a<ÅÍ\u0018ï¢À]ÏÔý\t\r\u0018Ü& \u0015Ê=k^ÉÕ`#Õ\u0095\u0018D\u0098_\u009fÔBWf\u0082¨\u00adÐ\u0095è²m{g)1\u0097è.\u0092";
      int var6 = "¾Ú\u001eÌ\u000b\u0015\u008cå-b@Zó±0¢ ÛÀ¬_\u008b2]ÖWÜðí\u0003õ\u000b¯Øÿû6a ¼µ6\u0094\u000b\u008e\u001a<ÅÍ\u0018ï¢À]ÏÔý\t\r\u0018Ü& \u0015Ê=k^ÉÕ`#Õ\u0095\u0018D\u0098_\u009fÔBWf\u0082¨\u00adÐ\u0095è²m{g)1\u0097è.\u0092"
         .length();
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
                     g = new String[6];
                     acb = new BooleanSetting(b<"n">(3395, 5491244890396689326L ^ var9), b<"n">(8928, 3972021622775655433L ^ var9), false);
                     dcm = new BooleanSetting(b<"n">(3395, 5491244890396689326L ^ var9), b<"n">(18774, 8758574622514726846L ^ var9), false);
                     e76 = new NumberSetting(b<"n">(3395, 5491244890396689326L ^ var9), b<"n">(12129, 5231807531418886541L ^ var9), 100.0F, 1.0F, 500.0F, 5.0F);
                     xu_ = new NumberSetting(b<"n">(3395, 5491244890396689326L ^ var9), b<"n">(19695, 8318266846221550080L ^ var9), 1.5F, 0.0F, 10.0F, 0.1F);
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

                  var4 = "ì\u0095\u001bñåq~ë\u0007ÆË\u0018\u0091Ã×P¯\u001c1C¾\u0092á!y°P*O¬åÚ þéÕ`³\u009a;Ô¿ú\f\u0019ñÈÔ\u0002Gö5ù_\n¦ä¾¹ßÀ\u00046âê";
                  var6 = "ì\u0095\u001bñåq~ë\u0007ÆË\u0018\u0091Ã×P¯\u001c1C¾\u0092á!y°P*O¬åÚ þéÕ`³\u009a;Ô¿ú\f\u0019ñÈÔ\u0002Gö5ù_\n¦ä¾¹ßÀ\u00046âê".length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26529;
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
            throw new RuntimeException("z7s", var10);
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
         throw new RuntimeException("z7s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
