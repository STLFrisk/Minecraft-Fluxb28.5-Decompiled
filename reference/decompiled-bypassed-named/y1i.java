import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y1i extends _jc {
   private static final Logger sx0;
   private rsi qgh;
   private rsi zrb;
   private OpaquePredicate qkw;
   private mew guj;
   public int vm6;
   private int fvz;
   private String _bj;
   private final ha9 dl0;
   private static final long b;
   private static final String d;

   public y1i(jnq var1, OpaquePredicate var2, ha9 var3) {
      this(var1, var2, mew._9b, var3);
   }

   public y1i(jnq var1, OpaquePredicate var2, mew var3, ha9 var4) {
      long var5 = b ^ 79123894316520L;
      super();
      int var10000 = OpaquePredicate.c();
      this.qgh = new pod();
      this.zrb = new y1i$1(this, d, true, 2);
      this.guj = var3;
      this.qkw = var2;
      this.dl0 = var4;
      int var7 = var10000;
      this.zmp(new vrx(this.zrb, 0, 27, 47));
      this.zmp(new vrx(this.zrb, 1, 76, 47));
      this.zmp(new y1i$2(this, this.qgh, 2, 134, 47, var2, var3));
      int var8 = 0;

      while (true) {
         if (var8 < 3) {
            var12 = 0;
            if (var7 != 0) {
               break;
            }

            int var9 = 0;

            label42: {
               while (var9 < 9) {
                  try {
                     this.zmp(new vrx(var1, var9 + var8 * 9 + 9, 8 + var9 * 18, 84 + var8 * 18));
                     var9++;
                     if (var7 != 0) {
                        break label42;
                     }

                     if (var7 != 0) {
                        break;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }
               }

               var8++;
            }

            if (var7 == 0) {
               continue;
            }
         }

         var12 = 0;
         break;
      }

      var8 = var12;

      while (var8 < 9) {
         this.zmp(new vrx(var1, var8, 8 + var8 * 18, 142));
         var8++;
         if (var7 != 0) {
            break;
         }
      }
   }

   @Override
   public void ih9(rsi param1) {
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
      // 05: iload 2
      // 06: ifne 24
      // 09: aload 1
      // 0a: invokespecial _jc.ih9 (Lrsi;)V
      // 0d: aload 1
      // 0e: aload 0
      // 0f: getfield y1i.zrb Lrsi;
      // 12: if_acmpne 27
      // 15: goto 1c
      // 18: invokestatic y1i.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: goto 24
      // 20: invokestatic y1i.a (Loov;)Loov;
      // 23: athrow
      // 24: invokevirtual y1i.bou ()V
      // 27: return
   }

   public void bou() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 2
      // 002: bipush 1
      // 003: istore 3
      // 004: bipush 1
      // 005: istore 4
      // 007: bipush 1
      // 008: istore 5
      // 00a: bipush 2
      // 00b: istore 6
      // 00d: bipush 1
      // 00e: istore 7
      // 010: invokestatic OpaquePredicate.b ()I
      // 013: bipush 1
      // 014: istore 8
      // 016: aload 0
      // 017: getfield y1i.zrb Lrsi;
      // 01a: bipush 0
      // 01b: invokeinterface rsi.ibn (I)Lerg; 2
      // 020: astore 9
      // 022: aload 0
      // 023: bipush 1
      // 024: putfield y1i.vm6 I
      // 027: bipush 0
      // 028: istore 10
      // 02a: bipush 0
      // 02b: istore 11
      // 02d: bipush 0
      // 02e: istore 12
      // 030: istore 1
      // 031: aload 9
      // 033: iload 1
      // 034: ifeq 06b
      // 037: ifnonnull 05f
      // 03a: goto 041
      // 03d: invokestatic y1i.a (Loov;)Loov;
      // 040: athrow
      // 041: aload 0
      // 042: getfield y1i.qgh Lrsi;
      // 045: bipush 0
      // 046: aconst_null
      // 047: checkcast erg
      // 04a: invokeinterface rsi.cxl (ILerg;)V 3
      // 04f: aload 0
      // 050: bipush 0
      // 051: putfield y1i.vm6 I
      // 054: iload 1
      // 055: ifne 684
      // 058: goto 05f
      // 05b: invokestatic y1i.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 9
      // 061: invokevirtual erg.yaq ()Lerg;
      // 064: goto 06b
      // 067: invokestatic y1i.a (Loov;)Loov;
      // 06a: athrow
      // 06b: astore 13
      // 06d: aload 0
      // 06e: getfield y1i.zrb Lrsi;
      // 071: bipush 1
      // 072: invokeinterface rsi.ibn (I)Lerg; 2
      // 077: astore 14
      // 079: aload 13
      // 07b: invokestatic hc0.aau (Lerg;)Ljava/util/Map;
      // 07e: astore 15
      // 080: bipush 0
      // 081: istore 16
      // 083: iload 11
      // 085: aload 9
      // 087: invokevirtual erg._96 ()I
      // 08a: iadd
      // 08b: aload 14
      // 08d: iload 1
      // 08e: ifeq 0a5
      // 091: ifnonnull 0a3
      // 094: goto 09b
      // 097: invokestatic y1i.a (Loov;)Loov;
      // 09a: athrow
      // 09b: bipush 0
      // 09c: goto 0a8
      // 09f: invokestatic y1i.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 14
      // 0a5: invokevirtual erg._96 ()I
      // 0a8: iadd
      // 0a9: istore 11
      // 0ab: aload 0
      // 0ac: iload 1
      // 0ad: ifeq 50d
      // 0b0: bipush 0
      // 0b1: putfield y1i.fvz I
      // 0b4: aload 14
      // 0b6: ifnull 50c
      // 0b9: goto 0c0
      // 0bc: invokestatic y1i.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 14
      // 0c2: invokevirtual erg.gn1 ()Lu7m;
      // 0c5: getstatic xbr.frz Lnmo;
      // 0c8: if_acmpne 0f6
      // 0cb: goto 0d2
      // 0ce: invokestatic y1i.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: getstatic xbr.frz Lnmo;
      // 0d5: aload 14
      // 0d7: invokevirtual nmo.hyc (Lerg;)Lqhg;
      // 0da: invokevirtual qhg.vek ()I
      // 0dd: iload 1
      // 0de: ifeq 0f3
      // 0e1: goto 0e8
      // 0e4: invokestatic y1i.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: ifle 0f6
      // 0eb: goto 0f2
      // 0ee: invokestatic y1i.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: bipush 1
      // 0f3: goto 0f7
      // 0f6: bipush 0
      // 0f7: istore 16
      // 0f9: aload 13
      // 0fb: invokevirtual erg.dw2 ()Z
      // 0fe: iload 1
      // 0ff: ifeq 1d4
      // 102: ifeq 1cb
      // 105: goto 10c
      // 108: invokestatic y1i.a (Loov;)Loov;
      // 10b: athrow
      // 10c: aload 13
      // 10e: invokevirtual erg.gn1 ()Lu7m;
      // 111: aload 9
      // 113: aload 14
      // 115: invokevirtual u7m.nur (Lerg;Lerg;)Z
      // 118: iload 1
      // 119: ifeq 1d4
      // 11c: goto 123
      // 11f: invokestatic y1i.a (Loov;)Loov;
      // 122: athrow
      // 123: ifeq 1cb
      // 126: goto 12d
      // 129: invokestatic y1i.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 13
      // 12f: invokevirtual erg.dzj ()I
      // 132: aload 13
      // 134: invokevirtual erg.mg5 ()I
      // 137: bipush 4
      // 138: idiv
      // 139: invokestatic java/lang/Math.min (II)I
      // 13c: istore 17
      // 13e: iload 17
      // 140: iload 1
      // 141: ifeq 167
      // 144: ifgt 166
      // 147: goto 14e
      // 14a: invokestatic y1i.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: getfield y1i.qgh Lrsi;
      // 152: bipush 0
      // 153: aconst_null
      // 154: checkcast erg
      // 157: invokeinterface rsi.cxl (ILerg;)V 3
      // 15c: aload 0
      // 15d: bipush 0
      // 15e: putfield y1i.vm6 I
      // 161: return
      // 162: invokestatic y1i.a (Loov;)Loov;
      // 165: athrow
      // 166: bipush 0
      // 167: istore 18
      // 169: iload 17
      // 16b: ifle 1c1
      // 16e: iload 18
      // 170: aload 14
      // 172: getfield erg.qd2 I
      // 175: iload 1
      // 176: ifeq 59c
      // 179: iload 1
      // 17a: ifeq 19c
      // 17d: goto 184
      // 180: invokestatic y1i.a (Loov;)Loov;
      // 183: athrow
      // 184: if_icmpge 1c1
      // 187: goto 18e
      // 18a: invokestatic y1i.a (Loov;)Loov;
      // 18d: athrow
      // 18e: aload 13
      // 190: invokevirtual erg.dzj ()I
      // 193: iload 17
      // 195: goto 19c
      // 198: invokestatic y1i.a (Loov;)Loov;
      // 19b: athrow
      // 19c: isub
      // 19d: istore 19
      // 19f: aload 13
      // 1a1: iload 19
      // 1a3: invokevirtual erg.awe (I)V
      // 1a6: iinc 10 1
      // 1a9: aload 13
      // 1ab: invokevirtual erg.dzj ()I
      // 1ae: aload 13
      // 1b0: invokevirtual erg.mg5 ()I
      // 1b3: bipush 4
      // 1b4: idiv
      // 1b5: invokestatic java/lang/Math.min (II)I
      // 1b8: istore 17
      // 1ba: iinc 18 1
      // 1bd: iload 1
      // 1be: ifne 169
      // 1c1: aload 0
      // 1c2: iload 18
      // 1c4: putfield y1i.fvz I
      // 1c7: iload 1
      // 1c8: ifne 50c
      // 1cb: iload 16
      // 1cd: goto 1d4
      // 1d0: invokestatic y1i.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: iload 1
      // 1d5: ifeq 243
      // 1d8: ifne 233
      // 1db: goto 1e2
      // 1de: invokestatic y1i.a (Loov;)Loov;
      // 1e1: athrow
      // 1e2: aload 13
      // 1e4: iload 1
      // 1e5: ifeq 20a
      // 1e8: goto 1ef
      // 1eb: invokestatic y1i.a (Loov;)Loov;
      // 1ee: athrow
      // 1ef: invokevirtual erg.gn1 ()Lu7m;
      // 1f2: aload 14
      // 1f4: invokevirtual erg.gn1 ()Lu7m;
      // 1f7: if_acmpne 21b
      // 1fa: goto 201
      // 1fd: invokestatic y1i.a (Loov;)Loov;
      // 200: athrow
      // 201: aload 13
      // 203: goto 20a
      // 206: invokestatic y1i.a (Loov;)Loov;
      // 209: athrow
      // 20a: invokevirtual erg.dw2 ()Z
      // 20d: iload 1
      // 20e: ifeq 243
      // 211: ifne 233
      // 214: goto 21b
      // 217: invokestatic y1i.a (Loov;)Loov;
      // 21a: athrow
      // 21b: aload 0
      // 21c: getfield y1i.qgh Lrsi;
      // 21f: bipush 0
      // 220: aconst_null
      // 221: checkcast erg
      // 224: invokeinterface rsi.cxl (ILerg;)V 3
      // 229: aload 0
      // 22a: bipush 0
      // 22b: putfield y1i.vm6 I
      // 22e: return
      // 22f: invokestatic y1i.a (Loov;)Loov;
      // 232: athrow
      // 233: aload 13
      // 235: iload 1
      // 236: ifeq 2cf
      // 239: invokevirtual erg.dw2 ()Z
      // 23c: goto 243
      // 23f: invokestatic y1i.a (Loov;)Loov;
      // 242: athrow
      // 243: ifeq 2cd
      // 246: iload 16
      // 248: iload 1
      // 249: ifeq 26f
      // 24c: goto 253
      // 24f: invokestatic y1i.a (Loov;)Loov;
      // 252: athrow
      // 253: ifne 2cd
      // 256: goto 25d
      // 259: invokestatic y1i.a (Loov;)Loov;
      // 25c: athrow
      // 25d: aload 9
      // 25f: invokevirtual erg.mg5 ()I
      // 262: aload 9
      // 264: invokevirtual erg.dzj ()I
      // 267: isub
      // 268: goto 26f
      // 26b: invokestatic y1i.a (Loov;)Loov;
      // 26e: athrow
      // 26f: istore 17
      // 271: aload 14
      // 273: invokevirtual erg.mg5 ()I
      // 276: aload 14
      // 278: invokevirtual erg.dzj ()I
      // 27b: isub
      // 27c: istore 18
      // 27e: iload 18
      // 280: aload 13
      // 282: invokevirtual erg.mg5 ()I
      // 285: bipush 12
      // 287: imul
      // 288: bipush 100
      // 28a: idiv
      // 28b: iadd
      // 28c: istore 19
      // 28e: iload 17
      // 290: iload 19
      // 292: iadd
      // 293: istore 20
      // 295: aload 13
      // 297: invokevirtual erg.mg5 ()I
      // 29a: iload 20
      // 29c: isub
      // 29d: istore 21
      // 29f: iload 21
      // 2a1: iload 1
      // 2a2: ifeq 2b4
      // 2a5: ifge 2b2
      // 2a8: goto 2af
      // 2ab: invokestatic y1i.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: bipush 0
      // 2b0: istore 21
      // 2b2: iload 21
      // 2b4: aload 13
      // 2b6: invokevirtual erg.j6_ ()I
      // 2b9: if_icmpge 2cd
      // 2bc: aload 13
      // 2be: iload 21
      // 2c0: invokevirtual erg.awe (I)V
      // 2c3: iinc 10 2
      // 2c6: goto 2cd
      // 2c9: invokestatic y1i.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: aload 14
      // 2cf: invokestatic hc0.aau (Lerg;)Ljava/util/Map;
      // 2d2: astore 17
      // 2d4: aload 17
      // 2d6: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 2db: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2e0: astore 18
      // 2e2: aload 18
      // 2e4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2e9: ifeq 50c
      // 2ec: aload 18
      // 2ee: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f3: checkcast java/lang/Integer
      // 2f6: invokevirtual java/lang/Integer.intValue ()I
      // 2f9: istore 19
      // 2fb: iload 19
      // 2fd: invokestatic vef.k6j (I)Lvef;
      // 300: astore 20
      // 302: iload 1
      // 303: ifeq 54e
      // 306: aload 20
      // 308: ifnull 508
      // 30b: goto 312
      // 30e: invokestatic y1i.a (Loov;)Loov;
      // 311: athrow
      // 312: aload 15
      // 314: iload 19
      // 316: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 319: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 31e: iload 1
      // 31f: ifeq 34c
      // 322: goto 329
      // 325: invokestatic y1i.a (Loov;)Loov;
      // 328: athrow
      // 329: ifeq 34f
      // 32c: goto 333
      // 32f: invokestatic y1i.a (Loov;)Loov;
      // 332: athrow
      // 333: aload 15
      // 335: iload 19
      // 337: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 33a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 33f: checkcast java/lang/Integer
      // 342: invokevirtual java/lang/Integer.intValue ()I
      // 345: goto 34c
      // 348: invokestatic y1i.a (Loov;)Loov;
      // 34b: athrow
      // 34c: goto 350
      // 34f: bipush 0
      // 350: istore 21
      // 352: aload 17
      // 354: iload 19
      // 356: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 359: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 35e: checkcast java/lang/Integer
      // 361: invokevirtual java/lang/Integer.intValue ()I
      // 364: istore 22
      // 366: iload 21
      // 368: iload 22
      // 36a: iload 1
      // 36b: ifeq 38e
      // 36e: if_icmpne 383
      // 371: goto 378
      // 374: invokestatic y1i.a (Loov;)Loov;
      // 377: athrow
      // 378: iinc 22 1
      // 37b: iload 22
      // 37d: istore 23
      // 37f: iload 1
      // 380: ifne 393
      // 383: iload 22
      // 385: iload 21
      // 387: goto 38e
      // 38a: invokestatic y1i.a (Loov;)Loov;
      // 38d: athrow
      // 38e: invokestatic java/lang/Math.max (II)I
      // 391: istore 23
      // 393: iload 23
      // 395: istore 22
      // 397: aload 20
      // 399: aload 9
      // 39b: invokevirtual vef.ovd (Lerg;)Z
      // 39e: istore 24
      // 3a0: aload 0
      // 3a1: getfield y1i.dl0 Lha9;
      // 3a4: getfield ha9.lls Lpj2;
      // 3a7: getfield pj2.g40 Z
      // 3aa: iload 1
      // 3ab: ifeq 3d2
      // 3ae: ifne 3ca
      // 3b1: goto 3b8
      // 3b4: invokestatic y1i.a (Loov;)Loov;
      // 3b7: athrow
      // 3b8: aload 9
      // 3ba: invokevirtual erg.gn1 ()Lu7m;
      // 3bd: getstatic xbr.frz Lnmo;
      // 3c0: if_acmpne 3d4
      // 3c3: goto 3ca
      // 3c6: invokestatic y1i.a (Loov;)Loov;
      // 3c9: athrow
      // 3ca: bipush 1
      // 3cb: goto 3d2
      // 3ce: invokestatic y1i.a (Loov;)Loov;
      // 3d1: athrow
      // 3d2: istore 24
      // 3d4: aload 15
      // 3d6: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 3db: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 3e0: astore 25
      // 3e2: aload 25
      // 3e4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3e9: ifeq 441
      // 3ec: aload 25
      // 3ee: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3f3: checkcast java/lang/Integer
      // 3f6: invokevirtual java/lang/Integer.intValue ()I
      // 3f9: istore 26
      // 3fb: iload 26
      // 3fd: iload 1
      // 3fe: ifeq 429
      // 401: iload 19
      // 403: iload 1
      // 404: ifeq 59c
      // 407: goto 40e
      // 40a: invokestatic y1i.a (Loov;)Loov;
      // 40d: athrow
      // 40e: if_icmpeq 43d
      // 411: goto 418
      // 414: invokestatic y1i.a (Loov;)Loov;
      // 417: athrow
      // 418: aload 20
      // 41a: iload 26
      // 41c: invokestatic vef.k6j (I)Lvef;
      // 41f: invokevirtual vef.yhx (Lvef;)Z
      // 422: goto 429
      // 425: invokestatic y1i.a (Loov;)Loov;
      // 428: athrow
      // 429: iload 1
      // 42a: ifeq 438
      // 42d: ifne 43d
      // 430: goto 437
      // 433: invokestatic y1i.a (Loov;)Loov;
      // 436: athrow
      // 437: bipush 0
      // 438: istore 24
      // 43a: iinc 10 1
      // 43d: iload 1
      // 43e: ifne 3e2
      // 441: iload 24
      // 443: iload 1
      // 444: ifeq 453
      // 447: ifeq 508
      // 44a: goto 451
      // 44d: invokestatic y1i.a (Loov;)Loov;
      // 450: athrow
      // 451: iload 22
      // 453: iload 1
      // 454: ifeq 480
      // 457: aload 20
      // 459: invokevirtual vef.ehp ()I
      // 45c: if_icmple 46d
      // 45f: goto 466
      // 462: invokestatic y1i.a (Loov;)Loov;
      // 465: athrow
      // 466: aload 20
      // 468: invokevirtual vef.ehp ()I
      // 46b: istore 22
      // 46d: aload 15
      // 46f: iload 19
      // 471: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 474: iload 22
      // 476: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 479: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 47e: pop
      // 47f: bipush 0
      // 480: istore 26
      // 482: aload 20
      // 484: invokevirtual vef.xiu ()I
      // 487: iload 1
      // 488: ifeq 4e2
      // 48b: tableswitch 68 1 10 57 65 68 68 72 68 68 68 68 79
      // 4c0: invokestatic y1i.a (Loov;)Loov;
      // 4c3: athrow
      // 4c4: bipush 8
      // 4c6: istore 26
      // 4c8: iload 1
      // 4c9: ifne 4e4
      // 4cc: bipush 4
      // 4cd: istore 26
      // 4cf: iload 1
      // 4d0: ifne 4e4
      // 4d3: bipush 2
      // 4d4: istore 26
      // 4d6: iload 1
      // 4d7: ifne 4e4
      // 4da: bipush 1
      // 4db: goto 4e2
      // 4de: invokestatic y1i.a (Loov;)Loov;
      // 4e1: athrow
      // 4e2: istore 26
      // 4e4: iload 16
      // 4e6: iload 1
      // 4e7: ifeq 506
      // 4ea: ifeq 4fe
      // 4ed: goto 4f4
      // 4f0: invokestatic y1i.a (Loov;)Loov;
      // 4f3: athrow
      // 4f4: bipush 1
      // 4f5: iload 26
      // 4f7: bipush 2
      // 4f8: idiv
      // 4f9: invokestatic java/lang/Math.max (II)I
      // 4fc: istore 26
      // 4fe: iload 10
      // 500: iload 26
      // 502: iload 22
      // 504: imul
      // 505: iadd
      // 506: istore 10
      // 508: iload 1
      // 509: ifne 2e2
      // 50c: aload 0
      // 50d: getfield y1i._bj Ljava/lang/String;
      // 510: invokestatic org/apache/commons/lang3/StringUtils.isBlank (Ljava/lang/CharSequence;)Z
      // 513: iload 1
      // 514: ifeq 55a
      // 517: ifeq 54e
      // 51a: goto 521
      // 51d: invokestatic y1i.a (Loov;)Loov;
      // 520: athrow
      // 521: aload 9
      // 523: invokevirtual erg.x4w ()Z
      // 526: iload 1
      // 527: ifeq 587
      // 52a: goto 531
      // 52d: invokestatic y1i.a (Loov;)Loov;
      // 530: athrow
      // 531: ifeq 57c
      // 534: goto 53b
      // 537: invokestatic y1i.a (Loov;)Loov;
      // 53a: athrow
      // 53b: bipush 1
      // 53c: istore 12
      // 53e: iload 10
      // 540: iload 12
      // 542: iadd
      // 543: istore 10
      // 545: aload 13
      // 547: invokevirtual erg.a2y ()V
      // 54a: iload 1
      // 54b: ifne 57c
      // 54e: aload 0
      // 54f: getfield y1i._bj Ljava/lang/String;
      // 552: aload 9
      // 554: invokevirtual erg.zow ()Ljava/lang/String;
      // 557: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 55a: iload 1
      // 55b: ifeq 587
      // 55e: ifne 57c
      // 561: goto 568
      // 564: invokestatic y1i.a (Loov;)Loov;
      // 567: athrow
      // 568: bipush 1
      // 569: istore 12
      // 56b: iload 10
      // 56d: iload 12
      // 56f: iadd
      // 570: istore 10
      // 572: aload 13
      // 574: aload 0
      // 575: getfield y1i._bj Ljava/lang/String;
      // 578: invokevirtual erg.dou (Ljava/lang/String;)Lerg;
      // 57b: pop
      // 57c: aload 0
      // 57d: iload 11
      // 57f: iload 10
      // 581: iadd
      // 582: putfield y1i.vm6 I
      // 585: iload 10
      // 587: iload 1
      // 588: ifeq 59a
      // 58b: ifgt 598
      // 58e: goto 595
      // 591: invokestatic y1i.a (Loov;)Loov;
      // 594: athrow
      // 595: aconst_null
      // 596: astore 13
      // 598: iload 12
      // 59a: iload 10
      // 59c: iload 1
      // 59d: ifeq 5fa
      // 5a0: if_icmpne 5e9
      // 5a3: goto 5aa
      // 5a6: invokestatic y1i.a (Loov;)Loov;
      // 5a9: athrow
      // 5aa: iload 12
      // 5ac: iload 1
      // 5ad: ifeq 5ed
      // 5b0: goto 5b7
      // 5b3: invokestatic y1i.a (Loov;)Loov;
      // 5b6: athrow
      // 5b7: ifle 5e9
      // 5ba: goto 5c1
      // 5bd: invokestatic y1i.a (Loov;)Loov;
      // 5c0: athrow
      // 5c1: aload 0
      // 5c2: getfield y1i.vm6 I
      // 5c5: bipush 40
      // 5c7: iload 1
      // 5c8: ifeq 5fa
      // 5cb: goto 5d2
      // 5ce: invokestatic y1i.a (Loov;)Loov;
      // 5d1: athrow
      // 5d2: if_icmplt 5e9
      // 5d5: goto 5dc
      // 5d8: invokestatic y1i.a (Loov;)Loov;
      // 5db: athrow
      // 5dc: aload 0
      // 5dd: bipush 39
      // 5df: putfield y1i.vm6 I
      // 5e2: goto 5e9
      // 5e5: invokestatic y1i.a (Loov;)Loov;
      // 5e8: athrow
      // 5e9: aload 0
      // 5ea: getfield y1i.vm6 I
      // 5ed: iload 1
      // 5ee: ifeq 60e
      // 5f1: bipush 40
      // 5f3: goto 5fa
      // 5f6: invokestatic y1i.a (Loov;)Loov;
      // 5f9: athrow
      // 5fa: if_icmplt 614
      // 5fd: aload 0
      // 5fe: getfield y1i.dl0 Lha9;
      // 601: getfield ha9.lls Lpj2;
      // 604: getfield pj2.g40 Z
      // 607: goto 60e
      // 60a: invokestatic y1i.a (Loov;)Loov;
      // 60d: athrow
      // 60e: ifne 614
      // 611: aconst_null
      // 612: astore 13
      // 614: aload 13
      // 616: iload 1
      // 617: ifeq 626
      // 61a: ifnull 674
      // 61d: goto 624
      // 620: invokestatic y1i.a (Loov;)Loov;
      // 623: athrow
      // 624: aload 13
      // 626: invokevirtual erg._96 ()I
      // 629: istore 17
      // 62b: aload 14
      // 62d: iload 1
      // 62e: ifeq 668
      // 631: ifnull 65e
      // 634: goto 63b
      // 637: invokestatic y1i.a (Loov;)Loov;
      // 63a: athrow
      // 63b: iload 17
      // 63d: aload 14
      // 63f: invokevirtual erg._96 ()I
      // 642: iload 1
      // 643: ifeq 663
      // 646: goto 64d
      // 649: invokestatic y1i.a (Loov;)Loov;
      // 64c: athrow
      // 64d: if_icmpge 65e
      // 650: goto 657
      // 653: invokestatic y1i.a (Loov;)Loov;
      // 656: athrow
      // 657: aload 14
      // 659: invokevirtual erg._96 ()I
      // 65c: istore 17
      // 65e: iload 17
      // 660: bipush 2
      // 661: imul
      // 662: bipush 1
      // 663: iadd
      // 664: istore 17
      // 666: aload 13
      // 668: iload 17
      // 66a: invokevirtual erg.bg0 (I)V
      // 66d: aload 15
      // 66f: aload 13
      // 671: invokestatic hc0.r_4 (Ljava/util/Map;Lerg;)V
      // 674: aload 0
      // 675: getfield y1i.qgh Lrsi;
      // 678: bipush 0
      // 679: aload 13
      // 67b: invokeinterface rsi.cxl (ILerg;)V 3
      // 680: aload 0
      // 681: invokevirtual y1i.n4z ()V
      // 684: return
   }

   @Override
   public void c_j(flv var1) {
      super.c_j(var1);
      var1.vhx(this, 0, this.vm6);
   }

   @Override
   public void l0n(int var1, int var2) {
      try {
         if (var1 == 0) {
            this.vm6 = var2;
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void qi6(ha9 param1) {
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
      // 05: aload 1
      // 06: invokespecial _jc.qi6 (Lha9;)V
      // 09: aload 0
      // 0a: getfield y1i.qkw Lt9d;
      // 0d: getfield OpaquePredicate.v0f Z
      // 10: iload 2
      // 11: ifeq 1f
      // 14: ifne 5f
      // 17: goto 1e
      // 1a: invokestatic y1i.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: istore 3
      // 20: iload 3
      // 21: aload 0
      // 22: getfield y1i.zrb Lrsi;
      // 25: invokeinterface rsi.opt ()I 1
      // 2a: if_icmpge 5f
      // 2d: aload 0
      // 2e: getfield y1i.zrb Lrsi;
      // 31: iload 3
      // 32: invokeinterface rsi.yvk (I)Lerg; 2
      // 37: astore 4
      // 39: iload 2
      // 3a: ifeq 5b
      // 3d: aload 4
      // 3f: ifnull 58
      // 42: goto 49
      // 45: invokestatic y1i.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: aload 4
      // 4c: bipush 0
      // 4d: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 50: pop
      // 51: goto 58
      // 54: invokestatic y1i.a (Loov;)Loov;
      // 57: athrow
      // 58: iinc 3 1
      // 5b: iload 2
      // 5c: ifne 20
      // 5f: return
   }

   @Override
   public boolean spj(ha9 var1) {
      int var2 = OpaquePredicate.c();

      try {
         if (this.qkw.getBlockState(this.guj).r_y() != ox_.g04) {
            return (boolean)0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         double var5;
         int var10000 = (var5 = var1.p53((double)this.guj.getX() + 0.5, (double)this.guj.getY() + 0.5, (double)this.guj.getZ() + 0.5) - 64.0) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   @Override
   public erg za4(ha9 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 4
      // 003: invokestatic OpaquePredicate.b ()I
      // 006: aload 0
      // 007: getfield y1i.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifeq 028
      // 01c: ifnull 166
      // 01f: goto 026
      // 022: invokestatic y1i.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifeq 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 166
      // 032: goto 039
      // 035: invokestatic y1i.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic y1i.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifeq 08d
      // 053: bipush 2
      // 054: if_icmpne 085
      // 057: goto 05e
      // 05a: invokestatic y1i.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 6
      // 061: bipush 3
      // 062: bipush 39
      // 064: bipush 1
      // 065: invokevirtual y1i.ghh (Lerg;IIZ)Z
      // 068: ifne 078
      // 06b: goto 072
      // 06e: invokestatic y1i.a (Loov;)Loov;
      // 071: athrow
      // 072: aconst_null
      // 073: areturn
      // 074: invokestatic y1i.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 5
      // 07a: aload 6
      // 07c: aload 4
      // 07e: invokevirtual vrx._0c (Lerg;Lerg;)V
      // 081: iload 3
      // 082: ifne 123
      // 085: iload 2
      // 086: goto 08d
      // 089: invokestatic y1i.a (Loov;)Loov;
      // 08c: athrow
      // 08d: iload 3
      // 08e: ifeq 10f
      // 091: ifeq 105
      // 094: goto 09b
      // 097: invokestatic y1i.a (Loov;)Loov;
      // 09a: athrow
      // 09b: iload 2
      // 09c: iload 3
      // 09d: ifeq 10f
      // 0a0: goto 0a7
      // 0a3: invokestatic y1i.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: bipush 1
      // 0a8: if_icmpeq 105
      // 0ab: goto 0b2
      // 0ae: invokestatic y1i.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: iload 2
      // 0b3: iload 3
      // 0b4: ifeq 128
      // 0b7: goto 0be
      // 0ba: invokestatic y1i.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: bipush 3
      // 0bf: if_icmplt 123
      // 0c2: goto 0c9
      // 0c5: invokestatic y1i.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: iload 2
      // 0ca: iload 3
      // 0cb: ifeq 128
      // 0ce: goto 0d5
      // 0d1: invokestatic y1i.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: bipush 39
      // 0d7: if_icmpge 123
      // 0da: goto 0e1
      // 0dd: invokestatic y1i.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: aload 6
      // 0e4: bipush 0
      // 0e5: bipush 2
      // 0e6: bipush 0
      // 0e7: invokevirtual y1i.ghh (Lerg;IIZ)Z
      // 0ea: iload 3
      // 0eb: ifeq 128
      // 0ee: goto 0f5
      // 0f1: invokestatic y1i.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifne 123
      // 0f8: goto 0ff
      // 0fb: invokestatic y1i.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aconst_null
      // 100: areturn
      // 101: invokestatic y1i.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: aload 6
      // 108: bipush 3
      // 109: bipush 39
      // 10b: bipush 0
      // 10c: invokevirtual y1i.ghh (Lerg;IIZ)Z
      // 10f: iload 3
      // 110: ifeq 128
      // 113: ifne 123
      // 116: goto 11d
      // 119: invokestatic y1i.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aconst_null
      // 11e: areturn
      // 11f: invokestatic y1i.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 6
      // 125: getfield erg.qd2 I
      // 128: ifne 13f
      // 12b: aload 5
      // 12d: aconst_null
      // 12e: checkcast erg
      // 131: invokevirtual vrx.yn7 (Lerg;)V
      // 134: iload 3
      // 135: ifne 14b
      // 138: goto 13f
      // 13b: invokestatic y1i.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 5
      // 141: invokevirtual vrx.vc1 ()V
      // 144: goto 14b
      // 147: invokestatic y1i.a (Loov;)Loov;
      // 14a: athrow
      // 14b: aload 6
      // 14d: getfield erg.qd2 I
      // 150: aload 4
      // 152: getfield erg.qd2 I
      // 155: if_icmpne 15e
      // 158: aconst_null
      // 159: areturn
      // 15a: invokestatic y1i.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 5
      // 160: aload 1
      // 161: aload 6
      // 163: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 166: aload 4
      // 168: areturn
   }

   public void gj2(String param1) {
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
      // 05: aload 1
      // 06: putfield y1i._bj Ljava/lang/String;
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifne 5a
      // 0e: bipush 2
      // 0f: invokevirtual y1i.ajr (I)Lvrx;
      // 12: invokevirtual vrx.hf8 ()Z
      // 15: ifeq 59
      // 18: goto 1f
      // 1b: invokestatic y1i.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: bipush 2
      // 21: invokevirtual y1i.ajr (I)Lvrx;
      // 24: invokevirtual vrx.x4s ()Lerg;
      // 27: astore 3
      // 28: iload 2
      // 29: ifne 45
      // 2c: aload 1
      // 2d: invokestatic org/apache/commons/lang3/StringUtils.isBlank (Ljava/lang/CharSequence;)Z
      // 30: ifeq 49
      // 33: goto 3a
      // 36: invokestatic y1i.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 3
      // 3b: invokevirtual erg.a2y ()V
      // 3e: goto 45
      // 41: invokestatic y1i.a (Loov;)Loov;
      // 44: athrow
      // 45: iload 2
      // 46: ifeq 59
      // 49: aload 3
      // 4a: aload 0
      // 4b: getfield y1i._bj Ljava/lang/String;
      // 4e: invokevirtual erg.dou (Ljava/lang/String;)Lerg;
      // 51: pop
      // 52: goto 59
      // 55: invokestatic y1i.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 0
      // 5a: invokevirtual y1i.bou ()V
      // 5d: return
   }

   public static rsi xe0(y1i var0) {
      return var0.zrb;
   }

   public static int qan(y1i var0) {
      return var0.fvz;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1922309768412546729L, 6524932219486473637L, MethodHandles.lookup().lookupClass()).a(254229513485933L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 88776931793891L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("%±÷ÆEjFt".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      d = var6;
      sx0 = LogManager.getLogger();
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
}
