import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class v9i extends EntityCreeper {
   private static final UUID abu;
   private static final xk5 geg;
   private int b2x;
   private int xvr;
   private UUID uf7;
   private static final long c;
   private static final String[] x;
   private static final String[] y;
   private static final Map z = new HashMap(13);

   public v9i(OpaquePredicate var1) {
      super(var1);
      this.cuj = true;
   }

   @Override
   public void iar(Entity param1) {
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
      // 05: aload 1
      // 06: iload 2
      // 07: ifeq 21
      // 0a: invokespecial EntityCreeper.iar (Lg_3;)V
      // 0d: aload 1
      // 0e: ifnull 27
      // 11: goto 18
      // 14: invokestatic v9i.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: goto 21
      // 1d: invokestatic v9i.a (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual Entity.b_q ()Ljava/util/UUID;
      // 24: putfield v9i.uf7 Ljava/util/UUID;
      // 27: return
   }

   @Override
   public void ch4() {
      this.g9o.tn8(1, new v9i$_tl(this));
      this.g9o.tn8(2, new v9i$li6(this));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(vsc).zf7(0.0);
      this.dgt(m6d.w7i).zf7(0.23F);
      this.dgt(m6d.y3f).zf7(5.0);
   }

   @Override
   public void xx_() {
      super.xx_();
   }

   @Override
   public void qar() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic v9i.c J
      // 003: ldc2_w 68868488386669
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getstatic m6d.w7i Lw9p;
      // 010: invokevirtual v9i.dgt (Lw9p;)L_4o;
      // 013: astore 4
      // 015: aload 0
      // 016: invokevirtual v9i.pdc ()Z
      // 019: iload 3
      // 01a: ifeq 08f
      // 01d: ifeq 07e
      // 020: goto 027
      // 023: invokestatic v9i.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 0
      // 028: iload 3
      // 029: ifeq 071
      // 02c: goto 033
      // 02f: invokestatic v9i.a (Loov;)Loov;
      // 032: athrow
      // 033: invokevirtual v9i.ejl ()Z
      // 036: ifne 070
      // 039: goto 040
      // 03c: invokestatic v9i.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 4
      // 042: getstatic v9i.geg Lxk5;
      // 045: iload 3
      // 046: ifeq 06b
      // 049: goto 050
      // 04c: invokestatic v9i.a (Loov;)Loov;
      // 04f: athrow
      // 050: invokeinterface _4o.zaq (Lxk5;)Z 2
      // 055: ifne 070
      // 058: goto 05f
      // 05b: invokestatic v9i.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 4
      // 061: getstatic v9i.geg Lxk5;
      // 064: goto 06b
      // 067: invokestatic v9i.a (Loov;)Loov;
      // 06a: athrow
      // 06b: invokeinterface _4o.vcr (Lxk5;)V 2
      // 070: aload 0
      // 071: dup
      // 072: getfield v9i.b2x I
      // 075: bipush 1
      // 076: isub
      // 077: putfield v9i.b2x I
      // 07a: iload 3
      // 07b: ifne 0ae
      // 07e: aload 4
      // 080: getstatic v9i.geg Lxk5;
      // 083: invokeinterface _4o.zaq (Lxk5;)Z 2
      // 088: goto 08f
      // 08b: invokestatic v9i.a (Loov;)Loov;
      // 08e: athrow
      // 08f: iload 3
      // 090: ifeq 0b2
      // 093: ifeq 0ae
      // 096: goto 09d
      // 099: invokestatic v9i.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 4
      // 09f: getstatic v9i.geg Lxk5;
      // 0a2: invokeinterface _4o.se8 (Lxk5;)V 2
      // 0a7: goto 0ae
      // 0aa: invokestatic v9i.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield v9i.xvr I
      // 0b2: iload 3
      // 0b3: ifeq 127
      // 0b6: ifle 118
      // 0b9: goto 0c0
      // 0bc: invokestatic v9i.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 0
      // 0c1: dup
      // 0c2: getfield v9i.xvr I
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: dup_x1
      // 0c8: putfield v9i.xvr I
      // 0cb: iload 3
      // 0cc: ifeq 127
      // 0cf: goto 0d6
      // 0d2: invokestatic v9i.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: ifne 118
      // 0d9: goto 0e0
      // 0dc: invokestatic v9i.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: sipush 3039
      // 0e4: ldc2_w 5087819415883857342
      // 0e7: lload 1
      // 0e8: lxor
      // 0e9: invokedynamic r (IJ)Ljava/lang/String; bsm=v9i.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: nop
      // 0ef: aload 0
      // 0f0: invokevirtual v9i.o23 ()F
      // 0f3: fconst_2
      // 0f4: fmul
      // 0f5: aload 0
      // 0f6: getfield v9i.z2d Ljava/util/Random;
      // 0f9: invokevirtual java/util/Random.nextFloat ()F
      // 0fc: aload 0
      // 0fd: getfield v9i.z2d Ljava/util/Random;
      // 100: invokevirtual java/util/Random.nextFloat ()F
      // 103: fsub
      // 104: ldc 0.2
      // 106: nop
      // 107: fmul
      // 108: fconst_1
      // 109: fadd
      // 10a: ldc 1.8
      // 10c: nop
      // 10d: fmul
      // 10e: invokevirtual v9i.lhu (Ljava/lang/String;FF)V
      // 111: goto 118
      // 114: invokestatic v9i.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 0
      // 119: iload 3
      // 11a: ifeq 17e
      // 11d: getfield v9i.b2x I
      // 120: goto 127
      // 123: invokestatic v9i.a (Loov;)Loov;
      // 126: athrow
      // 127: ifle 17d
      // 12a: aload 0
      // 12b: iload 3
      // 12c: ifeq 17e
      // 12f: goto 136
      // 132: invokestatic v9i.a (Loov;)Loov;
      // 135: athrow
      // 136: getfield v9i.uf7 Ljava/util/UUID;
      // 139: ifnull 17d
      // 13c: goto 143
      // 13f: invokestatic v9i.a (Loov;)Loov;
      // 142: athrow
      // 143: aload 0
      // 144: iload 3
      // 145: ifeq 17e
      // 148: goto 14f
      // 14b: invokestatic v9i.a (Loov;)Loov;
      // 14e: athrow
      // 14f: invokevirtual v9i.myo ()Lg_3;
      // 152: ifnonnull 17d
      // 155: goto 15c
      // 158: invokestatic v9i.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 0
      // 15d: getfield v9i.oay Lt9d;
      // 160: aload 0
      // 161: getfield v9i.uf7 Ljava/util/UUID;
      // 164: invokevirtual OpaquePredicate.hlz (Ljava/util/UUID;)Lha9;
      // 167: astore 5
      // 169: aload 0
      // 16a: aload 5
      // 16c: invokevirtual v9i.iar (Lg_3;)V
      // 16f: aload 0
      // 170: aload 5
      // 172: putfield v9i.mxp Lha9;
      // 175: aload 0
      // 176: aload 0
      // 177: invokevirtual v9i.ii0 ()I
      // 17a: putfield v9i.gig I
      // 17d: aload 0
      // 17e: invokespecial EntityCreeper.qar ()V
      // 181: return
   }

   @Override
   public boolean iaw() {
      try {
         if (this.oay.rbk() != v66.na2) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   @Override
   public boolean m63() {
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
      // 05: getfield v9i.oay Lt9d;
      // 08: aload 0
      // 09: invokevirtual v9i.aaw ()Lnh4;
      // 0c: aload 0
      // 0d: invokevirtual OpaquePredicate.g17 (Lnh4;Li2h;)Z
      // 10: iload 1
      // 11: ifeq 36
      // 14: ifeq 68
      // 17: goto 1e
      // 1a: invokestatic v9i.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield v9i.oay Lt9d;
      // 22: aload 0
      // 23: aload 0
      // 24: invokevirtual v9i.aaw ()Lnh4;
      // 27: invokevirtual OpaquePredicate.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 2a: invokeinterface java/util/List.isEmpty ()Z 1
      // 2f: goto 36
      // 32: invokestatic v9i.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 1
      // 37: ifeq 56
      // 3a: ifeq 68
      // 3d: goto 44
      // 40: invokestatic v9i.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield v9i.oay Lt9d;
      // 48: aload 0
      // 49: invokevirtual v9i.aaw ()Lnh4;
      // 4c: invokevirtual OpaquePredicate.hhd (Lnh4;)Z
      // 4f: goto 56
      // 52: invokestatic v9i.a (Loov;)Loov;
      // 55: athrow
      // 56: iload 1
      // 57: ifeq 65
      // 5a: ifne 68
      // 5d: goto 64
      // 60: invokestatic v9i.a (Loov;)Loov;
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v9i.c J
      // 03: ldc2_w 57928319076904
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial EntityCreeper.srs (Lbdo;)V
      // 12: aload 1
      // 13: sipush 717
      // 16: ldc2_w 3144846488471758571
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic r (IJ)Ljava/lang/String; bsm=v9i.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: iload 4
      // 23: ifeq 77
      // 26: aload 0
      // 27: getfield v9i.b2x I
      // 2a: i2s
      // 2b: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 2e: aload 0
      // 2f: getfield v9i.uf7 Ljava/util/UUID;
      // 32: ifnull 61
      // 35: goto 3c
      // 38: invokestatic v9i.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 1
      // 3d: sipush 15263
      // 40: ldc2_w 8683609955169689535
      // 43: lload 2
      // 44: lxor
      // 45: invokedynamic r (IJ)Ljava/lang/String; bsm=v9i.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: nop
      // 4b: aload 0
      // 4c: getfield v9i.uf7 Ljava/util/UUID;
      // 4f: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 52: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 55: iload 4
      // 57: ifne 7d
      // 5a: goto 61
      // 5d: invokestatic v9i.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 1
      // 62: sipush 14889
      // 65: ldc2_w 4363864508916456974
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic r (IJ)Ljava/lang/String; bsm=v9i.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: nop
      // 70: goto 77
      // 73: invokestatic v9i.a (Loov;)Loov;
      // 76: athrow
      // 77: ldc ""
      // 79: nop
      // 7a: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 7d: return
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic v9i.c J
      // 03: ldc2_w 72573031212675
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial EntityCreeper.cjb (Lbdo;)V
      // 0d: invokestatic OpaquePredicate.b ()I
      // 10: aload 0
      // 11: aload 1
      // 12: sipush 18640
      // 15: ldc2_w 1550979548231024724
      // 18: lload 2
      // 19: lxor
      // 1a: invokedynamic r (IJ)Ljava/lang/String; bsm=v9i.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f: nop
      // 20: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 23: putfield v9i.b2x I
      // 26: istore 4
      // 28: aload 1
      // 29: sipush 14889
      // 2c: ldc2_w 4363980377383580325
      // 2f: lload 2
      // 30: lxor
      // 31: invokedynamic r (IJ)Ljava/lang/String; bsm=v9i.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: nop
      // 37: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 3a: astore 5
      // 3c: iload 4
      // 3e: ifeq 60
      // 41: aload 5
      // 43: invokevirtual java/lang/String.length ()I
      // 46: ifle 99
      // 49: goto 50
      // 4c: invokestatic v9i.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 5
      // 53: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 56: putfield v9i.uf7 Ljava/util/UUID;
      // 59: goto 60
      // 5c: invokestatic v9i.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield v9i.oay Lt9d;
      // 64: aload 0
      // 65: getfield v9i.uf7 Ljava/util/UUID;
      // 68: invokevirtual OpaquePredicate.hlz (Ljava/util/UUID;)Lha9;
      // 6b: astore 6
      // 6d: aload 0
      // 6e: aload 6
      // 70: invokevirtual v9i.iar (Lg_3;)V
      // 73: iload 4
      // 75: ifeq 91
      // 78: aload 6
      // 7a: ifnull 99
      // 7d: goto 84
      // 80: invokestatic v9i.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: aload 6
      // 87: putfield v9i.mxp Lha9;
      // 8a: goto 91
      // 8d: invokestatic v9i.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: aload 0
      // 93: invokevirtual v9i.ii0 ()I
      // 96: putfield v9i.gig I
      // 99: return
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 21
      // 09: aload 1
      // 0a: invokevirtual v9i.nss (Lofh;)Z
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic v9i.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic v9i.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: invokevirtual ofh.nra ()Li2h;
      // 21: astore 4
      // 23: aload 4
      // 25: instanceof ha9
      // 28: iload 3
      // 29: ifne 49
      // 2c: ifeq 43
      // 2f: goto 36
      // 32: invokestatic v9i.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: aload 4
      // 39: invokespecial v9i.xxl (Li2h;)V
      // 3c: goto 43
      // 3f: invokestatic v9i.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: aload 1
      // 45: fload 2
      // 46: invokespecial EntityCreeper.m1t (Lofh;F)Z
      // 49: ireturn
   }

   private void xxl(EntityLivingBase param1) {
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
      // 05: sipush 400
      // 08: aload 0
      // 09: getfield v9i.z2d Ljava/util/Random;
      // 0c: sipush 400
      // 0f: invokevirtual java/util/Random.nextInt (I)I
      // 12: iadd
      // 13: putfield v9i.b2x I
      // 16: aload 0
      // 17: aload 0
      // 18: iload 2
      // 19: ifeq 41
      // 1c: getfield v9i.z2d Ljava/util/Random;
      // 1f: bipush 40
      // 21: invokevirtual java/util/Random.nextInt (I)I
      // 24: putfield v9i.xvr I
      // 27: aload 1
      // 28: instanceof Entity
      // 2b: ifeq 44
      // 2e: goto 35
      // 31: invokestatic v9i.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: checkcast Entity
      // 3a: goto 41
      // 3d: invokestatic v9i.a (Loov;)Loov;
      // 40: athrow
      // 41: invokevirtual v9i.iar (Lg_3;)V
      // 44: return
   }

   public boolean pdc() {
      int var1 = OpaquePredicate.b();

      try {
         if (var1 == 0) {
            return (boolean)this.b2x;
         }

         if (this.b2x > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public String _n1() {
      long var1 = c ^ 58897601048670L;
      return f<"r">(17991, 2403966433366382611L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 51884830211878L;
      return f<"r">(15956, 3280085129070112633L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 17895646955880L;
      return f<"r">(29422, 235353182042363275L ^ var1);
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var4 = this.z2d.nextInt(2 + var2);
      int var10000 = OpaquePredicate.c();
      int var5 = 0;
      int var3 = var10000;

      while (true) {
         if (var5 < var4) {
            try {
               this.e70(xbr.ii5, 1);
               var5++;
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var6) {
               throw a(var6);
            }
         }

         var4 = this.z2d.nextInt(2 + var2);
         break;
      }

      var5 = 0;

      while (var5 < var4) {
         this.e70(xbr.mzp, 1);
         var5++;
         if (var3 != 0) {
            break;
         }
      }
   }

   @Override
   public boolean hp6(ha9 var1) {
      return false;
   }

   @Override
   public void z3m() {
      this.e70(xbr.jtr, 1);
   }

   @Override
   public void _58(css var1) {
      this.fga(0, new erg(xbr.g8a));
   }

   @Override
   public ps6 hx8(css var1, ps6 var2) {
      super.hx8(var1, var2);
      this.tgp(false);
      return var2;
   }

   public static void mi9(v9i var0, EntityLivingBase var1) {
      var0.xxl(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8783268473966143034L, -5011128740381533784L, MethodHandles.lookup().lookupClass()).a(10654312939725L);
      // $VF: monitorexit
      c = var10000;
      long var9 = c ^ 104442116343119L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "½sM¸ t\f\u0005¶¾B±}ò¥G\u0010aÀ\u001a\u0014¸u\u0090\u0000]\u0081\u0014nÏÌÃ?(p°4Â_\u001eþ¦¨\u009eð¤lA*¬\u0010²/öT\u0081È³Þ\u0001\u008f\u001atù\u00132\u0006\u0000PIÄqÙÂ(ú£[¼\u000enµ\rZÈy\u0097\u0085\u0091ö\u0018\u0005Á²s\u008d\u0007Êl&è¥t\f8t\u0097\u0015\u0085L\u0016&ôM\u0084(\u0015ew(h-hÑN\u0098³b\u008c2O\u009dýþdïh \u0019\býc\u0004%\u0013!>¥±v¡ÓYÀ\u0098¯(ºKe\u000f4jë\u0095KX\nM\u008c\u0011\u009c\u0004\u0089÷$\u0092\u0007ÁÑAªçÕY\u0013Y¼nMà\u008e\u000e\u0086\u0084C*\u0010¤ðm(ÞóÔù÷·^Gd\u008a\u0003q@\u0007o\u0092\u007féÙÛòAÉsa\u0018\u0091ï¬P¬\u001f¿0Èu²D'\u0017&ìY\b\u001cí6\u0096èX(óvúG¢óÄ\u007f\u009fuïèwI\u009cXÑæÇn D ºp\u001a";
      int var6 = "½sM¸ t\f\u0005¶¾B±}ò¥G\u0010aÀ\u001a\u0014¸u\u0090\u0000]\u0081\u0014nÏÌÃ?(p°4Â_\u001eþ¦¨\u009eð¤lA*¬\u0010²/öT\u0081È³Þ\u0001\u008f\u001atù\u00132\u0006\u0000PIÄqÙÂ(ú£[¼\u000enµ\rZÈy\u0097\u0085\u0091ö\u0018\u0005Á²s\u008d\u0007Êl&è¥t\f8t\u0097\u0015\u0085L\u0016&ôM\u0084(\u0015ew(h-hÑN\u0098³b\u008c2O\u009dýþdïh \u0019\býc\u0004%\u0013!>¥±v¡ÓYÀ\u0098¯(ºKe\u000f4jë\u0095KX\nM\u008c\u0011\u009c\u0004\u0089÷$\u0092\u0007ÁÑAªçÕY\u0013Y¼nMà\u008e\u000e\u0086\u0084C*\u0010¤ðm(ÞóÔù÷·^Gd\u008a\u0003q@\u0007o\u0092\u007féÙÛòAÉsa\u0018\u0091ï¬P¬\u001f¿0Èu²D'\u0017&ìY\b\u001cí6\u0096èX(óvúG¢óÄ\u007f\u009fuïèwI\u009cXÑæÇn D ºp\u001a"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = g(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     x = var7;
                     y = new String[10];
                     abu = UUID.fromString(f<"r">(1441, 2243142562099359463L ^ var9));
                     geg = new xk5(abu, f<"r">(14738, 6817499815699534555L ^ var9), 0.05, 0).d2_(false);
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

                  var4 = "®#ùNn\u0097\u001dn¬/híz\u0010¯\u0003\fìOåT\b°s\u0011\u0007þ\u001eÚÞ-ÖcÁ \u0014o\u0098\u000eI\u0010qëÍ$\u000eh\u001f\u0091üG\u00992'¢\u008c\u0083";
                  var6 = "®#ùNn\u0097\u001dn¬/híz\u0010¯\u0003\fìOåT\b°s\u0011\u0007þ\u001eÚÞ-ÖcÁ \u0014o\u0098\u000eI\u0010qëÍ$\u000eh\u001f\u0091üG\u00992'¢\u008c\u0083"
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

   private static String g(byte[] var0) {
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

   private static String f(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22602;
      if (y[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])z.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               z.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("v9i", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = x[var5].getBytes("ISO-8859-1");
         y[var5] = g(((Cipher)var4[0]).doFinal(var9));
      }

      return y[var5];
   }

   private static Object f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("v9i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
