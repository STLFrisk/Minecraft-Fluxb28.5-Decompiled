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

public class zv4 extends j1s {
   private zv4$peb _zz;
   private nhs rbb;
   private boolean bs_;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public zv4() {
      long var1 = a ^ 34538291371174L;
      super(a<"o">(14475, 3746870995750024792L ^ var1), a<"o">(28854, 8388766799211576932L ^ var1));
      this._zz = null;
      this.rbb = new nhs();
   }

   @Override
   public void w4v() {
      super.w4v();
      this.rbb.zay();
   }

   @Override
   public void i__() {
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
      // 05: invokespecial j1s.i__ ()V
      // 08: aload 0
      // 09: getfield zv4.wyl Lc05;
      // 0c: iload 1
      // 0d: ifne 26
      // 10: getfield c05.tij Lkh3;
      // 13: ifnonnull 22
      // 16: goto 1d
      // 19: invokestatic zv4.a (Loov;)Loov;
      // 1c: athrow
      // 1d: return
      // 1e: invokestatic zv4.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield zv4.wyl Lc05;
      // 26: getfield c05.vg8 Ll86;
      // 29: bipush 1
      // 2a: putfield l86.lfk Z
      // 2d: return
   }

   private zv4$peb k8m(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: astore 3
      // 006: getstatic _lk.gxj Ljava/util/List;
      // 009: aload 0
      // 00a: getfield zv4.wyl Lc05;
      // 00d: getfield c05.tij Lkh3;
      // 010: aload 3
      // 011: bipush 0
      // 012: bipush -1
      // 013: bipush 0
      // 014: invokevirtual mew.ec4 (III)Lmew;
      // 017: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 01a: invokeinterface zfz.r_y ()Le0x; 1
      // 01f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 024: iload 2
      // 025: ifeq 068
      // 028: ifne 04a
      // 02b: goto 032
      // 02e: invokestatic zv4.a (Loov;)Loov;
      // 031: athrow
      // 032: new zv4$peb
      // 035: dup
      // 036: aload 0
      // 037: aload 3
      // 038: bipush 0
      // 039: bipush -1
      // 03a: bipush 0
      // 03b: invokevirtual mew.ec4 (III)Lmew;
      // 03e: getstatic vt2.rf3 Lvt2;
      // 041: aconst_null
      // 042: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 045: areturn
      // 046: invokestatic zv4.a (Loov;)Loov;
      // 049: athrow
      // 04a: getstatic _lk.gxj Ljava/util/List;
      // 04d: aload 0
      // 04e: getfield zv4.wyl Lc05;
      // 051: getfield c05.tij Lkh3;
      // 054: aload 3
      // 055: bipush -1
      // 056: bipush 0
      // 057: bipush 0
      // 058: invokevirtual mew.ec4 (III)Lmew;
      // 05b: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 05e: invokeinterface zfz.r_y ()Le0x; 1
      // 063: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 068: iload 2
      // 069: ifeq 0ac
      // 06c: ifne 08e
      // 06f: goto 076
      // 072: invokestatic zv4.a (Loov;)Loov;
      // 075: athrow
      // 076: new zv4$peb
      // 079: dup
      // 07a: aload 0
      // 07b: aload 3
      // 07c: bipush -1
      // 07d: bipush 0
      // 07e: bipush 0
      // 07f: invokevirtual mew.ec4 (III)Lmew;
      // 082: getstatic vt2.zk4 Lvt2;
      // 085: aconst_null
      // 086: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 089: areturn
      // 08a: invokestatic zv4.a (Loov;)Loov;
      // 08d: athrow
      // 08e: getstatic _lk.gxj Ljava/util/List;
      // 091: aload 0
      // 092: getfield zv4.wyl Lc05;
      // 095: getfield c05.tij Lkh3;
      // 098: aload 3
      // 099: bipush 1
      // 09a: bipush 0
      // 09b: bipush 0
      // 09c: invokevirtual mew.ec4 (III)Lmew;
      // 09f: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 0a2: invokeinterface zfz.r_y ()Le0x; 1
      // 0a7: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0ac: iload 2
      // 0ad: ifeq 0f0
      // 0b0: ifne 0d2
      // 0b3: goto 0ba
      // 0b6: invokestatic zv4.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: new zv4$peb
      // 0bd: dup
      // 0be: aload 0
      // 0bf: aload 3
      // 0c0: bipush 1
      // 0c1: bipush 0
      // 0c2: bipush 0
      // 0c3: invokevirtual mew.ec4 (III)Lmew;
      // 0c6: getstatic vt2.te4 Lvt2;
      // 0c9: aconst_null
      // 0ca: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 0cd: areturn
      // 0ce: invokestatic zv4.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: getstatic _lk.gxj Ljava/util/List;
      // 0d5: aload 0
      // 0d6: getfield zv4.wyl Lc05;
      // 0d9: getfield c05.tij Lkh3;
      // 0dc: aload 3
      // 0dd: bipush 0
      // 0de: bipush 0
      // 0df: bipush -1
      // 0e0: invokevirtual mew.ec4 (III)Lmew;
      // 0e3: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 0e6: invokeinterface zfz.r_y ()Le0x; 1
      // 0eb: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0f0: iload 2
      // 0f1: ifeq 134
      // 0f4: ifne 116
      // 0f7: goto 0fe
      // 0fa: invokestatic zv4.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: new zv4$peb
      // 101: dup
      // 102: aload 0
      // 103: aload 3
      // 104: bipush 0
      // 105: bipush 0
      // 106: bipush -1
      // 107: invokevirtual mew.ec4 (III)Lmew;
      // 10a: getstatic vt2.mxp Lvt2;
      // 10d: aconst_null
      // 10e: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 111: areturn
      // 112: invokestatic zv4.a (Loov;)Loov;
      // 115: athrow
      // 116: getstatic _lk.gxj Ljava/util/List;
      // 119: aload 0
      // 11a: getfield zv4.wyl Lc05;
      // 11d: getfield c05.tij Lkh3;
      // 120: aload 3
      // 121: bipush 0
      // 122: bipush 0
      // 123: bipush 1
      // 124: invokevirtual mew.ec4 (III)Lmew;
      // 127: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 12a: invokeinterface zfz.r_y ()Le0x; 1
      // 12f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 134: iload 2
      // 135: ifeq 180
      // 138: ifne 15a
      // 13b: goto 142
      // 13e: invokestatic zv4.a (Loov;)Loov;
      // 141: athrow
      // 142: new zv4$peb
      // 145: dup
      // 146: aload 0
      // 147: aload 3
      // 148: bipush 0
      // 149: bipush 0
      // 14a: bipush 1
      // 14b: invokevirtual mew.ec4 (III)Lmew;
      // 14e: getstatic vt2.z9q Lvt2;
      // 151: aconst_null
      // 152: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 155: areturn
      // 156: invokestatic zv4.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 1
      // 15b: bipush -1
      // 15c: bipush 0
      // 15d: bipush 0
      // 15e: invokevirtual mew.ec4 (III)Lmew;
      // 161: astore 3
      // 162: getstatic _lk.gxj Ljava/util/List;
      // 165: aload 0
      // 166: getfield zv4.wyl Lc05;
      // 169: getfield c05.tij Lkh3;
      // 16c: aload 3
      // 16d: bipush -1
      // 16e: bipush 0
      // 16f: bipush 0
      // 170: invokevirtual mew.ec4 (III)Lmew;
      // 173: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 176: invokeinterface zfz.r_y ()Le0x; 1
      // 17b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 180: iload 2
      // 181: ifeq 1c4
      // 184: ifne 1a6
      // 187: goto 18e
      // 18a: invokestatic zv4.a (Loov;)Loov;
      // 18d: athrow
      // 18e: new zv4$peb
      // 191: dup
      // 192: aload 0
      // 193: aload 3
      // 194: bipush -1
      // 195: bipush 0
      // 196: bipush 0
      // 197: invokevirtual mew.ec4 (III)Lmew;
      // 19a: getstatic vt2.zk4 Lvt2;
      // 19d: aconst_null
      // 19e: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 1a1: areturn
      // 1a2: invokestatic zv4.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: getstatic _lk.gxj Ljava/util/List;
      // 1a9: aload 0
      // 1aa: getfield zv4.wyl Lc05;
      // 1ad: getfield c05.tij Lkh3;
      // 1b0: aload 3
      // 1b1: bipush 1
      // 1b2: bipush 0
      // 1b3: bipush 0
      // 1b4: invokevirtual mew.ec4 (III)Lmew;
      // 1b7: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 1ba: invokeinterface zfz.r_y ()Le0x; 1
      // 1bf: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 1c4: iload 2
      // 1c5: ifeq 208
      // 1c8: ifne 1ea
      // 1cb: goto 1d2
      // 1ce: invokestatic zv4.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: new zv4$peb
      // 1d5: dup
      // 1d6: aload 0
      // 1d7: aload 3
      // 1d8: bipush 1
      // 1d9: bipush 0
      // 1da: bipush 0
      // 1db: invokevirtual mew.ec4 (III)Lmew;
      // 1de: getstatic vt2.te4 Lvt2;
      // 1e1: aconst_null
      // 1e2: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 1e5: areturn
      // 1e6: invokestatic zv4.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: getstatic _lk.gxj Ljava/util/List;
      // 1ed: aload 0
      // 1ee: getfield zv4.wyl Lc05;
      // 1f1: getfield c05.tij Lkh3;
      // 1f4: aload 3
      // 1f5: bipush 0
      // 1f6: bipush 0
      // 1f7: bipush -1
      // 1f8: invokevirtual mew.ec4 (III)Lmew;
      // 1fb: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 1fe: invokeinterface zfz.r_y ()Le0x; 1
      // 203: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 208: iload 2
      // 209: ifeq 24c
      // 20c: ifne 22e
      // 20f: goto 216
      // 212: invokestatic zv4.a (Loov;)Loov;
      // 215: athrow
      // 216: new zv4$peb
      // 219: dup
      // 21a: aload 0
      // 21b: aload 3
      // 21c: bipush 0
      // 21d: bipush 0
      // 21e: bipush -1
      // 21f: invokevirtual mew.ec4 (III)Lmew;
      // 222: getstatic vt2.mxp Lvt2;
      // 225: aconst_null
      // 226: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 229: areturn
      // 22a: invokestatic zv4.a (Loov;)Loov;
      // 22d: athrow
      // 22e: getstatic _lk.gxj Ljava/util/List;
      // 231: aload 0
      // 232: getfield zv4.wyl Lc05;
      // 235: getfield c05.tij Lkh3;
      // 238: aload 3
      // 239: bipush 0
      // 23a: bipush 0
      // 23b: bipush 1
      // 23c: invokevirtual mew.ec4 (III)Lmew;
      // 23f: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 242: invokeinterface zfz.r_y ()Le0x; 1
      // 247: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 24c: iload 2
      // 24d: ifeq 298
      // 250: ifne 272
      // 253: goto 25a
      // 256: invokestatic zv4.a (Loov;)Loov;
      // 259: athrow
      // 25a: new zv4$peb
      // 25d: dup
      // 25e: aload 0
      // 25f: aload 3
      // 260: bipush 0
      // 261: bipush 0
      // 262: bipush 1
      // 263: invokevirtual mew.ec4 (III)Lmew;
      // 266: getstatic vt2.z9q Lvt2;
      // 269: aconst_null
      // 26a: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 26d: areturn
      // 26e: invokestatic zv4.a (Loov;)Loov;
      // 271: athrow
      // 272: aload 1
      // 273: bipush 1
      // 274: bipush 0
      // 275: bipush 0
      // 276: invokevirtual mew.ec4 (III)Lmew;
      // 279: astore 3
      // 27a: getstatic _lk.gxj Ljava/util/List;
      // 27d: aload 0
      // 27e: getfield zv4.wyl Lc05;
      // 281: getfield c05.tij Lkh3;
      // 284: aload 3
      // 285: bipush -1
      // 286: bipush 0
      // 287: bipush 0
      // 288: invokevirtual mew.ec4 (III)Lmew;
      // 28b: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 28e: invokeinterface zfz.r_y ()Le0x; 1
      // 293: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 298: iload 2
      // 299: ifeq 2dc
      // 29c: ifne 2be
      // 29f: goto 2a6
      // 2a2: invokestatic zv4.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: new zv4$peb
      // 2a9: dup
      // 2aa: aload 0
      // 2ab: aload 3
      // 2ac: bipush -1
      // 2ad: bipush 0
      // 2ae: bipush 0
      // 2af: invokevirtual mew.ec4 (III)Lmew;
      // 2b2: getstatic vt2.zk4 Lvt2;
      // 2b5: aconst_null
      // 2b6: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 2b9: areturn
      // 2ba: invokestatic zv4.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: getstatic _lk.gxj Ljava/util/List;
      // 2c1: aload 0
      // 2c2: getfield zv4.wyl Lc05;
      // 2c5: getfield c05.tij Lkh3;
      // 2c8: aload 3
      // 2c9: bipush 1
      // 2ca: bipush 0
      // 2cb: bipush 0
      // 2cc: invokevirtual mew.ec4 (III)Lmew;
      // 2cf: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 2d2: invokeinterface zfz.r_y ()Le0x; 1
      // 2d7: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 2dc: iload 2
      // 2dd: ifeq 320
      // 2e0: ifne 302
      // 2e3: goto 2ea
      // 2e6: invokestatic zv4.a (Loov;)Loov;
      // 2e9: athrow
      // 2ea: new zv4$peb
      // 2ed: dup
      // 2ee: aload 0
      // 2ef: aload 3
      // 2f0: bipush 1
      // 2f1: bipush 0
      // 2f2: bipush 0
      // 2f3: invokevirtual mew.ec4 (III)Lmew;
      // 2f6: getstatic vt2.te4 Lvt2;
      // 2f9: aconst_null
      // 2fa: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 2fd: areturn
      // 2fe: invokestatic zv4.a (Loov;)Loov;
      // 301: athrow
      // 302: getstatic _lk.gxj Ljava/util/List;
      // 305: aload 0
      // 306: getfield zv4.wyl Lc05;
      // 309: getfield c05.tij Lkh3;
      // 30c: aload 3
      // 30d: bipush 0
      // 30e: bipush 0
      // 30f: bipush -1
      // 310: invokevirtual mew.ec4 (III)Lmew;
      // 313: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 316: invokeinterface zfz.r_y ()Le0x; 1
      // 31b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 320: iload 2
      // 321: ifeq 364
      // 324: ifne 346
      // 327: goto 32e
      // 32a: invokestatic zv4.a (Loov;)Loov;
      // 32d: athrow
      // 32e: new zv4$peb
      // 331: dup
      // 332: aload 0
      // 333: aload 3
      // 334: bipush 0
      // 335: bipush 0
      // 336: bipush -1
      // 337: invokevirtual mew.ec4 (III)Lmew;
      // 33a: getstatic vt2.mxp Lvt2;
      // 33d: aconst_null
      // 33e: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 341: areturn
      // 342: invokestatic zv4.a (Loov;)Loov;
      // 345: athrow
      // 346: getstatic _lk.gxj Ljava/util/List;
      // 349: aload 0
      // 34a: getfield zv4.wyl Lc05;
      // 34d: getfield c05.tij Lkh3;
      // 350: aload 3
      // 351: bipush 0
      // 352: bipush 0
      // 353: bipush 1
      // 354: invokevirtual mew.ec4 (III)Lmew;
      // 357: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 35a: invokeinterface zfz.r_y ()Le0x; 1
      // 35f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 364: iload 2
      // 365: ifeq 3b0
      // 368: ifne 38a
      // 36b: goto 372
      // 36e: invokestatic zv4.a (Loov;)Loov;
      // 371: athrow
      // 372: new zv4$peb
      // 375: dup
      // 376: aload 0
      // 377: aload 3
      // 378: bipush 0
      // 379: bipush 0
      // 37a: bipush 1
      // 37b: invokevirtual mew.ec4 (III)Lmew;
      // 37e: getstatic vt2.z9q Lvt2;
      // 381: aconst_null
      // 382: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 385: areturn
      // 386: invokestatic zv4.a (Loov;)Loov;
      // 389: athrow
      // 38a: aload 1
      // 38b: bipush 0
      // 38c: bipush 0
      // 38d: bipush -1
      // 38e: invokevirtual mew.ec4 (III)Lmew;
      // 391: astore 3
      // 392: getstatic _lk.gxj Ljava/util/List;
      // 395: aload 0
      // 396: getfield zv4.wyl Lc05;
      // 399: getfield c05.tij Lkh3;
      // 39c: aload 3
      // 39d: bipush -1
      // 39e: bipush 0
      // 39f: bipush 0
      // 3a0: invokevirtual mew.ec4 (III)Lmew;
      // 3a3: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 3a6: invokeinterface zfz.r_y ()Le0x; 1
      // 3ab: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 3b0: iload 2
      // 3b1: ifeq 3f4
      // 3b4: ifne 3d6
      // 3b7: goto 3be
      // 3ba: invokestatic zv4.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: new zv4$peb
      // 3c1: dup
      // 3c2: aload 0
      // 3c3: aload 3
      // 3c4: bipush -1
      // 3c5: bipush 0
      // 3c6: bipush 0
      // 3c7: invokevirtual mew.ec4 (III)Lmew;
      // 3ca: getstatic vt2.zk4 Lvt2;
      // 3cd: aconst_null
      // 3ce: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 3d1: areturn
      // 3d2: invokestatic zv4.a (Loov;)Loov;
      // 3d5: athrow
      // 3d6: getstatic _lk.gxj Ljava/util/List;
      // 3d9: aload 0
      // 3da: getfield zv4.wyl Lc05;
      // 3dd: getfield c05.tij Lkh3;
      // 3e0: aload 3
      // 3e1: bipush 1
      // 3e2: bipush 0
      // 3e3: bipush 0
      // 3e4: invokevirtual mew.ec4 (III)Lmew;
      // 3e7: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 3ea: invokeinterface zfz.r_y ()Le0x; 1
      // 3ef: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 3f4: iload 2
      // 3f5: ifeq 438
      // 3f8: ifne 41a
      // 3fb: goto 402
      // 3fe: invokestatic zv4.a (Loov;)Loov;
      // 401: athrow
      // 402: new zv4$peb
      // 405: dup
      // 406: aload 0
      // 407: aload 3
      // 408: bipush 1
      // 409: bipush 0
      // 40a: bipush 0
      // 40b: invokevirtual mew.ec4 (III)Lmew;
      // 40e: getstatic vt2.te4 Lvt2;
      // 411: aconst_null
      // 412: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 415: areturn
      // 416: invokestatic zv4.a (Loov;)Loov;
      // 419: athrow
      // 41a: getstatic _lk.gxj Ljava/util/List;
      // 41d: aload 0
      // 41e: getfield zv4.wyl Lc05;
      // 421: getfield c05.tij Lkh3;
      // 424: aload 3
      // 425: bipush 0
      // 426: bipush 0
      // 427: bipush -1
      // 428: invokevirtual mew.ec4 (III)Lmew;
      // 42b: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 42e: invokeinterface zfz.r_y ()Le0x; 1
      // 433: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 438: iload 2
      // 439: ifeq 47c
      // 43c: ifne 45e
      // 43f: goto 446
      // 442: invokestatic zv4.a (Loov;)Loov;
      // 445: athrow
      // 446: new zv4$peb
      // 449: dup
      // 44a: aload 0
      // 44b: aload 3
      // 44c: bipush 0
      // 44d: bipush 0
      // 44e: bipush -1
      // 44f: invokevirtual mew.ec4 (III)Lmew;
      // 452: getstatic vt2.mxp Lvt2;
      // 455: aconst_null
      // 456: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 459: areturn
      // 45a: invokestatic zv4.a (Loov;)Loov;
      // 45d: athrow
      // 45e: getstatic _lk.gxj Ljava/util/List;
      // 461: aload 0
      // 462: getfield zv4.wyl Lc05;
      // 465: getfield c05.tij Lkh3;
      // 468: aload 3
      // 469: bipush 0
      // 46a: bipush 0
      // 46b: bipush 1
      // 46c: invokevirtual mew.ec4 (III)Lmew;
      // 46f: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 472: invokeinterface zfz.r_y ()Le0x; 1
      // 477: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 47c: iload 2
      // 47d: ifeq 4c8
      // 480: ifne 4a2
      // 483: goto 48a
      // 486: invokestatic zv4.a (Loov;)Loov;
      // 489: athrow
      // 48a: new zv4$peb
      // 48d: dup
      // 48e: aload 0
      // 48f: aload 3
      // 490: bipush 0
      // 491: bipush 0
      // 492: bipush 1
      // 493: invokevirtual mew.ec4 (III)Lmew;
      // 496: getstatic vt2.z9q Lvt2;
      // 499: aconst_null
      // 49a: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 49d: areturn
      // 49e: invokestatic zv4.a (Loov;)Loov;
      // 4a1: athrow
      // 4a2: aload 1
      // 4a3: bipush 0
      // 4a4: bipush 0
      // 4a5: bipush 1
      // 4a6: invokevirtual mew.ec4 (III)Lmew;
      // 4a9: astore 3
      // 4aa: getstatic _lk.gxj Ljava/util/List;
      // 4ad: aload 0
      // 4ae: getfield zv4.wyl Lc05;
      // 4b1: getfield c05.tij Lkh3;
      // 4b4: aload 3
      // 4b5: bipush -1
      // 4b6: bipush 0
      // 4b7: bipush 0
      // 4b8: invokevirtual mew.ec4 (III)Lmew;
      // 4bb: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 4be: invokeinterface zfz.r_y ()Le0x; 1
      // 4c3: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 4c8: iload 2
      // 4c9: ifeq 50c
      // 4cc: ifne 4ee
      // 4cf: goto 4d6
      // 4d2: invokestatic zv4.a (Loov;)Loov;
      // 4d5: athrow
      // 4d6: new zv4$peb
      // 4d9: dup
      // 4da: aload 0
      // 4db: aload 3
      // 4dc: bipush -1
      // 4dd: bipush 0
      // 4de: bipush 0
      // 4df: invokevirtual mew.ec4 (III)Lmew;
      // 4e2: getstatic vt2.zk4 Lvt2;
      // 4e5: aconst_null
      // 4e6: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 4e9: areturn
      // 4ea: invokestatic zv4.a (Loov;)Loov;
      // 4ed: athrow
      // 4ee: getstatic _lk.gxj Ljava/util/List;
      // 4f1: aload 0
      // 4f2: getfield zv4.wyl Lc05;
      // 4f5: getfield c05.tij Lkh3;
      // 4f8: aload 3
      // 4f9: bipush 1
      // 4fa: bipush 0
      // 4fb: bipush 0
      // 4fc: invokevirtual mew.ec4 (III)Lmew;
      // 4ff: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 502: invokeinterface zfz.r_y ()Le0x; 1
      // 507: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 50c: iload 2
      // 50d: ifeq 550
      // 510: ifne 532
      // 513: goto 51a
      // 516: invokestatic zv4.a (Loov;)Loov;
      // 519: athrow
      // 51a: new zv4$peb
      // 51d: dup
      // 51e: aload 0
      // 51f: aload 3
      // 520: bipush 1
      // 521: bipush 0
      // 522: bipush 0
      // 523: invokevirtual mew.ec4 (III)Lmew;
      // 526: getstatic vt2.te4 Lvt2;
      // 529: aconst_null
      // 52a: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 52d: areturn
      // 52e: invokestatic zv4.a (Loov;)Loov;
      // 531: athrow
      // 532: getstatic _lk.gxj Ljava/util/List;
      // 535: aload 0
      // 536: getfield zv4.wyl Lc05;
      // 539: getfield c05.tij Lkh3;
      // 53c: aload 3
      // 53d: bipush 0
      // 53e: bipush 0
      // 53f: bipush -1
      // 540: invokevirtual mew.ec4 (III)Lmew;
      // 543: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 546: invokeinterface zfz.r_y ()Le0x; 1
      // 54b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 550: iload 2
      // 551: ifeq 594
      // 554: ifne 576
      // 557: goto 55e
      // 55a: invokestatic zv4.a (Loov;)Loov;
      // 55d: athrow
      // 55e: new zv4$peb
      // 561: dup
      // 562: aload 0
      // 563: aload 3
      // 564: bipush 0
      // 565: bipush 0
      // 566: bipush -1
      // 567: invokevirtual mew.ec4 (III)Lmew;
      // 56a: getstatic vt2.mxp Lvt2;
      // 56d: aconst_null
      // 56e: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 571: areturn
      // 572: invokestatic zv4.a (Loov;)Loov;
      // 575: athrow
      // 576: getstatic _lk.gxj Ljava/util/List;
      // 579: aload 0
      // 57a: getfield zv4.wyl Lc05;
      // 57d: getfield c05.tij Lkh3;
      // 580: aload 3
      // 581: bipush 0
      // 582: bipush 0
      // 583: bipush 1
      // 584: invokevirtual mew.ec4 (III)Lmew;
      // 587: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 58a: invokeinterface zfz.r_y ()Le0x; 1
      // 58f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 594: ifne 5af
      // 597: new zv4$peb
      // 59a: dup
      // 59b: aload 0
      // 59c: aload 3
      // 59d: bipush 0
      // 59e: bipush 0
      // 59f: bipush 1
      // 5a0: invokevirtual mew.ec4 (III)Lmew;
      // 5a3: getstatic vt2.z9q Lvt2;
      // 5a6: aconst_null
      // 5a7: invokespecial zv4$peb.<init> (Lzv4;Lmew;Lvt2;Lzv4$1;)V
      // 5aa: areturn
      // 5ab: invokestatic zv4.a (Loov;)Loov;
      // 5ae: athrow
      // 5af: aconst_null
      // 5b0: areturn
   }

