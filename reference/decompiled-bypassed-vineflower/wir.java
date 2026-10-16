import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Keyboard;

public class wir extends gbe {
   private static final List imy;
   private final cya yt_;
   private String _b7;
   private String l5r;
   private String zli;
   private wir$_cj g1q;
   private gt4 gkb;
   private jqk dct;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public wir(cya var1) {
      this.yt_ = var1;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 129385602503819L;
      this.khf.clear();
      Keyboard.enableRepeatEvents(true);
      this._b7 = fc1.gx1(b<"r">(19354, 7186661559848112725L ^ var1), new Object[0]);
      this.l5r = fc1.gx1(b<"r">(22427, 2079406420014403165L ^ var1), new Object[0]);
      this.zli = fc1.gx1(b<"r">(17395, 4672975539613047354L ^ var1), new Object[0]);
      this.dct = new jqk(2, this.fex, 50, 40, this.dt7 - 100, 20);
      this.g1q = new wir$_cj(this);
      this.dct.z5t(1230);
      this.dct.nrl(this.yt_.u58());
      this.khf.add(this.gkb = new gt4(0, this.dt7 / 2 - 155, this.o1e - 28, 150, 20, fc1.gx1(b<"r">(15269, 4152232280954298992L ^ var1), new Object[0])));
      this.khf.add(new gt4(1, this.dt7 / 2 + 5, this.o1e - 28, 150, 20, fc1.gx1(b<"r">(6571, 7427001162217865315L ^ var1), new Object[0])));
      this.e5x();
   }

   @Override
   public void handleMouseInput() {
      super.handleMouseInput();
      this.g1q.gzb();
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      this.dct.elk(var1, var2, var3);
      super.mouseClicked(var1, var2, var3);
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 23
      // 09: getfield wir.dct Ljqk;
      // 0c: iload 1
      // 0d: iload 2
      // 0e: invokevirtual jqk.pst (CI)Z
      // 11: ifne 28
      // 14: goto 1b
      // 17: invokestatic wir.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic wir.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 1
      // 24: iload 2
      // 25: invokespecial gbe.dig (CI)V
      // 28: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4._me I
      // 08: iload 2
      // 09: ifeq 5e
      // 0c: ifne 53
      // 0f: goto 16
      // 12: invokestatic wir.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial wir.opg ()Z
      // 1a: iload 2
      // 1b: ifeq 5e
      // 1e: goto 25
      // 21: invokestatic wir.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 53
      // 28: goto 2f
      // 2b: invokestatic wir.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield wir.yt_ Lcya;
      // 33: aload 0
      // 34: getfield wir.dct Ljqk;
      // 37: invokevirtual jqk.xct ()Ljava/lang/String;
      // 3a: invokevirtual cya.oua (Ljava/lang/String;)V
      // 3d: aload 0
      // 3e: getfield wir.f41 Lc05;
      // 41: aload 0
      // 42: getfield wir.yt_ Lcya;
      // 45: invokevirtual c05.z2i (Lgbe;)V
      // 48: iload 2
      // 49: ifne 74
      // 4c: goto 53
      // 4f: invokestatic wir.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 1
      // 54: getfield gt4._me I
      // 57: goto 5e
      // 5a: invokestatic wir.a (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 1
      // 5f: if_icmpne 74
      // 62: aload 0
      // 63: getfield wir.f41 Lc05;
      // 66: aload 0
      // 67: getfield wir.yt_ Lcya;
      // 6a: invokevirtual c05.z2i (Lgbe;)V
      // 6d: goto 74
      // 70: invokestatic wir.a (Loov;)Loov;
      // 73: athrow
      // 74: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.g1q.j46(var1, var2, var3);
      this.poi(this.fex, this._b7, this.dt7 / 2, 8, 16777215);
      this.c_t(this.fex, this.l5r, 50, 30, 10526880);
      this.c_t(this.fex, this.zli, 50, 70, 10526880);
      this.dct.dy2();
      super.drawScreen(var1, var2, var3);
   }

   @Override
   public void updateScreen() {
      this.dct.zf9();
      super.updateScreen();
   }

