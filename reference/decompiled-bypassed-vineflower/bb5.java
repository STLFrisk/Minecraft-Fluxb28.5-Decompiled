import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bb5 extends j1s {
   public static cn7 r02;
   public static c_3 s2e;
   public static crk wpc;
   public static cn7 cwj;
   public static cn7 __u;
   public static crk u_q;
   public static crk duw;
   public static crk m7n;
   private ArrayList jbr;
   public q6h yli;
   public q6h vkn;
   public boolean o86;
   public boolean cbq;
   public boolean k45;
   public double vxv;
   public double[] h80;
   public double io_;
   public double czg;
   public int u4g;
   public int dvc;
   public int d3a;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public bb5() {
      long var1 = a ^ 6469463310359L;
      super(a<"b">(23823, 2065472239126539534L ^ var1), a<"b">(20019, 944580284791455271L ^ var1));
      this.jbr = new ArrayList();
      this.yli = new q6h();
      this.vkn = new q6h();
   }

   @jev
   public void wvy(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 3d
      // 09: invokevirtual wbh.nlg ()Lmz2;
      // 0c: instanceof net/minecraft/network/play/server/S12PacketEntityVelocity
      // 0f: ifne 35
      // 12: goto 19
      // 15: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: iload 2
      // 1b: ifne 3d
      // 1e: goto 25
      // 21: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: invokevirtual wbh.nlg ()Lmz2;
      // 28: instanceof net/minecraft/network/play/server/S27PacketExplosion
      // 2b: ifeq 41
      // 2e: goto 35
      // 31: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: goto 3d
      // 39: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: invokevirtual wbh.wxi (Z)V
      // 41: return
   }

   @jev
   public void djx(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual ihr.bbi ()Lmz2;
      // 08: astore 3
      // 09: getstatic bb5.__u Lcn7;
      // 0c: invokevirtual cn7.g7m ()Z
      // 0f: iload 2
      // 10: ifeq 43
      // 13: ifne 36
      // 16: goto 1d
      // 19: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield bb5.cbq Z
      // 21: iload 2
      // 22: ifeq 43
      // 25: goto 2c
      // 28: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: ifne 98
      // 2f: goto 36
      // 32: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: getstatic j83.ef8 Lj83;
      // 39: invokevirtual j83.gln ()Z
      // 3c: goto 43
      // 3f: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: iload 2
      // 44: ifeq 5c
      // 47: ifeq 98
      // 4a: goto 51
      // 4d: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 3
      // 52: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 55: goto 5c
      // 58: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: iload 2
      // 5d: ifeq 92
      // 60: ifne 83
      // 63: goto 6a
      // 66: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 3
      // 6b: instanceof net/minecraft/network/play/client/C13PacketPlayerAbilities
      // 6e: iload 2
      // 6f: ifeq 92
      // 72: goto 79
      // 75: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: ifeq 98
      // 7c: goto 83
      // 7f: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 0
      // 84: getfield bb5.jbr Ljava/util/ArrayList;
      // 87: aload 3
      // 88: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 8b: goto 92
      // 8e: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: pop
      // 93: aload 1
      // 94: bipush 1
      // 95: invokevirtual ihr.wxi (Z)V
      // 98: return
   }

   @Override
   public void w4v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bb5.a J
      // 003: ldc2_w 10018734069561
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: aload 0
      // 00e: getfield bb5.wyl Lc05;
      // 011: getfield c05.vg8 Ll86;
      // 014: getfield l86.o_8 F
      // 017: ldc 3.0
      // 019: nop
      // 01a: fcmpl
      // 01b: iload 3
      // 01c: ifeq 02a
      // 01f: iflt 02d
      // 022: goto 029
      // 025: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: bipush 1
      // 02a: goto 02e
      // 02d: bipush 0
      // 02e: putfield bb5.k45 Z
      // 031: aload 0
      // 032: getfield bb5.k45 Z
      // 035: iload 3
      // 036: ifeq 050
      // 039: ifne 118
      // 03c: goto 043
      // 03f: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: ldc2_w 0.01
      // 046: invokestatic p_c.xec (D)Z
      // 049: goto 050
      // 04c: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: iload 3
      // 051: ifeq 0a5
      // 054: ifne 090
      // 057: goto 05e
      // 05a: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: getstatic kgt.obu Li4o;
      // 061: bipush 0
      // 062: invokevirtual i4o.yse (Z)V
      // 065: sipush 365
      // 068: ldc2_w 847243749811775051
      // 06b: lload 1
      // 06c: lxor
      // 06d: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: nop
      // 073: sipush 24861
      // 076: ldc2_w 9082039252046415420
      // 079: lload 1
      // 07a: lxor
      // 07b: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: nop
      // 081: getstatic jgv$vro.ak0 Ljgv$vro;
      // 084: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 087: dconst_0
      // 088: invokestatic p_c.u7g (D)V
      // 08b: return
      // 08c: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield bb5.vkn Lq6h;
      // 094: iload 3
      // 095: ifeq 0f1
      // 098: ldc2_w 1000.0
      // 09b: invokevirtual q6h.hqu (D)Z
      // 09e: goto 0a5
      // 0a1: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: ifne 0da
      // 0a8: getstatic kgt.obu Li4o;
      // 0ab: bipush 0
      // 0ac: invokevirtual i4o.yse (Z)V
      // 0af: sipush 31538
      // 0b2: ldc2_w 4826001133267393545
      // 0b5: lload 1
      // 0b6: lxor
      // 0b7: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: nop
      // 0bd: sipush 16943
      // 0c0: ldc2_w 9197636307039298839
      // 0c3: lload 1
      // 0c4: lxor
      // 0c5: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: nop
      // 0cb: getstatic jgv$vro.ak0 Ljgv$vro;
      // 0ce: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 0d1: dconst_0
      // 0d2: invokestatic p_c.u7g (D)V
      // 0d5: return
      // 0d6: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: dconst_0
      // 0dc: putfield bb5.io_ D
      // 0df: aload 0
      // 0e0: getfield bb5.vkn Lq6h;
      // 0e3: invokevirtual q6h.u1k ()V
      // 0e6: aload 0
      // 0e7: getfield bb5.jbr Ljava/util/ArrayList;
      // 0ea: invokevirtual java/util/ArrayList.clear ()V
      // 0ed: aload 0
      // 0ee: getfield bb5.yli Lq6h;
      // 0f1: invokevirtual q6h.u1k ()V
      // 0f4: aload 0
      // 0f5: ldc2_w 0.005
      // 0f8: putfield bb5.vxv D
      // 0fb: aload 0
      // 0fc: aload 0
      // 0fd: aload 0
      // 0fe: bipush 0
      // 0ff: dup_x1
      // 100: putfield bb5.d3a I
      // 103: dup_x1
      // 104: putfield bb5.u4g I
      // 107: putfield bb5.dvc I
      // 10a: aload 0
      // 10b: aload 0
      // 10c: bipush 0
      // 10d: dup_x1
      // 10e: putfield bb5.cbq Z
      // 111: putfield bb5.o86 Z
      // 114: iload 3
      // 115: ifne 141
      // 118: sipush 31538
      // 11b: ldc2_w 4826001133267393545
      // 11e: lload 1
      // 11f: lxor
      // 120: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: nop
      // 126: sipush 25062
      // 129: ldc2_w 5358621106702157514
      // 12c: lload 1
      // 12d: lxor
      // 12e: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: nop
      // 134: getstatic jgv$vro.h_d Ljgv$vro;
      // 137: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 13a: goto 141
      // 13d: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 0
      // 142: invokespecial j1s.w4v ()V
      // 145: return
   }

   @Override
   public void i__() {
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
      // 06: ifne 4f
      // 09: getfield bb5.k45 Z
      // 0c: ifne 48
      // 0f: goto 16
      // 12: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield bb5.wyl Lc05;
      // 1a: invokevirtual c05.z8v ()Laba;
      // 1d: fconst_1
      // 1e: putfield aba.qeu F
      // 21: aload 0
      // 22: iload 1
      // 23: ifne 4f
      // 26: goto 2d
      // 29: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: getfield bb5.jbr Ljava/util/ArrayList;
      // 30: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 33: ifne 48
      // 36: goto 3d
      // 39: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: aload 0
      // 3e: invokevirtual bb5.qup ()V
      // 41: goto 48
      // 44: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: ldc2_w 0.2
      // 4b: invokestatic p_c.u7g (D)V
      // 4e: aload 0
      // 4f: invokespecial j1s.i__ ()V
      // 52: return
   }

   public void qup() {
      long var1 = a ^ 12987410369395L;
      int var3 = t9d.c();
      if (j83.ef8.gln()) {
         ncl.zpu(a<"b">(5389, 7991977621802020450L ^ var1));

         for (mz2 var5 : this.jbr) {
            try {
               this.wyl.c02()._m3().r92(var5);
               if (var3 != 0) {
                  return;
               }

               if (var3 != 0) {
                  break;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         this.jbr.clear();
      }
   }

   @jev
   public void da6(fz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bb5.a J
      // 003: ldc2_w 100266995455807
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 402
      // 013: getfield bb5.k45 Z
      // 016: ifne 3e4
      // 019: goto 020
      // 01c: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: getstatic bb5.__u Lcn7;
      // 023: invokevirtual cn7.g7m ()Z
      // 026: iload 4
      // 028: ifne 08f
      // 02b: goto 032
      // 02e: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: ifeq 077
      // 035: goto 03c
      // 038: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: getstatic kgt.nd5 Lfyk;
      // 03f: getfield fyk.kl3 Lnhs;
      // 042: invokevirtual nhs.zay ()V
      // 045: aload 0
      // 046: getfield bb5.yli Lq6h;
      // 049: ldc2_w 2300.0
      // 04c: invokevirtual q6h.hqu (D)Z
      // 04f: iload 4
      // 051: ifne 08f
      // 054: goto 05b
      // 057: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: ifeq 077
      // 05e: goto 065
      // 061: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: aload 0
      // 066: invokevirtual bb5.qup ()V
      // 069: aload 0
      // 06a: getfield bb5.yli Lq6h;
      // 06d: invokevirtual q6h.u1k ()V
      // 070: goto 077
      // 073: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: aload 0
      // 078: getfield bb5.wyl Lc05;
      // 07b: getfield c05.vg8 Ll86;
      // 07e: bipush 1
      // 07f: invokevirtual l86.fqc (Z)V
      // 082: aload 0
      // 083: getfield bb5.vkn Lq6h;
      // 086: getstatic bb5.u_q Lcrk;
      // 089: invokevirtual crk.u7t ()D
      // 08c: invokevirtual q6h.hqu (D)Z
      // 08f: iload 4
      // 091: ifne 0a9
      // 094: ifeq 419
      // 097: goto 09e
      // 09a: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield bb5.o86 Z
      // 0a2: goto 0a9
      // 0a5: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a8: athrow
      // 0a9: iload 4
      // 0ab: ifne 155
      // 0ae: ifne 130
      // 0b1: goto 0b8
      // 0b4: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: bipush 1
      // 0ba: putfield bb5.o86 Z
      // 0bd: aload 0
      // 0be: invokestatic p_c.tz6 ()D
      // 0c1: putfield bb5.czg D
      // 0c4: iload 4
      // 0c6: ifne 12f
      // 0c9: goto 0d0
      // 0cc: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cf: athrow
      // 0d0: getstatic bb5.cwj Lcn7;
      // 0d3: invokevirtual cn7.g7m ()Z
      // 0d6: ifeq 0f7
      // 0d9: goto 0e0
      // 0dc: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: bipush 0
      // 0e2: getstatic bb5.duw Lcrk;
      // 0e5: invokevirtual crk.u7t ()D
      // 0e8: d2i
      // 0e9: invokestatic p_c.vmu ()I
      // 0ec: iadd
      // 0ed: invokevirtual bb5._ap (ZI)V
      // 0f0: goto 0f7
      // 0f3: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield bb5.wyl Lc05;
      // 0fb: getfield c05.vg8 Ll86;
      // 0fe: invokevirtual l86.xv1 ()V
      // 101: aload 0
      // 102: bipush 3
      // 103: newarray 7
      // 105: dup
      // 106: bipush 0
      // 107: aload 0
      // 108: getfield bb5.wyl Lc05;
      // 10b: getfield c05.vg8 Ll86;
      // 10e: getfield l86.o2v D
      // 111: dastore
      // 112: dup
      // 113: bipush 1
      // 114: aload 0
      // 115: getfield bb5.wyl Lc05;
      // 118: getfield c05.vg8 Ll86;
      // 11b: getfield l86.kfp D
      // 11e: dastore
      // 11f: dup
      // 120: bipush 2
      // 121: aload 0
      // 122: getfield bb5.wyl Lc05;
      // 125: getfield c05.vg8 Ll86;
      // 128: getfield l86.vbd D
      // 12b: dastore
      // 12c: putfield bb5.h80 [D
      // 12f: return
      // 130: aload 0
      // 131: dup
      // 132: getfield bb5.d3a I
      // 135: bipush 1
      // 136: iadd
      // 137: putfield bb5.d3a I
      // 13a: aload 0
      // 13b: iload 4
      // 13d: ifne 1c5
      // 140: getfield bb5.d3a I
      // 143: i2f
      // 144: getstatic bb5.wpc Lcrk;
      // 147: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 14a: invokevirtual java/lang/Float.floatValue ()F
      // 14d: fcmpg
      // 14e: goto 155
      // 151: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 154: athrow
      // 155: ifge 1bd
      // 158: aload 0
      // 159: getfield bb5.wyl Lc05;
      // 15c: getfield c05.gze Laba;
      // 15f: getstatic bb5.s2e Lc_3;
      // 162: sipush 32336
      // 165: ldc2_w 7134159983542262139
      // 168: lload 2
      // 169: lxor
      // 16a: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: nop
      // 170: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 173: iload 4
      // 175: ifne 1a7
      // 178: goto 17f
      // 17b: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: ifeq 193
      // 182: goto 189
      // 185: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 188: athrow
      // 189: ldc 100.0
      // 18b: nop
      // 18c: goto 1b5
      // 18f: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: getstatic bb5.s2e Lc_3;
      // 196: sipush 6072
      // 199: ldc2_w 5722017306907226268
      // 19c: lload 2
      // 19d: lxor
      // 19e: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: nop
      // 1a4: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 1a7: ifeq 1b4
      // 1aa: ldc 5.0
      // 1ac: nop
      // 1ad: goto 1b5
      // 1b0: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: fconst_1
      // 1b5: putfield aba.qeu F
      // 1b8: iload 4
      // 1ba: ifeq 1cf
      // 1bd: aload 0
      // 1be: goto 1c5
      // 1c1: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c4: athrow
      // 1c5: getfield bb5.wyl Lc05;
      // 1c8: getfield c05.gze Laba;
      // 1cb: fconst_1
      // 1cc: putfield aba.qeu F
      // 1cf: getstatic bb5.s2e Lc_3;
      // 1d2: sipush 12071
      // 1d5: ldc2_w 6842211398448810012
      // 1d8: lload 2
      // 1d9: lxor
      // 1da: invokedynamic b (IJ)Ljava/lang/String; bsm=bb5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: nop
      // 1e0: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 1e3: ifeq 20d
      // 1e6: aload 0
      // 1e7: getfield bb5.wyl Lc05;
      // 1ea: getfield c05.gze Laba;
      // 1ed: aload 0
      // 1ee: getfield bb5.d3a I
      // 1f1: bipush 2
      // 1f2: irem
      // 1f3: ifne 207
      // 1f6: goto 1fd
      // 1f9: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fc: athrow
      // 1fd: ldc 5.0
      // 1ff: nop
      // 200: goto 20a
      // 203: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 206: athrow
      // 207: ldc 0.5
      // 209: nop
      // 20a: putfield aba.qeu F
      // 20d: ldc java/lang/String
      // 20f: nop
      // 210: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 213: bipush 76
      // 215: aaload
      // 216: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 219: pop
      // 21a: goto 240
      // 21d: astore 5
      // 21f: aload 0
      // 220: getfield bb5.wyl Lc05;
      // 223: getfield c05.vg8 Ll86;
      // 226: dconst_0
      // 227: putfield l86.mop D
      // 22a: aload 0
      // 22b: getfield bb5.wyl Lc05;
      // 22e: getfield c05.vg8 Ll86;
      // 231: dconst_0
      // 232: putfield l86.b_6 D
      // 235: aload 0
      // 236: getfield bb5.wyl Lc05;
      // 239: getfield c05.vg8 Ll86;
      // 23c: fconst_0
      // 23d: putfield l86._ge F
      // 240: aload 0
      // 241: getfield bb5.dvc I
      // 244: iload 4
      // 246: ifne 274
      // 249: bipush 1
      // 24a: if_icmpge 269
      // 24d: goto 254
      // 250: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 253: athrow
      // 254: getstatic kgt.nd5 Lfyk;
      // 257: getfield fyk.kl3 Lnhs;
      // 25a: invokevirtual nhs.zay ()V
      // 25d: iload 4
      // 25f: ifeq 293
      // 262: goto 269
      // 265: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 268: athrow
      // 269: aload 0
      // 26a: getfield bb5.cbq Z
      // 26d: goto 274
      // 270: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 273: athrow
      // 274: iload 4
      // 276: ifne 299
      // 279: ifne 293
      // 27c: goto 283
      // 27f: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: aload 0
      // 284: bipush 1
      // 285: putfield bb5.cbq Z
      // 288: aload 0
      // 289: invokevirtual bb5.qup ()V
      // 28c: goto 293
      // 28f: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 292: athrow
      // 293: getstatic j83.ef8 Lj83;
      // 296: invokevirtual j83.gln ()Z
      // 299: iload 4
      // 29b: ifne 2b3
      // 29e: ifeq 419
      // 2a1: goto 2a8
      // 2a4: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a7: athrow
      // 2a8: aload 0
      // 2a9: getfield bb5.dvc I
      // 2ac: goto 2b3
      // 2af: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b2: athrow
      // 2b3: bipush 1
      // 2b4: iload 4
      // 2b6: ifne 2d9
      // 2b9: if_icmple 419
      // 2bc: goto 2c3
      // 2bf: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c2: athrow
      // 2c3: aload 0
      // 2c4: dup
      // 2c5: getfield bb5.u4g I
      // 2c8: bipush 1
      // 2c9: iadd
      // 2ca: putfield bb5.u4g I
      // 2cd: aload 0
      // 2ce: getfield bb5.u4g I
      // 2d1: bipush 1
      // 2d2: goto 2d9
      // 2d5: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d8: athrow
      // 2d9: iload 4
      // 2db: ifne 30c
      // 2de: if_icmpne 300
      // 2e1: goto 2e8
      // 2e4: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e7: athrow
      // 2e8: aload 0
      // 2e9: dup
      // 2ea: getfield bb5.vxv D
      // 2ed: ldc2_w -0.9466666579246521
      // 2f0: dmul
      // 2f1: putfield bb5.vxv D
      // 2f4: iload 4
      // 2f6: ifeq 3cc
      // 2f9: goto 300
      // 2fc: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ff: athrow
      // 300: aload 0
      // 301: getfield bb5.u4g I
      // 304: bipush 2
      // 305: goto 30c
      // 308: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30b: athrow
      // 30c: iload 4
      // 30e: ifne 33f
      // 311: if_icmpne 333
      // 314: goto 31b
      // 317: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31a: athrow
      // 31b: aload 0
      // 31c: dup
      // 31d: getfield bb5.vxv D
      // 320: ldc2_w 0.001449999981559813
      // 323: dadd
      // 324: putfield bb5.vxv D
      // 327: iload 4
      // 329: ifeq 3cc
      // 32c: goto 333
      // 32f: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 332: athrow
      // 333: aload 0
      // 334: getfield bb5.u4g I
      // 337: bipush 3
      // 338: goto 33f
      // 33b: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33e: athrow
      // 33f: iload 4
      // 341: ifne 372
      // 344: if_icmpne 366
      // 347: goto 34e
      // 34a: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34d: athrow
      // 34e: aload 0
      // 34f: dup
      // 350: getfield bb5.vxv D
      // 353: ldc2_w 0.001449999981559813
      // 356: dadd
      // 357: putfield bb5.vxv D
      // 35a: iload 4
      // 35c: ifeq 3cc
      // 35f: goto 366
      // 362: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 365: athrow
      // 366: aload 0
      // 367: getfield bb5.u4g I
      // 36a: bipush 4
      // 36b: goto 372
      // 36e: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 371: athrow
      // 372: iload 4
      // 374: ifne 3b1
      // 377: if_icmpne 399
      // 37a: goto 381
      // 37d: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 380: athrow
      // 381: aload 0
      // 382: dup
      // 383: getfield bb5.vxv D
      // 386: ldc2_w 0.001449999981559813
      // 389: dadd
      // 38a: putfield bb5.vxv D
      // 38d: iload 4
      // 38f: ifeq 3cc
      // 392: goto 399
      // 395: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 398: athrow
      // 399: aload 0
      // 39a: iload 4
      // 39c: ifne 3c8
      // 39f: goto 3a6
      // 3a2: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a5: athrow
      // 3a6: getfield bb5.u4g I
      // 3a9: bipush 5
      // 3aa: goto 3b1
      // 3ad: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b0: athrow
      // 3b1: if_icmpne 3cc
      // 3b4: aload 0
      // 3b5: dup
      // 3b6: getfield bb5.vxv D
      // 3b9: ldc2_w 0.0010000000474974513
      // 3bc: dadd
      // 3bd: putfield bb5.vxv D
      // 3c0: aload 0
      // 3c1: goto 3c8
      // 3c4: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c7: athrow
      // 3c8: bipush 0
      // 3c9: putfield bb5.u4g I
      // 3cc: aload 1
      // 3cd: aload 0
      // 3ce: getfield bb5.wyl Lc05;
      // 3d1: getfield c05.vg8 Ll86;
      // 3d4: getfield l86.kfp D
      // 3d7: aload 0
      // 3d8: getfield bb5.vxv D
      // 3db: dadd
      // 3dc: invokevirtual fz2.o4n (D)V
      // 3df: iload 4
      // 3e1: ifeq 419
      // 3e4: aload 0
      // 3e5: getfield bb5.wyl Lc05;
      // 3e8: getfield c05.vg8 Ll86;
      // 3eb: dconst_0
      // 3ec: putfield l86.mop D
      // 3ef: aload 0
      // 3f0: getfield bb5.wyl Lc05;
      // 3f3: getfield c05.vg8 Ll86;
      // 3f6: dconst_0
      // 3f7: putfield l86.b_6 D
      // 3fa: aload 0
      // 3fb: goto 402
      // 3fe: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 401: athrow
      // 402: getfield bb5.wyl Lc05;
      // 405: getfield c05.vg8 Ll86;
      // 408: fconst_0
      // 409: putfield l86._ge F
      // 40c: getstatic i4o.ewf Lcrk;
      // 40f: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 412: invokevirtual java/lang/Float.floatValue ()F
      // 415: f2d
      // 416: invokestatic p_c.u7g (D)V
      // 419: return
   }

   public double zo_(double var1) {
      return var1 * (double)(0.2F * (float)p_c.vvc());
   }

   @jev
   public void ly5(q8e var1) {
      double var2 = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
      double var4 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
      this.io_ = Math.sqrt(var2 * var2 + var4 * var4);
   }

   @jev
   public void gvq(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield bb5.vkn Lq6h;
      // 008: getstatic bb5.u_q Lcrk;
      // 00b: invokevirtual crk.u7t ()D
      // 00e: invokevirtual q6h.hqu (D)Z
      // 011: iload 2
      // 012: ifeq 058
      // 015: ifne 04d
      // 018: goto 01f
      // 01b: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: aload 0
      // 020: getfield bb5.k45 Z
      // 023: iload 2
      // 024: ifeq 058
      // 027: goto 02e
      // 02a: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: ifne 04d
      // 031: goto 038
      // 034: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: aload 1
      // 039: dconst_0
      // 03a: invokevirtual _qa.oz6 (D)V
      // 03d: aload 1
      // 03e: dconst_0
      // 03f: invokevirtual _qa.sqi (D)V
      // 042: iload 2
      // 043: ifne 1d8
      // 046: goto 04d
      // 049: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield bb5.k45 Z
      // 051: goto 058
      // 054: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: iload 2
      // 059: ifeq 07c
      // 05c: ifne 1d8
      // 05f: goto 066
      // 062: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 065: athrow
      // 066: aload 0
      // 067: iload 2
      // 068: ifeq 149
      // 06b: goto 072
      // 06e: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: getfield bb5.dvc I
      // 075: goto 07c
      // 078: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: bipush 1
      // 07d: if_icmpeq 13c
      // 080: aload 0
      // 081: iload 2
      // 082: ifeq 0be
      // 085: goto 08c
      // 088: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: getfield bb5.dvc I
      // 08f: bipush 2
      // 090: if_icmpne 0b6
      // 093: goto 09a
      // 096: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 0
      // 09b: bipush 3
      // 09c: putfield bb5.dvc I
      // 09f: aload 0
      // 0a0: dup
      // 0a1: getfield bb5.czg D
      // 0a4: ldc2_w 2.149999
      // 0a7: dmul
      // 0a8: putfield bb5.czg D
      // 0ab: iload 2
      // 0ac: ifne 16e
      // 0af: goto 0b6
      // 0b2: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: goto 0be
      // 0ba: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bd: athrow
      // 0be: getfield bb5.wyl Lc05;
      // 0c1: getfield c05.tij Lkh3;
      // 0c4: aload 0
      // 0c5: getfield bb5.wyl Lc05;
      // 0c8: getfield c05.vg8 Ll86;
      // 0cb: aload 0
      // 0cc: getfield bb5.wyl Lc05;
      // 0cf: getfield c05.vg8 Ll86;
      // 0d2: invokevirtual l86.rhs ()Lnh4;
      // 0d5: dconst_0
      // 0d6: aload 0
      // 0d7: getfield bb5.wyl Lc05;
      // 0da: getfield c05.vg8 Ll86;
      // 0dd: getfield l86.mop D
      // 0e0: dconst_0
      // 0e1: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 0e4: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 0e7: astore 3
      // 0e8: aload 3
      // 0e9: invokeinterface java/util/List.size ()I 1
      // 0ee: iload 2
      // 0ef: ifeq 118
      // 0f2: ifgt 11b
      // 0f5: goto 0fc
      // 0f8: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: iload 2
      // 0fe: ifeq 128
      // 101: goto 108
      // 104: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: getfield bb5.wyl Lc05;
      // 10b: getfield c05.vg8 Ll86;
      // 10e: getfield l86.fcv Z
      // 111: goto 118
      // 114: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: ifeq 127
      // 11b: aload 0
      // 11c: bipush 1
      // 11d: putfield bb5.dvc I
      // 120: goto 127
      // 123: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 126: athrow
      // 127: aload 0
      // 128: aload 0
      // 129: getfield bb5.io_ D
      // 12c: aload 0
      // 12d: getfield bb5.io_ D
      // 130: ldc2_w 159.0
      // 133: ddiv
      // 134: dsub
      // 135: putfield bb5.czg D
      // 138: iload 2
      // 139: ifne 16e
      // 13c: aload 0
      // 13d: bipush 2
      // 13e: putfield bb5.dvc I
      // 141: aload 0
      // 142: goto 149
      // 145: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: getstatic bb5.m7n Lcrk;
      // 14c: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 14f: invokevirtual java/lang/Float.floatValue ()F
      // 152: f2d
      // 153: ldc2_w 3.3
      // 156: dmul
      // 157: ldc2_w 2.249999
      // 15a: ddiv
      // 15b: ldc2_w 0.2873
      // 15e: dmul
      // 15f: aload 0
      // 160: ldc2_w 0.2873
      // 163: invokevirtual bb5.zo_ (D)D
      // 166: ldc2_w 2.149999
      // 169: ddiv
      // 16a: dadd
      // 16b: putfield bb5.czg D
      // 16e: aload 0
      // 16f: getstatic bb5.cwj Lcn7;
      // 172: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 175: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 178: ifeq 186
      // 17b: aload 0
      // 17c: getfield bb5.czg D
      // 17f: goto 189
      // 182: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: invokestatic p_c.tz6 ()D
      // 189: invokestatic p_c.tz6 ()D
      // 18c: invokestatic java/lang/Math.max (DD)D
      // 18f: putfield bb5.czg D
      // 192: getstatic bb5.r02 Lcn7;
      // 195: invokevirtual cn7.g7m ()Z
      // 198: ifeq 1c9
      // 19b: getstatic fyk.kfa Lg_3;
      // 19e: ifnull 1c9
      // 1a1: goto 1a8
      // 1a4: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: getfield bb5.wyl Lc05;
      // 1ac: getfield c05.gze Laba;
      // 1af: fconst_1
      // 1b0: putfield aba.qeu F
      // 1b3: aload 1
      // 1b4: aload 0
      // 1b5: getfield bb5.czg D
      // 1b8: getstatic fyk.kfa Lg_3;
      // 1bb: invokestatic vxv.kax (L_qa;DLi2h;)V
      // 1be: iload 2
      // 1bf: ifne 1d8
      // 1c2: goto 1c9
      // 1c5: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c8: athrow
      // 1c9: aload 1
      // 1ca: aload 0
      // 1cb: getfield bb5.czg D
      // 1ce: invokestatic ohv.o0x (L_qa;D)V
      // 1d1: goto 1d8
      // 1d4: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: return
   }

   public void _ap(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: invokestatic c05.vz1 ()Lc05;
      // 007: astore 4
      // 009: aload 4
      // 00b: getfield c05.vg8 Ll86;
      // 00e: getfield l86.lfk Z
      // 011: iload 3
      // 012: ifne 020
      // 015: ifeq 217
      // 018: goto 01f
      // 01b: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: iload 2
      // 020: iload 3
      // 021: ifne 02f
      // 024: ifle 217
      // 027: goto 02e
      // 02a: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: iload 1
      // 02f: iload 3
      // 030: ifne 117
      // 033: ifeq 108
      // 036: goto 03d
      // 039: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: ldc2_w 0.0625
      // 040: dstore 5
      // 042: aload 4
      // 044: iload 3
      // 045: ifne 05e
      // 048: invokevirtual c05.c02 ()Lp_k;
      // 04b: ifnull 104
      // 04e: goto 055
      // 051: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 4
      // 057: goto 05e
      // 05a: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: getfield c05.vg8 Ll86;
      // 061: getfield l86.lfk Z
      // 064: iload 3
      // 065: ifne 073
      // 068: ifeq 104
      // 06b: goto 072
      // 06e: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: bipush 0
      // 073: istore 7
      // 075: iload 7
      // 077: i2d
      // 078: bipush 3
      // 079: iload 2
      // 07a: iadd
      // 07b: i2d
      // 07c: dload 5
      // 07e: ddiv
      // 07f: dcmpg
      // 080: ifgt 104
      // 083: aload 4
      // 085: invokevirtual c05.c02 ()Lp_k;
      // 088: invokevirtual p_k._m3 ()Lhv0;
      // 08b: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 08e: dup
      // 08f: aload 4
      // 091: getfield c05.vg8 Ll86;
      // 094: getfield l86.o2v D
      // 097: aload 4
      // 099: getfield c05.vg8 Ll86;
      // 09c: getfield l86.kfp D
      // 09f: dload 5
      // 0a1: dadd
      // 0a2: aload 4
      // 0a4: getfield c05.vg8 Ll86;
      // 0a7: getfield l86.vbd D
      // 0aa: bipush 0
      // 0ab: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 0ae: invokevirtual hv0.r92 (Lmz2;)V
      // 0b1: iload 3
      // 0b2: ifne 217
      // 0b5: aload 4
      // 0b7: invokevirtual c05.c02 ()Lp_k;
      // 0ba: invokevirtual p_k._m3 ()Lhv0;
      // 0bd: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 0c0: dup
      // 0c1: aload 4
      // 0c3: getfield c05.vg8 Ll86;
      // 0c6: getfield l86.o2v D
      // 0c9: aload 4
      // 0cb: getfield c05.vg8 Ll86;
      // 0ce: getfield l86.kfp D
      // 0d1: aload 4
      // 0d3: getfield c05.vg8 Ll86;
      // 0d6: getfield l86.vbd D
      // 0d9: iload 7
      // 0db: i2d
      // 0dc: bipush 3
      // 0dd: iload 2
      // 0de: iadd
      // 0df: i2d
      // 0e0: dload 5
      // 0e2: ddiv
      // 0e3: dcmpl
      // 0e4: ifne 0f6
      // 0e7: goto 0ee
      // 0ea: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: bipush 1
      // 0ef: goto 0f7
      // 0f2: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: bipush 0
      // 0f7: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 0fa: invokevirtual hv0.r92 (Lmz2;)V
      // 0fd: iinc 7 1
      // 100: iload 3
      // 101: ifeq 075
      // 104: iload 3
      // 105: ifeq 217
      // 108: aload 4
      // 10a: getfield c05.vg8 Ll86;
      // 10d: getfield l86.lfk Z
      // 110: goto 117
      // 113: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: iload 3
      // 118: ifne 13b
      // 11b: ifeq 217
      // 11e: goto 125
      // 121: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: invokestatic p_c.vmu ()I
      // 128: getstatic bb5.duw Lcrk;
      // 12b: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 12e: invokevirtual java/lang/Float.intValue ()I
      // 131: bipush 1
      // 132: isub
      // 133: iadd
      // 134: goto 13b
      // 137: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13a: athrow
      // 13b: istore 5
      // 13d: bipush 0
      // 13e: istore 6
      // 140: iload 6
      // 142: bipush 49
      // 144: iload 5
      // 146: bipush 17
      // 148: imul
      // 149: iadd
      // 14a: if_icmpge 1ec
      // 14d: aload 4
      // 14f: invokevirtual c05.c02 ()Lp_k;
      // 152: invokevirtual p_k._m3 ()Lhv0;
      // 155: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 158: dup
      // 159: aload 4
      // 15b: getfield c05.vg8 Ll86;
      // 15e: getfield l86.o2v D
      // 161: aload 4
      // 163: getfield c05.vg8 Ll86;
      // 166: getfield l86.kfp D
      // 169: ldc2_w 0.06248
      // 16c: dadd
      // 16d: aload 4
      // 16f: getfield c05.vg8 Ll86;
      // 172: getfield l86.vbd D
      // 175: bipush 0
      // 176: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 179: invokevirtual hv0.r92 (Lmz2;)V
      // 17c: aload 4
      // 17e: invokevirtual c05.c02 ()Lp_k;
      // 181: invokevirtual p_k._m3 ()Lhv0;
      // 184: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 187: dup
      // 188: aload 4
      // 18a: getfield c05.vg8 Ll86;
      // 18d: getfield l86.o2v D
      // 190: aload 4
      // 192: getfield c05.vg8 Ll86;
      // 195: getfield l86.kfp D
      // 198: ldc2_w 1.0E-4
      // 19b: dadd
      // 19c: aload 4
      // 19e: getfield c05.vg8 Ll86;
      // 1a1: getfield l86.vbd D
      // 1a4: bipush 0
      // 1a5: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 1a8: invokevirtual hv0.r92 (Lmz2;)V
      // 1ab: aload 4
      // 1ad: invokevirtual c05.c02 ()Lp_k;
      // 1b0: invokevirtual p_k._m3 ()Lhv0;
      // 1b3: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 1b6: dup
      // 1b7: aload 4
      // 1b9: getfield c05.vg8 Ll86;
      // 1bc: getfield l86.o2v D
      // 1bf: aload 4
      // 1c1: getfield c05.vg8 Ll86;
      // 1c4: getfield l86.kfp D
      // 1c7: ldc2_w 1.0E-14
      // 1ca: dadd
      // 1cb: aload 4
      // 1cd: getfield c05.vg8 Ll86;
      // 1d0: getfield l86.vbd D
      // 1d3: bipush 0
      // 1d4: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 1d7: invokevirtual hv0.r92 (Lmz2;)V
      // 1da: iinc 6 1
      // 1dd: iload 3
      // 1de: ifne 217
      // 1e1: iload 3
      // 1e2: ifeq 140
      // 1e5: goto 1ec
      // 1e8: invokestatic bb5.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: aload 4
      // 1ee: invokevirtual c05.c02 ()Lp_k;
      // 1f1: invokevirtual p_k._m3 ()Lhv0;
      // 1f4: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 1f7: dup
      // 1f8: aload 4
      // 1fa: getfield c05.vg8 Ll86;
      // 1fd: getfield l86.o2v D
      // 200: aload 4
      // 202: getfield c05.vg8 Ll86;
      // 205: getfield l86.kfp D
      // 208: aload 4
      // 20a: getfield c05.vg8 Ll86;
      // 20d: getfield l86.vbd D
      // 210: bipush 1
      // 211: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 214: invokevirtual hv0.r92 (Lmz2;)V
      // 217: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7703915087702342942L, 315566200542301488L, MethodHandles.lookup().lookupClass()).a(71826883439905L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 72949123373761L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[25];
      int var5 = 0;
      String var4 = "`Ê£\u0014¨Ç§c\u001bm\u009eh\u0097íÕ\u0091¨\u0005£\b²\tmU¦µ$ÂÒ\u008a¤G\u0018Q\u001fÉº]BQë\u0000R\u009bïì8^@'öñçÈ\u0086¬\u0091\u0010YJÄãùÃ¤ÎÇ\u00878ý¿\u0013Ë\u0092\u0010\u00020«Ä\u0099ì[¯É\u0005Ó\u0082®\u00832O\u0010 \u0096È\u00171uM\u000f\u001ei`\u009d\u0006½þ\u0081 ©\u0097NÚ<6ª\u0099¼ó)ÈL)V°P¡\u0090\u009d:\u000b\u008b?ÙzPZÕ\u0097¢=(\u008eÂw>¥j\u0003Çée¯.3í\u009eê¼¤ÿW@^møºø\u00118J \u001a\u009c¿Ý'ï\u0005o\u0087¶\u0010»'\u008aT¡K@÷ù¨Á\u0082\"9}b\u0018\u007ft>jo\u001eRÁ9ÏM\ný·\u0081\u0080?ö\u008aký\u0096\u009b?\u0010%\u0012p\u0014?9\"\u0080\u0087\u001d¨çdç\u0094\" ÑQñ\u0005f\u009d6\u0088)\u0081É\u009eîÝÂ²ä`Ø¡(~éZEè\u009e\u0000S¼0\u009f(â<å\\\u0007\u0015\u0018I¯¤¢óé8l\u001cË²Y¡uÿ\u0082Å\u0091¨u\u00052¦\u0084.\u001c·ÕO\u0082\u009bµÍ áB\u0097Aÿ³\u0007&\u009c\f\u001bfÂdÍlþè©ï\u000bk9A\u0091Ú©aÛ<Zæ(U\u001d¾{ç%#Î2ôè&\u009eè\u00166Ð\tA\u0002¯~\u000fX\rQêe]éþÔ!g»zS\u0012N¢\u0010N\u009ei\u0098N\u0097Ó\u0082§HÝHù\u0004à¥\u0010¤µ\u0095â\u0094>xâI\u0005\rTõ®= \u0018Ãâè!\u000b[ß\u001eÆr\\p!6q$÷×ã\u0019\u0015\u0015'\u008b G9^\u0002n\u0015\u009eÖ\\\u0016!¨\u009b\u0080\u009f\u0085Õþ#\u008e-HÎUØØpV\u008còçv ¬\u0098a%ÆkþnÐ\u000f\u0014(\u0099³tGßô!\u0097kÓÇ\u0093_\u008dwb!Ý\u001da(\u000b°\u0092\u0082»ÐÄm\u0084_\u00990ãº³Fb\u0006³ó\u0011û\u009b×Äðý\u0088Òs!´¢\u0005i×\u008dO\u0093¢(\bð%\u009fþÁ\u008d7\u0092«ï²C\u0096±Ò÷\u001f\u0094\u009c\tÐSê!\u0082\u008a¢Å\u0084¢ýùgëÃÌMO\u000e(÷'òNvÍ@¶ÔqÄ½\r\u001a;M\u0001ÆïNâ{\f\u008eYÉ iø\u000fDÍ¦òa\u0092¢å\u008bá\u0010ð)\u0090MÀ¡\u009e¸gI®MÅÅ¥\\";
      int var6 = "`Ê£\u0014¨Ç§c\u001bm\u009eh\u0097íÕ\u0091¨\u0005£\b²\tmU¦µ$ÂÒ\u008a¤G\u0018Q\u001fÉº]BQë\u0000R\u009bïì8^@'öñçÈ\u0086¬\u0091\u0010YJÄãùÃ¤ÎÇ\u00878ý¿\u0013Ë\u0092\u0010\u00020«Ä\u0099ì[¯É\u0005Ó\u0082®\u00832O\u0010 \u0096È\u00171uM\u000f\u001ei`\u009d\u0006½þ\u0081 ©\u0097NÚ<6ª\u0099¼ó)ÈL)V°P¡\u0090\u009d:\u000b\u008b?ÙzPZÕ\u0097¢=(\u008eÂw>¥j\u0003Çée¯.3í\u009eê¼¤ÿW@^møºø\u00118J \u001a\u009c¿Ý'ï\u0005o\u0087¶\u0010»'\u008aT¡K@÷ù¨Á\u0082\"9}b\u0018\u007ft>jo\u001eRÁ9ÏM\ný·\u0081\u0080?ö\u008aký\u0096\u009b?\u0010%\u0012p\u0014?9\"\u0080\u0087\u001d¨çdç\u0094\" ÑQñ\u0005f\u009d6\u0088)\u0081É\u009eîÝÂ²ä`Ø¡(~éZEè\u009e\u0000S¼0\u009f(â<å\\\u0007\u0015\u0018I¯¤¢óé8l\u001cË²Y¡uÿ\u0082Å\u0091¨u\u00052¦\u0084.\u001c·ÕO\u0082\u009bµÍ áB\u0097Aÿ³\u0007&\u009c\f\u001bfÂdÍlþè©ï\u000bk9A\u0091Ú©aÛ<Zæ(U\u001d¾{ç%#Î2ôè&\u009eè\u00166Ð\tA\u0002¯~\u000fX\rQêe]éþÔ!g»zS\u0012N¢\u0010N\u009ei\u0098N\u0097Ó\u0082§HÝHù\u0004à¥\u0010¤µ\u0095â\u0094>xâI\u0005\rTõ®= \u0018Ãâè!\u000b[ß\u001eÆr\\p!6q$÷×ã\u0019\u0015\u0015'\u008b G9^\u0002n\u0015\u009eÖ\\\u0016!¨\u009b\u0080\u009f\u0085Õþ#\u008e-HÎUØØpV\u008còçv ¬\u0098a%ÆkþnÐ\u000f\u0014(\u0099³tGßô!\u0097kÓÇ\u0093_\u008dwb!Ý\u001da(\u000b°\u0092\u0082»ÐÄm\u0084_\u00990ãº³Fb\u0006³ó\u0011û\u009b×Äðý\u0088Òs!´¢\u0005i×\u008dO\u0093¢(\bð%\u009fþÁ\u008d7\u0092«ï²C\u0096±Ò÷\u001f\u0094\u009c\tÐSê!\u0082\u008a¢Å\u0084¢ýùgëÃÌMO\u000e(÷'òNvÍ@¶ÔqÄ½\r\u001a;M\u0001ÆïNâ{\f\u008eYÉ iø\u000fDÍ¦òa\u0092¢å\u008bá\u0010ð)\u0090MÀ¡\u009e¸gI®MÅÅ¥\\"
         .length();
      char var3 = ' ';
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
                     e = new String[25];
                     r02 = new cn7(a<"b">(20022, 1745571392616178912L ^ var9), a<"b">(19910, 1891874553586689793L ^ var9), false);
                     s2e = new c_3(
                        a<"b">(20019, 944512894598456561L ^ var9),
                        a<"b">(1033, 4707079667399651032L ^ var9),
                        a<"b">(30655, 7241005924306099556L ^ var9),
                        new String[]{
                           a<"b">(3753, 3625847817799328889L ^ var9),
                           a<"b">(4604, 7617400847497919279L ^ var9),
                           a<"b">(18333, 7854161765491977561L ^ var9),
                           a<"b">(23585, 4159642179248436989L ^ var9)
                        }
                     );
                     wpc = new crk(a<"b">(20019, 944512894598456561L ^ var9), a<"b">(16797, 4103798579624815452L ^ var9), 10.0F, 1.0F, 18.0F, 1.0F);
                     cwj = new cn7(a<"b">(20019, 944512894598456561L ^ var9), a<"b">(207, 8496720482005543427L ^ var9), true);
                     __u = new cn7(a<"b">(20019, 944512894598456561L ^ var9), a<"b">(2122, 7041291387307319954L ^ var9), false);
                     u_q = new crk(a<"b">(20019, 944512894598456561L ^ var9), a<"b">(30285, 4689923803276647563L ^ var9), 200.0F, 0.0F, 1000.0F, 10.0F);
                     duw = new crk(a<"b">(20019, 944512894598456561L ^ var9), a<"b">(14485, 1054773114575835719L ^ var9), 1.0F, 0.0F, 4.0F, 1.0F);
                     m7n = new crk(a<"b">(20019, 944512894598456561L ^ var9), a<"b">(16762, 209948680842062757L ^ var9), 1.0F, 0.5F, 1.5F, 0.01F);
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

                  var4 = "\u0086\u0013ïxz\u0093\u000f÷sx\u00966\\«Áêû+ér5¼Ü\u001d ÍAõP\u0091\u0015:\u008aå«´ô2Ä \u007fj@\u0016\u0084ÑW\u0094L&ià_\u00975Íæ";
                  var6 = "\u0086\u0013ïxz\u0093\u000f÷sx\u00966\\«Áêû+ér5¼Ü\u001d ÍAõP\u0091\u0015:\u008aå«´ô2Ä \u007fj@\u0016\u0084ÑW\u0094L&ià_\u00975Íæ"
                     .length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30688;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("bb5", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("bb5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
