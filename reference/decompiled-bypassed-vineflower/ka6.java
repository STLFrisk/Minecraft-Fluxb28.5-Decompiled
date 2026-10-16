import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ka6 {
   private static final Logger aq3;
   public i2h ca2;
   public int k42;
   public int y55;
   public int jq7;
   public int ggp;
   public int kwf;
   public int ots;
   public int noh;
   public int sok;
   public double n2r;
   public double wov;
   public double ye2;
   public int qf6;
   private double mfl;
   private double zu8;
   private double npm;
   private boolean bse;
   private boolean fd_;
   private int q9d;
   private i2h kcf;
   private boolean bwd;
   private boolean p8l;
   public boolean tdl;
   public Set imu = Sets.newHashSet();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ka6(i2h var1, int var2, int var3, boolean var4) {
      this.ca2 = var1;
      this.k42 = var2;
      this.y55 = var3;
      this.fd_ = var4;
      this.jq7 = fe6.jqf(var1.o2v * 32.0);
      this.ggp = fe6.jqf(var1.kfp * 32.0);
      this.kwf = fe6.jqf(var1.vbd * 32.0);
      this.ots = fe6.tpk(var1.x5k * 256.0F / 360.0F);
      this.noh = fe6.tpk(var1.y2i * 256.0F / 360.0F);
      this.sok = fe6.tpk(var1.t9t() * 256.0F / 360.0F);
      this.p8l = var1.lfk;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof ka6
      // 08: iload 2
      // 09: ifeq 27
      // 0c: ifeq 48
      // 0f: goto 16
      // 12: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast ka6
      // 1a: getfield ka6.ca2 Li2h;
      // 1d: invokevirtual i2h.jwu ()I
      // 20: goto 27
      // 23: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26: athrow
      // 27: iload 2
      // 28: ifeq 45
      // 2b: aload 0
      // 2c: getfield ka6.ca2 Li2h;
      // 2f: invokevirtual i2h.jwu ()I
      // 32: if_icmpne 44
      // 35: goto 3c
      // 38: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 49
      // 40: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43: athrow
      // 44: bipush 0
      // 45: goto 49
      // 48: bipush 0
      // 49: ireturn
   }

   @Override
   public int hashCode() {
      return this.ca2.jwu();
   }

   public void ujs(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: bipush 0
      // 006: putfield ka6.tdl Z
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifeq 07a
      // 00e: getfield ka6.bse Z
      // 011: ifeq 047
      // 014: goto 01b
      // 017: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield ka6.ca2 Li2h;
      // 01f: aload 0
      // 020: iload 2
      // 021: ifeq 08e
      // 024: goto 02b
      // 027: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 02a: athrow
      // 02b: getfield ka6.mfl D
      // 02e: aload 0
      // 02f: getfield ka6.zu8 D
      // 032: aload 0
      // 033: getfield ka6.npm D
      // 036: invokevirtual i2h.p53 (DDD)D
      // 039: ldc2_w 16.0
      // 03c: dcmpl
      // 03d: ifle 07e
      // 040: goto 047
      // 043: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 046: athrow
      // 047: aload 0
      // 048: aload 0
      // 049: getfield ka6.ca2 Li2h;
      // 04c: getfield i2h.o2v D
      // 04f: putfield ka6.mfl D
      // 052: aload 0
      // 053: aload 0
      // 054: getfield ka6.ca2 Li2h;
      // 057: getfield i2h.kfp D
      // 05a: putfield ka6.zu8 D
      // 05d: aload 0
      // 05e: aload 0
      // 05f: getfield ka6.ca2 Li2h;
      // 062: getfield i2h.vbd D
      // 065: putfield ka6.npm D
      // 068: aload 0
      // 069: bipush 1
      // 06a: putfield ka6.bse Z
      // 06d: aload 0
      // 06e: bipush 1
      // 06f: putfield ka6.tdl Z
      // 072: aload 0
      // 073: goto 07a
      // 076: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 079: athrow
      // 07a: aload 1
      // 07b: invokevirtual ka6.k46 (Ljava/util/List;)V
      // 07e: aload 0
      // 07f: iload 2
      // 080: ifeq 0e2
      // 083: getfield ka6.kcf Li2h;
      // 086: aload 0
      // 087: goto 08e
      // 08a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08d: athrow
      // 08e: getfield ka6.ca2 Li2h;
      // 091: getfield i2h.hzp Li2h;
      // 094: if_acmpne 0cf
      // 097: aload 0
      // 098: getfield ka6.ca2 Li2h;
      // 09b: getfield i2h.hzp Li2h;
      // 09e: iload 2
      // 09f: ifeq 0fc
      // 0a2: goto 0a9
      // 0a5: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a8: athrow
      // 0a9: ifnull 0f8
      // 0ac: goto 0b3
      // 0af: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield ka6.qf6 I
      // 0b7: bipush 60
      // 0b9: irem
      // 0ba: iload 2
      // 0bb: ifeq 0ff
      // 0be: goto 0c5
      // 0c1: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c4: athrow
      // 0c5: ifne 0f8
      // 0c8: goto 0cf
      // 0cb: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: aload 0
      // 0d1: getfield ka6.ca2 Li2h;
      // 0d4: getfield i2h.hzp Li2h;
      // 0d7: putfield ka6.kcf Li2h;
      // 0da: aload 0
      // 0db: goto 0e2
      // 0de: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e1: athrow
      // 0e2: new net/minecraft/network/play/server/S1BPacketEntityAttach
      // 0e5: dup
      // 0e6: bipush 0
      // 0e7: aload 0
      // 0e8: getfield ka6.ca2 Li2h;
      // 0eb: aload 0
      // 0ec: getfield ka6.ca2 Li2h;
      // 0ef: getfield i2h.hzp Li2h;
      // 0f2: invokespecial net/minecraft/network/play/server/S1BPacketEntityAttach.<init> (ILi2h;Li2h;)V
      // 0f5: invokevirtual ka6.geq (Lmz2;)V
      // 0f8: aload 0
      // 0f9: getfield ka6.ca2 Li2h;
      // 0fc: instanceof co7
      // 0ff: iload 2
      // 100: ifeq 1e1
      // 103: ifeq 1cd
      // 106: goto 10d
      // 109: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10c: athrow
      // 10d: aload 0
      // 10e: getfield ka6.qf6 I
      // 111: bipush 10
      // 113: irem
      // 114: iload 2
      // 115: ifeq 1e1
      // 118: goto 11f
      // 11b: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11e: athrow
      // 11f: ifne 1cd
      // 122: goto 129
      // 125: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield ka6.ca2 Li2h;
      // 12d: checkcast co7
      // 130: astore 3
      // 131: aload 3
      // 132: invokevirtual co7.t9o ()Lerg;
      // 135: astore 4
      // 137: aload 4
      // 139: iload 2
      // 13a: ifeq 149
      // 13d: ifnull 1c9
      // 140: goto 147
      // 143: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 146: athrow
      // 147: aload 4
      // 149: invokevirtual erg.gn1 ()Lu7m;
      // 14c: instanceof f58
      // 14f: ifeq 1c9
      // 152: getstatic xbr.kdv Lf58;
      // 155: aload 4
      // 157: aload 0
      // 158: getfield ka6.ca2 Li2h;
      // 15b: getfield i2h.oay Lt9d;
      // 15e: invokevirtual f58.h9y (Lerg;Lt9d;)Lucr;
      // 161: astore 5
      // 163: aload 1
      // 164: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 169: astore 6
      // 16b: aload 6
      // 16d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 172: ifeq 1c9
      // 175: aload 6
      // 177: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 17c: checkcast ha9
      // 17f: astore 7
      // 181: aload 7
      // 183: checkcast z96
      // 186: astore 8
      // 188: aload 5
      // 18a: aload 8
      // 18c: aload 4
      // 18e: invokevirtual ucr.obe (Lha9;Lerg;)V
      // 191: getstatic xbr.kdv Lf58;
      // 194: aload 4
      // 196: aload 0
      // 197: getfield ka6.ca2 Li2h;
      // 19a: getfield i2h.oay Lt9d;
      // 19d: aload 8
      // 19f: invokevirtual f58.bdn (Lerg;Lt9d;Lha9;)Lmz2;
      // 1a2: astore 9
      // 1a4: iload 2
      // 1a5: ifeq 1cd
      // 1a8: aload 9
      // 1aa: ifnull 1c5
      // 1ad: goto 1b4
      // 1b0: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b3: athrow
      // 1b4: aload 8
      // 1b6: getfield z96.rhh Lmlk;
      // 1b9: aload 9
      // 1bb: invokevirtual mlk.vnf (Lmz2;)V
      // 1be: goto 1c5
      // 1c1: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c4: athrow
      // 1c5: iload 2
      // 1c6: ifne 16b
      // 1c9: aload 0
      // 1ca: invokespecial ka6.nep ()V
      // 1cd: aload 0
      // 1ce: iload 2
      // 1cf: ifeq 220
      // 1d2: getfield ka6.qf6 I
      // 1d5: aload 0
      // 1d6: getfield ka6.y55 I
      // 1d9: irem
      // 1da: goto 1e1
      // 1dd: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e0: athrow
      // 1e1: ifeq 21f
      // 1e4: aload 0
      // 1e5: getfield ka6.ca2 Li2h;
      // 1e8: iload 2
      // 1e9: ifeq 226
      // 1ec: goto 1f3
      // 1ef: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f2: athrow
      // 1f3: getfield i2h.u19 Z
      // 1f6: ifne 21f
      // 1f9: goto 200
      // 1fc: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ff: athrow
      // 200: aload 0
      // 201: getfield ka6.ca2 Li2h;
      // 204: invokevirtual i2h.a0c ()Lwl1;
      // 207: invokevirtual wl1.jmu ()Z
      // 20a: iload 2
      // 20b: ifeq 859
      // 20e: goto 215
      // 211: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 214: athrow
      // 215: ifeq 83d
      // 218: goto 21f
      // 21b: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21e: athrow
      // 21f: aload 0
      // 220: getfield ka6.ca2 Li2h;
      // 223: getfield i2h.hzp Li2h;
      // 226: iload 2
      // 227: ifeq 70c
      // 22a: ifnonnull 701
      // 22d: goto 234
      // 230: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 233: athrow
      // 234: aload 0
      // 235: dup
      // 236: getfield ka6.q9d I
      // 239: bipush 1
      // 23a: iadd
      // 23b: putfield ka6.q9d I
      // 23e: aload 0
      // 23f: getfield ka6.ca2 Li2h;
      // 242: getfield i2h.o2v D
      // 245: ldc2_w 32.0
      // 248: dmul
      // 249: invokestatic fe6.jqf (D)I
      // 24c: istore 3
      // 24d: aload 0
      // 24e: getfield ka6.ca2 Li2h;
      // 251: getfield i2h.kfp D
      // 254: ldc2_w 32.0
      // 257: dmul
      // 258: invokestatic fe6.jqf (D)I
      // 25b: istore 4
      // 25d: aload 0
      // 25e: getfield ka6.ca2 Li2h;
      // 261: getfield i2h.vbd D
      // 264: ldc2_w 32.0
      // 267: dmul
      // 268: invokestatic fe6.jqf (D)I
      // 26b: istore 5
      // 26d: aload 0
      // 26e: getfield ka6.ca2 Li2h;
      // 271: getfield i2h.x5k F
      // 274: ldc 256.0
      // 276: nop
      // 277: fmul
      // 278: ldc 360.0
      // 27a: nop
      // 27b: fdiv
      // 27c: invokestatic fe6.tpk (F)I
      // 27f: istore 6
      // 281: aload 0
      // 282: getfield ka6.ca2 Li2h;
      // 285: getfield i2h.y2i F
      // 288: ldc 256.0
      // 28a: nop
      // 28b: fmul
      // 28c: ldc 360.0
      // 28e: nop
      // 28f: fdiv
      // 290: invokestatic fe6.tpk (F)I
      // 293: istore 7
      // 295: iload 3
      // 296: aload 0
      // 297: getfield ka6.jq7 I
      // 29a: isub
      // 29b: istore 8
      // 29d: iload 4
      // 29f: aload 0
      // 2a0: getfield ka6.ggp I
      // 2a3: isub
      // 2a4: istore 9
      // 2a6: iload 5
      // 2a8: aload 0
      // 2a9: getfield ka6.kwf I
      // 2ac: isub
      // 2ad: istore 10
      // 2af: aconst_null
      // 2b0: astore 11
      // 2b2: iload 8
      // 2b4: invokestatic java/lang/Math.abs (I)I
      // 2b7: iload 2
      // 2b8: ifeq 319
      // 2bb: bipush 4
      // 2bc: if_icmpge 318
      // 2bf: goto 2c6
      // 2c2: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c5: athrow
      // 2c6: iload 9
      // 2c8: invokestatic java/lang/Math.abs (I)I
      // 2cb: iload 2
      // 2cc: ifeq 319
      // 2cf: goto 2d6
      // 2d2: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d5: athrow
      // 2d6: bipush 4
      // 2d7: if_icmpge 318
      // 2da: goto 2e1
      // 2dd: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e0: athrow
      // 2e1: iload 10
      // 2e3: invokestatic java/lang/Math.abs (I)I
      // 2e6: iload 2
      // 2e7: ifeq 319
      // 2ea: goto 2f1
      // 2ed: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f0: athrow
      // 2f1: bipush 4
      // 2f2: if_icmpge 318
      // 2f5: goto 2fc
      // 2f8: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2fb: athrow
      // 2fc: aload 0
      // 2fd: getfield ka6.qf6 I
      // 300: bipush 60
      // 302: irem
      // 303: iload 2
      // 304: ifeq 319
      // 307: goto 30e
      // 30a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 30d: athrow
      // 30e: ifne 31c
      // 311: goto 318
      // 314: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 317: athrow
      // 318: bipush 1
      // 319: goto 31d
      // 31c: bipush 0
      // 31d: istore 12
      // 31f: iload 6
      // 321: aload 0
      // 322: getfield ka6.ots I
      // 325: isub
      // 326: invokestatic java/lang/Math.abs (I)I
      // 329: iload 2
      // 32a: ifeq 360
      // 32d: bipush 4
      // 32e: if_icmpge 358
      // 331: goto 338
      // 334: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 337: athrow
      // 338: iload 7
      // 33a: aload 0
      // 33b: getfield ka6.noh I
      // 33e: isub
      // 33f: invokestatic java/lang/Math.abs (I)I
      // 342: iload 2
      // 343: ifeq 360
      // 346: goto 34d
      // 349: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34c: athrow
      // 34d: bipush 4
      // 34e: if_icmplt 363
      // 351: goto 358
      // 354: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 357: athrow
      // 358: bipush 1
      // 359: goto 360
      // 35c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35f: athrow
      // 360: goto 364
      // 363: bipush 0
      // 364: istore 13
      // 366: aload 0
      // 367: getfield ka6.qf6 I
      // 36a: iload 2
      // 36b: ifeq 396
      // 36e: ifgt 394
      // 371: goto 378
      // 374: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 377: athrow
      // 378: aload 0
      // 379: getfield ka6.ca2 Li2h;
      // 37c: instanceof hy9
      // 37f: iload 2
      // 380: ifeq 396
      // 383: goto 38a
      // 386: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 389: athrow
      // 38a: ifeq 578
      // 38d: goto 394
      // 390: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 393: athrow
      // 394: iload 8
      // 396: bipush -128
      // 398: iload 2
      // 399: ifeq 3b2
      // 39c: if_icmplt 546
      // 39f: goto 3a6
      // 3a2: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a5: athrow
      // 3a6: iload 8
      // 3a8: sipush 128
      // 3ab: goto 3b2
      // 3ae: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b1: athrow
      // 3b2: iload 2
      // 3b3: ifeq 3cb
      // 3b6: if_icmpge 546
      // 3b9: goto 3c0
      // 3bc: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3bf: athrow
      // 3c0: iload 9
      // 3c2: bipush -128
      // 3c4: goto 3cb
      // 3c7: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ca: athrow
      // 3cb: iload 2
      // 3cc: ifeq 3e5
      // 3cf: if_icmplt 546
      // 3d2: goto 3d9
      // 3d5: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3d8: athrow
      // 3d9: iload 9
      // 3db: sipush 128
      // 3de: goto 3e5
      // 3e1: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e4: athrow
      // 3e5: iload 2
      // 3e6: ifeq 3fe
      // 3e9: if_icmpge 546
      // 3ec: goto 3f3
      // 3ef: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f2: athrow
      // 3f3: iload 10
      // 3f5: bipush -128
      // 3f7: goto 3fe
      // 3fa: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3fd: athrow
      // 3fe: iload 2
      // 3ff: ifeq 418
      // 402: if_icmplt 546
      // 405: goto 40c
      // 408: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 40b: athrow
      // 40c: iload 10
      // 40e: sipush 128
      // 411: goto 418
      // 414: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 417: athrow
      // 418: iload 2
      // 419: ifeq 43f
      // 41c: if_icmpge 546
      // 41f: goto 426
      // 422: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 425: athrow
      // 426: aload 0
      // 427: iload 2
      // 428: ifeq 552
      // 42b: goto 432
      // 42e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 431: athrow
      // 432: getfield ka6.q9d I
      // 435: sipush 400
      // 438: goto 43f
      // 43b: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43e: athrow
      // 43f: if_icmpgt 546
      // 442: aload 0
      // 443: iload 2
      // 444: ifeq 552
      // 447: goto 44e
      // 44a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44d: athrow
      // 44e: getfield ka6.bwd Z
      // 451: ifne 546
      // 454: goto 45b
      // 457: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 45a: athrow
      // 45b: aload 0
      // 45c: iload 2
      // 45d: ifeq 552
      // 460: goto 467
      // 463: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 466: athrow
      // 467: getfield ka6.p8l Z
      // 46a: aload 0
      // 46b: getfield ka6.ca2 Li2h;
      // 46e: getfield i2h.lfk Z
      // 471: if_icmpne 546
      // 474: goto 47b
      // 477: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47a: athrow
      // 47b: iload 12
      // 47d: iload 2
      // 47e: ifeq 4b7
      // 481: goto 488
      // 484: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 487: athrow
      // 488: ifeq 4a9
      // 48b: goto 492
      // 48e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 491: athrow
      // 492: iload 13
      // 494: iload 2
      // 495: ifeq 4b7
      // 498: goto 49f
      // 49b: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49e: athrow
      // 49f: ifne 51d
      // 4a2: goto 4a9
      // 4a5: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a8: athrow
      // 4a9: aload 0
      // 4aa: getfield ka6.ca2 Li2h;
      // 4ad: instanceof hy9
      // 4b0: goto 4b7
      // 4b3: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4b6: athrow
      // 4b7: iload 2
      // 4b8: ifeq 4c7
      // 4bb: ifne 51d
      // 4be: goto 4c5
      // 4c1: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c4: athrow
      // 4c5: iload 12
      // 4c7: iload 2
      // 4c8: ifeq 4fa
      // 4cb: ifeq 4f8
      // 4ce: goto 4d5
      // 4d1: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d4: athrow
      // 4d5: new net/minecraft/network/play/server/S14PacketEntity$S15PacketEntityRelMove
      // 4d8: dup
      // 4d9: aload 0
      // 4da: getfield ka6.ca2 Li2h;
      // 4dd: invokevirtual i2h.jwu ()I
      // 4e0: iload 8
      // 4e2: i2b
      // 4e3: iload 9
      // 4e5: i2b
      // 4e6: iload 10
      // 4e8: i2b
      // 4e9: aload 0
      // 4ea: getfield ka6.ca2 Li2h;
      // 4ed: getfield i2h.lfk Z
      // 4f0: invokespecial net/minecraft/network/play/server/S14PacketEntity$S15PacketEntityRelMove.<init> (IBBBZ)V
      // 4f3: astore 11
      // 4f5: goto 578
      // 4f8: iload 13
      // 4fa: ifeq 578
      // 4fd: new net/minecraft/network/play/server/S14PacketEntity$S16PacketEntityLook
      // 500: dup
      // 501: aload 0
      // 502: getfield ka6.ca2 Li2h;
      // 505: invokevirtual i2h.jwu ()I
      // 508: iload 6
      // 50a: i2b
      // 50b: iload 7
      // 50d: i2b
      // 50e: aload 0
      // 50f: getfield ka6.ca2 Li2h;
      // 512: getfield i2h.lfk Z
      // 515: invokespecial net/minecraft/network/play/server/S14PacketEntity$S16PacketEntityLook.<init> (IBBZ)V
      // 518: astore 11
      // 51a: goto 578
      // 51d: new net/minecraft/network/play/server/S14PacketEntity$S17PacketEntityLookMove
      // 520: dup
      // 521: aload 0
      // 522: getfield ka6.ca2 Li2h;
      // 525: invokevirtual i2h.jwu ()I
      // 528: iload 8
      // 52a: i2b
      // 52b: iload 9
      // 52d: i2b
      // 52e: iload 10
      // 530: i2b
      // 531: iload 6
      // 533: i2b
      // 534: iload 7
      // 536: i2b
      // 537: aload 0
      // 538: getfield ka6.ca2 Li2h;
      // 53b: getfield i2h.lfk Z
      // 53e: invokespecial net/minecraft/network/play/server/S14PacketEntity$S17PacketEntityLookMove.<init> (IBBBBBZ)V
      // 541: astore 11
      // 543: goto 578
      // 546: aload 0
      // 547: aload 0
      // 548: getfield ka6.ca2 Li2h;
      // 54b: getfield i2h.lfk Z
      // 54e: putfield ka6.p8l Z
      // 551: aload 0
      // 552: bipush 0
      // 553: putfield ka6.q9d I
      // 556: new net/minecraft/network/play/server/S18PacketEntityTeleport
      // 559: dup
      // 55a: aload 0
      // 55b: getfield ka6.ca2 Li2h;
      // 55e: invokevirtual i2h.jwu ()I
      // 561: iload 3
      // 562: iload 4
      // 564: iload 5
      // 566: iload 6
      // 568: i2b
      // 569: iload 7
      // 56b: i2b
      // 56c: aload 0
      // 56d: getfield ka6.ca2 Li2h;
      // 570: getfield i2h.lfk Z
      // 573: invokespecial net/minecraft/network/play/server/S18PacketEntityTeleport.<init> (IIIIBBZ)V
      // 576: astore 11
      // 578: aload 0
      // 579: iload 2
      // 57a: ifeq 592
      // 57d: getfield ka6.fd_ Z
      // 580: ifeq 6a2
      // 583: goto 58a
      // 586: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 589: athrow
      // 58a: aload 0
      // 58b: goto 592
      // 58e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 591: athrow
      // 592: getfield ka6.ca2 Li2h;
      // 595: getfield i2h.icv D
      // 598: aload 0
      // 599: getfield ka6.n2r D
      // 59c: dsub
      // 59d: dstore 14
      // 59f: aload 0
      // 5a0: getfield ka6.ca2 Li2h;
      // 5a3: getfield i2h.mop D
      // 5a6: aload 0
      // 5a7: getfield ka6.wov D
      // 5aa: dsub
      // 5ab: dstore 16
      // 5ad: aload 0
      // 5ae: getfield ka6.ca2 Li2h;
      // 5b1: getfield i2h.bw4 D
      // 5b4: aload 0
      // 5b5: getfield ka6.ye2 D
      // 5b8: dsub
      // 5b9: dstore 18
      // 5bb: ldc2_w 0.02
      // 5be: dstore 20
      // 5c0: dload 14
      // 5c2: dload 14
      // 5c4: dmul
      // 5c5: dload 16
      // 5c7: dload 16
      // 5c9: dmul
      // 5ca: dadd
      // 5cb: dload 18
      // 5cd: dload 18
      // 5cf: dmul
      // 5d0: dadd
      // 5d1: dstore 22
      // 5d3: iload 2
      // 5d4: ifeq 684
      // 5d7: dload 22
      // 5d9: dload 20
      // 5db: dload 20
      // 5dd: dmul
      // 5de: dcmpl
      // 5df: ifgt 65c
      // 5e2: goto 5e9
      // 5e5: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5e8: athrow
      // 5e9: dload 22
      // 5eb: dconst_0
      // 5ec: dcmpl
      // 5ed: iload 2
      // 5ee: ifeq 612
      // 5f1: goto 5f8
      // 5f4: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f7: athrow
      // 5f8: ifle 6a2
      // 5fb: goto 602
      // 5fe: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 601: athrow
      // 602: aload 0
      // 603: getfield ka6.ca2 Li2h;
      // 606: getfield i2h.icv D
      // 609: dconst_0
      // 60a: dcmpl
      // 60b: goto 612
      // 60e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 611: athrow
      // 612: iload 2
      // 613: ifeq 630
      // 616: ifne 6a2
      // 619: goto 620
      // 61c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 61f: athrow
      // 620: aload 0
      // 621: getfield ka6.ca2 Li2h;
      // 624: getfield i2h.mop D
      // 627: dconst_0
      // 628: dcmpl
      // 629: goto 630
      // 62c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62f: athrow
      // 630: iload 2
      // 631: ifeq 659
      // 634: ifne 6a2
      // 637: goto 63e
      // 63a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 63d: athrow
      // 63e: aload 0
      // 63f: iload 2
      // 640: ifeq 685
      // 643: goto 64a
      // 646: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 649: athrow
      // 64a: getfield ka6.ca2 Li2h;
      // 64d: getfield i2h.bw4 D
      // 650: dconst_0
      // 651: dcmpl
      // 652: goto 659
      // 655: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 658: athrow
      // 659: ifne 6a2
      // 65c: aload 0
      // 65d: aload 0
      // 65e: getfield ka6.ca2 Li2h;
      // 661: getfield i2h.icv D
      // 664: putfield ka6.n2r D
      // 667: aload 0
      // 668: aload 0
      // 669: getfield ka6.ca2 Li2h;
      // 66c: getfield i2h.mop D
      // 66f: putfield ka6.wov D
      // 672: aload 0
      // 673: aload 0
      // 674: getfield ka6.ca2 Li2h;
      // 677: getfield i2h.bw4 D
      // 67a: putfield ka6.ye2 D
      // 67d: goto 684
      // 680: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 683: athrow
      // 684: aload 0
      // 685: new net/minecraft/network/play/server/S12PacketEntityVelocity
      // 688: dup
      // 689: aload 0
      // 68a: getfield ka6.ca2 Li2h;
      // 68d: invokevirtual i2h.jwu ()I
      // 690: aload 0
      // 691: getfield ka6.n2r D
      // 694: aload 0
      // 695: getfield ka6.wov D
      // 698: aload 0
      // 699: getfield ka6.ye2 D
      // 69c: invokespecial net/minecraft/network/play/server/S12PacketEntityVelocity.<init> (IDDD)V
      // 69f: invokevirtual ka6.geq (Lmz2;)V
      // 6a2: aload 11
      // 6a4: ifnull 6b4
      // 6a7: aload 0
      // 6a8: aload 11
      // 6aa: invokevirtual ka6.geq (Lmz2;)V
      // 6ad: goto 6b4
      // 6b0: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b3: athrow
      // 6b4: aload 0
      // 6b5: invokespecial ka6.nep ()V
      // 6b8: iload 12
      // 6ba: iload 2
      // 6bb: ifeq 6e2
      // 6be: ifeq 6e0
      // 6c1: goto 6c8
      // 6c4: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c7: athrow
      // 6c8: aload 0
      // 6c9: iload 3
      // 6ca: putfield ka6.jq7 I
      // 6cd: aload 0
      // 6ce: iload 4
      // 6d0: putfield ka6.ggp I
      // 6d3: aload 0
      // 6d4: iload 5
      // 6d6: putfield ka6.kwf I
      // 6d9: goto 6e0
      // 6dc: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6df: athrow
      // 6e0: iload 13
      // 6e2: ifeq 6f8
      // 6e5: aload 0
      // 6e6: iload 6
      // 6e8: putfield ka6.ots I
      // 6eb: aload 0
      // 6ec: iload 7
      // 6ee: putfield ka6.noh I
      // 6f1: goto 6f8
      // 6f4: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f7: athrow
      // 6f8: aload 0
      // 6f9: bipush 0
      // 6fa: putfield ka6.bwd Z
      // 6fd: iload 2
      // 6fe: ifne 7f4
      // 701: aload 0
      // 702: getfield ka6.ca2 Li2h;
      // 705: goto 70c
      // 708: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 70b: athrow
      // 70c: getfield i2h.x5k F
      // 70f: ldc 256.0
      // 711: nop
      // 712: fmul
      // 713: ldc 360.0
      // 715: nop
      // 716: fdiv
      // 717: invokestatic fe6.tpk (F)I
      // 71a: istore 3
      // 71b: aload 0
      // 71c: getfield ka6.ca2 Li2h;
      // 71f: getfield i2h.y2i F
      // 722: ldc 256.0
      // 724: nop
      // 725: fmul
      // 726: ldc 360.0
      // 728: nop
      // 729: fdiv
      // 72a: invokestatic fe6.tpk (F)I
      // 72d: istore 4
      // 72f: iload 3
      // 730: aload 0
      // 731: getfield ka6.ots I
      // 734: isub
      // 735: invokestatic java/lang/Math.abs (I)I
      // 738: iload 2
      // 739: ifeq 76f
      // 73c: bipush 4
      // 73d: if_icmpge 767
      // 740: goto 747
      // 743: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 746: athrow
      // 747: iload 4
      // 749: aload 0
      // 74a: getfield ka6.noh I
      // 74d: isub
      // 74e: invokestatic java/lang/Math.abs (I)I
      // 751: iload 2
      // 752: ifeq 76f
      // 755: goto 75c
      // 758: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 75b: athrow
      // 75c: bipush 4
      // 75d: if_icmplt 772
      // 760: goto 767
      // 763: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 766: athrow
      // 767: bipush 1
      // 768: goto 76f
      // 76b: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 76e: athrow
      // 76f: goto 773
      // 772: bipush 0
      // 773: istore 5
      // 775: iload 2
      // 776: ifeq 7ef
      // 779: iload 5
      // 77b: ifeq 7b5
      // 77e: goto 785
      // 781: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 784: athrow
      // 785: aload 0
      // 786: new net/minecraft/network/play/server/S14PacketEntity$S16PacketEntityLook
      // 789: dup
      // 78a: aload 0
      // 78b: getfield ka6.ca2 Li2h;
      // 78e: invokevirtual i2h.jwu ()I
      // 791: iload 3
      // 792: i2b
      // 793: iload 4
      // 795: i2b
      // 796: aload 0
      // 797: getfield ka6.ca2 Li2h;
      // 79a: getfield i2h.lfk Z
      // 79d: invokespecial net/minecraft/network/play/server/S14PacketEntity$S16PacketEntityLook.<init> (IBBZ)V
      // 7a0: invokevirtual ka6.geq (Lmz2;)V
      // 7a3: aload 0
      // 7a4: iload 3
      // 7a5: putfield ka6.ots I
      // 7a8: aload 0
      // 7a9: iload 4
      // 7ab: putfield ka6.noh I
      // 7ae: goto 7b5
      // 7b1: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7b4: athrow
      // 7b5: aload 0
      // 7b6: aload 0
      // 7b7: getfield ka6.ca2 Li2h;
      // 7ba: getfield i2h.o2v D
      // 7bd: ldc2_w 32.0
      // 7c0: dmul
      // 7c1: invokestatic fe6.jqf (D)I
      // 7c4: putfield ka6.jq7 I
      // 7c7: aload 0
      // 7c8: aload 0
      // 7c9: getfield ka6.ca2 Li2h;
      // 7cc: getfield i2h.kfp D
      // 7cf: ldc2_w 32.0
      // 7d2: dmul
      // 7d3: invokestatic fe6.jqf (D)I
      // 7d6: putfield ka6.ggp I
      // 7d9: aload 0
      // 7da: aload 0
      // 7db: getfield ka6.ca2 Li2h;
      // 7de: getfield i2h.vbd D
      // 7e1: ldc2_w 32.0
      // 7e4: dmul
      // 7e5: invokestatic fe6.jqf (D)I
      // 7e8: putfield ka6.kwf I
      // 7eb: aload 0
      // 7ec: invokespecial ka6.nep ()V
      // 7ef: aload 0
      // 7f0: bipush 1
      // 7f1: putfield ka6.bwd Z
      // 7f4: aload 0
      // 7f5: getfield ka6.ca2 Li2h;
      // 7f8: iload 2
      // 7f9: ifeq 839
      // 7fc: invokevirtual i2h.t9t ()F
      // 7ff: ldc 256.0
      // 801: nop
      // 802: fmul
      // 803: ldc 360.0
      // 805: nop
      // 806: fdiv
      // 807: invokestatic fe6.tpk (F)I
      // 80a: istore 3
      // 80b: iload 3
      // 80c: aload 0
      // 80d: getfield ka6.sok I
      // 810: isub
      // 811: invokestatic java/lang/Math.abs (I)I
      // 814: bipush 4
      // 815: if_icmplt 835
      // 818: aload 0
      // 819: new net/minecraft/network/play/server/S19PacketEntityHeadLook
      // 81c: dup
      // 81d: aload 0
      // 81e: getfield ka6.ca2 Li2h;
      // 821: iload 3
      // 822: i2b
      // 823: invokespecial net/minecraft/network/play/server/S19PacketEntityHeadLook.<init> (Li2h;B)V
      // 826: invokevirtual ka6.geq (Lmz2;)V
      // 829: aload 0
      // 82a: iload 3
      // 82b: putfield ka6.sok I
      // 82e: goto 835
      // 831: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 834: athrow
      // 835: aload 0
      // 836: getfield ka6.ca2 Li2h;
      // 839: bipush 0
      // 83a: putfield i2h.u19 Z
      // 83d: aload 0
      // 83e: dup
      // 83f: getfield ka6.qf6 I
      // 842: bipush 1
      // 843: iadd
      // 844: putfield ka6.qf6 I
      // 847: aload 0
      // 848: getfield ka6.ca2 Li2h;
      // 84b: iload 2
      // 84c: ifeq 876
      // 84f: getfield i2h.t8d Z
      // 852: goto 859
      // 855: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 858: athrow
      // 859: ifeq 87a
      // 85c: aload 0
      // 85d: new net/minecraft/network/play/server/S12PacketEntityVelocity
      // 860: dup
      // 861: aload 0
      // 862: getfield ka6.ca2 Li2h;
      // 865: invokespecial net/minecraft/network/play/server/S12PacketEntityVelocity.<init> (Li2h;)V
      // 868: invokevirtual ka6.v72 (Lmz2;)V
      // 86b: aload 0
      // 86c: getfield ka6.ca2 Li2h;
      // 86f: goto 876
      // 872: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 875: athrow
      // 876: bipush 0
      // 877: putfield i2h.t8d Z
      // 87a: return
   }

   private void nep() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield ka6.ca2 Li2h;
      // 08: invokevirtual i2h.a0c ()Lwl1;
      // 0b: astore 2
      // 0c: aload 2
      // 0d: invokevirtual wl1.jmu ()Z
      // 10: iload 1
      // 11: ifeq 4b
      // 14: ifeq 39
      // 17: goto 1e
      // 1a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: new net/minecraft/network/play/server/S1CPacketEntityMetadata
      // 22: dup
      // 23: aload 0
      // 24: getfield ka6.ca2 Li2h;
      // 27: invokevirtual i2h.jwu ()I
      // 2a: aload 2
      // 2b: bipush 0
      // 2c: invokespecial net/minecraft/network/play/server/S1CPacketEntityMetadata.<init> (ILwl1;Z)V
      // 2f: invokevirtual ka6.v72 (Lmz2;)V
      // 32: goto 39
      // 35: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield ka6.ca2 Li2h;
      // 3d: iload 1
      // 3e: ifeq 59
      // 41: instanceof g_3
      // 44: goto 4b
      // 47: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a: athrow
      // 4b: ifeq a0
      // 4e: aload 0
      // 4f: getfield ka6.ca2 Li2h;
      // 52: goto 59
      // 55: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58: athrow
      // 59: checkcast g_3
      // 5c: invokevirtual g_3.s_a ()Losd;
      // 5f: checkcast uya
      // 62: astore 3
      // 63: aload 3
      // 64: invokevirtual uya.s89 ()Ljava/util/Set;
      // 67: astore 4
      // 69: aload 4
      // 6b: iload 1
      // 6c: ifeq 9b
      // 6f: invokeinterface java/util/Set.isEmpty ()Z 1
      // 74: ifne 99
      // 77: goto 7e
      // 7a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: new net/minecraft/network/play/server/S20PacketEntityProperties
      // 82: dup
      // 83: aload 0
      // 84: getfield ka6.ca2 Li2h;
      // 87: invokevirtual i2h.jwu ()I
      // 8a: aload 4
      // 8c: invokespecial net/minecraft/network/play/server/S20PacketEntityProperties.<init> (ILjava/util/Collection;)V
      // 8f: invokevirtual ka6.v72 (Lmz2;)V
      // 92: goto 99
      // 95: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 98: athrow
      // 99: aload 4
      // 9b: invokeinterface java/util/Set.clear ()V 1
      // a0: return
   }

   public void geq(mz2 var1) {
      int var2 = t9d.b();

      for (z96 var4 : this.imu) {
         var4.rhh.vnf(var1);
         if (var2 == 0) {
            break;
         }
      }
   }

   public void v72(mz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual ka6.geq (Lmz2;)V
      // 09: aload 0
      // 0a: getfield ka6.ca2 Li2h;
      // 0d: iload 2
      // 0e: ifne 29
      // 11: instanceof z96
      // 14: ifeq 33
      // 17: goto 1e
      // 1a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield ka6.ca2 Li2h;
      // 22: goto 29
      // 25: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28: athrow
      // 29: checkcast z96
      // 2c: getfield z96.rhh Lmlk;
      // 2f: aload 1
      // 30: invokevirtual mlk.vnf (Lmz2;)V
      // 33: return
   }

   public void grk() {
      int var1 = t9d.c();

      for (z96 var3 : this.imu) {
         var3.if2(this.ca2);
         if (var1 != 0) {
            break;
         }
      }
   }

   public void kcn(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield ka6.imu Ljava/util/Set;
      // 08: aload 1
      // 09: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0e: iload 2
      // 0f: ifne 35
      // 12: ifeq 36
      // 15: goto 1c
      // 18: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: aload 0
      // 1e: getfield ka6.ca2 Li2h;
      // 21: invokevirtual z96.if2 (Li2h;)V
      // 24: aload 0
      // 25: getfield ka6.imu Ljava/util/Set;
      // 28: aload 1
      // 29: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 2e: goto 35
      // 31: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: pop
      // 36: return
   }

   public void i1g(z96 param1) {
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
      // 005: aload 0
      // 006: getfield ka6.ca2 Li2h;
      // 009: if_acmpeq 3cb
      // 00c: aload 0
      // 00d: aload 1
      // 00e: invokevirtual ka6.ydn (Lz96;)Z
      // 011: iload 2
      // 012: ifne 3a3
      // 015: goto 01c
      // 018: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01b: athrow
      // 01c: ifeq 392
      // 01f: goto 026
      // 022: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 025: athrow
      // 026: aload 0
      // 027: getfield ka6.imu Ljava/util/Set;
      // 02a: aload 1
      // 02b: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 030: iload 2
      // 031: ifne 051
      // 034: goto 03b
      // 037: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03a: athrow
      // 03b: ifne 3cb
      // 03e: goto 045
      // 041: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 044: athrow
      // 045: aload 0
      // 046: aload 1
      // 047: invokespecial ka6.nfu (Lz96;)Z
      // 04a: goto 051
      // 04d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 050: athrow
      // 051: iload 2
      // 052: ifne 08c
      // 055: ifne 07b
      // 058: goto 05f
      // 05b: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield ka6.ca2 Li2h;
      // 063: getfield i2h.dg4 Z
      // 066: iload 2
      // 067: ifne 08c
      // 06a: goto 071
      // 06d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 070: athrow
      // 071: ifeq 3cb
      // 074: goto 07b
      // 077: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07a: athrow
      // 07b: aload 0
      // 07c: getfield ka6.imu Ljava/util/Set;
      // 07f: aload 1
      // 080: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 085: goto 08c
      // 088: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08b: athrow
      // 08c: pop
      // 08d: aload 0
      // 08e: invokespecial ka6.vdn ()Lmz2;
      // 091: astore 3
      // 092: aload 1
      // 093: getfield z96.rhh Lmlk;
      // 096: aload 3
      // 097: invokevirtual mlk.vnf (Lmz2;)V
      // 09a: aload 0
      // 09b: getfield ka6.ca2 Li2h;
      // 09e: iload 2
      // 09f: ifne 0da
      // 0a2: invokevirtual i2h.a0c ()Lwl1;
      // 0a5: invokevirtual wl1.d95 ()Z
      // 0a8: ifne 0d6
      // 0ab: goto 0b2
      // 0ae: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b1: athrow
      // 0b2: aload 1
      // 0b3: getfield z96.rhh Lmlk;
      // 0b6: new net/minecraft/network/play/server/S1CPacketEntityMetadata
      // 0b9: dup
      // 0ba: aload 0
      // 0bb: getfield ka6.ca2 Li2h;
      // 0be: invokevirtual i2h.jwu ()I
      // 0c1: aload 0
      // 0c2: getfield ka6.ca2 Li2h;
      // 0c5: invokevirtual i2h.a0c ()Lwl1;
      // 0c8: bipush 1
      // 0c9: invokespecial net/minecraft/network/play/server/S1CPacketEntityMetadata.<init> (ILwl1;Z)V
      // 0cc: invokevirtual mlk.vnf (Lmz2;)V
      // 0cf: goto 0d6
      // 0d2: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield ka6.ca2 Li2h;
      // 0da: invokevirtual i2h.szx ()Lbdo;
      // 0dd: astore 4
      // 0df: aload 4
      // 0e1: ifnull 102
      // 0e4: aload 1
      // 0e5: getfield z96.rhh Lmlk;
      // 0e8: new net/minecraft/network/play/server/S49PacketUpdateEntityNBT
      // 0eb: dup
      // 0ec: aload 0
      // 0ed: getfield ka6.ca2 Li2h;
      // 0f0: invokevirtual i2h.jwu ()I
      // 0f3: aload 4
      // 0f5: invokespecial net/minecraft/network/play/server/S49PacketUpdateEntityNBT.<init> (ILbdo;)V
      // 0f8: invokevirtual mlk.vnf (Lmz2;)V
      // 0fb: goto 102
      // 0fe: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 101: athrow
      // 102: aload 0
      // 103: getfield ka6.ca2 Li2h;
      // 106: instanceof g_3
      // 109: iload 2
      // 10a: ifne 190
      // 10d: ifeq 160
      // 110: goto 117
      // 113: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 116: athrow
      // 117: aload 0
      // 118: getfield ka6.ca2 Li2h;
      // 11b: checkcast g_3
      // 11e: invokevirtual g_3.s_a ()Losd;
      // 121: checkcast uya
      // 124: astore 5
      // 126: aload 5
      // 128: invokevirtual uya.kz8 ()Ljava/util/Collection;
      // 12b: astore 6
      // 12d: aload 6
      // 12f: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 134: iload 2
      // 135: ifne 190
      // 138: ifne 160
      // 13b: goto 142
      // 13e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 141: athrow
      // 142: aload 1
      // 143: getfield z96.rhh Lmlk;
      // 146: new net/minecraft/network/play/server/S20PacketEntityProperties
      // 149: dup
      // 14a: aload 0
      // 14b: getfield ka6.ca2 Li2h;
      // 14e: invokevirtual i2h.jwu ()I
      // 151: aload 6
      // 153: invokespecial net/minecraft/network/play/server/S20PacketEntityProperties.<init> (ILjava/util/Collection;)V
      // 156: invokevirtual mlk.vnf (Lmz2;)V
      // 159: goto 160
      // 15c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15f: athrow
      // 160: aload 0
      // 161: aload 0
      // 162: getfield ka6.ca2 Li2h;
      // 165: getfield i2h.icv D
      // 168: putfield ka6.n2r D
      // 16b: aload 0
      // 16c: aload 0
      // 16d: getfield ka6.ca2 Li2h;
      // 170: getfield i2h.mop D
      // 173: putfield ka6.wov D
      // 176: aload 0
      // 177: aload 0
      // 178: getfield ka6.ca2 Li2h;
      // 17b: getfield i2h.bw4 D
      // 17e: putfield ka6.ye2 D
      // 181: aload 0
      // 182: iload 2
      // 183: ifne 1d3
      // 186: getfield ka6.fd_ Z
      // 189: goto 190
      // 18c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18f: athrow
      // 190: ifeq 1d2
      // 193: aload 3
      // 194: instanceof net/minecraft/network/play/server/S0FPacketSpawnMob
      // 197: ifne 1d2
      // 19a: goto 1a1
      // 19d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a0: athrow
      // 1a1: aload 1
      // 1a2: getfield z96.rhh Lmlk;
      // 1a5: new net/minecraft/network/play/server/S12PacketEntityVelocity
      // 1a8: dup
      // 1a9: aload 0
      // 1aa: getfield ka6.ca2 Li2h;
      // 1ad: invokevirtual i2h.jwu ()I
      // 1b0: aload 0
      // 1b1: getfield ka6.ca2 Li2h;
      // 1b4: getfield i2h.icv D
      // 1b7: aload 0
      // 1b8: getfield ka6.ca2 Li2h;
      // 1bb: getfield i2h.mop D
      // 1be: aload 0
      // 1bf: getfield ka6.ca2 Li2h;
      // 1c2: getfield i2h.bw4 D
      // 1c5: invokespecial net/minecraft/network/play/server/S12PacketEntityVelocity.<init> (IDDD)V
      // 1c8: invokevirtual mlk.vnf (Lmz2;)V
      // 1cb: goto 1d2
      // 1ce: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d1: athrow
      // 1d2: aload 0
      // 1d3: getfield ka6.ca2 Li2h;
      // 1d6: getfield i2h.hzp Li2h;
      // 1d9: iload 2
      // 1da: ifne 20c
      // 1dd: ifnull 208
      // 1e0: goto 1e7
      // 1e3: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e6: athrow
      // 1e7: aload 1
      // 1e8: getfield z96.rhh Lmlk;
      // 1eb: new net/minecraft/network/play/server/S1BPacketEntityAttach
      // 1ee: dup
      // 1ef: bipush 0
      // 1f0: aload 0
      // 1f1: getfield ka6.ca2 Li2h;
      // 1f4: aload 0
      // 1f5: getfield ka6.ca2 Li2h;
      // 1f8: getfield i2h.hzp Li2h;
      // 1fb: invokespecial net/minecraft/network/play/server/S1BPacketEntityAttach.<init> (ILi2h;Li2h;)V
      // 1fe: invokevirtual mlk.vnf (Lmz2;)V
      // 201: goto 208
      // 204: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 207: athrow
      // 208: aload 0
      // 209: getfield ka6.ca2 Li2h;
      // 20c: instanceof yqv
      // 20f: iload 2
      // 210: ifne 267
      // 213: ifeq 260
      // 216: goto 21d
      // 219: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21c: athrow
      // 21d: aload 0
      // 21e: getfield ka6.ca2 Li2h;
      // 221: checkcast yqv
      // 224: invokevirtual yqv.ohg ()Li2h;
      // 227: iload 2
      // 228: ifne 264
      // 22b: goto 232
      // 22e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 231: athrow
      // 232: ifnull 260
      // 235: goto 23c
      // 238: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23b: athrow
      // 23c: aload 1
      // 23d: getfield z96.rhh Lmlk;
      // 240: new net/minecraft/network/play/server/S1BPacketEntityAttach
      // 243: dup
      // 244: bipush 1
      // 245: aload 0
      // 246: getfield ka6.ca2 Li2h;
      // 249: aload 0
      // 24a: getfield ka6.ca2 Li2h;
      // 24d: checkcast yqv
      // 250: invokevirtual yqv.ohg ()Li2h;
      // 253: invokespecial net/minecraft/network/play/server/S1BPacketEntityAttach.<init> (ILi2h;Li2h;)V
      // 256: invokevirtual mlk.vnf (Lmz2;)V
      // 259: goto 260
      // 25c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25f: athrow
      // 260: aload 0
      // 261: getfield ka6.ca2 Li2h;
      // 264: instanceof g_3
      // 267: iload 2
      // 268: ifne 2d5
      // 26b: ifeq 2ce
      // 26e: goto 275
      // 271: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 274: athrow
      // 275: bipush 0
      // 276: istore 5
      // 278: iload 5
      // 27a: bipush 5
      // 27b: if_icmpge 2ce
      // 27e: aload 0
      // 27f: getfield ka6.ca2 Li2h;
      // 282: checkcast g_3
      // 285: iload 5
      // 287: invokevirtual g_3.rnq (I)Lerg;
      // 28a: astore 6
      // 28c: iload 2
      // 28d: ifne 321
      // 290: iload 2
      // 291: ifne 2ca
      // 294: goto 29b
      // 297: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 29a: athrow
      // 29b: aload 6
      // 29d: ifnull 2c7
      // 2a0: goto 2a7
      // 2a3: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a6: athrow
      // 2a7: aload 1
      // 2a8: getfield z96.rhh Lmlk;
      // 2ab: new net/minecraft/network/play/server/S04PacketEntityEquipment
      // 2ae: dup
      // 2af: aload 0
      // 2b0: getfield ka6.ca2 Li2h;
      // 2b3: invokevirtual i2h.jwu ()I
      // 2b6: iload 5
      // 2b8: aload 6
      // 2ba: invokespecial net/minecraft/network/play/server/S04PacketEntityEquipment.<init> (IILerg;)V
      // 2bd: invokevirtual mlk.vnf (Lmz2;)V
      // 2c0: goto 2c7
      // 2c3: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c6: athrow
      // 2c7: iinc 5 1
      // 2ca: iload 2
      // 2cb: ifeq 278
      // 2ce: aload 0
      // 2cf: getfield ka6.ca2 Li2h;
      // 2d2: instanceof ha9
      // 2d5: iload 2
      // 2d6: ifne 333
      // 2d9: ifeq 321
      // 2dc: goto 2e3
      // 2df: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e2: athrow
      // 2e3: aload 0
      // 2e4: getfield ka6.ca2 Li2h;
      // 2e7: checkcast ha9
      // 2ea: astore 5
      // 2ec: aload 5
      // 2ee: invokevirtual ha9.ofg ()Z
      // 2f1: iload 2
      // 2f2: ifne 333
      // 2f5: ifeq 321
      // 2f8: goto 2ff
      // 2fb: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2fe: athrow
      // 2ff: aload 1
      // 300: getfield z96.rhh Lmlk;
      // 303: new net/minecraft/network/play/server/S0APacketUseBed
      // 306: dup
      // 307: aload 5
      // 309: new mew
      // 30c: dup
      // 30d: aload 0
      // 30e: getfield ka6.ca2 Li2h;
      // 311: invokespecial mew.<init> (Li2h;)V
      // 314: invokespecial net/minecraft/network/play/server/S0APacketUseBed.<init> (Lha9;Lmew;)V
      // 317: invokevirtual mlk.vnf (Lmz2;)V
      // 31a: goto 321
      // 31d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 320: athrow
      // 321: aload 0
      // 322: getfield ka6.ca2 Li2h;
      // 325: iload 2
      // 326: ifne 341
      // 329: instanceof g_3
      // 32c: goto 333
      // 32f: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 332: athrow
      // 333: ifeq 38e
      // 336: aload 0
      // 337: getfield ka6.ca2 Li2h;
      // 33a: goto 341
      // 33d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 340: athrow
      // 341: checkcast g_3
      // 344: astore 5
      // 346: aload 5
      // 348: invokevirtual g_3.g5i ()Ljava/util/Collection;
      // 34b: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 350: astore 6
      // 352: aload 6
      // 354: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 359: ifeq 38e
      // 35c: aload 6
      // 35e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 363: checkcast sdj
      // 366: astore 7
      // 368: aload 1
      // 369: getfield z96.rhh Lmlk;
      // 36c: new net/minecraft/network/play/server/S1DPacketEntityEffect
      // 36f: dup
      // 370: aload 0
      // 371: getfield ka6.ca2 Li2h;
      // 374: invokevirtual i2h.jwu ()I
      // 377: aload 7
      // 379: invokespecial net/minecraft/network/play/server/S1DPacketEntityEffect.<init> (ILsdj;)V
      // 37c: invokevirtual mlk.vnf (Lmz2;)V
      // 37f: iload 2
      // 380: ifne 3cb
      // 383: iload 2
      // 384: ifeq 352
      // 387: goto 38e
      // 38a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38d: athrow
      // 38e: iload 2
      // 38f: ifeq 3cb
      // 392: aload 0
      // 393: getfield ka6.imu Ljava/util/Set;
      // 396: aload 1
      // 397: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 39c: goto 3a3
      // 39f: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a2: athrow
      // 3a3: iload 2
      // 3a4: ifne 3c2
      // 3a7: ifeq 3cb
      // 3aa: goto 3b1
      // 3ad: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3b0: athrow
      // 3b1: aload 0
      // 3b2: getfield ka6.imu Ljava/util/Set;
      // 3b5: aload 1
      // 3b6: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 3bb: goto 3c2
      // 3be: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c1: athrow
      // 3c2: pop
      // 3c3: aload 1
      // 3c4: aload 0
      // 3c5: getfield ka6.ca2 Li2h;
      // 3c8: invokevirtual z96.if2 (Li2h;)V
      // 3cb: return
   }

   public boolean ydn(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield z96.o2v D
      // 04: aload 0
      // 05: getfield ka6.jq7 I
      // 08: bipush 32
      // 0a: idiv
      // 0b: i2d
      // 0c: dsub
      // 0d: dstore 3
      // 0e: invokestatic t9d.b ()I
      // 11: aload 1
      // 12: getfield z96.vbd D
      // 15: aload 0
      // 16: getfield ka6.kwf I
      // 19: bipush 32
      // 1b: idiv
      // 1c: i2d
      // 1d: dsub
      // 1e: dstore 5
      // 20: istore 2
      // 21: dload 3
      // 22: aload 0
      // 23: getfield ka6.k42 I
      // 26: ineg
      // 27: i2d
      // 28: dcmpl
      // 29: iload 2
      // 2a: ifeq 45
      // 2d: iflt af
      // 30: goto 37
      // 33: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: dload 3
      // 38: aload 0
      // 39: getfield ka6.k42 I
      // 3c: i2d
      // 3d: dcmpg
      // 3e: goto 45
      // 41: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: iload 2
      // 46: ifeq 63
      // 49: ifgt af
      // 4c: goto 53
      // 4f: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: dload 5
      // 55: aload 0
      // 56: getfield ka6.k42 I
      // 59: ineg
      // 5a: i2d
      // 5b: dcmpl
      // 5c: goto 63
      // 5f: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 62: athrow
      // 63: iload 2
      // 64: ifeq 80
      // 67: iflt af
      // 6a: goto 71
      // 6d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 70: athrow
      // 71: dload 5
      // 73: aload 0
      // 74: getfield ka6.k42 I
      // 77: i2d
      // 78: dcmpg
      // 79: goto 80
      // 7c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7f: athrow
      // 80: iload 2
      // 81: ifeq 9d
      // 84: ifgt af
      // 87: goto 8e
      // 8a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield ka6.ca2 Li2h;
      // 92: aload 1
      // 93: invokevirtual i2h.xak (Lz96;)Z
      // 96: goto 9d
      // 99: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 9c: athrow
      // 9d: iload 2
      // 9e: ifeq ac
      // a1: ifeq af
      // a4: goto ab
      // a7: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // aa: athrow
      // ab: bipush 1
      // ac: goto b0
      // af: bipush 0
      // b0: ireturn
   }

   private boolean nfu(z96 var1) {
      return var1.b88().gez().ydq(var1, this.ca2.jw4, this.ca2.e6l);
   }

   public void k46(List var1) {
      int var2 = t9d.c();
      int var3 = 0;

      while (var3 < var1.size()) {
         this.i1g((z96)var1.get(var3));
         var3++;
         if (var2 != 0) {
            break;
         }
      }
   }

   private mz2 vdn() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ka6.a J
      // 003: ldc2_w 64404052556497
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield ka6.ca2 Li2h;
      // 010: getfield i2h.ma9 Z
      // 013: iload 3
      // 014: ifne 045
      // 017: ifeq 03e
      // 01a: goto 021
      // 01d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 020: athrow
      // 021: getstatic ka6.aq3 Lorg/apache/logging/log4j/Logger;
      // 024: sipush 26540
      // 027: ldc2_w 9090878859469568524
      // 02a: lload 1
      // 02b: lxor
      // 02c: invokedynamic c (IJ)Ljava/lang/String; bsm=ka6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 037: goto 03e
      // 03a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 03d: athrow
      // 03e: aload 0
      // 03f: getfield ka6.ca2 Li2h;
      // 042: instanceof nvf
      // 045: iload 3
      // 046: ifne 06c
      // 049: ifeq 065
      // 04c: goto 053
      // 04f: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 052: athrow
      // 053: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 056: dup
      // 057: aload 0
      // 058: getfield ka6.ca2 Li2h;
      // 05b: bipush 2
      // 05c: bipush 1
      // 05d: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 060: areturn
      // 061: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 064: athrow
      // 065: aload 0
      // 066: getfield ka6.ca2 Li2h;
      // 069: instanceof z96
      // 06c: iload 3
      // 06d: ifne 094
      // 070: ifeq 08d
      // 073: goto 07a
      // 076: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 079: athrow
      // 07a: new net/minecraft/network/play/server/S0CPacketSpawnPlayer
      // 07d: dup
      // 07e: aload 0
      // 07f: getfield ka6.ca2 Li2h;
      // 082: checkcast ha9
      // 085: invokespecial net/minecraft/network/play/server/S0CPacketSpawnPlayer.<init> (Lha9;)V
      // 088: areturn
      // 089: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield ka6.ca2 Li2h;
      // 091: instanceof _f3
      // 094: iload 3
      // 095: ifne 0c8
      // 098: ifeq 0c1
      // 09b: goto 0a2
      // 09e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield ka6.ca2 Li2h;
      // 0a6: checkcast _f3
      // 0a9: astore 4
      // 0ab: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 0ae: dup
      // 0af: aload 0
      // 0b0: getfield ka6.ca2 Li2h;
      // 0b3: bipush 10
      // 0b5: aload 4
      // 0b7: invokevirtual _f3.x38 ()L_f3$c3d;
      // 0ba: invokevirtual _f3$c3d.ydn ()I
      // 0bd: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 0c0: areturn
      // 0c1: aload 0
      // 0c2: getfield ka6.ca2 Li2h;
      // 0c5: instanceof w54
      // 0c8: iload 3
      // 0c9: ifne 0ee
      // 0cc: ifeq 0e7
      // 0cf: goto 0d6
      // 0d2: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d5: athrow
      // 0d6: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 0d9: dup
      // 0da: aload 0
      // 0db: getfield ka6.ca2 Li2h;
      // 0de: bipush 1
      // 0df: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 0e2: areturn
      // 0e3: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield ka6.ca2 Li2h;
      // 0eb: instanceof w55
      // 0ee: iload 3
      // 0ef: ifne 12c
      // 0f2: ifeq 125
      // 0f5: goto 0fc
      // 0f8: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: aload 0
      // 0fe: getfield ka6.ca2 Li2h;
      // 101: invokevirtual i2h.t9t ()F
      // 104: ldc 256.0
      // 106: nop
      // 107: fmul
      // 108: ldc 360.0
      // 10a: nop
      // 10b: fdiv
      // 10c: invokestatic fe6.tpk (F)I
      // 10f: putfield ka6.sok I
      // 112: new net/minecraft/network/play/server/S0FPacketSpawnMob
      // 115: dup
      // 116: aload 0
      // 117: getfield ka6.ca2 Li2h;
      // 11a: checkcast g_3
      // 11d: invokespecial net/minecraft/network/play/server/S0FPacketSpawnMob.<init> (Lg_3;)V
      // 120: areturn
      // 121: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 124: athrow
      // 125: aload 0
      // 126: getfield ka6.ca2 Li2h;
      // 129: instanceof sj_
      // 12c: iload 3
      // 12d: ifne 173
      // 130: ifeq 16c
      // 133: goto 13a
      // 136: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 139: athrow
      // 13a: aload 0
      // 13b: getfield ka6.ca2 Li2h;
      // 13e: checkcast sj_
      // 141: getfield sj_.iqf Lha9;
      // 144: astore 4
      // 146: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 149: dup
      // 14a: aload 0
      // 14b: getfield ka6.ca2 Li2h;
      // 14e: bipush 90
      // 150: aload 4
      // 152: ifnull 161
      // 155: aload 4
      // 157: invokevirtual i2h.jwu ()I
      // 15a: goto 168
      // 15d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 160: athrow
      // 161: aload 0
      // 162: getfield ka6.ca2 Li2h;
      // 165: invokevirtual i2h.jwu ()I
      // 168: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 16b: areturn
      // 16c: aload 0
      // 16d: getfield ka6.ca2 Li2h;
      // 170: instanceof hy9
      // 173: iload 3
      // 174: ifne 1ba
      // 177: ifeq 1b3
      // 17a: goto 181
      // 17d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 180: athrow
      // 181: aload 0
      // 182: getfield ka6.ca2 Li2h;
      // 185: checkcast hy9
      // 188: getfield hy9.k_d Li2h;
      // 18b: astore 4
      // 18d: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 190: dup
      // 191: aload 0
      // 192: getfield ka6.ca2 Li2h;
      // 195: bipush 60
      // 197: aload 4
      // 199: ifnull 1a8
      // 19c: aload 4
      // 19e: invokevirtual i2h.jwu ()I
      // 1a1: goto 1af
      // 1a4: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: getfield ka6.ca2 Li2h;
      // 1ac: invokevirtual i2h.jwu ()I
      // 1af: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 1b2: areturn
      // 1b3: aload 0
      // 1b4: getfield ka6.ca2 Li2h;
      // 1b7: instanceof txr
      // 1ba: iload 3
      // 1bb: ifne 1e1
      // 1be: ifeq 1da
      // 1c1: goto 1c8
      // 1c4: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c7: athrow
      // 1c8: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 1cb: dup
      // 1cc: aload 0
      // 1cd: getfield ka6.ca2 Li2h;
      // 1d0: bipush 61
      // 1d2: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 1d5: areturn
      // 1d6: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d9: athrow
      // 1da: aload 0
      // 1db: getfield ka6.ca2 Li2h;
      // 1de: instanceof nuq
      // 1e1: iload 3
      // 1e2: ifne 212
      // 1e5: ifeq 20b
      // 1e8: goto 1ef
      // 1eb: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1ee: athrow
      // 1ef: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 1f2: dup
      // 1f3: aload 0
      // 1f4: getfield ka6.ca2 Li2h;
      // 1f7: bipush 73
      // 1f9: aload 0
      // 1fa: getfield ka6.ca2 Li2h;
      // 1fd: checkcast nuq
      // 200: invokevirtual nuq.i3f ()I
      // 203: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 206: areturn
      // 207: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20a: athrow
      // 20b: aload 0
      // 20c: getfield ka6.ca2 Li2h;
      // 20f: instanceof vdu
      // 212: iload 3
      // 213: ifne 239
      // 216: ifeq 232
      // 219: goto 220
      // 21c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 21f: athrow
      // 220: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 223: dup
      // 224: aload 0
      // 225: getfield ka6.ca2 Li2h;
      // 228: bipush 75
      // 22a: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 22d: areturn
      // 22e: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 231: athrow
      // 232: aload 0
      // 233: getfield ka6.ca2 Li2h;
      // 236: instanceof jv0
      // 239: iload 3
      // 23a: ifne 260
      // 23d: ifeq 259
      // 240: goto 247
      // 243: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 246: athrow
      // 247: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 24a: dup
      // 24b: aload 0
      // 24c: getfield ka6.ca2 Li2h;
      // 24f: bipush 65
      // 251: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 254: areturn
      // 255: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 258: athrow
      // 259: aload 0
      // 25a: getfield ka6.ca2 Li2h;
      // 25d: instanceof db9
      // 260: iload 3
      // 261: ifne 287
      // 264: ifeq 280
      // 267: goto 26e
      // 26a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26d: athrow
      // 26e: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 271: dup
      // 272: aload 0
      // 273: getfield ka6.ca2 Li2h;
      // 276: bipush 72
      // 278: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 27b: areturn
      // 27c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27f: athrow
      // 280: aload 0
      // 281: getfield ka6.ca2 Li2h;
      // 284: instanceof nl9
      // 287: iload 3
      // 288: ifne 2ae
      // 28b: ifeq 2a7
      // 28e: goto 295
      // 291: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 294: athrow
      // 295: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 298: dup
      // 299: aload 0
      // 29a: getfield ka6.ca2 Li2h;
      // 29d: bipush 76
      // 29f: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 2a2: areturn
      // 2a3: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: getfield ka6.ca2 Li2h;
      // 2ab: instanceof c5x
      // 2ae: iload 3
      // 2af: ifne 377
      // 2b2: ifeq 370
      // 2b5: goto 2bc
      // 2b8: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2bb: athrow
      // 2bc: aload 0
      // 2bd: getfield ka6.ca2 Li2h;
      // 2c0: checkcast c5x
      // 2c3: astore 4
      // 2c5: aconst_null
      // 2c6: astore 5
      // 2c8: bipush 63
      // 2ca: istore 6
      // 2cc: aload 0
      // 2cd: getfield ka6.ca2 Li2h;
      // 2d0: instanceof ka8
      // 2d3: iload 3
      // 2d4: ifne 2f7
      // 2d7: ifeq 2e9
      // 2da: goto 2e1
      // 2dd: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e0: athrow
      // 2e1: bipush 64
      // 2e3: istore 6
      // 2e5: iload 3
      // 2e6: ifeq 309
      // 2e9: aload 0
      // 2ea: getfield ka6.ca2 Li2h;
      // 2ed: instanceof k7p
      // 2f0: goto 2f7
      // 2f3: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2f6: athrow
      // 2f7: iload 3
      // 2f8: ifne 307
      // 2fb: ifeq 309
      // 2fe: goto 305
      // 301: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 304: athrow
      // 305: bipush 66
      // 307: istore 6
      // 309: aload 4
      // 30b: getfield c5x.gen Lg_3;
      // 30e: ifnull 330
      // 311: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 314: dup
      // 315: aload 0
      // 316: getfield ka6.ca2 Li2h;
      // 319: iload 6
      // 31b: aload 0
      // 31c: getfield ka6.ca2 Li2h;
      // 31f: checkcast c5x
      // 322: getfield c5x.gen Lg_3;
      // 325: invokevirtual g_3.jwu ()I
      // 328: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 32b: astore 5
      // 32d: goto 340
      // 330: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 333: dup
      // 334: aload 0
      // 335: getfield ka6.ca2 Li2h;
      // 338: iload 6
      // 33a: bipush 0
      // 33b: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 33e: astore 5
      // 340: aload 5
      // 342: aload 4
      // 344: getfield c5x.ax4 D
      // 347: ldc2_w 8000.0
      // 34a: dmul
      // 34b: d2i
      // 34c: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.bbp (I)V
      // 34f: aload 5
      // 351: aload 4
      // 353: getfield c5x.mjx D
      // 356: ldc2_w 8000.0
      // 359: dmul
      // 35a: d2i
      // 35b: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.gex (I)V
      // 35e: aload 5
      // 360: aload 4
      // 362: getfield c5x.ehh D
      // 365: ldc2_w 8000.0
      // 368: dmul
      // 369: d2i
      // 36a: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.blh (I)V
      // 36d: aload 5
      // 36f: areturn
      // 370: aload 0
      // 371: getfield ka6.ca2 Li2h;
      // 374: instanceof dur
      // 377: iload 3
      // 378: ifne 39e
      // 37b: ifeq 397
      // 37e: goto 385
      // 381: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 384: athrow
      // 385: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 388: dup
      // 389: aload 0
      // 38a: getfield ka6.ca2 Li2h;
      // 38d: bipush 62
      // 38f: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 392: areturn
      // 393: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 396: athrow
      // 397: aload 0
      // 398: getfield ka6.ca2 Li2h;
      // 39b: instanceof pix
      // 39e: iload 3
      // 39f: ifne 3c5
      // 3a2: ifeq 3be
      // 3a5: goto 3ac
      // 3a8: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ab: athrow
      // 3ac: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 3af: dup
      // 3b0: aload 0
      // 3b1: getfield ka6.ca2 Li2h;
      // 3b4: bipush 50
      // 3b6: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 3b9: areturn
      // 3ba: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3bd: athrow
      // 3be: aload 0
      // 3bf: getfield ka6.ca2 Li2h;
      // 3c2: instanceof edl
      // 3c5: iload 3
      // 3c6: ifne 3ec
      // 3c9: ifeq 3e5
      // 3cc: goto 3d3
      // 3cf: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3d2: athrow
      // 3d3: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 3d6: dup
      // 3d7: aload 0
      // 3d8: getfield ka6.ca2 Li2h;
      // 3db: bipush 51
      // 3dd: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 3e0: areturn
      // 3e1: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3e4: athrow
      // 3e5: aload 0
      // 3e6: getfield ka6.ca2 Li2h;
      // 3e9: instanceof vjf
      // 3ec: iload 3
      // 3ed: ifne 420
      // 3f0: ifeq 419
      // 3f3: goto 3fa
      // 3f6: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f9: athrow
      // 3fa: aload 0
      // 3fb: getfield ka6.ca2 Li2h;
      // 3fe: checkcast vjf
      // 401: astore 4
      // 403: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 406: dup
      // 407: aload 0
      // 408: getfield ka6.ca2 Li2h;
      // 40b: bipush 70
      // 40d: aload 4
      // 40f: invokevirtual vjf.j0m ()Lzfz;
      // 412: invokestatic e0x.r2y (Lzfz;)I
      // 415: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 418: areturn
      // 419: aload 0
      // 41a: getfield ka6.ca2 Li2h;
      // 41d: instanceof h67
      // 420: iload 3
      // 421: ifne 447
      // 424: ifeq 440
      // 427: goto 42e
      // 42a: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42d: athrow
      // 42e: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 431: dup
      // 432: aload 0
      // 433: getfield ka6.ca2 Li2h;
      // 436: bipush 78
      // 438: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 43b: areturn
      // 43c: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 43f: athrow
      // 440: aload 0
      // 441: getfield ka6.ca2 Li2h;
      // 444: instanceof n0_
      // 447: iload 3
      // 448: ifne 46f
      // 44b: ifeq 468
      // 44e: goto 455
      // 451: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 454: athrow
      // 455: new net/minecraft/network/play/server/S10PacketSpawnPainting
      // 458: dup
      // 459: aload 0
      // 45a: getfield ka6.ca2 Li2h;
      // 45d: checkcast n0_
      // 460: invokespecial net/minecraft/network/play/server/S10PacketSpawnPainting.<init> (Ln0_;)V
      // 463: areturn
      // 464: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 467: athrow
      // 468: aload 0
      // 469: getfield ka6.ca2 Li2h;
      // 46c: instanceof co7
      // 46f: iload 3
      // 470: ifne 4e1
      // 473: ifeq 4da
      // 476: goto 47d
      // 479: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47c: athrow
      // 47d: aload 0
      // 47e: getfield ka6.ca2 Li2h;
      // 481: checkcast co7
      // 484: astore 4
      // 486: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 489: dup
      // 48a: aload 0
      // 48b: getfield ka6.ca2 Li2h;
      // 48e: bipush 71
      // 490: aload 4
      // 492: getfield co7.vv_ Lvt2;
      // 495: invokevirtual vt2.tmy ()I
      // 498: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;II)V
      // 49b: astore 5
      // 49d: aload 4
      // 49f: invokevirtual co7.liv ()Lmew;
      // 4a2: astore 6
      // 4a4: aload 5
      // 4a6: aload 6
      // 4a8: invokevirtual mew.getX ()I
      // 4ab: bipush 32
      // 4ad: imul
      // 4ae: i2f
      // 4af: invokestatic fe6.tpk (F)I
      // 4b2: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.lw4 (I)V
      // 4b5: aload 5
      // 4b7: aload 6
      // 4b9: invokevirtual mew.getY ()I
      // 4bc: bipush 32
      // 4be: imul
      // 4bf: i2f
      // 4c0: invokestatic fe6.tpk (F)I
      // 4c3: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ofp (I)V
      // 4c6: aload 5
      // 4c8: aload 6
      // 4ca: invokevirtual mew.getZ ()I
      // 4cd: bipush 32
      // 4cf: imul
      // 4d0: i2f
      // 4d1: invokestatic fe6.tpk (F)I
      // 4d4: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k5r (I)V
      // 4d7: aload 5
      // 4d9: areturn
      // 4da: aload 0
      // 4db: getfield ka6.ca2 Li2h;
      // 4de: instanceof ugc
      // 4e1: iload 3
      // 4e2: ifne 54b
      // 4e5: ifeq 544
      // 4e8: goto 4ef
      // 4eb: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4ee: athrow
      // 4ef: aload 0
      // 4f0: getfield ka6.ca2 Li2h;
      // 4f3: checkcast ugc
      // 4f6: astore 4
      // 4f8: new net/minecraft/network/play/server/S0EPacketSpawnObject
      // 4fb: dup
      // 4fc: aload 0
      // 4fd: getfield ka6.ca2 Li2h;
      // 500: bipush 77
      // 502: invokespecial net/minecraft/network/play/server/S0EPacketSpawnObject.<init> (Li2h;I)V
      // 505: astore 5
      // 507: aload 4
      // 509: invokevirtual ugc.liv ()Lmew;
      // 50c: astore 6
      // 50e: aload 5
      // 510: aload 6
      // 512: invokevirtual mew.getX ()I
      // 515: bipush 32
      // 517: imul
      // 518: i2f
      // 519: invokestatic fe6.tpk (F)I
      // 51c: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.lw4 (I)V
      // 51f: aload 5
      // 521: aload 6
      // 523: invokevirtual mew.getY ()I
      // 526: bipush 32
      // 528: imul
      // 529: i2f
      // 52a: invokestatic fe6.tpk (F)I
      // 52d: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.ofp (I)V
      // 530: aload 5
      // 532: aload 6
      // 534: invokevirtual mew.getZ ()I
      // 537: bipush 32
      // 539: imul
      // 53a: i2f
      // 53b: invokestatic fe6.tpk (F)I
      // 53e: invokevirtual net/minecraft/network/play/server/S0EPacketSpawnObject.k5r (I)V
      // 541: aload 5
      // 543: areturn
      // 544: aload 0
      // 545: getfield ka6.ca2 Li2h;
      // 548: instanceof uno
      // 54b: ifeq 561
      // 54e: new net/minecraft/network/play/server/S11PacketSpawnExperienceOrb
      // 551: dup
      // 552: aload 0
      // 553: getfield ka6.ca2 Li2h;
      // 556: checkcast uno
      // 559: invokespecial net/minecraft/network/play/server/S11PacketSpawnExperienceOrb.<init> (Luno;)V
      // 55c: areturn
      // 55d: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 560: athrow
      // 561: new java/lang/IllegalArgumentException
      // 564: dup
      // 565: new java/lang/StringBuilder
      // 568: dup
      // 569: invokespecial java/lang/StringBuilder.<init> ()V
      // 56c: sipush 17426
      // 56f: ldc2_w 4078934202350967219
      // 572: lload 1
      // 573: lxor
      // 574: invokedynamic c (IJ)Ljava/lang/String; bsm=ka6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 579: nop
      // 57a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57d: aload 0
      // 57e: getfield ka6.ca2 Li2h;
      // 581: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 584: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 587: ldc "!"
      // 589: nop
      // 58a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 58d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 590: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 593: athrow
   }

   public void hyb(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield ka6.imu Ljava/util/Set;
      // 08: aload 1
      // 09: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0e: iload 2
      // 0f: ifne 2d
      // 12: ifeq 36
      // 15: goto 1c
      // 18: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield ka6.imu Ljava/util/Set;
      // 20: aload 1
      // 21: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 26: goto 2d
      // 29: invokestatic ka6.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2c: athrow
      // 2d: pop
      // 2e: aload 1
      // 2f: aload 0
      // 30: getfield ka6.ca2 Li2h;
      // 33: invokevirtual z96.if2 (Li2h;)V
      // 36: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3745584312216014843L, -6666013386855114203L, MethodHandles.lookup().lookupClass()).a(268054145883982L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 55900134259653L;
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
      String var6 = "\u0013s\u009c±%\n\u0082¢b\u008bs\u0088Æ2\u0094haÀa¨\u009b\u0018bÜÝ\u0019\u0017\u0084C\u000f\u008e\u0089\u0098ÜøàÄ\u008a]^HÒlYÙ\u0002ÑkXT\u008eÅ7\u000ew\u001eTnÁº³éøj;\t\u0080GCÿ÷\u008fO¬ 'ý\u007f\u000fr\u0095\u0080·ý\u000fò÷l)§{rüwk\u008b¸ÃüÙ@%\u0088\u0017\u008fL¶\u009eÑòßn%";
      int var8 = "\u0013s\u009c±%\n\u0082¢b\u008bs\u0088Æ2\u0094haÀa¨\u009b\u0018bÜÝ\u0019\u0017\u0084C\u000f\u008e\u0089\u0098ÜøàÄ\u008a]^HÒlYÙ\u0002ÑkXT\u008eÅ7\u000ew\u001eTnÁº³éøj;\t\u0080GCÿ÷\u008fO¬ 'ý\u007f\u000fr\u0095\u0080·ý\u000fò÷l)§{rüwk\u008b¸ÃüÙ@%\u0088\u0017\u008fL¶\u009eÑòßn%"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            aq3 = LogManager.getLogger();
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10147;
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
            throw new RuntimeException("ka6", var10);
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
         throw new RuntimeException("ka6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
