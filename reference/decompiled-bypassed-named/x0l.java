import com.mojang.authlib.GameProfile;
import java.io.File;
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

public abstract class x0l extends ha9 {
   private hv2 z2t;
   private gdz rbv;
   private long idl;
   private boolean oxk;
   private String fbx;
   private static final gdz fj5;
   private static final long g;
   private static final String[] q;
   private static final String[] r;
   private static final Map s = new HashMap(13);

   public x0l(OpaquePredicate param1, GameProfile param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: invokespecial ha9.<init> (Lt9d;Lcom/mojang/authlib/GameProfile;)V
      // 06: invokestatic OpaquePredicate.b ()I
      // 09: aload 0
      // 0a: aconst_null
      // 0b: putfield x0l.rbv Lgdz;
      // 0e: aload 0
      // 0f: lconst_0
      // 10: putfield x0l.idl J
      // 13: aload 0
      // 14: bipush 0
      // 15: putfield x0l.oxk Z
      // 18: aload 0
      // 19: aconst_null
      // 1a: putfield x0l.fbx Ljava/lang/String;
      // 1d: aload 0
      // 1e: aload 2
      // 1f: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 22: putfield x0l.fbx Ljava/lang/String;
      // 25: istore 3
      // 26: aload 0
      // 27: iload 3
      // 28: ifeq 6b
      // 2b: getfield x0l.fbx Ljava/lang/String;
      // 2e: ifnull 66
      // 31: goto 38
      // 34: invokestatic x0l.d (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: iload 3
      // 3a: ifeq 6b
      // 3d: goto 44
      // 40: invokestatic x0l.d (Loov;)Loov;
      // 43: athrow
      // 44: getfield x0l.fbx Ljava/lang/String;
      // 47: invokevirtual java/lang/String.isEmpty ()Z
      // 4a: ifne 66
      // 4d: goto 54
      // 50: invokestatic x0l.d (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: aload 0
      // 56: getfield x0l.fbx Ljava/lang/String;
      // 59: invokestatic jfy.i95 (Ljava/lang/String;)Ljava/lang/String;
      // 5c: putfield x0l.fbx Ljava/lang/String;
      // 5f: goto 66
      // 62: invokestatic x0l.d (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: invokestatic net/optifine/player/CapeUtils.downloadCape (Lx0l;)V
      // 6a: aload 0
      // 6b: invokestatic net/optifine/player/PlayerConfigurations.getPlayerConfiguration (Lx0l;)Lnet/optifine/player/PlayerConfiguration;
      // 6e: pop
      // 6f: return
   }

   @Override
   public boolean myu() {
      int var1 = OpaquePredicate.c();
      hv2 var2 = Minecraft.vz1().c02().txu(this.x6l().getId());

      hv2 var10000;
      label27: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label27;
            }

