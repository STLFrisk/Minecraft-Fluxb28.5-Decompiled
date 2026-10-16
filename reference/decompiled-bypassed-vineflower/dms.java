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

public abstract class dms extends laq {
   public int mp6;
   public int qv8;
   public int j78;
   private static final long d;
   private static final String[] s;
   private static final String[] t;
   private static final Map u = new HashMap(13);

   public dms(t9d var1) {
      super(var1);
   }

   public abstract dms kv0(dms var1);

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
      // 00c: aload 3
      // 00d: iload 2
      // 00e: ifeq 01c
      // 011: ifnull 134
      // 014: goto 01b
      // 017: invokestatic dms.b (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 3
      // 01c: invokevirtual erg.gn1 ()Lu7m;
      // 01f: getstatic xbr.pb_ Lu7m;
      // 022: if_acmpne 134
      // 025: aload 0
      // 026: getfield dms.oay Lt9d;
      // 029: getfield t9d.v0f Z
      // 02c: iload 2
      // 02d: ifeq 133
      // 030: goto 037
      // 033: invokestatic dms.b (Loov;)Loov;
      // 036: athrow
      // 037: ifne 132
      // 03a: goto 041
      // 03d: invokestatic dms.b (Loov;)Loov;
      // 040: athrow
      // 041: aload 3
      // 042: invokevirtual erg.j6_ ()I
      // 045: iload 2
      // 046: ifeq 133
      // 049: goto 050
      // 04c: invokestatic dms.b (Loov;)Loov;
      // 04f: athrow
      // 050: invokestatic y65.p1u (I)Ljava/lang/Class;
      // 053: astore 4
      // 055: aload 4
      // 057: ifnull 132
      // 05a: aload 0
      // 05b: iload 2
      // 05c: ifeq 081
      // 05f: goto 066
      // 062: invokestatic dms.b (Loov;)Loov;
      // 065: athrow
      // 066: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 069: aload 4
      // 06b: if_acmpne 132
      // 06e: goto 075
      // 071: invokestatic dms.b (Loov;)Loov;
      // 074: athrow
      // 075: aload 0
      // 076: aload 0
      // 077: invokevirtual dms.kv0 (Ldms;)Ldms;
      // 07a: goto 081
      // 07d: invokestatic dms.b (Loov;)Loov;
      // 080: athrow
      // 081: astore 5
      // 083: aload 5
      // 085: iload 2
      // 086: ifeq 0b6
      // 089: ifnull 132
      // 08c: goto 093
      // 08f: invokestatic dms.b (Loov;)Loov;
      // 092: athrow
      // 093: aload 5
      // 095: sipush -24000
      // 098: invokevirtual dms.mr2 (I)V
      // 09b: aload 5
      // 09d: aload 0
      // 09e: getfield dms.o2v D
      // 0a1: aload 0
      // 0a2: getfield dms.kfp D
      // 0a5: aload 0
      // 0a6: getfield dms.vbd D
      // 0a9: fconst_0
      // 0aa: fconst_0
      // 0ab: invokevirtual dms.x24 (DDDFF)V
      // 0ae: aload 0
      // 0af: goto 0b6
      // 0b2: invokestatic dms.b (Loov;)Loov;
      // 0b5: athrow
      // 0b6: getfield dms.oay Lt9d;
      // 0b9: aload 5
      // 0bb: invokevirtual t9d.xzq (Li2h;)Z
      // 0be: pop
      // 0bf: aload 3
      // 0c0: invokevirtual erg.x4w ()Z
      // 0c3: iload 2
      // 0c4: ifeq 0e8
      // 0c7: ifeq 0e1
      // 0ca: goto 0d1
      // 0cd: invokestatic dms.b (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 5
      // 0d3: aload 3
      // 0d4: invokevirtual erg.zow ()Ljava/lang/String;
      // 0d7: invokevirtual dms.x84 (Ljava/lang/String;)V
      // 0da: goto 0e1
      // 0dd: invokestatic dms.b (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 1
      // 0e2: getfield ha9.lls Lpj2;
      // 0e5: getfield pj2.g40 Z
      // 0e8: iload 2
      // 0e9: ifeq 133
      // 0ec: ifne 132
      // 0ef: goto 0f6
      // 0f2: invokestatic dms.b (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 3
      // 0f7: dup
      // 0f8: getfield erg.qd2 I
      // 0fb: bipush 1
      // 0fc: isub
      // 0fd: putfield erg.qd2 I
      // 100: aload 3
      // 101: getfield erg.qd2 I
      // 104: iload 2
      // 105: ifeq 133
      // 108: goto 10f
      // 10b: invokestatic dms.b (Loov;)Loov;
      // 10e: athrow
      // 10f: ifgt 132
      // 112: goto 119
      // 115: invokestatic dms.b (Loov;)Loov;
      // 118: athrow
      // 119: aload 1
      // 11a: getfield ha9.up_ Ljnq;
      // 11d: aload 1
      // 11e: getfield ha9.up_ Ljnq;
      // 121: getfield jnq.nb5 I
      // 124: aconst_null
      // 125: checkcast erg
      // 128: invokevirtual jnq.cxl (ILerg;)V
      // 12b: goto 132
      // 12e: invokestatic dms.b (Loov;)Loov;
      // 131: athrow
      // 132: bipush 1
      // 133: ireturn
      // 134: bipush 0
      // 135: ireturn
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(12, (byte)0);
   }

   public int ktm() {
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
      // 06: ifne 2a
      // 09: getfield dms.oay Lt9d;
      // 0c: getfield t9d.v0f Z
      // 0f: ifeq 29
      // 12: goto 19
      // 15: invokestatic dms.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield dms.oit Lwl1;
      // 1d: bipush 12
      // 1f: invokevirtual wl1.miz (I)B
      // 22: goto 2d
      // 25: invokestatic dms.b (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield dms.mp6 I
      // 2d: ireturn
   }

   public void uj6(int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual dms.ktm ()I
      // 04: istore 4
      // 06: iload 4
      // 08: istore 5
      // 0a: invokestatic t9d.b ()I
      // 0d: iload 4
      // 0f: iload 1
      // 10: bipush 20
      // 12: imul
      // 13: iadd
      // 14: istore 4
      // 16: istore 3
      // 17: iload 4
      // 19: iload 3
      // 1a: ifeq 4a
      // 1d: ifle 45
      // 20: goto 27
      // 23: invokestatic dms.b (Loov;)Loov;
      // 26: athrow
      // 27: bipush 0
      // 28: istore 4
      // 2a: iload 5
      // 2c: iload 3
      // 2d: ifeq 4a
      // 30: ifge 45
      // 33: goto 3a
      // 36: invokestatic dms.b (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: invokevirtual dms.qkm ()V
      // 3e: goto 45
      // 41: invokestatic dms.b (Loov;)Loov;
      // 44: athrow
      // 45: iload 4
      // 47: iload 5
      // 49: isub
      // 4a: istore 6
      // 4c: aload 0
      // 4d: iload 4
      // 4f: invokevirtual dms.mr2 (I)V
      // 52: iload 2
      // 53: iload 3
      // 54: ifeq a1
      // 57: ifeq 92
      // 5a: goto 61
      // 5d: invokestatic dms.b (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: dup
      // 63: getfield dms.qv8 I
      // 66: iload 6
      // 68: iadd
      // 69: putfield dms.qv8 I
      // 6c: aload 0
      // 6d: getfield dms.j78 I
      // 70: iload 3
      // 71: ifeq a1
      // 74: goto 7b
      // 77: invokestatic dms.b (Loov;)Loov;
      // 7a: athrow
      // 7b: ifne 92
      // 7e: goto 85
      // 81: invokestatic dms.b (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: bipush 40
      // 88: putfield dms.j78 I
      // 8b: goto 92
      // 8e: invokestatic dms.b (Loov;)Loov;
      // 91: athrow
      // 92: aload 0
      // 93: iload 3
      // 94: ifeq a5
      // 97: invokevirtual dms.ktm ()I
      // 9a: goto a1
      // 9d: invokestatic dms.b (Loov;)Loov;
      // a0: athrow
      // a1: ifne ac
      // a4: aload 0
      // a5: aload 0
      // a6: getfield dms.qv8 I
      // a9: invokevirtual dms.mr2 (I)V
      // ac: return
   }

   public void z23(int var1) {
      this.uj6(var1, false);
   }

   public void mr2(int var1) {
      this.oit.c66(12, (byte)fe6.faa(var1, -1, 1));
      this.mp6 = var1;
      this.c_k(this.ejl());
   }

   @Override
   public void srs(bdo var1) {
      long var2 = d ^ 132878694864621L;
      super.srs(var1);
      var1.iin(d<"t">(31795, 8351966098176831741L ^ var2), this.ktm());
      var1.iin(d<"t">(27945, 6340325934376477158L ^ var2), this.qv8);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = d ^ 15893496642118L;
      super.cjb(var1);
      this.mr2(var1.uz7(d<"t">(10561, 2671918831039138086L ^ var2)));
      this.qv8 = var1.uz7(d<"t">(15747, 1427296255535963621L ^ var2));
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokespecial laq.e_a ()V
      // 008: aload 0
      // 009: getfield dms.oay Lt9d;
      // 00c: getfield t9d.v0f Z
      // 00f: iload 1
      // 010: ifne 0d3
      // 013: ifeq 0c8
      // 016: goto 01d
      // 019: invokestatic dms.b (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: iload 1
      // 01f: ifne 0bd
      // 022: goto 029
      // 025: invokestatic dms.b (Loov;)Loov;
      // 028: athrow
      // 029: getfield dms.j78 I
      // 02c: ifle 0bc
      // 02f: goto 036
      // 032: invokestatic dms.b (Loov;)Loov;
      // 035: athrow
      // 036: aload 0
      // 037: iload 1
      // 038: ifne 0b3
      // 03b: goto 042
      // 03e: invokestatic dms.b (Loov;)Loov;
      // 041: athrow
      // 042: getfield dms.j78 I
      // 045: bipush 4
      // 046: irem
      // 047: ifne 0b2
      // 04a: goto 051
      // 04d: invokestatic dms.b (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: getfield dms.oay Lt9d;
      // 055: getstatic w_0.z1q Lw_0;
      // 058: aload 0
      // 059: getfield dms.o2v D
      // 05c: aload 0
      // 05d: getfield dms.z2d Ljava/util/Random;
      // 060: invokevirtual java/util/Random.nextFloat ()F
      // 063: aload 0
      // 064: getfield dms.uo6 F
      // 067: fmul
      // 068: fconst_2
      // 069: fmul
      // 06a: f2d
      // 06b: dadd
      // 06c: aload 0
      // 06d: getfield dms.uo6 F
      // 070: f2d
      // 071: dsub
      // 072: aload 0
      // 073: getfield dms.kfp D
      // 076: ldc2_w 0.5
      // 079: dadd
      // 07a: aload 0
      // 07b: getfield dms.z2d Ljava/util/Random;
      // 07e: invokevirtual java/util/Random.nextFloat ()F
      // 081: aload 0
      // 082: getfield dms.ikl F
      // 085: fmul
      // 086: f2d
      // 087: dadd
      // 088: aload 0
      // 089: getfield dms.vbd D
      // 08c: aload 0
      // 08d: getfield dms.z2d Ljava/util/Random;
      // 090: invokevirtual java/util/Random.nextFloat ()F
      // 093: aload 0
      // 094: getfield dms.uo6 F
      // 097: fmul
      // 098: fconst_2
      // 099: fmul
      // 09a: f2d
      // 09b: dadd
      // 09c: aload 0
      // 09d: getfield dms.uo6 F
      // 0a0: f2d
      // 0a1: dsub
      // 0a2: dconst_0
      // 0a3: dconst_0
      // 0a4: dconst_0
      // 0a5: bipush 0
      // 0a6: newarray 10
      // 0a8: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 0ab: goto 0b2
      // 0ae: invokestatic dms.b (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: dup
      // 0b4: getfield dms.j78 I
      // 0b7: bipush 1
      // 0b8: isub
      // 0b9: putfield dms.j78 I
      // 0bc: aload 0
      // 0bd: aload 0
      // 0be: invokevirtual dms.ejl ()Z
      // 0c1: invokevirtual dms.c_k (Z)V
      // 0c4: iload 1
      // 0c5: ifeq 12a
      // 0c8: aload 0
      // 0c9: invokevirtual dms.ktm ()I
      // 0cc: goto 0d3
      // 0cf: invokestatic dms.b (Loov;)Loov;
      // 0d2: athrow
      // 0d3: istore 2
      // 0d4: iload 2
      // 0d5: iload 1
      // 0d6: ifne 118
      // 0d9: ifge 110
      // 0dc: goto 0e3
      // 0df: invokestatic dms.b (Loov;)Loov;
      // 0e2: athrow
      // 0e3: iinc 2 1
      // 0e6: aload 0
      // 0e7: iload 2
      // 0e8: invokevirtual dms.mr2 (I)V
      // 0eb: iload 1
      // 0ec: ifne 10c
      // 0ef: goto 0f6
      // 0f2: invokestatic dms.b (Loov;)Loov;
      // 0f5: athrow
      // 0f6: iload 2
      // 0f7: ifne 12a
      // 0fa: goto 101
      // 0fd: invokestatic dms.b (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: invokevirtual dms.qkm ()V
      // 105: goto 10c
      // 108: invokestatic dms.b (Loov;)Loov;
      // 10b: athrow
      // 10c: iload 1
      // 10d: ifeq 12a
      // 110: iload 2
      // 111: goto 118
      // 114: invokestatic dms.b (Loov;)Loov;
      // 117: athrow
      // 118: ifle 12a
      // 11b: iinc 2 -1
      // 11e: aload 0
      // 11f: iload 2
      // 120: invokevirtual dms.mr2 (I)V
      // 123: goto 12a
      // 126: invokestatic dms.b (Loov;)Loov;
      // 129: athrow
      // 12a: return
   }

   public void qkm() {
   }

   @Override
   public boolean ejl() {
      int var1 = t9d.b();

      try {
         int var10000 = this.ktm();
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return (boolean)0;
   }

   public void c_k(boolean var1) {
      dms var10000;
      float var10001;
      label16: {
         try {
            var10000 = this;
            if (var1) {
               var10001 = 0.5F;
               break label16;
            }
         } catch (oov var2) {
            throw b(var2);
         }

         var10001 = 1.0F;
      }

      var10000.pcv(var10001);
   }

   @Override
   public final void yxc(float param1, float param2) {
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
      // 05: getfield dms.nf8 F
      // 08: fconst_0
      // 09: fcmpl
      // 0a: iload 3
      // 0b: ifne 19
      // 0e: ifle 1c
      // 11: goto 18
      // 14: invokestatic dms.b (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 1d
      // 1c: bipush 0
      // 1d: istore 4
      // 1f: aload 0
      // 20: fload 1
      // 21: putfield dms.nf8 F
      // 24: aload 0
      // 25: fload 2
      // 26: iload 3
      // 27: ifne 42
      // 2a: putfield dms.mav F
      // 2d: iload 4
      // 2f: ifne 45
      // 32: goto 39
      // 35: invokestatic dms.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: fconst_1
      // 3b: goto 42
      // 3e: invokestatic dms.b (Loov;)Loov;
      // 41: athrow
      // 42: invokevirtual dms.pcv (F)V
      // 45: return
   }

   public final void pcv(float var1) {
      super.yxc(this.nf8 * var1, this.mav * var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7042093923786800060L, 7051623855488268160L, MethodHandles.lookup().lookupClass()).a(72877130422157L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 139171482269673L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "Út7ù9\u0085`$Ôñ½\u000f\u00887~\u0089($\u009cÛÐë×b\u0010[{ÃvÀ\u0015\u0005\u0015J\u008b\u007f\u000fäú³9";
      int var8 = "Út7ù9\u0085`$Ôñ½\u000f\u00887~\u0089($\u009cÛÐë×b\u0010[{ÃvÀ\u0015\u0005\u0015J\u008b\u007f\u000fäú³9".length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = e(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     s = var9;
                     t = new String[4];
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

                  var6 = "B6ÝsÈË\u009d\u0087\u0092F\\F\"(ÎèËùA«^y:Ù\u009e#?¬\u00ad\u000b\u0090î\u0010'â+\u0005³ª\u0082ª¶0\u008cY\\gã\u0099";
                  var8 = "B6ÝsÈË\u009d\u0087\u0092F\\F\"(ÎèËùA«^y:Ù\u009e#?¬\u00ad\u000b\u0090î\u0010'â+\u0005³ª\u0082ª¶0\u008cY\\gã\u0099".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String e(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12449;
      if (t[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])u.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               u.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("dms", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = s[var5].getBytes("ISO-8859-1");
         t[var5] = e(((Cipher)var4[0]).doFinal(var9));
      }

      return t[var5];
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
         throw new RuntimeException("dms" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
