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
import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;

public class glq extends j1s {
   public boolean eww;
   public static q6h g2b;
   public static q6h xh_;
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public glq() {
      long var1 = a ^ 75636038406077L;
      super(a<"p">(29514, 2167905736602400084L ^ var1), a<"p">(7707, 2756323733498583047L ^ var1));
   }

   @jev
   public void oux(fha param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic glq.a J
      // 03: ldc2_w 29315550879264
      // 06: lxor
      // 07: lstore 2
      // 08: new eka
      // 0b: dup
      // 0c: aload 0
      // 0d: getfield glq.wyl Lc05;
      // 10: invokespecial eka.<init> (Lc05;)V
      // 13: astore 5
      // 15: invokestatic t9d.c ()I
      // 18: ldc2_w 5000
      // 1b: getstatic glq.xh_ Lq6h;
      // 1e: invokevirtual q6h.r2f ()J
      // 21: ladd
      // 22: invokestatic java/lang/System.currentTimeMillis ()J
      // 25: lsub
      // 26: lstore 6
      // 28: istore 4
      // 2a: new java/lang/StringBuilder
      // 2d: dup
      // 2e: invokespecial java/lang/StringBuilder.<init> ()V
      // 31: lload 6
      // 33: l2f
      // 34: ldc 100.0
      // 36: nop
      // 37: fdiv
      // 38: invokestatic java/lang/Math.round (F)I
      // 3b: i2f
      // 3c: ldc 10.0
      // 3e: nop
      // 3f: fdiv
      // 40: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 43: sipush 28663
      // 46: ldc2_w 3215605257002563703
      // 49: lload 2
      // 4a: lxor
      // 4b: invokedynamic p (IJ)Ljava/lang/String; bsm=glq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: nop
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: astore 8
      // 59: getstatic jsr.yk7 Lcyb;
      // 5c: aload 8
      // 5e: aload 5
      // 60: invokevirtual eka.x05 ()I
      // 63: i2f
      // 64: getstatic jsr.yk7 Lcyb;
      // 67: aload 8
      // 69: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 6c: fsub
      // 6d: fconst_2
      // 6e: fdiv
      // 6f: aload 5
      // 71: invokevirtual eka.lrx ()I
      // 74: i2f
      // 75: fconst_2
      // 76: fdiv
      // 77: ldc 20.0
      // 79: nop
      // 7a: fsub
      // 7b: lload 6
      // 7d: lconst_0
      // 7e: lcmp
      // 7f: iload 4
      // 81: ifne 9b
      // 84: ifle 9e
      // 87: goto 8e
      // 8a: invokestatic glq.a (Loov;)Loov;
      // 8d: athrow
      // 8e: getstatic z7e.a2_ Lz7e;
      // 91: getfield z7e.k0y I
      // 94: goto 9b
      // 97: invokestatic glq.a (Loov;)Loov;
      // 9a: athrow
      // 9b: goto a4
      // 9e: getstatic z7e.hd3 Lz7e;
      // a1: getfield z7e.k0y I
      // a4: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // a7: pop
      // a8: return
   }

   @jev
   public void sby(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual ihr.bbi ()Lmz2;
      // 08: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 0b: iload 2
      // 0c: ifne 24
      // 0f: ifeq 33
      // 12: goto 19
      // 15: invokestatic glq.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield glq.eww Z
      // 1d: goto 24
      // 20: invokestatic glq.a (Loov;)Loov;
      // 23: athrow
      // 24: ifne 33
      // 27: aload 1
      // 28: bipush 1
      // 29: invokevirtual ihr.wxi (Z)V
      // 2c: goto 33
      // 2f: invokestatic glq.a (Loov;)Loov;
      // 32: athrow
      // 33: return
   }

