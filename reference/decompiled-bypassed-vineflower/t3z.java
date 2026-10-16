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
import org.apache.logging.log4j.LogManager;

public class t3z extends gbe {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void initGui() {
      long var1 = a ^ 10214579340711L;
      this.khf.clear();
      byte var3 = -16;
      this.khf.add(new gt4(1, this.dt7 / 2 - 116, this.o1e / 2 + 62 + var3, 114, 20, fc1.gx1(b<"k">(31310, 1393846104386616667L ^ var1), new Object[0])));
      this.khf.add(new gt4(2, this.dt7 / 2 + 2, this.o1e / 2 + 62 + var3, 114, 20, fc1.gx1(b<"k">(8944, 283078023009592808L ^ var1), new Object[0])));
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
      // 00: getstatic t3z.a J
      // 03: ldc2_w 118615132576828
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifne 3c
      // 13: getfield gt4._me I
      // 16: lookupswitch 216 2 1 30 2 191
      // 30: invokestatic t3z.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 1
      // 35: goto 3c
      // 38: invokestatic t3z.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush 0
      // 3d: putfield gt4.c9a Z
      // 40: sipush 6328
      // 43: ldc2_w 2323611959923590707
      // 46: lload 2
      // 47: lxor
      // 48: invokedynamic k (IJ)Ljava/lang/String; bsm=t3z.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: nop
      // 4e: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 51: astore 5
      // 53: aload 5
      // 55: sipush 22343
      // 58: ldc2_w 4502864065294993871
      // 5b: lload 2
      // 5c: lxor
      // 5d: invokedynamic k (IJ)Ljava/lang/String; bsm=t3z.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: nop
      // 63: bipush 0
      // 64: anewarray 72
      // 67: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 6a: aconst_null
      // 6b: bipush 0
      // 6c: anewarray 46
      // 6f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 72: astore 6
      // 74: aload 5
      // 76: sipush 30651
      // 79: ldc2_w 2252417862971304242
      // 7c: lload 2
      // 7d: lxor
      // 7e: invokedynamic k (IJ)Ljava/lang/String; bsm=t3z.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: nop
      // 84: bipush 1
      // 85: anewarray 72
      // 88: dup
      // 89: bipush 0
      // 8a: ldc java/net/URI
      // 8c: nop
      // 8d: aastore
      // 8e: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 91: aload 6
      // 93: bipush 1
      // 94: anewarray 46
      // 97: dup
      // 98: bipush 0
      // 99: new java/net/URI
      // 9c: dup
      // 9d: sipush 12504
      // a0: ldc2_w 4967387690501992024
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic k (IJ)Ljava/lang/String; bsm=t3z.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: nop
      // ab: invokespecial java/net/URI.<init> (Ljava/lang/String;)V
      // ae: aastore
      // af: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // b2: pop
      // b3: goto ee
      // b6: astore 5
      // b8: getstatic t3z.x6v Lorg/apache/logging/log4j/Logger;
      // bb: sipush 11213
      // be: ldc2_w 292491142810694986
      // c1: lload 2
      // c2: lxor
      // c3: invokedynamic k (IJ)Ljava/lang/String; bsm=t3z.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: nop
      // c9: aload 5
      // cb: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // d0: iload 4
      // d2: ifeq ee
      // d5: aload 0
      // d6: getfield t3z.f41 Lc05;
      // d9: aconst_null
      // da: checkcast gbe
      // dd: invokevirtual c05.z2i (Lgbe;)V
      // e0: aload 0
      // e1: getfield t3z.f41 Lc05;
      // e4: invokevirtual c05.aa4 ()V
      // e7: goto ee
      // ea: invokestatic t3z.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ed: athrow
      // ee: return
   }

   @Override
   public void updateScreen() {
      super.updateScreen();
   }

