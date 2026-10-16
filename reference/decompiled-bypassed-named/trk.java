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
import net.minecraft.network.play.client.C14PacketTabComplete;

@dr9$x0j(
   t2u = "plugins",
   io4 = {},
   hjc = "Display the plugins of the server"
)
public class trk extends HwidProvider {
   public Timer ded = new Timer();
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @EventHandler
   public void a9x(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic trk.a J
      // 003: ldc2_w 133404594151974
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield wbh.vip Lmz2;
      // 011: instanceof net/minecraft/network/play/server/S3APacketTabComplete
      // 014: iload 4
      // 016: ifne 1ff
      // 019: ifeq 1e9
      // 01c: goto 023
      // 01f: invokestatic trk.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 1
      // 024: getfield wbh.vip Lmz2;
      // 027: checkcast net/minecraft/network/play/server/S3APacketTabComplete
      // 02a: astore 5
      // 02c: aload 5
      // 02e: invokevirtual net/minecraft/network/play/server/S3APacketTabComplete.ul9 ()[Ljava/lang/String;
      // 031: astore 6
      // 033: ldc ""
      // 035: nop
      // 036: astore 7
      // 038: bipush 0
      // 039: istore 8
      // 03b: aload 6
      // 03d: dup
      // 03e: astore 9
      // 040: arraylength
      // 041: istore 10
      // 043: bipush 0
      // 044: istore 11
      // 046: iload 11
      // 048: iload 10
      // 04a: if_icmpge 165
      // 04d: aload 9
      // 04f: iload 11
      // 051: aaload
      // 052: astore 12
      // 054: aload 12
      // 056: ldc ":"
      // 058: nop
      // 059: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 05c: bipush 0
      // 05d: aaload
      // 05e: bipush 1
      // 05f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 062: astore 13
      // 064: iload 4
      // 066: ifne 160
      // 069: aload 7
      // 06b: aload 13
      // 06d: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 070: iload 4
      // 072: ifne 176
      // 075: goto 07c
      // 078: invokestatic trk.a (Loov;)Loov;
      // 07b: athrow
      // 07c: ifne 15d
      // 07f: goto 086
      // 082: invokestatic trk.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 12
      // 088: ldc ":"
      // 08a: nop
      // 08b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 08e: iload 4
      // 090: ifne 0be
      // 093: goto 09a
      // 096: invokestatic trk.a (Loov;)Loov;
      // 099: athrow
      // 09a: ifeq 15d
      // 09d: goto 0a4
      // 0a0: invokestatic trk.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 13
      // 0a6: sipush 6546
      // 0a9: ldc2_w 3424898369852082458
      // 0ac: lload 2
      // 0ad: lxor
      // 0ae: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: nop
      // 0b4: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0b7: goto 0be
      // 0ba: invokestatic trk.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: iload 4
      // 0c0: ifne 0e7
      // 0c3: ifne 15d
      // 0c6: goto 0cd
      // 0c9: invokestatic trk.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 13
      // 0cf: sipush 14422
      // 0d2: ldc2_w 3184285585940392155
      // 0d5: lload 2
      // 0d6: lxor
      // 0d7: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: nop
      // 0dd: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0e0: goto 0e7
      // 0e3: invokestatic trk.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 4
      // 0e9: ifne 111
      // 0ec: ifne 15d
      // 0ef: goto 0f6
      // 0f2: invokestatic trk.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: iinc 8 1
      // 0f9: aload 7
      // 0fb: iload 4
      // 0fd: ifne 15b
      // 100: goto 107
      // 103: invokestatic trk.a (Loov;)Loov;
      // 106: athrow
      // 107: invokevirtual java/lang/String.isEmpty ()Z
      // 10a: goto 111
      // 10d: invokestatic trk.a (Loov;)Loov;
      // 110: athrow
      // 111: ifeq 12f
      // 114: new java/lang/StringBuilder
      // 117: dup
      // 118: invokespecial java/lang/StringBuilder.<init> ()V
      // 11b: aload 7
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: aload 13
      // 122: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 125: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 128: astore 7
      // 12a: iload 4
      // 12c: ifeq 15d
      // 12f: new java/lang/StringBuilder
      // 132: dup
      // 133: invokespecial java/lang/StringBuilder.<init> ()V
      // 136: aload 7
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: sipush 21912
      // 13e: ldc2_w 7731990548445512980
      // 141: lload 2
      // 142: lxor
      // 143: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: nop
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c: aload 13
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 154: goto 15b
      // 157: invokestatic trk.a (Loov;)Loov;
      // 15a: athrow
      // 15b: astore 7
      // 15d: iinc 11 1
      // 160: iload 4
      // 162: ifeq 046
      // 165: aload 7
      // 167: iload 4
      // 169: ifne 1dd
      // 16c: invokevirtual java/lang/String.isEmpty ()Z
      // 16f: goto 176
      // 172: invokestatic trk.a (Loov;)Loov;
      // 175: athrow
      // 176: ifne 1cf
      // 179: new java/lang/StringBuilder
      // 17c: dup
      // 17d: invokespecial java/lang/StringBuilder.<init> ()V
      // 180: sipush 11635
      // 183: ldc2_w 7850356120114871804
      // 186: lload 2
      // 187: lxor
      // 188: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: nop
      // 18e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 191: iload 8
      // 193: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 196: sipush 29520
      // 199: ldc2_w 4314177789034456027
      // 19c: lload 2
      // 19d: lxor
      // 19e: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: nop
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: aload 7
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: sipush 864
      // 1af: ldc2_w 6760613821534114790
      // 1b2: lload 2
      // 1b3: lxor
      // 1b4: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: nop
      // 1ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c0: invokestatic ncl.dob (Ljava/lang/String;)V
      // 1c3: iload 4
      // 1c5: ifeq 1e0
      // 1c8: goto 1cf
      // 1cb: invokestatic trk.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: sipush 32254
      // 1d2: ldc2_w 7891859353789853044
      // 1d5: lload 2
      // 1d6: lxor
      // 1d7: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: nop
      // 1dd: invokestatic ncl.dob (Ljava/lang/String;)V
      // 1e0: aload 1
      // 1e1: bipush 1
      // 1e2: invokevirtual wbh.wxi (Z)V
      // 1e5: aload 0
      // 1e6: invokestatic EventBus.unregister (Ljava/lang/Object;)V
      // 1e9: aload 0
      // 1ea: iload 4
      // 1ec: ifne 203
      // 1ef: getfield trk.ded Lnhs;
      // 1f2: ldc2_w 20000.0
      // 1f5: invokevirtual Timer.yrv (D)Z
      // 1f8: goto 1ff
      // 1fb: invokestatic trk.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: ifeq 217
      // 202: aload 0
      // 203: invokestatic EventBus.unregister (Ljava/lang/Object;)V
      // 206: sipush 6155
      // 209: ldc2_w 3278415907924248709
      // 20c: lload 2
      // 20d: lxor
      // 20e: invokedynamic g (IJ)Ljava/lang/String; bsm=trk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: nop
      // 214: invokestatic ncl.dob (Ljava/lang/String;)V
      // 217: return
   }

