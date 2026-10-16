import java.util.List;

public class pis extends u7m {
   public static final int[] i2b = new int[]{
      1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320
   };

   public pis() {
      this.oml(true);
      this.rlr(0);
      this.qfy(uja.zlu);
   }

   @Override
   public String g56(erg var1) {
      int var2 = var1.j6_();
      return super.ayn() + "." + qvg.b7j(var2).lan();
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 9
      // 005: aload 2
      // 006: aload 4
      // 008: aload 5
      // 00a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 00d: aload 5
      // 00f: aload 1
      // 010: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 013: iload 9
      // 015: ifne 02c
      // 018: ifne 028
      // 01b: goto 022
      // 01e: invokestatic pis.a (Loov;)Loov;
      // 021: athrow
      // 022: bipush 0
      // 023: ireturn
      // 024: invokestatic pis.a (Loov;)Loov;
      // 027: athrow
      // 028: aload 1
      // 029: invokevirtual erg.j6_ ()I
      // 02c: invokestatic qvg.b7j (I)Lqvg;
      // 02f: astore 10
      // 031: aload 10
      // 033: getstatic qvg.ft3 Lqvg;
      // 036: iload 9
      // 038: ifne 094
      // 03b: if_acmpne 08f
      // 03e: goto 045
      // 041: invokestatic pis.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 1
      // 046: aload 3
      // 047: aload 4
      // 049: invokestatic pis.l5m (Lerg;Lt9d;Lmew;)Z
      // 04c: iload 9
      // 04e: ifne 15d
      // 051: goto 058
      // 054: invokestatic pis.a (Loov;)Loov;
      // 057: athrow
      // 058: ifeq 15c
      // 05b: goto 062
      // 05e: invokestatic pis.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 3
      // 063: getfield t9d.v0f Z
      // 066: iload 9
      // 068: ifne 08e
      // 06b: goto 072
      // 06e: invokestatic pis.a (Loov;)Loov;
      // 071: athrow
      // 072: ifne 08d
      // 075: goto 07c
      // 078: invokestatic pis.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 3
      // 07d: sipush 2005
      // 080: aload 4
      // 082: bipush 0
      // 083: invokevirtual t9d.qca (ILmew;I)V
      // 086: goto 08d
      // 089: invokestatic pis.a (Loov;)Loov;
      // 08c: athrow
      // 08d: bipush 1
      // 08e: ireturn
      // 08f: aload 10
      // 091: getstatic qvg._fk Lqvg;
      // 094: if_acmpne 15c
      // 097: aload 3
      // 098: aload 4
      // 09a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09d: astore 11
      // 09f: aload 11
      // 0a1: invokeinterface zfz.r_y ()Le0x; 1
      // 0a6: astore 12
      // 0a8: aload 12
      // 0aa: getstatic ox_.uom Le0x;
      // 0ad: if_acmpne 15c
      // 0b0: aload 11
      // 0b2: getstatic x54.ub7 Lzb_;
      // 0b5: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ba: getstatic x54$lti.jnw Lx54$lti;
      // 0bd: if_acmpne 15c
      // 0c0: goto 0c7
      // 0c3: invokestatic pis.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 5
      // 0c9: getstatic vt2.m3r Lvt2;
      // 0cc: iload 9
      // 0ce: ifne 0ed
      // 0d1: goto 0d8
      // 0d4: invokestatic pis.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: if_acmpne 0e8
      // 0db: goto 0e2
      // 0de: invokestatic pis.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: bipush 0
      // 0e3: ireturn
      // 0e4: invokestatic pis.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 5
      // 0ea: getstatic vt2.rf3 Lvt2;
      // 0ed: if_acmpne 0f6
      // 0f0: bipush 0
      // 0f1: ireturn
      // 0f2: invokestatic pis.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 4
      // 0f8: aload 5
      // 0fa: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0fd: astore 4
      // 0ff: aload 3
      // 100: aload 4
      // 102: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 105: iload 9
      // 107: ifne 15b
      // 10a: ifeq 15a
      // 10d: goto 114
      // 110: invokestatic pis.a (Loov;)Loov;
      // 113: athrow
      // 114: getstatic ox_.ox_ Le0x;
      // 117: aload 3
      // 118: aload 4
      // 11a: aload 5
      // 11c: fload 6
      // 11e: fload 7
      // 120: fload 8
      // 122: bipush 0
      // 123: aload 2
      // 124: invokevirtual e0x.qk_ (Lt9d;Lmew;Lvt2;FFFILg_3;)Lzfz;
      // 127: astore 13
      // 129: aload 3
      // 12a: aload 4
      // 12c: aload 13
      // 12e: bipush 2
      // 12f: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 132: pop
      // 133: aload 2
      // 134: getfield ha9.lls Lpj2;
      // 137: getfield pj2.g40 Z
      // 13a: iload 9
      // 13c: ifne 15b
      // 13f: ifne 15a
      // 142: goto 149
      // 145: invokestatic pis.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 1
      // 14a: dup
      // 14b: getfield erg.qd2 I
      // 14e: bipush 1
      // 14f: isub
      // 150: putfield erg.qd2 I
      // 153: goto 15a
      // 156: invokestatic pis.a (Loov;)Loov;
      // 159: athrow
      // 15a: bipush 1
      // 15b: ireturn
      // 15c: bipush 0
      // 15d: ireturn
   }

