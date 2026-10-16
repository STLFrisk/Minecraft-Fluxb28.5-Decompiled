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

public class EntitySkeleton extends s0i {
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public EntitySkeleton(OpaquePredicate var1) {
      super(var1);
      this.r1d.tn8(1, new dnq(this));
      this.r1d.tn8(2, new h4x(this));
      this.r1d.tn8(3, new ccm(this, hu3.class, 6.0F, 1.0, 1.2));
      this.r1d.tn8(4, new h2d(this, 1.0, false));
      this.r1d.tn8(5, new _tb(this, 0.8));
      this.r1d.tn8(6, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(6, new ov6(this));
      this.g9o.tn8(1, new s24(this, ha9.class, true));
      this.g9o.tn8(2, new z7z(this, false, new Class[0]));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.w7i).zf7(0.25);
   }

   @Override
   public int c4g() {
      try {
         if (this.q4v() == null) {
            return 3;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return 3 + (int)(this.i55() - 1.0F);
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
      // 00: aload 0
      // 01: fload 1
      // 02: fload 2
      // 03: invokespecial s0i.ibc (FF)V
      // 06: invokestatic OpaquePredicate.c ()I
      // 09: aload 0
      // 0a: aload 0
      // 0b: getfield EntitySkeleton.dtv I
      // 0e: i2f
      // 0f: fload 1
      // 10: ldc 1.5
      // 12: nop
      // 13: fmul
      // 14: fadd
      // 15: f2i
      // 16: putfield EntitySkeleton.dtv I
      // 19: istore 3
      // 1a: aload 0
      // 1b: iload 3
      // 1c: ifne 3a
      // 1f: getfield EntitySkeleton.dtv I
      // 22: aload 0
      // 23: getfield EntitySkeleton.oe1 I
      // 26: bipush 5
      // 27: isub
      // 28: if_icmple 43
      // 2b: goto 32
      // 2e: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: goto 3a
      // 36: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield EntitySkeleton.oe1 I
      // 3e: bipush 5
      // 3f: isub
      // 40: putfield EntitySkeleton.dtv I
      // 43: return
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, (byte)-1);
      this.oit.kp2(17, (byte)0);
      this.oit.kp2(18, (byte)0);
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
      // 00: getstatic EntitySkeleton.c J
      // 03: ldc2_w 63161394413487
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial s0i.srs (Lbdo;)V
      // 12: iload 4
      // 14: ifne 89
      // 17: aload 0
      // 18: getfield EntitySkeleton.oit Lwl1;
      // 1b: bipush 17
      // 1d: invokevirtual wl1.miz (I)B
      // 20: bipush 1
      // 21: if_icmpne 45
      // 24: goto 2b
      // 27: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 1
      // 2c: sipush 31473
      // 2f: ldc2_w 6424289421887476610
      // 32: lload 2
      // 33: lxor
      // 34: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: bipush 1
      // 3b: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 3e: goto 45
      // 41: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 1
      // 46: sipush 541
      // 49: ldc2_w 8342269089377086311
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: aload 0
      // 55: getfield EntitySkeleton.oe1 I
      // 58: i2s
      // 59: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 5c: aload 1
      // 5d: sipush 11707
      // 60: ldc2_w 4710719141536154822
      // 63: lload 2
      // 64: lxor
      // 65: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: nop
      // 6b: aload 0
      // 6c: getfield EntitySkeleton.rm5 I
      // 6f: i2b
      // 70: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 73: aload 1
      // 74: sipush 25252
      // 77: ldc2_w 7735254748491811795
      // 7a: lload 2
      // 7b: lxor
      // 7c: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: nop
      // 82: aload 0
      // 83: invokevirtual EntitySkeleton.x1m ()Z
      // 86: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 89: return
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
      // 00: getstatic EntitySkeleton.c J
      // 03: ldc2_w 87822101205764
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial s0i.cjb (Lbdo;)V
      // 12: aload 0
      // 13: getfield EntitySkeleton.oit Lwl1;
      // 16: bipush 17
      // 18: aload 1
      // 19: sipush 32388
      // 1c: ldc2_w 448745044490222417
      // 1f: lload 2
      // 20: lxor
      // 21: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: nop
      // 27: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 2a: iload 4
      // 2c: ifne 3a
      // 2f: ifeq 3d
      // 32: goto 39
      // 35: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: i2b
      // 3f: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 42: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 45: aload 1
      // 46: sipush 2807
      // 49: ldc2_w 1758365033947336490
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: bipush 99
      // 56: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 59: iload 4
      // 5b: ifne 99
      // 5e: ifeq 85
      // 61: goto 68
      // 64: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 0
      // 69: aload 1
      // 6a: sipush 2807
      // 6d: ldc2_w 1758365033947336490
      // 70: lload 2
      // 71: lxor
      // 72: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: nop
      // 78: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 7b: putfield EntitySkeleton.oe1 I
      // 7e: goto 85
      // 81: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 1
      // 86: sipush 8902
      // 89: ldc2_w 1458951905538942741
      // 8c: lload 2
      // 8d: lxor
      // 8e: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: nop
      // 94: bipush 99
      // 96: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 99: iload 4
      // 9b: ifne d7
      // 9e: ifeq c5
      // a1: goto a8
      // a4: invokestatic EntitySkeleton.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 0
      // a9: aload 1
      // aa: sipush 8902
      // ad: ldc2_w 1458951905538942741
      // b0: lload 2
      // b1: lxor
      // b2: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: nop
      // b8: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // bb: putfield EntitySkeleton.rm5 I
      // be: goto c5
      // c1: invokestatic EntitySkeleton.a (Loov;)Loov;
      // c4: athrow
      // c5: aload 1
      // c6: sipush 11016
      // c9: ldc2_w 7101076371815804626
      // cc: lload 2
      // cd: lxor
      // ce: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: nop
      // d4: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // d7: ifeq e5
      // da: aload 0
      // db: invokevirtual EntitySkeleton.ej3 ()V
      // de: goto e5
      // e1: invokestatic EntitySkeleton.a (Loov;)Loov;
      // e4: athrow
      // e5: return
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
      // 00: getstatic EntitySkeleton.c J
      // 03: ldc2_w 39403368357505
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne ea
      // 11: invokevirtual EntitySkeleton.gzr ()Z
      // 14: ifeq e9
      // 17: goto 1e
      // 1a: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield EntitySkeleton.dtv I
      // 23: putfield EntitySkeleton.hr8 I
      // 26: aload 0
      // 27: invokevirtual EntitySkeleton.x1m ()Z
      // 2a: iload 3
      // 2b: ifne 4f
      // 2e: goto 35
      // 31: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 34: athrow
      // 35: ifeq 4b
      // 38: goto 3f
      // 3b: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: bipush 1
      // 41: invokevirtual EntitySkeleton.f54 (I)V
      // 44: goto 4b
      // 47: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual EntitySkeleton.mog ()I
      // 4f: istore 4
      // 51: iload 4
      // 53: iload 3
      // 54: ifne a6
      // 57: ifle 97
      // 5a: goto 61
      // 5d: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 0
      // 62: getfield EntitySkeleton.dtv I
      // 65: iload 3
      // 66: ifne a6
      // 69: goto 70
      // 6c: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 6f: athrow
      // 70: ifne 97
      // 73: goto 7a
      // 76: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: sipush 30292
      // 7e: ldc2_w 4591764881708105224
      // 81: lload 1
      // 82: lxor
      // 83: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: nop
      // 89: fconst_1
      // 8a: ldc 0.5
      // 8c: nop
      // 8d: invokevirtual EntitySkeleton.lhu (Ljava/lang/String;FF)V
      // 90: goto 97
      // 93: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 0
      // 98: dup
      // 99: getfield EntitySkeleton.dtv I
      // 9c: iload 4
      // 9e: iadd
      // 9f: putfield EntitySkeleton.dtv I
      // a2: aload 0
      // a3: getfield EntitySkeleton.dtv I
      // a6: iload 3
      // a7: ifne cf
      // aa: ifge c0
      // ad: goto b4
      // b0: invokestatic EntitySkeleton.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 0
      // b5: bipush 0
      // b6: putfield EntitySkeleton.dtv I
      // b9: goto c0
      // bc: invokestatic EntitySkeleton.a (Loov;)Loov;
      // bf: athrow
      // c0: aload 0
      // c1: iload 3
      // c2: ifne ea
      // c5: getfield EntitySkeleton.dtv I
      // c8: goto cf
      // cb: invokestatic EntitySkeleton.a (Loov;)Loov;
      // ce: athrow
      // cf: aload 0
      // d0: getfield EntitySkeleton.oe1 I
      // d3: if_icmplt e9
      // d6: aload 0
      // d7: aload 0
      // d8: getfield EntitySkeleton.oe1 I
      // db: putfield EntitySkeleton.dtv I
      // de: aload 0
      // df: invokespecial EntitySkeleton.mq7 ()V
      // e2: goto e9
      // e5: invokestatic EntitySkeleton.a (Loov;)Loov;
      // e8: athrow
      // e9: aload 0
      // ea: invokespecial s0i.xx_ ()V
      // ed: return
   }

   @Override
   public String wcg() {
      long var1 = c ^ 38409695660705L;
      return e<"f">(11368, 449320765791236121L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 32539531394287L;
      return e<"f">(106, 6045694182040365658L ^ var1);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial s0i.owu (Lofh;)V
      // 09: aload 1
      // 0a: invokevirtual ofh.nra ()Li2h;
      // 0d: instanceof jzg
      // 10: iload 2
      // 11: ifeq 66
      // 14: ifeq 4d
      // 17: goto 1e
      // 1a: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic xbr.o30 Lu7m;
      // 21: invokestatic u7m._lo (Lu7m;)I
      // 24: istore 3
      // 25: getstatic xbr.qgs Lu7m;
      // 28: invokestatic u7m._lo (Lu7m;)I
      // 2b: istore 4
      // 2d: iload 3
      // 2e: aload 0
      // 2f: getfield EntitySkeleton.z2d Ljava/util/Random;
      // 32: iload 4
      // 34: iload 3
      // 35: isub
      // 36: bipush 1
      // 37: iadd
      // 38: invokevirtual java/util/Random.nextInt (I)I
      // 3b: iadd
      // 3c: istore 5
      // 3e: aload 0
      // 3f: iload 5
      // 41: invokestatic u7m.ltr (I)Lu7m;
      // 44: bipush 1
      // 45: invokevirtual EntitySkeleton.e70 (Lu7m;I)Lnvf;
      // 48: pop
      // 49: iload 2
      // 4a: ifne e4
      // 4d: aload 1
      // 4e: invokevirtual ofh.nra ()Li2h;
      // 51: iload 2
      // 52: ifeq 74
      // 55: goto 5c
      // 58: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 5b: athrow
      // 5c: instanceof EntitySkeleton
      // 5f: goto 66
      // 62: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 65: athrow
      // 66: ifeq e4
      // 69: aload 1
      // 6a: invokevirtual ofh.nra ()Li2h;
      // 6d: goto 74
      // 70: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 73: athrow
      // 74: iload 2
      // 75: ifeq 8e
      // 78: aload 0
      // 79: if_acmpeq e4
      // 7c: goto 83
      // 7f: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 1
      // 84: invokevirtual ofh.nra ()Li2h;
      // 87: goto 8e
      // 8a: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 8d: athrow
      // 8e: checkcast EntitySkeleton
      // 91: invokevirtual EntitySkeleton.pap ()Z
      // 94: iload 2
      // 95: ifeq be
      // 98: ifeq e4
      // 9b: goto a2
      // 9e: invokestatic EntitySkeleton.a (Loov;)Loov;
      // a1: athrow
      // a2: aload 1
      // a3: invokevirtual ofh.nra ()Li2h;
      // a6: checkcast EntitySkeleton
      // a9: iload 2
      // aa: ifeq d3
      // ad: goto b4
      // b0: invokestatic EntitySkeleton.a (Loov;)Loov;
      // b3: athrow
      // b4: invokevirtual EntitySkeleton.wmh ()Z
      // b7: goto be
      // ba: invokestatic EntitySkeleton.a (Loov;)Loov;
      // bd: athrow
      // be: ifeq e4
      // c1: aload 1
      // c2: invokevirtual ofh.nra ()Li2h;
      // c5: checkcast EntitySkeleton
      // c8: invokevirtual EntitySkeleton.tnz ()V
      // cb: aload 0
      // cc: goto d3
      // cf: invokestatic EntitySkeleton.a (Loov;)Loov;
      // d2: athrow
      // d3: new erg
      // d6: dup
      // d7: getstatic xbr.r9n Lu7m;
      // da: bipush 1
      // db: bipush 4
      // dc: invokespecial erg.<init> (Lu7m;II)V
      // df: fconst_0
      // e0: invokevirtual EntitySkeleton.qji (Lerg;F)Lnvf;
      // e3: pop
      // e4: return
   }

   @Override
   public boolean _nm(EntityLivingBase var1) {
      return true;
   }

   public boolean pap() {
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
      // 05: getfield EntitySkeleton.oit Lwl1;
      // 08: bipush 17
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: iload 1
      // 0e: ifne 24
      // 11: bipush 1
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   public float x9h(float var1) {
      return ((float)this.hr8 + (float)(this.dtv - this.hr8) * var1) / (float)(this.oe1 - 2);
   }

   @Override
   public u7m q4n() {
      return xbr.hgt;
   }

   public int mog() {
      return this.oit.miz(16);
   }

   public void f54(int var1) {
      this.oit.c66(16, (byte)var1);
   }

   @Override
   public void nzg(_6b var1) {
      super.nzg(var1);
      this.oit.c66(17, (byte)1);
   }

   @Override
   public boolean hp6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic EntitySkeleton.c J
      // 03: ldc2_w 68269173598
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: getfield ha9.up_ Ljnq;
      // 11: invokevirtual jnq.dxs ()Lerg;
      // 14: astore 5
      // 16: aload 5
      // 18: iload 4
      // 1a: ifne 29
      // 1d: ifnull a1
      // 20: goto 27
      // 23: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 5
      // 29: invokevirtual erg.gn1 ()Lu7m;
      // 2c: getstatic xbr.za8 Lu7m;
      // 2f: if_acmpne a1
      // 32: aload 0
      // 33: getfield EntitySkeleton.oay Lt9d;
      // 36: aload 0
      // 37: getfield EntitySkeleton.o2v D
      // 3a: ldc2_w 0.5
      // 3d: dadd
      // 3e: aload 0
      // 3f: getfield EntitySkeleton.kfp D
      // 42: ldc2_w 0.5
      // 45: dadd
      // 46: aload 0
      // 47: getfield EntitySkeleton.vbd D
      // 4a: ldc2_w 0.5
      // 4d: dadd
      // 4e: sipush 1475
      // 51: ldc2_w 591591602990921801
      // 54: lload 2
      // 55: lxor
      // 56: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: nop
      // 5c: fconst_1
      // 5d: aload 0
      // 5e: getfield EntitySkeleton.z2d Ljava/util/Random;
      // 61: invokevirtual java/util/Random.nextFloat ()F
      // 64: ldc 0.4
      // 66: nop
      // 67: fmul
      // 68: ldc 0.8
      // 6a: nop
      // 6b: fadd
      // 6c: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 6f: aload 1
      // 70: invokevirtual ha9.hgb ()V
      // 73: aload 0
      // 74: getfield EntitySkeleton.oay Lt9d;
      // 77: getfield OpaquePredicate.v0f Z
      // 7a: iload 4
      // 7c: ifne a6
      // 7f: goto 86
      // 82: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 85: athrow
      // 86: ifne a1
      // 89: goto 90
      // 8c: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 8f: athrow
      // 90: aload 0
      // 91: invokevirtual EntitySkeleton.ej3 ()V
      // 94: aload 5
      // 96: bipush 1
      // 97: aload 1
      // 98: invokevirtual erg.ybw (ILg_3;)V
      // 9b: bipush 1
      // 9c: ireturn
      // 9d: invokestatic EntitySkeleton.a (Loov;)Loov;
      // a0: athrow
      // a1: aload 0
      // a2: aload 1
      // a3: invokespecial s0i.hp6 (Lha9;)Z
      // a6: ireturn
   }

   private void mq7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic EntitySkeleton.c J
      // 03: ldc2_w 118763517159218
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield EntitySkeleton.oay Lt9d;
      // 10: getfield OpaquePredicate.v0f Z
      // 13: iload 3
      // 14: ifeq 40
      // 17: ifne 77
      // 1a: goto 21
      // 1d: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield EntitySkeleton.oay Lt9d;
      // 25: invokevirtual OpaquePredicate.eir ()Lef9;
      // 28: sipush 10563
      // 2b: ldc2_w 7094124311360723111
      // 2e: lload 1
      // 2f: lxor
      // 30: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 39: goto 40
      // 3c: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 3f: athrow
      // 40: istore 4
      // 42: aload 0
      // 43: invokevirtual EntitySkeleton.pap ()Z
      // 46: ifeq 51
      // 49: fconst_2
      // 4a: goto 52
      // 4d: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 50: athrow
      // 51: fconst_1
      // 52: fstore 5
      // 54: aload 0
      // 55: getfield EntitySkeleton.oay Lt9d;
      // 58: aload 0
      // 59: aload 0
      // 5a: getfield EntitySkeleton.o2v D
      // 5d: aload 0
      // 5e: getfield EntitySkeleton.kfp D
      // 61: aload 0
      // 62: getfield EntitySkeleton.vbd D
      // 65: aload 0
      // 66: getfield EntitySkeleton.rm5 I
      // 69: i2f
      // 6a: fload 5
      // 6c: fmul
      // 6d: iload 4
      // 6f: invokevirtual OpaquePredicate.s1r (Li2h;DDDFZ)Lvu6;
      // 72: pop
      // 73: aload 0
      // 74: invokevirtual EntitySkeleton._kl ()V
      // 77: return
   }

   public boolean x1m() {
      int var1 = OpaquePredicate.b();

      try {
         byte var10000 = this.oit.miz(18);
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void ej3() {
      this.oit.c66(18, (byte)1);
   }

   public boolean wmh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic EntitySkeleton.c J
      // 03: ldc2_w 68529827577630
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield EntitySkeleton.q28 I
      // 10: iload 3
      // 11: ifeq 3e
      // 14: bipush 1
      // 15: if_icmpge 50
      // 18: goto 1f
      // 1b: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield EntitySkeleton.oay Lt9d;
      // 23: invokevirtual OpaquePredicate.eir ()Lef9;
      // 26: sipush 19061
      // 29: ldc2_w 3091090734976263096
      // 2c: lload 1
      // 2d: lxor
      // 2e: invokedynamic f (IJ)Ljava/lang/String; bsm=EntitySkeleton.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: nop
      // 34: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 37: goto 3e
      // 3a: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 3
      // 3f: ifeq 4d
      // 42: ifeq 50
      // 45: goto 4c
      // 48: invokestatic EntitySkeleton.a (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 51
      // 50: bipush 0
      // 51: ireturn
   }

   public void tnz() {
      this.q28++;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6770581491045652532L, 5395808799765613505L, MethodHandles.lookup().lookupClass()).a(214434205441555L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 125875743559557L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "\u009a&½\u0004\u0015¡9B%\u0002IJ¨'\u0097Ê\u001f}ð\u001d×,ã\u0019\u0010\u001d«Âü/Üt(7N-\u001bô<\u000f% è¿\u0014c±ü?Ø§¾;Q\"&\u009dâõÞ$¿\u009a)\u0018)®é\u0098hE`\u0010\u000f\u0018P:¿\b\u0010½\u0087!ÇÍ\u0091\u001b's\u0016SÁÕ`\rá7\u008aP \u00adA@*çYt\u0093ã\u0096W«¤\u000bÐ\u0086çár\u0094\u0011^§ë¼ÂAi\u009cÕC\u0014\u0010\u0091¨Þkf±Ç¿\u001aØ^\u0092=Î6¥ j§\u001aÝ\nlG¦k©3ø\u0011$³I^Pó£\u0095µùÔÐ\u0091K1Y-31 ìxN°à+\u0011\u009e\u0081\u0016Ì#ÊÏ1ö\u008fQ\u0019¦M\r\u0096ù3ßÒ°\u0096c67\u0010\u0081\u0002\u0087\u001fTØ\u009chb7\u0095B°uÝò\u0018\u0090\b1ÕE\u008eW¥¥_\u0010w\u0015Â\u0082YÆ\u0098RÝ`\u0018ºõ\u0010¬©WÔ¨³\u0092Ù\u0081cô\b8j\u000f\u0002(\u0083$Èà\u009c-á{C\u008dQÄ\u0086U\u0097\u009cÉÂëgÐ\u0011o\u0014\u0004\u007f1î}±f´ÅÏU\f·H\u0013\u0014";
      int var8 = "\u009a&½\u0004\u0015¡9B%\u0002IJ¨'\u0097Ê\u001f}ð\u001d×,ã\u0019\u0010\u001d«Âü/Üt(7N-\u001bô<\u000f% è¿\u0014c±ü?Ø§¾;Q\"&\u009dâõÞ$¿\u009a)\u0018)®é\u0098hE`\u0010\u000f\u0018P:¿\b\u0010½\u0087!ÇÍ\u0091\u001b's\u0016SÁÕ`\rá7\u008aP \u00adA@*çYt\u0093ã\u0096W«¤\u000bÐ\u0086çár\u0094\u0011^§ë¼ÂAi\u009cÕC\u0014\u0010\u0091¨Þkf±Ç¿\u001aØ^\u0092=Î6¥ j§\u001aÝ\nlG¦k©3ø\u0011$³I^Pó£\u0095µùÔÐ\u0091K1Y-31 ìxN°à+\u0011\u009e\u0081\u0016Ì#ÊÏ1ö\u008fQ\u0019¦M\r\u0096ù3ßÒ°\u0096c67\u0010\u0081\u0002\u0087\u001fTØ\u009chb7\u0095B°uÝò\u0018\u0090\b1ÕE\u008eW¥¥_\u0010w\u0015Â\u0082YÆ\u0098RÝ`\u0018ºõ\u0010¬©WÔ¨³\u0092Ù\u0081cô\b8j\u000f\u0002(\u0083$Èà\u009c-á{C\u008dQÄ\u0086U\u0097\u009cÉÂëgÐ\u0011o\u0014\u0004\u007f1î}±f´ÅÏU\f·H\u0013\u0014"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = f(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     u = new String[14];
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

                  var6 = "`\u008cðaÞå0ÐxÑ\u008dê\u0087fá±\u0010,\u0088\u001a §#/×sÞ\u0085Èq[úq";
                  var8 = "`\u008cðaÞå0ÐxÑ\u008dê\u0087fá±\u0010,\u0088\u001a §#/×sÞ\u0085Èq[úq".length();
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

   private static String f(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21783;
      if (u[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("EntitySkeleton", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         u[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return u[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("EntitySkeleton" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
