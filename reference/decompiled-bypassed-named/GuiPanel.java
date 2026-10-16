import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.FileUtils;

public class GuiPanel {
   public ClickGui usm;
   public Minecraft kkd;
   public ers$lgy d4s;
   public CopyOnWriteArrayList dye;
   public CopyOnWriteArrayList fv1;
   public String gn0;
   public boolean gu1;
   public float pof;
   public float _88;
   public float _oo;
   public float i0e;
   public boolean f9q;
   public int jky;
   public int mom;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public GuiPanel(ClickGui var1) {
      long var2 = a ^ 107829922926080L;
      super();
      this.kkd = Minecraft.vz1();
      this.d4s = new ers$lgy(this, 0);
      this.dye = new CopyOnWriteArrayList();
      this.fv1 = new CopyOnWriteArrayList();
      this.gn0 = a<"i">(7213, 6093553662324952924L ^ var2);
      this.gu1 = false;
      this.pof = -100.0F;
      this._oo = 0.0F;
      this.i0e = 0.0F;
      this.f9q = false;
      this.jky = 0;
      this.mom = 0;
      this.usm = var1;

      try {
         this.rup();
      } catch (Exception var5) {
      }
   }

   public void dvt() {
      this.rup();
   }

   public void jet(eka param1, int param2, int param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic GuiPanel.a J
      // 003: ldc2_w 120192829330963
      // 006: lxor
      // 007: lstore 5
      // 009: aload 1
      // 00a: invokevirtual eka.x05 ()I
      // 00d: i2f
      // 00e: fstore 8
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: aload 1
      // 014: invokevirtual eka.lrx ()I
      // 017: i2f
      // 018: fstore 9
      // 01a: istore 7
      // 01c: aload 0
      // 01d: getfield GuiPanel.f9q Z
      // 020: ifeq 02d
      // 023: ldc 100.0
      // 025: nop
      // 026: goto 02e
      // 029: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: fconst_0
      // 02e: fstore 10
      // 030: aload 0
      // 031: aload 0
      // 032: getfield GuiPanel.i0e F
      // 035: fload 10
      // 037: ldc 10.0
      // 039: nop
      // 03a: aload 0
      // 03b: getfield GuiPanel.i0e F
      // 03e: fload 10
      // 040: fsub
      // 041: invokestatic java/lang/Math.abs (F)F
      // 044: ldc 40.0
      // 046: nop
      // 047: fmul
      // 048: invokestatic java/lang/Math.max (FF)F
      // 04b: ldc 0.3
      // 04d: nop
      // 04e: fmul
      // 04f: invokestatic InputState.lvf (FFF)F
      // 052: putfield GuiPanel.i0e F
      // 055: aload 0
      // 056: getstatic ClientState.gki Lc_3;
      // 059: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 05c: sipush 26775
      // 05f: ldc2_w 2949462996834001912
      // 062: lload 5
      // 064: lxor
      // 065: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: nop
      // 06b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 06e: iload 7
      // 070: ifne 089
      // 073: ifeq 087
      // 076: goto 07d
      // 079: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: ldc -12565429
      // 07f: nop
      // 080: goto 08a
      // 083: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: ldc -1184787
      // 089: nop
      // 08a: putfield GuiPanel.jky I
      // 08d: aload 0
      // 08e: getstatic ClientState.gki Lc_3;
      // 091: invokevirtual ModeSetting.getValue ()Ljava/lang/String;
      // 094: sipush 15309
      // 097: ldc2_w 8043077522281623718
      // 09a: lload 5
      // 09c: lxor
      // 09d: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: nop
      // 0a3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a6: iload 7
      // 0a8: ifne 0c1
      // 0ab: ifeq 0bf
      // 0ae: goto 0b5
      // 0b1: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: ldc -3289651
      // 0b7: nop
      // 0b8: goto 0c2
      // 0bb: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: ldc -11514032
      // 0c1: nop
      // 0c2: putfield GuiPanel.mom I
      // 0c5: aload 0
      // 0c6: iload 7
      // 0c8: ifne 1c0
      // 0cb: getfield GuiPanel.f9q Z
      // 0ce: ifeq 1ae
      // 0d1: goto 0d8
      // 0d4: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d7: athrow
      // 0d8: iload 2
      // 0d9: i2f
      // 0da: iload 3
      // 0db: i2f
      // 0dc: fload 8
      // 0de: ldc 95.0
      // 0e0: nop
      // 0e1: fsub
      // 0e2: fload 9
      // 0e4: ldc 5.0
      // 0e6: nop
      // 0e7: fsub
      // 0e8: aload 0
      // 0e9: getfield GuiPanel.i0e F
      // 0ec: fsub
      // 0ed: fload 8
      // 0ef: ldc 5.0
      // 0f1: nop
      // 0f2: fsub
      // 0f3: fload 9
      // 0f5: ldc 5.0
      // 0f7: nop
      // 0f8: fsub
      // 0f9: invokestatic hhf.md3 (FFFFFF)Z
      // 0fc: iload 7
      // 0fe: ifne 127
      // 101: goto 108
      // 104: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: ifeq 19d
      // 10b: goto 112
      // 10e: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 0
      // 113: bipush 1
      // 114: putfield GuiPanel.gu1 Z
      // 117: aload 0
      // 118: getfield GuiPanel._88 F
      // 11b: aload 0
      // 11c: getfield GuiPanel.pof F
      // 11f: fcmpg
      // 120: goto 127
      // 123: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: iload 7
      // 129: ifne 157
      // 12c: ifgt 145
      // 12f: goto 136
      // 132: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: aload 0
      // 137: aload 0
      // 138: getfield GuiPanel.pof F
      // 13b: putfield GuiPanel._88 F
      // 13e: goto 145
      // 141: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 144: athrow
      // 145: aload 0
      // 146: iload 7
      // 148: ifne 192
      // 14b: getfield GuiPanel._88 F
      // 14e: fconst_0
      // 14f: fcmpl
      // 150: goto 157
      // 153: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: iflt 166
      // 15a: aload 0
      // 15b: fconst_0
      // 15c: putfield GuiPanel._88 F
      // 15f: goto 166
      // 162: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 165: athrow
      // 166: aload 0
      // 167: aload 0
      // 168: getfield GuiPanel._oo F
      // 16b: aload 0
      // 16c: getfield GuiPanel._88 F
      // 16f: ldc 10.0
      // 171: nop
      // 172: aload 0
      // 173: getfield GuiPanel._oo F
      // 176: aload 0
      // 177: getfield GuiPanel._88 F
      // 17a: fsub
      // 17b: invokestatic java/lang/Math.abs (F)F
      // 17e: ldc 40.0
      // 180: nop
      // 181: fmul
      // 182: invokestatic java/lang/Math.max (FF)F
      // 185: f2d
      // 186: ldc2_w 0.3
      // 189: dmul
      // 18a: d2f
      // 18b: invokestatic InputState.lvf (FFF)F
      // 18e: putfield GuiPanel._oo F
      // 191: aload 0
      // 192: ldc 100.0
      // 194: nop
      // 195: putfield GuiPanel.pof F
      // 198: iload 7
      // 19a: ifeq 1c4
      // 19d: aload 0
      // 19e: bipush 0
      // 19f: putfield GuiPanel.gu1 Z
      // 1a2: iload 7
      // 1a4: ifeq 1c4
      // 1a7: goto 1ae
      // 1aa: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: bipush 0
      // 1b0: putfield GuiPanel.gu1 Z
      // 1b3: aload 0
      // 1b4: fconst_0
      // 1b5: putfield GuiPanel._oo F
      // 1b8: aload 0
      // 1b9: goto 1c0
      // 1bc: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bf: athrow
      // 1c0: fconst_0
      // 1c1: putfield GuiPanel._88 F
      // 1c4: fload 8
      // 1c6: ldc 95.0
      // 1c8: nop
      // 1c9: fsub
      // 1ca: fload 9
      // 1cc: ldc 25.0
      // 1ce: nop
      // 1cf: fsub
      // 1d0: aload 0
      // 1d1: getfield GuiPanel.i0e F
      // 1d4: fsub
      // 1d5: fload 8
      // 1d7: ldc 5.0
      // 1d9: nop
      // 1da: fsub
      // 1db: fload 9
      // 1dd: ldc 23.0
      // 1df: nop
      // 1e0: fsub
      // 1e1: ldc -12417291
      // 1e3: nop
      // 1e4: invokestatic hhf.cuu (FFFFI)V
      // 1e7: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 1ea: sipush 3089
      // 1ed: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 1f0: aload 0
      // 1f1: getfield GuiPanel.i0e F
      // 1f4: fconst_0
      // 1f5: iload 7
      // 1f7: ifne 239
      // 1fa: fcmpl
      // 1fb: ifle 226
      // 1fe: goto 205
      // 201: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 204: athrow
      // 205: fload 8
      // 207: ldc 195.0
      // 209: nop
      // 20a: fsub
      // 20b: fload 9
      // 20d: ldc 123.0
      // 20f: nop
      // 210: fsub
      // 211: ldc 190.0
      // 213: nop
      // 214: ldc 118.0
      // 216: nop
      // 217: invokestatic hhf.xbo (FFFF)V
      // 21a: iload 7
      // 21c: ifeq 242
      // 21f: goto 226
      // 222: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 225: athrow
      // 226: fload 8
      // 228: ldc 95.0
      // 22a: nop
      // 22b: fsub
      // 22c: fload 9
      // 22e: ldc 23.0
      // 230: nop
      // 231: fsub
      // 232: goto 239
      // 235: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: ldc 90.0
      // 23b: nop
      // 23c: ldc 18.0
      // 23e: nop
      // 23f: invokestatic hhf.xbo (FFFF)V
      // 242: fload 8
      // 244: ldc 95.0
      // 246: nop
      // 247: fsub
      // 248: fload 9
      // 24a: ldc 23.0
      // 24c: nop
      // 24d: fsub
      // 24e: aload 0
      // 24f: getfield GuiPanel.i0e F
      // 252: fsub
      // 253: fload 8
      // 255: ldc 5.0
      // 257: nop
      // 258: fsub
      // 259: fload 9
      // 25b: ldc 5.0
      // 25d: nop
      // 25e: fsub
      // 25f: aload 0
      // 260: getfield GuiPanel.jky I
      // 263: invokestatic hhf.cuu (FFFFI)V
      // 266: aload 0
      // 267: getfield GuiPanel.i0e F
      // 26a: fconst_0
      // 26b: fcmpl
      // 26c: iload 7
      // 26e: ifne 504
      // 271: ifle 3dd
      // 274: goto 27b
      // 277: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: fload 9
      // 27d: aload 0
      // 27e: getfield GuiPanel.i0e F
      // 281: fsub
      // 282: aload 0
      // 283: getfield GuiPanel._oo F
      // 286: fadd
      // 287: ldc 20.0
      // 289: nop
      // 28a: fadd
      // 28b: fstore 11
      // 28d: fconst_0
      // 28e: fstore 12
      // 290: aload 0
      // 291: getfield GuiPanel.dye Ljava/util/concurrent/CopyOnWriteArrayList;
      // 294: invokevirtual java/util/concurrent/CopyOnWriteArrayList.size ()I
      // 297: iload 7
      // 299: ifne 344
      // 29c: ifle 331
      // 29f: goto 2a6
      // 2a2: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: aload 0
      // 2a7: getfield GuiPanel.dye Ljava/util/concurrent/CopyOnWriteArrayList;
      // 2aa: invokevirtual java/util/concurrent/CopyOnWriteArrayList.iterator ()Ljava/util/Iterator;
      // 2ad: astore 13
      // 2af: aload 13
      // 2b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b6: ifeq 331
      // 2b9: aload 13
      // 2bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c0: checkcast cqt
      // 2c3: astore 14
      // 2c5: fload 11
      // 2c7: fload 9
      // 2c9: ldc 115.0
      // 2cb: nop
      // 2cc: fsub
      // 2cd: iload 7
      // 2cf: ifne 329
      // 2d2: fcmpl
      // 2d3: iload 7
      // 2d5: ifne 344
      // 2d8: goto 2df
      // 2db: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2de: athrow
      // 2df: ifle 31c
      // 2e2: goto 2e9
      // 2e5: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e8: athrow
      // 2e9: fload 11
      // 2eb: fload 9
      // 2ed: ldc 20.0
      // 2ef: nop
      // 2f0: fadd
      // 2f1: iload 7
      // 2f3: ifne 329
      // 2f6: goto 2fd
      // 2f9: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fc: athrow
      // 2fd: fcmpg
      // 2fe: ifge 31c
      // 301: goto 308
      // 304: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 307: athrow
      // 308: aload 14
      // 30a: fload 8
      // 30c: ldc 95.0
      // 30e: nop
      // 30f: fsub
      // 310: fload 11
      // 312: invokevirtual cqt.ej_ (FF)V
      // 315: goto 31c
      // 318: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31b: athrow
      // 31c: fload 12
      // 31e: ldc 20.0
      // 320: nop
      // 321: fadd
      // 322: fstore 12
      // 324: fload 11
      // 326: ldc 20.0
      // 328: nop
      // 329: fadd
      // 32a: fstore 11
      // 32c: iload 7
      // 32e: ifeq 2af
      // 331: aload 0
      // 332: iload 7
      // 334: ifne 3d3
      // 337: getfield GuiPanel.fv1 Ljava/util/concurrent/CopyOnWriteArrayList;
      // 33a: invokevirtual java/util/concurrent/CopyOnWriteArrayList.size ()I
      // 33d: goto 344
      // 340: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 343: athrow
      // 344: ifle 3d2
      // 347: aload 0
      // 348: getfield GuiPanel.fv1 Ljava/util/concurrent/CopyOnWriteArrayList;
      // 34b: invokevirtual java/util/concurrent/CopyOnWriteArrayList.iterator ()Ljava/util/Iterator;
      // 34e: astore 13
      // 350: aload 13
      // 352: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 357: ifeq 3d2
      // 35a: aload 13
      // 35c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 361: checkcast cqt
      // 364: astore 14
      // 366: fload 11
      // 368: fload 9
      // 36a: ldc 115.0
      // 36c: nop
      // 36d: fsub
      // 36e: iload 7
      // 370: ifne 3ca
      // 373: fcmpl
      // 374: iload 7
      // 376: ifne 504
      // 379: goto 380
      // 37c: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37f: athrow
      // 380: ifle 3bd
      // 383: goto 38a
      // 386: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 389: athrow
      // 38a: fload 11
      // 38c: fload 9
      // 38e: ldc 20.0
      // 390: nop
      // 391: fadd
      // 392: iload 7
      // 394: ifne 3ca
      // 397: goto 39e
      // 39a: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39d: athrow
      // 39e: fcmpg
      // 39f: ifge 3bd
      // 3a2: goto 3a9
      // 3a5: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a8: athrow
      // 3a9: aload 14
      // 3ab: fload 8
      // 3ad: ldc 95.0
      // 3af: nop
      // 3b0: fsub
      // 3b1: fload 11
      // 3b3: invokevirtual cqt.ej_ (FF)V
      // 3b6: goto 3bd
      // 3b9: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bc: athrow
      // 3bd: fload 12
      // 3bf: ldc 20.0
      // 3c1: nop
      // 3c2: fadd
      // 3c3: fstore 12
      // 3c5: fload 11
      // 3c7: ldc 20.0
      // 3c9: nop
      // 3ca: fadd
      // 3cb: fstore 11
      // 3cd: iload 7
      // 3cf: ifeq 350
      // 3d2: aload 0
      // 3d3: dup
      // 3d4: getfield GuiPanel.pof F
      // 3d7: fload 12
      // 3d9: fsub
      // 3da: putfield GuiPanel.pof F
      // 3dd: fload 8
      // 3df: ldc 95.0
      // 3e1: nop
      // 3e2: fsub
      // 3e3: fload 9
      // 3e5: ldc 23.0
      // 3e7: nop
      // 3e8: fsub
      // 3e9: aload 0
      // 3ea: getfield GuiPanel.i0e F
      // 3ed: fsub
      // 3ee: fload 8
      // 3f0: ldc 5.0
      // 3f2: nop
      // 3f3: fsub
      // 3f4: fload 9
      // 3f6: ldc 5.0
      // 3f8: nop
      // 3f9: fsub
      // 3fa: aload 0
      // 3fb: getfield GuiPanel.i0e F
      // 3fe: fsub
      // 3ff: aload 0
      // 400: getfield GuiPanel.jky I
      // 403: invokestatic hhf.cuu (FFFFI)V
      // 406: aload 0
      // 407: fload 8
      // 409: ldc 95.0
      // 40b: nop
      // 40c: fsub
      // 40d: fload 9
      // 40f: ldc 5.0
      // 411: nop
      // 412: fsub
      // 413: aload 0
      // 414: getfield GuiPanel.i0e F
      // 417: fsub
      // 418: fload 8
      // 41a: ldc 5.0
      // 41c: nop
      // 41d: fsub
      // 41e: fload 9
      // 420: aload 0
      // 421: getfield GuiPanel.i0e F
      // 424: fsub
      // 425: getstatic z7e.ret Lz7e;
      // 428: getfield z7e.k0y I
      // 42b: ldc 0.25
      // 42d: nop
      // 42e: invokestatic hhf.kjo (IF)I
      // 431: getstatic z7e.ret Lz7e;
      // 434: getfield z7e.k0y I
      // 437: fconst_0
      // 438: invokestatic hhf.kjo (IF)I
      // 43b: invokevirtual GuiPanel.vp5 (FFFFII)V
      // 43e: getstatic jsr.rfr Lcyb;
      // 441: aload 0
      // 442: getfield GuiPanel.gn0 Ljava/lang/String;
      // 445: fload 8
      // 447: ldc 80.0
      // 449: nop
      // 44a: fsub
      // 44b: fload 9
      // 44d: ldc 20.0
      // 44f: nop
      // 450: fsub
      // 451: aload 0
      // 452: getfield GuiPanel.i0e F
      // 455: fsub
      // 456: aload 0
      // 457: getfield GuiPanel.mom I
      // 45a: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 45d: pop
      // 45e: getstatic jsr.tyz Lcyb;
      // 461: ldc "v"
      // 463: nop
      // 464: fload 8
      // 466: ldc 90.0
      // 468: nop
      // 469: fsub
      // 46a: fload 9
      // 46c: ldc 18.0
      // 46e: nop
      // 46f: fsub
      // 470: aload 0
      // 471: getfield GuiPanel.i0e F
      // 474: fsub
      // 475: aload 0
      // 476: getfield GuiPanel.mom I
      // 479: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 47c: pop
      // 47d: aload 0
      // 47e: fload 8
      // 480: ldc 40.0
      // 482: nop
      // 483: fsub
      // 484: fload 9
      // 486: ldc 23.0
      // 488: nop
      // 489: fsub
      // 48a: aload 0
      // 48b: getfield GuiPanel.i0e F
      // 48e: fsub
      // 48f: fload 8
      // 491: ldc 22.0
      // 493: nop
      // 494: fsub
      // 495: fload 9
      // 497: ldc 5.0
      // 499: nop
      // 49a: fsub
      // 49b: aload 0
      // 49c: getfield GuiPanel.i0e F
      // 49f: fsub
      // 4a0: aload 0
      // 4a1: getfield GuiPanel.jky I
      // 4a4: fconst_0
      // 4a5: invokestatic hhf.kjo (IF)I
      // 4a8: aload 0
      // 4a9: getfield GuiPanel.jky I
      // 4ac: invokevirtual GuiPanel.ps0 (FFFFII)V
      // 4af: fload 8
      // 4b1: ldc 22.0
      // 4b3: nop
      // 4b4: fsub
      // 4b5: fload 9
      // 4b7: ldc 23.0
      // 4b9: nop
      // 4ba: fsub
      // 4bb: aload 0
      // 4bc: getfield GuiPanel.i0e F
      // 4bf: fsub
      // 4c0: fload 8
      // 4c2: ldc 5.0
      // 4c4: nop
      // 4c5: fsub
      // 4c6: fload 9
      // 4c8: ldc 5.0
      // 4ca: nop
      // 4cb: fsub
      // 4cc: aload 0
      // 4cd: getfield GuiPanel.i0e F
      // 4d0: fsub
      // 4d1: aload 0
      // 4d2: getfield GuiPanel.jky I
      // 4d5: invokestatic hhf.cuu (FFFFI)V
      // 4d8: getstatic jsr.mxa Lcyb;
      // 4db: ldc "u"
      // 4dd: nop
      // 4de: fload 8
      // 4e0: ldc 18.0
      // 4e2: nop
      // 4e3: fsub
      // 4e4: fload 9
      // 4e6: ldc 18.0
      // 4e8: nop
      // 4e9: fsub
      // 4ea: aload 0
      // 4eb: getfield GuiPanel.i0e F
      // 4ee: fsub
      // 4ef: aload 0
      // 4f0: getfield GuiPanel.mom I
      // 4f3: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 4f6: pop
      // 4f7: sipush 3089
      // 4fa: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 4fd: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 500: aload 0
      // 501: getfield GuiPanel.f9q Z
      // 504: iload 7
      // 506: ifne 53e
      // 509: ifeq 5a8
      // 50c: goto 513
      // 50f: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 512: athrow
      // 513: iload 2
      // 514: i2f
      // 515: iload 3
      // 516: i2f
      // 517: fload 8
      // 519: ldc 95.0
      // 51b: nop
      // 51c: fsub
      // 51d: fload 9
      // 51f: ldc 5.0
      // 521: nop
      // 522: fsub
      // 523: aload 0
      // 524: getfield GuiPanel.i0e F
      // 527: fsub
      // 528: fload 8
      // 52a: ldc 5.0
      // 52c: nop
      // 52d: fsub
      // 52e: fload 9
      // 530: ldc 5.0
      // 532: nop
      // 533: fsub
      // 534: invokestatic hhf.md3 (FFFFFF)Z
      // 537: goto 53e
      // 53a: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53d: athrow
      // 53e: iload 7
      // 540: ifne 559
      // 543: ifeq 5a8
      // 546: goto 54d
      // 549: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54c: athrow
      // 54d: invokestatic org/lwjgl/input/Mouse.getDWheel ()I
      // 550: bipush 2
      // 551: idiv
      // 552: goto 559
      // 555: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 558: athrow
      // 559: istore 11
      // 55b: aload 0
      // 55c: dup
      // 55d: getfield GuiPanel._88 F
      // 560: iload 11
      // 562: i2f
      // 563: fadd
      // 564: putfield GuiPanel._88 F
      // 567: aload 0
      // 568: getfield GuiPanel._88 F
      // 56b: aload 0
      // 56c: getfield GuiPanel.pof F
      // 56f: fcmpg
      // 570: iload 7
      // 572: ifne 5a0
      // 575: ifgt 58e
      // 578: goto 57f
      // 57b: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57e: athrow
      // 57f: aload 0
      // 580: aload 0
      // 581: getfield GuiPanel.pof F
      // 584: putfield GuiPanel._88 F
      // 587: goto 58e
      // 58a: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58d: athrow
      // 58e: aload 0
      // 58f: iload 7
      // 591: ifne 5a4
      // 594: getfield GuiPanel._88 F
      // 597: fconst_0
      // 598: fcmpl
      // 599: goto 5a0
      // 59c: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59f: athrow
      // 5a0: iflt 5a8
      // 5a3: aload 0
      // 5a4: fconst_0
      // 5a5: putfield GuiPanel._88 F
      // 5a8: return
   }

