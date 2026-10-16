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

public class jc0 extends SubEngine {
   private final long jv3;
   private jc0$a_8 a0q;
   private Timer y5z;
   private Timer ys5;
   private Timer c1s;
   private int df2;
   private boolean u52;
   private boolean bnt;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public jc0() {
      long var1 = a ^ 104237582286961L;
      super(a<"s">(17540, 2554115605029170839L ^ var1), a<"s">(28092, 5191700186141820846L ^ var1));
      this.jv3 = 300L;
      this.a0q = null;
      this.y5z = new Timer();
      this.ys5 = new Timer();
      this.c1s = new Timer(300L);
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.df2 = this.wyl.vg8.up_.nb5;
      this.y5z.zay();
      this.ys5.zay();
      this.bnt = true;
   }

   @Override
   public void onRender() {
      super.onRender();
      this.wyl.vg8.lfk = true;
      this.wyl.vg8.up_.nb5 = this.df2;
   }

   private jc0$a_8 ncw(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: astore 3
      // 006: getstatic Scaffold.gxj Ljava/util/List;
      // 009: aload 0
      // 00a: getfield jc0.wyl Lc05;
      // 00d: getfield Minecraft.tij Lkh3;
      // 010: aload 3
      // 011: bipush 0
      // 012: bipush -1
      // 013: bipush 0
      // 014: invokevirtual mew.ec4 (III)Lmew;
      // 017: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 01a: invokeinterface zfz.r_y ()Le0x; 1
      // 01f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 024: iload 2
      // 025: ifne 068
      // 028: ifne 04a
      // 02b: goto 032
      // 02e: invokestatic jc0.a (Loov;)Loov;
      // 031: athrow
      // 032: new jc0$a_8
      // 035: dup
      // 036: aload 0
      // 037: aload 3
      // 038: bipush 0
      // 039: bipush -1
      // 03a: bipush 0
      // 03b: invokevirtual mew.ec4 (III)Lmew;
      // 03e: getstatic vt2.rf3 Lvt2;
      // 041: aconst_null
      // 042: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 045: areturn
      // 046: invokestatic jc0.a (Loov;)Loov;
      // 049: athrow
      // 04a: getstatic Scaffold.gxj Ljava/util/List;
      // 04d: aload 0
      // 04e: getfield jc0.wyl Lc05;
      // 051: getfield Minecraft.tij Lkh3;
      // 054: aload 3
      // 055: bipush -1
      // 056: bipush 0
      // 057: bipush 0
      // 058: invokevirtual mew.ec4 (III)Lmew;
      // 05b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 05e: invokeinterface zfz.r_y ()Le0x; 1
      // 063: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 068: iload 2
      // 069: ifne 0ac
      // 06c: ifne 08e
      // 06f: goto 076
      // 072: invokestatic jc0.a (Loov;)Loov;
      // 075: athrow
      // 076: new jc0$a_8
      // 079: dup
      // 07a: aload 0
      // 07b: aload 3
      // 07c: bipush -1
      // 07d: bipush 0
      // 07e: bipush 0
      // 07f: invokevirtual mew.ec4 (III)Lmew;
      // 082: getstatic vt2.zk4 Lvt2;
      // 085: aconst_null
      // 086: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 089: areturn
      // 08a: invokestatic jc0.a (Loov;)Loov;
      // 08d: athrow
      // 08e: getstatic Scaffold.gxj Ljava/util/List;
      // 091: aload 0
      // 092: getfield jc0.wyl Lc05;
      // 095: getfield Minecraft.tij Lkh3;
      // 098: aload 3
      // 099: bipush 1
      // 09a: bipush 0
      // 09b: bipush 0
      // 09c: invokevirtual mew.ec4 (III)Lmew;
      // 09f: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0a2: invokeinterface zfz.r_y ()Le0x; 1
      // 0a7: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0ac: iload 2
      // 0ad: ifne 0f0
      // 0b0: ifne 0d2
      // 0b3: goto 0ba
      // 0b6: invokestatic jc0.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: new jc0$a_8
      // 0bd: dup
      // 0be: aload 0
      // 0bf: aload 3
      // 0c0: bipush 1
      // 0c1: bipush 0
      // 0c2: bipush 0
      // 0c3: invokevirtual mew.ec4 (III)Lmew;
      // 0c6: getstatic vt2.te4 Lvt2;
      // 0c9: aconst_null
      // 0ca: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 0cd: areturn
      // 0ce: invokestatic jc0.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: getstatic Scaffold.gxj Ljava/util/List;
      // 0d5: aload 0
      // 0d6: getfield jc0.wyl Lc05;
      // 0d9: getfield Minecraft.tij Lkh3;
      // 0dc: aload 3
      // 0dd: bipush 0
      // 0de: bipush 0
      // 0df: bipush -1
      // 0e0: invokevirtual mew.ec4 (III)Lmew;
      // 0e3: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0e6: invokeinterface zfz.r_y ()Le0x; 1
      // 0eb: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0f0: iload 2
      // 0f1: ifne 134
      // 0f4: ifne 116
      // 0f7: goto 0fe
      // 0fa: invokestatic jc0.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: new jc0$a_8
      // 101: dup
      // 102: aload 0
      // 103: aload 3
      // 104: bipush 0
      // 105: bipush 0
      // 106: bipush -1
      // 107: invokevirtual mew.ec4 (III)Lmew;
      // 10a: getstatic vt2.mxp Lvt2;
      // 10d: aconst_null
      // 10e: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 111: areturn
      // 112: invokestatic jc0.a (Loov;)Loov;
      // 115: athrow
      // 116: getstatic Scaffold.gxj Ljava/util/List;
      // 119: aload 0
      // 11a: getfield jc0.wyl Lc05;
      // 11d: getfield Minecraft.tij Lkh3;
      // 120: aload 3
      // 121: bipush 0
      // 122: bipush 0
      // 123: bipush 1
      // 124: invokevirtual mew.ec4 (III)Lmew;
      // 127: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 12a: invokeinterface zfz.r_y ()Le0x; 1
      // 12f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 134: iload 2
      // 135: ifne 180
      // 138: ifne 15a
      // 13b: goto 142
      // 13e: invokestatic jc0.a (Loov;)Loov;
      // 141: athrow
      // 142: new jc0$a_8
      // 145: dup
      // 146: aload 0
      // 147: aload 3
      // 148: bipush 0
      // 149: bipush 0
      // 14a: bipush 1
      // 14b: invokevirtual mew.ec4 (III)Lmew;
      // 14e: getstatic vt2.z9q Lvt2;
      // 151: aconst_null
      // 152: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 155: areturn
      // 156: invokestatic jc0.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 1
      // 15b: bipush -1
      // 15c: bipush 0
      // 15d: bipush 0
      // 15e: invokevirtual mew.ec4 (III)Lmew;
      // 161: astore 3
      // 162: getstatic Scaffold.gxj Ljava/util/List;
      // 165: aload 0
      // 166: getfield jc0.wyl Lc05;
      // 169: getfield Minecraft.tij Lkh3;
      // 16c: aload 3
      // 16d: bipush -1
      // 16e: bipush 0
      // 16f: bipush 0
      // 170: invokevirtual mew.ec4 (III)Lmew;
      // 173: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 176: invokeinterface zfz.r_y ()Le0x; 1
      // 17b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 180: iload 2
      // 181: ifne 1c4
      // 184: ifne 1a6
      // 187: goto 18e
      // 18a: invokestatic jc0.a (Loov;)Loov;
      // 18d: athrow
      // 18e: new jc0$a_8
      // 191: dup
      // 192: aload 0
      // 193: aload 3
      // 194: bipush -1
      // 195: bipush 0
      // 196: bipush 0
      // 197: invokevirtual mew.ec4 (III)Lmew;
      // 19a: getstatic vt2.zk4 Lvt2;
      // 19d: aconst_null
      // 19e: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 1a1: areturn
      // 1a2: invokestatic jc0.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: getstatic Scaffold.gxj Ljava/util/List;
      // 1a9: aload 0
      // 1aa: getfield jc0.wyl Lc05;
      // 1ad: getfield Minecraft.tij Lkh3;
      // 1b0: aload 3
      // 1b1: bipush 1
      // 1b2: bipush 0
      // 1b3: bipush 0
      // 1b4: invokevirtual mew.ec4 (III)Lmew;
      // 1b7: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 1ba: invokeinterface zfz.r_y ()Le0x; 1
      // 1bf: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1c4: iload 2
      // 1c5: ifne 208
      // 1c8: ifne 1ea
      // 1cb: goto 1d2
      // 1ce: invokestatic jc0.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: new jc0$a_8
      // 1d5: dup
      // 1d6: aload 0
      // 1d7: aload 3
      // 1d8: bipush 1
      // 1d9: bipush 0
      // 1da: bipush 0
      // 1db: invokevirtual mew.ec4 (III)Lmew;
      // 1de: getstatic vt2.te4 Lvt2;
      // 1e1: aconst_null
      // 1e2: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 1e5: areturn
      // 1e6: invokestatic jc0.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: getstatic Scaffold.gxj Ljava/util/List;
      // 1ed: aload 0
      // 1ee: getfield jc0.wyl Lc05;
      // 1f1: getfield Minecraft.tij Lkh3;
      // 1f4: aload 3
      // 1f5: bipush 0
      // 1f6: bipush 0
      // 1f7: bipush -1
      // 1f8: invokevirtual mew.ec4 (III)Lmew;
      // 1fb: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 1fe: invokeinterface zfz.r_y ()Le0x; 1
      // 203: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 208: iload 2
      // 209: ifne 24c
      // 20c: ifne 22e
      // 20f: goto 216
      // 212: invokestatic jc0.a (Loov;)Loov;
      // 215: athrow
      // 216: new jc0$a_8
      // 219: dup
      // 21a: aload 0
      // 21b: aload 3
      // 21c: bipush 0
      // 21d: bipush 0
      // 21e: bipush -1
      // 21f: invokevirtual mew.ec4 (III)Lmew;
      // 222: getstatic vt2.mxp Lvt2;
      // 225: aconst_null
      // 226: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 229: areturn
      // 22a: invokestatic jc0.a (Loov;)Loov;
      // 22d: athrow
      // 22e: getstatic Scaffold.gxj Ljava/util/List;
      // 231: aload 0
      // 232: getfield jc0.wyl Lc05;
      // 235: getfield Minecraft.tij Lkh3;
      // 238: aload 3
      // 239: bipush 0
      // 23a: bipush 0
      // 23b: bipush 1
      // 23c: invokevirtual mew.ec4 (III)Lmew;
      // 23f: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 242: invokeinterface zfz.r_y ()Le0x; 1
      // 247: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 24c: iload 2
      // 24d: ifne 298
      // 250: ifne 272
      // 253: goto 25a
      // 256: invokestatic jc0.a (Loov;)Loov;
      // 259: athrow
      // 25a: new jc0$a_8
      // 25d: dup
      // 25e: aload 0
      // 25f: aload 3
      // 260: bipush 0
      // 261: bipush 0
      // 262: bipush 1
      // 263: invokevirtual mew.ec4 (III)Lmew;
      // 266: getstatic vt2.z9q Lvt2;
      // 269: aconst_null
      // 26a: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 26d: areturn
      // 26e: invokestatic jc0.a (Loov;)Loov;
      // 271: athrow
      // 272: aload 1
      // 273: bipush 1
      // 274: bipush 0
      // 275: bipush 0
      // 276: invokevirtual mew.ec4 (III)Lmew;
      // 279: astore 3
      // 27a: getstatic Scaffold.gxj Ljava/util/List;
      // 27d: aload 0
      // 27e: getfield jc0.wyl Lc05;
      // 281: getfield Minecraft.tij Lkh3;
      // 284: aload 3
      // 285: bipush -1
      // 286: bipush 0
      // 287: bipush 0
      // 288: invokevirtual mew.ec4 (III)Lmew;
      // 28b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 28e: invokeinterface zfz.r_y ()Le0x; 1
      // 293: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 298: iload 2
      // 299: ifne 2dc
      // 29c: ifne 2be
      // 29f: goto 2a6
      // 2a2: invokestatic jc0.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: new jc0$a_8
      // 2a9: dup
      // 2aa: aload 0
      // 2ab: aload 3
      // 2ac: bipush -1
      // 2ad: bipush 0
      // 2ae: bipush 0
      // 2af: invokevirtual mew.ec4 (III)Lmew;
      // 2b2: getstatic vt2.zk4 Lvt2;
      // 2b5: aconst_null
      // 2b6: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 2b9: areturn
      // 2ba: invokestatic jc0.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: getstatic Scaffold.gxj Ljava/util/List;
      // 2c1: aload 0
      // 2c2: getfield jc0.wyl Lc05;
      // 2c5: getfield Minecraft.tij Lkh3;
      // 2c8: aload 3
      // 2c9: bipush 1
      // 2ca: bipush 0
      // 2cb: bipush 0
      // 2cc: invokevirtual mew.ec4 (III)Lmew;
      // 2cf: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 2d2: invokeinterface zfz.r_y ()Le0x; 1
      // 2d7: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 2dc: iload 2
      // 2dd: ifne 320
      // 2e0: ifne 302
      // 2e3: goto 2ea
      // 2e6: invokestatic jc0.a (Loov;)Loov;
      // 2e9: athrow
      // 2ea: new jc0$a_8
      // 2ed: dup
      // 2ee: aload 0
      // 2ef: aload 3
      // 2f0: bipush 1
      // 2f1: bipush 0
      // 2f2: bipush 0
      // 2f3: invokevirtual mew.ec4 (III)Lmew;
      // 2f6: getstatic vt2.te4 Lvt2;
      // 2f9: aconst_null
      // 2fa: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 2fd: areturn
      // 2fe: invokestatic jc0.a (Loov;)Loov;
      // 301: athrow
      // 302: getstatic Scaffold.gxj Ljava/util/List;
      // 305: aload 0
      // 306: getfield jc0.wyl Lc05;
      // 309: getfield Minecraft.tij Lkh3;
      // 30c: aload 3
      // 30d: bipush 0
      // 30e: bipush 0
      // 30f: bipush -1
      // 310: invokevirtual mew.ec4 (III)Lmew;
      // 313: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 316: invokeinterface zfz.r_y ()Le0x; 1
      // 31b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 320: iload 2
      // 321: ifne 364
      // 324: ifne 346
      // 327: goto 32e
      // 32a: invokestatic jc0.a (Loov;)Loov;
      // 32d: athrow
      // 32e: new jc0$a_8
      // 331: dup
      // 332: aload 0
      // 333: aload 3
      // 334: bipush 0
      // 335: bipush 0
      // 336: bipush -1
      // 337: invokevirtual mew.ec4 (III)Lmew;
      // 33a: getstatic vt2.mxp Lvt2;
      // 33d: aconst_null
      // 33e: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 341: areturn
      // 342: invokestatic jc0.a (Loov;)Loov;
      // 345: athrow
      // 346: getstatic Scaffold.gxj Ljava/util/List;
      // 349: aload 0
      // 34a: getfield jc0.wyl Lc05;
      // 34d: getfield Minecraft.tij Lkh3;
      // 350: aload 3
      // 351: bipush 0
      // 352: bipush 0
      // 353: bipush 1
      // 354: invokevirtual mew.ec4 (III)Lmew;
      // 357: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 35a: invokeinterface zfz.r_y ()Le0x; 1
      // 35f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 364: iload 2
      // 365: ifne 3b0
      // 368: ifne 38a
      // 36b: goto 372
      // 36e: invokestatic jc0.a (Loov;)Loov;
      // 371: athrow
      // 372: new jc0$a_8
      // 375: dup
      // 376: aload 0
      // 377: aload 3
      // 378: bipush 0
      // 379: bipush 0
      // 37a: bipush 1
      // 37b: invokevirtual mew.ec4 (III)Lmew;
      // 37e: getstatic vt2.z9q Lvt2;
      // 381: aconst_null
      // 382: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 385: areturn
      // 386: invokestatic jc0.a (Loov;)Loov;
      // 389: athrow
      // 38a: aload 1
      // 38b: bipush 0
      // 38c: bipush 0
      // 38d: bipush -1
      // 38e: invokevirtual mew.ec4 (III)Lmew;
      // 391: astore 3
      // 392: getstatic Scaffold.gxj Ljava/util/List;
      // 395: aload 0
      // 396: getfield jc0.wyl Lc05;
      // 399: getfield Minecraft.tij Lkh3;
      // 39c: aload 3
      // 39d: bipush -1
      // 39e: bipush 0
      // 39f: bipush 0
      // 3a0: invokevirtual mew.ec4 (III)Lmew;
      // 3a3: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 3a6: invokeinterface zfz.r_y ()Le0x; 1
      // 3ab: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 3b0: iload 2
      // 3b1: ifne 3f4
      // 3b4: ifne 3d6
      // 3b7: goto 3be
      // 3ba: invokestatic jc0.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: new jc0$a_8
      // 3c1: dup
      // 3c2: aload 0
      // 3c3: aload 3
      // 3c4: bipush -1
      // 3c5: bipush 0
      // 3c6: bipush 0
      // 3c7: invokevirtual mew.ec4 (III)Lmew;
      // 3ca: getstatic vt2.zk4 Lvt2;
      // 3cd: aconst_null
      // 3ce: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 3d1: areturn
      // 3d2: invokestatic jc0.a (Loov;)Loov;
      // 3d5: athrow
      // 3d6: getstatic Scaffold.gxj Ljava/util/List;
      // 3d9: aload 0
      // 3da: getfield jc0.wyl Lc05;
      // 3dd: getfield Minecraft.tij Lkh3;
      // 3e0: aload 3
      // 3e1: bipush 1
      // 3e2: bipush 0
      // 3e3: bipush 0
      // 3e4: invokevirtual mew.ec4 (III)Lmew;
      // 3e7: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 3ea: invokeinterface zfz.r_y ()Le0x; 1
      // 3ef: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 3f4: iload 2
      // 3f5: ifne 438
      // 3f8: ifne 41a
      // 3fb: goto 402
      // 3fe: invokestatic jc0.a (Loov;)Loov;
      // 401: athrow
      // 402: new jc0$a_8
      // 405: dup
      // 406: aload 0
      // 407: aload 3
      // 408: bipush 1
      // 409: bipush 0
      // 40a: bipush 0
      // 40b: invokevirtual mew.ec4 (III)Lmew;
      // 40e: getstatic vt2.te4 Lvt2;
      // 411: aconst_null
      // 412: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 415: areturn
      // 416: invokestatic jc0.a (Loov;)Loov;
      // 419: athrow
      // 41a: getstatic Scaffold.gxj Ljava/util/List;
      // 41d: aload 0
      // 41e: getfield jc0.wyl Lc05;
      // 421: getfield Minecraft.tij Lkh3;
      // 424: aload 3
      // 425: bipush 0
      // 426: bipush 0
      // 427: bipush -1
      // 428: invokevirtual mew.ec4 (III)Lmew;
      // 42b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 42e: invokeinterface zfz.r_y ()Le0x; 1
      // 433: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 438: iload 2
      // 439: ifne 47c
      // 43c: ifne 45e
      // 43f: goto 446
      // 442: invokestatic jc0.a (Loov;)Loov;
      // 445: athrow
      // 446: new jc0$a_8
      // 449: dup
      // 44a: aload 0
      // 44b: aload 3
      // 44c: bipush 0
      // 44d: bipush 0
      // 44e: bipush -1
      // 44f: invokevirtual mew.ec4 (III)Lmew;
      // 452: getstatic vt2.mxp Lvt2;
      // 455: aconst_null
      // 456: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 459: areturn
      // 45a: invokestatic jc0.a (Loov;)Loov;
      // 45d: athrow
      // 45e: getstatic Scaffold.gxj Ljava/util/List;
      // 461: aload 0
      // 462: getfield jc0.wyl Lc05;
      // 465: getfield Minecraft.tij Lkh3;
      // 468: aload 3
      // 469: bipush 0
      // 46a: bipush 0
      // 46b: bipush 1
      // 46c: invokevirtual mew.ec4 (III)Lmew;
      // 46f: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 472: invokeinterface zfz.r_y ()Le0x; 1
      // 477: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 47c: iload 2
      // 47d: ifne 4c8
      // 480: ifne 4a2
      // 483: goto 48a
      // 486: invokestatic jc0.a (Loov;)Loov;
      // 489: athrow
      // 48a: new jc0$a_8
      // 48d: dup
      // 48e: aload 0
      // 48f: aload 3
      // 490: bipush 0
      // 491: bipush 0
      // 492: bipush 1
      // 493: invokevirtual mew.ec4 (III)Lmew;
      // 496: getstatic vt2.z9q Lvt2;
      // 499: aconst_null
      // 49a: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 49d: areturn
      // 49e: invokestatic jc0.a (Loov;)Loov;
      // 4a1: athrow
      // 4a2: aload 1
      // 4a3: bipush 0
      // 4a4: bipush 0
      // 4a5: bipush 1
      // 4a6: invokevirtual mew.ec4 (III)Lmew;
      // 4a9: astore 3
      // 4aa: getstatic Scaffold.gxj Ljava/util/List;
      // 4ad: aload 0
      // 4ae: getfield jc0.wyl Lc05;
      // 4b1: getfield Minecraft.tij Lkh3;
      // 4b4: aload 3
      // 4b5: bipush -1
      // 4b6: bipush 0
      // 4b7: bipush 0
      // 4b8: invokevirtual mew.ec4 (III)Lmew;
      // 4bb: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 4be: invokeinterface zfz.r_y ()Le0x; 1
      // 4c3: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 4c8: iload 2
      // 4c9: ifne 50c
      // 4cc: ifne 4ee
      // 4cf: goto 4d6
      // 4d2: invokestatic jc0.a (Loov;)Loov;
      // 4d5: athrow
      // 4d6: new jc0$a_8
      // 4d9: dup
      // 4da: aload 0
      // 4db: aload 3
      // 4dc: bipush -1
      // 4dd: bipush 0
      // 4de: bipush 0
      // 4df: invokevirtual mew.ec4 (III)Lmew;
      // 4e2: getstatic vt2.zk4 Lvt2;
      // 4e5: aconst_null
      // 4e6: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 4e9: areturn
      // 4ea: invokestatic jc0.a (Loov;)Loov;
      // 4ed: athrow
      // 4ee: getstatic Scaffold.gxj Ljava/util/List;
      // 4f1: aload 0
      // 4f2: getfield jc0.wyl Lc05;
      // 4f5: getfield Minecraft.tij Lkh3;
      // 4f8: aload 3
      // 4f9: bipush 1
      // 4fa: bipush 0
      // 4fb: bipush 0
      // 4fc: invokevirtual mew.ec4 (III)Lmew;
      // 4ff: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 502: invokeinterface zfz.r_y ()Le0x; 1
      // 507: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 50c: iload 2
      // 50d: ifne 550
      // 510: ifne 532
      // 513: goto 51a
      // 516: invokestatic jc0.a (Loov;)Loov;
      // 519: athrow
      // 51a: new jc0$a_8
      // 51d: dup
      // 51e: aload 0
      // 51f: aload 3
      // 520: bipush 1
      // 521: bipush 0
      // 522: bipush 0
      // 523: invokevirtual mew.ec4 (III)Lmew;
      // 526: getstatic vt2.te4 Lvt2;
      // 529: aconst_null
      // 52a: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 52d: areturn
      // 52e: invokestatic jc0.a (Loov;)Loov;
      // 531: athrow
      // 532: getstatic Scaffold.gxj Ljava/util/List;
      // 535: aload 0
      // 536: getfield jc0.wyl Lc05;
      // 539: getfield Minecraft.tij Lkh3;
      // 53c: aload 3
      // 53d: bipush 0
      // 53e: bipush 0
      // 53f: bipush -1
      // 540: invokevirtual mew.ec4 (III)Lmew;
      // 543: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 546: invokeinterface zfz.r_y ()Le0x; 1
      // 54b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 550: iload 2
      // 551: ifne 594
      // 554: ifne 576
      // 557: goto 55e
      // 55a: invokestatic jc0.a (Loov;)Loov;
      // 55d: athrow
      // 55e: new jc0$a_8
      // 561: dup
      // 562: aload 0
      // 563: aload 3
      // 564: bipush 0
      // 565: bipush 0
      // 566: bipush -1
      // 567: invokevirtual mew.ec4 (III)Lmew;
      // 56a: getstatic vt2.mxp Lvt2;
      // 56d: aconst_null
      // 56e: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 571: areturn
      // 572: invokestatic jc0.a (Loov;)Loov;
      // 575: athrow
      // 576: getstatic Scaffold.gxj Ljava/util/List;
      // 579: aload 0
      // 57a: getfield jc0.wyl Lc05;
      // 57d: getfield Minecraft.tij Lkh3;
      // 580: aload 3
      // 581: bipush 0
      // 582: bipush 0
      // 583: bipush 1
      // 584: invokevirtual mew.ec4 (III)Lmew;
      // 587: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 58a: invokeinterface zfz.r_y ()Le0x; 1
      // 58f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 594: ifne 5af
      // 597: new jc0$a_8
      // 59a: dup
      // 59b: aload 0
      // 59c: aload 3
      // 59d: bipush 0
      // 59e: bipush 0
      // 59f: bipush 1
      // 5a0: invokevirtual mew.ec4 (III)Lmew;
      // 5a3: getstatic vt2.z9q Lvt2;
      // 5a6: aconst_null
      // 5a7: invokespecial jc0$a_8.<init> (Ljc0;Lmew;Lvt2;Ljc0$1;)V
      // 5aa: areturn
      // 5ab: invokestatic jc0.a (Loov;)Loov;
      // 5ae: athrow
      // 5af: aconst_null
      // 5b0: areturn
   }

