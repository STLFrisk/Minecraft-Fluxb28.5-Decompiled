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

public class zar extends Module {
   public static ModeSetting a5y;
   public static BooleanSetting xwf;
   public static NumberSetting vb5;
   public q6h jas;
   public gqi pa_;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public zar() {
      long var1 = a ^ 90630859597951L;
      super(b<"g">(28315, 7844950105662525181L ^ var1), _aj.y49, false, new SubEngine[0]);
      this.jas = new q6h();
   }

   @EventHandler
   public void pny(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zar.a J
      // 03: ldc2_w 31942126601921
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: getstatic j83.ef8 Lj83;
      // 10: invokevirtual j83.gln ()Z
      // 13: iload 4
      // 15: ifne 3f
      // 18: ifeq 7a
      // 1b: goto 22
      // 1e: invokestatic zar.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: iload 4
      // 25: ifne 43
      // 28: goto 2f
      // 2b: invokestatic zar.a (Loov;)Loov;
      // 2e: athrow
      // 2f: getfield zar.jas Lq6h;
      // 32: ldc2_w 10000.0
      // 35: invokevirtual q6h.hqu (D)Z
      // 38: goto 3f
      // 3b: invokestatic zar.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifeq 7a
      // 42: aload 0
      // 43: iload 4
      // 45: ifne 74
      // 48: getfield zar.pa_ Lgqi;
      // 4b: ifnonnull 7a
      // 4e: goto 55
      // 51: invokestatic zar.a (Loov;)Loov;
      // 54: athrow
      // 55: getstatic zar.ek1 Lc05;
      // 58: getfield Minecraft.vg8 Ll86;
      // 5b: sipush 7760
      // 5e: ldc2_w 8461033605778428038
      // 61: lload 2
      // 62: lxor
      // 63: invokedynamic g (IJ)Ljava/lang/String; bsm=zar.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: nop
      // 69: invokevirtual EntityPlayerSP.vf0 (Ljava/lang/String;)V
      // 6c: aload 0
      // 6d: goto 74
      // 70: invokestatic zar.a (Loov;)Loov;
      // 73: athrow
      // 74: getfield zar.jas Lq6h;
      // 77: invokevirtual q6h.u1k ()V
      // 7a: return
   }

