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

public class a9u extends SubEngine {
   private a9u$ja6 ob5;
   private Timer bix;
   private Timer Timer;
   private boolean fza;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public a9u() {
      long var1 = a ^ 68269368362766L;
      super(a<"m">(15045, 8986343020232631661L ^ var1), a<"m">(4852, 2902235532479843677L ^ var1));
      this.ob5 = null;
      this.bix = new Timer();
      this.nhs = new Timer();
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.bix.zay();
   }

   @Override
   public void onRender() {
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
      // 05: invokespecial SubEngine.onRender ()V
      // 08: aload 0
      // 09: getfield a9u.wyl Lc05;
      // 0c: iload 1
      // 0d: ifeq 26
      // 10: getfield Minecraft.tij Lkh3;
      // 13: ifnonnull 22
      // 16: goto 1d
      // 19: invokestatic a9u.a (Loov;)Loov;
      // 1c: athrow
      // 1d: return
      // 1e: invokestatic a9u.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield a9u.wyl Lc05;
      // 26: getfield Minecraft.vg8 Ll86;
      // 29: bipush 1
      // 2a: putfield EntityPlayerSP.lfk Z
      // 2d: return
   }

   private a9u$ja6 ulk(mew param1) {
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
      // 005: astore 3
      // 006: getstatic Scaffold.gxj Ljava/util/List;
      // 009: aload 0
      // 00a: getfield a9u.wyl Lc05;
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
      // 025: ifeq 068
      // 028: ifne 04a
      // 02b: goto 032
      // 02e: invokestatic a9u.a (Loov;)Loov;
      // 031: athrow
      // 032: new a9u$ja6
      // 035: dup
      // 036: aload 0
      // 037: aload 3
      // 038: bipush 0
      // 039: bipush -1
      // 03a: bipush 0
      // 03b: invokevirtual mew.ec4 (III)Lmew;
      // 03e: getstatic vt2.rf3 Lvt2;
      // 041: aconst_null
      // 042: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 045: areturn
      // 046: invokestatic a9u.a (Loov;)Loov;
      // 049: athrow
      // 04a: getstatic Scaffold.gxj Ljava/util/List;
      // 04d: aload 0
      // 04e: getfield a9u.wyl Lc05;
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
      // 069: ifeq 0ac
      // 06c: ifne 08e
      // 06f: goto 076
      // 072: invokestatic a9u.a (Loov;)Loov;
      // 075: athrow
      // 076: new a9u$ja6
      // 079: dup
      // 07a: aload 0
      // 07b: aload 3
      // 07c: bipush -1
      // 07d: bipush 0
      // 07e: bipush 0
      // 07f: invokevirtual mew.ec4 (III)Lmew;
      // 082: getstatic vt2.zk4 Lvt2;
      // 085: aconst_null
      // 086: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 089: areturn
      // 08a: invokestatic a9u.a (Loov;)Loov;
      // 08d: athrow
      // 08e: getstatic Scaffold.gxj Ljava/util/List;
      // 091: aload 0
      // 092: getfield a9u.wyl Lc05;
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
      // 0ad: ifeq 0f0
      // 0b0: ifne 0d2
      // 0b3: goto 0ba
      // 0b6: invokestatic a9u.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: new a9u$ja6
      // 0bd: dup
      // 0be: aload 0
      // 0bf: aload 3
      // 0c0: bipush 1
      // 0c1: bipush 0
      // 0c2: bipush 0
      // 0c3: invokevirtual mew.ec4 (III)Lmew;
      // 0c6: getstatic vt2.te4 Lvt2;
      // 0c9: aconst_null
      // 0ca: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 0cd: areturn
      // 0ce: invokestatic a9u.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: getstatic Scaffold.gxj Ljava/util/List;
      // 0d5: aload 0
      // 0d6: getfield a9u.wyl Lc05;
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
      // 0f1: ifeq 134
      // 0f4: ifne 116
      // 0f7: goto 0fe
      // 0fa: invokestatic a9u.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: new a9u$ja6
      // 101: dup
      // 102: aload 0
      // 103: aload 3
      // 104: bipush 0
      // 105: bipush 0
      // 106: bipush -1
      // 107: invokevirtual mew.ec4 (III)Lmew;
      // 10a: getstatic vt2.mxp Lvt2;
      // 10d: aconst_null
      // 10e: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 111: areturn
      // 112: invokestatic a9u.a (Loov;)Loov;
      // 115: athrow
      // 116: getstatic Scaffold.gxj Ljava/util/List;
      // 119: aload 0
      // 11a: getfield a9u.wyl Lc05;
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
      // 135: ifeq 180
      // 138: ifne 15a
      // 13b: goto 142
      // 13e: invokestatic a9u.a (Loov;)Loov;
      // 141: athrow
      // 142: new a9u$ja6
      // 145: dup
      // 146: aload 0
      // 147: aload 3
      // 148: bipush 0
      // 149: bipush 0
      // 14a: bipush 1
      // 14b: invokevirtual mew.ec4 (III)Lmew;
      // 14e: getstatic vt2.z9q Lvt2;
      // 151: aconst_null
      // 152: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 155: areturn
      // 156: invokestatic a9u.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 1
      // 15b: bipush -1
      // 15c: bipush 0
      // 15d: bipush 0
      // 15e: invokevirtual mew.ec4 (III)Lmew;
      // 161: astore 3
      // 162: getstatic Scaffold.gxj Ljava/util/List;
      // 165: aload 0
      // 166: getfield a9u.wyl Lc05;
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
      // 181: ifeq 1c4
      // 184: ifne 1a6
      // 187: goto 18e
      // 18a: invokestatic a9u.a (Loov;)Loov;
      // 18d: athrow
      // 18e: new a9u$ja6
      // 191: dup
      // 192: aload 0
      // 193: aload 3
      // 194: bipush -1
      // 195: bipush 0
      // 196: bipush 0
      // 197: invokevirtual mew.ec4 (III)Lmew;
      // 19a: getstatic vt2.zk4 Lvt2;
      // 19d: aconst_null
      // 19e: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 1a1: areturn
      // 1a2: invokestatic a9u.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: getstatic Scaffold.gxj Ljava/util/List;
      // 1a9: aload 0
      // 1aa: getfield a9u.wyl Lc05;
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
      // 1c5: ifeq 208
      // 1c8: ifne 1ea
      // 1cb: goto 1d2
      // 1ce: invokestatic a9u.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: new a9u$ja6
      // 1d5: dup
      // 1d6: aload 0
      // 1d7: aload 3
      // 1d8: bipush 1
      // 1d9: bipush 0
      // 1da: bipush 0
      // 1db: invokevirtual mew.ec4 (III)Lmew;
      // 1de: getstatic vt2.te4 Lvt2;
      // 1e1: aconst_null
      // 1e2: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 1e5: areturn
      // 1e6: invokestatic a9u.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: getstatic Scaffold.gxj Ljava/util/List;
      // 1ed: aload 0
      // 1ee: getfield a9u.wyl Lc05;
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
      // 209: ifeq 24c
      // 20c: ifne 22e
      // 20f: goto 216
      // 212: invokestatic a9u.a (Loov;)Loov;
      // 215: athrow
      // 216: new a9u$ja6
      // 219: dup
      // 21a: aload 0
      // 21b: aload 3
      // 21c: bipush 0
      // 21d: bipush 0
      // 21e: bipush -1
      // 21f: invokevirtual mew.ec4 (III)Lmew;
      // 222: getstatic vt2.mxp Lvt2;
      // 225: aconst_null
      // 226: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 229: areturn
      // 22a: invokestatic a9u.a (Loov;)Loov;
      // 22d: athrow
      // 22e: getstatic Scaffold.gxj Ljava/util/List;
      // 231: aload 0
      // 232: getfield a9u.wyl Lc05;
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
      // 24d: ifeq 298
      // 250: ifne 272
      // 253: goto 25a
      // 256: invokestatic a9u.a (Loov;)Loov;
      // 259: athrow
      // 25a: new a9u$ja6
      // 25d: dup
      // 25e: aload 0
      // 25f: aload 3
      // 260: bipush 0
      // 261: bipush 0
      // 262: bipush 1
      // 263: invokevirtual mew.ec4 (III)Lmew;
      // 266: getstatic vt2.z9q Lvt2;
      // 269: aconst_null
      // 26a: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 26d: areturn
      // 26e: invokestatic a9u.a (Loov;)Loov;
      // 271: athrow
      // 272: aload 1
      // 273: bipush 1
      // 274: bipush 0
      // 275: bipush 0
      // 276: invokevirtual mew.ec4 (III)Lmew;
      // 279: astore 3
      // 27a: getstatic Scaffold.gxj Ljava/util/List;
      // 27d: aload 0
      // 27e: getfield a9u.wyl Lc05;
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
      // 299: ifeq 2dc
      // 29c: ifne 2be
      // 29f: goto 2a6
      // 2a2: invokestatic a9u.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: new a9u$ja6
      // 2a9: dup
      // 2aa: aload 0
      // 2ab: aload 3
      // 2ac: bipush -1
      // 2ad: bipush 0
      // 2ae: bipush 0
      // 2af: invokevirtual mew.ec4 (III)Lmew;
      // 2b2: getstatic vt2.zk4 Lvt2;
      // 2b5: aconst_null
      // 2b6: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 2b9: areturn
      // 2ba: invokestatic a9u.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: getstatic Scaffold.gxj Ljava/util/List;
      // 2c1: aload 0
      // 2c2: getfield a9u.wyl Lc05;
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
      // 2dd: ifeq 320
      // 2e0: ifne 302
      // 2e3: goto 2ea
      // 2e6: invokestatic a9u.a (Loov;)Loov;
      // 2e9: athrow
      // 2ea: new a9u$ja6
      // 2ed: dup
      // 2ee: aload 0
      // 2ef: aload 3
      // 2f0: bipush 1
      // 2f1: bipush 0
      // 2f2: bipush 0
      // 2f3: invokevirtual mew.ec4 (III)Lmew;
      // 2f6: getstatic vt2.te4 Lvt2;
      // 2f9: aconst_null
      // 2fa: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 2fd: areturn
      // 2fe: invokestatic a9u.a (Loov;)Loov;
      // 301: athrow
      // 302: getstatic Scaffold.gxj Ljava/util/List;
      // 305: aload 0
      // 306: getfield a9u.wyl Lc05;
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
      // 321: ifeq 364
      // 324: ifne 346
      // 327: goto 32e
      // 32a: invokestatic a9u.a (Loov;)Loov;
      // 32d: athrow
      // 32e: new a9u$ja6
      // 331: dup
      // 332: aload 0
      // 333: aload 3
      // 334: bipush 0
      // 335: bipush 0
      // 336: bipush -1
      // 337: invokevirtual mew.ec4 (III)Lmew;
      // 33a: getstatic vt2.mxp Lvt2;
      // 33d: aconst_null
      // 33e: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 341: areturn
      // 342: invokestatic a9u.a (Loov;)Loov;
      // 345: athrow
      // 346: getstatic Scaffold.gxj Ljava/util/List;
      // 349: aload 0
      // 34a: getfield a9u.wyl Lc05;
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
      // 365: ifeq 3b0
      // 368: ifne 38a
      // 36b: goto 372
      // 36e: invokestatic a9u.a (Loov;)Loov;
      // 371: athrow
      // 372: new a9u$ja6
      // 375: dup
      // 376: aload 0
      // 377: aload 3
      // 378: bipush 0
      // 379: bipush 0
      // 37a: bipush 1
      // 37b: invokevirtual mew.ec4 (III)Lmew;
      // 37e: getstatic vt2.z9q Lvt2;
      // 381: aconst_null
      // 382: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 385: areturn
      // 386: invokestatic a9u.a (Loov;)Loov;
      // 389: athrow
      // 38a: aload 1
      // 38b: bipush 0
      // 38c: bipush 0
      // 38d: bipush -1
      // 38e: invokevirtual mew.ec4 (III)Lmew;
      // 391: astore 3
      // 392: getstatic Scaffold.gxj Ljava/util/List;
      // 395: aload 0
      // 396: getfield a9u.wyl Lc05;
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
      // 3b1: ifeq 3f4
      // 3b4: ifne 3d6
      // 3b7: goto 3be
      // 3ba: invokestatic a9u.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: new a9u$ja6
      // 3c1: dup
      // 3c2: aload 0
      // 3c3: aload 3
      // 3c4: bipush -1
      // 3c5: bipush 0
      // 3c6: bipush 0
      // 3c7: invokevirtual mew.ec4 (III)Lmew;
      // 3ca: getstatic vt2.zk4 Lvt2;
      // 3cd: aconst_null
      // 3ce: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 3d1: areturn
      // 3d2: invokestatic a9u.a (Loov;)Loov;
      // 3d5: athrow
      // 3d6: getstatic Scaffold.gxj Ljava/util/List;
      // 3d9: aload 0
      // 3da: getfield a9u.wyl Lc05;
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
      // 3f5: ifeq 438
      // 3f8: ifne 41a
      // 3fb: goto 402
      // 3fe: invokestatic a9u.a (Loov;)Loov;
      // 401: athrow
      // 402: new a9u$ja6
      // 405: dup
      // 406: aload 0
      // 407: aload 3
      // 408: bipush 1
      // 409: bipush 0
      // 40a: bipush 0
      // 40b: invokevirtual mew.ec4 (III)Lmew;
      // 40e: getstatic vt2.te4 Lvt2;
      // 411: aconst_null
      // 412: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 415: areturn
      // 416: invokestatic a9u.a (Loov;)Loov;
      // 419: athrow
      // 41a: getstatic Scaffold.gxj Ljava/util/List;
      // 41d: aload 0
      // 41e: getfield a9u.wyl Lc05;
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
      // 439: ifeq 47c
      // 43c: ifne 45e
      // 43f: goto 446
      // 442: invokestatic a9u.a (Loov;)Loov;
      // 445: athrow
      // 446: new a9u$ja6
      // 449: dup
      // 44a: aload 0
      // 44b: aload 3
      // 44c: bipush 0
      // 44d: bipush 0
      // 44e: bipush -1
      // 44f: invokevirtual mew.ec4 (III)Lmew;
      // 452: getstatic vt2.mxp Lvt2;
      // 455: aconst_null
      // 456: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 459: areturn
      // 45a: invokestatic a9u.a (Loov;)Loov;
      // 45d: athrow
      // 45e: getstatic Scaffold.gxj Ljava/util/List;
      // 461: aload 0
      // 462: getfield a9u.wyl Lc05;
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
      // 47d: ifeq 4c8
      // 480: ifne 4a2
      // 483: goto 48a
      // 486: invokestatic a9u.a (Loov;)Loov;
      // 489: athrow
      // 48a: new a9u$ja6
      // 48d: dup
      // 48e: aload 0
      // 48f: aload 3
      // 490: bipush 0
      // 491: bipush 0
      // 492: bipush 1
      // 493: invokevirtual mew.ec4 (III)Lmew;
      // 496: getstatic vt2.z9q Lvt2;
      // 499: aconst_null
      // 49a: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 49d: areturn
      // 49e: invokestatic a9u.a (Loov;)Loov;
      // 4a1: athrow
      // 4a2: aload 1
      // 4a3: bipush 0
      // 4a4: bipush 0
      // 4a5: bipush 1
      // 4a6: invokevirtual mew.ec4 (III)Lmew;
      // 4a9: astore 3
      // 4aa: getstatic Scaffold.gxj Ljava/util/List;
      // 4ad: aload 0
      // 4ae: getfield a9u.wyl Lc05;
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
      // 4c9: ifeq 50c
      // 4cc: ifne 4ee
      // 4cf: goto 4d6
      // 4d2: invokestatic a9u.a (Loov;)Loov;
      // 4d5: athrow
      // 4d6: new a9u$ja6
      // 4d9: dup
      // 4da: aload 0
      // 4db: aload 3
      // 4dc: bipush -1
      // 4dd: bipush 0
      // 4de: bipush 0
      // 4df: invokevirtual mew.ec4 (III)Lmew;
      // 4e2: getstatic vt2.zk4 Lvt2;
      // 4e5: aconst_null
      // 4e6: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 4e9: areturn
      // 4ea: invokestatic a9u.a (Loov;)Loov;
      // 4ed: athrow
      // 4ee: getstatic Scaffold.gxj Ljava/util/List;
      // 4f1: aload 0
      // 4f2: getfield a9u.wyl Lc05;
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
      // 50d: ifeq 550
      // 510: ifne 532
      // 513: goto 51a
      // 516: invokestatic a9u.a (Loov;)Loov;
      // 519: athrow
      // 51a: new a9u$ja6
      // 51d: dup
      // 51e: aload 0
      // 51f: aload 3
      // 520: bipush 1
      // 521: bipush 0
      // 522: bipush 0
      // 523: invokevirtual mew.ec4 (III)Lmew;
      // 526: getstatic vt2.te4 Lvt2;
      // 529: aconst_null
      // 52a: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 52d: areturn
      // 52e: invokestatic a9u.a (Loov;)Loov;
      // 531: athrow
      // 532: getstatic Scaffold.gxj Ljava/util/List;
      // 535: aload 0
      // 536: getfield a9u.wyl Lc05;
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
      // 551: ifeq 594
      // 554: ifne 576
      // 557: goto 55e
      // 55a: invokestatic a9u.a (Loov;)Loov;
      // 55d: athrow
      // 55e: new a9u$ja6
      // 561: dup
      // 562: aload 0
      // 563: aload 3
      // 564: bipush 0
      // 565: bipush 0
      // 566: bipush -1
      // 567: invokevirtual mew.ec4 (III)Lmew;
      // 56a: getstatic vt2.mxp Lvt2;
      // 56d: aconst_null
      // 56e: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 571: areturn
      // 572: invokestatic a9u.a (Loov;)Loov;
      // 575: athrow
      // 576: getstatic Scaffold.gxj Ljava/util/List;
      // 579: aload 0
      // 57a: getfield a9u.wyl Lc05;
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
      // 597: new a9u$ja6
      // 59a: dup
      // 59b: aload 0
      // 59c: aload 3
      // 59d: bipush 0
      // 59e: bipush 0
      // 59f: bipush 1
      // 5a0: invokevirtual mew.ec4 (III)Lmew;
      // 5a3: getstatic vt2.z9q Lvt2;
      // 5a6: aconst_null
      // 5a7: invokespecial a9u$ja6.<init> (La9u;Lmew;Lvt2;La9u$1;)V
      // 5aa: areturn
      // 5ab: invokestatic a9u.a (Loov;)Loov;
      // 5ae: athrow
      // 5af: aconst_null
      // 5b0: areturn
   }

