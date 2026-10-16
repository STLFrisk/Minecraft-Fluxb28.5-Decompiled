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
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus$v78;

public class np1 extends ShaderHelper implements yxa {
   private static final int t2c;
   private static final int yzg;
   private static final int dyt;
   private static final int fra;
   private static final gdz o7d;
   public ShaderHelper y87;
   public int t5u = 256;
   public int qo5 = 202;
   public int wqb;
   public int shh;
   public float pb_ = 1.0F;
   public double cxc;
   public double j82;
   public double db_;
   public double xjj;
   public double vd7;
   public double jb4;
   private int jx0;
   private ik0 lb4;
   private boolean pnz = true;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public np1(ShaderHelper var1, ik0 var2) {
      this.y87 = var1;
      this.lb4 = var2;
      short var3 = 141;
      short var4 = 141;
      this.cxc = this.db_ = this.vd7 = (double)(y8d.j5f.orx * 24 - var3 / 2 - 12);
      this.j82 = this.xjj = this.jb4 = (double)(y8d.j5f.e8s * 24 - var4 / 2);
   }

   @Override
   public void initGui() {
      long var1 = a ^ 107000781441570L;
      this.f41.c02().sxi(new C16PacketClientStatus(C16PacketClientStatus$v78.gfl));
      this.khf.clear();
      this.khf.add(new cm_(1, this.dt7 / 2 + 24, this.o1e / 2 + 74, 80, 20, fc1.gx1(b<"r">(8347, 7498853825867134388L ^ var1), new Object[0])));
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield np1.pnz Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifne 37
      // 0f: goto 16
      // 12: invokestatic np1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic np1.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: if_icmpne 37
      // 25: aload 0
      // 26: getfield np1.f41 Lc05;
      // 29: aload 0
      // 2a: getfield np1.y87 Lgbe;
      // 2d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 30: goto 37
      // 33: invokestatic np1.a (Loov;)Loov;
      // 36: athrow
      // 37: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: aload 0
      // 06: getfield np1.f41 Lc05;
      // 09: getfield Minecraft.oxn Lmoh;
      // 0c: getfield moh.iaz Lm7l;
      // 0f: invokevirtual m7l.xbs ()I
      // 12: if_icmpne 32
      // 15: aload 0
      // 16: getfield np1.f41 Lc05;
      // 19: aconst_null
      // 1a: checkcast ShaderHelper
      // 1d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 20: aload 0
      // 21: getfield np1.f41 Lc05;
      // 24: invokevirtual Minecraft.aa4 ()V
      // 27: iload 3
      // 28: ifeq 3f
      // 2b: goto 32
      // 2e: invokestatic np1.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: iload 1
      // 34: iload 2
      // 35: invokespecial ShaderHelper.dig (CI)V
      // 38: goto 3f
      // 3b: invokestatic np1.a (Loov;)Loov;
      // 3e: athrow
      // 3f: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic np1.a J
      // 003: ldc2_w 133089524011293
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: aload 0
      // 00f: getfield np1.pnz Z
      // 012: iload 6
      // 014: ifne 09c
      // 017: ifeq 091
      // 01a: goto 021
      // 01d: invokestatic np1.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: invokevirtual np1.xmz ()V
      // 025: aload 0
      // 026: aload 0
      // 027: getfield np1.fex Lowt;
      // 02a: sipush 4936
      // 02d: ldc2_w 5250563566096637274
      // 030: lload 4
      // 032: lxor
      // 033: invokedynamic r (IJ)Ljava/lang/String; bsm=np1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: nop
      // 039: bipush 0
      // 03a: anewarray 156
      // 03d: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 040: aload 0
      // 041: getfield np1.dt7 I
      // 044: bipush 2
      // 045: idiv
      // 046: aload 0
      // 047: getfield np1.o1e I
      // 04a: bipush 2
      // 04b: idiv
      // 04c: ldc 16777215
      // 04e: nop
      // 04f: invokevirtual np1.poi (Lowt;Ljava/lang/String;III)V
      // 052: aload 0
      // 053: aload 0
      // 054: getfield np1.fex Lowt;
      // 057: getstatic np1.x8o [Ljava/lang/String;
      // 05a: invokestatic Minecraft.qgs ()J
      // 05d: ldc2_w 150
      // 060: ldiv
      // 061: getstatic np1.x8o [Ljava/lang/String;
      // 064: arraylength
      // 065: i2l
      // 066: lrem
      // 067: l2i
      // 068: aaload
      // 069: aload 0
      // 06a: getfield np1.dt7 I
      // 06d: bipush 2
      // 06e: idiv
      // 06f: aload 0
      // 070: getfield np1.o1e I
      // 073: bipush 2
      // 074: idiv
      // 075: aload 0
      // 076: getfield np1.fex Lowt;
      // 079: getfield owt.rr7 I
      // 07c: bipush 2
      // 07d: imul
      // 07e: iadd
      // 07f: ldc 16777215
      // 081: nop
      // 082: invokevirtual np1.poi (Lowt;Ljava/lang/String;III)V
      // 085: iload 6
      // 087: ifeq 3b2
      // 08a: goto 091
      // 08d: invokestatic np1.a (Loov;)Loov;
      // 090: athrow
      // 091: bipush 0
      // 092: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 095: goto 09c
      // 098: invokestatic np1.a (Loov;)Loov;
      // 09b: athrow
      // 09c: iload 6
      // 09e: ifne 0bd
      // 0a1: ifeq 1f4
      // 0a4: goto 0ab
      // 0a7: invokestatic np1.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: getfield np1.dt7 I
      // 0af: aload 0
      // 0b0: getfield np1.t5u I
      // 0b3: isub
      // 0b4: bipush 2
      // 0b5: idiv
      // 0b6: goto 0bd
      // 0b9: invokestatic np1.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: istore 7
      // 0bf: aload 0
      // 0c0: getfield np1.o1e I
      // 0c3: aload 0
      // 0c4: getfield np1.qo5 I
      // 0c7: isub
      // 0c8: bipush 2
      // 0c9: idiv
      // 0ca: istore 8
      // 0cc: iload 7
      // 0ce: bipush 8
      // 0d0: iadd
      // 0d1: istore 9
      // 0d3: iload 8
      // 0d5: bipush 17
      // 0d7: iadd
      // 0d8: istore 10
      // 0da: aload 0
      // 0db: getfield np1.jx0 I
      // 0de: iload 6
      // 0e0: ifne 109
      // 0e3: ifeq 108
      // 0e6: goto 0ed
      // 0e9: invokestatic np1.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield np1.jx0 I
      // 0f1: bipush 1
      // 0f2: iload 6
      // 0f4: ifne 10b
      // 0f7: goto 0fe
      // 0fa: invokestatic np1.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: if_icmpne 1ef
      // 101: goto 108
      // 104: invokestatic np1.a (Loov;)Loov;
      // 107: athrow
      // 108: iload 1
      // 109: iload 9
      // 10b: iload 6
      // 10d: ifne 128
      // 110: if_icmplt 1ef
      // 113: goto 11a
      // 116: invokestatic np1.a (Loov;)Loov;
      // 119: athrow
      // 11a: iload 1
      // 11b: iload 9
      // 11d: sipush 224
      // 120: iadd
      // 121: goto 128
      // 124: invokestatic np1.a (Loov;)Loov;
      // 127: athrow
      // 128: iload 6
      // 12a: ifne 141
      // 12d: if_icmpge 1ef
      // 130: goto 137
      // 133: invokestatic np1.a (Loov;)Loov;
      // 136: athrow
      // 137: iload 2
      // 138: iload 10
      // 13a: goto 141
      // 13d: invokestatic np1.a (Loov;)Loov;
      // 140: athrow
      // 141: iload 6
      // 143: ifne 16a
      // 146: if_icmplt 1ef
      // 149: goto 150
      // 14c: invokestatic np1.a (Loov;)Loov;
      // 14f: athrow
      // 150: iload 2
      // 151: iload 6
      // 153: ifne 184
      // 156: goto 15d
      // 159: invokestatic np1.a (Loov;)Loov;
      // 15c: athrow
      // 15d: iload 10
      // 15f: sipush 155
      // 162: iadd
      // 163: goto 16a
      // 166: invokestatic np1.a (Loov;)Loov;
      // 169: athrow
      // 16a: if_icmpge 1ef
      // 16d: aload 0
      // 16e: iload 6
      // 170: ifne 1d9
      // 173: goto 17a
      // 176: invokestatic np1.a (Loov;)Loov;
      // 179: athrow
      // 17a: getfield np1.jx0 I
      // 17d: goto 184
      // 180: invokestatic np1.a (Loov;)Loov;
      // 183: athrow
      // 184: ifne 198
      // 187: aload 0
      // 188: bipush 1
      // 189: putfield np1.jx0 I
      // 18c: iload 6
      // 18e: ifeq 1e5
      // 191: goto 198
      // 194: invokestatic np1.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: dup
      // 19a: getfield np1.db_ D
      // 19d: iload 1
      // 19e: aload 0
      // 19f: getfield np1.wqb I
      // 1a2: isub
      // 1a3: i2f
      // 1a4: aload 0
      // 1a5: getfield np1.pb_ F
      // 1a8: fmul
      // 1a9: f2d
      // 1aa: dsub
      // 1ab: putfield np1.db_ D
      // 1ae: aload 0
      // 1af: dup
      // 1b0: getfield np1.xjj D
      // 1b3: iload 2
      // 1b4: aload 0
      // 1b5: getfield np1.shh I
      // 1b8: isub
      // 1b9: i2f
      // 1ba: aload 0
      // 1bb: getfield np1.pb_ F
      // 1be: fmul
      // 1bf: f2d
      // 1c0: dsub
      // 1c1: putfield np1.xjj D
      // 1c4: aload 0
      // 1c5: aload 0
      // 1c6: aload 0
      // 1c7: getfield np1.db_ D
      // 1ca: dup2_x1
      // 1cb: putfield np1.cxc D
      // 1ce: putfield np1.vd7 D
      // 1d1: aload 0
      // 1d2: goto 1d9
      // 1d5: invokestatic np1.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: aload 0
      // 1db: getfield np1.xjj D
      // 1de: dup2_x1
      // 1df: putfield np1.j82 D
      // 1e2: putfield np1.jb4 D
      // 1e5: aload 0
      // 1e6: iload 1
      // 1e7: putfield np1.wqb I
      // 1ea: aload 0
      // 1eb: iload 2
      // 1ec: putfield np1.shh I
      // 1ef: iload 6
      // 1f1: ifeq 200
      // 1f4: aload 0
      // 1f5: bipush 0
      // 1f6: putfield np1.jx0 I
      // 1f9: goto 200
      // 1fc: invokestatic np1.a (Loov;)Loov;
      // 1ff: athrow
      // 200: invokestatic org/lwjgl/input/Mouse.getDWheel ()I
      // 203: istore 7
      // 205: aload 0
      // 206: getfield np1.pb_ F
      // 209: fstore 8
      // 20b: iload 7
      // 20d: iload 6
      // 20f: ifne 23d
      // 212: ifge 234
      // 215: goto 21c
      // 218: invokestatic np1.a (Loov;)Loov;
      // 21b: athrow
      // 21c: aload 0
      // 21d: dup
      // 21e: getfield np1.pb_ F
      // 221: ldc 0.25
      // 223: nop
      // 224: fadd
      // 225: putfield np1.pb_ F
      // 228: iload 6
      // 22a: ifeq 25f
      // 22d: goto 234
      // 230: invokestatic np1.a (Loov;)Loov;
      // 233: athrow
      // 234: iload 7
      // 236: goto 23d
      // 239: invokestatic np1.a (Loov;)Loov;
      // 23c: athrow
      // 23d: iload 6
      // 23f: ifne 273
      // 242: ifle 25f
      // 245: goto 24c
      // 248: invokestatic np1.a (Loov;)Loov;
      // 24b: athrow
      // 24c: aload 0
      // 24d: dup
      // 24e: getfield np1.pb_ F
      // 251: ldc 0.25
      // 253: nop
      // 254: fsub
      // 255: putfield np1.pb_ F
      // 258: goto 25f
      // 25b: invokestatic np1.a (Loov;)Loov;
      // 25e: athrow
      // 25f: aload 0
      // 260: aload 0
      // 261: getfield np1.pb_ F
      // 264: fconst_1
      // 265: fconst_2
      // 266: invokestatic fe6._f3 (FFF)F
      // 269: putfield np1.pb_ F
      // 26c: aload 0
      // 26d: getfield np1.pb_ F
      // 270: fload 8
      // 272: fcmpl
      // 273: iload 6
      // 275: ifne 300
      // 278: ifeq 2f7
      // 27b: goto 282
      // 27e: invokestatic np1.a (Loov;)Loov;
      // 281: athrow
      // 282: fload 8
      // 284: aload 0
      // 285: getfield np1.pb_ F
      // 288: fsub
      // 289: fstore 9
      // 28b: fload 8
      // 28d: aload 0
      // 28e: getfield np1.t5u I
      // 291: i2f
      // 292: fmul
      // 293: fstore 10
      // 295: fload 8
      // 297: aload 0
      // 298: getfield np1.qo5 I
      // 29b: i2f
      // 29c: fmul
      // 29d: fstore 11
      // 29f: aload 0
      // 2a0: getfield np1.pb_ F
      // 2a3: aload 0
      // 2a4: getfield np1.t5u I
      // 2a7: i2f
      // 2a8: fmul
      // 2a9: fstore 12
      // 2ab: aload 0
      // 2ac: getfield np1.pb_ F
      // 2af: aload 0
      // 2b0: getfield np1.qo5 I
      // 2b3: i2f
      // 2b4: fmul
      // 2b5: fstore 13
      // 2b7: aload 0
      // 2b8: dup
      // 2b9: getfield np1.db_ D
      // 2bc: fload 12
      // 2be: fload 10
      // 2c0: fsub
      // 2c1: ldc 0.5
      // 2c3: nop
      // 2c4: fmul
      // 2c5: f2d
      // 2c6: dsub
      // 2c7: putfield np1.db_ D
      // 2ca: aload 0
      // 2cb: dup
      // 2cc: getfield np1.xjj D
      // 2cf: fload 13
      // 2d1: fload 11
      // 2d3: fsub
      // 2d4: ldc 0.5
      // 2d6: nop
      // 2d7: fmul
      // 2d8: f2d
      // 2d9: dsub
      // 2da: putfield np1.xjj D
      // 2dd: aload 0
      // 2de: aload 0
      // 2df: aload 0
      // 2e0: getfield np1.db_ D
      // 2e3: dup2_x1
      // 2e4: putfield np1.cxc D
      // 2e7: putfield np1.vd7 D
      // 2ea: aload 0
      // 2eb: aload 0
      // 2ec: aload 0
      // 2ed: getfield np1.xjj D
      // 2f0: dup2_x1
      // 2f1: putfield np1.j82 D
      // 2f4: putfield np1.jb4 D
      // 2f7: aload 0
      // 2f8: getfield np1.vd7 D
      // 2fb: getstatic np1.t2c I
      // 2fe: i2d
      // 2ff: dcmpg
      // 300: iload 6
      // 302: ifne 327
      // 305: ifge 31e
      // 308: goto 30f
      // 30b: invokestatic np1.a (Loov;)Loov;
      // 30e: athrow
      // 30f: aload 0
      // 310: getstatic np1.t2c I
      // 313: i2d
      // 314: putfield np1.vd7 D
      // 317: goto 31e
      // 31a: invokestatic np1.a (Loov;)Loov;
      // 31d: athrow
      // 31e: aload 0
      // 31f: getfield np1.jb4 D
      // 322: getstatic np1.yzg I
      // 325: i2d
      // 326: dcmpg
      // 327: iload 6
      // 329: ifne 34e
      // 32c: ifge 345
      // 32f: goto 336
      // 332: invokestatic np1.a (Loov;)Loov;
      // 335: athrow
      // 336: aload 0
      // 337: getstatic np1.yzg I
      // 33a: i2d
      // 33b: putfield np1.jb4 D
      // 33e: goto 345
      // 341: invokestatic np1.a (Loov;)Loov;
      // 344: athrow
      // 345: aload 0
      // 346: getfield np1.vd7 D
      // 349: getstatic np1.dyt I
      // 34c: i2d
      // 34d: dcmpl
      // 34e: iload 6
      // 350: ifne 383
      // 353: iflt 36e
      // 356: goto 35d
      // 359: invokestatic np1.a (Loov;)Loov;
      // 35c: athrow
      // 35d: aload 0
      // 35e: getstatic np1.dyt I
      // 361: bipush 1
      // 362: isub
      // 363: i2d
      // 364: putfield np1.vd7 D
      // 367: goto 36e
      // 36a: invokestatic np1.a (Loov;)Loov;
      // 36d: athrow
      // 36e: aload 0
      // 36f: iload 6
      // 371: ifne 3a9
      // 374: getfield np1.jb4 D
      // 377: getstatic np1.fra I
      // 37a: i2d
      // 37b: dcmpl
      // 37c: goto 383
      // 37f: invokestatic np1.a (Loov;)Loov;
      // 382: athrow
      // 383: iflt 397
      // 386: aload 0
      // 387: getstatic np1.fra I
      // 38a: bipush 1
      // 38b: isub
      // 38c: i2d
      // 38d: putfield np1.jb4 D
      // 390: goto 397
      // 393: invokestatic np1.a (Loov;)Loov;
      // 396: athrow
      // 397: aload 0
      // 398: invokevirtual np1.xmz ()V
      // 39b: aload 0
      // 39c: iload 1
      // 39d: iload 2
      // 39e: fload 3
      // 39f: invokevirtual np1.ua3 (IIF)V
      // 3a2: invokestatic hzu.fpt ()V
      // 3a5: invokestatic hzu._o4 ()V
      // 3a8: aload 0
      // 3a9: invokevirtual np1.pbd ()V
      // 3ac: invokestatic hzu.s7q ()V
      // 3af: invokestatic hzu.m45 ()V
      // 3b2: return
   }

