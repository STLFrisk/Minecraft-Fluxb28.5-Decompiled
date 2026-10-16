import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public enum d3x {
   public static final d3x jg8;
   public Map dc7 = new HashMap();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void gp3(Minecraft param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic d3x.a J
      // 003: ldc2_w 126374909708791
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic hzu.dp2 ()V
      // 00b: new eka
      // 00e: dup
      // 00f: aload 1
      // 010: invokespecial eka.<init> (Lc05;)V
      // 013: astore 5
      // 015: aload 5
      // 017: invokevirtual eka._0s ()I
      // 01a: i2d
      // 01b: aload 5
      // 01d: invokevirtual eka._0s ()I
      // 020: i2d
      // 021: ldc2_w 2.0
      // 024: invokestatic java/lang/Math.pow (DD)D
      // 027: ddiv
      // 028: dstore 6
      // 02a: invokestatic OpaquePredicate.b ()I
      // 02d: dload 6
      // 02f: dload 6
      // 031: dload 6
      // 033: invokestatic hzu.bvy (DDD)V
      // 036: istore 4
      // 038: aload 0
      // 039: getfield d3x.dc7 Ljava/util/Map;
      // 03c: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 041: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 046: astore 8
      // 048: aload 8
      // 04a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 04f: ifeq cca
      // 052: aload 8
      // 054: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 059: checkcast EntityLivingBase
      // 05c: astore 9
      // 05e: aload 9
      // 060: checkcast ha9
      // 063: astore 11
      // 065: aload 0
      // 066: getfield d3x.dc7 Ljava/util/Map;
      // 069: aload 9
      // 06b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 070: checkcast [D
      // 073: astore 12
      // 075: bipush 3
      // 076: newarray 7
      // 078: dup
      // 079: bipush 0
      // 07a: aload 12
      // 07c: bipush 4
      // 07d: daload
      // 07e: dastore
      // 07f: dup
      // 080: bipush 1
      // 081: aload 12
      // 083: bipush 5
      // 084: daload
      // 085: dastore
      // 086: dup
      // 087: bipush 2
      // 088: aload 12
      // 08a: bipush 6
      // 08c: daload
      // 08d: dastore
      // 08e: astore 13
      // 090: bipush 3
      // 091: newarray 7
      // 093: dup
      // 094: bipush 0
      // 095: aload 12
      // 097: bipush 7
      // 099: daload
      // 09a: dastore
      // 09b: dup
      // 09c: bipush 1
      // 09d: aload 12
      // 09f: bipush 8
      // 0a1: daload
      // 0a2: dastore
      // 0a3: dup
      // 0a4: bipush 2
      // 0a5: aload 12
      // 0a7: bipush 9
      // 0a9: daload
      // 0aa: dastore
      // 0ab: astore 14
      // 0ad: bipush 3
      // 0ae: newarray 7
      // 0b0: dup
      // 0b1: bipush 0
      // 0b2: aload 12
      // 0b4: bipush 10
      // 0b6: daload
      // 0b7: dastore
      // 0b8: dup
      // 0b9: bipush 1
      // 0ba: aload 12
      // 0bc: bipush 11
      // 0be: daload
      // 0bf: dastore
      // 0c0: dup
      // 0c1: bipush 2
      // 0c2: aload 12
      // 0c4: bipush 12
      // 0c6: daload
      // 0c7: dastore
      // 0c8: astore 15
      // 0ca: bipush 3
      // 0cb: newarray 7
      // 0cd: dup
      // 0ce: bipush 0
      // 0cf: aload 12
      // 0d1: bipush 13
      // 0d3: daload
      // 0d4: dastore
      // 0d5: dup
      // 0d6: bipush 1
      // 0d7: aload 12
      // 0d9: bipush 14
      // 0db: daload
      // 0dc: dastore
      // 0dd: dup
      // 0de: bipush 2
      // 0df: aload 12
      // 0e1: bipush 15
      // 0e3: daload
      // 0e4: dastore
      // 0e5: astore 16
      // 0e7: bipush 3
      // 0e8: newarray 7
      // 0ea: dup
      // 0eb: bipush 0
      // 0ec: aload 12
      // 0ee: bipush 16
      // 0f0: daload
      // 0f1: dastore
      // 0f2: dup
      // 0f3: bipush 1
      // 0f4: aload 12
      // 0f6: bipush 17
      // 0f8: daload
      // 0f9: dastore
      // 0fa: dup
      // 0fb: bipush 2
      // 0fc: aload 12
      // 0fe: bipush 18
      // 100: daload
      // 101: dastore
      // 102: astore 17
      // 104: bipush 3
      // 105: newarray 7
      // 107: dup
      // 108: bipush 0
      // 109: aload 12
      // 10b: bipush 19
      // 10d: daload
      // 10e: dastore
      // 10f: dup
      // 110: bipush 1
      // 111: aload 12
      // 113: bipush 20
      // 115: daload
      // 116: dastore
      // 117: dup
      // 118: bipush 2
      // 119: aload 12
      // 11b: bipush 21
      // 11d: daload
      // 11e: dastore
      // 11f: astore 18
      // 121: bipush 3
      // 122: newarray 7
      // 124: dup
      // 125: bipush 0
      // 126: aload 12
      // 128: bipush 22
      // 12a: daload
      // 12b: dastore
      // 12c: dup
      // 12d: bipush 1
      // 12e: aload 12
      // 130: bipush 23
      // 132: daload
      // 133: dastore
      // 134: dup
      // 135: bipush 2
      // 136: aload 12
      // 138: bipush 24
      // 13a: daload
      // 13b: dastore
      // 13c: astore 19
      // 13e: iload 4
      // 140: ifeq ce3
      // 143: aload 12
      // 145: bipush 3
      // 146: daload
      // 147: dconst_0
      // 148: dcmpl
      // 149: iload 4
      // 14b: ifeq 16c
      // 14e: goto 155
      // 151: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 154: athrow
      // 155: ifle 307
      // 158: goto 15f
      // 15b: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15e: athrow
      // 15f: aload 12
      // 161: bipush 3
      // 162: daload
      // 163: dconst_1
      // 164: dcmpg
      // 165: goto 16c
      // 168: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16b: athrow
      // 16c: iload 4
      // 16e: ifeq 188
      // 171: ifgt 307
      // 174: goto 17b
      // 177: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17a: athrow
      // 17b: aload 13
      // 17d: bipush 2
      // 17e: daload
      // 17f: dconst_0
      // 180: dcmpl
      // 181: goto 188
      // 184: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 187: athrow
      // 188: iload 4
      // 18a: ifeq 1a4
      // 18d: ifle 307
      // 190: goto 197
      // 193: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 196: athrow
      // 197: aload 13
      // 199: bipush 2
      // 19a: daload
      // 19b: dconst_1
      // 19c: dcmpg
      // 19d: goto 1a4
      // 1a0: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a3: athrow
      // 1a4: iload 4
      // 1a6: ifeq 1c0
      // 1a9: ifgt 307
      // 1ac: goto 1b3
      // 1af: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b2: athrow
      // 1b3: aload 14
      // 1b5: bipush 2
      // 1b6: daload
      // 1b7: dconst_0
      // 1b8: dcmpl
      // 1b9: goto 1c0
      // 1bc: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1bf: athrow
      // 1c0: iload 4
      // 1c2: ifeq 1dc
      // 1c5: ifle 307
      // 1c8: goto 1cf
      // 1cb: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ce: athrow
      // 1cf: aload 14
      // 1d1: bipush 2
      // 1d2: daload
      // 1d3: dconst_1
      // 1d4: dcmpg
      // 1d5: goto 1dc
      // 1d8: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1db: athrow
      // 1dc: iload 4
      // 1de: ifeq 1f8
      // 1e1: ifgt 307
      // 1e4: goto 1eb
      // 1e7: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ea: athrow
      // 1eb: aload 15
      // 1ed: bipush 2
      // 1ee: daload
      // 1ef: dconst_0
      // 1f0: dcmpl
      // 1f1: goto 1f8
      // 1f4: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f7: athrow
      // 1f8: iload 4
      // 1fa: ifeq 214
      // 1fd: ifle 307
      // 200: goto 207
      // 203: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 206: athrow
      // 207: aload 15
      // 209: bipush 2
      // 20a: daload
      // 20b: dconst_1
      // 20c: dcmpg
      // 20d: goto 214
      // 210: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 213: athrow
      // 214: iload 4
      // 216: ifeq 230
      // 219: ifgt 307
      // 21c: goto 223
      // 21f: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 222: athrow
      // 223: aload 16
      // 225: bipush 2
      // 226: daload
      // 227: dconst_0
      // 228: dcmpl
      // 229: goto 230
      // 22c: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22f: athrow
      // 230: iload 4
      // 232: ifeq 24c
      // 235: ifle 307
      // 238: goto 23f
      // 23b: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23e: athrow
      // 23f: aload 16
      // 241: bipush 2
      // 242: daload
      // 243: dconst_1
      // 244: dcmpg
      // 245: goto 24c
      // 248: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24b: athrow
      // 24c: iload 4
      // 24e: ifeq 268
      // 251: ifgt 307
      // 254: goto 25b
      // 257: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25a: athrow
      // 25b: aload 17
      // 25d: bipush 2
      // 25e: daload
      // 25f: dconst_0
      // 260: dcmpl
      // 261: goto 268
      // 264: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 267: athrow
      // 268: iload 4
      // 26a: ifeq 284
      // 26d: ifle 307
      // 270: goto 277
      // 273: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 276: athrow
      // 277: aload 17
      // 279: bipush 2
      // 27a: daload
      // 27b: dconst_1
      // 27c: dcmpg
      // 27d: goto 284
      // 280: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 283: athrow
      // 284: iload 4
      // 286: ifeq 2a0
      // 289: ifgt 307
      // 28c: goto 293
      // 28f: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 292: athrow
      // 293: aload 18
      // 295: bipush 2
      // 296: daload
      // 297: dconst_0
      // 298: dcmpl
      // 299: goto 2a0
      // 29c: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29f: athrow
      // 2a0: iload 4
      // 2a2: ifeq 2bc
      // 2a5: ifle 307
      // 2a8: goto 2af
      // 2ab: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ae: athrow
      // 2af: aload 18
      // 2b1: bipush 2
      // 2b2: daload
      // 2b3: dconst_1
      // 2b4: dcmpg
      // 2b5: goto 2bc
      // 2b8: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2bb: athrow
      // 2bc: iload 4
      // 2be: ifeq 2d8
      // 2c1: ifgt 307
      // 2c4: goto 2cb
      // 2c7: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ca: athrow
      // 2cb: aload 19
      // 2cd: bipush 2
      // 2ce: daload
      // 2cf: dconst_0
      // 2d0: dcmpl
      // 2d1: goto 2d8
      // 2d4: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d7: athrow
      // 2d8: iload 4
      // 2da: ifeq 2f4
      // 2dd: ifle 307
      // 2e0: goto 2e7
      // 2e3: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e6: athrow
      // 2e7: aload 19
      // 2e9: bipush 2
      // 2ea: daload
      // 2eb: dconst_1
      // 2ec: dcmpg
      // 2ed: goto 2f4
      // 2f0: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f3: athrow
      // 2f4: iload 4
      // 2f6: ifeq 304
      // 2f9: ifgt 307
      // 2fc: goto 303
      // 2ff: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 302: athrow
      // 303: bipush 1
      // 304: goto 308
      // 307: bipush 0
      // 308: istore 10
      // 30a: aload 1
      // 30b: getfield Minecraft.vg8 Ll86;
      // 30e: aload 11
      // 310: invokevirtual EntityPlayerSP.tm6 (Li2h;)F
      // 313: f2d
      // 314: ldc2_w 2.5
      // 317: dcmpg
      // 318: iload 4
      // 31a: ifeq 348
      // 31d: ifge 346
      // 320: goto 327
      // 323: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 326: athrow
      // 327: aload 18
      // 329: bipush 1
      // 32a: daload
      // 32b: dconst_0
      // 32c: dcmpg
      // 32d: iload 4
      // 32f: ifeq 348
      // 332: goto 339
      // 335: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 338: athrow
      // 339: ifge 346
      // 33c: goto 343
      // 33f: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 342: athrow
      // 343: bipush 0
      // 344: istore 10
      // 346: iload 10
      // 348: iload 4
      // 34a: ifeq 360
      // 34d: ifne 35a
      // 350: goto 357
      // 353: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 356: athrow
      // 357: goto 048
      // 35a: getstatic y3e.hrx Lcn7;
      // 35d: invokevirtual BooleanSetting.g7m ()Z
      // 360: iload 4
      // 362: ifeq 3a1
      // 365: ifne 38d
      // 368: goto 36f
      // 36b: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 36e: athrow
      // 36f: aload 11
      // 371: invokevirtual ha9.h5u ()Z
      // 374: iload 4
      // 376: ifeq 3a1
      // 379: goto 380
      // 37c: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37f: athrow
      // 380: ifeq 38d
      // 383: goto 38a
      // 386: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 389: athrow
      // 38a: goto 048
      // 38d: invokestatic hzu.dp2 ()V
      // 390: iload 4
      // 392: ifeq cc5
      // 395: aload 11
      // 397: instanceof ha9
      // 39a: goto 3a1
      // 39d: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a0: athrow
      // 3a1: ifeq cbb
      // 3a4: aload 11
      // 3a6: instanceof EntityPlayerSP
      // 3a9: iload 4
      // 3ab: ifeq 3db
      // 3ae: goto 3b5
      // 3b1: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b4: athrow
      // 3b5: ifne cbb
      // 3b8: goto 3bf
      // 3bb: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3be: athrow
      // 3bf: sipush 3042
      // 3c2: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 3c5: sipush 3553
      // 3c8: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 3cb: aload 0
      // 3cc: dconst_0
      // 3cd: dconst_0
      // 3ce: dconst_0
      // 3cf: dconst_0
      // 3d0: aload 0
      // 3d1: bipush 0
      // 3d2: bipush 0
      // 3d3: invokevirtual d3x.nt4 (II)I
      // 3d6: invokevirtual d3x.frl (DDDDI)V
      // 3d9: bipush 8
      // 3db: newarray 7
      // 3dd: dup
      // 3de: bipush 0
      // 3df: aload 12
      // 3e1: bipush 0
      // 3e2: daload
      // 3e3: dastore
      // 3e4: dup
      // 3e5: bipush 1
      // 3e6: aload 13
      // 3e8: bipush 0
      // 3e9: daload
      // 3ea: dastore
      // 3eb: dup
      // 3ec: bipush 2
      // 3ed: aload 14
      // 3ef: bipush 0
      // 3f0: daload
      // 3f1: dastore
      // 3f2: dup
      // 3f3: bipush 3
      // 3f4: aload 15
      // 3f6: bipush 0
      // 3f7: daload
      // 3f8: dastore
      // 3f9: dup
      // 3fa: bipush 4
      // 3fb: aload 16
      // 3fd: bipush 0
      // 3fe: daload
      // 3ff: dastore
      // 400: dup
      // 401: bipush 5
      // 402: aload 17
      // 404: bipush 0
      // 405: daload
      // 406: dastore
      // 407: dup
      // 408: bipush 6
      // 40a: aload 18
      // 40c: bipush 0
      // 40d: daload
      // 40e: dastore
      // 40f: dup
      // 410: bipush 7
      // 412: aload 19
      // 414: bipush 0
      // 415: daload
      // 416: dastore
      // 417: astore 20
      // 419: bipush 8
      // 41b: newarray 7
      // 41d: dup
      // 41e: bipush 0
      // 41f: aload 12
      // 421: bipush 1
      // 422: daload
      // 423: dastore
      // 424: dup
      // 425: bipush 1
      // 426: aload 13
      // 428: bipush 1
      // 429: daload
      // 42a: dastore
      // 42b: dup
      // 42c: bipush 2
      // 42d: aload 14
      // 42f: bipush 1
      // 430: daload
      // 431: dastore
      // 432: dup
      // 433: bipush 3
      // 434: aload 15
      // 436: bipush 1
      // 437: daload
      // 438: dastore
      // 439: dup
      // 43a: bipush 4
      // 43b: aload 16
      // 43d: bipush 1
      // 43e: daload
      // 43f: dastore
      // 440: dup
      // 441: bipush 5
      // 442: aload 17
      // 444: bipush 1
      // 445: daload
      // 446: dastore
      // 447: dup
      // 448: bipush 6
      // 44a: aload 18
      // 44c: bipush 1
      // 44d: daload
      // 44e: dastore
      // 44f: dup
      // 450: bipush 7
      // 452: aload 19
      // 454: bipush 1
      // 455: daload
      // 456: dastore
      // 457: astore 21
      // 459: aload 12
      // 45b: bipush 0
      // 45c: daload
      // 45d: dstore 22
      // 45f: aload 12
      // 461: bipush 1
      // 462: daload
      // 463: dstore 24
      // 465: aload 13
      // 467: bipush 0
      // 468: daload
      // 469: dstore 26
      // 46b: aload 13
      // 46d: bipush 1
      // 46e: daload
      // 46f: dstore 28
      // 471: aload 20
      // 473: astore 30
      // 475: aload 30
      // 477: arraylength
      // 478: istore 31
      // 47a: bipush 0
      // 47b: istore 32
      // 47d: iload 32
      // 47f: iload 31
      // 481: if_icmpge 4ba
      // 484: aload 30
      // 486: iload 32
      // 488: daload
      // 489: dstore 33
      // 48b: dload 33
      // 48d: iload 4
      // 48f: ifeq 4b0
      // 492: dload 22
      // 494: dcmpg
      // 495: iload 4
      // 497: ifeq 4c4
      // 49a: goto 4a1
      // 49d: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a0: athrow
      // 4a1: iflt 4ae
      // 4a4: goto 4ab
      // 4a7: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4aa: athrow
      // 4ab: goto 4b2
      // 4ae: dload 33
      // 4b0: dstore 22
      // 4b2: iinc 32 1
      // 4b5: iload 4
      // 4b7: ifne 47d
      // 4ba: aload 20
      // 4bc: astore 30
      // 4be: aload 30
      // 4c0: arraylength
      // 4c1: istore 31
      // 4c3: bipush 0
      // 4c4: istore 32
      // 4c6: iload 32
      // 4c8: iload 31
      // 4ca: if_icmpge 503
      // 4cd: aload 30
      // 4cf: iload 32
      // 4d1: daload
      // 4d2: dstore 33
      // 4d4: dload 33
      // 4d6: iload 4
      // 4d8: ifeq 4f9
      // 4db: dload 26
      // 4dd: dcmpl
      // 4de: iload 4
      // 4e0: ifeq 50d
      // 4e3: goto 4ea
      // 4e6: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e9: athrow
      // 4ea: ifgt 4f7
      // 4ed: goto 4f4
      // 4f0: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4f3: athrow
      // 4f4: goto 4fb
      // 4f7: dload 33
      // 4f9: dstore 26
      // 4fb: iinc 32 1
      // 4fe: iload 4
      // 500: ifne 4c6
      // 503: aload 21
      // 505: astore 30
      // 507: aload 30
      // 509: arraylength
      // 50a: istore 31
      // 50c: bipush 0
      // 50d: istore 32
      // 50f: iload 32
      // 511: iload 31
      // 513: if_icmpge 54c
      // 516: aload 30
      // 518: iload 32
      // 51a: daload
      // 51b: dstore 33
      // 51d: dload 33
      // 51f: iload 4
      // 521: ifeq 542
      // 524: dload 24
      // 526: dcmpg
      // 527: iload 4
      // 529: ifeq 556
      // 52c: goto 533
      // 52f: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 532: athrow
      // 533: iflt 540
      // 536: goto 53d
      // 539: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53c: athrow
      // 53d: goto 544
      // 540: dload 33
      // 542: dstore 24
      // 544: iinc 32 1
      // 547: iload 4
      // 549: ifne 50f
      // 54c: aload 21
      // 54e: astore 30
      // 550: aload 30
      // 552: arraylength
      // 553: istore 31
      // 555: bipush 0
      // 556: istore 32
      // 558: iload 32
      // 55a: iload 31
      // 55c: if_icmpge 595
      // 55f: aload 30
      // 561: iload 32
      // 563: daload
      // 564: dstore 33
      // 566: dload 33
      // 568: iload 4
      // 56a: ifeq 58b
      // 56d: dload 28
      // 56f: dcmpl
      // 570: iload 4
      // 572: ifeq 59b
      // 575: goto 57c
      // 578: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57b: athrow
      // 57c: ifgt 589
      // 57f: goto 586
      // 582: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 585: athrow
      // 586: goto 58d
      // 589: dload 33
      // 58b: dstore 28
      // 58d: iinc 32 1
      // 590: iload 4
      // 592: ifne 558
      // 595: getstatic z7e.a2_ Lz7e;
      // 598: getfield z7e.k0y I
      // 59b: istore 30
      // 59d: aload 11
      // 59f: invokevirtual ha9.xyw ()Lekw;
      // 5a2: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 5a7: astore 31
      // 5a9: bipush 0
      // 5aa: istore 32
      // 5ac: iload 32
      // 5ae: aload 31
      // 5b0: invokevirtual java/lang/String.length ()I
      // 5b3: if_icmpge 668
      // 5b6: aload 31
      // 5b8: iload 32
      // 5ba: invokevirtual java/lang/String.charAt (I)C
      // 5bd: sipush 167
      // 5c0: iload 4
      // 5c2: ifeq 5b3
      // 5c5: iload 4
      // 5c7: ifeq 5f0
      // 5ca: if_icmpne 660
      // 5cd: goto 5d4
      // 5d0: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5d3: athrow
      // 5d4: iload 32
      // 5d6: bipush 1
      // 5d7: iadd
      // 5d8: iload 4
      // 5da: ifeq 606
      // 5dd: goto 5e4
      // 5e0: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5e3: athrow
      // 5e4: aload 31
      // 5e6: invokevirtual java/lang/String.length ()I
      // 5e9: goto 5f0
      // 5ec: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5ef: athrow
      // 5f0: if_icmpge 660
      // 5f3: aload 31
      // 5f5: iload 32
      // 5f7: bipush 1
      // 5f8: iadd
      // 5f9: invokevirtual java/lang/String.charAt (I)C
      // 5fc: invokestatic java/lang/Character.toLowerCase (C)C
      // 5ff: goto 606
      // 602: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 605: athrow
      // 606: istore 33
      // 608: sipush 17606
      // 60b: ldc2_w 1779234855928739073
      // 60e: lload 2
      // 60f: lxor
      // 610: invokedynamic r (IJ)Ljava/lang/String; bsm=d3x.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 615: nop
      // 616: iload 33
      // 618: invokevirtual java/lang/String.indexOf (I)I
      // 61b: istore 34
      // 61d: iload 4
      // 61f: ifeq 663
      // 622: iload 34
      // 624: bipush 16
      // 626: if_icmpge 660
      // 629: goto 630
      // 62c: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 62f: athrow
      // 630: new java/awt/Color
      // 633: dup
      // 634: aload 1
      // 635: getfield Minecraft.tx1 Lowt;
      // 638: getfield owt.fgp [I
      // 63b: iload 34
      // 63d: iaload
      // 63e: invokespecial java/awt/Color.<init> (I)V
      // 641: astore 35
      // 643: aload 0
      // 644: aload 35
      // 646: invokevirtual java/awt/Color.getRed ()I
      // 649: aload 35
      // 64b: invokevirtual java/awt/Color.getGreen ()I
      // 64e: aload 35
      // 650: invokevirtual java/awt/Color.getBlue ()I
      // 653: sipush 255
      // 656: invokevirtual d3x.jup (IIII)I
      // 659: istore 30
      // 65b: goto 660
      // 65e: astore 35
      // 660: iinc 32 1
      // 663: iload 4
      // 665: ifne 5ac
      // 668: aload 11
      // 66a: iload 4
      // 66c: ifeq 703
      // 66f: invokevirtual ha9.h5u ()Z
      // 672: ifeq 684
      // 675: goto 67c
      // 678: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 67b: athrow
      // 67c: getstatic z7e.jqn Lz7e;
      // 67f: getfield z7e.k0y I
      // 682: istore 30
      // 684: aload 0
      // 685: dload 22
      // 687: ldc2_w 0.5
      // 68a: dadd
      // 68b: dload 24
      // 68d: ldc2_w 0.5
      // 690: dadd
      // 691: dload 26
      // 693: ldc2_w 0.5
      // 696: dsub
      // 697: dload 28
      // 699: ldc2_w 0.5
      // 69c: dsub
      // 69d: dconst_1
      // 69e: aload 0
      // 69f: bipush 0
      // 6a0: bipush 0
      // 6a1: bipush 0
      // 6a2: bipush 0
      // 6a3: invokevirtual d3x.jup (IIII)I
      // 6a6: iload 30
      // 6a8: invokevirtual d3x.wof (DDDDDII)V
      // 6ab: aload 0
      // 6ac: dload 22
      // 6ae: ldc2_w 0.5
      // 6b1: dsub
      // 6b2: dload 24
      // 6b4: ldc2_w 0.5
      // 6b7: dsub
      // 6b8: dload 26
      // 6ba: ldc2_w 0.5
      // 6bd: dadd
      // 6be: dload 28
      // 6c0: ldc2_w 0.5
      // 6c3: dadd
      // 6c4: dconst_1
      // 6c5: aload 0
      // 6c6: bipush 0
      // 6c7: bipush 0
      // 6c8: invokevirtual d3x.nt4 (II)I
      // 6cb: aload 0
      // 6cc: bipush 0
      // 6cd: sipush 150
      // 6d0: invokevirtual d3x.nt4 (II)I
      // 6d3: invokevirtual d3x.wof (DDDDDII)V
      // 6d6: aload 0
      // 6d7: dload 22
      // 6d9: ldc2_w 1.5
      // 6dc: dadd
      // 6dd: dload 24
      // 6df: ldc2_w 1.5
      // 6e2: dadd
      // 6e3: dload 26
      // 6e5: ldc2_w 1.5
      // 6e8: dsub
      // 6e9: dload 28
      // 6eb: ldc2_w 1.5
      // 6ee: dsub
      // 6ef: dconst_1
      // 6f0: aload 0
      // 6f1: bipush 0
      // 6f2: bipush 0
      // 6f3: invokevirtual d3x.nt4 (II)I
      // 6f6: aload 0
      // 6f7: bipush 0
      // 6f8: sipush 150
      // 6fb: invokevirtual d3x.nt4 (II)I
      // 6fe: invokevirtual d3x.wof (DDDDDII)V
      // 701: aload 11
      // 703: invokevirtual ha9.i55 ()F
      // 706: fstore 32
      // 708: bipush 3
      // 709: newarray 6
      // 70b: dup
      // 70c: bipush 0
      // 70d: fconst_0
      // 70e: fastore
      // 70f: dup
      // 710: bipush 1
      // 711: ldc 0.5
      // 713: nop
      // 714: fastore
      // 715: dup
      // 716: bipush 2
      // 717: fconst_1
      // 718: fastore
      // 719: astore 33
      // 71b: bipush 3
      // 71c: anewarray 202
      // 71f: dup
      // 720: bipush 0
      // 721: getstatic java/awt/Color.RED Ljava/awt/Color;
      // 724: aastore
      // 725: dup
      // 726: bipush 1
      // 727: getstatic java/awt/Color.YELLOW Ljava/awt/Color;
      // 72a: aastore
      // 72b: dup
      // 72c: bipush 2
      // 72d: getstatic java/awt/Color.GREEN Ljava/awt/Color;
      // 730: aastore
      // 731: astore 34
      // 733: fload 32
      // 735: aload 11
      // 737: invokevirtual ha9.axb ()F
      // 73a: fdiv
      // 73b: fstore 35
      // 73d: fload 32
      // 73f: fconst_0
      // 740: fcmpl
      // 741: iflt 758
      // 744: aload 0
      // 745: aload 33
      // 747: aload 34
      // 749: fload 35
      // 74b: invokevirtual d3x._xp ([F[Ljava/awt/Color;F)Ljava/awt/Color;
      // 74e: invokevirtual java/awt/Color.brighter ()Ljava/awt/Color;
      // 751: goto 75b
      // 754: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 757: athrow
      // 758: getstatic java/awt/Color.RED Ljava/awt/Color;
      // 75b: astore 36
      // 75d: dload 24
      // 75f: dload 28
      // 761: dsub
      // 762: ldc2_w 0.5
      // 765: dadd
      // 766: dstore 37
      // 768: dload 28
      // 76a: dload 37
      // 76c: fload 35
      // 76e: f2d
      // 76f: dmul
      // 770: dadd
      // 771: dstore 39
      // 773: dload 28
      // 775: ldc2_w 5.0
      // 778: dsub
      // 779: dload 37
      // 77b: fload 35
      // 77d: f2d
      // 77e: dmul
      // 77f: dadd
      // 780: dstore 41
      // 782: aload 0
      // 783: dload 22
      // 785: ldc2_w 6.5
      // 788: dsub
      // 789: dload 24
      // 78b: ldc2_w 0.5
      // 78e: dsub
      // 78f: dload 22
      // 791: ldc2_w 2.5
      // 794: dsub
      // 795: dload 28
      // 797: dconst_1
      // 798: aload 0
      // 799: bipush 0
      // 79a: bipush 100
      // 79c: invokevirtual d3x.nt4 (II)I
      // 79f: aload 0
      // 7a0: bipush 0
      // 7a1: sipush 150
      // 7a4: invokevirtual d3x.nt4 (II)I
      // 7a7: invokevirtual d3x.wof (DDDDDII)V
      // 7aa: aload 0
      // 7ab: dload 22
      // 7ad: ldc2_w 5.5
      // 7b0: dsub
      // 7b1: dload 28
      // 7b3: dconst_1
      // 7b4: dsub
      // 7b5: dload 22
      // 7b7: ldc2_w 3.5
      // 7ba: dsub
      // 7bb: dload 39
      // 7bd: aload 36
      // 7bf: invokevirtual java/awt/Color.getRGB ()I
      // 7c2: invokevirtual d3x.frl (DDDDI)V
      // 7c5: dload 37
      // 7c7: dneg
      // 7c8: ldc2_w 50.0
      // 7cb: dcmpl
      // 7cc: iload 4
      // 7ce: ifeq 847
      // 7d1: ifle 82e
      // 7d4: goto 7db
      // 7d7: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7da: athrow
      // 7db: bipush 1
      // 7dc: istore 43
      // 7de: iload 43
      // 7e0: bipush 10
      // 7e2: if_icmpge 82e
      // 7e5: dload 37
      // 7e7: ldc2_w 10.0
      // 7ea: ddiv
      // 7eb: iload 43
      // 7ed: i2d
      // 7ee: dmul
      // 7ef: dstore 44
      // 7f1: aload 0
      // 7f2: dload 22
      // 7f4: ldc2_w 6.5
      // 7f7: dsub
      // 7f8: dload 28
      // 7fa: ldc2_w 0.5
      // 7fd: dsub
      // 7fe: dload 44
      // 800: dadd
      // 801: dload 22
      // 803: ldc2_w 2.5
      // 806: dsub
      // 807: dload 28
      // 809: ldc2_w 0.5
      // 80c: dsub
      // 80d: dload 44
      // 80f: dadd
      // 810: dconst_1
      // 811: dsub
      // 812: aload 0
      // 813: bipush 0
      // 814: invokevirtual d3x.ed_ (I)I
      // 817: invokevirtual d3x.frl (DDDDI)V
      // 81a: iinc 43 1
      // 81d: iload 4
      // 81f: ifeq 8e3
      // 822: iload 4
      // 824: ifne 7de
      // 827: goto 82e
      // 82a: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 82d: athrow
      // 82e: aload 0
      // 82f: fload 35
      // 831: ldc 100.0
      // 833: nop
      // 834: fmul
      // 835: f2d
      // 836: dconst_1
      // 837: invokevirtual d3x.fxl (DD)D
      // 83a: iload 4
      // 83c: ifeq 8ec
      // 83f: d2i
      // 840: goto 847
      // 843: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 846: athrow
      // 847: bipush 100
      // 849: if_icmpgt 8e3
      // 84c: invokestatic hzu.dp2 ()V
      // 84f: fconst_2
      // 850: fconst_2
      // 851: fconst_2
      // 852: invokestatic hzu.syc (FFF)V
      // 855: new java/lang/StringBuilder
      // 858: dup
      // 859: invokespecial java/lang/StringBuilder.<init> ()V
      // 85c: aload 0
      // 85d: fload 32
      // 85f: ldc 5.0
      // 861: nop
      // 862: fmul
      // 863: f2d
      // 864: dconst_1
      // 865: invokevirtual d3x.fxl (DD)D
      // 868: d2i
      // 869: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 86c: sipush 14218
      // 86f: ldc2_w 621602083991963209
      // 872: lload 2
      // 873: lxor
      // 874: invokedynamic r (IJ)Ljava/lang/String; bsm=d3x.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 879: nop
      // 87a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 880: astore 43
      // 882: getstatic jsr.wgd Lcyb;
      // 885: aload 43
      // 887: dload 22
      // 889: getstatic jsr.wgd Lcyb;
      // 88c: aload 43
      // 88e: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 891: fconst_2
      // 892: fmul
      // 893: f2d
      // 894: dsub
      // 895: d2f
      // 896: fconst_2
      // 897: fdiv
      // 898: ldc 5.0
      // 89a: nop
      // 89b: fsub
      // 89c: dload 41
      // 89e: d2f
      // 89f: getstatic jsr.wgd Lcyb;
      // 8a2: invokevirtual cyb.pvv ()F
      // 8a5: fconst_2
      // 8a6: fdiv
      // 8a7: fadd
      // 8a8: fconst_2
      // 8a9: fdiv
      // 8aa: fconst_2
      // 8ab: fsub
      // 8ac: bipush -1
      // 8ad: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 8b0: pop
      // 8b1: getstatic jsr.wgd Lcyb;
      // 8b4: aload 43
      // 8b6: dload 22
      // 8b8: getstatic jsr.wgd Lcyb;
      // 8bb: aload 43
      // 8bd: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 8c0: fconst_2
      // 8c1: fmul
      // 8c2: f2d
      // 8c3: dsub
      // 8c4: d2f
      // 8c5: fconst_2
      // 8c6: fdiv
      // 8c7: ldc 5.0
      // 8c9: nop
      // 8ca: fsub
      // 8cb: dload 41
      // 8cd: d2f
      // 8ce: getstatic jsr.wgd Lcyb;
      // 8d1: invokevirtual cyb.pvv ()F
      // 8d4: fconst_2
      // 8d5: fdiv
      // 8d6: fadd
      // 8d7: fconst_2
      // 8d8: fdiv
      // 8d9: fconst_2
      // 8da: fsub
      // 8db: bipush -1
      // 8dc: invokevirtual cyb.kkl (Ljava/lang/String;FFI)I
      // 8df: pop
      // 8e0: invokestatic hzu.x3w ()V
      // 8e3: dload 28
      // 8e5: dload 24
      // 8e7: dsub
      // 8e8: ldc2_w 4.0
      // 8eb: ddiv
      // 8ec: d2f
      // 8ed: fstore 43
      // 8ef: aload 11
      // 8f1: bipush 4
      // 8f2: invokevirtual ha9.rnq (I)Lerg;
      // 8f5: astore 44
      // 8f7: aload 44
      // 8f9: iload 4
      // 8fb: ifeq 9d5
      // 8fe: ifnull 9cf
      // 901: goto 908
      // 904: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 907: athrow
      // 908: aload 0
      // 909: dload 26
      // 90b: dconst_1
      // 90c: dadd
      // 90d: dload 24
      // 90f: dconst_1
      // 910: dadd
      // 911: dload 26
      // 913: ldc2_w 6.0
      // 916: dadd
      // 917: dload 24
      // 919: fload 43
      // 91b: f2d
      // 91c: dadd
      // 91d: dconst_1
      // 91e: aload 0
      // 91f: bipush 28
      // 921: sipush 156
      // 924: sipush 179
      // 927: bipush 100
      // 929: invokevirtual d3x.jup (IIII)I
      // 92c: aload 0
      // 92d: bipush 0
      // 92e: sipush 255
      // 931: invokevirtual d3x.nt4 (II)I
      // 934: invokevirtual d3x.wof (DDDDDII)V
      // 937: dload 24
      // 939: fload 43
      // 93b: f2d
      // 93c: dadd
      // 93d: dconst_1
      // 93e: dsub
      // 93f: dload 24
      // 941: ldc2_w 2.0
      // 944: dadd
      // 945: dsub
      // 946: d2f
      // 947: fstore 45
      // 949: dconst_1
      // 94a: aload 44
      // 94c: invokevirtual erg.dzj ()I
      // 94f: i2d
      // 950: aload 44
      // 952: invokevirtual erg.mg5 ()I
      // 955: i2d
      // 956: ddiv
      // 957: dsub
      // 958: dstore 46
      // 95a: aload 0
      // 95b: dload 26
      // 95d: ldc2_w 2.0
      // 960: dadd
      // 961: dload 24
      // 963: fload 43
      // 965: f2d
      // 966: dadd
      // 967: dconst_1
      // 968: dsub
      // 969: dload 26
      // 96b: ldc2_w 5.0
      // 96e: dadd
      // 96f: dload 24
      // 971: fload 43
      // 973: f2d
      // 974: dadd
      // 975: dconst_1
      // 976: dsub
      // 977: fload 45
      // 979: f2d
      // 97a: dload 46
      // 97c: dmul
      // 97d: dsub
      // 97e: aload 0
      // 97f: bipush 78
      // 981: sipush 206
      // 984: sipush 229
      // 987: invokevirtual d3x.qm9 (III)I
      // 98a: invokevirtual d3x.frl (DDDDI)V
      // 98d: aload 0
      // 98e: new java/lang/StringBuilder
      // 991: dup
      // 992: invokespecial java/lang/StringBuilder.<init> ()V
      // 995: aload 44
      // 997: invokevirtual erg.mg5 ()I
      // 99a: aload 44
      // 99c: invokevirtual erg.dzj ()I
      // 99f: isub
      // 9a0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9a3: ldc ""
      // 9a5: nop
      // 9a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9ac: dload 26
      // 9ae: ldc2_w 7.0
      // 9b1: dadd
      // 9b2: dload 24
      // 9b4: fload 43
      // 9b6: f2d
      // 9b7: dadd
      // 9b8: dconst_1
      // 9b9: dsub
      // 9ba: fload 45
      // 9bc: fconst_2
      // 9bd: fdiv
      // 9be: f2d
      // 9bf: dsub
      // 9c0: aload 1
      // 9c1: getfield Minecraft.tx1 Lowt;
      // 9c4: getfield owt.rr7 I
      // 9c7: bipush 2
      // 9c8: idiv
      // 9c9: i2d
      // 9ca: dsub
      // 9cb: bipush -1
      // 9cc: invokevirtual d3x.jyd (Ljava/lang/String;DDI)V
      // 9cf: aload 11
      // 9d1: bipush 3
      // 9d2: invokevirtual ha9.rnq (I)Lerg;
      // 9d5: astore 45
      // 9d7: aload 45
      // 9d9: iload 4
      // 9db: ifeq abf
      // 9de: ifnull ab9
      // 9e1: goto 9e8
      // 9e4: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9e7: athrow
      // 9e8: aload 0
      // 9e9: dload 26
      // 9eb: dconst_1
      // 9ec: dadd
      // 9ed: dload 24
      // 9ef: fload 43
      // 9f1: f2d
      // 9f2: dadd
      // 9f3: dload 26
      // 9f5: ldc2_w 6.0
      // 9f8: dadd
      // 9f9: dload 24
      // 9fb: fload 43
      // 9fd: fconst_2
      // 9fe: fmul
      // 9ff: f2d
      // a00: dadd
      // a01: dconst_1
      // a02: aload 0
      // a03: bipush 28
      // a05: sipush 156
      // a08: sipush 179
      // a0b: bipush 100
      // a0d: invokevirtual d3x.jup (IIII)I
      // a10: aload 0
      // a11: bipush 0
      // a12: sipush 255
      // a15: invokevirtual d3x.nt4 (II)I
      // a18: invokevirtual d3x.wof (DDDDDII)V
      // a1b: dload 24
      // a1d: fload 43
      // a1f: fconst_2
      // a20: fmul
      // a21: f2d
      // a22: dadd
      // a23: dload 24
      // a25: fload 43
      // a27: f2d
      // a28: dadd
      // a29: ldc2_w 2.0
      // a2c: dadd
      // a2d: dsub
      // a2e: d2f
      // a2f: fstore 46
      // a31: dconst_1
      // a32: aload 45
      // a34: invokevirtual erg.dzj ()I
      // a37: i2d
      // a38: dconst_1
      // a39: dmul
      // a3a: aload 45
      // a3c: invokevirtual erg.mg5 ()I
      // a3f: i2d
      // a40: ddiv
      // a41: dsub
      // a42: dstore 47
      // a44: aload 0
      // a45: dload 26
      // a47: ldc2_w 2.0
      // a4a: dadd
      // a4b: dload 24
      // a4d: fload 43
      // a4f: fconst_2
      // a50: fmul
      // a51: f2d
      // a52: dadd
      // a53: dload 26
      // a55: ldc2_w 5.0
      // a58: dadd
      // a59: dload 24
      // a5b: fload 43
      // a5d: fconst_2
      // a5e: fmul
      // a5f: f2d
      // a60: dadd
      // a61: fload 46
      // a63: f2d
      // a64: dload 47
      // a66: dmul
      // a67: dsub
      // a68: aload 0
      // a69: bipush 78
      // a6b: sipush 206
      // a6e: sipush 229
      // a71: invokevirtual d3x.qm9 (III)I
      // a74: invokevirtual d3x.frl (DDDDI)V
      // a77: aload 0
      // a78: new java/lang/StringBuilder
      // a7b: dup
      // a7c: invokespecial java/lang/StringBuilder.<init> ()V
      // a7f: aload 45
      // a81: invokevirtual erg.mg5 ()I
      // a84: aload 45
      // a86: invokevirtual erg.dzj ()I
      // a89: isub
      // a8a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a8d: ldc ""
      // a8f: nop
      // a90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a93: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a96: dload 26
      // a98: ldc2_w 7.0
      // a9b: dadd
      // a9c: dload 24
      // a9e: fload 43
      // aa0: fconst_2
      // aa1: fmul
      // aa2: f2d
      // aa3: dadd
      // aa4: fload 46
      // aa6: fconst_2
      // aa7: fdiv
      // aa8: f2d
      // aa9: dsub
      // aaa: aload 1
      // aab: getfield Minecraft.tx1 Lowt;
      // aae: getfield owt.rr7 I
      // ab1: bipush 2
      // ab2: idiv
      // ab3: i2d
      // ab4: dsub
      // ab5: bipush -1
      // ab6: invokevirtual d3x.jyd (Ljava/lang/String;DDI)V
      // ab9: aload 11
      // abb: bipush 2
      // abc: invokevirtual ha9.rnq (I)Lerg;
      // abf: astore 46
      // ac1: aload 46
      // ac3: iload 4
      // ac5: ifeq bb7
      // ac8: ifnull bb1
      // acb: goto ad2
      // ace: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ad1: athrow
      // ad2: aload 0
      // ad3: dload 26
      // ad5: dconst_1
      // ad6: dadd
      // ad7: dload 24
      // ad9: fload 43
      // adb: fconst_2
      // adc: fmul
      // add: f2d
      // ade: dadd
      // adf: dload 26
      // ae1: ldc2_w 6.0
      // ae4: dadd
      // ae5: dload 24
      // ae7: fload 43
      // ae9: ldc 3.0
      // aeb: nop
      // aec: fmul
      // aed: f2d
      // aee: dadd
      // aef: dconst_1
      // af0: aload 0
      // af1: bipush 28
      // af3: sipush 156
      // af6: sipush 179
      // af9: bipush 100
      // afb: invokevirtual d3x.jup (IIII)I
      // afe: aload 0
      // aff: bipush 0
      // b00: sipush 255
      // b03: invokevirtual d3x.nt4 (II)I
      // b06: invokevirtual d3x.wof (DDDDDII)V
      // b09: dload 24
      // b0b: fload 43
      // b0d: ldc 3.0
      // b0f: nop
      // b10: fmul
      // b11: f2d
      // b12: dadd
      // b13: dload 24
      // b15: fload 43
      // b17: fconst_2
      // b18: fmul
      // b19: f2d
      // b1a: dadd
      // b1b: ldc2_w 2.0
      // b1e: dadd
      // b1f: dsub
      // b20: d2f
      // b21: fstore 47
      // b23: dconst_1
      // b24: aload 46
      // b26: invokevirtual erg.dzj ()I
      // b29: i2d
      // b2a: dconst_1
      // b2b: dmul
      // b2c: aload 46
      // b2e: invokevirtual erg.mg5 ()I
      // b31: i2d
      // b32: ddiv
      // b33: dsub
      // b34: dstore 48
      // b36: aload 0
      // b37: dload 26
      // b39: ldc2_w 2.0
      // b3c: dadd
      // b3d: dload 24
      // b3f: fload 43
      // b41: ldc 3.0
      // b43: nop
      // b44: fmul
      // b45: f2d
      // b46: dadd
      // b47: dload 26
      // b49: ldc2_w 5.0
      // b4c: dadd
      // b4d: dload 24
      // b4f: fload 43
      // b51: ldc 3.0
      // b53: nop
      // b54: fmul
      // b55: f2d
      // b56: dadd
      // b57: fload 47
      // b59: f2d
      // b5a: dload 48
      // b5c: dmul
      // b5d: dsub
      // b5e: aload 0
      // b5f: bipush 78
      // b61: sipush 206
      // b64: sipush 229
      // b67: invokevirtual d3x.qm9 (III)I
      // b6a: invokevirtual d3x.frl (DDDDI)V
      // b6d: aload 0
      // b6e: new java/lang/StringBuilder
      // b71: dup
      // b72: invokespecial java/lang/StringBuilder.<init> ()V
      // b75: aload 46
      // b77: invokevirtual erg.mg5 ()I
      // b7a: aload 46
      // b7c: invokevirtual erg.dzj ()I
      // b7f: isub
      // b80: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b83: ldc ""
      // b85: nop
      // b86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b8c: dload 26
      // b8e: ldc2_w 7.0
      // b91: dadd
      // b92: dload 24
      // b94: fload 43
      // b96: ldc 3.0
      // b98: nop
      // b99: fmul
      // b9a: f2d
      // b9b: dadd
      // b9c: fload 47
      // b9e: fconst_2
      // b9f: fdiv
      // ba0: f2d
      // ba1: dsub
      // ba2: aload 1
      // ba3: getfield Minecraft.tx1 Lowt;
      // ba6: getfield owt.rr7 I
      // ba9: bipush 2
      // baa: idiv
      // bab: i2d
      // bac: dsub
      // bad: bipush -1
      // bae: invokevirtual d3x.jyd (Ljava/lang/String;DDI)V
      // bb1: aload 11
      // bb3: bipush 1
      // bb4: invokevirtual ha9.rnq (I)Lerg;
      // bb7: astore 47
      // bb9: iload 4
      // bbb: ifeq c0a
      // bbe: aload 47
      // bc0: ifnull cb6
      // bc3: goto bca
      // bc6: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // bc9: athrow
      // bca: aload 0
      // bcb: dload 26
      // bcd: dconst_1
      // bce: dadd
      // bcf: dload 24
      // bd1: fload 43
      // bd3: ldc 3.0
      // bd5: nop
      // bd6: fmul
      // bd7: f2d
      // bd8: dadd
      // bd9: dload 26
      // bdb: ldc2_w 6.0
      // bde: dadd
      // bdf: dload 24
      // be1: fload 43
      // be3: ldc 4.0
      // be5: nop
      // be6: fmul
      // be7: f2d
      // be8: dadd
      // be9: dconst_1
      // bea: aload 0
      // beb: bipush 28
      // bed: sipush 156
      // bf0: sipush 179
      // bf3: bipush 100
      // bf5: invokevirtual d3x.jup (IIII)I
      // bf8: aload 0
      // bf9: bipush 0
      // bfa: sipush 255
      // bfd: invokevirtual d3x.nt4 (II)I
      // c00: invokevirtual d3x.wof (DDDDDII)V
      // c03: goto c0a
      // c06: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c09: athrow
      // c0a: dload 24
      // c0c: fload 43
      // c0e: ldc 4.0
      // c10: nop
      // c11: fmul
      // c12: f2d
      // c13: dadd
      // c14: dload 24
      // c16: fload 43
      // c18: ldc 3.0
      // c1a: nop
      // c1b: fmul
      // c1c: f2d
      // c1d: dadd
      // c1e: ldc2_w 2.0
      // c21: dadd
      // c22: dsub
      // c23: d2f
      // c24: fstore 48
      // c26: dconst_1
      // c27: aload 47
      // c29: invokevirtual erg.dzj ()I
      // c2c: i2d
      // c2d: dconst_1
      // c2e: dmul
      // c2f: aload 47
      // c31: invokevirtual erg.mg5 ()I
      // c34: i2d
      // c35: ddiv
      // c36: dsub
      // c37: dstore 49
      // c39: aload 0
      // c3a: dload 26
      // c3c: ldc2_w 2.0
      // c3f: dadd
      // c40: dload 24
      // c42: fload 43
      // c44: ldc 4.0
      // c46: nop
      // c47: fmul
      // c48: f2d
      // c49: dadd
      // c4a: dconst_1
      // c4b: dsub
      // c4c: dload 26
      // c4e: ldc2_w 5.0
      // c51: dadd
      // c52: dload 24
      // c54: fload 43
      // c56: ldc 4.0
      // c58: nop
      // c59: fmul
      // c5a: f2d
      // c5b: dadd
      // c5c: fload 48
      // c5e: f2d
      // c5f: dload 49
      // c61: dmul
      // c62: dsub
      // c63: aload 0
      // c64: bipush 78
      // c66: sipush 206
      // c69: sipush 229
      // c6c: invokevirtual d3x.qm9 (III)I
      // c6f: invokevirtual d3x.frl (DDDDI)V
      // c72: aload 0
      // c73: new java/lang/StringBuilder
      // c76: dup
      // c77: invokespecial java/lang/StringBuilder.<init> ()V
      // c7a: aload 47
      // c7c: invokevirtual erg.mg5 ()I
      // c7f: aload 47
      // c81: invokevirtual erg.dzj ()I
      // c84: isub
      // c85: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // c88: ldc ""
      // c8a: nop
      // c8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c8e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c91: dload 26
      // c93: ldc2_w 7.0
      // c96: dadd
      // c97: dload 24
      // c99: fload 43
      // c9b: ldc 4.0
      // c9d: nop
      // c9e: fmul
      // c9f: f2d
      // ca0: dadd
      // ca1: fload 48
      // ca3: fconst_2
      // ca4: fdiv
      // ca5: f2d
      // ca6: dsub
      // ca7: aload 1
      // ca8: getfield Minecraft.tx1 Lowt;
      // cab: getfield owt.rr7 I
      // cae: bipush 2
      // caf: idiv
      // cb0: i2d
      // cb1: dsub
      // cb2: bipush -1
      // cb3: invokevirtual d3x.jyd (Ljava/lang/String;DDI)V
      // cb6: goto cbb
      // cb9: astore 20
      // cbb: invokestatic hzu.x3w ()V
      // cbe: fconst_1
      // cbf: fconst_1
      // cc0: fconst_1
      // cc1: fconst_1
      // cc2: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // cc5: iload 4
      // cc7: ifne 048
      // cca: fconst_1
      // ccb: fconst_1
      // ccc: fconst_1
      // ccd: invokestatic org/lwjgl/opengl/GL11.glScalef (FFF)V
      // cd0: fconst_1
      // cd1: fconst_1
      // cd2: fconst_1
      // cd3: fconst_1
      // cd4: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // cd7: invokestatic hzu.x3w ()V
      // cda: aload 0
      // cdb: dconst_0
      // cdc: dconst_0
      // cdd: dconst_0
      // cde: dconst_0
      // cdf: bipush -1
      // ce0: invokevirtual d3x.frl (DDDDI)V
      // ce3: return
   }

   public void jyd(String var1, double var2, double var4, int var6) {
      Minecraft.vz1().tx1.km1(var1, (float)var2, (float)var4, var6);
   }

   public double fxl(double var1, double var3) {
      double var5 = 1.0 / var3;
      return (double)Math.round(var1 * var5) / var5;
   }

   public Color _xp(float[] var1, Color[] var2, float var3) {
      long var4 = a ^ 72267206483816L;

      try {
         if (var1 == null) {
            throw new IllegalArgumentException(a<"r">(7281, 812506084280613678L ^ var4));
         }
      } catch (ArrayIndexOutOfBoundsException var14) {
         throw a(var14);
      }

      try {
         if (var2 == null) {
            throw new IllegalArgumentException(a<"r">(22173, 2816284589859762630L ^ var4));
         }
      } catch (ArrayIndexOutOfBoundsException var12) {
         throw a(var12);
      }

      try {
         if (var1.length != var2.length) {
            throw new IllegalArgumentException(a<"r">(32724, 7363262686953494666L ^ var4));
         }
      } catch (ArrayIndexOutOfBoundsException var13) {
         throw a(var13);
      }

      int[] var6 = this._8u(var1, var3);
      float[] var7 = new float[]{var1[var6[0]], var1[var6[1]]};
      Color[] var8 = new Color[]{var2[var6[0]], var2[var6[1]]};
      float var9 = var7[1] - var7[0];
      float var10 = var3 - var7[0];
      float var11 = var10 / var9;
      return this.vlv(var8[0], var8[1], (double)(1.0F - var11));
   }

   public int[] _8u(float[] param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 2
      // 01: newarray 10
      // 03: astore 5
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: bipush 0
      // 09: istore 4
      // 0b: istore 3
      // 0c: iload 4
      // 0e: aload 1
      // 0f: arraylength
      // 10: if_icmpge 40
      // 13: aload 1
      // 14: iload 4
      // 16: faload
      // 17: fload 2
      // 18: fcmpg
      // 19: iload 3
      // 1a: ifeq 42
      // 1d: iload 3
      // 1e: ifeq 42
      // 21: goto 28
      // 24: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: ifgt 40
      // 2b: goto 32
      // 2e: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: iinc 4 1
      // 35: iload 3
      // 36: ifne 0c
      // 39: goto 40
      // 3c: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3f: athrow
      // 40: iload 4
      // 42: aload 1
      // 43: arraylength
      // 44: iload 3
      // 45: ifeq 5c
      // 48: if_icmplt 5f
      // 4b: goto 52
      // 4e: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 51: athrow
      // 52: aload 1
      // 53: arraylength
      // 54: bipush 1
      // 55: goto 5c
      // 58: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: isub
      // 5d: istore 4
      // 5f: aload 5
      // 61: bipush 0
      // 62: iload 4
      // 64: bipush 1
      // 65: isub
      // 66: iastore
      // 67: aload 5
      // 69: bipush 1
      // 6a: iload 4
      // 6c: iastore
      // 6d: aload 5
      // 6f: areturn
   }

   public Color vlv(Color param1, Color param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic d3x.a J
      // 003: ldc2_w 111875857012023
      // 006: lxor
      // 007: lstore 5
      // 009: dload 3
      // 00a: d2f
      // 00b: fstore 8
      // 00d: fconst_1
      // 00e: fload 8
      // 010: fsub
      // 011: fstore 9
      // 013: bipush 3
      // 014: newarray 6
      // 016: astore 10
      // 018: invokestatic OpaquePredicate.b ()I
      // 01b: bipush 3
      // 01c: newarray 6
      // 01e: astore 11
      // 020: aload 1
      // 021: aload 10
      // 023: invokevirtual java/awt/Color.getColorComponents ([F)[F
      // 026: pop
      // 027: aload 2
      // 028: aload 11
      // 02a: invokevirtual java/awt/Color.getColorComponents ([F)[F
      // 02d: pop
      // 02e: aload 10
      // 030: bipush 0
      // 031: faload
      // 032: fload 8
      // 034: fmul
      // 035: aload 11
      // 037: bipush 0
      // 038: faload
      // 039: fload 9
      // 03b: fmul
      // 03c: fadd
      // 03d: fstore 12
      // 03f: aload 10
      // 041: bipush 1
      // 042: faload
      // 043: fload 8
      // 045: fmul
      // 046: aload 11
      // 048: bipush 1
      // 049: faload
      // 04a: fload 9
      // 04c: fmul
      // 04d: fadd
      // 04e: fstore 13
      // 050: istore 7
      // 052: aload 10
      // 054: bipush 2
      // 055: faload
      // 056: fload 8
      // 058: fmul
      // 059: aload 11
      // 05b: bipush 2
      // 05c: faload
      // 05d: fload 9
      // 05f: fmul
      // 060: fadd
      // 061: fstore 14
      // 063: fload 12
      // 065: fconst_0
      // 066: fcmpg
      // 067: iload 7
      // 069: ifeq 08b
      // 06c: ifge 07e
      // 06f: goto 076
      // 072: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 075: athrow
      // 076: fconst_0
      // 077: fstore 12
      // 079: iload 7
      // 07b: ifne 09f
      // 07e: fload 12
      // 080: ldc 255.0
      // 082: nop
      // 083: fcmpl
      // 084: goto 08b
      // 087: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08a: athrow
      // 08b: iload 7
      // 08d: ifeq 0a3
      // 090: ifle 09f
      // 093: goto 09a
      // 096: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 099: athrow
      // 09a: ldc 255.0
      // 09c: nop
      // 09d: fstore 12
      // 09f: fload 13
      // 0a1: fconst_0
      // 0a2: fcmpg
      // 0a3: iload 7
      // 0a5: ifeq 0c7
      // 0a8: ifge 0ba
      // 0ab: goto 0b2
      // 0ae: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b1: athrow
      // 0b2: fconst_0
      // 0b3: fstore 13
      // 0b5: iload 7
      // 0b7: ifne 0db
      // 0ba: fload 13
      // 0bc: ldc 255.0
      // 0be: nop
      // 0bf: fcmpl
      // 0c0: goto 0c7
      // 0c3: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c6: athrow
      // 0c7: iload 7
      // 0c9: ifeq 0df
      // 0cc: ifle 0db
      // 0cf: goto 0d6
      // 0d2: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d5: athrow
      // 0d6: ldc 255.0
      // 0d8: nop
      // 0d9: fstore 13
      // 0db: fload 14
      // 0dd: fconst_0
      // 0de: fcmpg
      // 0df: iload 7
      // 0e1: ifeq 10f
      // 0e4: ifge 0f6
      // 0e7: goto 0ee
      // 0ea: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ed: athrow
      // 0ee: fconst_0
      // 0ef: fstore 14
      // 0f1: iload 7
      // 0f3: ifne 11e
      // 0f6: fload 14
      // 0f8: iload 7
      // 0fa: ifeq 11c
      // 0fd: goto 104
      // 100: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 103: athrow
      // 104: ldc 255.0
      // 106: nop
      // 107: fcmpl
      // 108: goto 10f
      // 10b: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: ifle 11e
      // 112: ldc 255.0
      // 114: nop
      // 115: goto 11c
      // 118: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11b: athrow
      // 11c: fstore 14
      // 11e: aconst_null
      // 11f: astore 15
      // 121: new java/awt/Color
      // 124: dup
      // 125: fload 12
      // 127: fload 13
      // 129: fload 14
      // 12b: invokespecial java/awt/Color.<init> (FFF)V
      // 12e: astore 15
      // 130: goto 194
      // 133: astore 16
      // 135: invokestatic java/text/NumberFormat.getNumberInstance ()Ljava/text/NumberFormat;
      // 138: astore 17
      // 13a: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 13d: new java/lang/StringBuilder
      // 140: dup
      // 141: invokespecial java/lang/StringBuilder.<init> ()V
      // 144: aload 17
      // 146: fload 12
      // 148: f2d
      // 149: invokevirtual java/text/NumberFormat.format (D)Ljava/lang/String;
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: sipush 26691
      // 152: ldc2_w 8414560606203004229
      // 155: lload 5
      // 157: lxor
      // 158: invokedynamic r (IJ)Ljava/lang/String; bsm=d3x.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: nop
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: aload 17
      // 163: fload 13
      // 165: f2d
      // 166: invokevirtual java/text/NumberFormat.format (D)Ljava/lang/String;
      // 169: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16c: sipush 29068
      // 16f: ldc2_w 738758996980784265
      // 172: lload 5
      // 174: lxor
      // 175: invokedynamic r (IJ)Ljava/lang/String; bsm=d3x.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: nop
      // 17b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17e: aload 17
      // 180: fload 14
      // 182: f2d
      // 183: invokevirtual java/text/NumberFormat.format (D)Ljava/lang/String;
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18c: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 18f: aload 16
      // 191: invokevirtual java/lang/IllegalArgumentException.printStackTrace ()V
      // 194: aload 15
      // 196: areturn
   }

   public void yy5(Minecraft param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield d3x.dc7 Ljava/util/Map;
      // 004: invokeinterface java/util/Map.clear ()V 1
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: aload 1
      // 00d: getfield Minecraft.gze Laba;
      // 010: getfield aba.au3 F
      // 013: fstore 3
      // 014: istore 2
      // 015: aload 1
      // 016: getfield Minecraft.tij Lkh3;
      // 019: invokevirtual WorldClient.xa0 ()Ljava/util/List;
      // 01c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 021: astore 4
      // 023: aload 4
      // 025: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02a: ifeq 3ea
      // 02d: aload 4
      // 02f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 034: astore 5
      // 036: aload 5
      // 038: iload 2
      // 039: ifeq 04b
      // 03c: instanceof ha9
      // 03f: ifeq 023
      // 042: goto 049
      // 045: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: aload 5
      // 04b: checkcast ha9
      // 04e: dup
      // 04f: astore 6
      // 051: aload 1
      // 052: getfield Minecraft.vg8 Ll86;
      // 055: if_acmpne 05f
      // 058: goto 023
      // 05b: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05e: athrow
      // 05f: getstatic ModuleRegistry.irb Lf5k;
      // 062: invokevirtual Rotation.klu ()Z
      // 065: iload 2
      // 066: ifeq 084
      // 069: ifeq 0ce
      // 06c: goto 073
      // 06f: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 072: athrow
      // 073: getstatic ModuleRegistry.irb Lf5k;
      // 076: pop
      // 077: getstatic Rotation.pje Lcn7;
      // 07a: invokevirtual BooleanSetting.g7m ()Z
      // 07d: goto 084
      // 080: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 083: athrow
      // 084: iload 2
      // 085: ifeq 0a9
      // 088: ifeq 0ce
      // 08b: goto 092
      // 08e: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 091: athrow
      // 092: aload 6
      // 094: iload 2
      // 095: ifeq 0d0
      // 098: goto 09f
      // 09b: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09e: athrow
      // 09f: instanceof ha9
      // 0a2: goto 0a9
      // 0a5: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a8: athrow
      // 0a9: ifeq 0ce
      // 0ac: aload 6
      // 0ae: iload 2
      // 0af: ifeq 0d0
      // 0b2: goto 0b9
      // 0b5: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: getfield Minecraft.vg8 Ll86;
      // 0bd: if_acmpeq 0ce
      // 0c0: goto 0c7
      // 0c3: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c6: athrow
      // 0c7: goto 023
      // 0ca: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cd: athrow
      // 0ce: aload 6
      // 0d0: getfield ha9.ivp D
      // 0d3: aload 6
      // 0d5: getfield ha9.o2v D
      // 0d8: aload 6
      // 0da: getfield ha9.ivp D
      // 0dd: dsub
      // 0de: fload 3
      // 0df: f2d
      // 0e0: dmul
      // 0e1: dadd
      // 0e2: aload 1
      // 0e3: invokevirtual Minecraft.ibs ()Lhr_;
      // 0e6: getfield hr_._3y D
      // 0e9: dsub
      // 0ea: ldc2_w 0.36
      // 0ed: dadd
      // 0ee: dstore 7
      // 0f0: aload 6
      // 0f2: getfield ha9.c54 D
      // 0f5: aload 6
      // 0f7: getfield ha9.kfp D
      // 0fa: aload 6
      // 0fc: getfield ha9.c54 D
      // 0ff: dsub
      // 100: fload 3
      // 101: f2d
      // 102: dmul
      // 103: dadd
      // 104: aload 1
      // 105: invokevirtual Minecraft.ibs ()Lhr_;
      // 108: getfield hr_.b7y D
      // 10b: dsub
      // 10c: dstore 9
      // 10e: aload 6
      // 110: getfield ha9.e2b D
      // 113: aload 6
      // 115: getfield ha9.vbd D
      // 118: aload 6
      // 11a: getfield ha9.e2b D
      // 11d: dsub
      // 11e: fload 3
      // 11f: f2d
      // 120: dmul
      // 121: dadd
      // 122: aload 1
      // 123: invokevirtual Minecraft.ibs ()Lhr_;
      // 126: getfield hr_.xdg D
      // 129: dsub
      // 12a: ldc2_w 0.36
      // 12d: dadd
      // 12e: dstore 11
      // 130: dload 9
      // 132: aload 6
      // 134: getfield ha9.ikl F
      // 137: f2d
      // 138: ldc2_w 0.15
      // 13b: dadd
      // 13c: dadd
      // 13d: dup2
      // 13e: dstore 9
      // 140: dstore 13
      // 142: aload 0
      // 143: dload 7
      // 145: dload 9
      // 147: dload 11
      // 149: invokevirtual d3x.k22 (DDD)[D
      // 14c: astore 15
      // 14e: aload 0
      // 14f: dload 7
      // 151: ldc2_w 0.36
      // 154: dsub
      // 155: dload 9
      // 157: dload 11
      // 159: ldc2_w 0.36
      // 15c: dsub
      // 15d: invokevirtual d3x.k22 (DDD)[D
      // 160: astore 16
      // 162: dconst_0
      // 163: dstore 17
      // 165: aload 16
      // 167: bipush 2
      // 168: daload
      // 169: dconst_0
      // 16a: dcmpl
      // 16b: iload 2
      // 16c: ifeq 18a
      // 16f: iflt 023
      // 172: goto 179
      // 175: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 178: athrow
      // 179: aload 16
      // 17b: bipush 2
      // 17c: daload
      // 17d: dconst_1
      // 17e: iload 2
      // 17f: ifeq 1d1
      // 182: dcmpg
      // 183: goto 18a
      // 186: invokestatic d3x.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 189: athrow
      // 18a: iflt 190
      // 18d: goto 023
      // 190: aload 6
      // 192: getfield ha9.ivp D
      // 195: aload 6
      // 197: getfield ha9.o2v D
      // 19a: aload 6
      // 19c: getfield ha9.ivp D
      // 19f: dsub
      // 1a0: fload 3
      // 1a1: f2d
      // 1a2: dmul
      // 1a3: dadd
      // 1a4: aload 1
      // 1a5: invokevirtual Minecraft.ibs ()Lhr_;
      // 1a8: getfield hr_._3y D
      // 1ab: dsub
      // 1ac: ldc2_w 0.36
      // 1af: dsub
      // 1b0: dstore 7
      // 1b2: aload 6
      // 1b4: getfield ha9.e2b D
      // 1b7: aload 6
      // 1b9: getfield ha9.vbd D
      // 1bc: aload 6
      // 1be: getfield ha9.e2b D
      // 1c1: dsub
      // 1c2: fload 3
      // 1c3: f2d
      // 1c4: dmul
      // 1c5: dadd
      // 1c6: aload 1
      // 1c7: invokevirtual Minecraft.ibs ()Lhr_;
      // 1ca: getfield hr_.xdg D
      // 1cd: dsub
      // 1ce: ldc2_w 0.36
      // 1d1: dsub
      // 1d2: dstore 11
      // 1d4: aload 0
      // 1d5: dload 7
      // 1d7: dload 9
      // 1d9: dload 11
      // 1db: invokevirtual d3x.k22 (DDD)[D
      // 1de: astore 19
      // 1e0: aload 6
      // 1e2: getfield ha9.c54 D
      // 1e5: aload 6
      // 1e7: getfield ha9.kfp D
      // 1ea: aload 6
      // 1ec: getfield ha9.c54 D
      // 1ef: dsub
      // 1f0: fload 3
      // 1f1: f2d
      // 1f2: dmul
      // 1f3: dadd
      // 1f4: aload 1
      // 1f5: invokevirtual Minecraft.ibs ()Lhr_;
      // 1f8: getfield hr_.b7y D
      // 1fb: dsub
      // 1fc: ldc2_w 0.05
      // 1ff: dsub
      // 200: dstore 9
      // 202: aload 0
      // 203: dload 7
      // 205: dload 9
      // 207: dload 11
      // 209: invokevirtual d3x.k22 (DDD)[D
      // 20c: astore 20
      // 20e: aload 6
      // 210: getfield ha9.ivp D
      // 213: aload 6
      // 215: getfield ha9.o2v D
      // 218: aload 6
      // 21a: getfield ha9.ivp D
      // 21d: dsub
      // 21e: fload 3
      // 21f: f2d
      // 220: dmul
      // 221: dadd
      // 222: aload 1
      // 223: invokevirtual Minecraft.ibs ()Lhr_;
      // 226: getfield hr_._3y D
      // 229: dsub
      // 22a: ldc2_w 0.36
      // 22d: dsub
      // 22e: dstore 7
      // 230: aload 6
      // 232: getfield ha9.e2b D
      // 235: aload 6
      // 237: getfield ha9.vbd D
      // 23a: aload 6
      // 23c: getfield ha9.e2b D
      // 23f: dsub
      // 240: fload 3
      // 241: f2d
      // 242: dmul
      // 243: dadd
      // 244: aload 1
      // 245: invokevirtual Minecraft.ibs ()Lhr_;
      // 248: getfield hr_.xdg D
      // 24b: dsub
      // 24c: ldc2_w 0.36
      // 24f: dadd
      // 250: dstore 11
      // 252: aload 0
      // 253: dload 7
      // 255: dload 13
      // 257: dload 11
      // 259: invokevirtual d3x.k22 (DDD)[D
      // 25c: astore 21
      // 25e: aload 0
      // 25f: dload 7
      // 261: dload 9
      // 263: dload 11
      // 265: invokevirtual d3x.k22 (DDD)[D
      // 268: astore 22
      // 26a: aload 6
      // 26c: getfield ha9.ivp D
      // 26f: aload 6
      // 271: getfield ha9.o2v D
      // 274: aload 6
      // 276: getfield ha9.ivp D
      // 279: dsub
      // 27a: fload 3
      // 27b: f2d
      // 27c: dmul
      // 27d: dadd
      // 27e: aload 1
      // 27f: invokevirtual Minecraft.ibs ()Lhr_;
      // 282: getfield hr_._3y D
      // 285: dsub
      // 286: ldc2_w 0.36
      // 289: dadd
      // 28a: dstore 7
      // 28c: aload 6
      // 28e: getfield ha9.e2b D
      // 291: aload 6
      // 293: getfield ha9.vbd D
      // 296: aload 6
      // 298: getfield ha9.e2b D
      // 29b: dsub
      // 29c: fload 3
      // 29d: f2d
      // 29e: dmul
      // 29f: dadd
      // 2a0: aload 1
      // 2a1: invokevirtual Minecraft.ibs ()Lhr_;
      // 2a4: getfield hr_.xdg D
      // 2a7: dsub
      // 2a8: ldc2_w 0.36
      // 2ab: dadd
      // 2ac: dstore 11
      // 2ae: aload 0
      // 2af: dload 7
      // 2b1: dload 9
      // 2b3: dload 11
      // 2b5: invokevirtual d3x.k22 (DDD)[D
      // 2b8: astore 23
      // 2ba: aload 6
      // 2bc: getfield ha9.ivp D
      // 2bf: aload 6
      // 2c1: getfield ha9.o2v D
      // 2c4: aload 6
      // 2c6: getfield ha9.ivp D
      // 2c9: dsub
      // 2ca: fload 3
      // 2cb: f2d
      // 2cc: dmul
      // 2cd: dadd
      // 2ce: aload 1
      // 2cf: invokevirtual Minecraft.ibs ()Lhr_;
      // 2d2: getfield hr_._3y D
      // 2d5: dsub
      // 2d6: ldc2_w 0.36
      // 2d9: dadd
      // 2da: dstore 7
      // 2dc: aload 6
      // 2de: getfield ha9.e2b D
      // 2e1: aload 6
      // 2e3: getfield ha9.vbd D
      // 2e6: aload 6
      // 2e8: getfield ha9.e2b D
      // 2eb: dsub
      // 2ec: fload 3
      // 2ed: f2d
      // 2ee: dmul
      // 2ef: dadd
      // 2f0: aload 1
      // 2f1: invokevirtual Minecraft.ibs ()Lhr_;
      // 2f4: getfield hr_.xdg D
      // 2f7: dsub
      // 2f8: ldc2_w 0.36
      // 2fb: dsub
      // 2fc: dstore 11
      // 2fe: aload 0
      // 2ff: dload 7
      // 301: dload 13
      // 303: dload 11
      // 305: invokevirtual d3x.k22 (DDD)[D
      // 308: astore 24
      // 30a: aload 0
      // 30b: dload 7
      // 30d: dload 9
      // 30f: dload 11
      // 311: invokevirtual d3x.k22 (DDD)[D
      // 314: astore 25
      // 316: aload 0
      // 317: getfield d3x.dc7 Ljava/util/Map;
      // 31a: aload 6
      // 31c: bipush 25
      // 31e: newarray 7
      // 320: dup
      // 321: bipush 0
      // 322: aload 15
      // 324: bipush 0
      // 325: daload
      // 326: dastore
      // 327: dup
      // 328: bipush 1
      // 329: aload 15
      // 32b: bipush 1
      // 32c: daload
      // 32d: dastore
      // 32e: dup
      // 32f: bipush 2
      // 330: dload 17
      // 332: dastore
      // 333: dup
      // 334: bipush 3
      // 335: aload 15
      // 337: bipush 2
      // 338: daload
      // 339: dastore
      // 33a: dup
      // 33b: bipush 4
      // 33c: aload 19
      // 33e: bipush 0
      // 33f: daload
      // 340: dastore
      // 341: dup
      // 342: bipush 5
      // 343: aload 19
      // 345: bipush 1
      // 346: daload
      // 347: dastore
      // 348: dup
      // 349: bipush 6
      // 34b: aload 19
      // 34d: bipush 2
      // 34e: daload
      // 34f: dastore
      // 350: dup
      // 351: bipush 7
      // 353: aload 20
      // 355: bipush 0
      // 356: daload
      // 357: dastore
      // 358: dup
      // 359: bipush 8
      // 35b: aload 20
      // 35d: bipush 1
      // 35e: daload
      // 35f: dastore
      // 360: dup
      // 361: bipush 9
      // 363: aload 20
      // 365: bipush 2
      // 366: daload
      // 367: dastore
      // 368: dup
      // 369: bipush 10
      // 36b: aload 22
      // 36d: bipush 0
      // 36e: daload
      // 36f: dastore
      // 370: dup
      // 371: bipush 11
      // 373: aload 22
      // 375: bipush 1
      // 376: daload
      // 377: dastore
      // 378: dup
      // 379: bipush 12
      // 37b: aload 22
      // 37d: bipush 2
      // 37e: daload
      // 37f: dastore
      // 380: dup
      // 381: bipush 13
      // 383: aload 23
      // 385: bipush 0
      // 386: daload
      // 387: dastore
      // 388: dup
      // 389: bipush 14
      // 38b: aload 23
      // 38d: bipush 1
      // 38e: daload
      // 38f: dastore
      // 390: dup
      // 391: bipush 15
      // 393: aload 23
      // 395: bipush 2
      // 396: daload
      // 397: dastore
      // 398: dup
      // 399: bipush 16
      // 39b: aload 25
      // 39d: bipush 0
      // 39e: daload
      // 39f: dastore
      // 3a0: dup
      // 3a1: bipush 17
      // 3a3: aload 25
      // 3a5: bipush 1
      // 3a6: daload
      // 3a7: dastore
      // 3a8: dup
      // 3a9: bipush 18
      // 3ab: aload 25
      // 3ad: bipush 2
      // 3ae: daload
      // 3af: dastore
      // 3b0: dup
      // 3b1: bipush 19
      // 3b3: aload 21
      // 3b5: bipush 0
      // 3b6: daload
      // 3b7: dastore
      // 3b8: dup
      // 3b9: bipush 20
      // 3bb: aload 21
      // 3bd: bipush 1
      // 3be: daload
      // 3bf: dastore
      // 3c0: dup
      // 3c1: bipush 21
      // 3c3: aload 21
      // 3c5: bipush 2
      // 3c6: daload
      // 3c7: dastore
      // 3c8: dup
      // 3c9: bipush 22
      // 3cb: aload 24
      // 3cd: bipush 0
      // 3ce: daload
      // 3cf: dastore
      // 3d0: dup
      // 3d1: bipush 23
      // 3d3: aload 24
      // 3d5: bipush 1
      // 3d6: daload
      // 3d7: dastore
      // 3d8: dup
      // 3d9: bipush 24
      // 3db: aload 24
      // 3dd: bipush 2
      // 3de: daload
      // 3df: dastore
      // 3e0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3e5: pop
      // 3e6: iload 2
      // 3e7: ifne 023
      // 3ea: return
   }

   public double[] k22(double var1, double var3, double var5) {
      return this.bay(var1, var3, var5);
   }

   public double[] bay(double var1, double var3, double var5) {
      FloatBuffer var8 = BufferUtils.createFloatBuffer(3);
      IntBuffer var9 = BufferUtils.createIntBuffer(16);
      int var10000 = OpaquePredicate.b();
      FloatBuffer var10 = BufferUtils.createFloatBuffer(16);
      FloatBuffer var11 = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloat(2982, var10);
      int var7 = var10000;
      GL11.glGetFloat(2983, var11);
      GL11.glGetInteger(2978, var9);
      byte var12 = GLU.gluProject((float)var1, (float)var3, (float)var5, var10, var11, var9, var8);

      label22: {
         try {
            var14 = var12;
            if (var7 == 0) {
               break label22;
            }

            if (var12 == 0) {
               return null;
            }
         } catch (ArrayIndexOutOfBoundsException var13) {
            throw a(var13);
         }

         var14 = 3;
      }

      double[] var15 = new double[var14];
      var15[0] = (double)var8.get(0);
      var15[1] = (double)((float)Display.getHeight() - var8.get(1));
      var15[2] = (double)var8.get(2);
      return var15;
   }

   public void wof(double var1, double var3, double var5, double var7, double var9, int var11, int var12) {
      this.frl(var1 + var9, var3 + var9, var5 - var9, var7 - var9, var11);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.frl(var1 + var9, var3, var5 - var9, var3 + var9, var12);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.frl(var1, var3, var1 + var9, var7, var12);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.frl(var5 - var9, var3, var5, var7, var12);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.frl(var1 + var9, var7 - var9, var5 - var9, var7, var12);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void frl(double var1, double var3, double var5, double var7, int var9) {
      int var10 = OpaquePredicate.c();

      int var10000;
      label37: {
         label36: {
            try {
               double var21;
               var10000 = (var21 = var1 - var5) == 0.0 ? 0 : (var21 < 0.0 ? -1 : 1);
               if (var10 != 0) {
                  break label37;
               }

               if (var10000 >= 0) {
                  break label36;
               }
            } catch (ArrayIndexOutOfBoundsException var19) {
               throw a(var19);
            }

            double var11 = var1;
            var1 = var5;
            var5 = var11;
         }

         double var22;
         var10000 = (var22 = var3 - var7) == 0.0 ? 0 : (var22 < 0.0 ? -1 : 1);
      }

      label28: {
         label27: {
            try {
               if (var10 != 0) {
                  break label28;
               }

               if (var10000 >= 0) {
                  break label27;
               }
            } catch (ArrayIndexOutOfBoundsException var18) {
               throw a(var18);
            }

            double var20 = var3;
            var3 = var7;
            var7 = var20;
         }

         var10000 = var9 >> 24 & 0xFF;
      }

      float var13 = (float)var10000 / 255.0F;
      float var14 = (float)(var9 >> 16 & 0xFF) / 255.0F;
      float var15 = (float)(var9 >> 8 & 0xFF) / 255.0F;
      float var16 = (float)(var9 & 0xFF) / 255.0F;
      q3g var17 = jom.yut().zuq();
      hzu.spd();
      hzu.m_1();
      hzu.u39(770, 771, 1, 0);
      hzu.wn0(var14, var15, var16, var13);
      var17.ezr(7, gnl.gx3);
      var17.g5o(var1, var7, 0.0).pzw();
      var17.g5o(var5, var7, 0.0).pzw();
      var17.g5o(var5, var3, 0.0).pzw();
      var17.g5o(var1, var3, 0.0).pzw();
      jom.yut().q7g();
      hzu.rqj();
      hzu.ux6();
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public int jup(int var1, int var2, int var3, int var4) {
      int var5 = fe6.faa(var4, 0, 255) << 24;
      var5 |= fe6.faa(var1, 0, 255) << 16;
      var5 |= fe6.faa(var2, 0, 255) << 8;
      return var5 | fe6.faa(var3, 0, 255);
   }

   public int qm9(int var1, int var2, int var3) {
      return this.jup(var1, var2, var3, 255);
   }

   public int ed_(int var1) {
      return this.jup(var1, var1, var1, 255);
   }

   public int nt4(int var1, int var2) {
      return this.jup(var1, var1, var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4541102825790404814L, 3668431349179133233L, MethodHandles.lookup().lookupClass()).a(271427633172182L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 109838833222905L;
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
      String var4 = "\u001aì°\u00138á´É\u0080Ô+\u0087¨\u0019Ó@Ë²²Çª\u0097\u0091bw®Ñ7ÇHk\u008a\u0095êwp,«ìô\u0010\u0098\u0006i.¤\u0007{AÏP¹Ä\u00ad\u00011\u001e\u0010\u000e ù»Aeª\u0018æ\u008a\u009534Õ£6(\u001d¥ÂQ\u001f\u001c\u0097\u0086\t\u0099ÃÞP&PFÂ\u001eôÒ8fqÈ?\u0099Âë3l\u009a\u0086M\u0080|\u0081\u0084ÔÕx\u0010K³\u0015æ÷W\u008c|O¯Êq\u0095X\u000b\u0015 \u0007 9³\u0015\u001d\u0084)\u0092\u0098d\u0010ö|Ï½;U\u008f\të|\u0083ºo\u000b\u008d,e\u0099¤f";
      int var6 = "\u001aì°\u00138á´É\u0080Ô+\u0087¨\u0019Ó@Ë²²Çª\u0097\u0091bw®Ñ7ÇHk\u008a\u0095êwp,«ìô\u0010\u0098\u0006i.¤\u0007{AÏP¹Ä\u00ad\u00011\u001e\u0010\u000e ù»Aeª\u0018æ\u008a\u009534Õ£6(\u001d¥ÂQ\u001f\u001c\u0097\u0086\t\u0099ÃÞP&PFÂ\u001eôÒ8fqÈ?\u0099Âë3l\u009a\u0086M\u0080|\u0081\u0084ÔÕx\u0010K³\u0015æ÷W\u008c|O¯Êq\u0095X\u000b\u0015 \u0007 9³\u0015\u001d\u0084)\u0092\u0098d\u0010ö|Ï½;U\u008f\të|\u0083ºo\u000b\u008d,e\u0099¤f"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[8];
                     jg8 = new d3x();
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

                  var4 = "®\u000eEû\u0005\u00ad:Õäá\u008e\u0082¶ê\u0089\u0088¥\u0017\u0006Àò¿\u0013f\u0093ÍÜÊ9R>\u000bÈ²\u0097¬uA¹\u009dûb?\u009c°¬FºjÚÄ\u001c\u0098\u0088H}\u001eñ?Í\u008e\u001f±)\u00111.ø?jPX¹x£\u0005«9r·-å\u007ffÙW§_¶yª³8Þ{^(\u001a\u0089\u0093lªJ\u0092|\u0015v;ÜÛNÍÃ+Â\u0012O\u0099\u009f^\\\n'ÂL«CW§¦·]H9\u001d(à";
                  var6 = "®\u000eEû\u0005\u00ad:Õäá\u008e\u0082¶ê\u0089\u0088¥\u0017\u0006Àò¿\u0013f\u0093ÍÜÊ9R>\u000bÈ²\u0097¬uA¹\u009dûb?\u009c°¬FºjÚÄ\u001c\u0098\u0088H}\u001eñ?Í\u008e\u001f±)\u00111.ø?jPX¹x£\u0005«9r·-å\u007ffÙW§_¶yª³8Þ{^(\u001a\u0089\u0093lªJ\u0092|\u0015v;ÜÛNÍÃ+Â\u0012O\u0099\u009f^\\\n'ÂL«CW§¦·]H9\u001d(à"
                     .length();
                  var3 = '`';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29956;
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
            throw new RuntimeException("d3x", var10);
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
         throw new RuntimeException("d3x" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
