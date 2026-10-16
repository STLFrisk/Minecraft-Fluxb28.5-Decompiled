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

public class bca extends ar7 {
   public static crk tfk;
   private nhs rin;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public bca() {
      long var1 = a ^ 37178286103752L;
      super(b<"t">(10276, 3325122016222426970L ^ var1), _aj.twm, false, new j1s[0]);
      this.rin = new nhs();
   }

   @jev
   public void lcq(b4u param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: pop
      // 006: getstatic bca.ek1 Lc05;
      // 009: iload 2
      // 00a: ifeq 026
      // 00d: getfield c05.tij Lkh3;
      // 010: ifnull 04a
      // 013: goto 01a
      // 016: invokestatic bca.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: pop
      // 01c: getstatic bca.ek1 Lc05;
      // 01f: goto 026
      // 022: invokestatic bca.a (Loov;)Loov;
      // 025: athrow
      // 026: getfield c05.dzk Lakm;
      // 029: getfield akm.sc8 Li2h;
      // 02c: ifnull 04a
      // 02f: getstatic kgt.nd5 Lfyk;
      // 032: invokevirtual fyk.klu ()Z
      // 035: iload 2
      // 036: ifeq 059
      // 039: goto 040
      // 03c: invokestatic bca.a (Loov;)Loov;
      // 03f: athrow
      // 040: ifeq 04b
      // 043: goto 04a
      // 046: invokestatic bca.a (Loov;)Loov;
      // 049: athrow
      // 04a: return
      // 04b: aload 0
      // 04c: pop
      // 04d: getstatic bca.ek1 Lc05;
      // 050: getfield c05.dzk Lakm;
      // 053: getfield akm.sc8 Li2h;
      // 056: instanceof ha9
      // 059: iload 2
      // 05a: ifeq 0c1
      // 05d: ifeq 0ac
      // 060: goto 067
      // 063: invokestatic bca.a (Loov;)Loov;
      // 066: athrow
      // 067: getstatic zwr.o1s Lcn7;
      // 06a: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 06d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 070: iload 2
      // 071: ifeq 0c1
      // 074: goto 07b
      // 077: invokestatic bca.a (Loov;)Loov;
      // 07a: athrow
      // 07b: ifeq 0ac
      // 07e: goto 085
      // 081: invokestatic bca.a (Loov;)Loov;
      // 084: athrow
      // 085: aload 0
      // 086: pop
      // 087: getstatic bca.ek1 Lc05;
      // 08a: getfield c05.dzk Lakm;
      // 08d: getfield akm.sc8 Li2h;
      // 090: checkcast ha9
      // 093: invokestatic f62.a92 (Lha9;)Z
      // 096: iload 2
      // 097: ifeq 0c1
      // 09a: goto 0a1
      // 09d: invokestatic bca.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifeq 0ac
      // 0a4: goto 0ab
      // 0a7: invokestatic bca.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: return
      // 0ac: aload 0
      // 0ad: getfield bca.rin Lnhs;
      // 0b0: ldc 1000.0
      // 0b2: nop
      // 0b3: getstatic bca.tfk Lcrk;
      // 0b6: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 0b9: invokevirtual java/lang/Float.floatValue ()F
      // 0bc: fdiv
      // 0bd: f2d
      // 0be: invokevirtual nhs.yrv (D)Z
      // 0c1: iload 2
      // 0c2: ifeq 0ea
      // 0c5: ifeq 184
      // 0c8: goto 0cf
      // 0cb: invokestatic bca.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: getstatic bca.ek1 Lc05;
      // 0d2: getfield c05.vg8 Ll86;
      // 0d5: iload 2
      // 0d6: ifeq 162
      // 0d9: goto 0e0
      // 0dc: invokestatic bca.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: invokevirtual l86.kqk ()Z
      // 0e3: goto 0ea
      // 0e6: invokestatic bca.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: ifeq 14c
      // 0ed: getstatic bca.ek1 Lc05;
      // 0f0: getfield c05.vg8 Ll86;
      // 0f3: getfield l86.lq7 Lp_k;
      // 0f6: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 0f9: dup
      // 0fa: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.md_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 0fd: new mew
      // 100: dup
      // 101: bipush 0
      // 102: bipush 0
      // 103: bipush 0
      // 104: invokespecial mew.<init> (III)V
      // 107: getstatic vt2.rf3 Lvt2;
      // 10a: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 10d: invokevirtual p_k.sxi (Lmz2;)V
      // 110: getstatic bca.ek1 Lc05;
      // 113: getfield c05.vg8 Ll86;
      // 116: invokevirtual l86.hgb ()V
      // 119: getstatic bca.ek1 Lc05;
      // 11c: getfield c05.vg8 Ll86;
      // 11f: getfield l86.lq7 Lp_k;
      // 122: new net/minecraft/network/play/client/C02PacketUseEntity
      // 125: dup
      // 126: aload 0
      // 127: pop
      // 128: getstatic bca.ek1 Lc05;
      // 12b: getfield c05.dzk Lakm;
      // 12e: getfield akm.sc8 Li2h;
      // 131: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 134: invokespecial net/minecraft/network/play/client/C02PacketUseEntity.<init> (Li2h;Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;)V
      // 137: invokevirtual p_k.sxi (Lmz2;)V
      // 13a: aload 0
      // 13b: getfield bca.rin Lnhs;
      // 13e: invokevirtual nhs.zay ()V
      // 141: iload 2
      // 142: ifne 184
      // 145: goto 14c
      // 148: invokestatic bca.a (Loov;)Loov;
      // 14b: athrow
      // 14c: getstatic bca.ek1 Lc05;
      // 14f: getfield c05.vg8 Ll86;
      // 152: invokevirtual l86.hgb ()V
      // 155: getstatic bca.ek1 Lc05;
      // 158: getfield c05.vg8 Ll86;
      // 15b: goto 162
      // 15e: invokestatic bca.a (Loov;)Loov;
      // 161: athrow
      // 162: getfield l86.lq7 Lp_k;
      // 165: new net/minecraft/network/play/client/C02PacketUseEntity
      // 168: dup
      // 169: aload 0
      // 16a: pop
      // 16b: getstatic bca.ek1 Lc05;
      // 16e: getfield c05.dzk Lakm;
      // 171: getfield akm.sc8 Li2h;
      // 174: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 177: invokespecial net/minecraft/network/play/client/C02PacketUseEntity.<init> (Li2h;Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;)V
      // 17a: invokevirtual p_k.sxi (Lmz2;)V
      // 17d: aload 0
      // 17e: getfield bca.rin Lnhs;
      // 181: invokevirtual nhs.zay ()V
      // 184: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8759222137614476133L, 3400302268899665212L, MethodHandles.lookup().lookupClass()).a(12173683694261L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 20531603413147L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "5ï<í\u001fâ\u008a\tôXo\u0012|4T3§8·Ó¡â±d\u000bõ]ûa\u0018ó½ :Ú²þ?RL:º#O)ß\u000b$\u0016\u0005¡íúq¾XaÚ=2ºb¦\nA\u0010©\u008eî\"~¥\u0083\u0088\u0093_;\u0005\u001eW\u00974";
      int var6 = "5ï<í\u001fâ\u008a\tôXo\u0012|4T3§8·Ó¡â±d\u000bõ]ûa\u0018ó½ :Ú²þ?RL:º#O)ß\u000b$\u0016\u0005¡íúq¾XaÚ=2ºb¦\nA\u0010©\u008eî\"~¥\u0083\u0088\u0093_;\u0005\u001eW\u00974"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            f = var7;
            g = new String[3];
            tfk = new crk(b<"t">(26761, 6700020540221797285L ^ var9), b<"t">(31462, 890958546363163080L ^ var9), 10.0F, 1.0F, 20.0F, 1.0F);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18831;
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
            throw new RuntimeException("bca", var10);
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
         throw new RuntimeException("bca" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
