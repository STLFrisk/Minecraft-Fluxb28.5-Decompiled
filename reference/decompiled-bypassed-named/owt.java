import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.util.FontUtils;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class owt implements lv1 {
   public int rr7;
   public Random l0s;
   public int[] fgp;
   public moh _yy;
   public gdz goz;
   public float nww;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public owt(moh param1, gdz param2, lc5 param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: aload 0
      // 005: sipush 256
      // 008: newarray 10
      // 00a: putfield owt.qqs [I
      // 00d: invokestatic OpaquePredicate.c ()I
      // 010: aload 0
      // 011: bipush 9
      // 013: putfield owt.rr7 I
      // 016: aload 0
      // 017: new java/util/Random
      // 01a: dup
      // 01b: invokespecial java/util/Random.<init> ()V
      // 01e: putfield owt.l0s Ljava/util/Random;
      // 021: aload 0
      // 022: ldc 65536
      // 024: nop
      // 025: newarray 8
      // 027: putfield owt.vfx [B
      // 02a: aload 0
      // 02b: bipush 32
      // 02d: newarray 10
      // 02f: putfield owt.fgp [I
      // 032: aload 0
      // 033: fconst_1
      // 034: putfield owt.nww F
      // 037: aload 0
      // 038: sipush 256
      // 03b: newarray 6
      // 03d: putfield owt.ncz [F
      // 040: aload 0
      // 041: bipush 0
      // 042: putfield owt.ksn Z
      // 045: aload 0
      // 046: new net/optifine/render/GlBlendState
      // 049: dup
      // 04a: invokespecial net/optifine/render/GlBlendState.<init> ()V
      // 04d: putfield owt.px_ Lnet/optifine/render/GlBlendState;
      // 050: aload 0
      // 051: aload 1
      // 052: putfield owt._yy Lmoh;
      // 055: aload 0
      // 056: aload 2
      // 057: putfield owt.goz Lgdz;
      // 05a: aload 0
      // 05b: aload 2
      // 05c: putfield owt.re2 Lgdz;
      // 05f: istore 5
      // 061: aload 0
      // 062: aload 3
      // 063: putfield owt.rwm Llc5;
      // 066: aload 0
      // 067: iload 4
      // 069: putfield owt.g6s Z
      // 06c: aload 0
      // 06d: aload 0
      // 06e: getfield owt.goz Lgdz;
      // 071: invokestatic net/optifine/util/FontUtils.getHdFontLocation (Lgdz;)Lgdz;
      // 074: putfield owt.re2 Lgdz;
      // 077: aload 0
      // 078: aload 0
      // 079: getfield owt.re2 Lgdz;
      // 07c: invokevirtual owt.getMethod (Lgdz;)V
      // 07f: bipush 0
      // 080: istore 6
      // 082: iload 6
      // 084: bipush 32
      // 086: if_icmpge 18d
      // 089: iload 6
      // 08b: bipush 3
      // 08c: ishr
      // 08d: bipush 1
      // 08e: iand
      // 08f: bipush 85
      // 091: imul
      // 092: istore 7
      // 094: iload 6
      // 096: bipush 2
      // 097: ishr
      // 098: bipush 1
      // 099: iand
      // 09a: sipush 170
      // 09d: imul
      // 09e: iload 7
      // 0a0: iadd
      // 0a1: istore 8
      // 0a3: iload 6
      // 0a5: bipush 1
      // 0a6: ishr
      // 0a7: bipush 1
      // 0a8: iand
      // 0a9: sipush 170
      // 0ac: imul
      // 0ad: iload 7
      // 0af: iadd
      // 0b0: istore 9
      // 0b2: iload 6
      // 0b4: bipush 0
      // 0b5: ishr
      // 0b6: bipush 1
      // 0b7: iand
      // 0b8: sipush 170
      // 0bb: imul
      // 0bc: iload 7
      // 0be: iadd
      // 0bf: istore 10
      // 0c1: iload 5
      // 0c3: ifne 191
      // 0c6: iload 6
      // 0c8: iload 5
      // 0ca: ifne 0ee
      // 0cd: goto 0d4
      // 0d0: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: bipush 6
      // 0d6: if_icmpne 0ea
      // 0d9: goto 0e0
      // 0dc: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: iinc 8 85
      // 0e3: goto 0ea
      // 0e6: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: aload 1
      // 0eb: getfield moh.rdb Z
      // 0ee: iload 5
      // 0f0: ifne 141
      // 0f3: ifeq 13f
      // 0f6: goto 0fd
      // 0f9: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: iload 8
      // 0ff: bipush 30
      // 101: imul
      // 102: iload 9
      // 104: bipush 59
      // 106: imul
      // 107: iadd
      // 108: iload 10
      // 10a: bipush 11
      // 10c: imul
      // 10d: iadd
      // 10e: bipush 100
      // 110: idiv
      // 111: istore 11
      // 113: iload 8
      // 115: bipush 30
      // 117: imul
      // 118: iload 9
      // 11a: bipush 70
      // 11c: imul
      // 11d: iadd
      // 11e: bipush 100
      // 120: idiv
      // 121: istore 12
      // 123: iload 8
      // 125: bipush 30
      // 127: imul
      // 128: iload 10
      // 12a: bipush 70
      // 12c: imul
      // 12d: iadd
      // 12e: bipush 100
      // 130: idiv
      // 131: istore 13
      // 133: iload 11
      // 135: istore 8
      // 137: iload 12
      // 139: istore 9
      // 13b: iload 13
      // 13d: istore 10
      // 13f: iload 6
      // 141: bipush 16
      // 143: iload 5
      // 145: ifne 161
      // 148: if_icmplt 164
      // 14b: goto 152
      // 14e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: iload 8
      // 154: bipush 4
      // 155: idiv
      // 156: istore 8
      // 158: iload 9
      // 15a: bipush 4
      // 15b: idiv
      // 15c: istore 9
      // 15e: iload 10
      // 160: bipush 4
      // 161: idiv
      // 162: istore 10
      // 164: aload 0
      // 165: getfield owt.fgp [I
      // 168: iload 6
      // 16a: iload 8
      // 16c: sipush 255
      // 16f: iand
      // 170: bipush 16
      // 172: ishl
      // 173: iload 9
      // 175: sipush 255
      // 178: iand
      // 179: bipush 8
      // 17b: ishl
      // 17c: ior
      // 17d: iload 10
      // 17f: sipush 255
      // 182: iand
      // 183: ior
      // 184: iastore
      // 185: iinc 6 1
      // 188: iload 5
      // 18a: ifeq 082
      // 18d: aload 0
      // 18e: invokespecial owt.b7c ()V
      // 191: return
   }

   @Override
   public void onResourceManagerReload(y99 var1) {
      this.re2 = FontUtils.getHdFontLocation(this.goz);
      int var10000 = OpaquePredicate.c();
      int var3 = 0;
      int var2 = var10000;

      while (true) {
         if (var3 < j80.length) {
            try {
               j80[var3] = null;
               var3++;
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            } catch (RuntimeException var4) {
               throw a(var4);
            }
         }

         this._jf();
         this.b7c();
         break;
      }
   }

   private void _jf() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic owt.a J
      // 003: ldc2_w 41744908392315
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: aload 0
      // 00e: getfield owt.re2 Lgdz;
      // 011: invokevirtual owt.dbp (Lgdz;)Ljava/io/InputStream;
      // 014: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 017: astore 4
      // 019: goto 028
      // 01c: astore 5
      // 01e: new java/lang/RuntimeException
      // 021: dup
      // 022: aload 5
      // 024: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/Throwable;)V
      // 027: athrow
      // 028: aload 0
      // 029: getfield owt.re2 Lgdz;
      // 02c: invokestatic net/optifine/util/FontUtils.readFontProperties (Lgdz;)Ljava/util/Properties;
      // 02f: astore 5
      // 031: aload 0
      // 032: aload 5
      // 034: sipush 15380
      // 037: ldc2_w 3435343403255421514
      // 03a: lload 1
      // 03b: lxor
      // 03c: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: nop
      // 042: bipush 0
      // 043: invokestatic net/optifine/util/FontUtils.readBoolean (Ljava/util/Properties;Ljava/lang/String;Z)Z
      // 046: putfield owt.ksn Z
      // 049: aload 4
      // 04b: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 04e: istore 6
      // 050: aload 4
      // 052: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 055: istore 7
      // 057: iload 6
      // 059: bipush 16
      // 05b: idiv
      // 05c: istore 8
      // 05e: iload 7
      // 060: bipush 16
      // 062: idiv
      // 063: istore 9
      // 065: iload 6
      // 067: i2f
      // 068: ldc 128.0
      // 06a: nop
      // 06b: fdiv
      // 06c: fstore 10
      // 06e: fload 10
      // 070: fconst_1
      // 071: fconst_2
      // 072: invokestatic hxt.zkb (FFF)F
      // 075: fstore 11
      // 077: aload 0
      // 078: fconst_1
      // 079: fload 11
      // 07b: fdiv
      // 07c: putfield owt.nww F
      // 07f: aload 5
      // 081: sipush 30109
      // 084: ldc2_w 3267456928407098306
      // 087: lload 1
      // 088: lxor
      // 089: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: nop
      // 08f: ldc -1.0
      // 091: nop
      // 092: invokestatic net/optifine/util/FontUtils.readFloat (Ljava/util/Properties;Ljava/lang/String;F)F
      // 095: fstore 12
      // 097: fload 12
      // 099: fconst_0
      // 09a: fcmpl
      // 09b: iload 3
      // 09c: ifne 0bb
      // 09f: iflt 0b6
      // 0a2: goto 0a9
      // 0a5: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: fload 12
      // 0ac: putfield owt.nww F
      // 0af: goto 0b6
      // 0b2: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: iload 6
      // 0b8: iload 7
      // 0ba: imul
      // 0bb: newarray 10
      // 0bd: astore 13
      // 0bf: aload 4
      // 0c1: bipush 0
      // 0c2: bipush 0
      // 0c3: iload 6
      // 0c5: iload 7
      // 0c7: aload 13
      // 0c9: bipush 0
      // 0ca: iload 6
      // 0cc: invokevirtual java/awt/image/BufferedImage.getRGB (IIII[III)[I
      // 0cf: pop
      // 0d0: bipush 0
      // 0d1: istore 14
      // 0d3: iload 14
      // 0d5: sipush 256
      // 0d8: if_icmpge 1dc
      // 0db: iload 14
      // 0dd: bipush 16
      // 0df: irem
      // 0e0: istore 15
      // 0e2: iload 14
      // 0e4: bipush 16
      // 0e6: idiv
      // 0e7: istore 16
      // 0e9: bipush 0
      // 0ea: istore 17
      // 0ec: iload 8
      // 0ee: bipush 1
      // 0ef: isub
      // 0f0: iload 3
      // 0f1: ifne 1e6
      // 0f4: istore 17
      // 0f6: iload 17
      // 0f8: iflt 17e
      // 0fb: iload 15
      // 0fd: iload 8
      // 0ff: imul
      // 100: iload 17
      // 102: iadd
      // 103: istore 18
      // 105: bipush 1
      // 106: istore 19
      // 108: bipush 0
      // 109: iload 3
      // 10a: ifne 180
      // 10d: istore 20
      // 10f: iload 20
      // 111: iload 9
      // 113: if_icmpge 16f
      // 116: iload 19
      // 118: iload 3
      // 119: ifne 171
      // 11c: iload 3
      // 11d: ifne 171
      // 120: goto 127
      // 123: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: ifeq 16f
      // 12a: goto 131
      // 12d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: iload 16
      // 133: iload 9
      // 135: imul
      // 136: iload 20
      // 138: iadd
      // 139: iload 6
      // 13b: imul
      // 13c: istore 21
      // 13e: aload 13
      // 140: iload 18
      // 142: iload 21
      // 144: iadd
      // 145: iaload
      // 146: istore 22
      // 148: iload 22
      // 14a: bipush 24
      // 14c: ishr
      // 14d: sipush 255
      // 150: iand
      // 151: istore 23
      // 153: iload 3
      // 154: ifne 16b
      // 157: iload 23
      // 159: bipush 16
      // 15b: if_icmple 168
      // 15e: goto 165
      // 161: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: bipush 0
      // 166: istore 19
      // 168: iinc 20 1
      // 16b: iload 3
      // 16c: ifeq 10f
      // 16f: iload 19
      // 171: ifne 177
      // 174: goto 17e
      // 177: iinc 17 -1
      // 17a: iload 3
      // 17b: ifeq 0f6
      // 17e: iload 14
      // 180: bipush 32
      // 182: iload 3
      // 183: ifne 1a6
      // 186: if_icmpne 1c4
      // 189: goto 190
      // 18c: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18f: athrow
      // 190: iload 8
      // 192: iload 3
      // 193: ifne 1c2
      // 196: goto 19d
      // 199: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: bipush 8
      // 19f: goto 1a6
      // 1a2: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: if_icmpgt 1b4
      // 1a9: fconst_2
      // 1aa: fload 10
      // 1ac: fmul
      // 1ad: f2i
      // 1ae: istore 17
      // 1b0: iload 3
      // 1b1: ifeq 1c4
      // 1b4: ldc 1.5
      // 1b6: nop
      // 1b7: fload 10
      // 1b9: fmul
      // 1ba: f2i
      // 1bb: goto 1c2
      // 1be: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c1: athrow
      // 1c2: istore 17
      // 1c4: aload 0
      // 1c5: getfield owt.ncz [F
      // 1c8: iload 14
      // 1ca: iload 17
      // 1cc: bipush 1
      // 1cd: iadd
      // 1ce: i2f
      // 1cf: fload 10
      // 1d1: fdiv
      // 1d2: fconst_1
      // 1d3: fadd
      // 1d4: fastore
      // 1d5: iinc 14 1
      // 1d8: iload 3
      // 1d9: ifeq 0d3
      // 1dc: aload 5
      // 1de: aload 0
      // 1df: getfield owt.ncz [F
      // 1e2: invokestatic net/optifine/util/FontUtils.readCustomCharWidths (Ljava/util/Properties;[F)V
      // 1e5: bipush 0
      // 1e6: istore 14
      // 1e8: iload 14
      // 1ea: aload 0
      // 1eb: getfield owt.qqs [I
      // 1ee: arraylength
      // 1ef: if_icmpge 20a
      // 1f2: aload 0
      // 1f3: getfield owt.qqs [I
      // 1f6: iload 14
      // 1f8: aload 0
      // 1f9: getfield owt.ncz [F
      // 1fc: iload 14
      // 1fe: faload
      // 1ff: invokestatic java/lang/Math.round (F)I
      // 202: iastore
      // 203: iinc 14 1
      // 206: iload 3
      // 207: ifeq 1e8
      // 20a: return
   }

   private void b7c() {
      long var1 = a ^ 8276666870599L;
      InputStream var3 = null;

      try {
         var3 = this.dbp(new gdz(a<"r">(23993, 3191287049260222428L ^ var1)));
         var3.read(this.vfx);
      } catch (IOException var8) {
         throw new RuntimeException(var8);
      } finally {
         IOUtils.closeQuietly(var3);
      }
   }

   private float gs4(char param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic owt.a J
      // 03: ldc2_w 86708381639505
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: iload 1
      // 0e: iload 5
      // 10: ifne 9e
      // 13: bipush 32
      // 15: if_icmpeq 8e
      // 18: goto 1f
      // 1b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: iload 1
      // 20: iload 5
      // 22: ifne 9e
      // 25: goto 2c
      // 28: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: sipush 160
      // 2f: if_icmpeq 8e
      // 32: goto 39
      // 35: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: sipush 19497
      // 3c: ldc2_w 4377490769997192798
      // 3f: lload 3
      // 40: lxor
      // 41: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: iload 1
      // 48: invokevirtual java/lang/String.indexOf (I)I
      // 4b: istore 6
      // 4d: iload 6
      // 4f: iload 5
      // 51: ifne 76
      // 54: bipush -1
      // 55: if_icmpeq 87
      // 58: goto 5f
      // 5b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 0
      // 60: iload 5
      // 62: ifne 88
      // 65: goto 6c
      // 68: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: getfield owt.g6s Z
      // 6f: goto 76
      // 72: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 75: athrow
      // 76: ifne 87
      // 79: aload 0
      // 7a: iload 6
      // 7c: iload 2
      // 7d: invokespecial owt.hbp (IZ)F
      // 80: goto 8d
      // 83: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: aload 0
      // 88: iload 1
      // 89: iload 2
      // 8a: invokespecial owt.ixh (CZ)F
      // 8d: freturn
      // 8e: aload 0
      // 8f: iload 5
      // 91: ifne a2
      // 94: getfield owt.g6s Z
      // 97: goto 9e
      // 9a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: ifne aa
      // a1: aload 0
      // a2: getfield owt.ncz [F
      // a5: iload 1
      // a6: faload
      // a7: goto ad
      // aa: ldc 4.0
      // ac: nop
      // ad: freturn
   }

   private float hbp(int var1, boolean var2) {
      int var4 = var1 % 16 * 8;
      int var10000 = OpaquePredicate.c();
      int var5 = var1 / 16 * 8;
      int var3 = var10000;

      label22: {
         label21: {
            try {
               var10 = var2;
               if (var3 != 0) {
                  break label22;
               }

               if (var2 != 0) {
                  break label21;
               }
            } catch (RuntimeException var9) {
               throw a(var9);
            }

            var10 = 0;
            break label22;
         }

         var10 = 1;
      }

      byte var6 = var10;
      this.getMethod(this.re2);
      float var7 = this.ncz[var1];
      float var8 = 7.99F;
      GL11.glBegin(5);
      GL11.glTexCoord2f((float)var4 / 128.0F, (float)var5 / 128.0F);
      GL11.glVertex3f(this.vey + (float)var6, this.ras, 0.0F);
      GL11.glTexCoord2f((float)var4 / 128.0F, ((float)var5 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.vey - (float)var6, this.ras + 7.99F, 0.0F);
      GL11.glTexCoord2f(((float)var4 + var8 - 1.0F) / 128.0F, (float)var5 / 128.0F);
      GL11.glVertex3f(this.vey + var8 - 1.0F + (float)var6, this.ras, 0.0F);
      GL11.glTexCoord2f(((float)var4 + var8 - 1.0F) / 128.0F, ((float)var5 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.vey + var8 - 1.0F - (float)var6, this.ras + 7.99F, 0.0F);
      GL11.glEnd();
      return var7;
   }

   private gdz qzi(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic owt.a J
      // 03: ldc2_w 68008953051732
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: getstatic owt.j80 [Lgdz;
      // 10: iload 1
      // 11: aaload
      // 12: iload 4
      // 14: ifeq 62
      // 17: ifnonnull 5d
      // 1a: goto 21
      // 1d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: getstatic owt.j80 [Lgdz;
      // 24: iload 1
      // 25: new gdz
      // 28: dup
      // 29: sipush 3832
      // 2c: ldc2_w 4146630358575908236
      // 2f: lload 2
      // 30: lxor
      // 31: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: nop
      // 37: bipush 1
      // 38: anewarray 32
      // 3b: dup
      // 3c: bipush 0
      // 3d: iload 1
      // 3e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 41: aastore
      // 42: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 45: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 48: aastore
      // 49: getstatic owt.j80 [Lgdz;
      // 4c: iload 1
      // 4d: getstatic owt.j80 [Lgdz;
      // 50: iload 1
      // 51: aaload
      // 52: invokestatic net/optifine/util/FontUtils.getHdFontLocation (Lgdz;)Lgdz;
      // 55: aastore
      // 56: goto 5d
      // 59: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: getstatic owt.j80 [Lgdz;
      // 60: iload 1
      // 61: aaload
      // 62: areturn
   }

   private void wlh(int var1) {
      this.getMethod(this.qzi(var1));
   }

   private float ixh(char param1, boolean param2) {
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
      // 005: getfield owt.vfx [B
      // 008: iload 1
      // 009: baload
      // 00a: iload 3
      // 00b: ifeq 023
      // 00e: ifne 01e
      // 011: goto 018
      // 014: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: fconst_0
      // 019: freturn
      // 01a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: iload 1
      // 01f: sipush 256
      // 022: idiv
      // 023: istore 4
      // 025: aload 0
      // 026: iload 4
      // 028: invokespecial owt.wlh (I)V
      // 02b: aload 0
      // 02c: getfield owt.vfx [B
      // 02f: iload 1
      // 030: baload
      // 031: bipush 4
      // 032: iushr
      // 033: istore 5
      // 035: aload 0
      // 036: getfield owt.vfx [B
      // 039: iload 1
      // 03a: baload
      // 03b: bipush 15
      // 03d: iand
      // 03e: istore 6
      // 040: iload 5
      // 042: i2f
      // 043: fstore 7
      // 045: iload 6
      // 047: bipush 1
      // 048: iadd
      // 049: i2f
      // 04a: fstore 8
      // 04c: iload 1
      // 04d: bipush 16
      // 04f: irem
      // 050: bipush 16
      // 052: imul
      // 053: i2f
      // 054: fload 7
      // 056: fadd
      // 057: fstore 9
      // 059: iload 1
      // 05a: sipush 255
      // 05d: iand
      // 05e: bipush 16
      // 060: idiv
      // 061: bipush 16
      // 063: imul
      // 064: i2f
      // 065: fstore 10
      // 067: fload 8
      // 069: fload 7
      // 06b: fsub
      // 06c: ldc 0.02
      // 06e: nop
      // 06f: fsub
      // 070: fstore 11
      // 072: iload 2
      // 073: ifeq 07e
      // 076: fconst_1
      // 077: goto 07f
      // 07a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: fconst_0
      // 07f: fstore 12
      // 081: bipush 5
      // 082: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 085: fload 9
      // 087: ldc 256.0
      // 089: nop
      // 08a: fdiv
      // 08b: fload 10
      // 08d: ldc 256.0
      // 08f: nop
      // 090: fdiv
      // 091: invokestatic org/lwjgl/opengl/GL11.glTexCoord2f (FF)V
      // 094: aload 0
      // 095: getfield owt.vey F
      // 098: fload 12
      // 09a: fadd
      // 09b: aload 0
      // 09c: getfield owt.ras F
      // 09f: fconst_0
      // 0a0: invokestatic org/lwjgl/opengl/GL11.glVertex3f (FFF)V
      // 0a3: fload 9
      // 0a5: ldc 256.0
      // 0a7: nop
      // 0a8: fdiv
      // 0a9: fload 10
      // 0ab: ldc 15.98
      // 0ad: nop
      // 0ae: fadd
      // 0af: ldc 256.0
      // 0b1: nop
      // 0b2: fdiv
      // 0b3: invokestatic org/lwjgl/opengl/GL11.glTexCoord2f (FF)V
      // 0b6: aload 0
      // 0b7: getfield owt.vey F
      // 0ba: fload 12
      // 0bc: fsub
      // 0bd: aload 0
      // 0be: getfield owt.ras F
      // 0c1: ldc 7.99
      // 0c3: nop
      // 0c4: fadd
      // 0c5: fconst_0
      // 0c6: invokestatic org/lwjgl/opengl/GL11.glVertex3f (FFF)V
      // 0c9: fload 9
      // 0cb: fload 11
      // 0cd: fadd
      // 0ce: ldc 256.0
      // 0d0: nop
      // 0d1: fdiv
      // 0d2: fload 10
      // 0d4: ldc 256.0
      // 0d6: nop
      // 0d7: fdiv
      // 0d8: invokestatic org/lwjgl/opengl/GL11.glTexCoord2f (FF)V
      // 0db: aload 0
      // 0dc: getfield owt.vey F
      // 0df: fload 11
      // 0e1: fconst_2
      // 0e2: fdiv
      // 0e3: fadd
      // 0e4: fload 12
      // 0e6: fadd
      // 0e7: aload 0
      // 0e8: getfield owt.ras F
      // 0eb: fconst_0
      // 0ec: invokestatic org/lwjgl/opengl/GL11.glVertex3f (FFF)V
      // 0ef: fload 9
      // 0f1: fload 11
      // 0f3: fadd
      // 0f4: ldc 256.0
      // 0f6: nop
      // 0f7: fdiv
      // 0f8: fload 10
      // 0fa: ldc 15.98
      // 0fc: nop
      // 0fd: fadd
      // 0fe: ldc 256.0
      // 100: nop
      // 101: fdiv
      // 102: invokestatic org/lwjgl/opengl/GL11.glTexCoord2f (FF)V
      // 105: aload 0
      // 106: getfield owt.vey F
      // 109: fload 11
      // 10b: fconst_2
      // 10c: fdiv
      // 10d: fadd
      // 10e: fload 12
      // 110: fsub
      // 111: aload 0
      // 112: getfield owt.ras F
      // 115: ldc 7.99
      // 117: nop
      // 118: fadd
      // 119: fconst_0
      // 11a: invokestatic org/lwjgl/opengl/GL11.glVertex3f (FFF)V
      // 11d: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 120: fload 8
      // 122: fload 7
      // 124: fsub
      // 125: fconst_2
      // 126: fdiv
      // 127: fconst_1
      // 128: fadd
      // 129: freturn
   }

   public int km1(String var1, float var2, float var3, int var4) {
      return this.fai(var1, var2, var3, var4, true);
   }

   public int pjf(String var1, float var2, float var3, int var4) {
      this.fai(var1, var2 + 0.5F, var3 + 0.5F, z7e.ret.k0y, false);
      return this.fai(var1, var2, var3, var4, false);
   }

   public int og2(String var1, float var2, float var3, int var4) {
      return this.fai(var1, var2 - (float)(this.ezt(var1) / 2), var3, var4, true);
   }

   public int eh6(String var1, float var2, float var3, int var4) {
      return this.fai(var1, var2, var3, var4, false);
   }

   public int fai(String param1, float param2, float param3, int param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: aload 0
      // 06: invokevirtual owt.c8a ()V
      // 09: aload 0
      // 0a: getfield owt.ksn Z
      // 0d: iload 6
      // 0f: ifne 3c
      // 12: ifeq 36
      // 15: goto 1c
      // 18: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield owt.px_ Lnet/optifine/render/GlBlendState;
      // 20: invokestatic hzu.s4c (Lnet/optifine/render/GlBlendState;)V
      // 23: invokestatic hzu.spd ()V
      // 26: sipush 770
      // 29: sipush 771
      // 2c: invokestatic hzu.ru7 (II)V
      // 2f: goto 36
      // 32: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: invokespecial owt.vq4 ()V
      // 3a: iload 5
      // 3c: iload 6
      // 3e: ifne 82
      // 41: ifeq 71
      // 44: goto 4b
      // 47: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 1
      // 4d: fload 2
      // 4e: fconst_1
      // 4f: fadd
      // 50: fload 3
      // 51: fconst_1
      // 52: fadd
      // 53: iload 4
      // 55: bipush 1
      // 56: invokespecial owt.nms (Ljava/lang/String;FFIZ)I
      // 59: istore 7
      // 5b: iload 7
      // 5d: aload 0
      // 5e: aload 1
      // 5f: fload 2
      // 60: fload 3
      // 61: iload 4
      // 63: bipush 0
      // 64: invokespecial owt.nms (Ljava/lang/String;FFIZ)I
      // 67: invokestatic java/lang/Math.max (II)I
      // 6a: istore 7
      // 6c: iload 6
      // 6e: ifeq 84
      // 71: aload 0
      // 72: aload 1
      // 73: fload 2
      // 74: fload 3
      // 75: iload 4
      // 77: bipush 0
      // 78: invokespecial owt.nms (Ljava/lang/String;FFIZ)I
      // 7b: goto 82
      // 7e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: istore 7
      // 84: aload 0
      // 85: getfield owt.ksn Z
      // 88: iload 6
      // 8a: ifne a7
      // 8d: ifeq a5
      // 90: goto 97
      // 93: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96: athrow
      // 97: aload 0
      // 98: getfield owt.px_ Lnet/optifine/render/GlBlendState;
      // 9b: invokestatic hzu._wk (Lnet/optifine/render/GlBlendState;)V
      // 9e: goto a5
      // a1: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: iload 7
      // a7: ireturn
   }

   private String f1m(String var1) {
      try {
         Bidi var2 = new Bidi(new ArabicShaping(8).shape(var1), 127);
         var2.setReorderingMode(0);
         return var2.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return var1;
      }
   }

   private void vq4() {
      this.ofz = false;
      this._zc = false;
      this.ire = false;
      this.hoq = false;
      this.oj_ = false;
   }

   private void ln9(String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic owt.a J
      // 003: ldc2_w 101124098223509
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: bipush 0
      // 00e: istore 6
      // 010: iload 6
      // 012: aload 1
      // 013: invokevirtual java/lang/String.length ()I
      // 016: if_icmpge 4a7
      // 019: aload 1
      // 01a: iload 6
      // 01c: invokevirtual java/lang/String.charAt (I)C
      // 01f: istore 7
      // 021: iload 7
      // 023: iload 5
      // 025: ifeq 285
      // 028: sipush 167
      // 02b: if_icmpne 26b
      // 02e: goto 035
      // 031: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: iload 6
      // 037: bipush 1
      // 038: iadd
      // 039: iload 5
      // 03b: ifeq 285
      // 03e: goto 045
      // 041: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: aload 1
      // 046: invokevirtual java/lang/String.length ()I
      // 049: if_icmpge 26b
      // 04c: goto 053
      // 04f: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: sipush 15794
      // 056: ldc2_w 410461981377175812
      // 059: lload 3
      // 05a: lxor
      // 05b: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: aload 1
      // 062: getstatic java/util/Locale.ENGLISH Ljava/util/Locale;
      // 065: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 068: iload 6
      // 06a: bipush 1
      // 06b: iadd
      // 06c: invokevirtual java/lang/String.charAt (I)C
      // 06f: invokevirtual java/lang/String.indexOf (I)I
      // 072: istore 8
      // 074: iload 8
      // 076: bipush 16
      // 078: iload 5
      // 07a: ifeq 155
      // 07d: if_icmpge 14a
      // 080: goto 087
      // 083: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 0
      // 088: bipush 0
      // 089: putfield owt.ofz Z
      // 08c: aload 0
      // 08d: bipush 0
      // 08e: putfield owt._zc Z
      // 091: aload 0
      // 092: bipush 0
      // 093: putfield owt.oj_ Z
      // 096: aload 0
      // 097: bipush 0
      // 098: putfield owt.hoq Z
      // 09b: aload 0
      // 09c: bipush 0
      // 09d: putfield owt.ire Z
      // 0a0: iload 8
      // 0a2: iload 5
      // 0a4: ifeq 0db
      // 0a7: goto 0ae
      // 0aa: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: iflt 0d2
      // 0b1: goto 0b8
      // 0b4: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: iload 8
      // 0ba: iload 5
      // 0bc: ifeq 0de
      // 0bf: goto 0c6
      // 0c2: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: bipush 15
      // 0c8: if_icmple 0dd
      // 0cb: goto 0d2
      // 0ce: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: bipush 15
      // 0d4: goto 0db
      // 0d7: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: istore 8
      // 0dd: iload 2
      // 0de: iload 5
      // 0e0: ifeq 0f7
      // 0e3: ifeq 0f0
      // 0e6: goto 0ed
      // 0e9: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ec: athrow
      // 0ed: iinc 8 16
      // 0f0: aload 0
      // 0f1: getfield owt.fgp [I
      // 0f4: iload 8
      // 0f6: iaload
      // 0f7: istore 9
      // 0f9: iload 5
      // 0fb: ifeq 145
      // 0fe: invokestatic hxt.xe2 ()Z
      // 101: ifeq 114
      // 104: goto 10b
      // 107: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: iload 8
      // 10d: iload 9
      // 10f: invokestatic net/optifine/CustomColors.getTextColor (II)I
      // 112: istore 9
      // 114: aload 0
      // 115: iload 9
      // 117: putfield owt.vt4 I
      // 11a: aload 0
      // 11b: iload 9
      // 11d: bipush 16
      // 11f: ishr
      // 120: i2f
      // 121: ldc 255.0
      // 123: nop
      // 124: fdiv
      // 125: iload 9
      // 127: bipush 8
      // 129: ishr
      // 12a: sipush 255
      // 12d: iand
      // 12e: i2f
      // 12f: ldc 255.0
      // 131: nop
      // 132: fdiv
      // 133: iload 9
      // 135: sipush 255
      // 138: iand
      // 139: i2f
      // 13a: ldc 255.0
      // 13c: nop
      // 13d: fdiv
      // 13e: aload 0
      // 13f: getfield owt.u9z F
      // 142: invokevirtual owt.e9m (FFFF)V
      // 145: iload 5
      // 147: ifne 263
      // 14a: iload 8
      // 14c: bipush 16
      // 14e: goto 155
      // 151: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 154: athrow
      // 155: iload 5
      // 157: ifeq 180
      // 15a: if_icmpne 175
      // 15d: goto 164
      // 160: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 0
      // 165: bipush 1
      // 166: putfield owt.ofz Z
      // 169: iload 5
      // 16b: ifne 263
      // 16e: goto 175
      // 171: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: iload 8
      // 177: bipush 17
      // 179: goto 180
      // 17c: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: iload 5
      // 182: ifeq 1ab
      // 185: if_icmpne 1a0
      // 188: goto 18f
      // 18b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18e: athrow
      // 18f: aload 0
      // 190: bipush 1
      // 191: putfield owt._zc Z
      // 194: iload 5
      // 196: ifne 263
      // 199: goto 1a0
      // 19c: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: iload 8
      // 1a2: bipush 18
      // 1a4: goto 1ab
      // 1a7: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1aa: athrow
      // 1ab: iload 5
      // 1ad: ifeq 1d6
      // 1b0: if_icmpne 1cb
      // 1b3: goto 1ba
      // 1b6: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: aload 0
      // 1bb: bipush 1
      // 1bc: putfield owt.oj_ Z
      // 1bf: iload 5
      // 1c1: ifne 263
      // 1c4: goto 1cb
      // 1c7: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ca: athrow
      // 1cb: iload 8
      // 1cd: bipush 19
      // 1cf: goto 1d6
      // 1d2: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d5: athrow
      // 1d6: iload 5
      // 1d8: ifeq 201
      // 1db: if_icmpne 1f6
      // 1de: goto 1e5
      // 1e1: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: bipush 1
      // 1e7: putfield owt.hoq Z
      // 1ea: iload 5
      // 1ec: ifne 263
      // 1ef: goto 1f6
      // 1f2: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: iload 8
      // 1f8: bipush 20
      // 1fa: goto 201
      // 1fd: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 200: athrow
      // 201: iload 5
      // 203: ifeq 22c
      // 206: if_icmpne 221
      // 209: goto 210
      // 20c: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20f: athrow
      // 210: aload 0
      // 211: bipush 1
      // 212: putfield owt.ire Z
      // 215: iload 5
      // 217: ifne 263
      // 21a: goto 221
      // 21d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 220: athrow
      // 221: iload 8
      // 223: bipush 21
      // 225: goto 22c
      // 228: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22b: athrow
      // 22c: if_icmpne 263
      // 22f: aload 0
      // 230: bipush 0
      // 231: putfield owt.ofz Z
      // 234: aload 0
      // 235: bipush 0
      // 236: putfield owt._zc Z
      // 239: aload 0
      // 23a: bipush 0
      // 23b: putfield owt.oj_ Z
      // 23e: aload 0
      // 23f: bipush 0
      // 240: putfield owt.hoq Z
      // 243: aload 0
      // 244: bipush 0
      // 245: putfield owt.ire Z
      // 248: aload 0
      // 249: aload 0
      // 24a: getfield owt.j99 F
      // 24d: aload 0
      // 24e: getfield owt.ply F
      // 251: aload 0
      // 252: getfield owt.wy4 F
      // 255: aload 0
      // 256: getfield owt.u9z F
      // 259: invokevirtual owt.e9m (FFFF)V
      // 25c: goto 263
      // 25f: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 262: athrow
      // 263: iinc 6 1
      // 266: iload 5
      // 268: ifne 49f
      // 26b: sipush 19497
      // 26e: ldc2_w 4377478552782721178
      // 271: lload 3
      // 272: lxor
      // 273: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: nop
      // 279: iload 7
      // 27b: invokevirtual java/lang/String.indexOf (I)I
      // 27e: goto 285
      // 281: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 284: athrow
      // 285: istore 8
      // 287: aload 0
      // 288: getfield owt.ofz Z
      // 28b: iload 5
      // 28d: ifeq 302
      // 290: ifeq 300
      // 293: goto 29a
      // 296: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 299: athrow
      // 29a: iload 8
      // 29c: bipush -1
      // 29d: iload 5
      // 29f: ifeq 30f
      // 2a2: goto 2a9
      // 2a5: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a8: athrow
      // 2a9: if_icmpeq 300
      // 2ac: goto 2b3
      // 2af: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b2: athrow
      // 2b3: aload 0
      // 2b4: iload 7
      // 2b6: invokevirtual owt.egc (C)I
      // 2b9: istore 9
      // 2bb: aload 0
      // 2bc: getfield owt.l0s Ljava/util/Random;
      // 2bf: sipush 19497
      // 2c2: ldc2_w 4377478552782721178
      // 2c5: lload 3
      // 2c6: lxor
      // 2c7: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: nop
      // 2cd: invokevirtual java/lang/String.length ()I
      // 2d0: invokevirtual java/util/Random.nextInt (I)I
      // 2d3: istore 8
      // 2d5: sipush 19497
      // 2d8: ldc2_w 4377478552782721178
      // 2db: lload 3
      // 2dc: lxor
      // 2dd: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: nop
      // 2e3: iload 8
      // 2e5: invokevirtual java/lang/String.charAt (I)C
      // 2e8: istore 10
      // 2ea: iload 9
      // 2ec: aload 0
      // 2ed: iload 10
      // 2ef: invokevirtual owt.egc (C)I
      // 2f2: if_icmpne 2bb
      // 2f5: goto 2fc
      // 2f8: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fb: athrow
      // 2fc: iload 10
      // 2fe: istore 7
      // 300: iload 8
      // 302: iload 5
      // 304: ifeq 329
      // 307: bipush -1
      // 308: goto 30f
      // 30b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30e: athrow
      // 30f: if_icmpeq 333
      // 312: aload 0
      // 313: iload 5
      // 315: ifeq 32d
      // 318: goto 31f
      // 31b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31e: athrow
      // 31f: getfield owt.g6s Z
      // 322: goto 329
      // 325: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 328: athrow
      // 329: ifne 333
      // 32c: aload 0
      // 32d: getfield owt.nww F
      // 330: goto 336
      // 333: ldc 0.5
      // 335: nop
      // 336: fstore 9
      // 338: iload 7
      // 33a: iload 5
      // 33c: ifeq 37d
      // 33f: ifeq 37c
      // 342: goto 349
      // 345: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 348: athrow
      // 349: iload 8
      // 34b: iload 5
      // 34d: ifeq 37d
      // 350: goto 357
      // 353: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 356: athrow
      // 357: bipush -1
      // 358: if_icmpeq 37c
      // 35b: goto 362
      // 35e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 361: athrow
      // 362: aload 0
      // 363: getfield owt.g6s Z
      // 366: iload 5
      // 368: ifeq 37d
      // 36b: goto 372
      // 36e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 371: athrow
      // 372: ifeq 390
      // 375: goto 37c
      // 378: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37b: athrow
      // 37c: iload 2
      // 37d: iload 5
      // 37f: ifeq 38d
      // 382: ifeq 390
      // 385: goto 38c
      // 388: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38b: athrow
      // 38c: bipush 1
      // 38d: goto 391
      // 390: bipush 0
      // 391: istore 10
      // 393: iload 5
      // 395: ifeq 3b6
      // 398: iload 10
      // 39a: ifeq 3c1
      // 39d: goto 3a4
      // 3a0: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: aload 0
      // 3a5: dup
      // 3a6: getfield owt.vey F
      // 3a9: fload 9
      // 3ab: fsub
      // 3ac: putfield owt.vey F
      // 3af: goto 3b6
      // 3b2: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b5: athrow
      // 3b6: aload 0
      // 3b7: dup
      // 3b8: getfield owt.ras F
      // 3bb: fload 9
      // 3bd: fsub
      // 3be: putfield owt.ras F
      // 3c1: aload 0
      // 3c2: iload 7
      // 3c4: aload 0
      // 3c5: getfield owt.ire Z
      // 3c8: invokespecial owt.gs4 (CZ)F
      // 3cb: fstore 11
      // 3cd: iload 10
      // 3cf: iload 5
      // 3d1: ifeq 40b
      // 3d4: ifeq 3fb
      // 3d7: goto 3de
      // 3da: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3dd: athrow
      // 3de: aload 0
      // 3df: dup
      // 3e0: getfield owt.vey F
      // 3e3: fload 9
      // 3e5: fadd
      // 3e6: putfield owt.vey F
      // 3e9: aload 0
      // 3ea: dup
      // 3eb: getfield owt.ras F
      // 3ee: fload 9
      // 3f0: fadd
      // 3f1: putfield owt.ras F
      // 3f4: goto 3fb
      // 3f7: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fa: athrow
      // 3fb: aload 0
      // 3fc: iload 5
      // 3fe: ifeq 49a
      // 401: getfield owt._zc Z
      // 404: goto 40b
      // 407: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40a: athrow
      // 40b: ifeq 499
      // 40e: aload 0
      // 40f: dup
      // 410: getfield owt.vey F
      // 413: fload 9
      // 415: fadd
      // 416: putfield owt.vey F
      // 419: iload 10
      // 41b: iload 5
      // 41d: ifeq 472
      // 420: goto 427
      // 423: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 426: athrow
      // 427: ifeq 44e
      // 42a: goto 431
      // 42d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 430: athrow
      // 431: aload 0
      // 432: dup
      // 433: getfield owt.vey F
      // 436: fload 9
      // 438: fsub
      // 439: putfield owt.vey F
      // 43c: aload 0
      // 43d: dup
      // 43e: getfield owt.ras F
      // 441: fload 9
      // 443: fsub
      // 444: putfield owt.ras F
      // 447: goto 44e
      // 44a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44d: athrow
      // 44e: aload 0
      // 44f: iload 7
      // 451: aload 0
      // 452: getfield owt.ire Z
      // 455: invokespecial owt.gs4 (CZ)F
      // 458: iload 5
      // 45a: ifeq 497
      // 45d: pop
      // 45e: aload 0
      // 45f: dup
      // 460: getfield owt.vey F
      // 463: fload 9
      // 465: fsub
      // 466: putfield owt.vey F
      // 469: iload 10
      // 46b: goto 472
      // 46e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 471: athrow
      // 472: ifeq 492
      // 475: aload 0
      // 476: dup
      // 477: getfield owt.vey F
      // 47a: fload 9
      // 47c: fadd
      // 47d: putfield owt.vey F
      // 480: aload 0
      // 481: dup
      // 482: getfield owt.ras F
      // 485: fload 9
      // 487: fadd
      // 488: putfield owt.ras F
      // 48b: goto 492
      // 48e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 491: athrow
      // 492: fload 11
      // 494: fload 9
      // 496: fadd
      // 497: fstore 11
      // 499: aload 0
      // 49a: fload 11
      // 49c: invokevirtual owt.i9d (F)V
      // 49f: iinc 6 1
      // 4a2: iload 5
      // 4a4: ifne 010
      // 4a7: return
   }

   public void i9d(float var1) {
      int var2 = OpaquePredicate.c();

      owt var11;
      label63: {
         label55: {
            label54: {
               try {
                  var10000 = this.oj_;
                  if (var2 != 0) {
                     break label55;
                  }

                  if (!this.oj_) {
                     break label54;
                  }
               } catch (RuntimeException var8) {
                  throw a(var8);
               }

               jom var3 = jom.yut();
               q3g var4 = var3.zuq();
               hzu.m_1();
               var4.ezr(7, gnl.gx3);
               var4.g5o((double)this.vey, (double)(this.ras + (float)(this.rr7 / 2)), 0.0).pzw();
               var4.g5o((double)(this.vey + var1), (double)(this.ras + (float)(this.rr7 / 2)), 0.0).pzw();
               var4.g5o((double)(this.vey + var1), (double)(this.ras + (float)(this.rr7 / 2) - 1.0F), 0.0).pzw();
               var4.g5o((double)this.vey, (double)(this.ras + (float)(this.rr7 / 2) - 1.0F), 0.0).pzw();
               var3.q7g();
               hzu.rqj();
            }

            try {
               var11 = this;
               if (var2 != 0) {
                  break label63;
               }

               var10000 = this.hoq;
            } catch (RuntimeException var7) {
               throw a(var7);
            }
         }

         if (var10000) {
            jom var9 = jom.yut();
            q3g var10 = var9.zuq();

            label40: {
               label39: {
                  try {
                     hzu.m_1();
                     var10.ezr(7, gnl.gx3);
                     var12 = this.hoq;
                     if (var2 != 0) {
                        break label40;
                     }

                     if (this.hoq) {
                        break label39;
                     }
                  } catch (RuntimeException var6) {
                     throw a(var6);
                  }

                  var12 = 0;
                  break label40;
               }

               var12 = -1;
            }

            byte var5 = var12;
            var10.g5o((double)(this.vey + (float)var5), (double)(this.ras + (float)this.rr7), 0.0).pzw();
            var10.g5o((double)(this.vey + var1), (double)(this.ras + (float)this.rr7), 0.0).pzw();
            var10.g5o((double)(this.vey + var1), (double)(this.ras + (float)this.rr7 - 1.0F), 0.0).pzw();
            var10.g5o((double)(this.vey + (float)var5), (double)(this.ras + (float)this.rr7 - 1.0F), 0.0).pzw();
            var9.q7g();
            hzu.rqj();
         }

         var11 = this;
      }

      var11.vey += var1;
   }

   private int zm7(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = OpaquePredicate.b();

      try {
         if (var7 == 0) {
            return this.iy8;
         }

         if (!this.iy8) {
            return this.nms(var1, (float)var2, (float)var3, var5, var6);
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      int var8 = this.ezt(this.f1m(var1));
      var2 = var2 + var4 - var8;
      return this.nms(var1, (float)var2, (float)var3, var5, var6);
   }

   private int nms(String var1, float var2, float var3, int var4, boolean var5) {
      int var6 = OpaquePredicate.b();

      try {
         if (var1 == null) {
            return 0;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      int var10000;
      label60: {
         label59: {
            try {
               var10000 = this.iy8;
               if (var6 == 0) {
                  break label60;
               }

               if (!this.iy8) {
                  break label59;
               }
            } catch (RuntimeException var10) {
               throw a(var10);
            }

            var1 = this.f1m(var1);
         }

         var10000 = var4 & -67108864;
      }

      label51: {
         label50: {
            try {
               if (var6 == 0) {
                  break label51;
               }

               if (var10000 != 0) {
                  break label50;
               }
            } catch (RuntimeException var9) {
               throw a(var9);
            }

            var4 |= -16777216;
         }

         var10000 = var5;
      }

      label41: {
         try {
            if (var6 == 0) {
               return var10000;
            }

            if (var10000 == 0) {
               break label41;
            }
         } catch (RuntimeException var8) {
            throw a(var8);
         }

         var4 = (var4 & 16579836) >> 2 | var4 & 0xFF000000;
      }

      this.j99 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      this.ply = (float)(var4 >> 8 & 0xFF) / 255.0F;
      this.wy4 = (float)(var4 & 0xFF) / 255.0F;
      this.u9z = (float)(var4 >> 24 & 0xFF) / 255.0F;
      this.e9m(this.j99, this.ply, this.wy4, this.u9z);
      this.vey = var2;
      this.ras = var3;
      this.ln9(var1, (boolean)var5);
      return (int)this.vey;
   }

   public int ezt(String param1) {
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
      // 005: ifnonnull 00e
      // 008: bipush 0
      // 009: ireturn
      // 00a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 00d: athrow
      // 00e: fconst_0
      // 00f: fstore 3
      // 010: bipush 0
      // 011: istore 4
      // 013: bipush 0
      // 014: istore 5
      // 016: iload 5
      // 018: aload 1
      // 019: invokevirtual java/lang/String.length ()I
      // 01c: if_icmpge 149
      // 01f: aload 1
      // 020: iload 5
      // 022: invokevirtual java/lang/String.charAt (I)C
      // 025: istore 6
      // 027: aload 0
      // 028: iload 6
      // 02a: invokespecial owt.bc1 (C)F
      // 02d: fstore 7
      // 02f: fload 7
      // 031: fconst_0
      // 032: fcmpg
      // 033: iload 2
      // 034: ifne 14d
      // 037: iload 2
      // 038: ifne 0fe
      // 03b: goto 042
      // 03e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: ifge 0ec
      // 045: goto 04c
      // 048: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: iload 5
      // 04e: iload 2
      // 04f: ifne 0fe
      // 052: goto 059
      // 055: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: aload 1
      // 05a: invokevirtual java/lang/String.length ()I
      // 05d: bipush 1
      // 05e: isub
      // 05f: if_icmpge 0ec
      // 062: goto 069
      // 065: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 068: athrow
      // 069: iinc 5 1
      // 06c: aload 1
      // 06d: iload 5
      // 06f: invokevirtual java/lang/String.charAt (I)C
      // 072: istore 6
      // 074: iload 6
      // 076: iload 2
      // 077: ifne 0e7
      // 07a: bipush 108
      // 07c: if_icmpeq 0df
      // 07f: goto 086
      // 082: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: iload 6
      // 088: iload 2
      // 089: ifne 0e7
      // 08c: goto 093
      // 08f: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: bipush 76
      // 095: if_icmpeq 0df
      // 098: goto 09f
      // 09b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: iload 6
      // 0a1: iload 2
      // 0a2: ifne 0d9
      // 0a5: goto 0ac
      // 0a8: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: bipush 114
      // 0ae: if_icmpeq 0d1
      // 0b1: goto 0b8
      // 0b4: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b7: athrow
      // 0b8: iload 6
      // 0ba: iload 2
      // 0bb: ifne 0d9
      // 0be: goto 0c5
      // 0c1: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: bipush 82
      // 0c7: if_icmpne 0e9
      // 0ca: goto 0d1
      // 0cd: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: bipush 0
      // 0d2: goto 0d9
      // 0d5: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: istore 4
      // 0db: iload 2
      // 0dc: ifeq 0e9
      // 0df: bipush 1
      // 0e0: goto 0e7
      // 0e3: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: istore 4
      // 0e9: fconst_0
      // 0ea: fstore 7
      // 0ec: fload 3
      // 0ed: fload 7
      // 0ef: fadd
      // 0f0: fstore 3
      // 0f1: iload 2
      // 0f2: ifne 145
      // 0f5: iload 4
      // 0f7: goto 0fe
      // 0fa: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: ifeq 142
      // 101: fload 7
      // 103: iload 2
      // 104: ifne 122
      // 107: goto 10e
      // 10a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: fconst_0
      // 10f: fcmpl
      // 110: ifle 142
      // 113: goto 11a
      // 116: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: fload 3
      // 11b: goto 122
      // 11e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: aload 0
      // 123: iload 2
      // 124: ifne 13d
      // 127: getfield owt.g6s Z
      // 12a: ifeq 13c
      // 12d: goto 134
      // 130: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: fconst_1
      // 135: goto 140
      // 138: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: aload 0
      // 13d: getfield owt.nww F
      // 140: fadd
      // 141: fstore 3
      // 142: iinc 5 1
      // 145: iload 2
      // 146: ifeq 016
      // 149: fload 3
      // 14a: invokestatic java/lang/Math.round (F)I
      // 14d: ireturn
   }

   public int egc(char var1) {
      return Math.round(this.bc1(var1));
   }

   private float bc1(char param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic owt.a J
      // 003: ldc2_w 103341983879328
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: iload 1
      // 00e: sipush 167
      // 011: iload 4
      // 013: ifeq 02b
      // 016: if_icmpne 028
      // 019: goto 020
      // 01c: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: ldc -1.0
      // 022: nop
      // 023: freturn
      // 024: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: iload 1
      // 029: bipush 32
      // 02b: iload 4
      // 02d: ifeq 051
      // 030: if_icmpeq 119
      // 033: goto 03a
      // 036: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: iload 1
      // 03b: iload 4
      // 03d: ifeq 06d
      // 040: goto 047
      // 043: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: sipush 160
      // 04a: goto 051
      // 04d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: if_icmpeq 119
      // 054: sipush 23425
      // 057: ldc2_w 8750140603266660870
      // 05a: lload 2
      // 05b: lxor
      // 05c: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: iload 1
      // 063: invokevirtual java/lang/String.indexOf (I)I
      // 066: goto 06d
      // 069: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: istore 5
      // 06f: iload 1
      // 070: iload 4
      // 072: ifeq 0c4
      // 075: ifle 0be
      // 078: goto 07f
      // 07b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: iload 5
      // 081: iload 4
      // 083: ifeq 0c4
      // 086: goto 08d
      // 089: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: bipush -1
      // 08e: if_icmpeq 0be
      // 091: goto 098
      // 094: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: aload 0
      // 099: getfield owt.g6s Z
      // 09c: iload 4
      // 09e: ifeq 0c4
      // 0a1: goto 0a8
      // 0a4: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: ifne 0be
      // 0ab: goto 0b2
      // 0ae: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield owt.ncz [F
      // 0b6: iload 5
      // 0b8: faload
      // 0b9: freturn
      // 0ba: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield owt.vfx [B
      // 0c2: iload 1
      // 0c3: baload
      // 0c4: iload 4
      // 0c6: ifeq 0e2
      // 0c9: ifeq 117
      // 0cc: goto 0d3
      // 0cf: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield owt.vfx [B
      // 0d7: iload 1
      // 0d8: baload
      // 0d9: bipush 4
      // 0da: iushr
      // 0db: goto 0e2
      // 0de: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: istore 6
      // 0e4: aload 0
      // 0e5: getfield owt.vfx [B
      // 0e8: iload 1
      // 0e9: baload
      // 0ea: bipush 15
      // 0ec: iand
      // 0ed: istore 7
      // 0ef: iload 7
      // 0f1: bipush 7
      // 0f3: iload 4
      // 0f5: ifeq 114
      // 0f8: if_icmple 109
      // 0fb: goto 102
      // 0fe: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: bipush 15
      // 104: istore 7
      // 106: bipush 0
      // 107: istore 6
      // 109: iinc 7 1
      // 10c: iload 7
      // 10e: iload 6
      // 110: isub
      // 111: bipush 2
      // 112: idiv
      // 113: bipush 1
      // 114: iadd
      // 115: i2f
      // 116: freturn
      // 117: fconst_0
      // 118: freturn
      // 119: aload 0
      // 11a: getfield owt.ncz [F
      // 11d: bipush 32
      // 11f: faload
      // 120: freturn
   }

   public String fl6(String var1, int var2) {
      return this.m8q(var1, var2, false);
   }

   public String m8q(String param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/lang/StringBuilder
      // 003: dup
      // 004: invokespecial java/lang/StringBuilder.<init> ()V
      // 007: astore 5
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: fconst_0
      // 00d: fstore 6
      // 00f: istore 4
      // 011: iload 3
      // 012: iload 4
      // 014: ifeq 02e
      // 017: ifeq 031
      // 01a: goto 021
      // 01d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: aload 1
      // 022: invokevirtual java/lang/String.length ()I
      // 025: bipush 1
      // 026: isub
      // 027: goto 02e
      // 02a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: goto 032
      // 031: bipush 0
      // 032: istore 7
      // 034: iload 3
      // 035: iload 4
      // 037: ifeq 045
      // 03a: ifeq 048
      // 03d: goto 044
      // 040: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: bipush -1
      // 045: goto 049
      // 048: bipush 1
      // 049: istore 8
      // 04b: bipush 0
      // 04c: istore 9
      // 04e: bipush 0
      // 04f: istore 10
      // 051: iload 7
      // 053: istore 11
      // 055: iload 11
      // 057: iflt 1bf
      // 05a: iload 11
      // 05c: iload 4
      // 05e: ifeq 07b
      // 061: aload 1
      // 062: invokevirtual java/lang/String.length ()I
      // 065: if_icmpge 1bf
      // 068: goto 06f
      // 06b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: fload 6
      // 071: iload 2
      // 072: i2f
      // 073: fcmpg
      // 074: goto 07b
      // 077: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: iload 4
      // 07d: ifeq 097
      // 080: ifge 1bf
      // 083: goto 08a
      // 086: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: aload 1
      // 08b: iload 11
      // 08d: invokevirtual java/lang/String.charAt (I)C
      // 090: goto 097
      // 093: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: istore 12
      // 099: aload 0
      // 09a: iload 12
      // 09c: invokespecial owt.bc1 (C)F
      // 09f: fstore 13
      // 0a1: iload 9
      // 0a3: iload 4
      // 0a5: ifeq 13f
      // 0a8: ifeq 134
      // 0ab: goto 0b2
      // 0ae: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: bipush 0
      // 0b3: istore 9
      // 0b5: iload 12
      // 0b7: iload 4
      // 0b9: ifeq 12d
      // 0bc: bipush 108
      // 0be: if_icmpeq 125
      // 0c1: goto 0c8
      // 0c4: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c7: athrow
      // 0c8: iload 12
      // 0ca: iload 4
      // 0cc: ifeq 12d
      // 0cf: goto 0d6
      // 0d2: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: bipush 76
      // 0d8: if_icmpeq 125
      // 0db: goto 0e2
      // 0de: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e1: athrow
      // 0e2: iload 12
      // 0e4: iload 4
      // 0e6: ifeq 11e
      // 0e9: goto 0f0
      // 0ec: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: bipush 114
      // 0f2: if_icmpeq 116
      // 0f5: goto 0fc
      // 0f8: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: iload 12
      // 0fe: iload 4
      // 100: ifeq 179
      // 103: goto 10a
      // 106: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: bipush 82
      // 10c: if_icmpne 174
      // 10f: goto 116
      // 112: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: bipush 0
      // 117: goto 11e
      // 11a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: istore 10
      // 120: iload 4
      // 122: ifne 174
      // 125: bipush 1
      // 126: goto 12d
      // 129: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: istore 10
      // 12f: iload 4
      // 131: ifne 174
      // 134: fload 13
      // 136: fconst_0
      // 137: fcmpg
      // 138: goto 13f
      // 13b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: iload 4
      // 141: ifeq 15f
      // 144: ifge 156
      // 147: goto 14e
      // 14a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: bipush 1
      // 14f: istore 9
      // 151: iload 4
      // 153: ifne 174
      // 156: fload 6
      // 158: fload 13
      // 15a: fadd
      // 15b: fstore 6
      // 15d: iload 10
      // 15f: iload 4
      // 161: ifeq 179
      // 164: ifeq 174
      // 167: goto 16e
      // 16a: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16d: athrow
      // 16e: fload 6
      // 170: fconst_1
      // 171: fadd
      // 172: fstore 6
      // 174: fload 6
      // 176: iload 2
      // 177: i2f
      // 178: fcmpl
      // 179: iload 4
      // 17b: ifeq 18c
      // 17e: ifle 18b
      // 181: goto 188
      // 184: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 187: athrow
      // 188: goto 1bf
      // 18b: iload 3
      // 18c: ifeq 1a4
      // 18f: aload 5
      // 191: bipush 0
      // 192: iload 12
      // 194: invokevirtual java/lang/StringBuilder.insert (IC)Ljava/lang/StringBuilder;
      // 197: pop
      // 198: iload 4
      // 19a: ifne 1b3
      // 19d: goto 1a4
      // 1a0: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: aload 5
      // 1a6: iload 12
      // 1a8: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1ab: pop
      // 1ac: goto 1b3
      // 1af: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: iload 11
      // 1b5: iload 8
      // 1b7: iadd
      // 1b8: istore 11
      // 1ba: iload 4
      // 1bc: ifne 055
      // 1bf: aload 5
      // 1c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c4: areturn
   }

   private String m5_(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnull 38
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 39
      // 0d: iload 2
      // 0e: ifne 39
      // 11: goto 18
      // 14: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: ldc "\n"
      // 1a: nop
      // 1b: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1e: ifeq 38
      // 21: goto 28
      // 24: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 1
      // 29: bipush 0
      // 2a: aload 1
      // 2b: invokevirtual java/lang/String.length ()I
      // 2e: bipush 1
      // 2f: isub
      // 30: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 33: astore 1
      // 34: iload 2
      // 35: ifeq 04
      // 38: aload 1
      // 39: areturn
   }

   public void bsn(String param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 6
      // 05: aload 0
      // 06: getfield owt.ksn Z
      // 09: iload 6
      // 0b: ifeq 5c
      // 0e: ifeq 32
      // 11: goto 18
      // 14: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 0
      // 19: getfield owt.px_ Lnet/optifine/render/GlBlendState;
      // 1c: invokestatic hzu.s4c (Lnet/optifine/render/GlBlendState;)V
      // 1f: invokestatic hzu.spd ()V
      // 22: sipush 770
      // 25: sipush 771
      // 28: invokestatic hzu.ru7 (II)V
      // 2b: goto 32
      // 2e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: invokespecial owt.vq4 ()V
      // 36: aload 0
      // 37: iload 5
      // 39: putfield owt.vt4 I
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokespecial owt.m5_ (Ljava/lang/String;)Ljava/lang/String;
      // 41: astore 1
      // 42: aload 0
      // 43: aload 1
      // 44: iload 2
      // 45: iload 3
      // 46: iload 4
      // 48: bipush 0
      // 49: invokespecial owt.bhe (Ljava/lang/String;IIIZ)V
      // 4c: aload 0
      // 4d: iload 6
      // 4f: ifeq 60
      // 52: getfield owt.ksn Z
      // 55: goto 5c
      // 58: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: ifeq 66
      // 5f: aload 0
      // 60: getfield owt.px_ Lnet/optifine/render/GlBlendState;
      // 63: invokestatic hzu._wk (Lnet/optifine/render/GlBlendState;)V
      // 66: return
   }

   private void bhe(String var1, int var2, int var3, int var4, boolean var5) {
      int var6 = OpaquePredicate.c();

      for (String var8 : this.g8u(var1, var4)) {
         this.zm7(var8, var2, var3, var4, this.vt4, var5);
         var3 += this.rr7;
         if (var6 != 0) {
            break;
         }
      }
   }

   public int jdm(String var1, int var2) {
      return this.rr7 * this.g8u(var1, var2).size();
   }

   public void so4(boolean var1) {
      this.g6s = var1;
   }

   public boolean dmx() {
      return this.g6s;
   }

   public void vyy(boolean var1) {
      this.iy8 = var1;
   }

   public List g8u(String var1, int var2) {
      return Arrays.asList(this.oca(var1, var2).split("\n"));
   }

   public String oca(String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual java/lang/String.length ()I
      // 08: iload 3
      // 09: ifeq 23
      // 0c: bipush 1
      // 0d: if_icmpgt 1d
      // 10: goto 17
      // 13: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 1
      // 18: areturn
      // 19: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 1
      // 1f: iload 2
      // 20: invokespecial owt.nmq (Ljava/lang/String;I)I
      // 23: istore 4
      // 25: aload 1
      // 26: iload 3
      // 27: ifeq 46
      // 2a: invokevirtual java/lang/String.length ()I
      // 2d: iload 4
      // 2f: if_icmpgt 3f
      // 32: goto 39
      // 35: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 1
      // 3a: areturn
      // 3b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 1
      // 40: bipush 0
      // 41: iload 4
      // 43: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 46: astore 5
      // 48: aload 1
      // 49: iload 4
      // 4b: invokevirtual java/lang/String.charAt (I)C
      // 4e: istore 6
      // 50: iload 6
      // 52: iload 3
      // 53: ifeq 83
      // 56: bipush 32
      // 58: if_icmpeq 7b
      // 5b: goto 62
      // 5e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: iload 6
      // 64: iload 3
      // 65: ifeq 83
      // 68: goto 6f
      // 6b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: bipush 10
      // 71: if_icmpne 86
      // 74: goto 7b
      // 77: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7a: athrow
      // 7b: bipush 1
      // 7c: goto 83
      // 7f: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: goto 87
      // 86: bipush 0
      // 87: istore 7
      // 89: new java/lang/StringBuilder
      // 8c: dup
      // 8d: invokespecial java/lang/StringBuilder.<init> ()V
      // 90: aload 5
      // 92: invokestatic owt.pkg (Ljava/lang/String;)Ljava/lang/String;
      // 95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 98: aload 1
      // 99: iload 4
      // 9b: iload 7
      // 9d: iload 3
      // 9e: ifeq a5
      // a1: ifeq a8
      // a4: bipush 1
      // a5: goto a9
      // a8: bipush 0
      // a9: iadd
      // aa: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b3: astore 8
      // b5: new java/lang/StringBuilder
      // b8: dup
      // b9: invokespecial java/lang/StringBuilder.<init> ()V
      // bc: aload 5
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: ldc "\n"
      // c3: nop
      // c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c7: aload 0
      // c8: aload 8
      // ca: iload 2
      // cb: invokevirtual owt.oca (Ljava/lang/String;I)Ljava/lang/String;
      // ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d4: areturn
   }

   private int nmq(String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual java/lang/String.length ()I
      // 004: istore 4
      // 006: fconst_0
      // 007: fstore 5
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: bipush 0
      // 00d: istore 6
      // 00f: bipush -1
      // 010: istore 7
      // 012: bipush 0
      // 013: istore 8
      // 015: istore 3
      // 016: iload 6
      // 018: iload 4
      // 01a: if_icmpge 179
      // 01d: aload 1
      // 01e: iload 6
      // 020: invokevirtual java/lang/String.charAt (I)C
      // 023: istore 9
      // 025: iload 9
      // 027: iload 3
      // 028: ifne 17b
      // 02b: iload 3
      // 02c: ifne 09d
      // 02f: goto 036
      // 032: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: lookupswitch 56 3 10 38 32 52 167 94
      // 058: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: iinc 6 -1
      // 05f: iload 3
      // 060: ifeq 142
      // 063: goto 06a
      // 066: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: iload 6
      // 06c: istore 7
      // 06e: fload 5
      // 070: aload 0
      // 071: iload 9
      // 073: invokevirtual owt.egc (C)I
      // 076: i2f
      // 077: fadd
      // 078: fstore 5
      // 07a: iload 8
      // 07c: iload 3
      // 07d: ifne 144
      // 080: ifeq 142
      // 083: goto 08a
      // 086: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 089: athrow
      // 08a: fload 5
      // 08c: fconst_1
      // 08d: fadd
      // 08e: fstore 5
      // 090: iload 3
      // 091: ifeq 142
      // 094: iload 6
      // 096: goto 09d
      // 099: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: iload 4
      // 09f: bipush 1
      // 0a0: isub
      // 0a1: iload 3
      // 0a2: ifne 146
      // 0a5: if_icmpge 142
      // 0a8: goto 0af
      // 0ab: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: iinc 6 1
      // 0b2: aload 1
      // 0b3: iload 6
      // 0b5: invokevirtual java/lang/String.charAt (I)C
      // 0b8: istore 10
      // 0ba: iload 10
      // 0bc: iload 3
      // 0bd: ifne 140
      // 0c0: bipush 108
      // 0c2: if_icmpeq 138
      // 0c5: goto 0cc
      // 0c8: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: iload 10
      // 0ce: iload 3
      // 0cf: ifne 140
      // 0d2: goto 0d9
      // 0d5: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: bipush 76
      // 0db: if_icmpeq 138
      // 0de: goto 0e5
      // 0e1: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: iload 10
      // 0e7: iload 3
      // 0e8: ifne 132
      // 0eb: goto 0f2
      // 0ee: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: bipush 114
      // 0f4: if_icmpeq 131
      // 0f7: goto 0fe
      // 0fa: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: iload 10
      // 100: iload 3
      // 101: ifne 132
      // 104: goto 10b
      // 107: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: bipush 82
      // 10d: if_icmpeq 131
      // 110: goto 117
      // 113: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: iload 10
      // 119: invokestatic owt.fvq (C)Z
      // 11c: iload 3
      // 11d: ifne 144
      // 120: goto 127
      // 123: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 126: athrow
      // 127: ifeq 142
      // 12a: goto 131
      // 12d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 130: athrow
      // 131: bipush 0
      // 132: istore 8
      // 134: iload 3
      // 135: ifeq 142
      // 138: bipush 1
      // 139: goto 140
      // 13c: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: istore 8
      // 142: iload 9
      // 144: bipush 10
      // 146: iload 3
      // 147: ifne 16c
      // 14a: if_icmpne 15f
      // 14d: goto 154
      // 150: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: iinc 6 1
      // 157: iload 6
      // 159: istore 7
      // 15b: iload 3
      // 15c: ifeq 179
      // 15f: fload 5
      // 161: invokestatic java/lang/Math.round (F)I
      // 164: iload 2
      // 165: goto 16c
      // 168: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: if_icmple 172
      // 16f: goto 179
      // 172: iinc 6 1
      // 175: iload 3
      // 176: ifeq 016
      // 179: iload 6
      // 17b: iload 4
      // 17d: iload 3
      // 17e: ifne 195
      // 181: if_icmpeq 1c1
      // 184: goto 18b
      // 187: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18a: athrow
      // 18b: iload 7
      // 18d: bipush -1
      // 18e: goto 195
      // 191: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 194: athrow
      // 195: iload 3
      // 196: ifne 1b9
      // 199: if_icmpeq 1c1
      // 19c: goto 1a3
      // 19f: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: iload 7
      // 1a5: iload 3
      // 1a6: ifne 1be
      // 1a9: goto 1b0
      // 1ac: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1af: athrow
      // 1b0: iload 6
      // 1b2: goto 1b9
      // 1b5: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b8: athrow
      // 1b9: if_icmpge 1c1
      // 1bc: iload 7
      // 1be: goto 1c3
      // 1c1: iload 6
      // 1c3: ireturn
   }

   private static boolean fvq(char param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: bipush 48
      // 07: iload 1
      // 08: ifeq 37
      // 0b: if_icmplt 2d
      // 0e: goto 15
      // 11: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: iload 0
      // 16: iload 1
      // 17: ifeq 8e
      // 1a: goto 21
      // 1d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: bipush 57
      // 23: if_icmple 8d
      // 26: goto 2d
      // 29: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: iload 0
      // 2e: bipush 97
      // 30: goto 37
      // 33: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iload 1
      // 38: ifeq 67
      // 3b: if_icmplt 5d
      // 3e: goto 45
      // 41: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: iload 0
      // 46: iload 1
      // 47: ifeq 8e
      // 4a: goto 51
      // 4d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: bipush 102
      // 53: if_icmple 8d
      // 56: goto 5d
      // 59: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: iload 0
      // 5e: bipush 65
      // 60: goto 67
      // 63: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: iload 1
      // 68: ifeq 8a
      // 6b: if_icmplt 91
      // 6e: goto 75
      // 71: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: iload 0
      // 76: iload 1
      // 77: ifeq 8e
      // 7a: goto 81
      // 7d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: bipush 70
      // 83: goto 8a
      // 86: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: if_icmpgt 91
      // 8d: bipush 1
      // 8e: goto 92
      // 91: bipush 0
      // 92: ireturn
   }

   private static boolean qx1(char param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: bipush 107
      // 07: iload 1
      // 08: ifeq 37
      // 0b: if_icmplt 2d
      // 0e: goto 15
      // 11: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: iload 0
      // 16: iload 1
      // 17: ifeq 95
      // 1a: goto 21
      // 1d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: bipush 111
      // 23: if_icmple 8d
      // 26: goto 2d
      // 29: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: iload 0
      // 2e: bipush 75
      // 30: goto 37
      // 33: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iload 1
      // 38: ifeq 72
      // 3b: if_icmplt 5d
      // 3e: goto 45
      // 41: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: iload 0
      // 46: iload 1
      // 47: ifeq 95
      // 4a: goto 51
      // 4d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: bipush 79
      // 53: if_icmple 8d
      // 56: goto 5d
      // 59: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: iload 0
      // 5e: iload 1
      // 5f: ifeq 95
      // 62: goto 69
      // 65: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: bipush 114
      // 6b: goto 72
      // 6e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: if_icmpeq 8d
      // 75: iload 0
      // 76: iload 1
      // 77: ifeq 95
      // 7a: goto 81
      // 7d: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: bipush 82
      // 83: if_icmpne 98
      // 86: goto 8d
      // 89: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: bipush 1
      // 8e: goto 95
      // 91: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 94: athrow
      // 95: goto 99
      // 98: bipush 0
      // 99: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static String pkg(String var0) {
      String var2 = "";
      int var3 = -1;
      int var10000 = OpaquePredicate.b();
      int var4 = var0.length();
      int var1 = var10000;

      while ((var3 = var0.indexOf(167, var3 + 1)) != -1) {
         label59: {
            try {
               var10000 = var3;
               if (var1 == 0) {
                  break label59;
               }

               if (var3 >= var4 - 1) {
                  continue;
               }
            } catch (RuntimeException var9) {
               throw a(var9);
            }

            var10000 = var0.charAt(var3 + 1);
         }

         int var5 = var10000;

         label51: {
            label50: {
               label67: {
                  try {
                     var11 = fvq((char)var5);
                     if (var1 == 0) {
                        break label50;
                     }

                     if (!var11) {
                        break label67;
                     }
                  } catch (RuntimeException var8) {
                     throw a(var8);
                  }

                  var2 = "§" + var5;

                  try {
                     if (var1 != 0) {
                        break label51;
                     }
                  } catch (RuntimeException var7) {
                     boolean var10001 = false;
                     throw a(var7);
                  }
               }

               try {
                  var11 = qx1((char)var5);
               } catch (RuntimeException var6) {
                  boolean var13 = false;
                  throw a(var6);
               }
            }

            if (var11) {
               var2 = var2 + "§" + var5;
            }
         }

         if (var1 == 0) {
            break;
         }
      }

      return var2;
   }

   public boolean ymt() {
      return this.iy8;
   }

   public int squ(char param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic owt.a J
      // 03: ldc2_w 132154570509563
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: sipush 16917
      // 10: ldc2_w 1379387660237782991
      // 13: lload 2
      // 14: lxor
      // 15: invokedynamic r (IJ)Ljava/lang/String; bsm=owt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: iload 1
      // 1c: invokevirtual java/lang/String.indexOf (I)I
      // 1f: istore 5
      // 21: iload 5
      // 23: iload 4
      // 25: ifeq 79
      // 28: iflt 76
      // 2b: goto 32
      // 2e: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: iload 5
      // 34: iload 4
      // 36: ifeq 79
      // 39: goto 40
      // 3c: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield owt.fgp [I
      // 44: arraylength
      // 45: if_icmpge 76
      // 48: goto 4f
      // 4b: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield owt.fgp [I
      // 53: iload 5
      // 55: iaload
      // 56: istore 6
      // 58: invokestatic hxt.xe2 ()Z
      // 5b: iload 4
      // 5d: ifeq 75
      // 60: ifeq 73
      // 63: goto 6a
      // 66: invokestatic owt.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: iload 5
      // 6c: iload 6
      // 6e: invokestatic net/optifine/CustomColors.getTextColor (II)I
      // 71: istore 6
      // 73: iload 6
      // 75: ireturn
      // 76: ldc 16777215
      // 78: nop
      // 79: ireturn
   }

   public void e9m(float var1, float var2, float var3, float var4) {
      hzu.wn0(var1, var2, var3, var4);
   }

   public void c8a() {
      hzu.if9();
   }

   public void getMethod(gdz var1) {
      this.rwm.anl(var1);
   }

   public InputStream dbp(gdz var1) {
      return Minecraft.vz1().mpf().td5(var1).f_4();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8060862696767644169L, -8243378566194285902L, MethodHandles.lookup().lookupClass()).a(250093490950774L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 137065195550532L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "Yý ´åÖ\n\u0089\u0010æm\u008a*[ßô \u0005\u0095i}\u001f;\u0090\u0080oóòâNu:M/ÜÐß\u0010BÙåÑu\u009fC äSQ˘OÖ±\u0089]ÍX÷½\u008d\u008d\u0002\u0084åO¯q\u0097~IùJ\u0092M\u0002Õ\u0095\u009e\u0080Ôé\u0081|G¦}E\u0081\u0006\u0090\u009d\u00934ÚH°¶\u008bk\"[¸Ý!dv(\u0094ik¡\u0005\u0085e:zRªXêç|LVâÞ°¬iXÓX©à\u0089eü\u0015p{fVË=Ño\u0002\u0092â\u0089Ø\u0018\u008eæ°àrõ©Ôû\u0080\u000b{¬LÚ4Ä*\bWüÎÉc\u008d.+]¯$\u0094Iù\u0092é À'È\u009alÎè½ÜpÈ\u0086\u0097\n«§qÐg\"\\ÖÙñ3\u0011O~e!}@Ë¨ìi\u0002íNõÓg5\u0003\u0086¬äST·\u001azS¢Ì\u00078TI·\u0015j\nt§\u0019D-t\u0007Ë3\u008e¬ö\u0011=\u0019K½I\u001c9ÔÌ\u008bªÌ\u0081\\«æ¢34~G\nþ\u0012\u001eÏï²»<\u0099\u0092bË&qÅ\u000e,kE4D\u008f\u0083tFD¿)\u00ad»Ä?:\u0082Ï\u0013Õ×\u0003ðx%\u0010]©P9¿ÁÆXÊNlË*ç·¡ãùpåë}<ðµªì\u008a\n\u0093ß\u001dÃ7Bôèï\bO<é\u0097_\u0002°8G\u0089µÒüó\u0093+\u00adÊ\u0010Ì\u0090úÐ\u0090hy´\u008a}²\u009b\u009e\u009dÚÊÃiM1çBº\u0005ü±q\u0002Jg\u0087\u001a6Ì.j£¹\u009d®p\u009e¹¿Ný\u008a´¦êyÆ-ß+=s(f\u008b\"Âc ¯5ë¹\u001fg\u0096\u009eåeCó\u0097åQø©GÅ Á\u0014\ti\u009e\u0097o¦µªV\u00adÄmÎ\u0001ô®ï(ß×{ü\f½~\u0005ßz!¬n\u0004°ÖÜâYG.ú!Eh\u0005 zG~U\u0016óé?táõßÕáßJ¼I)\tùêrz\n\u0096\u0000\u009e\u0091{\tçs\u0003c\u0019d\\Yi|ö[\u0004¾\u0013¼»é0~\u000eÄ(·^Ä¶:¡8ìþf\u009cö«+=\u000b~®¡>ê\r¥í5Nî4ëÛ¼®~\u0099V\u0001\u0095è\u00ad³n\u0094ÚA4H\u008dÇ\u0098ÈÏ²åx\u000eqOK\u008fÂ£/¹\u00adÓ\u009eg1\u0084þ×\u009f\u0086\u0086<\u0005U\\\u000eGÃDw\u0099Kc§DÈªñ\u008aAy\u008fJ\u0080\u0010Ó#^Ë\f¥\u0095¯òÀ\u0089NÌà\u008ei¯\u001edúÝ×\u000e»\u0005lt=(«Â¬ö\u0010ær¸÷\u0090U!cÛ\u001f Û®¸÷\u0018\u001dõí¯\u0005\u001f¾\u0015\u0001\f\u0083ïàæ\u0006\u0086\u0088\u007f\u008cÈkd+_¦·pÔã\bÑ^\u0015î)Í\u0096Òèýã\u0013i©²ÙÃ¼ý\u0098\u000eXçøµ½ë,ˀÞ:5\u008dD2u\u0014`1Ö¶a\u001dE\u0084\u001d¿d@@ÌÖ7:<\u0014Ôa\u008cy\u009aHr6\u0097ÚjH6ÊA\u0003\n\u0092lÆè?E}Ý¥û&\u0006\u0013S0'-n3y\u001fæ\u0002K\u0082\u0096J_½\u0018ÔÕO\u00038?å\u0018Ço5~(\u0082Þv8B*÷8\u000fì®XHúWÔÒnQqZû\u0000\u0097ÓN¹\u0088Ô ÷äÔ\u0002²â\u0019\u0088\u009ae*³\u0003mÍæ\u009b¬÷\u001bÿÆ \u0084ÆW³\u009e\u0019\u0019ýJÀKÞ\u007f qU\u009a¦â\u008b|»\u001b8Ø\u0003w®\u0015\u009f!§áðåO÷ò[Ñÿ6uØ\u000fGOÕ\u008a\rw\u001e]Ê\u0093ctù\u0012CNu.äcÉ°¬oK\u0082Éº\rQ\niHÄ!ÕÑ\u00904\u0081¦\u000eÖ½¦å3èùòÌ²Î!ï\r\u000fÕ¼ýb\u001e+#uø\u008e5OÏ\u0004U5\u0001\u0001\u0087E~XÔ¹3Ái\nÓL\u0089\u009c<ë×\u0093Ü\u000bL\u0010fÉo¦\u0093@7=Y¯\u0085bþ'zÊKÒ;\u0097`©X\u0013\u0013ñb\u0019\u0004N(Í\u000eïZ\u0095mTÇ(\u009f¤Rð¤ÖÌ\u0090QûÛ\u0083\u0089X±úÙ\u0090G\u0004JÍ!ÚÚ'3êýé¬7\nÑ;eg\u00041Ô[\thÁv\u0004.&Å\u0000úul¬C×öÛs\u008dRa¯\u0005\u001cý\u001f\\-®ìX<\u000bs>\u001e\u0084{ô\"»ù0i\u0085ë3t×\u0002ÍÐæ½çû\u001bý\bÑB×r 1þ\u009f²\u0002\u001dt\u001d÷\u0099\u0086Íî\u0099\u000bÄ×Ã. B\u0014°m\u0090kÓ;\u000eeÿôLè»ç\u009fG36ÐO\u0006Oä\u0080\u0084(Z\u0094³7Éèè±#\u0085[\u009dÉ\u008bã4 Ô\u0096¬û7\u0080\th//\nK\u0081i³à3ÿ\u0090¿¥'mÝ\u000f§J{7\u0011²\u009b_\b\"Ï\nF\u009bÇUn®áëÙ«WÂ¬OatÐéÿ/X\u008deÝ»Y\u0098\u0001Ó\u0094\u001b)JwQ h«y3a_ç'uÃNjH¢ ÈÊÉ\u007fePi\u001baà*\u0096øÒ¦O\u0011ÕÎ?\u0013\u008c½ý¹!ÆØ\u0090\u009dä?VÝq¸Î«Åo\u0010÷,¶%N\u008c,¬3\u0088Í´³\u008aÆÿ]WZ\u0098\t\u009e$ÆGØ4/\u001a9Y>ùÞ8Ây'ã\u00ad\u0087<òò./\u008aE·oþuÁ=\u001aZ\u0095 *iô\u007f\u0081ÅÊJx0OzJ\u0087^#67>\u0007¨|\u0091\u0016\u009c()qí×D_$\u0095MÇ2sm\u0094uBã\u0015U¯È(\t@3\bXûuTV:\u008cû zÄ\u007fþX@s²þÃ¬}æÿ\u0092\u001dìÈÑÉ¿ªå^.]Uª\u0089¬\u001fÿ¤qyÅË_C¾Þ`Á\u0011oÏ \u0080ÎG²Ê\u0012OfãBi\u000b\u0019\u009b\u0091uÚoë¶D8o";
      int var8 = "Yý ´åÖ\n\u0089\u0010æm\u008a*[ßô \u0005\u0095i}\u001f;\u0090\u0080oóòâNu:M/ÜÐß\u0010BÙåÑu\u009fC äSQ˘OÖ±\u0089]ÍX÷½\u008d\u008d\u0002\u0084åO¯q\u0097~IùJ\u0092M\u0002Õ\u0095\u009e\u0080Ôé\u0081|G¦}E\u0081\u0006\u0090\u009d\u00934ÚH°¶\u008bk\"[¸Ý!dv(\u0094ik¡\u0005\u0085e:zRªXêç|LVâÞ°¬iXÓX©à\u0089eü\u0015p{fVË=Ño\u0002\u0092â\u0089Ø\u0018\u008eæ°àrõ©Ôû\u0080\u000b{¬LÚ4Ä*\bWüÎÉc\u008d.+]¯$\u0094Iù\u0092é À'È\u009alÎè½ÜpÈ\u0086\u0097\n«§qÐg\"\\ÖÙñ3\u0011O~e!}@Ë¨ìi\u0002íNõÓg5\u0003\u0086¬äST·\u001azS¢Ì\u00078TI·\u0015j\nt§\u0019D-t\u0007Ë3\u008e¬ö\u0011=\u0019K½I\u001c9ÔÌ\u008bªÌ\u0081\\«æ¢34~G\nþ\u0012\u001eÏï²»<\u0099\u0092bË&qÅ\u000e,kE4D\u008f\u0083tFD¿)\u00ad»Ä?:\u0082Ï\u0013Õ×\u0003ðx%\u0010]©P9¿ÁÆXÊNlË*ç·¡ãùpåë}<ðµªì\u008a\n\u0093ß\u001dÃ7Bôèï\bO<é\u0097_\u0002°8G\u0089µÒüó\u0093+\u00adÊ\u0010Ì\u0090úÐ\u0090hy´\u008a}²\u009b\u009e\u009dÚÊÃiM1çBº\u0005ü±q\u0002Jg\u0087\u001a6Ì.j£¹\u009d®p\u009e¹¿Ný\u008a´¦êyÆ-ß+=s(f\u008b\"Âc ¯5ë¹\u001fg\u0096\u009eåeCó\u0097åQø©GÅ Á\u0014\ti\u009e\u0097o¦µªV\u00adÄmÎ\u0001ô®ï(ß×{ü\f½~\u0005ßz!¬n\u0004°ÖÜâYG.ú!Eh\u0005 zG~U\u0016óé?táõßÕáßJ¼I)\tùêrz\n\u0096\u0000\u009e\u0091{\tçs\u0003c\u0019d\\Yi|ö[\u0004¾\u0013¼»é0~\u000eÄ(·^Ä¶:¡8ìþf\u009cö«+=\u000b~®¡>ê\r¥í5Nî4ëÛ¼®~\u0099V\u0001\u0095è\u00ad³n\u0094ÚA4H\u008dÇ\u0098ÈÏ²åx\u000eqOK\u008fÂ£/¹\u00adÓ\u009eg1\u0084þ×\u009f\u0086\u0086<\u0005U\\\u000eGÃDw\u0099Kc§DÈªñ\u008aAy\u008fJ\u0080\u0010Ó#^Ë\f¥\u0095¯òÀ\u0089NÌà\u008ei¯\u001edúÝ×\u000e»\u0005lt=(«Â¬ö\u0010ær¸÷\u0090U!cÛ\u001f Û®¸÷\u0018\u001dõí¯\u0005\u001f¾\u0015\u0001\f\u0083ïàæ\u0006\u0086\u0088\u007f\u008cÈkd+_¦·pÔã\bÑ^\u0015î)Í\u0096Òèýã\u0013i©²ÙÃ¼ý\u0098\u000eXçøµ½ë,ˀÞ:5\u008dD2u\u0014`1Ö¶a\u001dE\u0084\u001d¿d@@ÌÖ7:<\u0014Ôa\u008cy\u009aHr6\u0097ÚjH6ÊA\u0003\n\u0092lÆè?E}Ý¥û&\u0006\u0013S0'-n3y\u001fæ\u0002K\u0082\u0096J_½\u0018ÔÕO\u00038?å\u0018Ço5~(\u0082Þv8B*÷8\u000fì®XHúWÔÒnQqZû\u0000\u0097ÓN¹\u0088Ô ÷äÔ\u0002²â\u0019\u0088\u009ae*³\u0003mÍæ\u009b¬÷\u001bÿÆ \u0084ÆW³\u009e\u0019\u0019ýJÀKÞ\u007f qU\u009a¦â\u008b|»\u001b8Ø\u0003w®\u0015\u009f!§áðåO÷ò[Ñÿ6uØ\u000fGOÕ\u008a\rw\u001e]Ê\u0093ctù\u0012CNu.äcÉ°¬oK\u0082Éº\rQ\niHÄ!ÕÑ\u00904\u0081¦\u000eÖ½¦å3èùòÌ²Î!ï\r\u000fÕ¼ýb\u001e+#uø\u008e5OÏ\u0004U5\u0001\u0001\u0087E~XÔ¹3Ái\nÓL\u0089\u009c<ë×\u0093Ü\u000bL\u0010fÉo¦\u0093@7=Y¯\u0085bþ'zÊKÒ;\u0097`©X\u0013\u0013ñb\u0019\u0004N(Í\u000eïZ\u0095mTÇ(\u009f¤Rð¤ÖÌ\u0090QûÛ\u0083\u0089X±úÙ\u0090G\u0004JÍ!ÚÚ'3êýé¬7\nÑ;eg\u00041Ô[\thÁv\u0004.&Å\u0000úul¬C×öÛs\u008dRa¯\u0005\u001cý\u001f\\-®ìX<\u000bs>\u001e\u0084{ô\"»ù0i\u0085ë3t×\u0002ÍÐæ½çû\u001bý\bÑB×r 1þ\u009f²\u0002\u001dt\u001d÷\u0099\u0086Íî\u0099\u000bÄ×Ã. B\u0014°m\u0090kÓ;\u000eeÿôLè»ç\u009fG36ÐO\u0006Oä\u0080\u0084(Z\u0094³7Éèè±#\u0085[\u009dÉ\u008bã4 Ô\u0096¬û7\u0080\th//\nK\u0081i³à3ÿ\u0090¿¥'mÝ\u000f§J{7\u0011²\u009b_\b\"Ï\nF\u009bÇUn®áëÙ«WÂ¬OatÐéÿ/X\u008deÝ»Y\u0098\u0001Ó\u0094\u001b)JwQ h«y3a_ç'uÃNjH¢ ÈÊÉ\u007fePi\u001baà*\u0096øÒ¦O\u0011ÕÎ?\u0013\u008c½ý¹!ÆØ\u0090\u009dä?VÝq¸Î«Åo\u0010÷,¶%N\u008c,¬3\u0088Í´³\u008aÆÿ]WZ\u0098\t\u009e$ÆGØ4/\u001a9Y>ùÞ8Ây'ã\u00ad\u0087<òò./\u008aE·oþuÁ=\u001aZ\u0095 *iô\u007f\u0081ÅÊJx0OzJ\u0087^#67>\u0007¨|\u0091\u0016\u009c()qí×D_$\u0095MÇ2sm\u0094uBã\u0015U¯È(\t@3\bXûuTV:\u008cû zÄ\u007fþX@s²þÃ¬}æÿ\u0092\u001dìÈÑÉ¿ªå^.]Uª\u0089¬\u001fÿ¤qyÅË_C¾Þ`Á\u0011oÏ \u0080ÎG²Ê\u0012OfãBi\u000b\u0019\u009b\u0091uÚoë¶D8o"
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
                     c = new String[8];
                     j80 = new gdz[256];
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

                  var6 = "C4&u\u009c¬y\u0013\u000b\u0080\u0087\u0006\u008eÏÁm,`7AG6\u0087\u0001È¢ÙÉÀf!9L5 Çó\u009d\tX(Ö±T6E\u0084\u000fk\u009bôÄÂ¾\\\u009c\\G!^\u0001\u0094pU=\u0087\u000fa\u0085¾»\u0013\u0088\u0010\u0099t\u0098LL\u0003Ð";
                  var8 = "C4&u\u009c¬y\u0013\u000b\u0080\u0087\u0006\u008eÏÁm,`7AG6\u0087\u0001È¢ÙÉÀf!9L5 Çó\u009d\tX(Ö±T6E\u0084\u000fk\u009bôÄÂ¾\\\u009c\\G!^\u0001\u0094pU=\u0087\u000fa\u0085¾»\u0013\u0088\u0010\u0099t\u0098LL\u0003Ð"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28223;
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
            throw new RuntimeException("owt", var10);
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
         throw new RuntimeException("owt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