   @EventHandler(
      jn1 = 0
   )
   private void fr8(PlayerUpdateEvent param1) {
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
      // 005: invokevirtual PlayerUpdateEvent.lhw ()Z
      // 008: iload 2
      // 009: ifne 02f
      // 00c: ifeq 020
      // 00f: goto 016
      // 012: invokestatic a9u.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: bipush 0
      // 018: putfield a9u.fza Z
      // 01b: return
      // 01c: invokestatic a9u.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: aconst_null
      // 022: putfield a9u.ob5 La9u$ja6;
      // 025: aload 0
      // 026: getfield a9u.wyl Lc05;
      // 029: getfield Minecraft.vg8 Ll86;
      // 02c: invokevirtual EntityPlayerSP.hzv ()Z
      // 02f: iload 2
      // 030: ifne 048
      // 033: ifne 1ce
      // 036: goto 03d
      // 039: invokestatic a9u.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: invokespecial a9u.wpm ()Z
      // 041: goto 048
      // 044: invokestatic a9u.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 2
      // 049: ifne 072
      // 04c: ifeq 1ce
      // 04f: goto 056
      // 052: invokestatic a9u.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: getfield a9u.wyl Lc05;
      // 05a: getfield Minecraft.vg8 Ll86;
      // 05d: iload 2
      // 05e: ifne 083
      // 061: goto 068
      // 064: invokestatic a9u.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield EntityPlayerSP.lfk Z
      // 06b: goto 072
      // 06e: invokestatic a9u.a (Loov;)Loov;
      // 071: athrow
      // 072: ifeq 14a
      // 075: aload 0
      // 076: getfield a9u.wyl Lc05;
      // 079: getfield Minecraft.vg8 Ll86;
      // 07c: goto 083
      // 07f: invokestatic a9u.a (Loov;)Loov;
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
      // 094: getfield a9u.wyl Lc05;
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
      // 0ab: getfield a9u.wyl Lc05;
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
      // 0c4: getfield a9u.wyl Lc05;
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
      // 0dc: getfield a9u.wyl Lc05;
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
      // 0f5: getfield a9u.wyl Lc05;
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
      // 10d: getfield a9u.wyl Lc05;
      // 110: getfield Minecraft.vg8 Ll86;
      // 113: getfield EntityPlayerSP.o2v D
      // 116: dload 10
      // 118: dadd
      // 119: dstore 14
      // 11b: aload 0
      // 11c: getfield a9u.wyl Lc05;
      // 11f: getfield Minecraft.vg8 Ll86;
      // 122: getfield EntityPlayerSP.kfp D
      // 125: dconst_1
      // 126: dsub
      // 127: dstore 16
      // 129: aload 0
      // 12a: getfield a9u.wyl Lc05;
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
      // 147: ifeq 175
      // 14a: new mew
      // 14d: dup
      // 14e: aload 0
      // 14f: getfield a9u.wyl Lc05;
      // 152: invokevirtual Minecraft.nsd ()Li2h;
      // 155: getfield EntityLivingBase.o2v D
      // 158: aload 0
      // 159: getfield a9u.wyl Lc05;
      // 15c: invokevirtual Minecraft.nsd ()Li2h;
      // 15f: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 162: getfield nh4.bx_ D
      // 165: dconst_1
      // 166: dsub
      // 167: aload 0
      // 168: getfield a9u.wyl Lc05;
      // 16b: invokevirtual Minecraft.nsd ()Li2h;
      // 16e: getfield EntityLivingBase.vbd D
      // 171: invokespecial mew.<init> (DDD)V
      // 174: astore 3
      // 175: aload 0
      // 176: iload 2
      // 177: ifne 1a7
      // 17a: getfield a9u.wyl Lc05;
      // 17d: getfield Minecraft.tij Lkh3;
      // 180: aload 3
      // 181: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 184: invokeinterface zfz.r_y ()Le0x; 1
      // 189: getstatic ox_.ibw Le0x;
      // 18c: if_acmpne 1ce
      // 18f: goto 196
      // 192: invokestatic a9u.a (Loov;)Loov;
      // 195: athrow
      // 196: aload 0
      // 197: aload 0
      // 198: aload 3
      // 199: invokespecial a9u.ulk (Lmew;)La9u$ja6;
      // 19c: putfield a9u.ob5 La9u$ja6;
      // 19f: aload 0
      // 1a0: goto 1a7
      // 1a3: invokestatic a9u.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: getfield a9u.ob5 La9u$ja6;
      // 1aa: getfield a9u$ja6.yv4 Lmew;
      // 1ad: aload 0
      // 1ae: getfield a9u.ob5 La9u$ja6;
      // 1b1: getfield a9u$ja6.dlj Lvt2;
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
      // 1cb: putfield a9u.fza Z
      // 1ce: return
   }