   @jev(
      jn1 = 0
   )
   public void uwz(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual fz2.lhw ()Z
      // 008: iload 2
      // 009: ifne 036
      // 00c: ifeq 020
      // 00f: goto 016
      // 012: invokestatic zv4.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: bipush 0
      // 018: putfield zv4.bs_ Z
      // 01b: return
      // 01c: invokestatic zv4.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 1
      // 021: ldc 90.0
      // 023: nop
      // 024: invokevirtual fz2.ni7 (F)V
      // 027: aload 0
      // 028: aconst_null
      // 029: putfield zv4._zz Lzv4$peb;
      // 02c: aload 0
      // 02d: getfield zv4.wyl Lc05;
      // 030: getfield c05.vg8 Ll86;
      // 033: invokevirtual l86.hzv ()Z
      // 036: iload 2
      // 037: ifne 060
      // 03a: ifne 1bc
      // 03d: goto 044
      // 040: invokestatic zv4.a (Loov;)Loov;
      // 043: athrow
      // 044: aload 0
      // 045: getfield zv4.wyl Lc05;
      // 048: getfield c05.vg8 Ll86;
      // 04b: iload 2
      // 04c: ifne 071
      // 04f: goto 056
      // 052: invokestatic zv4.a (Loov;)Loov;
      // 055: athrow
      // 056: getfield l86.lfk Z
      // 059: goto 060
      // 05c: invokestatic zv4.a (Loov;)Loov;
      // 05f: athrow
      // 060: ifeq 138
      // 063: aload 0
      // 064: getfield zv4.wyl Lc05;
      // 067: getfield c05.vg8 Ll86;
      // 06a: goto 071
      // 06d: invokestatic zv4.a (Loov;)Loov;
      // 070: athrow
      // 071: getfield l86.x5k F
      // 074: ldc 90.0
      // 076: nop
      // 077: fadd
      // 078: f2d
      // 079: invokestatic java/lang/Math.toRadians (D)D
      // 07c: invokestatic java/lang/Math.cos (D)D
      // 07f: dstore 4
      // 081: aload 0
      // 082: getfield zv4.wyl Lc05;
      // 085: getfield c05.vg8 Ll86;
      // 088: getfield l86.x5k F
      // 08b: ldc 90.0
      // 08d: nop
      // 08e: fadd
      // 08f: f2d
      // 090: invokestatic java/lang/Math.toRadians (D)D
      // 093: invokestatic java/lang/Math.sin (D)D
      // 096: dstore 6
      // 098: aload 0
      // 099: getfield zv4.wyl Lc05;
      // 09c: getfield c05.vg8 Ll86;
      // 09f: getfield l86.g9g Lboa;
      // 0a2: getfield boa._mw F
      // 0a5: f2d
      // 0a6: ldc2_w 0.4
      // 0a9: dmul
      // 0aa: dload 4
      // 0ac: dmul
      // 0ad: dstore 8
      // 0af: dload 8
      // 0b1: aload 0
      // 0b2: getfield zv4.wyl Lc05;
      // 0b5: getfield c05.vg8 Ll86;
      // 0b8: getfield l86.g9g Lboa;
      // 0bb: getfield boa.lrp F
      // 0be: f2d
      // 0bf: ldc2_w 0.4
      // 0c2: dmul
      // 0c3: dload 6
      // 0c5: dmul
      // 0c6: dadd
      // 0c7: dstore 10
      // 0c9: aload 0
      // 0ca: getfield zv4.wyl Lc05;
      // 0cd: getfield c05.vg8 Ll86;
      // 0d0: getfield l86.g9g Lboa;
      // 0d3: getfield boa._mw F
      // 0d6: f2d
      // 0d7: ldc2_w 0.4
      // 0da: dmul
      // 0db: dload 6
      // 0dd: dmul
      // 0de: dstore 8
      // 0e0: dload 8
      // 0e2: aload 0
      // 0e3: getfield zv4.wyl Lc05;
      // 0e6: getfield c05.vg8 Ll86;
      // 0e9: getfield l86.g9g Lboa;
      // 0ec: getfield boa.lrp F
      // 0ef: f2d
      // 0f0: ldc2_w 0.4
      // 0f3: dmul
      // 0f4: dload 4
      // 0f6: dmul
      // 0f7: dsub
      // 0f8: dstore 12
      // 0fa: aload 0
      // 0fb: getfield zv4.wyl Lc05;
      // 0fe: getfield c05.vg8 Ll86;
      // 101: getfield l86.o2v D
      // 104: dload 10
      // 106: dadd
      // 107: dstore 14
      // 109: aload 0
      // 10a: getfield zv4.wyl Lc05;
      // 10d: getfield c05.vg8 Ll86;
      // 110: getfield l86.kfp D
      // 113: dconst_1
      // 114: dsub
      // 115: dstore 16
      // 117: aload 0
      // 118: getfield zv4.wyl Lc05;
      // 11b: getfield c05.vg8 Ll86;
      // 11e: getfield l86.vbd D
      // 121: dload 12
      // 123: dadd
      // 124: dstore 18
      // 126: new mew
      // 129: dup
      // 12a: dload 14
      // 12c: dload 16
      // 12e: dload 18
      // 130: invokespecial mew.<init> (DDD)V
      // 133: astore 3
      // 134: iload 2
      // 135: ifeq 163
      // 138: new mew
      // 13b: dup
      // 13c: aload 0
      // 13d: getfield zv4.wyl Lc05;
      // 140: invokevirtual c05.nsd ()Li2h;
      // 143: getfield i2h.o2v D
      // 146: aload 0
      // 147: getfield zv4.wyl Lc05;
      // 14a: invokevirtual c05.nsd ()Li2h;
      // 14d: invokevirtual i2h.aaw ()Lnh4;
      // 150: getfield nh4.bx_ D
      // 153: dconst_1
      // 154: dsub
      // 155: aload 0
      // 156: getfield zv4.wyl Lc05;
      // 159: invokevirtual c05.nsd ()Li2h;
      // 15c: getfield i2h.vbd D
      // 15f: invokespecial mew.<init> (DDD)V
      // 162: astore 3
      // 163: aload 0
      // 164: iload 2
      // 165: ifne 195
      // 168: getfield zv4.wyl Lc05;
      // 16b: getfield c05.tij Lkh3;
      // 16e: aload 3
      // 16f: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 172: invokeinterface zfz.r_y ()Le0x; 1
      // 177: getstatic ox_.ibw Le0x;
      // 17a: if_acmpne 1bc
      // 17d: goto 184
      // 180: invokestatic zv4.a (Loov;)Loov;
      // 183: athrow
      // 184: aload 0
      // 185: aload 0
      // 186: aload 3
      // 187: invokespecial zv4.k8m (Lmew;)Lzv4$peb;
      // 18a: putfield zv4._zz Lzv4$peb;
      // 18d: aload 0
      // 18e: goto 195
      // 191: invokestatic zv4.a (Loov;)Loov;
      // 194: athrow
      // 195: getfield zv4._zz Lzv4$peb;
      // 198: getfield zv4$peb.mv8 Lmew;
      // 19b: aload 0
      // 19c: getfield zv4._zz Lzv4$peb;
      // 19f: getfield zv4$peb.t7f Lvt2;
      // 1a2: invokestatic omb.ln0 (Lmew;Lvt2;)[F
      // 1a5: astore 4
      // 1a7: aload 1
      // 1a8: aload 4
      // 1aa: bipush 0
      // 1ab: faload
      // 1ac: invokevirtual fz2.h8j (F)V
      // 1af: aload 1
      // 1b0: aload 4
      // 1b2: bipush 1
      // 1b3: faload
      // 1b4: invokevirtual fz2.ni7 (F)V
      // 1b7: aload 0
      // 1b8: bipush 1
      // 1b9: putfield zv4.bs_ Z
      // 1bc: return
   }

