import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.shaders.Shaders;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class v3i implements lv1 {
   private static final Logger bvl;
   private static final gdz fa2;
   private static final gdz wub;
   public static boolean v0c;
   public static int klp;
   private Minecraft iku;
   private final y99 kok;
   private Random iol;
   private float llt;
   public mlb _ld;
   private final f5a qlc;
   private int g6g;
   private EntityLivingBase gg8;
   private hsd vzz;
   private hsd lvr;
   private float ry5;
   private float xj9;
   private float t5b;
   private float pjt;
   private float b33;
   private float n29;
   private float a_7;
   private float oh1;
   private float sr0;
   private float gbx;
   private float yph;
   private boolean adj;
   private boolean v5y;
   private boolean ahx;
   private long eay;
   private long x5c;
   private final p9u eot;
   private final int[] he3;
   private final gdz u3i;
   private boolean vl2;
   private float uyk;
   private float epk;
   private int yya;
   private float[] fzj;
   private float[] nb1;
   private FloatBuffer kk3;
   public float h0i;
   public float qy4;
   public float ai5;
   private float tql;
   private float inn;
   private int wgg;
   private boolean mrg;
   private double t54;
   private double ud_;
   private double kui;
   private qn4 n5u;
   private static final gdz[] aut;
   public static final int rrx;
   private int pbd;
   private boolean ssp;
   public int bvo;
   private boolean aai;
   private OpaquePredicate e3b;
   private boolean i0j;
   public boolean ndn;
   private float ols;
   private long m0p;
   private int mty;
   private int y0a;
   private int qdl;
   private float tdt;
   private float xuo;
   private qn4[] zz1;
   private boolean qbm;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public v3i(Minecraft var1, y99 var2) {
      long var3 = a ^ 125244781006296L;
      super();
      int var10000 = OpaquePredicate.b();
      this.iol = new Random();
      this.vzz = new hsd();
      this.lvr = new hsd();
      this.ry5 = 4.0F;
      this.xj9 = 4.0F;
      this.v5y = true;
      this.ahx = true;
      this.eay = Minecraft.qgs();
      this.fzj = new float[1024];
      this.nb1 = new float[1024];
      int var5 = var10000;
      this.kk3 = nkx.dyc(16);
      this.wgg = 0;
      this.mrg = false;
      this.t54 = 1.0;
      this.aai = false;
      this.e3b = null;
      this.i0j = false;
      this.ndn = false;
      this.ols = 128.0F;
      this.m0p = 0L;
      this.mty = 0;
      this.y0a = 0;
      this.qdl = 0;
      this.tdt = 0.0F;
      this.xuo = 0.0F;
      this.zz1 = new qn4[10];
      this.qbm = false;
      this.pbd = rrx;
      this.ssp = false;
      this.bvo = 0;
      this.iku = var1;
      this.kok = var2;
      this._ld = var1.xoy();
      this.qlc = new f5a(var1.l22());
      this.eot = new p9u(16, 16);
      this.u3i = var1.l22().v5m(a<"n">(16861, 7682155354066654385L ^ var3), this.eot);
      this.he3 = this.eot.k8b();
      this.n5u = null;
      int var6 = 0;

      while (var6 < 32) {
         int var7 = 0;

         while (true) {
            if (var7 < 32) {
               float var8 = (float)(var7 - 16);
               float var9 = (float)(var6 - 16);
               float var10 = fe6.bug(var8 * var8 + var9 * var9);

               try {
                  this.fzj[var6 << 5 | var7] = -var9 / var10;
                  this.nb1[var6 << 5 | var7] = var8 / var10;
                  var7++;
                  if (var5 == 0) {
                     break;
                  }

                  if (var5 != 0) {
                     continue;
                  }
               } catch (JsonSyntaxException var11) {
                  throw a(var11);
               }
            }

            var6++;
            break;
         }

         if (var5 == 0) {
            break;
         }
      }
   }

   public boolean q1z() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic gis.jap Z
      // 03: ifeq 1c
      // 06: aload 0
      // 07: getfield v3i.n5u Lqn4;
      // 0a: ifnull 1c
      // 0d: goto 14
      // 10: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 1d
      // 18: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
   }

   public void ryv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 2a
      // 09: getfield v3i.n5u Lqn4;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield v3i.n5u Lqn4;
      // 1a: invokevirtual qn4.fzs ()V
      // 1d: goto 24
      // 20: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: aconst_null
      // 26: putfield v3i.n5u Lqn4;
      // 29: aload 0
      // 2a: getstatic v3i.rrx I
      // 2d: putfield v3i.pbd I
      // 30: return
   }

   public void xif() {
      int var1 = OpaquePredicate.c();

      v3i var10000;
      boolean var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = this.ssp;
               if (var1 != 0) {
                  break label22;
               }

               if (!this.ssp) {
                  break label21;
               }
            } catch (JsonSyntaxException var2) {
               throw a(var2);
            }

            var10001 = false;
            break label22;
         }

         var10001 = true;
      }

      var10000.ssp = var10001;
   }

   public void mvy(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 133816162173079
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: getstatic gis.jap Z
      // 010: ifeq 12c
      // 013: aload 0
      // 014: iload 4
      // 016: ifeq 03c
      // 019: goto 020
      // 01c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: getfield v3i.n5u Lqn4;
      // 023: ifnull 03b
      // 026: goto 02d
      // 029: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: aload 0
      // 02e: getfield v3i.n5u Lqn4;
      // 031: invokevirtual qn4.fzs ()V
      // 034: goto 03b
      // 037: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 0
      // 03c: aconst_null
      // 03d: putfield v3i.n5u Lqn4;
      // 040: aload 1
      // 041: instanceof EntitySkeleton
      // 044: iload 4
      // 046: ifeq 083
      // 049: ifeq 078
      // 04c: goto 053
      // 04f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 052: athrow
      // 053: aload 0
      // 054: new gdz
      // 057: dup
      // 058: sipush 2100
      // 05b: ldc2_w 112693067302178841
      // 05e: lload 2
      // 05f: lxor
      // 060: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: nop
      // 066: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 069: invokevirtual v3i.uyd (Lgdz;)V
      // 06c: iload 4
      // 06e: ifne 12c
      // 071: goto 078
      // 074: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 1
      // 079: instanceof u10
      // 07c: goto 083
      // 07f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: iload 4
      // 085: ifeq 0c2
      // 088: ifeq 0b7
      // 08b: goto 092
      // 08e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: aload 0
      // 093: new gdz
      // 096: dup
      // 097: sipush 24388
      // 09a: ldc2_w 6840643718871631706
      // 09d: lload 2
      // 09e: lxor
      // 09f: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: nop
      // 0a5: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 0a8: invokevirtual v3i.uyd (Lgdz;)V
      // 0ab: iload 4
      // 0ad: ifne 12c
      // 0b0: goto 0b7
      // 0b3: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: aload 1
      // 0b8: instanceof a_t
      // 0bb: goto 0c2
      // 0be: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: iload 4
      // 0c4: ifeq 10f
      // 0c7: ifeq 0f6
      // 0ca: goto 0d1
      // 0cd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: new gdz
      // 0d5: dup
      // 0d6: sipush 30890
      // 0d9: ldc2_w 563188329690816721
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: nop
      // 0e4: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 0e7: invokevirtual v3i.uyd (Lgdz;)V
      // 0ea: iload 4
      // 0ec: ifne 12c
      // 0ef: goto 0f6
      // 0f2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_loadEntityShader Lnet/optifine/reflect/ReflectorMethod;
      // 0f9: iload 4
      // 0fb: ifeq 12b
      // 0fe: goto 105
      // 101: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 108: goto 10f
      // 10b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10e: athrow
      // 10f: ifeq 12c
      // 112: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_loadEntityShader Lnet/optifine/reflect/ReflectorMethod;
      // 115: bipush 2
      // 116: anewarray 84
      // 119: dup
      // 11a: bipush 0
      // 11b: aload 1
      // 11c: aastore
      // 11d: dup
      // 11e: bipush 1
      // 11f: aload 0
      // 120: aastore
      // 121: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 124: goto 12b
      // 127: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: pop
      // 12c: return
   }

   public void bpu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic gis.jap Z
      // 07: iload 1
      // 08: ifne 31
      // 0b: ifeq 9d
      // 0e: goto 15
      // 11: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: aload 0
      // 16: iload 1
      // 17: ifne 35
      // 1a: goto 21
      // 1d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: getfield v3i.iku Lc05;
      // 24: invokevirtual Minecraft.nsd ()Li2h;
      // 27: instanceof ha9
      // 2a: goto 31
      // 2d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ifeq 9d
      // 34: aload 0
      // 35: iload 1
      // 36: ifne 66
      // 39: getfield v3i.n5u Lqn4;
      // 3c: ifnull 54
      // 3f: goto 46
      // 42: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: getfield v3i.n5u Lqn4;
      // 4a: invokevirtual qn4.fzs ()V
      // 4d: goto 54
      // 50: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 0
      // 55: aload 0
      // 56: getfield v3i.pbd I
      // 59: bipush 1
      // 5a: iadd
      // 5b: getstatic v3i.aut [Lgdz;
      // 5e: arraylength
      // 5f: bipush 1
      // 60: iadd
      // 61: irem
      // 62: putfield v3i.pbd I
      // 65: aload 0
      // 66: iload 1
      // 67: ifne 99
      // 6a: getfield v3i.pbd I
      // 6d: getstatic v3i.rrx I
      // 70: if_icmpeq 91
      // 73: goto 7a
      // 76: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: aload 0
      // 7b: getstatic v3i.aut [Lgdz;
      // 7e: aload 0
      // 7f: getfield v3i.pbd I
      // 82: aaload
      // 83: invokevirtual v3i.uyd (Lgdz;)V
      // 86: iload 1
      // 87: ifeq 9d
      // 8a: goto 91
      // 8d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: aload 0
      // 92: goto 99
      // 95: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 98: athrow
      // 99: aconst_null
      // 9a: putfield v3i.n5u Lqn4;
      // 9d: return
   }

   public void uyd(gdz var1) {
      long var2 = a ^ 83728711373774L;

      IOException var8;
      label36: {
         try {
            if (!gis.gu5()) {
               return;
            }

            try {
               this.n5u = new qn4(this.iku.l22(), this.kok, this.iku._d2(), var1);
               this.n5u.s_6(this.iku.pfr, this.iku.ry7);
               this.ssp = true;
               return;
            } catch (IOException var5) {
               var8 = var5;
               break label36;
            } catch (JsonSyntaxException var6) {
               var4 = var6;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         bvl.warn(a<"n">(32321, 1604091971359831321L ^ var2) + var1, var4);
         this.pbd = rrx;
         this.ssp = false;
         return;
      }

      bvl.warn(a<"n">(25891, 8172797449882791536L ^ var2) + var1, var8);
      this.pbd = rrx;
      this.ssp = false;
   }

   @Override
   public void onResourceManagerReload(y99 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 2a
      // 09: getfield v3i.n5u Lqn4;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield v3i.n5u Lqn4;
      // 1a: invokevirtual qn4.fzs ()V
      // 1d: goto 24
      // 20: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: aconst_null
      // 26: putfield v3i.n5u Lqn4;
      // 29: aload 0
      // 2a: iload 2
      // 2b: ifne 5d
      // 2e: getfield v3i.pbd I
      // 31: getstatic v3i.rrx I
      // 34: if_icmpeq 55
      // 37: goto 3e
      // 3a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getstatic v3i.aut [Lgdz;
      // 42: aload 0
      // 43: getfield v3i.pbd I
      // 46: aaload
      // 47: invokevirtual v3i.uyd (Lgdz;)V
      // 4a: iload 2
      // 4b: ifeq 67
      // 4e: goto 55
      // 51: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: goto 5d
      // 59: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield v3i.iku Lc05;
      // 61: invokevirtual Minecraft.nsd ()Li2h;
      // 64: invokevirtual v3i.mvy (Li2h;)V
      // 67: return
   }

   public void mlf() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: getstatic gis.jap Z
      // 007: iload 1
      // 008: ifeq 059
      // 00b: ifeq 02c
      // 00e: goto 015
      // 011: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 014: athrow
      // 015: invokestatic q38.x7d ()Lq38;
      // 018: ifnonnull 02c
      // 01b: goto 022
      // 01e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: invokestatic q38.xhu ()V
      // 025: goto 02c
      // 028: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aload 0
      // 02d: invokespecial v3i.ntc ()V
      // 030: aload 0
      // 031: invokespecial v3i.mb1 ()V
      // 034: aload 0
      // 035: aload 0
      // 036: getfield v3i.inn F
      // 039: putfield v3i.tql F
      // 03c: aload 0
      // 03d: aload 0
      // 03e: getfield v3i.ry5 F
      // 041: putfield v3i.xj9 F
      // 044: aload 0
      // 045: iload 1
      // 046: ifeq 0cd
      // 049: getfield v3i.iku Lc05;
      // 04c: getfield Minecraft.oxn Lmoh;
      // 04f: getfield moh.glc Z
      // 052: goto 059
      // 055: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: ifeq 0b4
      // 05c: aload 0
      // 05d: getfield v3i.iku Lc05;
      // 060: getfield Minecraft.oxn Lmoh;
      // 063: getfield moh.igw F
      // 066: ldc 0.6
      // 068: nop
      // 069: fmul
      // 06a: ldc 0.2
      // 06c: nop
      // 06d: fadd
      // 06e: fstore 2
      // 06f: fload 2
      // 070: fload 2
      // 071: fmul
      // 072: fload 2
      // 073: fmul
      // 074: ldc 8.0
      // 076: nop
      // 077: fmul
      // 078: fstore 3
      // 079: aload 0
      // 07a: aload 0
      // 07b: getfield v3i.vzz Lhsd;
      // 07e: aload 0
      // 07f: getfield v3i.t5b F
      // 082: ldc 0.05
      // 084: nop
      // 085: fload 3
      // 086: fmul
      // 087: invokevirtual hsd.m9v (FF)F
      // 08a: putfield v3i.b33 F
      // 08d: aload 0
      // 08e: aload 0
      // 08f: getfield v3i.lvr Lhsd;
      // 092: aload 0
      // 093: getfield v3i.pjt F
      // 096: ldc 0.05
      // 098: nop
      // 099: fload 3
      // 09a: fmul
      // 09b: invokevirtual hsd.m9v (FF)F
      // 09e: putfield v3i.n29 F
      // 0a1: aload 0
      // 0a2: fconst_0
      // 0a3: putfield v3i.a_7 F
      // 0a6: aload 0
      // 0a7: fconst_0
      // 0a8: putfield v3i.t5b F
      // 0ab: aload 0
      // 0ac: fconst_0
      // 0ad: putfield v3i.pjt F
      // 0b0: iload 1
      // 0b1: ifne 0d3
      // 0b4: aload 0
      // 0b5: fconst_0
      // 0b6: putfield v3i.b33 F
      // 0b9: aload 0
      // 0ba: fconst_0
      // 0bb: putfield v3i.n29 F
      // 0be: aload 0
      // 0bf: getfield v3i.vzz Lhsd;
      // 0c2: invokevirtual hsd.tdw ()V
      // 0c5: aload 0
      // 0c6: goto 0cd
      // 0c9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: getfield v3i.lvr Lhsd;
      // 0d0: invokevirtual hsd.tdw ()V
      // 0d3: aload 0
      // 0d4: getfield v3i.iku Lc05;
      // 0d7: invokevirtual Minecraft.nsd ()Li2h;
      // 0da: iload 1
      // 0db: ifeq 104
      // 0de: ifnonnull 0fd
      // 0e1: goto 0e8
      // 0e4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: getfield v3i.iku Lc05;
      // 0ec: aload 0
      // 0ed: getfield v3i.iku Lc05;
      // 0f0: getfield Minecraft.vg8 Ll86;
      // 0f3: invokevirtual Minecraft.gri (Li2h;)V
      // 0f6: goto 0fd
      // 0f9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: getfield v3i.iku Lc05;
      // 101: invokevirtual Minecraft.nsd ()Li2h;
      // 104: astore 2
      // 105: aload 2
      // 106: getfield EntityLivingBase.o2v D
      // 109: dstore 3
      // 10a: aload 2
      // 10b: getfield EntityLivingBase.kfp D
      // 10e: aload 2
      // 10f: invokevirtual EntityLivingBase.c5y ()F
      // 112: f2d
      // 113: dadd
      // 114: dstore 5
      // 116: aload 2
      // 117: getfield EntityLivingBase.vbd D
      // 11a: dstore 7
      // 11c: aload 0
      // 11d: getfield v3i.iku Lc05;
      // 120: getfield Minecraft.tij Lkh3;
      // 123: new mew
      // 126: dup
      // 127: dload 3
      // 128: dload 5
      // 12a: dload 7
      // 12c: invokespecial mew.<init> (DDD)V
      // 12f: invokevirtual WorldClient.rgh (Lmew;)F
      // 132: fstore 9
      // 134: aload 0
      // 135: getfield v3i.iku Lc05;
      // 138: getfield Minecraft.oxn Lmoh;
      // 13b: getfield moh.gcj I
      // 13e: i2f
      // 13f: ldc 16.0
      // 141: nop
      // 142: fdiv
      // 143: fstore 10
      // 145: fload 10
      // 147: fconst_0
      // 148: fconst_1
      // 149: invokestatic fe6._f3 (FFF)F
      // 14c: fstore 10
      // 14e: fload 9
      // 150: fconst_1
      // 151: fload 10
      // 153: fsub
      // 154: fmul
      // 155: fload 10
      // 157: fadd
      // 158: fstore 11
      // 15a: aload 0
      // 15b: dup
      // 15c: getfield v3i.inn F
      // 15f: fload 11
      // 161: aload 0
      // 162: getfield v3i.inn F
      // 165: fsub
      // 166: ldc 0.1
      // 168: nop
      // 169: fmul
      // 16a: fadd
      // 16b: putfield v3i.inn F
      // 16e: aload 0
      // 16f: dup
      // 170: getfield v3i.g6g I
      // 173: bipush 1
      // 174: iadd
      // 175: putfield v3i.g6g I
      // 178: aload 0
      // 179: getfield v3i._ld Lmlb;
      // 17c: invokevirtual mlb.krw ()V
      // 17f: aload 0
      // 180: invokespecial v3i.oyq ()V
      // 183: aload 0
      // 184: aload 0
      // 185: getfield v3i.gbx F
      // 188: putfield v3i.yph F
      // 18b: getstatic pq9._m8 Z
      // 18e: iload 1
      // 18f: ifeq 1ef
      // 192: ifeq 1d7
      // 195: goto 19c
      // 198: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19b: athrow
      // 19c: aload 0
      // 19d: dup
      // 19e: getfield v3i.gbx F
      // 1a1: ldc 0.05
      // 1a3: nop
      // 1a4: fadd
      // 1a5: putfield v3i.gbx F
      // 1a8: aload 0
      // 1a9: getfield v3i.gbx F
      // 1ac: fconst_1
      // 1ad: fcmpl
      // 1ae: iload 1
      // 1af: ifeq 1d0
      // 1b2: goto 1b9
      // 1b5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b8: athrow
      // 1b9: ifle 1cf
      // 1bc: goto 1c3
      // 1bf: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: fconst_1
      // 1c5: putfield v3i.gbx F
      // 1c8: goto 1cf
      // 1cb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ce: athrow
      // 1cf: bipush 0
      // 1d0: putstatic pq9._m8 Z
      // 1d3: iload 1
      // 1d4: ifne 1fe
      // 1d7: aload 0
      // 1d8: iload 1
      // 1d9: ifeq 1f3
      // 1dc: goto 1e3
      // 1df: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e2: athrow
      // 1e3: getfield v3i.gbx F
      // 1e6: fconst_0
      // 1e7: fcmpl
      // 1e8: goto 1ef
      // 1eb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: ifle 1fe
      // 1f2: aload 0
      // 1f3: dup
      // 1f4: getfield v3i.gbx F
      // 1f7: ldc 0.0125
      // 1f9: nop
      // 1fa: fsub
      // 1fb: putfield v3i.gbx F
      // 1fe: return
   }

   public qn4 oqr() {
      return this.n5u;
   }

   public void ppz(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: getstatic gis.jap Z
      // 07: ifeq 3f
      // 0a: aload 0
      // 0b: iload 3
      // 0c: ifne 34
      // 0f: goto 16
      // 12: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: getfield v3i.n5u Lqn4;
      // 19: ifnull 33
      // 1c: goto 23
      // 1f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 0
      // 24: getfield v3i.n5u Lqn4;
      // 27: iload 1
      // 28: iload 2
      // 29: invokevirtual qn4.s_6 (II)V
      // 2c: goto 33
      // 2f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: getfield v3i.iku Lc05;
      // 37: getfield Minecraft.vsl Lcrp;
      // 3a: iload 1
      // 3b: iload 2
      // 3c: invokevirtual crp.w4e (II)V
      // 3f: return
   }

   public void vul(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 9665960137434
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield v3i.iku Lc05;
      // 011: invokevirtual Minecraft.nsd ()Li2h;
      // 014: astore 5
      // 016: aload 5
      // 018: ifnull 447
      // 01b: aload 0
      // 01c: getfield v3i.iku Lc05;
      // 01f: iload 4
      // 021: ifne 063
      // 024: goto 02b
      // 027: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: getfield Minecraft.tij Lkh3;
      // 02e: ifnull 447
      // 031: goto 038
      // 034: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: aload 0
      // 039: getfield v3i.iku Lc05;
      // 03c: getfield Minecraft.ba0 Luan;
      // 03f: sipush 26363
      // 042: ldc2_w 220188771219762398
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: nop
      // 04d: invokevirtual uan.qek (Ljava/lang/String;)V
      // 050: aload 0
      // 051: getfield v3i.iku Lc05;
      // 054: aconst_null
      // 055: putfield Minecraft.p3_ Li2h;
      // 058: aload 0
      // 059: getfield v3i.iku Lc05;
      // 05c: goto 063
      // 05f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: getfield Minecraft.l7q Lhh6;
      // 066: invokevirtual hh6.gxw ()F
      // 069: f2d
      // 06a: dstore 6
      // 06c: aload 0
      // 06d: getfield v3i.iku Lc05;
      // 070: aload 5
      // 072: dload 6
      // 074: fload 1
      // 075: invokevirtual EntityLivingBase.mcz (DF)Lakm;
      // 078: putfield Minecraft.dzk Lakm;
      // 07b: dload 6
      // 07d: dstore 8
      // 07f: aload 5
      // 081: fload 1
      // 082: invokevirtual EntityLivingBase.tib (F)Lfqr;
      // 085: astore 10
      // 087: bipush 0
      // 088: istore 11
      // 08a: bipush 1
      // 08b: istore 12
      // 08d: aload 0
      // 08e: getfield v3i.iku Lc05;
      // 091: getfield Minecraft.l7q Lhh6;
      // 094: invokevirtual hh6.p65 ()Z
      // 097: iload 4
      // 099: ifne 0c2
      // 09c: ifeq 0b5
      // 09f: goto 0a6
      // 0a2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: ldc2_w 6.0
      // 0a9: dstore 6
      // 0ab: ldc2_w 6.0
      // 0ae: dstore 8
      // 0b0: iload 4
      // 0b2: ifeq 104
      // 0b5: getstatic ModuleRegistry.vb_ Lee_;
      // 0b8: invokevirtual ee_.klu ()Z
      // 0bb: goto 0c2
      // 0be: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: iload 4
      // 0c4: ifne 0f2
      // 0c7: ifeq 0e5
      // 0ca: goto 0d1
      // 0cd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: getstatic ee_.ma9 Lcrk;
      // 0d4: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 0d7: invokevirtual java/lang/Float.floatValue ()F
      // 0da: f2d
      // 0db: dup2
      // 0dc: dstore 8
      // 0de: dstore 6
      // 0e0: iload 4
      // 0e2: ifeq 104
      // 0e5: dload 6
      // 0e7: ldc2_w 3.0
      // 0ea: dcmpl
      // 0eb: goto 0f2
      // 0ee: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: iload 4
      // 0f4: ifne 102
      // 0f7: ifle 104
      // 0fa: goto 101
      // 0fd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: bipush 1
      // 102: istore 11
      // 104: aload 0
      // 105: getfield v3i.iku Lc05;
      // 108: getfield Minecraft.dzk Lakm;
      // 10b: iload 4
      // 10d: ifne 128
      // 110: ifnull 132
      // 113: goto 11a
      // 116: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 0
      // 11b: getfield v3i.iku Lc05;
      // 11e: getfield Minecraft.dzk Lakm;
      // 121: goto 128
      // 124: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: getfield akm.jhn Lfqr;
      // 12b: aload 10
      // 12d: invokevirtual fqr.b4d (Lfqr;)D
      // 130: dstore 8
      // 132: aload 5
      // 134: fload 1
      // 135: invokevirtual EntityLivingBase.wej (F)Lfqr;
      // 138: astore 13
      // 13a: aload 10
      // 13c: aload 13
      // 13e: getfield fqr.lvi D
      // 141: dload 6
      // 143: dmul
      // 144: aload 13
      // 146: getfield fqr.gn5 D
      // 149: dload 6
      // 14b: dmul
      // 14c: aload 13
      // 14e: getfield fqr.bn2 D
      // 151: dload 6
      // 153: dmul
      // 154: invokevirtual fqr.r2x (DDD)Lfqr;
      // 157: astore 14
      // 159: aload 0
      // 15a: aconst_null
      // 15b: putfield v3i.gg8 Li2h;
      // 15e: aconst_null
      // 15f: astore 15
      // 161: fconst_1
      // 162: fstore 16
      // 164: aload 0
      // 165: getfield v3i.iku Lc05;
      // 168: getfield Minecraft.tij Lkh3;
      // 16b: aload 5
      // 16d: aload 5
      // 16f: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 172: aload 13
      // 174: getfield fqr.lvi D
      // 177: dload 6
      // 179: dmul
      // 17a: aload 13
      // 17c: getfield fqr.gn5 D
      // 17f: dload 6
      // 181: dmul
      // 182: aload 13
      // 184: getfield fqr.bn2 D
      // 187: dload 6
      // 189: dmul
      // 18a: invokevirtual nh4.z9h (DDD)Lnh4;
      // 18d: fload 16
      // 18f: f2d
      // 190: fload 16
      // 192: f2d
      // 193: fload 16
      // 195: f2d
      // 196: invokevirtual nh4.c2h (DDD)Lnh4;
      // 199: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 19c: new v3i$1
      // 19f: dup
      // 1a0: aload 0
      // 1a1: invokespecial v3i$1.<init> (Lv3i;)V
      // 1a4: invokestatic com/google/common/base/Predicates.and (Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 1a7: invokevirtual WorldClient.sr2 (Li2h;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 1aa: astore 17
      // 1ac: dload 8
      // 1ae: dstore 18
      // 1b0: bipush 0
      // 1b1: istore 20
      // 1b3: iload 20
      // 1b5: aload 17
      // 1b7: invokeinterface java/util/List.size ()I 1
      // 1bc: if_icmpge 326
      // 1bf: aload 17
      // 1c1: iload 20
      // 1c3: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1c8: checkcast EntityLivingBase
      // 1cb: astore 21
      // 1cd: aload 21
      // 1cf: invokevirtual EntityLivingBase.npl ()F
      // 1d2: fstore 22
      // 1d4: aload 21
      // 1d6: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 1d9: fload 22
      // 1db: f2d
      // 1dc: fload 22
      // 1de: f2d
      // 1df: fload 22
      // 1e1: f2d
      // 1e2: invokevirtual nh4.c2h (DDD)Lnh4;
      // 1e5: astore 23
      // 1e7: aload 23
      // 1e9: aload 10
      // 1eb: aload 14
      // 1ed: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 1f0: astore 24
      // 1f2: aload 23
      // 1f4: aload 10
      // 1f6: invokevirtual nh4.fd8 (Lfqr;)Z
      // 1f9: iload 4
      // 1fb: ifne 3b1
      // 1fe: iload 4
      // 200: ifne 21f
      // 203: goto 20a
      // 206: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: ifeq 258
      // 20d: goto 214
      // 210: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 213: athrow
      // 214: dload 18
      // 216: dconst_0
      // 217: dcmpl
      // 218: goto 21f
      // 21b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: iflt 31e
      // 222: aload 0
      // 223: aload 21
      // 225: putfield v3i.gg8 Li2h;
      // 228: aload 24
      // 22a: iload 4
      // 22c: ifne 24b
      // 22f: goto 236
      // 232: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 235: athrow
      // 236: ifnonnull 249
      // 239: goto 240
      // 23c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23f: athrow
      // 240: aload 10
      // 242: goto 24e
      // 245: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 248: athrow
      // 249: aload 24
      // 24b: getfield akm.jhn Lfqr;
      // 24e: astore 15
      // 250: dconst_0
      // 251: dstore 18
      // 253: iload 4
      // 255: ifeq 31e
      // 258: aload 24
      // 25a: ifnull 31e
      // 25d: goto 264
      // 260: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 263: athrow
      // 264: aload 10
      // 266: aload 24
      // 268: getfield akm.jhn Lfqr;
      // 26b: invokevirtual fqr.b4d (Lfqr;)D
      // 26e: dstore 25
      // 270: dload 25
      // 272: dload 18
      // 274: dcmpg
      // 275: iload 4
      // 277: ifne 29f
      // 27a: iflt 29e
      // 27d: goto 284
      // 280: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 283: athrow
      // 284: dload 18
      // 286: dconst_0
      // 287: dcmpl
      // 288: iload 4
      // 28a: ifne 29f
      // 28d: goto 294
      // 290: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 293: athrow
      // 294: ifne 31e
      // 297: goto 29e
      // 29a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29d: athrow
      // 29e: bipush 0
      // 29f: istore 27
      // 2a1: getstatic net/optifine/reflect/Reflector.ForgeEntity_canRiderInteract Lnet/optifine/reflect/ReflectorMethod;
      // 2a4: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 2a7: iload 4
      // 2a9: ifne 2c9
      // 2ac: ifeq 2cb
      // 2af: goto 2b6
      // 2b2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: aload 21
      // 2b8: getstatic net/optifine/reflect/Reflector.ForgeEntity_canRiderInteract Lnet/optifine/reflect/ReflectorMethod;
      // 2bb: bipush 0
      // 2bc: anewarray 84
      // 2bf: invokestatic net/optifine/reflect/Reflector.callBoolean (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 2c2: goto 2c9
      // 2c5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c8: athrow
      // 2c9: istore 27
      // 2cb: aload 21
      // 2cd: aload 5
      // 2cf: getfield EntityLivingBase.hzp Li2h;
      // 2d2: if_acmpne 30d
      // 2d5: iload 27
      // 2d7: iload 4
      // 2d9: ifne 2f8
      // 2dc: goto 2e3
      // 2df: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e2: athrow
      // 2e3: ifne 30d
      // 2e6: goto 2ed
      // 2e9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ec: athrow
      // 2ed: dload 18
      // 2ef: dconst_0
      // 2f0: dcmpl
      // 2f1: goto 2f8
      // 2f4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f7: athrow
      // 2f8: ifne 31e
      // 2fb: aload 0
      // 2fc: aload 21
      // 2fe: putfield v3i.gg8 Li2h;
      // 301: aload 24
      // 303: getfield akm.jhn Lfqr;
      // 306: astore 15
      // 308: iload 4
      // 30a: ifeq 31e
      // 30d: aload 0
      // 30e: aload 21
      // 310: putfield v3i.gg8 Li2h;
      // 313: aload 24
      // 315: getfield akm.jhn Lfqr;
      // 318: astore 15
      // 31a: dload 25
      // 31c: dstore 18
      // 31e: iinc 20 1
      // 321: iload 4
      // 323: ifeq 1b3
      // 326: aload 0
      // 327: getfield v3i.gg8 Li2h;
      // 32a: iload 4
      // 32c: ifne 3a2
      // 32f: ifnull 392
      // 332: goto 339
      // 335: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 338: athrow
      // 339: iload 11
      // 33b: iload 4
      // 33d: ifne 363
      // 340: goto 347
      // 343: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 346: athrow
      // 347: ifeq 392
      // 34a: goto 351
      // 34d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 350: athrow
      // 351: aload 10
      // 353: aload 15
      // 355: invokevirtual fqr.b4d (Lfqr;)D
      // 358: ldc2_w 3.0
      // 35b: dcmpl
      // 35c: goto 363
      // 35f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 362: athrow
      // 363: ifle 392
      // 366: aload 0
      // 367: aconst_null
      // 368: putfield v3i.gg8 Li2h;
      // 36b: aload 0
      // 36c: getfield v3i.iku Lc05;
      // 36f: new akm
      // 372: dup
      // 373: getstatic akm$qs6.du5 Lakm$qs6;
      // 376: aload 15
      // 378: aconst_null
      // 379: checkcast vt2
      // 37c: new mew
      // 37f: dup
      // 380: aload 15
      // 382: invokespecial mew.<init> (Lfqr;)V
      // 385: invokespecial akm.<init> (Lakm$qs6;Lfqr;Lvt2;Lmew;)V
      // 388: putfield Minecraft.dzk Lakm;
      // 38b: goto 392
      // 38e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 391: athrow
      // 392: aload 0
      // 393: iload 4
      // 395: ifne 43e
      // 398: getfield v3i.gg8 Li2h;
      // 39b: goto 3a2
      // 39e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a1: athrow
      // 3a2: ifnull 43d
      // 3a5: dload 18
      // 3a7: dload 8
      // 3a9: dcmpg
      // 3aa: goto 3b1
      // 3ad: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b0: athrow
      // 3b1: iload 4
      // 3b3: ifne 40b
      // 3b6: iflt 3dd
      // 3b9: goto 3c0
      // 3bc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bf: athrow
      // 3c0: aload 0
      // 3c1: getfield v3i.iku Lc05;
      // 3c4: iload 4
      // 3c6: ifne 441
      // 3c9: goto 3d0
      // 3cc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: getfield Minecraft.dzk Lakm;
      // 3d3: ifnonnull 43d
      // 3d6: goto 3dd
      // 3d9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3dc: athrow
      // 3dd: aload 0
      // 3de: getfield v3i.iku Lc05;
      // 3e1: new akm
      // 3e4: dup
      // 3e5: aload 0
      // 3e6: getfield v3i.gg8 Li2h;
      // 3e9: aload 15
      // 3eb: invokespecial akm.<init> (Li2h;Lfqr;)V
      // 3ee: putfield Minecraft.dzk Lakm;
      // 3f1: aload 0
      // 3f2: iload 4
      // 3f4: ifne 433
      // 3f7: goto 3fe
      // 3fa: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fd: athrow
      // 3fe: getfield v3i.gg8 Li2h;
      // 401: instanceof Entity
      // 404: goto 40b
      // 407: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40a: athrow
      // 40b: ifne 42b
      // 40e: aload 0
      // 40f: iload 4
      // 411: ifne 43e
      // 414: goto 41b
      // 417: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41a: athrow
      // 41b: getfield v3i.gg8 Li2h;
      // 41e: instanceof co7
      // 421: ifeq 43d
      // 424: goto 42b
      // 427: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42a: athrow
      // 42b: aload 0
      // 42c: goto 433
      // 42f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 432: athrow
      // 433: getfield v3i.iku Lc05;
      // 436: aload 0
      // 437: getfield v3i.gg8 Li2h;
      // 43a: putfield Minecraft.p3_ Li2h;
      // 43d: aload 0
      // 43e: getfield v3i.iku Lc05;
      // 441: getfield Minecraft.ba0 Luan;
      // 444: invokevirtual uan.uio ()V
      // 447: return
   }

   private void ntc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: fconst_1
      // 05: fstore 2
      // 06: aload 0
      // 07: getfield v3i.iku Lc05;
      // 0a: invokevirtual Minecraft.nsd ()Li2h;
      // 0d: instanceof x0l
      // 10: iload 1
      // 11: ifne 51
      // 14: ifeq 2e
      // 17: goto 1e
      // 1a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield v3i.iku Lc05;
      // 22: invokevirtual Minecraft.nsd ()Li2h;
      // 25: checkcast x0l
      // 28: astore 3
      // 29: aload 3
      // 2a: invokevirtual x0l.rgq ()F
      // 2d: fstore 2
      // 2e: aload 0
      // 2f: aload 0
      // 30: getfield v3i.oh1 F
      // 33: putfield v3i.sr0 F
      // 36: aload 0
      // 37: dup
      // 38: getfield v3i.oh1 F
      // 3b: fload 2
      // 3c: aload 0
      // 3d: getfield v3i.oh1 F
      // 40: fsub
      // 41: ldc 0.5
      // 43: nop
      // 44: fmul
      // 45: fadd
      // 46: putfield v3i.oh1 F
      // 49: aload 0
      // 4a: getfield v3i.oh1 F
      // 4d: ldc 1.5
      // 4f: nop
      // 50: fcmpl
      // 51: iload 1
      // 52: ifne 75
      // 55: ifle 6d
      // 58: goto 5f
      // 5b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 0
      // 60: ldc 1.5
      // 62: nop
      // 63: putfield v3i.oh1 F
      // 66: goto 6d
      // 69: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield v3i.oh1 F
      // 71: ldc 0.1
      // 73: nop
      // 74: fcmpg
      // 75: iload 1
      // 76: ifne 97
      // 79: ifge 91
      // 7c: goto 83
      // 7f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 0
      // 84: ldc 0.1
      // 86: nop
      // 87: putfield v3i.oh1 F
      // 8a: goto 91
      // 8d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: getstatic ModuleRegistry.a80 Lqus;
      // 94: invokevirtual qus.klu ()Z
      // 97: ifeq b2
      // 9a: aload 0
      // 9b: getstatic ModuleRegistry.a80 Lqus;
      // 9e: pop
      // 9f: getstatic qus.aad Lcrk;
      // a2: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // a5: invokevirtual java/lang/Float.floatValue ()F
      // a8: putfield v3i.oh1 F
      // ab: goto b2
      // ae: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: return
   }

   private float pcw(float param1, boolean param2) {
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
      // 005: iload 3
      // 006: ifeq 01f
      // 009: getfield v3i.mrg Z
      // 00c: ifeq 01e
      // 00f: goto 016
      // 012: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: ldc 90.0
      // 018: nop
      // 019: freturn
      // 01a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield v3i.iku Lc05;
      // 022: invokevirtual Minecraft.nsd ()Li2h;
      // 025: astore 4
      // 027: ldc 70.0
      // 029: nop
      // 02a: fstore 5
      // 02c: iload 2
      // 02d: iload 3
      // 02e: ifeq 06e
      // 031: ifeq 06d
      // 034: goto 03b
      // 037: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield v3i.iku Lc05;
      // 03f: getfield Minecraft.oxn Lmoh;
      // 042: getfield moh.sy5 F
      // 045: fstore 5
      // 047: invokestatic hxt.ptk ()Z
      // 04a: iload 3
      // 04b: ifeq 06e
      // 04e: ifeq 06d
      // 051: goto 058
      // 054: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 057: athrow
      // 058: fload 5
      // 05a: aload 0
      // 05b: getfield v3i.sr0 F
      // 05e: aload 0
      // 05f: getfield v3i.oh1 F
      // 062: aload 0
      // 063: getfield v3i.sr0 F
      // 066: fsub
      // 067: fload 1
      // 068: fmul
      // 069: fadd
      // 06a: fmul
      // 06b: fstore 5
      // 06d: bipush 0
      // 06e: istore 6
      // 070: aload 0
      // 071: getfield v3i.iku Lc05;
      // 074: iload 3
      // 075: ifeq 090
      // 078: getfield Minecraft.u0y Lgbe;
      // 07b: ifnonnull 0a4
      // 07e: goto 085
      // 081: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: aload 0
      // 086: getfield v3i.iku Lc05;
      // 089: goto 090
      // 08c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: getfield Minecraft.oxn Lmoh;
      // 093: astore 7
      // 095: aload 0
      // 096: getfield v3i.iku Lc05;
      // 099: getfield Minecraft.oxn Lmoh;
      // 09c: getfield moh._k8 Lm7l;
      // 09f: invokestatic moh.nh4 (Lm7l;)Z
      // 0a2: istore 6
      // 0a4: iload 6
      // 0a6: iload 3
      // 0a7: ifeq 114
      // 0aa: ifeq 10a
      // 0ad: goto 0b4
      // 0b0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b3: athrow
      // 0b4: getstatic hxt.shm Z
      // 0b7: iload 3
      // 0b8: ifeq 0f0
      // 0bb: goto 0c2
      // 0be: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: ifne 0ed
      // 0c5: goto 0cc
      // 0c8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: bipush 1
      // 0cd: putstatic hxt.shm Z
      // 0d0: aload 0
      // 0d1: getfield v3i.iku Lc05;
      // 0d4: getfield Minecraft.oxn Lmoh;
      // 0d7: bipush 1
      // 0d8: putfield moh.glc Z
      // 0db: aload 0
      // 0dc: getfield v3i.iku Lc05;
      // 0df: getfield Minecraft.vsl Lcrp;
      // 0e2: bipush 1
      // 0e3: putfield crp.jli Z
      // 0e6: goto 0ed
      // 0e9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: getstatic hxt.shm Z
      // 0f0: iload 3
      // 0f1: ifeq 15e
      // 0f4: ifeq 159
      // 0f7: goto 0fe
      // 0fa: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: fload 5
      // 100: ldc 4.0
      // 102: nop
      // 103: fdiv
      // 104: fstore 5
      // 106: iload 3
      // 107: ifne 159
      // 10a: getstatic hxt.shm Z
      // 10d: goto 114
      // 110: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: iload 3
      // 115: ifeq 15e
      // 118: ifeq 159
      // 11b: goto 122
      // 11e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: bipush 0
      // 123: putstatic hxt.shm Z
      // 126: aload 0
      // 127: getfield v3i.iku Lc05;
      // 12a: getfield Minecraft.oxn Lmoh;
      // 12d: bipush 0
      // 12e: putfield moh.glc Z
      // 131: aload 0
      // 132: new hsd
      // 135: dup
      // 136: invokespecial hsd.<init> ()V
      // 139: putfield v3i.vzz Lhsd;
      // 13c: aload 0
      // 13d: new hsd
      // 140: dup
      // 141: invokespecial hsd.<init> ()V
      // 144: putfield v3i.lvr Lhsd;
      // 147: aload 0
      // 148: getfield v3i.iku Lc05;
      // 14b: getfield Minecraft.vsl Lcrp;
      // 14e: bipush 1
      // 14f: putfield crp.jli Z
      // 152: goto 159
      // 155: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 158: athrow
      // 159: aload 4
      // 15b: instanceof Entity
      // 15e: iload 3
      // 15f: ifeq 17d
      // 162: ifeq 1b4
      // 165: goto 16c
      // 168: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: aload 4
      // 16e: checkcast Entity
      // 171: invokevirtual Entity.i55 ()F
      // 174: fconst_0
      // 175: fcmpg
      // 176: goto 17d
      // 179: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: iload 3
      // 17e: ifeq 19a
      // 181: ifgt 1b4
      // 184: goto 18b
      // 187: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: aload 4
      // 18d: checkcast Entity
      // 190: getfield Entity.qur I
      // 193: goto 19a
      // 196: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: i2f
      // 19b: fload 1
      // 19c: fadd
      // 19d: fstore 7
      // 19f: fload 5
      // 1a1: fconst_1
      // 1a2: ldc 500.0
      // 1a4: nop
      // 1a5: fload 7
      // 1a7: ldc 500.0
      // 1a9: nop
      // 1aa: fadd
      // 1ab: fdiv
      // 1ac: fsub
      // 1ad: fconst_2
      // 1ae: fmul
      // 1af: fconst_1
      // 1b0: fadd
      // 1b1: fdiv
      // 1b2: fstore 5
      // 1b4: aload 0
      // 1b5: getfield v3i.iku Lc05;
      // 1b8: getfield Minecraft.tij Lkh3;
      // 1bb: aload 4
      // 1bd: fload 1
      // 1be: invokestatic bm4.te3 (Lt9d;Li2h;F)Le0x;
      // 1c1: astore 7
      // 1c3: aload 7
      // 1c5: invokevirtual e0x.p1r ()Lp3y;
      // 1c8: getstatic p3y.six Lp3y;
      // 1cb: if_acmpne 1da
      // 1ce: fload 5
      // 1d0: ldc 60.0
      // 1d2: nop
      // 1d3: fmul
      // 1d4: ldc 70.0
      // 1d6: nop
      // 1d7: fdiv
      // 1d8: fstore 5
      // 1da: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getFOVModifier Lnet/optifine/reflect/ReflectorMethod;
      // 1dd: iload 3
      // 1de: ifeq 1f8
      // 1e1: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 1e4: ifeq 21f
      // 1e7: goto 1ee
      // 1ea: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ed: athrow
      // 1ee: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getFOVModifier Lnet/optifine/reflect/ReflectorMethod;
      // 1f1: goto 1f8
      // 1f4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f7: athrow
      // 1f8: bipush 5
      // 1f9: anewarray 84
      // 1fc: dup
      // 1fd: bipush 0
      // 1fe: aload 0
      // 1ff: aastore
      // 200: dup
      // 201: bipush 1
      // 202: aload 4
      // 204: aastore
      // 205: dup
      // 206: bipush 2
      // 207: aload 7
      // 209: aastore
      // 20a: dup
      // 20b: bipush 3
      // 20c: fload 1
      // 20d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 210: aastore
      // 211: dup
      // 212: bipush 4
      // 213: fload 5
      // 215: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 218: aastore
      // 219: invokestatic net/optifine/reflect/Reflector.callFloat (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)F
      // 21c: goto 221
      // 21f: fload 5
      // 221: freturn
   }

   private void t5g(float var1) {
      int var2 = OpaquePredicate.c();

      EntityLivingBase var14;
      label70: {
         label69: {
            try {
               var10000 = ModuleRegistry.grm.klu();
               if (var2 != 0) {
                  break label69;
               }

               if (var10000) {
                  return;
               }
            } catch (JsonSyntaxException var10) {
               throw a(var10);
            }

            try {
               var14 = this.iku.nsd();
               if (var2 != 0) {
                  break label70;
               }

               var10000 = var14 instanceof Entity;
            } catch (JsonSyntaxException var9) {
               throw a(var9);
            }
         }

         try {
            if (!var10000) {
               return;
            }

            var14 = this.iku.nsd();
         } catch (JsonSyntaxException var8) {
            throw a(var8);
         }
      }

      Entity var3 = (Entity)var14;
      float var4 = (float)var3.gx0 - var1;

      float var10001;
      label76: {
         label53: {
            label52: {
               try {
                  float var17;
                  var15 = (var17 = var3.i55() - 0.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
                  if (var2 != 0) {
                     break label53;
                  }

                  if (var15 > 0) {
                     break label52;
                  }
               } catch (JsonSyntaxException var7) {
                  throw a(var7);
               }

               float var5 = (float)var3.qur + var1;
               hzu.a2h(40.0F - 8000.0F / (var5 + 200.0F), 0.0F, 0.0F, 1.0F);
            }

            try {
               var16 = var4;
               var10001 = 0.0F;
               if (var2 != 0) {
                  break label76;
               }

               float var18;
               var15 = (var18 = var4 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
            } catch (JsonSyntaxException var6) {
               throw a(var6);
            }
         }

         if (var15 < 0) {
            return;
         }

         var4 /= (float)var3.x_3;
         var16 = var4 * var4 * var4 * var4;
         var10001 = (float) Math.PI;
      }

      var4 = fe6.rtn(var16 * var10001);
      float var13 = var3.rth;
      hzu.a2h(-var13, 0.0F, 1.0F, 0.0F);
      hzu.a2h(-var4 * 14.0F, 0.0F, 0.0F, 1.0F);
      hzu.a2h(var13, 0.0F, 1.0F, 0.0F);
   }

   private void u_e(float param1) {
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
      // 05: getfield v3i.iku Lc05;
      // 08: invokevirtual Minecraft.nsd ()Li2h;
      // 0b: iload 2
      // 0c: ifeq 2a
      // 0f: instanceof ha9
      // 12: ifeq e6
      // 15: goto 1c
      // 18: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield v3i.iku Lc05;
      // 20: invokevirtual Minecraft.nsd ()Li2h;
      // 23: goto 2a
      // 26: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: checkcast ha9
      // 2d: astore 3
      // 2e: aload 3
      // 2f: getfield ha9.odd F
      // 32: aload 3
      // 33: getfield ha9.c9u F
      // 36: fsub
      // 37: fstore 4
      // 39: aload 3
      // 3a: getfield ha9.odd F
      // 3d: fload 4
      // 3f: fload 1
      // 40: fmul
      // 41: fadd
      // 42: fneg
      // 43: fstore 5
      // 45: aload 3
      // 46: getfield ha9.igu F
      // 49: aload 3
      // 4a: getfield ha9.tfv F
      // 4d: aload 3
      // 4e: getfield ha9.igu F
      // 51: fsub
      // 52: fload 1
      // 53: fmul
      // 54: fadd
      // 55: fstore 6
      // 57: aload 3
      // 58: getfield ha9.vz1 F
      // 5b: aload 3
      // 5c: getfield ha9.sep F
      // 5f: aload 3
      // 60: getfield ha9.vz1 F
      // 63: fsub
      // 64: fload 1
      // 65: fmul
      // 66: fadd
      // 67: fstore 7
      // 69: iload 2
      // 6a: ifeq de
      // 6d: getstatic ClientState.__a Lcn7;
      // 70: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 73: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 76: ifne ab
      // 79: goto 80
      // 7c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: fload 5
      // 82: ldc 3.1415927
      // 84: nop
      // 85: fmul
      // 86: invokestatic fe6.rtn (F)F
      // 89: fload 6
      // 8b: fmul
      // 8c: ldc 0.5
      // 8e: nop
      // 8f: fmul
      // 90: fload 5
      // 92: ldc 3.1415927
      // 94: nop
      // 95: fmul
      // 96: invokestatic fe6.ssk (F)F
      // 99: fload 6
      // 9b: fmul
      // 9c: invokestatic java/lang/Math.abs (F)F
      // 9f: fneg
      // a0: fconst_0
      // a1: invokestatic hzu.a4k (FFF)V
      // a4: goto ab
      // a7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa: athrow
      // ab: fload 5
      // ad: ldc 3.1415927
      // af: nop
      // b0: fmul
      // b1: invokestatic fe6.rtn (F)F
      // b4: fload 6
      // b6: fmul
      // b7: ldc 3.0
      // b9: nop
      // ba: fmul
      // bb: fconst_0
      // bc: fconst_0
      // bd: fconst_1
      // be: invokestatic hzu.a2h (FFFF)V
      // c1: fload 5
      // c3: ldc 3.1415927
      // c5: nop
      // c6: fmul
      // c7: ldc 0.2
      // c9: nop
      // ca: fsub
      // cb: invokestatic fe6.ssk (F)F
      // ce: fload 6
      // d0: fmul
      // d1: invokestatic java/lang/Math.abs (F)F
      // d4: ldc 5.0
      // d6: nop
      // d7: fmul
      // d8: fconst_1
      // d9: fconst_0
      // da: fconst_0
      // db: invokestatic hzu.a2h (FFFF)V
      // de: fload 7
      // e0: fconst_1
      // e1: fconst_0
      // e2: fconst_0
      // e3: invokestatic hzu.a2h (FFFF)V
      // e6: return
   }

   public void pmp(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield v3i.iku Lc05;
      // 004: invokevirtual Minecraft.nsd ()Li2h;
      // 007: astore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: aload 3
      // 00c: invokevirtual EntityLivingBase.c5y ()F
      // 00f: fstore 4
      // 011: istore 2
      // 012: aload 3
      // 013: getfield EntityLivingBase.bc1 D
      // 016: aload 3
      // 017: getfield EntityLivingBase.o2v D
      // 01a: aload 3
      // 01b: getfield EntityLivingBase.bc1 D
      // 01e: dsub
      // 01f: fload 1
      // 020: f2d
      // 021: dmul
      // 022: dadd
      // 023: dstore 5
      // 025: aload 3
      // 026: getfield EntityLivingBase.o_z D
      // 029: aload 3
      // 02a: getfield EntityLivingBase.kfp D
      // 02d: aload 3
      // 02e: getfield EntityLivingBase.o_z D
      // 031: dsub
      // 032: fload 1
      // 033: f2d
      // 034: dmul
      // 035: dadd
      // 036: fload 4
      // 038: f2d
      // 039: dadd
      // 03a: dstore 7
      // 03c: aload 3
      // 03d: getfield EntityLivingBase.a4d D
      // 040: aload 3
      // 041: getfield EntityLivingBase.vbd D
      // 044: aload 3
      // 045: getfield EntityLivingBase.a4d D
      // 048: dsub
      // 049: fload 1
      // 04a: f2d
      // 04b: dmul
      // 04c: dadd
      // 04d: dstore 9
      // 04f: aload 3
      // 050: instanceof Entity
      // 053: iload 2
      // 054: ifeq 188
      // 057: ifeq 16c
      // 05a: goto 061
      // 05d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 3
      // 062: checkcast Entity
      // 065: invokevirtual Entity.ofg ()Z
      // 068: iload 2
      // 069: ifeq 188
      // 06c: goto 073
      // 06f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: ifeq 16c
      // 076: goto 07d
      // 079: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: fload 4
      // 07f: f2d
      // 080: dconst_1
      // 081: dadd
      // 082: d2f
      // 083: fstore 4
      // 085: fconst_0
      // 086: ldc 0.3
      // 088: nop
      // 089: fconst_0
      // 08a: invokestatic hzu.a4k (FFF)V
      // 08d: aload 0
      // 08e: getfield v3i.iku Lc05;
      // 091: getfield Minecraft.oxn Lmoh;
      // 094: getfield moh.lwu Z
      // 097: iload 2
      // 098: ifeq 3a9
      // 09b: ifne 3a3
      // 09e: goto 0a5
      // 0a1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: new mew
      // 0a8: dup
      // 0a9: aload 3
      // 0aa: invokespecial mew.<init> (Li2h;)V
      // 0ad: astore 11
      // 0af: aload 0
      // 0b0: getfield v3i.iku Lc05;
      // 0b3: getfield Minecraft.tij Lkh3;
      // 0b6: aload 11
      // 0b8: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0bb: astore 12
      // 0bd: aload 12
      // 0bf: invokeinterface zfz.r_y ()Le0x; 1
      // 0c4: astore 13
      // 0c6: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_orientBedCamera Lnet/optifine/reflect/ReflectorMethod;
      // 0c9: iload 2
      // 0ca: ifeq 0e4
      // 0cd: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 0d0: ifeq 107
      // 0d3: goto 0da
      // 0d6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_orientBedCamera Lnet/optifine/reflect/ReflectorMethod;
      // 0dd: goto 0e4
      // 0e0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: bipush 4
      // 0e5: anewarray 84
      // 0e8: dup
      // 0e9: bipush 0
      // 0ea: aload 0
      // 0eb: getfield v3i.iku Lc05;
      // 0ee: getfield Minecraft.tij Lkh3;
      // 0f1: aastore
      // 0f2: dup
      // 0f3: bipush 1
      // 0f4: aload 11
      // 0f6: aastore
      // 0f7: dup
      // 0f8: bipush 2
      // 0f9: aload 12
      // 0fb: aastore
      // 0fc: dup
      // 0fd: bipush 3
      // 0fe: aload 3
      // 0ff: aastore
      // 100: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 103: iload 2
      // 104: ifne 134
      // 107: aload 13
      // 109: getstatic ox_.a6l Le0x;
      // 10c: if_acmpne 134
      // 10f: goto 116
      // 112: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: aload 12
      // 118: getstatic _8w.em9 Lqx_;
      // 11b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 120: checkcast vt2
      // 123: invokevirtual vt2.tmy ()I
      // 126: istore 14
      // 128: iload 14
      // 12a: bipush 90
      // 12c: imul
      // 12d: i2f
      // 12e: fconst_0
      // 12f: fconst_1
      // 130: fconst_0
      // 131: invokestatic hzu.a2h (FFFF)V
      // 134: aload 3
      // 135: getfield EntityLivingBase.p3h F
      // 138: aload 3
      // 139: getfield EntityLivingBase.x5k F
      // 13c: aload 3
      // 13d: getfield EntityLivingBase.p3h F
      // 140: fsub
      // 141: fload 1
      // 142: fmul
      // 143: fadd
      // 144: ldc 180.0
      // 146: nop
      // 147: fadd
      // 148: fconst_0
      // 149: ldc -1.0
      // 14b: nop
      // 14c: fconst_0
      // 14d: invokestatic hzu.a2h (FFFF)V
      // 150: aload 3
      // 151: getfield EntityLivingBase.j25 F
      // 154: aload 3
      // 155: getfield EntityLivingBase.y2i F
      // 158: aload 3
      // 159: getfield EntityLivingBase.j25 F
      // 15c: fsub
      // 15d: fload 1
      // 15e: fmul
      // 15f: fadd
      // 160: ldc -1.0
      // 162: nop
      // 163: fconst_0
      // 164: fconst_0
      // 165: invokestatic hzu.a2h (FFFF)V
      // 168: iload 2
      // 169: ifne 3a3
      // 16c: aload 0
      // 16d: iload 2
      // 16e: ifeq 18c
      // 171: goto 178
      // 174: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 177: athrow
      // 178: getfield v3i.iku Lc05;
      // 17b: getfield Minecraft.oxn Lmoh;
      // 17e: getfield moh.i_y I
      // 181: goto 188
      // 184: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 187: athrow
      // 188: ifle 394
      // 18b: aload 0
      // 18c: getfield v3i.xj9 F
      // 18f: aload 0
      // 190: getfield v3i.ry5 F
      // 193: aload 0
      // 194: getfield v3i.xj9 F
      // 197: fsub
      // 198: fload 1
      // 199: fmul
      // 19a: fadd
      // 19b: f2d
      // 19c: dstore 11
      // 19e: iload 2
      // 19f: ifeq 1c6
      // 1a2: aload 0
      // 1a3: getfield v3i.iku Lc05;
      // 1a6: getfield Minecraft.oxn Lmoh;
      // 1a9: getfield moh.lwu Z
      // 1ac: ifeq 1ca
      // 1af: goto 1b6
      // 1b2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b5: athrow
      // 1b6: fconst_0
      // 1b7: fconst_0
      // 1b8: dload 11
      // 1ba: dneg
      // 1bb: d2f
      // 1bc: invokestatic hzu.a4k (FFF)V
      // 1bf: goto 1c6
      // 1c2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c5: athrow
      // 1c6: iload 2
      // 1c7: ifne 390
      // 1ca: aload 3
      // 1cb: getfield EntityLivingBase.x5k F
      // 1ce: fstore 13
      // 1d0: aload 3
      // 1d1: getfield EntityLivingBase.y2i F
      // 1d4: fstore 14
      // 1d6: aload 0
      // 1d7: getfield v3i.iku Lc05;
      // 1da: getfield Minecraft.oxn Lmoh;
      // 1dd: getfield moh.i_y I
      // 1e0: bipush 2
      // 1e1: if_icmpne 1ec
      // 1e4: fload 14
      // 1e6: ldc 180.0
      // 1e8: nop
      // 1e9: fadd
      // 1ea: fstore 14
      // 1ec: fload 13
      // 1ee: ldc 180.0
      // 1f0: nop
      // 1f1: fdiv
      // 1f2: ldc 3.1415927
      // 1f4: nop
      // 1f5: fmul
      // 1f6: invokestatic fe6.rtn (F)F
      // 1f9: fneg
      // 1fa: fload 14
      // 1fc: ldc 180.0
      // 1fe: nop
      // 1ff: fdiv
      // 200: ldc 3.1415927
      // 202: nop
      // 203: fmul
      // 204: invokestatic fe6.ssk (F)F
      // 207: fmul
      // 208: f2d
      // 209: dload 11
      // 20b: dmul
      // 20c: dstore 15
      // 20e: fload 13
      // 210: ldc 180.0
      // 212: nop
      // 213: fdiv
      // 214: ldc 3.1415927
      // 216: nop
      // 217: fmul
      // 218: invokestatic fe6.ssk (F)F
      // 21b: fload 14
      // 21d: ldc 180.0
      // 21f: nop
      // 220: fdiv
      // 221: ldc 3.1415927
      // 223: nop
      // 224: fmul
      // 225: invokestatic fe6.ssk (F)F
      // 228: fmul
      // 229: f2d
      // 22a: dload 11
      // 22c: dmul
      // 22d: dstore 17
      // 22f: fload 14
      // 231: ldc 180.0
      // 233: nop
      // 234: fdiv
      // 235: ldc 3.1415927
      // 237: nop
      // 238: fmul
      // 239: invokestatic fe6.rtn (F)F
      // 23c: fneg
      // 23d: f2d
      // 23e: dload 11
      // 240: dmul
      // 241: dstore 19
      // 243: bipush 0
      // 244: istore 21
      // 246: iload 21
      // 248: bipush 8
      // 24a: if_icmpge 335
      // 24d: iload 21
      // 24f: bipush 1
      // 250: iand
      // 251: bipush 2
      // 252: imul
      // 253: bipush 1
      // 254: isub
      // 255: i2f
      // 256: fstore 22
      // 258: iload 21
      // 25a: bipush 1
      // 25b: ishr
      // 25c: bipush 1
      // 25d: iand
      // 25e: bipush 2
      // 25f: imul
      // 260: bipush 1
      // 261: isub
      // 262: i2f
      // 263: fstore 23
      // 265: iload 21
      // 267: bipush 2
      // 268: ishr
      // 269: bipush 1
      // 26a: iand
      // 26b: bipush 2
      // 26c: imul
      // 26d: bipush 1
      // 26e: isub
      // 26f: i2f
      // 270: fstore 24
      // 272: fload 22
      // 274: ldc 0.1
      // 276: nop
      // 277: fmul
      // 278: fstore 22
      // 27a: fload 23
      // 27c: ldc 0.1
      // 27e: nop
      // 27f: fmul
      // 280: fstore 23
      // 282: fload 24
      // 284: ldc 0.1
      // 286: nop
      // 287: fmul
      // 288: fstore 24
      // 28a: aload 0
      // 28b: getfield v3i.iku Lc05;
      // 28e: getfield Minecraft.tij Lkh3;
      // 291: new fqr
      // 294: dup
      // 295: dload 5
      // 297: fload 22
      // 299: f2d
      // 29a: dadd
      // 29b: dload 7
      // 29d: fload 23
      // 29f: f2d
      // 2a0: dadd
      // 2a1: dload 9
      // 2a3: fload 24
      // 2a5: f2d
      // 2a6: dadd
      // 2a7: invokespecial fqr.<init> (DDD)V
      // 2aa: new fqr
      // 2ad: dup
      // 2ae: dload 5
      // 2b0: dload 15
      // 2b2: dsub
      // 2b3: fload 22
      // 2b5: f2d
      // 2b6: dadd
      // 2b7: fload 24
      // 2b9: f2d
      // 2ba: dadd
      // 2bb: dload 7
      // 2bd: dload 19
      // 2bf: dsub
      // 2c0: fload 23
      // 2c2: f2d
      // 2c3: dadd
      // 2c4: dload 9
      // 2c6: dload 17
      // 2c8: dsub
      // 2c9: fload 24
      // 2cb: f2d
      // 2cc: dadd
      // 2cd: invokespecial fqr.<init> (DDD)V
      // 2d0: invokevirtual WorldClient.caq (Lfqr;Lfqr;)Lakm;
      // 2d3: astore 25
      // 2d5: iload 2
      // 2d6: ifeq 383
      // 2d9: iload 2
      // 2da: ifeq 331
      // 2dd: goto 2e4
      // 2e0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e3: athrow
      // 2e4: aload 25
      // 2e6: ifnull 32e
      // 2e9: goto 2f0
      // 2ec: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ef: athrow
      // 2f0: aload 25
      // 2f2: getfield akm.jhn Lfqr;
      // 2f5: new fqr
      // 2f8: dup
      // 2f9: dload 5
      // 2fb: dload 7
      // 2fd: dload 9
      // 2ff: invokespecial fqr.<init> (DDD)V
      // 302: invokevirtual fqr.b4d (Lfqr;)D
      // 305: dstore 26
      // 307: iload 2
      // 308: ifeq 331
      // 30b: dload 26
      // 30d: dload 11
      // 30f: dcmpg
      // 310: ifge 32e
      // 313: goto 31a
      // 316: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 319: athrow
      // 31a: getstatic ModuleRegistry.xji Las5;
      // 31d: invokevirtual as5.klu ()Z
      // 320: ifne 32e
      // 323: goto 32a
      // 326: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 329: athrow
      // 32a: dload 26
      // 32c: dstore 11
      // 32e: iinc 21 1
      // 331: iload 2
      // 332: ifne 246
      // 335: aload 0
      // 336: getfield v3i.iku Lc05;
      // 339: getfield Minecraft.oxn Lmoh;
      // 33c: getfield moh.i_y I
      // 33f: bipush 2
      // 340: if_icmpne 353
      // 343: ldc 180.0
      // 345: nop
      // 346: fconst_0
      // 347: fconst_1
      // 348: fconst_0
      // 349: invokestatic hzu.a2h (FFFF)V
      // 34c: goto 353
      // 34f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 352: athrow
      // 353: aload 3
      // 354: getfield EntityLivingBase.y2i F
      // 357: fload 14
      // 359: fsub
      // 35a: fconst_1
      // 35b: fconst_0
      // 35c: fconst_0
      // 35d: invokestatic hzu.a2h (FFFF)V
      // 360: aload 3
      // 361: getfield EntityLivingBase.x5k F
      // 364: fload 13
      // 366: fsub
      // 367: fconst_0
      // 368: fconst_1
      // 369: fconst_0
      // 36a: invokestatic hzu.a2h (FFFF)V
      // 36d: fconst_0
      // 36e: fconst_0
      // 36f: dload 11
      // 371: dneg
      // 372: d2f
      // 373: invokestatic hzu.a4k (FFF)V
      // 376: fload 13
      // 378: aload 3
      // 379: getfield EntityLivingBase.x5k F
      // 37c: fsub
      // 37d: fconst_0
      // 37e: fconst_1
      // 37f: fconst_0
      // 380: invokestatic hzu.a2h (FFFF)V
      // 383: fload 14
      // 385: aload 3
      // 386: getfield EntityLivingBase.y2i F
      // 389: fsub
      // 38a: fconst_1
      // 38b: fconst_0
      // 38c: fconst_0
      // 38d: invokestatic hzu.a2h (FFFF)V
      // 390: iload 2
      // 391: ifne 3a3
      // 394: fconst_0
      // 395: fconst_0
      // 396: ldc -0.1
      // 398: nop
      // 399: invokestatic hzu.a4k (FFF)V
      // 39c: goto 3a3
      // 39f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a2: athrow
      // 3a3: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_CameraSetup_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 3a6: invokevirtual net/optifine/reflect/ReflectorConstructor.exists ()Z
      // 3a9: iload 2
      // 3aa: ifeq 4e3
      // 3ad: ifeq 4c7
      // 3b0: goto 3b7
      // 3b3: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b6: athrow
      // 3b7: aload 0
      // 3b8: iload 2
      // 3b9: ifeq 5a3
      // 3bc: goto 3c3
      // 3bf: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c2: athrow
      // 3c3: getfield v3i.iku Lc05;
      // 3c6: getfield Minecraft.oxn Lmoh;
      // 3c9: getfield moh.lwu Z
      // 3cc: ifne 55d
      // 3cf: goto 3d6
      // 3d2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d5: athrow
      // 3d6: aload 3
      // 3d7: getfield EntityLivingBase.p3h F
      // 3da: aload 3
      // 3db: getfield EntityLivingBase.x5k F
      // 3de: aload 3
      // 3df: getfield EntityLivingBase.p3h F
      // 3e2: fsub
      // 3e3: fload 1
      // 3e4: fmul
      // 3e5: fadd
      // 3e6: ldc 180.0
      // 3e8: nop
      // 3e9: fadd
      // 3ea: fstore 11
      // 3ec: aload 3
      // 3ed: getfield EntityLivingBase.j25 F
      // 3f0: aload 3
      // 3f1: getfield EntityLivingBase.y2i F
      // 3f4: aload 3
      // 3f5: getfield EntityLivingBase.j25 F
      // 3f8: fsub
      // 3f9: fload 1
      // 3fa: fmul
      // 3fb: fadd
      // 3fc: fstore 12
      // 3fe: fconst_0
      // 3ff: fstore 13
      // 401: aload 3
      // 402: iload 2
      // 403: ifeq 41b
      // 406: instanceof j37
      // 409: ifeq 439
      // 40c: goto 413
      // 40f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 412: athrow
      // 413: aload 3
      // 414: goto 41b
      // 417: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41a: athrow
      // 41b: checkcast j37
      // 41e: astore 14
      // 420: aload 14
      // 422: getfield j37.h82 F
      // 425: aload 14
      // 427: getfield j37.q6c F
      // 42a: aload 14
      // 42c: getfield j37.h82 F
      // 42f: fsub
      // 430: fload 1
      // 431: fmul
      // 432: fadd
      // 433: ldc 180.0
      // 435: nop
      // 436: fadd
      // 437: fstore 11
      // 439: aload 0
      // 43a: getfield v3i.iku Lc05;
      // 43d: getfield Minecraft.tij Lkh3;
      // 440: aload 3
      // 441: fload 1
      // 442: invokestatic bm4.te3 (Lt9d;Li2h;F)Le0x;
      // 445: astore 14
      // 447: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_CameraSetup_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 44a: bipush 7
      // 44c: anewarray 84
      // 44f: dup
      // 450: bipush 0
      // 451: aload 0
      // 452: aastore
      // 453: dup
      // 454: bipush 1
      // 455: aload 3
      // 456: aastore
      // 457: dup
      // 458: bipush 2
      // 459: aload 14
      // 45b: aastore
      // 45c: dup
      // 45d: bipush 3
      // 45e: fload 1
      // 45f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 462: aastore
      // 463: dup
      // 464: bipush 4
      // 465: fload 11
      // 467: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 46a: aastore
      // 46b: dup
      // 46c: bipush 5
      // 46d: fload 12
      // 46f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 472: aastore
      // 473: dup
      // 474: bipush 6
      // 476: fload 13
      // 478: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 47b: aastore
      // 47c: invokestatic net/optifine/reflect/Reflector.newInstance (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Ljava/lang/Object;
      // 47f: astore 15
      // 481: aload 15
      // 483: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Ljava/lang/Object;)Z
      // 486: pop
      // 487: aload 15
      // 489: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_CameraSetup_roll Lnet/optifine/reflect/ReflectorField;
      // 48c: fload 13
      // 48e: invokestatic net/optifine/reflect/Reflector.getFieldValueFloat (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;F)F
      // 491: fstore 13
      // 493: aload 15
      // 495: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_CameraSetup_pitch Lnet/optifine/reflect/ReflectorField;
      // 498: fload 12
      // 49a: invokestatic net/optifine/reflect/Reflector.getFieldValueFloat (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;F)F
      // 49d: fstore 12
      // 49f: aload 15
      // 4a1: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_CameraSetup_yaw Lnet/optifine/reflect/ReflectorField;
      // 4a4: fload 11
      // 4a6: invokestatic net/optifine/reflect/Reflector.getFieldValueFloat (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;F)F
      // 4a9: fstore 11
      // 4ab: fload 13
      // 4ad: fconst_0
      // 4ae: fconst_0
      // 4af: fconst_1
      // 4b0: invokestatic hzu.a2h (FFFF)V
      // 4b3: fload 12
      // 4b5: fconst_1
      // 4b6: fconst_0
      // 4b7: fconst_0
      // 4b8: invokestatic hzu.a2h (FFFF)V
      // 4bb: fload 11
      // 4bd: fconst_0
      // 4be: fconst_1
      // 4bf: fconst_0
      // 4c0: invokestatic hzu.a2h (FFFF)V
      // 4c3: iload 2
      // 4c4: ifne 55d
      // 4c7: aload 0
      // 4c8: iload 2
      // 4c9: ifeq 5a3
      // 4cc: goto 4d3
      // 4cf: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d2: athrow
      // 4d3: getfield v3i.iku Lc05;
      // 4d6: getfield Minecraft.oxn Lmoh;
      // 4d9: getfield moh.lwu Z
      // 4dc: goto 4e3
      // 4df: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e2: athrow
      // 4e3: ifne 55d
      // 4e6: aload 3
      // 4e7: getfield EntityLivingBase.j25 F
      // 4ea: aload 3
      // 4eb: getfield EntityLivingBase.y2i F
      // 4ee: aload 3
      // 4ef: getfield EntityLivingBase.j25 F
      // 4f2: fsub
      // 4f3: fload 1
      // 4f4: fmul
      // 4f5: fadd
      // 4f6: fconst_1
      // 4f7: fconst_0
      // 4f8: fconst_0
      // 4f9: invokestatic hzu.a2h (FFFF)V
      // 4fc: aload 3
      // 4fd: iload 2
      // 4fe: ifeq 544
      // 501: goto 508
      // 504: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 507: athrow
      // 508: instanceof j37
      // 50b: ifeq 53c
      // 50e: goto 515
      // 511: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 514: athrow
      // 515: aload 3
      // 516: checkcast j37
      // 519: astore 11
      // 51b: aload 11
      // 51d: getfield j37.h82 F
      // 520: aload 11
      // 522: getfield j37.q6c F
      // 525: aload 11
      // 527: getfield j37.h82 F
      // 52a: fsub
      // 52b: fload 1
      // 52c: fmul
      // 52d: fadd
      // 52e: ldc 180.0
      // 530: nop
      // 531: fadd
      // 532: fconst_0
      // 533: fconst_1
      // 534: fconst_0
      // 535: invokestatic hzu.a2h (FFFF)V
      // 538: iload 2
      // 539: ifne 55d
      // 53c: aload 3
      // 53d: goto 544
      // 540: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 543: athrow
      // 544: getfield EntityLivingBase.p3h F
      // 547: aload 3
      // 548: getfield EntityLivingBase.x5k F
      // 54b: aload 3
      // 54c: getfield EntityLivingBase.p3h F
      // 54f: fsub
      // 550: fload 1
      // 551: fmul
      // 552: fadd
      // 553: ldc 180.0
      // 555: nop
      // 556: fadd
      // 557: fconst_0
      // 558: fconst_1
      // 559: fconst_0
      // 55a: invokestatic hzu.a2h (FFFF)V
      // 55d: fconst_0
      // 55e: fload 4
      // 560: fneg
      // 561: fconst_0
      // 562: invokestatic hzu.a4k (FFF)V
      // 565: aload 3
      // 566: getfield EntityLivingBase.bc1 D
      // 569: aload 3
      // 56a: getfield EntityLivingBase.o2v D
      // 56d: aload 3
      // 56e: getfield EntityLivingBase.bc1 D
      // 571: dsub
      // 572: fload 1
      // 573: f2d
      // 574: dmul
      // 575: dadd
      // 576: dstore 5
      // 578: aload 3
      // 579: getfield EntityLivingBase.o_z D
      // 57c: aload 3
      // 57d: getfield EntityLivingBase.kfp D
      // 580: aload 3
      // 581: getfield EntityLivingBase.o_z D
      // 584: dsub
      // 585: fload 1
      // 586: f2d
      // 587: dmul
      // 588: dadd
      // 589: fload 4
      // 58b: f2d
      // 58c: dadd
      // 58d: dstore 7
      // 58f: aload 3
      // 590: getfield EntityLivingBase.a4d D
      // 593: aload 3
      // 594: getfield EntityLivingBase.vbd D
      // 597: aload 3
      // 598: getfield EntityLivingBase.a4d D
      // 59b: dsub
      // 59c: fload 1
      // 59d: f2d
      // 59e: dmul
      // 59f: dadd
      // 5a0: dstore 9
      // 5a2: aload 0
      // 5a3: aload 0
      // 5a4: getfield v3i.iku Lc05;
      // 5a7: getfield Minecraft.vsl Lcrp;
      // 5aa: dload 5
      // 5ac: dload 7
      // 5ae: dload 9
      // 5b0: fload 1
      // 5b1: invokevirtual crp.wdv (DDDF)Z
      // 5b4: putfield v3i.adj Z
      // 5b7: return
   }

   public void i_6(float param1, int param2) {
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
      // 005: aload 0
      // 006: getfield v3i.iku Lc05;
      // 009: getfield Minecraft.oxn Lmoh;
      // 00c: getfield moh.gcj I
      // 00f: bipush 16
      // 011: imul
      // 012: i2f
      // 013: putfield v3i.llt F
      // 016: invokestatic hxt.z2l ()Z
      // 019: iload 3
      // 01a: ifeq 03d
      // 01d: ifeq 03a
      // 020: goto 027
      // 023: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: aload 0
      // 028: dup
      // 029: getfield v3i.llt F
      // 02c: ldc 0.95
      // 02e: nop
      // 02f: fmul
      // 030: putfield v3i.llt F
      // 033: goto 03a
      // 036: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: invokestatic hxt.q34 ()Z
      // 03d: iload 3
      // 03e: ifeq 061
      // 041: ifeq 05e
      // 044: goto 04b
      // 047: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: aload 0
      // 04c: dup
      // 04d: getfield v3i.llt F
      // 050: ldc 0.83
      // 052: nop
      // 053: fmul
      // 054: putfield v3i.llt F
      // 057: goto 05e
      // 05a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: sipush 5889
      // 061: invokestatic hzu.ah8 (I)V
      // 064: invokestatic hzu.zwy ()V
      // 067: ldc 0.07
      // 069: nop
      // 06a: fstore 4
      // 06c: aload 0
      // 06d: getfield v3i.iku Lc05;
      // 070: getfield Minecraft.oxn Lmoh;
      // 073: getfield moh.rdb Z
      // 076: iload 3
      // 077: ifeq 0ac
      // 07a: ifeq 09a
      // 07d: goto 084
      // 080: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: iload 2
      // 085: bipush 2
      // 086: imul
      // 087: bipush 1
      // 088: isub
      // 089: ineg
      // 08a: i2f
      // 08b: fload 4
      // 08d: fmul
      // 08e: fconst_0
      // 08f: fconst_0
      // 090: invokestatic hzu.a4k (FFF)V
      // 093: goto 09a
      // 096: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 0
      // 09b: aload 0
      // 09c: getfield v3i.llt F
      // 09f: fconst_2
      // 0a0: fmul
      // 0a1: putfield v3i.ols F
      // 0a4: aload 0
      // 0a5: getfield v3i.ols F
      // 0a8: ldc 173.0
      // 0aa: nop
      // 0ab: fcmpg
      // 0ac: iload 3
      // 0ad: ifeq 0ce
      // 0b0: ifge 0c8
      // 0b3: goto 0ba
      // 0b6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: ldc 173.0
      // 0bd: nop
      // 0be: putfield v3i.ols F
      // 0c1: goto 0c8
      // 0c4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield v3i.t54 D
      // 0cc: dconst_1
      // 0cd: dcmpl
      // 0ce: iload 3
      // 0cf: ifeq 132
      // 0d2: ifeq 0fe
      // 0d5: goto 0dc
      // 0d8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: getfield v3i.ud_ D
      // 0e0: d2f
      // 0e1: aload 0
      // 0e2: getfield v3i.kui D
      // 0e5: dneg
      // 0e6: d2f
      // 0e7: fconst_0
      // 0e8: invokestatic hzu.a4k (FFF)V
      // 0eb: aload 0
      // 0ec: getfield v3i.t54 D
      // 0ef: aload 0
      // 0f0: getfield v3i.t54 D
      // 0f3: dconst_1
      // 0f4: invokestatic hzu.bvy (DDD)V
      // 0f7: goto 0fe
      // 0fa: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: fload 1
      // 100: bipush 1
      // 101: invokespecial v3i.pcw (FZ)F
      // 104: aload 0
      // 105: getfield v3i.iku Lc05;
      // 108: getfield Minecraft.pfr I
      // 10b: i2f
      // 10c: aload 0
      // 10d: getfield v3i.iku Lc05;
      // 110: getfield Minecraft.ry7 I
      // 113: i2f
      // 114: fdiv
      // 115: ldc 0.05
      // 117: nop
      // 118: aload 0
      // 119: getfield v3i.ols F
      // 11c: invokestatic org/lwjgl/util/glu/Project.gluPerspective (FFFF)V
      // 11f: sipush 5888
      // 122: invokestatic hzu.ah8 (I)V
      // 125: invokestatic hzu.zwy ()V
      // 128: aload 0
      // 129: getfield v3i.iku Lc05;
      // 12c: getfield Minecraft.oxn Lmoh;
      // 12f: getfield moh.rdb Z
      // 132: iload 3
      // 133: ifeq 170
      // 136: ifeq 156
      // 139: goto 140
      // 13c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: iload 2
      // 141: bipush 2
      // 142: imul
      // 143: bipush 1
      // 144: isub
      // 145: i2f
      // 146: ldc 0.1
      // 148: nop
      // 149: fmul
      // 14a: fconst_0
      // 14b: fconst_0
      // 14c: invokestatic hzu.a4k (FFF)V
      // 14f: goto 156
      // 152: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: aload 0
      // 157: fload 1
      // 158: invokespecial v3i.t5g (F)V
      // 15b: aload 0
      // 15c: getfield v3i.iku Lc05;
      // 15f: iload 3
      // 160: ifeq 183
      // 163: getfield Minecraft.oxn Lmoh;
      // 166: getfield moh.q7f Z
      // 169: goto 170
      // 16c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16f: athrow
      // 170: ifeq 17f
      // 173: aload 0
      // 174: fload 1
      // 175: invokespecial v3i.u_e (F)V
      // 178: goto 17f
      // 17b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: aload 0
      // 180: getfield v3i.iku Lc05;
      // 183: getfield Minecraft.vg8 Ll86;
      // 186: getfield EntityPlayerSP.u57 F
      // 189: aload 0
      // 18a: getfield v3i.iku Lc05;
      // 18d: getfield Minecraft.vg8 Ll86;
      // 190: getfield EntityPlayerSP.u3f F
      // 193: aload 0
      // 194: getfield v3i.iku Lc05;
      // 197: getfield Minecraft.vg8 Ll86;
      // 19a: getfield EntityPlayerSP.u57 F
      // 19d: fsub
      // 19e: fload 1
      // 19f: fmul
      // 1a0: fadd
      // 1a1: fstore 5
      // 1a3: fload 5
      // 1a5: fconst_0
      // 1a6: fcmpl
      // 1a7: iload 3
      // 1a8: ifeq 22a
      // 1ab: ifle 221
      // 1ae: goto 1b5
      // 1b1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: bipush 20
      // 1b7: istore 6
      // 1b9: aload 0
      // 1ba: getfield v3i.iku Lc05;
      // 1bd: getfield Minecraft.vg8 Ll86;
      // 1c0: getstatic mcs.bla Lmcs;
      // 1c3: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 1c6: iload 3
      // 1c7: ifeq 1d6
      // 1ca: ifeq 1d8
      // 1cd: goto 1d4
      // 1d0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d3: athrow
      // 1d4: bipush 7
      // 1d6: istore 6
      // 1d8: ldc 5.0
      // 1da: nop
      // 1db: fload 5
      // 1dd: fload 5
      // 1df: fmul
      // 1e0: ldc 5.0
      // 1e2: nop
      // 1e3: fadd
      // 1e4: fdiv
      // 1e5: fload 5
      // 1e7: ldc 0.04
      // 1e9: nop
      // 1ea: fmul
      // 1eb: fsub
      // 1ec: fstore 7
      // 1ee: fload 7
      // 1f0: fload 7
      // 1f2: fmul
      // 1f3: fstore 7
      // 1f5: aload 0
      // 1f6: getfield v3i.g6g I
      // 1f9: i2f
      // 1fa: fload 1
      // 1fb: fadd
      // 1fc: iload 6
      // 1fe: i2f
      // 1ff: fmul
      // 200: fconst_0
      // 201: fconst_1
      // 202: fconst_1
      // 203: invokestatic hzu.a2h (FFFF)V
      // 206: fconst_1
      // 207: fload 7
      // 209: fdiv
      // 20a: fconst_1
      // 20b: fconst_1
      // 20c: invokestatic hzu.syc (FFF)V
      // 20f: aload 0
      // 210: getfield v3i.g6g I
      // 213: i2f
      // 214: fload 1
      // 215: fadd
      // 216: fneg
      // 217: iload 6
      // 219: i2f
      // 21a: fmul
      // 21b: fconst_0
      // 21c: fconst_1
      // 21d: fconst_1
      // 21e: invokestatic hzu.a2h (FFFF)V
      // 221: aload 0
      // 222: fload 1
      // 223: invokevirtual v3i.pmp (F)V
      // 226: aload 0
      // 227: getfield v3i.mrg Z
      // 22a: iload 3
      // 22b: ifeq 243
      // 22e: ifeq 2c4
      // 231: goto 238
      // 234: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 237: athrow
      // 238: aload 0
      // 239: getfield v3i.wgg I
      // 23c: goto 243
      // 23f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 242: athrow
      // 243: tableswitch 129 0 4 33 53 73 93 113
      // 264: ldc 90.0
      // 266: nop
      // 267: fconst_0
      // 268: fconst_1
      // 269: fconst_0
      // 26a: invokestatic hzu.a2h (FFFF)V
      // 26d: iload 3
      // 26e: ifne 2c4
      // 271: goto 278
      // 274: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 277: athrow
      // 278: ldc 180.0
      // 27a: nop
      // 27b: fconst_0
      // 27c: fconst_1
      // 27d: fconst_0
      // 27e: invokestatic hzu.a2h (FFFF)V
      // 281: iload 3
      // 282: ifne 2c4
      // 285: goto 28c
      // 288: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28b: athrow
      // 28c: ldc -90.0
      // 28e: nop
      // 28f: fconst_0
      // 290: fconst_1
      // 291: fconst_0
      // 292: invokestatic hzu.a2h (FFFF)V
      // 295: iload 3
      // 296: ifne 2c4
      // 299: goto 2a0
      // 29c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29f: athrow
      // 2a0: ldc 90.0
      // 2a2: nop
      // 2a3: fconst_1
      // 2a4: fconst_0
      // 2a5: fconst_0
      // 2a6: invokestatic hzu.a2h (FFFF)V
      // 2a9: iload 3
      // 2aa: ifne 2c4
      // 2ad: goto 2b4
      // 2b0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b3: athrow
      // 2b4: ldc -90.0
      // 2b6: nop
      // 2b7: fconst_1
      // 2b8: fconst_0
      // 2b9: fconst_0
      // 2ba: invokestatic hzu.a2h (FFFF)V
      // 2bd: goto 2c4
      // 2c0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c3: athrow
      // 2c4: return
   }

   private void sfi(float var1, int var2) {
      this.ncf(var1, var2, true, true, false);
   }

   public void ncf(float param1, int param2, boolean param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 6
      // 005: aload 0
      // 006: getfield v3i.mrg Z
      // 009: iload 6
      // 00b: ifne 01b
      // 00e: ifne 2b5
      // 011: goto 018
      // 014: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: sipush 5889
      // 01b: invokestatic hzu.ah8 (I)V
      // 01e: invokestatic hzu.zwy ()V
      // 021: ldc 0.07
      // 023: nop
      // 024: fstore 7
      // 026: aload 0
      // 027: getfield v3i.iku Lc05;
      // 02a: getfield Minecraft.oxn Lmoh;
      // 02d: getfield moh.rdb Z
      // 030: iload 6
      // 032: ifne 058
      // 035: ifeq 055
      // 038: goto 03f
      // 03b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: iload 2
      // 040: bipush 2
      // 041: imul
      // 042: bipush 1
      // 043: isub
      // 044: ineg
      // 045: i2f
      // 046: fload 7
      // 048: fmul
      // 049: fconst_0
      // 04a: fconst_0
      // 04b: invokestatic hzu.a4k (FFF)V
      // 04e: goto 055
      // 051: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: invokestatic hxt.ly3 ()Z
      // 058: iload 6
      // 05a: ifne 0a0
      // 05d: ifeq 06a
      // 060: goto 067
      // 063: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: invokestatic net/optifine/shaders/Shaders.applyHandDepth ()V
      // 06a: aload 0
      // 06b: fload 1
      // 06c: bipush 0
      // 06d: invokespecial v3i.pcw (FZ)F
      // 070: aload 0
      // 071: getfield v3i.iku Lc05;
      // 074: getfield Minecraft.pfr I
      // 077: i2f
      // 078: aload 0
      // 079: getfield v3i.iku Lc05;
      // 07c: getfield Minecraft.ry7 I
      // 07f: i2f
      // 080: fdiv
      // 081: ldc 0.05
      // 083: nop
      // 084: aload 0
      // 085: getfield v3i.llt F
      // 088: fconst_2
      // 089: fmul
      // 08a: invokestatic org/lwjgl/util/glu/Project.gluPerspective (FFFF)V
      // 08d: sipush 5888
      // 090: invokestatic hzu.ah8 (I)V
      // 093: invokestatic hzu.zwy ()V
      // 096: aload 0
      // 097: getfield v3i.iku Lc05;
      // 09a: getfield Minecraft.oxn Lmoh;
      // 09d: getfield moh.rdb Z
      // 0a0: iload 6
      // 0a2: ifne 0c6
      // 0a5: ifeq 0c5
      // 0a8: goto 0af
      // 0ab: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: iload 2
      // 0b0: bipush 2
      // 0b1: imul
      // 0b2: bipush 1
      // 0b3: isub
      // 0b4: i2f
      // 0b5: ldc 0.1
      // 0b7: nop
      // 0b8: fmul
      // 0b9: fconst_0
      // 0ba: fconst_0
      // 0bb: invokestatic hzu.a4k (FFF)V
      // 0be: goto 0c5
      // 0c1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: bipush 0
      // 0c6: istore 8
      // 0c8: iload 3
      // 0c9: iload 6
      // 0cb: ifne 23e
      // 0ce: ifeq 23c
      // 0d1: goto 0d8
      // 0d4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: invokestatic hzu.dp2 ()V
      // 0db: aload 0
      // 0dc: fload 1
      // 0dd: invokespecial v3i.t5g (F)V
      // 0e0: aload 0
      // 0e1: getfield v3i.iku Lc05;
      // 0e4: getfield Minecraft.oxn Lmoh;
      // 0e7: getfield moh.q7f Z
      // 0ea: iload 6
      // 0ec: ifne 116
      // 0ef: goto 0f6
      // 0f2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: ifeq 10c
      // 0f9: goto 100
      // 0fc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: aload 0
      // 101: fload 1
      // 102: invokespecial v3i.u_e (F)V
      // 105: goto 10c
      // 108: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: aload 0
      // 10d: getfield v3i.iku Lc05;
      // 110: invokevirtual Minecraft.nsd ()Li2h;
      // 113: instanceof Entity
      // 116: iload 6
      // 118: ifne 139
      // 11b: ifeq 14c
      // 11e: goto 125
      // 121: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 0
      // 126: getfield v3i.iku Lc05;
      // 129: invokevirtual Minecraft.nsd ()Li2h;
      // 12c: checkcast Entity
      // 12f: invokevirtual Entity.ofg ()Z
      // 132: goto 139
      // 135: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 138: athrow
      // 139: iload 6
      // 13b: ifne 149
      // 13e: ifeq 14c
      // 141: goto 148
      // 144: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 147: athrow
      // 148: bipush 1
      // 149: goto 14d
      // 14c: bipush 0
      // 14d: istore 8
      // 14f: aload 0
      // 150: getfield v3i.iku Lc05;
      // 153: getfield Minecraft.vsl Lcrp;
      // 156: fload 1
      // 157: iload 2
      // 158: invokestatic net/optifine/reflect/ReflectorForge.renderFirstPersonHand (Lcrp;FI)Z
      // 15b: iload 6
      // 15d: ifne 16b
      // 160: ifne 16e
      // 163: goto 16a
      // 166: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 169: athrow
      // 16a: bipush 1
      // 16b: goto 16f
      // 16e: bipush 0
      // 16f: istore 9
      // 171: iload 9
      // 173: iload 6
      // 175: ifne 193
      // 178: ifeq 239
      // 17b: goto 182
      // 17e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: aload 0
      // 183: getfield v3i.iku Lc05;
      // 186: getfield Minecraft.oxn Lmoh;
      // 189: getfield moh.i_y I
      // 18c: goto 193
      // 18f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: iload 6
      // 195: ifne 1a4
      // 198: ifne 239
      // 19b: goto 1a2
      // 19e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a1: athrow
      // 1a2: iload 8
      // 1a4: iload 6
      // 1a6: ifne 1c4
      // 1a9: ifne 239
      // 1ac: goto 1b3
      // 1af: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield v3i.iku Lc05;
      // 1b7: getfield Minecraft.oxn Lmoh;
      // 1ba: getfield moh.x8y Z
      // 1bd: goto 1c4
      // 1c0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c3: athrow
      // 1c4: iload 6
      // 1c6: ifne 1e4
      // 1c9: ifne 239
      // 1cc: goto 1d3
      // 1cf: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d2: athrow
      // 1d3: aload 0
      // 1d4: getfield v3i.iku Lc05;
      // 1d7: getfield Minecraft.l7q Lhh6;
      // 1da: invokevirtual hh6.umf ()Z
      // 1dd: goto 1e4
      // 1e0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: iload 6
      // 1e6: ifne 20d
      // 1e9: ifne 239
      // 1ec: goto 1f3
      // 1ef: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f2: athrow
      // 1f3: aload 0
      // 1f4: iload 6
      // 1f6: ifne 22e
      // 1f9: goto 200
      // 1fc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: invokevirtual v3i.u_c ()V
      // 203: invokestatic hxt.ly3 ()Z
      // 206: goto 20d
      // 209: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20c: athrow
      // 20d: ifeq 226
      // 210: aload 0
      // 211: getfield v3i._ld Lmlb;
      // 214: fload 1
      // 215: iload 5
      // 217: invokestatic net/optifine/shaders/ShadersRender.renderItemFP (Lmlb;FZ)V
      // 21a: iload 6
      // 21c: ifeq 235
      // 21f: goto 226
      // 222: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 225: athrow
      // 226: aload 0
      // 227: goto 22e
      // 22a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22d: athrow
      // 22e: getfield v3i._ld Lmlb;
      // 231: fload 1
      // 232: invokevirtual mlb.xu_ (F)V
      // 235: aload 0
      // 236: invokevirtual v3i.yvz ()V
      // 239: invokestatic hzu.x3w ()V
      // 23c: iload 4
      // 23e: iload 6
      // 240: ifne 25c
      // 243: ifne 24e
      // 246: goto 24d
      // 249: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: return
      // 24e: aload 0
      // 24f: invokevirtual v3i.yvz ()V
      // 252: aload 0
      // 253: getfield v3i.iku Lc05;
      // 256: getfield Minecraft.oxn Lmoh;
      // 259: getfield moh.i_y I
      // 25c: iload 6
      // 25e: ifne 2ad
      // 261: ifne 297
      // 264: goto 26b
      // 267: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26a: athrow
      // 26b: iload 8
      // 26d: iload 6
      // 26f: ifne 2ad
      // 272: goto 279
      // 275: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 278: athrow
      // 279: ifne 297
      // 27c: goto 283
      // 27f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 282: athrow
      // 283: aload 0
      // 284: getfield v3i._ld Lmlb;
      // 287: fload 1
      // 288: invokevirtual mlb.izc (F)V
      // 28b: aload 0
      // 28c: fload 1
      // 28d: invokespecial v3i.t5g (F)V
      // 290: goto 297
      // 293: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 296: athrow
      // 297: aload 0
      // 298: iload 6
      // 29a: ifne 2b1
      // 29d: getfield v3i.iku Lc05;
      // 2a0: getfield Minecraft.oxn Lmoh;
      // 2a3: getfield moh.q7f Z
      // 2a6: goto 2ad
      // 2a9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ac: athrow
      // 2ad: ifeq 2b5
      // 2b0: aload 0
      // 2b1: fload 1
      // 2b2: invokespecial v3i.u_e (F)V
      // 2b5: return
   }

   public void yvz() {
      try {
         hzu.qon(gis.exn);
         hzu.m_1();
         hzu.qon(gis.z1w);
         if (hxt.ly3()) {
            Shaders.disableLightmap();
         }
      } catch (JsonSyntaxException var1) {
         throw a(var1);
      }
   }

   public void u_c() {
      hzu.qon(gis.exn);
      hzu.ah8(5890);
      hzu.zwy();
      float var1 = 0.00390625F;

      try {
         hzu.syc(var1, var1, var1);
         hzu.a4k(8.0F, 8.0F, 8.0F);
         hzu.ah8(5888);
         this.iku.l22().anl(this.u3i);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
         hzu.rqj();
         hzu.qon(gis.z1w);
         if (hxt.ly3()) {
            Shaders.enableLightmap();
         }
      } catch (JsonSyntaxException var2) {
         throw a(var2);
      }
   }

   private void mb1() {
      this.epk = (float)((double)this.epk + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.epk = (float)((double)this.epk * 0.9);
      this.uyk = this.uyk + (this.epk - this.uyk) * 1.0F;
      this.vl2 = true;
   }

   private void v_o(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 129948953787372
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 040
      // 013: getfield v3i.vl2 Z
      // 016: ifeq 51c
      // 019: goto 020
      // 01c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield v3i.iku Lc05;
      // 024: getfield Minecraft.ba0 Luan;
      // 027: sipush 27775
      // 02a: ldc2_w 1710931714536411004
      // 02d: lload 2
      // 02e: lxor
      // 02f: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: nop
      // 035: invokevirtual uan.qek (Ljava/lang/String;)V
      // 038: aload 0
      // 039: goto 040
      // 03c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: getfield v3i.iku Lc05;
      // 043: getfield Minecraft.tij Lkh3;
      // 046: astore 5
      // 048: aload 5
      // 04a: ifnull 51c
      // 04d: getstatic ModuleRegistry.s3g Lwm2;
      // 050: invokevirtual wm2.klu ()Z
      // 053: iload 4
      // 055: ifne 086
      // 058: goto 05f
      // 05b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: ifne 085
      // 062: goto 069
      // 065: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: getstatic ModuleRegistry.ksa Lh19;
      // 06c: invokevirtual h19.klu ()Z
      // 06f: iload 4
      // 071: ifne 0c6
      // 074: goto 07b
      // 077: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: ifeq 0c3
      // 07e: goto 085
      // 081: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: bipush 0
      // 086: istore 6
      // 088: iload 6
      // 08a: sipush 256
      // 08d: if_icmpge 0ac
      // 090: aload 0
      // 091: getfield v3i.he3 [I
      // 094: iload 6
      // 096: bipush -1
      // 097: iastore
      // 098: iinc 6 1
      // 09b: iload 4
      // 09d: ifne 0c2
      // 0a0: iload 4
      // 0a2: ifeq 088
      // 0a5: goto 0ac
      // 0a8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 0
      // 0ad: getfield v3i.eot Lp9u;
      // 0b0: invokevirtual p9u.oj6 ()V
      // 0b3: aload 0
      // 0b4: bipush 0
      // 0b5: putfield v3i.vl2 Z
      // 0b8: aload 0
      // 0b9: getfield v3i.iku Lc05;
      // 0bc: getfield Minecraft.ba0 Luan;
      // 0bf: invokevirtual uan.uio ()V
      // 0c2: return
      // 0c3: invokestatic hxt.xe2 ()Z
      // 0c6: iload 4
      // 0c8: ifne 103
      // 0cb: ifeq 121
      // 0ce: goto 0d5
      // 0d1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: aload 5
      // 0d7: aload 0
      // 0d8: getfield v3i.uyk F
      // 0db: iload 4
      // 0dd: ifne 124
      // 0e0: goto 0e7
      // 0e3: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield v3i.he3 [I
      // 0eb: aload 0
      // 0ec: getfield v3i.iku Lc05;
      // 0ef: getfield Minecraft.vg8 Ll86;
      // 0f2: getstatic mcs.lu2 Lmcs;
      // 0f5: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 0f8: fload 1
      // 0f9: invokestatic net/optifine/CustomColors.updateLightmap (Lt9d;F[IZF)Z
      // 0fc: goto 103
      // 0ff: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: ifeq 121
      // 106: aload 0
      // 107: getfield v3i.eot Lp9u;
      // 10a: invokevirtual p9u.oj6 ()V
      // 10d: aload 0
      // 10e: bipush 0
      // 10f: putfield v3i.vl2 Z
      // 112: aload 0
      // 113: getfield v3i.iku Lc05;
      // 116: getfield Minecraft.ba0 Luan;
      // 119: invokevirtual uan.uio ()V
      // 11c: return
      // 11d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: aload 5
      // 123: fconst_1
      // 124: invokevirtual OpaquePredicate.c66 (F)F
      // 127: fstore 6
      // 129: fload 6
      // 12b: ldc 0.95
      // 12d: nop
      // 12e: fmul
      // 12f: ldc 0.05
      // 131: nop
      // 132: fadd
      // 133: fstore 7
      // 135: bipush 0
      // 136: istore 8
      // 138: iload 8
      // 13a: sipush 256
      // 13d: if_icmpge 506
      // 140: aload 5
      // 142: getfield OpaquePredicate.vzz Lupn;
      // 145: invokevirtual upn.tcr ()[F
      // 148: iload 8
      // 14a: bipush 16
      // 14c: idiv
      // 14d: faload
      // 14e: fload 7
      // 150: fmul
      // 151: fstore 9
      // 153: aload 5
      // 155: getfield OpaquePredicate.vzz Lupn;
      // 158: invokevirtual upn.tcr ()[F
      // 15b: iload 8
      // 15d: bipush 16
      // 15f: irem
      // 160: faload
      // 161: aload 0
      // 162: getfield v3i.uyk F
      // 165: ldc 0.1
      // 167: nop
      // 168: fmul
      // 169: ldc 1.5
      // 16b: nop
      // 16c: fadd
      // 16d: fmul
      // 16e: fstore 10
      // 170: iload 4
      // 172: ifne 512
      // 175: aload 5
      // 177: iload 4
      // 179: ifne 199
      // 17c: goto 183
      // 17f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 182: athrow
      // 183: invokevirtual OpaquePredicate.v48 ()I
      // 186: ifle 1a7
      // 189: goto 190
      // 18c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: aload 5
      // 192: goto 199
      // 195: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 198: athrow
      // 199: getfield OpaquePredicate.vzz Lupn;
      // 19c: invokevirtual upn.tcr ()[F
      // 19f: iload 8
      // 1a1: bipush 16
      // 1a3: idiv
      // 1a4: faload
      // 1a5: fstore 9
      // 1a7: fload 9
      // 1a9: fload 6
      // 1ab: ldc 0.65
      // 1ad: nop
      // 1ae: fmul
      // 1af: ldc 0.35
      // 1b1: nop
      // 1b2: fadd
      // 1b3: fmul
      // 1b4: fstore 11
      // 1b6: fload 9
      // 1b8: fload 6
      // 1ba: ldc 0.65
      // 1bc: nop
      // 1bd: fmul
      // 1be: ldc 0.35
      // 1c0: nop
      // 1c1: fadd
      // 1c2: fmul
      // 1c3: fstore 12
      // 1c5: fload 10
      // 1c7: fload 10
      // 1c9: ldc 0.6
      // 1cb: nop
      // 1cc: fmul
      // 1cd: ldc 0.4
      // 1cf: nop
      // 1d0: fadd
      // 1d1: ldc 0.6
      // 1d3: nop
      // 1d4: fmul
      // 1d5: ldc 0.4
      // 1d7: nop
      // 1d8: fadd
      // 1d9: fmul
      // 1da: fstore 13
      // 1dc: fload 10
      // 1de: fload 10
      // 1e0: fload 10
      // 1e2: fmul
      // 1e3: ldc 0.6
      // 1e5: nop
      // 1e6: fmul
      // 1e7: ldc 0.4
      // 1e9: nop
      // 1ea: fadd
      // 1eb: fmul
      // 1ec: fstore 14
      // 1ee: fload 11
      // 1f0: fload 10
      // 1f2: fadd
      // 1f3: fstore 15
      // 1f5: fload 12
      // 1f7: fload 13
      // 1f9: fadd
      // 1fa: fstore 16
      // 1fc: fload 9
      // 1fe: fload 14
      // 200: fadd
      // 201: fstore 17
      // 203: fload 15
      // 205: ldc 0.96
      // 207: nop
      // 208: fmul
      // 209: ldc 0.03
      // 20b: nop
      // 20c: fadd
      // 20d: fstore 15
      // 20f: fload 16
      // 211: ldc 0.96
      // 213: nop
      // 214: fmul
      // 215: ldc 0.03
      // 217: nop
      // 218: fadd
      // 219: fstore 16
      // 21b: fload 17
      // 21d: ldc 0.96
      // 21f: nop
      // 220: fmul
      // 221: ldc 0.03
      // 223: nop
      // 224: fadd
      // 225: fstore 17
      // 227: aload 0
      // 228: getfield v3i.gbx F
      // 22b: fconst_0
      // 22c: fcmpl
      // 22d: iload 4
      // 22f: ifne 28f
      // 232: ifle 287
      // 235: goto 23c
      // 238: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23b: athrow
      // 23c: aload 0
      // 23d: getfield v3i.yph F
      // 240: aload 0
      // 241: getfield v3i.gbx F
      // 244: aload 0
      // 245: getfield v3i.yph F
      // 248: fsub
      // 249: fload 1
      // 24a: fmul
      // 24b: fadd
      // 24c: fstore 18
      // 24e: fload 15
      // 250: fconst_1
      // 251: fload 18
      // 253: fsub
      // 254: fmul
      // 255: fload 15
      // 257: ldc 0.7
      // 259: nop
      // 25a: fmul
      // 25b: fload 18
      // 25d: fmul
      // 25e: fadd
      // 25f: fstore 15
      // 261: fload 16
      // 263: fconst_1
      // 264: fload 18
      // 266: fsub
      // 267: fmul
      // 268: fload 16
      // 26a: ldc 0.6
      // 26c: nop
      // 26d: fmul
      // 26e: fload 18
      // 270: fmul
      // 271: fadd
      // 272: fstore 16
      // 274: fload 17
      // 276: fconst_1
      // 277: fload 18
      // 279: fsub
      // 27a: fmul
      // 27b: fload 17
      // 27d: ldc 0.6
      // 27f: nop
      // 280: fmul
      // 281: fload 18
      // 283: fmul
      // 284: fadd
      // 285: fstore 17
      // 287: aload 5
      // 289: getfield OpaquePredicate.vzz Lupn;
      // 28c: invokevirtual upn.gs_ ()I
      // 28f: iload 4
      // 291: ifne 2d0
      // 294: bipush 1
      // 295: if_icmpne 2c3
      // 298: goto 29f
      // 29b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29e: athrow
      // 29f: ldc 0.22
      // 2a1: nop
      // 2a2: fload 10
      // 2a4: ldc 0.75
      // 2a6: nop
      // 2a7: fmul
      // 2a8: fadd
      // 2a9: fstore 15
      // 2ab: ldc 0.28
      // 2ad: nop
      // 2ae: fload 13
      // 2b0: ldc 0.75
      // 2b2: nop
      // 2b3: fmul
      // 2b4: fadd
      // 2b5: fstore 16
      // 2b7: ldc 0.25
      // 2b9: nop
      // 2ba: fload 14
      // 2bc: ldc 0.75
      // 2be: nop
      // 2bf: fmul
      // 2c0: fadd
      // 2c1: fstore 17
      // 2c3: aload 0
      // 2c4: getfield v3i.iku Lc05;
      // 2c7: getfield Minecraft.vg8 Ll86;
      // 2ca: getstatic mcs.lu2 Lmcs;
      // 2cd: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 2d0: iload 4
      // 2d2: ifne 365
      // 2d5: ifeq 361
      // 2d8: goto 2df
      // 2db: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2de: athrow
      // 2df: aload 0
      // 2e0: aload 0
      // 2e1: getfield v3i.iku Lc05;
      // 2e4: getfield Minecraft.vg8 Ll86;
      // 2e7: fload 1
      // 2e8: invokevirtual v3i.hai (Lg_3;F)F
      // 2eb: fstore 18
      // 2ed: fconst_1
      // 2ee: fload 15
      // 2f0: fdiv
      // 2f1: fstore 19
      // 2f3: fload 19
      // 2f5: fconst_1
      // 2f6: fload 16
      // 2f8: fdiv
      // 2f9: fcmpl
      // 2fa: iload 4
      // 2fc: ifne 322
      // 2ff: ifle 30f
      // 302: goto 309
      // 305: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 308: athrow
      // 309: fconst_1
      // 30a: fload 16
      // 30c: fdiv
      // 30d: fstore 19
      // 30f: fload 19
      // 311: fconst_1
      // 312: fload 17
      // 314: fdiv
      // 315: iload 4
      // 317: ifne 35e
      // 31a: fcmpl
      // 31b: goto 322
      // 31e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 321: athrow
      // 322: ifle 32b
      // 325: fconst_1
      // 326: fload 17
      // 328: fdiv
      // 329: fstore 19
      // 32b: fload 15
      // 32d: fconst_1
      // 32e: fload 18
      // 330: fsub
      // 331: fmul
      // 332: fload 15
      // 334: fload 19
      // 336: fmul
      // 337: fload 18
      // 339: fmul
      // 33a: fadd
      // 33b: fstore 15
      // 33d: fload 16
      // 33f: fconst_1
      // 340: fload 18
      // 342: fsub
      // 343: fmul
      // 344: fload 16
      // 346: fload 19
      // 348: fmul
      // 349: fload 18
      // 34b: fmul
      // 34c: fadd
      // 34d: fstore 16
      // 34f: fload 17
      // 351: fconst_1
      // 352: fload 18
      // 354: fsub
      // 355: fmul
      // 356: fload 17
      // 358: fload 19
      // 35a: fmul
      // 35b: fload 18
      // 35d: fmul
      // 35e: fadd
      // 35f: fstore 17
      // 361: fload 15
      // 363: fconst_1
      // 364: fcmpl
      // 365: iload 4
      // 367: ifne 37b
      // 36a: ifle 377
      // 36d: goto 374
      // 370: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 373: athrow
      // 374: fconst_1
      // 375: fstore 15
      // 377: fload 16
      // 379: fconst_1
      // 37a: fcmpl
      // 37b: iload 4
      // 37d: ifne 39d
      // 380: ifle 38d
      // 383: goto 38a
      // 386: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 389: athrow
      // 38a: fconst_1
      // 38b: fstore 16
      // 38d: fload 17
      // 38f: iload 4
      // 391: ifne 3ad
      // 394: fconst_1
      // 395: fcmpl
      // 396: goto 39d
      // 399: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39c: athrow
      // 39d: ifle 3a3
      // 3a0: fconst_1
      // 3a1: fstore 17
      // 3a3: aload 0
      // 3a4: getfield v3i.iku Lc05;
      // 3a7: getfield Minecraft.oxn Lmoh;
      // 3aa: getfield moh.bpa F
      // 3ad: fstore 18
      // 3af: fconst_1
      // 3b0: fload 15
      // 3b2: fsub
      // 3b3: fstore 19
      // 3b5: fconst_1
      // 3b6: fload 16
      // 3b8: fsub
      // 3b9: fstore 20
      // 3bb: fconst_1
      // 3bc: fload 17
      // 3be: fsub
      // 3bf: fstore 21
      // 3c1: fconst_1
      // 3c2: fload 19
      // 3c4: fload 19
      // 3c6: fmul
      // 3c7: fload 19
      // 3c9: fmul
      // 3ca: fload 19
      // 3cc: fmul
      // 3cd: fsub
      // 3ce: fstore 19
      // 3d0: fconst_1
      // 3d1: fload 20
      // 3d3: fload 20
      // 3d5: fmul
      // 3d6: fload 20
      // 3d8: fmul
      // 3d9: fload 20
      // 3db: fmul
      // 3dc: fsub
      // 3dd: fstore 20
      // 3df: fconst_1
      // 3e0: fload 21
      // 3e2: fload 21
      // 3e4: fmul
      // 3e5: fload 21
      // 3e7: fmul
      // 3e8: fload 21
      // 3ea: fmul
      // 3eb: fsub
      // 3ec: fstore 21
      // 3ee: fload 15
      // 3f0: fconst_1
      // 3f1: fload 18
      // 3f3: fsub
      // 3f4: fmul
      // 3f5: fload 19
      // 3f7: fload 18
      // 3f9: fmul
      // 3fa: fadd
      // 3fb: fstore 15
      // 3fd: fload 16
      // 3ff: fconst_1
      // 400: fload 18
      // 402: fsub
      // 403: fmul
      // 404: fload 20
      // 406: fload 18
      // 408: fmul
      // 409: fadd
      // 40a: fstore 16
      // 40c: fload 17
      // 40e: fconst_1
      // 40f: fload 18
      // 411: fsub
      // 412: fmul
      // 413: fload 21
      // 415: fload 18
      // 417: fmul
      // 418: fadd
      // 419: fstore 17
      // 41b: fload 15
      // 41d: ldc 0.96
      // 41f: nop
      // 420: fmul
      // 421: ldc 0.03
      // 423: nop
      // 424: fadd
      // 425: fstore 15
      // 427: fload 16
      // 429: ldc 0.96
      // 42b: nop
      // 42c: fmul
      // 42d: ldc 0.03
      // 42f: nop
      // 430: fadd
      // 431: fstore 16
      // 433: fload 17
      // 435: ldc 0.96
      // 437: nop
      // 438: fmul
      // 439: ldc 0.03
      // 43b: nop
      // 43c: fadd
      // 43d: fstore 17
      // 43f: fload 15
      // 441: fconst_1
      // 442: fcmpl
      // 443: iload 4
      // 445: ifne 459
      // 448: ifle 455
      // 44b: goto 452
      // 44e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 451: athrow
      // 452: fconst_1
      // 453: fstore 15
      // 455: fload 16
      // 457: fconst_1
      // 458: fcmpl
      // 459: iload 4
      // 45b: ifne 46f
      // 45e: ifle 46b
      // 461: goto 468
      // 464: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 467: athrow
      // 468: fconst_1
      // 469: fstore 16
      // 46b: fload 17
      // 46d: fconst_1
      // 46e: fcmpl
      // 46f: iload 4
      // 471: ifne 485
      // 474: ifle 481
      // 477: goto 47e
      // 47a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47d: athrow
      // 47e: fconst_1
      // 47f: fstore 17
      // 481: fload 15
      // 483: fconst_0
      // 484: fcmpg
      // 485: iload 4
      // 487: ifne 49b
      // 48a: ifge 497
      // 48d: goto 494
      // 490: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 493: athrow
      // 494: fconst_0
      // 495: fstore 15
      // 497: fload 16
      // 499: fconst_0
      // 49a: fcmpg
      // 49b: iload 4
      // 49d: ifne 4b1
      // 4a0: ifge 4ad
      // 4a3: goto 4aa
      // 4a6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a9: athrow
      // 4aa: fconst_0
      // 4ab: fstore 16
      // 4ad: fload 17
      // 4af: fconst_0
      // 4b0: fcmpg
      // 4b1: iload 4
      // 4b3: ifne 4c6
      // 4b6: ifge 4c3
      // 4b9: goto 4c0
      // 4bc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4bf: athrow
      // 4c0: fconst_0
      // 4c1: fstore 17
      // 4c3: sipush 255
      // 4c6: istore 22
      // 4c8: fload 15
      // 4ca: ldc 255.0
      // 4cc: nop
      // 4cd: fmul
      // 4ce: f2i
      // 4cf: istore 23
      // 4d1: fload 16
      // 4d3: ldc 255.0
      // 4d5: nop
      // 4d6: fmul
      // 4d7: f2i
      // 4d8: istore 24
      // 4da: fload 17
      // 4dc: ldc 255.0
      // 4de: nop
      // 4df: fmul
      // 4e0: f2i
      // 4e1: istore 25
      // 4e3: aload 0
      // 4e4: getfield v3i.he3 [I
      // 4e7: iload 8
      // 4e9: iload 22
      // 4eb: bipush 24
      // 4ed: ishl
      // 4ee: iload 23
      // 4f0: bipush 16
      // 4f2: ishl
      // 4f3: ior
      // 4f4: iload 24
      // 4f6: bipush 8
      // 4f8: ishl
      // 4f9: ior
      // 4fa: iload 25
      // 4fc: ior
      // 4fd: iastore
      // 4fe: iinc 8 1
      // 501: iload 4
      // 503: ifeq 138
      // 506: aload 0
      // 507: getfield v3i.eot Lp9u;
      // 50a: invokevirtual p9u.oj6 ()V
      // 50d: aload 0
      // 50e: bipush 0
      // 50f: putfield v3i.vl2 Z
      // 512: aload 0
      // 513: getfield v3i.iku Lc05;
      // 516: getfield Minecraft.ba0 Luan;
      // 519: invokevirtual uan.uio ()V
      // 51c: return
   }

   public float hai(Entity var1, float var2) {
      int var3 = var1.dhd(mcs.lu2).ltp();

      try {
         if (var3 > 200) {
            return 1.0F;
         }
      } catch (JsonSyntaxException var4) {
         throw a(var4);
      }

      return 0.7F + fe6.rtn(((float)var3 - var2) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public void lpp(float param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 118199331615198
      // 006: lxor
      // 007: lstore 4
      // 009: fload 1
      // 00a: putstatic hxt.dhf F
      // 00d: invokestatic OpaquePredicate.c ()I
      // 010: aload 0
      // 011: invokespecial v3i.sry ()V
      // 014: istore 6
      // 016: invokestatic org/lwjgl/opengl/Display.isActive ()Z
      // 019: istore 7
      // 01b: iload 7
      // 01d: iload 6
      // 01f: ifne 049
      // 022: ifne 0bb
      // 025: goto 02c
      // 028: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aload 0
      // 02d: iload 6
      // 02f: ifne 0c3
      // 032: goto 039
      // 035: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 038: athrow
      // 039: getfield v3i.iku Lc05;
      // 03c: getfield Minecraft.oxn Lmoh;
      // 03f: getfield moh.exq Z
      // 042: goto 049
      // 045: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: ifeq 0bb
      // 04c: aload 0
      // 04d: getfield v3i.iku Lc05;
      // 050: getfield Minecraft.oxn Lmoh;
      // 053: getfield moh.mg8 Z
      // 056: iload 6
      // 058: ifne 099
      // 05b: goto 062
      // 05e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 061: athrow
      // 062: ifeq 086
      // 065: goto 06c
      // 068: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: bipush 1
      // 06d: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 070: iload 6
      // 072: ifne 099
      // 075: goto 07c
      // 078: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07b: athrow
      // 07c: ifne 0bb
      // 07f: goto 086
      // 082: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 085: athrow
      // 086: invokestatic Minecraft.qgs ()J
      // 089: aload 0
      // 08a: getfield v3i.eay J
      // 08d: lsub
      // 08e: ldc2_w 500
      // 091: lcmp
      // 092: goto 099
      // 095: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 098: athrow
      // 099: iload 6
      // 09b: ifne 0e4
      // 09e: ifle 0c9
      // 0a1: goto 0a8
      // 0a4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: getfield v3i.iku Lc05;
      // 0ac: invokevirtual Minecraft.vx6 ()V
      // 0af: iload 6
      // 0b1: ifeq 0c9
      // 0b4: goto 0bb
      // 0b7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: goto 0c3
      // 0bf: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: invokestatic Minecraft.qgs ()J
      // 0c6: putfield v3i.eay J
      // 0c9: aload 0
      // 0ca: getfield v3i.iku Lc05;
      // 0cd: getfield Minecraft.ba0 Luan;
      // 0d0: sipush 32073
      // 0d3: ldc2_w 1910068715064185915
      // 0d6: lload 4
      // 0d8: lxor
      // 0d9: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: nop
      // 0df: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0e2: iload 7
      // 0e4: iload 6
      // 0e6: ifne 165
      // 0e9: ifeq 15e
      // 0ec: goto 0f3
      // 0ef: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f2: athrow
      // 0f3: getstatic Minecraft.go6 Z
      // 0f6: iload 6
      // 0f8: ifne 165
      // 0fb: goto 102
      // 0fe: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: ifeq 15e
      // 105: goto 10c
      // 108: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10b: athrow
      // 10c: aload 0
      // 10d: getfield v3i.iku Lc05;
      // 110: getfield Minecraft.mfq Z
      // 113: iload 6
      // 115: ifne 165
      // 118: goto 11f
      // 11b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11e: athrow
      // 11f: ifeq 15e
      // 122: goto 129
      // 125: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: invokestatic org/lwjgl/input/Mouse.isInsideWindow ()Z
      // 12c: iload 6
      // 12e: ifne 165
      // 131: goto 138
      // 134: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: ifne 15e
      // 13b: goto 142
      // 13e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: bipush 0
      // 143: invokestatic org/lwjgl/input/Mouse.setGrabbed (Z)V
      // 146: invokestatic org/lwjgl/opengl/Display.getWidth ()I
      // 149: bipush 2
      // 14a: idiv
      // 14b: invokestatic org/lwjgl/opengl/Display.getHeight ()I
      // 14e: bipush 2
      // 14f: idiv
      // 150: invokestatic org/lwjgl/input/Mouse.setCursorPosition (II)V
      // 153: bipush 1
      // 154: invokestatic org/lwjgl/input/Mouse.setGrabbed (Z)V
      // 157: goto 15e
      // 15a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aload 0
      // 15f: getfield v3i.iku Lc05;
      // 162: getfield Minecraft.mfq Z
      // 165: iload 6
      // 167: ifne 290
      // 16a: ifeq 27f
      // 16d: goto 174
      // 170: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 173: athrow
      // 174: iload 7
      // 176: iload 6
      // 178: ifne 290
      // 17b: goto 182
      // 17e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 181: athrow
      // 182: ifeq 27f
      // 185: goto 18c
      // 188: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18b: athrow
      // 18c: aload 0
      // 18d: getfield v3i.iku Lc05;
      // 190: getfield Minecraft.tes Lbnl;
      // 193: invokevirtual bnl.dgn ()V
      // 196: aload 0
      // 197: getfield v3i.iku Lc05;
      // 19a: getfield Minecraft.oxn Lmoh;
      // 19d: getfield moh.igw F
      // 1a0: ldc 0.6
      // 1a2: nop
      // 1a3: fmul
      // 1a4: ldc 0.2
      // 1a6: nop
      // 1a7: fadd
      // 1a8: fstore 8
      // 1aa: fload 8
      // 1ac: fload 8
      // 1ae: fmul
      // 1af: fload 8
      // 1b1: fmul
      // 1b2: ldc 8.0
      // 1b4: nop
      // 1b5: fmul
      // 1b6: fstore 9
      // 1b8: aload 0
      // 1b9: getfield v3i.iku Lc05;
      // 1bc: getfield Minecraft.tes Lbnl;
      // 1bf: getfield bnl.wln I
      // 1c2: i2f
      // 1c3: fload 9
      // 1c5: fmul
      // 1c6: fstore 10
      // 1c8: aload 0
      // 1c9: getfield v3i.iku Lc05;
      // 1cc: getfield Minecraft.tes Lbnl;
      // 1cf: getfield bnl.lls I
      // 1d2: i2f
      // 1d3: fload 9
      // 1d5: fmul
      // 1d6: fstore 11
      // 1d8: bipush 1
      // 1d9: istore 12
      // 1db: aload 0
      // 1dc: getfield v3i.iku Lc05;
      // 1df: getfield Minecraft.oxn Lmoh;
      // 1e2: getfield moh.c3p Z
      // 1e5: iload 6
      // 1e7: ifne 20d
      // 1ea: ifeq 1f7
      // 1ed: goto 1f4
      // 1f0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f3: athrow
      // 1f4: bipush -1
      // 1f5: istore 12
      // 1f7: aload 0
      // 1f8: getfield v3i.iku Lc05;
      // 1fb: iload 6
      // 1fd: ifne 271
      // 200: getfield Minecraft.oxn Lmoh;
      // 203: getfield moh.glc Z
      // 206: goto 20d
      // 209: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20c: athrow
      // 20d: ifeq 25c
      // 210: aload 0
      // 211: dup
      // 212: getfield v3i.t5b F
      // 215: fload 10
      // 217: fadd
      // 218: putfield v3i.t5b F
      // 21b: aload 0
      // 21c: dup
      // 21d: getfield v3i.pjt F
      // 220: fload 11
      // 222: fadd
      // 223: putfield v3i.pjt F
      // 226: fload 1
      // 227: aload 0
      // 228: getfield v3i.a_7 F
      // 22b: fsub
      // 22c: fstore 13
      // 22e: aload 0
      // 22f: fload 1
      // 230: putfield v3i.a_7 F
      // 233: aload 0
      // 234: getfield v3i.b33 F
      // 237: fload 13
      // 239: fmul
      // 23a: fstore 10
      // 23c: aload 0
      // 23d: getfield v3i.n29 F
      // 240: fload 13
      // 242: fmul
      // 243: fstore 11
      // 245: aload 0
      // 246: getfield v3i.iku Lc05;
      // 249: getfield Minecraft.vg8 Ll86;
      // 24c: fload 10
      // 24e: fload 11
      // 250: iload 12
      // 252: i2f
      // 253: fmul
      // 254: invokevirtual EntityPlayerSP.zwi (FF)V
      // 257: iload 6
      // 259: ifeq 27f
      // 25c: aload 0
      // 25d: fconst_0
      // 25e: putfield v3i.t5b F
      // 261: aload 0
      // 262: fconst_0
      // 263: putfield v3i.pjt F
      // 266: aload 0
      // 267: getfield v3i.iku Lc05;
      // 26a: goto 271
      // 26d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 270: athrow
      // 271: getfield Minecraft.vg8 Ll86;
      // 274: fload 10
      // 276: fload 11
      // 278: iload 12
      // 27a: i2f
      // 27b: fmul
      // 27c: invokevirtual EntityPlayerSP.zwi (FF)V
      // 27f: aload 0
      // 280: getfield v3i.iku Lc05;
      // 283: getfield Minecraft.ba0 Luan;
      // 286: invokevirtual uan.uio ()V
      // 289: aload 0
      // 28a: getfield v3i.iku Lc05;
      // 28d: getfield Minecraft.pba Z
      // 290: iload 6
      // 292: ifne 636
      // 295: ifne 615
      // 298: goto 29f
      // 29b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29e: athrow
      // 29f: aload 0
      // 2a0: getfield v3i.iku Lc05;
      // 2a3: getfield Minecraft.oxn Lmoh;
      // 2a6: getfield moh.rdb Z
      // 2a9: putstatic v3i.v0c Z
      // 2ac: new eka
      // 2af: dup
      // 2b0: aload 0
      // 2b1: getfield v3i.iku Lc05;
      // 2b4: invokespecial eka.<init> (Lc05;)V
      // 2b7: astore 8
      // 2b9: aload 8
      // 2bb: invokevirtual eka.x05 ()I
      // 2be: istore 9
      // 2c0: aload 8
      // 2c2: invokevirtual eka.lrx ()I
      // 2c5: istore 10
      // 2c7: invokestatic org/lwjgl/input/Mouse.getX ()I
      // 2ca: iload 9
      // 2cc: imul
      // 2cd: aload 0
      // 2ce: getfield v3i.iku Lc05;
      // 2d1: getfield Minecraft.pfr I
      // 2d4: idiv
      // 2d5: istore 11
      // 2d7: iload 10
      // 2d9: invokestatic org/lwjgl/input/Mouse.getY ()I
      // 2dc: iload 10
      // 2de: imul
      // 2df: aload 0
      // 2e0: getfield v3i.iku Lc05;
      // 2e3: getfield Minecraft.ry7 I
      // 2e6: idiv
      // 2e7: isub
      // 2e8: bipush 1
      // 2e9: isub
      // 2ea: istore 12
      // 2ec: aload 0
      // 2ed: getfield v3i.iku Lc05;
      // 2f0: getfield Minecraft.oxn Lmoh;
      // 2f3: getfield moh.ybq I
      // 2f6: istore 13
      // 2f8: aload 0
      // 2f9: iload 6
      // 2fb: ifne 4e9
      // 2fe: getfield v3i.iku Lc05;
      // 301: getfield Minecraft.tij Lkh3;
      // 304: ifnull 4b8
      // 307: goto 30e
      // 30a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30d: athrow
      // 30e: aload 0
      // 30f: getfield v3i.iku Lc05;
      // 312: getfield Minecraft.ba0 Luan;
      // 315: sipush 19520
      // 318: ldc2_w 3595902127905629480
      // 31b: lload 4
      // 31d: lxor
      // 31e: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: nop
      // 324: invokevirtual uan.qek (Ljava/lang/String;)V
      // 327: invokestatic Minecraft.bdw ()I
      // 32a: iload 13
      // 32c: invokestatic java/lang/Math.min (II)I
      // 32f: istore 14
      // 331: iload 14
      // 333: bipush 60
      // 335: invokestatic java/lang/Math.max (II)I
      // 338: istore 14
      // 33a: invokestatic java/lang/System.nanoTime ()J
      // 33d: lload 2
      // 33e: lsub
      // 33f: lstore 15
      // 341: ldc 1000000000
      // 343: nop
      // 344: iload 14
      // 346: idiv
      // 347: bipush 4
      // 348: idiv
      // 349: i2l
      // 34a: lload 15
      // 34c: lsub
      // 34d: lconst_0
      // 34e: invokestatic java/lang/Math.max (JJ)J
      // 351: lstore 17
      // 353: aload 0
      // 354: fload 1
      // 355: invokestatic java/lang/System.nanoTime ()J
      // 358: lload 17
      // 35a: ladd
      // 35b: invokevirtual v3i.wiy (FJ)V
      // 35e: getstatic gis.jap Z
      // 361: iload 6
      // 363: ifne 401
      // 366: ifeq 3d7
      // 369: goto 370
      // 36c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36f: athrow
      // 370: aload 0
      // 371: getfield v3i.iku Lc05;
      // 374: getfield Minecraft.vsl Lcrp;
      // 377: invokevirtual crp.vnv ()V
      // 37a: aload 0
      // 37b: iload 6
      // 37d: ifne 3cd
      // 380: goto 387
      // 383: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 386: athrow
      // 387: getfield v3i.n5u Lqn4;
      // 38a: ifnull 3cc
      // 38d: goto 394
      // 390: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 393: athrow
      // 394: aload 0
      // 395: iload 6
      // 397: ifne 3cd
      // 39a: goto 3a1
      // 39d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a0: athrow
      // 3a1: getfield v3i.ssp Z
      // 3a4: ifeq 3cc
      // 3a7: goto 3ae
      // 3aa: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ad: athrow
      // 3ae: sipush 5890
      // 3b1: invokestatic hzu.ah8 (I)V
      // 3b4: invokestatic hzu.dp2 ()V
      // 3b7: invokestatic hzu.zwy ()V
      // 3ba: aload 0
      // 3bb: getfield v3i.n5u Lqn4;
      // 3be: fload 1
      // 3bf: invokevirtual qn4.hii (F)V
      // 3c2: invokestatic hzu.x3w ()V
      // 3c5: goto 3cc
      // 3c8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cb: athrow
      // 3cc: aload 0
      // 3cd: getfield v3i.iku Lc05;
      // 3d0: invokevirtual Minecraft._d2 ()Loru;
      // 3d3: bipush 1
      // 3d4: invokevirtual oru.mou (Z)V
      // 3d7: aload 0
      // 3d8: invokestatic java/lang/System.nanoTime ()J
      // 3db: putfield v3i.x5c J
      // 3de: aload 0
      // 3df: getfield v3i.iku Lc05;
      // 3e2: getfield Minecraft.ba0 Luan;
      // 3e5: sipush 27291
      // 3e8: ldc2_w 8036190125001294806
      // 3eb: lload 4
      // 3ed: lxor
      // 3ee: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: nop
      // 3f4: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 3f7: aload 0
      // 3f8: getfield v3i.iku Lc05;
      // 3fb: getfield Minecraft.oxn Lmoh;
      // 3fe: getfield moh.x8y Z
      // 401: iload 6
      // 403: ifne 452
      // 406: ifeq 42d
      // 409: goto 410
      // 40c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40f: athrow
      // 410: aload 0
      // 411: getfield v3i.iku Lc05;
      // 414: iload 6
      // 416: ifne 4ad
      // 419: goto 420
      // 41c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41f: athrow
      // 420: getfield Minecraft.u0y Lgbe;
      // 423: ifnull 4a9
      // 426: goto 42d
      // 429: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42c: athrow
      // 42d: sipush 516
      // 430: ldc 0.1
      // 432: nop
      // 433: invokestatic hzu.fak (IF)V
      // 436: aload 0
      // 437: getfield v3i.iku Lc05;
      // 43a: getfield Minecraft.t43 Ld1f;
      // 43d: fload 1
      // 43e: invokevirtual d1f.vuw (F)V
      // 441: aload 0
      // 442: getfield v3i.iku Lc05;
      // 445: getfield Minecraft.oxn Lmoh;
      // 448: getfield moh.dnw Z
      // 44b: goto 452
      // 44e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 451: athrow
      // 452: iload 6
      // 454: ifne 49a
      // 457: ifeq 484
      // 45a: goto 461
      // 45d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 460: athrow
      // 461: aload 0
      // 462: getfield v3i.iku Lc05;
      // 465: getfield Minecraft.oxn Lmoh;
      // 468: getfield moh.vrs Z
      // 46b: iload 6
      // 46d: ifne 49a
      // 470: goto 477
      // 473: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 476: athrow
      // 477: ifne 484
      // 47a: goto 481
      // 47d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 480: athrow
      // 481: invokestatic hxt.lc5 ()V
      // 484: aload 0
      // 485: getfield v3i.iku Lc05;
      // 488: iload 6
      // 48a: ifne 4ad
      // 48d: getfield Minecraft.oxn Lmoh;
      // 490: getfield moh.vrs Z
      // 493: goto 49a
      // 496: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 499: athrow
      // 49a: ifeq 4a9
      // 49d: aload 8
      // 49f: invokestatic net/optifine/Lagometer.showLagometer (Leka;)V
      // 4a2: goto 4a9
      // 4a5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a8: athrow
      // 4a9: aload 0
      // 4aa: getfield v3i.iku Lc05;
      // 4ad: getfield Minecraft.ba0 Luan;
      // 4b0: invokevirtual uan.uio ()V
      // 4b3: iload 6
      // 4b5: ifeq 509
      // 4b8: bipush 0
      // 4b9: bipush 0
      // 4ba: aload 0
      // 4bb: getfield v3i.iku Lc05;
      // 4be: getfield Minecraft.pfr I
      // 4c1: aload 0
      // 4c2: getfield v3i.iku Lc05;
      // 4c5: getfield Minecraft.ry7 I
      // 4c8: invokestatic hzu.fb6 (IIII)V
      // 4cb: sipush 5889
      // 4ce: invokestatic hzu.ah8 (I)V
      // 4d1: invokestatic hzu.zwy ()V
      // 4d4: sipush 5888
      // 4d7: invokestatic hzu.ah8 (I)V
      // 4da: invokestatic hzu.zwy ()V
      // 4dd: aload 0
      // 4de: invokevirtual v3i.oys ()V
      // 4e1: aload 0
      // 4e2: goto 4e9
      // 4e5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e8: athrow
      // 4e9: invokestatic java/lang/System.nanoTime ()J
      // 4ec: putfield v3i.x5c J
      // 4ef: getstatic xv4.b2r Lxv4;
      // 4f2: aload 0
      // 4f3: getfield v3i.iku Lc05;
      // 4f6: invokevirtual Minecraft.l22 ()Llc5;
      // 4f9: putfield xv4.gby Llc5;
      // 4fc: getstatic xv4.b2r Lxv4;
      // 4ff: aload 0
      // 500: getfield v3i.iku Lc05;
      // 503: getfield Minecraft.tx1 Lowt;
      // 506: putfield xv4.z7t Lowt;
      // 509: aload 0
      // 50a: getfield v3i.iku Lc05;
      // 50d: iload 6
      // 50f: ifne 624
      // 512: getfield Minecraft.u0y Lgbe;
      // 515: ifnull 615
      // 518: goto 51f
      // 51b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51e: athrow
      // 51f: sipush 256
      // 522: invokestatic hzu.yg5 (I)V
      // 525: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_drawScreen Lnet/optifine/reflect/ReflectorMethod;
      // 528: iload 6
      // 52a: ifne 53d
      // 52d: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 530: ifeq 56a
      // 533: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_drawScreen Lnet/optifine/reflect/ReflectorMethod;
      // 536: goto 53d
      // 539: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53c: athrow
      // 53d: bipush 4
      // 53e: anewarray 84
      // 541: dup
      // 542: bipush 0
      // 543: aload 0
      // 544: getfield v3i.iku Lc05;
      // 547: getfield Minecraft.u0y Lgbe;
      // 54a: aastore
      // 54b: dup
      // 54c: bipush 1
      // 54d: iload 11
      // 54f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 552: aastore
      // 553: dup
      // 554: bipush 2
      // 555: iload 12
      // 557: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 55a: aastore
      // 55b: dup
      // 55c: bipush 3
      // 55d: fload 1
      // 55e: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 561: aastore
      // 562: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 565: iload 6
      // 567: ifeq 580
      // 56a: aload 0
      // 56b: getfield v3i.iku Lc05;
      // 56e: getfield Minecraft.u0y Lgbe;
      // 571: iload 11
      // 573: iload 12
      // 575: fload 1
      // 576: invokevirtual ShaderHelper.drawScreen (IIF)V
      // 579: goto 580
      // 57c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57f: athrow
      // 580: goto 615
      // 583: astore 14
      // 585: aload 14
      // 587: sipush 21951
      // 58a: ldc2_w 166211769768017106
      // 58d: lload 4
      // 58f: lxor
      // 590: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 595: nop
      // 596: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 599: astore 15
      // 59b: aload 15
      // 59d: sipush 7648
      // 5a0: ldc2_w 6635241633799517389
      // 5a3: lload 4
      // 5a5: lxor
      // 5a6: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ab: nop
      // 5ac: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 5af: astore 16
      // 5b1: aload 16
      // 5b3: sipush 17660
      // 5b6: ldc2_w 6376647809175154093
      // 5b9: lload 4
      // 5bb: lxor
      // 5bc: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: nop
      // 5c2: new v3i$2
      // 5c5: dup
      // 5c6: aload 0
      // 5c7: invokespecial v3i$2.<init> (Lv3i;)V
      // 5ca: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 5cd: aload 16
      // 5cf: sipush 29035
      // 5d2: ldc2_w 1854228274616391719
      // 5d5: lload 4
      // 5d7: lxor
      // 5d8: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5dd: nop
      // 5de: new v3i$3
      // 5e1: dup
      // 5e2: aload 0
      // 5e3: iload 11
      // 5e5: iload 12
      // 5e7: invokespecial v3i$3.<init> (Lv3i;II)V
      // 5ea: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 5ed: aload 16
      // 5ef: sipush 24759
      // 5f2: ldc2_w 3676071540708723166
      // 5f5: lload 4
      // 5f7: lxor
      // 5f8: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fd: nop
      // 5fe: new v3i$4
      // 601: dup
      // 602: aload 0
      // 603: aload 8
      // 605: invokespecial v3i$4.<init> (Lv3i;Leka;)V
      // 608: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 60b: new oov
      // 60e: dup
      // 60f: aload 15
      // 611: invokespecial oov.<init> (Le1i;)V
      // 614: athrow
      // 615: aload 0
      // 616: invokespecial v3i.o1e ()V
      // 619: aload 0
      // 61a: invokespecial v3i.n13 ()V
      // 61d: invokestatic net/optifine/Lagometer.updateLagometer ()V
      // 620: aload 0
      // 621: getfield v3i.iku Lc05;
      // 624: getfield Minecraft.oxn Lmoh;
      // 627: iload 6
      // 629: ifne 647
      // 62c: getfield moh.rfn Z
      // 62f: goto 636
      // 632: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 635: athrow
      // 636: ifeq 64b
      // 639: aload 0
      // 63a: getfield v3i.iku Lc05;
      // 63d: getfield Minecraft.oxn Lmoh;
      // 640: goto 647
      // 643: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 646: athrow
      // 647: bipush 1
      // 648: putfield moh.woq Z
      // 64b: return
   }

   public void tlw(float var1) {
      this.oys();
      this.iku.t43._vq(new eka(this.iku));
   }

   private boolean z76() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 01d
      // 009: getfield v3i.ahx Z
      // 00c: ifne 01c
      // 00f: goto 016
      // 012: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield v3i.iku Lc05;
      // 020: invokevirtual Minecraft.nsd ()Li2h;
      // 023: astore 2
      // 024: aload 2
      // 025: instanceof ha9
      // 028: iload 1
      // 029: ifne 047
      // 02c: ifeq 059
      // 02f: goto 036
      // 032: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 035: athrow
      // 036: aload 0
      // 037: getfield v3i.iku Lc05;
      // 03a: getfield Minecraft.oxn Lmoh;
      // 03d: getfield moh.x8y Z
      // 040: goto 047
      // 043: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: iload 1
      // 048: ifne 056
      // 04b: ifne 059
      // 04e: goto 055
      // 051: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: bipush 1
      // 056: goto 05a
      // 059: bipush 0
      // 05a: istore 3
      // 05b: iload 3
      // 05c: iload 1
      // 05d: ifne 19a
      // 060: ifeq 199
      // 063: goto 06a
      // 066: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 069: athrow
      // 06a: aload 2
      // 06b: checkcast ha9
      // 06e: getfield ha9.lls Lpj2;
      // 071: getfield pj2.x4a Z
      // 074: iload 1
      // 075: ifne 19a
      // 078: goto 07f
      // 07b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: ifne 199
      // 082: goto 089
      // 085: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: aload 2
      // 08a: checkcast ha9
      // 08d: invokevirtual ha9.b5z ()Lerg;
      // 090: astore 4
      // 092: aload 0
      // 093: getfield v3i.iku Lc05;
      // 096: getfield Minecraft.dzk Lakm;
      // 099: iload 1
      // 09a: ifne 0b5
      // 09d: ifnull 199
      // 0a0: goto 0a7
      // 0a3: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield v3i.iku Lc05;
      // 0ab: getfield Minecraft.dzk Lakm;
      // 0ae: goto 0b5
      // 0b1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: iload 1
      // 0b6: ifne 0d7
      // 0b9: getfield akm.oyz Lakm$qs6;
      // 0bc: getstatic akm$qs6.i4l Lakm$qs6;
      // 0bf: if_acmpne 199
      // 0c2: goto 0c9
      // 0c5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: getfield v3i.iku Lc05;
      // 0cd: getfield Minecraft.dzk Lakm;
      // 0d0: goto 0d7
      // 0d3: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: invokevirtual akm._uf ()Lmew;
      // 0da: astore 5
      // 0dc: aload 0
      // 0dd: getfield v3i.iku Lc05;
      // 0e0: getfield Minecraft.tij Lkh3;
      // 0e3: aload 5
      // 0e5: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0e8: astore 6
      // 0ea: aload 6
      // 0ec: invokeinterface zfz.r_y ()Le0x; 1
      // 0f1: astore 7
      // 0f3: aload 0
      // 0f4: getfield v3i.iku Lc05;
      // 0f7: getfield Minecraft.l7q Lhh6;
      // 0fa: invokevirtual hh6.fdl ()Lh50$f05;
      // 0fd: getstatic h50$f05.l18 Lh50$f05;
      // 100: if_acmpne 14b
      // 103: aload 6
      // 105: invokestatic net/optifine/reflect/ReflectorForge.blockHasTileEntity (Lzfz;)Z
      // 108: iload 1
      // 109: ifne 133
      // 10c: goto 113
      // 10f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: ifeq 145
      // 116: goto 11d
      // 119: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11c: athrow
      // 11d: aload 0
      // 11e: getfield v3i.iku Lc05;
      // 121: getfield Minecraft.tij Lkh3;
      // 124: aload 5
      // 126: invokevirtual WorldClient.getTileEntity (Lmew;)Lpyk;
      // 129: instanceof rsi
      // 12c: goto 133
      // 12f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: iload 1
      // 134: ifne 142
      // 137: ifeq 145
      // 13a: goto 141
      // 13d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: bipush 1
      // 142: goto 146
      // 145: bipush 0
      // 146: istore 3
      // 147: iload 1
      // 148: ifeq 199
      // 14b: aload 4
      // 14d: iload 1
      // 14e: ifne 164
      // 151: goto 158
      // 154: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: ifnull 197
      // 15b: goto 162
      // 15e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 161: athrow
      // 162: aload 4
      // 164: aload 7
      // 166: invokevirtual erg.pgf (Le0x;)Z
      // 169: iload 1
      // 16a: ifne 194
      // 16d: ifne 193
      // 170: goto 177
      // 173: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: aload 4
      // 179: aload 7
      // 17b: invokevirtual erg.emo (Le0x;)Z
      // 17e: iload 1
      // 17f: ifne 194
      // 182: goto 189
      // 185: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 188: athrow
      // 189: ifeq 197
      // 18c: goto 193
      // 18f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: bipush 1
      // 194: goto 198
      // 197: bipush 0
      // 198: istore 3
      // 199: iload 3
      // 19a: ireturn
   }

   private void e9w(float param1) {
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
      // 005: getfield v3i.iku Lc05;
      // 008: getfield Minecraft.oxn Lmoh;
      // 00b: getfield moh.vrs Z
      // 00e: iload 2
      // 00f: ifne 02d
      // 012: ifeq 122
      // 015: goto 01c
      // 018: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield v3i.iku Lc05;
      // 020: getfield Minecraft.oxn Lmoh;
      // 023: getfield moh.x8y Z
      // 026: goto 02d
      // 029: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: iload 2
      // 02e: ifne 04c
      // 031: ifne 122
      // 034: goto 03b
      // 037: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield v3i.iku Lc05;
      // 03f: getfield Minecraft.vg8 Ll86;
      // 042: invokevirtual EntityPlayerSP.acj ()Z
      // 045: goto 04c
      // 048: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: iload 2
      // 04d: ifne 076
      // 050: ifne 122
      // 053: goto 05a
      // 056: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 0
      // 05b: getfield v3i.iku Lc05;
      // 05e: iload 2
      // 05f: ifne 084
      // 062: goto 069
      // 065: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: getfield Minecraft.oxn Lmoh;
      // 06c: getfield moh.yb8 Z
      // 06f: goto 076
      // 072: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: ifne 122
      // 079: aload 0
      // 07a: getfield v3i.iku Lc05;
      // 07d: goto 084
      // 080: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: invokevirtual Minecraft.nsd ()Li2h;
      // 087: astore 3
      // 088: invokestatic hzu.spd ()V
      // 08b: sipush 770
      // 08e: sipush 771
      // 091: bipush 1
      // 092: bipush 0
      // 093: invokestatic hzu.u39 (IIII)V
      // 096: fconst_1
      // 097: invokestatic org/lwjgl/opengl/GL11.glLineWidth (F)V
      // 09a: invokestatic hzu.m_1 ()V
      // 09d: bipush 0
      // 09e: invokestatic hzu.jun (Z)V
      // 0a1: invokestatic hzu.dp2 ()V
      // 0a4: sipush 5888
      // 0a7: invokestatic hzu.ah8 (I)V
      // 0aa: invokestatic hzu.zwy ()V
      // 0ad: aload 0
      // 0ae: fload 1
      // 0af: invokevirtual v3i.pmp (F)V
      // 0b2: fconst_0
      // 0b3: aload 3
      // 0b4: invokevirtual EntityLivingBase.c5y ()F
      // 0b7: fconst_0
      // 0b8: invokestatic hzu.a4k (FFF)V
      // 0bb: new nh4
      // 0be: dup
      // 0bf: dconst_0
      // 0c0: dconst_0
      // 0c1: dconst_0
      // 0c2: ldc2_w 0.005
      // 0c5: ldc2_w 1.0E-4
      // 0c8: ldc2_w 1.0E-4
      // 0cb: invokespecial nh4.<init> (DDDDDD)V
      // 0ce: sipush 255
      // 0d1: bipush 0
      // 0d2: bipush 0
      // 0d3: sipush 255
      // 0d6: invokestatic crp.h_0 (Lnh4;IIII)V
      // 0d9: new nh4
      // 0dc: dup
      // 0dd: dconst_0
      // 0de: dconst_0
      // 0df: dconst_0
      // 0e0: ldc2_w 1.0E-4
      // 0e3: ldc2_w 1.0E-4
      // 0e6: ldc2_w 0.005
      // 0e9: invokespecial nh4.<init> (DDDDDD)V
      // 0ec: bipush 0
      // 0ed: bipush 0
      // 0ee: sipush 255
      // 0f1: sipush 255
      // 0f4: invokestatic crp.h_0 (Lnh4;IIII)V
      // 0f7: new nh4
      // 0fa: dup
      // 0fb: dconst_0
      // 0fc: dconst_0
      // 0fd: dconst_0
      // 0fe: ldc2_w 1.0E-4
      // 101: ldc2_w 0.0033
      // 104: ldc2_w 1.0E-4
      // 107: invokespecial nh4.<init> (DDDDDD)V
      // 10a: bipush 0
      // 10b: sipush 255
      // 10e: bipush 0
      // 10f: sipush 255
      // 112: invokestatic crp.h_0 (Lnh4;IIII)V
      // 115: invokestatic hzu.x3w ()V
      // 118: bipush 1
      // 119: invokestatic hzu.jun (Z)V
      // 11c: invokestatic hzu.rqj ()V
      // 11f: invokestatic hzu.ux6 ()V
      // 122: return
   }

   public void wiy(float param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v3i.a J
      // 03: ldc2_w 61952157415337
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: fload 1
      // 10: invokespecial v3i.v_o (F)V
      // 13: aload 0
      // 14: iload 6
      // 16: ifeq 3f
      // 19: getfield v3i.iku Lc05;
      // 1c: invokevirtual Minecraft.nsd ()Li2h;
      // 1f: ifnonnull 3e
      // 22: goto 29
      // 25: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield v3i.iku Lc05;
      // 2d: aload 0
      // 2e: getfield v3i.iku Lc05;
      // 31: getfield Minecraft.vg8 Ll86;
      // 34: invokevirtual Minecraft.gri (Li2h;)V
      // 37: goto 3e
      // 3a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: fload 1
      // 40: invokevirtual v3i.vul (F)V
      // 43: invokestatic hxt.ly3 ()Z
      // 46: iload 6
      // 48: ifeq a3
      // 4b: ifeq 65
      // 4e: goto 55
      // 51: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: getfield v3i.iku Lc05;
      // 59: fload 1
      // 5a: lload 2
      // 5b: invokestatic net/optifine/shaders/Shaders.beginRender (Lc05;FJ)V
      // 5e: goto 65
      // 61: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: invokestatic hzu.m45 ()V
      // 68: invokestatic hzu.if9 ()V
      // 6b: sipush 516
      // 6e: ldc 0.1
      // 70: nop
      // 71: invokestatic hzu.fak (IF)V
      // 74: aload 0
      // 75: getfield v3i.iku Lc05;
      // 78: getfield Minecraft.ba0 Luan;
      // 7b: sipush 8849
      // 7e: ldc2_w 4559740015868382618
      // 81: lload 4
      // 83: lxor
      // 84: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: nop
      // 8a: invokevirtual uan.qek (Ljava/lang/String;)V
      // 8d: aload 0
      // 8e: iload 6
      // 90: ifeq e5
      // 93: getfield v3i.iku Lc05;
      // 96: getfield Minecraft.oxn Lmoh;
      // 99: getfield moh.rdb Z
      // 9c: goto a3
      // 9f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a2: athrow
      // a3: ifeq dd
      // a6: bipush 0
      // a7: putstatic v3i.klp I
      // aa: bipush 0
      // ab: bipush 1
      // ac: bipush 1
      // ad: bipush 0
      // ae: invokestatic hzu.y4q (ZZZZ)V
      // b1: aload 0
      // b2: bipush 0
      // b3: fload 1
      // b4: lload 2
      // b5: invokespecial v3i.m5i (IFJ)V
      // b8: bipush 1
      // b9: putstatic v3i.klp I
      // bc: bipush 1
      // bd: bipush 0
      // be: bipush 0
      // bf: bipush 0
      // c0: invokestatic hzu.y4q (ZZZZ)V
      // c3: aload 0
      // c4: bipush 1
      // c5: fload 1
      // c6: lload 2
      // c7: invokespecial v3i.m5i (IFJ)V
      // ca: bipush 1
      // cb: bipush 1
      // cc: bipush 1
      // cd: bipush 0
      // ce: invokestatic hzu.y4q (ZZZZ)V
      // d1: iload 6
      // d3: ifne eb
      // d6: goto dd
      // d9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // dc: athrow
      // dd: aload 0
      // de: goto e5
      // e1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e4: athrow
      // e5: bipush 2
      // e6: fload 1
      // e7: lload 2
      // e8: invokespecial v3i.m5i (IFJ)V
      // eb: aload 0
      // ec: getfield v3i.iku Lc05;
      // ef: getfield Minecraft.ba0 Luan;
      // f2: invokevirtual uan.uio ()V
      // f5: return
   }

   private void m5i(int param1, float param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 20393059550233
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 7
      // 00e: invokestatic hxt.ly3 ()Z
      // 011: istore 8
      // 013: iload 8
      // 015: iload 7
      // 017: ifne 025
      // 01a: ifeq 02a
      // 01d: goto 024
      // 020: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: iload 1
      // 025: fload 2
      // 026: lload 3
      // 027: invokestatic net/optifine/shaders/Shaders.beginRenderPass (IFJ)V
      // 02a: aload 0
      // 02b: getfield v3i.iku Lc05;
      // 02e: getfield Minecraft.vsl Lcrp;
      // 031: astore 9
      // 033: aload 0
      // 034: getfield v3i.iku Lc05;
      // 037: getfield Minecraft.i4p Ljux;
      // 03a: astore 10
      // 03c: aload 0
      // 03d: invokespecial v3i.z76 ()Z
      // 040: istore 11
      // 042: invokestatic hzu.gp4 ()V
      // 045: aload 0
      // 046: getfield v3i.iku Lc05;
      // 049: getfield Minecraft.ba0 Luan;
      // 04c: sipush 17025
      // 04f: ldc2_w 4821921299774938660
      // 052: lload 5
      // 054: lxor
      // 055: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: nop
      // 05b: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 05e: iload 8
      // 060: iload 7
      // 062: ifne 096
      // 065: ifeq 08e
      // 068: goto 06f
      // 06b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: bipush 0
      // 070: bipush 0
      // 071: aload 0
      // 072: getfield v3i.iku Lc05;
      // 075: getfield Minecraft.pfr I
      // 078: aload 0
      // 079: getfield v3i.iku Lc05;
      // 07c: getfield Minecraft.ry7 I
      // 07f: invokestatic net/optifine/shaders/Shaders.setViewport (IIII)V
      // 082: iload 7
      // 084: ifeq 0a8
      // 087: goto 08e
      // 08a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08d: athrow
      // 08e: bipush 0
      // 08f: goto 096
      // 092: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 095: athrow
      // 096: bipush 0
      // 097: aload 0
      // 098: getfield v3i.iku Lc05;
      // 09b: getfield Minecraft.pfr I
      // 09e: aload 0
      // 09f: getfield v3i.iku Lc05;
      // 0a2: getfield Minecraft.ry7 I
      // 0a5: invokestatic hzu.fb6 (IIII)V
      // 0a8: aload 0
      // 0a9: fload 2
      // 0aa: invokespecial v3i.h_8 (F)V
      // 0ad: sipush 16640
      // 0b0: invokestatic hzu.yg5 (I)V
      // 0b3: iload 8
      // 0b5: iload 7
      // 0b7: ifne 0f4
      // 0ba: ifeq 0c7
      // 0bd: goto 0c4
      // 0c0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: invokestatic net/optifine/shaders/Shaders.clearRenderBuffer ()V
      // 0c7: aload 0
      // 0c8: getfield v3i.iku Lc05;
      // 0cb: getfield Minecraft.ba0 Luan;
      // 0ce: sipush 31002
      // 0d1: ldc2_w 2677457759080195469
      // 0d4: lload 5
      // 0d6: lxor
      // 0d7: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: nop
      // 0dd: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 0e0: aload 0
      // 0e1: iload 7
      // 0e3: ifne 103
      // 0e6: fload 2
      // 0e7: iload 1
      // 0e8: invokevirtual v3i.i_6 (FI)V
      // 0eb: iload 8
      // 0ed: goto 0f4
      // 0f0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: ifeq 102
      // 0f7: fload 2
      // 0f8: invokestatic net/optifine/shaders/Shaders.setCamera (F)V
      // 0fb: goto 102
      // 0fe: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 0
      // 103: getfield v3i.iku Lc05;
      // 106: getfield Minecraft.vg8 Ll86;
      // 109: aload 0
      // 10a: getfield v3i.iku Lc05;
      // 10d: getfield Minecraft.oxn Lmoh;
      // 110: getfield moh.i_y I
      // 113: iload 7
      // 115: ifne 12b
      // 118: bipush 2
      // 119: if_icmpne 12e
      // 11c: goto 123
      // 11f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 122: athrow
      // 123: bipush 1
      // 124: goto 12b
      // 127: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: goto 12f
      // 12e: bipush 0
      // 12f: invokestatic bm4.biq (Lha9;Z)V
      // 132: aload 0
      // 133: getfield v3i.iku Lc05;
      // 136: getfield Minecraft.ba0 Luan;
      // 139: sipush 4747
      // 13c: ldc2_w 2505610642048568839
      // 13f: lload 5
      // 141: lxor
      // 142: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: nop
      // 148: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 14b: invokestatic g2u.n16 ()Luka;
      // 14e: astore 12
      // 150: aload 0
      // 151: getfield v3i.iku Lc05;
      // 154: getfield Minecraft.ba0 Luan;
      // 157: sipush 10556
      // 15a: ldc2_w 352010651050407389
      // 15d: lload 5
      // 15f: lxor
      // 160: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: nop
      // 166: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 169: aload 12
      // 16b: invokestatic hxt.ly3 ()Z
      // 16e: iload 7
      // 170: ifne 180
      // 173: ifeq 193
      // 176: goto 17d
      // 179: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: invokestatic net/optifine/shaders/Shaders.isFrustumCulling ()Z
      // 180: iload 7
      // 182: ifne 190
      // 185: ifne 193
      // 188: goto 18f
      // 18b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18e: athrow
      // 18f: bipush 1
      // 190: goto 194
      // 193: bipush 0
      // 194: putfield uka.zoh Z
      // 197: new grx
      // 19a: dup
      // 19b: aload 12
      // 19d: invokespecial grx.<init> (Luka;)V
      // 1a0: astore 13
      // 1a2: aload 0
      // 1a3: getfield v3i.iku Lc05;
      // 1a6: invokevirtual Minecraft.nsd ()Li2h;
      // 1a9: astore 14
      // 1ab: aload 14
      // 1ad: getfield EntityLivingBase.ivp D
      // 1b0: aload 14
      // 1b2: getfield EntityLivingBase.o2v D
      // 1b5: aload 14
      // 1b7: getfield EntityLivingBase.ivp D
      // 1ba: dsub
      // 1bb: fload 2
      // 1bc: f2d
      // 1bd: dmul
      // 1be: dadd
      // 1bf: dstore 15
      // 1c1: aload 14
      // 1c3: getfield EntityLivingBase.c54 D
      // 1c6: aload 14
      // 1c8: getfield EntityLivingBase.kfp D
      // 1cb: aload 14
      // 1cd: getfield EntityLivingBase.c54 D
      // 1d0: dsub
      // 1d1: fload 2
      // 1d2: f2d
      // 1d3: dmul
      // 1d4: dadd
      // 1d5: dstore 17
      // 1d7: aload 14
      // 1d9: getfield EntityLivingBase.e2b D
      // 1dc: aload 14
      // 1de: getfield EntityLivingBase.vbd D
      // 1e1: aload 14
      // 1e3: getfield EntityLivingBase.e2b D
      // 1e6: dsub
      // 1e7: fload 2
      // 1e8: f2d
      // 1e9: dmul
      // 1ea: dadd
      // 1eb: dstore 19
      // 1ed: iload 7
      // 1ef: ifne 210
      // 1f2: iload 8
      // 1f4: ifeq 215
      // 1f7: goto 1fe
      // 1fa: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fd: athrow
      // 1fe: aload 13
      // 200: dload 15
      // 202: dload 17
      // 204: dload 19
      // 206: invokestatic net/optifine/shaders/ShadersRender.setFrustrumPosition (L_aq;DDD)V
      // 209: goto 210
      // 20c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20f: athrow
      // 210: iload 7
      // 212: ifeq 229
      // 215: aload 13
      // 217: dload 15
      // 219: dload 17
      // 21b: dload 19
      // 21d: invokeinterface _aq._wl (DDD)V 7
      // 222: goto 229
      // 225: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 228: athrow
      // 229: invokestatic hxt.imn ()Z
      // 22c: iload 7
      // 22e: ifne 270
      // 231: ifne 26d
      // 234: goto 23b
      // 237: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23a: athrow
      // 23b: invokestatic hxt.kbg ()Z
      // 23e: iload 7
      // 240: ifne 270
      // 243: goto 24a
      // 246: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 249: athrow
      // 24a: ifne 26d
      // 24d: goto 254
      // 250: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 253: athrow
      // 254: invokestatic hxt.ose ()Z
      // 257: iload 7
      // 259: ifne 270
      // 25c: goto 263
      // 25f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 262: athrow
      // 263: ifeq 339
      // 266: goto 26d
      // 269: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26c: athrow
      // 26d: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 270: iload 7
      // 272: ifne 2d7
      // 275: ifne 339
      // 278: goto 27f
      // 27b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: aload 0
      // 280: bipush -1
      // 281: fload 2
      // 282: invokespecial v3i.znd (IF)V
      // 285: aload 0
      // 286: getfield v3i.iku Lc05;
      // 289: getfield Minecraft.ba0 Luan;
      // 28c: sipush 25729
      // 28f: ldc2_w 1261124880914888810
      // 292: lload 5
      // 294: lxor
      // 295: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: nop
      // 29b: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 29e: sipush 5889
      // 2a1: invokestatic hzu.ah8 (I)V
      // 2a4: invokestatic hzu.zwy ()V
      // 2a7: aload 0
      // 2a8: fload 2
      // 2a9: bipush 1
      // 2aa: invokespecial v3i.pcw (FZ)F
      // 2ad: aload 0
      // 2ae: getfield v3i.iku Lc05;
      // 2b1: getfield Minecraft.pfr I
      // 2b4: i2f
      // 2b5: aload 0
      // 2b6: getfield v3i.iku Lc05;
      // 2b9: getfield Minecraft.ry7 I
      // 2bc: i2f
      // 2bd: fdiv
      // 2be: ldc 0.05
      // 2c0: nop
      // 2c1: aload 0
      // 2c2: getfield v3i.ols F
      // 2c5: invokestatic org/lwjgl/util/glu/Project.gluPerspective (FFFF)V
      // 2c8: sipush 5888
      // 2cb: invokestatic hzu.ah8 (I)V
      // 2ce: iload 8
      // 2d0: goto 2d7
      // 2d3: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d6: athrow
      // 2d7: iload 7
      // 2d9: ifne 2f2
      // 2dc: ifeq 2e9
      // 2df: goto 2e6
      // 2e2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e5: athrow
      // 2e6: invokestatic net/optifine/shaders/Shaders.beginSky ()V
      // 2e9: aload 9
      // 2eb: fload 2
      // 2ec: iload 1
      // 2ed: invokevirtual crp.j2_ (FI)V
      // 2f0: iload 8
      // 2f2: iload 7
      // 2f4: ifne 331
      // 2f7: ifeq 304
      // 2fa: goto 301
      // 2fd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 300: athrow
      // 301: invokestatic net/optifine/shaders/Shaders.endSky ()V
      // 304: sipush 5889
      // 307: invokestatic hzu.ah8 (I)V
      // 30a: invokestatic hzu.zwy ()V
      // 30d: aload 0
      // 30e: fload 2
      // 30f: bipush 1
      // 310: invokespecial v3i.pcw (FZ)F
      // 313: aload 0
      // 314: getfield v3i.iku Lc05;
      // 317: getfield Minecraft.pfr I
      // 31a: i2f
      // 31b: aload 0
      // 31c: getfield v3i.iku Lc05;
      // 31f: getfield Minecraft.ry7 I
      // 322: i2f
      // 323: fdiv
      // 324: ldc 0.05
      // 326: nop
      // 327: aload 0
      // 328: getfield v3i.ols F
      // 32b: invokestatic org/lwjgl/util/glu/Project.gluPerspective (FFFF)V
      // 32e: sipush 5888
      // 331: invokestatic hzu.ah8 (I)V
      // 334: iload 7
      // 336: ifeq 343
      // 339: invokestatic hzu.ux6 ()V
      // 33c: goto 343
      // 33f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 342: athrow
      // 343: aload 0
      // 344: bipush 0
      // 345: fload 2
      // 346: invokespecial v3i.znd (IF)V
      // 349: sipush 7425
      // 34c: invokestatic hzu.nn9 (I)V
      // 34f: aload 14
      // 351: getfield EntityLivingBase.kfp D
      // 354: aload 14
      // 356: invokevirtual EntityLivingBase.c5y ()F
      // 359: f2d
      // 35a: dadd
      // 35b: ldc2_w 128.0
      // 35e: aload 0
      // 35f: getfield v3i.iku Lc05;
      // 362: getfield Minecraft.oxn Lmoh;
      // 365: getfield moh.dg1 F
      // 368: ldc 128.0
      // 36a: nop
      // 36b: fmul
      // 36c: f2d
      // 36d: dadd
      // 36e: dcmpg
      // 36f: iload 7
      // 371: ifne 3f6
      // 374: ifge 38d
      // 377: goto 37e
      // 37a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37d: athrow
      // 37e: aload 0
      // 37f: aload 9
      // 381: fload 2
      // 382: iload 1
      // 383: invokespecial v3i.x46 (Lcrp;FI)V
      // 386: goto 38d
      // 389: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38c: athrow
      // 38d: aload 0
      // 38e: getfield v3i.iku Lc05;
      // 391: getfield Minecraft.ba0 Luan;
      // 394: sipush 2251
      // 397: ldc2_w 5875687233950307400
      // 39a: lload 5
      // 39c: lxor
      // 39d: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: nop
      // 3a3: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 3a6: aload 0
      // 3a7: bipush 0
      // 3a8: fload 2
      // 3a9: invokespecial v3i.znd (IF)V
      // 3ac: aload 0
      // 3ad: getfield v3i.iku Lc05;
      // 3b0: invokevirtual Minecraft.l22 ()Llc5;
      // 3b3: getstatic yu2.nu_ Lgdz;
      // 3b6: invokevirtual lc5.anl (Lgdz;)V
      // 3b9: invokestatic qpm.cng ()V
      // 3bc: aload 0
      // 3bd: getfield v3i.iku Lc05;
      // 3c0: getfield Minecraft.ba0 Luan;
      // 3c3: sipush 11382
      // 3c6: ldc2_w 6279903912632873094
      // 3c9: lload 5
      // 3cb: lxor
      // 3cc: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d1: nop
      // 3d2: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 3d5: aload 0
      // 3d6: aload 14
      // 3d8: fload 2
      // 3d9: aload 13
      // 3db: aload 0
      // 3dc: getfield v3i.iku Lc05;
      // 3df: getfield Minecraft.vg8 Ll86;
      // 3e2: invokevirtual EntityPlayerSP.myu ()Z
      // 3e5: invokespecial v3i.q30 (Li2h;FL_aq;Z)V
      // 3e8: iload 7
      // 3ea: ifne 420
      // 3ed: iload 8
      // 3ef: goto 3f6
      // 3f2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f5: athrow
      // 3f6: ifeq 425
      // 3f9: aload 9
      // 3fb: aload 14
      // 3fd: fload 2
      // 3fe: f2d
      // 3ff: aload 13
      // 401: aload 0
      // 402: dup
      // 403: getfield v3i.bvo I
      // 406: dup_x1
      // 407: bipush 1
      // 408: iadd
      // 409: putfield v3i.bvo I
      // 40c: aload 0
      // 40d: getfield v3i.iku Lc05;
      // 410: getfield Minecraft.vg8 Ll86;
      // 413: invokevirtual EntityPlayerSP.myu ()Z
      // 416: invokestatic net/optifine/shaders/ShadersRender.setupTerrain (Lcrp;Li2h;DL_aq;IZ)V
      // 419: goto 420
      // 41c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41f: athrow
      // 420: iload 7
      // 422: ifeq 44c
      // 425: aload 9
      // 427: aload 14
      // 429: fload 2
      // 42a: f2d
      // 42b: aload 13
      // 42d: aload 0
      // 42e: dup
      // 42f: getfield v3i.bvo I
      // 432: dup_x1
      // 433: bipush 1
      // 434: iadd
      // 435: putfield v3i.bvo I
      // 438: aload 0
      // 439: getfield v3i.iku Lc05;
      // 43c: getfield Minecraft.vg8 Ll86;
      // 43f: invokevirtual EntityPlayerSP.myu ()Z
      // 442: invokevirtual crp.dvx (Li2h;DL_aq;IZ)V
      // 445: goto 44c
      // 448: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44b: athrow
      // 44c: iload 1
      // 44d: iload 7
      // 44f: ifne 45d
      // 452: ifeq 46d
      // 455: goto 45c
      // 458: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45b: athrow
      // 45c: iload 1
      // 45d: iload 7
      // 45f: ifne 4cd
      // 462: bipush 2
      // 463: if_icmpne 4a4
      // 466: goto 46d
      // 469: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46c: athrow
      // 46d: aload 0
      // 46e: getfield v3i.iku Lc05;
      // 471: getfield Minecraft.ba0 Luan;
      // 474: sipush 10979
      // 477: ldc2_w 5965407360517764612
      // 47a: lload 5
      // 47c: lxor
      // 47d: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 482: nop
      // 483: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 486: getstatic net/optifine/Lagometer.timerChunkUpload Lnet/optifine/Lagometer$TimerNano;
      // 489: invokevirtual net/optifine/Lagometer$TimerNano.start ()V
      // 48c: aload 0
      // 48d: getfield v3i.iku Lc05;
      // 490: getfield Minecraft.vsl Lcrp;
      // 493: lload 3
      // 494: invokevirtual crp.rrc (J)V
      // 497: getstatic net/optifine/Lagometer.timerChunkUpload Lnet/optifine/Lagometer$TimerNano;
      // 49a: invokevirtual net/optifine/Lagometer$TimerNano.end ()V
      // 49d: goto 4a4
      // 4a0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a3: athrow
      // 4a4: aload 0
      // 4a5: getfield v3i.iku Lc05;
      // 4a8: getfield Minecraft.ba0 Luan;
      // 4ab: sipush 26459
      // 4ae: ldc2_w 1785908641314880434
      // 4b1: lload 5
      // 4b3: lxor
      // 4b4: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b9: nop
      // 4ba: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 4bd: getstatic net/optifine/Lagometer.timerTerrain Lnet/optifine/Lagometer$TimerNano;
      // 4c0: invokevirtual net/optifine/Lagometer$TimerNano.start ()V
      // 4c3: aload 0
      // 4c4: getfield v3i.iku Lc05;
      // 4c7: getfield Minecraft.oxn Lmoh;
      // 4ca: getfield moh.qqi Z
      // 4cd: iload 7
      // 4cf: ifne 53d
      // 4d2: ifeq 52f
      // 4d5: goto 4dc
      // 4d8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4db: athrow
      // 4dc: iload 1
      // 4dd: iload 7
      // 4df: ifne 53d
      // 4e2: goto 4e9
      // 4e5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e8: athrow
      // 4e9: ifle 52f
      // 4ec: goto 4f3
      // 4ef: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f2: athrow
      // 4f3: aload 0
      // 4f4: getfield v3i.iku Lc05;
      // 4f7: getfield Minecraft.ba0 Luan;
      // 4fa: sipush 19387
      // 4fd: ldc2_w 6334750532416476985
      // 500: lload 5
      // 502: lxor
      // 503: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 508: nop
      // 509: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 50c: invokestatic org/lwjgl/opengl/GL11.glFinish ()V
      // 50f: aload 0
      // 510: getfield v3i.iku Lc05;
      // 513: getfield Minecraft.ba0 Luan;
      // 516: sipush 2638
      // 519: ldc2_w 1832660198791698146
      // 51c: lload 5
      // 51e: lxor
      // 51f: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 524: nop
      // 525: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 528: goto 52f
      // 52b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52e: athrow
      // 52f: sipush 5888
      // 532: invokestatic hzu.ah8 (I)V
      // 535: invokestatic hzu.dp2 ()V
      // 538: invokestatic hzu.vtj ()V
      // 53b: iload 8
      // 53d: iload 7
      // 53f: ifne 562
      // 542: ifeq 54f
      // 545: goto 54c
      // 548: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54b: athrow
      // 54c: invokestatic net/optifine/shaders/ShadersRender.beginTerrainSolid ()V
      // 54f: aload 9
      // 551: getstatic w51.exw Lw51;
      // 554: fload 2
      // 555: f2d
      // 556: iload 1
      // 557: aload 14
      // 559: invokevirtual crp.g_w (Lw51;DILi2h;)I
      // 55c: pop
      // 55d: invokestatic hzu.if9 ()V
      // 560: iload 8
      // 562: ifeq 568
      // 565: invokestatic net/optifine/shaders/ShadersRender.beginTerrainCutoutMipped ()V
      // 568: aload 0
      // 569: getfield v3i.iku Lc05;
      // 56c: invokevirtual Minecraft.l22 ()Llc5;
      // 56f: getstatic yu2.nu_ Lgdz;
      // 572: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 575: bipush 0
      // 576: aload 0
      // 577: getfield v3i.iku Lc05;
      // 57a: getfield Minecraft.oxn Lmoh;
      // 57d: getfield moh.fkx I
      // 580: iload 7
      // 582: ifne 590
      // 585: ifle 593
      // 588: goto 58f
      // 58b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58e: athrow
      // 58f: bipush 1
      // 590: goto 594
      // 593: bipush 0
      // 594: invokeinterface sm5.setBlurMipmap (ZZ)V 3
      // 599: aload 9
      // 59b: getstatic w51.oja Lw51;
      // 59e: fload 2
      // 59f: f2d
      // 5a0: iload 1
      // 5a1: aload 14
      // 5a3: invokevirtual crp.g_w (Lw51;DILi2h;)I
      // 5a6: pop
      // 5a7: aload 0
      // 5a8: getfield v3i.iku Lc05;
      // 5ab: invokevirtual Minecraft.l22 ()Llc5;
      // 5ae: getstatic yu2.nu_ Lgdz;
      // 5b1: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 5b4: invokeinterface sm5.restoreLastBlurMipmap ()V 1
      // 5b9: aload 0
      // 5ba: getfield v3i.iku Lc05;
      // 5bd: invokevirtual Minecraft.l22 ()Llc5;
      // 5c0: getstatic yu2.nu_ Lgdz;
      // 5c3: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 5c6: bipush 0
      // 5c7: bipush 0
      // 5c8: invokeinterface sm5.setBlurMipmap (ZZ)V 3
      // 5cd: iload 8
      // 5cf: iload 7
      // 5d1: ifne 603
      // 5d4: ifeq 5e1
      // 5d7: goto 5de
      // 5da: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5dd: athrow
      // 5de: invokestatic net/optifine/shaders/ShadersRender.beginTerrainCutout ()V
      // 5e1: aload 9
      // 5e3: getstatic w51.gx9 Lw51;
      // 5e6: fload 2
      // 5e7: f2d
      // 5e8: iload 1
      // 5e9: aload 14
      // 5eb: invokevirtual crp.g_w (Lw51;DILi2h;)I
      // 5ee: pop
      // 5ef: aload 0
      // 5f0: getfield v3i.iku Lc05;
      // 5f3: invokevirtual Minecraft.l22 ()Llc5;
      // 5f6: getstatic yu2.nu_ Lgdz;
      // 5f9: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 5fc: invokeinterface sm5.restoreLastBlurMipmap ()V 1
      // 601: iload 8
      // 603: iload 7
      // 605: ifne 62e
      // 608: ifeq 615
      // 60b: goto 612
      // 60e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 611: athrow
      // 612: invokestatic net/optifine/shaders/ShadersRender.endTerrain ()V
      // 615: getstatic net/optifine/Lagometer.timerTerrain Lnet/optifine/Lagometer$TimerNano;
      // 618: invokevirtual net/optifine/Lagometer$TimerNano.end ()V
      // 61b: sipush 7424
      // 61e: invokestatic hzu.nn9 (I)V
      // 621: sipush 516
      // 624: ldc 0.1
      // 626: nop
      // 627: invokestatic hzu.fak (IF)V
      // 62a: aload 0
      // 62b: getfield v3i.mrg Z
      // 62e: iload 7
      // 630: ifne 770
      // 633: ifne 765
      // 636: goto 63d
      // 639: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63c: athrow
      // 63d: sipush 5888
      // 640: invokestatic hzu.ah8 (I)V
      // 643: invokestatic hzu.x3w ()V
      // 646: invokestatic hzu.dp2 ()V
      // 649: invokestatic qpm.ne_ ()V
      // 64c: aload 0
      // 64d: getfield v3i.iku Lc05;
      // 650: getfield Minecraft.ba0 Luan;
      // 653: sipush 7432
      // 656: ldc2_w 6638494225650762135
      // 659: lload 5
      // 65b: lxor
      // 65c: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 661: nop
      // 662: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 665: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // 668: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 66b: iload 7
      // 66d: ifne 6a9
      // 670: goto 677
      // 673: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 676: athrow
      // 677: ifeq 699
      // 67a: goto 681
      // 67d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 680: athrow
      // 681: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // 684: bipush 1
      // 685: anewarray 84
      // 688: dup
      // 689: bipush 0
      // 68a: bipush 0
      // 68b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 68e: aastore
      // 68f: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 692: goto 699
      // 695: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 698: athrow
      // 699: aload 9
      // 69b: aload 14
      // 69d: aload 13
      // 69f: fload 2
      // 6a0: invokevirtual crp._q6 (Li2h;L_aq;F)V
      // 6a3: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // 6a6: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 6a9: iload 7
      // 6ab: ifne 6da
      // 6ae: ifeq 6d0
      // 6b1: goto 6b8
      // 6b4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b7: athrow
      // 6b8: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // 6bb: bipush 1
      // 6bc: anewarray 84
      // 6bf: dup
      // 6c0: bipush 0
      // 6c1: bipush -1
      // 6c2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6c5: aastore
      // 6c6: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 6c9: goto 6d0
      // 6cc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6cf: athrow
      // 6d0: invokestatic qpm.cng ()V
      // 6d3: aload 0
      // 6d4: invokevirtual v3i.yvz ()V
      // 6d7: sipush 5888
      // 6da: invokestatic hzu.ah8 (I)V
      // 6dd: invokestatic hzu.x3w ()V
      // 6e0: invokestatic hzu.dp2 ()V
      // 6e3: iload 7
      // 6e5: ifne 76e
      // 6e8: aload 0
      // 6e9: getfield v3i.iku Lc05;
      // 6ec: getfield Minecraft.dzk Lakm;
      // 6ef: ifnull 765
      // 6f2: goto 6f9
      // 6f5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f8: athrow
      // 6f9: aload 14
      // 6fb: getstatic p3y.six Lp3y;
      // 6fe: invokevirtual EntityLivingBase.v0c (Lp3y;)Z
      // 701: iload 7
      // 703: ifne 770
      // 706: goto 70d
      // 709: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70c: athrow
      // 70d: ifeq 765
      // 710: goto 717
      // 713: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 716: athrow
      // 717: iload 11
      // 719: iload 7
      // 71b: ifne 770
      // 71e: goto 725
      // 721: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 724: athrow
      // 725: ifeq 765
      // 728: goto 72f
      // 72b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72e: athrow
      // 72f: aload 14
      // 731: checkcast ha9
      // 734: astore 21
      // 736: invokestatic hzu.vtj ()V
      // 739: aload 0
      // 73a: getfield v3i.iku Lc05;
      // 73d: getfield Minecraft.ba0 Luan;
      // 740: sipush 24061
      // 743: ldc2_w 8179553038585987347
      // 746: lload 5
      // 748: lxor
      // 749: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74e: nop
      // 74f: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 752: aload 9
      // 754: aload 21
      // 756: aload 0
      // 757: getfield v3i.iku Lc05;
      // 75a: getfield Minecraft.dzk Lakm;
      // 75d: bipush 0
      // 75e: fload 2
      // 75f: invokevirtual crp.rq6 (Lha9;Lakm;IF)V
      // 762: invokestatic hzu.if9 ()V
      // 765: sipush 5888
      // 768: invokestatic hzu.ah8 (I)V
      // 76b: invokestatic hzu.x3w ()V
      // 76e: iload 11
      // 770: iload 7
      // 772: ifne 869
      // 775: ifeq 85f
      // 778: goto 77f
      // 77b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77e: athrow
      // 77f: aload 0
      // 780: getfield v3i.iku Lc05;
      // 783: getfield Minecraft.dzk Lakm;
      // 786: ifnull 85f
      // 789: goto 790
      // 78c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78f: athrow
      // 790: aload 14
      // 792: getstatic p3y.six Lp3y;
      // 795: invokevirtual EntityLivingBase.v0c (Lp3y;)Z
      // 798: iload 7
      // 79a: ifne 869
      // 79d: goto 7a4
      // 7a0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a3: athrow
      // 7a4: ifne 85f
      // 7a7: goto 7ae
      // 7aa: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7ad: athrow
      // 7ae: aload 14
      // 7b0: checkcast ha9
      // 7b3: astore 21
      // 7b5: invokestatic hzu.vtj ()V
      // 7b8: aload 0
      // 7b9: getfield v3i.iku Lc05;
      // 7bc: getfield Minecraft.ba0 Luan;
      // 7bf: sipush 19578
      // 7c2: ldc2_w 7358085113203822745
      // 7c5: lload 5
      // 7c7: lxor
      // 7c8: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cd: nop
      // 7ce: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 7d1: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_onDrawBlockHighlight Lnet/optifine/reflect/ReflectorMethod;
      // 7d4: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 7d7: iload 7
      // 7d9: ifne 842
      // 7dc: ifeq 831
      // 7df: goto 7e6
      // 7e2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e5: athrow
      // 7e6: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_onDrawBlockHighlight Lnet/optifine/reflect/ReflectorMethod;
      // 7e9: bipush 6
      // 7eb: anewarray 84
      // 7ee: dup
      // 7ef: bipush 0
      // 7f0: aload 9
      // 7f2: aastore
      // 7f3: dup
      // 7f4: bipush 1
      // 7f5: aload 21
      // 7f7: aastore
      // 7f8: dup
      // 7f9: bipush 2
      // 7fa: aload 0
      // 7fb: getfield v3i.iku Lc05;
      // 7fe: getfield Minecraft.dzk Lakm;
      // 801: aastore
      // 802: dup
      // 803: bipush 3
      // 804: bipush 0
      // 805: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 808: aastore
      // 809: dup
      // 80a: bipush 4
      // 80b: aload 21
      // 80d: invokevirtual ha9.tsc ()Lerg;
      // 810: aastore
      // 811: dup
      // 812: bipush 5
      // 813: fload 2
      // 814: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 817: aastore
      // 818: invokestatic net/optifine/reflect/Reflector.callBoolean (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Z
      // 81b: iload 7
      // 81d: ifne 842
      // 820: goto 827
      // 823: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 826: athrow
      // 827: ifne 85c
      // 82a: goto 831
      // 82d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 830: athrow
      // 831: aload 0
      // 832: getfield v3i.iku Lc05;
      // 835: getfield Minecraft.oxn Lmoh;
      // 838: getfield moh.x8y Z
      // 83b: goto 842
      // 83e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 841: athrow
      // 842: ifne 85c
      // 845: aload 9
      // 847: aload 21
      // 849: aload 0
      // 84a: getfield v3i.iku Lc05;
      // 84d: getfield Minecraft.dzk Lakm;
      // 850: bipush 0
      // 851: fload 2
      // 852: invokevirtual crp.rq6 (Lha9;Lakm;IF)V
      // 855: goto 85c
      // 858: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85b: athrow
      // 85c: invokestatic hzu.if9 ()V
      // 85f: aload 9
      // 861: getfield crp.sz2 Ljava/util/Map;
      // 864: invokeinterface java/util/Map.isEmpty ()Z 1
      // 869: iload 7
      // 86b: ifne 8f0
      // 86e: ifne 8de
      // 871: goto 878
      // 874: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 877: athrow
      // 878: aload 0
      // 879: getfield v3i.iku Lc05;
      // 87c: getfield Minecraft.ba0 Luan;
      // 87f: sipush 20389
      // 882: ldc2_w 8740813017911497503
      // 885: lload 5
      // 887: lxor
      // 888: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88d: nop
      // 88e: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 891: invokestatic hzu.spd ()V
      // 894: sipush 770
      // 897: bipush 1
      // 898: bipush 1
      // 899: bipush 0
      // 89a: invokestatic hzu.u39 (IIII)V
      // 89d: aload 0
      // 89e: getfield v3i.iku Lc05;
      // 8a1: invokevirtual Minecraft.l22 ()Llc5;
      // 8a4: getstatic yu2.nu_ Lgdz;
      // 8a7: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 8aa: bipush 0
      // 8ab: bipush 0
      // 8ac: invokeinterface sm5.setBlurMipmap (ZZ)V 3
      // 8b1: aload 9
      // 8b3: invokestatic jom.yut ()Ljom;
      // 8b6: invokestatic jom.yut ()Ljom;
      // 8b9: invokevirtual jom.zuq ()Lq3g;
      // 8bc: aload 14
      // 8be: fload 2
      // 8bf: invokevirtual crp.aai (Ljom;Lq3g;Li2h;F)V
      // 8c2: aload 0
      // 8c3: getfield v3i.iku Lc05;
      // 8c6: invokevirtual Minecraft.l22 ()Llc5;
      // 8c9: getstatic yu2.nu_ Lgdz;
      // 8cc: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 8cf: invokeinterface sm5.restoreLastBlurMipmap ()V 1
      // 8d4: invokestatic hzu.ux6 ()V
      // 8d7: goto 8de
      // 8da: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8dd: athrow
      // 8de: sipush 770
      // 8e1: sipush 771
      // 8e4: bipush 1
      // 8e5: bipush 0
      // 8e6: invokestatic hzu.u39 (IIII)V
      // 8e9: invokestatic hzu.ux6 ()V
      // 8ec: aload 0
      // 8ed: getfield v3i.mrg Z
      // 8f0: iload 7
      // 8f2: ifne 990
      // 8f5: ifne 989
      // 8f8: goto 8ff
      // 8fb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8fe: athrow
      // 8ff: aload 0
      // 900: invokevirtual v3i.u_c ()V
      // 903: aload 0
      // 904: getfield v3i.iku Lc05;
      // 907: getfield Minecraft.ba0 Luan;
      // 90a: sipush 13952
      // 90d: ldc2_w 2655262230387911272
      // 910: lload 5
      // 912: lxor
      // 913: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 918: nop
      // 919: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 91c: iload 8
      // 91e: iload 7
      // 920: ifne 963
      // 923: goto 92a
      // 926: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 929: athrow
      // 92a: ifeq 937
      // 92d: goto 934
      // 930: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 933: athrow
      // 934: invokestatic net/optifine/shaders/Shaders.beginLitParticles ()V
      // 937: aload 10
      // 939: aload 14
      // 93b: fload 2
      // 93c: invokevirtual jux.wx_ (Li2h;F)V
      // 93f: invokestatic qpm.cng ()V
      // 942: aload 0
      // 943: bipush 0
      // 944: fload 2
      // 945: invokespecial v3i.znd (IF)V
      // 948: aload 0
      // 949: getfield v3i.iku Lc05;
      // 94c: getfield Minecraft.ba0 Luan;
      // 94f: sipush 31651
      // 952: ldc2_w 7235853852145887031
      // 955: lload 5
      // 957: lxor
      // 958: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95d: nop
      // 95e: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 961: iload 8
      // 963: iload 7
      // 965: ifne 97f
      // 968: ifeq 975
      // 96b: goto 972
      // 96e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 971: athrow
      // 972: invokestatic net/optifine/shaders/Shaders.beginParticles ()V
      // 975: aload 10
      // 977: aload 14
      // 979: fload 2
      // 97a: invokevirtual jux.t45 (Li2h;F)V
      // 97d: iload 8
      // 97f: ifeq 985
      // 982: invokestatic net/optifine/shaders/Shaders.endParticles ()V
      // 985: aload 0
      // 986: invokevirtual v3i.yvz ()V
      // 989: bipush 0
      // 98a: invokestatic hzu.jun (Z)V
      // 98d: invokestatic hxt.ly3 ()Z
      // 990: iload 7
      // 992: ifne 9ca
      // 995: ifeq 9ac
      // 998: goto 99f
      // 99b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99e: athrow
      // 99f: invokestatic net/optifine/shaders/Shaders.isRainDepth ()Z
      // 9a2: invokestatic hzu.jun (Z)V
      // 9a5: goto 9ac
      // 9a8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9ab: athrow
      // 9ac: invokestatic hzu.gp4 ()V
      // 9af: aload 0
      // 9b0: getfield v3i.iku Lc05;
      // 9b3: getfield Minecraft.ba0 Luan;
      // 9b6: sipush 27098
      // 9b9: ldc2_w 6591469752281773427
      // 9bc: lload 5
      // 9be: lxor
      // 9bf: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c4: nop
      // 9c5: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 9c8: iload 8
      // 9ca: iload 7
      // 9cc: ifne 9e3
      // 9cf: ifeq 9dc
      // 9d2: goto 9d9
      // 9d5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9d8: athrow
      // 9d9: invokestatic net/optifine/shaders/Shaders.beginWeather ()V
      // 9dc: aload 0
      // 9dd: fload 2
      // 9de: invokevirtual v3i.ehe (F)V
      // 9e1: iload 8
      // 9e3: iload 7
      // 9e5: ifne a03
      // 9e8: ifeq 9f5
      // 9eb: goto 9f2
      // 9ee: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f1: athrow
      // 9f2: invokestatic net/optifine/shaders/Shaders.endWeather ()V
      // 9f5: bipush 1
      // 9f6: invokestatic hzu.jun (Z)V
      // 9f9: aload 9
      // 9fb: aload 14
      // 9fd: fload 2
      // 9fe: invokevirtual crp.byj (Li2h;F)V
      // a01: iload 8
      // a03: iload 7
      // a05: ifne a77
      // a08: ifeq a22
      // a0b: goto a12
      // a0e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a11: athrow
      // a12: aload 0
      // a13: fload 2
      // a14: iload 1
      // a15: invokestatic net/optifine/shaders/ShadersRender.renderHand0 (Lv3i;FI)V
      // a18: invokestatic net/optifine/shaders/Shaders.preWater ()V
      // a1b: goto a22
      // a1e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a21: athrow
      // a22: invokestatic hzu.ux6 ()V
      // a25: invokestatic hzu.gp4 ()V
      // a28: sipush 770
      // a2b: sipush 771
      // a2e: bipush 1
      // a2f: bipush 0
      // a30: invokestatic hzu.u39 (IIII)V
      // a33: sipush 516
      // a36: ldc 0.1
      // a38: nop
      // a39: invokestatic hzu.fak (IF)V
      // a3c: aload 0
      // a3d: bipush 0
      // a3e: fload 2
      // a3f: invokespecial v3i.znd (IF)V
      // a42: invokestatic hzu.spd ()V
      // a45: bipush 0
      // a46: invokestatic hzu.jun (Z)V
      // a49: aload 0
      // a4a: getfield v3i.iku Lc05;
      // a4d: invokevirtual Minecraft.l22 ()Llc5;
      // a50: getstatic yu2.nu_ Lgdz;
      // a53: invokevirtual lc5.anl (Lgdz;)V
      // a56: sipush 7425
      // a59: invokestatic hzu.nn9 (I)V
      // a5c: aload 0
      // a5d: getfield v3i.iku Lc05;
      // a60: getfield Minecraft.ba0 Luan;
      // a63: sipush 22630
      // a66: ldc2_w 5582509119363908746
      // a69: lload 5
      // a6b: lxor
      // a6c: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a71: nop
      // a72: invokevirtual uan.v2l (Ljava/lang/String;)V
      // a75: iload 8
      // a77: iload 7
      // a79: ifne a99
      // a7c: ifeq a89
      // a7f: goto a86
      // a82: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a85: athrow
      // a86: invokestatic net/optifine/shaders/Shaders.beginWater ()V
      // a89: aload 9
      // a8b: getstatic w51.mem Lw51;
      // a8e: fload 2
      // a8f: f2d
      // a90: iload 1
      // a91: aload 14
      // a93: invokevirtual crp.g_w (Lw51;DILi2h;)I
      // a96: pop
      // a97: iload 8
      // a99: iload 7
      // a9b: ifne ab1
      // a9e: ifeq aab
      // aa1: goto aa8
      // aa4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // aa7: athrow
      // aa8: invokestatic net/optifine/shaders/Shaders.endWater ()V
      // aab: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // aae: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // ab1: iload 7
      // ab3: ifne b6f
      // ab6: ifeq b3c
      // ab9: goto ac0
      // abc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // abf: athrow
      // ac0: aload 0
      // ac1: getfield v3i.mrg Z
      // ac4: iload 7
      // ac6: ifne b6f
      // ac9: goto ad0
      // acc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // acf: athrow
      // ad0: ifne b3c
      // ad3: goto ada
      // ad6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ad9: athrow
      // ada: invokestatic qpm.ne_ ()V
      // add: aload 0
      // ade: getfield v3i.iku Lc05;
      // ae1: getfield Minecraft.ba0 Luan;
      // ae4: sipush 17692
      // ae7: ldc2_w 7254343029507037593
      // aea: lload 5
      // aec: lxor
      // aed: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af2: nop
      // af3: invokevirtual uan.v2l (Ljava/lang/String;)V
      // af6: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // af9: bipush 1
      // afa: anewarray 84
      // afd: dup
      // afe: bipush 0
      // aff: bipush 1
      // b00: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b03: aastore
      // b04: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // b07: aload 0
      // b08: getfield v3i.iku Lc05;
      // b0b: getfield Minecraft.vsl Lcrp;
      // b0e: aload 14
      // b10: aload 13
      // b12: fload 2
      // b13: invokevirtual crp._q6 (Li2h;L_aq;F)V
      // b16: sipush 770
      // b19: sipush 771
      // b1c: bipush 1
      // b1d: bipush 0
      // b1e: invokestatic hzu.u39 (IIII)V
      // b21: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_setRenderPass Lnet/optifine/reflect/ReflectorMethod;
      // b24: bipush 1
      // b25: anewarray 84
      // b28: dup
      // b29: bipush 0
      // b2a: bipush -1
      // b2b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b2e: aastore
      // b2f: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // b32: invokestatic qpm.cng ()V
      // b35: goto b3c
      // b38: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3b: athrow
      // b3c: sipush 7424
      // b3f: invokestatic hzu.nn9 (I)V
      // b42: bipush 1
      // b43: invokestatic hzu.jun (Z)V
      // b46: invokestatic hzu.gp4 ()V
      // b49: invokestatic hzu.ux6 ()V
      // b4c: invokestatic hzu.gcp ()V
      // b4f: aload 14
      // b51: getfield EntityLivingBase.kfp D
      // b54: aload 14
      // b56: invokevirtual EntityLivingBase.c5y ()F
      // b59: f2d
      // b5a: dadd
      // b5b: ldc2_w 128.0
      // b5e: aload 0
      // b5f: getfield v3i.iku Lc05;
      // b62: getfield Minecraft.oxn Lmoh;
      // b65: getfield moh.dg1 F
      // b68: ldc 128.0
      // b6a: nop
      // b6b: fmul
      // b6c: f2d
      // b6d: dadd
      // b6e: dcmpl
      // b6f: iload 7
      // b71: ifne bb8
      // b74: iflt ba6
      // b77: goto b7e
      // b7a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b7d: athrow
      // b7e: aload 0
      // b7f: getfield v3i.iku Lc05;
      // b82: getfield Minecraft.ba0 Luan;
      // b85: sipush 12491
      // b88: ldc2_w 4739646229346282615
      // b8b: lload 5
      // b8d: lxor
      // b8e: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b93: nop
      // b94: invokevirtual uan.v2l (Ljava/lang/String;)V
      // b97: aload 0
      // b98: aload 9
      // b9a: fload 2
      // b9b: iload 1
      // b9c: invokespecial v3i.x46 (Lcrp;FI)V
      // b9f: goto ba6
      // ba2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba5: athrow
      // ba6: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_dispatchRenderLast Lnet/optifine/reflect/ReflectorMethod;
      // ba9: iload 7
      // bab: ifne bde
      // bae: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // bb1: goto bb8
      // bb4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bb7: athrow
      // bb8: ifeq bf1
      // bbb: aload 0
      // bbc: getfield v3i.iku Lc05;
      // bbf: getfield Minecraft.ba0 Luan;
      // bc2: sipush 5750
      // bc5: ldc2_w 4649213076556499654
      // bc8: lload 5
      // bca: lxor
      // bcb: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd0: nop
      // bd1: invokevirtual uan.v2l (Ljava/lang/String;)V
      // bd4: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_dispatchRenderLast Lnet/optifine/reflect/ReflectorMethod;
      // bd7: goto bde
      // bda: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bdd: athrow
      // bde: bipush 2
      // bdf: anewarray 84
      // be2: dup
      // be3: bipush 0
      // be4: aload 9
      // be6: aastore
      // be7: dup
      // be8: bipush 1
      // be9: fload 2
      // bea: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // bed: aastore
      // bee: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // bf1: aload 0
      // bf2: getfield v3i.iku Lc05;
      // bf5: getfield Minecraft.ba0 Luan;
      // bf8: sipush 4863
      // bfb: ldc2_w 3703999360523292254
      // bfe: lload 5
      // c00: lxor
      // c01: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c06: nop
      // c07: invokevirtual uan.v2l (Ljava/lang/String;)V
      // c0a: new b5k
      // c0d: dup
      // c0e: fload 2
      // c0f: invokespecial b5k.<init> (F)V
      // c12: astore 21
      // c14: aload 21
      // c16: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // c19: pop
      // c1a: fconst_1
      // c1b: fconst_1
      // c1c: fconst_1
      // c1d: fconst_1
      // c1e: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // c21: aload 0
      // c22: getfield v3i.v5y Z
      // c25: iload 7
      // c27: ifne cb2
      // c2a: ifeq cb0
      // c2d: goto c34
      // c30: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c33: athrow
      // c34: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // c37: iload 7
      // c39: ifne cb2
      // c3c: goto c43
      // c3f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c42: athrow
      // c43: ifne cb0
      // c46: goto c4d
      // c49: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c4c: athrow
      // c4d: iload 8
      // c4f: iload 7
      // c51: ifne c89
      // c54: goto c5b
      // c57: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5a: athrow
      // c5b: ifeq c75
      // c5e: goto c65
      // c61: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c64: athrow
      // c65: aload 0
      // c66: fload 2
      // c67: iload 1
      // c68: invokestatic net/optifine/shaders/ShadersRender.renderHand1 (Lv3i;FI)V
      // c6b: invokestatic net/optifine/shaders/Shaders.renderCompositeFinal ()V
      // c6e: goto c75
      // c71: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c74: athrow
      // c75: sipush 256
      // c78: invokestatic hzu.yg5 (I)V
      // c7b: iload 7
      // c7d: ifne c99
      // c80: iload 8
      // c82: goto c89
      // c85: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c88: athrow
      // c89: ifeq c9e
      // c8c: aload 0
      // c8d: fload 2
      // c8e: iload 1
      // c8f: invokestatic net/optifine/shaders/ShadersRender.renderFPOverlay (Lv3i;FI)V
      // c92: goto c99
      // c95: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c98: athrow
      // c99: iload 7
      // c9b: ifeq cab
      // c9e: aload 0
      // c9f: fload 2
      // ca0: iload 1
      // ca1: invokespecial v3i.sfi (FI)V
      // ca4: goto cab
      // ca7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // caa: athrow
      // cab: aload 0
      // cac: fload 2
      // cad: invokespecial v3i.e9w (F)V
      // cb0: iload 8
      // cb2: ifeq cb8
      // cb5: invokestatic net/optifine/shaders/Shaders.endRender ()V
      // cb8: return
   }

   private void x46(crp param1, float param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v3i.a J
      // 03: ldc2_w 108347850487381
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: getfield v3i.iku Lc05;
      // 12: getfield Minecraft.oxn Lmoh;
      // 15: getfield moh.gcj I
      // 18: iload 6
      // 1a: ifeq 32
      // 1d: bipush 4
      // 1e: if_icmplt fa
      // 21: goto 28
      // 24: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: invokestatic hxt.mdq ()Z
      // 2b: goto 32
      // 2e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: iload 6
      // 34: ifeq 52
      // 37: ifne fa
      // 3a: goto 41
      // 3d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 0
      // 42: getfield v3i.iku Lc05;
      // 45: getfield Minecraft.oxn Lmoh;
      // 48: invokestatic net/optifine/shaders/Shaders.shouldRenderClouds (Lmoh;)Z
      // 4b: goto 52
      // 4e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: iload 6
      // 54: ifeq f7
      // 57: ifeq fa
      // 5a: goto 61
      // 5d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 0
      // 62: getfield v3i.iku Lc05;
      // 65: getfield Minecraft.ba0 Luan;
      // 68: sipush 13314
      // 6b: ldc2_w 753808093565459115
      // 6e: lload 4
      // 70: lxor
      // 71: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: nop
      // 77: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 7a: sipush 5889
      // 7d: invokestatic hzu.ah8 (I)V
      // 80: invokestatic hzu.zwy ()V
      // 83: aload 0
      // 84: fload 2
      // 85: bipush 1
      // 86: invokespecial v3i.pcw (FZ)F
      // 89: aload 0
      // 8a: getfield v3i.iku Lc05;
      // 8d: getfield Minecraft.pfr I
      // 90: i2f
      // 91: aload 0
      // 92: getfield v3i.iku Lc05;
      // 95: getfield Minecraft.ry7 I
      // 98: i2f
      // 99: fdiv
      // 9a: ldc 0.05
      // 9c: nop
      // 9d: aload 0
      // 9e: getfield v3i.ols F
      // a1: ldc 4.0
      // a3: nop
      // a4: fmul
      // a5: invokestatic org/lwjgl/util/glu/Project.gluPerspective (FFFF)V
      // a8: sipush 5888
      // ab: invokestatic hzu.ah8 (I)V
      // ae: invokestatic hzu.dp2 ()V
      // b1: aload 0
      // b2: bipush 0
      // b3: fload 2
      // b4: invokespecial v3i.znd (IF)V
      // b7: aload 1
      // b8: fload 2
      // b9: iload 3
      // ba: invokevirtual crp.pui (FI)V
      // bd: invokestatic hzu.gcp ()V
      // c0: invokestatic hzu.x3w ()V
      // c3: sipush 5889
      // c6: invokestatic hzu.ah8 (I)V
      // c9: invokestatic hzu.zwy ()V
      // cc: aload 0
      // cd: fload 2
      // ce: bipush 1
      // cf: invokespecial v3i.pcw (FZ)F
      // d2: aload 0
      // d3: getfield v3i.iku Lc05;
      // d6: getfield Minecraft.pfr I
      // d9: i2f
      // da: aload 0
      // db: getfield v3i.iku Lc05;
      // de: getfield Minecraft.ry7 I
      // e1: i2f
      // e2: fdiv
      // e3: ldc 0.05
      // e5: nop
      // e6: aload 0
      // e7: getfield v3i.ols F
      // ea: invokestatic org/lwjgl/util/glu/Project.gluPerspective (FFFF)V
      // ed: sipush 5888
      // f0: goto f7
      // f3: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f6: athrow
      // f7: invokestatic hzu.ah8 (I)V
      // fa: return
   }

   private void oyq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 121644026185658
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield v3i.iku Lc05;
      // 010: getfield Minecraft.tij Lkh3;
      // 013: fconst_1
      // 014: invokevirtual WorldClient.bne (F)F
      // 017: fstore 4
      // 019: invokestatic hxt.b7f ()Z
      // 01c: iload 3
      // 01d: ifne 034
      // 020: ifne 030
      // 023: goto 02a
      // 026: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: fload 4
      // 02c: fconst_2
      // 02d: fdiv
      // 02e: fstore 4
      // 030: fload 4
      // 032: fconst_0
      // 033: fcmpl
      // 034: iload 3
      // 035: ifne 045
      // 038: ifeq 399
      // 03b: goto 042
      // 03e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: invokestatic hxt.m9d ()Z
      // 045: ifeq 399
      // 048: aload 0
      // 049: getfield v3i.iol Ljava/util/Random;
      // 04c: aload 0
      // 04d: getfield v3i.g6g I
      // 050: i2l
      // 051: ldc2_w 312987231
      // 054: lmul
      // 055: invokevirtual java/util/Random.setSeed (J)V
      // 058: aload 0
      // 059: getfield v3i.iku Lc05;
      // 05c: invokevirtual Minecraft.nsd ()Li2h;
      // 05f: astore 5
      // 061: aload 0
      // 062: getfield v3i.iku Lc05;
      // 065: getfield Minecraft.tij Lkh3;
      // 068: astore 6
      // 06a: new mew
      // 06d: dup
      // 06e: aload 5
      // 070: invokespecial mew.<init> (Li2h;)V
      // 073: astore 7
      // 075: bipush 10
      // 077: istore 8
      // 079: dconst_0
      // 07a: dstore 9
      // 07c: dconst_0
      // 07d: dstore 11
      // 07f: dconst_0
      // 080: dstore 13
      // 082: bipush 0
      // 083: istore 15
      // 085: ldc 100.0
      // 087: nop
      // 088: fload 4
      // 08a: fmul
      // 08b: fload 4
      // 08d: fmul
      // 08e: f2i
      // 08f: istore 16
      // 091: aload 0
      // 092: getfield v3i.iku Lc05;
      // 095: getfield Minecraft.oxn Lmoh;
      // 098: getfield moh.ysd I
      // 09b: bipush 1
      // 09c: iload 3
      // 09d: ifne 0d1
      // 0a0: if_icmpne 0b4
      // 0a3: goto 0aa
      // 0a6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: iload 16
      // 0ac: bipush 1
      // 0ad: ishr
      // 0ae: istore 16
      // 0b0: iload 3
      // 0b1: ifeq 0d7
      // 0b4: aload 0
      // 0b5: getfield v3i.iku Lc05;
      // 0b8: getfield Minecraft.oxn Lmoh;
      // 0bb: getfield moh.ysd I
      // 0be: iload 3
      // 0bf: ifne 0d8
      // 0c2: goto 0c9
      // 0c5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: bipush 2
      // 0ca: goto 0d1
      // 0cd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: if_icmpne 0d7
      // 0d4: bipush 0
      // 0d5: istore 16
      // 0d7: bipush 0
      // 0d8: istore 17
      // 0da: iload 17
      // 0dc: iload 16
      // 0de: if_icmpge 2ba
      // 0e1: aload 6
      // 0e3: aload 7
      // 0e5: aload 0
      // 0e6: getfield v3i.iol Ljava/util/Random;
      // 0e9: iload 8
      // 0eb: invokevirtual java/util/Random.nextInt (I)I
      // 0ee: aload 0
      // 0ef: getfield v3i.iol Ljava/util/Random;
      // 0f2: iload 8
      // 0f4: invokevirtual java/util/Random.nextInt (I)I
      // 0f7: isub
      // 0f8: bipush 0
      // 0f9: aload 0
      // 0fa: getfield v3i.iol Ljava/util/Random;
      // 0fd: iload 8
      // 0ff: invokevirtual java/util/Random.nextInt (I)I
      // 102: aload 0
      // 103: getfield v3i.iol Ljava/util/Random;
      // 106: iload 8
      // 108: invokevirtual java/util/Random.nextInt (I)I
      // 10b: isub
      // 10c: invokevirtual mew.ec4 (III)Lmew;
      // 10f: invokevirtual OpaquePredicate.k62 (Lmew;)Lmew;
      // 112: astore 18
      // 114: aload 6
      // 116: aload 18
      // 118: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 11b: astore 19
      // 11d: aload 18
      // 11f: invokevirtual mew.eve ()Lmew;
      // 122: astore 20
      // 124: aload 6
      // 126: aload 20
      // 128: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 12b: invokeinterface zfz.r_y ()Le0x; 1
      // 130: astore 21
      // 132: iload 3
      // 133: ifne 2b6
      // 136: aload 18
      // 138: invokevirtual mew.getY ()I
      // 13b: aload 7
      // 13d: invokevirtual mew.getY ()I
      // 140: iload 8
      // 142: iadd
      // 143: iload 3
      // 144: ifne 2ef
      // 147: goto 14e
      // 14a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: if_icmpgt 2b3
      // 151: goto 158
      // 154: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 18
      // 15a: invokevirtual mew.getY ()I
      // 15d: iload 3
      // 15e: ifne 186
      // 161: goto 168
      // 164: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: aload 7
      // 16a: invokevirtual mew.getY ()I
      // 16d: iload 8
      // 16f: isub
      // 170: if_icmplt 2b3
      // 173: goto 17a
      // 176: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: aload 19
      // 17c: invokevirtual gyu.ziq ()Z
      // 17f: goto 186
      // 182: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: iload 3
      // 187: ifne 1a6
      // 18a: ifeq 2b3
      // 18d: goto 194
      // 190: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: aload 19
      // 196: aload 18
      // 198: invokevirtual gyu.qa6 (Lmew;)F
      // 19b: ldc 0.15
      // 19d: nop
      // 19e: fcmpl
      // 19f: goto 1a6
      // 1a2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a5: athrow
      // 1a6: iflt 2b3
      // 1a9: aload 0
      // 1aa: getfield v3i.iol Ljava/util/Random;
      // 1ad: invokevirtual java/util/Random.nextDouble ()D
      // 1b0: dstore 22
      // 1b2: aload 0
      // 1b3: getfield v3i.iol Ljava/util/Random;
      // 1b6: invokevirtual java/util/Random.nextDouble ()D
      // 1b9: dstore 24
      // 1bb: aload 21
      // 1bd: invokevirtual e0x.p1r ()Lp3y;
      // 1c0: getstatic p3y.e1s Lp3y;
      // 1c3: iload 3
      // 1c4: ifne 22c
      // 1c7: if_acmpne 212
      // 1ca: goto 1d1
      // 1cd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: getfield v3i.iku Lc05;
      // 1d5: getfield Minecraft.tij Lkh3;
      // 1d8: getstatic w_0.bac Lw_0;
      // 1db: aload 18
      // 1dd: invokevirtual mew.getX ()I
      // 1e0: i2d
      // 1e1: dload 22
      // 1e3: dadd
      // 1e4: aload 18
      // 1e6: invokevirtual mew.getY ()I
      // 1e9: i2f
      // 1ea: ldc 0.1
      // 1ec: nop
      // 1ed: fadd
      // 1ee: f2d
      // 1ef: aload 21
      // 1f1: invokevirtual e0x._y3 ()D
      // 1f4: dsub
      // 1f5: aload 18
      // 1f7: invokevirtual mew.getZ ()I
      // 1fa: i2d
      // 1fb: dload 24
      // 1fd: dadd
      // 1fe: dconst_0
      // 1ff: dconst_0
      // 200: dconst_0
      // 201: bipush 0
      // 202: newarray 10
      // 204: invokevirtual WorldClient.zvy (Lw_0;DDDDDD[I)V
      // 207: iload 3
      // 208: ifeq 2b3
      // 20b: goto 212
      // 20e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 211: athrow
      // 212: aload 21
      // 214: iload 3
      // 215: ifne 231
      // 218: goto 21f
      // 21b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: invokevirtual e0x.p1r ()Lp3y;
      // 222: getstatic p3y.cei Lp3y;
      // 225: goto 22c
      // 228: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22b: athrow
      // 22c: if_acmpeq 2b3
      // 22f: aload 21
      // 231: aload 6
      // 233: aload 20
      // 235: invokevirtual e0x.c7i (Lm5n;Lmew;)V
      // 238: iinc 15 1
      // 23b: aload 0
      // 23c: iload 3
      // 23d: ifne 27e
      // 240: getfield v3i.iol Ljava/util/Random;
      // 243: iload 15
      // 245: invokevirtual java/util/Random.nextInt (I)I
      // 248: ifne 27d
      // 24b: goto 252
      // 24e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 251: athrow
      // 252: aload 20
      // 254: invokevirtual mew.getX ()I
      // 257: i2d
      // 258: dload 22
      // 25a: dadd
      // 25b: dstore 9
      // 25d: aload 20
      // 25f: invokevirtual mew.getY ()I
      // 262: i2f
      // 263: ldc 0.1
      // 265: nop
      // 266: fadd
      // 267: f2d
      // 268: aload 21
      // 26a: invokevirtual e0x.vn4 ()D
      // 26d: dadd
      // 26e: dconst_1
      // 26f: dsub
      // 270: dstore 11
      // 272: aload 20
      // 274: invokevirtual mew.getZ ()I
      // 277: i2d
      // 278: dload 24
      // 27a: dadd
      // 27b: dstore 13
      // 27d: aload 0
      // 27e: getfield v3i.iku Lc05;
      // 281: getfield Minecraft.tij Lkh3;
      // 284: getstatic w_0.nfs Lw_0;
      // 287: aload 20
      // 289: invokevirtual mew.getX ()I
      // 28c: i2d
      // 28d: dload 22
      // 28f: dadd
      // 290: aload 20
      // 292: invokevirtual mew.getY ()I
      // 295: i2f
      // 296: ldc 0.1
      // 298: nop
      // 299: fadd
      // 29a: f2d
      // 29b: aload 21
      // 29d: invokevirtual e0x.vn4 ()D
      // 2a0: dadd
      // 2a1: aload 20
      // 2a3: invokevirtual mew.getZ ()I
      // 2a6: i2d
      // 2a7: dload 24
      // 2a9: dadd
      // 2aa: dconst_0
      // 2ab: dconst_0
      // 2ac: dconst_0
      // 2ad: bipush 0
      // 2ae: newarray 10
      // 2b0: invokevirtual WorldClient.zvy (Lw_0;DDDDDD[I)V
      // 2b3: iinc 17 1
      // 2b6: iload 3
      // 2b7: ifeq 0da
      // 2ba: iload 15
      // 2bc: iload 3
      // 2bd: ifne 2d9
      // 2c0: ifle 399
      // 2c3: goto 2ca
      // 2c6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c9: athrow
      // 2ca: aload 0
      // 2cb: getfield v3i.iol Ljava/util/Random;
      // 2ce: bipush 3
      // 2cf: invokevirtual java/util/Random.nextInt (I)I
      // 2d2: goto 2d9
      // 2d5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d8: athrow
      // 2d9: iload 3
      // 2da: ifne 314
      // 2dd: aload 0
      // 2de: dup
      // 2df: getfield v3i.yya I
      // 2e2: dup_x1
      // 2e3: bipush 1
      // 2e4: iadd
      // 2e5: putfield v3i.yya I
      // 2e8: goto 2ef
      // 2eb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ee: athrow
      // 2ef: if_icmpge 399
      // 2f2: aload 0
      // 2f3: iload 3
      // 2f4: ifne 377
      // 2f7: goto 2fe
      // 2fa: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fd: athrow
      // 2fe: bipush 0
      // 2ff: putfield v3i.yya I
      // 302: dload 11
      // 304: aload 7
      // 306: invokevirtual mew.getY ()I
      // 309: bipush 1
      // 30a: iadd
      // 30b: i2d
      // 30c: dcmpl
      // 30d: goto 314
      // 310: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 313: athrow
      // 314: ifle 36f
      // 317: aload 6
      // 319: iload 3
      // 31a: ifne 37d
      // 31d: goto 324
      // 320: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 323: athrow
      // 324: aload 7
      // 326: invokevirtual OpaquePredicate.k62 (Lmew;)Lmew;
      // 329: invokevirtual mew.getY ()I
      // 32c: aload 7
      // 32e: invokevirtual mew.getY ()I
      // 331: i2f
      // 332: invokestatic fe6.tpk (F)I
      // 335: if_icmple 36f
      // 338: goto 33f
      // 33b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33e: athrow
      // 33f: aload 0
      // 340: getfield v3i.iku Lc05;
      // 343: getfield Minecraft.tij Lkh3;
      // 346: dload 9
      // 348: dload 11
      // 34a: dload 13
      // 34c: sipush 25417
      // 34f: ldc2_w 1680855909763972187
      // 352: lload 1
      // 353: lxor
      // 354: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 359: nop
      // 35a: ldc 0.1
      // 35c: nop
      // 35d: ldc 0.5
      // 35f: nop
      // 360: bipush 0
      // 361: invokevirtual WorldClient.wd_ (DDDLjava/lang/String;FFZ)V
      // 364: iload 3
      // 365: ifeq 399
      // 368: goto 36f
      // 36b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36e: athrow
      // 36f: aload 0
      // 370: goto 377
      // 373: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 376: athrow
      // 377: getfield v3i.iku Lc05;
      // 37a: getfield Minecraft.tij Lkh3;
      // 37d: dload 9
      // 37f: dload 11
      // 381: dload 13
      // 383: sipush 16909
      // 386: ldc2_w 4490518577224965422
      // 389: lload 1
      // 38a: lxor
      // 38b: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 390: nop
      // 391: ldc 0.2
      // 393: nop
      // 394: fconst_1
      // 395: bipush 0
      // 396: invokevirtual WorldClient.wd_ (DDDLjava/lang/String;FFZ)V
      // 399: return
   }

   public void ehe(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: getstatic net/optifine/reflect/Reflector.ForgeWorldProvider_getWeatherRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 007: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 00a: ifeq 05e
      // 00d: aload 0
      // 00e: getfield v3i.iku Lc05;
      // 011: getfield Minecraft.tij Lkh3;
      // 014: iload 2
      // 015: ifne 065
      // 018: goto 01f
      // 01b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: getfield WorldClient.vzz Lupn;
      // 022: astore 3
      // 023: aload 3
      // 024: getstatic net/optifine/reflect/Reflector.ForgeWorldProvider_getWeatherRenderer Lnet/optifine/reflect/ReflectorMethod;
      // 027: bipush 0
      // 028: anewarray 84
      // 02b: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 02e: astore 4
      // 030: aload 4
      // 032: ifnull 05e
      // 035: aload 4
      // 037: getstatic net/optifine/reflect/Reflector.IRenderHandler_render Lnet/optifine/reflect/ReflectorMethod;
      // 03a: bipush 3
      // 03b: anewarray 84
      // 03e: dup
      // 03f: bipush 0
      // 040: fload 1
      // 041: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 044: aastore
      // 045: dup
      // 046: bipush 1
      // 047: aload 0
      // 048: getfield v3i.iku Lc05;
      // 04b: getfield Minecraft.tij Lkh3;
      // 04e: aastore
      // 04f: dup
      // 050: bipush 2
      // 051: aload 0
      // 052: getfield v3i.iku Lc05;
      // 055: aastore
      // 056: invokestatic net/optifine/reflect/Reflector.callVoid (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 059: return
      // 05a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield v3i.iku Lc05;
      // 062: getfield Minecraft.tij Lkh3;
      // 065: fload 1
      // 066: invokevirtual WorldClient.bne (F)F
      // 069: fstore 3
      // 06a: fload 3
      // 06b: fconst_0
      // 06c: fcmpl
      // 06d: iload 2
      // 06e: ifne 07e
      // 071: ifle 72c
      // 074: goto 07b
      // 077: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: invokestatic hxt.juu ()Z
      // 07e: ifeq 082
      // 081: return
      // 082: aload 0
      // 083: invokevirtual v3i.u_c ()V
      // 086: aload 0
      // 087: getfield v3i.iku Lc05;
      // 08a: invokevirtual Minecraft.nsd ()Li2h;
      // 08d: astore 4
      // 08f: aload 0
      // 090: getfield v3i.iku Lc05;
      // 093: getfield Minecraft.tij Lkh3;
      // 096: astore 5
      // 098: aload 4
      // 09a: getfield EntityLivingBase.o2v D
      // 09d: invokestatic fe6.jqf (D)I
      // 0a0: istore 6
      // 0a2: aload 4
      // 0a4: getfield EntityLivingBase.kfp D
      // 0a7: invokestatic fe6.jqf (D)I
      // 0aa: istore 7
      // 0ac: aload 4
      // 0ae: getfield EntityLivingBase.vbd D
      // 0b1: invokestatic fe6.jqf (D)I
      // 0b4: istore 8
      // 0b6: invokestatic jom.yut ()Ljom;
      // 0b9: astore 9
      // 0bb: aload 9
      // 0bd: invokevirtual jom.zuq ()Lq3g;
      // 0c0: astore 10
      // 0c2: invokestatic hzu.o1b ()V
      // 0c5: fconst_0
      // 0c6: fconst_1
      // 0c7: fconst_0
      // 0c8: invokestatic org/lwjgl/opengl/GL11.glNormal3f (FFF)V
      // 0cb: invokestatic hzu.spd ()V
      // 0ce: sipush 770
      // 0d1: sipush 771
      // 0d4: bipush 1
      // 0d5: bipush 0
      // 0d6: invokestatic hzu.u39 (IIII)V
      // 0d9: sipush 516
      // 0dc: ldc 0.1
      // 0de: nop
      // 0df: invokestatic hzu.fak (IF)V
      // 0e2: aload 4
      // 0e4: getfield EntityLivingBase.ivp D
      // 0e7: aload 4
      // 0e9: getfield EntityLivingBase.o2v D
      // 0ec: aload 4
      // 0ee: getfield EntityLivingBase.ivp D
      // 0f1: dsub
      // 0f2: fload 1
      // 0f3: f2d
      // 0f4: dmul
      // 0f5: dadd
      // 0f6: dstore 11
      // 0f8: aload 4
      // 0fa: getfield EntityLivingBase.c54 D
      // 0fd: aload 4
      // 0ff: getfield EntityLivingBase.kfp D
      // 102: aload 4
      // 104: getfield EntityLivingBase.c54 D
      // 107: dsub
      // 108: fload 1
      // 109: f2d
      // 10a: dmul
      // 10b: dadd
      // 10c: dstore 13
      // 10e: aload 4
      // 110: getfield EntityLivingBase.e2b D
      // 113: aload 4
      // 115: getfield EntityLivingBase.vbd D
      // 118: aload 4
      // 11a: getfield EntityLivingBase.e2b D
      // 11d: dsub
      // 11e: fload 1
      // 11f: f2d
      // 120: dmul
      // 121: dadd
      // 122: dstore 15
      // 124: dload 13
      // 126: invokestatic fe6.jqf (D)I
      // 129: istore 17
      // 12b: bipush 5
      // 12c: istore 18
      // 12e: invokestatic hxt.b7f ()Z
      // 131: iload 2
      // 132: ifne 144
      // 135: ifeq 143
      // 138: goto 13f
      // 13b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13e: athrow
      // 13f: bipush 10
      // 141: istore 18
      // 143: bipush -1
      // 144: istore 19
      // 146: aload 0
      // 147: getfield v3i.g6g I
      // 14a: i2f
      // 14b: fload 1
      // 14c: fadd
      // 14d: fstore 20
      // 14f: aload 10
      // 151: dload 11
      // 153: dneg
      // 154: dload 13
      // 156: dneg
      // 157: dload 15
      // 159: dneg
      // 15a: invokevirtual q3g.nbz (DDD)V
      // 15d: fconst_1
      // 15e: fconst_1
      // 15f: fconst_1
      // 160: fconst_1
      // 161: invokestatic hzu.wn0 (FFFF)V
      // 164: new mew$mix
      // 167: dup
      // 168: invokespecial mew$mix.<init> ()V
      // 16b: astore 21
      // 16d: iload 8
      // 16f: iload 18
      // 171: isub
      // 172: istore 22
      // 174: iload 22
      // 176: iload 8
      // 178: iload 18
      // 17a: iadd
      // 17b: if_icmpgt 6f5
      // 17e: iload 6
      // 180: iload 18
      // 182: isub
      // 183: iload 2
      // 184: ifne 6f7
      // 187: istore 23
      // 189: iload 23
      // 18b: iload 6
      // 18d: iload 18
      // 18f: iadd
      // 190: if_icmpgt 6ee
      // 193: iload 22
      // 195: iload 8
      // 197: isub
      // 198: bipush 16
      // 19a: iadd
      // 19b: bipush 32
      // 19d: imul
      // 19e: iload 23
      // 1a0: iadd
      // 1a1: iload 6
      // 1a3: isub
      // 1a4: bipush 16
      // 1a6: iadd
      // 1a7: istore 24
      // 1a9: aload 0
      // 1aa: getfield v3i.fzj [F
      // 1ad: iload 24
      // 1af: faload
      // 1b0: f2d
      // 1b1: ldc2_w 0.5
      // 1b4: dmul
      // 1b5: dstore 25
      // 1b7: aload 0
      // 1b8: getfield v3i.nb1 [F
      // 1bb: iload 24
      // 1bd: faload
      // 1be: f2d
      // 1bf: ldc2_w 0.5
      // 1c2: dmul
      // 1c3: dstore 27
      // 1c5: aload 21
      // 1c7: iload 23
      // 1c9: bipush 0
      // 1ca: iload 22
      // 1cc: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 1cf: pop
      // 1d0: aload 5
      // 1d2: aload 21
      // 1d4: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 1d7: astore 29
      // 1d9: aload 29
      // 1db: invokevirtual gyu.ziq ()Z
      // 1de: iload 2
      // 1df: ifne 176
      // 1e2: iload 2
      // 1e3: ifne 21b
      // 1e6: ifne 20a
      // 1e9: goto 1f0
      // 1ec: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: aload 29
      // 1f2: invokevirtual gyu.o0o ()Z
      // 1f5: iload 2
      // 1f6: ifne 21b
      // 1f9: goto 200
      // 1fc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: ifeq 6e7
      // 203: goto 20a
      // 206: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: aload 5
      // 20c: aload 21
      // 20e: invokevirtual OpaquePredicate.k62 (Lmew;)Lmew;
      // 211: invokevirtual mew.getY ()I
      // 214: goto 21b
      // 217: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: istore 30
      // 21d: iload 7
      // 21f: iload 18
      // 221: isub
      // 222: istore 31
      // 224: iload 7
      // 226: iload 18
      // 228: iadd
      // 229: istore 32
      // 22b: iload 31
      // 22d: iload 30
      // 22f: iload 2
      // 230: ifne 250
      // 233: if_icmpge 241
      // 236: goto 23d
      // 239: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: iload 30
      // 23f: istore 31
      // 241: iload 32
      // 243: iload 2
      // 244: ifne 259
      // 247: iload 30
      // 249: goto 250
      // 24c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24f: athrow
      // 250: if_icmpge 257
      // 253: iload 30
      // 255: istore 32
      // 257: iload 30
      // 259: istore 33
      // 25b: iload 30
      // 25d: iload 17
      // 25f: iload 2
      // 260: ifne 275
      // 263: if_icmpge 271
      // 266: goto 26d
      // 269: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26c: athrow
      // 26d: iload 17
      // 26f: istore 33
      // 271: iload 31
      // 273: iload 32
      // 275: if_icmpeq 6e7
      // 278: aload 0
      // 279: getfield v3i.iol Ljava/util/Random;
      // 27c: iload 23
      // 27e: iload 23
      // 280: imul
      // 281: sipush 3121
      // 284: imul
      // 285: iload 23
      // 287: ldc 45238971
      // 289: nop
      // 28a: imul
      // 28b: iadd
      // 28c: iload 22
      // 28e: iload 22
      // 290: imul
      // 291: ldc 418711
      // 293: nop
      // 294: imul
      // 295: iload 22
      // 297: sipush 13761
      // 29a: imul
      // 29b: iadd
      // 29c: ixor
      // 29d: i2l
      // 29e: invokevirtual java/util/Random.setSeed (J)V
      // 2a1: aload 21
      // 2a3: iload 23
      // 2a5: iload 31
      // 2a7: iload 22
      // 2a9: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 2ac: pop
      // 2ad: aload 29
      // 2af: aload 21
      // 2b1: invokevirtual gyu.qa6 (Lmew;)F
      // 2b4: fstore 34
      // 2b6: aload 5
      // 2b8: invokevirtual OpaquePredicate.ql0 ()Lcdp;
      // 2bb: fload 34
      // 2bd: iload 30
      // 2bf: invokevirtual cdp.m2f (FI)F
      // 2c2: ldc 0.15
      // 2c4: nop
      // 2c5: fcmpl
      // 2c6: iload 2
      // 2c7: ifne 4d4
      // 2ca: iflt 4cb
      // 2cd: goto 2d4
      // 2d0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d3: athrow
      // 2d4: iload 19
      // 2d6: iload 2
      // 2d7: ifne 351
      // 2da: goto 2e1
      // 2dd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e0: athrow
      // 2e1: ifeq 328
      // 2e4: goto 2eb
      // 2e7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ea: athrow
      // 2eb: iload 19
      // 2ed: iload 2
      // 2ee: ifne 30f
      // 2f1: goto 2f8
      // 2f4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f7: athrow
      // 2f8: iflt 30e
      // 2fb: goto 302
      // 2fe: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 301: athrow
      // 302: aload 9
      // 304: invokevirtual jom.q7g ()V
      // 307: goto 30e
      // 30a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30d: athrow
      // 30e: bipush 0
      // 30f: istore 19
      // 311: aload 0
      // 312: getfield v3i.iku Lc05;
      // 315: invokevirtual Minecraft.l22 ()Llc5;
      // 318: getstatic v3i.fa2 Lgdz;
      // 31b: invokevirtual lc5.anl (Lgdz;)V
      // 31e: aload 10
      // 320: bipush 7
      // 322: getstatic gnl.aaz Lbe7;
      // 325: invokevirtual q3g.ezr (ILbe7;)V
      // 328: aload 0
      // 329: getfield v3i.g6g I
      // 32c: iload 23
      // 32e: iload 23
      // 330: imul
      // 331: sipush 3121
      // 334: imul
      // 335: iadd
      // 336: iload 23
      // 338: ldc 45238971
      // 33a: nop
      // 33b: imul
      // 33c: iadd
      // 33d: iload 22
      // 33f: iload 22
      // 341: imul
      // 342: ldc 418711
      // 344: nop
      // 345: imul
      // 346: iadd
      // 347: iload 22
      // 349: sipush 13761
      // 34c: imul
      // 34d: iadd
      // 34e: bipush 31
      // 350: iand
      // 351: i2d
      // 352: fload 1
      // 353: f2d
      // 354: dadd
      // 355: ldc2_w 32.0
      // 358: ddiv
      // 359: ldc2_w 3.0
      // 35c: aload 0
      // 35d: getfield v3i.iol Ljava/util/Random;
      // 360: invokevirtual java/util/Random.nextDouble ()D
      // 363: dadd
      // 364: dmul
      // 365: dstore 35
      // 367: iload 23
      // 369: i2f
      // 36a: ldc 0.5
      // 36c: nop
      // 36d: fadd
      // 36e: f2d
      // 36f: aload 4
      // 371: getfield EntityLivingBase.o2v D
      // 374: dsub
      // 375: dstore 37
      // 377: iload 22
      // 379: i2f
      // 37a: ldc 0.5
      // 37c: nop
      // 37d: fadd
      // 37e: f2d
      // 37f: aload 4
      // 381: getfield EntityLivingBase.vbd D
      // 384: dsub
      // 385: dstore 39
      // 387: dload 37
      // 389: dload 37
      // 38b: dmul
      // 38c: dload 39
      // 38e: dload 39
      // 390: dmul
      // 391: dadd
      // 392: invokestatic fe6.dii (D)F
      // 395: iload 18
      // 397: i2f
      // 398: fdiv
      // 399: fstore 41
      // 39b: fconst_1
      // 39c: fload 41
      // 39e: fload 41
      // 3a0: fmul
      // 3a1: fsub
      // 3a2: ldc 0.5
      // 3a4: nop
      // 3a5: fmul
      // 3a6: ldc 0.5
      // 3a8: nop
      // 3a9: fadd
      // 3aa: fload 3
      // 3ab: fmul
      // 3ac: fstore 42
      // 3ae: aload 21
      // 3b0: iload 23
      // 3b2: iload 33
      // 3b4: iload 22
      // 3b6: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 3b9: pop
      // 3ba: aload 5
      // 3bc: aload 21
      // 3be: bipush 0
      // 3bf: invokevirtual OpaquePredicate.getCombinedLight (Lmew;I)I
      // 3c2: istore 43
      // 3c4: iload 43
      // 3c6: bipush 16
      // 3c8: ishr
      // 3c9: ldc 65535
      // 3cb: nop
      // 3cc: iand
      // 3cd: istore 44
      // 3cf: iload 43
      // 3d1: ldc 65535
      // 3d3: nop
      // 3d4: iand
      // 3d5: istore 45
      // 3d7: aload 10
      // 3d9: iload 23
      // 3db: i2d
      // 3dc: dload 25
      // 3de: dsub
      // 3df: ldc2_w 0.5
      // 3e2: dadd
      // 3e3: iload 31
      // 3e5: i2d
      // 3e6: iload 22
      // 3e8: i2d
      // 3e9: dload 27
      // 3eb: dsub
      // 3ec: ldc2_w 0.5
      // 3ef: dadd
      // 3f0: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3f3: dconst_0
      // 3f4: iload 31
      // 3f6: i2d
      // 3f7: ldc2_w 0.25
      // 3fa: dmul
      // 3fb: dload 35
      // 3fd: dadd
      // 3fe: invokevirtual q3g.h0a (DD)Lq3g;
      // 401: fconst_1
      // 402: fconst_1
      // 403: fconst_1
      // 404: fload 42
      // 406: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 409: iload 44
      // 40b: iload 45
      // 40d: invokevirtual q3g.iu0 (II)Lq3g;
      // 410: invokevirtual q3g.pzw ()V
      // 413: aload 10
      // 415: iload 23
      // 417: i2d
      // 418: dload 25
      // 41a: dadd
      // 41b: ldc2_w 0.5
      // 41e: dadd
      // 41f: iload 31
      // 421: i2d
      // 422: iload 22
      // 424: i2d
      // 425: dload 27
      // 427: dadd
      // 428: ldc2_w 0.5
      // 42b: dadd
      // 42c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 42f: dconst_1
      // 430: iload 31
      // 432: i2d
      // 433: ldc2_w 0.25
      // 436: dmul
      // 437: dload 35
      // 439: dadd
      // 43a: invokevirtual q3g.h0a (DD)Lq3g;
      // 43d: fconst_1
      // 43e: fconst_1
      // 43f: fconst_1
      // 440: fload 42
      // 442: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 445: iload 44
      // 447: iload 45
      // 449: invokevirtual q3g.iu0 (II)Lq3g;
      // 44c: invokevirtual q3g.pzw ()V
      // 44f: aload 10
      // 451: iload 23
      // 453: i2d
      // 454: dload 25
      // 456: dadd
      // 457: ldc2_w 0.5
      // 45a: dadd
      // 45b: iload 32
      // 45d: i2d
      // 45e: iload 22
      // 460: i2d
      // 461: dload 27
      // 463: dadd
      // 464: ldc2_w 0.5
      // 467: dadd
      // 468: invokevirtual q3g.g5o (DDD)Lq3g;
      // 46b: dconst_1
      // 46c: iload 32
      // 46e: i2d
      // 46f: ldc2_w 0.25
      // 472: dmul
      // 473: dload 35
      // 475: dadd
      // 476: invokevirtual q3g.h0a (DD)Lq3g;
      // 479: fconst_1
      // 47a: fconst_1
      // 47b: fconst_1
      // 47c: fload 42
      // 47e: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 481: iload 44
      // 483: iload 45
      // 485: invokevirtual q3g.iu0 (II)Lq3g;
      // 488: invokevirtual q3g.pzw ()V
      // 48b: aload 10
      // 48d: iload 23
      // 48f: i2d
      // 490: dload 25
      // 492: dsub
      // 493: ldc2_w 0.5
      // 496: dadd
      // 497: iload 32
      // 499: i2d
      // 49a: iload 22
      // 49c: i2d
      // 49d: dload 27
      // 49f: dsub
      // 4a0: ldc2_w 0.5
      // 4a3: dadd
      // 4a4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 4a7: dconst_0
      // 4a8: iload 32
      // 4aa: i2d
      // 4ab: ldc2_w 0.25
      // 4ae: dmul
      // 4af: dload 35
      // 4b1: dadd
      // 4b2: invokevirtual q3g.h0a (DD)Lq3g;
      // 4b5: fconst_1
      // 4b6: fconst_1
      // 4b7: fconst_1
      // 4b8: fload 42
      // 4ba: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 4bd: iload 44
      // 4bf: iload 45
      // 4c1: invokevirtual q3g.iu0 (II)Lq3g;
      // 4c4: invokevirtual q3g.pzw ()V
      // 4c7: iload 2
      // 4c8: ifeq 6e7
      // 4cb: iload 19
      // 4cd: goto 4d4
      // 4d0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d3: athrow
      // 4d4: bipush 1
      // 4d5: iload 2
      // 4d6: ifne 527
      // 4d9: if_icmpeq 520
      // 4dc: goto 4e3
      // 4df: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e2: athrow
      // 4e3: iload 19
      // 4e5: iload 2
      // 4e6: ifne 507
      // 4e9: goto 4f0
      // 4ec: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ef: athrow
      // 4f0: iflt 506
      // 4f3: goto 4fa
      // 4f6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f9: athrow
      // 4fa: aload 9
      // 4fc: invokevirtual jom.q7g ()V
      // 4ff: goto 506
      // 502: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 505: athrow
      // 506: bipush 1
      // 507: istore 19
      // 509: aload 0
      // 50a: getfield v3i.iku Lc05;
      // 50d: invokevirtual Minecraft.l22 ()Llc5;
      // 510: getstatic v3i.wub Lgdz;
      // 513: invokevirtual lc5.anl (Lgdz;)V
      // 516: aload 10
      // 518: bipush 7
      // 51a: getstatic gnl.aaz Lbe7;
      // 51d: invokevirtual q3g.ezr (ILbe7;)V
      // 520: aload 0
      // 521: getfield v3i.g6g I
      // 524: sipush 511
      // 527: iand
      // 528: i2f
      // 529: fload 1
      // 52a: fadd
      // 52b: ldc 512.0
      // 52d: nop
      // 52e: fdiv
      // 52f: f2d
      // 530: dstore 35
      // 532: aload 0
      // 533: getfield v3i.iol Ljava/util/Random;
      // 536: invokevirtual java/util/Random.nextDouble ()D
      // 539: fload 20
      // 53b: f2d
      // 53c: ldc2_w 0.01
      // 53f: dmul
      // 540: aload 0
      // 541: getfield v3i.iol Ljava/util/Random;
      // 544: invokevirtual java/util/Random.nextGaussian ()D
      // 547: d2f
      // 548: f2d
      // 549: dmul
      // 54a: dadd
      // 54b: dstore 37
      // 54d: aload 0
      // 54e: getfield v3i.iol Ljava/util/Random;
      // 551: invokevirtual java/util/Random.nextDouble ()D
      // 554: fload 20
      // 556: aload 0
      // 557: getfield v3i.iol Ljava/util/Random;
      // 55a: invokevirtual java/util/Random.nextGaussian ()D
      // 55d: d2f
      // 55e: fmul
      // 55f: f2d
      // 560: ldc2_w 0.001
      // 563: dmul
      // 564: dadd
      // 565: dstore 39
      // 567: iload 23
      // 569: i2f
      // 56a: ldc 0.5
      // 56c: nop
      // 56d: fadd
      // 56e: f2d
      // 56f: aload 4
      // 571: getfield EntityLivingBase.o2v D
      // 574: dsub
      // 575: dstore 41
      // 577: iload 22
      // 579: i2f
      // 57a: ldc 0.5
      // 57c: nop
      // 57d: fadd
      // 57e: f2d
      // 57f: aload 4
      // 581: getfield EntityLivingBase.vbd D
      // 584: dsub
      // 585: dstore 43
      // 587: dload 41
      // 589: dload 41
      // 58b: dmul
      // 58c: dload 43
      // 58e: dload 43
      // 590: dmul
      // 591: dadd
      // 592: invokestatic fe6.dii (D)F
      // 595: iload 18
      // 597: i2f
      // 598: fdiv
      // 599: fstore 45
      // 59b: fconst_1
      // 59c: fload 45
      // 59e: fload 45
      // 5a0: fmul
      // 5a1: fsub
      // 5a2: ldc 0.3
      // 5a4: nop
      // 5a5: fmul
      // 5a6: ldc 0.5
      // 5a8: nop
      // 5a9: fadd
      // 5aa: fload 3
      // 5ab: fmul
      // 5ac: fstore 46
      // 5ae: aload 21
      // 5b0: iload 23
      // 5b2: iload 33
      // 5b4: iload 22
      // 5b6: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 5b9: pop
      // 5ba: aload 5
      // 5bc: aload 21
      // 5be: bipush 0
      // 5bf: invokevirtual OpaquePredicate.getCombinedLight (Lmew;I)I
      // 5c2: bipush 3
      // 5c3: imul
      // 5c4: ldc 15728880
      // 5c6: nop
      // 5c7: iadd
      // 5c8: bipush 4
      // 5c9: idiv
      // 5ca: istore 47
      // 5cc: iload 47
      // 5ce: bipush 16
      // 5d0: ishr
      // 5d1: ldc 65535
      // 5d3: nop
      // 5d4: iand
      // 5d5: istore 48
      // 5d7: iload 47
      // 5d9: ldc 65535
      // 5db: nop
      // 5dc: iand
      // 5dd: istore 49
      // 5df: aload 10
      // 5e1: iload 23
      // 5e3: i2d
      // 5e4: dload 25
      // 5e6: dsub
      // 5e7: ldc2_w 0.5
      // 5ea: dadd
      // 5eb: iload 31
      // 5ed: i2d
      // 5ee: iload 22
      // 5f0: i2d
      // 5f1: dload 27
      // 5f3: dsub
      // 5f4: ldc2_w 0.5
      // 5f7: dadd
      // 5f8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 5fb: dconst_0
      // 5fc: dload 37
      // 5fe: dadd
      // 5ff: iload 31
      // 601: i2d
      // 602: ldc2_w 0.25
      // 605: dmul
      // 606: dload 35
      // 608: dadd
      // 609: dload 39
      // 60b: dadd
      // 60c: invokevirtual q3g.h0a (DD)Lq3g;
      // 60f: fconst_1
      // 610: fconst_1
      // 611: fconst_1
      // 612: fload 46
      // 614: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 617: iload 48
      // 619: iload 49
      // 61b: invokevirtual q3g.iu0 (II)Lq3g;
      // 61e: invokevirtual q3g.pzw ()V
      // 621: aload 10
      // 623: iload 23
      // 625: i2d
      // 626: dload 25
      // 628: dadd
      // 629: ldc2_w 0.5
      // 62c: dadd
      // 62d: iload 31
      // 62f: i2d
      // 630: iload 22
      // 632: i2d
      // 633: dload 27
      // 635: dadd
      // 636: ldc2_w 0.5
      // 639: dadd
      // 63a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 63d: dconst_1
      // 63e: dload 37
      // 640: dadd
      // 641: iload 31
      // 643: i2d
      // 644: ldc2_w 0.25
      // 647: dmul
      // 648: dload 35
      // 64a: dadd
      // 64b: dload 39
      // 64d: dadd
      // 64e: invokevirtual q3g.h0a (DD)Lq3g;
      // 651: fconst_1
      // 652: fconst_1
      // 653: fconst_1
      // 654: fload 46
      // 656: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 659: iload 48
      // 65b: iload 49
      // 65d: invokevirtual q3g.iu0 (II)Lq3g;
      // 660: invokevirtual q3g.pzw ()V
      // 663: aload 10
      // 665: iload 23
      // 667: i2d
      // 668: dload 25
      // 66a: dadd
      // 66b: ldc2_w 0.5
      // 66e: dadd
      // 66f: iload 32
      // 671: i2d
      // 672: iload 22
      // 674: i2d
      // 675: dload 27
      // 677: dadd
      // 678: ldc2_w 0.5
      // 67b: dadd
      // 67c: invokevirtual q3g.g5o (DDD)Lq3g;
      // 67f: dconst_1
      // 680: dload 37
      // 682: dadd
      // 683: iload 32
      // 685: i2d
      // 686: ldc2_w 0.25
      // 689: dmul
      // 68a: dload 35
      // 68c: dadd
      // 68d: dload 39
      // 68f: dadd
      // 690: invokevirtual q3g.h0a (DD)Lq3g;
      // 693: fconst_1
      // 694: fconst_1
      // 695: fconst_1
      // 696: fload 46
      // 698: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 69b: iload 48
      // 69d: iload 49
      // 69f: invokevirtual q3g.iu0 (II)Lq3g;
      // 6a2: invokevirtual q3g.pzw ()V
      // 6a5: aload 10
      // 6a7: iload 23
      // 6a9: i2d
      // 6aa: dload 25
      // 6ac: dsub
      // 6ad: ldc2_w 0.5
      // 6b0: dadd
      // 6b1: iload 32
      // 6b3: i2d
      // 6b4: iload 22
      // 6b6: i2d
      // 6b7: dload 27
      // 6b9: dsub
      // 6ba: ldc2_w 0.5
      // 6bd: dadd
      // 6be: invokevirtual q3g.g5o (DDD)Lq3g;
      // 6c1: dconst_0
      // 6c2: dload 37
      // 6c4: dadd
      // 6c5: iload 32
      // 6c7: i2d
      // 6c8: ldc2_w 0.25
      // 6cb: dmul
      // 6cc: dload 35
      // 6ce: dadd
      // 6cf: dload 39
      // 6d1: dadd
      // 6d2: invokevirtual q3g.h0a (DD)Lq3g;
      // 6d5: fconst_1
      // 6d6: fconst_1
      // 6d7: fconst_1
      // 6d8: fload 46
      // 6da: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 6dd: iload 48
      // 6df: iload 49
      // 6e1: invokevirtual q3g.iu0 (II)Lq3g;
      // 6e4: invokevirtual q3g.pzw ()V
      // 6e7: iinc 23 1
      // 6ea: iload 2
      // 6eb: ifeq 189
      // 6ee: iinc 22 1
      // 6f1: iload 2
      // 6f2: ifeq 174
      // 6f5: iload 19
      // 6f7: iload 2
      // 6f8: ifne 722
      // 6fb: iflt 711
      // 6fe: goto 705
      // 701: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 704: athrow
      // 705: aload 9
      // 707: invokevirtual jom.q7g ()V
      // 70a: goto 711
      // 70d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 710: athrow
      // 711: aload 10
      // 713: dconst_0
      // 714: dconst_0
      // 715: dconst_0
      // 716: invokevirtual q3g.nbz (DDD)V
      // 719: invokestatic hzu.gp4 ()V
      // 71c: invokestatic hzu.ux6 ()V
      // 71f: sipush 516
      // 722: ldc 0.1
      // 724: nop
      // 725: invokestatic hzu.fak (IF)V
      // 728: aload 0
      // 729: invokevirtual v3i.yvz ()V
      // 72c: return
   }

   public void oys() {
      eka var1 = new eka(this.iku);
      hzu.yg5(256);
      hzu.ah8(5889);
      hzu.zwy();
      hzu.bj8(0.0, var1.z6w(), var1.tql(), 0.0, 1000.0, 3000.0);
      hzu.ah8(5888);
      hzu.zwy();
      hzu.a4k(0.0F, 0.0F, -2000.0F);
   }

   private void h_8(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield v3i.iku Lc05;
      // 004: getfield Minecraft.tij Lkh3;
      // 007: astore 3
      // 008: aload 0
      // 009: getfield v3i.iku Lc05;
      // 00c: invokevirtual Minecraft.nsd ()Li2h;
      // 00f: astore 4
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: ldc 0.25
      // 016: nop
      // 017: ldc 0.75
      // 019: nop
      // 01a: aload 0
      // 01b: getfield v3i.iku Lc05;
      // 01e: getfield Minecraft.oxn Lmoh;
      // 021: getfield moh.gcj I
      // 024: i2f
      // 025: fmul
      // 026: ldc 32.0
      // 028: nop
      // 029: fdiv
      // 02a: fadd
      // 02b: fstore 5
      // 02d: fconst_1
      // 02e: fload 5
      // 030: f2d
      // 031: ldc2_w 0.25
      // 034: invokestatic java/lang/Math.pow (DD)D
      // 037: d2f
      // 038: fsub
      // 039: fstore 5
      // 03b: aload 3
      // 03c: aload 0
      // 03d: getfield v3i.iku Lc05;
      // 040: invokevirtual Minecraft.nsd ()Li2h;
      // 043: fload 1
      // 044: invokevirtual OpaquePredicate.ez1 (Li2h;F)Lfqr;
      // 047: astore 6
      // 049: istore 2
      // 04a: aload 6
      // 04c: aload 3
      // 04d: aload 0
      // 04e: getfield v3i.iku Lc05;
      // 051: invokevirtual Minecraft.nsd ()Li2h;
      // 054: fload 1
      // 055: invokestatic net/optifine/CustomColors.getWorldSkyColor (Lfqr;Lt9d;Li2h;F)Lfqr;
      // 058: astore 6
      // 05a: aload 6
      // 05c: getfield fqr.lvi D
      // 05f: d2f
      // 060: fstore 7
      // 062: aload 6
      // 064: getfield fqr.gn5 D
      // 067: d2f
      // 068: fstore 8
      // 06a: aload 6
      // 06c: getfield fqr.bn2 D
      // 06f: d2f
      // 070: fstore 9
      // 072: aload 3
      // 073: fload 1
      // 074: invokevirtual OpaquePredicate.cok (F)Lfqr;
      // 077: astore 10
      // 079: aload 10
      // 07b: aload 3
      // 07c: aload 0
      // 07d: getfield v3i.iku Lc05;
      // 080: invokevirtual Minecraft.nsd ()Li2h;
      // 083: fload 1
      // 084: invokestatic net/optifine/CustomColors.getWorldFogColor (Lfqr;Lt9d;Li2h;F)Lfqr;
      // 087: astore 10
      // 089: aload 0
      // 08a: aload 10
      // 08c: getfield fqr.lvi D
      // 08f: d2f
      // 090: putfield v3i.h0i F
      // 093: aload 0
      // 094: aload 10
      // 096: getfield fqr.gn5 D
      // 099: d2f
      // 09a: putfield v3i.qy4 F
      // 09d: aload 0
      // 09e: aload 10
      // 0a0: getfield fqr.bn2 D
      // 0a3: d2f
      // 0a4: putfield v3i.ai5 F
      // 0a7: aload 0
      // 0a8: iload 2
      // 0a9: ifeq 1b3
      // 0ac: getfield v3i.iku Lc05;
      // 0af: getfield Minecraft.oxn Lmoh;
      // 0b2: getfield moh.gcj I
      // 0b5: bipush 4
      // 0b6: if_icmplt 18c
      // 0b9: goto 0c0
      // 0bc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bf: athrow
      // 0c0: ldc2_w -1.0
      // 0c3: dstore 11
      // 0c5: aload 3
      // 0c6: fload 1
      // 0c7: invokevirtual OpaquePredicate.v6p (F)F
      // 0ca: invokestatic fe6.rtn (F)F
      // 0cd: fconst_0
      // 0ce: fcmpl
      // 0cf: ifle 0e4
      // 0d2: new fqr
      // 0d5: dup
      // 0d6: dload 11
      // 0d8: dconst_0
      // 0d9: dconst_0
      // 0da: invokespecial fqr.<init> (DDD)V
      // 0dd: goto 0ee
      // 0e0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: new fqr
      // 0e7: dup
      // 0e8: dconst_1
      // 0e9: dconst_0
      // 0ea: dconst_0
      // 0eb: invokespecial fqr.<init> (DDD)V
      // 0ee: astore 13
      // 0f0: aload 4
      // 0f2: fload 1
      // 0f3: invokevirtual EntityLivingBase.wej (F)Lfqr;
      // 0f6: aload 13
      // 0f8: invokevirtual fqr.xvl (Lfqr;)D
      // 0fb: d2f
      // 0fc: fstore 14
      // 0fe: fload 14
      // 100: fconst_0
      // 101: fcmpg
      // 102: iload 2
      // 103: ifeq 122
      // 106: ifge 113
      // 109: goto 110
      // 10c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10f: athrow
      // 110: fconst_0
      // 111: fstore 14
      // 113: fload 14
      // 115: iload 2
      // 116: ifeq 1ca
      // 119: fconst_0
      // 11a: fcmpl
      // 11b: goto 122
      // 11e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 121: athrow
      // 122: ifle 18c
      // 125: aload 3
      // 126: getfield OpaquePredicate.vzz Lupn;
      // 129: aload 3
      // 12a: fload 1
      // 12b: invokevirtual OpaquePredicate.icw (F)F
      // 12e: fload 1
      // 12f: invokevirtual upn.sjt (FF)[F
      // 132: astore 15
      // 134: iload 2
      // 135: ifeq 1c5
      // 138: aload 15
      // 13a: ifnull 18c
      // 13d: goto 144
      // 140: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: fload 14
      // 146: aload 15
      // 148: bipush 3
      // 149: faload
      // 14a: fmul
      // 14b: fstore 14
      // 14d: aload 0
      // 14e: aload 0
      // 14f: getfield v3i.h0i F
      // 152: fconst_1
      // 153: fload 14
      // 155: fsub
      // 156: fmul
      // 157: aload 15
      // 159: bipush 0
      // 15a: faload
      // 15b: fload 14
      // 15d: fmul
      // 15e: fadd
      // 15f: putfield v3i.h0i F
      // 162: aload 0
      // 163: aload 0
      // 164: getfield v3i.qy4 F
      // 167: fconst_1
      // 168: fload 14
      // 16a: fsub
      // 16b: fmul
      // 16c: aload 15
      // 16e: bipush 1
      // 16f: faload
      // 170: fload 14
      // 172: fmul
      // 173: fadd
      // 174: putfield v3i.qy4 F
      // 177: aload 0
      // 178: aload 0
      // 179: getfield v3i.ai5 F
      // 17c: fconst_1
      // 17d: fload 14
      // 17f: fsub
      // 180: fmul
      // 181: aload 15
      // 183: bipush 2
      // 184: faload
      // 185: fload 14
      // 187: fmul
      // 188: fadd
      // 189: putfield v3i.ai5 F
      // 18c: aload 0
      // 18d: dup
      // 18e: getfield v3i.h0i F
      // 191: fload 7
      // 193: aload 0
      // 194: getfield v3i.h0i F
      // 197: fsub
      // 198: fload 5
      // 19a: fmul
      // 19b: fadd
      // 19c: putfield v3i.h0i F
      // 19f: aload 0
      // 1a0: dup
      // 1a1: getfield v3i.qy4 F
      // 1a4: fload 8
      // 1a6: aload 0
      // 1a7: getfield v3i.qy4 F
      // 1aa: fsub
      // 1ab: fload 5
      // 1ad: fmul
      // 1ae: fadd
      // 1af: putfield v3i.qy4 F
      // 1b2: aload 0
      // 1b3: dup
      // 1b4: getfield v3i.ai5 F
      // 1b7: fload 9
      // 1b9: aload 0
      // 1ba: getfield v3i.ai5 F
      // 1bd: fsub
      // 1be: fload 5
      // 1c0: fmul
      // 1c1: fadd
      // 1c2: putfield v3i.ai5 F
      // 1c5: aload 3
      // 1c6: fload 1
      // 1c7: invokevirtual OpaquePredicate.bne (F)F
      // 1ca: fstore 11
      // 1cc: fload 11
      // 1ce: iload 2
      // 1cf: ifeq 218
      // 1d2: fconst_0
      // 1d3: fcmpl
      // 1d4: ifle 213
      // 1d7: goto 1de
      // 1da: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dd: athrow
      // 1de: fconst_1
      // 1df: fload 11
      // 1e1: ldc 0.5
      // 1e3: nop
      // 1e4: fmul
      // 1e5: fsub
      // 1e6: fstore 12
      // 1e8: fconst_1
      // 1e9: fload 11
      // 1eb: ldc 0.4
      // 1ed: nop
      // 1ee: fmul
      // 1ef: fsub
      // 1f0: fstore 13
      // 1f2: aload 0
      // 1f3: dup
      // 1f4: getfield v3i.h0i F
      // 1f7: fload 12
      // 1f9: fmul
      // 1fa: putfield v3i.h0i F
      // 1fd: aload 0
      // 1fe: dup
      // 1ff: getfield v3i.qy4 F
      // 202: fload 12
      // 204: fmul
      // 205: putfield v3i.qy4 F
      // 208: aload 0
      // 209: dup
      // 20a: getfield v3i.ai5 F
      // 20d: fload 13
      // 20f: fmul
      // 210: putfield v3i.ai5 F
      // 213: aload 3
      // 214: fload 1
      // 215: invokevirtual OpaquePredicate.fnm (F)F
      // 218: fstore 12
      // 21a: fload 12
      // 21c: fconst_0
      // 21d: iload 2
      // 21e: ifeq 23a
      // 221: fcmpl
      // 222: ifle 25e
      // 225: goto 22c
      // 228: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22b: athrow
      // 22c: fconst_1
      // 22d: fload 12
      // 22f: ldc 0.5
      // 231: nop
      // 232: fmul
      // 233: goto 23a
      // 236: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 239: athrow
      // 23a: fsub
      // 23b: fstore 13
      // 23d: aload 0
      // 23e: dup
      // 23f: getfield v3i.h0i F
      // 242: fload 13
      // 244: fmul
      // 245: putfield v3i.h0i F
      // 248: aload 0
      // 249: dup
      // 24a: getfield v3i.qy4 F
      // 24d: fload 13
      // 24f: fmul
      // 250: putfield v3i.qy4 F
      // 253: aload 0
      // 254: dup
      // 255: getfield v3i.ai5 F
      // 258: fload 13
      // 25a: fmul
      // 25b: putfield v3i.ai5 F
      // 25e: aload 0
      // 25f: getfield v3i.iku Lc05;
      // 262: getfield Minecraft.tij Lkh3;
      // 265: aload 4
      // 267: fload 1
      // 268: invokestatic bm4.te3 (Lt9d;Li2h;F)Le0x;
      // 26b: astore 13
      // 26d: aload 0
      // 26e: getfield v3i.adj Z
      // 271: ifeq 29d
      // 274: aload 3
      // 275: fload 1
      // 276: invokevirtual OpaquePredicate.l86 (F)Lfqr;
      // 279: astore 14
      // 27b: aload 0
      // 27c: aload 14
      // 27e: getfield fqr.lvi D
      // 281: d2f
      // 282: putfield v3i.h0i F
      // 285: aload 0
      // 286: aload 14
      // 288: getfield fqr.gn5 D
      // 28b: d2f
      // 28c: putfield v3i.qy4 F
      // 28f: aload 0
      // 290: aload 14
      // 292: getfield fqr.bn2 D
      // 295: d2f
      // 296: putfield v3i.ai5 F
      // 299: iload 2
      // 29a: ifne 40e
      // 29d: aload 13
      // 29f: invokevirtual e0x.p1r ()Lp3y;
      // 2a2: getstatic p3y.six Lp3y;
      // 2a5: iload 2
      // 2a6: ifeq 397
      // 2a9: goto 2b0
      // 2ac: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2af: athrow
      // 2b0: if_acmpne 388
      // 2b3: goto 2ba
      // 2b6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b9: athrow
      // 2ba: aload 4
      // 2bc: invokestatic hc0.v1a (Li2h;)I
      // 2bf: i2f
      // 2c0: ldc 0.2
      // 2c2: nop
      // 2c3: fmul
      // 2c4: fstore 14
      // 2c6: fload 14
      // 2c8: fconst_0
      // 2c9: ldc 0.6
      // 2cb: nop
      // 2cc: invokestatic hxt.zkb (FFF)F
      // 2cf: fstore 14
      // 2d1: iload 2
      // 2d2: ifeq 323
      // 2d5: aload 4
      // 2d7: instanceof Entity
      // 2da: ifeq 305
      // 2dd: goto 2e4
      // 2e0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e3: athrow
      // 2e4: aload 4
      // 2e6: checkcast Entity
      // 2e9: getstatic mcs.h8d Lmcs;
      // 2ec: invokevirtual Entity.cab (Lmcs;)Z
      // 2ef: ifeq 305
      // 2f2: goto 2f9
      // 2f5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f8: athrow
      // 2f9: fload 14
      // 2fb: ldc 0.3
      // 2fd: nop
      // 2fe: fmul
      // 2ff: ldc 0.6
      // 301: nop
      // 302: fadd
      // 303: fstore 14
      // 305: aload 0
      // 306: ldc 0.02
      // 308: nop
      // 309: fload 14
      // 30b: fadd
      // 30c: putfield v3i.h0i F
      // 30f: aload 0
      // 310: ldc 0.02
      // 312: nop
      // 313: fload 14
      // 315: fadd
      // 316: putfield v3i.qy4 F
      // 319: aload 0
      // 31a: ldc 0.2
      // 31c: nop
      // 31d: fload 14
      // 31f: fadd
      // 320: putfield v3i.ai5 F
      // 323: aload 0
      // 324: getfield v3i.iku Lc05;
      // 327: getfield Minecraft.tij Lkh3;
      // 32a: aload 0
      // 32b: getfield v3i.iku Lc05;
      // 32e: invokevirtual Minecraft.nsd ()Li2h;
      // 331: getfield EntityLivingBase.o2v D
      // 334: aload 0
      // 335: getfield v3i.iku Lc05;
      // 338: invokevirtual Minecraft.nsd ()Li2h;
      // 33b: getfield EntityLivingBase.kfp D
      // 33e: dconst_1
      // 33f: dadd
      // 340: aload 0
      // 341: getfield v3i.iku Lc05;
      // 344: invokevirtual Minecraft.nsd ()Li2h;
      // 347: getfield EntityLivingBase.vbd D
      // 34a: invokestatic net/optifine/CustomColors.getUnderwaterColor (Lm5n;DDD)Lfqr;
      // 34d: astore 15
      // 34f: iload 2
      // 350: ifeq 37a
      // 353: aload 15
      // 355: ifnull 384
      // 358: goto 35f
      // 35b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35e: athrow
      // 35f: aload 0
      // 360: aload 15
      // 362: getfield fqr.lvi D
      // 365: d2f
      // 366: putfield v3i.h0i F
      // 369: aload 0
      // 36a: aload 15
      // 36c: getfield fqr.gn5 D
      // 36f: d2f
      // 370: putfield v3i.qy4 F
      // 373: goto 37a
      // 376: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 379: athrow
      // 37a: aload 0
      // 37b: aload 15
      // 37d: getfield fqr.bn2 D
      // 380: d2f
      // 381: putfield v3i.ai5 F
      // 384: iload 2
      // 385: ifne 40e
      // 388: aload 13
      // 38a: invokevirtual e0x.p1r ()Lp3y;
      // 38d: getstatic p3y.e1s Lp3y;
      // 390: goto 397
      // 393: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 396: athrow
      // 397: if_acmpne 40e
      // 39a: aload 0
      // 39b: ldc 0.6
      // 39d: nop
      // 39e: putfield v3i.h0i F
      // 3a1: aload 0
      // 3a2: ldc 0.1
      // 3a4: nop
      // 3a5: putfield v3i.qy4 F
      // 3a8: aload 0
      // 3a9: fconst_0
      // 3aa: putfield v3i.ai5 F
      // 3ad: aload 0
      // 3ae: iload 2
      // 3af: ifeq 40f
      // 3b2: goto 3b9
      // 3b5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b8: athrow
      // 3b9: getfield v3i.iku Lc05;
      // 3bc: getfield Minecraft.tij Lkh3;
      // 3bf: aload 0
      // 3c0: getfield v3i.iku Lc05;
      // 3c3: invokevirtual Minecraft.nsd ()Li2h;
      // 3c6: getfield EntityLivingBase.o2v D
      // 3c9: aload 0
      // 3ca: getfield v3i.iku Lc05;
      // 3cd: invokevirtual Minecraft.nsd ()Li2h;
      // 3d0: getfield EntityLivingBase.kfp D
      // 3d3: dconst_1
      // 3d4: dadd
      // 3d5: aload 0
      // 3d6: getfield v3i.iku Lc05;
      // 3d9: invokevirtual Minecraft.nsd ()Li2h;
      // 3dc: getfield EntityLivingBase.vbd D
      // 3df: invokestatic net/optifine/CustomColors.getUnderlavaColor (Lm5n;DDD)Lfqr;
      // 3e2: astore 14
      // 3e4: aload 14
      // 3e6: ifnull 40e
      // 3e9: aload 0
      // 3ea: aload 14
      // 3ec: getfield fqr.lvi D
      // 3ef: d2f
      // 3f0: putfield v3i.h0i F
      // 3f3: aload 0
      // 3f4: aload 14
      // 3f6: getfield fqr.gn5 D
      // 3f9: d2f
      // 3fa: putfield v3i.qy4 F
      // 3fd: aload 0
      // 3fe: aload 14
      // 400: getfield fqr.bn2 D
      // 403: d2f
      // 404: putfield v3i.ai5 F
      // 407: goto 40e
      // 40a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40d: athrow
      // 40e: aload 0
      // 40f: getfield v3i.tql F
      // 412: aload 0
      // 413: getfield v3i.inn F
      // 416: aload 0
      // 417: getfield v3i.tql F
      // 41a: fsub
      // 41b: fload 1
      // 41c: fmul
      // 41d: fadd
      // 41e: fstore 14
      // 420: aload 0
      // 421: dup
      // 422: getfield v3i.h0i F
      // 425: fload 14
      // 427: fmul
      // 428: putfield v3i.h0i F
      // 42b: aload 0
      // 42c: dup
      // 42d: getfield v3i.qy4 F
      // 430: fload 14
      // 432: fmul
      // 433: putfield v3i.qy4 F
      // 436: aload 0
      // 437: dup
      // 438: getfield v3i.ai5 F
      // 43b: fload 14
      // 43d: fmul
      // 43e: putfield v3i.ai5 F
      // 441: aload 4
      // 443: getfield EntityLivingBase.c54 D
      // 446: aload 4
      // 448: getfield EntityLivingBase.kfp D
      // 44b: aload 4
      // 44d: getfield EntityLivingBase.c54 D
      // 450: dsub
      // 451: fload 1
      // 452: f2d
      // 453: dmul
      // 454: dadd
      // 455: aload 3
      // 456: getfield OpaquePredicate.vzz Lupn;
      // 459: invokevirtual upn.ndc ()D
      // 45c: dmul
      // 45d: dstore 15
      // 45f: aload 4
      // 461: instanceof Entity
      // 464: iload 2
      // 465: ifeq 4ce
      // 468: ifeq 4ca
      // 46b: goto 472
      // 46e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 471: athrow
      // 472: aload 4
      // 474: checkcast Entity
      // 477: getstatic mcs.s19 Lmcs;
      // 47a: invokevirtual Entity.cab (Lmcs;)Z
      // 47d: iload 2
      // 47e: ifeq 4ce
      // 481: goto 488
      // 484: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 487: athrow
      // 488: ifeq 4ca
      // 48b: goto 492
      // 48e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 491: athrow
      // 492: aload 4
      // 494: checkcast Entity
      // 497: getstatic mcs.s19 Lmcs;
      // 49a: invokevirtual Entity.dhd (Lmcs;)Lsdj;
      // 49d: invokevirtual sdj.ltp ()I
      // 4a0: istore 17
      // 4a2: iload 2
      // 4a3: ifeq 4c3
      // 4a6: iload 17
      // 4a8: bipush 20
      // 4aa: if_icmpge 4c7
      // 4ad: goto 4b4
      // 4b0: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b3: athrow
      // 4b4: dload 15
      // 4b6: fconst_1
      // 4b7: iload 17
      // 4b9: i2f
      // 4ba: ldc 20.0
      // 4bc: nop
      // 4bd: fdiv
      // 4be: fsub
      // 4bf: f2d
      // 4c0: dmul
      // 4c1: dstore 15
      // 4c3: iload 2
      // 4c4: ifne 4ca
      // 4c7: dconst_0
      // 4c8: dstore 15
      // 4ca: dload 15
      // 4cc: dconst_1
      // 4cd: dcmpg
      // 4ce: iload 2
      // 4cf: ifeq 52c
      // 4d2: ifge 526
      // 4d5: goto 4dc
      // 4d8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4db: athrow
      // 4dc: dload 15
      // 4de: dconst_0
      // 4df: iload 2
      // 4e0: ifeq 4fc
      // 4e3: goto 4ea
      // 4e6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e9: athrow
      // 4ea: dcmpg
      // 4eb: ifge 4f8
      // 4ee: goto 4f5
      // 4f1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f4: athrow
      // 4f5: dconst_0
      // 4f6: dstore 15
      // 4f8: dload 15
      // 4fa: dload 15
      // 4fc: dmul
      // 4fd: dstore 15
      // 4ff: aload 0
      // 500: aload 0
      // 501: getfield v3i.h0i F
      // 504: f2d
      // 505: dload 15
      // 507: dmul
      // 508: d2f
      // 509: putfield v3i.h0i F
      // 50c: aload 0
      // 50d: aload 0
      // 50e: getfield v3i.qy4 F
      // 511: f2d
      // 512: dload 15
      // 514: dmul
      // 515: d2f
      // 516: putfield v3i.qy4 F
      // 519: aload 0
      // 51a: aload 0
      // 51b: getfield v3i.ai5 F
      // 51e: f2d
      // 51f: dload 15
      // 521: dmul
      // 522: d2f
      // 523: putfield v3i.ai5 F
      // 526: aload 0
      // 527: getfield v3i.gbx F
      // 52a: fconst_0
      // 52b: fcmpl
      // 52c: iload 2
      // 52d: ifeq 59c
      // 530: ifle 597
      // 533: goto 53a
      // 536: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 539: athrow
      // 53a: aload 0
      // 53b: getfield v3i.yph F
      // 53e: aload 0
      // 53f: getfield v3i.gbx F
      // 542: aload 0
      // 543: getfield v3i.yph F
      // 546: fsub
      // 547: fload 1
      // 548: fmul
      // 549: fadd
      // 54a: fstore 17
      // 54c: aload 0
      // 54d: aload 0
      // 54e: getfield v3i.h0i F
      // 551: fconst_1
      // 552: fload 17
      // 554: fsub
      // 555: fmul
      // 556: aload 0
      // 557: getfield v3i.h0i F
      // 55a: ldc 0.7
      // 55c: nop
      // 55d: fmul
      // 55e: fload 17
      // 560: fmul
      // 561: fadd
      // 562: putfield v3i.h0i F
      // 565: aload 0
      // 566: aload 0
      // 567: getfield v3i.qy4 F
      // 56a: fconst_1
      // 56b: fload 17
      // 56d: fsub
      // 56e: fmul
      // 56f: aload 0
      // 570: getfield v3i.qy4 F
      // 573: ldc 0.6
      // 575: nop
      // 576: fmul
      // 577: fload 17
      // 579: fmul
      // 57a: fadd
      // 57b: putfield v3i.qy4 F
      // 57e: aload 0
      // 57f: aload 0
      // 580: getfield v3i.ai5 F
      // 583: fconst_1
      // 584: fload 17
      // 586: fsub
      // 587: fmul
      // 588: aload 0
      // 589: getfield v3i.ai5 F
      // 58c: ldc 0.6
      // 58e: nop
      // 58f: fmul
      // 590: fload 17
      // 592: fmul
      // 593: fadd
      // 594: putfield v3i.ai5 F
      // 597: aload 4
      // 599: instanceof Entity
      // 59c: iload 2
      // 59d: ifeq 690
      // 5a0: ifeq 686
      // 5a3: goto 5aa
      // 5a6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a9: athrow
      // 5aa: aload 4
      // 5ac: checkcast Entity
      // 5af: getstatic mcs.lu2 Lmcs;
      // 5b2: invokevirtual Entity.cab (Lmcs;)Z
      // 5b5: iload 2
      // 5b6: ifeq 690
      // 5b9: goto 5c0
      // 5bc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5bf: athrow
      // 5c0: ifeq 686
      // 5c3: goto 5ca
      // 5c6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c9: athrow
      // 5ca: aload 0
      // 5cb: aload 4
      // 5cd: checkcast Entity
      // 5d0: fload 1
      // 5d1: invokevirtual v3i.hai (Lg_3;F)F
      // 5d4: fstore 17
      // 5d6: fconst_1
      // 5d7: aload 0
      // 5d8: getfield v3i.h0i F
      // 5db: fdiv
      // 5dc: fstore 18
      // 5de: fload 18
      // 5e0: fconst_1
      // 5e1: aload 0
      // 5e2: getfield v3i.qy4 F
      // 5e5: fdiv
      // 5e6: fcmpl
      // 5e7: iload 2
      // 5e8: ifeq 606
      // 5eb: ifle 5fd
      // 5ee: goto 5f5
      // 5f1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f4: athrow
      // 5f5: fconst_1
      // 5f6: aload 0
      // 5f7: getfield v3i.qy4 F
      // 5fa: fdiv
      // 5fb: fstore 18
      // 5fd: fload 18
      // 5ff: fconst_1
      // 600: aload 0
      // 601: getfield v3i.ai5 F
      // 604: fdiv
      // 605: fcmpl
      // 606: iload 2
      // 607: ifeq 62c
      // 60a: ifle 61c
      // 60d: goto 614
      // 610: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 613: athrow
      // 614: fconst_1
      // 615: aload 0
      // 616: getfield v3i.ai5 F
      // 619: fdiv
      // 61a: fstore 18
      // 61c: fload 18
      // 61e: iload 2
      // 61f: ifeq 63c
      // 622: invokestatic java/lang/Float.isInfinite (F)Z
      // 625: goto 62c
      // 628: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62b: athrow
      // 62c: ifeq 63e
      // 62f: fload 18
      // 631: dconst_0
      // 632: invokestatic java/lang/Math.nextAfter (FD)F
      // 635: goto 63c
      // 638: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63b: athrow
      // 63c: fstore 18
      // 63e: aload 0
      // 63f: aload 0
      // 640: getfield v3i.h0i F
      // 643: fconst_1
      // 644: fload 17
      // 646: fsub
      // 647: fmul
      // 648: aload 0
      // 649: getfield v3i.h0i F
      // 64c: fload 18
      // 64e: fmul
      // 64f: fload 17
      // 651: fmul
      // 652: fadd
      // 653: putfield v3i.h0i F
      // 656: aload 0
      // 657: aload 0
      // 658: getfield v3i.qy4 F
      // 65b: fconst_1
      // 65c: fload 17
      // 65e: fsub
      // 65f: fmul
      // 660: aload 0
      // 661: getfield v3i.qy4 F
      // 664: fload 18
      // 666: fmul
      // 667: fload 17
      // 669: fmul
      // 66a: fadd
      // 66b: putfield v3i.qy4 F
      // 66e: aload 0
      // 66f: aload 0
      // 670: getfield v3i.ai5 F
      // 673: fconst_1
      // 674: fload 17
      // 676: fsub
      // 677: fmul
      // 678: aload 0
      // 679: getfield v3i.ai5 F
      // 67c: fload 18
      // 67e: fmul
      // 67f: fload 17
      // 681: fmul
      // 682: fadd
      // 683: putfield v3i.ai5 F
      // 686: aload 0
      // 687: getfield v3i.iku Lc05;
      // 68a: getfield Minecraft.oxn Lmoh;
      // 68d: getfield moh.rdb Z
      // 690: iload 2
      // 691: ifeq 70f
      // 694: ifeq 6fe
      // 697: goto 69e
      // 69a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69d: athrow
      // 69e: aload 0
      // 69f: getfield v3i.h0i F
      // 6a2: ldc 30.0
      // 6a4: nop
      // 6a5: fmul
      // 6a6: aload 0
      // 6a7: getfield v3i.qy4 F
      // 6aa: ldc 59.0
      // 6ac: nop
      // 6ad: fmul
      // 6ae: fadd
      // 6af: aload 0
      // 6b0: getfield v3i.ai5 F
      // 6b3: ldc 11.0
      // 6b5: nop
      // 6b6: fmul
      // 6b7: fadd
      // 6b8: ldc 100.0
      // 6ba: nop
      // 6bb: fdiv
      // 6bc: fstore 17
      // 6be: aload 0
      // 6bf: getfield v3i.h0i F
      // 6c2: ldc 30.0
      // 6c4: nop
      // 6c5: fmul
      // 6c6: aload 0
      // 6c7: getfield v3i.qy4 F
      // 6ca: ldc 70.0
      // 6cc: nop
      // 6cd: fmul
      // 6ce: fadd
      // 6cf: ldc 100.0
      // 6d1: nop
      // 6d2: fdiv
      // 6d3: fstore 18
      // 6d5: aload 0
      // 6d6: getfield v3i.h0i F
      // 6d9: ldc 30.0
      // 6db: nop
      // 6dc: fmul
      // 6dd: aload 0
      // 6de: getfield v3i.ai5 F
      // 6e1: ldc 70.0
      // 6e3: nop
      // 6e4: fmul
      // 6e5: fadd
      // 6e6: ldc 100.0
      // 6e8: nop
      // 6e9: fdiv
      // 6ea: fstore 19
      // 6ec: aload 0
      // 6ed: fload 17
      // 6ef: putfield v3i.h0i F
      // 6f2: aload 0
      // 6f3: fload 18
      // 6f5: putfield v3i.qy4 F
      // 6f8: aload 0
      // 6f9: fload 19
      // 6fb: putfield v3i.ai5 F
      // 6fe: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_FogColors_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 701: iload 2
      // 702: ifeq 758
      // 705: invokevirtual net/optifine/reflect/ReflectorConstructor.exists ()Z
      // 708: goto 70f
      // 70b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70e: athrow
      // 70f: ifeq 790
      // 712: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_FogColors_Constructor Lnet/optifine/reflect/ReflectorConstructor;
      // 715: bipush 7
      // 717: anewarray 84
      // 71a: dup
      // 71b: bipush 0
      // 71c: aload 0
      // 71d: aastore
      // 71e: dup
      // 71f: bipush 1
      // 720: aload 4
      // 722: aastore
      // 723: dup
      // 724: bipush 2
      // 725: aload 13
      // 727: aastore
      // 728: dup
      // 729: bipush 3
      // 72a: fload 1
      // 72b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 72e: aastore
      // 72f: dup
      // 730: bipush 4
      // 731: aload 0
      // 732: getfield v3i.h0i F
      // 735: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 738: aastore
      // 739: dup
      // 73a: bipush 5
      // 73b: aload 0
      // 73c: getfield v3i.qy4 F
      // 73f: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 742: aastore
      // 743: dup
      // 744: bipush 6
      // 746: aload 0
      // 747: getfield v3i.ai5 F
      // 74a: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 74d: aastore
      // 74e: invokestatic net/optifine/reflect/Reflector.newInstance (Lnet/optifine/reflect/ReflectorConstructor;[Ljava/lang/Object;)Ljava/lang/Object;
      // 751: goto 758
      // 754: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 757: athrow
      // 758: astore 17
      // 75a: aload 17
      // 75c: invokestatic net/optifine/reflect/Reflector.postForgeBusEvent (Ljava/lang/Object;)Z
      // 75f: pop
      // 760: aload 0
      // 761: aload 17
      // 763: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_FogColors_red Lnet/optifine/reflect/ReflectorField;
      // 766: aload 0
      // 767: getfield v3i.h0i F
      // 76a: invokestatic net/optifine/reflect/Reflector.getFieldValueFloat (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;F)F
      // 76d: putfield v3i.h0i F
      // 770: aload 0
      // 771: aload 17
      // 773: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_FogColors_green Lnet/optifine/reflect/ReflectorField;
      // 776: aload 0
      // 777: getfield v3i.qy4 F
      // 77a: invokestatic net/optifine/reflect/Reflector.getFieldValueFloat (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;F)F
      // 77d: putfield v3i.qy4 F
      // 780: aload 0
      // 781: aload 17
      // 783: getstatic net/optifine/reflect/Reflector.EntityViewRenderEvent_FogColors_blue Lnet/optifine/reflect/ReflectorField;
      // 786: aload 0
      // 787: getfield v3i.ai5 F
      // 78a: invokestatic net/optifine/reflect/Reflector.getFieldValueFloat (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;F)F
      // 78d: putfield v3i.ai5 F
      // 790: aload 0
      // 791: getfield v3i.h0i F
      // 794: aload 0
      // 795: getfield v3i.qy4 F
      // 798: aload 0
      // 799: getfield v3i.ai5 F
      // 79c: fconst_0
      // 79d: invokestatic net/optifine/shaders/Shaders.setClearColor (FFFF)V
      // 7a0: return
   }

   private void znd(int param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield v3i.ndn Z
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: aload 0
      // 009: getfield v3i.iku Lc05;
      // 00c: invokevirtual Minecraft.nsd ()Li2h;
      // 00f: astore 4
      // 011: istore 3
      // 012: bipush 0
      // 013: istore 5
      // 015: aload 4
      // 017: instanceof ha9
      // 01a: iload 3
      // 01b: ifne 038
      // 01e: ifeq 035
      // 021: goto 028
      // 024: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 4
      // 02a: checkcast ha9
      // 02d: getfield ha9.lls Lpj2;
      // 030: getfield pj2.g40 Z
      // 033: istore 5
      // 035: sipush 2918
      // 038: aload 0
      // 039: aload 0
      // 03a: getfield v3i.h0i F
      // 03d: aload 0
      // 03e: getfield v3i.qy4 F
      // 041: aload 0
      // 042: getfield v3i.ai5 F
      // 045: fconst_1
      // 046: invokespecial v3i.qng (FFFF)Ljava/nio/FloatBuffer;
      // 049: invokestatic org/lwjgl/opengl/GL11.glFog (ILjava/nio/FloatBuffer;)V
      // 04c: fconst_0
      // 04d: ldc -1.0
      // 04f: nop
      // 050: fconst_0
      // 051: invokestatic org/lwjgl/opengl/GL11.glNormal3f (FFF)V
      // 054: fconst_1
      // 055: fconst_1
      // 056: fconst_1
      // 057: fconst_1
      // 058: invokestatic hzu.wn0 (FFFF)V
      // 05b: aload 0
      // 05c: getfield v3i.iku Lc05;
      // 05f: getfield Minecraft.tij Lkh3;
      // 062: aload 4
      // 064: fload 2
      // 065: invokestatic bm4.te3 (Lt9d;Li2h;F)Le0x;
      // 068: astore 6
      // 06a: ldc -1.0
      // 06c: nop
      // 06d: fstore 7
      // 06f: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getFogDensity Lnet/optifine/reflect/ReflectorMethod;
      // 072: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 075: iload 3
      // 076: ifne 0b1
      // 079: ifeq 0ad
      // 07c: goto 083
      // 07f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getFogDensity Lnet/optifine/reflect/ReflectorMethod;
      // 086: bipush 5
      // 087: anewarray 84
      // 08a: dup
      // 08b: bipush 0
      // 08c: aload 0
      // 08d: aastore
      // 08e: dup
      // 08f: bipush 1
      // 090: aload 4
      // 092: aastore
      // 093: dup
      // 094: bipush 2
      // 095: aload 6
      // 097: aastore
      // 098: dup
      // 099: bipush 3
      // 09a: fload 2
      // 09b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 09e: aastore
      // 09f: dup
      // 0a0: bipush 4
      // 0a1: ldc 0.1
      // 0a3: nop
      // 0a4: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0a7: aastore
      // 0a8: invokestatic net/optifine/reflect/Reflector.callFloat (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)F
      // 0ab: fstore 7
      // 0ad: fload 7
      // 0af: fconst_0
      // 0b0: fcmpl
      // 0b1: iload 3
      // 0b2: ifne 0db
      // 0b5: iflt 0cf
      // 0b8: goto 0bf
      // 0bb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: fload 7
      // 0c1: invokestatic hzu.wz1 (F)V
      // 0c4: iload 3
      // 0c5: ifeq 3d8
      // 0c8: goto 0cf
      // 0cb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: aload 4
      // 0d1: instanceof Entity
      // 0d4: goto 0db
      // 0d7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0da: athrow
      // 0db: iload 3
      // 0dc: ifne 1cf
      // 0df: ifeq 1c4
      // 0e2: goto 0e9
      // 0e5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e8: athrow
      // 0e9: aload 4
      // 0eb: checkcast Entity
      // 0ee: getstatic mcs.s19 Lmcs;
      // 0f1: invokevirtual Entity.cab (Lmcs;)Z
      // 0f4: iload 3
      // 0f5: ifne 1cf
      // 0f8: goto 0ff
      // 0fb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: ifeq 1c4
      // 102: goto 109
      // 105: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 108: athrow
      // 109: ldc 5.0
      // 10b: nop
      // 10c: fstore 8
      // 10e: aload 4
      // 110: checkcast Entity
      // 113: getstatic mcs.s19 Lmcs;
      // 116: invokevirtual Entity.dhd (Lmcs;)Lsdj;
      // 119: invokevirtual sdj.ltp ()I
      // 11c: istore 9
      // 11e: iload 9
      // 120: bipush 20
      // 122: iload 3
      // 123: ifne 15b
      // 126: if_icmpge 148
      // 129: goto 130
      // 12c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: ldc 5.0
      // 132: nop
      // 133: aload 0
      // 134: getfield v3i.llt F
      // 137: ldc 5.0
      // 139: nop
      // 13a: fsub
      // 13b: fconst_1
      // 13c: iload 9
      // 13e: i2f
      // 13f: ldc 20.0
      // 141: nop
      // 142: fdiv
      // 143: fsub
      // 144: fmul
      // 145: fadd
      // 146: fstore 8
      // 148: sipush 9729
      // 14b: invokestatic hzu._om (I)V
      // 14e: iload 3
      // 14f: ifne 186
      // 152: iload 1
      // 153: bipush -1
      // 154: goto 15b
      // 157: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: if_icmpne 176
      // 15e: fconst_0
      // 15f: invokestatic hzu.j68 (F)V
      // 162: fload 8
      // 164: ldc 0.8
      // 166: nop
      // 167: fmul
      // 168: invokestatic hzu.cax (F)V
      // 16b: iload 3
      // 16c: ifeq 18b
      // 16f: goto 176
      // 172: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: fload 8
      // 178: ldc 0.25
      // 17a: nop
      // 17b: fmul
      // 17c: invokestatic hzu.j68 (F)V
      // 17f: goto 186
      // 182: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 185: athrow
      // 186: fload 8
      // 188: invokestatic hzu.cax (F)V
      // 18b: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 18e: getfield org/lwjgl/opengl/ContextCapabilities.GL_NV_fog_distance Z
      // 191: iload 3
      // 192: ifne 1a2
      // 195: ifeq 1c0
      // 198: goto 19f
      // 19b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: invokestatic hxt.z2l ()Z
      // 1a2: iload 3
      // 1a3: ifne 1ba
      // 1a6: ifeq 1c0
      // 1a9: goto 1b0
      // 1ac: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: ldc 34138
      // 1b2: nop
      // 1b3: goto 1ba
      // 1b6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b9: athrow
      // 1ba: ldc 34139
      // 1bc: nop
      // 1bd: invokestatic org/lwjgl/opengl/GL11.glFogi (II)V
      // 1c0: iload 3
      // 1c1: ifeq 3d8
      // 1c4: aload 0
      // 1c5: getfield v3i.adj Z
      // 1c8: goto 1cf
      // 1cb: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ce: athrow
      // 1cf: iload 3
      // 1d0: ifne 1e0
      // 1d3: ifeq 1ed
      // 1d6: goto 1dd
      // 1d9: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: sipush 2048
      // 1e0: invokestatic hzu._om (I)V
      // 1e3: ldc 0.1
      // 1e5: nop
      // 1e6: invokestatic hzu.wz1 (F)V
      // 1e9: iload 3
      // 1ea: ifeq 3d8
      // 1ed: aload 6
      // 1ef: invokevirtual e0x.p1r ()Lp3y;
      // 1f2: getstatic p3y.six Lp3y;
      // 1f5: iload 3
      // 1f6: ifne 293
      // 1f9: goto 200
      // 1fc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ff: athrow
      // 200: if_acmpne 284
      // 203: goto 20a
      // 206: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: sipush 2048
      // 20d: invokestatic hzu._om (I)V
      // 210: invokestatic hxt.uof ()Z
      // 213: ifeq 227
      // 216: goto 21d
      // 219: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21c: athrow
      // 21d: ldc 0.02
      // 21f: nop
      // 220: goto 22a
      // 223: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 226: athrow
      // 227: ldc 0.1
      // 229: nop
      // 22a: fstore 8
      // 22c: aload 4
      // 22e: instanceof Entity
      // 231: iload 3
      // 232: ifne 251
      // 235: ifeq 265
      // 238: goto 23f
      // 23b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23e: athrow
      // 23f: aload 4
      // 241: checkcast Entity
      // 244: getstatic mcs.h8d Lmcs;
      // 247: invokevirtual Entity.cab (Lmcs;)Z
      // 24a: goto 251
      // 24d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 250: athrow
      // 251: ifeq 265
      // 254: ldc 0.01
      // 256: nop
      // 257: invokestatic hzu.wz1 (F)V
      // 25a: iload 3
      // 25b: ifeq 280
      // 25e: goto 265
      // 261: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 264: athrow
      // 265: ldc 0.1
      // 267: nop
      // 268: aload 4
      // 26a: invokestatic hc0.v1a (Li2h;)I
      // 26d: i2f
      // 26e: ldc 0.03
      // 270: nop
      // 271: fmul
      // 272: fsub
      // 273: fstore 9
      // 275: fload 9
      // 277: fconst_0
      // 278: fload 8
      // 27a: invokestatic hxt.zkb (FFF)F
      // 27d: invokestatic hzu.wz1 (F)V
      // 280: iload 3
      // 281: ifeq 3d8
      // 284: aload 6
      // 286: invokevirtual e0x.p1r ()Lp3y;
      // 289: getstatic p3y.e1s Lp3y;
      // 28c: goto 293
      // 28f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 292: athrow
      // 293: if_acmpne 2ab
      // 296: sipush 2048
      // 299: invokestatic hzu._om (I)V
      // 29c: fconst_2
      // 29d: invokestatic hzu.wz1 (F)V
      // 2a0: iload 3
      // 2a1: ifeq 3d8
      // 2a4: goto 2ab
      // 2a7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2aa: athrow
      // 2ab: aload 0
      // 2ac: getfield v3i.llt F
      // 2af: fstore 8
      // 2b1: aload 0
      // 2b2: bipush 1
      // 2b3: putfield v3i.ndn Z
      // 2b6: sipush 9729
      // 2b9: invokestatic hzu._om (I)V
      // 2bc: iload 3
      // 2bd: ifne 2f0
      // 2c0: iload 1
      // 2c1: bipush -1
      // 2c2: if_icmpne 2e0
      // 2c5: goto 2cc
      // 2c8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2cb: athrow
      // 2cc: fconst_0
      // 2cd: invokestatic hzu.j68 (F)V
      // 2d0: fload 8
      // 2d2: invokestatic hzu.cax (F)V
      // 2d5: iload 3
      // 2d6: ifeq 2f5
      // 2d9: goto 2e0
      // 2dc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2df: athrow
      // 2e0: fload 8
      // 2e2: invokestatic hxt.umt ()F
      // 2e5: fmul
      // 2e6: invokestatic hzu.j68 (F)V
      // 2e9: goto 2f0
      // 2ec: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ef: athrow
      // 2f0: fload 8
      // 2f2: invokestatic hzu.cax (F)V
      // 2f5: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 2f8: getfield org/lwjgl/opengl/ContextCapabilities.GL_NV_fog_distance Z
      // 2fb: iload 3
      // 2fc: ifne 36b
      // 2ff: ifeq 352
      // 302: goto 309
      // 305: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 308: athrow
      // 309: invokestatic hxt.z2l ()Z
      // 30c: iload 3
      // 30d: ifne 334
      // 310: goto 317
      // 313: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 316: athrow
      // 317: ifeq 331
      // 31a: goto 321
      // 31d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 320: athrow
      // 321: ldc 34138
      // 323: nop
      // 324: ldc 34139
      // 326: nop
      // 327: invokestatic org/lwjgl/opengl/GL11.glFogi (II)V
      // 32a: goto 331
      // 32d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 330: athrow
      // 331: invokestatic hxt.q34 ()Z
      // 334: iload 3
      // 335: ifne 36b
      // 338: ifeq 352
      // 33b: goto 342
      // 33e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 341: athrow
      // 342: ldc 34138
      // 344: nop
      // 345: ldc 34140
      // 347: nop
      // 348: invokestatic org/lwjgl/opengl/GL11.glFogi (II)V
      // 34b: goto 352
      // 34e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 351: athrow
      // 352: aload 0
      // 353: getfield v3i.iku Lc05;
      // 356: getfield Minecraft.tij Lkh3;
      // 359: getfield WorldClient.vzz Lupn;
      // 35c: aload 4
      // 35e: getfield EntityLivingBase.o2v D
      // 361: d2i
      // 362: aload 4
      // 364: getfield EntityLivingBase.vbd D
      // 367: d2i
      // 368: invokevirtual upn.c2o (II)Z
      // 36b: iload 3
      // 36c: ifne 394
      // 36f: ifeq 38e
      // 372: goto 379
      // 375: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 378: athrow
      // 379: fload 8
      // 37b: ldc 0.05
      // 37d: nop
      // 37e: fmul
      // 37f: invokestatic hzu.j68 (F)V
      // 382: fload 8
      // 384: invokestatic hzu.cax (F)V
      // 387: goto 38e
      // 38a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38d: athrow
      // 38e: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_onFogRender Lnet/optifine/reflect/ReflectorMethod;
      // 391: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 394: iload 3
      // 395: ifne 3e1
      // 398: ifeq 3d8
      // 39b: goto 3a2
      // 39e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a1: athrow
      // 3a2: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_onFogRender Lnet/optifine/reflect/ReflectorMethod;
      // 3a5: bipush 6
      // 3a7: anewarray 84
      // 3aa: dup
      // 3ab: bipush 0
      // 3ac: aload 0
      // 3ad: aastore
      // 3ae: dup
      // 3af: bipush 1
      // 3b0: aload 4
      // 3b2: aastore
      // 3b3: dup
      // 3b4: bipush 2
      // 3b5: aload 6
      // 3b7: aastore
      // 3b8: dup
      // 3b9: bipush 3
      // 3ba: fload 2
      // 3bb: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3be: aastore
      // 3bf: dup
      // 3c0: bipush 4
      // 3c1: iload 1
      // 3c2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c5: aastore
      // 3c6: dup
      // 3c7: bipush 5
      // 3c8: fload 8
      // 3ca: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 3cd: aastore
      // 3ce: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 3d1: goto 3d8
      // 3d4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d7: athrow
      // 3d8: invokestatic hzu.avm ()V
      // 3db: invokestatic hzu.xmh ()V
      // 3de: sipush 1028
      // 3e1: sipush 4608
      // 3e4: invokestatic hzu.p8z (II)V
      // 3e7: return
   }

   private FloatBuffer qng(float var1, float var2, float var3, float var4) {
      try {
         if (hxt.ly3()) {
            Shaders.setFogColor(var1, var2, var3);
         }
      } catch (JsonSyntaxException var5) {
         throw a(var5);
      }

      ((Buffer)this.kk3).clear();
      this.kk3.put(var1).put(var2).put(var3).put(var4);
      ((Buffer)this.kk3).flip();
      return this.kk3;
   }

   public f5a g16() {
      return this.qlc;
   }

   private void n13() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: bipush 0
      // 006: putfield v3i.qdl I
      // 009: iload 1
      // 00a: ifne 263
      // 00d: invokestatic hxt.nib ()Z
      // 010: ifeq 257
      // 013: goto 01a
      // 016: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 019: athrow
      // 01a: invokestatic hxt.wal ()Z
      // 01d: iload 1
      // 01e: ifne 04b
      // 021: goto 028
      // 024: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: ifeq 257
      // 02b: goto 032
      // 02e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 0
      // 033: getfield v3i.iku Lc05;
      // 036: iload 1
      // 037: ifne 059
      // 03a: goto 041
      // 03d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: invokevirtual Minecraft.y8_ ()Z
      // 044: goto 04b
      // 047: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: ifeq 268
      // 04e: aload 0
      // 04f: getfield v3i.iku Lc05;
      // 052: goto 059
      // 055: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: invokevirtual Minecraft.et4 ()Liq7;
      // 05c: astore 2
      // 05d: aload 2
      // 05e: ifnull 253
      // 061: aload 0
      // 062: getfield v3i.iku Lc05;
      // 065: invokevirtual Minecraft.f03 ()Z
      // 068: istore 3
      // 069: iload 3
      // 06a: iload 1
      // 06b: ifne 239
      // 06e: ifne 21d
      // 071: goto 078
      // 074: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 0
      // 079: getfield v3i.iku Lc05;
      // 07c: getfield Minecraft.u0y Lgbe;
      // 07f: instanceof ph6
      // 082: iload 1
      // 083: ifne 239
      // 086: goto 08d
      // 089: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: ifne 21d
      // 090: goto 097
      // 093: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 0
      // 098: getfield v3i.y0a I
      // 09b: iload 1
      // 09c: ifne 0c1
      // 09f: goto 0a6
      // 0a2: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: ifle 0d3
      // 0a9: goto 0b0
      // 0ac: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: getstatic net/optifine/Lagometer.timerServer Lnet/optifine/Lagometer$TimerNano;
      // 0b3: invokevirtual net/optifine/Lagometer$TimerNano.start ()V
      // 0b6: aload 0
      // 0b7: getfield v3i.y0a I
      // 0ba: goto 0c1
      // 0bd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: i2l
      // 0c2: invokestatic hxt.evm (J)V
      // 0c5: getstatic net/optifine/Lagometer.timerServer Lnet/optifine/Lagometer$TimerNano;
      // 0c8: invokevirtual net/optifine/Lagometer$TimerNano.end ()V
      // 0cb: aload 0
      // 0cc: aload 0
      // 0cd: getfield v3i.y0a I
      // 0d0: putfield v3i.qdl I
      // 0d3: invokestatic java/lang/System.nanoTime ()J
      // 0d6: ldc2_w 1000000
      // 0d9: ldiv
      // 0da: lstore 4
      // 0dc: aload 0
      // 0dd: iload 1
      // 0de: ifne 213
      // 0e1: getfield v3i.m0p J
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: ifeq 1f8
      // 0e9: goto 0f0
      // 0ec: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: iload 1
      // 0f2: ifne 213
      // 0f5: goto 0fc
      // 0f8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fb: athrow
      // 0fc: getfield v3i.mty I
      // 0ff: ifeq 1f8
      // 102: goto 109
      // 105: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 108: athrow
      // 109: lload 4
      // 10b: aload 0
      // 10c: getfield v3i.m0p J
      // 10f: lsub
      // 110: lstore 6
      // 112: lload 6
      // 114: lconst_0
      // 115: lcmp
      // 116: iload 1
      // 117: ifne 133
      // 11a: ifge 12d
      // 11d: goto 124
      // 120: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: aload 0
      // 125: lload 4
      // 127: putfield v3i.m0p J
      // 12a: lconst_0
      // 12b: lstore 6
      // 12d: lload 6
      // 12f: ldc2_w 50
      // 132: lcmp
      // 133: iload 1
      // 134: ifne 152
      // 137: iflt 1f4
      // 13a: goto 141
      // 13d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 0
      // 142: lload 4
      // 144: putfield v3i.m0p J
      // 147: aload 2
      // 148: invokevirtual iq7.g5u ()I
      // 14b: goto 152
      // 14e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 151: athrow
      // 152: istore 8
      // 154: iload 8
      // 156: aload 0
      // 157: getfield v3i.mty I
      // 15a: isub
      // 15b: istore 9
      // 15d: iload 9
      // 15f: iload 1
      // 160: ifne 178
      // 163: ifge 176
      // 166: goto 16d
      // 169: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16c: athrow
      // 16d: aload 0
      // 16e: iload 8
      // 170: putfield v3i.mty I
      // 173: bipush 0
      // 174: istore 9
      // 176: iload 9
      // 178: bipush 1
      // 179: iload 1
      // 17a: ifne 1c1
      // 17d: if_icmpge 1b3
      // 180: goto 187
      // 183: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 186: athrow
      // 187: aload 0
      // 188: getfield v3i.y0a I
      // 18b: bipush 100
      // 18d: iload 1
      // 18e: ifne 1c1
      // 191: goto 198
      // 194: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 197: athrow
      // 198: if_icmpge 1b3
      // 19b: goto 1a2
      // 19e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a1: athrow
      // 1a2: aload 0
      // 1a3: dup
      // 1a4: getfield v3i.y0a I
      // 1a7: bipush 2
      // 1a8: iadd
      // 1a9: putfield v3i.y0a I
      // 1ac: goto 1b3
      // 1af: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b2: athrow
      // 1b3: iload 9
      // 1b5: iload 1
      // 1b6: ifne 1da
      // 1b9: bipush 1
      // 1ba: goto 1c1
      // 1bd: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c0: athrow
      // 1c1: if_icmple 1ee
      // 1c4: aload 0
      // 1c5: iload 1
      // 1c6: ifne 1ef
      // 1c9: goto 1d0
      // 1cc: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1cf: athrow
      // 1d0: getfield v3i.y0a I
      // 1d3: goto 1da
      // 1d6: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d9: athrow
      // 1da: ifle 1ee
      // 1dd: aload 0
      // 1de: dup
      // 1df: getfield v3i.y0a I
      // 1e2: bipush 1
      // 1e3: isub
      // 1e4: putfield v3i.y0a I
      // 1e7: goto 1ee
      // 1ea: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ed: athrow
      // 1ee: aload 0
      // 1ef: iload 8
      // 1f1: putfield v3i.mty I
      // 1f4: iload 1
      // 1f5: ifeq 219
      // 1f8: aload 0
      // 1f9: lload 4
      // 1fb: putfield v3i.m0p J
      // 1fe: aload 0
      // 1ff: aload 2
      // 200: invokevirtual iq7.g5u ()I
      // 203: putfield v3i.mty I
      // 206: aload 0
      // 207: fconst_1
      // 208: putfield v3i.xuo F
      // 20b: aload 0
      // 20c: goto 213
      // 20f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 212: athrow
      // 213: ldc 50.0
      // 215: nop
      // 216: putfield v3i.tdt F
      // 219: iload 1
      // 21a: ifeq 253
      // 21d: aload 0
      // 21e: iload 1
      // 21f: ifne 24f
      // 222: goto 229
      // 225: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 228: athrow
      // 229: getfield v3i.iku Lc05;
      // 22c: getfield Minecraft.u0y Lgbe;
      // 22f: instanceof ph6
      // 232: goto 239
      // 235: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 238: athrow
      // 239: ifeq 249
      // 23c: ldc2_w 20
      // 23f: invokestatic hxt.evm (J)V
      // 242: goto 249
      // 245: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 248: athrow
      // 249: aload 0
      // 24a: lconst_0
      // 24b: putfield v3i.m0p J
      // 24e: aload 0
      // 24f: bipush 0
      // 250: putfield v3i.mty I
      // 253: iload 1
      // 254: ifeq 268
      // 257: aload 0
      // 258: lconst_0
      // 259: putfield v3i.m0p J
      // 25c: goto 263
      // 25f: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 262: athrow
      // 263: aload 0
      // 264: bipush 0
      // 265: putfield v3i.mty I
      // 268: return
   }

   private void sry() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 118039640279150
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: invokestatic net/optifine/GlErrors.frameStart ()V
      // 00f: aload 0
      // 010: iload 3
      // 011: ifeq 065
      // 014: getfield v3i.aai Z
      // 017: ifne 061
      // 01a: goto 021
      // 01d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: invokestatic net/optifine/util/TextureUtils.registerResourceListener ()V
      // 024: invokestatic hxt.odz ()I
      // 027: bipush 64
      // 029: iload 3
      // 02a: ifeq 055
      // 02d: goto 034
      // 030: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: if_icmpne 05c
      // 037: goto 03e
      // 03a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: invokestatic hxt.kns ()I
      // 041: iload 3
      // 042: ifeq 059
      // 045: goto 04c
      // 048: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: bipush 32
      // 04e: goto 055
      // 051: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: if_icmpne 05c
      // 058: bipush 1
      // 059: invokestatic hxt.md8 (Z)V
      // 05c: aload 0
      // 05d: bipush 1
      // 05e: putfield v3i.aai Z
      // 061: invokestatic hxt.tym ()V
      // 064: aload 0
      // 065: getfield v3i.iku Lc05;
      // 068: getfield Minecraft.tij Lkh3;
      // 06b: astore 4
      // 06d: aload 4
      // 06f: ifnull 1c3
      // 072: invokestatic hxt.ilk ()Ljava/lang/String;
      // 075: iload 3
      // 076: ifeq 0d2
      // 079: goto 080
      // 07c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: ifnull 181
      // 083: goto 08a
      // 086: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: sipush 12270
      // 08d: ldc2_w 1245967138209922861
      // 090: lload 1
      // 091: lxor
      // 092: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: sipush 1986
      // 09b: ldc2_w 5225867054017075025
      // 09e: lload 1
      // 09f: lxor
      // 0a0: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: nop
      // 0a6: sipush 9146
      // 0a9: ldc2_w 2012268162777183052
      // 0ac: lload 1
      // 0ad: lxor
      // 0ae: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: nop
      // 0b4: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0b7: ldc "L"
      // 0b9: nop
      // 0ba: sipush 20622
      // 0bd: ldc2_w 537928448028704863
      // 0c0: lload 1
      // 0c1: lxor
      // 0c2: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 0cb: goto 0d2
      // 0ce: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: astore 5
      // 0d4: new java/lang/StringBuilder
      // 0d7: dup
      // 0d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0db: aload 5
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: ldc " "
      // 0e2: nop
      // 0e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e6: invokestatic hxt.ilk ()Ljava/lang/String;
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ef: astore 6
      // 0f1: new tao
      // 0f4: dup
      // 0f5: sipush 24035
      // 0f8: ldc2_w 4462609998576487803
      // 0fb: lload 1
      // 0fc: lxor
      // 0fd: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: nop
      // 103: bipush 1
      // 104: anewarray 84
      // 107: dup
      // 108: bipush 0
      // 109: new java/lang/StringBuilder
      // 10c: dup
      // 10d: invokespecial java/lang/StringBuilder.<init> ()V
      // 110: sipush 30990
      // 113: ldc2_w 3796343669402249674
      // 116: lload 1
      // 117: lxor
      // 118: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: nop
      // 11e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 121: aload 6
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: sipush 10175
      // 129: ldc2_w 9012407526961805093
      // 12c: lload 1
      // 12d: lxor
      // 12e: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: nop
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13a: aastore
      // 13b: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 13e: invokespecial tao.<init> (Ljava/lang/String;)V
      // 141: astore 7
      // 143: aload 7
      // 145: new poy
      // 148: dup
      // 149: invokespecial poy.<init> ()V
      // 14c: new tgr
      // 14f: dup
      // 150: getstatic tgr$a3_.nk6 Ltgr$a3_;
      // 153: sipush 29647
      // 156: ldc2_w 8884362072061649743
      // 159: lload 1
      // 15a: lxor
      // 15b: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: nop
      // 161: invokespecial tgr.<init> (Ltgr$a3_;Ljava/lang/String;)V
      // 164: invokevirtual poy.bpc (Ltgr;)Lpoy;
      // 167: invokevirtual tao.di5 (Lpoy;)Lekw;
      // 16a: pop
      // 16b: aload 0
      // 16c: getfield v3i.iku Lc05;
      // 16f: getfield Minecraft.t43 Ld1f;
      // 172: invokevirtual d1f.lcg ()Lsxg;
      // 175: aload 7
      // 177: invokevirtual sxg.obg (Lekw;)V
      // 17a: aconst_null
      // 17b: checkcast java/lang/String
      // 17e: invokestatic hxt.g6z (Ljava/lang/String;)V
      // 181: invokestatic hxt.m28 ()Z
      // 184: iload 3
      // 185: ifeq 1d8
      // 188: ifeq 1c3
      // 18b: goto 192
      // 18e: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 191: athrow
      // 192: bipush 0
      // 193: invokestatic hxt.md8 (Z)V
      // 196: new tao
      // 199: dup
      // 19a: sipush 25256
      // 19d: ldc2_w 8923580705601008253
      // 1a0: lload 1
      // 1a1: lxor
      // 1a2: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: nop
      // 1a8: bipush 0
      // 1a9: anewarray 84
      // 1ac: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1af: invokespecial tao.<init> (Ljava/lang/String;)V
      // 1b2: astore 5
      // 1b4: aload 0
      // 1b5: getfield v3i.iku Lc05;
      // 1b8: getfield Minecraft.t43 Ld1f;
      // 1bb: invokevirtual d1f.lcg ()Lsxg;
      // 1be: aload 5
      // 1c0: invokevirtual sxg.obg (Lekw;)V
      // 1c3: aload 0
      // 1c4: iload 3
      // 1c5: ifeq 1f1
      // 1c8: getfield v3i.iku Lc05;
      // 1cb: getfield Minecraft.u0y Lgbe;
      // 1ce: instanceof MainMenuScreen
      // 1d1: goto 1d8
      // 1d4: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: ifeq 1f0
      // 1db: aload 0
      // 1dc: aload 0
      // 1dd: getfield v3i.iku Lc05;
      // 1e0: getfield Minecraft.u0y Lgbe;
      // 1e3: checkcast MainMenuScreen
      // 1e6: invokespecial v3i.nvk (Lq08;)V
      // 1e9: goto 1f0
      // 1ec: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: iload 3
      // 1f2: ifeq 228
      // 1f5: getfield v3i.e3b Lt9d;
      // 1f8: aload 4
      // 1fa: if_acmpeq 227
      // 1fd: goto 204
      // 200: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 203: athrow
      // 204: aload 0
      // 205: getfield v3i.e3b Lt9d;
      // 208: aload 4
      // 20a: invokestatic net/optifine/RandomEntities.worldChanged (Lt9d;Lt9d;)V
      // 20d: invokestatic hxt.nt_ ()V
      // 210: aload 0
      // 211: lconst_0
      // 212: putfield v3i.m0p J
      // 215: aload 0
      // 216: bipush 0
      // 217: putfield v3i.mty I
      // 21a: aload 0
      // 21b: aload 4
      // 21d: putfield v3i.e3b Lt9d;
      // 220: goto 227
      // 223: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 226: athrow
      // 227: aload 0
      // 228: iload 3
      // 229: ifeq 248
      // 22c: getstatic net/optifine/shaders/Shaders.configAntialiasingLevel I
      // 22f: invokevirtual v3i.ndn (I)Z
      // 232: ifne 247
      // 235: goto 23c
      // 238: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23b: athrow
      // 23c: bipush 0
      // 23d: putstatic net/optifine/shaders/Shaders.configAntialiasingLevel I
      // 240: goto 247
      // 243: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 246: athrow
      // 247: aload 0
      // 248: getfield v3i.iku Lc05;
      // 24b: getfield Minecraft.u0y Lgbe;
      // 24e: iload 3
      // 24f: ifeq 275
      // 252: ifnull 29c
      // 255: goto 25c
      // 258: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25b: athrow
      // 25c: aload 0
      // 25d: getfield v3i.iku Lc05;
      // 260: iload 3
      // 261: ifeq 288
      // 264: goto 26b
      // 267: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26a: athrow
      // 26b: getfield Minecraft.u0y Lgbe;
      // 26e: goto 275
      // 271: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 274: athrow
      // 275: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 278: ldc _ov
      // 27a: if_acmpne 29c
      // 27d: aload 0
      // 27e: getfield v3i.iku Lc05;
      // 281: goto 288
      // 284: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 287: athrow
      // 288: new net/optifine/gui/GuiChatOF
      // 28b: dup
      // 28c: aload 0
      // 28d: getfield v3i.iku Lc05;
      // 290: getfield Minecraft.u0y Lgbe;
      // 293: checkcast _ov
      // 296: invokespecial net/optifine/gui/GuiChatOF.<init> (L_ov;)V
      // 299: invokevirtual Minecraft.z2i (Lgbe;)V
      // 29c: return
   }

   private void o1e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v3i.a J
      // 03: ldc2_w 17720455624564
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield v3i.iku Lc05;
      // 10: getfield Minecraft.tij Lkh3;
      // 13: ifnull c7
      // 16: invokestatic hxt.lkm ()Z
      // 19: iload 3
      // 1a: ifeq 49
      // 1d: goto 24
      // 20: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: ifeq c7
      // 27: goto 2e
      // 2a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: sipush 1373
      // 31: ldc2_w 182757151570995907
      // 34: lload 1
      // 35: lxor
      // 36: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: nop
      // 3c: ldc2_w 10000
      // 3f: invokestatic net/optifine/util/TimedEvent.isActive (Ljava/lang/String;J)Z
      // 42: goto 49
      // 45: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: iload 3
      // 4a: ifeq 5a
      // 4d: ifeq c7
      // 50: goto 57
      // 53: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: invokestatic hzu.rzm ()I
      // 5a: istore 4
      // 5c: iload 4
      // 5e: iload 3
      // 5f: ifeq 78
      // 62: ifeq c7
      // 65: goto 6c
      // 68: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: iload 4
      // 6e: invokestatic net/optifine/GlErrors.isEnabled (I)Z
      // 71: goto 78
      // 74: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: iload 3
      // 79: ifeq 88
      // 7c: ifeq c7
      // 7f: goto 86
      // 82: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: iload 4
      // 88: invokestatic hxt.de_ (I)Ljava/lang/String;
      // 8b: astore 5
      // 8d: new tao
      // 90: dup
      // 91: sipush 20952
      // 94: ldc2_w 8674003783827357235
      // 97: lload 1
      // 98: lxor
      // 99: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: nop
      // 9f: bipush 2
      // a0: anewarray 84
      // a3: dup
      // a4: bipush 0
      // a5: iload 4
      // a7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // aa: aastore
      // ab: dup
      // ac: bipush 1
      // ad: aload 5
      // af: aastore
      // b0: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // b3: invokespecial tao.<init> (Ljava/lang/String;)V
      // b6: astore 6
      // b8: aload 0
      // b9: getfield v3i.iku Lc05;
      // bc: getfield Minecraft.t43 Ld1f;
      // bf: invokevirtual d1f.lcg ()Lsxg;
      // c2: aload 6
      // c4: invokevirtual sxg.obg (Lekw;)V
      // c7: return
   }

   private void nvk(MainMenuScreen param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v3i.a J
      // 03: ldc2_w 101793619192349
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aconst_null
      // 0e: astore 5
      // 10: invokestatic java/util/Calendar.getInstance ()Ljava/util/Calendar;
      // 13: astore 6
      // 15: aload 6
      // 17: new java/util/Date
      // 1a: dup
      // 1b: invokespecial java/util/Date.<init> ()V
      // 1e: invokevirtual java/util/Calendar.setTime (Ljava/util/Date;)V
      // 21: aload 6
      // 23: bipush 5
      // 24: invokevirtual java/util/Calendar.get (I)I
      // 27: istore 7
      // 29: aload 6
      // 2b: bipush 2
      // 2c: invokevirtual java/util/Calendar.get (I)I
      // 2f: bipush 1
      // 30: iadd
      // 31: istore 8
      // 33: iload 7
      // 35: bipush 8
      // 37: iload 4
      // 39: ifeq 50
      // 3c: if_icmpne 63
      // 3f: goto 46
      // 42: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: iload 8
      // 48: bipush 4
      // 49: goto 50
      // 4c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: if_icmpne 63
      // 53: sipush 27831
      // 56: ldc2_w 8782898985366527540
      // 59: lload 2
      // 5a: lxor
      // 5b: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: astore 5
      // 63: iload 7
      // 65: bipush 14
      // 67: iload 4
      // 69: ifeq 81
      // 6c: if_icmpne 94
      // 6f: goto 76
      // 72: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: iload 8
      // 78: bipush 8
      // 7a: goto 81
      // 7d: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: if_icmpne 94
      // 84: sipush 8586
      // 87: ldc2_w 8325796422239769468
      // 8a: lload 2
      // 8b: lxor
      // 8c: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: nop
      // 92: astore 5
      // 94: aload 5
      // 96: ifnonnull 9a
      // 99: return
      // 9a: aload 1
      // 9b: getstatic net/optifine/reflect/Reflector.GuiMainMenu_splashText Lnet/optifine/reflect/ReflectorField;
      // 9e: aload 5
      // a0: invokestatic net/optifine/reflect/Reflector.setFieldValue (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorField;Ljava/lang/Object;)Z
      // a3: pop
      // a4: goto a9
      // a7: astore 5
      // a9: return
   }

   public boolean ndn(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 23636823201303
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: invokestatic gis.gu5 ()Z
      // 010: iload 4
      // 012: ifeq 020
      // 015: ifne 021
      // 018: goto 01f
      // 01b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01e: athrow
      // 01f: bipush 0
      // 020: ireturn
      // 021: aload 0
      // 022: getfield v3i.n5u Lqn4;
      // 025: iload 4
      // 027: ifeq 03f
      // 02a: ifnull 06e
      // 02d: goto 034
      // 030: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 0
      // 035: getfield v3i.n5u Lqn4;
      // 038: goto 03f
      // 03b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield v3i.zz1 [Lqn4;
      // 043: bipush 2
      // 044: aaload
      // 045: iload 4
      // 047: ifeq 065
      // 04a: if_acmpeq 06e
      // 04d: goto 054
      // 050: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 053: athrow
      // 054: aload 0
      // 055: getfield v3i.n5u Lqn4;
      // 058: aload 0
      // 059: getfield v3i.zz1 [Lqn4;
      // 05c: bipush 4
      // 05d: aaload
      // 05e: goto 065
      // 061: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 064: athrow
      // 065: if_acmpeq 06e
      // 068: bipush 1
      // 069: ireturn
      // 06a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: iload 1
      // 06f: bipush 2
      // 070: iload 4
      // 072: ifeq 088
      // 075: if_icmpeq 0b9
      // 078: goto 07f
      // 07b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: iload 1
      // 080: bipush 4
      // 081: goto 088
      // 084: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: if_icmpeq 0b9
      // 08b: aload 0
      // 08c: getfield v3i.n5u Lqn4;
      // 08f: iload 4
      // 091: ifeq 0af
      // 094: goto 09b
      // 097: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: ifnonnull 0ab
      // 09e: goto 0a5
      // 0a1: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: bipush 1
      // 0a6: ireturn
      // 0a7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: getfield v3i.n5u Lqn4;
      // 0af: invokevirtual qn4.fzs ()V
      // 0b2: aload 0
      // 0b3: aconst_null
      // 0b4: putfield v3i.n5u Lqn4;
      // 0b7: bipush 1
      // 0b8: ireturn
      // 0b9: aload 0
      // 0ba: iload 4
      // 0bc: ifeq 0f3
      // 0bf: getfield v3i.n5u Lqn4;
      // 0c2: ifnull 0f2
      // 0c5: goto 0cc
      // 0c8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: iload 4
      // 0cf: ifeq 0f3
      // 0d2: goto 0d9
      // 0d5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d8: athrow
      // 0d9: getfield v3i.n5u Lqn4;
      // 0dc: aload 0
      // 0dd: getfield v3i.zz1 [Lqn4;
      // 0e0: iload 1
      // 0e1: aaload
      // 0e2: if_acmpne 0f2
      // 0e5: goto 0ec
      // 0e8: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: bipush 1
      // 0ed: ireturn
      // 0ee: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: iload 4
      // 0f5: ifeq 154
      // 0f8: getfield v3i.iku Lc05;
      // 0fb: getfield Minecraft.tij Lkh3;
      // 0fe: ifnonnull 10e
      // 101: goto 108
      // 104: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: bipush 1
      // 109: ireturn
      // 10a: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: aload 0
      // 10f: new gdz
      // 112: dup
      // 113: new java/lang/StringBuilder
      // 116: dup
      // 117: invokespecial java/lang/StringBuilder.<init> ()V
      // 11a: sipush 23236
      // 11d: ldc2_w 1307756191155049569
      // 120: lload 2
      // 121: lxor
      // 122: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: nop
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: iload 1
      // 12c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12f: sipush 26547
      // 132: ldc2_w 4437618858990594344
      // 135: lload 2
      // 136: lxor
      // 137: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: nop
      // 13d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 140: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 143: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 146: invokevirtual v3i.uyd (Lgdz;)V
      // 149: aload 0
      // 14a: getfield v3i.zz1 [Lqn4;
      // 14d: iload 1
      // 14e: aload 0
      // 14f: getfield v3i.n5u Lqn4;
      // 152: aastore
      // 153: aload 0
      // 154: getfield v3i.ssp Z
      // 157: ireturn
   }

   private void q30(EntityLivingBase param1, float param2, _aq param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v3i.a J
      // 03: ldc2_w 126400062785150
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 7
      // 0e: ldc 201435902
      // 10: nop
      // 11: istore 8
      // 13: aload 0
      // 14: getfield v3i.qbm Z
      // 17: iload 7
      // 19: ifeq 50
      // 1c: ifeq 4b
      // 1f: goto 26
      // 22: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: bipush 0
      // 28: putfield v3i.qbm Z
      // 2b: aload 0
      // 2c: aload 1
      // 2d: fload 2
      // 2e: f2d
      // 2f: aload 3
      // 30: iload 4
      // 32: invokespecial v3i.ujw (Li2h;DL_aq;Z)V
      // 35: aload 0
      // 36: getfield v3i.iku Lc05;
      // 39: getfield Minecraft.t43 Ld1f;
      // 3c: invokevirtual d1f.lcg ()Lsxg;
      // 3f: iload 8
      // 41: invokevirtual sxg.teh (I)V
      // 44: goto 4b
      // 47: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 61
      // 4d: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 50: iload 7
      // 52: ifeq 6b
      // 55: ifeq c5
      // 58: goto 5f
      // 5b: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: bipush 38
      // 61: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 64: goto 6b
      // 67: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: ifeq c5
      // 6e: aload 0
      // 6f: iload 7
      // 71: ifeq 91
      // 74: goto 7b
      // 77: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: getfield v3i.iku Lc05;
      // 7e: getfield Minecraft.u0y Lgbe;
      // 81: ifnull 90
      // 84: goto 8b
      // 87: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: return
      // 8c: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: aload 0
      // 91: bipush 1
      // 92: putfield v3i.qbm Z
      // 95: new tao
      // 98: dup
      // 99: sipush 7493
      // 9c: ldc2_w 7545346863553070003
      // 9f: lload 5
      // a1: lxor
      // a2: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: nop
      // a8: bipush 0
      // a9: anewarray 84
      // ac: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // af: invokespecial tao.<init> (Ljava/lang/String;)V
      // b2: astore 9
      // b4: aload 0
      // b5: getfield v3i.iku Lc05;
      // b8: getfield Minecraft.t43 Ld1f;
      // bb: invokevirtual d1f.lcg ()Lsxg;
      // be: aload 9
      // c0: iload 8
      // c2: invokevirtual sxg.xkx (Lekw;I)V
      // c5: return
   }

   private void ujw(EntityLivingBase param1, double param2, _aq param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v3i.a J
      // 003: ldc2_w 139348733889862
      // 006: lxor
      // 007: lstore 6
      // 009: aload 0
      // 00a: getfield v3i.iku Lc05;
      // 00d: getfield Minecraft.oxn Lmoh;
      // 010: getfield moh.czj I
      // 013: istore 9
      // 015: invokestatic OpaquePredicate.b ()I
      // 018: aload 0
      // 019: getfield v3i.iku Lc05;
      // 01c: getfield Minecraft.oxn Lmoh;
      // 01f: getfield moh.uzo Z
      // 022: istore 10
      // 024: istore 8
      // 026: aload 0
      // 027: getfield v3i.iku Lc05;
      // 02a: getfield Minecraft.oxn Lmoh;
      // 02d: sipush 1000
      // 030: putfield moh.czj I
      // 033: aload 0
      // 034: getfield v3i.iku Lc05;
      // 037: getfield Minecraft.oxn Lmoh;
      // 03a: bipush 0
      // 03b: putfield moh.uzo Z
      // 03e: invokestatic hxt.hm6 ()Lcrp;
      // 041: astore 11
      // 043: aload 11
      // 045: invokevirtual crp.wpv ()I
      // 048: istore 12
      // 04a: invokestatic java/lang/System.currentTimeMillis ()J
      // 04d: lstore 13
      // 04f: sipush 10714
      // 052: ldc2_w 6576351167797132296
      // 055: lload 6
      // 057: lxor
      // 058: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: nop
      // 05e: invokestatic hxt.brd (Ljava/lang/String;)V
      // 061: invokestatic java/lang/System.currentTimeMillis ()J
      // 064: ldc2_w 5000
      // 067: ladd
      // 068: lstore 15
      // 06a: bipush 0
      // 06b: istore 17
      // 06d: bipush 0
      // 06e: istore 18
      // 070: bipush 0
      // 071: istore 18
      // 073: bipush 0
      // 074: istore 19
      // 076: iload 19
      // 078: bipush 100
      // 07a: if_icmpge 115
      // 07d: aload 11
      // 07f: bipush 1
      // 080: putfield crp.jli Z
      // 083: aload 11
      // 085: aload 1
      // 086: dload 2
      // 087: aload 4
      // 089: aload 0
      // 08a: dup
      // 08b: getfield v3i.bvo I
      // 08e: dup_x1
      // 08f: bipush 1
      // 090: iadd
      // 091: putfield v3i.bvo I
      // 094: iload 5
      // 096: invokevirtual crp.dvx (Li2h;DL_aq;IZ)V
      // 099: aload 11
      // 09b: invokevirtual crp.w3m ()Z
      // 09e: iload 8
      // 0a0: ifeq 11a
      // 0a3: iload 8
      // 0a5: ifeq 0c4
      // 0a8: goto 0af
      // 0ab: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ae: athrow
      // 0af: ifne 0bc
      // 0b2: goto 0b9
      // 0b5: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: bipush 1
      // 0ba: istore 18
      // 0bc: iload 17
      // 0be: aload 11
      // 0c0: invokevirtual crp.oy0 ()I
      // 0c3: iadd
      // 0c4: istore 17
      // 0c6: aload 11
      // 0c8: invokevirtual crp.w3m ()Z
      // 0cb: ifne 0eb
      // 0ce: aload 11
      // 0d0: invokestatic java/lang/System.nanoTime ()J
      // 0d3: ldc2_w 1000000000
      // 0d6: ladd
      // 0d7: invokevirtual crp.rrc (J)V
      // 0da: iload 8
      // 0dc: ifeq 0f5
      // 0df: iload 8
      // 0e1: ifne 0c6
      // 0e4: goto 0eb
      // 0e7: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ea: athrow
      // 0eb: iload 17
      // 0ed: aload 11
      // 0ef: invokevirtual crp.oy0 ()I
      // 0f2: isub
      // 0f3: istore 17
      // 0f5: iload 8
      // 0f7: ifeq 110
      // 0fa: iload 18
      // 0fc: ifne 10d
      // 0ff: goto 106
      // 102: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: goto 115
      // 109: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10c: athrow
      // 10d: iinc 19 1
      // 110: iload 8
      // 112: ifne 076
      // 115: aload 11
      // 117: invokevirtual crp.wpv ()I
      // 11a: iload 8
      // 11c: ifeq 13b
      // 11f: iload 12
      // 121: if_icmpeq 135
      // 124: goto 12b
      // 127: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: bipush 1
      // 12c: istore 18
      // 12e: aload 11
      // 130: invokevirtual crp.wpv ()I
      // 133: istore 12
      // 135: invokestatic java/lang/System.currentTimeMillis ()J
      // 138: lload 15
      // 13a: lcmp
      // 13b: iload 8
      // 13d: ifeq 179
      // 140: ifle 177
      // 143: goto 14a
      // 146: invokestatic v3i.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: new java/lang/StringBuilder
      // 14d: dup
      // 14e: invokespecial java/lang/StringBuilder.<init> ()V
      // 151: sipush 14932
      // 154: ldc2_w 8705718415513808895
      // 157: lload 6
      // 159: lxor
      // 15a: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: nop
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: iload 17
      // 165: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 168: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16b: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 16e: invokestatic java/lang/System.currentTimeMillis ()J
      // 171: ldc2_w 5000
      // 174: ladd
      // 175: lstore 15
      // 177: iload 18
      // 179: ifne 070
      // 17c: goto 17f
      // 17f: new java/lang/StringBuilder
      // 182: dup
      // 183: invokespecial java/lang/StringBuilder.<init> ()V
      // 186: sipush 13291
      // 189: ldc2_w 6676182308509345286
      // 18c: lload 6
      // 18e: lxor
      // 18f: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: nop
      // 195: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 198: iload 17
      // 19a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 19d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a0: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 1a3: sipush 19423
      // 1a6: ldc2_w 2270105475385171577
      // 1a9: lload 6
      // 1ab: lxor
      // 1ac: invokedynamic n (IJ)Ljava/lang/String; bsm=v3i.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: nop
      // 1b2: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 1b5: bipush 0
      // 1b6: putstatic kqk.vql I
      // 1b9: aload 0
      // 1ba: getfield v3i.iku Lc05;
      // 1bd: getfield Minecraft.oxn Lmoh;
      // 1c0: iload 9
      // 1c2: putfield moh.czj I
      // 1c5: aload 0
      // 1c6: getfield v3i.iku Lc05;
      // 1c9: getfield Minecraft.oxn Lmoh;
      // 1cc: iload 10
      // 1ce: putfield moh.uzo Z
      // 1d1: goto 1f1
      // 1d4: astore 20
      // 1d6: aload 0
      // 1d7: getfield v3i.iku Lc05;
      // 1da: getfield Minecraft.oxn Lmoh;
      // 1dd: iload 9
      // 1df: putfield moh.czj I
      // 1e2: aload 0
      // 1e3: getfield v3i.iku Lc05;
      // 1e6: getfield Minecraft.oxn Lmoh;
      // 1e9: iload 10
      // 1eb: putfield moh.uzo Z
      // 1ee: aload 20
      // 1f0: athrow
      // 1f1: return
   }

   public static Minecraft m3l(v3i var0) {
      return var0.iku;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4462551664101115715L, 7986416005224785429L, MethodHandles.lookup().lookupClass()).a(215264057401314L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 89861946799158L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[89];
      int var5 = 0;
      String var4 = "2ÏÌwtÈ\u008b$?\u009e\u001aú\u0083æ¸K8e¥o\nÔ\t»Ç\"æ\u008d¸7|7\u0091Êð\u0017ü\u0097=\u008fzlK\u0001S=C±ö É\u0088diÒk\t_\u009dþ\u0089æziRl<\u008cô:ÕH\u00158\u000f1¨þ)@éh\f{Zç£ÞÅ\u0018\u008bÁ\u0016ÁÞ¿õ\u0012öiXeÎ/A\u0098\b\u009dÊ\u0016kô/K¹x\u0013èÒ»<V\u0002´¬¼¥¥,\u0084(\fÄ\u009e·ä¢`«\u0007äºö\b&Ý«\u001a\u0081ö)ìÆèÂÇýné\u0093ÎÓ\u0092ËF^O3\u009c®á\u0010ÕÈú\u000b\u001cxðv\nÅÙâð~¾Å(]\u0002 h ýl¶îFó±òº1\u0018¯\u0006\\.\u0007V\u001a\u0002½\u009fÍDu\u0086ÎO\u0010rt\u0013¦üõi8Adù\u000e\u00ad§Óó©\u001c\u008b§¥\u008dHëÑ SL«êÐ\u0090E\u008a\u009f\u0018\\\u009b=%X\u008d\u008dÆ043iD\u009fÎ\u008ao¯ÐÐcý\u0098HÛ\u0093Àk\u0010Ek\u0004\tëñÕ\u0016=@\u0013U¯?\u0088Û\u0010ºüÊ0È%\u0019ÇqõVâ\u009cµ«ú8_¢ä\u0081%íÀ\rÊkâ\u008fHÞëó*Tû\u0014\u0096\u0095¦aªx\\cu;È\u0099?2\u008e\\!@õ¼n§¥\u001dz\u0094a\u000e\nJ\u000bâ\u008a´Áo(ã½9\u0013ÜïõàÜ\u0084èÌÖz1$TîhD2D`v]D¬+©\u0015ÀâÚ\u0089w$Ì¼¡\u0014(Hé^\u0012~\u0089\u000eJ\u0081Ýìåi58÷¡\u008fkD\u0096lÞÁäÚµ®I²R\u0080\r^µàdI\fÎ `ðé·¢ðÒº@\u001b\u0004öi¢M´\u001a¨Ü\u0082\\<\u009c\u0086EYûó(<\u0082f\u0010\u0095TÂê6\u0006\u0012×\u0084+)i\u0004\u001b¿æ\u0010ºþ«Ç\u008aÞ\u0004µ±N±(1\u001e%E \u0011ÜB5WÛ\u0019\net\u0085ØBßf\u00ad®0U9\u0085d\u0093ì?Z÷àâ,\u008f.( Àri°6\u001c¿À\u0086¤Îz¢\u0093GüA\"Ùö«\u0086ÿ\u0099çoxâ\u0081¨ 3ì\u0097\u0084u'3ç 6NB\u0089V\u0082Õn/\u0097¶¦Å©\u0016} ÖTú£¤0÷Jç,Q\u0014·\u00898\u0010\u008bdP£»§AiÀÄ\u0004>\u0017\u00198o\u0018\u0089þÜý\rà¶è&¸2!\u0095üòz#\u0013WÈ¶À´´\u0010êï4¶\u009e\u000e¢(¶HE\u0081Dl¦<\u0010 \tktqw¶ÕI¬Î\u0085&ò\u009f´0[\u0081\u0081\u0014´¾ÉSÉ¯\u008dÁ\u0096\"\u001eÎ»\u0087¥Íõ\u0012ëêY\u001a\u0010\u0083\u00966t¦\u008c¨Ø{¯ÙÏu¹\u0084çÝ×ì(Y@\u0098\u008d\t\u0004\u0015îÖÂfÏ\u0000\u008b\u0019ñ¾\u001aÁ¨Z\u001cÄ\u001dûç'1¢\u0088T\u0087ÆþL]ùi\u0093M¨TÒ\\òËx\u0007iÕ\u0005jÀÜ\u0019Yé¼S §\u0002\u000f\u001c\u0088~8/í\u001aÞ$Sð\u009az\u0003æIÛe\u009b¿\u0006*é-\u0087BãMí\\TNªûvæ¸ÄGZ·3ý\u0011¿\r9Õ\u009b}m.r_\u0099É\u0099P¬é(\\ò¹¸\u009eWÆ\u0090xÒ·F!Ãâ\u0014èñ:ã\u0000\u000eô\u00ad·y\u0091Ë¾\u0007tUz\u0005×¶\u0007HlÌ\u0010¢\u009c[\u008eV\u009bW7öÄ\u0089\u0016\u008bñV6\u0018Zr\u0018s\u0004+«Wß·\u0095\u0093ª>Æ\u0014d2í3ß\u0091T18²jG:I\u0004\u009aS\u008c\u00127\r\u0084\u001eüN³<,ï\u0080N'.*e³\u001bÉmE²%?/º\u0083w.Ï§\u0088Û\b\u0096«ÐE°òx§:pÃ\u0013 ø`òê\u0082?^qÓÍ\n3\u0086Î¢\"¿1;q[Ô\u0092y\u0000PX\u008bg\u001f2ä(\u0018j.SþÒ\u009fH©¢\u00ad¦paÁd\u0016¶%t-æ~ÄøØü\u0003;T\u0091\u0001\u000eùr²æ`<Ë(34Z/\rãf)Õ8ÉzºDÛ\u009cp\u000e2L\u0084\u008fÍ$[Gã.a\u0082\u0010\u000e\u009c\"Ý1\u0099·WT\u0018\b1BwÎ±e2=P\u008d\u001e¼Ï7x\u009c³H®¶ª\u0084½(4#\u0082\u009e*\u0081\u00ad}\u0083o\u0097\u0088\u008f\u0089;{j\u0085.\u001edì\u001c\u0000ÿ\u001cé\u0089¥¬DD\u0003#\u0018\u009bj\u0095ò/ 6¶O´õ(\u008d\u0012D\u007f%×vo\u0005îi¹\u0002'9[\u0099Â®ì×Àû`qÀ\u0010mÚe&\u00179ø¤Ú\u00050BÚ×rþ\u0018;æ\u0099\u0003¬¤\u0087ÉmñF,`v\u0091ÏÕ«\u0098!ëÍª-(½±\u007f\u009a\u008eïÎ4\u0090³\u008d~\u008d,-íûÏP²¬(\u0094!·ò\u0014\u009bº¯\u0098å/ÒÑ+¹\u0085ÿo8Ô\u0005\fÏ\u0007Ýo\ní9áÔË=Ãbã\u0013HXý`\u0085S¶°\u0013\u000eè\u0086\u0098£\u0093£§\u0001ús\"j#ÔÞ\u0085r\u0005Þó&rþ\u0084WÜ*j(Le\b»ÃU,ó\u00807_8yÌ\u009cú\u0005ÑÊ\u0000ýâÊ²\u0006\u008d\u0090ê9®}\"u\u009c\u008bÃè\u008co;@2>©%\t\u00adb\u0013:ÉF\u009b¸k\u0096W\u0019í\u0092¹±Ð$LÍH;Ù¨èXø\u009a\u0001pí7ÆRëZ-\u008e(\u0080õIØ7?/%â\u0019\u001f\n¥\u0006\u0099ð'Ðkú8ù%r\u000fO*û³$ú¾ãÍ\u000e¥ã.\u0017<Õ\bíôPÙÃð+÷:\u0081\u0081³Û\u0014\u0004ä4s\"Þ£tº\u0019¡SÖqþ\u0012\u0006\u008aÿL\u0096 ¯¿o-¼h÷\u009e\u0085\u0099\u0001\u0085\u00152Ã´ú\u008dN\f¨wÿ'T5¡QÈ\u000b`ë\u0010ê\u001fEñ=ýÑjÎ°ôòÖ¿¯\u0098(\u0016ÓY 9ô\u0084²\u009e¼«¤\u0080\u000f¿\u000eÝDMk\u0087\u0013Q¤3ì9\r1póÆ!´ì7\\±{b\u0010\u008b¶\u0001ü=ç<J\u0006@e\u009bD\u0004»¤(Á'¨¾Ôá +[]ÿÂlty_\u0090vq\u0000Ý\u001a4\u009b|ë¢\u0013\"Î[bbÏå¢ãSpÔ0eá\u0085²\n\u00ad\u0002wàëÖHûHbw\u0088Á$QúÂ9\u000fqØp,\u001dL¶ô\u0017\u008abmOè¯ù\u0001tâ\u001fV³ü\u00848¢c\u008b\u001e Õ\u0015I\u0098\u0018ó¼ºú°<`UÞ\u001bä&\u0007&\u0090\u008cÚûíTÚ\u0004j\u0002¼\u0090×\u0016®£\u0086ß\u00038\u0097 hÄ}zl\u0013Ô\u001a\u0010Â8\u001aÇXCiWË\u0085÷N?\u0082\r?ïMëË\u001fÈKñh5Ýó6¹ÚoÁè\u001c\u008cöq'¾\u0081u!\u0007w\t\u007f>f\u001a \u009c\u0017ü\u0086ÑX!8NYs8@ÀY ä\u0086  \u0097\u001a=\u009bÃ R\u0000¨Ø\nê\u009fâA\u0080ql\u0081èvÎ^·XÒy\u0091íÅ\u0003³A\u008d\u007f'\u0007ýú3\u0014=\u001ch8u\u0086\u008f½\\Wåø/u.Þ\u0080^lgê\råFBÈÚ\fâ6B\u008eT\u0019\u0085u\u0086×\u007f\u008e©\u000496½H\\~\"\u0018ù¾\u009câ4ÞCó7ì\u0010 Ê|\u0016ûjù¯U\u0017\u008f\u0085³ôy\u008e\u0018&a\u0090c¯î\u009a´t¼\t\fK1®cx;\u0091u$FCº\u0010%Ù¾P\u009fÌ\u0080\u008fN\b²Þ\u0098ÃH\u0015 Üþ\u0011ë\u0012ÏíÐpÅ/~\u0010ä÷¥^\u0003ö³\u001b\f[sB2ó½|µIl(\u0084\u0082\u009fÑëÕûV}\u007flå#_r\u0099¢\t$\u0001HN/ù¿Ý\rB\u007f\u0014Ißo\u0018\u0096\u0081OYiù(3íÆê\u0017½røáÖ\r\f\u0013ñ\u0001½\u009d0X\u0084Â²i;}\u009bâ6m'ÔÎ\\¤¡¹ÖßsÀ(;JvÛ6\fÓ/òH[ù@ á\u000f#SJí\u0095\u009f++o\u008bÑL¨Ða)\u0004¼@dÎS$ (fr(ÄlKÁ]ò£V#ÛHPlÂ¹O¼1Ã-É=\u0099\u0012\u0094\u0007ÚNÚx«\u0005<\u008f\u0016\u001f\u00168B!\u0096\u0003ÝMN\u0004\u0094\u0083Liß'\u001f¹Â+\u009a\u0091t¡\u0080V{rÃç%Ì\u0005\u00ad\u0006Å*¸ø\u008d\u00adåéê\nåÏfå^$W\u0000a6\u000e\u0086þ0e'¶Ø\u0093Ik\u0012«eÿ\u0097Ù\u000ekR_®\u0090\u001f\u009a!\u001bq\u001c¢»\u001e+îÜw\u0006£{±X¼[\u0018Jä\u0083p«[ÐS Üé\u009eìã^Bí<½BG\u001aõ\u0084a@ËO9Ý\u0001=hûØ¬\u008d\u0003\u008eæm(p²@ µ¶G\u0016\u001aób\u000f\t6yBh \bú\bN\u001b\u008aºçÍÊ$\u0003Ì\u000f\u0088§ô´YÇ9\u008b\u0010\u0092´ÅÞWd\u0003wH[\u000f\u0088)¨ \u00058\u000b\u008b¢\u0018\u001d½éÚæ=ßl²\u0090æû\u008b¬ð&\u0003Ñ¿a%\f¹@qÐÀØR¨\u00930L{L¬~P\u0002+ºc¬NEÌÀÁ<òRè\u0010\u009b\u0010\u0005´LXEß¤o®\u009e×ªÉ¡(ÉGD8\u00024\\\u0011³\n0?\u008c\u001d\u00181z\u001fp¶~\u009b\u0019\u0082ÏÕøK¾G\u0092¨\u0089Ç\u009f\u0007»\u0082cñ\u0010\u0092\u000bY«õy\u0019\u0086Wò\u001dPp\u0003ë&\u0010 Ëh2K£¬½\u009cí®òÜ\u0097\u0083\u001e\u0018\u0014·\u0016\u001f¸¤%·\u0095-\u0092\u009a\u0096\u008ew\u0091\u001eû\u0091ù86ûí\u0010aßD\u0093µhÞDð~V®\u0087Ñ§5\u0010\u001fäs½\u0005¿\rt\u0085;à}¸Ù0Ü 4èjÔØ`¯)`+é*ÒþâU¡\u0093Í\u0096=qþ^¢ø£úê¨ä\b\u0010í¯±EKs\u001f\u0002>B'\u00adï©Úð(¨Q\u0089\u0015\u0086\u008bÃ\u0004\u009c¦³4\u00ad ±\t\u0088\u0088¡ñíë\u009b\u0094\u000f£\u0087«\n\u0013r íoÞÀ¥E\u0015å\u0010/9.TrCÈW>&\u0004~Á\u008c , Ä\u0081(Ð@Â\u0016¸7ñòbþ\u00148\u001ea\u0095\b\u0017`\t3\nrÊïQ¬\u0019¹\u0097(©Ý\u000b\u0096É½o'\u009a6é\u009dÓðu\u00035\u001c<\u0098lÈºãä\u008aCµêb\u0011C\u001bFÝ\u0098\u0016ýë\u0012\u0010Ñü¦Öµ\u0005\u0089¸öb+\u007f´ar (\u0010\"\u008eø¡/äZ<fiÅÞ4òç|y\u001d\u0006\u0092ZºgÐ»m/\u001c\u0088äC=\u001dóGô7Ò(\u0018\u0081¬@vn¿ubh·1C\u008bÌd\u0015´#ëÙ<9ËG(\u009d\u0012ÚeõK\u00ad\u0004Ëï7ÔÚ\u008c\\¤\u0005E\u000e7\u0080\u0099\u00062ÀÞ#.\u008a\b²\u0089@\u0091ÁãEê.Ê0\u009a\u0002T\u0006b\u0007\u000b4Þ÷¬67uÖeÄ©QÎPB;\u008f\u0090Âa\u0013r\u0000\u001f\u009aVt(4Oo\u00996=MRa°w\u008bò0\\\u008d\u0013ÇÞp³tù/f×\u0016u\\²Î¨vÏ\u009762\u0018¤ñ\u0018uýSÏÝ\u001f\u0093\u0087ÿÇ#c\u009bW\b@D&¬0Ø RÉÀ\u0010<äÿ\u001c±O\u000b¹¸-è!Ì?\u009b¢¬N5¸áùVó¼ÃA\u008d0Á\u008b\u008dë\u0092ÀµD¥J\u0097É#\u0094\u0090b\u007fsþX\u008bvz\u0011\u0093\f\u0005\u008eWðd\u0011à¨¬\u008f\u001b-ãéx\u009f\u0098ÇÅ\u008b\u001dE";
      int var6 = "2ÏÌwtÈ\u008b$?\u009e\u001aú\u0083æ¸K8e¥o\nÔ\t»Ç\"æ\u008d¸7|7\u0091Êð\u0017ü\u0097=\u008fzlK\u0001S=C±ö É\u0088diÒk\t_\u009dþ\u0089æziRl<\u008cô:ÕH\u00158\u000f1¨þ)@éh\f{Zç£ÞÅ\u0018\u008bÁ\u0016ÁÞ¿õ\u0012öiXeÎ/A\u0098\b\u009dÊ\u0016kô/K¹x\u0013èÒ»<V\u0002´¬¼¥¥,\u0084(\fÄ\u009e·ä¢`«\u0007äºö\b&Ý«\u001a\u0081ö)ìÆèÂÇýné\u0093ÎÓ\u0092ËF^O3\u009c®á\u0010ÕÈú\u000b\u001cxðv\nÅÙâð~¾Å(]\u0002 h ýl¶îFó±òº1\u0018¯\u0006\\.\u0007V\u001a\u0002½\u009fÍDu\u0086ÎO\u0010rt\u0013¦üõi8Adù\u000e\u00ad§Óó©\u001c\u008b§¥\u008dHëÑ SL«êÐ\u0090E\u008a\u009f\u0018\\\u009b=%X\u008d\u008dÆ043iD\u009fÎ\u008ao¯ÐÐcý\u0098HÛ\u0093Àk\u0010Ek\u0004\tëñÕ\u0016=@\u0013U¯?\u0088Û\u0010ºüÊ0È%\u0019ÇqõVâ\u009cµ«ú8_¢ä\u0081%íÀ\rÊkâ\u008fHÞëó*Tû\u0014\u0096\u0095¦aªx\\cu;È\u0099?2\u008e\\!@õ¼n§¥\u001dz\u0094a\u000e\nJ\u000bâ\u008a´Áo(ã½9\u0013ÜïõàÜ\u0084èÌÖz1$TîhD2D`v]D¬+©\u0015ÀâÚ\u0089w$Ì¼¡\u0014(Hé^\u0012~\u0089\u000eJ\u0081Ýìåi58÷¡\u008fkD\u0096lÞÁäÚµ®I²R\u0080\r^µàdI\fÎ `ðé·¢ðÒº@\u001b\u0004öi¢M´\u001a¨Ü\u0082\\<\u009c\u0086EYûó(<\u0082f\u0010\u0095TÂê6\u0006\u0012×\u0084+)i\u0004\u001b¿æ\u0010ºþ«Ç\u008aÞ\u0004µ±N±(1\u001e%E \u0011ÜB5WÛ\u0019\net\u0085ØBßf\u00ad®0U9\u0085d\u0093ì?Z÷àâ,\u008f.( Àri°6\u001c¿À\u0086¤Îz¢\u0093GüA\"Ùö«\u0086ÿ\u0099çoxâ\u0081¨ 3ì\u0097\u0084u'3ç 6NB\u0089V\u0082Õn/\u0097¶¦Å©\u0016} ÖTú£¤0÷Jç,Q\u0014·\u00898\u0010\u008bdP£»§AiÀÄ\u0004>\u0017\u00198o\u0018\u0089þÜý\rà¶è&¸2!\u0095üòz#\u0013WÈ¶À´´\u0010êï4¶\u009e\u000e¢(¶HE\u0081Dl¦<\u0010 \tktqw¶ÕI¬Î\u0085&ò\u009f´0[\u0081\u0081\u0014´¾ÉSÉ¯\u008dÁ\u0096\"\u001eÎ»\u0087¥Íõ\u0012ëêY\u001a\u0010\u0083\u00966t¦\u008c¨Ø{¯ÙÏu¹\u0084çÝ×ì(Y@\u0098\u008d\t\u0004\u0015îÖÂfÏ\u0000\u008b\u0019ñ¾\u001aÁ¨Z\u001cÄ\u001dûç'1¢\u0088T\u0087ÆþL]ùi\u0093M¨TÒ\\òËx\u0007iÕ\u0005jÀÜ\u0019Yé¼S §\u0002\u000f\u001c\u0088~8/í\u001aÞ$Sð\u009az\u0003æIÛe\u009b¿\u0006*é-\u0087BãMí\\TNªûvæ¸ÄGZ·3ý\u0011¿\r9Õ\u009b}m.r_\u0099É\u0099P¬é(\\ò¹¸\u009eWÆ\u0090xÒ·F!Ãâ\u0014èñ:ã\u0000\u000eô\u00ad·y\u0091Ë¾\u0007tUz\u0005×¶\u0007HlÌ\u0010¢\u009c[\u008eV\u009bW7öÄ\u0089\u0016\u008bñV6\u0018Zr\u0018s\u0004+«Wß·\u0095\u0093ª>Æ\u0014d2í3ß\u0091T18²jG:I\u0004\u009aS\u008c\u00127\r\u0084\u001eüN³<,ï\u0080N'.*e³\u001bÉmE²%?/º\u0083w.Ï§\u0088Û\b\u0096«ÐE°òx§:pÃ\u0013 ø`òê\u0082?^qÓÍ\n3\u0086Î¢\"¿1;q[Ô\u0092y\u0000PX\u008bg\u001f2ä(\u0018j.SþÒ\u009fH©¢\u00ad¦paÁd\u0016¶%t-æ~ÄøØü\u0003;T\u0091\u0001\u000eùr²æ`<Ë(34Z/\rãf)Õ8ÉzºDÛ\u009cp\u000e2L\u0084\u008fÍ$[Gã.a\u0082\u0010\u000e\u009c\"Ý1\u0099·WT\u0018\b1BwÎ±e2=P\u008d\u001e¼Ï7x\u009c³H®¶ª\u0084½(4#\u0082\u009e*\u0081\u00ad}\u0083o\u0097\u0088\u008f\u0089;{j\u0085.\u001edì\u001c\u0000ÿ\u001cé\u0089¥¬DD\u0003#\u0018\u009bj\u0095ò/ 6¶O´õ(\u008d\u0012D\u007f%×vo\u0005îi¹\u0002'9[\u0099Â®ì×Àû`qÀ\u0010mÚe&\u00179ø¤Ú\u00050BÚ×rþ\u0018;æ\u0099\u0003¬¤\u0087ÉmñF,`v\u0091ÏÕ«\u0098!ëÍª-(½±\u007f\u009a\u008eïÎ4\u0090³\u008d~\u008d,-íûÏP²¬(\u0094!·ò\u0014\u009bº¯\u0098å/ÒÑ+¹\u0085ÿo8Ô\u0005\fÏ\u0007Ýo\ní9áÔË=Ãbã\u0013HXý`\u0085S¶°\u0013\u000eè\u0086\u0098£\u0093£§\u0001ús\"j#ÔÞ\u0085r\u0005Þó&rþ\u0084WÜ*j(Le\b»ÃU,ó\u00807_8yÌ\u009cú\u0005ÑÊ\u0000ýâÊ²\u0006\u008d\u0090ê9®}\"u\u009c\u008bÃè\u008co;@2>©%\t\u00adb\u0013:ÉF\u009b¸k\u0096W\u0019í\u0092¹±Ð$LÍH;Ù¨èXø\u009a\u0001pí7ÆRëZ-\u008e(\u0080õIØ7?/%â\u0019\u001f\n¥\u0006\u0099ð'Ðkú8ù%r\u000fO*û³$ú¾ãÍ\u000e¥ã.\u0017<Õ\bíôPÙÃð+÷:\u0081\u0081³Û\u0014\u0004ä4s\"Þ£tº\u0019¡SÖqþ\u0012\u0006\u008aÿL\u0096 ¯¿o-¼h÷\u009e\u0085\u0099\u0001\u0085\u00152Ã´ú\u008dN\f¨wÿ'T5¡QÈ\u000b`ë\u0010ê\u001fEñ=ýÑjÎ°ôòÖ¿¯\u0098(\u0016ÓY 9ô\u0084²\u009e¼«¤\u0080\u000f¿\u000eÝDMk\u0087\u0013Q¤3ì9\r1póÆ!´ì7\\±{b\u0010\u008b¶\u0001ü=ç<J\u0006@e\u009bD\u0004»¤(Á'¨¾Ôá +[]ÿÂlty_\u0090vq\u0000Ý\u001a4\u009b|ë¢\u0013\"Î[bbÏå¢ãSpÔ0eá\u0085²\n\u00ad\u0002wàëÖHûHbw\u0088Á$QúÂ9\u000fqØp,\u001dL¶ô\u0017\u008abmOè¯ù\u0001tâ\u001fV³ü\u00848¢c\u008b\u001e Õ\u0015I\u0098\u0018ó¼ºú°<`UÞ\u001bä&\u0007&\u0090\u008cÚûíTÚ\u0004j\u0002¼\u0090×\u0016®£\u0086ß\u00038\u0097 hÄ}zl\u0013Ô\u001a\u0010Â8\u001aÇXCiWË\u0085÷N?\u0082\r?ïMëË\u001fÈKñh5Ýó6¹ÚoÁè\u001c\u008cöq'¾\u0081u!\u0007w\t\u007f>f\u001a \u009c\u0017ü\u0086ÑX!8NYs8@ÀY ä\u0086  \u0097\u001a=\u009bÃ R\u0000¨Ø\nê\u009fâA\u0080ql\u0081èvÎ^·XÒy\u0091íÅ\u0003³A\u008d\u007f'\u0007ýú3\u0014=\u001ch8u\u0086\u008f½\\Wåø/u.Þ\u0080^lgê\råFBÈÚ\fâ6B\u008eT\u0019\u0085u\u0086×\u007f\u008e©\u000496½H\\~\"\u0018ù¾\u009câ4ÞCó7ì\u0010 Ê|\u0016ûjù¯U\u0017\u008f\u0085³ôy\u008e\u0018&a\u0090c¯î\u009a´t¼\t\fK1®cx;\u0091u$FCº\u0010%Ù¾P\u009fÌ\u0080\u008fN\b²Þ\u0098ÃH\u0015 Üþ\u0011ë\u0012ÏíÐpÅ/~\u0010ä÷¥^\u0003ö³\u001b\f[sB2ó½|µIl(\u0084\u0082\u009fÑëÕûV}\u007flå#_r\u0099¢\t$\u0001HN/ù¿Ý\rB\u007f\u0014Ißo\u0018\u0096\u0081OYiù(3íÆê\u0017½røáÖ\r\f\u0013ñ\u0001½\u009d0X\u0084Â²i;}\u009bâ6m'ÔÎ\\¤¡¹ÖßsÀ(;JvÛ6\fÓ/òH[ù@ á\u000f#SJí\u0095\u009f++o\u008bÑL¨Ða)\u0004¼@dÎS$ (fr(ÄlKÁ]ò£V#ÛHPlÂ¹O¼1Ã-É=\u0099\u0012\u0094\u0007ÚNÚx«\u0005<\u008f\u0016\u001f\u00168B!\u0096\u0003ÝMN\u0004\u0094\u0083Liß'\u001f¹Â+\u009a\u0091t¡\u0080V{rÃç%Ì\u0005\u00ad\u0006Å*¸ø\u008d\u00adåéê\nåÏfå^$W\u0000a6\u000e\u0086þ0e'¶Ø\u0093Ik\u0012«eÿ\u0097Ù\u000ekR_®\u0090\u001f\u009a!\u001bq\u001c¢»\u001e+îÜw\u0006£{±X¼[\u0018Jä\u0083p«[ÐS Üé\u009eìã^Bí<½BG\u001aõ\u0084a@ËO9Ý\u0001=hûØ¬\u008d\u0003\u008eæm(p²@ µ¶G\u0016\u001aób\u000f\t6yBh \bú\bN\u001b\u008aºçÍÊ$\u0003Ì\u000f\u0088§ô´YÇ9\u008b\u0010\u0092´ÅÞWd\u0003wH[\u000f\u0088)¨ \u00058\u000b\u008b¢\u0018\u001d½éÚæ=ßl²\u0090æû\u008b¬ð&\u0003Ñ¿a%\f¹@qÐÀØR¨\u00930L{L¬~P\u0002+ºc¬NEÌÀÁ<òRè\u0010\u009b\u0010\u0005´LXEß¤o®\u009e×ªÉ¡(ÉGD8\u00024\\\u0011³\n0?\u008c\u001d\u00181z\u001fp¶~\u009b\u0019\u0082ÏÕøK¾G\u0092¨\u0089Ç\u009f\u0007»\u0082cñ\u0010\u0092\u000bY«õy\u0019\u0086Wò\u001dPp\u0003ë&\u0010 Ëh2K£¬½\u009cí®òÜ\u0097\u0083\u001e\u0018\u0014·\u0016\u001f¸¤%·\u0095-\u0092\u009a\u0096\u008ew\u0091\u001eû\u0091ù86ûí\u0010aßD\u0093µhÞDð~V®\u0087Ñ§5\u0010\u001fäs½\u0005¿\rt\u0085;à}¸Ù0Ü 4èjÔØ`¯)`+é*ÒþâU¡\u0093Í\u0096=qþ^¢ø£úê¨ä\b\u0010í¯±EKs\u001f\u0002>B'\u00adï©Úð(¨Q\u0089\u0015\u0086\u008bÃ\u0004\u009c¦³4\u00ad ±\t\u0088\u0088¡ñíë\u009b\u0094\u000f£\u0087«\n\u0013r íoÞÀ¥E\u0015å\u0010/9.TrCÈW>&\u0004~Á\u008c , Ä\u0081(Ð@Â\u0016¸7ñòbþ\u00148\u001ea\u0095\b\u0017`\t3\nrÊïQ¬\u0019¹\u0097(©Ý\u000b\u0096É½o'\u009a6é\u009dÓðu\u00035\u001c<\u0098lÈºãä\u008aCµêb\u0011C\u001bFÝ\u0098\u0016ýë\u0012\u0010Ñü¦Öµ\u0005\u0089¸öb+\u007f´ar (\u0010\"\u008eø¡/äZ<fiÅÞ4òç|y\u001d\u0006\u0092ZºgÐ»m/\u001c\u0088äC=\u001dóGô7Ò(\u0018\u0081¬@vn¿ubh·1C\u008bÌd\u0015´#ëÙ<9ËG(\u009d\u0012ÚeõK\u00ad\u0004Ëï7ÔÚ\u008c\\¤\u0005E\u000e7\u0080\u0099\u00062ÀÞ#.\u008a\b²\u0089@\u0091ÁãEê.Ê0\u009a\u0002T\u0006b\u0007\u000b4Þ÷¬67uÖeÄ©QÎPB;\u008f\u0090Âa\u0013r\u0000\u001f\u009aVt(4Oo\u00996=MRa°w\u008bò0\\\u008d\u0013ÇÞp³tù/f×\u0016u\\²Î¨vÏ\u009762\u0018¤ñ\u0018uýSÏÝ\u001f\u0093\u0087ÿÇ#c\u009bW\b@D&¬0Ø RÉÀ\u0010<äÿ\u001c±O\u000b¹¸-è!Ì?\u009b¢¬N5¸áùVó¼ÃA\u008d0Á\u008b\u008dë\u0092ÀµD¥J\u0097É#\u0094\u0090b\u007fsþX\u008bvz\u0011\u0093\f\u0005\u008eWðd\u0011à¨¬\u008f\u001b-ãéx\u009f\u0098ÇÅ\u008b\u001dE"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[89];
                     bvl = LogManager.getLogger();
                     fa2 = new gdz(a<"n">(18844, 7236841163103102240L ^ var9));
                     wub = new gdz(a<"n">(28076, 9097288034097053982L ^ var9));
                     aut = new gdz[]{
                        new gdz(a<"n">(28092, 3747776291791749431L ^ var9)),
                        new gdz(a<"n">(9958, 5853982363115588179L ^ var9)),
                        new gdz(a<"n">(1161, 5344523694608623672L ^ var9)),
                        new gdz(a<"n">(13377, 7969246610551150801L ^ var9)),
                        new gdz(a<"n">(29182, 7163952427042200927L ^ var9)),
                        new gdz(a<"n">(30794, 3760780183377368311L ^ var9)),
                        new gdz(a<"n">(10107, 476315258408766429L ^ var9)),
                        new gdz(a<"n">(22519, 8743358463148522308L ^ var9)),
                        new gdz(a<"n">(4637, 2104807619956653708L ^ var9)),
                        new gdz(a<"n">(14389, 8587982459076416658L ^ var9)),
                        new gdz(a<"n">(19631, 4210050758066823266L ^ var9)),
                        new gdz(a<"n">(16071, 8078875641517314568L ^ var9)),
                        new gdz(a<"n">(31962, 3488994357130219592L ^ var9)),
                        new gdz(a<"n">(18023, 3766963435326237438L ^ var9)),
                        new gdz(a<"n">(31116, 4741425394033808698L ^ var9)),
                        new gdz(a<"n">(12764, 8000506011250531659L ^ var9)),
                        new gdz(a<"n">(9885, 2827117943794436626L ^ var9)),
                        new gdz(a<"n">(16329, 6370953086313337623L ^ var9)),
                        new gdz(a<"n">(28514, 4790673751951197142L ^ var9)),
                        new gdz(a<"n">(10792, 2387504748879316670L ^ var9)),
                        new gdz(a<"n">(928, 3732277962516901655L ^ var9)),
                        new gdz(a<"n">(30958, 5200015376568996969L ^ var9)),
                        new gdz(a<"n">(1723, 6591714817422731827L ^ var9)),
                        new gdz(a<"n">(2851, 8090013633753982907L ^ var9))
                     };
                     rrx = aut.length;
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

                  var4 = "m=L¿²\f\u0019\u0014cWEï\u001c\u0000jÏ\u001d\u0091/ñ!\u0010.\u008fd¡ý_'Z¡!0\u00adu\f\u0087oýµÖo3b+n\u0012\u009bè/ól^õ\u0014¼¾øîPèÃ`®{G§\u001aYÓû®¾f|ë[u¬\u0094$";
                  var6 = "m=L¿²\f\u0019\u0014cWEï\u001c\u0000jÏ\u001d\u0091/ñ!\u0010.\u008fd¡ý_'Z¡!0\u00adu\f\u0087oýµÖo3b+n\u0012\u009bè/ól^õ\u0014¼¾øîPèÃ`®{G§\u001aYÓû®¾f|ë[u¬\u0094$"
                     .length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30829;
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
            throw new RuntimeException("v3i", var10);
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
         throw new RuntimeException("v3i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
