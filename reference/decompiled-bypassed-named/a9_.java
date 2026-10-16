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

public class a9_ extends Module {
   public static ModeSetting a0x;
   public static BooleanSetting l36;
   public static BooleanSetting bn9;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public a9_() {
      long var1 = a ^ 116029124494211L;
      super(b<"z">(4978, 2019191753220342700L ^ var1), _aj.sxc, a0x);
   }

   @EventHandler
   public void e3i(dxp param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a9_.a J
      // 003: ldc2_w 101162784380611
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: iload 4
      // 010: ifne 02e
      // 013: invokevirtual dxp.oxg ()Lg_3;
      // 016: getstatic a9_.ek1 Lc05;
      // 019: getfield Minecraft.vg8 Ll86;
      // 01c: if_acmpeq 372
      // 01f: goto 026
      // 022: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 025: athrow
      // 026: aload 1
      // 027: goto 02e
      // 02a: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 02d: athrow
      // 02e: invokevirtual dxp.ike ()Z
      // 031: iload 4
      // 033: ifne 335
      // 036: ifeq 31a
      // 039: goto 040
      // 03c: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 03f: athrow
      // 040: getstatic a9_.a0x Lc_3;
      // 043: sipush 19620
      // 046: ldc2_w 7368785220895836473
      // 049: lload 2
      // 04a: lxor
      // 04b: invokedynamic z (IJ)Ljava/lang/String; bsm=a9_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: nop
      // 051: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 054: iload 4
      // 056: ifne 30b
      // 059: goto 060
      // 05c: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 05f: athrow
      // 060: ifeq 301
      // 063: goto 06a
      // 066: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 069: athrow
      // 06a: aload 1
      // 06b: bipush 1
      // 06c: invokevirtual dxp.wxi (Z)V
      // 06f: getstatic a9_.ek1 Lc05;
      // 072: invokevirtual Minecraft.ibs ()Lhr_;
      // 075: aload 1
      // 076: invokevirtual dxp.oxg ()Lg_3;
      // 079: invokevirtual hr_.ihn (Li2h;)Lliu;
      // 07c: astore 5
      // 07e: aload 5
      // 080: ifnull 2f7
      // 083: getstatic a9_.ek1 Lc05;
      // 086: invokevirtual Minecraft.ibs ()Lhr_;
      // 089: getfield hr_.ewh Llc5;
      // 08c: ifnull 2f7
      // 08f: goto 096
      // 092: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 095: athrow
      // 096: aload 5
      // 098: instanceof gmu
      // 09b: iload 4
      // 09d: ifne 0d3
      // 0a0: goto 0a7
      // 0a3: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 0a6: athrow
      // 0a7: ifeq 2f7
      // 0aa: goto 0b1
      // 0ad: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 0b0: athrow
      // 0b1: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 0b4: sipush 2929
      // 0b7: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 0ba: sipush 770
      // 0bd: sipush 771
      // 0c0: invokestatic org/lwjgl/opengl/GL11.glBlendFunc (II)V
      // 0c3: sipush 3553
      // 0c6: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 0c9: sipush 3042
      // 0cc: goto 0d3
      // 0cf: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 0d2: athrow
      // 0d3: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 0d6: aconst_null
      // 0d7: astore 6
      // 0d9: getstatic a9_.l36 Lcn7;
      // 0dc: invokevirtual BooleanSetting.g7m ()Z
      // 0df: iload 4
      // 0e1: ifne 0f7
      // 0e4: ifeq 0f1
      // 0e7: goto 0ee
      // 0ea: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 0ed: athrow
      // 0ee: invokestatic hzu.fpt ()V
      // 0f1: getstatic a9_.bn9 Lcn7;
      // 0f4: invokevirtual BooleanSetting.g7m ()Z
      // 0f7: ifeq 1e7
      // 0fa: aload 1
      // 0fb: invokevirtual dxp.oxg ()Lg_3;
      // 0fe: invokevirtual Entity.xyw ()Lekw;
      // 101: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 106: astore 7
      // 108: bipush 0
      // 109: istore 8
      // 10b: iload 8
      // 10d: aload 7
      // 10f: invokevirtual java/lang/String.length ()I
      // 112: if_icmpge 1e4
      // 115: aload 7
      // 117: iload 8
      // 119: invokevirtual java/lang/String.charAt (I)C
      // 11c: iload 4
      // 11e: ifne 21e
      // 121: sipush 167
      // 124: iload 4
      // 126: ifne 156
      // 129: goto 130
      // 12c: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 12f: athrow
      // 130: if_icmpne 1dc
      // 133: goto 13a
      // 136: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 139: athrow
      // 13a: iload 8
      // 13c: bipush 1
      // 13d: iadd
      // 13e: iload 4
      // 140: ifne 16c
      // 143: goto 14a
      // 146: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 149: athrow
      // 14a: aload 7
      // 14c: invokevirtual java/lang/String.length ()I
      // 14f: goto 156
      // 152: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 155: athrow
      // 156: if_icmpge 1dc
      // 159: aload 7
      // 15b: iload 8
      // 15d: bipush 1
      // 15e: iadd
      // 15f: invokevirtual java/lang/String.charAt (I)C
      // 162: invokestatic java/lang/Character.toLowerCase (C)C
      // 165: goto 16c
      // 168: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 16b: athrow
      // 16c: istore 9
      // 16e: sipush 1249
      // 171: ldc2_w 9057703067817001336
      // 174: lload 2
      // 175: lxor
      // 176: invokedynamic z (IJ)Ljava/lang/String; bsm=a9_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: nop
      // 17c: iload 9
      // 17e: invokevirtual java/lang/String.indexOf (I)I
      // 181: istore 10
      // 183: iload 4
      // 185: ifne 1df
      // 188: iload 10
      // 18a: bipush 16
      // 18c: if_icmpge 1dc
      // 18f: goto 196
      // 192: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 195: athrow
      // 196: new java/awt/Color
      // 199: dup
      // 19a: getstatic a9_.ek1 Lc05;
      // 19d: getfield Minecraft.tx1 Lowt;
      // 1a0: getfield owt.fgp [I
      // 1a3: iload 10
      // 1a5: iaload
      // 1a6: invokespecial java/awt/Color.<init> (I)V
      // 1a9: dup
      // 1aa: astore 6
      // 1ac: astore 11
      // 1ae: aload 11
      // 1b0: invokevirtual java/awt/Color.getRed ()I
      // 1b3: i2f
      // 1b4: ldc 255.0
      // 1b6: nop
      // 1b7: fdiv
      // 1b8: aload 11
      // 1ba: invokevirtual java/awt/Color.getGreen ()I
      // 1bd: i2f
      // 1be: ldc 255.0
      // 1c0: nop
      // 1c1: fdiv
      // 1c2: aload 11
      // 1c4: invokevirtual java/awt/Color.getBlue ()I
      // 1c7: i2f
      // 1c8: ldc 255.0
      // 1ca: nop
      // 1cb: fdiv
      // 1cc: fconst_1
      // 1cd: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 1d0: goto 1dc
      // 1d3: astore 11
      // 1d5: fconst_1
      // 1d6: fconst_0
      // 1d7: fconst_0
      // 1d8: fconst_1
      // 1d9: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 1dc: iinc 8 1
      // 1df: iload 4
      // 1e1: ifeq 10b
      // 1e4: goto 1ee
      // 1e7: fconst_1
      // 1e8: fconst_0
      // 1e9: fconst_0
      // 1ea: fconst_1
      // 1eb: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 1ee: aload 5
      // 1f0: checkcast gmu
      // 1f3: aload 1
      // 1f4: invokevirtual dxp.oxg ()Lg_3;
      // 1f7: aload 1
      // 1f8: invokevirtual dxp.bnh ()F
      // 1fb: aload 1
      // 1fc: invokevirtual dxp.h94 ()F
      // 1ff: aload 1
      // 200: invokevirtual dxp.o_d ()F
      // 203: aload 1
      // 204: invokevirtual dxp.vqe ()F
      // 207: aload 1
      // 208: invokevirtual dxp.uva ()F
      // 20b: aload 1
      // 20c: invokevirtual dxp.nch ()F
      // 20f: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 212: sipush 2929
      // 215: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 218: getstatic a9_.bn9 Lcn7;
      // 21b: invokevirtual BooleanSetting.g7m ()Z
      // 21e: ifeq 260
      // 221: aload 6
      // 223: iload 4
      // 225: ifne 23b
      // 228: goto 22f
      // 22b: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 22e: athrow
      // 22f: ifnull 260
      // 232: goto 239
      // 235: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 238: athrow
      // 239: aload 6
      // 23b: invokevirtual java/awt/Color.getRed ()I
      // 23e: i2f
      // 23f: ldc 255.0
      // 241: nop
      // 242: fdiv
      // 243: aload 6
      // 245: invokevirtual java/awt/Color.getGreen ()I
      // 248: i2f
      // 249: ldc 255.0
      // 24b: nop
      // 24c: fdiv
      // 24d: aload 6
      // 24f: invokevirtual java/awt/Color.getBlue ()I
      // 252: i2f
      // 253: ldc 255.0
      // 255: nop
      // 256: fdiv
      // 257: fconst_1
      // 258: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 25b: iload 4
      // 25d: ifeq 26e
      // 260: fconst_0
      // 261: fconst_1
      // 262: fconst_0
      // 263: fconst_1
      // 264: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 267: goto 26e
      // 26a: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 26d: athrow
      // 26e: aload 5
      // 270: checkcast gmu
      // 273: aload 1
      // 274: invokevirtual dxp.oxg ()Lg_3;
      // 277: aload 1
      // 278: invokevirtual dxp.bnh ()F
      // 27b: aload 1
      // 27c: invokevirtual dxp.h94 ()F
      // 27f: aload 1
      // 280: invokevirtual dxp.o_d ()F
      // 283: aload 1
      // 284: invokevirtual dxp.vqe ()F
      // 287: aload 1
      // 288: invokevirtual dxp.uva ()F
      // 28b: aload 1
      // 28c: invokevirtual dxp.nch ()F
      // 28f: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 292: sipush 3553
      // 295: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 298: sipush 3042
      // 29b: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 29e: fconst_1
      // 29f: fconst_1
      // 2a0: fconst_1
      // 2a1: fconst_1
      // 2a2: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 2a5: iload 4
      // 2a7: ifne 2f4
      // 2aa: getstatic a9_.l36 Lcn7;
      // 2ad: invokevirtual BooleanSetting.g7m ()Z
      // 2b0: ifeq 2c4
      // 2b3: goto 2ba
      // 2b6: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 2b9: athrow
      // 2ba: invokestatic hzu.s7q ()V
      // 2bd: goto 2c4
      // 2c0: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 2c3: athrow
      // 2c4: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 2c7: aload 5
      // 2c9: checkcast gmu
      // 2cc: aload 1
      // 2cd: invokevirtual dxp.oxg ()Lg_3;
      // 2d0: aload 1
      // 2d1: invokevirtual dxp.bnh ()F
      // 2d4: aload 1
      // 2d5: invokevirtual dxp.h94 ()F
      // 2d8: getstatic a9_.ek1 Lc05;
      // 2db: getfield Minecraft.gze Laba;
      // 2de: getfield aba.au3 F
      // 2e1: aload 1
      // 2e2: invokevirtual dxp.o_d ()F
      // 2e5: aload 1
      // 2e6: invokevirtual dxp.vqe ()F
      // 2e9: aload 1
      // 2ea: invokevirtual dxp.uva ()F
      // 2ed: aload 1
      // 2ee: invokevirtual dxp.nch ()F
      // 2f1: invokevirtual gmu.x50 (Lg_3;FFFFFFF)V
      // 2f4: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 2f7: goto 372
      // 2fa: astore 5
      // 2fc: iload 4
      // 2fe: ifeq 372
      // 301: ldc 32823
      // 303: nop
      // 304: goto 30b
      // 307: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 30a: athrow
      // 30b: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 30e: fconst_1
      // 30f: ldc -1100000.0
      // 311: nop
      // 312: invokestatic org/lwjgl/opengl/GL11.glPolygonOffset (FF)V
      // 315: iload 4
      // 317: ifeq 372
      // 31a: getstatic a9_.a0x Lc_3;
      // 31d: sipush 23449
      // 320: ldc2_w 2668999783924964867
      // 323: lload 2
      // 324: lxor
      // 325: invokedynamic z (IJ)Ljava/lang/String; bsm=a9_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: nop
      // 32b: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 32e: goto 335
      // 331: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 334: athrow
      // 335: iload 4
      // 337: ifne 34f
      // 33a: ifne 372
      // 33d: goto 344
      // 340: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 343: athrow
      // 344: aload 1
      // 345: invokevirtual dxp.ypz ()Z
      // 348: goto 34f
      // 34b: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 34e: athrow
      // 34f: iload 4
      // 351: ifne 368
      // 354: ifeq 372
      // 357: goto 35e
      // 35a: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 35d: athrow
      // 35e: ldc 32823
      // 360: nop
      // 361: goto 368
      // 364: invokestatic a9_.a (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
      // 367: athrow
      // 368: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 36b: fconst_1
      // 36c: ldc 1100000.0
      // 36e: nop
      // 36f: invokestatic org/lwjgl/opengl/GL11.glPolygonOffset (FF)V
      // 372: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4147614426553556156L, -7894421008528039886L, MethodHandles.lookup().lookupClass()).a(45492379105827L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 117028295364956L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "5'T\u008c#kxÂzöæHÛÙ±@\u0010Å\u0015I0Å%\u001dá¨éÍàÂ\u0017±\u0017\u0010¤\u0015ÊL(Ç\u00996äðìL\u0001¥®[ U\u008c\u0013;\bf\u008cæ\u0081ïB\u0081þ\u001fdã?p)×\u0095ÎO\u0095\u0018\u0016&\u008a\u0090¢\u0000\u001f(\u0097\u0007p\u0092c±VY\t\u008dÁ£\u008cö\u00adºÔ\u0006\t8ö}l$ùÿÊ\u0012\"sþ7R ã× Ìó6\u0018<áà[/døèº\u009d)\u000ey\u0081 D6\u008d÷ÞñkG0 `»pA\u007f·y#\u0082\u0093MÖa]\u0081µjwA³ÈY\u0085\"\u0010éåØ'èÑ0\u0010a¢n°ÕúF$&Õ\u009ci-ø\u0080ß";
      int var6 = "5'T\u008c#kxÂzöæHÛÙ±@\u0010Å\u0015I0Å%\u001dá¨éÍàÂ\u0017±\u0017\u0010¤\u0015ÊL(Ç\u00996äðìL\u0001¥®[ U\u008c\u0013;\bf\u008cæ\u0081ïB\u0081þ\u001fdã?p)×\u0095ÎO\u0095\u0018\u0016&\u008a\u0090¢\u0000\u001f(\u0097\u0007p\u0092c±VY\t\u008dÁ£\u008cö\u00adºÔ\u0006\t8ö}l$ùÿÊ\u0012\"sþ7R ã× Ìó6\u0018<áà[/døèº\u009d)\u000ey\u0081 D6\u008d÷ÞñkG0 `»pA\u007f·y#\u0082\u0093MÖa]\u0081µjwA³ÈY\u0085\"\u0010éåØ'èÑ0\u0010a¢n°ÕúF$&Õ\u009ci-ø\u0080ß"
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
                     g = new String[10];
                     a0x = new ModeSetting(
                        b<"z">(11716, 1789442707319025600L ^ var9),
                        b<"z">(20076, 7662236713901952102L ^ var9),
                        b<"z">(479, 8956728202250175452L ^ var9),
                        new String[]{b<"z">(27160, 8115555957564647448L ^ var9), b<"z">(23449, 2668953733183543708L ^ var9)}
                     );
                     l36 = new BooleanSetting(b<"z">(4978, 2019195772894859635L ^ var9), b<"z">(15681, 6712640280287772490L ^ var9), false);
                     bn9 = new BooleanSetting(b<"z">(4978, 2019195772894859635L ^ var9), b<"z">(10829, 1203982739682388042L ^ var9), false);
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

                  var4 = "E\u0083ÿn¤.GûÇ\u001bTVqÇ³a\u0010Z\fÔs\u0096\u0001Vkª(¿p\u008aÑ¬Æ";
                  var6 = "E\u0083ÿn¤.GûÇ\u001bTVqÇ³a\u0010Z\fÔs\u0096\u0001Vkª(¿p\u008aÑ¬Æ".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32391;
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
            throw new RuntimeException("a9_", var10);
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
         throw new RuntimeException("a9_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
