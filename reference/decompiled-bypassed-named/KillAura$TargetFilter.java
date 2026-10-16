import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class KillAura$TargetFilter {
   public final Minecraft hgl;
   public final ha9 noj;
   public float q5z;
   public final KillAura j0h;
   private static final long a;
   private static final String b;

   public KillAura$TargetFilter(KillAura var1, ha9 var2) {
      this.j0h = var1;
      this.hgl = Minecraft.vz1();
      this.q5z = 0.0F;
      this.noj = var2;
   }

   public void renderTargetHud(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic KillAura$TargetFilter.a J
      // 003: ldc2_w 11943240696518
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 00b: fload 1
      // 00c: fload 2
      // 00d: fconst_0
      // 00e: invokestatic org/lwjgl/opengl/GL11.glTranslatef (FFF)V
      // 011: aload 0
      // 012: getfield KillAura$TargetFilter.noj Lha9;
      // 015: invokevirtual ha9.noc ()Ljava/lang/String;
      // 018: astore 6
      // 01a: new java/lang/StringBuilder
      // 01d: dup
      // 01e: invokespecial java/lang/StringBuilder.<init> ()V
      // 021: getstatic KillAura$TargetFilter.b Ljava/lang/String;
      // 024: nop
      // 025: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 028: aload 0
      // 029: getfield KillAura$TargetFilter.noj Lha9;
      // 02c: invokevirtual ha9.i55 ()F
      // 02f: ldc 10.0
      // 031: nop
      // 032: fmul
      // 033: invokestatic java/lang/Math.round (F)I
      // 036: i2d
      // 037: ldc2_w 10.0
      // 03a: ddiv
      // 03b: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 03e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 041: astore 7
      // 043: invokestatic OpaquePredicate.c ()I
      // 046: getstatic jsr.yk7 Lcyb;
      // 049: aload 6
      // 04b: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 04e: ldc 4.0
      // 050: nop
      // 051: fadd
      // 052: fstore 8
      // 054: getstatic jsr.zva Lcyb;
      // 057: aload 7
      // 059: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 05c: ldc 4.0
      // 05e: nop
      // 05f: fadd
      // 060: fstore 9
      // 062: istore 5
      // 064: fload 8
      // 066: fload 9
      // 068: invokestatic java/lang/Math.max (FF)F
      // 06b: fstore 10
      // 06d: fconst_0
      // 06e: fconst_0
      // 06f: ldc 26.0
      // 071: nop
      // 072: fload 10
      // 074: fadd
      // 075: ldc 40.0
      // 077: nop
      // 078: fconst_2
      // 079: ldc -14539477
      // 07b: nop
      // 07c: ldc 0.85
      // 07e: nop
      // 07f: invokestatic hhf.kjo (IF)I
      // 082: fconst_1
      // 083: getstatic z7e.ret Lz7e;
      // 086: getfield z7e.k0y I
      // 089: fconst_0
      // 08a: invokestatic hhf.kjo (IF)I
      // 08d: invokestatic mkt.o8m (FFFFFIFI)V
      // 090: getstatic jsr.yk7 Lcyb;
      // 093: aload 6
      // 095: ldc 26.0
      // 097: nop
      // 098: fconst_2
      // 099: getstatic z7e.a2_ Lz7e;
      // 09c: getfield z7e.k0y I
      // 09f: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 0a2: pop
      // 0a3: getstatic jsr.zva Lcyb;
      // 0a6: aload 7
      // 0a8: ldc 26.0
      // 0aa: nop
      // 0ab: ldc 14.0
      // 0ad: nop
      // 0ae: getstatic z7e.a2_ Lz7e;
      // 0b1: getfield z7e.k0y I
      // 0b4: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 0b7: pop
      // 0b8: aload 0
      // 0b9: getfield KillAura$TargetFilter.noj Lha9;
      // 0bc: invokevirtual ha9.i55 ()F
      // 0bf: fstore 11
      // 0c1: aload 0
      // 0c2: getfield KillAura$TargetFilter.noj Lha9;
      // 0c5: invokevirtual ha9.axb ()F
      // 0c8: fstore 12
      // 0ca: fload 11
      // 0cc: fload 12
      // 0ce: fdiv
      // 0cf: fconst_0
      // 0d0: fconst_1
      // 0d1: invokestatic rak.wtd (FFF)F
      // 0d4: fstore 13
      // 0d6: ldc 16.5
      // 0d8: nop
      // 0d9: fload 10
      // 0db: fadd
      // 0dc: fconst_2
      // 0dd: fsub
      // 0de: ldc 100.0
      // 0e0: nop
      // 0e1: fdiv
      // 0e2: fload 13
      // 0e4: ldc 100.0
      // 0e6: nop
      // 0e7: fmul
      // 0e8: fmul
      // 0e9: fstore 14
      // 0eb: aload 0
      // 0ec: getfield KillAura$TargetFilter.q5z F
      // 0ef: fconst_0
      // 0f0: fcmpg
      // 0f1: iload 5
      // 0f3: ifne 11a
      // 0f6: ifgt 10d
      // 0f9: goto 100
      // 0fc: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 0
      // 101: fload 14
      // 103: putfield KillAura$TargetFilter.q5z F
      // 106: goto 10d
      // 109: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 0
      // 10e: getfield KillAura$TargetFilter.q5z F
      // 111: ldc 25.5
      // 113: nop
      // 114: fload 10
      // 116: fadd
      // 117: fconst_2
      // 118: fsub
      // 119: fcmpl
      // 11a: iload 5
      // 11c: ifne 13d
      // 11f: ifle 136
      // 122: goto 129
      // 125: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: fload 14
      // 12c: putfield KillAura$TargetFilter.q5z F
      // 12f: goto 136
      // 132: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 135: athrow
      // 136: aload 0
      // 137: getfield KillAura$TargetFilter.noj Lha9;
      // 13a: getfield ha9.gx0 I
      // 13d: iload 5
      // 13f: ifne 1a0
      // 142: bipush 6
      // 144: if_icmpgt 17c
      // 147: goto 14e
      // 14a: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: aload 0
      // 150: getfield KillAura$TargetFilter.q5z F
      // 153: fload 14
      // 155: ldc2_w 10.0
      // 158: aload 0
      // 159: getfield KillAura$TargetFilter.q5z F
      // 15c: fload 14
      // 15e: fsub
      // 15f: invokestatic java/lang/Math.abs (F)F
      // 162: ldc 30.0
      // 164: nop
      // 165: fmul
      // 166: f2d
      // 167: ldc2_w 0.4
      // 16a: dmul
      // 16b: invokestatic java/lang/Math.max (DD)D
      // 16e: d2f
      // 16f: invokestatic InputState.lvf (FFF)F
      // 172: putfield KillAura$TargetFilter.q5z F
      // 175: goto 17c
      // 178: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 17b: athrow
      // 17c: ldc 10.0
      // 17e: nop
      // 17f: ldc 27.5
      // 181: nop
      // 182: ldc 25.5
      // 184: nop
      // 185: fload 10
      // 187: fadd
      // 188: fconst_2
      // 189: fsub
      // 18a: ldc 29.5
      // 18c: nop
      // 18d: getstatic z7e.ret Lz7e;
      // 190: getfield z7e.k0y I
      // 193: ldc 0.35
      // 195: nop
      // 196: invokestatic hhf.kjo (IF)I
      // 199: invokestatic hhf.cuu (FFFFI)V
      // 19c: fload 14
      // 19e: fconst_0
      // 19f: fcmpl
      // 1a0: iload 5
      // 1a2: ifne 22a
      // 1a5: ifle 1ff
      // 1a8: goto 1af
      // 1ab: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: ldc 10.0
      // 1b1: nop
      // 1b2: aload 0
      // 1b3: getfield KillAura$TargetFilter.q5z F
      // 1b6: fadd
      // 1b7: fconst_1
      // 1b8: fsub
      // 1b9: ldc 10.0
      // 1bb: nop
      // 1bc: invokestatic java/lang/Math.max (FF)F
      // 1bf: fstore 15
      // 1c1: ldc 10.0
      // 1c3: nop
      // 1c4: fload 14
      // 1c6: fadd
      // 1c7: fconst_1
      // 1c8: fsub
      // 1c9: ldc 10.0
      // 1cb: nop
      // 1cc: invokestatic java/lang/Math.max (FF)F
      // 1cf: fstore 16
      // 1d1: ldc 10.0
      // 1d3: nop
      // 1d4: ldc 27.5
      // 1d6: nop
      // 1d7: fload 15
      // 1d9: ldc 29.5
      // 1db: nop
      // 1dc: ldc -84409
      // 1de: nop
      // 1df: ldc 0.95
      // 1e1: nop
      // 1e2: invokestatic hhf.kjo (IF)I
      // 1e5: invokestatic hhf.cuu (FFFFI)V
      // 1e8: ldc 10.0
      // 1ea: nop
      // 1eb: ldc 27.5
      // 1ed: nop
      // 1ee: fload 16
      // 1f0: ldc 29.5
      // 1f2: nop
      // 1f3: ldc -16723585
      // 1f5: nop
      // 1f6: ldc 0.95
      // 1f8: nop
      // 1f9: invokestatic hhf.kjo (IF)I
      // 1fc: invokestatic hhf.cuu (FFFFI)V
      // 1ff: getstatic jsr.q6n Lcyb;
      // 202: ldc "s"
      // 204: nop
      // 205: ldc 2.5
      // 207: nop
      // 208: ldc 26.0
      // 20a: nop
      // 20b: getstatic z7e.a2_ Lz7e;
      // 20e: getfield z7e.k0y I
      // 211: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 214: pop
      // 215: getstatic jsr.q6n Lcyb;
      // 218: ldc "r"
      // 21a: nop
      // 21b: ldc 2.5
      // 21d: nop
      // 21e: ldc 33.0
      // 220: nop
      // 221: getstatic z7e.a2_ Lz7e;
      // 224: getfield z7e.k0y I
      // 227: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 22a: pop
      // 22b: ldc 10.0
      // 22d: nop
      // 22e: ldc 16.5
      // 230: nop
      // 231: fload 10
      // 233: fadd
      // 234: fconst_2
      // 235: fsub
      // 236: ldc 100.0
      // 238: nop
      // 239: fdiv
      // 23a: aload 0
      // 23b: getfield KillAura$TargetFilter.noj Lha9;
      // 23e: invokevirtual ha9.y5z ()I
      // 241: bipush 5
      // 242: imul
      // 243: i2f
      // 244: fmul
      // 245: fadd
      // 246: fconst_1
      // 247: fsub
      // 248: ldc 10.0
      // 24a: nop
      // 24b: invokestatic java/lang/Math.max (FF)F
      // 24e: fstore 15
      // 250: ldc 10.0
      // 252: nop
      // 253: ldc 34.5
      // 255: nop
      // 256: ldc 25.5
      // 258: nop
      // 259: fload 10
      // 25b: fadd
      // 25c: fconst_2
      // 25d: fsub
      // 25e: ldc 36.5
      // 260: nop
      // 261: getstatic z7e.ret Lz7e;
      // 264: getfield z7e.k0y I
      // 267: ldc 0.35
      // 269: nop
      // 26a: invokestatic hhf.kjo (IF)I
      // 26d: invokestatic hhf.cuu (FFFFI)V
      // 270: ldc 10.0
      // 272: nop
      // 273: ldc 34.5
      // 275: nop
      // 276: fload 15
      // 278: ldc 36.5
      // 27a: nop
      // 27b: ldc -12417291
      // 27d: nop
      // 27e: invokestatic hhf.cuu (FFFFI)V
      // 281: getstatic d3x.jg8 Ld3x;
      // 284: ldc2_w 1.5
      // 287: ldc2_w 1.5
      // 28a: ldc2_w 24.5
      // 28d: ldc2_w 24.5
      // 290: ldc2_w 0.5
      // 293: bipush 0
      // 294: getstatic KillAura.kfa Lg_3;
      // 297: aload 0
      // 298: getfield KillAura$TargetFilter.noj Lha9;
      // 29b: if_acmpne 2ab
      // 29e: getstatic z7e.gwi Lz7e;
      // 2a1: getfield z7e.k0y I
      // 2a4: goto 2ac
      // 2a7: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 2aa: athrow
      // 2ab: bipush -1
      // 2ac: invokevirtual d3x.wof (DDDDDII)V
      // 2af: invokestatic hzu.u49 ()V
      // 2b2: getstatic vg2.kq6 Lcom/google/common/collect/Ordering;
      // 2b5: aload 0
      // 2b6: getfield KillAura$TargetFilter.hgl Lc05;
      // 2b9: invokevirtual Minecraft.c02 ()Lp_k;
      // 2bc: invokevirtual p_k.l0e ()Ljava/util/Collection;
      // 2bf: invokevirtual com/google/common/collect/Ordering.sortedCopy (Ljava/lang/Iterable;)Ljava/util/List;
      // 2c2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2c7: astore 16
      // 2c9: aload 16
      // 2cb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d0: ifeq 39d
      // 2d3: aload 16
      // 2d5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2da: checkcast hv2
      // 2dd: astore 17
      // 2df: iload 5
      // 2e1: ifne 3a0
      // 2e4: aload 0
      // 2e5: getfield KillAura$TargetFilter.hgl Lc05;
      // 2e8: getfield Minecraft.tij Lkh3;
      // 2eb: aload 17
      // 2ed: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 2f0: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 2f3: invokevirtual WorldClient.hlz (Ljava/util/UUID;)Lha9;
      // 2f6: iload 5
      // 2f8: ifne 34b
      // 2fb: goto 302
      // 2fe: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 301: athrow
      // 302: aload 0
      // 303: getfield KillAura$TargetFilter.noj Lha9;
      // 306: if_acmpne 391
      // 309: goto 310
      // 30c: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 30f: athrow
      // 310: aload 0
      // 311: getfield KillAura$TargetFilter.hgl Lc05;
      // 314: invokevirtual Minecraft.l22 ()Llc5;
      // 317: aload 17
      // 319: invokevirtual hv2.dq7 ()Lgdz;
      // 31c: invokevirtual lc5.anl (Lgdz;)V
      // 31f: aload 0
      // 320: getfield KillAura$TargetFilter.j0h Lfyk;
      // 323: fconst_2
      // 324: fconst_2
      // 325: ldc 8.0
      // 327: nop
      // 328: ldc 8.0
      // 32a: nop
      // 32b: ldc 8.0
      // 32d: nop
      // 32e: ldc 8.0
      // 330: nop
      // 331: ldc 22.0
      // 333: nop
      // 334: ldc 22.0
      // 336: nop
      // 337: ldc 64.0
      // 339: nop
      // 33a: ldc 64.0
      // 33c: nop
      // 33d: invokevirtual KillAura.z57 (FFFFFFFFFF)V
      // 340: aload 0
      // 341: getfield KillAura$TargetFilter.noj Lha9;
      // 344: goto 34b
      // 347: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 34a: athrow
      // 34b: getstatic ulc.gn8 Lulc;
      // 34e: invokevirtual ha9.cuw (Lulc;)Z
      // 351: iload 5
      // 353: ifne 389
      // 356: ifeq 388
      // 359: goto 360
      // 35c: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 35f: athrow
      // 360: aload 0
      // 361: getfield KillAura$TargetFilter.j0h Lfyk;
      // 364: fconst_2
      // 365: fconst_2
      // 366: ldc 40.0
      // 368: nop
      // 369: ldc 8.0
      // 36b: nop
      // 36c: ldc 8.0
      // 36e: nop
      // 36f: ldc 8.0
      // 371: nop
      // 372: ldc 22.0
      // 374: nop
      // 375: ldc 22.0
      // 377: nop
      // 378: ldc 64.0
      // 37a: nop
      // 37b: ldc 64.0
      // 37d: nop
      // 37e: invokevirtual KillAura.z57 (FFFFFFFFFF)V
      // 381: goto 388
      // 384: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 387: athrow
      // 388: bipush 0
      // 389: invokestatic hzu.t30 (I)V
      // 38c: iload 5
      // 38e: ifeq 39d
      // 391: iload 5
      // 393: ifeq 2c9
      // 396: goto 39d
      // 399: invokestatic KillAura$TargetFilter.a (Loov;)Loov;
      // 39c: athrow
      // 39d: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 3a0: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3258349813654006444L, 6406803969108597290L, MethodHandles.lookup().lookupClass()).a(80347242556718L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 137854101637364L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("r¿|Ê\u0016\u007f\u008bü1*iº\u009bè\b\u0098".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
