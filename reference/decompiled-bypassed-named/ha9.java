import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntitySign;

public abstract class ha9 extends Entity {
   public KillAura$TargetFilter pwz;
   public ftj zy5 = new ftj();
   public double v9r = -1.0;
   public double e_f = 0.0;
   public jnq up_ = new jnq(this);
   private ctr gk4 = new ctr();
   public _jc fv9;
   public _jc daw;
   public wkk kbo = new wkk();
   public int xzr;
   public float igu;
   public float tfv;
   public int o8x;
   public double x30;
   public double l30;
   public double fz6;
   public double aas;
   public double d5v;
   public double fya;
   public boolean asp;
   public mew ndt;
   private int bl8;
   public float ckf;
   public float erh;
   public float pek;
   private mew w2b;
   private boolean ht4;
   private mew ma0;
   public pj2 lls = new pj2();
   public int op5;
   public int nk0;
   public float ey9;
   private int j7g;
   private erg egg;
   public int nff;
   public float e6v = 0.1F;
   public float utl = 0.02F;
   private int igo;
   private final GameProfile vv6;
   private boolean abn = false;
   public sj_ r44;
   private static final long c;
   private static final String[] h;
   private static final String[] i;
   private static final Map p = new HashMap(13);

   public double gce() {
      double var1 = this.ivp - this.o2v;
      double var3 = this.e2b - this.vbd;
      return Math.sqrt(var1 * var1 + var3 * var3);
   }

   public double dlg() {
      return this.c54 - this.kfp;
   }

