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

public abstract class p8a {
   public yqv wxo;
   public t9d qwt;
   public t_2 hvk;
   public double mlw;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public p8a(yqv var1, t9d var2) {
      this.wxo = var1;
      this.qwt = var2;
      this.m89 = var1.dgt(m6d.wg4);
      this.vjn = this.yf2();
   }

   public abstract usw yf2();

   public void rbp(double var1) {
      this.mlw = var1;
   }

   public float mtd() {
      return (float)this.m89.nz5();
   }

   public final t_2 yex(double var1, double var3, double var5) {
      return this.ty_(new mew(fe6.jqf(var1), (int)var3, fe6.jqf(var5)));
   }

   public t_2 ty_(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic p8a.a J
      // 03: ldc2_w 46649450829006
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 27
      // 13: invokevirtual p8a.a52 ()Z
      // 16: ifne 26
      // 19: goto 20
      // 1c: invokestatic p8a.b (Loov;)Loov;
      // 1f: athrow
      // 20: aconst_null
      // 21: areturn
      // 22: invokestatic p8a.b (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: invokevirtual p8a.mtd ()F
      // 2a: fstore 5
      // 2c: aload 0
      // 2d: getfield p8a.qwt Lt9d;
      // 30: getfield t9d.e8t Luan;
      // 33: sipush 20796
      // 36: ldc2_w 2226904000118115647
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic s (IJ)Ljava/lang/String; bsm=p8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: invokevirtual uan.qek (Ljava/lang/String;)V
      // 44: new mew
      // 47: dup
      // 48: aload 0
      // 49: getfield p8a.wxo Lyqv;
      // 4c: invokespecial mew.<init> (Li2h;)V
      // 4f: astore 6
      // 51: fload 5
      // 53: ldc 8.0
      // 55: nop
      // 56: fadd
      // 57: f2i
      // 58: istore 7
      // 5a: new tp4
      // 5d: dup
      // 5e: aload 0
      // 5f: getfield p8a.qwt Lt9d;
      // 62: aload 6
      // 64: iload 7
      // 66: ineg
      // 67: iload 7
      // 69: ineg
      // 6a: iload 7
      // 6c: ineg
      // 6d: invokevirtual mew.ec4 (III)Lmew;
      // 70: aload 6
      // 72: iload 7
      // 74: iload 7
      // 76: iload 7
      // 78: invokevirtual mew.ec4 (III)Lmew;
      // 7b: bipush 0
      // 7c: invokespecial tp4.<init> (Lt9d;Lmew;Lmew;I)V
      // 7f: astore 8
      // 81: aload 0
      // 82: getfield p8a.vjn Lusw;
      // 85: aload 8
      // 87: aload 0
      // 88: getfield p8a.wxo Lyqv;
      // 8b: aload 1
      // 8c: fload 5
      // 8e: invokevirtual usw.si4 (Lm5n;Li2h;Lmew;F)Lt_2;
      // 91: astore 9
      // 93: aload 0
      // 94: getfield p8a.qwt Lt9d;
      // 97: getfield t9d.e8t Luan;
      // 9a: invokevirtual uan.uio ()V
      // 9d: aload 9
      // 9f: areturn
   }

   public boolean ni_(double var1, double var3, double var5, double var7) {
      t_2 var9 = this.yex((double)fe6.jqf(var1), (double)((int)var3), (double)fe6.jqf(var5));
      return this.sh7(var9, var7);
   }

   public void yos(float var1) {
      this.bn3 = var1;
   }

