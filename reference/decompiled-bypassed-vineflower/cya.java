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

public class cya extends gbe {
   private final ggv avs;
   private pss jfy = pss.qk_();
   private String bwh;
   private String scq;
   private String t4j;
   private cya$ga4 dic;
   private gt4 _3f;
   private gt4 k9a;
   private gt4 pgr;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public cya(ggv var1, String var2) {
      this.avs = var1;
      this.oua(var2);
   }

   public String u58() {
      return this.jfy.toString();
   }

   public void oua(String var1) {
      this.jfy = pss.ggu(var1);
   }

   @Override
   public void initGui() {
      long var1 = a ^ 56435456587659L;
      this.khf.clear();
      this.bwh = fc1.gx1(b<"j">(31179, 5381998638234137038L ^ var1), new Object[0]);
      this.scq = fc1.gx1(b<"j">(25712, 7488353621316791423L ^ var1), new Object[0]);
      this.t4j = fc1.gx1(b<"j">(23382, 4929604353896043357L ^ var1), new Object[0]);
      this.dic = new cya$ga4(this);
      this.khf
         .add(
            this._3f = new gt4(
               2,
               this.dt7 / 2 - 154,
               this.o1e - 52,
               100,
               20,
               fc1.gx1(b<"j">(15566, 7985586141806834880L ^ var1), new Object[0]) + b<"j">(31918, 1489943510643471526L ^ var1)
            )
         );
      this.khf
         .add(
            this.k9a = new gt4(
               3,
               this.dt7 / 2 - 50,
               this.o1e - 52,
               100,
               20,
               fc1.gx1(b<"j">(22335, 6230343297664278326L ^ var1), new Object[0]) + b<"j">(18195, 2578031548548206356L ^ var1)
            )
         );
      this.khf.add(this.pgr = new gt4(4, this.dt7 / 2 - 155, this.o1e - 52, 150, 20, fc1.gx1(b<"j">(11371, 6303061695073494119L ^ var1), new Object[0])));
      this.khf.add(new gt4(0, this.dt7 / 2 - 155, this.o1e - 28, 150, 20, fc1.gx1(b<"j">(10869, 383839676025021041L ^ var1), new Object[0])));
      this.khf.add(new gt4(5, this.dt7 / 2 + 5, this.o1e - 52, 150, 20, fc1.gx1(b<"j">(3552, 5018634583002875373L ^ var1), new Object[0])));
      this.khf.add(new gt4(1, this.dt7 / 2 + 5, this.o1e - 28, 150, 20, fc1.gx1(b<"j">(31365, 3727285699495457423L ^ var1), new Object[0])));
      this._3f.c1s = this.k9a.c1s = false;
      this.jfy.sy0();
      this.iop();
   }

