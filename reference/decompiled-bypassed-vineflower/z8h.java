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

public class z8h implements g6k {
   private t9d cl5;
   private Random f1h;
   private final zfz[] l54;
   private final pss vae;
   private final List x35;
   private final boolean z7f;
   private final boolean n0d;
   private h3g sk8;
   private h3g sg2;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public z8h(t9d param1, long param2, boolean param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z8h.a J
      // 003: ldc2_w 25240564624320
      // 006: lxor
      // 007: lstore 6
      // 009: aload 0
      // 00a: invokespecial java/lang/Object.<init> ()V
      // 00d: invokestatic t9d.c ()I
      // 010: aload 0
      // 011: sipush 256
      // 014: anewarray 43
      // 017: putfield z8h.l54 [Lzfz;
      // 01a: istore 8
      // 01c: aload 0
      // 01d: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 020: putfield z8h.x35 Ljava/util/List;
      // 023: aload 0
      // 024: aload 1
      // 025: putfield z8h.cl5 Lt9d;
      // 028: aload 0
      // 029: new java/util/Random
      // 02c: dup
      // 02d: lload 2
      // 02e: invokespecial java/util/Random.<init> (J)V
      // 031: putfield z8h.f1h Ljava/util/Random;
      // 034: aload 0
      // 035: aload 5
      // 037: invokestatic pss.ggu (Ljava/lang/String;)Lpss;
      // 03a: putfield z8h.vae Lpss;
      // 03d: iload 4
      // 03f: iload 8
      // 041: ifne 263
      // 044: ifeq 248
      // 047: goto 04e
      // 04a: invokestatic z8h.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield z8h.vae Lpss;
      // 052: invokevirtual pss.m6g ()Ljava/util/Map;
      // 055: astore 9
      // 057: aload 9
      // 059: sipush 21140
      // 05c: ldc2_w 6996856609951546530
      // 05f: lload 6
      // 061: lxor
      // 062: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: nop
      // 068: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 06d: iload 8
      // 06f: ifne 106
      // 072: ifeq 0f0
      // 075: goto 07c
      // 078: invokestatic z8h.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 9
      // 07e: sipush 2230
      // 081: ldc2_w 1279189867264910986
      // 084: lload 6
      // 086: lxor
      // 087: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: nop
      // 08d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 092: checkcast java/util/Map
      // 095: astore 10
      // 097: aload 10
      // 099: sipush 13597
      // 09c: ldc2_w 3756553416249744163
      // 09f: lload 6
      // 0a1: lxor
      // 0a2: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: nop
      // 0a8: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0ad: iload 8
      // 0af: ifne 0ef
      // 0b2: ifne 0dd
      // 0b5: goto 0bc
      // 0b8: invokestatic z8h.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 10
      // 0be: sipush 15877
      // 0c1: ldc2_w 6352432188759937073
      // 0c4: lload 6
      // 0c6: lxor
      // 0c7: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: nop
      // 0cd: ldc "1"
      // 0cf: nop
      // 0d0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0d5: pop
      // 0d6: goto 0dd
      // 0d9: invokestatic z8h.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield z8h.x35 Ljava/util/List;
      // 0e1: new net/minecraft/world/gen/structure/MapGenVillage
      // 0e4: dup
      // 0e5: aload 10
      // 0e7: invokespecial net/minecraft/world/gen/structure/MapGenVillage.<init> (Ljava/util/Map;)V
      // 0ea: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ef: pop
      // 0f0: aload 9
      // 0f2: sipush 2332
      // 0f5: ldc2_w 5015431435560757025
      // 0f8: lload 6
      // 0fa: lxor
      // 0fb: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: nop
      // 101: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 106: iload 8
      // 108: ifne 15c
      // 10b: ifeq 146
      // 10e: goto 115
      // 111: invokestatic z8h.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 0
      // 116: getfield z8h.x35 Ljava/util/List;
      // 119: new net/minecraft/world/gen/structure/MapGenScatteredFeature
      // 11c: dup
      // 11d: aload 9
      // 11f: sipush 5320
      // 122: ldc2_w 6876105842704759546
      // 125: lload 6
      // 127: lxor
      // 128: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: nop
      // 12e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 133: checkcast java/util/Map
      // 136: invokespecial net/minecraft/world/gen/structure/MapGenScatteredFeature.<init> (Ljava/util/Map;)V
      // 139: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13e: pop
      // 13f: goto 146
      // 142: invokestatic z8h.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 9
      // 148: sipush 3420
      // 14b: ldc2_w 855771988765483887
      // 14e: lload 6
      // 150: lxor
      // 151: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: nop
      // 157: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 15c: iload 8
      // 15e: ifne 1b2
      // 161: ifeq 19c
      // 164: goto 16b
      // 167: invokestatic z8h.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield z8h.x35 Ljava/util/List;
      // 16f: new xi0
      // 172: dup
      // 173: aload 9
      // 175: sipush 17303
      // 178: ldc2_w 8630402607050321312
      // 17b: lload 6
      // 17d: lxor
      // 17e: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: nop
      // 184: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 189: checkcast java/util/Map
      // 18c: invokespecial xi0.<init> (Ljava/util/Map;)V
      // 18f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 194: pop
      // 195: goto 19c
      // 198: invokestatic z8h.a (Loov;)Loov;
      // 19b: athrow
      // 19c: aload 9
      // 19e: sipush 6640
      // 1a1: ldc2_w 6274117212998907850
      // 1a4: lload 6
      // 1a6: lxor
      // 1a7: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: nop
      // 1ad: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1b2: iload 8
      // 1b4: ifne 208
      // 1b7: ifeq 1f2
      // 1ba: goto 1c1
      // 1bd: invokestatic z8h.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: getfield z8h.x35 Ljava/util/List;
      // 1c5: new net/minecraft/world/gen/structure/MapGenStronghold
      // 1c8: dup
      // 1c9: aload 9
      // 1cb: sipush 25372
      // 1ce: ldc2_w 481621832437812515
      // 1d1: lload 6
      // 1d3: lxor
      // 1d4: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: nop
      // 1da: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1df: checkcast java/util/Map
      // 1e2: invokespecial net/minecraft/world/gen/structure/MapGenStronghold.<init> (Ljava/util/Map;)V
      // 1e5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ea: pop
      // 1eb: goto 1f2
      // 1ee: invokestatic z8h.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: aload 9
      // 1f4: sipush 1957
      // 1f7: ldc2_w 3633735540993960321
      // 1fa: lload 6
      // 1fc: lxor
      // 1fd: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: nop
      // 203: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 208: iload 8
      // 20a: ifne 263
      // 20d: ifeq 248
      // 210: goto 217
      // 213: invokestatic z8h.a (Loov;)Loov;
      // 216: athrow
      // 217: aload 0
      // 218: getfield z8h.x35 Ljava/util/List;
      // 21b: new net/minecraft/world/gen/structure/StructureOceanMonument
      // 21e: dup
      // 21f: aload 9
      // 221: sipush 16065
      // 224: ldc2_w 5287218453521895664
      // 227: lload 6
      // 229: lxor
      // 22a: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: nop
      // 230: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 235: checkcast java/util/Map
      // 238: invokespecial net/minecraft/world/gen/structure/StructureOceanMonument.<init> (Ljava/util/Map;)V
      // 23b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 240: pop
      // 241: goto 248
      // 244: invokestatic z8h.a (Loov;)Loov;
      // 247: athrow
      // 248: aload 0
      // 249: getfield z8h.vae Lpss;
      // 24c: invokevirtual pss.m6g ()Ljava/util/Map;
      // 24f: sipush 12433
      // 252: ldc2_w 6417468569551478452
      // 255: lload 6
      // 257: lxor
      // 258: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: nop
      // 25e: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 263: iload 8
      // 265: ifne 2a2
      // 268: ifeq 287
      // 26b: goto 272
      // 26e: invokestatic z8h.a (Loov;)Loov;
      // 271: athrow
      // 272: aload 0
      // 273: new h3g
      // 276: dup
      // 277: getstatic ox_.gdz Les2;
      // 27a: invokespecial h3g.<init> (Le0x;)V
      // 27d: putfield z8h.sk8 Lh3g;
      // 280: goto 287
      // 283: invokestatic z8h.a (Loov;)Loov;
      // 286: athrow
      // 287: aload 0
      // 288: getfield z8h.vae Lpss;
      // 28b: invokevirtual pss.m6g ()Ljava/util/Map;
      // 28e: sipush 22765
      // 291: ldc2_w 8035532693930899157
      // 294: lload 6
      // 296: lxor
      // 297: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29c: nop
      // 29d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2a2: iload 8
      // 2a4: ifne 2e6
      // 2a7: ifeq 2c6
      // 2aa: goto 2b1
      // 2ad: invokestatic z8h.a (Loov;)Loov;
      // 2b0: athrow
      // 2b1: aload 0
      // 2b2: new h3g
      // 2b5: dup
      // 2b6: getstatic ox_.ska Les2;
      // 2b9: invokespecial h3g.<init> (Le0x;)V
      // 2bc: putfield z8h.sg2 Lh3g;
      // 2bf: goto 2c6
      // 2c2: invokestatic z8h.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: aload 0
      // 2c8: getfield z8h.vae Lpss;
      // 2cb: invokevirtual pss.m6g ()Ljava/util/Map;
      // 2ce: sipush 7070
      // 2d1: ldc2_w 3429679036091413934
      // 2d4: lload 6
      // 2d6: lxor
      // 2d7: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: nop
      // 2dd: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2e2: putfield z8h.n0d Z
      // 2e5: bipush 0
      // 2e6: istore 9
      // 2e8: bipush 0
      // 2e9: istore 10
      // 2eb: bipush 1
      // 2ec: istore 11
      // 2ee: aload 0
      // 2ef: getfield z8h.vae Lpss;
      // 2f2: invokevirtual pss.t48 ()Ljava/util/List;
      // 2f5: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2fa: astore 12
      // 2fc: aload 12
      // 2fe: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 303: ifeq 3a2
      // 306: aload 12
      // 308: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30d: checkcast bvf
      // 310: astore 13
      // 312: iload 8
      // 314: ifne 3a8
      // 317: aload 13
      // 319: invokevirtual bvf.b_3 ()I
      // 31c: istore 14
      // 31e: iload 14
      // 320: aload 13
      // 322: invokevirtual bvf.b_3 ()I
      // 325: aload 13
      // 327: invokevirtual bvf.pyz ()I
      // 32a: iadd
      // 32b: if_icmpge 36e
      // 32e: aload 13
      // 330: invokevirtual bvf.see ()Lzfz;
      // 333: astore 15
      // 335: iload 8
      // 337: ifne 369
      // 33a: aload 15
      // 33c: invokeinterface zfz.r_y ()Le0x; 1
      // 341: getstatic ox_.ibw Le0x;
      // 344: iload 8
      // 346: ifne 37b
      // 349: goto 350
      // 34c: invokestatic z8h.a (Loov;)Loov;
      // 34f: athrow
      // 350: if_acmpeq 366
      // 353: goto 35a
      // 356: invokestatic z8h.a (Loov;)Loov;
      // 359: athrow
      // 35a: bipush 0
      // 35b: istore 11
      // 35d: aload 0
      // 35e: getfield z8h.l54 [Lzfz;
      // 361: iload 14
      // 363: aload 15
      // 365: aastore
      // 366: iinc 14 1
      // 369: iload 8
      // 36b: ifeq 31e
      // 36e: aload 13
      // 370: invokevirtual bvf.see ()Lzfz;
      // 373: invokeinterface zfz.r_y ()Le0x; 1
      // 378: getstatic ox_.ibw Le0x;
      // 37b: if_acmpne 38d
      // 37e: iload 10
      // 380: aload 13
      // 382: invokevirtual bvf.pyz ()I
      // 385: iadd
      // 386: istore 10
      // 388: iload 8
      // 38a: ifeq 39d
      // 38d: iload 9
      // 38f: aload 13
      // 391: invokevirtual bvf.pyz ()I
      // 394: iload 10
      // 396: iadd
      // 397: iadd
      // 398: istore 9
      // 39a: bipush 0
      // 39b: istore 10
      // 39d: iload 8
      // 39f: ifeq 2fc
      // 3a2: aload 1
      // 3a3: iload 9
      // 3a5: invokevirtual t9d.g5c (I)V
      // 3a8: aload 0
      // 3a9: iload 11
      // 3ab: iload 8
      // 3ad: ifne 3bb
      // 3b0: ifeq 3be
      // 3b3: goto 3ba
      // 3b6: invokestatic z8h.a (Loov;)Loov;
      // 3b9: athrow
      // 3ba: bipush 0
      // 3bb: goto 3d9
      // 3be: aload 0
      // 3bf: getfield z8h.vae Lpss;
      // 3c2: invokevirtual pss.m6g ()Ljava/util/Map;
      // 3c5: sipush 2601
      // 3c8: ldc2_w 2141853070390633488
      // 3cb: lload 6
      // 3cd: lxor
      // 3ce: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d3: nop
      // 3d4: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 3d9: putfield z8h.z7f Z
      // 3dc: return
   }

