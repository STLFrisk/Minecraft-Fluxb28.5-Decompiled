import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ekz {
   private final Map mix;
   private final Map i4q;
   private final String ifu;
   private final URL z6s;
   private final zgw we4;
   private final Timer oiz;
   private final Object elw;
   private final long b5s;
   private boolean bza;
   private int txo;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ekz(String var1, zgw var2, long var3) {
      long var5 = a ^ 20656973305980L;
      super();
      this.mix = Maps.newHashMap();
      this.i4q = Maps.newHashMap();
      this.ifu = UUID.randomUUID().toString();
      this.oiz = new Timer(a<"t">(21463, 38757634111941599L ^ var5), true);
      this.elw = new Object();

      try {
         this.z6s = new URL(a<"t">(13539, 4262836685475925235L ^ var5) + var1 + a<"t">(17072, 5693780324052351666L ^ var5) + 2);
      } catch (MalformedURLException var8) {
         throw new IllegalArgumentException();
      }

      this.we4 = var2;
      this.b5s = var3;
   }

   public void iby() {
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
      // 05: iload 1
      // 06: ifne 27
      // 09: getfield ekz.bza Z
      // 0c: ifne 39
      // 0f: goto 16
      // 12: invokestatic ekz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 0
      // 17: bipush 1
      // 18: putfield ekz.bza Z
      // 1b: aload 0
      // 1c: invokespecial ekz.jb8 ()V
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic ekz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26: athrow
      // 27: getfield ekz.oiz Ljava/util/Timer;
      // 2a: new ekz$1
      // 2d: dup
      // 2e: aload 0
      // 2f: invokespecial ekz$1.<init> (Lekz;)V
      // 32: lconst_0
      // 33: ldc2_w 900000
      // 36: invokevirtual java/util/Timer.schedule (Ljava/util/TimerTask;JJ)V
      // 39: return
   }

   private void jb8() {
      long var1 = a ^ 39083722195760L;
      this.kaq();
      this.vgd(a<"t">(18430, 2732262441292375203L ^ var1), this.ifu);
      this.etq(a<"t">(7026, 1832463668980971575L ^ var1), this.ifu);
      this.etq(a<"t">(23156, 5742275693663172914L ^ var1), System.getProperty(a<"t">(10582, 9138710187970284045L ^ var1)));
      this.etq(a<"t">(8411, 417113471540118416L ^ var1), System.getProperty(a<"t">(8404, 5835918194196235159L ^ var1)));
      this.etq(a<"t">(27676, 373408068264169286L ^ var1), System.getProperty(a<"t">(5230, 3392401067238029090L ^ var1)));
      this.etq(a<"t">(2834, 9014524987965040720L ^ var1), System.getProperty(a<"t">(9047, 4403586403421896734L ^ var1)));
      this.vgd(a<"t">(31034, 1917279469804657271L ^ var1), a<"t">(27103, 8445827329532267160L ^ var1));
      this.we4.w78(this);
   }

   private void kaq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ekz.a J
      // 03: ldc2_w 75394442999899
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic java/lang/management/ManagementFactory.getRuntimeMXBean ()Ljava/lang/management/RuntimeMXBean;
      // 0b: astore 4
      // 0d: invokestatic OpaquePredicate.c ()I
      // 10: aload 4
      // 12: invokeinterface java/lang/management/RuntimeMXBean.getInputArguments ()Ljava/util/List; 1
      // 17: astore 5
      // 19: istore 3
      // 1a: bipush 0
      // 1b: istore 6
      // 1d: aload 5
      // 1f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 24: astore 7
      // 26: aload 7
      // 28: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d: ifeq 97
      // 30: aload 7
      // 32: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37: checkcast java/lang/String
      // 3a: astore 8
      // 3c: iload 3
      // 3d: ifne ae
      // 40: aload 8
      // 42: sipush 4832
      // 45: ldc2_w 6448245962350365387
      // 48: lload 1
      // 49: lxor
      // 4a: invokedynamic t (IJ)Ljava/lang/String; bsm=ekz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 53: ifeq 93
      // 56: goto 5d
      // 59: invokestatic ekz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5c: athrow
      // 5d: aload 0
      // 5e: new java/lang/StringBuilder
      // 61: dup
      // 62: invokespecial java/lang/StringBuilder.<init> ()V
      // 65: sipush 19307
      // 68: ldc2_w 3363803078569710415
      // 6b: lload 1
      // 6c: lxor
      // 6d: invokedynamic t (IJ)Ljava/lang/String; bsm=ekz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: nop
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76: iload 6
      // 78: iinc 6 1
      // 7b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 7e: ldc "]"
      // 80: nop
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 87: aload 8
      // 89: invokevirtual ekz.vgd (Ljava/lang/String;Ljava/lang/Object;)V
      // 8c: goto 93
      // 8f: invokestatic ekz.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 92: athrow
      // 93: iload 3
      // 94: ifeq 26
      // 97: aload 0
      // 98: sipush 14780
      // 9b: ldc2_w 9084198404814545289
      // 9e: lload 1
      // 9f: lxor
      // a0: invokedynamic t (IJ)Ljava/lang/String; bsm=ekz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: nop
      // a6: iload 6
      // a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ab: invokevirtual ekz.vgd (Ljava/lang/String;Ljava/lang/Object;)V
      // ae: return
   }

   public void rr_() {
      long var1 = a ^ 81434760464445L;
      this.etq(a<"t">(30134, 887014725142814202L ^ var1), Runtime.getRuntime().totalMemory());
      this.etq(a<"t">(14616, 8798654293926793567L ^ var1), Runtime.getRuntime().maxMemory());
      this.etq(a<"t">(30768, 6090750065035186293L ^ var1), Runtime.getRuntime().freeMemory());
      this.etq(a<"t">(9061, 2823241051667319607L ^ var1), Runtime.getRuntime().availableProcessors());
      this.we4.o2l(this);
   }

   public void vgd(String var1, Object var2) {
      synchronized (this.elw) {
         this.i4q.put(var1, var2);
      }
   }

   public void etq(String var1, Object var2) {
      synchronized (this.elw) {
         this.mix.put(var1, var2);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public Map cph() {
      LinkedHashMap var2 = Maps.newLinkedHashMap();
      int var10000 = OpaquePredicate.c();
      Object var3 = this.elw;
      synchronized (this.elw){} // $VF: monitorenter 
      int var1 = var10000;

      try {
         this.rr_();
         Iterator var4 = this.mix.entrySet().iterator();

         while (true) {
            if (var4.hasNext()) {
               Entry var5 = (Entry)var4.next();

               try {
                  var2.put(var5.getKey(), var5.getValue().toString());
                  if (var1 != 0) {
                     break;
                  }

                  if (var1 == 0) {
                     continue;
                  }
               } catch (IllegalArgumentException var11) {
                  throw a(var11);
               }
            }

            var4 = this.i4q.entrySet().iterator();
            break;
         }

         Object var10001;
         while (true) {
            if (var4.hasNext()) {
               Entry var13 = (Entry)var4.next();

               try {
                  var14 = var2;
                  var10001 = var13.getKey();
                  if (var1 != 0) {
                     break;
                  }

                  var2.put(var10001, var13.getValue().toString());
                  if (var1 == 0) {
                     continue;
                  }
               } catch (IllegalArgumentException var10) {
                  throw a(var10);
               }
            }

            var14 = var2;
            var10001 = var3;
            break;
         }

         // $VF: monitorexit
         return var14;
      } finally {
         // $VF: monitorexit
      }
   }

   public boolean rav() {
      return this.bza;
   }

   public void fne() {
      this.oiz.cancel();
   }

   public String imb() {
      return this.ifu;
   }

   public long ggn() {
      return this.b5s;
   }

   public static zgw p0l(ekz var0) {
      return var0.we4;
   }

   public static Object y0h(ekz var0) {
      return var0.elw;
   }

   public static Map uyh(ekz var0) {
      return var0.i4q;
   }

   public static int a_g(ekz var0) {
      return var0.txo;
   }

   public static Map nh0(ekz var0) {
      return var0.mix;
   }

   public static int wl1(ekz var0) {
      return var0.txo++;
   }

   public static String byx(ekz var0) {
      return var0.ifu;
   }

   public static URL wrk(ekz var0) {
      return var0.z6s;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4962872172885092375L, 4426475169912022598L, MethodHandles.lookup().lookupClass()).a(29406131368990L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 113994554762526L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[22];
      int var7 = 0;
      String var6 = ".\u008fâ³·òyE`aÌ\u0006à¦\u001aõ\u00adqeé9\b?y\u0018æ!\u0015¨Å1gÑ\u0082¯X\u0083o8jz;îÆû\u0087eË%\u0010¦±O1>wÌ\u0088öÈÎ\u0018£\u0092Á,\u0010P\u0013$\u000eþ{\u008e¼H\tKqX>ó\u0018 LÄièUÿ}\u001dy,\u0091\u009a\u000bù¶K\u0017á\u0082þmíSÝ`r^¶ß\u001dû^ \u008be\u0017^4Ê)DÓ£\u009dH\u008bÇ8PGÓÊØCV\u0083Aé)\u0080Y\nÏ>+ Ð\u0082É~¥*\u0001\u00905xñS`#\u0012éá\u00ad\u001b®}µç\u0096rîºóÖ5\u0018:\u0018´/ù+*\"ñJK¡\u0085\u0091µ\bÓ¨\u008blr\u008d³\u0013xb\u0010Ùd×\t=\u008dY\u001bu¬Eúµ\u0098\u0014\u00ad\u0010ñ¯\u0010rGÍXs¦\u00161\u0080\u0086M\u0083È \u0012\u001dLìÉZëÀ\u0000\u00939XX\u0095\bÈ/ªEÄJ¤Z»\u0092\u0088ï\u000eÂl³´ Ã%q\u0095ûÆØ@\u0099\u0005+µ;Ñ3Ùúæ\u0016¿\u0018F\u008c¼+\u0014N\u0081¿\u009e , #áTóÕÀ\u008eYó\u0000A\u0099\u0004\u0097rb\u0083Êµ-?ñºnVxªPkX\u0015è MH/\u0086\u0019\u007f@éø\u0004¸\rê\"m\u0003Í«À\u0017=¾/\rB(]\u00197\u0084×>\u0010iè®4\u0093ÜaQÆÑÐ\nç\u008bÁ{\u0018ø5æÈ\\\u0010ÒÆNIwÙ0\u0012rg;»à<\u0097\u0019\u0083Ð\u0018>\u008cU8<½4_Û¨fnüü\u009fÃ½VnÕ\u0091IG:\u0018\u0094\u008fQ\u001b+\u009a\u000f\u0095QiÙl\u007f&bMÉT\u000e\u008aÝ¤Y¨0fF³TÅP\u0093µÕ4¬\u0094D\u008ex¸nÇ;´ä\u0011¬nw\u0003\u0012ªJ}Kæ½\u0003¨ª\u0005ÍØ\u001a·D§\u0010õ\u008e`j\u0018\u0087ñÓ³RC©\u001f\u0099Êiæ(Î\\Úé%ª<Ì\u0089h'";
      int var8 = ".\u008fâ³·òyE`aÌ\u0006à¦\u001aõ\u00adqeé9\b?y\u0018æ!\u0015¨Å1gÑ\u0082¯X\u0083o8jz;îÆû\u0087eË%\u0010¦±O1>wÌ\u0088öÈÎ\u0018£\u0092Á,\u0010P\u0013$\u000eþ{\u008e¼H\tKqX>ó\u0018 LÄièUÿ}\u001dy,\u0091\u009a\u000bù¶K\u0017á\u0082þmíSÝ`r^¶ß\u001dû^ \u008be\u0017^4Ê)DÓ£\u009dH\u008bÇ8PGÓÊØCV\u0083Aé)\u0080Y\nÏ>+ Ð\u0082É~¥*\u0001\u00905xñS`#\u0012éá\u00ad\u001b®}µç\u0096rîºóÖ5\u0018:\u0018´/ù+*\"ñJK¡\u0085\u0091µ\bÓ¨\u008blr\u008d³\u0013xb\u0010Ùd×\t=\u008dY\u001bu¬Eúµ\u0098\u0014\u00ad\u0010ñ¯\u0010rGÍXs¦\u00161\u0080\u0086M\u0083È \u0012\u001dLìÉZëÀ\u0000\u00939XX\u0095\bÈ/ªEÄJ¤Z»\u0092\u0088ï\u000eÂl³´ Ã%q\u0095ûÆØ@\u0099\u0005+µ;Ñ3Ùúæ\u0016¿\u0018F\u008c¼+\u0014N\u0081¿\u009e , #áTóÕÀ\u008eYó\u0000A\u0099\u0004\u0097rb\u0083Êµ-?ñºnVxªPkX\u0015è MH/\u0086\u0019\u007f@éø\u0004¸\rê\"m\u0003Í«À\u0017=¾/\rB(]\u00197\u0084×>\u0010iè®4\u0093ÜaQÆÑÐ\nç\u008bÁ{\u0018ø5æÈ\\\u0010ÒÆNIwÙ0\u0012rg;»à<\u0097\u0019\u0083Ð\u0018>\u008cU8<½4_Û¨fnüü\u009fÃ½VnÕ\u0091IG:\u0018\u0094\u008fQ\u001b+\u009a\u000f\u0095QiÙl\u007f&bMÉT\u000e\u008aÝ¤Y¨0fF³TÅP\u0093µÕ4¬\u0094D\u008ex¸nÇ;´ä\u0011¬nw\u0003\u0012ªJ}Kæ½\u0003¨ª\u0005ÍØ\u001a·D§\u0010õ\u008e`j\u0018\u0087ñÓ³RC©\u001f\u0099Êiæ(Î\\Úé%ª<Ì\u0089h'"
         .length();
      char var5 = 24;
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
                     c = new String[22];
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

                  var6 = "\u009b®K\u0080¼i\u000f½`n\u0001å/à~BÕn;q×M)l8ýSÂ\u0017¦5\u0092\u0010Z+\u008f\u008bLÑD@u\u008aÿû.¨Ù¢";
                  var8 = "\u009b®K\u0080¼i\u000f½`n\u0001å/à~BÕn;q×M)l8ýSÂ\u0017¦5\u0092\u0010Z+\u008f\u008bLÑD@u\u008aÿû.¨Ù¢".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9894;
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
            throw new RuntimeException("ekz", var10);
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
         throw new RuntimeException("ekz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