   public void cpq(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new eka
      // 003: dup
      // 004: aload 0
      // 005: getfield GuiPanel.kkd Lc05;
      // 008: invokespecial eka.<init> (Lc05;)V
      // 00b: astore 5
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: aload 5
      // 012: invokevirtual eka.x05 ()I
      // 015: i2f
      // 016: fstore 6
      // 018: istore 4
      // 01a: aload 5
      // 01c: invokevirtual eka.lrx ()I
      // 01f: i2f
      // 020: fstore 7
      // 022: iload 1
      // 023: i2f
      // 024: iload 2
      // 025: i2f
      // 026: fload 6
      // 028: ldc 95.0
      // 02a: nop
      // 02b: fsub
      // 02c: fload 7
      // 02e: ldc 23.0
      // 030: nop
      // 031: fsub
      // 032: aload 0
      // 033: getfield GuiPanel.i0e F
      // 036: fsub
      // 037: fload 6
      // 039: ldc 5.0
      // 03b: nop
      // 03c: fsub
      // 03d: fload 7
      // 03f: ldc 5.0
      // 041: nop
      // 042: fsub
      // 043: aload 0
      // 044: getfield GuiPanel.i0e F
      // 047: fsub
      // 048: invokestatic hhf.md3 (FFFFFF)Z
      // 04b: iload 4
      // 04d: ifeq 0c6
      // 050: ifeq 0c0
      // 053: goto 05a
      // 056: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: iload 1
      // 05b: i2f
      // 05c: iload 2
      // 05d: i2f
      // 05e: fload 6
      // 060: ldc 20.0
      // 062: nop
      // 063: fsub
      // 064: fload 7
      // 066: ldc 20.0
      // 068: nop
      // 069: fsub
      // 06a: aload 0
      // 06b: getfield GuiPanel.i0e F
      // 06e: fsub
      // 06f: fload 6
      // 071: ldc 8.0
      // 073: nop
      // 074: fsub
      // 075: fload 7
      // 077: ldc 8.0
      // 079: nop
      // 07a: fsub
      // 07b: aload 0
      // 07c: getfield GuiPanel.i0e F
      // 07f: fsub
      // 080: invokestatic hhf.md3 (FFFFFF)Z
      // 083: ifeq 0a4
      // 086: goto 08d
      // 089: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield GuiPanel.kkd Lc05;
      // 091: new yod
      // 094: dup
      // 095: aload 0
      // 096: getfield GuiPanel.usm Lfkf;
      // 099: invokespecial yod.<init> (Lgbe;)V
      // 09c: invokevirtual Minecraft.z2i (Lgbe;)V
      // 09f: return
      // 0a0: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: aload 0
      // 0a6: getfield GuiPanel.f9q Z
      // 0a9: iload 4
      // 0ab: ifeq 0b9
      // 0ae: ifne 0bc
      // 0b1: goto 0b8
      // 0b4: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: bipush 1
      // 0b9: goto 0bd
      // 0bc: bipush 0
      // 0bd: putfield GuiPanel.f9q Z
      // 0c0: aload 0
      // 0c1: getfield GuiPanel.i0e F
      // 0c4: fconst_0
      // 0c5: fcmpl
      // 0c6: iload 4
      // 0c8: ifeq 100
      // 0cb: ifle 1b3
      // 0ce: goto 0d5
      // 0d1: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d4: athrow
      // 0d5: iload 1
      // 0d6: i2f
      // 0d7: iload 2
      // 0d8: i2f
      // 0d9: fload 6
      // 0db: ldc 95.0
      // 0dd: nop
      // 0de: fsub
      // 0df: fload 7
      // 0e1: ldc 5.0
      // 0e3: nop
      // 0e4: fsub
      // 0e5: aload 0
      // 0e6: getfield GuiPanel.i0e F
      // 0e9: fsub
      // 0ea: fload 6
      // 0ec: ldc 5.0
      // 0ee: nop
      // 0ef: fsub
      // 0f0: fload 7
      // 0f2: ldc 5.0
      // 0f4: nop
      // 0f5: fsub
      // 0f6: invokestatic hhf.md3 (FFFFFF)Z
      // 0f9: goto 100
      // 0fc: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: iload 4
      // 102: ifeq 11d
      // 105: ifeq 1b3
      // 108: goto 10f
      // 10b: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield GuiPanel.dye Ljava/util/concurrent/CopyOnWriteArrayList;
      // 113: invokevirtual java/util/concurrent/CopyOnWriteArrayList.size ()I
      // 116: goto 11d
      // 119: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: iload 4
      // 11f: ifeq 17a
      // 122: ifle 167
      // 125: goto 12c
      // 128: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: aload 0
      // 12d: getfield GuiPanel.dye Ljava/util/concurrent/CopyOnWriteArrayList;
      // 130: invokevirtual java/util/concurrent/CopyOnWriteArrayList.iterator ()Ljava/util/Iterator;
      // 133: astore 8
      // 135: aload 8
      // 137: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13c: ifeq 167
      // 13f: aload 8
      // 141: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 146: checkcast cqt
      // 149: astore 9
      // 14b: aload 9
      // 14d: iload 1
      // 14e: i2f
      // 14f: iload 2
      // 150: i2f
      // 151: iload 3
      // 152: i2f
      // 153: invokevirtual cqt.nvy (FFF)V
      // 156: iload 4
      // 158: ifeq 1b3
      // 15b: iload 4
      // 15d: ifne 135
      // 160: goto 167
      // 163: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: aload 0
      // 168: getfield GuiPanel.fv1 Ljava/util/concurrent/CopyOnWriteArrayList;
      // 16b: iload 4
      // 16d: ifeq 188
      // 170: invokevirtual java/util/concurrent/CopyOnWriteArrayList.size ()I
      // 173: goto 17a
      // 176: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: ifle 1b3
      // 17d: aload 0
      // 17e: getfield GuiPanel.fv1 Ljava/util/concurrent/CopyOnWriteArrayList;
      // 181: goto 188
      // 184: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: invokevirtual java/util/concurrent/CopyOnWriteArrayList.iterator ()Ljava/util/Iterator;
      // 18b: astore 8
      // 18d: aload 8
      // 18f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 194: ifeq 1b3
      // 197: aload 8
      // 199: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19e: checkcast cqt
      // 1a1: astore 9
      // 1a3: aload 9
      // 1a5: iload 1
      // 1a6: i2f
      // 1a7: iload 2
      // 1a8: i2f
      // 1a9: iload 3
      // 1aa: i2f
      // 1ab: invokevirtual cqt.nvy (FFF)V
      // 1ae: iload 4
      // 1b0: ifne 18d
      // 1b3: return
   }