   @jev
   public void onl(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic glq.a J
      // 003: ldc2_w 61030127459527
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual wbh.nlg ()Lmz2;
      // 011: iload 4
      // 013: ifne 02e
      // 016: instanceof net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 019: ifeq 125
      // 01c: goto 023
      // 01f: invokestatic glq.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 1
      // 024: invokevirtual wbh.nlg ()Lmz2;
      // 027: goto 02e
      // 02a: invokestatic glq.a (Loov;)Loov;
      // 02d: athrow
      // 02e: checkcast net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 031: astore 5
      // 033: aload 5
      // 035: aload 0
      // 036: getfield glq.wyl Lc05;
      // 039: getfield c05.vg8 Ll86;
      // 03c: getfield l86.x5k F
      // 03f: invokevirtual net/minecraft/network/play/server/S08PacketPlayerPosLook.nqk (F)V
      // 042: aload 5
      // 044: aload 0
      // 045: getfield glq.wyl Lc05;
      // 048: getfield c05.vg8 Ll86;
      // 04b: getfield l86.y2i F
      // 04e: invokevirtual net/minecraft/network/play/server/S08PacketPlayerPosLook.yn2 (F)V
      // 051: aload 0
      // 052: getfield glq.eww Z
      // 055: iload 4
      // 057: ifne 0d3
      // 05a: ifne 0cf
      // 05d: goto 064
      // 060: invokestatic glq.a (Loov;)Loov;
      // 063: athrow
      // 064: getstatic glq.g2b Lq6h;
      // 067: iload 4
      // 069: ifne 0a9
      // 06c: goto 073
      // 06f: invokestatic glq.a (Loov;)Loov;
      // 072: athrow
      // 073: ldc2_w 4000.0
      // 076: invokevirtual q6h.hqu (D)Z
      // 079: ifeq 0b1
      // 07c: goto 083
      // 07f: invokestatic glq.a (Loov;)Loov;
      // 082: athrow
      // 083: sipush 6531
      // 086: ldc2_w 5246766811022724320
      // 089: lload 2
      // 08a: lxor
      // 08b: invokedynamic p (IJ)Ljava/lang/String; bsm=glq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: nop
      // 091: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 094: getstatic glq.xh_ Lq6h;
      // 097: invokevirtual q6h.u1k ()V
      // 09a: aload 0
      // 09b: bipush 1
      // 09c: putfield glq.eww Z
      // 09f: getstatic glq.g2b Lq6h;
      // 0a2: goto 0a9
      // 0a5: invokestatic glq.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: invokevirtual q6h.u1k ()V
      // 0ac: iload 4
      // 0ae: ifeq 0cf
      // 0b1: getstatic kgt.obu Li4o;
      // 0b4: invokevirtual i4o.tp_ ()V
      // 0b7: sipush 18420
      // 0ba: ldc2_w 5622092100799484564
      // 0bd: lload 2
      // 0be: lxor
      // 0bf: invokedynamic p (IJ)Ljava/lang/String; bsm=glq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: nop
      // 0c5: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 0c8: goto 0cf
      // 0cb: invokestatic glq.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield glq.eww Z
      // 0d3: iload 4
      // 0d5: ifne 0fe
      // 0d8: ifeq 125
      // 0db: goto 0e2
      // 0de: invokestatic glq.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: getstatic glq.g2b Lq6h;
      // 0e5: iload 4
      // 0e7: ifne 122
      // 0ea: goto 0f1
      // 0ed: invokestatic glq.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: ldc2_w 500.0
      // 0f4: invokevirtual q6h.hqu (D)Z
      // 0f7: goto 0fe
      // 0fa: invokestatic glq.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: ifeq 125
      // 101: getstatic kgt.obu Li4o;
      // 104: invokevirtual i4o.tp_ ()V
      // 107: sipush 1216
      // 10a: ldc2_w 1201870668207329701
      // 10d: lload 2
      // 10e: lxor
      // 10f: invokedynamic p (IJ)Ljava/lang/String; bsm=glq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: nop
      // 115: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 118: getstatic glq.g2b Lq6h;
      // 11b: goto 122
      // 11e: invokestatic glq.a (Loov;)Loov;
      // 121: athrow
      // 122: invokevirtual q6h.u1k ()V
      // 125: return
   }

