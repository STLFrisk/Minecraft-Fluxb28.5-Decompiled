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
import org.lwjgl.opengl.GL11;

public class fyk extends ar7 {
   public static g_3 kfa;
   public static cn7 s4u;
   public static crk w1a;
   public static crk vto;
   public static crk bxq;
   public static crk u2o;
   public static crk q84;
   public static crk kog;
   public static crk exx;
   public static cn7 jff;
   public static cn7 dsv;
   public static cn7 qa6;
   public static cn7 ky3;
   public static cn7 sy_;
   public static cn7 g4y;
   public static cn7 ogx;
   public static c_3 qiz;
   public static ArrayList r3i;
   public nhs kl3;
   public static int bwo;
   public static boolean f8f;
   public static boolean qcf;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public fyk() {
      long var1 = a ^ 127874859075502L;
      super(b<"i">(7821, 1223665432311961805L ^ var1), _aj.p3z, true, new j1s[]{new xbs(true), new xbs(false), new e9p()});
      this.kl3 = new nhs();
   }

   @jev(
      jn1 = 3
   )
   public void k27(fha param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fyk.a J
      // 003: ldc2_w 124938212027587
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: getstatic fyk.g4y Lcn7;
      // 010: invokevirtual cn7.g7m ()Z
      // 013: iload 4
      // 015: ifne 035
      // 018: ifeq 15e
      // 01b: goto 022
      // 01e: invokestatic fyk.a (Loov;)Loov;
      // 021: athrow
      // 022: getstatic kgt.nd5 Lfyk;
      // 025: getfield fyk.kl3 Lnhs;
      // 028: ldc2_w 50.0
      // 02b: invokevirtual nhs.us_ (D)Z
      // 02e: goto 035
      // 031: invokestatic fyk.a (Loov;)Loov;
      // 034: athrow
      // 035: ifeq 15e
      // 038: new eka
      // 03b: dup
      // 03c: getstatic fyk.ek1 Lc05;
      // 03f: invokespecial eka.<init> (Lc05;)V
      // 042: astore 5
      // 044: bipush 0
      // 045: istore 6
      // 047: getstatic fyk.ek1 Lc05;
      // 04a: getfield c05.tij Lkh3;
      // 04d: getfield kh3.guf Ljava/util/List;
      // 050: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 055: astore 7
      // 057: aload 7
      // 059: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05e: ifeq 15e
      // 061: aload 7
      // 063: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 068: checkcast i2h
      // 06b: astore 8
      // 06d: aload 8
      // 06f: iload 4
      // 071: ifne 08a
      // 074: instanceof ha9
      // 077: ifeq 159
      // 07a: goto 081
      // 07d: invokestatic fyk.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 8
      // 083: goto 08a
      // 086: invokestatic fyk.a (Loov;)Loov;
      // 089: athrow
      // 08a: checkcast ha9
      // 08d: astore 9
      // 08f: aload 0
      // 090: invokevirtual fyk.smu ()Lc_3;
      // 093: sipush 1255
      // 096: ldc2_w 1876012688530909636
      // 099: lload 2
      // 09a: lxor
      // 09b: invokedynamic i (IJ)Ljava/lang/String; bsm=fyk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: nop
      // 0a1: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 0a4: ifeq 0b1
      // 0a7: getstatic xbs.lo6 Ljava/util/List;
      // 0aa: astore 10
      // 0ac: iload 4
      // 0ae: ifeq 0c5
      // 0b1: new java/util/ArrayList
      // 0b4: dup
      // 0b5: invokespecial java/util/ArrayList.<init> ()V
      // 0b8: astore 10
      // 0ba: aload 10
      // 0bc: getstatic fyk.kfa Lg_3;
      // 0bf: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c4: pop
      // 0c5: aload 10
      // 0c7: aload 8
      // 0c9: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0ce: ifeq 12e
      // 0d1: aload 9
      // 0d3: getfield ha9.pwz Lfyk$r1f;
      // 0d6: iload 4
      // 0d8: ifne 107
      // 0db: goto 0e2
      // 0de: invokestatic fyk.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ifnonnull 102
      // 0e5: goto 0ec
      // 0e8: invokestatic fyk.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 9
      // 0ee: new fyk$r1f
      // 0f1: dup
      // 0f2: aload 0
      // 0f3: aload 9
      // 0f5: invokespecial fyk$r1f.<init> (Lfyk;Lha9;)V
      // 0f8: putfield ha9.pwz Lfyk$r1f;
      // 0fb: goto 102
      // 0fe: invokestatic fyk.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 9
      // 104: getfield ha9.pwz Lfyk$r1f;
      // 107: aload 5
      // 109: invokevirtual eka.x05 ()I
      // 10c: bipush 2
      // 10d: idiv
      // 10e: bipush 20
      // 110: iadd
      // 111: i2f
      // 112: aload 5
      // 114: invokevirtual eka.lrx ()I
      // 117: bipush 2
      // 118: idiv
      // 119: bipush 20
      // 11b: isub
      // 11c: iload 6
      // 11e: bipush 45
      // 120: imul
      // 121: iadd
      // 122: i2f
      // 123: invokevirtual fyk$r1f.cag (FF)V
      // 126: iinc 6 1
      // 129: iload 4
      // 12b: ifeq 159
      // 12e: aload 9
      // 130: getfield ha9.pwz Lfyk$r1f;
      // 133: iload 4
      // 135: ifne 155
      // 138: goto 13f
      // 13b: invokestatic fyk.a (Loov;)Loov;
      // 13e: athrow
      // 13f: ifnull 159
      // 142: goto 149
      // 145: invokestatic fyk.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 9
      // 14b: getfield ha9.pwz Lfyk$r1f;
      // 14e: goto 155
      // 151: invokestatic fyk.a (Loov;)Loov;
      // 154: athrow
      // 155: fconst_0
      // 156: putfield fyk$r1f.q5z F
      // 159: iload 4
      // 15b: ifeq 057
      // 15e: return
   }