   public static boolean l5m(erg param0, t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09: astore 4
      // 0b: aload 4
      // 0d: invokeinterface zfz.r_y ()Le0x; 1
      // 12: instanceof jrp
      // 15: iload 3
      // 16: ifne ac
      // 19: ifeq ab
      // 1c: goto 23
      // 1f: invokestatic pis.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 4
      // 25: invokeinterface zfz.r_y ()Le0x; 1
      // 2a: checkcast jrp
      // 2d: astore 5
      // 2f: aload 5
      // 31: aload 1
      // 32: aload 2
      // 33: aload 4
      // 35: aload 1
      // 36: getfield t9d.v0f Z
      // 39: invokeinterface jrp.z3t (Lt9d;Lmew;Lzfz;Z)Z 5
      // 3e: iload 3
      // 3f: ifne ac
      // 42: ifeq ab
      // 45: goto 4c
      // 48: invokestatic pis.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 1
      // 4d: getfield t9d.v0f Z
      // 50: iload 3
      // 51: ifne aa
      // 54: goto 5b
      // 57: invokestatic pis.a (Loov;)Loov;
      // 5a: athrow
      // 5b: ifne a9
      // 5e: goto 65
      // 61: invokestatic pis.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 5
      // 67: aload 1
      // 68: aload 1
      // 69: getfield t9d.fsy Ljava/util/Random;
      // 6c: aload 2
      // 6d: aload 4
      // 6f: iload 3
      // 70: ifne 9a
      // 73: goto 7a
      // 76: invokestatic pis.a (Loov;)Loov;
      // 79: athrow
      // 7a: invokeinterface jrp.y4n (Lt9d;Ljava/util/Random;Lmew;Lzfz;)Z 5
      // 7f: ifeq 9f
      // 82: goto 89
      // 85: invokestatic pis.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 5
      // 8b: aload 1
      // 8c: aload 1
      // 8d: getfield t9d.fsy Ljava/util/Random;
      // 90: aload 2
      // 91: aload 4
      // 93: goto 9a
      // 96: invokestatic pis.a (Loov;)Loov;
      // 99: athrow
      // 9a: invokeinterface jrp.tu1 (Lt9d;Ljava/util/Random;Lmew;Lzfz;)V 5
      // 9f: aload 0
      // a0: dup
      // a1: getfield erg.qd2 I
      // a4: bipush 1
      // a5: isub
      // a6: putfield erg.qd2 I
      // a9: bipush 1
      // aa: ireturn
      // ab: bipush 0
      // ac: ireturn
   }

