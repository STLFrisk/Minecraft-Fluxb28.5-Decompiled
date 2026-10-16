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

public class hcl extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 64834364835808L;
      return b<"p">(27522, 3850254811155401140L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 57214045674342L;
      return b<"p">(13047, 3667575969604308035L ^ var2);
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
      // 000: getstatic hcl.a J
      // 003: ldc2_w 69221191053989
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 2
      // 010: if_icmpge 031
      // 013: new w57
      // 016: dup
      // 017: sipush 2399
      // 01a: ldc2_w 8321861485807803946
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic p (IJ)Ljava/lang/String; bsm=hcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 37
      // 029: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02c: athrow
      // 02d: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: aload 2
      // 033: bipush 0
      // 034: aaload
      // 035: invokestatic hcl.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 038: astore 6
      // 03a: aload 1
      // 03b: aload 2
      // 03c: bipush 1
      // 03d: aaload
      // 03e: invokestatic hcl.ue7 (Le7r;Ljava/lang/String;)Lu7m;
      // 041: astore 7
      // 043: aload 2
      // 044: arraylength
      // 045: iload 5
      // 047: ifeq 065
      // 04a: bipush 3
      // 04b: if_icmplt 068
      // 04e: goto 055
      // 051: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: aload 2
      // 056: bipush 2
      // 057: aaload
      // 058: bipush 1
      // 059: bipush 64
      // 05b: invokestatic hcl.fzm (Ljava/lang/String;II)I
      // 05e: goto 065
      // 061: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: goto 069
      // 068: bipush 1
      // 069: istore 8
      // 06b: aload 2
      // 06c: arraylength
      // 06d: iload 5
      // 06f: ifeq 08a
      // 072: bipush 4
      // 073: if_icmplt 08d
      // 076: goto 07d
      // 079: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: aload 2
      // 07e: bipush 3
      // 07f: aaload
      // 080: invokestatic hcl.ll_ (Ljava/lang/String;)I
      // 083: goto 08a
      // 086: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: goto 08e
      // 08d: bipush 0
      // 08e: istore 9
      // 090: new erg
      // 093: dup
      // 094: aload 7
      // 096: iload 8
      // 098: iload 9
      // 09a: invokespecial erg.<init> (Lu7m;II)V
      // 09d: astore 10
      // 09f: aload 2
      // 0a0: arraylength
      // 0a1: iload 5
      // 0a3: ifeq 0f9
      // 0a6: bipush 5
      // 0a7: if_icmplt 0ef
      // 0aa: goto 0b1
      // 0ad: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: aload 2
      // 0b3: bipush 4
      // 0b4: invokestatic hcl.as_ (Le7r;[Ljava/lang/String;I)Lekw;
      // 0b7: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 0bc: astore 11
      // 0be: aload 10
      // 0c0: aload 11
      // 0c2: invokestatic sza.mft (Ljava/lang/String;)Lbdo;
      // 0c5: invokevirtual erg.b67 (Lbdo;)V
      // 0c8: goto 0ef
      // 0cb: astore 12
      // 0cd: new uvb
      // 0d0: dup
      // 0d1: sipush 11207
      // 0d4: ldc2_w 6469474732256410805
      // 0d7: lload 3
      // 0d8: lxor
      // 0d9: invokedynamic p (IJ)Ljava/lang/String; bsm=hcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: nop
      // 0df: bipush 1
      // 0e0: anewarray 37
      // 0e3: dup
      // 0e4: bipush 0
      // 0e5: aload 12
      // 0e7: invokevirtual npr.getMessage ()Ljava/lang/String;
      // 0ea: aastore
      // 0eb: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0ee: athrow
      // 0ef: aload 6
      // 0f1: getfield ha9.up_ Ljnq;
      // 0f4: aload 10
      // 0f6: invokevirtual jnq.phd (Lerg;)Z
      // 0f9: istore 11
      // 0fb: iload 11
      // 0fd: iload 5
      // 0ff: ifeq 151
      // 102: ifeq 14f
      // 105: goto 10c
      // 108: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: aload 6
      // 10e: getfield ha9.oay Lt9d;
      // 111: aload 6
      // 113: sipush 15492
      // 116: ldc2_w 639123203396119538
      // 119: lload 3
      // 11a: lxor
      // 11b: invokedynamic p (IJ)Ljava/lang/String; bsm=hcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: nop
      // 121: ldc 0.2
      // 123: nop
      // 124: aload 6
      // 126: invokevirtual ha9.mbr ()Ljava/util/Random;
      // 129: invokevirtual java/util/Random.nextFloat ()F
      // 12c: aload 6
      // 12e: invokevirtual ha9.mbr ()Ljava/util/Random;
      // 131: invokevirtual java/util/Random.nextFloat ()F
      // 134: fsub
      // 135: ldc 0.7
      // 137: nop
      // 138: fmul
      // 139: fconst_1
      // 13a: fadd
      // 13b: fconst_2
      // 13c: fmul
      // 13d: invokevirtual t9d.yfq (Li2h;Ljava/lang/String;FF)V
      // 140: aload 6
      // 142: getfield ha9.fv9 L_jc;
      // 145: invokevirtual _jc.n4z ()V
      // 148: goto 14f
      // 14b: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14e: athrow
      // 14f: iload 11
      // 151: iload 5
      // 153: ifeq 178
      // 156: ifeq 1b1
      // 159: goto 160
      // 15c: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: aload 10
      // 162: iload 5
      // 164: ifeq 17d
      // 167: goto 16e
      // 16a: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: getfield erg.qd2 I
      // 171: goto 178
      // 174: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: ifgt 1b1
      // 17b: aload 10
      // 17d: bipush 1
      // 17e: putfield erg.qd2 I
      // 181: aload 1
      // 182: getstatic n_k$pbp.nw4 Ln_k$pbp;
      // 185: iload 8
      // 187: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 18c: aload 6
      // 18e: aload 10
      // 190: bipush 0
      // 191: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 194: astore 12
      // 196: aload 12
      // 198: iload 5
      // 19a: ifeq 1a9
      // 19d: ifnull 1ac
      // 1a0: goto 1a7
      // 1a3: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a6: athrow
      // 1a7: aload 12
      // 1a9: invokevirtual nvf.jgs ()V
      // 1ac: iload 5
      // 1ae: ifne 1f3
      // 1b1: aload 1
      // 1b2: getstatic n_k$pbp.nw4 Ln_k$pbp;
      // 1b5: iload 8
      // 1b7: aload 10
      // 1b9: getfield erg.qd2 I
      // 1bc: isub
      // 1bd: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 1c2: aload 6
      // 1c4: aload 10
      // 1c6: bipush 0
      // 1c7: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 1ca: astore 12
      // 1cc: aload 12
      // 1ce: iload 5
      // 1d0: ifeq 1f4
      // 1d3: ifnull 1f3
      // 1d6: goto 1dd
      // 1d9: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dc: athrow
      // 1dd: aload 12
      // 1df: invokevirtual nvf.do6 ()V
      // 1e2: aload 12
      // 1e4: aload 6
      // 1e6: invokevirtual ha9.noc ()Ljava/lang/String;
      // 1e9: invokevirtual nvf.bl4 (Ljava/lang/String;)V
      // 1ec: goto 1f3
      // 1ef: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f2: athrow
      // 1f3: aload 1
      // 1f4: aload 0
      // 1f5: sipush 18307
      // 1f8: ldc2_w 763379590891917559
      // 1fb: lload 3
      // 1fc: lxor
      // 1fd: invokedynamic p (IJ)Ljava/lang/String; bsm=hcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: nop
      // 203: bipush 3
      // 204: anewarray 37
      // 207: dup
      // 208: bipush 0
      // 209: aload 10
      // 20b: invokevirtual erg.lob ()Lekw;
      // 20e: aastore
      // 20f: dup
      // 210: bipush 1
      // 211: iload 8
      // 213: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 216: aastore
      // 217: dup
      // 218: bipush 2
      // 219: aload 6
      // 21b: invokevirtual ha9.noc ()Ljava/lang/String;
      // 21e: aastore
      // 21f: invokestatic hcl.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 222: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: bipush 1
      // 08: iload 4
      // 0a: ifeq 35
      // 0d: if_icmpne 26
      // 10: goto 17
      // 13: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 2
      // 18: aload 0
      // 19: invokevirtual hcl.r8l ()[Ljava/lang/String;
      // 1c: invokestatic hcl.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 1f: goto 46
      // 22: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 2
      // 27: iload 4
      // 29: ifeq 39
      // 2c: arraylength
      // 2d: bipush 2
      // 2e: goto 35
      // 31: invokestatic hcl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: if_icmpne 45
      // 38: aload 2
      // 39: getstatic u7m.p5w Lnga;
      // 3c: invokevirtual nga.kqi ()Ljava/util/Set;
      // 3f: invokestatic hcl.d79 ([Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
      // 42: goto 46
      // 45: aconst_null
      // 46: areturn
   }

   public String[] r8l() {
      return vr1._0v().p14();
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.c();

      try {
         if (var3 != 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8847245415447837512L, -7844761937337620568L, MethodHandles.lookup().lookupClass()).a(169424754998144L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 129180640859709L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "J²y\u000fëþ\u0004«ÓÄXïiÑã\u0084Yd\u0000ø^w\n\u0013ÄªÁ\u000f\u000fÂÝ½7#z\u0007\u0005ÞÁ\u0018\u0018\u007f=út\u008aÁÝ\u0011®sC´d»(G#\u0097AÝ\u009d\u009a$ö0+þ¥ó\rû´`\u009a5ºèí7e\u0092'2\u0001úº\u0094Ý\u001bU\u0001\u000bÆ\u009eÃ©ðhÙ\u0018Ba\u001c\u0091\u009bÞbµÒGÈX\u0001(§Iä,\u00023\u0083s(\u0005°\u0094ú\u0094\u0090\u009ba\u009a»Ð_×\u0007+íÏTéõ\u0096ø:\u0087°Ë\u0016Zô\u0005q";
      int var8 = "J²y\u000fëþ\u0004«ÓÄXïiÑã\u0084Yd\u0000ø^w\n\u0013ÄªÁ\u000f\u000fÂÝ½7#z\u0007\u0005ÞÁ\u0018\u0018\u007f=út\u008aÁÝ\u0011®sC´d»(G#\u0097AÝ\u009d\u009a$ö0+þ¥ó\rû´`\u009a5ºèí7e\u0092'2\u0001úº\u0094Ý\u001bU\u0001\u000bÆ\u009eÃ©ðhÙ\u0018Ba\u001c\u0091\u009bÞbµÒGÈX\u0001(§Iä,\u00023\u0083s(\u0005°\u0094ú\u0094\u0090\u009ba\u009a»Ð_×\u0007+íÏTéõ\u0096ø:\u0087°Ë\u0016Zô\u0005q"
         .length();
      char var5 = '(';
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
                     g = new String[6];
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

                  var6 = "\u0014ò+\nÔ?r9¯@\u008ft\u000fí\u000f_(¶\u0089\u000f\u0000\u0003ö.\u001aä\u0083\u0017\bü±´øä§`c\u0015¿\u001a¸[ÍAYV\u0096\u0082K±\u009a\u001aÉÞ º±";
                  var8 = "\u0014ò+\nÔ?r9¯@\u008ft\u000fí\u000f_(¶\u0089\u000f\u0000\u0003ö.\u001aä\u0083\u0017\bü±´øä§`c\u0015¿\u001a¸[ÍAYV\u0096\u0082K±\u009a\u001aÉÞ º±"
                     .length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15145;
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
            throw new RuntimeException("hcl", var10);
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
         throw new RuntimeException("hcl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
