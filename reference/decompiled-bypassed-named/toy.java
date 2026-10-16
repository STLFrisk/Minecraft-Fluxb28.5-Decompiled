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
import org.lwjgl.input.Keyboard;

public class toy extends ShaderHelper {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public toy(k6s var1) {
      this.uzv = var1;
   }

   @Override
   public void updateScreen() {
      this.l8_.zf9();
   }

   @Override
   public void initGui() {
      long var1 = a ^ 38292279599727L;
      Keyboard.enableRepeatEvents(true);
      this.khf.clear();
      this.khf
         .add(
            this.ij2 = new gt4(0, this.dt7 / 2 - 4 - 150, this.o1e / 4 + 120 + 12, 150, 20, fc1.gx1(b<"b">(23378, 579230265047322942L ^ var1), new Object[0]))
         );
      this.khf
         .add(this.o64 = new gt4(1, this.dt7 / 2 + 4, this.o1e / 4 + 120 + 12, 150, 20, fc1.gx1(b<"b">(12588, 199581723225422668L ^ var1), new Object[0])));
      this.khf.add(this.nwr = new gt4(4, this.dt7 / 2 + 150 - 20, 150, 20, 20, "O"));
      int var10000 = OpaquePredicate.b();
      this.l8_ = new jqk(2, this.fex, this.dt7 / 2 - 150, 50, 300, 20);
      this.l8_.z5t(32767);
      this.l8_._c6(true);
      int var3 = var10000;

      int var10001;
      label22: {
         label21: {
            try {
               this.l8_.nrl(this.uzv.c4d());
               this.g3l = new jqk(3, this.fex, this.dt7 / 2 - 150, 150, 276, 20);
               this.g3l.z5t(32767);
               this.g3l.gpc(false);
               this.g3l.nrl("-");
               this._y1 = this.uzv.kyy();
               this.ymu();
               var5 = this.ij2;
               var10001 = this.l8_.xct().trim().length();
               if (var3 == 0) {
                  break label22;
               }

               if (var10001 > 0) {
                  break label21;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var5.c9a = (boolean)var10001;
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
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
      // 000: getstatic toy.a J
      // 003: ldc2_w 70887985462260
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield gt4.c9a Z
      // 011: iload 4
      // 013: ifne 02b
      // 016: ifeq 148
      // 019: goto 020
      // 01c: invokestatic toy.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 1
      // 021: getfield gt4._me I
      // 024: goto 02b
      // 027: invokestatic toy.a (Loov;)Loov;
      // 02a: athrow
      // 02b: iload 4
      // 02d: ifne 068
      // 030: bipush 1
      // 031: if_icmpne 05d
      // 034: goto 03b
      // 037: invokestatic toy.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield toy.uzv Lk6s;
      // 03f: aload 0
      // 040: getfield toy._y1 Z
      // 043: invokevirtual k6s.mhc (Z)V
      // 046: aload 0
      // 047: getfield toy.f41 Lc05;
      // 04a: aconst_null
      // 04b: checkcast ShaderHelper
      // 04e: invokevirtual Minecraft.z2i (Lgbe;)V
      // 051: iload 4
      // 053: ifeq 148
      // 056: goto 05d
      // 059: invokestatic toy.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 1
      // 05e: getfield gt4._me I
      // 061: goto 068
      // 064: invokestatic toy.a (Loov;)Loov;
      // 067: athrow
      // 068: iload 4
      // 06a: ifne 117
      // 06d: ifne 10c
      // 070: goto 077
      // 073: invokestatic toy.a (Loov;)Loov;
      // 076: athrow
      // 077: new nfj
      // 07a: dup
      // 07b: invokestatic io/netty/buffer/Unpooled.buffer ()Lio/netty/buffer/ByteBuf;
      // 07e: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 081: astore 5
      // 083: aload 5
      // 085: aload 0
      // 086: getfield toy.uzv Lk6s;
      // 089: invokevirtual k6s.end ()I
      // 08c: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 08f: pop
      // 090: aload 0
      // 091: getfield toy.uzv Lk6s;
      // 094: aload 5
      // 096: invokevirtual k6s.p8w (Lio/netty/buffer/ByteBuf;)V
      // 099: aload 5
      // 09b: aload 0
      // 09c: getfield toy.l8_ Ljqk;
      // 09f: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0a2: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 0a5: pop
      // 0a6: aload 5
      // 0a8: aload 0
      // 0a9: getfield toy.uzv Lk6s;
      // 0ac: invokevirtual k6s.kyy ()Z
      // 0af: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 0b2: pop
      // 0b3: aload 0
      // 0b4: getfield toy.f41 Lc05;
      // 0b7: invokevirtual Minecraft.c02 ()Lp_k;
      // 0ba: new net/minecraft/network/play/client/C17PacketCustomPayload
      // 0bd: dup
      // 0be: sipush 15201
      // 0c1: ldc2_w 4679537165608020123
      // 0c4: lload 2
      // 0c5: lxor
      // 0c6: invokedynamic b (IJ)Ljava/lang/String; bsm=toy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: nop
      // 0cc: aload 5
      // 0ce: invokespecial net/minecraft/network/play/client/C17PacketCustomPayload.<init> (Ljava/lang/String;Lnfj;)V
      // 0d1: invokevirtual p_k.sxi (Lmz2;)V
      // 0d4: aload 0
      // 0d5: iload 4
      // 0d7: ifne 0fd
      // 0da: getfield toy.uzv Lk6s;
      // 0dd: invokevirtual k6s.kyy ()Z
      // 0e0: ifne 0fc
      // 0e3: goto 0ea
      // 0e6: invokestatic toy.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: getfield toy.uzv Lk6s;
      // 0ee: aconst_null
      // 0ef: checkcast ekw
      // 0f2: invokevirtual k6s.wyo (Lekw;)V
      // 0f5: goto 0fc
      // 0f8: invokestatic toy.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: getfield toy.f41 Lc05;
      // 100: aconst_null
      // 101: checkcast ShaderHelper
      // 104: invokevirtual Minecraft.z2i (Lgbe;)V
      // 107: iload 4
      // 109: ifeq 148
      // 10c: aload 1
      // 10d: getfield gt4._me I
      // 110: goto 117
      // 113: invokestatic toy.a (Loov;)Loov;
      // 116: athrow
      // 117: bipush 4
      // 118: if_icmpne 148
      // 11b: aload 0
      // 11c: getfield toy.uzv Lk6s;
      // 11f: aload 0
      // 120: getfield toy.uzv Lk6s;
      // 123: invokevirtual k6s.kyy ()Z
      // 126: iload 4
      // 128: ifne 13d
      // 12b: goto 132
      // 12e: invokestatic toy.a (Loov;)Loov;
      // 131: athrow
      // 132: ifne 140
      // 135: goto 13c
      // 138: invokestatic toy.a (Loov;)Loov;
      // 13b: athrow
      // 13c: bipush 1
      // 13d: goto 141
      // 140: bipush 0
      // 141: invokevirtual k6s.mhc (Z)V
      // 144: aload 0
      // 145: invokespecial toy.ymu ()V
      // 148: return
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
      // 00: aload 0
      // 01: getfield toy.l8_ Ljqk;
      // 04: iload 1
      // 05: iload 2
      // 06: invokevirtual jqk.pst (CI)Z
      // 09: pop
      // 0a: invokestatic OpaquePredicate.c ()I
      // 0d: aload 0
      // 0e: getfield toy.g3l Ljqk;
      // 11: iload 1
      // 12: iload 2
      // 13: invokevirtual jqk.pst (CI)Z
      // 16: pop
      // 17: istore 3
      // 18: aload 0
      // 19: getfield toy.ij2 Lgt4;
      // 1c: aload 0
      // 1d: getfield toy.l8_ Ljqk;
      // 20: invokevirtual jqk.xct ()Ljava/lang/String;
      // 23: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 26: invokevirtual java/lang/String.length ()I
      // 29: iload 3
      // 2a: ifne 38
      // 2d: ifle 3b
      // 30: goto 37
      // 33: invokestatic toy.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: putfield gt4.c9a Z
      // 3f: iload 2
      // 40: bipush 28
      // 42: iload 3
      // 43: ifne 5b
      // 46: if_icmpeq 88
      // 49: goto 50
      // 4c: invokestatic toy.a (Loov;)Loov;
      // 4f: athrow
      // 50: iload 2
      // 51: sipush 156
      // 54: goto 5b
      // 57: invokestatic toy.a (Loov;)Loov;
      // 5a: athrow
      // 5b: iload 3
      // 5c: ifne 72
      // 5f: if_icmpeq 88
      // 62: goto 69
      // 65: invokestatic toy.a (Loov;)Loov;
      // 68: athrow
      // 69: iload 2
      // 6a: bipush 1
      // 6b: goto 72
      // 6e: invokestatic toy.a (Loov;)Loov;
      // 71: athrow
      // 72: if_icmpne 97
      // 75: aload 0
      // 76: aload 0
      // 77: getfield toy.o64 Lgt4;
      // 7a: invokevirtual toy.actionPerformed (Lgt4;)V
      // 7d: iload 3
      // 7e: ifeq 97
      // 81: goto 88
      // 84: invokestatic toy.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: aload 0
      // 8a: getfield toy.ij2 Lgt4;
      // 8d: invokevirtual toy.actionPerformed (Lgt4;)V
      // 90: goto 97
      // 93: invokestatic toy.a (Loov;)Loov;
      // 96: athrow
      // 97: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.l8_.elk(var1, var2, var3);
      this.g3l.elk(var1, var2, var3);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 64363371559248L;
      this.xmz();
      int var10000 = OpaquePredicate.b();
      this.poi(this.fex, fc1.gx1(b<"b">(29977, 1586570407058629701L ^ var4), new Object[0]), this.dt7 / 2, 20, 16777215);
      this.c_t(this.fex, fc1.gx1(b<"b">(32601, 3069831134785334784L ^ var4), new Object[0]), this.dt7 / 2 - 150, 37, 10526880);
      this.l8_.dy2();
      int var6 = var10000;
      int var7 = 75;
      int var8 = 0;

      label21: {
         label20: {
            try {
               this.c_t(this.fex, fc1.gx1(b<"b">(8154, 9170800556034657922L ^ var4), new Object[0]), this.dt7 / 2 - 150, var7 + var8++ * this.fex.rr7, 10526880);
               this.c_t(
                  this.fex, fc1.gx1(b<"b">(28134, 3863872998762511547L ^ var4), new Object[0]), this.dt7 / 2 - 150, var7 + var8++ * this.fex.rr7, 10526880
               );
               this.c_t(this.fex, fc1.gx1(b<"b">(2693, 8036693024182213591L ^ var4), new Object[0]), this.dt7 / 2 - 150, var7 + var8++ * this.fex.rr7, 10526880);
               this.c_t(
                  this.fex, fc1.gx1(b<"b">(20958, 3287944190637981829L ^ var4), new Object[0]), this.dt7 / 2 - 150, var7 + var8++ * this.fex.rr7, 10526880
               );
               this.c_t(this.fex, "", this.dt7 / 2 - 150, var7 + var8++ * this.fex.rr7, 10526880);
               var16 = this;
               if (var6 == 0) {
                  break label21;
               }

               if (this.g3l.xct().length() <= 0) {
                  break label20;
               }
            } catch (oov var9) {
               throw a(var9);
            }

            var7 = var7 + var8 * this.fex.rr7 + 16;
            this.c_t(this.fex, fc1.gx1(b<"b">(22461, 6464531840465913575L ^ var4), new Object[0]), this.dt7 / 2 - 150, var7, 10526880);
            this.g3l.dy2();
         }

         var16 = this;
      }

      var16.drawScreen(var1, var2, var3);
   }

   private void ymu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 6f
      // 09: getfield toy.uzv Lk6s;
      // 0c: invokevirtual k6s.kyy ()Z
      // 0f: ifeq 5d
      // 12: goto 19
      // 15: invokestatic toy.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield toy.nwr Lgt4;
      // 1d: ldc "O"
      // 1f: nop
      // 20: putfield gt4.frg Ljava/lang/String;
      // 23: aload 0
      // 24: iload 1
      // 25: ifeq 47
      // 28: goto 2f
      // 2b: invokestatic toy.a (Loov;)Loov;
      // 2e: athrow
      // 2f: getfield toy.uzv Lk6s;
      // 32: invokevirtual k6s.gay ()Lekw;
      // 35: ifnull 78
      // 38: goto 3f
      // 3b: invokestatic toy.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: goto 47
      // 43: invokestatic toy.a (Loov;)Loov;
      // 46: athrow
      // 47: getfield toy.g3l Ljqk;
      // 4a: aload 0
      // 4b: getfield toy.uzv Lk6s;
      // 4e: invokevirtual k6s.gay ()Lekw;
      // 51: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 56: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 59: iload 1
      // 5a: ifne 78
      // 5d: aload 0
      // 5e: getfield toy.nwr Lgt4;
      // 61: ldc "X"
      // 63: nop
      // 64: putfield gt4.frg Ljava/lang/String;
      // 67: aload 0
      // 68: goto 6f
      // 6b: invokestatic toy.a (Loov;)Loov;
      // 6e: athrow
      // 6f: getfield toy.g3l Ljqk;
      // 72: ldc "-"
      // 74: nop
      // 75: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 78: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2631153720227499638L, 2513543203262597964L, MethodHandles.lookup().lookupClass()).a(34591178348018L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 24390240682475L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "ÙîeÁ\u009c\u0016.æhçd`B¬\u00ad¾\t\u0004jQûõ·ôÖ\u0011Ö9\bò\u0091ºë]÷\u008e\u0013\u009eKð(\u0011ê\u001f]ÄZô_hID½;-ï4 Æ\u0087Dïü\u0096w\u001e\u00853\u0085é.\u0017(\u000b÷g\u0088¶îÌD §ÚróÄÅ\r\u0093;7pa:\u001c~·Ð\u000e|¹u\u0019\u0017í#\u008bÌ|]øFä(?Ã\u0099¾y´?Ëà\u0092\"\u0000\u0080¸!ÿLÒômW\u0014k,\u0006Ü\u001fU\u0011Ö0¯Rø/ï\u0091AÐZ 6|\u009døË\u0087¹\u008a\u0085:\"(ùôh\u008e\f¥£¢¤\u0001ÏpdÞr\u0001#]c\u008f \u00adCO<U\u009a\u008aLD2\u008c\u0081\u008e\u008b\u0005³ä:âà.È®\r|ÜK\u008fLølÎ(î\u001fû$\u0016ù\u0081\u0087R\u0001ô\b³VÀÊHó\r¡¿3jkÀµ·%\u0006\"E[}\f ú³\u0081\u0096j(³¥õTÁ\u0090§,T±\u0080çH>\u008e\u001cþfØ\u0016Ç\u0003\u008bê\u008a\u001a©\u001e¬Ó~j)qK{,e\u0015\u0082";
      int var8 = "ÙîeÁ\u009c\u0016.æhçd`B¬\u00ad¾\t\u0004jQûõ·ôÖ\u0011Ö9\bò\u0091ºë]÷\u008e\u0013\u009eKð(\u0011ê\u001f]ÄZô_hID½;-ï4 Æ\u0087Dïü\u0096w\u001e\u00853\u0085é.\u0017(\u000b÷g\u0088¶îÌD §ÚróÄÅ\r\u0093;7pa:\u001c~·Ð\u000e|¹u\u0019\u0017í#\u008bÌ|]øFä(?Ã\u0099¾y´?Ëà\u0092\"\u0000\u0080¸!ÿLÒômW\u0014k,\u0006Ü\u001fU\u0011Ö0¯Rø/ï\u0091AÐZ 6|\u009døË\u0087¹\u008a\u0085:\"(ùôh\u008e\f¥£¢¤\u0001ÏpdÞr\u0001#]c\u008f \u00adCO<U\u009a\u008aLD2\u008c\u0081\u008e\u008b\u0005³ä:âà.È®\r|ÜK\u008fLølÎ(î\u001fû$\u0016ù\u0081\u0087R\u0001ô\b³VÀÊHó\r¡¿3jkÀµ·%\u0006\"E[}\f ú³\u0081\u0096j(³¥õTÁ\u0090§,T±\u0080çH>\u008e\u001cþfØ\u0016Ç\u0003\u008bê\u008a\u001a©\u001e¬Ó~j)qK{,e\u0015\u0082"
         .length();
      char var5 = '(';
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
                     g = new String[10];
                     tj_ = LogManager.getLogger();
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

                  var6 = "Aø½X\u009a°Ô\u008cà\u0002\u009a9'\u0095¼Üé¼HT,*\u008fÍ(·öÒ\u0015\r\u0083øVÿ\u007f\u0099V\u009e÷XÂª[RÎ>\u009aJ\u0003hþ\rV./z\u0091\u0015å·\u001a\u0099A\u0012\u007f";
                  var8 = "Aø½X\u009a°Ô\u008cà\u0002\u009a9'\u0095¼Üé¼HT,*\u008fÍ(·öÒ\u0015\r\u0083øVÿ\u007f\u0099V\u009e÷XÂª[RÎ>\u009aJ\u0003hþ\rV./z\u0091\u0015å·\u001a\u0099A\u0012\u007f"
                     .length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12649;
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
            throw new RuntimeException("toy", var10);
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
         throw new RuntimeException("toy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