   @Override
   public void fyj() {
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
      // 06: ifne 1e
      // 09: getfield np1.pnz Z
      // 0c: ifeq 22
      // 0f: goto 16
      // 12: invokestatic np1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic np1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: putfield np1.pnz Z
      // 22: return
   }

   @Override
   public void updateScreen() {
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
      // 06: ifeq 2e
      // 09: getfield np1.pnz Z
      // 0c: ifne a1
      // 0f: goto 16
      // 12: invokestatic np1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield np1.db_ D
      // 1b: putfield np1.cxc D
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield np1.xjj D
      // 23: putfield np1.j82 D
      // 26: aload 0
      // 27: goto 2e
      // 2a: invokestatic np1.a (Loov;)Loov;
      // 2d: athrow
      // 2e: getfield np1.vd7 D
      // 31: aload 0
      // 32: getfield np1.db_ D
      // 35: dsub
      // 36: dstore 2
      // 37: aload 0
      // 38: getfield np1.jb4 D
      // 3b: aload 0
      // 3c: getfield np1.xjj D
      // 3f: dsub
      // 40: dstore 4
      // 42: iload 1
      // 43: ifeq 92
      // 46: dload 2
      // 47: dload 2
      // 48: dmul
      // 49: dload 4
      // 4b: dload 4
      // 4d: dmul
      // 4e: dadd
      // 4f: ldc2_w 4.0
      // 52: dcmpg
      // 53: ifge 7d
      // 56: goto 5d
      // 59: invokestatic np1.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: dup
      // 5f: getfield np1.db_ D
      // 62: dload 2
      // 63: dadd
      // 64: putfield np1.db_ D
      // 67: aload 0
      // 68: dup
      // 69: getfield np1.xjj D
      // 6c: dload 4
      // 6e: dadd
      // 6f: putfield np1.xjj D
      // 72: iload 1
      // 73: ifne a1
      // 76: goto 7d
      // 79: invokestatic np1.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: dup
      // 7f: getfield np1.db_ D
      // 82: dload 2
      // 83: ldc2_w 0.85
      // 86: dmul
      // 87: dadd
      // 88: putfield np1.db_ D
      // 8b: goto 92
      // 8e: invokestatic np1.a (Loov;)Loov;
      // 91: athrow
      // 92: aload 0
      // 93: dup
      // 94: getfield np1.xjj D
      // 97: dload 4
      // 99: ldc2_w 0.85
      // 9c: dmul
      // 9d: dadd
      // 9e: putfield np1.xjj D
      // a1: return
   }