   public t_2 n4j(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic p8a.a J
      // 03: ldc2_w 126012440561455
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 27
      // 13: invokevirtual p8a.a52 ()Z
      // 16: ifne 26
      // 19: goto 20
      // 1c: invokestatic p8a.b (Loov;)Loov;
      // 1f: athrow
      // 20: aconst_null
      // 21: areturn
      // 22: invokestatic p8a.b (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: invokevirtual p8a.mtd ()F
      // 2a: fstore 5
      // 2c: aload 0
      // 2d: getfield p8a.qwt Lt9d;
      // 30: getfield t9d.e8t Luan;
      // 33: sipush 27145
      // 36: ldc2_w 4453783344963397098
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic s (IJ)Ljava/lang/String; bsm=p8a.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: invokevirtual uan.qek (Ljava/lang/String;)V
      // 44: new mew
      // 47: dup
      // 48: aload 0
      // 49: getfield p8a.wxo Lyqv;
      // 4c: invokespecial mew.<init> (Li2h;)V
      // 4f: invokevirtual mew.nuv ()Lmew;
      // 52: astore 6
      // 54: fload 5
      // 56: ldc 16.0
      // 58: nop
      // 59: fadd
      // 5a: f2i
      // 5b: istore 7
      // 5d: new tp4
      // 60: dup
      // 61: aload 0
      // 62: getfield p8a.qwt Lt9d;
      // 65: aload 6
      // 67: iload 7
      // 69: ineg
      // 6a: iload 7
      // 6c: ineg
      // 6d: iload 7
      // 6f: ineg
      // 70: invokevirtual mew.ec4 (III)Lmew;
      // 73: aload 6
      // 75: iload 7
      // 77: iload 7
      // 79: iload 7
      // 7b: invokevirtual mew.ec4 (III)Lmew;
      // 7e: bipush 0
      // 7f: invokespecial tp4.<init> (Lt9d;Lmew;Lmew;I)V
      // 82: astore 8
      // 84: aload 0
      // 85: getfield p8a.vjn Lusw;
      // 88: aload 8
      // 8a: aload 0
      // 8b: getfield p8a.wxo Lyqv;
      // 8e: aload 1
      // 8f: fload 5
      // 91: invokevirtual usw.vk0 (Lm5n;Li2h;Li2h;F)Lt_2;
      // 94: astore 9
      // 96: aload 0
      // 97: getfield p8a.qwt Lt9d;
      // 9a: getfield t9d.e8t Luan;
      // 9d: invokevirtual uan.uio ()V
      // a0: aload 9
      // a2: areturn
   }

   public boolean p6m(i2h var1, double var2) {
      t_2 var4 = this.n4j(var1);

      try {
         if (var4 != null) {
            return this.sh7(var4, var2);
         }
      } catch (oov var5) {
         throw b(var5);
      }

      return false;
   }

