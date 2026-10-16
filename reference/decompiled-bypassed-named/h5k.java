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

public class h5k extends Module {
   public static ModeSetting vrs;
   public static BooleanSetting swx;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public h5k() {
      long var1 = a ^ 34834423886355L;
      super(b<"q">(28450, 2511007867959318359L ^ var1), _aj.i9j, vrs);
      this.vo_ = false;
   }

   @EventHandler
   public void waf(TickEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic h5k.a J
      // 003: ldc2_w 44798107927518
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: getstatic h5k.vrs Lc_3;
      // 010: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 013: sipush 5860
      // 016: ldc2_w 8242539572307205970
      // 019: lload 2
      // 01a: lxor
      // 01b: invokedynamic q (IJ)Ljava/lang/String; bsm=h5k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 024: iload 4
      // 026: ifeq 160
      // 029: ifeq 142
      // 02c: goto 033
      // 02f: invokestatic h5k.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: pop
      // 035: getstatic h5k.ek1 Lc05;
      // 038: getfield Minecraft.vg8 Ll86;
      // 03b: invokevirtual EntityPlayerSP.bbq ()I
      // 03e: iload 4
      // 040: ifeq 06b
      // 043: goto 04a
      // 046: invokestatic h5k.a (Loov;)Loov;
      // 049: athrow
      // 04a: bipush 17
      // 04c: if_icmpne 062
      // 04f: goto 056
      // 052: invokestatic h5k.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: bipush 1
      // 058: putfield h5k.vo_ Z
      // 05b: goto 062
      // 05e: invokestatic h5k.a (Loov;)Loov;
      // 061: athrow
      // 062: getstatic h5k.swx Lcn7;
      // 065: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 068: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06b: iload 4
      // 06d: ifeq 0a6
      // 070: ifne 09b
      // 073: goto 07a
      // 076: invokestatic h5k.a (Loov;)Loov;
      // 079: athrow
      // 07a: aload 0
      // 07b: pop
      // 07c: getstatic h5k.ek1 Lc05;
      // 07f: getfield Minecraft.vg8 Ll86;
      // 082: getfield EntityPlayerSP.lfk Z
      // 085: iload 4
      // 087: ifeq 0a6
      // 08a: goto 091
      // 08d: invokestatic h5k.a (Loov;)Loov;
      // 090: athrow
      // 091: ifeq 351
      // 094: goto 09b
      // 097: invokestatic h5k.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: invokespecial h5k.dme ()Z
      // 09f: goto 0a6
      // 0a2: invokestatic h5k.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: iload 4
      // 0a8: ifeq 0c0
      // 0ab: ifeq 351
      // 0ae: goto 0b5
      // 0b1: invokestatic h5k.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: getfield h5k.vo_ Z
      // 0b9: goto 0c0
      // 0bc: invokestatic h5k.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 4
      // 0c2: ifeq 0e7
      // 0c5: ifeq 351
      // 0c8: goto 0cf
      // 0cb: invokestatic h5k.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: pop
      // 0d1: getstatic h5k.ek1 Lc05;
      // 0d4: getfield Minecraft.vg8 Ll86;
      // 0d7: invokevirtual EntityPlayerSP.t_o ()Lerg;
      // 0da: invokevirtual erg.gn1 ()Lu7m;
      // 0dd: instanceof r5m
      // 0e0: goto 0e7
      // 0e3: invokestatic h5k.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 4
      // 0e9: ifeq 103
      // 0ec: ifne 351
      // 0ef: goto 0f6
      // 0f2: invokestatic h5k.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: bipush 0
      // 0f8: putfield h5k.vo_ Z
      // 0fb: bipush 0
      // 0fc: goto 103
      // 0ff: invokestatic h5k.a (Loov;)Loov;
      // 102: athrow
      // 103: istore 5
      // 105: iload 5
      // 107: bipush 20
      // 109: if_icmpge 13d
      // 10c: aload 0
      // 10d: pop
      // 10e: getstatic h5k.ek1 Lc05;
      // 111: invokevirtual Minecraft.c02 ()Lp_k;
      // 114: new net/minecraft/network/play/client/C03PacketPlayer
      // 117: dup
      // 118: aload 0
      // 119: pop
      // 11a: getstatic h5k.ek1 Lc05;
      // 11d: getfield Minecraft.vg8 Ll86;
      // 120: getfield EntityPlayerSP.lfk Z
      // 123: invokespecial net/minecraft/network/play/client/C03PacketPlayer.<init> (Z)V
      // 126: invokevirtual p_k.sxi (Lmz2;)V
      // 129: iinc 5 1
      // 12c: iload 4
      // 12e: ifeq 351
      // 131: iload 4
      // 133: ifne 105
      // 136: goto 13d
      // 139: invokestatic h5k.a (Loov;)Loov;
      // 13c: athrow
      // 13d: iload 4
      // 13f: ifne 351
      // 142: getstatic h5k.vrs Lc_3;
      // 145: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 148: sipush 6689
      // 14b: ldc2_w 6318314856988873621
      // 14e: lload 2
      // 14f: lxor
      // 150: invokedynamic q (IJ)Ljava/lang/String; bsm=h5k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: nop
      // 156: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 159: goto 160
      // 15c: invokestatic h5k.a (Loov;)Loov;
      // 15f: athrow
      // 160: iload 4
      // 162: ifeq 255
      // 165: ifeq 237
      // 168: goto 16f
      // 16b: invokestatic h5k.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 0
      // 170: pop
      // 171: getstatic h5k.ek1 Lc05;
      // 174: getfield Minecraft.vg8 Ll86;
      // 177: invokevirtual EntityPlayerSP.mwq ()Z
      // 17a: iload 4
      // 17c: ifeq 1a0
      // 17f: goto 186
      // 182: invokestatic h5k.a (Loov;)Loov;
      // 185: athrow
      // 186: ifeq 351
      // 189: goto 190
      // 18c: invokestatic h5k.a (Loov;)Loov;
      // 18f: athrow
      // 190: getstatic h5k.swx Lcn7;
      // 193: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 196: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 199: goto 1a0
      // 19c: invokestatic h5k.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: iload 4
      // 1a2: ifeq 1e8
      // 1a5: ifne 1d0
      // 1a8: goto 1af
      // 1ab: invokestatic h5k.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 0
      // 1b0: pop
      // 1b1: getstatic h5k.ek1 Lc05;
      // 1b4: getfield Minecraft.vg8 Ll86;
      // 1b7: getfield EntityPlayerSP.lfk Z
      // 1ba: iload 4
      // 1bc: ifeq 1e8
      // 1bf: goto 1c6
      // 1c2: invokestatic h5k.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: ifeq 351
      // 1c9: goto 1d0
      // 1cc: invokestatic h5k.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: pop
      // 1d2: getstatic h5k.ek1 Lc05;
      // 1d5: getfield Minecraft.vg8 Ll86;
      // 1d8: invokevirtual EntityPlayerSP.t_o ()Lerg;
      // 1db: invokevirtual erg.gn1 ()Lu7m;
      // 1de: instanceof r5m
      // 1e1: goto 1e8
      // 1e4: invokestatic h5k.a (Loov;)Loov;
      // 1e7: athrow
      // 1e8: iload 4
      // 1ea: ifeq 1f8
      // 1ed: ifne 351
      // 1f0: goto 1f7
      // 1f3: invokestatic h5k.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: bipush 0
      // 1f8: istore 5
      // 1fa: iload 5
      // 1fc: bipush 30
      // 1fe: if_icmpge 232
      // 201: aload 0
      // 202: pop
      // 203: getstatic h5k.ek1 Lc05;
      // 206: invokevirtual Minecraft.c02 ()Lp_k;
      // 209: new net/minecraft/network/play/client/C03PacketPlayer
      // 20c: dup
      // 20d: aload 0
      // 20e: pop
      // 20f: getstatic h5k.ek1 Lc05;
      // 212: getfield Minecraft.vg8 Ll86;
      // 215: getfield EntityPlayerSP.lfk Z
      // 218: invokespecial net/minecraft/network/play/client/C03PacketPlayer.<init> (Z)V
      // 21b: invokevirtual p_k.sxi (Lmz2;)V
      // 21e: iinc 5 1
      // 221: iload 4
      // 223: ifeq 351
      // 226: iload 4
      // 228: ifne 1fa
      // 22b: goto 232
      // 22e: invokestatic h5k.a (Loov;)Loov;
      // 231: athrow
      // 232: iload 4
      // 234: ifne 351
      // 237: getstatic h5k.vrs Lc_3;
      // 23a: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 23d: sipush 30800
      // 240: ldc2_w 4919712068836323815
      // 243: lload 2
      // 244: lxor
      // 245: invokedynamic q (IJ)Ljava/lang/String; bsm=h5k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: nop
      // 24b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24e: goto 255
      // 251: invokestatic h5k.a (Loov;)Loov;
      // 254: athrow
      // 255: iload 4
      // 257: ifeq 31e
      // 25a: ifeq 303
      // 25d: goto 264
      // 260: invokestatic h5k.a (Loov;)Loov;
      // 263: athrow
      // 264: aload 0
      // 265: pop
      // 266: getstatic h5k.ek1 Lc05;
      // 269: getfield Minecraft.vg8 Ll86;
      // 26c: invokevirtual EntityPlayerSP.mwq ()Z
      // 26f: iload 4
      // 271: ifeq 2e8
      // 274: goto 27b
      // 277: invokestatic h5k.a (Loov;)Loov;
      // 27a: athrow
      // 27b: ifeq 2c6
      // 27e: goto 285
      // 281: invokestatic h5k.a (Loov;)Loov;
      // 284: athrow
      // 285: aload 0
      // 286: pop
      // 287: getstatic h5k.ek1 Lc05;
      // 28a: getfield Minecraft.vg8 Ll86;
      // 28d: invokevirtual EntityPlayerSP.t_o ()Lerg;
      // 290: invokevirtual erg.gn1 ()Lu7m;
      // 293: instanceof r5m
      // 296: iload 4
      // 298: ifeq 2e8
      // 29b: goto 2a2
      // 29e: invokestatic h5k.a (Loov;)Loov;
      // 2a1: athrow
      // 2a2: ifne 2c6
      // 2a5: goto 2ac
      // 2a8: invokestatic h5k.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: aload 0
      // 2ad: pop
      // 2ae: getstatic h5k.ek1 Lc05;
      // 2b1: invokevirtual Minecraft.z8v ()Laba;
      // 2b4: ldc 1.5
      // 2b6: nop
      // 2b7: putfield aba.qeu F
      // 2ba: iload 4
      // 2bc: ifne 351
      // 2bf: goto 2c6
      // 2c2: invokestatic h5k.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: pop
      // 2c8: getstatic h5k.ek1 Lc05;
      // 2cb: invokevirtual Minecraft.z8v ()Laba;
      // 2ce: iload 4
      // 2d0: ifeq 2fa
      // 2d3: goto 2da
      // 2d6: invokestatic h5k.a (Loov;)Loov;
      // 2d9: athrow
      // 2da: getfield aba.qeu F
      // 2dd: ldc 1.5
      // 2df: nop
      // 2e0: fcmpl
      // 2e1: goto 2e8
      // 2e4: invokestatic h5k.a (Loov;)Loov;
      // 2e7: athrow
      // 2e8: ifne 351
      // 2eb: aload 0
      // 2ec: pop
      // 2ed: getstatic h5k.ek1 Lc05;
      // 2f0: invokevirtual Minecraft.z8v ()Laba;
      // 2f3: goto 2fa
      // 2f6: invokestatic h5k.a (Loov;)Loov;
      // 2f9: athrow
      // 2fa: fconst_1
      // 2fb: putfield aba.qeu F
      // 2fe: iload 4
      // 300: ifne 351
      // 303: getstatic h5k.vrs Lc_3;
      // 306: sipush 15872
      // 309: ldc2_w 1921806422308206522
      // 30c: lload 2
      // 30d: lxor
      // 30e: invokedynamic q (IJ)Ljava/lang/String; bsm=h5k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: nop
      // 314: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 317: goto 31e
      // 31a: invokestatic h5k.a (Loov;)Loov;
      // 31d: athrow
      // 31e: iload 4
      // 320: ifeq 330
      // 323: ifeq 351
      // 326: goto 32d
      // 329: invokestatic h5k.a (Loov;)Loov;
      // 32c: athrow
      // 32d: getstatic uy1.al8 I
      // 330: sipush 315
      // 333: if_icmpge 351
      // 336: sipush 2356
      // 339: ldc2_w 2203729348507762824
      // 33c: lload 2
      // 33d: lxor
      // 33e: invokedynamic q (IJ)Ljava/lang/String; bsm=h5k.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: nop
      // 344: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 347: aload 0
      // 348: bipush 0
      // 349: invokevirtual h5k.onEnabledChanged (Z)V
      // 34c: return
      // 34d: invokestatic h5k.a (Loov;)Loov;
      // 350: athrow
      // 351: return
   }

