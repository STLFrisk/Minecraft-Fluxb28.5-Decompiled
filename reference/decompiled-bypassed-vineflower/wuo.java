import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wuo extends e0x {
   public static final _ku bjk;
   public static final h76 c1c;
   public static final h76 idr;
   public static final h76 p11;
   public static final h76 zmn;
   public static final h76 y87;
   public static final h76 hh4;
   public static final _ku _ih;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   @Override
   public zfz w1b(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: invokevirtual mew.getX ()I
      // 004: istore 5
      // 006: invokestatic t9d.c ()I
      // 009: aload 3
      // 00a: invokevirtual mew.getY ()I
      // 00d: istore 6
      // 00f: istore 4
      // 011: aload 3
      // 012: invokevirtual mew.getZ ()I
      // 015: istore 7
      // 017: aload 2
      // 018: aload 3
      // 019: invokevirtual mew.eve ()Lmew;
      // 01c: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 01f: iload 4
      // 021: ifne 04c
      // 024: ifne 158
      // 027: goto 02e
      // 02a: invokestatic wuo.a (Loov;)Loov;
      // 02d: athrow
      // 02e: getstatic ox_._0u Lwuo;
      // 031: iload 4
      // 033: ifne 159
      // 036: goto 03d
      // 039: invokestatic wuo.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 2
      // 03e: aload 3
      // 03f: invokevirtual mew.eve ()Lmew;
      // 042: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 045: goto 04c
      // 048: invokestatic wuo.a (Loov;)Loov;
      // 04b: athrow
      // 04c: ifne 158
      // 04f: iload 5
      // 051: iload 6
      // 053: iadd
      // 054: iload 7
      // 056: iadd
      // 057: bipush 1
      // 058: iand
      // 059: iload 4
      // 05b: ifne 078
      // 05e: goto 065
      // 061: invokestatic wuo.a (Loov;)Loov;
      // 064: athrow
      // 065: bipush 1
      // 066: if_icmpne 07b
      // 069: goto 070
      // 06c: invokestatic wuo.a (Loov;)Loov;
      // 06f: athrow
      // 070: bipush 1
      // 071: goto 078
      // 074: invokestatic wuo.a (Loov;)Loov;
      // 077: athrow
      // 078: goto 07c
      // 07b: bipush 0
      // 07c: istore 8
      // 07e: iload 5
      // 080: bipush 2
      // 081: idiv
      // 082: iload 6
      // 084: bipush 2
      // 085: idiv
      // 086: iadd
      // 087: iload 7
      // 089: bipush 2
      // 08a: idiv
      // 08b: iadd
      // 08c: bipush 1
      // 08d: iand
      // 08e: iload 4
      // 090: ifne 0a6
      // 093: bipush 1
      // 094: if_icmpne 0a9
      // 097: goto 09e
      // 09a: invokestatic wuo.a (Loov;)Loov;
      // 09d: athrow
      // 09e: bipush 1
      // 09f: goto 0a6
      // 0a2: invokestatic wuo.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: goto 0aa
      // 0a9: bipush 0
      // 0aa: istore 9
      // 0ac: bipush 0
      // 0ad: istore 10
      // 0af: aload 0
      // 0b0: aload 2
      // 0b1: aload 3
      // 0b2: invokevirtual mew.nuv ()Lmew;
      // 0b5: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 0b8: iload 4
      // 0ba: ifne 0c9
      // 0bd: ifeq 0df
      // 0c0: goto 0c7
      // 0c3: invokestatic wuo.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: iload 8
      // 0c9: iload 4
      // 0cb: ifne 0d9
      // 0ce: ifeq 0dc
      // 0d1: goto 0d8
      // 0d4: invokestatic wuo.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: bipush 1
      // 0d9: goto 0dd
      // 0dc: bipush 2
      // 0dd: istore 10
      // 0df: aload 1
      // 0e0: getstatic wuo.p11 Lh76;
      // 0e3: aload 0
      // 0e4: aload 2
      // 0e5: aload 3
      // 0e6: invokevirtual mew.idu ()Lmew;
      // 0e9: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 0ec: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ef: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0f4: getstatic wuo.zmn Lh76;
      // 0f7: aload 0
      // 0f8: aload 2
      // 0f9: aload 3
      // 0fa: invokevirtual mew.o_8 ()Lmew;
      // 0fd: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 100: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 103: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 108: getstatic wuo.y87 Lh76;
      // 10b: aload 0
      // 10c: aload 2
      // 10d: aload 3
      // 10e: invokevirtual mew.z6x ()Lmew;
      // 111: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 114: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 117: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 11c: getstatic wuo.hh4 Lh76;
      // 11f: aload 0
      // 120: aload 2
      // 121: aload 3
      // 122: invokevirtual mew.y8e ()Lmew;
      // 125: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 128: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 12b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 130: getstatic wuo._ih L_ku;
      // 133: iload 10
      // 135: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 138: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 13d: getstatic wuo.c1c Lh76;
      // 140: iload 9
      // 142: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 145: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 14a: getstatic wuo.idr Lh76;
      // 14d: iload 8
      // 14f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 152: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 157: areturn
      // 158: aload 0
      // 159: invokevirtual wuo.l4i ()Lzfz;
      // 15c: areturn
   }

   public wuo() {
      super(p3y._tu);
      this.y8l(this._8_.c32().zvi(bjk, 0).zvi(c1c, false).zvi(idr, false).zvi(p11, false).zvi(zmn, false).zvi(y87, false).zvi(hh4, false).zvi(_ih, 0));
      this._p_(true);
   }

   public static void sjd() {
      ox_._0u.eha(ox_.wb7, 5, 20);
      ox_._0u.eha(ox_.pfr, 5, 20);
      ox_._0u.eha(ox_.jp3, 5, 20);
      ox_._0u.eha(ox_.myf, 5, 20);
      ox_._0u.eha(ox_.bmi, 5, 20);
      ox_._0u.eha(ox_._8w, 5, 20);
      ox_._0u.eha(ox_.g57, 5, 20);
      ox_._0u.eha(ox_.r_x, 5, 20);
      ox_._0u.eha(ox_.mnm, 5, 20);
      ox_._0u.eha(ox_.j5b, 5, 20);
      ox_._0u.eha(ox_.knk, 5, 20);
      ox_._0u.eha(ox_.mua, 5, 20);
      ox_._0u.eha(ox_.bvu, 5, 20);
      ox_._0u.eha(ox_.xd_, 5, 20);
      ox_._0u.eha(ox_.gj4, 5, 20);
      ox_._0u.eha(ox_.olk, 5, 20);
      ox_._0u.eha(ox_.avz, 5, 20);
      ox_._0u.eha(ox_.fhe, 5, 20);
      ox_._0u.eha(ox_.p62, 5, 20);
      ox_._0u.eha(ox_.uom, 5, 5);
      ox_._0u.eha(ox_.a4y, 5, 5);
      ox_._0u.eha(ox_.rwl, 30, 60);
      ox_._0u.eha(ox_.x_c, 30, 60);
      ox_._0u.eha(ox_.kzr, 30, 20);
      ox_._0u.eha(ox_.od1, 15, 100);
      ox_._0u.eha(ox_._w6, 60, 100);
      ox_._0u.eha(ox_.s4_, 60, 100);
      ox_._0u.eha(ox_.qmk, 60, 100);
      ox_._0u.eha(ox_.xq2, 60, 100);
      ox_._0u.eha(ox_.rx7, 60, 100);
      ox_._0u.eha(ox_.lpo, 30, 60);
      ox_._0u.eha(ox_.s25, 15, 100);
      ox_._0u.eha(ox_.orh, 5, 5);
      ox_._0u.eha(ox_.cap, 60, 20);
      ox_._0u.eha(ox_.cj9, 60, 20);
   }

   public void eha(e0x var1, int var2, int var3) {
      this.v7k.put(var1, var2);
      this.ot9.put(var1, var3);
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public int odp(t9d var1) {
      return 30;
   }

   @Override
   public void zvy(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wuo.b J
      // 003: ldc2_w 50602019183434
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.c ()I
      // 00c: istore 7
      // 00e: aload 1
      // 00f: invokevirtual t9d.eir ()Lef9;
      // 012: sipush 18160
      // 015: ldc2_w 787150794784950414
      // 018: lload 5
      // 01a: lxor
      // 01b: invokedynamic b (IJ)Ljava/lang/String; bsm=wuo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 024: iload 7
      // 026: ifne 04c
      // 029: ifeq 45d
      // 02c: goto 033
      // 02f: invokestatic wuo.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: iload 7
      // 036: ifne 069
      // 039: goto 040
      // 03c: invokestatic wuo.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 1
      // 041: aload 2
      // 042: invokevirtual wuo.ctq (Lt9d;Lmew;)Z
      // 045: goto 04c
      // 048: invokestatic wuo.a (Loov;)Loov;
      // 04b: athrow
      // 04c: ifne 05c
      // 04f: aload 1
      // 050: aload 2
      // 051: invokevirtual t9d.i6x (Lmew;)Z
      // 054: pop
      // 055: goto 05c
      // 058: invokestatic wuo.a (Loov;)Loov;
      // 05b: athrow
      // 05c: aload 1
      // 05d: aload 2
      // 05e: invokevirtual mew.eve ()Lmew;
      // 061: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 064: invokeinterface zfz.r_y ()Le0x; 1
      // 069: astore 8
      // 06b: aload 8
      // 06d: getstatic ox_.pzt Le0x;
      // 070: if_acmpne 07b
      // 073: bipush 1
      // 074: goto 07c
      // 077: invokestatic wuo.a (Loov;)Loov;
      // 07a: athrow
      // 07b: bipush 0
      // 07c: istore 9
      // 07e: aload 1
      // 07f: getfield t9d.vzz Lupn;
      // 082: instanceof aqg
      // 085: iload 7
      // 087: ifne 0a8
      // 08a: ifeq 0a6
      // 08d: goto 094
      // 090: invokestatic wuo.a (Loov;)Loov;
      // 093: athrow
      // 094: aload 8
      // 096: getstatic ox_.n6z Le0x;
      // 099: if_acmpne 0a6
      // 09c: goto 0a3
      // 09f: invokestatic wuo.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: bipush 1
      // 0a4: istore 9
      // 0a6: iload 9
      // 0a8: iload 7
      // 0aa: ifne 115
      // 0ad: ifne 0ff
      // 0b0: goto 0b7
      // 0b3: invokestatic wuo.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: invokevirtual t9d.xqu ()Z
      // 0bb: iload 7
      // 0bd: ifne 115
      // 0c0: goto 0c7
      // 0c3: invokestatic wuo.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: ifeq 0ff
      // 0ca: goto 0d1
      // 0cd: invokestatic wuo.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: aload 2
      // 0d4: invokevirtual wuo.blx (Lt9d;Lmew;)Z
      // 0d7: iload 7
      // 0d9: ifne 115
      // 0dc: goto 0e3
      // 0df: invokestatic wuo.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: ifeq 0ff
      // 0e6: goto 0ed
      // 0e9: invokestatic wuo.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 1
      // 0ee: aload 2
      // 0ef: invokevirtual t9d.i6x (Lmew;)Z
      // 0f2: pop
      // 0f3: iload 7
      // 0f5: ifeq 45d
      // 0f8: goto 0ff
      // 0fb: invokestatic wuo.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 3
      // 100: getstatic wuo.bjk L_ku;
      // 103: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 108: checkcast java/lang/Integer
      // 10b: invokevirtual java/lang/Integer.intValue ()I
      // 10e: goto 115
      // 111: invokestatic wuo.a (Loov;)Loov;
      // 114: athrow
      // 115: istore 10
      // 117: iload 10
      // 119: iload 7
      // 11b: ifne 15f
      // 11e: bipush 15
      // 120: if_icmpge 14a
      // 123: goto 12a
      // 126: invokestatic wuo.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 3
      // 12b: getstatic wuo.bjk L_ku;
      // 12e: iload 10
      // 130: aload 4
      // 132: bipush 3
      // 133: invokevirtual java/util/Random.nextInt (I)I
      // 136: bipush 2
      // 137: idiv
      // 138: iadd
      // 139: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 141: astore 3
      // 142: aload 1
      // 143: aload 2
      // 144: aload 3
      // 145: bipush 4
      // 146: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 149: pop
      // 14a: aload 1
      // 14b: aload 2
      // 14c: aload 0
      // 14d: aload 0
      // 14e: aload 1
      // 14f: invokevirtual wuo.odp (Lt9d;)I
      // 152: aload 4
      // 154: bipush 10
      // 156: invokevirtual java/util/Random.nextInt (I)I
      // 159: iadd
      // 15a: invokevirtual t9d.cjk (Lmew;Le0x;I)V
      // 15d: iload 9
      // 15f: iload 7
      // 161: ifne 22d
      // 164: ifne 228
      // 167: goto 16e
      // 16a: invokestatic wuo.a (Loov;)Loov;
      // 16d: athrow
      // 16e: aload 0
      // 16f: aload 1
      // 170: aload 2
      // 171: invokespecial wuo.g9g (Lt9d;Lmew;)Z
      // 174: iload 7
      // 176: ifne 1d8
      // 179: goto 180
      // 17c: invokestatic wuo.a (Loov;)Loov;
      // 17f: athrow
      // 180: ifne 1cf
      // 183: goto 18a
      // 186: invokestatic wuo.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 1
      // 18b: aload 2
      // 18c: invokevirtual mew.eve ()Lmew;
      // 18f: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 192: iload 7
      // 194: ifne 1cd
      // 197: goto 19e
      // 19a: invokestatic wuo.a (Loov;)Loov;
      // 19d: athrow
      // 19e: ifeq 1c1
      // 1a1: goto 1a8
      // 1a4: invokestatic wuo.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 10
      // 1aa: iload 7
      // 1ac: ifne 1cd
      // 1af: goto 1b6
      // 1b2: invokestatic wuo.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: bipush 3
      // 1b7: if_icmple 1ce
      // 1ba: goto 1c1
      // 1bd: invokestatic wuo.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: aload 1
      // 1c2: aload 2
      // 1c3: invokevirtual t9d.i6x (Lmew;)Z
      // 1c6: goto 1cd
      // 1c9: invokestatic wuo.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: pop
      // 1ce: return
      // 1cf: aload 0
      // 1d0: aload 1
      // 1d1: aload 2
      // 1d2: invokevirtual mew.eve ()Lmew;
      // 1d5: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 1d8: iload 7
      // 1da: ifne 22d
      // 1dd: ifne 228
      // 1e0: goto 1e7
      // 1e3: invokestatic wuo.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: iload 10
      // 1e9: iload 7
      // 1eb: ifne 22d
      // 1ee: goto 1f5
      // 1f1: invokestatic wuo.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: bipush 15
      // 1f7: if_icmpne 228
      // 1fa: goto 201
      // 1fd: invokestatic wuo.a (Loov;)Loov;
      // 200: athrow
      // 201: aload 4
      // 203: bipush 4
      // 204: invokevirtual java/util/Random.nextInt (I)I
      // 207: iload 7
      // 209: ifne 22d
      // 20c: goto 213
      // 20f: invokestatic wuo.a (Loov;)Loov;
      // 212: athrow
      // 213: ifne 228
      // 216: goto 21d
      // 219: invokestatic wuo.a (Loov;)Loov;
      // 21c: athrow
      // 21d: aload 1
      // 21e: aload 2
      // 21f: invokevirtual t9d.i6x (Lmew;)Z
      // 222: pop
      // 223: return
      // 224: invokestatic wuo.a (Loov;)Loov;
      // 227: athrow
      // 228: aload 1
      // 229: aload 2
      // 22a: invokevirtual t9d.u_f (Lmew;)Z
      // 22d: istore 11
      // 22f: bipush 0
      // 230: istore 12
      // 232: iload 11
      // 234: iload 7
      // 236: ifne 2ba
      // 239: ifeq 247
      // 23c: goto 243
      // 23f: invokestatic wuo.a (Loov;)Loov;
      // 242: athrow
      // 243: bipush -50
      // 245: istore 12
      // 247: aload 0
      // 248: aload 1
      // 249: aload 2
      // 24a: invokevirtual mew.o_8 ()Lmew;
      // 24d: sipush 300
      // 250: iload 12
      // 252: iadd
      // 253: aload 4
      // 255: iload 10
      // 257: invokespecial wuo.yak (Lt9d;Lmew;ILjava/util/Random;I)V
      // 25a: aload 0
      // 25b: aload 1
      // 25c: aload 2
      // 25d: invokevirtual mew.y8e ()Lmew;
      // 260: sipush 300
      // 263: iload 12
      // 265: iadd
      // 266: aload 4
      // 268: iload 10
      // 26a: invokespecial wuo.yak (Lt9d;Lmew;ILjava/util/Random;I)V
      // 26d: aload 0
      // 26e: aload 1
      // 26f: aload 2
      // 270: invokevirtual mew.eve ()Lmew;
      // 273: sipush 250
      // 276: iload 12
      // 278: iadd
      // 279: aload 4
      // 27b: iload 10
      // 27d: invokespecial wuo.yak (Lt9d;Lmew;ILjava/util/Random;I)V
      // 280: aload 0
      // 281: aload 1
      // 282: aload 2
      // 283: invokevirtual mew.nuv ()Lmew;
      // 286: sipush 250
      // 289: iload 12
      // 28b: iadd
      // 28c: aload 4
      // 28e: iload 10
      // 290: invokespecial wuo.yak (Lt9d;Lmew;ILjava/util/Random;I)V
      // 293: aload 0
      // 294: aload 1
      // 295: aload 2
      // 296: invokevirtual mew.idu ()Lmew;
      // 299: sipush 300
      // 29c: iload 12
      // 29e: iadd
      // 29f: aload 4
      // 2a1: iload 10
      // 2a3: invokespecial wuo.yak (Lt9d;Lmew;ILjava/util/Random;I)V
      // 2a6: aload 0
      // 2a7: aload 1
      // 2a8: aload 2
      // 2a9: invokevirtual mew.z6x ()Lmew;
      // 2ac: sipush 300
      // 2af: iload 12
      // 2b1: iadd
      // 2b2: aload 4
      // 2b4: iload 10
      // 2b6: invokespecial wuo.yak (Lt9d;Lmew;ILjava/util/Random;I)V
      // 2b9: bipush -1
      // 2ba: istore 13
      // 2bc: iload 13
      // 2be: bipush 1
      // 2bf: if_icmpgt 45d
      // 2c2: bipush -1
      // 2c3: istore 14
      // 2c5: iload 14
      // 2c7: bipush 1
      // 2c8: if_icmpgt 455
      // 2cb: bipush -1
      // 2cc: iload 7
      // 2ce: ifne 2be
      // 2d1: istore 15
      // 2d3: iload 15
      // 2d5: bipush 4
      // 2d6: if_icmpgt 44d
      // 2d9: iload 13
      // 2db: iload 7
      // 2dd: ifne 2c7
      // 2e0: iload 7
      // 2e2: ifne 321
      // 2e5: ifne 31f
      // 2e8: goto 2ef
      // 2eb: invokestatic wuo.a (Loov;)Loov;
      // 2ee: athrow
      // 2ef: iload 15
      // 2f1: iload 7
      // 2f3: ifne 321
      // 2f6: goto 2fd
      // 2f9: invokestatic wuo.a (Loov;)Loov;
      // 2fc: athrow
      // 2fd: ifne 31f
      // 300: goto 307
      // 303: invokestatic wuo.a (Loov;)Loov;
      // 306: athrow
      // 307: iload 14
      // 309: iload 7
      // 30b: ifne 321
      // 30e: goto 315
      // 311: invokestatic wuo.a (Loov;)Loov;
      // 314: athrow
      // 315: ifeq 445
      // 318: goto 31f
      // 31b: invokestatic wuo.a (Loov;)Loov;
      // 31e: athrow
      // 31f: bipush 100
      // 321: istore 16
      // 323: iload 15
      // 325: bipush 1
      // 326: iload 7
      // 328: ifne 345
      // 32b: if_icmple 348
      // 32e: goto 335
      // 331: invokestatic wuo.a (Loov;)Loov;
      // 334: athrow
      // 335: iload 16
      // 337: iload 15
      // 339: bipush 1
      // 33a: isub
      // 33b: bipush 100
      // 33d: imul
      // 33e: goto 345
      // 341: invokestatic wuo.a (Loov;)Loov;
      // 344: athrow
      // 345: iadd
      // 346: istore 16
      // 348: aload 2
      // 349: iload 13
      // 34b: iload 15
      // 34d: iload 14
      // 34f: invokevirtual mew.ec4 (III)Lmew;
      // 352: astore 17
      // 354: aload 0
      // 355: aload 1
      // 356: aload 17
      // 358: invokespecial wuo.qhe (Lt9d;Lmew;)I
      // 35b: istore 18
      // 35d: iload 7
      // 35f: ifne 448
      // 362: iload 18
      // 364: ifle 445
      // 367: goto 36e
      // 36a: invokestatic wuo.a (Loov;)Loov;
      // 36d: athrow
      // 36e: iload 18
      // 370: bipush 40
      // 372: iadd
      // 373: aload 1
      // 374: invokevirtual t9d.rbk ()Lv66;
      // 377: invokevirtual v66.dzc ()I
      // 37a: bipush 7
      // 37c: imul
      // 37d: iadd
      // 37e: iload 10
      // 380: bipush 30
      // 382: iadd
      // 383: idiv
      // 384: istore 19
      // 386: iload 11
      // 388: iload 7
      // 38a: ifne 39f
      // 38d: ifeq 39d
      // 390: goto 397
      // 393: invokestatic wuo.a (Loov;)Loov;
      // 396: athrow
      // 397: iload 19
      // 399: bipush 2
      // 39a: idiv
      // 39b: istore 19
      // 39d: iload 19
      // 39f: iload 7
      // 3a1: ifne 3bc
      // 3a4: ifle 445
      // 3a7: goto 3ae
      // 3aa: invokestatic wuo.a (Loov;)Loov;
      // 3ad: athrow
      // 3ae: aload 4
      // 3b0: iload 16
      // 3b2: invokevirtual java/util/Random.nextInt (I)I
      // 3b5: goto 3bc
      // 3b8: invokestatic wuo.a (Loov;)Loov;
      // 3bb: athrow
      // 3bc: iload 7
      // 3be: ifne 3d8
      // 3c1: iload 19
      // 3c3: if_icmpgt 445
      // 3c6: goto 3cd
      // 3c9: invokestatic wuo.a (Loov;)Loov;
      // 3cc: athrow
      // 3cd: aload 1
      // 3ce: invokevirtual t9d.xqu ()Z
      // 3d1: goto 3d8
      // 3d4: invokestatic wuo.a (Loov;)Loov;
      // 3d7: athrow
      // 3d8: iload 7
      // 3da: ifne 416
      // 3dd: ifeq 404
      // 3e0: goto 3e7
      // 3e3: invokestatic wuo.a (Loov;)Loov;
      // 3e6: athrow
      // 3e7: aload 0
      // 3e8: aload 1
      // 3e9: aload 17
      // 3eb: invokevirtual wuo.blx (Lt9d;Lmew;)Z
      // 3ee: iload 7
      // 3f0: ifne 416
      // 3f3: goto 3fa
      // 3f6: invokestatic wuo.a (Loov;)Loov;
      // 3f9: athrow
      // 3fa: ifne 445
      // 3fd: goto 404
      // 400: invokestatic wuo.a (Loov;)Loov;
      // 403: athrow
      // 404: iload 10
      // 406: aload 4
      // 408: bipush 5
      // 409: invokevirtual java/util/Random.nextInt (I)I
      // 40c: bipush 4
      // 40d: idiv
      // 40e: iadd
      // 40f: goto 416
      // 412: invokestatic wuo.a (Loov;)Loov;
      // 415: athrow
      // 416: istore 20
      // 418: iload 20
      // 41a: iload 7
      // 41c: ifne 444
      // 41f: bipush 15
      // 421: if_icmple 42f
      // 424: goto 42b
      // 427: invokestatic wuo.a (Loov;)Loov;
      // 42a: athrow
      // 42b: bipush 15
      // 42d: istore 20
      // 42f: aload 1
      // 430: aload 17
      // 432: aload 3
      // 433: getstatic wuo.bjk L_ku;
      // 436: iload 20
      // 438: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 43b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 440: bipush 3
      // 441: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 444: pop
      // 445: iinc 15 1
      // 448: iload 7
      // 44a: ifeq 2d3
      // 44d: iinc 14 1
      // 450: iload 7
      // 452: ifeq 2c5
      // 455: iinc 13 1
      // 458: iload 7
      // 45a: ifeq 2bc
      // 45d: return
   }

   public boolean blx(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual t9d.eyz (Lmew;)Z
      // 09: iload 3
      // 0a: ifne 8c
      // 0d: ifne 8b
      // 10: goto 17
      // 13: invokestatic wuo.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: aload 2
      // 19: invokevirtual mew.y8e ()Lmew;
      // 1c: invokevirtual t9d.eyz (Lmew;)Z
      // 1f: iload 3
      // 20: ifne 8c
      // 23: goto 2a
      // 26: invokestatic wuo.a (Loov;)Loov;
      // 29: athrow
      // 2a: ifne 8b
      // 2d: goto 34
      // 30: invokestatic wuo.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: aload 2
      // 36: invokevirtual mew.o_8 ()Lmew;
      // 39: invokevirtual t9d.eyz (Lmew;)Z
      // 3c: iload 3
      // 3d: ifne 8c
      // 40: goto 47
      // 43: invokestatic wuo.a (Loov;)Loov;
      // 46: athrow
      // 47: ifne 8b
      // 4a: goto 51
      // 4d: invokestatic wuo.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 1
      // 52: aload 2
      // 53: invokevirtual mew.idu ()Lmew;
      // 56: invokevirtual t9d.eyz (Lmew;)Z
      // 59: iload 3
      // 5a: ifne 8c
      // 5d: goto 64
      // 60: invokestatic wuo.a (Loov;)Loov;
      // 63: athrow
      // 64: ifne 8b
      // 67: goto 6e
      // 6a: invokestatic wuo.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 1
      // 6f: aload 2
      // 70: invokevirtual mew.z6x ()Lmew;
      // 73: invokevirtual t9d.eyz (Lmew;)Z
      // 76: iload 3
      // 77: ifne 8c
      // 7a: goto 81
      // 7d: invokestatic wuo.a (Loov;)Loov;
      // 80: athrow
      // 81: ifeq 8f
      // 84: goto 8b
      // 87: invokestatic wuo.a (Loov;)Loov;
      // 8a: athrow
      // 8b: bipush 1
      // 8c: goto 90
      // 8f: bipush 0
      // 90: ireturn
   }

   @Override
   public boolean jsj() {
      return false;
   }

   private int f55(e0x param1) {
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
      // 05: getfield wuo.ot9 Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast java/lang/Integer
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 2a
      // 17: ifnonnull 29
      // 1a: goto 21
      // 1d: invokestatic wuo.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: goto 2d
      // 25: invokestatic wuo.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 3
      // 2a: invokevirtual java/lang/Integer.intValue ()I
      // 2d: ireturn
   }

   private int n42(e0x param1) {
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
      // 05: getfield wuo.v7k Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e: checkcast java/lang/Integer
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifeq 2a
      // 17: ifnonnull 29
      // 1a: goto 21
      // 1d: invokestatic wuo.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: goto 2d
      // 25: invokestatic wuo.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 3
      // 2a: invokevirtual java/lang/Integer.intValue ()I
      // 2d: ireturn
   }

   private void yak(t9d param1, mew param2, int param3, Random param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b: invokeinterface zfz.r_y ()Le0x; 1
      // 10: invokespecial wuo.f55 (Le0x;)I
      // 13: istore 7
      // 15: aload 4
      // 17: iload 3
      // 18: invokevirtual java/util/Random.nextInt (I)I
      // 1b: iload 7
      // 1d: if_icmpge e0
      // 20: aload 1
      // 21: aload 2
      // 22: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 25: astore 8
      // 27: aload 4
      // 29: iload 5
      // 2b: bipush 10
      // 2d: iadd
      // 2e: invokevirtual java/util/Random.nextInt (I)I
      // 31: iload 6
      // 33: ifeq a9
      // 36: bipush 5
      // 37: if_icmpge 9d
      // 3a: goto 41
      // 3d: invokestatic wuo.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 1
      // 42: aload 2
      // 43: invokevirtual t9d.eyz (Lmew;)Z
      // 46: iload 6
      // 48: ifeq a9
      // 4b: goto 52
      // 4e: invokestatic wuo.a (Loov;)Loov;
      // 51: athrow
      // 52: ifne 9d
      // 55: goto 5c
      // 58: invokestatic wuo.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 5
      // 5e: aload 4
      // 60: bipush 5
      // 61: invokevirtual java/util/Random.nextInt (I)I
      // 64: bipush 4
      // 65: idiv
      // 66: iadd
      // 67: istore 9
      // 69: iload 9
      // 6b: iload 6
      // 6d: ifeq 97
      // 70: bipush 15
      // 72: if_icmple 80
      // 75: goto 7c
      // 78: invokestatic wuo.a (Loov;)Loov;
      // 7b: athrow
      // 7c: bipush 15
      // 7e: istore 9
      // 80: aload 1
      // 81: aload 2
      // 82: aload 0
      // 83: invokevirtual wuo.l4i ()Lzfz;
      // 86: getstatic wuo.bjk L_ku;
      // 89: iload 9
      // 8b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 93: bipush 3
      // 94: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 97: pop
      // 98: iload 6
      // 9a: ifne aa
      // 9d: aload 1
      // 9e: aload 2
      // 9f: invokevirtual t9d.i6x (Lmew;)Z
      // a2: goto a9
      // a5: invokestatic wuo.a (Loov;)Loov;
      // a8: athrow
      // a9: pop
      // aa: aload 8
      // ac: invokeinterface zfz.r_y ()Le0x; 1
      // b1: iload 6
      // b3: ifeq cd
      // b6: getstatic ox_.od1 Le0x;
      // b9: if_acmpne e0
      // bc: goto c3
      // bf: invokestatic wuo.a (Loov;)Loov;
      // c2: athrow
      // c3: getstatic ox_.od1 Le0x;
      // c6: goto cd
      // c9: invokestatic wuo.a (Loov;)Loov;
      // cc: athrow
      // cd: aload 1
      // ce: aload 2
      // cf: aload 8
      // d1: getstatic nsh.efs Lh76;
      // d4: bipush 1
      // d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // d8: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // dd: invokevirtual e0x.bf0 (Lt9d;Lmew;Lzfz;)V
      // e0: return
   }

   private boolean g9g(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic vt2.values ()[Lvt2;
      // 03: astore 4
      // 05: aload 4
      // 07: arraylength
      // 08: istore 5
      // 0a: invokestatic t9d.b ()I
      // 0d: bipush 0
      // 0e: istore 6
      // 10: istore 3
      // 11: iload 6
      // 13: iload 5
      // 15: if_icmpge 50
      // 18: aload 4
      // 1a: iload 6
      // 1c: aaload
      // 1d: astore 7
      // 1f: iload 3
      // 20: ifeq 4c
      // 23: aload 0
      // 24: aload 1
      // 25: aload 2
      // 26: aload 7
      // 28: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2b: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 2e: iload 3
      // 2f: ifeq 51
      // 32: goto 39
      // 35: invokestatic wuo.a (Loov;)Loov;
      // 38: athrow
      // 39: ifeq 49
      // 3c: goto 43
      // 3f: invokestatic wuo.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 1
      // 44: ireturn
      // 45: invokestatic wuo.a (Loov;)Loov;
      // 48: athrow
      // 49: iinc 6 1
      // 4c: iload 3
      // 4d: ifne 11
      // 50: bipush 0
      // 51: ireturn
   }

   private int qhe(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 09: iload 3
      // 0a: ifeq 1e
      // 0d: ifne 1d
      // 10: goto 17
      // 13: invokestatic wuo.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic wuo.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: istore 4
      // 20: invokestatic vt2.values ()[Lvt2;
      // 23: astore 5
      // 25: aload 5
      // 27: arraylength
      // 28: istore 6
      // 2a: bipush 0
      // 2b: istore 7
      // 2d: iload 7
      // 2f: iload 6
      // 31: if_icmpge 60
      // 34: aload 5
      // 36: iload 7
      // 38: aaload
      // 39: astore 8
      // 3b: aload 0
      // 3c: aload 1
      // 3d: aload 2
      // 3e: aload 8
      // 40: invokevirtual mew.offset (Lvt2;)Lmew;
      // 43: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 46: invokeinterface zfz.r_y ()Le0x; 1
      // 4b: invokespecial wuo.n42 (Le0x;)I
      // 4e: iload 4
      // 50: invokestatic java/lang/Math.max (II)I
      // 53: iload 3
      // 54: ifeq 62
      // 57: istore 4
      // 59: iinc 7 1
      // 5c: iload 3
      // 5d: ifne 2d
      // 60: iload 4
      // 62: ireturn
   }

   @Override
   public boolean siy() {
      return false;
   }

   public boolean zf1(m5n var1, mew var2) {
      int var3 = t9d.b();

      try {
         int var10000 = this.n42(var1.getBlockState(var2).r_y());
         if (var3 == 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   @Override
   public boolean ctq(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual mew.eve ()Lmew;
      // 09: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 0c: iload 3
      // 0d: ifne 36
      // 10: ifne 35
      // 13: goto 1a
      // 16: invokestatic wuo.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: aload 2
      // 1d: invokespecial wuo.g9g (Lt9d;Lmew;)Z
      // 20: iload 3
      // 21: ifne 36
      // 24: goto 2b
      // 27: invokestatic wuo.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifeq 39
      // 2e: goto 35
      // 31: invokestatic wuo.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual mew.eve ()Lmew;
      // 0a: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 0d: iload 5
      // 0f: ifeq 29
      // 12: ifne 45
      // 15: goto 1c
      // 18: invokestatic wuo.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 2
      // 1f: invokespecial wuo.g9g (Lt9d;Lmew;)Z
      // 22: goto 29
      // 25: invokestatic wuo.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 5
      // 2b: ifeq 44
      // 2e: ifne 45
      // 31: goto 38
      // 34: invokestatic wuo.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: aload 2
      // 3a: invokevirtual t9d.i6x (Lmew;)Z
      // 3d: goto 44
      // 40: invokestatic wuo.a (Loov;)Loov;
      // 43: athrow
      // 44: pop
      // 45: return
   }

   @Override
   public void tfc(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getfield t9d.vzz Lupn;
      // 09: invokevirtual upn.gs_ ()I
      // 0c: iload 4
      // 0e: ifne 54
      // 11: ifgt 39
      // 14: goto 1b
      // 17: invokestatic wuo.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic ox_.mly Luw1;
      // 1e: aload 1
      // 1f: aload 2
      // 20: invokevirtual uw1.pfb (Lt9d;Lmew;)Z
      // 23: iload 4
      // 25: ifne 54
      // 28: goto 2f
      // 2b: invokestatic wuo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifne a1
      // 32: goto 39
      // 35: invokestatic wuo.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: aload 2
      // 3b: invokevirtual mew.eve ()Lmew;
      // 3e: iload 4
      // 40: ifne 8e
      // 43: goto 4a
      // 46: invokestatic wuo.a (Loov;)Loov;
      // 49: athrow
      // 4a: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 4d: goto 54
      // 50: invokestatic wuo.a (Loov;)Loov;
      // 53: athrow
      // 54: ifne 85
      // 57: aload 0
      // 58: aload 1
      // 59: aload 2
      // 5a: invokespecial wuo.g9g (Lt9d;Lmew;)Z
      // 5d: iload 4
      // 5f: ifne 7f
      // 62: goto 69
      // 65: invokestatic wuo.a (Loov;)Loov;
      // 68: athrow
      // 69: ifne 85
      // 6c: goto 73
      // 6f: invokestatic wuo.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 1
      // 74: aload 2
      // 75: invokevirtual t9d.i6x (Lmew;)Z
      // 78: goto 7f
      // 7b: invokestatic wuo.a (Loov;)Loov;
      // 7e: athrow
      // 7f: pop
      // 80: iload 4
      // 82: ifeq a1
      // 85: aload 1
      // 86: aload 2
      // 87: goto 8e
      // 8a: invokestatic wuo.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: aload 0
      // 90: aload 1
      // 91: invokevirtual wuo.odp (Lt9d;)I
      // 94: aload 1
      // 95: getfield t9d.fsy Ljava/util/Random;
      // 98: bipush 10
      // 9a: invokevirtual java/util/Random.nextInt (I)I
      // 9d: iadd
      // 9e: invokevirtual t9d.cjk (Lmew;Le0x;I)V
      // a1: return
   }

   @Override
   public void kyo(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wuo.b J
      // 003: ldc2_w 85611203430155
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.b ()I
      // 00c: istore 7
      // 00e: aload 4
      // 010: bipush 24
      // 012: invokevirtual java/util/Random.nextInt (I)I
      // 015: iload 7
      // 017: ifeq 079
      // 01a: ifne 071
      // 01d: goto 024
      // 020: invokestatic wuo.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 1
      // 025: aload 2
      // 026: invokevirtual mew.getX ()I
      // 029: i2f
      // 02a: ldc 0.5
      // 02c: nop
      // 02d: fadd
      // 02e: f2d
      // 02f: aload 2
      // 030: invokevirtual mew.getY ()I
      // 033: i2f
      // 034: ldc 0.5
      // 036: nop
      // 037: fadd
      // 038: f2d
      // 039: aload 2
      // 03a: invokevirtual mew.getZ ()I
      // 03d: i2f
      // 03e: ldc 0.5
      // 040: nop
      // 041: fadd
      // 042: f2d
      // 043: sipush 21057
      // 046: ldc2_w 2578622420172996728
      // 049: lload 5
      // 04b: lxor
      // 04c: invokedynamic b (IJ)Ljava/lang/String; bsm=wuo.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: nop
      // 052: fconst_1
      // 053: aload 4
      // 055: invokevirtual java/util/Random.nextFloat ()F
      // 058: fadd
      // 059: aload 4
      // 05b: invokevirtual java/util/Random.nextFloat ()F
      // 05e: ldc 0.7
      // 060: nop
      // 061: fmul
      // 062: ldc 0.3
      // 064: nop
      // 065: fadd
      // 066: bipush 0
      // 067: invokevirtual t9d.wd_ (DDDLjava/lang/String;FFZ)V
      // 06a: goto 071
      // 06d: invokestatic wuo.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 1
      // 072: aload 2
      // 073: invokevirtual mew.eve ()Lmew;
      // 076: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 079: iload 7
      // 07b: ifeq 30c
      // 07e: ifne 304
      // 081: goto 088
      // 084: invokestatic wuo.a (Loov;)Loov;
      // 087: athrow
      // 088: getstatic ox_._0u Lwuo;
      // 08b: aload 1
      // 08c: aload 2
      // 08d: invokevirtual mew.eve ()Lmew;
      // 090: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 093: iload 7
      // 095: ifeq 30c
      // 098: goto 09f
      // 09b: invokestatic wuo.a (Loov;)Loov;
      // 09e: athrow
      // 09f: ifne 304
      // 0a2: goto 0a9
      // 0a5: invokestatic wuo.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: getstatic ox_._0u Lwuo;
      // 0ac: aload 1
      // 0ad: aload 2
      // 0ae: invokevirtual mew.y8e ()Lmew;
      // 0b1: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 0b4: iload 7
      // 0b6: ifeq 130
      // 0b9: goto 0c0
      // 0bc: invokestatic wuo.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: ifeq 125
      // 0c3: goto 0ca
      // 0c6: invokestatic wuo.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: bipush 0
      // 0cb: istore 8
      // 0cd: iload 8
      // 0cf: bipush 2
      // 0d0: if_icmpge 125
      // 0d3: aload 2
      // 0d4: invokevirtual mew.getX ()I
      // 0d7: i2d
      // 0d8: aload 4
      // 0da: invokevirtual java/util/Random.nextDouble ()D
      // 0dd: ldc2_w 0.10000000149011612
      // 0e0: dmul
      // 0e1: dadd
      // 0e2: dstore 9
      // 0e4: aload 2
      // 0e5: invokevirtual mew.getY ()I
      // 0e8: i2d
      // 0e9: aload 4
      // 0eb: invokevirtual java/util/Random.nextDouble ()D
      // 0ee: dadd
      // 0ef: dstore 11
      // 0f1: aload 2
      // 0f2: invokevirtual mew.getZ ()I
      // 0f5: i2d
      // 0f6: aload 4
      // 0f8: invokevirtual java/util/Random.nextDouble ()D
      // 0fb: dadd
      // 0fc: dstore 13
      // 0fe: aload 1
      // 0ff: getstatic w_0.vby Lw_0;
      // 102: dload 9
      // 104: dload 11
      // 106: dload 13
      // 108: dconst_0
      // 109: dconst_0
      // 10a: dconst_0
      // 10b: bipush 0
      // 10c: newarray 10
      // 10e: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 111: iinc 8 1
      // 114: iload 7
      // 116: ifeq 19c
      // 119: iload 7
      // 11b: ifne 0cd
      // 11e: goto 125
      // 121: invokestatic wuo.a (Loov;)Loov;
      // 124: athrow
      // 125: getstatic ox_._0u Lwuo;
      // 128: aload 1
      // 129: aload 2
      // 12a: invokevirtual mew.o_8 ()Lmew;
      // 12d: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 130: iload 7
      // 132: ifeq 1a7
      // 135: ifeq 19c
      // 138: goto 13f
      // 13b: invokestatic wuo.a (Loov;)Loov;
      // 13e: athrow
      // 13f: bipush 0
      // 140: istore 8
      // 142: iload 8
      // 144: bipush 2
      // 145: if_icmpge 19c
      // 148: aload 2
      // 149: invokevirtual mew.getX ()I
      // 14c: bipush 1
      // 14d: iadd
      // 14e: i2d
      // 14f: aload 4
      // 151: invokevirtual java/util/Random.nextDouble ()D
      // 154: ldc2_w 0.10000000149011612
      // 157: dmul
      // 158: dsub
      // 159: dstore 9
      // 15b: aload 2
      // 15c: invokevirtual mew.getY ()I
      // 15f: i2d
      // 160: aload 4
      // 162: invokevirtual java/util/Random.nextDouble ()D
      // 165: dadd
      // 166: dstore 11
      // 168: aload 2
      // 169: invokevirtual mew.getZ ()I
      // 16c: i2d
      // 16d: aload 4
      // 16f: invokevirtual java/util/Random.nextDouble ()D
      // 172: dadd
      // 173: dstore 13
      // 175: aload 1
      // 176: getstatic w_0.vby Lw_0;
      // 179: dload 9
      // 17b: dload 11
      // 17d: dload 13
      // 17f: dconst_0
      // 180: dconst_0
      // 181: dconst_0
      // 182: bipush 0
      // 183: newarray 10
      // 185: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 188: iinc 8 1
      // 18b: iload 7
      // 18d: ifeq 211
      // 190: iload 7
      // 192: ifne 142
      // 195: goto 19c
      // 198: invokestatic wuo.a (Loov;)Loov;
      // 19b: athrow
      // 19c: getstatic ox_._0u Lwuo;
      // 19f: aload 1
      // 1a0: aload 2
      // 1a1: invokevirtual mew.idu ()Lmew;
      // 1a4: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 1a7: iload 7
      // 1a9: ifeq 21c
      // 1ac: ifeq 211
      // 1af: goto 1b6
      // 1b2: invokestatic wuo.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: bipush 0
      // 1b7: istore 8
      // 1b9: iload 8
      // 1bb: bipush 2
      // 1bc: if_icmpge 211
      // 1bf: aload 2
      // 1c0: invokevirtual mew.getX ()I
      // 1c3: i2d
      // 1c4: aload 4
      // 1c6: invokevirtual java/util/Random.nextDouble ()D
      // 1c9: dadd
      // 1ca: dstore 9
      // 1cc: aload 2
      // 1cd: invokevirtual mew.getY ()I
      // 1d0: i2d
      // 1d1: aload 4
      // 1d3: invokevirtual java/util/Random.nextDouble ()D
      // 1d6: dadd
      // 1d7: dstore 11
      // 1d9: aload 2
      // 1da: invokevirtual mew.getZ ()I
      // 1dd: i2d
      // 1de: aload 4
      // 1e0: invokevirtual java/util/Random.nextDouble ()D
      // 1e3: ldc2_w 0.10000000149011612
      // 1e6: dmul
      // 1e7: dadd
      // 1e8: dstore 13
      // 1ea: aload 1
      // 1eb: getstatic w_0.vby Lw_0;
      // 1ee: dload 9
      // 1f0: dload 11
      // 1f2: dload 13
      // 1f4: dconst_0
      // 1f5: dconst_0
      // 1f6: dconst_0
      // 1f7: bipush 0
      // 1f8: newarray 10
      // 1fa: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 1fd: iinc 8 1
      // 200: iload 7
      // 202: ifeq 288
      // 205: iload 7
      // 207: ifne 1b9
      // 20a: goto 211
      // 20d: invokestatic wuo.a (Loov;)Loov;
      // 210: athrow
      // 211: getstatic ox_._0u Lwuo;
      // 214: aload 1
      // 215: aload 2
      // 216: invokevirtual mew.z6x ()Lmew;
      // 219: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 21c: iload 7
      // 21e: ifeq 293
      // 221: ifeq 288
      // 224: goto 22b
      // 227: invokestatic wuo.a (Loov;)Loov;
      // 22a: athrow
      // 22b: bipush 0
      // 22c: istore 8
      // 22e: iload 8
      // 230: bipush 2
      // 231: if_icmpge 288
      // 234: aload 2
      // 235: invokevirtual mew.getX ()I
      // 238: i2d
      // 239: aload 4
      // 23b: invokevirtual java/util/Random.nextDouble ()D
      // 23e: dadd
      // 23f: dstore 9
      // 241: aload 2
      // 242: invokevirtual mew.getY ()I
      // 245: i2d
      // 246: aload 4
      // 248: invokevirtual java/util/Random.nextDouble ()D
      // 24b: dadd
      // 24c: dstore 11
      // 24e: aload 2
      // 24f: invokevirtual mew.getZ ()I
      // 252: bipush 1
      // 253: iadd
      // 254: i2d
      // 255: aload 4
      // 257: invokevirtual java/util/Random.nextDouble ()D
      // 25a: ldc2_w 0.10000000149011612
      // 25d: dmul
      // 25e: dsub
      // 25f: dstore 13
      // 261: aload 1
      // 262: getstatic w_0.vby Lw_0;
      // 265: dload 9
      // 267: dload 11
      // 269: dload 13
      // 26b: dconst_0
      // 26c: dconst_0
      // 26d: dconst_0
      // 26e: bipush 0
      // 26f: newarray 10
      // 271: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 274: iinc 8 1
      // 277: iload 7
      // 279: ifeq 35e
      // 27c: iload 7
      // 27e: ifne 22e
      // 281: goto 288
      // 284: invokestatic wuo.a (Loov;)Loov;
      // 287: athrow
      // 288: getstatic ox_._0u Lwuo;
      // 28b: aload 1
      // 28c: aload 2
      // 28d: invokevirtual mew.nuv ()Lmew;
      // 290: invokevirtual wuo.zf1 (Lm5n;Lmew;)Z
      // 293: iload 7
      // 295: ifeq 2a3
      // 298: ifeq 35e
      // 29b: goto 2a2
      // 29e: invokestatic wuo.a (Loov;)Loov;
      // 2a1: athrow
      // 2a2: bipush 0
      // 2a3: istore 8
      // 2a5: iload 8
      // 2a7: bipush 2
      // 2a8: if_icmpge 2ff
      // 2ab: aload 2
      // 2ac: invokevirtual mew.getX ()I
      // 2af: i2d
      // 2b0: aload 4
      // 2b2: invokevirtual java/util/Random.nextDouble ()D
      // 2b5: dadd
      // 2b6: dstore 9
      // 2b8: aload 2
      // 2b9: invokevirtual mew.getY ()I
      // 2bc: bipush 1
      // 2bd: iadd
      // 2be: i2d
      // 2bf: aload 4
      // 2c1: invokevirtual java/util/Random.nextDouble ()D
      // 2c4: ldc2_w 0.10000000149011612
      // 2c7: dmul
      // 2c8: dsub
      // 2c9: dstore 11
      // 2cb: aload 2
      // 2cc: invokevirtual mew.getZ ()I
      // 2cf: i2d
      // 2d0: aload 4
      // 2d2: invokevirtual java/util/Random.nextDouble ()D
      // 2d5: dadd
      // 2d6: dstore 13
      // 2d8: aload 1
      // 2d9: getstatic w_0.vby Lw_0;
      // 2dc: dload 9
      // 2de: dload 11
      // 2e0: dload 13
      // 2e2: dconst_0
      // 2e3: dconst_0
      // 2e4: dconst_0
      // 2e5: bipush 0
      // 2e6: newarray 10
      // 2e8: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 2eb: iinc 8 1
      // 2ee: iload 7
      // 2f0: ifeq 35e
      // 2f3: iload 7
      // 2f5: ifne 2a5
      // 2f8: goto 2ff
      // 2fb: invokestatic wuo.a (Loov;)Loov;
      // 2fe: athrow
      // 2ff: iload 7
      // 301: ifne 35e
      // 304: bipush 0
      // 305: goto 30c
      // 308: invokestatic wuo.a (Loov;)Loov;
      // 30b: athrow
      // 30c: istore 8
      // 30e: iload 8
      // 310: bipush 3
      // 311: if_icmpge 35e
      // 314: aload 2
      // 315: invokevirtual mew.getX ()I
      // 318: i2d
      // 319: aload 4
      // 31b: invokevirtual java/util/Random.nextDouble ()D
      // 31e: dadd
      // 31f: dstore 9
      // 321: aload 2
      // 322: invokevirtual mew.getY ()I
      // 325: i2d
      // 326: aload 4
      // 328: invokevirtual java/util/Random.nextDouble ()D
      // 32b: ldc2_w 0.5
      // 32e: dmul
      // 32f: dadd
      // 330: ldc2_w 0.5
      // 333: dadd
      // 334: dstore 11
      // 336: aload 2
      // 337: invokevirtual mew.getZ ()I
      // 33a: i2d
      // 33b: aload 4
      // 33d: invokevirtual java/util/Random.nextDouble ()D
      // 340: dadd
      // 341: dstore 13
      // 343: aload 1
      // 344: getstatic w_0.vby Lw_0;
      // 347: dload 9
      // 349: dload 11
      // 34b: dload 13
      // 34d: dconst_0
      // 34e: dconst_0
      // 34f: dconst_0
      // 350: bipush 0
      // 351: newarray 10
      // 353: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 356: iinc 8 1
      // 359: iload 7
      // 35b: ifne 30e
      // 35e: return
   }

   @Override
   public _mi uoz(zfz var1) {
      return _mi.e38;
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(bjk, var1);
   }

   @Override
   public int hvp(zfz var1) {
      return (Integer)var1.dil(bjk);
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{bjk, p11, zmn, y87, hh4, _ih, c1c, idr});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4913524036263501305L, -9059988187925526201L, MethodHandles.lookup().lookupClass()).a(118113305989445L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 96672794891003L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "Iú\u0092 Á%ý\u000b\u0091\t²\r\u001b\u009e\u001cÚ ÷ÈÌs·_\u008c\u0014vtEÂ#V\u008fåÕrpãIdnz{/ïµ\u0007µ÷\u0085\u0010ø\u0018Å\u0003\u001bhOàAõ\u0004Ë¿\f\u0019O\u0010(\u0017p\u008bDë¤Õ Ø\u00ad\u001d-\u009a¶^\u0010\u0001f,Æ¤²[à\u009f2ý2\u0006~\u008aì\u0010ÙÆÑ¶1ÿ\u0018<$\u0093%*1\u008e×Ô\u0010H\u000eí-°³wU\u000e\u0096í\u0099\u001cü®m\u0018Á+\t1\u0014É\u0090\u0092\u0015À\u009cµó~\u008f\u0089\u0096ºV÷ÑÈ\u001cÏ";
      int var6 = "Iú\u0092 Á%ý\u000b\u0091\t²\r\u001b\u009e\u001cÚ ÷ÈÌs·_\u008c\u0014vtEÂ#V\u008fåÕrpãIdnz{/ïµ\u0007µ÷\u0085\u0010ø\u0018Å\u0003\u001bhOàAõ\u0004Ë¿\f\u0019O\u0010(\u0017p\u008bDë¤Õ Ø\u00ad\u001d-\u009a¶^\u0010\u0001f,Æ¤²[à\u009f2ý2\u0006~\u008aì\u0010ÙÆÑ¶1ÿ\u0018<$\u0093%*1\u008e×Ô\u0010H\u000eí-°³wU\u000e\u0096í\u0099\u001cü®m\u0018Á+\t1\u0014É\u0090\u0092\u0015À\u009cµó~\u008f\u0089\u0096ºV÷ÑÈ\u001cÏ"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[10];
                     bjk = _ku.wgl(b<"b">(10012, 7958928516097843409L ^ var9), 0, 15);
                     c1c = h76.d_1(b<"b">(16223, 3005550256539449493L ^ var9));
                     idr = h76.d_1(b<"b">(19834, 2361359248492350132L ^ var9));
                     p11 = h76.d_1(b<"b">(9806, 8429540874519912834L ^ var9));
                     zmn = h76.d_1(b<"b">(23312, 5525527434862124246L ^ var9));
                     y87 = h76.d_1(b<"b">(27065, 2275755393991634545L ^ var9));
                     hh4 = h76.d_1(b<"b">(32316, 5089724123651373563L ^ var9));
                     _ih = _ku.wgl(b<"b">(14443, 7831159476675329952L ^ var9), 0, 2);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "õfB®LâReë \u009f\u008f9\u000bdî\u0010\u0095\u009eÜé\u001d\u009d\\Ü7Î6\u0013N¯´\u0097";
                  var6 = "õfB®LâReë \u009f\u008f9\u000bdî\u0010\u0095\u009eÜé\u001d\u009d\\Ü7Î6\u0013N¯´\u0097".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22538;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("wuo", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("wuo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