   public boolean sh7(t_2 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 21
      // 0b: ifnonnull 20
      // 0e: goto 15
      // 11: invokestatic p8a.b (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: aconst_null
      // 17: putfield p8a.hvk Lt_2;
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: invokestatic p8a.b (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 0
      // 22: getfield p8a.hvk Lt_2;
      // 25: invokevirtual t_2.a05 (Lt_2;)Z
      // 28: iload 4
      // 2a: ifne 5a
      // 2d: ifne 43
      // 30: goto 37
      // 33: invokestatic p8a.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: putfield p8a.hvk Lt_2;
      // 3c: goto 43
      // 3f: invokestatic p8a.b (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: invokevirtual p8a.fzq ()V
      // 47: aload 0
      // 48: iload 4
      // 4a: ifne 69
      // 4d: getfield p8a.hvk Lt_2;
      // 50: invokevirtual t_2.ov7 ()I
      // 53: goto 5a
      // 56: invokestatic p8a.b (Loov;)Loov;
      // 59: athrow
      // 5a: ifne 63
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: invokestatic p8a.b (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: dload 2
      // 65: putfield p8a.mlw D
      // 68: aload 0
      // 69: invokevirtual p8a.a7k ()Lfqr;
      // 6c: astore 5
      // 6e: aload 0
      // 6f: aload 0
      // 70: getfield p8a.zo7 I
      // 73: putfield p8a.e7l I
      // 76: aload 0
      // 77: aload 5
      // 79: putfield p8a.wkw Lfqr;
      // 7c: bipush 1
      // 7d: ireturn
   }

   public t_2 v_4() {
      return this.hvk;
   }

   public void vr1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: dup
      // 006: getfield p8a.zo7 I
      // 009: bipush 1
      // 00a: iadd
      // 00b: putfield p8a.zo7 I
      // 00e: aload 0
      // 00f: invokevirtual p8a.j07 ()Z
      // 012: iload 1
      // 013: ifeq 036
      // 016: ifne 1f2
      // 019: goto 020
      // 01c: invokestatic p8a.b (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: iload 1
      // 022: ifeq 050
      // 025: goto 02c
      // 028: invokestatic p8a.b (Loov;)Loov;
      // 02b: athrow
      // 02c: invokevirtual p8a.a52 ()Z
      // 02f: goto 036
      // 032: invokestatic p8a.b (Loov;)Loov;
      // 035: athrow
      // 036: ifeq 048
      // 039: aload 0
      // 03a: invokevirtual p8a.hqu ()V
      // 03d: iload 1
      // 03e: ifne 12c
      // 041: goto 048
      // 044: invokestatic p8a.b (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: goto 050
      // 04c: invokestatic p8a.b (Loov;)Loov;
      // 04f: athrow
      // 050: iload 1
      // 051: ifeq 12d
      // 054: getfield p8a.hvk Lt_2;
      // 057: ifnull 12c
      // 05a: goto 061
      // 05d: invokestatic p8a.b (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield p8a.hvk Lt_2;
      // 065: invokevirtual t_2.x03 ()I
      // 068: iload 1
      // 069: ifeq 13b
      // 06c: goto 073
      // 06f: invokestatic p8a.b (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield p8a.hvk Lt_2;
      // 077: invokevirtual t_2.ov7 ()I
      // 07a: if_icmpge 12c
      // 07d: goto 084
      // 080: invokestatic p8a.b (Loov;)Loov;
      // 083: athrow
      // 084: aload 0
      // 085: invokevirtual p8a.a7k ()Lfqr;
      // 088: astore 2
      // 089: aload 0
      // 08a: getfield p8a.hvk Lt_2;
      // 08d: aload 0
      // 08e: getfield p8a.wxo Lyqv;
      // 091: aload 0
      // 092: getfield p8a.hvk Lt_2;
      // 095: invokevirtual t_2.x03 ()I
      // 098: invokevirtual t_2._qy (Li2h;I)Lfqr;
      // 09b: astore 3
      // 09c: aload 2
      // 09d: getfield fqr.gn5 D
      // 0a0: aload 3
      // 0a1: getfield fqr.gn5 D
      // 0a4: dcmpl
      // 0a5: iload 1
      // 0a6: ifeq 13b
      // 0a9: ifle 12c
      // 0ac: goto 0b3
      // 0af: invokestatic p8a.b (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: getfield p8a.wxo Lyqv;
      // 0b7: getfield yqv.lfk Z
      // 0ba: iload 1
      // 0bb: ifeq 13b
      // 0be: goto 0c5
      // 0c1: invokestatic p8a.b (Loov;)Loov;
      // 0c4: athrow
      // 0c5: ifne 12c
      // 0c8: goto 0cf
      // 0cb: invokestatic p8a.b (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aload 2
      // 0d0: getfield fqr.lvi D
      // 0d3: invokestatic fe6.jqf (D)I
      // 0d6: iload 1
      // 0d7: ifeq 13b
      // 0da: goto 0e1
      // 0dd: invokestatic p8a.b (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 3
      // 0e2: getfield fqr.lvi D
      // 0e5: invokestatic fe6.jqf (D)I
      // 0e8: if_icmpne 12c
      // 0eb: goto 0f2
      // 0ee: invokestatic p8a.b (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 2
      // 0f3: getfield fqr.bn2 D
      // 0f6: invokestatic fe6.jqf (D)I
      // 0f9: iload 1
      // 0fa: ifeq 13b
      // 0fd: goto 104
      // 100: invokestatic p8a.b (Loov;)Loov;
      // 103: athrow
      // 104: aload 3
      // 105: getfield fqr.bn2 D
      // 108: invokestatic fe6.jqf (D)I
      // 10b: if_icmpne 12c
      // 10e: goto 115
      // 111: invokestatic p8a.b (Loov;)Loov;
      // 114: athrow
      // 115: aload 0
      // 116: getfield p8a.hvk Lt_2;
      // 119: aload 0
      // 11a: getfield p8a.hvk Lt_2;
      // 11d: invokevirtual t_2.x03 ()I
      // 120: bipush 1
      // 121: iadd
      // 122: invokevirtual t_2.lkx (I)V
      // 125: goto 12c
      // 128: invokestatic p8a.b (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: iload 1
      // 12e: ifeq 13f
      // 131: invokevirtual p8a.j07 ()Z
      // 134: goto 13b
      // 137: invokestatic p8a.b (Loov;)Loov;
      // 13a: athrow
      // 13b: ifne 1f2
      // 13e: aload 0
      // 13f: getfield p8a.hvk Lt_2;
      // 142: aload 0
      // 143: getfield p8a.wxo Lyqv;
      // 146: invokevirtual t_2.qq_ (Li2h;)Lfqr;
      // 149: astore 2
      // 14a: aload 2
      // 14b: ifnull 1f2
      // 14e: new nh4
      // 151: dup
      // 152: aload 2
      // 153: getfield fqr.lvi D
      // 156: aload 2
      // 157: getfield fqr.gn5 D
      // 15a: aload 2
      // 15b: getfield fqr.bn2 D
      // 15e: aload 2
      // 15f: getfield fqr.lvi D
      // 162: aload 2
      // 163: getfield fqr.gn5 D
      // 166: aload 2
      // 167: getfield fqr.bn2 D
      // 16a: invokespecial nh4.<init> (DDDDDD)V
      // 16d: ldc2_w 0.5
      // 170: ldc2_w 0.5
      // 173: ldc2_w 0.5
      // 176: invokevirtual nh4.c2h (DDD)Lnh4;
      // 179: astore 3
      // 17a: aload 0
      // 17b: getfield p8a.qwt Lt9d;
      // 17e: aload 0
      // 17f: getfield p8a.wxo Lyqv;
      // 182: aload 3
      // 183: dconst_0
      // 184: ldc2_w -1.0
      // 187: dconst_0
      // 188: invokevirtual nh4.z9h (DDD)Lnh4;
      // 18b: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 18e: astore 4
      // 190: ldc2_w -1.0
      // 193: dstore 5
      // 195: aload 3
      // 196: dconst_0
      // 197: dconst_1
      // 198: dconst_0
      // 199: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 19c: astore 3
      // 19d: aload 4
      // 19f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1a4: astore 7
      // 1a6: aload 7
      // 1a8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1ad: ifeq 1d5
      // 1b0: aload 7
      // 1b2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b7: checkcast nh4
      // 1ba: astore 8
      // 1bc: aload 8
      // 1be: aload 3
      // 1bf: dload 5
      // 1c1: invokevirtual nh4.tf9 (Lnh4;D)D
      // 1c4: dstore 5
      // 1c6: iload 1
      // 1c7: ifeq 1f2
      // 1ca: iload 1
      // 1cb: ifne 1a6
      // 1ce: goto 1d5
      // 1d1: invokestatic p8a.b (Loov;)Loov;
      // 1d4: athrow
      // 1d5: aload 0
      // 1d6: getfield p8a.wxo Lyqv;
      // 1d9: invokevirtual yqv.gvh ()Lbww;
      // 1dc: aload 2
      // 1dd: getfield fqr.lvi D
      // 1e0: aload 2
      // 1e1: getfield fqr.gn5 D
      // 1e4: dload 5
      // 1e6: dadd
      // 1e7: aload 2
      // 1e8: getfield fqr.bn2 D
      // 1eb: aload 0
      // 1ec: getfield p8a.mlw D
      // 1ef: invokevirtual bww.n5p (DDDD)V
      // 1f2: return
   }

   public void hqu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual p8a.a7k ()Lfqr;
      // 004: astore 2
      // 005: invokestatic t9d.c ()I
      // 008: aload 0
      // 009: getfield p8a.hvk Lt_2;
      // 00c: invokevirtual t_2.ov7 ()I
      // 00f: istore 3
      // 010: aload 0
      // 011: getfield p8a.hvk Lt_2;
      // 014: invokevirtual t_2.x03 ()I
      // 017: istore 4
      // 019: istore 1
      // 01a: iload 4
      // 01c: aload 0
      // 01d: getfield p8a.hvk Lt_2;
      // 020: invokevirtual t_2.ov7 ()I
      // 023: if_icmpge 06c
      // 026: aload 0
      // 027: iload 1
      // 028: ifne 06d
      // 02b: getfield p8a.hvk Lt_2;
      // 02e: iload 4
      // 030: invokevirtual t_2.q6_ (I)Lmux;
      // 033: getfield mux.ztw I
      // 036: iload 1
      // 037: ifne 059
      // 03a: goto 041
      // 03d: invokestatic p8a.b (Loov;)Loov;
      // 040: athrow
      // 041: aload 2
      // 042: getfield fqr.gn5 D
      // 045: d2i
      // 046: if_icmpeq 05e
      // 049: goto 050
      // 04c: invokestatic p8a.b (Loov;)Loov;
      // 04f: athrow
      // 050: iload 4
      // 052: goto 059
      // 055: invokestatic p8a.b (Loov;)Loov;
      // 058: athrow
      // 059: istore 3
      // 05a: iload 1
      // 05b: ifeq 06c
      // 05e: iinc 4 1
      // 061: iload 1
      // 062: ifeq 01a
      // 065: goto 06c
      // 068: invokestatic p8a.b (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: getfield p8a.wxo Lyqv;
      // 070: getfield yqv.uo6 F
      // 073: aload 0
      // 074: getfield p8a.wxo Lyqv;
      // 077: getfield yqv.uo6 F
      // 07a: fmul
      // 07b: aload 0
      // 07c: getfield p8a.bn3 F
      // 07f: fmul
      // 080: fstore 4
      // 082: aload 0
      // 083: getfield p8a.hvk Lt_2;
      // 086: invokevirtual t_2.x03 ()I
      // 089: istore 5
      // 08b: iload 5
      // 08d: iload 3
      // 08e: if_icmpge 0dc
      // 091: aload 0
      // 092: getfield p8a.hvk Lt_2;
      // 095: aload 0
      // 096: getfield p8a.wxo Lyqv;
      // 099: iload 5
      // 09b: invokevirtual t_2._qy (Li2h;I)Lfqr;
      // 09e: astore 6
      // 0a0: iload 1
      // 0a1: ifne 0d8
      // 0a4: aload 2
      // 0a5: aload 6
      // 0a7: invokevirtual fqr.y8x (Lfqr;)D
      // 0aa: fload 4
      // 0ac: f2d
      // 0ad: dcmpg
      // 0ae: iload 1
      // 0af: ifne 0f2
      // 0b2: goto 0b9
      // 0b5: invokestatic p8a.b (Loov;)Loov;
      // 0b8: athrow
      // 0b9: ifge 0d5
      // 0bc: goto 0c3
      // 0bf: invokestatic p8a.b (Loov;)Loov;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: getfield p8a.hvk Lt_2;
      // 0c7: iload 5
      // 0c9: bipush 1
      // 0ca: iadd
      // 0cb: invokevirtual t_2.lkx (I)V
      // 0ce: goto 0d5
      // 0d1: invokestatic p8a.b (Loov;)Loov;
      // 0d4: athrow
      // 0d5: iinc 5 1
      // 0d8: iload 1
      // 0d9: ifeq 08b
      // 0dc: aload 0
      // 0dd: getfield p8a.wxo Lyqv;
      // 0e0: getfield yqv.uo6 F
      // 0e3: invokestatic fe6.v1i (F)I
      // 0e6: istore 5
      // 0e8: aload 0
      // 0e9: getfield p8a.wxo Lyqv;
      // 0ec: getfield yqv.ikl F
      // 0ef: f2i
      // 0f0: bipush 1
      // 0f1: iadd
      // 0f2: istore 6
      // 0f4: iload 5
      // 0f6: istore 7
      // 0f8: iload 3
      // 0f9: bipush 1
      // 0fa: isub
      // 0fb: istore 8
      // 0fd: iload 8
      // 0ff: aload 0
      // 100: getfield p8a.hvk Lt_2;
      // 103: invokevirtual t_2.x03 ()I
      // 106: if_icmplt 15c
      // 109: aload 0
      // 10a: iload 1
      // 10b: ifne 142
      // 10e: aload 2
      // 10f: iload 1
      // 110: ifne 15e
      // 113: goto 11a
      // 116: invokestatic p8a.b (Loov;)Loov;
      // 119: athrow
      // 11a: aload 0
      // 11b: getfield p8a.hvk Lt_2;
      // 11e: aload 0
      // 11f: getfield p8a.wxo Lyqv;
      // 122: iload 8
      // 124: invokevirtual t_2._qy (Li2h;I)Lfqr;
      // 127: iload 5
      // 129: iload 6
      // 12b: iload 7
      // 12d: invokevirtual p8a.spw (Lfqr;Lfqr;III)Z
      // 130: ifeq 14e
      // 133: goto 13a
      // 136: invokestatic p8a.b (Loov;)Loov;
      // 139: athrow
      // 13a: aload 0
      // 13b: goto 142
      // 13e: invokestatic p8a.b (Loov;)Loov;
      // 141: athrow
      // 142: getfield p8a.hvk Lt_2;
      // 145: iload 8
      // 147: invokevirtual t_2.lkx (I)V
      // 14a: iload 1
      // 14b: ifeq 15c
      // 14e: iinc 8 -1
      // 151: iload 1
      // 152: ifeq 0fd
      // 155: goto 15c
      // 158: invokestatic p8a.b (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 0
      // 15d: aload 2
      // 15e: invokevirtual p8a.isn (Lfqr;)V
      // 161: return
   }