   public void _ql() {
      int var1 = OpaquePredicate.b();

      for (cqt var3 : this.dye) {
         try {
            var3.ylh = false;
            if (var1 != 0 && var1 != 0) {
               continue;
            }
            break;
         } catch (oov var4) {
            throw a(var4);
         }
      }

      for (cqt var5 : this.fv1) {
         var5.ylh = false;
         if (var1 == 0) {
            break;
         }
      }
   }

   public void rup() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic GuiPanel.a J
      // 003: ldc2_w 30470160251739
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield GuiPanel.dye Ljava/util/concurrent/CopyOnWriteArrayList;
      // 010: iload 3
      // 011: ifeq 032
      // 014: invokevirtual java/util/concurrent/CopyOnWriteArrayList.isEmpty ()Z
      // 017: ifne 02f
      // 01a: goto 021
      // 01d: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: aload 0
      // 022: getfield GuiPanel.dye Ljava/util/concurrent/CopyOnWriteArrayList;
      // 025: invokevirtual java/util/concurrent/CopyOnWriteArrayList.clear ()V
      // 028: goto 02f
      // 02b: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: invokestatic b4o.zq1 ()Ljava/util/List;
      // 032: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 037: astore 4
      // 039: aload 4
      // 03b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 040: ifeq 087
      // 043: aload 4
      // 045: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04a: checkcast hrs
      // 04d: astore 5
      // 04f: aload 0
      // 050: getfield GuiPanel.dye Ljava/util/concurrent/CopyOnWriteArrayList;
      // 053: new cqt
      // 056: dup
      // 057: aload 0
      // 058: aload 5
      // 05a: invokevirtual hrs.thb ()Ljava/lang/String;
      // 05d: ldc "#"
      // 05f: nop
      // 060: ldc ""
      // 062: nop
      // 063: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 066: aload 5
      // 068: invokevirtual hrs.thb ()Ljava/lang/String;
      // 06b: ldc "#"
      // 06d: nop
      // 06e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 071: invokespecial cqt.<init> (Lers;Ljava/lang/String;Z)V
      // 074: invokevirtual java/util/concurrent/CopyOnWriteArrayList.add (Ljava/lang/Object;)Z
      // 077: pop
      // 078: iload 3
      // 079: ifeq 0c8
      // 07c: iload 3
      // 07d: ifne 039
      // 080: goto 087
      // 083: invokestatic GuiPanel.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 0
      // 088: new java/io/File
      // 08b: dup
      // 08c: aload 0
      // 08d: getfield GuiPanel.kkd Lc05;
      // 090: getfield Minecraft.glh Ljava/io/File;
      // 093: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 096: sipush 9171
      // 099: ldc2_w 6724508551124157943
      // 09c: lload 1
      // 09d: lxor
      // 09e: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: nop
      // 0a4: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0a9: sipush 18644
      // 0ac: ldc2_w 7851373067908902644
      // 0af: lload 1
      // 0b0: lxor
      // 0b1: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: nop
      // 0b7: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0bc: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0bf: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0c2: invokestatic org/apache/commons/io/FileUtils.readFileToString (Ljava/io/File;)Ljava/lang/String;
      // 0c5: putfield GuiPanel.gn0 Ljava/lang/String;
      // 0c8: goto 12b
      // 0cb: astore 4
      // 0cd: new java/io/File
      // 0d0: dup
      // 0d1: aload 0
      // 0d2: getfield GuiPanel.kkd Lc05;
      // 0d5: getfield Minecraft.glh Ljava/io/File;
      // 0d8: invokevirtual java/io/File.toPath ()Ljava/nio/file/Path;
      // 0db: sipush 9171
      // 0de: ldc2_w 6724508551124157943
      // 0e1: lload 1
      // 0e2: lxor
      // 0e3: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: nop
      // 0e9: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 0ee: sipush 18644
      // 0f1: ldc2_w 7851373067908902644
      // 0f4: lload 1
      // 0f5: lxor
      // 0f6: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: nop
      // 0fc: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 101: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 104: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 107: sipush 29463
      // 10a: ldc2_w 56670068988073265
      // 10d: lload 1
      // 10e: lxor
      // 10f: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: nop
      // 115: sipush 19861
      // 118: ldc2_w 4959433640085810110
      // 11b: lload 1
      // 11c: lxor
      // 11d: invokedynamic i (IJ)Ljava/lang/String; bsm=GuiPanel.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: nop
      // 123: invokestatic org/apache/commons/io/FileUtils.write (Ljava/io/File;Ljava/lang/CharSequence;Ljava/lang/String;)V
      // 126: goto 12b
      // 129: astore 5
      // 12b: return
   }

   public void car(String var1) {
      long var2 = a ^ 66375919086231L;
      this.gn0 = var1;

      try {
         FileUtils.write(
            new File(
               String.valueOf(this.kkd.glh.toPath().resolve(a<"i">(29718, 735193377657652216L ^ var2)).resolve(a<"i">(15416, 5420321248964266965L ^ var2)))
            ),
            var1,
            a<"i">(27045, 4556639731988274764L ^ var2)
         );
      } catch (Exception var5) {
      }

      b4o.c1p(var1);
      this.rup();
   }

   public void thf(String var1) {
      b4o.xim(var1);
      this.rup();
   }

   public void ps0(float var1, float var2, float var3, float var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var5 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var6 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      jom var15 = jom.yut();
      q3g var16 = var15.zuq();
      var16.ezr(7, gnl.gec);
      var16.g5o((double)var3, (double)var2, 0.0).gs4(var12, var13, var14, var11).pzw();
      var16.g5o((double)var1, (double)var2, 0.0).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var4, 0.0).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var3, (double)var4, 0.0).gs4(var12, var13, var14, var11).pzw();
      jom.yut().q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   public void vp5(float var1, float var2, float var3, float var4, int var5, int var6) {
      float var7 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var9 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var10 = (float)(var5 & 0xFF) / 255.0F;
      float var11 = (float)(var6 >> 24 & 0xFF) / 255.0F;
      float var12 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var13 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var14 = (float)(var6 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      jom var15 = jom.yut();
      q3g var16 = var15.zuq();
      var16.ezr(7, gnl.gec);
      var16.g5o((double)var3, (double)var2, 0.0).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var2, 0.0).gs4(var8, var9, var10, var7).pzw();
      var16.g5o((double)var1, (double)var4, 0.0).gs4(var12, var13, var14, var11).pzw();
      var16.g5o((double)var3, (double)var4, 0.0).gs4(var12, var13, var14, var11).pzw();
      var15.q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3376280237838403334L, 4578019059929299542L, MethodHandles.lookup().lookupClass()).a(77947740608750L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 28231314352771L;
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
      String var6 = "h\u009f¤ªÿ\\hux©sèÊ\u0086\u0004\u0010\u00104{aL[/Ýi²ÞC\u0004ÀùH`\u0018mÓ]u\u0012¦ìÅ²UÔ}ír\u0017,tR\bn¯\r\r\u0003\u0018\u0096¤æ;È¨#\u001fN\u0001\u0096½ ¿æ\u0093(ù§>\u009eÇ°\u0081\u0010\u001ccN\u0089bÂ3\u000eðV_\u0081\u0005@§(\u0010ÆÅÎ/\u0094V\u000bâ\u0007¸ã\u0085=\u00830¶\u0010#T\rö\fkÒ\u008c\u0093ýùC;H¦Å\u0010xÍJqvÛXÍ\u000f¤\u008fs!-\u0098ÿ";
      int var8 = "h\u009f¤ªÿ\\hux©sèÊ\u0086\u0004\u0010\u00104{aL[/Ýi²ÞC\u0004ÀùH`\u0018mÓ]u\u0012¦ìÅ²UÔ}ír\u0017,tR\bn¯\r\r\u0003\u0018\u0096¤æ;È¨#\u001fN\u0001\u0096½ ¿æ\u0093(ù§>\u009eÇ°\u0081\u0010\u001ccN\u0089bÂ3\u000eðV_\u0081\u0005@§(\u0010ÆÅÎ/\u0094V\u000bâ\u0007¸ã\u0085=\u00830¶\u0010#T\rö\fkÒ\u008c\u0093ýùC;H¦Å\u0010xÍJqvÛXÍ\u000f¤\u008fs!-\u0098ÿ"
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
                     c = new String[10];
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

                  var6 = "Ú;ïu0\u0087IJDÔzñ¡\u008b\\É\u0010\u0011\u009du0Ñ\u0004> }>\u0099æ\u0007sÏ\u0092";
                  var8 = "Ú;ïu0\u0087IJDÔzñ¡\u008b\\É\u0010\u0011\u009du0Ñ\u0004> }>\u0099æ\u0007sÏ\u0092".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27485;
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
            throw new RuntimeException("GuiPanel", var10);
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
         throw new RuntimeException("GuiPanel" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
