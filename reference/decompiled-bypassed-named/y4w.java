import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class y4w extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 113383287912758L;
      return b<"x">(108, 2209149308132925948L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 116416582657456L;
      return b<"x">(905, 8882319445937749660L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic y4w.a J
      // 003: ldc2_w 108974717308019
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 4
      // 010: if_icmpge 031
      // 013: new w57
      // 016: dup
      // 017: sipush 15882
      // 01a: ldc2_w 1132827532772207326
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic x (IJ)Ljava/lang/String; bsm=y4w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 38
      // 029: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02c: athrow
      // 02d: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: getstatic n_k$pbp.f1s Ln_k$pbp;
      // 035: bipush 0
      // 036: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 03b: aload 1
      // 03c: aload 2
      // 03d: bipush 0
      // 03e: bipush 0
      // 03f: invokestatic y4w.tiq (Le7r;[Ljava/lang/String;IZ)Lmew;
      // 042: astore 6
      // 044: aload 1
      // 045: invokeinterface e7r.qha ()Lt9d; 1
      // 04a: astore 7
      // 04c: aload 7
      // 04e: aload 6
      // 050: iload 5
      // 052: ifeq 084
      // 055: invokevirtual OpaquePredicate.xjm (Lmew;)Z
      // 058: ifne 080
      // 05b: goto 062
      // 05e: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: new uvb
      // 065: dup
      // 066: sipush 21048
      // 069: ldc2_w 6345784353612072682
      // 06c: lload 3
      // 06d: lxor
      // 06e: invokedynamic x (IJ)Ljava/lang/String; bsm=y4w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: bipush 0
      // 075: anewarray 38
      // 078: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 07b: athrow
      // 07c: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 7
      // 082: aload 6
      // 084: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 087: astore 8
      // 089: aload 8
      // 08b: ifnonnull 0ac
      // 08e: new uvb
      // 091: dup
      // 092: sipush 3200
      // 095: ldc2_w 4522901025435048019
      // 098: lload 3
      // 099: lxor
      // 09a: invokedynamic x (IJ)Ljava/lang/String; bsm=y4w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: nop
      // 0a0: bipush 0
      // 0a1: anewarray 38
      // 0a4: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0a7: athrow
      // 0a8: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: new bdo
      // 0af: dup
      // 0b0: invokespecial bdo.<init> ()V
      // 0b3: astore 9
      // 0b5: aload 8
      // 0b7: aload 9
      // 0b9: invokevirtual pyk.m2a (Lbdo;)V
      // 0bc: aload 9
      // 0be: invokevirtual bdo.h33 ()Lgdw;
      // 0c1: checkcast bdo
      // 0c4: astore 10
      // 0c6: aload 1
      // 0c7: aload 2
      // 0c8: bipush 3
      // 0c9: invokestatic y4w.as_ (Le7r;[Ljava/lang/String;I)Lekw;
      // 0cc: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 0d1: invokestatic sza.mft (Ljava/lang/String;)Lbdo;
      // 0d4: astore 11
      // 0d6: goto 0fd
      // 0d9: astore 12
      // 0db: new uvb
      // 0de: dup
      // 0df: sipush 18912
      // 0e2: ldc2_w 516177481414024497
      // 0e5: lload 3
      // 0e6: lxor
      // 0e7: invokedynamic x (IJ)Ljava/lang/String; bsm=y4w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: nop
      // 0ed: bipush 1
      // 0ee: anewarray 38
      // 0f1: dup
      // 0f2: bipush 0
      // 0f3: aload 12
      // 0f5: invokevirtual npr.getMessage ()Ljava/lang/String;
      // 0f8: aastore
      // 0f9: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0fc: athrow
      // 0fd: aload 9
      // 0ff: aload 11
      // 101: invokevirtual bdo.uhv (Lbdo;)V
      // 104: aload 9
      // 106: ldc "x"
      // 108: nop
      // 109: aload 6
      // 10b: invokevirtual mew.getX ()I
      // 10e: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 111: aload 9
      // 113: ldc "y"
      // 115: nop
      // 116: aload 6
      // 118: invokevirtual mew.getY ()I
      // 11b: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 11e: aload 9
      // 120: ldc "z"
      // 122: nop
      // 123: aload 6
      // 125: invokevirtual mew.getZ ()I
      // 128: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 12b: iload 5
      // 12d: ifeq 1a3
      // 130: aload 9
      // 132: aload 10
      // 134: invokevirtual bdo.equals (Ljava/lang/Object;)Z
      // 137: ifeq 167
      // 13a: goto 141
      // 13d: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: new uvb
      // 144: dup
      // 145: sipush 16148
      // 148: ldc2_w 9029929545254366148
      // 14b: lload 3
      // 14c: lxor
      // 14d: invokedynamic x (IJ)Ljava/lang/String; bsm=y4w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: nop
      // 153: bipush 1
      // 154: anewarray 38
      // 157: dup
      // 158: bipush 0
      // 159: aload 9
      // 15b: invokevirtual bdo.toString ()Ljava/lang/String;
      // 15e: aastore
      // 15f: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 162: athrow
      // 163: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: aload 8
      // 169: aload 9
      // 16b: invokevirtual pyk.agl (Lbdo;)V
      // 16e: aload 8
      // 170: invokevirtual pyk.r5t ()V
      // 173: aload 7
      // 175: aload 6
      // 177: invokevirtual OpaquePredicate.nfo (Lmew;)V
      // 17a: aload 1
      // 17b: getstatic n_k$pbp.f1s Ln_k$pbp;
      // 17e: bipush 1
      // 17f: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 184: aload 1
      // 185: aload 0
      // 186: sipush 13179
      // 189: ldc2_w 7473207172990920620
      // 18c: lload 3
      // 18d: lxor
      // 18e: invokedynamic x (IJ)Ljava/lang/String; bsm=y4w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: nop
      // 194: bipush 1
      // 195: anewarray 38
      // 198: dup
      // 199: bipush 0
      // 19a: aload 9
      // 19c: invokevirtual bdo.toString ()Ljava/lang/String;
      // 19f: aastore
      // 1a0: invokestatic y4w.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1a3: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: iload 4
      // 09: ifne 2b
      // 0c: ifle 3f
      // 0f: goto 16
      // 12: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 2
      // 17: iload 4
      // 19: ifne 37
      // 1c: goto 23
      // 1f: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: arraylength
      // 24: goto 2b
      // 27: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: bipush 3
      // 2c: if_icmpgt 3f
      // 2f: aload 2
      // 30: goto 37
      // 33: invokestatic y4w.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: bipush 0
      // 38: aload 3
      // 39: invokestatic y4w.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 3c: goto 40
      // 3f: aconst_null
      // 40: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6865384944725667784L, 2412134274472008887L, MethodHandles.lookup().lookupClass()).a(277367012916816L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 27687334586068L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "?¦x<G+ \u0013:&h\u0090¾ÆÛ\u001aJºyÊ½m')¹I=\u008d\u0019\u009eÌÉ©,ëzi®XÞ\u0012ÿ\u007fý5i¦\u000b8ü(!?\u009fåþïx\u009dJ:ê¦ã¶õó\u0081\u0018á~ö.\u007fUA\u0003q\u001dKå`Q@\u0018I3\u009avè»o[½\u009e\u009d\u009a_\u0015\u0092\u00931Á\u0083s\u0018ºÉ\"¿\u0087ÓH\u008fzíZÄ\u0098/#\u0013\u0088öx¾êàJÔ8F\u0015.Ô]·ZÆ?F¬p6òîþâs\u0017\u00839WÙMh|\u0088Ñ#T²¯Ç8±úE[P$Îí\u009f¶6\u001f\u0000ºWS\u0090ZÏ\u0094nü8sMÈÑ9!6òów\u009cJ\\]ÏU«XuPØî\u0007ÿ¥EÀ?\u000b\u0097ÚÞZÖVRfVáþ\u001b\u000b\u0081V\u009a\u0091P>¤¶lKð'úN8¤\u0003&çî\"\f\u0011\u008b?%,ÙaÝªw\"H\u001aòÅ9Ù\n\u000b³\u000b \u0086¤»QÐ-è@êÛSc\u0017=\u0087¾ÖÃá\u0095\u009e\u007f\u008fD\u0007îe";
      int var8 = "?¦x<G+ \u0013:&h\u0090¾ÆÛ\u001aJºyÊ½m')¹I=\u008d\u0019\u009eÌÉ©,ëzi®XÞ\u0012ÿ\u007fý5i¦\u000b8ü(!?\u009fåþïx\u009dJ:ê¦ã¶õó\u0081\u0018á~ö.\u007fUA\u0003q\u001dKå`Q@\u0018I3\u009avè»o[½\u009e\u009d\u009a_\u0015\u0092\u00931Á\u0083s\u0018ºÉ\"¿\u0087ÓH\u008fzíZÄ\u0098/#\u0013\u0088öx¾êàJÔ8F\u0015.Ô]·ZÆ?F¬p6òîþâs\u0017\u00839WÙMh|\u0088Ñ#T²¯Ç8±úE[P$Îí\u009f¶6\u001f\u0000ºWS\u0090ZÏ\u0094nü8sMÈÑ9!6òów\u009cJ\\]ÏU«XuPØî\u0007ÿ¥EÀ?\u000b\u0097ÚÞZÖVRfVáþ\u001b\u000b\u0081V\u009a\u0091P>¤¶lKð'úN8¤\u0003&çî\"\f\u0011\u008b?%,ÙaÝªw\"H\u001aòÅ9Ù\n\u000b³\u000b \u0086¤»QÐ-è@êÛSc\u0017=\u0087¾ÖÃá\u0095\u009e\u007f\u008fD\u0007îe"
         .length();
      char var5 = '0';
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
                     g = new String[8];
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

                  var6 = "\u0087Õ_8g¤«\u000fÞÞ\u009a\u0085\u007foI}bÀîÀÐ$\u008bLï£^\u00adP£_¦\u001cíÞÃO(û.\u009fê\u0018ÎG\u000b¡\u0087\u008b9û\u00adÝ=t\u009c8Fî§Ã\u001f \u0082´\u007f5ôå\u0010\u0018\u0080n\u0095¬\u001e\u0094|ã\u0083ÿW,5ªKM\u001f\ffSfñ1>ÙÍ°\u0003ÖÕJ2\u0089N$ô\u008f\u0099åh\u0082m";
                  var8 = "\u0087Õ_8g¤«\u000fÞÞ\u009a\u0085\u007foI}bÀîÀÐ$\u008bLï£^\u00adP£_¦\u001cíÞÃO(û.\u009fê\u0018ÎG\u000b¡\u0087\u008b9û\u00adÝ=t\u009c8Fî§Ã\u001f \u0082´\u007f5ôå\u0010\u0018\u0080n\u0095¬\u001e\u0094|ã\u0083ÿW,5ªKM\u001f\ffSfñ1>ÙÍ°\u0003ÖÕJ2\u0089N$ô\u008f\u0099åh\u0082m"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30857;
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
            throw new RuntimeException("y4w", var10);
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
         throw new RuntimeException("y4w" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