   public void isn(fqr param1) {
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
      // 05: getfield p8a.zo7 I
      // 08: aload 0
      // 09: getfield p8a.e7l I
      // 0c: isub
      // 0d: iload 2
      // 0e: ifne 30
      // 11: bipush 100
      // 13: if_icmple 4b
      // 16: goto 1d
      // 19: invokestatic p8a.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 0
      // 1f: getfield p8a.wkw Lfqr;
      // 22: invokevirtual fqr.y8x (Lfqr;)D
      // 25: ldc2_w 2.25
      // 28: dcmpg
      // 29: goto 30
      // 2c: invokestatic p8a.b (Loov;)Loov;
      // 2f: athrow
      // 30: ifge 3e
      // 33: aload 0
      // 34: invokevirtual p8a.pj2 ()V
      // 37: goto 3e
      // 3a: invokestatic p8a.b (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 0
      // 40: getfield p8a.zo7 I
      // 43: putfield p8a.e7l I
      // 46: aload 0
      // 47: aload 1
      // 48: putfield p8a.wkw Lfqr;
      // 4b: return
   }

   public boolean j07() {
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
      // 05: getfield p8a.hvk Lt_2;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 32
      // 0f: goto 16
      // 12: invokestatic p8a.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield p8a.hvk Lt_2;
      // 1a: goto 21
      // 1d: invokestatic p8a.b (Loov;)Loov;
      // 20: athrow
      // 21: invokevirtual t_2.gdm ()Z
      // 24: iload 1
      // 25: ifeq 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic p8a.b (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void pj2() {
      this.hvk = null;
   }

