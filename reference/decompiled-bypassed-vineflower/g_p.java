import java.util.Random;

public class g_p extends r45 {
   public double wqt;
   public double vqh;
   public double p5n;

   public g_p() {
      this(new Random());
   }

   public g_p(Random var1) {
      int var10000 = t9d.b();
      this.qvk = new int[512];
      this.wqt = var1.nextDouble() * 256.0;
      int var2 = var10000;
      this.vqh = var1.nextDouble() * 256.0;
      this.p5n = var1.nextDouble() * 256.0;
      int var3 = 0;

      while (true) {
         if (var3 < 256) {
            try {
               this.qvk[var3] = var3++;
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         var3 = 0;
         break;
      }

      while (var3 < 256) {
         int var4 = var1.nextInt(256 - var3) + var3;
         int var5 = this.qvk[var3];
         this.qvk[var3] = this.qvk[var4];
         this.qvk[var4] = var5;
         this.qvk[var3 + 256] = this.qvk[var3];
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public final double whn(double var1, double var3, double var5) {
      return var3 + var1 * (var5 - var3);
   }

   public final double ns3(int var1, double var2, double var4) {
      int var6 = var1 & 15;
      return tyu[var6] * var2 + egg[var6] * var4;
   }

   public final double wms(int var1, double var2, double var4, double var6) {
      int var8 = var1 & 15;
      return dax[var8] * var2 + xbb[var8] * var4 + asw[var8] * var6;
   }

   public void t7b(
      double[] param1,
      double param2,
      double param4,
      double param6,
      int param8,
      int param9,
      int param10,
      double param11,
      double param13,
      double param15,
      double param17
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 19
      // 005: iload 9
      // 007: iload 19
      // 009: ifeq 1cf
      // 00c: bipush 1
      // 00d: if_icmpne 1c7
      // 010: goto 017
      // 013: invokestatic g_p.a (Loov;)Loov;
      // 016: athrow
      // 017: bipush 0
      // 018: istore 20
      // 01a: bipush 0
      // 01b: istore 21
      // 01d: bipush 0
      // 01e: istore 22
      // 020: bipush 0
      // 021: istore 23
      // 023: dconst_0
      // 024: dstore 24
      // 026: dconst_0
      // 027: dstore 26
      // 029: bipush 0
      // 02a: istore 28
      // 02c: dconst_1
      // 02d: dload 17
      // 02f: ddiv
      // 030: dstore 29
      // 032: bipush 0
      // 033: istore 31
      // 035: iload 31
      // 037: iload 8
      // 039: if_icmpge 1c2
      // 03c: dload 2
      // 03d: iload 31
      // 03f: i2d
      // 040: dload 11
      // 042: dmul
      // 043: dadd
      // 044: aload 0
      // 045: getfield g_p.wqt D
      // 048: dadd
      // 049: dstore 32
      // 04b: dload 32
      // 04d: d2i
      // 04e: istore 34
      // 050: iload 19
      // 052: ifeq 4be
      // 055: dload 32
      // 057: iload 34
      // 059: i2d
      // 05a: dcmpg
      // 05b: iload 19
      // 05d: ifeq 07a
      // 060: goto 067
      // 063: invokestatic g_p.a (Loov;)Loov;
      // 066: athrow
      // 067: ifge 074
      // 06a: goto 071
      // 06d: invokestatic g_p.a (Loov;)Loov;
      // 070: athrow
      // 071: iinc 34 -1
      // 074: iload 34
      // 076: sipush 255
      // 079: iand
      // 07a: istore 35
      // 07c: dload 32
      // 07e: iload 34
      // 080: i2d
      // 081: dsub
      // 082: dstore 32
      // 084: dload 32
      // 086: dload 32
      // 088: dmul
      // 089: dload 32
      // 08b: dmul
      // 08c: dload 32
      // 08e: dload 32
      // 090: ldc2_w 6.0
      // 093: dmul
      // 094: ldc2_w 15.0
      // 097: dsub
      // 098: dmul
      // 099: ldc2_w 10.0
      // 09c: dadd
      // 09d: dmul
      // 09e: dstore 36
      // 0a0: bipush 0
      // 0a1: istore 38
      // 0a3: iload 38
      // 0a5: iload 10
      // 0a7: if_icmpge 1ba
      // 0aa: dload 6
      // 0ac: iload 38
      // 0ae: i2d
      // 0af: dload 15
      // 0b1: dmul
      // 0b2: dadd
      // 0b3: aload 0
      // 0b4: getfield g_p.p5n D
      // 0b7: dadd
      // 0b8: dstore 39
      // 0ba: dload 39
      // 0bc: d2i
      // 0bd: istore 41
      // 0bf: dload 39
      // 0c1: iload 41
      // 0c3: i2d
      // 0c4: dcmpg
      // 0c5: iload 19
      // 0c7: ifeq 037
      // 0ca: iload 19
      // 0cc: ifeq 0e2
      // 0cf: ifge 0dc
      // 0d2: goto 0d9
      // 0d5: invokestatic g_p.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iinc 41 -1
      // 0dc: iload 41
      // 0de: sipush 255
      // 0e1: iand
      // 0e2: istore 42
      // 0e4: dload 39
      // 0e6: iload 41
      // 0e8: i2d
      // 0e9: dsub
      // 0ea: dstore 39
      // 0ec: dload 39
      // 0ee: dload 39
      // 0f0: dmul
      // 0f1: dload 39
      // 0f3: dmul
      // 0f4: dload 39
      // 0f6: dload 39
      // 0f8: ldc2_w 6.0
      // 0fb: dmul
      // 0fc: ldc2_w 15.0
      // 0ff: dsub
      // 100: dmul
      // 101: ldc2_w 10.0
      // 104: dadd
      // 105: dmul
      // 106: dstore 43
      // 108: aload 0
      // 109: getfield g_p.qvk [I
      // 10c: iload 35
      // 10e: iaload
      // 10f: bipush 0
      // 110: iadd
      // 111: istore 20
      // 113: aload 0
      // 114: getfield g_p.qvk [I
      // 117: iload 20
      // 119: iaload
      // 11a: iload 42
      // 11c: iadd
      // 11d: istore 21
      // 11f: aload 0
      // 120: getfield g_p.qvk [I
      // 123: iload 35
      // 125: bipush 1
      // 126: iadd
      // 127: iaload
      // 128: bipush 0
      // 129: iadd
      // 12a: istore 22
      // 12c: aload 0
      // 12d: getfield g_p.qvk [I
      // 130: iload 22
      // 132: iaload
      // 133: iload 42
      // 135: iadd
      // 136: istore 23
      // 138: aload 0
      // 139: dload 36
      // 13b: aload 0
      // 13c: aload 0
      // 13d: getfield g_p.qvk [I
      // 140: iload 21
      // 142: iaload
      // 143: dload 32
      // 145: dload 39
      // 147: invokevirtual g_p.ns3 (IDD)D
      // 14a: aload 0
      // 14b: aload 0
      // 14c: getfield g_p.qvk [I
      // 14f: iload 23
      // 151: iaload
      // 152: dload 32
      // 154: dconst_1
      // 155: dsub
      // 156: dconst_0
      // 157: dload 39
      // 159: invokevirtual g_p.wms (IDDD)D
      // 15c: invokevirtual g_p.whn (DDD)D
      // 15f: dstore 24
      // 161: aload 0
      // 162: dload 36
      // 164: aload 0
      // 165: aload 0
      // 166: getfield g_p.qvk [I
      // 169: iload 21
      // 16b: bipush 1
      // 16c: iadd
      // 16d: iaload
      // 16e: dload 32
      // 170: dconst_0
      // 171: dload 39
      // 173: dconst_1
      // 174: dsub
      // 175: invokevirtual g_p.wms (IDDD)D
      // 178: aload 0
      // 179: aload 0
      // 17a: getfield g_p.qvk [I
      // 17d: iload 23
      // 17f: bipush 1
      // 180: iadd
      // 181: iaload
      // 182: dload 32
      // 184: dconst_1
      // 185: dsub
      // 186: dconst_0
      // 187: dload 39
      // 189: dconst_1
      // 18a: dsub
      // 18b: invokevirtual g_p.wms (IDDD)D
      // 18e: invokevirtual g_p.whn (DDD)D
      // 191: dstore 26
      // 193: aload 0
      // 194: dload 43
      // 196: dload 24
      // 198: dload 26
      // 19a: invokevirtual g_p.whn (DDD)D
      // 19d: dstore 45
      // 19f: iload 28
      // 1a1: iinc 28 1
      // 1a4: istore 47
      // 1a6: aload 1
      // 1a7: iload 47
      // 1a9: dup2
      // 1aa: daload
      // 1ab: dload 45
      // 1ad: dload 29
      // 1af: dmul
      // 1b0: dadd
      // 1b1: dastore
      // 1b2: iinc 38 1
      // 1b5: iload 19
      // 1b7: ifne 0a3
      // 1ba: iinc 31 1
      // 1bd: iload 19
      // 1bf: ifne 035
      // 1c2: iload 19
      // 1c4: ifne 4be
      // 1c7: bipush 0
      // 1c8: goto 1cf
      // 1cb: invokestatic g_p.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: istore 20
      // 1d1: dconst_1
      // 1d2: dload 17
      // 1d4: ddiv
      // 1d5: dstore 21
      // 1d7: bipush -1
      // 1d8: istore 23
      // 1da: bipush 0
      // 1db: istore 24
      // 1dd: bipush 0
      // 1de: istore 25
      // 1e0: bipush 0
      // 1e1: istore 26
      // 1e3: bipush 0
      // 1e4: istore 27
      // 1e6: bipush 0
      // 1e7: istore 28
      // 1e9: bipush 0
      // 1ea: istore 29
      // 1ec: dconst_0
      // 1ed: dstore 30
      // 1ef: dconst_0
      // 1f0: dstore 32
      // 1f2: dconst_0
      // 1f3: dstore 34
      // 1f5: dconst_0
      // 1f6: dstore 36
      // 1f8: bipush 0
      // 1f9: istore 38
      // 1fb: iload 38
      // 1fd: iload 8
      // 1ff: if_icmpge 4be
      // 202: dload 2
      // 203: iload 38
      // 205: i2d
      // 206: dload 11
      // 208: dmul
      // 209: dadd
      // 20a: aload 0
      // 20b: getfield g_p.wqt D
      // 20e: dadd
      // 20f: dstore 39
      // 211: dload 39
      // 213: d2i
      // 214: istore 41
      // 216: dload 39
      // 218: iload 41
      // 21a: i2d
      // 21b: dcmpg
      // 21c: iload 19
      // 21e: ifeq 234
      // 221: ifge 22e
      // 224: goto 22b
      // 227: invokestatic g_p.a (Loov;)Loov;
      // 22a: athrow
      // 22b: iinc 41 -1
      // 22e: iload 41
      // 230: sipush 255
      // 233: iand
      // 234: istore 42
      // 236: dload 39
      // 238: iload 41
      // 23a: i2d
      // 23b: dsub
      // 23c: dstore 39
      // 23e: dload 39
      // 240: dload 39
      // 242: dmul
      // 243: dload 39
      // 245: dmul
      // 246: dload 39
      // 248: dload 39
      // 24a: ldc2_w 6.0
      // 24d: dmul
      // 24e: ldc2_w 15.0
      // 251: dsub
      // 252: dmul
      // 253: ldc2_w 10.0
      // 256: dadd
      // 257: dmul
      // 258: dstore 43
      // 25a: bipush 0
      // 25b: istore 45
      // 25d: iload 45
      // 25f: iload 10
      // 261: if_icmpge 4b6
      // 264: dload 6
      // 266: iload 45
      // 268: i2d
      // 269: dload 15
      // 26b: dmul
      // 26c: dadd
      // 26d: aload 0
      // 26e: getfield g_p.p5n D
      // 271: dadd
      // 272: dstore 46
      // 274: dload 46
      // 276: d2i
      // 277: istore 48
      // 279: dload 46
      // 27b: iload 48
      // 27d: i2d
      // 27e: dcmpg
      // 27f: iload 19
      // 281: ifeq 1fd
      // 284: iload 19
      // 286: ifeq 29c
      // 289: ifge 296
      // 28c: goto 293
      // 28f: invokestatic g_p.a (Loov;)Loov;
      // 292: athrow
      // 293: iinc 48 -1
      // 296: iload 48
      // 298: sipush 255
      // 29b: iand
      // 29c: istore 49
      // 29e: dload 46
      // 2a0: iload 48
      // 2a2: i2d
      // 2a3: dsub
      // 2a4: dstore 46
      // 2a6: dload 46
      // 2a8: dload 46
      // 2aa: dmul
      // 2ab: dload 46
      // 2ad: dmul
      // 2ae: dload 46
      // 2b0: dload 46
      // 2b2: ldc2_w 6.0
      // 2b5: dmul
      // 2b6: ldc2_w 15.0
      // 2b9: dsub
      // 2ba: dmul
      // 2bb: ldc2_w 10.0
      // 2be: dadd
      // 2bf: dmul
      // 2c0: dstore 50
      // 2c2: bipush 0
      // 2c3: istore 52
      // 2c5: iload 52
      // 2c7: iload 9
      // 2c9: if_icmpge 4ae
      // 2cc: dload 4
      // 2ce: iload 52
      // 2d0: i2d
      // 2d1: dload 13
      // 2d3: dmul
      // 2d4: dadd
      // 2d5: aload 0
      // 2d6: getfield g_p.vqh D
      // 2d9: dadd
      // 2da: dstore 53
      // 2dc: dload 53
      // 2de: d2i
      // 2df: istore 55
      // 2e1: dload 53
      // 2e3: iload 55
      // 2e5: i2d
      // 2e6: dcmpg
      // 2e7: iload 19
      // 2e9: ifeq 25f
      // 2ec: iload 19
      // 2ee: ifeq 304
      // 2f1: ifge 2fe
      // 2f4: goto 2fb
      // 2f7: invokestatic g_p.a (Loov;)Loov;
      // 2fa: athrow
      // 2fb: iinc 55 -1
      // 2fe: iload 55
      // 300: sipush 255
      // 303: iand
      // 304: istore 56
      // 306: dload 53
      // 308: iload 55
      // 30a: i2d
      // 30b: dsub
      // 30c: dstore 53
      // 30e: dload 53
      // 310: dload 53
      // 312: dmul
      // 313: dload 53
      // 315: dmul
      // 316: dload 53
      // 318: dload 53
      // 31a: ldc2_w 6.0
      // 31d: dmul
      // 31e: ldc2_w 15.0
      // 321: dsub
      // 322: dmul
      // 323: ldc2_w 10.0
      // 326: dadd
      // 327: dmul
      // 328: dstore 57
      // 32a: iload 52
      // 32c: iload 19
      // 32e: ifeq 3a5
      // 331: ifeq 355
      // 334: goto 33b
      // 337: invokestatic g_p.a (Loov;)Loov;
      // 33a: athrow
      // 33b: iload 56
      // 33d: iload 23
      // 33f: iload 19
      // 341: ifeq 3a4
      // 344: goto 34b
      // 347: invokestatic g_p.a (Loov;)Loov;
      // 34a: athrow
      // 34b: if_icmpeq 46f
      // 34e: goto 355
      // 351: invokestatic g_p.a (Loov;)Loov;
      // 354: athrow
      // 355: iload 56
      // 357: istore 23
      // 359: aload 0
      // 35a: getfield g_p.qvk [I
      // 35d: iload 42
      // 35f: iaload
      // 360: iload 56
      // 362: iadd
      // 363: istore 24
      // 365: aload 0
      // 366: getfield g_p.qvk [I
      // 369: iload 24
      // 36b: iaload
      // 36c: iload 49
      // 36e: iadd
      // 36f: istore 25
      // 371: aload 0
      // 372: getfield g_p.qvk [I
      // 375: iload 24
      // 377: bipush 1
      // 378: iadd
      // 379: iaload
      // 37a: iload 49
      // 37c: iadd
      // 37d: istore 26
      // 37f: aload 0
      // 380: getfield g_p.qvk [I
      // 383: iload 42
      // 385: bipush 1
      // 386: iadd
      // 387: iaload
      // 388: iload 56
      // 38a: iadd
      // 38b: istore 27
      // 38d: aload 0
      // 38e: getfield g_p.qvk [I
      // 391: iload 27
      // 393: iaload
      // 394: iload 49
      // 396: iadd
      // 397: istore 28
      // 399: aload 0
      // 39a: getfield g_p.qvk [I
      // 39d: iload 27
      // 39f: bipush 1
      // 3a0: iadd
      // 3a1: iaload
      // 3a2: iload 49
      // 3a4: iadd
      // 3a5: istore 29
      // 3a7: aload 0
      // 3a8: dload 43
      // 3aa: aload 0
      // 3ab: aload 0
      // 3ac: getfield g_p.qvk [I
      // 3af: iload 25
      // 3b1: iaload
      // 3b2: dload 39
      // 3b4: dload 53
      // 3b6: dload 46
      // 3b8: invokevirtual g_p.wms (IDDD)D
      // 3bb: aload 0
      // 3bc: aload 0
      // 3bd: getfield g_p.qvk [I
      // 3c0: iload 28
      // 3c2: iaload
      // 3c3: dload 39
      // 3c5: dconst_1
      // 3c6: dsub
      // 3c7: dload 53
      // 3c9: dload 46
      // 3cb: invokevirtual g_p.wms (IDDD)D
      // 3ce: invokevirtual g_p.whn (DDD)D
      // 3d1: dstore 30
      // 3d3: aload 0
      // 3d4: dload 43
      // 3d6: aload 0
      // 3d7: aload 0
      // 3d8: getfield g_p.qvk [I
      // 3db: iload 26
      // 3dd: iaload
      // 3de: dload 39
      // 3e0: dload 53
      // 3e2: dconst_1
      // 3e3: dsub
      // 3e4: dload 46
      // 3e6: invokevirtual g_p.wms (IDDD)D
      // 3e9: aload 0
      // 3ea: aload 0
      // 3eb: getfield g_p.qvk [I
      // 3ee: iload 29
      // 3f0: iaload
      // 3f1: dload 39
      // 3f3: dconst_1
      // 3f4: dsub
      // 3f5: dload 53
      // 3f7: dconst_1
      // 3f8: dsub
      // 3f9: dload 46
      // 3fb: invokevirtual g_p.wms (IDDD)D
      // 3fe: invokevirtual g_p.whn (DDD)D
      // 401: dstore 32
      // 403: aload 0
      // 404: dload 43
      // 406: aload 0
      // 407: aload 0
      // 408: getfield g_p.qvk [I
      // 40b: iload 25
      // 40d: bipush 1
      // 40e: iadd
      // 40f: iaload
      // 410: dload 39
      // 412: dload 53
      // 414: dload 46
      // 416: dconst_1
      // 417: dsub
      // 418: invokevirtual g_p.wms (IDDD)D
      // 41b: aload 0
      // 41c: aload 0
      // 41d: getfield g_p.qvk [I
      // 420: iload 28
      // 422: bipush 1
      // 423: iadd
      // 424: iaload
      // 425: dload 39
      // 427: dconst_1
      // 428: dsub
      // 429: dload 53
      // 42b: dload 46
      // 42d: dconst_1
      // 42e: dsub
      // 42f: invokevirtual g_p.wms (IDDD)D
      // 432: invokevirtual g_p.whn (DDD)D
      // 435: dstore 34
      // 437: aload 0
      // 438: dload 43
      // 43a: aload 0
      // 43b: aload 0
      // 43c: getfield g_p.qvk [I
      // 43f: iload 26
      // 441: bipush 1
      // 442: iadd
      // 443: iaload
      // 444: dload 39
      // 446: dload 53
      // 448: dconst_1
      // 449: dsub
      // 44a: dload 46
      // 44c: dconst_1
      // 44d: dsub
      // 44e: invokevirtual g_p.wms (IDDD)D
      // 451: aload 0
      // 452: aload 0
      // 453: getfield g_p.qvk [I
      // 456: iload 29
      // 458: bipush 1
      // 459: iadd
      // 45a: iaload
      // 45b: dload 39
      // 45d: dconst_1
      // 45e: dsub
      // 45f: dload 53
      // 461: dconst_1
      // 462: dsub
      // 463: dload 46
      // 465: dconst_1
      // 466: dsub
      // 467: invokevirtual g_p.wms (IDDD)D
      // 46a: invokevirtual g_p.whn (DDD)D
      // 46d: dstore 36
      // 46f: aload 0
      // 470: dload 57
      // 472: dload 30
      // 474: dload 32
      // 476: invokevirtual g_p.whn (DDD)D
      // 479: dstore 59
      // 47b: aload 0
      // 47c: dload 57
      // 47e: dload 34
      // 480: dload 36
      // 482: invokevirtual g_p.whn (DDD)D
      // 485: dstore 61
      // 487: aload 0
      // 488: dload 50
      // 48a: dload 59
      // 48c: dload 61
      // 48e: invokevirtual g_p.whn (DDD)D
      // 491: dstore 63
      // 493: iload 20
      // 495: iinc 20 1
      // 498: istore 65
      // 49a: aload 1
      // 49b: iload 65
      // 49d: dup2
      // 49e: daload
      // 49f: dload 63
      // 4a1: dload 21
      // 4a3: dmul
      // 4a4: dadd
      // 4a5: dastore
      // 4a6: iinc 52 1
      // 4a9: iload 19
      // 4ab: ifne 2c5
      // 4ae: iinc 45 1
      // 4b1: iload 19
      // 4b3: ifne 25d
      // 4b6: iinc 38 1
      // 4b9: iload 19
      // 4bb: ifne 1fb
      // 4be: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
