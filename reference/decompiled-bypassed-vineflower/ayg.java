import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ayg extends u7m {
   private e0x ltl;
   private static final long a;
   private static final String b;

   public ayg(e0x var1) {
      this.vgp = 1;
      this.ltl = var1;
      this.qfy(uja.kdm);
   }

   @Override
   public erg r__(erg param1, t9d param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield ayg.ltl Le0x;
      // 009: getstatic ox_.ibw Le0x;
      // 00c: if_acmpne 017
      // 00f: bipush 1
      // 010: goto 018
      // 013: invokestatic ayg.a (Loov;)Loov;
      // 016: athrow
      // 017: bipush 0
      // 018: istore 5
      // 01a: aload 0
      // 01b: aload 2
      // 01c: aload 3
      // 01d: iload 5
      // 01f: invokevirtual ayg.tbt (Lt9d;Lha9;Z)Lakm;
      // 022: astore 6
      // 024: aload 6
      // 026: iload 4
      // 028: ifne 03d
      // 02b: ifnonnull 03b
      // 02e: goto 035
      // 031: invokestatic ayg.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 1
      // 036: areturn
      // 037: invokestatic ayg.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 6
      // 03d: iload 4
      // 03f: ifne 05b
      // 042: getfield akm.oyz Lakm$qs6;
      // 045: getstatic akm$qs6.i4l Lakm$qs6;
      // 048: if_acmpne 211
      // 04b: goto 052
      // 04e: invokestatic ayg.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 6
      // 054: goto 05b
      // 057: invokestatic ayg.a (Loov;)Loov;
      // 05a: athrow
      // 05b: invokevirtual akm._uf ()Lmew;
      // 05e: astore 7
      // 060: aload 2
      // 061: aload 3
      // 062: aload 7
      // 064: invokevirtual t9d.q2p (Lha9;Lmew;)Z
      // 067: iload 4
      // 069: ifne 07e
      // 06c: ifne 07c
      // 06f: goto 076
      // 072: invokestatic ayg.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 1
      // 077: areturn
      // 078: invokestatic ayg.a (Loov;)Loov;
      // 07b: athrow
      // 07c: iload 5
      // 07e: iload 4
      // 080: ifne 0a8
      // 083: ifeq 17a
      // 086: goto 08d
      // 089: invokestatic ayg.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 3
      // 08e: aload 7
      // 090: aload 6
      // 092: getfield akm.m_f Lvt2;
      // 095: invokevirtual mew.offset (Lvt2;)Lmew;
      // 098: aload 6
      // 09a: getfield akm.m_f Lvt2;
      // 09d: aload 1
      // 09e: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 0a1: goto 0a8
      // 0a4: invokestatic ayg.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifne 0b1
      // 0ab: aload 1
      // 0ac: areturn
      // 0ad: invokestatic ayg.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 2
      // 0b2: aload 7
      // 0b4: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b7: astore 8
      // 0b9: aload 8
      // 0bb: invokeinterface zfz.r_y ()Le0x; 1
      // 0c0: invokevirtual e0x.p1r ()Lp3y;
      // 0c3: astore 9
      // 0c5: aload 9
      // 0c7: getstatic p3y.six Lp3y;
      // 0ca: iload 4
      // 0cc: ifne 128
      // 0cf: if_acmpne 123
      // 0d2: goto 0d9
      // 0d5: invokestatic ayg.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 8
      // 0db: getstatic hmv.nfg L_ku;
      // 0de: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e3: checkcast java/lang/Integer
      // 0e6: invokevirtual java/lang/Integer.intValue ()I
      // 0e9: iload 4
      // 0eb: ifne 10c
      // 0ee: goto 0f5
      // 0f1: invokestatic ayg.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: ifne 123
      // 0f8: goto 0ff
      // 0fb: invokestatic ayg.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 2
      // 100: aload 7
      // 102: invokevirtual t9d.i6x (Lmew;)Z
      // 105: goto 10c
      // 108: invokestatic ayg.a (Loov;)Loov;
      // 10b: athrow
      // 10c: pop
      // 10d: aload 3
      // 10e: getstatic l9p.foo [L_ss;
      // 111: aload 0
      // 112: invokestatic u7m._lo (Lu7m;)I
      // 115: aaload
      // 116: invokevirtual ha9.aex (L_ss;)V
      // 119: aload 0
      // 11a: aload 1
      // 11b: aload 3
      // 11c: getstatic xbr.lqp Lu7m;
      // 11f: invokespecial ayg.ysm (Lerg;Lha9;Lu7m;)Lerg;
      // 122: areturn
      // 123: aload 9
      // 125: getstatic p3y.e1s Lp3y;
      // 128: if_acmpne 175
      // 12b: aload 8
      // 12d: getstatic hmv.nfg L_ku;
      // 130: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 135: checkcast java/lang/Integer
      // 138: invokevirtual java/lang/Integer.intValue ()I
      // 13b: iload 4
      // 13d: ifne 15e
      // 140: goto 147
      // 143: invokestatic ayg.a (Loov;)Loov;
      // 146: athrow
      // 147: ifne 175
      // 14a: goto 151
      // 14d: invokestatic ayg.a (Loov;)Loov;
      // 150: athrow
      // 151: aload 2
      // 152: aload 7
      // 154: invokevirtual t9d.i6x (Lmew;)Z
      // 157: goto 15e
      // 15a: invokestatic ayg.a (Loov;)Loov;
      // 15d: athrow
      // 15e: pop
      // 15f: aload 3
      // 160: getstatic l9p.foo [L_ss;
      // 163: aload 0
      // 164: invokestatic u7m._lo (Lu7m;)I
      // 167: aaload
      // 168: invokevirtual ha9.aex (L_ss;)V
      // 16b: aload 0
      // 16c: aload 1
      // 16d: aload 3
      // 16e: getstatic xbr.miu Lu7m;
      // 171: invokespecial ayg.ysm (Lerg;Lha9;Lu7m;)Lerg;
      // 174: areturn
      // 175: iload 4
      // 177: ifeq 211
      // 17a: aload 0
      // 17b: getfield ayg.ltl Le0x;
      // 17e: getstatic ox_.ibw Le0x;
      // 181: if_acmpne 19a
      // 184: goto 18b
      // 187: invokestatic ayg.a (Loov;)Loov;
      // 18a: athrow
      // 18b: new erg
      // 18e: dup
      // 18f: getstatic xbr.xxz Lu7m;
      // 192: invokespecial erg.<init> (Lu7m;)V
      // 195: areturn
      // 196: invokestatic ayg.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 7
      // 19c: aload 6
      // 19e: getfield akm.m_f Lvt2;
      // 1a1: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1a4: astore 8
      // 1a6: aload 3
      // 1a7: aload 8
      // 1a9: aload 6
      // 1ab: getfield akm.m_f Lvt2;
      // 1ae: aload 1
      // 1af: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 1b2: iload 4
      // 1b4: ifne 1ce
      // 1b7: ifne 1c7
      // 1ba: goto 1c1
      // 1bd: invokestatic ayg.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: aload 1
      // 1c2: areturn
      // 1c3: invokestatic ayg.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 0
      // 1c8: aload 2
      // 1c9: aload 8
      // 1cb: invokevirtual ayg.nf1 (Lt9d;Lmew;)Z
      // 1ce: iload 4
      // 1d0: ifne 1f7
      // 1d3: ifeq 211
      // 1d6: goto 1dd
      // 1d9: invokestatic ayg.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: aload 3
      // 1de: iload 4
      // 1e0: ifne 1fb
      // 1e3: goto 1ea
      // 1e6: invokestatic ayg.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: getfield ha9.lls Lpj2;
      // 1ed: getfield pj2.g40 Z
      // 1f0: goto 1f7
      // 1f3: invokestatic ayg.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: ifne 211
      // 1fa: aload 3
      // 1fb: getstatic l9p.foo [L_ss;
      // 1fe: aload 0
      // 1ff: invokestatic u7m._lo (Lu7m;)I
      // 202: aaload
      // 203: invokevirtual ha9.aex (L_ss;)V
      // 206: new erg
      // 209: dup
      // 20a: getstatic xbr.xxz Lu7m;
      // 20d: invokespecial erg.<init> (Lu7m;)V
      // 210: areturn
      // 211: aload 1
      // 212: areturn
   }

   private erg ysm(erg param1, ha9 param2, u7m param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: getfield ha9.lls Lpj2;
      // 09: getfield pj2.g40 Z
      // 0c: iload 4
      // 0e: ifeq 2c
      // 11: ifeq 21
      // 14: goto 1b
      // 17: invokestatic ayg.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: areturn
      // 1d: invokestatic ayg.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: dup
      // 23: getfield erg.qd2 I
      // 26: bipush 1
      // 27: isub
      // 28: dup_x1
      // 29: putfield erg.qd2 I
      // 2c: iload 4
      // 2e: ifeq 63
      // 31: ifgt 48
      // 34: goto 3b
      // 37: invokestatic ayg.a (Loov;)Loov;
      // 3a: athrow
      // 3b: new erg
      // 3e: dup
      // 3f: aload 3
      // 40: invokespecial erg.<init> (Lu7m;)V
      // 43: areturn
      // 44: invokestatic ayg.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 2
      // 49: iload 4
      // 4b: ifeq 67
      // 4e: getfield ha9.up_ Ljnq;
      // 51: new erg
      // 54: dup
      // 55: aload 3
      // 56: invokespecial erg.<init> (Lu7m;)V
      // 59: invokevirtual jnq.phd (Lerg;)Z
      // 5c: goto 63
      // 5f: invokestatic ayg.a (Loov;)Loov;
      // 62: athrow
      // 63: ifne 76
      // 66: aload 2
      // 67: new erg
      // 6a: dup
      // 6b: aload 3
      // 6c: bipush 1
      // 6d: bipush 0
      // 6e: invokespecial erg.<init> (Lu7m;II)V
      // 71: bipush 0
      // 72: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // 75: pop
      // 76: aload 1
      // 77: areturn
   }

   public boolean nf1(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ayg.a J
      // 003: ldc2_w 100695381926862
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield ayg.ltl Le0x;
      // 011: iload 5
      // 013: ifeq 033
      // 016: getstatic ox_.ibw Le0x;
      // 019: if_acmpne 029
      // 01c: goto 023
      // 01f: invokestatic ayg.a (Loov;)Loov;
      // 022: athrow
      // 023: bipush 0
      // 024: ireturn
      // 025: invokestatic ayg.a (Loov;)Loov;
      // 028: athrow
      // 029: aload 1
      // 02a: aload 2
      // 02b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 02e: invokeinterface zfz.r_y ()Le0x; 1
      // 033: invokevirtual e0x.p1r ()Lp3y;
      // 036: astore 6
      // 038: aload 6
      // 03a: invokevirtual p3y.gk6 ()Z
      // 03d: iload 5
      // 03f: ifeq 04d
      // 042: ifne 050
      // 045: goto 04c
      // 048: invokestatic ayg.a (Loov;)Loov;
      // 04b: athrow
      // 04c: bipush 1
      // 04d: goto 051
      // 050: bipush 0
      // 051: istore 7
      // 053: aload 1
      // 054: aload 2
      // 055: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 058: iload 5
      // 05a: ifeq 08c
      // 05d: ifne 085
      // 060: goto 067
      // 063: invokestatic ayg.a (Loov;)Loov;
      // 066: athrow
      // 067: iload 7
      // 069: iload 5
      // 06b: ifeq 08c
      // 06e: goto 075
      // 071: invokestatic ayg.a (Loov;)Loov;
      // 074: athrow
      // 075: ifne 085
      // 078: goto 07f
      // 07b: invokestatic ayg.a (Loov;)Loov;
      // 07e: athrow
      // 07f: bipush 0
      // 080: ireturn
      // 081: invokestatic ayg.a (Loov;)Loov;
      // 084: athrow
      // 085: aload 1
      // 086: getfield t9d.vzz Lupn;
      // 089: invokevirtual upn.yz2 ()Z
      // 08c: iload 5
      // 08e: ifeq 148
      // 091: ifeq 13d
      // 094: goto 09b
      // 097: invokestatic ayg.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield ayg.ltl Le0x;
      // 09f: getstatic ox_.whp L_13;
      // 0a2: if_acmpne 13d
      // 0a5: goto 0ac
      // 0a8: invokestatic ayg.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: aload 2
      // 0ad: invokevirtual mew.getX ()I
      // 0b0: istore 8
      // 0b2: aload 2
      // 0b3: invokevirtual mew.getY ()I
      // 0b6: istore 9
      // 0b8: aload 2
      // 0b9: invokevirtual mew.getZ ()I
      // 0bc: istore 10
      // 0be: aload 1
      // 0bf: iload 8
      // 0c1: i2f
      // 0c2: ldc 0.5
      // 0c4: nop
      // 0c5: fadd
      // 0c6: f2d
      // 0c7: iload 9
      // 0c9: i2f
      // 0ca: ldc 0.5
      // 0cc: nop
      // 0cd: fadd
      // 0ce: f2d
      // 0cf: iload 10
      // 0d1: i2f
      // 0d2: ldc 0.5
      // 0d4: nop
      // 0d5: fadd
      // 0d6: f2d
      // 0d7: getstatic ayg.b Ljava/lang/String;
      // 0da: nop
      // 0db: ldc 0.5
      // 0dd: nop
      // 0de: ldc 2.6
      // 0e0: nop
      // 0e1: aload 1
      // 0e2: getfield t9d.fsy Ljava/util/Random;
      // 0e5: invokevirtual java/util/Random.nextFloat ()F
      // 0e8: aload 1
      // 0e9: getfield t9d.fsy Ljava/util/Random;
      // 0ec: invokevirtual java/util/Random.nextFloat ()F
      // 0ef: fsub
      // 0f0: ldc 0.8
      // 0f2: nop
      // 0f3: fmul
      // 0f4: fadd
      // 0f5: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 0f8: bipush 0
      // 0f9: istore 11
      // 0fb: iload 11
      // 0fd: bipush 8
      // 0ff: if_icmpge 138
      // 102: aload 1
      // 103: getstatic w_0.vby Lw_0;
      // 106: iload 8
      // 108: i2d
      // 109: invokestatic java/lang/Math.random ()D
      // 10c: dadd
      // 10d: iload 9
      // 10f: i2d
      // 110: invokestatic java/lang/Math.random ()D
      // 113: dadd
      // 114: iload 10
      // 116: i2d
      // 117: invokestatic java/lang/Math.random ()D
      // 11a: dadd
      // 11b: dconst_0
      // 11c: dconst_0
      // 11d: dconst_0
      // 11e: bipush 0
      // 11f: newarray 10
      // 121: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 124: iinc 11 1
      // 127: iload 5
      // 129: ifeq 1a6
      // 12c: iload 5
      // 12e: ifne 0fb
      // 131: goto 138
      // 134: invokestatic ayg.a (Loov;)Loov;
      // 137: athrow
      // 138: iload 5
      // 13a: ifne 1a6
      // 13d: aload 1
      // 13e: getfield t9d.v0f Z
      // 141: goto 148
      // 144: invokestatic ayg.a (Loov;)Loov;
      // 147: athrow
      // 148: iload 5
      // 14a: ifeq 1a5
      // 14d: ifne 198
      // 150: goto 157
      // 153: invokestatic ayg.a (Loov;)Loov;
      // 156: athrow
      // 157: iload 7
      // 159: iload 5
      // 15b: ifeq 1a5
      // 15e: goto 165
      // 161: invokestatic ayg.a (Loov;)Loov;
      // 164: athrow
      // 165: ifeq 198
      // 168: goto 16f
      // 16b: invokestatic ayg.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 6
      // 171: invokevirtual p3y.l7j ()Z
      // 174: iload 5
      // 176: ifeq 1a5
      // 179: goto 180
      // 17c: invokestatic ayg.a (Loov;)Loov;
      // 17f: athrow
      // 180: ifne 198
      // 183: goto 18a
      // 186: invokestatic ayg.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 1
      // 18b: aload 2
      // 18c: bipush 1
      // 18d: invokevirtual t9d.yir (Lmew;Z)Z
      // 190: pop
      // 191: goto 198
      // 194: invokestatic ayg.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 1
      // 199: aload 2
      // 19a: aload 0
      // 19b: getfield ayg.ltl Le0x;
      // 19e: invokevirtual e0x.l4i ()Lzfz;
      // 1a1: bipush 3
      // 1a2: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 1a5: pop
      // 1a6: bipush 1
      // 1a7: ireturn
   }

   public e0x k1c() {
      return this.ltl;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3962622592047439069L, 5175156509280364262L, MethodHandles.lookup().lookupClass()).a(186828151924886L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 91378649154261L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("M\u001at\\pªËUh`¿ë3\u000føÚ".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      b = var6;
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
