import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.IDN;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class wat {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public String hul() {
      return IDN.toASCII(this.oda);
   }

   public int biq() {
      return this.zj4;
   }

   public static wat vqi(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01a
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic wat.a (Loov;)Loov;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic wat.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: ldc ":"
      // 01c: nop
      // 01d: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 020: astore 2
      // 021: aload 0
      // 022: ldc "["
      // 024: nop
      // 025: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 028: iload 1
      // 029: ifeq 0ca
      // 02c: ifeq 0bd
      // 02f: goto 036
      // 032: invokestatic wat.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: ldc "]"
      // 039: nop
      // 03a: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 03d: istore 3
      // 03e: iload 3
      // 03f: iload 1
      // 040: ifeq 0ca
      // 043: ifle 0bd
      // 046: goto 04d
      // 049: invokestatic wat.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: bipush 1
      // 04f: iload 3
      // 050: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 053: astore 4
      // 055: aload 0
      // 056: iload 3
      // 057: bipush 1
      // 058: iadd
      // 059: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 05c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 05f: astore 5
      // 061: aload 5
      // 063: ldc ":"
      // 065: nop
      // 066: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 069: iload 1
      // 06a: ifeq 0b4
      // 06d: ifeq 0ac
      // 070: goto 077
      // 073: invokestatic wat.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 5
      // 079: invokevirtual java/lang/String.length ()I
      // 07c: iload 1
      // 07d: ifeq 0b4
      // 080: goto 087
      // 083: invokestatic wat.a (Loov;)Loov;
      // 086: athrow
      // 087: ifle 0ac
      // 08a: goto 091
      // 08d: invokestatic wat.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 5
      // 093: bipush 1
      // 094: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 097: astore 5
      // 099: bipush 2
      // 09a: anewarray 2
      // 09d: dup
      // 09e: bipush 0
      // 09f: aload 4
      // 0a1: aastore
      // 0a2: dup
      // 0a3: bipush 1
      // 0a4: aload 5
      // 0a6: aastore
      // 0a7: astore 2
      // 0a8: iload 1
      // 0a9: ifne 0bd
      // 0ac: bipush 1
      // 0ad: goto 0b4
      // 0b0: invokestatic wat.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: anewarray 2
      // 0b7: dup
      // 0b8: bipush 0
      // 0b9: aload 4
      // 0bb: aastore
      // 0bc: astore 2
      // 0bd: aload 2
      // 0be: iload 1
      // 0bf: ifeq 0d8
      // 0c2: arraylength
      // 0c3: goto 0ca
      // 0c6: invokestatic wat.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: bipush 2
      // 0cb: if_icmple 0d7
      // 0ce: bipush 1
      // 0cf: anewarray 2
      // 0d2: dup
      // 0d3: bipush 0
      // 0d4: aload 0
      // 0d5: aastore
      // 0d6: astore 2
      // 0d7: aload 2
      // 0d8: bipush 0
      // 0d9: aaload
      // 0da: astore 3
      // 0db: aload 2
      // 0dc: arraylength
      // 0dd: iload 1
      // 0de: ifeq 0fc
      // 0e1: bipush 1
      // 0e2: if_icmple 0ff
      // 0e5: goto 0ec
      // 0e8: invokestatic wat.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 2
      // 0ed: bipush 1
      // 0ee: aaload
      // 0ef: sipush 25565
      // 0f2: invokestatic wat.vnn (Ljava/lang/String;I)I
      // 0f5: goto 0fc
      // 0f8: invokestatic wat.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: goto 102
      // 0ff: sipush 25565
      // 102: istore 4
      // 104: iload 4
      // 106: sipush 25565
      // 109: if_icmpne 123
      // 10c: aload 3
      // 10d: invokestatic wat.r3_ (Ljava/lang/String;)[Ljava/lang/String;
      // 110: astore 5
      // 112: aload 5
      // 114: bipush 0
      // 115: aaload
      // 116: astore 3
      // 117: aload 5
      // 119: bipush 1
      // 11a: aaload
      // 11b: sipush 25565
      // 11e: invokestatic wat.vnn (Ljava/lang/String;I)I
      // 121: istore 4
      // 123: new wat
      // 126: dup
      // 127: aload 3
      // 128: iload 4
      // 12a: invokespecial wat.<init> (Ljava/lang/String;I)V
      // 12d: areturn
   }

   private static String[] r3_(String var0) {
      long var1 = a ^ 46815740038851L;

      try {
         String var3 = a<"r">(11495, 8978124284996737526L ^ var1);
         Class.forName(a<"r">(2420, 7874796426639342689L ^ var1));
         Hashtable var4 = new Hashtable();
         var4.put(a<"r">(11666, 1975041220989474946L ^ var1), a<"r">(2420, 7874796426639342689L ^ var1));
         var4.put(a<"r">(17107, 7828052105435428805L ^ var1), a<"r">(15463, 4159916914997414260L ^ var1));
         var4.put(a<"r">(26700, 9101329690844208475L ^ var1), "1");
         InitialDirContext var5 = new InitialDirContext(var4);
         Attributes var6 = var5.getAttributes(a<"r">(30157, 5039853408957956313L ^ var1) + var0, new String[]{a<"r">(24707, 6485850015420061084L ^ var1)});
         String[] var7 = var6.get(a<"r">(22462, 7478175771141644972L ^ var1)).get().toString().split(" ", 4);
         return new String[]{var7[3], var7[2]};
      } catch (Throwable var8) {
         return new String[]{var0, Integer.toString(25565)};
      }
   }

   private static int vnn(String var0, int var1) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception var3) {
         return var1;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3593738821185654968L, 7549257176309888229L, MethodHandles.lookup().lookupClass()).a(176202670484108L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 113005754070917L;
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
      String var6 = "Û/»_¤\u008cøq,7\u0097\u0088ùB±\u009f5:\u0093cpÆP¹<G\u0093\r\u009du\bÒí÷\u001fEß\u0088\u008cñÿJË\u008fXÝ#\u009d~©\u0003¹\u0000¦.âä~±\u000b\u0099Ñ×H8+y6.\u0085\\±çg\u001cÄ¼Ð\u001fø*\u0099\u008f\\ßè\u0090qÄ#BIä\u0019ñÊ\u0016Â¿¹á@Î¿«\u008cÒ§c2º¿\u009a¶,²q\u0095íQE@#\bH;§PATp\n¤ËGx\u0011W¨\u0000\u0087a£\u000b-ï÷n\u0085}òÊóÜ9~Õé\u0095Ë¬\u0089)Q+ÎHÑ[`¾\u00adw\u0086d2$\u001e\u0086,B:H{zÛ(\u009d,§â´ÂGã9×¡©\u0018t\u0080\niíÀ\u0089\u001eMóH\u0016Jò'\u0099¼x\u001f1ØS\u0003t(\u0093é\u0010/\u0090\u001aÒÂÝ^j«)\u0083Ì\u0093ËéÅ\u0010\u0093ßÒ¡\u001aUi\u0099ü\u000f\u0096\u0004Lí\u0011V@5\u0097e®\u0084\u0084\u0015h\u000eÆ\u009b\u0082\u009b°Î\u0085ô8\u0083¶\u0097\u0019WüëÕøMæöé\u0093\u0099\u0081ªnWý\u0001{N¶5\u0099ÜÃ:\u0003\u009e>&\"ä\u0003{\u0018]ê\u0093\u0014\u001e©ïß";
      int var8 = "Û/»_¤\u008cøq,7\u0097\u0088ùB±\u009f5:\u0093cpÆP¹<G\u0093\r\u009du\bÒí÷\u001fEß\u0088\u008cñÿJË\u008fXÝ#\u009d~©\u0003¹\u0000¦.âä~±\u000b\u0099Ñ×H8+y6.\u0085\\±çg\u001cÄ¼Ð\u001fø*\u0099\u008f\\ßè\u0090qÄ#BIä\u0019ñÊ\u0016Â¿¹á@Î¿«\u008cÒ§c2º¿\u009a¶,²q\u0095íQE@#\bH;§PATp\n¤ËGx\u0011W¨\u0000\u0087a£\u000b-ï÷n\u0085}òÊóÜ9~Õé\u0095Ë¬\u0089)Q+ÎHÑ[`¾\u00adw\u0086d2$\u001e\u0086,B:H{zÛ(\u009d,§â´ÂGã9×¡©\u0018t\u0080\niíÀ\u0089\u001eMóH\u0016Jò'\u0099¼x\u001f1ØS\u0003t(\u0093é\u0010/\u0090\u001aÒÂÝ^j«)\u0083Ì\u0093ËéÅ\u0010\u0093ßÒ¡\u001aUi\u0099ü\u000f\u0096\u0004Lí\u0011V@5\u0097e®\u0084\u0084\u0015h\u000eÆ\u009b\u0082\u009b°Î\u0085ô8\u0083¶\u0097\u0019WüëÕøMæöé\u0093\u0099\u0081ªnWý\u0001{N¶5\u0099ÜÃ:\u0003\u009e>&\"ä\u0003{\u0018]ê\u0093\u0014\u001e©ïß"
         .length();
      char var5 = '@';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[9];
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

                  var6 = ",Óäo´\u0090I\u0012\u0098Âå\u008eô,m\u0086\u0082\u008d}9øäÿR{·é>y\u0096ú*\u0017ò¸xI³ñ3ÿÕK\u0005CE\u0006&Ðå\u0083AíL#\u0003\u0010\u0090\u008aÅã\u0097Sfrk³PåÉÜ\u0094P";
                  var8 = ",Óäo´\u0090I\u0012\u0098Âå\u008eô,m\u0086\u0082\u008d}9øäÿR{·é>y\u0096ú*\u0017ò¸xI³ñ3ÿÕK\u0005CE\u0006&Ðå\u0083AíL#\u0003\u0010\u0090\u008aÅã\u0097Sfrk³PåÉÜ\u0094P"
                     .length();
                  var5 = '8';
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10868;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("wat", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("wat" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