   @jev(
      jn1 = 3
   )
   public void w04(q8e param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 21
      // 09: getfield zv4.bs_ Z
      // 0c: ifne 1b
      // 0f: goto 16
      // 12: invokestatic zv4.a (Loov;)Loov;
      // 15: athrow
      // 16: return
      // 17: invokestatic zv4.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: bipush 0
      // 1d: putfield zv4.bs_ Z
      // 20: aload 0
      // 21: iload 2
      // 22: ifeq 3a
      // 25: getfield zv4._zz Lzv4$peb;
      // 28: ifnull ea
      // 2b: goto 32
      // 2e: invokestatic zv4.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: goto 3a
      // 36: invokestatic zv4.a (Loov;)Loov;
      // 39: athrow
      // 3a: getfield zv4.wyl Lc05;
      // 3d: getfield c05.vg8 Ll86;
      // 40: getfield l86.up_ Ljnq;
      // 43: invokevirtual jnq.dxs ()Lerg;
      // 46: iload 2
      // 47: ifeq 68
      // 4a: ifnull ea
      // 4d: goto 54
      // 50: invokestatic zv4.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: getfield zv4.wyl Lc05;
      // 58: getfield c05.vg8 Ll86;
      // 5b: getfield l86.up_ Ljnq;
      // 5e: invokevirtual jnq.dxs ()Lerg;
      // 61: goto 68
      // 64: invokestatic zv4.a (Loov;)Loov;
      // 67: athrow
      // 68: invokevirtual erg.gn1 ()Lu7m;
      // 6b: instanceof gun
      // 6e: iload 2
      // 6f: ifeq 93
      // 72: ifeq ea
      // 75: goto 7c
      // 78: invokestatic zv4.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield zv4.wyl Lc05;
      // 80: getfield c05.vg8 Ll86;
      // 83: getfield l86.up_ Ljnq;
      // 86: invokevirtual jnq.dxs ()Lerg;
      // 89: getfield erg.qd2 I
      // 8c: goto 93
      // 8f: invokestatic zv4.a (Loov;)Loov;
      // 92: athrow
      // 93: iload 2
      // 94: ifeq bd
      // 97: ifle ea
      // 9a: goto a1
      // 9d: invokestatic zv4.a (Loov;)Loov;
      // a0: athrow
      // a1: aload 0
      // a2: getfield zv4.rbb Lnhs;
      // a5: iload 2
      // a6: ifeq cb
      // a9: goto b0
      // ac: invokestatic zv4.a (Loov;)Loov;
      // af: athrow
      // b0: ldc2_w 300.0
      // b3: invokevirtual nhs.yrv (D)Z
      // b6: goto bd
      // b9: invokestatic zv4.a (Loov;)Loov;
      // bc: athrow
      // bd: ifeq ea
      // c0: aload 0
      // c1: getfield zv4.rbb Lnhs;
      // c4: goto cb
      // c7: invokestatic zv4.a (Loov;)Loov;
      // ca: athrow
      // cb: invokevirtual nhs.zay ()V
      // ce: aload 0
      // cf: getfield zv4.wyl Lc05;
      // d2: getfield c05.vg8 Ll86;
      // d5: invokevirtual l86.hgb ()V
      // d8: aload 0
      // d9: aload 0
      // da: getfield zv4._zz Lzv4$peb;
      // dd: getfield zv4$peb.mv8 Lmew;
      // e0: aload 0
      // e1: getfield zv4._zz Lzv4$peb;
      // e4: getfield zv4$peb.t7f Lvt2;
      // e7: invokespecial zv4.jut (Lmew;Lvt2;)V
      // ea: return
   }

