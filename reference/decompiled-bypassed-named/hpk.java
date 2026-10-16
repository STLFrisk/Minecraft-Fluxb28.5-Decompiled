import com.mojang.authlib.GameProfile;

public class hpk extends x0l {
   public hpk(OpaquePredicate var1, GameProfile var2) {
      super(var1, var2);
      this.nr7 = 0.0F;
      this.kvx = true;
      this.erh = 0.25F;
      this.y33 = 10.0;
   }

   @Override
   public boolean m1t(ofh var1, float var2) {
      return true;
   }

   @Override
   public void ltu(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.gid = var1;
      this.nxo = var3;
      this.e1l = var5;
      this.eos = (double)var7;
      this.v4y = (double)var8;
      this.di2 = var9;
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
      // 000: aload 0
      // 001: fconst_0
      // 002: putfield hpk.erh F
      // 005: aload 0
      // 006: invokespecial x0l.xx_ ()V
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: aload 0
      // 00d: aload 0
      // 00e: getfield hpk.zzf F
      // 011: putfield hpk.p1w F
      // 014: istore 1
      // 015: aload 0
      // 016: getfield hpk.o2v D
      // 019: aload 0
      // 01a: getfield hpk.bc1 D
      // 01d: dsub
      // 01e: dstore 2
      // 01f: aload 0
      // 020: getfield hpk.vbd D
      // 023: aload 0
      // 024: getfield hpk.a4d D
      // 027: dsub
      // 028: dstore 4
      // 02a: dload 2
      // 02b: dload 2
      // 02c: dmul
      // 02d: dload 4
      // 02f: dload 4
      // 031: dmul
      // 032: dadd
      // 033: invokestatic fe6.dii (D)F
      // 036: ldc 4.0
      // 038: nop
      // 039: fmul
      // 03a: fstore 6
      // 03c: fload 6
      // 03e: fconst_1
      // 03f: fcmpl
      // 040: iload 1
      // 041: ifeq 076
      // 044: ifle 051
      // 047: goto 04e
      // 04a: invokestatic hpk.b (Loov;)Loov;
      // 04d: athrow
      // 04e: fconst_1
      // 04f: fstore 6
      // 051: aload 0
      // 052: dup
      // 053: getfield hpk.zzf F
      // 056: fload 6
      // 058: aload 0
      // 059: getfield hpk.zzf F
      // 05c: fsub
      // 05d: ldc 0.4
      // 05f: nop
      // 060: fmul
      // 061: fadd
      // 062: putfield hpk.zzf F
      // 065: aload 0
      // 066: dup
      // 067: getfield hpk.pcb F
      // 06a: aload 0
      // 06b: getfield hpk.zzf F
      // 06e: fadd
      // 06f: putfield hpk.pcb F
      // 072: aload 0
      // 073: getfield hpk.b9o Z
      // 076: iload 1
      // 077: ifeq 103
      // 07a: ifne 0f8
      // 07d: goto 084
      // 080: invokestatic hpk.b (Loov;)Loov;
      // 083: athrow
      // 084: aload 0
      // 085: invokevirtual hpk.mwq ()Z
      // 088: iload 1
      // 089: ifeq 103
      // 08c: goto 093
      // 08f: invokestatic hpk.b (Loov;)Loov;
      // 092: athrow
      // 093: ifeq 0f8
      // 096: goto 09d
      // 099: invokestatic hpk.b (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 0
      // 09e: iload 1
      // 09f: ifeq 100
      // 0a2: goto 0a9
      // 0a5: invokestatic hpk.b (Loov;)Loov;
      // 0a8: athrow
      // 0a9: getfield hpk.up_ Ljnq;
      // 0ac: getfield jnq.c41 [Lerg;
      // 0af: aload 0
      // 0b0: getfield hpk.up_ Ljnq;
      // 0b3: getfield jnq.nb5 I
      // 0b6: aaload
      // 0b7: ifnull 0f8
      // 0ba: goto 0c1
      // 0bd: invokestatic hpk.b (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield hpk.up_ Ljnq;
      // 0c5: getfield jnq.c41 [Lerg;
      // 0c8: aload 0
      // 0c9: getfield hpk.up_ Ljnq;
      // 0cc: getfield jnq.nb5 I
      // 0cf: aaload
      // 0d0: astore 7
      // 0d2: aload 0
      // 0d3: aload 0
      // 0d4: getfield hpk.up_ Ljnq;
      // 0d7: getfield jnq.c41 [Lerg;
      // 0da: aload 0
      // 0db: getfield hpk.up_ Ljnq;
      // 0de: getfield jnq.nb5 I
      // 0e1: aaload
      // 0e2: aload 7
      // 0e4: invokevirtual erg.gn1 ()Lu7m;
      // 0e7: aload 7
      // 0e9: invokevirtual u7m.hdm (Lerg;)I
      // 0ec: invokevirtual hpk.qez (Lerg;I)V
      // 0ef: aload 0
      // 0f0: bipush 1
      // 0f1: putfield hpk.b9o Z
      // 0f4: iload 1
      // 0f5: ifne 13a
      // 0f8: aload 0
      // 0f9: goto 100
      // 0fc: invokestatic hpk.b (Loov;)Loov;
      // 0ff: athrow
      // 100: getfield hpk.b9o Z
      // 103: iload 1
      // 104: ifeq 127
      // 107: ifeq 13a
      // 10a: goto 111
      // 10d: invokestatic hpk.b (Loov;)Loov;
      // 110: athrow
      // 111: aload 0
      // 112: iload 1
      // 113: ifeq 136
      // 116: goto 11d
      // 119: invokestatic hpk.b (Loov;)Loov;
      // 11c: athrow
      // 11d: invokevirtual hpk.mwq ()Z
      // 120: goto 127
      // 123: invokestatic hpk.b (Loov;)Loov;
      // 126: athrow
      // 127: ifne 13a
      // 12a: aload 0
      // 12b: invokevirtual hpk.foa ()V
      // 12e: aload 0
      // 12f: goto 136
      // 132: invokestatic hpk.b (Loov;)Loov;
      // 135: athrow
      // 136: bipush 0
      // 137: putfield hpk.b9o Z
      // 13a: return
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 0fd
      // 009: getfield hpk.di2 I
      // 00c: ifle 0f0
      // 00f: goto 016
      // 012: invokestatic hpk.b (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield hpk.o2v D
      // 01a: aload 0
      // 01b: getfield hpk.gid D
      // 01e: aload 0
      // 01f: getfield hpk.o2v D
      // 022: dsub
      // 023: aload 0
      // 024: getfield hpk.di2 I
      // 027: i2d
      // 028: ddiv
      // 029: dadd
      // 02a: dstore 2
      // 02b: aload 0
      // 02c: getfield hpk.kfp D
      // 02f: aload 0
      // 030: getfield hpk.nxo D
      // 033: aload 0
      // 034: getfield hpk.kfp D
      // 037: dsub
      // 038: aload 0
      // 039: getfield hpk.di2 I
      // 03c: i2d
      // 03d: ddiv
      // 03e: dadd
      // 03f: dstore 4
      // 041: aload 0
      // 042: getfield hpk.vbd D
      // 045: aload 0
      // 046: getfield hpk.e1l D
      // 049: aload 0
      // 04a: getfield hpk.vbd D
      // 04d: dsub
      // 04e: aload 0
      // 04f: getfield hpk.di2 I
      // 052: i2d
      // 053: ddiv
      // 054: dadd
      // 055: dstore 6
      // 057: aload 0
      // 058: getfield hpk.eos D
      // 05b: aload 0
      // 05c: getfield hpk.x5k F
      // 05f: f2d
      // 060: dsub
      // 061: dstore 8
      // 063: dload 8
      // 065: ldc2_w -180.0
      // 068: dcmpg
      // 069: ifge 083
      // 06c: dload 8
      // 06e: ldc2_w 360.0
      // 071: dadd
      // 072: dstore 8
      // 074: iload 1
      // 075: ifne 0e4
      // 078: iload 1
      // 079: ifeq 063
      // 07c: goto 083
      // 07f: invokestatic hpk.b (Loov;)Loov;
      // 082: athrow
      // 083: dload 8
      // 085: ldc2_w 180.0
      // 088: dcmpl
      // 089: iflt 0a3
      // 08c: dload 8
      // 08e: ldc2_w 360.0
      // 091: dsub
      // 092: dstore 8
      // 094: iload 1
      // 095: ifne 0e4
      // 098: iload 1
      // 099: ifeq 083
      // 09c: goto 0a3
      // 09f: invokestatic hpk.b (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: aload 0
      // 0a5: getfield hpk.x5k F
      // 0a8: f2d
      // 0a9: dload 8
      // 0ab: aload 0
      // 0ac: getfield hpk.di2 I
      // 0af: i2d
      // 0b0: ddiv
      // 0b1: dadd
      // 0b2: d2f
      // 0b3: putfield hpk.x5k F
      // 0b6: aload 0
      // 0b7: aload 0
      // 0b8: getfield hpk.y2i F
      // 0bb: f2d
      // 0bc: aload 0
      // 0bd: getfield hpk.v4y D
      // 0c0: aload 0
      // 0c1: getfield hpk.y2i F
      // 0c4: f2d
      // 0c5: dsub
      // 0c6: aload 0
      // 0c7: getfield hpk.di2 I
      // 0ca: i2d
      // 0cb: ddiv
      // 0cc: dadd
      // 0cd: d2f
      // 0ce: putfield hpk.y2i F
      // 0d1: aload 0
      // 0d2: dup
      // 0d3: getfield hpk.di2 I
      // 0d6: bipush 1
      // 0d7: isub
      // 0d8: putfield hpk.di2 I
      // 0db: aload 0
      // 0dc: dload 2
      // 0dd: dload 4
      // 0df: dload 6
      // 0e1: invokevirtual hpk.m6_ (DDD)V
      // 0e4: aload 0
      // 0e5: aload 0
      // 0e6: getfield hpk.x5k F
      // 0e9: aload 0
      // 0ea: getfield hpk.y2i F
      // 0ed: invokevirtual hpk.iym (FF)V
      // 0f0: aload 0
      // 0f1: aload 0
      // 0f2: getfield hpk.tfv F
      // 0f5: putfield hpk.igu F
      // 0f8: aload 0
      // 0f9: invokevirtual hpk.inv ()V
      // 0fc: aload 0
      // 0fd: getfield hpk.icv D
      // 100: aload 0
      // 101: getfield hpk.icv D
      // 104: dmul
      // 105: aload 0
      // 106: getfield hpk.bw4 D
      // 109: aload 0
      // 10a: getfield hpk.bw4 D
      // 10d: dmul
      // 10e: dadd
      // 10f: invokestatic fe6.dii (D)F
      // 112: fstore 2
      // 113: aload 0
      // 114: getfield hpk.mop D
      // 117: dneg
      // 118: ldc2_w 0.20000000298023224
      // 11b: dmul
      // 11c: invokestatic java/lang/Math.atan (D)D
      // 11f: d2f
      // 120: ldc 15.0
      // 122: nop
      // 123: fmul
      // 124: fstore 3
      // 125: fload 2
      // 126: ldc 0.1
      // 128: nop
      // 129: fcmpl
      // 12a: iload 1
      // 12b: ifne 140
      // 12e: ifle 13c
      // 131: goto 138
      // 134: invokestatic hpk.b (Loov;)Loov;
      // 137: athrow
      // 138: ldc 0.1
      // 13a: nop
      // 13b: fstore 2
      // 13c: aload 0
      // 13d: getfield hpk.lfk Z
      // 140: iload 1
      // 141: ifne 15b
      // 144: ifeq 169
      // 147: goto 14e
      // 14a: invokestatic hpk.b (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 0
      // 14f: invokevirtual hpk.i55 ()F
      // 152: fconst_0
      // 153: fcmpg
      // 154: goto 15b
      // 157: invokestatic hpk.b (Loov;)Loov;
      // 15a: athrow
      // 15b: iload 1
      // 15c: ifne 16f
      // 15f: ifgt 16b
      // 162: goto 169
      // 165: invokestatic hpk.b (Loov;)Loov;
      // 168: athrow
      // 169: fconst_0
      // 16a: fstore 2
      // 16b: aload 0
      // 16c: getfield hpk.lfk Z
      // 16f: iload 1
      // 170: ifne 195
      // 173: ifne 198
      // 176: goto 17d
      // 179: invokestatic hpk.b (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 0
      // 17e: iload 1
      // 17f: ifne 1ae
      // 182: goto 189
      // 185: invokestatic hpk.b (Loov;)Loov;
      // 188: athrow
      // 189: invokevirtual hpk.i55 ()F
      // 18c: fconst_0
      // 18d: fcmpg
      // 18e: goto 195
      // 191: invokestatic hpk.b (Loov;)Loov;
      // 194: athrow
      // 195: ifgt 19a
      // 198: fconst_0
      // 199: fstore 3
      // 19a: aload 0
      // 19b: dup
      // 19c: getfield hpk.tfv F
      // 19f: fload 2
      // 1a0: aload 0
      // 1a1: getfield hpk.tfv F
      // 1a4: fsub
      // 1a5: ldc 0.4
      // 1a7: nop
      // 1a8: fmul
      // 1a9: fadd
      // 1aa: putfield hpk.tfv F
      // 1ad: aload 0
      // 1ae: dup
      // 1af: getfield hpk.sep F
      // 1b2: fload 3
      // 1b3: aload 0
      // 1b4: getfield hpk.sep F
      // 1b7: fsub
      // 1b8: ldc 0.8
      // 1ba: nop
      // 1bb: fmul
      // 1bc: fadd
      // 1bd: putfield hpk.sep F
      // 1c0: return
   }

   @Override
   public void fga(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: ifne 23
      // 08: aload 0
      // 09: getfield hpk.up_ Ljnq;
      // 0c: getfield jnq.c41 [Lerg;
      // 0f: aload 0
      // 10: getfield hpk.up_ Ljnq;
      // 13: getfield jnq.nb5 I
      // 16: aload 2
      // 17: aastore
      // 18: iload 3
      // 19: ifne 36
      // 1c: goto 23
      // 1f: invokestatic hpk.b (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield hpk.up_ Ljnq;
      // 27: getfield jnq._dn [Lerg;
      // 2a: iload 1
      // 2b: bipush 1
      // 2c: isub
      // 2d: aload 2
      // 2e: aastore
      // 2f: goto 36
      // 32: invokestatic hpk.b (Loov;)Loov;
      // 35: athrow
      // 36: return
   }

   @Override
   public void a0d(ekw var1) {
      Minecraft.vz1().t43.lcg().obg(var1);
   }

   @Override
   public boolean ge4(int var1, String var2) {
      return false;
   }

   @Override
   public mew d3d() {
      return new mew(this.o2v + 0.5, this.kfp + 0.5, this.vbd + 0.5);
   }

   private static oov b(oov var0) {
      return var0;
   }
}
