import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AuraEngineAAC extends SubEngine {
   private static Entity iw2;
   public List oyv;
   private Timer tib;
   private Timer v_r;
   private int j2g;
   private float mbo;
   private float lvb;
   private float ha0;
   private float krz;
   private boolean fuv;
   private float _zh;
   private boolean nrr;
   private int w3_;
   private Timer kb0;
   private int _ea;
   private PlayerUpdateEvent oec;
   private boolean s74;
   private int ir7;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public AuraEngineAAC() {
      long var1 = a ^ 44208437655488L;
      super(a<"f">(21341, 3792218749095520481L ^ var1), a<"f">(19792, 6052411624512239343L ^ var1));
      this.oyv = new ArrayList();
      this.tib = new Timer();
      this.v_r = new Timer();
      this.kb0 = new Timer();
   }

   @Override
   public void onUpdate() {
      long var1 = a ^ 85309660143230L;
      super.onUpdate();
      this.ha0 = this.wyl.vg8.y2i;
      this.lvb = this.wyl.vg8.x5k;
      this.krz = 0.0F;
      this._zh = 0.0F;
      this.nrr = false;
      this.fuv = false;
      this.v6z();
      this.fyu();
      ncl.dob(syo.aez + a<"f">(29538, 8716805111747174753L ^ var1) + syo.rl1 + a<"f">(9696, 3889171154584352740L ^ var1));
   }

   @Override
   public void onRender() {
      super.onRender();
      iw2 = null;
   }

   @EventHandler
   public void yzl(TickEvent param1) {
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
      // 05: getfield AuraEngineAAC.kb0 Lnhs;
      // 08: iload 2
      // 09: ifne 3f
      // 0c: aload 0
      // 0d: getfield AuraEngineAAC._ea I
      // 10: i2d
      // 11: invokevirtual Timer.yrv (D)Z
      // 14: ifeq 42
      // 17: goto 1e
      // 1a: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: bipush 10
      // 21: new java/util/Random
      // 24: dup
      // 25: invokespecial java/util/Random.<init> ()V
      // 28: bipush 3
      // 29: invokevirtual java/util/Random.nextInt (I)I
      // 2c: iadd
      // 2d: putfield AuraEngineAAC.w3_ I
      // 30: aload 0
      // 31: invokespecial AuraEngineAAC.fyu ()V
      // 34: aload 0
      // 35: getfield AuraEngineAAC.kb0 Lnhs;
      // 38: goto 3f
      // 3b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 3e: athrow
      // 3f: invokevirtual Timer.zay ()V
      // 42: return
   }

   @EventHandler
   public void _ut(Event var1) {
      long var2 = a ^ 137236732685406L;

      try {
         if (KillAura.sy_.getValue()) {
            this.setActive(false);
            zet.gn0(a<"f">(24981, 7721351986812961200L ^ var2), this.getName() + a<"f">(23759, 8427269028066721007L ^ var2), jgv$vro.h_d);
         }
      } catch (oov var4) {
         throw a(var4);
      }
   }

   @EventHandler
   public void fv5(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aconst_null
      // 002: putfield AuraEngineAAC.oec Lfz2;
      // 005: invokestatic OpaquePredicate.b ()I
      // 008: aload 0
      // 009: aload 0
      // 00a: invokespecial AuraEngineAAC.fbs ()Ljava/util/List;
      // 00d: putfield AuraEngineAAC.oyv Ljava/util/List;
      // 010: istore 2
      // 011: aload 1
      // 012: invokevirtual PlayerUpdateEvent.lhw ()Z
      // 015: iload 2
      // 016: ifeq 02c
      // 019: ifeq 024
      // 01c: goto 023
      // 01f: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 022: athrow
      // 023: return
      // 024: aload 0
      // 025: getstatic AuraEngineAAC.iw2 Lg_3;
      // 028: bipush 0
      // 029: invokevirtual AuraEngineAAC.fje (Lg_3;Z)Z
      // 02c: iload 2
      // 02d: ifeq 059
      // 030: ifne 046
      // 033: goto 03a
      // 036: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 0
      // 03b: bipush 0
      // 03c: invokespecial AuraEngineAAC.in0 (Z)V
      // 03f: goto 046
      // 042: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: iload 2
      // 048: ifeq 07e
      // 04b: getstatic AuraEngineAAC.iw2 Lg_3;
      // 04e: bipush 0
      // 04f: invokevirtual AuraEngineAAC.fje (Lg_3;Z)Z
      // 052: goto 059
      // 055: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 058: athrow
      // 059: ifne 07d
      // 05c: aload 0
      // 05d: aload 0
      // 05e: getfield AuraEngineAAC.wyl Lc05;
      // 061: getfield Minecraft.vg8 Ll86;
      // 064: getfield EntityPlayerSP.x5k F
      // 067: putfield AuraEngineAAC.lvb F
      // 06a: aload 0
      // 06b: aload 0
      // 06c: getfield AuraEngineAAC.wyl Lc05;
      // 06f: getfield Minecraft.vg8 Ll86;
      // 072: getfield EntityPlayerSP.y2i F
      // 075: putfield AuraEngineAAC.ha0 F
      // 078: return
      // 079: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 0
      // 07e: iload 2
      // 07f: ifeq 0f1
      // 082: bipush 0
      // 083: invokespecial AuraEngineAAC.ecc (Z)Lg_3;
      // 086: getstatic AuraEngineAAC.iw2 Lg_3;
      // 089: if_acmpeq 0e0
      // 08c: goto 093
      // 08f: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: aload 0
      // 095: getfield AuraEngineAAC.lvb F
      // 098: getstatic AuraEngineAAC.iw2 Lg_3;
      // 09b: invokespecial AuraEngineAAC.ea5 (FLi2h;)F
      // 09e: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0a1: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 0a4: aload 0
      // 0a5: getstatic AuraEngineAAC.iw2 Lg_3;
      // 0a8: ldc 10.0
      // 0aa: nop
      // 0ab: aload 0
      // 0ac: aload 0
      // 0ad: getfield AuraEngineAAC.lvb F
      // 0b0: getstatic AuraEngineAAC.iw2 Lg_3;
      // 0b3: invokespecial AuraEngineAAC.ea5 (FLi2h;)F
      // 0b6: ldc 0.8
      // 0b8: nop
      // 0b9: fmul
      // 0ba: invokestatic java/lang/Math.max (FF)F
      // 0bd: bipush 10
      // 0bf: new java/util/Random
      // 0c2: dup
      // 0c3: invokespecial java/util/Random.<init> ()V
      // 0c6: bipush 30
      // 0c8: invokevirtual java/util/Random.nextInt (I)I
      // 0cb: iadd
      // 0cc: i2f
      // 0cd: bipush 0
      // 0ce: invokespecial AuraEngineAAC.cwq (Li2h;FFZ)[F
      // 0d1: astore 3
      // 0d2: aload 0
      // 0d3: aload 3
      // 0d4: bipush 0
      // 0d5: faload
      // 0d6: putfield AuraEngineAAC.lvb F
      // 0d9: aload 0
      // 0da: aload 3
      // 0db: bipush 1
      // 0dc: faload
      // 0dd: putfield AuraEngineAAC.ha0 F
      // 0e0: aload 1
      // 0e1: aload 0
      // 0e2: getfield AuraEngineAAC.lvb F
      // 0e5: invokevirtual PlayerUpdateEvent.h8j (F)V
      // 0e8: aload 1
      // 0e9: aload 0
      // 0ea: getfield AuraEngineAAC.ha0 F
      // 0ed: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 0f0: aload 0
      // 0f1: getfield AuraEngineAAC.krz F
      // 0f4: ldc 6.0
      // 0f6: nop
      // 0f7: fcmpl
      // 0f8: iload 2
      // 0f9: ifeq 133
      // 0fc: ifle 12b
      // 0ff: goto 106
      // 102: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield AuraEngineAAC.fuv Z
      // 10a: iload 2
      // 10b: ifeq 133
      // 10e: goto 115
      // 111: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 114: athrow
      // 115: ifeq 12b
      // 118: goto 11f
      // 11b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 0
      // 120: bipush 0
      // 121: putfield AuraEngineAAC.fuv Z
      // 124: goto 12b
      // 127: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 12a: athrow
      // 12b: aload 0
      // 12c: getfield AuraEngineAAC.krz F
      // 12f: ldc -6.0
      // 131: nop
      // 132: fcmpg
      // 133: iload 2
      // 134: ifeq 16e
      // 137: ifge 166
      // 13a: goto 141
      // 13d: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 0
      // 142: getfield AuraEngineAAC.fuv Z
      // 145: iload 2
      // 146: ifeq 16e
      // 149: goto 150
      // 14c: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 14f: athrow
      // 150: ifne 166
      // 153: goto 15a
      // 156: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 0
      // 15b: bipush 1
      // 15c: putfield AuraEngineAAC.fuv Z
      // 15f: goto 166
      // 162: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 165: athrow
      // 166: aload 0
      // 167: getfield AuraEngineAAC._zh F
      // 16a: ldc 3.0
      // 16c: nop
      // 16d: fcmpl
      // 16e: iload 2
      // 16f: ifeq 1b4
      // 172: ifle 1a1
      // 175: goto 17c
      // 178: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 17b: athrow
      // 17c: aload 0
      // 17d: getfield AuraEngineAAC.nrr Z
      // 180: iload 2
      // 181: ifeq 1b4
      // 184: goto 18b
      // 187: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 18a: athrow
      // 18b: ifeq 1a1
      // 18e: goto 195
      // 191: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 194: athrow
      // 195: aload 0
      // 196: bipush 0
      // 197: putfield AuraEngineAAC.nrr Z
      // 19a: goto 1a1
      // 19d: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: iload 2
      // 1a3: ifeq 1dd
      // 1a6: getfield AuraEngineAAC._zh F
      // 1a9: ldc -3.0
      // 1ab: nop
      // 1ac: fcmpg
      // 1ad: goto 1b4
      // 1b0: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: ifge 1dc
      // 1b7: aload 0
      // 1b8: iload 2
      // 1b9: ifeq 1dd
      // 1bc: goto 1c3
      // 1bf: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: getfield AuraEngineAAC.nrr Z
      // 1c6: ifne 1dc
      // 1c9: goto 1d0
      // 1cc: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: bipush 1
      // 1d2: putfield AuraEngineAAC.nrr Z
      // 1d5: goto 1dc
      // 1d8: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: dup
      // 1de: getfield AuraEngineAAC.krz F
      // 1e1: aload 0
      // 1e2: getfield AuraEngineAAC.fuv Z
      // 1e5: ifeq 1f0
      // 1e8: fconst_1
      // 1e9: goto 1f3
      // 1ec: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: ldc -1.0
      // 1f2: nop
      // 1f3: fadd
      // 1f4: putfield AuraEngineAAC.krz F
      // 1f7: aload 0
      // 1f8: dup
      // 1f9: getfield AuraEngineAAC._zh F
      // 1fc: aload 0
      // 1fd: getfield AuraEngineAAC.nrr Z
      // 200: ifeq 20b
      // 203: fconst_1
      // 204: goto 20e
      // 207: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 20a: athrow
      // 20b: ldc -1.0
      // 20d: nop
      // 20e: fadd
      // 20f: putfield AuraEngineAAC._zh F
      // 212: aload 0
      // 213: iload 2
      // 214: ifeq 24a
      // 217: bipush 0
      // 218: invokespecial AuraEngineAAC.ecc (Z)Lg_3;
      // 21b: getstatic AuraEngineAAC.iw2 Lg_3;
      // 21e: if_acmpne 249
      // 221: goto 228
      // 224: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 227: athrow
      // 228: aload 1
      // 229: aload 0
      // 22a: getfield AuraEngineAAC.ha0 F
      // 22d: aload 0
      // 22e: getfield AuraEngineAAC.krz F
      // 231: fadd
      // 232: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 235: aload 1
      // 236: aload 0
      // 237: getfield AuraEngineAAC.lvb F
      // 23a: aload 0
      // 23b: getfield AuraEngineAAC._zh F
      // 23e: fadd
      // 23f: invokevirtual PlayerUpdateEvent.h8j (F)V
      // 242: goto 249
      // 245: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 248: athrow
      // 249: aload 0
      // 24a: aload 1
      // 24b: putfield AuraEngineAAC.oec Lfz2;
      // 24e: return
   }

   private float ea5(float param1, EntityLivingBase param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokestatic omb.ndg (Li2h;)[F
      // 08: bipush 0
      // 09: faload
      // 0a: fload 1
      // 0b: fsub
      // 0c: invokestatic java/lang/Math.abs (F)F
      // 0f: ldc 360.0
      // 11: nop
      // 12: frem
      // 13: ldc 180.0
      // 15: nop
      // 16: iload 3
      // 17: ifne 4d
      // 1a: fcmpl
      // 1b: ifle 3f
      // 1e: goto 25
      // 21: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 24: athrow
      // 25: ldc 360.0
      // 27: nop
      // 28: aload 2
      // 29: invokestatic omb.ndg (Li2h;)[F
      // 2c: bipush 0
      // 2d: faload
      // 2e: fload 1
      // 2f: fsub
      // 30: invokestatic java/lang/Math.abs (F)F
      // 33: ldc 360.0
      // 35: nop
      // 36: frem
      // 37: fsub
      // 38: goto 4e
      // 3b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 2
      // 40: invokestatic omb.ndg (Li2h;)[F
      // 43: bipush 0
      // 44: faload
      // 45: fload 1
      // 46: fsub
      // 47: invokestatic java/lang/Math.abs (F)F
      // 4a: ldc 360.0
      // 4c: nop
      // 4d: frem
      // 4e: freturn
   }

   private Entity ecc(boolean var1) {
      hpk var3 = new hpk(this.wyl.tij, this.wyl.vg8.x6l());
      float var4 = this.wyl.nsd().x5k;
      float var5 = this.wyl.nsd().y2i;
      this.wyl.nsd().x5k = this.lvb;
      int var10000 = OpaquePredicate.c();
      this.wyl.nsd().y2i = this.ha0;
      int var2 = var10000;

      hpk var10001;
      float var10002;
      double var10003;
      akm var10004;
      try {
         var3.oyu(this.wyl.nsd());
         var3.nyk(this.wyl.nsd());
         this.wyl.nsd().y2i = var5;
         this.wyl.nsd().x5k = var4;
         var7 = this;
         var10001 = var3;
         var10002 = 1.0F;
         var10003 = 4.0;
         var10004 = var3.mcz(4.0, 1.0F);
         if (var2 != 0) {
            return this.ci8(var3, 1.0F, 4.0, var10004, var1);
         }

         if (!var1) {
            return this.ci8(var3, 1.0F, 4.0, var10004, true);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return var7.ci8(var10001, var10002, var10003, var10004, false);
   }

   private Entity ci8(EntityLivingBase param1, float param2, double param3, akm param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 8
      // 003: aload 1
      // 004: fload 2
      // 005: invokevirtual EntityLivingBase.tib (F)Lfqr;
      // 008: astore 9
      // 00a: invokestatic OpaquePredicate.c ()I
      // 00d: aload 1
      // 00e: fload 2
      // 00f: invokevirtual EntityLivingBase.wej (F)Lfqr;
      // 012: astore 10
      // 014: aload 9
      // 016: aload 10
      // 018: getfield fqr.lvi D
      // 01b: dload 3
      // 01c: dmul
      // 01d: aload 10
      // 01f: getfield fqr.gn5 D
      // 022: dload 3
      // 023: dmul
      // 024: aload 10
      // 026: getfield fqr.bn2 D
      // 029: dload 3
      // 02a: dmul
      // 02b: invokevirtual fqr.r2x (DDD)Lfqr;
      // 02e: astore 11
      // 030: fconst_1
      // 031: fstore 12
      // 033: istore 7
      // 035: aload 0
      // 036: getfield AuraEngineAAC.wyl Lc05;
      // 039: getfield Minecraft.tij Lkh3;
      // 03c: aload 1
      // 03d: aload 1
      // 03e: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 041: aload 10
      // 043: getfield fqr.lvi D
      // 046: dload 3
      // 047: dmul
      // 048: aload 10
      // 04a: getfield fqr.gn5 D
      // 04d: dload 3
      // 04e: dmul
      // 04f: aload 10
      // 051: getfield fqr.bn2 D
      // 054: dload 3
      // 055: dmul
      // 056: invokevirtual nh4.z9h (DDD)Lnh4;
      // 059: fload 12
      // 05b: f2d
      // 05c: fload 12
      // 05e: f2d
      // 05f: fload 12
      // 061: f2d
      // 062: invokevirtual nh4.c2h (DDD)Lnh4;
      // 065: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 068: new qve
      // 06b: dup
      // 06c: aload 0
      // 06d: getfield AuraEngineAAC.wyl Lc05;
      // 070: getfield Minecraft.x0p Lv3i;
      // 073: invokespecial qve.<init> (Lv3i;)V
      // 076: invokestatic com/google/common/base/Predicates.and (Lcom/google/common/base/Predicate;Lcom/google/common/base/Predicate;)Lcom/google/common/base/Predicate;
      // 079: invokevirtual WorldClient.sr2 (Li2h;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 07c: astore 13
      // 07e: aload 5
      // 080: iload 7
      // 082: ifne 091
      // 085: ifnull 09c
      // 088: goto 08f
      // 08b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 5
      // 091: getfield akm.jhn Lfqr;
      // 094: aload 9
      // 096: invokevirtual fqr.b4d (Lfqr;)D
      // 099: goto 09d
      // 09c: dload 3
      // 09d: dstore 14
      // 09f: bipush 0
      // 0a0: istore 16
      // 0a2: iload 16
      // 0a4: aload 13
      // 0a6: invokeinterface java/util/List.size ()I 1
      // 0ab: if_icmpge 1cf
      // 0ae: aload 13
      // 0b0: iload 16
      // 0b2: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0b7: checkcast EntityLivingBase
      // 0ba: astore 17
      // 0bc: aload 17
      // 0be: iload 7
      // 0c0: ifne 1d1
      // 0c3: aload 0
      // 0c4: getfield AuraEngineAAC.wyl Lc05;
      // 0c7: getfield Minecraft.vg8 Ll86;
      // 0ca: if_acmpne 0db
      // 0cd: goto 0d4
      // 0d0: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: goto 1c7
      // 0d7: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0da: athrow
      // 0db: iload 6
      // 0dd: ifeq 0ea
      // 0e0: ldc -0.1
      // 0e2: nop
      // 0e3: goto 0ef
      // 0e6: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 17
      // 0ec: invokevirtual EntityLivingBase.npl ()F
      // 0ef: fstore 18
      // 0f1: aload 17
      // 0f3: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 0f6: fload 18
      // 0f8: f2d
      // 0f9: fload 18
      // 0fb: f2d
      // 0fc: fload 18
      // 0fe: f2d
      // 0ff: invokevirtual nh4.c2h (DDD)Lnh4;
      // 102: astore 19
      // 104: aload 19
      // 106: aload 9
      // 108: aload 11
      // 10a: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 10d: astore 20
      // 10f: aload 19
      // 111: aload 9
      // 113: invokevirtual nh4.fd8 (Lfqr;)Z
      // 116: iload 7
      // 118: ifne 13c
      // 11b: ifeq 14b
      // 11e: goto 125
      // 121: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 124: athrow
      // 125: dload 14
      // 127: iload 7
      // 129: ifne 144
      // 12c: goto 133
      // 12f: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 132: athrow
      // 133: dconst_0
      // 134: dcmpl
      // 135: goto 13c
      // 138: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 13b: athrow
      // 13c: iflt 1c7
      // 13f: aload 17
      // 141: astore 8
      // 143: dconst_0
      // 144: dstore 14
      // 146: iload 7
      // 148: ifeq 1c7
      // 14b: aload 20
      // 14d: ifnull 1c7
      // 150: goto 157
      // 153: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 156: athrow
      // 157: aload 9
      // 159: aload 20
      // 15b: getfield akm.jhn Lfqr;
      // 15e: invokevirtual fqr.b4d (Lfqr;)D
      // 161: dstore 21
      // 163: dload 21
      // 165: dload 14
      // 167: dcmpg
      // 168: iload 7
      // 16a: ifne 182
      // 16d: iflt 185
      // 170: goto 177
      // 173: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 176: athrow
      // 177: dload 14
      // 179: dconst_0
      // 17a: dcmpl
      // 17b: goto 182
      // 17e: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 181: athrow
      // 182: ifne 1c7
      // 185: aload 17
      // 187: iload 7
      // 189: ifne 1c1
      // 18c: goto 193
      // 18f: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 192: athrow
      // 193: aload 1
      // 194: getfield EntityLivingBase.hzp Li2h;
      // 197: if_acmpne 1b8
      // 19a: goto 1a1
      // 19d: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: dload 14
      // 1a3: dconst_0
      // 1a4: dcmpl
      // 1a5: ifne 1c7
      // 1a8: goto 1af
      // 1ab: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 17
      // 1b1: astore 8
      // 1b3: iload 7
      // 1b5: ifeq 1c7
      // 1b8: aload 17
      // 1ba: goto 1c1
      // 1bd: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: astore 8
      // 1c3: dload 21
      // 1c5: dstore 14
      // 1c7: iinc 16 1
      // 1ca: iload 7
      // 1cc: ifeq 0a2
      // 1cf: aload 8
      // 1d1: checkcast Entity
      // 1d4: areturn
   }

   private float[] cwq(EntityLivingBase param1, float param2, float param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield EntityLivingBase.o2v D
      // 004: aload 0
      // 005: getfield AuraEngineAAC.wyl Lc05;
      // 008: getfield Minecraft.vg8 Ll86;
      // 00b: getfield EntityPlayerSP.o2v D
      // 00e: dsub
      // 00f: dstore 6
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 1
      // 015: getfield EntityLivingBase.vbd D
      // 018: aload 0
      // 019: getfield AuraEngineAAC.wyl Lc05;
      // 01c: getfield Minecraft.vg8 Ll86;
      // 01f: getfield EntityPlayerSP.vbd D
      // 022: dsub
      // 023: dstore 8
      // 025: istore 5
      // 027: aload 1
      // 028: iload 5
      // 02a: ifeq 072
      // 02d: instanceof Entity
      // 030: ifeq 06a
      // 033: goto 03a
      // 036: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 039: athrow
      // 03a: aload 1
      // 03b: checkcast Entity
      // 03e: astore 12
      // 040: aload 12
      // 042: getfield Entity.kfp D
      // 045: aload 12
      // 047: invokevirtual Entity.c5y ()F
      // 04a: f2d
      // 04b: dadd
      // 04c: aload 0
      // 04d: getfield AuraEngineAAC.wyl Lc05;
      // 050: getfield Minecraft.vg8 Ll86;
      // 053: getfield EntityPlayerSP.kfp D
      // 056: aload 0
      // 057: getfield AuraEngineAAC.wyl Lc05;
      // 05a: getfield Minecraft.vg8 Ll86;
      // 05d: invokevirtual EntityPlayerSP.c5y ()F
      // 060: f2d
      // 061: dadd
      // 062: dsub
      // 063: dstore 10
      // 065: iload 5
      // 067: ifne 09d
      // 06a: aload 1
      // 06b: goto 072
      // 06e: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 071: athrow
      // 072: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 075: getfield nh4.bx_ D
      // 078: aload 1
      // 079: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 07c: getfield nh4.i2c D
      // 07f: dadd
      // 080: ldc2_w 2.0
      // 083: ddiv
      // 084: aload 0
      // 085: getfield AuraEngineAAC.wyl Lc05;
      // 088: getfield Minecraft.vg8 Ll86;
      // 08b: getfield EntityPlayerSP.kfp D
      // 08e: aload 0
      // 08f: getfield AuraEngineAAC.wyl Lc05;
      // 092: getfield Minecraft.vg8 Ll86;
      // 095: invokevirtual EntityPlayerSP.c5y ()F
      // 098: f2d
      // 099: dadd
      // 09a: dsub
      // 09b: dstore 10
      // 09d: new java/util/Random
      // 0a0: dup
      // 0a1: invokespecial java/util/Random.<init> ()V
      // 0a4: astore 12
      // 0a6: iload 4
      // 0a8: iload 5
      // 0aa: ifeq 0c5
      // 0ad: ifeq 0d1
      // 0b0: goto 0b7
      // 0b3: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 12
      // 0b9: bipush 15
      // 0bb: invokevirtual java/util/Random.nextInt (I)I
      // 0be: goto 0c5
      // 0c1: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: i2f
      // 0c6: ldc 0.25
      // 0c8: nop
      // 0c9: fmul
      // 0ca: ldc 5.0
      // 0cc: nop
      // 0cd: fadd
      // 0ce: goto 0d2
      // 0d1: fconst_0
      // 0d2: fstore 13
      // 0d4: dload 6
      // 0d6: dload 6
      // 0d8: dmul
      // 0d9: dload 8
      // 0db: dload 8
      // 0dd: dmul
      // 0de: dadd
      // 0df: invokestatic fe6.dii (D)F
      // 0e2: f2d
      // 0e3: dstore 14
      // 0e5: dload 8
      // 0e7: fload 13
      // 0e9: f2d
      // 0ea: dadd
      // 0eb: dload 6
      // 0ed: invokestatic java/lang/Math.atan2 (DD)D
      // 0f0: ldc2_w 180.0
      // 0f3: dmul
      // 0f4: ldc2_w 3.141592653589793
      // 0f7: ddiv
      // 0f8: d2f
      // 0f9: ldc 90.0
      // 0fb: nop
      // 0fc: fsub
      // 0fd: fstore 16
      // 0ff: dload 10
      // 101: aload 1
      // 102: instanceof ha9
      // 105: ifeq 112
      // 108: ldc 0.5
      // 10a: nop
      // 10b: goto 113
      // 10e: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 111: athrow
      // 112: fconst_0
      // 113: f2d
      // 114: dsub
      // 115: fload 13
      // 117: f2d
      // 118: dadd
      // 119: dload 14
      // 11b: invokestatic java/lang/Math.atan2 (DD)D
      // 11e: ldc2_w 180.0
      // 121: dmul
      // 122: ldc2_w 3.141592653589793
      // 125: ddiv
      // 126: dneg
      // 127: d2f
      // 128: fstore 17
      // 12a: aload 0
      // 12b: aload 0
      // 12c: getfield AuraEngineAAC.ha0 F
      // 12f: fload 17
      // 131: fload 3
      // 132: invokespecial AuraEngineAAC.mx1 (FFF)F
      // 135: fstore 18
      // 137: aload 0
      // 138: aload 0
      // 139: getfield AuraEngineAAC.lvb F
      // 13c: fload 16
      // 13e: fload 2
      // 13f: invokespecial AuraEngineAAC.mx1 (FFF)F
      // 142: fstore 19
      // 144: bipush 2
      // 145: newarray 6
      // 147: dup
      // 148: bipush 0
      // 149: fload 19
      // 14b: fastore
      // 14c: dup
      // 14d: bipush 1
      // 14e: fload 18
      // 150: fastore
      // 151: areturn
   }

   private float mx1(float var1, float var2, float var3) {
      int var4 = OpaquePredicate.b();
      float var5 = fe6.qsy(var2 - var1);

      int var10000;
      label34: {
         label33: {
            try {
               float var9;
               var10000 = (var9 = var5 - var3) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
               if (var4 == 0) {
                  break label34;
               }

               if (var10000 <= 0) {
                  break label33;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var5 = var3;
         }

         try {
            float var10001 = -var3;
            if (var4 == 0) {
               return var5 + var10001;
            }

            float var10;
            var10000 = (var10 = var5 - var10001) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
         } catch (oov var6) {
            throw a(var6);
         }
      }

      if (var10000 < 0) {
         var5 = -var3;
      }

      return var1 + var5;
   }

   private void in0(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield AuraEngineAAC.oyv Ljava/util/List;
      // 008: iload 2
      // 009: ifeq 021
      // 00c: ifnull 034
      // 00f: goto 016
      // 012: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield AuraEngineAAC.oyv Ljava/util/List;
      // 01a: goto 021
      // 01d: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 020: athrow
      // 021: invokeinterface java/util/List.size ()I 1
      // 026: iload 2
      // 027: ifeq 03e
      // 02a: ifne 03d
      // 02d: goto 034
      // 030: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 033: athrow
      // 034: aconst_null
      // 035: putstatic AuraEngineAAC.iw2 Lg_3;
      // 038: return
      // 039: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iload 1
      // 03e: iload 2
      // 03f: ifeq 067
      // 042: ifeq 0f3
      // 045: goto 04c
      // 048: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: getfield AuraEngineAAC.oyv Ljava/util/List;
      // 050: iload 2
      // 051: ifeq 104
      // 054: goto 05b
      // 057: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 05a: athrow
      // 05b: invokeinterface java/util/List.size ()I 1
      // 060: goto 067
      // 063: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 066: athrow
      // 067: bipush 1
      // 068: if_icmple 0f3
      // 06b: aload 0
      // 06c: iload 2
      // 06d: ifeq 0a7
      // 070: goto 077
      // 073: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 076: athrow
      // 077: getfield AuraEngineAAC.j2g I
      // 07a: aload 0
      // 07b: getfield AuraEngineAAC.oyv Ljava/util/List;
      // 07e: invokeinterface java/util/List.size ()I 1
      // 083: bipush 1
      // 084: isub
      // 085: if_icmplt 09f
      // 088: goto 08f
      // 08b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: bipush 0
      // 091: putfield AuraEngineAAC.j2g I
      // 094: iload 2
      // 095: ifne 0b0
      // 098: goto 09f
      // 09b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 0
      // 0a0: goto 0a7
      // 0a3: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: dup
      // 0a8: getfield AuraEngineAAC.j2g I
      // 0ab: bipush 1
      // 0ac: iadd
      // 0ad: putfield AuraEngineAAC.j2g I
      // 0b0: aload 0
      // 0b1: getfield AuraEngineAAC.oyv Ljava/util/List;
      // 0b4: aload 0
      // 0b5: getfield AuraEngineAAC.j2g I
      // 0b8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0bd: iload 2
      // 0be: ifeq 0e9
      // 0c1: getstatic AuraEngineAAC.iw2 Lg_3;
      // 0c4: if_acmpeq 0dc
      // 0c7: goto 0ce
      // 0ca: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield AuraEngineAAC.tib Lnhs;
      // 0d2: invokevirtual Timer.zay ()V
      // 0d5: goto 0dc
      // 0d8: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: getfield AuraEngineAAC.oyv Ljava/util/List;
      // 0e0: aload 0
      // 0e1: getfield AuraEngineAAC.j2g I
      // 0e4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0e9: checkcast Entity
      // 0ec: putstatic AuraEngineAAC.iw2 Lg_3;
      // 0ef: iload 2
      // 0f0: ifne 10a
      // 0f3: aload 0
      // 0f4: getfield AuraEngineAAC.oyv Ljava/util/List;
      // 0f7: bipush 0
      // 0f8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0fd: goto 104
      // 100: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 103: athrow
      // 104: checkcast Entity
      // 107: putstatic AuraEngineAAC.iw2 Lg_3;
      // 10a: return
   }

   private void v6z() {
      this.mbo = (float)((int)(1000.0 / (double)this.w3_) - new Random().nextInt(20));
   }

   private void fyu() {
      this._ea = 300 + new Random().nextInt(100);
   }

   @EventHandler
   public void npi(b4u param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: invokestatic v3p.eit ()Z
      // 07: iload 2
      // 08: ifne 1e
      // 0b: ifeq 16
      // 0e: goto 15
      // 11: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 14: athrow
      // 15: return
      // 16: aload 0
      // 17: getstatic AuraEngineAAC.iw2 Lg_3;
      // 1a: bipush 0
      // 1b: invokevirtual AuraEngineAAC.fje (Lg_3;Z)Z
      // 1e: iload 2
      // 1f: ifne 3f
      // 22: ifeq 42
      // 25: goto 2c
      // 28: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield AuraEngineAAC.v_r Lnhs;
      // 30: aload 0
      // 31: getfield AuraEngineAAC.mbo F
      // 34: f2d
      // 35: invokevirtual Timer.yrv (D)Z
      // 38: goto 3f
      // 3b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifne 43
      // 42: return
      // 43: invokestatic amb.p2w ()Lerg;
      // 46: invokevirtual erg.gn1 ()Lu7m;
      // 49: getstatic xbr.kru Lyab;
      // 4c: if_acmpne 54
      // 4f: return
      // 50: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: aload 0
      // 56: bipush 1
      // 57: invokespecial AuraEngineAAC.ecc (Z)Lg_3;
      // 5a: invokespecial AuraEngineAAC.tpj (Lg_3;)V
      // 5d: aload 0
      // 5e: getfield AuraEngineAAC.v_r Lnhs;
      // 61: invokevirtual Timer.zay ()V
      // 64: aload 0
      // 65: invokespecial AuraEngineAAC.v6z ()V
      // 68: aload 0
      // 69: iload 2
      // 6a: ifne 88
      // 6d: getfield AuraEngineAAC.tib Lnhs;
      // 70: ldc2_w 5000.0
      // 73: invokevirtual Timer.yrv (D)Z
      // 76: ifeq 8c
      // 79: goto 80
      // 7c: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 7f: athrow
      // 80: aload 0
      // 81: goto 88
      // 84: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 87: athrow
      // 88: bipush 1
      // 89: invokespecial AuraEngineAAC.in0 (Z)V
      // 8c: return
   }

   private void tpj(Entity param1) {
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
      // 05: getfield AuraEngineAAC.wyl Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: iload 2
      // 0c: ifne 41
      // 0f: invokevirtual EntityPlayerSP.kqk ()Z
      // 12: ifeq 40
      // 15: goto 1c
      // 18: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield AuraEngineAAC.wyl Lc05;
      // 20: getfield Minecraft.vg8 Ll86;
      // 23: getfield EntityPlayerSP.lq7 Lp_k;
      // 26: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 29: dup
      // 2a: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.md_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 2d: getstatic mew._9b Lmew;
      // 30: getstatic vt2.m3r Lvt2;
      // 33: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 36: invokevirtual p_k.sxi (Lmz2;)V
      // 39: goto 40
      // 3c: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 1
      // 41: iload 2
      // 42: ifne 50
      // 45: ifnull a9
      // 48: goto 4f
      // 4b: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 1
      // 50: aload 0
      // 51: getfield AuraEngineAAC.wyl Lc05;
      // 54: getfield Minecraft.vg8 Ll86;
      // 57: invokevirtual Entity.tm6 (Li2h;)F
      // 5a: ldc 4.0
      // 5c: nop
      // 5d: fcmpg
      // 5e: ifgt a9
      // 61: aload 0
      // 62: getfield AuraEngineAAC.wyl Lc05;
      // 65: getfield Minecraft.vg8 Ll86;
      // 68: invokevirtual EntityPlayerSP.hgb ()V
      // 6b: aload 0
      // 6c: getfield AuraEngineAAC.wyl Lc05;
      // 6f: getfield Minecraft.vg8 Ll86;
      // 72: getfield EntityPlayerSP.lq7 Lp_k;
      // 75: new net/minecraft/network/play/client/C02PacketUseEntity
      // 78: dup
      // 79: aload 1
      // 7a: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 7d: invokespecial net/minecraft/network/play/client/C02PacketUseEntity.<init> (Li2h;Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;)V
      // 80: invokevirtual p_k.sxi (Lmz2;)V
      // 83: aload 0
      // 84: getfield AuraEngineAAC.wyl Lc05;
      // 87: getfield Minecraft.vg8 Ll86;
      // 8a: aload 1
      // 8b: invokevirtual EntityPlayerSP.eej (Li2h;)V
      // 8e: aload 0
      // 8f: getfield AuraEngineAAC.wyl Lc05;
      // 92: getfield Minecraft.vg8 Ll86;
      // 95: aload 1
      // 96: invokevirtual EntityPlayerSP.eej (Li2h;)V
      // 99: aload 0
      // 9a: bipush 1
      // 9b: putfield AuraEngineAAC.s74 Z
      // 9e: iload 2
      // 9f: ifeq c9
      // a2: goto a9
      // a5: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // a8: athrow
      // a9: aload 0
      // aa: getfield AuraEngineAAC.wyl Lc05;
      // ad: getfield Minecraft.vg8 Ll86;
      // b0: getfield EntityPlayerSP.lq7 Lp_k;
      // b3: new net/minecraft/network/play/client/C0APacketAnimation
      // b6: dup
      // b7: invokespecial net/minecraft/network/play/client/C0APacketAnimation.<init> ()V
      // ba: invokevirtual p_k.sxi (Lmz2;)V
      // bd: aload 0
      // be: bipush 0
      // bf: putfield AuraEngineAAC.s74 Z
      // c2: goto c9
      // c5: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // c8: athrow
      // c9: return
   }

   private List fbs() {
      return uj3.kao().stream().filter(this::q7o).collect(Collectors.toList());
   }

   public boolean fje(Entity param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifeq 014
      // 009: ifnull 040
      // 00c: goto 013
      // 00f: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 012: athrow
      // 013: aload 1
      // 014: getfield Entity.ma9 Z
      // 017: iload 3
      // 018: ifeq 041
      // 01b: ifne 040
      // 01e: goto 025
      // 021: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 1
      // 026: invokevirtual Entity.i55 ()F
      // 029: fconst_0
      // 02a: fcmpg
      // 02b: iload 3
      // 02c: ifeq 04d
      // 02f: goto 036
      // 032: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 035: athrow
      // 036: ifgt 042
      // 039: goto 040
      // 03c: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 03f: athrow
      // 040: bipush 0
      // 041: ireturn
      // 042: aload 0
      // 043: getfield AuraEngineAAC.wyl Lc05;
      // 046: getfield Minecraft.vg8 Ll86;
      // 049: aload 1
      // 04a: invokevirtual EntityPlayerSP.e7y (Li2h;)Z
      // 04d: ifeq 05a
      // 050: ldc 4.0
      // 052: nop
      // 053: goto 05b
      // 056: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 059: athrow
      // 05a: fconst_0
      // 05b: fstore 4
      // 05d: iload 2
      // 05e: iload 3
      // 05f: ifeq 0ac
      // 062: ifne 0a5
      // 065: goto 06c
      // 068: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: dup
      // 06e: getfield AuraEngineAAC.ir7 I
      // 071: bipush 1
      // 072: iadd
      // 073: putfield AuraEngineAAC.ir7 I
      // 076: aload 0
      // 077: getfield AuraEngineAAC.ir7 I
      // 07a: bipush 1
      // 07b: iload 3
      // 07c: ifeq 0a1
      // 07f: goto 086
      // 082: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 085: athrow
      // 086: if_icmple 09c
      // 089: goto 090
      // 08c: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 0
      // 091: bipush 0
      // 092: putfield AuraEngineAAC.ir7 I
      // 095: goto 09c
      // 098: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 09b: athrow
      // 09c: bipush 4
      // 09d: aload 0
      // 09e: getfield AuraEngineAAC.ir7 I
      // 0a1: iadd
      // 0a2: i2f
      // 0a3: fstore 4
      // 0a5: aload 1
      // 0a6: fload 4
      // 0a8: f2d
      // 0a9: invokestatic omb.mzr (Li2h;D)Z
      // 0ac: iload 3
      // 0ad: ifeq 0c4
      // 0b0: ifne 0c0
      // 0b3: goto 0ba
      // 0b6: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: bipush 0
      // 0bb: ireturn
      // 0bc: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 1
      // 0c1: instanceof h67
      // 0c4: iload 3
      // 0c5: ifeq 0dc
      // 0c8: ifeq 0d8
      // 0cb: goto 0d2
      // 0ce: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: bipush 0
      // 0d3: ireturn
      // 0d4: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 1
      // 0d9: invokevirtual Entity.h5u ()Z
      // 0dc: iload 3
      // 0dd: ifeq 0f4
      // 0e0: ifeq 0f0
      // 0e3: goto 0ea
      // 0e6: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: bipush 0
      // 0eb: ireturn
      // 0ec: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 1
      // 0f1: instanceof ha9
      // 0f4: iload 3
      // 0f5: ifeq 133
      // 0f8: ifeq 12a
      // 0fb: goto 102
      // 0fe: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 101: athrow
      // 102: getstatic ClientState.qkk Lzwr;
      // 105: invokevirtual ClientState.w34 ()Lf62;
      // 108: aload 1
      // 109: invokevirtual Entity.noc ()Ljava/lang/String;
      // 10c: invokevirtual f62.jzk (Ljava/lang/String;)Z
      // 10f: iload 3
      // 110: ifeq 133
      // 113: goto 11a
      // 116: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 119: athrow
      // 11a: ifeq 12a
      // 11d: goto 124
      // 120: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 123: athrow
      // 124: bipush 0
      // 125: ireturn
      // 126: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 129: athrow
      // 12a: getstatic ClientState.o1s Lcn7;
      // 12d: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 130: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 133: iload 3
      // 134: ifeq 182
      // 137: ifeq 17c
      // 13a: goto 141
      // 13d: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 1
      // 142: instanceof ha9
      // 145: iload 3
      // 146: ifeq 182
      // 149: goto 150
      // 14c: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 14f: athrow
      // 150: ifeq 17c
      // 153: goto 15a
      // 156: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 1
      // 15b: checkcast ha9
      // 15e: invokestatic f62.a92 (Lha9;)Z
      // 161: iload 3
      // 162: ifeq 182
      // 165: goto 16c
      // 168: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 16b: athrow
      // 16c: ifeq 17c
      // 16f: goto 176
      // 172: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 175: athrow
      // 176: bipush 0
      // 177: ireturn
      // 178: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 17b: athrow
      // 17c: getstatic ModuleRegistry.p71 Lar9;
      // 17f: invokevirtual AntiBots.klu ()Z
      // 182: iload 3
      // 183: ifeq 1b3
      // 186: ifeq 1b2
      // 189: goto 190
      // 18c: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 18f: athrow
      // 190: getstatic ModuleRegistry.p71 Lar9;
      // 193: aload 1
      // 194: invokevirtual AntiBots.kh5 (Lg_3;)Z
      // 197: iload 3
      // 198: ifeq 1b3
      // 19b: goto 1a2
      // 19e: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: ifeq 1b2
      // 1a5: goto 1ac
      // 1a8: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: bipush 0
      // 1ad: ireturn
      // 1ae: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: bipush 1
      // 1b3: ireturn
   }

   @EventHandler
   private void fbi(b5k param1) {
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
      // 005: iload 2
      // 006: ifne 01c
      // 009: getfield AuraEngineAAC.oec Lfz2;
      // 00c: ifnonnull 01b
      // 00f: goto 016
      // 012: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 015: athrow
      // 016: return
      // 017: invokestatic AuraEngineAAC.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 0
      // 01c: aload 0
      // 01d: getfield AuraEngineAAC.oec Lfz2;
      // 020: invokevirtual PlayerUpdateEvent.d9n ()F
      // 023: aload 0
      // 024: getfield AuraEngineAAC.oec Lfz2;
      // 027: invokevirtual PlayerUpdateEvent.m1r ()F
      // 02a: invokespecial AuraEngineAAC.n1w (FF)Lfqr;
      // 02d: astore 3
      // 02e: aload 0
      // 02f: getfield AuraEngineAAC.wyl Lc05;
      // 032: getfield Minecraft.vg8 Ll86;
      // 035: getfield EntityPlayerSP.ivp D
      // 038: aload 3
      // 039: getfield fqr.lvi D
      // 03c: ldc2_w 4.0
      // 03f: dmul
      // 040: dadd
      // 041: aload 0
      // 042: getfield AuraEngineAAC.wyl Lc05;
      // 045: getfield Minecraft.vg8 Ll86;
      // 048: getfield EntityPlayerSP.o2v D
      // 04b: aload 3
      // 04c: getfield fqr.lvi D
      // 04f: ldc2_w 4.0
      // 052: dmul
      // 053: dadd
      // 054: aload 0
      // 055: getfield AuraEngineAAC.wyl Lc05;
      // 058: getfield Minecraft.vg8 Ll86;
      // 05b: getfield EntityPlayerSP.ivp D
      // 05e: aload 3
      // 05f: getfield fqr.lvi D
      // 062: ldc2_w 4.0
      // 065: dmul
      // 066: dadd
      // 067: dsub
      // 068: aload 1
      // 069: invokevirtual b5k._x5 ()F
      // 06c: f2d
      // 06d: dmul
      // 06e: dadd
      // 06f: aload 0
      // 070: getfield AuraEngineAAC.wyl Lc05;
      // 073: invokevirtual Minecraft.ibs ()Lhr_;
      // 076: invokevirtual hr_.yky ()D
      // 079: dsub
      // 07a: dstore 4
      // 07c: aload 0
      // 07d: getfield AuraEngineAAC.wyl Lc05;
      // 080: getfield Minecraft.vg8 Ll86;
      // 083: getfield EntityPlayerSP.c54 D
      // 086: aload 0
      // 087: getfield AuraEngineAAC.wyl Lc05;
      // 08a: getfield Minecraft.vg8 Ll86;
      // 08d: invokevirtual EntityPlayerSP.c5y ()F
      // 090: f2d
      // 091: dadd
      // 092: aload 3
      // 093: getfield fqr.gn5 D
      // 096: ldc2_w 4.0
      // 099: dmul
      // 09a: dadd
      // 09b: aload 0
      // 09c: getfield AuraEngineAAC.wyl Lc05;
      // 09f: getfield Minecraft.vg8 Ll86;
      // 0a2: getfield EntityPlayerSP.kfp D
      // 0a5: aload 0
      // 0a6: getfield AuraEngineAAC.wyl Lc05;
      // 0a9: getfield Minecraft.vg8 Ll86;
      // 0ac: invokevirtual EntityPlayerSP.c5y ()F
      // 0af: f2d
      // 0b0: dadd
      // 0b1: aload 3
      // 0b2: getfield fqr.gn5 D
      // 0b5: ldc2_w 4.0
      // 0b8: dmul
      // 0b9: dadd
      // 0ba: aload 0
      // 0bb: getfield AuraEngineAAC.wyl Lc05;
      // 0be: getfield Minecraft.vg8 Ll86;
      // 0c1: getfield EntityPlayerSP.c54 D
      // 0c4: aload 0
      // 0c5: getfield AuraEngineAAC.wyl Lc05;
      // 0c8: getfield Minecraft.vg8 Ll86;
      // 0cb: invokevirtual EntityPlayerSP.c5y ()F
      // 0ce: f2d
      // 0cf: dadd
      // 0d0: aload 3
      // 0d1: getfield fqr.gn5 D
      // 0d4: ldc2_w 4.0
      // 0d7: dmul
      // 0d8: dadd
      // 0d9: dsub
      // 0da: aload 1
      // 0db: invokevirtual b5k._x5 ()F
      // 0de: f2d
      // 0df: dmul
      // 0e0: dadd
      // 0e1: aload 0
      // 0e2: getfield AuraEngineAAC.wyl Lc05;
      // 0e5: invokevirtual Minecraft.ibs ()Lhr_;
      // 0e8: invokevirtual hr_.fxk ()D
      // 0eb: dsub
      // 0ec: dstore 6
      // 0ee: aload 0
      // 0ef: getfield AuraEngineAAC.wyl Lc05;
      // 0f2: getfield Minecraft.vg8 Ll86;
      // 0f5: getfield EntityPlayerSP.e2b D
      // 0f8: aload 3
      // 0f9: getfield fqr.bn2 D
      // 0fc: ldc2_w 4.0
      // 0ff: dmul
      // 100: dadd
      // 101: aload 0
      // 102: getfield AuraEngineAAC.wyl Lc05;
      // 105: getfield Minecraft.vg8 Ll86;
      // 108: getfield EntityPlayerSP.vbd D
      // 10b: aload 3
      // 10c: getfield fqr.bn2 D
      // 10f: ldc2_w 4.0
      // 112: dmul
      // 113: dadd
      // 114: aload 0
      // 115: getfield AuraEngineAAC.wyl Lc05;
      // 118: getfield Minecraft.vg8 Ll86;
      // 11b: getfield EntityPlayerSP.e2b D
      // 11e: aload 3
      // 11f: getfield fqr.bn2 D
      // 122: ldc2_w 4.0
      // 125: dmul
      // 126: dadd
      // 127: dsub
      // 128: aload 1
      // 129: invokevirtual b5k._x5 ()F
      // 12c: f2d
      // 12d: dmul
      // 12e: dadd
      // 12f: aload 0
      // 130: getfield AuraEngineAAC.wyl Lc05;
      // 133: invokevirtual Minecraft.ibs ()Lhr_;
      // 136: invokevirtual hr_.kux ()D
      // 139: dsub
      // 13a: dstore 8
      // 13c: return
   }

   private fqr n1w(float var1, float var2) {
      float var3 = fe6.ssk(-var2 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var4 = fe6.rtn(-var2 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var5 = -fe6.ssk(-var1 * (float) (Math.PI / 180.0));
      float var6 = fe6.rtn(-var1 * (float) (Math.PI / 180.0));
      return new fqr((double)(var4 * var5), (double)var6, (double)(var3 * var5));
   }

   private boolean q7o(Entity var1) {
      return this.fje(var1, false);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2750819242135780459L, -4345805190272036969L, MethodHandles.lookup().lookupClass()).a(225604466920753L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 94759343843229L;
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
      String var6 = "\u0085ÅÀ_wbÿÃ&SØ\u0098sUZ¯ÑW\u0080°uâ°\u008f\u0082?4îÑú%PÛäÀCmõáõäócÙÙÑ`< á\u0098ì/\u009d@®«M\u0015Üh ëIð¾áNm\u0081h\u0000yÃpql!äù~\u0010\u0014m*\u008eØÃ\u0007µÀ&\u009bH\u0096ÐÛa .\u007f?¤R\u008dþa´\u000f\u0092r\\73\u009anÓ;Îc÷ûº\u008f1n\u007f;.mÅ";
      int var8 = "\u0085ÅÀ_wbÿÃ&SØ\u0098sUZ¯ÑW\u0080°uâ°\u008f\u0082?4îÑú%PÛäÀCmõáõäócÙÙÑ`< á\u0098ì/\u009d@®«M\u0015Üh ëIð¾áNm\u0081h\u0000yÃpql!äù~\u0010\u0014m*\u008eØÃ\u0007µÀ&\u009bH\u0096ÐÛa .\u007f?¤R\u008dþa´\u000f\u0092r\\73\u009anÓ;Îc÷ûº\u008f1n\u007f;.mÅ"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[6];
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

                  var6 = "ìge\u008bÕsøcB÷\\x×¾Ã1ö\u0016s¯f¼DÒ¼¡\u0084þ\u008cGüW8x\u008cÀ³ÜdR$\u000e\u0005\u0016\u0019^Zß\u0010I÷\u0002â\u0018ä»«ÚòO¥Àýg@";
                  var8 = "ìge\u008bÕsøcB÷\\x×¾Ã1ö\u0016s¯f¼DÒ¼¡\u0084þ\u008cGüW8x\u008cÀ³ÜdR$\u000e\u0005\u0016\u0019^Zß\u0010I÷\u0002â\u0018ä»«ÚòO¥Àýg@"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 716;
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
            throw new RuntimeException("AuraEngineAAC", var10);
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
         throw new RuntimeException("AuraEngineAAC" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