   @jev
   public void y1v(b4u param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: bipush 8
      // 09: if_icmpge 6e
      // 0c: aload 0
      // 0d: getfield zv4.wyl Lc05;
      // 10: getfield c05.vg8 Ll86;
      // 13: getfield l86.up_ Ljnq;
      // 16: getfield jnq.c41 [Lerg;
      // 19: iload 3
      // 1a: aaload
      // 1b: iload 2
      // 1c: ifne 4a
      // 1f: ifnull 67
      // 22: goto 29
      // 25: invokestatic zv4.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield zv4.wyl Lc05;
      // 2d: getfield c05.vg8 Ll86;
      // 30: getfield l86.up_ Ljnq;
      // 33: getfield jnq.c41 [Lerg;
      // 36: iload 3
      // 37: iload 2
      // 38: ifne 65
      // 3b: goto 42
      // 3e: invokestatic zv4.a (Loov;)Loov;
      // 41: athrow
      // 42: aaload
      // 43: goto 4a
      // 46: invokestatic zv4.a (Loov;)Loov;
      // 49: athrow
      // 4a: getfield erg.qd2 I
      // 4d: ifgt 67
      // 50: aload 0
      // 51: getfield zv4.wyl Lc05;
      // 54: getfield c05.vg8 Ll86;
      // 57: getfield l86.up_ Ljnq;
      // 5a: getfield jnq.c41 [Lerg;
      // 5d: iload 3
      // 5e: goto 65
      // 61: invokestatic zv4.a (Loov;)Loov;
      // 64: athrow
      // 65: aconst_null
      // 66: aastore
      // 67: iinc 3 1
      // 6a: iload 2
      // 6b: ifeq 06
      // 6e: return
   }

