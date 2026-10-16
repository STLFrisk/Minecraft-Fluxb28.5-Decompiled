import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class gmu extends liu {
   private static final Logger b9g;
   private static final p9u zne;
   public g6r m5v;
   public FloatBuffer nsv = nkx.dyc(4);
   public List vcp = Lists.newArrayList();
   public boolean cqn = false;
   public static float g7f;
   public static float j2t;
   public Entity cwp;
   public float zl3;
   public float c_4;
   public float sa1;
   public float pul;
   public float at4;
   public float you;
   public float aqb;
   private boolean tci;
   private boolean tfc;
   public static final boolean d4t;
   private static final long a;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public gmu(hr_ var1, g6r var2, float var3) {
      super(var1);
      this.m5v = var2;
      this.o2u = var3;
      this.tci = this.m5v instanceof s04;
   }

   public boolean d4f(gnj var1) {
      return this.vcp.add(var1);
   }

   public boolean t72(gnj var1) {
      return this.vcp.remove(var1);
   }

   public g6r fy4() {
      return this.m5v;
   }

   public float mhs(float var1, float var2, float var3) {
      int var4 = OpaquePredicate.c();
      float var5 = var2 - var1;

      while (var5 < -180.0F) {
         var5 += 360.0F;

         try {
            if (var4 != 0) {
               return var1 + var3 * var5;
            }

            if (var4 != 0) {
               break;
            }
         } catch (oov var6) {
            throw a(var6);
         }
      }

      while (var5 >= 180.0F) {
         float var10000 = var5 - 360.0F;
         if (var4 != 0) {
            return var10000;
         }

         var5 = var10000;
         if (var4 != 0) {
            return var1 + var3 * var5;
         }
      }

      return var1 + var3 * var5;
   }

   public void odh() {
   }

   public void l1o(Entity param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic gmu.a J
      // 003: ldc2_w 140433905253793
      // 006: lxor
      // 007: lstore 10
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 12
      // 00e: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Pre_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 011: invokevirtual net/optifine/reflect/ReflectorConstructor.exists ()Z
      // 014: iload 12
      // 016: ifeq 065
      // 019: ifeq 062
      // 01c: goto 023
      // 01f: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Pre_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 026: bipush 5
      // 027: anewarray 146
      // 02a: dup
      // 02b: bipush 0
      // 02c: aload 1
      // 02d: aastore
      // 02e: dup
      // 02f: bipush 1
      // 030: aload 0
      // 031: aastore
      // 032: dup
      // 033: bipush 2
      // 034: dload 2
      // 035: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 038: aastore
      // 039: dup
      // 03a: bipush 3
      // 03b: dload 4
      // 03d: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 040: aastore
      // 041: dup
      // 042: bipush 4
      // 043: dload 6
      // 045: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 048: aastore
      // 049: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Z
      // 04c: iload 12
      // 04e: ifeq 065
      // 051: goto 058
      // 054: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: ifne 6f2
      // 05b: goto 062
      // 05e: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: getstatic gmu.d4t Z
      // 065: iload 12
      // 067: ifeq 0b1
      // 06a: ifeq 080
      // 06d: goto 074
      // 070: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 1
      // 075: fconst_1
      // 076: putfield Entity.zzf F
      // 079: goto 080
      // 07c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: invokestatic hzu.dp2 ()V
      // 083: invokestatic hzu.o1b ()V
      // 086: aload 0
      // 087: getfield gmu.m5v Lg6r;
      // 08a: aload 0
      // 08b: aload 1
      // 08c: fload 9
      // 08e: invokevirtual gmu.tyj (Lg_3;F)F
      // 091: putfield g6r._5e F
      // 094: aload 0
      // 095: getfield gmu.m5v Lg6r;
      // 098: aload 1
      // 099: invokevirtual Entity.i0e ()Z
      // 09c: putfield g6r.ete Z
      // 09f: iload 12
      // 0a1: ifeq 123
      // 0a4: getstatic net/optifine/reflect/Reflector.ForgeEntity_shouldRiderSit Lnet/optifine/reflect/ReflectorMethod;
      // 0a7: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0aa: goto 0b1
      // 0ad: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b0: athrow
      // 0b1: ifeq 118
      // 0b4: aload 0
      // 0b5: getfield gmu.m5v Lg6r;
      // 0b8: aload 1
      // 0b9: iload 12
      // 0bb: ifeq 0dd
      // 0be: goto 0c5
      // 0c1: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: invokevirtual Entity.i0e ()Z
      // 0c8: ifeq 114
      // 0cb: goto 0d2
      // 0ce: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: aload 1
      // 0d3: getfield Entity.hzp Li2h;
      // 0d6: goto 0dd
      // 0d9: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: iload 12
      // 0df: ifeq 0f7
      // 0e2: ifnull 114
      // 0e5: goto 0ec
      // 0e8: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: aload 1
      // 0ed: getfield Entity.hzp Li2h;
      // 0f0: goto 0f7
      // 0f3: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: getstatic net/optifine/reflect/Reflector.ForgeEntity_shouldRiderSit Lnet/optifine/reflect/ReflectorMethod;
      // 0fa: bipush 0
      // 0fb: anewarray 146
      // 0fe: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 101: iload 12
      // 103: ifeq 111
      // 106: ifeq 114
      // 109: goto 110
      // 10c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 115
      // 114: bipush 0
      // 115: putfield g6r.ete Z
      // 118: aload 0
      // 119: getfield gmu.m5v Lg6r;
      // 11c: aload 1
      // 11d: invokevirtual Entity.ejl ()Z
      // 120: putfield g6r._a0 Z
      // 123: aload 0
      // 124: aload 1
      // 125: getfield Entity.gsh F
      // 128: aload 1
      // 129: getfield Entity.ksw F
      // 12c: fload 9
      // 12e: invokevirtual gmu.mhs (FFF)F
      // 131: fstore 13
      // 133: aload 0
      // 134: aload 1
      // 135: getfield Entity.h82 F
      // 138: aload 1
      // 139: getfield Entity.q6c F
      // 13c: fload 9
      // 13e: invokevirtual gmu.mhs (FFF)F
      // 141: fstore 14
      // 143: fload 14
      // 145: fload 13
      // 147: fsub
      // 148: fstore 15
      // 14a: aload 0
      // 14b: getfield gmu.m5v Lg6r;
      // 14e: getfield g6r.ete Z
      // 151: iload 12
      // 153: ifeq 17a
      // 156: ifeq 20b
      // 159: goto 160
      // 15c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: aload 1
      // 161: iload 12
      // 163: ifeq 20c
      // 166: goto 16d
      // 169: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: getfield Entity.hzp Li2h;
      // 170: instanceof Entity
      // 173: goto 17a
      // 176: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 179: athrow
      // 17a: ifeq 20b
      // 17d: aload 1
      // 17e: getfield Entity.hzp Li2h;
      // 181: checkcast Entity
      // 184: astore 16
      // 186: aload 0
      // 187: aload 16
      // 189: getfield Entity.gsh F
      // 18c: aload 16
      // 18e: getfield Entity.ksw F
      // 191: fload 9
      // 193: invokevirtual gmu.mhs (FFF)F
      // 196: fstore 13
      // 198: fload 14
      // 19a: fload 13
      // 19c: fsub
      // 19d: fstore 15
      // 19f: fload 15
      // 1a1: invokestatic fe6.qsy (F)F
      // 1a4: fstore 17
      // 1a6: fload 17
      // 1a8: ldc -85.0
      // 1aa: nop
      // 1ab: fcmpg
      // 1ac: iload 12
      // 1ae: ifeq 1c6
      // 1b1: ifge 1c0
      // 1b4: goto 1bb
      // 1b7: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: ldc -85.0
      // 1bd: nop
      // 1be: fstore 17
      // 1c0: fload 17
      // 1c2: ldc 85.0
      // 1c4: nop
      // 1c5: fcmpl
      // 1c6: iload 12
      // 1c8: ifeq 1f6
      // 1cb: iflt 1da
      // 1ce: goto 1d5
      // 1d1: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: ldc 85.0
      // 1d7: nop
      // 1d8: fstore 17
      // 1da: fload 14
      // 1dc: fload 17
      // 1de: fsub
      // 1df: fstore 13
      // 1e1: fload 17
      // 1e3: fload 17
      // 1e5: fmul
      // 1e6: ldc 2500.0
      // 1e8: nop
      // 1e9: iload 12
      // 1eb: ifeq 208
      // 1ee: fcmpl
      // 1ef: goto 1f6
      // 1f2: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f5: athrow
      // 1f6: ifle 204
      // 1f9: fload 13
      // 1fb: fload 17
      // 1fd: ldc 0.2
      // 1ff: nop
      // 200: fmul
      // 201: fadd
      // 202: fstore 13
      // 204: fload 14
      // 206: fload 13
      // 208: fsub
      // 209: fstore 15
      // 20b: aload 1
      // 20c: getfield Entity.j25 F
      // 20f: aload 1
      // 210: getfield Entity.y2i F
      // 213: aload 1
      // 214: getfield Entity.j25 F
      // 217: fsub
      // 218: fload 9
      // 21a: fmul
      // 21b: fadd
      // 21c: fstore 16
      // 21e: new oc6
      // 221: dup
      // 222: aload 1
      // 223: fload 13
      // 225: fload 14
      // 227: fload 15
      // 229: fload 16
      // 22b: fload 9
      // 22d: invokespecial oc6.<init> (Lg_3;FFFFF)V
      // 230: astore 17
      // 232: aload 17
      // 234: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 237: pop
      // 238: aload 17
      // 23a: invokevirtual oc6.zl3 ()F
      // 23d: fstore 13
      // 23f: aload 17
      // 241: invokevirtual oc6.b52 ()F
      // 244: fstore 14
      // 246: aload 17
      // 248: invokevirtual oc6.ans ()F
      // 24b: fstore 15
      // 24d: aload 17
      // 24f: invokevirtual oc6.c5i ()F
      // 252: fstore 16
      // 254: aload 0
      // 255: aload 1
      // 256: dload 2
      // 257: dload 4
      // 259: dload 6
      // 25b: invokevirtual gmu.y5w (Lg_3;DDD)V
      // 25e: aload 0
      // 25f: aload 1
      // 260: fload 9
      // 262: invokevirtual gmu.xwp (Lg_3;F)F
      // 265: fstore 18
      // 267: aload 0
      // 268: aload 1
      // 269: fload 18
      // 26b: fload 13
      // 26d: fload 9
      // 26f: invokevirtual gmu.ur9 (Lg_3;FFF)V
      // 272: invokestatic hzu.ixc ()V
      // 275: ldc -1.0
      // 277: nop
      // 278: ldc -1.0
      // 27a: nop
      // 27b: fconst_1
      // 27c: invokestatic hzu.syc (FFF)V
      // 27f: aload 0
      // 280: aload 1
      // 281: fload 9
      // 283: invokevirtual gmu.e2w (Lg_3;F)V
      // 286: ldc 0.0625
      // 288: nop
      // 289: fstore 19
      // 28b: fconst_0
      // 28c: ldc -1.5078125
      // 28e: nop
      // 28f: fconst_0
      // 290: invokestatic hzu.a4k (FFF)V
      // 293: aload 1
      // 294: getfield Entity.p1w F
      // 297: aload 1
      // 298: getfield Entity.zzf F
      // 29b: aload 1
      // 29c: getfield Entity.p1w F
      // 29f: fsub
      // 2a0: fload 9
      // 2a2: fmul
      // 2a3: fadd
      // 2a4: fstore 20
      // 2a6: aload 1
      // 2a7: getfield Entity.pcb F
      // 2aa: aload 1
      // 2ab: getfield Entity.zzf F
      // 2ae: fconst_1
      // 2af: fload 9
      // 2b1: fsub
      // 2b2: fmul
      // 2b3: fsub
      // 2b4: fstore 21
      // 2b6: aload 1
      // 2b7: instanceof ha9
      // 2ba: iload 12
      // 2bc: ifeq 304
      // 2bf: ifeq 300
      // 2c2: goto 2c9
      // 2c5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c8: athrow
      // 2c9: new dxp
      // 2cc: dup
      // 2cd: aload 1
      // 2ce: getstatic o3g.hac Lo3g;
      // 2d1: fload 21
      // 2d3: fload 20
      // 2d5: fload 18
      // 2d7: fload 15
      // 2d9: fload 16
      // 2db: fload 13
      // 2dd: ldc 0.0625
      // 2df: nop
      // 2e0: invokespecial dxp.<init> (Lg_3;Lo3g;FFFFFFF)V
      // 2e3: astore 22
      // 2e5: aload 22
      // 2e7: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 2ea: pop
      // 2eb: aload 22
      // 2ed: invokevirtual dxp.elp ()Z
      // 2f0: iload 12
      // 2f2: ifeq 304
      // 2f5: ifeq 300
      // 2f8: goto 2ff
      // 2fb: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fe: athrow
      // 2ff: return
      // 300: aload 1
      // 301: invokevirtual Entity.ejl ()Z
      // 304: iload 12
      // 306: ifeq 31f
      // 309: ifeq 31b
      // 30c: goto 313
      // 30f: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 312: athrow
      // 313: fload 21
      // 315: ldc 3.0
      // 317: nop
      // 318: fmul
      // 319: fstore 21
      // 31b: fload 20
      // 31d: fconst_1
      // 31e: fcmpl
      // 31f: iload 12
      // 321: ifeq 35a
      // 324: ifle 331
      // 327: goto 32e
      // 32a: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32d: athrow
      // 32e: fconst_1
      // 32f: fstore 20
      // 331: invokestatic hzu.if9 ()V
      // 334: aload 0
      // 335: getfield gmu.m5v Lg6r;
      // 338: aload 1
      // 339: fload 21
      // 33b: fload 20
      // 33d: fload 9
      // 33f: invokevirtual g6r.v3g (Lg_3;FFF)V
      // 342: aload 0
      // 343: getfield gmu.m5v Lg6r;
      // 346: fload 21
      // 348: fload 20
      // 34a: fload 18
      // 34c: fload 15
      // 34e: fload 16
      // 350: ldc 0.0625
      // 352: nop
      // 353: aload 1
      // 354: invokevirtual g6r.ltd (FFFFFFLi2h;)V
      // 357: invokestatic net/optifine/entity/model/CustomEntityModels.isActive ()Z
      // 35a: iload 12
      // 35c: ifeq 3a3
      // 35f: ifeq 39f
      // 362: goto 369
      // 365: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: aload 0
      // 36a: aload 1
      // 36b: putfield gmu.cwp Lg_3;
      // 36e: aload 0
      // 36f: fload 21
      // 371: putfield gmu.zl3 F
      // 374: aload 0
      // 375: fload 20
      // 377: putfield gmu.c_4 F
      // 37a: aload 0
      // 37b: fload 18
      // 37d: putfield gmu.sa1 F
      // 380: aload 0
      // 381: fload 15
      // 383: putfield gmu.pul F
      // 386: aload 0
      // 387: fload 16
      // 389: putfield gmu.at4 F
      // 38c: aload 0
      // 38d: fload 19
      // 38f: putfield gmu.you F
      // 392: aload 0
      // 393: fload 9
      // 395: putfield gmu.aqb F
      // 398: goto 39f
      // 39b: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39e: athrow
      // 39f: aload 0
      // 3a0: getfield gmu.cqn Z
      // 3a3: iload 12
      // 3a5: ifeq 3fa
      // 3a8: ifeq 3ec
      // 3ab: goto 3b2
      // 3ae: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b1: athrow
      // 3b2: aload 0
      // 3b3: aload 1
      // 3b4: invokevirtual gmu.h71 (Lg_3;)Z
      // 3b7: istore 22
      // 3b9: aload 0
      // 3ba: iload 12
      // 3bc: ifeq 3e4
      // 3bf: aload 1
      // 3c0: fload 21
      // 3c2: fload 20
      // 3c4: fload 18
      // 3c6: fload 15
      // 3c8: fload 16
      // 3ca: ldc 0.0625
      // 3cc: nop
      // 3cd: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 3d0: iload 22
      // 3d2: ifeq 3e7
      // 3d5: goto 3dc
      // 3d8: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3db: athrow
      // 3dc: aload 0
      // 3dd: goto 3e4
      // 3e0: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e3: athrow
      // 3e4: invokevirtual gmu.xaz ()V
      // 3e7: iload 12
      // 3e9: ifne 629
      // 3ec: aload 0
      // 3ed: aload 1
      // 3ee: fload 9
      // 3f0: invokevirtual gmu._67 (Lg_3;F)Z
      // 3f3: goto 3fa
      // 3f6: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f9: athrow
      // 3fa: istore 22
      // 3fc: getstatic ModuleRegistry.oh2 Ly3e;
      // 3ff: invokevirtual y3e.klu ()Z
      // 402: iload 12
      // 404: ifeq 523
      // 407: ifeq 519
      // 40a: goto 411
      // 40d: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 410: athrow
      // 411: getstatic y3e.bzb Lcn7;
      // 414: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 417: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 41a: iload 12
      // 41c: ifeq 523
      // 41f: goto 426
      // 422: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 425: athrow
      // 426: ifeq 519
      // 429: goto 430
      // 42c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42f: athrow
      // 430: aload 1
      // 431: invokestatic y3e.ml_ (Lg_3;)Z
      // 434: iload 12
      // 436: ifeq 523
      // 439: goto 440
      // 43c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43f: athrow
      // 440: ifeq 519
      // 443: goto 44a
      // 446: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 449: athrow
      // 44a: aload 0
      // 44b: aload 1
      // 44c: fload 21
      // 44e: fload 20
      // 450: fload 18
      // 452: fload 15
      // 454: fload 16
      // 456: ldc 0.0625
      // 458: nop
      // 459: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 45c: invokestatic iyr.itn ()V
      // 45f: aload 0
      // 460: aload 1
      // 461: fload 21
      // 463: fload 20
      // 465: fload 18
      // 467: fload 15
      // 469: fload 16
      // 46b: ldc 0.0625
      // 46d: nop
      // 46e: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 471: invokestatic iyr.e3_ ()V
      // 474: aload 0
      // 475: aload 1
      // 476: fload 21
      // 478: fload 20
      // 47a: fload 18
      // 47c: fload 15
      // 47e: fload 16
      // 480: ldc 0.0625
      // 482: nop
      // 483: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 486: invokestatic iyr.xby ()V
      // 489: aload 1
      // 48a: invokestatic iyr.jyz (Lg_3;)V
      // 48d: aload 0
      // 48e: aload 1
      // 48f: fload 21
      // 491: fload 20
      // 493: fload 18
      // 495: fload 15
      // 497: fload 16
      // 499: ldc 0.0625
      // 49b: nop
      // 49c: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 49f: invokestatic iyr._nz ()V
      // 4a2: iload 22
      // 4a4: iload 12
      // 4a6: ifeq 4d9
      // 4a9: goto 4b0
      // 4ac: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4af: athrow
      // 4b0: ifeq 4c5
      // 4b3: goto 4ba
      // 4b6: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b9: athrow
      // 4ba: aload 0
      // 4bb: invokevirtual gmu.vus ()V
      // 4be: goto 4c5
      // 4c1: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c4: athrow
      // 4c5: bipush 1
      // 4c6: invokestatic hzu.jun (Z)V
      // 4c9: iload 12
      // 4cb: ifeq 514
      // 4ce: aload 1
      // 4cf: instanceof ha9
      // 4d2: goto 4d9
      // 4d5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d8: athrow
      // 4d9: ifeq 4f9
      // 4dc: aload 1
      // 4dd: checkcast ha9
      // 4e0: invokevirtual ha9.myu ()Z
      // 4e3: iload 12
      // 4e5: ifeq 62c
      // 4e8: goto 4ef
      // 4eb: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ee: athrow
      // 4ef: ifne 629
      // 4f2: goto 4f9
      // 4f5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f8: athrow
      // 4f9: aload 0
      // 4fa: aload 1
      // 4fb: fload 21
      // 4fd: fload 20
      // 4ff: fload 9
      // 501: fload 18
      // 503: fload 15
      // 505: fload 16
      // 507: ldc 0.0625
      // 509: nop
      // 50a: invokevirtual gmu.x50 (Lg_3;FFFFFFF)V
      // 50d: goto 514
      // 510: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 513: athrow
      // 514: iload 12
      // 516: ifne 629
      // 519: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 51c: goto 523
      // 51f: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 522: athrow
      // 523: iload 12
      // 525: ifeq 539
      // 528: ifeq 535
      // 52b: goto 532
      // 52e: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 531: athrow
      // 532: invokestatic net/optifine/EmissiveTextures.beginRender ()V
      // 535: aload 0
      // 536: getfield gmu.tci Z
      // 539: iload 12
      // 53b: ifeq 561
      // 53e: ifeq 54b
      // 541: goto 548
      // 544: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 547: athrow
      // 548: invokestatic hzu.dp2 ()V
      // 54b: aload 0
      // 54c: aload 1
      // 54d: fload 21
      // 54f: fload 20
      // 551: fload 18
      // 553: fload 15
      // 555: fload 16
      // 557: ldc 0.0625
      // 559: nop
      // 55a: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 55d: aload 0
      // 55e: getfield gmu.tci Z
      // 561: iload 12
      // 563: ifeq 576
      // 566: ifeq 573
      // 569: goto 570
      // 56c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56f: athrow
      // 570: invokestatic hzu.x3w ()V
      // 573: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 576: iload 12
      // 578: ifeq 5c0
      // 57b: ifeq 5be
      // 57e: goto 585
      // 581: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 584: athrow
      // 585: invokestatic net/optifine/EmissiveTextures.hasEmissive ()Z
      // 588: ifeq 5bb
      // 58b: goto 592
      // 58e: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 591: athrow
      // 592: aload 0
      // 593: bipush 1
      // 594: putfield gmu.tci Z
      // 597: invokestatic net/optifine/EmissiveTextures.beginRenderEmissive ()V
      // 59a: invokestatic hzu.dp2 ()V
      // 59d: aload 0
      // 59e: aload 1
      // 59f: fload 21
      // 5a1: fload 20
      // 5a3: fload 18
      // 5a5: fload 15
      // 5a7: fload 16
      // 5a9: fload 19
      // 5ab: invokevirtual gmu.o7f (Lg_3;FFFFFF)V
      // 5ae: invokestatic hzu.x3w ()V
      // 5b1: invokestatic net/optifine/EmissiveTextures.endRenderEmissive ()V
      // 5b4: goto 5bb
      // 5b7: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ba: athrow
      // 5bb: invokestatic net/optifine/EmissiveTextures.endRender ()V
      // 5be: iload 22
      // 5c0: iload 12
      // 5c2: ifeq 5e2
      // 5c5: ifeq 5da
      // 5c8: goto 5cf
      // 5cb: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ce: athrow
      // 5cf: aload 0
      // 5d0: invokevirtual gmu.vus ()V
      // 5d3: goto 5da
      // 5d6: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d9: athrow
      // 5da: bipush 1
      // 5db: invokestatic hzu.jun (Z)V
      // 5de: aload 1
      // 5df: instanceof ha9
      // 5e2: iload 12
      // 5e4: ifeq 5ff
      // 5e7: ifeq 60e
      // 5ea: goto 5f1
      // 5ed: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f0: athrow
      // 5f1: aload 1
      // 5f2: checkcast ha9
      // 5f5: invokevirtual ha9.myu ()Z
      // 5f8: goto 5ff
      // 5fb: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5fe: athrow
      // 5ff: iload 12
      // 601: ifeq 62c
      // 604: ifne 629
      // 607: goto 60e
      // 60a: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60d: athrow
      // 60e: aload 0
      // 60f: aload 1
      // 610: fload 21
      // 612: fload 20
      // 614: fload 9
      // 616: fload 18
      // 618: fload 15
      // 61a: fload 16
      // 61c: ldc 0.0625
      // 61e: nop
      // 61f: invokevirtual gmu.x50 (Lg_3;FFFFFFF)V
      // 622: goto 629
      // 625: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 628: athrow
      // 629: invokestatic net/optifine/entity/model/CustomEntityModels.isActive ()Z
      // 62c: ifeq 63b
      // 62f: aload 0
      // 630: aconst_null
      // 631: putfield gmu.cwp Lg_3;
      // 634: goto 63b
      // 637: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63a: athrow
      // 63b: invokestatic hzu.eiq ()V
      // 63e: goto 65c
      // 641: astore 13
      // 643: getstatic gmu.b9g Lorg/apache/logging/log4j/Logger;
      // 646: sipush 11669
      // 649: ldc2_w 3481918097387551794
      // 64c: lload 10
      // 64e: lxor
      // 64f: invokedynamic p (IJ)Ljava/lang/String; bsm=gmu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 654: nop
      // 655: aload 13
      // 657: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 65c: getstatic gis.exn I
      // 65f: invokestatic hzu.qon (I)V
      // 662: invokestatic hzu.rqj ()V
      // 665: getstatic gis.z1w I
      // 668: invokestatic hzu.qon (I)V
      // 66b: invokestatic hzu.gp4 ()V
      // 66e: invokestatic hzu.x3w ()V
      // 671: aload 0
      // 672: iload 12
      // 674: ifeq 68c
      // 677: getfield gmu.cqn Z
      // 67a: ifne 699
      // 67d: goto 684
      // 680: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 683: athrow
      // 684: aload 0
      // 685: goto 68c
      // 688: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68b: athrow
      // 68c: aload 1
      // 68d: dload 2
      // 68e: dload 4
      // 690: dload 6
      // 692: fload 8
      // 694: fload 9
      // 696: invokespecial liu.apl (Li2h;DDDFF)V
      // 699: new dxp
      // 69c: dup
      // 69d: aload 1
      // 69e: getstatic o3g.ga7 Lo3g;
      // 6a1: invokespecial dxp.<init> (Lg_3;Lo3g;)V
      // 6a4: astore 13
      // 6a6: aload 13
      // 6a8: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 6ab: pop
      // 6ac: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Post_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 6af: invokevirtual net/optifine/reflect/ReflectorConstructor.exists ()Z
      // 6b2: iload 12
      // 6b4: ifeq 6f1
      // 6b7: ifeq 6f2
      // 6ba: goto 6c1
      // 6bd: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c0: athrow
      // 6c1: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Post_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 6c4: bipush 5
      // 6c5: anewarray 146
      // 6c8: dup
      // 6c9: bipush 0
      // 6ca: aload 1
      // 6cb: aastore
      // 6cc: dup
      // 6cd: bipush 1
      // 6ce: aload 0
      // 6cf: aastore
      // 6d0: dup
      // 6d1: bipush 2
      // 6d2: dload 2
      // 6d3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 6d6: aastore
      // 6d7: dup
      // 6d8: bipush 3
      // 6d9: dload 4
      // 6db: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 6de: aastore
      // 6df: dup
      // 6e0: bipush 4
      // 6e1: dload 6
      // 6e3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 6e6: aastore
      // 6e7: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Z
      // 6ea: goto 6f1
      // 6ed: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f0: athrow
      // 6f1: pop
      // 6f2: return
   }

   public boolean h71(Entity var1) {
      int var2 = OpaquePredicate.c();
      int var3 = 16777215;

      int var10000;
      label53: {
         short var10001;
         label52: {
            label57: {
               try {
                  var10000 = var1 instanceof ha9;
                  if (var2 != 0) {
                     break label53;
                  }

                  if (var10000 == 0) {
                     break label57;
                  }
               } catch (oov var9) {
                  throw a(var9);
               }

               q2m var4 = (q2m)var1.ued();

               label44: {
                  try {
                     var12 = var4;
                     if (var2 != 0) {
                        break label44;
                     }

                     if (var4 == null) {
                        break label57;
                     }
                  } catch (oov var8) {
                     throw a(var8);
                  }

                  var12 = var4;
               }

               String var5 = owt.pkg(var12.wyj());

               try {
                  var10000 = var5.length();
                  var10001 = 2;
                  if (var2 != 0) {
                     break label52;
                  }

                  if (var10000 < 2) {
                     break label57;
                  }
               } catch (oov var7) {
                  throw a(var7);
               }

               var3 = this.r3f().squ(var5.charAt(1));
            }

            var10000 = var3 >> 16;
            var10001 = 255;
         }

         var10000 &= var10001;
      }

      float var10 = (float)var10000 / 255.0F;
      float var11 = (float)(var3 >> 8 & 0xFF) / 255.0F;
      float var6 = (float)(var3 & 0xFF) / 255.0F;
      hzu.fpt();
      hzu.qon(gis.z1w);
      hzu.wn0(var10, var11, var6, 1.0F);
      hzu.m_1();
      hzu.qon(gis.exn);
      hzu.m_1();
      hzu.qon(gis.z1w);
      return true;
   }

   public void xaz() {
      hzu.s7q();
      hzu.qon(gis.z1w);
      hzu.rqj();
      hzu.qon(gis.exn);
      hzu.rqj();
      hzu.qon(gis.z1w);
   }

   public void o7f(Entity param1, float param2, float param3, float param4, float param5, float param6, float param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 8
      // 005: aload 1
      // 006: invokevirtual Entity.h5u ()Z
      // 009: iload 8
      // 00b: ifne 019
      // 00e: ifne 01c
      // 011: goto 018
      // 014: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 017: athrow
      // 018: bipush 1
      // 019: goto 01d
      // 01c: bipush 0
      // 01d: istore 9
      // 01f: iload 9
      // 021: iload 8
      // 023: ifne 041
      // 026: ifne 054
      // 029: goto 030
      // 02c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aload 1
      // 031: invokestatic Minecraft.vz1 ()Lc05;
      // 034: getfield Minecraft.vg8 Ll86;
      // 037: invokevirtual Entity.fiy (Lha9;)Z
      // 03a: goto 041
      // 03d: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: iload 8
      // 043: ifne 051
      // 046: ifne 054
      // 049: goto 050
      // 04c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04f: athrow
      // 050: bipush 1
      // 051: goto 055
      // 054: bipush 0
      // 055: istore 10
      // 057: iload 9
      // 059: iload 8
      // 05b: ifne 0a8
      // 05e: ifne 09c
      // 061: goto 068
      // 064: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: iload 10
      // 06a: iload 8
      // 06c: ifne 0a8
      // 06f: goto 076
      // 072: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: ifne 09c
      // 079: goto 080
      // 07c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: getstatic ModuleRegistry.crm Lhx2;
      // 083: invokevirtual hx2.klu ()Z
      // 086: iload 8
      // 088: ifne 0a8
      // 08b: goto 092
      // 08e: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: ifeq 207
      // 095: goto 09c
      // 098: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 0
      // 09d: aload 1
      // 09e: invokevirtual gmu.sat (Li2h;)Z
      // 0a1: goto 0a8
      // 0a4: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: iload 8
      // 0aa: ifne 0ba
      // 0ad: ifne 0b8
      // 0b0: goto 0b7
      // 0b3: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b6: athrow
      // 0b7: return
      // 0b8: iload 10
      // 0ba: iload 8
      // 0bc: ifne 10f
      // 0bf: ifne 104
      // 0c2: goto 0c9
      // 0c5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: getstatic ModuleRegistry.crm Lhx2;
      // 0cc: invokevirtual hx2.klu ()Z
      // 0cf: iload 8
      // 0d1: ifne 1a3
      // 0d4: goto 0db
      // 0d7: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: ifeq 18f
      // 0de: goto 0e5
      // 0e1: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: getstatic hx2.nqg Lcn7;
      // 0e8: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0eb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ee: iload 8
      // 0f0: ifne 1a3
      // 0f3: goto 0fa
      // 0f6: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: ifeq 18f
      // 0fd: goto 104
      // 100: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 103: athrow
      // 104: aload 1
      // 105: invokevirtual Entity.h5u ()Z
      // 108: goto 10f
      // 10b: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: iload 8
      // 111: ifne 154
      // 114: ifeq 185
      // 117: goto 11e
      // 11a: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: invokestatic hzu.dp2 ()V
      // 121: fconst_1
      // 122: fconst_1
      // 123: fconst_1
      // 124: getstatic ModuleRegistry.crm Lhx2;
      // 127: pop
      // 128: getstatic hx2.ukt Lcrk;
      // 12b: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 12e: invokevirtual java/lang/Float.floatValue ()F
      // 131: ldc 100.0
      // 133: nop
      // 134: fdiv
      // 135: invokestatic hzu.wn0 (FFFF)V
      // 138: getstatic ModuleRegistry.crm Lhx2;
      // 13b: pop
      // 13c: getstatic hx2.ukt Lcrk;
      // 13f: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 142: invokevirtual java/lang/Float.floatValue ()F
      // 145: ldc 100.0
      // 147: nop
      // 148: fdiv
      // 149: ldc 0.75
      // 14b: nop
      // 14c: fcmpl
      // 14d: goto 154
      // 150: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 153: athrow
      // 154: iload 8
      // 156: ifne 164
      // 159: iflt 167
      // 15c: goto 163
      // 15f: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: bipush 1
      // 164: goto 168
      // 167: bipush 0
      // 168: invokestatic hzu.jun (Z)V
      // 16b: invokestatic hzu.spd ()V
      // 16e: sipush 770
      // 171: sipush 771
      // 174: invokestatic hzu.ru7 (II)V
      // 177: sipush 516
      // 17a: ldc 0.003921569
      // 17c: nop
      // 17d: invokestatic hzu.fak (IF)V
      // 180: iload 8
      // 182: ifeq 18f
      // 185: invokestatic hzu.dp2 ()V
      // 188: goto 18f
      // 18b: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18e: athrow
      // 18f: aload 0
      // 190: getfield gmu.m5v Lg6r;
      // 193: aload 1
      // 194: fload 2
      // 195: fload 3
      // 196: fload 4
      // 198: fload 5
      // 19a: fload 6
      // 19c: fload 7
      // 19e: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 1a1: iload 10
      // 1a3: iload 8
      // 1a5: ifne 204
      // 1a8: ifne 1ed
      // 1ab: goto 1b2
      // 1ae: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b1: athrow
      // 1b2: getstatic ModuleRegistry.crm Lhx2;
      // 1b5: invokevirtual hx2.klu ()Z
      // 1b8: iload 8
      // 1ba: ifne 1de
      // 1bd: goto 1c4
      // 1c0: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c3: athrow
      // 1c4: ifeq 207
      // 1c7: goto 1ce
      // 1ca: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: getstatic hx2.nqg Lcn7;
      // 1d1: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 1d4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d7: goto 1de
      // 1da: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: iload 8
      // 1e0: ifne 204
      // 1e3: ifeq 207
      // 1e6: goto 1ed
      // 1e9: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ec: athrow
      // 1ed: invokestatic hzu.ux6 ()V
      // 1f0: sipush 516
      // 1f3: ldc 0.1
      // 1f5: nop
      // 1f6: invokestatic hzu.fak (IF)V
      // 1f9: invokestatic hzu.x3w ()V
      // 1fc: bipush 1
      // 1fd: goto 204
      // 200: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 203: athrow
      // 204: invokestatic hzu.jun (Z)V
      // 207: return
   }

   public boolean _67(Entity var1, float var2) {
      return this.heo(var1, var2, true);
   }

   public boolean heo(Entity param1, float param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: fload 2
      // 002: invokevirtual Entity.xeu (F)F
      // 005: fstore 5
      // 007: invokestatic OpaquePredicate.c ()I
      // 00a: aload 0
      // 00b: aload 1
      // 00c: fload 5
      // 00e: fload 2
      // 00f: invokevirtual gmu.mq9 (Lg_3;FF)I
      // 012: istore 6
      // 014: istore 4
      // 016: iload 6
      // 018: bipush 24
      // 01a: ishr
      // 01b: sipush 255
      // 01e: iand
      // 01f: iload 4
      // 021: ifne 02f
      // 024: ifle 032
      // 027: goto 02e
      // 02a: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: bipush 1
      // 02f: goto 033
      // 032: bipush 0
      // 033: istore 7
      // 035: aload 1
      // 036: getfield Entity.gx0 I
      // 039: iload 4
      // 03b: ifne 063
      // 03e: ifgt 062
      // 041: goto 048
      // 044: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 1
      // 049: getfield Entity.qur I
      // 04c: iload 4
      // 04e: ifne 063
      // 051: goto 058
      // 054: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: ifle 066
      // 05b: goto 062
      // 05e: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: bipush 1
      // 063: goto 067
      // 066: bipush 0
      // 067: istore 8
      // 069: iload 7
      // 06b: iload 4
      // 06d: ifne 09a
      // 070: ifne 098
      // 073: goto 07a
      // 076: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 079: athrow
      // 07a: iload 8
      // 07c: iload 4
      // 07e: ifne 09a
      // 081: goto 088
      // 084: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: ifne 098
      // 08b: goto 092
      // 08e: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: bipush 0
      // 093: ireturn
      // 094: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: iload 7
      // 09a: iload 4
      // 09c: ifne 1d3
      // 09f: ifne 0c6
      // 0a2: goto 0a9
      // 0a5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: iload 3
      // 0aa: iload 4
      // 0ac: ifne 1d3
      // 0af: goto 0b6
      // 0b2: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: ifne 0c6
      // 0b9: goto 0c0
      // 0bc: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: bipush 0
      // 0c1: ireturn
      // 0c2: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: getstatic gis.z1w I
      // 0c9: invokestatic hzu.qon (I)V
      // 0cc: invokestatic hzu.rqj ()V
      // 0cf: sipush 8960
      // 0d2: sipush 8704
      // 0d5: getstatic gis.rnk I
      // 0d8: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0db: sipush 8960
      // 0de: getstatic gis.tvx I
      // 0e1: sipush 8448
      // 0e4: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0e7: sipush 8960
      // 0ea: getstatic gis.vj5 I
      // 0ed: getstatic gis.z1w I
      // 0f0: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0f3: sipush 8960
      // 0f6: getstatic gis.coe I
      // 0f9: getstatic gis.wrw I
      // 0fc: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0ff: sipush 8960
      // 102: getstatic gis.k_p I
      // 105: sipush 768
      // 108: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 10b: sipush 8960
      // 10e: getstatic gis.n_f I
      // 111: sipush 768
      // 114: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 117: sipush 8960
      // 11a: getstatic gis.m4u I
      // 11d: sipush 7681
      // 120: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 123: sipush 8960
      // 126: getstatic gis.uw7 I
      // 129: getstatic gis.z1w I
      // 12c: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 12f: sipush 8960
      // 132: getstatic gis.qvf I
      // 135: sipush 770
      // 138: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 13b: getstatic gis.exn I
      // 13e: invokestatic hzu.qon (I)V
      // 141: invokestatic hzu.rqj ()V
      // 144: sipush 8960
      // 147: sipush 8704
      // 14a: getstatic gis.rnk I
      // 14d: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 150: sipush 8960
      // 153: getstatic gis.tvx I
      // 156: getstatic gis.w5g I
      // 159: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 15c: sipush 8960
      // 15f: getstatic gis.vj5 I
      // 162: getstatic gis.lx0 I
      // 165: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 168: sipush 8960
      // 16b: getstatic gis.coe I
      // 16e: getstatic gis.uik I
      // 171: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 174: sipush 8960
      // 177: getstatic gis.xjo I
      // 17a: getstatic gis.lx0 I
      // 17d: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 180: sipush 8960
      // 183: getstatic gis.k_p I
      // 186: sipush 768
      // 189: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 18c: sipush 8960
      // 18f: getstatic gis.n_f I
      // 192: sipush 768
      // 195: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 198: sipush 8960
      // 19b: getstatic gis.fr4 I
      // 19e: sipush 770
      // 1a1: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 1a4: sipush 8960
      // 1a7: getstatic gis.m4u I
      // 1aa: sipush 7681
      // 1ad: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 1b0: sipush 8960
      // 1b3: getstatic gis.uw7 I
      // 1b6: getstatic gis.uik I
      // 1b9: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 1bc: sipush 8960
      // 1bf: getstatic gis.qvf I
      // 1c2: sipush 770
      // 1c5: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 1c8: aload 0
      // 1c9: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 1cc: bipush 0
      // 1cd: invokevirtual java/nio/FloatBuffer.position (I)Ljava/nio/Buffer;
      // 1d0: pop
      // 1d1: iload 8
      // 1d3: iload 4
      // 1d5: ifne 246
      // 1d8: ifeq 236
      // 1db: goto 1e2
      // 1de: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e1: athrow
      // 1e2: aload 0
      // 1e3: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 1e6: fconst_1
      // 1e7: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 1ea: pop
      // 1eb: aload 0
      // 1ec: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 1ef: fconst_0
      // 1f0: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 1f3: pop
      // 1f4: aload 0
      // 1f5: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 1f8: fconst_0
      // 1f9: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 1fc: pop
      // 1fd: aload 0
      // 1fe: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 201: ldc 0.3
      // 203: nop
      // 204: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 207: pop
      // 208: invokestatic hxt.ly3 ()Z
      // 20b: iload 4
      // 20d: ifne 364
      // 210: goto 217
      // 213: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: ifeq 2ca
      // 21a: goto 221
      // 21d: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 220: athrow
      // 221: fconst_1
      // 222: fconst_0
      // 223: fconst_0
      // 224: ldc 0.3
      // 226: nop
      // 227: invokestatic net/optifine/shaders/Shaders.setEntityColor (FFFF)V
      // 22a: iload 4
      // 22c: ifeq 2ca
      // 22f: goto 236
      // 232: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 235: athrow
      // 236: iload 6
      // 238: bipush 24
      // 23a: ishr
      // 23b: sipush 255
      // 23e: iand
      // 23f: goto 246
      // 242: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: i2f
      // 247: ldc 255.0
      // 249: nop
      // 24a: fdiv
      // 24b: fstore 9
      // 24d: iload 6
      // 24f: bipush 16
      // 251: ishr
      // 252: sipush 255
      // 255: iand
      // 256: i2f
      // 257: ldc 255.0
      // 259: nop
      // 25a: fdiv
      // 25b: fstore 10
      // 25d: iload 6
      // 25f: bipush 8
      // 261: ishr
      // 262: sipush 255
      // 265: iand
      // 266: i2f
      // 267: ldc 255.0
      // 269: nop
      // 26a: fdiv
      // 26b: fstore 11
      // 26d: iload 6
      // 26f: sipush 255
      // 272: iand
      // 273: i2f
      // 274: ldc 255.0
      // 276: nop
      // 277: fdiv
      // 278: fstore 12
      // 27a: aload 0
      // 27b: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 27e: fload 10
      // 280: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 283: pop
      // 284: aload 0
      // 285: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 288: fload 11
      // 28a: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 28d: pop
      // 28e: aload 0
      // 28f: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 292: fload 12
      // 294: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 297: pop
      // 298: aload 0
      // 299: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 29c: fconst_1
      // 29d: fload 9
      // 29f: fsub
      // 2a0: invokevirtual java/nio/FloatBuffer.put (F)Ljava/nio/FloatBuffer;
      // 2a3: pop
      // 2a4: invokestatic hxt.ly3 ()Z
      // 2a7: iload 4
      // 2a9: ifne 364
      // 2ac: ifeq 2ca
      // 2af: goto 2b6
      // 2b2: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b5: athrow
      // 2b6: fload 10
      // 2b8: fload 11
      // 2ba: fload 12
      // 2bc: fconst_1
      // 2bd: fload 9
      // 2bf: fsub
      // 2c0: invokestatic net/optifine/shaders/Shaders.setEntityColor (FFFF)V
      // 2c3: goto 2ca
      // 2c6: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: aload 0
      // 2cb: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 2ce: invokevirtual java/nio/FloatBuffer.flip ()Ljava/nio/Buffer;
      // 2d1: pop
      // 2d2: sipush 8960
      // 2d5: sipush 8705
      // 2d8: aload 0
      // 2d9: getfield gmu.nsv Ljava/nio/FloatBuffer;
      // 2dc: invokestatic org/lwjgl/opengl/GL11.glTexEnv (IILjava/nio/FloatBuffer;)V
      // 2df: getstatic gis.zgm I
      // 2e2: invokestatic hzu.qon (I)V
      // 2e5: invokestatic hzu.rqj ()V
      // 2e8: getstatic gmu.zne Lp9u;
      // 2eb: invokevirtual p9u.getGlTextureId ()I
      // 2ee: invokestatic hzu.t30 (I)V
      // 2f1: sipush 8960
      // 2f4: sipush 8704
      // 2f7: getstatic gis.rnk I
      // 2fa: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 2fd: sipush 8960
      // 300: getstatic gis.tvx I
      // 303: sipush 8448
      // 306: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 309: sipush 8960
      // 30c: getstatic gis.vj5 I
      // 30f: getstatic gis.uik I
      // 312: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 315: sipush 8960
      // 318: getstatic gis.coe I
      // 31b: getstatic gis.exn I
      // 31e: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 321: sipush 8960
      // 324: getstatic gis.k_p I
      // 327: sipush 768
      // 32a: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 32d: sipush 8960
      // 330: getstatic gis.n_f I
      // 333: sipush 768
      // 336: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 339: sipush 8960
      // 33c: getstatic gis.m4u I
      // 33f: sipush 7681
      // 342: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 345: sipush 8960
      // 348: getstatic gis.uw7 I
      // 34b: getstatic gis.uik I
      // 34e: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 351: sipush 8960
      // 354: getstatic gis.qvf I
      // 357: sipush 770
      // 35a: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 35d: getstatic gis.z1w I
      // 360: invokestatic hzu.qon (I)V
      // 363: bipush 1
      // 364: ireturn
   }

   public void vus() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic gis.z1w I
      // 003: invokestatic hzu.qon (I)V
      // 006: invokestatic hzu.rqj ()V
      // 009: sipush 8960
      // 00c: sipush 8704
      // 00f: getstatic gis.rnk I
      // 012: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 015: sipush 8960
      // 018: getstatic gis.tvx I
      // 01b: sipush 8448
      // 01e: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 021: invokestatic OpaquePredicate.c ()I
      // 024: sipush 8960
      // 027: getstatic gis.vj5 I
      // 02a: getstatic gis.z1w I
      // 02d: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 030: sipush 8960
      // 033: getstatic gis.coe I
      // 036: getstatic gis.wrw I
      // 039: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 03c: istore 1
      // 03d: sipush 8960
      // 040: getstatic gis.k_p I
      // 043: sipush 768
      // 046: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 049: sipush 8960
      // 04c: getstatic gis.n_f I
      // 04f: sipush 768
      // 052: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 055: sipush 8960
      // 058: getstatic gis.m4u I
      // 05b: sipush 8448
      // 05e: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 061: sipush 8960
      // 064: getstatic gis.uw7 I
      // 067: getstatic gis.z1w I
      // 06a: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 06d: sipush 8960
      // 070: getstatic gis.uuy I
      // 073: getstatic gis.wrw I
      // 076: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 079: sipush 8960
      // 07c: getstatic gis.qvf I
      // 07f: sipush 770
      // 082: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 085: sipush 8960
      // 088: getstatic gis.chl I
      // 08b: sipush 770
      // 08e: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 091: getstatic gis.exn I
      // 094: invokestatic hzu.qon (I)V
      // 097: sipush 8960
      // 09a: sipush 8704
      // 09d: getstatic gis.rnk I
      // 0a0: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0a3: sipush 8960
      // 0a6: getstatic gis.tvx I
      // 0a9: sipush 8448
      // 0ac: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0af: sipush 8960
      // 0b2: getstatic gis.k_p I
      // 0b5: sipush 768
      // 0b8: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0bb: sipush 8960
      // 0be: getstatic gis.n_f I
      // 0c1: sipush 768
      // 0c4: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0c7: sipush 8960
      // 0ca: getstatic gis.vj5 I
      // 0cd: sipush 5890
      // 0d0: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0d3: sipush 8960
      // 0d6: getstatic gis.coe I
      // 0d9: getstatic gis.uik I
      // 0dc: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0df: sipush 8960
      // 0e2: getstatic gis.m4u I
      // 0e5: sipush 8448
      // 0e8: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0eb: sipush 8960
      // 0ee: getstatic gis.qvf I
      // 0f1: sipush 770
      // 0f4: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 0f7: sipush 8960
      // 0fa: getstatic gis.uw7 I
      // 0fd: sipush 5890
      // 100: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 103: fconst_1
      // 104: fconst_1
      // 105: fconst_1
      // 106: fconst_1
      // 107: iload 1
      // 108: ifne 1a5
      // 10b: invokestatic hzu.wn0 (FFFF)V
      // 10e: getstatic gis.zgm I
      // 111: invokestatic hzu.qon (I)V
      // 114: invokestatic hzu.m_1 ()V
      // 117: bipush 0
      // 118: invokestatic hzu.t30 (I)V
      // 11b: sipush 8960
      // 11e: sipush 8704
      // 121: getstatic gis.rnk I
      // 124: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 127: sipush 8960
      // 12a: getstatic gis.tvx I
      // 12d: sipush 8448
      // 130: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 133: sipush 8960
      // 136: getstatic gis.k_p I
      // 139: sipush 768
      // 13c: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 13f: sipush 8960
      // 142: getstatic gis.n_f I
      // 145: sipush 768
      // 148: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 14b: sipush 8960
      // 14e: getstatic gis.vj5 I
      // 151: sipush 5890
      // 154: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 157: sipush 8960
      // 15a: getstatic gis.coe I
      // 15d: getstatic gis.uik I
      // 160: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 163: sipush 8960
      // 166: getstatic gis.m4u I
      // 169: sipush 8448
      // 16c: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 16f: sipush 8960
      // 172: getstatic gis.qvf I
      // 175: sipush 770
      // 178: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 17b: sipush 8960
      // 17e: getstatic gis.uw7 I
      // 181: sipush 5890
      // 184: invokestatic org/lwjgl/opengl/GL11.glTexEnvi (III)V
      // 187: getstatic gis.z1w I
      // 18a: invokestatic hzu.qon (I)V
      // 18d: invokestatic hxt.ly3 ()Z
      // 190: ifeq 1a8
      // 193: goto 19a
      // 196: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: fconst_0
      // 19b: fconst_0
      // 19c: fconst_0
      // 19d: fconst_0
      // 19e: goto 1a5
      // 1a1: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: invokestatic net/optifine/shaders/Shaders.setEntityColor (FFFF)V
      // 1a8: return
   }

   public void y5w(Entity var1, double var2, double var4, double var6) {
      hzu.a4k((float)var2, (float)var4, (float)var6);
   }

   public void ur9(Entity param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic gmu.a J
      // 003: ldc2_w 94850404961370
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 7
      // 00e: ldc 180.0
      // 010: nop
      // 011: fload 3
      // 012: fsub
      // 013: fconst_0
      // 014: fconst_1
      // 015: fconst_0
      // 016: invokestatic hzu.a2h (FFFF)V
      // 019: aload 1
      // 01a: iload 7
      // 01c: ifeq 078
      // 01f: getfield Entity.qur I
      // 022: ifle 070
      // 025: goto 02c
      // 028: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02b: athrow
      // 02c: aload 1
      // 02d: getfield Entity.qur I
      // 030: i2f
      // 031: fload 4
      // 033: fadd
      // 034: fconst_1
      // 035: fsub
      // 036: ldc 20.0
      // 038: nop
      // 039: fdiv
      // 03a: ldc 1.6
      // 03c: nop
      // 03d: fmul
      // 03e: fstore 8
      // 040: fload 8
      // 042: invokestatic fe6.bug (F)F
      // 045: fstore 8
      // 047: fload 8
      // 049: fconst_1
      // 04a: iload 7
      // 04c: ifeq 066
      // 04f: fcmpl
      // 050: ifle 05d
      // 053: goto 05a
      // 056: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: fconst_1
      // 05b: fstore 8
      // 05d: fload 8
      // 05f: aload 0
      // 060: aload 1
      // 061: invokevirtual gmu.hz_ (Lg_3;)F
      // 064: fmul
      // 065: fconst_0
      // 066: fconst_0
      // 067: fconst_1
      // 068: invokestatic hzu.a2h (FFFF)V
      // 06b: iload 7
      // 06d: ifne 129
      // 070: aload 1
      // 071: goto 078
      // 074: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: invokevirtual Entity.noc ()Ljava/lang/String;
      // 07b: invokestatic syo.fan (Ljava/lang/String;)Ljava/lang/String;
      // 07e: astore 8
      // 080: aload 8
      // 082: iload 7
      // 084: ifeq 093
      // 087: ifnull 129
      // 08a: goto 091
      // 08d: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 8
      // 093: sipush 32091
      // 096: ldc2_w 602639207214718213
      // 099: lload 5
      // 09b: lxor
      // 09c: invokedynamic p (IJ)Ljava/lang/String; bsm=gmu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a5: iload 7
      // 0a7: ifeq 0e9
      // 0aa: ifne 0de
      // 0ad: goto 0b4
      // 0b0: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 8
      // 0b6: sipush 18662
      // 0b9: ldc2_w 6342511349281827001
      // 0bc: lload 5
      // 0be: lxor
      // 0bf: invokedynamic p (IJ)Ljava/lang/String; bsm=gmu.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: nop
      // 0c5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c8: iload 7
      // 0ca: ifeq 0e9
      // 0cd: goto 0d4
      // 0d0: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: ifeq 129
      // 0d7: goto 0de
      // 0da: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: aload 1
      // 0df: instanceof ha9
      // 0e2: goto 0e9
      // 0e5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: iload 7
      // 0eb: ifeq 109
      // 0ee: ifeq 10c
      // 0f1: goto 0f8
      // 0f4: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 1
      // 0f9: checkcast ha9
      // 0fc: getstatic ulc.zah Lulc;
      // 0ff: invokevirtual ha9.cuw (Lulc;)Z
      // 102: goto 109
      // 105: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: ifeq 129
      // 10c: fconst_0
      // 10d: aload 1
      // 10e: getfield Entity.ikl F
      // 111: ldc 0.1
      // 113: nop
      // 114: fadd
      // 115: fconst_0
      // 116: invokestatic hzu.a4k (FFF)V
      // 119: ldc 180.0
      // 11b: nop
      // 11c: fconst_0
      // 11d: fconst_0
      // 11e: fconst_1
      // 11f: invokestatic hzu.a2h (FFFF)V
      // 122: goto 129
      // 125: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: return
   }

   public float tyj(Entity var1, float var2) {
      return var1.tcg(var2);
   }

   public float xwp(Entity var1, float var2) {
      return (float)var1.g25 + var2;
   }

   public void x50(Entity param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 0
      // 06: getfield gmu.vcp Ljava/util/List;
      // 09: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e: astore 10
      // 10: aload 10
      // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17: ifeq ee
      // 1a: aload 10
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast gnj
      // 24: astore 11
      // 26: aload 0
      // 27: aload 1
      // 28: fload 4
      // 2a: aload 11
      // 2c: invokeinterface gnj.shouldCombineTextures ()Z 1
      // 31: invokevirtual gmu.heo (Lg_3;FZ)Z
      // 34: istore 12
      // 36: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 39: iload 9
      // 3b: ifne 4f
      // 3e: ifeq 4b
      // 41: goto 48
      // 44: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: invokestatic net/optifine/EmissiveTextures.beginRender ()V
      // 4b: aload 0
      // 4c: getfield gmu.tfc Z
      // 4f: iload 9
      // 51: ifne 79
      // 54: ifeq 61
      // 57: goto 5e
      // 5a: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: invokestatic hzu.dp2 ()V
      // 61: aload 11
      // 63: aload 1
      // 64: fload 2
      // 65: fload 3
      // 66: fload 4
      // 68: fload 5
      // 6a: fload 6
      // 6c: fload 7
      // 6e: fload 8
      // 70: invokeinterface gnj.doRenderLayer (Lg_3;FFFFFFF)V 9
      // 75: aload 0
      // 76: getfield gmu.tfc Z
      // 79: iload 9
      // 7b: ifne 8e
      // 7e: ifeq 8b
      // 81: goto 88
      // 84: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: invokestatic hzu.x3w ()V
      // 8b: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 8e: iload 9
      // 90: ifne db
      // 93: ifeq d9
      // 96: goto 9d
      // 99: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9c: athrow
      // 9d: invokestatic net/optifine/EmissiveTextures.hasEmissive ()Z
      // a0: ifeq d6
      // a3: goto aa
      // a6: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: aload 0
      // ab: bipush 1
      // ac: putfield gmu.tfc Z
      // af: invokestatic net/optifine/EmissiveTextures.beginRenderEmissive ()V
      // b2: invokestatic hzu.dp2 ()V
      // b5: aload 11
      // b7: aload 1
      // b8: fload 2
      // b9: fload 3
      // ba: fload 4
      // bc: fload 5
      // be: fload 6
      // c0: fload 7
      // c2: fload 8
      // c4: invokeinterface gnj.doRenderLayer (Lg_3;FFFFFFF)V 9
      // c9: invokestatic hzu.x3w ()V
      // cc: invokestatic net/optifine/EmissiveTextures.endRenderEmissive ()V
      // cf: goto d6
      // d2: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d5: athrow
      // d6: invokestatic net/optifine/EmissiveTextures.endRender ()V
      // d9: iload 12
      // db: ifeq e9
      // de: aload 0
      // df: invokevirtual gmu.vus ()V
      // e2: goto e9
      // e5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e8: athrow
      // e9: iload 9
      // eb: ifeq 10
      // ee: return
   }

   public float hz_(Entity var1) {
      return 90.0F;
   }

   public int mq9(Entity var1, float var2, float var3) {
      return 0;
   }

   public void e2w(Entity var1, float var2) {
   }

   public void z9t(Entity param1, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 8
      // 005: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Specials_Pre_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 008: invokevirtual net/optifine/reflect/ReflectorConstructor.exists ()Z
      // 00b: iload 8
      // 00d: ifeq 065
      // 010: ifeq 059
      // 013: goto 01a
      // 016: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019: athrow
      // 01a: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Specials_Pre_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 01d: bipush 5
      // 01e: anewarray 146
      // 021: dup
      // 022: bipush 0
      // 023: aload 1
      // 024: aastore
      // 025: dup
      // 026: bipush 1
      // 027: aload 0
      // 028: aastore
      // 029: dup
      // 02a: bipush 2
      // 02b: dload 2
      // 02c: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 02f: aastore
      // 030: dup
      // 031: bipush 3
      // 032: dload 4
      // 034: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 037: aastore
      // 038: dup
      // 039: bipush 4
      // 03a: dload 6
      // 03c: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 03f: aastore
      // 040: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Z
      // 043: iload 8
      // 045: ifeq 065
      // 048: goto 04f
      // 04b: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: ifne 312
      // 052: goto 059
      // 055: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: aload 0
      // 05a: aload 1
      // 05b: invokevirtual gmu.ia5 (Lg_3;)Z
      // 05e: goto 065
      // 061: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: iload 8
      // 067: ifeq 2d2
      // 06a: ifeq 2cc
      // 06d: goto 074
      // 070: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: getstatic ModuleRegistry.dnc Lj3h;
      // 077: invokevirtual j3h.klu ()Z
      // 07a: iload 8
      // 07c: ifeq 09e
      // 07f: goto 086
      // 082: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: ifeq 0a2
      // 089: goto 090
      // 08c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: getstatic ModuleRegistry.dnc Lj3h;
      // 093: aload 1
      // 094: invokevirtual j3h.cfl (Lg_3;)Z
      // 097: goto 09e
      // 09a: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: ifeq 0a2
      // 0a1: return
      // 0a2: aload 1
      // 0a3: aload 0
      // 0a4: getfield gmu.l0g Lhr_;
      // 0a7: getfield hr_.mok Li2h;
      // 0aa: invokevirtual Entity.wxg (Li2h;)D
      // 0ad: dstore 9
      // 0af: aload 1
      // 0b0: invokevirtual Entity.hzv ()Z
      // 0b3: ifeq 0c0
      // 0b6: getstatic gmu.j2t F
      // 0b9: goto 0c3
      // 0bc: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: getstatic gmu.g7f F
      // 0c3: fstore 11
      // 0c5: dload 9
      // 0c7: fload 11
      // 0c9: fload 11
      // 0cb: fmul
      // 0cc: f2d
      // 0cd: dcmpg
      // 0ce: iload 8
      // 0d0: ifeq 2d2
      // 0d3: ifge 2cc
      // 0d6: goto 0dd
      // 0d9: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 1
      // 0de: invokevirtual Entity.xyw ()Lekw;
      // 0e1: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 0e6: astore 12
      // 0e8: ldc 0.02666667
      // 0ea: nop
      // 0eb: fstore 13
      // 0ed: sipush 516
      // 0f0: ldc 0.1
      // 0f2: nop
      // 0f3: invokestatic hzu.fak (IF)V
      // 0f6: aload 1
      // 0f7: invokevirtual Entity.hzv ()Z
      // 0fa: ifeq 28e
      // 0fd: new idf
      // 100: dup
      // 101: aload 1
      // 102: dload 2
      // 103: dload 4
      // 105: dload 6
      // 107: invokespecial idf.<init> (Li2h;DDD)V
      // 10a: astore 14
      // 10c: aload 14
      // 10e: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 111: pop
      // 112: aload 14
      // 114: invokevirtual idf.elp ()Z
      // 117: ifeq 11f
      // 11a: return
      // 11b: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e: athrow
      // 11f: invokestatic Minecraft.vz1 ()Lc05;
      // 122: getfield Minecraft.tx1 Lowt;
      // 125: astore 15
      // 127: invokestatic hzu.dp2 ()V
      // 12a: dload 2
      // 12b: d2f
      // 12c: dload 4
      // 12e: d2f
      // 12f: aload 1
      // 130: getfield Entity.ikl F
      // 133: fadd
      // 134: ldc 0.5
      // 136: nop
      // 137: fadd
      // 138: aload 1
      // 139: iload 8
      // 13b: ifeq 153
      // 13e: invokevirtual Entity.ejl ()Z
      // 141: ifeq 15b
      // 144: goto 14b
      // 147: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: aload 1
      // 14c: goto 153
      // 14f: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 152: athrow
      // 153: getfield Entity.ikl F
      // 156: fconst_2
      // 157: fdiv
      // 158: goto 15c
      // 15b: fconst_0
      // 15c: fsub
      // 15d: dload 6
      // 15f: d2f
      // 160: invokestatic hzu.a4k (FFF)V
      // 163: fconst_0
      // 164: fconst_1
      // 165: fconst_0
      // 166: invokestatic org/lwjgl/opengl/GL11.glNormal3f (FFF)V
      // 169: aload 0
      // 16a: getfield gmu.l0g Lhr_;
      // 16d: getfield hr_.s7e F
      // 170: fneg
      // 171: fconst_0
      // 172: fconst_1
      // 173: fconst_0
      // 174: invokestatic hzu.a2h (FFFF)V
      // 177: aload 0
      // 178: getfield gmu.l0g Lhr_;
      // 17b: getfield hr_.fw9 F
      // 17e: fconst_1
      // 17f: fconst_0
      // 180: fconst_0
      // 181: invokestatic hzu.a2h (FFFF)V
      // 184: ldc -0.02666667
      // 186: nop
      // 187: ldc -0.02666667
      // 189: nop
      // 18a: ldc 0.02666667
      // 18c: nop
      // 18d: invokestatic hzu.syc (FFF)V
      // 190: fconst_0
      // 191: ldc 9.374999
      // 193: nop
      // 194: fconst_0
      // 195: invokestatic hzu.a4k (FFF)V
      // 198: invokestatic hzu.fpt ()V
      // 19b: bipush 0
      // 19c: invokestatic hzu.jun (Z)V
      // 19f: invokestatic hzu.spd ()V
      // 1a2: invokestatic hzu.m_1 ()V
      // 1a5: sipush 770
      // 1a8: sipush 771
      // 1ab: bipush 1
      // 1ac: bipush 0
      // 1ad: invokestatic hzu.u39 (IIII)V
      // 1b0: aload 15
      // 1b2: aload 12
      // 1b4: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 1b7: bipush 2
      // 1b8: idiv
      // 1b9: i2f
      // 1ba: fstore 16
      // 1bc: invokestatic jom.yut ()Ljom;
      // 1bf: astore 17
      // 1c1: aload 17
      // 1c3: invokevirtual jom.zuq ()Lq3g;
      // 1c6: astore 18
      // 1c8: aload 18
      // 1ca: bipush 7
      // 1cc: getstatic gnl.gec Lbe7;
      // 1cf: invokevirtual q3g.ezr (ILbe7;)V
      // 1d2: aload 18
      // 1d4: fload 16
      // 1d6: fneg
      // 1d7: fconst_1
      // 1d8: fsub
      // 1d9: f2d
      // 1da: ldc2_w -1.0
      // 1dd: dconst_0
      // 1de: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1e1: fconst_0
      // 1e2: fconst_0
      // 1e3: fconst_0
      // 1e4: ldc 0.25
      // 1e6: nop
      // 1e7: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 1ea: invokevirtual q3g.pzw ()V
      // 1ed: aload 18
      // 1ef: fload 16
      // 1f1: fneg
      // 1f2: fconst_1
      // 1f3: fsub
      // 1f4: f2d
      // 1f5: ldc2_w 8.0
      // 1f8: dconst_0
      // 1f9: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1fc: fconst_0
      // 1fd: fconst_0
      // 1fe: fconst_0
      // 1ff: ldc 0.25
      // 201: nop
      // 202: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 205: invokevirtual q3g.pzw ()V
      // 208: aload 18
      // 20a: fload 16
      // 20c: fconst_1
      // 20d: fadd
      // 20e: f2d
      // 20f: ldc2_w 8.0
      // 212: dconst_0
      // 213: invokevirtual q3g.g5o (DDD)Lq3g;
      // 216: fconst_0
      // 217: fconst_0
      // 218: fconst_0
      // 219: ldc 0.25
      // 21b: nop
      // 21c: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 21f: invokevirtual q3g.pzw ()V
      // 222: aload 18
      // 224: fload 16
      // 226: fconst_1
      // 227: fadd
      // 228: f2d
      // 229: ldc2_w -1.0
      // 22c: dconst_0
      // 22d: invokevirtual q3g.g5o (DDD)Lq3g;
      // 230: fconst_0
      // 231: fconst_0
      // 232: fconst_0
      // 233: ldc 0.25
      // 235: nop
      // 236: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 239: invokevirtual q3g.pzw ()V
      // 23c: aload 17
      // 23e: invokevirtual jom.q7g ()V
      // 241: invokestatic hzu.rqj ()V
      // 244: bipush 1
      // 245: invokestatic hzu.jun (Z)V
      // 248: new s60
      // 24b: dup
      // 24c: aload 12
      // 24e: invokespecial s60.<init> (Ljava/lang/String;)V
      // 251: astore 19
      // 253: aload 19
      // 255: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 258: pop
      // 259: aload 19
      // 25b: getfield s60.jcg Ljava/lang/String;
      // 25e: astore 12
      // 260: aload 15
      // 262: aload 12
      // 264: aload 15
      // 266: aload 12
      // 268: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 26b: ineg
      // 26c: bipush 2
      // 26d: idiv
      // 26e: i2f
      // 26f: ldc -1.5
      // 271: nop
      // 272: ldc 553648127
      // 274: nop
      // 275: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // 278: pop
      // 279: invokestatic hzu.s7q ()V
      // 27c: invokestatic hzu.ux6 ()V
      // 27f: fconst_1
      // 280: fconst_1
      // 281: fconst_1
      // 282: fconst_1
      // 283: invokestatic hzu.wn0 (FFFF)V
      // 286: invokestatic hzu.x3w ()V
      // 289: iload 8
      // 28b: ifne 2cc
      // 28e: aload 0
      // 28f: aload 1
      // 290: dload 2
      // 291: dload 4
      // 293: aload 1
      // 294: iload 8
      // 296: ifeq 2b5
      // 299: goto 2a0
      // 29c: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29f: athrow
      // 2a0: invokevirtual Entity.ejl ()Z
      // 2a3: ifeq 2be
      // 2a6: goto 2ad
      // 2a9: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: aload 1
      // 2ae: goto 2b5
      // 2b1: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b4: athrow
      // 2b5: getfield Entity.ikl F
      // 2b8: fconst_2
      // 2b9: fdiv
      // 2ba: f2d
      // 2bb: goto 2bf
      // 2be: dconst_0
      // 2bf: dsub
      // 2c0: dload 6
      // 2c2: aload 12
      // 2c4: ldc 0.02666667
      // 2c6: nop
      // 2c7: dload 9
      // 2c9: invokevirtual gmu.pdy (Li2h;DDDLjava/lang/String;FD)V
      // 2cc: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Specials_Post_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 2cf: invokevirtual net/optifine/reflect/ReflectorConstructor.exists ()Z
      // 2d2: iload 8
      // 2d4: ifeq 311
      // 2d7: ifeq 312
      // 2da: goto 2e1
      // 2dd: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e0: athrow
      // 2e1: getstatic net/optifine/reflect/Reflector.RenderLivingEvent_Specials_Post_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 2e4: bipush 5
      // 2e5: anewarray 146
      // 2e8: dup
      // 2e9: bipush 0
      // 2ea: aload 1
      // 2eb: aastore
      // 2ec: dup
      // 2ed: bipush 1
      // 2ee: aload 0
      // 2ef: aastore
      // 2f0: dup
      // 2f1: bipush 2
      // 2f2: dload 2
      // 2f3: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 2f6: aastore
      // 2f7: dup
      // 2f8: bipush 3
      // 2f9: dload 4
      // 2fb: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 2fe: aastore
      // 2ff: dup
      // 300: bipush 4
      // 301: dload 6
      // 303: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 306: aastore
      // 307: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Z
      // 30a: goto 311
      // 30d: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 310: athrow
      // 311: pop
      // 312: return
   }

   public boolean ia5(Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: invokestatic Minecraft.vz1 ()Lc05;
      // 007: getfield Minecraft.vg8 Ll86;
      // 00a: astore 3
      // 00b: aload 1
      // 00c: instanceof ha9
      // 00f: iload 2
      // 010: ifeq 0ef
      // 013: ifeq 0ec
      // 016: goto 01d
      // 019: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c: athrow
      // 01d: aload 1
      // 01e: iload 2
      // 01f: ifeq 03c
      // 022: goto 029
      // 025: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 028: athrow
      // 029: aload 3
      // 02a: if_acmpeq 0ec
      // 02d: goto 034
      // 030: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 1
      // 035: goto 03c
      // 038: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: invokevirtual Entity.ued ()Ln_0;
      // 03f: astore 4
      // 041: aload 3
      // 042: invokevirtual EntityPlayerSP.ued ()Ln_0;
      // 045: astore 5
      // 047: aload 4
      // 049: iload 2
      // 04a: ifeq 059
      // 04d: ifnull 0ec
      // 050: goto 057
      // 053: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: aload 4
      // 059: invokevirtual n_0.xge ()Ln_0$ajs;
      // 05c: astore 6
      // 05e: getstatic gmu$1.f_k [I
      // 061: aload 6
      // 063: invokevirtual n_0$ajs.ordinal ()I
      // 066: iaload
      // 067: iload 2
      // 068: ifeq 0eb
      // 06b: tableswitch 127 1 4 33 39 41 84
      // 088: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: bipush 1
      // 08d: ireturn
      // 08e: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: bipush 0
      // 093: ireturn
      // 094: aload 5
      // 096: iload 2
      // 097: ifeq 0a6
      // 09a: ifnull 0b9
      // 09d: goto 0a4
      // 0a0: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: aload 4
      // 0a6: aload 5
      // 0a8: invokevirtual n_0.msm (Ln_0;)Z
      // 0ab: iload 2
      // 0ac: ifeq 0ba
      // 0af: ifeq 0bd
      // 0b2: goto 0b9
      // 0b5: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: bipush 1
      // 0ba: goto 0be
      // 0bd: bipush 0
      // 0be: ireturn
      // 0bf: aload 5
      // 0c1: iload 2
      // 0c2: ifeq 0d1
      // 0c5: ifnull 0e4
      // 0c8: goto 0cf
      // 0cb: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: aload 4
      // 0d1: aload 5
      // 0d3: invokevirtual n_0.msm (Ln_0;)Z
      // 0d6: iload 2
      // 0d7: ifeq 0e5
      // 0da: ifne 0e8
      // 0dd: goto 0e4
      // 0e0: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: bipush 1
      // 0e5: goto 0e9
      // 0e8: bipush 0
      // 0e9: ireturn
      // 0ea: bipush 1
      // 0eb: ireturn
      // 0ec: invokestatic Minecraft.d_6 ()Z
      // 0ef: ifeq 13f
      // 0f2: aload 1
      // 0f3: iload 2
      // 0f4: ifeq 117
      // 0f7: goto 0fe
      // 0fa: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: getfield gmu.l0g Lhr_;
      // 102: getfield hr_.mok Li2h;
      // 105: if_acmpeq 13f
      // 108: goto 10f
      // 10b: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10e: athrow
      // 10f: aload 1
      // 110: goto 117
      // 113: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 116: athrow
      // 117: iload 2
      // 118: ifeq 134
      // 11b: aload 3
      // 11c: invokevirtual Entity.fiy (Lha9;)Z
      // 11f: ifne 13f
      // 122: goto 129
      // 125: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 128: athrow
      // 129: aload 1
      // 12a: getfield Entity.wgv Li2h;
      // 12d: goto 134
      // 130: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: ifnonnull 13f
      // 137: bipush 1
      // 138: goto 140
      // 13b: invokestatic gmu.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13e: athrow
      // 13f: bipush 0
      // 140: ireturn
   }

   public void r8d(boolean var1) {
      this.cqn = var1;
   }

   public List _sx() {
      return this.vcp;
   }

   @Override
   public boolean daa(EntityLivingBase var1) {
      return this.ia5((Entity)var1);
   }

   @Override
   public void ix5(EntityLivingBase var1, double var2, double var4, double var6) {
      this.z9t((Entity)var1, var2, var4, var6);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.l1o((Entity)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1687733964488871775L, 7341024867869516688L, MethodHandles.lookup().lookupClass()).a(191728368128282L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 55550053202939L;
      Cipher var0;
      Cipher var16 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var16.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "z)\u0014«\u000e\u0087_\u0087X\bÛ\nÍ\u0096,iÊ\u00adªÓ\u009eÄ£âÃ× æµC¢\u0083\u0097Mä gè!É(o Y\u0017á\u0016cñ\u008a\r'<Ê©\u0002m\bò©\u001f\u008c ø8\u0000ý1ÿ\u0005g~ÃÎ#\u009eN\b>\u0012\u0081";
      int var6 = "z)\u0014«\u000e\u0087_\u0087X\bÛ\nÍ\u0096,iÊ\u00adªÓ\u009eÄ£âÃ× æµC¢\u0083\u0097Mä gè!É(o Y\u0017á\u0016cñ\u008a\r'<Ê©\u0002m\bò©\u001f\u008c ø8\u0000ý1ÿ\u0005g~ÃÎ#\u009eN\b>\u0012\u0081"
         .length();
      char var3 = '(';
      int var15 = -1;

      label41:
      while (true) {
         String var17 = var4.substring(++var15, var15 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var17.getBytes("ISO-8859-1"));
            String var23 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var23;
                  if ((var15 += var3) >= var6) {
                     g = var7;
                     h = new String[4];
                     b9g = LogManager.getLogger();
                     zne = new p9u(16, 16);
                     g7f = 64.0F;
                     j2t = 32.0F;
                     d4t = Boolean.getBoolean(b<"p">(18677, 133047418010853129L ^ var9));
                     int[] var11 = zne.k8b();
                     int var12 = 0;

                     try {
                        while (var12 < 256) {
                           var11[var12] = -1;
                           var12++;
                        }
                     } catch (oov var13) {
                        throw a(var13);
                     }

                     zne.oj6();
                     return;
                  }

                  var3 = var4.charAt(var15);
                  break;
               default:
                  var7[var5++] = var23;
                  if ((var15 += var3) < var6) {
                     var3 = var4.charAt(var15);
                     continue label41;
                  }

                  var4 = "£\u0010ÓâñóºON\u00adf¶\u00adJ\u0092\u009aC»û5´XB~\u0010¹ÛÐ\rá£\u0016è¬5´CÂ\u0010g\u0092";
                  var6 = "£\u0010ÓâñóºON\u00adf¶\u00adJ\u0092\u009aC»û5´XB~\u0010¹ÛÐ\rá£\u0016è¬5´CÂ\u0010g\u0092".length();
                  var3 = 24;
                  var15 = -1;
            }

            var17 = var4.substring(++var15, var15 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16543;
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
            throw new RuntimeException("gmu", var10);
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
         throw new RuntimeException("gmu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
