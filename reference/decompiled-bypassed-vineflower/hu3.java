import com.google.common.base.Predicate;
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

public class hu3 extends k9a {
   private static final long c;
   private static final String[] B;
   private static final String[] C;
   private static final Map D = new HashMap(13);

   public hu3(t9d var1) {
      super(var1);
      this.yxc(0.6F, 0.7F);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(1, new dnq(this));
      this.r1d.tn8(2, this.adl);
      this.r1d.tn8(3, this.ui5 = new ttn(this, 0.6, xbr.h_h, true));
      this.r1d.tn8(5, new b6f(this, 1.0, 10.0F, 5.0F));
      this.r1d.tn8(6, new pjq(this, 0.8));
      this.r1d.tn8(7, new epq(this, 0.3F));
      this.r1d.tn8(8, new _7e(this));
      this.r1d.tn8(9, new rg_(this, 0.8));
      this.r1d.tn8(10, new _tb(this, 0.8));
      this.r1d.tn8(11, new bdq(this, ha9.class, 10.0F));
      this.g9o.tn8(1, new ka2(this, n78.class, false, (Predicate)null));
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(18, (byte)0);
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 8f
      // 09: invokevirtual hu3.gvh ()Lbww;
      // 0c: invokevirtual bww.c68 ()Z
      // 0f: ifeq 82
      // 12: goto 19
      // 15: invokestatic hu3.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual hu3.gvh ()Lbww;
      // 1d: invokevirtual bww.r1p ()D
      // 20: dstore 2
      // 21: dload 2
      // 22: ldc2_w 0.6
      // 25: dcmpl
      // 26: iload 1
      // 27: ifeq 55
      // 2a: ifne 49
      // 2d: goto 34
      // 30: invokestatic hu3.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: bipush 1
      // 36: invokevirtual hu3.rh_ (Z)V
      // 39: aload 0
      // 3a: bipush 0
      // 3b: invokevirtual hu3.fqc (Z)V
      // 3e: iload 1
      // 3f: ifne 7e
      // 42: goto 49
      // 45: invokestatic hu3.a (Loov;)Loov;
      // 48: athrow
      // 49: dload 2
      // 4a: ldc2_w 1.33
      // 4d: dcmpl
      // 4e: goto 55
      // 51: invokestatic hu3.a (Loov;)Loov;
      // 54: athrow
      // 55: ifne 6d
      // 58: aload 0
      // 59: bipush 0
      // 5a: invokevirtual hu3.rh_ (Z)V
      // 5d: aload 0
      // 5e: bipush 1
      // 5f: invokevirtual hu3.fqc (Z)V
      // 62: iload 1
      // 63: ifne 7e
      // 66: goto 6d
      // 69: invokestatic hu3.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: bipush 0
      // 6f: invokevirtual hu3.rh_ (Z)V
      // 72: aload 0
      // 73: bipush 0
      // 74: invokevirtual hu3.fqc (Z)V
      // 77: goto 7e
      // 7a: invokestatic hu3.a (Loov;)Loov;
      // 7d: athrow
      // 7e: iload 1
      // 7f: ifne 93
      // 82: aload 0
      // 83: bipush 0
      // 84: invokevirtual hu3.rh_ (Z)V
      // 87: aload 0
      // 88: goto 8f
      // 8b: invokestatic hu3.a (Loov;)Loov;
      // 8e: athrow
      // 8f: bipush 0
      // 90: invokevirtual hu3.fqc (Z)V
      // 93: return
   }