   private void jut(mew var1, vt2 var2) {
      int var3 = t9d.b();
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

   @jev
   public void yqu(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: getstatic _lk.yqi Lcn7;
      // 07: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: iload 2
      // 0e: ifeq 36
      // 11: ifne 1c
      // 14: goto 1b
      // 17: invokestatic zv4.a (Loov;)Loov;
      // 1a: athrow
      // 1b: return
      // 1c: aload 1
      // 1d: bipush 1
      // 1e: invokevirtual _qa.yu1 (Z)V
      // 21: iload 2
      // 22: ifeq 7b
      // 25: aload 0
      // 26: getfield zv4.wyl Lc05;
      // 29: getfield c05.vg8 Ll86;
      // 2c: getfield l86.lfk Z
      // 2f: goto 36
      // 32: invokestatic zv4.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 6f
      // 39: aload 0
      // 3a: getfield zv4.wyl Lc05;
      // 3d: getfield c05.vg8 Ll86;
      // 40: getfield l86.fcv Z
      // 43: iload 2
      // 44: ifeq 6c
      // 47: goto 4e
      // 4a: invokestatic zv4.a (Loov;)Loov;
      // 4d: athrow
      // 4e: ifeq 6f
      // 51: goto 58
      // 54: invokestatic zv4.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getfield zv4.wyl Lc05;
      // 5c: getfield c05.vg8 Ll86;
      // 5f: getfield l86.g9g Lboa;
      // 62: getfield boa.s0a Z
      // 65: goto 6c
      // 68: invokestatic zv4.a (Loov;)Loov;
      // 6b: athrow
      // 6c: ifeq 80
      // 6f: aload 1
      // 70: dconst_0
      // 71: putfield _qa.c6l D
      // 74: goto 7b
      // 77: invokestatic zv4.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 1
      // 7c: dconst_0
      // 7d: putfield _qa.faq D
      // 80: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3747576435036473922L, 395574923964224051L, MethodHandles.lookup().lookupClass()).a(222568935331939L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 62742969755113L;
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
      String var6 = "û\u0017=«Û¿É@HjÐè\u0006Û¾Ë'í>*ÿÖAC\u0010g¨ç4\u0013ôa\u009b*RÂÙÍ ºL";
      int var8 = "û\u0017=«Û¿É@HjÐè\u0006Û¾Ë'í>*ÿÖAC\u0010g¨ç4\u0013ôa\u009b*RÂÙÍ ºL".length();
      char var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19745;
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
            throw new RuntimeException("zv4", var10);
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
         throw new RuntimeException("zv4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
