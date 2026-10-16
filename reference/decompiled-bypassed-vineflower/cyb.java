import java.awt.Font;
import java.io.InputStream;
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

public class cyb {
   public float jek;
   public HashMap p98;
   public HashMap d8o;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public cyb(String var1, int var2, int var3, boolean var4) {
      this(var1, var2, var3, 0, var4);
   }

   public cyb(String var1, int var2, int var3, int var4, boolean var5) {
      this(var1, var2, var3, var4, var5, 0);
   }

   public cyb(String var1, int var2, int var3, int var4, boolean var5, int var6) {
      long var7 = a ^ 3130564572916L;
      super();
      this.jek = 0.0F;
      this.ze9 = new int[32];
      this.p98 = new HashMap();
      this.d8o = new HashMap();
      this.t8f = new h16(this.amo(var1, var2, var3), true, var4, var5, var6);
      this.r6j = 0.0F;

      for (int var9 = 0; var9 < 32; var9++) {
         int var10 = (var9 >> 3 & 1) * 85;
         int var11 = (var9 >> 2 & 1) * 170 + var10;
         int var12 = (var9 >> 1 & 1) * 170 + var10;
         int var13 = (var9 & 1) * 170 + var10;

         try {
            if (var9 == 6) {
               var11 += 85;
            }
         } catch (oov var14) {
            throw a(var14);
         }

         if (var9 >= 16) {
            var11 /= 4;
            var12 /= 4;
            var13 /= 4;
         }

         this.ze9[var9] = (var11 & 0xFF) << 16 | (var12 & 0xFF) << 8 | var13 & 0xFF;
      }

      this.jek = this.wni(a<"l">(18969, 2990633382637943606L ^ var7));
   }

   private Font amo(String var1, int var2, int var3) {
      long var4 = a ^ 39784229516653L;
      Font var6 = null;

      try {
         InputStream var7 = c05.vz1().mpf().td5(new gdz(a<"l">(459, 1632158216042689401L ^ var4) + var1)).f_4();
         var6 = Font.createFont(0, var7);
         var6 = var6.deriveFont(var2, (float)var3);
      } catch (Exception var8) {
         var8.printStackTrace();
         System.err.println(a<"l">(32598, 2606982727055691234L ^ var4));
      }

      return var6;
   }

