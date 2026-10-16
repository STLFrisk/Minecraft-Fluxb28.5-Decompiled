import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class qpc {
   private static final Logger jcm;
   private final dug ens;
   private Set t8u = Sets.newHashSet();
   private pni ddv = new pni();
   private int n8q;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public qpc(dug var1) {
      this.ens = var1;
      this.n8q = var1.ve6().wh3().z69();
   }

   public void lyi(EntityLivingBase param1) {
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
      // 005: instanceof z96
      // 008: iload 2
      // 009: ifeq 084
      // 00c: ifeq 079
      // 00f: goto 016
      // 012: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: aload 0
      // 017: aload 1
      // 018: sipush 512
      // 01b: bipush 2
      // 01c: invokevirtual qpc.qyo (Li2h;II)V
      // 01f: aload 1
      // 020: checkcast z96
      // 023: astore 3
      // 024: aload 0
      // 025: getfield qpc.t8u Ljava/util/Set;
      // 028: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 02d: astore 4
      // 02f: aload 4
      // 031: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 036: ifeq 075
      // 039: aload 4
      // 03b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 040: checkcast ka6
      // 043: astore 5
      // 045: iload 2
      // 046: ifeq 4e7
      // 049: aload 5
      // 04b: iload 2
      // 04c: ifeq 06d
      // 04f: goto 056
      // 052: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: getfield ka6.ca2 Li2h;
      // 059: aload 3
      // 05a: if_acmpeq 071
      // 05d: goto 064
      // 060: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: aload 5
      // 066: goto 06d
      // 069: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: aload 3
      // 06e: invokevirtual ka6.i1g (Lz96;)V
      // 071: iload 2
      // 072: ifne 02f
      // 075: iload 2
      // 076: ifne 4e7
      // 079: aload 1
      // 07a: instanceof sj_
      // 07d: goto 084
      // 080: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: iload 2
      // 085: ifeq 0b1
      // 088: ifeq 0a6
      // 08b: goto 092
      // 08e: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: aload 0
      // 093: aload 1
      // 094: bipush 64
      // 096: bipush 5
      // 097: bipush 1
      // 098: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 09b: iload 2
      // 09c: ifne 4e7
      // 09f: goto 0a6
      // 0a2: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: instanceof hy9
      // 0aa: goto 0b1
      // 0ad: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: iload 2
      // 0b2: ifeq 0df
      // 0b5: ifeq 0d4
      // 0b8: goto 0bf
      // 0bb: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: aload 1
      // 0c1: bipush 64
      // 0c3: bipush 20
      // 0c5: bipush 0
      // 0c6: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 0c9: iload 2
      // 0ca: ifne 4e7
      // 0cd: goto 0d4
      // 0d0: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d3: athrow
      // 0d4: aload 1
      // 0d5: instanceof ka8
      // 0d8: goto 0df
      // 0db: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: iload 2
      // 0e0: ifeq 10d
      // 0e3: ifeq 102
      // 0e6: goto 0ed
      // 0e9: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: aload 1
      // 0ef: bipush 64
      // 0f1: bipush 10
      // 0f3: bipush 0
      // 0f4: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 0f7: iload 2
      // 0f8: ifne 4e7
      // 0fb: goto 102
      // 0fe: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 1
      // 103: instanceof c5x
      // 106: goto 10d
      // 109: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: iload 2
      // 10e: ifeq 13b
      // 111: ifeq 130
      // 114: goto 11b
      // 117: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: aload 0
      // 11c: aload 1
      // 11d: bipush 64
      // 11f: bipush 10
      // 121: bipush 0
      // 122: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 125: iload 2
      // 126: ifne 4e7
      // 129: goto 130
      // 12c: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 1
      // 131: instanceof txr
      // 134: goto 13b
      // 137: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: iload 2
      // 13c: ifeq 169
      // 13f: ifeq 15e
      // 142: goto 149
      // 145: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: aload 0
      // 14a: aload 1
      // 14b: bipush 64
      // 14d: bipush 10
      // 14f: bipush 1
      // 150: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 153: iload 2
      // 154: ifne 4e7
      // 157: goto 15e
      // 15a: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aload 1
      // 15f: instanceof jv0
      // 162: goto 169
      // 165: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: iload 2
      // 16a: ifeq 197
      // 16d: ifeq 18c
      // 170: goto 177
      // 173: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: aload 0
      // 178: aload 1
      // 179: bipush 64
      // 17b: bipush 10
      // 17d: bipush 1
      // 17e: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 181: iload 2
      // 182: ifne 4e7
      // 185: goto 18c
      // 188: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18b: athrow
      // 18c: aload 1
      // 18d: instanceof db9
      // 190: goto 197
      // 193: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 196: athrow
      // 197: iload 2
      // 198: ifeq 1c4
      // 19b: ifeq 1b9
      // 19e: goto 1a5
      // 1a1: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: aload 1
      // 1a7: bipush 64
      // 1a9: bipush 4
      // 1aa: bipush 1
      // 1ab: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 1ae: iload 2
      // 1af: ifne 4e7
      // 1b2: goto 1b9
      // 1b5: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: aload 1
      // 1ba: instanceof dur
      // 1bd: goto 1c4
      // 1c0: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c3: athrow
      // 1c4: iload 2
      // 1c5: ifeq 1f2
      // 1c8: ifeq 1e7
      // 1cb: goto 1d2
      // 1ce: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d1: athrow
      // 1d2: aload 0
      // 1d3: aload 1
      // 1d4: bipush 64
      // 1d6: bipush 10
      // 1d8: bipush 1
      // 1d9: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 1dc: iload 2
      // 1dd: ifne 4e7
      // 1e0: goto 1e7
      // 1e3: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e6: athrow
      // 1e7: aload 1
      // 1e8: instanceof nuq
      // 1eb: goto 1f2
      // 1ee: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: iload 2
      // 1f3: ifeq 220
      // 1f6: ifeq 215
      // 1f9: goto 200
      // 1fc: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: aload 0
      // 201: aload 1
      // 202: bipush 64
      // 204: bipush 10
      // 206: bipush 1
      // 207: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 20a: iload 2
      // 20b: ifne 4e7
      // 20e: goto 215
      // 211: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 214: athrow
      // 215: aload 1
      // 216: instanceof vdu
      // 219: goto 220
      // 21c: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21f: athrow
      // 220: iload 2
      // 221: ifeq 24e
      // 224: ifeq 243
      // 227: goto 22e
      // 22a: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22d: athrow
      // 22e: aload 0
      // 22f: aload 1
      // 230: bipush 64
      // 232: bipush 10
      // 234: bipush 1
      // 235: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 238: iload 2
      // 239: ifne 4e7
      // 23c: goto 243
      // 23f: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 242: athrow
      // 243: aload 1
      // 244: instanceof nl9
      // 247: goto 24e
      // 24a: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24d: athrow
      // 24e: iload 2
      // 24f: ifeq 27c
      // 252: ifeq 271
      // 255: goto 25c
      // 258: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25b: athrow
      // 25c: aload 0
      // 25d: aload 1
      // 25e: bipush 64
      // 260: bipush 10
      // 262: bipush 1
      // 263: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 266: iload 2
      // 267: ifne 4e7
      // 26a: goto 271
      // 26d: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 270: athrow
      // 271: aload 1
      // 272: instanceof nvf
      // 275: goto 27c
      // 278: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27b: athrow
      // 27c: iload 2
      // 27d: ifeq 2aa
      // 280: ifeq 29f
      // 283: goto 28a
      // 286: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 289: athrow
      // 28a: aload 0
      // 28b: aload 1
      // 28c: bipush 64
      // 28e: bipush 20
      // 290: bipush 1
      // 291: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 294: iload 2
      // 295: ifne 4e7
      // 298: goto 29f
      // 29b: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29e: athrow
      // 29f: aload 1
      // 2a0: instanceof _f3
      // 2a3: goto 2aa
      // 2a6: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a9: athrow
      // 2aa: iload 2
      // 2ab: ifeq 2d7
      // 2ae: ifeq 2cc
      // 2b1: goto 2b8
      // 2b4: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b7: athrow
      // 2b8: aload 0
      // 2b9: aload 1
      // 2ba: bipush 80
      // 2bc: bipush 3
      // 2bd: bipush 1
      // 2be: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 2c1: iload 2
      // 2c2: ifne 4e7
      // 2c5: goto 2cc
      // 2c8: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cb: athrow
      // 2cc: aload 1
      // 2cd: instanceof w54
      // 2d0: goto 2d7
      // 2d3: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d6: athrow
      // 2d7: iload 2
      // 2d8: ifeq 304
      // 2db: ifeq 2f9
      // 2de: goto 2e5
      // 2e1: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e4: athrow
      // 2e5: aload 0
      // 2e6: aload 1
      // 2e7: bipush 80
      // 2e9: bipush 3
      // 2ea: bipush 1
      // 2eb: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 2ee: iload 2
      // 2ef: ifne 4e7
      // 2f2: goto 2f9
      // 2f5: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f8: athrow
      // 2f9: aload 1
      // 2fa: instanceof EntityMob
      // 2fd: goto 304
      // 300: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 303: athrow
      // 304: iload 2
      // 305: ifeq 331
      // 308: ifeq 326
      // 30b: goto 312
      // 30e: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 311: athrow
      // 312: aload 0
      // 313: aload 1
      // 314: bipush 64
      // 316: bipush 3
      // 317: bipush 1
      // 318: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 31b: iload 2
      // 31c: ifne 4e7
      // 31f: goto 326
      // 322: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 325: athrow
      // 326: aload 1
      // 327: instanceof ju8
      // 32a: goto 331
      // 32d: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 330: athrow
      // 331: iload 2
      // 332: ifeq 35e
      // 335: ifeq 353
      // 338: goto 33f
      // 33b: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33e: athrow
      // 33f: aload 0
      // 340: aload 1
      // 341: bipush 80
      // 343: bipush 3
      // 344: bipush 0
      // 345: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 348: iload 2
      // 349: ifne 4e7
      // 34c: goto 353
      // 34f: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 352: athrow
      // 353: aload 1
      // 354: instanceof EntityAnimal
      // 357: goto 35e
      // 35a: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35d: athrow
      // 35e: iload 2
      // 35f: ifeq 38b
      // 362: ifeq 380
      // 365: goto 36c
      // 368: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36b: athrow
      // 36c: aload 0
      // 36d: aload 1
      // 36e: bipush 80
      // 370: bipush 3
      // 371: bipush 0
      // 372: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 375: iload 2
      // 376: ifne 4e7
      // 379: goto 380
      // 37c: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37f: athrow
      // 380: aload 1
      // 381: instanceof fcs
      // 384: goto 38b
      // 387: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38a: athrow
      // 38b: iload 2
      // 38c: ifeq 3b9
      // 38f: ifeq 3ae
      // 392: goto 399
      // 395: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 398: athrow
      // 399: aload 0
      // 39a: aload 1
      // 39b: sipush 160
      // 39e: bipush 3
      // 39f: bipush 1
      // 3a0: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 3a3: iload 2
      // 3a4: ifne 4e7
      // 3a7: goto 3ae
      // 3aa: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ad: athrow
      // 3ae: aload 1
      // 3af: instanceof w55
      // 3b2: goto 3b9
      // 3b5: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b8: athrow
      // 3b9: iload 2
      // 3ba: ifeq 3e6
      // 3bd: ifeq 3db
      // 3c0: goto 3c7
      // 3c3: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c6: athrow
      // 3c7: aload 0
      // 3c8: aload 1
      // 3c9: bipush 80
      // 3cb: bipush 3
      // 3cc: bipush 1
      // 3cd: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 3d0: iload 2
      // 3d1: ifne 4e7
      // 3d4: goto 3db
      // 3d7: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3da: athrow
      // 3db: aload 1
      // 3dc: instanceof pix
      // 3df: goto 3e6
      // 3e2: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e5: athrow
      // 3e6: iload 2
      // 3e7: ifeq 415
      // 3ea: ifeq 40a
      // 3ed: goto 3f4
      // 3f0: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f3: athrow
      // 3f4: aload 0
      // 3f5: aload 1
      // 3f6: sipush 160
      // 3f9: bipush 10
      // 3fb: bipush 1
      // 3fc: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 3ff: iload 2
      // 400: ifne 4e7
      // 403: goto 40a
      // 406: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 409: athrow
      // 40a: aload 1
      // 40b: instanceof vjf
      // 40e: goto 415
      // 411: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 414: athrow
      // 415: iload 2
      // 416: ifeq 444
      // 419: ifeq 439
      // 41c: goto 423
      // 41f: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 422: athrow
      // 423: aload 0
      // 424: aload 1
      // 425: sipush 160
      // 428: bipush 20
      // 42a: bipush 1
      // 42b: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 42e: iload 2
      // 42f: ifne 4e7
      // 432: goto 439
      // 435: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 438: athrow
      // 439: aload 1
      // 43a: instanceof rdv
      // 43d: goto 444
      // 440: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 443: athrow
      // 444: iload 2
      // 445: ifeq 474
      // 448: ifeq 469
      // 44b: goto 452
      // 44e: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 451: athrow
      // 452: aload 0
      // 453: aload 1
      // 454: sipush 160
      // 457: ldc 2147483647
      // 459: nop
      // 45a: bipush 0
      // 45b: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 45e: iload 2
      // 45f: ifne 4e7
      // 462: goto 469
      // 465: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 468: athrow
      // 469: aload 1
      // 46a: instanceof h67
      // 46d: goto 474
      // 470: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 473: athrow
      // 474: iload 2
      // 475: ifeq 4a2
      // 478: ifeq 497
      // 47b: goto 482
      // 47e: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 481: athrow
      // 482: aload 0
      // 483: aload 1
      // 484: sipush 160
      // 487: bipush 3
      // 488: bipush 1
      // 489: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 48c: iload 2
      // 48d: ifne 4e7
      // 490: goto 497
      // 493: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 496: athrow
      // 497: aload 1
      // 498: instanceof uno
      // 49b: goto 4a2
      // 49e: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a1: athrow
      // 4a2: iload 2
      // 4a3: ifeq 4d1
      // 4a6: ifeq 4c6
      // 4a9: goto 4b0
      // 4ac: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4af: athrow
      // 4b0: aload 0
      // 4b1: aload 1
      // 4b2: sipush 160
      // 4b5: bipush 20
      // 4b7: bipush 1
      // 4b8: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 4bb: iload 2
      // 4bc: ifne 4e7
      // 4bf: goto 4c6
      // 4c2: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c5: athrow
      // 4c6: aload 1
      // 4c7: instanceof edl
      // 4ca: goto 4d1
      // 4cd: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d0: athrow
      // 4d1: ifeq 4e7
      // 4d4: aload 0
      // 4d5: aload 1
      // 4d6: sipush 256
      // 4d9: ldc 2147483647
      // 4db: nop
      // 4dc: bipush 0
      // 4dd: invokevirtual qpc.e6h (Li2h;IIZ)V
      // 4e0: goto 4e7
      // 4e3: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e6: athrow
      // 4e7: return
   }

   public void qyo(EntityLivingBase var1, int var2, int var3) {
      this.e6h(var1, var2, var3, false);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void e6h(EntityLivingBase var1, int var2, int var3, boolean var4) {
      long var5 = a ^ 54560312016118L;
      int var7 = OpaquePredicate.c();

      Throwable var19;
      label50: {
         label49: {
            label48: {
               try {
                  var10000 = var2;
                  if (var7 != 0) {
                     break label49;
                  }

                  if (var2 <= this.n8q) {
                     break label48;
                  }
               } catch (Throwable var17) {
                  throw a(var17);
               }

               var2 = this.n8q;
            }

            try {
               var10000 = this.ddv.rni(var1.jwu());
            } catch (Throwable var16) {
               var19 = var16;
               boolean var10001 = false;
               break label50;
            }
         }

         try {
            try {
               if (var10000 != 0) {
                  throw new IllegalStateException(a<"s">(29162, 481382538593233214L ^ var5));
               }
            } catch (Throwable var14) {
               throw a(var14);
            }

            ka6 var18 = new ka6(var1, var2, var3, var4);
            this.t8u.add(var18);
            this.ddv.yfe(var1.jwu(), var18);
            var18.k46(this.ens.rpk);
            return;
         } catch (Throwable var15) {
            var19 = var15;
            boolean var20 = false;
         }
      }

      Throwable var8 = var19;
      e1i var9 = e1i.cor(var8, a<"s">(6813, 6618203075521086029L ^ var5));
      wsc var10 = var9.i_r(a<"s">(10727, 2572302039673844017L ^ var5));
      var10._0p(a<"s">(18747, 376553906815291886L ^ var5), var2 + a<"s">(16955, 3050023859133209322L ^ var5));
      var10.h1o(a<"s">(23548, 1420854502886097710L ^ var5), new qpc$1(this, var3));
      var1.gfa(var10);
      wsc var11 = var9.i_r(a<"s">(16917, 7207427124776393410L ^ var5));
      ((ka6)this.ddv.ij8(var1.jwu())).ca2.gfa(var11);

      try {
         throw new oov(var9);
      } catch (oov var13) {
         jcm.error(a<"s">(28047, 6099486829975205212L ^ var5), var13);
      }
   }

   public void AimAssist(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 5c
      // 09: instanceof z96
      // 0c: ifeq 51
      // 0f: goto 16
      // 12: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast z96
      // 1a: astore 3
      // 1b: aload 0
      // 1c: getfield qpc.t8u Ljava/util/Set;
      // 1f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 24: astore 4
      // 26: aload 4
      // 28: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d: ifeq 51
      // 30: aload 4
      // 32: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37: checkcast ka6
      // 3a: astore 5
      // 3c: aload 5
      // 3e: iload 2
      // 3f: ifeq 5f
      // 42: aload 3
      // 43: invokevirtual ka6.kcn (Lz96;)V
      // 46: iload 2
      // 47: ifne 26
      // 4a: goto 51
      // 4d: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 0
      // 52: getfield qpc.ddv Lpni;
      // 55: aload 1
      // 56: invokevirtual EntityLivingBase.jwu ()I
      // 59: invokevirtual pni.un9 (I)Ljava/lang/Object;
      // 5c: checkcast ka6
      // 5f: astore 3
      // 60: aload 3
      // 61: iload 2
      // 62: ifeq 82
      // 65: ifnull 85
      // 68: goto 6f
      // 6b: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield qpc.t8u Ljava/util/Set;
      // 73: aload 3
      // 74: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 79: pop
      // 7a: aload 3
      // 7b: goto 82
      // 7e: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: invokevirtual ka6.grk ()V
      // 85: return
   }

   public void utu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 2
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 0
      // 08: getfield qpc.t8u Ljava/util/Set;
      // 0b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 10: astore 3
      // 11: istore 1
      // 12: aload 3
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 87
      // 1b: aload 3
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast ka6
      // 24: astore 4
      // 26: aload 4
      // 28: aload 0
      // 29: getfield qpc.ens Ldug;
      // 2c: getfield dug.rpk Ljava/util/List;
      // 2f: invokevirtual ka6.ujs (Ljava/util/List;)V
      // 32: aload 4
      // 34: getfield ka6.tdl Z
      // 37: iload 1
      // 38: ifne 88
      // 3b: iload 1
      // 3c: ifne 5f
      // 3f: goto 46
      // 42: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: ifeq 83
      // 49: goto 50
      // 4c: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: aload 4
      // 52: getfield ka6.ca2 Li2h;
      // 55: instanceof z96
      // 58: goto 5f
      // 5b: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: iload 1
      // 60: ifne 82
      // 63: ifeq 83
      // 66: goto 6d
      // 69: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 2
      // 6e: aload 4
      // 70: getfield ka6.ca2 Li2h;
      // 73: checkcast z96
      // 76: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7b: goto 82
      // 7e: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: pop
      // 83: iload 1
      // 84: ifeq 12
      // 87: bipush 0
      // 88: istore 3
      // 89: iload 3
      // 8a: aload 2
      // 8b: invokeinterface java/util/List.size ()I 1
      // 90: if_icmpge f2
      // 93: aload 2
      // 94: iload 3
      // 95: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 9a: checkcast z96
      // 9d: astore 4
      // 9f: aload 0
      // a0: getfield qpc.t8u Ljava/util/Set;
      // a3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // a8: astore 5
      // aa: aload 5
      // ac: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b1: ifeq eb
      // b4: aload 5
      // b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // bb: checkcast ka6
      // be: astore 6
      // c0: aload 6
      // c2: iload 1
      // c3: ifne e2
      // c6: getfield ka6.ca2 Li2h;
      // c9: iload 1
      // ca: ifne 9a
      // cd: goto d4
      // d0: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d3: athrow
      // d4: aload 4
      // d6: if_acmpeq e7
      // d9: aload 6
      // db: goto e2
      // de: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e1: athrow
      // e2: aload 4
      // e4: invokevirtual ka6.i1g (Lz96;)V
      // e7: iload 1
      // e8: ifeq aa
      // eb: iinc 3 1
      // ee: iload 1
      // ef: ifeq 89
      // f2: return
   }

   public void khp(z96 param1) {
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
      // 05: getfield qpc.t8u Ljava/util/Set;
      // 08: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 3
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 5e
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast ka6
      // 20: astore 4
      // 22: aload 4
      // 24: iload 2
      // 25: ifne 56
      // 28: getfield ka6.ca2 Li2h;
      // 2b: aload 1
      // 2c: if_acmpne 4d
      // 2f: goto 36
      // 32: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 4
      // 38: aload 0
      // 39: getfield qpc.ens Ldug;
      // 3c: getfield dug.rpk Ljava/util/List;
      // 3f: invokevirtual ka6.k46 (Ljava/util/List;)V
      // 42: iload 2
      // 43: ifeq 5a
      // 46: goto 4d
      // 49: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 4
      // 4f: goto 56
      // 52: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 1
      // 57: invokevirtual ka6.i1g (Lz96;)V
      // 5a: iload 2
      // 5b: ifeq 0e
      // 5e: return
   }

   public void si9(EntityLivingBase var1, mz2 var2) {
      int var3 = OpaquePredicate.c();
      ka6 var4 = (ka6)this.ddv.ij8(var1.jwu());

      ka6 var10000;
      label20: {
         try {
            var10000 = var4;
            if (var3 != 0) {
               break label20;
            }

            if (var4 == null) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var4;
      }

      var10000.geq(var2);
   }

   public void wru(EntityLivingBase var1, mz2 var2) {
      int var3 = OpaquePredicate.c();
      ka6 var4 = (ka6)this.ddv.ij8(var1.jwu());

      ka6 var10000;
      label20: {
         try {
            var10000 = var4;
            if (var3 != 0) {
               break label20;
            }

            if (var4 == null) {
               return;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var4;
      }

      var10000.v72(var2);
   }

   public void bby(z96 var1) {
      int var2 = OpaquePredicate.b();

      for (ka6 var4 : this.t8u) {
         var4.hyb(var1);
         if (var2 == 0) {
            break;
         }
      }
   }

   public void _46(z96 param1, tts param2) {
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
      // 05: getfield qpc.t8u Ljava/util/Set;
      // 08: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 4
      // 0f: aload 4
      // 11: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16: ifeq 85
      // 19: aload 4
      // 1b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 20: checkcast ka6
      // 23: astore 5
      // 25: aload 5
      // 27: getfield ka6.ca2 Li2h;
      // 2a: iload 3
      // 2b: ifeq 45
      // 2e: aload 1
      // 2f: if_acmpeq 81
      // 32: goto 39
      // 35: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 5
      // 3b: getfield ka6.ca2 Li2h;
      // 3e: goto 45
      // 41: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: getfield EntityLivingBase.jw4 I
      // 48: aload 2
      // 49: getfield tts.nzx I
      // 4c: iload 3
      // 4d: ifeq 78
      // 50: if_icmpne 81
      // 53: goto 5a
      // 56: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 5
      // 5c: iload 3
      // 5d: ifeq 7d
      // 60: goto 67
      // 63: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: getfield ka6.ca2 Li2h;
      // 6a: getfield EntityLivingBase.e6l I
      // 6d: aload 2
      // 6e: getfield tts.yxl I
      // 71: goto 78
      // 74: invokestatic qpc.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: if_icmpne 81
      // 7b: aload 5
      // 7d: aload 1
      // 7e: invokevirtual ka6.i1g (Lz96;)V
      // 81: iload 3
      // 82: ifne 0f
      // 85: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7834800789870806366L, -6362067207249925371L, MethodHandles.lookup().lookupClass()).a(11568796413710L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 114949971683129L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u0085q\u0004I\u0018°¥®h\\\u0019p¢§ù{óîuÈÝö°wÆ\u0081à?·¯P\u0092P\u0097+b¹à\u001aÚc>\u008eÜÇRþ\u008ajß\u0011|0\n\u000f¶´ë1Â\u008aÄúD\u0005Y\u0086¸åêÿu£\u0084\u009f~R\u0005=Ë±¼Ìc\u001cya\u0097^,É\"#k$ó\u0011KÑm2ÆHõ\u009a-ã¨²\u0093J\u0084\n(\u001b\u0003)OL*\u0098ûåHqüÌ´J¥ìíÒÔïú\u00ad\u0091Q\u009cÜ\tªó¯\u0087Â\u008d\u0080\u000f}¹\u0016ï\u0010©Ò%)ò3¦n\u0088²6©ú\u000e\t³ (de\u0091\u0090\u009b\\\u0083\u0010g\tjSuD!~\u008c¬u\u0015»ø\u0082\u009bi&Å\u0007\u0090KD0A*B²5\u0015\u0019[øP\u0085ÃgX`Ó&äÝuôTÜ8¢Á¦\u009bk\u00ad/\u0006õ5- $\u007f ì\u0003©d\u008fïø[¦";
      int var8 = "\u0085q\u0004I\u0018°¥®h\\\u0019p¢§ù{óîuÈÝö°wÆ\u0081à?·¯P\u0092P\u0097+b¹à\u001aÚc>\u008eÜÇRþ\u008ajß\u0011|0\n\u000f¶´ë1Â\u008aÄúD\u0005Y\u0086¸åêÿu£\u0084\u009f~R\u0005=Ë±¼Ìc\u001cya\u0097^,É\"#k$ó\u0011KÑm2ÆHõ\u009a-ã¨²\u0093J\u0084\n(\u001b\u0003)OL*\u0098ûåHqüÌ´J¥ìíÒÔïú\u00ad\u0091Q\u009cÜ\tªó¯\u0087Â\u008d\u0080\u000f}¹\u0016ï\u0010©Ò%)ò3¦n\u0088²6©ú\u000e\t³ (de\u0091\u0090\u009b\\\u0083\u0010g\tjSuD!~\u008c¬u\u0015»ø\u0082\u009bi&Å\u0007\u0090KD0A*B²5\u0015\u0019[øP\u0085ÃgX`Ó&äÝuôTÜ8¢Á¦\u009bk\u00ad/\u0006õ5- $\u007f ì\u0003©d\u008fïø[¦"
         .length();
      char var5 = ' ';
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
                     c = new String[8];
                     jcm = LogManager.getLogger();
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

                  var6 = "ö%\u0006\u0095ê\u009b¬U\u008c¾\u001a\u009df\u001a õ\u001c91\u008cÈ\u0093[OÖk\u0081\u001c3íÝQ\u0000)\u00950\bùÐÖ\u0011ü\u008f\u0007b\u008aÕ^\u0016þ,w\u0086ý\u0094a w{\u0090ZÅÁ=ÉªOz\u007f$\u0003\u0006Æ\u008f\u0018H\u008eØC\u0092y\u000b^Ô\u009f±\u0099\u0094\u009c";
                  var8 = "ö%\u0006\u0095ê\u009b¬U\u008c¾\u001a\u009df\u001a õ\u001c91\u008cÈ\u0093[OÖk\u0081\u001c3íÝQ\u0000)\u00950\bùÐÖ\u0011ü\u008f\u0007b\u008aÕ^\u0016þ,w\u0086ý\u0094a w{\u0090ZÅÁ=ÉªOz\u007f$\u0003\u0006Æ\u008f\u0018H\u008eØC\u0092y\u000b^Ô\u009f±\u0099\u0094\u009c"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19769;
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
            throw new RuntimeException("qpc", var10);
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
         throw new RuntimeException("qpc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
