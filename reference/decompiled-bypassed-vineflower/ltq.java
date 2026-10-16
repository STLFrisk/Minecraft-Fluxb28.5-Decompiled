import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ltq extends b0t {
   private final c05 _bp;
   private final owt wqj;
   private String qtx = null;
   private List af3 = null;
   private List g88 = null;
   private long cu7 = 0L;
   private long _cs = 0L;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ltq(c05 var1) {
      this._bp = var1;
      this.wqj = var1.tx1;
   }

   public void i2d(eka param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ltq.a J
      // 03: ldc2_w 133152800869424
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield ltq._bp Lc05;
      // 0c: getfield c05.ba0 Luan;
      // 0f: sipush 21604
      // 12: ldc2_w 5407656228214640676
      // 15: lload 2
      // 16: lxor
      // 17: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: nop
      // 1d: invokevirtual uan.qek (Ljava/lang/String;)V
      // 20: invokestatic t9d.c ()I
      // 23: invokestatic hzu.dp2 ()V
      // 26: aload 0
      // 27: invokevirtual ltq.u6p ()V
      // 2a: istore 4
      // 2c: aload 0
      // 2d: aload 1
      // 2e: invokevirtual ltq.ws8 (Leka;)V
      // 31: invokestatic hzu.x3w ()V
      // 34: aload 0
      // 35: getfield ltq._bp Lc05;
      // 38: iload 4
      // 3a: ifne 5c
      // 3d: getfield c05.oxn Lmoh;
      // 40: getfield moh.u9p Z
      // 43: ifeq 58
      // 46: goto 4d
      // 49: invokestatic ltq.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: invokespecial ltq.kcn ()V
      // 51: goto 58
      // 54: invokestatic ltq.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getfield ltq._bp Lc05;
      // 5c: getfield c05.ba0 Luan;
      // 5f: invokevirtual uan.uio ()V
      // 62: return
   }

   private boolean pxp() {
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
      // 05: getfield ltq._bp Lc05;
      // 08: getfield c05.vg8 Ll86;
      // 0b: invokevirtual l86.acj ()Z
      // 0e: iload 1
      // 0f: ifeq 3c
      // 12: ifne 3b
      // 15: goto 1c
      // 18: invokestatic ltq.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield ltq._bp Lc05;
      // 20: getfield c05.oxn Lmoh;
      // 23: getfield moh.yb8 Z
      // 26: iload 1
      // 27: ifeq 3c
      // 2a: goto 31
      // 2d: invokestatic ltq.a (Loov;)Loov;
      // 30: athrow
      // 31: ifeq 3f
      // 34: goto 3b
      // 37: invokestatic ltq.a (Loov;)Loov;
      // 3a: athrow
      // 3b: bipush 1
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   public void u6p() {
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
      // 05: getfield ltq.af3 Ljava/util/List;
      // 08: astore 2
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 40
      // 0e: ifnull 35
      // 11: goto 18
      // 14: invokestatic ltq.a (Loov;)Loov;
      // 17: athrow
      // 18: invokestatic java/lang/System.currentTimeMillis ()J
      // 1b: aload 0
      // 1c: getfield ltq.cu7 J
      // 1f: lcmp
      // 20: iload 1
      // 21: ifne 52
      // 24: goto 2b
      // 27: invokestatic ltq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifle 51
      // 2e: goto 35
      // 31: invokestatic ltq.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: invokevirtual ltq.m4g ()Ljava/util/List;
      // 39: goto 40
      // 3c: invokestatic ltq.a (Loov;)Loov;
      // 3f: athrow
      // 40: astore 2
      // 41: aload 0
      // 42: aload 2
      // 43: putfield ltq.af3 Ljava/util/List;
      // 46: aload 0
      // 47: invokestatic java/lang/System.currentTimeMillis ()J
      // 4a: ldc2_w 100
      // 4d: ladd
      // 4e: putfield ltq.cu7 J
      // 51: bipush 0
      // 52: istore 3
      // 53: iload 3
      // 54: aload 2
      // 55: invokeinterface java/util/List.size ()I 1
      // 5a: if_icmpge ce
      // 5d: aload 2
      // 5e: iload 3
      // 5f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 64: checkcast java/lang/String
      // 67: astore 4
      // 69: iload 1
      // 6a: ifne ca
      // 6d: aload 4
      // 6f: invokestatic com/google/common/base/Strings.isNullOrEmpty (Ljava/lang/String;)Z
      // 72: ifne c7
      // 75: goto 7c
      // 78: invokestatic ltq.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield ltq.wqj Lowt;
      // 80: getfield owt.rr7 I
      // 83: istore 5
      // 85: aload 0
      // 86: getfield ltq.wqj Lowt;
      // 89: aload 4
      // 8b: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 8e: istore 6
      // 90: bipush 2
      // 91: istore 7
      // 93: bipush 2
      // 94: iload 5
      // 96: iload 3
      // 97: imul
      // 98: iadd
      // 99: istore 8
      // 9b: fconst_1
      // 9c: iload 8
      // 9e: bipush 1
      // 9f: isub
      // a0: i2f
      // a1: bipush 2
      // a2: iload 6
      // a4: iadd
      // a5: bipush 1
      // a6: iadd
      // a7: i2f
      // a8: iload 8
      // aa: iload 5
      // ac: iadd
      // ad: bipush 1
      // ae: isub
      // af: i2f
      // b0: ldc -1873784752
      // b2: nop
      // b3: invokestatic ltq.df9 (FFFFI)V
      // b6: aload 0
      // b7: getfield ltq.wqj Lowt;
      // ba: aload 4
      // bc: fconst_2
      // bd: iload 8
      // bf: i2f
      // c0: ldc 14737632
      // c2: nop
      // c3: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // c6: pop
      // c7: iinc 3 1
      // ca: iload 1
      // cb: ifeq 53
      // ce: return
   }

   public void ws8(eka param1) {
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
      // 05: getfield ltq.g88 Ljava/util/List;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifeq 40
      // 0e: ifnull 35
      // 11: goto 18
      // 14: invokestatic ltq.a (Loov;)Loov;
      // 17: athrow
      // 18: invokestatic java/lang/System.currentTimeMillis ()J
      // 1b: aload 0
      // 1c: getfield ltq._cs J
      // 1f: lcmp
      // 20: iload 2
      // 21: ifeq 52
      // 24: goto 2b
      // 27: invokestatic ltq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifle 51
      // 2e: goto 35
      // 31: invokestatic ltq.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: invokevirtual ltq.v_q ()Ljava/util/List;
      // 39: goto 40
      // 3c: invokestatic ltq.a (Loov;)Loov;
      // 3f: athrow
      // 40: astore 3
      // 41: aload 0
      // 42: aload 3
      // 43: putfield ltq.g88 Ljava/util/List;
      // 46: aload 0
      // 47: invokestatic java/lang/System.currentTimeMillis ()J
      // 4a: ldc2_w 100
      // 4d: ladd
      // 4e: putfield ltq._cs J
      // 51: bipush 0
      // 52: istore 4
      // 54: iload 4
      // 56: aload 3
      // 57: invokeinterface java/util/List.size ()I 1
      // 5c: if_icmpge e1
      // 5f: aload 3
      // 60: iload 4
      // 62: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 67: checkcast java/lang/String
      // 6a: astore 5
      // 6c: iload 2
      // 6d: ifeq dd
      // 70: aload 5
      // 72: invokestatic com/google/common/base/Strings.isNullOrEmpty (Ljava/lang/String;)Z
      // 75: ifne da
      // 78: goto 7f
      // 7b: invokestatic ltq.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield ltq.wqj Lowt;
      // 83: getfield owt.rr7 I
      // 86: istore 6
      // 88: aload 0
      // 89: getfield ltq.wqj Lowt;
      // 8c: aload 5
      // 8e: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 91: istore 7
      // 93: aload 1
      // 94: invokevirtual eka.x05 ()I
      // 97: bipush 2
      // 98: isub
      // 99: iload 7
      // 9b: isub
      // 9c: istore 8
      // 9e: bipush 2
      // 9f: iload 6
      // a1: iload 4
      // a3: imul
      // a4: iadd
      // a5: istore 9
      // a7: iload 8
      // a9: bipush 1
      // aa: isub
      // ab: i2f
      // ac: iload 9
      // ae: bipush 1
      // af: isub
      // b0: i2f
      // b1: iload 8
      // b3: iload 7
      // b5: iadd
      // b6: bipush 1
      // b7: iadd
      // b8: i2f
      // b9: iload 9
      // bb: iload 6
      // bd: iadd
      // be: bipush 1
      // bf: isub
      // c0: i2f
      // c1: ldc -1873784752
      // c3: nop
      // c4: invokestatic ltq.df9 (FFFFI)V
      // c7: aload 0
      // c8: getfield ltq.wqj Lowt;
      // cb: aload 5
      // cd: iload 8
      // cf: i2f
      // d0: iload 9
      // d2: i2f
      // d3: ldc 14737632
      // d5: nop
      // d6: invokevirtual owt.eh6 (Ljava/lang/String;FFI)I
      // d9: pop
      // da: iinc 4 1
      // dd: iload 2
      // de: ifne 54
      // e1: return
   }

   public List m4g() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ltq.a J
      // 003: ldc2_w 82968817992521
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: new mew
      // 00f: dup
      // 010: aload 0
      // 011: getfield ltq._bp Lc05;
      // 014: invokevirtual c05.nsd ()Li2h;
      // 017: getfield i2h.o2v D
      // 01a: aload 0
      // 01b: getfield ltq._bp Lc05;
      // 01e: invokevirtual c05.nsd ()Li2h;
      // 021: invokevirtual i2h.aaw ()Lnh4;
      // 024: getfield nh4.bx_ D
      // 027: aload 0
      // 028: getfield ltq._bp Lc05;
      // 02b: invokevirtual c05.nsd ()Li2h;
      // 02e: getfield i2h.vbd D
      // 031: invokespecial mew.<init> (DDD)V
      // 034: astore 4
      // 036: aload 0
      // 037: getfield ltq._bp Lc05;
      // 03a: getfield c05.gak Ljava/lang/String;
      // 03d: aload 0
      // 03e: getfield ltq.qtx Ljava/lang/String;
      // 041: if_acmpeq 1bb
      // 044: new java/lang/StringBuffer
      // 047: dup
      // 048: aload 0
      // 049: getfield ltq._bp Lc05;
      // 04c: getfield c05.gak Ljava/lang/String;
      // 04f: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 052: astore 5
      // 054: invokestatic hxt.tpo ()I
      // 057: istore 6
      // 059: aload 0
      // 05a: getfield ltq._bp Lc05;
      // 05d: getfield c05.gak Ljava/lang/String;
      // 060: sipush 23157
      // 063: ldc2_w 7259892690373120329
      // 066: lload 1
      // 067: lxor
      // 068: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: nop
      // 06e: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 071: istore 7
      // 073: iload 7
      // 075: iload 3
      // 076: ifeq 0aa
      // 079: iflt 0a7
      // 07c: goto 083
      // 07f: invokestatic ltq.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 5
      // 085: iload 7
      // 087: new java/lang/StringBuilder
      // 08a: dup
      // 08b: invokespecial java/lang/StringBuilder.<init> ()V
      // 08e: ldc "/"
      // 090: nop
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: iload 6
      // 096: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 099: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09c: invokevirtual java/lang/StringBuffer.insert (ILjava/lang/String;)Ljava/lang/StringBuffer;
      // 09f: pop
      // 0a0: goto 0a7
      // 0a3: invokestatic ltq.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: invokestatic hxt.h79 ()Z
      // 0aa: iload 3
      // 0ab: ifeq 0d6
      // 0ae: ifeq 0d3
      // 0b1: goto 0b8
      // 0b4: invokestatic ltq.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 5
      // 0ba: sipush 4695
      // 0bd: ldc2_w 2702398069238749529
      // 0c0: lload 1
      // 0c1: lxor
      // 0c2: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0cb: pop
      // 0cc: goto 0d3
      // 0cf: invokestatic ltq.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: invokestatic hxt.veb ()Z
      // 0d6: iload 3
      // 0d7: ifeq 102
      // 0da: ifeq 0ff
      // 0dd: goto 0e4
      // 0e0: invokestatic ltq.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 5
      // 0e6: sipush 14179
      // 0e9: ldc2_w 5148620270122499169
      // 0ec: lload 1
      // 0ed: lxor
      // 0ee: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: nop
      // 0f4: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0f7: pop
      // 0f8: goto 0ff
      // 0fb: invokestatic ltq.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: invokestatic hxt.y_u ()Z
      // 102: iload 3
      // 103: ifeq 12e
      // 106: ifeq 12b
      // 109: goto 110
      // 10c: invokestatic ltq.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 5
      // 112: sipush 14518
      // 115: ldc2_w 8471018283858785168
      // 118: lload 1
      // 119: lxor
      // 11a: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: nop
      // 120: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 123: pop
      // 124: goto 12b
      // 127: invokestatic ltq.a (Loov;)Loov;
      // 12a: athrow
      // 12b: invokestatic hxt.b4a ()Z
      // 12e: iload 3
      // 12f: ifeq 15a
      // 132: ifeq 157
      // 135: goto 13c
      // 138: invokestatic ltq.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 5
      // 13e: sipush 5093
      // 141: ldc2_w 5968985779405347019
      // 144: lload 1
      // 145: lxor
      // 146: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: nop
      // 14c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 14f: pop
      // 150: goto 157
      // 153: invokestatic ltq.a (Loov;)Loov;
      // 156: athrow
      // 157: invokestatic hxt._al ()Z
      // 15a: iload 3
      // 15b: ifeq 186
      // 15e: ifeq 183
      // 161: goto 168
      // 164: invokestatic ltq.a (Loov;)Loov;
      // 167: athrow
      // 168: aload 5
      // 16a: sipush 30629
      // 16d: ldc2_w 1458518517564161198
      // 170: lload 1
      // 171: lxor
      // 172: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: nop
      // 178: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 17b: pop
      // 17c: goto 183
      // 17f: invokestatic ltq.a (Loov;)Loov;
      // 182: athrow
      // 183: invokestatic hxt.ly3 ()Z
      // 186: ifeq 1a4
      // 189: aload 5
      // 18b: sipush 22718
      // 18e: ldc2_w 4954739363003208588
      // 191: lload 1
      // 192: lxor
      // 193: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: nop
      // 199: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 19c: pop
      // 19d: goto 1a4
      // 1a0: invokestatic ltq.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: getfield ltq._bp Lc05;
      // 1a8: aload 5
      // 1aa: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1ad: putfield c05.gak Ljava/lang/String;
      // 1b0: aload 0
      // 1b1: aload 0
      // 1b2: getfield ltq._bp Lc05;
      // 1b5: getfield c05.gak Ljava/lang/String;
      // 1b8: putfield ltq.qtx Ljava/lang/String;
      // 1bb: new java/lang/StringBuilder
      // 1be: dup
      // 1bf: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c2: astore 5
      // 1c4: invokestatic hxt._zx ()Lyu2;
      // 1c7: astore 6
      // 1c9: aload 5
      // 1cb: sipush 10368
      // 1ce: ldc2_w 8333422703673238435
      // 1d1: lload 1
      // 1d2: lxor
      // 1d3: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: nop
      // 1d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dc: pop
      // 1dd: iload 3
      // 1de: ifeq 21c
      // 1e1: invokestatic net/optifine/SmartAnimations.isActive ()Z
      // 1e4: ifeq 20d
      // 1e7: goto 1ee
      // 1ea: invokestatic ltq.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 5
      // 1f0: aload 6
      // 1f2: invokevirtual yu2.zoh ()I
      // 1f5: invokestatic net/optifine/TextureAnimations.getCountAnimationsActive ()I
      // 1f8: iadd
      // 1f9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1fc: pop
      // 1fd: aload 5
      // 1ff: ldc "/"
      // 201: nop
      // 202: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 205: pop
      // 206: goto 20d
      // 209: invokestatic ltq.a (Loov;)Loov;
      // 20c: athrow
      // 20d: aload 5
      // 20f: aload 6
      // 211: invokevirtual yu2.nse ()I
      // 214: invokestatic net/optifine/TextureAnimations.getCountAnimations ()I
      // 217: iadd
      // 218: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 21b: pop
      // 21c: aload 5
      // 21e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 221: astore 7
      // 223: aload 0
      // 224: iload 3
      // 225: ifeq 346
      // 228: invokespecial ltq.pxp ()Z
      // 22b: ifeq 345
      // 22e: goto 235
      // 231: invokestatic ltq.a (Loov;)Loov;
      // 234: athrow
      // 235: bipush 8
      // 237: anewarray 1
      // 23a: dup
      // 23b: bipush 0
      // 23c: new java/lang/StringBuilder
      // 23f: dup
      // 240: invokespecial java/lang/StringBuilder.<init> ()V
      // 243: sipush 21095
      // 246: ldc2_w 6535156079634585965
      // 249: lload 1
      // 24a: lxor
      // 24b: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: nop
      // 251: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 254: aload 0
      // 255: getfield ltq._bp Lc05;
      // 258: invokevirtual c05._qb ()Ljava/lang/String;
      // 25b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25e: ldc "/"
      // 260: nop
      // 261: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 264: invokestatic g4v.a68 ()Ljava/lang/String;
      // 267: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26a: ldc ")"
      // 26c: nop
      // 26d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 270: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 273: aastore
      // 274: dup
      // 275: bipush 1
      // 276: aload 0
      // 277: getfield ltq._bp Lc05;
      // 27a: getfield c05.gak Ljava/lang/String;
      // 27d: aastore
      // 27e: dup
      // 27f: bipush 2
      // 280: aload 0
      // 281: getfield ltq._bp Lc05;
      // 284: getfield c05.vsl Lcrp;
      // 287: invokevirtual crp.kb1 ()Ljava/lang/String;
      // 28a: aastore
      // 28b: dup
      // 28c: bipush 3
      // 28d: aload 0
      // 28e: getfield ltq._bp Lc05;
      // 291: getfield c05.vsl Lcrp;
      // 294: invokevirtual crp.jda ()Ljava/lang/String;
      // 297: aastore
      // 298: dup
      // 299: bipush 4
      // 29a: new java/lang/StringBuilder
      // 29d: dup
      // 29e: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a1: sipush 5482
      // 2a4: ldc2_w 1373326460275482183
      // 2a7: lload 1
      // 2a8: lxor
      // 2a9: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: nop
      // 2af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b2: aload 0
      // 2b3: getfield ltq._bp Lc05;
      // 2b6: getfield c05.i4p Ljux;
      // 2b9: invokevirtual jux.es5 ()Ljava/lang/String;
      // 2bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bf: sipush 4176
      // 2c2: ldc2_w 5697238104994012008
      // 2c5: lload 1
      // 2c6: lxor
      // 2c7: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: nop
      // 2cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d0: aload 0
      // 2d1: getfield ltq._bp Lc05;
      // 2d4: getfield c05.tij Lkh3;
      // 2d7: invokevirtual kh3.chr ()Ljava/lang/String;
      // 2da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dd: aload 7
      // 2df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e5: aastore
      // 2e6: dup
      // 2e7: bipush 5
      // 2e8: aload 0
      // 2e9: getfield ltq._bp Lc05;
      // 2ec: getfield c05.tij Lkh3;
      // 2ef: invokevirtual kh3.n02 ()Ljava/lang/String;
      // 2f2: aastore
      // 2f3: dup
      // 2f4: bipush 6
      // 2f6: ldc ""
      // 2f8: nop
      // 2f9: aastore
      // 2fa: dup
      // 2fb: bipush 7
      // 2fd: sipush 5096
      // 300: ldc2_w 513814048585767132
      // 303: lload 1
      // 304: lxor
      // 305: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: nop
      // 30b: bipush 3
      // 30c: anewarray 334
      // 30f: dup
      // 310: bipush 0
      // 311: aload 4
      // 313: invokevirtual mew.getX ()I
      // 316: bipush 15
      // 318: iand
      // 319: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31c: aastore
      // 31d: dup
      // 31e: bipush 1
      // 31f: aload 4
      // 321: invokevirtual mew.getY ()I
      // 324: bipush 15
      // 326: iand
      // 327: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32a: aastore
      // 32b: dup
      // 32c: bipush 2
      // 32d: aload 4
      // 32f: invokevirtual mew.getZ ()I
      // 332: bipush 15
      // 334: iand
      // 335: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 338: aastore
      // 339: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 33c: aastore
      // 33d: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 340: areturn
      // 341: invokestatic ltq.a (Loov;)Loov;
      // 344: athrow
      // 345: aload 0
      // 346: getfield ltq._bp Lc05;
      // 349: invokevirtual c05.nsd ()Li2h;
      // 34c: astore 8
      // 34e: sipush 14821
      // 351: aload 8
      // 353: invokevirtual i2h.u0f ()Lvt2;
      // 356: astore 9
      // 358: ldc2_w 5089791699565933290
      // 35b: lload 1
      // 35c: lxor
      // 35d: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: nop
      // 363: astore 10
      // 365: getstatic ltq$1.ssu [I
      // 368: aload 9
      // 36a: invokevirtual vt2.ordinal ()I
      // 36d: iaload
      // 36e: iload 3
      // 36f: ifeq 3e2
      // 372: tableswitch 110 1 4 34 54 74 94
      // 390: invokestatic ltq.a (Loov;)Loov;
      // 393: athrow
      // 394: sipush 5046
      // 397: ldc2_w 2003465695035906182
      // 39a: lload 1
      // 39b: lxor
      // 39c: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a1: nop
      // 3a2: astore 10
      // 3a4: iload 3
      // 3a5: ifne 3e0
      // 3a8: sipush 7486
      // 3ab: ldc2_w 5455777035094971955
      // 3ae: lload 1
      // 3af: lxor
      // 3b0: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b5: nop
      // 3b6: astore 10
      // 3b8: iload 3
      // 3b9: ifne 3e0
      // 3bc: sipush 19197
      // 3bf: ldc2_w 6360321205422195156
      // 3c2: lload 1
      // 3c3: lxor
      // 3c4: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: nop
      // 3ca: astore 10
      // 3cc: iload 3
      // 3cd: ifne 3e0
      // 3d0: sipush 11525
      // 3d3: ldc2_w 3442204123024287244
      // 3d6: lload 1
      // 3d7: lxor
      // 3d8: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: nop
      // 3de: astore 10
      // 3e0: bipush 11
      // 3e2: anewarray 1
      // 3e5: dup
      // 3e6: bipush 0
      // 3e7: new java/lang/StringBuilder
      // 3ea: dup
      // 3eb: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ee: sipush 28152
      // 3f1: ldc2_w 1142566776632551124
      // 3f4: lload 1
      // 3f5: lxor
      // 3f6: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: nop
      // 3fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ff: aload 0
      // 400: getfield ltq._bp Lc05;
      // 403: invokevirtual c05._qb ()Ljava/lang/String;
      // 406: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 409: ldc "/"
      // 40b: nop
      // 40c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40f: invokestatic g4v.a68 ()Ljava/lang/String;
      // 412: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 415: ldc ")"
      // 417: nop
      // 418: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 41e: aastore
      // 41f: dup
      // 420: bipush 1
      // 421: aload 0
      // 422: getfield ltq._bp Lc05;
      // 425: getfield c05.gak Ljava/lang/String;
      // 428: aastore
      // 429: dup
      // 42a: bipush 2
      // 42b: aload 0
      // 42c: getfield ltq._bp Lc05;
      // 42f: getfield c05.vsl Lcrp;
      // 432: invokevirtual crp.kb1 ()Ljava/lang/String;
      // 435: aastore
      // 436: dup
      // 437: bipush 3
      // 438: aload 0
      // 439: getfield ltq._bp Lc05;
      // 43c: getfield c05.vsl Lcrp;
      // 43f: invokevirtual crp.jda ()Ljava/lang/String;
      // 442: aastore
      // 443: dup
      // 444: bipush 4
      // 445: new java/lang/StringBuilder
      // 448: dup
      // 449: invokespecial java/lang/StringBuilder.<init> ()V
      // 44c: sipush 31568
      // 44f: ldc2_w 4933018683101556847
      // 452: lload 1
      // 453: lxor
      // 454: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: nop
      // 45a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45d: aload 0
      // 45e: getfield ltq._bp Lc05;
      // 461: getfield c05.i4p Ljux;
      // 464: invokevirtual jux.es5 ()Ljava/lang/String;
      // 467: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46a: sipush 12683
      // 46d: ldc2_w 1548508970939316910
      // 470: lload 1
      // 471: lxor
      // 472: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 477: nop
      // 478: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 47b: aload 0
      // 47c: getfield ltq._bp Lc05;
      // 47f: getfield c05.tij Lkh3;
      // 482: invokevirtual kh3.chr ()Ljava/lang/String;
      // 485: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 488: aload 7
      // 48a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 490: aastore
      // 491: dup
      // 492: bipush 5
      // 493: aload 0
      // 494: getfield ltq._bp Lc05;
      // 497: getfield c05.tij Lkh3;
      // 49a: invokevirtual kh3.n02 ()Ljava/lang/String;
      // 49d: aastore
      // 49e: dup
      // 49f: bipush 6
      // 4a1: ldc ""
      // 4a3: nop
      // 4a4: aastore
      // 4a5: dup
      // 4a6: bipush 7
      // 4a8: sipush 680
      // 4ab: ldc2_w 215216538756499840
      // 4ae: lload 1
      // 4af: lxor
      // 4b0: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b5: nop
      // 4b6: bipush 3
      // 4b7: anewarray 334
      // 4ba: dup
      // 4bb: bipush 0
      // 4bc: aload 0
      // 4bd: getfield ltq._bp Lc05;
      // 4c0: invokevirtual c05.nsd ()Li2h;
      // 4c3: getfield i2h.o2v D
      // 4c6: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 4c9: aastore
      // 4ca: dup
      // 4cb: bipush 1
      // 4cc: aload 0
      // 4cd: getfield ltq._bp Lc05;
      // 4d0: invokevirtual c05.nsd ()Li2h;
      // 4d3: invokevirtual i2h.aaw ()Lnh4;
      // 4d6: getfield nh4.bx_ D
      // 4d9: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 4dc: aastore
      // 4dd: dup
      // 4de: bipush 2
      // 4df: aload 0
      // 4e0: getfield ltq._bp Lc05;
      // 4e3: invokevirtual c05.nsd ()Li2h;
      // 4e6: getfield i2h.vbd D
      // 4e9: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 4ec: aastore
      // 4ed: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4f0: aastore
      // 4f1: dup
      // 4f2: bipush 8
      // 4f4: sipush 6449
      // 4f7: ldc2_w 5571336549220274718
      // 4fa: lload 1
      // 4fb: lxor
      // 4fc: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: nop
      // 502: bipush 3
      // 503: anewarray 334
      // 506: dup
      // 507: bipush 0
      // 508: aload 4
      // 50a: invokevirtual mew.getX ()I
      // 50d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 510: aastore
      // 511: dup
      // 512: bipush 1
      // 513: aload 4
      // 515: invokevirtual mew.getY ()I
      // 518: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 51b: aastore
      // 51c: dup
      // 51d: bipush 2
      // 51e: aload 4
      // 520: invokevirtual mew.getZ ()I
      // 523: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 526: aastore
      // 527: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 52a: aastore
      // 52b: dup
      // 52c: bipush 9
      // 52e: sipush 19897
      // 531: ldc2_w 3525188471755343544
      // 534: lload 1
      // 535: lxor
      // 536: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53b: nop
      // 53c: bipush 6
      // 53e: anewarray 334
      // 541: dup
      // 542: bipush 0
      // 543: aload 4
      // 545: invokevirtual mew.getX ()I
      // 548: bipush 15
      // 54a: iand
      // 54b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 54e: aastore
      // 54f: dup
      // 550: bipush 1
      // 551: aload 4
      // 553: invokevirtual mew.getY ()I
      // 556: bipush 15
      // 558: iand
      // 559: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 55c: aastore
      // 55d: dup
      // 55e: bipush 2
      // 55f: aload 4
      // 561: invokevirtual mew.getZ ()I
      // 564: bipush 15
      // 566: iand
      // 567: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 56a: aastore
      // 56b: dup
      // 56c: bipush 3
      // 56d: aload 4
      // 56f: invokevirtual mew.getX ()I
      // 572: bipush 4
      // 573: ishr
      // 574: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 577: aastore
      // 578: dup
      // 579: bipush 4
      // 57a: aload 4
      // 57c: invokevirtual mew.getY ()I
      // 57f: bipush 4
      // 580: ishr
      // 581: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 584: aastore
      // 585: dup
      // 586: bipush 5
      // 587: aload 4
      // 589: invokevirtual mew.getZ ()I
      // 58c: bipush 4
      // 58d: ishr
      // 58e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 591: aastore
      // 592: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 595: aastore
      // 596: dup
      // 597: bipush 10
      // 599: sipush 7311
      // 59c: ldc2_w 3047489356642506680
      // 59f: lload 1
      // 5a0: lxor
      // 5a1: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a6: nop
      // 5a7: bipush 4
      // 5a8: anewarray 334
      // 5ab: dup
      // 5ac: bipush 0
      // 5ad: aload 9
      // 5af: aastore
      // 5b0: dup
      // 5b1: bipush 1
      // 5b2: aload 10
      // 5b4: aastore
      // 5b5: dup
      // 5b6: bipush 2
      // 5b7: aload 8
      // 5b9: getfield i2h.x5k F
      // 5bc: invokestatic fe6.qsy (F)F
      // 5bf: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 5c2: aastore
      // 5c3: dup
      // 5c4: bipush 3
      // 5c5: aload 8
      // 5c7: getfield i2h.y2i F
      // 5ca: invokestatic fe6.qsy (F)F
      // 5cd: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 5d0: aastore
      // 5d1: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 5d4: aastore
      // 5d5: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 5d8: astore 11
      // 5da: aload 0
      // 5db: getfield ltq._bp Lc05;
      // 5de: iload 3
      // 5df: ifeq 7a5
      // 5e2: getfield c05.tij Lkh3;
      // 5e5: ifnull 7a1
      // 5e8: goto 5ef
      // 5eb: invokestatic ltq.a (Loov;)Loov;
      // 5ee: athrow
      // 5ef: aload 0
      // 5f0: getfield ltq._bp Lc05;
      // 5f3: iload 3
      // 5f4: ifeq 7a5
      // 5f7: goto 5fe
      // 5fa: invokestatic ltq.a (Loov;)Loov;
      // 5fd: athrow
      // 5fe: getfield c05.tij Lkh3;
      // 601: aload 4
      // 603: invokevirtual kh3.xjm (Lmew;)Z
      // 606: ifeq 7a1
      // 609: goto 610
      // 60c: invokestatic ltq.a (Loov;)Loov;
      // 60f: athrow
      // 610: aload 0
      // 611: getfield ltq._bp Lc05;
      // 614: getfield c05.tij Lkh3;
      // 617: aload 4
      // 619: invokevirtual kh3.pxs (Lmew;)Ltts;
      // 61c: astore 12
      // 61e: aload 11
      // 620: new java/lang/StringBuilder
      // 623: dup
      // 624: invokespecial java/lang/StringBuilder.<init> ()V
      // 627: sipush 29108
      // 62a: ldc2_w 7681383183663282830
      // 62d: lload 1
      // 62e: lxor
      // 62f: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 634: nop
      // 635: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 638: aload 12
      // 63a: aload 4
      // 63c: aload 0
      // 63d: getfield ltq._bp Lc05;
      // 640: getfield c05.tij Lkh3;
      // 643: invokevirtual kh3.ql0 ()Lcdp;
      // 646: invokevirtual tts.u03 (Lmew;Lcdp;)Lgyu;
      // 649: getfield gyu.jcq Ljava/lang/String;
      // 64c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 64f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 652: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 657: pop
      // 658: aload 11
      // 65a: new java/lang/StringBuilder
      // 65d: dup
      // 65e: invokespecial java/lang/StringBuilder.<init> ()V
      // 661: sipush 13138
      // 664: ldc2_w 3232136611733534840
      // 667: lload 1
      // 668: lxor
      // 669: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66e: nop
      // 66f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 672: aload 12
      // 674: aload 4
      // 676: bipush 0
      // 677: invokevirtual tts.w6m (Lmew;I)I
      // 67a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 67d: sipush 29077
      // 680: ldc2_w 3343360357653035683
      // 683: lload 1
      // 684: lxor
      // 685: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68a: nop
      // 68b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68e: aload 12
      // 690: getstatic qe5.sf9 Lqe5;
      // 693: aload 4
      // 695: invokevirtual tts.uje (Lqe5;Lmew;)I
      // 698: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 69b: sipush 8514
      // 69e: ldc2_w 614168730998893175
      // 6a1: lload 1
      // 6a2: lxor
      // 6a3: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a8: nop
      // 6a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ac: aload 12
      // 6ae: getstatic qe5.lm8 Lqe5;
      // 6b1: aload 4
      // 6b3: invokevirtual tts.uje (Lqe5;Lmew;)I
      // 6b6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6b9: sipush 31278
      // 6bc: ldc2_w 219458991447716115
      // 6bf: lload 1
      // 6c0: lxor
      // 6c1: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c6: nop
      // 6c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6ca: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6cd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6d2: pop
      // 6d3: aload 0
      // 6d4: getfield ltq._bp Lc05;
      // 6d7: getfield c05.tij Lkh3;
      // 6da: aload 4
      // 6dc: invokevirtual kh3.sms (Lmew;)Lcss;
      // 6df: astore 13
      // 6e1: aload 0
      // 6e2: getfield ltq._bp Lc05;
      // 6e5: invokevirtual c05.y8_ ()Z
      // 6e8: iload 3
      // 6e9: ifeq 7a0
      // 6ec: ifeq 765
      // 6ef: goto 6f6
      // 6f2: invokestatic ltq.a (Loov;)Loov;
      // 6f5: athrow
      // 6f6: aload 0
      // 6f7: getfield ltq._bp Lc05;
      // 6fa: invokevirtual c05.et4 ()Liq7;
      // 6fd: iload 3
      // 6fe: ifeq 720
      // 701: goto 708
      // 704: invokestatic ltq.a (Loov;)Loov;
      // 707: athrow
      // 708: ifnull 765
      // 70b: goto 712
      // 70e: invokestatic ltq.a (Loov;)Loov;
      // 711: athrow
      // 712: aload 0
      // 713: getfield ltq._bp Lc05;
      // 716: invokevirtual c05.et4 ()Liq7;
      // 719: goto 720
      // 71c: invokestatic ltq.a (Loov;)Loov;
      // 71f: athrow
      // 720: invokevirtual iq7.wh3 ()Lwlx;
      // 723: aload 0
      // 724: getfield ltq._bp Lc05;
      // 727: getfield c05.vg8 Ll86;
      // 72a: invokevirtual l86.b_q ()Ljava/util/UUID;
      // 72d: invokevirtual wlx.fm4 (Ljava/util/UUID;)Lz96;
      // 730: astore 14
      // 732: aload 14
      // 734: ifnull 765
      // 737: aload 0
      // 738: getfield ltq._bp Lc05;
      // 73b: invokevirtual c05.et4 ()Liq7;
      // 73e: aload 14
      // 740: getfield z96.oay Lt9d;
      // 743: new mew
      // 746: dup
      // 747: aload 14
      // 749: invokespecial mew.<init> (Li2h;)V
      // 74c: invokevirtual iq7.wm9 (Lt9d;Lmew;)Lcss;
      // 74f: astore 15
      // 751: aload 15
      // 753: iload 3
      // 754: ifeq 763
      // 757: ifnull 765
      // 75a: goto 761
      // 75d: invokestatic ltq.a (Loov;)Loov;
      // 760: athrow
      // 761: aload 15
      // 763: astore 13
      // 765: aload 11
      // 767: sipush 5588
      // 76a: ldc2_w 8902330784843914995
      // 76d: lload 1
      // 76e: lxor
      // 76f: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 774: nop
      // 775: bipush 2
      // 776: anewarray 334
      // 779: dup
      // 77a: bipush 0
      // 77b: aload 13
      // 77d: invokevirtual css.ege ()F
      // 780: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 783: aastore
      // 784: dup
      // 785: bipush 1
      // 786: aload 0
      // 787: getfield ltq._bp Lc05;
      // 78a: getfield c05.tij Lkh3;
      // 78d: invokevirtual kh3.bq8 ()J
      // 790: ldc2_w 24000
      // 793: ldiv
      // 794: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 797: aastore
      // 798: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 79b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7a0: pop
      // 7a1: aload 0
      // 7a2: getfield ltq._bp Lc05;
      // 7a5: iload 3
      // 7a6: ifeq 813
      // 7a9: getfield c05.x0p Lv3i;
      // 7ac: ifnull 80f
      // 7af: goto 7b6
      // 7b2: invokestatic ltq.a (Loov;)Loov;
      // 7b5: athrow
      // 7b6: aload 0
      // 7b7: getfield ltq._bp Lc05;
      // 7ba: iload 3
      // 7bb: ifeq 813
      // 7be: goto 7c5
      // 7c1: invokestatic ltq.a (Loov;)Loov;
      // 7c4: athrow
      // 7c5: getfield c05.x0p Lv3i;
      // 7c8: invokevirtual v3i.q1z ()Z
      // 7cb: ifeq 80f
      // 7ce: goto 7d5
      // 7d1: invokestatic ltq.a (Loov;)Loov;
      // 7d4: athrow
      // 7d5: aload 11
      // 7d7: new java/lang/StringBuilder
      // 7da: dup
      // 7db: invokespecial java/lang/StringBuilder.<init> ()V
      // 7de: sipush 22428
      // 7e1: ldc2_w 6383207656962792610
      // 7e4: lload 1
      // 7e5: lxor
      // 7e6: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7eb: nop
      // 7ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7ef: aload 0
      // 7f0: getfield ltq._bp Lc05;
      // 7f3: getfield c05.x0p Lv3i;
      // 7f6: invokevirtual v3i.oqr ()Lqn4;
      // 7f9: invokevirtual qn4.dry ()Ljava/lang/String;
      // 7fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7ff: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 802: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 807: pop
      // 808: goto 80f
      // 80b: invokestatic ltq.a (Loov;)Loov;
      // 80e: athrow
      // 80f: aload 0
      // 810: getfield ltq._bp Lc05;
      // 813: getfield c05.dzk Lakm;
      // 816: iload 3
      // 817: ifeq 832
      // 81a: ifnull 8b6
      // 81d: goto 824
      // 820: invokestatic ltq.a (Loov;)Loov;
      // 823: athrow
      // 824: aload 0
      // 825: getfield ltq._bp Lc05;
      // 828: getfield c05.dzk Lakm;
      // 82b: goto 832
      // 82e: invokestatic ltq.a (Loov;)Loov;
      // 831: athrow
      // 832: iload 3
      // 833: ifeq 854
      // 836: getfield akm.oyz Lakm$qs6;
      // 839: getstatic akm$qs6.i4l Lakm$qs6;
      // 83c: if_acmpne 8b6
      // 83f: goto 846
      // 842: invokestatic ltq.a (Loov;)Loov;
      // 845: athrow
      // 846: aload 0
      // 847: getfield ltq._bp Lc05;
      // 84a: getfield c05.dzk Lakm;
      // 84d: goto 854
      // 850: invokestatic ltq.a (Loov;)Loov;
      // 853: athrow
      // 854: invokevirtual akm._uf ()Lmew;
      // 857: iload 3
      // 858: ifeq 876
      // 85b: ifnull 8b6
      // 85e: goto 865
      // 861: invokestatic ltq.a (Loov;)Loov;
      // 864: athrow
      // 865: aload 0
      // 866: getfield ltq._bp Lc05;
      // 869: getfield c05.dzk Lakm;
      // 86c: invokevirtual akm._uf ()Lmew;
      // 86f: goto 876
      // 872: invokestatic ltq.a (Loov;)Loov;
      // 875: athrow
      // 876: astore 12
      // 878: aload 11
      // 87a: sipush 20047
      // 87d: ldc2_w 7431084458632152446
      // 880: lload 1
      // 881: lxor
      // 882: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 887: nop
      // 888: bipush 3
      // 889: anewarray 334
      // 88c: dup
      // 88d: bipush 0
      // 88e: aload 12
      // 890: invokevirtual mew.getX ()I
      // 893: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 896: aastore
      // 897: dup
      // 898: bipush 1
      // 899: aload 12
      // 89b: invokevirtual mew.getY ()I
      // 89e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8a1: aastore
      // 8a2: dup
      // 8a3: bipush 2
      // 8a4: aload 12
      // 8a6: invokevirtual mew.getZ ()I
      // 8a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8ac: aastore
      // 8ad: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 8b0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8b5: pop
      // 8b6: aload 11
      // 8b8: areturn
   }

   public List v_q() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ltq.a J
      // 003: ldc2_w 73010682923462
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 00b: invokevirtual java/lang/Runtime.maxMemory ()J
      // 00e: lstore 4
      // 010: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 013: invokevirtual java/lang/Runtime.totalMemory ()J
      // 016: lstore 6
      // 018: invokestatic t9d.c ()I
      // 01b: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 01e: invokevirtual java/lang/Runtime.freeMemory ()J
      // 021: lstore 8
      // 023: lload 6
      // 025: lload 8
      // 027: lsub
      // 028: lstore 10
      // 02a: istore 3
      // 02b: bipush 9
      // 02d: anewarray 1
      // 030: dup
      // 031: bipush 0
      // 032: sipush 14526
      // 035: ldc2_w 4550854327943657730
      // 038: lload 1
      // 039: lxor
      // 03a: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: nop
      // 040: bipush 2
      // 041: anewarray 334
      // 044: dup
      // 045: bipush 0
      // 046: sipush 5683
      // 049: ldc2_w 2170332365119707056
      // 04c: lload 1
      // 04d: lxor
      // 04e: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: nop
      // 054: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 057: aastore
      // 058: dup
      // 059: bipush 1
      // 05a: aload 0
      // 05b: getfield ltq._bp Lc05;
      // 05e: invokevirtual c05.lbz ()Z
      // 061: iload 3
      // 062: ifne 071
      // 065: ifeq 074
      // 068: goto 06f
      // 06b: invokestatic ltq.a (Loov;)Loov;
      // 06e: athrow
      // 06f: bipush 64
      // 071: goto 076
      // 074: bipush 32
      // 076: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 079: aastore
      // 07a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 07d: aastore
      // 07e: dup
      // 07f: bipush 1
      // 080: sipush 4046
      // 083: ldc2_w 2964304720331132515
      // 086: lload 1
      // 087: lxor
      // 088: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: nop
      // 08e: bipush 3
      // 08f: anewarray 334
      // 092: dup
      // 093: bipush 0
      // 094: lload 10
      // 096: ldc2_w 100
      // 099: lmul
      // 09a: lload 4
      // 09c: ldiv
      // 09d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a0: aastore
      // 0a1: dup
      // 0a2: bipush 1
      // 0a3: lload 10
      // 0a5: invokestatic ltq.zyg (J)J
      // 0a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ab: aastore
      // 0ac: dup
      // 0ad: bipush 2
      // 0ae: lload 4
      // 0b0: invokestatic ltq.zyg (J)J
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: aastore
      // 0b7: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0ba: aastore
      // 0bb: dup
      // 0bc: bipush 2
      // 0bd: sipush 17424
      // 0c0: ldc2_w 5599879892835861950
      // 0c3: lload 1
      // 0c4: lxor
      // 0c5: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: nop
      // 0cb: bipush 2
      // 0cc: anewarray 334
      // 0cf: dup
      // 0d0: bipush 0
      // 0d1: lload 6
      // 0d3: ldc2_w 100
      // 0d6: lmul
      // 0d7: lload 4
      // 0d9: ldiv
      // 0da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dd: aastore
      // 0de: dup
      // 0df: bipush 1
      // 0e0: lload 6
      // 0e2: invokestatic ltq.zyg (J)J
      // 0e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e8: aastore
      // 0e9: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0ec: aastore
      // 0ed: dup
      // 0ee: bipush 3
      // 0ef: ldc ""
      // 0f1: nop
      // 0f2: aastore
      // 0f3: dup
      // 0f4: bipush 4
      // 0f5: sipush 6906
      // 0f8: ldc2_w 7378896973000301437
      // 0fb: lload 1
      // 0fc: lxor
      // 0fd: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: nop
      // 103: bipush 1
      // 104: anewarray 334
      // 107: dup
      // 108: bipush 0
      // 109: invokestatic gis.lhg ()Ljava/lang/String;
      // 10c: aastore
      // 10d: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 110: aastore
      // 111: dup
      // 112: bipush 5
      // 113: ldc ""
      // 115: nop
      // 116: aastore
      // 117: dup
      // 118: bipush 6
      // 11a: sipush 28594
      // 11d: ldc2_w 3226872133826588221
      // 120: lload 1
      // 121: lxor
      // 122: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: nop
      // 128: bipush 3
      // 129: anewarray 334
      // 12c: dup
      // 12d: bipush 0
      // 12e: invokestatic org/lwjgl/opengl/Display.getWidth ()I
      // 131: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 134: aastore
      // 135: dup
      // 136: bipush 1
      // 137: invokestatic org/lwjgl/opengl/Display.getHeight ()I
      // 13a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13d: aastore
      // 13e: dup
      // 13f: bipush 2
      // 140: sipush 7936
      // 143: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 146: aastore
      // 147: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 14a: aastore
      // 14b: dup
      // 14c: bipush 7
      // 14e: sipush 7937
      // 151: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 154: aastore
      // 155: dup
      // 156: bipush 8
      // 158: sipush 7938
      // 15b: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 15e: aastore
      // 15f: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 162: astore 12
      // 164: invokestatic net/optifine/util/NativeMemory.getBufferAllocated ()J
      // 167: lstore 13
      // 169: invokestatic net/optifine/util/NativeMemory.getBufferMaximum ()J
      // 16c: lstore 15
      // 16e: new java/lang/StringBuilder
      // 171: dup
      // 172: invokespecial java/lang/StringBuilder.<init> ()V
      // 175: sipush 17614
      // 178: ldc2_w 7081127064606803266
      // 17b: lload 1
      // 17c: lxor
      // 17d: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: nop
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 186: lload 13
      // 188: invokestatic ltq.zyg (J)J
      // 18b: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 18e: ldc "/"
      // 190: nop
      // 191: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 194: lload 15
      // 196: invokestatic ltq.zyg (J)J
      // 199: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 19c: sipush 32403
      // 19f: ldc2_w 675011783094615864
      // 1a2: lload 1
      // 1a3: lxor
      // 1a4: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: nop
      // 1aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b0: astore 17
      // 1b2: aload 12
      // 1b4: bipush 4
      // 1b5: aload 17
      // 1b7: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 1bc: aload 12
      // 1be: bipush 5
      // 1bf: new java/lang/StringBuilder
      // 1c2: dup
      // 1c3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c6: sipush 23291
      // 1c9: ldc2_w 3533442316726541151
      // 1cc: lload 1
      // 1cd: lxor
      // 1ce: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: nop
      // 1d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d7: invokestatic net/optifine/util/MemoryMonitor.getAllocationRateMb ()J
      // 1da: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 1dd: sipush 5164
      // 1e0: ldc2_w 7677267166192620931
      // 1e3: lload 1
      // 1e4: lxor
      // 1e5: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: nop
      // 1eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f1: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 1f6: pop
      // 1f7: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_getBrandings Lnet/optifine/reflect/ReflectorMethod;
      // 1fa: invokevirtual net/optifine/reflect/ReflectorMethod.exists ()Z
      // 1fd: iload 3
      // 1fe: ifne 24f
      // 201: ifeq 240
      // 204: goto 20b
      // 207: invokestatic ltq.a (Loov;)Loov;
      // 20a: athrow
      // 20b: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_instance Lnet/optifine/reflect/ReflectorMethod;
      // 20e: bipush 0
      // 20f: anewarray 334
      // 212: invokestatic net/optifine/reflect/Reflector.call (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 215: astore 18
      // 217: aload 12
      // 219: ldc ""
      // 21b: nop
      // 21c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 221: pop
      // 222: aload 12
      // 224: aload 18
      // 226: getstatic net/optifine/reflect/Reflector.FMLCommonHandler_getBrandings Lnet/optifine/reflect/ReflectorMethod;
      // 229: bipush 1
      // 22a: anewarray 334
      // 22d: dup
      // 22e: bipush 0
      // 22f: bipush 0
      // 230: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 233: aastore
      // 234: invokestatic net/optifine/reflect/Reflector.call (Ljava/lang/Object;Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)Ljava/lang/Object;
      // 237: checkcast java/util/Collection
      // 23a: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 23f: pop
      // 240: aload 0
      // 241: iload 3
      // 242: ifne 25a
      // 245: invokespecial ltq.pxp ()Z
      // 248: goto 24f
      // 24b: invokestatic ltq.a (Loov;)Loov;
      // 24e: athrow
      // 24f: ifeq 259
      // 252: aload 12
      // 254: areturn
      // 255: invokestatic ltq.a (Loov;)Loov;
      // 258: athrow
      // 259: aload 0
      // 25a: getfield ltq._bp Lc05;
      // 25d: getfield c05.dzk Lakm;
      // 260: iload 3
      // 261: ifne 27c
      // 264: ifnull 3f5
      // 267: goto 26e
      // 26a: invokestatic ltq.a (Loov;)Loov;
      // 26d: athrow
      // 26e: aload 0
      // 26f: getfield ltq._bp Lc05;
      // 272: getfield c05.dzk Lakm;
      // 275: goto 27c
      // 278: invokestatic ltq.a (Loov;)Loov;
      // 27b: athrow
      // 27c: iload 3
      // 27d: ifne 29e
      // 280: getfield akm.oyz Lakm$qs6;
      // 283: getstatic akm$qs6.i4l Lakm$qs6;
      // 286: if_acmpne 3f5
      // 289: goto 290
      // 28c: invokestatic ltq.a (Loov;)Loov;
      // 28f: athrow
      // 290: aload 0
      // 291: getfield ltq._bp Lc05;
      // 294: getfield c05.dzk Lakm;
      // 297: goto 29e
      // 29a: invokestatic ltq.a (Loov;)Loov;
      // 29d: athrow
      // 29e: invokevirtual akm._uf ()Lmew;
      // 2a1: iload 3
      // 2a2: ifne 2c0
      // 2a5: ifnull 3f5
      // 2a8: goto 2af
      // 2ab: invokestatic ltq.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: getfield ltq._bp Lc05;
      // 2b3: getfield c05.dzk Lakm;
      // 2b6: invokevirtual akm._uf ()Lmew;
      // 2b9: goto 2c0
      // 2bc: invokestatic ltq.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: astore 18
      // 2c2: aload 0
      // 2c3: getfield ltq._bp Lc05;
      // 2c6: getfield c05.tij Lkh3;
      // 2c9: aload 18
      // 2cb: invokevirtual kh3.getBlockState (Lmew;)Lzfz;
      // 2ce: astore 19
      // 2d0: iload 3
      // 2d1: ifne 325
      // 2d4: aload 0
      // 2d5: getfield ltq._bp Lc05;
      // 2d8: getfield c05.tij Lkh3;
      // 2db: invokevirtual kh3.getWorldType ()Lgxq;
      // 2de: getstatic gxq.gl_ Lgxq;
      // 2e1: if_acmpeq 302
      // 2e4: goto 2eb
      // 2e7: invokestatic ltq.a (Loov;)Loov;
      // 2ea: athrow
      // 2eb: aload 19
      // 2ed: invokeinterface zfz.r_y ()Le0x; 1
      // 2f2: aload 19
      // 2f4: aload 0
      // 2f5: getfield ltq._bp Lc05;
      // 2f8: getfield c05.tij Lkh3;
      // 2fb: aload 18
      // 2fd: invokevirtual e0x.w1b (Lzfz;Lm5n;Lmew;)Lzfz;
      // 300: astore 19
      // 302: aload 12
      // 304: ldc ""
      // 306: nop
      // 307: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 30c: pop
      // 30d: aload 12
      // 30f: getstatic e0x.db8 Ljnv;
      // 312: aload 19
      // 314: invokeinterface zfz.r_y ()Le0x; 1
      // 319: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 31c: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 31f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 324: pop
      // 325: aload 19
      // 327: invokeinterface zfz.q2y ()Lcom/google/common/collect/ImmutableMap; 1
      // 32c: invokevirtual com/google/common/collect/ImmutableMap.entrySet ()Lcom/google/common/collect/ImmutableSet;
      // 32f: invokevirtual com/google/common/collect/ImmutableSet.iterator ()Lcom/google/common/collect/UnmodifiableIterator;
      // 332: astore 20
      // 334: aload 20
      // 336: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 33b: ifeq 3f5
      // 33e: aload 20
      // 340: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 345: checkcast java/util/Map$Entry
      // 348: astore 21
      // 34a: aload 21
      // 34c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 351: checkcast java/lang/Comparable
      // 354: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 357: astore 22
      // 359: aload 21
      // 35b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 360: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 363: iload 3
      // 364: ifne 39d
      // 367: if_acmpne 38c
      // 36a: goto 371
      // 36d: invokestatic ltq.a (Loov;)Loov;
      // 370: athrow
      // 371: new java/lang/StringBuilder
      // 374: dup
      // 375: invokespecial java/lang/StringBuilder.<init> ()V
      // 378: getstatic syo.qjc Lsyo;
      // 37b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 37e: aload 22
      // 380: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 383: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 386: astore 22
      // 388: iload 3
      // 389: ifeq 3b7
      // 38c: aload 21
      // 38e: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 393: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 396: goto 39d
      // 399: invokestatic ltq.a (Loov;)Loov;
      // 39c: athrow
      // 39d: if_acmpne 3b7
      // 3a0: new java/lang/StringBuilder
      // 3a3: dup
      // 3a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a7: getstatic syo.aez Lsyo;
      // 3aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3ad: aload 22
      // 3af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b5: astore 22
      // 3b7: aload 12
      // 3b9: new java/lang/StringBuilder
      // 3bc: dup
      // 3bd: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c0: aload 21
      // 3c2: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 3c7: checkcast xny
      // 3ca: invokeinterface xny.w6i ()Ljava/lang/String; 1
      // 3cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d2: sipush 17735
      // 3d5: ldc2_w 334509922164671731
      // 3d8: lload 1
      // 3d9: lxor
      // 3da: invokedynamic x (IJ)Ljava/lang/String; bsm=ltq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: nop
      // 3e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e3: aload 22
      // 3e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3eb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3f0: pop
      // 3f1: iload 3
      // 3f2: ifeq 334
      // 3f5: aload 12
      // 3f7: areturn
   }

   private void kcn() {
   }

   private int lth(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: iload 1
      // 06: iload 5
      // 08: ifne 2c
      // 0b: iload 3
      // 0c: if_icmpge 2f
      // 0f: goto 16
      // 12: invokestatic ltq.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: ldc -16711936
      // 19: nop
      // 1a: sipush -256
      // 1d: iload 1
      // 1e: i2f
      // 1f: iload 3
      // 20: i2f
      // 21: fdiv
      // 22: invokespecial ltq.yoo (IIF)I
      // 25: goto 2c
      // 28: invokestatic ltq.a (Loov;)Loov;
      // 2b: athrow
      // 2c: goto 43
      // 2f: aload 0
      // 30: sipush -256
      // 33: ldc -65536
      // 35: nop
      // 36: iload 1
      // 37: iload 3
      // 38: isub
      // 39: i2f
      // 3a: iload 4
      // 3c: iload 3
      // 3d: isub
      // 3e: i2f
      // 3f: fdiv
      // 40: invokespecial ltq.yoo (IIF)I
      // 43: ireturn
   }

   private int yoo(int var1, int var2, float var3) {
      int var4 = var1 >> 24 & 0xFF;
      int var5 = var1 >> 16 & 0xFF;
      int var6 = var1 >> 8 & 0xFF;
      int var7 = var1 & 0xFF;
      int var8 = var2 >> 24 & 0xFF;
      int var9 = var2 >> 16 & 0xFF;
      int var10 = var2 >> 8 & 0xFF;
      int var11 = var2 & 0xFF;
      int var12 = fe6.faa((int)((float)var4 + (float)(var8 - var4) * var3), 0, 255);
      int var13 = fe6.faa((int)((float)var5 + (float)(var9 - var5) * var3), 0, 255);
      int var14 = fe6.faa((int)((float)var6 + (float)(var10 - var6) * var3), 0, 255);
      int var15 = fe6.faa((int)((float)var7 + (float)(var11 - var7) * var3), 0, 255);
      return var12 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   private static long zyg(long var0) {
      return var0 / 1024L / 1024L;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5400525358170902094L, -5414235380900606069L, MethodHandles.lookup().lookupClass()).a(140342418695972L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 118909688899738L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[44];
      int var7 = 0;
      String var6 = "Z\u0096æo\u008a\u009f&ÚÌê÷á Ô^\u0017\u0010BÏ= dÚ§ªî\u0080Ùú\u008aýÂ\u001f(ãdÕ\u000b\u000e6\u008d¤¿Ò\bqI×\u001a[VL«i'f,ÁX\u0090\u0083çCÁ_N\tôñY\u0081vó¸(\u0007\u008cÞnßªáñîé©Ê\u001aÛ\u0096YGþ\u009a\u0010\u0016\t!ÝÔÑ\u001dô\u009aäS:äÝ0Ô.\u00079ä\u0018\t\u001e\u0095Ø@\u0089âày\u009e¯\u0018;:e\u0012Þ\u0001¿\u0002©·´\u0089\u0010²6\u0013V_5$¿\u000ez\u009dÓZ\u009bh\\\u0010ÔÏ\u008c>4:¥ÊE}\u009e±Ux\u009e¶0á+Æ\u0016ñ\u001eß<)Ru[P)]\u0013ïÇXa\u008fÌv£×\u009e³¸QQ¾vÀô9\n¿®øè\u0011ë\n\u0007DÐ8ö\u0010\r\u0096vÿf-\u009cº$-93>\u0003ÃV(ó¡÷\u0019¡3Z%¶Ý¦n\u008d\\\u0086+JW\u001fá\u009b\u0090¼(´3\u0016tMÿ\u0090saàÁÇêX³ï0äIÿ\\\u000fC\b«5;ç?\"¡Q\u000b¢ç&õ,\u0019ÅA=ýõ\u0006æÇìå\u0098ÏðúsÔîÚ\u0000£Ev%óâ\u008b\u0010ÿXX·\u0018Æ7sÕþ]y\u0017|×Û0pó.ã8Y0ã\u008e\u0086\u0090vR\u001cF6}Nü©x[^jn\u0000ñ®Tr#?\u000b:¿\u008fRÆKVÝ#Ý.]¶pÐ\u0010{Ëõ¥\u008cÆæß\u0095\u0099Ó\u008eD\u0016Z\u00ad\u0010^Poâ\u001e&\u0018\u0007\u001b}\u0097õá¿VÈ\u0010üf½a{\u008e\u009dpE\u0013IÕç\u0092\u0081ß\u0010p\u0097Ú;zKb(¥\u008bêF¼¹\u0086(\u0010.f\u0084\u008e\u0007\u0015Ò{@\u0006{\f6~×\n\u0010¨ C\u0092\u0016ªî\u00ad¤N\u0005*l\u008br!\u0010\u0090\u001a\u000fáN\u0085yöýyüÖO\u0018âä\u0010\u0084¸Û\u0012eXîä\u0002`+\u001a^\u009cë7\u0018(o`\u0095\u0097P@\u0080¾¤Ú\bH\u000e!\u007fvª\u009aj&RÒ\u0097\u0010ÆÜ\u0006=×Yw\u0080¤Má´]F)\u0081\u0010iäRZwY¼\u0016\t\u0092\u001c\u0087\u000f\u000e\u001eo\u0018ÿOc4²ªü«Ò\u0097\u0082Â0í-ßï\u0091\n\u0088Ð§2y\u00106IazK²\tWï×É;¨\u0089\u001b°(ªf!\u0097ã\u009eù(Ão\u009dr\u008bäùðí È4¬èã\u009a£ã?B±¸ #2\u0014S\u0002^\tAò £\u001d}\u0013\u0010r\u00158\u0099å\u0090g¹å¹\u008e\u009eÝM\u001c;\u0083/ç2\u008b3ò\"È9\u00008þWñ\u0088ïÆLÝ}MÙÍ\u0096ÍgË\u000f\u008fI{p\u0096\u0083kè\u0019Cµu\u001dß\u0087`\u008dö\u0012Ï2\u0013\u0095Ùj\u008a\u008am3/\u007fµßzô)»Oâ\u0010\u0002Ä{<RÚ³T\u0097Þß\u0012ùG/b\u0010\u0089P¤þ\u0093\u0018ö\u001f!3\u0012þ\u0087\u0013\bv0\u008fëó´¦\u0098Bñ\u000b\u0003o{wüÙ\u0090þ\u0088¦\u000b Ôó\u0006\u008fpg=\u0097\u0087Î?«ýü}\u0018X$³+\u001a9[ûÙ¼q\u0010\u008b\n\fut\u0006/Ðpò's\u0000\\èå(\u0083¹û+½wÁª\u001bÔÒO,\u0087N\u0083Å\f\u0088Yré©nlR:ìcÚ\u008aÝS¶\u0096¬\u0015µé\u0084(\u0097\u00adh]ºÔaãç\u0088,>\u0089@«&\u009d\u0084ÑyV\b¼D*Xf\u0000\u009eÒ4Â\u0001\u00941sÂBHI\u0010·ÞËÀ«~\u00ad\u00ad\u0019\u0093#O^5L\u008e\u0010\u0082ù@ìòÕ<QµÐãÙj·\u008a&\u0010üa¯½Ô¹l¢0P'>ßú\u009d¯(L¥ï\u008e\u001b×]\u0081\u0005¹\tµ¤\u0090\u0002M¢#C_FUý\u009cñ\u008bæC©\u0013¨\u009dÖObì<\u00916\\ @\u009b¹\u001d:\\~W\u0012\u009f3×0\u0091Óç`\u0083°\\¯Ó÷YÓ<\u0014´îN¤¯ p\u001fÏ\u00adÝ'\u0092Ô\u0012U\u0015\u0081¡Zûþf_\u000e\u0000à_à\u0015åk¹ÃÓTëH\u00109\u0004\u0085:'^ò\u008cj¯j\u009dÀ¸íU";
      int var8 = "Z\u0096æo\u008a\u009f&ÚÌê÷á Ô^\u0017\u0010BÏ= dÚ§ªî\u0080Ùú\u008aýÂ\u001f(ãdÕ\u000b\u000e6\u008d¤¿Ò\bqI×\u001a[VL«i'f,ÁX\u0090\u0083çCÁ_N\tôñY\u0081vó¸(\u0007\u008cÞnßªáñîé©Ê\u001aÛ\u0096YGþ\u009a\u0010\u0016\t!ÝÔÑ\u001dô\u009aäS:äÝ0Ô.\u00079ä\u0018\t\u001e\u0095Ø@\u0089âày\u009e¯\u0018;:e\u0012Þ\u0001¿\u0002©·´\u0089\u0010²6\u0013V_5$¿\u000ez\u009dÓZ\u009bh\\\u0010ÔÏ\u008c>4:¥ÊE}\u009e±Ux\u009e¶0á+Æ\u0016ñ\u001eß<)Ru[P)]\u0013ïÇXa\u008fÌv£×\u009e³¸QQ¾vÀô9\n¿®øè\u0011ë\n\u0007DÐ8ö\u0010\r\u0096vÿf-\u009cº$-93>\u0003ÃV(ó¡÷\u0019¡3Z%¶Ý¦n\u008d\\\u0086+JW\u001fá\u009b\u0090¼(´3\u0016tMÿ\u0090saàÁÇêX³ï0äIÿ\\\u000fC\b«5;ç?\"¡Q\u000b¢ç&õ,\u0019ÅA=ýõ\u0006æÇìå\u0098ÏðúsÔîÚ\u0000£Ev%óâ\u008b\u0010ÿXX·\u0018Æ7sÕþ]y\u0017|×Û0pó.ã8Y0ã\u008e\u0086\u0090vR\u001cF6}Nü©x[^jn\u0000ñ®Tr#?\u000b:¿\u008fRÆKVÝ#Ý.]¶pÐ\u0010{Ëõ¥\u008cÆæß\u0095\u0099Ó\u008eD\u0016Z\u00ad\u0010^Poâ\u001e&\u0018\u0007\u001b}\u0097õá¿VÈ\u0010üf½a{\u008e\u009dpE\u0013IÕç\u0092\u0081ß\u0010p\u0097Ú;zKb(¥\u008bêF¼¹\u0086(\u0010.f\u0084\u008e\u0007\u0015Ò{@\u0006{\f6~×\n\u0010¨ C\u0092\u0016ªî\u00ad¤N\u0005*l\u008br!\u0010\u0090\u001a\u000fáN\u0085yöýyüÖO\u0018âä\u0010\u0084¸Û\u0012eXîä\u0002`+\u001a^\u009cë7\u0018(o`\u0095\u0097P@\u0080¾¤Ú\bH\u000e!\u007fvª\u009aj&RÒ\u0097\u0010ÆÜ\u0006=×Yw\u0080¤Má´]F)\u0081\u0010iäRZwY¼\u0016\t\u0092\u001c\u0087\u000f\u000e\u001eo\u0018ÿOc4²ªü«Ò\u0097\u0082Â0í-ßï\u0091\n\u0088Ð§2y\u00106IazK²\tWï×É;¨\u0089\u001b°(ªf!\u0097ã\u009eù(Ão\u009dr\u008bäùðí È4¬èã\u009a£ã?B±¸ #2\u0014S\u0002^\tAò £\u001d}\u0013\u0010r\u00158\u0099å\u0090g¹å¹\u008e\u009eÝM\u001c;\u0083/ç2\u008b3ò\"È9\u00008þWñ\u0088ïÆLÝ}MÙÍ\u0096ÍgË\u000f\u008fI{p\u0096\u0083kè\u0019Cµu\u001dß\u0087`\u008dö\u0012Ï2\u0013\u0095Ùj\u008a\u008am3/\u007fµßzô)»Oâ\u0010\u0002Ä{<RÚ³T\u0097Þß\u0012ùG/b\u0010\u0089P¤þ\u0093\u0018ö\u001f!3\u0012þ\u0087\u0013\bv0\u008fëó´¦\u0098Bñ\u000b\u0003o{wüÙ\u0090þ\u0088¦\u000b Ôó\u0006\u008fpg=\u0097\u0087Î?«ýü}\u0018X$³+\u001a9[ûÙ¼q\u0010\u008b\n\fut\u0006/Ðpò's\u0000\\èå(\u0083¹û+½wÁª\u001bÔÒO,\u0087N\u0083Å\f\u0088Yré©nlR:ìcÚ\u008aÝS¶\u0096¬\u0015µé\u0084(\u0097\u00adh]ºÔaãç\u0088,>\u0089@«&\u009d\u0084ÑyV\b¼D*Xf\u0000\u009eÒ4Â\u0001\u00941sÂBHI\u0010·ÞËÀ«~\u00ad\u00ad\u0019\u0093#O^5L\u008e\u0010\u0082ù@ìòÕ<QµÐãÙj·\u008a&\u0010üa¯½Ô¹l¢0P'>ßú\u009d¯(L¥ï\u008e\u001b×]\u0081\u0005¹\tµ¤\u0090\u0002M¢#C_FUý\u009cñ\u008bæC©\u0013¨\u009dÖObì<\u00916\\ @\u009b¹\u001d:\\~W\u0012\u009f3×0\u0091Óç`\u0083°\\¯Ó÷YÓ<\u0014´îN¤¯ p\u001fÏ\u00adÝ'\u0092Ô\u0012U\u0015\u0081¡Zûþf_\u000e\u0000à_à\u0015åk¹ÃÓTëH\u00109\u0004\u0085:'^ò\u008cj¯j\u009dÀ¸íU"
         .length();
      char var5 = 16;
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
                     c = new String[44];
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

                  var6 = "$0 Q\u0018´v\u0013Ä²æÏ\u0014=\u0007F!\u008eÊcë '/QÜ=4\u0091áùíÊ\bÔÄÄTCp+Åðp¸\"\u0007V(r4±õ\u0091 ì+\\8ÉHÝØm[6ÒP\u0098øL\"m¡\u0095µ \u00177h¢\u008c\u000f²t\u0005r¿\u0083";
                  var8 = "$0 Q\u0018´v\u0013Ä²æÏ\u0014=\u0007F!\u008eÊcë '/QÜ=4\u0091áùíÊ\bÔÄÄTCp+Åðp¸\"\u0007V(r4±õ\u0091 ì+\\8ÉHÝØm[6ÒP\u0098øL\"m¡\u0095µ \u00177h¢\u008c\u000f²t\u0005r¿\u0083"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31284;
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
            throw new RuntimeException("ltq", var10);
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
         throw new RuntimeException("ltq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
