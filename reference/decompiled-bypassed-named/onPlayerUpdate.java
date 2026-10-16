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

public class onPlayerUpdate implements Serializable, Cloneable {
   public static final long serialVersionUID = 8223903484171633710L;
   public double jf3;
   public double o1a;
   public double j_n;
   public double uwn;
   public double sgz;
   public double _6_;
   public double m10;
   public double g_y;
   public double ji8;
   public double nqj;
   public double o_8;
   public double na1;
   public double ye8;
   public double h_8;
   public double twh;
   public double f36;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public onPlayerUpdate(
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21,
      double var23,
      double var25,
      double var27,
      double var29,
      double var31
   ) {
      this.jf3 = var1;
      this.o1a = var3;
      this.j_n = var5;
      this.uwn = var7;
      this.sgz = var9;
      this._6_ = var11;
      this.m10 = var13;
      this.g_y = var15;
      this.ji8 = var17;
      this.nqj = var19;
      this.o_8 = var21;
      this.na1 = var23;
      this.ye8 = var25;
      this.h_8 = var27;
      this.twh = var29;
      this.f36 = var31;
   }

   public onPlayerUpdate(double[] var1) {
      this.jf3 = var1[0];
      this.o1a = var1[1];
      this.j_n = var1[2];
      this.uwn = var1[3];
      this.sgz = var1[4];
      this._6_ = var1[5];
      this.m10 = var1[6];
      this.g_y = var1[7];
      this.ji8 = var1[8];
      this.nqj = var1[9];
      this.o_8 = var1[10];
      this.na1 = var1[11];
      this.ye8 = var1[12];
      this.h_8 = var1[13];
      this.twh = var1[14];
      this.f36 = var1[15];
   }