   @Override
   public void xmz() {
      super.xmz();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(y2q);
      int var1 = (this.dt7 - 248) / 2;
      int var2 = (this.o1e - 166) / 2;
      this.mt4(var1, var2, 0, 0, 248, 166);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 18760853577368L;
      this.xmz();
      int var6 = (this.dt7 - 248) / 2 + 10;
      int var7 = (this.o1e - 166) / 2 + 8;
      this.fex.eh6(fc1.gx1(b<"k">(17697, 7952035992559048967L ^ var4), new Object[0]), (float)var6, (float)var7, 2039583);
      var7 += 12;
      moh var8 = this.f41.oxn;
      this.fex
         .eh6(
            fc1.gx1(
               b<"k">(510, 2971724246573030864L ^ var4),
               new Object[]{moh.wx5(var8.mn1.xbs()), moh.wx5(var8._70.xbs()), moh.wx5(var8.tup.xbs()), moh.wx5(var8.asx.xbs())}
            ),
            (float)var6,
            (float)var7,
            5197647
         );
      this.fex.eh6(fc1.gx1(b<"k">(9960, 4338036230699170496L ^ var4), new Object[0]), (float)var6, (float)(var7 + 12), 5197647);
      this.fex.eh6(fc1.gx1(b<"k">(19471, 223208627402264618L ^ var4), new Object[]{moh.wx5(var8.nfb.xbs())}), (float)var6, (float)(var7 + 24), 5197647);
      this.fex.eh6(fc1.gx1(b<"k">(18546, 6023398275115242587L ^ var4), new Object[]{moh.wx5(var8.iaz.xbs())}), (float)var6, (float)(var7 + 36), 5197647);
      this.fex.bsn(fc1.gx1(b<"k">(4765, 172956886142095039L ^ var4), new Object[0]), var6, var7 + 68, 218, 2039583);
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4867630840911248583L, 9113052372284217722L, MethodHandles.lookup().lookupClass()).a(31651972913661L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 95883454506480L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[14];
      int var5 = 0;
      String var4 = "3:Å{ D\u0098l\u0098&\u0092vë=G¬X+O\u0088\u001b \u008a\u000e[+\u0096àc¶o$³þn¾kó\u0084\nÞøXÏá\u0014W}(§\u0083\u0011Í\u00063\u0089F\u0081\u0019I\u00031¹\u0001Ñºo¬Çß\u0080¢ÑøLÇ*ÂO\u0092]Í7\u0016\u0099ä\u0097î \u0010R®\u001fúÖÂê`#}\u001b¦Ú\u008b·ó \u0000¸3ìBç;¾ \u001eþhòLøçÃWö¦\u000bVÍp\u009e+ðó0\u001f\u0006D8\u0018±\u0094Ø\u001a\n¾}8G\u0014\u0000\u0014\u008a«54®\u001e|×F\u009a\u009f\u001fÿ\u0091Z\u0095ÅIX\u009e\nqá_¢¾mÃÈ£)µ|\u0083\u001bmê\u0012I\u0014\u0012Y\u0083 y¿\u0005ó\u000e\u0099\u0018P;©\"\u0006\u008cc\u008bRERºo¦?ßPaltHÁ#\u0093Ï(ç\u0085þ\u0085öØþõ`báîHfó.Ó\u0014þ\u0001\u008d8aO¾é\u0019\u0089JB\u0098³\u001dÛ\u001eIÁ\u009f\u0080y(<\u008d\u000bÊr±Ù\u0016\u000fÙH¸ûå`£\u0003¼ý\u0098YÅVPÅyðm\u0004úIExc#\u0083^\u008d·Ê  XU\u0013G-þ³;\"Å\u00adF\u008b\u001aT48ßÄõ\u0086³\n\b2\u0080\u007feæV \u0018\u0010Ðþ*E.\\\u001c±?\u0082+\u0084§I]©µsqCôM\u0001\u0018²d\u0000û)\u0006Ø]\u0087\u0002'\u0080Ý\u000e\u008dn§Ó\u0007Ï#ð[\"HÌëDi\u0099¿Â\u009by³f[\bÜ\u0000\nET\u0011¥\u0091d\u008c¦%\u000bõ\u0005\"N#°\u008c\u00ad3}\u009ckJ<\u009c2#´\u0094÷ÍnY@\u008em\u0089¨´é\u00ad/HoÛ\u0094Î\u0010Ô\u0004ñ¾¼S9ó";
      int var6 = "3:Å{ D\u0098l\u0098&\u0092vë=G¬X+O\u0088\u001b \u008a\u000e[+\u0096àc¶o$³þn¾kó\u0084\nÞøXÏá\u0014W}(§\u0083\u0011Í\u00063\u0089F\u0081\u0019I\u00031¹\u0001Ñºo¬Çß\u0080¢ÑøLÇ*ÂO\u0092]Í7\u0016\u0099ä\u0097î \u0010R®\u001fúÖÂê`#}\u001b¦Ú\u008b·ó \u0000¸3ìBç;¾ \u001eþhòLøçÃWö¦\u000bVÍp\u009e+ðó0\u001f\u0006D8\u0018±\u0094Ø\u001a\n¾}8G\u0014\u0000\u0014\u008a«54®\u001e|×F\u009a\u009f\u001fÿ\u0091Z\u0095ÅIX\u009e\nqá_¢¾mÃÈ£)µ|\u0083\u001bmê\u0012I\u0014\u0012Y\u0083 y¿\u0005ó\u000e\u0099\u0018P;©\"\u0006\u008cc\u008bRERºo¦?ßPaltHÁ#\u0093Ï(ç\u0085þ\u0085öØþõ`báîHfó.Ó\u0014þ\u0001\u008d8aO¾é\u0019\u0089JB\u0098³\u001dÛ\u001eIÁ\u009f\u0080y(<\u008d\u000bÊr±Ù\u0016\u000fÙH¸ûå`£\u0003¼ý\u0098YÅVPÅyðm\u0004úIExc#\u0083^\u008d·Ê  XU\u0013G-þ³;\"Å\u00adF\u008b\u001aT48ßÄõ\u0086³\n\b2\u0080\u007feæV \u0018\u0010Ðþ*E.\\\u001c±?\u0082+\u0084§I]©µsqCôM\u0001\u0018²d\u0000û)\u0006Ø]\u0087\u0002'\u0080Ý\u000e\u008dn§Ó\u0007Ï#ð[\"HÌëDi\u0099¿Â\u009by³f[\bÜ\u0000\nET\u0011¥\u0091d\u008c¦%\u000bõ\u0005\"N#°\u008c\u00ad3}\u009ckJ<\u009c2#´\u0094÷ÍnY@\u008em\u0089¨´é\u00ad/HoÛ\u0094Î\u0010Ô\u0004ñ¾¼S9ó"
         .length();
      char var3 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[14];
                     x6v = LogManager.getLogger();
                     y2q = new gdz(b<"k">(19103, 52334312221896156L ^ var9));
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

                  var4 = "y0\u001c`ý«t«õe>M@\b¶gmyª\u0092\u0098ø·\u0001¦³`Ûs)v8u¾\u0089½ýd¸À(ß\u0094\u000bJ7è¹Û¼ÿ6SY\u0095¿(\n\u0091\u001b²ÊM\u001d«ÚÆUeÌ§3\u0016[\u008cáå7ØIf";
                  var6 = "y0\u001c`ý«t«õe>M@\b¶gmyª\u0092\u0098ø·\u0001¦³`Ûs)v8u¾\u0089½ýd¸À(ß\u0094\u000bJ7è¹Û¼ÿ6SY\u0095¿(\n\u0091\u001b²ÊM\u001d«ÚÆUeÌ§3\u0016[\u008cáå7ØIf"
                     .length();
                  var3 = '(';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15389;
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
            throw new RuntimeException("t3z", var10);
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
         throw new RuntimeException("t3z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