   @jev
   public void s3e(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield glq.wyl Lc05;
      // 09: getfield c05.vg8 Ll86;
      // 0c: dconst_0
      // 0d: dup2_x1
      // 0e: putfield l86.mop D
      // 11: putfield _qa.wam D
      // 14: aload 0
      // 15: iload 2
      // 16: ifne e0
      // 19: getfield glq.eww Z
      // 1c: ifeq d8
      // 1f: goto 26
      // 22: invokestatic glq.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield glq.wyl Lc05;
      // 2a: getfield c05.oxn Lmoh;
      // 2d: getfield moh.nfb Lm7l;
      // 30: invokevirtual m7l.t9w ()Z
      // 33: iload 2
      // 34: ifne 71
      // 37: goto 3e
      // 3a: invokestatic glq.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ifeq 64
      // 41: goto 48
      // 44: invokestatic glq.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 1
      // 49: aload 0
      // 4a: getfield glq.wyl Lc05;
      // 4d: getfield c05.vg8 Ll86;
      // 50: getstatic r2j.tuu Lcrk;
      // 53: invokevirtual crk.u7t ()D
      // 56: dup2_x1
      // 57: putfield l86.mop D
      // 5a: putfield _qa.wam D
      // 5d: goto 64
      // 60: invokestatic glq.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: getfield glq.wyl Lc05;
      // 68: getfield c05.oxn Lmoh;
      // 6b: getfield moh.e5o Lm7l;
      // 6e: invokevirtual m7l.t9w ()Z
      // 71: iload 2
      // 72: ifne 9f
      // 75: ifeq 9c
      // 78: goto 7f
      // 7b: invokestatic glq.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 1
      // 80: aload 0
      // 81: getfield glq.wyl Lc05;
      // 84: getfield c05.vg8 Ll86;
      // 87: getstatic r2j.tuu Lcrk;
      // 8a: invokevirtual crk.u7t ()D
      // 8d: dneg
      // 8e: dup2_x1
      // 8f: putfield l86.mop D
      // 92: putfield _qa.wam D
      // 95: goto 9c
      // 98: invokestatic glq.a (Loov;)Loov;
      // 9b: athrow
      // 9c: invokestatic q0r.f2f ()Z
      // 9f: ifeq ba
      // a2: getstatic r2j.tuu Lcrk;
      // a5: invokevirtual crk.u7t ()D
      // a8: ldc2_w 3.0
      // ab: dmul
      // ac: invokestatic q0r.a8n (D)V
      // af: iload 2
      // b0: ifeq f9
      // b3: goto ba
      // b6: invokestatic glq.a (Loov;)Loov;
      // b9: athrow
      // ba: aload 1
      // bb: aload 1
      // bc: aload 1
      // bd: dconst_0
      // be: dup2_x1
      // bf: putfield _qa.faq D
      // c2: dup2_x1
      // c3: putfield _qa.wam D
      // c6: putfield _qa.c6l D
      // c9: dconst_0
      // ca: invokestatic q0r.a8n (D)V
      // cd: iload 2
      // ce: ifeq f9
      // d1: goto d8
      // d4: invokestatic glq.a (Loov;)Loov;
      // d7: athrow
      // d8: aload 0
      // d9: goto e0
      // dc: invokestatic glq.a (Loov;)Loov;
      // df: athrow
      // e0: getfield glq.wyl Lc05;
      // e3: getfield c05.gze Laba;
      // e6: fconst_1
      // e7: putfield aba.qeu F
      // ea: aload 1
      // eb: aload 1
      // ec: aload 1
      // ed: dconst_0
      // ee: dup2_x1
      // ef: putfield _qa.faq D
      // f2: dup2_x1
      // f3: putfield _qa.wam D
      // f6: putfield _qa.c6l D
      // f9: return
   }

