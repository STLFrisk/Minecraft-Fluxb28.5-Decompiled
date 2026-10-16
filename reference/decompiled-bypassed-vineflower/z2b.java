import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class z2b extends rrw implements jrp {
   public static final zb_ ehq;
   public static final _ku cjq;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public z2b() {
      this.y8l(this._8_.c32().zvi(ehq, x54$lti.mdr).zvi(cjq, 0));
      float var1 = 0.4F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var1 * 2.0F, 0.5F + var1);
      this.i3l(uja.qqf);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 47283364122843L;
      return orr.zgh(this.abc() + "." + x54$lti.mdr.lfl() + b<"v">(24445, 105814998504300678L ^ var1));
   }

   @Override
   public void zvy(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 5
      // 0b: ifne 30
      // 0e: ifne 62
      // 11: goto 18
      // 14: invokestatic z2b.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: aload 3
      // 1c: aload 4
      // 1e: invokespecial rrw.zvy (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 21: aload 1
      // 22: aload 2
      // 23: invokevirtual mew.nuv ()Lmew;
      // 26: invokevirtual t9d.rts (Lmew;)I
      // 29: goto 30
      // 2c: invokestatic z2b.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 5
      // 32: ifne 4f
      // 35: bipush 9
      // 37: if_icmplt 62
      // 3a: goto 41
      // 3d: invokestatic z2b.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 4
      // 43: bipush 7
      // 45: invokevirtual java/util/Random.nextInt (I)I
      // 48: goto 4f
      // 4b: invokestatic z2b.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifne 62
      // 52: aload 0
      // 53: aload 1
      // 54: aload 2
      // 55: aload 3
      // 56: aload 4
      // 58: invokevirtual z2b._fr (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 5b: goto 62
      // 5e: invokestatic z2b.a (Loov;)Loov;
      // 61: athrow
      // 62: return
   }

   public void _fr(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic z2b.cjq L_ku;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: iload 5
      // 16: ifne 39
      // 19: ifne 3f
      // 1c: goto 23
      // 1f: invokestatic z2b.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: aload 2
      // 25: aload 3
      // 26: getstatic z2b.cjq L_ku;
      // 29: invokeinterface zfz.dm4 (Lxny;)Lzfz; 2
      // 2e: bipush 4
      // 2f: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 32: goto 39
      // 35: invokestatic z2b.a (Loov;)Loov;
      // 38: athrow
      // 39: pop
      // 3a: iload 5
      // 3c: ifeq 4f
      // 3f: aload 0
      // 40: aload 1
      // 41: aload 2
      // 42: aload 3
      // 43: aload 4
      // 45: invokevirtual z2b.prw (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 48: goto 4f
      // 4b: invokestatic z2b.a (Loov;)Loov;
      // 4e: athrow
      // 4f: return
   }

   public void prw(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 5
      // 005: aload 4
      // 007: bipush 10
      // 009: invokevirtual java/util/Random.nextInt (I)I
      // 00c: ifne 01e
      // 00f: new s9p
      // 012: dup
      // 013: bipush 1
      // 014: invokespecial s9p.<init> (Z)V
      // 017: goto 026
      // 01a: invokestatic z2b.a (Loov;)Loov;
      // 01d: athrow
      // 01e: new ffn
      // 021: dup
      // 022: bipush 1
      // 023: invokespecial ffn.<init> (Z)V
      // 026: astore 6
      // 028: bipush 0
      // 029: istore 7
      // 02b: bipush 0
      // 02c: istore 8
      // 02e: bipush 0
      // 02f: istore 9
      // 031: getstatic z2b$1.jg9 [I
      // 034: aload 3
      // 035: getstatic z2b.ehq Lzb_;
      // 038: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 03d: checkcast x54$lti
      // 040: invokevirtual x54$lti.ordinal ()I
      // 043: iaload
      // 044: iload 5
      // 046: ifeq 075
      // 049: tableswitch 488 1 6 43 171 187 382 397 488
      // 070: invokestatic z2b.a (Loov;)Loov;
      // 073: athrow
      // 074: bipush 0
      // 075: istore 7
      // 077: iload 7
      // 079: bipush -1
      // 07a: if_icmplt 0ce
      // 07d: bipush 0
      // 07e: iload 5
      // 080: ifeq 0d0
      // 083: istore 8
      // 085: iload 8
      // 087: bipush -1
      // 088: if_icmplt 0c6
      // 08b: aload 0
      // 08c: aload 1
      // 08d: aload 2
      // 08e: iload 7
      // 090: iload 8
      // 092: getstatic x54$lti.b4p Lx54$lti;
      // 095: invokespecial z2b.mw1 (Lt9d;Lmew;IILx54$lti;)Z
      // 098: iload 5
      // 09a: ifeq 079
      // 09d: ifeq 0b7
      // 0a0: new _q4
      // 0a3: dup
      // 0a4: bipush 0
      // 0a5: aload 4
      // 0a7: invokevirtual java/util/Random.nextBoolean ()Z
      // 0aa: invokespecial _q4.<init> (ZZ)V
      // 0ad: astore 6
      // 0af: bipush 1
      // 0b0: istore 9
      // 0b2: iload 5
      // 0b4: ifne 0ce
      // 0b7: iinc 8 -1
      // 0ba: iload 5
      // 0bc: ifne 085
      // 0bf: goto 0c6
      // 0c2: invokestatic z2b.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: iinc 7 -1
      // 0c9: iload 5
      // 0cb: ifne 077
      // 0ce: iload 9
      // 0d0: iload 5
      // 0d2: ifeq 0e3
      // 0d5: ifne 231
      // 0d8: goto 0df
      // 0db: invokestatic z2b.a (Loov;)Loov;
      // 0de: athrow
      // 0df: bipush 0
      // 0e0: istore 8
      // 0e2: bipush 0
      // 0e3: istore 7
      // 0e5: new lkp
      // 0e8: dup
      // 0e9: bipush 1
      // 0ea: invokespecial lkp.<init> (Z)V
      // 0ed: astore 6
      // 0ef: iload 5
      // 0f1: ifne 231
      // 0f4: new d55
      // 0f7: dup
      // 0f8: bipush 1
      // 0f9: bipush 0
      // 0fa: invokespecial d55.<init> (ZZ)V
      // 0fd: astore 6
      // 0ff: iload 5
      // 101: ifne 231
      // 104: getstatic ox_.uom Le0x;
      // 107: invokevirtual e0x.l4i ()Lzfz;
      // 10a: getstatic qv5.yuo Lzb_;
      // 10d: getstatic x54$lti.jnw Lx54$lti;
      // 110: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 115: astore 10
      // 117: getstatic ox_.rwl L_cv;
      // 11a: invokevirtual _cv.l4i ()Lzfz;
      // 11d: getstatic uav.nps Lzb_;
      // 120: getstatic x54$lti.jnw Lx54$lti;
      // 123: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 128: getstatic _cv.sdu Lh76;
      // 12b: bipush 0
      // 12c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 12f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 134: astore 11
      // 136: bipush 0
      // 137: istore 7
      // 139: iload 7
      // 13b: bipush -1
      // 13c: if_icmplt 193
      // 13f: bipush 0
      // 140: iload 5
      // 142: ifeq 195
      // 145: istore 8
      // 147: iload 8
      // 149: bipush -1
      // 14a: if_icmplt 18b
      // 14d: aload 0
      // 14e: aload 1
      // 14f: aload 2
      // 150: iload 7
      // 152: iload 8
      // 154: getstatic x54$lti.jnw Lx54$lti;
      // 157: invokespecial z2b.mw1 (Lt9d;Lmew;IILx54$lti;)Z
      // 15a: iload 5
      // 15c: ifeq 13b
      // 15f: ifeq 17c
      // 162: new h9k
      // 165: dup
      // 166: bipush 1
      // 167: bipush 10
      // 169: bipush 20
      // 16b: aload 10
      // 16d: aload 11
      // 16f: invokespecial h9k.<init> (ZIILzfz;Lzfz;)V
      // 172: astore 6
      // 174: bipush 1
      // 175: istore 9
      // 177: iload 5
      // 179: ifne 193
      // 17c: iinc 8 -1
      // 17f: iload 5
      // 181: ifne 147
      // 184: goto 18b
      // 187: invokestatic z2b.a (Loov;)Loov;
      // 18a: athrow
      // 18b: iinc 7 -1
      // 18e: iload 5
      // 190: ifne 139
      // 193: iload 9
      // 195: iload 5
      // 197: ifeq 23b
      // 19a: ifne 231
      // 19d: goto 1a4
      // 1a0: invokestatic z2b.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: bipush 0
      // 1a5: istore 8
      // 1a7: bipush 0
      // 1a8: istore 7
      // 1aa: new ffn
      // 1ad: dup
      // 1ae: bipush 1
      // 1af: bipush 4
      // 1b0: aload 4
      // 1b2: bipush 7
      // 1b4: invokevirtual java/util/Random.nextInt (I)I
      // 1b7: iadd
      // 1b8: aload 10
      // 1ba: aload 11
      // 1bc: bipush 0
      // 1bd: invokespecial ffn.<init> (ZILzfz;Lzfz;Z)V
      // 1c0: astore 6
      // 1c2: iload 5
      // 1c4: ifne 231
      // 1c7: new h7i
      // 1ca: dup
      // 1cb: bipush 1
      // 1cc: invokespecial h7i.<init> (Z)V
      // 1cf: astore 6
      // 1d1: iload 5
      // 1d3: ifne 231
      // 1d6: bipush 0
      // 1d7: istore 7
      // 1d9: iload 7
      // 1db: bipush -1
      // 1dc: if_icmplt 22b
      // 1df: bipush 0
      // 1e0: iload 5
      // 1e2: ifeq 22d
      // 1e5: istore 8
      // 1e7: iload 8
      // 1e9: bipush -1
      // 1ea: if_icmplt 223
      // 1ed: aload 0
      // 1ee: aload 1
      // 1ef: aload 2
      // 1f0: iload 7
      // 1f2: iload 8
      // 1f4: getstatic x54$lti.jtj Lx54$lti;
      // 1f7: invokespecial z2b.mw1 (Lt9d;Lmew;IILx54$lti;)Z
      // 1fa: iload 5
      // 1fc: ifeq 1db
      // 1ff: ifeq 214
      // 202: new n0s
      // 205: dup
      // 206: bipush 1
      // 207: invokespecial n0s.<init> (Z)V
      // 20a: astore 6
      // 20c: bipush 1
      // 20d: istore 9
      // 20f: iload 5
      // 211: ifne 22b
      // 214: iinc 8 -1
      // 217: iload 5
      // 219: ifne 1e7
      // 21c: goto 223
      // 21f: invokestatic z2b.a (Loov;)Loov;
      // 222: athrow
      // 223: iinc 7 -1
      // 226: iload 5
      // 228: ifne 1d9
      // 22b: iload 9
      // 22d: ifne 231
      // 230: return
      // 231: getstatic ox_.ibw Le0x;
      // 234: invokevirtual e0x.l4i ()Lzfz;
      // 237: astore 10
      // 239: iload 9
      // 23b: iload 5
      // 23d: ifeq 2b1
      // 240: ifeq 2a2
      // 243: goto 24a
      // 246: invokestatic z2b.a (Loov;)Loov;
      // 249: athrow
      // 24a: aload 1
      // 24b: aload 2
      // 24c: iload 7
      // 24e: bipush 0
      // 24f: iload 8
      // 251: invokevirtual mew.ec4 (III)Lmew;
      // 254: aload 10
      // 256: bipush 4
      // 257: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 25a: pop
      // 25b: aload 1
      // 25c: aload 2
      // 25d: iload 7
      // 25f: bipush 1
      // 260: iadd
      // 261: bipush 0
      // 262: iload 8
      // 264: invokevirtual mew.ec4 (III)Lmew;
      // 267: aload 10
      // 269: bipush 4
      // 26a: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 26d: pop
      // 26e: aload 1
      // 26f: aload 2
      // 270: iload 7
      // 272: bipush 0
      // 273: iload 8
      // 275: bipush 1
      // 276: iadd
      // 277: invokevirtual mew.ec4 (III)Lmew;
      // 27a: aload 10
      // 27c: bipush 4
      // 27d: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 280: pop
      // 281: aload 1
      // 282: aload 2
      // 283: iload 7
      // 285: bipush 1
      // 286: iadd
      // 287: bipush 0
      // 288: iload 8
      // 28a: bipush 1
      // 28b: iadd
      // 28c: invokevirtual mew.ec4 (III)Lmew;
      // 28f: aload 10
      // 291: bipush 4
      // 292: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 295: pop
      // 296: iload 5
      // 298: ifne 2b2
      // 29b: goto 2a2
      // 29e: invokestatic z2b.a (Loov;)Loov;
      // 2a1: athrow
      // 2a2: aload 1
      // 2a3: aload 2
      // 2a4: aload 10
      // 2a6: bipush 4
      // 2a7: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 2aa: goto 2b1
      // 2ad: invokestatic z2b.a (Loov;)Loov;
      // 2b0: athrow
      // 2b1: pop
      // 2b2: aload 6
      // 2b4: aload 1
      // 2b5: aload 4
      // 2b7: aload 2
      // 2b8: iload 7
      // 2ba: bipush 0
      // 2bb: iload 8
      // 2bd: invokevirtual mew.ec4 (III)Lmew;
      // 2c0: invokevirtual cdu.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 2c3: iload 5
      // 2c5: ifeq 2d4
      // 2c8: ifne 346
      // 2cb: goto 2d2
      // 2ce: invokestatic z2b.a (Loov;)Loov;
      // 2d1: athrow
      // 2d2: iload 9
      // 2d4: iload 5
      // 2d6: ifeq 345
      // 2d9: ifeq 337
      // 2dc: goto 2e3
      // 2df: invokestatic z2b.a (Loov;)Loov;
      // 2e2: athrow
      // 2e3: aload 1
      // 2e4: aload 2
      // 2e5: iload 7
      // 2e7: bipush 0
      // 2e8: iload 8
      // 2ea: invokevirtual mew.ec4 (III)Lmew;
      // 2ed: aload 3
      // 2ee: bipush 4
      // 2ef: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 2f2: pop
      // 2f3: aload 1
      // 2f4: aload 2
      // 2f5: iload 7
      // 2f7: bipush 1
      // 2f8: iadd
      // 2f9: bipush 0
      // 2fa: iload 8
      // 2fc: invokevirtual mew.ec4 (III)Lmew;
      // 2ff: aload 3
      // 300: bipush 4
      // 301: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 304: pop
      // 305: aload 1
      // 306: aload 2
      // 307: iload 7
      // 309: bipush 0
      // 30a: iload 8
      // 30c: bipush 1
      // 30d: iadd
      // 30e: invokevirtual mew.ec4 (III)Lmew;
      // 311: aload 3
      // 312: bipush 4
      // 313: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 316: pop
      // 317: aload 1
      // 318: aload 2
      // 319: iload 7
      // 31b: bipush 1
      // 31c: iadd
      // 31d: bipush 0
      // 31e: iload 8
      // 320: bipush 1
      // 321: iadd
      // 322: invokevirtual mew.ec4 (III)Lmew;
      // 325: aload 3
      // 326: bipush 4
      // 327: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 32a: pop
      // 32b: iload 5
      // 32d: ifne 346
      // 330: goto 337
      // 333: invokestatic z2b.a (Loov;)Loov;
      // 336: athrow
      // 337: aload 1
      // 338: aload 2
      // 339: aload 3
      // 33a: bipush 4
      // 33b: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 33e: goto 345
      // 341: invokestatic z2b.a (Loov;)Loov;
      // 344: athrow
      // 345: pop
      // 346: return
   }

   private boolean mw1(t9d param1, mew param2, int param3, int param4, x54$lti param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: iload 3
      // 09: bipush 0
      // 0a: iload 4
      // 0c: invokevirtual mew.ec4 (III)Lmew;
      // 0f: aload 5
      // 11: invokevirtual z2b.gmr (Lt9d;Lmew;Lx54$lti;)Z
      // 14: iload 6
      // 16: ifeq 3b
      // 19: ifeq 9e
      // 1c: goto 23
      // 1f: invokestatic z2b.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: aload 1
      // 25: aload 2
      // 26: iload 3
      // 27: bipush 1
      // 28: iadd
      // 29: bipush 0
      // 2a: iload 4
      // 2c: invokevirtual mew.ec4 (III)Lmew;
      // 2f: aload 5
      // 31: invokevirtual z2b.gmr (Lt9d;Lmew;Lx54$lti;)Z
      // 34: goto 3b
      // 37: invokestatic z2b.a (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 6
      // 3d: ifeq 62
      // 40: ifeq 9e
      // 43: goto 4a
      // 46: invokestatic z2b.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 1
      // 4c: aload 2
      // 4d: iload 3
      // 4e: bipush 0
      // 4f: iload 4
      // 51: bipush 1
      // 52: iadd
      // 53: invokevirtual mew.ec4 (III)Lmew;
      // 56: aload 5
      // 58: invokevirtual z2b.gmr (Lt9d;Lmew;Lx54$lti;)Z
      // 5b: goto 62
      // 5e: invokestatic z2b.a (Loov;)Loov;
      // 61: athrow
      // 62: iload 6
      // 64: ifeq 8b
      // 67: ifeq 9e
      // 6a: goto 71
      // 6d: invokestatic z2b.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: aload 1
      // 73: aload 2
      // 74: iload 3
      // 75: bipush 1
      // 76: iadd
      // 77: bipush 0
      // 78: iload 4
      // 7a: bipush 1
      // 7b: iadd
      // 7c: invokevirtual mew.ec4 (III)Lmew;
      // 7f: aload 5
      // 81: invokevirtual z2b.gmr (Lt9d;Lmew;Lx54$lti;)Z
      // 84: goto 8b
      // 87: invokestatic z2b.a (Loov;)Loov;
      // 8a: athrow
      // 8b: iload 6
      // 8d: ifeq 9b
      // 90: ifeq 9e
      // 93: goto 9a
      // 96: invokestatic z2b.a (Loov;)Loov;
      // 99: athrow
      // 9a: bipush 1
      // 9b: goto 9f
      // 9e: bipush 0
      // 9f: ireturn
   }

   public boolean gmr(t9d param1, mew param2, x54$lti param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0a: astore 5
      // 0c: aload 5
      // 0e: iload 4
      // 10: ifne 2c
      // 13: invokeinterface zfz.r_y ()Le0x; 1
      // 18: aload 0
      // 19: if_acmpne 40
      // 1c: goto 23
      // 1f: invokestatic z2b.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 5
      // 25: goto 2c
      // 28: invokestatic z2b.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic z2b.ehq Lzb_;
      // 2f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 34: aload 3
      // 35: if_acmpne 40
      // 38: bipush 1
      // 39: goto 41
      // 3c: invokestatic z2b.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 0
      // 41: ireturn
   }

   @Override
   public int crg(zfz var1) {
      return ((x54$lti)var1.dil(ehq)).h8z();
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      x54$lti[] var5 = x54$lti.values();
      int var6 = var5.length;
      int var10000 = t9d.b();
      int var7 = 0;
      int var4 = var10000;

      while (var7 < var6) {
         x54$lti var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.h8z()));
         var7++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public boolean z3t(t9d var1, mew var2, zfz var3, boolean var4) {
      return true;
   }

   @Override
   public boolean y4n(t9d var1, Random var2, mew var3, zfz var4) {
      int var5 = t9d.b();

      try {
         double var7;
         int var10000 = (var7 = (double)var1.fsy.nextFloat() - 0.45) == 0.0 ? 0 : (var7 < 0.0 ? -1 : 1);
         if (var5 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return (boolean)0;
   }

   @Override
   public void tu1(t9d var1, Random var2, mew var3, zfz var4) {
      this._fr(var1, var3, var4, var2);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(ehq, x54$lti.mhp(var1 & 7)).zvi(cjq, (var1 & 8) >> 3);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = 0;
      var2 |= ((x54$lti)var1.dil(ehq)).h8z();
      return var2 | (Integer)var1.dil(cjq) << 3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{ehq, cjq});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1991110553865228936L, -1906074984660153803L, MethodHandles.lookup().lookupClass()).a(273717193025736L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 120504782417401L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u0005<¢lAÕº\u008a\u0093§?;\u008b\f\tÝ\u0010x(/\u0004\u0091í+\u001b\u007f\u0091÷Q1ÇºS\u0010KIå\tÌd\u0006ð\u001cúk^\u0093qëv";
      int var6 = "\u0005<¢lAÕº\u008a\u0093§?;\u008b\f\tÝ\u0010x(/\u0004\u0091í+\u001b\u007f\u0091÷Q1ÇºS\u0010KIå\tÌd\u0006ð\u001cúk^\u0093qëv".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            ehq = zb_.pq4(b<"v">(5425, 5024539086010161131L ^ var9), x54$lti.class);
            cjq = _ku.wgl(b<"v">(31285, 846101703853078765L ^ var9), 0, 1);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1181;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("z2b", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("z2b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