   public double tde() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: ldc2_w 0.2873
      // 07: dstore 2
      // 08: aload 0
      // 09: getstatic mcs.uwx Lmcs;
      // 0c: invokevirtual ha9.cab (Lmcs;)Z
      // 0f: iload 1
      // 10: ifeq 2e
      // 13: ifeq 3e
      // 16: goto 1d
      // 19: invokestatic ha9.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getstatic mcs.uwx Lmcs;
      // 21: invokevirtual ha9.dhd (Lmcs;)Lsdj;
      // 24: invokevirtual sdj.tus ()I
      // 27: goto 2e
      // 2a: invokestatic ha9.a (Loov;)Loov;
      // 2d: athrow
      // 2e: istore 4
      // 30: dload 2
      // 31: dconst_1
      // 32: ldc2_w 0.2
      // 35: iload 4
      // 37: bipush 1
      // 38: iadd
      // 39: i2d
      // 3a: dmul
      // 3b: dadd
      // 3c: dmul
      // 3d: dstore 2
      // 3e: dload 2
      // 3f: dreturn
   }

   public ha9(OpaquePredicate var1, GameProfile var2) {
      super(var1);
      this.vqf = z05(var2);
      this.vv6 = var2;
      this.fv9 = new kta(this.up_, !var1.v0f, this);
      this.daw = this.fv9;
      mew var3 = var1.suq();
      this.x24((double)var3.getX() + 0.5, (double)(var3.getY() + 1), (double)var3.getZ() + 0.5, 0.0F, 0.0F);
      this.zwr = 180.0F;
      this.m29 = 20;
   }

   @Override
   public void nyy() {
      super.nyy();
      this.s_a().ylc(m6d.y3f).zf7(1.0);
      this.dgt(m6d.w7i).zf7(0.1F);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, (byte)0);
      this.oit.kp2(17, 0.0F);
      this.oit.kp2(18, 0);
      this.oit.kp2(10, (byte)0);
   }

   public erg t_o() {
      return this.egg;
   }

   public int m9h() {
      return this.nff;
   }

   public boolean kqa() {
      try {
         if (this.egg != null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public int bbq() {
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
      // 05: invokevirtual ha9.kqa ()Z
      // 08: iload 1
      // 09: ifne 29
      // 0c: ifeq 2c
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ha9.egg Lerg;
      // 1a: invokevirtual erg.ifg ()I
      // 1d: aload 0
      // 1e: getfield ha9.nff I
      // 21: isub
      // 22: goto 29
      // 25: invokestatic ha9.a (Loov;)Loov;
      // 28: athrow
      // 29: goto 2d
      // 2c: bipush 0
      // 2d: ireturn
   }

   public void puk() {
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
      // 06: ifeq 2e
      // 09: getfield ha9.egg Lerg;
      // 0c: ifnull 2d
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ha9.egg Lerg;
      // 1a: aload 0
      // 1b: getfield ha9.oay Lt9d;
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield ha9.nff I
      // 23: invokevirtual erg.dg5 (Lt9d;Lha9;I)V
      // 26: goto 2d
      // 29: invokestatic ha9.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokevirtual ha9.foa ()V
      // 31: return
   }

   public void foa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aconst_null
      // 02: putfield ha9.egg Lerg;
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: bipush 0
      // 0a: putfield ha9.nff I
      // 0d: istore 1
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifeq 2b
      // 13: getfield ha9.oay Lt9d;
      // 16: getfield OpaquePredicate.v0f Z
      // 19: ifne 2f
      // 1c: goto 23
      // 1f: invokestatic ha9.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: goto 2b
      // 27: invokestatic ha9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: invokevirtual ha9._a5 (Z)V
      // 2f: return
   }

   public boolean kqk() {
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
      // 06: ifeq 1e
      // 09: invokevirtual ha9.kqa ()Z
      // 0c: ifeq 39
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic ha9.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getfield ha9.egg Lerg;
      // 21: invokevirtual erg.gn1 ()Lu7m;
      // 24: aload 0
      // 25: getfield ha9.egg Lerg;
      // 28: invokevirtual u7m.uf6 (Lerg;)Lce2;
      // 2b: getstatic ce2.b7w Lce2;
      // 2e: if_acmpne 39
      // 31: bipush 1
      // 32: goto 3a
      // 35: invokestatic ha9.a (Loov;)Loov;
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: aload 0
      // 006: invokevirtual ha9.myu ()Z
      // 009: putfield ha9.kvx Z
      // 00c: aload 0
      // 00d: iload 1
      // 00e: ifne 02b
      // 011: invokevirtual ha9.myu ()Z
      // 014: ifeq 02a
      // 017: goto 01e
      // 01a: invokestatic ha9.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: bipush 0
      // 020: putfield ha9.lfk Z
      // 023: goto 02a
      // 026: invokestatic ha9.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: iload 1
      // 02c: ifne 0df
      // 02f: getfield ha9.egg Lerg;
      // 032: ifnull 0de
      // 035: goto 03c
      // 038: invokestatic ha9.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 0
      // 03d: getfield ha9.up_ Ljnq;
      // 040: invokevirtual jnq.dxs ()Lerg;
      // 043: astore 2
      // 044: aload 2
      // 045: aload 0
      // 046: getfield ha9.egg Lerg;
      // 049: if_acmpne 0d3
      // 04c: aload 0
      // 04d: getfield ha9.nff I
      // 050: iload 1
      // 051: ifne 09a
      // 054: goto 05b
      // 057: invokestatic ha9.a (Loov;)Loov;
      // 05a: athrow
      // 05b: bipush 25
      // 05d: if_icmpgt 08f
      // 060: goto 067
      // 063: invokestatic ha9.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 0
      // 068: getfield ha9.nff I
      // 06b: bipush 4
      // 06c: irem
      // 06d: iload 1
      // 06e: ifne 09a
      // 071: goto 078
      // 074: invokestatic ha9.a (Loov;)Loov;
      // 077: athrow
      // 078: ifne 08f
      // 07b: goto 082
      // 07e: invokestatic ha9.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: aload 2
      // 084: bipush 5
      // 085: invokevirtual ha9.qmw (Lerg;I)V
      // 088: goto 08f
      // 08b: invokestatic ha9.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 0
      // 090: dup
      // 091: getfield ha9.nff I
      // 094: bipush 1
      // 095: isub
      // 096: dup_x1
      // 097: putfield ha9.nff I
      // 09a: iload 1
      // 09b: ifne 0e2
      // 09e: ifne 0de
      // 0a1: goto 0a8
      // 0a4: invokestatic ha9.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: getfield ha9.oay Lt9d;
      // 0ac: getfield OpaquePredicate.v0f Z
      // 0af: iload 1
      // 0b0: ifne 0e2
      // 0b3: goto 0ba
      // 0b6: invokestatic ha9.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: ifne 0de
      // 0bd: goto 0c4
      // 0c0: invokestatic ha9.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: invokevirtual ha9.lbj ()V
      // 0c8: iload 1
      // 0c9: ifeq 0de
      // 0cc: goto 0d3
      // 0cf: invokestatic ha9.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: invokevirtual ha9.foa ()V
      // 0d7: goto 0de
      // 0da: invokestatic ha9.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: getfield ha9.o8x I
      // 0e2: iload 1
      // 0e3: ifne 105
      // 0e6: ifle 101
      // 0e9: goto 0f0
      // 0ec: invokestatic ha9.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: dup
      // 0f2: getfield ha9.o8x I
      // 0f5: bipush 1
      // 0f6: isub
      // 0f7: putfield ha9.o8x I
      // 0fa: goto 101
      // 0fd: invokestatic ha9.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: invokevirtual ha9.ofg ()Z
      // 105: iload 1
      // 106: ifne 1be
      // 109: ifeq 1b3
      // 10c: goto 113
      // 10f: invokestatic ha9.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 0
      // 114: dup
      // 115: getfield ha9.bl8 I
      // 118: bipush 1
      // 119: iadd
      // 11a: putfield ha9.bl8 I
      // 11d: aload 0
      // 11e: getfield ha9.bl8 I
      // 121: iload 1
      // 122: ifne 14c
      // 125: goto 12c
      // 128: invokestatic ha9.a (Loov;)Loov;
      // 12b: athrow
      // 12c: bipush 100
      // 12e: if_icmple 145
      // 131: goto 138
      // 134: invokestatic ha9.a (Loov;)Loov;
      // 137: athrow
      // 138: aload 0
      // 139: bipush 100
      // 13b: putfield ha9.bl8 I
      // 13e: goto 145
      // 141: invokestatic ha9.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 0
      // 146: getfield ha9.oay Lt9d;
      // 149: getfield OpaquePredicate.v0f Z
      // 14c: iload 1
      // 14d: ifne 208
      // 150: ifne 1fd
      // 153: goto 15a
      // 156: invokestatic ha9.a (Loov;)Loov;
      // 159: athrow
      // 15a: aload 0
      // 15b: invokespecial ha9.svv ()Z
      // 15e: iload 1
      // 15f: ifne 193
      // 162: goto 169
      // 165: invokestatic ha9.a (Loov;)Loov;
      // 168: athrow
      // 169: ifne 185
      // 16c: goto 173
      // 16f: invokestatic ha9.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 0
      // 174: bipush 1
      // 175: bipush 1
      // 176: bipush 0
      // 177: invokevirtual ha9.thu (ZZZ)V
      // 17a: iload 1
      // 17b: ifeq 1fd
      // 17e: goto 185
      // 181: invokestatic ha9.a (Loov;)Loov;
      // 184: athrow
      // 185: aload 0
      // 186: getfield ha9.oay Lt9d;
      // 189: invokevirtual OpaquePredicate.m40 ()Z
      // 18c: goto 193
      // 18f: invokestatic ha9.a (Loov;)Loov;
      // 192: athrow
      // 193: iload 1
      // 194: ifne 208
      // 197: ifeq 1fd
      // 19a: goto 1a1
      // 19d: invokestatic ha9.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: bipush 0
      // 1a3: bipush 1
      // 1a4: bipush 1
      // 1a5: invokevirtual ha9.thu (ZZZ)V
      // 1a8: iload 1
      // 1a9: ifeq 1fd
      // 1ac: goto 1b3
      // 1af: invokestatic ha9.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield ha9.bl8 I
      // 1b7: goto 1be
      // 1ba: invokestatic ha9.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: iload 1
      // 1bf: ifne 208
      // 1c2: ifle 1fd
      // 1c5: goto 1cc
      // 1c8: invokestatic ha9.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: dup
      // 1ce: getfield ha9.bl8 I
      // 1d1: bipush 1
      // 1d2: iadd
      // 1d3: putfield ha9.bl8 I
      // 1d6: aload 0
      // 1d7: getfield ha9.bl8 I
      // 1da: iload 1
      // 1db: ifne 208
      // 1de: goto 1e5
      // 1e1: invokestatic ha9.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: bipush 110
      // 1e7: if_icmplt 1fd
      // 1ea: goto 1f1
      // 1ed: invokestatic ha9.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: bipush 0
      // 1f3: putfield ha9.bl8 I
      // 1f6: goto 1fd
      // 1f9: invokestatic ha9.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: aload 0
      // 1fe: invokespecial Entity.xx_ ()V
      // 201: aload 0
      // 202: getfield ha9.oay Lt9d;
      // 205: getfield OpaquePredicate.v0f Z
      // 208: iload 1
      // 209: ifne 26e
      // 20c: ifne 25f
      // 20f: goto 216
      // 212: invokestatic ha9.a (Loov;)Loov;
      // 215: athrow
      // 216: aload 0
      // 217: iload 1
      // 218: ifne 260
      // 21b: goto 222
      // 21e: invokestatic ha9.a (Loov;)Loov;
      // 221: athrow
      // 222: getfield ha9.daw L_jc;
      // 225: ifnull 25f
      // 228: goto 22f
      // 22b: invokestatic ha9.a (Loov;)Loov;
      // 22e: athrow
      // 22f: aload 0
      // 230: getfield ha9.daw L_jc;
      // 233: aload 0
      // 234: invokevirtual _jc.spj (Lha9;)Z
      // 237: iload 1
      // 238: ifne 26e
      // 23b: goto 242
      // 23e: invokestatic ha9.a (Loov;)Loov;
      // 241: athrow
      // 242: ifne 25f
      // 245: goto 24c
      // 248: invokestatic ha9.a (Loov;)Loov;
      // 24b: athrow
      // 24c: aload 0
      // 24d: invokevirtual ha9.gph ()V
      // 250: aload 0
      // 251: aload 0
      // 252: getfield ha9.fv9 L_jc;
      // 255: putfield ha9.daw L_jc;
      // 258: goto 25f
      // 25b: invokestatic ha9.a (Loov;)Loov;
      // 25e: athrow
      // 25f: aload 0
      // 260: iload 1
      // 261: ifne 2b1
      // 264: invokevirtual ha9.agj ()Z
      // 267: goto 26e
      // 26a: invokestatic ha9.a (Loov;)Loov;
      // 26d: athrow
      // 26e: ifeq 298
      // 271: aload 0
      // 272: iload 1
      // 273: ifne 2b1
      // 276: goto 27d
      // 279: invokestatic ha9.a (Loov;)Loov;
      // 27c: athrow
      // 27d: getfield ha9.lls Lpj2;
      // 280: getfield pj2.lez Z
      // 283: ifeq 298
      // 286: goto 28d
      // 289: invokestatic ha9.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 0
      // 28e: invokevirtual ha9.utb ()V
      // 291: goto 298
      // 294: invokestatic ha9.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 0
      // 299: aload 0
      // 29a: getfield ha9.aas D
      // 29d: putfield ha9.x30 D
      // 2a0: aload 0
      // 2a1: aload 0
      // 2a2: getfield ha9.d5v D
      // 2a5: putfield ha9.l30 D
      // 2a8: aload 0
      // 2a9: aload 0
      // 2aa: getfield ha9.fya D
      // 2ad: putfield ha9.fz6 D
      // 2b0: aload 0
      // 2b1: getfield ha9.o2v D
      // 2b4: aload 0
      // 2b5: getfield ha9.aas D
      // 2b8: dsub
      // 2b9: dstore 2
      // 2ba: aload 0
      // 2bb: getfield ha9.kfp D
      // 2be: aload 0
      // 2bf: getfield ha9.d5v D
      // 2c2: dsub
      // 2c3: dstore 4
      // 2c5: aload 0
      // 2c6: getfield ha9.vbd D
      // 2c9: aload 0
      // 2ca: getfield ha9.fya D
      // 2cd: dsub
      // 2ce: dstore 6
      // 2d0: ldc2_w 10.0
      // 2d3: dstore 8
      // 2d5: dload 2
      // 2d6: dload 8
      // 2d8: dcmpl
      // 2d9: iload 1
      // 2da: ifne 300
      // 2dd: ifle 2fb
      // 2e0: goto 2e7
      // 2e3: invokestatic ha9.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: aload 0
      // 2e8: aload 0
      // 2e9: aload 0
      // 2ea: getfield ha9.o2v D
      // 2ed: dup2_x1
      // 2ee: putfield ha9.aas D
      // 2f1: putfield ha9.x30 D
      // 2f4: goto 2fb
      // 2f7: invokestatic ha9.a (Loov;)Loov;
      // 2fa: athrow
      // 2fb: dload 6
      // 2fd: dload 8
      // 2ff: dcmpl
      // 300: iload 1
      // 301: ifne 327
      // 304: ifle 322
      // 307: goto 30e
      // 30a: invokestatic ha9.a (Loov;)Loov;
      // 30d: athrow
      // 30e: aload 0
      // 30f: aload 0
      // 310: aload 0
      // 311: getfield ha9.vbd D
      // 314: dup2_x1
      // 315: putfield ha9.fya D
      // 318: putfield ha9.fz6 D
      // 31b: goto 322
      // 31e: invokestatic ha9.a (Loov;)Loov;
      // 321: athrow
      // 322: dload 4
      // 324: dload 8
      // 326: dcmpl
      // 327: iload 1
      // 328: ifne 34e
      // 32b: ifle 349
      // 32e: goto 335
      // 331: invokestatic ha9.a (Loov;)Loov;
      // 334: athrow
      // 335: aload 0
      // 336: aload 0
      // 337: aload 0
      // 338: getfield ha9.kfp D
      // 33b: dup2_x1
      // 33c: putfield ha9.d5v D
      // 33f: putfield ha9.l30 D
      // 342: goto 349
      // 345: invokestatic ha9.a (Loov;)Loov;
      // 348: athrow
      // 349: dload 2
      // 34a: dload 8
      // 34c: dneg
      // 34d: dcmpg
      // 34e: iload 1
      // 34f: ifne 376
      // 352: ifge 370
      // 355: goto 35c
      // 358: invokestatic ha9.a (Loov;)Loov;
      // 35b: athrow
      // 35c: aload 0
      // 35d: aload 0
      // 35e: aload 0
      // 35f: getfield ha9.o2v D
      // 362: dup2_x1
      // 363: putfield ha9.aas D
      // 366: putfield ha9.x30 D
      // 369: goto 370
      // 36c: invokestatic ha9.a (Loov;)Loov;
      // 36f: athrow
      // 370: dload 6
      // 372: dload 8
      // 374: dneg
      // 375: dcmpg
      // 376: iload 1
      // 377: ifne 39e
      // 37a: ifge 398
      // 37d: goto 384
      // 380: invokestatic ha9.a (Loov;)Loov;
      // 383: athrow
      // 384: aload 0
      // 385: aload 0
      // 386: aload 0
      // 387: getfield ha9.vbd D
      // 38a: dup2_x1
      // 38b: putfield ha9.fya D
      // 38e: putfield ha9.fz6 D
      // 391: goto 398
      // 394: invokestatic ha9.a (Loov;)Loov;
      // 397: athrow
      // 398: dload 4
      // 39a: dload 8
      // 39c: dneg
      // 39d: dcmpg
      // 39e: ifge 3b5
      // 3a1: aload 0
      // 3a2: aload 0
      // 3a3: aload 0
      // 3a4: getfield ha9.kfp D
      // 3a7: dup2_x1
      // 3a8: putfield ha9.d5v D
      // 3ab: putfield ha9.l30 D
      // 3ae: goto 3b5
      // 3b1: invokestatic ha9.a (Loov;)Loov;
      // 3b4: athrow
      // 3b5: aload 0
      // 3b6: dup
      // 3b7: getfield ha9.aas D
      // 3ba: dload 2
      // 3bb: ldc2_w 0.25
      // 3be: dmul
      // 3bf: dadd
      // 3c0: putfield ha9.aas D
      // 3c3: aload 0
      // 3c4: dup
      // 3c5: getfield ha9.fya D
      // 3c8: dload 6
      // 3ca: ldc2_w 0.25
      // 3cd: dmul
      // 3ce: dadd
      // 3cf: putfield ha9.fya D
      // 3d2: aload 0
      // 3d3: dup
      // 3d4: getfield ha9.d5v D
      // 3d7: dload 4
      // 3d9: ldc2_w 0.25
      // 3dc: dmul
      // 3dd: dadd
      // 3de: putfield ha9.d5v D
      // 3e1: aload 0
      // 3e2: iload 1
      // 3e3: ifne 400
      // 3e6: getfield ha9.hzp Li2h;
      // 3e9: ifnonnull 3ff
      // 3ec: goto 3f3
      // 3ef: invokestatic ha9.a (Loov;)Loov;
      // 3f2: athrow
      // 3f3: aload 0
      // 3f4: aconst_null
      // 3f5: putfield ha9.ma0 Lmew;
      // 3f8: goto 3ff
      // 3fb: invokestatic ha9.a (Loov;)Loov;
      // 3fe: athrow
      // 3ff: aload 0
      // 400: getfield ha9.oay Lt9d;
      // 403: getfield OpaquePredicate.v0f Z
      // 406: iload 1
      // 407: ifne 44d
      // 40a: ifne 44a
      // 40d: goto 414
      // 410: invokestatic ha9.a (Loov;)Loov;
      // 413: athrow
      // 414: aload 0
      // 415: getfield ha9.kbo Lwkk;
      // 418: aload 0
      // 419: invokevirtual wkk.lsl (Lha9;)V
      // 41c: aload 0
      // 41d: getstatic l9p.anv L_ss;
      // 420: invokevirtual ha9.aex (L_ss;)V
      // 423: aload 0
      // 424: invokevirtual ha9.gzr ()Z
      // 427: iload 1
      // 428: ifne 44d
      // 42b: goto 432
      // 42e: invokestatic ha9.a (Loov;)Loov;
      // 431: athrow
      // 432: ifeq 44a
      // 435: goto 43c
      // 438: invokestatic ha9.a (Loov;)Loov;
      // 43b: athrow
      // 43c: aload 0
      // 43d: getstatic l9p.ygo L_ss;
      // 440: invokevirtual ha9.aex (L_ss;)V
      // 443: goto 44a
      // 446: invokestatic ha9.a (Loov;)Loov;
      // 449: athrow
      // 44a: ldc 29999999
      // 44c: nop
      // 44d: istore 10
      // 44f: aload 0
      // 450: getfield ha9.o2v D
      // 453: ldc2_w -2.9999999E7
      // 456: ldc2_w 2.9999999E7
      // 459: invokestatic fe6.lft (DDD)D
      // 45c: dstore 11
      // 45e: aload 0
      // 45f: getfield ha9.vbd D
      // 462: ldc2_w -2.9999999E7
      // 465: ldc2_w 2.9999999E7
      // 468: invokestatic fe6.lft (DDD)D
      // 46b: dstore 13
      // 46d: dload 11
      // 46f: aload 0
      // 470: getfield ha9.o2v D
      // 473: dcmpl
      // 474: iload 1
      // 475: ifne 490
      // 478: ifne 493
      // 47b: goto 482
      // 47e: invokestatic ha9.a (Loov;)Loov;
      // 481: athrow
      // 482: dload 13
      // 484: aload 0
      // 485: getfield ha9.vbd D
      // 488: dcmpl
      // 489: goto 490
      // 48c: invokestatic ha9.a (Loov;)Loov;
      // 48f: athrow
      // 490: ifeq 4a6
      // 493: aload 0
      // 494: dload 11
      // 496: aload 0
      // 497: getfield ha9.kfp D
      // 49a: dload 13
      // 49c: invokevirtual ha9.m6_ (DDD)V
      // 49f: goto 4a6
      // 4a2: invokestatic ha9.a (Loov;)Loov;
      // 4a5: athrow
      // 4a6: return
   }

   @Override
   public int cu2() {
      int var1 = OpaquePredicate.b();

      try {
         if (var1 == 0) {
            return this.lls.lez;
         }

         if (this.lls.lez) {
            return 0;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return 80;
   }

   @Override
   public String ors() {
      long var1 = c ^ 25846019230922L;
      return c<"k">(28884, 536231455888681077L ^ var1);
   }

   @Override
   public String hux() {
      long var1 = c ^ 139536135678215L;
      return c<"k">(13317, 1014667612004354408L ^ var1);
   }

   @Override
   public int k0g() {
      return 10;
   }

   @Override
   public void lhu(String var1, float var2, float var3) {
      this.oay.xf4(this, var1, var2, var3);
   }

   public void qmw(erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ha9.c J
      // 003: ldc2_w 6164864231325
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: invokevirtual erg.pdv ()Lce2;
      // 011: getstatic ce2.wtv Lce2;
      // 014: iload 5
      // 016: ifeq 058
      // 019: if_acmpne 051
      // 01c: goto 023
      // 01f: invokestatic ha9.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: sipush 24866
      // 027: ldc2_w 1885752625624568527
      // 02a: lload 3
      // 02b: lxor
      // 02c: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: ldc 0.5
      // 034: nop
      // 035: aload 0
      // 036: getfield ha9.oay Lt9d;
      // 039: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 03c: invokevirtual java/util/Random.nextFloat ()F
      // 03f: ldc 0.1
      // 041: nop
      // 042: fmul
      // 043: ldc 0.9
      // 045: nop
      // 046: fadd
      // 047: invokevirtual ha9.lhu (Ljava/lang/String;FF)V
      // 04a: goto 051
      // 04d: invokestatic ha9.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 1
      // 052: invokevirtual erg.pdv ()Lce2;
      // 055: getstatic ce2.b46 Lce2;
      // 058: if_acmpne 20e
      // 05b: bipush 0
      // 05c: istore 6
      // 05e: iload 6
      // 060: iload 2
      // 061: if_icmpge 1d6
      // 064: new fqr
      // 067: dup
      // 068: aload 0
      // 069: getfield ha9.z2d Ljava/util/Random;
      // 06c: invokevirtual java/util/Random.nextFloat ()F
      // 06f: f2d
      // 070: ldc2_w 0.5
      // 073: dsub
      // 074: ldc2_w 0.1
      // 077: dmul
      // 078: invokestatic java/lang/Math.random ()D
      // 07b: ldc2_w 0.1
      // 07e: dmul
      // 07f: ldc2_w 0.1
      // 082: dadd
      // 083: dconst_0
      // 084: invokespecial fqr.<init> (DDD)V
      // 087: astore 7
      // 089: aload 7
      // 08b: aload 0
      // 08c: getfield ha9.y2i F
      // 08f: fneg
      // 090: ldc 3.1415927
      // 092: nop
      // 093: fmul
      // 094: ldc 180.0
      // 096: nop
      // 097: fdiv
      // 098: invokevirtual fqr.mx1 (F)Lfqr;
      // 09b: astore 7
      // 09d: aload 7
      // 09f: aload 0
      // 0a0: getfield ha9.x5k F
      // 0a3: fneg
      // 0a4: ldc 3.1415927
      // 0a6: nop
      // 0a7: fmul
      // 0a8: ldc 180.0
      // 0aa: nop
      // 0ab: fdiv
      // 0ac: invokevirtual fqr.av2 (F)Lfqr;
      // 0af: astore 7
      // 0b1: aload 0
      // 0b2: getfield ha9.z2d Ljava/util/Random;
      // 0b5: invokevirtual java/util/Random.nextFloat ()F
      // 0b8: fneg
      // 0b9: f2d
      // 0ba: ldc2_w 0.6
      // 0bd: dmul
      // 0be: ldc2_w 0.3
      // 0c1: dsub
      // 0c2: dstore 8
      // 0c4: new fqr
      // 0c7: dup
      // 0c8: aload 0
      // 0c9: getfield ha9.z2d Ljava/util/Random;
      // 0cc: invokevirtual java/util/Random.nextFloat ()F
      // 0cf: f2d
      // 0d0: ldc2_w 0.5
      // 0d3: dsub
      // 0d4: ldc2_w 0.3
      // 0d7: dmul
      // 0d8: dload 8
      // 0da: ldc2_w 0.6
      // 0dd: invokespecial fqr.<init> (DDD)V
      // 0e0: astore 10
      // 0e2: aload 10
      // 0e4: aload 0
      // 0e5: getfield ha9.y2i F
      // 0e8: fneg
      // 0e9: ldc 3.1415927
      // 0eb: nop
      // 0ec: fmul
      // 0ed: ldc 180.0
      // 0ef: nop
      // 0f0: fdiv
      // 0f1: invokevirtual fqr.mx1 (F)Lfqr;
      // 0f4: astore 10
      // 0f6: aload 10
      // 0f8: aload 0
      // 0f9: getfield ha9.x5k F
      // 0fc: fneg
      // 0fd: ldc 3.1415927
      // 0ff: nop
      // 100: fmul
      // 101: ldc 180.0
      // 103: nop
      // 104: fdiv
      // 105: invokevirtual fqr.av2 (F)Lfqr;
      // 108: astore 10
      // 10a: aload 10
      // 10c: aload 0
      // 10d: getfield ha9.o2v D
      // 110: aload 0
      // 111: getfield ha9.kfp D
      // 114: aload 0
      // 115: invokevirtual ha9.c5y ()F
      // 118: f2d
      // 119: dadd
      // 11a: aload 0
      // 11b: getfield ha9.vbd D
      // 11e: invokevirtual fqr.r2x (DDD)Lfqr;
      // 121: astore 10
      // 123: iload 5
      // 125: ifeq 20e
      // 128: iload 5
      // 12a: ifeq 189
      // 12d: goto 134
      // 130: invokestatic ha9.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 1
      // 135: invokevirtual erg.i5y ()Z
      // 138: ifeq 18e
      // 13b: goto 142
      // 13e: invokestatic ha9.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: getfield ha9.oay Lt9d;
      // 146: getstatic w_0.ips Lw_0;
      // 149: aload 10
      // 14b: getfield fqr.lvi D
      // 14e: aload 10
      // 150: getfield fqr.gn5 D
      // 153: aload 10
      // 155: getfield fqr.bn2 D
      // 158: aload 7
      // 15a: getfield fqr.lvi D
      // 15d: aload 7
      // 15f: getfield fqr.gn5 D
      // 162: ldc2_w 0.05
      // 165: dadd
      // 166: aload 7
      // 168: getfield fqr.bn2 D
      // 16b: bipush 2
      // 16c: newarray 10
      // 16e: dup
      // 16f: bipush 0
      // 170: aload 1
      // 171: invokevirtual erg.gn1 ()Lu7m;
      // 174: invokestatic u7m._lo (Lu7m;)I
      // 177: iastore
      // 178: dup
      // 179: bipush 1
      // 17a: aload 1
      // 17b: invokevirtual erg.j6_ ()I
      // 17e: iastore
      // 17f: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 182: goto 189
      // 185: invokestatic ha9.a (Loov;)Loov;
      // 188: athrow
      // 189: iload 5
      // 18b: ifne 1ce
      // 18e: aload 0
      // 18f: getfield ha9.oay Lt9d;
      // 192: getstatic w_0.ips Lw_0;
      // 195: aload 10
      // 197: getfield fqr.lvi D
      // 19a: aload 10
      // 19c: getfield fqr.gn5 D
      // 19f: aload 10
      // 1a1: getfield fqr.bn2 D
      // 1a4: aload 7
      // 1a6: getfield fqr.lvi D
      // 1a9: aload 7
      // 1ab: getfield fqr.gn5 D
      // 1ae: ldc2_w 0.05
      // 1b1: dadd
      // 1b2: aload 7
      // 1b4: getfield fqr.bn2 D
      // 1b7: bipush 1
      // 1b8: newarray 10
      // 1ba: dup
      // 1bb: bipush 0
      // 1bc: aload 1
      // 1bd: invokevirtual erg.gn1 ()Lu7m;
      // 1c0: invokestatic u7m._lo (Lu7m;)I
      // 1c3: iastore
      // 1c4: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 1c7: goto 1ce
      // 1ca: invokestatic ha9.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: iinc 6 1
      // 1d1: iload 5
      // 1d3: ifne 05e
      // 1d6: aload 0
      // 1d7: sipush 22964
      // 1da: ldc2_w 1723676161690331771
      // 1dd: lload 3
      // 1de: lxor
      // 1df: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: nop
      // 1e5: ldc 0.5
      // 1e7: nop
      // 1e8: ldc 0.5
      // 1ea: nop
      // 1eb: aload 0
      // 1ec: getfield ha9.z2d Ljava/util/Random;
      // 1ef: bipush 2
      // 1f0: invokevirtual java/util/Random.nextInt (I)I
      // 1f3: i2f
      // 1f4: fmul
      // 1f5: fadd
      // 1f6: aload 0
      // 1f7: getfield ha9.z2d Ljava/util/Random;
      // 1fa: invokevirtual java/util/Random.nextFloat ()F
      // 1fd: aload 0
      // 1fe: getfield ha9.z2d Ljava/util/Random;
      // 201: invokevirtual java/util/Random.nextFloat ()F
      // 204: fsub
      // 205: ldc 0.2
      // 207: nop
      // 208: fmul
      // 209: fconst_1
      // 20a: fadd
      // 20b: invokevirtual ha9.lhu (Ljava/lang/String;FF)V
      // 20e: return
   }

   public void lbj() {
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
      // 05: getfield ha9.egg Lerg;
      // 08: iload 1
      // 09: ifne 2b
      // 0c: ifnull bc
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield ha9.egg Lerg;
      // 1b: bipush 16
      // 1d: invokevirtual ha9.qmw (Lerg;I)V
      // 20: aload 0
      // 21: getfield ha9.egg Lerg;
      // 24: goto 2b
      // 27: invokestatic ha9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield erg.qd2 I
      // 2e: istore 2
      // 2f: aload 0
      // 30: getfield ha9.egg Lerg;
      // 33: aload 0
      // 34: getfield ha9.oay Lt9d;
      // 37: aload 0
      // 38: invokevirtual erg.eb7 (Lt9d;Lha9;)Lerg;
      // 3b: astore 3
      // 3c: aload 3
      // 3d: iload 1
      // 3e: ifne 9b
      // 41: aload 0
      // 42: getfield ha9.egg Lerg;
      // 45: if_acmpne 78
      // 48: goto 4f
      // 4b: invokestatic ha9.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 3
      // 50: iload 1
      // 51: ifne 66
      // 54: goto 5b
      // 57: invokestatic ha9.a (Loov;)Loov;
      // 5a: athrow
      // 5b: ifnull b8
      // 5e: goto 65
      // 61: invokestatic ha9.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 3
      // 66: getfield erg.qd2 I
      // 69: iload 1
      // 6a: ifne 9e
      // 6d: iload 2
      // 6e: if_icmpeq b8
      // 71: goto 78
      // 74: invokestatic ha9.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: iload 1
      // 7a: ifne b9
      // 7d: goto 84
      // 80: invokestatic ha9.a (Loov;)Loov;
      // 83: athrow
      // 84: getfield ha9.up_ Ljnq;
      // 87: getfield jnq.c41 [Lerg;
      // 8a: aload 0
      // 8b: getfield ha9.up_ Ljnq;
      // 8e: getfield jnq.nb5 I
      // 91: aload 3
      // 92: aastore
      // 93: aload 3
      // 94: goto 9b
      // 97: invokestatic ha9.a (Loov;)Loov;
      // 9a: athrow
      // 9b: getfield erg.qd2 I
      // 9e: ifne b8
      // a1: aload 0
      // a2: getfield ha9.up_ Ljnq;
      // a5: getfield jnq.c41 [Lerg;
      // a8: aload 0
      // a9: getfield ha9.up_ Ljnq;
      // ac: getfield jnq.nb5 I
      // af: aconst_null
      // b0: aastore
      // b1: goto b8
      // b4: invokestatic ha9.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 0
      // b9: invokevirtual ha9.foa ()V
      // bc: return
   }

   @Override
   public void ptf(byte param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 9
      // 07: iload 2
      // 08: ifeq 2e
      // 0b: if_icmpne 24
      // 0e: goto 15
      // 11: invokestatic ha9.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual ha9.lbj ()V
      // 19: iload 2
      // 1a: ifne 75
      // 1d: goto 24
      // 20: invokestatic ha9.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 1
      // 25: bipush 23
      // 27: goto 2e
      // 2a: invokestatic ha9.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifeq 56
      // 32: if_icmpne 4c
      // 35: goto 3c
      // 38: invokestatic ha9.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: bipush 0
      // 3e: putfield ha9.abn Z
      // 41: iload 2
      // 42: ifne 75
      // 45: goto 4c
      // 48: invokestatic ha9.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 1
      // 4d: bipush 22
      // 4f: goto 56
      // 52: invokestatic ha9.a (Loov;)Loov;
      // 55: athrow
      // 56: if_icmpne 69
      // 59: aload 0
      // 5a: bipush 1
      // 5b: putfield ha9.abn Z
      // 5e: iload 2
      // 5f: ifne 75
      // 62: goto 69
      // 65: invokestatic ha9.a (Loov;)Loov;
      // 68: athrow
      // 69: aload 0
      // 6a: iload 1
      // 6b: invokespecial Entity.ptf (B)V
      // 6e: goto 75
      // 71: invokestatic ha9.a (Loov;)Loov;
      // 74: athrow
      // 75: return
   }

   @Override
   public boolean a81() {
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
      // 05: invokevirtual ha9.i55 ()F
      // 08: fconst_0
      // 09: fcmpg
      // 0a: iload 1
      // 0b: ifne 32
      // 0e: ifle 31
      // 11: goto 18
      // 14: invokestatic ha9.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual ha9.ofg ()Z
      // 1c: iload 1
      // 1d: ifne 32
      // 20: goto 27
      // 23: invokestatic ha9.a (Loov;)Loov;
      // 26: athrow
      // 27: ifeq 35
      // 2a: goto 31
      // 2d: invokestatic ha9.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   public void gph() {
      this.daw = this.fv9;
   }

   @Override
   public void dm3() {
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
      // 06: ifeq 52
      // 09: getfield ha9.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: ifne 4a
      // 12: goto 19
      // 15: invokestatic ha9.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifeq 52
      // 1e: goto 25
      // 21: invokestatic ha9.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual ha9.hzv ()Z
      // 28: ifeq 4a
      // 2b: goto 32
      // 2e: invokestatic ha9.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: aconst_null
      // 34: checkcast EntityLivingBase
      // 37: invokevirtual ha9.nw9 (Li2h;)V
      // 3a: aload 0
      // 3b: bipush 0
      // 3c: invokevirtual ha9.rh_ (Z)V
      // 3f: iload 1
      // 40: ifne cd
      // 43: goto 4a
      // 46: invokestatic ha9.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: goto 52
      // 4e: invokestatic ha9.a (Loov;)Loov;
      // 51: athrow
      // 52: getfield ha9.o2v D
      // 55: dstore 2
      // 56: aload 0
      // 57: getfield ha9.kfp D
      // 5a: dstore 4
      // 5c: aload 0
      // 5d: getfield ha9.vbd D
      // 60: dstore 6
      // 62: aload 0
      // 63: getfield ha9.x5k F
      // 66: fstore 8
      // 68: aload 0
      // 69: getfield ha9.y2i F
      // 6c: fstore 9
      // 6e: aload 0
      // 6f: invokespecial Entity.dm3 ()V
      // 72: aload 0
      // 73: aload 0
      // 74: getfield ha9.tfv F
      // 77: putfield ha9.igu F
      // 7a: aload 0
      // 7b: fconst_0
      // 7c: putfield ha9.tfv F
      // 7f: aload 0
      // 80: aload 0
      // 81: getfield ha9.o2v D
      // 84: dload 2
      // 85: dsub
      // 86: aload 0
      // 87: getfield ha9.kfp D
      // 8a: dload 4
      // 8c: dsub
      // 8d: aload 0
      // 8e: getfield ha9.vbd D
      // 91: dload 6
      // 93: dsub
      // 94: invokespecial ha9.jlk (DDD)V
      // 97: aload 0
      // 98: iload 1
      // 99: ifeq c0
      // 9c: getfield ha9.hzp Li2h;
      // 9f: instanceof _gj
      // a2: ifeq cd
      // a5: goto ac
      // a8: invokestatic ha9.a (Loov;)Loov;
      // ab: athrow
      // ac: aload 0
      // ad: fload 9
      // af: putfield ha9.y2i F
      // b2: aload 0
      // b3: fload 8
      // b5: putfield ha9.x5k F
      // b8: aload 0
      // b9: goto c0
      // bc: invokestatic ha9.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 0
      // c1: getfield ha9.hzp Li2h;
      // c4: checkcast _gj
      // c7: getfield _gj.ksw F
      // ca: putfield ha9.ksw F
      // cd: return
   }

   @Override
   public void prv() {
      this.yxc(0.6F, 1.8F);
      super.prv();
      this.uh3(this.axb());
      this.qur = 0;
   }

   @Override
   public void nd9() {
      super.nd9();
      this.inv();
      this.q6c = this.x5k;
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ha9.c J
      // 003: ldc2_w 125323370564651
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: iload 3
      // 00e: ifeq 030
      // 011: getfield ha9.xzr I
      // 014: ifle 02f
      // 017: goto 01e
      // 01a: invokestatic ha9.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: dup
      // 020: getfield ha9.xzr I
      // 023: bipush 1
      // 024: isub
      // 025: putfield ha9.xzr I
      // 028: goto 02f
      // 02b: invokestatic ha9.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: iload 3
      // 031: ifeq 116
      // 034: getfield ha9.oay Lt9d;
      // 037: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 03a: getstatic v66.na2 Lv66;
      // 03d: if_acmpne 102
      // 040: goto 047
      // 043: invokestatic ha9.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: iload 3
      // 049: ifeq 116
      // 04c: goto 053
      // 04f: invokestatic ha9.a (Loov;)Loov;
      // 052: athrow
      // 053: getfield ha9.oay Lt9d;
      // 056: invokevirtual OpaquePredicate.eir ()Lef9;
      // 059: sipush 13209
      // 05c: ldc2_w 3848077347753192402
      // 05f: lload 1
      // 060: lxor
      // 061: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: nop
      // 067: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 06a: ifeq 102
      // 06d: goto 074
      // 070: invokestatic ha9.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 0
      // 075: invokevirtual ha9.i55 ()F
      // 078: aload 0
      // 079: invokevirtual ha9.axb ()F
      // 07c: fcmpg
      // 07d: iload 3
      // 07e: ifeq 0cc
      // 081: goto 088
      // 084: invokestatic ha9.a (Loov;)Loov;
      // 087: athrow
      // 088: ifge 0ba
      // 08b: goto 092
      // 08e: invokestatic ha9.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: getfield ha9.g25 I
      // 096: bipush 20
      // 098: irem
      // 099: iload 3
      // 09a: ifeq 0cc
      // 09d: goto 0a4
      // 0a0: invokestatic ha9.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: ifne 0ba
      // 0a7: goto 0ae
      // 0aa: invokestatic ha9.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: fconst_1
      // 0b0: invokevirtual ha9.rwd (F)V
      // 0b3: goto 0ba
      // 0b6: invokestatic ha9.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: iload 3
      // 0bc: ifeq 116
      // 0bf: getfield ha9.kbo Lwkk;
      // 0c2: invokevirtual wkk.njl ()Z
      // 0c5: goto 0cc
      // 0c8: invokestatic ha9.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: ifeq 102
      // 0cf: aload 0
      // 0d0: iload 3
      // 0d1: ifeq 116
      // 0d4: goto 0db
      // 0d7: invokestatic ha9.a (Loov;)Loov;
      // 0da: athrow
      // 0db: getfield ha9.g25 I
      // 0de: bipush 10
      // 0e0: irem
      // 0e1: ifne 102
      // 0e4: goto 0eb
      // 0e7: invokestatic ha9.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield ha9.kbo Lwkk;
      // 0ef: aload 0
      // 0f0: getfield ha9.kbo Lwkk;
      // 0f3: invokevirtual wkk.f1i ()I
      // 0f6: bipush 1
      // 0f7: iadd
      // 0f8: invokevirtual wkk._fj (I)V
      // 0fb: goto 102
      // 0fe: invokestatic ha9.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: getfield ha9.up_ Ljnq;
      // 106: invokevirtual jnq.a9n ()V
      // 109: aload 0
      // 10a: aload 0
      // 10b: getfield ha9.tfv F
      // 10e: putfield ha9.igu F
      // 111: aload 0
      // 112: invokespecial Entity.e_a ()V
      // 115: aload 0
      // 116: getstatic m6d.w7i Lw9p;
      // 119: invokevirtual ha9.dgt (Lw9p;)L_4o;
      // 11c: astore 4
      // 11e: aload 0
      // 11f: getfield ha9.oay Lt9d;
      // 122: getfield OpaquePredicate.v0f Z
      // 125: iload 3
      // 126: ifeq 160
      // 129: ifne 149
      // 12c: goto 133
      // 12f: invokestatic ha9.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 4
      // 135: aload 0
      // 136: getfield ha9.lls Lpj2;
      // 139: invokevirtual pj2.wjr ()F
      // 13c: f2d
      // 13d: invokeinterface _4o.zf7 (D)V 3
      // 142: goto 149
      // 145: invokestatic ha9.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 0
      // 14a: aload 0
      // 14b: getfield ha9.utl F
      // 14e: putfield ha9._ge F
      // 151: aload 0
      // 152: iload 3
      // 153: ifeq 18b
      // 156: invokevirtual ha9.ew1 ()Z
      // 159: goto 160
      // 15c: invokestatic ha9.a (Loov;)Loov;
      // 15f: athrow
      // 160: ifeq 17e
      // 163: aload 0
      // 164: aload 0
      // 165: getfield ha9._ge F
      // 168: f2d
      // 169: aload 0
      // 16a: getfield ha9.utl F
      // 16d: f2d
      // 16e: ldc2_w 0.3
      // 171: dmul
      // 172: dadd
      // 173: d2f
      // 174: putfield ha9._ge F
      // 177: goto 17e
      // 17a: invokestatic ha9.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 0
      // 17f: aload 4
      // 181: invokeinterface _4o.nz5 ()D 1
      // 186: d2f
      // 187: invokevirtual ha9.nak (F)V
      // 18a: aload 0
      // 18b: getfield ha9.icv D
      // 18e: aload 0
      // 18f: getfield ha9.icv D
      // 192: dmul
      // 193: aload 0
      // 194: getfield ha9.bw4 D
      // 197: aload 0
      // 198: getfield ha9.bw4 D
      // 19b: dmul
      // 19c: dadd
      // 19d: invokestatic fe6.dii (D)F
      // 1a0: fstore 5
      // 1a2: aload 0
      // 1a3: getfield ha9.mop D
      // 1a6: dneg
      // 1a7: ldc2_w 0.20000000298023224
      // 1aa: dmul
      // 1ab: invokestatic java/lang/Math.atan (D)D
      // 1ae: ldc2_w 15.0
      // 1b1: dmul
      // 1b2: d2f
      // 1b3: fstore 6
      // 1b5: fload 5
      // 1b7: ldc 0.1
      // 1b9: nop
      // 1ba: fcmpl
      // 1bb: iload 3
      // 1bc: ifeq 1d2
      // 1bf: ifle 1ce
      // 1c2: goto 1c9
      // 1c5: invokestatic ha9.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: ldc 0.1
      // 1cb: nop
      // 1cc: fstore 5
      // 1ce: aload 0
      // 1cf: getfield ha9.lfk Z
      // 1d2: iload 3
      // 1d3: ifeq 1ed
      // 1d6: ifeq 1fb
      // 1d9: goto 1e0
      // 1dc: invokestatic ha9.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: invokevirtual ha9.i55 ()F
      // 1e4: fconst_0
      // 1e5: fcmpg
      // 1e6: goto 1ed
      // 1e9: invokestatic ha9.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: iload 3
      // 1ee: ifeq 202
      // 1f1: ifgt 1fe
      // 1f4: goto 1fb
      // 1f7: invokestatic ha9.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: fconst_0
      // 1fc: fstore 5
      // 1fe: aload 0
      // 1ff: getfield ha9.lfk Z
      // 202: iload 3
      // 203: ifeq 21d
      // 206: ifne 22b
      // 209: goto 210
      // 20c: invokestatic ha9.a (Loov;)Loov;
      // 20f: athrow
      // 210: aload 0
      // 211: invokevirtual ha9.i55 ()F
      // 214: fconst_0
      // 215: fcmpg
      // 216: goto 21d
      // 219: invokestatic ha9.a (Loov;)Loov;
      // 21c: athrow
      // 21d: iload 3
      // 21e: ifeq 25c
      // 221: ifgt 22e
      // 224: goto 22b
      // 227: invokestatic ha9.a (Loov;)Loov;
      // 22a: athrow
      // 22b: fconst_0
      // 22c: fstore 6
      // 22e: aload 0
      // 22f: dup
      // 230: getfield ha9.tfv F
      // 233: fload 5
      // 235: aload 0
      // 236: getfield ha9.tfv F
      // 239: fsub
      // 23a: ldc 0.4
      // 23c: nop
      // 23d: fmul
      // 23e: fadd
      // 23f: putfield ha9.tfv F
      // 242: aload 0
      // 243: dup
      // 244: getfield ha9.sep F
      // 247: fload 6
      // 249: aload 0
      // 24a: getfield ha9.sep F
      // 24d: fsub
      // 24e: ldc 0.8
      // 250: nop
      // 251: fmul
      // 252: fadd
      // 253: putfield ha9.sep F
      // 256: aload 0
      // 257: invokevirtual ha9.i55 ()F
      // 25a: fconst_0
      // 25b: fcmpl
      // 25c: iload 3
      // 25d: ifeq 275
      // 260: ifle 320
      // 263: goto 26a
      // 266: invokestatic ha9.a (Loov;)Loov;
      // 269: athrow
      // 26a: aload 0
      // 26b: invokevirtual ha9.myu ()Z
      // 26e: goto 275
      // 271: invokestatic ha9.a (Loov;)Loov;
      // 274: athrow
      // 275: ifne 320
      // 278: aconst_null
      // 279: astore 7
      // 27b: aload 0
      // 27c: iload 3
      // 27d: ifeq 2c3
      // 280: getfield ha9.hzp Li2h;
      // 283: ifnull 2c2
      // 286: goto 28d
      // 289: invokestatic ha9.a (Loov;)Loov;
      // 28c: athrow
      // 28d: aload 0
      // 28e: iload 3
      // 28f: ifeq 2c3
      // 292: goto 299
      // 295: invokestatic ha9.a (Loov;)Loov;
      // 298: athrow
      // 299: getfield ha9.hzp Li2h;
      // 29c: getfield EntityLivingBase.ma9 Z
      // 29f: ifne 2c2
      // 2a2: goto 2a9
      // 2a5: invokestatic ha9.a (Loov;)Loov;
      // 2a8: athrow
      // 2a9: aload 0
      // 2aa: invokevirtual ha9.aaw ()Lnh4;
      // 2ad: aload 0
      // 2ae: getfield ha9.hzp Li2h;
      // 2b1: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 2b4: invokevirtual nh4.srm (Lnh4;)Lnh4;
      // 2b7: dconst_1
      // 2b8: dconst_0
      // 2b9: dconst_1
      // 2ba: invokevirtual nh4.c2h (DDD)Lnh4;
      // 2bd: astore 7
      // 2bf: goto 2d0
      // 2c2: aload 0
      // 2c3: invokevirtual ha9.aaw ()Lnh4;
      // 2c6: dconst_1
      // 2c7: ldc2_w 0.5
      // 2ca: dconst_1
      // 2cb: invokevirtual nh4.c2h (DDD)Lnh4;
      // 2ce: astore 7
      // 2d0: aload 0
      // 2d1: getfield ha9.oay Lt9d;
      // 2d4: aload 0
      // 2d5: aload 7
      // 2d7: invokevirtual OpaquePredicate.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 2da: astore 8
      // 2dc: bipush 0
      // 2dd: istore 9
      // 2df: iload 9
      // 2e1: aload 8
      // 2e3: invokeinterface java/util/List.size ()I 1
      // 2e8: if_icmpge 320
      // 2eb: aload 8
      // 2ed: iload 9
      // 2ef: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2f4: checkcast EntityLivingBase
      // 2f7: astore 10
      // 2f9: iload 3
      // 2fa: ifeq 31c
      // 2fd: aload 10
      // 2ff: getfield EntityLivingBase.ma9 Z
      // 302: ifne 319
      // 305: goto 30c
      // 308: invokestatic ha9.a (Loov;)Loov;
      // 30b: athrow
      // 30c: aload 0
      // 30d: aload 10
      // 30f: invokespecial ha9.wo9 (Li2h;)V
      // 312: goto 319
      // 315: invokestatic ha9.a (Loov;)Loov;
      // 318: athrow
      // 319: iinc 9 1
      // 31c: iload 3
      // 31d: ifne 2df
      // 320: return
   }

   private void wo9(EntityLivingBase var1) {
      var1.bzm(this);
   }

   public int zy2() {
      return this.oit.zwc(18);
   }

   public void q7d(int var1) {
      this.oit.c66(18, var1);
   }

   public void aqc(int var1) {
      int var2 = this.zy2();
      this.oit.c66(18, var2 + var1);
   }

   @Override
   public void owu(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ha9.c J
      // 003: ldc2_w 72372765461541
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial Entity.owu (Lofh;)V
      // 00d: aload 0
      // 00e: ldc 0.2
      // 010: nop
      // 011: ldc 0.2
      // 013: nop
      // 014: invokevirtual ha9.yxc (FF)V
      // 017: invokestatic OpaquePredicate.b ()I
      // 01a: aload 0
      // 01b: aload 0
      // 01c: getfield ha9.o2v D
      // 01f: aload 0
      // 020: getfield ha9.kfp D
      // 023: aload 0
      // 024: getfield ha9.vbd D
      // 027: invokevirtual ha9.m6_ (DDD)V
      // 02a: aload 0
      // 02b: ldc2_w 0.10000000149011612
      // 02e: putfield ha9.mop D
      // 031: istore 4
      // 033: aload 0
      // 034: invokevirtual ha9.noc ()Ljava/lang/String;
      // 037: sipush 8869
      // 03a: ldc2_w 563248848522279678
      // 03d: lload 2
      // 03e: lxor
      // 03f: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: nop
      // 045: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 048: iload 4
      // 04a: ifeq 094
      // 04d: ifeq 070
      // 050: goto 057
      // 053: invokestatic ha9.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: new erg
      // 05b: dup
      // 05c: getstatic xbr.lym Lu7m;
      // 05f: bipush 1
      // 060: invokespecial erg.<init> (Lu7m;I)V
      // 063: bipush 1
      // 064: bipush 0
      // 065: invokevirtual ha9.gj8 (Lerg;ZZ)Lnvf;
      // 068: pop
      // 069: goto 070
      // 06c: invokestatic ha9.a (Loov;)Loov;
      // 06f: athrow
      // 070: aload 0
      // 071: iload 4
      // 073: ifeq 098
      // 076: getfield ha9.oay Lt9d;
      // 079: invokevirtual OpaquePredicate.eir ()Lef9;
      // 07c: sipush 7352
      // 07f: ldc2_w 7079292630264005864
      // 082: lload 2
      // 083: lxor
      // 084: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: nop
      // 08a: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 08d: goto 094
      // 090: invokestatic ha9.a (Loov;)Loov;
      // 093: athrow
      // 094: ifne 09e
      // 097: aload 0
      // 098: getfield ha9.up_ Ljnq;
      // 09b: invokevirtual jnq._v_ ()V
      // 09e: aload 1
      // 09f: ifnull 0ea
      // 0a2: aload 0
      // 0a3: aload 0
      // 0a4: getfield ha9.rth F
      // 0a7: aload 0
      // 0a8: getfield ha9.x5k F
      // 0ab: fadd
      // 0ac: ldc 3.1415927
      // 0ae: nop
      // 0af: fmul
      // 0b0: ldc 180.0
      // 0b2: nop
      // 0b3: fdiv
      // 0b4: invokestatic fe6.ssk (F)F
      // 0b7: fneg
      // 0b8: ldc 0.1
      // 0ba: nop
      // 0bb: fmul
      // 0bc: f2d
      // 0bd: putfield ha9.icv D
      // 0c0: aload 0
      // 0c1: aload 0
      // 0c2: getfield ha9.rth F
      // 0c5: aload 0
      // 0c6: getfield ha9.x5k F
      // 0c9: fadd
      // 0ca: ldc 3.1415927
      // 0cc: nop
      // 0cd: fmul
      // 0ce: ldc 180.0
      // 0d0: nop
      // 0d1: fdiv
      // 0d2: invokestatic fe6.rtn (F)F
      // 0d5: fneg
      // 0d6: ldc 0.1
      // 0d8: nop
      // 0d9: fmul
      // 0da: f2d
      // 0db: putfield ha9.bw4 D
      // 0de: iload 4
      // 0e0: ifne 0fb
      // 0e3: goto 0ea
      // 0e6: invokestatic ha9.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: aload 0
      // 0ec: dconst_0
      // 0ed: dup2_x1
      // 0ee: putfield ha9.bw4 D
      // 0f1: putfield ha9.icv D
      // 0f4: goto 0fb
      // 0f7: invokestatic ha9.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getstatic l9p.ir0 L_ss;
      // 0ff: invokevirtual ha9.aex (L_ss;)V
      // 102: aload 0
      // 103: getstatic l9p.ygo L_ss;
      // 106: invokevirtual ha9._rr (L_ss;)V
      // 109: return
   }

   @Override
   public String wcg() {
      long var1 = c ^ 5801129387452L;
      return c<"k">(27260, 5218927744048438179L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 63979597599730L;
      return c<"k">(25537, 5047025447630087272L ^ var1);
   }

   @Override
   public void lfi(EntityLivingBase param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 2
      // 02: invokevirtual ha9.aqc (I)V
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: invokevirtual ha9.cjt ()Luci;
      // 0c: getstatic z0w.g39 Lz0w;
      // 0f: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // 12: astore 4
      // 14: istore 3
      // 15: aload 1
      // 16: instanceof ha9
      // 19: iload 3
      // 1a: ifeq 53
      // 1d: ifeq 58
      // 20: goto 27
      // 23: invokestatic ha9.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getstatic l9p.hqz L_ss;
      // 2b: invokevirtual ha9.aex (L_ss;)V
      // 2e: aload 4
      // 30: aload 0
      // 31: invokevirtual ha9.cjt ()Luci;
      // 34: getstatic z0w.ghc Lz0w;
      // 37: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // 3a: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // 3f: pop
      // 40: aload 4
      // 42: aload 0
      // 43: aload 1
      // 44: invokespecial ha9.vxt (Li2h;)Ljava/util/Collection;
      // 47: invokeinterface java/util/Collection.addAll (Ljava/util/Collection;)Z 2
      // 4c: goto 53
      // 4f: invokestatic ha9.a (Loov;)Loov;
      // 52: athrow
      // 53: pop
      // 54: iload 3
      // 55: ifne 66
      // 58: aload 0
      // 59: getstatic l9p.a3g L_ss;
      // 5c: invokevirtual ha9.aex (L_ss;)V
      // 5f: goto 66
      // 62: invokestatic ha9.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 4
      // 68: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 6d: astore 5
      // 6f: aload 5
      // 71: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 76: ifeq 9d
      // 79: aload 5
      // 7b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 80: checkcast sa6
      // 83: astore 6
      // 85: aload 0
      // 86: invokevirtual ha9.cjt ()Luci;
      // 89: aload 0
      // 8a: invokevirtual ha9.noc ()Ljava/lang/String;
      // 8d: aload 6
      // 8f: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 92: astore 7
      // 94: aload 7
      // 96: invokevirtual r11.nvd ()V
      // 99: iload 3
      // 9a: ifne 6f
      // 9d: return
   }

   private Collection vxt(EntityLivingBase param1) {
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
      // 05: invokevirtual ha9.cjt ()Luci;
      // 08: aload 0
      // 09: invokevirtual ha9.noc ()Ljava/lang/String;
      // 0c: invokevirtual uci.zov (Ljava/lang/String;)Lq2m;
      // 0f: astore 3
      // 10: aload 3
      // 11: iload 2
      // 12: ifeq 99
      // 15: ifnull 8e
      // 18: goto 1f
      // 1b: invokestatic ha9.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 3
      // 20: iload 2
      // 21: ifeq 99
      // 24: goto 2b
      // 27: invokestatic ha9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokevirtual q2m.z84 ()Lsyo;
      // 2e: invokevirtual syo.h6w ()I
      // 31: istore 4
      // 33: iload 4
      // 35: iflt 8e
      // 38: iload 4
      // 3a: getstatic z0w.setValueRaw [Lz0w;
      // 3d: arraylength
      // 3e: if_icmpge 8e
      // 41: goto 48
      // 44: invokestatic ha9.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: invokevirtual ha9.cjt ()Luci;
      // 4c: getstatic z0w.setValueRaw [Lz0w;
      // 4f: iload 4
      // 51: aaload
      // 52: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // 55: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 5a: astore 5
      // 5c: aload 5
      // 5e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 63: ifeq 8e
      // 66: aload 5
      // 68: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6d: checkcast sa6
      // 70: astore 6
      // 72: aload 0
      // 73: invokevirtual ha9.cjt ()Luci;
      // 76: aload 1
      // 77: invokevirtual EntityLivingBase.noc ()Ljava/lang/String;
      // 7a: iload 2
      // 7b: ifeq 96
      // 7e: aload 6
      // 80: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 83: astore 7
      // 85: aload 7
      // 87: invokevirtual r11.nvd ()V
      // 8a: iload 2
      // 8b: ifne 5c
      // 8e: aload 0
      // 8f: invokevirtual ha9.cjt ()Luci;
      // 92: aload 1
      // 93: invokevirtual EntityLivingBase.noc ()Ljava/lang/String;
      // 96: invokevirtual uci.zov (Ljava/lang/String;)Lq2m;
      // 99: astore 4
      // 9b: aload 4
      // 9d: iload 2
      // 9e: ifeq ad
      // a1: ifnull e0
      // a4: goto ab
      // a7: invokestatic ha9.a (Loov;)Loov;
      // aa: athrow
      // ab: aload 4
      // ad: invokevirtual q2m.z84 ()Lsyo;
      // b0: invokevirtual syo.h6w ()I
      // b3: istore 5
      // b5: iload 5
      // b7: iload 2
      // b8: ifeq c7
      // bb: iflt e0
      // be: goto c5
      // c1: invokestatic ha9.a (Loov;)Loov;
      // c4: athrow
      // c5: iload 5
      // c7: getstatic z0w.iao [Lz0w;
      // ca: arraylength
      // cb: if_icmpge e0
      // ce: aload 0
      // cf: invokevirtual ha9.cjt ()Luci;
      // d2: getstatic z0w.iao [Lz0w;
      // d5: iload 5
      // d7: aaload
      // d8: invokevirtual uci.vre (Lz0w;)Ljava/util/Collection;
      // db: areturn
      // dc: invokestatic ha9.a (Loov;)Loov;
      // df: athrow
      // e0: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // e3: areturn
   }

   public nvf e07(boolean param1) {
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
      // 05: aload 0
      // 06: getfield ha9.up_ Ljnq;
      // 09: aload 0
      // 0a: getfield ha9.up_ Ljnq;
      // 0d: getfield jnq.nb5 I
      // 10: iload 1
      // 11: ifeq 44
      // 14: aload 0
      // 15: getfield ha9.up_ Ljnq;
      // 18: invokevirtual jnq.dxs ()Lerg;
      // 1b: iload 2
      // 1c: ifne 3e
      // 1f: goto 26
      // 22: invokestatic ha9.a (Loov;)Loov;
      // 25: athrow
      // 26: ifnull 44
      // 29: goto 30
      // 2c: invokestatic ha9.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield ha9.up_ Ljnq;
      // 34: invokevirtual jnq.dxs ()Lerg;
      // 37: goto 3e
      // 3a: invokestatic ha9.a (Loov;)Loov;
      // 3d: athrow
      // 3e: getfield erg.qd2 I
      // 41: goto 45
      // 44: bipush 1
      // 45: invokevirtual jnq.afc (II)Lerg;
      // 48: bipush 0
      // 49: bipush 1
      // 4a: invokevirtual ha9.gj8 (Lerg;ZZ)Lnvf;
      // 4d: areturn
   }

   public nvf ejq(erg var1, boolean var2) {
      return this.gj8(var1, false, false);
   }

   public nvf gj8(erg param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 1
      // 006: iload 4
      // 008: ifne 01c
      // 00b: ifnonnull 01b
      // 00e: goto 015
      // 011: invokestatic ha9.a (Loov;)Loov;
      // 014: athrow
      // 015: aconst_null
      // 016: areturn
      // 017: invokestatic ha9.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 1
      // 01c: getfield erg.qd2 I
      // 01f: ifne 028
      // 022: aconst_null
      // 023: areturn
      // 024: invokestatic ha9.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 0
      // 029: getfield ha9.kfp D
      // 02c: ldc2_w 0.30000001192092896
      // 02f: dsub
      // 030: aload 0
      // 031: invokevirtual ha9.c5y ()F
      // 034: f2d
      // 035: dadd
      // 036: dstore 5
      // 038: new nvf
      // 03b: dup
      // 03c: aload 0
      // 03d: getfield ha9.oay Lt9d;
      // 040: aload 0
      // 041: getfield ha9.o2v D
      // 044: dload 5
      // 046: aload 0
      // 047: getfield ha9.vbd D
      // 04a: aload 1
      // 04b: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 04e: astore 7
      // 050: aload 7
      // 052: bipush 40
      // 054: invokevirtual nvf.op4 (I)V
      // 057: iload 3
      // 058: iload 4
      // 05a: ifne 078
      // 05d: ifeq 077
      // 060: goto 067
      // 063: invokestatic ha9.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 7
      // 069: aload 0
      // 06a: invokevirtual ha9.noc ()Ljava/lang/String;
      // 06d: invokevirtual nvf.lse (Ljava/lang/String;)V
      // 070: goto 077
      // 073: invokestatic ha9.a (Loov;)Loov;
      // 076: athrow
      // 077: iload 2
      // 078: ifeq 0c1
      // 07b: aload 0
      // 07c: getfield ha9.z2d Ljava/util/Random;
      // 07f: invokevirtual java/util/Random.nextFloat ()F
      // 082: ldc 0.5
      // 084: nop
      // 085: fmul
      // 086: fstore 8
      // 088: aload 0
      // 089: getfield ha9.z2d Ljava/util/Random;
      // 08c: invokevirtual java/util/Random.nextFloat ()F
      // 08f: ldc 3.1415927
      // 091: nop
      // 092: fmul
      // 093: fconst_2
      // 094: fmul
      // 095: fstore 9
      // 097: aload 7
      // 099: fload 9
      // 09b: invokestatic fe6.rtn (F)F
      // 09e: fneg
      // 09f: fload 8
      // 0a1: fmul
      // 0a2: f2d
      // 0a3: putfield nvf.icv D
      // 0a6: aload 7
      // 0a8: fload 9
      // 0aa: invokestatic fe6.ssk (F)F
      // 0ad: fload 8
      // 0af: fmul
      // 0b0: f2d
      // 0b1: putfield nvf.bw4 D
      // 0b4: aload 7
      // 0b6: ldc2_w 0.20000000298023224
      // 0b9: putfield nvf.mop D
      // 0bc: iload 4
      // 0be: ifeq 196
      // 0c1: ldc 0.3
      // 0c3: nop
      // 0c4: fstore 8
      // 0c6: aload 7
      // 0c8: aload 0
      // 0c9: getfield ha9.x5k F
      // 0cc: ldc 180.0
      // 0ce: nop
      // 0cf: fdiv
      // 0d0: ldc 3.1415927
      // 0d2: nop
      // 0d3: fmul
      // 0d4: invokestatic fe6.rtn (F)F
      // 0d7: fneg
      // 0d8: aload 0
      // 0d9: getfield ha9.y2i F
      // 0dc: ldc 180.0
      // 0de: nop
      // 0df: fdiv
      // 0e0: ldc 3.1415927
      // 0e2: nop
      // 0e3: fmul
      // 0e4: invokestatic fe6.ssk (F)F
      // 0e7: fmul
      // 0e8: fload 8
      // 0ea: fmul
      // 0eb: f2d
      // 0ec: putfield nvf.icv D
      // 0ef: aload 7
      // 0f1: aload 0
      // 0f2: getfield ha9.x5k F
      // 0f5: ldc 180.0
      // 0f7: nop
      // 0f8: fdiv
      // 0f9: ldc 3.1415927
      // 0fb: nop
      // 0fc: fmul
      // 0fd: invokestatic fe6.ssk (F)F
      // 100: aload 0
      // 101: getfield ha9.y2i F
      // 104: ldc 180.0
      // 106: nop
      // 107: fdiv
      // 108: ldc 3.1415927
      // 10a: nop
      // 10b: fmul
      // 10c: invokestatic fe6.ssk (F)F
      // 10f: fmul
      // 110: fload 8
      // 112: fmul
      // 113: f2d
      // 114: putfield nvf.bw4 D
      // 117: aload 7
      // 119: aload 0
      // 11a: getfield ha9.y2i F
      // 11d: ldc 180.0
      // 11f: nop
      // 120: fdiv
      // 121: ldc 3.1415927
      // 123: nop
      // 124: fmul
      // 125: invokestatic fe6.rtn (F)F
      // 128: fneg
      // 129: fload 8
      // 12b: fmul
      // 12c: ldc 0.1
      // 12e: nop
      // 12f: fadd
      // 130: f2d
      // 131: putfield nvf.mop D
      // 134: aload 0
      // 135: getfield ha9.z2d Ljava/util/Random;
      // 138: invokevirtual java/util/Random.nextFloat ()F
      // 13b: ldc 3.1415927
      // 13d: nop
      // 13e: fmul
      // 13f: fconst_2
      // 140: fmul
      // 141: fstore 9
      // 143: ldc 0.02
      // 145: nop
      // 146: aload 0
      // 147: getfield ha9.z2d Ljava/util/Random;
      // 14a: invokevirtual java/util/Random.nextFloat ()F
      // 14d: fmul
      // 14e: fstore 8
      // 150: aload 7
      // 152: dup
      // 153: getfield nvf.icv D
      // 156: fload 9
      // 158: f2d
      // 159: invokestatic java/lang/Math.cos (D)D
      // 15c: fload 8
      // 15e: f2d
      // 15f: dmul
      // 160: dadd
      // 161: putfield nvf.icv D
      // 164: aload 7
      // 166: dup
      // 167: getfield nvf.mop D
      // 16a: aload 0
      // 16b: getfield ha9.z2d Ljava/util/Random;
      // 16e: invokevirtual java/util/Random.nextFloat ()F
      // 171: aload 0
      // 172: getfield ha9.z2d Ljava/util/Random;
      // 175: invokevirtual java/util/Random.nextFloat ()F
      // 178: fsub
      // 179: ldc 0.1
      // 17b: nop
      // 17c: fmul
      // 17d: f2d
      // 17e: dadd
      // 17f: putfield nvf.mop D
      // 182: aload 7
      // 184: dup
      // 185: getfield nvf.bw4 D
      // 188: fload 9
      // 18a: f2d
      // 18b: invokestatic java/lang/Math.sin (D)D
      // 18e: fload 8
      // 190: f2d
      // 191: dmul
      // 192: dadd
      // 193: putfield nvf.bw4 D
      // 196: aload 0
      // 197: iload 4
      // 199: ifne 1b4
      // 19c: aload 7
      // 19e: invokevirtual ha9.ys6 (Lnvf;)V
      // 1a1: iload 3
      // 1a2: ifeq 1ba
      // 1a5: goto 1ac
      // 1a8: invokestatic ha9.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: aload 0
      // 1ad: goto 1b4
      // 1b0: invokestatic ha9.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: getstatic l9p.xl6 L_ss;
      // 1b7: invokevirtual ha9.aex (L_ss;)V
      // 1ba: aload 7
      // 1bc: areturn
   }

   public void ys6(nvf var1) {
      this.oay.xzq(var1);
   }

   public float ak2(e0x param1) {
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
      // 005: getfield ha9.up_ Ljnq;
      // 008: aload 1
      // 009: invokevirtual jnq.vqp (Le0x;)F
      // 00c: fstore 3
      // 00d: fload 3
      // 00e: fconst_1
      // 00f: fcmpl
      // 010: iload 2
      // 011: ifeq 05b
      // 014: ifle 054
      // 017: goto 01e
      // 01a: invokestatic ha9.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: invokestatic hc0.uh3 (Lg_3;)I
      // 022: istore 4
      // 024: aload 0
      // 025: getfield ha9.up_ Ljnq;
      // 028: invokevirtual jnq.dxs ()Lerg;
      // 02b: astore 5
      // 02d: iload 4
      // 02f: iload 2
      // 030: ifeq 05b
      // 033: ifle 054
      // 036: goto 03d
      // 039: invokestatic ha9.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 5
      // 03f: ifnull 054
      // 042: goto 049
      // 045: invokestatic ha9.a (Loov;)Loov;
      // 048: athrow
      // 049: fload 3
      // 04a: iload 4
      // 04c: iload 4
      // 04e: imul
      // 04f: bipush 1
      // 050: iadd
      // 051: i2f
      // 052: fadd
      // 053: fstore 3
      // 054: aload 0
      // 055: getstatic mcs.izk Lmcs;
      // 058: invokevirtual ha9.cab (Lmcs;)Z
      // 05b: iload 2
      // 05c: ifeq 086
      // 05f: ifeq 07f
      // 062: goto 069
      // 065: invokestatic ha9.a (Loov;)Loov;
      // 068: athrow
      // 069: fload 3
      // 06a: fconst_1
      // 06b: aload 0
      // 06c: getstatic mcs.izk Lmcs;
      // 06f: invokevirtual ha9.dhd (Lmcs;)Lsdj;
      // 072: invokevirtual sdj.tus ()I
      // 075: bipush 1
      // 076: iadd
      // 077: i2f
      // 078: ldc 0.2
      // 07a: nop
      // 07b: fmul
      // 07c: fadd
      // 07d: fmul
      // 07e: fstore 3
      // 07f: aload 0
      // 080: getstatic mcs._es Lmcs;
      // 083: invokevirtual ha9.cab (Lmcs;)Z
      // 086: iload 2
      // 087: ifeq 0f4
      // 08a: ifeq 0ed
      // 08d: goto 094
      // 090: invokestatic ha9.a (Loov;)Loov;
      // 093: athrow
      // 094: fconst_1
      // 095: fstore 4
      // 097: iload 2
      // 098: ifeq 0cd
      // 09b: aload 0
      // 09c: getstatic mcs._es Lmcs;
      // 09f: invokevirtual ha9.dhd (Lmcs;)Lsdj;
      // 0a2: invokevirtual sdj.tus ()I
      // 0a5: tableswitch 62 0 3 35 44 53 62
      // 0c4: invokestatic ha9.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: ldc 0.3
      // 0ca: nop
      // 0cb: fstore 4
      // 0cd: iload 2
      // 0ce: ifne 0e8
      // 0d1: ldc 0.09
      // 0d3: nop
      // 0d4: fstore 4
      // 0d6: iload 2
      // 0d7: ifne 0e8
      // 0da: ldc 0.0027
      // 0dc: nop
      // 0dd: fstore 4
      // 0df: iload 2
      // 0e0: ifne 0e8
      // 0e3: ldc 8.1E-4
      // 0e5: nop
      // 0e6: fstore 4
      // 0e8: fload 3
      // 0e9: fload 4
      // 0eb: fmul
      // 0ec: fstore 3
      // 0ed: aload 0
      // 0ee: getstatic p3y.six Lp3y;
      // 0f1: invokevirtual ha9.v0c (Lp3y;)Z
      // 0f4: iload 2
      // 0f5: ifeq 125
      // 0f8: ifeq 121
      // 0fb: goto 102
      // 0fe: invokestatic ha9.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: invokestatic hc0.hrk (Lg_3;)Z
      // 106: iload 2
      // 107: ifeq 125
      // 10a: goto 111
      // 10d: invokestatic ha9.a (Loov;)Loov;
      // 110: athrow
      // 111: ifne 121
      // 114: goto 11b
      // 117: invokestatic ha9.a (Loov;)Loov;
      // 11a: athrow
      // 11b: fload 3
      // 11c: ldc 5.0
      // 11e: nop
      // 11f: fdiv
      // 120: fstore 3
      // 121: aload 0
      // 122: getfield ha9.lfk Z
      // 125: ifne 12e
      // 128: fload 3
      // 129: ldc 5.0
      // 12b: nop
      // 12c: fdiv
      // 12d: fstore 3
      // 12e: fload 3
      // 12f: freturn
   }

   public boolean vc_(e0x var1) {
      return this.up_.zjf(var1);
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
      // 000: getstatic ha9.c J
      // 003: ldc2_w 114864456530969
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial Entity.cjb (Lbdo;)V
      // 00d: aload 0
      // 00e: aload 0
      // 00f: getfield ha9.vv6 Lcom/mojang/authlib/GameProfile;
      // 012: invokestatic ha9.z05 (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 015: putfield ha9.vqf Ljava/util/UUID;
      // 018: aload 1
      // 019: sipush 6821
      // 01c: ldc2_w 6644924647186084573
      // 01f: lload 2
      // 020: lxor
      // 021: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: nop
      // 027: bipush 10
      // 029: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 02c: astore 5
      // 02e: invokestatic OpaquePredicate.b ()I
      // 031: aload 0
      // 032: getfield ha9.up_ Ljnq;
      // 035: aload 5
      // 037: invokevirtual jnq.ato (Lqhg;)V
      // 03a: aload 0
      // 03b: getfield ha9.up_ Ljnq;
      // 03e: aload 1
      // 03f: sipush 27072
      // 042: ldc2_w 7643810781008445857
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: nop
      // 04d: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 050: putfield jnq.nb5 I
      // 053: aload 0
      // 054: aload 1
      // 055: sipush 24391
      // 058: ldc2_w 4005543143849719593
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 066: putfield ha9.asp Z
      // 069: aload 0
      // 06a: aload 1
      // 06b: sipush 31169
      // 06e: ldc2_w 7732935697881420208
      // 071: lload 2
      // 072: lxor
      // 073: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 07c: putfield ha9.bl8 I
      // 07f: aload 0
      // 080: aload 1
      // 081: sipush 19194
      // 084: ldc2_w 1643098045186859653
      // 087: lload 2
      // 088: lxor
      // 089: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: nop
      // 08f: invokevirtual bdo.blg (Ljava/lang/String;)F
      // 092: putfield ha9.ey9 F
      // 095: aload 0
      // 096: aload 1
      // 097: sipush 17416
      // 09a: ldc2_w 8767332571867409511
      // 09d: lload 2
      // 09e: lxor
      // 09f: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: nop
      // 0a5: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0a8: putfield ha9.op5 I
      // 0ab: istore 4
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: sipush 4136
      // 0b2: ldc2_w 7954067148205373523
      // 0b5: lload 2
      // 0b6: lxor
      // 0b7: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: nop
      // 0bd: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0c0: putfield ha9.nk0 I
      // 0c3: aload 0
      // 0c4: aload 1
      // 0c5: sipush 15429
      // 0c8: ldc2_w 4777339907543864353
      // 0cb: lload 2
      // 0cc: lxor
      // 0cd: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: nop
      // 0d3: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0d6: putfield ha9.j7g I
      // 0d9: aload 0
      // 0da: getfield ha9.j7g I
      // 0dd: iload 4
      // 0df: ifeq 118
      // 0e2: ifne 0fe
      // 0e5: goto 0ec
      // 0e8: invokestatic ha9.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: aload 0
      // 0ee: getfield ha9.z2d Ljava/util/Random;
      // 0f1: invokevirtual java/util/Random.nextInt ()I
      // 0f4: putfield ha9.j7g I
      // 0f7: goto 0fe
      // 0fa: invokestatic ha9.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: aload 1
      // 100: sipush 17807
      // 103: ldc2_w 5826454951016164815
      // 106: lload 2
      // 107: lxor
      // 108: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: nop
      // 10e: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 111: invokevirtual ha9.q7d (I)V
      // 114: aload 0
      // 115: getfield ha9.asp Z
      // 118: iload 4
      // 11a: ifeq 155
      // 11d: ifeq 141
      // 120: goto 127
      // 123: invokestatic ha9.a (Loov;)Loov;
      // 126: athrow
      // 127: aload 0
      // 128: new mew
      // 12b: dup
      // 12c: aload 0
      // 12d: invokespecial mew.<init> (Li2h;)V
      // 130: putfield ha9.ndt Lmew;
      // 133: aload 0
      // 134: bipush 1
      // 135: bipush 1
      // 136: bipush 0
      // 137: invokevirtual ha9.thu (ZZZ)V
      // 13a: goto 141
      // 13d: invokestatic ha9.a (Loov;)Loov;
      // 140: athrow
      // 141: aload 1
      // 142: sipush 25751
      // 145: ldc2_w 5306502723124251883
      // 148: lload 2
      // 149: lxor
      // 14a: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: nop
      // 150: bipush 99
      // 152: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 155: iload 4
      // 157: ifeq 246
      // 15a: ifeq 216
      // 15d: goto 164
      // 160: invokestatic ha9.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 1
      // 165: sipush 18380
      // 168: ldc2_w 5668267074907074478
      // 16b: lload 2
      // 16c: lxor
      // 16d: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: nop
      // 173: bipush 99
      // 175: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 178: iload 4
      // 17a: ifeq 246
      // 17d: goto 184
      // 180: invokestatic ha9.a (Loov;)Loov;
      // 183: athrow
      // 184: ifeq 216
      // 187: goto 18e
      // 18a: invokestatic ha9.a (Loov;)Loov;
      // 18d: athrow
      // 18e: aload 1
      // 18f: sipush 19632
      // 192: ldc2_w 2670194832605570246
      // 195: lload 2
      // 196: lxor
      // 197: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: nop
      // 19d: bipush 99
      // 19f: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1a2: iload 4
      // 1a4: ifeq 246
      // 1a7: goto 1ae
      // 1aa: invokestatic ha9.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: ifeq 216
      // 1b1: goto 1b8
      // 1b4: invokestatic ha9.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: new mew
      // 1bc: dup
      // 1bd: aload 1
      // 1be: sipush 25751
      // 1c1: ldc2_w 5306502723124251883
      // 1c4: lload 2
      // 1c5: lxor
      // 1c6: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: nop
      // 1cc: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1cf: aload 1
      // 1d0: sipush 18380
      // 1d3: ldc2_w 5668267074907074478
      // 1d6: lload 2
      // 1d7: lxor
      // 1d8: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: nop
      // 1de: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1e1: aload 1
      // 1e2: sipush 19632
      // 1e5: ldc2_w 2670194832605570246
      // 1e8: lload 2
      // 1e9: lxor
      // 1ea: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: nop
      // 1f0: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 1f3: invokespecial mew.<init> (III)V
      // 1f6: putfield ha9.w2b Lmew;
      // 1f9: aload 0
      // 1fa: aload 1
      // 1fb: sipush 2696
      // 1fe: ldc2_w 3684911032819720956
      // 201: lload 2
      // 202: lxor
      // 203: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: nop
      // 209: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 20c: putfield ha9.ht4 Z
      // 20f: goto 216
      // 212: invokestatic ha9.a (Loov;)Loov;
      // 215: athrow
      // 216: aload 0
      // 217: getfield ha9.kbo Lwkk;
      // 21a: aload 1
      // 21b: invokevirtual wkk.i9r (Lbdo;)V
      // 21e: aload 0
      // 21f: getfield ha9.lls Lpj2;
      // 222: aload 1
      // 223: invokevirtual pj2.q9u (Lbdo;)V
      // 226: aload 1
      // 227: sipush 14795
      // 22a: ldc2_w 264248793475813792
      // 22d: lload 2
      // 22e: lxor
      // 22f: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: nop
      // 235: bipush 9
      // 237: iload 4
      // 239: ifeq 261
      // 23c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 23f: goto 246
      // 242: invokestatic ha9.a (Loov;)Loov;
      // 245: athrow
      // 246: ifeq 26f
      // 249: aload 1
      // 24a: sipush 14795
      // 24d: ldc2_w 264248793475813792
      // 250: lload 2
      // 251: lxor
      // 252: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: nop
      // 258: bipush 10
      // 25a: goto 261
      // 25d: invokestatic ha9.a (Loov;)Loov;
      // 260: athrow
      // 261: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 264: astore 6
      // 266: aload 0
      // 267: getfield ha9.gk4 Lctr;
      // 26a: aload 6
      // 26c: invokevirtual ctr.cj6 (Lqhg;)V
      // 26f: return
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
      // 000: getstatic ha9.c J
      // 003: ldc2_w 33920351441074
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial Entity.srs (Lbdo;)V
      // 00d: aload 1
      // 00e: sipush 4540
      // 011: ldc2_w 4225756814096618866
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: aload 0
      // 01d: getfield ha9.up_ Ljnq;
      // 020: new qhg
      // 023: dup
      // 024: invokespecial qhg.<init> ()V
      // 027: invokevirtual jnq.gi5 (Lqhg;)Lqhg;
      // 02a: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 02d: aload 1
      // 02e: sipush 28306
      // 031: ldc2_w 3915929767590177363
      // 034: lload 2
      // 035: lxor
      // 036: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: nop
      // 03c: aload 0
      // 03d: getfield ha9.up_ Ljnq;
      // 040: getfield jnq.nb5 I
      // 043: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 046: invokestatic OpaquePredicate.c ()I
      // 049: aload 1
      // 04a: sipush 12646
      // 04d: ldc2_w 1567420114661602744
      // 050: lload 2
      // 051: lxor
      // 052: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: nop
      // 058: aload 0
      // 059: getfield ha9.asp Z
      // 05c: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 05f: aload 1
      // 060: sipush 31243
      // 063: ldc2_w 8847613053610573544
      // 066: lload 2
      // 067: lxor
      // 068: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: nop
      // 06e: aload 0
      // 06f: getfield ha9.bl8 I
      // 072: i2s
      // 073: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 076: aload 1
      // 077: sipush 24712
      // 07a: ldc2_w 999892270058415168
      // 07d: lload 2
      // 07e: lxor
      // 07f: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: nop
      // 085: aload 0
      // 086: getfield ha9.ey9 F
      // 089: invokevirtual bdo._i9 (Ljava/lang/String;F)V
      // 08c: istore 4
      // 08e: aload 1
      // 08f: sipush 26684
      // 092: ldc2_w 4809691163192470742
      // 095: lload 2
      // 096: lxor
      // 097: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: nop
      // 09d: aload 0
      // 09e: getfield ha9.op5 I
      // 0a1: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0a4: aload 1
      // 0a5: sipush 2315
      // 0a8: ldc2_w 698504678993939945
      // 0ab: lload 2
      // 0ac: lxor
      // 0ad: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: aload 0
      // 0b4: getfield ha9.nk0 I
      // 0b7: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0ba: aload 1
      // 0bb: sipush 30949
      // 0be: ldc2_w 1786162760306015245
      // 0c1: lload 2
      // 0c2: lxor
      // 0c3: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: nop
      // 0c9: aload 0
      // 0ca: getfield ha9.j7g I
      // 0cd: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0d0: aload 1
      // 0d1: sipush 11453
      // 0d4: ldc2_w 6425735818956597360
      // 0d7: lload 2
      // 0d8: lxor
      // 0d9: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: nop
      // 0df: aload 0
      // 0e0: invokevirtual ha9.zy2 ()I
      // 0e3: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0e6: aload 0
      // 0e7: iload 4
      // 0e9: ifne 18b
      // 0ec: getfield ha9.w2b Lmew;
      // 0ef: ifnull 161
      // 0f2: goto 0f9
      // 0f5: invokestatic ha9.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: sipush 23506
      // 0fd: ldc2_w 1512286771462708999
      // 100: lload 2
      // 101: lxor
      // 102: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: nop
      // 108: aload 0
      // 109: getfield ha9.w2b Lmew;
      // 10c: invokevirtual mew.getX ()I
      // 10f: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 112: aload 1
      // 113: sipush 17605
      // 116: ldc2_w 5970740421167939614
      // 119: lload 2
      // 11a: lxor
      // 11b: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: nop
      // 121: aload 0
      // 122: getfield ha9.w2b Lmew;
      // 125: invokevirtual mew.getY ()I
      // 128: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 12b: aload 1
      // 12c: sipush 16745
      // 12f: ldc2_w 4916975852943934882
      // 132: lload 2
      // 133: lxor
      // 134: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: nop
      // 13a: aload 0
      // 13b: getfield ha9.w2b Lmew;
      // 13e: invokevirtual mew.getZ ()I
      // 141: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 144: aload 1
      // 145: sipush 9626
      // 148: ldc2_w 1767399180096725324
      // 14b: lload 2
      // 14c: lxor
      // 14d: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: nop
      // 153: aload 0
      // 154: getfield ha9.ht4 Z
      // 157: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 15a: goto 161
      // 15d: invokestatic ha9.a (Loov;)Loov;
      // 160: athrow
      // 161: aload 0
      // 162: getfield ha9.kbo Lwkk;
      // 165: aload 1
      // 166: invokevirtual wkk.sgq (Lbdo;)V
      // 169: aload 0
      // 16a: getfield ha9.lls Lpj2;
      // 16d: aload 1
      // 16e: invokevirtual pj2.e9k (Lbdo;)V
      // 171: aload 1
      // 172: sipush 24180
      // 175: ldc2_w 6792544846464817809
      // 178: lload 2
      // 179: lxor
      // 17a: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: nop
      // 180: aload 0
      // 181: getfield ha9.gk4 Lctr;
      // 184: invokevirtual ctr._1u ()Lqhg;
      // 187: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 18a: aload 0
      // 18b: getfield ha9.up_ Ljnq;
      // 18e: invokevirtual jnq.dxs ()Lerg;
      // 191: astore 5
      // 193: aload 5
      // 195: iload 4
      // 197: ifne 1a6
      // 19a: ifnull 1d1
      // 19d: goto 1a4
      // 1a0: invokestatic ha9.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: aload 5
      // 1a6: invokevirtual erg.gn1 ()Lu7m;
      // 1a9: ifnull 1d1
      // 1ac: aload 1
      // 1ad: sipush 28395
      // 1b0: ldc2_w 1910654958678714892
      // 1b3: lload 2
      // 1b4: lxor
      // 1b5: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: nop
      // 1bb: aload 5
      // 1bd: new bdo
      // 1c0: dup
      // 1c1: invokespecial bdo.<init> ()V
      // 1c4: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 1c7: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 1ca: goto 1d1
      // 1cd: invokestatic ha9.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: return
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual ha9.nss (Lofh;)Z
      // 009: iload 3
      // 00a: ifeq 024
      // 00d: ifeq 01d
      // 010: goto 017
      // 013: invokestatic ha9.a (Loov;)Loov;
      // 016: athrow
      // 017: bipush 0
      // 018: ireturn
      // 019: invokestatic ha9.a (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: getfield ha9.lls Lpj2;
      // 021: getfield pj2.lez Z
      // 024: iload 3
      // 025: ifeq 05c
      // 028: ifeq 051
      // 02b: goto 032
      // 02e: invokestatic ha9.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 1
      // 033: invokevirtual ofh.u5u ()Z
      // 036: iload 3
      // 037: ifeq 05c
      // 03a: goto 041
      // 03d: invokestatic ha9.a (Loov;)Loov;
      // 040: athrow
      // 041: ifne 051
      // 044: goto 04b
      // 047: invokestatic ha9.a (Loov;)Loov;
      // 04a: athrow
      // 04b: bipush 0
      // 04c: ireturn
      // 04d: invokestatic ha9.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: bipush 0
      // 053: putfield ha9.dof I
      // 056: aload 0
      // 057: invokevirtual ha9.i55 ()F
      // 05a: fconst_0
      // 05b: fcmpg
      // 05c: iload 3
      // 05d: ifeq 074
      // 060: ifgt 070
      // 063: goto 06a
      // 066: invokestatic ha9.a (Loov;)Loov;
      // 069: athrow
      // 06a: bipush 0
      // 06b: ireturn
      // 06c: invokestatic ha9.a (Loov;)Loov;
      // 06f: athrow
      // 070: aload 0
      // 071: invokevirtual ha9.ofg ()Z
      // 074: iload 3
      // 075: ifeq 0b0
      // 078: ifeq 0ac
      // 07b: goto 082
      // 07e: invokestatic ha9.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: getfield ha9.oay Lt9d;
      // 086: getfield OpaquePredicate.v0f Z
      // 089: iload 3
      // 08a: ifeq 0b0
      // 08d: goto 094
      // 090: invokestatic ha9.a (Loov;)Loov;
      // 093: athrow
      // 094: ifne 0ac
      // 097: goto 09e
      // 09a: invokestatic ha9.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 0
      // 09f: bipush 1
      // 0a0: bipush 1
      // 0a1: bipush 0
      // 0a2: invokevirtual ha9.thu (ZZZ)V
      // 0a5: goto 0ac
      // 0a8: invokestatic ha9.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: aload 1
      // 0ad: invokevirtual ofh.li9 ()Z
      // 0b0: iload 3
      // 0b1: ifeq 115
      // 0b4: ifeq 112
      // 0b7: goto 0be
      // 0ba: invokestatic ha9.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield ha9.oay Lt9d;
      // 0c2: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 0c5: getstatic v66.na2 Lv66;
      // 0c8: iload 3
      // 0c9: ifeq 0e9
      // 0cc: goto 0d3
      // 0cf: invokestatic ha9.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: if_acmpne 0df
      // 0d6: goto 0dd
      // 0d9: invokestatic ha9.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: fconst_0
      // 0de: fstore 2
      // 0df: aload 0
      // 0e0: getfield ha9.oay Lt9d;
      // 0e3: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 0e6: getstatic v66.g4t Lv66;
      // 0e9: iload 3
      // 0ea: ifeq 107
      // 0ed: if_acmpne 0fd
      // 0f0: goto 0f7
      // 0f3: invokestatic ha9.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: fload 2
      // 0f8: fconst_2
      // 0f9: fdiv
      // 0fa: fconst_1
      // 0fb: fadd
      // 0fc: fstore 2
      // 0fd: aload 0
      // 0fe: getfield ha9.oay Lt9d;
      // 101: invokevirtual OpaquePredicate.rbk ()Lv66;
      // 104: getstatic v66.csg Lv66;
      // 107: if_acmpne 112
      // 10a: fload 2
      // 10b: ldc 3.0
      // 10d: nop
      // 10e: fmul
      // 10f: fconst_2
      // 110: fdiv
      // 111: fstore 2
      // 112: fload 2
      // 113: fconst_0
      // 114: fcmpl
      // 115: iload 3
      // 116: ifeq 124
      // 119: ifne 125
      // 11c: goto 123
      // 11f: invokestatic ha9.a (Loov;)Loov;
      // 122: athrow
      // 123: bipush 0
      // 124: ireturn
      // 125: aload 1
      // 126: invokevirtual ofh.nra ()Li2h;
      // 129: astore 4
      // 12b: aload 4
      // 12d: instanceof hy9
      // 130: iload 3
      // 131: ifeq 172
      // 134: ifeq 16c
      // 137: goto 13e
      // 13a: invokestatic ha9.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 4
      // 140: checkcast hy9
      // 143: getfield hy9.k_d Li2h;
      // 146: iload 3
      // 147: ifeq 16a
      // 14a: goto 151
      // 14d: invokestatic ha9.a (Loov;)Loov;
      // 150: athrow
      // 151: ifnull 16c
      // 154: goto 15b
      // 157: invokestatic ha9.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 4
      // 15d: checkcast hy9
      // 160: getfield hy9.k_d Li2h;
      // 163: goto 16a
      // 166: invokestatic ha9.a (Loov;)Loov;
      // 169: athrow
      // 16a: astore 4
      // 16c: aload 0
      // 16d: aload 1
      // 16e: fload 2
      // 16f: invokespecial Entity.m1t (Lofh;F)Z
      // 172: ireturn
   }

   public boolean _ck(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual ha9.ued ()Ln_0;
      // 04: astore 3
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: aload 1
      // 09: invokevirtual ha9.ued ()Ln_0;
      // 0c: astore 4
      // 0e: istore 2
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne 27
      // 14: ifnonnull 26
      // 17: goto 1e
      // 1a: invokestatic ha9.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: goto 46
      // 22: invokestatic ha9.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 3
      // 27: iload 2
      // 28: ifne 43
      // 2b: aload 4
      // 2d: invokevirtual n_0.msm (Ln_0;)Z
      // 30: ifne 42
      // 33: goto 3a
      // 36: invokestatic ha9.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 46
      // 3e: invokestatic ha9.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 3
      // 43: invokevirtual n_0.w7v ()Z
      // 46: ireturn
   }

   @Override
   public void puw(float var1) {
      this.up_.yjt(var1);
   }

   @Override
   public int y5z() {
      return this.up_.tth();
   }

   public float ws9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic OpaquePredicate.b ()I
      // 05: aload 0
      // 06: getfield ha9.up_ Ljnq;
      // 09: getfield jnq._dn [Lerg;
      // 0c: astore 3
      // 0d: istore 1
      // 0e: aload 3
      // 0f: arraylength
      // 10: istore 4
      // 12: bipush 0
      // 13: istore 5
      // 15: iload 5
      // 17: iload 4
      // 19: if_icmpge 43
      // 1c: aload 3
      // 1d: iload 5
      // 1f: aaload
      // 20: astore 6
      // 22: iload 1
      // 23: ifeq 3f
      // 26: aload 6
      // 28: ifnull 3c
      // 2b: goto 32
      // 2e: invokestatic ha9.a (Loov;)Loov;
      // 31: athrow
      // 32: iinc 2 1
      // 35: goto 3c
      // 38: invokestatic ha9.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iinc 5 1
      // 3f: iload 1
      // 40: ifne 15
      // 43: iload 2
      // 44: i2f
      // 45: aload 0
      // 46: getfield ha9.up_ Ljnq;
      // 49: getfield jnq._dn [Lerg;
      // 4c: arraylength
      // 4d: i2f
      // 4e: fdiv
      // 4f: freturn
   }

   @Override
   public void vza(ofh param1, float param2) {
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
      // 06: invokevirtual ha9.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifne 22
      // 0d: ifne f6
      // 10: goto 17
      // 13: invokestatic ha9.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: invokevirtual ofh.e8m ()Z
      // 1b: goto 22
      // 1e: invokestatic ha9.a (Loov;)Loov;
      // 21: athrow
      // 22: iload 3
      // 23: ifne 46
      // 26: ifne 69
      // 29: goto 30
      // 2c: invokestatic ha9.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: iload 3
      // 32: ifne 71
      // 35: goto 3c
      // 38: invokestatic ha9.a (Loov;)Loov;
      // 3b: athrow
      // 3c: invokevirtual ha9.kqk ()Z
      // 3f: goto 46
      // 42: invokestatic ha9.a (Loov;)Loov;
      // 45: athrow
      // 46: ifeq 69
      // 49: fload 2
      // 4a: iload 3
      // 4b: ifne 78
      // 4e: goto 55
      // 51: invokestatic ha9.a (Loov;)Loov;
      // 54: athrow
      // 55: fconst_0
      // 56: fcmpl
      // 57: ifle 69
      // 5a: goto 61
      // 5d: invokestatic ha9.a (Loov;)Loov;
      // 60: athrow
      // 61: fconst_1
      // 62: fload 2
      // 63: fadd
      // 64: ldc 0.5
      // 66: nop
      // 67: fmul
      // 68: fstore 2
      // 69: aload 0
      // 6a: aload 1
      // 6b: fload 2
      // 6c: invokevirtual ha9.phv (Lofh;F)F
      // 6f: fstore 2
      // 70: aload 0
      // 71: aload 1
      // 72: fload 2
      // 73: invokevirtual ha9.yef (Lofh;F)F
      // 76: fstore 2
      // 77: fload 2
      // 78: fstore 4
      // 7a: fload 2
      // 7b: aload 0
      // 7c: invokevirtual ha9._xk ()F
      // 7f: fsub
      // 80: fconst_0
      // 81: invokestatic java/lang/Math.max (FF)F
      // 84: fstore 2
      // 85: aload 0
      // 86: aload 0
      // 87: invokevirtual ha9._xk ()F
      // 8a: fload 4
      // 8c: fload 2
      // 8d: fsub
      // 8e: fsub
      // 8f: invokevirtual ha9.pr9 (F)V
      // 92: fload 2
      // 93: iload 3
      // 94: ifne b6
      // 97: fconst_0
      // 98: fcmpl
      // 99: ifeq f6
      // 9c: goto a3
      // 9f: invokestatic ha9.a (Loov;)Loov;
      // a2: athrow
      // a3: aload 0
      // a4: aload 1
      // a5: invokevirtual ofh.rig ()F
      // a8: invokevirtual ha9.i8a (F)V
      // ab: aload 0
      // ac: invokevirtual ha9.i55 ()F
      // af: goto b6
      // b2: invokestatic ha9.a (Loov;)Loov;
      // b5: athrow
      // b6: fstore 5
      // b8: aload 0
      // b9: aload 0
      // ba: invokevirtual ha9.i55 ()F
      // bd: fload 2
      // be: fsub
      // bf: invokevirtual ha9.uh3 (F)V
      // c2: aload 0
      // c3: iload 3
      // c4: ifne e8
      // c7: invokevirtual ha9.ii6 ()Lw0s;
      // ca: aload 1
      // cb: fload 5
      // cd: fload 2
      // ce: invokevirtual w0s.dp2 (Lofh;FF)V
      // d1: fload 2
      // d2: ldc 3.4028235E37
      // d4: nop
      // d5: fcmpg
      // d6: ifge f6
      // d9: goto e0
      // dc: invokestatic ha9.a (Loov;)Loov;
      // df: athrow
      // e0: aload 0
      // e1: goto e8
      // e4: invokestatic ha9.a (Loov;)Loov;
      // e7: athrow
      // e8: getstatic l9p.lzd L_ss;
      // eb: fload 2
      // ec: ldc 10.0
      // ee: nop
      // ef: fmul
      // f0: invokestatic java/lang/Math.round (F)I
      // f3: invokevirtual ha9.qcw (L_ss;I)V
      // f6: return
   }

   public void v6x(TileEntitySign var1) {
   }

   public void mmg(k6s var1) {
   }

   public void vhi(a7q var1) {
   }

   public void a_o(rsi var1) {
   }

   public void b_m(zfo var1, rsi var2) {
   }

   public void xz_(_83 var1) {
   }

   public void rlk(erg var1) {
   }

   public boolean gve(EntityLivingBase param1) {
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
      // 005: iload 2
      // 006: ifeq 041
      // 009: invokevirtual ha9.myu ()Z
      // 00c: ifeq 040
      // 00f: goto 016
      // 012: invokestatic ha9.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 1
      // 017: instanceof rsi
      // 01a: iload 2
      // 01b: ifeq 03f
      // 01e: goto 025
      // 021: invokestatic ha9.a (Loov;)Loov;
      // 024: athrow
      // 025: ifeq 03e
      // 028: goto 02f
      // 02b: invokestatic ha9.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: aload 1
      // 031: checkcast rsi
      // 034: invokevirtual ha9.a_o (Lrsi;)V
      // 037: goto 03e
      // 03a: invokestatic ha9.a (Loov;)Loov;
      // 03d: athrow
      // 03e: bipush 0
      // 03f: ireturn
      // 040: aload 0
      // 041: invokevirtual ha9.b5z ()Lerg;
      // 044: astore 3
      // 045: aload 3
      // 046: iload 2
      // 047: ifeq 05f
      // 04a: ifnull 062
      // 04d: goto 054
      // 050: invokestatic ha9.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 3
      // 055: invokevirtual erg.yaq ()Lerg;
      // 058: goto 05f
      // 05b: invokestatic ha9.a (Loov;)Loov;
      // 05e: athrow
      // 05f: goto 063
      // 062: aconst_null
      // 063: astore 4
      // 065: aload 1
      // 066: aload 0
      // 067: invokevirtual EntityLivingBase.k25 (Lha9;)Z
      // 06a: ifne 10b
      // 06d: aload 3
      // 06e: ifnull 109
      // 071: goto 078
      // 074: invokestatic ha9.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 1
      // 079: instanceof Entity
      // 07c: iload 2
      // 07d: ifeq 10a
      // 080: goto 087
      // 083: invokestatic ha9.a (Loov;)Loov;
      // 086: athrow
      // 087: ifeq 109
      // 08a: goto 091
      // 08d: invokestatic ha9.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 0
      // 092: getfield ha9.lls Lpj2;
      // 095: getfield pj2.g40 Z
      // 098: iload 2
      // 099: ifeq 0b9
      // 09c: goto 0a3
      // 09f: invokestatic ha9.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: ifeq 0b0
      // 0a6: goto 0ad
      // 0a9: invokestatic ha9.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 4
      // 0af: astore 3
      // 0b0: aload 3
      // 0b1: aload 0
      // 0b2: aload 1
      // 0b3: checkcast Entity
      // 0b6: invokevirtual erg.fxo (Lha9;Lg_3;)Z
      // 0b9: iload 2
      // 0ba: ifeq 10a
      // 0bd: ifeq 109
      // 0c0: goto 0c7
      // 0c3: invokestatic ha9.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 3
      // 0c8: getfield erg.qd2 I
      // 0cb: iload 2
      // 0cc: ifeq 108
      // 0cf: goto 0d6
      // 0d2: invokestatic ha9.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: ifgt 107
      // 0d9: goto 0e0
      // 0dc: invokestatic ha9.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: getfield ha9.lls Lpj2;
      // 0e4: getfield pj2.g40 Z
      // 0e7: iload 2
      // 0e8: ifeq 108
      // 0eb: goto 0f2
      // 0ee: invokestatic ha9.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: ifne 107
      // 0f5: goto 0fc
      // 0f8: invokestatic ha9.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: invokevirtual ha9.gwo ()V
      // 100: goto 107
      // 103: invokestatic ha9.a (Loov;)Loov;
      // 106: athrow
      // 107: bipush 1
      // 108: ireturn
      // 109: bipush 0
      // 10a: ireturn
      // 10b: aload 3
      // 10c: iload 2
      // 10d: ifeq 11b
      // 110: ifnull 1bb
      // 113: goto 11a
      // 116: invokestatic ha9.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 3
      // 11b: iload 2
      // 11c: ifeq 135
      // 11f: aload 0
      // 120: invokevirtual ha9.b5z ()Lerg;
      // 123: if_acmpne 1bb
      // 126: goto 12d
      // 129: invokestatic ha9.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 3
      // 12e: goto 135
      // 131: invokestatic ha9.a (Loov;)Loov;
      // 134: athrow
      // 135: getfield erg.qd2 I
      // 138: iload 2
      // 139: ifeq 17c
      // 13c: ifgt 171
      // 13f: goto 146
      // 142: invokestatic ha9.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 0
      // 147: getfield ha9.lls Lpj2;
      // 14a: getfield pj2.g40 Z
      // 14d: iload 2
      // 14e: ifeq 17c
      // 151: goto 158
      // 154: invokestatic ha9.a (Loov;)Loov;
      // 157: athrow
      // 158: ifne 171
      // 15b: goto 162
      // 15e: invokestatic ha9.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 0
      // 163: invokevirtual ha9.gwo ()V
      // 166: iload 2
      // 167: ifne 1bb
      // 16a: goto 171
      // 16d: invokestatic ha9.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 3
      // 172: getfield erg.qd2 I
      // 175: goto 17c
      // 178: invokestatic ha9.a (Loov;)Loov;
      // 17b: athrow
      // 17c: iload 2
      // 17d: ifeq 1bc
      // 180: aload 4
      // 182: getfield erg.qd2 I
      // 185: if_icmpge 1bb
      // 188: goto 18f
      // 18b: invokestatic ha9.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 0
      // 190: getfield ha9.lls Lpj2;
      // 193: getfield pj2.g40 Z
      // 196: iload 2
      // 197: ifeq 1bc
      // 19a: goto 1a1
      // 19d: invokestatic ha9.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: ifeq 1bb
      // 1a4: goto 1ab
      // 1a7: invokestatic ha9.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: aload 3
      // 1ac: aload 4
      // 1ae: getfield erg.qd2 I
      // 1b1: putfield erg.qd2 I
      // 1b4: goto 1bb
      // 1b7: invokestatic ha9.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: bipush 1
      // 1bc: ireturn
   }

   public erg b5z() {
      return this.up_.dxs();
   }

   public void gwo() {
      this.up_.cxl(this.up_.nb5, (erg)null);
   }

   @Override
   public double g4y() {
      return -0.35;
   }

   public void v2x(EntityLivingBase param1) {
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
      // 005: invokevirtual EntityLivingBase.qvl ()Z
      // 008: iload 2
      // 009: ifeq 022
      // 00c: ifeq 4a9
      // 00f: goto 016
      // 012: invokestatic ha9.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 1
      // 017: aload 0
      // 018: invokevirtual EntityLivingBase.s_r (Li2h;)Z
      // 01b: goto 022
      // 01e: invokestatic ha9.a (Loov;)Loov;
      // 021: athrow
      // 022: ifne 4a9
      // 025: aload 0
      // 026: getstatic m6d.y3f Lw9p;
      // 029: invokevirtual ha9.dgt (Lw9p;)L_4o;
      // 02c: invokeinterface _4o.nz5 ()D 1
      // 031: d2f
      // 032: fstore 3
      // 033: bipush 0
      // 034: istore 4
      // 036: fconst_0
      // 037: fstore 5
      // 039: iload 2
      // 03a: ifeq 05b
      // 03d: aload 1
      // 03e: instanceof Entity
      // 041: ifeq 05f
      // 044: goto 04b
      // 047: invokestatic ha9.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: invokevirtual ha9.tsc ()Lerg;
      // 04f: aload 1
      // 050: checkcast Entity
      // 053: invokevirtual Entity.fhc ()Ln1e;
      // 056: invokestatic hc0.xpe (Lerg;Ln1e;)F
      // 059: fstore 5
      // 05b: iload 2
      // 05c: ifne 06b
      // 05f: aload 0
      // 060: invokevirtual ha9.tsc ()Lerg;
      // 063: getstatic n1e.y3x Ln1e;
      // 066: invokestatic hc0.xpe (Lerg;Ln1e;)F
      // 069: fstore 5
      // 06b: iload 4
      // 06d: aload 0
      // 06e: invokestatic hc0.kzt (Lg_3;)I
      // 071: iadd
      // 072: istore 4
      // 074: aload 0
      // 075: invokevirtual ha9.ew1 ()Z
      // 078: iload 2
      // 079: ifeq 08c
      // 07c: ifeq 089
      // 07f: goto 086
      // 082: invokestatic ha9.a (Loov;)Loov;
      // 085: athrow
      // 086: iinc 4 1
      // 089: fload 3
      // 08a: fconst_0
      // 08b: fcmpl
      // 08c: iload 2
      // 08d: ifeq 0c0
      // 090: ifgt 0b3
      // 093: goto 09a
      // 096: invokestatic ha9.a (Loov;)Loov;
      // 099: athrow
      // 09a: fload 5
      // 09c: fconst_0
      // 09d: fcmpl
      // 09e: iload 2
      // 09f: ifeq 0c0
      // 0a2: goto 0a9
      // 0a5: invokestatic ha9.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ifle 4a9
      // 0ac: goto 0b3
      // 0af: invokestatic ha9.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield ha9.o_8 F
      // 0b7: fconst_0
      // 0b8: fcmpl
      // 0b9: goto 0c0
      // 0bc: invokestatic ha9.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 2
      // 0c1: ifeq 0d9
      // 0c4: ifle 164
      // 0c7: goto 0ce
      // 0ca: invokestatic ha9.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield ha9.lfk Z
      // 0d2: goto 0d9
      // 0d5: invokestatic ha9.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iload 2
      // 0da: ifeq 0f2
      // 0dd: ifne 164
      // 0e0: goto 0e7
      // 0e3: invokestatic ha9.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: invokevirtual ha9.z2m ()Z
      // 0eb: goto 0f2
      // 0ee: invokestatic ha9.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: iload 2
      // 0f3: ifeq 10b
      // 0f6: ifne 164
      // 0f9: goto 100
      // 0fc: invokestatic ha9.a (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 0
      // 101: invokevirtual ha9.mwv ()Z
      // 104: goto 10b
      // 107: invokestatic ha9.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 2
      // 10c: ifeq 132
      // 10f: ifne 164
      // 112: goto 119
      // 115: invokestatic ha9.a (Loov;)Loov;
      // 118: athrow
      // 119: aload 0
      // 11a: iload 2
      // 11b: ifeq 140
      // 11e: goto 125
      // 121: invokestatic ha9.a (Loov;)Loov;
      // 124: athrow
      // 125: getstatic mcs.s19 Lmcs;
      // 128: invokevirtual ha9.cab (Lmcs;)Z
      // 12b: goto 132
      // 12e: invokestatic ha9.a (Loov;)Loov;
      // 131: athrow
      // 132: ifne 164
      // 135: aload 0
      // 136: getfield ha9.hzp Li2h;
      // 139: goto 140
      // 13c: invokestatic ha9.a (Loov;)Loov;
      // 13f: athrow
      // 140: iload 2
      // 141: ifeq 14f
      // 144: ifnonnull 164
      // 147: goto 14e
      // 14a: invokestatic ha9.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 1
      // 14f: instanceof Entity
      // 152: iload 2
      // 153: ifeq 161
      // 156: ifeq 164
      // 159: goto 160
      // 15c: invokestatic ha9.a (Loov;)Loov;
      // 15f: athrow
      // 160: bipush 1
      // 161: goto 165
      // 164: bipush 0
      // 165: istore 6
      // 167: iload 6
      // 169: iload 2
      // 16a: ifeq 19b
      // 16d: ifeq 195
      // 170: goto 177
      // 173: invokestatic ha9.a (Loov;)Loov;
      // 176: athrow
      // 177: fload 3
      // 178: fconst_0
      // 179: fcmpl
      // 17a: iload 2
      // 17b: ifeq 19b
      // 17e: goto 185
      // 181: invokestatic ha9.a (Loov;)Loov;
      // 184: athrow
      // 185: ifle 195
      // 188: goto 18f
      // 18b: invokestatic ha9.a (Loov;)Loov;
      // 18e: athrow
      // 18f: fload 3
      // 190: ldc 1.5
      // 192: nop
      // 193: fmul
      // 194: fstore 3
      // 195: fload 3
      // 196: fload 5
      // 198: fadd
      // 199: fstore 3
      // 19a: bipush 0
      // 19b: istore 7
      // 19d: aload 0
      // 19e: invokestatic hc0.ieh (Lg_3;)I
      // 1a1: istore 8
      // 1a3: aload 1
      // 1a4: iload 2
      // 1a5: ifeq 1ee
      // 1a8: instanceof Entity
      // 1ab: ifeq 1ed
      // 1ae: goto 1b5
      // 1b1: invokestatic ha9.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: iload 8
      // 1b7: iload 2
      // 1b8: ifeq 1e2
      // 1bb: goto 1c2
      // 1be: invokestatic ha9.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: ifle 1ed
      // 1c5: goto 1cc
      // 1c8: invokestatic ha9.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 1
      // 1cd: iload 2
      // 1ce: ifeq 1ee
      // 1d1: goto 1d8
      // 1d4: invokestatic ha9.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: invokevirtual EntityLivingBase.agj ()Z
      // 1db: goto 1e2
      // 1de: invokestatic ha9.a (Loov;)Loov;
      // 1e1: athrow
      // 1e2: ifne 1ed
      // 1e5: bipush 1
      // 1e6: istore 7
      // 1e8: aload 1
      // 1e9: bipush 1
      // 1ea: invokevirtual EntityLivingBase.k03 (I)V
      // 1ed: aload 1
      // 1ee: getfield EntityLivingBase.icv D
      // 1f1: dstore 9
      // 1f3: aload 1
      // 1f4: getfield EntityLivingBase.mop D
      // 1f7: dstore 11
      // 1f9: aload 1
      // 1fa: getfield EntityLivingBase.bw4 D
      // 1fd: dstore 13
      // 1ff: aload 1
      // 200: aload 0
      // 201: invokestatic ofh.c_k (Lha9;)Lofh;
      // 204: fload 3
      // 205: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 208: istore 15
      // 20a: iload 15
      // 20c: iload 2
      // 20d: ifeq 49b
      // 210: ifeq 492
      // 213: goto 21a
      // 216: invokestatic ha9.a (Loov;)Loov;
      // 219: athrow
      // 21a: iload 4
      // 21c: iload 2
      // 21d: ifeq 2c8
      // 220: goto 227
      // 223: invokestatic ha9.a (Loov;)Loov;
      // 226: athrow
      // 227: ifle 2c4
      // 22a: goto 231
      // 22d: invokestatic ha9.a (Loov;)Loov;
      // 230: athrow
      // 231: aload 0
      // 232: invokestatic Minecraft.vz1 ()Lc05;
      // 235: getfield Minecraft.vg8 Ll86;
      // 238: iload 2
      // 239: ifeq 2b5
      // 23c: goto 243
      // 23f: invokestatic ha9.a (Loov;)Loov;
      // 242: athrow
      // 243: if_acmpne 268
      // 246: goto 24d
      // 249: invokestatic ha9.a (Loov;)Loov;
      // 24c: athrow
      // 24d: getstatic ModuleRegistry.rtu Ljqz;
      // 250: invokevirtual jqz.klu ()Z
      // 253: iload 2
      // 254: ifeq 2c8
      // 257: goto 25e
      // 25a: invokestatic ha9.a (Loov;)Loov;
      // 25d: athrow
      // 25e: ifne 2c4
      // 261: goto 268
      // 264: invokestatic ha9.a (Loov;)Loov;
      // 267: athrow
      // 268: aload 1
      // 269: aload 0
      // 26a: getfield ha9.x5k F
      // 26d: ldc 3.1415927
      // 26f: nop
      // 270: fmul
      // 271: ldc 180.0
      // 273: nop
      // 274: fdiv
      // 275: invokestatic fe6.rtn (F)F
      // 278: fneg
      // 279: iload 4
      // 27b: i2f
      // 27c: fmul
      // 27d: ldc 0.5
      // 27f: nop
      // 280: fmul
      // 281: f2d
      // 282: ldc2_w 0.1
      // 285: aload 0
      // 286: getfield ha9.x5k F
      // 289: ldc 3.1415927
      // 28b: nop
      // 28c: fmul
      // 28d: ldc 180.0
      // 28f: nop
      // 290: fdiv
      // 291: invokestatic fe6.ssk (F)F
      // 294: iload 4
      // 296: i2f
      // 297: fmul
      // 298: ldc 0.5
      // 29a: nop
      // 29b: fmul
      // 29c: f2d
      // 29d: invokevirtual EntityLivingBase.w7w (DDD)V
      // 2a0: aload 0
      // 2a1: dup
      // 2a2: getfield ha9.icv D
      // 2a5: ldc2_w 0.6
      // 2a8: dmul
      // 2a9: putfield ha9.icv D
      // 2ac: aload 0
      // 2ad: dup
      // 2ae: goto 2b5
      // 2b1: invokestatic ha9.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: getfield ha9.bw4 D
      // 2b8: ldc2_w 0.6
      // 2bb: dmul
      // 2bc: putfield ha9.bw4 D
      // 2bf: aload 0
      // 2c0: bipush 0
      // 2c1: invokevirtual ha9.fqc (Z)V
      // 2c4: aload 1
      // 2c5: instanceof z96
      // 2c8: iload 2
      // 2c9: ifeq 321
      // 2cc: ifeq 31f
      // 2cf: goto 2d6
      // 2d2: invokestatic ha9.a (Loov;)Loov;
      // 2d5: athrow
      // 2d6: aload 1
      // 2d7: getfield EntityLivingBase.t8d Z
      // 2da: iload 2
      // 2db: ifeq 321
      // 2de: goto 2e5
      // 2e1: invokestatic ha9.a (Loov;)Loov;
      // 2e4: athrow
      // 2e5: ifeq 31f
      // 2e8: goto 2ef
      // 2eb: invokestatic ha9.a (Loov;)Loov;
      // 2ee: athrow
      // 2ef: aload 1
      // 2f0: checkcast z96
      // 2f3: getfield z96.rhh Lmlk;
      // 2f6: new net/minecraft/network/play/server/S12PacketEntityVelocity
      // 2f9: dup
      // 2fa: aload 1
      // 2fb: invokespecial net/minecraft/network/play/server/S12PacketEntityVelocity.<init> (Li2h;)V
      // 2fe: invokevirtual mlk.vnf (Lmz2;)V
      // 301: aload 1
      // 302: bipush 0
      // 303: putfield EntityLivingBase.t8d Z
      // 306: aload 1
      // 307: dload 9
      // 309: putfield EntityLivingBase.icv D
      // 30c: aload 1
      // 30d: dload 11
      // 30f: putfield EntityLivingBase.mop D
      // 312: aload 1
      // 313: dload 13
      // 315: putfield EntityLivingBase.bw4 D
      // 318: goto 31f
      // 31b: invokestatic ha9.a (Loov;)Loov;
      // 31e: athrow
      // 31f: iload 6
      // 321: iload 2
      // 322: ifeq 33f
      // 325: ifeq 33b
      // 328: goto 32f
      // 32b: invokestatic ha9.a (Loov;)Loov;
      // 32e: athrow
      // 32f: aload 0
      // 330: aload 1
      // 331: invokevirtual ha9.glv (Li2h;)V
      // 334: goto 33b
      // 337: invokestatic ha9.a (Loov;)Loov;
      // 33a: athrow
      // 33b: fload 5
      // 33d: fconst_0
      // 33e: fcmpl
      // 33f: iload 2
      // 340: ifeq 35e
      // 343: ifle 359
      // 346: goto 34d
      // 349: invokestatic ha9.a (Loov;)Loov;
      // 34c: athrow
      // 34d: aload 0
      // 34e: aload 1
      // 34f: invokevirtual ha9.eej (Li2h;)V
      // 352: goto 359
      // 355: invokestatic ha9.a (Loov;)Loov;
      // 358: athrow
      // 359: fload 3
      // 35a: ldc 18.0
      // 35c: nop
      // 35d: fcmpl
      // 35e: iload 2
      // 35f: ifeq 38e
      // 362: iflt 37a
      // 365: goto 36c
      // 368: invokestatic ha9.a (Loov;)Loov;
      // 36b: athrow
      // 36c: aload 0
      // 36d: getstatic y8d.rii Ll7l;
      // 370: invokevirtual ha9.aex (L_ss;)V
      // 373: goto 37a
      // 376: invokestatic ha9.a (Loov;)Loov;
      // 379: athrow
      // 37a: aload 0
      // 37b: aload 1
      // 37c: invokevirtual ha9.upe (Li2h;)V
      // 37f: iload 2
      // 380: ifeq 3a5
      // 383: aload 1
      // 384: instanceof Entity
      // 387: goto 38e
      // 38a: invokestatic ha9.a (Loov;)Loov;
      // 38d: athrow
      // 38e: ifeq 3a0
      // 391: aload 1
      // 392: checkcast Entity
      // 395: aload 0
      // 396: invokestatic hc0.eay (Lg_3;Li2h;)V
      // 399: goto 3a0
      // 39c: invokestatic ha9.a (Loov;)Loov;
      // 39f: athrow
      // 3a0: aload 0
      // 3a1: aload 1
      // 3a2: invokestatic hc0.rzk (Lg_3;Li2h;)V
      // 3a5: aload 0
      // 3a6: invokevirtual ha9.b5z ()Lerg;
      // 3a9: astore 16
      // 3ab: aload 1
      // 3ac: astore 17
      // 3ae: aload 1
      // 3af: iload 2
      // 3b0: ifeq 3c8
      // 3b3: instanceof pq1
      // 3b6: ifeq 3f1
      // 3b9: goto 3c0
      // 3bc: invokestatic ha9.a (Loov;)Loov;
      // 3bf: athrow
      // 3c0: aload 1
      // 3c1: goto 3c8
      // 3c4: invokestatic ha9.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: checkcast pq1
      // 3cb: getfield pq1.zzu Lqxu;
      // 3ce: astore 18
      // 3d0: aload 18
      // 3d2: iload 2
      // 3d3: ifeq 3ec
      // 3d6: instanceof Entity
      // 3d9: ifeq 3f1
      // 3dc: goto 3e3
      // 3df: invokestatic ha9.a (Loov;)Loov;
      // 3e2: athrow
      // 3e3: aload 18
      // 3e5: goto 3ec
      // 3e8: invokestatic ha9.a (Loov;)Loov;
      // 3eb: athrow
      // 3ec: checkcast Entity
      // 3ef: astore 17
      // 3f1: aload 16
      // 3f3: ifnull 440
      // 3f6: aload 17
      // 3f8: instanceof Entity
      // 3fb: iload 2
      // 3fc: ifeq 444
      // 3ff: goto 406
      // 402: invokestatic ha9.a (Loov;)Loov;
      // 405: athrow
      // 406: ifeq 440
      // 409: goto 410
      // 40c: invokestatic ha9.a (Loov;)Loov;
      // 40f: athrow
      // 410: aload 16
      // 412: aload 17
      // 414: checkcast Entity
      // 417: aload 0
      // 418: invokevirtual erg.kwy (Lg_3;Lha9;)V
      // 41b: aload 16
      // 41d: getfield erg.qd2 I
      // 420: iload 2
      // 421: ifeq 444
      // 424: goto 42b
      // 427: invokestatic ha9.a (Loov;)Loov;
      // 42a: athrow
      // 42b: ifgt 440
      // 42e: goto 435
      // 431: invokestatic ha9.a (Loov;)Loov;
      // 434: athrow
      // 435: aload 0
      // 436: invokevirtual ha9.gwo ()V
      // 439: goto 440
      // 43c: invokestatic ha9.a (Loov;)Loov;
      // 43f: athrow
      // 440: aload 1
      // 441: instanceof Entity
      // 444: iload 2
      // 445: ifeq 475
      // 448: ifeq 487
      // 44b: goto 452
      // 44e: invokestatic ha9.a (Loov;)Loov;
      // 451: athrow
      // 452: aload 0
      // 453: getstatic l9p.omv L_ss;
      // 456: fload 3
      // 457: ldc 10.0
      // 459: nop
      // 45a: fmul
      // 45b: invokestatic java/lang/Math.round (F)I
      // 45e: invokevirtual ha9.qcw (L_ss;I)V
      // 461: iload 2
      // 462: ifeq 48e
      // 465: goto 46c
      // 468: invokestatic ha9.a (Loov;)Loov;
      // 46b: athrow
      // 46c: iload 8
      // 46e: goto 475
      // 471: invokestatic ha9.a (Loov;)Loov;
      // 474: athrow
      // 475: ifle 487
      // 478: aload 1
      // 479: iload 8
      // 47b: bipush 4
      // 47c: imul
      // 47d: invokevirtual EntityLivingBase.k03 (I)V
      // 480: goto 487
      // 483: invokestatic ha9.a (Loov;)Loov;
      // 486: athrow
      // 487: aload 0
      // 488: ldc 0.3
      // 48a: nop
      // 48b: invokevirtual ha9.i8a (F)V
      // 48e: iload 2
      // 48f: ifne 4a9
      // 492: iload 7
      // 494: goto 49b
      // 497: invokestatic ha9.a (Loov;)Loov;
      // 49a: athrow
      // 49b: ifeq 4a9
      // 49e: aload 1
      // 49f: invokevirtual EntityLivingBase.utb ()V
      // 4a2: goto 4a9
      // 4a5: invokestatic ha9.a (Loov;)Loov;
      // 4a8: athrow
      // 4a9: return
   }

   public void glv(EntityLivingBase var1) {
   }

   public void eej(EntityLivingBase var1) {
   }

   public void iau() {
   }

   @Override
   public void _kl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial Entity._kl ()V
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 0
      // 08: getfield ha9.fv9 L_jc;
      // 0b: aload 0
      // 0c: invokevirtual _jc.qi6 (Lha9;)V
      // 0f: istore 1
      // 10: aload 0
      // 11: getfield ha9.daw L_jc;
      // 14: iload 1
      // 15: ifne 2d
      // 18: ifnull 31
      // 1b: goto 22
      // 1e: invokestatic ha9.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield ha9.daw L_jc;
      // 26: goto 2d
      // 29: invokestatic ha9.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: invokevirtual _jc.qi6 (Lha9;)V
      // 31: return
   }

   @Override
   public boolean sqy() {
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
      // 05: getfield ha9.asp Z
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifne 33
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial Entity.sqy ()Z
      // 1a: goto 21
      // 1d: invokestatic ha9.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic ha9.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean jvr() {
      return false;
   }

   public GameProfile x6l() {
      return this.vv6;
   }

   public ha9$o7a zv1(mew param1) {
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
      // 005: getfield ha9.oay Lt9d;
      // 008: getfield OpaquePredicate.v0f Z
      // 00b: iload 2
      // 00c: ifne 16c
      // 00f: ifne 168
      // 012: goto 019
      // 015: invokestatic ha9.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: invokevirtual ha9.ofg ()Z
      // 01d: iload 2
      // 01e: ifne 03d
      // 021: goto 028
      // 024: invokestatic ha9.a (Loov;)Loov;
      // 027: athrow
      // 028: ifne 04b
      // 02b: goto 032
      // 02e: invokestatic ha9.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: invokevirtual ha9.gzr ()Z
      // 036: goto 03d
      // 039: invokestatic ha9.a (Loov;)Loov;
      // 03c: athrow
      // 03d: iload 2
      // 03e: ifne 05d
      // 041: ifne 053
      // 044: goto 04b
      // 047: invokestatic ha9.a (Loov;)Loov;
      // 04a: athrow
      // 04b: getstatic ha9$o7a.jlk Lha9$o7a;
      // 04e: areturn
      // 04f: invokestatic ha9.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: getfield ha9.oay Lt9d;
      // 057: getfield OpaquePredicate.vzz Lupn;
      // 05a: invokevirtual upn.cws ()Z
      // 05d: iload 2
      // 05e: ifne 07a
      // 061: ifne 073
      // 064: goto 06b
      // 067: invokestatic ha9.a (Loov;)Loov;
      // 06a: athrow
      // 06b: getstatic ha9$o7a.ne8 Lha9$o7a;
      // 06e: areturn
      // 06f: invokestatic ha9.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield ha9.oay Lt9d;
      // 077: invokevirtual OpaquePredicate.m40 ()Z
      // 07a: iload 2
      // 07b: ifne 0a1
      // 07e: ifeq 090
      // 081: goto 088
      // 084: invokestatic ha9.a (Loov;)Loov;
      // 087: athrow
      // 088: getstatic ha9$o7a.ar_ Lha9$o7a;
      // 08b: areturn
      // 08c: invokestatic ha9.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield ha9.o2v D
      // 094: aload 1
      // 095: invokevirtual mew.getX ()I
      // 098: i2d
      // 099: dsub
      // 09a: invokestatic java/lang/Math.abs (D)D
      // 09d: ldc2_w 3.0
      // 0a0: dcmpl
      // 0a1: iload 2
      // 0a2: ifne 0c7
      // 0a5: ifgt 0fb
      // 0a8: goto 0af
      // 0ab: invokestatic ha9.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield ha9.kfp D
      // 0b3: aload 1
      // 0b4: invokevirtual mew.getY ()I
      // 0b7: i2d
      // 0b8: dsub
      // 0b9: invokestatic java/lang/Math.abs (D)D
      // 0bc: ldc2_w 2.0
      // 0bf: dcmpl
      // 0c0: goto 0c7
      // 0c3: invokestatic ha9.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: iload 2
      // 0c8: ifne 0f8
      // 0cb: ifgt 0fb
      // 0ce: goto 0d5
      // 0d1: invokestatic ha9.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: getfield ha9.vbd D
      // 0d9: aload 1
      // 0da: invokevirtual mew.getZ ()I
      // 0dd: i2d
      // 0de: dsub
      // 0df: invokestatic java/lang/Math.abs (D)D
      // 0e2: iload 2
      // 0e3: ifne 106
      // 0e6: goto 0ed
      // 0e9: invokestatic ha9.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: ldc2_w 3.0
      // 0f0: dcmpl
      // 0f1: goto 0f8
      // 0f4: invokestatic ha9.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: ifle 103
      // 0fb: getstatic ha9$o7a.or9 Lha9$o7a;
      // 0fe: areturn
      // 0ff: invokestatic ha9.a (Loov;)Loov;
      // 102: athrow
      // 103: ldc2_w 8.0
      // 106: dstore 3
      // 107: ldc2_w 5.0
      // 10a: dstore 5
      // 10c: aload 0
      // 10d: getfield ha9.oay Lt9d;
      // 110: ldc s0i
      // 112: nop
      // 113: new nh4
      // 116: dup
      // 117: aload 1
      // 118: invokevirtual mew.getX ()I
      // 11b: i2d
      // 11c: dload 3
      // 11d: dsub
      // 11e: aload 1
      // 11f: invokevirtual mew.getY ()I
      // 122: i2d
      // 123: dload 5
      // 125: dsub
      // 126: aload 1
      // 127: invokevirtual mew.getZ ()I
      // 12a: i2d
      // 12b: dload 3
      // 12c: dsub
      // 12d: aload 1
      // 12e: invokevirtual mew.getX ()I
      // 131: i2d
      // 132: dload 3
      // 133: dadd
      // 134: aload 1
      // 135: invokevirtual mew.getY ()I
      // 138: i2d
      // 139: dload 5
      // 13b: dadd
      // 13c: aload 1
      // 13d: invokevirtual mew.getZ ()I
      // 140: i2d
      // 141: dload 3
      // 142: dadd
      // 143: invokespecial nh4.<init> (DDDDDD)V
      // 146: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 149: astore 7
      // 14b: aload 7
      // 14d: invokeinterface java/util/List.isEmpty ()Z 1
      // 152: iload 2
      // 153: ifne 16c
      // 156: ifne 168
      // 159: goto 160
      // 15c: invokestatic ha9.a (Loov;)Loov;
      // 15f: athrow
      // 160: getstatic ha9$o7a.cl6 Lha9$o7a;
      // 163: areturn
      // 164: invokestatic ha9.a (Loov;)Loov;
      // 167: athrow
      // 168: aload 0
      // 169: invokevirtual ha9.i0e ()Z
      // 16c: iload 2
      // 16d: ifne 1a6
      // 170: ifeq 189
      // 173: goto 17a
      // 176: invokestatic ha9.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: aconst_null
      // 17c: checkcast EntityLivingBase
      // 17f: invokevirtual ha9.nw9 (Li2h;)V
      // 182: goto 189
      // 185: invokestatic ha9.a (Loov;)Loov;
      // 188: athrow
      // 189: aload 0
      // 18a: ldc 0.2
      // 18c: nop
      // 18d: ldc 0.2
      // 18f: nop
      // 190: invokevirtual ha9.yxc (FF)V
      // 193: aload 0
      // 194: iload 2
      // 195: ifne 245
      // 198: getfield ha9.oay Lt9d;
      // 19b: aload 1
      // 19c: invokevirtual OpaquePredicate.xjm (Lmew;)Z
      // 19f: goto 1a6
      // 1a2: invokestatic ha9.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: ifeq 23d
      // 1a9: aload 0
      // 1aa: getfield ha9.oay Lt9d;
      // 1ad: aload 1
      // 1ae: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1b1: getstatic sq9.em9 Lqx_;
      // 1b4: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1b9: checkcast vt2
      // 1bc: astore 3
      // 1bd: ldc 0.5
      // 1bf: nop
      // 1c0: fstore 4
      // 1c2: ldc 0.5
      // 1c4: nop
      // 1c5: fstore 5
      // 1c7: iload 2
      // 1c8: ifne 239
      // 1cb: getstatic ha9$1.g65 [I
      // 1ce: aload 3
      // 1cf: invokevirtual vt2.ordinal ()I
      // 1d2: iaload
      // 1d3: tableswitch 65 1 4 33 42 51 60
      // 1f0: invokestatic ha9.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: ldc 0.9
      // 1f6: nop
      // 1f7: fstore 5
      // 1f9: iload 2
      // 1fa: ifeq 214
      // 1fd: ldc 0.1
      // 1ff: nop
      // 200: fstore 5
      // 202: iload 2
      // 203: ifeq 214
      // 206: ldc 0.1
      // 208: nop
      // 209: fstore 4
      // 20b: iload 2
      // 20c: ifeq 214
      // 20f: ldc 0.9
      // 211: nop
      // 212: fstore 4
      // 214: aload 0
      // 215: aload 3
      // 216: invokespecial ha9.qhi (Lvt2;)V
      // 219: aload 0
      // 21a: aload 1
      // 21b: invokevirtual mew.getX ()I
      // 21e: i2f
      // 21f: fload 4
      // 221: fadd
      // 222: f2d
      // 223: aload 1
      // 224: invokevirtual mew.getY ()I
      // 227: i2f
      // 228: ldc 0.6875
      // 22a: nop
      // 22b: fadd
      // 22c: f2d
      // 22d: aload 1
      // 22e: invokevirtual mew.getZ ()I
      // 231: i2f
      // 232: fload 5
      // 234: fadd
      // 235: f2d
      // 236: invokevirtual ha9.m6_ (DDD)V
      // 239: iload 2
      // 23a: ifeq 266
      // 23d: aload 0
      // 23e: goto 245
      // 241: invokestatic ha9.a (Loov;)Loov;
      // 244: athrow
      // 245: aload 1
      // 246: invokevirtual mew.getX ()I
      // 249: i2f
      // 24a: ldc 0.5
      // 24c: nop
      // 24d: fadd
      // 24e: f2d
      // 24f: aload 1
      // 250: invokevirtual mew.getY ()I
      // 253: i2f
      // 254: ldc 0.6875
      // 256: nop
      // 257: fadd
      // 258: f2d
      // 259: aload 1
      // 25a: invokevirtual mew.getZ ()I
      // 25d: i2f
      // 25e: ldc 0.5
      // 260: nop
      // 261: fadd
      // 262: f2d
      // 263: invokevirtual ha9.m6_ (DDD)V
      // 266: aload 0
      // 267: bipush 1
      // 268: putfield ha9.asp Z
      // 26b: aload 0
      // 26c: bipush 0
      // 26d: putfield ha9.bl8 I
      // 270: aload 0
      // 271: aload 1
      // 272: putfield ha9.ndt Lmew;
      // 275: aload 0
      // 276: aload 0
      // 277: aload 0
      // 278: dconst_0
      // 279: dup2_x1
      // 27a: putfield ha9.mop D
      // 27d: dup2_x1
      // 27e: putfield ha9.bw4 D
      // 281: putfield ha9.icv D
      // 284: aload 0
      // 285: getfield ha9.oay Lt9d;
      // 288: iload 2
      // 289: ifne 2a4
      // 28c: getfield OpaquePredicate.v0f Z
      // 28f: ifne 2a7
      // 292: goto 299
      // 295: invokestatic ha9.a (Loov;)Loov;
      // 298: athrow
      // 299: aload 0
      // 29a: getfield ha9.oay Lt9d;
      // 29d: goto 2a4
      // 2a0: invokestatic ha9.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: invokevirtual OpaquePredicate.vz4 ()V
      // 2a7: getstatic ha9$o7a.xdw Lha9$o7a;
      // 2aa: areturn
   }

   private void qhi(vt2 param1) {
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
      // 05: fconst_0
      // 06: putfield ha9.ckf F
      // 09: aload 0
      // 0a: fconst_0
      // 0b: putfield ha9.pek F
      // 0e: iload 2
      // 0f: ifne 4a
      // 12: getstatic ha9$1.g65 [I
      // 15: aload 1
      // 16: invokevirtual vt2.ordinal ()I
      // 19: iaload
      // 1a: tableswitch 102 1 4 34 52 70 88
      // 38: invokestatic ha9.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: ldc -1.8
      // 3f: nop
      // 40: putfield ha9.pek F
      // 43: goto 4a
      // 46: invokestatic ha9.a (Loov;)Loov;
      // 49: athrow
      // 4a: iload 2
      // 4b: ifeq 80
      // 4e: aload 0
      // 4f: ldc 1.8
      // 51: nop
      // 52: putfield ha9.pek F
      // 55: iload 2
      // 56: ifeq 80
      // 59: goto 60
      // 5c: invokestatic ha9.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: ldc 1.8
      // 63: nop
      // 64: putfield ha9.ckf F
      // 67: iload 2
      // 68: ifeq 80
      // 6b: goto 72
      // 6e: invokestatic ha9.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: ldc -1.8
      // 75: nop
      // 76: putfield ha9.ckf F
      // 79: goto 80
      // 7c: invokestatic ha9.a (Loov;)Loov;
      // 7f: athrow
      // 80: return
   }

   public void thu(boolean param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc 0.6
      // 003: nop
      // 004: ldc 1.8
      // 006: nop
      // 007: invokevirtual ha9.yxc (FF)V
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: aload 0
      // 00e: getfield ha9.oay Lt9d;
      // 011: aload 0
      // 012: getfield ha9.ndt Lmew;
      // 015: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 018: astore 5
      // 01a: istore 4
      // 01c: aload 0
      // 01d: iload 4
      // 01f: ifeq 0b8
      // 022: getfield ha9.ndt Lmew;
      // 025: ifnull 0b2
      // 028: goto 02f
      // 02b: invokestatic ha9.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 5
      // 031: invokeinterface zfz.r_y ()Le0x; 1
      // 036: getstatic ox_.a6l Le0x;
      // 039: if_acmpne 0b2
      // 03c: goto 043
      // 03f: invokestatic ha9.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: getfield ha9.oay Lt9d;
      // 047: aload 0
      // 048: getfield ha9.ndt Lmew;
      // 04b: aload 5
      // 04d: getstatic _8w.hyx Lh76;
      // 050: bipush 0
      // 051: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 054: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 059: bipush 4
      // 05a: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 05d: pop
      // 05e: aload 0
      // 05f: getfield ha9.oay Lt9d;
      // 062: aload 0
      // 063: getfield ha9.ndt Lmew;
      // 066: bipush 0
      // 067: invokestatic _8w.fay (Lt9d;Lmew;I)Lmew;
      // 06a: astore 6
      // 06c: aload 6
      // 06e: iload 4
      // 070: ifeq 08b
      // 073: ifnonnull 08d
      // 076: goto 07d
      // 079: invokestatic ha9.a (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield ha9.ndt Lmew;
      // 081: invokevirtual mew.nuv ()Lmew;
      // 084: goto 08b
      // 087: invokestatic ha9.a (Loov;)Loov;
      // 08a: athrow
      // 08b: astore 6
      // 08d: aload 0
      // 08e: aload 6
      // 090: invokevirtual mew.getX ()I
      // 093: i2f
      // 094: ldc 0.5
      // 096: nop
      // 097: fadd
      // 098: f2d
      // 099: aload 6
      // 09b: invokevirtual mew.getY ()I
      // 09e: i2f
      // 09f: ldc 0.1
      // 0a1: nop
      // 0a2: fadd
      // 0a3: f2d
      // 0a4: aload 6
      // 0a6: invokevirtual mew.getZ ()I
      // 0a9: i2f
      // 0aa: ldc 0.5
      // 0ac: nop
      // 0ad: fadd
      // 0ae: f2d
      // 0af: invokevirtual ha9.m6_ (DDD)V
      // 0b2: aload 0
      // 0b3: bipush 0
      // 0b4: putfield ha9.asp Z
      // 0b7: aload 0
      // 0b8: iload 4
      // 0ba: ifeq 0e7
      // 0bd: getfield ha9.oay Lt9d;
      // 0c0: getfield OpaquePredicate.v0f Z
      // 0c3: ifne 0e6
      // 0c6: goto 0cd
      // 0c9: invokestatic ha9.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: iload 2
      // 0ce: ifeq 0e6
      // 0d1: goto 0d8
      // 0d4: invokestatic ha9.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: getfield ha9.oay Lt9d;
      // 0dc: invokevirtual OpaquePredicate.vz4 ()V
      // 0df: goto 0e6
      // 0e2: invokestatic ha9.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: iload 1
      // 0e8: iload 4
      // 0ea: ifeq 0f8
      // 0ed: ifeq 0fb
      // 0f0: goto 0f7
      // 0f3: invokestatic ha9.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: bipush 0
      // 0f8: goto 0fd
      // 0fb: bipush 100
      // 0fd: putfield ha9.bl8 I
      // 100: iload 3
      // 101: ifeq 114
      // 104: aload 0
      // 105: aload 0
      // 106: getfield ha9.ndt Lmew;
      // 109: bipush 0
      // 10a: invokevirtual ha9.i9g (Lmew;Z)V
      // 10d: goto 114
      // 110: invokestatic ha9.a (Loov;)Loov;
      // 113: athrow
      // 114: return
   }

   private boolean svv() {
      try {
         if (this.oay.getBlockState(this.ndt).r_y() == ox_.a6l) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public static mew mpo(OpaquePredicate param0, mew param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 09: invokeinterface zfz.r_y ()Le0x; 1
      // 0e: astore 4
      // 10: aload 4
      // 12: getstatic ox_.a6l Le0x;
      // 15: if_acmpeq 6c
      // 18: iload 2
      // 19: iload 3
      // 1a: ifeq 39
      // 1d: goto 24
      // 20: invokestatic ha9.a (Loov;)Loov;
      // 23: athrow
      // 24: ifne 34
      // 27: goto 2e
      // 2a: invokestatic ha9.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aconst_null
      // 2f: areturn
      // 30: invokestatic ha9.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 4
      // 36: invokevirtual e0x.jdk ()Z
      // 39: istore 5
      // 3b: aload 0
      // 3c: aload 1
      // 3d: invokevirtual mew.nuv ()Lmew;
      // 40: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 43: invokeinterface zfz.r_y ()Le0x; 1
      // 48: invokevirtual e0x.jdk ()Z
      // 4b: istore 6
      // 4d: iload 5
      // 4f: iload 3
      // 50: ifeq 5f
      // 53: ifeq 6a
      // 56: goto 5d
      // 59: invokestatic ha9.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 6
      // 5f: ifeq 6a
      // 62: aload 1
      // 63: goto 6b
      // 66: invokestatic ha9.a (Loov;)Loov;
      // 69: athrow
      // 6a: aconst_null
      // 6b: areturn
      // 6c: aload 0
      // 6d: aload 1
      // 6e: bipush 0
      // 6f: invokestatic _8w.fay (Lt9d;Lmew;I)Lmew;
      // 72: areturn
   }

   public float h1i() {
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
      // 05: getfield ha9.ndt Lmew;
      // 08: iload 1
      // 09: ifeq 30
      // 0c: ifnull 6e
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ha9.oay Lt9d;
      // 1a: aload 0
      // 1b: getfield ha9.ndt Lmew;
      // 1e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 21: getstatic sq9.em9 Lqx_;
      // 24: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 29: goto 30
      // 2c: invokestatic ha9.a (Loov;)Loov;
      // 2f: athrow
      // 30: checkcast vt2
      // 33: astore 2
      // 34: getstatic ha9$1.g65 [I
      // 37: aload 2
      // 38: invokevirtual vt2.ordinal ()I
      // 3b: iaload
      // 3c: tableswitch 50 1 4 32 40 44 46
      // 5c: ldc 90.0
      // 5e: nop
      // 5f: freturn
      // 60: invokestatic ha9.a (Loov;)Loov;
      // 63: athrow
      // 64: ldc 270.0
      // 66: nop
      // 67: freturn
      // 68: fconst_0
      // 69: freturn
      // 6a: ldc 180.0
      // 6c: nop
      // 6d: freturn
      // 6e: fconst_0
      // 6f: freturn
   }

   @Override
   public boolean ofg() {
      return this.asp;
   }

   public boolean bl4() {
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
      // 05: getfield ha9.asp Z
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifeq 3c
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ha9.bl8 I
      // 1a: goto 21
      // 1d: invokestatic ha9.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 39
      // 25: bipush 100
      // 27: if_icmplt 3c
      // 2a: goto 31
      // 2d: invokestatic ha9.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 39
      // 35: invokestatic ha9.a (Loov;)Loov;
      // 38: athrow
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   public int do8() {
      return this.bl8;
   }

   public void tog(ekw var1) {
   }

   public mew _py() {
      return this.w2b;
   }

   public boolean k2h() {
      return this.ht4;
   }

   public void i9g(mew param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: ifnull 1d
      // 08: aload 0
      // 09: aload 1
      // 0a: putfield ha9.w2b Lmew;
      // 0d: aload 0
      // 0e: iload 2
      // 0f: putfield ha9.ht4 Z
      // 12: iload 3
      // 13: ifne 2e
      // 16: goto 1d
      // 19: invokestatic ha9.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aconst_null
      // 1f: putfield ha9.w2b Lmew;
      // 22: aload 0
      // 23: bipush 0
      // 24: putfield ha9.ht4 Z
      // 27: goto 2e
      // 2a: invokestatic ha9.a (Loov;)Loov;
      // 2d: athrow
      // 2e: return
   }

   public void aex(_ss var1) {
      this.qcw(var1, 1);
   }

   public void qcw(_ss var1, int var2) {
   }

   public void _rr(_ss var1) {
   }

   @Override
   public void xv1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial Entity.xv1 ()V
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 0
      // 08: getstatic l9p.w22 L_ss;
      // 0b: invokevirtual ha9.aex (L_ss;)V
      // 0e: istore 1
      // 0f: aload 0
      // 10: iload 1
      // 11: ifeq 3b
      // 14: invokevirtual ha9.ew1 ()Z
      // 17: ifeq 33
      // 1a: goto 21
      // 1d: invokestatic ha9.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: ldc 0.8
      // 24: nop
      // 25: invokevirtual ha9.i8a (F)V
      // 28: iload 1
      // 29: ifne 41
      // 2c: goto 33
      // 2f: invokestatic ha9.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: goto 3b
      // 37: invokestatic ha9.a (Loov;)Loov;
      // 3a: athrow
      // 3b: ldc 0.2
      // 3d: nop
      // 3e: invokevirtual ha9.i8a (F)V
      // 41: return
   }

   @Override
   public void ge2(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield ha9.o2v D
      // 04: dstore 4
      // 06: invokestatic OpaquePredicate.b ()I
      // 09: aload 0
      // 0a: getfield ha9.kfp D
      // 0d: dstore 6
      // 0f: istore 3
      // 10: aload 0
      // 11: getfield ha9.vbd D
      // 14: dstore 8
      // 16: aload 0
      // 17: iload 3
      // 18: ifeq 96
      // 1b: getfield ha9.lls Lpj2;
      // 1e: getfield pj2.wzx Z
      // 21: ifeq 8e
      // 24: goto 2b
      // 27: invokestatic ha9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 3
      // 2d: ifeq 96
      // 30: goto 37
      // 33: invokestatic ha9.a (Loov;)Loov;
      // 36: athrow
      // 37: getfield ha9.hzp Li2h;
      // 3a: ifnonnull 8e
      // 3d: goto 44
      // 40: invokestatic ha9.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield ha9.mop D
      // 48: dstore 10
      // 4a: aload 0
      // 4b: getfield ha9._ge F
      // 4e: fstore 12
      // 50: aload 0
      // 51: aload 0
      // 52: getfield ha9.lls Lpj2;
      // 55: invokevirtual pj2.eay ()F
      // 58: aload 0
      // 59: invokevirtual ha9.ew1 ()Z
      // 5c: iload 3
      // 5d: ifeq 6b
      // 60: ifeq 6e
      // 63: goto 6a
      // 66: invokestatic ha9.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 2
      // 6b: goto 6f
      // 6e: bipush 1
      // 6f: i2f
      // 70: fmul
      // 71: putfield ha9._ge F
      // 74: aload 0
      // 75: fload 1
      // 76: fload 2
      // 77: invokespecial Entity.ge2 (FF)V
      // 7a: aload 0
      // 7b: dload 10
      // 7d: ldc2_w 0.6
      // 80: dmul
      // 81: putfield ha9.mop D
      // 84: aload 0
      // 85: fload 12
      // 87: putfield ha9._ge F
      // 8a: iload 3
      // 8b: ifne 9b
      // 8e: aload 0
      // 8f: goto 96
      // 92: invokestatic ha9.a (Loov;)Loov;
      // 95: athrow
      // 96: fload 1
      // 97: fload 2
      // 98: invokespecial Entity.ge2 (FF)V
      // 9b: aload 0
      // 9c: aload 0
      // 9d: getfield ha9.o2v D
      // a0: dload 4
      // a2: dsub
      // a3: aload 0
      // a4: getfield ha9.kfp D
      // a7: dload 6
      // a9: dsub
      // aa: aload 0
      // ab: getfield ha9.vbd D
      // ae: dload 8
      // b0: dsub
      // b1: invokevirtual ha9.w7f (DDD)V
      // b4: return
   }

   @Override
   public float ldh() {
      return (float)this.dgt(m6d.w7i).nz5();
   }

   public void w7f(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 7
      // 005: aload 0
      // 006: iload 7
      // 008: ifeq 020
      // 00b: getfield ha9.hzp Li2h;
      // 00e: ifnonnull 222
      // 011: goto 018
      // 014: invokestatic ha9.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: goto 020
      // 01c: invokestatic ha9.a (Loov;)Loov;
      // 01f: athrow
      // 020: getstatic p3y.six Lp3y;
      // 023: invokevirtual ha9.v0c (Lp3y;)Z
      // 026: iload 7
      // 028: ifeq 08e
      // 02b: ifeq 083
      // 02e: goto 035
      // 031: invokestatic ha9.a (Loov;)Loov;
      // 034: athrow
      // 035: dload 1
      // 036: dload 1
      // 037: dmul
      // 038: dload 3
      // 039: dload 3
      // 03a: dmul
      // 03b: dadd
      // 03c: dload 5
      // 03e: dload 5
      // 040: dmul
      // 041: dadd
      // 042: invokestatic fe6.dii (D)F
      // 045: ldc 100.0
      // 047: nop
      // 048: fmul
      // 049: invokestatic java/lang/Math.round (F)I
      // 04c: istore 8
      // 04e: iload 7
      // 050: ifeq 06f
      // 053: iload 8
      // 055: ifle 07e
      // 058: goto 05f
      // 05b: invokestatic ha9.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: getstatic l9p.wia L_ss;
      // 063: iload 8
      // 065: invokevirtual ha9.qcw (L_ss;I)V
      // 068: goto 06f
      // 06b: invokestatic ha9.a (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 0
      // 070: ldc 0.015
      // 072: nop
      // 073: iload 8
      // 075: i2f
      // 076: fmul
      // 077: ldc 0.01
      // 079: nop
      // 07a: fmul
      // 07b: invokevirtual ha9.i8a (F)V
      // 07e: iload 7
      // 080: ifne 222
      // 083: aload 0
      // 084: invokevirtual ha9.mwv ()Z
      // 087: goto 08e
      // 08a: invokestatic ha9.a (Loov;)Loov;
      // 08d: athrow
      // 08e: iload 7
      // 090: ifeq 0f2
      // 093: ifeq 0e7
      // 096: goto 09d
      // 099: invokestatic ha9.a (Loov;)Loov;
      // 09c: athrow
      // 09d: dload 1
      // 09e: dload 1
      // 09f: dmul
      // 0a0: dload 5
      // 0a2: dload 5
      // 0a4: dmul
      // 0a5: dadd
      // 0a6: invokestatic fe6.dii (D)F
      // 0a9: ldc 100.0
      // 0ab: nop
      // 0ac: fmul
      // 0ad: invokestatic java/lang/Math.round (F)I
      // 0b0: istore 8
      // 0b2: iload 7
      // 0b4: ifeq 0d3
      // 0b7: iload 8
      // 0b9: ifle 0e2
      // 0bc: goto 0c3
      // 0bf: invokestatic ha9.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: getstatic l9p.qye L_ss;
      // 0c7: iload 8
      // 0c9: invokevirtual ha9.qcw (L_ss;I)V
      // 0cc: goto 0d3
      // 0cf: invokestatic ha9.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: ldc 0.015
      // 0d6: nop
      // 0d7: iload 8
      // 0d9: i2f
      // 0da: fmul
      // 0db: ldc 0.01
      // 0dd: nop
      // 0de: fmul
      // 0df: invokevirtual ha9.i8a (F)V
      // 0e2: iload 7
      // 0e4: ifne 222
      // 0e7: aload 0
      // 0e8: invokevirtual ha9.z2m ()Z
      // 0eb: goto 0f2
      // 0ee: invokestatic ha9.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: iload 7
      // 0f4: ifeq 135
      // 0f7: ifeq 12a
      // 0fa: goto 101
      // 0fd: invokestatic ha9.a (Loov;)Loov;
      // 100: athrow
      // 101: dload 3
      // 102: dconst_0
      // 103: dcmpl
      // 104: ifle 222
      // 107: goto 10e
      // 10a: invokestatic ha9.a (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 0
      // 10f: getstatic l9p.hq1 L_ss;
      // 112: dload 3
      // 113: ldc2_w 100.0
      // 116: dmul
      // 117: invokestatic java/lang/Math.round (D)J
      // 11a: l2i
      // 11b: invokevirtual ha9.qcw (L_ss;I)V
      // 11e: iload 7
      // 120: ifne 222
      // 123: goto 12a
      // 126: invokestatic ha9.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 0
      // 12b: getfield ha9.lfk Z
      // 12e: goto 135
      // 131: invokestatic ha9.a (Loov;)Loov;
      // 134: athrow
      // 135: iload 7
      // 137: ifeq 209
      // 13a: ifeq 1ef
      // 13d: goto 144
      // 140: invokestatic ha9.a (Loov;)Loov;
      // 143: athrow
      // 144: dload 1
      // 145: dload 1
      // 146: dmul
      // 147: dload 5
      // 149: dload 5
      // 14b: dmul
      // 14c: dadd
      // 14d: invokestatic fe6.dii (D)F
      // 150: ldc 100.0
      // 152: nop
      // 153: fmul
      // 154: invokestatic java/lang/Math.round (F)I
      // 157: istore 8
      // 159: iload 8
      // 15b: iload 7
      // 15d: ifeq 17e
      // 160: ifle 1ea
      // 163: goto 16a
      // 166: invokestatic ha9.a (Loov;)Loov;
      // 169: athrow
      // 16a: aload 0
      // 16b: getstatic l9p.en8 L_ss;
      // 16e: iload 8
      // 170: invokevirtual ha9.qcw (L_ss;I)V
      // 173: aload 0
      // 174: invokevirtual ha9.ew1 ()Z
      // 177: goto 17e
      // 17a: invokestatic ha9.a (Loov;)Loov;
      // 17d: athrow
      // 17e: iload 7
      // 180: ifeq 1c8
      // 183: ifeq 1b1
      // 186: goto 18d
      // 189: invokestatic ha9.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getstatic l9p._76 L_ss;
      // 191: iload 8
      // 193: invokevirtual ha9.qcw (L_ss;I)V
      // 196: aload 0
      // 197: ldc 0.099999994
      // 199: nop
      // 19a: iload 8
      // 19c: i2f
      // 19d: fmul
      // 19e: ldc 0.01
      // 1a0: nop
      // 1a1: fmul
      // 1a2: invokevirtual ha9.i8a (F)V
      // 1a5: iload 7
      // 1a7: ifne 1ea
      // 1aa: goto 1b1
      // 1ad: invokestatic ha9.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: iload 7
      // 1b4: ifeq 1dc
      // 1b7: goto 1be
      // 1ba: invokestatic ha9.a (Loov;)Loov;
      // 1bd: athrow
      // 1be: invokevirtual ha9.hzv ()Z
      // 1c1: goto 1c8
      // 1c4: invokestatic ha9.a (Loov;)Loov;
      // 1c7: athrow
      // 1c8: ifeq 1db
      // 1cb: aload 0
      // 1cc: getstatic l9p.ex5 L_ss;
      // 1cf: iload 8
      // 1d1: invokevirtual ha9.qcw (L_ss;I)V
      // 1d4: goto 1db
      // 1d7: invokestatic ha9.a (Loov;)Loov;
      // 1da: athrow
      // 1db: aload 0
      // 1dc: ldc 0.01
      // 1de: nop
      // 1df: iload 8
      // 1e1: i2f
      // 1e2: fmul
      // 1e3: ldc 0.01
      // 1e5: nop
      // 1e6: fmul
      // 1e7: invokevirtual ha9.i8a (F)V
      // 1ea: iload 7
      // 1ec: ifne 222
      // 1ef: dload 1
      // 1f0: dload 1
      // 1f1: dmul
      // 1f2: dload 5
      // 1f4: dload 5
      // 1f6: dmul
      // 1f7: dadd
      // 1f8: invokestatic fe6.dii (D)F
      // 1fb: ldc 100.0
      // 1fd: nop
      // 1fe: fmul
      // 1ff: invokestatic java/lang/Math.round (F)I
      // 202: goto 209
      // 205: invokestatic ha9.a (Loov;)Loov;
      // 208: athrow
      // 209: istore 8
      // 20b: iload 8
      // 20d: bipush 25
      // 20f: if_icmple 222
      // 212: aload 0
      // 213: getstatic l9p._9b L_ss;
      // 216: iload 8
      // 218: invokevirtual ha9.qcw (L_ss;I)V
      // 21b: goto 222
      // 21e: invokestatic ha9.a (Loov;)Loov;
      // 221: athrow
      // 222: return
   }

   private void jlk(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 7
      // 005: aload 0
      // 006: getfield ha9.hzp Li2h;
      // 009: ifnull 164
      // 00c: dload 1
      // 00d: dload 1
      // 00e: dmul
      // 00f: dload 3
      // 010: dload 3
      // 011: dmul
      // 012: dadd
      // 013: dload 5
      // 015: dload 5
      // 017: dmul
      // 018: dadd
      // 019: invokestatic fe6.dii (D)F
      // 01c: ldc 100.0
      // 01e: nop
      // 01f: fmul
      // 020: invokestatic java/lang/Math.round (F)I
      // 023: istore 8
      // 025: iload 8
      // 027: iload 7
      // 029: ifne 044
      // 02c: ifle 164
      // 02f: goto 036
      // 032: invokestatic ha9.a (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: getfield ha9.hzp Li2h;
      // 03a: instanceof _f3
      // 03d: goto 044
      // 040: invokestatic ha9.a (Loov;)Loov;
      // 043: athrow
      // 044: iload 7
      // 046: ifne 0e8
      // 049: ifeq 0da
      // 04c: goto 053
      // 04f: invokestatic ha9.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: getstatic l9p.pg7 L_ss;
      // 057: iload 8
      // 059: invokevirtual ha9.qcw (L_ss;I)V
      // 05c: aload 0
      // 05d: getfield ha9.ma0 Lmew;
      // 060: iload 7
      // 062: ifne 0a5
      // 065: goto 06c
      // 068: invokestatic ha9.a (Loov;)Loov;
      // 06b: athrow
      // 06c: ifnonnull 08e
      // 06f: goto 076
      // 072: invokestatic ha9.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 0
      // 077: new mew
      // 07a: dup
      // 07b: aload 0
      // 07c: invokespecial mew.<init> (Li2h;)V
      // 07f: putfield ha9.ma0 Lmew;
      // 082: iload 7
      // 084: ifeq 164
      // 087: goto 08e
      // 08a: invokestatic ha9.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: iload 7
      // 091: ifne 0cf
      // 094: goto 09b
      // 097: invokestatic ha9.a (Loov;)Loov;
      // 09a: athrow
      // 09b: getfield ha9.ma0 Lmew;
      // 09e: goto 0a5
      // 0a1: invokestatic ha9.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: getfield ha9.o2v D
      // 0a9: invokestatic fe6.jqf (D)I
      // 0ac: i2d
      // 0ad: aload 0
      // 0ae: getfield ha9.kfp D
      // 0b1: invokestatic fe6.jqf (D)I
      // 0b4: i2d
      // 0b5: aload 0
      // 0b6: getfield ha9.vbd D
      // 0b9: invokestatic fe6.jqf (D)I
      // 0bc: i2d
      // 0bd: invokevirtual mew.p4e (DDD)D
      // 0c0: ldc2_w 1000000.0
      // 0c3: dcmpl
      // 0c4: iflt 164
      // 0c7: aload 0
      // 0c8: goto 0cf
      // 0cb: invokestatic ha9.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: getstatic y8d.kb1 Ll7l;
      // 0d2: invokevirtual ha9.aex (L_ss;)V
      // 0d5: iload 7
      // 0d7: ifeq 164
      // 0da: aload 0
      // 0db: getfield ha9.hzp Li2h;
      // 0de: instanceof w54
      // 0e1: goto 0e8
      // 0e4: invokestatic ha9.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: iload 7
      // 0ea: ifne 11a
      // 0ed: ifeq 10c
      // 0f0: goto 0f7
      // 0f3: invokestatic ha9.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getstatic l9p.register L_ss;
      // 0fb: iload 8
      // 0fd: invokevirtual ha9.qcw (L_ss;I)V
      // 100: iload 7
      // 102: ifeq 164
      // 105: goto 10c
      // 108: invokestatic ha9.a (Loov;)Loov;
      // 10b: athrow
      // 10c: aload 0
      // 10d: getfield ha9.hzp Li2h;
      // 110: instanceof _gj
      // 113: goto 11a
      // 116: invokestatic ha9.a (Loov;)Loov;
      // 119: athrow
      // 11a: iload 7
      // 11c: ifne 158
      // 11f: ifeq 13e
      // 122: goto 129
      // 125: invokestatic ha9.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: getstatic l9p.md5 L_ss;
      // 12d: iload 8
      // 12f: invokevirtual ha9.qcw (L_ss;I)V
      // 132: iload 7
      // 134: ifeq 164
      // 137: goto 13e
      // 13a: invokestatic ha9.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: iload 7
      // 141: ifne 15c
      // 144: goto 14b
      // 147: invokestatic ha9.a (Loov;)Loov;
      // 14a: athrow
      // 14b: getfield ha9.hzp Li2h;
      // 14e: instanceof zfo
      // 151: goto 158
      // 154: invokestatic ha9.a (Loov;)Loov;
      // 157: athrow
      // 158: ifeq 164
      // 15b: aload 0
      // 15c: getstatic l9p.who L_ss;
      // 15f: iload 8
      // 161: invokevirtual ha9.qcw (L_ss;I)V
      // 164: return
   }

   @Override
   public void ibc(float param1, float param2) {
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
      // 05: getfield ha9.lls Lpj2;
      // 08: getfield pj2.wvp Z
      // 0b: iload 3
      // 0c: ifne 23
      // 0f: ifne 44
      // 12: goto 19
      // 15: invokestatic ha9.a (Loov;)Loov;
      // 18: athrow
      // 19: fload 1
      // 1a: fconst_2
      // 1b: fcmpl
      // 1c: goto 23
      // 1f: invokestatic ha9.a (Loov;)Loov;
      // 22: athrow
      // 23: iflt 3e
      // 26: aload 0
      // 27: getstatic l9p.pct L_ss;
      // 2a: fload 1
      // 2b: f2d
      // 2c: ldc2_w 100.0
      // 2f: dmul
      // 30: invokestatic java/lang/Math.round (D)J
      // 33: l2i
      // 34: invokevirtual ha9.qcw (L_ss;I)V
      // 37: goto 3e
      // 3a: invokestatic ha9.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: fload 1
      // 40: fload 2
      // 41: invokespecial Entity.ibc (FF)V
      // 44: return
   }

   @Override
   public void qw8() {
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
      // 06: ifeq 1e
      // 09: invokevirtual ha9.myu ()Z
      // 0c: ifne 21
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic ha9.a (Loov;)Loov;
      // 1d: athrow
      // 1e: invokespecial Entity.qw8 ()V
      // 21: return
   }

   @Override
   public String rz6(int var1) {
      long var2 = c ^ 18685335368986L;

      try {
         if (var1 > 4) {
            return c<"k">(24883, 4111425356076630143L ^ var2);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return c<"k">(8824, 6525157248170001201L ^ var2);
   }

   @Override
   public void s5f(Entity param1) {
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
      // 05: iload 2
      // 06: ifne 33
      // 09: instanceof uv0
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic y8d.mc7 Ll7l;
      // 1a: invokevirtual ha9.aex (L_ss;)V
      // 1d: goto 24
      // 20: invokestatic ha9.a (Loov;)Loov;
      // 23: athrow
      // 24: getstatic y65._n6 Ljava/util/Map;
      // 27: aload 1
      // 28: invokestatic y65.duj (Li2h;)I
      // 2b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 33: checkcast y65$p2a
      // 36: astore 3
      // 37: aload 3
      // 38: ifnull 4a
      // 3b: aload 0
      // 3c: aload 3
      // 3d: getfield y65$p2a.ke4 L_ss;
      // 40: invokevirtual ha9.aex (L_ss;)V
      // 43: goto 4a
      // 46: invokestatic ha9.a (Loov;)Loov;
      // 49: athrow
      // 4a: return
   }

   @Override
   public void wx3() {
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
      // 05: iload 1
      // 06: ifne 21
      // 09: getfield ha9.lls Lpj2;
      // 0c: getfield pj2.wzx Z
      // 0f: ifne 24
      // 12: goto 19
      // 15: invokestatic ha9.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: goto 21
      // 1d: invokestatic ha9.a (Loov;)Loov;
      // 20: athrow
      // 21: invokespecial Entity.wx3 ()V
      // 24: return
   }

   @Override
   public erg wfg(int var1) {
      return this.up_.tjd(var1);
   }

   public void nli(int var1) {
      int var2 = OpaquePredicate.c();
      this.aqc(var1);
      int var3 = Integer.MAX_VALUE - this.nk0;

      label31: {
         label30: {
            try {
               if (var2 != 0) {
                  break label31;
               }

               if (var1 <= var3) {
                  break label30;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var1 = var3;
         }

         this.ey9 = this.ey9 + (float)var1 / (float)this.n5x();
      }

      this.nk0 += var1;

      while (this.ey9 >= 1.0F) {
         this.ey9 = (this.ey9 - 1.0F) * (float)this.n5x();
         this.odj(1);
         this.ey9 = this.ey9 / (float)this.n5x();
         if (var2 != 0) {
            break;
         }
      }
   }

   public int k2f() {
      return this.j7g;
   }

   public void twf(int param1) {
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
      // 05: dup
      // 06: getfield ha9.op5 I
      // 09: iload 1
      // 0a: isub
      // 0b: putfield ha9.op5 I
      // 0e: aload 0
      // 0f: iload 2
      // 10: ifne 37
      // 13: getfield ha9.op5 I
      // 16: ifge 36
      // 19: goto 20
      // 1c: invokestatic ha9.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: bipush 0
      // 22: putfield ha9.op5 I
      // 25: aload 0
      // 26: fconst_0
      // 27: putfield ha9.ey9 F
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield ha9.nk0 I
      // 2f: goto 36
      // 32: invokestatic ha9.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: aload 0
      // 38: getfield ha9.z2d Ljava/util/Random;
      // 3b: invokevirtual java/util/Random.nextInt ()I
      // 3e: putfield ha9.j7g I
      // 41: return
   }

   public void odj(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ha9.c J
      // 03: ldc2_w 26596774730699
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: dup
      // 0f: getfield ha9.op5 I
      // 12: iload 1
      // 13: iadd
      // 14: putfield ha9.op5 I
      // 17: aload 0
      // 18: getfield ha9.op5 I
      // 1b: iload 4
      // 1d: ifne 41
      // 20: ifge 40
      // 23: goto 2a
      // 26: invokestatic ha9.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield ha9.op5 I
      // 2f: aload 0
      // 30: fconst_0
      // 31: putfield ha9.ey9 F
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield ha9.nk0 I
      // 39: goto 40
      // 3c: invokestatic ha9.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 1
      // 41: iload 4
      // 43: ifne 5d
      // 46: ifle e5
      // 49: goto 50
      // 4c: invokestatic ha9.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield ha9.op5 I
      // 54: bipush 5
      // 55: irem
      // 56: goto 5d
      // 59: invokestatic ha9.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 4
      // 5f: ifne 82
      // 62: ifne e5
      // 65: goto 6c
      // 68: invokestatic ha9.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield ha9.igo I
      // 70: i2f
      // 71: aload 0
      // 72: getfield ha9.g25 I
      // 75: i2f
      // 76: ldc 100.0
      // 78: nop
      // 79: fsub
      // 7a: fcmpg
      // 7b: goto 82
      // 7e: invokestatic ha9.a (Loov;)Loov;
      // 81: athrow
      // 82: iload 4
      // 84: ifne 9c
      // 87: ifge e5
      // 8a: goto 91
      // 8d: invokestatic ha9.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: getfield ha9.op5 I
      // 95: goto 9c
      // 98: invokestatic ha9.a (Loov;)Loov;
      // 9b: athrow
      // 9c: iload 4
      // 9e: ifne b9
      // a1: bipush 30
      // a3: if_icmple b5
      // a6: goto ad
      // a9: invokestatic ha9.a (Loov;)Loov;
      // ac: athrow
      // ad: fconst_1
      // ae: goto be
      // b1: invokestatic ha9.a (Loov;)Loov;
      // b4: athrow
      // b5: aload 0
      // b6: getfield ha9.op5 I
      // b9: i2f
      // ba: ldc 30.0
      // bc: nop
      // bd: fdiv
      // be: fstore 5
      // c0: aload 0
      // c1: getfield ha9.oay Lt9d;
      // c4: aload 0
      // c5: sipush 23783
      // c8: ldc2_w 442603112232702808
      // cb: lload 2
      // cc: lxor
      // cd: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: nop
      // d3: fload 5
      // d5: ldc 0.75
      // d7: nop
      // d8: fmul
      // d9: fconst_1
      // da: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // dd: aload 0
      // de: aload 0
      // df: getfield ha9.g25 I
      // e2: putfield ha9.igo I
      // e5: return
   }

   public int n5x() {
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
      // 05: getfield ha9.op5 I
      // 08: bipush 30
      // 0a: iload 1
      // 0b: ifeq 32
      // 0e: if_icmplt 2c
      // 11: goto 18
      // 14: invokestatic ha9.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 112
      // 1a: aload 0
      // 1b: getfield ha9.op5 I
      // 1e: bipush 30
      // 20: isub
      // 21: bipush 9
      // 23: imul
      // 24: iadd
      // 25: goto 5c
      // 28: invokestatic ha9.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield ha9.op5 I
      // 30: bipush 15
      // 32: iload 1
      // 33: ifeq 5b
      // 36: if_icmplt 53
      // 39: goto 40
      // 3c: invokestatic ha9.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 37
      // 42: aload 0
      // 43: getfield ha9.op5 I
      // 46: bipush 15
      // 48: isub
      // 49: bipush 5
      // 4a: imul
      // 4b: iadd
      // 4c: goto 5c
      // 4f: invokestatic ha9.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 7
      // 55: aload 0
      // 56: getfield ha9.op5 I
      // 59: bipush 2
      // 5a: imul
      // 5b: iadd
      // 5c: ireturn
   }

   public void i8a(float param1) {
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
      // 05: getfield ha9.lls Lpj2;
      // 08: getfield pj2.lez Z
      // 0b: iload 2
      // 0c: ifne 32
      // 0f: ifne 3d
      // 12: goto 19
      // 15: invokestatic ha9.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifne 36
      // 1e: goto 25
      // 21: invokestatic ha9.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield ha9.oay Lt9d;
      // 28: getfield OpaquePredicate.v0f Z
      // 2b: goto 32
      // 2e: invokestatic ha9.a (Loov;)Loov;
      // 31: athrow
      // 32: ifne 3d
      // 35: aload 0
      // 36: getfield ha9.kbo Lwkk;
      // 39: fload 1
      // 3a: invokevirtual wkk.qvy (F)V
      // 3d: return
   }

   public wkk wvq() {
      return this.kbo;
   }

   public boolean ca2(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 3d
      // 09: ifne 2f
      // 0c: goto 13
      // 0f: invokestatic ha9.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield ha9.kbo Lwkk;
      // 17: invokevirtual wkk.njl ()Z
      // 1a: iload 2
      // 1b: ifeq 3d
      // 1e: goto 25
      // 21: invokestatic ha9.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 4f
      // 28: goto 2f
      // 2b: invokestatic ha9.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield ha9.lls Lpj2;
      // 33: getfield pj2.lez Z
      // 36: goto 3d
      // 39: invokestatic ha9.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 2
      // 3e: ifeq 4c
      // 41: ifne 4f
      // 44: goto 4b
      // 47: invokestatic ha9.a (Loov;)Loov;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: ireturn
   }

   public boolean g00() {
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
      // 05: invokevirtual ha9.i55 ()F
      // 08: fconst_0
      // 09: fcmpl
      // 0a: iload 1
      // 0b: ifeq 28
      // 0e: ifle 3a
      // 11: goto 18
      // 14: invokestatic ha9.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual ha9.i55 ()F
      // 1c: aload 0
      // 1d: invokevirtual ha9.axb ()F
      // 20: fcmpg
      // 21: goto 28
      // 24: invokestatic ha9.a (Loov;)Loov;
      // 27: athrow
      // 28: iload 1
      // 29: ifeq 37
      // 2c: ifge 3a
      // 2f: goto 36
      // 32: invokestatic ha9.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: ireturn
   }

   public void qez(erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 0
      // 06: getfield ha9.egg Lerg;
      // 09: if_acmpeq 3e
      // 0c: aload 0
      // 0d: aload 1
      // 0e: putfield ha9.egg Lerg;
      // 11: aload 0
      // 12: iload 2
      // 13: putfield ha9.nff I
      // 16: aload 0
      // 17: iload 3
      // 18: ifeq 3a
      // 1b: goto 22
      // 1e: invokestatic ha9.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield ha9.oay Lt9d;
      // 25: getfield OpaquePredicate.v0f Z
      // 28: ifne 3e
      // 2b: goto 32
      // 2e: invokestatic ha9.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: goto 3a
      // 36: invokestatic ha9.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: invokevirtual ha9._a5 (Z)V
      // 3e: return
   }

   public boolean gt3() {
      return this.lls.x4a;
   }

   public boolean dzh(mew param1, vt2 param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield ha9.lls Lpj2;
      // 09: getfield pj2.x4a Z
      // 0c: iload 4
      // 0e: ifeq 1c
      // 11: ifeq 1d
      // 14: goto 1b
      // 17: invokestatic ha9.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: ireturn
      // 1d: aload 3
      // 1e: ifnonnull 27
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic ha9.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 1
      // 28: aload 2
      // 29: invokevirtual vt2.b4b ()Lvt2;
      // 2c: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2f: astore 5
      // 31: aload 0
      // 32: getfield ha9.oay Lt9d;
      // 35: aload 5
      // 37: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3a: invokeinterface zfz.r_y ()Le0x; 1
      // 3f: astore 6
      // 41: aload 3
      // 42: aload 6
      // 44: invokevirtual erg.emo (Le0x;)Z
      // 47: iload 4
      // 49: ifeq 71
      // 4c: ifne 70
      // 4f: goto 56
      // 52: invokestatic ha9.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 3
      // 57: invokevirtual erg.dzn ()Z
      // 5a: iload 4
      // 5c: ifeq 71
      // 5f: goto 66
      // 62: invokestatic ha9.a (Loov;)Loov;
      // 65: athrow
      // 66: ifeq 74
      // 69: goto 70
      // 6c: invokestatic ha9.a (Loov;)Loov;
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: ireturn
   }

   @Override
   public int _96(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ha9.c J
      // 03: ldc2_w 50165896113459
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield ha9.oay Lt9d;
      // 11: invokevirtual OpaquePredicate.eir ()Lef9;
      // 14: sipush 7352
      // 17: ldc2_w 7079341203384018430
      // 1a: lload 2
      // 1b: lxor
      // 1c: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: nop
      // 22: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 25: iload 4
      // 27: ifne 41
      // 2a: ifeq 3a
      // 2d: goto 34
      // 30: invokestatic ha9.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic ha9.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield ha9.op5 I
      // 3e: bipush 7
      // 40: imul
      // 41: istore 5
      // 43: iload 5
      // 45: iload 4
      // 47: ifne 5f
      // 4a: bipush 100
      // 4c: if_icmple 62
      // 4f: goto 56
      // 52: invokestatic ha9.a (Loov;)Loov;
      // 55: athrow
      // 56: bipush 100
      // 58: goto 5f
      // 5b: invokestatic ha9.a (Loov;)Loov;
      // 5e: athrow
      // 5f: goto 64
      // 62: iload 5
      // 64: ireturn
   }

   @Override
   public boolean pwr() {
      return true;
   }

   @Override
   public boolean x1t() {
      return true;
   }

   public void moc(ha9 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ha9.c J
      // 003: ldc2_w 21990298611615
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: iload 2
      // 00e: iload 5
      // 010: ifne 0a7
      // 013: ifeq 07c
      // 016: goto 01d
      // 019: invokestatic ha9.a (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: getfield ha9.up_ Ljnq;
      // 021: aload 1
      // 022: getfield ha9.up_ Ljnq;
      // 025: invokevirtual jnq.dna (Ljnq;)V
      // 028: aload 0
      // 029: aload 1
      // 02a: invokevirtual ha9.i55 ()F
      // 02d: invokevirtual ha9.uh3 (F)V
      // 030: aload 0
      // 031: aload 1
      // 032: getfield ha9.kbo Lwkk;
      // 035: putfield ha9.kbo Lwkk;
      // 038: aload 0
      // 039: aload 1
      // 03a: getfield ha9.op5 I
      // 03d: putfield ha9.op5 I
      // 040: aload 0
      // 041: aload 1
      // 042: getfield ha9.nk0 I
      // 045: putfield ha9.nk0 I
      // 048: aload 0
      // 049: aload 1
      // 04a: getfield ha9.ey9 F
      // 04d: putfield ha9.ey9 F
      // 050: aload 0
      // 051: aload 1
      // 052: invokevirtual ha9.zy2 ()I
      // 055: invokevirtual ha9.q7d (I)V
      // 058: aload 0
      // 059: aload 1
      // 05a: getfield ha9.tzh Lmew;
      // 05d: putfield ha9.tzh Lmew;
      // 060: aload 0
      // 061: aload 1
      // 062: getfield ha9.r4s Lfqr;
      // 065: putfield ha9.r4s Lfqr;
      // 068: aload 0
      // 069: aload 1
      // 06a: getfield ha9.src Lvt2;
      // 06d: putfield ha9.src Lvt2;
      // 070: iload 5
      // 072: ifeq 0dc
      // 075: goto 07c
      // 078: invokestatic ha9.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: iload 5
      // 07f: ifne 0ed
      // 082: goto 089
      // 085: invokestatic ha9.a (Loov;)Loov;
      // 088: athrow
      // 089: getfield ha9.oay Lt9d;
      // 08c: invokevirtual OpaquePredicate.eir ()Lef9;
      // 08f: sipush 31833
      // 092: ldc2_w 4490226921781708697
      // 095: lload 3
      // 096: lxor
      // 097: invokedynamic k (IJ)Ljava/lang/String; bsm=ha9.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: nop
      // 09d: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0a0: goto 0a7
      // 0a3: invokestatic ha9.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: ifeq 0dc
      // 0aa: aload 0
      // 0ab: getfield ha9.up_ Ljnq;
      // 0ae: aload 1
      // 0af: getfield ha9.up_ Ljnq;
      // 0b2: invokevirtual jnq.dna (Ljnq;)V
      // 0b5: aload 0
      // 0b6: aload 1
      // 0b7: getfield ha9.op5 I
      // 0ba: putfield ha9.op5 I
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: getfield ha9.nk0 I
      // 0c2: putfield ha9.nk0 I
      // 0c5: aload 0
      // 0c6: aload 1
      // 0c7: getfield ha9.ey9 F
      // 0ca: putfield ha9.ey9 F
      // 0cd: aload 0
      // 0ce: aload 1
      // 0cf: invokevirtual ha9.zy2 ()I
      // 0d2: invokevirtual ha9.q7d (I)V
      // 0d5: goto 0dc
      // 0d8: invokestatic ha9.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: aload 1
      // 0de: getfield ha9.j7g I
      // 0e1: putfield ha9.j7g I
      // 0e4: aload 0
      // 0e5: aload 1
      // 0e6: getfield ha9.gk4 Lctr;
      // 0e9: putfield ha9.gk4 Lctr;
      // 0ec: aload 0
      // 0ed: invokevirtual ha9.a0c ()Lwl1;
      // 0f0: bipush 10
      // 0f2: aload 1
      // 0f3: invokevirtual ha9.a0c ()Lwl1;
      // 0f6: bipush 10
      // 0f8: invokevirtual wl1.miz (I)B
      // 0fb: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 0fe: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 101: return
   }

   @Override
   public boolean _p9() {
      int var1 = OpaquePredicate.b();

      try {
         if (var1 == 0) {
            return this.lls.wzx;
         }

         if (!this.lls.wzx) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public void gow() {
   }

   public void bci(h50$f05 var1) {
   }

   @Override
   public String noc() {
      return this.vv6.getName();
   }

   public ctr uzq() {
      return this.gk4;
   }

   @Override
   public erg rnq(int var1) {
      try {
         if (var1 == 0) {
            return this.up_.dxs();
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return this.up_._dn[var1 - 1];
   }

   @Override
   public erg tsc() {
      return this.up_.dxs();
   }

   @Override
   public void fga(int var1, erg var2) {
      this.up_._dn[var1] = var2;
   }

   @Override
   public boolean fiy(ha9 param1) {
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
      // 05: invokevirtual ha9.h5u ()Z
      // 08: iload 2
      // 09: ifne 2b
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic ha9.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: iload 2
      // 1e: ifne 35
      // 21: invokevirtual ha9.myu ()Z
      // 24: goto 2b
      // 27: invokestatic ha9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifeq 34
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic ha9.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: invokevirtual ha9.ued ()Ln_0;
      // 38: astore 3
      // 39: aload 3
      // 3a: ifnull 7f
      // 3d: aload 1
      // 3e: iload 2
      // 3f: ifne 54
      // 42: goto 49
      // 45: invokestatic ha9.a (Loov;)Loov;
      // 48: athrow
      // 49: ifnull 7f
      // 4c: goto 53
      // 4f: invokestatic ha9.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 1
      // 54: invokevirtual ha9.ued ()Ln_0;
      // 57: iload 2
      // 58: ifne 6e
      // 5b: aload 3
      // 5c: if_acmpne 7f
      // 5f: goto 66
      // 62: invokestatic ha9.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 3
      // 67: goto 6e
      // 6a: invokestatic ha9.a (Loov;)Loov;
      // 6d: athrow
      // 6e: invokevirtual n_0.g33 ()Z
      // 71: iload 2
      // 72: ifne 80
      // 75: ifne 83
      // 78: goto 7f
      // 7b: invokestatic ha9.a (Loov;)Loov;
      // 7e: athrow
      // 7f: bipush 1
      // 80: goto 84
      // 83: bipush 0
      // 84: ireturn
   }

   public abstract boolean myu();

   @Override
   public erg[] n7a() {
      return this.up_._dn;
   }

   @Override
   public boolean ycw() {
      int var1 = OpaquePredicate.c();

      try {
         if (var1 != 0) {
            return this.lls.wzx;
         }

         if (!this.lls.wzx) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public uci cjt() {
      return this.oay.fgp();
   }

   @Override
   public n_0 ued() {
      return this.cjt().zov(this.noc());
   }

   @Override
   public ekw xyw() {
      long var1 = c ^ 118800669584289L;
      tao var3 = new tao(q2m.x0i(this.ued(), this.noc()));
      var3.f4q().bpc(new tgr(tgr$a3_.y5i, c<"k">(6638, 5311935352265958974L ^ var1) + this.noc() + " "));
      var3.f4q().zn_(this.c7n());
      var3.f4q().o7m(this.noc());
      return var3;
   }

   @Override
   public float c5y() {
      int var1 = OpaquePredicate.c();
      float var2 = 1.62F;

      boolean var10000;
      label25: {
         label24: {
            try {
               var10000 = this.ofg();
               if (var1 != 0) {
                  break label25;
               }

               if (!var10000) {
                  break label24;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var2 = 0.2F;
         }

         var10000 = this.hzv();
      }

      if (var10000) {
         var2 -= 0.08F;
      }

      return var2;
   }

   @Override
   public void pr9(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: fload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: fconst_0
      // 0a: fcmpg
      // 0b: ifge 1e
      // 0e: goto 15
      // 11: invokestatic ha9.a (Loov;)Loov;
      // 14: athrow
      // 15: fconst_0
      // 16: goto 1d
      // 19: invokestatic ha9.a (Loov;)Loov;
      // 1c: athrow
      // 1d: fstore 1
      // 1e: aload 0
      // 1f: invokevirtual ha9.a0c ()Lwl1;
      // 22: bipush 17
      // 24: fload 1
      // 25: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 28: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2b: return
   }

   @Override
   public float _xk() {
      return this.a0c().ig2(17);
   }

   public static UUID z05(GameProfile var0) {
      int var1 = OpaquePredicate.b();
      UUID var2 = var0.getId();

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 != null) {
            return var2;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return zzw(var0.getName());
   }

   public static UUID zzw(String var0) {
      long var1 = c ^ 138586424206731L;
      return UUID.nameUUIDFromBytes((c<"k">(21617, 3364206631783785876L ^ var1) + var0).getBytes(Charsets.UTF_8));
   }

   public boolean cwv(axk param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual axk.vol ()Z
      // 08: iload 2
      // 09: ifeq 17
      // 0c: ifeq 18
      // 0f: goto 16
      // 12: invokestatic ha9.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: aload 0
      // 19: invokevirtual ha9.b5z ()Lerg;
      // 1c: astore 3
      // 1d: aload 3
      // 1e: iload 2
      // 1f: ifeq 2d
      // 22: ifnull 53
      // 25: goto 2c
      // 28: invokestatic ha9.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 3
      // 2d: invokevirtual erg.x4w ()Z
      // 30: iload 2
      // 31: ifeq 50
      // 34: ifeq 53
      // 37: goto 3e
      // 3a: invokestatic ha9.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 3
      // 3f: invokevirtual erg.zow ()Ljava/lang/String;
      // 42: aload 1
      // 43: invokevirtual axk.o7p ()Ljava/lang/String;
      // 46: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 49: goto 50
      // 4c: invokestatic ha9.a (Loov;)Loov;
      // 4f: athrow
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   public boolean cuw(ulc param1) {
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
      // 05: invokevirtual ha9.a0c ()Lwl1;
      // 08: bipush 10
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: aload 1
      // 0e: invokevirtual ulc.ubx ()I
      // 11: iand
      // 12: iload 2
      // 13: ifeq 2c
      // 16: aload 1
      // 17: invokevirtual ulc.ubx ()I
      // 1a: if_icmpne 2f
      // 1d: goto 24
      // 20: invokestatic ha9.a (Loov;)Loov;
      // 23: athrow
      // 24: bipush 1
      // 25: goto 2c
      // 28: invokestatic ha9.a (Loov;)Loov;
      // 2b: athrow
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }

   @Override
   public boolean ofq() {
      long var1 = c ^ 26418998205208L;
      return vr1._0v().p_y[0].eir()._s0(c<"k">(26523, 7604545259318536407L ^ var1));
   }

   @Override
   public boolean ltx(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: iload 1
      // 005: iload 3
      // 006: ifeq 044
      // 009: iflt 040
      // 00c: goto 013
      // 00f: invokestatic ha9.a (Loov;)Loov;
      // 012: athrow
      // 013: iload 1
      // 014: aload 0
      // 015: getfield ha9.up_ Ljnq;
      // 018: getfield jnq.c41 [Lerg;
      // 01b: arraylength
      // 01c: iload 3
      // 01d: ifeq 043
      // 020: goto 027
      // 023: invokestatic ha9.a (Loov;)Loov;
      // 026: athrow
      // 027: if_icmpge 040
      // 02a: goto 031
      // 02d: invokestatic ha9.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 0
      // 032: getfield ha9.up_ Ljnq;
      // 035: iload 1
      // 036: aload 2
      // 037: invokevirtual jnq.cxl (ILerg;)V
      // 03a: bipush 1
      // 03b: ireturn
      // 03c: invokestatic ha9.a (Loov;)Loov;
      // 03f: athrow
      // 040: iload 1
      // 041: bipush 100
      // 043: isub
      // 044: istore 4
      // 046: iload 4
      // 048: iload 3
      // 049: ifeq 145
      // 04c: iflt 140
      // 04f: goto 056
      // 052: invokestatic ha9.a (Loov;)Loov;
      // 055: athrow
      // 056: iload 4
      // 058: aload 0
      // 059: getfield ha9.up_ Ljnq;
      // 05c: getfield jnq._dn [Lerg;
      // 05f: arraylength
      // 060: iload 3
      // 061: ifeq 144
      // 064: goto 06b
      // 067: invokestatic ha9.a (Loov;)Loov;
      // 06a: athrow
      // 06b: if_icmpge 140
      // 06e: goto 075
      // 071: invokestatic ha9.a (Loov;)Loov;
      // 074: athrow
      // 075: iload 4
      // 077: bipush 1
      // 078: iadd
      // 079: istore 5
      // 07b: iload 3
      // 07c: ifeq 13e
      // 07f: aload 2
      // 080: ifnull 12b
      // 083: goto 08a
      // 086: invokestatic ha9.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 2
      // 08b: invokevirtual erg.gn1 ()Lu7m;
      // 08e: iload 3
      // 08f: ifeq 0ae
      // 092: goto 099
      // 095: invokestatic ha9.a (Loov;)Loov;
      // 098: athrow
      // 099: ifnull 12b
      // 09c: goto 0a3
      // 09f: invokestatic ha9.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 2
      // 0a4: invokevirtual erg.gn1 ()Lu7m;
      // 0a7: goto 0ae
      // 0aa: invokestatic ha9.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: instanceof jpt
      // 0b1: iload 3
      // 0b2: ifeq 0e2
      // 0b5: ifeq 0e0
      // 0b8: goto 0bf
      // 0bb: invokestatic ha9.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 2
      // 0c0: invokestatic yqv.vu5 (Lerg;)I
      // 0c3: iload 3
      // 0c4: ifeq 13f
      // 0c7: goto 0ce
      // 0ca: invokestatic ha9.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: iload 5
      // 0d0: if_icmpeq 12b
      // 0d3: goto 0da
      // 0d6: invokestatic ha9.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: bipush 0
      // 0db: ireturn
      // 0dc: invokestatic ha9.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: iload 5
      // 0e2: iload 3
      // 0e3: ifeq 12a
      // 0e6: bipush 4
      // 0e7: if_icmpne 129
      // 0ea: goto 0f1
      // 0ed: invokestatic ha9.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: invokevirtual erg.gn1 ()Lu7m;
      // 0f5: iload 3
      // 0f6: ifeq 118
      // 0f9: goto 100
      // 0fc: invokestatic ha9.a (Loov;)Loov;
      // 0ff: athrow
      // 100: getstatic xbr.r9n Lu7m;
      // 103: if_acmpeq 12b
      // 106: goto 10d
      // 109: invokestatic ha9.a (Loov;)Loov;
      // 10c: athrow
      // 10d: aload 2
      // 10e: invokevirtual erg.gn1 ()Lu7m;
      // 111: goto 118
      // 114: invokestatic ha9.a (Loov;)Loov;
      // 117: athrow
      // 118: instanceof gun
      // 11b: iload 3
      // 11c: ifeq 13f
      // 11f: ifne 12b
      // 122: goto 129
      // 125: invokestatic ha9.a (Loov;)Loov;
      // 128: athrow
      // 129: bipush 0
      // 12a: ireturn
      // 12b: aload 0
      // 12c: getfield ha9.up_ Ljnq;
      // 12f: iload 4
      // 131: aload 0
      // 132: getfield ha9.up_ Ljnq;
      // 135: getfield jnq.c41 [Lerg;
      // 138: arraylength
      // 139: iadd
      // 13a: aload 2
      // 13b: invokevirtual jnq.cxl (ILerg;)V
      // 13e: bipush 1
      // 13f: ireturn
      // 140: iload 1
      // 141: sipush 200
      // 144: isub
      // 145: istore 5
      // 147: iload 5
      // 149: iload 3
      // 14a: ifeq 186
      // 14d: iflt 185
      // 150: goto 157
      // 153: invokestatic ha9.a (Loov;)Loov;
      // 156: athrow
      // 157: iload 5
      // 159: iload 3
      // 15a: ifeq 186
      // 15d: goto 164
      // 160: invokestatic ha9.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 0
      // 165: getfield ha9.gk4 Lctr;
      // 168: invokevirtual ctr.opt ()I
      // 16b: if_icmpge 185
      // 16e: goto 175
      // 171: invokestatic ha9.a (Loov;)Loov;
      // 174: athrow
      // 175: aload 0
      // 176: getfield ha9.gk4 Lctr;
      // 179: iload 5
      // 17b: aload 2
      // 17c: invokevirtual ctr.cxl (ILerg;)V
      // 17f: bipush 1
      // 180: ireturn
      // 181: invokestatic ha9.a (Loov;)Loov;
      // 184: athrow
      // 185: bipush 0
      // 186: ireturn
   }

   public boolean acj() {
      return this.abn;
   }

   public void zw1(boolean var1) {
      this.abn = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2754335826078976463L, -4667920422023802313L, MethodHandles.lookup().lookupClass()).a(54030631050560L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 13989698532779L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[45];
      int var7 = 0;
      String var6 = "aD5ÐÉ\u009cZ»û\u0085 {èkÉ\u00151á¢/¿à\u0096êÀ«à\u008b\u0092ÓÆ÷\u0015\u000b±#ÙvQt\u0018ðùN\\£Ó\fÕ\u00824TDS«\u008d\u000flÝùÄÔ4R¹\u0010\u0007Sj*ùab¢m\u008f\u008ab`Æí¶ Ø=À+;©)rjÌG\u0093Æöe)v\u0007\u001f.Ø%\u0088e\u0012Ò\u001cÍµÈ4u ¹Ä DÜ\u008el9ÆeT\u0091L/v%zÎ\u001b\u00ad<\u001b6¹\u008b\fHY~ü¯ß\u0010§VÄ\u0090ºøÚ¯Ñ\u009e\u0001vèø\u0080À\u0018\u0005ÄèF!À§A0\u00989~S¹ã\u008dÿ\u001f*\u0090J²\u008b{ Ì\u001f&ùb£\u009beO/Î9ÆiÌ<\u0090q\u0083dwoøØT\u0012\u0002q-ú)Â\u00106<'øixß£vó'h\n/\u0080Î\u0010±0\b$Ë¨¢\u008e;XºA\u0089\u009f\u0082ø\u0010l¢\u008fð\u0018ñ:\u0011Ô\u0091ê\n|Ä;\u008f( {R`¡íQ~\u0088¬Z\u0094\u007f`gì?ÐW]L\u00986\u0014\u000fÛ+èy[³\u008ac£\u000ek\u008d¾\u008bê\u0010Ô·\u008b\u001biI\u0081lÉ\u0017\rú0\u0088\u0010æ\u0010\u0011QÔ?e¡Ú¤\u0012ó\u009eÙO\u001bc{\u0010\u0016A@·Á»\u0007³Ê2c(»W/\u0084 \u0017È©:\u0084ßÏ\u007f£f\t\u001e\u0001Ï\u0019H\u0016H\rrª\u0080Î\u0087â³\u0019è\u0001ºzß(7É©ÞJÌÆ4?*\u0080\u009ee\u009cöo´`\u00153UC/K\u0098CY\u0090z÷ ¿L;;¬_]Nd\u0010#\u0093TóÈèÓ^iT¸û\u001ee\u0090£\u0018]\"2/ÓÒ¬Â\u0093j\u008c\u0001\u009f%¢¹0dòEI-óæ0\u0098ÚY\u008cGXÄô\u0089ò\u001b¢Vú¦O\u0016\u0001\u009eø@Ç:_ \u001fÐ¬·µ\u0092;ø·\u0091¬`ÞÚ@èðP4E2l9\u0010\u0099\"EOf\u000b\u001f\u0012Êp[ä¼l8î\u0010bOâÅ¹\u009e!\u0084\f\u001dÃ¢ä¤\b\u008c\u0010H;\u0084_I#\u001e\u0093òuêwá\u008aY\u008b \u001eÎ\u0093\u0019t¦F¥\u0016\b¢sûå»m@ü|\u0095\u008fp\u001e'µ¾À\u00162¥Ò÷(\u0019vbç\u0002ªÕkìPÖÿÖÝ1ÈW|3Ô\u0017íÎ\u001f\u0085ÐÊÊaK¡»<éÂÎ\u009a>Í¹(ee¾ëU\u0081È£L\u0089@\u0012\u0092÷¬ªVÚâztÀ\r\u001b7\u0019Ø\u008f\u001eöÔß~A:õ\u0085m\\M\u0010²£\u0004Mx\u008b\u0015uD=R<K¾\u0090¡\u0018~óÑ4P(+n§Ã©\u0097@Ð}Þ_±·\u0010â\u000b4\u0092\u0010\u008f\u000f÷9Á\u0095\u0099Wã2&ôó®2ú\u0018ý8\u0083©t\u009d\t(\u0095\u008fx\u0099ãI³(tb\u0087Vü]è\u0088\u0018«5ÞÒ»a?¢ \u0098;ÖØJ\u0015À\"Ê¥\u008c{â5W »§\u008c\u008a¿ß¬=çæ\"JA\u0090c@`?Q3?pQ\u001f>FÔPûç\u0003ô8÷&\u0015f\u0011)\u0012p«Å\u0017\u0085\b^Y*\u001a\u0086Å*\u0099¼?*\u0017\u0001\u00055\u0091\u008aï\u001d\u0012\u0016\u0010ÅÙ\u0002hÆ×Ç]\u008aBe?É¹ì@\u0086|À8\u001f rP9\u0013\u0088etø\u0006±Iyîâ·\u0080Ì\u000fb\u009e1\u0087n§Òï\u0013&\u0013\u0010\u008f\u0010 LÑ/O\u0083¦Å\u0018¯îK\u009agdD\u0018Ú\u009bµüyYm£/\u001b\u0018 \u009e\u0097D³\u0010\u0091\u009cR_b\u0004Ö Y\u001dóQ6\u001ceg \u0006\u008d\u0002\u000fÕ\\H\u0096âûij\u001d\u0019\u008dæé\u00835\u00adõ\u009a\u0083wùw\u0080FÍ\u0090Æå0&ô¾\u0011\u001aÌ3u\u0090NÏoPq\u0095\u007f\t¬v\u0097HwÔw2\u0014ìð°í\u0080ü\u0001 \u009am\u0097*Ý\r\u0002\u0000\u00117\u00ad§yü\u0018Ô(w\u0092òÖ½ä\u0013\\O\u0086\u0091ñ0\u009e&l`\u0017\u00ad\u0006Fã(_&Szå\u009e¸\u0005ë¡¦XÁ»ÛöÈ]Uöq/jE\u0011\"\u009a(\u0000{Ùò¯_<gs\u0011ÿ2\u0018\u0094Ò\u0015Ù\"\u0090\u009e\u009bÝ\u0014s9,è®\u0095º%#\u008dö~{×\u0010D\"¥Nï$äó\u0006\u0088úT)\u001e\u007f\u001c\u0010SÆ°ôþÑÅ\u0086\t¹Ý4b_¯p";
      int var8 = "aD5ÐÉ\u009cZ»û\u0085 {èkÉ\u00151á¢/¿à\u0096êÀ«à\u008b\u0092ÓÆ÷\u0015\u000b±#ÙvQt\u0018ðùN\\£Ó\fÕ\u00824TDS«\u008d\u000flÝùÄÔ4R¹\u0010\u0007Sj*ùab¢m\u008f\u008ab`Æí¶ Ø=À+;©)rjÌG\u0093Æöe)v\u0007\u001f.Ø%\u0088e\u0012Ò\u001cÍµÈ4u ¹Ä DÜ\u008el9ÆeT\u0091L/v%zÎ\u001b\u00ad<\u001b6¹\u008b\fHY~ü¯ß\u0010§VÄ\u0090ºøÚ¯Ñ\u009e\u0001vèø\u0080À\u0018\u0005ÄèF!À§A0\u00989~S¹ã\u008dÿ\u001f*\u0090J²\u008b{ Ì\u001f&ùb£\u009beO/Î9ÆiÌ<\u0090q\u0083dwoøØT\u0012\u0002q-ú)Â\u00106<'øixß£vó'h\n/\u0080Î\u0010±0\b$Ë¨¢\u008e;XºA\u0089\u009f\u0082ø\u0010l¢\u008fð\u0018ñ:\u0011Ô\u0091ê\n|Ä;\u008f( {R`¡íQ~\u0088¬Z\u0094\u007f`gì?ÐW]L\u00986\u0014\u000fÛ+èy[³\u008ac£\u000ek\u008d¾\u008bê\u0010Ô·\u008b\u001biI\u0081lÉ\u0017\rú0\u0088\u0010æ\u0010\u0011QÔ?e¡Ú¤\u0012ó\u009eÙO\u001bc{\u0010\u0016A@·Á»\u0007³Ê2c(»W/\u0084 \u0017È©:\u0084ßÏ\u007f£f\t\u001e\u0001Ï\u0019H\u0016H\rrª\u0080Î\u0087â³\u0019è\u0001ºzß(7É©ÞJÌÆ4?*\u0080\u009ee\u009cöo´`\u00153UC/K\u0098CY\u0090z÷ ¿L;;¬_]Nd\u0010#\u0093TóÈèÓ^iT¸û\u001ee\u0090£\u0018]\"2/ÓÒ¬Â\u0093j\u008c\u0001\u009f%¢¹0dòEI-óæ0\u0098ÚY\u008cGXÄô\u0089ò\u001b¢Vú¦O\u0016\u0001\u009eø@Ç:_ \u001fÐ¬·µ\u0092;ø·\u0091¬`ÞÚ@èðP4E2l9\u0010\u0099\"EOf\u000b\u001f\u0012Êp[ä¼l8î\u0010bOâÅ¹\u009e!\u0084\f\u001dÃ¢ä¤\b\u008c\u0010H;\u0084_I#\u001e\u0093òuêwá\u008aY\u008b \u001eÎ\u0093\u0019t¦F¥\u0016\b¢sûå»m@ü|\u0095\u008fp\u001e'µ¾À\u00162¥Ò÷(\u0019vbç\u0002ªÕkìPÖÿÖÝ1ÈW|3Ô\u0017íÎ\u001f\u0085ÐÊÊaK¡»<éÂÎ\u009a>Í¹(ee¾ëU\u0081È£L\u0089@\u0012\u0092÷¬ªVÚâztÀ\r\u001b7\u0019Ø\u008f\u001eöÔß~A:õ\u0085m\\M\u0010²£\u0004Mx\u008b\u0015uD=R<K¾\u0090¡\u0018~óÑ4P(+n§Ã©\u0097@Ð}Þ_±·\u0010â\u000b4\u0092\u0010\u008f\u000f÷9Á\u0095\u0099Wã2&ôó®2ú\u0018ý8\u0083©t\u009d\t(\u0095\u008fx\u0099ãI³(tb\u0087Vü]è\u0088\u0018«5ÞÒ»a?¢ \u0098;ÖØJ\u0015À\"Ê¥\u008c{â5W »§\u008c\u008a¿ß¬=çæ\"JA\u0090c@`?Q3?pQ\u001f>FÔPûç\u0003ô8÷&\u0015f\u0011)\u0012p«Å\u0017\u0085\b^Y*\u001a\u0086Å*\u0099¼?*\u0017\u0001\u00055\u0091\u008aï\u001d\u0012\u0016\u0010ÅÙ\u0002hÆ×Ç]\u008aBe?É¹ì@\u0086|À8\u001f rP9\u0013\u0088etø\u0006±Iyîâ·\u0080Ì\u000fb\u009e1\u0087n§Òï\u0013&\u0013\u0010\u008f\u0010 LÑ/O\u0083¦Å\u0018¯îK\u009agdD\u0018Ú\u009bµüyYm£/\u001b\u0018 \u009e\u0097D³\u0010\u0091\u009cR_b\u0004Ö Y\u001dóQ6\u001ceg \u0006\u008d\u0002\u000fÕ\\H\u0096âûij\u001d\u0019\u008dæé\u00835\u00adõ\u009a\u0083wùw\u0080FÍ\u0090Æå0&ô¾\u0011\u001aÌ3u\u0090NÏoPq\u0095\u007f\t¬v\u0097HwÔw2\u0014ìð°í\u0080ü\u0001 \u009am\u0097*Ý\r\u0002\u0000\u00117\u00ad§yü\u0018Ô(w\u0092òÖ½ä\u0013\\O\u0086\u0091ñ0\u009e&l`\u0017\u00ad\u0006Fã(_&Szå\u009e¸\u0005ë¡¦XÁ»ÛöÈ]Uöq/jE\u0011\"\u009a(\u0000{Ùò¯_<gs\u0011ÿ2\u0018\u0094Ò\u0015Ù\"\u0090\u009e\u009bÝ\u0014s9,è®\u0095º%#\u008dö~{×\u0010D\"¥Nï$äó\u0006\u0088úT)\u001e\u007f\u001c\u0010SÆ°ôþÑÅ\u0086\t¹Ý4b_¯p"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     h = var9;
                     i = new String[45];
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

                  var6 = "ôPà\u0080Z¸\u0010\u0005G\u0018°ñ\u009a~ð\u0099 ¹V\u009c8ï\u008b}Ó£-;\u000b:0²(\u0084d»\u0098fàC\u0097ÔâtE\u0084O\u008eþ";
                  var8 = "ôPà\u0080Z¸\u0010\u0005G\u0018°ñ\u009a~ð\u0099 ¹V\u009c8ï\u008b}Ó£-;\u000b:0²(\u0084d»\u0098fàC\u0097ÔâtE\u0084O\u008eþ".length();
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

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30893;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])p.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ha9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("ha9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