   @EventHandler(
      jn1 = 0
   )
   public void q8i(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual PlayerUpdateEvent.lhw ()Z
      // 008: iload 2
      // 009: ifeq 02f
      // 00c: ifeq 020
      // 00f: goto 016
      // 012: invokestatic jc0.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: bipush 0
      // 018: putfield jc0.u52 Z
      // 01b: return
      // 01c: invokestatic jc0.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aconst_null
      // 022: putfield jc0.a0q Ljc0$a_8;
      // 025: aload 0
      // 026: getfield jc0.wyl Lc05;
      // 029: getfield Minecraft.vg8 Ll86;
      // 02c: invokevirtual EntityPlayerSP.hzv ()Z
      // 02f: iload 2
      // 030: ifeq 048
      // 033: ifne 1ce
      // 036: goto 03d
      // 039: invokestatic jc0.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: invokespecial jc0.kid ()Z
      // 041: goto 048
      // 044: invokestatic jc0.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 2
      // 049: ifeq 072
      // 04c: ifeq 1ce
      // 04f: goto 056
      // 052: invokestatic jc0.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: getfield jc0.wyl Lc05;
      // 05a: getfield Minecraft.vg8 Ll86;
      // 05d: iload 2
      // 05e: ifeq 083
      // 061: goto 068
      // 064: invokestatic jc0.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield EntityPlayerSP.lfk Z
      // 06b: goto 072
      // 06e: invokestatic jc0.a (Loov;)Loov;
      // 071: athrow
      // 072: ifeq 14a
      // 075: aload 0
      // 076: getfield jc0.wyl Lc05;
      // 079: getfield Minecraft.vg8 Ll86;
      // 07c: goto 083
      // 07f: invokestatic jc0.a (Loov;)Loov;
      // 082: athrow
      // 083: getfield EntityPlayerSP.x5k F
      // 086: ldc 90.0
      // 088: nop
      // 089: fadd
      // 08a: f2d
      // 08b: invokestatic java/lang/Math.toRadians (D)D
      // 08e: invokestatic java/lang/Math.cos (D)D
      // 091: dstore 4
      // 093: aload 0
      // 094: getfield jc0.wyl Lc05;
      // 097: getfield Minecraft.vg8 Ll86;
      // 09a: getfield EntityPlayerSP.x5k F
      // 09d: ldc 90.0
      // 09f: nop
      // 0a0: fadd
      // 0a1: f2d
      // 0a2: invokestatic java/lang/Math.toRadians (D)D
      // 0a5: invokestatic java/lang/Math.sin (D)D
      // 0a8: dstore 6
      // 0aa: aload 0
      // 0ab: getfield jc0.wyl Lc05;
      // 0ae: getfield Minecraft.vg8 Ll86;
      // 0b1: getfield EntityPlayerSP.g9g Lboa;
      // 0b4: getfield boa._mw F
      // 0b7: f2d
      // 0b8: ldc2_w 0.4
      // 0bb: dmul
      // 0bc: dload 4
      // 0be: dmul
      // 0bf: dstore 8
      // 0c1: dload 8
      // 0c3: aload 0
      // 0c4: getfield jc0.wyl Lc05;
      // 0c7: getfield Minecraft.vg8 Ll86;
      // 0ca: getfield EntityPlayerSP.g9g Lboa;
      // 0cd: getfield boa.lrp F
      // 0d0: f2d
      // 0d1: ldc2_w 0.4
      // 0d4: dmul
      // 0d5: dload 6
      // 0d7: dmul
      // 0d8: dadd
      // 0d9: dstore 10
      // 0db: aload 0
      // 0dc: getfield jc0.wyl Lc05;
      // 0df: getfield Minecraft.vg8 Ll86;
      // 0e2: getfield EntityPlayerSP.g9g Lboa;
      // 0e5: getfield boa._mw F
      // 0e8: f2d
      // 0e9: ldc2_w 0.4
      // 0ec: dmul
      // 0ed: dload 6
      // 0ef: dmul
      // 0f0: dstore 8
      // 0f2: dload 8
      // 0f4: aload 0
      // 0f5: getfield jc0.wyl Lc05;
      // 0f8: getfield Minecraft.vg8 Ll86;
      // 0fb: getfield EntityPlayerSP.g9g Lboa;
      // 0fe: getfield boa.lrp F
      // 101: f2d
      // 102: ldc2_w 0.4
      // 105: dmul
      // 106: dload 4
      // 108: dmul
      // 109: dsub
      // 10a: dstore 12
      // 10c: aload 0
      // 10d: getfield jc0.wyl Lc05;
      // 110: getfield Minecraft.vg8 Ll86;
      // 113: getfield EntityPlayerSP.o2v D
      // 116: dload 10
      // 118: dadd
      // 119: dstore 14
      // 11b: aload 0
      // 11c: getfield jc0.wyl Lc05;
      // 11f: getfield Minecraft.vg8 Ll86;
      // 122: getfield EntityPlayerSP.kfp D
      // 125: dconst_1
      // 126: dsub
      // 127: dstore 16
      // 129: aload 0
      // 12a: getfield jc0.wyl Lc05;
      // 12d: getfield Minecraft.vg8 Ll86;
      // 130: getfield EntityPlayerSP.vbd D
      // 133: dload 12
      // 135: dadd
      // 136: dstore 18
      // 138: new mew
      // 13b: dup
      // 13c: dload 14
      // 13e: dload 16
      // 140: dload 18
      // 142: invokespecial mew.<init> (DDD)V
      // 145: astore 3
      // 146: iload 2
      // 147: ifne 175
      // 14a: new mew
      // 14d: dup
      // 14e: aload 0
      // 14f: getfield jc0.wyl Lc05;
      // 152: invokevirtual Minecraft.nsd ()Li2h;
      // 155: getfield EntityLivingBase.o2v D
      // 158: aload 0
      // 159: getfield jc0.wyl Lc05;
      // 15c: invokevirtual Minecraft.nsd ()Li2h;
      // 15f: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 162: getfield nh4.bx_ D
      // 165: dconst_1
      // 166: dsub
      // 167: aload 0
      // 168: getfield jc0.wyl Lc05;
      // 16b: invokevirtual Minecraft.nsd ()Li2h;
      // 16e: getfield EntityLivingBase.vbd D
      // 171: invokespecial mew.<init> (DDD)V
      // 174: astore 3
      // 175: aload 0
      // 176: iload 2
      // 177: ifeq 1a7
      // 17a: getfield jc0.wyl Lc05;
      // 17d: getfield Minecraft.tij Lkh3;
      // 180: aload 3
      // 181: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 184: invokeinterface zfz.r_y ()Le0x; 1
      // 189: getstatic ox_.ibw Le0x;
      // 18c: if_acmpne 1ce
      // 18f: goto 196
      // 192: invokestatic jc0.a (Loov;)Loov;
      // 195: athrow
      // 196: aload 0
      // 197: aload 0
      // 198: aload 3
      // 199: invokespecial jc0.ncw (Lmew;)Ljc0$a_8;
      // 19c: putfield jc0.a0q Ljc0$a_8;
      // 19f: aload 0
      // 1a0: goto 1a7
      // 1a3: invokestatic jc0.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: getfield jc0.a0q Ljc0$a_8;
      // 1aa: getfield jc0$a_8.mb3 Lmew;
      // 1ad: aload 0
      // 1ae: getfield jc0.a0q Ljc0$a_8;
      // 1b1: getfield jc0$a_8.a0r Lvt2;
      // 1b4: invokestatic omb.ln0 (Lmew;Lvt2;)[F
      // 1b7: astore 4
      // 1b9: aload 1
      // 1ba: aload 4
      // 1bc: bipush 0
      // 1bd: faload
      // 1be: invokevirtual PlayerUpdateEvent.h8j (F)V
      // 1c1: aload 1
      // 1c2: aload 4
      // 1c4: bipush 1
      // 1c5: faload
      // 1c6: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 1c9: aload 0
      // 1ca: bipush 1
      // 1cb: putfield jc0.u52 Z
      // 1ce: return
   }