   public void e5x() {
      boolean var1 = this.opg();
      this.gkb.c9a = var1;
   }

   private boolean opg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield wir.g1q Lwir$_cj;
      // 08: getfield wir$_cj.v9j I
      // 0b: bipush -1
      // 0c: iload 1
      // 0d: ifeq 5b
      // 10: if_icmple 3e
      // 13: goto 1a
      // 16: invokestatic wir.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield wir.g1q Lwir$_cj;
      // 1e: getfield wir$_cj.v9j I
      // 21: iload 1
      // 22: ifeq 5f
      // 25: goto 2c
      // 28: invokestatic wir.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic wir.imy Ljava/util/List;
      // 2f: invokeinterface java/util/List.size ()I 1
      // 34: if_icmplt 5e
      // 37: goto 3e
      // 3a: invokestatic wir.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield wir.dct Ljqk;
      // 42: invokevirtual jqk.xct ()Ljava/lang/String;
      // 45: invokevirtual java/lang/String.length ()I
      // 48: iload 1
      // 49: ifeq 5f
      // 4c: goto 53
      // 4f: invokestatic wir.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 1
      // 54: goto 5b
      // 57: invokestatic wir.a (Loov;)Loov;
      // 5a: athrow
      // 5b: if_icmple 62
      // 5e: bipush 1
      // 5f: goto 63
      // 62: bipush 0
      // 63: ireturn
   }

   private static void w0v(String var0, u7m var1, gyu var2, bvf[] var3) {
      pl6(var0, var1, 0, var2, (List)null, var3);
   }

   private static void zhe(String var0, u7m var1, gyu var2, List var3, bvf[] var4) {
      pl6(var0, var1, 0, var2, var3, var4);
   }

   private static void pl6(String var0, u7m var1, int var2, gyu var3, List var4, bvf[] var5) {
      pss var6 = new pss();
      int var7 = var5.length - 1;

      try {
         while (var7 >= 0) {
            var6.t48().add(var5[var7]);
            var7--;
         }
      } catch (oov var9) {
         throw a(var9);
      }

      var6.__m(var3.mu9);
      var6.sy0();
      if (var4 != null) {
         for (String var8 : var4) {
            var6.m6g().put(var8, Maps.newHashMap());
         }
      }

      imy.add(new wir$a8n(var1, var2, var0, var6.toString()));
   }

   public static List khl() {
      return imy;
   }

   public static wir$_cj kaf(wir var0) {
      return var0.g1q;
   }

   public static jqk djs(wir var0) {
      return var0.dct;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6418409108000733117L, -3786158042596245498L, MethodHandles.lookup().lookupClass()).a(179058890241146L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 83549024305784L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[28];
      int var5 = 0;
      String var4 = "àð\u0087Ò?+³®á#tY\u0098Ñ\u001a\u0098ß¬kBÿ¥Ó\u0095)î\u0099)Áñ\u0094Ø\u0018\u009b£÷M\u008b\u0094ÛØ§ð9$Ï´H9ßX]k£\u0086\u007f(\u0010ûlýqÄ\u0094\u001cZ®b\u008cR½Ø·p\u0018ã\u0016ö\u0018¼\u009aä7^·i\u00876Å´\u00adn;\u0097\u0088û\u009dÇ\f\u0010\u0011pÒo1®\u00ad\u008c§ä\u0001$ÆQ~ä@(ó\u0017\u008a2¼\u000ePè&bE\u0085/\u0093]¤@_\u0082ê\u001f\u0012w\u001b]&ùõ\u0095\u0089\u0088ðQeÅ¿=Á\u009dÏ\u0005©.£~\u008dÝ'\u0090c\u0018q\b\u0095W¯«ãu\u0092eV5\u0010¸@à\u001eè\n+\u0011XV*ur\u0011\u007f2\u0018LûS\u0088!®\u0006\u0095\u00ad=¥QÄ8«o\u0098À\u000eQ\r´^ä 4\t\u000fQþa·È\u00adéÉL±.\u0005ÞÝ¤\u0007*·Á\u0010ÿná8^\nÕ\u0083ÿ ÅYGx^?y\u0085ô\u009dG8Z]ocÜ\u0092\u000eä\u0012Ý¹èd\u0015Æ±õ\u001ax«@aJ\u0007ð\u0086U2LU\u0014ï(qÌRqé´:\"Ó~TEar[×ýn\u0090]ùÝ/µ ?\u00adê{(Ñ±çÙyÏÅÎíÒ\u000e¨^u\u0015º«®Ó\u001eìÈ É\u0080\u009eN\u0016¹ù\u009f\u008bñ\u0007X-§ØeRÔå\u0081º0\u008f3\u0086D\u008e´\u000f\u0018\u0016r@\u001f©^æþãzÌ·\u0010[»AÃ\u008aWË[TBX6£\u0085\u0083ML\u0097\u0099#ü%\u0093\n\u0005¨¡Ep\u0006½ädcb\u009a7\u0003\u007f\u001c\u0012\rJ\u0005S-Å\u009c\u009c\u001d\u0086xöà\u0018·Aë2\u001cI)z{\u009bN³Ê«â\u0000ÞÑõÁ\t£½^ \u008c%TçY\u0083K'L\u0012uÙÆ¯Õmyj±cþU\u00adÊ\"yÕ\u0010\u0094¸\u0099\u0002 \u0090~\u009e\u0019Úm\u0018Hr^8:ÕDð[¦Udµ\nå±e\u001b]ë½\n\u0018Ú\u0019\u0018²ø\u0083X1d]Q\r.ý©0»V×.\u008a\u0018©\u008b\u0019à\u008c\u0010ÕèN\u008a\u0004ï\u009b\u0082ñk÷×îÉd| ¥ý5\u009f\u001du\\\u009fÏ\u0081½Æ\u0011ã2×\u008b&\u0093\u00000Ø¢w.³ý\u0092Æ\u0085\u0087¥ D\u0092â{î\u008aZv©DiÁ \u0013ééðõ\u009c\u0082Öþ\u008dQ:\\\u009fH<FP)(£]\u0016\u0088@!\u007fwd\b\u0013\u0007cø'!\u0011å\u00ad]\u001fÞé\u0093X\"£§\u0087ý.×ýT®6¬r|y\u0010\u008b\"£Ì\u008bágØV]sLÑ\u0086þ\t@(Ù\u000f\"\bÓsñJöÌ\n\u0011ALtL+}ó6ýÈ&o\u0015mí\u0087\f/ôfiyÞ&ÉÎ;\u0006ì+ ù·Ð\táv©)$Gø¯R\u0001 0\u0091Ý¥,\u0018þè=\u009etî¦QjC«8¶ª\u0001\u0016U½Àí%øgE\u0010ô\u0098j\u0081å§P\u008f²\u0093Wï¢\u001f\u008d \u0010%\u000eÉÌî5/À]°\u00842»,R¿";
      int var6 = "àð\u0087Ò?+³®á#tY\u0098Ñ\u001a\u0098ß¬kBÿ¥Ó\u0095)î\u0099)Áñ\u0094Ø\u0018\u009b£÷M\u008b\u0094ÛØ§ð9$Ï´H9ßX]k£\u0086\u007f(\u0010ûlýqÄ\u0094\u001cZ®b\u008cR½Ø·p\u0018ã\u0016ö\u0018¼\u009aä7^·i\u00876Å´\u00adn;\u0097\u0088û\u009dÇ\f\u0010\u0011pÒo1®\u00ad\u008c§ä\u0001$ÆQ~ä@(ó\u0017\u008a2¼\u000ePè&bE\u0085/\u0093]¤@_\u0082ê\u001f\u0012w\u001b]&ùõ\u0095\u0089\u0088ðQeÅ¿=Á\u009dÏ\u0005©.£~\u008dÝ'\u0090c\u0018q\b\u0095W¯«ãu\u0092eV5\u0010¸@à\u001eè\n+\u0011XV*ur\u0011\u007f2\u0018LûS\u0088!®\u0006\u0095\u00ad=¥QÄ8«o\u0098À\u000eQ\r´^ä 4\t\u000fQþa·È\u00adéÉL±.\u0005ÞÝ¤\u0007*·Á\u0010ÿná8^\nÕ\u0083ÿ ÅYGx^?y\u0085ô\u009dG8Z]ocÜ\u0092\u000eä\u0012Ý¹èd\u0015Æ±õ\u001ax«@aJ\u0007ð\u0086U2LU\u0014ï(qÌRqé´:\"Ó~TEar[×ýn\u0090]ùÝ/µ ?\u00adê{(Ñ±çÙyÏÅÎíÒ\u000e¨^u\u0015º«®Ó\u001eìÈ É\u0080\u009eN\u0016¹ù\u009f\u008bñ\u0007X-§ØeRÔå\u0081º0\u008f3\u0086D\u008e´\u000f\u0018\u0016r@\u001f©^æþãzÌ·\u0010[»AÃ\u008aWË[TBX6£\u0085\u0083ML\u0097\u0099#ü%\u0093\n\u0005¨¡Ep\u0006½ädcb\u009a7\u0003\u007f\u001c\u0012\rJ\u0005S-Å\u009c\u009c\u001d\u0086xöà\u0018·Aë2\u001cI)z{\u009bN³Ê«â\u0000ÞÑõÁ\t£½^ \u008c%TçY\u0083K'L\u0012uÙÆ¯Õmyj±cþU\u00adÊ\"yÕ\u0010\u0094¸\u0099\u0002 \u0090~\u009e\u0019Úm\u0018Hr^8:ÕDð[¦Udµ\nå±e\u001b]ë½\n\u0018Ú\u0019\u0018²ø\u0083X1d]Q\r.ý©0»V×.\u008a\u0018©\u008b\u0019à\u008c\u0010ÕèN\u008a\u0004ï\u009b\u0082ñk÷×îÉd| ¥ý5\u009f\u001du\\\u009fÏ\u0081½Æ\u0011ã2×\u008b&\u0093\u00000Ø¢w.³ý\u0092Æ\u0085\u0087¥ D\u0092â{î\u008aZv©DiÁ \u0013ééðõ\u009c\u0082Öþ\u008dQ:\\\u009fH<FP)(£]\u0016\u0088@!\u007fwd\b\u0013\u0007cø'!\u0011å\u00ad]\u001fÞé\u0093X\"£§\u0087ý.×ýT®6¬r|y\u0010\u008b\"£Ì\u008bágØV]sLÑ\u0086þ\t@(Ù\u000f\"\bÓsñJöÌ\n\u0011ALtL+}ó6ýÈ&o\u0015mí\u0087\f/ôfiyÞ&ÉÎ;\u0006ì+ ù·Ð\táv©)$Gø¯R\u0001 0\u0091Ý¥,\u0018þè=\u009etî¦QjC«8¶ª\u0001\u0016U½Àí%øgE\u0010ô\u0098j\u0081å§P\u008f²\u0093Wï¢\u001f\u008d \u0010%\u000eÉÌî5/À]°\u00842»,R¿"
         .length();
      char var3 = ' ';
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
                     g = new String[28];
                     imy = Lists.newArrayList();
                     zhe(
                        b<"r">(15528, 7280655306558239641L ^ var9),
                        u7m.gfm(ox_.l11),
                        gyu.wqh,
                        Arrays.asList(b<"r">(22199, 7205715336658459036L ^ var9)),
                        new bvf[]{new bvf(1, ox_.l11), new bvf(2, ox_.kqk), new bvf(1, ox_.n6z)}
                     );
                     zhe(
                        b<"r">(27885, 2194862551110722505L ^ var9),
                        u7m.gfm(ox_.pu8),
                        gyu.uuo,
                        Arrays.asList(
                           b<"r">(32614, 2433112025259847760L ^ var9),
                           b<"r">(256, 805661492931677736L ^ var9),
                           b<"r">(11670, 5445187037109510825L ^ var9),
                           b<"r">(18854, 3110705363538282133L ^ var9),
                           b<"r">(26582, 1685749267906832609L ^ var9)
                        ),
                        new bvf[]{new bvf(1, ox_.l11), new bvf(5, ox_.kqk), new bvf(230, ox_.pu8), new bvf(1, ox_.n6z)}
                     );
                     zhe(
                        b<"r">(13781, 4104017457190959845L ^ var9),
                        xbr.lqp,
                        gyu.knf,
                        Arrays.asList(b<"r">(22260, 6969058206759852480L ^ var9), b<"r">(6872, 939217380786394597L ^ var9)),
                        new bvf[]{new bvf(90, ox_.gdz), new bvf(5, ox_.vd0), new bvf(5, ox_.kqk), new bvf(5, ox_.pu8), new bvf(1, ox_.n6z)}
                     );
                     pl6(
                        b<"r">(10760, 353670328839431464L ^ var9),
                        u7m.gfm(ox_._w6),
                        rh2$j7i.jd3.sqd(),
                        gyu.wqh,
                        Arrays.asList(
                           b<"r">(3606, 2786873238064841023L ^ var9),
                           b<"r">(22260, 6969058206759852480L ^ var9),
                           b<"r">(19341, 5693895106089419955L ^ var9),
                           b<"r">(32461, 9116292860825252340L ^ var9),
                           b<"r">(18513, 1606915858247845750L ^ var9),
                           b<"r">(22685, 4113279471486113724L ^ var9),
                           b<"r">(30911, 6126936232089696141L ^ var9),
                           b<"r">(25345, 4834402745685781561L ^ var9)
                        ),
                        new bvf[]{new bvf(1, ox_.l11), new bvf(3, ox_.kqk), new bvf(59, ox_.pu8), new bvf(1, ox_.n6z)}
                     );
                     zhe(
                        b<"r">(31476, 4256543496936633815L ^ var9),
                        u7m.gfm(ox_.dxo),
                        gyu.rv2,
                        Arrays.asList(b<"r">(3606, 2786873238064841023L ^ var9), b<"r">(22260, 6969058206759852480L ^ var9)),
                        new bvf[]{new bvf(1, ox_.dxo), new bvf(1, ox_.l11), new bvf(3, ox_.kqk), new bvf(59, ox_.pu8), new bvf(1, ox_.n6z)}
                     );
                     zhe(
                        b<"r">(6892, 5360676506142070222L ^ var9),
                        xbr.gki,
                        gyu.wqh,
                        Arrays.asList(b<"r">(3606, 2786873238064841023L ^ var9), b<"r">(22260, 6969058206759852480L ^ var9)),
                        new bvf[]{new bvf(1, ox_.l11), new bvf(3, ox_.kqk), new bvf(2, ox_.a3_)}
                     );
                     zhe(
                        b<"r">(493, 372946569542946504L ^ var9),
                        u7m.gfm(ox_.vd0),
                        gyu._cz,
                        Arrays.asList(
                           b<"r">(3606, 2786873238064841023L ^ var9),
                           b<"r">(22260, 6969058206759852480L ^ var9),
                           b<"r">(19341, 5693895106089419955L ^ var9),
                           b<"r">(32461, 9116292860825252340L ^ var9),
                           b<"r">(18513, 1606915858247845750L ^ var9),
                           b<"r">(22685, 4113279471486113724L ^ var9)
                        ),
                        new bvf[]{new bvf(8, ox_.vd0), new bvf(52, ox_.umb), new bvf(3, ox_.pu8), new bvf(1, ox_.n6z)}
                     );
                     w0v(
                        b<"r">(28009, 5908145070060216899L ^ var9), xbr.deg, gyu._cz, new bvf[]{new bvf(52, ox_.umb), new bvf(3, ox_.pu8), new bvf(1, ox_.n6z)}
                     );
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

                  var4 = "\u0090\u0083Ùõ\u0083\u0089Èg\u0013N\\âÐ\u008b´Ø\u0091ý¥°Þ_ö=\u0010¤$\u0084\u0096#\u0084\u008ct\u0099\u0089þÙ\u0095¼\u009cr";
                  var6 = "\u0090\u0083Ùõ\u0083\u0089Èg\u0013N\\âÐ\u008b´Ø\u0091ý¥°Þ_ö=\u0010¤$\u0084\u0096#\u0084\u008ct\u0099\u0089þÙ\u0095¼\u009cr".length();
                  var3 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8910;
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
            throw new RuntimeException("wir", var10);
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
         throw new RuntimeException("wir" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
