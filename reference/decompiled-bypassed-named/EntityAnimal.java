import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class EntityAnimal extends u_a {
   private static final long c;
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public EntityAnimal(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.5F, 0.9F);
      this.f37(true);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, new Byte((byte)0));
   }

   @Override
   public float o23() {
      return 0.1F;
   }

   @Override
   public float b33() {
      return super.b33() * 0.95F;
   }

   @Override
   public String _n1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic EntityAnimal.c J
      // 03: ldc2_w 23334868432073
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual EntityAnimal.qm1 ()Z
      // 10: iload 3
      // 11: ifne 2d
      // 14: ifeq 38
      // 17: goto 1e
      // 1a: invokestatic EntityAnimal.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield EntityAnimal.z2d Ljava/util/Random;
      // 22: bipush 4
      // 23: invokevirtual java/util/Random.nextInt (I)I
      // 26: goto 2d
      // 29: invokestatic EntityAnimal.a (Loov;)Loov;
      // 2c: athrow
      // 2d: ifeq 38
      // 30: aconst_null
      // 31: goto 46
      // 34: invokestatic EntityAnimal.a (Loov;)Loov;
      // 37: athrow
      // 38: sipush 19913
      // 3b: ldc2_w 573074793212939033
      // 3e: lload 1
      // 3f: lxor
      // 40: invokedynamic t (IJ)Ljava/lang/String; bsm=EntityAnimal.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: areturn
   }

   @Override
   public String wcg() {
      long var1 = c ^ 17146998569905L;
      return d<"t">(21691, 7688293205193071888L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 53801439694335L;
      return d<"t">(22572, 3799188196108609483L ^ var1);
   }

   @Override
   public boolean tfh() {
      return false;
   }

   @Override
   public void v4n(EntityLivingBase var1) {
   }

   @Override
   public void _v7() {
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(6.0);
   }

   public boolean qm1() {
      int var1 = OpaquePredicate.c();

      try {
         int var10000 = this.oit.miz(16) & 1;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void f37(boolean param1) {
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
      // 05: getfield EntityAnimal.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: istore 3
      // 0e: iload 2
      // 0f: ifeq 34
      // 12: iload 1
      // 13: ifeq 38
      // 16: goto 1d
      // 19: invokestatic EntityAnimal.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield EntityAnimal.oit Lwl1;
      // 21: bipush 16
      // 23: iload 3
      // 24: bipush 1
      // 25: ior
      // 26: i2b
      // 27: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2a: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2d: goto 34
      // 30: invokestatic EntityAnimal.a (Loov;)Loov;
      // 33: athrow
      // 34: iload 2
      // 35: ifne 50
      // 38: aload 0
      // 39: getfield EntityAnimal.oit Lwl1;
      // 3c: bipush 16
      // 3e: iload 3
      // 3f: bipush -2
      // 41: iand
      // 42: i2b
      // 43: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 46: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 49: goto 50
      // 4c: invokestatic EntityAnimal.a (Loov;)Loov;
      // 4f: athrow
      // 50: return
   }

   @Override
   public void xx_() {
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
      // 05: invokespecial u_a.xx_ ()V
      // 08: aload 0
      // 09: iload 1
      // 0a: ifne 50
      // 0d: invokevirtual EntityAnimal.qm1 ()Z
      // 10: ifeq 48
      // 13: goto 1a
      // 16: invokestatic EntityAnimal.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 0
      // 1c: aload 0
      // 1d: dconst_0
      // 1e: dup2_x1
      // 1f: putfield EntityAnimal.bw4 D
      // 22: dup2_x1
      // 23: putfield EntityAnimal.mop D
      // 26: putfield EntityAnimal.icv D
      // 29: aload 0
      // 2a: aload 0
      // 2b: getfield EntityAnimal.kfp D
      // 2e: invokestatic fe6.jqf (D)I
      // 31: i2d
      // 32: dconst_1
      // 33: dadd
      // 34: aload 0
      // 35: getfield EntityAnimal.ikl F
      // 38: f2d
      // 39: dsub
      // 3a: putfield EntityAnimal.kfp D
      // 3d: iload 1
      // 3e: ifeq 5b
      // 41: goto 48
      // 44: invokestatic EntityAnimal.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: goto 50
      // 4c: invokestatic EntityAnimal.a (Loov;)Loov;
      // 4f: athrow
      // 50: dup
      // 51: getfield EntityAnimal.mop D
      // 54: ldc2_w 0.6000000238418579
      // 57: dmul
      // 58: putfield EntityAnimal.mop D
      // 5b: return
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
      // 000: aload 0
      // 001: invokespecial u_a.qar ()V
      // 004: invokestatic OpaquePredicate.b ()I
      // 007: new mew
      // 00a: dup
      // 00b: aload 0
      // 00c: invokespecial mew.<init> (Li2h;)V
      // 00f: astore 2
      // 010: istore 1
      // 011: aload 2
      // 012: invokevirtual mew.nuv ()Lmew;
      // 015: astore 3
      // 016: aload 0
      // 017: iload 1
      // 018: ifeq 0e3
      // 01b: invokevirtual EntityAnimal.qm1 ()Z
      // 01e: ifeq 0db
      // 021: goto 028
      // 024: invokestatic EntityAnimal.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 0
      // 029: getfield EntityAnimal.oay Lt9d;
      // 02c: aload 3
      // 02d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 030: invokeinterface zfz.r_y ()Le0x; 1
      // 035: invokevirtual e0x.y0n ()Z
      // 038: iload 1
      // 039: ifeq 089
      // 03c: goto 043
      // 03f: invokestatic EntityAnimal.a (Loov;)Loov;
      // 042: athrow
      // 043: ifne 06d
      // 046: goto 04d
      // 049: invokestatic EntityAnimal.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: bipush 0
      // 04f: invokevirtual EntityAnimal.f37 (Z)V
      // 052: aload 0
      // 053: getfield EntityAnimal.oay Lt9d;
      // 056: aconst_null
      // 057: checkcast ha9
      // 05a: sipush 1015
      // 05d: aload 2
      // 05e: bipush 0
      // 05f: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // 062: iload 1
      // 063: ifne 2f0
      // 066: goto 06d
      // 069: invokestatic EntityAnimal.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 0
      // 06e: iload 1
      // 06f: ifeq 0a3
      // 072: goto 079
      // 075: invokestatic EntityAnimal.a (Loov;)Loov;
      // 078: athrow
      // 079: getfield EntityAnimal.z2d Ljava/util/Random;
      // 07c: sipush 200
      // 07f: invokevirtual java/util/Random.nextInt (I)I
      // 082: goto 089
      // 085: invokestatic EntityAnimal.a (Loov;)Loov;
      // 088: athrow
      // 089: ifne 0a2
      // 08c: aload 0
      // 08d: aload 0
      // 08e: getfield EntityAnimal.z2d Ljava/util/Random;
      // 091: sipush 360
      // 094: invokevirtual java/util/Random.nextInt (I)I
      // 097: i2f
      // 098: putfield EntityAnimal.q6c F
      // 09b: goto 0a2
      // 09e: invokestatic EntityAnimal.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield EntityAnimal.oay Lt9d;
      // 0a6: iload 1
      // 0a7: ifeq 0cb
      // 0aa: aload 0
      // 0ab: ldc2_w 4.0
      // 0ae: invokevirtual OpaquePredicate.a_q (Li2h;D)Lha9;
      // 0b1: ifnull 2f0
      // 0b4: goto 0bb
      // 0b7: invokestatic EntityAnimal.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: bipush 0
      // 0bd: invokevirtual EntityAnimal.f37 (Z)V
      // 0c0: aload 0
      // 0c1: getfield EntityAnimal.oay Lt9d;
      // 0c4: goto 0cb
      // 0c7: invokestatic EntityAnimal.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aconst_null
      // 0cc: checkcast ha9
      // 0cf: sipush 1015
      // 0d2: aload 2
      // 0d3: bipush 0
      // 0d4: invokevirtual OpaquePredicate.pbs (Lha9;ILmew;I)V
      // 0d7: iload 1
      // 0d8: ifne 2f0
      // 0db: aload 0
      // 0dc: goto 0e3
      // 0df: invokestatic EntityAnimal.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: getfield EntityAnimal.ick Lmew;
      // 0e6: iload 1
      // 0e7: ifeq 14c
      // 0ea: ifnull 13d
      // 0ed: goto 0f4
      // 0f0: invokestatic EntityAnimal.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: iload 1
      // 0f6: ifeq 139
      // 0f9: goto 100
      // 0fc: invokestatic EntityAnimal.a (Loov;)Loov;
      // 0ff: athrow
      // 100: getfield EntityAnimal.oay Lt9d;
      // 103: aload 0
      // 104: getfield EntityAnimal.ick Lmew;
      // 107: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 10a: ifeq 131
      // 10d: goto 114
      // 110: invokestatic EntityAnimal.a (Loov;)Loov;
      // 113: athrow
      // 114: aload 0
      // 115: getfield EntityAnimal.ick Lmew;
      // 118: iload 1
      // 119: ifeq 14c
      // 11c: goto 123
      // 11f: invokestatic EntityAnimal.a (Loov;)Loov;
      // 122: athrow
      // 123: invokevirtual mew.getY ()I
      // 126: bipush 1
      // 127: if_icmpge 13d
      // 12a: goto 131
      // 12d: invokestatic EntityAnimal.a (Loov;)Loov;
      // 130: athrow
      // 131: aload 0
      // 132: goto 139
      // 135: invokestatic EntityAnimal.a (Loov;)Loov;
      // 138: athrow
      // 139: aconst_null
      // 13a: putfield EntityAnimal.ick Lmew;
      // 13d: aload 0
      // 13e: iload 1
      // 13f: ifeq 1a0
      // 142: getfield EntityAnimal.ick Lmew;
      // 145: goto 14c
      // 148: invokestatic EntityAnimal.a (Loov;)Loov;
      // 14b: athrow
      // 14c: ifnull 19f
      // 14f: aload 0
      // 150: iload 1
      // 151: ifeq 1a0
      // 154: goto 15b
      // 157: invokestatic EntityAnimal.a (Loov;)Loov;
      // 15a: athrow
      // 15b: getfield EntityAnimal.z2d Ljava/util/Random;
      // 15e: bipush 30
      // 160: invokevirtual java/util/Random.nextInt (I)I
      // 163: ifeq 19f
      // 166: goto 16d
      // 169: invokestatic EntityAnimal.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aload 0
      // 16e: getfield EntityAnimal.ick Lmew;
      // 171: aload 0
      // 172: getfield EntityAnimal.o2v D
      // 175: d2i
      // 176: i2d
      // 177: aload 0
      // 178: getfield EntityAnimal.kfp D
      // 17b: d2i
      // 17c: i2d
      // 17d: aload 0
      // 17e: getfield EntityAnimal.vbd D
      // 181: d2i
      // 182: i2d
      // 183: invokevirtual mew.p4e (DDD)D
      // 186: ldc2_w 4.0
      // 189: dcmpg
      // 18a: iload 1
      // 18b: ifeq 1f4
      // 18e: goto 195
      // 191: invokestatic EntityAnimal.a (Loov;)Loov;
      // 194: athrow
      // 195: ifge 1ed
      // 198: goto 19f
      // 19b: invokestatic EntityAnimal.a (Loov;)Loov;
      // 19e: athrow
      // 19f: aload 0
      // 1a0: new mew
      // 1a3: dup
      // 1a4: aload 0
      // 1a5: getfield EntityAnimal.o2v D
      // 1a8: d2i
      // 1a9: aload 0
      // 1aa: getfield EntityAnimal.z2d Ljava/util/Random;
      // 1ad: bipush 7
      // 1af: invokevirtual java/util/Random.nextInt (I)I
      // 1b2: iadd
      // 1b3: aload 0
      // 1b4: getfield EntityAnimal.z2d Ljava/util/Random;
      // 1b7: bipush 7
      // 1b9: invokevirtual java/util/Random.nextInt (I)I
      // 1bc: isub
      // 1bd: aload 0
      // 1be: getfield EntityAnimal.kfp D
      // 1c1: d2i
      // 1c2: aload 0
      // 1c3: getfield EntityAnimal.z2d Ljava/util/Random;
      // 1c6: bipush 6
      // 1c8: invokevirtual java/util/Random.nextInt (I)I
      // 1cb: iadd
      // 1cc: bipush 2
      // 1cd: isub
      // 1ce: aload 0
      // 1cf: getfield EntityAnimal.vbd D
      // 1d2: d2i
      // 1d3: aload 0
      // 1d4: getfield EntityAnimal.z2d Ljava/util/Random;
      // 1d7: bipush 7
      // 1d9: invokevirtual java/util/Random.nextInt (I)I
      // 1dc: iadd
      // 1dd: aload 0
      // 1de: getfield EntityAnimal.z2d Ljava/util/Random;
      // 1e1: bipush 7
      // 1e3: invokevirtual java/util/Random.nextInt (I)I
      // 1e6: isub
      // 1e7: invokespecial mew.<init> (III)V
      // 1ea: putfield EntityAnimal.ick Lmew;
      // 1ed: aload 0
      // 1ee: getfield EntityAnimal.ick Lmew;
      // 1f1: invokevirtual mew.getX ()I
      // 1f4: i2d
      // 1f5: ldc2_w 0.5
      // 1f8: dadd
      // 1f9: aload 0
      // 1fa: getfield EntityAnimal.o2v D
      // 1fd: dsub
      // 1fe: dstore 4
      // 200: aload 0
      // 201: getfield EntityAnimal.ick Lmew;
      // 204: invokevirtual mew.getY ()I
      // 207: i2d
      // 208: ldc2_w 0.1
      // 20b: dadd
      // 20c: aload 0
      // 20d: getfield EntityAnimal.kfp D
      // 210: dsub
      // 211: dstore 6
      // 213: aload 0
      // 214: getfield EntityAnimal.ick Lmew;
      // 217: invokevirtual mew.getZ ()I
      // 21a: i2d
      // 21b: ldc2_w 0.5
      // 21e: dadd
      // 21f: aload 0
      // 220: getfield EntityAnimal.vbd D
      // 223: dsub
      // 224: dstore 8
      // 226: aload 0
      // 227: dup
      // 228: getfield EntityAnimal.icv D
      // 22b: dload 4
      // 22d: invokestatic java/lang/Math.signum (D)D
      // 230: ldc2_w 0.5
      // 233: dmul
      // 234: aload 0
      // 235: getfield EntityAnimal.icv D
      // 238: dsub
      // 239: ldc2_w 0.10000000149011612
      // 23c: dmul
      // 23d: dadd
      // 23e: putfield EntityAnimal.icv D
      // 241: aload 0
      // 242: dup
      // 243: getfield EntityAnimal.mop D
      // 246: dload 6
      // 248: invokestatic java/lang/Math.signum (D)D
      // 24b: ldc2_w 0.699999988079071
      // 24e: dmul
      // 24f: aload 0
      // 250: getfield EntityAnimal.mop D
      // 253: dsub
      // 254: ldc2_w 0.10000000149011612
      // 257: dmul
      // 258: dadd
      // 259: putfield EntityAnimal.mop D
      // 25c: aload 0
      // 25d: dup
      // 25e: getfield EntityAnimal.bw4 D
      // 261: dload 8
      // 263: invokestatic java/lang/Math.signum (D)D
      // 266: ldc2_w 0.5
      // 269: dmul
      // 26a: aload 0
      // 26b: getfield EntityAnimal.bw4 D
      // 26e: dsub
      // 26f: ldc2_w 0.10000000149011612
      // 272: dmul
      // 273: dadd
      // 274: putfield EntityAnimal.bw4 D
      // 277: aload 0
      // 278: getfield EntityAnimal.bw4 D
      // 27b: aload 0
      // 27c: getfield EntityAnimal.icv D
      // 27f: invokestatic fe6.yr8 (DD)D
      // 282: ldc2_w 180.0
      // 285: dmul
      // 286: ldc2_w 3.141592653589793
      // 289: ddiv
      // 28a: d2f
      // 28b: ldc 90.0
      // 28d: nop
      // 28e: fsub
      // 28f: fstore 10
      // 291: fload 10
      // 293: aload 0
      // 294: getfield EntityAnimal.x5k F
      // 297: fsub
      // 298: invokestatic fe6.qsy (F)F
      // 29b: fstore 11
      // 29d: aload 0
      // 29e: ldc 0.5
      // 2a0: nop
      // 2a1: putfield EntityAnimal.ooc F
      // 2a4: aload 0
      // 2a5: dup
      // 2a6: getfield EntityAnimal.x5k F
      // 2a9: fload 11
      // 2ab: fadd
      // 2ac: putfield EntityAnimal.x5k F
      // 2af: aload 0
      // 2b0: getfield EntityAnimal.z2d Ljava/util/Random;
      // 2b3: bipush 100
      // 2b5: invokevirtual java/util/Random.nextInt (I)I
      // 2b8: iload 1
      // 2b9: ifeq 2e8
      // 2bc: ifne 2f0
      // 2bf: goto 2c6
      // 2c2: invokestatic EntityAnimal.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: iload 1
      // 2c8: ifeq 2ec
      // 2cb: goto 2d2
      // 2ce: invokestatic EntityAnimal.a (Loov;)Loov;
      // 2d1: athrow
      // 2d2: getfield EntityAnimal.oay Lt9d;
      // 2d5: aload 3
      // 2d6: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2d9: invokeinterface zfz.r_y ()Le0x; 1
      // 2de: invokevirtual e0x.y0n ()Z
      // 2e1: goto 2e8
      // 2e4: invokestatic EntityAnimal.a (Loov;)Loov;
      // 2e7: athrow
      // 2e8: ifeq 2f0
      // 2eb: aload 0
      // 2ec: bipush 1
      // 2ed: invokevirtual EntityAnimal.f37 (Z)V
      // 2f0: return
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public void ibc(float var1, float var2) {
   }

   @Override
   public void ihp(double var1, boolean var3, e0x var4, mew var5) {
   }

   @Override
   public boolean l__() {
      return true;
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
      // 05: aload 1
      // 06: invokevirtual EntityAnimal.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifne 24
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic EntityAnimal.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic EntityAnimal.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield EntityAnimal.oay Lt9d;
      // 21: getfield OpaquePredicate.v0f Z
      // 24: iload 3
      // 25: ifne 5d
      // 28: ifne 57
      // 2b: goto 32
      // 2e: invokestatic EntityAnimal.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual EntityAnimal.qm1 ()Z
      // 36: iload 3
      // 37: ifne 5d
      // 3a: goto 41
      // 3d: invokestatic EntityAnimal.a (Loov;)Loov;
      // 40: athrow
      // 41: ifeq 57
      // 44: goto 4b
      // 47: invokestatic EntityAnimal.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: bipush 0
      // 4d: invokevirtual EntityAnimal.f37 (Z)V
      // 50: goto 57
      // 53: invokestatic EntityAnimal.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: aload 1
      // 59: fload 2
      // 5a: invokespecial u_a.m1t (Lofh;F)Z
      // 5d: ireturn
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 108478016479764L;
      super.cjb(var1);
      this.oit.c66(16, var1.r_t(d<"t">(27114, 2082492557290994146L ^ var2)));
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 22021454696127L;
      super.srs(var1);
      var1.atr(d<"t">(10453, 9191859427841987697L ^ var2), this.oit.miz(16));
   }

   @Override
   public boolean iaw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: new mew
      // 07: dup
      // 08: aload 0
      // 09: getfield EntityAnimal.o2v D
      // 0c: aload 0
      // 0d: invokevirtual EntityAnimal.aaw ()Lnh4;
      // 10: getfield nh4.bx_ D
      // 13: aload 0
      // 14: getfield EntityAnimal.vbd D
      // 17: invokespecial mew.<init> (DDD)V
      // 1a: astore 2
      // 1b: aload 2
      // 1c: invokevirtual mew.getY ()I
      // 1f: iload 1
      // 20: ifne 42
      // 23: aload 0
      // 24: getfield EntityAnimal.oay Lt9d;
      // 27: invokevirtual OpaquePredicate._s3 ()I
      // 2a: if_icmplt 3a
      // 2d: goto 34
      // 30: invokestatic EntityAnimal.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic EntityAnimal.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield EntityAnimal.oay Lt9d;
      // 3e: aload 2
      // 3f: invokevirtual OpaquePredicate.rts (Lmew;)I
      // 42: istore 3
      // 43: bipush 4
      // 44: istore 4
      // 46: aload 0
      // 47: aload 0
      // 48: getfield EntityAnimal.oay Lt9d;
      // 4b: invokevirtual OpaquePredicate.mp6 ()Ljava/util/Calendar;
      // 4e: invokespecial EntityAnimal.lk4 (Ljava/util/Calendar;)Z
      // 51: iload 1
      // 52: ifne 75
      // 55: ifeq 67
      // 58: goto 5f
      // 5b: invokestatic EntityAnimal.a (Loov;)Loov;
      // 5e: athrow
      // 5f: bipush 7
      // 61: istore 4
      // 63: iload 1
      // 64: ifeq 89
      // 67: aload 0
      // 68: getfield EntityAnimal.z2d Ljava/util/Random;
      // 6b: invokevirtual java/util/Random.nextBoolean ()Z
      // 6e: goto 75
      // 71: invokestatic EntityAnimal.a (Loov;)Loov;
      // 74: athrow
      // 75: iload 1
      // 76: ifne 8a
      // 79: ifeq 89
      // 7c: goto 83
      // 7f: invokestatic EntityAnimal.a (Loov;)Loov;
      // 82: athrow
      // 83: bipush 0
      // 84: ireturn
      // 85: invokestatic EntityAnimal.a (Loov;)Loov;
      // 88: athrow
      // 89: iload 3
      // 8a: iload 1
      // 8b: ifne a9
      // 8e: aload 0
      // 8f: getfield EntityAnimal.z2d Ljava/util/Random;
      // 92: iload 4
      // 94: invokevirtual java/util/Random.nextInt (I)I
      // 97: if_icmple ac
      // 9a: goto a1
      // 9d: invokestatic EntityAnimal.a (Loov;)Loov;
      // a0: athrow
      // a1: bipush 0
      // a2: goto a9
      // a5: invokestatic EntityAnimal.a (Loov;)Loov;
      // a8: athrow
      // a9: goto b0
      // ac: aload 0
      // ad: invokespecial u_a.iaw ()Z
      // b0: ireturn
   }

   private boolean lk4(Calendar param1) {
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
      // 05: bipush 2
      // 06: invokevirtual java/util/Calendar.get (I)I
      // 09: bipush 1
      // 0a: iadd
      // 0b: bipush 10
      // 0d: iload 2
      // 0e: ifne 47
      // 11: if_icmpne 37
      // 14: goto 1b
      // 17: invokestatic EntityAnimal.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: bipush 5
      // 1d: invokevirtual java/util/Calendar.get (I)I
      // 20: iload 2
      // 21: ifne 71
      // 24: goto 2b
      // 27: invokestatic EntityAnimal.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 20
      // 2d: if_icmpge 70
      // 30: goto 37
      // 33: invokestatic EntityAnimal.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 1
      // 38: bipush 2
      // 39: invokevirtual java/util/Calendar.get (I)I
      // 3c: bipush 1
      // 3d: iadd
      // 3e: bipush 11
      // 40: goto 47
      // 43: invokestatic EntityAnimal.a (Loov;)Loov;
      // 46: athrow
      // 47: iload 2
      // 48: ifne 6d
      // 4b: if_icmpne 74
      // 4e: goto 55
      // 51: invokestatic EntityAnimal.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 1
      // 56: bipush 5
      // 57: invokevirtual java/util/Calendar.get (I)I
      // 5a: iload 2
      // 5b: ifne 71
      // 5e: goto 65
      // 61: invokestatic EntityAnimal.a (Loov;)Loov;
      // 64: athrow
      // 65: bipush 3
      // 66: goto 6d
      // 69: invokestatic EntityAnimal.a (Loov;)Loov;
      // 6c: athrow
      // 6d: if_icmpgt 74
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   @Override
   public float c5y() {
      return this.ikl / 2.0F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4003310342771188223L, -318349822490788032L, MethodHandles.lookup().lookupClass()).a(84808929335646L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 137937749757193L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "ô\u001c\u0007½n\u009aõ\u0092*¤xCª*ù\\³º^\u008fÃü~Ü\u0018\u0080ÀP2½,ÐÓ\u0085\\éXoÚÑÇ\u0006¢7Ù\u001bYð\u000f\u0018\u009b±\u008d\u0016\u0080\u0012ÅyN\u008a\u009eÅìG<\t\u0018ArÇøPï®";
      int var8 = "ô\u001c\u0007½n\u009aõ\u0092*¤xCª*ù\\³º^\u008fÃü~Ü\u0018\u0080ÀP2½,ÐÓ\u0085\\éXoÚÑÇ\u0006¢7Ù\u001bYð\u000f\u0018\u009b±\u008d\u0016\u0080\u0012ÅyN\u008a\u009eÅìG<\t\u0018ArÇøPï®"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     g = new String[5];
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

                  var6 = "ëÎ%\u0090pÎQ6,\u0001¾\u007f©m\u0086KGøÉ\u001e\u0092\fs÷Äº¼`Çéy\u009f\u0018¦²\u0004#&d\u0000ýµé«þ¦QÏ\u0089@è(Ä-\u009e¹|";
                  var8 = "ëÎ%\u0090pÎQ6,\u0001¾\u007f©m\u0086KGøÉ\u001e\u0092\fs÷Äº¼`Çéy\u009f\u0018¦²\u0004#&d\u0000ýµé«þ¦QÏ\u0089@è(Ä-\u009e¹|".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16587;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("EntityAnimal", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("EntityAnimal" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