   public int fzf(String var1, float var2, float var3, int var4) {
      int var5 = t9d.c();

      try {
         if (var5 != 0) {
            return var4;
         }

         if (var4 != 16777215) {
            return this.r5d(var1, var2, var3, var4, (float)(var4 >> 24 & 0xFF) / 255.0F);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      var4 = z7e.a2_.k0y;
      return this.r5d(var1, var2, var3, var4, (float)(var4 >> 24 & 0xFF) / 255.0F);
   }

   public int r5d(String param1, float param2, float param3, int param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cyb.a J
      // 003: ldc2_w 84726581967608
      // 006: lxor
      // 007: lstore 6
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokespecial cyb.c2h (Ljava/lang/String;)Ljava/lang/String;
      // 00e: astore 1
      // 00f: fload 2
      // 010: fconst_2
      // 011: fmul
      // 012: fstore 2
      // 013: invokestatic t9d.b ()I
      // 016: fload 3
      // 017: fconst_2
      // 018: fmul
      // 019: fstore 3
      // 01a: istore 8
      // 01c: fload 2
      // 01d: fstore 9
      // 01f: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 022: ldc2_w 0.5
      // 025: ldc2_w 0.5
      // 028: ldc2_w 0.5
      // 02b: invokestatic org/lwjgl/opengl/GL11.glScaled (DDD)V
      // 02e: sipush 3042
      // 031: invokestatic org/lwjgl/opengl/GL11.glGetBoolean (I)Z
      // 034: istore 10
      // 036: invokestatic hzu.if9 ()V
      // 039: sipush 3042
      // 03c: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 03f: sipush 770
      // 042: sipush 771
      // 045: invokestatic org/lwjgl/opengl/GL11.glBlendFunc (II)V
      // 048: sipush 3553
      // 04b: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 04e: iload 4
      // 050: istore 11
      // 052: aload 1
      // 053: invokevirtual java/lang/String.toCharArray ()[C
      // 056: astore 12
      // 058: bipush 0
      // 059: istore 13
      // 05b: aload 12
      // 05d: astore 14
      // 05f: aload 14
      // 061: arraylength
      // 062: istore 15
      // 064: bipush 0
      // 065: istore 16
      // 067: iload 16
      // 069: iload 15
      // 06b: if_icmpge 26c
      // 06e: aload 14
      // 070: iload 16
      // 072: caload
      // 073: istore 17
      // 075: iload 17
      // 077: iload 8
      // 079: ifeq 26e
      // 07c: bipush 13
      // 07e: iload 8
      // 080: ifeq 09b
      // 083: goto 08a
      // 086: invokestatic cyb.a (Loov;)Loov;
      // 089: athrow
      // 08a: if_icmpne 097
      // 08d: goto 094
      // 090: invokestatic cyb.a (Loov;)Loov;
      // 093: athrow
      // 094: fload 9
      // 096: fstore 2
      // 097: iload 17
      // 099: bipush 10
      // 09b: iload 8
      // 09d: ifeq 0bd
      // 0a0: if_icmpne 0b8
      // 0a3: goto 0aa
      // 0a6: invokestatic cyb.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: fload 3
      // 0ab: aload 0
      // 0ac: iload 17
      // 0ae: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 0b1: invokevirtual cyb.wni (Ljava/lang/String;)F
      // 0b4: fconst_2
      // 0b5: fmul
      // 0b6: fadd
      // 0b7: fstore 3
      // 0b8: iload 17
      // 0ba: sipush 167
      // 0bd: iload 8
      // 0bf: ifeq 186
      // 0c2: if_icmpeq 17b
      // 0c5: goto 0cc
      // 0c8: invokestatic cyb.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: iload 13
      // 0ce: iload 8
      // 0d0: ifeq 123
      // 0d3: goto 0da
      // 0d6: invokestatic cyb.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: ifeq 121
      // 0dd: goto 0e4
      // 0e0: invokestatic cyb.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: iload 13
      // 0e6: aload 12
      // 0e8: arraylength
      // 0e9: bipush 1
      // 0ea: isub
      // 0eb: iload 8
      // 0ed: ifeq 124
      // 0f0: goto 0f7
      // 0f3: invokestatic cyb.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: if_icmpeq 121
      // 0fa: goto 101
      // 0fd: invokestatic cyb.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 12
      // 103: iload 13
      // 105: bipush 1
      // 106: isub
      // 107: caload
      // 108: sipush 167
      // 10b: iload 8
      // 10d: ifeq 186
      // 110: goto 117
      // 113: invokestatic cyb.a (Loov;)Loov;
      // 116: athrow
      // 117: if_icmpeq 17b
      // 11a: goto 121
      // 11d: invokestatic cyb.a (Loov;)Loov;
      // 120: athrow
      // 121: iload 13
      // 123: bipush 1
      // 124: iload 8
      // 126: ifeq 144
      // 129: if_icmplt 14a
      // 12c: goto 133
      // 12f: invokestatic cyb.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 12
      // 135: iload 13
      // 137: bipush 1
      // 138: isub
      // 139: caload
      // 13a: sipush 167
      // 13d: goto 144
      // 140: invokestatic cyb.a (Loov;)Loov;
      // 143: athrow
      // 144: if_icmpne 14a
      // 147: goto 264
      // 14a: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 14d: aload 0
      // 14e: getfield cyb.t8f Lh16;
      // 151: iload 17
      // 153: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 156: fload 2
      // 157: f2d
      // 158: fload 3
      // 159: f2d
      // 15a: iload 11
      // 15c: fload 5
      // 15e: invokestatic hhf.kjo (IF)I
      // 161: bipush 0
      // 162: invokevirtual h16.ckt (Ljava/lang/String;DDIZ)V
      // 165: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 168: fload 2
      // 169: aload 0
      // 16a: iload 17
      // 16c: invokestatic java/lang/Character.toString (C)Ljava/lang/String;
      // 16f: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 172: fconst_2
      // 173: fmul
      // 174: fadd
      // 175: fstore 2
      // 176: iload 8
      // 178: ifne 261
      // 17b: iload 17
      // 17d: bipush 32
      // 17f: goto 186
      // 182: invokestatic cyb.a (Loov;)Loov;
      // 185: athrow
      // 186: iload 8
      // 188: ifeq 1b4
      // 18b: if_icmpne 1a8
      // 18e: goto 195
      // 191: invokestatic cyb.a (Loov;)Loov;
      // 194: athrow
      // 195: fload 2
      // 196: aload 0
      // 197: getfield cyb.t8f Lh16;
      // 19a: ldc " "
      // 19c: nop
      // 19d: invokevirtual h16.p3e (Ljava/lang/String;)I
      // 1a0: i2f
      // 1a1: fadd
      // 1a2: fstore 2
      // 1a3: iload 8
      // 1a5: ifne 261
      // 1a8: iload 17
      // 1aa: sipush 167
      // 1ad: goto 1b4
      // 1b0: invokestatic cyb.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: iload 8
      // 1b6: ifeq 1dd
      // 1b9: if_icmpne 261
      // 1bc: goto 1c3
      // 1bf: invokestatic cyb.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: iload 13
      // 1c5: iload 8
      // 1c7: ifeq 201
      // 1ca: goto 1d1
      // 1cd: invokestatic cyb.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: aload 12
      // 1d3: arraylength
      // 1d4: bipush 1
      // 1d5: isub
      // 1d6: goto 1dd
      // 1d9: invokestatic cyb.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: if_icmpeq 261
      // 1e0: sipush 28938
      // 1e3: ldc2_w 6564687491406416943
      // 1e6: lload 6
      // 1e8: lxor
      // 1e9: invokedynamic l (IJ)Ljava/lang/String; bsm=cyb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: nop
      // 1ef: aload 1
      // 1f0: iload 13
      // 1f2: bipush 1
      // 1f3: iadd
      // 1f4: invokevirtual java/lang/String.charAt (I)C
      // 1f7: invokevirtual java/lang/String.indexOf (I)I
      // 1fa: goto 201
      // 1fd: invokestatic cyb.a (Loov;)Loov;
      // 200: athrow
      // 201: istore 18
      // 203: iload 18
      // 205: iload 8
      // 207: ifeq 219
      // 20a: ifge 217
      // 20d: goto 214
      // 210: invokestatic cyb.a (Loov;)Loov;
      // 213: athrow
      // 214: goto 264
      // 217: iload 18
      // 219: bipush 16
      // 21b: iload 8
      // 21d: ifeq 24f
      // 220: if_icmpge 238
      // 223: goto 22a
      // 226: invokestatic cyb.a (Loov;)Loov;
      // 229: athrow
      // 22a: aload 0
      // 22b: getfield cyb.ze9 [I
      // 22e: iload 18
      // 230: iaload
      // 231: istore 11
      // 233: iload 8
      // 235: ifne 261
      // 238: iload 18
      // 23a: iload 8
      // 23c: ifeq 25f
      // 23f: goto 246
      // 242: invokestatic cyb.a (Loov;)Loov;
      // 245: athrow
      // 246: bipush 21
      // 248: goto 24f
      // 24b: invokestatic cyb.a (Loov;)Loov;
      // 24e: athrow
      // 24f: if_icmpne 261
      // 252: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 255: invokevirtual java/awt/Color.getRGB ()I
      // 258: goto 25f
      // 25b: invokestatic cyb.a (Loov;)Loov;
      // 25e: athrow
      // 25f: istore 11
      // 261: iinc 13 1
      // 264: iinc 16 1
      // 267: iload 8
      // 269: ifne 067
      // 26c: iload 10
      // 26e: iload 8
      // 270: ifeq 296
      // 273: ifne 28a
      // 276: goto 27d
      // 279: invokestatic cyb.a (Loov;)Loov;
      // 27c: athrow
      // 27d: sipush 3042
      // 280: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 283: goto 28a
      // 286: invokestatic cyb.a (Loov;)Loov;
      // 289: athrow
      // 28a: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 28d: fconst_1
      // 28e: fconst_1
      // 28f: fconst_1
      // 290: fconst_1
      // 291: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 294: fload 2
      // 295: f2i
      // 296: ireturn
   }

   private String c2h(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cyb.a J
      // 003: ldc2_w 31120165236544
      // 006: lxor
      // 007: lstore 2
      // 008: ldc ""
      // 00a: nop
      // 00b: astore 5
      // 00d: aload 1
      // 00e: invokevirtual java/lang/String.toCharArray ()[C
      // 011: astore 6
      // 013: aload 6
      // 015: arraylength
      // 016: istore 7
      // 018: invokestatic t9d.b ()I
      // 01b: bipush 0
      // 01c: istore 8
      // 01e: istore 4
      // 020: iload 8
      // 022: iload 7
      // 024: if_icmpge 096
      // 027: aload 6
      // 029: iload 8
      // 02b: caload
      // 02c: istore 9
      // 02e: iload 4
      // 030: ifeq 135
      // 033: iload 9
      // 035: ldc 50000
      // 037: nop
      // 038: iload 4
      // 03a: ifeq 075
      // 03d: goto 044
      // 040: invokestatic cyb.a (Loov;)Loov;
      // 043: athrow
      // 044: if_icmplt 069
      // 047: goto 04e
      // 04a: invokestatic cyb.a (Loov;)Loov;
      // 04d: athrow
      // 04e: iload 9
      // 050: ldc 60000
      // 052: nop
      // 053: iload 4
      // 055: ifeq 075
      // 058: goto 05f
      // 05b: invokestatic cyb.a (Loov;)Loov;
      // 05e: athrow
      // 05f: if_icmple 08e
      // 062: goto 069
      // 065: invokestatic cyb.a (Loov;)Loov;
      // 068: athrow
      // 069: iload 9
      // 06b: sipush 9917
      // 06e: goto 075
      // 071: invokestatic cyb.a (Loov;)Loov;
      // 074: athrow
      // 075: if_icmpeq 08e
      // 078: new java/lang/StringBuilder
      // 07b: dup
      // 07c: invokespecial java/lang/StringBuilder.<init> ()V
      // 07f: aload 5
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: iload 9
      // 086: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 089: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 08c: astore 5
      // 08e: iinc 8 1
      // 091: iload 4
      // 093: ifne 020
      // 096: aload 5
      // 098: sipush 18421
      // 09b: ldc2_w 3126716501538156397
      // 09e: lload 2
      // 09f: lxor
      // 0a0: invokedynamic l (IJ)Ljava/lang/String; bsm=cyb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: nop
      // 0a6: ldc ""
      // 0a8: nop
      // 0a9: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0ac: sipush 9644
      // 0af: bipush 61
      // 0b1: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0b4: sipush 10084
      // 0b7: sipush 9829
      // 0ba: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0bd: sipush 8902
      // 0c0: sipush 9734
      // 0c3: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0c6: sipush 9760
      // 0c9: sipush 9734
      // 0cc: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0cf: sipush 10032
      // 0d2: sipush 9734
      // 0d5: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0d8: ldc "✫"
      // 0da: nop
      // 0db: ldc "☆"
      // 0dd: nop
      // 0de: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0e1: ldc "✙"
      // 0e3: nop
      // 0e4: ldc "+"
      // 0e6: nop
      // 0e7: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0ea: astore 1
      // 0eb: aload 1
      // 0ec: sipush 11013
      // 0ef: sipush 8592
      // 0f2: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0f5: sipush 11014
      // 0f8: sipush 8593
      // 0fb: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0fe: sipush 11015
      // 101: sipush 8595
      // 104: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 107: sipush 10145
      // 10a: sipush 8594
      // 10d: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 110: sipush 11016
      // 113: sipush 8599
      // 116: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 119: sipush 11019
      // 11c: sipush 8601
      // 11f: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 122: sipush 11017
      // 125: sipush 8598
      // 128: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 12b: sipush 11018
      // 12e: sipush 8600
      // 131: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 134: astore 1
      // 135: aload 1
      // 136: areturn
   }

   public int e18(String var1, float var2, float var3, int var4) {
      this.fzf(jfy.i95(var1), var2 + 0.8F, var3 + 0.8F, hhf.kjo(z7e.ret.k0y, 0.75F));
      return this.fzf(var1, var2, var3, var4);
   }

   public int unm(String var1, float var2, float var3, int var4) {
      this.fzf(jfy.i95(var1), var2 + 0.8F, var3 + 0.8F, hhf.kjo(z7e.ret.k0y, Math.min(0.85F, (float)(var4 >> 24 & 0xFF) / 255.0F)));
      return this.fzf(var1, var2, var3, var4);
   }

   public int kkl(String var1, float var2, float var3, int var4) {
      this.r5d(jfy.i95(var1), var2 + 0.5F, var3 + 0.5F, 0, (float)(var4 >> 24 & 0xFF) / 255.0F);
      return this.fzf(var1, var2, var3, var4);
   }

   public int ayi(String var1, float var2, float var3, int var4) {
      this.r5d(jfy.i95(var1), var2 + 0.8F, var3 + 0.8F, 0, (float)(var4 >> 24 & 0xFF) / 255.0F);
      return this.fzf(var1, var2, var3, var4);
   }

   public int lt2(String var1, float var2, float var3, int var4) {
      return this.fzf(var1, var2 - (float)((int)this.ax2(var1) / 2), var3, var4);
   }

   public void amd(String var1, float var2, float var3, int var4, float var5) {
      this.r5d(var1, var2 - (float)((int)this.ax2(var1) / 2), var3, var4, var5);
   }

   public void os_(String var1, float var2, float var3, int var4) {
      this.lt2(jfy.i95(var1), var2 + 0.5F, var3 + 0.5F, -16777216);
      this.lt2(var1, var2, var3, var4);
   }

   public void lh8(String var1, float var2, float var3, int var4, int var5) {
      this.fzf(var1, var2 - this.ax2(var1) / 2.0F - 0.5F, var3, var5);
      this.fzf(var1, var2 - this.ax2(var1) / 2.0F + 0.5F, var3, var5);
      this.fzf(var1, var2 - this.ax2(var1) / 2.0F, var3 - 0.5F, var5);
      this.fzf(var1, var2 - this.ax2(var1) / 2.0F, var3 + 0.5F, var5);
      this.fzf(var1, var2 - this.ax2(var1) / 2.0F, var3, var4);
   }

   public float ax2(String var1) {
      try {
         if (this.p98.containsKey(var1)) {
            return (Float)this.p98.get(var1);
         }
      } catch (oov var8) {
         throw a(var8);
      }

      float var2 = 0.0F;
      String var3 = jfy.i95(var1);

      for (char var7 : var3.toCharArray()) {
         var2 += (float)this.t8f.p3e(Character.toString(var7)) + this.r6j;
      }

      this.p98.put(var1, var2 / 2.0F);
      return var2 / 2.0F;
   }

   public float pa9(char var1) {
      return (float)this.t8f.p3e(String.valueOf(var1));
   }

   public float wni(String var1) {
      try {
         if (this.d8o.containsKey(var1)) {
            return (Float)this.d8o.get(var1);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      float var2 = (float)this.t8f.lwd(var1) / 2.0F;
      this.d8o.put(var1, var2);
      return var2;
   }

   public float pvv() {
      long var1 = a ^ 14947457756579L;
      return (float)this.t8f.lwd(a<"l">(29731, 4450109012932632154L ^ var1)) / 2.0F;
   }

   public h16 xj9() {
      return this.t8f;
   }

   public String rt4(String var1, int var2) {
      return this.abn(var1, var2, false);
   }

   public String abn(String param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cyb.a J
      // 003: ldc2_w 131702595769734
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokespecial cyb.c2h (Ljava/lang/String;)Ljava/lang/String;
      // 00e: astore 1
      // 00f: invokestatic t9d.c ()I
      // 012: new java/lang/StringBuilder
      // 015: dup
      // 016: invokespecial java/lang/StringBuilder.<init> ()V
      // 019: astore 7
      // 01b: istore 6
      // 01d: fconst_0
      // 01e: fstore 8
      // 020: iload 3
      // 021: iload 6
      // 023: ifne 03d
      // 026: ifeq 040
      // 029: goto 030
      // 02c: invokestatic cyb.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 1
      // 031: invokevirtual java/lang/String.length ()I
      // 034: bipush 1
      // 035: isub
      // 036: goto 03d
      // 039: invokestatic cyb.a (Loov;)Loov;
      // 03c: athrow
      // 03d: goto 041
      // 040: bipush 0
      // 041: istore 9
      // 043: iload 3
      // 044: iload 6
      // 046: ifne 054
      // 049: ifeq 057
      // 04c: goto 053
      // 04f: invokestatic cyb.a (Loov;)Loov;
      // 052: athrow
      // 053: bipush -1
      // 054: goto 058
      // 057: bipush 1
      // 058: istore 10
      // 05a: bipush 0
      // 05b: istore 11
      // 05d: bipush 0
      // 05e: istore 12
      // 060: iload 9
      // 062: istore 13
      // 064: iload 13
      // 066: iflt 1fc
      // 069: iload 13
      // 06b: iload 6
      // 06d: ifne 08a
      // 070: aload 1
      // 071: invokevirtual java/lang/String.length ()I
      // 074: if_icmpge 1fc
      // 077: goto 07e
      // 07a: invokestatic cyb.a (Loov;)Loov;
      // 07d: athrow
      // 07e: fload 8
      // 080: iload 2
      // 081: i2f
      // 082: fcmpg
      // 083: goto 08a
      // 086: invokestatic cyb.a (Loov;)Loov;
      // 089: athrow
      // 08a: iload 6
      // 08c: ifne 0a6
      // 08f: ifge 1fc
      // 092: goto 099
      // 095: invokestatic cyb.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 1
      // 09a: iload 13
      // 09c: invokevirtual java/lang/String.charAt (I)C
      // 09f: goto 0a6
      // 0a2: invokestatic cyb.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: istore 14
      // 0a8: aload 0
      // 0a9: iload 14
      // 0ab: invokevirtual cyb.pa9 (C)F
      // 0ae: fstore 15
      // 0b0: iload 11
      // 0b2: iload 6
      // 0b4: ifne 15a
      // 0b7: ifeq 143
      // 0ba: goto 0c1
      // 0bd: invokestatic cyb.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: bipush 0
      // 0c2: istore 11
      // 0c4: iload 14
      // 0c6: iload 6
      // 0c8: ifne 13c
      // 0cb: bipush 108
      // 0cd: if_icmpeq 134
      // 0d0: goto 0d7
      // 0d3: invokestatic cyb.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: iload 14
      // 0d9: iload 6
      // 0db: ifne 13c
      // 0de: goto 0e5
      // 0e1: invokestatic cyb.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: bipush 76
      // 0e7: if_icmpeq 134
      // 0ea: goto 0f1
      // 0ed: invokestatic cyb.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: iload 14
      // 0f3: iload 6
      // 0f5: ifne 12d
      // 0f8: goto 0ff
      // 0fb: invokestatic cyb.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: bipush 114
      // 101: if_icmpeq 125
      // 104: goto 10b
      // 107: invokestatic cyb.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 14
      // 10d: iload 6
      // 10f: ifne 1b6
      // 112: goto 119
      // 115: invokestatic cyb.a (Loov;)Loov;
      // 118: athrow
      // 119: bipush 82
      // 11b: if_icmpne 1b1
      // 11e: goto 125
      // 121: invokestatic cyb.a (Loov;)Loov;
      // 124: athrow
      // 125: bipush 0
      // 126: goto 12d
      // 129: invokestatic cyb.a (Loov;)Loov;
      // 12c: athrow
      // 12d: istore 12
      // 12f: iload 6
      // 131: ifeq 1b1
      // 134: bipush 1
      // 135: goto 13c
      // 138: invokestatic cyb.a (Loov;)Loov;
      // 13b: athrow
      // 13c: istore 12
      // 13e: iload 6
      // 140: ifeq 1b1
      // 143: fload 15
      // 145: iload 6
      // 147: ifne 16e
      // 14a: goto 151
      // 14d: invokestatic cyb.a (Loov;)Loov;
      // 150: athrow
      // 151: fconst_0
      // 152: fcmpg
      // 153: goto 15a
      // 156: invokestatic cyb.a (Loov;)Loov;
      // 159: athrow
      // 15a: ifge 165
      // 15d: bipush 1
      // 15e: istore 11
      // 160: iload 6
      // 162: ifeq 1b1
      // 165: fload 8
      // 167: goto 16e
      // 16a: invokestatic cyb.a (Loov;)Loov;
      // 16d: athrow
      // 16e: f2d
      // 16f: fload 15
      // 171: f2d
      // 172: aload 1
      // 173: sipush 7747
      // 176: ldc2_w 6849895634892016665
      // 179: lload 4
      // 17b: lxor
      // 17c: invokedynamic l (IJ)Ljava/lang/String; bsm=cyb.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: nop
      // 182: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 185: ifeq 192
      // 188: ldc2_w 2.2
      // 18b: goto 195
      // 18e: invokestatic cyb.a (Loov;)Loov;
      // 191: athrow
      // 192: ldc2_w 2.0
      // 195: ddiv
      // 196: dadd
      // 197: d2f
      // 198: fstore 8
      // 19a: iload 12
      // 19c: iload 6
      // 19e: ifne 1b6
      // 1a1: ifeq 1b1
      // 1a4: goto 1ab
      // 1a7: invokestatic cyb.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: fload 8
      // 1ad: fconst_1
      // 1ae: fadd
      // 1af: fstore 8
      // 1b1: fload 8
      // 1b3: iload 2
      // 1b4: i2f
      // 1b5: fcmpl
      // 1b6: iload 6
      // 1b8: ifne 1c9
      // 1bb: ifle 1c8
      // 1be: goto 1c5
      // 1c1: invokestatic cyb.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: goto 1fc
      // 1c8: iload 3
      // 1c9: ifeq 1e1
      // 1cc: aload 7
      // 1ce: bipush 0
      // 1cf: iload 14
      // 1d1: invokevirtual java/lang/StringBuilder.insert (IC)Ljava/lang/StringBuilder;
      // 1d4: pop
      // 1d5: iload 6
      // 1d7: ifeq 1f0
      // 1da: goto 1e1
      // 1dd: invokestatic cyb.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: aload 7
      // 1e3: iload 14
      // 1e5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1e8: pop
      // 1e9: goto 1f0
      // 1ec: invokestatic cyb.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: iload 13
      // 1f2: iload 10
      // 1f4: iadd
      // 1f5: istore 13
      // 1f7: iload 6
      // 1f9: ifeq 064
      // 1fc: aload 7
      // 1fe: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 201: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6776527586774953043L, 5986738704977795947L, MethodHandles.lookup().lookupClass()).a(63196893167041L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 57693818551997L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u0010øÈ\u001d\u008eÂ³l¤>\u0014:ðÑ\nb_Äµ\u009aÑó§yH¨\u0007T³LeÕ×|µéU\u0099`\u0086$´fÁ\u008c\u0085tÔ\u008a\u0097³Bí\u0015Bú\u0010\u0001Kìþ\u0093¨\u001cîJ CI\u0014ý\u009dÆ`vñ\u0018\f\u0011\b©úåB±ªÆÔJ\u008dÍpN_·&irSã\u008aXó\u0084·'\u0013.ÆP\u001dkùç}3\u0017q-,\u0001û\u00adãLTpÈ\u00828½F\u000fîÔÅ\fõ%\u009ca¦Òºw\u000bÄ\u008eND\b¾\u0083è&\u0015µ\u0090\u009d3,X6\u0016ÃOcÒè-8õlye\u0016\fÑr¯\u0006\u0013\u0089\"ÚãfµkÌE¦ù\u0012\fßÊ\u0006Ë\u009d\u008fnÓ£iÎþ{\u009e\u0097Yö\u001cn¢ÒBU'ÕúT\\NÎÿV(\u008a=×eÞëÍßzà\u0086\u0093ït\u0096'*Aºì\\_%dúbTÏ×n¤ë\u0013\u008exÍ\u000fÐu=";
      int var8 = "\u0010øÈ\u001d\u008eÂ³l¤>\u0014:ðÑ\nb_Äµ\u009aÑó§yH¨\u0007T³LeÕ×|µéU\u0099`\u0086$´fÁ\u008c\u0085tÔ\u008a\u0097³Bí\u0015Bú\u0010\u0001Kìþ\u0093¨\u001cîJ CI\u0014ý\u009dÆ`vñ\u0018\f\u0011\b©úåB±ªÆÔJ\u008dÍpN_·&irSã\u008aXó\u0084·'\u0013.ÆP\u001dkùç}3\u0017q-,\u0001û\u00adãLTpÈ\u00828½F\u000fîÔÅ\fõ%\u009ca¦Òºw\u000bÄ\u008eND\b¾\u0083è&\u0015µ\u0090\u009d3,X6\u0016ÃOcÒè-8õlye\u0016\fÑr¯\u0006\u0013\u0089\"ÚãfµkÌE¦ù\u0012\fßÊ\u0006Ë\u009d\u008fnÓ£iÎþ{\u009e\u0097Yö\u001cn¢ÒBU'ÕúT\\NÎÿV(\u008a=×eÞëÍßzà\u0086\u0093ït\u0096'*Aºì\\_%dúbTÏ×n¤ë\u0013\u008exÍ\u000fÐu="
         .length();
      char var5 = '8';
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
                     c = new String[7];
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

                  var6 = "ÚBÔ\u001dÔ\b§\n²\u007f\u0002àÖð\u001eS\u0018\u0088òõd\u0012mðÆÿù\u0004ÏT\u009bõÆ^Ï¶ÔN*\u0084Ò";
                  var8 = "ÚBÔ\u001dÔ\b§\n²\u007f\u0002àÖð\u001eS\u0018\u0088òõd\u0012mðÆÿù\u0004ÏT\u009bõÆ^Ï¶ÔN*\u0084Ò".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32194;
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
            throw new RuntimeException("cyb", var10);
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
         throw new RuntimeException("cyb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