   @Override
   public boolean kz3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual hu3.j1j ()Z
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifne 3d
      // 0f: goto 16
      // 12: invokestatic hu3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield hu3.g25 I
      // 1a: goto 21
      // 1d: invokestatic hu3.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 3a
      // 25: sipush 2400
      // 28: if_icmple 3d
      // 2b: goto 32
      // 2e: invokestatic hu3.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 3a
      // 36: invokestatic hu3.a (Loov;)Loov;
      // 39: athrow
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(10.0);
      this.dgt(m6d.w7i).zf7(0.3F);
   }

   @Override
   public void ibc(float var1, float var2) {
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 110619256999340L;
      super.srs(var1);
      var1.iin(g<"g">(18916, 4851137295492731358L ^ var2), this.z1l());
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 20022212403463L;
      super.cjb(var1);
      this.e9u(var1.uz7(g<"g">(900, 3591409013845522199L ^ var2)));
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
      // 00: getstatic hu3.c J
      // 03: ldc2_w 111763034208218
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual hu3.j1j ()Z
      // 10: iload 3
      // 11: ifne 29
      // 14: ifeq 7d
      // 17: goto 1e
      // 1a: invokestatic hu3.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual hu3.j34 ()Z
      // 22: goto 29
      // 25: invokestatic hu3.a (Loov;)Loov;
      // 28: athrow
      // 29: iload 3
      // 2a: ifne 54
      // 2d: ifeq 4c
      // 30: goto 37
      // 33: invokestatic hu3.a (Loov;)Loov;
      // 36: athrow
      // 37: sipush 15898
      // 3a: ldc2_w 6306278751602449490
      // 3d: lload 1
      // 3e: lxor
      // 3f: invokedynamic g (IJ)Ljava/lang/String; bsm=hu3.g (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: goto 80
      // 48: invokestatic hu3.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield hu3.z2d Ljava/util/Random;
      // 50: bipush 4
      // 51: invokevirtual java/util/Random.nextInt (I)I
      // 54: ifne 6c
      // 57: sipush 25726
      // 5a: ldc2_w 1442747338069820981
      // 5d: lload 1
      // 5e: lxor
      // 5f: invokedynamic g (IJ)Ljava/lang/String; bsm=hu3.g (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: nop
      // 65: goto 80
      // 68: invokestatic hu3.a (Loov;)Loov;
      // 6b: athrow
      // 6c: sipush 16878
      // 6f: ldc2_w 1506013222930506659
      // 72: lload 1
      // 73: lxor
      // 74: invokedynamic g (IJ)Ljava/lang/String; bsm=hu3.g (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: nop
      // 7a: goto 80
      // 7d: ldc ""
      // 7f: nop
      // 80: areturn
   }

   @Override
   public String wcg() {
      long var1 = c ^ 139657601546402L;
      return g<"g">(32581, 7125901396680200820L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 70859826613996L;
      return g<"g">(4565, 5752357278307093164L ^ var1);
   }

   @Override
   public float o23() {
      return 0.4F;
   }

   @Override
   public u7m q4n() {
      return xbr.i8v;
   }

   @Override
   public boolean _nm(i2h var1) {
      return var1.m1t(ofh.kun(this), 3.0F);
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual hu3.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifne 2b
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic hu3.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic hu3.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield hu3.adl Ln3z;
      // 21: bipush 0
      // 22: invokevirtual n3z.spo (Z)V
      // 25: aload 0
      // 26: aload 1
      // 27: fload 2
      // 28: invokespecial k9a.m1t (Lofh;F)Z
      // 2b: ireturn
   }

   @Override
   public void ir3(boolean var1, int var2) {
   }

   @Override
   public boolean hp6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: getfield ha9.up_ Ljnq;
      // 008: invokevirtual jnq.dxs ()Lerg;
      // 00b: astore 3
      // 00c: aload 0
      // 00d: invokevirtual hu3.j1j ()Z
      // 010: iload 2
      // 011: ifeq 0a5
      // 014: ifeq 097
      // 017: goto 01e
      // 01a: invokestatic hu3.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: aload 1
      // 020: invokevirtual hu3.j12 (Lg_3;)Z
      // 023: iload 2
      // 024: ifeq 1db
      // 027: goto 02e
      // 02a: invokestatic hu3.a (Loov;)Loov;
      // 02d: athrow
      // 02e: ifeq 1d6
      // 031: goto 038
      // 034: invokestatic hu3.a (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: getfield hu3.oay Lt9d;
      // 03c: getfield t9d.v0f Z
      // 03f: iload 2
      // 040: ifeq 1db
      // 043: goto 04a
      // 046: invokestatic hu3.a (Loov;)Loov;
      // 049: athrow
      // 04a: ifne 1d6
      // 04d: goto 054
      // 050: invokestatic hu3.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 0
      // 055: aload 3
      // 056: invokevirtual hu3._cv (Lerg;)Z
      // 059: iload 2
      // 05a: ifeq 1db
      // 05d: goto 064
      // 060: invokestatic hu3.a (Loov;)Loov;
      // 063: athrow
      // 064: ifne 1d6
      // 067: goto 06e
      // 06a: invokestatic hu3.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield hu3.adl Ln3z;
      // 072: aload 0
      // 073: invokevirtual hu3.ird ()Z
      // 076: iload 2
      // 077: ifeq 08c
      // 07a: goto 081
      // 07d: invokestatic hu3.a (Loov;)Loov;
      // 080: athrow
      // 081: ifne 08f
      // 084: goto 08b
      // 087: invokestatic hu3.a (Loov;)Loov;
      // 08a: athrow
      // 08b: bipush 1
      // 08c: goto 090
      // 08f: bipush 0
      // 090: invokevirtual n3z.spo (Z)V
      // 093: iload 2
      // 094: ifne 1d6
      // 097: aload 0
      // 098: getfield hu3.ui5 Lttn;
      // 09b: invokevirtual ttn.pp1 ()Z
      // 09e: goto 0a5
      // 0a1: invokestatic hu3.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: iload 2
      // 0a6: ifeq 1db
      // 0a9: ifeq 1d6
      // 0ac: goto 0b3
      // 0af: invokestatic hu3.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 3
      // 0b4: iload 2
      // 0b5: ifeq 0ca
      // 0b8: goto 0bf
      // 0bb: invokestatic hu3.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: ifnull 1d6
      // 0c2: goto 0c9
      // 0c5: invokestatic hu3.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: aload 3
      // 0ca: invokevirtual erg.gn1 ()Lu7m;
      // 0cd: getstatic xbr.h_h Lu7m;
      // 0d0: if_acmpne 1d6
      // 0d3: aload 1
      // 0d4: aload 0
      // 0d5: invokevirtual ha9.wxg (Li2h;)D
      // 0d8: ldc2_w 9.0
      // 0db: dcmpg
      // 0dc: iload 2
      // 0dd: ifeq 1db
      // 0e0: goto 0e7
      // 0e3: invokestatic hu3.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: ifge 1d6
      // 0ea: goto 0f1
      // 0ed: invokestatic hu3.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: getfield ha9.lls Lpj2;
      // 0f5: getfield pj2.g40 Z
      // 0f8: iload 2
      // 0f9: ifeq 122
      // 0fc: goto 103
      // 0ff: invokestatic hu3.a (Loov;)Loov;
      // 102: athrow
      // 103: ifne 11e
      // 106: goto 10d
      // 109: invokestatic hu3.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 3
      // 10e: dup
      // 10f: getfield erg.qd2 I
      // 112: bipush 1
      // 113: isub
      // 114: putfield erg.qd2 I
      // 117: goto 11e
      // 11a: invokestatic hu3.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 3
      // 11f: getfield erg.qd2 I
      // 122: iload 2
      // 123: ifeq 150
      // 126: ifgt 149
      // 129: goto 130
      // 12c: invokestatic hu3.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 1
      // 131: getfield ha9.up_ Ljnq;
      // 134: aload 1
      // 135: getfield ha9.up_ Ljnq;
      // 138: getfield jnq.nb5 I
      // 13b: aconst_null
      // 13c: checkcast erg
      // 13f: invokevirtual jnq.cxl (ILerg;)V
      // 142: goto 149
      // 145: invokestatic hu3.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 0
      // 14a: getfield hu3.oay Lt9d;
      // 14d: getfield t9d.v0f Z
      // 150: iload 2
      // 151: ifeq 1d5
      // 154: ifne 1d4
      // 157: goto 15e
      // 15a: invokestatic hu3.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 0
      // 15f: iload 2
      // 160: ifeq 1cb
      // 163: goto 16a
      // 166: invokestatic hu3.a (Loov;)Loov;
      // 169: athrow
      // 16a: getfield hu3.z2d Ljava/util/Random;
      // 16d: bipush 3
      // 16e: invokevirtual java/util/Random.nextInt (I)I
      // 171: ifne 1be
      // 174: goto 17b
      // 177: invokestatic hu3.a (Loov;)Loov;
      // 17a: athrow
      // 17b: aload 0
      // 17c: bipush 1
      // 17d: invokevirtual hu3.j9h (Z)V
      // 180: aload 0
      // 181: bipush 1
      // 182: aload 0
      // 183: getfield hu3.oay Lt9d;
      // 186: getfield t9d.fsy Ljava/util/Random;
      // 189: bipush 3
      // 18a: invokevirtual java/util/Random.nextInt (I)I
      // 18d: iadd
      // 18e: invokevirtual hu3.e9u (I)V
      // 191: aload 0
      // 192: aload 1
      // 193: invokevirtual ha9.b_q ()Ljava/util/UUID;
      // 196: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 199: invokevirtual hu3.gv6 (Ljava/lang/String;)V
      // 19c: aload 0
      // 19d: bipush 1
      // 19e: invokevirtual hu3.skd (Z)V
      // 1a1: aload 0
      // 1a2: getfield hu3.adl Ln3z;
      // 1a5: bipush 1
      // 1a6: invokevirtual n3z.spo (Z)V
      // 1a9: aload 0
      // 1aa: getfield hu3.oay Lt9d;
      // 1ad: aload 0
      // 1ae: bipush 7
      // 1b0: invokevirtual t9d.qyn (Li2h;B)V
      // 1b3: iload 2
      // 1b4: ifne 1d4
      // 1b7: goto 1be
      // 1ba: invokestatic hu3.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: bipush 0
      // 1c0: invokevirtual hu3.skd (Z)V
      // 1c3: aload 0
      // 1c4: goto 1cb
      // 1c7: invokestatic hu3.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: getfield hu3.oay Lt9d;
      // 1ce: aload 0
      // 1cf: bipush 6
      // 1d1: invokevirtual t9d.qyn (Li2h;B)V
      // 1d4: bipush 1
      // 1d5: ireturn
      // 1d6: aload 0
      // 1d7: aload 1
      // 1d8: invokespecial k9a.hp6 (Lha9;)Z
      // 1db: ireturn
   }

   public hu3 kv0(dms param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: new hu3
      // 07: dup
      // 08: aload 0
      // 09: getfield hu3.oay Lt9d;
      // 0c: invokespecial hu3.<init> (Lt9d;)V
      // 0f: astore 3
      // 10: aload 0
      // 11: iload 2
      // 12: ifeq 3f
      // 15: invokevirtual hu3.j1j ()Z
      // 18: ifeq 3e
      // 1b: goto 22
      // 1e: invokestatic hu3.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 3
      // 23: aload 0
      // 24: invokevirtual hu3.g6v ()Ljava/lang/String;
      // 27: invokevirtual hu3.gv6 (Ljava/lang/String;)V
      // 2a: aload 3
      // 2b: bipush 1
      // 2c: invokevirtual hu3.j9h (Z)V
      // 2f: aload 3
      // 30: aload 0
      // 31: invokevirtual hu3.z1l ()I
      // 34: invokevirtual hu3.e9u (I)V
      // 37: goto 3e
      // 3a: invokestatic hu3.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 3
      // 3f: areturn
   }

   @Override
   public boolean _cv(erg var1) {
      int var2 = t9d.b();

      erg var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 == 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000.gn1() == xbr.h_h) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public boolean qj8(j37 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: if_acmpne 0f
      // 09: bipush 0
      // 0a: ireturn
      // 0b: invokestatic hu3.a (Loov;)Loov;
      // 0e: athrow
      // 0f: aload 0
      // 10: invokevirtual hu3.j1j ()Z
      // 13: iload 2
      // 14: ifeq 36
      // 17: ifne 27
      // 1a: goto 21
      // 1d: invokestatic hu3.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic hu3.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 1
      // 28: iload 2
      // 29: ifeq 40
      // 2c: instanceof hu3
      // 2f: goto 36
      // 32: invokestatic hu3.a (Loov;)Loov;
      // 35: athrow
      // 36: ifne 3f
      // 39: bipush 0
      // 3a: ireturn
      // 3b: invokestatic hu3.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 1
      // 40: checkcast hu3
      // 43: astore 3
      // 44: aload 3
      // 45: invokevirtual hu3.j1j ()Z
      // 48: iload 2
      // 49: ifeq 62
      // 4c: ifne 5e
      // 4f: goto 56
      // 52: invokestatic hu3.a (Loov;)Loov;
      // 55: athrow
      // 56: bipush 0
      // 57: goto 8e
      // 5a: invokestatic hu3.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: invokevirtual hu3.j34 ()Z
      // 62: iload 2
      // 63: ifeq 7b
      // 66: ifeq 8d
      // 69: goto 70
      // 6c: invokestatic hu3.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 3
      // 71: invokevirtual hu3.j34 ()Z
      // 74: goto 7b
      // 77: invokestatic hu3.a (Loov;)Loov;
      // 7a: athrow
      // 7b: iload 2
      // 7c: ifeq 8a
      // 7f: ifeq 8d
      // 82: goto 89
      // 85: invokestatic hu3.a (Loov;)Loov;
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   public int z1l() {
      return this.oit.miz(18);
   }

   public void e9u(int var1) {
      this.oit.c66(18, (byte)var1);
   }

   @Override
   public boolean iaw() {
      int var1 = t9d.b();

      try {
         int var10000 = this.oay.fsy.nextInt(3);
         if (var1 == 0) {
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

   @Override
   public boolean m63() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hu3.oay Lt9d;
      // 08: aload 0
      // 09: invokevirtual hu3.aaw ()Lnh4;
      // 0c: aload 0
      // 0d: invokevirtual t9d.g17 (Lnh4;Li2h;)Z
      // 10: iload 1
      // 11: ifeq d8
      // 14: ifeq d7
      // 17: goto 1e
      // 1a: invokestatic hu3.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield hu3.oay Lt9d;
      // 22: aload 0
      // 23: aload 0
      // 24: invokevirtual hu3.aaw ()Lnh4;
      // 27: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 2a: invokeinterface java/util/List.isEmpty ()Z 1
      // 2f: iload 1
      // 30: ifeq d8
      // 33: goto 3a
      // 36: invokestatic hu3.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifeq d7
      // 3d: goto 44
      // 40: invokestatic hu3.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield hu3.oay Lt9d;
      // 48: aload 0
      // 49: invokevirtual hu3.aaw ()Lnh4;
      // 4c: invokevirtual t9d.hhd (Lnh4;)Z
      // 4f: iload 1
      // 50: ifeq d8
      // 53: goto 5a
      // 56: invokestatic hu3.a (Loov;)Loov;
      // 59: athrow
      // 5a: ifne d7
      // 5d: goto 64
      // 60: invokestatic hu3.a (Loov;)Loov;
      // 63: athrow
      // 64: new mew
      // 67: dup
      // 68: aload 0
      // 69: getfield hu3.o2v D
      // 6c: aload 0
      // 6d: invokevirtual hu3.aaw ()Lnh4;
      // 70: getfield nh4.bx_ D
      // 73: aload 0
      // 74: getfield hu3.vbd D
      // 77: invokespecial mew.<init> (DDD)V
      // 7a: astore 2
      // 7b: aload 2
      // 7c: invokevirtual mew.getY ()I
      // 7f: iload 1
      // 80: ifeq 9c
      // 83: aload 0
      // 84: getfield hu3.oay Lt9d;
      // 87: invokevirtual t9d._s3 ()I
      // 8a: if_icmpge 9d
      // 8d: goto 94
      // 90: invokestatic hu3.a (Loov;)Loov;
      // 93: athrow
      // 94: bipush 0
      // 95: goto 9c
      // 98: invokestatic hu3.a (Loov;)Loov;
      // 9b: athrow
      // 9c: ireturn
      // 9d: aload 0
      // 9e: getfield hu3.oay Lt9d;
      // a1: aload 2
      // a2: invokevirtual mew.eve ()Lmew;
      // a5: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // a8: invokeinterface zfz.r_y ()Le0x; 1
      // ad: astore 3
      // ae: aload 3
      // af: iload 1
      // b0: ifeq c8
      // b3: getstatic ox_.l11 Lx82;
      // b6: if_acmpeq d1
      // b9: goto c0
      // bc: invokestatic hu3.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 3
      // c1: goto c8
      // c4: invokestatic hu3.a (Loov;)Loov;
      // c7: athrow
      // c8: invokevirtual e0x.p1r ()Lp3y;
      // cb: getstatic p3y.hh1 Lp3y;
      // ce: if_acmpne d7
      // d1: bipush 1
      // d2: ireturn
      // d3: invokestatic hu3.a (Loov;)Loov;
      // d6: athrow
      // d7: bipush 0
      // d8: ireturn
   }

   @Override
   public String noc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hu3.c J
      // 03: ldc2_w 130052505099955
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual hu3.qrh ()Z
      // 10: iload 3
      // 11: ifne 38
      // 14: ifeq 29
      // 17: goto 1e
      // 1a: invokestatic hu3.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual hu3.hei ()Ljava/lang/String;
      // 22: goto 57
      // 25: invokestatic hu3.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: iload 3
      // 2b: ifne 54
      // 2e: invokevirtual hu3.j1j ()Z
      // 31: goto 38
      // 34: invokestatic hu3.a (Loov;)Loov;
      // 37: athrow
      // 38: ifeq 53
      // 3b: sipush 28011
      // 3e: ldc2_w 994976983330481736
      // 41: lload 1
      // 42: lxor
      // 43: invokedynamic g (IJ)Ljava/lang/String; bsm=hu3.g (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: nop
      // 49: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 4c: goto 57
      // 4f: invokestatic hu3.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: invokespecial k9a.noc ()Ljava/lang/String;
      // 57: areturn
   }

   @Override
   public void j9h(boolean var1) {
      super.j9h(var1);
   }

   @Override
   public void pe8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 41
      // 09: getfield hu3.j7h Lccm;
      // 0c: ifnonnull 35
      // 0f: goto 16
      // 12: invokestatic hu3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new ccm
      // 1a: dup
      // 1b: aload 0
      // 1c: ldc ha9
      // 1e: nop
      // 1f: ldc 16.0
      // 21: nop
      // 22: ldc2_w 0.8
      // 25: ldc2_w 1.33
      // 28: invokespecial ccm.<init> (Llaq;Ljava/lang/Class;FDD)V
      // 2b: putfield hu3.j7h Lccm;
      // 2e: goto 35
      // 31: invokestatic hu3.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield hu3.r1d Ldak;
      // 39: aload 0
      // 3a: getfield hu3.j7h Lccm;
      // 3d: invokevirtual dak.hmq (Lcjm;)V
      // 40: aload 0
      // 41: iload 1
      // 42: ifne 5a
      // 45: invokevirtual hu3.j1j ()Z
      // 48: ifne 65
      // 4b: goto 52
      // 4e: invokestatic hu3.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: goto 5a
      // 56: invokestatic hu3.a (Loov;)Loov;
      // 59: athrow
      // 5a: getfield hu3.r1d Ldak;
      // 5d: bipush 4
      // 5e: aload 0
      // 5f: getfield hu3.j7h Lccm;
      // 62: invokevirtual dak.tn8 (ILcjm;)V
      // 65: return
   }

   @Override
   public ps6 hx8(css var1, ps6 var2) {
      int var3 = t9d.c();
      ps6 var10000 = super.hx8(var1, var2);
      if (var3 == 0) {
         var2 = var10000;
         if (this.oay.fsy.nextInt(7) == 0) {
            int var4 = 0;

            while (var4 < 2) {
               hu3 var5 = new hu3(this.oay);
               var5.x24(this.o2v, this.kfp, this.vbd, this.x5k, 0.0F);
               var5.mr2(-24000);
               this.oay.xzq(var5);
               var4++;
               if (var3 != 0) {
                  break;
               }
            }
         }

         var10000 = var2;
      }

      return var10000;
   }

   @Override
   public dms kv0(dms var1) {
      return this.kv0(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-413588035701441819L, 6182403687531667601L, MethodHandles.lookup().lookupClass()).a(266089205900444L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 117430453188028L;
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
      String var6 = "Õ³Ã7ËIlX\u0005ø±\u0097ÞA(æ Ã+êXìÌÑ¶¹\u001f»îÁ\u008cèÏ\u001e\u00870\u0001\u009dOTüÛø¬937Ðc\u0010\u0086\u0086ÕønhÒ\u009d@v½TÌ-p½ eCRÒè×\u008fø \u0089\u001d\u001bÙl\u00ad\u0080<\u0005Yw\u001b`v»\u001b©\u0007H5ÈU\u0088 Ó\u0003B\u009dN§§¸\u0017\u0082ùÆR\u0095\u0001\u0099\u0082\u0002Ì]õòeª\u0098\u00142\u0088õ§+© ¨¯i-\u0002än¼¢½ÃÚ~lQ{ \u000fô\u0081\u009ah¸\u0089;ôé<ür>X";
      int var8 = "Õ³Ã7ËIlX\u0005ø±\u0097ÞA(æ Ã+êXìÌÑ¶¹\u001f»îÁ\u008cèÏ\u001e\u00870\u0001\u009dOTüÛø¬937Ðc\u0010\u0086\u0086ÕønhÒ\u009d@v½TÌ-p½ eCRÒè×\u008fø \u0089\u001d\u001bÙl\u00ad\u0080<\u0005Yw\u001b`v»\u001b©\u0007H5ÈU\u0088 Ó\u0003B\u009dN§§¸\u0017\u0082ùÆR\u0095\u0001\u0099\u0082\u0002Ì]õòeª\u0098\u00142\u0088õ§+© ¨¯i-\u0002än¼¢½ÃÚ~lQ{ \u000fô\u0081\u009ah¸\u0089;ôé<ür>X"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = h(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     B = var9;
                     C = new String[8];
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

                  var6 = "*E\u0015\\Øê \u0012íIÃN2\u001aÀ\u0080¿\t\u0019ÂØ\u00838\u001e\u0082Ü2nÝdñÄ\u0018Ü\n\u009f\u008b\u0098\u0092cØE§\u0099/_Î0\u0002qF\u0094iW\u0085·\u0015";
                  var8 = "*E\u0015\\Øê \u0012íIÃN2\u001aÀ\u0080¿\t\u0019ÂØ\u00838\u001e\u0082Ü2nÝdñÄ\u0018Ü\n\u009f\u008b\u0098\u0092cØE§\u0099/_Î0\u0002qF\u0094iW\u0085·\u0015"
                     .length();
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

   private static String h(byte[] var0) {
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

   private static String g(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9302;
      if (C[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])D.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               D.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("hu3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = B[var5].getBytes("ISO-8859-1");
         C[var5] = h(((Cipher)var4[0]).doFinal(var9));
      }

      return C[var5];
   }

   private static Object g(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = g(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite g(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("g".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("hu3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
