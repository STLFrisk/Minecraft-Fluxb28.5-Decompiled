import java.awt.Color;
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

public class TabGui {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public TabGui() {
      this.pf6 = 3.0F;
      this.y91 = 3.0F;
      this.ww2 = this.dcn() + 15.0F;
      this.v15 = this.bnv(2.0F) + 2.0F;
   }

   public void d6d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic TabGui.a J
      // 003: ldc2_w 21124228910086
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getstatic ipp.jwf Lc_3;
      // 010: sipush 30171
      // 013: ldc2_w 3175047317870309338
      // 016: lload 1
      // 017: lxor
      // 018: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01d: nop
      // 01e: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 021: iload 3
      // 022: ifeq 04a
      // 025: ifne 064
      // 028: goto 02f
      // 02b: invokestatic TabGui.a (Loov;)Loov;
      // 02e: athrow
      // 02f: getstatic ipp.jwf Lc_3;
      // 032: sipush 1131
      // 035: ldc2_w 7450083240245337705
      // 038: lload 1
      // 039: lxor
      // 03a: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: nop
      // 040: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 043: goto 04a
      // 046: invokestatic TabGui.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 3
      // 04b: ifeq 061
      // 04e: ifeq 060
      // 051: goto 058
      // 054: invokestatic TabGui.a (Loov;)Loov;
      // 057: athrow
      // 058: bipush 5
      // 059: goto 065
      // 05c: invokestatic TabGui.a (Loov;)Loov;
      // 05f: athrow
      // 060: bipush 4
      // 061: goto 065
      // 064: bipush 4
      // 065: i2f
      // 066: putfield TabGui.pf6 F
      // 069: aload 0
      // 06a: bipush 3
      // 06b: getstatic ipp.jwf Lc_3;
      // 06e: sipush 25343
      // 071: ldc2_w 4474797456167565567
      // 074: lload 1
      // 075: lxor
      // 076: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: nop
      // 07c: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 07f: iload 3
      // 080: ifeq 0a8
      // 083: ifne 0c4
      // 086: goto 08d
      // 089: invokestatic TabGui.a (Loov;)Loov;
      // 08c: athrow
      // 08d: getstatic ipp.jwf Lc_3;
      // 090: sipush 25725
      // 093: ldc2_w 5989272278127017594
      // 096: lload 1
      // 097: lxor
      // 098: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: nop
      // 09e: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 0a1: goto 0a8
      // 0a4: invokestatic TabGui.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: iload 3
      // 0a9: ifeq 0c1
      // 0ac: ifeq 0bf
      // 0af: goto 0b6
      // 0b2: invokestatic TabGui.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: bipush 20
      // 0b8: goto 0c5
      // 0bb: invokestatic TabGui.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: bipush 15
      // 0c1: goto 0c5
      // 0c4: bipush 0
      // 0c5: iadd
      // 0c6: i2f
      // 0c7: putfield TabGui.y91 F
      // 0ca: aload 0
      // 0cb: invokespecial TabGui.t1f ()V
      // 0ce: aload 0
      // 0cf: invokespecial TabGui.td2 ()V
      // 0d2: aload 0
      // 0d3: invokespecial TabGui.ljv ()V
      // 0d6: aload 0
      // 0d7: invokespecial TabGui.fca ()V
      // 0da: invokestatic mkt.dkk ()V
      // 0dd: aload 0
      // 0de: getfield TabGui.ian Lsbi;
      // 0e1: aload 0
      // 0e2: getfield TabGui.wnv Lysh;
      // 0e5: getstatic ysh.rqt Lysh;
      // 0e8: if_acmpne 0f3
      // 0eb: bipush 1
      // 0ec: goto 0f4
      // 0ef: invokestatic TabGui.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: bipush 0
      // 0f4: invokevirtual sbi.qtk (Z)V
      // 0f7: aload 0
      // 0f8: getfield TabGui.re7 I
      // 0fb: i2f
      // 0fc: aload 0
      // 0fd: getfield TabGui.rvr F
      // 100: fcmpl
      // 101: iload 3
      // 102: ifeq 199
      // 105: ifeq 184
      // 108: goto 10f
      // 10b: invokestatic TabGui.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield TabGui.tu_ Lnhs;
      // 113: ldc2_w 10.0
      // 116: invokevirtual Timer.yrv (D)Z
      // 119: iload 3
      // 11a: ifeq 199
      // 11d: goto 124
      // 120: invokestatic TabGui.a (Loov;)Loov;
      // 123: athrow
      // 124: ifeq 184
      // 127: goto 12e
      // 12a: invokestatic TabGui.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 0
      // 12f: dup
      // 130: getfield TabGui.rvr F
      // 133: aload 0
      // 134: getfield TabGui.rvr F
      // 137: aload 0
      // 138: getfield TabGui.re7 I
      // 13b: i2f
      // 13c: iload 3
      // 13d: ifeq 176
      // 140: goto 147
      // 143: invokestatic TabGui.a (Loov;)Loov;
      // 146: athrow
      // 147: fcmpg
      // 148: ifge 169
      // 14b: goto 152
      // 14e: invokestatic TabGui.a (Loov;)Loov;
      // 151: athrow
      // 152: ldc 0.15
      // 154: nop
      // 155: aload 0
      // 156: getfield TabGui.re7 I
      // 159: i2f
      // 15a: aload 0
      // 15b: getfield TabGui.rvr F
      // 15e: fsub
      // 15f: invokestatic java/lang/Math.min (FF)F
      // 162: goto 179
      // 165: invokestatic TabGui.a (Loov;)Loov;
      // 168: athrow
      // 169: ldc -0.15
      // 16b: nop
      // 16c: aload 0
      // 16d: getfield TabGui.re7 I
      // 170: i2f
      // 171: aload 0
      // 172: getfield TabGui.rvr F
      // 175: fsub
      // 176: invokestatic java/lang/Math.max (FF)F
      // 179: fadd
      // 17a: putfield TabGui.rvr F
      // 17d: aload 0
      // 17e: getfield TabGui.tu_ Lnhs;
      // 181: invokevirtual Timer.zay ()V
      // 184: aload 0
      // 185: iload 3
      // 186: ifeq 212
      // 189: getfield TabGui.l3c I
      // 18c: i2f
      // 18d: aload 0
      // 18e: getfield TabGui.v46 F
      // 191: fcmpl
      // 192: goto 199
      // 195: invokestatic TabGui.a (Loov;)Loov;
      // 198: athrow
      // 199: ifeq 211
      // 19c: aload 0
      // 19d: iload 3
      // 19e: ifeq 212
      // 1a1: goto 1a8
      // 1a4: invokestatic TabGui.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: getfield TabGui.tu_ Lnhs;
      // 1ab: ldc2_w 10.0
      // 1ae: invokevirtual Timer.yrv (D)Z
      // 1b1: ifeq 211
      // 1b4: goto 1bb
      // 1b7: invokestatic TabGui.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: aload 0
      // 1bc: dup
      // 1bd: getfield TabGui.v46 F
      // 1c0: aload 0
      // 1c1: getfield TabGui.v46 F
      // 1c4: aload 0
      // 1c5: getfield TabGui.l3c I
      // 1c8: i2f
      // 1c9: iload 3
      // 1ca: ifeq 203
      // 1cd: goto 1d4
      // 1d0: invokestatic TabGui.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: fcmpg
      // 1d5: ifge 1f6
      // 1d8: goto 1df
      // 1db: invokestatic TabGui.a (Loov;)Loov;
      // 1de: athrow
      // 1df: ldc 0.15
      // 1e1: nop
      // 1e2: aload 0
      // 1e3: getfield TabGui.l3c I
      // 1e6: i2f
      // 1e7: aload 0
      // 1e8: getfield TabGui.v46 F
      // 1eb: fsub
      // 1ec: invokestatic java/lang/Math.min (FF)F
      // 1ef: goto 206
      // 1f2: invokestatic TabGui.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: ldc -0.15
      // 1f8: nop
      // 1f9: aload 0
      // 1fa: getfield TabGui.l3c I
      // 1fd: i2f
      // 1fe: aload 0
      // 1ff: getfield TabGui.v46 F
      // 202: fsub
      // 203: invokestatic java/lang/Math.max (FF)F
      // 206: fadd
      // 207: putfield TabGui.v46 F
      // 20a: aload 0
      // 20b: getfield TabGui.tu_ Lnhs;
      // 20e: invokevirtual Timer.zay ()V
      // 211: aload 0
      // 212: invokevirtual TabGui.i1j ()V
      // 215: return
   }

   private void t1f() {
      long var1 = a ^ 71513771125345L;

      float var10000;
      float var10001;
      float var10002;
      float var10003;
      Color var10004;
      label17: {
         try {
            var10000 = this.pf6;
            var10001 = this.y91;
            var10002 = this.ww2;
            var10003 = this.v15;
            if (!ClientState.gki.isAllowedValue(a<"p">(2258, 4393602327177016502L ^ var1))) {
               var10004 = new Color(255, 255, 255, 200);
               break label17;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var10004 = new Color(0, 0, 0, 150);
      }

      mkt.rn3(var10000, var10001, var10002, var10003, var10004);
   }

   private void td2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic TabGui.a J
      // 003: ldc2_w 5847307541347
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield TabGui.pf6 F
      // 00c: fconst_1
      // 00d: fadd
      // 00e: fstore 4
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: aload 0
      // 014: getfield TabGui.y91 F
      // 017: fconst_1
      // 018: fadd
      // 019: fstore 5
      // 01b: invokestatic _aj.values ()[L_aj;
      // 01e: aload 0
      // 01f: getfield TabGui.re7 I
      // 022: aaload
      // 023: invokevirtual _aj.name ()Ljava/lang/String;
      // 026: astore 6
      // 028: istore 3
      // 029: fload 4
      // 02b: fload 5
      // 02d: getstatic jsr.dyb Lcyb;
      // 030: aload 6
      // 032: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 035: fconst_2
      // 036: fadd
      // 037: aload 0
      // 038: getfield TabGui.rvr F
      // 03b: fmul
      // 03c: fadd
      // 03d: fconst_1
      // 03e: fadd
      // 03f: ldc 1.5
      // 041: nop
      // 042: getstatic jsr.dyb Lcyb;
      // 045: aload 6
      // 047: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 04a: fconst_1
      // 04b: fsub
      // 04c: getstatic ClientState.qkk Lzwr;
      // 04f: pop
      // 050: getstatic ClientState.gki Lc_3;
      // 053: sipush 2258
      // 056: ldc2_w 4393668609028375988
      // 059: lload 1
      // 05a: lxor
      // 05b: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 064: ifne 078
      // 067: new java/awt/Color
      // 06a: dup
      // 06b: ldc -12417291
      // 06d: nop
      // 06e: invokespecial java/awt/Color.<init> (I)V
      // 071: goto 08a
      // 074: invokestatic TabGui.a (Loov;)Loov;
      // 077: athrow
      // 078: new java/awt/Color
      // 07b: dup
      // 07c: sipush 206
      // 07f: bipush 89
      // 081: sipush 255
      // 084: sipush 255
      // 087: invokespecial java/awt/Color.<init> (IIII)V
      // 08a: invokestatic mkt.rn3 (FFFFLjava/awt/Color;)V
      // 08d: fload 4
      // 08f: ldc 4.0
      // 091: nop
      // 092: fadd
      // 093: fstore 7
      // 095: fload 5
      // 097: fconst_1
      // 098: fsub
      // 099: fstore 8
      // 09b: invokestatic _aj.values ()[L_aj;
      // 09e: astore 9
      // 0a0: aload 9
      // 0a2: arraylength
      // 0a3: istore 10
      // 0a5: bipush 0
      // 0a6: istore 11
      // 0a8: iload 11
      // 0aa: iload 10
      // 0ac: if_icmpge 141
      // 0af: aload 9
      // 0b1: iload 11
      // 0b3: aaload
      // 0b4: astore 12
      // 0b6: aload 12
      // 0b8: getstatic _aj.il8 L_aj;
      // 0bb: iload 3
      // 0bc: ifne 19b
      // 0bf: if_acmpne 0cc
      // 0c2: goto 0c9
      // 0c5: invokestatic TabGui.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: goto 13a
      // 0cc: getstatic jsr.xjo Lcyb;
      // 0cf: aload 12
      // 0d1: invokevirtual _aj.name ()Ljava/lang/String;
      // 0d4: fload 7
      // 0d6: fload 8
      // 0d8: getstatic ClientState.qkk Lzwr;
      // 0db: pop
      // 0dc: getstatic ClientState.gki Lc_3;
      // 0df: sipush 2258
      // 0e2: ldc2_w 4393668609028375988
      // 0e5: lload 1
      // 0e6: lxor
      // 0e7: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: nop
      // 0ed: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 0f0: iload 3
      // 0f1: ifne 10b
      // 0f4: ifne 10e
      // 0f7: goto 0fe
      // 0fa: invokestatic TabGui.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: getstatic z7e.kks Lz7e;
      // 101: getfield z7e.k0y I
      // 104: goto 10b
      // 107: invokestatic TabGui.a (Loov;)Loov;
      // 10a: athrow
      // 10b: goto 124
      // 10e: new java/awt/Color
      // 111: dup
      // 112: sipush 185
      // 115: sipush 185
      // 118: sipush 185
      // 11b: sipush 255
      // 11e: invokespecial java/awt/Color.<init> (IIII)V
      // 121: invokevirtual java/awt/Color.getRGB ()I
      // 124: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 127: pop
      // 128: fload 8
      // 12a: getstatic jsr.dyb Lcyb;
      // 12d: aload 12
      // 12f: invokevirtual _aj.name ()Ljava/lang/String;
      // 132: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 135: fconst_2
      // 136: fadd
      // 137: fadd
      // 138: fstore 8
      // 13a: iinc 11 1
      // 13d: iload 3
      // 13e: ifeq 0a8
      // 141: fload 4
      // 143: fload 5
      // 145: getstatic jsr.dyb Lcyb;
      // 148: aload 6
      // 14a: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 14d: fconst_2
      // 14e: fadd
      // 14f: aload 0
      // 150: getfield TabGui.rvr F
      // 153: fconst_1
      // 154: fadd
      // 155: fmul
      // 156: fadd
      // 157: aload 0
      // 158: getfield TabGui.ww2 F
      // 15b: fconst_2
      // 15c: fsub
      // 15d: getstatic jsr.dyb Lcyb;
      // 160: aload 6
      // 162: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 165: fconst_2
      // 166: fadd
      // 167: invokestatic mkt.huv (FFFF)V
      // 16a: fload 5
      // 16c: fconst_1
      // 16d: fsub
      // 16e: fstore 8
      // 170: invokestatic _aj.values ()[L_aj;
      // 173: astore 9
      // 175: aload 9
      // 177: arraylength
      // 178: istore 10
      // 17a: bipush 0
      // 17b: istore 11
      // 17d: iload 11
      // 17f: iload 10
      // 181: if_icmpge 213
      // 184: aload 9
      // 186: iload 11
      // 188: aaload
      // 189: astore 12
      // 18b: iload 3
      // 18c: ifne 216
      // 18f: aload 12
      // 191: getstatic _aj.il8 L_aj;
      // 194: goto 19b
      // 197: invokestatic TabGui.a (Loov;)Loov;
      // 19a: athrow
      // 19b: if_acmpne 1a1
      // 19e: goto 20c
      // 1a1: getstatic jsr.xjo Lcyb;
      // 1a4: aload 12
      // 1a6: invokevirtual _aj.name ()Ljava/lang/String;
      // 1a9: fload 7
      // 1ab: fload 8
      // 1ad: getstatic ClientState.qkk Lzwr;
      // 1b0: pop
      // 1b1: getstatic ClientState.gki Lc_3;
      // 1b4: sipush 2258
      // 1b7: ldc2_w 4393668609028375988
      // 1ba: lload 1
      // 1bb: lxor
      // 1bc: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: nop
      // 1c2: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 1c5: iload 3
      // 1c6: ifne 1dd
      // 1c9: ifne 1e0
      // 1cc: goto 1d3
      // 1cf: invokestatic TabGui.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: ldc -10049281
      // 1d5: nop
      // 1d6: goto 1dd
      // 1d9: invokestatic TabGui.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: goto 1f6
      // 1e0: new java/awt/Color
      // 1e3: dup
      // 1e4: sipush 255
      // 1e7: sipush 255
      // 1ea: sipush 255
      // 1ed: sipush 255
      // 1f0: invokespecial java/awt/Color.<init> (IIII)V
      // 1f3: invokevirtual java/awt/Color.getRGB ()I
      // 1f6: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1f9: pop
      // 1fa: fload 8
      // 1fc: getstatic jsr.dyb Lcyb;
      // 1ff: aload 12
      // 201: invokevirtual _aj.name ()Ljava/lang/String;
      // 204: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 207: fconst_2
      // 208: fadd
      // 209: fadd
      // 20a: fstore 8
      // 20c: iinc 11 1
      // 20f: iload 3
      // 210: ifeq 17d
      // 213: invokestatic mkt.dkk ()V
      // 216: return
   }

   private void ljv() {
      long var1 = a ^ 88457076366371L;
      float var3 = this.wby(this.ita()) + 15.0F;
      float var4 = this.ifg(2.0F, this.ita()) + 2.0F;
      float var5 = this.pf6 + bol + this.ww2;
      float var6 = this.y91 + (jsr.dyb.wni(this.ita().name()) + 2.0F) * (float)this.re7;

      float var10000;
      float var10001;
      float var10002;
      float var10003;
      Color var10004;
      label17: {
         try {
            mkt.zxh(var5, var6 + var4, (float)((double)var3 * this.ian.ds7()), var4);
            var10000 = var5;
            var10001 = var6;
            var10002 = var3;
            var10003 = var4;
            if (!ClientState.gki.isAllowedValue(a<"p">(2258, 4393586277086577396L ^ var1))) {
               var10004 = new Color(255, 255, 255, 200);
               break label17;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var10004 = new Color(0, 0, 0, 150);
      }

      mkt.rn3(var10000, var10001, var10002, var10003, var10004);
   }

   private void fca() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic TabGui.a J
      // 003: ldc2_w 114995546161220
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield TabGui.pf6 F
      // 00c: fconst_1
      // 00d: fadd
      // 00e: aload 0
      // 00f: getfield TabGui.ww2 F
      // 012: fadd
      // 013: getstatic TabGui.bol F
      // 016: fadd
      // 017: fstore 4
      // 019: invokestatic OpaquePredicate.b ()I
      // 01c: aload 0
      // 01d: getfield TabGui.y91 F
      // 020: fconst_1
      // 021: fadd
      // 022: getstatic jsr.dyb Lcyb;
      // 025: aload 0
      // 026: invokespecial TabGui.ita ()L_aj;
      // 029: invokevirtual _aj.name ()Ljava/lang/String;
      // 02c: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 02f: fconst_2
      // 030: fadd
      // 031: aload 0
      // 032: getfield TabGui.re7 I
      // 035: i2f
      // 036: fmul
      // 037: fadd
      // 038: fstore 5
      // 03a: istore 3
      // 03b: getstatic ClientState.qkk Lzwr;
      // 03e: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 041: aload 0
      // 042: invokespecial TabGui.ita ()L_aj;
      // 045: invokevirtual ModuleRegistry.vc3 (L_aj;)Ljava/util/List;
      // 048: astore 6
      // 04a: aload 6
      // 04c: aload 0
      // 04d: getfield TabGui.l3c I
      // 050: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 055: checkcast Module
      // 058: astore 7
      // 05a: fload 4
      // 05c: fload 5
      // 05e: getstatic jsr.dyb Lcyb;
      // 061: aload 7
      // 063: invokevirtual Module.m2d ()Ljava/lang/String;
      // 066: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 069: fconst_2
      // 06a: fadd
      // 06b: aload 0
      // 06c: getfield TabGui.v46 F
      // 06f: fmul
      // 070: fadd
      // 071: fconst_1
      // 072: fadd
      // 073: ldc 1.5
      // 075: nop
      // 076: getstatic jsr.dyb Lcyb;
      // 079: aload 7
      // 07b: invokevirtual Module.m2d ()Ljava/lang/String;
      // 07e: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 081: fconst_1
      // 082: fsub
      // 083: getstatic ClientState.qkk Lzwr;
      // 086: pop
      // 087: getstatic ClientState.gki Lc_3;
      // 08a: sipush 21862
      // 08d: ldc2_w 8360463387432174370
      // 090: lload 1
      // 091: lxor
      // 092: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 09b: ifne 0af
      // 09e: new java/awt/Color
      // 0a1: dup
      // 0a2: ldc -12417291
      // 0a4: nop
      // 0a5: invokespecial java/awt/Color.<init> (I)V
      // 0a8: goto 0c1
      // 0ab: invokestatic TabGui.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: new java/awt/Color
      // 0b2: dup
      // 0b3: sipush 206
      // 0b6: bipush 89
      // 0b8: sipush 255
      // 0bb: sipush 255
      // 0be: invokespecial java/awt/Color.<init> (IIII)V
      // 0c1: invokestatic mkt.rn3 (FFFFLjava/awt/Color;)V
      // 0c4: fload 4
      // 0c6: ldc 4.0
      // 0c8: nop
      // 0c9: fadd
      // 0ca: fstore 8
      // 0cc: fload 5
      // 0ce: fconst_1
      // 0cf: fsub
      // 0d0: fstore 9
      // 0d2: aload 6
      // 0d4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d9: astore 10
      // 0db: aload 10
      // 0dd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e2: ifeq 1c6
      // 0e5: aload 10
      // 0e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ec: checkcast Module
      // 0ef: astore 11
      // 0f1: getstatic jsr.xjo Lcyb;
      // 0f4: aload 11
      // 0f6: invokevirtual Module.m2d ()Ljava/lang/String;
      // 0f9: fload 8
      // 0fb: fload 9
      // 0fd: aload 11
      // 0ff: invokevirtual Module.klu ()Z
      // 102: iload 3
      // 103: ifeq 178
      // 106: ifeq 160
      // 109: goto 110
      // 10c: invokestatic TabGui.a (Loov;)Loov;
      // 10f: athrow
      // 110: getstatic ClientState.qkk Lzwr;
      // 113: pop
      // 114: getstatic ClientState.gki Lc_3;
      // 117: sipush 2258
      // 11a: ldc2_w 4393577637091843731
      // 11d: lload 1
      // 11e: lxor
      // 11f: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: nop
      // 125: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 128: iload 3
      // 129: ifeq 15d
      // 12c: goto 133
      // 12f: invokestatic TabGui.a (Loov;)Loov;
      // 132: athrow
      // 133: ifne 147
      // 136: goto 13d
      // 139: invokestatic TabGui.a (Loov;)Loov;
      // 13c: athrow
      // 13d: ldc -12417291
      // 13f: nop
      // 140: goto 1ac
      // 143: invokestatic TabGui.a (Loov;)Loov;
      // 146: athrow
      // 147: new java/awt/Color
      // 14a: dup
      // 14b: sipush 255
      // 14e: sipush 255
      // 151: sipush 255
      // 154: sipush 255
      // 157: invokespecial java/awt/Color.<init> (IIII)V
      // 15a: invokevirtual java/awt/Color.getRGB ()I
      // 15d: goto 1ac
      // 160: getstatic ClientState.qkk Lzwr;
      // 163: pop
      // 164: getstatic ClientState.gki Lc_3;
      // 167: sipush 2258
      // 16a: ldc2_w 4393577637091843731
      // 16d: lload 1
      // 16e: lxor
      // 16f: invokedynamic p (IJ)Ljava/lang/String; bsm=TabGui.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: nop
      // 175: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 178: iload 3
      // 179: ifeq 193
      // 17c: ifne 196
      // 17f: goto 186
      // 182: invokestatic TabGui.a (Loov;)Loov;
      // 185: athrow
      // 186: getstatic z7e.kks Lz7e;
      // 189: getfield z7e.k0y I
      // 18c: goto 193
      // 18f: invokestatic TabGui.a (Loov;)Loov;
      // 192: athrow
      // 193: goto 1ac
      // 196: new java/awt/Color
      // 199: dup
      // 19a: sipush 185
      // 19d: sipush 185
      // 1a0: sipush 185
      // 1a3: sipush 255
      // 1a6: invokespecial java/awt/Color.<init> (IIII)V
      // 1a9: invokevirtual java/awt/Color.getRGB ()I
      // 1ac: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1af: pop
      // 1b0: fload 9
      // 1b2: getstatic jsr.dyb Lcyb;
      // 1b5: aload 11
      // 1b7: invokevirtual Module.m2d ()Ljava/lang/String;
      // 1ba: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 1bd: fconst_2
      // 1be: fadd
      // 1bf: fadd
      // 1c0: fstore 9
      // 1c2: iload 3
      // 1c3: ifne 0db
      // 1c6: return
   }

   public void i1j() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: sipush 208
      // 07: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 0a: iload 1
      // 0b: ifeq 2c
      // 0e: ifne 26
      // 11: goto 18
      // 14: invokestatic TabGui.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield TabGui.jkn Lnhs;
      // 1c: invokevirtual Timer.zay ()V
      // 1f: goto 26
      // 22: invokestatic TabGui.a (Loov;)Loov;
      // 25: athrow
      // 26: sipush 200
      // 29: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 2c: iload 1
      // 2d: ifeq 52
      // 30: ifne 48
      // 33: goto 3a
      // 36: invokestatic TabGui.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield TabGui.d8i Lnhs;
      // 3e: invokevirtual Timer.zay ()V
      // 41: goto 48
      // 44: invokestatic TabGui.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield TabGui.jkn Lnhs;
      // 4c: ldc2_w 500.0
      // 4f: invokevirtual Timer.yrv (D)Z
      // 52: iload 1
      // 53: ifeq 8d
      // 56: ifeq 78
      // 59: goto 60
      // 5c: invokestatic TabGui.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: sipush 208
      // 64: invokevirtual TabGui.pjs (I)V
      // 67: aload 0
      // 68: getfield TabGui.jkn Lnhs;
      // 6b: ldc2_w 410
      // 6e: invokevirtual Timer.jzn (J)V
      // 71: goto 78
      // 74: invokestatic TabGui.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: getfield TabGui.d8i Lnhs;
      // 7c: iload 1
      // 7d: ifeq a2
      // 80: ldc2_w 500.0
      // 83: invokevirtual Timer.yrv (D)Z
      // 86: goto 8d
      // 89: invokestatic TabGui.a (Loov;)Loov;
      // 8c: athrow
      // 8d: ifeq a8
      // 90: aload 0
      // 91: sipush 200
      // 94: invokevirtual TabGui.pjs (I)V
      // 97: aload 0
      // 98: getfield TabGui.d8i Lnhs;
      // 9b: goto a2
      // 9e: invokestatic TabGui.a (Loov;)Loov;
      // a1: athrow
      // a2: ldc2_w 410
      // a5: invokevirtual Timer.jzn (J)V
      // a8: return
   }

   public void pjs(int param1) {
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
      // 005: getfield TabGui.wnv Lysh;
      // 008: getstatic ysh.k21 Lysh;
      // 00b: iload 2
      // 00c: ifne 0c2
      // 00f: if_acmpne 0bb
      // 012: goto 019
      // 015: invokestatic TabGui.a (Loov;)Loov;
      // 018: athrow
      // 019: iload 1
      // 01a: sipush 208
      // 01d: iload 2
      // 01e: ifne 066
      // 021: goto 028
      // 024: invokestatic TabGui.a (Loov;)Loov;
      // 027: athrow
      // 028: if_icmpne 062
      // 02b: goto 032
      // 02e: invokestatic TabGui.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: getfield TabGui.re7 I
      // 036: invokestatic _aj.values ()[L_aj;
      // 039: arraylength
      // 03a: bipush 2
      // 03b: isub
      // 03c: iload 2
      // 03d: ifne 066
      // 040: goto 047
      // 043: invokestatic TabGui.a (Loov;)Loov;
      // 046: athrow
      // 047: if_icmpge 062
      // 04a: goto 051
      // 04d: invokestatic TabGui.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: dup
      // 053: getfield TabGui.re7 I
      // 056: bipush 1
      // 057: iadd
      // 058: putfield TabGui.re7 I
      // 05b: goto 062
      // 05e: invokestatic TabGui.a (Loov;)Loov;
      // 061: athrow
      // 062: iload 1
      // 063: sipush 200
      // 066: iload 2
      // 067: ifne 0a2
      // 06a: if_icmpne 09e
      // 06d: goto 074
      // 070: invokestatic TabGui.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: getfield TabGui.re7 I
      // 078: iload 2
      // 079: ifne 09f
      // 07c: goto 083
      // 07f: invokestatic TabGui.a (Loov;)Loov;
      // 082: athrow
      // 083: ifle 09e
      // 086: goto 08d
      // 089: invokestatic TabGui.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: dup
      // 08f: getfield TabGui.re7 I
      // 092: bipush 1
      // 093: isub
      // 094: putfield TabGui.re7 I
      // 097: goto 09e
      // 09a: invokestatic TabGui.a (Loov;)Loov;
      // 09d: athrow
      // 09e: iload 1
      // 09f: sipush 205
      // 0a2: if_icmpne 0bb
      // 0a5: aload 0
      // 0a6: getstatic ysh.rqt Lysh;
      // 0a9: putfield TabGui.wnv Lysh;
      // 0ac: aload 0
      // 0ad: bipush 0
      // 0ae: putfield TabGui.l3c I
      // 0b1: aload 0
      // 0b2: fconst_0
      // 0b3: putfield TabGui.v46 F
      // 0b6: return
      // 0b7: invokestatic TabGui.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: getfield TabGui.wnv Lysh;
      // 0bf: getstatic ysh.rqt Lysh;
      // 0c2: if_acmpne 190
      // 0c5: iload 1
      // 0c6: sipush 208
      // 0c9: iload 2
      // 0ca: ifne 120
      // 0cd: goto 0d4
      // 0d0: invokestatic TabGui.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: if_icmpne 11c
      // 0d7: goto 0de
      // 0da: invokestatic TabGui.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield TabGui.l3c I
      // 0e2: getstatic ClientState.qkk Lzwr;
      // 0e5: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 0e8: aload 0
      // 0e9: invokespecial TabGui.ita ()L_aj;
      // 0ec: invokevirtual ModuleRegistry.vc3 (L_aj;)Ljava/util/List;
      // 0ef: invokeinterface java/util/List.size ()I 1
      // 0f4: bipush 1
      // 0f5: isub
      // 0f6: iload 2
      // 0f7: ifne 120
      // 0fa: goto 101
      // 0fd: invokestatic TabGui.a (Loov;)Loov;
      // 100: athrow
      // 101: if_icmpge 11c
      // 104: goto 10b
      // 107: invokestatic TabGui.a (Loov;)Loov;
      // 10a: athrow
      // 10b: aload 0
      // 10c: dup
      // 10d: getfield TabGui.l3c I
      // 110: bipush 1
      // 111: iadd
      // 112: putfield TabGui.l3c I
      // 115: goto 11c
      // 118: invokestatic TabGui.a (Loov;)Loov;
      // 11b: athrow
      // 11c: iload 1
      // 11d: sipush 200
      // 120: iload 2
      // 121: ifne 15c
      // 124: if_icmpne 158
      // 127: goto 12e
      // 12a: invokestatic TabGui.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield TabGui.l3c I
      // 132: iload 2
      // 133: ifne 159
      // 136: goto 13d
      // 139: invokestatic TabGui.a (Loov;)Loov;
      // 13c: athrow
      // 13d: ifle 158
      // 140: goto 147
      // 143: invokestatic TabGui.a (Loov;)Loov;
      // 146: athrow
      // 147: aload 0
      // 148: dup
      // 149: getfield TabGui.l3c I
      // 14c: bipush 1
      // 14d: isub
      // 14e: putfield TabGui.l3c I
      // 151: goto 158
      // 154: invokestatic TabGui.a (Loov;)Loov;
      // 157: athrow
      // 158: iload 1
      // 159: sipush 203
      // 15c: iload 2
      // 15d: ifne 17f
      // 160: if_icmpne 17b
      // 163: goto 16a
      // 166: invokestatic TabGui.a (Loov;)Loov;
      // 169: athrow
      // 16a: aload 0
      // 16b: getstatic ysh.k21 Lysh;
      // 16e: putfield TabGui.wnv Lysh;
      // 171: aload 0
      // 172: bipush 0
      // 173: putfield TabGui.l3c I
      // 176: return
      // 177: invokestatic TabGui.a (Loov;)Loov;
      // 17a: athrow
      // 17b: iload 1
      // 17c: sipush 205
      // 17f: if_icmpne 190
      // 182: aload 0
      // 183: invokespecial TabGui.vq5 ()Lar7;
      // 186: invokevirtual Module.toggle ()V
      // 189: goto 190
      // 18c: invokestatic TabGui.a (Loov;)Loov;
      // 18f: athrow
      // 190: return
   }

   private _aj ita() {
      return _aj.values()[this.re7];
   }

   private Module vq5() {
      return (Module)ClientState.qkk.getModuleRegistry().vc3(this.ita()).get(this.l3c);
   }

   private float wby(_aj var1) {
      float var3 = 0.0F;
      int var10000 = OpaquePredicate.b();
      Iterator var4 = ClientState.qkk.getModuleRegistry().vc3(var1).iterator();
      int var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            Module var5 = (Module)var4.next();
            var6 = Math.max(var3, jsr.dyb.ax2(var5.m2d()));
            if (var2 == 0) {
               break;
            }

            var3 = var6;
            if (var2 != 0) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   private float ifg(float var1, _aj var2) {
      float var4 = 0.0F;
      int var10000 = OpaquePredicate.c();
      Iterator var5 = ClientState.qkk.getModuleRegistry().vc3(var2).iterator();
      int var3 = var10000;

      while (true) {
         if (var5.hasNext()) {
            Module var6 = (Module)var5.next();
            var7 = var4 + jsr.dyb.wni(var6.m2d()) + var1;
            if (var3 != 0) {
               break;
            }

            var4 = var7;
            if (var3 == 0) {
               continue;
            }
         }

         var7 = var4;
         break;
      }

      return var7;
   }

   private float dcn() {
      float var1 = 0.0F;

      for (_aj var5 : _aj.values()) {
         var1 = Math.max(var1, jsr.dyb.ax2(var5.name()));
      }

      return var1;
   }

   private float bnv(float var1) {
      float var2 = 0.0F;

      for (_aj var6 : _aj.values()) {
         if (var6 != _aj.il8) {
            var2 += jsr.dyb.wni(var6.name()) + var1;
         }
      }

      return var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6970865789171476704L, -1565612284610790221L, MethodHandles.lookup().lookupClass()).a(36631730846752L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 103063277106667L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "û\\Í¸\u001b|\u0019ú©¡\u0084\u0003\u0085Öæ\u0097 ¤ì\u001eá\u0099R1X:ã\u0018Tn\u0086ø\u0096¡\u0080À,^'äB*_êñgjÌ¿\u0010x=QBV\u0015\u008fh[\u001e\u0012\nj\u0013\u0089õ\u0010¢àLs%\u001dâ{\tHQ½¨\u0088Ì¬";
      int var8 = "û\\Í¸\u001b|\u0019ú©¡\u0084\u0003\u0085Öæ\u0097 ¤ì\u001eá\u0099R1X:ã\u0018Tn\u0086ø\u0096¡\u0080À,^'äB*_êñgjÌ¿\u0010x=QBV\u0015\u008fh[\u001e\u0012\nj\u0013\u0089õ\u0010¢àLs%\u001dâ{\tHQ½¨\u0088Ì¬"
         .length();
      char var5 = 16;
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
                     c = new String[6];
                     bol = 2.0F;
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

                  var6 = "¦®Ö\u0081PàM\bzJ¡\u008aëuuxxs\f9J'k'\u0012ÈYÍ:Ø¤\u0019\u0010\u001f\u000b±qé3\u0088,÷)%\u0004Lÿ9÷";
                  var8 = "¦®Ö\u0081PàM\bzJ¡\u008aëuuxxs\f9J'k'\u0012ÈYÍ:Ø¤\u0019\u0010\u001f\u000b±qé3\u0088,÷)%\u0004Lÿ9÷".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21021;
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
            throw new RuntimeException("TabGui", var10);
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
         throw new RuntimeException("TabGui" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