   private boolean dme() {
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
      // 05: pop
      // 06: getstatic h5k.ek1 Lc05;
      // 09: getfield Minecraft.vg8 Ll86;
      // 0c: invokevirtual EntityPlayerSP.mwv ()Z
      // 0f: iload 1
      // 10: ifeq 36
      // 13: ifne 35
      // 16: goto 1d
      // 19: invokestatic h5k.a (Loov;)Loov;
      // 1c: athrow
      // 1d: invokestatic bk4.icg ()Z
      // 20: iload 1
      // 21: ifeq 36
      // 24: goto 2b
      // 27: invokestatic h5k.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifne 39
      // 2e: goto 35
      // 31: invokestatic h5k.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3767462142387345167L, 509403149294654087L, MethodHandles.lookup().lookupClass()).a(7142650465409L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 96049653889717L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[12];
      int var5 = 0;
      String var4 = "\u0093f¾7ç±´u8kCÈ^Ó\u0011g\u0010Ã\u009b/$òªÇÖÔÌ\u001c\u001f¹Þèh\u00102v[\u0093ãG\u0007lÏ\u0096Âÿ¯Pò%XÒÄÊ\u0083£èâV\u000e×nñ\u008bsTs=EÄ´d\u0007@÷kI±Æ\u0012²¯\u0005!Õ\u0012\u000b\u0092\u0090\u009a\b=gÄ\u009b\u008e¿YI\u0014\u009a\u008dÑ\u009d\u009bÂ|hO¯$£½1]\u0000\u0084\u008a\u007fgz\u0005ï@æ\u0004ùK3,\u0000ÿ\u001bIÇU¶Å\u008f\u0010®Qz\u007f\fkmzLwÛ!¯\u0088~\u0091\u0010\biô\u00826ý±kÔ¾\u001a8^±n\u0005\u0010.>©ü[9\\µª¯9Ä¢Á}i\u0010\u0085\u0015rú¥µ\u008c\u0095^\u0086h\u0097Â\u0000Þ_\u0010k÷¡·)1/ 8\u001bÊ±8Icd\u0010Í_¶\u0001{$¨\u0005°,8¿Á5c\u0019";
      int var6 = "\u0093f¾7ç±´u8kCÈ^Ó\u0011g\u0010Ã\u009b/$òªÇÖÔÌ\u001c\u001f¹Þèh\u00102v[\u0093ãG\u0007lÏ\u0096Âÿ¯Pò%XÒÄÊ\u0083£èâV\u000e×nñ\u008bsTs=EÄ´d\u0007@÷kI±Æ\u0012²¯\u0005!Õ\u0012\u000b\u0092\u0090\u009a\b=gÄ\u009b\u008e¿YI\u0014\u009a\u008dÑ\u009d\u009bÂ|hO¯$£½1]\u0000\u0084\u008a\u007fgz\u0005ï@æ\u0004ùK3,\u0000ÿ\u001bIÇU¶Å\u008f\u0010®Qz\u007f\fkmzLwÛ!¯\u0088~\u0091\u0010\biô\u00826ý±kÔ¾\u001a8^±n\u0005\u0010.>©ü[9\\µª¯9Ä¢Á}i\u0010\u0085\u0015rú¥µ\u008c\u0095^\u0086h\u0097Â\u0000Þ_\u0010k÷¡·)1/ 8\u001bÊ±8Icd\u0010Í_¶\u0001{$¨\u0005°,8¿Á5c\u0019"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[12];
                     vrs = new ModeSetting(
                        b<"q">(4293, 8835967339110522899L ^ var9),
                        b<"q">(25474, 7186705079749645148L ^ var9),
                        b<"q">(23696, 6322591357461539909L ^ var9),
                        new String[]{
                           b<"q">(23696, 6322591357461539909L ^ var9), b<"q">(9932, 1303245298123888158L ^ var9), b<"q">(22285, 8216163497435899865L ^ var9)
                        }
                     );
                     swx = new BooleanSetting(b<"q">(28450, 2510946663453630449L ^ var9), b<"q">(19320, 726178972196715432L ^ var9), false);
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

                  var4 = "²ûö¹RË~3È\u0083kªZDüZ\u00100ÈîçCÓµd¹\u008a§Ì¢\u001eW{";
                  var6 = "²ûö¹RË~3È\u0083kªZDüZ\u00100ÈîçCÓµd¹\u008a§Ì¢\u001eW{".length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6287;
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
            throw new RuntimeException("h5k", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("h5k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