   @EventHandler
   private void zu6(TickEvent param1) {
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
      // 05: invokespecial a9u.mvf ()I
      // 08: istore 3
      // 09: iload 3
      // 0a: bipush -1
      // 0b: iload 2
      // 0c: ifeq 1f
      // 0f: if_icmpne 1a
      // 12: goto 19
      // 15: invokestatic a9u.a (Loov;)Loov;
      // 18: athrow
      // 19: return
      // 1a: aload 0
      // 1b: invokespecial a9u.rn5 ()I
      // 1e: bipush 2
      // 1f: iload 2
      // 20: ifeq 44
      // 23: if_icmpge 7f
      // 26: goto 2d
      // 29: invokestatic a9u.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokespecial a9u.mvf ()I
      // 31: iload 2
      // 32: ifeq 63
      // 35: goto 3c
      // 38: invokestatic a9u.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush -1
      // 3d: goto 44
      // 40: invokestatic a9u.a (Loov;)Loov;
      // 43: athrow
      // 44: if_icmpeq 7f
      // 47: aload 0
      // 48: getfield a9u.nhs Lnhs;
      // 4b: iload 2
      // 4c: ifeq 7c
      // 4f: goto 56
      // 52: invokestatic a9u.a (Loov;)Loov;
      // 55: athrow
      // 56: ldc2_w 200.0
      // 59: invokevirtual Timer.yrv (D)Z
      // 5c: goto 63
      // 5f: invokestatic a9u.a (Loov;)Loov;
      // 62: athrow
      // 63: ifeq 7f
      // 66: aload 0
      // 67: aload 0
      // 68: invokespecial a9u.mvf ()I
      // 6b: invokestatic amb.zws ()I
      // 6e: invokespecial a9u.li4 (II)V
      // 71: aload 0
      // 72: getfield a9u.nhs Lnhs;
      // 75: goto 7c
      // 78: invokestatic a9u.a (Loov;)Loov;
      // 7b: athrow
      // 7c: invokevirtual Timer.zay ()V
      // 7f: return
   }