   public static void gig(t9d param0, mew param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 15
      // 09: ifne 16
      // 0c: goto 13
      // 0f: invokestatic pis.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 15
      // 15: istore 2
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1b: invokeinterface zfz.r_y ()Le0x; 1
      // 20: astore 4
      // 22: aload 4
      // 24: iload 3
      // 25: ifne 41
      // 28: invokevirtual e0x.p1r ()Lp3y;
      // 2b: getstatic p3y.cei Lp3y;
      // 2e: if_acmpeq b7
      // 31: goto 38
      // 34: invokestatic pis.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 4
      // 3a: goto 41
      // 3d: invokestatic pis.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: aload 1
      // 43: invokevirtual e0x.c7i (Lm5n;Lmew;)V
      // 46: bipush 0
      // 47: istore 5
      // 49: iload 5
      // 4b: iload 2
      // 4c: if_icmpge b7
      // 4f: getstatic pis.pq6 Ljava/util/Random;
      // 52: invokevirtual java/util/Random.nextGaussian ()D
      // 55: ldc2_w 0.02
      // 58: dmul
      // 59: dstore 6
      // 5b: getstatic pis.pq6 Ljava/util/Random;
      // 5e: invokevirtual java/util/Random.nextGaussian ()D
      // 61: ldc2_w 0.02
      // 64: dmul
      // 65: dstore 8
      // 67: getstatic pis.pq6 Ljava/util/Random;
      // 6a: invokevirtual java/util/Random.nextGaussian ()D
      // 6d: ldc2_w 0.02
      // 70: dmul
      // 71: dstore 10
      // 73: aload 0
      // 74: getstatic w_0.z1q Lw_0;
      // 77: aload 1
      // 78: invokevirtual mew.getX ()I
      // 7b: i2f
      // 7c: getstatic pis.pq6 Ljava/util/Random;
      // 7f: invokevirtual java/util/Random.nextFloat ()F
      // 82: fadd
      // 83: f2d
      // 84: aload 1
      // 85: invokevirtual mew.getY ()I
      // 88: i2d
      // 89: getstatic pis.pq6 Ljava/util/Random;
      // 8c: invokevirtual java/util/Random.nextFloat ()F
      // 8f: f2d
      // 90: aload 4
      // 92: invokevirtual e0x.vn4 ()D
      // 95: dmul
      // 96: dadd
      // 97: aload 1
      // 98: invokevirtual mew.getZ ()I
      // 9b: i2f
      // 9c: getstatic pis.pq6 Ljava/util/Random;
      // 9f: invokevirtual java/util/Random.nextFloat ()F
      // a2: fadd
      // a3: f2d
      // a4: dload 6
      // a6: dload 8
      // a8: dload 10
      // aa: bipush 0
      // ab: newarray 10
      // ad: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // b0: iinc 5 1
      // b3: iload 3
      // b4: ifeq 49
      // b7: return
   }

   @Override
   public boolean g1y(erg param1, ha9 param2, g_3 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: instanceof ia2
      // 09: iload 4
      // 0b: ifne 73
      // 0e: ifeq 72
      // 11: goto 18
      // 14: invokestatic pis.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 3
      // 19: checkcast ia2
      // 1c: astore 5
      // 1e: aload 1
      // 1f: invokevirtual erg.j6_ ()I
      // 22: invokestatic qvg.b7j (I)Lqvg;
      // 25: astore 6
      // 27: aload 5
      // 29: invokevirtual ia2.pv5 ()Z
      // 2c: iload 4
      // 2e: ifne 71
      // 31: ifne 70
      // 34: goto 3b
      // 37: invokestatic pis.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 5
      // 3d: iload 4
      // 3f: ifne 61
      // 42: goto 49
      // 45: invokestatic pis.a (Loov;)Loov;
      // 48: athrow
      // 49: invokevirtual ia2.g2i ()Lqvg;
      // 4c: aload 6
      // 4e: if_acmpeq 70
      // 51: goto 58
      // 54: invokestatic pis.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 5
      // 5a: goto 61
      // 5d: invokestatic pis.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 6
      // 63: invokevirtual ia2.eex (Lqvg;)V
      // 66: aload 1
      // 67: dup
      // 68: getfield erg.qd2 I
      // 6b: bipush 1
      // 6c: isub
      // 6d: putfield erg.qd2 I
      // 70: bipush 1
      // 71: ireturn
      // 72: bipush 0
      // 73: ireturn
   }

   @Override
   public void jlj(u7m var1, uja var2, List var3) {
      int var4 = t9d.b();
      int var5 = 0;

      while (var5 < 16) {
         var3.add(new erg(var1, 1, var5));
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