   @Override
   public void handleMouseInput() {
      super.handleMouseInput();
      this.dic.gzb();
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield cya.jfy Lpss;
      // 008: invokevirtual pss.t48 ()Ljava/util/List;
      // 00b: invokeinterface java/util/List.size ()I 1
      // 010: aload 0
      // 011: getfield cya.dic Lcya$ga4;
      // 014: getfield cya$ga4.xqg I
      // 017: isub
      // 018: bipush 1
      // 019: isub
      // 01a: istore 3
      // 01b: aload 1
      // 01c: getfield gt4._me I
      // 01f: iload 2
      // 020: ifeq 04f
      // 023: bipush 1
      // 024: if_icmpne 044
      // 027: goto 02e
      // 02a: invokestatic cya.a (Loov;)Loov;
      // 02d: athrow
      // 02e: aload 0
      // 02f: getfield cya.f41 Lc05;
      // 032: aload 0
      // 033: getfield cya.avs Lggv;
      // 036: invokevirtual c05.z2i (Lgbe;)V
      // 039: iload 2
      // 03a: ifne 119
      // 03d: goto 044
      // 040: invokestatic cya.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 1
      // 045: getfield gt4._me I
      // 048: goto 04f
      // 04b: invokestatic cya.a (Loov;)Loov;
      // 04e: athrow
      // 04f: iload 2
      // 050: ifeq 089
      // 053: ifne 07e
      // 056: goto 05d
      // 059: invokestatic cya.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield cya.avs Lggv;
      // 061: aload 0
      // 062: invokevirtual cya.u58 ()Ljava/lang/String;
      // 065: putfield ggv.ud2 Ljava/lang/String;
      // 068: aload 0
      // 069: getfield cya.f41 Lc05;
      // 06c: aload 0
      // 06d: getfield cya.avs Lggv;
      // 070: invokevirtual c05.z2i (Lgbe;)V
      // 073: iload 2
      // 074: ifne 119
      // 077: goto 07e
      // 07a: invokestatic cya.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 1
      // 07f: getfield gt4._me I
      // 082: goto 089
      // 085: invokestatic cya.a (Loov;)Loov;
      // 088: athrow
      // 089: bipush 5
      // 08a: iload 2
      // 08b: ifeq 0c9
      // 08e: if_icmpne 0b2
      // 091: goto 098
      // 094: invokestatic cya.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: getfield cya.f41 Lc05;
      // 09c: new wir
      // 09f: dup
      // 0a0: aload 0
      // 0a1: invokespecial wir.<init> (Lcya;)V
      // 0a4: invokevirtual c05.z2i (Lgbe;)V
      // 0a7: iload 2
      // 0a8: ifne 119
      // 0ab: goto 0b2
      // 0ae: invokestatic cya.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 1
      // 0b3: getfield gt4._me I
      // 0b6: iload 2
      // 0b7: ifeq 0e2
      // 0ba: goto 0c1
      // 0bd: invokestatic cya.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: bipush 4
      // 0c2: goto 0c9
      // 0c5: invokestatic cya.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: if_icmpne 119
      // 0cc: aload 0
      // 0cd: iload 2
      // 0ce: ifeq 121
      // 0d1: goto 0d8
      // 0d4: invokestatic cya.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: invokespecial cya.qsh ()Z
      // 0db: goto 0e2
      // 0de: invokestatic cya.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ifeq 119
      // 0e5: aload 0
      // 0e6: getfield cya.jfy Lpss;
      // 0e9: invokevirtual pss.t48 ()Ljava/util/List;
      // 0ec: iload 3
      // 0ed: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 0f2: pop
      // 0f3: aload 0
      // 0f4: getfield cya.dic Lcya$ga4;
      // 0f7: aload 0
      // 0f8: getfield cya.dic Lcya$ga4;
      // 0fb: getfield cya$ga4.xqg I
      // 0fe: aload 0
      // 0ff: getfield cya.jfy Lpss;
      // 102: invokevirtual pss.t48 ()Ljava/util/List;
      // 105: invokeinterface java/util/List.size ()I 1
      // 10a: bipush 1
      // 10b: isub
      // 10c: invokestatic java/lang/Math.min (II)I
      // 10f: putfield cya$ga4.xqg I
      // 112: goto 119
      // 115: invokestatic cya.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: getfield cya.jfy Lpss;
      // 11d: invokevirtual pss.sy0 ()V
      // 120: aload 0
      // 121: invokevirtual cya.iop ()V
      // 124: return
   }

   public void iop() {
      boolean var1 = this.qsh();
      this.pgr.c9a = var1;
      this.k9a.c9a = var1;
      this.k9a.c9a = false;
      this._3f.c9a = false;
   }