            if (var2 == null) {
               return false;
            }
         } catch (oov var4) {
            throw d(var4);
         }

         var10000 = var2;
      }

      try {
         if (var10000.j3n() == h50$f05.l18) {
            return true;
         }
      } catch (oov var3) {
         throw d(var3);
      }

      return false;
   }

   public boolean gnr() {
      try {
         if (this.k8j() != null) {
            return true;
         }
      } catch (oov var1) {
         throw d(var1);
      }

      return false;
   }

   public hv2 k8j() {
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
      // 05: getfield x0l.z2t Lhv2;
      // 08: iload 1
      // 09: ifeq 32
      // 0c: ifnonnull 2e
      // 0f: goto 16
      // 12: invokestatic x0l.d (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic Minecraft.vz1 ()Lc05;
      // 1a: invokevirtual Minecraft.c02 ()Lp_k;
      // 1d: aload 0
      // 1e: invokevirtual x0l.b_q ()Ljava/util/UUID;
      // 21: invokevirtual p_k.txu (Ljava/util/UUID;)Lhv2;
      // 24: putfield x0l.z2t Lhv2;
      // 27: goto 2e
      // 2a: invokestatic x0l.d (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield x0l.z2t Lhv2;
      // 32: areturn
   }

   public boolean t_p() {
      int var1 = OpaquePredicate.c();
      hv2 var2 = this.k8j();

      hv2 var10000;
      label33: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label33;
            }

            if (var2 == null) {
               return false;
            }
         } catch (oov var4) {
            throw d(var4);
         }

         var10000 = var2;
      }

      try {
         boolean var5 = var10000.h8i();
         if (var1 != 0) {
            return var5;
         }

         if (var5) {
            return true;
         }
      } catch (oov var3) {
         throw d(var3);
      }

      return false;
   }

   public gdz q06() {
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
      // 05: invokevirtual x0l.k8j ()Lhv2;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 27
      // 0e: ifnonnull 26
      // 11: goto 18
      // 14: invokestatic x0l.d (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual x0l.b_q ()Ljava/util/UUID;
      // 1c: invokestatic wip.lnt (Ljava/util/UUID;)Lgdz;
      // 1f: goto 2a
      // 22: invokestatic x0l.d (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: invokevirtual hv2.dq7 ()Lgdz;
      // 2a: areturn
   }

   public gdz sfa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: invokestatic hxt.fxq ()Z
      // 07: iload 1
      // 08: ifne 2c
      // 0b: ifne 1b
      // 0e: goto 15
      // 11: invokestatic x0l.d (Loov;)Loov;
      // 14: athrow
      // 15: aconst_null
      // 16: areturn
      // 17: invokestatic x0l.d (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 1
      // 1d: ifne 52
      // 20: getfield x0l.idl J
      // 23: lconst_0
      // 24: lcmp
      // 25: goto 2c
      // 28: invokestatic x0l.d (Loov;)Loov;
      // 2b: athrow
      // 2c: ifeq 51
      // 2f: invokestatic java/lang/System.currentTimeMillis ()J
      // 32: aload 0
      // 33: getfield x0l.idl J
      // 36: lcmp
      // 37: ifle 51
      // 3a: goto 41
      // 3d: invokestatic x0l.d (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: invokestatic net/optifine/player/CapeUtils.reloadCape (Lx0l;)V
      // 45: aload 0
      // 46: lconst_0
      // 47: putfield x0l.idl J
      // 4a: goto 51
      // 4d: invokestatic x0l.d (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: iload 1
      // 53: ifne 6d
      // 56: getfield x0l.rbv Lgdz;
      // 59: ifnull 6c
      // 5c: goto 63
      // 5f: invokestatic x0l.d (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: getfield x0l.rbv Lgdz;
      // 67: areturn
      // 68: invokestatic x0l.d (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: invokevirtual x0l.k8j ()Lhv2;
      // 70: astore 2
      // 71: aload 2
      // 72: iload 1
      // 73: ifne 89
      // 76: ifnonnull 88
      // 79: goto 80
      // 7c: invokestatic x0l.d (Loov;)Loov;
      // 7f: athrow
      // 80: aconst_null
      // 81: goto 8c
      // 84: invokestatic x0l.d (Loov;)Loov;
      // 87: athrow
      // 88: aload 2
      // 89: invokevirtual hv2.eu7 ()Lgdz;
      // 8c: areturn
   }

   public static bhs m1h(gdz var0, String var1) {
      long var2 = g ^ 101483374570355L;
      lc5 var5 = Minecraft.vz1().l22();
      int var10000 = OpaquePredicate.c();
      sm5 var6 = var5.dry(var0);
      int var4 = var10000;

      try {
         if (var4 != 0) {
            return (bhs)var6;
         }

         if (var6 != null) {
            return (bhs)var6;
         }
      } catch (oov var7) {
         throw d(var7);
      }

      bhs var9 = new bhs((File)null, String.format(d<"q">(13695, 2955792518843897327L ^ var2), jfy.i95(var1)), wip.lnt(zzw(var1)), new bzt());
      var5.pc2(var0, var9);
      return var9;
   }

   public static gdz to8(String var0) {
      long var1 = g ^ 16488750177677L;
      return new gdz(d<"q">(19307, 7659258292897438980L ^ var1) + jfy.i95(var0));
   }

   public String pxl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual x0l.k8j ()Lhv2;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 27
      // 0e: ifnonnull 26
      // 11: goto 18
      // 14: invokestatic x0l.d (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual x0l.b_q ()Ljava/util/UUID;
      // 1c: invokestatic wip.nq_ (Ljava/util/UUID;)Ljava/lang/String;
      // 1f: goto 2a
      // 22: invokestatic x0l.d (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: invokevirtual hv2.nxr ()Ljava/lang/String;
      // 2a: areturn
   }

   public float rgq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: fconst_1
      // 005: fstore 2
      // 006: aload 0
      // 007: iload 1
      // 008: ifne 022
      // 00b: getfield x0l.lls Lpj2;
      // 00e: getfield pj2.wzx Z
      // 011: ifeq 021
      // 014: goto 01b
      // 017: invokestatic x0l.d (Loov;)Loov;
      // 01a: athrow
      // 01b: fload 2
      // 01c: ldc 1.1
      // 01e: nop
      // 01f: fmul
      // 020: fstore 2
      // 021: aload 0
      // 022: getstatic m6d.w7i Lw9p;
      // 025: invokevirtual x0l.dgt (Lw9p;)L_4o;
      // 028: astore 3
      // 029: fload 2
      // 02a: f2d
      // 02b: aload 3
      // 02c: invokeinterface _4o.nz5 ()D 1
      // 031: aload 0
      // 032: getfield x0l.lls Lpj2;
      // 035: invokevirtual pj2.wjr ()F
      // 038: f2d
      // 039: ddiv
      // 03a: dconst_1
      // 03b: dadd
      // 03c: ldc2_w 2.0
      // 03f: ddiv
      // 040: dmul
      // 041: d2f
      // 042: fstore 2
      // 043: aload 0
      // 044: getfield x0l.lls Lpj2;
      // 047: invokevirtual pj2.wjr ()F
      // 04a: iload 1
      // 04b: ifne 08d
      // 04e: fconst_0
      // 04f: fcmpl
      // 050: ifeq 08c
      // 053: goto 05a
      // 056: invokestatic x0l.d (Loov;)Loov;
      // 059: athrow
      // 05a: fload 2
      // 05b: iload 1
      // 05c: ifne 08d
      // 05f: goto 066
      // 062: invokestatic x0l.d (Loov;)Loov;
      // 065: athrow
      // 066: invokestatic java/lang/Float.isNaN (F)Z
      // 069: ifne 08c
      // 06c: goto 073
      // 06f: invokestatic x0l.d (Loov;)Loov;
      // 072: athrow
      // 073: fload 2
      // 074: invokestatic java/lang/Float.isInfinite (F)Z
      // 077: iload 1
      // 078: ifne 092
      // 07b: goto 082
      // 07e: invokestatic x0l.d (Loov;)Loov;
      // 081: athrow
      // 082: ifeq 08e
      // 085: goto 08c
      // 088: invokestatic x0l.d (Loov;)Loov;
      // 08b: athrow
      // 08c: fconst_1
      // 08d: fstore 2
      // 08e: aload 0
      // 08f: invokevirtual x0l.kqa ()Z
      // 092: iload 1
      // 093: ifne 118
      // 096: ifeq 107
      // 099: goto 0a0
      // 09c: invokestatic x0l.d (Loov;)Loov;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: iload 1
      // 0a2: ifne 0c7
      // 0a5: goto 0ac
      // 0a8: invokestatic x0l.d (Loov;)Loov;
      // 0ab: athrow
      // 0ac: invokevirtual x0l.t_o ()Lerg;
      // 0af: invokevirtual erg.gn1 ()Lu7m;
      // 0b2: getstatic xbr.okb Lr5m;
      // 0b5: if_acmpne 107
      // 0b8: goto 0bf
      // 0bb: invokestatic x0l.d (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: goto 0c7
      // 0c3: invokestatic x0l.d (Loov;)Loov;
      // 0c6: athrow
      // 0c7: invokevirtual x0l.bbq ()I
      // 0ca: istore 4
      // 0cc: iload 4
      // 0ce: i2f
      // 0cf: ldc 20.0
      // 0d1: nop
      // 0d2: fdiv
      // 0d3: fstore 5
      // 0d5: fload 5
      // 0d7: fconst_1
      // 0d8: iload 1
      // 0d9: ifne 0f9
      // 0dc: fcmpl
      // 0dd: ifle 0ee
      // 0e0: goto 0e7
      // 0e3: invokestatic x0l.d (Loov;)Loov;
      // 0e6: athrow
      // 0e7: fconst_1
      // 0e8: fstore 5
      // 0ea: iload 1
      // 0eb: ifeq 0fc
      // 0ee: fload 5
      // 0f0: fload 5
      // 0f2: goto 0f9
      // 0f5: invokestatic x0l.d (Loov;)Loov;
      // 0f8: athrow
      // 0f9: fmul
      // 0fa: fstore 5
      // 0fc: fload 2
      // 0fd: fconst_1
      // 0fe: fload 5
      // 100: ldc 0.15
      // 102: nop
      // 103: fmul
      // 104: fsub
      // 105: fmul
      // 106: fstore 2
      // 107: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getOffsetFOV Lnet/optifine/reflect/ReflectorMethod;
      // 10a: iload 1
      // 10b: ifne 11e
      // 10e: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 111: goto 118
      // 114: invokestatic x0l.d (Loov;)Loov;
      // 117: athrow
      // 118: ifeq 133
      // 11b: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_getOffsetFOV Lnet/optifine/reflect/ReflectorMethod;
      // 11e: bipush 2
      // 11f: anewarray 171
      // 122: dup
      // 123: bipush 0
      // 124: aload 0
      // 125: aastore
      // 126: dup
      // 127: bipush 1
      // 128: fload 2
      // 129: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 12c: aastore
      // 12d: invokestatic net/optifine/reflect/Reflector.callFloat (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)F
      // 130: goto 134
      // 133: fload 2
      // 134: freturn
   }

   public String fjp() {
      return this.fbx;
   }

   public gdz wan() {
      return this.rbv;
   }

   public void hqh(gdz var1) {
      this.rbv = var1;
   }

   public boolean mv3() {
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
      // 05: invokevirtual x0l.sfa ()Lgdz;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifeq 21
      // 0e: ifnonnull 20
      // 11: goto 18
      // 14: invokestatic x0l.d (Loov;)Loov;
      // 17: athrow
      // 18: bipush 0
      // 19: goto 34
      // 1c: invokestatic x0l.d (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: aload 0
      // 22: getfield x0l.rbv Lgdz;
      // 25: if_acmpne 33
      // 28: aload 0
      // 29: getfield x0l.oxk Z
      // 2c: goto 34
      // 2f: invokestatic x0l.d (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: ireturn
   }

   public void uu5(boolean var1) {
      this.oxk = var1;
   }

   public boolean rpa() {
      return this.oxk;
   }

   public long v7r() {
      return this.idl;
   }

   public void lhi(long var1) {
      this.idl = var1;
   }

   @Override
   public fqr wej(float var1) {
      return this.kpk(this.y2i, this.x5k);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1760969194919117236L, 404464362215899223L, MethodHandles.lookup().lookupClass()).a(129049710810310L);
      // $VF: monitorexit
      g = var10000;
      long var9 = g ^ 55645830560294L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "ø¾\t\u009a\u0003±\rO\u001cD¹G\u008bøT\u0082XÂ®SËðÕÍ@7\u008büCFqþ]ÄÍ\u00852Eºàü\u001b\u001a¡$¶øêäÏ\u009e®?)¥T(Ý\u0010(ôvÚV\u0012=\u0017ð\u0015QdKBÔÁÔºóJ¬\u000fÙL-\u0085\u0016=Â*\t\u0018£_í8\u008b&,\u009c&\u0011\u009d½8ì8 E/óL\u0089Ã^4çÀ\u0087Á\u0080àódY,½¥«\u0015jîÇJ÷Ü8`ôÒÚ¡Qå/Ë¤äONòl\u007fq\u001eK\u0083ZÎ\u0017¿c3";
      int var6 = "ø¾\t\u009a\u0003±\rO\u001cD¹G\u008bøT\u0082XÂ®SËðÕÍ@7\u008büCFqþ]ÄÍ\u00852Eºàü\u001b\u001a¡$¶øêäÏ\u009e®?)¥T(Ý\u0010(ôvÚV\u0012=\u0017ð\u0015QdKBÔÁÔºóJ¬\u000fÙL-\u0085\u0016=Â*\t\u0018£_í8\u008b&,\u009c&\u0011\u009d½8ì8 E/óL\u0089Ã^4çÀ\u0087Á\u0080àódY,½¥«\u0015jîÇJ÷Ü8`ôÒÚ¡Qå/Ë¤äONòl\u007fq\u001eK\u0083ZÎ\u0017¿c3"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = d(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            q = var7;
            r = new String[3];
            fj5 = new gdz(d<"q">(7469, 6322627278325411051L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   private static oov d(oov var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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

   private static String d(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3977;
      if (r[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("x0l", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = q[var5].getBytes("ISO-8859-1");
         r[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return r[var5];
   }

   private static Object d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("x0l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