   @EventHandler(
      jn1 = 3
   )
   private void gh5(Event param1) {
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
      // 005: getfield a9u.fza Z
      // 008: iload 2
      // 009: ifne 020
      // 00c: ifne 017
      // 00f: goto 016
      // 012: invokestatic a9u.a (Loov;)Loov;
      // 015: athrow
      // 016: return
      // 017: aload 0
      // 018: bipush 0
      // 019: putfield a9u.fza Z
      // 01c: aload 0
      // 01d: invokespecial a9u.rlg ()I
      // 020: istore 3
      // 021: iload 3
      // 022: iload 2
      // 023: ifne 043
      // 026: bipush -1
      // 027: if_icmpne 036
      // 02a: goto 031
      // 02d: invokestatic a9u.a (Loov;)Loov;
      // 030: athrow
      // 031: return
      // 032: invokestatic a9u.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: getfield a9u.wyl Lc05;
      // 03a: getfield Minecraft.vg8 Ll86;
      // 03d: getfield EntityPlayerSP.up_ Ljnq;
      // 040: getfield jnq.nb5 I
      // 043: istore 4
      // 045: aload 0
      // 046: getfield a9u.wyl Lc05;
      // 049: getfield Minecraft.vg8 Ll86;
      // 04c: getfield EntityPlayerSP.up_ Ljnq;
      // 04f: iload 3
      // 050: putfield jnq.nb5 I
      // 053: aload 0
      // 054: iload 2
      // 055: ifne 1eb
      // 058: getfield a9u.ob5 La9u$ja6;
      // 05b: ifnull 1ea
      // 05e: goto 065
      // 061: invokestatic a9u.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 0
      // 066: getfield a9u.wyl Lc05;
      // 069: getfield Minecraft.vg8 Ll86;
      // 06c: getfield EntityPlayerSP.up_ Ljnq;
      // 06f: iload 2
      // 070: ifne 1f4
      // 073: goto 07a
      // 076: invokestatic a9u.a (Loov;)Loov;
      // 079: athrow
      // 07a: invokevirtual jnq.dxs ()Lerg;
      // 07d: ifnull 1ea
      // 080: goto 087
      // 083: invokestatic a9u.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: getfield a9u.wyl Lc05;
      // 08b: getfield Minecraft.vg8 Ll86;
      // 08e: getfield EntityPlayerSP.up_ Ljnq;
      // 091: iload 2
      // 092: ifne 1f4
      // 095: goto 09c
      // 098: invokestatic a9u.a (Loov;)Loov;
      // 09b: athrow
      // 09c: invokevirtual jnq.dxs ()Lerg;
      // 09f: invokevirtual erg.gn1 ()Lu7m;
      // 0a2: instanceof gun
      // 0a5: ifeq 1ea
      // 0a8: goto 0af
      // 0ab: invokestatic a9u.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield a9u.wyl Lc05;
      // 0b3: getfield Minecraft.vg8 Ll86;
      // 0b6: getfield EntityPlayerSP.up_ Ljnq;
      // 0b9: iload 2
      // 0ba: ifne 1f4
      // 0bd: goto 0c4
      // 0c0: invokestatic a9u.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: invokevirtual jnq.dxs ()Lerg;
      // 0c7: getfield erg.qd2 I
      // 0ca: ifle 1ea
      // 0cd: goto 0d4
      // 0d0: invokestatic a9u.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: iload 2
      // 0d6: ifne 1eb
      // 0d9: goto 0e0
      // 0dc: invokestatic a9u.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: getfield a9u.bix Lnhs;
      // 0e3: ldc2_w 90.0
      // 0e6: invokevirtual Timer.yrv (D)Z
      // 0e9: ifeq 1ea
      // 0ec: goto 0f3
      // 0ef: invokestatic a9u.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: getfield a9u.bix Lnhs;
      // 0f7: invokevirtual Timer.zay ()V
      // 0fa: aload 0
      // 0fb: getfield a9u.wyl Lc05;
      // 0fe: getfield Minecraft.vg8 Ll86;
      // 101: getfield EntityPlayerSP.lq7 Lp_k;
      // 104: new net/minecraft/network/play/client/C0APacketAnimation
      // 107: dup
      // 108: invokespecial net/minecraft/network/play/client/C0APacketAnimation.<init> ()V
      // 10b: invokevirtual p_k.sxi (Lmz2;)V
      // 10e: aload 0
      // 10f: aload 0
      // 110: getfield a9u.ob5 La9u$ja6;
      // 113: getfield a9u$ja6.yv4 Lmew;
      // 116: aload 0
      // 117: getfield a9u.ob5 La9u$ja6;
      // 11a: getfield a9u$ja6.dlj Lvt2;
      // 11d: invokespecial a9u.mam (Lmew;Lvt2;)V
      // 120: iload 2
      // 121: ifne 1f9
      // 124: goto 12b
      // 127: invokestatic a9u.a (Loov;)Loov;
      // 12a: athrow
      // 12b: getstatic Scaffold.xor Lcn7;
      // 12e: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 131: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 134: ifeq 1ea
      // 137: goto 13e
      // 13a: invokestatic a9u.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: getfield a9u.wyl Lc05;
      // 142: getfield Minecraft.vg8 Ll86;
      // 145: iload 2
      // 146: ifne 1f1
      // 149: goto 150
      // 14c: invokestatic a9u.a (Loov;)Loov;
      // 14f: athrow
      // 150: getfield EntityPlayerSP.kfp D
      // 153: aload 0
      // 154: getfield a9u.ob5 La9u$ja6;
      // 157: getfield a9u$ja6.yv4 Lmew;
      // 15a: invokevirtual mew.getY ()I
      // 15d: bipush 1
      // 15e: iadd
      // 15f: i2d
      // 160: dcmpl
      // 161: ifeq 1ea
      // 164: goto 16b
      // 167: invokestatic a9u.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield a9u.wyl Lc05;
      // 16f: getfield Minecraft.vg8 Ll86;
      // 172: iload 2
      // 173: ifne 1f1
      // 176: goto 17d
      // 179: invokestatic a9u.a (Loov;)Loov;
      // 17c: athrow
      // 17d: getfield EntityPlayerSP.g9g Lboa;
      // 180: getfield boa.s0a Z
      // 183: ifeq 1ea
      // 186: goto 18d
      // 189: invokestatic a9u.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield a9u.wyl Lc05;
      // 191: getfield Minecraft.vg8 Ll86;
      // 194: aload 0
      // 195: getfield a9u.wyl Lc05;
      // 198: getfield Minecraft.vg8 Ll86;
      // 19b: getfield EntityPlayerSP.o2v D
      // 19e: aload 0
      // 19f: getfield a9u.ob5 La9u$ja6;
      // 1a2: getfield a9u$ja6.yv4 Lmew;
      // 1a5: invokevirtual mew.getY ()I
      // 1a8: bipush 2
      // 1a9: iadd
      // 1aa: i2d
      // 1ab: aload 0
      // 1ac: getfield a9u.wyl Lc05;
      // 1af: getfield Minecraft.vg8 Ll86;
      // 1b2: getfield EntityPlayerSP.vbd D
      // 1b5: invokevirtual EntityPlayerSP.m6_ (DDD)V
      // 1b8: aload 0
      // 1b9: getfield a9u.wyl Lc05;
      // 1bc: getfield Minecraft.vg8 Ll86;
      // 1bf: dconst_0
      // 1c0: putfield EntityPlayerSP.mop D
      // 1c3: aload 0
      // 1c4: getfield a9u.wyl Lc05;
      // 1c7: getfield Minecraft.vg8 Ll86;
      // 1ca: dconst_0
      // 1cb: putfield EntityPlayerSP.icv D
      // 1ce: aload 0
      // 1cf: getfield a9u.wyl Lc05;
      // 1d2: getfield Minecraft.vg8 Ll86;
      // 1d5: dconst_0
      // 1d6: putfield EntityPlayerSP.bw4 D
      // 1d9: aload 0
      // 1da: getfield a9u.wyl Lc05;
      // 1dd: getfield Minecraft.vg8 Ll86;
      // 1e0: invokevirtual EntityPlayerSP.xv1 ()V
      // 1e3: goto 1ea
      // 1e6: invokestatic a9u.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 0
      // 1eb: getfield a9u.wyl Lc05;
      // 1ee: getfield Minecraft.vg8 Ll86;
      // 1f1: getfield EntityPlayerSP.up_ Ljnq;
      // 1f4: iload 4
      // 1f6: putfield jnq.nb5 I
      // 1f9: return
   }

