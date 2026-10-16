import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rg_ extends cjm {
   public OpaquePredicate pkk;
   public int pl2;
   public double e61;
   private static final long a;
   private static final String b;

   public rg_(j37 var1, double var2) {
      this.usk = var1;
      this.pkk = var1.oay;
      this.e61 = var2;
      this.k23(3);
   }

   @Override
   public boolean vle() {
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
      // 05: getfield rg_.usk Lj37;
      // 08: iload 1
      // 09: ifne 2b
      // 0c: invokevirtual j37.j34 ()Z
      // 0f: ifne 1f
      // 12: goto 19
      // 15: invokestatic rg_.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic rg_.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 0
      // 21: invokespecial rg_.pqy ()Lj37;
      // 24: putfield rg_.hr8 Lj37;
      // 27: aload 0
      // 28: getfield rg_.hr8 Lj37;
      // 2b: ifnull 36
      // 2e: bipush 1
      // 2f: goto 37
      // 32: invokestatic rg_.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
   }

   @Override
   public boolean wh3() {
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
      // 05: getfield rg_.hr8 Lj37;
      // 08: invokevirtual j37.gzr ()Z
      // 0b: iload 1
      // 0c: ifeq 27
      // 0f: ifeq 5b
      // 12: goto 19
      // 15: invokestatic rg_.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield rg_.hr8 Lj37;
      // 1d: invokevirtual j37.j34 ()Z
      // 20: goto 27
      // 23: invokestatic rg_.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 1
      // 28: ifeq 40
      // 2b: ifeq 5b
      // 2e: goto 35
      // 31: invokestatic rg_.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield rg_.pl2 I
      // 39: goto 40
      // 3c: invokestatic rg_.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 1
      // 41: ifeq 58
      // 44: bipush 60
      // 46: if_icmpge 5b
      // 49: goto 50
      // 4c: invokestatic rg_.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 58
      // 54: invokestatic rg_.a (Loov;)Loov;
      // 57: athrow
      // 58: goto 5c
      // 5b: bipush 0
      // 5c: ireturn
   }

   @Override
   public void zly() {
      this.hr8 = null;
      this.pl2 = 0;
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rg_.usk Lj37;
      // 04: invokevirtual j37.ph8 ()Lknw;
      // 07: aload 0
      // 08: getfield rg_.hr8 Lj37;
      // 0b: ldc 10.0
      // 0d: nop
      // 0e: aload 0
      // 0f: getfield rg_.usk Lj37;
      // 12: invokevirtual j37.d1r ()I
      // 15: i2f
      // 16: invokevirtual knw.rz3 (Li2h;FF)V
      // 19: invokestatic OpaquePredicate.c ()I
      // 1c: aload 0
      // 1d: getfield rg_.usk Lj37;
      // 20: invokevirtual j37.zq2 ()Lp8a;
      // 23: aload 0
      // 24: getfield rg_.hr8 Lj37;
      // 27: aload 0
      // 28: getfield rg_.e61 D
      // 2b: invokevirtual p8a.p6m (Li2h;D)Z
      // 2e: pop
      // 2f: istore 1
      // 30: aload 0
      // 31: dup
      // 32: getfield rg_.pl2 I
      // 35: bipush 1
      // 36: iadd
      // 37: putfield rg_.pl2 I
      // 3a: aload 0
      // 3b: getfield rg_.pl2 I
      // 3e: iload 1
      // 3f: ifne 6f
      // 42: bipush 60
      // 44: if_icmplt 76
      // 47: goto 4e
      // 4a: invokestatic rg_.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: iload 1
      // 50: ifne 73
      // 53: goto 5a
      // 56: invokestatic rg_.a (Loov;)Loov;
      // 59: athrow
      // 5a: getfield rg_.usk Lj37;
      // 5d: aload 0
      // 5e: getfield rg_.hr8 Lj37;
      // 61: invokevirtual j37.wxg (Li2h;)D
      // 64: ldc2_w 9.0
      // 67: dcmpg
      // 68: goto 6f
      // 6b: invokestatic rg_.a (Loov;)Loov;
      // 6e: athrow
      // 6f: ifge 76
      // 72: aload 0
      // 73: invokespecial rg_.ljk ()V
      // 76: return
   }

   private j37 pqy() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 8.0
      // 02: nop
      // 03: fstore 2
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 0
      // 08: getfield rg_.pkk Lt9d;
      // 0b: aload 0
      // 0c: getfield rg_.usk Lj37;
      // 0f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 12: aload 0
      // 13: getfield rg_.usk Lj37;
      // 16: invokevirtual j37.aaw ()Lnh4;
      // 19: fload 2
      // 1a: f2d
      // 1b: fload 2
      // 1c: f2d
      // 1d: fload 2
      // 1e: f2d
      // 1f: invokevirtual nh4.c2h (DDD)Lnh4;
      // 22: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 25: astore 3
      // 26: istore 1
      // 27: ldc2_w 1.7976931348623157E308
      // 2a: dstore 4
      // 2c: aconst_null
      // 2d: astore 6
      // 2f: aload 3
      // 30: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 35: astore 7
      // 37: aload 7
      // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3e: ifeq a3
      // 41: aload 7
      // 43: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 48: checkcast j37
      // 4b: astore 8
      // 4d: aload 0
      // 4e: getfield rg_.usk Lj37;
      // 51: iload 1
      // 52: ifne a5
      // 55: aload 8
      // 57: invokevirtual j37.qj8 (Lj37;)Z
      // 5a: iload 1
      // 5b: ifne 8d
      // 5e: goto 65
      // 61: invokestatic rg_.a (Loov;)Loov;
      // 64: athrow
      // 65: ifeq 9f
      // 68: goto 6f
      // 6b: invokestatic rg_.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield rg_.usk Lj37;
      // 73: aload 8
      // 75: invokevirtual j37.wxg (Li2h;)D
      // 78: iload 1
      // 79: ifne 9d
      // 7c: goto 83
      // 7f: invokestatic rg_.a (Loov;)Loov;
      // 82: athrow
      // 83: dload 4
      // 85: dcmpg
      // 86: goto 8d
      // 89: invokestatic rg_.a (Loov;)Loov;
      // 8c: athrow
      // 8d: ifge 9f
      // 90: aload 8
      // 92: astore 6
      // 94: aload 0
      // 95: getfield rg_.usk Lj37;
      // 98: aload 8
      // 9a: invokevirtual j37.wxg (Li2h;)D
      // 9d: dstore 4
      // 9f: iload 1
      // a0: ifeq 37
      // a3: aload 6
      // a5: areturn
   }

   private void ljk() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rg_.a J
      // 003: ldc2_w 13151034966991
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield rg_.usk Lj37;
      // 010: aload 0
      // 011: getfield rg_.hr8 Lj37;
      // 014: invokevirtual j37.kv0 (Ldms;)Ldms;
      // 017: astore 4
      // 019: aload 4
      // 01b: ifnull 201
      // 01e: aload 0
      // 01f: getfield rg_.usk Lj37;
      // 022: invokevirtual j37.eu1 ()Lha9;
      // 025: astore 5
      // 027: aload 5
      // 029: iload 3
      // 02a: ifne 05e
      // 02d: ifnonnull 05c
      // 030: goto 037
      // 033: invokestatic rg_.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: getfield rg_.hr8 Lj37;
      // 03b: invokevirtual j37.eu1 ()Lha9;
      // 03e: iload 3
      // 03f: ifne 05e
      // 042: goto 049
      // 045: invokestatic rg_.a (Loov;)Loov;
      // 048: athrow
      // 049: ifnull 05c
      // 04c: goto 053
      // 04f: invokestatic rg_.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: getfield rg_.hr8 Lj37;
      // 057: invokevirtual j37.eu1 ()Lha9;
      // 05a: astore 5
      // 05c: aload 5
      // 05e: iload 3
      // 05f: ifne 06e
      // 062: ifnull 098
      // 065: goto 06c
      // 068: invokestatic rg_.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 5
      // 06e: getstatic l9p.w5c L_ss;
      // 071: invokevirtual ha9.aex (L_ss;)V
      // 074: aload 0
      // 075: getfield rg_.usk Lj37;
      // 078: instanceof sss
      // 07b: iload 3
      // 07c: ifne 0e7
      // 07f: ifeq 098
      // 082: goto 089
      // 085: invokestatic rg_.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 5
      // 08b: getstatic y8d.ldl Ll7l;
      // 08e: invokevirtual ha9.aex (L_ss;)V
      // 091: goto 098
      // 094: invokestatic rg_.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: getfield rg_.usk Lj37;
      // 09c: sipush 6000
      // 09f: invokevirtual j37.mr2 (I)V
      // 0a2: aload 0
      // 0a3: getfield rg_.hr8 Lj37;
      // 0a6: sipush 6000
      // 0a9: invokevirtual j37.mr2 (I)V
      // 0ac: aload 0
      // 0ad: getfield rg_.usk Lj37;
      // 0b0: invokevirtual j37.udq ()V
      // 0b3: aload 0
      // 0b4: getfield rg_.hr8 Lj37;
      // 0b7: invokevirtual j37.udq ()V
      // 0ba: aload 4
      // 0bc: sipush -24000
      // 0bf: invokevirtual dms.mr2 (I)V
      // 0c2: aload 4
      // 0c4: aload 0
      // 0c5: getfield rg_.usk Lj37;
      // 0c8: getfield j37.o2v D
      // 0cb: aload 0
      // 0cc: getfield rg_.usk Lj37;
      // 0cf: getfield j37.kfp D
      // 0d2: aload 0
      // 0d3: getfield rg_.usk Lj37;
      // 0d6: getfield j37.vbd D
      // 0d9: fconst_0
      // 0da: fconst_0
      // 0db: invokevirtual dms.x24 (DDDFF)V
      // 0de: aload 0
      // 0df: getfield rg_.pkk Lt9d;
      // 0e2: aload 4
      // 0e4: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 0e7: pop
      // 0e8: aload 0
      // 0e9: getfield rg_.usk Lj37;
      // 0ec: invokevirtual j37.mbr ()Ljava/util/Random;
      // 0ef: astore 6
      // 0f1: bipush 0
      // 0f2: istore 7
      // 0f4: iload 7
      // 0f6: bipush 7
      // 0f8: if_icmpge 1ad
      // 0fb: aload 6
      // 0fd: invokevirtual java/util/Random.nextGaussian ()D
      // 100: ldc2_w 0.02
      // 103: dmul
      // 104: dstore 8
      // 106: aload 6
      // 108: invokevirtual java/util/Random.nextGaussian ()D
      // 10b: ldc2_w 0.02
      // 10e: dmul
      // 10f: dstore 10
      // 111: aload 6
      // 113: invokevirtual java/util/Random.nextGaussian ()D
      // 116: ldc2_w 0.02
      // 119: dmul
      // 11a: dstore 12
      // 11c: aload 6
      // 11e: invokevirtual java/util/Random.nextDouble ()D
      // 121: aload 0
      // 122: getfield rg_.usk Lj37;
      // 125: getfield j37.uo6 F
      // 128: f2d
      // 129: dmul
      // 12a: ldc2_w 2.0
      // 12d: dmul
      // 12e: aload 0
      // 12f: getfield rg_.usk Lj37;
      // 132: getfield j37.uo6 F
      // 135: f2d
      // 136: dsub
      // 137: dstore 14
      // 139: ldc2_w 0.5
      // 13c: aload 6
      // 13e: invokevirtual java/util/Random.nextDouble ()D
      // 141: aload 0
      // 142: getfield rg_.usk Lj37;
      // 145: getfield j37.ikl F
      // 148: f2d
      // 149: dmul
      // 14a: dadd
      // 14b: dstore 16
      // 14d: aload 6
      // 14f: invokevirtual java/util/Random.nextDouble ()D
      // 152: aload 0
      // 153: getfield rg_.usk Lj37;
      // 156: getfield j37.uo6 F
      // 159: f2d
      // 15a: dmul
      // 15b: ldc2_w 2.0
      // 15e: dmul
      // 15f: aload 0
      // 160: getfield rg_.usk Lj37;
      // 163: getfield j37.uo6 F
      // 166: f2d
      // 167: dsub
      // 168: dstore 18
      // 16a: aload 0
      // 16b: getfield rg_.pkk Lt9d;
      // 16e: getstatic w_0.mwm Lw_0;
      // 171: aload 0
      // 172: getfield rg_.usk Lj37;
      // 175: getfield j37.o2v D
      // 178: dload 14
      // 17a: dadd
      // 17b: aload 0
      // 17c: getfield rg_.usk Lj37;
      // 17f: getfield j37.kfp D
      // 182: dload 16
      // 184: dadd
      // 185: aload 0
      // 186: getfield rg_.usk Lj37;
      // 189: getfield j37.vbd D
      // 18c: dload 18
      // 18e: dadd
      // 18f: dload 8
      // 191: dload 10
      // 193: dload 12
      // 195: bipush 0
      // 196: newarray 10
      // 198: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 19b: iinc 7 1
      // 19e: iload 3
      // 19f: ifne 201
      // 1a2: iload 3
      // 1a3: ifeq 0f4
      // 1a6: goto 1ad
      // 1a9: invokestatic rg_.a (Loov;)Loov;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: getfield rg_.pkk Lt9d;
      // 1b1: invokevirtual OpaquePredicate.eir ()Lef9;
      // 1b4: getstatic rg_.b Ljava/lang/String;
      // 1b7: nop
      // 1b8: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 1bb: iload 3
      // 1bc: ifne 200
      // 1bf: ifeq 201
      // 1c2: goto 1c9
      // 1c5: invokestatic rg_.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: getfield rg_.pkk Lt9d;
      // 1cd: new uno
      // 1d0: dup
      // 1d1: aload 0
      // 1d2: getfield rg_.pkk Lt9d;
      // 1d5: aload 0
      // 1d6: getfield rg_.usk Lj37;
      // 1d9: getfield j37.o2v D
      // 1dc: aload 0
      // 1dd: getfield rg_.usk Lj37;
      // 1e0: getfield j37.kfp D
      // 1e3: aload 0
      // 1e4: getfield rg_.usk Lj37;
      // 1e7: getfield j37.vbd D
      // 1ea: aload 6
      // 1ec: bipush 7
      // 1ee: invokevirtual java/util/Random.nextInt (I)I
      // 1f1: bipush 1
      // 1f2: iadd
      // 1f3: invokespecial uno.<init> (Lt9d;DDDI)V
      // 1f6: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 1f9: goto 200
      // 1fc: invokestatic rg_.a (Loov;)Loov;
      // 1ff: athrow
      // 200: pop
      // 201: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8492673580817596295L, 2916183656671113832L, MethodHandles.lookup().lookupClass()).a(243250896945517L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 66755266066971L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\bóêï\u000f_\u0010X0LËèØáaô".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static oov a(oov var0) {
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
}
