import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cdp {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public cdp() {
      this.unb = Lists.newArrayList();
      this.unb.add(gyu.yo0);
      this.unb.add(gyu.wqh);
      this.unb.add(gyu.u3o);
      this.unb.add(gyu.hqg);
      this.unb.add(gyu.v8p);
      this.unb.add(gyu.bli);
      this.unb.add(gyu.tlt);
   }

   public cdp(long var1, gxq var3, String var4) {
      this();
      this.ufp = var4;
      ttt[] var5 = ttt.wdj(var1, var3, var4);
      this.jsf = var5[0];
      this.g6u = var5[1];
   }

   public cdp(t9d var1) {
      this(var1.x2p(), var1.r7d().z28(), var1.r7d().g9p());
   }

   public List l7g() {
      return this.unb;
   }

   public gyu owx(mew var1) {
      return this.gwg(var1, (gyu)null);
   }

   public gyu gwg(mew var1, gyu var2) {
      return this.eyc.f1i(var1.getX(), var1.getZ(), var2);
   }

   public float[] u2e(float[] param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cdp.a J
      // 003: ldc2_w 32523790875908
      // 006: lxor
      // 007: lstore 6
      // 009: invokestatic t9d.c ()I
      // 00c: istore 8
      // 00e: invokestatic z97.fuw ()V
      // 011: aload 1
      // 012: iload 8
      // 014: ifne 04c
      // 017: ifnull 03e
      // 01a: goto 021
      // 01d: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 1
      // 022: arraylength
      // 023: iload 4
      // 025: iload 5
      // 027: imul
      // 028: iload 8
      // 02a: ifne 049
      // 02d: goto 034
      // 030: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: if_icmpge 04d
      // 037: goto 03e
      // 03a: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: iload 4
      // 040: iload 5
      // 042: goto 049
      // 045: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: imul
      // 04a: newarray 6
      // 04c: astore 1
      // 04d: aload 0
      // 04e: getfield cdp.g6u Lttt;
      // 051: iload 2
      // 052: iload 3
      // 053: iload 4
      // 055: iload 5
      // 057: invokevirtual ttt.ub9 (IIII)[I
      // 05a: astore 9
      // 05c: bipush 0
      // 05d: istore 10
      // 05f: iload 10
      // 061: iload 4
      // 063: iload 5
      // 065: imul
      // 066: if_icmpge 141
      // 069: aload 9
      // 06b: iload 10
      // 06d: iaload
      // 06e: getstatic gyu.bt0 Lgyu;
      // 071: invokestatic gyu.vm1 (ILgyu;)Lgyu;
      // 074: invokevirtual gyu.l94 ()I
      // 077: i2f
      // 078: ldc 65536.0
      // 07a: nop
      // 07b: fdiv
      // 07c: fstore 11
      // 07e: iload 8
      // 080: ifne 09a
      // 083: fload 11
      // 085: fconst_1
      // 086: fcmpl
      // 087: ifle 094
      // 08a: goto 091
      // 08d: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: fconst_1
      // 092: fstore 11
      // 094: aload 1
      // 095: iload 10
      // 097: fload 11
      // 099: fastore
      // 09a: goto 139
      // 09d: astore 11
      // 09f: aload 11
      // 0a1: sipush 1409
      // 0a4: ldc2_w 8570012530717805065
      // 0a7: lload 6
      // 0a9: lxor
      // 0aa: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: nop
      // 0b0: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 0b3: astore 12
      // 0b5: aload 12
      // 0b7: sipush 18911
      // 0ba: ldc2_w 8622224306348918352
      // 0bd: lload 6
      // 0bf: lxor
      // 0c0: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: nop
      // 0c6: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 0c9: astore 13
      // 0cb: aload 13
      // 0cd: sipush 7937
      // 0d0: ldc2_w 7239994233504911500
      // 0d3: lload 6
      // 0d5: lxor
      // 0d6: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: nop
      // 0dc: iload 10
      // 0de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e1: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0e4: aload 13
      // 0e6: sipush 15816
      // 0e9: ldc2_w 8397985857640493638
      // 0ec: lload 6
      // 0ee: lxor
      // 0ef: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: nop
      // 0f5: aload 1
      // 0f6: arraylength
      // 0f7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fa: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0fd: aload 13
      // 0ff: ldc "x"
      // 101: nop
      // 102: iload 2
      // 103: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 106: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 109: aload 13
      // 10b: ldc "z"
      // 10d: nop
      // 10e: iload 3
      // 10f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 112: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 115: aload 13
      // 117: ldc "w"
      // 119: nop
      // 11a: iload 4
      // 11c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11f: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 122: aload 13
      // 124: ldc "h"
      // 126: nop
      // 127: iload 5
      // 129: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12c: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 12f: new oov
      // 132: dup
      // 133: aload 12
      // 135: invokespecial oov.<init> (Le1i;)V
      // 138: athrow
      // 139: iinc 10 1
      // 13c: iload 8
      // 13e: ifeq 05f
      // 141: aload 1
      // 142: areturn
   }

   public float m2f(float var1, int var2) {
      return var1;
   }

   public gyu[] f8i(gyu[] param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cdp.a J
      // 003: ldc2_w 75802578285913
      // 006: lxor
      // 007: lstore 6
      // 009: invokestatic t9d.b ()I
      // 00c: istore 8
      // 00e: invokestatic z97.fuw ()V
      // 011: aload 1
      // 012: iload 8
      // 014: ifeq 04d
      // 017: ifnull 03e
      // 01a: goto 021
      // 01d: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 020: athrow
      // 021: aload 1
      // 022: arraylength
      // 023: iload 4
      // 025: iload 5
      // 027: imul
      // 028: iload 8
      // 02a: ifeq 049
      // 02d: goto 034
      // 030: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: if_icmpge 04e
      // 037: goto 03e
      // 03a: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03d: athrow
      // 03e: iload 4
      // 040: iload 5
      // 042: goto 049
      // 045: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 048: athrow
      // 049: imul
      // 04a: anewarray 54
      // 04d: astore 1
      // 04e: aload 0
      // 04f: getfield cdp.jsf Lttt;
      // 052: iload 2
      // 053: iload 3
      // 054: iload 4
      // 056: iload 5
      // 058: invokevirtual ttt.ub9 (IIII)[I
      // 05b: astore 9
      // 05d: bipush 0
      // 05e: istore 10
      // 060: iload 10
      // 062: iload 4
      // 064: iload 5
      // 066: imul
      // 067: if_icmpge 08d
      // 06a: aload 1
      // 06b: iload 8
      // 06d: ifeq 08e
      // 070: iload 10
      // 072: aload 9
      // 074: iload 10
      // 076: iaload
      // 077: getstatic gyu.bt0 Lgyu;
      // 07a: invokestatic gyu.vm1 (ILgyu;)Lgyu;
      // 07d: aastore
      // 07e: iinc 10 1
      // 081: iload 8
      // 083: ifne 060
      // 086: goto 08d
      // 089: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: aload 1
      // 08e: areturn
      // 08f: astore 10
      // 091: aload 10
      // 093: sipush 6145
      // 096: ldc2_w 2336682916461043679
      // 099: lload 6
      // 09b: lxor
      // 09c: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 0a5: astore 11
      // 0a7: aload 11
      // 0a9: sipush 1952
      // 0ac: ldc2_w 6650664242323046524
      // 0af: lload 6
      // 0b1: lxor
      // 0b2: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: nop
      // 0b8: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 0bb: astore 12
      // 0bd: aload 12
      // 0bf: sipush 26849
      // 0c2: ldc2_w 7969907753013915445
      // 0c5: lload 6
      // 0c7: lxor
      // 0c8: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: nop
      // 0ce: aload 1
      // 0cf: arraylength
      // 0d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d3: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0d6: aload 12
      // 0d8: ldc "x"
      // 0da: nop
      // 0db: iload 2
      // 0dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0df: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0e2: aload 12
      // 0e4: ldc "z"
      // 0e6: nop
      // 0e7: iload 3
      // 0e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eb: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0ee: aload 12
      // 0f0: ldc "w"
      // 0f2: nop
      // 0f3: iload 4
      // 0f5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f8: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0fb: aload 12
      // 0fd: ldc "h"
      // 0ff: nop
      // 100: iload 5
      // 102: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 105: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 108: new oov
      // 10b: dup
      // 10c: aload 11
      // 10e: invokespecial oov.<init> (Le1i;)V
      // 111: athrow
   }

   public gyu[] twf(gyu[] var1, int var2, int var3, int var4, int var5) {
      return this.jbk(var1, var2, var3, var4, var5, true);
   }

   public gyu[] jbk(gyu[] param1, int param2, int param3, int param4, int param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 7
      // 005: invokestatic z97.fuw ()V
      // 008: aload 1
      // 009: iload 7
      // 00b: ifne 044
      // 00e: ifnull 035
      // 011: goto 018
      // 014: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: aload 1
      // 019: arraylength
      // 01a: iload 7
      // 01c: ifne 047
      // 01f: goto 026
      // 022: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: iload 4
      // 028: iload 5
      // 02a: imul
      // 02b: if_icmpge 045
      // 02e: goto 035
      // 031: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: iload 4
      // 037: iload 5
      // 039: imul
      // 03a: anewarray 54
      // 03d: goto 044
      // 040: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: astore 1
      // 045: iload 6
      // 047: iload 7
      // 049: ifne 058
      // 04c: ifeq 0c5
      // 04f: goto 056
      // 052: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 055: athrow
      // 056: iload 4
      // 058: bipush 16
      // 05a: iload 7
      // 05c: ifne 074
      // 05f: if_icmpne 0c5
      // 062: goto 069
      // 065: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: iload 5
      // 06b: bipush 16
      // 06d: goto 074
      // 070: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 073: athrow
      // 074: iload 7
      // 076: ifne 08d
      // 079: if_icmpne 0c5
      // 07c: goto 083
      // 07f: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: iload 2
      // 084: bipush 15
      // 086: goto 08d
      // 089: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: iand
      // 08e: iload 7
      // 090: ifne 0a8
      // 093: ifne 0c5
      // 096: goto 09d
      // 099: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: iload 3
      // 09e: bipush 15
      // 0a0: iand
      // 0a1: goto 0a8
      // 0a4: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: ifne 0c5
      // 0ab: aload 0
      // 0ac: getfield cdp.eyc Lnv3;
      // 0af: iload 2
      // 0b0: iload 3
      // 0b1: invokevirtual nv3.nr7 (II)[Lgyu;
      // 0b4: astore 8
      // 0b6: aload 8
      // 0b8: bipush 0
      // 0b9: aload 1
      // 0ba: bipush 0
      // 0bb: iload 4
      // 0bd: iload 5
      // 0bf: imul
      // 0c0: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c3: aload 1
      // 0c4: areturn
      // 0c5: aload 0
      // 0c6: getfield cdp.g6u Lttt;
      // 0c9: iload 2
      // 0ca: iload 3
      // 0cb: iload 4
      // 0cd: iload 5
      // 0cf: invokevirtual ttt.ub9 (IIII)[I
      // 0d2: astore 8
      // 0d4: bipush 0
      // 0d5: istore 9
      // 0d7: iload 9
      // 0d9: iload 4
      // 0db: iload 5
      // 0dd: imul
      // 0de: if_icmpge 104
      // 0e1: aload 1
      // 0e2: iload 7
      // 0e4: ifne 105
      // 0e7: iload 9
      // 0e9: aload 8
      // 0eb: iload 9
      // 0ed: iaload
      // 0ee: getstatic gyu.bt0 Lgyu;
      // 0f1: invokestatic gyu.vm1 (ILgyu;)Lgyu;
      // 0f4: aastore
      // 0f5: iinc 9 1
      // 0f8: iload 7
      // 0fa: ifeq 0d7
      // 0fd: goto 104
      // 100: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 1
      // 105: areturn
   }

   public boolean h4l(int param1, int param2, int param3, List param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cdp.a J
      // 003: ldc2_w 34185669010919
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic z97.fuw ()V
      // 00c: iload 1
      // 00d: iload 3
      // 00e: isub
      // 00f: bipush 2
      // 010: ishr
      // 011: istore 8
      // 013: invokestatic t9d.c ()I
      // 016: iload 2
      // 017: iload 3
      // 018: isub
      // 019: bipush 2
      // 01a: ishr
      // 01b: istore 9
      // 01d: istore 7
      // 01f: iload 1
      // 020: iload 3
      // 021: iadd
      // 022: bipush 2
      // 023: ishr
      // 024: istore 10
      // 026: iload 2
      // 027: iload 3
      // 028: iadd
      // 029: bipush 2
      // 02a: ishr
      // 02b: istore 11
      // 02d: iload 10
      // 02f: iload 8
      // 031: isub
      // 032: bipush 1
      // 033: iadd
      // 034: istore 12
      // 036: iload 11
      // 038: iload 9
      // 03a: isub
      // 03b: bipush 1
      // 03c: iadd
      // 03d: istore 13
      // 03f: aload 0
      // 040: getfield cdp.jsf Lttt;
      // 043: iload 8
      // 045: iload 9
      // 047: iload 12
      // 049: iload 13
      // 04b: invokevirtual ttt.ub9 (IIII)[I
      // 04e: astore 14
      // 050: bipush 0
      // 051: istore 15
      // 053: iload 15
      // 055: iload 12
      // 057: iload 13
      // 059: imul
      // 05a: if_icmpge 095
      // 05d: aload 14
      // 05f: iload 15
      // 061: iaload
      // 062: invokestatic gyu.lxy (I)Lgyu;
      // 065: astore 16
      // 067: iload 7
      // 069: ifne 090
      // 06c: aload 4
      // 06e: aload 16
      // 070: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 075: iload 7
      // 077: ifne 096
      // 07a: goto 081
      // 07d: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: ifne 08d
      // 084: goto 08b
      // 087: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: bipush 0
      // 08c: ireturn
      // 08d: iinc 15 1
      // 090: iload 7
      // 092: ifeq 053
      // 095: bipush 1
      // 096: ireturn
      // 097: astore 15
      // 099: aload 15
      // 09b: sipush 6145
      // 09e: ldc2_w 2336747382588985185
      // 0a1: lload 5
      // 0a3: lxor
      // 0a4: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: nop
      // 0aa: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 0ad: astore 16
      // 0af: aload 16
      // 0b1: sipush 6438
      // 0b4: ldc2_w 4240108839544442437
      // 0b7: lload 5
      // 0b9: lxor
      // 0ba: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: nop
      // 0c0: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 0c3: astore 17
      // 0c5: aload 17
      // 0c7: sipush 28412
      // 0ca: ldc2_w 7265712065853307285
      // 0cd: lload 5
      // 0cf: lxor
      // 0d0: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: nop
      // 0d6: aload 0
      // 0d7: getfield cdp.jsf Lttt;
      // 0da: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0dd: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0e0: aload 17
      // 0e2: ldc "x"
      // 0e4: nop
      // 0e5: iload 1
      // 0e6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e9: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0ec: aload 17
      // 0ee: ldc "z"
      // 0f0: nop
      // 0f1: iload 2
      // 0f2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f5: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0f8: aload 17
      // 0fa: sipush 20253
      // 0fd: ldc2_w 6708671312395671669
      // 100: lload 5
      // 102: lxor
      // 103: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: nop
      // 109: iload 3
      // 10a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10d: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 110: aload 17
      // 112: sipush 24900
      // 115: ldc2_w 931390774102963755
      // 118: lload 5
      // 11a: lxor
      // 11b: invokedynamic b (IJ)Ljava/lang/String; bsm=cdp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: nop
      // 121: aload 4
      // 123: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 126: new oov
      // 129: dup
      // 12a: aload 16
      // 12c: invokespecial oov.<init> (Le1i;)V
      // 12f: athrow
   }

   public mew rc6(int param1, int param2, int param3, List param4, Random param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic z97.fuw ()V
      // 03: invokestatic t9d.b ()I
      // 06: iload 1
      // 07: iload 3
      // 08: isub
      // 09: bipush 2
      // 0a: ishr
      // 0b: istore 7
      // 0d: istore 6
      // 0f: iload 2
      // 10: iload 3
      // 11: isub
      // 12: bipush 2
      // 13: ishr
      // 14: istore 8
      // 16: iload 1
      // 17: iload 3
      // 18: iadd
      // 19: bipush 2
      // 1a: ishr
      // 1b: istore 9
      // 1d: iload 2
      // 1e: iload 3
      // 1f: iadd
      // 20: bipush 2
      // 21: ishr
      // 22: istore 10
      // 24: iload 9
      // 26: iload 7
      // 28: isub
      // 29: bipush 1
      // 2a: iadd
      // 2b: istore 11
      // 2d: iload 10
      // 2f: iload 8
      // 31: isub
      // 32: bipush 1
      // 33: iadd
      // 34: istore 12
      // 36: aload 0
      // 37: getfield cdp.jsf Lttt;
      // 3a: iload 7
      // 3c: iload 8
      // 3e: iload 11
      // 40: iload 12
      // 42: invokevirtual ttt.ub9 (IIII)[I
      // 45: astore 13
      // 47: aconst_null
      // 48: astore 14
      // 4a: bipush 0
      // 4b: istore 15
      // 4d: bipush 0
      // 4e: istore 16
      // 50: iload 16
      // 52: iload 11
      // 54: iload 12
      // 56: imul
      // 57: if_icmpge df
      // 5a: iload 7
      // 5c: iload 16
      // 5e: iload 11
      // 60: irem
      // 61: iadd
      // 62: bipush 2
      // 63: ishl
      // 64: istore 17
      // 66: iload 8
      // 68: iload 16
      // 6a: iload 11
      // 6c: idiv
      // 6d: iadd
      // 6e: bipush 2
      // 6f: ishl
      // 70: istore 18
      // 72: aload 13
      // 74: iload 16
      // 76: iaload
      // 77: invokestatic gyu.lxy (I)Lgyu;
      // 7a: astore 19
      // 7c: iload 6
      // 7e: ifeq da
      // 81: aload 4
      // 83: aload 19
      // 85: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 8a: ifeq d7
      // 8d: goto 94
      // 90: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: aload 14
      // 96: iload 6
      // 98: ifeq d2
      // 9b: goto a2
      // 9e: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: ifnull bf
      // a5: goto ac
      // a8: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ab: athrow
      // ac: aload 5
      // ae: iload 15
      // b0: bipush 1
      // b1: iadd
      // b2: invokevirtual java/util/Random.nextInt (I)I
      // b5: ifne d7
      // b8: goto bf
      // bb: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // be: athrow
      // bf: new mew
      // c2: dup
      // c3: iload 17
      // c5: bipush 0
      // c6: iload 18
      // c8: invokespecial mew.<init> (III)V
      // cb: goto d2
      // ce: invokestatic cdp.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d1: athrow
      // d2: astore 14
      // d4: iinc 15 1
      // d7: iinc 16 1
      // da: iload 6
      // dc: ifne 50
      // df: aload 14
      // e1: areturn
   }

   public void f65() {
      this.eyc.q35();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6918760592903260481L, -2357440722394920319L, MethodHandles.lookup().lookupClass()).a(249393617456949L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 128166750065153L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "ýoÛÊ\u0083\u001bJâ\u0011~«M|XX`\u00967?|<òûô.ð\u001eù\u008d\u0010Ü¸(TA  m\bF¢\u0019}Ç|Dýçhur\u001eüÓ}ìË8Z\r\u0096$6Ñ_\u0000\u0088µtõF÷ö\u0010ûLxu\\=xÛ\u0098N{Û\u0099æ¾#\u0010ýÂP\u0093þOUÝ£~\u001b\u0010\u0002\u0085ÀÌ ge\u0082åÊÍ¶Üõ\u008a\u009f\u0090ã°úÂ´\u0003X½)Km\u001ei2Û´*Q\u0018{\u001075OG\"Úì\u0089G>¶ \u0019\u0003î· \u008b÷L\u0088¿gpI2\u0085\th§²Î\u0006w\u009dW\u0090Â\u0086b\u0004\u0016Ç\u0019²gPóì(O\u009e?î0\nai>ðx\u001a}f\u001a\r\b\u0087\t\u0085\u0086\u0012\u0087J´ÃF\u0097\u0005FZ×\u0011å!õ?þ)O ç0ºÄs×&/ù\u0006\u0087ç\u001d¾|Èg¦t\u0007$Â-¼ö<\u001c$c\u0014\u009d\u00ad";
      int var8 = "ýoÛÊ\u0083\u001bJâ\u0011~«M|XX`\u00967?|<òûô.ð\u001eù\u008d\u0010Ü¸(TA  m\bF¢\u0019}Ç|Dýçhur\u001eüÓ}ìË8Z\r\u0096$6Ñ_\u0000\u0088µtõF÷ö\u0010ûLxu\\=xÛ\u0098N{Û\u0099æ¾#\u0010ýÂP\u0093þOUÝ£~\u001b\u0010\u0002\u0085ÀÌ ge\u0082åÊÍ¶Üõ\u008a\u009f\u0090ã°úÂ´\u0003X½)Km\u001ei2Û´*Q\u0018{\u001075OG\"Úì\u0089G>¶ \u0019\u0003î· \u008b÷L\u0088¿gpI2\u0085\th§²Î\u0006w\u009dW\u0090Â\u0086b\u0004\u0016Ç\u0019²gPóì(O\u009e?î0\nai>ðx\u001a}f\u001a\r\b\u0087\t\u0085\u0086\u0012\u0087J´ÃF\u0097\u0005FZ×\u0011å!õ?þ)O ç0ºÄs×&/ù\u0006\u0087ç\u001d¾|Èg¦t\u0007$Â-¼ö<\u001c$c\u0014\u009d\u00ad"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[11];
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

                  var6 = "Î0\u0005'´\\]Úèt>\u0014\u0087'\u009bè(q\u0011¶X\u009bß¥ÖÃ9BÏºÿ\u0015VÅé4R\u0098\u0083ð\u008av¯,nGs\u0087ÝCêÜLN}Z\u0011";
                  var8 = "Î0\u0005'´\\]Úèt>\u0014\u0087'\u009bè(q\u0011¶X\u009bß¥ÖÃ9BÏºÿ\u0015VÅé4R\u0098\u0083ð\u008av¯,nGs\u0087ÝCêÜLN}Z\u0011".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13412;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("cdp", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("cdp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
