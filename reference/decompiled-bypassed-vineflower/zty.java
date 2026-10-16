import java.lang.invoke.MethodHandles;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zty extends s0i implements n6g {
   public zty(t9d var1) {
      super(var1);
      this.yxc(0.6F, 1.95F);
      this.r1d.tn8(1, new dnq(this));
      this.r1d.tn8(2, new wkr(this, 1.0, 60, 10.0F));
      this.r1d.tn8(2, new _tb(this, 1.0));
      this.r1d.tn8(3, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(3, new ov6(this));
      this.g9o.tn8(1, new z7z(this, false, new Class[0]));
      this.g9o.tn8(2, new s24(this, ha9.class, true));
   }

   @Override
   public void tbj() {
      super.tbj();
      this.a0c().kp2(21, (byte)0);
   }

   @Override
   public String _n1() {
      return null;
   }

   @Override
   public String wcg() {
      return null;
   }

   @Override
   public String ix6() {
      return null;
   }

   public void srl(boolean var1) {
      int var2 = t9d.b();

      wl1 var10000;
      byte var10001;
      byte var10002;
      label22: {
         label21: {
            try {
               var10000 = this.a0c();
               var10001 = 21;
               var10002 = var1;
               if (var2 == 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10002 = 0;
            break label22;
         }

         var10002 = 1;
      }

      var10000.c66(var10001, (byte)var10002);
   }

   public boolean krg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual zty.a0c ()Lwl1;
      // 08: bipush 21
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: iload 1
      // 0e: ifne 24
      // 11: bipush 1
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic zty.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic zty.a (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(26.0);
      this.dgt(m6d.w7i).zf7(0.25);
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 35c
      // 009: getfield zty.oay Lt9d;
      // 00c: getfield t9d.v0f Z
      // 00f: ifne 35b
      // 012: goto 019
      // 015: invokestatic zty.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: invokevirtual zty.krg ()Z
      // 01d: iload 1
      // 01e: ifeq 0f1
      // 021: goto 028
      // 024: invokestatic zty.a (Loov;)Loov;
      // 027: athrow
      // 028: ifeq 0e9
      // 02b: goto 032
      // 02e: invokestatic zty.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: dup
      // 034: getfield zty.kgt I
      // 037: dup_x1
      // 038: bipush 1
      // 039: isub
      // 03a: putfield zty.kgt I
      // 03d: iload 1
      // 03e: ifeq 347
      // 041: goto 048
      // 044: invokestatic zty.a (Loov;)Loov;
      // 047: athrow
      // 048: ifgt 331
      // 04b: goto 052
      // 04e: invokestatic zty.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: bipush 0
      // 054: invokevirtual zty.srl (Z)V
      // 057: aload 0
      // 058: invokevirtual zty.tsc ()Lerg;
      // 05b: astore 2
      // 05c: aload 0
      // 05d: bipush 0
      // 05e: aconst_null
      // 05f: checkcast erg
      // 062: invokevirtual zty.fga (ILerg;)V
      // 065: iload 1
      // 066: ifeq 0e5
      // 069: aload 2
      // 06a: ifnull 0d6
      // 06d: goto 074
      // 070: invokestatic zty.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 2
      // 075: invokevirtual erg.gn1 ()Lu7m;
      // 078: getstatic xbr.ik6 Ldgn;
      // 07b: if_acmpne 0d6
      // 07e: goto 085
      // 081: invokestatic zty.a (Loov;)Loov;
      // 084: athrow
      // 085: getstatic xbr.ik6 Ldgn;
      // 088: aload 2
      // 089: invokevirtual dgn.cf0 (Lerg;)Ljava/util/List;
      // 08c: astore 3
      // 08d: iload 1
      // 08e: ifeq 0e5
      // 091: aload 3
      // 092: ifnull 0d6
      // 095: goto 09c
      // 098: invokestatic zty.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 3
      // 09d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0a2: astore 4
      // 0a4: aload 4
      // 0a6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ab: ifeq 0d6
      // 0ae: aload 4
      // 0b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b5: checkcast sdj
      // 0b8: astore 5
      // 0ba: aload 0
      // 0bb: new sdj
      // 0be: dup
      // 0bf: aload 5
      // 0c1: invokespecial sdj.<init> (Lsdj;)V
      // 0c4: invokevirtual zty.gmn (Lsdj;)V
      // 0c7: iload 1
      // 0c8: ifeq 0e5
      // 0cb: iload 1
      // 0cc: ifne 0a4
      // 0cf: goto 0d6
      // 0d2: invokestatic zty.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getstatic m6d.w7i Lw9p;
      // 0da: invokevirtual zty.dgt (Lw9p;)L_4o;
      // 0dd: getstatic zty.oso Lxk5;
      // 0e0: invokeinterface _4o.se8 (Lxk5;)V 2
      // 0e5: iload 1
      // 0e6: ifne 331
      // 0e9: bipush -1
      // 0ea: goto 0f1
      // 0ed: invokestatic zty.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: istore 2
      // 0f2: aload 0
      // 0f3: getfield zty.z2d Ljava/util/Random;
      // 0f6: invokevirtual java/util/Random.nextFloat ()F
      // 0f9: ldc 0.15
      // 0fb: nop
      // 0fc: fcmpg
      // 0fd: iload 1
      // 0fe: ifeq 15d
      // 101: ifge 14b
      // 104: goto 10b
      // 107: invokestatic zty.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getstatic p3y.six Lp3y;
      // 10f: invokevirtual zty.v0c (Lp3y;)Z
      // 112: iload 1
      // 113: ifeq 15d
      // 116: goto 11d
      // 119: invokestatic zty.a (Loov;)Loov;
      // 11c: athrow
      // 11d: ifeq 14b
      // 120: goto 127
      // 123: invokestatic zty.a (Loov;)Loov;
      // 126: athrow
      // 127: aload 0
      // 128: getstatic mcs.h8d Lmcs;
      // 12b: invokevirtual zty.cab (Lmcs;)Z
      // 12e: iload 1
      // 12f: ifeq 15d
      // 132: goto 139
      // 135: invokestatic zty.a (Loov;)Loov;
      // 138: athrow
      // 139: ifne 14b
      // 13c: goto 143
      // 13f: invokestatic zty.a (Loov;)Loov;
      // 142: athrow
      // 143: sipush 8237
      // 146: istore 2
      // 147: iload 1
      // 148: ifne 2e6
      // 14b: aload 0
      // 14c: getfield zty.z2d Ljava/util/Random;
      // 14f: invokevirtual java/util/Random.nextFloat ()F
      // 152: ldc 0.15
      // 154: nop
      // 155: fcmpg
      // 156: goto 15d
      // 159: invokestatic zty.a (Loov;)Loov;
      // 15c: athrow
      // 15d: iload 1
      // 15e: ifeq 1ba
      // 161: ifge 1a8
      // 164: goto 16b
      // 167: invokestatic zty.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 0
      // 16c: invokevirtual zty.agj ()Z
      // 16f: iload 1
      // 170: ifeq 1ba
      // 173: goto 17a
      // 176: invokestatic zty.a (Loov;)Loov;
      // 179: athrow
      // 17a: ifeq 1a8
      // 17d: goto 184
      // 180: invokestatic zty.a (Loov;)Loov;
      // 183: athrow
      // 184: aload 0
      // 185: getstatic mcs.sw1 Lmcs;
      // 188: invokevirtual zty.cab (Lmcs;)Z
      // 18b: iload 1
      // 18c: ifeq 1ba
      // 18f: goto 196
      // 192: invokestatic zty.a (Loov;)Loov;
      // 195: athrow
      // 196: ifne 1a8
      // 199: goto 1a0
      // 19c: invokestatic zty.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: sipush 16307
      // 1a3: istore 2
      // 1a4: iload 1
      // 1a5: ifne 2e6
      // 1a8: aload 0
      // 1a9: getfield zty.z2d Ljava/util/Random;
      // 1ac: invokevirtual java/util/Random.nextFloat ()F
      // 1af: ldc 0.05
      // 1b1: nop
      // 1b2: fcmpg
      // 1b3: goto 1ba
      // 1b6: invokestatic zty.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: iload 1
      // 1bb: ifeq 200
      // 1be: ifge 1ee
      // 1c1: goto 1c8
      // 1c4: invokestatic zty.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: aload 0
      // 1c9: invokevirtual zty.i55 ()F
      // 1cc: aload 0
      // 1cd: invokevirtual zty.axb ()F
      // 1d0: fcmpg
      // 1d1: iload 1
      // 1d2: ifeq 200
      // 1d5: goto 1dc
      // 1d8: invokestatic zty.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: ifge 1ee
      // 1df: goto 1e6
      // 1e2: invokestatic zty.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: sipush 16341
      // 1e9: istore 2
      // 1ea: iload 1
      // 1eb: ifne 2e6
      // 1ee: aload 0
      // 1ef: getfield zty.z2d Ljava/util/Random;
      // 1f2: invokevirtual java/util/Random.nextFloat ()F
      // 1f5: ldc 0.25
      // 1f7: nop
      // 1f8: fcmpg
      // 1f9: goto 200
      // 1fc: invokestatic zty.a (Loov;)Loov;
      // 1ff: athrow
      // 200: iload 1
      // 201: ifeq 27e
      // 204: ifge 26c
      // 207: goto 20e
      // 20a: invokestatic zty.a (Loov;)Loov;
      // 20d: athrow
      // 20e: aload 0
      // 20f: iload 1
      // 210: ifeq 274
      // 213: goto 21a
      // 216: invokestatic zty.a (Loov;)Loov;
      // 219: athrow
      // 21a: invokevirtual zty.q4v ()Lg_3;
      // 21d: ifnull 26c
      // 220: goto 227
      // 223: invokestatic zty.a (Loov;)Loov;
      // 226: athrow
      // 227: aload 0
      // 228: getstatic mcs.uwx Lmcs;
      // 22b: invokevirtual zty.cab (Lmcs;)Z
      // 22e: iload 1
      // 22f: ifeq 27e
      // 232: goto 239
      // 235: invokestatic zty.a (Loov;)Loov;
      // 238: athrow
      // 239: ifne 26c
      // 23c: goto 243
      // 23f: invokestatic zty.a (Loov;)Loov;
      // 242: athrow
      // 243: aload 0
      // 244: invokevirtual zty.q4v ()Lg_3;
      // 247: aload 0
      // 248: invokevirtual g_3.wxg (Li2h;)D
      // 24b: ldc2_w 121.0
      // 24e: dcmpl
      // 24f: iload 1
      // 250: ifeq 27e
      // 253: goto 25a
      // 256: invokestatic zty.a (Loov;)Loov;
      // 259: athrow
      // 25a: ifle 26c
      // 25d: goto 264
      // 260: invokestatic zty.a (Loov;)Loov;
      // 263: athrow
      // 264: sipush 16274
      // 267: istore 2
      // 268: iload 1
      // 269: ifne 2e6
      // 26c: aload 0
      // 26d: goto 274
      // 270: invokestatic zty.a (Loov;)Loov;
      // 273: athrow
      // 274: getfield zty.z2d Ljava/util/Random;
      // 277: invokevirtual java/util/Random.nextFloat ()F
      // 27a: ldc 0.25
      // 27c: nop
      // 27d: fcmpg
      // 27e: iload 1
      // 27f: ifeq 2e7
      // 282: ifge 2e6
      // 285: goto 28c
      // 288: invokestatic zty.a (Loov;)Loov;
      // 28b: athrow
      // 28c: aload 0
      // 28d: iload 1
      // 28e: ifeq 2ad
      // 291: goto 298
      // 294: invokestatic zty.a (Loov;)Loov;
      // 297: athrow
      // 298: invokevirtual zty.q4v ()Lg_3;
      // 29b: ifnull 2e6
      // 29e: goto 2a5
      // 2a1: invokestatic zty.a (Loov;)Loov;
      // 2a4: athrow
      // 2a5: aload 0
      // 2a6: goto 2ad
      // 2a9: invokestatic zty.a (Loov;)Loov;
      // 2ac: athrow
      // 2ad: getstatic mcs.uwx Lmcs;
      // 2b0: invokevirtual zty.cab (Lmcs;)Z
      // 2b3: iload 1
      // 2b4: ifeq 2e7
      // 2b7: ifne 2e6
      // 2ba: goto 2c1
      // 2bd: invokestatic zty.a (Loov;)Loov;
      // 2c0: athrow
      // 2c1: aload 0
      // 2c2: invokevirtual zty.q4v ()Lg_3;
      // 2c5: aload 0
      // 2c6: invokevirtual g_3.wxg (Li2h;)D
      // 2c9: ldc2_w 121.0
      // 2cc: dcmpl
      // 2cd: iload 1
      // 2ce: ifeq 2e7
      // 2d1: goto 2d8
      // 2d4: invokestatic zty.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: ifle 2e6
      // 2db: goto 2e2
      // 2de: invokestatic zty.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: sipush 16274
      // 2e5: istore 2
      // 2e6: iload 2
      // 2e7: iload 1
      // 2e8: ifeq 347
      // 2eb: bipush -1
      // 2ec: if_icmple 331
      // 2ef: goto 2f6
      // 2f2: invokestatic zty.a (Loov;)Loov;
      // 2f5: athrow
      // 2f6: aload 0
      // 2f7: bipush 0
      // 2f8: new erg
      // 2fb: dup
      // 2fc: getstatic xbr.ik6 Ldgn;
      // 2ff: bipush 1
      // 300: iload 2
      // 301: invokespecial erg.<init> (Lu7m;II)V
      // 304: invokevirtual zty.fga (ILerg;)V
      // 307: aload 0
      // 308: aload 0
      // 309: invokevirtual zty.tsc ()Lerg;
      // 30c: invokevirtual erg.ifg ()I
      // 30f: putfield zty.kgt I
      // 312: aload 0
      // 313: bipush 1
      // 314: invokevirtual zty.srl (Z)V
      // 317: aload 0
      // 318: getstatic m6d.w7i Lw9p;
      // 31b: invokevirtual zty.dgt (Lw9p;)L_4o;
      // 31e: astore 3
      // 31f: aload 3
      // 320: getstatic zty.oso Lxk5;
      // 323: invokeinterface _4o.se8 (Lxk5;)V 2
      // 328: aload 3
      // 329: getstatic zty.oso Lxk5;
      // 32c: invokeinterface _4o.vcr (Lxk5;)V 2
      // 331: aload 0
      // 332: iload 1
      // 333: ifeq 35c
      // 336: getfield zty.z2d Ljava/util/Random;
      // 339: invokevirtual java/util/Random.nextFloat ()F
      // 33c: ldc 7.5E-4
      // 33e: nop
      // 33f: fcmpg
      // 340: goto 347
      // 343: invokestatic zty.a (Loov;)Loov;
      // 346: athrow
      // 347: ifge 35b
      // 34a: aload 0
      // 34b: getfield zty.oay Lt9d;
      // 34e: aload 0
      // 34f: bipush 15
      // 351: invokevirtual t9d.qyn (Li2h;B)V
      // 354: goto 35b
      // 357: invokestatic zty.a (Loov;)Loov;
      // 35a: athrow
      // 35b: aload 0
      // 35c: invokespecial s0i.e_a ()V
      // 35f: return
   }

   @Override
   public void ptf(byte param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: bipush 15
      // 0b: if_icmpne 8b
      // 0e: goto 15
      // 11: invokestatic zty.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: goto 1d
      // 19: invokestatic zty.a (Loov;)Loov;
      // 1c: athrow
      // 1d: istore 3
      // 1e: iload 3
      // 1f: aload 0
      // 20: getfield zty.z2d Ljava/util/Random;
      // 23: bipush 35
      // 25: invokevirtual java/util/Random.nextInt (I)I
      // 28: bipush 10
      // 2a: iadd
      // 2b: if_icmpge 87
      // 2e: aload 0
      // 2f: getfield zty.oay Lt9d;
      // 32: getstatic w_0.c0z Lw_0;
      // 35: aload 0
      // 36: getfield zty.o2v D
      // 39: aload 0
      // 3a: getfield zty.z2d Ljava/util/Random;
      // 3d: invokevirtual java/util/Random.nextGaussian ()D
      // 40: ldc2_w 0.12999999523162842
      // 43: dmul
      // 44: dadd
      // 45: aload 0
      // 46: invokevirtual zty.aaw ()Lnh4;
      // 49: getfield nh4.i2c D
      // 4c: ldc2_w 0.5
      // 4f: dadd
      // 50: aload 0
      // 51: getfield zty.z2d Ljava/util/Random;
      // 54: invokevirtual java/util/Random.nextGaussian ()D
      // 57: ldc2_w 0.12999999523162842
      // 5a: dmul
      // 5b: dadd
      // 5c: aload 0
      // 5d: getfield zty.vbd D
      // 60: aload 0
      // 61: getfield zty.z2d Ljava/util/Random;
      // 64: invokevirtual java/util/Random.nextGaussian ()D
      // 67: ldc2_w 0.12999999523162842
      // 6a: dmul
      // 6b: dadd
      // 6c: dconst_0
      // 6d: dconst_0
      // 6e: dconst_0
      // 6f: bipush 0
      // 70: newarray 10
      // 72: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 75: iinc 3 1
      // 78: iload 2
      // 79: ifne 97
      // 7c: iload 2
      // 7d: ifeq 1e
      // 80: goto 87
      // 83: invokestatic zty.a (Loov;)Loov;
      // 86: athrow
      // 87: iload 2
      // 88: ifeq 97
      // 8b: aload 0
      // 8c: iload 1
      // 8d: invokespecial s0i.ptf (B)V
      // 90: goto 97
      // 93: invokestatic zty.a (Loov;)Loov;
      // 96: athrow
      // 97: return
   }

   @Override
   public float yef(ofh var1, float var2) {
      int var3 = t9d.b();
      var2 = super.yef(var1, var2);

      ofh var10000;
      label25: {
         label24: {
            try {
               var10000 = var1;
               if (var3 == 0) {
                  break label25;
               }

               if (var1.nra() != this) {
                  break label24;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var2 = 0.0F;
         }

         var10000 = var1;
      }

      if (var10000.vmw()) {
         var2 = (float)((double)var2 * 0.15);
      }

      return var2;
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var4 = this.z2d.nextInt(3) + 1;
      int var10000 = t9d.b();
      int var5 = 0;
      int var3 = var10000;

      while (var5 < var4) {
         int var6 = this.z2d.nextInt(3);
         u7m var7 = ps3[this.z2d.nextInt(ps3.length)];

         label47: {
            label46: {
               try {
                  var10000 = var2;
                  if (var3 == 0) {
                     break label47;
                  }

                  if (var2 <= 0) {
                     break label46;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }

               var6 += this.z2d.nextInt(var2 + 1);
            }

            var10000 = 0;
         }

         int var8 = var10000;

         while (true) {
            if (var8 < var6) {
               try {
                  this.e70(var7, 1);
                  var8++;
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

            var5++;
            break;
         }

         if (var3 == 0) {
            break;
         }
      }
   }

   @Override
   public void mx4(g_3 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: invokevirtual zty.krg ()Z
      // 008: ifne 18a
      // 00b: new nuq
      // 00e: dup
      // 00f: aload 0
      // 010: getfield zty.oay Lt9d;
      // 013: aload 0
      // 014: sipush 32732
      // 017: invokespecial nuq.<init> (Lt9d;Lg_3;I)V
      // 01a: astore 4
      // 01c: aload 1
      // 01d: getfield g_3.kfp D
      // 020: aload 1
      // 021: invokevirtual g_3.c5y ()F
      // 024: f2d
      // 025: dadd
      // 026: ldc2_w 1.100000023841858
      // 029: dsub
      // 02a: dstore 5
      // 02c: aload 4
      // 02e: dup
      // 02f: getfield nuq.y2i F
      // 032: ldc -20.0
      // 034: nop
      // 035: fsub
      // 036: putfield nuq.y2i F
      // 039: aload 1
      // 03a: getfield g_3.o2v D
      // 03d: aload 1
      // 03e: getfield g_3.icv D
      // 041: dadd
      // 042: aload 0
      // 043: getfield zty.o2v D
      // 046: dsub
      // 047: dstore 7
      // 049: dload 5
      // 04b: aload 0
      // 04c: getfield zty.kfp D
      // 04f: dsub
      // 050: dstore 9
      // 052: aload 1
      // 053: getfield g_3.vbd D
      // 056: aload 1
      // 057: getfield g_3.bw4 D
      // 05a: dadd
      // 05b: aload 0
      // 05c: getfield zty.vbd D
      // 05f: dsub
      // 060: dstore 11
      // 062: dload 7
      // 064: dload 7
      // 066: dmul
      // 067: dload 11
      // 069: dload 11
      // 06b: dmul
      // 06c: dadd
      // 06d: invokestatic fe6.dii (D)F
      // 070: fstore 13
      // 072: fload 13
      // 074: ldc 8.0
      // 076: nop
      // 077: fcmpl
      // 078: iload 3
      // 079: ifeq 0c4
      // 07c: iflt 0b5
      // 07f: goto 086
      // 082: invokestatic zty.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 1
      // 087: getstatic mcs.j2p Lmcs;
      // 08a: invokevirtual g_3.cab (Lmcs;)Z
      // 08d: iload 3
      // 08e: ifeq 0c4
      // 091: goto 098
      // 094: invokestatic zty.a (Loov;)Loov;
      // 097: athrow
      // 098: ifne 0b5
      // 09b: goto 0a2
      // 09e: invokestatic zty.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 4
      // 0a4: sipush 32698
      // 0a7: invokevirtual nuq.z7c (I)V
      // 0aa: iload 3
      // 0ab: ifne 167
      // 0ae: goto 0b5
      // 0b1: invokestatic zty.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: aload 1
      // 0b6: invokevirtual g_3.i55 ()F
      // 0b9: ldc 8.0
      // 0bb: nop
      // 0bc: fcmpl
      // 0bd: goto 0c4
      // 0c0: invokestatic zty.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: iload 3
      // 0c5: ifeq 10e
      // 0c8: iflt 101
      // 0cb: goto 0d2
      // 0ce: invokestatic zty.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 1
      // 0d3: getstatic mcs.veq Lmcs;
      // 0d6: invokevirtual g_3.cab (Lmcs;)Z
      // 0d9: iload 3
      // 0da: ifeq 10e
      // 0dd: goto 0e4
      // 0e0: invokestatic zty.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: ifne 101
      // 0e7: goto 0ee
      // 0ea: invokestatic zty.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 4
      // 0f0: sipush 32660
      // 0f3: invokevirtual nuq.z7c (I)V
      // 0f6: iload 3
      // 0f7: ifne 167
      // 0fa: goto 101
      // 0fd: invokestatic zty.a (Loov;)Loov;
      // 100: athrow
      // 101: fload 13
      // 103: ldc 3.0
      // 105: nop
      // 106: fcmpg
      // 107: goto 10e
      // 10a: invokestatic zty.a (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 3
      // 10f: ifeq 189
      // 112: ifgt 167
      // 115: goto 11c
      // 118: invokestatic zty.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 1
      // 11d: getstatic mcs.fhc Lmcs;
      // 120: invokevirtual g_3.cab (Lmcs;)Z
      // 123: iload 3
      // 124: ifeq 189
      // 127: goto 12e
      // 12a: invokestatic zty.a (Loov;)Loov;
      // 12d: athrow
      // 12e: ifne 167
      // 131: goto 138
      // 134: invokestatic zty.a (Loov;)Loov;
      // 137: athrow
      // 138: aload 0
      // 139: getfield zty.z2d Ljava/util/Random;
      // 13c: invokevirtual java/util/Random.nextFloat ()F
      // 13f: ldc 0.25
      // 141: nop
      // 142: fcmpg
      // 143: iload 3
      // 144: ifeq 189
      // 147: goto 14e
      // 14a: invokestatic zty.a (Loov;)Loov;
      // 14d: athrow
      // 14e: ifge 167
      // 151: goto 158
      // 154: invokestatic zty.a (Loov;)Loov;
      // 157: athrow
      // 158: aload 4
      // 15a: sipush 32696
      // 15d: invokevirtual nuq.z7c (I)V
      // 160: goto 167
      // 163: invokestatic zty.a (Loov;)Loov;
      // 166: athrow
      // 167: aload 4
      // 169: dload 7
      // 16b: dload 9
      // 16d: fload 13
      // 16f: ldc 0.2
      // 171: nop
      // 172: fmul
      // 173: f2d
      // 174: dadd
      // 175: dload 11
      // 177: ldc 0.75
      // 179: nop
      // 17a: ldc 8.0
      // 17c: nop
      // 17d: invokevirtual nuq.bob (DDDFF)V
      // 180: aload 0
      // 181: getfield zty.oay Lt9d;
      // 184: aload 4
      // 186: invokevirtual t9d.xzq (Li2h;)Z
      // 189: pop
      // 18a: return
   }

   @Override
   public float c5y() {
      return 1.62F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4886139392279561771L, 1360411040839189521L, MethodHandles.lookup().lookupClass()).a(151397423041396L);
      // $VF: monitorexit
      long var10 = var10000 ^ 97260727935646L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "\u0091Á&.©sÿ¬óâÒ§ñ\b\u00adÅºõL§\u000f§Ò`(w?{â\u0015&P\bräî'e0hA\u0005\u0094à\u0001½í¯?.(\f\u000e\u0094Éö\u0012H1þcÒ¨\u0091\u0082";
      int var7 = "\u0091Á&.©sÿ¬óâÒ§ñ\b\u00adÅºõL§\u000f§Ò`(w?{â\u0015&P\bräî'e0hA\u0005\u0094à\u0001½í¯?.(\f\u000e\u0094Éö\u0012H1þcÒ¨\u0091\u0082".length();
      char var4 = 24;
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = f(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            oo4 = UUID.fromString(var8[1]);
            oso = new xk5(oo4, var8[0], -0.25, 0).d2_(false);
            ps3 = new u7m[]{xbr.no9, xbr.bwp, xbr.deg, xbr.mrm, xbr.fvb, xbr.hgt, xbr.t1j, xbr.t1j};
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String f(byte[] var0) {
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