   public abstract fqr a7k();

   public abstract boolean a52();

   public boolean y2a() {
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
      // 05: getfield p8a.wxo Lyqv;
      // 08: invokevirtual yqv.mwv ()Z
      // 0b: iload 1
      // 0c: ifeq 36
      // 0f: ifne 35
      // 12: goto 19
      // 15: invokestatic p8a.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield p8a.wxo Lyqv;
      // 1d: invokevirtual yqv.b2u ()Z
      // 20: iload 1
      // 21: ifeq 36
      // 24: goto 2b
      // 27: invokestatic p8a.b (Loov;)Loov;
      // 2a: athrow
      // 2b: ifeq 39
      // 2e: goto 35
      // 31: invokestatic p8a.b (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   public void fzq() {
   }

   public abstract boolean spw(fqr var1, fqr var2, int var3, int var4, int var5);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-404855309025276739L, -9157575201642365380L, MethodHandles.lookup().lookupClass()).a(22217197009150L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 118590564245905L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "¼\u0001¡q\u0092¾\u0096x\u0084rÏ\\ñÿI%\u0082\u008f¡gI¨Êë KÍµ\u001bü\u0007nÆ«xº\u0093f\u008aÏ[Þ8ÍÃ«·\u001163\u0016\u001d\u0001Õ£¿²";
      int var8 = "¼\u0001¡q\u0092¾\u0096x\u0084rÏ\\ñÿI%\u0082\u008f¡gI¨Êë KÍµ\u001bü\u0007nÆ«xº\u0093f\u008aÏ[Þ8ÍÃ«·\u001163\u0016\u001d\u0001Õ£¿²".length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8981;
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
            throw new RuntimeException("p8a", var10);
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
         throw new RuntimeException("p8a" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
