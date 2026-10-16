import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S19PacketEntityStatus;
import net.minecraft.network.play.server.S24PacketBlockAction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dug extends t9d implements lg9 {
   private static final Logger qa4;
   private final vr1 s4x;
   private final qpc clb;
   private final ey1 qka;
   private final Set d5o = Sets.newHashSet();
   private final TreeSet js1 = new TreeSet();
   private final Map iqq = Maps.newHashMap();
   public gvi kil;
   public boolean b4a;
   private boolean f65;
   private int d4b;
   private final ooh _kf;
   private final v7y zyw = new v7y();
   public final tvx lxr = new tvx(this);
   private dug$mdz[] ojm = new dug$mdz[]{new dug$mdz(null), new dug$mdz(null)};
   private int egn;
   private static final List hsf;
   private List xa7 = Lists.newArrayList();
   private static final long b;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public dug(vr1 var1, he6 var2, cog var3, int var4, uan var5) {
      super(var2, var3, upn.mkz(var4), var5, false);
      this.s4x = var1;
      this.clb = new qpc(this);
      this.qka = new ey1(this);
      this.vzz.d9i(this);
      this.jro = this.qya();
      this._kf = new ooh(this);
      this.lhz();
      this.td1();
      this.fve().lth(var1.aq4());
   }

   @Override
   public t9d ufh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dug.b J
      // 003: ldc2_w 78186618407329
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: new _ie
      // 00c: dup
      // 00d: aload 0
      // 00e: getfield dug.ujg Lhe6;
      // 011: invokespecial _ie.<init> (Lhe6;)V
      // 014: putfield dug.hqr L_ie;
      // 017: invokestatic t9d.c ()I
      // 01a: aload 0
      // 01b: getfield dug.vzz Lupn;
      // 01e: invokestatic bg8.m28 (Lupn;)Ljava/lang/String;
      // 021: astore 4
      // 023: istore 3
      // 024: aload 0
      // 025: getfield dug.hqr L_ie;
      // 028: ldc bg8
      // 02a: nop
      // 02b: aload 4
      // 02d: invokevirtual _ie.ym5 (Ljava/lang/Class;Ljava/lang/String;)Lwob;
      // 030: checkcast bg8
      // 033: astore 5
      // 035: aload 5
      // 037: iload 3
      // 038: ifne 07a
      // 03b: ifnonnull 069
      // 03e: goto 045
      // 041: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 044: athrow
      // 045: aload 0
      // 046: new bg8
      // 049: dup
      // 04a: aload 0
      // 04b: invokespecial bg8.<init> (Lt9d;)V
      // 04e: putfield dug.sw1 Lbg8;
      // 051: aload 0
      // 052: getfield dug.hqr L_ie;
      // 055: aload 4
      // 057: aload 0
      // 058: getfield dug.sw1 Lbg8;
      // 05b: invokevirtual _ie.vex (Ljava/lang/String;Lwob;)V
      // 05e: iload 3
      // 05f: ifeq 07e
      // 062: goto 069
      // 065: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: aload 0
      // 06a: aload 5
      // 06c: putfield dug.sw1 Lbg8;
      // 06f: aload 0
      // 070: getfield dug.sw1 Lbg8;
      // 073: goto 07a
      // 076: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 0
      // 07b: invokevirtual bg8.kyu (Lt9d;)V
      // 07e: aload 0
      // 07f: new z3y
      // 082: dup
      // 083: aload 0
      // 084: getfield dug.s4x Lvr1;
      // 087: invokespecial z3y.<init> (Lvr1;)V
      // 08a: putfield dug.t7i Luci;
      // 08d: aload 0
      // 08e: getfield dug.hqr L_ie;
      // 091: ldc a16
      // 093: nop
      // 094: sipush 3663
      // 097: ldc2_w 8192151168810001171
      // 09a: lload 1
      // 09b: lxor
      // 09c: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokevirtual _ie.ym5 (Ljava/lang/Class;Ljava/lang/String;)Lwob;
      // 0a5: checkcast a16
      // 0a8: astore 6
      // 0aa: aload 6
      // 0ac: iload 3
      // 0ad: ifne 0dc
      // 0b0: ifnonnull 0da
      // 0b3: goto 0ba
      // 0b6: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: new a16
      // 0bd: dup
      // 0be: invokespecial a16.<init> ()V
      // 0c1: astore 6
      // 0c3: aload 0
      // 0c4: getfield dug.hqr L_ie;
      // 0c7: sipush 2451
      // 0ca: ldc2_w 7646280737648616671
      // 0cd: lload 1
      // 0ce: lxor
      // 0cf: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: nop
      // 0d5: aload 6
      // 0d7: invokevirtual _ie.vex (Ljava/lang/String;Lwob;)V
      // 0da: aload 6
      // 0dc: aload 0
      // 0dd: getfield dug.t7i Luci;
      // 0e0: invokevirtual a16.at3 (Luci;)V
      // 0e3: aload 0
      // 0e4: getfield dug.t7i Luci;
      // 0e7: checkcast z3y
      // 0ea: aload 6
      // 0ec: invokevirtual z3y.wh5 (La16;)V
      // 0ef: aload 0
      // 0f0: invokevirtual dug.fve ()Lw5i;
      // 0f3: aload 0
      // 0f4: getfield dug.t9z Lcog;
      // 0f7: invokevirtual cog.xlo ()D
      // 0fa: aload 0
      // 0fb: getfield dug.t9z Lcog;
      // 0fe: invokevirtual cog.j4s ()D
      // 101: invokevirtual w5i.bfn (DD)V
      // 104: aload 0
      // 105: invokevirtual dug.fve ()Lw5i;
      // 108: aload 0
      // 109: getfield dug.t9z Lcog;
      // 10c: invokevirtual cog.dro ()D
      // 10f: invokevirtual w5i.byt (D)V
      // 112: aload 0
      // 113: invokevirtual dug.fve ()Lw5i;
      // 116: aload 0
      // 117: getfield dug.t9z Lcog;
      // 11a: invokevirtual cog.r7_ ()D
      // 11d: invokevirtual w5i.y4p (D)V
      // 120: aload 0
      // 121: invokevirtual dug.fve ()Lw5i;
      // 124: aload 0
      // 125: getfield dug.t9z Lcog;
      // 128: invokevirtual cog.h9b ()I
      // 12b: invokevirtual w5i.n3z (I)V
      // 12e: aload 0
      // 12f: invokevirtual dug.fve ()Lw5i;
      // 132: aload 0
      // 133: getfield dug.t9z Lcog;
      // 136: invokevirtual cog.huj ()I
      // 139: invokevirtual w5i.ilo (I)V
      // 13c: aload 0
      // 13d: iload 3
      // 13e: ifne 182
      // 141: getfield dug.t9z Lcog;
      // 144: invokevirtual cog.hgc ()J
      // 147: lconst_0
      // 148: lcmp
      // 149: ifle 17a
      // 14c: goto 153
      // 14f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 152: athrow
      // 153: aload 0
      // 154: invokevirtual dug.fve ()Lw5i;
      // 157: aload 0
      // 158: getfield dug.t9z Lcog;
      // 15b: invokevirtual cog.hlq ()D
      // 15e: aload 0
      // 15f: getfield dug.t9z Lcog;
      // 162: invokevirtual cog.fud ()D
      // 165: aload 0
      // 166: getfield dug.t9z Lcog;
      // 169: invokevirtual cog.hgc ()J
      // 16c: invokevirtual w5i._03 (DDJ)V
      // 16f: iload 3
      // 170: ifeq 18f
      // 173: goto 17a
      // 176: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: aload 0
      // 17b: goto 182
      // 17e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: invokevirtual dug.fve ()Lw5i;
      // 185: aload 0
      // 186: getfield dug.t9z Lcog;
      // 189: invokevirtual cog.hlq ()D
      // 18c: invokevirtual w5i.w37 (D)V
      // 18f: aload 0
      // 190: areturn
   }

   @Override
   public void aoj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dug.b J
      // 003: ldc2_w 9083543334119
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial t9d.aoj ()V
      // 010: aload 0
      // 011: invokevirtual dug.r7d ()Lcog;
      // 014: invokevirtual cog.lce ()Z
      // 017: iload 3
      // 018: ifne 060
      // 01b: ifeq 052
      // 01e: goto 025
      // 021: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: aload 0
      // 026: iload 3
      // 027: ifne 05d
      // 02a: goto 031
      // 02d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 030: athrow
      // 031: invokevirtual dug.rbk ()Lv66;
      // 034: getstatic v66.csg Lv66;
      // 037: if_acmpeq 052
      // 03a: goto 041
      // 03d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: aload 0
      // 042: invokevirtual dug.r7d ()Lcog;
      // 045: getstatic v66.csg Lv66;
      // 048: invokevirtual cog.jbe (Lv66;)V
      // 04b: goto 052
      // 04e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 0
      // 053: getfield dug.vzz Lupn;
      // 056: invokevirtual upn.wvm ()Lcdp;
      // 059: invokevirtual cdp.f65 ()V
      // 05c: aload 0
      // 05d: invokevirtual dug.ly4 ()Z
      // 060: iload 3
      // 061: ifne 0e3
      // 064: ifeq 0b9
      // 067: goto 06e
      // 06a: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: aload 0
      // 06f: iload 3
      // 070: ifne 0b6
      // 073: goto 07a
      // 076: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: invokevirtual dug.eir ()Lef9;
      // 07d: sipush 3414
      // 080: ldc2_w 4220811798463595862
      // 083: lload 1
      // 084: lxor
      // 085: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: nop
      // 08b: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 08e: ifeq 0b5
      // 091: goto 098
      // 094: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: aload 0
      // 099: getfield dug.t9z Lcog;
      // 09c: invokevirtual cog.y9w ()J
      // 09f: ldc2_w 24000
      // 0a2: ladd
      // 0a3: lstore 4
      // 0a5: aload 0
      // 0a6: getfield dug.t9z Lcog;
      // 0a9: lload 4
      // 0ab: lload 4
      // 0ad: ldc2_w 24000
      // 0b0: lrem
      // 0b1: lsub
      // 0b2: invokevirtual cog.l5d (J)V
      // 0b5: aload 0
      // 0b6: invokevirtual dug.t4e ()V
      // 0b9: aload 0
      // 0ba: getfield dug.e8t Luan;
      // 0bd: sipush 28164
      // 0c0: ldc2_w 3664957475441059349
      // 0c3: lload 1
      // 0c4: lxor
      // 0c5: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: nop
      // 0cb: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0ce: aload 0
      // 0cf: invokevirtual dug.eir ()Lef9;
      // 0d2: sipush 14560
      // 0d5: ldc2_w 6535519789462483179
      // 0d8: lload 1
      // 0d9: lxor
      // 0da: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0e3: iload 3
      // 0e4: ifne 16c
      // 0e7: ifeq 148
      // 0ea: goto 0f1
      // 0ed: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: iload 3
      // 0f3: ifne 168
      // 0f6: goto 0fd
      // 0f9: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: getfield dug.t9z Lcog;
      // 100: invokevirtual cog.z28 ()Lgxq;
      // 103: getstatic gxq.gl_ Lgxq;
      // 106: if_acmpeq 148
      // 109: goto 110
      // 10c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield dug.zyw Lv7y;
      // 114: aload 0
      // 115: aload 0
      // 116: getfield dug.gwn Z
      // 119: aload 0
      // 11a: getfield dug.wdp Z
      // 11d: aload 0
      // 11e: getfield dug.t9z Lcog;
      // 121: invokevirtual cog.zex ()J
      // 124: ldc2_w 400
      // 127: lrem
      // 128: lconst_0
      // 129: lcmp
      // 12a: iload 3
      // 12b: ifne 140
      // 12e: goto 135
      // 131: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: ifne 143
      // 138: goto 13f
      // 13b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: bipush 1
      // 140: goto 144
      // 143: bipush 0
      // 144: invokevirtual v7y.pkz (Ldug;ZZZ)I
      // 147: pop
      // 148: aload 0
      // 149: getfield dug.e8t Luan;
      // 14c: sipush 16656
      // 14f: ldc2_w 3880037915045824787
      // 152: lload 1
      // 153: lxor
      // 154: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: nop
      // 15a: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 15d: aload 0
      // 15e: getfield dug.jro Lg6k;
      // 161: invokeinterface g6k.p68 ()Z 1
      // 166: pop
      // 167: aload 0
      // 168: fconst_1
      // 169: invokevirtual dug.vvh (F)I
      // 16c: istore 4
      // 16e: iload 4
      // 170: iload 3
      // 171: ifne 1b4
      // 174: aload 0
      // 175: invokevirtual dug.e76 ()I
      // 178: if_icmpeq 18f
      // 17b: goto 182
      // 17e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: aload 0
      // 183: iload 4
      // 185: invokevirtual dug.kc3 (I)V
      // 188: goto 18f
      // 18b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18e: athrow
      // 18f: aload 0
      // 190: getfield dug.t9z Lcog;
      // 193: aload 0
      // 194: getfield dug.t9z Lcog;
      // 197: invokevirtual cog.zex ()J
      // 19a: lconst_1
      // 19b: ladd
      // 19c: invokevirtual cog.ncq (J)V
      // 19f: aload 0
      // 1a0: invokevirtual dug.eir ()Lef9;
      // 1a3: sipush 25591
      // 1a6: ldc2_w 6674273735210478587
      // 1a9: lload 1
      // 1aa: lxor
      // 1ab: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: nop
      // 1b1: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 1b4: iload 3
      // 1b5: ifne 1f3
      // 1b8: ifeq 1d9
      // 1bb: goto 1c2
      // 1be: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: getfield dug.t9z Lcog;
      // 1c6: aload 0
      // 1c7: getfield dug.t9z Lcog;
      // 1ca: invokevirtual cog.y9w ()J
      // 1cd: lconst_1
      // 1ce: ladd
      // 1cf: invokevirtual cog.l5d (J)V
      // 1d2: goto 1d9
      // 1d5: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: getfield dug.e8t Luan;
      // 1dd: sipush 2255
      // 1e0: ldc2_w 4008657949302571202
      // 1e3: lload 1
      // 1e4: lxor
      // 1e5: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: nop
      // 1eb: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 1ee: aload 0
      // 1ef: bipush 0
      // 1f0: invokevirtual dug.ud3 (Z)Z
      // 1f3: pop
      // 1f4: aload 0
      // 1f5: getfield dug.e8t Luan;
      // 1f8: sipush 9216
      // 1fb: ldc2_w 8770045997658893316
      // 1fe: lload 1
      // 1ff: lxor
      // 200: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: nop
      // 206: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 209: aload 0
      // 20a: invokevirtual dug.b1d ()V
      // 20d: aload 0
      // 20e: getfield dug.e8t Luan;
      // 211: sipush 6211
      // 214: ldc2_w 2537478956779262026
      // 217: lload 1
      // 218: lxor
      // 219: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: nop
      // 21f: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 222: aload 0
      // 223: getfield dug.qka Ley1;
      // 226: invokevirtual ey1.d6c ()V
      // 229: aload 0
      // 22a: getfield dug.e8t Luan;
      // 22d: sipush 12781
      // 230: ldc2_w 7160329517858355709
      // 233: lload 1
      // 234: lxor
      // 235: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: nop
      // 23b: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 23e: aload 0
      // 23f: getfield dug.sw1 Lbg8;
      // 242: invokevirtual bg8.o09 ()V
      // 245: aload 0
      // 246: getfield dug.lxr Ltvx;
      // 249: invokevirtual tvx.hid ()V
      // 24c: aload 0
      // 24d: getfield dug.e8t Luan;
      // 250: sipush 20538
      // 253: ldc2_w 1909494436868757557
      // 256: lload 1
      // 257: lxor
      // 258: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: nop
      // 25e: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 261: aload 0
      // 262: getfield dug._kf Looh;
      // 265: aload 0
      // 266: invokevirtual dug.p2b ()J
      // 269: invokevirtual ooh.e0g (J)V
      // 26c: aload 0
      // 26d: getfield dug.e8t Luan;
      // 270: invokevirtual uan.uio ()V
      // 273: aload 0
      // 274: invokespecial dug.hqw ()V
      // 277: return
   }

   public gyu$dwn mso(ek6 var1, mew var2) {
      int var3 = t9d.c();
      List var4 = this.sj7().sbk(var1, var2);

      List var10000;
      label27: {
         try {
            var10000 = var4;
            if (var3 != 0) {
               break label27;
            }

            if (var4 == null) {
               return null;
            }
         } catch (IllegalStateException var6) {
            throw a(var6);
         }

         var10000 = var4;
      }

      try {
         if (!var10000.isEmpty()) {
            return (gyu$dwn)zfj.h82(this.fsy, var4);
         }
      } catch (IllegalStateException var5) {
         throw a(var5);
      }

      return null;
   }

   public boolean kjx(ek6 param1, gyu$dwn param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: invokevirtual dug.sj7 ()Lg6k;
      // 09: aload 1
      // 0a: aload 3
      // 0b: invokeinterface g6k.sbk (Lek6;Lmew;)Ljava/util/List; 3
      // 10: astore 5
      // 12: aload 5
      // 14: iload 4
      // 16: ifne 25
      // 19: ifnull 4b
      // 1c: goto 23
      // 1f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 5
      // 25: invokeinterface java/util/List.isEmpty ()Z 1
      // 2a: iload 4
      // 2c: ifne 48
      // 2f: ifne 4b
      // 32: goto 39
      // 35: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 5
      // 3b: aload 2
      // 3c: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 41: goto 48
      // 44: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: ireturn
   }

   @Override
   public void vz4() {
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
      // 05: bipush 0
      // 06: putfield dug.f65 Z
      // 09: aload 0
      // 0a: getfield dug.rpk Ljava/util/List;
      // 0d: invokeinterface java/util/List.isEmpty ()Z 1
      // 12: iload 1
      // 13: ifeq 21
      // 16: ifne c0
      // 19: goto 20
      // 1c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: bipush 0
      // 21: istore 2
      // 22: bipush 0
      // 23: istore 3
      // 24: aload 0
      // 25: getfield dug.rpk Ljava/util/List;
      // 28: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2d: astore 4
      // 2f: aload 4
      // 31: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 36: ifeq 87
      // 39: aload 4
      // 3b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 40: checkcast ha9
      // 43: astore 5
      // 45: iload 1
      // 46: ifeq c0
      // 49: aload 5
      // 4b: invokevirtual ha9.myu ()Z
      // 4e: iload 1
      // 4f: ifeq 7d
      // 52: goto 59
      // 55: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: ifeq 71
      // 5c: goto 63
      // 5f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: iinc 2 1
      // 66: iload 1
      // 67: ifne 83
      // 6a: goto 71
      // 6d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 5
      // 73: invokevirtual ha9.ofg ()Z
      // 76: goto 7d
      // 79: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: ifeq 83
      // 80: iinc 3 1
      // 83: iload 1
      // 84: ifne 2f
      // 87: aload 0
      // 88: iload 3
      // 89: iload 1
      // 8a: ifeq 98
      // 8d: ifle bc
      // 90: goto 97
      // 93: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 96: athrow
      // 97: iload 3
      // 98: iload 1
      // 99: ifeq b9
      // 9c: aload 0
      // 9d: getfield dug.rpk Ljava/util/List;
      // a0: invokeinterface java/util/List.size ()I 1
      // a5: iload 2
      // a6: isub
      // a7: if_icmplt bc
      // aa: goto b1
      // ad: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: bipush 1
      // b2: goto b9
      // b5: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8: athrow
      // b9: goto bd
      // bc: bipush 0
      // bd: putfield dug.f65 Z
      // c0: return
   }

   public void t4e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: putfield dug.f65 Z
      // 05: invokestatic t9d.b ()I
      // 08: aload 0
      // 09: getfield dug.rpk Ljava/util/List;
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: astore 2
      // 12: istore 1
      // 13: aload 2
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 55
      // 1c: aload 2
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast ha9
      // 25: astore 3
      // 26: iload 1
      // 27: ifeq 59
      // 2a: aload 3
      // 2b: iload 1
      // 2c: ifeq 4b
      // 2f: goto 36
      // 32: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: invokevirtual ha9.ofg ()Z
      // 39: ifeq 51
      // 3c: goto 43
      // 3f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 3
      // 44: goto 4b
      // 47: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: bipush 0
      // 4d: bipush 1
      // 4e: invokevirtual ha9.thu (ZZZ)V
      // 51: iload 1
      // 52: ifne 13
      // 55: aload 0
      // 56: invokespecial dug.dao ()V
      // 59: return
   }

   private void dao() {
      this.t9z.o_f(0);
      this.t9z.do3(false);
      this.t9z.zsa(0);
      this.t9z.kcj(false);
   }

   public boolean ly4() {
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
      // 05: getfield dug.f65 Z
      // 08: iload 1
      // 09: ifne 8b
      // 0c: ifeq 8a
      // 0f: goto 16
      // 12: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield dug.v0f Z
      // 1a: iload 1
      // 1b: ifne 8b
      // 1e: goto 25
      // 21: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: ifne 8a
      // 28: goto 2f
      // 2b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield dug.rpk Ljava/util/List;
      // 33: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 38: astore 2
      // 39: aload 2
      // 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f: ifeq 88
      // 42: aload 2
      // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 48: checkcast ha9
      // 4b: astore 3
      // 4c: aload 3
      // 4d: invokevirtual ha9.myu ()Z
      // 50: iload 1
      // 51: ifne 89
      // 54: iload 1
      // 55: ifne 83
      // 58: goto 5f
      // 5b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: ifne 82
      // 62: goto 69
      // 65: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 3
      // 6a: invokevirtual ha9.bl4 ()Z
      // 6d: iload 1
      // 6e: ifne 83
      // 71: goto 78
      // 74: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: ifne 84
      // 7b: goto 82
      // 7e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
      // 84: iload 1
      // 85: ifeq 39
      // 88: bipush 1
      // 89: ireturn
      // 8a: bipush 0
      // 8b: ireturn
   }

   @Override
   public void lgm() {
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
      // 05: getfield dug.t9z Lcog;
      // 08: invokevirtual cog._9h ()I
      // 0b: iload 1
      // 0c: ifeq 34
      // 0f: ifgt 2d
      // 12: goto 19
      // 15: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield dug.t9z Lcog;
      // 1d: aload 0
      // 1e: invokevirtual dug._s3 ()I
      // 21: bipush 1
      // 22: iadd
      // 23: invokevirtual cog.owd (I)V
      // 26: goto 2d
      // 29: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield dug.t9z Lcog;
      // 31: invokevirtual cog.c21 ()I
      // 34: istore 2
      // 35: aload 0
      // 36: getfield dug.t9z Lcog;
      // 39: invokevirtual cog.ans ()I
      // 3c: istore 3
      // 3d: bipush 0
      // 3e: istore 4
      // 40: aload 0
      // 41: new mew
      // 44: dup
      // 45: iload 2
      // 46: bipush 0
      // 47: iload 3
      // 48: invokespecial mew.<init> (III)V
      // 4b: invokevirtual dug.koz (Lmew;)Le0x;
      // 4e: invokevirtual e0x.p1r ()Lp3y;
      // 51: getstatic p3y.cei Lp3y;
      // 54: if_acmpne 91
      // 57: iload 2
      // 58: aload 0
      // 59: getfield dug.fsy Ljava/util/Random;
      // 5c: bipush 8
      // 5e: invokevirtual java/util/Random.nextInt (I)I
      // 61: aload 0
      // 62: getfield dug.fsy Ljava/util/Random;
      // 65: bipush 8
      // 67: invokevirtual java/util/Random.nextInt (I)I
      // 6a: isub
      // 6b: iadd
      // 6c: istore 2
      // 6d: iload 3
      // 6e: aload 0
      // 6f: getfield dug.fsy Ljava/util/Random;
      // 72: bipush 8
      // 74: invokevirtual java/util/Random.nextInt (I)I
      // 77: aload 0
      // 78: getfield dug.fsy Ljava/util/Random;
      // 7b: bipush 8
      // 7d: invokevirtual java/util/Random.nextInt (I)I
      // 80: isub
      // 81: iadd
      // 82: istore 3
      // 83: iinc 4 1
      // 86: iload 4
      // 88: sipush 10000
      // 8b: if_icmpne 40
      // 8e: goto 91
      // 91: aload 0
      // 92: getfield dug.t9z Lcog;
      // 95: iload 2
      // 96: invokevirtual cog.yc4 (I)V
      // 99: aload 0
      // 9a: getfield dug.t9z Lcog;
      // 9d: iload 3
      // 9e: invokevirtual cog.i3b (I)V
      // a1: return
   }

   @Override
   public void b1d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dug.b J
      // 003: ldc2_w 74642551860985
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial t9d.b1d ()V
      // 010: aload 0
      // 011: iload 3
      // 012: ifne 030
      // 015: getfield dug.t9z Lcog;
      // 018: invokevirtual cog.z28 ()Lgxq;
      // 01b: getstatic gxq.gl_ Lgxq;
      // 01e: if_acmpne 075
      // 021: goto 028
      // 024: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 0
      // 029: goto 030
      // 02c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02f: athrow
      // 030: getfield dug.auv Ljava/util/Set;
      // 033: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 038: astore 4
      // 03a: aload 4
      // 03c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 041: ifeq 071
      // 044: aload 4
      // 046: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 04b: checkcast h2f
      // 04e: astore 5
      // 050: aload 0
      // 051: aload 5
      // 053: getfield h2f.jnd I
      // 056: aload 5
      // 058: getfield h2f.km5 I
      // 05b: invokevirtual dug.o5h (II)Ltts;
      // 05e: bipush 0
      // 05f: invokevirtual tts.o7u (Z)V
      // 062: iload 3
      // 063: ifne 419
      // 066: iload 3
      // 067: ifeq 03a
      // 06a: goto 071
      // 06d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: iload 3
      // 072: ifeq 419
      // 075: bipush 0
      // 076: istore 4
      // 078: bipush 0
      // 079: istore 5
      // 07b: aload 0
      // 07c: getfield dug.auv Ljava/util/Set;
      // 07f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 084: astore 6
      // 086: aload 6
      // 088: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08d: ifeq 419
      // 090: aload 6
      // 092: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 097: checkcast h2f
      // 09a: astore 7
      // 09c: aload 7
      // 09e: getfield h2f.jnd I
      // 0a1: bipush 16
      // 0a3: imul
      // 0a4: istore 8
      // 0a6: aload 7
      // 0a8: getfield h2f.km5 I
      // 0ab: bipush 16
      // 0ad: imul
      // 0ae: istore 9
      // 0b0: aload 0
      // 0b1: getfield dug.e8t Luan;
      // 0b4: sipush 19774
      // 0b7: ldc2_w 3505042970478167861
      // 0ba: lload 1
      // 0bb: lxor
      // 0bc: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: nop
      // 0c2: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0c5: aload 0
      // 0c6: aload 7
      // 0c8: getfield h2f.jnd I
      // 0cb: aload 7
      // 0cd: getfield h2f.km5 I
      // 0d0: invokevirtual dug.o5h (II)Ltts;
      // 0d3: astore 10
      // 0d5: aload 0
      // 0d6: iload 8
      // 0d8: iload 9
      // 0da: aload 10
      // 0dc: invokevirtual dug.ev3 (IILtts;)V
      // 0df: aload 0
      // 0e0: getfield dug.e8t Luan;
      // 0e3: sipush 14955
      // 0e6: ldc2_w 3951103471319986273
      // 0e9: lload 1
      // 0ea: lxor
      // 0eb: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: nop
      // 0f1: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 0f4: aload 10
      // 0f6: bipush 0
      // 0f7: invokevirtual tts.o7u (Z)V
      // 0fa: aload 0
      // 0fb: getfield dug.e8t Luan;
      // 0fe: sipush 29731
      // 101: ldc2_w 5369003448281857589
      // 104: lload 1
      // 105: lxor
      // 106: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 10f: aload 0
      // 110: getfield dug.fsy Ljava/util/Random;
      // 113: ldc 100000
      // 115: nop
      // 116: invokevirtual java/util/Random.nextInt (I)I
      // 119: iload 3
      // 11a: ifne 1e1
      // 11d: ifne 1c3
      // 120: aload 0
      // 121: invokevirtual dug.xqu ()Z
      // 124: iload 3
      // 125: ifne 1e1
      // 128: goto 12f
      // 12b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: ifeq 1c3
      // 132: goto 139
      // 135: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138: athrow
      // 139: aload 0
      // 13a: invokevirtual dug.aq0 ()Z
      // 13d: iload 3
      // 13e: ifne 1e1
      // 141: goto 148
      // 144: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 147: athrow
      // 148: ifeq 1c3
      // 14b: goto 152
      // 14e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 151: athrow
      // 152: aload 0
      // 153: aload 0
      // 154: getfield dug.jf7 I
      // 157: bipush 3
      // 158: imul
      // 159: ldc 1013904223
      // 15b: nop
      // 15c: iadd
      // 15d: putfield dug.jf7 I
      // 160: aload 0
      // 161: getfield dug.jf7 I
      // 164: bipush 2
      // 165: ishr
      // 166: istore 11
      // 168: aload 0
      // 169: new mew
      // 16c: dup
      // 16d: iload 8
      // 16f: iload 11
      // 171: bipush 15
      // 173: iand
      // 174: iadd
      // 175: bipush 0
      // 176: iload 9
      // 178: iload 11
      // 17a: bipush 8
      // 17c: ishr
      // 17d: bipush 15
      // 17f: iand
      // 180: iadd
      // 181: invokespecial mew.<init> (III)V
      // 184: invokevirtual dug.m9q (Lmew;)Lmew;
      // 187: astore 12
      // 189: aload 0
      // 18a: aload 12
      // 18c: invokevirtual dug.eyz (Lmew;)Z
      // 18f: iload 3
      // 190: ifne 1e1
      // 193: ifeq 1c3
      // 196: goto 19d
      // 199: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19c: athrow
      // 19d: aload 0
      // 19e: new _6b
      // 1a1: dup
      // 1a2: aload 0
      // 1a3: aload 12
      // 1a5: invokevirtual mew.getX ()I
      // 1a8: i2d
      // 1a9: aload 12
      // 1ab: invokevirtual mew.getY ()I
      // 1ae: i2d
      // 1af: aload 12
      // 1b1: invokevirtual mew.getZ ()I
      // 1b4: i2d
      // 1b5: invokespecial _6b.<init> (Lt9d;DDD)V
      // 1b8: invokevirtual dug._b8 (Li2h;)Z
      // 1bb: pop
      // 1bc: goto 1c3
      // 1bf: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: getfield dug.e8t Luan;
      // 1c7: sipush 7370
      // 1ca: ldc2_w 3073711373461493443
      // 1cd: lload 1
      // 1ce: lxor
      // 1cf: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: nop
      // 1d5: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 1d8: aload 0
      // 1d9: getfield dug.fsy Ljava/util/Random;
      // 1dc: bipush 16
      // 1de: invokevirtual java/util/Random.nextInt (I)I
      // 1e1: iload 3
      // 1e2: ifne 309
      // 1e5: ifne 2df
      // 1e8: goto 1ef
      // 1eb: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: aload 0
      // 1f0: aload 0
      // 1f1: getfield dug.jf7 I
      // 1f4: bipush 3
      // 1f5: imul
      // 1f6: ldc 1013904223
      // 1f8: nop
      // 1f9: iadd
      // 1fa: putfield dug.jf7 I
      // 1fd: aload 0
      // 1fe: getfield dug.jf7 I
      // 201: bipush 2
      // 202: ishr
      // 203: istore 11
      // 205: aload 0
      // 206: new mew
      // 209: dup
      // 20a: iload 8
      // 20c: iload 11
      // 20e: bipush 15
      // 210: iand
      // 211: iadd
      // 212: bipush 0
      // 213: iload 9
      // 215: iload 11
      // 217: bipush 8
      // 219: ishr
      // 21a: bipush 15
      // 21c: iand
      // 21d: iadd
      // 21e: invokespecial mew.<init> (III)V
      // 221: invokevirtual dug.k62 (Lmew;)Lmew;
      // 224: astore 12
      // 226: aload 12
      // 228: invokevirtual mew.eve ()Lmew;
      // 22b: astore 13
      // 22d: aload 0
      // 22e: aload 13
      // 230: invokevirtual dug.hcn (Lmew;)Z
      // 233: iload 3
      // 234: ifne 259
      // 237: ifeq 255
      // 23a: goto 241
      // 23d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 240: athrow
      // 241: aload 0
      // 242: aload 13
      // 244: getstatic ox_.f02 Le0x;
      // 247: invokevirtual e0x.l4i ()Lzfz;
      // 24a: invokevirtual dug.gfy (Lmew;Lzfz;)Z
      // 24d: pop
      // 24e: goto 255
      // 251: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 254: athrow
      // 255: aload 0
      // 256: invokevirtual dug.xqu ()Z
      // 259: iload 3
      // 25a: ifne 29b
      // 25d: ifeq 297
      // 260: goto 267
      // 263: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 266: athrow
      // 267: aload 0
      // 268: aload 12
      // 26a: bipush 1
      // 26b: invokevirtual dug.l2a (Lmew;Z)Z
      // 26e: iload 3
      // 26f: ifne 29b
      // 272: goto 279
      // 275: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 278: athrow
      // 279: ifeq 297
      // 27c: goto 283
      // 27f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: aload 0
      // 284: aload 12
      // 286: getstatic ox_.dxo Le0x;
      // 289: invokevirtual e0x.l4i ()Lzfz;
      // 28c: invokevirtual dug.gfy (Lmew;Lzfz;)Z
      // 28f: pop
      // 290: goto 297
      // 293: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 296: athrow
      // 297: aload 0
      // 298: invokevirtual dug.xqu ()Z
      // 29b: iload 3
      // 29c: ifne 318
      // 29f: ifeq 2df
      // 2a2: goto 2a9
      // 2a5: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a8: athrow
      // 2a9: aload 0
      // 2aa: aload 13
      // 2ac: invokevirtual dug.getBiomeGenForCoords (Lmew;)Lgyu;
      // 2af: invokevirtual gyu.ziq ()Z
      // 2b2: iload 3
      // 2b3: ifne 318
      // 2b6: goto 2bd
      // 2b9: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bc: athrow
      // 2bd: ifeq 2df
      // 2c0: goto 2c7
      // 2c3: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c6: athrow
      // 2c7: aload 0
      // 2c8: aload 13
      // 2ca: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 2cd: invokeinterface zfz.r_y ()Le0x; 1
      // 2d2: aload 0
      // 2d3: aload 13
      // 2d5: invokevirtual e0x.val (Lt9d;Lmew;)V
      // 2d8: goto 2df
      // 2db: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2de: athrow
      // 2df: aload 0
      // 2e0: getfield dug.e8t Luan;
      // 2e3: sipush 3465
      // 2e6: ldc2_w 308267710235838357
      // 2e9: lload 1
      // 2ea: lxor
      // 2eb: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: nop
      // 2f1: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 2f4: aload 0
      // 2f5: invokevirtual dug.eir ()Lef9;
      // 2f8: sipush 2159
      // 2fb: ldc2_w 8097520903184941687
      // 2fe: lload 1
      // 2ff: lxor
      // 300: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: nop
      // 306: invokevirtual ef9.sh0 (Ljava/lang/String;)I
      // 309: istore 11
      // 30b: iload 3
      // 30c: ifne 415
      // 30f: iload 11
      // 311: goto 318
      // 314: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 317: athrow
      // 318: ifle 40e
      // 31b: aload 10
      // 31d: invokevirtual tts.azq ()[Lk7x;
      // 320: astore 12
      // 322: aload 12
      // 324: arraylength
      // 325: istore 13
      // 327: bipush 0
      // 328: istore 14
      // 32a: iload 14
      // 32c: iload 13
      // 32e: if_icmpge 40e
      // 331: aload 12
      // 333: iload 14
      // 335: aaload
      // 336: astore 15
      // 338: iload 3
      // 339: ifne 40a
      // 33c: aload 15
      // 33e: iload 3
      // 33f: ifne 097
      // 342: goto 349
      // 345: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 348: athrow
      // 349: ifnull 407
      // 34c: aload 15
      // 34e: invokevirtual k7x.dls ()Z
      // 351: iload 3
      // 352: ifne 367
      // 355: goto 35c
      // 358: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35b: athrow
      // 35c: ifeq 407
      // 35f: goto 366
      // 362: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 365: athrow
      // 366: bipush 0
      // 367: istore 16
      // 369: iload 16
      // 36b: iload 11
      // 36d: if_icmpge 407
      // 370: aload 0
      // 371: aload 0
      // 372: getfield dug.jf7 I
      // 375: bipush 3
      // 376: imul
      // 377: ldc 1013904223
      // 379: nop
      // 37a: iadd
      // 37b: putfield dug.jf7 I
      // 37e: aload 0
      // 37f: getfield dug.jf7 I
      // 382: bipush 2
      // 383: ishr
      // 384: istore 17
      // 386: iload 17
      // 388: bipush 15
      // 38a: iand
      // 38b: istore 18
      // 38d: iload 17
      // 38f: bipush 8
      // 391: ishr
      // 392: bipush 15
      // 394: iand
      // 395: istore 19
      // 397: iload 17
      // 399: bipush 16
      // 39b: ishr
      // 39c: bipush 15
      // 39e: iand
      // 39f: istore 20
      // 3a1: iinc 5 1
      // 3a4: aload 15
      // 3a6: iload 18
      // 3a8: iload 20
      // 3aa: iload 19
      // 3ac: invokevirtual k7x.py5 (III)Lzfz;
      // 3af: astore 21
      // 3b1: aload 21
      // 3b3: invokeinterface zfz.r_y ()Le0x; 1
      // 3b8: astore 22
      // 3ba: iload 3
      // 3bb: ifne 403
      // 3be: aload 22
      // 3c0: invokevirtual e0x.qk0 ()Z
      // 3c3: iload 3
      // 3c4: ifne 32c
      // 3c7: goto 3ce
      // 3ca: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cd: athrow
      // 3ce: ifeq 400
      // 3d1: iinc 4 1
      // 3d4: aload 22
      // 3d6: aload 0
      // 3d7: new mew
      // 3da: dup
      // 3db: iload 18
      // 3dd: iload 8
      // 3df: iadd
      // 3e0: iload 20
      // 3e2: aload 15
      // 3e4: invokevirtual k7x.l3s ()I
      // 3e7: iadd
      // 3e8: iload 19
      // 3ea: iload 9
      // 3ec: iadd
      // 3ed: invokespecial mew.<init> (III)V
      // 3f0: aload 21
      // 3f2: aload 0
      // 3f3: getfield dug.fsy Ljava/util/Random;
      // 3f6: invokevirtual e0x.ff3 (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 3f9: goto 400
      // 3fc: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ff: athrow
      // 400: iinc 16 1
      // 403: iload 3
      // 404: ifeq 369
      // 407: iinc 14 1
      // 40a: iload 3
      // 40b: ifeq 32a
      // 40e: aload 0
      // 40f: getfield dug.e8t Luan;
      // 412: invokevirtual uan.uio ()V
      // 415: iload 3
      // 416: ifeq 086
      // 419: return
   }

   public mew m9q(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual dug.k62 (Lmew;)Lmew;
      // 05: astore 3
      // 06: invokestatic t9d.c ()I
      // 09: new nh4
      // 0c: dup
      // 0d: aload 3
      // 0e: new mew
      // 11: dup
      // 12: aload 3
      // 13: invokevirtual mew.getX ()I
      // 16: aload 0
      // 17: invokevirtual dug._1d ()I
      // 1a: aload 3
      // 1b: invokevirtual mew.getZ ()I
      // 1e: invokespecial mew.<init> (III)V
      // 21: invokespecial nh4.<init> (Lmew;Lmew;)V
      // 24: ldc2_w 3.0
      // 27: ldc2_w 3.0
      // 2a: ldc2_w 3.0
      // 2d: invokevirtual nh4.c2h (DDD)Lnh4;
      // 30: astore 4
      // 32: istore 2
      // 33: aload 0
      // 34: ldc g_3
      // 36: nop
      // 37: aload 4
      // 39: new dug$1
      // 3c: dup
      // 3d: aload 0
      // 3e: invokespecial dug$1.<init> (Ldug;)V
      // 41: invokevirtual dug.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 44: astore 5
      // 46: aload 5
      // 48: iload 2
      // 49: ifne 77
      // 4c: invokeinterface java/util/List.isEmpty ()Z 1
      // 51: ifne 80
      // 54: goto 5b
      // 57: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: aload 5
      // 5d: aload 0
      // 5e: getfield dug.fsy Ljava/util/Random;
      // 61: aload 5
      // 63: invokeinterface java/util/List.size ()I 1
      // 68: invokevirtual java/util/Random.nextInt (I)I
      // 6b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 70: goto 77
      // 73: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: checkcast g_3
      // 7a: invokevirtual g_3.d3d ()Lmew;
      // 7d: goto 81
      // 80: aload 3
      // 81: areturn
   }

   @Override
   public boolean h11(mew var1, e0x var2) {
      rty var3 = new rty(var1, var2);
      return this.xa7.contains(var3);
   }

   @Override
   public void cjk(mew var1, e0x var2, int var3) {
      this.hba(var1, var2, var3, 0);
   }

   @Override
   public void hba(mew param1, e0x param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new rty
      // 003: dup
      // 004: aload 1
      // 005: aload 2
      // 006: invokespecial rty.<init> (Lmew;Le0x;)V
      // 009: astore 6
      // 00b: invokestatic t9d.c ()I
      // 00e: bipush 0
      // 00f: istore 7
      // 011: istore 5
      // 013: aload 0
      // 014: getfield dug.mw3 Z
      // 017: iload 5
      // 019: ifne 11e
      // 01c: ifeq 103
      // 01f: goto 026
      // 022: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 2
      // 027: iload 5
      // 029: ifne 04b
      // 02c: goto 033
      // 02f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: invokevirtual e0x.p1r ()Lp3y;
      // 036: getstatic p3y.cei Lp3y;
      // 039: if_acmpeq 103
      // 03c: goto 043
      // 03f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: aload 2
      // 044: goto 04b
      // 047: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: invokevirtual e0x.jsj ()Z
      // 04e: iload 5
      // 050: ifne 102
      // 053: ifeq 101
      // 056: goto 05d
      // 059: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: bipush 8
      // 05f: istore 7
      // 061: aload 0
      // 062: aload 6
      // 064: getfield rty.weq Lmew;
      // 067: iload 7
      // 069: ineg
      // 06a: iload 7
      // 06c: ineg
      // 06d: iload 7
      // 06f: ineg
      // 070: invokevirtual mew.ec4 (III)Lmew;
      // 073: iload 5
      // 075: ifne 0a0
      // 078: aload 6
      // 07a: getfield rty.weq Lmew;
      // 07d: iload 7
      // 07f: iload 7
      // 081: iload 7
      // 083: invokevirtual mew.ec4 (III)Lmew;
      // 086: invokevirtual dug.o2i (Lmew;Lmew;)Z
      // 089: ifeq 100
      // 08c: goto 093
      // 08f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: aload 0
      // 094: aload 6
      // 096: getfield rty.weq Lmew;
      // 099: goto 0a0
      // 09c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 0a3: astore 8
      // 0a5: aload 8
      // 0a7: invokeinterface zfz.r_y ()Le0x; 1
      // 0ac: iload 5
      // 0ae: ifne 0cf
      // 0b1: invokevirtual e0x.p1r ()Lp3y;
      // 0b4: getstatic p3y.cei Lp3y;
      // 0b7: if_acmpeq 100
      // 0ba: goto 0c1
      // 0bd: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: aload 8
      // 0c3: invokeinterface zfz.r_y ()Le0x; 1
      // 0c8: goto 0cf
      // 0cb: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: iload 5
      // 0d1: ifne 0f1
      // 0d4: aload 6
      // 0d6: invokevirtual rty.qny ()Le0x;
      // 0d9: if_acmpne 100
      // 0dc: goto 0e3
      // 0df: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aload 8
      // 0e5: invokeinterface zfz.r_y ()Le0x; 1
      // 0ea: goto 0f1
      // 0ed: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: aload 6
      // 0f4: getfield rty.weq Lmew;
      // 0f7: aload 8
      // 0f9: aload 0
      // 0fa: getfield dug.fsy Ljava/util/Random;
      // 0fd: invokevirtual e0x.zvy (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 100: return
      // 101: bipush 1
      // 102: istore 3
      // 103: aload 0
      // 104: aload 1
      // 105: iload 7
      // 107: ineg
      // 108: iload 7
      // 10a: ineg
      // 10b: iload 7
      // 10d: ineg
      // 10e: invokevirtual mew.ec4 (III)Lmew;
      // 111: aload 1
      // 112: iload 7
      // 114: iload 7
      // 116: iload 7
      // 118: invokevirtual mew.ec4 (III)Lmew;
      // 11b: invokevirtual dug.o2i (Lmew;Lmew;)Z
      // 11e: ifeq 187
      // 121: aload 2
      // 122: invokevirtual e0x.p1r ()Lp3y;
      // 125: getstatic p3y.cei Lp3y;
      // 128: if_acmpeq 150
      // 12b: goto 132
      // 12e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: aload 6
      // 134: iload 3
      // 135: i2l
      // 136: aload 0
      // 137: getfield dug.t9z Lcog;
      // 13a: invokevirtual cog.zex ()J
      // 13d: ladd
      // 13e: invokevirtual rty.wsc (J)Lrty;
      // 141: pop
      // 142: aload 6
      // 144: iload 4
      // 146: invokevirtual rty.pep (I)V
      // 149: goto 150
      // 14c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14f: athrow
      // 150: aload 0
      // 151: getfield dug.d5o Ljava/util/Set;
      // 154: aload 6
      // 156: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 15b: iload 5
      // 15d: ifne 186
      // 160: ifne 187
      // 163: goto 16a
      // 166: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield dug.d5o Ljava/util/Set;
      // 16e: aload 6
      // 170: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 175: pop
      // 176: aload 0
      // 177: getfield dug.js1 Ljava/util/TreeSet;
      // 17a: aload 6
      // 17c: invokevirtual java/util/TreeSet.add (Ljava/lang/Object;)Z
      // 17f: goto 186
      // 182: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: pop
      // 187: return
   }

   @Override
   public void jf5(mew param1, e0x param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: new rty
      // 08: dup
      // 09: aload 1
      // 0a: aload 2
      // 0b: invokespecial rty.<init> (Lmew;Le0x;)V
      // 0e: astore 6
      // 10: aload 6
      // 12: iload 4
      // 14: iload 5
      // 16: ifne 37
      // 19: invokevirtual rty.pep (I)V
      // 1c: aload 2
      // 1d: invokevirtual e0x.p1r ()Lp3y;
      // 20: getstatic p3y.cei Lp3y;
      // 23: if_acmpeq 44
      // 26: goto 2d
      // 29: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 6
      // 2f: iload 3
      // 30: goto 37
      // 33: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: i2l
      // 38: aload 0
      // 39: getfield dug.t9z Lcog;
      // 3c: invokevirtual cog.zex ()J
      // 3f: ladd
      // 40: invokevirtual rty.wsc (J)Lrty;
      // 43: pop
      // 44: aload 0
      // 45: getfield dug.d5o Ljava/util/Set;
      // 48: aload 6
      // 4a: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 4f: iload 5
      // 51: ifne 7a
      // 54: ifne 7b
      // 57: goto 5e
      // 5a: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield dug.d5o Ljava/util/Set;
      // 62: aload 6
      // 64: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 69: pop
      // 6a: aload 0
      // 6b: getfield dug.js1 Ljava/util/TreeSet;
      // 6e: aload 6
      // 70: invokevirtual java/util/TreeSet.add (Ljava/lang/Object;)Z
      // 73: goto 7a
      // 76: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: pop
      // 7b: return
   }

   @Override
   public void y8h() {
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
      // 05: iload 1
      // 06: ifne 44
      // 09: getfield dug.rpk Ljava/util/List;
      // 0c: invokeinterface java/util/List.isEmpty ()Z 1
      // 11: ifeq 43
      // 14: goto 1b
      // 17: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 1
      // 1d: ifne 48
      // 20: goto 27
      // 23: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: dup
      // 28: getfield dug.d4b I
      // 2b: dup_x1
      // 2c: bipush 1
      // 2d: iadd
      // 2e: putfield dug.d4b I
      // 31: sipush 1200
      // 34: if_icmplt 47
      // 37: goto 3e
      // 3a: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: return
      // 3f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 0
      // 44: invokevirtual dug.ko8 ()V
      // 47: aload 0
      // 48: invokespecial t9d.y8h ()V
      // 4b: return
   }

   public void ko8() {
      this.d4b = 0;
   }

   @Override
   public boolean ud3(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dug.b J
      // 003: ldc2_w 132390837550248
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifeq 02d
      // 013: getfield dug.t9z Lcog;
      // 016: invokevirtual cog.z28 ()Lgxq;
      // 019: getstatic gxq.gl_ Lgxq;
      // 01c: if_acmpne 02c
      // 01f: goto 026
      // 022: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: bipush 0
      // 027: ireturn
      // 028: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield dug.js1 Ljava/util/TreeSet;
      // 030: invokevirtual java/util/TreeSet.size ()I
      // 033: istore 5
      // 035: iload 5
      // 037: aload 0
      // 038: getfield dug.d5o Ljava/util/Set;
      // 03b: invokeinterface java/util/Set.size ()I 1
      // 040: iload 4
      // 042: ifeq 07a
      // 045: if_icmpeq 069
      // 048: goto 04f
      // 04b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: new java/lang/IllegalStateException
      // 052: dup
      // 053: sipush 21862
      // 056: ldc2_w 740624056721460520
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 064: athrow
      // 065: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: iload 5
      // 06b: iload 4
      // 06d: ifeq 098
      // 070: sipush 1000
      // 073: goto 07a
      // 076: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: if_icmple 082
      // 07d: sipush 1000
      // 080: istore 5
      // 082: aload 0
      // 083: getfield dug.e8t Luan;
      // 086: sipush 4524
      // 089: ldc2_w 7207502484371376621
      // 08c: lload 2
      // 08d: lxor
      // 08e: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: nop
      // 094: invokevirtual uan.qek (Ljava/lang/String;)V
      // 097: bipush 0
      // 098: istore 6
      // 09a: iload 6
      // 09c: iload 5
      // 09e: if_icmpge 119
      // 0a1: aload 0
      // 0a2: getfield dug.js1 Ljava/util/TreeSet;
      // 0a5: invokevirtual java/util/TreeSet.first ()Ljava/lang/Object;
      // 0a8: checkcast rty
      // 0ab: astore 7
      // 0ad: iload 4
      // 0af: ifeq 135
      // 0b2: iload 1
      // 0b3: iload 4
      // 0b5: ifeq 110
      // 0b8: goto 0bf
      // 0bb: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: ifne 0ef
      // 0c2: goto 0c9
      // 0c5: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: aload 7
      // 0cb: getfield rty.pjb J
      // 0ce: aload 0
      // 0cf: getfield dug.t9z Lcog;
      // 0d2: invokevirtual cog.zex ()J
      // 0d5: lcmp
      // 0d6: iload 4
      // 0d8: ifeq 110
      // 0db: goto 0e2
      // 0de: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: ifle 0ef
      // 0e5: goto 0ec
      // 0e8: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: goto 119
      // 0ef: aload 0
      // 0f0: getfield dug.js1 Ljava/util/TreeSet;
      // 0f3: aload 7
      // 0f5: invokevirtual java/util/TreeSet.remove (Ljava/lang/Object;)Z
      // 0f8: pop
      // 0f9: aload 0
      // 0fa: getfield dug.d5o Ljava/util/Set;
      // 0fd: aload 7
      // 0ff: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 104: pop
      // 105: aload 0
      // 106: getfield dug.xa7 Ljava/util/List;
      // 109: aload 7
      // 10b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 110: pop
      // 111: iinc 6 1
      // 114: iload 4
      // 116: ifne 09a
      // 119: aload 0
      // 11a: getfield dug.e8t Luan;
      // 11d: invokevirtual uan.uio ()V
      // 120: aload 0
      // 121: getfield dug.e8t Luan;
      // 124: sipush 9880
      // 127: ldc2_w 8391426880520928978
      // 12a: lload 2
      // 12b: lxor
      // 12c: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: nop
      // 132: invokevirtual uan.qek (Ljava/lang/String;)V
      // 135: aload 0
      // 136: getfield dug.xa7 Ljava/util/List;
      // 139: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 13e: astore 6
      // 140: aload 6
      // 142: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 147: ifeq 265
      // 14a: aload 6
      // 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 151: checkcast rty
      // 154: astore 7
      // 156: aload 6
      // 158: invokeinterface java/util/Iterator.remove ()V 1
      // 15d: bipush 0
      // 15e: istore 8
      // 160: aload 0
      // 161: aload 7
      // 163: getfield rty.weq Lmew;
      // 166: iload 8
      // 168: ineg
      // 169: iload 8
      // 16b: ineg
      // 16c: iload 8
      // 16e: ineg
      // 16f: invokevirtual mew.ec4 (III)Lmew;
      // 172: aload 7
      // 174: iload 4
      // 176: ifeq 259
      // 179: getfield rty.weq Lmew;
      // 17c: iload 8
      // 17e: iload 8
      // 180: iload 8
      // 182: invokevirtual mew.ec4 (III)Lmew;
      // 185: invokevirtual dug.o2i (Lmew;Lmew;)Z
      // 188: iload 4
      // 18a: ifeq 27c
      // 18d: goto 194
      // 190: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: ifeq 24a
      // 197: goto 19e
      // 19a: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: aload 0
      // 19f: aload 7
      // 1a1: getfield rty.weq Lmew;
      // 1a4: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 1a7: astore 9
      // 1a9: aload 9
      // 1ab: invokeinterface zfz.r_y ()Le0x; 1
      // 1b0: iload 4
      // 1b2: ifeq 1d3
      // 1b5: invokevirtual e0x.p1r ()Lp3y;
      // 1b8: getstatic p3y.cei Lp3y;
      // 1bb: if_acmpeq 245
      // 1be: goto 1c5
      // 1c1: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: aload 9
      // 1c7: invokeinterface zfz.r_y ()Le0x; 1
      // 1cc: goto 1d3
      // 1cf: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d2: athrow
      // 1d3: iload 4
      // 1d5: ifeq 1f1
      // 1d8: aload 7
      // 1da: invokevirtual rty.qny ()Le0x;
      // 1dd: invokestatic e0x.wma (Le0x;Le0x;)Z
      // 1e0: ifeq 245
      // 1e3: goto 1ea
      // 1e6: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: aload 9
      // 1ec: invokeinterface zfz.r_y ()Le0x; 1
      // 1f1: aload 0
      // 1f2: aload 7
      // 1f4: getfield rty.weq Lmew;
      // 1f7: aload 9
      // 1f9: aload 0
      // 1fa: getfield dug.fsy Ljava/util/Random;
      // 1fd: invokevirtual e0x.zvy (Lt9d;Lmew;Lzfz;Ljava/util/Random;)V
      // 200: goto 245
      // 203: astore 10
      // 205: aload 10
      // 207: sipush 24790
      // 20a: ldc2_w 7083667131559377039
      // 20d: lload 2
      // 20e: lxor
      // 20f: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: nop
      // 215: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 218: astore 11
      // 21a: aload 11
      // 21c: sipush 5937
      // 21f: ldc2_w 4610646659886649196
      // 222: lload 2
      // 223: lxor
      // 224: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: nop
      // 22a: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 22d: astore 12
      // 22f: aload 12
      // 231: aload 7
      // 233: getfield rty.weq Lmew;
      // 236: aload 9
      // 238: invokestatic wsc.uxq (Lwsc;Lmew;Lzfz;)V
      // 23b: new oov
      // 23e: dup
      // 23f: aload 11
      // 241: invokespecial oov.<init> (Le1i;)V
      // 244: athrow
      // 245: iload 4
      // 247: ifne 260
      // 24a: aload 0
      // 24b: aload 7
      // 24d: getfield rty.weq Lmew;
      // 250: aload 7
      // 252: goto 259
      // 255: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 258: athrow
      // 259: invokevirtual rty.qny ()Le0x;
      // 25c: bipush 0
      // 25d: invokevirtual dug.cjk (Lmew;Le0x;I)V
      // 260: iload 4
      // 262: ifne 140
      // 265: aload 0
      // 266: getfield dug.e8t Luan;
      // 269: invokevirtual uan.uio ()V
      // 26c: aload 0
      // 26d: getfield dug.xa7 Ljava/util/List;
      // 270: invokeinterface java/util/List.clear ()V 1
      // 275: aload 0
      // 276: getfield dug.js1 Ljava/util/TreeSet;
      // 279: invokevirtual java/util/TreeSet.isEmpty ()Z
      // 27c: iload 4
      // 27e: ifeq 28c
      // 281: ifne 28f
      // 284: goto 28b
      // 287: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28a: athrow
      // 28b: bipush 1
      // 28c: goto 290
      // 28f: bipush 0
      // 290: ireturn
   }

   @Override
   public List n1l(tts var1, boolean var2) {
      h2f var3 = var1.iu_();
      int var4 = (var3.jnd << 4) - 2;
      int var5 = var4 + 16 + 2;
      int var6 = (var3.km5 << 4) - 2;
      int var7 = var6 + 16 + 2;
      return this.m9p(new yve(var4, 0, var6, var5, 256, var7), var2);
   }

   @Override
   public List m9p(yve param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 4
      // 003: invokestatic t9d.c ()I
      // 006: bipush 0
      // 007: istore 5
      // 009: istore 3
      // 00a: iload 5
      // 00c: bipush 2
      // 00d: if_icmpge 112
      // 010: iload 5
      // 012: ifne 022
      // 015: aload 0
      // 016: getfield dug.js1 Ljava/util/TreeSet;
      // 019: invokevirtual java/util/TreeSet.iterator ()Ljava/util/Iterator;
      // 01c: astore 6
      // 01e: iload 3
      // 01f: ifeq 02d
      // 022: aload 0
      // 023: getfield dug.xa7 Ljava/util/List;
      // 026: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 02b: astore 6
      // 02d: aload 6
      // 02f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 034: ifeq 10b
      // 037: aload 6
      // 039: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03e: checkcast rty
      // 041: astore 7
      // 043: aload 7
      // 045: getfield rty.weq Lmew;
      // 048: astore 8
      // 04a: aload 8
      // 04c: invokevirtual mew.getX ()I
      // 04f: aload 1
      // 050: getfield yve.gdj I
      // 053: iload 3
      // 054: ifne 00d
      // 057: iload 3
      // 058: ifne 075
      // 05b: if_icmplt 107
      // 05e: goto 065
      // 061: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 8
      // 067: invokevirtual mew.getX ()I
      // 06a: aload 1
      // 06b: getfield yve.kwp I
      // 06e: goto 075
      // 071: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: iload 3
      // 076: ifne 093
      // 079: if_icmpge 107
      // 07c: goto 083
      // 07f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: aload 8
      // 085: invokevirtual mew.getZ ()I
      // 088: aload 1
      // 089: getfield yve.ob0 I
      // 08c: goto 093
      // 08f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: iload 3
      // 094: ifne 0bc
      // 097: if_icmplt 107
      // 09a: goto 0a1
      // 09d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: aload 8
      // 0a3: invokevirtual mew.getZ ()I
      // 0a6: iload 3
      // 0a7: ifne 0c0
      // 0aa: goto 0b1
      // 0ad: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 1
      // 0b2: getfield yve.nwc I
      // 0b5: goto 0bc
      // 0b8: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bb: athrow
      // 0bc: if_icmpge 107
      // 0bf: iload 2
      // 0c0: iload 3
      // 0c1: ifne 0e0
      // 0c4: ifeq 0e8
      // 0c7: goto 0ce
      // 0ca: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield dug.d5o Ljava/util/Set;
      // 0d2: aload 7
      // 0d4: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 0d9: goto 0e0
      // 0dc: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: pop
      // 0e1: aload 6
      // 0e3: invokeinterface java/util/Iterator.remove ()V 1
      // 0e8: aload 4
      // 0ea: iload 3
      // 0eb: ifne 0ff
      // 0ee: ifnonnull 0fd
      // 0f1: goto 0f8
      // 0f4: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0fb: astore 4
      // 0fd: aload 4
      // 0ff: aload 7
      // 101: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 106: pop
      // 107: iload 3
      // 108: ifeq 02d
      // 10b: iinc 5 1
      // 10e: iload 3
      // 10f: ifeq 00a
      // 112: aload 4
      // 114: areturn
   }

   @Override
   public void wu1(i2h param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: invokespecial dug.dtu ()Z
      // 08: iload 3
      // 09: ifeq 5b
      // 0c: ifne 4c
      // 0f: goto 16
      // 12: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: iload 3
      // 18: ifeq 49
      // 1b: goto 22
      // 1e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: instanceof j37
      // 25: ifne 48
      // 28: goto 2f
      // 2b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 1
      // 30: instanceof jd3
      // 33: iload 3
      // 34: ifeq 5b
      // 37: goto 3e
      // 3a: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: ifeq 4c
      // 41: goto 48
      // 44: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 1
      // 49: invokevirtual i2h._kl ()V
      // 4c: aload 0
      // 4d: iload 3
      // 4e: ifeq 83
      // 51: invokespecial dug.m5r ()Z
      // 54: goto 5b
      // 57: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ifne 82
      // 5e: aload 1
      // 5f: iload 3
      // 60: ifeq 7f
      // 63: goto 6a
      // 66: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: instanceof mbf
      // 6d: ifeq 82
      // 70: goto 77
      // 73: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 1
      // 78: goto 7f
      // 7b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: invokevirtual i2h._kl ()V
      // 82: aload 0
      // 83: aload 1
      // 84: iload 2
      // 85: invokespecial t9d.wu1 (Li2h;Z)V
      // 88: return
   }

   private boolean m5r() {
      return this.s4x.utb();
   }

   private boolean dtu() {
      return this.s4x.o3m();
   }

   @Override
   public g6k qya() {
      oza var1 = this.ujg.kmb(this.vzz);
      this.kil = new gvi(this, var1, this.vzz.ska());
      return this.kil;
   }

   public List _12(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 8
      // 05: invokestatic t9d.b ()I
      // 08: bipush 0
      // 09: istore 9
      // 0b: istore 7
      // 0d: iload 9
      // 0f: aload 0
      // 10: getfield dug.cn6 Ljava/util/List;
      // 13: invokeinterface java/util/List.size ()I 1
      // 18: if_icmpge ef
      // 1b: aload 0
      // 1c: getfield dug.cn6 Ljava/util/List;
      // 1f: iload 9
      // 21: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 26: checkcast pyk
      // 29: astore 10
      // 2b: aload 10
      // 2d: invokevirtual pyk.y8_ ()Lmew;
      // 30: astore 11
      // 32: iload 7
      // 34: ifeq ea
      // 37: aload 11
      // 39: invokevirtual mew.getX ()I
      // 3c: iload 1
      // 3d: if_icmplt e7
      // 40: goto 47
      // 43: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 11
      // 49: invokevirtual mew.getY ()I
      // 4c: iload 2
      // 4d: iload 7
      // 4f: ifeq 70
      // 52: goto 59
      // 55: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: if_icmplt e7
      // 5c: goto 63
      // 5f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 11
      // 65: invokevirtual mew.getZ ()I
      // 68: iload 3
      // 69: goto 70
      // 6c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: iload 7
      // 72: ifeq 8d
      // 75: if_icmplt e7
      // 78: goto 7f
      // 7b: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 11
      // 81: invokevirtual mew.getX ()I
      // 84: iload 4
      // 86: goto 8d
      // 89: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: iload 7
      // 8f: ifeq aa
      // 92: if_icmpge e7
      // 95: goto 9c
      // 98: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: aload 11
      // 9e: invokevirtual mew.getY ()I
      // a1: iload 5
      // a3: goto aa
      // a6: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9: athrow
      // aa: iload 7
      // ac: ifeq d3
      // af: if_icmpge e7
      // b2: goto b9
      // b5: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b8: athrow
      // b9: aload 11
      // bb: invokevirtual mew.getZ ()I
      // be: iload 7
      // c0: ifeq e6
      // c3: goto ca
      // c6: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c9: athrow
      // ca: iload 6
      // cc: goto d3
      // cf: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d2: athrow
      // d3: if_icmpge e7
      // d6: aload 8
      // d8: aload 10
      // da: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // df: goto e6
      // e2: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e5: athrow
      // e6: pop
      // e7: iinc 9 1
      // ea: iload 7
      // ec: ifne 0d
      // ef: aload 8
      // f1: areturn
   }

   @Override
   public boolean q2p(ha9 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield dug.s4x Lvr1;
      // 08: aload 0
      // 09: aload 2
      // 0a: aload 1
      // 0b: invokevirtual vr1.pbe (Lt9d;Lmew;Lha9;)Z
      // 0e: iload 3
      // 0f: ifeq 2b
      // 12: ifne 3d
      // 15: goto 1c
      // 18: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual dug.fve ()Lw5i;
      // 20: aload 2
      // 21: invokevirtual w5i.hka (Lmew;)Z
      // 24: goto 2b
      // 27: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: iload 3
      // 2c: ifeq 3a
      // 2f: ifeq 3d
      // 32: goto 39
      // 35: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void _kk(h50 var1) {
      long var2 = b ^ 87228563251096L;
      int var4 = t9d.b();

      label69: {
         Throwable var15;
         label63: {
            label62: {
               label61: {
                  try {
                     var10000 = this.t9z;
                     if (var4 == 0) {
                        break label61;
                     }

                     if (this.t9z.utc()) {
                        return;
                     }
                  } catch (Throwable var14) {
                     throw a(var14);
                  }

                  try {
                     try {
                        this.gwl(var1);
                        var16 = this;
                        if (var4 == 0) {
                           break label62;
                        }

                        var10000 = this.t9z;
                     } catch (Throwable var10) {
                        throw a(var10);
                     }
                  } catch (Throwable var11) {
                     var15 = var11;
                     boolean var10001 = false;
                     break label63;
                  }
               }

               try {
                  try {
                     if (var10000.z28() == gxq.gl_) {
                        this.twv();
                     }
                  } catch (Throwable var12) {
                     throw a(var12);
                  }

                  var16 = this;
               } catch (Throwable var13) {
                  var15 = var13;
                  boolean var17 = false;
                  break label63;
               }
            }

            try {
               var16._kk(var1);
               break label69;
            } catch (Throwable var9) {
               var15 = var9;
               boolean var18 = false;
            }
         }

         Throwable var5 = var15;
         e1i var6 = e1i.cor(var5, b<"w">(650, 3773724720096459246L ^ var2));

         try {
            this.utr(var6);
         } catch (Throwable var8) {
         }

         throw new oov(var6);
      }

      this.t9z.hk8(true);
   }

   private void twv() {
      long var1 = b ^ 45301347724423L;
      this.t9z.mfq(false);
      this.t9z.j0i(true);
      this.t9z.do3(false);
      this.t9z.kcj(false);
      this.t9z.rik(1000000000);
      this.t9z.l5d(6000L);
      this.t9z.vg1(h50$f05.l18);
      this.t9z.uo1(false);
      this.t9z.jbe(v66.na2);
      this.t9z.mik(true);
      this.eir().iqg(b<"w">(25591, 6674310359036341147L ^ var1), b<"w">(16655, 5247688897809353064L ^ var1));
   }

   private void gwl(h50 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dug.b J
      // 003: ldc2_w 10326463420706
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 04b
      // 013: getfield dug.vzz Lupn;
      // 016: invokevirtual upn.vm6 ()Z
      // 019: ifne 043
      // 01c: goto 023
      // 01f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 0
      // 024: getfield dug.t9z Lcog;
      // 027: getstatic mew._9b Lmew;
      // 02a: aload 0
      // 02b: getfield dug.vzz Lupn;
      // 02e: invokevirtual upn.z9e ()I
      // 031: invokevirtual mew.z89 (I)Lmew;
      // 034: invokevirtual cog.d2x (Lmew;)V
      // 037: iload 4
      // 039: ifeq 183
      // 03c: goto 043
      // 03f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: aload 0
      // 044: goto 04b
      // 047: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: iload 4
      // 04d: ifne 089
      // 050: getfield dug.t9z Lcog;
      // 053: invokevirtual cog.z28 ()Lgxq;
      // 056: getstatic gxq.gl_ Lgxq;
      // 059: if_acmpne 07c
      // 05c: goto 063
      // 05f: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 0
      // 064: getfield dug.t9z Lcog;
      // 067: getstatic mew._9b Lmew;
      // 06a: invokevirtual mew.nuv ()Lmew;
      // 06d: invokevirtual cog.d2x (Lmew;)V
      // 070: iload 4
      // 072: ifeq 183
      // 075: goto 07c
      // 078: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: aload 0
      // 07d: bipush 1
      // 07e: putfield dug.ka0 Z
      // 081: aload 0
      // 082: goto 089
      // 085: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: getfield dug.vzz Lupn;
      // 08c: invokevirtual upn.wvm ()Lcdp;
      // 08f: astore 5
      // 091: aload 5
      // 093: invokevirtual cdp.l7g ()Ljava/util/List;
      // 096: astore 6
      // 098: new java/util/Random
      // 09b: dup
      // 09c: aload 0
      // 09d: invokevirtual dug.x2p ()J
      // 0a0: invokespecial java/util/Random.<init> (J)V
      // 0a3: astore 7
      // 0a5: aload 5
      // 0a7: bipush 0
      // 0a8: bipush 0
      // 0a9: sipush 256
      // 0ac: aload 6
      // 0ae: aload 7
      // 0b0: invokevirtual cdp.rc6 (IIILjava/util/List;Ljava/util/Random;)Lmew;
      // 0b3: astore 8
      // 0b5: bipush 0
      // 0b6: istore 9
      // 0b8: aload 0
      // 0b9: getfield dug.vzz Lupn;
      // 0bc: invokevirtual upn.z9e ()I
      // 0bf: istore 10
      // 0c1: bipush 0
      // 0c2: istore 11
      // 0c4: aload 8
      // 0c6: iload 4
      // 0c8: ifne 0de
      // 0cb: ifnull 0e8
      // 0ce: goto 0d5
      // 0d1: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: aload 8
      // 0d7: invokevirtual mew.getX ()I
      // 0da: istore 9
      // 0dc: aload 8
      // 0de: invokevirtual mew.getZ ()I
      // 0e1: istore 11
      // 0e3: iload 4
      // 0e5: ifeq 105
      // 0e8: getstatic dug.qa4 Lorg/apache/logging/log4j/Logger;
      // 0eb: sipush 31181
      // 0ee: ldc2_w 7505606049614464017
      // 0f1: lload 2
      // 0f2: lxor
      // 0f3: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: nop
      // 0f9: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 0fe: goto 105
      // 101: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: bipush 0
      // 106: istore 12
      // 108: aload 0
      // 109: getfield dug.vzz Lupn;
      // 10c: iload 9
      // 10e: iload 11
      // 110: invokevirtual upn.au7 (II)Z
      // 113: ifne 14c
      // 116: iload 9
      // 118: aload 7
      // 11a: bipush 64
      // 11c: invokevirtual java/util/Random.nextInt (I)I
      // 11f: aload 7
      // 121: bipush 64
      // 123: invokevirtual java/util/Random.nextInt (I)I
      // 126: isub
      // 127: iadd
      // 128: istore 9
      // 12a: iload 11
      // 12c: aload 7
      // 12e: bipush 64
      // 130: invokevirtual java/util/Random.nextInt (I)I
      // 133: aload 7
      // 135: bipush 64
      // 137: invokevirtual java/util/Random.nextInt (I)I
      // 13a: isub
      // 13b: iadd
      // 13c: istore 11
      // 13e: iinc 12 1
      // 141: iload 12
      // 143: sipush 1000
      // 146: if_icmpne 108
      // 149: goto 14c
      // 14c: aload 0
      // 14d: getfield dug.t9z Lcog;
      // 150: new mew
      // 153: dup
      // 154: iload 9
      // 156: iload 10
      // 158: iload 11
      // 15a: invokespecial mew.<init> (III)V
      // 15d: invokevirtual cog.d2x (Lmew;)V
      // 160: aload 0
      // 161: iload 4
      // 163: ifne 180
      // 166: bipush 0
      // 167: putfield dug.ka0 Z
      // 16a: aload 1
      // 16b: invokevirtual h50.r12 ()Z
      // 16e: ifeq 183
      // 171: goto 178
      // 174: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: aload 0
      // 179: goto 180
      // 17c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: invokevirtual dug.hlp ()V
      // 183: return
   }

   public void hlp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new vqp
      // 03: dup
      // 04: getstatic dug.hsf Ljava/util/List;
      // 07: bipush 10
      // 09: invokespecial vqp.<init> (Ljava/util/List;I)V
      // 0c: astore 2
      // 0d: invokestatic t9d.b ()I
      // 10: bipush 0
      // 11: istore 3
      // 12: istore 1
      // 13: iload 3
      // 14: bipush 10
      // 16: if_icmpge 8f
      // 19: aload 0
      // 1a: getfield dug.t9z Lcog;
      // 1d: invokevirtual cog.c21 ()I
      // 20: aload 0
      // 21: getfield dug.fsy Ljava/util/Random;
      // 24: bipush 6
      // 26: invokevirtual java/util/Random.nextInt (I)I
      // 29: iadd
      // 2a: aload 0
      // 2b: getfield dug.fsy Ljava/util/Random;
      // 2e: bipush 6
      // 30: invokevirtual java/util/Random.nextInt (I)I
      // 33: isub
      // 34: istore 4
      // 36: aload 0
      // 37: getfield dug.t9z Lcog;
      // 3a: invokevirtual cog.ans ()I
      // 3d: aload 0
      // 3e: getfield dug.fsy Ljava/util/Random;
      // 41: bipush 6
      // 43: invokevirtual java/util/Random.nextInt (I)I
      // 46: iadd
      // 47: aload 0
      // 48: getfield dug.fsy Ljava/util/Random;
      // 4b: bipush 6
      // 4d: invokevirtual java/util/Random.nextInt (I)I
      // 50: isub
      // 51: istore 5
      // 53: aload 0
      // 54: new mew
      // 57: dup
      // 58: iload 4
      // 5a: bipush 0
      // 5b: iload 5
      // 5d: invokespecial mew.<init> (III)V
      // 60: invokevirtual dug.pnv (Lmew;)Lmew;
      // 63: invokevirtual mew.nuv ()Lmew;
      // 66: astore 6
      // 68: iload 1
      // 69: ifeq 8b
      // 6c: aload 2
      // 6d: aload 0
      // 6e: aload 0
      // 6f: getfield dug.fsy Ljava/util/Random;
      // 72: aload 6
      // 74: invokevirtual vqp.v3g (Lt9d;Ljava/util/Random;Lmew;)Z
      // 77: ifeq 88
      // 7a: goto 81
      // 7d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: goto 8f
      // 84: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: iinc 3 1
      // 8b: iload 1
      // 8c: ifne 13
      // 8f: return
   }

   public mew tk1() {
      return this.vzz.iw9();
   }

   public void w3w(boolean param1, sw6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic dug.b J
      // 03: ldc2_w 90790023804818
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: getfield dug.jro Lg6k;
      // 11: invokeinterface g6k.pj4 ()Z 1
      // 16: ifeq f4
      // 19: aload 2
      // 1a: iload 5
      // 1c: ifne 5c
      // 1f: goto 26
      // 22: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: ifnull 4b
      // 29: goto 30
      // 2c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 2
      // 31: sipush 20746
      // 34: ldc2_w 366346169088082535
      // 37: lload 3
      // 38: lxor
      // 39: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: invokeinterface sw6.pg4 (Ljava/lang/String;)V 2
      // 44: goto 4b
      // 47: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual dug.u54 ()V
      // 4f: iload 5
      // 51: ifne 86
      // 54: aload 2
      // 55: goto 5c
      // 58: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: ifnull 7a
      // 5f: aload 2
      // 60: sipush 18793
      // 63: ldc2_w 1135033021069236751
      // 66: lload 3
      // 67: lxor
      // 68: invokedynamic w (IJ)Ljava/lang/String; bsm=dug.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: invokeinterface sw6.an6 (Ljava/lang/String;)V 2
      // 73: goto 7a
      // 76: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield dug.jro Lg6k;
      // 7e: iload 1
      // 7f: aload 2
      // 80: invokeinterface g6k.va4 (ZLsw6;)Z 3
      // 85: pop
      // 86: aload 0
      // 87: getfield dug.kil Lgvi;
      // 8a: invokevirtual gvi.vrp ()Ljava/util/List;
      // 8d: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 90: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 93: astore 6
      // 95: aload 6
      // 97: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 9c: ifeq f4
      // 9f: aload 6
      // a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a6: checkcast tts
      // a9: astore 7
      // ab: aload 7
      // ad: ifnull ef
      // b0: aload 0
      // b1: iload 5
      // b3: ifne df
      // b6: goto bd
      // b9: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: getfield dug.qka Ley1;
      // c0: aload 7
      // c2: getfield tts.nzx I
      // c5: aload 7
      // c7: getfield tts.yxl I
      // ca: invokevirtual ey1.cwk (II)Z
      // cd: ifne ef
      // d0: goto d7
      // d3: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d6: athrow
      // d7: aload 0
      // d8: goto df
      // db: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // de: athrow
      // df: getfield dug.kil Lgvi;
      // e2: aload 7
      // e4: getfield tts.nzx I
      // e7: aload 7
      // e9: getfield tts.yxl I
      // ec: invokevirtual gvi.ztg (II)V
      // ef: iload 5
      // f1: ifeq 95
      // f4: return
   }

   public void bt7() {
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
      // 05: getfield dug.jro Lg6k;
      // 08: iload 1
      // 09: ifne 26
      // 0c: invokeinterface g6k.pj4 ()Z 1
      // 11: ifeq 2b
      // 14: goto 1b
      // 17: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield dug.jro Lg6k;
      // 1f: goto 26
      // 22: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: invokeinterface g6k.hua ()V 1
      // 2b: return
   }

   public void u54() {
      this.f_u();
      this.t9z.hum(this.fve().cuf());
      this.t9z.fbt(this.fve().nf3());
      this.t9z.bfu(this.fve().ad0());
      this.t9z.ftb(this.fve().x5x());
      this.t9z._lr(this.fve().k98());
      this.t9z.eqk(this.fve().skm());
      this.t9z.c7e(this.fve().xyx());
      this.t9z.v4w(this.fve().uz5());
      this.t9z.z1o(this.fve().a2z());
      this.ujg.oh5(this.t9z, this.s4x.wh3().u2u());
      this.hqr._0a();
   }

   @Override
   public void m8m(i2h var1) {
      super.m8m(var1);
      int var10000 = t9d.c();
      this.twi.yfe(var1.jwu(), var1);
      this.iqq.put(var1.b_q(), var1);
      int var2 = var10000;
      i2h[] var3 = var1.u_g();
      if (var3 != null) {
         int var4 = 0;

         while (var4 < var3.length) {
            this.twi.yfe(var3[var4].jwu(), var3[var4]);
            var4++;
            if (var2 != 0) {
               break;
            }
         }
      }
   }

   @Override
   public void cvm(i2h var1) {
      super.cvm(var1);
      int var10000 = t9d.b();
      this.twi.un9(var1.jwu());
      int var2 = var10000;
      this.iqq.remove(var1.b_q());
      i2h[] var3 = var1.u_g();
      if (var3 != null) {
         int var4 = 0;

         while (var4 < var3.length) {
            this.twi.un9(var3[var4].jwu());
            var4++;
            if (var2 == 0) {
               break;
            }
         }
      }
   }

   @Override
   public boolean _b8(i2h param1) {
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
      // 05: aload 1
      // 06: invokespecial t9d._b8 (Li2h;)Z
      // 09: iload 2
      // 0a: ifne 46
      // 0d: ifeq 45
      // 10: goto 17
      // 13: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: getfield dug.s4x Lvr1;
      // 1b: invokevirtual vr1.wh3 ()Lwlx;
      // 1e: aload 1
      // 1f: getfield i2h.o2v D
      // 22: aload 1
      // 23: getfield i2h.kfp D
      // 26: aload 1
      // 27: getfield i2h.vbd D
      // 2a: ldc2_w 512.0
      // 2d: aload 0
      // 2e: getfield dug.vzz Lupn;
      // 31: invokevirtual upn.gs_ ()I
      // 34: new net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity
      // 37: dup
      // 38: aload 1
      // 39: invokespecial net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.<init> (Li2h;)V
      // 3c: invokevirtual wlx.dyz (DDDDILmz2;)V
      // 3f: bipush 1
      // 40: ireturn
      // 41: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   @Override
   public void qyn(i2h var1, byte var2) {
      this.fp4().wru(var1, new S19PacketEntityStatus(var1, var2));
   }

   @Override
   public vu6 dta(i2h param1, double param2, double param4, double param6, float param8, boolean param9, boolean param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new vu6
      // 03: dup
      // 04: aload 0
      // 05: aload 1
      // 06: dload 2
      // 07: dload 4
      // 09: dload 6
      // 0b: fload 8
      // 0d: iload 9
      // 0f: iload 10
      // 11: invokespecial vu6.<init> (Lt9d;Li2h;DDDFZZ)V
      // 14: astore 12
      // 16: invokestatic t9d.b ()I
      // 19: aload 12
      // 1b: invokevirtual vu6.zj7 ()V
      // 1e: istore 11
      // 20: aload 12
      // 22: iload 11
      // 24: ifeq 40
      // 27: bipush 0
      // 28: invokevirtual vu6.vw3 (Z)V
      // 2b: iload 10
      // 2d: ifne 43
      // 30: goto 37
      // 33: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 12
      // 39: goto 40
      // 3c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: invokevirtual vu6.cvs ()V
      // 43: aload 0
      // 44: getfield dug.rpk Ljava/util/List;
      // 47: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4c: astore 13
      // 4e: aload 13
      // 50: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55: ifeq ba
      // 58: aload 13
      // 5a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5f: checkcast ha9
      // 62: astore 14
      // 64: aload 14
      // 66: iload 11
      // 68: ifeq 8a
      // 6b: dload 2
      // 6c: dload 4
      // 6e: dload 6
      // 70: invokevirtual ha9.p53 (DDD)D
      // 73: ldc2_w 4096.0
      // 76: dcmpg
      // 77: ifge b5
      // 7a: goto 81
      // 7d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: aload 14
      // 83: goto 8a
      // 86: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: checkcast z96
      // 8d: getfield z96.rhh Lmlk;
      // 90: new net/minecraft/network/play/server/S27PacketExplosion
      // 93: dup
      // 94: dload 2
      // 95: dload 4
      // 97: dload 6
      // 99: fload 8
      // 9b: aload 12
      // 9d: invokevirtual vu6.egt ()Ljava/util/List;
      // a0: aload 12
      // a2: invokevirtual vu6.xpv ()Ljava/util/Map;
      // a5: aload 14
      // a7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // ac: checkcast fqr
      // af: invokespecial net/minecraft/network/play/server/S27PacketExplosion.<init> (DDDFLjava/util/List;Lfqr;)V
      // b2: invokevirtual mlk.vnf (Lmz2;)V
      // b5: iload 11
      // b7: ifne 4e
      // ba: aload 12
      // bc: areturn
   }

   @Override
   public void dfj(mew var1, e0x var2, int var3, int var4) {
      mr_ var6 = new mr_(var1, var2, var3, var4);
      int var10000 = t9d.b();
      Iterator var7 = this.ojm[this.egn].iterator();
      int var5 = var10000;

      while (true) {
         if (var7.hasNext()) {
            mr_ var8 = (mr_)var7.next();

            try {
               boolean var10 = var8.equals(var6);
               if (var5 == 0) {
                  break;
               }

               if (var10) {
                  return;
               }
            } catch (IllegalStateException var9) {
               throw a(var9);
            }

            if (var5 != 0) {
               continue;
            }
         }

         this.ojm[this.egn].add(var6);
         break;
      }
   }

   private void hqw() {
      int var1 = t9d.b();

      label48:
      while (true) {
         boolean var10000 = this.ojm[this.egn].isEmpty();

         label46:
         while (!var10000) {
            int var2 = this.egn;
            this.egn ^= 1;

            for (mr_ var4 : this.ojm[var2]) {
               label40: {
                  label54: {
                     try {
                        var6 = this;
                        if (var1 == 0) {
                           break label54;
                        }

                        var10000 = this.cqp(var4);
                        if (var1 == 0) {
                           continue label46;
                        }
                     } catch (IllegalStateException var5) {
                        throw a(var5);
                     }

                     if (!var10000) {
                        break label40;
                     }

                     var6 = this;
                  }

                  var6.s4x
                     .wh3()
                     .dyz(
                        (double)var4.fi2().getX(),
                        (double)var4.fi2().getY(),
                        (double)var4.fi2().getZ(),
                        64.0,
                        this.vzz.gs_(),
                        new S24PacketBlockAction(var4.fi2(), var4.mqh(), var4.w0v(), var4._l4())
                     );
               }

               if (var1 == 0) {
                  break;
               }
            }

            this.ojm[var2].clear();
            if (var1 == 0) {
               return;
            }
            continue label48;
         }

         return;
      }
   }

   private boolean cqp(mr_ param1) {
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
      // 06: invokevirtual mr_.fi2 ()Lmew;
      // 09: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 0c: astore 3
      // 0d: aload 3
      // 0e: invokeinterface zfz.r_y ()Le0x; 1
      // 13: iload 2
      // 14: ifeq 32
      // 17: aload 1
      // 18: invokevirtual mr_.mqh ()Le0x;
      // 1b: if_acmpne 46
      // 1e: goto 25
      // 21: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 3
      // 26: invokeinterface zfz.r_y ()Le0x; 1
      // 2b: goto 32
      // 2e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 0
      // 33: aload 1
      // 34: invokevirtual mr_.fi2 ()Lmew;
      // 37: aload 3
      // 38: aload 1
      // 39: invokevirtual mr_.w0v ()I
      // 3c: aload 1
      // 3d: invokevirtual mr_._l4 ()I
      // 40: invokevirtual e0x.ng5 (Lt9d;Lmew;Lzfz;II)Z
      // 43: goto 47
      // 46: bipush 0
      // 47: ireturn
   }

   public void wo7() {
      this.ujg.vpx();
   }

   @Override
   public void hk_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual dug.xqu ()Z
      // 004: istore 2
      // 005: invokestatic t9d.b ()I
      // 008: aload 0
      // 009: invokespecial t9d.hk_ ()V
      // 00c: istore 1
      // 00d: aload 0
      // 00e: getfield dug.n28 F
      // 011: aload 0
      // 012: getfield dug.wni F
      // 015: fcmpl
      // 016: iload 1
      // 017: ifeq 052
      // 01a: ifeq 049
      // 01d: goto 024
      // 020: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: aload 0
      // 025: getfield dug.s4x Lvr1;
      // 028: invokevirtual vr1.wh3 ()Lwlx;
      // 02b: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 02e: dup
      // 02f: bipush 7
      // 031: aload 0
      // 032: getfield dug.wni F
      // 035: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 038: aload 0
      // 039: getfield dug.vzz Lupn;
      // 03c: invokevirtual upn.gs_ ()I
      // 03f: invokevirtual wlx.qvv (Lmz2;I)V
      // 042: goto 049
      // 045: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: aload 0
      // 04a: getfield dug.o2u F
      // 04d: aload 0
      // 04e: getfield dug.dqw F
      // 051: fcmpl
      // 052: iload 1
      // 053: ifeq 086
      // 056: ifeq 085
      // 059: goto 060
      // 05c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield dug.s4x Lvr1;
      // 064: invokevirtual vr1.wh3 ()Lwlx;
      // 067: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 06a: dup
      // 06b: bipush 8
      // 06d: aload 0
      // 06e: getfield dug.dqw F
      // 071: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 074: aload 0
      // 075: getfield dug.vzz Lupn;
      // 078: invokevirtual upn.gs_ ()I
      // 07b: invokevirtual wlx.qvv (Lmz2;I)V
      // 07e: goto 085
      // 081: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: iload 2
      // 086: iload 1
      // 087: ifeq 0a0
      // 08a: aload 0
      // 08b: invokevirtual dug.xqu ()Z
      // 08e: if_icmpeq 109
      // 091: goto 098
      // 094: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 097: athrow
      // 098: iload 2
      // 099: goto 0a0
      // 09c: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: ifeq 0c1
      // 0a3: aload 0
      // 0a4: getfield dug.s4x Lvr1;
      // 0a7: invokevirtual vr1.wh3 ()Lwlx;
      // 0aa: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 0ad: dup
      // 0ae: bipush 2
      // 0af: fconst_0
      // 0b0: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 0b3: invokevirtual wlx.v3l (Lmz2;)V
      // 0b6: iload 1
      // 0b7: ifne 0db
      // 0ba: goto 0c1
      // 0bd: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield dug.s4x Lvr1;
      // 0c5: invokevirtual vr1.wh3 ()Lwlx;
      // 0c8: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 0cb: dup
      // 0cc: bipush 1
      // 0cd: fconst_0
      // 0ce: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 0d1: invokevirtual wlx.v3l (Lmz2;)V
      // 0d4: goto 0db
      // 0d7: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: getfield dug.s4x Lvr1;
      // 0df: invokevirtual vr1.wh3 ()Lwlx;
      // 0e2: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 0e5: dup
      // 0e6: bipush 7
      // 0e8: aload 0
      // 0e9: getfield dug.wni F
      // 0ec: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 0ef: invokevirtual wlx.v3l (Lmz2;)V
      // 0f2: aload 0
      // 0f3: getfield dug.s4x Lvr1;
      // 0f6: invokevirtual vr1.wh3 ()Lwlx;
      // 0f9: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 0fc: dup
      // 0fd: bipush 8
      // 0ff: aload 0
      // 100: getfield dug.dqw F
      // 103: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 106: invokevirtual wlx.v3l (Lmz2;)V
      // 109: return
   }

   @Override
   public int _hl() {
      return this.s4x.wh3().pci();
   }

   public vr1 ve6() {
      return this.s4x;
   }

   public qpc fp4() {
      return this.clb;
   }

   public ey1 gez() {
      return this.qka;
   }

   public ooh i4a() {
      return this._kf;
   }

   public void zra(w_0 var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15, int[] var17) {
      this.zza(var1, false, var2, var4, var6, var8, var9, var11, var13, var15, var17);
   }

   public void zza(
      w_0 param1,
      boolean param2,
      double param3,
      double param5,
      double param7,
      int param9,
      double param10,
      double param12,
      double param14,
      double param16,
      int[] param18
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new net/minecraft/network/play/server/S2APacketParticles
      // 03: dup
      // 04: aload 1
      // 05: iload 2
      // 06: dload 3
      // 07: d2f
      // 08: dload 5
      // 0a: d2f
      // 0b: dload 7
      // 0d: d2f
      // 0e: dload 10
      // 10: d2f
      // 11: dload 12
      // 13: d2f
      // 14: dload 14
      // 16: d2f
      // 17: dload 16
      // 19: d2f
      // 1a: iload 9
      // 1c: aload 18
      // 1e: invokespecial net/minecraft/network/play/server/S2APacketParticles.<init> (Lw_0;ZFFFFFFFI[I)V
      // 21: astore 20
      // 23: invokestatic t9d.b ()I
      // 26: bipush 0
      // 27: istore 21
      // 29: istore 19
      // 2b: iload 21
      // 2d: aload 0
      // 2e: getfield dug.rpk Ljava/util/List;
      // 31: invokeinterface java/util/List.size ()I 1
      // 36: if_icmpge aa
      // 39: aload 0
      // 3a: getfield dug.rpk Ljava/util/List;
      // 3d: iload 21
      // 3f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 44: checkcast z96
      // 47: astore 22
      // 49: aload 22
      // 4b: invokevirtual z96.d3d ()Lmew;
      // 4e: astore 23
      // 50: aload 23
      // 52: dload 3
      // 53: dload 5
      // 55: dload 7
      // 57: invokevirtual mew.p4e (DDD)D
      // 5a: dstore 24
      // 5c: dload 24
      // 5e: ldc2_w 256.0
      // 61: dcmpg
      // 62: iload 19
      // 64: ifeq 72
      // 67: ifle 91
      // 6a: goto 71
      // 6d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: iload 2
      // 72: iload 19
      // 74: ifeq 8e
      // 77: ifeq a2
      // 7a: goto 81
      // 7d: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: dload 24
      // 83: ldc2_w 65536.0
      // 86: dcmpg
      // 87: goto 8e
      // 8a: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: ifgt a2
      // 91: aload 22
      // 93: getfield z96.rhh Lmlk;
      // 96: aload 20
      // 98: invokevirtual mlk.vnf (Lmz2;)V
      // 9b: goto a2
      // 9e: invokestatic dug.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: iinc 21 1
      // a5: iload 19
      // a7: ifne 2b
      // aa: return
   }

   public i2h yzl(UUID var1) {
      return (i2h)this.iqq.get(var1);
   }

   @Override
   public ListenableFuture acd(Runnable var1) {
      return this.s4x.acd(var1);
   }

   @Override
   public boolean xii() {
      return this.s4x.xii();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6699295493992522405L, 8505391361870021511L, MethodHandles.lookup().lookupClass()).a(124353805651614L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 120099264745633L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[28];
      int var7 = 0;
      String var6 = "Ê¯Ùñ^ \u0010¿Ì\u000e'TD¦\u001428³[zT\u00028N õÅ\u0002[\u008dª©ïl|ma\u000b<¯\u0081Yãú©%áu w wð\u009b'Ï\u0005\u0086¾\u0096ëý\u0001UCì\u0084\u0011)@7º!_6\u0087'NNOx ;ªö<f|ýÏ¨´\u009bünyÞ\u008b\u0094ìtß\u0007\u0095U\u0087\u0085<Ö§`¨\u0097» \u000fä\u008aPR²²ò\u0002\u0084]©¶ÈÓ-Ã\u0010ÊÝqæ\u009cý\u0098¢ËXÒ¾á.\u0010Ê¿H\u000bé\u009f|\u0080ç\u0007\u00adÒý`[æ\u0018\u0004\u0015\u0093¡4\u0015ó»\u0085bãOð1Ö\u0001qÅ1J\bBr\u0015\u0010±@ßüb®%'?52^\u0011¹\u0098â\u0018\u0010P\u0090©6×\u0006\u0005ü#ýDA\u008fz)Ë Ccð£\u000b\u0082 \u000e2KS\u0099ª\u0006p¦\n).Sê/V\\õ\u00adà4(\n×Ï\u0094\u0019\u008côÕøÃ\u0010öîF\u0019b´÷ð Le\u008d\u008c!Ñ&\u0018s[ó\u008fq è:M*Ã³Ü°e.çðÔ\u009e!}\u0095m P\u000eß|\u0082\u0086@¦\u0083\u0013\u00adf*älX\u009bê\u009d§±>\u0018\u0013DÛ\r\u009f\u008dø}\u0095 Ø5\u0082a&6'\u0084Ó>3öê]0\"^î\u008a\u0097,\u001c\u0010KL&I\u0098³MSY !rZå¨ÊÄð\u008e\u0082×«\\s?ôÍDH\u0099³nQú\u007ffíT\u009a\u008d+\u008c è\u0016fqBo\u0084\bö\u0005²O4,È\u008fS£W\u0004=\u0090¼~Õ\u0083\u0000\u00ad¡Ø\u008f\u0016\u0018GÏ\u0092\u0084\u009fÝ¼Ì9öÆ7p\u0086\u009d>\u008bQÓ\u009cË%OÇ \u000e¶P%ÐôÕ©Ä{²Ámº\u0007&M4^ß_aq?\u008b*m\u001dî\u007fná\u0010ó\u0084h\u0014*\u0094·Þ=ïÇ\u0014\u0019¢ÙO \u0090goÄhE·tWø\u0014Ü\n¹\rjs4y\u001e\u0012\u0099\b\u0018\\ð\u008b_}^\u0083\u0084(\u0091¢X\u008a¾\u009cüxSúu\u008e\u0010¦Pú!Àð0,\u008ep\u008e<¤°\u0086\u000f¹×%Y£\u000b\u0083,\f\u009e\u0093\u0018\u0014®\u0081\u0092Ì\u0015¯h¥NõYs\u0010\u0080\u001aâ½\u0085ÁÍê\u0000\\\u0018,Ã&Ùç×\u0096¯ÄÊJ*\u0086uþûÍ\u000b\u009bù'ù\b\u0087 \u001dÿ\u009c SÀÒªc»ÄÍL\u0091ÿ_quC©y»\u009d>à.\u0012vG\r${8W¦üßFxçïÐ*s\u0099#Ø÷3X®äÿëÃìbã®¸x\u0084´%\u0085®~\u0082Èõ\u0013\u0097\u0015cØ+Ì¬ÙGÉ={þã\\$-ÿ8Ü7;\u008e\u000f\u008c\u0006¨¼ü´\f¸\u0083º\u008a|\u0095ÒHÔIà¶\u008d>ïrÃr\u0012¸\u0007±è\u009b\u0016\u0000ÄÃöx_\u001d\u0089;\u001bÛhÊ¦Ù\ró¥¹ \u0016±$\u009bÛ\u009f;%_ë½\u009am\u001e\u0007êó\u0016§\u0001\fÃùy\u009b«\r-ïKgÞ";
      int var8 = "Ê¯Ùñ^ \u0010¿Ì\u000e'TD¦\u001428³[zT\u00028N õÅ\u0002[\u008dª©ïl|ma\u000b<¯\u0081Yãú©%áu w wð\u009b'Ï\u0005\u0086¾\u0096ëý\u0001UCì\u0084\u0011)@7º!_6\u0087'NNOx ;ªö<f|ýÏ¨´\u009bünyÞ\u008b\u0094ìtß\u0007\u0095U\u0087\u0085<Ö§`¨\u0097» \u000fä\u008aPR²²ò\u0002\u0084]©¶ÈÓ-Ã\u0010ÊÝqæ\u009cý\u0098¢ËXÒ¾á.\u0010Ê¿H\u000bé\u009f|\u0080ç\u0007\u00adÒý`[æ\u0018\u0004\u0015\u0093¡4\u0015ó»\u0085bãOð1Ö\u0001qÅ1J\bBr\u0015\u0010±@ßüb®%'?52^\u0011¹\u0098â\u0018\u0010P\u0090©6×\u0006\u0005ü#ýDA\u008fz)Ë Ccð£\u000b\u0082 \u000e2KS\u0099ª\u0006p¦\n).Sê/V\\õ\u00adà4(\n×Ï\u0094\u0019\u008côÕøÃ\u0010öîF\u0019b´÷ð Le\u008d\u008c!Ñ&\u0018s[ó\u008fq è:M*Ã³Ü°e.çðÔ\u009e!}\u0095m P\u000eß|\u0082\u0086@¦\u0083\u0013\u00adf*älX\u009bê\u009d§±>\u0018\u0013DÛ\r\u009f\u008dø}\u0095 Ø5\u0082a&6'\u0084Ó>3öê]0\"^î\u008a\u0097,\u001c\u0010KL&I\u0098³MSY !rZå¨ÊÄð\u008e\u0082×«\\s?ôÍDH\u0099³nQú\u007ffíT\u009a\u008d+\u008c è\u0016fqBo\u0084\bö\u0005²O4,È\u008fS£W\u0004=\u0090¼~Õ\u0083\u0000\u00ad¡Ø\u008f\u0016\u0018GÏ\u0092\u0084\u009fÝ¼Ì9öÆ7p\u0086\u009d>\u008bQÓ\u009cË%OÇ \u000e¶P%ÐôÕ©Ä{²Ámº\u0007&M4^ß_aq?\u008b*m\u001dî\u007fná\u0010ó\u0084h\u0014*\u0094·Þ=ïÇ\u0014\u0019¢ÙO \u0090goÄhE·tWø\u0014Ü\n¹\rjs4y\u001e\u0012\u0099\b\u0018\\ð\u008b_}^\u0083\u0084(\u0091¢X\u008a¾\u009cüxSúu\u008e\u0010¦Pú!Àð0,\u008ep\u008e<¤°\u0086\u000f¹×%Y£\u000b\u0083,\f\u009e\u0093\u0018\u0014®\u0081\u0092Ì\u0015¯h¥NõYs\u0010\u0080\u001aâ½\u0085ÁÍê\u0000\\\u0018,Ã&Ùç×\u0096¯ÄÊJ*\u0086uþûÍ\u000b\u009bù'ù\b\u0087 \u001dÿ\u009c SÀÒªc»ÄÍL\u0091ÿ_quC©y»\u009d>à.\u0012vG\r${8W¦üßFxçïÐ*s\u0099#Ø÷3X®äÿëÃìbã®¸x\u0084´%\u0085®~\u0082Èõ\u0013\u0097\u0015cØ+Ì¬ÙGÉ={þã\\$-ÿ8Ü7;\u008e\u000f\u008c\u0006¨¼ü´\f¸\u0083º\u008a|\u0095ÒHÔIà¶\u008d>ïrÃr\u0012¸\u0007±è\u009b\u0016\u0000ÄÃöx_\u001d\u0089;\u001bÛhÊ¦Ù\ró¥¹ \u0016±$\u009bÛ\u009f;%_ë½\u009am\u001e\u0007êó\u0016§\u0001\fÃùy\u009b«\r-ïKgÞ"
         .length();
      char var5 = '0';
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
                     g = var9;
                     h = new String[28];
                     qa4 = LogManager.getLogger();
                     hsf = Lists.newArrayList(
                        new ypi[]{
                           new ypi(xbr.t1j, 0, 1, 3, 10),
                           new ypi(u7m.gfm(ox_.wb7), 0, 1, 3, 10),
                           new ypi(u7m.gfm(ox_.uom), 0, 1, 3, 10),
                           new ypi(xbr.u_x, 0, 1, 1, 3),
                           new ypi(xbr.l_0, 0, 1, 1, 5),
                           new ypi(xbr.cp_, 0, 1, 1, 3),
                           new ypi(xbr.xcf, 0, 1, 1, 5),
                           new ypi(xbr.lym, 0, 2, 3, 5),
                           new ypi(xbr.nfb, 0, 2, 3, 3),
                           new ypi(u7m.gfm(ox_.a4y), 0, 1, 3, 10)
                        }
                     );
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

                  var6 = "\u0004åæ\u0003\u0080\u009c\u008c]ÑÀ\u009cÅ°XÈÄ0^1k\\CÈd¬Y\u0016\u008czÂJ ]I3ò51']\u009e{ËÉ\r;\u0011Áo*0`ï?ñî Ìkæ\u0085û$êÐ)Ê1³(é\u0007\u0014\u001dáqHBÎ\u008aé¹\u0086>\\\u000eàXF";
                  var8 = "\u0004åæ\u0003\u0080\u009c\u008c]ÑÀ\u009cÅ°XÈÄ0^1k\\CÈd¬Y\u0016\u008czÂJ ]I3ò51']\u009e{ËÉ\r;\u0011Áo*0`ï?ñî Ìkæ\u0085û$êÐ)Ê1³(é\u0007\u0014\u001dáqHBÎ\u008aé¹\u0086>\\\u000eàXF"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25515;
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
            throw new RuntimeException("dug", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("dug" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
