import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rxr extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 124443970224243L;
      return b<"l">(15201, 2177080770560292381L ^ var1);
   }

   @Override
   public int bag() {
      return 0;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 140531819912437L;
      return b<"l">(31042, 7336092455718185139L ^ var2);
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
      // 000: getstatic rxr.a J
      // 003: ldc2_w 128839949366582
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: iload 5
      // 011: ifeq 04d
      // 014: bipush 3
      // 015: if_icmpge 03d
      // 018: goto 01f
      // 01b: invokestatic rxr.a (Loov;)Loov;
      // 01e: athrow
      // 01f: new w57
      // 022: dup
      // 023: sipush 12388
      // 026: ldc2_w 9122451251752536154
      // 029: lload 3
      // 02a: lxor
      // 02b: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: bipush 0
      // 032: anewarray 30
      // 035: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 038: athrow
      // 039: invokestatic rxr.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 1
      // 03e: iload 5
      // 040: ifeq 063
      // 043: instanceof z96
      // 046: goto 04d
      // 049: invokestatic rxr.a (Loov;)Loov;
      // 04c: athrow
      // 04d: ifeq 05b
      // 050: aload 1
      // 051: checkcast z96
      // 054: astore 6
      // 056: iload 5
      // 058: ifne 0a3
      // 05b: aload 1
      // 05c: goto 063
      // 05f: invokestatic rxr.a (Loov;)Loov;
      // 062: athrow
      // 063: invokeinterface e7r.zyd ()Li2h; 1
      // 068: astore 7
      // 06a: aload 7
      // 06c: iload 5
      // 06e: ifeq 09e
      // 071: instanceof z96
      // 074: ifne 09c
      // 077: goto 07e
      // 07a: invokestatic rxr.a (Loov;)Loov;
      // 07d: athrow
      // 07e: new uvb
      // 081: dup
      // 082: sipush 18350
      // 085: ldc2_w 3249379141513576344
      // 088: lload 3
      // 089: lxor
      // 08a: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: nop
      // 090: bipush 0
      // 091: anewarray 30
      // 094: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 097: athrow
      // 098: invokestatic rxr.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 7
      // 09e: checkcast z96
      // 0a1: astore 6
      // 0a3: invokestatic vr1._0v ()Lvr1;
      // 0a6: bipush 0
      // 0a7: invokevirtual vr1.hrw (I)Ldug;
      // 0aa: invokevirtual dug.fgp ()Luci;
      // 0ad: astore 7
      // 0af: aload 7
      // 0b1: aload 2
      // 0b2: bipush 0
      // 0b3: aaload
      // 0b4: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 0b7: astore 8
      // 0b9: aload 8
      // 0bb: iload 5
      // 0bd: ifeq 0cc
      // 0c0: ifnull 233
      // 0c3: goto 0ca
      // 0c6: invokestatic rxr.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 8
      // 0cc: invokevirtual sa6.do2 ()Lz0w;
      // 0cf: getstatic z0w.cq0 Lz0w;
      // 0d2: if_acmpne 233
      // 0d5: aload 2
      // 0d6: bipush 2
      // 0d7: aaload
      // 0d8: invokestatic rxr.ll_ (Ljava/lang/String;)I
      // 0db: istore 9
      // 0dd: aload 7
      // 0df: aload 6
      // 0e1: invokevirtual z96.noc ()Ljava/lang/String;
      // 0e4: aload 8
      // 0e6: iload 5
      // 0e8: ifeq 125
      // 0eb: invokevirtual uci.g4w (Ljava/lang/String;Lsa6;)Z
      // 0ee: ifne 11c
      // 0f1: goto 0f8
      // 0f4: invokestatic rxr.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: new uvb
      // 0fb: dup
      // 0fc: sipush 30294
      // 0ff: ldc2_w 347661538514718317
      // 102: lload 3
      // 103: lxor
      // 104: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: nop
      // 10a: bipush 1
      // 10b: anewarray 30
      // 10e: dup
      // 10f: bipush 0
      // 110: aload 2
      // 111: bipush 0
      // 112: aaload
      // 113: aastore
      // 114: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 117: athrow
      // 118: invokestatic rxr.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 7
      // 11e: aload 6
      // 120: invokevirtual z96.noc ()Ljava/lang/String;
      // 123: aload 8
      // 125: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 128: astore 10
      // 12a: aload 10
      // 12c: invokevirtual r11.c8c ()Z
      // 12f: iload 5
      // 131: ifeq 176
      // 134: ifeq 162
      // 137: goto 13e
      // 13a: invokestatic rxr.a (Loov;)Loov;
      // 13d: athrow
      // 13e: new uvb
      // 141: dup
      // 142: sipush 28268
      // 145: ldc2_w 8064002228695848537
      // 148: lload 3
      // 149: lxor
      // 14a: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: nop
      // 150: bipush 1
      // 151: anewarray 30
      // 154: dup
      // 155: bipush 0
      // 156: aload 2
      // 157: bipush 0
      // 158: aaload
      // 159: aastore
      // 15a: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 15d: athrow
      // 15e: invokestatic rxr.a (Loov;)Loov;
      // 161: athrow
      // 162: sipush 9325
      // 165: ldc2_w 2831143419257363538
      // 168: lload 3
      // 169: lxor
      // 16a: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: nop
      // 170: aload 2
      // 171: bipush 1
      // 172: aaload
      // 173: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 176: iload 5
      // 178: ifeq 1b3
      // 17b: ifeq 198
      // 17e: goto 185
      // 181: invokestatic rxr.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 10
      // 187: iload 9
      // 189: invokevirtual r11.ndm (I)V
      // 18c: iload 5
      // 18e: ifne 1e1
      // 191: goto 198
      // 194: invokestatic rxr.a (Loov;)Loov;
      // 197: athrow
      // 198: sipush 25252
      // 19b: ldc2_w 5353324272217217689
      // 19e: lload 3
      // 19f: lxor
      // 1a0: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: nop
      // 1a6: aload 2
      // 1a7: bipush 1
      // 1a8: aaload
      // 1a9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ac: goto 1b3
      // 1af: invokestatic rxr.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: ifne 1da
      // 1b6: new uvb
      // 1b9: dup
      // 1ba: sipush 22110
      // 1bd: ldc2_w 4112080091876224617
      // 1c0: lload 3
      // 1c1: lxor
      // 1c2: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: nop
      // 1c8: bipush 1
      // 1c9: anewarray 30
      // 1cc: dup
      // 1cd: bipush 0
      // 1ce: aload 2
      // 1cf: bipush 1
      // 1d0: aaload
      // 1d1: aastore
      // 1d2: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1d5: athrow
      // 1d6: invokestatic rxr.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: aload 10
      // 1dc: iload 9
      // 1de: invokevirtual r11._b8 (I)V
      // 1e1: aload 10
      // 1e3: bipush 1
      // 1e4: invokevirtual r11.z7w (Z)V
      // 1e7: aload 6
      // 1e9: iload 5
      // 1eb: ifeq 206
      // 1ee: getfield z96._am Lrsh;
      // 1f1: invokevirtual rsh.u7c ()Z
      // 1f4: ifeq 22e
      // 1f7: goto 1fe
      // 1fa: invokestatic rxr.a (Loov;)Loov;
      // 1fd: athrow
      // 1fe: aload 1
      // 1ff: goto 206
      // 202: invokestatic rxr.a (Loov;)Loov;
      // 205: athrow
      // 206: aload 0
      // 207: sipush 3426
      // 20a: ldc2_w 7865512957176755546
      // 20d: lload 3
      // 20e: lxor
      // 20f: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: nop
      // 215: bipush 3
      // 216: anewarray 30
      // 219: dup
      // 21a: bipush 0
      // 21b: aload 2
      // 21c: bipush 0
      // 21d: aaload
      // 21e: aastore
      // 21f: dup
      // 220: bipush 1
      // 221: aload 2
      // 222: bipush 1
      // 223: aaload
      // 224: aastore
      // 225: dup
      // 226: bipush 2
      // 227: aload 2
      // 228: bipush 2
      // 229: aaload
      // 22a: aastore
      // 22b: invokestatic rxr.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 22e: iload 5
      // 230: ifne 257
      // 233: new uvb
      // 236: dup
      // 237: sipush 17525
      // 23a: ldc2_w 6728213652376386639
      // 23d: lload 3
      // 23e: lxor
      // 23f: invokedynamic l (IJ)Ljava/lang/String; bsm=rxr.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: nop
      // 245: bipush 1
      // 246: anewarray 30
      // 249: dup
      // 24a: bipush 0
      // 24b: aload 2
      // 24c: bipush 0
      // 24d: aaload
      // 24e: aastore
      // 24f: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 252: athrow
      // 253: invokestatic rxr.a (Loov;)Loov;
      // 256: athrow
      // 257: return
   }

   @Override
   public List ggu(e7r var1, String[] var2, mew var3) {
      long var4 = a ^ 98798763206854L;
      int var6 = t9d.b();

      label73: {
         int var10000;
         byte var10001;
         label56: {
            try {
               var10000 = var2.length;
               var10001 = 1;
               if (var6 == 0) {
                  break label56;
               }

               if (var10000 == 1) {
                  break label73;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            try {
               if (var6 == 0) {
                  return cqo(var2, new String[]{b<"l">(2140, 3568513836355710360L ^ var4), b<"l">(4944, 2423458838249010844L ^ var4)});
               }

               var10000 = var2.length;
               var10001 = 2;
            } catch (oov var12) {
               throw a(var12);
            }
         }

         if (var10000 != var10001) {
            return null;
         }

         return cqo(var2, new String[]{b<"l">(2140, 3568513836355710360L ^ var4), b<"l">(4944, 2423458838249010844L ^ var4)});
      }

      uci var7 = vr1._0v().hrw(0).fgp();
      ArrayList var8 = Lists.newArrayList();

      for (sa6 var10 : var7.n2t()) {
         try {
            if (var10.do2() == z0w.cq0) {
               var8.add(var10.qkn());
            }
         } catch (oov var11) {
            throw a(var11);
         }

         if (var6 == 0) {
            break;
         }
      }

      return cqo(var2, var8.toArray(new String[var8.size()]));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6638338676609521844L, 1622561681014552085L, MethodHandles.lookup().lookupClass()).a(256112571528753L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 103847259934598L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "ÑûÌ¶ß´\u0011j\u0086ô¬\u0085&\u000ee\u0017Ä'\u000f^QÑÞa\u001cG9SÄ¦»V\u0011\u0082á¥²0\u009d`\u0010¾Yýi.\u0097ãhÜ[Q\u001eK\u0085\t3\u0010|k?«8\u0081\u0084s32@Á\u0088]7\u009a\u0010Ï\rcRk¥\u000b\u0003\u0084¹3¥·^\u008f\u0003@À\u008e©X\n\u008aBy/Å~ dî\u0015Ú\u0097ªp&\u0000\u0086úÀ¿!½-µ $ý\u0088¿4S¦lñÍ\u009cDüd\u0087u\u0012\u0093IZK<#\u0098´ü\u001b\u000fu¢\u009dÁ\u0086Î@\u0010í]M8ão\u001aÿoþ\u009d\u0003ú^qE[\u009c\u009aý¸eÉáø/·\u009eè<Ö\u009a3\u009e\u0000=*\tD/2\u0095ë\u0083\u0087<Ê\u0095Ú·%Ñ·ý\u007f\u0015\u000e-0ü Ýx8\u001e\u008d\u000bK\u0019s2èíÅ~¼#\u000f\u008e®'\u0004\u0016#Û«Ðö\\é¼\f\u0001É £þ\u0097a/·U\u0003¸<\u008f\u001cfÞ;ÐÓÁ¹\u009d\u0014·Î\nl\u0010¯\u007f\f\u009f01¬h\u009d×ò\u0096@Û\u001a\n0\u001b\u0088«ÁnLç3\u0087\u0004¢¥\u0081F»òÿ\b¸ºÝPöz^Öâ\u0000\u0004\f\u0089«¾¥DwQ4\u0017]\\µS\u000e\u0018õµÎ8Ä¾P?QÑ.ì_yãÖ\u0093?\u009eÈ4´À\u0080\u0017\u0084¹\\\b®ÄZÒ\u00ad7«ï[CU\"\u0011?i#fÃî«\u0017Fñº\u0015\u001f@E\u0013²B\u0010HW`\u001c3\u0001\u0013ë+\u008a\u0007\u008ae\u009bé\u0088";
      int var8 = "ÑûÌ¶ß´\u0011j\u0086ô¬\u0085&\u000ee\u0017Ä'\u000f^QÑÞa\u001cG9SÄ¦»V\u0011\u0082á¥²0\u009d`\u0010¾Yýi.\u0097ãhÜ[Q\u001eK\u0085\t3\u0010|k?«8\u0081\u0084s32@Á\u0088]7\u009a\u0010Ï\rcRk¥\u000b\u0003\u0084¹3¥·^\u008f\u0003@À\u008e©X\n\u008aBy/Å~ dî\u0015Ú\u0097ªp&\u0000\u0086úÀ¿!½-µ $ý\u0088¿4S¦lñÍ\u009cDüd\u0087u\u0012\u0093IZK<#\u0098´ü\u001b\u000fu¢\u009dÁ\u0086Î@\u0010í]M8ão\u001aÿoþ\u009d\u0003ú^qE[\u009c\u009aý¸eÉáø/·\u009eè<Ö\u009a3\u009e\u0000=*\tD/2\u0095ë\u0083\u0087<Ê\u0095Ú·%Ñ·ý\u007f\u0015\u000e-0ü Ýx8\u001e\u008d\u000bK\u0019s2èíÅ~¼#\u000f\u008e®'\u0004\u0016#Û«Ðö\\é¼\f\u0001É £þ\u0097a/·U\u0003¸<\u008f\u001cfÞ;ÐÓÁ¹\u009d\u0014·Î\nl\u0010¯\u007f\f\u009f01¬h\u009d×ò\u0096@Û\u001a\n0\u001b\u0088«ÁnLç3\u0087\u0004¢¥\u0081F»òÿ\b¸ºÝPöz^Öâ\u0000\u0004\f\u0089«¾¥DwQ4\u0017]\\µS\u000e\u0018õµÎ8Ä¾P?QÑ.ì_yãÖ\u0093?\u009eÈ4´À\u0080\u0017\u0084¹\\\b®ÄZÒ\u00ad7«ï[CU\"\u0011?i#fÃî«\u0017Fñº\u0015\u001f@E\u0013²B\u0010HW`\u001c3\u0001\u0013ë+\u008a\u0007\u008ae\u009bé\u0088"
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
                     g = new String[13];
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

                  var6 = "WàrV b\u0083Ø¼E\u009a\u000e\u0087²I\u0084}¬*Ã4K\u00860-'\u000b<\u0085M\u0092\u000f\u009f<iþtÜJ*óÞ\u0002t\u0016jQ\rbÓºÓö> @(Ñáì\u0002oån´é\n\u009d©W!¡º´E.4A'Áª¯\u009b5\u008eNm\u0014_»ÅTëÑ\f\u0001w";
                  var8 = "WàrV b\u0083Ø¼E\u009a\u000e\u0087²I\u0084}¬*Ã4K\u00860-'\u000b<\u0085M\u0092\u000f\u009f<iþtÜJ*óÞ\u0002t\u0016jQ\rbÓºÓö> @(Ñáì\u0002oån´é\n\u009d©W!¡º´E.4A'Áª¯\u009b5\u008eNm\u0014_»ÅTëÑ\f\u0001w"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5216;
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
            throw new RuntimeException("rxr", var10);
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
         throw new RuntimeException("rxr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
