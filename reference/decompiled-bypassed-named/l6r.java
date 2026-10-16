import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l6r extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 53337266109633L;
      return b<"g">(6620, 7049215551084531879L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 68705775771719L;
      return b<"g">(17881, 2477719460045656110L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic l6r.a J
      // 003: ldc2_w 57729477855620
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: iload 5
      // 010: ifne 03e
      // 013: arraylength
      // 014: bipush 2
      // 015: if_icmpge 03d
      // 018: goto 01f
      // 01b: invokestatic l6r.a (Loov;)Loov;
      // 01e: athrow
      // 01f: new w57
      // 022: dup
      // 023: sipush 28284
      // 026: ldc2_w 7089181900132520524
      // 029: lload 3
      // 02a: lxor
      // 02b: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: bipush 0
      // 032: anewarray 33
      // 035: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 038: athrow
      // 039: invokestatic l6r.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 2
      // 03e: bipush 1
      // 03f: aaload
      // 040: invokestatic l9p._02 (Ljava/lang/String;)L_ss;
      // 043: astore 6
      // 045: aload 6
      // 047: ifnonnull 08d
      // 04a: aload 2
      // 04b: bipush 1
      // 04c: aaload
      // 04d: ldc "*"
      // 04f: nop
      // 050: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 053: iload 5
      // 055: ifne 08f
      // 058: goto 05f
      // 05b: invokestatic l6r.a (Loov;)Loov;
      // 05e: athrow
      // 05f: ifne 08d
      // 062: goto 069
      // 065: invokestatic l6r.a (Loov;)Loov;
      // 068: athrow
      // 069: new uvb
      // 06c: dup
      // 06d: sipush 21628
      // 070: ldc2_w 870283633467893827
      // 073: lload 3
      // 074: lxor
      // 075: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: nop
      // 07b: bipush 1
      // 07c: anewarray 33
      // 07f: dup
      // 080: bipush 0
      // 081: aload 2
      // 082: bipush 1
      // 083: aaload
      // 084: aastore
      // 085: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 088: athrow
      // 089: invokestatic l6r.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 2
      // 08e: arraylength
      // 08f: bipush 3
      // 090: if_icmplt 0a1
      // 093: aload 1
      // 094: aload 2
      // 095: bipush 2
      // 096: aaload
      // 097: invokestatic l6r.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 09a: goto 0a5
      // 09d: invokestatic l6r.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 1
      // 0a2: invokestatic l6r.cfc (Le7r;)Lz96;
      // 0a5: astore 7
      // 0a7: aload 2
      // 0a8: bipush 0
      // 0a9: aaload
      // 0aa: sipush 26623
      // 0ad: ldc2_w 3719958319983926221
      // 0b0: lload 3
      // 0b1: lxor
      // 0b2: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: nop
      // 0b8: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0bb: istore 8
      // 0bd: aload 2
      // 0be: bipush 0
      // 0bf: aaload
      // 0c0: sipush 32389
      // 0c3: ldc2_w 5622393169200841398
      // 0c6: lload 3
      // 0c7: lxor
      // 0c8: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: nop
      // 0ce: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0d1: istore 9
      // 0d3: iload 8
      // 0d5: iload 5
      // 0d7: ifne 0e6
      // 0da: ifne 0e9
      // 0dd: goto 0e4
      // 0e0: invokestatic l6r.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: iload 9
      // 0e6: ifeq 4b5
      // 0e9: aload 6
      // 0eb: iload 5
      // 0ed: ifne 1e9
      // 0f0: goto 0f7
      // 0f3: invokestatic l6r.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: ifnonnull 1e0
      // 0fa: goto 101
      // 0fd: invokestatic l6r.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 8
      // 103: iload 5
      // 105: ifne 17e
      // 108: goto 10f
      // 10b: invokestatic l6r.a (Loov;)Loov;
      // 10e: athrow
      // 10f: ifeq 175
      // 112: goto 119
      // 115: invokestatic l6r.a (Loov;)Loov;
      // 118: athrow
      // 119: getstatic y8d.i0s Ljava/util/List;
      // 11c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 121: astore 10
      // 123: aload 10
      // 125: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 12a: ifeq 151
      // 12d: aload 10
      // 12f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 134: checkcast l7l
      // 137: astore 11
      // 139: aload 7
      // 13b: aload 11
      // 13d: invokevirtual z96.aex (L_ss;)V
      // 140: iload 5
      // 142: ifne 170
      // 145: iload 5
      // 147: ifeq 123
      // 14a: goto 151
      // 14d: invokestatic l6r.a (Loov;)Loov;
      // 150: athrow
      // 151: aload 1
      // 152: aload 0
      // 153: sipush 872
      // 156: ldc2_w 7578900333849476959
      // 159: lload 3
      // 15a: lxor
      // 15b: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: nop
      // 161: bipush 1
      // 162: anewarray 33
      // 165: dup
      // 166: bipush 0
      // 167: aload 7
      // 169: invokevirtual z96.noc ()Ljava/lang/String;
      // 16c: aastore
      // 16d: invokestatic l6r.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 170: iload 5
      // 172: ifeq 4b5
      // 175: iload 9
      // 177: goto 17e
      // 17a: invokestatic l6r.a (Loov;)Loov;
      // 17d: athrow
      // 17e: ifeq 4b5
      // 181: getstatic y8d.i0s Ljava/util/List;
      // 184: invokestatic com/google/common/collect/Lists.reverse (Ljava/util/List;)Ljava/util/List;
      // 187: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 18c: astore 10
      // 18e: aload 10
      // 190: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 195: ifeq 1bc
      // 198: aload 10
      // 19a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19f: checkcast l7l
      // 1a2: astore 11
      // 1a4: aload 7
      // 1a6: aload 11
      // 1a8: invokevirtual z96._rr (L_ss;)V
      // 1ab: iload 5
      // 1ad: ifne 1db
      // 1b0: iload 5
      // 1b2: ifeq 18e
      // 1b5: goto 1bc
      // 1b8: invokestatic l6r.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: aload 1
      // 1bd: aload 0
      // 1be: sipush 27432
      // 1c1: ldc2_w 8317824286122579737
      // 1c4: lload 3
      // 1c5: lxor
      // 1c6: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: nop
      // 1cc: bipush 1
      // 1cd: anewarray 33
      // 1d0: dup
      // 1d1: bipush 0
      // 1d2: aload 7
      // 1d4: invokevirtual z96.noc ()Ljava/lang/String;
      // 1d7: aastore
      // 1d8: invokestatic l6r.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1db: iload 5
      // 1dd: ifeq 4b5
      // 1e0: aload 6
      // 1e2: goto 1e9
      // 1e5: invokestatic l6r.a (Loov;)Loov;
      // 1e8: athrow
      // 1e9: instanceof l7l
      // 1ec: iload 5
      // 1ee: ifne 432
      // 1f1: ifeq 430
      // 1f4: goto 1fb
      // 1f7: invokestatic l6r.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: aload 6
      // 1fd: checkcast l7l
      // 200: astore 10
      // 202: iload 8
      // 204: iload 5
      // 206: ifne 2f2
      // 209: ifeq 2e9
      // 20c: goto 213
      // 20f: invokestatic l6r.a (Loov;)Loov;
      // 212: athrow
      // 213: aload 7
      // 215: invokevirtual z96._m3 ()Ldc5;
      // 218: aload 10
      // 21a: invokevirtual dc5.ktg (Ll7l;)Z
      // 21d: ifeq 255
      // 220: goto 227
      // 223: invokestatic l6r.a (Loov;)Loov;
      // 226: athrow
      // 227: new uvb
      // 22a: dup
      // 22b: sipush 12012
      // 22e: ldc2_w 9137295498037646036
      // 231: lload 3
      // 232: lxor
      // 233: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: nop
      // 239: bipush 2
      // 23a: anewarray 33
      // 23d: dup
      // 23e: bipush 0
      // 23f: aload 7
      // 241: invokevirtual z96.noc ()Ljava/lang/String;
      // 244: aastore
      // 245: dup
      // 246: bipush 1
      // 247: aload 6
      // 249: invokevirtual _ss.zv4 ()Lekw;
      // 24c: aastore
      // 24d: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 250: athrow
      // 251: invokestatic l6r.a (Loov;)Loov;
      // 254: athrow
      // 255: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 258: astore 11
      // 25a: aload 10
      // 25c: getfield l7l.b4b Ll7l;
      // 25f: ifnull 2aa
      // 262: aload 7
      // 264: invokevirtual z96._m3 ()Ldc5;
      // 267: aload 10
      // 269: getfield l7l.b4b Ll7l;
      // 26c: invokevirtual dc5.ktg (Ll7l;)Z
      // 26f: iload 5
      // 271: ifne 432
      // 274: iload 5
      // 276: ifne 29d
      // 279: goto 280
      // 27c: invokestatic l6r.a (Loov;)Loov;
      // 27f: athrow
      // 280: ifne 2aa
      // 283: goto 28a
      // 286: invokestatic l6r.a (Loov;)Loov;
      // 289: athrow
      // 28a: aload 11
      // 28c: aload 10
      // 28e: getfield l7l.b4b Ll7l;
      // 291: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 296: goto 29d
      // 299: invokestatic l6r.a (Loov;)Loov;
      // 29c: athrow
      // 29d: pop
      // 29e: aload 10
      // 2a0: getfield l7l.b4b Ll7l;
      // 2a3: astore 10
      // 2a5: iload 5
      // 2a7: ifeq 25a
      // 2aa: aload 11
      // 2ac: invokestatic com/google/common/collect/Lists.reverse (Ljava/util/List;)Ljava/util/List;
      // 2af: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2b4: astore 12
      // 2b6: aload 12
      // 2b8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2bd: ifeq 2e4
      // 2c0: aload 12
      // 2c2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c7: checkcast l7l
      // 2ca: astore 13
      // 2cc: aload 7
      // 2ce: aload 13
      // 2d0: invokevirtual z96.aex (L_ss;)V
      // 2d3: iload 5
      // 2d5: ifne 430
      // 2d8: iload 5
      // 2da: ifeq 2b6
      // 2dd: goto 2e4
      // 2e0: invokestatic l6r.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: iload 5
      // 2e6: ifeq 430
      // 2e9: iload 9
      // 2eb: goto 2f2
      // 2ee: invokestatic l6r.a (Loov;)Loov;
      // 2f1: athrow
      // 2f2: iload 5
      // 2f4: ifne 432
      // 2f7: ifeq 430
      // 2fa: goto 301
      // 2fd: invokestatic l6r.a (Loov;)Loov;
      // 300: athrow
      // 301: aload 7
      // 303: invokevirtual z96._m3 ()Ldc5;
      // 306: aload 10
      // 308: invokevirtual dc5.ktg (Ll7l;)Z
      // 30b: ifne 343
      // 30e: goto 315
      // 311: invokestatic l6r.a (Loov;)Loov;
      // 314: athrow
      // 315: new uvb
      // 318: dup
      // 319: sipush 595
      // 31c: ldc2_w 3867656025742835302
      // 31f: lload 3
      // 320: lxor
      // 321: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: nop
      // 327: bipush 2
      // 328: anewarray 33
      // 32b: dup
      // 32c: bipush 0
      // 32d: aload 7
      // 32f: invokevirtual z96.noc ()Ljava/lang/String;
      // 332: aastore
      // 333: dup
      // 334: bipush 1
      // 335: aload 6
      // 337: invokevirtual _ss.zv4 ()Lekw;
      // 33a: aastore
      // 33b: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 33e: athrow
      // 33f: invokestatic l6r.a (Loov;)Loov;
      // 342: athrow
      // 343: getstatic y8d.i0s Ljava/util/List;
      // 346: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 34b: new l6r$1
      // 34e: dup
      // 34f: aload 0
      // 350: aload 7
      // 352: aload 6
      // 354: invokespecial l6r$1.<init> (Ll6r;Lz96;L_ss;)V
      // 357: invokestatic com/google/common/collect/Iterators.filter (Ljava/util/Iterator;Lcom/google/common/base/Predicate;)Lcom/google/common/collect/UnmodifiableIterator;
      // 35a: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/util/Iterator;)Ljava/util/ArrayList;
      // 35d: astore 11
      // 35f: aload 11
      // 361: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 364: astore 12
      // 366: aload 11
      // 368: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 36d: astore 13
      // 36f: aload 13
      // 371: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 376: ifeq 3f2
      // 379: aload 13
      // 37b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 380: checkcast l7l
      // 383: astore 14
      // 385: aload 14
      // 387: astore 15
      // 389: bipush 0
      // 38a: iload 5
      // 38c: ifne 402
      // 38f: istore 16
      // 391: aload 15
      // 393: ifnull 3c4
      // 396: aload 15
      // 398: iload 5
      // 39a: ifne 416
      // 39d: iload 5
      // 39f: ifne 3bd
      // 3a2: goto 3a9
      // 3a5: invokestatic l6r.a (Loov;)Loov;
      // 3a8: athrow
      // 3a9: aload 6
      // 3ab: if_acmpne 3b8
      // 3ae: goto 3b5
      // 3b1: invokestatic l6r.a (Loov;)Loov;
      // 3b4: athrow
      // 3b5: bipush 1
      // 3b6: istore 16
      // 3b8: aload 15
      // 3ba: getfield l7l.b4b Ll7l;
      // 3bd: astore 15
      // 3bf: iload 5
      // 3c1: ifeq 391
      // 3c4: iload 16
      // 3c6: ifne 3ed
      // 3c9: aload 14
      // 3cb: astore 15
      // 3cd: aload 15
      // 3cf: ifnull 3ed
      // 3d2: aload 12
      // 3d4: aload 14
      // 3d6: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 3db: pop
      // 3dc: aload 15
      // 3de: getfield l7l.b4b Ll7l;
      // 3e1: astore 15
      // 3e3: iload 5
      // 3e5: ifne 36f
      // 3e8: iload 5
      // 3ea: ifeq 3cd
      // 3ed: iload 5
      // 3ef: ifeq 36f
      // 3f2: aload 12
      // 3f4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3f9: astore 13
      // 3fb: aload 13
      // 3fd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 402: ifeq 430
      // 405: aload 13
      // 407: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 40c: checkcast l7l
      // 40f: goto 416
      // 412: invokestatic l6r.a (Loov;)Loov;
      // 415: athrow
      // 416: astore 14
      // 418: aload 7
      // 41a: aload 14
      // 41c: invokevirtual z96._rr (L_ss;)V
      // 41f: iload 5
      // 421: ifne 47b
      // 424: iload 5
      // 426: ifeq 3fb
      // 429: goto 430
      // 42c: invokestatic l6r.a (Loov;)Loov;
      // 42f: athrow
      // 430: iload 8
      // 432: iload 5
      // 434: ifne 47d
      // 437: ifeq 47b
      // 43a: goto 441
      // 43d: invokestatic l6r.a (Loov;)Loov;
      // 440: athrow
      // 441: aload 7
      // 443: aload 6
      // 445: invokevirtual z96.aex (L_ss;)V
      // 448: aload 1
      // 449: aload 0
      // 44a: sipush 17722
      // 44d: ldc2_w 7962794559553583361
      // 450: lload 3
      // 451: lxor
      // 452: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 457: nop
      // 458: bipush 2
      // 459: anewarray 33
      // 45c: dup
      // 45d: bipush 0
      // 45e: aload 7
      // 460: invokevirtual z96.noc ()Ljava/lang/String;
      // 463: aastore
      // 464: dup
      // 465: bipush 1
      // 466: aload 6
      // 468: invokevirtual _ss.zv4 ()Lekw;
      // 46b: aastore
      // 46c: invokestatic l6r.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 46f: iload 5
      // 471: ifeq 4b5
      // 474: goto 47b
      // 477: invokestatic l6r.a (Loov;)Loov;
      // 47a: athrow
      // 47b: iload 9
      // 47d: ifeq 4b5
      // 480: aload 7
      // 482: aload 6
      // 484: invokevirtual z96._rr (L_ss;)V
      // 487: aload 1
      // 488: aload 0
      // 489: sipush 15032
      // 48c: ldc2_w 6496452738007123586
      // 48f: lload 3
      // 490: lxor
      // 491: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 496: nop
      // 497: bipush 2
      // 498: anewarray 33
      // 49b: dup
      // 49c: bipush 0
      // 49d: aload 6
      // 49f: invokevirtual _ss.zv4 ()Lekw;
      // 4a2: aastore
      // 4a3: dup
      // 4a4: bipush 1
      // 4a5: aload 7
      // 4a7: invokevirtual z96.noc ()Ljava/lang/String;
      // 4aa: aastore
      // 4ab: invokestatic l6r.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 4ae: goto 4b5
      // 4b1: invokestatic l6r.a (Loov;)Loov;
      // 4b4: athrow
      // 4b5: return
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic l6r.a J
      // 03: ldc2_w 26902387496052
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 6
      // 0e: aload 2
      // 0f: arraylength
      // 10: bipush 1
      // 11: iload 6
      // 13: ifne 54
      // 16: if_icmpne 51
      // 19: goto 20
      // 1c: invokestatic l6r.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: bipush 2
      // 22: anewarray 2
      // 25: dup
      // 26: bipush 0
      // 27: sipush 6780
      // 2a: ldc2_w 2799815844576148410
      // 2d: lload 4
      // 2f: lxor
      // 30: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: aastore
      // 37: dup
      // 38: bipush 1
      // 39: sipush 187
      // 3c: ldc2_w 7347769476808515954
      // 3f: lload 4
      // 41: lxor
      // 42: invokedynamic g (IJ)Ljava/lang/String; bsm=l6r.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: aastore
      // 49: invokestatic l6r.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 4c: areturn
      // 4d: invokestatic l6r.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 2
      // 52: arraylength
      // 53: bipush 2
      // 54: iload 6
      // 56: ifne 79
      // 59: if_icmpeq 8b
      // 5c: goto 63
      // 5f: invokestatic l6r.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 2
      // 64: iload 6
      // 66: ifne 7d
      // 69: goto 70
      // 6c: invokestatic l6r.a (Loov;)Loov;
      // 6f: athrow
      // 70: arraylength
      // 71: bipush 3
      // 72: goto 79
      // 75: invokestatic l6r.a (Loov;)Loov;
      // 78: athrow
      // 79: if_icmpne 89
      // 7c: aload 2
      // 7d: invokestatic vr1._0v ()Lvr1;
      // 80: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 83: invokestatic l6r.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 86: goto 8a
      // 89: aconst_null
      // 8a: areturn
      // 8b: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 8e: astore 7
      // 90: getstatic l9p._cg Ljava/util/List;
      // 93: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 98: astore 8
      // 9a: aload 8
      // 9c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a1: ifeq ce
      // a4: aload 8
      // a6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // ab: checkcast _ss
      // ae: astore 9
      // b0: aload 7
      // b2: iload 6
      // b4: ifne d4
      // b7: aload 9
      // b9: getfield _ss.yr5 Ljava/lang/String;
      // bc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // c1: pop
      // c2: iload 6
      // c4: ifeq 9a
      // c7: goto ce
      // ca: invokestatic l6r.a (Loov;)Loov;
      // cd: athrow
      // ce: aload 2
      // cf: aload 7
      // d1: invokestatic l6r.d79 ([Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;
      // d4: areturn
   }

   @Override
   public boolean mp9(String[] param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifeq 1c
      // 09: bipush 2
      // 0a: if_icmpne 1f
      // 0d: goto 14
      // 10: invokestatic l6r.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 1c
      // 18: invokestatic l6r.a (Loov;)Loov;
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 0
      // 20: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2866729912812369595L, 2865919401561901640L, MethodHandles.lookup().lookupClass()).a(270957426123711L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 96086889540959L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "5(änÕÇa\t\u009eëv+\u0080\u0001ç|\u0010à°#\u0087\u0088`\u0017<|w~\u009fV«\u001b\u008a8óÊ\u0081à\u0011ÛÎ7³&Ä¡¾\u009bµ=\u000bû\u0007ã\",ð_*\u0080\u008fµhdÞ\u0018\u0014j¼¤\u00adIÉ)³Ù\u0088w\u001fÃe3\u0083Ò\u008c@ÑFjs@ÕÙ\u008d¡Ìu[0/t\bû÷Ìº)\u0019ji\u0013:\u007f\u0092±»\u0015ó}\u000b9ô4\u008f*ÆîË>{\u0091ly\u000e\u0098§\u009fÛK\u009d\u008dÇñBÂ\u0011¨\u0095-\u0090Øs¦\u0004@\u0010\u0005Ó×cþó\u008cËbG\u000e\u009d\u001eXF%8J\u0091/ï°î\u0085óR\u008c>\u001e<+0\u001af\u0081u\u0002©w =è0¹Ë÷\u008a\u0018%þÊõ¯²_\u0084\u009eÈÑÂ\rXy\u0006Ë@\t½\fZlÓÿ8_Ex{\u0094ýXÛ\u0019ä²`\u009d\u0086µ\u009fØ%{aD\u009cRY\u008d,\bM¥¹\u0097`Md\u008b\u0002:\u00adÆ+Q*ý\u008dÉ\u000b5a\u009dÀ\bDcPÈù0¤G3\u009c3Evµ\u0011\u008cf÷XÃ\t.Þ\u0016rß\u0084v$>\u0005c\u0088Òé\u001d¨Ð1Aùûf}·ç\u0082«ÛÇ\u0095tn¦@#Ë\u0014v\u0004]^\u008aÈz¢¶r²P6\u0087\u0016\b\u009e<C!ð<ñ\u001aû²*\u0001\u0081J=ñw\u0093\u0080ÏÈQæÈ§¤\u0098\u0095E\u0013ÖÉäï\u000eÜ#UÐ\u0013\u0003×MT\r8°s\u0000½\u0097P\b\u000bAN_ë-F\u00847Ægü,ø\u009eå²ef^ nóìï\u0089=ð6;]fßìÛqhÌ\u001eg\u001fêAÒB\u00049«üH\u001bØ°(\u0004\b5/Û\u009b\u0083\u0086\u0099%\u000bßtrr\u0013jîÿ¯ÙÕÄB4\u001bÜ\u001dU\u0005\u008dI\n¾\u0014o¸ð\u001d\u0081\u001bÕ%\u0093\u0098\u008d!\u001c¸ÆC~¨¦®?[_Øj¤DpÀéjy¿\u0010\u0006HÞu#Ý_VæÉá¸7aÃ\u008e";
      int var8 = "5(änÕÇa\t\u009eëv+\u0080\u0001ç|\u0010à°#\u0087\u0088`\u0017<|w~\u009fV«\u001b\u008a8óÊ\u0081à\u0011ÛÎ7³&Ä¡¾\u009bµ=\u000bû\u0007ã\",ð_*\u0080\u008fµhdÞ\u0018\u0014j¼¤\u00adIÉ)³Ù\u0088w\u001fÃe3\u0083Ò\u008c@ÑFjs@ÕÙ\u008d¡Ìu[0/t\bû÷Ìº)\u0019ji\u0013:\u007f\u0092±»\u0015ó}\u000b9ô4\u008f*ÆîË>{\u0091ly\u000e\u0098§\u009fÛK\u009d\u008dÇñBÂ\u0011¨\u0095-\u0090Øs¦\u0004@\u0010\u0005Ó×cþó\u008cËbG\u000e\u009d\u001eXF%8J\u0091/ï°î\u0085óR\u008c>\u001e<+0\u001af\u0081u\u0002©w =è0¹Ë÷\u008a\u0018%þÊõ¯²_\u0084\u009eÈÑÂ\rXy\u0006Ë@\t½\fZlÓÿ8_Ex{\u0094ýXÛ\u0019ä²`\u009d\u0086µ\u009fØ%{aD\u009cRY\u008d,\bM¥¹\u0097`Md\u008b\u0002:\u00adÆ+Q*ý\u008dÉ\u000b5a\u009dÀ\bDcPÈù0¤G3\u009c3Evµ\u0011\u008cf÷XÃ\t.Þ\u0016rß\u0084v$>\u0005c\u0088Òé\u001d¨Ð1Aùûf}·ç\u0082«ÛÇ\u0095tn¦@#Ë\u0014v\u0004]^\u008aÈz¢¶r²P6\u0087\u0016\b\u009e<C!ð<ñ\u001aû²*\u0001\u0081J=ñw\u0093\u0080ÏÈQæÈ§¤\u0098\u0095E\u0013ÖÉäï\u000eÜ#UÐ\u0013\u0003×MT\r8°s\u0000½\u0097P\b\u000bAN_ë-F\u00847Ægü,ø\u009eå²ef^ nóìï\u0089=ð6;]fßìÛqhÌ\u001eg\u001fêAÒB\u00049«üH\u001bØ°(\u0004\b5/Û\u009b\u0083\u0086\u0099%\u000bßtrr\u0013jîÿ¯ÙÕÄB4\u001bÜ\u001dU\u0005\u008dI\n¾\u0014o¸ð\u001d\u0081\u001bÕ%\u0093\u0098\u008d!\u001c¸ÆC~¨¦®?[_Øj¤DpÀéjy¿\u0010\u0006HÞu#Ý_VæÉá¸7aÃ\u008e"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[14];
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

                  var6 = ">¥É_v!ZÞ¸\u0090\u0080[DK\b¿n\u000fD|+¢\u0012ü@` l~Y\u0000ùy\u0000\bµbh\u0081}J=G\u0093JåÙ¤\u0013d²\"[£9O¢93Ú,\u0082ã~ã\u0088\u0019ÏNÓ\u0013E9V\u0094{°Ù.ÄïCÈÐeñ\u0015vú";
                  var8 = ">¥É_v!ZÞ¸\u0090\u0080[DK\b¿n\u000fD|+¢\u0012ü@` l~Y\u0000ùy\u0000\bµbh\u0081}J=G\u0093JåÙ¤\u0013d²\"[£9O¢93Ú,\u0082ã~ã\u0088\u0019ÏNÓ\u0013E9V\u0094{°Ù.ÄïCÈÐeñ\u0015vú"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20588;
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
            throw new RuntimeException("l6r", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("l6r" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