   @EventHandler(
      jn1 = 3
   )
   public void s7_(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 021
      // 009: getfield jc0.u52 Z
      // 00c: ifne 01b
      // 00f: goto 016
      // 012: invokestatic jc0.a (Loov;)Loov;
      // 015: athrow
      // 016: return
      // 017: invokestatic jc0.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 0
      // 01c: bipush 0
      // 01d: putfield jc0.u52 Z
      // 020: aload 0
      // 021: iload 2
      // 022: ifeq 03a
      // 025: getfield jc0.a0q Ljc0$a_8;
      // 028: ifnull 253
      // 02b: goto 032
      // 02e: invokestatic jc0.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: goto 03a
      // 036: invokestatic jc0.a (Loov;)Loov;
      // 039: athrow
      // 03a: getfield jc0.wyl Lc05;
      // 03d: getfield Minecraft.vg8 Ll86;
      // 040: getfield EntityPlayerSP.up_ Ljnq;
      // 043: invokevirtual jnq.dxs ()Lerg;
      // 046: iload 2
      // 047: ifeq 068
      // 04a: ifnull 253
      // 04d: goto 054
      // 050: invokestatic jc0.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: getfield jc0.wyl Lc05;
      // 058: getfield Minecraft.vg8 Ll86;
      // 05b: getfield EntityPlayerSP.up_ Ljnq;
      // 05e: invokevirtual jnq.dxs ()Lerg;
      // 061: goto 068
      // 064: invokestatic jc0.a (Loov;)Loov;
      // 067: athrow
      // 068: invokevirtual erg.gn1 ()Lu7m;
      // 06b: instanceof gun
      // 06e: iload 2
      // 06f: ifeq 093
      // 072: ifeq 253
      // 075: goto 07c
      // 078: invokestatic jc0.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield jc0.wyl Lc05;
      // 080: getfield Minecraft.vg8 Ll86;
      // 083: getfield EntityPlayerSP.up_ Ljnq;
      // 086: invokevirtual jnq.dxs ()Lerg;
      // 089: getfield erg.qd2 I
      // 08c: goto 093
      // 08f: invokestatic jc0.a (Loov;)Loov;
      // 092: athrow
      // 093: iload 2
      // 094: ifeq 0b2
      // 097: ifle 253
      // 09a: goto 0a1
      // 09d: invokestatic jc0.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield jc0.y5z Lnhs;
      // 0a5: ldc2_w 70.0
      // 0a8: invokevirtual Timer.yrv (D)Z
      // 0ab: goto 0b2
      // 0ae: invokestatic jc0.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: iload 2
      // 0b3: ifeq 0d1
      // 0b6: ifeq 253
      // 0b9: goto 0c0
      // 0bc: invokestatic jc0.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: getfield jc0.c1s Lnhs;
      // 0c4: ldc2_w 300.0
      // 0c7: invokevirtual Timer.yrv (D)Z
      // 0ca: goto 0d1
      // 0cd: invokestatic jc0.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 2
      // 0d2: ifeq 112
      // 0d5: ifeq 253
      // 0d8: goto 0df
      // 0db: invokestatic jc0.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: getfield jc0.y5z Lnhs;
      // 0e3: invokevirtual Timer.zay ()V
      // 0e6: aload 0
      // 0e7: getfield jc0.wyl Lc05;
      // 0ea: getfield Minecraft.vg8 Ll86;
      // 0ed: invokevirtual EntityPlayerSP.hgb ()V
      // 0f0: aload 0
      // 0f1: aload 0
      // 0f2: getfield jc0.a0q Ljc0$a_8;
      // 0f5: getfield jc0$a_8.mb3 Lmew;
      // 0f8: aload 0
      // 0f9: getfield jc0.a0q Ljc0$a_8;
      // 0fc: getfield jc0$a_8.a0r Lvt2;
      // 0ff: invokespecial jc0.e11 (Lmew;Lvt2;)V
      // 102: getstatic Scaffold.xor Lcn7;
      // 105: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 108: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10b: goto 112
      // 10e: invokestatic jc0.a (Loov;)Loov;
      // 111: athrow
      // 112: iload 2
      // 113: ifeq 13f
      // 116: ifeq 253
      // 119: goto 120
      // 11c: invokestatic jc0.a (Loov;)Loov;
      // 11f: athrow
      // 120: aload 0
      // 121: getfield jc0.wyl Lc05;
      // 124: getfield Minecraft.vg8 Ll86;
      // 127: getfield EntityPlayerSP.kfp D
      // 12a: aload 0
      // 12b: getfield jc0.a0q Ljc0$a_8;
      // 12e: getfield jc0$a_8.mb3 Lmew;
      // 131: invokevirtual mew.getY ()I
      // 134: bipush 1
      // 135: iadd
      // 136: i2d
      // 137: dcmpl
      // 138: goto 13f
      // 13b: invokestatic jc0.a (Loov;)Loov;
      // 13e: athrow
      // 13f: iload 2
      // 140: ifeq 161
      // 143: ifeq 253
      // 146: goto 14d
      // 149: invokestatic jc0.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield jc0.wyl Lc05;
      // 151: getfield Minecraft.vg8 Ll86;
      // 154: getfield EntityPlayerSP.g9g Lboa;
      // 157: getfield boa.s0a Z
      // 15a: goto 161
      // 15d: invokestatic jc0.a (Loov;)Loov;
      // 160: athrow
      // 161: iload 2
      // 162: ifeq 18b
      // 165: ifeq 253
      // 168: goto 16f
      // 16b: invokestatic jc0.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 0
      // 170: iload 2
      // 171: ifeq 18f
      // 174: goto 17b
      // 177: invokestatic jc0.a (Loov;)Loov;
      // 17a: athrow
      // 17b: getfield jc0.c1s Lnhs;
      // 17e: ldc2_w 300.0
      // 181: invokevirtual Timer.yrv (D)Z
      // 184: goto 18b
      // 187: invokestatic jc0.a (Loov;)Loov;
      // 18a: athrow
      // 18b: ifeq 253
      // 18e: aload 0
      // 18f: getfield jc0.wyl Lc05;
      // 192: getfield Minecraft.vg8 Ll86;
      // 195: getfield EntityPlayerSP.up_ Ljnq;
      // 198: invokevirtual jnq.dxs ()Lerg;
      // 19b: iload 2
      // 19c: ifeq 1bd
      // 19f: ifnull 253
      // 1a2: goto 1a9
      // 1a5: invokestatic jc0.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: getfield jc0.wyl Lc05;
      // 1ad: getfield Minecraft.vg8 Ll86;
      // 1b0: getfield EntityPlayerSP.up_ Ljnq;
      // 1b3: invokevirtual jnq.dxs ()Lerg;
      // 1b6: goto 1bd
      // 1b9: invokestatic jc0.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: invokevirtual erg.gn1 ()Lu7m;
      // 1c0: instanceof gun
      // 1c3: iload 2
      // 1c4: ifeq 1f3
      // 1c7: ifeq 253
      // 1ca: goto 1d1
      // 1cd: invokestatic jc0.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: getfield jc0.wyl Lc05;
      // 1d5: getfield Minecraft.vg8 Ll86;
      // 1d8: iload 2
      // 1d9: ifeq 250
      // 1dc: goto 1e3
      // 1df: invokestatic jc0.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: getfield EntityPlayerSP.up_ Ljnq;
      // 1e6: invokevirtual jnq.dxs ()Lerg;
      // 1e9: getfield erg.qd2 I
      // 1ec: goto 1f3
      // 1ef: invokestatic jc0.a (Loov;)Loov;
      // 1f2: athrow
      // 1f3: ifle 253
      // 1f6: aload 0
      // 1f7: getfield jc0.wyl Lc05;
      // 1fa: getfield Minecraft.vg8 Ll86;
      // 1fd: aload 0
      // 1fe: getfield jc0.wyl Lc05;
      // 201: getfield Minecraft.vg8 Ll86;
      // 204: getfield EntityPlayerSP.o2v D
      // 207: aload 0
      // 208: getfield jc0.a0q Ljc0$a_8;
      // 20b: getfield jc0$a_8.mb3 Lmew;
      // 20e: invokevirtual mew.getY ()I
      // 211: bipush 2
      // 212: iadd
      // 213: i2d
      // 214: aload 0
      // 215: getfield jc0.wyl Lc05;
      // 218: getfield Minecraft.vg8 Ll86;
      // 21b: getfield EntityPlayerSP.vbd D
      // 21e: invokevirtual EntityPlayerSP.m6_ (DDD)V
      // 221: aload 0
      // 222: getfield jc0.wyl Lc05;
      // 225: getfield Minecraft.vg8 Ll86;
      // 228: dconst_0
      // 229: putfield EntityPlayerSP.mop D
      // 22c: aload 0
      // 22d: getfield jc0.wyl Lc05;
      // 230: getfield Minecraft.vg8 Ll86;
      // 233: dconst_0
      // 234: putfield EntityPlayerSP.icv D
      // 237: aload 0
      // 238: getfield jc0.wyl Lc05;
      // 23b: getfield Minecraft.vg8 Ll86;
      // 23e: dconst_0
      // 23f: putfield EntityPlayerSP.bw4 D
      // 242: aload 0
      // 243: getfield jc0.wyl Lc05;
      // 246: getfield Minecraft.vg8 Ll86;
      // 249: goto 250
      // 24c: invokestatic jc0.a (Loov;)Loov;
      // 24f: athrow
      // 250: invokevirtual EntityPlayerSP.xv1 ()V
      // 253: return
   }