   public void q2v() {
      long var1 = a ^ 105411844489622L;
      ncl.zpu(a<"p">(14237, 2021887429858017197L ^ var1));
      pj2 var3 = new pj2();
      var3.wzx = true;
      this.wyl.c02()._m3().r92(new C0FPacketConfirmTransaction(0, (short)-1, false));
      this.wyl.c02()._m3().r92(new C13PacketPlayerAbilities(var3));
      this.wyl.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v, this.wyl.vg8.kfp + 0.42F, this.wyl.vg8.vbd, false));
      this.wyl.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v, this.wyl.vg8.kfp + 0.7531999805212015, this.wyl.vg8.vbd, false));
   }

   @Override
   public void w4v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: getstatic glq.g2b Lq6h;
      // 07: iload 1
      // 08: ifne 25
      // 0b: ldc2_w 5000.0
      // 0e: invokevirtual q6h.hqu (D)Z
      // 11: ifeq 2d
      // 14: goto 1b
      // 17: invokestatic glq.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic glq.xh_ Lq6h;
      // 1e: goto 25
      // 21: invokestatic glq.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual q6h.u1k ()V
      // 28: aload 0
      // 29: bipush 0
      // 2a: putfield glq.eww Z
      // 2d: aload 0
      // 2e: invokevirtual glq.q2v ()V
      // 31: aload 0
      // 32: invokespecial j1s.w4v ()V
      // 35: return
   }

   @Override
   public void i__() {
      p_c.u7g(0.1);
      this.wyl.gze.qeu = 1.0F;
      pj2 var1 = new pj2();
      var1.wzx = false;
      this.wyl.vg8.lfk = true;
      this.wyl.c02()._m3().r92(new C13PacketPlayerAbilities(var1));
      this.wyl.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(this.wyl.vg8.o2v, this.wyl.vg8.kfp, this.wyl.vg8.vbd, true));
      super.i__();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1969072357652958213L, -2974544588384060709L, MethodHandles.lookup().lookupClass()).a(270400656708516L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 90470095843538L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "èÔ\u0007\u000b[RWË\u009e\u000emT/\r¬Ñ\u000eI\u00067\u009biÓ\u0081î\u009b¼àôþÃìËG\u0094©\u0093VP\u0080\u0018\u0004\u0013\u0091Xà]ó\u00841\u0089\u0090¹mJÄ§ðÛ7\u000b#Þ,á v\u008eÔ\u0085\rµ\\\u0017{\u000f\u001e\u008bX©nÍb\u00042×\u008a\rê\u0007>Úå\u0019ËVân\u0010\u009aD³T1\u0080Ùæ\f¾\u0095\u0019Áü»\u0097\u0010ÎØmA\u0097\u0014Ó!¤\u008b³\u0081ag`+";
      int var8 = "èÔ\u0007\u000b[RWË\u009e\u000emT/\r¬Ñ\u000eI\u00067\u009biÓ\u0081î\u009b¼àôþÃìËG\u0094©\u0093VP\u0080\u0018\u0004\u0013\u0091Xà]ó\u00841\u0089\u0090¹mJÄ§ðÛ7\u000b#Þ,á v\u008eÔ\u0085\rµ\\\u0017{\u000f\u001e\u008bX©nÍb\u00042×\u008a\rê\u0007>Úå\u0019ËVân\u0010\u009aD³T1\u0080Ùæ\f¾\u0095\u0019Áü»\u0097\u0010ÎØmA\u0097\u0014Ó!¤\u008b³\u0081ag`+"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[7];
                     g2b = new q6h();
                     xh_ = new q6h();
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

                  var6 = "\u000fO_\u0011\u001ek7H®¦\u009d\u009f\u001dÁcA][¼\u000eC\r5\u001f(®]z\u0082\u0017\u0093\u0091\u0088àZ\u00ad^D\u001f\u0082¸\u0091®\u008c/\u0015ú%rº\u0010[â\u000b×¾Ê\t\u001f¬\u0007¬ú4Þ";
                  var8 = "\u000fO_\u0011\u001ek7H®¦\u009d\u009f\u001dÁcA][¼\u000eC\r5\u001f(®]z\u0082\u0017\u0093\u0091\u0088àZ\u00ad^D\u001f\u0082¸\u0091®\u008c/\u0015ú%rº\u0010[â\u000b×¾Ê\t\u001f¬\u0007¬ú4Þ"
                     .length();
                  var5 = 24;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30635;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("glq", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("glq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