   @Override
   public tts et2(int var1, int var2) {
      lno var4 = new lno();
      int var10000 = t9d.b();
      int var5 = 0;
      int var3 = var10000;

      label99:
      while (true) {
         var10000 = var5;

         label96:
         while (var10000 < this.l54.length) {
            var19 = this;
            if (var3 == 0) {
               break label99;
            }

            zfz var6 = this.l54[var5];

            label93: {
               label105: {
                  try {
                     if (var3 == 0) {
                        break label93;
                     }

                     if (var6 == null) {
                        break label105;
                     }
                  } catch (oov var11) {
                     throw a(var11);
                  }

                  int var7 = 0;

                  while (var7 < 16) {
                     var10000 = 0;
                     if (var3 == 0) {
                        continue label96;
                     }

                     int var8 = 0;

                     label83: {
                        while (var8 < 16) {
                           try {
                              var4.x6f(var7, var5, var8, var6);
                              var8++;
                              if (var3 == 0) {
                                 break label83;
                              }

                              if (var3 == 0) {
                                 break;
                              }
                           } catch (oov var10) {
                              throw a(var10);
                           }
                        }

                        var7++;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  }
               }

               var5++;
            }

            if (var3 != 0) {
               continue label99;
            }
            break;
         }

         var19 = this;
         break;
      }

      for (uk2 var14 : var19.x35) {
         var14.vyh(this, this.cl5, var1, var2, var4);
         if (var3 == 0) {
            break;
         }
      }

      tts var13 = new tts(this.cl5, var4, var1, var2);
      gyu[] var15 = this.cl5.ql0().twf((gyu[])null, var1 * 16, var2 * 16, 16, 16);
      byte[] var16 = var13.xtk();
      int var17 = 0;

      while (true) {
         if (var17 < var16.length) {
            try {
               var16[var17] = (byte)var15[var17].mu9;
               var17++;
               if (var3 == 0) {
                  break;
               }

               if (var3 != 0) {
                  continue;
               }
            } catch (oov var9) {
               throw a(var9);
            }
         }

         var13.vm4();
         break;
      }

      return var13;
   }

   @Override
   public boolean pnt(int var1, int var2) {
      return true;
   }

   @Override
   public void fbq(g6k param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: bipush 16
      // 003: imul
      // 004: istore 5
      // 006: iload 3
      // 007: bipush 16
      // 009: imul
      // 00a: istore 6
      // 00c: invokestatic t9d.c ()I
      // 00f: new mew
      // 012: dup
      // 013: iload 5
      // 015: bipush 0
      // 016: iload 6
      // 018: invokespecial mew.<init> (III)V
      // 01b: astore 7
      // 01d: aload 0
      // 01e: getfield z8h.cl5 Lt9d;
      // 021: new mew
      // 024: dup
      // 025: iload 5
      // 027: bipush 16
      // 029: iadd
      // 02a: bipush 0
      // 02b: iload 6
      // 02d: bipush 16
      // 02f: iadd
      // 030: invokespecial mew.<init> (III)V
      // 033: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 036: astore 8
      // 038: bipush 0
      // 039: istore 9
      // 03b: aload 0
      // 03c: getfield z8h.f1h Ljava/util/Random;
      // 03f: aload 0
      // 040: getfield z8h.cl5 Lt9d;
      // 043: invokevirtual t9d.x2p ()J
      // 046: invokevirtual java/util/Random.setSeed (J)V
      // 049: aload 0
      // 04a: getfield z8h.f1h Ljava/util/Random;
      // 04d: invokevirtual java/util/Random.nextLong ()J
      // 050: ldc2_w 2
      // 053: ldiv
      // 054: ldc2_w 2
      // 057: lmul
      // 058: lconst_1
      // 059: ladd
      // 05a: lstore 10
      // 05c: istore 4
      // 05e: aload 0
      // 05f: getfield z8h.f1h Ljava/util/Random;
      // 062: invokevirtual java/util/Random.nextLong ()J
      // 065: ldc2_w 2
      // 068: ldiv
      // 069: ldc2_w 2
      // 06c: lmul
      // 06d: lconst_1
      // 06e: ladd
      // 06f: lstore 12
      // 071: aload 0
      // 072: getfield z8h.f1h Ljava/util/Random;
      // 075: iload 2
      // 076: i2l
      // 077: lload 10
      // 079: lmul
      // 07a: iload 3
      // 07b: i2l
      // 07c: lload 12
      // 07e: lmul
      // 07f: ladd
      // 080: aload 0
      // 081: getfield z8h.cl5 Lt9d;
      // 084: invokevirtual t9d.x2p ()J
      // 087: lxor
      // 088: invokevirtual java/util/Random.setSeed (J)V
      // 08b: new h2f
      // 08e: dup
      // 08f: iload 2
      // 090: iload 3
      // 091: invokespecial h2f.<init> (II)V
      // 094: astore 14
      // 096: aload 0
      // 097: getfield z8h.x35 Ljava/util/List;
      // 09a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09f: astore 15
      // 0a1: aload 15
      // 0a3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a8: ifeq 0fb
      // 0ab: aload 15
      // 0ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b2: checkcast fln
      // 0b5: astore 16
      // 0b7: aload 16
      // 0b9: aload 0
      // 0ba: getfield z8h.cl5 Lt9d;
      // 0bd: aload 0
      // 0be: getfield z8h.f1h Ljava/util/Random;
      // 0c1: aload 14
      // 0c3: invokevirtual fln.vd1 (Lt9d;Ljava/util/Random;Lh2f;)Z
      // 0c6: istore 17
      // 0c8: aload 16
      // 0ca: instanceof net/minecraft/world/gen/structure/MapGenVillage
      // 0cd: iload 4
      // 0cf: ifne 256
      // 0d2: iload 4
      // 0d4: ifne 0f4
      // 0d7: goto 0de
      // 0da: invokestatic z8h.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: ifeq 0f6
      // 0e1: goto 0e8
      // 0e4: invokestatic z8h.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: iload 9
      // 0ea: iload 17
      // 0ec: ior
      // 0ed: goto 0f4
      // 0f0: invokestatic z8h.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: istore 9
      // 0f6: iload 4
      // 0f8: ifeq 0a1
      // 0fb: aload 0
      // 0fc: getfield z8h.sk8 Lh3g;
      // 0ff: iload 4
      // 101: ifne 192
      // 104: ifnull 182
      // 107: goto 10e
      // 10a: invokestatic z8h.a (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 9
      // 110: iload 4
      // 112: ifne 141
      // 115: goto 11c
      // 118: invokestatic z8h.a (Loov;)Loov;
      // 11b: athrow
      // 11c: ifne 182
      // 11f: goto 126
      // 122: invokestatic z8h.a (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: iload 4
      // 129: ifne 183
      // 12c: goto 133
      // 12f: invokestatic z8h.a (Loov;)Loov;
      // 132: athrow
      // 133: getfield z8h.f1h Ljava/util/Random;
      // 136: bipush 4
      // 137: invokevirtual java/util/Random.nextInt (I)I
      // 13a: goto 141
      // 13d: invokestatic z8h.a (Loov;)Loov;
      // 140: athrow
      // 141: ifne 182
      // 144: aload 0
      // 145: getfield z8h.sk8 Lh3g;
      // 148: aload 0
      // 149: getfield z8h.cl5 Lt9d;
      // 14c: aload 0
      // 14d: getfield z8h.f1h Ljava/util/Random;
      // 150: aload 7
      // 152: aload 0
      // 153: getfield z8h.f1h Ljava/util/Random;
      // 156: bipush 16
      // 158: invokevirtual java/util/Random.nextInt (I)I
      // 15b: bipush 8
      // 15d: iadd
      // 15e: aload 0
      // 15f: getfield z8h.f1h Ljava/util/Random;
      // 162: sipush 256
      // 165: invokevirtual java/util/Random.nextInt (I)I
      // 168: aload 0
      // 169: getfield z8h.f1h Ljava/util/Random;
      // 16c: bipush 16
      // 16e: invokevirtual java/util/Random.nextInt (I)I
      // 171: bipush 8
      // 173: iadd
      // 174: invokevirtual mew.ec4 (III)Lmew;
      // 177: invokevirtual h3g.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 17a: pop
      // 17b: goto 182
      // 17e: invokestatic z8h.a (Loov;)Loov;
      // 181: athrow
      // 182: aload 0
      // 183: iload 4
      // 185: ifne 253
      // 188: getfield z8h.sg2 Lh3g;
      // 18b: goto 192
      // 18e: invokestatic z8h.a (Loov;)Loov;
      // 191: athrow
      // 192: ifnull 252
      // 195: iload 9
      // 197: iload 4
      // 199: ifne 256
      // 19c: goto 1a3
      // 19f: invokestatic z8h.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: ifne 252
      // 1a6: goto 1ad
      // 1a9: invokestatic z8h.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: getfield z8h.f1h Ljava/util/Random;
      // 1b1: bipush 8
      // 1b3: invokevirtual java/util/Random.nextInt (I)I
      // 1b6: iload 4
      // 1b8: ifne 256
      // 1bb: goto 1c2
      // 1be: invokestatic z8h.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: ifne 252
      // 1c5: goto 1cc
      // 1c8: invokestatic z8h.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 7
      // 1ce: aload 0
      // 1cf: getfield z8h.f1h Ljava/util/Random;
      // 1d2: bipush 16
      // 1d4: invokevirtual java/util/Random.nextInt (I)I
      // 1d7: bipush 8
      // 1d9: iadd
      // 1da: aload 0
      // 1db: getfield z8h.f1h Ljava/util/Random;
      // 1de: aload 0
      // 1df: getfield z8h.f1h Ljava/util/Random;
      // 1e2: sipush 248
      // 1e5: invokevirtual java/util/Random.nextInt (I)I
      // 1e8: bipush 8
      // 1ea: iadd
      // 1eb: invokevirtual java/util/Random.nextInt (I)I
      // 1ee: aload 0
      // 1ef: getfield z8h.f1h Ljava/util/Random;
      // 1f2: bipush 16
      // 1f4: invokevirtual java/util/Random.nextInt (I)I
      // 1f7: bipush 8
      // 1f9: iadd
      // 1fa: invokevirtual mew.ec4 (III)Lmew;
      // 1fd: astore 15
      // 1ff: aload 15
      // 201: invokevirtual mew.getY ()I
      // 204: iload 4
      // 206: ifne 251
      // 209: aload 0
      // 20a: getfield z8h.cl5 Lt9d;
      // 20d: invokevirtual t9d._s3 ()I
      // 210: if_icmplt 239
      // 213: goto 21a
      // 216: invokestatic z8h.a (Loov;)Loov;
      // 219: athrow
      // 21a: aload 0
      // 21b: getfield z8h.f1h Ljava/util/Random;
      // 21e: bipush 10
      // 220: invokevirtual java/util/Random.nextInt (I)I
      // 223: iload 4
      // 225: ifne 256
      // 228: goto 22f
      // 22b: invokestatic z8h.a (Loov;)Loov;
      // 22e: athrow
      // 22f: ifne 252
      // 232: goto 239
      // 235: invokestatic z8h.a (Loov;)Loov;
      // 238: athrow
      // 239: aload 0
      // 23a: getfield z8h.sg2 Lh3g;
      // 23d: aload 0
      // 23e: getfield z8h.cl5 Lt9d;
      // 241: aload 0
      // 242: getfield z8h.f1h Ljava/util/Random;
      // 245: aload 15
      // 247: invokevirtual h3g.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 24a: goto 251
      // 24d: invokestatic z8h.a (Loov;)Loov;
      // 250: athrow
      // 251: pop
      // 252: aload 0
      // 253: getfield z8h.n0d Z
      // 256: iload 4
      // 258: ifne 2ba
      // 25b: ifeq 2b6
      // 25e: goto 265
      // 261: invokestatic z8h.a (Loov;)Loov;
      // 264: athrow
      // 265: bipush 0
      // 266: istore 15
      // 268: iload 15
      // 26a: bipush 8
      // 26c: if_icmpge 2b6
      // 26f: new zuh
      // 272: dup
      // 273: invokespecial zuh.<init> ()V
      // 276: aload 0
      // 277: getfield z8h.cl5 Lt9d;
      // 27a: aload 0
      // 27b: getfield z8h.f1h Ljava/util/Random;
      // 27e: aload 7
      // 280: aload 0
      // 281: getfield z8h.f1h Ljava/util/Random;
      // 284: bipush 16
      // 286: invokevirtual java/util/Random.nextInt (I)I
      // 289: bipush 8
      // 28b: iadd
      // 28c: aload 0
      // 28d: getfield z8h.f1h Ljava/util/Random;
      // 290: sipush 256
      // 293: invokevirtual java/util/Random.nextInt (I)I
      // 296: aload 0
      // 297: getfield z8h.f1h Ljava/util/Random;
      // 29a: bipush 16
      // 29c: invokevirtual java/util/Random.nextInt (I)I
      // 29f: bipush 8
      // 2a1: iadd
      // 2a2: invokevirtual mew.ec4 (III)Lmew;
      // 2a5: invokevirtual zuh.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 2a8: pop
      // 2a9: iinc 15 1
      // 2ac: iload 4
      // 2ae: ifne 2d3
      // 2b1: iload 4
      // 2b3: ifeq 268
      // 2b6: aload 0
      // 2b7: getfield z8h.z7f Z
      // 2ba: ifeq 2d3
      // 2bd: aload 8
      // 2bf: aload 0
      // 2c0: getfield z8h.cl5 Lt9d;
      // 2c3: aload 0
      // 2c4: getfield z8h.f1h Ljava/util/Random;
      // 2c7: aload 7
      // 2c9: invokevirtual gyu.u0r (Lt9d;Ljava/util/Random;Lmew;)V
      // 2cc: goto 2d3
      // 2cf: invokestatic z8h.a (Loov;)Loov;
      // 2d2: athrow
      // 2d3: return
   }

   @Override
   public boolean zzc(g6k var1, tts var2, int var3, int var4) {
      return false;
   }

   @Override
   public boolean va4(boolean var1, sw6 var2) {
      return true;
   }

   @Override
   public void hua() {
   }

   @Override
   public boolean p68() {
      return false;
   }

   @Override
   public boolean pj4() {
      return true;
   }

   @Override
   public String y2l() {
      long var1 = a ^ 43441071808661L;
      return a<"r">(12506, 5943148119059436980L ^ var1);
   }

   @Override
   public List sbk(ek6 var1, mew var2) {
      gyu var3 = this.cl5.getBiomeGenForCoords(var2);
      return var3.gzj(var1);
   }

   @Override
   public mew epl(t9d param1, String param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic z8h.a J
      // 03: ldc2_w 56209513406018
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: sipush 27790
      // 11: ldc2_w 4161150122214946617
      // 14: lload 4
      // 16: lxor
      // 17: invokedynamic r (IJ)Ljava/lang/String; bsm=z8h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: nop
      // 1d: aload 2
      // 1e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 21: ifeq 6d
      // 24: aload 0
      // 25: getfield z8h.x35 Ljava/util/List;
      // 28: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2d: astore 7
      // 2f: aload 7
      // 31: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 36: ifeq 6d
      // 39: aload 7
      // 3b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 40: checkcast fln
      // 43: astore 8
      // 45: aload 8
      // 47: iload 6
      // 49: ifne 62
      // 4c: instanceof net/minecraft/world/gen/structure/MapGenStronghold
      // 4f: ifeq 68
      // 52: goto 59
      // 55: invokestatic z8h.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 8
      // 5b: goto 62
      // 5e: invokestatic z8h.a (Loov;)Loov;
      // 61: athrow
      // 62: aload 1
      // 63: aload 3
      // 64: invokevirtual fln.p3b (Lt9d;Lmew;)Lmew;
      // 67: areturn
      // 68: iload 6
      // 6a: ifeq 2f
      // 6d: aconst_null
      // 6e: areturn
   }

   @Override
   public int gkt() {
      return 0;
   }

   @Override
   public void nw5(tts var1, int var2, int var3) {
      int var4 = t9d.b();

      for (fln var6 : this.x35) {
         var6.vyh(this, this.cl5, var2, var3, (lno)null);
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public tts iqa(mew var1) {
      return this.et2(var1.getX() >> 4, var1.getZ() >> 4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8691872005817210035L, -226028499308225456L, MethodHandles.lookup().lookupClass()).a(255314324888238L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 89025017087361L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[18];
      int var7 = 0;
      String var6 = "\u008aåÍ\f°µ\u0002zqm;j\u0087qê®\u0094¬·· \u000bÎ·²\u0006!®\u009c\u0091lä\u0010ÑtÚ@«Uß±\u0083\u001aü!\u009aù\u0086( ÇçøËâ\u007fo\u000bcU[È'ì_\u0085LcõLåLÃÇGª®±\u001af\u009c\n\u0010XÞA¡\u0017*I@î\u0089N\u0084ÅaX\u001a G\u0085T\u008aÌå\u0007uµÔ\u0090\u009eTÿ[7Ü×,r\u000fvÜòlíAÇöa%=\u0010íL\"£ÕÌì\fØJf@úÈZ\u009e .Ü\u00057ª!÷\u0083DgM6ülå0¼a,èØC÷\\Ã\b\u009aÐ\u0012ErW\u0010®¤ºSõ!\bèíÓ\u009bµdVê\u0083\u0010·\u000elp\u0085\u009bu¦qU&F£y\u001dN\u0010v\u0010]Gë\u0090;¶Ò\u0088\u008cÔâ,\u000fG\u0018\u0094\u008c\u0080çÈU-\u0081\u00182NÎ\r\u0004\u009f[/âF\f\u0086\u0084¦ã\u0010ò]]\u007f.Yºà\u0096¤=#q'K^ Ý»ë\u007f2\u009dðä\u000fs¨L\u008bd²&þ\u0003{\u0001\fêZt\u007fè5©J³.\u001f ~¦£Vr6ñþõ&,\b \fC«þ}0\u000f+CR|l¾\u008fÐ\u000f_øø t\u0013\u009aª[½/ÿ5|\u009aç¥.A\u001d\u0088qO\u0098\u0017!ÍÁ\bJ¨\u00adÒ\fÐ?\u0018o\u0081\r¼-Rdö#+£\u008b\u0015BëÃZ\u0000H©\u009fpÚQ";
      int var8 = "\u008aåÍ\f°µ\u0002zqm;j\u0087qê®\u0094¬·· \u000bÎ·²\u0006!®\u009c\u0091lä\u0010ÑtÚ@«Uß±\u0083\u001aü!\u009aù\u0086( ÇçøËâ\u007fo\u000bcU[È'ì_\u0085LcõLåLÃÇGª®±\u001af\u009c\n\u0010XÞA¡\u0017*I@î\u0089N\u0084ÅaX\u001a G\u0085T\u008aÌå\u0007uµÔ\u0090\u009eTÿ[7Ü×,r\u000fvÜòlíAÇöa%=\u0010íL\"£ÕÌì\fØJf@úÈZ\u009e .Ü\u00057ª!÷\u0083DgM6ülå0¼a,èØC÷\\Ã\b\u009aÐ\u0012ErW\u0010®¤ºSõ!\bèíÓ\u009bµdVê\u0083\u0010·\u000elp\u0085\u009bu¦qU&F£y\u001dN\u0010v\u0010]Gë\u0090;¶Ò\u0088\u008cÔâ,\u000fG\u0018\u0094\u008c\u0080çÈU-\u0081\u00182NÎ\r\u0004\u009f[/âF\f\u0086\u0084¦ã\u0010ò]]\u007f.Yºà\u0096¤=#q'K^ Ý»ë\u007f2\u009dðä\u000fs¨L\u008bd²&þ\u0003{\u0001\fêZt\u007fè5©J³.\u001f ~¦£Vr6ñþõ&,\b \fC«þ}0\u000f+CR|l¾\u008fÐ\u000f_øø t\u0013\u009aª[½/ÿ5|\u009aç¥.A\u001d\u0088qO\u0098\u0017!ÍÁ\bJ¨\u00adÒ\fÐ?\u0018o\u0081\r¼-Rdö#+£\u008b\u0015BëÃZ\u0000H©\u009fpÚQ"
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
                     c = new String[18];
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

                  var6 = "i\u000eáqoØ]ª÷×Ô\u0083Ùÿh+ ,»lI\u0019ðºõè\u008b)\u0004ðpæ1\u009cúVÊ\u0012\u0014\u0090ý:½\u0014â\u001a¾\u0097ý";
                  var8 = "i\u000eáqoØ]ª÷×Ô\u0083Ùÿh+ ,»lI\u0019ðºõè\u008b)\u0004ðpæ1\u009cúVÊ\u0012\u0014\u0090ý:½\u0014â\u001a¾\u0097ý".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29001;
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
            throw new RuntimeException("z8h", var10);
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
         throw new RuntimeException("z8h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