   @EventHandler
   public void pxw(b4u param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: bipush 0
      // 006: invokespecial jc0.tup (Z)I
      // 009: istore 3
      // 00a: iload 3
      // 00b: bipush -1
      // 00c: if_icmpne 014
      // 00f: return
      // 010: invokestatic jc0.a (Loov;)Loov;
      // 013: athrow
      // 014: aload 0
      // 015: getfield jc0.wyl Lc05;
      // 018: getfield Minecraft.vg8 Ll86;
      // 01b: getfield EntityPlayerSP.up_ Ljnq;
      // 01e: invokevirtual jnq.dxs ()Lerg;
      // 021: iload 2
      // 022: ifne 043
      // 025: ifnull 06e
      // 028: goto 02f
      // 02b: invokestatic jc0.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield jc0.wyl Lc05;
      // 033: getfield Minecraft.vg8 Ll86;
      // 036: getfield EntityPlayerSP.up_ Ljnq;
      // 039: invokevirtual jnq.dxs ()Lerg;
      // 03c: goto 043
      // 03f: invokestatic jc0.a (Loov;)Loov;
      // 042: athrow
      // 043: invokevirtual erg.gn1 ()Lu7m;
      // 046: instanceof gun
      // 049: iload 2
      // 04a: ifne 070
      // 04d: ifeq 06e
      // 050: goto 057
      // 053: invokestatic jc0.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: getfield jc0.wyl Lc05;
      // 05b: getfield Minecraft.vg8 Ll86;
      // 05e: getfield EntityPlayerSP.up_ Ljnq;
      // 061: invokevirtual jnq.dxs ()Lerg;
      // 064: getfield erg.qd2 I
      // 067: goto 071
      // 06a: invokestatic jc0.a (Loov;)Loov;
      // 06d: athrow
      // 06e: ldc 9999999
      // 070: nop
      // 071: istore 4
      // 073: bipush 2
      // 074: istore 5
      // 076: aload 0
      // 077: getfield jc0.wyl Lc05;
      // 07a: getfield Minecraft.vg8 Ll86;
      // 07d: getfield EntityPlayerSP.up_ Ljnq;
      // 080: invokevirtual jnq.dxs ()Lerg;
      // 083: iload 2
      // 084: ifne 0a5
      // 087: ifnull 0d1
      // 08a: goto 091
      // 08d: invokestatic jc0.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 0
      // 092: getfield jc0.wyl Lc05;
      // 095: getfield Minecraft.vg8 Ll86;
      // 098: getfield EntityPlayerSP.up_ Ljnq;
      // 09b: invokevirtual jnq.dxs ()Lerg;
      // 09e: goto 0a5
      // 0a1: invokestatic jc0.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: invokevirtual erg.gn1 ()Lu7m;
      // 0a8: instanceof gun
      // 0ab: iload 2
      // 0ac: ifne 0d2
      // 0af: ifeq 0d1
      // 0b2: goto 0b9
      // 0b5: invokestatic jc0.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: iload 4
      // 0bb: bipush 2
      // 0bc: iload 2
      // 0bd: ifne 0df
      // 0c0: goto 0c7
      // 0c3: invokestatic jc0.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: if_icmpgt 1ad
      // 0ca: goto 0d1
      // 0cd: invokestatic jc0.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 3
      // 0d2: iload 2
      // 0d3: ifne 116
      // 0d6: bipush 8
      // 0d8: goto 0df
      // 0db: invokestatic jc0.a (Loov;)Loov;
      // 0de: athrow
      // 0df: if_icmpgt 0fa
      // 0e2: iload 4
      // 0e4: bipush 2
      // 0e5: iload 2
      // 0e6: ifne 14d
      // 0e9: goto 0f0
      // 0ec: invokestatic jc0.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: if_icmpgt 138
      // 0f3: goto 0fa
      // 0f6: invokestatic jc0.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: getfield jc0.ys5 Lnhs;
      // 0fe: iload 2
      // 0ff: ifne 131
      // 102: goto 109
      // 105: invokestatic jc0.a (Loov;)Loov;
      // 108: athrow
      // 109: ldc2_w 350.0
      // 10c: invokevirtual Timer.yrv (D)Z
      // 10f: goto 116
      // 112: invokestatic jc0.a (Loov;)Loov;
      // 115: athrow
      // 116: ifeq 1ad
      // 119: aload 0
      // 11a: aload 0
      // 11b: bipush 1
      // 11c: invokespecial jc0.tup (Z)I
      // 11f: aload 0
      // 120: invokespecial jc0.tz9 ()I
      // 123: invokevirtual jc0.meb (II)V
      // 126: aload 0
      // 127: getfield jc0.ys5 Lnhs;
      // 12a: goto 131
      // 12d: invokestatic jc0.a (Loov;)Loov;
      // 130: athrow
      // 131: invokevirtual Timer.zay ()V
      // 134: iload 2
      // 135: ifeq 1ad
      // 138: iload 3
      // 139: iload 2
      // 13a: ifne 18c
      // 13d: goto 144
      // 140: invokestatic jc0.a (Loov;)Loov;
      // 143: athrow
      // 144: bipush 9
      // 146: goto 14d
      // 149: invokestatic jc0.a (Loov;)Loov;
      // 14c: athrow
      // 14d: if_icmpge 1ad
      // 150: aload 0
      // 151: getfield jc0.wyl Lc05;
      // 154: getfield Minecraft.vg8 Ll86;
      // 157: getfield EntityPlayerSP.up_ Ljnq;
      // 15a: iload 3
      // 15b: putfield jnq.nb5 I
      // 15e: aload 0
      // 15f: getfield jc0.wyl Lc05;
      // 162: getfield Minecraft.vg8 Ll86;
      // 165: getfield EntityPlayerSP.lq7 Lp_k;
      // 168: invokevirtual p_k._m3 ()Lhv0;
      // 16b: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 16e: dup
      // 16f: iload 3
      // 170: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 173: invokevirtual hv0.k7f (Lmz2;)V
      // 176: aload 0
      // 177: iload 2
      // 178: ifne 1a7
      // 17b: goto 182
      // 17e: invokestatic jc0.a (Loov;)Loov;
      // 181: athrow
      // 182: getfield jc0.bnt Z
      // 185: goto 18c
      // 188: invokestatic jc0.a (Loov;)Loov;
      // 18b: athrow
      // 18c: ifeq 19f
      // 18f: aload 0
      // 190: bipush 0
      // 191: putfield jc0.bnt Z
      // 194: iload 2
      // 195: ifeq 1ad
      // 198: goto 19f
      // 19b: invokestatic jc0.a (Loov;)Loov;
      // 19e: athrow
      // 19f: aload 0
      // 1a0: goto 1a7
      // 1a3: invokestatic jc0.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: getfield jc0.c1s Lnhs;
      // 1aa: invokevirtual Timer.zay ()V
      // 1ad: return
   }

