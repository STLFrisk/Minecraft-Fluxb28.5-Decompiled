import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class six extends _jc {
   public rsi _7z;
   private t9d uqt;
   private mew gnd;
   private Random ql5;
   public int wm5;
   public int[] cus;
   public int[] upy;
   private static final long b;
   private static final String d;

   public six(jnq var1, t9d var2) {
      this(var1, var2, mew._9b);
   }

   public six(jnq var1, t9d var2, mew var3) {
      long var4 = b ^ 16656060913133L;
      super();
      this._7z = new six$1(this, d, true, 2);
      int var10000 = t9d.c();
      this.ql5 = new Random();
      this.cus = new int[3];
      int var6 = var10000;
      this.upy = new int[]{-1, -1, -1};
      this.uqt = var2;
      this.gnd = var3;
      this.wm5 = var1.jsr.k2f();
      this.zmp(new six$2(this, this._7z, 0, 15, 47));
      this.zmp(new six$3(this, this._7z, 1, 35, 47));
      int var7 = 0;

      while (true) {
         if (var7 < 3) {
            var11 = 0;
            if (var6 != 0) {
               break;
            }

            int var8 = 0;

            label42: {
               while (var8 < 9) {
                  try {
                     this.zmp(new vrx(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
                     var8++;
                     if (var6 != 0) {
                        break label42;
                     }

                     if (var6 != 0) {
                        break;
                     }
                  } catch (oov var9) {
                     throw a(var9);
                  }
               }

               var7++;
            }

            if (var6 == 0) {
               continue;
            }
         }

         var11 = 0;
         break;
      }

      var7 = var11;

      while (var7 < 9) {
         this.zmp(new vrx(var1, var7, 8 + var7 * 18, 142));
         var7++;
         if (var6 != 0) {
            break;
         }
      }
   }

   @Override
   public void c_j(flv var1) {
      super.c_j(var1);
      var1.vhx(this, 0, this.cus[0]);
      var1.vhx(this, 1, this.cus[1]);
      var1.vhx(this, 2, this.cus[2]);
      var1.vhx(this, 3, this.wm5 & -16);
      var1.vhx(this, 4, this.upy[0]);
      var1.vhx(this, 5, this.upy[1]);
      var1.vhx(this, 6, this.upy[2]);
   }

   @Override
   public void n4z() {
      super.n4z();
      int var10000 = t9d.b();
      int var2 = 0;
      int var1 = var10000;

      while (var2 < this.b57.size()) {
         flv var3 = (flv)this.b57.get(var2);
         var3.vhx(this, 0, this.cus[0]);
         var3.vhx(this, 1, this.cus[1]);
         var3.vhx(this, 2, this.cus[2]);
         var3.vhx(this, 3, this.wm5 & -16);
         var3.vhx(this, 4, this.upy[0]);
         var3.vhx(this, 5, this.upy[1]);
         var3.vhx(this, 6, this.upy[2]);
         var2++;
         if (var1 == 0) {
            break;
         }
      }
   }

   @Override
   public void l0n(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifeq 44
      // 09: iflt 3c
      // 0c: goto 13
      // 0f: invokestatic six.a (Loov;)Loov;
      // 12: athrow
      // 13: iload 1
      // 14: bipush 2
      // 15: iload 3
      // 16: ifeq 45
      // 19: goto 20
      // 1c: invokestatic six.a (Loov;)Loov;
      // 1f: athrow
      // 20: if_icmpgt 3c
      // 23: goto 2a
      // 26: invokestatic six.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield six.cus [I
      // 2e: iload 1
      // 2f: iload 2
      // 30: iastore
      // 31: iload 3
      // 32: ifne a8
      // 35: goto 3c
      // 38: invokestatic six.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 1
      // 3d: goto 44
      // 40: invokestatic six.a (Loov;)Loov;
      // 43: athrow
      // 44: bipush 3
      // 45: iload 3
      // 46: ifeq 6c
      // 49: if_icmpne 63
      // 4c: goto 53
      // 4f: invokestatic six.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: iload 2
      // 55: putfield six.wm5 I
      // 58: iload 3
      // 59: ifne a8
      // 5c: goto 63
      // 5f: invokestatic six.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 1
      // 64: bipush 4
      // 65: goto 6c
      // 68: invokestatic six.a (Loov;)Loov;
      // 6b: athrow
      // 6c: iload 3
      // 6d: ifeq 84
      // 70: if_icmplt 9b
      // 73: goto 7a
      // 76: invokestatic six.a (Loov;)Loov;
      // 79: athrow
      // 7a: iload 1
      // 7b: bipush 6
      // 7d: goto 84
      // 80: invokestatic six.a (Loov;)Loov;
      // 83: athrow
      // 84: if_icmpgt 9b
      // 87: aload 0
      // 88: getfield six.upy [I
      // 8b: iload 1
      // 8c: bipush 4
      // 8d: isub
      // 8e: iload 2
      // 8f: iastore
      // 90: iload 3
      // 91: ifne a8
      // 94: goto 9b
      // 97: invokestatic six.a (Loov;)Loov;
      // 9a: athrow
      // 9b: aload 0
      // 9c: iload 1
      // 9d: iload 2
      // 9e: invokespecial _jc.l0n (II)V
      // a1: goto a8
      // a4: invokestatic six.a (Loov;)Loov;
      // a7: athrow
      // a8: return
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 01f
      // 009: aload 0
      // 00a: getfield six._7z Lrsi;
      // 00d: if_acmpne 376
      // 010: goto 017
      // 013: invokestatic six.a (Loov;)Loov;
      // 016: athrow
      // 017: aload 1
      // 018: goto 01f
      // 01b: invokestatic six.a (Loov;)Loov;
      // 01e: athrow
      // 01f: bipush 0
      // 020: invokeinterface rsi.ibn (I)Lerg; 2
      // 025: astore 3
      // 026: aload 3
      // 027: iload 2
      // 028: ifne 036
      // 02b: ifnull 34f
      // 02e: goto 035
      // 031: invokestatic six.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 3
      // 036: invokevirtual erg.t25 ()Z
      // 039: iload 2
      // 03a: ifne 357
      // 03d: ifeq 34f
      // 040: goto 047
      // 043: invokestatic six.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield six.uqt Lt9d;
      // 04b: getfield t9d.v0f Z
      // 04e: iload 2
      // 04f: ifne 064
      // 052: goto 059
      // 055: invokestatic six.a (Loov;)Loov;
      // 058: athrow
      // 059: ifne 376
      // 05c: goto 063
      // 05f: invokestatic six.a (Loov;)Loov;
      // 062: athrow
      // 063: bipush 0
      // 064: istore 4
      // 066: bipush -1
      // 067: istore 5
      // 069: iload 5
      // 06b: bipush 1
      // 06c: if_icmpgt 22a
      // 06f: bipush -1
      // 070: iload 2
      // 071: ifne 237
      // 074: istore 6
      // 076: iload 6
      // 078: bipush 1
      // 079: if_icmpgt 223
      // 07c: iload 5
      // 07e: iload 2
      // 07f: ifne 06b
      // 082: iload 2
      // 083: ifne 0c1
      // 086: ifne 0a7
      // 089: goto 090
      // 08c: invokestatic six.a (Loov;)Loov;
      // 08f: athrow
      // 090: iload 6
      // 092: iload 2
      // 093: ifne 0c1
      // 096: goto 09d
      // 099: invokestatic six.a (Loov;)Loov;
      // 09c: athrow
      // 09d: ifeq 21c
      // 0a0: goto 0a7
      // 0a3: invokestatic six.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield six.uqt Lt9d;
      // 0ab: aload 0
      // 0ac: getfield six.gnd Lmew;
      // 0af: iload 6
      // 0b1: bipush 0
      // 0b2: iload 5
      // 0b4: invokevirtual mew.ec4 (III)Lmew;
      // 0b7: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 0ba: goto 0c1
      // 0bd: invokestatic six.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iload 2
      // 0c2: ifne 0f4
      // 0c5: ifeq 21c
      // 0c8: goto 0cf
      // 0cb: invokestatic six.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield six.uqt Lt9d;
      // 0d3: aload 0
      // 0d4: getfield six.gnd Lmew;
      // 0d7: iload 6
      // 0d9: bipush 1
      // 0da: iload 5
      // 0dc: invokevirtual mew.ec4 (III)Lmew;
      // 0df: iload 2
      // 0e0: ifne 112
      // 0e3: goto 0ea
      // 0e6: invokestatic six.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 0ed: goto 0f4
      // 0f0: invokestatic six.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: ifeq 21c
      // 0f7: aload 0
      // 0f8: getfield six.uqt Lt9d;
      // 0fb: aload 0
      // 0fc: getfield six.gnd Lmew;
      // 0ff: iload 6
      // 101: bipush 2
      // 102: imul
      // 103: bipush 0
      // 104: iload 5
      // 106: bipush 2
      // 107: imul
      // 108: invokevirtual mew.ec4 (III)Lmew;
      // 10b: goto 112
      // 10e: invokestatic six.a (Loov;)Loov;
      // 111: athrow
      // 112: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 115: invokeinterface zfz.r_y ()Le0x; 1
      // 11a: getstatic ox_.kzr Le0x;
      // 11d: iload 2
      // 11e: ifne 14d
      // 121: if_acmpne 12e
      // 124: goto 12b
      // 127: invokestatic six.a (Loov;)Loov;
      // 12a: athrow
      // 12b: iinc 4 1
      // 12e: aload 0
      // 12f: getfield six.uqt Lt9d;
      // 132: aload 0
      // 133: getfield six.gnd Lmew;
      // 136: iload 6
      // 138: bipush 2
      // 139: imul
      // 13a: bipush 1
      // 13b: iload 5
      // 13d: bipush 2
      // 13e: imul
      // 13f: invokevirtual mew.ec4 (III)Lmew;
      // 142: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 145: invokeinterface zfz.r_y ()Le0x; 1
      // 14a: getstatic ox_.kzr Le0x;
      // 14d: if_acmpne 153
      // 150: iinc 4 1
      // 153: iload 6
      // 155: iload 2
      // 156: ifne 165
      // 159: ifeq 21c
      // 15c: goto 163
      // 15f: invokestatic six.a (Loov;)Loov;
      // 162: athrow
      // 163: iload 5
      // 165: ifeq 21c
      // 168: aload 0
      // 169: getfield six.uqt Lt9d;
      // 16c: aload 0
      // 16d: getfield six.gnd Lmew;
      // 170: iload 6
      // 172: bipush 2
      // 173: imul
      // 174: bipush 0
      // 175: iload 5
      // 177: invokevirtual mew.ec4 (III)Lmew;
      // 17a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 17d: invokeinterface zfz.r_y ()Le0x; 1
      // 182: getstatic ox_.kzr Le0x;
      // 185: iload 2
      // 186: ifne 1ba
      // 189: goto 190
      // 18c: invokestatic six.a (Loov;)Loov;
      // 18f: athrow
      // 190: if_acmpne 19d
      // 193: goto 19a
      // 196: invokestatic six.a (Loov;)Loov;
      // 199: athrow
      // 19a: iinc 4 1
      // 19d: aload 0
      // 19e: getfield six.uqt Lt9d;
      // 1a1: aload 0
      // 1a2: getfield six.gnd Lmew;
      // 1a5: iload 6
      // 1a7: bipush 2
      // 1a8: imul
      // 1a9: bipush 1
      // 1aa: iload 5
      // 1ac: invokevirtual mew.ec4 (III)Lmew;
      // 1af: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1b2: invokeinterface zfz.r_y ()Le0x; 1
      // 1b7: getstatic ox_.kzr Le0x;
      // 1ba: iload 2
      // 1bb: ifne 1e8
      // 1be: if_acmpne 1cb
      // 1c1: goto 1c8
      // 1c4: invokestatic six.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: iinc 4 1
      // 1cb: aload 0
      // 1cc: getfield six.uqt Lt9d;
      // 1cf: aload 0
      // 1d0: getfield six.gnd Lmew;
      // 1d3: iload 6
      // 1d5: bipush 0
      // 1d6: iload 5
      // 1d8: bipush 2
      // 1d9: imul
      // 1da: invokevirtual mew.ec4 (III)Lmew;
      // 1dd: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1e0: invokeinterface zfz.r_y ()Le0x; 1
      // 1e5: getstatic ox_.kzr Le0x;
      // 1e8: iload 2
      // 1e9: ifne 216
      // 1ec: if_acmpne 1f9
      // 1ef: goto 1f6
      // 1f2: invokestatic six.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: iinc 4 1
      // 1f9: aload 0
      // 1fa: getfield six.uqt Lt9d;
      // 1fd: aload 0
      // 1fe: getfield six.gnd Lmew;
      // 201: iload 6
      // 203: bipush 1
      // 204: iload 5
      // 206: bipush 2
      // 207: imul
      // 208: invokevirtual mew.ec4 (III)Lmew;
      // 20b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 20e: invokeinterface zfz.r_y ()Le0x; 1
      // 213: getstatic ox_.kzr Le0x;
      // 216: if_acmpne 21c
      // 219: iinc 4 1
      // 21c: iinc 6 1
      // 21f: iload 2
      // 220: ifeq 076
      // 223: iinc 5 1
      // 226: iload 2
      // 227: ifeq 069
      // 22a: aload 0
      // 22b: getfield six.ql5 Ljava/util/Random;
      // 22e: aload 0
      // 22f: getfield six.wm5 I
      // 232: i2l
      // 233: invokevirtual java/util/Random.setSeed (J)V
      // 236: bipush 0
      // 237: istore 5
      // 239: iload 5
      // 23b: bipush 3
      // 23c: if_icmpge 294
      // 23f: aload 0
      // 240: getfield six.cus [I
      // 243: iload 5
      // 245: aload 0
      // 246: getfield six.ql5 Ljava/util/Random;
      // 249: iload 5
      // 24b: iload 4
      // 24d: aload 3
      // 24e: invokestatic hc0.qr8 (Ljava/util/Random;IILerg;)I
      // 251: iastore
      // 252: aload 0
      // 253: getfield six.upy [I
      // 256: iload 5
      // 258: bipush -1
      // 259: iastore
      // 25a: iload 2
      // 25b: ifne 290
      // 25e: aload 0
      // 25f: getfield six.cus [I
      // 262: iload 5
      // 264: iaload
      // 265: iload 5
      // 267: bipush 1
      // 268: iadd
      // 269: iload 2
      // 26a: ifne 29a
      // 26d: goto 274
      // 270: invokestatic six.a (Loov;)Loov;
      // 273: athrow
      // 274: if_icmpge 28d
      // 277: goto 27e
      // 27a: invokestatic six.a (Loov;)Loov;
      // 27d: athrow
      // 27e: aload 0
      // 27f: getfield six.cus [I
      // 282: iload 5
      // 284: bipush 0
      // 285: iastore
      // 286: goto 28d
      // 289: invokestatic six.a (Loov;)Loov;
      // 28c: athrow
      // 28d: iinc 5 1
      // 290: iload 2
      // 291: ifeq 239
      // 294: bipush 0
      // 295: istore 5
      // 297: iload 5
      // 299: bipush 3
      // 29a: if_icmpge 347
      // 29d: aload 0
      // 29e: iload 2
      // 29f: ifne 348
      // 2a2: goto 2a9
      // 2a5: invokestatic six.a (Loov;)Loov;
      // 2a8: athrow
      // 2a9: iload 2
      // 2aa: ifne 2cc
      // 2ad: goto 2b4
      // 2b0: invokestatic six.a (Loov;)Loov;
      // 2b3: athrow
      // 2b4: getfield six.cus [I
      // 2b7: iload 5
      // 2b9: iaload
      // 2ba: ifle 340
      // 2bd: goto 2c4
      // 2c0: invokestatic six.a (Loov;)Loov;
      // 2c3: athrow
      // 2c4: aload 0
      // 2c5: goto 2cc
      // 2c8: invokestatic six.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: aload 3
      // 2cd: iload 5
      // 2cf: aload 0
      // 2d0: getfield six.cus [I
      // 2d3: iload 5
      // 2d5: iaload
      // 2d6: invokespecial six.x3i (Lerg;II)Ljava/util/List;
      // 2d9: astore 6
      // 2db: iload 2
      // 2dc: ifne 343
      // 2df: aload 6
      // 2e1: ifnull 340
      // 2e4: goto 2eb
      // 2e7: invokestatic six.a (Loov;)Loov;
      // 2ea: athrow
      // 2eb: aload 6
      // 2ed: iload 2
      // 2ee: ifne 323
      // 2f1: goto 2f8
      // 2f4: invokestatic six.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: invokeinterface java/util/List.isEmpty ()Z 1
      // 2fd: ifne 340
      // 300: goto 307
      // 303: invokestatic six.a (Loov;)Loov;
      // 306: athrow
      // 307: aload 6
      // 309: aload 0
      // 30a: getfield six.ql5 Ljava/util/Random;
      // 30d: aload 6
      // 30f: invokeinterface java/util/List.size ()I 1
      // 314: invokevirtual java/util/Random.nextInt (I)I
      // 317: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 31c: goto 323
      // 31f: invokestatic six.a (Loov;)Loov;
      // 322: athrow
      // 323: checkcast npq
      // 326: astore 7
      // 328: aload 0
      // 329: getfield six.upy [I
      // 32c: iload 5
      // 32e: aload 7
      // 330: getfield npq.zbz Lvef;
      // 333: getfield vef.bbf I
      // 336: aload 7
      // 338: getfield npq.bzk I
      // 33b: bipush 8
      // 33d: ishl
      // 33e: ior
      // 33f: iastore
      // 340: iinc 5 1
      // 343: iload 2
      // 344: ifeq 297
      // 347: aload 0
      // 348: invokevirtual six.n4z ()V
      // 34b: iload 2
      // 34c: ifeq 376
      // 34f: bipush 0
      // 350: goto 357
      // 353: invokestatic six.a (Loov;)Loov;
      // 356: athrow
      // 357: istore 4
      // 359: iload 4
      // 35b: bipush 3
      // 35c: if_icmpge 376
      // 35f: aload 0
      // 360: getfield six.cus [I
      // 363: iload 4
      // 365: bipush 0
      // 366: iastore
      // 367: aload 0
      // 368: getfield six.upy [I
      // 36b: iload 4
      // 36d: bipush -1
      // 36e: iastore
      // 36f: iinc 4 1
      // 372: iload 2
      // 373: ifeq 359
      // 376: return
   }

   @Override
   public boolean lza(ha9 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield six._7z Lrsi;
      // 004: bipush 0
      // 005: invokeinterface rsi.ibn (I)Lerg; 2
      // 00a: astore 4
      // 00c: aload 0
      // 00d: getfield six._7z Lrsi;
      // 010: bipush 1
      // 011: invokeinterface rsi.ibn (I)Lerg; 2
      // 016: astore 5
      // 018: invokestatic t9d.b ()I
      // 01b: iload 2
      // 01c: bipush 1
      // 01d: iadd
      // 01e: istore 6
      // 020: istore 3
      // 021: aload 5
      // 023: iload 3
      // 024: ifeq 033
      // 027: ifnull 046
      // 02a: goto 031
      // 02d: invokestatic six.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 5
      // 033: getfield erg.qd2 I
      // 036: iload 3
      // 037: ifeq 06e
      // 03a: iload 6
      // 03c: if_icmpge 068
      // 03f: goto 046
      // 042: invokestatic six.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 1
      // 047: getfield ha9.lls Lpj2;
      // 04a: getfield pj2.g40 Z
      // 04d: iload 3
      // 04e: ifeq 06e
      // 051: goto 058
      // 054: invokestatic six.a (Loov;)Loov;
      // 057: athrow
      // 058: ifne 068
      // 05b: goto 062
      // 05e: invokestatic six.a (Loov;)Loov;
      // 061: athrow
      // 062: bipush 0
      // 063: ireturn
      // 064: invokestatic six.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 0
      // 069: getfield six.cus [I
      // 06c: iload 2
      // 06d: iaload
      // 06e: iload 3
      // 06f: ifeq 238
      // 072: ifle 237
      // 075: goto 07c
      // 078: invokestatic six.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 4
      // 07e: ifnull 237
      // 081: goto 088
      // 084: invokestatic six.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 1
      // 089: getfield ha9.op5 I
      // 08c: iload 3
      // 08d: ifeq 0d0
      // 090: goto 097
      // 093: invokestatic six.a (Loov;)Loov;
      // 096: athrow
      // 097: iload 6
      // 099: if_icmplt 0c2
      // 09c: goto 0a3
      // 09f: invokestatic six.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 1
      // 0a4: getfield ha9.op5 I
      // 0a7: iload 3
      // 0a8: ifeq 0ec
      // 0ab: goto 0b2
      // 0ae: invokestatic six.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield six.cus [I
      // 0b6: iload 2
      // 0b7: iaload
      // 0b8: if_icmpge 0de
      // 0bb: goto 0c2
      // 0be: invokestatic six.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 1
      // 0c3: getfield ha9.lls Lpj2;
      // 0c6: getfield pj2.g40 Z
      // 0c9: goto 0d0
      // 0cc: invokestatic six.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: iload 3
      // 0d1: ifeq 238
      // 0d4: ifeq 237
      // 0d7: goto 0de
      // 0da: invokestatic six.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield six.uqt Lt9d;
      // 0e2: getfield t9d.v0f Z
      // 0e5: goto 0ec
      // 0e8: invokestatic six.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: iload 3
      // 0ed: ifeq 236
      // 0f0: ifne 235
      // 0f3: goto 0fa
      // 0f6: invokestatic six.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: aload 4
      // 0fd: iload 2
      // 0fe: aload 0
      // 0ff: getfield six.cus [I
      // 102: iload 2
      // 103: iaload
      // 104: invokespecial six.x3i (Lerg;II)Ljava/util/List;
      // 107: astore 7
      // 109: aload 4
      // 10b: invokevirtual erg.gn1 ()Lu7m;
      // 10e: getstatic xbr.rm0 Lu7m;
      // 111: if_acmpne 11c
      // 114: bipush 1
      // 115: goto 11d
      // 118: invokestatic six.a (Loov;)Loov;
      // 11b: athrow
      // 11c: bipush 0
      // 11d: istore 8
      // 11f: iload 3
      // 120: ifeq 13c
      // 123: aload 7
      // 125: ifnull 235
      // 128: goto 12f
      // 12b: invokestatic six.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 1
      // 130: iload 6
      // 132: invokevirtual ha9.twf (I)V
      // 135: goto 13c
      // 138: invokestatic six.a (Loov;)Loov;
      // 13b: athrow
      // 13c: iload 8
      // 13e: iload 3
      // 13f: ifeq 15c
      // 142: ifeq 15b
      // 145: goto 14c
      // 148: invokestatic six.a (Loov;)Loov;
      // 14b: athrow
      // 14c: aload 4
      // 14e: getstatic xbr.frz Lnmo;
      // 151: invokevirtual erg.j8j (Lu7m;)V
      // 154: goto 15b
      // 157: invokestatic six.a (Loov;)Loov;
      // 15a: athrow
      // 15b: bipush 0
      // 15c: istore 9
      // 15e: iload 9
      // 160: aload 7
      // 162: invokeinterface java/util/List.size ()I 1
      // 167: if_icmpge 1c5
      // 16a: aload 7
      // 16c: iload 9
      // 16e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 173: checkcast npq
      // 176: astore 10
      // 178: iload 3
      // 179: ifeq 1a4
      // 17c: iload 8
      // 17e: iload 3
      // 17f: ifeq 1d7
      // 182: goto 189
      // 185: invokestatic six.a (Loov;)Loov;
      // 188: athrow
      // 189: ifeq 1a8
      // 18c: goto 193
      // 18f: invokestatic six.a (Loov;)Loov;
      // 192: athrow
      // 193: getstatic xbr.frz Lnmo;
      // 196: aload 4
      // 198: aload 10
      // 19a: invokevirtual nmo.e67 (Lerg;Lnpq;)V
      // 19d: goto 1a4
      // 1a0: invokestatic six.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: iload 3
      // 1a5: ifne 1be
      // 1a8: aload 4
      // 1aa: aload 10
      // 1ac: getfield npq.zbz Lvef;
      // 1af: aload 10
      // 1b1: getfield npq.bzk I
      // 1b4: invokevirtual erg.g7b (Lvef;I)V
      // 1b7: goto 1be
      // 1ba: invokestatic six.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: iinc 9 1
      // 1c1: iload 3
      // 1c2: ifne 15e
      // 1c5: aload 1
      // 1c6: iload 3
      // 1c7: ifeq 216
      // 1ca: getfield ha9.lls Lpj2;
      // 1cd: getfield pj2.g40 Z
      // 1d0: goto 1d7
      // 1d3: invokestatic six.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: ifne 215
      // 1da: aload 5
      // 1dc: dup
      // 1dd: getfield erg.qd2 I
      // 1e0: iload 6
      // 1e2: isub
      // 1e3: putfield erg.qd2 I
      // 1e6: iload 3
      // 1e7: ifeq 22d
      // 1ea: goto 1f1
      // 1ed: invokestatic six.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: aload 5
      // 1f3: getfield erg.qd2 I
      // 1f6: ifgt 215
      // 1f9: goto 200
      // 1fc: invokestatic six.a (Loov;)Loov;
      // 1ff: athrow
      // 200: aload 0
      // 201: getfield six._7z Lrsi;
      // 204: bipush 1
      // 205: aconst_null
      // 206: checkcast erg
      // 209: invokeinterface rsi.cxl (ILerg;)V 3
      // 20e: goto 215
      // 211: invokestatic six.a (Loov;)Loov;
      // 214: athrow
      // 215: aload 1
      // 216: getstatic l9p.nyv L_ss;
      // 219: invokevirtual ha9.aex (L_ss;)V
      // 21c: aload 0
      // 21d: getfield six._7z Lrsi;
      // 220: invokeinterface rsi.r5t ()V 1
      // 225: aload 0
      // 226: aload 1
      // 227: invokevirtual ha9.k2f ()I
      // 22a: putfield six.wm5 I
      // 22d: aload 0
      // 22e: aload 0
      // 22f: getfield six._7z Lrsi;
      // 232: invokevirtual six.ih9 (Lrsi;)V
      // 235: bipush 1
      // 236: ireturn
      // 237: bipush 0
      // 238: ireturn
   }

   private List x3i(erg param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield six.ql5 Ljava/util/Random;
      // 04: aload 0
      // 05: getfield six.wm5 I
      // 08: iload 2
      // 09: iadd
      // 0a: i2l
      // 0b: invokevirtual java/util/Random.setSeed (J)V
      // 0e: invokestatic t9d.b ()I
      // 11: aload 0
      // 12: getfield six.ql5 Ljava/util/Random;
      // 15: aload 1
      // 16: iload 3
      // 17: invokestatic hc0.ha8 (Ljava/util/Random;Lerg;I)Ljava/util/List;
      // 1a: astore 5
      // 1c: istore 4
      // 1e: aload 1
      // 1f: invokevirtual erg.gn1 ()Lu7m;
      // 22: getstatic xbr.rm0 Lu7m;
      // 25: if_acmpne 7b
      // 28: aload 5
      // 2a: iload 4
      // 2c: ifeq 7d
      // 2f: goto 36
      // 32: invokestatic six.a (Loov;)Loov;
      // 35: athrow
      // 36: ifnull 7b
      // 39: goto 40
      // 3c: invokestatic six.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 5
      // 42: iload 4
      // 44: ifeq 7d
      // 47: goto 4e
      // 4a: invokestatic six.a (Loov;)Loov;
      // 4d: athrow
      // 4e: invokeinterface java/util/List.size ()I 1
      // 53: bipush 1
      // 54: if_icmple 7b
      // 57: goto 5e
      // 5a: invokestatic six.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 5
      // 60: aload 0
      // 61: getfield six.ql5 Ljava/util/Random;
      // 64: aload 5
      // 66: invokeinterface java/util/List.size ()I 1
      // 6b: invokevirtual java/util/Random.nextInt (I)I
      // 6e: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 73: pop
      // 74: goto 7b
      // 77: invokestatic six.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 5
      // 7d: areturn
   }

   public int o4e() {
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
      // 05: getfield six._7z Lrsi;
      // 08: bipush 1
      // 09: invokeinterface rsi.ibn (I)Lerg; 2
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifeq 27
      // 14: ifnonnull 26
      // 17: goto 1e
      // 1a: invokestatic six.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: goto 2a
      // 22: invokestatic six.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: getfield erg.qd2 I
      // 2a: ireturn
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial _jc.qi6 (Lha9;)V
      // 09: aload 0
      // 0a: getfield six.uqt Lt9d;
      // 0d: getfield t9d.v0f Z
      // 10: iload 2
      // 11: ifeq 1f
      // 14: ifne 5f
      // 17: goto 1e
      // 1a: invokestatic six.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: istore 3
      // 20: iload 3
      // 21: aload 0
      // 22: getfield six._7z Lrsi;
      // 25: invokeinterface rsi.opt ()I 1
      // 2a: if_icmpge 5f
      // 2d: aload 0
      // 2e: getfield six._7z Lrsi;
      // 31: iload 3
      // 32: invokeinterface rsi.yvk (I)Lerg; 2
      // 37: astore 4
      // 39: iload 2
      // 3a: ifeq 5b
      // 3d: aload 4
      // 3f: ifnull 58
      // 42: goto 49
      // 45: invokestatic six.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: aload 4
      // 4c: bipush 0
      // 4d: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 50: pop
      // 51: goto 58
      // 54: invokestatic six.a (Loov;)Loov;
      // 57: athrow
      // 58: iinc 3 1
      // 5b: iload 2
      // 5c: ifne 20
      // 5f: return
   }

   @Override
   public boolean spj(ha9 var1) {
      int var2 = t9d.b();

      try {
         if (this.uqt.getBlockState(this.gnd).r_y() != ox_.ozm) {
            return (boolean)0;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      try {
         double var5;
         int var10000 = (var5 = var1.p53((double)this.gnd.getX() + 0.5, (double)this.gnd.getY() + 0.5, (double)this.gnd.getZ() + 0.5) - 64.0) == 0.0
            ? 0
            : (var5 < 0.0 ? -1 : 1);
         if (var2 == 0) {
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
      // 003: invokestatic t9d.b ()I
      // 006: aload 0
      // 007: getfield six.wjd Ljava/util/List;
      // 00a: iload 2
      // 00b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 010: checkcast vrx
      // 013: astore 5
      // 015: istore 3
      // 016: aload 5
      // 018: iload 3
      // 019: ifeq 028
      // 01c: ifnull 242
      // 01f: goto 026
      // 022: invokestatic six.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 5
      // 028: iload 3
      // 029: ifeq 042
      // 02c: invokevirtual vrx.hf8 ()Z
      // 02f: ifeq 242
      // 032: goto 039
      // 035: invokestatic six.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 5
      // 03b: goto 042
      // 03e: invokestatic six.a (Loov;)Loov;
      // 041: athrow
      // 042: invokevirtual vrx.x4s ()Lerg;
      // 045: astore 6
      // 047: aload 6
      // 049: invokevirtual erg.yaq ()Lerg;
      // 04c: astore 4
      // 04e: iload 2
      // 04f: iload 3
      // 050: ifeq 083
      // 053: ifne 082
      // 056: goto 05d
      // 059: invokestatic six.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: aload 6
      // 060: bipush 2
      // 061: bipush 38
      // 063: bipush 1
      // 064: invokevirtual six.ghh (Lerg;IIZ)Z
      // 067: iload 3
      // 068: ifeq 204
      // 06b: goto 072
      // 06e: invokestatic six.a (Loov;)Loov;
      // 071: athrow
      // 072: ifne 1ff
      // 075: goto 07c
      // 078: invokestatic six.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aconst_null
      // 07d: areturn
      // 07e: invokestatic six.a (Loov;)Loov;
      // 081: athrow
      // 082: iload 2
      // 083: iload 3
      // 084: ifeq 0a3
      // 087: bipush 1
      // 088: if_icmpne 0b7
      // 08b: goto 092
      // 08e: invokestatic six.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: aload 6
      // 095: bipush 2
      // 096: bipush 38
      // 098: bipush 1
      // 099: invokevirtual six.ghh (Lerg;IIZ)Z
      // 09c: goto 0a3
      // 09f: invokestatic six.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: iload 3
      // 0a4: ifeq 204
      // 0a7: ifne 1ff
      // 0aa: goto 0b1
      // 0ad: invokestatic six.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aconst_null
      // 0b2: areturn
      // 0b3: invokestatic six.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 6
      // 0b9: invokevirtual erg.gn1 ()Lu7m;
      // 0bc: iload 3
      // 0bd: ifeq 11b
      // 0c0: getstatic xbr.nnn Lu7m;
      // 0c3: if_acmpne 111
      // 0c6: goto 0cd
      // 0c9: invokestatic six.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 6
      // 0cf: invokevirtual erg.j6_ ()I
      // 0d2: invokestatic qvg.b7j (I)Lqvg;
      // 0d5: iload 3
      // 0d6: ifeq 11b
      // 0d9: goto 0e0
      // 0dc: invokestatic six.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: getstatic qvg.o71 Lqvg;
      // 0e3: if_acmpne 111
      // 0e6: goto 0ed
      // 0e9: invokestatic six.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: aload 6
      // 0f0: bipush 1
      // 0f1: bipush 2
      // 0f2: bipush 1
      // 0f3: invokevirtual six.ghh (Lerg;IIZ)Z
      // 0f6: iload 3
      // 0f7: ifeq 204
      // 0fa: goto 101
      // 0fd: invokestatic six.a (Loov;)Loov;
      // 100: athrow
      // 101: ifne 1ff
      // 104: goto 10b
      // 107: invokestatic six.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aconst_null
      // 10c: areturn
      // 10d: invokestatic six.a (Loov;)Loov;
      // 110: athrow
      // 111: aload 0
      // 112: getfield six.wjd Ljava/util/List;
      // 115: bipush 0
      // 116: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11b: checkcast vrx
      // 11e: invokevirtual vrx.hf8 ()Z
      // 121: iload 3
      // 122: ifeq 148
      // 125: ifne 156
      // 128: goto 12f
      // 12b: invokestatic six.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield six.wjd Ljava/util/List;
      // 133: bipush 0
      // 134: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 139: checkcast vrx
      // 13c: aload 6
      // 13e: invokevirtual vrx.xvl (Lerg;)Z
      // 141: goto 148
      // 144: invokestatic six.a (Loov;)Loov;
      // 147: athrow
      // 148: iload 3
      // 149: ifeq 161
      // 14c: ifne 15c
      // 14f: goto 156
      // 152: invokestatic six.a (Loov;)Loov;
      // 155: athrow
      // 156: aconst_null
      // 157: areturn
      // 158: invokestatic six.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 6
      // 15e: invokevirtual erg.w8b ()Z
      // 161: iload 3
      // 162: ifeq 1bc
      // 165: ifeq 1b0
      // 168: goto 16f
      // 16b: invokestatic six.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 6
      // 171: getfield erg.qd2 I
      // 174: bipush 1
      // 175: iload 3
      // 176: ifeq 1c8
      // 179: goto 180
      // 17c: invokestatic six.a (Loov;)Loov;
      // 17f: athrow
      // 180: if_icmpne 1b0
      // 183: goto 18a
      // 186: invokestatic six.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 0
      // 18b: getfield six.wjd Ljava/util/List;
      // 18e: bipush 0
      // 18f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 194: checkcast vrx
      // 197: aload 6
      // 199: invokevirtual erg.yaq ()Lerg;
      // 19c: invokevirtual vrx.yn7 (Lerg;)V
      // 19f: aload 6
      // 1a1: bipush 0
      // 1a2: putfield erg.qd2 I
      // 1a5: iload 3
      // 1a6: ifne 1ff
      // 1a9: goto 1b0
      // 1ac: invokestatic six.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: aload 6
      // 1b2: getfield erg.qd2 I
      // 1b5: goto 1bc
      // 1b8: invokestatic six.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: iload 3
      // 1bd: ifeq 204
      // 1c0: bipush 1
      // 1c1: goto 1c8
      // 1c4: invokestatic six.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: if_icmplt 1ff
      // 1cb: aload 0
      // 1cc: getfield six.wjd Ljava/util/List;
      // 1cf: bipush 0
      // 1d0: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d5: checkcast vrx
      // 1d8: new erg
      // 1db: dup
      // 1dc: aload 6
      // 1de: invokevirtual erg.gn1 ()Lu7m;
      // 1e1: bipush 1
      // 1e2: aload 6
      // 1e4: invokevirtual erg.j6_ ()I
      // 1e7: invokespecial erg.<init> (Lu7m;II)V
      // 1ea: invokevirtual vrx.yn7 (Lerg;)V
      // 1ed: aload 6
      // 1ef: dup
      // 1f0: getfield erg.qd2 I
      // 1f3: bipush 1
      // 1f4: isub
      // 1f5: putfield erg.qd2 I
      // 1f8: goto 1ff
      // 1fb: invokestatic six.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: aload 6
      // 201: getfield erg.qd2 I
      // 204: ifne 21b
      // 207: aload 5
      // 209: aconst_null
      // 20a: checkcast erg
      // 20d: invokevirtual vrx.yn7 (Lerg;)V
      // 210: iload 3
      // 211: ifne 227
      // 214: goto 21b
      // 217: invokestatic six.a (Loov;)Loov;
      // 21a: athrow
      // 21b: aload 5
      // 21d: invokevirtual vrx.vc1 ()V
      // 220: goto 227
      // 223: invokestatic six.a (Loov;)Loov;
      // 226: athrow
      // 227: aload 6
      // 229: getfield erg.qd2 I
      // 22c: aload 4
      // 22e: getfield erg.qd2 I
      // 231: if_icmpne 23a
      // 234: aconst_null
      // 235: areturn
      // 236: invokestatic six.a (Loov;)Loov;
      // 239: athrow
      // 23a: aload 5
      // 23c: aload 1
      // 23d: aload 6
      // 23f: invokevirtual vrx.g1d (Lha9;Lerg;)V
      // 242: aload 4
      // 244: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5774547958076096848L, -2157856966584415534L, MethodHandles.lookup().lookupClass()).a(47052627528396L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 54378973261301L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("åªÉ\tò`0»".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      d = var6;
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