   @Override
   public void xjl(String[] var1) {
      long var2 = a ^ 61073583679002L;
      this.ded.zay();
      EventBus.register(this);
      this.rpq.vg8.lq7.sxi(new C14PacketTabComplete("/"));
      ncl.dob(a<"g">(1100, 4906790406182670585L ^ var2));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-921856689732237441L, 6180498268318084864L, MethodHandles.lookup().lookupClass()).a(200885167022793L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 10328333272637L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "DRÙü\u0089·3ÿñgDÛ5\u0089Ävðí\u000et`\u0081¤^l\u0011\u0001ß²Ì\rñÁ½ç\b1\n¶õ¤\u0001\u008eÔ\u008e#ÆrÃÀýç§KÆ\b=ª>ê<Íéð5+\u0013ZëUr¦îì\u000eV|ª\u009eÕÊZ@\u008aÀ \u0012å\u0083ã#\u0084Û\u008e¢üN©ªÔä»x¡þè»¿q\r¹¹|PlòÈg-w\u0018\u00adÿ¸èy\u0084\u001cX¯Ø×ô4\u0084\u0016FgíhZz\u0096\"\u009c Ø§_Û[Ëå\n\u0019©¯\u0090\u008e\u0093\"k\u0086\u0085\u009ax\u0086\u0013\u0097HI\u008cþ!\u0004Qõð\u0010\u001e¸ë±®µq¨\"ÿXs¯K\u0004@(\u0084uK\u008c\u0016V»3¦ÁC\u0081aÿI\u008f\u0096æ*jÔ \u009a«Ð¼]\u0092\u008aðw\u009f¥\u0098\u0095Y\fØ&ô\u0010'Èu\u000e?Ûð\u0018^ÄuÒy¬\u008då °ÿù½\u0087XñQ\u001aÜöÎZ\u0085õzVÐÓ¥>|É\u0095Ú*l¼ ÁOQ";
      int var8 = "DRÙü\u0089·3ÿñgDÛ5\u0089Ävðí\u000et`\u0081¤^l\u0011\u0001ß²Ì\rñÁ½ç\b1\n¶õ¤\u0001\u008eÔ\u008e#ÆrÃÀýç§KÆ\b=ª>ê<Íéð5+\u0013ZëUr¦îì\u000eV|ª\u009eÕÊZ@\u008aÀ \u0012å\u0083ã#\u0084Û\u008e¢üN©ªÔä»x¡þè»¿q\r¹¹|PlòÈg-w\u0018\u00adÿ¸èy\u0084\u001cX¯Ø×ô4\u0084\u0016FgíhZz\u0096\"\u009c Ø§_Û[Ëå\n\u0019©¯\u0090\u008e\u0093\"k\u0086\u0085\u009ax\u0086\u0013\u0097HI\u008cþ!\u0004Qõð\u0010\u001e¸ë±®µq¨\"ÿXs¯K\u0004@(\u0084uK\u008c\u0016V»3¦ÁC\u0081aÿI\u008f\u0096æ*jÔ \u009a«Ð¼]\u0092\u008aðw\u009f¥\u0098\u0095Y\fØ&ô\u0010'Èu\u000e?Ûð\u0018^ÄuÒy¬\u008då °ÿù½\u0087XñQ\u001aÜöÎZ\u0085õzVÐÓ¥>|É\u0095Ú*l¼ ÁOQ"
         .length();
      char var5 = 'x';
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
                     d = var9;
                     e = new String[9];
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

                  var6 = "þ>\u0093]Z\"Ñ\u0016bEp\f4\u009eÈ\u000bdaÓt\u0097jTiêÕ\u008e®²\u0098\u001b¿\u0010µ¢Æ:i\u008b%ÜnßßÏ%dÓ®";
                  var8 = "þ>\u0093]Z\"Ñ\u0016bEp\f4\u009eÈ\u000bdaÓt\u0097jTiêÕ\u008e®²\u0098\u001b¿\u0010µ¢Æ:i\u008b%ÜnßßÏ%dÓ®".length();
                  var5 = ' ';
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9136;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("trk", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("trk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