   public void pbd() {
      long var1 = a ^ 55607797440496L;
      int var3 = (this.dt7 - this.t5u) / 2;
      int var4 = (this.o1e - this.qo5) / 2;
      this.fex.eh6(fc1.gx1(b<"r">(32085, 6619515832074419629L ^ var1), new Object[0]), (float)(var3 + 15), (float)(var4 + 5), 4210752);
   }

   public void ua3(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic np1.a J
      // 003: ldc2_w 13002858577517
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: getfield np1.cxc D
      // 00d: aload 0
      // 00e: getfield np1.db_ D
      // 011: aload 0
      // 012: getfield np1.cxc D
      // 015: dsub
      // 016: fload 3
      // 017: f2d
      // 018: dmul
      // 019: dadd
      // 01a: invokestatic fe6.jqf (D)I
      // 01d: istore 7
      // 01f: invokestatic OpaquePredicate.c ()I
      // 022: aload 0
      // 023: getfield np1.j82 D
      // 026: aload 0
      // 027: getfield np1.xjj D
      // 02a: aload 0
      // 02b: getfield np1.j82 D
      // 02e: dsub
      // 02f: fload 3
      // 030: f2d
      // 031: dmul
      // 032: dadd
      // 033: invokestatic fe6.jqf (D)I
      // 036: istore 8
      // 038: istore 6
      // 03a: iload 7
      // 03c: getstatic np1.t2c I
      // 03f: iload 6
      // 041: ifne 058
      // 044: if_icmpge 053
      // 047: goto 04e
      // 04a: invokestatic np1.a (Loov;)Loov;
      // 04d: athrow
      // 04e: getstatic np1.t2c I
      // 051: istore 7
      // 053: iload 8
      // 055: getstatic np1.yzg I
      // 058: iload 6
      // 05a: ifne 071
      // 05d: if_icmpge 06c
      // 060: goto 067
      // 063: invokestatic np1.a (Loov;)Loov;
      // 066: athrow
      // 067: getstatic np1.yzg I
      // 06a: istore 8
      // 06c: iload 7
      // 06e: getstatic np1.dyt I
      // 071: iload 6
      // 073: ifne 08c
      // 076: if_icmplt 087
      // 079: goto 080
      // 07c: invokestatic np1.a (Loov;)Loov;
      // 07f: athrow
      // 080: getstatic np1.dyt I
      // 083: bipush 1
      // 084: isub
      // 085: istore 7
      // 087: iload 8
      // 089: getstatic np1.fra I
      // 08c: iload 6
      // 08e: ifne 0ac
      // 091: if_icmplt 0a2
      // 094: goto 09b
      // 097: invokestatic np1.a (Loov;)Loov;
      // 09a: athrow
      // 09b: getstatic np1.fra I
      // 09e: bipush 1
      // 09f: isub
      // 0a0: istore 8
      // 0a2: aload 0
      // 0a3: getfield np1.dt7 I
      // 0a6: aload 0
      // 0a7: getfield np1.t5u I
      // 0aa: isub
      // 0ab: bipush 2
      // 0ac: idiv
      // 0ad: istore 9
      // 0af: aload 0
      // 0b0: getfield np1.o1e I
      // 0b3: aload 0
      // 0b4: getfield np1.qo5 I
      // 0b7: isub
      // 0b8: bipush 2
      // 0b9: idiv
      // 0ba: istore 10
      // 0bc: iload 9
      // 0be: bipush 16
      // 0c0: iadd
      // 0c1: istore 11
      // 0c3: iload 10
      // 0c5: bipush 17
      // 0c7: iadd
      // 0c8: istore 12
      // 0ca: aload 0
      // 0cb: fconst_0
      // 0cc: putfield np1.o3s F
      // 0cf: sipush 518
      // 0d2: invokestatic hzu.d14 (I)V
      // 0d5: invokestatic hzu.dp2 ()V
      // 0d8: iload 11
      // 0da: i2f
      // 0db: iload 12
      // 0dd: i2f
      // 0de: ldc -200.0
      // 0e0: nop
      // 0e1: invokestatic hzu.a4k (FFF)V
      // 0e4: fconst_1
      // 0e5: aload 0
      // 0e6: getfield np1.pb_ F
      // 0e9: fdiv
      // 0ea: fconst_1
      // 0eb: aload 0
      // 0ec: getfield np1.pb_ F
      // 0ef: fdiv
      // 0f0: fconst_0
      // 0f1: invokestatic hzu.syc (FFF)V
      // 0f4: invokestatic hzu.rqj ()V
      // 0f7: invokestatic hzu.fpt ()V
      // 0fa: invokestatic hzu.ixc ()V
      // 0fd: invokestatic hzu.avm ()V
      // 100: iload 7
      // 102: sipush 288
      // 105: iadd
      // 106: bipush 4
      // 107: ishr
      // 108: istore 13
      // 10a: iload 8
      // 10c: sipush 288
      // 10f: iadd
      // 110: bipush 4
      // 111: ishr
      // 112: istore 14
      // 114: iload 7
      // 116: sipush 288
      // 119: iadd
      // 11a: bipush 16
      // 11c: irem
      // 11d: istore 15
      // 11f: iload 8
      // 121: sipush 288
      // 124: iadd
      // 125: bipush 16
      // 127: irem
      // 128: istore 16
      // 12a: bipush 4
      // 12b: istore 17
      // 12d: bipush 8
      // 12f: istore 18
      // 131: bipush 10
      // 133: istore 19
      // 135: bipush 22
      // 137: istore 20
      // 139: bipush 37
      // 13b: istore 21
      // 13d: new java/util/Random
      // 140: dup
      // 141: invokespecial java/util/Random.<init> ()V
      // 144: astore 22
      // 146: ldc 16.0
      // 148: nop
      // 149: aload 0
      // 14a: getfield np1.pb_ F
      // 14d: fdiv
      // 14e: fstore 23
      // 150: ldc 16.0
      // 152: nop
      // 153: aload 0
      // 154: getfield np1.pb_ F
      // 157: fdiv
      // 158: fstore 24
      // 15a: bipush 0
      // 15b: istore 25
      // 15d: iload 25
      // 15f: i2f
      // 160: fload 23
      // 162: fmul
      // 163: iload 16
      // 165: i2f
      // 166: fsub
      // 167: ldc 155.0
      // 169: nop
      // 16a: fcmpg
      // 16b: ifge 33d
      // 16e: ldc 0.6
      // 170: nop
      // 171: iload 14
      // 173: iload 25
      // 175: iadd
      // 176: i2f
      // 177: ldc 25.0
      // 179: nop
      // 17a: fdiv
      // 17b: ldc 0.3
      // 17d: nop
      // 17e: fmul
      // 17f: fsub
      // 180: fstore 26
      // 182: fload 26
      // 184: fload 26
      // 186: fload 26
      // 188: fconst_1
      // 189: invokestatic hzu.wn0 (FFFF)V
      // 18c: bipush 0
      // 18d: iload 6
      // 18f: ifne 354
      // 192: istore 27
      // 194: iload 27
      // 196: i2f
      // 197: fload 24
      // 199: fmul
      // 19a: iload 15
      // 19c: i2f
      // 19d: fsub
      // 19e: ldc 224.0
      // 1a0: nop
      // 1a1: fcmpg
      // 1a2: ifge 335
      // 1a5: aload 22
      // 1a7: aload 0
      // 1a8: getfield np1.f41 Lc05;
      // 1ab: invokevirtual Minecraft.ee0 ()Lrh0;
      // 1ae: invokevirtual rh0.ysa ()Ljava/lang/String;
      // 1b1: invokevirtual java/lang/String.hashCode ()I
      // 1b4: iload 13
      // 1b6: iadd
      // 1b7: iload 27
      // 1b9: iadd
      // 1ba: iload 14
      // 1bc: iload 25
      // 1be: iadd
      // 1bf: bipush 16
      // 1c1: imul
      // 1c2: iadd
      // 1c3: i2l
      // 1c4: invokevirtual java/util/Random.setSeed (J)V
      // 1c7: aload 22
      // 1c9: bipush 1
      // 1ca: iload 14
      // 1cc: iadd
      // 1cd: iload 25
      // 1cf: iadd
      // 1d0: invokevirtual java/util/Random.nextInt (I)I
      // 1d3: iload 14
      // 1d5: iload 25
      // 1d7: iadd
      // 1d8: bipush 2
      // 1d9: idiv
      // 1da: iadd
      // 1db: istore 28
      // 1dd: aload 0
      // 1de: getstatic ox_.vd0 Lpmc;
      // 1e1: invokespecial np1.yw6 (Le0x;)Lsla;
      // 1e4: astore 29
      // 1e6: iload 28
      // 1e8: bipush 37
      // 1ea: iload 6
      // 1ec: ifne 360
      // 1ef: iload 6
      // 1f1: ifne 213
      // 1f4: goto 1fb
      // 1f7: invokestatic np1.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: if_icmpgt 2f9
      // 1fe: goto 205
      // 201: invokestatic np1.a (Loov;)Loov;
      // 204: athrow
      // 205: iload 14
      // 207: iload 25
      // 209: iadd
      // 20a: bipush 35
      // 20c: goto 213
      // 20f: invokestatic np1.a (Loov;)Loov;
      // 212: athrow
      // 213: iload 6
      // 215: ifne 22d
      // 218: if_icmpeq 2f9
      // 21b: goto 222
      // 21e: invokestatic np1.a (Loov;)Loov;
      // 221: athrow
      // 222: iload 28
      // 224: bipush 22
      // 226: goto 22d
      // 229: invokestatic np1.a (Loov;)Loov;
      // 22c: athrow
      // 22d: iload 6
      // 22f: ifne 273
      // 232: if_icmpne 268
      // 235: goto 23c
      // 238: invokestatic np1.a (Loov;)Loov;
      // 23b: athrow
      // 23c: aload 22
      // 23e: bipush 2
      // 23f: invokevirtual java/util/Random.nextInt (I)I
      // 242: ifne 25a
      // 245: goto 24c
      // 248: invokestatic np1.a (Loov;)Loov;
      // 24b: athrow
      // 24c: aload 0
      // 24d: getstatic ox_._dt Le0x;
      // 250: invokespecial np1.yw6 (Le0x;)Lsla;
      // 253: astore 29
      // 255: iload 6
      // 257: ifeq 306
      // 25a: aload 0
      // 25b: getstatic ox_.axm Le0x;
      // 25e: invokespecial np1.yw6 (Le0x;)Lsla;
      // 261: astore 29
      // 263: iload 6
      // 265: ifeq 306
      // 268: iload 28
      // 26a: bipush 10
      // 26c: goto 273
      // 26f: invokestatic np1.a (Loov;)Loov;
      // 272: athrow
      // 273: iload 6
      // 275: ifne 29b
      // 278: if_icmpne 290
      // 27b: goto 282
      // 27e: invokestatic np1.a (Loov;)Loov;
      // 281: athrow
      // 282: aload 0
      // 283: getstatic ox_.k03 Le0x;
      // 286: invokespecial np1.yw6 (Le0x;)Lsla;
      // 289: astore 29
      // 28b: iload 6
      // 28d: ifeq 306
      // 290: iload 28
      // 292: bipush 8
      // 294: goto 29b
      // 297: invokestatic np1.a (Loov;)Loov;
      // 29a: athrow
      // 29b: iload 6
      // 29d: ifne 2ce
      // 2a0: if_icmpne 2b8
      // 2a3: goto 2aa
      // 2a6: invokestatic np1.a (Loov;)Loov;
      // 2a9: athrow
      // 2aa: aload 0
      // 2ab: getstatic ox_.sm_ Le0x;
      // 2ae: invokespecial np1.yw6 (Le0x;)Lsla;
      // 2b1: astore 29
      // 2b3: iload 6
      // 2b5: ifeq 306
      // 2b8: iload 28
      // 2ba: iload 6
      // 2bc: ifne 2e8
      // 2bf: goto 2c6
      // 2c2: invokestatic np1.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: bipush 4
      // 2c7: goto 2ce
      // 2ca: invokestatic np1.a (Loov;)Loov;
      // 2cd: athrow
      // 2ce: if_icmple 2df
      // 2d1: aload 0
      // 2d2: getstatic ox_.pu8 Le0x;
      // 2d5: invokespecial np1.yw6 (Le0x;)Lsla;
      // 2d8: astore 29
      // 2da: iload 6
      // 2dc: ifeq 306
      // 2df: iload 28
      // 2e1: goto 2e8
      // 2e4: invokestatic np1.a (Loov;)Loov;
      // 2e7: athrow
      // 2e8: ifle 306
      // 2eb: aload 0
      // 2ec: getstatic ox_.kqk Le0x;
      // 2ef: invokespecial np1.yw6 (Le0x;)Lsla;
      // 2f2: astore 29
      // 2f4: iload 6
      // 2f6: ifeq 306
      // 2f9: getstatic ox_.n6z Le0x;
      // 2fc: astore 30
      // 2fe: aload 0
      // 2ff: aload 30
      // 301: invokespecial np1.yw6 (Le0x;)Lsla;
      // 304: astore 29
      // 306: aload 0
      // 307: getfield np1.f41 Lc05;
      // 30a: invokevirtual Minecraft.l22 ()Llc5;
      // 30d: getstatic yu2.nu_ Lgdz;
      // 310: invokevirtual lc5.anl (Lgdz;)V
      // 313: aload 0
      // 314: iload 27
      // 316: bipush 16
      // 318: imul
      // 319: iload 15
      // 31b: isub
      // 31c: iload 25
      // 31e: bipush 16
      // 320: imul
      // 321: iload 16
      // 323: isub
      // 324: aload 29
      // 326: bipush 16
      // 328: bipush 16
      // 32a: invokevirtual np1._29 (IILsla;II)V
      // 32d: iinc 27 1
      // 330: iload 6
      // 332: ifeq 194
      // 335: iinc 25 1
      // 338: iload 6
      // 33a: ifeq 15d
      // 33d: invokestatic hzu.m45 ()V
      // 340: sipush 515
      // 343: invokestatic hzu.d14 (I)V
      // 346: aload 0
      // 347: getfield np1.f41 Lc05;
      // 34a: invokevirtual Minecraft.l22 ()Llc5;
      // 34d: getstatic np1.o7d Lgdz;
      // 350: invokevirtual lc5.anl (Lgdz;)V
      // 353: bipush 0
      // 354: istore 25
      // 356: iload 25
      // 358: getstatic y8d.i0s Ljava/util/List;
      // 35b: invokeinterface java/util/List.size ()I 1
      // 360: if_icmpge 53a
      // 363: getstatic y8d.i0s Ljava/util/List;
      // 366: iload 25
      // 368: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 36d: checkcast l7l
      // 370: astore 26
      // 372: iload 6
      // 374: ifne 535
      // 377: aload 26
      // 379: getfield l7l.b4b Ll7l;
      // 37c: ifnull 532
      // 37f: goto 386
      // 382: invokestatic np1.a (Loov;)Loov;
      // 385: athrow
      // 386: aload 26
      // 388: getfield l7l.orx I
      // 38b: bipush 24
      // 38d: imul
      // 38e: iload 7
      // 390: isub
      // 391: bipush 11
      // 393: iadd
      // 394: istore 27
      // 396: aload 26
      // 398: getfield l7l.e8s I
      // 39b: bipush 24
      // 39d: imul
      // 39e: iload 8
      // 3a0: isub
      // 3a1: bipush 11
      // 3a3: iadd
      // 3a4: istore 28
      // 3a6: aload 26
      // 3a8: getfield l7l.b4b Ll7l;
      // 3ab: getfield l7l.orx I
      // 3ae: bipush 24
      // 3b0: imul
      // 3b1: iload 7
      // 3b3: isub
      // 3b4: bipush 11
      // 3b6: iadd
      // 3b7: istore 29
      // 3b9: aload 26
      // 3bb: getfield l7l.b4b Ll7l;
      // 3be: getfield l7l.e8s I
      // 3c1: bipush 24
      // 3c3: imul
      // 3c4: iload 8
      // 3c6: isub
      // 3c7: bipush 11
      // 3c9: iadd
      // 3ca: istore 30
      // 3cc: aload 0
      // 3cd: getfield np1.lb4 Lik0;
      // 3d0: aload 26
      // 3d2: invokevirtual ik0.ktg (Ll7l;)Z
      // 3d5: istore 31
      // 3d7: aload 0
      // 3d8: getfield np1.lb4 Lik0;
      // 3db: aload 26
      // 3dd: invokevirtual ik0.ha1 (Ll7l;)Z
      // 3e0: istore 32
      // 3e2: aload 0
      // 3e3: getfield np1.lb4 Lik0;
      // 3e6: aload 26
      // 3e8: invokevirtual ik0.hd1 (Ll7l;)I
      // 3eb: istore 33
      // 3ed: iload 6
      // 3ef: ifne 535
      // 3f2: iload 33
      // 3f4: bipush 4
      // 3f5: if_icmpgt 532
      // 3f8: goto 3ff
      // 3fb: invokestatic np1.a (Loov;)Loov;
      // 3fe: athrow
      // 3ff: ldc -16777216
      // 401: nop
      // 402: istore 34
      // 404: iload 31
      // 406: iload 6
      // 408: ifne 428
      // 40b: ifeq 41f
      // 40e: goto 415
      // 411: invokestatic np1.a (Loov;)Loov;
      // 414: athrow
      // 415: ldc -6250336
      // 417: nop
      // 418: istore 34
      // 41a: iload 6
      // 41c: ifeq 43c
      // 41f: iload 32
      // 421: goto 428
      // 424: invokestatic np1.a (Loov;)Loov;
      // 427: athrow
      // 428: iload 6
      // 42a: ifne 456
      // 42d: ifeq 43c
      // 430: goto 437
      // 433: invokestatic np1.a (Loov;)Loov;
      // 436: athrow
      // 437: ldc -16711936
      // 439: nop
      // 43a: istore 34
      // 43c: aload 0
      // 43d: iload 27
      // 43f: iload 29
      // 441: iload 28
      // 443: iload 34
      // 445: invokevirtual np1.yaj (IIII)V
      // 448: aload 0
      // 449: iload 29
      // 44b: iload 28
      // 44d: iload 30
      // 44f: iload 34
      // 451: invokevirtual np1.x3f (IIII)V
      // 454: iload 27
      // 456: iload 29
      // 458: iload 6
      // 45a: ifne 497
      // 45d: if_icmple 48c
      // 460: goto 467
      // 463: invokestatic np1.a (Loov;)Loov;
      // 466: athrow
      // 467: aload 0
      // 468: iload 27
      // 46a: bipush 11
      // 46c: isub
      // 46d: bipush 7
      // 46f: isub
      // 470: iload 28
      // 472: bipush 5
      // 473: isub
      // 474: bipush 114
      // 476: sipush 234
      // 479: bipush 7
      // 47b: bipush 11
      // 47d: invokevirtual np1.mt4 (IIIIII)V
      // 480: iload 6
      // 482: ifeq 532
      // 485: goto 48c
      // 488: invokestatic np1.a (Loov;)Loov;
      // 48b: athrow
      // 48c: iload 27
      // 48e: iload 29
      // 490: goto 497
      // 493: invokestatic np1.a (Loov;)Loov;
      // 496: athrow
      // 497: iload 6
      // 499: ifne 4d3
      // 49c: if_icmpge 4c8
      // 49f: goto 4a6
      // 4a2: invokestatic np1.a (Loov;)Loov;
      // 4a5: athrow
      // 4a6: aload 0
      // 4a7: iload 27
      // 4a9: bipush 11
      // 4ab: iadd
      // 4ac: iload 28
      // 4ae: bipush 5
      // 4af: isub
      // 4b0: bipush 107
      // 4b2: sipush 234
      // 4b5: bipush 7
      // 4b7: bipush 11
      // 4b9: invokevirtual np1.mt4 (IIIIII)V
      // 4bc: iload 6
      // 4be: ifeq 532
      // 4c1: goto 4c8
      // 4c4: invokestatic np1.a (Loov;)Loov;
      // 4c7: athrow
      // 4c8: iload 28
      // 4ca: iload 30
      // 4cc: goto 4d3
      // 4cf: invokestatic np1.a (Loov;)Loov;
      // 4d2: athrow
      // 4d3: iload 6
      // 4d5: ifne 512
      // 4d8: if_icmple 507
      // 4db: goto 4e2
      // 4de: invokestatic np1.a (Loov;)Loov;
      // 4e1: athrow
      // 4e2: aload 0
      // 4e3: iload 27
      // 4e5: bipush 5
      // 4e6: isub
      // 4e7: iload 28
      // 4e9: bipush 11
      // 4eb: isub
      // 4ec: bipush 7
      // 4ee: isub
      // 4ef: bipush 96
      // 4f1: sipush 234
      // 4f4: bipush 11
      // 4f6: bipush 7
      // 4f8: invokevirtual np1.mt4 (IIIIII)V
      // 4fb: iload 6
      // 4fd: ifeq 532
      // 500: goto 507
      // 503: invokestatic np1.a (Loov;)Loov;
      // 506: athrow
      // 507: iload 28
      // 509: iload 30
      // 50b: goto 512
      // 50e: invokestatic np1.a (Loov;)Loov;
      // 511: athrow
      // 512: if_icmpge 532
      // 515: aload 0
      // 516: iload 27
      // 518: bipush 5
      // 519: isub
      // 51a: iload 28
      // 51c: bipush 11
      // 51e: iadd
      // 51f: bipush 96
      // 521: sipush 241
      // 524: bipush 11
      // 526: bipush 7
      // 528: invokevirtual np1.mt4 (IIIIII)V
      // 52b: goto 532
      // 52e: invokestatic np1.a (Loov;)Loov;
      // 531: athrow
      // 532: iinc 25 1
      // 535: iload 6
      // 537: ifeq 356
      // 53a: aconst_null
      // 53b: astore 25
      // 53d: iload 1
      // 53e: iload 11
      // 540: isub
      // 541: i2f
      // 542: aload 0
      // 543: getfield np1.pb_ F
      // 546: fmul
      // 547: fstore 26
      // 549: iload 2
      // 54a: iload 12
      // 54c: isub
      // 54d: i2f
      // 54e: aload 0
      // 54f: getfield np1.pb_ F
      // 552: fmul
      // 553: fstore 27
      // 555: invokestatic qpm.gdb ()V
      // 558: invokestatic hzu.fpt ()V
      // 55b: invokestatic hzu.ixc ()V
      // 55e: invokestatic hzu.avm ()V
      // 561: bipush 0
      // 562: istore 28
      // 564: iload 28
      // 566: getstatic y8d.i0s Ljava/util/List;
      // 569: invokeinterface java/util/List.size ()I 1
      // 56e: if_icmpge 84e
      // 571: getstatic y8d.i0s Ljava/util/List;
      // 574: iload 28
      // 576: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 57b: checkcast l7l
      // 57e: astore 29
      // 580: aload 29
      // 582: getfield l7l.orx I
      // 585: bipush 24
      // 587: imul
      // 588: iload 7
      // 58a: isub
      // 58b: istore 30
      // 58d: aload 29
      // 58f: getfield l7l.e8s I
      // 592: bipush 24
      // 594: imul
      // 595: iload 8
      // 597: isub
      // 598: istore 31
      // 59a: iload 6
      // 59c: ifne 849
      // 59f: iload 30
      // 5a1: iload 6
      // 5a3: ifne 885
      // 5a6: goto 5ad
      // 5a9: invokestatic np1.a (Loov;)Loov;
      // 5ac: athrow
      // 5ad: bipush -24
      // 5af: if_icmplt 846
      // 5b2: goto 5b9
      // 5b5: invokestatic np1.a (Loov;)Loov;
      // 5b8: athrow
      // 5b9: iload 31
      // 5bb: iload 6
      // 5bd: ifne 5e6
      // 5c0: goto 5c7
      // 5c3: invokestatic np1.a (Loov;)Loov;
      // 5c6: athrow
      // 5c7: bipush -24
      // 5c9: if_icmplt 846
      // 5cc: goto 5d3
      // 5cf: invokestatic np1.a (Loov;)Loov;
      // 5d2: athrow
      // 5d3: iload 30
      // 5d5: i2f
      // 5d6: ldc 224.0
      // 5d8: nop
      // 5d9: aload 0
      // 5da: getfield np1.pb_ F
      // 5dd: fmul
      // 5de: fcmpg
      // 5df: goto 5e6
      // 5e2: invokestatic np1.a (Loov;)Loov;
      // 5e5: athrow
      // 5e6: iload 6
      // 5e8: ifne 608
      // 5eb: ifgt 846
      // 5ee: goto 5f5
      // 5f1: invokestatic np1.a (Loov;)Loov;
      // 5f4: athrow
      // 5f5: iload 31
      // 5f7: i2f
      // 5f8: ldc 155.0
      // 5fa: nop
      // 5fb: aload 0
      // 5fc: getfield np1.pb_ F
      // 5ff: fmul
      // 600: fcmpg
      // 601: goto 608
      // 604: invokestatic np1.a (Loov;)Loov;
      // 607: athrow
      // 608: iload 6
      // 60a: ifne 627
      // 60d: ifgt 846
      // 610: goto 617
      // 613: invokestatic np1.a (Loov;)Loov;
      // 616: athrow
      // 617: aload 0
      // 618: getfield np1.lb4 Lik0;
      // 61b: aload 29
      // 61d: invokevirtual ik0.hd1 (Ll7l;)I
      // 620: goto 627
      // 623: invokestatic np1.a (Loov;)Loov;
      // 626: athrow
      // 627: istore 32
      // 629: aload 0
      // 62a: getfield np1.lb4 Lik0;
      // 62d: aload 29
      // 62f: invokevirtual ik0.ktg (Ll7l;)Z
      // 632: iload 6
      // 634: ifne 665
      // 637: ifeq 655
      // 63a: goto 641
      // 63d: invokestatic np1.a (Loov;)Loov;
      // 640: athrow
      // 641: ldc 0.75
      // 643: nop
      // 644: fstore 33
      // 646: fload 33
      // 648: fload 33
      // 64a: fload 33
      // 64c: fconst_1
      // 64d: invokestatic hzu.wn0 (FFFF)V
      // 650: iload 6
      // 652: ifeq 6ff
      // 655: aload 0
      // 656: getfield np1.lb4 Lik0;
      // 659: aload 29
      // 65b: invokevirtual ik0.ha1 (Ll7l;)Z
      // 65e: goto 665
      // 661: invokestatic np1.a (Loov;)Loov;
      // 664: athrow
      // 665: iload 6
      // 667: ifne 68f
      // 66a: ifeq 686
      // 66d: goto 674
      // 670: invokestatic np1.a (Loov;)Loov;
      // 673: athrow
      // 674: fconst_1
      // 675: fstore 33
      // 677: fload 33
      // 679: fload 33
      // 67b: fload 33
      // 67d: fconst_1
      // 67e: invokestatic hzu.wn0 (FFFF)V
      // 681: iload 6
      // 683: ifeq 6ff
      // 686: iload 32
      // 688: goto 68f
      // 68b: invokestatic np1.a (Loov;)Loov;
      // 68e: athrow
      // 68f: bipush 3
      // 690: iload 6
      // 692: ifne 6bd
      // 695: if_icmpge 6b3
      // 698: goto 69f
      // 69b: invokestatic np1.a (Loov;)Loov;
      // 69e: athrow
      // 69f: ldc 0.3
      // 6a1: nop
      // 6a2: fstore 33
      // 6a4: fload 33
      // 6a6: fload 33
      // 6a8: fload 33
      // 6aa: fconst_1
      // 6ab: invokestatic hzu.wn0 (FFFF)V
      // 6ae: iload 6
      // 6b0: ifeq 6ff
      // 6b3: iload 32
      // 6b5: bipush 3
      // 6b6: goto 6bd
      // 6b9: invokestatic np1.a (Loov;)Loov;
      // 6bc: athrow
      // 6bd: iload 6
      // 6bf: ifne 6ea
      // 6c2: if_icmpne 6e0
      // 6c5: goto 6cc
      // 6c8: invokestatic np1.a (Loov;)Loov;
      // 6cb: athrow
      // 6cc: ldc 0.2
      // 6ce: nop
      // 6cf: fstore 33
      // 6d1: fload 33
      // 6d3: fload 33
      // 6d5: fload 33
      // 6d7: fconst_1
      // 6d8: invokestatic hzu.wn0 (FFFF)V
      // 6db: iload 6
      // 6dd: ifeq 6ff
      // 6e0: iload 32
      // 6e2: bipush 4
      // 6e3: goto 6ea
      // 6e6: invokestatic np1.a (Loov;)Loov;
      // 6e9: athrow
      // 6ea: if_icmpeq 6f0
      // 6ed: goto 846
      // 6f0: ldc 0.1
      // 6f2: nop
      // 6f3: fstore 33
      // 6f5: fload 33
      // 6f7: fload 33
      // 6f9: fload 33
      // 6fb: fconst_1
      // 6fc: invokestatic hzu.wn0 (FFFF)V
      // 6ff: aload 0
      // 700: iload 6
      // 702: ifne 749
      // 705: getfield np1.f41 Lc05;
      // 708: invokevirtual Minecraft.l22 ()Llc5;
      // 70b: getstatic np1.o7d Lgdz;
      // 70e: invokevirtual lc5.anl (Lgdz;)V
      // 711: aload 29
      // 713: invokevirtual l7l.xe7 ()Z
      // 716: ifeq 741
      // 719: goto 720
      // 71c: invokestatic np1.a (Loov;)Loov;
      // 71f: athrow
      // 720: aload 0
      // 721: iload 30
      // 723: bipush 2
      // 724: isub
      // 725: iload 31
      // 727: bipush 2
      // 728: isub
      // 729: bipush 26
      // 72b: sipush 202
      // 72e: bipush 26
      // 730: bipush 26
      // 732: invokevirtual np1.mt4 (IIIIII)V
      // 735: iload 6
      // 737: ifeq 75c
      // 73a: goto 741
      // 73d: invokestatic np1.a (Loov;)Loov;
      // 740: athrow
      // 741: aload 0
      // 742: goto 749
      // 745: invokestatic np1.a (Loov;)Loov;
      // 748: athrow
      // 749: iload 30
      // 74b: bipush 2
      // 74c: isub
      // 74d: iload 31
      // 74f: bipush 2
      // 750: isub
      // 751: bipush 0
      // 752: sipush 202
      // 755: bipush 26
      // 757: bipush 26
      // 759: invokevirtual np1.mt4 (IIIIII)V
      // 75c: aload 0
      // 75d: getfield np1.lb4 Lik0;
      // 760: aload 29
      // 762: invokevirtual ik0.ha1 (Ll7l;)Z
      // 765: iload 6
      // 767: ifne 7ba
      // 76a: ifne 78b
      // 76d: goto 774
      // 770: invokestatic np1.a (Loov;)Loov;
      // 773: athrow
      // 774: ldc 0.1
      // 776: nop
      // 777: fstore 33
      // 779: fload 33
      // 77b: fload 33
      // 77d: fload 33
      // 77f: fconst_1
      // 780: invokestatic hzu.wn0 (FFFF)V
      // 783: aload 0
      // 784: getfield np1.vs5 Ly1w;
      // 787: bipush 0
      // 788: invokevirtual y1w.lyp (Z)V
      // 78b: invokestatic hzu.s7q ()V
      // 78e: invokestatic hzu.gp4 ()V
      // 791: aload 0
      // 792: getfield np1.vs5 Ly1w;
      // 795: aload 29
      // 797: getfield l7l.o5g Lerg;
      // 79a: iload 30
      // 79c: bipush 3
      // 79d: iadd
      // 79e: iload 31
      // 7a0: bipush 3
      // 7a1: iadd
      // 7a2: invokevirtual y1w.px5 (Lerg;II)V
      // 7a5: sipush 770
      // 7a8: sipush 771
      // 7ab: invokestatic hzu.ru7 (II)V
      // 7ae: invokestatic hzu.fpt ()V
      // 7b1: aload 0
      // 7b2: getfield np1.lb4 Lik0;
      // 7b5: aload 29
      // 7b7: invokevirtual ik0.ha1 (Ll7l;)Z
      // 7ba: iload 6
      // 7bc: ifne 7f1
      // 7bf: ifne 7d8
      // 7c2: goto 7c9
      // 7c5: invokestatic np1.a (Loov;)Loov;
      // 7c8: athrow
      // 7c9: aload 0
      // 7ca: getfield np1.vs5 Ly1w;
      // 7cd: bipush 1
      // 7ce: invokevirtual y1w.lyp (Z)V
      // 7d1: goto 7d8
      // 7d4: invokestatic np1.a (Loov;)Loov;
      // 7d7: athrow
      // 7d8: fconst_1
      // 7d9: fconst_1
      // 7da: fconst_1
      // 7db: fconst_1
      // 7dc: invokestatic hzu.wn0 (FFFF)V
      // 7df: iload 6
      // 7e1: ifne 849
      // 7e4: fload 26
      // 7e6: iload 30
      // 7e8: i2f
      // 7e9: fcmpl
      // 7ea: goto 7f1
      // 7ed: invokestatic np1.a (Loov;)Loov;
      // 7f0: athrow
      // 7f1: iflt 846
      // 7f4: fload 26
      // 7f6: iload 30
      // 7f8: bipush 22
      // 7fa: iadd
      // 7fb: i2f
      // 7fc: fcmpg
      // 7fd: iload 6
      // 7ff: ifne 820
      // 802: goto 809
      // 805: invokestatic np1.a (Loov;)Loov;
      // 808: athrow
      // 809: ifgt 846
      // 80c: goto 813
      // 80f: invokestatic np1.a (Loov;)Loov;
      // 812: athrow
      // 813: fload 27
      // 815: iload 31
      // 817: i2f
      // 818: fcmpl
      // 819: goto 820
      // 81c: invokestatic np1.a (Loov;)Loov;
      // 81f: athrow
      // 820: iload 6
      // 822: ifne 83f
      // 825: iflt 846
      // 828: goto 82f
      // 82b: invokestatic np1.a (Loov;)Loov;
      // 82e: athrow
      // 82f: fload 27
      // 831: iload 31
      // 833: bipush 22
      // 835: iadd
      // 836: i2f
      // 837: fcmpg
      // 838: goto 83f
      // 83b: invokestatic np1.a (Loov;)Loov;
      // 83e: athrow
      // 83f: ifgt 846
      // 842: aload 29
      // 844: astore 25
      // 846: iinc 28 1
      // 849: iload 6
      // 84b: ifeq 564
      // 84e: invokestatic hzu._o4 ()V
      // 851: invokestatic hzu.spd ()V
      // 854: invokestatic hzu.x3w ()V
      // 857: fconst_1
      // 858: fconst_1
      // 859: fconst_1
      // 85a: fconst_1
      // 85b: invokestatic hzu.wn0 (FFFF)V
      // 85e: aload 0
      // 85f: getfield np1.f41 Lc05;
      // 862: invokevirtual Minecraft.l22 ()Llc5;
      // 865: getstatic np1.o7d Lgdz;
      // 868: invokevirtual lc5.anl (Lgdz;)V
      // 86b: aload 0
      // 86c: iload 9
      // 86e: iload 10
      // 870: bipush 0
      // 871: bipush 0
      // 872: aload 0
      // 873: getfield np1.t5u I
      // 876: aload 0
      // 877: getfield np1.qo5 I
      // 87a: invokevirtual np1.mt4 (IIIIII)V
      // 87d: aload 0
      // 87e: fconst_0
      // 87f: putfield np1.o3s F
      // 882: sipush 515
      // 885: invokestatic hzu.d14 (I)V
      // 888: invokestatic hzu._o4 ()V
      // 88b: invokestatic hzu.rqj ()V
      // 88e: aload 0
      // 88f: iload 1
      // 890: iload 2
      // 891: fload 3
      // 892: invokespecial ShaderHelper.drawScreen (IIF)V
      // 895: iload 6
      // 897: ifne b89
      // 89a: aload 25
      // 89c: ifnull b80
      // 89f: goto 8a6
      // 8a2: invokestatic np1.a (Loov;)Loov;
      // 8a5: athrow
      // 8a6: aload 25
      // 8a8: invokevirtual l7l.xn7 ()Lekw;
      // 8ab: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 8b0: astore 28
      // 8b2: aload 25
      // 8b4: invokevirtual l7l.h7c ()Ljava/lang/String;
      // 8b7: astore 29
      // 8b9: iload 1
      // 8ba: bipush 12
      // 8bc: iadd
      // 8bd: istore 30
      // 8bf: iload 2
      // 8c0: bipush 4
      // 8c1: isub
      // 8c2: istore 31
      // 8c4: aload 0
      // 8c5: getfield np1.lb4 Lik0;
      // 8c8: aload 25
      // 8ca: invokevirtual ik0.hd1 (Ll7l;)I
      // 8cd: istore 32
      // 8cf: aload 0
      // 8d0: getfield np1.lb4 Lik0;
      // 8d3: aload 25
      // 8d5: invokevirtual ik0.ha1 (Ll7l;)Z
      // 8d8: iload 6
      // 8da: ifne 9b0
      // 8dd: ifeq 9a7
      // 8e0: goto 8e7
      // 8e3: invokestatic np1.a (Loov;)Loov;
      // 8e6: athrow
      // 8e7: aload 0
      // 8e8: getfield np1.fex Lowt;
      // 8eb: aload 28
      // 8ed: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 8f0: bipush 120
      // 8f2: invokestatic java/lang/Math.max (II)I
      // 8f5: istore 33
      // 8f7: aload 0
      // 8f8: getfield np1.fex Lowt;
      // 8fb: aload 29
      // 8fd: iload 33
      // 8ff: invokevirtual owt.jdm (Ljava/lang/String;I)I
      // 902: istore 34
      // 904: aload 0
      // 905: getfield np1.lb4 Lik0;
      // 908: aload 25
      // 90a: invokevirtual ik0.ktg (Ll7l;)Z
      // 90d: iload 6
      // 90f: ifne 960
      // 912: ifeq 91f
      // 915: goto 91c
      // 918: invokestatic np1.a (Loov;)Loov;
      // 91b: athrow
      // 91c: iinc 34 12
      // 91f: aload 0
      // 920: iload 30
      // 922: bipush 3
      // 923: isub
      // 924: iload 31
      // 926: bipush 3
      // 927: isub
      // 928: iload 30
      // 92a: iload 33
      // 92c: iadd
      // 92d: bipush 3
      // 92e: iadd
      // 92f: iload 31
      // 931: iload 34
      // 933: iadd
      // 934: bipush 3
      // 935: iadd
      // 936: bipush 12
      // 938: iadd
      // 939: ldc -1073741824
      // 93b: nop
      // 93c: ldc -1073741824
      // 93e: nop
      // 93f: invokevirtual np1.flp (IIIIII)V
      // 942: aload 0
      // 943: getfield np1.fex Lowt;
      // 946: aload 29
      // 948: iload 30
      // 94a: iload 31
      // 94c: bipush 12
      // 94e: iadd
      // 94f: iload 33
      // 951: ldc -6250336
      // 953: nop
      // 954: invokevirtual owt.bsn (Ljava/lang/String;IIII)V
      // 957: aload 0
      // 958: getfield np1.lb4 Lik0;
      // 95b: aload 25
      // 95d: invokevirtual ik0.ktg (Ll7l;)Z
      // 960: iload 6
      // 962: ifne 9a1
      // 965: ifeq 9a2
      // 968: goto 96f
      // 96b: invokestatic np1.a (Loov;)Loov;
      // 96e: athrow
      // 96f: aload 0
      // 970: getfield np1.fex Lowt;
      // 973: sipush 23024
      // 976: ldc2_w 6619607010852862100
      // 979: lload 4
      // 97b: lxor
      // 97c: invokedynamic r (IJ)Ljava/lang/String; bsm=np1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 981: nop
      // 982: bipush 0
      // 983: anewarray 156
      // 986: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 989: iload 30
      // 98b: i2f
      // 98c: iload 31
      // 98e: iload 34
      // 990: iadd
      // 991: bipush 4
      // 992: iadd
      // 993: i2f
      // 994: ldc -7302913
      // 996: nop
      // 997: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 99a: goto 9a1
      // 99d: invokestatic np1.a (Loov;)Loov;
      // 9a0: athrow
      // 9a1: pop
      // 9a2: iload 6
      // 9a4: ifeq b03
      // 9a7: iload 32
      // 9a9: goto 9b0
      // 9ac: invokestatic np1.a (Loov;)Loov;
      // 9af: athrow
      // 9b0: bipush 3
      // 9b1: iload 6
      // 9b3: ifne a66
      // 9b6: if_icmpne a5c
      // 9b9: goto 9c0
      // 9bc: invokestatic np1.a (Loov;)Loov;
      // 9bf: athrow
      // 9c0: sipush 30177
      // 9c3: ldc2_w 2057514278353753218
      // 9c6: lload 4
      // 9c8: lxor
      // 9c9: invokedynamic r (IJ)Ljava/lang/String; bsm=np1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9ce: nop
      // 9cf: bipush 0
      // 9d0: anewarray 156
      // 9d3: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 9d6: astore 28
      // 9d8: aload 0
      // 9d9: getfield np1.fex Lowt;
      // 9dc: aload 28
      // 9de: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 9e1: bipush 120
      // 9e3: invokestatic java/lang/Math.max (II)I
      // 9e6: istore 33
      // 9e8: new hsu
      // 9eb: dup
      // 9ec: sipush 21219
      // 9ef: ldc2_w 3211458730435408772
      // 9f2: lload 4
      // 9f4: lxor
      // 9f5: invokedynamic r (IJ)Ljava/lang/String; bsm=np1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9fa: nop
      // 9fb: bipush 1
      // 9fc: anewarray 156
      // 9ff: dup
      // a00: bipush 0
      // a01: aload 25
      // a03: getfield l7l.b4b Ll7l;
      // a06: invokevirtual l7l.xn7 ()Lekw;
      // a09: aastore
      // a0a: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // a0d: invokevirtual hsu.rnh ()Ljava/lang/String;
      // a10: astore 34
      // a12: aload 0
      // a13: getfield np1.fex Lowt;
      // a16: aload 34
      // a18: iload 33
      // a1a: invokevirtual owt.jdm (Ljava/lang/String;I)I
      // a1d: istore 35
      // a1f: aload 0
      // a20: iload 30
      // a22: bipush 3
      // a23: isub
      // a24: iload 31
      // a26: bipush 3
      // a27: isub
      // a28: iload 30
      // a2a: iload 33
      // a2c: iadd
      // a2d: bipush 3
      // a2e: iadd
      // a2f: iload 31
      // a31: iload 35
      // a33: iadd
      // a34: bipush 12
      // a36: iadd
      // a37: bipush 3
      // a38: iadd
      // a39: ldc -1073741824
      // a3b: nop
      // a3c: ldc -1073741824
      // a3e: nop
      // a3f: invokevirtual np1.flp (IIIIII)V
      // a42: aload 0
      // a43: getfield np1.fex Lowt;
      // a46: aload 34
      // a48: iload 30
      // a4a: iload 31
      // a4c: bipush 12
      // a4e: iadd
      // a4f: iload 33
      // a51: ldc -9416624
      // a53: nop
      // a54: invokevirtual owt.bsn (Ljava/lang/String;IIII)V
      // a57: iload 6
      // a59: ifeq b03
      // a5c: iload 32
      // a5e: bipush 3
      // a5f: goto a66
      // a62: invokestatic np1.a (Loov;)Loov;
      // dispatchTo: athrow
      // a66: iload 6
      // a68: ifne a87
      // a6b: if_icmpge b00
      // a6e: goto a75
      // a71: invokestatic np1.a (Loov;)Loov;
      // a74: athrow
      // a75: aload 0
      // a76: getfield np1.fex Lowt;
      // a79: aload 28
      // a7b: invokevirtual owt.ezt (Ljava/lang/String;)I
      // a7e: bipush 120
      // a80: goto a87
      // a83: invokestatic np1.a (Loov;)Loov;
      // a86: athrow
      // a87: invokestatic java/lang/Math.max (II)I
      // a8a: istore 33
      // a8c: new hsu
      // a8f: dup
      // a90: sipush 30889
      // a93: ldc2_w 8449596616196381135
      // a96: lload 4
      // a98: lxor
      // a99: invokedynamic r (IJ)Ljava/lang/String; bsm=np1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9e: nop
      // a9f: bipush 1
      // aa0: anewarray 156
      // aa3: dup
      // aa4: bipush 0
      // aa5: aload 25
      // aa7: getfield l7l.b4b Ll7l;
      // aaa: invokevirtual l7l.xn7 ()Lekw;
      // aad: aastore
      // aae: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // ab1: invokevirtual hsu.rnh ()Ljava/lang/String;
      // ab4: astore 34
      // ab6: aload 0
      // ab7: getfield np1.fex Lowt;
      // aba: aload 34
      // abc: iload 33
      // abe: invokevirtual owt.jdm (Ljava/lang/String;I)I
      // ac1: istore 35
      // ac3: aload 0
      // ac4: iload 30
      // ac6: bipush 3
      // ac7: isub
      // ac8: iload 31
      // aca: bipush 3
      // acb: isub
      // acc: iload 30
      // ace: iload 33
      // ad0: iadd
      // ad1: bipush 3
      // ad2: iadd
      // ad3: iload 31
      // ad5: iload 35
      // ad7: iadd
      // ad8: bipush 12
      // ada: iadd
      // adb: bipush 3
      // adc: iadd
      // add: ldc -1073741824
      // adf: nop
      // ae0: ldc -1073741824
      // ae2: nop
      // ae3: invokevirtual np1.flp (IIIIII)V
      // ae6: aload 0
      // ae7: getfield np1.fex Lowt;
      // aea: aload 34
      // aec: iload 30
      // aee: iload 31
      // af0: bipush 12
      // af2: iadd
      // af3: iload 33
      // af5: ldc -9416624
      // af7: nop
      // af8: invokevirtual owt.bsn (Ljava/lang/String;IIII)V
      // afb: iload 6
      // afd: ifeq b03
      // b00: aconst_null
      // b01: astore 28
      // b03: aload 28
      // b05: ifnull b80
      // b08: aload 0
      // b09: getfield np1.fex Lowt;
      // b0c: aload 28
      // b0e: iload 30
      // b10: i2f
      // b11: iload 31
      // b13: i2f
      // b14: aload 0
      // b15: getfield np1.lb4 Lik0;
      // b18: aload 25
      // b1a: invokevirtual ik0.ha1 (Ll7l;)Z
      // b1d: iload 6
      // b1f: ifne b60
      // b22: goto b29
      // b25: invokestatic np1.a (Loov;)Loov;
      // b28: athrow
      // b29: ifeq b5b
      // b2c: goto b33
      // b2f: invokestatic np1.a (Loov;)Loov;
      // b32: athrow
      // b33: aload 25
      // b35: invokevirtual l7l.xe7 ()Z
      // b38: iload 6
      // b3a: ifne b58
      // b3d: goto b44
      // b40: invokestatic np1.a (Loov;)Loov;
      // b43: athrow
      // b44: ifeq b57
      // b47: goto b4e
      // b4a: invokestatic np1.a (Loov;)Loov;
      // b4d: athrow
      // b4e: bipush -128
      // b50: goto b7c
      // b53: invokestatic np1.a (Loov;)Loov;
      // b56: athrow
      // b57: bipush -1
      // b58: goto b7c
      // b5b: aload 25
      // b5d: invokevirtual l7l.xe7 ()Z
      // b60: iload 6
      // b62: ifne b7b
      // b65: ifeq b79
      // b68: goto b6f
      // b6b: invokestatic np1.a (Loov;)Loov;
      // b6e: athrow
      // b6f: ldc -8355776
      // b71: nop
      // b72: goto b7c
      // b75: invokestatic np1.a (Loov;)Loov;
      // b78: athrow
      // b79: ldc -8355712
      // b7b: nop
      // b7c: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // b7f: pop
      // b80: invokestatic hzu.m45 ()V
      // b83: invokestatic hzu.s7q ()V
      // b86: invokestatic qpm.cng ()V
      // b89: return
   }

