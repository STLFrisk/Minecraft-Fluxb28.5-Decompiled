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

public class yod extends ShaderHelper {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public yod(ShaderHelper var1) {
      this.l4o = var1;
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial ShaderHelper.dig (CI)V
      // 0a: aload 0
      // 0b: getfield yod.hpd Ljqk;
      // 0e: iload 1
      // 0f: iload 2
      // 10: invokevirtual jqk.pst (CI)Z
      // 13: pop
      // 14: iload 3
      // 15: ifeq 56
      // 18: iload 2
      // 19: bipush 1
      // 1a: if_icmpne 36
      // 1d: goto 24
      // 20: invokestatic yod.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: getfield yod.f41 Lc05;
      // 28: aload 0
      // 29: getfield yod.l4o Lgbe;
      // 2c: invokevirtual Minecraft.z2i (Lgbe;)V
      // 2f: goto 36
      // 32: invokestatic yod.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: getfield yod.hpd Ljqk;
      // 3a: aload 0
      // 3b: getfield yod.hpd Ljqk;
      // 3e: invokevirtual jqk.xct ()Ljava/lang/String;
      // 41: ldc " "
      // 43: nop
      // 44: ldc ""
      // 46: nop
      // 47: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 4a: ldc "#"
      // 4c: nop
      // 4d: ldc ""
      // 4f: nop
      // 50: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 53: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 56: return
   }

