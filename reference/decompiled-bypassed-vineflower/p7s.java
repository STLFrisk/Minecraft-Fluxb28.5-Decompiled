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

public abstract class p7s extends _f3 implements fl3 {
   private static final long d;
   private static final String[] i;
   private static final String[] m;
   private static final Map n = new HashMap(13);

   public p7s(t9d var1) {
      super(var1);
   }

   public p7s(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   @Override
   public void szd(ofh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic p7s.d J
      // 03: ldc2_w 89680158398678
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial _f3.szd (Lofh;)V
      // 12: aload 0
      // 13: getfield p7s.oay Lt9d;
      // 16: iload 4
      // 18: ifeq 44
      // 1b: invokevirtual t9d.eir ()Lef9;
      // 1e: sipush 16165
      // 21: ldc2_w 7059826493751123495
      // 24: lload 2
      // 25: lxor
      // 26: invokedynamic c (IJ)Ljava/lang/String; bsm=p7s.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 2f: ifeq 49
      // 32: goto 39
      // 35: invokestatic p7s.c (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield p7s.oay Lt9d;
      // 3d: goto 44
      // 40: invokestatic p7s.c (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: aload 0
      // 46: invokestatic py1.x5u (Lt9d;Li2h;Lrsi;)V
      // 49: return
   }

   @Override
   public erg ibn(int var1) {
      return this.ofy[var1];
   }

   @Override
   public erg afc(int param1, int param2) {
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
      // 05: getfield p7s.ofy [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: iload 3
      // 0b: ifne 25
      // 0e: ifnull 7d
      // 11: goto 18
      // 14: invokestatic p7s.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield p7s.ofy [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic p7s.c (Loov;)Loov;
      // 24: athrow
      // 25: iload 3
      // 26: ifne 53
      // 29: getfield erg.qd2 I
      // 2c: iload 2
      // 2d: if_icmpgt 49
      // 30: goto 37
      // 33: invokestatic p7s.c (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield p7s.ofy [Lerg;
      // 3b: iload 1
      // 3c: aaload
      // 3d: astore 4
      // 3f: aload 0
      // 40: getfield p7s.ofy [Lerg;
      // 43: iload 1
      // 44: aconst_null
      // 45: aastore
      // 46: aload 4
      // 48: areturn
      // 49: aload 0
      // 4a: getfield p7s.ofy [Lerg;
      // 4d: iload 1
      // 4e: aaload
      // 4f: iload 2
      // 50: invokevirtual erg.amj (I)Lerg;
      // 53: astore 4
      // 55: aload 0
      // 56: getfield p7s.ofy [Lerg;
      // 59: iload 1
      // 5a: aaload
      // 5b: iload 3
      // 5c: ifne 7c
      // 5f: getfield erg.qd2 I
      // 62: ifne 7a
      // 65: goto 6c
      // 68: invokestatic p7s.c (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield p7s.ofy [Lerg;
      // 70: iload 1
      // 71: aconst_null
      // 72: aastore
      // 73: goto 7a
      // 76: invokestatic p7s.c (Loov;)Loov;
      // 79: athrow
      // 7a: aload 4
      // 7c: areturn
      // 7d: aconst_null
      // 7e: areturn
   }

   @Override
   public erg yvk(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield p7s.ofy [Lerg;
      // 08: iload 1
      // 09: aaload
      // 0a: iload 2
      // 0b: ifne 25
      // 0e: ifnull 2f
      // 11: goto 18
      // 14: invokestatic p7s.c (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield p7s.ofy [Lerg;
      // 1c: iload 1
      // 1d: aaload
      // 1e: goto 25
      // 21: invokestatic p7s.c (Loov;)Loov;
      // 24: athrow
      // 25: astore 3
      // 26: aload 0
      // 27: getfield p7s.ofy [Lerg;
      // 2a: iload 1
      // 2b: aconst_null
      // 2c: aastore
      // 2d: aload 3
      // 2e: areturn
      // 2f: aconst_null
      // 30: areturn
   }

   @Override
   public void cxl(int param1, erg param2) {
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
      // 05: getfield p7s.ofy [Lerg;
      // 08: iload 1
      // 09: aload 2
      // 0a: aastore
      // 0b: aload 2
      // 0c: iload 3
      // 0d: ifne 1b
      // 10: ifnull 3f
      // 13: goto 1a
      // 16: invokestatic p7s.c (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: iload 3
      // 1c: ifne 38
      // 1f: getfield erg.qd2 I
      // 22: aload 0
      // 23: invokevirtual p7s.v6l ()I
      // 26: if_icmple 3f
      // 29: goto 30
      // 2c: invokestatic p7s.c (Loov;)Loov;
      // 2f: athrow
      // 30: aload 2
      // 31: goto 38
      // 34: invokestatic p7s.c (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: invokevirtual p7s.v6l ()I
      // 3c: putfield erg.qd2 I
      // 3f: return
   }

   @Override
   public void r5t() {
   }

   @Override
   public boolean dnv(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield p7s.ma9 Z
      // 08: iload 2
      // 09: ifeq 27
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic p7s.c (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: goto 3a
      // 1a: invokestatic p7s.c (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 0
      // 20: invokevirtual ha9.wxg (Li2h;)D
      // 23: ldc2_w 64.0
      // 26: dcmpg
      // 27: iload 2
      // 28: ifeq 36
      // 2b: ifgt 39
      // 2e: goto 35
      // 31: invokestatic p7s.c (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   @Override
   public void dk0(ha9 var1) {
   }

   @Override
   public void vhz(ha9 var1) {
   }

   @Override
   public boolean er2(int var1, erg var2) {
      return true;
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
      // 00: getstatic p7s.d J
      // 03: ldc2_w 138483202713873
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 26
      // 11: invokevirtual p7s.qrh ()Z
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic p7s.c (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic p7s.c (Loov;)Loov;
      // 25: athrow
      // 26: invokevirtual p7s.hei ()Ljava/lang/String;
      // 29: goto 3a
      // 2c: sipush 19161
      // 2f: ldc2_w 6485107403190163997
      // 32: lload 1
      // 33: lxor
      // 34: invokedynamic c (IJ)Ljava/lang/String; bsm=p7s.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: areturn
   }

   @Override
   public int v6l() {
      return 64;
   }

   @Override
   public void zye(int var1) {
      this.jnl = false;
      super.zye(var1);
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 27
      // 09: getfield p7s.jnl Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic p7s.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield p7s.oay Lt9d;
      // 1a: aload 0
      // 1b: aload 0
      // 1c: invokestatic py1.x5u (Lt9d;Li2h;Lrsi;)V
      // 1f: goto 26
      // 22: invokestatic p7s.c (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: invokespecial _f3._kl ()V
      // 2a: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = d ^ 122185825942030L;
      super.srs(var1);
      int var10000 = t9d.c();
      qhg var5 = new qhg();
      int var6 = 0;
      int var4 = var10000;

      while (var6 < this.ofy.length) {
         if (this.ofy[var6] != null) {
            bdo var7 = new bdo();
            var7.atr(c<"c">(176, 4411608775097254765L ^ var2), (byte)var6);
            this.ofy[var6].zy4(var7);
            var5.w2j(var7);
         }

         var6++;
         if (var4 != 0) {
            break;
         }
      }

      var1.rzm(c<"c">(3825, 8159563565479365935L ^ var2), var5);
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
      // 00: getstatic p7s.d J
      // 03: ldc2_w 28101427795621
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial _f3.cjb (Lbdo;)V
      // 0d: aload 1
      // 0e: sipush 13342
      // 11: ldc2_w 3198343439574752105
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic c (IJ)Ljava/lang/String; bsm=p7s.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: bipush 10
      // 1e: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 21: astore 5
      // 23: aload 0
      // 24: aload 0
      // 25: invokevirtual p7s.opt ()I
      // 28: anewarray 28
      // 2b: putfield p7s.ofy [Lerg;
      // 2e: invokestatic t9d.c ()I
      // 31: bipush 0
      // 32: istore 6
      // 34: istore 4
      // 36: iload 6
      // 38: aload 5
      // 3a: invokevirtual qhg.vek ()I
      // 3d: if_icmpge 9f
      // 40: aload 5
      // 42: iload 6
      // 44: invokevirtual qhg.kd6 (I)Lbdo;
      // 47: astore 7
      // 49: aload 7
      // 4b: sipush 29951
      // 4e: ldc2_w 5953442950136503179
      // 51: lload 2
      // 52: lxor
      // 53: invokedynamic c (IJ)Ljava/lang/String; bsm=p7s.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 5c: sipush 255
      // 5f: iand
      // 60: istore 8
      // 62: iload 4
      // 64: ifne 9a
      // 67: iload 8
      // 69: iflt 97
      // 6c: goto 73
      // 6f: invokestatic p7s.c (Loov;)Loov;
      // 72: athrow
      // 73: iload 8
      // 75: aload 0
      // 76: getfield p7s.ofy [Lerg;
      // 79: arraylength
      // 7a: if_icmpge 97
      // 7d: goto 84
      // 80: invokestatic p7s.c (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: getfield p7s.ofy [Lerg;
      // 88: iload 8
      // 8a: aload 7
      // 8c: invokestatic erg.qog (Lbdo;)Lerg;
      // 8f: aastore
      // 90: goto 97
      // 93: invokestatic p7s.c (Loov;)Loov;
      // 96: athrow
      // 97: iinc 6 1
      // 9a: iload 4
      // 9c: ifeq 36
      // 9f: return
   }

   @Override
   public boolean k25(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield p7s.oay Lt9d;
      // 08: getfield t9d.v0f Z
      // 0b: iload 2
      // 0c: ifne 26
      // 0f: ifne 25
      // 12: goto 19
      // 15: invokestatic p7s.c (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: aload 0
      // 1b: invokevirtual ha9.a_o (Lrsi;)V
      // 1e: goto 25
      // 21: invokestatic p7s.c (Loov;)Loov;
      // 24: athrow
      // 25: bipush 1
      // 26: ireturn
   }

   @Override
   public void zye() {
      int var1 = 15 - _jc.ngl(this);
      float var2 = 0.98F + (float)var1 * 0.001F;
      this.icv *= (double)var2;
      this.mop *= 0.0;
      this.bw4 *= (double)var2;
   }

   @Override
   public int czu(int var1) {
      return 0;
   }

   @Override
   public void r8i(int var1, int var2) {
   }

   @Override
   public int xa3() {
      return 0;
   }

   @Override
   public boolean plq() {
      return false;
   }

   @Override
   public void w8c(axk var1) {
   }

   @Override
   public axk q2q() {
      return axk.sar;
   }

   @Override
   public void nec() {
      int var1 = t9d.c();
      int var2 = 0;

      while (var2 < this.ofy.length) {
         this.ofy[var2] = null;
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8391817385680715431L, -3408714383821435433L, MethodHandles.lookup().lookupClass()).a(103011978323937L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 63950251115713L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "C&Î\u0015s¿\u0004\u0012\u000b3»ÉÜ.,¢\u0010\b¥ôñ3zË\\\næw\u0012\u007flòÄ\u0010\u009f,éeÛGq\u0084\\î¥\u0099@Z\u0093\u008e\u0010ÒZ[\u0089ýìw#Fá°\"g±\u001cw";
      int var8 = "C&Î\u0015s¿\u0004\u0012\u000b3»ÉÜ.,¢\u0010\b¥ôñ3zË\\\næw\u0012\u007flòÄ\u0010\u009f,éeÛGq\u0084\\î¥\u0099@Z\u0093\u008e\u0010ÒZ[\u0089ýìw#Fá°\"g±\u001cw"
         .length();
      char var5 = 16;
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
                     i = var9;
                     m = new String[6];
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

                  var6 = "pÝPA\u0093´\u0007iß\u0084\u0017 \u0014wa\u000eÝ\u009eÀÆ\"õ\u0093úIIc1Tb;(\u00ad(\u00913DÔ^q µ\u009eO\u000fÕ\u0080\u008a\r_j^U]T\bÄ\u0018©D©åË¹\u0099X  @\u008dö|Ì";
                  var8 = "pÝPA\u0093´\u0007iß\u0084\u0017 \u0014wa\u000eÝ\u009eÀÆ\"õ\u0093úIIc1Tb;(\u00ad(\u00913DÔ^q µ\u009eO\u000fÕ\u0080\u008a\r_j^U]T\bÄ\u0018©D©åË¹\u0099X  @\u008dö|Ì"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov c(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16307;
      if (m[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])n.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("p7s", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = i[var5].getBytes("ISO-8859-1");
         m[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return m[var5];
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
         throw new RuntimeException("p7s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