   private int tz9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: bipush 8
      // 09: if_icmpge 36
      // 0c: aload 0
      // 0d: getfield jc0.wyl Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.up_ Ljnq;
      // 16: iload 1
      // 17: ifeq 40
      // 1a: getfield jnq.c41 [Lerg;
      // 1d: iload 2
      // 1e: aaload
      // 1f: ifnonnull 2f
      // 22: goto 29
      // 25: invokestatic jc0.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 2
      // 2a: ireturn
      // 2b: invokestatic jc0.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iinc 2 1
      // 32: iload 1
      // 33: ifne 06
      // 36: aload 0
      // 37: getfield jc0.wyl Lc05;
      // 3a: getfield Minecraft.vg8 Ll86;
      // 3d: getfield EntityPlayerSP.up_ Ljnq;
      // 40: getfield jnq.nb5 I
      // 43: aload 0
      // 44: getfield jc0.wyl Lc05;
      // 47: getfield Minecraft.vg8 Ll86;
      // 4a: getfield EntityPlayerSP.up_ Ljnq;
      // 4d: iload 1
      // 4e: ifeq 70
      // 51: invokevirtual jnq.dxs ()Lerg;
      // 54: ifnonnull 66
      // 57: goto 5e
      // 5a: invokestatic jc0.a (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 0
      // 5f: goto 8f
      // 62: invokestatic jc0.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: getfield jc0.wyl Lc05;
      // 6a: getfield Minecraft.vg8 Ll86;
      // 6d: getfield EntityPlayerSP.up_ Ljnq;
      // 70: getfield jnq.nb5 I
      // 73: iload 1
      // 74: ifeq 8b
      // 77: bipush 8
      // 79: if_icmpge 8e
      // 7c: goto 83
      // 7f: invokestatic jc0.a (Loov;)Loov;
      // 82: athrow
      // 83: bipush 1
      // 84: goto 8b
      // 87: invokestatic jc0.a (Loov;)Loov;
      // 8a: athrow
      // 8b: goto 8f
      // 8e: bipush -1
      // 8f: iadd
      // 90: ireturn
   }

   @EventHandler
   public void imi(b4u param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield jc0.wyl Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: getfield EntityPlayerSP.up_ Ljnq;
      // 0e: invokevirtual jnq.dxs ()Lerg;
      // 11: iload 2
      // 12: ifeq 3e
      // 15: ifnull 67
      // 18: goto 1f
      // 1b: invokestatic jc0.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield jc0.wyl Lc05;
      // 23: getfield Minecraft.vg8 Ll86;
      // 26: getfield EntityPlayerSP.up_ Ljnq;
      // 29: iload 2
      // 2a: ifeq 55
      // 2d: goto 34
      // 30: invokestatic jc0.a (Loov;)Loov;
      // 33: athrow
      // 34: invokevirtual jnq.dxs ()Lerg;
      // 37: goto 3e
      // 3a: invokestatic jc0.a (Loov;)Loov;
      // 3d: athrow
      // 3e: getfield erg.qd2 I
      // 41: ifgt 67
      // 44: aload 0
      // 45: getfield jc0.wyl Lc05;
      // 48: getfield Minecraft.vg8 Ll86;
      // 4b: getfield EntityPlayerSP.up_ Ljnq;
      // 4e: goto 55
      // 51: invokestatic jc0.a (Loov;)Loov;
      // 54: athrow
      // 55: getfield jnq.c41 [Lerg;
      // 58: aload 0
      // 59: getfield jc0.wyl Lc05;
      // 5c: getfield Minecraft.vg8 Ll86;
      // 5f: getfield EntityPlayerSP.up_ Ljnq;
      // 62: getfield jnq.nb5 I
      // 65: aconst_null
      // 66: aastore
      // 67: return
   }

   public void meb(int var1, int var2) {
      this.wyl.l7q.efg(this.wyl.vg8.fv9.h7l, var1, var2, 2, this.wyl.vg8);
   }

   private int tup(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: bipush 36
      // 09: if_icmpge 99
      // 0c: aload 0
      // 0d: getfield jc0.wyl Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.up_ Ljnq;
      // 16: getfield jnq.c41 [Lerg;
      // 19: iload 3
      // 1a: aaload
      // 1b: iload 2
      // 1c: ifeq 3f
      // 1f: ifnull 92
      // 22: goto 29
      // 25: invokestatic jc0.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield jc0.wyl Lc05;
      // 2d: getfield Minecraft.vg8 Ll86;
      // 30: getfield EntityPlayerSP.up_ Ljnq;
      // 33: getfield jnq.c41 [Lerg;
      // 36: iload 3
      // 37: aaload
      // 38: goto 3f
      // 3b: invokestatic jc0.a (Loov;)Loov;
      // 3e: athrow
      // 3f: astore 4
      // 41: iload 1
      // 42: iload 2
      // 43: ifeq 7f
      // 46: ifeq 7a
      // 49: goto 50
      // 4c: invokestatic jc0.a (Loov;)Loov;
      // 4f: athrow
      // 50: iload 3
      // 51: iload 2
      // 52: ifeq 7f
      // 55: goto 5c
      // 58: invokestatic jc0.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: getfield jc0.wyl Lc05;
      // 60: getfield Minecraft.vg8 Ll86;
      // 63: getfield EntityPlayerSP.up_ Ljnq;
      // 66: getfield jnq.nb5 I
      // 69: if_icmpne 7a
      // 6c: goto 73
      // 6f: invokestatic jc0.a (Loov;)Loov;
      // 72: athrow
      // 73: goto 92
      // 76: invokestatic jc0.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 4
      // 7c: invokestatic Scaffold.unh (Lerg;)Z
      // 7f: iload 2
      // 80: ifeq 91
      // 83: ifne 90
      // 86: goto 8d
      // 89: invokestatic jc0.a (Loov;)Loov;
      // 8c: athrow
      // 8d: goto 92
      // 90: iload 3
      // 91: ireturn
      // 92: iinc 3 1
      // 95: iload 2
      // 96: ifne 06
      // 99: bipush -1
      // 9a: ireturn
   }

   private void e11(mew var1, vt2 var2) {
      int var3 = OpaquePredicate.b();
      erg var4 = this.wyl.vg8.up_.dxs();

      erg var10000;
      label22: {
         try {
            var10000 = var4;
            if (var3 == 0) {
               break label22;
            }

            if (var4 == null) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = this.wyl.vg8.up_.c41[this.wyl.vg8.up_.nb5];
      }

      var10000.qd2--;
      this.wyl.l7q.onPlayerRightClick(this.wyl.vg8, this.wyl.tij, var4, var1, var2, new fqr((double)var1.getX(), (double)var1.getY(), (double)var1.getZ()));
   }

   @EventHandler
   public void v_p(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: getstatic Scaffold.yqi Lcn7;
      // 07: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifne 36
      // 11: ifne 1c
      // 14: goto 1b
      // 17: invokestatic jc0.a (Loov;)Loov;
      // 1a: athrow
      // 1b: return
      // 1c: aload 1
      // 1d: bipush 1
      // 1e: invokevirtual _qa.yu1 (Z)V
      // 21: iload 2
      // 22: ifne 9a
      // 25: aload 0
      // 26: getfield jc0.wyl Lc05;
      // 29: getfield Minecraft.vg8 Ll86;
      // 2c: getfield EntityPlayerSP.lfk Z
      // 2f: goto 36
      // 32: invokestatic jc0.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 8e
      // 39: aload 0
      // 3a: getfield jc0.wyl Lc05;
      // 3d: getfield Minecraft.vg8 Ll86;
      // 40: getfield EntityPlayerSP.fcv Z
      // 43: iload 2
      // 44: ifne 6c
      // 47: goto 4e
      // 4a: invokestatic jc0.a (Loov;)Loov;
      // 4d: athrow
      // 4e: ifeq 8e
      // 51: goto 58
      // 54: invokestatic jc0.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getfield jc0.wyl Lc05;
      // 5c: getfield Minecraft.vg8 Ll86;
      // 5f: getfield EntityPlayerSP.g9g Lboa;
      // 62: getfield boa.s0a Z
      // 65: goto 6c
      // 68: invokestatic jc0.a (Loov;)Loov;
      // 6b: athrow
      // 6c: iload 2
      // 6d: ifne 8b
      // 70: ifne 8e
      // 73: goto 7a
      // 76: invokestatic jc0.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield jc0.c1s Lnhs;
      // 7e: ldc2_w 300.0
      // 81: invokevirtual Timer.yrv (D)Z
      // 84: goto 8b
      // 87: invokestatic jc0.a (Loov;)Loov;
      // 8a: athrow
      // 8b: ifne 9f
      // 8e: aload 1
      // 8f: dconst_0
      // 90: putfield _qa.c6l D
      // 93: goto 9a
      // 96: invokestatic jc0.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 1
      // 9b: dconst_0
      // 9c: putfield _qa.faq D
      // 9f: return
   }

   private boolean kid() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 9
      // 03: bipush 36
      // 05: invokespecial jc0.ats (II)I
      // 08: istore 2
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: aload 0
      // 0d: bipush 36
      // 0f: bipush 45
      // 11: invokespecial jc0.ats (II)I
      // 14: istore 3
      // 15: istore 1
      // 16: iload 2
      // 17: iload 1
      // 18: ifne 44
      // 1b: bipush -1
      // 1c: if_icmpne 43
      // 1f: goto 26
      // 22: invokestatic jc0.a (Loov;)Loov;
      // 25: athrow
      // 26: iload 3
      // 27: iload 1
      // 28: ifne 44
      // 2b: goto 32
      // 2e: invokestatic jc0.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush -1
      // 33: if_icmpne 43
      // 36: goto 3d
      // 39: invokestatic jc0.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic jc0.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 1
      // 44: ireturn
   }

   private int ats(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: istore 4
      // 07: iload 4
      // 09: iload 2
      // 0a: if_icmpge 7b
      // 0d: aload 0
      // 0e: getfield jc0.wyl Lc05;
      // 11: getfield Minecraft.vg8 Ll86;
      // 14: getfield EntityPlayerSP.fv9 L_jc;
      // 17: iload 4
      // 19: invokevirtual _jc.ajr (I)Lvrx;
      // 1c: invokevirtual vrx.x4s ()Lerg;
      // 1f: astore 5
      // 21: iload 3
      // 22: ifeq 77
      // 25: aload 5
      // 27: ifnull 74
      // 2a: goto 31
      // 2d: invokestatic jc0.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 5
      // 33: invokevirtual erg.gn1 ()Lu7m;
      // 36: instanceof gun
      // 39: iload 3
      // 3a: ifeq 63
      // 3d: goto 44
      // 40: invokestatic jc0.a (Loov;)Loov;
      // 43: athrow
      // 44: ifeq 74
      // 47: goto 4e
      // 4a: invokestatic jc0.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 5
      // 50: invokevirtual erg.gn1 ()Lu7m;
      // 53: checkcast gun
      // 56: invokevirtual gun.kpo ()Le0x;
      // 59: invokevirtual e0x.z4c ()Z
      // 5c: goto 63
      // 5f: invokestatic jc0.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 3
      // 64: ifeq 73
      // 67: ifeq 74
      // 6a: goto 71
      // 6d: invokestatic jc0.a (Loov;)Loov;
      // 70: athrow
      // 71: iload 4
      // 73: ireturn
      // 74: iinc 4 1
      // 77: iload 3
      // 78: ifne 07
      // 7b: bipush -1
      // 7c: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6738257295308006302L, 2384018105226071172L, MethodHandles.lookup().lookupClass()).a(236687748905432L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 45658447135418L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u001ec\n\u00ad§/î÷#\u0015Þ°\u0092êûæ Å}\f÷/^\u0000ÞèYÂ\f\u0003¿ú\u0000ñ\u001eok|ÓÀlû¹PÍ[ô6\u0013";
      int var8 = "\u001ec\n\u00ad§/î÷#\u0015Þ°\u0092êûæ Å}\f÷/^\u0000ÞèYÂ\f\u0003¿ú\u0000ñ\u001eok|ÓÀlû¹PÍ[ô6\u0013".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5854;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("jc0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("jc0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