   @Override
   public void initGui() {
      long var1 = a ^ 68724104139390L;
      int var10005 = this.dt7 / 2 - 100;
      this.hpd = new jqk(0, Minecraft.vz1().tx1, var10005, this.o1e / 6 + 20, 200, 20);
      this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 6 + 55, b<"t">(32699, 3911357683010062079L ^ var1)));
      this.khf.add(new gt4(1, this.dt7 / 2 - 100, this.o1e / 6 + 55 + 22, b<"t">(11337, 878505631296460043L ^ var1)));
      this.khf.add(new gt4(2, this.dt7 / 2 - 100, this.o1e / 6 + 55 + 44, b<"t">(31928, 4129459096948033012L ^ var1)));
      this.khf.add(new gt4(3, this.dt7 / 2 - 100, this.o1e / 6 + 40 + 110, b<"t">(32004, 5768203629142066242L ^ var1)));
      this.khf.add(new gt4(4, this.dt7 / 2 - 100, this.o1e / 6 + 40 + 132, b<"t">(447, 8970461000873195766L ^ var1)));
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
      // 000: getstatic yod.a J
      // 003: ldc2_w 101337259346917
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield gt4._me I
      // 011: iload 4
      // 013: ifeq 047
      // 016: ifne 043
      // 019: goto 020
      // 01c: invokestatic yod.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aload 0
      // 022: getfield yod._hl Z
      // 025: iload 4
      // 027: ifeq 03c
      // 02a: goto 031
      // 02d: invokestatic yod.a (Loov;)Loov;
      // 030: athrow
      // 031: ifne 03f
      // 034: goto 03b
      // 037: invokestatic yod.a (Loov;)Loov;
      // 03a: athrow
      // 03b: bipush 1
      // 03c: goto 040
      // 03f: bipush 0
      // 040: putfield yod._hl Z
      // 043: aload 1
      // 044: getfield gt4._me I
      // 047: bipush 1
      // 048: iload 4
      // 04a: ifeq 07f
      // 04d: if_icmpne 07a
      // 050: goto 057
      // 053: invokestatic yod.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: aload 0
      // 059: getfield yod.v90 Z
      // 05c: iload 4
      // 05e: ifeq 073
      // 061: goto 068
      // 064: invokestatic yod.a (Loov;)Loov;
      // 067: athrow
      // 068: ifne 076
      // 06b: goto 072
      // 06e: invokestatic yod.a (Loov;)Loov;
      // 071: athrow
      // 072: bipush 1
      // 073: goto 077
      // 076: bipush 0
      // 077: putfield yod.v90 Z
      // 07a: aload 1
      // 07b: getfield gt4._me I
      // 07e: bipush 2
      // 07f: iload 4
      // 081: ifeq 0b6
      // 084: if_icmpne 0b1
      // 087: goto 08e
      // 08a: invokestatic yod.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: aload 0
      // 090: getfield yod.wau Z
      // 093: iload 4
      // 095: ifeq 0aa
      // 098: goto 09f
      // 09b: invokestatic yod.a (Loov;)Loov;
      // 09e: athrow
      // 09f: ifne 0ad
      // 0a2: goto 0a9
      // 0a5: invokestatic yod.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: bipush 1
      // 0aa: goto 0ae
      // 0ad: bipush 0
      // 0ae: putfield yod.wau Z
      // 0b1: aload 1
      // 0b2: getfield gt4._me I
      // 0b5: bipush 3
      // 0b6: iload 4
      // 0b8: ifeq 107
      // 0bb: if_icmpne 0f6
      // 0be: goto 0c5
      // 0c1: invokestatic yod.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield yod.hpd Ljqk;
      // 0c9: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0cc: aload 0
      // 0cd: getfield yod._hl Z
      // 0d0: aload 0
      // 0d1: getfield yod.wau Z
      // 0d4: aload 0
      // 0d5: getfield yod.v90 Z
      // 0d8: invokestatic b4o.xcu (Ljava/lang/String;ZZZ)V
      // 0db: getstatic ClientState.qkk Lzwr;
      // 0de: invokevirtual ClientState.getConfigManager ()Lszk;
      // 0e1: invokevirtual ConfigManager.loadPreset ()V
      // 0e4: aload 0
      // 0e5: getfield yod.f41 Lc05;
      // 0e8: aload 0
      // 0e9: getfield yod.l4o Lgbe;
      // 0ec: invokevirtual Minecraft.z2i (Lgbe;)V
      // 0ef: goto 0f6
      // 0f2: invokestatic yod.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 1
      // 0f7: iload 4
      // 0f9: ifeq 129
      // 0fc: getfield gt4._me I
      // 0ff: bipush 4
      // 100: goto 107
      // 103: invokestatic yod.a (Loov;)Loov;
      // 106: athrow
      // 107: if_icmpne 11c
      // 10a: aload 0
      // 10b: getfield yod.f41 Lc05;
      // 10e: aload 0
      // 10f: getfield yod.l4o Lgbe;
      // 112: invokevirtual Minecraft.z2i (Lgbe;)V
      // 115: goto 11c
      // 118: invokestatic yod.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 0
      // 11d: getfield yod.khf Ljava/util/List;
      // 120: bipush 0
      // 121: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 126: checkcast gt4
      // 129: new java/lang/StringBuilder
      // 12c: dup
      // 12d: invokespecial java/lang/StringBuilder.<init> ()V
      // 130: sipush 2973
      // 133: ldc2_w 5129532348285627203
      // 136: lload 2
      // 137: lxor
      // 138: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: nop
      // 13e: iload 4
      // 140: ifeq 176
      // 143: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 146: aload 0
      // 147: getfield yod._hl Z
      // 14a: ifeq 169
      // 14d: goto 154
      // 150: invokestatic yod.a (Loov;)Loov;
      // 153: athrow
      // 154: sipush 29232
      // 157: ldc2_w 4346129078367310564
      // 15a: lload 2
      // 15b: lxor
      // 15c: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: nop
      // 162: goto 177
      // 165: invokestatic yod.a (Loov;)Loov;
      // 168: athrow
      // 169: sipush 12137
      // 16c: ldc2_w 5514997447218106298
      // 16f: lload 2
      // 170: lxor
      // 171: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: nop
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17d: putfield gt4.frg Ljava/lang/String;
      // 180: aload 0
      // 181: getfield yod.khf Ljava/util/List;
      // 184: bipush 1
      // 185: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 18a: checkcast gt4
      // 18d: new java/lang/StringBuilder
      // 190: dup
      // 191: invokespecial java/lang/StringBuilder.<init> ()V
      // 194: sipush 17026
      // 197: ldc2_w 2472036160687858270
      // 19a: lload 2
      // 19b: lxor
      // 19c: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: nop
      // 1a2: iload 4
      // 1a4: ifeq 1da
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: aload 0
      // 1ab: getfield yod.v90 Z
      // 1ae: ifeq 1cd
      // 1b1: goto 1b8
      // 1b4: invokestatic yod.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: sipush 26740
      // 1bb: ldc2_w 7046729108532775076
      // 1be: lload 2
      // 1bf: lxor
      // 1c0: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: nop
      // 1c6: goto 1db
      // 1c9: invokestatic yod.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: sipush 24130
      // 1d0: ldc2_w 4924241558856236698
      // 1d3: lload 2
      // 1d4: lxor
      // 1d5: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: nop
      // 1db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e1: putfield gt4.frg Ljava/lang/String;
      // 1e4: aload 0
      // 1e5: getfield yod.khf Ljava/util/List;
      // 1e8: bipush 2
      // 1e9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1ee: checkcast gt4
      // 1f1: new java/lang/StringBuilder
      // 1f4: dup
      // 1f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f8: sipush 14467
      // 1fb: ldc2_w 7044876950806829142
      // 1fe: lload 2
      // 1ff: lxor
      // 200: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: nop
      // 206: iload 4
      // 208: ifeq 23e
      // 20b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20e: aload 0
      // 20f: getfield yod.wau Z
      // 212: ifeq 231
      // 215: goto 21c
      // 218: invokestatic yod.a (Loov;)Loov;
      // 21b: athrow
      // 21c: sipush 26740
      // 21f: ldc2_w 7046729108532775076
      // 222: lload 2
      // 223: lxor
      // 224: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: nop
      // 22a: goto 23f
      // 22d: invokestatic yod.a (Loov;)Loov;
      // 230: athrow
      // 231: sipush 24130
      // 234: ldc2_w 4924241558856236698
      // 237: lload 2
      // 238: lxor
      // 239: invokedynamic t (IJ)Ljava/lang/String; bsm=yod.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: nop
      // 23f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 242: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 245: putfield gt4.frg Ljava/lang/String;
      // 248: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      this.hpd.elk(var1, var2, var3);
      super.mouseClicked(var1, var2, var3);
   }

   @Override
   public void updateScreen() {
      this.hpd.zf9();
      super.updateScreen();
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 42723340732737L;
      this.xmz();
      this.poi(this.fex, b<"t">(29137, 2903576465873245091L ^ var4), this.dt7 / 2 - 89, this.o1e / 6 + 10, 16777215);
      this.hpd.dy2();
      this.poi(this.fex, b<"t">(4016, 7719889382734851525L ^ var4), this.dt7 / 2, 30, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4825550768335387999L, 4522134113222187907L, MethodHandles.lookup().lookupClass()).a(242227389007954L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 80657800220967L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "\u0087Yv\f\u0098\u008dn?|\u007fp\u0019²\u0007\u009f:\u0018çÀ\u000b\u0080Ê\u0003\u0014ÉÚª\u0012Ìk-tçÍ\u0086N\u0093\u0016PÁ\u0016\u00103ÐöÿÅ§\u0011\u009c|m\u0086Íì=}\u0081 \n3HT³Üh\u0010Ìsã\u008e±úh\u0087M\u0089·z\u0095d\u0019\u009ab\u0005%\u0007÷!\u00908\u0010\u0094\u00ad\u001eØÍÛ-g§Ò\u0007C\u0080\n\fx ÿÎ¨Ý\u000b\u0092Àþé _?\u0010PðÂ>Å¾Í(%\u009a/ûd:n\\\u008e\\§\u0010<ýxî©çò\u0011¯Û\u008eNðFë]\u0010SåçÁ\u0010l¸`hq|\u009e_\u0094hñ\u0018\u001b¡sëÃ¤Ç\u0095\u000eÃTï½F\u0094´P\b%\u009bÒ\u00178Ý\u0010Y+ZÂì\n¼ñ¦´2!\u0097@¦q8\u0014\u0005\f¹å¶\u008afä³\rgE8\u009aOÐ2[w=?\u0092Ðà\u0092\u0005i\u00157Q\u0080\u001b<ÏÆÓ0Ð\u0099áØ&\u0091ÇÄu\u009bW!(`}\u0017gÿ8[é\u0017\u008f>Õä\u0085\u0017ÎJ¼\u0014pê\u0018{Ô©2°ÿ\u0094\u0014;p\b\u0090«r-¯Ðyy¿¢@\u0003\u008avnðô\u0001:Üð¡plFF\u0019\u0086y";
      int var8 = "\u0087Yv\f\u0098\u008dn?|\u007fp\u0019²\u0007\u009f:\u0018çÀ\u000b\u0080Ê\u0003\u0014ÉÚª\u0012Ìk-tçÍ\u0086N\u0093\u0016PÁ\u0016\u00103ÐöÿÅ§\u0011\u009c|m\u0086Íì=}\u0081 \n3HT³Üh\u0010Ìsã\u008e±úh\u0087M\u0089·z\u0095d\u0019\u009ab\u0005%\u0007÷!\u00908\u0010\u0094\u00ad\u001eØÍÛ-g§Ò\u0007C\u0080\n\fx ÿÎ¨Ý\u000b\u0092Àþé _?\u0010PðÂ>Å¾Í(%\u009a/ûd:n\\\u008e\\§\u0010<ýxî©çò\u0011¯Û\u008eNðFë]\u0010SåçÁ\u0010l¸`hq|\u009e_\u0094hñ\u0018\u001b¡sëÃ¤Ç\u0095\u000eÃTï½F\u0094´P\b%\u009bÒ\u00178Ý\u0010Y+ZÂì\n¼ñ¦´2!\u0097@¦q8\u0014\u0005\f¹å¶\u008afä³\rgE8\u009aOÐ2[w=?\u0092Ðà\u0092\u0005i\u00157Q\u0080\u001b<ÏÆÓ0Ð\u0099áØ&\u0091ÇÄu\u009bW!(`}\u0017gÿ8[é\u0017\u008f>Õä\u0085\u0017ÎJ¼\u0014pê\u0018{Ô©2°ÿ\u0094\u0014;p\b\u0090«r-¯Ðyy¿¢@\u0003\u008avnðô\u0001:Üð¡plFF\u0019\u0086y"
         .length();
      char var5 = 16;
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
                     g = new String[14];
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

                  var6 = "\u008e\u000f\u0081\u0084§\u000b\u0018Å \u008aE6\u0099C\u0080Æ(ý\u0091¿>\u001a-\u001eß î{¹¶Ë\u0092°¼R\u009eqO'§\u0087¥dc\u0007Bf\f}[È%a\u0087=X\u001c";
                  var8 = "\u008e\u000f\u0081\u0084§\u000b\u0018Å \u008aE6\u0099C\u0080Æ(ý\u0091¿>\u001a-\u001eß î{¹¶Ë\u0092°¼R\u009eqO'§\u0087¥dc\u0007Bf\f}[È%a\u0087=X\u001c"
                     .length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16962;
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
            throw new RuntimeException("yod", var10);
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
         throw new RuntimeException("yod" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
