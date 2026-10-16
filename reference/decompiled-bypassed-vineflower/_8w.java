import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _8w extends sq9 {
   public static final zb_ sqt;
   public static final h76 hyx;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public _8w() {
      super(p3y._mr);
      this.y8l(this._8_.c32().zvi(sqt, _8w$mc6.jen).zvi(hyx, false));
      this.cot();
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _8w.b J
      // 003: ldc2_w 58434820213636
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic t9d.c ()I
      // 00c: istore 11
      // 00e: aload 1
      // 00f: getfield t9d.v0f Z
      // 012: iload 11
      // 014: ifne 022
      // 017: ifeq 023
      // 01a: goto 021
      // 01d: invokestatic _8w.a (Loov;)Loov;
      // 020: athrow
      // 021: bipush 1
      // 022: ireturn
      // 023: aload 3
      // 024: iload 11
      // 026: ifne 05b
      // 029: getstatic _8w.sqt Lzb_;
      // 02c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 031: getstatic _8w$mc6.ang L_8w$mc6;
      // 034: if_acmpeq 06a
      // 037: goto 03e
      // 03a: invokestatic _8w.a (Loov;)Loov;
      // 03d: athrow
      // 03e: aload 2
      // 03f: aload 3
      // 040: getstatic _8w.em9 Lqx_;
      // 043: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 048: checkcast vt2
      // 04b: invokevirtual mew.offset (Lvt2;)Lmew;
      // 04e: astore 2
      // 04f: aload 1
      // 050: iload 11
      // 052: ifne 06b
      // 055: aload 2
      // 056: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 059: astore 3
      // 05a: aload 3
      // 05b: invokeinterface zfz.r_y ()Le0x; 1
      // 060: aload 0
      // 061: if_acmpeq 06a
      // 064: bipush 1
      // 065: ireturn
      // 066: invokestatic _8w.a (Loov;)Loov;
      // 069: athrow
      // 06a: aload 1
      // 06b: getfield t9d.vzz Lupn;
      // 06e: invokevirtual upn.vm6 ()Z
      // 071: iload 11
      // 073: ifne 1ba
      // 076: ifeq 1b5
      // 079: goto 080
      // 07c: invokestatic _8w.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 1
      // 081: aload 2
      // 082: iload 11
      // 084: ifne 1b7
      // 087: goto 08e
      // 08a: invokestatic _8w.a (Loov;)Loov;
      // 08d: athrow
      // 08e: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 091: getstatic gyu.ygn Lgyu;
      // 094: if_acmpeq 1b5
      // 097: goto 09e
      // 09a: invokestatic _8w.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 3
      // 09f: getstatic _8w.hyx Lh76;
      // 0a2: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0a7: checkcast java/lang/Boolean
      // 0aa: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ad: ifeq 10b
      // 0b0: goto 0b7
      // 0b3: invokestatic _8w.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: aload 1
      // 0b9: aload 2
      // 0ba: invokespecial _8w.cpf (Lt9d;Lmew;)Lha9;
      // 0bd: astore 12
      // 0bf: iload 11
      // 0c1: ifne 103
      // 0c4: aload 12
      // 0c6: ifnull 0f5
      // 0c9: goto 0d0
      // 0cc: invokestatic _8w.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 4
      // 0d2: new hsu
      // 0d5: dup
      // 0d6: sipush 12473
      // 0d9: ldc2_w 409903188721625447
      // 0dc: lload 9
      // 0de: lxor
      // 0df: invokedynamic x (IJ)Ljava/lang/String; bsm=_8w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: bipush 0
      // 0e6: anewarray 141
      // 0e9: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0ec: invokevirtual ha9.tog (Lekw;)V
      // 0ef: bipush 1
      // 0f0: ireturn
      // 0f1: invokestatic _8w.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 3
      // 0f6: getstatic _8w.hyx Lh76;
      // 0f9: bipush 0
      // 0fa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0fd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 102: astore 3
      // 103: aload 1
      // 104: aload 2
      // 105: aload 3
      // 106: bipush 4
      // 107: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 10a: pop
      // 10b: aload 4
      // 10d: aload 2
      // 10e: invokevirtual ha9.zv1 (Lmew;)Lha9$o7a;
      // 111: astore 12
      // 113: aload 12
      // 115: getstatic ha9$o7a.xdw Lha9$o7a;
      // 118: iload 11
      // 11a: ifne 144
      // 11d: if_acmpne 13f
      // 120: goto 127
      // 123: invokestatic _8w.a (Loov;)Loov;
      // 126: athrow
      // 127: aload 3
      // 128: getstatic _8w.hyx Lh76;
      // 12b: bipush 1
      // 12c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 12f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 134: astore 3
      // 135: aload 1
      // 136: aload 2
      // 137: aload 3
      // 138: bipush 4
      // 139: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 13c: pop
      // 13d: bipush 1
      // 13e: ireturn
      // 13f: aload 12
      // 141: getstatic ha9$o7a.ar_ Lha9$o7a;
      // 144: iload 11
      // 146: ifne 18a
      // 149: if_acmpne 17e
      // 14c: goto 153
      // 14f: invokestatic _8w.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 4
      // 155: new hsu
      // 158: dup
      // 159: sipush 1663
      // 15c: ldc2_w 5947460493838802851
      // 15f: lload 9
      // 161: lxor
      // 162: invokedynamic x (IJ)Ljava/lang/String; bsm=_8w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: nop
      // 168: bipush 0
      // 169: anewarray 141
      // 16c: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 16f: invokevirtual ha9.tog (Lekw;)V
      // 172: iload 11
      // 174: ifeq 1b3
      // 177: goto 17e
      // 17a: invokestatic _8w.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 12
      // 180: getstatic ha9$o7a.cl6 Lha9$o7a;
      // 183: goto 18a
      // 186: invokestatic _8w.a (Loov;)Loov;
      // 189: athrow
      // 18a: if_acmpne 1b3
      // 18d: aload 4
      // 18f: new hsu
      // 192: dup
      // 193: sipush 21736
      // 196: ldc2_w 4602113061542595890
      // 199: lload 9
      // 19b: lxor
      // 19c: invokedynamic x (IJ)Ljava/lang/String; bsm=_8w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: nop
      // 1a2: bipush 0
      // 1a3: anewarray 141
      // 1a6: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1a9: invokevirtual ha9.tog (Lekw;)V
      // 1ac: goto 1b3
      // 1af: invokestatic _8w.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: bipush 1
      // 1b4: ireturn
      // 1b5: aload 1
      // 1b6: aload 2
      // 1b7: invokevirtual t9d.i6x (Lmew;)Z
      // 1ba: pop
      // 1bb: aload 2
      // 1bc: aload 3
      // 1bd: getstatic _8w.em9 Lqx_;
      // 1c0: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1c5: checkcast vt2
      // 1c8: invokevirtual vt2.b4b ()Lvt2;
      // 1cb: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1ce: astore 12
      // 1d0: aload 1
      // 1d1: iload 11
      // 1d3: ifne 1fa
      // 1d6: aload 12
      // 1d8: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1db: invokeinterface zfz.r_y ()Le0x; 1
      // 1e0: aload 0
      // 1e1: if_acmpne 1f9
      // 1e4: goto 1eb
      // 1e7: invokestatic _8w.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: aload 1
      // 1ec: aload 12
      // 1ee: invokevirtual t9d.i6x (Lmew;)Z
      // 1f1: pop
      // 1f2: goto 1f9
      // 1f5: invokestatic _8w.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: aload 1
      // 1fa: aconst_null
      // 1fb: checkcast i2h
      // 1fe: aload 2
      // 1ff: invokevirtual mew.getX ()I
      // 202: i2d
      // 203: ldc2_w 0.5
      // 206: dadd
      // 207: aload 2
      // 208: invokevirtual mew.getY ()I
      // 20b: i2d
      // 20c: ldc2_w 0.5
      // 20f: dadd
      // 210: aload 2
      // 211: invokevirtual mew.getZ ()I
      // 214: i2d
      // 215: ldc2_w 0.5
      // 218: dadd
      // 219: ldc 5.0
      // 21b: nop
      // 21c: bipush 1
      // 21d: bipush 1
      // 21e: invokevirtual t9d.dta (Li2h;DDDFZZ)Lvu6;
      // 221: pop
      // 222: bipush 1
      // 223: ireturn
   }

   private ha9 cpf(t9d param1, mew param2) {
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
      // 05: getfield t9d.rpk Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 4
      // 0f: aload 4
      // 11: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 16: ifeq 5d
      // 19: aload 4
      // 1b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 20: checkcast ha9
      // 23: astore 5
      // 25: aload 5
      // 27: invokevirtual ha9.ofg ()Z
      // 2a: iload 3
      // 2b: ifne 53
      // 2e: ifeq 59
      // 31: goto 38
      // 34: invokestatic _8w.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 5
      // 3a: iload 3
      // 3b: ifne 58
      // 3e: goto 45
      // 41: invokestatic _8w.a (Loov;)Loov;
      // 44: athrow
      // 45: getfield ha9.ndt Lmew;
      // 48: aload 2
      // 49: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 4c: goto 53
      // 4f: invokestatic _8w.a (Loov;)Loov;
      // 52: athrow
      // 53: ifeq 59
      // 56: aload 5
      // 58: areturn
      // 59: iload 3
      // 5a: ifeq 0f
      // 5d: aconst_null
      // 5e: areturn
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.cot();
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic _8w.em9 Lqx_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast vt2
      // 11: astore 6
      // 13: aload 3
      // 14: iload 5
      // 16: ifeq 86
      // 19: getstatic _8w.sqt Lzb_;
      // 1c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 21: getstatic _8w$mc6.ang L_8w$mc6;
      // 24: if_acmpne 69
      // 27: goto 2e
      // 2a: invokestatic _8w.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 1
      // 2f: aload 2
      // 30: aload 6
      // 32: invokevirtual vt2.b4b ()Lvt2;
      // 35: invokevirtual mew.offset (Lvt2;)Lmew;
      // 38: iload 5
      // 3a: ifeq 60
      // 3d: goto 44
      // 40: invokestatic _8w.a (Loov;)Loov;
      // 43: athrow
      // 44: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 47: invokeinterface zfz.r_y ()Le0x; 1
      // 4c: aload 0
      // 4d: if_acmpeq b2
      // 50: goto 57
      // 53: invokestatic _8w.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 1
      // 58: aload 2
      // 59: goto 60
      // 5c: invokestatic _8w.a (Loov;)Loov;
      // 5f: athrow
      // 60: invokevirtual t9d.i6x (Lmew;)Z
      // 63: pop
      // 64: iload 5
      // 66: ifne b2
      // 69: aload 1
      // 6a: aload 2
      // 6b: aload 6
      // 6d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 70: iload 5
      // 72: ifeq 98
      // 75: goto 7c
      // 78: invokestatic _8w.a (Loov;)Loov;
      // 7b: athrow
      // 7c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7f: goto 86
      // 82: invokestatic _8w.a (Loov;)Loov;
      // 85: athrow
      // 86: invokeinterface zfz.r_y ()Le0x; 1
      // 8b: aload 0
      // 8c: if_acmpeq b2
      // 8f: aload 1
      // 90: aload 2
      // 91: goto 98
      // 94: invokestatic _8w.a (Loov;)Loov;
      // 97: athrow
      // 98: invokevirtual t9d.i6x (Lmew;)Z
      // 9b: pop
      // 9c: aload 1
      // 9d: getfield t9d.v0f Z
      // a0: ifne b2
      // a3: aload 0
      // a4: aload 1
      // a5: aload 2
      // a6: aload 3
      // a7: bipush 0
      // a8: invokevirtual _8w.lf0 (Lt9d;Lmew;Lzfz;I)V
      // ab: goto b2
      // ae: invokestatic _8w.a (Loov;)Loov;
      // b1: athrow
      // b2: return
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      try {
         if (var1.dil(sqt) == _8w$mc6.ang) {
            return null;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return xbr.u17;
   }

   private void cot() {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   public static mew fay(t9d param0, mew param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 05: getstatic _8w.em9 Lqx_;
      // 08: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d: checkcast vt2
      // 10: astore 4
      // 12: aload 1
      // 13: invokevirtual mew.getX ()I
      // 16: istore 5
      // 18: aload 1
      // 19: invokevirtual mew.getY ()I
      // 1c: istore 6
      // 1e: invokestatic t9d.b ()I
      // 21: aload 1
      // 22: invokevirtual mew.getZ ()I
      // 25: istore 7
      // 27: istore 3
      // 28: bipush 0
      // 29: istore 8
      // 2b: iload 8
      // 2d: bipush 1
      // 2e: if_icmpgt c6
      // 31: iload 5
      // 33: aload 4
      // 35: invokevirtual vt2.n67 ()I
      // 38: iload 8
      // 3a: imul
      // 3b: isub
      // 3c: bipush 1
      // 3d: isub
      // 3e: istore 9
      // 40: iload 7
      // 42: aload 4
      // 44: invokevirtual vt2.ozy ()I
      // 47: iload 8
      // 49: imul
      // 4a: isub
      // 4b: bipush 1
      // 4c: isub
      // 4d: istore 10
      // 4f: iload 9
      // 51: bipush 2
      // 52: iadd
      // 53: istore 11
      // 55: iload 10
      // 57: bipush 2
      // 58: iadd
      // 59: istore 12
      // 5b: iload 9
      // 5d: istore 13
      // 5f: iload 13
      // 61: iload 11
      // 63: if_icmpgt bf
      // 66: iload 10
      // 68: iload 3
      // 69: ifeq 2d
      // 6c: istore 14
      // 6e: iload 14
      // 70: iload 12
      // 72: if_icmpgt b8
      // 75: new mew
      // 78: dup
      // 79: iload 13
      // 7b: iload 6
      // 7d: iload 14
      // 7f: invokespecial mew.<init> (III)V
      // 82: astore 15
      // 84: iload 3
      // 85: ifeq b4
      // 88: aload 0
      // 89: aload 15
      // 8b: invokestatic _8w.mq5 (Lt9d;Lmew;)Z
      // 8e: iload 3
      // 8f: ifeq 61
      // 92: goto 99
      // 95: invokestatic _8w.a (Loov;)Loov;
      // 98: athrow
      // 99: ifeq b1
      // 9c: iload 2
      // 9d: ifgt ae
      // a0: goto a7
      // a3: invokestatic _8w.a (Loov;)Loov;
      // a6: athrow
      // a7: aload 15
      // a9: areturn
      // aa: invokestatic _8w.a (Loov;)Loov;
      // ad: athrow
      // ae: iinc 2 -1
      // b1: iinc 14 1
      // b4: iload 3
      // b5: ifne 6e
      // b8: iinc 13 1
      // bb: iload 3
      // bc: ifne 5f
      // bf: iinc 8 1
      // c2: iload 3
      // c3: ifne 2b
      // c6: aconst_null
      // c7: areturn
   }

   public static boolean mq5(t9d param0, mew param1) {
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
      // 05: aload 1
      // 06: invokevirtual mew.eve ()Lmew;
      // 09: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 0c: iload 2
      // 0d: ifne 31
      // 10: ifeq 6b
      // 13: goto 1a
      // 16: invokestatic _8w.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1f: invokeinterface zfz.r_y ()Le0x; 1
      // 24: invokevirtual e0x.p1r ()Lp3y;
      // 27: invokevirtual p3y.gk6 ()Z
      // 2a: goto 31
      // 2d: invokestatic _8w.a (Loov;)Loov;
      // 30: athrow
      // 31: iload 2
      // 32: ifne 59
      // 35: ifne 6b
      // 38: goto 3f
      // 3b: invokestatic _8w.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: aload 1
      // 41: invokevirtual mew.nuv ()Lmew;
      // 44: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 47: invokeinterface zfz.r_y ()Le0x; 1
      // 4c: invokevirtual e0x.p1r ()Lp3y;
      // 4f: invokevirtual p3y.gk6 ()Z
      // 52: goto 59
      // 55: invokestatic _8w.a (Loov;)Loov;
      // 58: athrow
      // 59: iload 2
      // 5a: ifne 68
      // 5d: ifne 6b
      // 60: goto 67
      // 63: invokestatic _8w.a (Loov;)Loov;
      // 66: athrow
      // 67: bipush 1
      // 68: goto 6c
      // 6b: bipush 0
      // 6c: ireturn
   }

   @Override
   public void ix7(t9d var1, mew var2, zfz var3, float var4, int var5) {
      try {
         if (var3.dil(sqt) == _8w$mc6.jen) {
            super.ix7(var1, var2, var3, var4, 0);
         }
      } catch (oov var6) {
         throw a(var6);
      }
   }

   @Override
   public int quv() {
      return 1;
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return xbr.u17;
   }

   @Override
   public void f51(t9d param1, mew param2, zfz param3, ha9 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 4
      // 07: getfield ha9.lls Lpj2;
      // 0a: getfield pj2.g40 Z
      // 0d: ifeq 64
      // 10: aload 3
      // 11: getstatic _8w.sqt Lzb_;
      // 14: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 19: getstatic _8w$mc6.ang L_8w$mc6;
      // 1c: if_acmpne 64
      // 1f: goto 26
      // 22: invokestatic _8w.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: aload 3
      // 28: getstatic _8w.em9 Lqx_;
      // 2b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 30: checkcast vt2
      // 33: invokevirtual vt2.b4b ()Lvt2;
      // 36: invokevirtual mew.offset (Lvt2;)Lmew;
      // 39: astore 6
      // 3b: aload 1
      // 3c: aload 6
      // 3e: iload 5
      // 40: ifeq 60
      // 43: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 46: invokeinterface zfz.r_y ()Le0x; 1
      // 4b: aload 0
      // 4c: if_acmpne 64
      // 4f: goto 56
      // 52: invokestatic _8w.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 1
      // 57: aload 6
      // 59: goto 60
      // 5c: invokestatic _8w.a (Loov;)Loov;
      // 5f: athrow
      // 60: invokevirtual t9d.i6x (Lmew;)Z
      // 63: pop
      // 64: return
   }

   @Override
   public zfz kig(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: invokestatic vt2.bm6 (I)Lvt2;
      // 08: astore 3
      // 09: iload 1
      // 0a: bipush 8
      // 0c: iand
      // 0d: ifle 53
      // 10: aload 0
      // 11: invokevirtual _8w.l4i ()Lzfz;
      // 14: getstatic _8w.sqt Lzb_;
      // 17: getstatic _8w$mc6.ang L_8w$mc6;
      // 1a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1f: getstatic _8w.em9 Lqx_;
      // 22: aload 3
      // 23: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 28: getstatic _8w.hyx Lh76;
      // 2b: iload 1
      // 2c: bipush 4
      // 2d: iand
      // 2e: iload 2
      // 2f: ifne 44
      // 32: goto 39
      // 35: invokestatic _8w.a (Loov;)Loov;
      // 38: athrow
      // 39: ifle 47
      // 3c: goto 43
      // 3f: invokestatic _8w.a (Loov;)Loov;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: bipush 0
      // 48: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 50: goto 6b
      // 53: aload 0
      // 54: invokevirtual _8w.l4i ()Lzfz;
      // 57: getstatic _8w.sqt Lzb_;
      // 5a: getstatic _8w$mc6.jen L_8w$mc6;
      // 5d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 62: getstatic _8w.em9 Lqx_;
      // 65: aload 3
      // 66: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6b: areturn
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      int var4 = t9d.b();

      try {
         if (var4 == 0) {
            return var1;
         }

         if (var1.dil(sqt) != _8w$mc6.jen) {
            return var1;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      zfz var5 = var2.getBlockState(var3.offset((vt2)var1.dil(em9)));

      try {
         if (var4 == 0) {
            return var5;
         }

         if (var5.r_y() != this) {
            return var1;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return var1.zvi(hyx, var5.dil(hyx));
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = t9d.c();
      int var3 = 0;
      int var10000 = var3 | ((vt2)var1.dil(em9)).tmy();
      if (var2 == 0) {
         var3 = var10000;
         label24:
         if (var1.dil(sqt) == _8w$mc6.ang) {
            var3 |= 8;

            try {
               byte var6 = (Boolean)var1.dil(hyx);
               if (var2 != 0) {
                  return var6;
               }

               if (var6 == 0) {
                  break label24;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var3 |= 4;
         }

         var10000 = var3;
      }

      return var10000;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{em9, sqt, hyx});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2659006492219154465L, 3176348416122074845L, MethodHandles.lookup().lookupClass()).a(94894018849508L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 60016193376865L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "¶|\u0099\u0013\b\u0096Zi¦Pú¿=ÅëÎ\u009eê>\u001aO¨b_ø\u0019Yõ\u001f¶×@©.\u0018Q\u00933¥û\u0010 \u008bJ.ùÐ`o\u0094\u008c1\u009a\u007f\u009em½ \u0083Æ\u000b÷x!\u008a\u0019\u009fªSÕR \u0097?\u0096ZIØµU¿B\u00adÌ\u0007ÝàZ¹¸";
      int var6 = "¶|\u0099\u0013\b\u0096Zi¦Pú¿=ÅëÎ\u009eê>\u001aO¨b_ø\u0019Yõ\u001f¶×@©.\u0018Q\u00933¥û\u0010 \u008bJ.ùÐ`o\u0094\u008c1\u009a\u007f\u009em½ \u0083Æ\u000b÷x!\u008a\u0019\u009fªSÕR \u0097?\u0096ZIØµU¿B\u00adÌ\u0007ÝàZ¹¸"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[5];
                     sqt = zb_.pq4(b<"x">(31308, 7389010019390896758L ^ var9), _8w$mc6.class);
                     hyx = h76.d_1(b<"x">(14370, 1269666009130530842L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = " \u008f\u0093èµá©Zâ\u009eÑÈÎü¾¨Ê\u0098g.\u0001ëêL(bÄÅÝ§¤Ô¬\u0096^%ôB\u008aÍ\u0010L¸0Da÷¿\u001c\u0002§\u0093G\u0015Iç\u009f\u0098ØºOêtR§";
                  var6 = " \u008f\u0093èµá©Zâ\u009eÑÈÎü¾¨Ê\u0098g.\u0001ëêL(bÄÅÝ§¤Ô¬\u0096^%ôB\u008aÍ\u0010L¸0Da÷¿\u001c\u0002§\u0093G\u0015Iç\u009f\u0098ØºOêtR§"
                     .length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29035;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("_8w", var10);
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
         h[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("_8w" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
