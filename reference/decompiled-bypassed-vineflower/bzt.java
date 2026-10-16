import java.awt.image.BufferedImage;

public class bzt implements ji7 {
   @Override
   public BufferedImage parseUserSkin(BufferedImage param1) {
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
      // 005: iload 2
      // 006: ifeq 026
      // 009: ifnonnull 019
      // 00c: goto 013
      // 00f: invokestatic bzt.a (Loov;)Loov;
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: invokestatic bzt.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: bipush 64
      // 01c: putfield bzt.bsx I
      // 01f: aload 0
      // 020: bipush 64
      // 022: putfield bzt.gt8 I
      // 025: aload 1
      // 026: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 029: istore 3
      // 02a: aload 1
      // 02b: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 02e: istore 4
      // 030: bipush 1
      // 031: istore 5
      // 033: aload 0
      // 034: getfield bzt.bsx I
      // 037: iload 3
      // 038: if_icmplt 05a
      // 03b: aload 0
      // 03c: getfield bzt.gt8 I
      // 03f: iload 4
      // 041: iload 2
      // 042: ifeq 078
      // 045: iload 2
      // 046: ifeq 078
      // 049: goto 050
      // 04c: invokestatic bzt.a (Loov;)Loov;
      // 04f: athrow
      // 050: if_icmpge 07f
      // 053: goto 05a
      // 056: invokestatic bzt.a (Loov;)Loov;
      // 059: athrow
      // 05a: aload 0
      // 05b: dup
      // 05c: getfield bzt.bsx I
      // 05f: bipush 2
      // 060: imul
      // 061: putfield bzt.bsx I
      // 064: aload 0
      // 065: dup
      // 066: getfield bzt.gt8 I
      // 069: bipush 2
      // 06a: imul
      // 06b: putfield bzt.gt8 I
      // 06e: iload 5
      // 070: bipush 2
      // 071: goto 078
      // 074: invokestatic bzt.a (Loov;)Loov;
      // 077: athrow
      // 078: imul
      // 079: istore 5
      // 07b: iload 2
      // 07c: ifne 033
      // 07f: new java/awt/image/BufferedImage
      // 082: dup
      // 083: aload 0
      // 084: getfield bzt.bsx I
      // 087: aload 0
      // 088: getfield bzt.gt8 I
      // 08b: bipush 2
      // 08c: invokespecial java/awt/image/BufferedImage.<init> (III)V
      // 08f: astore 6
      // 091: aload 6
      // 093: invokevirtual java/awt/image/BufferedImage.getGraphics ()Ljava/awt/Graphics;
      // 096: astore 7
      // 098: aload 7
      // 09a: aload 1
      // 09b: bipush 0
      // 09c: bipush 0
      // 09d: aconst_null
      // 09e: checkcast java/awt/image/ImageObserver
      // 0a1: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
      // 0a4: pop
      // 0a5: aload 1
      // 0a6: iload 2
      // 0a7: ifeq 41a
      // 0aa: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 0ad: bipush 32
      // 0af: iload 5
      // 0b1: imul
      // 0b2: if_icmpne 32f
      // 0b5: goto 0bc
      // 0b8: invokestatic bzt.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 7
      // 0be: aload 6
      // 0c0: bipush 24
      // 0c2: iload 5
      // 0c4: imul
      // 0c5: bipush 48
      // 0c7: iload 5
      // 0c9: imul
      // 0ca: bipush 20
      // 0cc: iload 5
      // 0ce: imul
      // 0cf: bipush 52
      // 0d1: iload 5
      // 0d3: imul
      // 0d4: bipush 4
      // 0d5: iload 5
      // 0d7: imul
      // 0d8: bipush 16
      // 0da: iload 5
      // 0dc: imul
      // 0dd: bipush 8
      // 0df: iload 5
      // 0e1: imul
      // 0e2: bipush 20
      // 0e4: iload 5
      // 0e6: imul
      // 0e7: aconst_null
      // 0e8: checkcast java/awt/image/ImageObserver
      // 0eb: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 0ee: pop
      // 0ef: aload 7
      // 0f1: aload 6
      // 0f3: bipush 28
      // 0f5: iload 5
      // 0f7: imul
      // 0f8: bipush 48
      // 0fa: iload 5
      // 0fc: imul
      // 0fd: bipush 24
      // 0ff: iload 5
      // 101: imul
      // 102: bipush 52
      // 104: iload 5
      // 106: imul
      // 107: bipush 8
      // 109: iload 5
      // 10b: imul
      // 10c: bipush 16
      // 10e: iload 5
      // 110: imul
      // 111: bipush 12
      // 113: iload 5
      // 115: imul
      // 116: bipush 20
      // 118: iload 5
      // 11a: imul
      // 11b: aconst_null
      // 11c: checkcast java/awt/image/ImageObserver
      // 11f: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 122: pop
      // 123: aload 7
      // 125: aload 6
      // 127: bipush 20
      // 129: iload 5
      // 12b: imul
      // 12c: bipush 52
      // 12e: iload 5
      // 130: imul
      // 131: bipush 16
      // 133: iload 5
      // 135: imul
      // 136: bipush 64
      // 138: iload 5
      // 13a: imul
      // 13b: bipush 8
      // 13d: iload 5
      // 13f: imul
      // 140: bipush 20
      // 142: iload 5
      // 144: imul
      // 145: bipush 12
      // 147: iload 5
      // 149: imul
      // 14a: bipush 32
      // 14c: iload 5
      // 14e: imul
      // 14f: aconst_null
      // 150: checkcast java/awt/image/ImageObserver
      // 153: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 156: pop
      // 157: aload 7
      // 159: aload 6
      // 15b: bipush 24
      // 15d: iload 5
      // 15f: imul
      // 160: bipush 52
      // 162: iload 5
      // 164: imul
      // 165: bipush 20
      // 167: iload 5
      // 169: imul
      // 16a: bipush 64
      // 16c: iload 5
      // 16e: imul
      // 16f: bipush 4
      // 170: iload 5
      // 172: imul
      // 173: bipush 20
      // 175: iload 5
      // 177: imul
      // 178: bipush 8
      // 17a: iload 5
      // 17c: imul
      // 17d: bipush 32
      // 17f: iload 5
      // 181: imul
      // 182: aconst_null
      // 183: checkcast java/awt/image/ImageObserver
      // 186: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 189: pop
      // 18a: aload 7
      // 18c: aload 6
      // 18e: bipush 28
      // 190: iload 5
      // 192: imul
      // 193: bipush 52
      // 195: iload 5
      // 197: imul
      // 198: bipush 24
      // 19a: iload 5
      // 19c: imul
      // 19d: bipush 64
      // 19f: iload 5
      // 1a1: imul
      // 1a2: bipush 0
      // 1a3: iload 5
      // 1a5: imul
      // 1a6: bipush 20
      // 1a8: iload 5
      // 1aa: imul
      // 1ab: bipush 4
      // 1ac: iload 5
      // 1ae: imul
      // 1af: bipush 32
      // 1b1: iload 5
      // 1b3: imul
      // 1b4: aconst_null
      // 1b5: checkcast java/awt/image/ImageObserver
      // 1b8: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 1bb: pop
      // 1bc: aload 7
      // 1be: aload 6
      // 1c0: bipush 32
      // 1c2: iload 5
      // 1c4: imul
      // 1c5: bipush 52
      // 1c7: iload 5
      // 1c9: imul
      // 1ca: bipush 28
      // 1cc: iload 5
      // 1ce: imul
      // 1cf: bipush 64
      // 1d1: iload 5
      // 1d3: imul
      // 1d4: bipush 12
      // 1d6: iload 5
      // 1d8: imul
      // 1d9: bipush 20
      // 1db: iload 5
      // 1dd: imul
      // 1de: bipush 16
      // 1e0: iload 5
      // 1e2: imul
      // 1e3: bipush 32
      // 1e5: iload 5
      // 1e7: imul
      // 1e8: aconst_null
      // 1e9: checkcast java/awt/image/ImageObserver
      // 1ec: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 1ef: pop
      // 1f0: aload 7
      // 1f2: aload 6
      // 1f4: bipush 40
      // 1f6: iload 5
      // 1f8: imul
      // 1f9: bipush 48
      // 1fb: iload 5
      // 1fd: imul
      // 1fe: bipush 36
      // 200: iload 5
      // 202: imul
      // 203: bipush 52
      // 205: iload 5
      // 207: imul
      // 208: bipush 44
      // 20a: iload 5
      // 20c: imul
      // 20d: bipush 16
      // 20f: iload 5
      // 211: imul
      // 212: bipush 48
      // 214: iload 5
      // 216: imul
      // 217: bipush 20
      // 219: iload 5
      // 21b: imul
      // 21c: aconst_null
      // 21d: checkcast java/awt/image/ImageObserver
      // 220: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 223: pop
      // 224: aload 7
      // 226: aload 6
      // 228: bipush 44
      // 22a: iload 5
      // 22c: imul
      // 22d: bipush 48
      // 22f: iload 5
      // 231: imul
      // 232: bipush 40
      // 234: iload 5
      // 236: imul
      // 237: bipush 52
      // 239: iload 5
      // 23b: imul
      // 23c: bipush 48
      // 23e: iload 5
      // 240: imul
      // 241: bipush 16
      // 243: iload 5
      // 245: imul
      // 246: bipush 52
      // 248: iload 5
      // 24a: imul
      // 24b: bipush 20
      // 24d: iload 5
      // 24f: imul
      // 250: aconst_null
      // 251: checkcast java/awt/image/ImageObserver
      // 254: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 257: pop
      // 258: aload 7
      // 25a: aload 6
      // 25c: bipush 36
      // 25e: iload 5
      // 260: imul
      // 261: bipush 52
      // 263: iload 5
      // 265: imul
      // 266: bipush 32
      // 268: iload 5
      // 26a: imul
      // 26b: bipush 64
      // 26d: iload 5
      // 26f: imul
      // 270: bipush 48
      // 272: iload 5
      // 274: imul
      // 275: bipush 20
      // 277: iload 5
      // 279: imul
      // 27a: bipush 52
      // 27c: iload 5
      // 27e: imul
      // 27f: bipush 32
      // 281: iload 5
      // 283: imul
      // 284: aconst_null
      // 285: checkcast java/awt/image/ImageObserver
      // 288: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 28b: pop
      // 28c: aload 7
      // 28e: aload 6
      // 290: bipush 40
      // 292: iload 5
      // 294: imul
      // 295: bipush 52
      // 297: iload 5
      // 299: imul
      // 29a: bipush 36
      // 29c: iload 5
      // 29e: imul
      // 29f: bipush 64
      // 2a1: iload 5
      // 2a3: imul
      // 2a4: bipush 44
      // 2a6: iload 5
      // 2a8: imul
      // 2a9: bipush 20
      // 2ab: iload 5
      // 2ad: imul
      // 2ae: bipush 48
      // 2b0: iload 5
      // 2b2: imul
      // 2b3: bipush 32
      // 2b5: iload 5
      // 2b7: imul
      // 2b8: aconst_null
      // 2b9: checkcast java/awt/image/ImageObserver
      // 2bc: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 2bf: pop
      // 2c0: aload 7
      // 2c2: aload 6
      // 2c4: bipush 44
      // 2c6: iload 5
      // 2c8: imul
      // 2c9: bipush 52
      // 2cb: iload 5
      // 2cd: imul
      // 2ce: bipush 40
      // 2d0: iload 5
      // 2d2: imul
      // 2d3: bipush 64
      // 2d5: iload 5
      // 2d7: imul
      // 2d8: bipush 40
      // 2da: iload 5
      // 2dc: imul
      // 2dd: bipush 20
      // 2df: iload 5
      // 2e1: imul
      // 2e2: bipush 44
      // 2e4: iload 5
      // 2e6: imul
      // 2e7: bipush 32
      // 2e9: iload 5
      // 2eb: imul
      // 2ec: aconst_null
      // 2ed: checkcast java/awt/image/ImageObserver
      // 2f0: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 2f3: pop
      // 2f4: aload 7
      // 2f6: aload 6
      // 2f8: bipush 48
      // 2fa: iload 5
      // 2fc: imul
      // 2fd: bipush 52
      // 2ff: iload 5
      // 301: imul
      // 302: bipush 44
      // 304: iload 5
      // 306: imul
      // 307: bipush 64
      // 309: iload 5
      // 30b: imul
      // 30c: bipush 52
      // 30e: iload 5
      // 310: imul
      // 311: bipush 20
      // 313: iload 5
      // 315: imul
      // 316: bipush 56
      // 318: iload 5
      // 31a: imul
      // 31b: bipush 32
      // 31d: iload 5
      // 31f: imul
      // 320: aconst_null
      // 321: checkcast java/awt/image/ImageObserver
      // 324: invokevirtual java/awt/Graphics.drawImage (Ljava/awt/Image;IIIIIIIILjava/awt/image/ImageObserver;)Z
      // 327: pop
      // 328: goto 32f
      // 32b: invokestatic bzt.a (Loov;)Loov;
      // 32e: athrow
      // 32f: aload 7
      // 331: invokevirtual java/awt/Graphics.dispose ()V
      // 334: aload 0
      // 335: aload 6
      // 337: invokevirtual java/awt/image/BufferedImage.getRaster ()Ljava/awt/image/WritableRaster;
      // 33a: invokevirtual java/awt/image/WritableRaster.getDataBuffer ()Ljava/awt/image/DataBuffer;
      // 33d: checkcast java/awt/image/DataBufferInt
      // 340: invokevirtual java/awt/image/DataBufferInt.getData ()[I
      // 343: putfield bzt._ce [I
      // 346: aload 0
      // 347: bipush 0
      // 348: iload 5
      // 34a: imul
      // 34b: bipush 0
      // 34c: iload 5
      // 34e: imul
      // 34f: bipush 32
      // 351: iload 5
      // 353: imul
      // 354: bipush 16
      // 356: iload 5
      // 358: imul
      // 359: invokespecial bzt.ob6 (IIII)V
      // 35c: aload 0
      // 35d: bipush 32
      // 35f: iload 5
      // 361: imul
      // 362: bipush 0
      // 363: iload 5
      // 365: imul
      // 366: bipush 64
      // 368: iload 5
      // 36a: imul
      // 36b: bipush 32
      // 36d: iload 5
      // 36f: imul
      // 370: invokespecial bzt.ybu (IIII)V
      // 373: aload 0
      // 374: bipush 0
      // 375: iload 5
      // 377: imul
      // 378: bipush 16
      // 37a: iload 5
      // 37c: imul
      // 37d: bipush 64
      // 37f: iload 5
      // 381: imul
      // 382: bipush 32
      // 384: iload 5
      // 386: imul
      // 387: invokespecial bzt.ob6 (IIII)V
      // 38a: aload 0
      // 38b: bipush 0
      // 38c: iload 5
      // 38e: imul
      // 38f: bipush 32
      // 391: iload 5
      // 393: imul
      // 394: bipush 16
      // 396: iload 5
      // 398: imul
      // 399: bipush 48
      // 39b: iload 5
      // 39d: imul
      // 39e: invokespecial bzt.ybu (IIII)V
      // 3a1: aload 0
      // 3a2: bipush 16
      // 3a4: iload 5
      // 3a6: imul
      // 3a7: bipush 32
      // 3a9: iload 5
      // 3ab: imul
      // 3ac: bipush 40
      // 3ae: iload 5
      // 3b0: imul
      // 3b1: bipush 48
      // 3b3: iload 5
      // 3b5: imul
      // 3b6: invokespecial bzt.ybu (IIII)V
      // 3b9: aload 0
      // 3ba: bipush 40
      // 3bc: iload 5
      // 3be: imul
      // 3bf: bipush 32
      // 3c1: iload 5
      // 3c3: imul
      // 3c4: bipush 56
      // 3c6: iload 5
      // 3c8: imul
      // 3c9: bipush 48
      // 3cb: iload 5
      // 3cd: imul
      // 3ce: invokespecial bzt.ybu (IIII)V
      // 3d1: aload 0
      // 3d2: bipush 0
      // 3d3: iload 5
      // 3d5: imul
      // 3d6: bipush 48
      // 3d8: iload 5
      // 3da: imul
      // 3db: bipush 16
      // 3dd: iload 5
      // 3df: imul
      // 3e0: bipush 64
      // 3e2: iload 5
      // 3e4: imul
      // 3e5: invokespecial bzt.ybu (IIII)V
      // 3e8: aload 0
      // 3e9: bipush 16
      // 3eb: iload 5
      // 3ed: imul
      // 3ee: bipush 48
      // 3f0: iload 5
      // 3f2: imul
      // 3f3: bipush 48
      // 3f5: iload 5
      // 3f7: imul
      // 3f8: bipush 64
      // 3fa: iload 5
      // 3fc: imul
      // 3fd: invokespecial bzt.ob6 (IIII)V
      // 400: aload 0
      // 401: bipush 48
      // 403: iload 5
      // 405: imul
      // 406: bipush 48
      // 408: iload 5
      // 40a: imul
      // 40b: bipush 64
      // 40d: iload 5
      // 40f: imul
      // 410: bipush 64
      // 412: iload 5
      // 414: imul
      // 415: invokespecial bzt.ybu (IIII)V
      // 418: aload 6
      // 41a: areturn
   }