   private sla yw6(e0x var1) {
      return Minecraft.vz1().dwz().icl().sqb(var1.l4i());
   }

   @Override
   public boolean a99() {
      int var1 = OpaquePredicate.c();

      try {
         if (var1 != 0) {
            return this.pnz;
         }

         if (!this.pnz) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3886151696090693417L, 3730275259142351834L, MethodHandles.lookup().lookupClass()).a(276527451633020L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 59772643552827L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "þ%\u0093TÚ}N\u0086\u0097\u000eTøé¡\u0019\u0006 ¬à\u0098\u001b\u00ad¤ºXb^êâ&õUÄî\n8\u0003~D,\u0005reb\u0092m\u0082v\u0000|Ð¼\u0091tü\u0090\u0090WÊo§\u008c(\u0002\u008cñÌáé&ËZqB¯%ìÛ0×L¥\u0083sDT\tïR Zã#ÿ?\u008bw\u0097\u0087§\u0080\u001e«\u009c\u0005\u001f\u0087\u009e\u0098\bÙ\u008c\u00198¶Ì¾à7ÈótM²\fÄïß/µ0\u0012\u001f¬\u001axEr¨QáÝ.[$\u0083ÖºÒ\rçnÃ\u0081\u001cV\u0019\u0002Ô' \u0083=ãÚvmg\"«(D`4óJ*ÆqÔM`=?\u00953?ì0æ>Õ4¦ö¾E}Sú\bDÅ\"\u0080È;à4\nÂ(IT\u0002Ø\u001a½O²Ó*Ã®\u0091\r\u001f\u001dòW\u001e\u0018ë<L\u0010(èà$Â7n\u008fkÑ\u001fVä.@\u0084(ë\u000fD½\u0080ÅK\u0015\u009f\u000b\u0005JµÍ \u0013n+îÒ\u001f,\u0098{s\u0014ªxO\u0018°\u001e\u0017·°\u008fÀ¢\u0001\u0091";
      int var6 = "þ%\u0093TÚ}N\u0086\u0097\u000eTøé¡\u0019\u0006 ¬à\u0098\u001b\u00ad¤ºXb^êâ&õUÄî\n8\u0003~D,\u0005reb\u0092m\u0082v\u0000|Ð¼\u0091tü\u0090\u0090WÊo§\u008c(\u0002\u008cñÌáé&ËZqB¯%ìÛ0×L¥\u0083sDT\tïR Zã#ÿ?\u008bw\u0097\u0087§\u0080\u001e«\u009c\u0005\u001f\u0087\u009e\u0098\bÙ\u008c\u00198¶Ì¾à7ÈótM²\fÄïß/µ0\u0012\u001f¬\u001axEr¨QáÝ.[$\u0083ÖºÒ\rçnÃ\u0081\u001cV\u0019\u0002Ô' \u0083=ãÚvmg\"«(D`4óJ*ÆqÔM`=?\u00953?ì0æ>Õ4¦ö¾E}Sú\bDÅ\"\u0080È;à4\nÂ(IT\u0002Ø\u001a½O²Ó*Ã®\u0091\r\u001f\u001dòW\u001e\u0018ë<L\u0010(èà$Â7n\u008fkÑ\u001fVä.@\u0084(ë\u000fD½\u0080ÅK\u0015\u009f\u000b\u0005JµÍ \u0013n+îÒ\u001f,\u0098{s\u0014ªxO\u0018°\u001e\u0017·°\u008fÀ¢\u0001\u0091"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     g = new String[8];
                     t2c = y8d.aaf * 24 - 112;
                     yzg = y8d.udt * 24 - 112;
                     dyt = y8d.ff5 * 24 - 77;
                     fra = y8d.cdb * 24 - 77;
                     o7d = new gdz(b<"r">(11173, 3118111417298688658L ^ var9));
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

                  var4 = "s-\u0096$¯!ÛXYµ\b|Ï\u0090\u008ec.mçg\u001fQ#Q/\u0001`æGú7s¥È\u009d×\u0012ÄûaX\u009f\u0087]«3\u007f\u00ad([Ô\u0084'\u001bÒàIÝ\u008cN£é\u001a$÷\u0093\u0090Î\u007f|I§Ï\u008a\u0080ÿ½\u00adî@9ÔÚ77È\u0085@<";
                  var6 = "s-\u0096$¯!ÛXYµ\b|Ï\u0090\u008ec.mçg\u001fQ#Q/\u0001`æGú7s¥È\u009d×\u0012ÄûaX\u009f\u0087]«3\u007f\u00ad([Ô\u0084'\u001bÒàIÝ\u008cN£é\u001a$÷\u0093\u0090Î\u007f|I§Ï\u008a\u0080ÿ½\u00adî@9ÔÚ77È\u0085@<"
                     .length();
                  var3 = '0';
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

   private static String d(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28194;
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
            throw new RuntimeException("np1", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("np1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