   private boolean qsh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield cya.dic Lcya$ga4;
      // 08: getfield cya$ga4.xqg I
      // 0b: bipush -1
      // 0c: iload 1
      // 0d: ifne 3f
      // 10: if_icmple 46
      // 13: goto 1a
      // 16: invokestatic cya.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield cya.dic Lcya$ga4;
      // 1e: getfield cya$ga4.xqg I
      // 21: iload 1
      // 22: ifne 43
      // 25: goto 2c
      // 28: invokestatic cya.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield cya.jfy Lpss;
      // 30: invokevirtual pss.t48 ()Ljava/util/List;
      // 33: invokeinterface java/util/List.size ()I 1
      // 38: goto 3f
      // 3b: invokestatic cya.a (Loov;)Loov;
      // 3e: athrow
      // 3f: if_icmpge 46
      // 42: bipush 1
      // 43: goto 47
      // 46: bipush 0
      // 47: ireturn
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.dic.j46(var1, var2, var3);
      this.poi(this.fex, this.bwh, this.dt7 / 2, 8, 16777215);
      int var4 = this.dt7 / 2 - 92 - 16;
      this.c_t(this.fex, this.scq, var4, 32, 16777215);
      this.c_t(this.fex, this.t4j, var4 + 2 + 213 - this.fex.ezt(this.t4j), 32, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   public static pss w72(cya var0) {
      return var0.jfy;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(644537642303081004L, 4780881525340628152L, MethodHandles.lookup().lookupClass()).a(123227347894671L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 129610837165698L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "¥8TÐTºoF¬WU9'm'\u00955Ý,9Jã\u009bÉ£\u0019$\u001a^Æñ\u000bLëÕô\u0095v\u0011ùý{+U\u0094åð\u0086@'Yñ\u0018ÈE}ZBâ´\u0015wpd/\u0083Ê/\u0099M\u008aq\u0091°Á°Ýo²\u0081\u001e\u0091Ã\u0095ZZéS°^Ê\u008e\u0005Ä/°'s¹$9¢Î^úÙ1ÊåZþþT8÷I¶Q>\u0084Ð\u009e\u0093-\u0095Hn\u000eØ\u0099ÐÒ¬b\u0004\u008d@Ì\u000f\u009f\u001e¦q\u001d¢·è\u001cË9J©Rµº®B~!¹ÈÙ}O1\u001a\u000f\u008a\\\u009fH\u008dÜó\u0087X\u000eþI:Ez»\u0013×\u009fNFH¾\u00164^\u001a¡Ttý\t\u0088\u009dû~sN\u0012É\u0084x¹K\u000bÏ4ºC@\u0086\u0004\u0086Ry¥«È¨¦´¨\u0091¼%\b~õ©Ï\u0003\u00958;\u0001Â@eØ¾©\u00166\u0005\f8\u0014\u0093Cþ×í\u0002\u00ad~âü\u008f\u0004¯l\u009dz±Q:ïÉ×\u0081ÆDKx\u0003ÌQYà9Gõ\u001eu\u0093Ýp\u0087S+\u00050r\b_\t\u007f&ø^ì\u00103\u00923î¥\u0017Ã\u0088TìéÊ¬ÍpøH=±ºâ\u009aÉ\u000fÁ\u0012k9$¢)\bHÖ>\u0000\u001e6\u0003d\u0085?+ÚDhé×fwþTbvý\u00ad®Ý\u000e\u007fÐ½»kH°\u0012÷ßß¼«\u0014 ¸>ýÌ`(\u0012º\u000b'B\u008brÛ\u0011 1ª]¦\u009c7/ùòbo°\u0007©(\u000f\u001d1\u000fãñÐ©¤É4q¥\u0015ÎWKHð9F&Å|w\u0094\u008bå\u008cO\u009fl\u0001\u0006)ñö4öçHÎª\u008e\u0000\u009d\nûÁýÁÈ\u001ayVäoè\u0080î\u009b\u0097\u0096\u0094ßèò\u0003\u0012\u0006\u0016x?b\n'ßN\u0099$Qþ/é(ôgú\u001dþ";
      int var8 = "¥8TÐTºoF¬WU9'm'\u00955Ý,9Jã\u009bÉ£\u0019$\u001a^Æñ\u000bLëÕô\u0095v\u0011ùý{+U\u0094åð\u0086@'Yñ\u0018ÈE}ZBâ´\u0015wpd/\u0083Ê/\u0099M\u008aq\u0091°Á°Ýo²\u0081\u001e\u0091Ã\u0095ZZéS°^Ê\u008e\u0005Ä/°'s¹$9¢Î^úÙ1ÊåZþþT8÷I¶Q>\u0084Ð\u009e\u0093-\u0095Hn\u000eØ\u0099ÐÒ¬b\u0004\u008d@Ì\u000f\u009f\u001e¦q\u001d¢·è\u001cË9J©Rµº®B~!¹ÈÙ}O1\u001a\u000f\u008a\\\u009fH\u008dÜó\u0087X\u000eþI:Ez»\u0013×\u009fNFH¾\u00164^\u001a¡Ttý\t\u0088\u009dû~sN\u0012É\u0084x¹K\u000bÏ4ºC@\u0086\u0004\u0086Ry¥«È¨¦´¨\u0091¼%\b~õ©Ï\u0003\u00958;\u0001Â@eØ¾©\u00166\u0005\f8\u0014\u0093Cþ×í\u0002\u00ad~âü\u008f\u0004¯l\u009dz±Q:ïÉ×\u0081ÆDKx\u0003ÌQYà9Gõ\u001eu\u0093Ýp\u0087S+\u00050r\b_\t\u007f&ø^ì\u00103\u00923î¥\u0017Ã\u0088TìéÊ¬ÍpøH=±ºâ\u009aÉ\u000fÁ\u0012k9$¢)\bHÖ>\u0000\u001e6\u0003d\u0085?+ÚDhé×fwþTbvý\u00ad®Ý\u000e\u007fÐ½»kH°\u0012÷ßß¼«\u0014 ¸>ýÌ`(\u0012º\u000b'B\u008brÛ\u0011 1ª]¦\u009c7/ùòbo°\u0007©(\u000f\u001d1\u000fãñÐ©¤É4q¥\u0015ÎWKHð9F&Å|w\u0094\u008bå\u008cO\u009fl\u0001\u0006)ñö4öçHÎª\u008e\u0000\u009d\nûÁýÁÈ\u001ayVäoè\u0080î\u009b\u0097\u0096\u0094ßèò\u0003\u0012\u0006\u0016x?b\n'ßN\u0099$Qþ/é(ôgú\u001dþ"
         .length();
      char var5 = '0';
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
                     g = new String[11];
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

                  var6 = "2å\u0097q\u0085ó¬p\u0016\rü\u001eÆÒ.\r9*¡éõM\u009dýú&ª\u0095\u0012ã·þ\u0010ÍÄ¦9\u009bÖkÆ=\u008fí@Gp?Ð";
                  var8 = "2å\u0097q\u0085ó¬p\u0016\rü\u001eÆÒ.\r9*¡éõM\u009dýú&ª\u0095\u0012ã·þ\u0010ÍÄ¦9\u009bÖkÆ=\u008fí@Gp?Ð".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29440;
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
            throw new RuntimeException("cya", var10);
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
         throw new RuntimeException("cya" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
