import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a16 extends wob {
   private static final Logger vf2;
   private uci ekt;
   private bdo fz6;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public a16() {
      long var1 = a ^ 139256489901970L;
      this(a<"u">(11949, 4094532457029901455L ^ var1));
   }

   public a16(String var1) {
      super(var1);
   }

   public void at3(uci param1) {
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
      // 06: putfield a16.ekt Luci;
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 23
      // 0e: getfield a16.fz6 Lbdo;
      // 11: ifnull 2a
      // 14: goto 1b
      // 17: invokestatic a16.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic a16.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield a16.fz6 Lbdo;
      // 27: invokevirtual a16.oo1 (Lbdo;)V
      // 2a: return
   }

   @Override
   public void oo1(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a16.a J
      // 03: ldc2_w 60270967072437
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 51
      // 13: getfield a16.ekt Luci;
      // 16: ifnonnull 31
      // 19: goto 20
      // 1c: invokestatic a16.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: putfield a16.fz6 Lbdo;
      // 25: iload 4
      // 27: ifeq de
      // 2a: goto 31
      // 2d: invokestatic a16.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: sipush 7988
      // 36: ldc2_w 379196446574146602
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: bipush 10
      // 43: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 46: invokevirtual a16.hui (Lqhg;)V
      // 49: aload 0
      // 4a: goto 51
      // 4d: invokestatic a16.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 1
      // 52: sipush 6551
      // 55: ldc2_w 1663783042293789337
      // 58: lload 2
      // 59: lxor
      // 5a: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: nop
      // 60: bipush 10
      // 62: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 65: invokevirtual a16.tfi (Lqhg;)V
      // 68: aload 1
      // 69: sipush 12857
      // 6c: ldc2_w 3089287337768933640
      // 6f: lload 2
      // 70: lxor
      // 71: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: nop
      // 77: bipush 10
      // 79: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 7c: iload 4
      // 7e: ifne bc
      // 81: ifeq a8
      // 84: goto 8b
      // 87: invokestatic a16.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 1
      // 8d: sipush 4993
      // 90: ldc2_w 39021964759070867
      // 93: lload 2
      // 94: lxor
      // 95: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: nop
      // 9b: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 9e: invokevirtual a16.xst (Lbdo;)V
      // a1: goto a8
      // a4: invokestatic a16.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 1
      // a9: sipush 17093
      // ac: ldc2_w 7988225503662320079
      // af: lload 2
      // b0: lxor
      // b1: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: nop
      // b7: bipush 9
      // b9: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // bc: ifeq de
      // bf: aload 0
      // c0: aload 1
      // c1: sipush 17093
      // c4: ldc2_w 7988225503662320079
      // c7: lload 2
      // c8: lxor
      // c9: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: nop
      // cf: bipush 10
      // d1: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // d4: invokevirtual a16.kr8 (Lqhg;)V
      // d7: goto de
      // da: invokestatic a16.a (Loov;)Loov;
      // dd: athrow
      // de: return
   }

   public void kr8(qhg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a16.a J
      // 003: ldc2_w 86351289771321
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: bipush 0
      // 00e: istore 5
      // 010: iload 5
      // 012: aload 1
      // 013: invokevirtual qhg.vek ()I
      // 016: if_icmpge 280
      // 019: aload 1
      // 01a: iload 5
      // 01c: invokevirtual qhg.kd6 (I)Lbdo;
      // 01f: astore 6
      // 021: aload 6
      // 023: sipush 16226
      // 026: ldc2_w 2512461766494263250
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 034: astore 7
      // 036: aload 7
      // 038: iload 4
      // 03a: ifeq 05b
      // 03d: invokevirtual java/lang/String.length ()I
      // 040: bipush 16
      // 042: if_icmple 05d
      // 045: goto 04c
      // 048: invokestatic a16.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 7
      // 04e: bipush 0
      // 04f: bipush 16
      // 051: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 054: goto 05b
      // 057: invokestatic a16.a (Loov;)Loov;
      // 05a: athrow
      // 05b: astore 7
      // 05d: aload 0
      // 05e: getfield a16.ekt Luci;
      // 061: aload 7
      // 063: invokevirtual uci.g_e (Ljava/lang/String;)Lq2m;
      // 066: astore 8
      // 068: aload 6
      // 06a: sipush 31617
      // 06d: ldc2_w 503642186868806429
      // 070: lload 2
      // 071: lxor
      // 072: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 07b: astore 9
      // 07d: aload 9
      // 07f: invokevirtual java/lang/String.length ()I
      // 082: iload 4
      // 084: ifeq 0b9
      // 087: bipush 32
      // 089: if_icmple 09d
      // 08c: goto 093
      // 08f: invokestatic a16.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 9
      // 095: bipush 0
      // 096: bipush 32
      // 098: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 09b: astore 9
      // 09d: aload 8
      // 09f: aload 9
      // 0a1: invokevirtual q2m.l7j (Ljava/lang/String;)V
      // 0a4: aload 6
      // 0a6: sipush 24894
      // 0a9: ldc2_w 3137699385777539492
      // 0ac: lload 2
      // 0ad: lxor
      // 0ae: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: nop
      // 0b4: bipush 8
      // 0b6: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0b9: iload 4
      // 0bb: ifeq 12f
      // 0be: ifeq 0ea
      // 0c1: goto 0c8
      // 0c4: invokestatic a16.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 8
      // 0ca: aload 6
      // 0cc: sipush 24894
      // 0cf: ldc2_w 3137699385777539492
      // 0d2: lload 2
      // 0d3: lxor
      // 0d4: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0dd: invokestatic syo.fok (Ljava/lang/String;)Lsyo;
      // 0e0: invokevirtual q2m.w8o (Lsyo;)V
      // 0e3: goto 0ea
      // 0e6: invokestatic a16.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 8
      // 0ec: aload 6
      // 0ee: sipush 1022
      // 0f1: ldc2_w 1457390692038617969
      // 0f4: lload 2
      // 0f5: lxor
      // 0f6: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: nop
      // 0fc: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0ff: invokevirtual q2m.b6t (Ljava/lang/String;)V
      // 102: aload 8
      // 104: aload 6
      // 106: sipush 12083
      // 109: ldc2_w 6996357049847383938
      // 10c: lload 2
      // 10d: lxor
      // 10e: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: nop
      // 114: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 117: invokevirtual q2m.kln (Ljava/lang/String;)V
      // 11a: aload 6
      // 11c: sipush 5070
      // 11f: ldc2_w 7904654674200247153
      // 122: lload 2
      // 123: lxor
      // 124: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: nop
      // 12a: bipush 99
      // 12c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 12f: iload 4
      // 131: ifeq 172
      // 134: ifeq 15d
      // 137: goto 13e
      // 13a: invokestatic a16.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 8
      // 140: aload 6
      // 142: sipush 5070
      // 145: ldc2_w 7904654674200247153
      // 148: lload 2
      // 149: lxor
      // 14a: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: nop
      // 150: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 153: invokevirtual q2m.swm (Z)V
      // 156: goto 15d
      // 159: invokestatic a16.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 6
      // 15f: sipush 29617
      // 162: ldc2_w 7749476871168842504
      // 165: lload 2
      // 166: lxor
      // 167: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: nop
      // 16d: bipush 99
      // 16f: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 172: iload 4
      // 174: ifeq 1b5
      // 177: ifeq 1a0
      // 17a: goto 181
      // 17d: invokestatic a16.a (Loov;)Loov;
      // 180: athrow
      // 181: aload 8
      // 183: aload 6
      // 185: sipush 29617
      // 188: ldc2_w 7749476871168842504
      // 18b: lload 2
      // 18c: lxor
      // 18d: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: nop
      // 193: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 196: invokevirtual q2m.ooe (Z)V
      // 199: goto 1a0
      // 19c: invokestatic a16.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: aload 6
      // 1a2: sipush 19307
      // 1a5: ldc2_w 7375956438031426548
      // 1a8: lload 2
      // 1a9: lxor
      // 1aa: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: nop
      // 1b0: bipush 8
      // 1b2: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1b5: iload 4
      // 1b7: ifeq 21c
      // 1ba: ifeq 1fb
      // 1bd: goto 1c4
      // 1c0: invokestatic a16.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 6
      // 1c6: sipush 19307
      // 1c9: ldc2_w 7375956438031426548
      // 1cc: lload 2
      // 1cd: lxor
      // 1ce: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: nop
      // 1d4: iload 4
      // 1d6: ifeq 20b
      // 1d9: goto 1e0
      // 1dc: invokestatic a16.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 1e3: invokestatic n_0$ajs.qnh (Ljava/lang/String;)Ln_0$ajs;
      // 1e6: astore 10
      // 1e8: aload 10
      // 1ea: ifnull 1fb
      // 1ed: aload 8
      // 1ef: aload 10
      // 1f1: invokevirtual q2m.f59 (Ln_0$ajs;)V
      // 1f4: goto 1fb
      // 1f7: invokestatic a16.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: aload 6
      // 1fd: sipush 25346
      // 200: ldc2_w 4896569494960360346
      // 203: lload 2
      // 204: lxor
      // 205: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: nop
      // 20b: iload 4
      // 20d: ifeq 236
      // 210: bipush 8
      // 212: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 215: goto 21c
      // 218: invokestatic a16.a (Loov;)Loov;
      // 21b: athrow
      // 21c: ifeq 25d
      // 21f: aload 6
      // 221: sipush 25346
      // 224: ldc2_w 4896569494960360346
      // 227: lload 2
      // 228: lxor
      // 229: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: nop
      // 22f: goto 236
      // 232: invokestatic a16.a (Loov;)Loov;
      // 235: athrow
      // 236: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 239: invokestatic n_0$ajs.qnh (Ljava/lang/String;)Ln_0$ajs;
      // 23c: astore 10
      // 23e: iload 4
      // 240: ifeq 27b
      // 243: aload 10
      // 245: ifnull 25d
      // 248: goto 24f
      // 24b: invokestatic a16.a (Loov;)Loov;
      // 24e: athrow
      // 24f: aload 8
      // 251: aload 10
      // 253: invokevirtual q2m.xn7 (Ln_0$ajs;)V
      // 256: goto 25d
      // 259: invokestatic a16.a (Loov;)Loov;
      // 25c: athrow
      // 25d: aload 0
      // 25e: aload 8
      // 260: aload 6
      // 262: sipush 9437
      // 265: ldc2_w 7847580510224911454
      // 268: lload 2
      // 269: lxor
      // 26a: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: nop
      // 270: bipush 8
      // 272: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 275: invokevirtual a16.hen (Lq2m;Lqhg;)V
      // 278: iinc 5 1
      // 27b: iload 4
      // 27d: ifne 010
      // 280: return
   }

   public void hen(q2m var1, qhg var2) {
      int var3 = OpaquePredicate.c();
      int var4 = 0;

      while (var4 < var2.vek()) {
         this.ekt.g_l(var2.mqs(var4), var1.fm9());
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public void xst(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a16.a J
      // 03: ldc2_w 95483140831027
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: bipush 0
      // 0e: istore 5
      // 10: iload 5
      // 12: bipush 19
      // 14: if_icmpge 97
      // 17: aload 1
      // 18: new java/lang/StringBuilder
      // 1b: dup
      // 1c: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f: sipush 1209
      // 22: ldc2_w 38749781642165794
      // 25: lload 2
      // 26: lxor
      // 27: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: nop
      // 2d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30: iload 5
      // 32: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 35: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 38: iload 4
      // 3a: ifne 74
      // 3d: bipush 8
      // 3f: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 42: ifeq 8f
      // 45: goto 4c
      // 48: invokestatic a16.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 1
      // 4d: new java/lang/StringBuilder
      // 50: dup
      // 51: invokespecial java/lang/StringBuilder.<init> ()V
      // 54: sipush 597
      // 57: ldc2_w 2984956537841760456
      // 5a: lload 2
      // 5b: lxor
      // 5c: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65: iload 5
      // 67: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d: goto 74
      // 70: invokestatic a16.a (Loov;)Loov;
      // 73: athrow
      // 74: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 77: astore 6
      // 79: aload 0
      // 7a: getfield a16.ekt Luci;
      // 7d: aload 6
      // 7f: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 82: astore 7
      // 84: aload 0
      // 85: getfield a16.ekt Luci;
      // 88: iload 5
      // 8a: aload 7
      // 8c: invokevirtual uci.zux (ILsa6;)V
      // 8f: iinc 5 1
      // 92: iload 4
      // 94: ifeq 10
      // 97: return
   }

   public void hui(qhg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a16.a J
      // 03: ldc2_w 14918745908549
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: bipush 0
      // 0e: istore 5
      // 10: iload 5
      // 12: aload 1
      // 13: invokevirtual qhg.vek ()I
      // 16: if_icmpge d6
      // 19: aload 1
      // 1a: iload 5
      // 1c: invokevirtual qhg.kd6 (I)Lbdo;
      // 1f: astore 6
      // 21: getstatic z0w.wwc Ljava/util/Map;
      // 24: aload 6
      // 26: sipush 4714
      // 29: ldc2_w 2600255447138056877
      // 2c: lload 2
      // 2d: lxor
      // 2e: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: nop
      // 34: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 37: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3c: checkcast z0w
      // 3f: astore 7
      // 41: iload 4
      // 43: ifne d1
      // 46: aload 7
      // 48: ifnull ce
      // 4b: goto 52
      // 4e: invokestatic a16.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 6
      // 54: sipush 16226
      // 57: ldc2_w 2512531071382001582
      // 5a: lload 2
      // 5b: lxor
      // 5c: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 65: astore 8
      // 67: aload 8
      // 69: iload 4
      // 6b: ifne 8c
      // 6e: invokevirtual java/lang/String.length ()I
      // 71: bipush 16
      // 73: if_icmple 8e
      // 76: goto 7d
      // 79: invokestatic a16.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 8
      // 7f: bipush 0
      // 80: bipush 16
      // 82: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 85: goto 8c
      // 88: invokestatic a16.a (Loov;)Loov;
      // 8b: athrow
      // 8c: astore 8
      // 8e: aload 0
      // 8f: getfield a16.ekt Luci;
      // 92: aload 8
      // 94: aload 7
      // 96: invokevirtual uci.oda (Ljava/lang/String;Lz0w;)Lsa6;
      // 99: astore 9
      // 9b: aload 9
      // 9d: aload 6
      // 9f: sipush 31617
      // a2: ldc2_w 503568621311120225
      // a5: lload 2
      // a6: lxor
      // a7: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: nop
      // ad: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // b0: invokevirtual sa6.mf7 (Ljava/lang/String;)V
      // b3: aload 9
      // b5: aload 6
      // b7: sipush 1400
      // ba: ldc2_w 4195570689988078990
      // bd: lload 2
      // be: lxor
      // bf: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: nop
      // c5: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // c8: invokestatic z0w$enz.q_i (Ljava/lang/String;)Lz0w$enz;
      // cb: invokevirtual sa6.oaj (Lz0w$enz;)V
      // ce: iinc 5 1
      // d1: iload 4
      // d3: ifeq 10
      // d6: return
   }

   public void tfi(qhg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a16.a J
      // 03: ldc2_w 20081184617132
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: bipush 0
      // 0e: istore 5
      // 10: iload 5
      // 12: aload 1
      // 13: invokevirtual qhg.vek ()I
      // 16: if_icmpge e7
      // 19: aload 1
      // 1a: iload 5
      // 1c: invokevirtual qhg.kd6 (I)Lbdo;
      // 1f: astore 6
      // 21: aload 0
      // 22: getfield a16.ekt Luci;
      // 25: aload 6
      // 27: sipush 1927
      // 2a: ldc2_w 2823998698289428617
      // 2d: lload 2
      // 2e: lxor
      // 2f: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: nop
      // 35: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 38: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 3b: astore 7
      // 3d: aload 6
      // 3f: sipush 16226
      // 42: ldc2_w 2512536216633065543
      // 45: lload 2
      // 46: lxor
      // 47: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: nop
      // 4d: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 50: astore 8
      // 52: aload 8
      // 54: iload 4
      // 56: ifne 77
      // 59: invokevirtual java/lang/String.length ()I
      // 5c: bipush 40
      // 5e: if_icmple 79
      // 61: goto 68
      // 64: invokestatic a16.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 8
      // 6a: bipush 0
      // 6b: bipush 40
      // 6d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 70: goto 77
      // 73: invokestatic a16.a (Loov;)Loov;
      // 76: athrow
      // 77: astore 8
      // 79: aload 0
      // 7a: getfield a16.ekt Luci;
      // 7d: aload 8
      // 7f: aload 7
      // 81: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 84: astore 9
      // 86: aload 9
      // 88: aload 6
      // 8a: sipush 10434
      // 8d: ldc2_w 1059578398049195993
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 9b: invokevirtual r11.ndm (I)V
      // 9e: iload 4
      // a0: ifne e2
      // a3: aload 6
      // a5: sipush 3339
      // a8: ldc2_w 887884064346108450
      // ab: lload 2
      // ac: lxor
      // ad: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: nop
      // b3: invokevirtual bdo.dmw (Ljava/lang/String;)Z
      // b6: ifeq df
      // b9: goto c0
      // bc: invokestatic a16.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 9
      // c2: aload 6
      // c4: sipush 3339
      // c7: ldc2_w 887884064346108450
      // ca: lload 2
      // cb: lxor
      // cc: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: nop
      // d2: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // d5: invokevirtual r11.z7w (Z)V
      // d8: goto df
      // db: invokestatic a16.a (Loov;)Loov;
      // de: athrow
      // df: iinc 5 1
      // e2: iload 4
      // e4: ifeq 10
      // e7: return
   }

   @Override
   public void _j9(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a16.a J
      // 03: ldc2_w 121985848086820
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 8b
      // 13: getfield a16.ekt Luci;
      // 16: ifnonnull 42
      // 19: goto 20
      // 1c: invokestatic a16.a (Loov;)Loov;
      // 1f: athrow
      // 20: getstatic a16.vf2 Lorg/apache/logging/log4j/Logger;
      // 23: sipush 16608
      // 26: ldc2_w 4042216114414263405
      // 29: lload 2
      // 2a: lxor
      // 2b: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 36: iload 4
      // 38: ifne 8f
      // 3b: goto 42
      // 3e: invokestatic a16.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 1
      // 43: bipush 20
      // 45: ldc2_w 5574906698152041616
      // 48: lload 2
      // 49: lxor
      // 4a: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: aload 0
      // 51: invokevirtual a16.iix ()Lqhg;
      // 54: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 57: aload 1
      // 58: sipush 30927
      // 5b: ldc2_w 3233603810213536838
      // 5e: lload 2
      // 5f: lxor
      // 60: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: nop
      // 66: aload 0
      // 67: invokevirtual a16.z5y ()Lqhg;
      // 6a: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 6d: aload 1
      // 6e: sipush 16027
      // 71: ldc2_w 6899142443179041296
      // 74: lload 2
      // 75: lxor
      // 76: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: nop
      // 7c: aload 0
      // 7d: invokevirtual a16.u8l ()Lqhg;
      // 80: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 83: aload 0
      // 84: goto 8b
      // 87: invokestatic a16.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 1
      // 8c: invokevirtual a16.wuh (Lbdo;)V
      // 8f: return
   }

   public qhg u8l() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a16.a J
      // 003: ldc2_w 71009982177149
      // 006: lxor
      // 007: lstore 1
      // 008: new qhg
      // 00b: dup
      // 00c: invokespecial qhg.<init> ()V
      // 00f: astore 4
      // 011: invokestatic OpaquePredicate.c ()I
      // 014: aload 0
      // 015: getfield a16.ekt Luci;
      // 018: invokevirtual uci.yhf ()Ljava/util/Collection;
      // 01b: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 020: astore 5
      // 022: istore 3
      // 023: aload 5
      // 025: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02a: ifeq 1a8
      // 02d: aload 5
      // 02f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 034: checkcast q2m
      // 037: astore 6
      // 039: new bdo
      // 03c: dup
      // 03d: invokespecial bdo.<init> ()V
      // 040: astore 7
      // 042: aload 7
      // 044: sipush 16226
      // 047: ldc2_w 2512446425054621078
      // 04a: lload 1
      // 04b: lxor
      // 04c: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: nop
      // 052: aload 6
      // 054: invokevirtual q2m.fm9 ()Ljava/lang/String;
      // 057: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 05a: aload 7
      // 05c: sipush 29899
      // 05f: ldc2_w 8157770367862040072
      // 062: lload 1
      // 063: lxor
      // 064: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: nop
      // 06a: aload 6
      // 06c: invokevirtual q2m.m6i ()Ljava/lang/String;
      // 06f: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 072: iload 3
      // 073: ifne 140
      // 076: aload 6
      // 078: invokevirtual q2m.z84 ()Lsyo;
      // 07b: invokevirtual syo.h6w ()I
      // 07e: iflt 0aa
      // 081: goto 088
      // 084: invokestatic a16.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 7
      // 08a: sipush 7805
      // 08d: ldc2_w 850461913129192577
      // 090: lload 1
      // 091: lxor
      // 092: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: aload 6
      // 09a: invokevirtual q2m.z84 ()Lsyo;
      // 09d: invokevirtual syo.ktw ()Ljava/lang/String;
      // 0a0: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 0a3: goto 0aa
      // 0a6: invokestatic a16.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 7
      // 0ac: sipush 11748
      // 0af: ldc2_w 7398366680034197299
      // 0b2: lload 1
      // 0b3: lxor
      // 0b4: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: nop
      // 0ba: aload 6
      // 0bc: invokevirtual q2m.wyj ()Ljava/lang/String;
      // 0bf: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 0c2: aload 7
      // 0c4: sipush 5219
      // 0c7: ldc2_w 3289176149688518319
      // 0ca: lload 1
      // 0cb: lxor
      // 0cc: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: nop
      // 0d2: aload 6
      // 0d4: invokevirtual q2m.zme ()Ljava/lang/String;
      // 0d7: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 0da: aload 7
      // 0dc: sipush 29304
      // 0df: ldc2_w 6247279125735301303
      // 0e2: lload 1
      // 0e3: lxor
      // 0e4: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: nop
      // 0ea: aload 6
      // 0ec: invokevirtual q2m.w7v ()Z
      // 0ef: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 0f2: aload 7
      // 0f4: sipush 23094
      // 0f7: ldc2_w 3861979497273772271
      // 0fa: lload 1
      // 0fb: lxor
      // 0fc: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: aload 6
      // 104: invokevirtual q2m.g33 ()Z
      // 107: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 10a: aload 7
      // 10c: sipush 23078
      // 10f: ldc2_w 7544230983836780774
      // 112: lload 1
      // 113: lxor
      // 114: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: nop
      // 11a: aload 6
      // 11c: invokevirtual q2m.xge ()Ln_0$ajs;
      // 11f: getfield n_0$ajs.fq2 Ljava/lang/String;
      // 122: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 125: aload 7
      // 127: sipush 2209
      // 12a: ldc2_w 8001830315580627552
      // 12d: lload 1
      // 12e: lxor
      // 12f: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: nop
      // 135: aload 6
      // 137: invokevirtual q2m.aej ()Ln_0$ajs;
      // 13a: getfield n_0$ajs.fq2 Ljava/lang/String;
      // 13d: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 140: new qhg
      // 143: dup
      // 144: invokespecial qhg.<init> ()V
      // 147: astore 8
      // 149: aload 6
      // 14b: invokevirtual q2m.vsw ()Ljava/util/Collection;
      // 14e: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 153: astore 9
      // 155: aload 9
      // 157: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15c: ifeq 188
      // 15f: aload 9
      // 161: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 166: checkcast java/lang/String
      // 169: astore 10
      // 16b: aload 8
      // 16d: new bgg
      // 170: dup
      // 171: aload 10
      // 173: invokespecial bgg.<init> (Ljava/lang/String;)V
      // 176: invokevirtual qhg.w2j (Lgdw;)V
      // 179: iload 3
      // 17a: ifne 1a4
      // 17d: iload 3
      // 17e: ifeq 155
      // 181: goto 188
      // 184: invokestatic a16.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 7
      // 18a: sipush 21135
      // 18d: ldc2_w 5153409200969433163
      // 190: lload 1
      // 191: lxor
      // 192: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: nop
      // 198: aload 8
      // 19a: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 19d: aload 4
      // 19f: aload 7
      // 1a1: invokevirtual qhg.w2j (Lgdw;)V
      // 1a4: iload 3
      // 1a5: ifeq 023
      // 1a8: aload 4
      // 1aa: areturn
   }

   public void wuh(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a16.a J
      // 03: ldc2_w 30497871618069
      // 06: lxor
      // 07: lstore 2
      // 08: new bdo
      // 0b: dup
      // 0c: invokespecial bdo.<init> ()V
      // 0f: astore 5
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: bipush 0
      // 15: istore 6
      // 17: istore 4
      // 19: bipush 0
      // 1a: istore 7
      // 1c: iload 7
      // 1e: bipush 19
      // 20: if_icmpge 80
      // 23: aload 0
      // 24: getfield a16.ekt Luci;
      // 27: iload 7
      // 29: invokevirtual uci.d_n (I)Lsa6;
      // 2c: astore 8
      // 2e: iload 4
      // 30: ifeq a0
      // 33: iload 4
      // 35: ifeq 7b
      // 38: goto 3f
      // 3b: invokestatic a16.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 8
      // 41: ifnull 78
      // 44: goto 4b
      // 47: invokestatic a16.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 5
      // 4d: new java/lang/StringBuilder
      // 50: dup
      // 51: invokespecial java/lang/StringBuilder.<init> ()V
      // 54: sipush 597
      // 57: ldc2_w 2985041356205109230
      // 5a: lload 2
      // 5b: lxor
      // 5c: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 65: iload 7
      // 67: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6d: aload 8
      // 6f: invokevirtual sa6.qkn ()Ljava/lang/String;
      // 72: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 75: bipush 1
      // 76: istore 6
      // 78: iinc 7 1
      // 7b: iload 4
      // 7d: ifne 1c
      // 80: iload 6
      // 82: ifeq a0
      // 85: aload 1
      // 86: sipush 4993
      // 89: ldc2_w 39000953323404851
      // 8c: lload 2
      // 8d: lxor
      // 8e: invokedynamic u (IJ)Ljava/lang/String; bsm=a16.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: nop
      // 94: aload 5
      // 96: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 99: goto a0
      // 9c: invokestatic a16.a (Loov;)Loov;
      // 9f: athrow
      // a0: return
   }

   public qhg iix() {
      long var1 = a ^ 109924337265654L;
      qhg var4 = new qhg();
      int var10000 = OpaquePredicate.c();
      Iterator var5 = this.ekt.n2t().iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         sa6 var6 = (sa6)var5.next();
         if (var6.do2() != null) {
            bdo var7 = new bdo();
            var7.rjq(a<"u">(16226, 2512485064672336157L ^ var1), var6.qkn());
            var7.rjq(a<"u">(29301, 6497402254895191095L ^ var1), var6.do2().ofv());
            var7.rjq(a<"u">(31617, 503671529693224402L ^ var1), var6.rqc());
            var7.rjq(a<"u">(23393, 7875515875560144187L ^ var1), var6.sns().g9z());
            var4.w2j(var7);
         }

         if (var3 != 0) {
            break;
         }
      }

      return var4;
   }

   public qhg z5y() {
      long var1 = a ^ 134911872736842L;
      qhg var4 = new qhg();
      int var10000 = OpaquePredicate.b();
      Iterator var5 = this.ekt.ura().iterator();
      int var3 = var10000;

      while (var5.hasNext()) {
         r11 var6 = (r11)var5.next();
         if (var6.i3t() != null) {
            bdo var7 = new bdo();
            var7.rjq(a<"u">(23115, 722916866302052742L ^ var1), var6.tg2());
            var7.rjq(a<"u">(22803, 5975117424057322220L ^ var1), var6.i3t().qkn());
            var7.iin(a<"u">(637, 484158895186530703L ^ var1), var6.fge());
            var7.zyu(a<"u">(17748, 1597273292910663325L ^ var1), var6.c8c());
            var4.w2j(var7);
         }

         if (var3 == 0) {
            break;
         }
      }

      return var4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4086756362231444746L, 3787786991643181929L, MethodHandles.lookup().lookupClass()).a(164205180622283L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 138318084472339L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[42];
      int var7 = 0;
      String var6 = "¼ºN´}Çå95Q\u0017óß\u009cÈMhê\u0014Z\u0013ÂÁZ(+\u001c¡FÎ³e#5°\u00068ÉpXF\u0098¶\u0093\n%§{y\u001eÒ\u0086Ú8×BqÊïÞùíÞåa\u0018´ÀÀ\u008f`aïë\u008dj«õ\u009d\u0089\u0093L«\u0085<Ë5\u0080¼\u0083 \u0012aGý\u0006ª+Áë\u009f¡\u008e\u0017\tX\u008eç.²93Ó¦®\u001dë1Áy5{a(\u000e°\u001d\u0000i\u0005¸EäOw\u0097øn\u0004 C\u0010³Ñ2äàeP<éP¡Æ$\u0003KEøwi\u009b¡h \u0087¢\u008cKý3(z v\u0096èõzWTh¤F{*têûñÉ@\u009bÝ-\u001b\u0087(shÎøÇnÜ\u0011êà.QÎÕ\u0096÷>\u0097\u008dô\u0017\u0093îèá{qëÅ \u0006çëØÒ\u008bº3B\u009a \u0091©ÿ6|7û(\u009e9õÙg\u0080\u0019nº\u0014¢(,Q«ÏDXMi¶Ö\u000e²\u0010äWaÝØ\tv\u009e¦¨`;É æÔX{ª0k¨¡\u009b\u008f?g\u009c[ÇÚ\u0080²\u0014\u008f\u001e\u001elY¤¸\u009aâ\u0096?NÄç\"YûX\nÁÄC\u001fn\u008a\u0098wX\u0087¯\u001bÊF\u0093x\u0082\u0005\u009c®å\u0019½SÂÎàü1ÏÏ¡ãÔG\"¢é6U\\+¯¦\u000fíYÊÎ\u0098¡[\u0010\u0080ø!\u0005&´@gäsë¥zp¤Ý YÞ\u009e}e¡^So9\tÃHT\bFáì±ò:|®%;$íK<\u001e¼}\u0018\u0011Dö\"®\u0095j@ä²C\u009déÅ¥R5Û½.}ÄaM\u0018I²r+ót»\tT\u008e#^\u0006\u001fC\u008d\u0010\u0081V \u0019\u0011i\u000e\u0010\u0082ûï\u0001xM\u008b\u0019£\u009b\f\u0015Â¥\u0080\u001c\u0010Ü¦ökPÝFÏù/k\u001cû\u001d.C 3Í¡·þñ#\u0097\u0097}\rS\u0080\u0083å-\u0089pSE\u001b\u0003ó9Ðc¤\u001b\n;\u000bÍ\u0010ÆÕ£\u008c\u000e°\u0011\u0016lÝ1ÆÌÂÊs(¯×\u0085}Ä©ÃñI\u0013r\u00adÄW\u0090\fÿ\u000be\u009d\u0090\u009f`\u0004\u009cmk[§Saw\u00069{Ä\u0098R$\u001c A¤@\u0019¹\u00163Ö\u008aÐ\u008aK\u0081Ý&\u00188õAx\u0091\u0019?\u0019Ä-\u0000#1Ç}Ñ }3× \u0019¾ë\u00ad\u0095©\u0019Ä}\u0098QSoç\u0098¼*¥ÏX\u00148©ýÜîF\u0083\u0018z³\u000e\u0096©9ÂØ\u00911\u00ad\u001c1\\í\u0080XA¶+ýÑ\u0003\u0002\u0010ßgsy.\u008c\u00ad¤Ò\u0014\u0004qÐ$\u0097ä\u0010¼,s\u008e\u009fphöGN\u008aÄÊd\u001a¼\u0010I\u0005\u0017\u0094\u00ad«Ugk?Ñ62§÷B\u0010Z}0 QT)\u008e\u0087M\u0098ú¿,öy\u0010\u0002\u008aÜ e^ Üæ>öi~\bOW \u0004\u0005Oô¬?¬U\u009d_ûÙÒ±cJn\u0012yÄG}l§©Ï_95gè`(\u0001Þ\u009a#\u000b\f[\u0089\u0092\u0015\u0097\u0096Â&6\u008bY¥¡X\u009bã\u000bÀ\u001d\u00ad\u0010ÏS»\u009cH\u0011@\u0092\u000b¯7\u00154(zJ*\u007f5\u0095k«\u000f\u009a=|[\u008c ÓWDF¬Em¡\u001dEb·v\u0011J:Go\u008b\u008f©\u0014\u0086\u0099[ fÐ/1X\u0087X\u0098H\u00139Ð\u0017\b©bóâ\u008e0zI÷y\u001d¬\büú2øß\u0010\u0000\u0081Ñjä{×r2¡Öx¯OÌG(-L\u0015>Y§ðsY1BÁ\u001b%ÀX\\ò\u00057Ìîu\u0014CÍÄ\u0088Dq\u008eÖ\u008b\u0018uïÚ\u008dA?\u0018fø[\u0093³\u0000ON\u009fò\r\u001boxb(\u0086\u0010Ú \u0093L\u0082» 9±t\u0015c°\u0092úb\u000fÚ\u001a\u001aO?\u001dÙ&¡ýáè\u0084h\u008f\u0085\u0084\u0002÷öu+\u0010\",Ãd&ùËþ\u008e8£å\\[ÇK \t\u0005\u0013\u0099\u0005\u001aé¼{ ²¯iajðD°\rTÅ\u0084·Ã\u0006\u00910¥Õë\u0013Ä\u0010\u001bé*D±Iå\u009az<´%Á@R\u001f(\u000b\"\\m¥óÇ\u0091\u0081ß6D\u008e\u0011EsR=\u0014`\u0090\u00ad4I±ø15r¼\nÀ{ú²¤0Ã â\u0010¨/\u0017\u001aÔÛà/7\u0097K¸Ößý$";
      int var8 = "¼ºN´}Çå95Q\u0017óß\u009cÈMhê\u0014Z\u0013ÂÁZ(+\u001c¡FÎ³e#5°\u00068ÉpXF\u0098¶\u0093\n%§{y\u001eÒ\u0086Ú8×BqÊïÞùíÞåa\u0018´ÀÀ\u008f`aïë\u008dj«õ\u009d\u0089\u0093L«\u0085<Ë5\u0080¼\u0083 \u0012aGý\u0006ª+Áë\u009f¡\u008e\u0017\tX\u008eç.²93Ó¦®\u001dë1Áy5{a(\u000e°\u001d\u0000i\u0005¸EäOw\u0097øn\u0004 C\u0010³Ñ2äàeP<éP¡Æ$\u0003KEøwi\u009b¡h \u0087¢\u008cKý3(z v\u0096èõzWTh¤F{*têûñÉ@\u009bÝ-\u001b\u0087(shÎøÇnÜ\u0011êà.QÎÕ\u0096÷>\u0097\u008dô\u0017\u0093îèá{qëÅ \u0006çëØÒ\u008bº3B\u009a \u0091©ÿ6|7û(\u009e9õÙg\u0080\u0019nº\u0014¢(,Q«ÏDXMi¶Ö\u000e²\u0010äWaÝØ\tv\u009e¦¨`;É æÔX{ª0k¨¡\u009b\u008f?g\u009c[ÇÚ\u0080²\u0014\u008f\u001e\u001elY¤¸\u009aâ\u0096?NÄç\"YûX\nÁÄC\u001fn\u008a\u0098wX\u0087¯\u001bÊF\u0093x\u0082\u0005\u009c®å\u0019½SÂÎàü1ÏÏ¡ãÔG\"¢é6U\\+¯¦\u000fíYÊÎ\u0098¡[\u0010\u0080ø!\u0005&´@gäsë¥zp¤Ý YÞ\u009e}e¡^So9\tÃHT\bFáì±ò:|®%;$íK<\u001e¼}\u0018\u0011Dö\"®\u0095j@ä²C\u009déÅ¥R5Û½.}ÄaM\u0018I²r+ót»\tT\u008e#^\u0006\u001fC\u008d\u0010\u0081V \u0019\u0011i\u000e\u0010\u0082ûï\u0001xM\u008b\u0019£\u009b\f\u0015Â¥\u0080\u001c\u0010Ü¦ökPÝFÏù/k\u001cû\u001d.C 3Í¡·þñ#\u0097\u0097}\rS\u0080\u0083å-\u0089pSE\u001b\u0003ó9Ðc¤\u001b\n;\u000bÍ\u0010ÆÕ£\u008c\u000e°\u0011\u0016lÝ1ÆÌÂÊs(¯×\u0085}Ä©ÃñI\u0013r\u00adÄW\u0090\fÿ\u000be\u009d\u0090\u009f`\u0004\u009cmk[§Saw\u00069{Ä\u0098R$\u001c A¤@\u0019¹\u00163Ö\u008aÐ\u008aK\u0081Ý&\u00188õAx\u0091\u0019?\u0019Ä-\u0000#1Ç}Ñ }3× \u0019¾ë\u00ad\u0095©\u0019Ä}\u0098QSoç\u0098¼*¥ÏX\u00148©ýÜîF\u0083\u0018z³\u000e\u0096©9ÂØ\u00911\u00ad\u001c1\\í\u0080XA¶+ýÑ\u0003\u0002\u0010ßgsy.\u008c\u00ad¤Ò\u0014\u0004qÐ$\u0097ä\u0010¼,s\u008e\u009fphöGN\u008aÄÊd\u001a¼\u0010I\u0005\u0017\u0094\u00ad«Ugk?Ñ62§÷B\u0010Z}0 QT)\u008e\u0087M\u0098ú¿,öy\u0010\u0002\u008aÜ e^ Üæ>öi~\bOW \u0004\u0005Oô¬?¬U\u009d_ûÙÒ±cJn\u0012yÄG}l§©Ï_95gè`(\u0001Þ\u009a#\u000b\f[\u0089\u0092\u0015\u0097\u0096Â&6\u008bY¥¡X\u009bã\u000bÀ\u001d\u00ad\u0010ÏS»\u009cH\u0011@\u0092\u000b¯7\u00154(zJ*\u007f5\u0095k«\u000f\u009a=|[\u008c ÓWDF¬Em¡\u001dEb·v\u0011J:Go\u008b\u008f©\u0014\u0086\u0099[ fÐ/1X\u0087X\u0098H\u00139Ð\u0017\b©bóâ\u008e0zI÷y\u001d¬\büú2øß\u0010\u0000\u0081Ñjä{×r2¡Öx¯OÌG(-L\u0015>Y§ðsY1BÁ\u001b%ÀX\\ò\u00057Ìîu\u0014CÍÄ\u0088Dq\u008eÖ\u008b\u0018uïÚ\u008dA?\u0018fø[\u0093³\u0000ON\u009fò\r\u001boxb(\u0086\u0010Ú \u0093L\u0082» 9±t\u0015c°\u0092úb\u000fÚ\u001a\u001aO?\u001dÙ&¡ýáè\u0084h\u008f\u0085\u0084\u0002÷öu+\u0010\",Ãd&ùËþ\u008e8£å\\[ÇK \t\u0005\u0013\u0099\u0005\u001aé¼{ ²¯iajðD°\rTÅ\u0084·Ã\u0006\u00910¥Õë\u0013Ä\u0010\u001bé*D±Iå\u009az<´%Á@R\u001f(\u000b\"\\m¥óÇ\u0091\u0081ß6D\u008e\u0011EsR=\u0014`\u0090\u00ad4I±ø15r¼\nÀ{ú²¤0Ã â\u0010¨/\u0017\u001aÔÛà/7\u0097K¸Ößý$"
         .length();
      char var5 = 24;
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
                     c = new String[42];
                     vf2 = LogManager.getLogger();
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

                  var6 = "\u009ai~«\búI °i\u000f\u009a\u0091ÈP¡\u0010\u007f\u0089ööw\u000eêâ!Ú¡\u009dþÚëp";
                  var8 = "\u009ai~«\búI °i\u000f\u009a\u0091ÈP¡\u0010\u007f\u0089ööw\u000eêâ!Ú¡\u009dþÚëp".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22371;
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
            throw new RuntimeException("a16", var10);
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
         throw new RuntimeException("a16" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
