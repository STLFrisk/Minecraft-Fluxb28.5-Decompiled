import java.io.Serializable;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class krg implements Serializable, Cloneable {
   public static final long serialVersionUID = -8405036035410109353L;
   public float j8s;
   public float f28;
   public float vwt;
   public float ygn;
   public float fno;
   public float rqb;
   public float sjv;
   public float ttd;
   public float zcz;
   public float w4_;
   public float fmx;
   public float f46;
   public float g7m;
   public float i5l;
   public float sk9;
   public float _40;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public krg(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.j8s = var1;
      this.f28 = var2;
      this.vwt = var3;
      this.ygn = var4;
      this.fno = var5;
      this.rqb = var6;
      this.sjv = var7;
      this.ttd = var8;
      this.zcz = var9;
      this.w4_ = var10;
      this.fmx = var11;
      this.f46 = var12;
      this.g7m = var13;
      this.i5l = var14;
      this.sk9 = var15;
      this._40 = var16;
   }

   public krg(float[] var1) {
      this.j8s = var1[0];
      this.f28 = var1[1];
      this.vwt = var1[2];
      this.ygn = var1[3];
      this.fno = var1[4];
      this.rqb = var1[5];
      this.sjv = var1[6];
      this.ttd = var1[7];
      this.zcz = var1[8];
      this.w4_ = var1[9];
      this.fmx = var1[10];
      this.f46 = var1[11];
      this.g7m = var1[12];
      this.i5l = var1[13];
      this.sk9 = var1[14];
      this._40 = var1[15];
   }

   public krg(lwt var1, l3p var2, float var3) {
      this.j8s = (float)((double)var3 * (1.0 - 2.0 * (double)var1.nc_ * (double)var1.nc_ - 2.0 * (double)var1.ax5 * (double)var1.ax5));
      this.fno = (float)((double)var3 * 2.0 * (double)(var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5));
      this.zcz = (float)((double)var3 * 2.0 * (double)(var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_));
      this.f28 = (float)((double)var3 * 2.0 * (double)(var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5));
      this.rqb = (float)((double)var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.ax5 * (double)var1.ax5));
      this.w4_ = (float)((double)var3 * 2.0 * (double)(var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2));
      this.vwt = (float)((double)var3 * 2.0 * (double)(var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_));
      this.sjv = (float)((double)var3 * 2.0 * (double)(var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2));
      this.fmx = (float)((double)var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.nc_ * (double)var1.nc_));
      this.ygn = var2.yiu;
      this.ttd = var2.q6o;
      this.f46 = var2.n_d;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public krg(onPlayerUpdate var1) {
      this.j8s = (float)var1.jf3;
      this.f28 = (float)var1.o1a;
      this.vwt = (float)var1.j_n;
      this.ygn = (float)var1.uwn;
      this.fno = (float)var1.sgz;
      this.rqb = (float)var1._6_;
      this.sjv = (float)var1.m10;
      this.ttd = (float)var1.g_y;
      this.zcz = (float)var1.ji8;
      this.w4_ = (float)var1.nqj;
      this.fmx = (float)var1.o_8;
      this.f46 = (float)var1.na1;
      this.g7m = (float)var1.ye8;
      this.i5l = (float)var1.h_8;
      this.sk9 = (float)var1.twh;
      this._40 = (float)var1.f36;
   }

   public krg(krg var1) {
      this.j8s = var1.j8s;
      this.f28 = var1.f28;
      this.vwt = var1.vwt;
      this.ygn = var1.ygn;
      this.fno = var1.fno;
      this.rqb = var1.rqb;
      this.sjv = var1.sjv;
      this.ttd = var1.ttd;
      this.zcz = var1.zcz;
      this.w4_ = var1.w4_;
      this.fmx = var1.fmx;
      this.f46 = var1.f46;
      this.g7m = var1.g7m;
      this.i5l = var1.i5l;
      this.sk9 = var1.sk9;
      this._40 = var1._40;
   }

   public krg(nvj var1, l3p var2, float var3) {
      this.j8s = var1.i2i * var3;
      this.f28 = var1.k12 * var3;
      this.vwt = var1.xu6 * var3;
      this.ygn = var2.yiu;
      this.fno = var1._id * var3;
      this.rqb = var1.aoj * var3;
      this.sjv = var1.zk_ * var3;
      this.ttd = var2.q6o;
      this.zcz = var1.aqg * var3;
      this.w4_ = var1.wdt * var3;
      this.fmx = var1.jr8 * var3;
      this.f46 = var2.n_d;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public krg() {
      this.j8s = 0.0F;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = 0.0F;
      this.fno = 0.0F;
      this.rqb = 0.0F;
      this.sjv = 0.0F;
      this.ttd = 0.0F;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = 0.0F;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 0.0F;
   }

   @Override
   public String toString() {
      long var1 = a ^ 130094326469225L;
      return this.j8s
         + a<"a">(13690, 7482018094665271204L ^ var1)
         + this.f28
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.vwt
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.ygn
         + "\n"
         + this.fno
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.rqb
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.sjv
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.ttd
         + "\n"
         + this.zcz
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.w4_
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.fmx
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.f46
         + "\n"
         + this.g7m
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.i5l
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this.sk9
         + a<"a">(3927, 222909187819945347L ^ var1)
         + this._40
         + "\n";
   }

   public final void yna() {
      this.j8s = 1.0F;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = 0.0F;
      this.fno = 0.0F;
      this.rqb = 1.0F;
      this.sjv = 0.0F;
      this.ttd = 0.0F;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = 1.0F;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void l57(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 33029369386042
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 6
      // 00e: iload 1
      // 00f: iload 6
      // 011: ifeq 039
      // 014: tableswitch 550 0 3 36 166 294 422
      // 034: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 037: athrow
      // 038: iload 2
      // 039: tableswitch 99 0 3 31 48 65 82
      // 058: aload 0
      // 059: fload 3
      // 05a: putfield krg.j8s F
      // 05d: iload 6
      // 05f: ifne 254
      // 062: goto 069
      // 065: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 068: athrow
      // 069: aload 0
      // 06a: fload 3
      // 06b: putfield krg.f28 F
      // 06e: iload 6
      // 070: ifne 254
      // 073: goto 07a
      // 076: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 079: athrow
      // 07a: aload 0
      // 07b: fload 3
      // 07c: putfield krg.vwt F
      // 07f: iload 6
      // 081: ifne 254
      // 084: goto 08b
      // 087: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08a: athrow
      // 08b: aload 0
      // 08c: fload 3
      // 08d: putfield krg.ygn F
      // 090: iload 6
      // 092: ifne 254
      // 095: goto 09c
      // 098: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: new java/lang/ArrayIndexOutOfBoundsException
      // 09f: dup
      // 0a0: sipush 13093
      // 0a3: ldc2_w 2454731002483574688
      // 0a6: lload 4
      // 0a8: lxor
      // 0a9: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: nop
      // 0af: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0b2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 0b5: athrow
      // 0b6: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b9: athrow
      // 0ba: iload 2
      // 0bb: tableswitch 97 0 3 29 46 63 80
      // 0d8: aload 0
      // 0d9: fload 3
      // 0da: putfield krg.fno F
      // 0dd: iload 6
      // 0df: ifne 254
      // 0e2: goto 0e9
      // 0e5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: fload 3
      // 0eb: putfield krg.rqb F
      // 0ee: iload 6
      // 0f0: ifne 254
      // 0f3: goto 0fa
      // 0f6: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: fload 3
      // 0fc: putfield krg.sjv F
      // 0ff: iload 6
      // 101: ifne 254
      // 104: goto 10b
      // 107: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: aload 0
      // 10c: fload 3
      // 10d: putfield krg.ttd F
      // 110: iload 6
      // 112: ifne 254
      // 115: goto 11c
      // 118: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11b: athrow
      // 11c: new java/lang/ArrayIndexOutOfBoundsException
      // 11f: dup
      // 120: sipush 22264
      // 123: ldc2_w 7102033112076345977
      // 126: lload 4
      // 128: lxor
      // 129: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: nop
      // 12f: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 132: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 135: athrow
      // 136: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 139: athrow
      // 13a: iload 2
      // 13b: tableswitch 97 0 3 29 46 63 80
      // 158: aload 0
      // 159: fload 3
      // 15a: putfield krg.zcz F
      // 15d: iload 6
      // 15f: ifne 254
      // 162: goto 169
      // 165: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 168: athrow
      // 169: aload 0
      // 16a: fload 3
      // 16b: putfield krg.w4_ F
      // 16e: iload 6
      // 170: ifne 254
      // 173: goto 17a
      // 176: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 179: athrow
      // 17a: aload 0
      // 17b: fload 3
      // 17c: putfield krg.fmx F
      // 17f: iload 6
      // 181: ifne 254
      // 184: goto 18b
      // 187: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18a: athrow
      // 18b: aload 0
      // 18c: fload 3
      // 18d: putfield krg.f46 F
      // 190: iload 6
      // 192: ifne 254
      // 195: goto 19c
      // 198: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19b: athrow
      // 19c: new java/lang/ArrayIndexOutOfBoundsException
      // 19f: dup
      // 1a0: sipush 22264
      // 1a3: ldc2_w 7102033112076345977
      // 1a6: lload 4
      // 1a8: lxor
      // 1a9: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: nop
      // 1af: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 1b2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 1b5: athrow
      // 1b6: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b9: athrow
      // 1ba: iload 2
      // 1bb: tableswitch 97 0 3 29 46 63 80
      // 1d8: aload 0
      // 1d9: fload 3
      // 1da: putfield krg.g7m F
      // 1dd: iload 6
      // 1df: ifne 254
      // 1e2: goto 1e9
      // 1e5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: fload 3
      // 1eb: putfield krg.i5l F
      // 1ee: iload 6
      // 1f0: ifne 254
      // 1f3: goto 1fa
      // 1f6: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: fload 3
      // 1fc: putfield krg.sk9 F
      // 1ff: iload 6
      // 201: ifne 254
      // 204: goto 20b
      // 207: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20a: athrow
      // 20b: aload 0
      // 20c: fload 3
      // 20d: putfield krg._40 F
      // 210: iload 6
      // 212: ifne 254
      // 215: goto 21c
      // 218: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21b: athrow
      // 21c: new java/lang/ArrayIndexOutOfBoundsException
      // 21f: dup
      // 220: sipush 22264
      // 223: ldc2_w 7102033112076345977
      // 226: lload 4
      // 228: lxor
      // 229: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: nop
      // 22f: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 232: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 235: athrow
      // 236: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 239: athrow
      // 23a: new java/lang/ArrayIndexOutOfBoundsException
      // 23d: dup
      // 23e: sipush 22264
      // 241: ldc2_w 7102033112076345977
      // 244: lload 4
      // 246: lxor
      // 247: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: nop
      // 24d: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 250: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 253: athrow
      // 254: return
   }

   public final float oco(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 25194089084392
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifeq 035
      // 013: tableswitch 284 0 3 33 94 158 222
      // 030: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 033: athrow
      // 034: iload 2
      // 035: tableswitch 55 0 3 31 40 45 50
      // 054: aload 0
      // 055: getfield krg.j8s F
      // 058: freturn
      // 059: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield krg.f28 F
      // 061: freturn
      // 062: aload 0
      // 063: getfield krg.vwt F
      // 066: freturn
      // 067: aload 0
      // 068: getfield krg.ygn F
      // 06b: freturn
      // 06c: iload 5
      // 06e: ifne 12f
      // 071: iload 2
      // 072: tableswitch 58 0 3 34 43 48 53
      // 090: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 093: athrow
      // 094: aload 0
      // 095: getfield krg.fno F
      // 098: freturn
      // 099: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield krg.rqb F
      // 0a1: freturn
      // 0a2: aload 0
      // 0a3: getfield krg.sjv F
      // 0a6: freturn
      // 0a7: aload 0
      // 0a8: getfield krg.ttd F
      // 0ab: freturn
      // 0ac: iload 5
      // 0ae: ifne 12f
      // 0b1: iload 2
      // 0b2: tableswitch 58 0 3 34 43 48 53
      // 0d0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield krg.zcz F
      // 0d8: freturn
      // 0d9: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield krg.w4_ F
      // 0e1: freturn
      // 0e2: aload 0
      // 0e3: getfield krg.fmx F
      // 0e6: freturn
      // 0e7: aload 0
      // 0e8: getfield krg.f46 F
      // 0eb: freturn
      // 0ec: iload 5
      // 0ee: ifne 12f
      // 0f1: iload 2
      // 0f2: tableswitch 58 0 3 34 43 48 53
      // 110: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 113: athrow
      // 114: aload 0
      // 115: getfield krg.g7m F
      // 118: freturn
      // 119: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield krg.i5l F
      // 121: freturn
      // 122: aload 0
      // 123: getfield krg.sk9 F
      // 126: freturn
      // 127: aload 0
      // 128: getfield krg._40 F
      // 12b: freturn
      // 12c: goto 12f
      // 12f: new java/lang/ArrayIndexOutOfBoundsException
      // 132: dup
      // 133: sipush 29946
      // 136: ldc2_w 6334521893252194723
      // 139: lload 3
      // 13a: lxor
      // 13b: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: nop
      // 141: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 144: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 147: athrow
   }

   public final void yv1(int param1, _e6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 75393145215654
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifeq 051
      // 013: ifne 049
      // 016: goto 01d
      // 019: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: aload 0
      // 01f: getfield krg.j8s F
      // 022: putfield _e6.hp2 F
      // 025: aload 2
      // 026: aload 0
      // 027: getfield krg.f28 F
      // 02a: putfield _e6.nc_ F
      // 02d: aload 2
      // 02e: aload 0
      // 02f: getfield krg.vwt F
      // 032: putfield _e6.ax5 F
      // 035: aload 2
      // 036: aload 0
      // 037: getfield krg.ygn F
      // 03a: putfield _e6.ck3 F
      // 03d: iload 5
      // 03f: ifne 126
      // 042: goto 049
      // 045: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 1
      // 04a: goto 051
      // 04d: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 050: athrow
      // 051: bipush 1
      // 052: iload 5
      // 054: ifeq 096
      // 057: if_icmpne 08d
      // 05a: goto 061
      // 05d: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: aload 2
      // 062: aload 0
      // 063: getfield krg.fno F
      // 066: putfield _e6.hp2 F
      // 069: aload 2
      // 06a: aload 0
      // 06b: getfield krg.rqb F
      // 06e: putfield _e6.nc_ F
      // 071: aload 2
      // 072: aload 0
      // 073: getfield krg.sjv F
      // 076: putfield _e6.ax5 F
      // 079: aload 2
      // 07a: aload 0
      // 07b: getfield krg.ttd F
      // 07e: putfield _e6.ck3 F
      // 081: iload 5
      // 083: ifne 126
      // 086: goto 08d
      // 089: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08c: athrow
      // 08d: iload 1
      // 08e: bipush 2
      // 08f: goto 096
      // 092: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 095: athrow
      // 096: iload 5
      // 098: ifeq 0da
      // 09b: if_icmpne 0d1
      // 09e: goto 0a5
      // 0a1: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: aload 2
      // 0a6: aload 0
      // 0a7: getfield krg.zcz F
      // 0aa: putfield _e6.hp2 F
      // 0ad: aload 2
      // 0ae: aload 0
      // 0af: getfield krg.w4_ F
      // 0b2: putfield _e6.nc_ F
      // 0b5: aload 2
      // 0b6: aload 0
      // 0b7: getfield krg.fmx F
      // 0ba: putfield _e6.ax5 F
      // 0bd: aload 2
      // 0be: aload 0
      // 0bf: getfield krg.f46 F
      // 0c2: putfield _e6.ck3 F
      // 0c5: iload 5
      // 0c7: ifne 126
      // 0ca: goto 0d1
      // 0cd: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: iload 1
      // 0d2: bipush 3
      // 0d3: goto 0da
      // 0d6: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d9: athrow
      // 0da: if_icmpne 109
      // 0dd: aload 2
      // 0de: aload 0
      // 0df: getfield krg.g7m F
      // 0e2: putfield _e6.hp2 F
      // 0e5: aload 2
      // 0e6: aload 0
      // 0e7: getfield krg.i5l F
      // 0ea: putfield _e6.nc_ F
      // 0ed: aload 2
      // 0ee: aload 0
      // 0ef: getfield krg.sk9 F
      // 0f2: putfield _e6.ax5 F
      // 0f5: aload 2
      // 0f6: aload 0
      // 0f7: getfield krg._40 F
      // 0fa: putfield _e6.ck3 F
      // 0fd: iload 5
      // 0ff: ifne 126
      // 102: goto 109
      // 105: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 108: athrow
      // 109: new java/lang/ArrayIndexOutOfBoundsException
      // 10c: dup
      // 10d: sipush 26163
      // 110: ldc2_w 2933962537084525606
      // 113: lload 3
      // 114: lxor
      // 115: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 11e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 121: athrow
      // 122: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 125: athrow
      // 126: return
   }

   public final void s0f(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 129926268501965
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifeq 04d
      // 013: ifne 045
      // 016: goto 01d
      // 019: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: bipush 0
      // 01f: aload 0
      // 020: getfield krg.j8s F
      // 023: fastore
      // 024: aload 2
      // 025: bipush 1
      // 026: aload 0
      // 027: getfield krg.f28 F
      // 02a: fastore
      // 02b: aload 2
      // 02c: bipush 2
      // 02d: aload 0
      // 02e: getfield krg.vwt F
      // 031: fastore
      // 032: aload 2
      // 033: bipush 3
      // 034: aload 0
      // 035: getfield krg.ygn F
      // 038: fastore
      // 039: iload 5
      // 03b: ifne 116
      // 03e: goto 045
      // 041: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: iload 1
      // 046: goto 04d
      // 049: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04c: athrow
      // 04d: bipush 1
      // 04e: iload 5
      // 050: ifeq 08e
      // 053: if_icmpne 085
      // 056: goto 05d
      // 059: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: aload 2
      // 05e: bipush 0
      // 05f: aload 0
      // 060: getfield krg.fno F
      // 063: fastore
      // 064: aload 2
      // 065: bipush 1
      // 066: aload 0
      // 067: getfield krg.rqb F
      // 06a: fastore
      // 06b: aload 2
      // 06c: bipush 2
      // 06d: aload 0
      // 06e: getfield krg.sjv F
      // 071: fastore
      // 072: aload 2
      // 073: bipush 3
      // 074: aload 0
      // 075: getfield krg.ttd F
      // 078: fastore
      // 079: iload 5
      // 07b: ifne 116
      // 07e: goto 085
      // 081: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 1
      // 086: bipush 2
      // 087: goto 08e
      // 08a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08d: athrow
      // 08e: iload 5
      // 090: ifeq 0ce
      // 093: if_icmpne 0c5
      // 096: goto 09d
      // 099: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09c: athrow
      // 09d: aload 2
      // 09e: bipush 0
      // 09f: aload 0
      // 0a0: getfield krg.zcz F
      // 0a3: fastore
      // 0a4: aload 2
      // 0a5: bipush 1
      // 0a6: aload 0
      // 0a7: getfield krg.w4_ F
      // 0aa: fastore
      // 0ab: aload 2
      // 0ac: bipush 2
      // 0ad: aload 0
      // 0ae: getfield krg.fmx F
      // 0b1: fastore
      // 0b2: aload 2
      // 0b3: bipush 3
      // 0b4: aload 0
      // 0b5: getfield krg.f46 F
      // 0b8: fastore
      // 0b9: iload 5
      // 0bb: ifne 116
      // 0be: goto 0c5
      // 0c1: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c4: athrow
      // 0c5: iload 1
      // 0c6: bipush 3
      // 0c7: goto 0ce
      // 0ca: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cd: athrow
      // 0ce: if_icmpne 0f9
      // 0d1: aload 2
      // 0d2: bipush 0
      // 0d3: aload 0
      // 0d4: getfield krg.g7m F
      // 0d7: fastore
      // 0d8: aload 2
      // 0d9: bipush 1
      // 0da: aload 0
      // 0db: getfield krg.i5l F
      // 0de: fastore
      // 0df: aload 2
      // 0e0: bipush 2
      // 0e1: aload 0
      // 0e2: getfield krg.sk9 F
      // 0e5: fastore
      // 0e6: aload 2
      // 0e7: bipush 3
      // 0e8: aload 0
      // 0e9: getfield krg._40 F
      // 0ec: fastore
      // 0ed: iload 5
      // 0ef: ifne 116
      // 0f2: goto 0f9
      // 0f5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f8: athrow
      // 0f9: new java/lang/ArrayIndexOutOfBoundsException
      // 0fc: dup
      // 0fd: sipush 2176
      // 100: ldc2_w 5758950369880954865
      // 103: lload 3
      // 104: lxor
      // 105: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 10e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 111: athrow
      // 112: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 115: athrow
      // 116: return
   }

   public final void b1i(int param1, _e6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 103037888177838
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifeq 051
      // 013: ifne 049
      // 016: goto 01d
      // 019: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: aload 0
      // 01f: getfield krg.j8s F
      // 022: putfield _e6.hp2 F
      // 025: aload 2
      // 026: aload 0
      // 027: getfield krg.fno F
      // 02a: putfield _e6.nc_ F
      // 02d: aload 2
      // 02e: aload 0
      // 02f: getfield krg.zcz F
      // 032: putfield _e6.ax5 F
      // 035: aload 2
      // 036: aload 0
      // 037: getfield krg.g7m F
      // 03a: putfield _e6.ck3 F
      // 03d: iload 5
      // 03f: ifne 126
      // 042: goto 049
      // 045: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 1
      // 04a: goto 051
      // 04d: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 050: athrow
      // 051: bipush 1
      // 052: iload 5
      // 054: ifeq 096
      // 057: if_icmpne 08d
      // 05a: goto 061
      // 05d: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: aload 2
      // 062: aload 0
      // 063: getfield krg.f28 F
      // 066: putfield _e6.hp2 F
      // 069: aload 2
      // 06a: aload 0
      // 06b: getfield krg.rqb F
      // 06e: putfield _e6.nc_ F
      // 071: aload 2
      // 072: aload 0
      // 073: getfield krg.w4_ F
      // 076: putfield _e6.ax5 F
      // 079: aload 2
      // 07a: aload 0
      // 07b: getfield krg.i5l F
      // 07e: putfield _e6.ck3 F
      // 081: iload 5
      // 083: ifne 126
      // 086: goto 08d
      // 089: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08c: athrow
      // 08d: iload 1
      // 08e: bipush 2
      // 08f: goto 096
      // 092: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 095: athrow
      // 096: iload 5
      // 098: ifeq 0da
      // 09b: if_icmpne 0d1
      // 09e: goto 0a5
      // 0a1: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: aload 2
      // 0a6: aload 0
      // 0a7: getfield krg.vwt F
      // 0aa: putfield _e6.hp2 F
      // 0ad: aload 2
      // 0ae: aload 0
      // 0af: getfield krg.sjv F
      // 0b2: putfield _e6.nc_ F
      // 0b5: aload 2
      // 0b6: aload 0
      // 0b7: getfield krg.fmx F
      // 0ba: putfield _e6.ax5 F
      // 0bd: aload 2
      // 0be: aload 0
      // 0bf: getfield krg.sk9 F
      // 0c2: putfield _e6.ck3 F
      // 0c5: iload 5
      // 0c7: ifne 126
      // 0ca: goto 0d1
      // 0cd: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: iload 1
      // 0d2: bipush 3
      // 0d3: goto 0da
      // 0d6: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d9: athrow
      // 0da: if_icmpne 109
      // 0dd: aload 2
      // 0de: aload 0
      // 0df: getfield krg.ygn F
      // 0e2: putfield _e6.hp2 F
      // 0e5: aload 2
      // 0e6: aload 0
      // 0e7: getfield krg.ttd F
      // 0ea: putfield _e6.nc_ F
      // 0ed: aload 2
      // 0ee: aload 0
      // 0ef: getfield krg.f46 F
      // 0f2: putfield _e6.ax5 F
      // 0f5: aload 2
      // 0f6: aload 0
      // 0f7: getfield krg._40 F
      // 0fa: putfield _e6.ck3 F
      // 0fd: iload 5
      // 0ff: ifne 126
      // 102: goto 109
      // 105: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 108: athrow
      // 109: new java/lang/ArrayIndexOutOfBoundsException
      // 10c: dup
      // 10d: sipush 3898
      // 110: ldc2_w 3878487391377312044
      // 113: lload 3
      // 114: lxor
      // 115: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 11e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 121: athrow
      // 122: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 125: athrow
      // 126: return
   }

   public final void kzs(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 92177276768632
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifne 04d
      // 013: ifne 045
      // 016: goto 01d
      // 019: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: bipush 0
      // 01f: aload 0
      // 020: getfield krg.j8s F
      // 023: fastore
      // 024: aload 2
      // 025: bipush 1
      // 026: aload 0
      // 027: getfield krg.fno F
      // 02a: fastore
      // 02b: aload 2
      // 02c: bipush 2
      // 02d: aload 0
      // 02e: getfield krg.zcz F
      // 031: fastore
      // 032: aload 2
      // 033: bipush 3
      // 034: aload 0
      // 035: getfield krg.g7m F
      // 038: fastore
      // 039: iload 5
      // 03b: ifeq 116
      // 03e: goto 045
      // 041: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: iload 1
      // 046: goto 04d
      // 049: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04c: athrow
      // 04d: bipush 1
      // 04e: iload 5
      // 050: ifne 08e
      // 053: if_icmpne 085
      // 056: goto 05d
      // 059: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: aload 2
      // 05e: bipush 0
      // 05f: aload 0
      // 060: getfield krg.f28 F
      // 063: fastore
      // 064: aload 2
      // 065: bipush 1
      // 066: aload 0
      // 067: getfield krg.rqb F
      // 06a: fastore
      // 06b: aload 2
      // 06c: bipush 2
      // 06d: aload 0
      // 06e: getfield krg.w4_ F
      // 071: fastore
      // 072: aload 2
      // 073: bipush 3
      // 074: aload 0
      // 075: getfield krg.i5l F
      // 078: fastore
      // 079: iload 5
      // 07b: ifeq 116
      // 07e: goto 085
      // 081: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 1
      // 086: bipush 2
      // 087: goto 08e
      // 08a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08d: athrow
      // 08e: iload 5
      // 090: ifne 0ce
      // 093: if_icmpne 0c5
      // 096: goto 09d
      // 099: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09c: athrow
      // 09d: aload 2
      // 09e: bipush 0
      // 09f: aload 0
      // 0a0: getfield krg.vwt F
      // 0a3: fastore
      // 0a4: aload 2
      // 0a5: bipush 1
      // 0a6: aload 0
      // 0a7: getfield krg.sjv F
      // 0aa: fastore
      // 0ab: aload 2
      // 0ac: bipush 2
      // 0ad: aload 0
      // 0ae: getfield krg.fmx F
      // 0b1: fastore
      // 0b2: aload 2
      // 0b3: bipush 3
      // 0b4: aload 0
      // 0b5: getfield krg.sk9 F
      // 0b8: fastore
      // 0b9: iload 5
      // 0bb: ifeq 116
      // 0be: goto 0c5
      // 0c1: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c4: athrow
      // 0c5: iload 1
      // 0c6: bipush 3
      // 0c7: goto 0ce
      // 0ca: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cd: athrow
      // 0ce: if_icmpne 0f9
      // 0d1: aload 2
      // 0d2: bipush 0
      // 0d3: aload 0
      // 0d4: getfield krg.ygn F
      // 0d7: fastore
      // 0d8: aload 2
      // 0d9: bipush 1
      // 0da: aload 0
      // 0db: getfield krg.ttd F
      // 0de: fastore
      // 0df: aload 2
      // 0e0: bipush 2
      // 0e1: aload 0
      // 0e2: getfield krg.f46 F
      // 0e5: fastore
      // 0e6: aload 2
      // 0e7: bipush 3
      // 0e8: aload 0
      // 0e9: getfield krg._40 F
      // 0ec: fastore
      // 0ed: iload 5
      // 0ef: ifeq 116
      // 0f2: goto 0f9
      // 0f5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f8: athrow
      // 0f9: new java/lang/ArrayIndexOutOfBoundsException
      // 0fc: dup
      // 0fd: sipush 5919
      // 100: ldc2_w 1261092020263216850
      // 103: lload 3
      // 104: lxor
      // 105: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 10e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 111: athrow
      // 112: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 115: athrow
      // 116: return
   }

   public final void gwd(float var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.mwd(var3, var2);
      this.j8s = (float)(var2[0] * (double)var1);
      this.f28 = (float)(var2[1] * (double)var1);
      this.vwt = (float)(var2[2] * (double)var1);
      this.fno = (float)(var2[3] * (double)var1);
      this.rqb = (float)(var2[4] * (double)var1);
      this.sjv = (float)(var2[5] * (double)var1);
      this.zcz = (float)(var2[6] * (double)var1);
      this.w4_ = (float)(var2[7] * (double)var1);
      this.fmx = (float)(var2[8] * (double)var1);
   }

   public final void wcg(iww var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.mwd(var3, var2);
      var1.lxb = var2[0];
      var1.y3c = var2[1];
      var1.bhd = var2[2];
      var1.get = var2[3];
      var1.pwn = var2[4];
      var1.c84 = var2[5];
      var1.y7q = var2[6];
      var1._o7 = var2[7];
      var1.ffq = var2[8];
   }

   public final void dn7(nvj var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.mwd(var3, var2);
      var1.i2i = (float)var2[0];
      var1.k12 = (float)var2[1];
      var1.xu6 = (float)var2[2];
      var1._id = (float)var2[3];
      var1.aoj = (float)var2[4];
      var1.zk_ = (float)var2[5];
      var1.aqg = (float)var2[6];
      var1.wdt = (float)var2[7];
      var1.jr8 = (float)var2[8];
   }

   public final float y9i(nvj var1, l3p var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.mwd(var4, var3);
      var1.i2i = (float)var3[0];
      var1.k12 = (float)var3[1];
      var1.xu6 = (float)var3[2];
      var1._id = (float)var3[3];
      var1.aoj = (float)var3[4];
      var1.zk_ = (float)var3[5];
      var1.aqg = (float)var3[6];
      var1.wdt = (float)var3[7];
      var1.jr8 = (float)var3[8];
      var2.yiu = this.ygn;
      var2.q6o = this.ttd;
      var2.n_d = this.f46;
      return (float)iww.okm(var4);
   }

   public final void zd3(lwt param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 9
      // 002: newarray 7
      // 004: astore 3
      // 005: bipush 3
      // 006: newarray 7
      // 008: astore 4
      // 00a: aload 0
      // 00b: aload 4
      // 00d: aload 3
      // 00e: invokespecial krg.mwd ([D[D)V
      // 011: invokestatic OpaquePredicate.c ()I
      // 014: ldc2_w 0.25
      // 017: dconst_1
      // 018: aload 3
      // 019: bipush 0
      // 01a: daload
      // 01b: dadd
      // 01c: aload 3
      // 01d: bipush 4
      // 01e: daload
      // 01f: dadd
      // 020: aload 3
      // 021: bipush 8
      // 023: daload
      // 024: dadd
      // 025: dmul
      // 026: dstore 5
      // 028: istore 2
      // 029: dload 5
      // 02b: iload 2
      // 02c: ifne 045
      // 02f: dconst_0
      // 030: dcmpg
      // 031: ifge 048
      // 034: goto 03b
      // 037: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03a: athrow
      // 03b: dload 5
      // 03d: dneg
      // 03e: goto 045
      // 041: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: goto 04a
      // 048: dload 5
      // 04a: ldc2_w 1.0E-30
      // 04d: dcmpg
      // 04e: iload 2
      // 04f: ifne 0c3
      // 052: iflt 0a1
      // 055: goto 05c
      // 058: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: aload 1
      // 05d: dload 5
      // 05f: invokestatic java/lang/Math.sqrt (D)D
      // 062: d2f
      // 063: putfield lwt.ck3 F
      // 066: ldc2_w 0.25
      // 069: aload 1
      // 06a: getfield lwt.ck3 F
      // 06d: f2d
      // 06e: ddiv
      // 06f: dstore 5
      // 071: aload 1
      // 072: aload 3
      // 073: bipush 7
      // 075: daload
      // 076: aload 3
      // 077: bipush 5
      // 078: daload
      // 079: dsub
      // 07a: dload 5
      // 07c: dmul
      // 07d: d2f
      // 07e: putfield lwt.hp2 F
      // 081: aload 1
      // 082: aload 3
      // 083: bipush 2
      // 084: daload
      // 085: aload 3
      // 086: bipush 6
      // 088: daload
      // 089: dsub
      // 08a: dload 5
      // 08c: dmul
      // 08d: d2f
      // 08e: putfield lwt.nc_ F
      // 091: aload 1
      // 092: aload 3
      // 093: bipush 3
      // 094: daload
      // 095: aload 3
      // 096: bipush 1
      // 097: daload
      // 098: dsub
      // 099: dload 5
      // 09b: dmul
      // 09c: d2f
      // 09d: putfield lwt.ax5 F
      // 0a0: return
      // 0a1: aload 1
      // 0a2: fconst_0
      // 0a3: putfield lwt.ck3 F
      // 0a6: ldc2_w -0.5
      // 0a9: aload 3
      // 0aa: bipush 4
      // 0ab: daload
      // 0ac: aload 3
      // 0ad: bipush 8
      // 0af: daload
      // 0b0: dadd
      // 0b1: dmul
      // 0b2: dstore 5
      // 0b4: dload 5
      // 0b6: iload 2
      // 0b7: ifne 0d0
      // 0ba: dconst_0
      // 0bb: dcmpg
      // 0bc: goto 0c3
      // 0bf: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c2: athrow
      // 0c3: ifge 0d3
      // 0c6: dload 5
      // 0c8: dneg
      // 0c9: goto 0d0
      // 0cc: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cf: athrow
      // 0d0: goto 0d5
      // 0d3: dload 5
      // 0d5: ldc2_w 1.0E-30
      // 0d8: dcmpg
      // 0d9: iload 2
      // 0da: ifne 134
      // 0dd: iflt 114
      // 0e0: goto 0e7
      // 0e3: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e6: athrow
      // 0e7: aload 1
      // 0e8: dload 5
      // 0ea: invokestatic java/lang/Math.sqrt (D)D
      // 0ed: d2f
      // 0ee: putfield lwt.hp2 F
      // 0f1: ldc2_w 0.5
      // 0f4: aload 1
      // 0f5: getfield lwt.hp2 F
      // 0f8: f2d
      // 0f9: ddiv
      // 0fa: dstore 5
      // 0fc: aload 1
      // 0fd: aload 3
      // 0fe: bipush 3
      // 0ff: daload
      // 100: dload 5
      // 102: dmul
      // 103: d2f
      // 104: putfield lwt.nc_ F
      // 107: aload 1
      // 108: aload 3
      // 109: bipush 6
      // 10b: daload
      // 10c: dload 5
      // 10e: dmul
      // 10f: d2f
      // 110: putfield lwt.ax5 F
      // 113: return
      // 114: aload 1
      // 115: fconst_0
      // 116: putfield lwt.hp2 F
      // 119: ldc2_w 0.5
      // 11c: dconst_1
      // 11d: aload 3
      // 11e: bipush 8
      // 120: daload
      // 121: dsub
      // 122: dmul
      // 123: dstore 5
      // 125: dload 5
      // 127: iload 2
      // 128: ifne 141
      // 12b: dconst_0
      // 12c: dcmpg
      // 12d: goto 134
      // 130: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 133: athrow
      // 134: ifge 144
      // 137: dload 5
      // 139: dneg
      // 13a: goto 141
      // 13d: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 140: athrow
      // 141: goto 146
      // 144: dload 5
      // 146: ldc2_w 1.0E-30
      // 149: dcmpg
      // 14a: iflt 16f
      // 14d: aload 1
      // 14e: dload 5
      // 150: invokestatic java/lang/Math.sqrt (D)D
      // 153: d2f
      // 154: putfield lwt.nc_ F
      // 157: aload 1
      // 158: aload 3
      // 159: bipush 7
      // 15b: daload
      // 15c: ldc2_w 2.0
      // 15f: aload 1
      // 160: getfield lwt.nc_ F
      // 163: f2d
      // 164: dmul
      // 165: ddiv
      // 166: d2f
      // 167: putfield lwt.ax5 F
      // 16a: return
      // 16b: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16e: athrow
      // 16f: aload 1
      // 170: fconst_0
      // 171: putfield lwt.nc_ F
      // 174: aload 1
      // 175: fconst_1
      // 176: putfield lwt.ax5 F
      // 179: return
   }

   public final void wqh(l3p var1) {
      var1.yiu = this.ygn;
      var1.q6o = this.ttd;
      var1.n_d = this.f46;
   }

   public final void tsc(nvj var1) {
      var1.i2i = this.j8s;
      var1.k12 = this.f28;
      var1.xu6 = this.vwt;
      var1._id = this.fno;
      var1.aoj = this.rqb;
      var1.zk_ = this.sjv;
      var1.aqg = this.zcz;
      var1.wdt = this.w4_;
      var1.jr8 = this.fmx;
   }

   public final float p6k() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.mwd(var2, var1);
      return (float)iww.okm(var2);
   }

   public final void qnw(nvj var1) {
      this.j8s = var1.i2i;
      this.f28 = var1.k12;
      this.vwt = var1.xu6;
      this.fno = var1._id;
      this.rqb = var1.aoj;
      this.sjv = var1.zk_;
      this.zcz = var1.aqg;
      this.w4_ = var1.wdt;
      this.fmx = var1.jr8;
   }

   public final void z9y(int param1, float param2, float param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic krg.a J
      // 03: ldc2_w 7553802910492
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 8
      // 0e: iload 1
      // 0f: tableswitch 165 0 3 29 63 97 131
      // 2c: aload 0
      // 2d: fload 2
      // 2e: putfield krg.j8s F
      // 31: aload 0
      // 32: fload 3
      // 33: putfield krg.f28 F
      // 36: aload 0
      // 37: fload 4
      // 39: putfield krg.vwt F
      // 3c: aload 0
      // 3d: fload 5
      // 3f: putfield krg.ygn F
      // 42: iload 8
      // 44: ifeq d2
      // 47: goto 4e
      // 4a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: fload 2
      // 50: putfield krg.fno F
      // 53: aload 0
      // 54: fload 3
      // 55: putfield krg.rqb F
      // 58: aload 0
      // 59: fload 4
      // 5b: putfield krg.sjv F
      // 5e: aload 0
      // 5f: fload 5
      // 61: putfield krg.ttd F
      // 64: iload 8
      // 66: ifeq d2
      // 69: goto 70
      // 6c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: fload 2
      // 72: putfield krg.zcz F
      // 75: aload 0
      // 76: fload 3
      // 77: putfield krg.w4_ F
      // 7a: aload 0
      // 7b: fload 4
      // 7d: putfield krg.fmx F
      // 80: aload 0
      // 81: fload 5
      // 83: putfield krg.f46 F
      // 86: iload 8
      // 88: ifeq d2
      // 8b: goto 92
      // 8e: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 91: athrow
      // 92: aload 0
      // 93: fload 2
      // 94: putfield krg.g7m F
      // 97: aload 0
      // 98: fload 3
      // 99: putfield krg.i5l F
      // 9c: aload 0
      // 9d: fload 4
      // 9f: putfield krg.sk9 F
      // a2: aload 0
      // a3: fload 5
      // a5: putfield krg._40 F
      // a8: iload 8
      // aa: ifeq d2
      // ad: goto b4
      // b0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b3: athrow
      // b4: new java/lang/ArrayIndexOutOfBoundsException
      // b7: dup
      // b8: sipush 12069
      // bb: ldc2_w 5681252430660629643
      // be: lload 6
      // c0: lxor
      // c1: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: nop
      // c7: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // ca: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // cd: athrow
      // ce: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d1: athrow
      // d2: return
   }

   public final void zeb(int param1, _e6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic krg.a J
      // 03: ldc2_w 106511896079905
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 206 0 3 30 74 118 162
      // 2c: aload 0
      // 2d: aload 2
      // 2e: getfield _e6.hp2 F
      // 31: putfield krg.j8s F
      // 34: aload 0
      // 35: aload 2
      // 36: getfield _e6.nc_ F
      // 39: putfield krg.f28 F
      // 3c: aload 0
      // 3d: aload 2
      // 3e: getfield _e6.ax5 F
      // 41: putfield krg.vwt F
      // 44: aload 0
      // 45: aload 2
      // 46: getfield _e6.ck3 F
      // 49: putfield krg.ygn F
      // 4c: iload 5
      // 4e: ifeq f9
      // 51: goto 58
      // 54: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57: athrow
      // 58: aload 0
      // 59: aload 2
      // 5a: getfield _e6.hp2 F
      // 5d: putfield krg.fno F
      // 60: aload 0
      // 61: aload 2
      // 62: getfield _e6.nc_ F
      // 65: putfield krg.rqb F
      // 68: aload 0
      // 69: aload 2
      // 6a: getfield _e6.ax5 F
      // 6d: putfield krg.sjv F
      // 70: aload 0
      // 71: aload 2
      // 72: getfield _e6.ck3 F
      // 75: putfield krg.ttd F
      // 78: iload 5
      // 7a: ifeq f9
      // 7d: goto 84
      // 80: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: aload 2
      // 86: getfield _e6.hp2 F
      // 89: putfield krg.zcz F
      // 8c: aload 0
      // 8d: aload 2
      // 8e: getfield _e6.nc_ F
      // 91: putfield krg.w4_ F
      // 94: aload 0
      // 95: aload 2
      // 96: getfield _e6.ax5 F
      // 99: putfield krg.fmx F
      // 9c: aload 0
      // 9d: aload 2
      // 9e: getfield _e6.ck3 F
      // a1: putfield krg.f46 F
      // a4: iload 5
      // a6: ifeq f9
      // a9: goto b0
      // ac: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // af: athrow
      // b0: aload 0
      // b1: aload 2
      // b2: getfield _e6.hp2 F
      // b5: putfield krg.g7m F
      // b8: aload 0
      // b9: aload 2
      // ba: getfield _e6.nc_ F
      // bd: putfield krg.i5l F
      // c0: aload 0
      // c1: aload 2
      // c2: getfield _e6.ax5 F
      // c5: putfield krg.sk9 F
      // c8: aload 0
      // c9: aload 2
      // ca: getfield _e6.ck3 F
      // cd: putfield krg._40 F
      // d0: iload 5
      // d2: ifeq f9
      // d5: goto dc
      // d8: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // db: athrow
      // dc: new java/lang/ArrayIndexOutOfBoundsException
      // df: dup
      // e0: sipush 31256
      // e3: ldc2_w 9122095684631458947
      // e6: lload 3
      // e7: lxor
      // e8: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed: nop
      // ee: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // f1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // f4: athrow
      // f5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // f8: athrow
      // f9: return
   }

   public final void h7x(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic krg.a J
      // 03: ldc2_w 82112973691714
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 190 0 3 30 70 110 150
      // 2c: aload 0
      // 2d: aload 2
      // 2e: bipush 0
      // 2f: faload
      // 30: putfield krg.j8s F
      // 33: aload 0
      // 34: aload 2
      // 35: bipush 1
      // 36: faload
      // 37: putfield krg.f28 F
      // 3a: aload 0
      // 3b: aload 2
      // 3c: bipush 2
      // 3d: faload
      // 3e: putfield krg.vwt F
      // 41: aload 0
      // 42: aload 2
      // 43: bipush 3
      // 44: faload
      // 45: putfield krg.ygn F
      // 48: iload 5
      // 4a: ifne e9
      // 4d: goto 54
      // 50: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 0
      // 55: aload 2
      // 56: bipush 0
      // 57: faload
      // 58: putfield krg.fno F
      // 5b: aload 0
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: faload
      // 5f: putfield krg.rqb F
      // 62: aload 0
      // 63: aload 2
      // 64: bipush 2
      // 65: faload
      // 66: putfield krg.sjv F
      // 69: aload 0
      // 6a: aload 2
      // 6b: bipush 3
      // 6c: faload
      // 6d: putfield krg.ttd F
      // 70: iload 5
      // 72: ifne e9
      // 75: goto 7c
      // 78: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: aload 2
      // 7e: bipush 0
      // 7f: faload
      // 80: putfield krg.zcz F
      // 83: aload 0
      // 84: aload 2
      // 85: bipush 1
      // 86: faload
      // 87: putfield krg.w4_ F
      // 8a: aload 0
      // 8b: aload 2
      // 8c: bipush 2
      // 8d: faload
      // 8e: putfield krg.fmx F
      // 91: aload 0
      // 92: aload 2
      // 93: bipush 3
      // 94: faload
      // 95: putfield krg.f46 F
      // 98: iload 5
      // 9a: ifne e9
      // 9d: goto a4
      // a0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: aload 0
      // a5: aload 2
      // a6: bipush 0
      // a7: faload
      // a8: putfield krg.g7m F
      // ab: aload 0
      // ac: aload 2
      // ad: bipush 1
      // ae: faload
      // af: putfield krg.i5l F
      // b2: aload 0
      // b3: aload 2
      // b4: bipush 2
      // b5: faload
      // b6: putfield krg.sk9 F
      // b9: aload 0
      // ba: aload 2
      // bb: bipush 3
      // bc: faload
      // bd: putfield krg._40 F
      // c0: iload 5
      // c2: ifne e9
      // c5: goto cc
      // c8: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // cb: athrow
      // cc: new java/lang/ArrayIndexOutOfBoundsException
      // cf: dup
      // d0: sipush 12069
      // d3: ldc2_w 5681168388534310101
      // d6: lload 3
      // d7: lxor
      // d8: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // e1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // e4: athrow
      // e5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // e8: athrow
      // e9: return
   }

   public final void m5w(int param1, float param2, float param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic krg.a J
      // 03: ldc2_w 63893657096874
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 8
      // 0e: iload 1
      // 0f: tableswitch 165 0 3 29 63 97 131
      // 2c: aload 0
      // 2d: fload 2
      // 2e: putfield krg.j8s F
      // 31: aload 0
      // 32: fload 3
      // 33: putfield krg.fno F
      // 36: aload 0
      // 37: fload 4
      // 39: putfield krg.zcz F
      // 3c: aload 0
      // 3d: fload 5
      // 3f: putfield krg.g7m F
      // 42: iload 8
      // 44: ifeq d2
      // 47: goto 4e
      // 4a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: fload 2
      // 50: putfield krg.f28 F
      // 53: aload 0
      // 54: fload 3
      // 55: putfield krg.rqb F
      // 58: aload 0
      // 59: fload 4
      // 5b: putfield krg.w4_ F
      // 5e: aload 0
      // 5f: fload 5
      // 61: putfield krg.i5l F
      // 64: iload 8
      // 66: ifeq d2
      // 69: goto 70
      // 6c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: aload 0
      // 71: fload 2
      // 72: putfield krg.vwt F
      // 75: aload 0
      // 76: fload 3
      // 77: putfield krg.sjv F
      // 7a: aload 0
      // 7b: fload 4
      // 7d: putfield krg.fmx F
      // 80: aload 0
      // 81: fload 5
      // 83: putfield krg.sk9 F
      // 86: iload 8
      // 88: ifeq d2
      // 8b: goto 92
      // 8e: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 91: athrow
      // 92: aload 0
      // 93: fload 2
      // 94: putfield krg.ygn F
      // 97: aload 0
      // 98: fload 3
      // 99: putfield krg.ttd F
      // 9c: aload 0
      // 9d: fload 4
      // 9f: putfield krg.f46 F
      // a2: aload 0
      // a3: fload 5
      // a5: putfield krg._40 F
      // a8: iload 8
      // aa: ifeq d2
      // ad: goto b4
      // b0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b3: athrow
      // b4: new java/lang/ArrayIndexOutOfBoundsException
      // b7: dup
      // b8: sipush 29836
      // bb: ldc2_w 2250887627323115167
      // be: lload 6
      // c0: lxor
      // c1: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: nop
      // c7: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // ca: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // cd: athrow
      // ce: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d1: athrow
      // d2: return
   }

   public final void rrb(int param1, _e6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic krg.a J
      // 03: ldc2_w 32936816114763
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 206 0 3 30 74 118 162
      // 2c: aload 0
      // 2d: aload 2
      // 2e: getfield _e6.hp2 F
      // 31: putfield krg.j8s F
      // 34: aload 0
      // 35: aload 2
      // 36: getfield _e6.nc_ F
      // 39: putfield krg.fno F
      // 3c: aload 0
      // 3d: aload 2
      // 3e: getfield _e6.ax5 F
      // 41: putfield krg.zcz F
      // 44: aload 0
      // 45: aload 2
      // 46: getfield _e6.ck3 F
      // 49: putfield krg.g7m F
      // 4c: iload 5
      // 4e: ifeq f9
      // 51: goto 58
      // 54: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57: athrow
      // 58: aload 0
      // 59: aload 2
      // 5a: getfield _e6.hp2 F
      // 5d: putfield krg.f28 F
      // 60: aload 0
      // 61: aload 2
      // 62: getfield _e6.nc_ F
      // 65: putfield krg.rqb F
      // 68: aload 0
      // 69: aload 2
      // 6a: getfield _e6.ax5 F
      // 6d: putfield krg.w4_ F
      // 70: aload 0
      // 71: aload 2
      // 72: getfield _e6.ck3 F
      // 75: putfield krg.i5l F
      // 78: iload 5
      // 7a: ifeq f9
      // 7d: goto 84
      // 80: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: aload 2
      // 86: getfield _e6.hp2 F
      // 89: putfield krg.vwt F
      // 8c: aload 0
      // 8d: aload 2
      // 8e: getfield _e6.nc_ F
      // 91: putfield krg.sjv F
      // 94: aload 0
      // 95: aload 2
      // 96: getfield _e6.ax5 F
      // 99: putfield krg.fmx F
      // 9c: aload 0
      // 9d: aload 2
      // 9e: getfield _e6.ck3 F
      // a1: putfield krg.sk9 F
      // a4: iload 5
      // a6: ifeq f9
      // a9: goto b0
      // ac: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // af: athrow
      // b0: aload 0
      // b1: aload 2
      // b2: getfield _e6.hp2 F
      // b5: putfield krg.ygn F
      // b8: aload 0
      // b9: aload 2
      // ba: getfield _e6.nc_ F
      // bd: putfield krg.ttd F
      // c0: aload 0
      // c1: aload 2
      // c2: getfield _e6.ax5 F
      // c5: putfield krg.f46 F
      // c8: aload 0
      // c9: aload 2
      // ca: getfield _e6.ck3 F
      // cd: putfield krg._40 F
      // d0: iload 5
      // d2: ifeq f9
      // d5: goto dc
      // d8: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // db: athrow
      // dc: new java/lang/ArrayIndexOutOfBoundsException
      // df: dup
      // e0: sipush 16385
      // e3: ldc2_w 484825744782384378
      // e6: lload 3
      // e7: lxor
      // e8: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed: nop
      // ee: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // f1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // f4: athrow
      // f5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // f8: athrow
      // f9: return
   }

   public final void phd(int param1, float[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic krg.a J
      // 03: ldc2_w 57534533590265
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 190 0 3 30 70 110 150
      // 2c: aload 0
      // 2d: aload 2
      // 2e: bipush 0
      // 2f: faload
      // 30: putfield krg.j8s F
      // 33: aload 0
      // 34: aload 2
      // 35: bipush 1
      // 36: faload
      // 37: putfield krg.fno F
      // 3a: aload 0
      // 3b: aload 2
      // 3c: bipush 2
      // 3d: faload
      // 3e: putfield krg.zcz F
      // 41: aload 0
      // 42: aload 2
      // 43: bipush 3
      // 44: faload
      // 45: putfield krg.g7m F
      // 48: iload 5
      // 4a: ifne e9
      // 4d: goto 54
      // 50: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 0
      // 55: aload 2
      // 56: bipush 0
      // 57: faload
      // 58: putfield krg.f28 F
      // 5b: aload 0
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: faload
      // 5f: putfield krg.rqb F
      // 62: aload 0
      // 63: aload 2
      // 64: bipush 2
      // 65: faload
      // 66: putfield krg.w4_ F
      // 69: aload 0
      // 6a: aload 2
      // 6b: bipush 3
      // 6c: faload
      // 6d: putfield krg.i5l F
      // 70: iload 5
      // 72: ifne e9
      // 75: goto 7c
      // 78: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: aload 2
      // 7e: bipush 0
      // 7f: faload
      // 80: putfield krg.vwt F
      // 83: aload 0
      // 84: aload 2
      // 85: bipush 1
      // 86: faload
      // 87: putfield krg.sjv F
      // 8a: aload 0
      // 8b: aload 2
      // 8c: bipush 2
      // 8d: faload
      // 8e: putfield krg.fmx F
      // 91: aload 0
      // 92: aload 2
      // 93: bipush 3
      // 94: faload
      // 95: putfield krg.sk9 F
      // 98: iload 5
      // 9a: ifne e9
      // 9d: goto a4
      // a0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: aload 0
      // a5: aload 2
      // a6: bipush 0
      // a7: faload
      // a8: putfield krg.ygn F
      // ab: aload 0
      // ac: aload 2
      // ad: bipush 1
      // ae: faload
      // af: putfield krg.ttd F
      // b2: aload 0
      // b3: aload 2
      // b4: bipush 2
      // b5: faload
      // b6: putfield krg.f46 F
      // b9: aload 0
      // ba: aload 2
      // bb: bipush 3
      // bc: faload
      // bd: putfield krg._40 F
      // c0: iload 5
      // c2: ifne e9
      // c5: goto cc
      // c8: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // cb: athrow
      // cc: new java/lang/ArrayIndexOutOfBoundsException
      // cf: dup
      // d0: sipush 16385
      // d3: ldc2_w 484800881521425480
      // d6: lload 3
      // d7: lxor
      // d8: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // e1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // e4: athrow
      // e5: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // e8: athrow
      // e9: return
   }

   public final void im0(float var1) {
      this.j8s += var1;
      this.f28 += var1;
      this.vwt += var1;
      this.ygn += var1;
      this.fno += var1;
      this.rqb += var1;
      this.sjv += var1;
      this.ttd += var1;
      this.zcz += var1;
      this.w4_ += var1;
      this.fmx += var1;
      this.f46 += var1;
      this.g7m += var1;
      this.i5l += var1;
      this.sk9 += var1;
      this._40 += var1;
   }

   public final void erw(float var1, krg var2) {
      this.j8s = var2.j8s + var1;
      this.f28 = var2.f28 + var1;
      this.vwt = var2.vwt + var1;
      this.ygn = var2.ygn + var1;
      this.fno = var2.fno + var1;
      this.rqb = var2.rqb + var1;
      this.sjv = var2.sjv + var1;
      this.ttd = var2.ttd + var1;
      this.zcz = var2.zcz + var1;
      this.w4_ = var2.w4_ + var1;
      this.fmx = var2.fmx + var1;
      this.f46 = var2.f46 + var1;
      this.g7m = var2.g7m + var1;
      this.i5l = var2.i5l + var1;
      this.sk9 = var2.sk9 + var1;
      this._40 = var2._40 + var1;
   }

   public final void qv5(krg var1, krg var2) {
      this.j8s = var1.j8s + var2.j8s;
      this.f28 = var1.f28 + var2.f28;
      this.vwt = var1.vwt + var2.vwt;
      this.ygn = var1.ygn + var2.ygn;
      this.fno = var1.fno + var2.fno;
      this.rqb = var1.rqb + var2.rqb;
      this.sjv = var1.sjv + var2.sjv;
      this.ttd = var1.ttd + var2.ttd;
      this.zcz = var1.zcz + var2.zcz;
      this.w4_ = var1.w4_ + var2.w4_;
      this.fmx = var1.fmx + var2.fmx;
      this.f46 = var1.f46 + var2.f46;
      this.g7m = var1.g7m + var2.g7m;
      this.i5l = var1.i5l + var2.i5l;
      this.sk9 = var1.sk9 + var2.sk9;
      this._40 = var1._40 + var2._40;
   }

   public final void iq3(krg var1) {
      this.j8s = this.j8s + var1.j8s;
      this.f28 = this.f28 + var1.f28;
      this.vwt = this.vwt + var1.vwt;
      this.ygn = this.ygn + var1.ygn;
      this.fno = this.fno + var1.fno;
      this.rqb = this.rqb + var1.rqb;
      this.sjv = this.sjv + var1.sjv;
      this.ttd = this.ttd + var1.ttd;
      this.zcz = this.zcz + var1.zcz;
      this.w4_ = this.w4_ + var1.w4_;
      this.fmx = this.fmx + var1.fmx;
      this.f46 = this.f46 + var1.f46;
      this.g7m = this.g7m + var1.g7m;
      this.i5l = this.i5l + var1.i5l;
      this.sk9 = this.sk9 + var1.sk9;
      this._40 = this._40 + var1._40;
   }

   public final void yxk(krg var1, krg var2) {
      this.j8s = var1.j8s - var2.j8s;
      this.f28 = var1.f28 - var2.f28;
      this.vwt = var1.vwt - var2.vwt;
      this.ygn = var1.ygn - var2.ygn;
      this.fno = var1.fno - var2.fno;
      this.rqb = var1.rqb - var2.rqb;
      this.sjv = var1.sjv - var2.sjv;
      this.ttd = var1.ttd - var2.ttd;
      this.zcz = var1.zcz - var2.zcz;
      this.w4_ = var1.w4_ - var2.w4_;
      this.fmx = var1.fmx - var2.fmx;
      this.f46 = var1.f46 - var2.f46;
      this.g7m = var1.g7m - var2.g7m;
      this.i5l = var1.i5l - var2.i5l;
      this.sk9 = var1.sk9 - var2.sk9;
      this._40 = var1._40 - var2._40;
   }

   public final void jou(krg var1) {
      this.j8s = this.j8s - var1.j8s;
      this.f28 = this.f28 - var1.f28;
      this.vwt = this.vwt - var1.vwt;
      this.ygn = this.ygn - var1.ygn;
      this.fno = this.fno - var1.fno;
      this.rqb = this.rqb - var1.rqb;
      this.sjv = this.sjv - var1.sjv;
      this.ttd = this.ttd - var1.ttd;
      this.zcz = this.zcz - var1.zcz;
      this.w4_ = this.w4_ - var1.w4_;
      this.fmx = this.fmx - var1.fmx;
      this.f46 = this.f46 - var1.f46;
      this.g7m = this.g7m - var1.g7m;
      this.i5l = this.i5l - var1.i5l;
      this.sk9 = this.sk9 - var1.sk9;
      this._40 = this._40 - var1._40;
   }

   public final void tmj() {
      float var1 = this.fno;
      this.fno = this.f28;
      this.f28 = var1;
      var1 = this.zcz;
      this.zcz = this.vwt;
      this.vwt = var1;
      var1 = this.g7m;
      this.g7m = this.ygn;
      this.ygn = var1;
      var1 = this.w4_;
      this.w4_ = this.sjv;
      this.sjv = var1;
      var1 = this.i5l;
      this.i5l = this.ttd;
      this.ttd = var1;
      var1 = this.sk9;
      this.sk9 = this.f46;
      this.f46 = var1;
   }

   public final void p28(krg param1) {
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
      // 05: iload 2
      // 06: ifeq a7
      // 09: aload 1
      // 0a: if_acmpeq 9f
      // 0d: goto 14
      // 10: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: aload 0
      // 15: aload 1
      // 16: getfield krg.j8s F
      // 19: putfield krg.j8s F
      // 1c: aload 0
      // 1d: aload 1
      // 1e: getfield krg.fno F
      // 21: putfield krg.f28 F
      // 24: aload 0
      // 25: aload 1
      // 26: getfield krg.zcz F
      // 29: putfield krg.vwt F
      // 2c: aload 0
      // 2d: aload 1
      // 2e: getfield krg.g7m F
      // 31: putfield krg.ygn F
      // 34: aload 0
      // 35: aload 1
      // 36: getfield krg.f28 F
      // 39: putfield krg.fno F
      // 3c: aload 0
      // 3d: aload 1
      // 3e: getfield krg.rqb F
      // 41: putfield krg.rqb F
      // 44: aload 0
      // 45: aload 1
      // 46: getfield krg.w4_ F
      // 49: putfield krg.sjv F
      // 4c: aload 0
      // 4d: aload 1
      // 4e: getfield krg.i5l F
      // 51: putfield krg.ttd F
      // 54: aload 0
      // 55: aload 1
      // 56: getfield krg.vwt F
      // 59: putfield krg.zcz F
      // 5c: aload 0
      // 5d: aload 1
      // 5e: getfield krg.sjv F
      // 61: putfield krg.w4_ F
      // 64: aload 0
      // 65: aload 1
      // 66: getfield krg.fmx F
      // 69: putfield krg.fmx F
      // 6c: aload 0
      // 6d: aload 1
      // 6e: getfield krg.sk9 F
      // 71: putfield krg.f46 F
      // 74: aload 0
      // 75: aload 1
      // 76: getfield krg.ygn F
      // 79: putfield krg.g7m F
      // 7c: aload 0
      // 7d: aload 1
      // 7e: getfield krg.ttd F
      // 81: putfield krg.i5l F
      // 84: aload 0
      // 85: aload 1
      // 86: getfield krg.f46 F
      // 89: putfield krg.sk9 F
      // 8c: aload 0
      // 8d: aload 1
      // 8e: getfield krg._40 F
      // 91: putfield krg._40 F
      // 94: iload 2
      // 95: ifne aa
      // 98: goto 9f
      // 9b: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9e: athrow
      // 9f: aload 0
      // a0: goto a7
      // a3: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a6: athrow
      // a7: invokevirtual krg.tmj ()V
      // aa: return
   }

   public final void vnh(lwt var1) {
      this.j8s = 1.0F - 2.0F * var1.nc_ * var1.nc_ - 2.0F * var1.ax5 * var1.ax5;
      this.fno = 2.0F * (var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.zcz = 2.0F * (var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.f28 = 2.0F * (var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this.rqb = 1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.ax5 * var1.ax5;
      this.w4_ = 2.0F * (var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.vwt = 2.0F * (var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.sjv = 2.0F * (var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.fmx = 1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.nc_ * var1.nc_;
      this.ygn = 0.0F;
      this.ttd = 0.0F;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void ftj(ll8 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield ll8._5i F
      // 008: aload 1
      // 009: getfield ll8._5i F
      // 00c: fmul
      // 00d: aload 1
      // 00e: getfield ll8.w5z F
      // 011: aload 1
      // 012: getfield ll8.w5z F
      // 015: fmul
      // 016: fadd
      // 017: aload 1
      // 018: getfield ll8.yz_ F
      // 01b: aload 1
      // 01c: getfield ll8.yz_ F
      // 01f: fmul
      // 020: fadd
      // 021: f2d
      // 022: invokestatic java/lang/Math.sqrt (D)D
      // 025: d2f
      // 026: fstore 3
      // 027: fload 3
      // 028: iload 2
      // 029: ifne 07d
      // 02c: f2d
      // 02d: ldc2_w 1.0E-8
      // 030: dcmpg
      // 031: ifge 073
      // 034: goto 03b
      // 037: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03a: athrow
      // 03b: aload 0
      // 03c: fconst_1
      // 03d: putfield krg.j8s F
      // 040: aload 0
      // 041: fconst_0
      // 042: putfield krg.f28 F
      // 045: aload 0
      // 046: fconst_0
      // 047: putfield krg.vwt F
      // 04a: aload 0
      // 04b: fconst_0
      // 04c: putfield krg.fno F
      // 04f: aload 0
      // 050: fconst_1
      // 051: putfield krg.rqb F
      // 054: aload 0
      // 055: fconst_0
      // 056: putfield krg.sjv F
      // 059: aload 0
      // 05a: fconst_0
      // 05b: putfield krg.zcz F
      // 05e: aload 0
      // 05f: fconst_0
      // 060: putfield krg.w4_ F
      // 063: aload 0
      // 064: fconst_1
      // 065: putfield krg.fmx F
      // 068: iload 2
      // 069: ifeq 147
      // 06c: goto 073
      // 06f: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 072: athrow
      // 073: fconst_1
      // 074: fload 3
      // 075: fdiv
      // 076: fstore 3
      // 077: aload 1
      // 078: getfield ll8._5i F
      // 07b: fload 3
      // 07c: fmul
      // 07d: fstore 4
      // 07f: aload 1
      // 080: getfield ll8.w5z F
      // 083: fload 3
      // 084: fmul
      // 085: fstore 5
      // 087: aload 1
      // 088: getfield ll8.yz_ F
      // 08b: fload 3
      // 08c: fmul
      // 08d: fstore 6
      // 08f: aload 1
      // 090: getfield ll8.b77 F
      // 093: f2d
      // 094: invokestatic java/lang/Math.sin (D)D
      // 097: d2f
      // 098: fstore 7
      // 09a: aload 1
      // 09b: getfield ll8.b77 F
      // 09e: f2d
      // 09f: invokestatic java/lang/Math.cos (D)D
      // 0a2: d2f
      // 0a3: fstore 8
      // 0a5: fconst_1
      // 0a6: fload 8
      // 0a8: fsub
      // 0a9: fstore 9
      // 0ab: fload 4
      // 0ad: fload 6
      // 0af: fmul
      // 0b0: fstore 10
      // 0b2: fload 4
      // 0b4: fload 5
      // 0b6: fmul
      // 0b7: fstore 11
      // 0b9: fload 5
      // 0bb: fload 6
      // 0bd: fmul
      // 0be: fstore 12
      // 0c0: aload 0
      // 0c1: fload 9
      // 0c3: fload 4
      // 0c5: fmul
      // 0c6: fload 4
      // 0c8: fmul
      // 0c9: fload 8
      // 0cb: fadd
      // 0cc: putfield krg.j8s F
      // 0cf: aload 0
      // 0d0: fload 9
      // 0d2: fload 11
      // 0d4: fmul
      // 0d5: fload 7
      // 0d7: fload 6
      // 0d9: fmul
      // 0da: fsub
      // 0db: putfield krg.f28 F
      // 0de: aload 0
      // 0df: fload 9
      // 0e1: fload 10
      // 0e3: fmul
      // 0e4: fload 7
      // 0e6: fload 5
      // 0e8: fmul
      // 0e9: fadd
      // 0ea: putfield krg.vwt F
      // 0ed: aload 0
      // 0ee: fload 9
      // 0f0: fload 11
      // 0f2: fmul
      // 0f3: fload 7
      // 0f5: fload 6
      // 0f7: fmul
      // 0f8: fadd
      // 0f9: putfield krg.fno F
      // 0fc: aload 0
      // 0fd: fload 9
      // 0ff: fload 5
      // 101: fmul
      // 102: fload 5
      // 104: fmul
      // 105: fload 8
      // 107: fadd
      // 108: putfield krg.rqb F
      // 10b: aload 0
      // 10c: fload 9
      // 10e: fload 12
      // 110: fmul
      // 111: fload 7
      // 113: fload 4
      // 115: fmul
      // 116: fsub
      // 117: putfield krg.sjv F
      // 11a: aload 0
      // 11b: fload 9
      // 11d: fload 10
      // 11f: fmul
      // 120: fload 7
      // 122: fload 5
      // 124: fmul
      // 125: fsub
      // 126: putfield krg.zcz F
      // 129: aload 0
      // 12a: fload 9
      // 12c: fload 12
      // 12e: fmul
      // 12f: fload 7
      // 131: fload 4
      // 133: fmul
      // 134: fadd
      // 135: putfield krg.w4_ F
      // 138: aload 0
      // 139: fload 9
      // 13b: fload 6
      // 13d: fmul
      // 13e: fload 6
      // 140: fmul
      // 141: fload 8
      // 143: fadd
      // 144: putfield krg.fmx F
      // 147: aload 0
      // 148: fconst_0
      // 149: putfield krg.ygn F
      // 14c: aload 0
      // 14d: fconst_0
      // 14e: putfield krg.ttd F
      // 151: aload 0
      // 152: fconst_0
      // 153: putfield krg.f46 F
      // 156: aload 0
      // 157: fconst_0
      // 158: putfield krg.g7m F
      // 15b: aload 0
      // 15c: fconst_0
      // 15d: putfield krg.i5l F
      // 160: aload 0
      // 161: fconst_0
      // 162: putfield krg.sk9 F
      // 165: aload 0
      // 166: fconst_1
      // 167: putfield krg._40 F
      // 16a: return
   }

   public final void wur(nbf var1) {
      this.j8s = (float)(1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe);
      this.fno = (float)(2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe));
      this.zcz = (float)(2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8));
      this.f28 = (float)(2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe));
      this.rqb = (float)(1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe);
      this.w4_ = (float)(2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme));
      this.vwt = (float)(2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8));
      this.sjv = (float)(2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme));
      this.fmx = (float)(1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8);
      this.ygn = 0.0F;
      this.ttd = 0.0F;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void r_f(lg5 param1) {
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
      // 005: getfield lg5.fs3 D
      // 008: aload 1
      // 009: getfield lg5.fs3 D
      // 00c: dmul
      // 00d: aload 1
      // 00e: getfield lg5.j4q D
      // 011: aload 1
      // 012: getfield lg5.j4q D
      // 015: dmul
      // 016: dadd
      // 017: aload 1
      // 018: getfield lg5.fki D
      // 01b: aload 1
      // 01c: getfield lg5.fki D
      // 01f: dmul
      // 020: dadd
      // 021: invokestatic java/lang/Math.sqrt (D)D
      // 024: dstore 3
      // 025: dload 3
      // 026: ldc2_w 1.0E-8
      // 029: iload 2
      // 02a: ifeq 079
      // 02d: dcmpg
      // 02e: ifge 070
      // 031: goto 038
      // 034: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 037: athrow
      // 038: aload 0
      // 039: fconst_1
      // 03a: putfield krg.j8s F
      // 03d: aload 0
      // 03e: fconst_0
      // 03f: putfield krg.f28 F
      // 042: aload 0
      // 043: fconst_0
      // 044: putfield krg.vwt F
      // 047: aload 0
      // 048: fconst_0
      // 049: putfield krg.fno F
      // 04c: aload 0
      // 04d: fconst_1
      // 04e: putfield krg.rqb F
      // 051: aload 0
      // 052: fconst_0
      // 053: putfield krg.sjv F
      // 056: aload 0
      // 057: fconst_0
      // 058: putfield krg.zcz F
      // 05b: aload 0
      // 05c: fconst_0
      // 05d: putfield krg.w4_ F
      // 060: aload 0
      // 061: fconst_1
      // 062: putfield krg.fmx F
      // 065: iload 2
      // 066: ifne 14e
      // 069: goto 070
      // 06c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06f: athrow
      // 070: dconst_1
      // 071: dload 3
      // 072: ddiv
      // 073: dstore 3
      // 074: aload 1
      // 075: getfield lg5.fs3 D
      // 078: dload 3
      // 079: dmul
      // 07a: dstore 5
      // 07c: aload 1
      // 07d: getfield lg5.j4q D
      // 080: dload 3
      // 081: dmul
      // 082: dstore 7
      // 084: aload 1
      // 085: getfield lg5.fki D
      // 088: dload 3
      // 089: dmul
      // 08a: dstore 9
      // 08c: aload 1
      // 08d: getfield lg5.ezi D
      // 090: invokestatic java/lang/Math.sin (D)D
      // 093: d2f
      // 094: fstore 11
      // 096: aload 1
      // 097: getfield lg5.ezi D
      // 09a: invokestatic java/lang/Math.cos (D)D
      // 09d: d2f
      // 09e: fstore 12
      // 0a0: fconst_1
      // 0a1: fload 12
      // 0a3: fsub
      // 0a4: fstore 13
      // 0a6: dload 5
      // 0a8: dload 9
      // 0aa: dmul
      // 0ab: d2f
      // 0ac: fstore 14
      // 0ae: dload 5
      // 0b0: dload 7
      // 0b2: dmul
      // 0b3: d2f
      // 0b4: fstore 15
      // 0b6: dload 7
      // 0b8: dload 9
      // 0ba: dmul
      // 0bb: d2f
      // 0bc: fstore 16
      // 0be: aload 0
      // 0bf: fload 13
      // 0c1: dload 5
      // 0c3: dload 5
      // 0c5: dmul
      // 0c6: d2f
      // 0c7: fmul
      // 0c8: fload 12
      // 0ca: fadd
      // 0cb: putfield krg.j8s F
      // 0ce: aload 0
      // 0cf: fload 13
      // 0d1: fload 15
      // 0d3: fmul
      // 0d4: fload 11
      // 0d6: dload 9
      // 0d8: d2f
      // 0d9: fmul
      // 0da: fsub
      // 0db: putfield krg.f28 F
      // 0de: aload 0
      // 0df: fload 13
      // 0e1: fload 14
      // 0e3: fmul
      // 0e4: fload 11
      // 0e6: dload 7
      // 0e8: d2f
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: putfield krg.vwt F
      // 0ee: aload 0
      // 0ef: fload 13
      // 0f1: fload 15
      // 0f3: fmul
      // 0f4: fload 11
      // 0f6: dload 9
      // 0f8: d2f
      // 0f9: fmul
      // 0fa: fadd
      // 0fb: putfield krg.fno F
      // 0fe: aload 0
      // 0ff: fload 13
      // 101: dload 7
      // 103: dload 7
      // 105: dmul
      // 106: d2f
      // 107: fmul
      // 108: fload 12
      // 10a: fadd
      // 10b: putfield krg.rqb F
      // 10e: aload 0
      // 10f: fload 13
      // 111: fload 16
      // 113: fmul
      // 114: fload 11
      // 116: dload 5
      // 118: d2f
      // 119: fmul
      // 11a: fsub
      // 11b: putfield krg.sjv F
      // 11e: aload 0
      // 11f: fload 13
      // 121: fload 14
      // 123: fmul
      // 124: fload 11
      // 126: dload 7
      // 128: d2f
      // 129: fmul
      // 12a: fsub
      // 12b: putfield krg.zcz F
      // 12e: aload 0
      // 12f: fload 13
      // 131: fload 16
      // 133: fmul
      // 134: fload 11
      // 136: dload 5
      // 138: d2f
      // 139: fmul
      // 13a: fadd
      // 13b: putfield krg.w4_ F
      // 13e: aload 0
      // 13f: fload 13
      // 141: dload 9
      // 143: dload 9
      // 145: dmul
      // 146: d2f
      // 147: fmul
      // 148: fload 12
      // 14a: fadd
      // 14b: putfield krg.fmx F
      // 14e: aload 0
      // 14f: fconst_0
      // 150: putfield krg.ygn F
      // 153: aload 0
      // 154: fconst_0
      // 155: putfield krg.ttd F
      // 158: aload 0
      // 159: fconst_0
      // 15a: putfield krg.f46 F
      // 15d: aload 0
      // 15e: fconst_0
      // 15f: putfield krg.g7m F
      // 162: aload 0
      // 163: fconst_0
      // 164: putfield krg.i5l F
      // 167: aload 0
      // 168: fconst_0
      // 169: putfield krg.sk9 F
      // 16c: aload 0
      // 16d: fconst_1
      // 16e: putfield krg._40 F
      // 171: return
   }

   public final void zax(nbf var1, qhn var2, double var3) {
      this.j8s = (float)(var3 * (1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe));
      this.fno = (float)(var3 * 2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe));
      this.zcz = (float)(var3 * 2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8));
      this.f28 = (float)(var3 * 2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe));
      this.rqb = (float)(var3 * (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe));
      this.w4_ = (float)(var3 * 2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme));
      this.vwt = (float)(var3 * 2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8));
      this.sjv = (float)(var3 * 2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme));
      this.fmx = (float)(var3 * (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8));
      this.ygn = (float)var2.v54;
      this.ttd = (float)var2.g0w;
      this.f46 = (float)var2.mu9;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void ps6(lwt var1, l3p var2, float var3) {
      this.j8s = var3 * (1.0F - 2.0F * var1.nc_ * var1.nc_ - 2.0F * var1.ax5 * var1.ax5);
      this.fno = var3 * 2.0F * (var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.zcz = var3 * 2.0F * (var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.f28 = var3 * 2.0F * (var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this.rqb = var3 * (1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.ax5 * var1.ax5);
      this.w4_ = var3 * 2.0F * (var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.vwt = var3 * 2.0F * (var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.sjv = var3 * 2.0F * (var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.fmx = var3 * (1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.nc_ * var1.nc_);
      this.ygn = var2.yiu;
      this.ttd = var2.q6o;
      this.f46 = var2.n_d;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void c85(onPlayerUpdate var1) {
      this.j8s = (float)var1.jf3;
      this.f28 = (float)var1.o1a;
      this.vwt = (float)var1.j_n;
      this.ygn = (float)var1.uwn;
      this.fno = (float)var1.sgz;
      this.rqb = (float)var1._6_;
      this.sjv = (float)var1.m10;
      this.ttd = (float)var1.g_y;
      this.zcz = (float)var1.ji8;
      this.w4_ = (float)var1.nqj;
      this.fmx = (float)var1.o_8;
      this.f46 = (float)var1.na1;
      this.g7m = (float)var1.ye8;
      this.i5l = (float)var1.h_8;
      this.sk9 = (float)var1.twh;
      this._40 = (float)var1.f36;
   }

   public final void s_o(krg var1) {
      this.j8s = var1.j8s;
      this.f28 = var1.f28;
      this.vwt = var1.vwt;
      this.ygn = var1.ygn;
      this.fno = var1.fno;
      this.rqb = var1.rqb;
      this.sjv = var1.sjv;
      this.ttd = var1.ttd;
      this.zcz = var1.zcz;
      this.w4_ = var1.w4_;
      this.fmx = var1.fmx;
      this.f46 = var1.f46;
      this.g7m = var1.g7m;
      this.i5l = var1.i5l;
      this.sk9 = var1.sk9;
      this._40 = var1._40;
   }

   public final void z6c(krg var1) {
      this.hlo(var1);
   }

   public final void z8j() {
      this.hlo(this);
   }

   public final void hlo(krg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 138388199559551
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 16
      // 00a: newarray 7
      // 00c: astore 5
      // 00e: bipush 16
      // 010: newarray 7
      // 012: astore 6
      // 014: bipush 4
      // 015: newarray 10
      // 017: astore 7
      // 019: aload 5
      // 01b: bipush 0
      // 01c: aload 1
      // 01d: getfield krg.j8s F
      // 020: f2d
      // 021: dastore
      // 022: aload 5
      // 024: bipush 1
      // 025: aload 1
      // 026: getfield krg.f28 F
      // 029: f2d
      // 02a: dastore
      // 02b: aload 5
      // 02d: bipush 2
      // 02e: aload 1
      // 02f: getfield krg.vwt F
      // 032: f2d
      // 033: dastore
      // 034: invokestatic OpaquePredicate.b ()I
      // 037: aload 5
      // 039: bipush 3
      // 03a: aload 1
      // 03b: getfield krg.ygn F
      // 03e: f2d
      // 03f: dastore
      // 040: aload 5
      // 042: bipush 4
      // 043: aload 1
      // 044: getfield krg.fno F
      // 047: f2d
      // 048: dastore
      // 049: aload 5
      // 04b: bipush 5
      // 04c: aload 1
      // 04d: getfield krg.rqb F
      // 050: f2d
      // 051: dastore
      // 052: aload 5
      // 054: bipush 6
      // 056: aload 1
      // 057: getfield krg.sjv F
      // 05a: f2d
      // 05b: dastore
      // 05c: aload 5
      // 05e: bipush 7
      // 060: aload 1
      // 061: getfield krg.ttd F
      // 064: f2d
      // 065: dastore
      // 066: aload 5
      // 068: bipush 8
      // 06a: aload 1
      // 06b: getfield krg.zcz F
      // 06e: f2d
      // 06f: dastore
      // 070: aload 5
      // 072: bipush 9
      // 074: aload 1
      // 075: getfield krg.w4_ F
      // 078: f2d
      // 079: dastore
      // 07a: aload 5
      // 07c: bipush 10
      // 07e: aload 1
      // 07f: getfield krg.fmx F
      // 082: f2d
      // 083: dastore
      // 084: aload 5
      // 086: bipush 11
      // 088: aload 1
      // 089: getfield krg.f46 F
      // 08c: f2d
      // 08d: dastore
      // 08e: istore 4
      // 090: aload 5
      // 092: bipush 12
      // 094: aload 1
      // 095: getfield krg.g7m F
      // 098: f2d
      // 099: dastore
      // 09a: aload 5
      // 09c: bipush 13
      // 09e: aload 1
      // 09f: getfield krg.i5l F
      // 0a2: f2d
      // 0a3: dastore
      // 0a4: aload 5
      // 0a6: bipush 14
      // 0a8: aload 1
      // 0a9: getfield krg.sk9 F
      // 0ac: f2d
      // 0ad: dastore
      // 0ae: aload 5
      // 0b0: bipush 15
      // 0b2: aload 1
      // 0b3: getfield krg._40 F
      // 0b6: f2d
      // 0b7: dastore
      // 0b8: aload 5
      // 0ba: aload 7
      // 0bc: invokestatic krg.vj4 ([D[I)Z
      // 0bf: iload 4
      // 0c1: ifeq 0ec
      // 0c4: ifne 0eb
      // 0c7: goto 0ce
      // 0ca: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cd: athrow
      // 0ce: new fgk
      // 0d1: dup
      // 0d2: sipush 31768
      // 0d5: ldc2_w 4840529929421901265
      // 0d8: lload 2
      // 0d9: lxor
      // 0da: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0e3: invokespecial fgk.<init> (Ljava/lang/String;)V
      // 0e6: athrow
      // 0e7: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ea: athrow
      // 0eb: bipush 0
      // 0ec: istore 8
      // 0ee: iload 8
      // 0f0: bipush 16
      // 0f2: if_icmpge 10f
      // 0f5: aload 6
      // 0f7: iload 8
      // 0f9: dconst_0
      // 0fa: dastore
      // 0fb: iinc 8 1
      // 0fe: iload 4
      // 100: ifeq 1c8
      // 103: iload 4
      // 105: ifne 0ee
      // 108: goto 10f
      // 10b: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: aload 6
      // 111: bipush 0
      // 112: dconst_1
      // 113: dastore
      // 114: aload 6
      // 116: bipush 5
      // 117: dconst_1
      // 118: dastore
      // 119: aload 6
      // 11b: bipush 10
      // 11d: dconst_1
      // 11e: dastore
      // 11f: aload 6
      // 121: bipush 15
      // 123: dconst_1
      // 124: dastore
      // 125: aload 5
      // 127: aload 7
      // 129: aload 6
      // 12b: invokestatic krg.ywp ([D[I[D)V
      // 12e: aload 0
      // 12f: aload 6
      // 131: bipush 0
      // 132: daload
      // 133: d2f
      // 134: putfield krg.j8s F
      // 137: aload 0
      // 138: aload 6
      // 13a: bipush 1
      // 13b: daload
      // 13c: d2f
      // 13d: putfield krg.f28 F
      // 140: aload 0
      // 141: aload 6
      // 143: bipush 2
      // 144: daload
      // 145: d2f
      // 146: putfield krg.vwt F
      // 149: aload 0
      // 14a: aload 6
      // 14c: bipush 3
      // 14d: daload
      // 14e: d2f
      // 14f: putfield krg.ygn F
      // 152: aload 0
      // 153: aload 6
      // 155: bipush 4
      // 156: daload
      // 157: d2f
      // 158: putfield krg.fno F
      // 15b: aload 0
      // 15c: aload 6
      // 15e: bipush 5
      // 15f: daload
      // 160: d2f
      // 161: putfield krg.rqb F
      // 164: aload 0
      // 165: aload 6
      // 167: bipush 6
      // 169: daload
      // 16a: d2f
      // 16b: putfield krg.sjv F
      // 16e: aload 0
      // 16f: aload 6
      // 171: bipush 7
      // 173: daload
      // 174: d2f
      // 175: putfield krg.ttd F
      // 178: aload 0
      // 179: aload 6
      // 17b: bipush 8
      // 17d: daload
      // 17e: d2f
      // 17f: putfield krg.zcz F
      // 182: aload 0
      // 183: aload 6
      // 185: bipush 9
      // 187: daload
      // 188: d2f
      // 189: putfield krg.w4_ F
      // 18c: aload 0
      // 18d: aload 6
      // 18f: bipush 10
      // 191: daload
      // 192: d2f
      // 193: putfield krg.fmx F
      // 196: aload 0
      // 197: aload 6
      // 199: bipush 11
      // 19b: daload
      // 19c: d2f
      // 19d: putfield krg.f46 F
      // 1a0: aload 0
      // 1a1: aload 6
      // 1a3: bipush 12
      // 1a5: daload
      // 1a6: d2f
      // 1a7: putfield krg.g7m F
      // 1aa: aload 0
      // 1ab: aload 6
      // 1ad: bipush 13
      // 1af: daload
      // 1b0: d2f
      // 1b1: putfield krg.i5l F
      // 1b4: aload 0
      // 1b5: aload 6
      // 1b7: bipush 14
      // 1b9: daload
      // 1ba: d2f
      // 1bb: putfield krg.sk9 F
      // 1be: aload 0
      // 1bf: aload 6
      // 1c1: bipush 15
      // 1c3: daload
      // 1c4: d2f
      // 1c5: putfield krg._40 F
      // 1c8: return
   }

   public static boolean vj4(double[] param0, int[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic krg.a J
      // 003: ldc2_w 127785224226625
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 4
      // 009: newarray 7
      // 00b: astore 5
      // 00d: bipush 0
      // 00e: istore 8
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: bipush 0
      // 014: istore 9
      // 016: bipush 4
      // 017: istore 6
      // 019: istore 4
      // 01b: iload 6
      // 01d: iinc 6 -1
      // 020: ifeq 095
      // 023: dconst_0
      // 024: dstore 10
      // 026: bipush 4
      // 027: iload 4
      // 029: ifne 096
      // 02c: istore 7
      // 02e: iload 7
      // 030: iinc 7 -1
      // 033: ifeq 06f
      // 036: aload 0
      // 037: iload 8
      // 039: iinc 8 1
      // 03c: daload
      // 03d: dstore 12
      // 03f: dload 12
      // 041: invokestatic java/lang/Math.abs (D)D
      // 044: dstore 12
      // 046: dload 12
      // 048: iload 4
      // 04a: ifne 068
      // 04d: dload 10
      // 04f: dcmpl
      // 050: iload 4
      // 052: ifne 073
      // 055: goto 05c
      // 058: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: ifle 02e
      // 05f: goto 066
      // 062: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 065: athrow
      // 066: dload 12
      // 068: dstore 10
      // 06a: iload 4
      // 06c: ifeq 02e
      // 06f: dload 10
      // 071: dconst_0
      // 072: dcmpl
      // 073: iload 4
      // 075: ifne 083
      // 078: ifne 084
      // 07b: goto 082
      // 07e: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 081: athrow
      // 082: bipush 0
      // 083: ireturn
      // 084: aload 5
      // 086: iload 9
      // 088: iinc 9 1
      // 08b: dconst_1
      // 08c: dload 10
      // 08e: ddiv
      // 08f: dastore
      // 090: iload 4
      // 092: ifeq 01b
      // 095: bipush 0
      // 096: istore 7
      // 098: bipush 0
      // 099: istore 6
      // 09b: iload 6
      // 09d: bipush 4
      // 09e: if_icmpge 2c7
      // 0a1: bipush 0
      // 0a2: iload 4
      // 0a4: ifne 2c8
      // 0a7: istore 8
      // 0a9: iload 8
      // 0ab: iload 6
      // 0ad: if_icmpge 116
      // 0b0: iload 7
      // 0b2: bipush 4
      // 0b3: iload 8
      // 0b5: imul
      // 0b6: iadd
      // 0b7: iload 6
      // 0b9: iadd
      // 0ba: istore 11
      // 0bc: aload 0
      // 0bd: iload 11
      // 0bf: daload
      // 0c0: dstore 14
      // 0c2: iload 8
      // 0c4: istore 10
      // 0c6: iload 7
      // 0c8: bipush 4
      // 0c9: iload 8
      // 0cb: imul
      // 0cc: iadd
      // 0cd: istore 12
      // 0cf: iload 7
      // 0d1: iload 6
      // 0d3: iadd
      // 0d4: iload 4
      // 0d6: ifne 09d
      // 0d9: istore 13
      // 0db: iload 10
      // 0dd: iinc 10 -1
      // 0e0: ifeq 108
      // 0e3: dload 14
      // 0e5: aload 0
      // 0e6: iload 12
      // 0e8: daload
      // 0e9: aload 0
      // 0ea: iload 13
      // 0ec: daload
      // 0ed: dmul
      // 0ee: dsub
      // 0ef: dstore 14
      // 0f1: iinc 12 1
      // 0f4: iinc 13 4
      // 0f7: iload 4
      // 0f9: ifne 111
      // 0fc: iload 4
      // 0fe: ifeq 0db
      // 101: goto 108
      // 104: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 107: athrow
      // 108: aload 0
      // 109: iload 11
      // 10b: dload 14
      // 10d: dastore
      // 10e: iinc 8 1
      // 111: iload 4
      // 113: ifeq 0a9
      // 116: dconst_0
      // 117: dstore 16
      // 119: bipush -1
      // 11a: istore 9
      // 11c: iload 6
      // 11e: istore 8
      // 120: iload 8
      // 122: bipush 4
      // 123: if_icmpge 1b4
      // 126: iload 7
      // 128: bipush 4
      // 129: iload 8
      // 12b: imul
      // 12c: iadd
      // 12d: iload 6
      // 12f: iadd
      // 130: istore 11
      // 132: aload 0
      // 133: iload 11
      // 135: daload
      // 136: dstore 14
      // 138: iload 6
      // 13a: istore 10
      // 13c: iload 7
      // 13e: bipush 4
      // 13f: iload 8
      // 141: imul
      // 142: iadd
      // 143: istore 12
      // 145: iload 7
      // 147: iload 6
      // 149: iadd
      // 14a: iload 4
      // 14c: ifne 1b6
      // 14f: istore 13
      // 151: iload 10
      // 153: iinc 10 -1
      // 156: ifeq 17e
      // 159: dload 14
      // 15b: aload 0
      // 15c: iload 12
      // 15e: daload
      // 15f: aload 0
      // 160: iload 13
      // 162: daload
      // 163: dmul
      // 164: dsub
      // 165: dstore 14
      // 167: iinc 12 1
      // 16a: iinc 13 4
      // 16d: iload 4
      // 16f: ifne 184
      // 172: iload 4
      // 174: ifeq 151
      // 177: goto 17e
      // 17a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17d: athrow
      // 17e: aload 0
      // 17f: iload 11
      // 181: dload 14
      // 183: dastore
      // 184: aload 5
      // 186: iload 8
      // 188: daload
      // 189: dload 14
      // 18b: invokestatic java/lang/Math.abs (D)D
      // 18e: dmul
      // 18f: dup2
      // 190: dstore 18
      // 192: dload 16
      // 194: dcmpl
      // 195: iload 4
      // 197: ifne 1aa
      // 19a: iflt 1ac
      // 19d: goto 1a4
      // 1a0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a3: athrow
      // 1a4: dload 18
      // 1a6: dstore 16
      // 1a8: iload 8
      // 1aa: istore 9
      // 1ac: iinc 8 1
      // 1af: iload 4
      // 1b1: ifeq 120
      // 1b4: iload 9
      // 1b6: iload 4
      // 1b8: ifne 1e4
      // 1bb: ifge 1e2
      // 1be: goto 1c5
      // 1c1: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c4: athrow
      // 1c5: new java/lang/RuntimeException
      // 1c8: dup
      // 1c9: sipush 29075
      // 1cc: ldc2_w 8839675802171135590
      // 1cf: lload 2
      // 1d0: lxor
      // 1d1: invokedynamic a (IJ)Ljava/lang/String; bsm=krg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: nop
      // 1d7: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 1da: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1dd: athrow
      // 1de: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e1: athrow
      // 1e2: iload 6
      // 1e4: iload 4
      // 1e6: ifne 25b
      // 1e9: iload 9
      // 1eb: if_icmpeq 247
      // 1ee: goto 1f5
      // 1f1: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f4: athrow
      // 1f5: bipush 4
      // 1f6: istore 10
      // 1f8: iload 7
      // 1fa: bipush 4
      // 1fb: iload 9
      // 1fd: imul
      // 1fe: iadd
      // 1ff: istore 12
      // 201: iload 7
      // 203: bipush 4
      // 204: iload 6
      // 206: imul
      // 207: iadd
      // 208: istore 13
      // 20a: iload 10
      // 20c: iinc 10 -1
      // 20f: ifeq 23d
      // 212: aload 0
      // 213: iload 12
      // 215: daload
      // 216: dstore 18
      // 218: aload 0
      // 219: iload 12
      // 21b: iinc 12 1
      // 21e: aload 0
      // 21f: iload 13
      // 221: daload
      // 222: dastore
      // 223: aload 0
      // 224: iload 13
      // 226: iinc 13 1
      // 229: dload 18
      // 22b: dastore
      // 22c: iload 4
      // 22e: ifne 24d
      // 231: iload 4
      // 233: ifeq 20a
      // 236: goto 23d
      // 239: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23c: athrow
      // 23d: aload 5
      // 23f: iload 9
      // 241: aload 5
      // 243: iload 6
      // 245: daload
      // 246: dastore
      // 247: aload 1
      // 248: iload 6
      // 24a: iload 9
      // 24c: iastore
      // 24d: aload 0
      // 24e: iload 7
      // 250: bipush 4
      // 251: iload 6
      // 253: imul
      // 254: iadd
      // 255: iload 6
      // 257: iadd
      // 258: daload
      // 259: dconst_0
      // 25a: dcmpl
      // 25b: iload 4
      // 25d: ifne 272
      // 260: ifne 270
      // 263: goto 26a
      // 266: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 269: athrow
      // 26a: bipush 0
      // 26b: ireturn
      // 26c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26f: athrow
      // 270: iload 6
      // 272: bipush 3
      // 273: if_icmpeq 2bf
      // 276: dconst_1
      // 277: aload 0
      // 278: iload 7
      // 27a: bipush 4
      // 27b: iload 6
      // 27d: imul
      // 27e: iadd
      // 27f: iload 6
      // 281: iadd
      // 282: daload
      // 283: ddiv
      // 284: dstore 18
      // 286: iload 7
      // 288: bipush 4
      // 289: iload 6
      // 28b: bipush 1
      // 28c: iadd
      // 28d: imul
      // 28e: iadd
      // 28f: iload 6
      // 291: iadd
      // 292: istore 11
      // 294: bipush 3
      // 295: iload 6
      // 297: isub
      // 298: istore 8
      // 29a: iload 8
      // 29c: iinc 8 -1
      // 29f: ifeq 2bf
      // 2a2: aload 0
      // 2a3: iload 11
      // 2a5: dup2
      // 2a6: daload
      // 2a7: dload 18
      // 2a9: dmul
      // 2aa: dastore
      // 2ab: iinc 11 4
      // 2ae: iload 4
      // 2b0: ifne 2c2
      // 2b3: iload 4
      // 2b5: ifeq 29a
      // 2b8: goto 2bf
      // 2bb: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2be: athrow
      // 2bf: iinc 6 1
      // 2c2: iload 4
      // 2c4: ifeq 09b
      // 2c7: bipush 1
      // 2c8: ireturn
   }

   public static void ywp(double[] param0, int[] param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 9
      // 003: invokestatic OpaquePredicate.c ()I
      // 006: bipush 0
      // 007: istore 8
      // 009: istore 3
      // 00a: iload 8
      // 00c: bipush 4
      // 00d: if_icmpge 17c
      // 010: iload 8
      // 012: istore 10
      // 014: bipush -1
      // 015: istore 5
      // 017: bipush 0
      // 018: istore 4
      // 01a: iload 4
      // 01c: bipush 4
      // 01d: if_icmpge 0c4
      // 020: aload 1
      // 021: iload 9
      // 023: iload 4
      // 025: iadd
      // 026: iaload
      // 027: istore 6
      // 029: aload 2
      // 02a: iload 10
      // 02c: bipush 4
      // 02d: iload 6
      // 02f: imul
      // 030: iadd
      // 031: daload
      // 032: dstore 12
      // 034: aload 2
      // 035: iload 10
      // 037: bipush 4
      // 038: iload 6
      // 03a: imul
      // 03b: iadd
      // 03c: aload 2
      // 03d: iload 10
      // 03f: bipush 4
      // 040: iload 4
      // 042: imul
      // 043: iadd
      // 044: daload
      // 045: dastore
      // 046: iload 5
      // 048: iload 3
      // 049: ifne 0c6
      // 04c: iload 3
      // 04d: ifne 0a0
      // 050: goto 057
      // 053: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: iflt 09c
      // 05a: goto 061
      // 05d: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: iload 4
      // 063: bipush 4
      // 064: imul
      // 065: istore 11
      // 067: iload 5
      // 069: istore 7
      // 06b: iload 7
      // 06d: iload 4
      // 06f: bipush 1
      // 070: isub
      // 071: if_icmpgt 0b2
      // 074: dload 12
      // 076: aload 0
      // 077: iload 11
      // 079: iload 7
      // 07b: iadd
      // 07c: daload
      // 07d: aload 2
      // 07e: iload 10
      // 080: bipush 4
      // 081: iload 7
      // 083: imul
      // 084: iadd
      // 085: daload
      // 086: dmul
      // 087: dsub
      // 088: dstore 12
      // 08a: iinc 7 1
      // 08d: iload 3
      // 08e: ifne 0c0
      // 091: iload 3
      // 092: ifeq 06b
      // 095: goto 09c
      // 098: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: dload 12
      // 09e: dconst_0
      // 09f: dcmpl
      // 0a0: iload 3
      // 0a1: ifne 0b0
      // 0a4: ifeq 0b2
      // 0a7: goto 0ae
      // 0aa: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ad: athrow
      // 0ae: iload 4
      // 0b0: istore 5
      // 0b2: aload 2
      // 0b3: iload 10
      // 0b5: bipush 4
      // 0b6: iload 4
      // 0b8: imul
      // 0b9: iadd
      // 0ba: dload 12
      // 0bc: dastore
      // 0bd: iinc 4 1
      // 0c0: iload 3
      // 0c1: ifeq 01a
      // 0c4: bipush 12
      // 0c6: istore 11
      // 0c8: aload 2
      // 0c9: iload 10
      // 0cb: bipush 12
      // 0cd: iadd
      // 0ce: dup2
      // 0cf: daload
      // 0d0: aload 0
      // 0d1: iload 11
      // 0d3: bipush 3
      // 0d4: iadd
      // 0d5: daload
      // 0d6: ddiv
      // 0d7: dastore
      // 0d8: iinc 11 -4
      // 0db: aload 2
      // 0dc: iload 10
      // 0de: bipush 8
      // 0e0: iadd
      // 0e1: aload 2
      // 0e2: iload 10
      // 0e4: bipush 8
      // 0e6: iadd
      // 0e7: daload
      // 0e8: aload 0
      // 0e9: iload 11
      // 0eb: bipush 3
      // 0ec: iadd
      // 0ed: daload
      // 0ee: aload 2
      // 0ef: iload 10
      // 0f1: bipush 12
      // 0f3: iadd
      // 0f4: daload
      // 0f5: dmul
      // 0f6: dsub
      // 0f7: aload 0
      // 0f8: iload 11
      // 0fa: bipush 2
      // 0fb: iadd
      // 0fc: daload
      // 0fd: ddiv
      // 0fe: dastore
      // 0ff: iinc 11 -4
      // 102: aload 2
      // 103: iload 10
      // 105: bipush 4
      // 106: iadd
      // 107: aload 2
      // 108: iload 10
      // 10a: bipush 4
      // 10b: iadd
      // 10c: daload
      // 10d: aload 0
      // 10e: iload 11
      // 110: bipush 2
      // 111: iadd
      // 112: daload
      // 113: aload 2
      // 114: iload 10
      // 116: bipush 8
      // 118: iadd
      // 119: daload
      // 11a: dmul
      // 11b: dsub
      // 11c: aload 0
      // 11d: iload 11
      // 11f: bipush 3
      // 120: iadd
      // 121: daload
      // 122: aload 2
      // 123: iload 10
      // 125: bipush 12
      // 127: iadd
      // 128: daload
      // 129: dmul
      // 12a: dsub
      // 12b: aload 0
      // 12c: iload 11
      // 12e: bipush 1
      // 12f: iadd
      // 130: daload
      // 131: ddiv
      // 132: dastore
      // 133: iinc 11 -4
      // 136: aload 2
      // 137: iload 10
      // 139: bipush 0
      // 13a: iadd
      // 13b: aload 2
      // 13c: iload 10
      // 13e: bipush 0
      // 13f: iadd
      // 140: daload
      // 141: aload 0
      // 142: iload 11
      // 144: bipush 1
      // 145: iadd
      // 146: daload
      // 147: aload 2
      // 148: iload 10
      // 14a: bipush 4
      // 14b: iadd
      // 14c: daload
      // 14d: dmul
      // 14e: dsub
      // 14f: aload 0
      // 150: iload 11
      // 152: bipush 2
      // 153: iadd
      // 154: daload
      // 155: aload 2
      // 156: iload 10
      // 158: bipush 8
      // 15a: iadd
      // 15b: daload
      // 15c: dmul
      // 15d: dsub
      // 15e: aload 0
      // 15f: iload 11
      // 161: bipush 3
      // 162: iadd
      // 163: daload
      // 164: aload 2
      // 165: iload 10
      // 167: bipush 12
      // 169: iadd
      // 16a: daload
      // 16b: dmul
      // 16c: dsub
      // 16d: aload 0
      // 16e: iload 11
      // 170: bipush 0
      // 171: iadd
      // 172: daload
      // 173: ddiv
      // 174: dastore
      // 175: iinc 8 1
      // 178: iload 3
      // 179: ifeq 00a
      // 17c: return
   }

   public final float jyy() {
      float var1 = this.j8s
         * (
            this.rqb * this.fmx * this._40
               + this.sjv * this.f46 * this.i5l
               + this.ttd * this.w4_ * this.sk9
               - this.ttd * this.fmx * this.i5l
               - this.rqb * this.f46 * this.sk9
               - this.sjv * this.w4_ * this._40
         );
      var1 -= this.f28
         * (
            this.fno * this.fmx * this._40
               + this.sjv * this.f46 * this.g7m
               + this.ttd * this.zcz * this.sk9
               - this.ttd * this.fmx * this.g7m
               - this.fno * this.f46 * this.sk9
               - this.sjv * this.zcz * this._40
         );
      var1 += this.vwt
         * (
            this.fno * this.w4_ * this._40
               + this.rqb * this.f46 * this.g7m
               + this.ttd * this.zcz * this.i5l
               - this.ttd * this.w4_ * this.g7m
               - this.fno * this.f46 * this.i5l
               - this.rqb * this.zcz * this._40
         );
      return var1
         - this.ygn
            * (
               this.fno * this.w4_ * this.sk9
                  + this.rqb * this.fmx * this.g7m
                  + this.sjv * this.zcz * this.i5l
                  - this.sjv * this.w4_ * this.g7m
                  - this.fno * this.fmx * this.i5l
                  - this.rqb * this.zcz * this.sk9
            );
   }

   public final void t_l(nvj var1) {
      this.j8s = var1.i2i;
      this.f28 = var1.k12;
      this.vwt = var1.xu6;
      this.ygn = 0.0F;
      this.fno = var1._id;
      this.rqb = var1.aoj;
      this.sjv = var1.zk_;
      this.ttd = 0.0F;
      this.zcz = var1.aqg;
      this.w4_ = var1.wdt;
      this.fmx = var1.jr8;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void oo0(iww var1) {
      this.j8s = (float)var1.lxb;
      this.f28 = (float)var1.y3c;
      this.vwt = (float)var1.bhd;
      this.ygn = 0.0F;
      this.fno = (float)var1.get;
      this.rqb = (float)var1.pwn;
      this.sjv = (float)var1.c84;
      this.ttd = 0.0F;
      this.zcz = (float)var1.y7q;
      this.w4_ = (float)var1._o7;
      this.fmx = (float)var1.ffq;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void t8x(float var1) {
      this.j8s = var1;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = 0.0F;
      this.fno = 0.0F;
      this.rqb = var1;
      this.sjv = 0.0F;
      this.ttd = 0.0F;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = var1;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void wb9(float[] var1) {
      this.j8s = var1[0];
      this.f28 = var1[1];
      this.vwt = var1[2];
      this.ygn = var1[3];
      this.fno = var1[4];
      this.rqb = var1[5];
      this.sjv = var1[6];
      this.ttd = var1[7];
      this.zcz = var1[8];
      this.w4_ = var1[9];
      this.fmx = var1[10];
      this.f46 = var1[11];
      this.g7m = var1[12];
      this.i5l = var1[13];
      this.sk9 = var1[14];
      this._40 = var1[15];
   }

   public final void ds6(l3p var1) {
      this.j8s = 1.0F;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = var1.yiu;
      this.fno = 0.0F;
      this.rqb = 1.0F;
      this.sjv = 0.0F;
      this.ttd = var1.q6o;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = 1.0F;
      this.f46 = var1.n_d;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void qd0(float var1, l3p var2) {
      this.j8s = var1;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = var2.yiu;
      this.fno = 0.0F;
      this.rqb = var1;
      this.sjv = 0.0F;
      this.ttd = var2.q6o;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = var1;
      this.f46 = var2.n_d;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void fgr(l3p var1, float var2) {
      this.j8s = var2;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = var2 * var1.yiu;
      this.fno = 0.0F;
      this.rqb = var2;
      this.sjv = 0.0F;
      this.ttd = var2 * var1.q6o;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = var2;
      this.f46 = var2 * var1.n_d;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void bn7(nvj var1, l3p var2, float var3) {
      this.j8s = var1.i2i * var3;
      this.f28 = var1.k12 * var3;
      this.vwt = var1.xu6 * var3;
      this.ygn = var2.yiu;
      this.fno = var1._id * var3;
      this.rqb = var1.aoj * var3;
      this.sjv = var1.zk_ * var3;
      this.ttd = var2.q6o;
      this.zcz = var1.aqg * var3;
      this.w4_ = var1.wdt * var3;
      this.fmx = var1.jr8 * var3;
      this.f46 = var2.n_d;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void am4(iww var1, qhn var2, double var3) {
      this.j8s = (float)(var1.lxb * var3);
      this.f28 = (float)(var1.y3c * var3);
      this.vwt = (float)(var1.bhd * var3);
      this.ygn = (float)var2.v54;
      this.fno = (float)(var1.get * var3);
      this.rqb = (float)(var1.pwn * var3);
      this.sjv = (float)(var1.c84 * var3);
      this.ttd = (float)var2.g0w;
      this.zcz = (float)(var1.y7q * var3);
      this.w4_ = (float)(var1._o7 * var3);
      this.fmx = (float)(var1.ffq * var3);
      this.f46 = (float)var2.mu9;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void zik(l3p var1) {
      this.ygn = var1.yiu;
      this.ttd = var1.q6o;
      this.f46 = var1.n_d;
   }

   public final void d1g(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.j8s = 1.0F;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = 0.0F;
      this.fno = 0.0F;
      this.rqb = var3;
      this.sjv = -var2;
      this.ttd = 0.0F;
      this.zcz = 0.0F;
      this.w4_ = var2;
      this.fmx = var3;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void o6g(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.j8s = var3;
      this.f28 = 0.0F;
      this.vwt = var2;
      this.ygn = 0.0F;
      this.fno = 0.0F;
      this.rqb = 1.0F;
      this.sjv = 0.0F;
      this.ttd = 0.0F;
      this.zcz = -var2;
      this.w4_ = 0.0F;
      this.fmx = var3;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void rb8(float var1) {
      float var2 = (float)Math.sin((double)var1);
      float var3 = (float)Math.cos((double)var1);
      this.j8s = var3;
      this.f28 = -var2;
      this.vwt = 0.0F;
      this.ygn = 0.0F;
      this.fno = var2;
      this.rqb = var3;
      this.sjv = 0.0F;
      this.ttd = 0.0F;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = 1.0F;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 1.0F;
   }

   public final void jmr(float var1) {
      this.j8s *= var1;
      this.f28 *= var1;
      this.vwt *= var1;
      this.ygn *= var1;
      this.fno *= var1;
      this.rqb *= var1;
      this.sjv *= var1;
      this.ttd *= var1;
      this.zcz *= var1;
      this.w4_ *= var1;
      this.fmx *= var1;
      this.f46 *= var1;
      this.g7m *= var1;
      this.i5l *= var1;
      this.sk9 *= var1;
      this._40 *= var1;
   }

   public final void csa(float var1, krg var2) {
      this.j8s = var2.j8s * var1;
      this.f28 = var2.f28 * var1;
      this.vwt = var2.vwt * var1;
      this.ygn = var2.ygn * var1;
      this.fno = var2.fno * var1;
      this.rqb = var2.rqb * var1;
      this.sjv = var2.sjv * var1;
      this.ttd = var2.ttd * var1;
      this.zcz = var2.zcz * var1;
      this.w4_ = var2.w4_ * var1;
      this.fmx = var2.fmx * var1;
      this.f46 = var2.f46 * var1;
      this.g7m = var2.g7m * var1;
      this.i5l = var2.i5l * var1;
      this.sk9 = var2.sk9 * var1;
      this._40 = var2._40 * var1;
   }

   public final void _my(krg var1) {
      float var2 = this.j8s * var1.j8s + this.f28 * var1.fno + this.vwt * var1.zcz + this.ygn * var1.g7m;
      float var3 = this.j8s * var1.f28 + this.f28 * var1.rqb + this.vwt * var1.w4_ + this.ygn * var1.i5l;
      float var4 = this.j8s * var1.vwt + this.f28 * var1.sjv + this.vwt * var1.fmx + this.ygn * var1.sk9;
      float var5 = this.j8s * var1.ygn + this.f28 * var1.ttd + this.vwt * var1.f46 + this.ygn * var1._40;
      float var6 = this.fno * var1.j8s + this.rqb * var1.fno + this.sjv * var1.zcz + this.ttd * var1.g7m;
      float var7 = this.fno * var1.f28 + this.rqb * var1.rqb + this.sjv * var1.w4_ + this.ttd * var1.i5l;
      float var8 = this.fno * var1.vwt + this.rqb * var1.sjv + this.sjv * var1.fmx + this.ttd * var1.sk9;
      float var9 = this.fno * var1.ygn + this.rqb * var1.ttd + this.sjv * var1.f46 + this.ttd * var1._40;
      float var10 = this.zcz * var1.j8s + this.w4_ * var1.fno + this.fmx * var1.zcz + this.f46 * var1.g7m;
      float var11 = this.zcz * var1.f28 + this.w4_ * var1.rqb + this.fmx * var1.w4_ + this.f46 * var1.i5l;
      float var12 = this.zcz * var1.vwt + this.w4_ * var1.sjv + this.fmx * var1.fmx + this.f46 * var1.sk9;
      float var13 = this.zcz * var1.ygn + this.w4_ * var1.ttd + this.fmx * var1.f46 + this.f46 * var1._40;
      float var14 = this.g7m * var1.j8s + this.i5l * var1.fno + this.sk9 * var1.zcz + this._40 * var1.g7m;
      float var15 = this.g7m * var1.f28 + this.i5l * var1.rqb + this.sk9 * var1.w4_ + this._40 * var1.i5l;
      float var16 = this.g7m * var1.vwt + this.i5l * var1.sjv + this.sk9 * var1.fmx + this._40 * var1.sk9;
      float var17 = this.g7m * var1.ygn + this.i5l * var1.ttd + this.sk9 * var1.f46 + this._40 * var1._40;
      this.j8s = var2;
      this.f28 = var3;
      this.vwt = var4;
      this.ygn = var5;
      this.fno = var6;
      this.rqb = var7;
      this.sjv = var8;
      this.ttd = var9;
      this.zcz = var10;
      this.w4_ = var11;
      this.fmx = var12;
      this.f46 = var13;
      this.g7m = var14;
      this.i5l = var15;
      this.sk9 = var16;
      this._40 = var17;
   }

   public final void keq(krg param1, krg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifne 2ee
      // 009: aload 1
      // 00a: if_acmpeq 2e6
      // 00d: goto 014
      // 010: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifne 2ee
      // 019: goto 020
      // 01c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield krg.j8s F
      // 030: aload 2
      // 031: getfield krg.j8s F
      // 034: fmul
      // 035: aload 1
      // 036: getfield krg.f28 F
      // 039: aload 2
      // 03a: getfield krg.fno F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield krg.vwt F
      // 043: aload 2
      // 044: getfield krg.zcz F
      // 047: fmul
      // 048: fadd
      // 049: aload 1
      // 04a: getfield krg.ygn F
      // 04d: aload 2
      // 04e: getfield krg.g7m F
      // 051: fmul
      // 052: fadd
      // 053: putfield krg.j8s F
      // 056: aload 0
      // 057: aload 1
      // 058: getfield krg.j8s F
      // 05b: aload 2
      // 05c: getfield krg.f28 F
      // 05f: fmul
      // 060: aload 1
      // 061: getfield krg.f28 F
      // 064: aload 2
      // 065: getfield krg.rqb F
      // 068: fmul
      // 069: fadd
      // 06a: aload 1
      // 06b: getfield krg.vwt F
      // 06e: aload 2
      // 06f: getfield krg.w4_ F
      // 072: fmul
      // 073: fadd
      // 074: aload 1
      // 075: getfield krg.ygn F
      // 078: aload 2
      // 079: getfield krg.i5l F
      // 07c: fmul
      // 07d: fadd
      // 07e: putfield krg.f28 F
      // 081: aload 0
      // 082: aload 1
      // 083: getfield krg.j8s F
      // 086: aload 2
      // 087: getfield krg.vwt F
      // 08a: fmul
      // 08b: aload 1
      // 08c: getfield krg.f28 F
      // 08f: aload 2
      // 090: getfield krg.sjv F
      // 093: fmul
      // 094: fadd
      // 095: aload 1
      // 096: getfield krg.vwt F
      // 099: aload 2
      // 09a: getfield krg.fmx F
      // 09d: fmul
      // 09e: fadd
      // 09f: aload 1
      // 0a0: getfield krg.ygn F
      // 0a3: aload 2
      // 0a4: getfield krg.sk9 F
      // 0a7: fmul
      // 0a8: fadd
      // 0a9: putfield krg.vwt F
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield krg.j8s F
      // 0b1: aload 2
      // 0b2: getfield krg.ygn F
      // 0b5: fmul
      // 0b6: aload 1
      // 0b7: getfield krg.f28 F
      // 0ba: aload 2
      // 0bb: getfield krg.ttd F
      // 0be: fmul
      // 0bf: fadd
      // 0c0: aload 1
      // 0c1: getfield krg.vwt F
      // 0c4: aload 2
      // 0c5: getfield krg.f46 F
      // 0c8: fmul
      // 0c9: fadd
      // 0ca: aload 1
      // 0cb: getfield krg.ygn F
      // 0ce: aload 2
      // 0cf: getfield krg._40 F
      // 0d2: fmul
      // 0d3: fadd
      // 0d4: putfield krg.ygn F
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield krg.fno F
      // 0dc: aload 2
      // 0dd: getfield krg.j8s F
      // 0e0: fmul
      // 0e1: aload 1
      // 0e2: getfield krg.rqb F
      // 0e5: aload 2
      // 0e6: getfield krg.fno F
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: aload 1
      // 0ec: getfield krg.sjv F
      // 0ef: aload 2
      // 0f0: getfield krg.zcz F
      // 0f3: fmul
      // 0f4: fadd
      // 0f5: aload 1
      // 0f6: getfield krg.ttd F
      // 0f9: aload 2
      // 0fa: getfield krg.g7m F
      // 0fd: fmul
      // 0fe: fadd
      // 0ff: putfield krg.fno F
      // 102: aload 0
      // 103: aload 1
      // 104: getfield krg.fno F
      // 107: aload 2
      // 108: getfield krg.f28 F
      // 10b: fmul
      // 10c: aload 1
      // 10d: getfield krg.rqb F
      // 110: aload 2
      // 111: getfield krg.rqb F
      // 114: fmul
      // 115: fadd
      // 116: aload 1
      // 117: getfield krg.sjv F
      // 11a: aload 2
      // 11b: getfield krg.w4_ F
      // 11e: fmul
      // 11f: fadd
      // 120: aload 1
      // 121: getfield krg.ttd F
      // 124: aload 2
      // 125: getfield krg.i5l F
      // 128: fmul
      // 129: fadd
      // 12a: putfield krg.rqb F
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield krg.fno F
      // 132: aload 2
      // 133: getfield krg.vwt F
      // 136: fmul
      // 137: aload 1
      // 138: getfield krg.rqb F
      // 13b: aload 2
      // 13c: getfield krg.sjv F
      // 13f: fmul
      // 140: fadd
      // 141: aload 1
      // 142: getfield krg.sjv F
      // 145: aload 2
      // 146: getfield krg.fmx F
      // 149: fmul
      // 14a: fadd
      // 14b: aload 1
      // 14c: getfield krg.ttd F
      // 14f: aload 2
      // 150: getfield krg.sk9 F
      // 153: fmul
      // 154: fadd
      // 155: putfield krg.sjv F
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield krg.fno F
      // 15d: aload 2
      // 15e: getfield krg.ygn F
      // 161: fmul
      // 162: aload 1
      // 163: getfield krg.rqb F
      // 166: aload 2
      // 167: getfield krg.ttd F
      // 16a: fmul
      // 16b: fadd
      // 16c: aload 1
      // 16d: getfield krg.sjv F
      // 170: aload 2
      // 171: getfield krg.f46 F
      // 174: fmul
      // 175: fadd
      // 176: aload 1
      // 177: getfield krg.ttd F
      // 17a: aload 2
      // 17b: getfield krg._40 F
      // 17e: fmul
      // 17f: fadd
      // 180: putfield krg.ttd F
      // 183: aload 0
      // 184: aload 1
      // 185: getfield krg.zcz F
      // 188: aload 2
      // 189: getfield krg.j8s F
      // 18c: fmul
      // 18d: aload 1
      // 18e: getfield krg.w4_ F
      // 191: aload 2
      // 192: getfield krg.fno F
      // 195: fmul
      // 196: fadd
      // 197: aload 1
      // 198: getfield krg.fmx F
      // 19b: aload 2
      // 19c: getfield krg.zcz F
      // 19f: fmul
      // 1a0: fadd
      // 1a1: aload 1
      // 1a2: getfield krg.f46 F
      // 1a5: aload 2
      // 1a6: getfield krg.g7m F
      // 1a9: fmul
      // 1aa: fadd
      // 1ab: putfield krg.zcz F
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield krg.zcz F
      // 1b3: aload 2
      // 1b4: getfield krg.f28 F
      // 1b7: fmul
      // 1b8: aload 1
      // 1b9: getfield krg.w4_ F
      // 1bc: aload 2
      // 1bd: getfield krg.rqb F
      // 1c0: fmul
      // 1c1: fadd
      // 1c2: aload 1
      // 1c3: getfield krg.fmx F
      // 1c6: aload 2
      // 1c7: getfield krg.w4_ F
      // 1ca: fmul
      // 1cb: fadd
      // 1cc: aload 1
      // 1cd: getfield krg.f46 F
      // 1d0: aload 2
      // 1d1: getfield krg.i5l F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: putfield krg.w4_ F
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield krg.zcz F
      // 1de: aload 2
      // 1df: getfield krg.vwt F
      // 1e2: fmul
      // 1e3: aload 1
      // 1e4: getfield krg.w4_ F
      // 1e7: aload 2
      // 1e8: getfield krg.sjv F
      // 1eb: fmul
      // 1ec: fadd
      // 1ed: aload 1
      // 1ee: getfield krg.fmx F
      // 1f1: aload 2
      // 1f2: getfield krg.fmx F
      // 1f5: fmul
      // 1f6: fadd
      // 1f7: aload 1
      // 1f8: getfield krg.f46 F
      // 1fb: aload 2
      // 1fc: getfield krg.sk9 F
      // 1ff: fmul
      // 200: fadd
      // 201: putfield krg.fmx F
      // 204: aload 0
      // 205: aload 1
      // 206: getfield krg.zcz F
      // 209: aload 2
      // 20a: getfield krg.ygn F
      // 20d: fmul
      // 20e: aload 1
      // 20f: getfield krg.w4_ F
      // 212: aload 2
      // 213: getfield krg.ttd F
      // 216: fmul
      // 217: fadd
      // 218: aload 1
      // 219: getfield krg.fmx F
      // 21c: aload 2
      // 21d: getfield krg.f46 F
      // 220: fmul
      // 221: fadd
      // 222: aload 1
      // 223: getfield krg.f46 F
      // 226: aload 2
      // 227: getfield krg._40 F
      // 22a: fmul
      // 22b: fadd
      // 22c: putfield krg.f46 F
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield krg.g7m F
      // 234: aload 2
      // 235: getfield krg.j8s F
      // 238: fmul
      // 239: aload 1
      // 23a: getfield krg.i5l F
      // 23d: aload 2
      // 23e: getfield krg.fno F
      // 241: fmul
      // 242: fadd
      // 243: aload 1
      // 244: getfield krg.sk9 F
      // 247: aload 2
      // 248: getfield krg.zcz F
      // 24b: fmul
      // 24c: fadd
      // 24d: aload 1
      // 24e: getfield krg._40 F
      // 251: aload 2
      // 252: getfield krg.g7m F
      // 255: fmul
      // 256: fadd
      // 257: putfield krg.g7m F
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield krg.g7m F
      // 25f: aload 2
      // 260: getfield krg.f28 F
      // 263: fmul
      // 264: aload 1
      // 265: getfield krg.i5l F
      // 268: aload 2
      // 269: getfield krg.rqb F
      // 26c: fmul
      // 26d: fadd
      // 26e: aload 1
      // 26f: getfield krg.sk9 F
      // 272: aload 2
      // 273: getfield krg.w4_ F
      // 276: fmul
      // 277: fadd
      // 278: aload 1
      // 279: getfield krg._40 F
      // 27c: aload 2
      // 27d: getfield krg.i5l F
      // 280: fmul
      // 281: fadd
      // 282: putfield krg.i5l F
      // 285: aload 0
      // 286: aload 1
      // 287: getfield krg.g7m F
      // 28a: aload 2
      // 28b: getfield krg.vwt F
      // 28e: fmul
      // 28f: aload 1
      // 290: getfield krg.i5l F
      // 293: aload 2
      // 294: getfield krg.sjv F
      // 297: fmul
      // 298: fadd
      // 299: aload 1
      // 29a: getfield krg.sk9 F
      // 29d: aload 2
      // 29e: getfield krg.fmx F
      // 2a1: fmul
      // 2a2: fadd
      // 2a3: aload 1
      // 2a4: getfield krg._40 F
      // 2a7: aload 2
      // 2a8: getfield krg.sk9 F
      // 2ab: fmul
      // 2ac: fadd
      // 2ad: putfield krg.sk9 F
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield krg.g7m F
      // 2b5: aload 2
      // 2b6: getfield krg.ygn F
      // 2b9: fmul
      // 2ba: aload 1
      // 2bb: getfield krg.i5l F
      // 2be: aload 2
      // 2bf: getfield krg.ttd F
      // 2c2: fmul
      // 2c3: fadd
      // 2c4: aload 1
      // 2c5: getfield krg.sk9 F
      // 2c8: aload 2
      // 2c9: getfield krg.f46 F
      // 2cc: fmul
      // 2cd: fadd
      // 2ce: aload 1
      // 2cf: getfield krg._40 F
      // 2d2: aload 2
      // 2d3: getfield krg._40 F
      // 2d6: fmul
      // 2d7: fadd
      // 2d8: putfield krg._40 F
      // 2db: iload 3
      // 2dc: ifeq 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield krg.j8s F
      // 2f1: aload 2
      // 2f2: getfield krg.j8s F
      // 2f5: fmul
      // 2f6: aload 1
      // 2f7: getfield krg.f28 F
      // 2fa: aload 2
      // 2fb: getfield krg.fno F
      // 2fe: fmul
      // 2ff: fadd
      // 300: aload 1
      // 301: getfield krg.vwt F
      // 304: aload 2
      // 305: getfield krg.zcz F
      // 308: fmul
      // 309: fadd
      // 30a: aload 1
      // 30b: getfield krg.ygn F
      // 30e: aload 2
      // 30f: getfield krg.g7m F
      // 312: fmul
      // 313: fadd
      // 314: fstore 4
      // 316: aload 1
      // 317: getfield krg.j8s F
      // 31a: aload 2
      // 31b: getfield krg.f28 F
      // 31e: fmul
      // 31f: aload 1
      // 320: getfield krg.f28 F
      // 323: aload 2
      // 324: getfield krg.rqb F
      // 327: fmul
      // 328: fadd
      // 329: aload 1
      // 32a: getfield krg.vwt F
      // 32d: aload 2
      // 32e: getfield krg.w4_ F
      // 331: fmul
      // 332: fadd
      // 333: aload 1
      // 334: getfield krg.ygn F
      // 337: aload 2
      // 338: getfield krg.i5l F
      // 33b: fmul
      // 33c: fadd
      // 33d: fstore 5
      // 33f: aload 1
      // 340: getfield krg.j8s F
      // 343: aload 2
      // 344: getfield krg.vwt F
      // 347: fmul
      // 348: aload 1
      // 349: getfield krg.f28 F
      // 34c: aload 2
      // 34d: getfield krg.sjv F
      // 350: fmul
      // 351: fadd
      // 352: aload 1
      // 353: getfield krg.vwt F
      // 356: aload 2
      // 357: getfield krg.fmx F
      // 35a: fmul
      // 35b: fadd
      // 35c: aload 1
      // 35d: getfield krg.ygn F
      // 360: aload 2
      // 361: getfield krg.sk9 F
      // 364: fmul
      // 365: fadd
      // 366: fstore 6
      // 368: aload 1
      // 369: getfield krg.j8s F
      // 36c: aload 2
      // 36d: getfield krg.ygn F
      // 370: fmul
      // 371: aload 1
      // 372: getfield krg.f28 F
      // 375: aload 2
      // 376: getfield krg.ttd F
      // 379: fmul
      // 37a: fadd
      // 37b: aload 1
      // 37c: getfield krg.vwt F
      // 37f: aload 2
      // 380: getfield krg.f46 F
      // 383: fmul
      // 384: fadd
      // 385: aload 1
      // 386: getfield krg.ygn F
      // 389: aload 2
      // 38a: getfield krg._40 F
      // 38d: fmul
      // 38e: fadd
      // 38f: fstore 7
      // 391: aload 1
      // 392: getfield krg.fno F
      // 395: aload 2
      // 396: getfield krg.j8s F
      // 399: fmul
      // 39a: aload 1
      // 39b: getfield krg.rqb F
      // 39e: aload 2
      // 39f: getfield krg.fno F
      // 3a2: fmul
      // 3a3: fadd
      // 3a4: aload 1
      // 3a5: getfield krg.sjv F
      // 3a8: aload 2
      // 3a9: getfield krg.zcz F
      // 3ac: fmul
      // 3ad: fadd
      // 3ae: aload 1
      // 3af: getfield krg.ttd F
      // 3b2: aload 2
      // 3b3: getfield krg.g7m F
      // 3b6: fmul
      // 3b7: fadd
      // 3b8: fstore 8
      // 3ba: aload 1
      // 3bb: getfield krg.fno F
      // 3be: aload 2
      // 3bf: getfield krg.f28 F
      // 3c2: fmul
      // 3c3: aload 1
      // 3c4: getfield krg.rqb F
      // 3c7: aload 2
      // 3c8: getfield krg.rqb F
      // 3cb: fmul
      // 3cc: fadd
      // 3cd: aload 1
      // 3ce: getfield krg.sjv F
      // 3d1: aload 2
      // 3d2: getfield krg.w4_ F
      // 3d5: fmul
      // 3d6: fadd
      // 3d7: aload 1
      // 3d8: getfield krg.ttd F
      // 3db: aload 2
      // 3dc: getfield krg.i5l F
      // 3df: fmul
      // 3e0: fadd
      // 3e1: fstore 9
      // 3e3: aload 1
      // 3e4: getfield krg.fno F
      // 3e7: aload 2
      // 3e8: getfield krg.vwt F
      // 3eb: fmul
      // 3ec: aload 1
      // 3ed: getfield krg.rqb F
      // 3f0: aload 2
      // 3f1: getfield krg.sjv F
      // 3f4: fmul
      // 3f5: fadd
      // 3f6: aload 1
      // 3f7: getfield krg.sjv F
      // 3fa: aload 2
      // 3fb: getfield krg.fmx F
      // 3fe: fmul
      // 3ff: fadd
      // 400: aload 1
      // 401: getfield krg.ttd F
      // 404: aload 2
      // 405: getfield krg.sk9 F
      // 408: fmul
      // 409: fadd
      // 40a: fstore 10
      // 40c: aload 1
      // 40d: getfield krg.fno F
      // 410: aload 2
      // 411: getfield krg.ygn F
      // 414: fmul
      // 415: aload 1
      // 416: getfield krg.rqb F
      // 419: aload 2
      // 41a: getfield krg.ttd F
      // 41d: fmul
      // 41e: fadd
      // 41f: aload 1
      // 420: getfield krg.sjv F
      // 423: aload 2
      // 424: getfield krg.f46 F
      // 427: fmul
      // 428: fadd
      // 429: aload 1
      // 42a: getfield krg.ttd F
      // 42d: aload 2
      // 42e: getfield krg._40 F
      // 431: fmul
      // 432: fadd
      // 433: fstore 11
      // 435: aload 1
      // 436: getfield krg.zcz F
      // 439: aload 2
      // 43a: getfield krg.j8s F
      // 43d: fmul
      // 43e: aload 1
      // 43f: getfield krg.w4_ F
      // 442: aload 2
      // 443: getfield krg.fno F
      // 446: fmul
      // 447: fadd
      // 448: aload 1
      // 449: getfield krg.fmx F
      // 44c: aload 2
      // 44d: getfield krg.zcz F
      // 450: fmul
      // 451: fadd
      // 452: aload 1
      // 453: getfield krg.f46 F
      // 456: aload 2
      // 457: getfield krg.g7m F
      // 45a: fmul
      // 45b: fadd
      // 45c: fstore 12
      // 45e: aload 1
      // 45f: getfield krg.zcz F
      // 462: aload 2
      // 463: getfield krg.f28 F
      // 466: fmul
      // 467: aload 1
      // 468: getfield krg.w4_ F
      // 46b: aload 2
      // 46c: getfield krg.rqb F
      // 46f: fmul
      // 470: fadd
      // 471: aload 1
      // 472: getfield krg.fmx F
      // 475: aload 2
      // 476: getfield krg.w4_ F
      // 479: fmul
      // 47a: fadd
      // 47b: aload 1
      // 47c: getfield krg.f46 F
      // 47f: aload 2
      // 480: getfield krg.i5l F
      // 483: fmul
      // 484: fadd
      // 485: fstore 13
      // 487: aload 1
      // 488: getfield krg.zcz F
      // 48b: aload 2
      // 48c: getfield krg.vwt F
      // 48f: fmul
      // 490: aload 1
      // 491: getfield krg.w4_ F
      // 494: aload 2
      // 495: getfield krg.sjv F
      // 498: fmul
      // 499: fadd
      // 49a: aload 1
      // 49b: getfield krg.fmx F
      // 49e: aload 2
      // 49f: getfield krg.fmx F
      // 4a2: fmul
      // 4a3: fadd
      // 4a4: aload 1
      // 4a5: getfield krg.f46 F
      // 4a8: aload 2
      // 4a9: getfield krg.sk9 F
      // 4ac: fmul
      // 4ad: fadd
      // 4ae: fstore 14
      // 4b0: aload 1
      // 4b1: getfield krg.zcz F
      // 4b4: aload 2
      // 4b5: getfield krg.ygn F
      // 4b8: fmul
      // 4b9: aload 1
      // 4ba: getfield krg.w4_ F
      // 4bd: aload 2
      // 4be: getfield krg.ttd F
      // 4c1: fmul
      // 4c2: fadd
      // 4c3: aload 1
      // 4c4: getfield krg.fmx F
      // 4c7: aload 2
      // 4c8: getfield krg.f46 F
      // 4cb: fmul
      // 4cc: fadd
      // 4cd: aload 1
      // 4ce: getfield krg.f46 F
      // 4d1: aload 2
      // 4d2: getfield krg._40 F
      // 4d5: fmul
      // 4d6: fadd
      // 4d7: fstore 15
      // 4d9: aload 1
      // 4da: getfield krg.g7m F
      // 4dd: aload 2
      // 4de: getfield krg.j8s F
      // 4e1: fmul
      // 4e2: aload 1
      // 4e3: getfield krg.i5l F
      // 4e6: aload 2
      // 4e7: getfield krg.fno F
      // 4ea: fmul
      // 4eb: fadd
      // 4ec: aload 1
      // 4ed: getfield krg.sk9 F
      // 4f0: aload 2
      // 4f1: getfield krg.zcz F
      // 4f4: fmul
      // 4f5: fadd
      // 4f6: aload 1
      // 4f7: getfield krg._40 F
      // 4fa: aload 2
      // 4fb: getfield krg.g7m F
      // 4fe: fmul
      // 4ff: fadd
      // 500: fstore 16
      // 502: aload 1
      // 503: getfield krg.g7m F
      // 506: aload 2
      // 507: getfield krg.f28 F
      // 50a: fmul
      // 50b: aload 1
      // 50c: getfield krg.i5l F
      // 50f: aload 2
      // 510: getfield krg.rqb F
      // 513: fmul
      // 514: fadd
      // 515: aload 1
      // 516: getfield krg.sk9 F
      // 519: aload 2
      // 51a: getfield krg.w4_ F
      // 51d: fmul
      // 51e: fadd
      // 51f: aload 1
      // 520: getfield krg._40 F
      // 523: aload 2
      // 524: getfield krg.i5l F
      // 527: fmul
      // 528: fadd
      // 529: fstore 17
      // 52b: aload 1
      // 52c: getfield krg.g7m F
      // 52f: aload 2
      // 530: getfield krg.vwt F
      // 533: fmul
      // 534: aload 1
      // 535: getfield krg.i5l F
      // 538: aload 2
      // 539: getfield krg.sjv F
      // 53c: fmul
      // 53d: fadd
      // 53e: aload 1
      // 53f: getfield krg.sk9 F
      // 542: aload 2
      // 543: getfield krg.fmx F
      // 546: fmul
      // 547: fadd
      // 548: aload 1
      // 549: getfield krg._40 F
      // 54c: aload 2
      // 54d: getfield krg.sk9 F
      // 550: fmul
      // 551: fadd
      // 552: fstore 18
      // 554: aload 1
      // 555: getfield krg.g7m F
      // 558: aload 2
      // 559: getfield krg.ygn F
      // 55c: fmul
      // 55d: aload 1
      // 55e: getfield krg.i5l F
      // 561: aload 2
      // 562: getfield krg.ttd F
      // 565: fmul
      // 566: fadd
      // 567: aload 1
      // 568: getfield krg.sk9 F
      // 56b: aload 2
      // 56c: getfield krg.f46 F
      // 56f: fmul
      // 570: fadd
      // 571: aload 1
      // 572: getfield krg._40 F
      // 575: aload 2
      // 576: getfield krg._40 F
      // 579: fmul
      // 57a: fadd
      // 57b: fstore 19
      // 57d: aload 0
      // 57e: fload 4
      // 580: putfield krg.j8s F
      // 583: aload 0
      // 584: fload 5
      // 586: putfield krg.f28 F
      // 589: aload 0
      // 58a: fload 6
      // 58c: putfield krg.vwt F
      // 58f: aload 0
      // 590: fload 7
      // 592: putfield krg.ygn F
      // 595: aload 0
      // 596: fload 8
      // 598: putfield krg.fno F
      // 59b: aload 0
      // 59c: fload 9
      // 59e: putfield krg.rqb F
      // 5a1: aload 0
      // 5a2: fload 10
      // 5a4: putfield krg.sjv F
      // 5a7: aload 0
      // 5a8: fload 11
      // 5aa: putfield krg.ttd F
      // 5ad: aload 0
      // 5ae: fload 12
      // 5b0: putfield krg.zcz F
      // 5b3: aload 0
      // 5b4: fload 13
      // 5b6: putfield krg.w4_ F
      // 5b9: aload 0
      // 5ba: fload 14
      // 5bc: putfield krg.fmx F
      // 5bf: aload 0
      // 5c0: fload 15
      // 5c2: putfield krg.f46 F
      // 5c5: aload 0
      // 5c6: fload 16
      // 5c8: putfield krg.g7m F
      // 5cb: aload 0
      // 5cc: fload 17
      // 5ce: putfield krg.i5l F
      // 5d1: aload 0
      // 5d2: fload 18
      // 5d4: putfield krg.sk9 F
      // 5d7: aload 0
      // 5d8: fload 19
      // 5da: putfield krg._40 F
      // 5dd: return
   }

   public final void cj1(krg param1, krg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 2ee
      // 009: aload 1
      // 00a: if_acmpeq 2e6
      // 00d: goto 014
      // 010: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 2ee
      // 019: goto 020
      // 01c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield krg.j8s F
      // 030: aload 2
      // 031: getfield krg.j8s F
      // 034: fmul
      // 035: aload 1
      // 036: getfield krg.fno F
      // 039: aload 2
      // 03a: getfield krg.f28 F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield krg.zcz F
      // 043: aload 2
      // 044: getfield krg.vwt F
      // 047: fmul
      // 048: fadd
      // 049: aload 1
      // 04a: getfield krg.g7m F
      // 04d: aload 2
      // 04e: getfield krg.ygn F
      // 051: fmul
      // 052: fadd
      // 053: putfield krg.j8s F
      // 056: aload 0
      // 057: aload 1
      // 058: getfield krg.j8s F
      // 05b: aload 2
      // 05c: getfield krg.fno F
      // 05f: fmul
      // 060: aload 1
      // 061: getfield krg.fno F
      // 064: aload 2
      // 065: getfield krg.rqb F
      // 068: fmul
      // 069: fadd
      // 06a: aload 1
      // 06b: getfield krg.zcz F
      // 06e: aload 2
      // 06f: getfield krg.sjv F
      // 072: fmul
      // 073: fadd
      // 074: aload 1
      // 075: getfield krg.g7m F
      // 078: aload 2
      // 079: getfield krg.ttd F
      // 07c: fmul
      // 07d: fadd
      // 07e: putfield krg.f28 F
      // 081: aload 0
      // 082: aload 1
      // 083: getfield krg.j8s F
      // 086: aload 2
      // 087: getfield krg.zcz F
      // 08a: fmul
      // 08b: aload 1
      // 08c: getfield krg.fno F
      // 08f: aload 2
      // 090: getfield krg.w4_ F
      // 093: fmul
      // 094: fadd
      // 095: aload 1
      // 096: getfield krg.zcz F
      // 099: aload 2
      // 09a: getfield krg.fmx F
      // 09d: fmul
      // 09e: fadd
      // 09f: aload 1
      // 0a0: getfield krg.g7m F
      // 0a3: aload 2
      // 0a4: getfield krg.f46 F
      // 0a7: fmul
      // 0a8: fadd
      // 0a9: putfield krg.vwt F
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield krg.j8s F
      // 0b1: aload 2
      // 0b2: getfield krg.g7m F
      // 0b5: fmul
      // 0b6: aload 1
      // 0b7: getfield krg.fno F
      // 0ba: aload 2
      // 0bb: getfield krg.i5l F
      // 0be: fmul
      // 0bf: fadd
      // 0c0: aload 1
      // 0c1: getfield krg.zcz F
      // 0c4: aload 2
      // 0c5: getfield krg.sk9 F
      // 0c8: fmul
      // 0c9: fadd
      // 0ca: aload 1
      // 0cb: getfield krg.g7m F
      // 0ce: aload 2
      // 0cf: getfield krg._40 F
      // 0d2: fmul
      // 0d3: fadd
      // 0d4: putfield krg.ygn F
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield krg.f28 F
      // 0dc: aload 2
      // 0dd: getfield krg.j8s F
      // 0e0: fmul
      // 0e1: aload 1
      // 0e2: getfield krg.rqb F
      // 0e5: aload 2
      // 0e6: getfield krg.f28 F
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: aload 1
      // 0ec: getfield krg.w4_ F
      // 0ef: aload 2
      // 0f0: getfield krg.vwt F
      // 0f3: fmul
      // 0f4: fadd
      // 0f5: aload 1
      // 0f6: getfield krg.i5l F
      // 0f9: aload 2
      // 0fa: getfield krg.ygn F
      // 0fd: fmul
      // 0fe: fadd
      // 0ff: putfield krg.fno F
      // 102: aload 0
      // 103: aload 1
      // 104: getfield krg.f28 F
      // 107: aload 2
      // 108: getfield krg.fno F
      // 10b: fmul
      // 10c: aload 1
      // 10d: getfield krg.rqb F
      // 110: aload 2
      // 111: getfield krg.rqb F
      // 114: fmul
      // 115: fadd
      // 116: aload 1
      // 117: getfield krg.w4_ F
      // 11a: aload 2
      // 11b: getfield krg.sjv F
      // 11e: fmul
      // 11f: fadd
      // 120: aload 1
      // 121: getfield krg.i5l F
      // 124: aload 2
      // 125: getfield krg.ttd F
      // 128: fmul
      // 129: fadd
      // 12a: putfield krg.rqb F
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield krg.f28 F
      // 132: aload 2
      // 133: getfield krg.zcz F
      // 136: fmul
      // 137: aload 1
      // 138: getfield krg.rqb F
      // 13b: aload 2
      // 13c: getfield krg.w4_ F
      // 13f: fmul
      // 140: fadd
      // 141: aload 1
      // 142: getfield krg.w4_ F
      // 145: aload 2
      // 146: getfield krg.fmx F
      // 149: fmul
      // 14a: fadd
      // 14b: aload 1
      // 14c: getfield krg.i5l F
      // 14f: aload 2
      // 150: getfield krg.f46 F
      // 153: fmul
      // 154: fadd
      // 155: putfield krg.sjv F
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield krg.f28 F
      // 15d: aload 2
      // 15e: getfield krg.g7m F
      // 161: fmul
      // 162: aload 1
      // 163: getfield krg.rqb F
      // 166: aload 2
      // 167: getfield krg.i5l F
      // 16a: fmul
      // 16b: fadd
      // 16c: aload 1
      // 16d: getfield krg.w4_ F
      // 170: aload 2
      // 171: getfield krg.sk9 F
      // 174: fmul
      // 175: fadd
      // 176: aload 1
      // 177: getfield krg.i5l F
      // 17a: aload 2
      // 17b: getfield krg._40 F
      // 17e: fmul
      // 17f: fadd
      // 180: putfield krg.ttd F
      // 183: aload 0
      // 184: aload 1
      // 185: getfield krg.vwt F
      // 188: aload 2
      // 189: getfield krg.j8s F
      // 18c: fmul
      // 18d: aload 1
      // 18e: getfield krg.sjv F
      // 191: aload 2
      // 192: getfield krg.f28 F
      // 195: fmul
      // 196: fadd
      // 197: aload 1
      // 198: getfield krg.fmx F
      // 19b: aload 2
      // 19c: getfield krg.vwt F
      // 19f: fmul
      // 1a0: fadd
      // 1a1: aload 1
      // 1a2: getfield krg.sk9 F
      // 1a5: aload 2
      // 1a6: getfield krg.ygn F
      // 1a9: fmul
      // 1aa: fadd
      // 1ab: putfield krg.zcz F
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield krg.vwt F
      // 1b3: aload 2
      // 1b4: getfield krg.fno F
      // 1b7: fmul
      // 1b8: aload 1
      // 1b9: getfield krg.sjv F
      // 1bc: aload 2
      // 1bd: getfield krg.rqb F
      // 1c0: fmul
      // 1c1: fadd
      // 1c2: aload 1
      // 1c3: getfield krg.fmx F
      // 1c6: aload 2
      // 1c7: getfield krg.sjv F
      // 1ca: fmul
      // 1cb: fadd
      // 1cc: aload 1
      // 1cd: getfield krg.sk9 F
      // 1d0: aload 2
      // 1d1: getfield krg.ttd F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: putfield krg.w4_ F
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield krg.vwt F
      // 1de: aload 2
      // 1df: getfield krg.zcz F
      // 1e2: fmul
      // 1e3: aload 1
      // 1e4: getfield krg.sjv F
      // 1e7: aload 2
      // 1e8: getfield krg.w4_ F
      // 1eb: fmul
      // 1ec: fadd
      // 1ed: aload 1
      // 1ee: getfield krg.fmx F
      // 1f1: aload 2
      // 1f2: getfield krg.fmx F
      // 1f5: fmul
      // 1f6: fadd
      // 1f7: aload 1
      // 1f8: getfield krg.sk9 F
      // 1fb: aload 2
      // 1fc: getfield krg.f46 F
      // 1ff: fmul
      // 200: fadd
      // 201: putfield krg.fmx F
      // 204: aload 0
      // 205: aload 1
      // 206: getfield krg.vwt F
      // 209: aload 2
      // 20a: getfield krg.g7m F
      // 20d: fmul
      // 20e: aload 1
      // 20f: getfield krg.sjv F
      // 212: aload 2
      // 213: getfield krg.i5l F
      // 216: fmul
      // 217: fadd
      // 218: aload 1
      // 219: getfield krg.fmx F
      // 21c: aload 2
      // 21d: getfield krg.sk9 F
      // 220: fmul
      // 221: fadd
      // 222: aload 1
      // 223: getfield krg.sk9 F
      // 226: aload 2
      // 227: getfield krg._40 F
      // 22a: fmul
      // 22b: fadd
      // 22c: putfield krg.f46 F
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield krg.ygn F
      // 234: aload 2
      // 235: getfield krg.j8s F
      // 238: fmul
      // 239: aload 1
      // 23a: getfield krg.ttd F
      // 23d: aload 2
      // 23e: getfield krg.f28 F
      // 241: fmul
      // 242: fadd
      // 243: aload 1
      // 244: getfield krg.f46 F
      // 247: aload 2
      // 248: getfield krg.vwt F
      // 24b: fmul
      // 24c: fadd
      // 24d: aload 1
      // 24e: getfield krg._40 F
      // 251: aload 2
      // 252: getfield krg.ygn F
      // 255: fmul
      // 256: fadd
      // 257: putfield krg.g7m F
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield krg.ygn F
      // 25f: aload 2
      // 260: getfield krg.fno F
      // 263: fmul
      // 264: aload 1
      // 265: getfield krg.ttd F
      // 268: aload 2
      // 269: getfield krg.rqb F
      // 26c: fmul
      // 26d: fadd
      // 26e: aload 1
      // 26f: getfield krg.f46 F
      // 272: aload 2
      // 273: getfield krg.sjv F
      // 276: fmul
      // 277: fadd
      // 278: aload 1
      // 279: getfield krg._40 F
      // 27c: aload 2
      // 27d: getfield krg.ttd F
      // 280: fmul
      // 281: fadd
      // 282: putfield krg.i5l F
      // 285: aload 0
      // 286: aload 1
      // 287: getfield krg.ygn F
      // 28a: aload 2
      // 28b: getfield krg.zcz F
      // 28e: fmul
      // 28f: aload 1
      // 290: getfield krg.ttd F
      // 293: aload 2
      // 294: getfield krg.w4_ F
      // 297: fmul
      // 298: fadd
      // 299: aload 1
      // 29a: getfield krg.f46 F
      // 29d: aload 2
      // 29e: getfield krg.fmx F
      // 2a1: fmul
      // 2a2: fadd
      // 2a3: aload 1
      // 2a4: getfield krg._40 F
      // 2a7: aload 2
      // 2a8: getfield krg.f46 F
      // 2ab: fmul
      // 2ac: fadd
      // 2ad: putfield krg.sk9 F
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield krg.ygn F
      // 2b5: aload 2
      // 2b6: getfield krg.g7m F
      // 2b9: fmul
      // 2ba: aload 1
      // 2bb: getfield krg.ttd F
      // 2be: aload 2
      // 2bf: getfield krg.i5l F
      // 2c2: fmul
      // 2c3: fadd
      // 2c4: aload 1
      // 2c5: getfield krg.f46 F
      // 2c8: aload 2
      // 2c9: getfield krg.sk9 F
      // 2cc: fmul
      // 2cd: fadd
      // 2ce: aload 1
      // 2cf: getfield krg._40 F
      // 2d2: aload 2
      // 2d3: getfield krg._40 F
      // 2d6: fmul
      // 2d7: fadd
      // 2d8: putfield krg._40 F
      // 2db: iload 3
      // 2dc: ifne 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield krg.j8s F
      // 2f1: aload 2
      // 2f2: getfield krg.j8s F
      // 2f5: fmul
      // 2f6: aload 1
      // 2f7: getfield krg.fno F
      // 2fa: aload 2
      // 2fb: getfield krg.f28 F
      // 2fe: fmul
      // 2ff: fadd
      // 300: aload 1
      // 301: getfield krg.zcz F
      // 304: aload 2
      // 305: getfield krg.vwt F
      // 308: fmul
      // 309: fadd
      // 30a: aload 1
      // 30b: getfield krg.g7m F
      // 30e: aload 2
      // 30f: getfield krg.ygn F
      // 312: fmul
      // 313: fadd
      // 314: fstore 4
      // 316: aload 1
      // 317: getfield krg.j8s F
      // 31a: aload 2
      // 31b: getfield krg.fno F
      // 31e: fmul
      // 31f: aload 1
      // 320: getfield krg.fno F
      // 323: aload 2
      // 324: getfield krg.rqb F
      // 327: fmul
      // 328: fadd
      // 329: aload 1
      // 32a: getfield krg.zcz F
      // 32d: aload 2
      // 32e: getfield krg.sjv F
      // 331: fmul
      // 332: fadd
      // 333: aload 1
      // 334: getfield krg.g7m F
      // 337: aload 2
      // 338: getfield krg.ttd F
      // 33b: fmul
      // 33c: fadd
      // 33d: fstore 5
      // 33f: aload 1
      // 340: getfield krg.j8s F
      // 343: aload 2
      // 344: getfield krg.zcz F
      // 347: fmul
      // 348: aload 1
      // 349: getfield krg.fno F
      // 34c: aload 2
      // 34d: getfield krg.w4_ F
      // 350: fmul
      // 351: fadd
      // 352: aload 1
      // 353: getfield krg.zcz F
      // 356: aload 2
      // 357: getfield krg.fmx F
      // 35a: fmul
      // 35b: fadd
      // 35c: aload 1
      // 35d: getfield krg.g7m F
      // 360: aload 2
      // 361: getfield krg.f46 F
      // 364: fmul
      // 365: fadd
      // 366: fstore 6
      // 368: aload 1
      // 369: getfield krg.j8s F
      // 36c: aload 2
      // 36d: getfield krg.g7m F
      // 370: fmul
      // 371: aload 1
      // 372: getfield krg.fno F
      // 375: aload 2
      // 376: getfield krg.i5l F
      // 379: fmul
      // 37a: fadd
      // 37b: aload 1
      // 37c: getfield krg.zcz F
      // 37f: aload 2
      // 380: getfield krg.sk9 F
      // 383: fmul
      // 384: fadd
      // 385: aload 1
      // 386: getfield krg.g7m F
      // 389: aload 2
      // 38a: getfield krg._40 F
      // 38d: fmul
      // 38e: fadd
      // 38f: fstore 7
      // 391: aload 1
      // 392: getfield krg.f28 F
      // 395: aload 2
      // 396: getfield krg.j8s F
      // 399: fmul
      // 39a: aload 1
      // 39b: getfield krg.rqb F
      // 39e: aload 2
      // 39f: getfield krg.f28 F
      // 3a2: fmul
      // 3a3: fadd
      // 3a4: aload 1
      // 3a5: getfield krg.w4_ F
      // 3a8: aload 2
      // 3a9: getfield krg.vwt F
      // 3ac: fmul
      // 3ad: fadd
      // 3ae: aload 1
      // 3af: getfield krg.i5l F
      // 3b2: aload 2
      // 3b3: getfield krg.ygn F
      // 3b6: fmul
      // 3b7: fadd
      // 3b8: fstore 8
      // 3ba: aload 1
      // 3bb: getfield krg.f28 F
      // 3be: aload 2
      // 3bf: getfield krg.fno F
      // 3c2: fmul
      // 3c3: aload 1
      // 3c4: getfield krg.rqb F
      // 3c7: aload 2
      // 3c8: getfield krg.rqb F
      // 3cb: fmul
      // 3cc: fadd
      // 3cd: aload 1
      // 3ce: getfield krg.w4_ F
      // 3d1: aload 2
      // 3d2: getfield krg.sjv F
      // 3d5: fmul
      // 3d6: fadd
      // 3d7: aload 1
      // 3d8: getfield krg.i5l F
      // 3db: aload 2
      // 3dc: getfield krg.ttd F
      // 3df: fmul
      // 3e0: fadd
      // 3e1: fstore 9
      // 3e3: aload 1
      // 3e4: getfield krg.f28 F
      // 3e7: aload 2
      // 3e8: getfield krg.zcz F
      // 3eb: fmul
      // 3ec: aload 1
      // 3ed: getfield krg.rqb F
      // 3f0: aload 2
      // 3f1: getfield krg.w4_ F
      // 3f4: fmul
      // 3f5: fadd
      // 3f6: aload 1
      // 3f7: getfield krg.w4_ F
      // 3fa: aload 2
      // 3fb: getfield krg.fmx F
      // 3fe: fmul
      // 3ff: fadd
      // 400: aload 1
      // 401: getfield krg.i5l F
      // 404: aload 2
      // 405: getfield krg.f46 F
      // 408: fmul
      // 409: fadd
      // 40a: fstore 10
      // 40c: aload 1
      // 40d: getfield krg.f28 F
      // 410: aload 2
      // 411: getfield krg.g7m F
      // 414: fmul
      // 415: aload 1
      // 416: getfield krg.rqb F
      // 419: aload 2
      // 41a: getfield krg.i5l F
      // 41d: fmul
      // 41e: fadd
      // 41f: aload 1
      // 420: getfield krg.w4_ F
      // 423: aload 2
      // 424: getfield krg.sk9 F
      // 427: fmul
      // 428: fadd
      // 429: aload 1
      // 42a: getfield krg.i5l F
      // 42d: aload 2
      // 42e: getfield krg._40 F
      // 431: fmul
      // 432: fadd
      // 433: fstore 11
      // 435: aload 1
      // 436: getfield krg.vwt F
      // 439: aload 2
      // 43a: getfield krg.j8s F
      // 43d: fmul
      // 43e: aload 1
      // 43f: getfield krg.sjv F
      // 442: aload 2
      // 443: getfield krg.f28 F
      // 446: fmul
      // 447: fadd
      // 448: aload 1
      // 449: getfield krg.fmx F
      // 44c: aload 2
      // 44d: getfield krg.vwt F
      // 450: fmul
      // 451: fadd
      // 452: aload 1
      // 453: getfield krg.sk9 F
      // 456: aload 2
      // 457: getfield krg.ygn F
      // 45a: fmul
      // 45b: fadd
      // 45c: fstore 12
      // 45e: aload 1
      // 45f: getfield krg.vwt F
      // 462: aload 2
      // 463: getfield krg.fno F
      // 466: fmul
      // 467: aload 1
      // 468: getfield krg.sjv F
      // 46b: aload 2
      // 46c: getfield krg.rqb F
      // 46f: fmul
      // 470: fadd
      // 471: aload 1
      // 472: getfield krg.fmx F
      // 475: aload 2
      // 476: getfield krg.sjv F
      // 479: fmul
      // 47a: fadd
      // 47b: aload 1
      // 47c: getfield krg.sk9 F
      // 47f: aload 2
      // 480: getfield krg.ttd F
      // 483: fmul
      // 484: fadd
      // 485: fstore 13
      // 487: aload 1
      // 488: getfield krg.vwt F
      // 48b: aload 2
      // 48c: getfield krg.zcz F
      // 48f: fmul
      // 490: aload 1
      // 491: getfield krg.sjv F
      // 494: aload 2
      // 495: getfield krg.w4_ F
      // 498: fmul
      // 499: fadd
      // 49a: aload 1
      // 49b: getfield krg.fmx F
      // 49e: aload 2
      // 49f: getfield krg.fmx F
      // 4a2: fmul
      // 4a3: fadd
      // 4a4: aload 1
      // 4a5: getfield krg.sk9 F
      // 4a8: aload 2
      // 4a9: getfield krg.f46 F
      // 4ac: fmul
      // 4ad: fadd
      // 4ae: fstore 14
      // 4b0: aload 1
      // 4b1: getfield krg.vwt F
      // 4b4: aload 2
      // 4b5: getfield krg.g7m F
      // 4b8: fmul
      // 4b9: aload 1
      // 4ba: getfield krg.sjv F
      // 4bd: aload 2
      // 4be: getfield krg.i5l F
      // 4c1: fmul
      // 4c2: fadd
      // 4c3: aload 1
      // 4c4: getfield krg.fmx F
      // 4c7: aload 2
      // 4c8: getfield krg.sk9 F
      // 4cb: fmul
      // 4cc: fadd
      // 4cd: aload 1
      // 4ce: getfield krg.sk9 F
      // 4d1: aload 2
      // 4d2: getfield krg._40 F
      // 4d5: fmul
      // 4d6: fadd
      // 4d7: fstore 15
      // 4d9: aload 1
      // 4da: getfield krg.ygn F
      // 4dd: aload 2
      // 4de: getfield krg.j8s F
      // 4e1: fmul
      // 4e2: aload 1
      // 4e3: getfield krg.ttd F
      // 4e6: aload 2
      // 4e7: getfield krg.f28 F
      // 4ea: fmul
      // 4eb: fadd
      // 4ec: aload 1
      // 4ed: getfield krg.f46 F
      // 4f0: aload 2
      // 4f1: getfield krg.vwt F
      // 4f4: fmul
      // 4f5: fadd
      // 4f6: aload 1
      // 4f7: getfield krg._40 F
      // 4fa: aload 2
      // 4fb: getfield krg.ygn F
      // 4fe: fmul
      // 4ff: fadd
      // 500: fstore 16
      // 502: aload 1
      // 503: getfield krg.ygn F
      // 506: aload 2
      // 507: getfield krg.fno F
      // 50a: fmul
      // 50b: aload 1
      // 50c: getfield krg.ttd F
      // 50f: aload 2
      // 510: getfield krg.rqb F
      // 513: fmul
      // 514: fadd
      // 515: aload 1
      // 516: getfield krg.f46 F
      // 519: aload 2
      // 51a: getfield krg.sjv F
      // 51d: fmul
      // 51e: fadd
      // 51f: aload 1
      // 520: getfield krg._40 F
      // 523: aload 2
      // 524: getfield krg.ttd F
      // 527: fmul
      // 528: fadd
      // 529: fstore 17
      // 52b: aload 1
      // 52c: getfield krg.ygn F
      // 52f: aload 2
      // 530: getfield krg.zcz F
      // 533: fmul
      // 534: aload 1
      // 535: getfield krg.ttd F
      // 538: aload 2
      // 539: getfield krg.w4_ F
      // 53c: fmul
      // 53d: fadd
      // 53e: aload 1
      // 53f: getfield krg.f46 F
      // 542: aload 2
      // 543: getfield krg.fmx F
      // 546: fmul
      // 547: fadd
      // 548: aload 1
      // 549: getfield krg._40 F
      // 54c: aload 2
      // 54d: getfield krg.f46 F
      // 550: fmul
      // 551: fadd
      // 552: fstore 18
      // 554: aload 1
      // 555: getfield krg.ygn F
      // 558: aload 2
      // 559: getfield krg.g7m F
      // 55c: fmul
      // 55d: aload 1
      // 55e: getfield krg.ttd F
      // 561: aload 2
      // 562: getfield krg.i5l F
      // 565: fmul
      // 566: fadd
      // 567: aload 1
      // 568: getfield krg.f46 F
      // 56b: aload 2
      // 56c: getfield krg.sk9 F
      // 56f: fmul
      // 570: fadd
      // 571: aload 1
      // 572: getfield krg._40 F
      // 575: aload 2
      // 576: getfield krg._40 F
      // 579: fmul
      // 57a: fadd
      // 57b: fstore 19
      // 57d: aload 0
      // 57e: fload 4
      // 580: putfield krg.j8s F
      // 583: aload 0
      // 584: fload 5
      // 586: putfield krg.f28 F
      // 589: aload 0
      // 58a: fload 6
      // 58c: putfield krg.vwt F
      // 58f: aload 0
      // 590: fload 7
      // 592: putfield krg.ygn F
      // 595: aload 0
      // 596: fload 8
      // 598: putfield krg.fno F
      // 59b: aload 0
      // 59c: fload 9
      // 59e: putfield krg.rqb F
      // 5a1: aload 0
      // 5a2: fload 10
      // 5a4: putfield krg.sjv F
      // 5a7: aload 0
      // 5a8: fload 11
      // 5aa: putfield krg.ttd F
      // 5ad: aload 0
      // 5ae: fload 12
      // 5b0: putfield krg.zcz F
      // 5b3: aload 0
      // 5b4: fload 13
      // 5b6: putfield krg.w4_ F
      // 5b9: aload 0
      // 5ba: fload 14
      // 5bc: putfield krg.fmx F
      // 5bf: aload 0
      // 5c0: fload 15
      // 5c2: putfield krg.f46 F
      // 5c5: aload 0
      // 5c6: fload 16
      // 5c8: putfield krg.g7m F
      // 5cb: aload 0
      // 5cc: fload 17
      // 5ce: putfield krg.i5l F
      // 5d1: aload 0
      // 5d2: fload 18
      // 5d4: putfield krg.sk9 F
      // 5d7: aload 0
      // 5d8: fload 19
      // 5da: putfield krg._40 F
      // 5dd: return
   }

   public final void s49(krg param1, krg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 2ee
      // 009: aload 1
      // 00a: if_acmpeq 2e6
      // 00d: goto 014
      // 010: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 2ee
      // 019: goto 020
      // 01c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield krg.j8s F
      // 030: aload 2
      // 031: getfield krg.j8s F
      // 034: fmul
      // 035: aload 1
      // 036: getfield krg.f28 F
      // 039: aload 2
      // 03a: getfield krg.f28 F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield krg.vwt F
      // 043: aload 2
      // 044: getfield krg.vwt F
      // 047: fmul
      // 048: fadd
      // 049: aload 1
      // 04a: getfield krg.ygn F
      // 04d: aload 2
      // 04e: getfield krg.ygn F
      // 051: fmul
      // 052: fadd
      // 053: putfield krg.j8s F
      // 056: aload 0
      // 057: aload 1
      // 058: getfield krg.j8s F
      // 05b: aload 2
      // 05c: getfield krg.fno F
      // 05f: fmul
      // 060: aload 1
      // 061: getfield krg.f28 F
      // 064: aload 2
      // 065: getfield krg.rqb F
      // 068: fmul
      // 069: fadd
      // 06a: aload 1
      // 06b: getfield krg.vwt F
      // 06e: aload 2
      // 06f: getfield krg.sjv F
      // 072: fmul
      // 073: fadd
      // 074: aload 1
      // 075: getfield krg.ygn F
      // 078: aload 2
      // 079: getfield krg.ttd F
      // 07c: fmul
      // 07d: fadd
      // 07e: putfield krg.f28 F
      // 081: aload 0
      // 082: aload 1
      // 083: getfield krg.j8s F
      // 086: aload 2
      // 087: getfield krg.zcz F
      // 08a: fmul
      // 08b: aload 1
      // 08c: getfield krg.f28 F
      // 08f: aload 2
      // 090: getfield krg.w4_ F
      // 093: fmul
      // 094: fadd
      // 095: aload 1
      // 096: getfield krg.vwt F
      // 099: aload 2
      // 09a: getfield krg.fmx F
      // 09d: fmul
      // 09e: fadd
      // 09f: aload 1
      // 0a0: getfield krg.ygn F
      // 0a3: aload 2
      // 0a4: getfield krg.f46 F
      // 0a7: fmul
      // 0a8: fadd
      // 0a9: putfield krg.vwt F
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield krg.j8s F
      // 0b1: aload 2
      // 0b2: getfield krg.g7m F
      // 0b5: fmul
      // 0b6: aload 1
      // 0b7: getfield krg.f28 F
      // 0ba: aload 2
      // 0bb: getfield krg.i5l F
      // 0be: fmul
      // 0bf: fadd
      // 0c0: aload 1
      // 0c1: getfield krg.vwt F
      // 0c4: aload 2
      // 0c5: getfield krg.sk9 F
      // 0c8: fmul
      // 0c9: fadd
      // 0ca: aload 1
      // 0cb: getfield krg.ygn F
      // 0ce: aload 2
      // 0cf: getfield krg._40 F
      // 0d2: fmul
      // 0d3: fadd
      // 0d4: putfield krg.ygn F
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield krg.fno F
      // 0dc: aload 2
      // 0dd: getfield krg.j8s F
      // 0e0: fmul
      // 0e1: aload 1
      // 0e2: getfield krg.rqb F
      // 0e5: aload 2
      // 0e6: getfield krg.f28 F
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: aload 1
      // 0ec: getfield krg.sjv F
      // 0ef: aload 2
      // 0f0: getfield krg.vwt F
      // 0f3: fmul
      // 0f4: fadd
      // 0f5: aload 1
      // 0f6: getfield krg.ttd F
      // 0f9: aload 2
      // 0fa: getfield krg.ygn F
      // 0fd: fmul
      // 0fe: fadd
      // 0ff: putfield krg.fno F
      // 102: aload 0
      // 103: aload 1
      // 104: getfield krg.fno F
      // 107: aload 2
      // 108: getfield krg.fno F
      // 10b: fmul
      // 10c: aload 1
      // 10d: getfield krg.rqb F
      // 110: aload 2
      // 111: getfield krg.rqb F
      // 114: fmul
      // 115: fadd
      // 116: aload 1
      // 117: getfield krg.sjv F
      // 11a: aload 2
      // 11b: getfield krg.sjv F
      // 11e: fmul
      // 11f: fadd
      // 120: aload 1
      // 121: getfield krg.ttd F
      // 124: aload 2
      // 125: getfield krg.ttd F
      // 128: fmul
      // 129: fadd
      // 12a: putfield krg.rqb F
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield krg.fno F
      // 132: aload 2
      // 133: getfield krg.zcz F
      // 136: fmul
      // 137: aload 1
      // 138: getfield krg.rqb F
      // 13b: aload 2
      // 13c: getfield krg.w4_ F
      // 13f: fmul
      // 140: fadd
      // 141: aload 1
      // 142: getfield krg.sjv F
      // 145: aload 2
      // 146: getfield krg.fmx F
      // 149: fmul
      // 14a: fadd
      // 14b: aload 1
      // 14c: getfield krg.ttd F
      // 14f: aload 2
      // 150: getfield krg.f46 F
      // 153: fmul
      // 154: fadd
      // 155: putfield krg.sjv F
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield krg.fno F
      // 15d: aload 2
      // 15e: getfield krg.g7m F
      // 161: fmul
      // 162: aload 1
      // 163: getfield krg.rqb F
      // 166: aload 2
      // 167: getfield krg.i5l F
      // 16a: fmul
      // 16b: fadd
      // 16c: aload 1
      // 16d: getfield krg.sjv F
      // 170: aload 2
      // 171: getfield krg.sk9 F
      // 174: fmul
      // 175: fadd
      // 176: aload 1
      // 177: getfield krg.ttd F
      // 17a: aload 2
      // 17b: getfield krg._40 F
      // 17e: fmul
      // 17f: fadd
      // 180: putfield krg.ttd F
      // 183: aload 0
      // 184: aload 1
      // 185: getfield krg.zcz F
      // 188: aload 2
      // 189: getfield krg.j8s F
      // 18c: fmul
      // 18d: aload 1
      // 18e: getfield krg.w4_ F
      // 191: aload 2
      // 192: getfield krg.f28 F
      // 195: fmul
      // 196: fadd
      // 197: aload 1
      // 198: getfield krg.fmx F
      // 19b: aload 2
      // 19c: getfield krg.vwt F
      // 19f: fmul
      // 1a0: fadd
      // 1a1: aload 1
      // 1a2: getfield krg.f46 F
      // 1a5: aload 2
      // 1a6: getfield krg.ygn F
      // 1a9: fmul
      // 1aa: fadd
      // 1ab: putfield krg.zcz F
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield krg.zcz F
      // 1b3: aload 2
      // 1b4: getfield krg.fno F
      // 1b7: fmul
      // 1b8: aload 1
      // 1b9: getfield krg.w4_ F
      // 1bc: aload 2
      // 1bd: getfield krg.rqb F
      // 1c0: fmul
      // 1c1: fadd
      // 1c2: aload 1
      // 1c3: getfield krg.fmx F
      // 1c6: aload 2
      // 1c7: getfield krg.sjv F
      // 1ca: fmul
      // 1cb: fadd
      // 1cc: aload 1
      // 1cd: getfield krg.f46 F
      // 1d0: aload 2
      // 1d1: getfield krg.ttd F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: putfield krg.w4_ F
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield krg.zcz F
      // 1de: aload 2
      // 1df: getfield krg.zcz F
      // 1e2: fmul
      // 1e3: aload 1
      // 1e4: getfield krg.w4_ F
      // 1e7: aload 2
      // 1e8: getfield krg.w4_ F
      // 1eb: fmul
      // 1ec: fadd
      // 1ed: aload 1
      // 1ee: getfield krg.fmx F
      // 1f1: aload 2
      // 1f2: getfield krg.fmx F
      // 1f5: fmul
      // 1f6: fadd
      // 1f7: aload 1
      // 1f8: getfield krg.f46 F
      // 1fb: aload 2
      // 1fc: getfield krg.f46 F
      // 1ff: fmul
      // 200: fadd
      // 201: putfield krg.fmx F
      // 204: aload 0
      // 205: aload 1
      // 206: getfield krg.zcz F
      // 209: aload 2
      // 20a: getfield krg.g7m F
      // 20d: fmul
      // 20e: aload 1
      // 20f: getfield krg.w4_ F
      // 212: aload 2
      // 213: getfield krg.i5l F
      // 216: fmul
      // 217: fadd
      // 218: aload 1
      // 219: getfield krg.fmx F
      // 21c: aload 2
      // 21d: getfield krg.sk9 F
      // 220: fmul
      // 221: fadd
      // 222: aload 1
      // 223: getfield krg.f46 F
      // 226: aload 2
      // 227: getfield krg._40 F
      // 22a: fmul
      // 22b: fadd
      // 22c: putfield krg.f46 F
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield krg.g7m F
      // 234: aload 2
      // 235: getfield krg.j8s F
      // 238: fmul
      // 239: aload 1
      // 23a: getfield krg.i5l F
      // 23d: aload 2
      // 23e: getfield krg.f28 F
      // 241: fmul
      // 242: fadd
      // 243: aload 1
      // 244: getfield krg.sk9 F
      // 247: aload 2
      // 248: getfield krg.vwt F
      // 24b: fmul
      // 24c: fadd
      // 24d: aload 1
      // 24e: getfield krg._40 F
      // 251: aload 2
      // 252: getfield krg.ygn F
      // 255: fmul
      // 256: fadd
      // 257: putfield krg.g7m F
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield krg.g7m F
      // 25f: aload 2
      // 260: getfield krg.fno F
      // 263: fmul
      // 264: aload 1
      // 265: getfield krg.i5l F
      // 268: aload 2
      // 269: getfield krg.rqb F
      // 26c: fmul
      // 26d: fadd
      // 26e: aload 1
      // 26f: getfield krg.sk9 F
      // 272: aload 2
      // 273: getfield krg.sjv F
      // 276: fmul
      // 277: fadd
      // 278: aload 1
      // 279: getfield krg._40 F
      // 27c: aload 2
      // 27d: getfield krg.ttd F
      // 280: fmul
      // 281: fadd
      // 282: putfield krg.i5l F
      // 285: aload 0
      // 286: aload 1
      // 287: getfield krg.g7m F
      // 28a: aload 2
      // 28b: getfield krg.zcz F
      // 28e: fmul
      // 28f: aload 1
      // 290: getfield krg.i5l F
      // 293: aload 2
      // 294: getfield krg.w4_ F
      // 297: fmul
      // 298: fadd
      // 299: aload 1
      // 29a: getfield krg.sk9 F
      // 29d: aload 2
      // 29e: getfield krg.fmx F
      // 2a1: fmul
      // 2a2: fadd
      // 2a3: aload 1
      // 2a4: getfield krg._40 F
      // 2a7: aload 2
      // 2a8: getfield krg.f46 F
      // 2ab: fmul
      // 2ac: fadd
      // 2ad: putfield krg.sk9 F
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield krg.g7m F
      // 2b5: aload 2
      // 2b6: getfield krg.g7m F
      // 2b9: fmul
      // 2ba: aload 1
      // 2bb: getfield krg.i5l F
      // 2be: aload 2
      // 2bf: getfield krg.i5l F
      // 2c2: fmul
      // 2c3: fadd
      // 2c4: aload 1
      // 2c5: getfield krg.sk9 F
      // 2c8: aload 2
      // 2c9: getfield krg.sk9 F
      // 2cc: fmul
      // 2cd: fadd
      // 2ce: aload 1
      // 2cf: getfield krg._40 F
      // 2d2: aload 2
      // 2d3: getfield krg._40 F
      // 2d6: fmul
      // 2d7: fadd
      // 2d8: putfield krg._40 F
      // 2db: iload 3
      // 2dc: ifne 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield krg.j8s F
      // 2f1: aload 2
      // 2f2: getfield krg.j8s F
      // 2f5: fmul
      // 2f6: aload 1
      // 2f7: getfield krg.f28 F
      // 2fa: aload 2
      // 2fb: getfield krg.f28 F
      // 2fe: fmul
      // 2ff: fadd
      // 300: aload 1
      // 301: getfield krg.vwt F
      // 304: aload 2
      // 305: getfield krg.vwt F
      // 308: fmul
      // 309: fadd
      // 30a: aload 1
      // 30b: getfield krg.ygn F
      // 30e: aload 2
      // 30f: getfield krg.ygn F
      // 312: fmul
      // 313: fadd
      // 314: fstore 4
      // 316: aload 1
      // 317: getfield krg.j8s F
      // 31a: aload 2
      // 31b: getfield krg.fno F
      // 31e: fmul
      // 31f: aload 1
      // 320: getfield krg.f28 F
      // 323: aload 2
      // 324: getfield krg.rqb F
      // 327: fmul
      // 328: fadd
      // 329: aload 1
      // 32a: getfield krg.vwt F
      // 32d: aload 2
      // 32e: getfield krg.sjv F
      // 331: fmul
      // 332: fadd
      // 333: aload 1
      // 334: getfield krg.ygn F
      // 337: aload 2
      // 338: getfield krg.ttd F
      // 33b: fmul
      // 33c: fadd
      // 33d: fstore 5
      // 33f: aload 1
      // 340: getfield krg.j8s F
      // 343: aload 2
      // 344: getfield krg.zcz F
      // 347: fmul
      // 348: aload 1
      // 349: getfield krg.f28 F
      // 34c: aload 2
      // 34d: getfield krg.w4_ F
      // 350: fmul
      // 351: fadd
      // 352: aload 1
      // 353: getfield krg.vwt F
      // 356: aload 2
      // 357: getfield krg.fmx F
      // 35a: fmul
      // 35b: fadd
      // 35c: aload 1
      // 35d: getfield krg.ygn F
      // 360: aload 2
      // 361: getfield krg.f46 F
      // 364: fmul
      // 365: fadd
      // 366: fstore 6
      // 368: aload 1
      // 369: getfield krg.j8s F
      // 36c: aload 2
      // 36d: getfield krg.g7m F
      // 370: fmul
      // 371: aload 1
      // 372: getfield krg.f28 F
      // 375: aload 2
      // 376: getfield krg.i5l F
      // 379: fmul
      // 37a: fadd
      // 37b: aload 1
      // 37c: getfield krg.vwt F
      // 37f: aload 2
      // 380: getfield krg.sk9 F
      // 383: fmul
      // 384: fadd
      // 385: aload 1
      // 386: getfield krg.ygn F
      // 389: aload 2
      // 38a: getfield krg._40 F
      // 38d: fmul
      // 38e: fadd
      // 38f: fstore 7
      // 391: aload 1
      // 392: getfield krg.fno F
      // 395: aload 2
      // 396: getfield krg.j8s F
      // 399: fmul
      // 39a: aload 1
      // 39b: getfield krg.rqb F
      // 39e: aload 2
      // 39f: getfield krg.f28 F
      // 3a2: fmul
      // 3a3: fadd
      // 3a4: aload 1
      // 3a5: getfield krg.sjv F
      // 3a8: aload 2
      // 3a9: getfield krg.vwt F
      // 3ac: fmul
      // 3ad: fadd
      // 3ae: aload 1
      // 3af: getfield krg.ttd F
      // 3b2: aload 2
      // 3b3: getfield krg.ygn F
      // 3b6: fmul
      // 3b7: fadd
      // 3b8: fstore 8
      // 3ba: aload 1
      // 3bb: getfield krg.fno F
      // 3be: aload 2
      // 3bf: getfield krg.fno F
      // 3c2: fmul
      // 3c3: aload 1
      // 3c4: getfield krg.rqb F
      // 3c7: aload 2
      // 3c8: getfield krg.rqb F
      // 3cb: fmul
      // 3cc: fadd
      // 3cd: aload 1
      // 3ce: getfield krg.sjv F
      // 3d1: aload 2
      // 3d2: getfield krg.sjv F
      // 3d5: fmul
      // 3d6: fadd
      // 3d7: aload 1
      // 3d8: getfield krg.ttd F
      // 3db: aload 2
      // 3dc: getfield krg.ttd F
      // 3df: fmul
      // 3e0: fadd
      // 3e1: fstore 9
      // 3e3: aload 1
      // 3e4: getfield krg.fno F
      // 3e7: aload 2
      // 3e8: getfield krg.zcz F
      // 3eb: fmul
      // 3ec: aload 1
      // 3ed: getfield krg.rqb F
      // 3f0: aload 2
      // 3f1: getfield krg.w4_ F
      // 3f4: fmul
      // 3f5: fadd
      // 3f6: aload 1
      // 3f7: getfield krg.sjv F
      // 3fa: aload 2
      // 3fb: getfield krg.fmx F
      // 3fe: fmul
      // 3ff: fadd
      // 400: aload 1
      // 401: getfield krg.ttd F
      // 404: aload 2
      // 405: getfield krg.f46 F
      // 408: fmul
      // 409: fadd
      // 40a: fstore 10
      // 40c: aload 1
      // 40d: getfield krg.fno F
      // 410: aload 2
      // 411: getfield krg.g7m F
      // 414: fmul
      // 415: aload 1
      // 416: getfield krg.rqb F
      // 419: aload 2
      // 41a: getfield krg.i5l F
      // 41d: fmul
      // 41e: fadd
      // 41f: aload 1
      // 420: getfield krg.sjv F
      // 423: aload 2
      // 424: getfield krg.sk9 F
      // 427: fmul
      // 428: fadd
      // 429: aload 1
      // 42a: getfield krg.ttd F
      // 42d: aload 2
      // 42e: getfield krg._40 F
      // 431: fmul
      // 432: fadd
      // 433: fstore 11
      // 435: aload 1
      // 436: getfield krg.zcz F
      // 439: aload 2
      // 43a: getfield krg.j8s F
      // 43d: fmul
      // 43e: aload 1
      // 43f: getfield krg.w4_ F
      // 442: aload 2
      // 443: getfield krg.f28 F
      // 446: fmul
      // 447: fadd
      // 448: aload 1
      // 449: getfield krg.fmx F
      // 44c: aload 2
      // 44d: getfield krg.vwt F
      // 450: fmul
      // 451: fadd
      // 452: aload 1
      // 453: getfield krg.f46 F
      // 456: aload 2
      // 457: getfield krg.ygn F
      // 45a: fmul
      // 45b: fadd
      // 45c: fstore 12
      // 45e: aload 1
      // 45f: getfield krg.zcz F
      // 462: aload 2
      // 463: getfield krg.fno F
      // 466: fmul
      // 467: aload 1
      // 468: getfield krg.w4_ F
      // 46b: aload 2
      // 46c: getfield krg.rqb F
      // 46f: fmul
      // 470: fadd
      // 471: aload 1
      // 472: getfield krg.fmx F
      // 475: aload 2
      // 476: getfield krg.sjv F
      // 479: fmul
      // 47a: fadd
      // 47b: aload 1
      // 47c: getfield krg.f46 F
      // 47f: aload 2
      // 480: getfield krg.ttd F
      // 483: fmul
      // 484: fadd
      // 485: fstore 13
      // 487: aload 1
      // 488: getfield krg.zcz F
      // 48b: aload 2
      // 48c: getfield krg.zcz F
      // 48f: fmul
      // 490: aload 1
      // 491: getfield krg.w4_ F
      // 494: aload 2
      // 495: getfield krg.w4_ F
      // 498: fmul
      // 499: fadd
      // 49a: aload 1
      // 49b: getfield krg.fmx F
      // 49e: aload 2
      // 49f: getfield krg.fmx F
      // 4a2: fmul
      // 4a3: fadd
      // 4a4: aload 1
      // 4a5: getfield krg.f46 F
      // 4a8: aload 2
      // 4a9: getfield krg.f46 F
      // 4ac: fmul
      // 4ad: fadd
      // 4ae: fstore 14
      // 4b0: aload 1
      // 4b1: getfield krg.zcz F
      // 4b4: aload 2
      // 4b5: getfield krg.g7m F
      // 4b8: fmul
      // 4b9: aload 1
      // 4ba: getfield krg.w4_ F
      // 4bd: aload 2
      // 4be: getfield krg.i5l F
      // 4c1: fmul
      // 4c2: fadd
      // 4c3: aload 1
      // 4c4: getfield krg.fmx F
      // 4c7: aload 2
      // 4c8: getfield krg.sk9 F
      // 4cb: fmul
      // 4cc: fadd
      // 4cd: aload 1
      // 4ce: getfield krg.f46 F
      // 4d1: aload 2
      // 4d2: getfield krg._40 F
      // 4d5: fmul
      // 4d6: fadd
      // 4d7: fstore 15
      // 4d9: aload 1
      // 4da: getfield krg.g7m F
      // 4dd: aload 2
      // 4de: getfield krg.j8s F
      // 4e1: fmul
      // 4e2: aload 1
      // 4e3: getfield krg.i5l F
      // 4e6: aload 2
      // 4e7: getfield krg.f28 F
      // 4ea: fmul
      // 4eb: fadd
      // 4ec: aload 1
      // 4ed: getfield krg.sk9 F
      // 4f0: aload 2
      // 4f1: getfield krg.vwt F
      // 4f4: fmul
      // 4f5: fadd
      // 4f6: aload 1
      // 4f7: getfield krg._40 F
      // 4fa: aload 2
      // 4fb: getfield krg.ygn F
      // 4fe: fmul
      // 4ff: fadd
      // 500: fstore 16
      // 502: aload 1
      // 503: getfield krg.g7m F
      // 506: aload 2
      // 507: getfield krg.fno F
      // 50a: fmul
      // 50b: aload 1
      // 50c: getfield krg.i5l F
      // 50f: aload 2
      // 510: getfield krg.rqb F
      // 513: fmul
      // 514: fadd
      // 515: aload 1
      // 516: getfield krg.sk9 F
      // 519: aload 2
      // 51a: getfield krg.sjv F
      // 51d: fmul
      // 51e: fadd
      // 51f: aload 1
      // 520: getfield krg._40 F
      // 523: aload 2
      // 524: getfield krg.ttd F
      // 527: fmul
      // 528: fadd
      // 529: fstore 17
      // 52b: aload 1
      // 52c: getfield krg.g7m F
      // 52f: aload 2
      // 530: getfield krg.zcz F
      // 533: fmul
      // 534: aload 1
      // 535: getfield krg.i5l F
      // 538: aload 2
      // 539: getfield krg.w4_ F
      // 53c: fmul
      // 53d: fadd
      // 53e: aload 1
      // 53f: getfield krg.sk9 F
      // 542: aload 2
      // 543: getfield krg.fmx F
      // 546: fmul
      // 547: fadd
      // 548: aload 1
      // 549: getfield krg._40 F
      // 54c: aload 2
      // 54d: getfield krg.f46 F
      // 550: fmul
      // 551: fadd
      // 552: fstore 18
      // 554: aload 1
      // 555: getfield krg.g7m F
      // 558: aload 2
      // 559: getfield krg.g7m F
      // 55c: fmul
      // 55d: aload 1
      // 55e: getfield krg.i5l F
      // 561: aload 2
      // 562: getfield krg.i5l F
      // 565: fmul
      // 566: fadd
      // 567: aload 1
      // 568: getfield krg.sk9 F
      // 56b: aload 2
      // 56c: getfield krg.sk9 F
      // 56f: fmul
      // 570: fadd
      // 571: aload 1
      // 572: getfield krg._40 F
      // 575: aload 2
      // 576: getfield krg._40 F
      // 579: fmul
      // 57a: fadd
      // 57b: fstore 19
      // 57d: aload 0
      // 57e: fload 4
      // 580: putfield krg.j8s F
      // 583: aload 0
      // 584: fload 5
      // 586: putfield krg.f28 F
      // 589: aload 0
      // 58a: fload 6
      // 58c: putfield krg.vwt F
      // 58f: aload 0
      // 590: fload 7
      // 592: putfield krg.ygn F
      // 595: aload 0
      // 596: fload 8
      // 598: putfield krg.fno F
      // 59b: aload 0
      // 59c: fload 9
      // 59e: putfield krg.rqb F
      // 5a1: aload 0
      // 5a2: fload 10
      // 5a4: putfield krg.sjv F
      // 5a7: aload 0
      // 5a8: fload 11
      // 5aa: putfield krg.ttd F
      // 5ad: aload 0
      // 5ae: fload 12
      // 5b0: putfield krg.zcz F
      // 5b3: aload 0
      // 5b4: fload 13
      // 5b6: putfield krg.w4_ F
      // 5b9: aload 0
      // 5ba: fload 14
      // 5bc: putfield krg.fmx F
      // 5bf: aload 0
      // 5c0: fload 15
      // 5c2: putfield krg.f46 F
      // 5c5: aload 0
      // 5c6: fload 16
      // 5c8: putfield krg.g7m F
      // 5cb: aload 0
      // 5cc: fload 17
      // 5ce: putfield krg.i5l F
      // 5d1: aload 0
      // 5d2: fload 18
      // 5d4: putfield krg.sk9 F
      // 5d7: aload 0
      // 5d8: fload 19
      // 5da: putfield krg._40 F
      // 5dd: return
   }

   public final void ltk(krg param1, krg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: iload 3
      // 006: ifeq 2ee
      // 009: aload 1
      // 00a: if_acmpeq 2e6
      // 00d: goto 014
      // 010: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 2ee
      // 019: goto 020
      // 01c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield krg.j8s F
      // 030: aload 2
      // 031: getfield krg.j8s F
      // 034: fmul
      // 035: aload 1
      // 036: getfield krg.fno F
      // 039: aload 2
      // 03a: getfield krg.fno F
      // 03d: fmul
      // 03e: fadd
      // 03f: aload 1
      // 040: getfield krg.zcz F
      // 043: aload 2
      // 044: getfield krg.zcz F
      // 047: fmul
      // 048: fadd
      // 049: aload 1
      // 04a: getfield krg.g7m F
      // 04d: aload 2
      // 04e: getfield krg.g7m F
      // 051: fmul
      // 052: fadd
      // 053: putfield krg.j8s F
      // 056: aload 0
      // 057: aload 1
      // 058: getfield krg.j8s F
      // 05b: aload 2
      // 05c: getfield krg.f28 F
      // 05f: fmul
      // 060: aload 1
      // 061: getfield krg.fno F
      // 064: aload 2
      // 065: getfield krg.rqb F
      // 068: fmul
      // 069: fadd
      // 06a: aload 1
      // 06b: getfield krg.zcz F
      // 06e: aload 2
      // 06f: getfield krg.w4_ F
      // 072: fmul
      // 073: fadd
      // 074: aload 1
      // 075: getfield krg.g7m F
      // 078: aload 2
      // 079: getfield krg.i5l F
      // 07c: fmul
      // 07d: fadd
      // 07e: putfield krg.f28 F
      // 081: aload 0
      // 082: aload 1
      // 083: getfield krg.j8s F
      // 086: aload 2
      // 087: getfield krg.vwt F
      // 08a: fmul
      // 08b: aload 1
      // 08c: getfield krg.fno F
      // 08f: aload 2
      // 090: getfield krg.sjv F
      // 093: fmul
      // 094: fadd
      // 095: aload 1
      // 096: getfield krg.zcz F
      // 099: aload 2
      // 09a: getfield krg.fmx F
      // 09d: fmul
      // 09e: fadd
      // 09f: aload 1
      // 0a0: getfield krg.g7m F
      // 0a3: aload 2
      // 0a4: getfield krg.sk9 F
      // 0a7: fmul
      // 0a8: fadd
      // 0a9: putfield krg.vwt F
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield krg.j8s F
      // 0b1: aload 2
      // 0b2: getfield krg.ygn F
      // 0b5: fmul
      // 0b6: aload 1
      // 0b7: getfield krg.fno F
      // 0ba: aload 2
      // 0bb: getfield krg.ttd F
      // 0be: fmul
      // 0bf: fadd
      // 0c0: aload 1
      // 0c1: getfield krg.zcz F
      // 0c4: aload 2
      // 0c5: getfield krg.f46 F
      // 0c8: fmul
      // 0c9: fadd
      // 0ca: aload 1
      // 0cb: getfield krg.g7m F
      // 0ce: aload 2
      // 0cf: getfield krg._40 F
      // 0d2: fmul
      // 0d3: fadd
      // 0d4: putfield krg.ygn F
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield krg.f28 F
      // 0dc: aload 2
      // 0dd: getfield krg.j8s F
      // 0e0: fmul
      // 0e1: aload 1
      // 0e2: getfield krg.rqb F
      // 0e5: aload 2
      // 0e6: getfield krg.fno F
      // 0e9: fmul
      // 0ea: fadd
      // 0eb: aload 1
      // 0ec: getfield krg.w4_ F
      // 0ef: aload 2
      // 0f0: getfield krg.zcz F
      // 0f3: fmul
      // 0f4: fadd
      // 0f5: aload 1
      // 0f6: getfield krg.i5l F
      // 0f9: aload 2
      // 0fa: getfield krg.g7m F
      // 0fd: fmul
      // 0fe: fadd
      // 0ff: putfield krg.fno F
      // 102: aload 0
      // 103: aload 1
      // 104: getfield krg.f28 F
      // 107: aload 2
      // 108: getfield krg.f28 F
      // 10b: fmul
      // 10c: aload 1
      // 10d: getfield krg.rqb F
      // 110: aload 2
      // 111: getfield krg.rqb F
      // 114: fmul
      // 115: fadd
      // 116: aload 1
      // 117: getfield krg.w4_ F
      // 11a: aload 2
      // 11b: getfield krg.w4_ F
      // 11e: fmul
      // 11f: fadd
      // 120: aload 1
      // 121: getfield krg.i5l F
      // 124: aload 2
      // 125: getfield krg.i5l F
      // 128: fmul
      // 129: fadd
      // 12a: putfield krg.rqb F
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield krg.f28 F
      // 132: aload 2
      // 133: getfield krg.vwt F
      // 136: fmul
      // 137: aload 1
      // 138: getfield krg.rqb F
      // 13b: aload 2
      // 13c: getfield krg.sjv F
      // 13f: fmul
      // 140: fadd
      // 141: aload 1
      // 142: getfield krg.w4_ F
      // 145: aload 2
      // 146: getfield krg.fmx F
      // 149: fmul
      // 14a: fadd
      // 14b: aload 1
      // 14c: getfield krg.i5l F
      // 14f: aload 2
      // 150: getfield krg.sk9 F
      // 153: fmul
      // 154: fadd
      // 155: putfield krg.sjv F
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield krg.f28 F
      // 15d: aload 2
      // 15e: getfield krg.ygn F
      // 161: fmul
      // 162: aload 1
      // 163: getfield krg.rqb F
      // 166: aload 2
      // 167: getfield krg.ttd F
      // 16a: fmul
      // 16b: fadd
      // 16c: aload 1
      // 16d: getfield krg.w4_ F
      // 170: aload 2
      // 171: getfield krg.f46 F
      // 174: fmul
      // 175: fadd
      // 176: aload 1
      // 177: getfield krg.i5l F
      // 17a: aload 2
      // 17b: getfield krg._40 F
      // 17e: fmul
      // 17f: fadd
      // 180: putfield krg.ttd F
      // 183: aload 0
      // 184: aload 1
      // 185: getfield krg.vwt F
      // 188: aload 2
      // 189: getfield krg.j8s F
      // 18c: fmul
      // 18d: aload 1
      // 18e: getfield krg.sjv F
      // 191: aload 2
      // 192: getfield krg.fno F
      // 195: fmul
      // 196: fadd
      // 197: aload 1
      // 198: getfield krg.fmx F
      // 19b: aload 2
      // 19c: getfield krg.zcz F
      // 19f: fmul
      // 1a0: fadd
      // 1a1: aload 1
      // 1a2: getfield krg.sk9 F
      // 1a5: aload 2
      // 1a6: getfield krg.g7m F
      // 1a9: fmul
      // 1aa: fadd
      // 1ab: putfield krg.zcz F
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield krg.vwt F
      // 1b3: aload 2
      // 1b4: getfield krg.f28 F
      // 1b7: fmul
      // 1b8: aload 1
      // 1b9: getfield krg.sjv F
      // 1bc: aload 2
      // 1bd: getfield krg.rqb F
      // 1c0: fmul
      // 1c1: fadd
      // 1c2: aload 1
      // 1c3: getfield krg.fmx F
      // 1c6: aload 2
      // 1c7: getfield krg.w4_ F
      // 1ca: fmul
      // 1cb: fadd
      // 1cc: aload 1
      // 1cd: getfield krg.sk9 F
      // 1d0: aload 2
      // 1d1: getfield krg.i5l F
      // 1d4: fmul
      // 1d5: fadd
      // 1d6: putfield krg.w4_ F
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield krg.vwt F
      // 1de: aload 2
      // 1df: getfield krg.vwt F
      // 1e2: fmul
      // 1e3: aload 1
      // 1e4: getfield krg.sjv F
      // 1e7: aload 2
      // 1e8: getfield krg.sjv F
      // 1eb: fmul
      // 1ec: fadd
      // 1ed: aload 1
      // 1ee: getfield krg.fmx F
      // 1f1: aload 2
      // 1f2: getfield krg.fmx F
      // 1f5: fmul
      // 1f6: fadd
      // 1f7: aload 1
      // 1f8: getfield krg.sk9 F
      // 1fb: aload 2
      // 1fc: getfield krg.sk9 F
      // 1ff: fmul
      // 200: fadd
      // 201: putfield krg.fmx F
      // 204: aload 0
      // 205: aload 1
      // 206: getfield krg.vwt F
      // 209: aload 2
      // 20a: getfield krg.ygn F
      // 20d: fmul
      // 20e: aload 1
      // 20f: getfield krg.sjv F
      // 212: aload 2
      // 213: getfield krg.ttd F
      // 216: fmul
      // 217: fadd
      // 218: aload 1
      // 219: getfield krg.fmx F
      // 21c: aload 2
      // 21d: getfield krg.f46 F
      // 220: fmul
      // 221: fadd
      // 222: aload 1
      // 223: getfield krg.sk9 F
      // 226: aload 2
      // 227: getfield krg._40 F
      // 22a: fmul
      // 22b: fadd
      // 22c: putfield krg.f46 F
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield krg.ygn F
      // 234: aload 2
      // 235: getfield krg.j8s F
      // 238: fmul
      // 239: aload 1
      // 23a: getfield krg.ttd F
      // 23d: aload 2
      // 23e: getfield krg.fno F
      // 241: fmul
      // 242: fadd
      // 243: aload 1
      // 244: getfield krg.f46 F
      // 247: aload 2
      // 248: getfield krg.zcz F
      // 24b: fmul
      // 24c: fadd
      // 24d: aload 1
      // 24e: getfield krg._40 F
      // 251: aload 2
      // 252: getfield krg.g7m F
      // 255: fmul
      // 256: fadd
      // 257: putfield krg.g7m F
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield krg.ygn F
      // 25f: aload 2
      // 260: getfield krg.f28 F
      // 263: fmul
      // 264: aload 1
      // 265: getfield krg.ttd F
      // 268: aload 2
      // 269: getfield krg.rqb F
      // 26c: fmul
      // 26d: fadd
      // 26e: aload 1
      // 26f: getfield krg.f46 F
      // 272: aload 2
      // 273: getfield krg.w4_ F
      // 276: fmul
      // 277: fadd
      // 278: aload 1
      // 279: getfield krg._40 F
      // 27c: aload 2
      // 27d: getfield krg.i5l F
      // 280: fmul
      // 281: fadd
      // 282: putfield krg.i5l F
      // 285: aload 0
      // 286: aload 1
      // 287: getfield krg.ygn F
      // 28a: aload 2
      // 28b: getfield krg.vwt F
      // 28e: fmul
      // 28f: aload 1
      // 290: getfield krg.ttd F
      // 293: aload 2
      // 294: getfield krg.sjv F
      // 297: fmul
      // 298: fadd
      // 299: aload 1
      // 29a: getfield krg.f46 F
      // 29d: aload 2
      // 29e: getfield krg.fmx F
      // 2a1: fmul
      // 2a2: fadd
      // 2a3: aload 1
      // 2a4: getfield krg._40 F
      // 2a7: aload 2
      // 2a8: getfield krg.sk9 F
      // 2ab: fmul
      // 2ac: fadd
      // 2ad: putfield krg.sk9 F
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield krg.ygn F
      // 2b5: aload 2
      // 2b6: getfield krg.ygn F
      // 2b9: fmul
      // 2ba: aload 1
      // 2bb: getfield krg.ttd F
      // 2be: aload 2
      // 2bf: getfield krg.ttd F
      // 2c2: fmul
      // 2c3: fadd
      // 2c4: aload 1
      // 2c5: getfield krg.f46 F
      // 2c8: aload 2
      // 2c9: getfield krg.f46 F
      // 2cc: fmul
      // 2cd: fadd
      // 2ce: aload 1
      // 2cf: getfield krg._40 F
      // 2d2: aload 2
      // 2d3: getfield krg._40 F
      // 2d6: fmul
      // 2d7: fadd
      // 2d8: putfield krg._40 F
      // 2db: iload 3
      // 2dc: ifne 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield krg.j8s F
      // 2f1: aload 2
      // 2f2: getfield krg.j8s F
      // 2f5: fmul
      // 2f6: aload 1
      // 2f7: getfield krg.fno F
      // 2fa: aload 2
      // 2fb: getfield krg.fno F
      // 2fe: fmul
      // 2ff: fadd
      // 300: aload 1
      // 301: getfield krg.zcz F
      // 304: aload 2
      // 305: getfield krg.zcz F
      // 308: fmul
      // 309: fadd
      // 30a: aload 1
      // 30b: getfield krg.g7m F
      // 30e: aload 2
      // 30f: getfield krg.g7m F
      // 312: fmul
      // 313: fadd
      // 314: fstore 4
      // 316: aload 1
      // 317: getfield krg.j8s F
      // 31a: aload 2
      // 31b: getfield krg.f28 F
      // 31e: fmul
      // 31f: aload 1
      // 320: getfield krg.fno F
      // 323: aload 2
      // 324: getfield krg.rqb F
      // 327: fmul
      // 328: fadd
      // 329: aload 1
      // 32a: getfield krg.zcz F
      // 32d: aload 2
      // 32e: getfield krg.w4_ F
      // 331: fmul
      // 332: fadd
      // 333: aload 1
      // 334: getfield krg.g7m F
      // 337: aload 2
      // 338: getfield krg.i5l F
      // 33b: fmul
      // 33c: fadd
      // 33d: fstore 5
      // 33f: aload 1
      // 340: getfield krg.j8s F
      // 343: aload 2
      // 344: getfield krg.vwt F
      // 347: fmul
      // 348: aload 1
      // 349: getfield krg.fno F
      // 34c: aload 2
      // 34d: getfield krg.sjv F
      // 350: fmul
      // 351: fadd
      // 352: aload 1
      // 353: getfield krg.zcz F
      // 356: aload 2
      // 357: getfield krg.fmx F
      // 35a: fmul
      // 35b: fadd
      // 35c: aload 1
      // 35d: getfield krg.g7m F
      // 360: aload 2
      // 361: getfield krg.sk9 F
      // 364: fmul
      // 365: fadd
      // 366: fstore 6
      // 368: aload 1
      // 369: getfield krg.j8s F
      // 36c: aload 2
      // 36d: getfield krg.ygn F
      // 370: fmul
      // 371: aload 1
      // 372: getfield krg.fno F
      // 375: aload 2
      // 376: getfield krg.ttd F
      // 379: fmul
      // 37a: fadd
      // 37b: aload 1
      // 37c: getfield krg.zcz F
      // 37f: aload 2
      // 380: getfield krg.f46 F
      // 383: fmul
      // 384: fadd
      // 385: aload 1
      // 386: getfield krg.g7m F
      // 389: aload 2
      // 38a: getfield krg._40 F
      // 38d: fmul
      // 38e: fadd
      // 38f: fstore 7
      // 391: aload 1
      // 392: getfield krg.f28 F
      // 395: aload 2
      // 396: getfield krg.j8s F
      // 399: fmul
      // 39a: aload 1
      // 39b: getfield krg.rqb F
      // 39e: aload 2
      // 39f: getfield krg.fno F
      // 3a2: fmul
      // 3a3: fadd
      // 3a4: aload 1
      // 3a5: getfield krg.w4_ F
      // 3a8: aload 2
      // 3a9: getfield krg.zcz F
      // 3ac: fmul
      // 3ad: fadd
      // 3ae: aload 1
      // 3af: getfield krg.i5l F
      // 3b2: aload 2
      // 3b3: getfield krg.g7m F
      // 3b6: fmul
      // 3b7: fadd
      // 3b8: fstore 8
      // 3ba: aload 1
      // 3bb: getfield krg.f28 F
      // 3be: aload 2
      // 3bf: getfield krg.f28 F
      // 3c2: fmul
      // 3c3: aload 1
      // 3c4: getfield krg.rqb F
      // 3c7: aload 2
      // 3c8: getfield krg.rqb F
      // 3cb: fmul
      // 3cc: fadd
      // 3cd: aload 1
      // 3ce: getfield krg.w4_ F
      // 3d1: aload 2
      // 3d2: getfield krg.w4_ F
      // 3d5: fmul
      // 3d6: fadd
      // 3d7: aload 1
      // 3d8: getfield krg.i5l F
      // 3db: aload 2
      // 3dc: getfield krg.i5l F
      // 3df: fmul
      // 3e0: fadd
      // 3e1: fstore 9
      // 3e3: aload 1
      // 3e4: getfield krg.f28 F
      // 3e7: aload 2
      // 3e8: getfield krg.vwt F
      // 3eb: fmul
      // 3ec: aload 1
      // 3ed: getfield krg.rqb F
      // 3f0: aload 2
      // 3f1: getfield krg.sjv F
      // 3f4: fmul
      // 3f5: fadd
      // 3f6: aload 1
      // 3f7: getfield krg.w4_ F
      // 3fa: aload 2
      // 3fb: getfield krg.fmx F
      // 3fe: fmul
      // 3ff: fadd
      // 400: aload 1
      // 401: getfield krg.i5l F
      // 404: aload 2
      // 405: getfield krg.sk9 F
      // 408: fmul
      // 409: fadd
      // 40a: fstore 10
      // 40c: aload 1
      // 40d: getfield krg.f28 F
      // 410: aload 2
      // 411: getfield krg.ygn F
      // 414: fmul
      // 415: aload 1
      // 416: getfield krg.rqb F
      // 419: aload 2
      // 41a: getfield krg.ttd F
      // 41d: fmul
      // 41e: fadd
      // 41f: aload 1
      // 420: getfield krg.w4_ F
      // 423: aload 2
      // 424: getfield krg.f46 F
      // 427: fmul
      // 428: fadd
      // 429: aload 1
      // 42a: getfield krg.i5l F
      // 42d: aload 2
      // 42e: getfield krg._40 F
      // 431: fmul
      // 432: fadd
      // 433: fstore 11
      // 435: aload 1
      // 436: getfield krg.vwt F
      // 439: aload 2
      // 43a: getfield krg.j8s F
      // 43d: fmul
      // 43e: aload 1
      // 43f: getfield krg.sjv F
      // 442: aload 2
      // 443: getfield krg.fno F
      // 446: fmul
      // 447: fadd
      // 448: aload 1
      // 449: getfield krg.fmx F
      // 44c: aload 2
      // 44d: getfield krg.zcz F
      // 450: fmul
      // 451: fadd
      // 452: aload 1
      // 453: getfield krg.sk9 F
      // 456: aload 2
      // 457: getfield krg.g7m F
      // 45a: fmul
      // 45b: fadd
      // 45c: fstore 12
      // 45e: aload 1
      // 45f: getfield krg.vwt F
      // 462: aload 2
      // 463: getfield krg.f28 F
      // 466: fmul
      // 467: aload 1
      // 468: getfield krg.sjv F
      // 46b: aload 2
      // 46c: getfield krg.rqb F
      // 46f: fmul
      // 470: fadd
      // 471: aload 1
      // 472: getfield krg.fmx F
      // 475: aload 2
      // 476: getfield krg.w4_ F
      // 479: fmul
      // 47a: fadd
      // 47b: aload 1
      // 47c: getfield krg.sk9 F
      // 47f: aload 2
      // 480: getfield krg.i5l F
      // 483: fmul
      // 484: fadd
      // 485: fstore 13
      // 487: aload 1
      // 488: getfield krg.vwt F
      // 48b: aload 2
      // 48c: getfield krg.vwt F
      // 48f: fmul
      // 490: aload 1
      // 491: getfield krg.sjv F
      // 494: aload 2
      // 495: getfield krg.sjv F
      // 498: fmul
      // 499: fadd
      // 49a: aload 1
      // 49b: getfield krg.fmx F
      // 49e: aload 2
      // 49f: getfield krg.fmx F
      // 4a2: fmul
      // 4a3: fadd
      // 4a4: aload 1
      // 4a5: getfield krg.sk9 F
      // 4a8: aload 2
      // 4a9: getfield krg.sk9 F
      // 4ac: fmul
      // 4ad: fadd
      // 4ae: fstore 14
      // 4b0: aload 1
      // 4b1: getfield krg.vwt F
      // 4b4: aload 2
      // 4b5: getfield krg.ygn F
      // 4b8: fmul
      // 4b9: aload 1
      // 4ba: getfield krg.sjv F
      // 4bd: aload 2
      // 4be: getfield krg.ttd F
      // 4c1: fmul
      // 4c2: fadd
      // 4c3: aload 1
      // 4c4: getfield krg.fmx F
      // 4c7: aload 2
      // 4c8: getfield krg.f46 F
      // 4cb: fmul
      // 4cc: fadd
      // 4cd: aload 1
      // 4ce: getfield krg.sk9 F
      // 4d1: aload 2
      // 4d2: getfield krg._40 F
      // 4d5: fmul
      // 4d6: fadd
      // 4d7: fstore 15
      // 4d9: aload 1
      // 4da: getfield krg.ygn F
      // 4dd: aload 2
      // 4de: getfield krg.j8s F
      // 4e1: fmul
      // 4e2: aload 1
      // 4e3: getfield krg.ttd F
      // 4e6: aload 2
      // 4e7: getfield krg.fno F
      // 4ea: fmul
      // 4eb: fadd
      // 4ec: aload 1
      // 4ed: getfield krg.f46 F
      // 4f0: aload 2
      // 4f1: getfield krg.zcz F
      // 4f4: fmul
      // 4f5: fadd
      // 4f6: aload 1
      // 4f7: getfield krg._40 F
      // 4fa: aload 2
      // 4fb: getfield krg.g7m F
      // 4fe: fmul
      // 4ff: fadd
      // 500: fstore 16
      // 502: aload 1
      // 503: getfield krg.ygn F
      // 506: aload 2
      // 507: getfield krg.f28 F
      // 50a: fmul
      // 50b: aload 1
      // 50c: getfield krg.ttd F
      // 50f: aload 2
      // 510: getfield krg.rqb F
      // 513: fmul
      // 514: fadd
      // 515: aload 1
      // 516: getfield krg.f46 F
      // 519: aload 2
      // 51a: getfield krg.w4_ F
      // 51d: fmul
      // 51e: fadd
      // 51f: aload 1
      // 520: getfield krg._40 F
      // 523: aload 2
      // 524: getfield krg.i5l F
      // 527: fmul
      // 528: fadd
      // 529: fstore 17
      // 52b: aload 1
      // 52c: getfield krg.ygn F
      // 52f: aload 2
      // 530: getfield krg.vwt F
      // 533: fmul
      // 534: aload 1
      // 535: getfield krg.ttd F
      // 538: aload 2
      // 539: getfield krg.sjv F
      // 53c: fmul
      // 53d: fadd
      // 53e: aload 1
      // 53f: getfield krg.f46 F
      // 542: aload 2
      // 543: getfield krg.fmx F
      // 546: fmul
      // 547: fadd
      // 548: aload 1
      // 549: getfield krg._40 F
      // 54c: aload 2
      // 54d: getfield krg.sk9 F
      // 550: fmul
      // 551: fadd
      // 552: fstore 18
      // 554: aload 1
      // 555: getfield krg.ygn F
      // 558: aload 2
      // 559: getfield krg.ygn F
      // 55c: fmul
      // 55d: aload 1
      // 55e: getfield krg.ttd F
      // 561: aload 2
      // 562: getfield krg.ttd F
      // 565: fmul
      // 566: fadd
      // 567: aload 1
      // 568: getfield krg.f46 F
      // 56b: aload 2
      // 56c: getfield krg.f46 F
      // 56f: fmul
      // 570: fadd
      // 571: aload 1
      // 572: getfield krg._40 F
      // 575: aload 2
      // 576: getfield krg._40 F
      // 579: fmul
      // 57a: fadd
      // 57b: fstore 19
      // 57d: aload 0
      // 57e: fload 4
      // 580: putfield krg.j8s F
      // 583: aload 0
      // 584: fload 5
      // 586: putfield krg.f28 F
      // 589: aload 0
      // 58a: fload 6
      // 58c: putfield krg.vwt F
      // 58f: aload 0
      // 590: fload 7
      // 592: putfield krg.ygn F
      // 595: aload 0
      // 596: fload 8
      // 598: putfield krg.fno F
      // 59b: aload 0
      // 59c: fload 9
      // 59e: putfield krg.rqb F
      // 5a1: aload 0
      // 5a2: fload 10
      // 5a4: putfield krg.sjv F
      // 5a7: aload 0
      // 5a8: fload 11
      // 5aa: putfield krg.ttd F
      // 5ad: aload 0
      // 5ae: fload 12
      // 5b0: putfield krg.zcz F
      // 5b3: aload 0
      // 5b4: fload 13
      // 5b6: putfield krg.w4_ F
      // 5b9: aload 0
      // 5ba: fload 14
      // 5bc: putfield krg.fmx F
      // 5bf: aload 0
      // 5c0: fload 15
      // 5c2: putfield krg.f46 F
      // 5c5: aload 0
      // 5c6: fload 16
      // 5c8: putfield krg.g7m F
      // 5cb: aload 0
      // 5cc: fload 17
      // 5ce: putfield krg.i5l F
      // 5d1: aload 0
      // 5d2: fload 18
      // 5d4: putfield krg.sk9 F
      // 5d7: aload 0
      // 5d8: fload 19
      // 5da: putfield krg._40 F
      // 5dd: return
   }

   public boolean m2i(krg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield krg.j8s F
      // 008: aload 1
      // 009: getfield krg.j8s F
      // 00c: fcmpl
      // 00d: iload 2
      // 00e: ifne 02b
      // 011: ifne 1e1
      // 014: goto 01b
      // 017: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield krg.f28 F
      // 01f: aload 1
      // 020: getfield krg.f28 F
      // 023: fcmpl
      // 024: goto 02b
      // 027: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: iload 2
      // 02c: ifne 049
      // 02f: ifne 1e1
      // 032: goto 039
      // 035: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield krg.vwt F
      // 03d: aload 1
      // 03e: getfield krg.vwt F
      // 041: fcmpl
      // 042: goto 049
      // 045: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 2
      // 04a: ifne 067
      // 04d: ifne 1e1
      // 050: goto 057
      // 053: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: aload 0
      // 058: getfield krg.ygn F
      // 05b: aload 1
      // 05c: getfield krg.ygn F
      // 05f: fcmpl
      // 060: goto 067
      // 063: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 066: athrow
      // 067: iload 2
      // 068: ifne 085
      // 06b: ifne 1e1
      // 06e: goto 075
      // 071: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 074: athrow
      // 075: aload 0
      // 076: getfield krg.fno F
      // 079: aload 1
      // 07a: getfield krg.fno F
      // 07d: fcmpl
      // 07e: goto 085
      // 081: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 2
      // 086: ifne 0a3
      // 089: ifne 1e1
      // 08c: goto 093
      // 08f: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 092: athrow
      // 093: aload 0
      // 094: getfield krg.rqb F
      // 097: aload 1
      // 098: getfield krg.rqb F
      // 09b: fcmpl
      // 09c: goto 0a3
      // 09f: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a2: athrow
      // 0a3: iload 2
      // 0a4: ifne 0c1
      // 0a7: ifne 1e1
      // 0aa: goto 0b1
      // 0ad: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield krg.sjv F
      // 0b5: aload 1
      // 0b6: getfield krg.sjv F
      // 0b9: fcmpl
      // 0ba: goto 0c1
      // 0bd: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c0: athrow
      // 0c1: iload 2
      // 0c2: ifne 0df
      // 0c5: ifne 1e1
      // 0c8: goto 0cf
      // 0cb: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield krg.ttd F
      // 0d3: aload 1
      // 0d4: getfield krg.ttd F
      // 0d7: fcmpl
      // 0d8: goto 0df
      // 0db: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0de: athrow
      // 0df: iload 2
      // 0e0: ifne 0fd
      // 0e3: ifne 1e1
      // 0e6: goto 0ed
      // 0e9: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield krg.zcz F
      // 0f1: aload 1
      // 0f2: getfield krg.zcz F
      // 0f5: fcmpl
      // 0f6: goto 0fd
      // 0f9: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifne 11b
      // 101: ifne 1e1
      // 104: goto 10b
      // 107: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield krg.w4_ F
      // 10f: aload 1
      // 110: getfield krg.w4_ F
      // 113: fcmpl
      // 114: goto 11b
      // 117: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11a: athrow
      // 11b: iload 2
      // 11c: ifne 139
      // 11f: ifne 1e1
      // 122: goto 129
      // 125: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield krg.fmx F
      // 12d: aload 1
      // 12e: getfield krg.fmx F
      // 131: fcmpl
      // 132: goto 139
      // 135: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 138: athrow
      // 139: iload 2
      // 13a: ifne 157
      // 13d: ifne 1e1
      // 140: goto 147
      // 143: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 146: athrow
      // 147: aload 0
      // 148: getfield krg.f46 F
      // 14b: aload 1
      // 14c: getfield krg.f46 F
      // 14f: fcmpl
      // 150: goto 157
      // 153: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 156: athrow
      // 157: iload 2
      // 158: ifne 175
      // 15b: ifne 1e1
      // 15e: goto 165
      // 161: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 164: athrow
      // 165: aload 0
      // 166: getfield krg.g7m F
      // 169: aload 1
      // 16a: getfield krg.g7m F
      // 16d: fcmpl
      // 16e: goto 175
      // 171: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 174: athrow
      // 175: iload 2
      // 176: ifne 193
      // 179: ifne 1e1
      // 17c: goto 183
      // 17f: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 182: athrow
      // 183: aload 0
      // 184: getfield krg.i5l F
      // 187: aload 1
      // 188: getfield krg.i5l F
      // 18b: fcmpl
      // 18c: goto 193
      // 18f: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 192: athrow
      // 193: iload 2
      // 194: ifne 1b1
      // 197: ifne 1e1
      // 19a: goto 1a1
      // 19d: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: getfield krg.sk9 F
      // 1a5: aload 1
      // 1a6: getfield krg.sk9 F
      // 1a9: fcmpl
      // 1aa: goto 1b1
      // 1ad: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b0: athrow
      // 1b1: iload 2
      // 1b2: ifne 1cf
      // 1b5: ifne 1e1
      // 1b8: goto 1bf
      // 1bb: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield krg._40 F
      // 1c3: aload 1
      // 1c4: getfield krg._40 F
      // 1c7: fcmpl
      // 1c8: goto 1cf
      // 1cb: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ce: athrow
      // 1cf: iload 2
      // 1d0: ifne 1de
      // 1d3: ifne 1e1
      // 1d6: goto 1dd
      // 1d9: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1dc: athrow
      // 1dd: bipush 1
      // 1de: goto 1e2
      // 1e1: bipush 0
      // 1e2: ireturn
      // 1e3: astore 3
      // 1e4: bipush 0
      // 1e5: ireturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: checkcast krg
      // 008: astore 3
      // 009: aload 0
      // 00a: getfield krg.j8s F
      // 00d: aload 3
      // 00e: getfield krg.j8s F
      // 011: fcmpl
      // 012: iload 2
      // 013: ifne 030
      // 016: ifne 1e6
      // 019: goto 020
      // 01c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield krg.f28 F
      // 024: aload 3
      // 025: getfield krg.f28 F
      // 028: fcmpl
      // 029: goto 030
      // 02c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02f: athrow
      // 030: iload 2
      // 031: ifne 04e
      // 034: ifne 1e6
      // 037: goto 03e
      // 03a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03d: athrow
      // 03e: aload 0
      // 03f: getfield krg.vwt F
      // 042: aload 3
      // 043: getfield krg.vwt F
      // 046: fcmpl
      // 047: goto 04e
      // 04a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04d: athrow
      // 04e: iload 2
      // 04f: ifne 06c
      // 052: ifne 1e6
      // 055: goto 05c
      // 058: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: getfield krg.ygn F
      // 060: aload 3
      // 061: getfield krg.ygn F
      // 064: fcmpl
      // 065: goto 06c
      // 068: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06b: athrow
      // 06c: iload 2
      // 06d: ifne 08a
      // 070: ifne 1e6
      // 073: goto 07a
      // 076: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield krg.fno F
      // 07e: aload 3
      // 07f: getfield krg.fno F
      // 082: fcmpl
      // 083: goto 08a
      // 086: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 089: athrow
      // 08a: iload 2
      // 08b: ifne 0a8
      // 08e: ifne 1e6
      // 091: goto 098
      // 094: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: aload 0
      // 099: getfield krg.rqb F
      // 09c: aload 3
      // 09d: getfield krg.rqb F
      // 0a0: fcmpl
      // 0a1: goto 0a8
      // 0a4: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a7: athrow
      // 0a8: iload 2
      // 0a9: ifne 0c6
      // 0ac: ifne 1e6
      // 0af: goto 0b6
      // 0b2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield krg.sjv F
      // 0ba: aload 3
      // 0bb: getfield krg.sjv F
      // 0be: fcmpl
      // 0bf: goto 0c6
      // 0c2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c5: athrow
      // 0c6: iload 2
      // 0c7: ifne 0e4
      // 0ca: ifne 1e6
      // 0cd: goto 0d4
      // 0d0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield krg.ttd F
      // 0d8: aload 3
      // 0d9: getfield krg.ttd F
      // 0dc: fcmpl
      // 0dd: goto 0e4
      // 0e0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e3: athrow
      // 0e4: iload 2
      // 0e5: ifne 102
      // 0e8: ifne 1e6
      // 0eb: goto 0f2
      // 0ee: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield krg.zcz F
      // 0f6: aload 3
      // 0f7: getfield krg.zcz F
      // 0fa: fcmpl
      // 0fb: goto 102
      // 0fe: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: iload 2
      // 103: ifne 120
      // 106: ifne 1e6
      // 109: goto 110
      // 10c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield krg.w4_ F
      // 114: aload 3
      // 115: getfield krg.w4_ F
      // 118: fcmpl
      // 119: goto 120
      // 11c: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11f: athrow
      // 120: iload 2
      // 121: ifne 13e
      // 124: ifne 1e6
      // 127: goto 12e
      // 12a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield krg.fmx F
      // 132: aload 3
      // 133: getfield krg.fmx F
      // 136: fcmpl
      // 137: goto 13e
      // 13a: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13d: athrow
      // 13e: iload 2
      // 13f: ifne 15c
      // 142: ifne 1e6
      // 145: goto 14c
      // 148: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14b: athrow
      // 14c: aload 0
      // 14d: getfield krg.f46 F
      // 150: aload 3
      // 151: getfield krg.f46 F
      // 154: fcmpl
      // 155: goto 15c
      // 158: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15b: athrow
      // 15c: iload 2
      // 15d: ifne 17a
      // 160: ifne 1e6
      // 163: goto 16a
      // 166: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield krg.g7m F
      // 16e: aload 3
      // 16f: getfield krg.g7m F
      // 172: fcmpl
      // 173: goto 17a
      // 176: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 179: athrow
      // 17a: iload 2
      // 17b: ifne 198
      // 17e: ifne 1e6
      // 181: goto 188
      // 184: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 187: athrow
      // 188: aload 0
      // 189: getfield krg.i5l F
      // 18c: aload 3
      // 18d: getfield krg.i5l F
      // 190: fcmpl
      // 191: goto 198
      // 194: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 197: athrow
      // 198: iload 2
      // 199: ifne 1b6
      // 19c: ifne 1e6
      // 19f: goto 1a6
      // 1a2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: getfield krg.sk9 F
      // 1aa: aload 3
      // 1ab: getfield krg.sk9 F
      // 1ae: fcmpl
      // 1af: goto 1b6
      // 1b2: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b5: athrow
      // 1b6: iload 2
      // 1b7: ifne 1d4
      // 1ba: ifne 1e6
      // 1bd: goto 1c4
      // 1c0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: getfield krg._40 F
      // 1c8: aload 3
      // 1c9: getfield krg._40 F
      // 1cc: fcmpl
      // 1cd: goto 1d4
      // 1d0: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d3: athrow
      // 1d4: iload 2
      // 1d5: ifne 1e3
      // 1d8: ifne 1e6
      // 1db: goto 1e2
      // 1de: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e1: athrow
      // 1e2: bipush 1
      // 1e3: goto 1e7
      // 1e6: bipush 0
      // 1e7: ireturn
      // 1e8: astore 3
      // 1e9: bipush 0
      // 1ea: ireturn
      // 1eb: astore 3
      // 1ec: bipush 0
      // 1ed: ireturn
   }

   public boolean g3m(krg var1, float var2) {
      int var3 = OpaquePredicate.b();
      byte var4 = 1;

      int var10000;
      label261: {
         label260: {
            try {
               float var21;
               var10000 = (var21 = Math.abs(this.j8s - var1.j8s) - var2) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
               if (var3 == 0) {
                  break label261;
               }

               if (var10000 <= 0) {
                  break label260;
               }
            } catch (ArrayIndexOutOfBoundsException var20) {
               throw a(var20);
            }

            var4 = 0;
         }

         float var22;
         var10000 = (var22 = Math.abs(this.f28 - var1.f28) - var2) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
      }

      label252: {
         label251: {
            try {
               if (var3 == 0) {
                  break label252;
               }

               if (var10000 <= 0) {
                  break label251;
               }
            } catch (ArrayIndexOutOfBoundsException var19) {
               throw a(var19);
            }

            var4 = 0;
         }

         float var23;
         var10000 = (var23 = Math.abs(this.vwt - var1.vwt) - var2) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
      }

      label243: {
         label242: {
            try {
               if (var3 == 0) {
                  break label243;
               }

               if (var10000 <= 0) {
                  break label242;
               }
            } catch (ArrayIndexOutOfBoundsException var18) {
               throw a(var18);
            }

            var4 = 0;
         }

         float var24;
         var10000 = (var24 = Math.abs(this.ygn - var1.ygn) - var2) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
      }

      label234: {
         label233: {
            try {
               if (var3 == 0) {
                  break label234;
               }

               if (var10000 <= 0) {
                  break label233;
               }
            } catch (ArrayIndexOutOfBoundsException var17) {
               throw a(var17);
            }

            var4 = 0;
         }

         float var25;
         var10000 = (var25 = Math.abs(this.fno - var1.fno) - var2) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
      }

      label225: {
         label224: {
            try {
               if (var3 == 0) {
                  break label225;
               }

               if (var10000 <= 0) {
                  break label224;
               }
            } catch (ArrayIndexOutOfBoundsException var16) {
               throw a(var16);
            }

            var4 = 0;
         }

         float var26;
         var10000 = (var26 = Math.abs(this.rqb - var1.rqb) - var2) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
      }

      label216: {
         label215: {
            try {
               if (var3 == 0) {
                  break label216;
               }

               if (var10000 <= 0) {
                  break label215;
               }
            } catch (ArrayIndexOutOfBoundsException var15) {
               throw a(var15);
            }

            var4 = 0;
         }

         float var27;
         var10000 = (var27 = Math.abs(this.sjv - var1.sjv) - var2) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
      }

      label207: {
         label206: {
            try {
               if (var3 == 0) {
                  break label207;
               }

               if (var10000 <= 0) {
                  break label206;
               }
            } catch (ArrayIndexOutOfBoundsException var14) {
               throw a(var14);
            }

            var4 = 0;
         }

         float var28;
         var10000 = (var28 = Math.abs(this.ttd - var1.ttd) - var2) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
      }

      label198: {
         label197: {
            try {
               if (var3 == 0) {
                  break label198;
               }

               if (var10000 <= 0) {
                  break label197;
               }
            } catch (ArrayIndexOutOfBoundsException var13) {
               throw a(var13);
            }

            var4 = 0;
         }

         float var29;
         var10000 = (var29 = Math.abs(this.zcz - var1.zcz) - var2) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
      }

      label189: {
         label188: {
            try {
               if (var3 == 0) {
                  break label189;
               }

               if (var10000 <= 0) {
                  break label188;
               }
            } catch (ArrayIndexOutOfBoundsException var12) {
               throw a(var12);
            }

            var4 = 0;
         }

         float var30;
         var10000 = (var30 = Math.abs(this.w4_ - var1.w4_) - var2) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
      }

      label180: {
         label179: {
            try {
               if (var3 == 0) {
                  break label180;
               }

               if (var10000 <= 0) {
                  break label179;
               }
            } catch (ArrayIndexOutOfBoundsException var11) {
               throw a(var11);
            }

            var4 = 0;
         }

         float var31;
         var10000 = (var31 = Math.abs(this.fmx - var1.fmx) - var2) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
      }

      label171: {
         label170: {
            try {
               if (var3 == 0) {
                  break label171;
               }

               if (var10000 <= 0) {
                  break label170;
               }
            } catch (ArrayIndexOutOfBoundsException var10) {
               throw a(var10);
            }

            var4 = 0;
         }

         float var32;
         var10000 = (var32 = Math.abs(this.f46 - var1.f46) - var2) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
      }

      label162: {
         label161: {
            try {
               if (var3 == 0) {
                  break label162;
               }

               if (var10000 <= 0) {
                  break label161;
               }
            } catch (ArrayIndexOutOfBoundsException var9) {
               throw a(var9);
            }

            var4 = 0;
         }

         float var33;
         var10000 = (var33 = Math.abs(this.g7m - var1.g7m) - var2) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
      }

      label153: {
         label152: {
            try {
               if (var3 == 0) {
                  break label153;
               }

               if (var10000 <= 0) {
                  break label152;
               }
            } catch (ArrayIndexOutOfBoundsException var8) {
               throw a(var8);
            }

            var4 = 0;
         }

         float var34;
         var10000 = (var34 = Math.abs(this.i5l - var1.i5l) - var2) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
      }

      label144: {
         label143: {
            try {
               if (var3 == 0) {
                  break label144;
               }

               if (var10000 <= 0) {
                  break label143;
               }
            } catch (ArrayIndexOutOfBoundsException var7) {
               throw a(var7);
            }

            var4 = 0;
         }

         float var35;
         var10000 = (var35 = Math.abs(this.sk9 - var1.sk9) - var2) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
      }

      label135: {
         label134: {
            try {
               if (var3 == 0) {
                  break label135;
               }

               if (var10000 <= 0) {
                  break label134;
               }
            } catch (ArrayIndexOutOfBoundsException var6) {
               throw a(var6);
            }

            var4 = 0;
         }

         float var36;
         var10000 = (var36 = Math.abs(this._40 - var1._40) - var2) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
      }

      try {
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)var4;
         }
      } catch (ArrayIndexOutOfBoundsException var5) {
         throw a(var5);
      }

      return (boolean)0;
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.g_p(var1, this.j8s);
      var1 = get.g_p(var1, this.f28);
      var1 = get.g_p(var1, this.vwt);
      var1 = get.g_p(var1, this.ygn);
      var1 = get.g_p(var1, this.fno);
      var1 = get.g_p(var1, this.rqb);
      var1 = get.g_p(var1, this.sjv);
      var1 = get.g_p(var1, this.ttd);
      var1 = get.g_p(var1, this.zcz);
      var1 = get.g_p(var1, this.w4_);
      var1 = get.g_p(var1, this.fmx);
      var1 = get.g_p(var1, this.f46);
      var1 = get.g_p(var1, this.g7m);
      var1 = get.g_p(var1, this.i5l);
      var1 = get.g_p(var1, this.sk9);
      var1 = get.g_p(var1, this._40);
      return get.p05(var1);
   }

   public final void rj0(rkj var1, rkj var2) {
      float var3 = this.j8s * var1.hp2 + this.f28 * var1.nc_ + this.vwt * var1.ax5 + this.ygn * var1.ck3;
      float var4 = this.fno * var1.hp2 + this.rqb * var1.nc_ + this.sjv * var1.ax5 + this.ttd * var1.ck3;
      float var5 = this.zcz * var1.hp2 + this.w4_ * var1.nc_ + this.fmx * var1.ax5 + this.f46 * var1.ck3;
      var2.ck3 = this.g7m * var1.hp2 + this.i5l * var1.nc_ + this.sk9 * var1.ax5 + this._40 * var1.ck3;
      var2.hp2 = var3;
      var2.nc_ = var4;
      var2.ax5 = var5;
   }

   public final void s39(rkj var1) {
      float var2 = this.j8s * var1.hp2 + this.f28 * var1.nc_ + this.vwt * var1.ax5 + this.ygn * var1.ck3;
      float var3 = this.fno * var1.hp2 + this.rqb * var1.nc_ + this.sjv * var1.ax5 + this.ttd * var1.ck3;
      float var4 = this.zcz * var1.hp2 + this.w4_ * var1.nc_ + this.fmx * var1.ax5 + this.f46 * var1.ck3;
      var1.ck3 = this.g7m * var1.hp2 + this.i5l * var1.nc_ + this.sk9 * var1.ax5 + this._40 * var1.ck3;
      var1.hp2 = var2;
      var1.nc_ = var3;
      var1.ax5 = var4;
   }

   public final void m7i(_r4 var1, _r4 var2) {
      float var3 = this.j8s * var1.yiu + this.f28 * var1.q6o + this.vwt * var1.n_d + this.ygn;
      float var4 = this.fno * var1.yiu + this.rqb * var1.q6o + this.sjv * var1.n_d + this.ttd;
      var2.n_d = this.zcz * var1.yiu + this.w4_ * var1.q6o + this.fmx * var1.n_d + this.f46;
      var2.yiu = var3;
      var2.q6o = var4;
   }

   public final void pdd(_r4 var1) {
      float var2 = this.j8s * var1.yiu + this.f28 * var1.q6o + this.vwt * var1.n_d + this.ygn;
      float var3 = this.fno * var1.yiu + this.rqb * var1.q6o + this.sjv * var1.n_d + this.ttd;
      var1.n_d = this.zcz * var1.yiu + this.w4_ * var1.q6o + this.fmx * var1.n_d + this.f46;
      var1.yiu = var2;
      var1.q6o = var3;
   }

   public final void nad(l3p var1, l3p var2) {
      float var3 = this.j8s * var1.yiu + this.f28 * var1.q6o + this.vwt * var1.n_d;
      float var4 = this.fno * var1.yiu + this.rqb * var1.q6o + this.sjv * var1.n_d;
      var2.n_d = this.zcz * var1.yiu + this.w4_ * var1.q6o + this.fmx * var1.n_d;
      var2.yiu = var3;
      var2.q6o = var4;
   }

   public final void h2q(l3p var1) {
      float var2 = this.j8s * var1.yiu + this.f28 * var1.q6o + this.vwt * var1.n_d;
      float var3 = this.fno * var1.yiu + this.rqb * var1.q6o + this.sjv * var1.n_d;
      var1.n_d = this.zcz * var1.yiu + this.w4_ * var1.q6o + this.fmx * var1.n_d;
      var1.yiu = var2;
      var1.q6o = var3;
   }

   public final void xrp(iww var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.mwd(var3, var2);
      this.j8s = (float)(var1.lxb * var3[0]);
      this.f28 = (float)(var1.y3c * var3[1]);
      this.vwt = (float)(var1.bhd * var3[2]);
      this.fno = (float)(var1.get * var3[0]);
      this.rqb = (float)(var1.pwn * var3[1]);
      this.sjv = (float)(var1.c84 * var3[2]);
      this.zcz = (float)(var1.y7q * var3[0]);
      this.w4_ = (float)(var1._o7 * var3[1]);
      this.fmx = (float)(var1.ffq * var3[2]);
   }

   public final void uvd(nvj var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.mwd(var3, var2);
      this.j8s = (float)((double)var1.i2i * var3[0]);
      this.f28 = (float)((double)var1.k12 * var3[1]);
      this.vwt = (float)((double)var1.xu6 * var3[2]);
      this.fno = (float)((double)var1._id * var3[0]);
      this.rqb = (float)((double)var1.aoj * var3[1]);
      this.sjv = (float)((double)var1.zk_ * var3[2]);
      this.zcz = (float)((double)var1.aqg * var3[0]);
      this.w4_ = (float)((double)var1.wdt * var3[1]);
      this.fmx = (float)((double)var1.jr8 * var3[2]);
   }

   public final void et_(lwt var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.mwd(var3, var2);
      this.j8s = (float)((double)(1.0F - 2.0F * var1.nc_ * var1.nc_ - 2.0F * var1.ax5 * var1.ax5) * var3[0]);
      this.fno = (float)((double)(2.0F * (var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5)) * var3[0]);
      this.zcz = (float)((double)(2.0F * (var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_)) * var3[0]);
      this.f28 = (float)((double)(2.0F * (var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5)) * var3[1]);
      this.rqb = (float)((double)(1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.ax5 * var1.ax5) * var3[1]);
      this.w4_ = (float)((double)(2.0F * (var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2)) * var3[1]);
      this.vwt = (float)((double)(2.0F * (var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_)) * var3[2]);
      this.sjv = (float)((double)(2.0F * (var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2)) * var3[2]);
      this.fmx = (float)((double)(1.0F - 2.0F * var1.hp2 * var1.hp2 - 2.0F * var1.nc_ * var1.nc_) * var3[2]);
   }

   public final void dtg(nbf var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.mwd(var3, var2);
      this.j8s = (float)((1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe) * var3[0]);
      this.fno = (float)(2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe) * var3[0]);
      this.zcz = (float)(2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8) * var3[0]);
      this.f28 = (float)(2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe) * var3[1]);
      this.rqb = (float)((1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe) * var3[1]);
      this.w4_ = (float)(2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme) * var3[1]);
      this.vwt = (float)(2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8) * var3[2]);
      this.sjv = (float)(2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme) * var3[2]);
      this.fmx = (float)((1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8) * var3[2]);
   }

   public final void t4j(ll8 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 9
      // 002: newarray 7
      // 004: astore 3
      // 005: bipush 3
      // 006: newarray 7
      // 008: astore 4
      // 00a: aload 0
      // 00b: aload 4
      // 00d: aload 3
      // 00e: invokespecial krg.mwd ([D[D)V
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 1
      // 015: getfield ll8._5i F
      // 018: aload 1
      // 019: getfield ll8._5i F
      // 01c: fmul
      // 01d: aload 1
      // 01e: getfield ll8.w5z F
      // 021: aload 1
      // 022: getfield ll8.w5z F
      // 025: fmul
      // 026: fadd
      // 027: aload 1
      // 028: getfield ll8.yz_ F
      // 02b: aload 1
      // 02c: getfield ll8.yz_ F
      // 02f: fmul
      // 030: fadd
      // 031: f2d
      // 032: invokestatic java/lang/Math.sqrt (D)D
      // 035: dstore 5
      // 037: istore 2
      // 038: dload 5
      // 03a: ldc2_w 1.0E-8
      // 03d: iload 2
      // 03e: ifeq 091
      // 041: dcmpg
      // 042: ifge 084
      // 045: goto 04c
      // 048: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04b: athrow
      // 04c: aload 0
      // 04d: fconst_1
      // 04e: putfield krg.j8s F
      // 051: aload 0
      // 052: fconst_0
      // 053: putfield krg.f28 F
      // 056: aload 0
      // 057: fconst_0
      // 058: putfield krg.vwt F
      // 05b: aload 0
      // 05c: fconst_0
      // 05d: putfield krg.fno F
      // 060: aload 0
      // 061: fconst_1
      // 062: putfield krg.rqb F
      // 065: aload 0
      // 066: fconst_0
      // 067: putfield krg.sjv F
      // 06a: aload 0
      // 06b: fconst_0
      // 06c: putfield krg.zcz F
      // 06f: aload 0
      // 070: fconst_0
      // 071: putfield krg.w4_ F
      // 074: aload 0
      // 075: fconst_1
      // 076: putfield krg.fmx F
      // 079: iload 2
      // 07a: ifne 1a3
      // 07d: goto 084
      // 080: invokestatic krg.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 083: athrow
      // 084: dconst_1
      // 085: dload 5
      // 087: ddiv
      // 088: dstore 5
      // 08a: aload 1
      // 08b: getfield ll8._5i F
      // 08e: f2d
      // 08f: dload 5
      // 091: dmul
      // 092: dstore 7
      // 094: aload 1
      // 095: getfield ll8.w5z F
      // 098: f2d
      // 099: dload 5
      // 09b: dmul
      // 09c: dstore 9
      // 09e: aload 1
      // 09f: getfield ll8.yz_ F
      // 0a2: f2d
      // 0a3: dload 5
      // 0a5: dmul
      // 0a6: dstore 11
      // 0a8: aload 1
      // 0a9: getfield ll8.b77 F
      // 0ac: f2d
      // 0ad: invokestatic java/lang/Math.sin (D)D
      // 0b0: dstore 13
      // 0b2: aload 1
      // 0b3: getfield ll8.b77 F
      // 0b6: f2d
      // 0b7: invokestatic java/lang/Math.cos (D)D
      // 0ba: dstore 15
      // 0bc: dconst_1
      // 0bd: dload 15
      // 0bf: dsub
      // 0c0: dstore 17
      // 0c2: aload 1
      // 0c3: getfield ll8._5i F
      // 0c6: aload 1
      // 0c7: getfield ll8.yz_ F
      // 0ca: fmul
      // 0cb: f2d
      // 0cc: dstore 19
      // 0ce: aload 1
      // 0cf: getfield ll8._5i F
      // 0d2: aload 1
      // 0d3: getfield ll8.w5z F
      // 0d6: fmul
      // 0d7: f2d
      // 0d8: dstore 21
      // 0da: aload 1
      // 0db: getfield ll8.w5z F
      // 0de: aload 1
      // 0df: getfield ll8.yz_ F
      // 0e2: fmul
      // 0e3: f2d
      // 0e4: dstore 23
      // 0e6: aload 0
      // 0e7: dload 17
      // 0e9: dload 7
      // 0eb: dmul
      // 0ec: dload 7
      // 0ee: dmul
      // 0ef: dload 15
      // 0f1: dadd
      // 0f2: aload 4
      // 0f4: bipush 0
      // 0f5: daload
      // 0f6: dmul
      // 0f7: d2f
      // 0f8: putfield krg.j8s F
      // 0fb: aload 0
      // 0fc: dload 17
      // 0fe: dload 21
      // 100: dmul
      // 101: dload 13
      // 103: dload 11
      // 105: dmul
      // 106: dsub
      // 107: aload 4
      // 109: bipush 1
      // 10a: daload
      // 10b: dmul
      // 10c: d2f
      // 10d: putfield krg.f28 F
      // 110: aload 0
      // 111: dload 17
      // 113: dload 19
      // 115: dmul
      // 116: dload 13
      // 118: dload 9
      // 11a: dmul
      // 11b: dadd
      // 11c: aload 4
      // 11e: bipush 2
      // 11f: daload
      // 120: dmul
      // 121: d2f
      // 122: putfield krg.vwt F
      // 125: aload 0
      // 126: dload 17
      // 128: dload 21
      // 12a: dmul
      // 12b: dload 13
      // 12d: dload 11
      // 12f: dmul
      // 130: dadd
      // 131: aload 4
      // 133: bipush 0
      // 134: daload
      // 135: dmul
      // 136: d2f
      // 137: putfield krg.fno F
      // 13a: aload 0
      // 13b: dload 17
      // 13d: dload 9
      // 13f: dmul
      // 140: dload 9
      // 142: dmul
      // 143: dload 15
      // 145: dadd
      // 146: aload 4
      // 148: bipush 1
      // 149: daload
      // 14a: dmul
      // 14b: d2f
      // 14c: putfield krg.rqb F
      // 14f: aload 0
      // 150: dload 17
      // 152: dload 23
      // 154: dmul
      // 155: dload 13
      // 157: dload 7
      // 159: dmul
      // 15a: dsub
      // 15b: aload 4
      // 15d: bipush 2
      // 15e: daload
      // 15f: dmul
      // 160: d2f
      // 161: putfield krg.sjv F
      // 164: aload 0
      // 165: dload 17
      // 167: dload 19
      // 169: dmul
      // 16a: dload 13
      // 16c: dload 9
      // 16e: dmul
      // 16f: dsub
      // 170: aload 4
      // 172: bipush 0
      // 173: daload
      // 174: dmul
      // 175: d2f
      // 176: putfield krg.zcz F
      // 179: aload 0
      // 17a: dload 17
      // 17c: dload 23
      // 17e: dmul
      // 17f: dload 13
      // 181: dload 7
      // 183: dmul
      // 184: dadd
      // 185: aload 4
      // 187: bipush 1
      // 188: daload
      // 189: dmul
      // 18a: d2f
      // 18b: putfield krg.w4_ F
      // 18e: aload 0
      // 18f: dload 17
      // 191: dload 11
      // 193: dmul
      // 194: dload 11
      // 196: dmul
      // 197: dload 15
      // 199: dadd
      // 19a: aload 4
      // 19c: bipush 2
      // 19d: daload
      // 19e: dmul
      // 19f: d2f
      // 1a0: putfield krg.fmx F
      // 1a3: return
   }

   public final void f13() {
      this.j8s = 0.0F;
      this.f28 = 0.0F;
      this.vwt = 0.0F;
      this.ygn = 0.0F;
      this.fno = 0.0F;
      this.rqb = 0.0F;
      this.sjv = 0.0F;
      this.ttd = 0.0F;
      this.zcz = 0.0F;
      this.w4_ = 0.0F;
      this.fmx = 0.0F;
      this.f46 = 0.0F;
      this.g7m = 0.0F;
      this.i5l = 0.0F;
      this.sk9 = 0.0F;
      this._40 = 0.0F;
   }

   public final void nhp() {
      this.j8s = -this.j8s;
      this.f28 = -this.f28;
      this.vwt = -this.vwt;
      this.ygn = -this.ygn;
      this.fno = -this.fno;
      this.rqb = -this.rqb;
      this.sjv = -this.sjv;
      this.ttd = -this.ttd;
      this.zcz = -this.zcz;
      this.w4_ = -this.w4_;
      this.fmx = -this.fmx;
      this.f46 = -this.f46;
      this.g7m = -this.g7m;
      this.i5l = -this.i5l;
      this.sk9 = -this.sk9;
      this._40 = -this._40;
   }

   public final void p34(krg var1) {
      this.j8s = -var1.j8s;
      this.f28 = -var1.f28;
      this.vwt = -var1.vwt;
      this.ygn = -var1.ygn;
      this.fno = -var1.fno;
      this.rqb = -var1.rqb;
      this.sjv = -var1.sjv;
      this.ttd = -var1.ttd;
      this.zcz = -var1.zcz;
      this.w4_ = -var1.w4_;
      this.fmx = -var1.fmx;
      this.f46 = -var1.f46;
      this.g7m = -var1.g7m;
      this.i5l = -var1.i5l;
      this.sk9 = -var1.sk9;
      this._40 = -var1._40;
   }

   private final void mwd(double[] var1, double[] var2) {
      double[] var3 = new double[]{
         (double)this.j8s,
         (double)this.f28,
         (double)this.vwt,
         (double)this.fno,
         (double)this.rqb,
         (double)this.sjv,
         (double)this.zcz,
         (double)this.w4_,
         (double)this.fmx
      };
      iww.d20(var3, var1, var2);
   }

   @Override
   public Object clone() {
      Object var1 = null;

      try {
         return (krg)super.clone();
      } catch (CloneNotSupportedException var3) {
         throw new InternalError();
      }
   }

   public final float rfl() {
      return this.j8s;
   }

   public final void efl(float var1) {
      this.j8s = var1;
   }

   public final float _3c() {
      return this.f28;
   }

   public final void qjm(float var1) {
      this.f28 = var1;
   }

   public final float abd() {
      return this.vwt;
   }

   public final void i20(float var1) {
      this.vwt = var1;
   }

   public final float fzi() {
      return this.fno;
   }

   public final void lc0(float var1) {
      this.fno = var1;
   }

   public final float rek() {
      return this.rqb;
   }

   public final void j68(float var1) {
      this.rqb = var1;
   }

   public final float lfm() {
      return this.sjv;
   }

   public final void iye(float var1) {
      this.sjv = var1;
   }

   public final float lyl() {
      return this.zcz;
   }

   public final void nks(float var1) {
      this.zcz = var1;
   }

   public final float vve() {
      return this.w4_;
   }

   public final void rl6(float var1) {
      this.w4_ = var1;
   }

   public final float ux2() {
      return this.fmx;
   }

   public final void yde(float var1) {
      this.fmx = var1;
   }

   public final float b_1() {
      return this.ygn;
   }

   public final void vy8(float var1) {
      this.ygn = var1;
   }

   public final float ex9() {
      return this.ttd;
   }

   public final void fm_(float var1) {
      this.ttd = var1;
   }

   public final float w7_() {
      return this.f46;
   }

   public final void pvg(float var1) {
      this.f46 = var1;
   }

   public final float b0u() {
      return this.g7m;
   }

   public final void syp(float var1) {
      this.g7m = var1;
   }

   public final float t28() {
      return this.i5l;
   }

   public final void dyt(float var1) {
      this.i5l = var1;
   }

   public final float wve() {
      return this.sk9;
   }

   public final void w25(float var1) {
      this.sk9 = var1;
   }

   public final float l6u() {
      return this._40;
   }

   public final void kzy(float var1) {
      this._40 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(736611830000266346L, 319811371811937663L, MethodHandles.lookup().lookupClass()).a(89473452896243L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 20348759581105L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "ê\nÀTÄ6T\u0002äA¬\u0019B£)Ð«\u0086T\u0011HH´È\u0017éÊ`60¤\u009a uµ·\u0018d;ºûo{>\u0092\u0017õB\u0084à\u0087k\u0089±~Q\u00961Y$òs!\u0096\u0016 \u001dNz/JU\u0097\u0005ë\u008dñ_Zob)ÝÈâ¨{¸\u008cïîÔ\u0099ÿS¸bÈ Í4Hë~ £¥Îxy_sw'K\u007f\nv'C>Ê\u008a\u0080s\u0003ú\u007fb)·\u0018·¤\bïÑàÿÉ\u0099Ù\"*¸Gÿ¶\u0007!h&uw¯\u0013 \u009b-Ð\u0086\u0002Ö!rö\b'W\u0017Ù\u0006·*\u0096õ2\"#£\u0099éu?}Àð\u008eq\u0010\u0096\u0000Ñ0´Ûeö¥³Oà\u0084;d0 w0æ¹K\u0080@´×Öå\u0007®%?ÃÇ\u0011(Ü\u000fCÿn=ìÞ¯¤\u001f1\t\u0018ÈW'3\u0007¶L]¥p ôíA|ÅáÉZ\fÖ\u0004\u009f\u0098 »±\u0018<! Ô\u00865¶\u001f\u009c\u009dêÞñ\u008c\\Õ{\u0089\u0085[Õ®õÚÈ\u0092É%d üCãÒ\u0002ç\u0092µ1M)qýÚT°À\u00042ô\u008e^\u0080\rDä-\u0086æ¦\u00ad¸\u0018°\u0014\u0010º?É\u009d|\u0012\u001eEÉ«}cK\u009a]\u0084N-ò \u0093\u0010ÞQçLz0Ð\u0098h·C\u0086\u0019U¨ù";
      int var8 = "ê\nÀTÄ6T\u0002äA¬\u0019B£)Ð«\u0086T\u0011HH´È\u0017éÊ`60¤\u009a uµ·\u0018d;ºûo{>\u0092\u0017õB\u0084à\u0087k\u0089±~Q\u00961Y$òs!\u0096\u0016 \u001dNz/JU\u0097\u0005ë\u008dñ_Zob)ÝÈâ¨{¸\u008cïîÔ\u0099ÿS¸bÈ Í4Hë~ £¥Îxy_sw'K\u007f\nv'C>Ê\u008a\u0080s\u0003ú\u007fb)·\u0018·¤\bïÑàÿÉ\u0099Ù\"*¸Gÿ¶\u0007!h&uw¯\u0013 \u009b-Ð\u0086\u0002Ö!rö\b'W\u0017Ù\u0006·*\u0096õ2\"#£\u0099éu?}Àð\u008eq\u0010\u0096\u0000Ñ0´Ûeö¥³Oà\u0084;d0 w0æ¹K\u0080@´×Öå\u0007®%?ÃÇ\u0011(Ü\u000fCÿn=ìÞ¯¤\u001f1\t\u0018ÈW'3\u0007¶L]¥p ôíA|ÅáÉZ\fÖ\u0004\u009f\u0098 »±\u0018<! Ô\u00865¶\u001f\u009c\u009dêÞñ\u008c\\Õ{\u0089\u0085[Õ®õÚÈ\u0092É%d üCãÒ\u0002ç\u0092µ1M)qýÚT°À\u00042ô\u008e^\u0080\rDä-\u0086æ¦\u00ad¸\u0018°\u0014\u0010º?É\u009d|\u0012\u001eEÉ«}cK\u009a]\u0084N-ò \u0093\u0010ÞQçLz0Ð\u0098h·C\u0086\u0019U¨ù"
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
                     c = new String[15];
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

                  var6 = "\u0007\u000e:\u0084-T\u0088ç\u001dúy×ê\u0095×2¡\u0089óUä2Îø\u0082v¬¤ßÕ2\u0019 ME\u0014²\u0080j=±\u008fòy\u009cÄYÈ¸©É9±\f+^¿û%ÉÁ\u0092àH<";
                  var8 = "\u0007\u000e:\u0084-T\u0088ç\u001dúy×ê\u0095×2¡\u0089óUä2Îø\u0082v¬¤ßÕ2\u0019 ME\u0014²\u0080j=±\u008fòy\u009cÄYÈ¸©É9±\f+^¿û%ÉÁ\u0092àH<"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17395;
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
            throw new RuntimeException("krg", var10);
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
         throw new RuntimeException("krg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
