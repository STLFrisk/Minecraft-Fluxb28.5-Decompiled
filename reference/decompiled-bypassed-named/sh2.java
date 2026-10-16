import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class sh2 extends Module {
   private static Map sps;
   private static final long a;
   private static final String f;

   public sh2() {
      long var1 = a ^ 123039959911104L;
      super(f, _aj.sxc, false, new SubEngine[0]);
   }

   @EventHandler(
      jn1 = 4
   )
   public void uw7(b5k var1) {
      hzu.spd();
      GL11.glEnable(2848);
      hzu._o4();
      hzu.m_1();
      hzu.ru7(770, 771);
      GL11.glHint(3154, 4354);
      hzu.jun(false);
      GL11.glDisable(2848);
      sps.keySet().removeIf(sh2::tpo);
      ek1.tij.rpk.forEach(this::cs9);
      hzu.ux6();
      hzu.rqj();
      GL11.glDisable(2848);
      hzu.m45();
      hzu.jun(true);
   }

   public static void y9u(ha9 var0, et8 var1) {
      sps.put(
         var0,
         new float[][]{
            {var1.wtl.pod, var1.wtl.r80, var1.wtl.oo7},
            {var1.xwb.pod, var1.xwb.r80, var1.xwb.oo7},
            {var1.hd2.pod, var1.hd2.r80, var1.hd2.oo7},
            {var1.v3l.pod, var1.v3l.r80, var1.v3l.oo7},
            {var1.zv5.pod, var1.zv5.r80, var1.zv5.oo7}
         }
      );
   }

   public fqr ymh(ha9 var1) {
      float var2 = ek1.gze.au3;
      double var3 = var1.ivp + (var1.o2v - var1.ivp) * (double)var2;
      double var5 = var1.c54 + (var1.kfp - var1.c54) * (double)var2;
      double var7 = var1.e2b + (var1.vbd - var1.e2b) * (double)var2;
      return new fqr(var3, var5, var7);
   }

   private void cs9(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifeq 021
      // 009: getstatic sh2.ek1 Lc05;
      // 00c: getfield Minecraft.vg8 Ll86;
      // 00f: if_acmpeq 032
      // 012: goto 019
      // 015: invokestatic sh2.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 1
      // 01a: goto 021
      // 01d: invokestatic sh2.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 2
      // 022: ifeq 040
      // 025: invokevirtual ha9.h5u ()Z
      // 028: ifeq 037
      // 02b: goto 032
      // 02e: invokestatic sh2.a (Loov;)Loov;
      // 031: athrow
      // 032: return
      // 033: invokestatic sh2.a (Loov;)Loov;
      // 036: athrow
      // 037: getstatic sh2.sps Ljava/util/Map;
      // 03a: aload 1
      // 03b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 040: checkcast [[F
      // 043: astore 3
      // 044: iload 2
      // 045: ifeq 066
      // 048: aload 3
      // 049: ifnonnull 058
      // 04c: goto 053
      // 04f: invokestatic sh2.a (Loov;)Loov;
      // 052: athrow
      // 053: return
      // 054: invokestatic sh2.a (Loov;)Loov;
      // 057: athrow
      // 058: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 05b: fconst_1
      // 05c: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 05f: fconst_1
      // 060: fconst_1
      // 061: fconst_1
      // 062: fconst_1
      // 063: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 066: aload 0
      // 067: aload 1
      // 068: invokevirtual sh2.ymh (Lha9;)Lfqr;
      // 06b: astore 4
      // 06d: aload 4
      // 06f: getfield fqr.lvi D
      // 072: getstatic sh2.ek1 Lc05;
      // 075: invokevirtual Minecraft.ibs ()Lhr_;
      // 078: getfield hr_.uok D
      // 07b: dsub
      // 07c: dstore 5
      // 07e: aload 4
      // 080: getfield fqr.gn5 D
      // 083: getstatic sh2.ek1 Lc05;
      // 086: invokevirtual Minecraft.ibs ()Lhr_;
      // 089: getfield hr_.zmw D
      // 08c: dsub
      // 08d: dstore 7
      // 08f: aload 4
      // 091: getfield fqr.bn2 D
      // 094: getstatic sh2.ek1 Lc05;
      // 097: invokevirtual Minecraft.ibs ()Lhr_;
      // 09a: getfield hr_.klp D
      // 09d: dsub
      // 09e: dstore 9
      // 0a0: dload 5
      // 0a2: dload 7
      // 0a4: dload 9
      // 0a6: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 0a9: aload 1
      // 0aa: getfield ha9.gsh F
      // 0ad: aload 1
      // 0ae: getfield ha9.ksw F
      // 0b1: aload 1
      // 0b2: getfield ha9.gsh F
      // 0b5: fsub
      // 0b6: getstatic sh2.ek1 Lc05;
      // 0b9: getfield Minecraft.gze Laba;
      // 0bc: getfield aba.au3 F
      // 0bf: fmul
      // 0c0: fadd
      // 0c1: fstore 11
      // 0c3: fload 11
      // 0c5: fneg
      // 0c6: fconst_0
      // 0c7: fconst_1
      // 0c8: fconst_0
      // 0c9: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 0cc: dconst_0
      // 0cd: dconst_0
      // 0ce: aload 1
      // 0cf: invokevirtual ha9.hzv ()Z
      // 0d2: ifeq 0df
      // 0d5: ldc2_w -0.235
      // 0d8: goto 0e0
      // 0db: invokestatic sh2.a (Loov;)Loov;
      // 0de: athrow
      // 0df: dconst_0
      // 0e0: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 0e3: aload 1
      // 0e4: invokevirtual ha9.hzv ()Z
      // 0e7: ifeq 0f4
      // 0ea: ldc 0.6
      // 0ec: nop
      // 0ed: goto 0f7
      // 0f0: invokestatic sh2.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: ldc 0.75
      // 0f6: nop
      // 0f7: fstore 12
      // 0f9: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 0fc: ldc2_w -0.125
      // 0ff: fload 12
      // 101: f2d
      // 102: dconst_0
      // 103: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 106: aload 3
      // 107: bipush 3
      // 108: aaload
      // 109: bipush 0
      // 10a: faload
      // 10b: fconst_0
      // 10c: fcmpl
      // 10d: iload 2
      // 10e: ifeq 138
      // 111: ifeq 131
      // 114: goto 11b
      // 117: invokestatic sh2.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 3
      // 11c: bipush 3
      // 11d: aaload
      // 11e: bipush 0
      // 11f: faload
      // 120: ldc 57.295776
      // 122: nop
      // 123: fmul
      // 124: fconst_1
      // 125: fconst_0
      // 126: fconst_0
      // 127: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 12a: goto 131
      // 12d: invokestatic sh2.a (Loov;)Loov;
      // 130: athrow
      // 131: aload 3
      // 132: bipush 3
      // 133: aaload
      // 134: bipush 1
      // 135: faload
      // 136: fconst_0
      // 137: fcmpl
      // 138: iload 2
      // 139: ifeq 163
      // 13c: ifeq 15c
      // 13f: goto 146
      // 142: invokestatic sh2.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 3
      // 147: bipush 3
      // 148: aaload
      // 149: bipush 1
      // 14a: faload
      // 14b: ldc 57.295776
      // 14d: nop
      // 14e: fmul
      // 14f: fconst_0
      // 150: fconst_1
      // 151: fconst_0
      // 152: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 155: goto 15c
      // 158: invokestatic sh2.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 3
      // 15d: bipush 3
      // 15e: aaload
      // 15f: bipush 2
      // 160: faload
      // 161: fconst_0
      // 162: fcmpl
      // 163: iload 2
      // 164: ifeq 1b4
      // 167: ifeq 187
      // 16a: goto 171
      // 16d: invokestatic sh2.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 3
      // 172: bipush 3
      // 173: aaload
      // 174: bipush 2
      // 175: faload
      // 176: ldc 57.295776
      // 178: nop
      // 179: fmul
      // 17a: fconst_0
      // 17b: fconst_0
      // 17c: fconst_1
      // 17d: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 180: goto 187
      // 183: invokestatic sh2.a (Loov;)Loov;
      // 186: athrow
      // 187: bipush 3
      // 188: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 18b: dconst_0
      // 18c: dconst_0
      // 18d: dconst_0
      // 18e: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 191: dconst_0
      // 192: fload 12
      // 194: fneg
      // 195: f2d
      // 196: dconst_0
      // 197: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 19a: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 19d: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 1a0: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 1a3: ldc2_w 0.125
      // 1a6: fload 12
      // 1a8: f2d
      // 1a9: dconst_0
      // 1aa: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 1ad: aload 3
      // 1ae: bipush 4
      // 1af: aaload
      // 1b0: bipush 0
      // 1b1: faload
      // 1b2: fconst_0
      // 1b3: fcmpl
      // 1b4: iload 2
      // 1b5: ifeq 1df
      // 1b8: ifeq 1d8
      // 1bb: goto 1c2
      // 1be: invokestatic sh2.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: aload 3
      // 1c3: bipush 4
      // 1c4: aaload
      // 1c5: bipush 0
      // 1c6: faload
      // 1c7: ldc 57.295776
      // 1c9: nop
      // 1ca: fmul
      // 1cb: fconst_1
      // 1cc: fconst_0
      // 1cd: fconst_0
      // 1ce: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 1d1: goto 1d8
      // 1d4: invokestatic sh2.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: aload 3
      // 1d9: bipush 4
      // 1da: aaload
      // 1db: bipush 1
      // 1dc: faload
      // 1dd: fconst_0
      // 1de: fcmpl
      // 1df: iload 2
      // 1e0: ifeq 20a
      // 1e3: ifeq 203
      // 1e6: goto 1ed
      // 1e9: invokestatic sh2.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: aload 3
      // 1ee: bipush 4
      // 1ef: aaload
      // 1f0: bipush 1
      // 1f1: faload
      // 1f2: ldc 57.295776
      // 1f4: nop
      // 1f5: fmul
      // 1f6: fconst_0
      // 1f7: fconst_1
      // 1f8: fconst_0
      // 1f9: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 1fc: goto 203
      // 1ff: invokestatic sh2.a (Loov;)Loov;
      // 202: athrow
      // 203: aload 3
      // 204: bipush 4
      // 205: aaload
      // 206: bipush 2
      // 207: faload
      // 208: fconst_0
      // 209: fcmpl
      // 20a: iload 2
      // 20b: ifeq 22f
      // 20e: ifeq 22e
      // 211: goto 218
      // 214: invokestatic sh2.a (Loov;)Loov;
      // 217: athrow
      // 218: aload 3
      // 219: bipush 4
      // 21a: aaload
      // 21b: bipush 2
      // 21c: faload
      // 21d: ldc 57.295776
      // 21f: nop
      // 220: fmul
      // 221: fconst_0
      // 222: fconst_0
      // 223: fconst_1
      // 224: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 227: goto 22e
      // 22a: invokestatic sh2.a (Loov;)Loov;
      // 22d: athrow
      // 22e: bipush 3
      // 22f: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 232: dconst_0
      // 233: dconst_0
      // 234: dconst_0
      // 235: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 238: dconst_0
      // 239: fload 12
      // 23b: fneg
      // 23c: f2d
      // 23d: dconst_0
      // 23e: iload 2
      // 23f: ifeq 265
      // 242: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 245: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 248: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 24b: dconst_0
      // 24c: dconst_0
      // 24d: aload 1
      // 24e: invokevirtual ha9.hzv ()Z
      // 251: ifeq 268
      // 254: goto 25b
      // 257: invokestatic sh2.a (Loov;)Loov;
      // 25a: athrow
      // 25b: ldc2_w 0.25
      // 25e: goto 265
      // 261: invokestatic sh2.a (Loov;)Loov;
      // 264: athrow
      // 265: goto 269
      // 268: dconst_0
      // 269: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 26c: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 26f: dconst_0
      // 270: aload 1
      // 271: invokevirtual ha9.hzv ()Z
      // 274: ifeq 281
      // 277: ldc2_w -0.05
      // 27a: goto 282
      // 27d: invokestatic sh2.a (Loov;)Loov;
      // 280: athrow
      // 281: dconst_0
      // 282: aload 1
      // 283: invokevirtual ha9.hzv ()Z
      // 286: ifeq 293
      // 289: ldc2_w -0.01725
      // 28c: goto 294
      // 28f: invokestatic sh2.a (Loov;)Loov;
      // 292: athrow
      // 293: dconst_0
      // 294: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 297: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 29a: ldc2_w -0.375
      // 29d: fload 12
      // 29f: f2d
      // 2a0: ldc2_w 0.55
      // 2a3: dadd
      // 2a4: dconst_0
      // 2a5: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 2a8: aload 3
      // 2a9: bipush 1
      // 2aa: aaload
      // 2ab: bipush 0
      // 2ac: faload
      // 2ad: fconst_0
      // 2ae: fcmpl
      // 2af: iload 2
      // 2b0: ifeq 2da
      // 2b3: ifeq 2d3
      // 2b6: goto 2bd
      // 2b9: invokestatic sh2.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: aload 3
      // 2be: bipush 1
      // 2bf: aaload
      // 2c0: bipush 0
      // 2c1: faload
      // 2c2: ldc 57.295776
      // 2c4: nop
      // 2c5: fmul
      // 2c6: fconst_1
      // 2c7: fconst_0
      // 2c8: fconst_0
      // 2c9: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 2cc: goto 2d3
      // 2cf: invokestatic sh2.a (Loov;)Loov;
      // 2d2: athrow
      // 2d3: aload 3
      // 2d4: bipush 1
      // 2d5: aaload
      // 2d6: bipush 1
      // 2d7: faload
      // 2d8: fconst_0
      // 2d9: fcmpl
      // 2da: iload 2
      // 2db: ifeq 305
      // 2de: ifeq 2fe
      // 2e1: goto 2e8
      // 2e4: invokestatic sh2.a (Loov;)Loov;
      // 2e7: athrow
      // 2e8: aload 3
      // 2e9: bipush 1
      // 2ea: aaload
      // 2eb: bipush 1
      // 2ec: faload
      // 2ed: ldc 57.295776
      // 2ef: nop
      // 2f0: fmul
      // 2f1: fconst_0
      // 2f2: fconst_1
      // 2f3: fconst_0
      // 2f4: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 2f7: goto 2fe
      // 2fa: invokestatic sh2.a (Loov;)Loov;
      // 2fd: athrow
      // 2fe: aload 3
      // 2ff: bipush 1
      // 300: aaload
      // 301: bipush 2
      // 302: faload
      // 303: fconst_0
      // 304: fcmpl
      // 305: iload 2
      // 306: ifeq 35a
      // 309: ifeq 32a
      // 30c: goto 313
      // 30f: invokestatic sh2.a (Loov;)Loov;
      // 312: athrow
      // 313: aload 3
      // 314: bipush 1
      // 315: aaload
      // 316: bipush 2
      // 317: faload
      // 318: fneg
      // 319: ldc 57.295776
      // 31b: nop
      // 31c: fmul
      // 31d: fconst_0
      // 31e: fconst_0
      // 31f: fconst_1
      // 320: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 323: goto 32a
      // 326: invokestatic sh2.a (Loov;)Loov;
      // 329: athrow
      // 32a: bipush 3
      // 32b: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 32e: dconst_0
      // 32f: dconst_0
      // 330: dconst_0
      // 331: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 334: dconst_0
      // 335: ldc2_w -0.5
      // 338: dconst_0
      // 339: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 33c: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 33f: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 342: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 345: ldc2_w 0.375
      // 348: fload 12
      // 34a: f2d
      // 34b: ldc2_w 0.55
      // 34e: dadd
      // 34f: dconst_0
      // 350: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 353: aload 3
      // 354: bipush 2
      // 355: aaload
      // 356: bipush 0
      // 357: faload
      // 358: fconst_0
      // 359: fcmpl
      // 35a: iload 2
      // 35b: ifeq 385
      // 35e: ifeq 37e
      // 361: goto 368
      // 364: invokestatic sh2.a (Loov;)Loov;
      // 367: athrow
      // 368: aload 3
      // 369: bipush 2
      // 36a: aaload
      // 36b: bipush 0
      // 36c: faload
      // 36d: ldc 57.295776
      // 36f: nop
      // 370: fmul
      // 371: fconst_1
      // 372: fconst_0
      // 373: fconst_0
      // 374: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 377: goto 37e
      // 37a: invokestatic sh2.a (Loov;)Loov;
      // 37d: athrow
      // 37e: aload 3
      // 37f: bipush 2
      // 380: aaload
      // 381: bipush 1
      // 382: faload
      // 383: fconst_0
      // 384: fcmpl
      // 385: iload 2
      // 386: ifeq 3b0
      // 389: ifeq 3a9
      // 38c: goto 393
      // 38f: invokestatic sh2.a (Loov;)Loov;
      // 392: athrow
      // 393: aload 3
      // 394: bipush 2
      // 395: aaload
      // 396: bipush 1
      // 397: faload
      // 398: ldc 57.295776
      // 39a: nop
      // 39b: fmul
      // 39c: fconst_0
      // 39d: fconst_1
      // 39e: fconst_0
      // 39f: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 3a2: goto 3a9
      // 3a5: invokestatic sh2.a (Loov;)Loov;
      // 3a8: athrow
      // 3a9: aload 3
      // 3aa: bipush 2
      // 3ab: aaload
      // 3ac: bipush 2
      // 3ad: faload
      // 3ae: fconst_0
      // 3af: fcmpl
      // 3b0: iload 2
      // 3b1: ifeq 410
      // 3b4: ifeq 3d5
      // 3b7: goto 3be
      // 3ba: invokestatic sh2.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: aload 3
      // 3bf: bipush 2
      // 3c0: aaload
      // 3c1: bipush 2
      // 3c2: faload
      // 3c3: fneg
      // 3c4: ldc 57.295776
      // 3c6: nop
      // 3c7: fmul
      // 3c8: fconst_0
      // 3c9: fconst_0
      // 3ca: fconst_1
      // 3cb: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 3ce: goto 3d5
      // 3d1: invokestatic sh2.a (Loov;)Loov;
      // 3d4: athrow
      // 3d5: bipush 3
      // 3d6: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 3d9: dconst_0
      // 3da: dconst_0
      // 3db: dconst_0
      // 3dc: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 3df: dconst_0
      // 3e0: ldc2_w -0.5
      // 3e3: dconst_0
      // 3e4: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 3e7: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 3ea: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 3ed: fload 11
      // 3ef: aload 1
      // 3f0: getfield ha9.q6c F
      // 3f3: fsub
      // 3f4: fconst_0
      // 3f5: fconst_1
      // 3f6: fconst_0
      // 3f7: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 3fa: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 3fd: dconst_0
      // 3fe: fload 12
      // 400: f2d
      // 401: ldc2_w 0.55
      // 404: dadd
      // 405: dconst_0
      // 406: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 409: aload 3
      // 40a: bipush 0
      // 40b: aaload
      // 40c: bipush 0
      // 40d: faload
      // 40e: fconst_0
      // 40f: fcmpl
      // 410: iload 2
      // 411: ifeq 453
      // 414: ifeq 434
      // 417: goto 41e
      // 41a: invokestatic sh2.a (Loov;)Loov;
      // 41d: athrow
      // 41e: aload 3
      // 41f: bipush 0
      // 420: aaload
      // 421: bipush 0
      // 422: faload
      // 423: ldc 57.295776
      // 425: nop
      // 426: fmul
      // 427: fconst_1
      // 428: fconst_0
      // 429: fconst_0
      // 42a: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 42d: goto 434
      // 430: invokestatic sh2.a (Loov;)Loov;
      // 433: athrow
      // 434: bipush 3
      // 435: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 438: dconst_0
      // 439: dconst_0
      // 43a: dconst_0
      // 43b: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 43e: dconst_0
      // 43f: ldc2_w 0.3
      // 442: dconst_0
      // 443: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 446: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 449: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 44c: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 44f: aload 1
      // 450: invokevirtual ha9.hzv ()Z
      // 453: ifeq 460
      // 456: ldc 25.0
      // 458: nop
      // 459: goto 461
      // 45c: invokestatic sh2.a (Loov;)Loov;
      // 45f: athrow
      // 460: fconst_0
      // 461: fconst_1
      // 462: fconst_0
      // 463: fconst_0
      // 464: invokestatic org/lwjgl/opengl/GL11.glRotatef (FFFF)V
      // 467: dconst_0
      // 468: aload 1
      // 469: invokevirtual ha9.hzv ()Z
      // 46c: ifeq 479
      // 46f: ldc2_w -0.16175
      // 472: goto 47a
      // 475: invokestatic sh2.a (Loov;)Loov;
      // 478: athrow
      // 479: dconst_0
      // 47a: aload 1
      // 47b: invokevirtual ha9.hzv ()Z
      // 47e: ifeq 48b
      // 481: ldc2_w -0.48025
      // 484: goto 48c
      // 487: invokestatic sh2.a (Loov;)Loov;
      // 48a: athrow
      // 48b: dconst_0
      // 48c: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 48f: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 492: dconst_0
      // 493: fload 12
      // 495: f2d
      // 496: dconst_0
      // 497: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 49a: bipush 3
      // 49b: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 49e: ldc2_w -0.125
      // 4a1: dconst_0
      // 4a2: dconst_0
      // 4a3: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 4a6: ldc2_w 0.125
      // 4a9: dconst_0
      // 4aa: dconst_0
      // 4ab: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 4ae: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 4b1: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 4b4: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 4b7: dconst_0
      // 4b8: fload 12
      // 4ba: f2d
      // 4bb: dconst_0
      // 4bc: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 4bf: bipush 3
      // 4c0: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 4c3: dconst_0
      // 4c4: dconst_0
      // 4c5: dconst_0
      // 4c6: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 4c9: dconst_0
      // 4ca: ldc2_w 0.55
      // 4cd: dconst_0
      // 4ce: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 4d1: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 4d4: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 4d7: invokestatic org/lwjgl/opengl/GL11.glPushMatrix ()V
      // 4da: dconst_0
      // 4db: fload 12
      // 4dd: f2d
      // 4de: ldc2_w 0.55
      // 4e1: dadd
      // 4e2: dconst_0
      // 4e3: invokestatic org/lwjgl/opengl/GL11.glTranslated (DDD)V
      // 4e6: bipush 3
      // 4e7: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 4ea: ldc2_w -0.375
      // 4ed: dconst_0
      // 4ee: dconst_0
      // 4ef: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 4f2: ldc2_w 0.375
      // 4f5: dconst_0
      // 4f6: dconst_0
      // 4f7: invokestatic org/lwjgl/opengl/GL11.glVertex3d (DDD)V
      // 4fa: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 4fd: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 500: invokestatic org/lwjgl/opengl/GL11.glPopMatrix ()V
      // 503: return
   }

   private static boolean tpo(ha9 var0) {
      int var1 = OpaquePredicate.c();

      try {
         boolean var10000 = ek1.tij.rpk.contains(var0);
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6442706455722380006L, -2534198280343750406L, MethodHandles.lookup().lookupClass()).a(134368869293896L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 42373099689130L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Í¤ç¢*#\u0095zäËÙ\u0093,<Eo".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
      sps = new HashMap();
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
}