   public onPlayerUpdate(nbf var1, qhn var2, double var3) {
      this.jf3 = var3 * (1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe);
      this.sgz = var3 * 2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe);
      this.ji8 = var3 * 2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8);
      this.o1a = var3 * 2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe);
      this._6_ = var3 * (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe);
      this.nqj = var3 * 2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme);
      this.j_n = var3 * 2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8);
      this.m10 = var3 * 2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme);
      this.o_8 = var3 * (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8);
      this.uwn = var2.v54;
      this.g_y = var2.g0w;
      this.na1 = var2.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public onPlayerUpdate(lwt var1, qhn var2, double var3) {
      this.jf3 = var3 * (1.0 - 2.0 * (double)var1.nc_ * (double)var1.nc_ - 2.0 * (double)var1.ax5 * (double)var1.ax5);
      this.sgz = var3 * 2.0 * (double)(var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.ji8 = var3 * 2.0 * (double)(var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.o1a = var3 * 2.0 * (double)(var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this._6_ = var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.ax5 * (double)var1.ax5);
      this.nqj = var3 * 2.0 * (double)(var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.j_n = var3 * 2.0 * (double)(var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.m10 = var3 * 2.0 * (double)(var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.o_8 = var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.nc_ * (double)var1.nc_);
      this.uwn = var2.v54;
      this.g_y = var2.g0w;
      this.na1 = var2.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public onPlayerUpdate(onPlayerUpdate var1) {
      this.jf3 = var1.jf3;
      this.o1a = var1.o1a;
      this.j_n = var1.j_n;
      this.uwn = var1.uwn;
      this.sgz = var1.sgz;
      this._6_ = var1._6_;
      this.m10 = var1.m10;
      this.g_y = var1.g_y;
      this.ji8 = var1.ji8;
      this.nqj = var1.nqj;
      this.o_8 = var1.o_8;
      this.na1 = var1.na1;
      this.ye8 = var1.ye8;
      this.h_8 = var1.h_8;
      this.twh = var1.twh;
      this.f36 = var1.f36;
   }

   public onPlayerUpdate(krg var1) {
      this.jf3 = (double)var1.j8s;
      this.o1a = (double)var1.f28;
      this.j_n = (double)var1.vwt;
      this.uwn = (double)var1.ygn;
      this.sgz = (double)var1.fno;
      this._6_ = (double)var1.rqb;
      this.m10 = (double)var1.sjv;
      this.g_y = (double)var1.ttd;
      this.ji8 = (double)var1.zcz;
      this.nqj = (double)var1.w4_;
      this.o_8 = (double)var1.fmx;
      this.na1 = (double)var1.f46;
      this.ye8 = (double)var1.g7m;
      this.h_8 = (double)var1.i5l;
      this.twh = (double)var1.sk9;
      this.f36 = (double)var1._40;
   }

   public onPlayerUpdate(nvj var1, qhn var2, double var3) {
      this.jf3 = (double)var1.i2i * var3;
      this.o1a = (double)var1.k12 * var3;
      this.j_n = (double)var1.xu6 * var3;
      this.uwn = var2.v54;
      this.sgz = (double)var1._id * var3;
      this._6_ = (double)var1.aoj * var3;
      this.m10 = (double)var1.zk_ * var3;
      this.g_y = var2.g0w;
      this.ji8 = (double)var1.aqg * var3;
      this.nqj = (double)var1.wdt * var3;
      this.o_8 = (double)var1.jr8 * var3;
      this.na1 = var2.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public onPlayerUpdate(iww var1, qhn var2, double var3) {
      this.jf3 = var1.lxb * var3;
      this.o1a = var1.y3c * var3;
      this.j_n = var1.bhd * var3;
      this.uwn = var2.v54;
      this.sgz = var1.get * var3;
      this._6_ = var1.pwn * var3;
      this.m10 = var1.c84 * var3;
      this.g_y = var2.g0w;
      this.ji8 = var1.y7q * var3;
      this.nqj = var1._o7 * var3;
      this.o_8 = var1.ffq * var3;
      this.na1 = var2.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public onPlayerUpdate() {
      this.jf3 = 0.0;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = 0.0;
      this.sgz = 0.0;
      this._6_ = 0.0;
      this.m10 = 0.0;
      this.g_y = 0.0;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = 0.0;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 0.0;
   }

   @Override
   public String toString() {
      long var1 = a ^ 88396840068139L;
      return this.jf3
         + a<"o">(1239, 725651196211257321L ^ var1)
         + this.o1a
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.j_n
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.uwn
         + "\n"
         + this.sgz
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this._6_
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.m10
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.g_y
         + "\n"
         + this.ji8
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.nqj
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.o_8
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.na1
         + "\n"
         + this.ye8
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.h_8
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.twh
         + a<"o">(1515, 7102423305248956116L ^ var1)
         + this.f36
         + "\n";
   }

   public final void a3j() {
      this.jf3 = 1.0;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = 0.0;
      this.sgz = 0.0;
      this._6_ = 1.0;
      this.m10 = 0.0;
      this.g_y = 0.0;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = 1.0;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void mgo(int param1, int param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 61032194565975
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 7
      // 00e: iload 1
      // 00f: iload 7
      // 011: ifne 039
      // 014: tableswitch 550 0 3 36 166 294 422
      // 034: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 037: athrow
      // 038: iload 2
      // 039: tableswitch 99 0 3 31 48 65 82
      // 058: aload 0
      // 059: dload 3
      // 05a: putfield onPlayerUpdate.jf3 D
      // 05d: iload 7
      // 05f: ifeq 254
      // 062: goto 069
      // 065: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 068: athrow
      // 069: aload 0
      // 06a: dload 3
      // 06b: putfield onPlayerUpdate.o1a D
      // 06e: iload 7
      // 070: ifeq 254
      // 073: goto 07a
      // 076: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 079: athrow
      // 07a: aload 0
      // 07b: dload 3
      // 07c: putfield onPlayerUpdate.j_n D
      // 07f: iload 7
      // 081: ifeq 254
      // 084: goto 08b
      // 087: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08a: athrow
      // 08b: aload 0
      // 08c: dload 3
      // 08d: putfield onPlayerUpdate.uwn D
      // 090: iload 7
      // 092: ifeq 254
      // 095: goto 09c
      // 098: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: new java/lang/ArrayIndexOutOfBoundsException
      // 09f: dup
      // 0a0: sipush 9212
      // 0a3: ldc2_w 1515564843016616883
      // 0a6: lload 5
      // 0a8: lxor
      // 0a9: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: nop
      // 0af: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0b2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 0b5: athrow
      // 0b6: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b9: athrow
      // 0ba: iload 2
      // 0bb: tableswitch 97 0 3 29 46 63 80
      // 0d8: aload 0
      // 0d9: dload 3
      // 0da: putfield onPlayerUpdate.sgz D
      // 0dd: iload 7
      // 0df: ifeq 254
      // 0e2: goto 0e9
      // 0e5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: dload 3
      // 0eb: putfield onPlayerUpdate._6_ D
      // 0ee: iload 7
      // 0f0: ifeq 254
      // 0f3: goto 0fa
      // 0f6: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: dload 3
      // 0fc: putfield onPlayerUpdate.m10 D
      // 0ff: iload 7
      // 101: ifeq 254
      // 104: goto 10b
      // 107: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: aload 0
      // 10c: dload 3
      // 10d: putfield onPlayerUpdate.g_y D
      // 110: iload 7
      // 112: ifeq 254
      // 115: goto 11c
      // 118: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11b: athrow
      // 11c: new java/lang/ArrayIndexOutOfBoundsException
      // 11f: dup
      // 120: sipush 9288
      // 123: ldc2_w 8846923077457542152
      // 126: lload 5
      // 128: lxor
      // 129: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: nop
      // 12f: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 132: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 135: athrow
      // 136: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 139: athrow
      // 13a: iload 2
      // 13b: tableswitch 97 0 3 29 46 63 80
      // 158: aload 0
      // 159: dload 3
      // 15a: putfield onPlayerUpdate.ji8 D
      // 15d: iload 7
      // 15f: ifeq 254
      // 162: goto 169
      // 165: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 168: athrow
      // 169: aload 0
      // 16a: dload 3
      // 16b: putfield onPlayerUpdate.nqj D
      // 16e: iload 7
      // 170: ifeq 254
      // 173: goto 17a
      // 176: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 179: athrow
      // 17a: aload 0
      // 17b: dload 3
      // 17c: putfield onPlayerUpdate.o_8 D
      // 17f: iload 7
      // 181: ifeq 254
      // 184: goto 18b
      // 187: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18a: athrow
      // 18b: aload 0
      // 18c: dload 3
      // 18d: putfield onPlayerUpdate.na1 D
      // 190: iload 7
      // 192: ifeq 254
      // 195: goto 19c
      // 198: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19b: athrow
      // 19c: new java/lang/ArrayIndexOutOfBoundsException
      // 19f: dup
      // 1a0: sipush 9288
      // 1a3: ldc2_w 8846923077457542152
      // 1a6: lload 5
      // 1a8: lxor
      // 1a9: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: nop
      // 1af: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 1b2: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 1b5: athrow
      // 1b6: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b9: athrow
      // 1ba: iload 2
      // 1bb: tableswitch 97 0 3 29 46 63 80
      // 1d8: aload 0
      // 1d9: dload 3
      // 1da: putfield onPlayerUpdate.ye8 D
      // 1dd: iload 7
      // 1df: ifeq 254
      // 1e2: goto 1e9
      // 1e5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: dload 3
      // 1eb: putfield onPlayerUpdate.h_8 D
      // 1ee: iload 7
      // 1f0: ifeq 254
      // 1f3: goto 1fa
      // 1f6: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: dload 3
      // 1fc: putfield onPlayerUpdate.twh D
      // 1ff: iload 7
      // 201: ifeq 254
      // 204: goto 20b
      // 207: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20a: athrow
      // 20b: aload 0
      // 20c: dload 3
      // 20d: putfield onPlayerUpdate.f36 D
      // 210: iload 7
      // 212: ifeq 254
      // 215: goto 21c
      // 218: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21b: athrow
      // 21c: new java/lang/ArrayIndexOutOfBoundsException
      // 21f: dup
      // 220: sipush 9288
      // 223: ldc2_w 8846923077457542152
      // 226: lload 5
      // 228: lxor
      // 229: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: nop
      // 22f: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 232: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 235: athrow
      // 236: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 239: athrow
      // 23a: new java/lang/ArrayIndexOutOfBoundsException
      // 23d: dup
      // 23e: sipush 9288
      // 241: ldc2_w 8846923077457542152
      // 244: lload 5
      // 246: lxor
      // 247: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: nop
      // 24d: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 250: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 253: athrow
      // 254: return
   }

   public final double egj(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 63861160251045
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifeq 035
      // 013: tableswitch 284 0 3 33 94 158 222
      // 030: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 033: athrow
      // 034: iload 2
      // 035: tableswitch 55 0 3 31 40 45 50
      // 054: aload 0
      // 055: getfield onPlayerUpdate.jf3 D
      // 058: dreturn
      // 059: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield onPlayerUpdate.o1a D
      // 061: dreturn
      // 062: aload 0
      // 063: getfield onPlayerUpdate.j_n D
      // 066: dreturn
      // 067: aload 0
      // 068: getfield onPlayerUpdate.uwn D
      // 06b: dreturn
      // 06c: iload 5
      // 06e: ifne 12f
      // 071: iload 2
      // 072: tableswitch 58 0 3 34 43 48 53
      // 090: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 093: athrow
      // 094: aload 0
      // 095: getfield onPlayerUpdate.sgz D
      // 098: dreturn
      // 099: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield onPlayerUpdate._6_ D
      // 0a1: dreturn
      // 0a2: aload 0
      // 0a3: getfield onPlayerUpdate.m10 D
      // 0a6: dreturn
      // 0a7: aload 0
      // 0a8: getfield onPlayerUpdate.g_y D
      // 0ab: dreturn
      // 0ac: iload 5
      // 0ae: ifne 12f
      // 0b1: iload 2
      // 0b2: tableswitch 58 0 3 34 43 48 53
      // 0d0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield onPlayerUpdate.ji8 D
      // 0d8: dreturn
      // 0d9: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield onPlayerUpdate.nqj D
      // 0e1: dreturn
      // 0e2: aload 0
      // 0e3: getfield onPlayerUpdate.o_8 D
      // 0e6: dreturn
      // 0e7: aload 0
      // 0e8: getfield onPlayerUpdate.na1 D
      // 0eb: dreturn
      // 0ec: iload 5
      // 0ee: ifne 12f
      // 0f1: iload 2
      // 0f2: tableswitch 58 0 3 34 43 48 53
      // 110: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 113: athrow
      // 114: aload 0
      // 115: getfield onPlayerUpdate.ye8 D
      // 118: dreturn
      // 119: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield onPlayerUpdate.h_8 D
      // 121: dreturn
      // 122: aload 0
      // 123: getfield onPlayerUpdate.twh D
      // 126: dreturn
      // 127: aload 0
      // 128: getfield onPlayerUpdate.f36 D
      // 12b: dreturn
      // 12c: goto 12f
      // 12f: new java/lang/ArrayIndexOutOfBoundsException
      // 132: dup
      // 133: sipush 11474
      // 136: ldc2_w 5680301535804693861
      // 139: lload 3
      // 13a: lxor
      // 13b: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: nop
      // 141: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 144: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 147: athrow
   }

   public final void c2p(int param1, v71 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 15542954000770
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifne 051
      // 013: ifne 049
      // 016: goto 01d
      // 019: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: aload 0
      // 01f: getfield onPlayerUpdate.jf3 D
      // 022: putfield v71.yme D
      // 025: aload 2
      // 026: aload 0
      // 027: getfield onPlayerUpdate.o1a D
      // 02a: putfield v71.pf8 D
      // 02d: aload 2
      // 02e: aload 0
      // 02f: getfield onPlayerUpdate.j_n D
      // 032: putfield v71.jfe D
      // 035: aload 2
      // 036: aload 0
      // 037: getfield onPlayerUpdate.uwn D
      // 03a: putfield v71.ggc D
      // 03d: iload 5
      // 03f: ifeq 126
      // 042: goto 049
      // 045: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 1
      // 04a: goto 051
      // 04d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 050: athrow
      // 051: bipush 1
      // 052: iload 5
      // 054: ifne 096
      // 057: if_icmpne 08d
      // 05a: goto 061
      // 05d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: aload 2
      // 062: aload 0
      // 063: getfield onPlayerUpdate.sgz D
      // 066: putfield v71.yme D
      // 069: aload 2
      // 06a: aload 0
      // 06b: getfield onPlayerUpdate._6_ D
      // 06e: putfield v71.pf8 D
      // 071: aload 2
      // 072: aload 0
      // 073: getfield onPlayerUpdate.m10 D
      // 076: putfield v71.jfe D
      // 079: aload 2
      // 07a: aload 0
      // 07b: getfield onPlayerUpdate.g_y D
      // 07e: putfield v71.ggc D
      // 081: iload 5
      // 083: ifeq 126
      // 086: goto 08d
      // 089: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08c: athrow
      // 08d: iload 1
      // 08e: bipush 2
      // 08f: goto 096
      // 092: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 095: athrow
      // 096: iload 5
      // 098: ifne 0da
      // 09b: if_icmpne 0d1
      // 09e: goto 0a5
      // 0a1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: aload 2
      // 0a6: aload 0
      // 0a7: getfield onPlayerUpdate.ji8 D
      // 0aa: putfield v71.yme D
      // 0ad: aload 2
      // 0ae: aload 0
      // 0af: getfield onPlayerUpdate.nqj D
      // 0b2: putfield v71.pf8 D
      // 0b5: aload 2
      // 0b6: aload 0
      // 0b7: getfield onPlayerUpdate.o_8 D
      // 0ba: putfield v71.jfe D
      // 0bd: aload 2
      // 0be: aload 0
      // 0bf: getfield onPlayerUpdate.na1 D
      // 0c2: putfield v71.ggc D
      // 0c5: iload 5
      // 0c7: ifeq 126
      // 0ca: goto 0d1
      // 0cd: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: iload 1
      // 0d2: bipush 3
      // 0d3: goto 0da
      // 0d6: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d9: athrow
      // 0da: if_icmpne 109
      // 0dd: aload 2
      // 0de: aload 0
      // 0df: getfield onPlayerUpdate.ye8 D
      // 0e2: putfield v71.yme D
      // 0e5: aload 2
      // 0e6: aload 0
      // 0e7: getfield onPlayerUpdate.h_8 D
      // 0ea: putfield v71.pf8 D
      // 0ed: aload 2
      // 0ee: aload 0
      // 0ef: getfield onPlayerUpdate.twh D
      // 0f2: putfield v71.jfe D
      // 0f5: aload 2
      // 0f6: aload 0
      // 0f7: getfield onPlayerUpdate.f36 D
      // 0fa: putfield v71.ggc D
      // 0fd: iload 5
      // 0ff: ifeq 126
      // 102: goto 109
      // 105: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 108: athrow
      // 109: new java/lang/ArrayIndexOutOfBoundsException
      // 10c: dup
      // 10d: sipush 13850
      // 110: ldc2_w 8422788939916544136
      // 113: lload 3
      // 114: lxor
      // 115: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 11e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 121: athrow
      // 122: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 125: athrow
      // 126: return
   }

   public final void vbp(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 20983713526726
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifne 04d
      // 013: ifne 045
      // 016: goto 01d
      // 019: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: bipush 0
      // 01f: aload 0
      // 020: getfield onPlayerUpdate.jf3 D
      // 023: dastore
      // 024: aload 2
      // 025: bipush 1
      // 026: aload 0
      // 027: getfield onPlayerUpdate.o1a D
      // 02a: dastore
      // 02b: aload 2
      // 02c: bipush 2
      // 02d: aload 0
      // 02e: getfield onPlayerUpdate.j_n D
      // 031: dastore
      // 032: aload 2
      // 033: bipush 3
      // 034: aload 0
      // 035: getfield onPlayerUpdate.uwn D
      // 038: dastore
      // 039: iload 5
      // 03b: ifeq 116
      // 03e: goto 045
      // 041: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: iload 1
      // 046: goto 04d
      // 049: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04c: athrow
      // 04d: bipush 1
      // 04e: iload 5
      // 050: ifne 08e
      // 053: if_icmpne 085
      // 056: goto 05d
      // 059: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: aload 2
      // 05e: bipush 0
      // 05f: aload 0
      // 060: getfield onPlayerUpdate.sgz D
      // 063: dastore
      // 064: aload 2
      // 065: bipush 1
      // 066: aload 0
      // 067: getfield onPlayerUpdate._6_ D
      // 06a: dastore
      // 06b: aload 2
      // 06c: bipush 2
      // 06d: aload 0
      // 06e: getfield onPlayerUpdate.m10 D
      // 071: dastore
      // 072: aload 2
      // 073: bipush 3
      // 074: aload 0
      // 075: getfield onPlayerUpdate.g_y D
      // 078: dastore
      // 079: iload 5
      // 07b: ifeq 116
      // 07e: goto 085
      // 081: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 1
      // 086: bipush 2
      // 087: goto 08e
      // 08a: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08d: athrow
      // 08e: iload 5
      // 090: ifne 0ce
      // 093: if_icmpne 0c5
      // 096: goto 09d
      // 099: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09c: athrow
      // 09d: aload 2
      // 09e: bipush 0
      // 09f: aload 0
      // 0a0: getfield onPlayerUpdate.ji8 D
      // 0a3: dastore
      // 0a4: aload 2
      // 0a5: bipush 1
      // 0a6: aload 0
      // 0a7: getfield onPlayerUpdate.nqj D
      // 0aa: dastore
      // 0ab: aload 2
      // 0ac: bipush 2
      // 0ad: aload 0
      // 0ae: getfield onPlayerUpdate.o_8 D
      // 0b1: dastore
      // 0b2: aload 2
      // 0b3: bipush 3
      // 0b4: aload 0
      // 0b5: getfield onPlayerUpdate.na1 D
      // 0b8: dastore
      // 0b9: iload 5
      // 0bb: ifeq 116
      // 0be: goto 0c5
      // 0c1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c4: athrow
      // 0c5: iload 1
      // 0c6: bipush 3
      // 0c7: goto 0ce
      // 0ca: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cd: athrow
      // 0ce: if_icmpne 0f9
      // 0d1: aload 2
      // 0d2: bipush 0
      // 0d3: aload 0
      // 0d4: getfield onPlayerUpdate.ye8 D
      // 0d7: dastore
      // 0d8: aload 2
      // 0d9: bipush 1
      // 0da: aload 0
      // 0db: getfield onPlayerUpdate.h_8 D
      // 0de: dastore
      // 0df: aload 2
      // 0e0: bipush 2
      // 0e1: aload 0
      // 0e2: getfield onPlayerUpdate.twh D
      // 0e5: dastore
      // 0e6: aload 2
      // 0e7: bipush 3
      // 0e8: aload 0
      // 0e9: getfield onPlayerUpdate.f36 D
      // 0ec: dastore
      // 0ed: iload 5
      // 0ef: ifeq 116
      // 0f2: goto 0f9
      // 0f5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f8: athrow
      // 0f9: new java/lang/ArrayIndexOutOfBoundsException
      // 0fc: dup
      // 0fd: sipush 856
      // 100: ldc2_w 3828528351010148228
      // 103: lload 3
      // 104: lxor
      // 105: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 10e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 111: athrow
      // 112: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 115: athrow
      // 116: return
   }

   public final void maq(int param1, v71 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 59196456165376
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifeq 051
      // 013: ifne 049
      // 016: goto 01d
      // 019: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: aload 0
      // 01f: getfield onPlayerUpdate.jf3 D
      // 022: putfield v71.yme D
      // 025: aload 2
      // 026: aload 0
      // 027: getfield onPlayerUpdate.sgz D
      // 02a: putfield v71.pf8 D
      // 02d: aload 2
      // 02e: aload 0
      // 02f: getfield onPlayerUpdate.ji8 D
      // 032: putfield v71.jfe D
      // 035: aload 2
      // 036: aload 0
      // 037: getfield onPlayerUpdate.ye8 D
      // 03a: putfield v71.ggc D
      // 03d: iload 5
      // 03f: ifne 126
      // 042: goto 049
      // 045: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 1
      // 04a: goto 051
      // 04d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 050: athrow
      // 051: bipush 1
      // 052: iload 5
      // 054: ifeq 096
      // 057: if_icmpne 08d
      // 05a: goto 061
      // 05d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: aload 2
      // 062: aload 0
      // 063: getfield onPlayerUpdate.o1a D
      // 066: putfield v71.yme D
      // 069: aload 2
      // 06a: aload 0
      // 06b: getfield onPlayerUpdate._6_ D
      // 06e: putfield v71.pf8 D
      // 071: aload 2
      // 072: aload 0
      // 073: getfield onPlayerUpdate.nqj D
      // 076: putfield v71.jfe D
      // 079: aload 2
      // 07a: aload 0
      // 07b: getfield onPlayerUpdate.h_8 D
      // 07e: putfield v71.ggc D
      // 081: iload 5
      // 083: ifne 126
      // 086: goto 08d
      // 089: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08c: athrow
      // 08d: iload 1
      // 08e: bipush 2
      // 08f: goto 096
      // 092: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 095: athrow
      // 096: iload 5
      // 098: ifeq 0da
      // 09b: if_icmpne 0d1
      // 09e: goto 0a5
      // 0a1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a4: athrow
      // 0a5: aload 2
      // 0a6: aload 0
      // 0a7: getfield onPlayerUpdate.j_n D
      // 0aa: putfield v71.yme D
      // 0ad: aload 2
      // 0ae: aload 0
      // 0af: getfield onPlayerUpdate.m10 D
      // 0b2: putfield v71.pf8 D
      // 0b5: aload 2
      // 0b6: aload 0
      // 0b7: getfield onPlayerUpdate.o_8 D
      // 0ba: putfield v71.jfe D
      // 0bd: aload 2
      // 0be: aload 0
      // 0bf: getfield onPlayerUpdate.twh D
      // 0c2: putfield v71.ggc D
      // 0c5: iload 5
      // 0c7: ifne 126
      // 0ca: goto 0d1
      // 0cd: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: iload 1
      // 0d2: bipush 3
      // 0d3: goto 0da
      // 0d6: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d9: athrow
      // 0da: if_icmpne 109
      // 0dd: aload 2
      // 0de: aload 0
      // 0df: getfield onPlayerUpdate.uwn D
      // 0e2: putfield v71.yme D
      // 0e5: aload 2
      // 0e6: aload 0
      // 0e7: getfield onPlayerUpdate.g_y D
      // 0ea: putfield v71.pf8 D
      // 0ed: aload 2
      // 0ee: aload 0
      // 0ef: getfield onPlayerUpdate.na1 D
      // 0f2: putfield v71.jfe D
      // 0f5: aload 2
      // 0f6: aload 0
      // 0f7: getfield onPlayerUpdate.f36 D
      // 0fa: putfield v71.ggc D
      // 0fd: iload 5
      // 0ff: ifne 126
      // 102: goto 109
      // 105: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 108: athrow
      // 109: new java/lang/ArrayIndexOutOfBoundsException
      // 10c: dup
      // 10d: sipush 29896
      // 110: ldc2_w 1246226643755576286
      // 113: lload 3
      // 114: lxor
      // 115: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 11e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 121: athrow
      // 122: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 125: athrow
      // 126: return
   }

   public final void d4f(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 85453269891169
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: iload 1
      // 00e: iload 5
      // 010: ifne 04d
      // 013: ifne 045
      // 016: goto 01d
      // 019: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: bipush 0
      // 01f: aload 0
      // 020: getfield onPlayerUpdate.jf3 D
      // 023: dastore
      // 024: aload 2
      // 025: bipush 1
      // 026: aload 0
      // 027: getfield onPlayerUpdate.sgz D
      // 02a: dastore
      // 02b: aload 2
      // 02c: bipush 2
      // 02d: aload 0
      // 02e: getfield onPlayerUpdate.ji8 D
      // 031: dastore
      // 032: aload 2
      // 033: bipush 3
      // 034: aload 0
      // 035: getfield onPlayerUpdate.ye8 D
      // 038: dastore
      // 039: iload 5
      // 03b: ifeq 116
      // 03e: goto 045
      // 041: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: iload 1
      // 046: goto 04d
      // 049: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04c: athrow
      // 04d: bipush 1
      // 04e: iload 5
      // 050: ifne 08e
      // 053: if_icmpne 085
      // 056: goto 05d
      // 059: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05c: athrow
      // 05d: aload 2
      // 05e: bipush 0
      // 05f: aload 0
      // 060: getfield onPlayerUpdate.o1a D
      // 063: dastore
      // 064: aload 2
      // 065: bipush 1
      // 066: aload 0
      // 067: getfield onPlayerUpdate._6_ D
      // 06a: dastore
      // 06b: aload 2
      // 06c: bipush 2
      // 06d: aload 0
      // 06e: getfield onPlayerUpdate.nqj D
      // 071: dastore
      // 072: aload 2
      // 073: bipush 3
      // 074: aload 0
      // 075: getfield onPlayerUpdate.h_8 D
      // 078: dastore
      // 079: iload 5
      // 07b: ifeq 116
      // 07e: goto 085
      // 081: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 1
      // 086: bipush 2
      // 087: goto 08e
      // 08a: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08d: athrow
      // 08e: iload 5
      // 090: ifne 0ce
      // 093: if_icmpne 0c5
      // 096: goto 09d
      // 099: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09c: athrow
      // 09d: aload 2
      // 09e: bipush 0
      // 09f: aload 0
      // 0a0: getfield onPlayerUpdate.j_n D
      // 0a3: dastore
      // 0a4: aload 2
      // 0a5: bipush 1
      // 0a6: aload 0
      // 0a7: getfield onPlayerUpdate.m10 D
      // 0aa: dastore
      // 0ab: aload 2
      // 0ac: bipush 2
      // 0ad: aload 0
      // 0ae: getfield onPlayerUpdate.o_8 D
      // 0b1: dastore
      // 0b2: aload 2
      // 0b3: bipush 3
      // 0b4: aload 0
      // 0b5: getfield onPlayerUpdate.twh D
      // 0b8: dastore
      // 0b9: iload 5
      // 0bb: ifeq 116
      // 0be: goto 0c5
      // 0c1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c4: athrow
      // 0c5: iload 1
      // 0c6: bipush 3
      // 0c7: goto 0ce
      // 0ca: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cd: athrow
      // 0ce: if_icmpne 0f9
      // 0d1: aload 2
      // 0d2: bipush 0
      // 0d3: aload 0
      // 0d4: getfield onPlayerUpdate.uwn D
      // 0d7: dastore
      // 0d8: aload 2
      // 0d9: bipush 1
      // 0da: aload 0
      // 0db: getfield onPlayerUpdate.g_y D
      // 0de: dastore
      // 0df: aload 2
      // 0e0: bipush 2
      // 0e1: aload 0
      // 0e2: getfield onPlayerUpdate.na1 D
      // 0e5: dastore
      // 0e6: aload 2
      // 0e7: bipush 3
      // 0e8: aload 0
      // 0e9: getfield onPlayerUpdate.f36 D
      // 0ec: dastore
      // 0ed: iload 5
      // 0ef: ifeq 116
      // 0f2: goto 0f9
      // 0f5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f8: athrow
      // 0f9: new java/lang/ArrayIndexOutOfBoundsException
      // 0fc: dup
      // 0fd: sipush 1692
      // 100: ldc2_w 7450929909798683106
      // 103: lload 3
      // 104: lxor
      // 105: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 10e: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // 111: athrow
      // 112: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 115: athrow
      // 116: return
   }

   public final void ay1(iww var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.o3l(var3, var2);
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

   public final void avm(nvj var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.o3l(var3, var2);
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

   public final double wr7(iww var1, qhn var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.o3l(var4, var3);
      var1.lxb = var3[0];
      var1.y3c = var3[1];
      var1.bhd = var3[2];
      var1.get = var3[3];
      var1.pwn = var3[4];
      var1.c84 = var3[5];
      var1.y7q = var3[6];
      var1._o7 = var3[7];
      var1.ffq = var3[8];
      var2.v54 = this.uwn;
      var2.g0w = this.g_y;
      var2.mu9 = this.na1;
      return iww.okm(var4);
   }

   public final double _on(nvj var1, qhn var2) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.o3l(var4, var3);
      var1.i2i = (float)var3[0];
      var1.k12 = (float)var3[1];
      var1.xu6 = (float)var3[2];
      var1._id = (float)var3[3];
      var1.aoj = (float)var3[4];
      var1.zk_ = (float)var3[5];
      var1.aqg = (float)var3[6];
      var1.wdt = (float)var3[7];
      var1.jr8 = (float)var3[8];
      var2.v54 = this.uwn;
      var2.g0w = this.g_y;
      var2.mu9 = this.na1;
      return iww.okm(var4);
   }

   public final void wye(lwt param1) {
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
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: bipush 3
      // 009: newarray 7
      // 00b: astore 4
      // 00d: aload 0
      // 00e: aload 4
      // 010: aload 3
      // 011: invokespecial onPlayerUpdate.o3l ([D[D)V
      // 014: istore 2
      // 015: ldc2_w 0.25
      // 018: dconst_1
      // 019: aload 3
      // 01a: bipush 0
      // 01b: daload
      // 01c: dadd
      // 01d: aload 3
      // 01e: bipush 4
      // 01f: daload
      // 020: dadd
      // 021: aload 3
      // 022: bipush 8
      // 024: daload
      // 025: dadd
      // 026: dmul
      // 027: dstore 5
      // 029: dload 5
      // 02b: iload 2
      // 02c: ifne 045
      // 02f: dconst_0
      // 030: dcmpg
      // 031: ifge 048
      // 034: goto 03b
      // 037: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03a: athrow
      // 03b: dload 5
      // 03d: dneg
      // 03e: goto 045
      // 041: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: goto 04a
      // 048: dload 5
      // 04a: ldc2_w 1.0E-30
      // 04d: dcmpg
      // 04e: iload 2
      // 04f: ifne 0c3
      // 052: iflt 0a1
      // 055: goto 05c
      // 058: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 0bf: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c2: athrow
      // 0c3: ifge 0d3
      // 0c6: dload 5
      // 0c8: dneg
      // 0c9: goto 0d0
      // 0cc: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cf: athrow
      // 0d0: goto 0d5
      // 0d3: dload 5
      // 0d5: ldc2_w 1.0E-30
      // 0d8: dcmpg
      // 0d9: iload 2
      // 0da: ifne 134
      // 0dd: iflt 114
      // 0e0: goto 0e7
      // 0e3: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 130: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 133: athrow
      // 134: ifge 144
      // 137: dload 5
      // 139: dneg
      // 13a: goto 141
      // 13d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 16b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16e: athrow
      // 16f: aload 1
      // 170: fconst_0
      // 171: putfield lwt.nc_ F
      // 174: aload 1
      // 175: fconst_1
      // 176: putfield lwt.ax5 F
      // 179: return
   }

   public final void qpf(nbf param1) {
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
      // 005: invokestatic OpaquePredicate.b ()I
      // 008: bipush 3
      // 009: newarray 7
      // 00b: astore 4
      // 00d: istore 2
      // 00e: aload 0
      // 00f: aload 4
      // 011: aload 3
      // 012: invokespecial onPlayerUpdate.o3l ([D[D)V
      // 015: ldc2_w 0.25
      // 018: dconst_1
      // 019: aload 3
      // 01a: bipush 0
      // 01b: daload
      // 01c: dadd
      // 01d: aload 3
      // 01e: bipush 4
      // 01f: daload
      // 020: dadd
      // 021: aload 3
      // 022: bipush 8
      // 024: daload
      // 025: dadd
      // 026: dmul
      // 027: dstore 5
      // 029: dload 5
      // 02b: iload 2
      // 02c: ifeq 045
      // 02f: dconst_0
      // 030: dcmpg
      // 031: ifge 048
      // 034: goto 03b
      // 037: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03a: athrow
      // 03b: dload 5
      // 03d: dneg
      // 03e: goto 045
      // 041: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 044: athrow
      // 045: goto 04a
      // 048: dload 5
      // 04a: ldc2_w 1.0E-30
      // 04d: dcmpg
      // 04e: iload 2
      // 04f: ifeq 0be
      // 052: iflt 09c
      // 055: goto 05c
      // 058: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: aload 1
      // 05d: dload 5
      // 05f: invokestatic java/lang/Math.sqrt (D)D
      // 062: putfield nbf.ggc D
      // 065: ldc2_w 0.25
      // 068: aload 1
      // 069: getfield nbf.ggc D
      // 06c: ddiv
      // 06d: dstore 5
      // 06f: aload 1
      // 070: aload 3
      // 071: bipush 7
      // 073: daload
      // 074: aload 3
      // 075: bipush 5
      // 076: daload
      // 077: dsub
      // 078: dload 5
      // 07a: dmul
      // 07b: putfield nbf.yme D
      // 07e: aload 1
      // 07f: aload 3
      // 080: bipush 2
      // 081: daload
      // 082: aload 3
      // 083: bipush 6
      // 085: daload
      // 086: dsub
      // 087: dload 5
      // 089: dmul
      // 08a: putfield nbf.pf8 D
      // 08d: aload 1
      // 08e: aload 3
      // 08f: bipush 3
      // 090: daload
      // 091: aload 3
      // 092: bipush 1
      // 093: daload
      // 094: dsub
      // 095: dload 5
      // 097: dmul
      // 098: putfield nbf.jfe D
      // 09b: return
      // 09c: aload 1
      // 09d: dconst_0
      // 09e: putfield nbf.ggc D
      // 0a1: ldc2_w -0.5
      // 0a4: aload 3
      // 0a5: bipush 4
      // 0a6: daload
      // 0a7: aload 3
      // 0a8: bipush 8
      // 0aa: daload
      // 0ab: dadd
      // 0ac: dmul
      // 0ad: dstore 5
      // 0af: dload 5
      // 0b1: iload 2
      // 0b2: ifeq 0cb
      // 0b5: dconst_0
      // 0b6: dcmpg
      // 0b7: goto 0be
      // 0ba: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bd: athrow
      // 0be: ifge 0ce
      // 0c1: dload 5
      // 0c3: dneg
      // 0c4: goto 0cb
      // 0c7: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ca: athrow
      // 0cb: goto 0d0
      // 0ce: dload 5
      // 0d0: ldc2_w 1.0E-30
      // 0d3: dcmpg
      // 0d4: iload 2
      // 0d5: ifeq 12b
      // 0d8: iflt 10b
      // 0db: goto 0e2
      // 0de: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: dload 5
      // 0e5: invokestatic java/lang/Math.sqrt (D)D
      // 0e8: putfield nbf.yme D
      // 0eb: ldc2_w 0.5
      // 0ee: aload 1
      // 0ef: getfield nbf.yme D
      // 0f2: ddiv
      // 0f3: dstore 5
      // 0f5: aload 1
      // 0f6: aload 3
      // 0f7: bipush 3
      // 0f8: daload
      // 0f9: dload 5
      // 0fb: dmul
      // 0fc: putfield nbf.pf8 D
      // 0ff: aload 1
      // 100: aload 3
      // 101: bipush 6
      // 103: daload
      // 104: dload 5
      // 106: dmul
      // 107: putfield nbf.jfe D
      // 10a: return
      // 10b: aload 1
      // 10c: dconst_0
      // 10d: putfield nbf.yme D
      // 110: ldc2_w 0.5
      // 113: dconst_1
      // 114: aload 3
      // 115: bipush 8
      // 117: daload
      // 118: dsub
      // 119: dmul
      // 11a: dstore 5
      // 11c: dload 5
      // 11e: iload 2
      // 11f: ifeq 138
      // 122: dconst_0
      // 123: dcmpg
      // 124: goto 12b
      // 127: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12a: athrow
      // 12b: ifge 13b
      // 12e: dload 5
      // 130: dneg
      // 131: goto 138
      // 134: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 137: athrow
      // 138: goto 13d
      // 13b: dload 5
      // 13d: ldc2_w 1.0E-30
      // 140: dcmpg
      // 141: iflt 163
      // 144: aload 1
      // 145: dload 5
      // 147: invokestatic java/lang/Math.sqrt (D)D
      // 14a: putfield nbf.pf8 D
      // 14d: aload 1
      // 14e: aload 3
      // 14f: bipush 7
      // 151: daload
      // 152: ldc2_w 2.0
      // 155: aload 1
      // 156: getfield nbf.pf8 D
      // 159: dmul
      // 15a: ddiv
      // 15b: putfield nbf.jfe D
      // 15e: return
      // 15f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 162: athrow
      // 163: aload 1
      // 164: dconst_0
      // 165: putfield nbf.pf8 D
      // 168: aload 1
      // 169: dconst_1
      // 16a: putfield nbf.jfe D
      // 16d: return
   }

   public final void t1p(qhn var1) {
      var1.v54 = this.uwn;
      var1.g0w = this.g_y;
      var1.mu9 = this.na1;
   }

   public final void kvo(nvj var1) {
      var1.i2i = (float)this.jf3;
      var1.k12 = (float)this.o1a;
      var1.xu6 = (float)this.j_n;
      var1._id = (float)this.sgz;
      var1.aoj = (float)this._6_;
      var1.zk_ = (float)this.m10;
      var1.aqg = (float)this.ji8;
      var1.wdt = (float)this.nqj;
      var1.jr8 = (float)this.o_8;
   }

   public final void g8p(iww var1) {
      var1.lxb = this.jf3;
      var1.y3c = this.o1a;
      var1.bhd = this.j_n;
      var1.get = this.sgz;
      var1.pwn = this._6_;
      var1.c84 = this.m10;
      var1.y7q = this.ji8;
      var1._o7 = this.nqj;
      var1.ffq = this.o_8;
   }

   public final double el9() {
      double[] var1 = new double[9];
      double[] var2 = new double[3];
      this.o3l(var2, var1);
      return iww.okm(var2);
   }

   public final void mbt(iww var1) {
      this.jf3 = var1.lxb;
      this.o1a = var1.y3c;
      this.j_n = var1.bhd;
      this.sgz = var1.get;
      this._6_ = var1.pwn;
      this.m10 = var1.c84;
      this.ji8 = var1.y7q;
      this.nqj = var1._o7;
      this.o_8 = var1.ffq;
   }

   public final void ihu(nvj var1) {
      this.jf3 = (double)var1.i2i;
      this.o1a = (double)var1.k12;
      this.j_n = (double)var1.xu6;
      this.sgz = (double)var1._id;
      this._6_ = (double)var1.aoj;
      this.m10 = (double)var1.zk_;
      this.ji8 = (double)var1.aqg;
      this.nqj = (double)var1.wdt;
      this.o_8 = (double)var1.jr8;
   }

   public final void tcj(double var1) {
      double[] var3 = new double[9];
      double[] var4 = new double[3];
      this.o3l(var4, var3);
      this.jf3 = var3[0] * var1;
      this.o1a = var3[1] * var1;
      this.j_n = var3[2] * var1;
      this.sgz = var3[3] * var1;
      this._6_ = var3[4] * var1;
      this.m10 = var3[5] * var1;
      this.ji8 = var3[6] * var1;
      this.nqj = var3[7] * var1;
      this.o_8 = var3[8] * var1;
   }

   public final void cv4(int param1, double param2, double param4, double param6, double param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic onPlayerUpdate.a J
      // 03: ldc2_w 44001776979761
      // 06: lxor
      // 07: lstore 10
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 12
      // 0e: iload 1
      // 0f: tableswitch 169 0 3 29 64 99 134
      // 2c: aload 0
      // 2d: dload 2
      // 2e: putfield onPlayerUpdate.jf3 D
      // 31: aload 0
      // 32: dload 4
      // 34: putfield onPlayerUpdate.o1a D
      // 37: aload 0
      // 38: dload 6
      // 3a: putfield onPlayerUpdate.j_n D
      // 3d: aload 0
      // 3e: dload 8
      // 40: putfield onPlayerUpdate.uwn D
      // 43: iload 12
      // 45: ifeq d6
      // 48: goto 4f
      // 4b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 2
      // 51: putfield onPlayerUpdate.sgz D
      // 54: aload 0
      // 55: dload 4
      // 57: putfield onPlayerUpdate._6_ D
      // 5a: aload 0
      // 5b: dload 6
      // 5d: putfield onPlayerUpdate.m10 D
      // 60: aload 0
      // 61: dload 8
      // 63: putfield onPlayerUpdate.g_y D
      // 66: iload 12
      // 68: ifeq d6
      // 6b: goto 72
      // 6e: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 71: athrow
      // 72: aload 0
      // 73: dload 2
      // 74: putfield onPlayerUpdate.ji8 D
      // 77: aload 0
      // 78: dload 4
      // 7a: putfield onPlayerUpdate.nqj D
      // 7d: aload 0
      // 7e: dload 6
      // 80: putfield onPlayerUpdate.o_8 D
      // 83: aload 0
      // 84: dload 8
      // 86: putfield onPlayerUpdate.na1 D
      // 89: iload 12
      // 8b: ifeq d6
      // 8e: goto 95
      // 91: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: aload 0
      // 96: dload 2
      // 97: putfield onPlayerUpdate.ye8 D
      // 9a: aload 0
      // 9b: dload 4
      // 9d: putfield onPlayerUpdate.h_8 D
      // a0: aload 0
      // a1: dload 6
      // a3: putfield onPlayerUpdate.twh D
      // a6: aload 0
      // a7: dload 8
      // a9: putfield onPlayerUpdate.f36 D
      // ac: iload 12
      // ae: ifeq d6
      // b1: goto b8
      // b4: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b7: athrow
      // b8: new java/lang/ArrayIndexOutOfBoundsException
      // bb: dup
      // bc: sipush 19670
      // bf: ldc2_w 5709497444430920948
      // c2: lload 10
      // c4: lxor
      // c5: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: nop
      // cb: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // ce: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // d1: athrow
      // d2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d5: athrow
      // d6: return
   }

   public final void sx8(int param1, v71 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic onPlayerUpdate.a J
      // 03: ldc2_w 100881706439664
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 206 0 3 30 74 118 162
      // 2c: aload 0
      // 2d: aload 2
      // 2e: getfield v71.yme D
      // 31: putfield onPlayerUpdate.jf3 D
      // 34: aload 0
      // 35: aload 2
      // 36: getfield v71.pf8 D
      // 39: putfield onPlayerUpdate.o1a D
      // 3c: aload 0
      // 3d: aload 2
      // 3e: getfield v71.jfe D
      // 41: putfield onPlayerUpdate.j_n D
      // 44: aload 0
      // 45: aload 2
      // 46: getfield v71.ggc D
      // 49: putfield onPlayerUpdate.uwn D
      // 4c: iload 5
      // 4e: ifne f9
      // 51: goto 58
      // 54: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57: athrow
      // 58: aload 0
      // 59: aload 2
      // 5a: getfield v71.yme D
      // 5d: putfield onPlayerUpdate.sgz D
      // 60: aload 0
      // 61: aload 2
      // 62: getfield v71.pf8 D
      // 65: putfield onPlayerUpdate._6_ D
      // 68: aload 0
      // 69: aload 2
      // 6a: getfield v71.jfe D
      // 6d: putfield onPlayerUpdate.m10 D
      // 70: aload 0
      // 71: aload 2
      // 72: getfield v71.ggc D
      // 75: putfield onPlayerUpdate.g_y D
      // 78: iload 5
      // 7a: ifne f9
      // 7d: goto 84
      // 80: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: aload 2
      // 86: getfield v71.yme D
      // 89: putfield onPlayerUpdate.ji8 D
      // 8c: aload 0
      // 8d: aload 2
      // 8e: getfield v71.pf8 D
      // 91: putfield onPlayerUpdate.nqj D
      // 94: aload 0
      // 95: aload 2
      // 96: getfield v71.jfe D
      // 99: putfield onPlayerUpdate.o_8 D
      // 9c: aload 0
      // 9d: aload 2
      // 9e: getfield v71.ggc D
      // a1: putfield onPlayerUpdate.na1 D
      // a4: iload 5
      // a6: ifne f9
      // a9: goto b0
      // ac: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // af: athrow
      // b0: aload 0
      // b1: aload 2
      // b2: getfield v71.yme D
      // b5: putfield onPlayerUpdate.ye8 D
      // b8: aload 0
      // b9: aload 2
      // ba: getfield v71.pf8 D
      // bd: putfield onPlayerUpdate.h_8 D
      // c0: aload 0
      // c1: aload 2
      // c2: getfield v71.jfe D
      // c5: putfield onPlayerUpdate.twh D
      // c8: aload 0
      // c9: aload 2
      // ca: getfield v71.ggc D
      // cd: putfield onPlayerUpdate.f36 D
      // d0: iload 5
      // d2: ifne f9
      // d5: goto dc
      // d8: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // db: athrow
      // dc: new java/lang/ArrayIndexOutOfBoundsException
      // df: dup
      // e0: sipush 17926
      // e3: ldc2_w 4204095988989274863
      // e6: lload 3
      // e7: lxor
      // e8: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed: nop
      // ee: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // f1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // f4: athrow
      // f5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // f8: athrow
      // f9: return
   }

   public final void zgk(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic onPlayerUpdate.a J
      // 03: ldc2_w 127442284690512
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 190 0 3 30 70 110 150
      // 2c: aload 0
      // 2d: aload 2
      // 2e: bipush 0
      // 2f: daload
      // 30: putfield onPlayerUpdate.jf3 D
      // 33: aload 0
      // 34: aload 2
      // 35: bipush 1
      // 36: daload
      // 37: putfield onPlayerUpdate.o1a D
      // 3a: aload 0
      // 3b: aload 2
      // 3c: bipush 2
      // 3d: daload
      // 3e: putfield onPlayerUpdate.j_n D
      // 41: aload 0
      // 42: aload 2
      // 43: bipush 3
      // 44: daload
      // 45: putfield onPlayerUpdate.uwn D
      // 48: iload 5
      // 4a: ifeq e9
      // 4d: goto 54
      // 50: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 0
      // 55: aload 2
      // 56: bipush 0
      // 57: daload
      // 58: putfield onPlayerUpdate.sgz D
      // 5b: aload 0
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: daload
      // 5f: putfield onPlayerUpdate._6_ D
      // 62: aload 0
      // 63: aload 2
      // 64: bipush 2
      // 65: daload
      // 66: putfield onPlayerUpdate.m10 D
      // 69: aload 0
      // 6a: aload 2
      // 6b: bipush 3
      // 6c: daload
      // 6d: putfield onPlayerUpdate.g_y D
      // 70: iload 5
      // 72: ifeq e9
      // 75: goto 7c
      // 78: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: aload 2
      // 7e: bipush 0
      // 7f: daload
      // 80: putfield onPlayerUpdate.ji8 D
      // 83: aload 0
      // 84: aload 2
      // 85: bipush 1
      // 86: daload
      // 87: putfield onPlayerUpdate.nqj D
      // 8a: aload 0
      // 8b: aload 2
      // 8c: bipush 2
      // 8d: daload
      // 8e: putfield onPlayerUpdate.o_8 D
      // 91: aload 0
      // 92: aload 2
      // 93: bipush 3
      // 94: daload
      // 95: putfield onPlayerUpdate.na1 D
      // 98: iload 5
      // 9a: ifeq e9
      // 9d: goto a4
      // a0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: aload 0
      // a5: aload 2
      // a6: bipush 0
      // a7: daload
      // a8: putfield onPlayerUpdate.ye8 D
      // ab: aload 0
      // ac: aload 2
      // ad: bipush 1
      // ae: daload
      // af: putfield onPlayerUpdate.h_8 D
      // b2: aload 0
      // b3: aload 2
      // b4: bipush 2
      // b5: daload
      // b6: putfield onPlayerUpdate.twh D
      // b9: aload 0
      // ba: aload 2
      // bb: bipush 3
      // bc: daload
      // bd: putfield onPlayerUpdate.f36 D
      // c0: iload 5
      // c2: ifeq e9
      // c5: goto cc
      // c8: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // cb: athrow
      // cc: new java/lang/ArrayIndexOutOfBoundsException
      // cf: dup
      // d0: sipush 17926
      // d3: ldc2_w 4204069773073761615
      // d6: lload 3
      // d7: lxor
      // d8: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // e1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // e4: athrow
      // e5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // e8: athrow
      // e9: return
   }

   public final void pcn(int param1, double param2, double param4, double param6, double param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic onPlayerUpdate.a J
      // 03: ldc2_w 29789953526771
      // 06: lxor
      // 07: lstore 10
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 12
      // 0e: iload 1
      // 0f: tableswitch 169 0 3 29 64 99 134
      // 2c: aload 0
      // 2d: dload 2
      // 2e: putfield onPlayerUpdate.jf3 D
      // 31: aload 0
      // 32: dload 4
      // 34: putfield onPlayerUpdate.sgz D
      // 37: aload 0
      // 38: dload 6
      // 3a: putfield onPlayerUpdate.ji8 D
      // 3d: aload 0
      // 3e: dload 8
      // 40: putfield onPlayerUpdate.ye8 D
      // 43: iload 12
      // 45: ifeq d6
      // 48: goto 4f
      // 4b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4e: athrow
      // 4f: aload 0
      // 50: dload 2
      // 51: putfield onPlayerUpdate.o1a D
      // 54: aload 0
      // 55: dload 4
      // 57: putfield onPlayerUpdate._6_ D
      // 5a: aload 0
      // 5b: dload 6
      // 5d: putfield onPlayerUpdate.nqj D
      // 60: aload 0
      // 61: dload 8
      // 63: putfield onPlayerUpdate.h_8 D
      // 66: iload 12
      // 68: ifeq d6
      // 6b: goto 72
      // 6e: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 71: athrow
      // 72: aload 0
      // 73: dload 2
      // 74: putfield onPlayerUpdate.j_n D
      // 77: aload 0
      // 78: dload 4
      // 7a: putfield onPlayerUpdate.m10 D
      // 7d: aload 0
      // 7e: dload 6
      // 80: putfield onPlayerUpdate.o_8 D
      // 83: aload 0
      // 84: dload 8
      // 86: putfield onPlayerUpdate.twh D
      // 89: iload 12
      // 8b: ifeq d6
      // 8e: goto 95
      // 91: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: aload 0
      // 96: dload 2
      // 97: putfield onPlayerUpdate.uwn D
      // 9a: aload 0
      // 9b: dload 4
      // 9d: putfield onPlayerUpdate.g_y D
      // a0: aload 0
      // a1: dload 6
      // a3: putfield onPlayerUpdate.na1 D
      // a6: aload 0
      // a7: dload 8
      // a9: putfield onPlayerUpdate.f36 D
      // ac: iload 12
      // ae: ifeq d6
      // b1: goto b8
      // b4: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b7: athrow
      // b8: new java/lang/ArrayIndexOutOfBoundsException
      // bb: dup
      // bc: sipush 31976
      // bf: ldc2_w 1966526445562775557
      // c2: lload 10
      // c4: lxor
      // c5: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: nop
      // cb: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // ce: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // d1: athrow
      // d2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // d5: athrow
      // d6: return
   }

   public final void n71(int param1, v71 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic onPlayerUpdate.a J
      // 03: ldc2_w 136158699992783
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 206 0 3 30 74 118 162
      // 2c: aload 0
      // 2d: aload 2
      // 2e: getfield v71.yme D
      // 31: putfield onPlayerUpdate.jf3 D
      // 34: aload 0
      // 35: aload 2
      // 36: getfield v71.pf8 D
      // 39: putfield onPlayerUpdate.sgz D
      // 3c: aload 0
      // 3d: aload 2
      // 3e: getfield v71.jfe D
      // 41: putfield onPlayerUpdate.ji8 D
      // 44: aload 0
      // 45: aload 2
      // 46: getfield v71.ggc D
      // 49: putfield onPlayerUpdate.ye8 D
      // 4c: iload 5
      // 4e: ifne f9
      // 51: goto 58
      // 54: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57: athrow
      // 58: aload 0
      // 59: aload 2
      // 5a: getfield v71.yme D
      // 5d: putfield onPlayerUpdate.o1a D
      // 60: aload 0
      // 61: aload 2
      // 62: getfield v71.pf8 D
      // 65: putfield onPlayerUpdate._6_ D
      // 68: aload 0
      // 69: aload 2
      // 6a: getfield v71.jfe D
      // 6d: putfield onPlayerUpdate.nqj D
      // 70: aload 0
      // 71: aload 2
      // 72: getfield v71.ggc D
      // 75: putfield onPlayerUpdate.h_8 D
      // 78: iload 5
      // 7a: ifne f9
      // 7d: goto 84
      // 80: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 0
      // 85: aload 2
      // 86: getfield v71.yme D
      // 89: putfield onPlayerUpdate.j_n D
      // 8c: aload 0
      // 8d: aload 2
      // 8e: getfield v71.pf8 D
      // 91: putfield onPlayerUpdate.m10 D
      // 94: aload 0
      // 95: aload 2
      // 96: getfield v71.jfe D
      // 99: putfield onPlayerUpdate.o_8 D
      // 9c: aload 0
      // 9d: aload 2
      // 9e: getfield v71.ggc D
      // a1: putfield onPlayerUpdate.twh D
      // a4: iload 5
      // a6: ifne f9
      // a9: goto b0
      // ac: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // af: athrow
      // b0: aload 0
      // b1: aload 2
      // b2: getfield v71.yme D
      // b5: putfield onPlayerUpdate.uwn D
      // b8: aload 0
      // b9: aload 2
      // ba: getfield v71.pf8 D
      // bd: putfield onPlayerUpdate.g_y D
      // c0: aload 0
      // c1: aload 2
      // c2: getfield v71.jfe D
      // c5: putfield onPlayerUpdate.na1 D
      // c8: aload 0
      // c9: aload 2
      // ca: getfield v71.ggc D
      // cd: putfield onPlayerUpdate.f36 D
      // d0: iload 5
      // d2: ifne f9
      // d5: goto dc
      // d8: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // db: athrow
      // dc: new java/lang/ArrayIndexOutOfBoundsException
      // df: dup
      // e0: sipush 15604
      // e3: ldc2_w 6544834491892643104
      // e6: lload 3
      // e7: lxor
      // e8: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed: nop
      // ee: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // f1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // f4: athrow
      // f5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // f8: athrow
      // f9: return
   }

   public final void gq3(int param1, double[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic onPlayerUpdate.a J
      // 03: ldc2_w 130815674226012
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: tableswitch 190 0 3 30 70 110 150
      // 2c: aload 0
      // 2d: aload 2
      // 2e: bipush 0
      // 2f: daload
      // 30: putfield onPlayerUpdate.jf3 D
      // 33: aload 0
      // 34: aload 2
      // 35: bipush 1
      // 36: daload
      // 37: putfield onPlayerUpdate.sgz D
      // 3a: aload 0
      // 3b: aload 2
      // 3c: bipush 2
      // 3d: daload
      // 3e: putfield onPlayerUpdate.ji8 D
      // 41: aload 0
      // 42: aload 2
      // 43: bipush 3
      // 44: daload
      // 45: putfield onPlayerUpdate.ye8 D
      // 48: iload 5
      // 4a: ifne e9
      // 4d: goto 54
      // 50: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 53: athrow
      // 54: aload 0
      // 55: aload 2
      // 56: bipush 0
      // 57: daload
      // 58: putfield onPlayerUpdate.o1a D
      // 5b: aload 0
      // 5c: aload 2
      // 5d: bipush 1
      // 5e: daload
      // 5f: putfield onPlayerUpdate._6_ D
      // 62: aload 0
      // 63: aload 2
      // 64: bipush 2
      // 65: daload
      // 66: putfield onPlayerUpdate.nqj D
      // 69: aload 0
      // 6a: aload 2
      // 6b: bipush 3
      // 6c: daload
      // 6d: putfield onPlayerUpdate.h_8 D
      // 70: iload 5
      // 72: ifne e9
      // 75: goto 7c
      // 78: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: aload 0
      // 7d: aload 2
      // 7e: bipush 0
      // 7f: daload
      // 80: putfield onPlayerUpdate.j_n D
      // 83: aload 0
      // 84: aload 2
      // 85: bipush 1
      // 86: daload
      // 87: putfield onPlayerUpdate.m10 D
      // 8a: aload 0
      // 8b: aload 2
      // 8c: bipush 2
      // 8d: daload
      // 8e: putfield onPlayerUpdate.o_8 D
      // 91: aload 0
      // 92: aload 2
      // 93: bipush 3
      // 94: daload
      // 95: putfield onPlayerUpdate.twh D
      // 98: iload 5
      // 9a: ifne e9
      // 9d: goto a4
      // a0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: aload 0
      // a5: aload 2
      // a6: bipush 0
      // a7: daload
      // a8: putfield onPlayerUpdate.uwn D
      // ab: aload 0
      // ac: aload 2
      // ad: bipush 1
      // ae: daload
      // af: putfield onPlayerUpdate.g_y D
      // b2: aload 0
      // b3: aload 2
      // b4: bipush 2
      // b5: daload
      // b6: putfield onPlayerUpdate.na1 D
      // b9: aload 0
      // ba: aload 2
      // bb: bipush 3
      // bc: daload
      // bd: putfield onPlayerUpdate.f36 D
      // c0: iload 5
      // c2: ifne e9
      // c5: goto cc
      // c8: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // cb: athrow
      // cc: new java/lang/ArrayIndexOutOfBoundsException
      // cf: dup
      // d0: sipush 31976
      // d3: ldc2_w 1966644238770525866
      // d6: lload 3
      // d7: lxor
      // d8: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // e1: invokespecial java/lang/ArrayIndexOutOfBoundsException.<init> (Ljava/lang/String;)V
      // e4: athrow
      // e5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // e8: athrow
      // e9: return
   }

   public final void i5r(double var1) {
      this.jf3 += var1;
      this.o1a += var1;
      this.j_n += var1;
      this.uwn += var1;
      this.sgz += var1;
      this._6_ += var1;
      this.m10 += var1;
      this.g_y += var1;
      this.ji8 += var1;
      this.nqj += var1;
      this.o_8 += var1;
      this.na1 += var1;
      this.ye8 += var1;
      this.h_8 += var1;
      this.twh += var1;
      this.f36 += var1;
   }

   public final void ao2(double var1, onPlayerUpdate var3) {
      this.jf3 = var3.jf3 + var1;
      this.o1a = var3.o1a + var1;
      this.j_n = var3.j_n + var1;
      this.uwn = var3.uwn + var1;
      this.sgz = var3.sgz + var1;
      this._6_ = var3._6_ + var1;
      this.m10 = var3.m10 + var1;
      this.g_y = var3.g_y + var1;
      this.ji8 = var3.ji8 + var1;
      this.nqj = var3.nqj + var1;
      this.o_8 = var3.o_8 + var1;
      this.na1 = var3.na1 + var1;
      this.ye8 = var3.ye8 + var1;
      this.h_8 = var3.h_8 + var1;
      this.twh = var3.twh + var1;
      this.f36 = var3.f36 + var1;
   }

   public final void o5v(onPlayerUpdate var1, onPlayerUpdate var2) {
      this.jf3 = var1.jf3 + var2.jf3;
      this.o1a = var1.o1a + var2.o1a;
      this.j_n = var1.j_n + var2.j_n;
      this.uwn = var1.uwn + var2.uwn;
      this.sgz = var1.sgz + var2.sgz;
      this._6_ = var1._6_ + var2._6_;
      this.m10 = var1.m10 + var2.m10;
      this.g_y = var1.g_y + var2.g_y;
      this.ji8 = var1.ji8 + var2.ji8;
      this.nqj = var1.nqj + var2.nqj;
      this.o_8 = var1.o_8 + var2.o_8;
      this.na1 = var1.na1 + var2.na1;
      this.ye8 = var1.ye8 + var2.ye8;
      this.h_8 = var1.h_8 + var2.h_8;
      this.twh = var1.twh + var2.twh;
      this.f36 = var1.f36 + var2.f36;
   }

   public final void gt5(onPlayerUpdate var1) {
      this.jf3 = this.jf3 + var1.jf3;
      this.o1a = this.o1a + var1.o1a;
      this.j_n = this.j_n + var1.j_n;
      this.uwn = this.uwn + var1.uwn;
      this.sgz = this.sgz + var1.sgz;
      this._6_ = this._6_ + var1._6_;
      this.m10 = this.m10 + var1.m10;
      this.g_y = this.g_y + var1.g_y;
      this.ji8 = this.ji8 + var1.ji8;
      this.nqj = this.nqj + var1.nqj;
      this.o_8 = this.o_8 + var1.o_8;
      this.na1 = this.na1 + var1.na1;
      this.ye8 = this.ye8 + var1.ye8;
      this.h_8 = this.h_8 + var1.h_8;
      this.twh = this.twh + var1.twh;
      this.f36 = this.f36 + var1.f36;
   }

   public final void m8w(onPlayerUpdate var1, onPlayerUpdate var2) {
      this.jf3 = var1.jf3 - var2.jf3;
      this.o1a = var1.o1a - var2.o1a;
      this.j_n = var1.j_n - var2.j_n;
      this.uwn = var1.uwn - var2.uwn;
      this.sgz = var1.sgz - var2.sgz;
      this._6_ = var1._6_ - var2._6_;
      this.m10 = var1.m10 - var2.m10;
      this.g_y = var1.g_y - var2.g_y;
      this.ji8 = var1.ji8 - var2.ji8;
      this.nqj = var1.nqj - var2.nqj;
      this.o_8 = var1.o_8 - var2.o_8;
      this.na1 = var1.na1 - var2.na1;
      this.ye8 = var1.ye8 - var2.ye8;
      this.h_8 = var1.h_8 - var2.h_8;
      this.twh = var1.twh - var2.twh;
      this.f36 = var1.f36 - var2.f36;
   }

   public final void ijk(onPlayerUpdate var1) {
      this.jf3 = this.jf3 - var1.jf3;
      this.o1a = this.o1a - var1.o1a;
      this.j_n = this.j_n - var1.j_n;
      this.uwn = this.uwn - var1.uwn;
      this.sgz = this.sgz - var1.sgz;
      this._6_ = this._6_ - var1._6_;
      this.m10 = this.m10 - var1.m10;
      this.g_y = this.g_y - var1.g_y;
      this.ji8 = this.ji8 - var1.ji8;
      this.nqj = this.nqj - var1.nqj;
      this.o_8 = this.o_8 - var1.o_8;
      this.na1 = this.na1 - var1.na1;
      this.ye8 = this.ye8 - var1.ye8;
      this.h_8 = this.h_8 - var1.h_8;
      this.twh = this.twh - var1.twh;
      this.f36 = this.f36 - var1.f36;
   }

   public final void g7x() {
      double var1 = this.sgz;
      this.sgz = this.o1a;
      this.o1a = var1;
      var1 = this.ji8;
      this.ji8 = this.j_n;
      this.j_n = var1;
      var1 = this.ye8;
      this.ye8 = this.uwn;
      this.uwn = var1;
      var1 = this.nqj;
      this.nqj = this.m10;
      this.m10 = var1;
      var1 = this.h_8;
      this.h_8 = this.g_y;
      this.g_y = var1;
      var1 = this.twh;
      this.twh = this.na1;
      this.na1 = var1;
   }

   public final void z8f(onPlayerUpdate param1) {
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
      // 06: ifne a7
      // 09: aload 1
      // 0a: if_acmpeq 9f
      // 0d: goto 14
      // 10: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: aload 0
      // 15: aload 1
      // 16: getfield onPlayerUpdate.jf3 D
      // 19: putfield onPlayerUpdate.jf3 D
      // 1c: aload 0
      // 1d: aload 1
      // 1e: getfield onPlayerUpdate.sgz D
      // 21: putfield onPlayerUpdate.o1a D
      // 24: aload 0
      // 25: aload 1
      // 26: getfield onPlayerUpdate.ji8 D
      // 29: putfield onPlayerUpdate.j_n D
      // 2c: aload 0
      // 2d: aload 1
      // 2e: getfield onPlayerUpdate.ye8 D
      // 31: putfield onPlayerUpdate.uwn D
      // 34: aload 0
      // 35: aload 1
      // 36: getfield onPlayerUpdate.o1a D
      // 39: putfield onPlayerUpdate.sgz D
      // 3c: aload 0
      // 3d: aload 1
      // 3e: getfield onPlayerUpdate._6_ D
      // 41: putfield onPlayerUpdate._6_ D
      // 44: aload 0
      // 45: aload 1
      // 46: getfield onPlayerUpdate.nqj D
      // 49: putfield onPlayerUpdate.m10 D
      // 4c: aload 0
      // 4d: aload 1
      // 4e: getfield onPlayerUpdate.h_8 D
      // 51: putfield onPlayerUpdate.g_y D
      // 54: aload 0
      // 55: aload 1
      // 56: getfield onPlayerUpdate.j_n D
      // 59: putfield onPlayerUpdate.ji8 D
      // 5c: aload 0
      // 5d: aload 1
      // 5e: getfield onPlayerUpdate.m10 D
      // 61: putfield onPlayerUpdate.nqj D
      // 64: aload 0
      // 65: aload 1
      // 66: getfield onPlayerUpdate.o_8 D
      // 69: putfield onPlayerUpdate.o_8 D
      // 6c: aload 0
      // 6d: aload 1
      // 6e: getfield onPlayerUpdate.twh D
      // 71: putfield onPlayerUpdate.na1 D
      // 74: aload 0
      // 75: aload 1
      // 76: getfield onPlayerUpdate.uwn D
      // 79: putfield onPlayerUpdate.ye8 D
      // 7c: aload 0
      // 7d: aload 1
      // 7e: getfield onPlayerUpdate.g_y D
      // 81: putfield onPlayerUpdate.h_8 D
      // 84: aload 0
      // 85: aload 1
      // 86: getfield onPlayerUpdate.na1 D
      // 89: putfield onPlayerUpdate.twh D
      // 8c: aload 0
      // 8d: aload 1
      // 8e: getfield onPlayerUpdate.f36 D
      // 91: putfield onPlayerUpdate.f36 D
      // 94: iload 2
      // 95: ifeq aa
      // 98: goto 9f
      // 9b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9e: athrow
      // 9f: aload 0
      // a0: goto a7
      // a3: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a6: athrow
      // a7: invokevirtual onPlayerUpdate.g7x ()V
      // aa: return
   }

   public final void c7a(double[] var1) {
      this.jf3 = var1[0];
      this.o1a = var1[1];
      this.j_n = var1[2];
      this.uwn = var1[3];
      this.sgz = var1[4];
      this._6_ = var1[5];
      this.m10 = var1[6];
      this.g_y = var1[7];
      this.ji8 = var1[8];
      this.nqj = var1[9];
      this.o_8 = var1[10];
      this.na1 = var1[11];
      this.ye8 = var1[12];
      this.h_8 = var1[13];
      this.twh = var1[14];
      this.f36 = var1[15];
   }

   public final void hmq(nvj var1) {
      this.jf3 = (double)var1.i2i;
      this.o1a = (double)var1.k12;
      this.j_n = (double)var1.xu6;
      this.uwn = 0.0;
      this.sgz = (double)var1._id;
      this._6_ = (double)var1.aoj;
      this.m10 = (double)var1.zk_;
      this.g_y = 0.0;
      this.ji8 = (double)var1.aqg;
      this.nqj = (double)var1.wdt;
      this.o_8 = (double)var1.jr8;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void cnb(iww var1) {
      this.jf3 = var1.lxb;
      this.o1a = var1.y3c;
      this.j_n = var1.bhd;
      this.uwn = 0.0;
      this.sgz = var1.get;
      this._6_ = var1.pwn;
      this.m10 = var1.c84;
      this.g_y = 0.0;
      this.ji8 = var1.y7q;
      this.nqj = var1._o7;
      this.o_8 = var1.ffq;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void w01(nbf var1) {
      this.jf3 = 1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe;
      this.sgz = 2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe);
      this.ji8 = 2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8);
      this.o1a = 2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe);
      this._6_ = 1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe;
      this.nqj = 2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme);
      this.j_n = 2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8);
      this.m10 = 2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme);
      this.o_8 = 1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8;
      this.uwn = 0.0;
      this.g_y = 0.0;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void ra6(lg5 param1) {
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
      // 026: ldc2_w 1.0E-10
      // 029: iload 2
      // 02a: ifne 079
      // 02d: dcmpg
      // 02e: ifge 070
      // 031: goto 038
      // 034: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 037: athrow
      // 038: aload 0
      // 039: dconst_1
      // 03a: putfield onPlayerUpdate.jf3 D
      // 03d: aload 0
      // 03e: dconst_0
      // 03f: putfield onPlayerUpdate.o1a D
      // 042: aload 0
      // 043: dconst_0
      // 044: putfield onPlayerUpdate.j_n D
      // 047: aload 0
      // 048: dconst_0
      // 049: putfield onPlayerUpdate.sgz D
      // 04c: aload 0
      // 04d: dconst_1
      // 04e: putfield onPlayerUpdate._6_ D
      // 051: aload 0
      // 052: dconst_0
      // 053: putfield onPlayerUpdate.m10 D
      // 056: aload 0
      // 057: dconst_0
      // 058: putfield onPlayerUpdate.ji8 D
      // 05b: aload 0
      // 05c: dconst_0
      // 05d: putfield onPlayerUpdate.nqj D
      // 060: aload 0
      // 061: dconst_1
      // 062: putfield onPlayerUpdate.o_8 D
      // 065: iload 2
      // 066: ifeq 140
      // 069: goto 070
      // 06c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 093: dstore 11
      // 095: aload 1
      // 096: getfield lg5.ezi D
      // 099: invokestatic java/lang/Math.cos (D)D
      // 09c: dstore 13
      // 09e: dconst_1
      // 09f: dload 13
      // 0a1: dsub
      // 0a2: dstore 15
      // 0a4: dload 5
      // 0a6: dload 9
      // 0a8: dmul
      // 0a9: dstore 17
      // 0ab: dload 5
      // 0ad: dload 7
      // 0af: dmul
      // 0b0: dstore 19
      // 0b2: dload 7
      // 0b4: dload 9
      // 0b6: dmul
      // 0b7: dstore 21
      // 0b9: aload 0
      // 0ba: dload 15
      // 0bc: dload 5
      // 0be: dmul
      // 0bf: dload 5
      // 0c1: dmul
      // 0c2: dload 13
      // 0c4: dadd
      // 0c5: putfield onPlayerUpdate.jf3 D
      // 0c8: aload 0
      // 0c9: dload 15
      // 0cb: dload 19
      // 0cd: dmul
      // 0ce: dload 11
      // 0d0: dload 9
      // 0d2: dmul
      // 0d3: dsub
      // 0d4: putfield onPlayerUpdate.o1a D
      // 0d7: aload 0
      // 0d8: dload 15
      // 0da: dload 17
      // 0dc: dmul
      // 0dd: dload 11
      // 0df: dload 7
      // 0e1: dmul
      // 0e2: dadd
      // 0e3: putfield onPlayerUpdate.j_n D
      // 0e6: aload 0
      // 0e7: dload 15
      // 0e9: dload 19
      // 0eb: dmul
      // 0ec: dload 11
      // 0ee: dload 9
      // 0f0: dmul
      // 0f1: dadd
      // 0f2: putfield onPlayerUpdate.sgz D
      // 0f5: aload 0
      // 0f6: dload 15
      // 0f8: dload 7
      // 0fa: dmul
      // 0fb: dload 7
      // 0fd: dmul
      // 0fe: dload 13
      // 100: dadd
      // 101: putfield onPlayerUpdate._6_ D
      // 104: aload 0
      // 105: dload 15
      // 107: dload 21
      // 109: dmul
      // 10a: dload 11
      // 10c: dload 5
      // 10e: dmul
      // 10f: dsub
      // 110: putfield onPlayerUpdate.m10 D
      // 113: aload 0
      // 114: dload 15
      // 116: dload 17
      // 118: dmul
      // 119: dload 11
      // 11b: dload 7
      // 11d: dmul
      // 11e: dsub
      // 11f: putfield onPlayerUpdate.ji8 D
      // 122: aload 0
      // 123: dload 15
      // 125: dload 21
      // 127: dmul
      // 128: dload 11
      // 12a: dload 5
      // 12c: dmul
      // 12d: dadd
      // 12e: putfield onPlayerUpdate.nqj D
      // 131: aload 0
      // 132: dload 15
      // 134: dload 9
      // 136: dmul
      // 137: dload 9
      // 139: dmul
      // 13a: dload 13
      // 13c: dadd
      // 13d: putfield onPlayerUpdate.o_8 D
      // 140: aload 0
      // 141: dconst_0
      // 142: putfield onPlayerUpdate.uwn D
      // 145: aload 0
      // 146: dconst_0
      // 147: putfield onPlayerUpdate.g_y D
      // 14a: aload 0
      // 14b: dconst_0
      // 14c: putfield onPlayerUpdate.na1 D
      // 14f: aload 0
      // 150: dconst_0
      // 151: putfield onPlayerUpdate.ye8 D
      // 154: aload 0
      // 155: dconst_0
      // 156: putfield onPlayerUpdate.h_8 D
      // 159: aload 0
      // 15a: dconst_0
      // 15b: putfield onPlayerUpdate.twh D
      // 15e: aload 0
      // 15f: dconst_1
      // 160: putfield onPlayerUpdate.f36 D
      // 163: return
   }

   public final void o8z(lwt var1) {
      this.jf3 = 1.0 - 2.0 * (double)var1.nc_ * (double)var1.nc_ - 2.0 * (double)var1.ax5 * (double)var1.ax5;
      this.sgz = 2.0 * (double)(var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.ji8 = 2.0 * (double)(var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.o1a = 2.0 * (double)(var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this._6_ = 1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.ax5 * (double)var1.ax5;
      this.nqj = 2.0 * (double)(var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.j_n = 2.0 * (double)(var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.m10 = 2.0 * (double)(var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.o_8 = 1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.nc_ * (double)var1.nc_;
      this.uwn = 0.0;
      this.g_y = 0.0;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void xbu(ll8 param1) {
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
      // 025: dstore 3
      // 026: dload 3
      // 027: ldc2_w 1.0E-10
      // 02a: iload 2
      // 02b: ifne 07b
      // 02e: dcmpg
      // 02f: ifge 071
      // 032: goto 039
      // 035: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: aload 0
      // 03a: dconst_1
      // 03b: putfield onPlayerUpdate.jf3 D
      // 03e: aload 0
      // 03f: dconst_0
      // 040: putfield onPlayerUpdate.o1a D
      // 043: aload 0
      // 044: dconst_0
      // 045: putfield onPlayerUpdate.j_n D
      // 048: aload 0
      // 049: dconst_0
      // 04a: putfield onPlayerUpdate.sgz D
      // 04d: aload 0
      // 04e: dconst_1
      // 04f: putfield onPlayerUpdate._6_ D
      // 052: aload 0
      // 053: dconst_0
      // 054: putfield onPlayerUpdate.m10 D
      // 057: aload 0
      // 058: dconst_0
      // 059: putfield onPlayerUpdate.ji8 D
      // 05c: aload 0
      // 05d: dconst_0
      // 05e: putfield onPlayerUpdate.nqj D
      // 061: aload 0
      // 062: dconst_1
      // 063: putfield onPlayerUpdate.o_8 D
      // 066: iload 2
      // 067: ifeq 146
      // 06a: goto 071
      // 06d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 070: athrow
      // 071: dconst_1
      // 072: dload 3
      // 073: ddiv
      // 074: dstore 3
      // 075: aload 1
      // 076: getfield ll8._5i F
      // 079: f2d
      // 07a: dload 3
      // 07b: dmul
      // 07c: dstore 5
      // 07e: aload 1
      // 07f: getfield ll8.w5z F
      // 082: f2d
      // 083: dload 3
      // 084: dmul
      // 085: dstore 7
      // 087: aload 1
      // 088: getfield ll8.yz_ F
      // 08b: f2d
      // 08c: dload 3
      // 08d: dmul
      // 08e: dstore 9
      // 090: aload 1
      // 091: getfield ll8.b77 F
      // 094: f2d
      // 095: invokestatic java/lang/Math.sin (D)D
      // 098: dstore 11
      // 09a: aload 1
      // 09b: getfield ll8.b77 F
      // 09e: f2d
      // 09f: invokestatic java/lang/Math.cos (D)D
      // 0a2: dstore 13
      // 0a4: dconst_1
      // 0a5: dload 13
      // 0a7: dsub
      // 0a8: dstore 15
      // 0aa: dload 5
      // 0ac: dload 9
      // 0ae: dmul
      // 0af: dstore 17
      // 0b1: dload 5
      // 0b3: dload 7
      // 0b5: dmul
      // 0b6: dstore 19
      // 0b8: dload 7
      // 0ba: dload 9
      // 0bc: dmul
      // 0bd: dstore 21
      // 0bf: aload 0
      // 0c0: dload 15
      // 0c2: dload 5
      // 0c4: dmul
      // 0c5: dload 5
      // 0c7: dmul
      // 0c8: dload 13
      // 0ca: dadd
      // 0cb: putfield onPlayerUpdate.jf3 D
      // 0ce: aload 0
      // 0cf: dload 15
      // 0d1: dload 19
      // 0d3: dmul
      // 0d4: dload 11
      // 0d6: dload 9
      // 0d8: dmul
      // 0d9: dsub
      // 0da: putfield onPlayerUpdate.o1a D
      // 0dd: aload 0
      // 0de: dload 15
      // 0e0: dload 17
      // 0e2: dmul
      // 0e3: dload 11
      // 0e5: dload 7
      // 0e7: dmul
      // 0e8: dadd
      // 0e9: putfield onPlayerUpdate.j_n D
      // 0ec: aload 0
      // 0ed: dload 15
      // 0ef: dload 19
      // 0f1: dmul
      // 0f2: dload 11
      // 0f4: dload 9
      // 0f6: dmul
      // 0f7: dadd
      // 0f8: putfield onPlayerUpdate.sgz D
      // 0fb: aload 0
      // 0fc: dload 15
      // 0fe: dload 7
      // 100: dmul
      // 101: dload 7
      // 103: dmul
      // 104: dload 13
      // 106: dadd
      // 107: putfield onPlayerUpdate._6_ D
      // 10a: aload 0
      // 10b: dload 15
      // 10d: dload 21
      // 10f: dmul
      // 110: dload 11
      // 112: dload 5
      // 114: dmul
      // 115: dsub
      // 116: putfield onPlayerUpdate.m10 D
      // 119: aload 0
      // 11a: dload 15
      // 11c: dload 17
      // 11e: dmul
      // 11f: dload 11
      // 121: dload 7
      // 123: dmul
      // 124: dsub
      // 125: putfield onPlayerUpdate.ji8 D
      // 128: aload 0
      // 129: dload 15
      // 12b: dload 21
      // 12d: dmul
      // 12e: dload 11
      // 130: dload 5
      // 132: dmul
      // 133: dadd
      // 134: putfield onPlayerUpdate.nqj D
      // 137: aload 0
      // 138: dload 15
      // 13a: dload 9
      // 13c: dmul
      // 13d: dload 9
      // 13f: dmul
      // 140: dload 13
      // 142: dadd
      // 143: putfield onPlayerUpdate.o_8 D
      // 146: aload 0
      // 147: dconst_0
      // 148: putfield onPlayerUpdate.uwn D
      // 14b: aload 0
      // 14c: dconst_0
      // 14d: putfield onPlayerUpdate.g_y D
      // 150: aload 0
      // 151: dconst_0
      // 152: putfield onPlayerUpdate.na1 D
      // 155: aload 0
      // 156: dconst_0
      // 157: putfield onPlayerUpdate.ye8 D
      // 15a: aload 0
      // 15b: dconst_0
      // 15c: putfield onPlayerUpdate.h_8 D
      // 15f: aload 0
      // 160: dconst_0
      // 161: putfield onPlayerUpdate.twh D
      // 164: aload 0
      // 165: dconst_1
      // 166: putfield onPlayerUpdate.f36 D
      // 169: return
   }

   public final void omz(nbf var1, qhn var2, double var3) {
      this.jf3 = var3 * (1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe);
      this.sgz = var3 * 2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe);
      this.ji8 = var3 * 2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8);
      this.o1a = var3 * 2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe);
      this._6_ = var3 * (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe);
      this.nqj = var3 * 2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme);
      this.j_n = var3 * 2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8);
      this.m10 = var3 * 2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme);
      this.o_8 = var3 * (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8);
      this.uwn = var2.v54;
      this.g_y = var2.g0w;
      this.na1 = var2.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void hmd(lwt var1, qhn var2, double var3) {
      this.jf3 = var3 * (1.0 - 2.0 * (double)var1.nc_ * (double)var1.nc_ - 2.0 * (double)var1.ax5 * (double)var1.ax5);
      this.sgz = var3 * 2.0 * (double)(var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.ji8 = var3 * 2.0 * (double)(var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.o1a = var3 * 2.0 * (double)(var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this._6_ = var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.ax5 * (double)var1.ax5);
      this.nqj = var3 * 2.0 * (double)(var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.j_n = var3 * 2.0 * (double)(var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.m10 = var3 * 2.0 * (double)(var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.o_8 = var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.nc_ * (double)var1.nc_);
      this.uwn = var2.v54;
      this.g_y = var2.g0w;
      this.na1 = var2.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void wkg(lwt var1, l3p var2, float var3) {
      this.jf3 = (double)var3 * (1.0 - 2.0 * (double)var1.nc_ * (double)var1.nc_ - 2.0 * (double)var1.ax5 * (double)var1.ax5);
      this.sgz = (double)var3 * 2.0 * (double)(var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5);
      this.ji8 = (double)var3 * 2.0 * (double)(var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_);
      this.o1a = (double)var3 * 2.0 * (double)(var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5);
      this._6_ = (double)var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.ax5 * (double)var1.ax5);
      this.nqj = (double)var3 * 2.0 * (double)(var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2);
      this.j_n = (double)var3 * 2.0 * (double)(var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_);
      this.m10 = (double)var3 * 2.0 * (double)(var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2);
      this.o_8 = (double)var3 * (1.0 - 2.0 * (double)var1.hp2 * (double)var1.hp2 - 2.0 * (double)var1.nc_ * (double)var1.nc_);
      this.uwn = (double)var2.yiu;
      this.g_y = (double)var2.q6o;
      this.na1 = (double)var2.n_d;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void gu7(krg var1) {
      this.jf3 = (double)var1.j8s;
      this.o1a = (double)var1.f28;
      this.j_n = (double)var1.vwt;
      this.uwn = (double)var1.ygn;
      this.sgz = (double)var1.fno;
      this._6_ = (double)var1.rqb;
      this.m10 = (double)var1.sjv;
      this.g_y = (double)var1.ttd;
      this.ji8 = (double)var1.zcz;
      this.nqj = (double)var1.w4_;
      this.o_8 = (double)var1.fmx;
      this.na1 = (double)var1.f46;
      this.ye8 = (double)var1.g7m;
      this.h_8 = (double)var1.i5l;
      this.twh = (double)var1.sk9;
      this.f36 = (double)var1._40;
   }

   public final void rxb(onPlayerUpdate var1) {
      this.jf3 = var1.jf3;
      this.o1a = var1.o1a;
      this.j_n = var1.j_n;
      this.uwn = var1.uwn;
      this.sgz = var1.sgz;
      this._6_ = var1._6_;
      this.m10 = var1.m10;
      this.g_y = var1.g_y;
      this.ji8 = var1.ji8;
      this.nqj = var1.nqj;
      this.o_8 = var1.o_8;
      this.na1 = var1.na1;
      this.ye8 = var1.ye8;
      this.h_8 = var1.h_8;
      this.twh = var1.twh;
      this.f36 = var1.f36;
   }

   public final void dr7(onPlayerUpdate var1) {
      this.qoz(var1);
   }

   public final void pti() {
      this.qoz(this);
   }

   public final void qoz(onPlayerUpdate param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 49956920344361
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 16
      // 00a: newarray 7
      // 00c: astore 5
      // 00e: bipush 4
      // 00f: newarray 10
      // 011: astore 6
      // 013: bipush 16
      // 015: newarray 7
      // 017: astore 10
      // 019: aload 10
      // 01b: bipush 0
      // 01c: aload 1
      // 01d: getfield onPlayerUpdate.jf3 D
      // 020: dastore
      // 021: aload 10
      // 023: bipush 1
      // 024: aload 1
      // 025: getfield onPlayerUpdate.o1a D
      // 028: dastore
      // 029: invokestatic OpaquePredicate.b ()I
      // 02c: aload 10
      // 02e: bipush 2
      // 02f: aload 1
      // 030: getfield onPlayerUpdate.j_n D
      // 033: dastore
      // 034: aload 10
      // 036: bipush 3
      // 037: aload 1
      // 038: getfield onPlayerUpdate.uwn D
      // 03b: dastore
      // 03c: aload 10
      // 03e: bipush 4
      // 03f: aload 1
      // 040: getfield onPlayerUpdate.sgz D
      // 043: dastore
      // 044: aload 10
      // 046: bipush 5
      // 047: aload 1
      // 048: getfield onPlayerUpdate._6_ D
      // 04b: dastore
      // 04c: aload 10
      // 04e: bipush 6
      // 050: aload 1
      // 051: getfield onPlayerUpdate.m10 D
      // 054: dastore
      // 055: aload 10
      // 057: bipush 7
      // 059: aload 1
      // 05a: getfield onPlayerUpdate.g_y D
      // 05d: dastore
      // 05e: aload 10
      // 060: bipush 8
      // 062: aload 1
      // 063: getfield onPlayerUpdate.ji8 D
      // 066: dastore
      // 067: aload 10
      // 069: bipush 9
      // 06b: aload 1
      // 06c: getfield onPlayerUpdate.nqj D
      // 06f: dastore
      // 070: aload 10
      // 072: bipush 10
      // 074: aload 1
      // 075: getfield onPlayerUpdate.o_8 D
      // 078: dastore
      // 079: aload 10
      // 07b: bipush 11
      // 07d: aload 1
      // 07e: getfield onPlayerUpdate.na1 D
      // 081: dastore
      // 082: istore 4
      // 084: aload 10
      // 086: bipush 12
      // 088: aload 1
      // 089: getfield onPlayerUpdate.ye8 D
      // 08c: dastore
      // 08d: aload 10
      // 08f: bipush 13
      // 091: aload 1
      // 092: getfield onPlayerUpdate.h_8 D
      // 095: dastore
      // 096: aload 10
      // 098: bipush 14
      // 09a: aload 1
      // 09b: getfield onPlayerUpdate.twh D
      // 09e: dastore
      // 09f: aload 10
      // 0a1: bipush 15
      // 0a3: aload 1
      // 0a4: getfield onPlayerUpdate.f36 D
      // 0a7: dastore
      // 0a8: aload 10
      // 0aa: aload 6
      // 0ac: invokestatic onPlayerUpdate.sg0 ([D[I)Z
      // 0af: iload 4
      // 0b1: ifeq 0dc
      // 0b4: ifne 0db
      // 0b7: goto 0be
      // 0ba: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bd: athrow
      // 0be: new fgk
      // 0c1: dup
      // 0c2: sipush 5450
      // 0c5: ldc2_w 4394768018274030975
      // 0c8: lload 2
      // 0c9: lxor
      // 0ca: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0d3: invokespecial fgk.<init> (Ljava/lang/String;)V
      // 0d6: athrow
      // 0d7: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0da: athrow
      // 0db: bipush 0
      // 0dc: istore 7
      // 0de: iload 7
      // 0e0: bipush 16
      // 0e2: if_icmpge 0ff
      // 0e5: aload 5
      // 0e7: iload 7
      // 0e9: dconst_0
      // 0ea: dastore
      // 0eb: iinc 7 1
      // 0ee: iload 4
      // 0f0: ifeq 1a8
      // 0f3: iload 4
      // 0f5: ifne 0de
      // 0f8: goto 0ff
      // 0fb: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fe: athrow
      // 0ff: aload 5
      // 101: bipush 0
      // 102: dconst_1
      // 103: dastore
      // 104: aload 5
      // 106: bipush 5
      // 107: dconst_1
      // 108: dastore
      // 109: aload 5
      // 10b: bipush 10
      // 10d: dconst_1
      // 10e: dastore
      // 10f: aload 5
      // 111: bipush 15
      // 113: dconst_1
      // 114: dastore
      // 115: aload 10
      // 117: aload 6
      // 119: aload 5
      // 11b: invokestatic onPlayerUpdate.j0a ([D[I[D)V
      // 11e: aload 0
      // 11f: aload 5
      // 121: bipush 0
      // 122: daload
      // 123: putfield onPlayerUpdate.jf3 D
      // 126: aload 0
      // 127: aload 5
      // 129: bipush 1
      // 12a: daload
      // 12b: putfield onPlayerUpdate.o1a D
      // 12e: aload 0
      // 12f: aload 5
      // 131: bipush 2
      // 132: daload
      // 133: putfield onPlayerUpdate.j_n D
      // 136: aload 0
      // 137: aload 5
      // 139: bipush 3
      // 13a: daload
      // 13b: putfield onPlayerUpdate.uwn D
      // 13e: aload 0
      // 13f: aload 5
      // 141: bipush 4
      // 142: daload
      // 143: putfield onPlayerUpdate.sgz D
      // 146: aload 0
      // 147: aload 5
      // 149: bipush 5
      // 14a: daload
      // 14b: putfield onPlayerUpdate._6_ D
      // 14e: aload 0
      // 14f: aload 5
      // 151: bipush 6
      // 153: daload
      // 154: putfield onPlayerUpdate.m10 D
      // 157: aload 0
      // 158: aload 5
      // 15a: bipush 7
      // 15c: daload
      // 15d: putfield onPlayerUpdate.g_y D
      // 160: aload 0
      // 161: aload 5
      // 163: bipush 8
      // 165: daload
      // 166: putfield onPlayerUpdate.ji8 D
      // 169: aload 0
      // 16a: aload 5
      // 16c: bipush 9
      // 16e: daload
      // 16f: putfield onPlayerUpdate.nqj D
      // 172: aload 0
      // 173: aload 5
      // 175: bipush 10
      // 177: daload
      // 178: putfield onPlayerUpdate.o_8 D
      // 17b: aload 0
      // 17c: aload 5
      // 17e: bipush 11
      // 180: daload
      // 181: putfield onPlayerUpdate.na1 D
      // 184: aload 0
      // 185: aload 5
      // 187: bipush 12
      // 189: daload
      // 18a: putfield onPlayerUpdate.ye8 D
      // 18d: aload 0
      // 18e: aload 5
      // 190: bipush 13
      // 192: daload
      // 193: putfield onPlayerUpdate.h_8 D
      // 196: aload 0
      // 197: aload 5
      // 199: bipush 14
      // 19b: daload
      // 19c: putfield onPlayerUpdate.twh D
      // 19f: aload 0
      // 1a0: aload 5
      // 1a2: bipush 15
      // 1a4: daload
      // 1a5: putfield onPlayerUpdate.f36 D
      // 1a8: return
   }

   public static boolean sg0(double[] param0, int[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic onPlayerUpdate.a J
      // 003: ldc2_w 74151310933795
      // 006: lxor
      // 007: lstore 2
      // 008: bipush 4
      // 009: newarray 7
      // 00b: astore 5
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: bipush 0
      // 011: istore 8
      // 013: istore 4
      // 015: bipush 0
      // 016: istore 9
      // 018: bipush 4
      // 019: istore 6
      // 01b: iload 6
      // 01d: iinc 6 -1
      // 020: ifeq 095
      // 023: dconst_0
      // 024: dstore 10
      // 026: bipush 4
      // 027: iload 4
      // 029: ifeq 096
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
      // 04a: ifeq 068
      // 04d: dload 10
      // 04f: dcmpl
      // 050: iload 4
      // 052: ifeq 073
      // 055: goto 05c
      // 058: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: ifle 02e
      // 05f: goto 066
      // 062: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 065: athrow
      // 066: dload 12
      // 068: dstore 10
      // 06a: iload 4
      // 06c: ifne 02e
      // 06f: dload 10
      // 071: dconst_0
      // 072: dcmpl
      // 073: iload 4
      // 075: ifeq 083
      // 078: ifne 084
      // 07b: goto 082
      // 07e: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 092: ifne 01b
      // 095: bipush 0
      // 096: istore 7
      // 098: bipush 0
      // 099: istore 6
      // 09b: iload 6
      // 09d: bipush 4
      // 09e: if_icmpge 2c7
      // 0a1: bipush 0
      // 0a2: iload 4
      // 0a4: ifeq 2c8
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
      // 0d6: ifeq 09d
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
      // 0f9: ifeq 111
      // 0fc: iload 4
      // 0fe: ifne 0db
      // 101: goto 108
      // 104: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 107: athrow
      // 108: aload 0
      // 109: iload 11
      // 10b: dload 14
      // 10d: dastore
      // 10e: iinc 8 1
      // 111: iload 4
      // 113: ifne 0a9
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
      // 14c: ifeq 1b6
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
      // 16f: ifeq 184
      // 172: iload 4
      // 174: ifne 151
      // 177: goto 17e
      // 17a: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 197: ifeq 1aa
      // 19a: iflt 1ac
      // 19d: goto 1a4
      // 1a0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a3: athrow
      // 1a4: dload 18
      // 1a6: dstore 16
      // 1a8: iload 8
      // 1aa: istore 9
      // 1ac: iinc 8 1
      // 1af: iload 4
      // 1b1: ifne 120
      // 1b4: iload 9
      // 1b6: iload 4
      // 1b8: ifeq 1e4
      // 1bb: ifge 1e2
      // 1be: goto 1c5
      // 1c1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c4: athrow
      // 1c5: new java/lang/RuntimeException
      // 1c8: dup
      // 1c9: sipush 16375
      // 1cc: ldc2_w 2043287971150217157
      // 1cf: lload 2
      // 1d0: lxor
      // 1d1: invokedynamic o (IJ)Ljava/lang/String; bsm=onPlayerUpdate.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: nop
      // 1d7: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 1da: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1dd: athrow
      // 1de: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e1: athrow
      // 1e2: iload 6
      // 1e4: iload 4
      // 1e6: ifeq 25b
      // 1e9: iload 9
      // 1eb: if_icmpeq 247
      // 1ee: goto 1f5
      // 1f1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 22e: ifeq 24d
      // 231: iload 4
      // 233: ifne 20a
      // 236: goto 23d
      // 239: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 25d: ifeq 272
      // 260: ifne 270
      // 263: goto 26a
      // 266: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 269: athrow
      // 26a: bipush 0
      // 26b: ireturn
      // 26c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 2b0: ifeq 2c2
      // 2b3: iload 4
      // 2b5: ifne 29a
      // 2b8: goto 2bf
      // 2bb: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2be: athrow
      // 2bf: iinc 6 1
      // 2c2: iload 4
      // 2c4: ifne 09b
      // 2c7: bipush 1
      // 2c8: ireturn
   }

   public static void j0a(double[] param0, int[] param1, double[] param2) {
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
      // 053: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: iflt 09c
      // 05a: goto 061
      // 05d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 098: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: dload 12
      // 09e: dconst_0
      // 09f: dcmpl
      // 0a0: iload 3
      // 0a1: ifne 0b0
      // 0a4: ifeq 0b2
      // 0a7: goto 0ae
      // 0aa: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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

   public final double jya() {
      double var1 = this.jf3
         * (
            this._6_ * this.o_8 * this.f36
               + this.m10 * this.na1 * this.h_8
               + this.g_y * this.nqj * this.twh
               - this.g_y * this.o_8 * this.h_8
               - this._6_ * this.na1 * this.twh
               - this.m10 * this.nqj * this.f36
         );
      var1 -= this.o1a
         * (
            this.sgz * this.o_8 * this.f36
               + this.m10 * this.na1 * this.ye8
               + this.g_y * this.ji8 * this.twh
               - this.g_y * this.o_8 * this.ye8
               - this.sgz * this.na1 * this.twh
               - this.m10 * this.ji8 * this.f36
         );
      var1 += this.j_n
         * (
            this.sgz * this.nqj * this.f36
               + this._6_ * this.na1 * this.ye8
               + this.g_y * this.ji8 * this.h_8
               - this.g_y * this.nqj * this.ye8
               - this.sgz * this.na1 * this.h_8
               - this._6_ * this.ji8 * this.f36
         );
      return var1
         - this.uwn
            * (
               this.sgz * this.nqj * this.twh
                  + this._6_ * this.o_8 * this.ye8
                  + this.m10 * this.ji8 * this.h_8
                  - this.m10 * this.nqj * this.ye8
                  - this.sgz * this.o_8 * this.h_8
                  - this._6_ * this.ji8 * this.twh
            );
   }

   public final void kvo(double var1) {
      this.jf3 = var1;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = 0.0;
      this.sgz = 0.0;
      this._6_ = var1;
      this.m10 = 0.0;
      this.g_y = 0.0;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = var1;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void r74(qhn var1) {
      this.jf3 = 1.0;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = var1.v54;
      this.sgz = 0.0;
      this._6_ = 1.0;
      this.m10 = 0.0;
      this.g_y = var1.g0w;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = 1.0;
      this.na1 = var1.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void n7c(double var1, qhn var3) {
      this.jf3 = var1;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = var3.v54;
      this.sgz = 0.0;
      this._6_ = var1;
      this.m10 = 0.0;
      this.g_y = var3.g0w;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = var1;
      this.na1 = var3.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void ofg(qhn var1, double var2) {
      this.jf3 = var2;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = var2 * var1.v54;
      this.sgz = 0.0;
      this._6_ = var2;
      this.m10 = 0.0;
      this.g_y = var2 * var1.g0w;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = var2;
      this.na1 = var2 * var1.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void o95(nvj var1, l3p var2, float var3) {
      this.jf3 = (double)(var1.i2i * var3);
      this.o1a = (double)(var1.k12 * var3);
      this.j_n = (double)(var1.xu6 * var3);
      this.uwn = (double)var2.yiu;
      this.sgz = (double)(var1._id * var3);
      this._6_ = (double)(var1.aoj * var3);
      this.m10 = (double)(var1.zk_ * var3);
      this.g_y = (double)var2.q6o;
      this.ji8 = (double)(var1.aqg * var3);
      this.nqj = (double)(var1.wdt * var3);
      this.o_8 = (double)(var1.jr8 * var3);
      this.na1 = (double)var2.n_d;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void edb(iww var1, qhn var2, double var3) {
      this.jf3 = var1.lxb * var3;
      this.o1a = var1.y3c * var3;
      this.j_n = var1.bhd * var3;
      this.uwn = var2.v54;
      this.sgz = var1.get * var3;
      this._6_ = var1.pwn * var3;
      this.m10 = var1.c84 * var3;
      this.g_y = var2.g0w;
      this.ji8 = var1.y7q * var3;
      this.nqj = var1._o7 * var3;
      this.o_8 = var1.ffq * var3;
      this.na1 = var2.mu9;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void q5p(qhn var1) {
      this.uwn = var1.v54;
      this.g_y = var1.g0w;
      this.na1 = var1.mu9;
   }

   public final void z6q(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.jf3 = 1.0;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = 0.0;
      this.sgz = 0.0;
      this._6_ = var5;
      this.m10 = -var3;
      this.g_y = 0.0;
      this.ji8 = 0.0;
      this.nqj = var3;
      this.o_8 = var5;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void l7r(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.jf3 = var5;
      this.o1a = 0.0;
      this.j_n = var3;
      this.uwn = 0.0;
      this.sgz = 0.0;
      this._6_ = 1.0;
      this.m10 = 0.0;
      this.g_y = 0.0;
      this.ji8 = -var3;
      this.nqj = 0.0;
      this.o_8 = var5;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void nk2(double var1) {
      double var3 = Math.sin(var1);
      double var5 = Math.cos(var1);
      this.jf3 = var5;
      this.o1a = -var3;
      this.j_n = 0.0;
      this.uwn = 0.0;
      this.sgz = var3;
      this._6_ = var5;
      this.m10 = 0.0;
      this.g_y = 0.0;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = 1.0;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 1.0;
   }

   public final void zkh(double var1) {
      this.jf3 *= var1;
      this.o1a *= var1;
      this.j_n *= var1;
      this.uwn *= var1;
      this.sgz *= var1;
      this._6_ *= var1;
      this.m10 *= var1;
      this.g_y *= var1;
      this.ji8 *= var1;
      this.nqj *= var1;
      this.o_8 *= var1;
      this.na1 *= var1;
      this.ye8 *= var1;
      this.h_8 *= var1;
      this.twh *= var1;
      this.f36 *= var1;
   }

   public final void uq_(double var1, onPlayerUpdate var3) {
      this.jf3 = var3.jf3 * var1;
      this.o1a = var3.o1a * var1;
      this.j_n = var3.j_n * var1;
      this.uwn = var3.uwn * var1;
      this.sgz = var3.sgz * var1;
      this._6_ = var3._6_ * var1;
      this.m10 = var3.m10 * var1;
      this.g_y = var3.g_y * var1;
      this.ji8 = var3.ji8 * var1;
      this.nqj = var3.nqj * var1;
      this.o_8 = var3.o_8 * var1;
      this.na1 = var3.na1 * var1;
      this.ye8 = var3.ye8 * var1;
      this.h_8 = var3.h_8 * var1;
      this.twh = var3.twh * var1;
      this.f36 = var3.f36 * var1;
   }

   public final void ppn(onPlayerUpdate var1) {
      double var2 = this.jf3 * var1.jf3 + this.o1a * var1.sgz + this.j_n * var1.ji8 + this.uwn * var1.ye8;
      double var4 = this.jf3 * var1.o1a + this.o1a * var1._6_ + this.j_n * var1.nqj + this.uwn * var1.h_8;
      double var6 = this.jf3 * var1.j_n + this.o1a * var1.m10 + this.j_n * var1.o_8 + this.uwn * var1.twh;
      double var8 = this.jf3 * var1.uwn + this.o1a * var1.g_y + this.j_n * var1.na1 + this.uwn * var1.f36;
      double var10 = this.sgz * var1.jf3 + this._6_ * var1.sgz + this.m10 * var1.ji8 + this.g_y * var1.ye8;
      double var12 = this.sgz * var1.o1a + this._6_ * var1._6_ + this.m10 * var1.nqj + this.g_y * var1.h_8;
      double var14 = this.sgz * var1.j_n + this._6_ * var1.m10 + this.m10 * var1.o_8 + this.g_y * var1.twh;
      double var16 = this.sgz * var1.uwn + this._6_ * var1.g_y + this.m10 * var1.na1 + this.g_y * var1.f36;
      double var18 = this.ji8 * var1.jf3 + this.nqj * var1.sgz + this.o_8 * var1.ji8 + this.na1 * var1.ye8;
      double var20 = this.ji8 * var1.o1a + this.nqj * var1._6_ + this.o_8 * var1.nqj + this.na1 * var1.h_8;
      double var22 = this.ji8 * var1.j_n + this.nqj * var1.m10 + this.o_8 * var1.o_8 + this.na1 * var1.twh;
      double var24 = this.ji8 * var1.uwn + this.nqj * var1.g_y + this.o_8 * var1.na1 + this.na1 * var1.f36;
      double var26 = this.ye8 * var1.jf3 + this.h_8 * var1.sgz + this.twh * var1.ji8 + this.f36 * var1.ye8;
      double var28 = this.ye8 * var1.o1a + this.h_8 * var1._6_ + this.twh * var1.nqj + this.f36 * var1.h_8;
      double var30 = this.ye8 * var1.j_n + this.h_8 * var1.m10 + this.twh * var1.o_8 + this.f36 * var1.twh;
      double var32 = this.ye8 * var1.uwn + this.h_8 * var1.g_y + this.twh * var1.na1 + this.f36 * var1.f36;
      this.jf3 = var2;
      this.o1a = var4;
      this.j_n = var6;
      this.uwn = var8;
      this.sgz = var10;
      this._6_ = var12;
      this.m10 = var14;
      this.g_y = var16;
      this.ji8 = var18;
      this.nqj = var20;
      this.o_8 = var22;
      this.na1 = var24;
      this.ye8 = var26;
      this.h_8 = var28;
      this.twh = var30;
      this.f36 = var32;
   }

   public final void igx(onPlayerUpdate param1, onPlayerUpdate param2) {
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
      // 010: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifne 2ee
      // 019: goto 020
      // 01c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield onPlayerUpdate.jf3 D
      // 030: aload 2
      // 031: getfield onPlayerUpdate.jf3 D
      // 034: dmul
      // 035: aload 1
      // 036: getfield onPlayerUpdate.o1a D
      // 039: aload 2
      // 03a: getfield onPlayerUpdate.sgz D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield onPlayerUpdate.j_n D
      // 043: aload 2
      // 044: getfield onPlayerUpdate.ji8 D
      // 047: dmul
      // 048: dadd
      // 049: aload 1
      // 04a: getfield onPlayerUpdate.uwn D
      // 04d: aload 2
      // 04e: getfield onPlayerUpdate.ye8 D
      // 051: dmul
      // 052: dadd
      // 053: putfield onPlayerUpdate.jf3 D
      // 056: aload 0
      // 057: aload 1
      // 058: getfield onPlayerUpdate.jf3 D
      // 05b: aload 2
      // 05c: getfield onPlayerUpdate.o1a D
      // 05f: dmul
      // 060: aload 1
      // 061: getfield onPlayerUpdate.o1a D
      // 064: aload 2
      // 065: getfield onPlayerUpdate._6_ D
      // 068: dmul
      // 069: dadd
      // 06a: aload 1
      // 06b: getfield onPlayerUpdate.j_n D
      // 06e: aload 2
      // 06f: getfield onPlayerUpdate.nqj D
      // 072: dmul
      // 073: dadd
      // 074: aload 1
      // 075: getfield onPlayerUpdate.uwn D
      // 078: aload 2
      // 079: getfield onPlayerUpdate.h_8 D
      // 07c: dmul
      // 07d: dadd
      // 07e: putfield onPlayerUpdate.o1a D
      // 081: aload 0
      // 082: aload 1
      // 083: getfield onPlayerUpdate.jf3 D
      // 086: aload 2
      // 087: getfield onPlayerUpdate.j_n D
      // 08a: dmul
      // 08b: aload 1
      // 08c: getfield onPlayerUpdate.o1a D
      // 08f: aload 2
      // 090: getfield onPlayerUpdate.m10 D
      // 093: dmul
      // 094: dadd
      // 095: aload 1
      // 096: getfield onPlayerUpdate.j_n D
      // 099: aload 2
      // 09a: getfield onPlayerUpdate.o_8 D
      // 09d: dmul
      // 09e: dadd
      // 09f: aload 1
      // 0a0: getfield onPlayerUpdate.uwn D
      // 0a3: aload 2
      // 0a4: getfield onPlayerUpdate.twh D
      // 0a7: dmul
      // 0a8: dadd
      // 0a9: putfield onPlayerUpdate.j_n D
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield onPlayerUpdate.jf3 D
      // 0b1: aload 2
      // 0b2: getfield onPlayerUpdate.uwn D
      // 0b5: dmul
      // 0b6: aload 1
      // 0b7: getfield onPlayerUpdate.o1a D
      // 0ba: aload 2
      // 0bb: getfield onPlayerUpdate.g_y D
      // 0be: dmul
      // 0bf: dadd
      // 0c0: aload 1
      // 0c1: getfield onPlayerUpdate.j_n D
      // 0c4: aload 2
      // 0c5: getfield onPlayerUpdate.na1 D
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: aload 1
      // 0cb: getfield onPlayerUpdate.uwn D
      // 0ce: aload 2
      // 0cf: getfield onPlayerUpdate.f36 D
      // 0d2: dmul
      // 0d3: dadd
      // 0d4: putfield onPlayerUpdate.uwn D
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield onPlayerUpdate.sgz D
      // 0dc: aload 2
      // 0dd: getfield onPlayerUpdate.jf3 D
      // 0e0: dmul
      // 0e1: aload 1
      // 0e2: getfield onPlayerUpdate._6_ D
      // 0e5: aload 2
      // 0e6: getfield onPlayerUpdate.sgz D
      // 0e9: dmul
      // 0ea: dadd
      // 0eb: aload 1
      // 0ec: getfield onPlayerUpdate.m10 D
      // 0ef: aload 2
      // 0f0: getfield onPlayerUpdate.ji8 D
      // 0f3: dmul
      // 0f4: dadd
      // 0f5: aload 1
      // 0f6: getfield onPlayerUpdate.g_y D
      // 0f9: aload 2
      // 0fa: getfield onPlayerUpdate.ye8 D
      // 0fd: dmul
      // 0fe: dadd
      // 0ff: putfield onPlayerUpdate.sgz D
      // 102: aload 0
      // 103: aload 1
      // 104: getfield onPlayerUpdate.sgz D
      // 107: aload 2
      // 108: getfield onPlayerUpdate.o1a D
      // 10b: dmul
      // 10c: aload 1
      // 10d: getfield onPlayerUpdate._6_ D
      // 110: aload 2
      // 111: getfield onPlayerUpdate._6_ D
      // 114: dmul
      // 115: dadd
      // 116: aload 1
      // 117: getfield onPlayerUpdate.m10 D
      // 11a: aload 2
      // 11b: getfield onPlayerUpdate.nqj D
      // 11e: dmul
      // 11f: dadd
      // 120: aload 1
      // 121: getfield onPlayerUpdate.g_y D
      // 124: aload 2
      // 125: getfield onPlayerUpdate.h_8 D
      // 128: dmul
      // 129: dadd
      // 12a: putfield onPlayerUpdate._6_ D
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield onPlayerUpdate.sgz D
      // 132: aload 2
      // 133: getfield onPlayerUpdate.j_n D
      // 136: dmul
      // 137: aload 1
      // 138: getfield onPlayerUpdate._6_ D
      // 13b: aload 2
      // 13c: getfield onPlayerUpdate.m10 D
      // 13f: dmul
      // 140: dadd
      // 141: aload 1
      // 142: getfield onPlayerUpdate.m10 D
      // 145: aload 2
      // 146: getfield onPlayerUpdate.o_8 D
      // 149: dmul
      // 14a: dadd
      // 14b: aload 1
      // 14c: getfield onPlayerUpdate.g_y D
      // 14f: aload 2
      // 150: getfield onPlayerUpdate.twh D
      // 153: dmul
      // 154: dadd
      // 155: putfield onPlayerUpdate.m10 D
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield onPlayerUpdate.sgz D
      // 15d: aload 2
      // 15e: getfield onPlayerUpdate.uwn D
      // 161: dmul
      // 162: aload 1
      // 163: getfield onPlayerUpdate._6_ D
      // 166: aload 2
      // 167: getfield onPlayerUpdate.g_y D
      // 16a: dmul
      // 16b: dadd
      // 16c: aload 1
      // 16d: getfield onPlayerUpdate.m10 D
      // 170: aload 2
      // 171: getfield onPlayerUpdate.na1 D
      // 174: dmul
      // 175: dadd
      // 176: aload 1
      // 177: getfield onPlayerUpdate.g_y D
      // 17a: aload 2
      // 17b: getfield onPlayerUpdate.f36 D
      // 17e: dmul
      // 17f: dadd
      // 180: putfield onPlayerUpdate.g_y D
      // 183: aload 0
      // 184: aload 1
      // 185: getfield onPlayerUpdate.ji8 D
      // 188: aload 2
      // 189: getfield onPlayerUpdate.jf3 D
      // 18c: dmul
      // 18d: aload 1
      // 18e: getfield onPlayerUpdate.nqj D
      // 191: aload 2
      // 192: getfield onPlayerUpdate.sgz D
      // 195: dmul
      // 196: dadd
      // 197: aload 1
      // 198: getfield onPlayerUpdate.o_8 D
      // 19b: aload 2
      // 19c: getfield onPlayerUpdate.ji8 D
      // 19f: dmul
      // 1a0: dadd
      // 1a1: aload 1
      // 1a2: getfield onPlayerUpdate.na1 D
      // 1a5: aload 2
      // 1a6: getfield onPlayerUpdate.ye8 D
      // 1a9: dmul
      // 1aa: dadd
      // 1ab: putfield onPlayerUpdate.ji8 D
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield onPlayerUpdate.ji8 D
      // 1b3: aload 2
      // 1b4: getfield onPlayerUpdate.o1a D
      // 1b7: dmul
      // 1b8: aload 1
      // 1b9: getfield onPlayerUpdate.nqj D
      // 1bc: aload 2
      // 1bd: getfield onPlayerUpdate._6_ D
      // 1c0: dmul
      // 1c1: dadd
      // 1c2: aload 1
      // 1c3: getfield onPlayerUpdate.o_8 D
      // 1c6: aload 2
      // 1c7: getfield onPlayerUpdate.nqj D
      // 1ca: dmul
      // 1cb: dadd
      // 1cc: aload 1
      // 1cd: getfield onPlayerUpdate.na1 D
      // 1d0: aload 2
      // 1d1: getfield onPlayerUpdate.h_8 D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: putfield onPlayerUpdate.nqj D
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield onPlayerUpdate.ji8 D
      // 1de: aload 2
      // 1df: getfield onPlayerUpdate.j_n D
      // 1e2: dmul
      // 1e3: aload 1
      // 1e4: getfield onPlayerUpdate.nqj D
      // 1e7: aload 2
      // 1e8: getfield onPlayerUpdate.m10 D
      // 1eb: dmul
      // 1ec: dadd
      // 1ed: aload 1
      // 1ee: getfield onPlayerUpdate.o_8 D
      // 1f1: aload 2
      // 1f2: getfield onPlayerUpdate.o_8 D
      // 1f5: dmul
      // 1f6: dadd
      // 1f7: aload 1
      // 1f8: getfield onPlayerUpdate.na1 D
      // 1fb: aload 2
      // 1fc: getfield onPlayerUpdate.twh D
      // 1ff: dmul
      // 200: dadd
      // 201: putfield onPlayerUpdate.o_8 D
      // 204: aload 0
      // 205: aload 1
      // 206: getfield onPlayerUpdate.ji8 D
      // 209: aload 2
      // 20a: getfield onPlayerUpdate.uwn D
      // 20d: dmul
      // 20e: aload 1
      // 20f: getfield onPlayerUpdate.nqj D
      // 212: aload 2
      // 213: getfield onPlayerUpdate.g_y D
      // 216: dmul
      // 217: dadd
      // 218: aload 1
      // 219: getfield onPlayerUpdate.o_8 D
      // 21c: aload 2
      // 21d: getfield onPlayerUpdate.na1 D
      // 220: dmul
      // 221: dadd
      // 222: aload 1
      // 223: getfield onPlayerUpdate.na1 D
      // 226: aload 2
      // 227: getfield onPlayerUpdate.f36 D
      // 22a: dmul
      // 22b: dadd
      // 22c: putfield onPlayerUpdate.na1 D
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield onPlayerUpdate.ye8 D
      // 234: aload 2
      // 235: getfield onPlayerUpdate.jf3 D
      // 238: dmul
      // 239: aload 1
      // 23a: getfield onPlayerUpdate.h_8 D
      // 23d: aload 2
      // 23e: getfield onPlayerUpdate.sgz D
      // 241: dmul
      // 242: dadd
      // 243: aload 1
      // 244: getfield onPlayerUpdate.twh D
      // 247: aload 2
      // 248: getfield onPlayerUpdate.ji8 D
      // 24b: dmul
      // 24c: dadd
      // 24d: aload 1
      // 24e: getfield onPlayerUpdate.f36 D
      // 251: aload 2
      // 252: getfield onPlayerUpdate.ye8 D
      // 255: dmul
      // 256: dadd
      // 257: putfield onPlayerUpdate.ye8 D
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield onPlayerUpdate.ye8 D
      // 25f: aload 2
      // 260: getfield onPlayerUpdate.o1a D
      // 263: dmul
      // 264: aload 1
      // 265: getfield onPlayerUpdate.h_8 D
      // 268: aload 2
      // 269: getfield onPlayerUpdate._6_ D
      // 26c: dmul
      // 26d: dadd
      // 26e: aload 1
      // 26f: getfield onPlayerUpdate.twh D
      // 272: aload 2
      // 273: getfield onPlayerUpdate.nqj D
      // 276: dmul
      // 277: dadd
      // 278: aload 1
      // 279: getfield onPlayerUpdate.f36 D
      // 27c: aload 2
      // 27d: getfield onPlayerUpdate.h_8 D
      // 280: dmul
      // 281: dadd
      // 282: putfield onPlayerUpdate.h_8 D
      // 285: aload 0
      // 286: aload 1
      // 287: getfield onPlayerUpdate.ye8 D
      // 28a: aload 2
      // 28b: getfield onPlayerUpdate.j_n D
      // 28e: dmul
      // 28f: aload 1
      // 290: getfield onPlayerUpdate.h_8 D
      // 293: aload 2
      // 294: getfield onPlayerUpdate.m10 D
      // 297: dmul
      // 298: dadd
      // 299: aload 1
      // 29a: getfield onPlayerUpdate.twh D
      // 29d: aload 2
      // 29e: getfield onPlayerUpdate.o_8 D
      // 2a1: dmul
      // 2a2: dadd
      // 2a3: aload 1
      // 2a4: getfield onPlayerUpdate.f36 D
      // 2a7: aload 2
      // 2a8: getfield onPlayerUpdate.twh D
      // 2ab: dmul
      // 2ac: dadd
      // 2ad: putfield onPlayerUpdate.twh D
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield onPlayerUpdate.ye8 D
      // 2b5: aload 2
      // 2b6: getfield onPlayerUpdate.uwn D
      // 2b9: dmul
      // 2ba: aload 1
      // 2bb: getfield onPlayerUpdate.h_8 D
      // 2be: aload 2
      // 2bf: getfield onPlayerUpdate.g_y D
      // 2c2: dmul
      // 2c3: dadd
      // 2c4: aload 1
      // 2c5: getfield onPlayerUpdate.twh D
      // 2c8: aload 2
      // 2c9: getfield onPlayerUpdate.na1 D
      // 2cc: dmul
      // 2cd: dadd
      // 2ce: aload 1
      // 2cf: getfield onPlayerUpdate.f36 D
      // 2d2: aload 2
      // 2d3: getfield onPlayerUpdate.f36 D
      // 2d6: dmul
      // 2d7: dadd
      // 2d8: putfield onPlayerUpdate.f36 D
      // 2db: iload 3
      // 2dc: ifeq 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield onPlayerUpdate.jf3 D
      // 2f1: aload 2
      // 2f2: getfield onPlayerUpdate.jf3 D
      // 2f5: dmul
      // 2f6: aload 1
      // 2f7: getfield onPlayerUpdate.o1a D
      // 2fa: aload 2
      // 2fb: getfield onPlayerUpdate.sgz D
      // 2fe: dmul
      // 2ff: dadd
      // 300: aload 1
      // 301: getfield onPlayerUpdate.j_n D
      // 304: aload 2
      // 305: getfield onPlayerUpdate.ji8 D
      // 308: dmul
      // 309: dadd
      // 30a: aload 1
      // 30b: getfield onPlayerUpdate.uwn D
      // 30e: aload 2
      // 30f: getfield onPlayerUpdate.ye8 D
      // 312: dmul
      // 313: dadd
      // 314: dstore 4
      // 316: aload 1
      // 317: getfield onPlayerUpdate.jf3 D
      // 31a: aload 2
      // 31b: getfield onPlayerUpdate.o1a D
      // 31e: dmul
      // 31f: aload 1
      // 320: getfield onPlayerUpdate.o1a D
      // 323: aload 2
      // 324: getfield onPlayerUpdate._6_ D
      // 327: dmul
      // 328: dadd
      // 329: aload 1
      // 32a: getfield onPlayerUpdate.j_n D
      // 32d: aload 2
      // 32e: getfield onPlayerUpdate.nqj D
      // 331: dmul
      // 332: dadd
      // 333: aload 1
      // 334: getfield onPlayerUpdate.uwn D
      // 337: aload 2
      // 338: getfield onPlayerUpdate.h_8 D
      // 33b: dmul
      // 33c: dadd
      // 33d: dstore 6
      // 33f: aload 1
      // 340: getfield onPlayerUpdate.jf3 D
      // 343: aload 2
      // 344: getfield onPlayerUpdate.j_n D
      // 347: dmul
      // 348: aload 1
      // 349: getfield onPlayerUpdate.o1a D
      // 34c: aload 2
      // 34d: getfield onPlayerUpdate.m10 D
      // 350: dmul
      // 351: dadd
      // 352: aload 1
      // 353: getfield onPlayerUpdate.j_n D
      // 356: aload 2
      // 357: getfield onPlayerUpdate.o_8 D
      // 35a: dmul
      // 35b: dadd
      // 35c: aload 1
      // 35d: getfield onPlayerUpdate.uwn D
      // 360: aload 2
      // 361: getfield onPlayerUpdate.twh D
      // 364: dmul
      // 365: dadd
      // 366: dstore 8
      // 368: aload 1
      // 369: getfield onPlayerUpdate.jf3 D
      // 36c: aload 2
      // 36d: getfield onPlayerUpdate.uwn D
      // 370: dmul
      // 371: aload 1
      // 372: getfield onPlayerUpdate.o1a D
      // 375: aload 2
      // 376: getfield onPlayerUpdate.g_y D
      // 379: dmul
      // 37a: dadd
      // 37b: aload 1
      // 37c: getfield onPlayerUpdate.j_n D
      // 37f: aload 2
      // 380: getfield onPlayerUpdate.na1 D
      // 383: dmul
      // 384: dadd
      // 385: aload 1
      // 386: getfield onPlayerUpdate.uwn D
      // 389: aload 2
      // 38a: getfield onPlayerUpdate.f36 D
      // 38d: dmul
      // 38e: dadd
      // 38f: dstore 10
      // 391: aload 1
      // 392: getfield onPlayerUpdate.sgz D
      // 395: aload 2
      // 396: getfield onPlayerUpdate.jf3 D
      // 399: dmul
      // 39a: aload 1
      // 39b: getfield onPlayerUpdate._6_ D
      // 39e: aload 2
      // 39f: getfield onPlayerUpdate.sgz D
      // 3a2: dmul
      // 3a3: dadd
      // 3a4: aload 1
      // 3a5: getfield onPlayerUpdate.m10 D
      // 3a8: aload 2
      // 3a9: getfield onPlayerUpdate.ji8 D
      // 3ac: dmul
      // 3ad: dadd
      // 3ae: aload 1
      // 3af: getfield onPlayerUpdate.g_y D
      // 3b2: aload 2
      // 3b3: getfield onPlayerUpdate.ye8 D
      // 3b6: dmul
      // 3b7: dadd
      // 3b8: dstore 12
      // 3ba: aload 1
      // 3bb: getfield onPlayerUpdate.sgz D
      // 3be: aload 2
      // 3bf: getfield onPlayerUpdate.o1a D
      // 3c2: dmul
      // 3c3: aload 1
      // 3c4: getfield onPlayerUpdate._6_ D
      // 3c7: aload 2
      // 3c8: getfield onPlayerUpdate._6_ D
      // 3cb: dmul
      // 3cc: dadd
      // 3cd: aload 1
      // 3ce: getfield onPlayerUpdate.m10 D
      // 3d1: aload 2
      // 3d2: getfield onPlayerUpdate.nqj D
      // 3d5: dmul
      // 3d6: dadd
      // 3d7: aload 1
      // 3d8: getfield onPlayerUpdate.g_y D
      // 3db: aload 2
      // 3dc: getfield onPlayerUpdate.h_8 D
      // 3df: dmul
      // 3e0: dadd
      // 3e1: dstore 14
      // 3e3: aload 1
      // 3e4: getfield onPlayerUpdate.sgz D
      // 3e7: aload 2
      // 3e8: getfield onPlayerUpdate.j_n D
      // 3eb: dmul
      // 3ec: aload 1
      // 3ed: getfield onPlayerUpdate._6_ D
      // 3f0: aload 2
      // 3f1: getfield onPlayerUpdate.m10 D
      // 3f4: dmul
      // 3f5: dadd
      // 3f6: aload 1
      // 3f7: getfield onPlayerUpdate.m10 D
      // 3fa: aload 2
      // 3fb: getfield onPlayerUpdate.o_8 D
      // 3fe: dmul
      // 3ff: dadd
      // 400: aload 1
      // 401: getfield onPlayerUpdate.g_y D
      // 404: aload 2
      // 405: getfield onPlayerUpdate.twh D
      // 408: dmul
      // 409: dadd
      // 40a: dstore 16
      // 40c: aload 1
      // 40d: getfield onPlayerUpdate.sgz D
      // 410: aload 2
      // 411: getfield onPlayerUpdate.uwn D
      // 414: dmul
      // 415: aload 1
      // 416: getfield onPlayerUpdate._6_ D
      // 419: aload 2
      // 41a: getfield onPlayerUpdate.g_y D
      // 41d: dmul
      // 41e: dadd
      // 41f: aload 1
      // 420: getfield onPlayerUpdate.m10 D
      // 423: aload 2
      // 424: getfield onPlayerUpdate.na1 D
      // 427: dmul
      // 428: dadd
      // 429: aload 1
      // 42a: getfield onPlayerUpdate.g_y D
      // 42d: aload 2
      // 42e: getfield onPlayerUpdate.f36 D
      // 431: dmul
      // 432: dadd
      // 433: dstore 18
      // 435: aload 1
      // 436: getfield onPlayerUpdate.ji8 D
      // 439: aload 2
      // 43a: getfield onPlayerUpdate.jf3 D
      // 43d: dmul
      // 43e: aload 1
      // 43f: getfield onPlayerUpdate.nqj D
      // 442: aload 2
      // 443: getfield onPlayerUpdate.sgz D
      // 446: dmul
      // 447: dadd
      // 448: aload 1
      // 449: getfield onPlayerUpdate.o_8 D
      // 44c: aload 2
      // 44d: getfield onPlayerUpdate.ji8 D
      // 450: dmul
      // 451: dadd
      // 452: aload 1
      // 453: getfield onPlayerUpdate.na1 D
      // 456: aload 2
      // 457: getfield onPlayerUpdate.ye8 D
      // 45a: dmul
      // 45b: dadd
      // 45c: dstore 20
      // 45e: aload 1
      // 45f: getfield onPlayerUpdate.ji8 D
      // 462: aload 2
      // 463: getfield onPlayerUpdate.o1a D
      // 466: dmul
      // 467: aload 1
      // 468: getfield onPlayerUpdate.nqj D
      // 46b: aload 2
      // 46c: getfield onPlayerUpdate._6_ D
      // 46f: dmul
      // 470: dadd
      // 471: aload 1
      // 472: getfield onPlayerUpdate.o_8 D
      // 475: aload 2
      // 476: getfield onPlayerUpdate.nqj D
      // 479: dmul
      // 47a: dadd
      // 47b: aload 1
      // 47c: getfield onPlayerUpdate.na1 D
      // 47f: aload 2
      // 480: getfield onPlayerUpdate.h_8 D
      // 483: dmul
      // 484: dadd
      // 485: dstore 22
      // 487: aload 1
      // 488: getfield onPlayerUpdate.ji8 D
      // 48b: aload 2
      // 48c: getfield onPlayerUpdate.j_n D
      // 48f: dmul
      // 490: aload 1
      // 491: getfield onPlayerUpdate.nqj D
      // 494: aload 2
      // 495: getfield onPlayerUpdate.m10 D
      // 498: dmul
      // 499: dadd
      // 49a: aload 1
      // 49b: getfield onPlayerUpdate.o_8 D
      // 49e: aload 2
      // 49f: getfield onPlayerUpdate.o_8 D
      // 4a2: dmul
      // 4a3: dadd
      // 4a4: aload 1
      // 4a5: getfield onPlayerUpdate.na1 D
      // 4a8: aload 2
      // 4a9: getfield onPlayerUpdate.twh D
      // 4ac: dmul
      // 4ad: dadd
      // 4ae: dstore 24
      // 4b0: aload 1
      // 4b1: getfield onPlayerUpdate.ji8 D
      // 4b4: aload 2
      // 4b5: getfield onPlayerUpdate.uwn D
      // 4b8: dmul
      // 4b9: aload 1
      // 4ba: getfield onPlayerUpdate.nqj D
      // 4bd: aload 2
      // 4be: getfield onPlayerUpdate.g_y D
      // 4c1: dmul
      // 4c2: dadd
      // 4c3: aload 1
      // 4c4: getfield onPlayerUpdate.o_8 D
      // 4c7: aload 2
      // 4c8: getfield onPlayerUpdate.na1 D
      // 4cb: dmul
      // 4cc: dadd
      // 4cd: aload 1
      // 4ce: getfield onPlayerUpdate.na1 D
      // 4d1: aload 2
      // 4d2: getfield onPlayerUpdate.f36 D
      // 4d5: dmul
      // 4d6: dadd
      // 4d7: dstore 26
      // 4d9: aload 1
      // 4da: getfield onPlayerUpdate.ye8 D
      // 4dd: aload 2
      // 4de: getfield onPlayerUpdate.jf3 D
      // 4e1: dmul
      // 4e2: aload 1
      // 4e3: getfield onPlayerUpdate.h_8 D
      // 4e6: aload 2
      // 4e7: getfield onPlayerUpdate.sgz D
      // 4ea: dmul
      // 4eb: dadd
      // 4ec: aload 1
      // 4ed: getfield onPlayerUpdate.twh D
      // 4f0: aload 2
      // 4f1: getfield onPlayerUpdate.ji8 D
      // 4f4: dmul
      // 4f5: dadd
      // 4f6: aload 1
      // 4f7: getfield onPlayerUpdate.f36 D
      // 4fa: aload 2
      // 4fb: getfield onPlayerUpdate.ye8 D
      // 4fe: dmul
      // 4ff: dadd
      // 500: dstore 28
      // 502: aload 1
      // 503: getfield onPlayerUpdate.ye8 D
      // 506: aload 2
      // 507: getfield onPlayerUpdate.o1a D
      // 50a: dmul
      // 50b: aload 1
      // 50c: getfield onPlayerUpdate.h_8 D
      // 50f: aload 2
      // 510: getfield onPlayerUpdate._6_ D
      // 513: dmul
      // 514: dadd
      // 515: aload 1
      // 516: getfield onPlayerUpdate.twh D
      // 519: aload 2
      // 51a: getfield onPlayerUpdate.nqj D
      // 51d: dmul
      // 51e: dadd
      // 51f: aload 1
      // 520: getfield onPlayerUpdate.f36 D
      // 523: aload 2
      // 524: getfield onPlayerUpdate.h_8 D
      // 527: dmul
      // 528: dadd
      // 529: dstore 30
      // 52b: aload 1
      // 52c: getfield onPlayerUpdate.ye8 D
      // 52f: aload 2
      // 530: getfield onPlayerUpdate.j_n D
      // 533: dmul
      // 534: aload 1
      // 535: getfield onPlayerUpdate.h_8 D
      // 538: aload 2
      // 539: getfield onPlayerUpdate.m10 D
      // 53c: dmul
      // 53d: dadd
      // 53e: aload 1
      // 53f: getfield onPlayerUpdate.twh D
      // 542: aload 2
      // 543: getfield onPlayerUpdate.o_8 D
      // 546: dmul
      // 547: dadd
      // 548: aload 1
      // 549: getfield onPlayerUpdate.f36 D
      // 54c: aload 2
      // 54d: getfield onPlayerUpdate.twh D
      // 550: dmul
      // 551: dadd
      // 552: dstore 32
      // 554: aload 1
      // 555: getfield onPlayerUpdate.ye8 D
      // 558: aload 2
      // 559: getfield onPlayerUpdate.uwn D
      // 55c: dmul
      // 55d: aload 1
      // 55e: getfield onPlayerUpdate.h_8 D
      // 561: aload 2
      // 562: getfield onPlayerUpdate.g_y D
      // 565: dmul
      // 566: dadd
      // 567: aload 1
      // 568: getfield onPlayerUpdate.twh D
      // 56b: aload 2
      // 56c: getfield onPlayerUpdate.na1 D
      // 56f: dmul
      // 570: dadd
      // 571: aload 1
      // 572: getfield onPlayerUpdate.f36 D
      // 575: aload 2
      // 576: getfield onPlayerUpdate.f36 D
      // 579: dmul
      // 57a: dadd
      // 57b: dstore 34
      // 57d: aload 0
      // 57e: dload 4
      // 580: putfield onPlayerUpdate.jf3 D
      // 583: aload 0
      // 584: dload 6
      // 586: putfield onPlayerUpdate.o1a D
      // 589: aload 0
      // 58a: dload 8
      // 58c: putfield onPlayerUpdate.j_n D
      // 58f: aload 0
      // 590: dload 10
      // 592: putfield onPlayerUpdate.uwn D
      // 595: aload 0
      // 596: dload 12
      // 598: putfield onPlayerUpdate.sgz D
      // 59b: aload 0
      // 59c: dload 14
      // 59e: putfield onPlayerUpdate._6_ D
      // 5a1: aload 0
      // 5a2: dload 16
      // 5a4: putfield onPlayerUpdate.m10 D
      // 5a7: aload 0
      // 5a8: dload 18
      // 5aa: putfield onPlayerUpdate.g_y D
      // 5ad: aload 0
      // 5ae: dload 20
      // 5b0: putfield onPlayerUpdate.ji8 D
      // 5b3: aload 0
      // 5b4: dload 22
      // 5b6: putfield onPlayerUpdate.nqj D
      // 5b9: aload 0
      // 5ba: dload 24
      // 5bc: putfield onPlayerUpdate.o_8 D
      // 5bf: aload 0
      // 5c0: dload 26
      // 5c2: putfield onPlayerUpdate.na1 D
      // 5c5: aload 0
      // 5c6: dload 28
      // 5c8: putfield onPlayerUpdate.ye8 D
      // 5cb: aload 0
      // 5cc: dload 30
      // 5ce: putfield onPlayerUpdate.h_8 D
      // 5d1: aload 0
      // 5d2: dload 32
      // 5d4: putfield onPlayerUpdate.twh D
      // 5d7: aload 0
      // 5d8: dload 34
      // 5da: putfield onPlayerUpdate.f36 D
      // 5dd: return
   }

   public final void q65(onPlayerUpdate param1, onPlayerUpdate param2) {
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
      // 010: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 2ee
      // 019: goto 020
      // 01c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield onPlayerUpdate.jf3 D
      // 030: aload 2
      // 031: getfield onPlayerUpdate.jf3 D
      // 034: dmul
      // 035: aload 1
      // 036: getfield onPlayerUpdate.sgz D
      // 039: aload 2
      // 03a: getfield onPlayerUpdate.o1a D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield onPlayerUpdate.ji8 D
      // 043: aload 2
      // 044: getfield onPlayerUpdate.j_n D
      // 047: dmul
      // 048: dadd
      // 049: aload 1
      // 04a: getfield onPlayerUpdate.ye8 D
      // 04d: aload 2
      // 04e: getfield onPlayerUpdate.uwn D
      // 051: dmul
      // 052: dadd
      // 053: putfield onPlayerUpdate.jf3 D
      // 056: aload 0
      // 057: aload 1
      // 058: getfield onPlayerUpdate.jf3 D
      // 05b: aload 2
      // 05c: getfield onPlayerUpdate.sgz D
      // 05f: dmul
      // 060: aload 1
      // 061: getfield onPlayerUpdate.sgz D
      // 064: aload 2
      // 065: getfield onPlayerUpdate._6_ D
      // 068: dmul
      // 069: dadd
      // 06a: aload 1
      // 06b: getfield onPlayerUpdate.ji8 D
      // 06e: aload 2
      // 06f: getfield onPlayerUpdate.m10 D
      // 072: dmul
      // 073: dadd
      // 074: aload 1
      // 075: getfield onPlayerUpdate.ye8 D
      // 078: aload 2
      // 079: getfield onPlayerUpdate.g_y D
      // 07c: dmul
      // 07d: dadd
      // 07e: putfield onPlayerUpdate.o1a D
      // 081: aload 0
      // 082: aload 1
      // 083: getfield onPlayerUpdate.jf3 D
      // 086: aload 2
      // 087: getfield onPlayerUpdate.ji8 D
      // 08a: dmul
      // 08b: aload 1
      // 08c: getfield onPlayerUpdate.sgz D
      // 08f: aload 2
      // 090: getfield onPlayerUpdate.nqj D
      // 093: dmul
      // 094: dadd
      // 095: aload 1
      // 096: getfield onPlayerUpdate.ji8 D
      // 099: aload 2
      // 09a: getfield onPlayerUpdate.o_8 D
      // 09d: dmul
      // 09e: dadd
      // 09f: aload 1
      // 0a0: getfield onPlayerUpdate.ye8 D
      // 0a3: aload 2
      // 0a4: getfield onPlayerUpdate.na1 D
      // 0a7: dmul
      // 0a8: dadd
      // 0a9: putfield onPlayerUpdate.j_n D
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield onPlayerUpdate.jf3 D
      // 0b1: aload 2
      // 0b2: getfield onPlayerUpdate.ye8 D
      // 0b5: dmul
      // 0b6: aload 1
      // 0b7: getfield onPlayerUpdate.sgz D
      // 0ba: aload 2
      // 0bb: getfield onPlayerUpdate.h_8 D
      // 0be: dmul
      // 0bf: dadd
      // 0c0: aload 1
      // 0c1: getfield onPlayerUpdate.ji8 D
      // 0c4: aload 2
      // 0c5: getfield onPlayerUpdate.twh D
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: aload 1
      // 0cb: getfield onPlayerUpdate.ye8 D
      // 0ce: aload 2
      // 0cf: getfield onPlayerUpdate.f36 D
      // 0d2: dmul
      // 0d3: dadd
      // 0d4: putfield onPlayerUpdate.uwn D
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield onPlayerUpdate.o1a D
      // 0dc: aload 2
      // 0dd: getfield onPlayerUpdate.jf3 D
      // 0e0: dmul
      // 0e1: aload 1
      // 0e2: getfield onPlayerUpdate._6_ D
      // 0e5: aload 2
      // 0e6: getfield onPlayerUpdate.o1a D
      // 0e9: dmul
      // 0ea: dadd
      // 0eb: aload 1
      // 0ec: getfield onPlayerUpdate.nqj D
      // 0ef: aload 2
      // 0f0: getfield onPlayerUpdate.j_n D
      // 0f3: dmul
      // 0f4: dadd
      // 0f5: aload 1
      // 0f6: getfield onPlayerUpdate.h_8 D
      // 0f9: aload 2
      // 0fa: getfield onPlayerUpdate.uwn D
      // 0fd: dmul
      // 0fe: dadd
      // 0ff: putfield onPlayerUpdate.sgz D
      // 102: aload 0
      // 103: aload 1
      // 104: getfield onPlayerUpdate.o1a D
      // 107: aload 2
      // 108: getfield onPlayerUpdate.sgz D
      // 10b: dmul
      // 10c: aload 1
      // 10d: getfield onPlayerUpdate._6_ D
      // 110: aload 2
      // 111: getfield onPlayerUpdate._6_ D
      // 114: dmul
      // 115: dadd
      // 116: aload 1
      // 117: getfield onPlayerUpdate.nqj D
      // 11a: aload 2
      // 11b: getfield onPlayerUpdate.m10 D
      // 11e: dmul
      // 11f: dadd
      // 120: aload 1
      // 121: getfield onPlayerUpdate.h_8 D
      // 124: aload 2
      // 125: getfield onPlayerUpdate.g_y D
      // 128: dmul
      // 129: dadd
      // 12a: putfield onPlayerUpdate._6_ D
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield onPlayerUpdate.o1a D
      // 132: aload 2
      // 133: getfield onPlayerUpdate.ji8 D
      // 136: dmul
      // 137: aload 1
      // 138: getfield onPlayerUpdate._6_ D
      // 13b: aload 2
      // 13c: getfield onPlayerUpdate.nqj D
      // 13f: dmul
      // 140: dadd
      // 141: aload 1
      // 142: getfield onPlayerUpdate.nqj D
      // 145: aload 2
      // 146: getfield onPlayerUpdate.o_8 D
      // 149: dmul
      // 14a: dadd
      // 14b: aload 1
      // 14c: getfield onPlayerUpdate.h_8 D
      // 14f: aload 2
      // 150: getfield onPlayerUpdate.na1 D
      // 153: dmul
      // 154: dadd
      // 155: putfield onPlayerUpdate.m10 D
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield onPlayerUpdate.o1a D
      // 15d: aload 2
      // 15e: getfield onPlayerUpdate.ye8 D
      // 161: dmul
      // 162: aload 1
      // 163: getfield onPlayerUpdate._6_ D
      // 166: aload 2
      // 167: getfield onPlayerUpdate.h_8 D
      // 16a: dmul
      // 16b: dadd
      // 16c: aload 1
      // 16d: getfield onPlayerUpdate.nqj D
      // 170: aload 2
      // 171: getfield onPlayerUpdate.twh D
      // 174: dmul
      // 175: dadd
      // 176: aload 1
      // 177: getfield onPlayerUpdate.h_8 D
      // 17a: aload 2
      // 17b: getfield onPlayerUpdate.f36 D
      // 17e: dmul
      // 17f: dadd
      // 180: putfield onPlayerUpdate.g_y D
      // 183: aload 0
      // 184: aload 1
      // 185: getfield onPlayerUpdate.j_n D
      // 188: aload 2
      // 189: getfield onPlayerUpdate.jf3 D
      // 18c: dmul
      // 18d: aload 1
      // 18e: getfield onPlayerUpdate.m10 D
      // 191: aload 2
      // 192: getfield onPlayerUpdate.o1a D
      // 195: dmul
      // 196: dadd
      // 197: aload 1
      // 198: getfield onPlayerUpdate.o_8 D
      // 19b: aload 2
      // 19c: getfield onPlayerUpdate.j_n D
      // 19f: dmul
      // 1a0: dadd
      // 1a1: aload 1
      // 1a2: getfield onPlayerUpdate.twh D
      // 1a5: aload 2
      // 1a6: getfield onPlayerUpdate.uwn D
      // 1a9: dmul
      // 1aa: dadd
      // 1ab: putfield onPlayerUpdate.ji8 D
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield onPlayerUpdate.j_n D
      // 1b3: aload 2
      // 1b4: getfield onPlayerUpdate.sgz D
      // 1b7: dmul
      // 1b8: aload 1
      // 1b9: getfield onPlayerUpdate.m10 D
      // 1bc: aload 2
      // 1bd: getfield onPlayerUpdate._6_ D
      // 1c0: dmul
      // 1c1: dadd
      // 1c2: aload 1
      // 1c3: getfield onPlayerUpdate.o_8 D
      // 1c6: aload 2
      // 1c7: getfield onPlayerUpdate.m10 D
      // 1ca: dmul
      // 1cb: dadd
      // 1cc: aload 1
      // 1cd: getfield onPlayerUpdate.twh D
      // 1d0: aload 2
      // 1d1: getfield onPlayerUpdate.g_y D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: putfield onPlayerUpdate.nqj D
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield onPlayerUpdate.j_n D
      // 1de: aload 2
      // 1df: getfield onPlayerUpdate.ji8 D
      // 1e2: dmul
      // 1e3: aload 1
      // 1e4: getfield onPlayerUpdate.m10 D
      // 1e7: aload 2
      // 1e8: getfield onPlayerUpdate.nqj D
      // 1eb: dmul
      // 1ec: dadd
      // 1ed: aload 1
      // 1ee: getfield onPlayerUpdate.o_8 D
      // 1f1: aload 2
      // 1f2: getfield onPlayerUpdate.o_8 D
      // 1f5: dmul
      // 1f6: dadd
      // 1f7: aload 1
      // 1f8: getfield onPlayerUpdate.twh D
      // 1fb: aload 2
      // 1fc: getfield onPlayerUpdate.na1 D
      // 1ff: dmul
      // 200: dadd
      // 201: putfield onPlayerUpdate.o_8 D
      // 204: aload 0
      // 205: aload 1
      // 206: getfield onPlayerUpdate.j_n D
      // 209: aload 2
      // 20a: getfield onPlayerUpdate.ye8 D
      // 20d: dmul
      // 20e: aload 1
      // 20f: getfield onPlayerUpdate.m10 D
      // 212: aload 2
      // 213: getfield onPlayerUpdate.h_8 D
      // 216: dmul
      // 217: dadd
      // 218: aload 1
      // 219: getfield onPlayerUpdate.o_8 D
      // 21c: aload 2
      // 21d: getfield onPlayerUpdate.twh D
      // 220: dmul
      // 221: dadd
      // 222: aload 1
      // 223: getfield onPlayerUpdate.twh D
      // 226: aload 2
      // 227: getfield onPlayerUpdate.f36 D
      // 22a: dmul
      // 22b: dadd
      // 22c: putfield onPlayerUpdate.na1 D
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield onPlayerUpdate.uwn D
      // 234: aload 2
      // 235: getfield onPlayerUpdate.jf3 D
      // 238: dmul
      // 239: aload 1
      // 23a: getfield onPlayerUpdate.g_y D
      // 23d: aload 2
      // 23e: getfield onPlayerUpdate.o1a D
      // 241: dmul
      // 242: dadd
      // 243: aload 1
      // 244: getfield onPlayerUpdate.na1 D
      // 247: aload 2
      // 248: getfield onPlayerUpdate.j_n D
      // 24b: dmul
      // 24c: dadd
      // 24d: aload 1
      // 24e: getfield onPlayerUpdate.f36 D
      // 251: aload 2
      // 252: getfield onPlayerUpdate.uwn D
      // 255: dmul
      // 256: dadd
      // 257: putfield onPlayerUpdate.ye8 D
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield onPlayerUpdate.uwn D
      // 25f: aload 2
      // 260: getfield onPlayerUpdate.sgz D
      // 263: dmul
      // 264: aload 1
      // 265: getfield onPlayerUpdate.g_y D
      // 268: aload 2
      // 269: getfield onPlayerUpdate._6_ D
      // 26c: dmul
      // 26d: dadd
      // 26e: aload 1
      // 26f: getfield onPlayerUpdate.na1 D
      // 272: aload 2
      // 273: getfield onPlayerUpdate.m10 D
      // 276: dmul
      // 277: dadd
      // 278: aload 1
      // 279: getfield onPlayerUpdate.f36 D
      // 27c: aload 2
      // 27d: getfield onPlayerUpdate.g_y D
      // 280: dmul
      // 281: dadd
      // 282: putfield onPlayerUpdate.h_8 D
      // 285: aload 0
      // 286: aload 1
      // 287: getfield onPlayerUpdate.uwn D
      // 28a: aload 2
      // 28b: getfield onPlayerUpdate.ji8 D
      // 28e: dmul
      // 28f: aload 1
      // 290: getfield onPlayerUpdate.g_y D
      // 293: aload 2
      // 294: getfield onPlayerUpdate.nqj D
      // 297: dmul
      // 298: dadd
      // 299: aload 1
      // 29a: getfield onPlayerUpdate.na1 D
      // 29d: aload 2
      // 29e: getfield onPlayerUpdate.o_8 D
      // 2a1: dmul
      // 2a2: dadd
      // 2a3: aload 1
      // 2a4: getfield onPlayerUpdate.f36 D
      // 2a7: aload 2
      // 2a8: getfield onPlayerUpdate.na1 D
      // 2ab: dmul
      // 2ac: dadd
      // 2ad: putfield onPlayerUpdate.twh D
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield onPlayerUpdate.uwn D
      // 2b5: aload 2
      // 2b6: getfield onPlayerUpdate.ye8 D
      // 2b9: dmul
      // 2ba: aload 1
      // 2bb: getfield onPlayerUpdate.g_y D
      // 2be: aload 2
      // 2bf: getfield onPlayerUpdate.h_8 D
      // 2c2: dmul
      // 2c3: dadd
      // 2c4: aload 1
      // 2c5: getfield onPlayerUpdate.na1 D
      // 2c8: aload 2
      // 2c9: getfield onPlayerUpdate.twh D
      // 2cc: dmul
      // 2cd: dadd
      // 2ce: aload 1
      // 2cf: getfield onPlayerUpdate.f36 D
      // 2d2: aload 2
      // 2d3: getfield onPlayerUpdate.f36 D
      // 2d6: dmul
      // 2d7: dadd
      // 2d8: putfield onPlayerUpdate.f36 D
      // 2db: iload 3
      // 2dc: ifne 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield onPlayerUpdate.jf3 D
      // 2f1: aload 2
      // 2f2: getfield onPlayerUpdate.jf3 D
      // 2f5: dmul
      // 2f6: aload 1
      // 2f7: getfield onPlayerUpdate.sgz D
      // 2fa: aload 2
      // 2fb: getfield onPlayerUpdate.o1a D
      // 2fe: dmul
      // 2ff: dadd
      // 300: aload 1
      // 301: getfield onPlayerUpdate.ji8 D
      // 304: aload 2
      // 305: getfield onPlayerUpdate.j_n D
      // 308: dmul
      // 309: dadd
      // 30a: aload 1
      // 30b: getfield onPlayerUpdate.ye8 D
      // 30e: aload 2
      // 30f: getfield onPlayerUpdate.uwn D
      // 312: dmul
      // 313: dadd
      // 314: dstore 4
      // 316: aload 1
      // 317: getfield onPlayerUpdate.jf3 D
      // 31a: aload 2
      // 31b: getfield onPlayerUpdate.sgz D
      // 31e: dmul
      // 31f: aload 1
      // 320: getfield onPlayerUpdate.sgz D
      // 323: aload 2
      // 324: getfield onPlayerUpdate._6_ D
      // 327: dmul
      // 328: dadd
      // 329: aload 1
      // 32a: getfield onPlayerUpdate.ji8 D
      // 32d: aload 2
      // 32e: getfield onPlayerUpdate.m10 D
      // 331: dmul
      // 332: dadd
      // 333: aload 1
      // 334: getfield onPlayerUpdate.ye8 D
      // 337: aload 2
      // 338: getfield onPlayerUpdate.g_y D
      // 33b: dmul
      // 33c: dadd
      // 33d: dstore 6
      // 33f: aload 1
      // 340: getfield onPlayerUpdate.jf3 D
      // 343: aload 2
      // 344: getfield onPlayerUpdate.ji8 D
      // 347: dmul
      // 348: aload 1
      // 349: getfield onPlayerUpdate.sgz D
      // 34c: aload 2
      // 34d: getfield onPlayerUpdate.nqj D
      // 350: dmul
      // 351: dadd
      // 352: aload 1
      // 353: getfield onPlayerUpdate.ji8 D
      // 356: aload 2
      // 357: getfield onPlayerUpdate.o_8 D
      // 35a: dmul
      // 35b: dadd
      // 35c: aload 1
      // 35d: getfield onPlayerUpdate.ye8 D
      // 360: aload 2
      // 361: getfield onPlayerUpdate.na1 D
      // 364: dmul
      // 365: dadd
      // 366: dstore 8
      // 368: aload 1
      // 369: getfield onPlayerUpdate.jf3 D
      // 36c: aload 2
      // 36d: getfield onPlayerUpdate.ye8 D
      // 370: dmul
      // 371: aload 1
      // 372: getfield onPlayerUpdate.sgz D
      // 375: aload 2
      // 376: getfield onPlayerUpdate.h_8 D
      // 379: dmul
      // 37a: dadd
      // 37b: aload 1
      // 37c: getfield onPlayerUpdate.ji8 D
      // 37f: aload 2
      // 380: getfield onPlayerUpdate.twh D
      // 383: dmul
      // 384: dadd
      // 385: aload 1
      // 386: getfield onPlayerUpdate.ye8 D
      // 389: aload 2
      // 38a: getfield onPlayerUpdate.f36 D
      // 38d: dmul
      // 38e: dadd
      // 38f: dstore 10
      // 391: aload 1
      // 392: getfield onPlayerUpdate.o1a D
      // 395: aload 2
      // 396: getfield onPlayerUpdate.jf3 D
      // 399: dmul
      // 39a: aload 1
      // 39b: getfield onPlayerUpdate._6_ D
      // 39e: aload 2
      // 39f: getfield onPlayerUpdate.o1a D
      // 3a2: dmul
      // 3a3: dadd
      // 3a4: aload 1
      // 3a5: getfield onPlayerUpdate.nqj D
      // 3a8: aload 2
      // 3a9: getfield onPlayerUpdate.j_n D
      // 3ac: dmul
      // 3ad: dadd
      // 3ae: aload 1
      // 3af: getfield onPlayerUpdate.h_8 D
      // 3b2: aload 2
      // 3b3: getfield onPlayerUpdate.uwn D
      // 3b6: dmul
      // 3b7: dadd
      // 3b8: dstore 12
      // 3ba: aload 1
      // 3bb: getfield onPlayerUpdate.o1a D
      // 3be: aload 2
      // 3bf: getfield onPlayerUpdate.sgz D
      // 3c2: dmul
      // 3c3: aload 1
      // 3c4: getfield onPlayerUpdate._6_ D
      // 3c7: aload 2
      // 3c8: getfield onPlayerUpdate._6_ D
      // 3cb: dmul
      // 3cc: dadd
      // 3cd: aload 1
      // 3ce: getfield onPlayerUpdate.nqj D
      // 3d1: aload 2
      // 3d2: getfield onPlayerUpdate.m10 D
      // 3d5: dmul
      // 3d6: dadd
      // 3d7: aload 1
      // 3d8: getfield onPlayerUpdate.h_8 D
      // 3db: aload 2
      // 3dc: getfield onPlayerUpdate.g_y D
      // 3df: dmul
      // 3e0: dadd
      // 3e1: dstore 14
      // 3e3: aload 1
      // 3e4: getfield onPlayerUpdate.o1a D
      // 3e7: aload 2
      // 3e8: getfield onPlayerUpdate.ji8 D
      // 3eb: dmul
      // 3ec: aload 1
      // 3ed: getfield onPlayerUpdate._6_ D
      // 3f0: aload 2
      // 3f1: getfield onPlayerUpdate.nqj D
      // 3f4: dmul
      // 3f5: dadd
      // 3f6: aload 1
      // 3f7: getfield onPlayerUpdate.nqj D
      // 3fa: aload 2
      // 3fb: getfield onPlayerUpdate.o_8 D
      // 3fe: dmul
      // 3ff: dadd
      // 400: aload 1
      // 401: getfield onPlayerUpdate.h_8 D
      // 404: aload 2
      // 405: getfield onPlayerUpdate.na1 D
      // 408: dmul
      // 409: dadd
      // 40a: dstore 16
      // 40c: aload 1
      // 40d: getfield onPlayerUpdate.o1a D
      // 410: aload 2
      // 411: getfield onPlayerUpdate.ye8 D
      // 414: dmul
      // 415: aload 1
      // 416: getfield onPlayerUpdate._6_ D
      // 419: aload 2
      // 41a: getfield onPlayerUpdate.h_8 D
      // 41d: dmul
      // 41e: dadd
      // 41f: aload 1
      // 420: getfield onPlayerUpdate.nqj D
      // 423: aload 2
      // 424: getfield onPlayerUpdate.twh D
      // 427: dmul
      // 428: dadd
      // 429: aload 1
      // 42a: getfield onPlayerUpdate.h_8 D
      // 42d: aload 2
      // 42e: getfield onPlayerUpdate.f36 D
      // 431: dmul
      // 432: dadd
      // 433: dstore 18
      // 435: aload 1
      // 436: getfield onPlayerUpdate.j_n D
      // 439: aload 2
      // 43a: getfield onPlayerUpdate.jf3 D
      // 43d: dmul
      // 43e: aload 1
      // 43f: getfield onPlayerUpdate.m10 D
      // 442: aload 2
      // 443: getfield onPlayerUpdate.o1a D
      // 446: dmul
      // 447: dadd
      // 448: aload 1
      // 449: getfield onPlayerUpdate.o_8 D
      // 44c: aload 2
      // 44d: getfield onPlayerUpdate.j_n D
      // 450: dmul
      // 451: dadd
      // 452: aload 1
      // 453: getfield onPlayerUpdate.twh D
      // 456: aload 2
      // 457: getfield onPlayerUpdate.uwn D
      // 45a: dmul
      // 45b: dadd
      // 45c: dstore 20
      // 45e: aload 1
      // 45f: getfield onPlayerUpdate.j_n D
      // 462: aload 2
      // 463: getfield onPlayerUpdate.sgz D
      // 466: dmul
      // 467: aload 1
      // 468: getfield onPlayerUpdate.m10 D
      // 46b: aload 2
      // 46c: getfield onPlayerUpdate._6_ D
      // 46f: dmul
      // 470: dadd
      // 471: aload 1
      // 472: getfield onPlayerUpdate.o_8 D
      // 475: aload 2
      // 476: getfield onPlayerUpdate.m10 D
      // 479: dmul
      // 47a: dadd
      // 47b: aload 1
      // 47c: getfield onPlayerUpdate.twh D
      // 47f: aload 2
      // 480: getfield onPlayerUpdate.g_y D
      // 483: dmul
      // 484: dadd
      // 485: dstore 22
      // 487: aload 1
      // 488: getfield onPlayerUpdate.j_n D
      // 48b: aload 2
      // 48c: getfield onPlayerUpdate.ji8 D
      // 48f: dmul
      // 490: aload 1
      // 491: getfield onPlayerUpdate.m10 D
      // 494: aload 2
      // 495: getfield onPlayerUpdate.nqj D
      // 498: dmul
      // 499: dadd
      // 49a: aload 1
      // 49b: getfield onPlayerUpdate.o_8 D
      // 49e: aload 2
      // 49f: getfield onPlayerUpdate.o_8 D
      // 4a2: dmul
      // 4a3: dadd
      // 4a4: aload 1
      // 4a5: getfield onPlayerUpdate.twh D
      // 4a8: aload 2
      // 4a9: getfield onPlayerUpdate.na1 D
      // 4ac: dmul
      // 4ad: dadd
      // 4ae: dstore 24
      // 4b0: aload 1
      // 4b1: getfield onPlayerUpdate.j_n D
      // 4b4: aload 2
      // 4b5: getfield onPlayerUpdate.ye8 D
      // 4b8: dmul
      // 4b9: aload 1
      // 4ba: getfield onPlayerUpdate.m10 D
      // 4bd: aload 2
      // 4be: getfield onPlayerUpdate.h_8 D
      // 4c1: dmul
      // 4c2: dadd
      // 4c3: aload 1
      // 4c4: getfield onPlayerUpdate.o_8 D
      // 4c7: aload 2
      // 4c8: getfield onPlayerUpdate.twh D
      // 4cb: dmul
      // 4cc: dadd
      // 4cd: aload 1
      // 4ce: getfield onPlayerUpdate.twh D
      // 4d1: aload 2
      // 4d2: getfield onPlayerUpdate.f36 D
      // 4d5: dmul
      // 4d6: dadd
      // 4d7: dstore 26
      // 4d9: aload 1
      // 4da: getfield onPlayerUpdate.uwn D
      // 4dd: aload 2
      // 4de: getfield onPlayerUpdate.jf3 D
      // 4e1: dmul
      // 4e2: aload 1
      // 4e3: getfield onPlayerUpdate.g_y D
      // 4e6: aload 2
      // 4e7: getfield onPlayerUpdate.o1a D
      // 4ea: dmul
      // 4eb: dadd
      // 4ec: aload 1
      // 4ed: getfield onPlayerUpdate.na1 D
      // 4f0: aload 2
      // 4f1: getfield onPlayerUpdate.j_n D
      // 4f4: dmul
      // 4f5: dadd
      // 4f6: aload 1
      // 4f7: getfield onPlayerUpdate.f36 D
      // 4fa: aload 2
      // 4fb: getfield onPlayerUpdate.uwn D
      // 4fe: dmul
      // 4ff: dadd
      // 500: dstore 28
      // 502: aload 1
      // 503: getfield onPlayerUpdate.uwn D
      // 506: aload 2
      // 507: getfield onPlayerUpdate.sgz D
      // 50a: dmul
      // 50b: aload 1
      // 50c: getfield onPlayerUpdate.g_y D
      // 50f: aload 2
      // 510: getfield onPlayerUpdate._6_ D
      // 513: dmul
      // 514: dadd
      // 515: aload 1
      // 516: getfield onPlayerUpdate.na1 D
      // 519: aload 2
      // 51a: getfield onPlayerUpdate.m10 D
      // 51d: dmul
      // 51e: dadd
      // 51f: aload 1
      // 520: getfield onPlayerUpdate.f36 D
      // 523: aload 2
      // 524: getfield onPlayerUpdate.g_y D
      // 527: dmul
      // 528: dadd
      // 529: dstore 30
      // 52b: aload 1
      // 52c: getfield onPlayerUpdate.uwn D
      // 52f: aload 2
      // 530: getfield onPlayerUpdate.ji8 D
      // 533: dmul
      // 534: aload 1
      // 535: getfield onPlayerUpdate.g_y D
      // 538: aload 2
      // 539: getfield onPlayerUpdate.nqj D
      // 53c: dmul
      // 53d: dadd
      // 53e: aload 1
      // 53f: getfield onPlayerUpdate.na1 D
      // 542: aload 2
      // 543: getfield onPlayerUpdate.o_8 D
      // 546: dmul
      // 547: dadd
      // 548: aload 1
      // 549: getfield onPlayerUpdate.f36 D
      // 54c: aload 2
      // 54d: getfield onPlayerUpdate.na1 D
      // 550: dmul
      // 551: dadd
      // 552: dstore 32
      // 554: aload 1
      // 555: getfield onPlayerUpdate.uwn D
      // 558: aload 2
      // 559: getfield onPlayerUpdate.ye8 D
      // 55c: dmul
      // 55d: aload 1
      // 55e: getfield onPlayerUpdate.g_y D
      // 561: aload 2
      // 562: getfield onPlayerUpdate.h_8 D
      // 565: dmul
      // 566: dadd
      // 567: aload 1
      // 568: getfield onPlayerUpdate.na1 D
      // 56b: aload 2
      // 56c: getfield onPlayerUpdate.twh D
      // 56f: dmul
      // 570: dadd
      // 571: aload 1
      // 572: getfield onPlayerUpdate.f36 D
      // 575: aload 2
      // 576: getfield onPlayerUpdate.f36 D
      // 579: dmul
      // 57a: dadd
      // 57b: dstore 34
      // 57d: aload 0
      // 57e: dload 4
      // 580: putfield onPlayerUpdate.jf3 D
      // 583: aload 0
      // 584: dload 6
      // 586: putfield onPlayerUpdate.o1a D
      // 589: aload 0
      // 58a: dload 8
      // 58c: putfield onPlayerUpdate.j_n D
      // 58f: aload 0
      // 590: dload 10
      // 592: putfield onPlayerUpdate.uwn D
      // 595: aload 0
      // 596: dload 12
      // 598: putfield onPlayerUpdate.sgz D
      // 59b: aload 0
      // 59c: dload 14
      // 59e: putfield onPlayerUpdate._6_ D
      // 5a1: aload 0
      // 5a2: dload 16
      // 5a4: putfield onPlayerUpdate.m10 D
      // 5a7: aload 0
      // 5a8: dload 18
      // 5aa: putfield onPlayerUpdate.g_y D
      // 5ad: aload 0
      // 5ae: dload 20
      // 5b0: putfield onPlayerUpdate.ji8 D
      // 5b3: aload 0
      // 5b4: dload 22
      // 5b6: putfield onPlayerUpdate.nqj D
      // 5b9: aload 0
      // 5ba: dload 24
      // 5bc: putfield onPlayerUpdate.o_8 D
      // 5bf: aload 0
      // 5c0: dload 26
      // 5c2: putfield onPlayerUpdate.na1 D
      // 5c5: aload 0
      // 5c6: dload 28
      // 5c8: putfield onPlayerUpdate.ye8 D
      // 5cb: aload 0
      // 5cc: dload 30
      // 5ce: putfield onPlayerUpdate.h_8 D
      // 5d1: aload 0
      // 5d2: dload 32
      // 5d4: putfield onPlayerUpdate.twh D
      // 5d7: aload 0
      // 5d8: dload 34
      // 5da: putfield onPlayerUpdate.f36 D
      // 5dd: return
   }

   public final void aq5(onPlayerUpdate param1, onPlayerUpdate param2) {
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
      // 010: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifne 2ee
      // 019: goto 020
      // 01c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield onPlayerUpdate.jf3 D
      // 030: aload 2
      // 031: getfield onPlayerUpdate.jf3 D
      // 034: dmul
      // 035: aload 1
      // 036: getfield onPlayerUpdate.o1a D
      // 039: aload 2
      // 03a: getfield onPlayerUpdate.o1a D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield onPlayerUpdate.j_n D
      // 043: aload 2
      // 044: getfield onPlayerUpdate.j_n D
      // 047: dmul
      // 048: dadd
      // 049: aload 1
      // 04a: getfield onPlayerUpdate.uwn D
      // 04d: aload 2
      // 04e: getfield onPlayerUpdate.uwn D
      // 051: dmul
      // 052: dadd
      // 053: putfield onPlayerUpdate.jf3 D
      // 056: aload 0
      // 057: aload 1
      // 058: getfield onPlayerUpdate.jf3 D
      // 05b: aload 2
      // 05c: getfield onPlayerUpdate.sgz D
      // 05f: dmul
      // 060: aload 1
      // 061: getfield onPlayerUpdate.o1a D
      // 064: aload 2
      // 065: getfield onPlayerUpdate._6_ D
      // 068: dmul
      // 069: dadd
      // 06a: aload 1
      // 06b: getfield onPlayerUpdate.j_n D
      // 06e: aload 2
      // 06f: getfield onPlayerUpdate.m10 D
      // 072: dmul
      // 073: dadd
      // 074: aload 1
      // 075: getfield onPlayerUpdate.uwn D
      // 078: aload 2
      // 079: getfield onPlayerUpdate.g_y D
      // 07c: dmul
      // 07d: dadd
      // 07e: putfield onPlayerUpdate.o1a D
      // 081: aload 0
      // 082: aload 1
      // 083: getfield onPlayerUpdate.jf3 D
      // 086: aload 2
      // 087: getfield onPlayerUpdate.ji8 D
      // 08a: dmul
      // 08b: aload 1
      // 08c: getfield onPlayerUpdate.o1a D
      // 08f: aload 2
      // 090: getfield onPlayerUpdate.nqj D
      // 093: dmul
      // 094: dadd
      // 095: aload 1
      // 096: getfield onPlayerUpdate.j_n D
      // 099: aload 2
      // 09a: getfield onPlayerUpdate.o_8 D
      // 09d: dmul
      // 09e: dadd
      // 09f: aload 1
      // 0a0: getfield onPlayerUpdate.uwn D
      // 0a3: aload 2
      // 0a4: getfield onPlayerUpdate.na1 D
      // 0a7: dmul
      // 0a8: dadd
      // 0a9: putfield onPlayerUpdate.j_n D
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield onPlayerUpdate.jf3 D
      // 0b1: aload 2
      // 0b2: getfield onPlayerUpdate.ye8 D
      // 0b5: dmul
      // 0b6: aload 1
      // 0b7: getfield onPlayerUpdate.o1a D
      // 0ba: aload 2
      // 0bb: getfield onPlayerUpdate.h_8 D
      // 0be: dmul
      // 0bf: dadd
      // 0c0: aload 1
      // 0c1: getfield onPlayerUpdate.j_n D
      // 0c4: aload 2
      // 0c5: getfield onPlayerUpdate.twh D
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: aload 1
      // 0cb: getfield onPlayerUpdate.uwn D
      // 0ce: aload 2
      // 0cf: getfield onPlayerUpdate.f36 D
      // 0d2: dmul
      // 0d3: dadd
      // 0d4: putfield onPlayerUpdate.uwn D
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield onPlayerUpdate.sgz D
      // 0dc: aload 2
      // 0dd: getfield onPlayerUpdate.jf3 D
      // 0e0: dmul
      // 0e1: aload 1
      // 0e2: getfield onPlayerUpdate._6_ D
      // 0e5: aload 2
      // 0e6: getfield onPlayerUpdate.o1a D
      // 0e9: dmul
      // 0ea: dadd
      // 0eb: aload 1
      // 0ec: getfield onPlayerUpdate.m10 D
      // 0ef: aload 2
      // 0f0: getfield onPlayerUpdate.j_n D
      // 0f3: dmul
      // 0f4: dadd
      // 0f5: aload 1
      // 0f6: getfield onPlayerUpdate.g_y D
      // 0f9: aload 2
      // 0fa: getfield onPlayerUpdate.uwn D
      // 0fd: dmul
      // 0fe: dadd
      // 0ff: putfield onPlayerUpdate.sgz D
      // 102: aload 0
      // 103: aload 1
      // 104: getfield onPlayerUpdate.sgz D
      // 107: aload 2
      // 108: getfield onPlayerUpdate.sgz D
      // 10b: dmul
      // 10c: aload 1
      // 10d: getfield onPlayerUpdate._6_ D
      // 110: aload 2
      // 111: getfield onPlayerUpdate._6_ D
      // 114: dmul
      // 115: dadd
      // 116: aload 1
      // 117: getfield onPlayerUpdate.m10 D
      // 11a: aload 2
      // 11b: getfield onPlayerUpdate.m10 D
      // 11e: dmul
      // 11f: dadd
      // 120: aload 1
      // 121: getfield onPlayerUpdate.g_y D
      // 124: aload 2
      // 125: getfield onPlayerUpdate.g_y D
      // 128: dmul
      // 129: dadd
      // 12a: putfield onPlayerUpdate._6_ D
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield onPlayerUpdate.sgz D
      // 132: aload 2
      // 133: getfield onPlayerUpdate.ji8 D
      // 136: dmul
      // 137: aload 1
      // 138: getfield onPlayerUpdate._6_ D
      // 13b: aload 2
      // 13c: getfield onPlayerUpdate.nqj D
      // 13f: dmul
      // 140: dadd
      // 141: aload 1
      // 142: getfield onPlayerUpdate.m10 D
      // 145: aload 2
      // 146: getfield onPlayerUpdate.o_8 D
      // 149: dmul
      // 14a: dadd
      // 14b: aload 1
      // 14c: getfield onPlayerUpdate.g_y D
      // 14f: aload 2
      // 150: getfield onPlayerUpdate.na1 D
      // 153: dmul
      // 154: dadd
      // 155: putfield onPlayerUpdate.m10 D
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield onPlayerUpdate.sgz D
      // 15d: aload 2
      // 15e: getfield onPlayerUpdate.ye8 D
      // 161: dmul
      // 162: aload 1
      // 163: getfield onPlayerUpdate._6_ D
      // 166: aload 2
      // 167: getfield onPlayerUpdate.h_8 D
      // 16a: dmul
      // 16b: dadd
      // 16c: aload 1
      // 16d: getfield onPlayerUpdate.m10 D
      // 170: aload 2
      // 171: getfield onPlayerUpdate.twh D
      // 174: dmul
      // 175: dadd
      // 176: aload 1
      // 177: getfield onPlayerUpdate.g_y D
      // 17a: aload 2
      // 17b: getfield onPlayerUpdate.f36 D
      // 17e: dmul
      // 17f: dadd
      // 180: putfield onPlayerUpdate.g_y D
      // 183: aload 0
      // 184: aload 1
      // 185: getfield onPlayerUpdate.ji8 D
      // 188: aload 2
      // 189: getfield onPlayerUpdate.jf3 D
      // 18c: dmul
      // 18d: aload 1
      // 18e: getfield onPlayerUpdate.nqj D
      // 191: aload 2
      // 192: getfield onPlayerUpdate.o1a D
      // 195: dmul
      // 196: dadd
      // 197: aload 1
      // 198: getfield onPlayerUpdate.o_8 D
      // 19b: aload 2
      // 19c: getfield onPlayerUpdate.j_n D
      // 19f: dmul
      // 1a0: dadd
      // 1a1: aload 1
      // 1a2: getfield onPlayerUpdate.na1 D
      // 1a5: aload 2
      // 1a6: getfield onPlayerUpdate.uwn D
      // 1a9: dmul
      // 1aa: dadd
      // 1ab: putfield onPlayerUpdate.ji8 D
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield onPlayerUpdate.ji8 D
      // 1b3: aload 2
      // 1b4: getfield onPlayerUpdate.sgz D
      // 1b7: dmul
      // 1b8: aload 1
      // 1b9: getfield onPlayerUpdate.nqj D
      // 1bc: aload 2
      // 1bd: getfield onPlayerUpdate._6_ D
      // 1c0: dmul
      // 1c1: dadd
      // 1c2: aload 1
      // 1c3: getfield onPlayerUpdate.o_8 D
      // 1c6: aload 2
      // 1c7: getfield onPlayerUpdate.m10 D
      // 1ca: dmul
      // 1cb: dadd
      // 1cc: aload 1
      // 1cd: getfield onPlayerUpdate.na1 D
      // 1d0: aload 2
      // 1d1: getfield onPlayerUpdate.g_y D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: putfield onPlayerUpdate.nqj D
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield onPlayerUpdate.ji8 D
      // 1de: aload 2
      // 1df: getfield onPlayerUpdate.ji8 D
      // 1e2: dmul
      // 1e3: aload 1
      // 1e4: getfield onPlayerUpdate.nqj D
      // 1e7: aload 2
      // 1e8: getfield onPlayerUpdate.nqj D
      // 1eb: dmul
      // 1ec: dadd
      // 1ed: aload 1
      // 1ee: getfield onPlayerUpdate.o_8 D
      // 1f1: aload 2
      // 1f2: getfield onPlayerUpdate.o_8 D
      // 1f5: dmul
      // 1f6: dadd
      // 1f7: aload 1
      // 1f8: getfield onPlayerUpdate.na1 D
      // 1fb: aload 2
      // 1fc: getfield onPlayerUpdate.na1 D
      // 1ff: dmul
      // 200: dadd
      // 201: putfield onPlayerUpdate.o_8 D
      // 204: aload 0
      // 205: aload 1
      // 206: getfield onPlayerUpdate.ji8 D
      // 209: aload 2
      // 20a: getfield onPlayerUpdate.ye8 D
      // 20d: dmul
      // 20e: aload 1
      // 20f: getfield onPlayerUpdate.nqj D
      // 212: aload 2
      // 213: getfield onPlayerUpdate.h_8 D
      // 216: dmul
      // 217: dadd
      // 218: aload 1
      // 219: getfield onPlayerUpdate.o_8 D
      // 21c: aload 2
      // 21d: getfield onPlayerUpdate.twh D
      // 220: dmul
      // 221: dadd
      // 222: aload 1
      // 223: getfield onPlayerUpdate.na1 D
      // 226: aload 2
      // 227: getfield onPlayerUpdate.f36 D
      // 22a: dmul
      // 22b: dadd
      // 22c: putfield onPlayerUpdate.na1 D
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield onPlayerUpdate.ye8 D
      // 234: aload 2
      // 235: getfield onPlayerUpdate.jf3 D
      // 238: dmul
      // 239: aload 1
      // 23a: getfield onPlayerUpdate.h_8 D
      // 23d: aload 2
      // 23e: getfield onPlayerUpdate.o1a D
      // 241: dmul
      // 242: dadd
      // 243: aload 1
      // 244: getfield onPlayerUpdate.twh D
      // 247: aload 2
      // 248: getfield onPlayerUpdate.j_n D
      // 24b: dmul
      // 24c: dadd
      // 24d: aload 1
      // 24e: getfield onPlayerUpdate.f36 D
      // 251: aload 2
      // 252: getfield onPlayerUpdate.uwn D
      // 255: dmul
      // 256: dadd
      // 257: putfield onPlayerUpdate.ye8 D
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield onPlayerUpdate.ye8 D
      // 25f: aload 2
      // 260: getfield onPlayerUpdate.sgz D
      // 263: dmul
      // 264: aload 1
      // 265: getfield onPlayerUpdate.h_8 D
      // 268: aload 2
      // 269: getfield onPlayerUpdate._6_ D
      // 26c: dmul
      // 26d: dadd
      // 26e: aload 1
      // 26f: getfield onPlayerUpdate.twh D
      // 272: aload 2
      // 273: getfield onPlayerUpdate.m10 D
      // 276: dmul
      // 277: dadd
      // 278: aload 1
      // 279: getfield onPlayerUpdate.f36 D
      // 27c: aload 2
      // 27d: getfield onPlayerUpdate.g_y D
      // 280: dmul
      // 281: dadd
      // 282: putfield onPlayerUpdate.h_8 D
      // 285: aload 0
      // 286: aload 1
      // 287: getfield onPlayerUpdate.ye8 D
      // 28a: aload 2
      // 28b: getfield onPlayerUpdate.ji8 D
      // 28e: dmul
      // 28f: aload 1
      // 290: getfield onPlayerUpdate.h_8 D
      // 293: aload 2
      // 294: getfield onPlayerUpdate.nqj D
      // 297: dmul
      // 298: dadd
      // 299: aload 1
      // 29a: getfield onPlayerUpdate.twh D
      // 29d: aload 2
      // 29e: getfield onPlayerUpdate.o_8 D
      // 2a1: dmul
      // 2a2: dadd
      // 2a3: aload 1
      // 2a4: getfield onPlayerUpdate.f36 D
      // 2a7: aload 2
      // 2a8: getfield onPlayerUpdate.na1 D
      // 2ab: dmul
      // 2ac: dadd
      // 2ad: putfield onPlayerUpdate.twh D
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield onPlayerUpdate.ye8 D
      // 2b5: aload 2
      // 2b6: getfield onPlayerUpdate.ye8 D
      // 2b9: dmul
      // 2ba: aload 1
      // 2bb: getfield onPlayerUpdate.h_8 D
      // 2be: aload 2
      // 2bf: getfield onPlayerUpdate.h_8 D
      // 2c2: dmul
      // 2c3: dadd
      // 2c4: aload 1
      // 2c5: getfield onPlayerUpdate.twh D
      // 2c8: aload 2
      // 2c9: getfield onPlayerUpdate.twh D
      // 2cc: dmul
      // 2cd: dadd
      // 2ce: aload 1
      // 2cf: getfield onPlayerUpdate.f36 D
      // 2d2: aload 2
      // 2d3: getfield onPlayerUpdate.f36 D
      // 2d6: dmul
      // 2d7: dadd
      // 2d8: putfield onPlayerUpdate.f36 D
      // 2db: iload 3
      // 2dc: ifeq 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield onPlayerUpdate.jf3 D
      // 2f1: aload 2
      // 2f2: getfield onPlayerUpdate.jf3 D
      // 2f5: dmul
      // 2f6: aload 1
      // 2f7: getfield onPlayerUpdate.o1a D
      // 2fa: aload 2
      // 2fb: getfield onPlayerUpdate.o1a D
      // 2fe: dmul
      // 2ff: dadd
      // 300: aload 1
      // 301: getfield onPlayerUpdate.j_n D
      // 304: aload 2
      // 305: getfield onPlayerUpdate.j_n D
      // 308: dmul
      // 309: dadd
      // 30a: aload 1
      // 30b: getfield onPlayerUpdate.uwn D
      // 30e: aload 2
      // 30f: getfield onPlayerUpdate.uwn D
      // 312: dmul
      // 313: dadd
      // 314: dstore 4
      // 316: aload 1
      // 317: getfield onPlayerUpdate.jf3 D
      // 31a: aload 2
      // 31b: getfield onPlayerUpdate.sgz D
      // 31e: dmul
      // 31f: aload 1
      // 320: getfield onPlayerUpdate.o1a D
      // 323: aload 2
      // 324: getfield onPlayerUpdate._6_ D
      // 327: dmul
      // 328: dadd
      // 329: aload 1
      // 32a: getfield onPlayerUpdate.j_n D
      // 32d: aload 2
      // 32e: getfield onPlayerUpdate.m10 D
      // 331: dmul
      // 332: dadd
      // 333: aload 1
      // 334: getfield onPlayerUpdate.uwn D
      // 337: aload 2
      // 338: getfield onPlayerUpdate.g_y D
      // 33b: dmul
      // 33c: dadd
      // 33d: dstore 6
      // 33f: aload 1
      // 340: getfield onPlayerUpdate.jf3 D
      // 343: aload 2
      // 344: getfield onPlayerUpdate.ji8 D
      // 347: dmul
      // 348: aload 1
      // 349: getfield onPlayerUpdate.o1a D
      // 34c: aload 2
      // 34d: getfield onPlayerUpdate.nqj D
      // 350: dmul
      // 351: dadd
      // 352: aload 1
      // 353: getfield onPlayerUpdate.j_n D
      // 356: aload 2
      // 357: getfield onPlayerUpdate.o_8 D
      // 35a: dmul
      // 35b: dadd
      // 35c: aload 1
      // 35d: getfield onPlayerUpdate.uwn D
      // 360: aload 2
      // 361: getfield onPlayerUpdate.na1 D
      // 364: dmul
      // 365: dadd
      // 366: dstore 8
      // 368: aload 1
      // 369: getfield onPlayerUpdate.jf3 D
      // 36c: aload 2
      // 36d: getfield onPlayerUpdate.ye8 D
      // 370: dmul
      // 371: aload 1
      // 372: getfield onPlayerUpdate.o1a D
      // 375: aload 2
      // 376: getfield onPlayerUpdate.h_8 D
      // 379: dmul
      // 37a: dadd
      // 37b: aload 1
      // 37c: getfield onPlayerUpdate.j_n D
      // 37f: aload 2
      // 380: getfield onPlayerUpdate.twh D
      // 383: dmul
      // 384: dadd
      // 385: aload 1
      // 386: getfield onPlayerUpdate.uwn D
      // 389: aload 2
      // 38a: getfield onPlayerUpdate.f36 D
      // 38d: dmul
      // 38e: dadd
      // 38f: dstore 10
      // 391: aload 1
      // 392: getfield onPlayerUpdate.sgz D
      // 395: aload 2
      // 396: getfield onPlayerUpdate.jf3 D
      // 399: dmul
      // 39a: aload 1
      // 39b: getfield onPlayerUpdate._6_ D
      // 39e: aload 2
      // 39f: getfield onPlayerUpdate.o1a D
      // 3a2: dmul
      // 3a3: dadd
      // 3a4: aload 1
      // 3a5: getfield onPlayerUpdate.m10 D
      // 3a8: aload 2
      // 3a9: getfield onPlayerUpdate.j_n D
      // 3ac: dmul
      // 3ad: dadd
      // 3ae: aload 1
      // 3af: getfield onPlayerUpdate.g_y D
      // 3b2: aload 2
      // 3b3: getfield onPlayerUpdate.uwn D
      // 3b6: dmul
      // 3b7: dadd
      // 3b8: dstore 12
      // 3ba: aload 1
      // 3bb: getfield onPlayerUpdate.sgz D
      // 3be: aload 2
      // 3bf: getfield onPlayerUpdate.sgz D
      // 3c2: dmul
      // 3c3: aload 1
      // 3c4: getfield onPlayerUpdate._6_ D
      // 3c7: aload 2
      // 3c8: getfield onPlayerUpdate._6_ D
      // 3cb: dmul
      // 3cc: dadd
      // 3cd: aload 1
      // 3ce: getfield onPlayerUpdate.m10 D
      // 3d1: aload 2
      // 3d2: getfield onPlayerUpdate.m10 D
      // 3d5: dmul
      // 3d6: dadd
      // 3d7: aload 1
      // 3d8: getfield onPlayerUpdate.g_y D
      // 3db: aload 2
      // 3dc: getfield onPlayerUpdate.g_y D
      // 3df: dmul
      // 3e0: dadd
      // 3e1: dstore 14
      // 3e3: aload 1
      // 3e4: getfield onPlayerUpdate.sgz D
      // 3e7: aload 2
      // 3e8: getfield onPlayerUpdate.ji8 D
      // 3eb: dmul
      // 3ec: aload 1
      // 3ed: getfield onPlayerUpdate._6_ D
      // 3f0: aload 2
      // 3f1: getfield onPlayerUpdate.nqj D
      // 3f4: dmul
      // 3f5: dadd
      // 3f6: aload 1
      // 3f7: getfield onPlayerUpdate.m10 D
      // 3fa: aload 2
      // 3fb: getfield onPlayerUpdate.o_8 D
      // 3fe: dmul
      // 3ff: dadd
      // 400: aload 1
      // 401: getfield onPlayerUpdate.g_y D
      // 404: aload 2
      // 405: getfield onPlayerUpdate.na1 D
      // 408: dmul
      // 409: dadd
      // 40a: dstore 16
      // 40c: aload 1
      // 40d: getfield onPlayerUpdate.sgz D
      // 410: aload 2
      // 411: getfield onPlayerUpdate.ye8 D
      // 414: dmul
      // 415: aload 1
      // 416: getfield onPlayerUpdate._6_ D
      // 419: aload 2
      // 41a: getfield onPlayerUpdate.h_8 D
      // 41d: dmul
      // 41e: dadd
      // 41f: aload 1
      // 420: getfield onPlayerUpdate.m10 D
      // 423: aload 2
      // 424: getfield onPlayerUpdate.twh D
      // 427: dmul
      // 428: dadd
      // 429: aload 1
      // 42a: getfield onPlayerUpdate.g_y D
      // 42d: aload 2
      // 42e: getfield onPlayerUpdate.f36 D
      // 431: dmul
      // 432: dadd
      // 433: dstore 18
      // 435: aload 1
      // 436: getfield onPlayerUpdate.ji8 D
      // 439: aload 2
      // 43a: getfield onPlayerUpdate.jf3 D
      // 43d: dmul
      // 43e: aload 1
      // 43f: getfield onPlayerUpdate.nqj D
      // 442: aload 2
      // 443: getfield onPlayerUpdate.o1a D
      // 446: dmul
      // 447: dadd
      // 448: aload 1
      // 449: getfield onPlayerUpdate.o_8 D
      // 44c: aload 2
      // 44d: getfield onPlayerUpdate.j_n D
      // 450: dmul
      // 451: dadd
      // 452: aload 1
      // 453: getfield onPlayerUpdate.na1 D
      // 456: aload 2
      // 457: getfield onPlayerUpdate.uwn D
      // 45a: dmul
      // 45b: dadd
      // 45c: dstore 20
      // 45e: aload 1
      // 45f: getfield onPlayerUpdate.ji8 D
      // 462: aload 2
      // 463: getfield onPlayerUpdate.sgz D
      // 466: dmul
      // 467: aload 1
      // 468: getfield onPlayerUpdate.nqj D
      // 46b: aload 2
      // 46c: getfield onPlayerUpdate._6_ D
      // 46f: dmul
      // 470: dadd
      // 471: aload 1
      // 472: getfield onPlayerUpdate.o_8 D
      // 475: aload 2
      // 476: getfield onPlayerUpdate.m10 D
      // 479: dmul
      // 47a: dadd
      // 47b: aload 1
      // 47c: getfield onPlayerUpdate.na1 D
      // 47f: aload 2
      // 480: getfield onPlayerUpdate.g_y D
      // 483: dmul
      // 484: dadd
      // 485: dstore 22
      // 487: aload 1
      // 488: getfield onPlayerUpdate.ji8 D
      // 48b: aload 2
      // 48c: getfield onPlayerUpdate.ji8 D
      // 48f: dmul
      // 490: aload 1
      // 491: getfield onPlayerUpdate.nqj D
      // 494: aload 2
      // 495: getfield onPlayerUpdate.nqj D
      // 498: dmul
      // 499: dadd
      // 49a: aload 1
      // 49b: getfield onPlayerUpdate.o_8 D
      // 49e: aload 2
      // 49f: getfield onPlayerUpdate.o_8 D
      // 4a2: dmul
      // 4a3: dadd
      // 4a4: aload 1
      // 4a5: getfield onPlayerUpdate.na1 D
      // 4a8: aload 2
      // 4a9: getfield onPlayerUpdate.na1 D
      // 4ac: dmul
      // 4ad: dadd
      // 4ae: dstore 24
      // 4b0: aload 1
      // 4b1: getfield onPlayerUpdate.ji8 D
      // 4b4: aload 2
      // 4b5: getfield onPlayerUpdate.ye8 D
      // 4b8: dmul
      // 4b9: aload 1
      // 4ba: getfield onPlayerUpdate.nqj D
      // 4bd: aload 2
      // 4be: getfield onPlayerUpdate.h_8 D
      // 4c1: dmul
      // 4c2: dadd
      // 4c3: aload 1
      // 4c4: getfield onPlayerUpdate.o_8 D
      // 4c7: aload 2
      // 4c8: getfield onPlayerUpdate.twh D
      // 4cb: dmul
      // 4cc: dadd
      // 4cd: aload 1
      // 4ce: getfield onPlayerUpdate.na1 D
      // 4d1: aload 2
      // 4d2: getfield onPlayerUpdate.f36 D
      // 4d5: dmul
      // 4d6: dadd
      // 4d7: dstore 26
      // 4d9: aload 1
      // 4da: getfield onPlayerUpdate.ye8 D
      // 4dd: aload 2
      // 4de: getfield onPlayerUpdate.jf3 D
      // 4e1: dmul
      // 4e2: aload 1
      // 4e3: getfield onPlayerUpdate.h_8 D
      // 4e6: aload 2
      // 4e7: getfield onPlayerUpdate.o1a D
      // 4ea: dmul
      // 4eb: dadd
      // 4ec: aload 1
      // 4ed: getfield onPlayerUpdate.twh D
      // 4f0: aload 2
      // 4f1: getfield onPlayerUpdate.j_n D
      // 4f4: dmul
      // 4f5: dadd
      // 4f6: aload 1
      // 4f7: getfield onPlayerUpdate.f36 D
      // 4fa: aload 2
      // 4fb: getfield onPlayerUpdate.uwn D
      // 4fe: dmul
      // 4ff: dadd
      // 500: dstore 28
      // 502: aload 1
      // 503: getfield onPlayerUpdate.ye8 D
      // 506: aload 2
      // 507: getfield onPlayerUpdate.sgz D
      // 50a: dmul
      // 50b: aload 1
      // 50c: getfield onPlayerUpdate.h_8 D
      // 50f: aload 2
      // 510: getfield onPlayerUpdate._6_ D
      // 513: dmul
      // 514: dadd
      // 515: aload 1
      // 516: getfield onPlayerUpdate.twh D
      // 519: aload 2
      // 51a: getfield onPlayerUpdate.m10 D
      // 51d: dmul
      // 51e: dadd
      // 51f: aload 1
      // 520: getfield onPlayerUpdate.f36 D
      // 523: aload 2
      // 524: getfield onPlayerUpdate.g_y D
      // 527: dmul
      // 528: dadd
      // 529: dstore 30
      // 52b: aload 1
      // 52c: getfield onPlayerUpdate.ye8 D
      // 52f: aload 2
      // 530: getfield onPlayerUpdate.ji8 D
      // 533: dmul
      // 534: aload 1
      // 535: getfield onPlayerUpdate.h_8 D
      // 538: aload 2
      // 539: getfield onPlayerUpdate.nqj D
      // 53c: dmul
      // 53d: dadd
      // 53e: aload 1
      // 53f: getfield onPlayerUpdate.twh D
      // 542: aload 2
      // 543: getfield onPlayerUpdate.o_8 D
      // 546: dmul
      // 547: dadd
      // 548: aload 1
      // 549: getfield onPlayerUpdate.f36 D
      // 54c: aload 2
      // 54d: getfield onPlayerUpdate.na1 D
      // 550: dmul
      // 551: dadd
      // 552: dstore 32
      // 554: aload 1
      // 555: getfield onPlayerUpdate.ye8 D
      // 558: aload 2
      // 559: getfield onPlayerUpdate.ye8 D
      // 55c: dmul
      // 55d: aload 1
      // 55e: getfield onPlayerUpdate.h_8 D
      // 561: aload 2
      // 562: getfield onPlayerUpdate.h_8 D
      // 565: dmul
      // 566: dadd
      // 567: aload 1
      // 568: getfield onPlayerUpdate.twh D
      // 56b: aload 2
      // 56c: getfield onPlayerUpdate.twh D
      // 56f: dmul
      // 570: dadd
      // 571: aload 1
      // 572: getfield onPlayerUpdate.f36 D
      // 575: aload 2
      // 576: getfield onPlayerUpdate.f36 D
      // 579: dmul
      // 57a: dadd
      // 57b: dstore 34
      // 57d: aload 0
      // 57e: dload 4
      // 580: putfield onPlayerUpdate.jf3 D
      // 583: aload 0
      // 584: dload 6
      // 586: putfield onPlayerUpdate.o1a D
      // 589: aload 0
      // 58a: dload 8
      // 58c: putfield onPlayerUpdate.j_n D
      // 58f: aload 0
      // 590: dload 10
      // 592: putfield onPlayerUpdate.uwn D
      // 595: aload 0
      // 596: dload 12
      // 598: putfield onPlayerUpdate.sgz D
      // 59b: aload 0
      // 59c: dload 14
      // 59e: putfield onPlayerUpdate._6_ D
      // 5a1: aload 0
      // 5a2: dload 16
      // 5a4: putfield onPlayerUpdate.m10 D
      // 5a7: aload 0
      // 5a8: dload 18
      // 5aa: putfield onPlayerUpdate.g_y D
      // 5ad: aload 0
      // 5ae: dload 20
      // 5b0: putfield onPlayerUpdate.ji8 D
      // 5b3: aload 0
      // 5b4: dload 22
      // 5b6: putfield onPlayerUpdate.nqj D
      // 5b9: aload 0
      // 5ba: dload 24
      // 5bc: putfield onPlayerUpdate.o_8 D
      // 5bf: aload 0
      // 5c0: dload 26
      // 5c2: putfield onPlayerUpdate.na1 D
      // 5c5: aload 0
      // 5c6: dload 28
      // 5c8: putfield onPlayerUpdate.ye8 D
      // 5cb: aload 0
      // 5cc: dload 30
      // 5ce: putfield onPlayerUpdate.h_8 D
      // 5d1: aload 0
      // 5d2: dload 32
      // 5d4: putfield onPlayerUpdate.twh D
      // 5d7: aload 0
      // 5d8: dload 34
      // 5da: putfield onPlayerUpdate.f36 D
      // 5dd: return
   }

   public final void y_b(onPlayerUpdate param1, onPlayerUpdate param2) {
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
      // 010: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 0
      // 015: iload 3
      // 016: ifeq 2ee
      // 019: goto 020
      // 01c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 2
      // 021: if_acmpeq 2e6
      // 024: goto 02b
      // 027: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: getfield onPlayerUpdate.jf3 D
      // 030: aload 2
      // 031: getfield onPlayerUpdate.jf3 D
      // 034: dmul
      // 035: aload 1
      // 036: getfield onPlayerUpdate.sgz D
      // 039: aload 2
      // 03a: getfield onPlayerUpdate.sgz D
      // 03d: dmul
      // 03e: dadd
      // 03f: aload 1
      // 040: getfield onPlayerUpdate.ji8 D
      // 043: aload 2
      // 044: getfield onPlayerUpdate.ji8 D
      // 047: dmul
      // 048: dadd
      // 049: aload 1
      // 04a: getfield onPlayerUpdate.ye8 D
      // 04d: aload 2
      // 04e: getfield onPlayerUpdate.ye8 D
      // 051: dmul
      // 052: dadd
      // 053: putfield onPlayerUpdate.jf3 D
      // 056: aload 0
      // 057: aload 1
      // 058: getfield onPlayerUpdate.jf3 D
      // 05b: aload 2
      // 05c: getfield onPlayerUpdate.o1a D
      // 05f: dmul
      // 060: aload 1
      // 061: getfield onPlayerUpdate.sgz D
      // 064: aload 2
      // 065: getfield onPlayerUpdate._6_ D
      // 068: dmul
      // 069: dadd
      // 06a: aload 1
      // 06b: getfield onPlayerUpdate.ji8 D
      // 06e: aload 2
      // 06f: getfield onPlayerUpdate.nqj D
      // 072: dmul
      // 073: dadd
      // 074: aload 1
      // 075: getfield onPlayerUpdate.ye8 D
      // 078: aload 2
      // 079: getfield onPlayerUpdate.h_8 D
      // 07c: dmul
      // 07d: dadd
      // 07e: putfield onPlayerUpdate.o1a D
      // 081: aload 0
      // 082: aload 1
      // 083: getfield onPlayerUpdate.jf3 D
      // 086: aload 2
      // 087: getfield onPlayerUpdate.j_n D
      // 08a: dmul
      // 08b: aload 1
      // 08c: getfield onPlayerUpdate.sgz D
      // 08f: aload 2
      // 090: getfield onPlayerUpdate.m10 D
      // 093: dmul
      // 094: dadd
      // 095: aload 1
      // 096: getfield onPlayerUpdate.ji8 D
      // 099: aload 2
      // 09a: getfield onPlayerUpdate.o_8 D
      // 09d: dmul
      // 09e: dadd
      // 09f: aload 1
      // 0a0: getfield onPlayerUpdate.ye8 D
      // 0a3: aload 2
      // 0a4: getfield onPlayerUpdate.twh D
      // 0a7: dmul
      // 0a8: dadd
      // 0a9: putfield onPlayerUpdate.j_n D
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: getfield onPlayerUpdate.jf3 D
      // 0b1: aload 2
      // 0b2: getfield onPlayerUpdate.uwn D
      // 0b5: dmul
      // 0b6: aload 1
      // 0b7: getfield onPlayerUpdate.sgz D
      // 0ba: aload 2
      // 0bb: getfield onPlayerUpdate.g_y D
      // 0be: dmul
      // 0bf: dadd
      // 0c0: aload 1
      // 0c1: getfield onPlayerUpdate.ji8 D
      // 0c4: aload 2
      // 0c5: getfield onPlayerUpdate.na1 D
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: aload 1
      // 0cb: getfield onPlayerUpdate.ye8 D
      // 0ce: aload 2
      // 0cf: getfield onPlayerUpdate.f36 D
      // 0d2: dmul
      // 0d3: dadd
      // 0d4: putfield onPlayerUpdate.uwn D
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: getfield onPlayerUpdate.o1a D
      // 0dc: aload 2
      // 0dd: getfield onPlayerUpdate.jf3 D
      // 0e0: dmul
      // 0e1: aload 1
      // 0e2: getfield onPlayerUpdate._6_ D
      // 0e5: aload 2
      // 0e6: getfield onPlayerUpdate.sgz D
      // 0e9: dmul
      // 0ea: dadd
      // 0eb: aload 1
      // 0ec: getfield onPlayerUpdate.nqj D
      // 0ef: aload 2
      // 0f0: getfield onPlayerUpdate.ji8 D
      // 0f3: dmul
      // 0f4: dadd
      // 0f5: aload 1
      // 0f6: getfield onPlayerUpdate.h_8 D
      // 0f9: aload 2
      // 0fa: getfield onPlayerUpdate.ye8 D
      // 0fd: dmul
      // 0fe: dadd
      // 0ff: putfield onPlayerUpdate.sgz D
      // 102: aload 0
      // 103: aload 1
      // 104: getfield onPlayerUpdate.o1a D
      // 107: aload 2
      // 108: getfield onPlayerUpdate.o1a D
      // 10b: dmul
      // 10c: aload 1
      // 10d: getfield onPlayerUpdate._6_ D
      // 110: aload 2
      // 111: getfield onPlayerUpdate._6_ D
      // 114: dmul
      // 115: dadd
      // 116: aload 1
      // 117: getfield onPlayerUpdate.nqj D
      // 11a: aload 2
      // 11b: getfield onPlayerUpdate.nqj D
      // 11e: dmul
      // 11f: dadd
      // 120: aload 1
      // 121: getfield onPlayerUpdate.h_8 D
      // 124: aload 2
      // 125: getfield onPlayerUpdate.h_8 D
      // 128: dmul
      // 129: dadd
      // 12a: putfield onPlayerUpdate._6_ D
      // 12d: aload 0
      // 12e: aload 1
      // 12f: getfield onPlayerUpdate.o1a D
      // 132: aload 2
      // 133: getfield onPlayerUpdate.j_n D
      // 136: dmul
      // 137: aload 1
      // 138: getfield onPlayerUpdate._6_ D
      // 13b: aload 2
      // 13c: getfield onPlayerUpdate.m10 D
      // 13f: dmul
      // 140: dadd
      // 141: aload 1
      // 142: getfield onPlayerUpdate.nqj D
      // 145: aload 2
      // 146: getfield onPlayerUpdate.o_8 D
      // 149: dmul
      // 14a: dadd
      // 14b: aload 1
      // 14c: getfield onPlayerUpdate.h_8 D
      // 14f: aload 2
      // 150: getfield onPlayerUpdate.twh D
      // 153: dmul
      // 154: dadd
      // 155: putfield onPlayerUpdate.m10 D
      // 158: aload 0
      // 159: aload 1
      // 15a: getfield onPlayerUpdate.o1a D
      // 15d: aload 2
      // 15e: getfield onPlayerUpdate.uwn D
      // 161: dmul
      // 162: aload 1
      // 163: getfield onPlayerUpdate._6_ D
      // 166: aload 2
      // 167: getfield onPlayerUpdate.g_y D
      // 16a: dmul
      // 16b: dadd
      // 16c: aload 1
      // 16d: getfield onPlayerUpdate.nqj D
      // 170: aload 2
      // 171: getfield onPlayerUpdate.na1 D
      // 174: dmul
      // 175: dadd
      // 176: aload 1
      // 177: getfield onPlayerUpdate.h_8 D
      // 17a: aload 2
      // 17b: getfield onPlayerUpdate.f36 D
      // 17e: dmul
      // 17f: dadd
      // 180: putfield onPlayerUpdate.g_y D
      // 183: aload 0
      // 184: aload 1
      // 185: getfield onPlayerUpdate.j_n D
      // 188: aload 2
      // 189: getfield onPlayerUpdate.jf3 D
      // 18c: dmul
      // 18d: aload 1
      // 18e: getfield onPlayerUpdate.m10 D
      // 191: aload 2
      // 192: getfield onPlayerUpdate.sgz D
      // 195: dmul
      // 196: dadd
      // 197: aload 1
      // 198: getfield onPlayerUpdate.o_8 D
      // 19b: aload 2
      // 19c: getfield onPlayerUpdate.ji8 D
      // 19f: dmul
      // 1a0: dadd
      // 1a1: aload 1
      // 1a2: getfield onPlayerUpdate.twh D
      // 1a5: aload 2
      // 1a6: getfield onPlayerUpdate.ye8 D
      // 1a9: dmul
      // 1aa: dadd
      // 1ab: putfield onPlayerUpdate.ji8 D
      // 1ae: aload 0
      // 1af: aload 1
      // 1b0: getfield onPlayerUpdate.j_n D
      // 1b3: aload 2
      // 1b4: getfield onPlayerUpdate.o1a D
      // 1b7: dmul
      // 1b8: aload 1
      // 1b9: getfield onPlayerUpdate.m10 D
      // 1bc: aload 2
      // 1bd: getfield onPlayerUpdate._6_ D
      // 1c0: dmul
      // 1c1: dadd
      // 1c2: aload 1
      // 1c3: getfield onPlayerUpdate.o_8 D
      // 1c6: aload 2
      // 1c7: getfield onPlayerUpdate.nqj D
      // 1ca: dmul
      // 1cb: dadd
      // 1cc: aload 1
      // 1cd: getfield onPlayerUpdate.twh D
      // 1d0: aload 2
      // 1d1: getfield onPlayerUpdate.h_8 D
      // 1d4: dmul
      // 1d5: dadd
      // 1d6: putfield onPlayerUpdate.nqj D
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: getfield onPlayerUpdate.j_n D
      // 1de: aload 2
      // 1df: getfield onPlayerUpdate.j_n D
      // 1e2: dmul
      // 1e3: aload 1
      // 1e4: getfield onPlayerUpdate.m10 D
      // 1e7: aload 2
      // 1e8: getfield onPlayerUpdate.m10 D
      // 1eb: dmul
      // 1ec: dadd
      // 1ed: aload 1
      // 1ee: getfield onPlayerUpdate.o_8 D
      // 1f1: aload 2
      // 1f2: getfield onPlayerUpdate.o_8 D
      // 1f5: dmul
      // 1f6: dadd
      // 1f7: aload 1
      // 1f8: getfield onPlayerUpdate.twh D
      // 1fb: aload 2
      // 1fc: getfield onPlayerUpdate.twh D
      // 1ff: dmul
      // 200: dadd
      // 201: putfield onPlayerUpdate.o_8 D
      // 204: aload 0
      // 205: aload 1
      // 206: getfield onPlayerUpdate.j_n D
      // 209: aload 2
      // 20a: getfield onPlayerUpdate.uwn D
      // 20d: dmul
      // 20e: aload 1
      // 20f: getfield onPlayerUpdate.m10 D
      // 212: aload 2
      // 213: getfield onPlayerUpdate.g_y D
      // 216: dmul
      // 217: dadd
      // 218: aload 1
      // 219: getfield onPlayerUpdate.o_8 D
      // 21c: aload 2
      // 21d: getfield onPlayerUpdate.na1 D
      // 220: dmul
      // 221: dadd
      // 222: aload 1
      // 223: getfield onPlayerUpdate.twh D
      // 226: aload 2
      // 227: getfield onPlayerUpdate.f36 D
      // 22a: dmul
      // 22b: dadd
      // 22c: putfield onPlayerUpdate.na1 D
      // 22f: aload 0
      // 230: aload 1
      // 231: getfield onPlayerUpdate.uwn D
      // 234: aload 2
      // 235: getfield onPlayerUpdate.jf3 D
      // 238: dmul
      // 239: aload 1
      // 23a: getfield onPlayerUpdate.g_y D
      // 23d: aload 2
      // 23e: getfield onPlayerUpdate.sgz D
      // 241: dmul
      // 242: dadd
      // 243: aload 1
      // 244: getfield onPlayerUpdate.na1 D
      // 247: aload 2
      // 248: getfield onPlayerUpdate.ji8 D
      // 24b: dmul
      // 24c: dadd
      // 24d: aload 1
      // 24e: getfield onPlayerUpdate.f36 D
      // 251: aload 2
      // 252: getfield onPlayerUpdate.ye8 D
      // 255: dmul
      // 256: dadd
      // 257: putfield onPlayerUpdate.ye8 D
      // 25a: aload 0
      // 25b: aload 1
      // 25c: getfield onPlayerUpdate.uwn D
      // 25f: aload 2
      // 260: getfield onPlayerUpdate.o1a D
      // 263: dmul
      // 264: aload 1
      // 265: getfield onPlayerUpdate.g_y D
      // 268: aload 2
      // 269: getfield onPlayerUpdate._6_ D
      // 26c: dmul
      // 26d: dadd
      // 26e: aload 1
      // 26f: getfield onPlayerUpdate.na1 D
      // 272: aload 2
      // 273: getfield onPlayerUpdate.nqj D
      // 276: dmul
      // 277: dadd
      // 278: aload 1
      // 279: getfield onPlayerUpdate.f36 D
      // 27c: aload 2
      // 27d: getfield onPlayerUpdate.h_8 D
      // 280: dmul
      // 281: dadd
      // 282: putfield onPlayerUpdate.h_8 D
      // 285: aload 0
      // 286: aload 1
      // 287: getfield onPlayerUpdate.uwn D
      // 28a: aload 2
      // 28b: getfield onPlayerUpdate.j_n D
      // 28e: dmul
      // 28f: aload 1
      // 290: getfield onPlayerUpdate.g_y D
      // 293: aload 2
      // 294: getfield onPlayerUpdate.m10 D
      // 297: dmul
      // 298: dadd
      // 299: aload 1
      // 29a: getfield onPlayerUpdate.na1 D
      // 29d: aload 2
      // 29e: getfield onPlayerUpdate.o_8 D
      // 2a1: dmul
      // 2a2: dadd
      // 2a3: aload 1
      // 2a4: getfield onPlayerUpdate.f36 D
      // 2a7: aload 2
      // 2a8: getfield onPlayerUpdate.twh D
      // 2ab: dmul
      // 2ac: dadd
      // 2ad: putfield onPlayerUpdate.twh D
      // 2b0: aload 0
      // 2b1: aload 1
      // 2b2: getfield onPlayerUpdate.uwn D
      // 2b5: aload 2
      // 2b6: getfield onPlayerUpdate.uwn D
      // 2b9: dmul
      // 2ba: aload 1
      // 2bb: getfield onPlayerUpdate.g_y D
      // 2be: aload 2
      // 2bf: getfield onPlayerUpdate.g_y D
      // 2c2: dmul
      // 2c3: dadd
      // 2c4: aload 1
      // 2c5: getfield onPlayerUpdate.na1 D
      // 2c8: aload 2
      // 2c9: getfield onPlayerUpdate.na1 D
      // 2cc: dmul
      // 2cd: dadd
      // 2ce: aload 1
      // 2cf: getfield onPlayerUpdate.f36 D
      // 2d2: aload 2
      // 2d3: getfield onPlayerUpdate.f36 D
      // 2d6: dmul
      // 2d7: dadd
      // 2d8: putfield onPlayerUpdate.f36 D
      // 2db: iload 3
      // 2dc: ifne 5dd
      // 2df: goto 2e6
      // 2e2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: goto 2ee
      // 2ea: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ed: athrow
      // 2ee: getfield onPlayerUpdate.jf3 D
      // 2f1: aload 2
      // 2f2: getfield onPlayerUpdate.jf3 D
      // 2f5: dmul
      // 2f6: aload 1
      // 2f7: getfield onPlayerUpdate.sgz D
      // 2fa: aload 2
      // 2fb: getfield onPlayerUpdate.sgz D
      // 2fe: dmul
      // 2ff: dadd
      // 300: aload 1
      // 301: getfield onPlayerUpdate.ji8 D
      // 304: aload 2
      // 305: getfield onPlayerUpdate.ji8 D
      // 308: dmul
      // 309: dadd
      // 30a: aload 1
      // 30b: getfield onPlayerUpdate.ye8 D
      // 30e: aload 2
      // 30f: getfield onPlayerUpdate.ye8 D
      // 312: dmul
      // 313: dadd
      // 314: dstore 4
      // 316: aload 1
      // 317: getfield onPlayerUpdate.jf3 D
      // 31a: aload 2
      // 31b: getfield onPlayerUpdate.o1a D
      // 31e: dmul
      // 31f: aload 1
      // 320: getfield onPlayerUpdate.sgz D
      // 323: aload 2
      // 324: getfield onPlayerUpdate._6_ D
      // 327: dmul
      // 328: dadd
      // 329: aload 1
      // 32a: getfield onPlayerUpdate.ji8 D
      // 32d: aload 2
      // 32e: getfield onPlayerUpdate.nqj D
      // 331: dmul
      // 332: dadd
      // 333: aload 1
      // 334: getfield onPlayerUpdate.ye8 D
      // 337: aload 2
      // 338: getfield onPlayerUpdate.h_8 D
      // 33b: dmul
      // 33c: dadd
      // 33d: dstore 6
      // 33f: aload 1
      // 340: getfield onPlayerUpdate.jf3 D
      // 343: aload 2
      // 344: getfield onPlayerUpdate.j_n D
      // 347: dmul
      // 348: aload 1
      // 349: getfield onPlayerUpdate.sgz D
      // 34c: aload 2
      // 34d: getfield onPlayerUpdate.m10 D
      // 350: dmul
      // 351: dadd
      // 352: aload 1
      // 353: getfield onPlayerUpdate.ji8 D
      // 356: aload 2
      // 357: getfield onPlayerUpdate.o_8 D
      // 35a: dmul
      // 35b: dadd
      // 35c: aload 1
      // 35d: getfield onPlayerUpdate.ye8 D
      // 360: aload 2
      // 361: getfield onPlayerUpdate.twh D
      // 364: dmul
      // 365: dadd
      // 366: dstore 8
      // 368: aload 1
      // 369: getfield onPlayerUpdate.jf3 D
      // 36c: aload 2
      // 36d: getfield onPlayerUpdate.uwn D
      // 370: dmul
      // 371: aload 1
      // 372: getfield onPlayerUpdate.sgz D
      // 375: aload 2
      // 376: getfield onPlayerUpdate.g_y D
      // 379: dmul
      // 37a: dadd
      // 37b: aload 1
      // 37c: getfield onPlayerUpdate.ji8 D
      // 37f: aload 2
      // 380: getfield onPlayerUpdate.na1 D
      // 383: dmul
      // 384: dadd
      // 385: aload 1
      // 386: getfield onPlayerUpdate.ye8 D
      // 389: aload 2
      // 38a: getfield onPlayerUpdate.f36 D
      // 38d: dmul
      // 38e: dadd
      // 38f: dstore 10
      // 391: aload 1
      // 392: getfield onPlayerUpdate.o1a D
      // 395: aload 2
      // 396: getfield onPlayerUpdate.jf3 D
      // 399: dmul
      // 39a: aload 1
      // 39b: getfield onPlayerUpdate._6_ D
      // 39e: aload 2
      // 39f: getfield onPlayerUpdate.sgz D
      // 3a2: dmul
      // 3a3: dadd
      // 3a4: aload 1
      // 3a5: getfield onPlayerUpdate.nqj D
      // 3a8: aload 2
      // 3a9: getfield onPlayerUpdate.ji8 D
      // 3ac: dmul
      // 3ad: dadd
      // 3ae: aload 1
      // 3af: getfield onPlayerUpdate.h_8 D
      // 3b2: aload 2
      // 3b3: getfield onPlayerUpdate.ye8 D
      // 3b6: dmul
      // 3b7: dadd
      // 3b8: dstore 12
      // 3ba: aload 1
      // 3bb: getfield onPlayerUpdate.o1a D
      // 3be: aload 2
      // 3bf: getfield onPlayerUpdate.o1a D
      // 3c2: dmul
      // 3c3: aload 1
      // 3c4: getfield onPlayerUpdate._6_ D
      // 3c7: aload 2
      // 3c8: getfield onPlayerUpdate._6_ D
      // 3cb: dmul
      // 3cc: dadd
      // 3cd: aload 1
      // 3ce: getfield onPlayerUpdate.nqj D
      // 3d1: aload 2
      // 3d2: getfield onPlayerUpdate.nqj D
      // 3d5: dmul
      // 3d6: dadd
      // 3d7: aload 1
      // 3d8: getfield onPlayerUpdate.h_8 D
      // 3db: aload 2
      // 3dc: getfield onPlayerUpdate.h_8 D
      // 3df: dmul
      // 3e0: dadd
      // 3e1: dstore 14
      // 3e3: aload 1
      // 3e4: getfield onPlayerUpdate.o1a D
      // 3e7: aload 2
      // 3e8: getfield onPlayerUpdate.j_n D
      // 3eb: dmul
      // 3ec: aload 1
      // 3ed: getfield onPlayerUpdate._6_ D
      // 3f0: aload 2
      // 3f1: getfield onPlayerUpdate.m10 D
      // 3f4: dmul
      // 3f5: dadd
      // 3f6: aload 1
      // 3f7: getfield onPlayerUpdate.nqj D
      // 3fa: aload 2
      // 3fb: getfield onPlayerUpdate.o_8 D
      // 3fe: dmul
      // 3ff: dadd
      // 400: aload 1
      // 401: getfield onPlayerUpdate.h_8 D
      // 404: aload 2
      // 405: getfield onPlayerUpdate.twh D
      // 408: dmul
      // 409: dadd
      // 40a: dstore 16
      // 40c: aload 1
      // 40d: getfield onPlayerUpdate.o1a D
      // 410: aload 2
      // 411: getfield onPlayerUpdate.uwn D
      // 414: dmul
      // 415: aload 1
      // 416: getfield onPlayerUpdate._6_ D
      // 419: aload 2
      // 41a: getfield onPlayerUpdate.g_y D
      // 41d: dmul
      // 41e: dadd
      // 41f: aload 1
      // 420: getfield onPlayerUpdate.nqj D
      // 423: aload 2
      // 424: getfield onPlayerUpdate.na1 D
      // 427: dmul
      // 428: dadd
      // 429: aload 1
      // 42a: getfield onPlayerUpdate.h_8 D
      // 42d: aload 2
      // 42e: getfield onPlayerUpdate.f36 D
      // 431: dmul
      // 432: dadd
      // 433: dstore 18
      // 435: aload 1
      // 436: getfield onPlayerUpdate.j_n D
      // 439: aload 2
      // 43a: getfield onPlayerUpdate.jf3 D
      // 43d: dmul
      // 43e: aload 1
      // 43f: getfield onPlayerUpdate.m10 D
      // 442: aload 2
      // 443: getfield onPlayerUpdate.sgz D
      // 446: dmul
      // 447: dadd
      // 448: aload 1
      // 449: getfield onPlayerUpdate.o_8 D
      // 44c: aload 2
      // 44d: getfield onPlayerUpdate.ji8 D
      // 450: dmul
      // 451: dadd
      // 452: aload 1
      // 453: getfield onPlayerUpdate.twh D
      // 456: aload 2
      // 457: getfield onPlayerUpdate.ye8 D
      // 45a: dmul
      // 45b: dadd
      // 45c: dstore 20
      // 45e: aload 1
      // 45f: getfield onPlayerUpdate.j_n D
      // 462: aload 2
      // 463: getfield onPlayerUpdate.o1a D
      // 466: dmul
      // 467: aload 1
      // 468: getfield onPlayerUpdate.m10 D
      // 46b: aload 2
      // 46c: getfield onPlayerUpdate._6_ D
      // 46f: dmul
      // 470: dadd
      // 471: aload 1
      // 472: getfield onPlayerUpdate.o_8 D
      // 475: aload 2
      // 476: getfield onPlayerUpdate.nqj D
      // 479: dmul
      // 47a: dadd
      // 47b: aload 1
      // 47c: getfield onPlayerUpdate.twh D
      // 47f: aload 2
      // 480: getfield onPlayerUpdate.h_8 D
      // 483: dmul
      // 484: dadd
      // 485: dstore 22
      // 487: aload 1
      // 488: getfield onPlayerUpdate.j_n D
      // 48b: aload 2
      // 48c: getfield onPlayerUpdate.j_n D
      // 48f: dmul
      // 490: aload 1
      // 491: getfield onPlayerUpdate.m10 D
      // 494: aload 2
      // 495: getfield onPlayerUpdate.m10 D
      // 498: dmul
      // 499: dadd
      // 49a: aload 1
      // 49b: getfield onPlayerUpdate.o_8 D
      // 49e: aload 2
      // 49f: getfield onPlayerUpdate.o_8 D
      // 4a2: dmul
      // 4a3: dadd
      // 4a4: aload 1
      // 4a5: getfield onPlayerUpdate.twh D
      // 4a8: aload 2
      // 4a9: getfield onPlayerUpdate.twh D
      // 4ac: dmul
      // 4ad: dadd
      // 4ae: dstore 24
      // 4b0: aload 1
      // 4b1: getfield onPlayerUpdate.j_n D
      // 4b4: aload 2
      // 4b5: getfield onPlayerUpdate.uwn D
      // 4b8: dmul
      // 4b9: aload 1
      // 4ba: getfield onPlayerUpdate.m10 D
      // 4bd: aload 2
      // 4be: getfield onPlayerUpdate.g_y D
      // 4c1: dmul
      // 4c2: dadd
      // 4c3: aload 1
      // 4c4: getfield onPlayerUpdate.o_8 D
      // 4c7: aload 2
      // 4c8: getfield onPlayerUpdate.na1 D
      // 4cb: dmul
      // 4cc: dadd
      // 4cd: aload 1
      // 4ce: getfield onPlayerUpdate.twh D
      // 4d1: aload 2
      // 4d2: getfield onPlayerUpdate.f36 D
      // 4d5: dmul
      // 4d6: dadd
      // 4d7: dstore 26
      // 4d9: aload 1
      // 4da: getfield onPlayerUpdate.uwn D
      // 4dd: aload 2
      // 4de: getfield onPlayerUpdate.jf3 D
      // 4e1: dmul
      // 4e2: aload 1
      // 4e3: getfield onPlayerUpdate.g_y D
      // 4e6: aload 2
      // 4e7: getfield onPlayerUpdate.sgz D
      // 4ea: dmul
      // 4eb: dadd
      // 4ec: aload 1
      // 4ed: getfield onPlayerUpdate.na1 D
      // 4f0: aload 2
      // 4f1: getfield onPlayerUpdate.ji8 D
      // 4f4: dmul
      // 4f5: dadd
      // 4f6: aload 1
      // 4f7: getfield onPlayerUpdate.f36 D
      // 4fa: aload 2
      // 4fb: getfield onPlayerUpdate.ye8 D
      // 4fe: dmul
      // 4ff: dadd
      // 500: dstore 28
      // 502: aload 1
      // 503: getfield onPlayerUpdate.uwn D
      // 506: aload 2
      // 507: getfield onPlayerUpdate.o1a D
      // 50a: dmul
      // 50b: aload 1
      // 50c: getfield onPlayerUpdate.g_y D
      // 50f: aload 2
      // 510: getfield onPlayerUpdate._6_ D
      // 513: dmul
      // 514: dadd
      // 515: aload 1
      // 516: getfield onPlayerUpdate.na1 D
      // 519: aload 2
      // 51a: getfield onPlayerUpdate.nqj D
      // 51d: dmul
      // 51e: dadd
      // 51f: aload 1
      // 520: getfield onPlayerUpdate.f36 D
      // 523: aload 2
      // 524: getfield onPlayerUpdate.h_8 D
      // 527: dmul
      // 528: dadd
      // 529: dstore 30
      // 52b: aload 1
      // 52c: getfield onPlayerUpdate.uwn D
      // 52f: aload 2
      // 530: getfield onPlayerUpdate.j_n D
      // 533: dmul
      // 534: aload 1
      // 535: getfield onPlayerUpdate.g_y D
      // 538: aload 2
      // 539: getfield onPlayerUpdate.m10 D
      // 53c: dmul
      // 53d: dadd
      // 53e: aload 1
      // 53f: getfield onPlayerUpdate.na1 D
      // 542: aload 2
      // 543: getfield onPlayerUpdate.o_8 D
      // 546: dmul
      // 547: dadd
      // 548: aload 1
      // 549: getfield onPlayerUpdate.f36 D
      // 54c: aload 2
      // 54d: getfield onPlayerUpdate.twh D
      // 550: dmul
      // 551: dadd
      // 552: dstore 32
      // 554: aload 1
      // 555: getfield onPlayerUpdate.uwn D
      // 558: aload 2
      // 559: getfield onPlayerUpdate.uwn D
      // 55c: dmul
      // 55d: aload 1
      // 55e: getfield onPlayerUpdate.g_y D
      // 561: aload 2
      // 562: getfield onPlayerUpdate.g_y D
      // 565: dmul
      // 566: dadd
      // 567: aload 1
      // 568: getfield onPlayerUpdate.na1 D
      // 56b: aload 2
      // 56c: getfield onPlayerUpdate.na1 D
      // 56f: dmul
      // 570: dadd
      // 571: aload 1
      // 572: getfield onPlayerUpdate.f36 D
      // 575: aload 2
      // 576: getfield onPlayerUpdate.f36 D
      // 579: dmul
      // 57a: dadd
      // 57b: dstore 34
      // 57d: aload 0
      // 57e: dload 4
      // 580: putfield onPlayerUpdate.jf3 D
      // 583: aload 0
      // 584: dload 6
      // 586: putfield onPlayerUpdate.o1a D
      // 589: aload 0
      // 58a: dload 8
      // 58c: putfield onPlayerUpdate.j_n D
      // 58f: aload 0
      // 590: dload 10
      // 592: putfield onPlayerUpdate.uwn D
      // 595: aload 0
      // 596: dload 12
      // 598: putfield onPlayerUpdate.sgz D
      // 59b: aload 0
      // 59c: dload 14
      // 59e: putfield onPlayerUpdate._6_ D
      // 5a1: aload 0
      // 5a2: dload 16
      // 5a4: putfield onPlayerUpdate.m10 D
      // 5a7: aload 0
      // 5a8: dload 18
      // 5aa: putfield onPlayerUpdate.g_y D
      // 5ad: aload 0
      // 5ae: dload 20
      // 5b0: putfield onPlayerUpdate.ji8 D
      // 5b3: aload 0
      // 5b4: dload 22
      // 5b6: putfield onPlayerUpdate.nqj D
      // 5b9: aload 0
      // 5ba: dload 24
      // 5bc: putfield onPlayerUpdate.o_8 D
      // 5bf: aload 0
      // 5c0: dload 26
      // 5c2: putfield onPlayerUpdate.na1 D
      // 5c5: aload 0
      // 5c6: dload 28
      // 5c8: putfield onPlayerUpdate.ye8 D
      // 5cb: aload 0
      // 5cc: dload 30
      // 5ce: putfield onPlayerUpdate.h_8 D
      // 5d1: aload 0
      // 5d2: dload 32
      // 5d4: putfield onPlayerUpdate.twh D
      // 5d7: aload 0
      // 5d8: dload 34
      // 5da: putfield onPlayerUpdate.f36 D
      // 5dd: return
   }

   public boolean clm(onPlayerUpdate param1) {
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
      // 005: getfield onPlayerUpdate.jf3 D
      // 008: aload 1
      // 009: getfield onPlayerUpdate.jf3 D
      // 00c: dcmpl
      // 00d: iload 2
      // 00e: ifne 02b
      // 011: ifne 1e1
      // 014: goto 01b
      // 017: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01a: athrow
      // 01b: aload 0
      // 01c: getfield onPlayerUpdate.o1a D
      // 01f: aload 1
      // 020: getfield onPlayerUpdate.o1a D
      // 023: dcmpl
      // 024: goto 02b
      // 027: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02a: athrow
      // 02b: iload 2
      // 02c: ifne 049
      // 02f: ifne 1e1
      // 032: goto 039
      // 035: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield onPlayerUpdate.j_n D
      // 03d: aload 1
      // 03e: getfield onPlayerUpdate.j_n D
      // 041: dcmpl
      // 042: goto 049
      // 045: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: iload 2
      // 04a: ifne 067
      // 04d: ifne 1e1
      // 050: goto 057
      // 053: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 056: athrow
      // 057: aload 0
      // 058: getfield onPlayerUpdate.uwn D
      // 05b: aload 1
      // 05c: getfield onPlayerUpdate.uwn D
      // 05f: dcmpl
      // 060: goto 067
      // 063: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 066: athrow
      // 067: iload 2
      // 068: ifne 085
      // 06b: ifne 1e1
      // 06e: goto 075
      // 071: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 074: athrow
      // 075: aload 0
      // 076: getfield onPlayerUpdate.sgz D
      // 079: aload 1
      // 07a: getfield onPlayerUpdate.sgz D
      // 07d: dcmpl
      // 07e: goto 085
      // 081: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 084: athrow
      // 085: iload 2
      // 086: ifne 0a3
      // 089: ifne 1e1
      // 08c: goto 093
      // 08f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 092: athrow
      // 093: aload 0
      // 094: getfield onPlayerUpdate._6_ D
      // 097: aload 1
      // 098: getfield onPlayerUpdate._6_ D
      // 09b: dcmpl
      // 09c: goto 0a3
      // 09f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a2: athrow
      // 0a3: iload 2
      // 0a4: ifne 0c1
      // 0a7: ifne 1e1
      // 0aa: goto 0b1
      // 0ad: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield onPlayerUpdate.m10 D
      // 0b5: aload 1
      // 0b6: getfield onPlayerUpdate.m10 D
      // 0b9: dcmpl
      // 0ba: goto 0c1
      // 0bd: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c0: athrow
      // 0c1: iload 2
      // 0c2: ifne 0df
      // 0c5: ifne 1e1
      // 0c8: goto 0cf
      // 0cb: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield onPlayerUpdate.g_y D
      // 0d3: aload 1
      // 0d4: getfield onPlayerUpdate.g_y D
      // 0d7: dcmpl
      // 0d8: goto 0df
      // 0db: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0de: athrow
      // 0df: iload 2
      // 0e0: ifne 0fd
      // 0e3: ifne 1e1
      // 0e6: goto 0ed
      // 0e9: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield onPlayerUpdate.ji8 D
      // 0f1: aload 1
      // 0f2: getfield onPlayerUpdate.ji8 D
      // 0f5: dcmpl
      // 0f6: goto 0fd
      // 0f9: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fc: athrow
      // 0fd: iload 2
      // 0fe: ifne 11b
      // 101: ifne 1e1
      // 104: goto 10b
      // 107: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield onPlayerUpdate.nqj D
      // 10f: aload 1
      // 110: getfield onPlayerUpdate.nqj D
      // 113: dcmpl
      // 114: goto 11b
      // 117: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11a: athrow
      // 11b: iload 2
      // 11c: ifne 139
      // 11f: ifne 1e1
      // 122: goto 129
      // 125: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield onPlayerUpdate.o_8 D
      // 12d: aload 1
      // 12e: getfield onPlayerUpdate.o_8 D
      // 131: dcmpl
      // 132: goto 139
      // 135: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 138: athrow
      // 139: iload 2
      // 13a: ifne 157
      // 13d: ifne 1e1
      // 140: goto 147
      // 143: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 146: athrow
      // 147: aload 0
      // 148: getfield onPlayerUpdate.na1 D
      // 14b: aload 1
      // 14c: getfield onPlayerUpdate.na1 D
      // 14f: dcmpl
      // 150: goto 157
      // 153: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 156: athrow
      // 157: iload 2
      // 158: ifne 175
      // 15b: ifne 1e1
      // 15e: goto 165
      // 161: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 164: athrow
      // 165: aload 0
      // 166: getfield onPlayerUpdate.ye8 D
      // 169: aload 1
      // 16a: getfield onPlayerUpdate.ye8 D
      // 16d: dcmpl
      // 16e: goto 175
      // 171: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 174: athrow
      // 175: iload 2
      // 176: ifne 193
      // 179: ifne 1e1
      // 17c: goto 183
      // 17f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 182: athrow
      // 183: aload 0
      // 184: getfield onPlayerUpdate.h_8 D
      // 187: aload 1
      // 188: getfield onPlayerUpdate.h_8 D
      // 18b: dcmpl
      // 18c: goto 193
      // 18f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 192: athrow
      // 193: iload 2
      // 194: ifne 1b1
      // 197: ifne 1e1
      // 19a: goto 1a1
      // 19d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: getfield onPlayerUpdate.twh D
      // 1a5: aload 1
      // 1a6: getfield onPlayerUpdate.twh D
      // 1a9: dcmpl
      // 1aa: goto 1b1
      // 1ad: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b0: athrow
      // 1b1: iload 2
      // 1b2: ifne 1cf
      // 1b5: ifne 1e1
      // 1b8: goto 1bf
      // 1bb: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield onPlayerUpdate.f36 D
      // 1c3: aload 1
      // 1c4: getfield onPlayerUpdate.f36 D
      // 1c7: dcmpl
      // 1c8: goto 1cf
      // 1cb: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ce: athrow
      // 1cf: iload 2
      // 1d0: ifne 1de
      // 1d3: ifne 1e1
      // 1d6: goto 1dd
      // 1d9: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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
      // 005: checkcast onPlayerUpdate
      // 008: astore 3
      // 009: aload 0
      // 00a: getfield onPlayerUpdate.jf3 D
      // 00d: aload 3
      // 00e: getfield onPlayerUpdate.jf3 D
      // 011: dcmpl
      // 012: iload 2
      // 013: ifne 030
      // 016: ifne 1e6
      // 019: goto 020
      // 01c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield onPlayerUpdate.o1a D
      // 024: aload 3
      // 025: getfield onPlayerUpdate.o1a D
      // 028: dcmpl
      // 029: goto 030
      // 02c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02f: athrow
      // 030: iload 2
      // 031: ifne 04e
      // 034: ifne 1e6
      // 037: goto 03e
      // 03a: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03d: athrow
      // 03e: aload 0
      // 03f: getfield onPlayerUpdate.j_n D
      // 042: aload 3
      // 043: getfield onPlayerUpdate.j_n D
      // 046: dcmpl
      // 047: goto 04e
      // 04a: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04d: athrow
      // 04e: iload 2
      // 04f: ifne 06c
      // 052: ifne 1e6
      // 055: goto 05c
      // 058: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05b: athrow
      // 05c: aload 0
      // 05d: getfield onPlayerUpdate.uwn D
      // 060: aload 3
      // 061: getfield onPlayerUpdate.uwn D
      // 064: dcmpl
      // 065: goto 06c
      // 068: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06b: athrow
      // 06c: iload 2
      // 06d: ifne 08a
      // 070: ifne 1e6
      // 073: goto 07a
      // 076: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield onPlayerUpdate.sgz D
      // 07e: aload 3
      // 07f: getfield onPlayerUpdate.sgz D
      // 082: dcmpl
      // 083: goto 08a
      // 086: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 089: athrow
      // 08a: iload 2
      // 08b: ifne 0a8
      // 08e: ifne 1e6
      // 091: goto 098
      // 094: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: aload 0
      // 099: getfield onPlayerUpdate._6_ D
      // 09c: aload 3
      // 09d: getfield onPlayerUpdate._6_ D
      // 0a0: dcmpl
      // 0a1: goto 0a8
      // 0a4: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a7: athrow
      // 0a8: iload 2
      // 0a9: ifne 0c6
      // 0ac: ifne 1e6
      // 0af: goto 0b6
      // 0b2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield onPlayerUpdate.m10 D
      // 0ba: aload 3
      // 0bb: getfield onPlayerUpdate.m10 D
      // 0be: dcmpl
      // 0bf: goto 0c6
      // 0c2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c5: athrow
      // 0c6: iload 2
      // 0c7: ifne 0e4
      // 0ca: ifne 1e6
      // 0cd: goto 0d4
      // 0d0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield onPlayerUpdate.g_y D
      // 0d8: aload 3
      // 0d9: getfield onPlayerUpdate.g_y D
      // 0dc: dcmpl
      // 0dd: goto 0e4
      // 0e0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e3: athrow
      // 0e4: iload 2
      // 0e5: ifne 102
      // 0e8: ifne 1e6
      // 0eb: goto 0f2
      // 0ee: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield onPlayerUpdate.ji8 D
      // 0f6: aload 3
      // 0f7: getfield onPlayerUpdate.ji8 D
      // 0fa: dcmpl
      // 0fb: goto 102
      // 0fe: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: iload 2
      // 103: ifne 120
      // 106: ifne 1e6
      // 109: goto 110
      // 10c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield onPlayerUpdate.nqj D
      // 114: aload 3
      // 115: getfield onPlayerUpdate.nqj D
      // 118: dcmpl
      // 119: goto 120
      // 11c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11f: athrow
      // 120: iload 2
      // 121: ifne 13e
      // 124: ifne 1e6
      // 127: goto 12e
      // 12a: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield onPlayerUpdate.o_8 D
      // 132: aload 3
      // 133: getfield onPlayerUpdate.o_8 D
      // 136: dcmpl
      // 137: goto 13e
      // 13a: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13d: athrow
      // 13e: iload 2
      // 13f: ifne 15c
      // 142: ifne 1e6
      // 145: goto 14c
      // 148: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14b: athrow
      // 14c: aload 0
      // 14d: getfield onPlayerUpdate.na1 D
      // 150: aload 3
      // 151: getfield onPlayerUpdate.na1 D
      // 154: dcmpl
      // 155: goto 15c
      // 158: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15b: athrow
      // 15c: iload 2
      // 15d: ifne 17a
      // 160: ifne 1e6
      // 163: goto 16a
      // 166: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield onPlayerUpdate.ye8 D
      // 16e: aload 3
      // 16f: getfield onPlayerUpdate.ye8 D
      // 172: dcmpl
      // 173: goto 17a
      // 176: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 179: athrow
      // 17a: iload 2
      // 17b: ifne 198
      // 17e: ifne 1e6
      // 181: goto 188
      // 184: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 187: athrow
      // 188: aload 0
      // 189: getfield onPlayerUpdate.h_8 D
      // 18c: aload 3
      // 18d: getfield onPlayerUpdate.h_8 D
      // 190: dcmpl
      // 191: goto 198
      // 194: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 197: athrow
      // 198: iload 2
      // 199: ifne 1b6
      // 19c: ifne 1e6
      // 19f: goto 1a6
      // 1a2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: getfield onPlayerUpdate.twh D
      // 1aa: aload 3
      // 1ab: getfield onPlayerUpdate.twh D
      // 1ae: dcmpl
      // 1af: goto 1b6
      // 1b2: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b5: athrow
      // 1b6: iload 2
      // 1b7: ifne 1d4
      // 1ba: ifne 1e6
      // 1bd: goto 1c4
      // 1c0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: getfield onPlayerUpdate.f36 D
      // 1c8: aload 3
      // 1c9: getfield onPlayerUpdate.f36 D
      // 1cc: dcmpl
      // 1cd: goto 1d4
      // 1d0: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d3: athrow
      // 1d4: iload 2
      // 1d5: ifne 1e3
      // 1d8: ifne 1e6
      // 1db: goto 1e2
      // 1de: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
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

   public boolean jja(onPlayerUpdate var1, float var2) {
      return this.qey(var1, (double)var2);
   }

   public boolean qey(onPlayerUpdate param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield onPlayerUpdate.jf3 D
      // 009: aload 1
      // 00a: getfield onPlayerUpdate.jf3 D
      // 00d: dsub
      // 00e: dstore 5
      // 010: dload 5
      // 012: iload 4
      // 014: ifeq 02d
      // 017: dconst_0
      // 018: dcmpg
      // 019: ifge 030
      // 01c: goto 023
      // 01f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 022: athrow
      // 023: dload 5
      // 025: dneg
      // 026: goto 02d
      // 029: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02c: athrow
      // 02d: goto 032
      // 030: dload 5
      // 032: dload 2
      // 033: dcmpl
      // 034: iload 4
      // 036: ifeq 064
      // 039: ifle 049
      // 03c: goto 043
      // 03f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 042: athrow
      // 043: bipush 0
      // 044: ireturn
      // 045: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield onPlayerUpdate.o1a D
      // 04d: aload 1
      // 04e: getfield onPlayerUpdate.o1a D
      // 051: dsub
      // 052: dstore 5
      // 054: dload 5
      // 056: iload 4
      // 058: ifeq 071
      // 05b: dconst_0
      // 05c: dcmpg
      // 05d: goto 064
      // 060: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 063: athrow
      // 064: ifge 074
      // 067: dload 5
      // 069: dneg
      // 06a: goto 071
      // 06d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 070: athrow
      // 071: goto 076
      // 074: dload 5
      // 076: dload 2
      // 077: dcmpl
      // 078: iload 4
      // 07a: ifeq 0a8
      // 07d: ifle 08d
      // 080: goto 087
      // 083: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 086: athrow
      // 087: bipush 0
      // 088: ireturn
      // 089: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield onPlayerUpdate.j_n D
      // 091: aload 1
      // 092: getfield onPlayerUpdate.j_n D
      // 095: dsub
      // 096: dstore 5
      // 098: dload 5
      // 09a: iload 4
      // 09c: ifeq 0b5
      // 09f: dconst_0
      // 0a0: dcmpg
      // 0a1: goto 0a8
      // 0a4: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a7: athrow
      // 0a8: ifge 0b8
      // 0ab: dload 5
      // 0ad: dneg
      // 0ae: goto 0b5
      // 0b1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b4: athrow
      // 0b5: goto 0ba
      // 0b8: dload 5
      // 0ba: dload 2
      // 0bb: dcmpl
      // 0bc: iload 4
      // 0be: ifeq 0ec
      // 0c1: ifle 0d1
      // 0c4: goto 0cb
      // 0c7: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ca: athrow
      // 0cb: bipush 0
      // 0cc: ireturn
      // 0cd: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield onPlayerUpdate.uwn D
      // 0d5: aload 1
      // 0d6: getfield onPlayerUpdate.uwn D
      // 0d9: dsub
      // 0da: dstore 5
      // 0dc: dload 5
      // 0de: iload 4
      // 0e0: ifeq 0f9
      // 0e3: dconst_0
      // 0e4: dcmpg
      // 0e5: goto 0ec
      // 0e8: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0eb: athrow
      // 0ec: ifge 0fc
      // 0ef: dload 5
      // 0f1: dneg
      // 0f2: goto 0f9
      // 0f5: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f8: athrow
      // 0f9: goto 0fe
      // 0fc: dload 5
      // 0fe: dload 2
      // 0ff: dcmpl
      // 100: iload 4
      // 102: ifeq 130
      // 105: ifle 115
      // 108: goto 10f
      // 10b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10e: athrow
      // 10f: bipush 0
      // 110: ireturn
      // 111: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 114: athrow
      // 115: aload 0
      // 116: getfield onPlayerUpdate.sgz D
      // 119: aload 1
      // 11a: getfield onPlayerUpdate.sgz D
      // 11d: dsub
      // 11e: dstore 5
      // 120: dload 5
      // 122: iload 4
      // 124: ifeq 13d
      // 127: dconst_0
      // 128: dcmpg
      // 129: goto 130
      // 12c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12f: athrow
      // 130: ifge 140
      // 133: dload 5
      // 135: dneg
      // 136: goto 13d
      // 139: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13c: athrow
      // 13d: goto 142
      // 140: dload 5
      // 142: dload 2
      // 143: dcmpl
      // 144: iload 4
      // 146: ifeq 174
      // 149: ifle 159
      // 14c: goto 153
      // 14f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 152: athrow
      // 153: bipush 0
      // 154: ireturn
      // 155: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 158: athrow
      // 159: aload 0
      // 15a: getfield onPlayerUpdate._6_ D
      // 15d: aload 1
      // 15e: getfield onPlayerUpdate._6_ D
      // 161: dsub
      // 162: dstore 5
      // 164: dload 5
      // 166: iload 4
      // 168: ifeq 181
      // 16b: dconst_0
      // 16c: dcmpg
      // 16d: goto 174
      // 170: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 173: athrow
      // 174: ifge 184
      // 177: dload 5
      // 179: dneg
      // 17a: goto 181
      // 17d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 180: athrow
      // 181: goto 186
      // 184: dload 5
      // 186: dload 2
      // 187: dcmpl
      // 188: iload 4
      // 18a: ifeq 1b8
      // 18d: ifle 19d
      // 190: goto 197
      // 193: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 196: athrow
      // 197: bipush 0
      // 198: ireturn
      // 199: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19c: athrow
      // 19d: aload 0
      // 19e: getfield onPlayerUpdate.m10 D
      // 1a1: aload 1
      // 1a2: getfield onPlayerUpdate.m10 D
      // 1a5: dsub
      // 1a6: dstore 5
      // 1a8: dload 5
      // 1aa: iload 4
      // 1ac: ifeq 1c5
      // 1af: dconst_0
      // 1b0: dcmpg
      // 1b1: goto 1b8
      // 1b4: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b7: athrow
      // 1b8: ifge 1c8
      // 1bb: dload 5
      // 1bd: dneg
      // 1be: goto 1c5
      // 1c1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c4: athrow
      // 1c5: goto 1ca
      // 1c8: dload 5
      // 1ca: dload 2
      // 1cb: dcmpl
      // 1cc: iload 4
      // 1ce: ifeq 1fc
      // 1d1: ifle 1e1
      // 1d4: goto 1db
      // 1d7: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1da: athrow
      // 1db: bipush 0
      // 1dc: ireturn
      // 1dd: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: getfield onPlayerUpdate.g_y D
      // 1e5: aload 1
      // 1e6: getfield onPlayerUpdate.g_y D
      // 1e9: dsub
      // 1ea: dstore 5
      // 1ec: dload 5
      // 1ee: iload 4
      // 1f0: ifeq 209
      // 1f3: dconst_0
      // 1f4: dcmpg
      // 1f5: goto 1fc
      // 1f8: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1fb: athrow
      // 1fc: ifge 20c
      // 1ff: dload 5
      // 201: dneg
      // 202: goto 209
      // 205: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 208: athrow
      // 209: goto 20e
      // 20c: dload 5
      // 20e: dload 2
      // 20f: dcmpl
      // 210: iload 4
      // 212: ifeq 240
      // 215: ifle 225
      // 218: goto 21f
      // 21b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21e: athrow
      // 21f: bipush 0
      // 220: ireturn
      // 221: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 224: athrow
      // 225: aload 0
      // 226: getfield onPlayerUpdate.ji8 D
      // 229: aload 1
      // 22a: getfield onPlayerUpdate.ji8 D
      // 22d: dsub
      // 22e: dstore 5
      // 230: dload 5
      // 232: iload 4
      // 234: ifeq 24d
      // 237: dconst_0
      // 238: dcmpg
      // 239: goto 240
      // 23c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23f: athrow
      // 240: ifge 250
      // 243: dload 5
      // 245: dneg
      // 246: goto 24d
      // 249: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24c: athrow
      // 24d: goto 252
      // 250: dload 5
      // 252: dload 2
      // 253: dcmpl
      // 254: iload 4
      // 256: ifeq 284
      // 259: ifle 269
      // 25c: goto 263
      // 25f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 262: athrow
      // 263: bipush 0
      // 264: ireturn
      // 265: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 268: athrow
      // 269: aload 0
      // 26a: getfield onPlayerUpdate.nqj D
      // 26d: aload 1
      // 26e: getfield onPlayerUpdate.nqj D
      // 271: dsub
      // 272: dstore 5
      // 274: dload 5
      // 276: iload 4
      // 278: ifeq 291
      // 27b: dconst_0
      // 27c: dcmpg
      // 27d: goto 284
      // 280: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 283: athrow
      // 284: ifge 294
      // 287: dload 5
      // 289: dneg
      // 28a: goto 291
      // 28d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 290: athrow
      // 291: goto 296
      // 294: dload 5
      // 296: dload 2
      // 297: dcmpl
      // 298: iload 4
      // 29a: ifeq 2c8
      // 29d: ifle 2ad
      // 2a0: goto 2a7
      // 2a3: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a6: athrow
      // 2a7: bipush 0
      // 2a8: ireturn
      // 2a9: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ac: athrow
      // 2ad: aload 0
      // 2ae: getfield onPlayerUpdate.o_8 D
      // 2b1: aload 1
      // 2b2: getfield onPlayerUpdate.o_8 D
      // 2b5: dsub
      // 2b6: dstore 5
      // 2b8: dload 5
      // 2ba: iload 4
      // 2bc: ifeq 2d5
      // 2bf: dconst_0
      // 2c0: dcmpg
      // 2c1: goto 2c8
      // 2c4: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c7: athrow
      // 2c8: ifge 2d8
      // 2cb: dload 5
      // 2cd: dneg
      // 2ce: goto 2d5
      // 2d1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d4: athrow
      // 2d5: goto 2da
      // 2d8: dload 5
      // 2da: dload 2
      // 2db: dcmpl
      // 2dc: iload 4
      // 2de: ifeq 30c
      // 2e1: ifle 2f1
      // 2e4: goto 2eb
      // 2e7: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2ea: athrow
      // 2eb: bipush 0
      // 2ec: ireturn
      // 2ed: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f0: athrow
      // 2f1: aload 0
      // 2f2: getfield onPlayerUpdate.na1 D
      // 2f5: aload 1
      // 2f6: getfield onPlayerUpdate.na1 D
      // 2f9: dsub
      // 2fa: dstore 5
      // 2fc: dload 5
      // 2fe: iload 4
      // 300: ifeq 319
      // 303: dconst_0
      // 304: dcmpg
      // 305: goto 30c
      // 308: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30b: athrow
      // 30c: ifge 31c
      // 30f: dload 5
      // 311: dneg
      // 312: goto 319
      // 315: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 318: athrow
      // 319: goto 31e
      // 31c: dload 5
      // 31e: dload 2
      // 31f: dcmpl
      // 320: iload 4
      // 322: ifeq 350
      // 325: ifle 335
      // 328: goto 32f
      // 32b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32e: athrow
      // 32f: bipush 0
      // 330: ireturn
      // 331: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 334: athrow
      // 335: aload 0
      // 336: getfield onPlayerUpdate.ye8 D
      // 339: aload 1
      // 33a: getfield onPlayerUpdate.ye8 D
      // 33d: dsub
      // 33e: dstore 5
      // 340: dload 5
      // 342: iload 4
      // 344: ifeq 35d
      // 347: dconst_0
      // 348: dcmpg
      // 349: goto 350
      // 34c: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34f: athrow
      // 350: ifge 360
      // 353: dload 5
      // 355: dneg
      // 356: goto 35d
      // 359: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 35c: athrow
      // 35d: goto 362
      // 360: dload 5
      // 362: dload 2
      // 363: dcmpl
      // 364: iload 4
      // 366: ifeq 394
      // 369: ifle 379
      // 36c: goto 373
      // 36f: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 372: athrow
      // 373: bipush 0
      // 374: ireturn
      // 375: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 378: athrow
      // 379: aload 0
      // 37a: getfield onPlayerUpdate.h_8 D
      // 37d: aload 1
      // 37e: getfield onPlayerUpdate.h_8 D
      // 381: dsub
      // 382: dstore 5
      // 384: dload 5
      // 386: iload 4
      // 388: ifeq 3a1
      // 38b: dconst_0
      // 38c: dcmpg
      // 38d: goto 394
      // 390: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 393: athrow
      // 394: ifge 3a4
      // 397: dload 5
      // 399: dneg
      // 39a: goto 3a1
      // 39d: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a0: athrow
      // 3a1: goto 3a6
      // 3a4: dload 5
      // 3a6: dload 2
      // 3a7: dcmpl
      // 3a8: iload 4
      // 3aa: ifeq 3d8
      // 3ad: ifle 3bd
      // 3b0: goto 3b7
      // 3b3: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b6: athrow
      // 3b7: bipush 0
      // 3b8: ireturn
      // 3b9: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3bc: athrow
      // 3bd: aload 0
      // 3be: getfield onPlayerUpdate.twh D
      // 3c1: aload 1
      // 3c2: getfield onPlayerUpdate.twh D
      // 3c5: dsub
      // 3c6: dstore 5
      // 3c8: dload 5
      // 3ca: iload 4
      // 3cc: ifeq 3e5
      // 3cf: dconst_0
      // 3d0: dcmpg
      // 3d1: goto 3d8
      // 3d4: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d7: athrow
      // 3d8: ifge 3e8
      // 3db: dload 5
      // 3dd: dneg
      // 3de: goto 3e5
      // 3e1: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3e4: athrow
      // 3e5: goto 3ea
      // 3e8: dload 5
      // 3ea: dload 2
      // 3eb: dcmpl
      // 3ec: iload 4
      // 3ee: ifeq 41c
      // 3f1: ifle 401
      // 3f4: goto 3fb
      // 3f7: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3fa: athrow
      // 3fb: bipush 0
      // 3fc: ireturn
      // 3fd: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 400: athrow
      // 401: aload 0
      // 402: getfield onPlayerUpdate.f36 D
      // 405: aload 1
      // 406: getfield onPlayerUpdate.f36 D
      // 409: dsub
      // 40a: dstore 5
      // 40c: dload 5
      // 40e: iload 4
      // 410: ifeq 429
      // 413: dconst_0
      // 414: dcmpg
      // 415: goto 41c
      // 418: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 41b: athrow
      // 41c: ifge 42c
      // 41f: dload 5
      // 421: dneg
      // 422: goto 429
      // 425: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 428: athrow
      // 429: goto 42e
      // 42c: dload 5
      // 42e: dload 2
      // 42f: dcmpl
      // 430: iload 4
      // 432: ifeq 446
      // 435: ifle 445
      // 438: goto 43f
      // 43b: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43e: athrow
      // 43f: bipush 0
      // 440: ireturn
      // 441: invokestatic onPlayerUpdate.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 444: athrow
      // 445: bipush 1
      // 446: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = 1L;
      var1 = get.mql(var1, this.jf3);
      var1 = get.mql(var1, this.o1a);
      var1 = get.mql(var1, this.j_n);
      var1 = get.mql(var1, this.uwn);
      var1 = get.mql(var1, this.sgz);
      var1 = get.mql(var1, this._6_);
      var1 = get.mql(var1, this.m10);
      var1 = get.mql(var1, this.g_y);
      var1 = get.mql(var1, this.ji8);
      var1 = get.mql(var1, this.nqj);
      var1 = get.mql(var1, this.o_8);
      var1 = get.mql(var1, this.na1);
      var1 = get.mql(var1, this.ye8);
      var1 = get.mql(var1, this.h_8);
      var1 = get.mql(var1, this.twh);
      var1 = get.mql(var1, this.f36);
      return get.p05(var1);
   }

   public final void dex(xv0 var1, xv0 var2) {
      double var3 = this.jf3 * var1.yme + this.o1a * var1.pf8 + this.j_n * var1.jfe + this.uwn * var1.ggc;
      double var5 = this.sgz * var1.yme + this._6_ * var1.pf8 + this.m10 * var1.jfe + this.g_y * var1.ggc;
      double var7 = this.ji8 * var1.yme + this.nqj * var1.pf8 + this.o_8 * var1.jfe + this.na1 * var1.ggc;
      var2.ggc = this.ye8 * var1.yme + this.h_8 * var1.pf8 + this.twh * var1.jfe + this.f36 * var1.ggc;
      var2.yme = var3;
      var2.pf8 = var5;
      var2.jfe = var7;
   }

   public final void rin(xv0 var1) {
      double var2 = this.jf3 * var1.yme + this.o1a * var1.pf8 + this.j_n * var1.jfe + this.uwn * var1.ggc;
      double var4 = this.sgz * var1.yme + this._6_ * var1.pf8 + this.m10 * var1.jfe + this.g_y * var1.ggc;
      double var6 = this.ji8 * var1.yme + this.nqj * var1.pf8 + this.o_8 * var1.jfe + this.na1 * var1.ggc;
      var1.ggc = this.ye8 * var1.yme + this.h_8 * var1.pf8 + this.twh * var1.jfe + this.f36 * var1.ggc;
      var1.yme = var2;
      var1.pf8 = var4;
      var1.jfe = var6;
   }

   public final void rnx(rkj var1, rkj var2) {
      float var3 = (float)(this.jf3 * (double)var1.hp2 + this.o1a * (double)var1.nc_ + this.j_n * (double)var1.ax5 + this.uwn * (double)var1.ck3);
      float var4 = (float)(this.sgz * (double)var1.hp2 + this._6_ * (double)var1.nc_ + this.m10 * (double)var1.ax5 + this.g_y * (double)var1.ck3);
      float var5 = (float)(this.ji8 * (double)var1.hp2 + this.nqj * (double)var1.nc_ + this.o_8 * (double)var1.ax5 + this.na1 * (double)var1.ck3);
      var2.ck3 = (float)(this.ye8 * (double)var1.hp2 + this.h_8 * (double)var1.nc_ + this.twh * (double)var1.ax5 + this.f36 * (double)var1.ck3);
      var2.hp2 = var3;
      var2.nc_ = var4;
      var2.ax5 = var5;
   }

   public final void tzd(rkj var1) {
      float var2 = (float)(this.jf3 * (double)var1.hp2 + this.o1a * (double)var1.nc_ + this.j_n * (double)var1.ax5 + this.uwn * (double)var1.ck3);
      float var3 = (float)(this.sgz * (double)var1.hp2 + this._6_ * (double)var1.nc_ + this.m10 * (double)var1.ax5 + this.g_y * (double)var1.ck3);
      float var4 = (float)(this.ji8 * (double)var1.hp2 + this.nqj * (double)var1.nc_ + this.o_8 * (double)var1.ax5 + this.na1 * (double)var1.ck3);
      var1.ck3 = (float)(this.ye8 * (double)var1.hp2 + this.h_8 * (double)var1.nc_ + this.twh * (double)var1.ax5 + this.f36 * (double)var1.ck3);
      var1.hp2 = var2;
      var1.nc_ = var3;
      var1.ax5 = var4;
   }

   public final void m9f(fna var1, fna var2) {
      double var3 = this.jf3 * var1.v54 + this.o1a * var1.g0w + this.j_n * var1.mu9 + this.uwn;
      double var5 = this.sgz * var1.v54 + this._6_ * var1.g0w + this.m10 * var1.mu9 + this.g_y;
      var2.mu9 = this.ji8 * var1.v54 + this.nqj * var1.g0w + this.o_8 * var1.mu9 + this.na1;
      var2.v54 = var3;
      var2.g0w = var5;
   }

   public final void frr(fna var1) {
      double var2 = this.jf3 * var1.v54 + this.o1a * var1.g0w + this.j_n * var1.mu9 + this.uwn;
      double var4 = this.sgz * var1.v54 + this._6_ * var1.g0w + this.m10 * var1.mu9 + this.g_y;
      var1.mu9 = this.ji8 * var1.v54 + this.nqj * var1.g0w + this.o_8 * var1.mu9 + this.na1;
      var1.v54 = var2;
      var1.g0w = var4;
   }

   public final void jow(_r4 var1, _r4 var2) {
      float var3 = (float)(this.jf3 * (double)var1.yiu + this.o1a * (double)var1.q6o + this.j_n * (double)var1.n_d + this.uwn);
      float var4 = (float)(this.sgz * (double)var1.yiu + this._6_ * (double)var1.q6o + this.m10 * (double)var1.n_d + this.g_y);
      var2.n_d = (float)(this.ji8 * (double)var1.yiu + this.nqj * (double)var1.q6o + this.o_8 * (double)var1.n_d + this.na1);
      var2.yiu = var3;
      var2.q6o = var4;
   }

   public final void adi(_r4 var1) {
      float var2 = (float)(this.jf3 * (double)var1.yiu + this.o1a * (double)var1.q6o + this.j_n * (double)var1.n_d + this.uwn);
      float var3 = (float)(this.sgz * (double)var1.yiu + this._6_ * (double)var1.q6o + this.m10 * (double)var1.n_d + this.g_y);
      var1.n_d = (float)(this.ji8 * (double)var1.yiu + this.nqj * (double)var1.q6o + this.o_8 * (double)var1.n_d + this.na1);
      var1.yiu = var2;
      var1.q6o = var3;
   }

   public final void hxx(qhn var1, qhn var2) {
      double var3 = this.jf3 * var1.v54 + this.o1a * var1.g0w + this.j_n * var1.mu9;
      double var5 = this.sgz * var1.v54 + this._6_ * var1.g0w + this.m10 * var1.mu9;
      var2.mu9 = this.ji8 * var1.v54 + this.nqj * var1.g0w + this.o_8 * var1.mu9;
      var2.v54 = var3;
      var2.g0w = var5;
   }

   public final void wvx(qhn var1) {
      double var2 = this.jf3 * var1.v54 + this.o1a * var1.g0w + this.j_n * var1.mu9;
      double var4 = this.sgz * var1.v54 + this._6_ * var1.g0w + this.m10 * var1.mu9;
      var1.mu9 = this.ji8 * var1.v54 + this.nqj * var1.g0w + this.o_8 * var1.mu9;
      var1.v54 = var2;
      var1.g0w = var4;
   }

   public final void tuw(l3p var1, l3p var2) {
      float var3 = (float)(this.jf3 * (double)var1.yiu + this.o1a * (double)var1.q6o + this.j_n * (double)var1.n_d);
      float var4 = (float)(this.sgz * (double)var1.yiu + this._6_ * (double)var1.q6o + this.m10 * (double)var1.n_d);
      var2.n_d = (float)(this.ji8 * (double)var1.yiu + this.nqj * (double)var1.q6o + this.o_8 * (double)var1.n_d);
      var2.yiu = var3;
      var2.q6o = var4;
   }

   public final void qnq(l3p var1) {
      float var2 = (float)(this.jf3 * (double)var1.yiu + this.o1a * (double)var1.q6o + this.j_n * (double)var1.n_d);
      float var3 = (float)(this.sgz * (double)var1.yiu + this._6_ * (double)var1.q6o + this.m10 * (double)var1.n_d);
      var1.n_d = (float)(this.ji8 * (double)var1.yiu + this.nqj * (double)var1.q6o + this.o_8 * (double)var1.n_d);
      var1.yiu = var2;
      var1.q6o = var3;
   }

   public final void f8i(iww var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.o3l(var3, var2);
      this.jf3 = var1.lxb * var3[0];
      this.o1a = var1.y3c * var3[1];
      this.j_n = var1.bhd * var3[2];
      this.sgz = var1.get * var3[0];
      this._6_ = var1.pwn * var3[1];
      this.m10 = var1.c84 * var3[2];
      this.ji8 = var1.y7q * var3[0];
      this.nqj = var1._o7 * var3[1];
      this.o_8 = var1.ffq * var3[2];
   }

   public final void c5e(nvj var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.o3l(var3, var2);
      this.jf3 = (double)var1.i2i * var3[0];
      this.o1a = (double)var1.k12 * var3[1];
      this.j_n = (double)var1.xu6 * var3[2];
      this.sgz = (double)var1._id * var3[0];
      this._6_ = (double)var1.aoj * var3[1];
      this.m10 = (double)var1.zk_ * var3[2];
      this.ji8 = (double)var1.aqg * var3[0];
      this.nqj = (double)var1.wdt * var3[1];
      this.o_8 = (double)var1.jr8 * var3[2];
   }

   public final void jbu(lwt var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.o3l(var3, var2);
      this.jf3 = (1.0 - (double)(2.0F * var1.nc_ * var1.nc_) - (double)(2.0F * var1.ax5 * var1.ax5)) * var3[0];
      this.sgz = 2.0 * (double)(var1.hp2 * var1.nc_ + var1.ck3 * var1.ax5) * var3[0];
      this.ji8 = 2.0 * (double)(var1.hp2 * var1.ax5 - var1.ck3 * var1.nc_) * var3[0];
      this.o1a = 2.0 * (double)(var1.hp2 * var1.nc_ - var1.ck3 * var1.ax5) * var3[1];
      this._6_ = (1.0 - (double)(2.0F * var1.hp2 * var1.hp2) - (double)(2.0F * var1.ax5 * var1.ax5)) * var3[1];
      this.nqj = 2.0 * (double)(var1.nc_ * var1.ax5 + var1.ck3 * var1.hp2) * var3[1];
      this.j_n = 2.0 * (double)(var1.hp2 * var1.ax5 + var1.ck3 * var1.nc_) * var3[2];
      this.m10 = 2.0 * (double)(var1.nc_ * var1.ax5 - var1.ck3 * var1.hp2) * var3[2];
      this.o_8 = (1.0 - (double)(2.0F * var1.hp2 * var1.hp2) - (double)(2.0F * var1.nc_ * var1.nc_)) * var3[2];
   }

   public final void sxn(nbf var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.o3l(var3, var2);
      this.jf3 = (1.0 - 2.0 * var1.pf8 * var1.pf8 - 2.0 * var1.jfe * var1.jfe) * var3[0];
      this.sgz = 2.0 * (var1.yme * var1.pf8 + var1.ggc * var1.jfe) * var3[0];
      this.ji8 = 2.0 * (var1.yme * var1.jfe - var1.ggc * var1.pf8) * var3[0];
      this.o1a = 2.0 * (var1.yme * var1.pf8 - var1.ggc * var1.jfe) * var3[1];
      this._6_ = (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.jfe * var1.jfe) * var3[1];
      this.nqj = 2.0 * (var1.pf8 * var1.jfe + var1.ggc * var1.yme) * var3[1];
      this.j_n = 2.0 * (var1.yme * var1.jfe + var1.ggc * var1.pf8) * var3[2];
      this.m10 = 2.0 * (var1.pf8 * var1.jfe - var1.ggc * var1.yme) * var3[2];
      this.o_8 = (1.0 - 2.0 * var1.yme * var1.yme - 2.0 * var1.pf8 * var1.pf8) * var3[2];
   }

   public final void grr(lg5 var1) {
      double[] var2 = new double[9];
      double[] var3 = new double[3];
      this.o3l(var3, var2);
      double var4 = 1.0 / Math.sqrt(var1.fs3 * var1.fs3 + var1.j4q * var1.j4q + var1.fki * var1.fki);
      double var6 = var1.fs3 * var4;
      double var8 = var1.j4q * var4;
      double var10 = var1.fki * var4;
      double var12 = Math.sin(var1.ezi);
      double var14 = Math.cos(var1.ezi);
      double var16 = 1.0 - var14;
      double var18 = var1.fs3 * var1.fki;
      double var20 = var1.fs3 * var1.j4q;
      double var22 = var1.j4q * var1.fki;
      this.jf3 = (var16 * var6 * var6 + var14) * var3[0];
      this.o1a = (var16 * var20 - var12 * var10) * var3[1];
      this.j_n = (var16 * var18 + var12 * var8) * var3[2];
      this.sgz = (var16 * var20 + var12 * var10) * var3[0];
      this._6_ = (var16 * var8 * var8 + var14) * var3[1];
      this.m10 = (var16 * var22 - var12 * var6) * var3[2];
      this.ji8 = (var16 * var18 - var12 * var8) * var3[0];
      this.nqj = (var16 * var22 + var12 * var6) * var3[1];
      this.o_8 = (var16 * var10 * var10 + var14) * var3[2];
   }

   public final void b3c() {
      this.jf3 = 0.0;
      this.o1a = 0.0;
      this.j_n = 0.0;
      this.uwn = 0.0;
      this.sgz = 0.0;
      this._6_ = 0.0;
      this.m10 = 0.0;
      this.g_y = 0.0;
      this.ji8 = 0.0;
      this.nqj = 0.0;
      this.o_8 = 0.0;
      this.na1 = 0.0;
      this.ye8 = 0.0;
      this.h_8 = 0.0;
      this.twh = 0.0;
      this.f36 = 0.0;
   }

   public final void kuu() {
      this.jf3 = -this.jf3;
      this.o1a = -this.o1a;
      this.j_n = -this.j_n;
      this.uwn = -this.uwn;
      this.sgz = -this.sgz;
      this._6_ = -this._6_;
      this.m10 = -this.m10;
      this.g_y = -this.g_y;
      this.ji8 = -this.ji8;
      this.nqj = -this.nqj;
      this.o_8 = -this.o_8;
      this.na1 = -this.na1;
      this.ye8 = -this.ye8;
      this.h_8 = -this.h_8;
      this.twh = -this.twh;
      this.f36 = -this.f36;
   }

   public final void pre(onPlayerUpdate var1) {
      this.jf3 = -var1.jf3;
      this.o1a = -var1.o1a;
      this.j_n = -var1.j_n;
      this.uwn = -var1.uwn;
      this.sgz = -var1.sgz;
      this._6_ = -var1._6_;
      this.m10 = -var1.m10;
      this.g_y = -var1.g_y;
      this.ji8 = -var1.ji8;
      this.nqj = -var1.nqj;
      this.o_8 = -var1.o_8;
      this.na1 = -var1.na1;
      this.ye8 = -var1.ye8;
      this.h_8 = -var1.h_8;
      this.twh = -var1.twh;
      this.f36 = -var1.f36;
   }

   private final void o3l(double[] var1, double[] var2) {
      double[] var3 = new double[]{this.jf3, this.o1a, this.j_n, this.sgz, this._6_, this.m10, this.ji8, this.nqj, this.o_8};
      iww.d20(var3, var1, var2);
   }

   @Override
   public Object clone() {
      Object var1 = null;

      try {
         return (onPlayerUpdate)super.clone();
      } catch (CloneNotSupportedException var3) {
         throw new InternalError();
      }
   }

   public final double rn5() {
      return this.jf3;
   }

   public final void zp7(double var1) {
      this.jf3 = var1;
   }

   public final double je1() {
      return this.o1a;
   }

   public final void s8m(double var1) {
      this.o1a = var1;
   }

   public final double b2a() {
      return this.j_n;
   }

   public final void ake(double var1) {
      this.j_n = var1;
   }

   public final double p6t() {
      return this.sgz;
   }

   public final void de6(double var1) {
      this.sgz = var1;
   }

   public final double ish() {
      return this._6_;
   }

   public final void jd3(double var1) {
      this._6_ = var1;
   }

   public final double li7() {
      return this.m10;
   }

   public final void ald(double var1) {
      this.m10 = var1;
   }

   public final double aqp() {
      return this.ji8;
   }

   public final void r6s(double var1) {
      this.ji8 = var1;
   }

   public final double kxf() {
      return this.nqj;
   }

   public final void h3f(double var1) {
      this.nqj = var1;
   }

   public final double itm() {
      return this.o_8;
   }

   public final void tjf(double var1) {
      this.o_8 = var1;
   }

   public final double r6z() {
      return this.uwn;
   }

   public final void n_u(double var1) {
      this.uwn = var1;
   }

   public final double g1u() {
      return this.g_y;
   }

   public final void suo(double var1) {
      this.g_y = var1;
   }

   public final double xe4() {
      return this.na1;
   }

   public final void o85(double var1) {
      this.na1 = var1;
   }

   public final double rx4() {
      return this.ye8;
   }

   public final void by5(double var1) {
      this.ye8 = var1;
   }

   public final double sza() {
      return this.h_8;
   }

   public final void tjq(double var1) {
      this.h_8 = var1;
   }

   public final double usm() {
      return this.twh;
   }

   public final void m5y(double var1) {
      this.twh = var1;
   }

   public final double e8y() {
      return this.f36;
   }

   public final void _yv(double var1) {
      this.f36 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4740892563626641540L, -599888867014392901L, MethodHandles.lookup().lookupClass()).a(148201971912195L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 98238920715825L;
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
      String var6 = "\u0093\f=\u0013=ÄÂÁú «[\u0017\u0007l\u0087ÛÅÞ4\u0010hµ\u0094ÑIYFl¹O« \u000ez\u000e7½$G\u0019U\u0096<Wë\u00041gõ\u0012ç?¸bÜu-ûFR\u0017Ñ\u0095» zI>xÄ\u0005\u008b\u009dK¹À\u008fÁ3µÖÚ\u00900f»*7lËu\u0081>/\u0090\u0010Ý\u0018r=MÞiZ^ô\u009a\u0005ãÂwsó\u001co\u00119\u0081ô1æ+\u00185ß\u0007nÙóåÿyÞÇ\u0094xÜ\u009eW5:fÛù\u0005X4\u0018äGdìô'óUÄ#!}Äï\u0012\u008evRx«¥q\u0007ß\u0010\u0096ÑK\u00adØOwKµÊás¢v¬i\u0010Àû2ó\u00123\\^x\u009aÑY\bT¡A\u0018[÷Z)\u007f\"mç@ìu\u007f½\u0089â\u0084M\u0083\u000b\u0090J\u0091z] \u00011Ð¡41æ8h:Ol+Ö\u00ad\u0093ò¾Þ\u007f5\u001d\u009cuåIuPjòÿé f\u001aâ~o°\u000b\u0007\u009bàQéõe\u0014§\u0018jö\u00961)\u0016@í|¯·.ñ\u000fÙ iq¤\u0086çç\u0087OëÚ\u0011öJ>É00K.Sä\u008cL\u007fm¸\u0006E7ÿjÿ\u00189Ì\u0099¼\rÖ»Kü{¶\u009eg\u0018&¨\u008c8\u0092\u0089º}\n\u0005";
      int var8 = "\u0093\f=\u0013=ÄÂÁú «[\u0017\u0007l\u0087ÛÅÞ4\u0010hµ\u0094ÑIYFl¹O« \u000ez\u000e7½$G\u0019U\u0096<Wë\u00041gõ\u0012ç?¸bÜu-ûFR\u0017Ñ\u0095» zI>xÄ\u0005\u008b\u009dK¹À\u008fÁ3µÖÚ\u00900f»*7lËu\u0081>/\u0090\u0010Ý\u0018r=MÞiZ^ô\u009a\u0005ãÂwsó\u001co\u00119\u0081ô1æ+\u00185ß\u0007nÙóåÿyÞÇ\u0094xÜ\u009eW5:fÛù\u0005X4\u0018äGdìô'óUÄ#!}Äï\u0012\u008evRx«¥q\u0007ß\u0010\u0096ÑK\u00adØOwKµÊás¢v¬i\u0010Àû2ó\u00123\\^x\u009aÑY\bT¡A\u0018[÷Z)\u007f\"mç@ìu\u007f½\u0089â\u0084M\u0083\u000b\u0090J\u0091z] \u00011Ð¡41æ8h:Ol+Ö\u00ad\u0093ò¾Þ\u007f5\u001d\u009cuåIuPjòÿé f\u001aâ~o°\u000b\u0007\u009bàQéõe\u0014§\u0018jö\u00961)\u0016@í|¯·.ñ\u000fÙ iq¤\u0086çç\u0087OëÚ\u0011öJ>É00K.Sä\u008cL\u007fm¸\u0006E7ÿjÿ\u00189Ì\u0099¼\rÖ»Kü{¶\u009eg\u0018&¨\u008c8\u0092\u0089º}\n\u0005"
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

                  var6 = "3\"\u0015óW\u0010\u0092\u0090²7\u0013\u0090@LÄüRï_2Q\u0084\u0098\u008c\u008a\u0000á/µ\u001bËr\u0018\u000e´\u008fçÎÃ9Â*õp¯Ô_\u000b\u0094\u000f¶ \u009e{PÓ÷";
                  var8 = "3\"\u0015óW\u0010\u0092\u0090²7\u0013\u0090@LÄüRï_2Q\u0084\u0098\u008c\u008a\u0000á/µ\u001bËr\u0018\u000e´\u008fçÎÃ9Â*õp¯Ô_\u000b\u0094\u000f¶ \u009e{PÓ÷"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26740;
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
            throw new RuntimeException("onPlayerUpdate", var10);
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
         throw new RuntimeException("onPlayerUpdate" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
