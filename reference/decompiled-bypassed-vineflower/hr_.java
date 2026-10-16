import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hr_ {
   public double uok;
   public double zmw;
   public double klp;
   public lc5 ewh;
   public t9d kzr;
   public i2h mok;
   public i2h k7u;
   public float s7e;
   public float fw9;
   public moh p52;
   public double _3y;
   public double b7y;
   public double xdg;
   public liu eul;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hr_(lc5 param1, y1w param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hr_.a J
      // 003: ldc2_w 91023091404698
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: invokespecial java/lang/Object.<init> ()V
      // 00c: aload 0
      // 00d: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 010: putfield hr_.esb Ljava/util/Map;
      // 013: aload 0
      // 014: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 017: putfield hr_.ea4 Ljava/util/Map;
      // 01a: aload 0
      // 01b: bipush 0
      // 01c: putfield hr_.nji Z
      // 01f: aload 0
      // 020: bipush 1
      // 021: putfield hr_.p7o Z
      // 024: aload 0
      // 025: bipush 0
      // 026: putfield hr_.olt Z
      // 029: aload 0
      // 02a: aconst_null
      // 02b: putfield hr_.eul Lliu;
      // 02e: aload 0
      // 02f: aload 1
      // 030: putfield hr_.ewh Llc5;
      // 033: aload 0
      // 034: getfield hr_.esb Ljava/util/Map;
      // 037: ldc doc
      // 039: nop
      // 03a: new faj
      // 03d: dup
      // 03e: aload 0
      // 03f: invokespecial faj.<init> (Lhr_;)V
      // 042: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 047: pop
      // 048: aload 0
      // 049: getfield hr_.esb Ljava/util/Map;
      // 04c: ldc u10
      // 04e: nop
      // 04f: new fjt
      // 052: dup
      // 053: aload 0
      // 054: invokespecial fjt.<init> (Lhr_;)V
      // 057: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 05c: pop
      // 05d: aload 0
      // 05e: getfield hr_.esb Ljava/util/Map;
      // 061: ldc _gj
      // 063: nop
      // 064: new f1j
      // 067: dup
      // 068: aload 0
      // 069: new luh
      // 06c: dup
      // 06d: invokespecial luh.<init> ()V
      // 070: ldc 0.7
      // 072: nop
      // 073: invokespecial f1j.<init> (Lhr_;Lg6r;F)V
      // 076: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 07b: pop
      // 07c: aload 0
      // 07d: getfield hr_.esb Ljava/util/Map;
      // 080: ldc ia2
      // 082: nop
      // 083: new t_r
      // 086: dup
      // 087: aload 0
      // 088: new i_t
      // 08b: dup
      // 08c: invokespecial i_t.<init> ()V
      // 08f: ldc 0.7
      // 091: nop
      // 092: invokespecial t_r.<init> (Lhr_;Lg6r;F)V
      // 095: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 09a: pop
      // 09b: invokestatic t9d.c ()I
      // 09e: aload 0
      // 09f: getfield hr_.esb Ljava/util/Map;
      // 0a2: ldc sss
      // 0a4: nop
      // 0a5: new kkl
      // 0a8: dup
      // 0a9: aload 0
      // 0aa: new zbw
      // 0ad: dup
      // 0ae: invokespecial zbw.<init> ()V
      // 0b1: ldc 0.7
      // 0b3: nop
      // 0b4: invokespecial kkl.<init> (Lhr_;Lg6r;F)V
      // 0b7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0bc: pop
      // 0bd: aload 0
      // 0be: getfield hr_.esb Ljava/util/Map;
      // 0c1: ldc ld0
      // 0c3: nop
      // 0c4: new fqu
      // 0c7: dup
      // 0c8: aload 0
      // 0c9: new zbw
      // 0cc: dup
      // 0cd: invokespecial zbw.<init> ()V
      // 0d0: ldc 0.7
      // 0d2: nop
      // 0d3: invokespecial fqu.<init> (Lhr_;Lg6r;F)V
      // 0d6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0db: pop
      // 0dc: aload 0
      // 0dd: getfield hr_.esb Ljava/util/Map;
      // 0e0: ldc gse
      // 0e2: nop
      // 0e3: new _0w
      // 0e6: dup
      // 0e7: aload 0
      // 0e8: new mpy
      // 0eb: dup
      // 0ec: invokespecial mpy.<init> ()V
      // 0ef: ldc 0.5
      // 0f1: nop
      // 0f2: invokespecial _0w.<init> (Lhr_;Lg6r;F)V
      // 0f5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fa: pop
      // 0fb: aload 0
      // 0fc: getfield hr_.esb Ljava/util/Map;
      // 0ff: ldc n78
      // 101: nop
      // 102: new xxr
      // 105: dup
      // 106: aload 0
      // 107: new wm8
      // 10a: dup
      // 10b: invokespecial wm8.<init> ()V
      // 10e: ldc 0.3
      // 110: nop
      // 111: invokespecial xxr.<init> (Lhr_;Lg6r;F)V
      // 114: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 119: pop
      // 11a: aload 0
      // 11b: getfield hr_.esb Ljava/util/Map;
      // 11e: ldc hu3
      // 120: nop
      // 121: new d9p
      // 124: dup
      // 125: aload 0
      // 126: new x2p
      // 129: dup
      // 12a: invokespecial x2p.<init> ()V
      // 12d: ldc 0.4
      // 12f: nop
      // 130: invokespecial d9p.<init> (Lhr_;Lg6r;F)V
      // 133: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 138: pop
      // 139: aload 0
      // 13a: getfield hr_.esb Ljava/util/Map;
      // 13d: ldc kxi
      // 13f: nop
      // 140: new svk
      // 143: dup
      // 144: aload 0
      // 145: new cw1
      // 148: dup
      // 149: invokespecial cw1.<init> ()V
      // 14c: ldc 0.3
      // 14e: nop
      // 14f: invokespecial svk.<init> (Lhr_;Lg6r;F)V
      // 152: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 157: pop
      // 158: aload 0
      // 159: getfield hr_.esb Ljava/util/Map;
      // 15c: ldc q1h
      // 15e: nop
      // 15f: new njn
      // 162: dup
      // 163: aload 0
      // 164: invokespecial njn.<init> (Lhr_;)V
      // 167: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 16c: pop
      // 16d: aload 0
      // 16e: getfield hr_.esb Ljava/util/Map;
      // 171: ldc tl9
      // 173: nop
      // 174: new zjj
      // 177: dup
      // 178: aload 0
      // 179: invokespecial zjj.<init> (Lhr_;)V
      // 17c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 181: pop
      // 182: aload 0
      // 183: getfield hr_.esb Ljava/util/Map;
      // 186: ldc gze
      // 188: nop
      // 189: new bbe
      // 18c: dup
      // 18d: aload 0
      // 18e: invokespecial bbe.<init> (Lhr_;)V
      // 191: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 196: pop
      // 197: istore 5
      // 199: aload 0
      // 19a: getfield hr_.esb Ljava/util/Map;
      // 19d: ldc a_t
      // 19f: nop
      // 1a0: new dnm
      // 1a3: dup
      // 1a4: aload 0
      // 1a5: invokespecial dnm.<init> (Lhr_;)V
      // 1a8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1ad: pop
      // 1ae: aload 0
      // 1af: getfield hr_.esb Ljava/util/Map;
      // 1b2: ldc qpg
      // 1b4: nop
      // 1b5: new wsr
      // 1b8: dup
      // 1b9: aload 0
      // 1ba: invokespecial wsr.<init> (Lhr_;)V
      // 1bd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1c2: pop
      // 1c3: aload 0
      // 1c4: getfield hr_.esb Ljava/util/Map;
      // 1c7: ldc jzg
      // 1c9: nop
      // 1ca: new jxe
      // 1cd: dup
      // 1ce: aload 0
      // 1cf: invokespecial jxe.<init> (Lhr_;)V
      // 1d2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1d7: pop
      // 1d8: aload 0
      // 1d9: getfield hr_.esb Ljava/util/Map;
      // 1dc: ldc zty
      // 1de: nop
      // 1df: new wd8
      // 1e2: dup
      // 1e3: aload 0
      // 1e4: invokespecial wd8.<init> (Lhr_;)V
      // 1e7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1ec: pop
      // 1ed: aload 0
      // 1ee: getfield hr_.esb Ljava/util/Map;
      // 1f1: ldc j91
      // 1f3: nop
      // 1f4: new j8y
      // 1f7: dup
      // 1f8: aload 0
      // 1f9: invokespecial j8y.<init> (Lhr_;)V
      // 1fc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 201: pop
      // 202: aload 0
      // 203: getfield hr_.esb Ljava/util/Map;
      // 206: ldc v9i
      // 208: nop
      // 209: new o8h
      // 20c: dup
      // 20d: aload 0
      // 20e: invokespecial o8h.<init> (Lhr_;)V
      // 211: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 216: pop
      // 217: aload 0
      // 218: getfield hr_.esb Ljava/util/Map;
      // 21b: ldc we7
      // 21d: nop
      // 21e: new wgm
      // 221: dup
      // 222: aload 0
      // 223: invokespecial wgm.<init> (Lhr_;)V
      // 226: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 22b: pop
      // 22c: aload 0
      // 22d: getfield hr_.esb Ljava/util/Map;
      // 230: ldc dge
      // 232: nop
      // 233: new d6z
      // 236: dup
      // 237: aload 0
      // 238: new vqh
      // 23b: dup
      // 23c: bipush 16
      // 23e: invokespecial vqh.<init> (I)V
      // 241: ldc 0.25
      // 243: nop
      // 244: invokespecial d6z.<init> (Lhr_;Lg6r;F)V
      // 247: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 24c: pop
      // 24d: aload 0
      // 24e: getfield hr_.esb Ljava/util/Map;
      // 251: ldc b41
      // 253: nop
      // 254: new ijy
      // 257: dup
      // 258: aload 0
      // 259: invokespecial ijy.<init> (Lhr_;)V
      // 25c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 261: pop
      // 262: aload 0
      // 263: getfield hr_.esb Ljava/util/Map;
      // 266: ldc ace
      // 268: nop
      // 269: new j66
      // 26c: dup
      // 26d: aload 0
      // 26e: new eur
      // 271: dup
      // 272: invokespecial eur.<init> ()V
      // 275: ldc 0.5
      // 277: nop
      // 278: ldc 6.0
      // 27a: nop
      // 27b: invokespecial j66.<init> (Lhr_;Lg6r;FF)V
      // 27e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 283: pop
      // 284: aload 0
      // 285: getfield hr_.esb Ljava/util/Map;
      // 288: ldc h_s
      // 28a: nop
      // 28b: new eza
      // 28e: dup
      // 28f: aload 0
      // 290: invokespecial eza.<init> (Lhr_;)V
      // 293: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 298: pop
      // 299: aload 0
      // 29a: getfield hr_.esb Ljava/util/Map;
      // 29d: ldc w8s
      // 29f: nop
      // 2a0: new xid
      // 2a3: dup
      // 2a4: aload 0
      // 2a5: new gub
      // 2a8: dup
      // 2a9: invokespecial gub.<init> ()V
      // 2ac: ldc 0.7
      // 2ae: nop
      // 2af: invokespecial xid.<init> (Lhr_;Lg6r;F)V
      // 2b2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2b7: pop
      // 2b8: aload 0
      // 2b9: getfield hr_.esb Ljava/util/Map;
      // 2bc: ldc ysf
      // 2be: nop
      // 2bf: new u7e
      // 2c2: dup
      // 2c3: aload 0
      // 2c4: invokespecial u7e.<init> (Lhr_;)V
      // 2c7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2cc: pop
      // 2cd: aload 0
      // 2ce: getfield hr_.esb Ljava/util/Map;
      // 2d1: ldc osf
      // 2d3: nop
      // 2d4: new stt
      // 2d7: dup
      // 2d8: aload 0
      // 2d9: invokespecial stt.<init> (Lhr_;)V
      // 2dc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2e1: pop
      // 2e2: aload 0
      // 2e3: getfield hr_.esb Ljava/util/Map;
      // 2e6: ldc l5f
      // 2e8: nop
      // 2e9: new fcl
      // 2ec: dup
      // 2ed: aload 0
      // 2ee: invokespecial fcl.<init> (Lhr_;)V
      // 2f1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2f6: pop
      // 2f7: aload 0
      // 2f8: getfield hr_.esb Ljava/util/Map;
      // 2fb: ldc c9p
      // 2fd: nop
      // 2fe: new _98
      // 301: dup
      // 302: aload 0
      // 303: invokespecial _98.<init> (Lhr_;)V
      // 306: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 30b: pop
      // 30c: aload 0
      // 30d: getfield hr_.esb Ljava/util/Map;
      // 310: ldc fcs
      // 312: nop
      // 313: new tt7
      // 316: dup
      // 317: aload 0
      // 318: invokespecial tt7.<init> (Lhr_;)V
      // 31b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 320: pop
      // 321: aload 0
      // 322: getfield hr_.esb Ljava/util/Map;
      // 325: ldc edl
      // 327: nop
      // 328: new a7k
      // 32b: dup
      // 32c: aload 0
      // 32d: invokespecial a7k.<init> (Lhr_;)V
      // 330: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 335: pop
      // 336: aload 0
      // 337: getfield hr_.esb Ljava/util/Map;
      // 33a: ldc ju8
      // 33c: nop
      // 33d: new _35
      // 340: dup
      // 341: aload 0
      // 342: invokespecial _35.<init> (Lhr_;)V
      // 345: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 34a: pop
      // 34b: aload 0
      // 34c: getfield hr_.esb Ljava/util/Map;
      // 34f: ldc i2h
      // 351: nop
      // 352: new lgo
      // 355: dup
      // 356: aload 0
      // 357: invokespecial lgo.<init> (Lhr_;)V
      // 35a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 35f: pop
      // 360: aload 0
      // 361: getfield hr_.esb Ljava/util/Map;
      // 364: ldc n0_
      // 366: nop
      // 367: new aby
      // 36a: dup
      // 36b: aload 0
      // 36c: invokespecial aby.<init> (Lhr_;)V
      // 36f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 374: pop
      // 375: aload 0
      // 376: getfield hr_.esb Ljava/util/Map;
      // 379: ldc co7
      // 37b: nop
      // 37c: new wo8
      // 37f: dup
      // 380: aload 0
      // 381: aload 2
      // 382: invokespecial wo8.<init> (Lhr_;Ly1w;)V
      // 385: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 38a: pop
      // 38b: aload 0
      // 38c: getfield hr_.esb Ljava/util/Map;
      // 38f: ldc ugc
      // 391: nop
      // 392: new y74
      // 395: dup
      // 396: aload 0
      // 397: invokespecial y74.<init> (Lhr_;)V
      // 39a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 39f: pop
      // 3a0: aload 0
      // 3a1: getfield hr_.esb Ljava/util/Map;
      // 3a4: ldc hy9
      // 3a6: nop
      // 3a7: new zqy
      // 3aa: dup
      // 3ab: aload 0
      // 3ac: invokespecial zqy.<init> (Lhr_;)V
      // 3af: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3b4: pop
      // 3b5: aload 0
      // 3b6: getfield hr_.esb Ljava/util/Map;
      // 3b9: ldc txr
      // 3bb: nop
      // 3bc: new jlk
      // 3bf: dup
      // 3c0: aload 0
      // 3c1: getstatic xbr.db4 Lu7m;
      // 3c4: aload 2
      // 3c5: invokespecial jlk.<init> (Lhr_;Lu7m;Ly1w;)V
      // 3c8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3cd: pop
      // 3ce: aload 0
      // 3cf: getfield hr_.esb Ljava/util/Map;
      // 3d2: ldc jv0
      // 3d4: nop
      // 3d5: new jlk
      // 3d8: dup
      // 3d9: aload 0
      // 3da: getstatic xbr.odc Lu7m;
      // 3dd: aload 2
      // 3de: invokespecial jlk.<init> (Lhr_;Lu7m;Ly1w;)V
      // 3e1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3e6: pop
      // 3e7: aload 0
      // 3e8: getfield hr_.esb Ljava/util/Map;
      // 3eb: ldc db9
      // 3ed: nop
      // 3ee: new jlk
      // 3f1: dup
      // 3f2: aload 0
      // 3f3: getstatic xbr.rr5 Lu7m;
      // 3f6: aload 2
      // 3f7: invokespecial jlk.<init> (Lhr_;Lu7m;Ly1w;)V
      // 3fa: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3ff: pop
      // 400: aload 0
      // 401: getfield hr_.esb Ljava/util/Map;
      // 404: ldc dur
      // 406: nop
      // 407: new jlk
      // 40a: dup
      // 40b: aload 0
      // 40c: getstatic xbr.ipl Lu7m;
      // 40f: aload 2
      // 410: invokespecial jlk.<init> (Lhr_;Lu7m;Ly1w;)V
      // 413: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 418: pop
      // 419: aload 0
      // 41a: getfield hr_.esb Ljava/util/Map;
      // 41d: ldc nuq
      // 41f: nop
      // 420: new h6x
      // 423: dup
      // 424: aload 0
      // 425: aload 2
      // 426: invokespecial h6x.<init> (Lhr_;Ly1w;)V
      // 429: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 42e: pop
      // 42f: aload 0
      // 430: getfield hr_.esb Ljava/util/Map;
      // 433: ldc vdu
      // 435: nop
      // 436: new jlk
      // 439: dup
      // 43a: aload 0
      // 43b: getstatic xbr.ttz Lu7m;
      // 43e: aload 2
      // 43f: invokespecial jlk.<init> (Lhr_;Lu7m;Ly1w;)V
      // 442: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 447: pop
      // 448: aload 0
      // 449: getfield hr_.esb Ljava/util/Map;
      // 44c: ldc nl9
      // 44e: nop
      // 44f: new jlk
      // 452: dup
      // 453: aload 0
      // 454: getstatic xbr.x9x Lu7m;
      // 457: aload 2
      // 458: invokespecial jlk.<init> (Lhr_;Lu7m;Ly1w;)V
      // 45b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 460: pop
      // 461: aload 0
      // 462: getfield hr_.esb Ljava/util/Map;
      // 465: ldc wqh
      // 467: nop
      // 468: new tps
      // 46b: dup
      // 46c: aload 0
      // 46d: fconst_2
      // 46e: invokespecial tps.<init> (Lhr_;F)V
      // 471: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 476: pop
      // 477: aload 0
      // 478: getfield hr_.esb Ljava/util/Map;
      // 47b: ldc ka8
      // 47d: nop
      // 47e: new tps
      // 481: dup
      // 482: aload 0
      // 483: ldc 0.5
      // 485: nop
      // 486: invokespecial tps.<init> (Lhr_;F)V
      // 489: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 48e: pop
      // 48f: aload 0
      // 490: getfield hr_.esb Ljava/util/Map;
      // 493: ldc k7p
      // 495: nop
      // 496: new spz
      // 499: dup
      // 49a: aload 0
      // 49b: invokespecial spz.<init> (Lhr_;)V
      // 49e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4a3: pop
      // 4a4: aload 0
      // 4a5: getfield hr_.esb Ljava/util/Map;
      // 4a8: ldc nvf
      // 4aa: nop
      // 4ab: new oqt
      // 4ae: dup
      // 4af: aload 0
      // 4b0: aload 2
      // 4b1: invokespecial oqt.<init> (Lhr_;Ly1w;)V
      // 4b4: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4b9: pop
      // 4ba: aload 0
      // 4bb: getfield hr_.esb Ljava/util/Map;
      // 4be: ldc uno
      // 4c0: nop
      // 4c1: new ild
      // 4c4: dup
      // 4c5: aload 0
      // 4c6: invokespecial ild.<init> (Lhr_;)V
      // 4c9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4ce: pop
      // 4cf: aload 0
      // 4d0: getfield hr_.esb Ljava/util/Map;
      // 4d3: ldc pix
      // 4d5: nop
      // 4d6: new r25
      // 4d9: dup
      // 4da: aload 0
      // 4db: invokespecial r25.<init> (Lhr_;)V
      // 4de: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4e3: pop
      // 4e4: aload 0
      // 4e5: getfield hr_.esb Ljava/util/Map;
      // 4e8: ldc vjf
      // 4ea: nop
      // 4eb: new uwp
      // 4ee: dup
      // 4ef: aload 0
      // 4f0: invokespecial uwp.<init> (Lhr_;)V
      // 4f3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4f8: pop
      // 4f9: aload 0
      // 4fa: getfield hr_.esb Ljava/util/Map;
      // 4fd: ldc h67
      // 4ff: nop
      // 500: new xb4
      // 503: dup
      // 504: aload 0
      // 505: invokespecial xb4.<init> (Lhr_;)V
      // 508: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 50d: pop
      // 50e: aload 0
      // 50f: getfield hr_.esb Ljava/util/Map;
      // 512: ldc dqh
      // 514: nop
      // 515: new mmr
      // 518: dup
      // 519: aload 0
      // 51a: invokespecial mmr.<init> (Lhr_;)V
      // 51d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 522: pop
      // 523: aload 0
      // 524: getfield hr_.esb Ljava/util/Map;
      // 527: ldc wpl
      // 529: nop
      // 52a: new cf_
      // 52d: dup
      // 52e: aload 0
      // 52f: invokespecial cf_.<init> (Lhr_;)V
      // 532: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 537: pop
      // 538: aload 0
      // 539: getfield hr_.esb Ljava/util/Map;
      // 53c: ldc _f3
      // 53e: nop
      // 53f: new ym7
      // 542: dup
      // 543: aload 0
      // 544: invokespecial ym7.<init> (Lhr_;)V
      // 547: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 54c: pop
      // 54d: aload 0
      // 54e: getfield hr_.esb Ljava/util/Map;
      // 551: ldc w54
      // 553: nop
      // 554: new v73
      // 557: dup
      // 558: aload 0
      // 559: invokespecial v73.<init> (Lhr_;)V
      // 55c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 561: pop
      // 562: aload 0
      // 563: getfield hr_.esb Ljava/util/Map;
      // 566: ldc sj_
      // 568: nop
      // 569: new ywi
      // 56c: dup
      // 56d: aload 0
      // 56e: invokespecial ywi.<init> (Lhr_;)V
      // 571: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 576: pop
      // 577: aload 0
      // 578: getfield hr_.esb Ljava/util/Map;
      // 57b: ldc zfo
      // 57d: nop
      // 57e: new pz5
      // 581: dup
      // 582: aload 0
      // 583: new nss
      // 586: dup
      // 587: invokespecial nss.<init> ()V
      // 58a: ldc 0.75
      // 58c: nop
      // 58d: invokespecial pz5.<init> (Lhr_;Lnss;F)V
      // 590: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 595: pop
      // 596: aload 0
      // 597: getfield hr_.esb Ljava/util/Map;
      // 59a: ldc _6b
      // 59c: nop
      // 59d: new etg
      // 5a0: dup
      // 5a1: aload 0
      // 5a2: invokespecial etg.<init> (Lhr_;)V
      // 5a5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5aa: pop
      // 5ab: aload 0
      // 5ac: new hrb
      // 5af: dup
      // 5b0: aload 0
      // 5b1: invokespecial hrb.<init> (Lhr_;)V
      // 5b4: putfield hr_.wyc Lhrb;
      // 5b7: aload 0
      // 5b8: getfield hr_.ea4 Ljava/util/Map;
      // 5bb: sipush 12301
      // 5be: ldc2_w 4465960505775370608
      // 5c1: lload 3
      // 5c2: lxor
      // 5c3: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c8: nop
      // 5c9: aload 0
      // 5ca: getfield hr_.wyc Lhrb;
      // 5cd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5d2: pop
      // 5d3: aload 0
      // 5d4: getfield hr_.ea4 Ljava/util/Map;
      // 5d7: sipush 1614
      // 5da: ldc2_w 7842696827467761458
      // 5dd: lload 3
      // 5de: lxor
      // 5df: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e4: nop
      // 5e5: new hrb
      // 5e8: dup
      // 5e9: aload 0
      // 5ea: bipush 1
      // 5eb: invokespecial hrb.<init> (Lhr_;Z)V
      // 5ee: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5f3: pop
      // 5f4: aload 0
      // 5f5: getfield hr_.ea4 Ljava/util/Map;
      // 5f8: invokestatic net/optifine/player/PlayerItemsLayer.register (Ljava/util/Map;)V
      // 5fb: getstatic net/optifine/reflect/Reflector.RenderingRegistry_loadEntityRenderers Lnet/optifine/reflect/ReflectorMethod;
      // 5fe: iload 5
      // 600: ifne 62c
      // 603: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 606: ifeq 62d
      // 609: goto 610
      // 60c: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60f: athrow
      // 610: getstatic net/optifine/reflect/Reflector.RenderingRegistry_loadEntityRenderers Lnet/optifine/reflect/ReflectorMethod;
      // 613: bipush 2
      // 614: anewarray 84
      // 617: dup
      // 618: bipush 0
      // 619: aload 0
      // 61a: aastore
      // 61b: dup
      // 61c: bipush 1
      // 61d: aload 0
      // 61e: getfield hr_.esb Ljava/util/Map;
      // 621: aastore
      // 622: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 625: goto 62c
      // 628: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62b: athrow
      // 62c: pop
      // 62d: return
   }

   public void ojk(double var1, double var3, double var5) {
      this.uok = var1;
      this.zmw = var3;
      this.klp = var5;
   }

   public liu n42(Class param1) {
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
      // 05: getfield hr_.esb Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast liu
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 50
      // 17: ifnonnull 4f
      // 1a: goto 21
      // 1d: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 1
      // 22: iload 2
      // 23: ifne 4e
      // 26: goto 2d
      // 29: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: ldc i2h
      // 2f: nop
      // 30: if_acmpeq 4f
      // 33: goto 3a
      // 36: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokevirtual java/lang/Class.getSuperclass ()Ljava/lang/Class;
      // 3f: invokevirtual hr_.n42 (Ljava/lang/Class;)Lliu;
      // 42: astore 3
      // 43: aload 0
      // 44: getfield hr_.esb Ljava/util/Map;
      // 47: aload 1
      // 48: aload 3
      // 49: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4e: pop
      // 4f: aload 3
      // 50: areturn
   }

   public liu ihn(i2h param1) {
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
      // 05: iload 2
      // 06: ifeq 1e
      // 09: instanceof x0l
      // 0c: ifeq 4e
      // 0f: goto 16
      // 12: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: goto 1e
      // 1a: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: checkcast x0l
      // 21: invokevirtual x0l.pxl ()Ljava/lang/String;
      // 24: astore 3
      // 25: aload 0
      // 26: getfield hr_.ea4 Ljava/util/Map;
      // 29: aload 3
      // 2a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2f: checkcast hrb
      // 32: astore 4
      // 34: aload 4
      // 36: iload 2
      // 37: ifeq 46
      // 3a: ifnull 49
      // 3d: goto 44
      // 40: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 4
      // 46: goto 4d
      // 49: aload 0
      // 4a: getfield hr_.wyc Lhrb;
      // 4d: areturn
      // 4e: aload 0
      // 4f: aload 1
      // 50: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 53: invokevirtual hr_.n42 (Ljava/lang/Class;)Lliu;
      // 56: areturn
   }

   public void gvh(t9d param1, owt param2, i2h param3, i2h param4, moh param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: putfield hr_.kzr Lt9d;
      // 005: invokestatic t9d.b ()I
      // 008: aload 0
      // 009: aload 5
      // 00b: putfield hr_.p52 Lmoh;
      // 00e: istore 7
      // 010: aload 0
      // 011: aload 3
      // 012: putfield hr_.mok Li2h;
      // 015: aload 0
      // 016: aload 4
      // 018: putfield hr_.k7u Li2h;
      // 01b: aload 0
      // 01c: aload 2
      // 01d: putfield hr_.ql4 Lowt;
      // 020: iload 7
      // 022: ifeq 12a
      // 025: aload 3
      // 026: instanceof g_3
      // 029: ifeq 10e
      // 02c: goto 033
      // 02f: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: aload 3
      // 034: checkcast g_3
      // 037: invokevirtual g_3.ofg ()Z
      // 03a: ifeq 10e
      // 03d: goto 044
      // 040: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: aload 1
      // 045: new mew
      // 048: dup
      // 049: aload 3
      // 04a: invokespecial mew.<init> (Li2h;)V
      // 04d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 050: astore 8
      // 052: aload 8
      // 054: invokeinterface zfz.r_y ()Le0x; 1
      // 059: astore 9
      // 05b: aload 9
      // 05d: iload 7
      // 05f: ifeq 0de
      // 062: getstatic net/optifine/reflect/Reflector.ForgeBlock_isBed Lnet/optifine/reflect/ReflectorMethod;
      // 065: bipush 4
      // 066: anewarray 84
      // 069: dup
      // 06a: bipush 0
      // 06b: aload 8
      // 06d: aastore
      // 06e: dup
      // 06f: bipush 1
      // 070: aload 1
      // 071: aastore
      // 072: dup
      // 073: bipush 2
      // 074: new mew
      // 077: dup
      // 078: aload 3
      // 079: invokespecial mew.<init> (Li2h;)V
      // 07c: aastore
      // 07d: dup
      // 07e: bipush 3
      // 07f: aload 3
      // 080: checkcast g_3
      // 083: aastore
      // 084: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 087: ifeq 0d5
      // 08a: goto 091
      // 08d: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: aload 9
      // 093: getstatic net/optifine/reflect/Reflector.ForgeBlock_getBedDirection Lnet/optifine/reflect/ReflectorMethod;
      // 096: bipush 3
      // 097: anewarray 84
      // 09a: dup
      // 09b: bipush 0
      // 09c: aload 8
      // 09e: aastore
      // 09f: dup
      // 0a0: bipush 1
      // 0a1: aload 1
      // 0a2: aastore
      // 0a3: dup
      // 0a4: bipush 2
      // 0a5: new mew
      // 0a8: dup
      // 0a9: aload 3
      // 0aa: invokespecial mew.<init> (Li2h;)V
      // 0ad: aastore
      // 0ae: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b1: checkcast vt2
      // 0b4: astore 10
      // 0b6: aload 10
      // 0b8: invokevirtual vt2.tmy ()I
      // 0bb: istore 11
      // 0bd: aload 0
      // 0be: iload 11
      // 0c0: bipush 90
      // 0c2: imul
      // 0c3: sipush 180
      // 0c6: iadd
      // 0c7: i2f
      // 0c8: putfield hr_.s7e F
      // 0cb: aload 0
      // 0cc: fconst_0
      // 0cd: putfield hr_.fw9 F
      // 0d0: iload 7
      // 0d2: ifne 109
      // 0d5: aload 9
      // 0d7: goto 0de
      // 0da: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dd: athrow
      // 0de: getstatic ox_.a6l Le0x;
      // 0e1: if_acmpne 109
      // 0e4: aload 8
      // 0e6: getstatic _8w.em9 Lqx_;
      // 0e9: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ee: checkcast vt2
      // 0f1: invokevirtual vt2.tmy ()I
      // 0f4: istore 10
      // 0f6: aload 0
      // 0f7: iload 10
      // 0f9: bipush 90
      // 0fb: imul
      // 0fc: sipush 180
      // 0ff: iadd
      // 100: i2f
      // 101: putfield hr_.s7e F
      // 104: aload 0
      // 105: fconst_0
      // 106: putfield hr_.fw9 F
      // 109: iload 7
      // 10b: ifne 13f
      // 10e: aload 0
      // 10f: aload 3
      // 110: getfield i2h.p3h F
      // 113: aload 3
      // 114: getfield i2h.x5k F
      // 117: aload 3
      // 118: getfield i2h.p3h F
      // 11b: fsub
      // 11c: fload 6
      // 11e: fmul
      // 11f: fadd
      // 120: putfield hr_.s7e F
      // 123: goto 12a
      // 126: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: aload 0
      // 12b: aload 3
      // 12c: getfield i2h.j25 F
      // 12f: aload 3
      // 130: getfield i2h.y2i F
      // 133: aload 3
      // 134: getfield i2h.j25 F
      // 137: fsub
      // 138: fload 6
      // 13a: fmul
      // 13b: fadd
      // 13c: putfield hr_.fw9 F
      // 13f: aload 5
      // 141: getfield moh.i_y I
      // 144: bipush 2
      // 145: if_icmpne 15b
      // 148: aload 0
      // 149: dup
      // 14a: getfield hr_.s7e F
      // 14d: ldc 180.0
      // 14f: nop
      // 150: fadd
      // 151: putfield hr_.s7e F
      // 154: goto 15b
      // 157: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: aload 0
      // 15c: aload 3
      // 15d: getfield i2h.ivp D
      // 160: aload 3
      // 161: getfield i2h.o2v D
      // 164: aload 3
      // 165: getfield i2h.ivp D
      // 168: dsub
      // 169: fload 6
      // 16b: f2d
      // 16c: dmul
      // 16d: dadd
      // 16e: putfield hr_._3y D
      // 171: aload 0
      // 172: aload 3
      // 173: getfield i2h.c54 D
      // 176: aload 3
      // 177: getfield i2h.kfp D
      // 17a: aload 3
      // 17b: getfield i2h.c54 D
      // 17e: dsub
      // 17f: fload 6
      // 181: f2d
      // 182: dmul
      // 183: dadd
      // 184: putfield hr_.b7y D
      // 187: aload 0
      // 188: aload 3
      // 189: getfield i2h.e2b D
      // 18c: aload 3
      // 18d: getfield i2h.vbd D
      // 190: aload 3
      // 191: getfield i2h.e2b D
      // 194: dsub
      // 195: fload 6
      // 197: f2d
      // 198: dmul
      // 199: dadd
      // 19a: putfield hr_.xdg D
      // 19d: return
   }

   public void y_o(float var1) {
      this.s7e = var1;
   }

   public boolean ka6() {
      return this.p7o;
   }

   public void bbs(boolean var1) {
      this.p7o = var1;
   }

   public void jes(boolean var1) {
      this.olt = var1;
   }

   public boolean z6e() {
      return this.olt;
   }

   public boolean dxc(i2h var1, float var2) {
      return this.i_3(var1, var2, false);
   }

   public boolean pgp(i2h var1, _aq var2, double var3, double var5, double var7) {
      int var9 = t9d.b();
      liu var10 = this.ihn(var1);

      liu var10000;
      label33: {
         try {
            var10000 = var10;
            if (var9 == 0) {
               break label33;
            }

            if (var10 == null) {
               return false;
            }
         } catch (oov var12) {
            throw a(var12);
         }

         var10000 = var10;
      }

      try {
         boolean var13 = var10000.h12(var1, var2, var3, var5, var7);
         if (var9 == 0) {
            return var13;
         }

         if (var13) {
            return true;
         }
      } catch (oov var11) {
         throw a(var11);
      }

      return false;
   }

   public boolean i_3(i2h param1, float param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifeq 38
      // 0b: getfield i2h.g25 I
      // 0e: ifne 37
      // 11: goto 18
      // 14: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 1
      // 19: aload 1
      // 1a: getfield i2h.o2v D
      // 1d: putfield i2h.ivp D
      // 20: aload 1
      // 21: aload 1
      // 22: getfield i2h.kfp D
      // 25: putfield i2h.c54 D
      // 28: aload 1
      // 29: aload 1
      // 2a: getfield i2h.vbd D
      // 2d: putfield i2h.e2b D
      // 30: goto 37
      // 33: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 1
      // 38: getfield i2h.ivp D
      // 3b: aload 1
      // 3c: getfield i2h.o2v D
      // 3f: aload 1
      // 40: getfield i2h.ivp D
      // 43: dsub
      // 44: fload 2
      // 45: f2d
      // 46: dmul
      // 47: dadd
      // 48: dstore 5
      // 4a: aload 1
      // 4b: getfield i2h.c54 D
      // 4e: aload 1
      // 4f: getfield i2h.kfp D
      // 52: aload 1
      // 53: getfield i2h.c54 D
      // 56: dsub
      // 57: fload 2
      // 58: f2d
      // 59: dmul
      // 5a: dadd
      // 5b: dstore 7
      // 5d: aload 1
      // 5e: getfield i2h.e2b D
      // 61: aload 1
      // 62: getfield i2h.vbd D
      // 65: aload 1
      // 66: getfield i2h.e2b D
      // 69: dsub
      // 6a: fload 2
      // 6b: f2d
      // 6c: dmul
      // 6d: dadd
      // 6e: dstore 9
      // 70: aload 1
      // 71: getfield i2h.p3h F
      // 74: aload 1
      // 75: getfield i2h.x5k F
      // 78: aload 1
      // 79: getfield i2h.p3h F
      // 7c: fsub
      // 7d: fload 2
      // 7e: fmul
      // 7f: fadd
      // 80: fstore 11
      // 82: aload 1
      // 83: fload 2
      // 84: invokevirtual i2h.azk (F)I
      // 87: istore 12
      // 89: aload 1
      // 8a: invokevirtual i2h.agj ()Z
      // 8d: iload 4
      // 8f: ifeq a7
      // 92: ifeq a1
      // 95: goto 9c
      // 98: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: ldc 15728880
      // 9e: nop
      // 9f: istore 12
      // a1: iload 12
      // a3: ldc 65536
      // a5: nop
      // a6: irem
      // a7: istore 13
      // a9: iload 12
      // ab: ldc 65536
      // ad: nop
      // ae: idiv
      // af: istore 14
      // b1: getstatic gis.exn I
      // b4: iload 13
      // b6: i2f
      // b7: fconst_1
      // b8: fdiv
      // b9: iload 14
      // bb: i2f
      // bc: fconst_1
      // bd: fdiv
      // be: invokestatic gis.w9e (IFF)V
      // c1: fconst_1
      // c2: fconst_1
      // c3: fconst_1
      // c4: fconst_1
      // c5: invokestatic hzu.wn0 (FFFF)V
      // c8: aload 0
      // c9: aload 1
      // ca: dload 5
      // cc: aload 0
      // cd: getfield hr_.uok D
      // d0: dsub
      // d1: dload 7
      // d3: aload 0
      // d4: getfield hr_.zmw D
      // d7: dsub
      // d8: dload 9
      // da: aload 0
      // db: getfield hr_.klp D
      // de: dsub
      // df: fload 11
      // e1: fload 2
      // e2: iload 3
      // e3: invokevirtual hr_.yxz (Li2h;DDDFFZ)Z
      // e6: ireturn
   }

   public void xm5(i2h var1, float var2) {
      double var3 = var1.ivp + (var1.o2v - var1.ivp) * (double)var2;
      double var5 = var1.c54 + (var1.kfp - var1.c54) * (double)var2;
      double var7 = var1.e2b + (var1.vbd - var1.e2b) * (double)var2;
      liu var9 = this.ihn(var1);

      try {
         if (var9 == null || this.ewh == null) {
            return;
         }
      } catch (oov var13) {
         throw a(var13);
      }

      int var10 = var1.azk(var2);
      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      gis.w9e(gis.exn, (float)var11 / 1.0F, (float)var12 / 1.0F);
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      var9.ix5(var1, var3 - this.uok, var5 - this.zmw, var7 - this.klp);
   }

   public boolean ajg(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      return this.yxz(var1, var2, var4, var6, var8, var9, false);
   }

   public boolean yxz(i2h param1, double param2, double param4, double param6, float param8, float param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hr_.a J
      // 003: ldc2_w 134340691872673
      // 006: lxor
      // 007: lstore 11
      // 009: invokestatic t9d.b ()I
      // 00c: istore 13
      // 00e: aconst_null
      // 00f: astore 14
      // 011: aload 0
      // 012: aload 1
      // 013: invokevirtual hr_.ihn (Li2h;)Lliu;
      // 016: astore 14
      // 018: aload 14
      // 01a: ifnull 14c
      // 01d: aload 0
      // 01e: getfield hr_.ewh Llc5;
      // 021: iload 13
      // 023: ifeq 150
      // 026: goto 02d
      // 029: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: ifnull 14c
      // 030: goto 037
      // 033: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 14
      // 039: instanceof gmu
      // 03c: iload 13
      // 03e: ifeq 061
      // 041: ifeq 05e
      // 044: goto 04b
      // 047: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: aload 14
      // 04d: checkcast gmu
      // 050: aload 0
      // 051: getfield hr_.nji Z
      // 054: invokevirtual gmu.r8d (Z)V
      // 057: goto 05e
      // 05a: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: invokestatic net/optifine/entity/model/CustomEntityModels.isActive ()Z
      // 061: ifeq 071
      // 064: aload 0
      // 065: aload 14
      // 067: putfield hr_.eul Lliu;
      // 06a: goto 071
      // 06d: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: aload 14
      // 073: aload 1
      // 074: dload 2
      // 075: dload 4
      // 077: dload 6
      // 079: fload 8
      // 07b: fload 9
      // 07d: invokevirtual liu.apl (Li2h;DDDFF)V
      // 080: goto 0a1
      // 083: astore 15
      // 085: new oov
      // 088: dup
      // 089: aload 15
      // 08b: sipush 23800
      // 08e: ldc2_w 1728181363844422066
      // 091: lload 11
      // 093: lxor
      // 094: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: nop
      // 09a: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 09d: invokespecial oov.<init> (Le1i;)V
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield hr_.nji Z
      // 0a5: ifne 0b7
      // 0a8: aload 14
      // 0aa: aload 1
      // 0ab: dload 2
      // 0ac: dload 4
      // 0ae: dload 6
      // 0b0: fload 8
      // 0b2: fload 9
      // 0b4: invokevirtual liu.tqt (Li2h;DDDFF)V
      // 0b7: goto 0d8
      // 0ba: astore 15
      // 0bc: new oov
      // 0bf: dup
      // 0c0: aload 15
      // 0c2: sipush 10821
      // 0c5: ldc2_w 3592555631783243532
      // 0c8: lload 11
      // 0ca: lxor
      // 0cb: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 0d4: invokespecial oov.<init> (Le1i;)V
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: getfield hr_.olt Z
      // 0dc: iload 13
      // 0de: ifeq 156
      // 0e1: ifeq 155
      // 0e4: goto 0eb
      // 0e7: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: aload 1
      // 0ec: invokevirtual i2h.h5u ()Z
      // 0ef: iload 13
      // 0f1: ifeq 156
      // 0f4: goto 0fb
      // 0f7: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: ifne 155
      // 0fe: goto 105
      // 101: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: iload 10
      // 107: iload 13
      // 109: ifeq 156
      // 10c: goto 113
      // 10f: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: ifne 155
      // 116: goto 11d
      // 119: invokestatic hr_.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 0
      // 11e: aload 1
      // 11f: dload 2
      // 120: dload 4
      // 122: dload 6
      // 124: fload 8
      // 126: fload 9
      // 128: invokespecial hr_.x3y (Li2h;DDDFF)V
      // 12b: goto 155
      // 12e: astore 15
      // 130: new oov
      // 133: dup
      // 134: aload 15
      // 136: sipush 18097
      // 139: ldc2_w 5103351544510546940
      // 13c: lload 11
      // 13e: lxor
      // 13f: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: nop
      // 145: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 148: invokespecial oov.<init> (Le1i;)V
      // 14b: athrow
      // 14c: aload 0
      // 14d: getfield hr_.ewh Llc5;
      // 150: ifnull 155
      // 153: bipush 0
      // 154: ireturn
      // 155: bipush 1
      // 156: ireturn
      // 157: astore 15
      // 159: aload 15
      // 15b: sipush 8061
      // 15e: ldc2_w 4372492538105813557
      // 161: lload 11
      // 163: lxor
      // 164: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: nop
      // 16a: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 16d: astore 16
      // 16f: aload 16
      // 171: sipush 24185
      // 174: ldc2_w 7924015169627986738
      // 177: lload 11
      // 179: lxor
      // 17a: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: nop
      // 180: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 183: astore 17
      // 185: aload 1
      // 186: aload 17
      // 188: invokevirtual i2h.gfa (Lwsc;)V
      // 18b: aload 16
      // 18d: sipush 30853
      // 190: ldc2_w 6966843179882954185
      // 193: lload 11
      // 195: lxor
      // 196: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: nop
      // 19c: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 19f: astore 18
      // 1a1: aload 18
      // 1a3: sipush 6480
      // 1a6: ldc2_w 553455002142923807
      // 1a9: lload 11
      // 1ab: lxor
      // 1ac: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: nop
      // 1b2: aload 14
      // 1b4: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 1b7: aload 18
      // 1b9: sipush 16535
      // 1bc: ldc2_w 7419368317211117017
      // 1bf: lload 11
      // 1c1: lxor
      // 1c2: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: nop
      // 1c8: dload 2
      // 1c9: dload 4
      // 1cb: dload 6
      // 1cd: invokestatic wsc.elx (DDD)Ljava/lang/String;
      // 1d0: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 1d3: aload 18
      // 1d5: sipush 16228
      // 1d8: ldc2_w 5826261912042371617
      // 1db: lload 11
      // 1dd: lxor
      // 1de: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: nop
      // 1e4: fload 8
      // 1e6: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1e9: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 1ec: aload 18
      // 1ee: sipush 21520
      // 1f1: ldc2_w 8405287714370261332
      // 1f4: lload 11
      // 1f6: lxor
      // 1f7: invokedynamic k (IJ)Ljava/lang/String; bsm=hr_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: nop
      // 1fd: fload 9
      // 1ff: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 202: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 205: new oov
      // 208: dup
      // 209: aload 16
      // 20b: invokespecial oov.<init> (Le1i;)V
      // 20e: athrow
   }

   private void x3y(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      hzu.jun(false);
      hzu.m_1();
      hzu.fpt();
      hzu.o1b();
      hzu.ux6();
      float var10 = var1.uo6 / 2.0F;
      nh4 var11 = var1.aaw();
      nh4 var12 = new nh4(
         var11.rlc - var1.o2v + var2,
         var11.bx_ - var1.kfp + var4,
         var11.t8n - var1.vbd + var6,
         var11.t_2 - var1.o2v + var2,
         var11.i2c - var1.kfp + var4,
         var11.oqj - var1.vbd + var6
      );
      crp.h_0(var12, 255, 255, 255, 255);
      if (var1 instanceof g_3) {
         float var13 = 0.01F;
         crp.h_0(
            new nh4(
               var2 - (double)var10,
               var4 + (double)var1.c5y() - 0.01F,
               var6 - (double)var10,
               var2 + (double)var10,
               var4 + (double)var1.c5y() + 0.01F,
               var6 + (double)var10
            ),
            255,
            0,
            0,
            255
         );
      }

      jom var16 = jom.yut();
      q3g var14 = var16.zuq();
      fqr var15 = var1.wej(var9);
      var14.ezr(3, gnl.gec);
      var14.g5o(var2, var4 + (double)var1.c5y(), var6).fje(0, 0, 255, 255).pzw();
      var14.g5o(var2 + var15.lvi * 2.0, var4 + (double)var1.c5y() + var15.gn5 * 2.0, var6 + var15.bn2 * 2.0).fje(0, 0, 255, 255).pzw();
      var16.q7g();
      hzu.rqj();
      hzu.s7q();
      hzu.gp4();
      hzu.ux6();
      hzu.jun(true);
   }

   public void coo(t9d var1) {
      this.kzr = var1;
   }

   public double m8_(double var1, double var3, double var5) {
      double var7 = var1 - this._3y;
      double var9 = var3 - this.b7y;
      double var11 = var5 - this.xdg;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public owt mad() {
      return this.ql4;
   }

   public void n8u(boolean var1) {
      this.nji = var1;
   }

   public Map uee() {
      return this.esb;
   }

   public void icb(Map var1) {
      this.esb = var1;
   }

   public Map ymr() {
      return Collections.unmodifiableMap(this.ea4);
   }

   public double yky() {
      return this.uok;
   }

   public double fxk() {
      return this.zmw;
   }

   public double kux() {
      return this.klp;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5426753312806699088L, -6038793072491375543L, MethodHandles.lookup().lookupClass()).a(138149831918725L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 28052896124269L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "Z^\u0006ñõK?j·6,Ï÷,ê\u001drztffp¼á\u0095> \u000fã\u0090§ÇÓ\u0012ï ¦gîê\u0011!\u0084a\u008cFm\u0084üJ±np\u0086ö\u008bBRäH\u009b\r\rË(+9\u009fÍ=CóqÌ\u001a¶\u009bw¹Tsøu\u0091[^G1jZ5&Ý+A\u009cS\u009e\u000bs·×E\u009900õß>ª9\u009bÜTBÅ\u000f\u0013\u0099Þ%:QÌî?ê¬«wý«^ó°Å\u00925]ñUä\u001eÜ\u009f½\u0094,\u000eÑzv\u0084; ]\u0014t\u007fÐ\u0090N@JC.@èÔ¿»hÇ<D_\u0096}ø hFg\u0080ÈO¡8\u0096.¦ \u008e@\u0080\u0002\u0080\"\n/+ç¢y·Y£Üïsi«\u0099èL\"i\u008b1Ö\u009e\t%;-:v&d\u0006î\u0003;a_uq||Þ\u0018ü6\u00868\u0018\u000f\u0007~qÉ}å.;\u0090\u0001µlõ·cW\u001eóä]Ê\u0016\u0086ëÆü6ò<\u008eä\u008fIJ\u0086\u0092B\u001e@\u0082  õ\u0083\u008b\u0086\u0006ìjú\u009e\u009b\u001b5(4N]fè|sE\u0019à\\ÞúTPË¸\u0083\u000bë~Ôtú\u0084cp6\u0007é¿gÉ½±\u0012%*¤°8°uYJo\u0012\u008cUm\u00823zC\u0013Z5ÝÁ(Z¦°$\u0089àmMþ\u0014_5m²\u0088N\r\u0005Ê\u000fÉWûT B»y\u000fiÆìÎ½\u0084ÈÊ ½\u0013øø\u007fð¨\u0080\u0084v93\u0085\u008câS\u0096Hu'ð-ñ9}\u0083g\u0098\u001c\u008at2\u0010»J¤:Þæú\u0091õ\u0001#P6\u009c8§";
      int var8 = "Z^\u0006ñõK?j·6,Ï÷,ê\u001drztffp¼á\u0095> \u000fã\u0090§ÇÓ\u0012ï ¦gîê\u0011!\u0084a\u008cFm\u0084üJ±np\u0086ö\u008bBRäH\u009b\r\rË(+9\u009fÍ=CóqÌ\u001a¶\u009bw¹Tsøu\u0091[^G1jZ5&Ý+A\u009cS\u009e\u000bs·×E\u009900õß>ª9\u009bÜTBÅ\u000f\u0013\u0099Þ%:QÌî?ê¬«wý«^ó°Å\u00925]ñUä\u001eÜ\u009f½\u0094,\u000eÑzv\u0084; ]\u0014t\u007fÐ\u0090N@JC.@èÔ¿»hÇ<D_\u0096}ø hFg\u0080ÈO¡8\u0096.¦ \u008e@\u0080\u0002\u0080\"\n/+ç¢y·Y£Üïsi«\u0099èL\"i\u008b1Ö\u009e\t%;-:v&d\u0006î\u0003;a_uq||Þ\u0018ü6\u00868\u0018\u000f\u0007~qÉ}å.;\u0090\u0001µlõ·cW\u001eóä]Ê\u0016\u0086ëÆü6ò<\u008eä\u008fIJ\u0086\u0092B\u001e@\u0082  õ\u0083\u008b\u0086\u0006ìjú\u009e\u009b\u001b5(4N]fè|sE\u0019à\\ÞúTPË¸\u0083\u000bë~Ôtú\u0084cp6\u0007é¿gÉ½±\u0012%*¤°8°uYJo\u0012\u008cUm\u00823zC\u0013Z5ÝÁ(Z¦°$\u0089àmMþ\u0014_5m²\u0088N\r\u0005Ê\u000fÉWûT B»y\u000fiÆìÎ½\u0084ÈÊ ½\u0013øø\u007fð¨\u0080\u0084v93\u0085\u008câS\u0096Hu'ð-ñ9}\u0083g\u0098\u001c\u008at2\u0010»J¤:Þæú\u0091õ\u0001#P6\u009c8§"
         .length();
      char var5 = '@';
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
                     c = new String[12];
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

                  var6 = "\u008dÏñèY\u001d\u00035\u009b$0\u0082\u007fy\u0085`\u0010Od¬\rÇ3\"È\u0010VF^ê&Q\u0081";
                  var8 = "\u008dÏñèY\u001d\u00035\u009b$0\u0082\u007fy\u0085`\u0010Od¬\rÇ3\"È\u0010VF^ê&Q\u0081".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15880;
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
            throw new RuntimeException("hr_", var10);
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
         throw new RuntimeException("hr_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