   private int rn5() {
      return amb.d5v().stream().filter(Scaffold::unh).mapToInt(a9u::t4p).sum();
   }

   private int mvf() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic OpaquePredicate.b ()I
      // 05: bipush -1
      // 06: istore 3
      // 07: bipush 9
      // 09: istore 4
      // 0b: istore 1
      // 0c: iload 4
      // 0e: bipush 36
      // 10: if_icmpge 6a
      // 13: aload 0
      // 14: getfield a9u.wyl Lc05;
      // 17: getfield Minecraft.vg8 Ll86;
      // 1a: getfield EntityPlayerSP.up_ Ljnq;
      // 1d: getfield jnq.c41 [Lerg;
      // 20: iload 4
      // 22: aaload
      // 23: astore 5
      // 25: aload 5
      // 27: invokestatic Scaffold.unh (Lerg;)Z
      // 2a: iload 1
      // 2b: ifeq 6b
      // 2e: iload 1
      // 2f: ifeq 47
      // 32: goto 39
      // 35: invokestatic a9u.a (Loov;)Loov;
      // 38: athrow
      // 39: ifne 46
      // 3c: goto 43
      // 3f: invokestatic a9u.a (Loov;)Loov;
      // 42: athrow
      // 43: goto 63
      // 46: iload 2
      // 47: iload 1
      // 48: ifeq 62
      // 4b: aload 5
      // 4d: getfield erg.qd2 I
      // 50: if_icmpge 63
      // 53: goto 5a
      // 56: invokestatic a9u.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 5
      // 5c: getfield erg.qd2 I
      // 5f: istore 2
      // 60: iload 4
      // 62: istore 3
      // 63: iinc 4 1
      // 66: iload 1
      // 67: ifne 0c
      // 6a: iload 3
      // 6b: ireturn
   }

   @EventHandler
   private void gty(b4u param1) {
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
      // 07: bipush 8
      // 09: if_icmpge 6e
      // 0c: aload 0
      // 0d: getfield a9u.wyl Lc05;
      // 10: getfield Minecraft.vg8 Ll86;
      // 13: getfield EntityPlayerSP.up_ Ljnq;
      // 16: getfield jnq.c41 [Lerg;
      // 19: iload 3
      // 1a: aaload
      // 1b: iload 2
      // 1c: ifeq 4a
      // 1f: ifnull 67
      // 22: goto 29
      // 25: invokestatic a9u.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield a9u.wyl Lc05;
      // 2d: getfield Minecraft.vg8 Ll86;
      // 30: getfield EntityPlayerSP.up_ Ljnq;
      // 33: getfield jnq.c41 [Lerg;
      // 36: iload 3
      // 37: iload 2
      // 38: ifeq 65
      // 3b: goto 42
      // 3e: invokestatic a9u.a (Loov;)Loov;
      // 41: athrow
      // 42: aaload
      // 43: goto 4a
      // 46: invokestatic a9u.a (Loov;)Loov;
      // 49: athrow
      // 4a: getfield erg.qd2 I
      // 4d: ifgt 67
      // 50: aload 0
      // 51: getfield a9u.wyl Lc05;
      // 54: getfield Minecraft.vg8 Ll86;
      // 57: getfield EntityPlayerSP.up_ Ljnq;
      // 5a: getfield jnq.c41 [Lerg;
      // 5d: iload 3
      // 5e: goto 65
      // 61: invokestatic a9u.a (Loov;)Loov;
      // 64: athrow
      // 65: aconst_null
      // 66: aastore
      // 67: iinc 3 1
      // 6a: iload 2
      // 6b: ifne 06
      // 6e: return
   }

   private void li4(int var1, int var2) {
      this.wyl.l7q.efg(this.wyl.vg8.fv9.h7l, var1, var2, 2, this.wyl.vg8);
   }

   private int rlg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic OpaquePredicate.b ()I
      // 05: bipush -1
      // 06: istore 3
      // 07: istore 1
      // 08: bipush 0
      // 09: istore 4
      // 0b: iload 4
      // 0d: bipush 9
      // 0f: if_icmpge 69
      // 12: aload 0
      // 13: getfield a9u.wyl Lc05;
      // 16: getfield Minecraft.vg8 Ll86;
      // 19: getfield EntityPlayerSP.up_ Ljnq;
      // 1c: getfield jnq.c41 [Lerg;
      // 1f: iload 4
      // 21: aaload
      // 22: astore 5
      // 24: aload 5
      // 26: invokestatic Scaffold.unh (Lerg;)Z
      // 29: iload 1
      // 2a: ifeq 6a
      // 2d: iload 1
      // 2e: ifeq 46
      // 31: goto 38
      // 34: invokestatic a9u.a (Loov;)Loov;
      // 37: athrow
      // 38: ifne 45
      // 3b: goto 42
      // 3e: invokestatic a9u.a (Loov;)Loov;
      // 41: athrow
      // 42: goto 62
      // 45: iload 2
      // 46: iload 1
      // 47: ifeq 61
      // 4a: aload 5
      // 4c: getfield erg.qd2 I
      // 4f: if_icmpge 62
      // 52: goto 59
      // 55: invokestatic a9u.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 5
      // 5b: getfield erg.qd2 I
      // 5e: istore 2
      // 5f: iload 4
      // 61: istore 3
      // 62: iinc 4 1
      // 65: iload 1
      // 66: ifne 0b
      // 69: iload 3
      // 6a: ireturn
   }

   private void mam(mew var1, vt2 var2) {
      int var3 = OpaquePredicate.c();
      erg var4 = this.wyl.vg8.up_.dxs();

      erg var10000;
      label22: {
         try {
            var10000 = var4;
            if (var3 != 0) {
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
   public void e0s(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic Scaffold.yqi Lcn7;
      // 07: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifeq 36
      // 11: ifne 1c
      // 14: goto 1b
      // 17: invokestatic a9u.a (Loov;)Loov;
      // 1a: athrow
      // 1b: return
      // 1c: aload 1
      // 1d: bipush 1
      // 1e: invokevirtual _qa.yu1 (Z)V
      // 21: iload 2
      // 22: ifeq 7b
      // 25: aload 0
      // 26: getfield a9u.wyl Lc05;
      // 29: getfield Minecraft.vg8 Ll86;
      // 2c: getfield EntityPlayerSP.lfk Z
      // 2f: goto 36
      // 32: invokestatic a9u.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 6f
      // 39: aload 0
      // 3a: getfield a9u.wyl Lc05;
      // 3d: getfield Minecraft.vg8 Ll86;
      // 40: getfield EntityPlayerSP.fcv Z
      // 43: iload 2
      // 44: ifeq 6c
      // 47: goto 4e
      // 4a: invokestatic a9u.a (Loov;)Loov;
      // 4d: athrow
      // 4e: ifeq 6f
      // 51: goto 58
      // 54: invokestatic a9u.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getfield a9u.wyl Lc05;
      // 5c: getfield Minecraft.vg8 Ll86;
      // 5f: getfield EntityPlayerSP.g9g Lboa;
      // 62: getfield boa.s0a Z
      // 65: goto 6c
      // 68: invokestatic a9u.a (Loov;)Loov;
      // 6b: athrow
      // 6c: ifeq 80
      // 6f: aload 1
      // 70: dconst_0
      // 71: putfield _qa.c6l D
      // 74: goto 7b
      // 77: invokestatic a9u.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 1
      // 7c: dconst_0
      // 7d: putfield _qa.faq D
      // 80: return
   }

   private boolean wpm() {
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
      // 05: invokespecial a9u.ffi (II)I
      // 08: istore 2
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: aload 0
      // 0d: bipush 36
      // 0f: bipush 45
      // 11: invokespecial a9u.ffi (II)I
      // 14: istore 3
      // 15: istore 1
      // 16: iload 2
      // 17: iload 1
      // 18: ifeq 44
      // 1b: bipush -1
      // 1c: if_icmpne 43
      // 1f: goto 26
      // 22: invokestatic a9u.a (Loov;)Loov;
      // 25: athrow
      // 26: iload 3
      // 27: iload 1
      // 28: ifeq 44
      // 2b: goto 32
      // 2e: invokestatic a9u.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush -1
      // 33: if_icmpne 43
      // 36: goto 3d
      // 39: invokestatic a9u.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic a9u.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 1
      // 44: ireturn
   }

   private int ffi(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 1
      // 05: istore 4
      // 07: iload 4
      // 09: iload 2
      // 0a: if_icmpge 7b
      // 0d: aload 0
      // 0e: getfield a9u.wyl Lc05;
      // 11: getfield Minecraft.vg8 Ll86;
      // 14: getfield EntityPlayerSP.fv9 L_jc;
      // 17: iload 4
      // 19: invokevirtual _jc.ajr (I)Lvrx;
      // 1c: invokevirtual vrx.x4s ()Lerg;
      // 1f: astore 5
      // 21: iload 3
      // 22: ifne 77
      // 25: aload 5
      // 27: ifnull 74
      // 2a: goto 31
      // 2d: invokestatic a9u.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 5
      // 33: invokevirtual erg.gn1 ()Lu7m;
      // 36: instanceof gun
      // 39: iload 3
      // 3a: ifne 63
      // 3d: goto 44
      // 40: invokestatic a9u.a (Loov;)Loov;
      // 43: athrow
      // 44: ifeq 74
      // 47: goto 4e
      // 4a: invokestatic a9u.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 5
      // 50: invokevirtual erg.gn1 ()Lu7m;
      // 53: checkcast gun
      // 56: invokevirtual gun.kpo ()Le0x;
      // 59: invokevirtual e0x.z4c ()Z
      // 5c: goto 63
      // 5f: invokestatic a9u.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 3
      // 64: ifne 73
      // 67: ifeq 74
      // 6a: goto 71
      // 6d: invokestatic a9u.a (Loov;)Loov;
      // 70: athrow
      // 71: iload 4
      // 73: ireturn
      // 74: iinc 4 1
      // 77: iload 3
      // 78: ifeq 07
      // 7b: bipush -1
      // 7c: ireturn
   }

   private static int t4p(erg var0) {
      return var0.qd2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(265174535881676653L, 2799197831052306938L, MethodHandles.lookup().lookupClass()).a(50011596883829L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 15140680258679L;
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
      String var6 = "*\u00932n\f\u008df¶f\t¼¢f|\u0085\tÅ\u001cû0'lqk_`\u0081ØKÔ@ô\u0010$»\u008cþþÍ\u00003\u0083qá\u00922ô\u007f0";
      int var8 = "*\u00932n\f\u008df¶f\t¼¢f|\u0085\tÅ\u001cû0'lqk_`\u0081ØKÔ@ô\u0010$»\u008cþþÍ\u00003\u0083qá\u00922ô\u007f0".length();
      char var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18029;
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
            throw new RuntimeException("a9u", var10);
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
         throw new RuntimeException("a9u" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