   @EventHandler
   public void getMethod(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zar.a J
      // 03: ldc2_w 96964625346550
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual wbh.nlg ()Lmz2;
      // 11: iload 4
      // 13: ifne 2e
      // 16: instanceof net/minecraft/network/play/server/S02PacketChat
      // 19: ifeq 95
      // 1c: goto 23
      // 1f: invokestatic zar.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual wbh.nlg ()Lmz2;
      // 27: goto 2e
      // 2a: invokestatic zar.a (Loov;)Loov;
      // 2d: athrow
      // 2e: checkcast net/minecraft/network/play/server/S02PacketChat
      // 31: astore 5
      // 33: aload 5
      // 35: invokevirtual net/minecraft/network/play/server/S02PacketChat.m4c ()Lekw;
      // 38: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 3d: astore 6
      // 3f: iload 4
      // 41: ifne 8e
      // 44: aload 6
      // 46: sipush 10178
      // 49: ldc2_w 3780965320862777386
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic g (IJ)Ljava/lang/String; bsm=zar.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokevirtual java/lang/String.matches (Ljava/lang/String;)Z
      // 57: ifeq 95
      // 5a: goto 61
      // 5d: invokestatic zar.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 1
      // 62: bipush 1
      // 63: invokevirtual wbh.wxi (Z)V
      // 66: aload 0
      // 67: new gqi
      // 6a: dup
      // 6b: aload 6
      // 6d: sipush 22744
      // 70: ldc2_w 3872574451141918515
      // 73: lload 2
      // 74: lxor
      // 75: invokedynamic g (IJ)Ljava/lang/String; bsm=zar.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: ldc ""
      // 7d: nop
      // 7e: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 81: invokespecial gqi.<init> (Ljava/lang/String;)V
      // 84: putfield zar.pa_ Lgqi;
      // 87: goto 8e
      // 8a: invokestatic zar.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield zar.pa_ Lgqi;
      // 92: invokevirtual gqi.start ()V
      // 95: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4809123469540521157L, -4534748676926150002L, MethodHandles.lookup().lookupClass()).a(9074201242077L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 15936389069285L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "7r\u0086\u001b\u0013@Óa\u0010\u0016ÿRîr\u0097¼\u0019\u0099m.£6cÆ\u0012\u0004\u0004\u0004?\u008f\u0005·^\u0017ß%\u001b\u0005À7âû×ôyÉ.¯|\u008c¾\u0089ïCêÛT\u008eT$IÅ½\u0003íÀ)Sê_*÷\twkº\bå#¹â\nôªÑ#\u008a|ÞhÕ\u0004y\u009fFe\u0099à±\u001b^\u008a\u0019K\u0018ù¨\u001d¯ñÅ#\u000fì9\u009b\"B±\u007fÈz\u008aï\u009b¸\u00867e aL§\u001bJ§\u008f*û\u0087Ã\u008b\r¡Q-?ã\u00853á#\u009c^ <þ\u008d\u008dýg½(-\u0013Ä\u0098üv\b¢è¾Öqçÿ\u000b¼\u0080®kþCÑ\f\u0014á9T\u001fÛ\u000bç\u00063*!Þ¸µD\u0017 ßF[\u0083\u008aáIº´!êûR'ÄC\u009cW¹5\u0010¬\u0089\u000fÝ¸öÇýù&Ê ÏµF\u0082\u0006\u009a\u0092®]í\u0095Cb\u0006§K\"âÍ\u007f\\ó9.×èªíÀ©\u0090î(\u000bK\u0083©\u001f\u001eïg\u009dü\u0000§×§fô\u0084\u0087$!\b÷ëË\"\rg}íÖÙ¿¶<üM5\u0096¼\u0013 m;ô\"¼g\u0014v/¾\u0007\u009c/½à|gÜA¥}X\u0080\u0087$Ë\u0089µ¿\u0086eð";
      int var6 = "7r\u0086\u001b\u0013@Óa\u0010\u0016ÿRîr\u0097¼\u0019\u0099m.£6cÆ\u0012\u0004\u0004\u0004?\u008f\u0005·^\u0017ß%\u001b\u0005À7âû×ôyÉ.¯|\u008c¾\u0089ïCêÛT\u008eT$IÅ½\u0003íÀ)Sê_*÷\twkº\bå#¹â\nôªÑ#\u008a|ÞhÕ\u0004y\u009fFe\u0099à±\u001b^\u008a\u0019K\u0018ù¨\u001d¯ñÅ#\u000fì9\u009b\"B±\u007fÈz\u008aï\u009b¸\u00867e aL§\u001bJ§\u008f*û\u0087Ã\u008b\r¡Q-?ã\u00853á#\u009c^ <þ\u008d\u008dýg½(-\u0013Ä\u0098üv\b¢è¾Öqçÿ\u000b¼\u0080®kþCÑ\f\u0014á9T\u001fÛ\u000bç\u00063*!Þ¸µD\u0017 ßF[\u0083\u008aáIº´!êûR'ÄC\u009cW¹5\u0010¬\u0089\u000fÝ¸öÇýù&Ê ÏµF\u0082\u0006\u009a\u0092®]í\u0095Cb\u0006§K\"âÍ\u007f\\ó9.×èªíÀ©\u0090î(\u000bK\u0083©\u001f\u001eïg\u009dü\u0000§×§fô\u0084\u0087$!\b÷ëË\"\rg}íÖÙ¿¶<üM5\u0096¼\u0013 m;ô\"¼g\u0014v/¾\u0007\u009c/½à|gÜA¥}X\u0080\u0087$Ë\u0089µ¿\u0086eð"
         .length();
      char var3 = 'h';
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
                     g = new String[10];
                     a5y = new ModeSetting(
                        b<"g">(3022, 5455702149198051901L ^ var9),
                        b<"g">(7955, 3450641992685842158L ^ var9),
                        b<"g">(31271, 245063234908097496L ^ var9),
                        new String[]{b<"g">(12801, 7835754890182083583L ^ var9)}
                     );
                     xwf = new BooleanSetting(b<"g">(28315, 7844849014172524391L ^ var9), b<"g">(5967, 681375189823121077L ^ var9), false);
                     vb5 = new NumberSetting(b<"g">(28315, 7844849014172524391L ^ var9), b<"g">(28383, 8913163923397680934L ^ var9), 60.0F, 10.0F, 300.0F, 1.0F);
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

                  var4 = "M¨PQNtìÚßà~4Á\n\u0015ÚE\"Â>/¾9©L\u0095ºh¤goN\u00181\u0082\u008d~\u0097;Ô^JçÓ\u0011ºtÃ\u0080a\u0084\u008c\u009dã\b\u00147";
                  var6 = "M¨PQNtìÚßà~4Á\n\u0015ÚE\"Â>/¾9©L\u0095ºh¤goN\u00181\u0082\u008d~\u0097;Ô^JçÓ\u0011ºtÃ\u0080a\u0084\u008c\u009dã\b\u00147".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2264;
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
            throw new RuntimeException("zar", var10);
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
         throw new RuntimeException("zar" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