   @Override
   public void ron() {
      r3i.clear();
      super.ron();
   }

   @Override
   public void ne2() {
      kfa = null;
      super.ne2();
   }

   @jev
   public void ohn(ccn var1) {
      long var2 = a ^ 3406714815446L;
      this.n5o(this.m2d() + b<"i">(10268, 353930399291370033L ^ var2) + this.smu().d7c());
   }

   @jev
   public void __1(axn var1) {
      long var2 = a ^ 44366994841768L;

      try {
         if (sy_.d7c()) {
            this.yse(false);
            zet.gn0(b<"i">(2589, 3357766434583194454L ^ var2), this.m2d() + b<"i">(557, 7858161981300614007L ^ var2), jgv$vro.h_d);
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   public static boolean b6k(g_3 param0, double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fyk.a J
      // 003: ldc2_w 21793117888287
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield g_3.ma9 Z
      // 011: iload 5
      // 013: ifeq 067
      // 016: ifne 059
      // 019: goto 020
      // 01c: invokestatic fyk.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: invokevirtual g_3.i55 ()F
      // 024: fconst_0
      // 025: fcmpg
      // 026: iload 5
      // 028: ifeq 067
      // 02b: goto 032
      // 02e: invokestatic fyk.a (Loov;)Loov;
      // 031: athrow
      // 032: ifle 059
      // 035: goto 03c
      // 038: invokestatic fyk.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 0
      // 03d: iload 5
      // 03f: ifeq 0d9
      // 042: goto 049
      // 045: invokestatic fyk.a (Loov;)Loov;
      // 048: athrow
      // 049: getstatic fyk.ek1 Lc05;
      // 04c: getfield c05.vg8 Ll86;
      // 04f: if_acmpne 0d8
      // 052: goto 059
      // 055: invokestatic fyk.a (Loov;)Loov;
      // 058: athrow
      // 059: getstatic fyk.r3i Ljava/util/ArrayList;
      // 05c: aload 0
      // 05d: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 060: goto 067
      // 063: invokestatic fyk.a (Loov;)Loov;
      // 066: athrow
      // 067: iload 5
      // 069: ifeq 0d7
      // 06c: ifeq 0d6
      // 06f: goto 076
      // 072: invokestatic fyk.a (Loov;)Loov;
      // 075: athrow
      // 076: getstatic fyk.bwo I
      // 079: bipush 1
      // 07a: iadd
      // 07b: putstatic fyk.bwo I
      // 07e: getstatic kgt.ynw Lpjd;
      // 081: invokevirtual pjd.klu ()Z
      // 084: iload 5
      // 086: ifeq 0d7
      // 089: goto 090
      // 08c: invokestatic fyk.a (Loov;)Loov;
      // 08f: athrow
      // 090: ifeq 0d6
      // 093: goto 09a
      // 096: invokestatic fyk.a (Loov;)Loov;
      // 099: athrow
      // 09a: getstatic fyk.r3i Ljava/util/ArrayList;
      // 09d: aload 0
      // 09e: invokevirtual java/util/ArrayList.remove (Ljava/lang/Object;)Z
      // 0a1: pop
      // 0a2: aload 0
      // 0a3: invokevirtual g_3.noc ()Ljava/lang/String;
      // 0a6: invokestatic pjd.l4v (Ljava/lang/String;)Ljava/lang/String;
      // 0a9: invokestatic ncl.vhi (Ljava/lang/String;)V
      // 0ac: getstatic pjd.qq7 Lcn7;
      // 0af: invokevirtual cn7.g7m ()Z
      // 0b2: iload 5
      // 0b4: ifeq 0d7
      // 0b7: goto 0be
      // 0ba: invokestatic fyk.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: ifeq 0d6
      // 0c1: goto 0c8
      // 0c4: invokestatic fyk.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: invokevirtual g_3.noc ()Ljava/lang/String;
      // 0cc: invokestatic ncl.bt6 (Ljava/lang/String;)V
      // 0cf: goto 0d6
      // 0d2: invokestatic fyk.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: ireturn
      // 0d8: aload 0
      // 0d9: instanceof h67
      // 0dc: iload 5
      // 0de: ifeq 0f5
      // 0e1: ifeq 0f1
      // 0e4: goto 0eb
      // 0e7: invokestatic fyk.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: bipush 0
      // 0ec: ireturn
      // 0ed: invokestatic fyk.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: invokevirtual g_3.h5u ()Z
      // 0f5: iload 5
      // 0f7: ifeq 12d
      // 0fa: ifeq 129
      // 0fd: goto 104
      // 100: invokestatic fyk.a (Loov;)Loov;
      // 103: athrow
      // 104: getstatic fyk.ky3 Lcn7;
      // 107: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 10a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10d: iload 5
      // 10f: ifeq 12d
      // 112: goto 119
      // 115: invokestatic fyk.a (Loov;)Loov;
      // 118: athrow
      // 119: ifne 129
      // 11c: goto 123
      // 11f: invokestatic fyk.a (Loov;)Loov;
      // 122: athrow
      // 123: bipush 0
      // 124: ireturn
      // 125: invokestatic fyk.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: instanceof ha9
      // 12d: iload 5
      // 12f: ifeq 1a9
      // 132: ifeq 1a5
      // 135: goto 13c
      // 138: invokestatic fyk.a (Loov;)Loov;
      // 13b: athrow
      // 13c: getstatic kgt.p71 Lar9;
      // 13f: invokevirtual ar9.klu ()Z
      // 142: iload 5
      // 144: ifeq 1a9
      // 147: goto 14e
      // 14a: invokestatic fyk.a (Loov;)Loov;
      // 14d: athrow
      // 14e: ifeq 1a5
      // 151: goto 158
      // 154: invokestatic fyk.a (Loov;)Loov;
      // 157: athrow
      // 158: getstatic kgt.p71 Lar9;
      // 15b: invokevirtual ar9.smu ()Lc_3;
      // 15e: sipush 19547
      // 161: ldc2_w 4801991806233678501
      // 164: lload 3
      // 165: lxor
      // 166: invokedynamic i (IJ)Ljava/lang/String; bsm=fyk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: nop
      // 16c: invokevirtual c_3.wyk (Ljava/lang/String;)Z
      // 16f: iload 5
      // 171: ifeq 1a9
      // 174: goto 17b
      // 177: invokestatic fyk.a (Loov;)Loov;
      // 17a: athrow
      // 17b: ifeq 1a5
      // 17e: goto 185
      // 181: invokestatic fyk.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 0
      // 186: invokestatic ar9.nqw (Li2h;)Z
      // 189: iload 5
      // 18b: ifeq 1a9
      // 18e: goto 195
      // 191: invokestatic fyk.a (Loov;)Loov;
      // 194: athrow
      // 195: ifeq 1a5
      // 198: goto 19f
      // 19b: invokestatic fyk.a (Loov;)Loov;
      // 19e: athrow
      // 19f: bipush 0
      // 1a0: ireturn
      // 1a1: invokestatic fyk.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: instanceof ha9
      // 1a9: iload 5
      // 1ab: ifeq 1e1
      // 1ae: ifeq 1dd
      // 1b1: goto 1b8
      // 1b4: invokestatic fyk.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: getstatic fyk.dsv Lcn7;
      // 1bb: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 1be: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1c1: iload 5
      // 1c3: ifeq 1e1
      // 1c6: goto 1cd
      // 1c9: invokestatic fyk.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: ifne 1dd
      // 1d0: goto 1d7
      // 1d3: invokestatic fyk.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: bipush 0
      // 1d8: ireturn
      // 1d9: invokestatic fyk.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: instanceof laq
      // 1e1: iload 5
      // 1e3: ifeq 24e
      // 1e6: ifne 23e
      // 1e9: goto 1f0
      // 1ec: invokestatic fyk.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: instanceof l5f
      // 1f4: iload 5
      // 1f6: ifeq 24e
      // 1f9: goto 200
      // 1fc: invokestatic fyk.a (Loov;)Loov;
      // 1ff: athrow
      // 200: ifne 23e
      // 203: goto 20a
      // 206: invokestatic fyk.a (Loov;)Loov;
      // 209: athrow
      // 20a: aload 0
      // 20b: instanceof dge
      // 20e: iload 5
      // 210: ifeq 24e
      // 213: goto 21a
      // 216: invokestatic fyk.a (Loov;)Loov;
      // 219: athrow
      // 21a: ifne 23e
      // 21d: goto 224
      // 220: invokestatic fyk.a (Loov;)Loov;
      // 223: athrow
      // 224: aload 0
      // 225: instanceof w8s
      // 228: iload 5
      // 22a: ifeq 270
      // 22d: goto 234
      // 230: invokestatic fyk.a (Loov;)Loov;
      // 233: athrow
      // 234: ifeq 263
      // 237: goto 23e
      // 23a: invokestatic fyk.a (Loov;)Loov;
      // 23d: athrow
      // 23e: getstatic fyk.jff Lcn7;
      // 241: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 244: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 247: goto 24e
      // 24a: invokestatic fyk.a (Loov;)Loov;
      // 24d: athrow
      // 24e: iload 5
      // 250: ifeq 270
      // 253: ifne 263
      // 256: goto 25d
      // 259: invokestatic fyk.a (Loov;)Loov;
      // 25c: athrow
      // 25d: bipush 0
      // 25e: ireturn
      // 25f: invokestatic fyk.a (Loov;)Loov;
      // 262: athrow
      // 263: aload 0
      // 264: getstatic fyk.ek1 Lc05;
      // 267: getfield c05.vg8 Ll86;
      // 26a: invokevirtual g_3.tm6 (Li2h;)F
      // 26d: f2d
      // 26e: dload 1
      // 26f: dcmpl
      // 270: iload 5
      // 272: ifeq 292
      // 275: ifle 285
      // 278: goto 27f
      // 27b: invokestatic fyk.a (Loov;)Loov;
      // 27e: athrow
      // 27f: bipush 0
      // 280: ireturn
      // 281: invokestatic fyk.a (Loov;)Loov;
      // 284: athrow
      // 285: aload 0
      // 286: getstatic fyk.exx Lcrk;
      // 289: invokevirtual crk.d7c ()Ljava/lang/Float;
      // 28c: invokevirtual java/lang/Float.floatValue ()F
      // 28f: invokestatic omb.jok (Li2h;F)Z
      // 292: iload 5
      // 294: ifeq 2ab
      // 297: ifne 2a7
      // 29a: goto 2a1
      // 29d: invokestatic fyk.a (Loov;)Loov;
      // 2a0: athrow
      // 2a1: bipush 0
      // 2a2: ireturn
      // 2a3: invokestatic fyk.a (Loov;)Loov;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: instanceof ha9
      // 2ab: iload 5
      // 2ad: ifeq 302
      // 2b0: ifeq 2fc
      // 2b3: goto 2ba
      // 2b6: invokestatic fyk.a (Loov;)Loov;
      // 2b9: athrow
      // 2ba: aload 0
      // 2bb: checkcast ha9
      // 2be: invokestatic f62.a92 (Lha9;)Z
      // 2c1: iload 5
      // 2c3: ifeq 302
      // 2c6: goto 2cd
      // 2c9: invokestatic fyk.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: ifeq 2fc
      // 2d0: goto 2d7
      // 2d3: invokestatic fyk.a (Loov;)Loov;
      // 2d6: athrow
      // 2d7: getstatic zwr.o1s Lcn7;
      // 2da: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 2dd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e0: iload 5
      // 2e2: ifeq 302
      // 2e5: goto 2ec
      // 2e8: invokestatic fyk.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: ifeq 2fc
      // 2ef: goto 2f6
      // 2f2: invokestatic fyk.a (Loov;)Loov;
      // 2f5: athrow
      // 2f6: bipush 0
      // 2f7: ireturn
      // 2f8: invokestatic fyk.a (Loov;)Loov;
      // 2fb: athrow
      // 2fc: getstatic kgt.p71 Lar9;
      // 2ff: invokevirtual ar9.klu ()Z
      // 302: iload 5
      // 304: ifeq 335
      // 307: ifeq 334
      // 30a: goto 311
      // 30d: invokestatic fyk.a (Loov;)Loov;
      // 310: athrow
      // 311: getstatic kgt.p71 Lar9;
      // 314: aload 0
      // 315: invokevirtual ar9.kh5 (Lg_3;)Z
      // 318: iload 5
      // 31a: ifeq 335
      // 31d: goto 324
      // 320: invokestatic fyk.a (Loov;)Loov;
      // 323: athrow
      // 324: ifeq 334
      // 327: goto 32e
      // 32a: invokestatic fyk.a (Loov;)Loov;
      // 32d: athrow
      // 32e: bipush 0
      // 32f: ireturn
      // 330: invokestatic fyk.a (Loov;)Loov;
      // 333: athrow
      // 334: bipush 1
      // 335: ireturn
   }

   public static boolean szx() {
      return f8f;
   }

   public static void hpe(g_3 param0) {
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
      // 05: ifnonnull 0d
      // 08: return
      // 09: invokestatic fyk.a (Loov;)Loov;
      // 0c: athrow
      // 0d: getstatic fyk.r3i Ljava/util/ArrayList;
      // 10: aload 0
      // 11: invokevirtual java/util/ArrayList.contains (Ljava/lang/Object;)Z
      // 14: iload 1
      // 15: ifeq 2d
      // 18: ifne 4a
      // 1b: goto 22
      // 1e: invokestatic fyk.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: instanceof ha9
      // 26: goto 2d
      // 29: invokestatic fyk.a (Loov;)Loov;
      // 2c: athrow
      // 2d: iload 1
      // 2e: ifeq 49
      // 31: ifeq 4a
      // 34: goto 3b
      // 37: invokestatic fyk.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getstatic fyk.r3i Ljava/util/ArrayList;
      // 3e: aload 0
      // 3f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 42: goto 49
      // 45: invokestatic fyk.a (Loov;)Loov;
      // 48: athrow
      // 49: pop
      // 4a: getstatic fyk.ek1 Lc05;
      // 4d: getfield c05.vg8 Ll86;
      // 50: invokevirtual l86.hgb ()V
      // 53: getstatic fyk.ek1 Lc05;
      // 56: invokevirtual c05.c02 ()Lp_k;
      // 59: invokevirtual p_k._m3 ()Lhv0;
      // 5c: new net/minecraft/network/play/client/C02PacketUseEntity
      // 5f: dup
      // 60: aload 0
      // 61: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 64: invokespecial net/minecraft/network/play/client/C02PacketUseEntity.<init> (Li2h;Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;)V
      // 67: invokevirtual hv0.k7f (Lmz2;)V
      // 6a: getstatic fyk.ek1 Lc05;
      // 6d: getfield c05.vg8 Ll86;
      // 70: getfield l86.up_ Ljnq;
      // 73: invokevirtual jnq.dxs ()Lerg;
      // 76: aload 0
      // 77: invokevirtual g_3.fhc ()Ln1e;
      // 7a: invokestatic hc0.xpe (Lerg;Ln1e;)F
      // 7d: fstore 2
      // 7e: fload 2
      // 7f: fconst_0
      // 80: fcmpl
      // 81: ifle 95
      // 84: getstatic fyk.ek1 Lc05;
      // 87: getfield c05.vg8 Ll86;
      // 8a: aload 0
      // 8b: invokevirtual l86.eej (Li2h;)V
      // 8e: goto 95
      // 91: invokestatic fyk.a (Loov;)Loov;
      // 94: athrow
      // 95: return
   }

   public static void kmt() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic fyk.qcf Z
      // 07: iload 0
      // 08: ifne 43
      // 0b: ifeq 46
      // 0e: goto 15
      // 11: invokestatic fyk.a (Loov;)Loov;
      // 14: athrow
      // 15: getstatic fyk.ek1 Lc05;
      // 18: getfield c05.vg8 Ll86;
      // 1b: getfield l86.lq7 Lp_k;
      // 1e: invokevirtual p_k._m3 ()Lhv0;
      // 21: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 24: dup
      // 25: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.md_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 28: new mew
      // 2b: dup
      // 2c: bipush -1
      // 2d: bipush -1
      // 2e: bipush -1
      // 2f: invokespecial mew.<init> (III)V
      // 32: getstatic vt2.m3r Lvt2;
      // 35: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 38: invokevirtual hv0.k7f (Lmz2;)V
      // 3b: bipush 0
      // 3c: goto 43
      // 3f: invokestatic fyk.a (Loov;)Loov;
      // 42: athrow
      // 43: putstatic fyk.qcf Z
      // 46: return
   }

   public static double mmr(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: dload 0
      // 06: dload 2
      // 07: iload 4
      // 09: ifne 2e
      // 0c: dcmpl
      // 0d: iflt 1f
      // 10: goto 17
      // 13: invokestatic fyk.a (Loov;)Loov;
      // 16: athrow
      // 17: dload 0
      // 18: goto 2f
      // 1b: invokestatic fyk.a (Loov;)Loov;
      // 1e: athrow
      // 1f: new java/util/Random
      // 22: dup
      // 23: invokespecial java/util/Random.<init> ()V
      // 26: invokevirtual java/util/Random.nextDouble ()D
      // 29: dload 2
      // 2a: dload 0
      // 2b: dsub
      // 2c: dmul
      // 2d: dload 0
      // 2e: dadd
      // 2f: dreturn
   }

   public static boolean x64(g_3 var0) {
      return b6k(var0, (double)w1a.d7c().floatValue());
   }

   public static boolean g20(g_3 var0) {
      return b6k(var0, (double)(w1a.d7c() + vto.d7c()));
   }

   public void z57(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      float var11 = 1.0F / var9;
      float var12 = 1.0F / var10;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      jom var13 = jom.yut();
      q3g var14 = var13.zuq();
      var14.ezr(7, gnl._r5);
      var14.g5o((double)var1, (double)(var2 + var8), 0.0).h0a((double)(var3 * var11), (double)((var4 + var6) * var12)).pzw();
      var14.g5o((double)(var1 + var7), (double)(var2 + var8), 0.0).h0a((double)((var3 + var5) * var11), (double)((var4 + var6) * var12)).pzw();
      var14.g5o((double)(var1 + var7), (double)var2, 0.0).h0a((double)((var3 + var5) * var11), (double)(var4 * var12)).pzw();
      var14.g5o((double)var1, (double)var2, 0.0).h0a((double)(var3 * var11), (double)(var4 * var12)).pzw();
      var13.q7g();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-267909094280298331L, 2032482130652919795L, MethodHandles.lookup().lookupClass()).a(16291667741731L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 77779576121370L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[29];
      int var5 = 0;
      String var4 = "¯òâ¥=\u008e\u008amjÕB\u008cß\u000e¸\u00adê=K\u0000{§÷\u0087\u0018[ZóA¹\u000fzæÐ|\u008f\"´\u0096\u0082u\u0096^ä\u008dÞ\u0011¿ð\u0010l\u008c\f¼ò¤\u0084¡®¸9;\fîú¾(ømK\b½AËT\u0092\u0016\u00ad\u000679Pú\u0098\u008b'ØÇt®¢ÿ5éië\u0003¾\u000f´8Í×\u008cØD+\u0018ÈP#A+qòò«j«ç«\u0018ø^\u000f^\u009f¨é\u009a\u0083;(\"¯\u001c*óaOH\u0007ºp\u00021¶ÐÑå*;\u0085ÎØíD[\u000e\u0094i\u0084 \u0082¹F\u007fÂ³ä\u008cs4\u00105Víe\u0085\u0088\u0089Õh²²K\u0019_½\u0087\u0010\u0092p¦cvz;Ô²K<\u008am ôX\u0010ôý\u0097\u009fùÒ&\u00814\u0092£RÎÊ\u0001= 4C\u0016HCKÝ\u0092û .ç\u0084M\\&ÿ\u001e\u001cÙ³\u0019\u00195»LÚ\u008a!\u0017\u001b#\u0018e!&¿d\u008bëþ\u0081¼\u0085ù\u008bÒ\u0099'\u000føx\u001fjUd!\u0010\u007fÁ\u0099¾£ cÊ\u0017\u0088ùÅ\u008a16¢\u0010\u0087\u0000è\u0090\u00995ÊK¯Ùëèu-êW \td\u0080·Õ/ÿ\u0094ø\r+\u001b`\u001d½\"þ\u0014\u008aÊ\u000e#PÎZÐ5V\u008c³\u00063\u0010ª\u0012Ç¢®\u0005{L\u0086¬?\u008b¡30\u0096\u0010Ò-½\u0089\u0089U\u0017\u008bpq¯Ñhw\u0099]\u0010¹¥8;Ýi\u0083ÜÀ*J\u0019s®Y\u00ad \u0084¦¦Ô5\u0087¨FGàÐ\u0084´[af\u008c\u000fñ»\u009e\u007fEfBø\u0007d¼µpa\u0010×Î\u0091\u00033D¹|\u0080\u001c\u009d\u0094H\u0017Ç  :-\u0016k)çñ\u009bçØ\u0007g|\u001e\u008d=¾\u000476\u008b\u000e/m\u0081\u001db¬Ý\u0082 Á\u0010_äÄ\u0006ËP_Ö\u0094\u0084\u0099ËzÐ\u0014 \u0010ÿa\u009eç,\u0002C{iã.\u0011\u0099\u0095µÂ\u0010\u007fi4ñ(\u001c¦ª²HaÎ\u001b\u001aÍ\u009a\u0010äðû\u001d\u009c\u0089º\u001d\u0080Ý¶(ãM\u0004y\u0010AD$Ouqü\u0015\u0082\u0096Þt9D¦\u0094 Wa÷ \u0002kôÎ=(\u0017KhP\u0095\u0007¸\u0098J\u00adÃ\u0087ëx\u0092¼½\u0090B|ne ÝÇí¼üm6-\n\u0014¸±%J\u009cù\u009eÿ\u000eb[\u009bfç\u007fàD¼\u008f(\u0082R";
      int var6 = "¯òâ¥=\u008e\u008amjÕB\u008cß\u000e¸\u00adê=K\u0000{§÷\u0087\u0018[ZóA¹\u000fzæÐ|\u008f\"´\u0096\u0082u\u0096^ä\u008dÞ\u0011¿ð\u0010l\u008c\f¼ò¤\u0084¡®¸9;\fîú¾(ømK\b½AËT\u0092\u0016\u00ad\u000679Pú\u0098\u008b'ØÇt®¢ÿ5éië\u0003¾\u000f´8Í×\u008cØD+\u0018ÈP#A+qòò«j«ç«\u0018ø^\u000f^\u009f¨é\u009a\u0083;(\"¯\u001c*óaOH\u0007ºp\u00021¶ÐÑå*;\u0085ÎØíD[\u000e\u0094i\u0084 \u0082¹F\u007fÂ³ä\u008cs4\u00105Víe\u0085\u0088\u0089Õh²²K\u0019_½\u0087\u0010\u0092p¦cvz;Ô²K<\u008am ôX\u0010ôý\u0097\u009fùÒ&\u00814\u0092£RÎÊ\u0001= 4C\u0016HCKÝ\u0092û .ç\u0084M\\&ÿ\u001e\u001cÙ³\u0019\u00195»LÚ\u008a!\u0017\u001b#\u0018e!&¿d\u008bëþ\u0081¼\u0085ù\u008bÒ\u0099'\u000føx\u001fjUd!\u0010\u007fÁ\u0099¾£ cÊ\u0017\u0088ùÅ\u008a16¢\u0010\u0087\u0000è\u0090\u00995ÊK¯Ùëèu-êW \td\u0080·Õ/ÿ\u0094ø\r+\u001b`\u001d½\"þ\u0014\u008aÊ\u000e#PÎZÐ5V\u008c³\u00063\u0010ª\u0012Ç¢®\u0005{L\u0086¬?\u008b¡30\u0096\u0010Ò-½\u0089\u0089U\u0017\u008bpq¯Ñhw\u0099]\u0010¹¥8;Ýi\u0083ÜÀ*J\u0019s®Y\u00ad \u0084¦¦Ô5\u0087¨FGàÐ\u0084´[af\u008c\u000fñ»\u009e\u007fEfBø\u0007d¼µpa\u0010×Î\u0091\u00033D¹|\u0080\u001c\u009d\u0094H\u0017Ç  :-\u0016k)çñ\u009bçØ\u0007g|\u001e\u008d=¾\u000476\u008b\u000e/m\u0081\u001db¬Ý\u0082 Á\u0010_äÄ\u0006ËP_Ö\u0094\u0084\u0099ËzÐ\u0014 \u0010ÿa\u009eç,\u0002C{iã.\u0011\u0099\u0095µÂ\u0010\u007fi4ñ(\u001c¦ª²HaÎ\u001b\u001aÍ\u009a\u0010äðû\u001d\u009c\u0089º\u001d\u0080Ý¶(ãM\u0004y\u0010AD$Ouqü\u0015\u0082\u0096Þt9D¦\u0094 Wa÷ \u0002kôÎ=(\u0017KhP\u0095\u0007¸\u0098J\u00adÃ\u0087ëx\u0092¼½\u0090B|ne ÝÇí¼üm6-\n\u0014¸±%J\u009cù\u009eÿ\u000eb[\u009bfç\u007fàD¼\u008f(\u0082R"
         .length();
      char var3 = 24;
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
                     f = var7;
                     g = new String[29];
                     s4u = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(20790, 2881597195283839169L ^ var9), false);
                     w1a = new crk(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(16443, 2424173500769511892L ^ var9), 4.2F, 1.0F, 8.0F, 0.1F);
                     vto = new crk(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(9686, 3336027193823382568L ^ var9), 2.0F, 0.0F, 4.0F, 0.1F);
                     bxq = new crk(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(18282, 5796076608206614151L ^ var9), 120.0F, 30.0F, 180.0F, 1.0F);
                     u2o = new crk(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(5387, 3339541480364473576L ^ var9), 10.0F, 1.0F, 20.0F, 1.0F);
                     q84 = new crk(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(10013, 8371644619011084029L ^ var9), 1000.0F, 1.0F, 2000.0F, 100.0F);
                     kog = new crk(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(13585, 1748968786151660790L ^ var9), 3.0F, 1.0F, 8.0F, 1.0F);
                     exx = new crk(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(7968, 4334470342411548354L ^ var9), 360.0F, 10.0F, 360.0F, 10.0F, "°");
                     jff = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(5827, 2420690982776176425L ^ var9), false);
                     dsv = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(31887, 1698781768392807794L ^ var9), true);
                     qa6 = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(23429, 6602755028007662187L ^ var9), false);
                     ky3 = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(10938, 2473371517320020811L ^ var9), true);
                     sy_ = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(20550, 7538218998660741562L ^ var9), true);
                     g4y = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(25109, 3174307329891273713L ^ var9), true);
                     ogx = new cn7(b<"i">(19941, 5820091837664928777L ^ var9), b<"i">(4399, 7904136941873002713L ^ var9), true);
                     qiz = new c_3(
                        b<"i">(19941, 5820091837664928777L ^ var9),
                        b<"i">(6827, 6282382598799553346L ^ var9),
                        b<"i">(27878, 1279464578561246477L ^ var9),
                        new String[]{
                           b<"i">(12865, 5330749718660799422L ^ var9),
                           b<"i">(13157, 2168451761219689091L ^ var9),
                           b<"i">(25331, 4764352610383760134L ^ var9),
                           b<"i">(29196, 6711082021866216425L ^ var9),
                           b<"i">(369, 7783385325243230345L ^ var9)
                        }
                     );
                     r3i = new ArrayList();
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

                  var4 = "õ`\u0018)Ù\u0093\\\u0011\u0011þª\u009f\u00943ßâ\u0015?çû\u0018\u008aYËõ[\u0005y\u0096Á\u008eX\u009f\u0087Hv·KN÷ \u0015¼Ì÷h>ûQÖ{òì=\u000e\u009e{ñcrx¹+\u001f'e§\u0080\u0003ÊÏjM";
                  var6 = "õ`\u0018)Ù\u0093\\\u0011\u0011þª\u009f\u00943ßâ\u0015?çû\u0018\u008aYËõ[\u0005y\u0096Á\u008eX\u009f\u0087Hv·KN÷ \u0015¼Ì÷h>ûQÖ{òì=\u000e\u009e{ñcrx¹+\u001f'e§\u0080\u0003ÊÏjM"
                     .length();
                  var3 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32049;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("fyk", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("fyk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