   @Override
   public void skinAvailable() {
   }

   private void ybu(int var1, int var2, int var3, int var4) {
      int var5 = t9d.b();

      int var10000;
      label48: {
         try {
            var10000 = this.qtk(var1, var2, var3, var4);
            if (var5 == 0) {
               break label48;
            }

            if (var10000 != 0) {
               return;
            }
         } catch (oov var9) {
            throw a(var9);
         }

         var10000 = var1;
      }

      int var6 = var10000;

      while (var6 < var3) {
         int var7 = var2;

         label37: {
            while (var7 < var4) {
               try {
                  this._ce[var6 + var7 * this.bsx] = this._ce[var6 + var7 * this.bsx] & 16777215;
                  var7++;
                  if (var5 == 0) {
                     break label37;
                  }

                  if (var5 == 0) {
                     break;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }
            }

            var6++;
         }

         if (var5 == 0) {
            break;
         }
      }
   }

   private void ob6(int var1, int var2, int var3, int var4) {
      int var5 = t9d.b();
      int var6 = var1;

      while (var6 < var3) {
         int var7 = var2;

         while (true) {
            if (var7 < var4) {
               try {
                  this._ce[var6 + var7 * this.bsx] = this._ce[var6 + var7 * this.bsx] | 0xFF000000;
                  var7++;
                  if (var5 == 0) {
                     break;
                  }

                  if (var5 != 0) {
                     continue;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }
            }

            var6++;
            break;
         }

         if (var5 == 0) {
            break;
         }
      }
   }

   private boolean qtk(int var1, int var2, int var3, int var4) {
      int var5 = t9d.b();
      int var6 = var1;

      label62:
      while (true) {
         int var10000 = var6;
         int var10001 = var3;

         label58:
         while (var10000 < var10001) {
            if (var5 == 0) {
               return (boolean)var2;
            }

            int var7 = var2;

            while (var7 < var4) {
               int var8 = this._ce[var6 + var7 * this.bsx];

               label67: {
                  try {
                     if (var5 == 0) {
                        break label67;
                     }

                     var10000 = var8 >> 24 & 0xFF;
                     var10001 = 128;
                     if (var5 == 0) {
                        continue label58;
                     }
                  } catch (oov var9) {
                     throw a(var9);
                  }

                  try {
                     if (var10000 < var10001) {
                        return true;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  var7++;
               }

               if (var5 == 0) {
                  break;
               }
            }

            var6++;
            if (var5 != 0) {
               continue label62;
            }
            break;
         }

         return (boolean)0;
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
