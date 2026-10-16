import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qd_ extends _zk {
   public static ArrayList oyx;
   public static int k58;
   public static int bvp;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public qd_(Minecraft var1, nn2 var2) {
      super(var1, var2.dt7, var2.o1e, 36, var2.o1e - 56, 30);
      this.piy = var2;
   }

   public static void mpj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: bipush 0
      // 00c: putstatic qd_.k58 I
      // 00f: bipush 0
      // 010: putstatic qd_.bvp I
      // 013: istore 0
      // 014: bipush 0
      // 015: istore 2
      // 016: iload 2
      // 017: getstatic qd_.oyx Ljava/util/ArrayList;
      // 01a: invokevirtual java/util/ArrayList.size ()I
      // 01d: if_icmpge 060
      // 020: getstatic qd_.oyx Ljava/util/ArrayList;
      // 023: iload 2
      // 024: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 027: checkcast x1l
      // 02a: invokevirtual x1l.wvc ()Z
      // 02d: iload 0
      // 02e: ifeq 061
      // 031: iload 0
      // 032: ifeq 058
      // 035: goto 03c
      // 038: invokestatic qd_.a (Loov;)Loov;
      // 03b: athrow
      // 03c: ifeq 059
      // 03f: goto 046
      // 042: invokestatic qd_.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 1
      // 047: getstatic qd_.oyx Ljava/util/ArrayList;
      // 04a: iload 2
      // 04b: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 04e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 051: goto 058
      // 054: invokestatic qd_.a (Loov;)Loov;
      // 057: athrow
      // 058: pop
      // 059: iinc 2 1
      // 05c: iload 0
      // 05d: ifne 016
      // 060: bipush 0
      // 061: istore 2
      // 062: iload 2
      // 063: getstatic qd_.oyx Ljava/util/ArrayList;
      // 066: invokevirtual java/util/ArrayList.size ()I
      // 069: if_icmpge 0ce
      // 06c: getstatic qd_.oyx Ljava/util/ArrayList;
      // 06f: iload 2
      // 070: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 073: checkcast x1l
      // 076: invokevirtual x1l.s2l ()Z
      // 079: iload 0
      // 07a: ifeq 0cf
      // 07d: iload 0
      // 07e: ifeq 0a6
      // 081: goto 088
      // 084: invokestatic qd_.a (Loov;)Loov;
      // 087: athrow
      // 088: ifne 0c7
      // 08b: goto 092
      // 08e: invokestatic qd_.a (Loov;)Loov;
      // 091: athrow
      // 092: getstatic qd_.oyx Ljava/util/ArrayList;
      // 095: iload 2
      // 096: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 099: checkcast x1l
      // 09c: invokevirtual x1l.wvc ()Z
      // 09f: goto 0a6
      // 0a2: invokestatic qd_.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: iload 0
      // 0a7: ifeq 0c6
      // 0aa: ifne 0c7
      // 0ad: goto 0b4
      // 0b0: invokestatic qd_.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 1
      // 0b5: getstatic qd_.oyx Ljava/util/ArrayList;
      // 0b8: iload 2
      // 0b9: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0bc: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0bf: goto 0c6
      // 0c2: invokestatic qd_.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: pop
      // 0c7: iinc 2 1
      // 0ca: iload 0
      // 0cb: ifne 062
      // 0ce: bipush 0
      // 0cf: istore 2
      // 0d0: iload 2
      // 0d1: getstatic qd_.oyx Ljava/util/ArrayList;
      // 0d4: invokevirtual java/util/ArrayList.size ()I
      // 0d7: if_icmpge 13c
      // 0da: getstatic qd_.oyx Ljava/util/ArrayList;
      // 0dd: iload 2
      // 0de: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0e1: checkcast x1l
      // 0e4: invokevirtual x1l.s2l ()Z
      // 0e7: iload 0
      // 0e8: ifeq 13d
      // 0eb: iload 0
      // 0ec: ifeq 114
      // 0ef: goto 0f6
      // 0f2: invokestatic qd_.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: ifeq 135
      // 0f9: goto 100
      // 0fc: invokestatic qd_.a (Loov;)Loov;
      // 0ff: athrow
      // 100: getstatic qd_.oyx Ljava/util/ArrayList;
      // 103: iload 2
      // 104: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 107: checkcast x1l
      // 10a: invokevirtual x1l.wvc ()Z
      // 10d: goto 114
      // 110: invokestatic qd_.a (Loov;)Loov;
      // 113: athrow
      // 114: iload 0
      // 115: ifeq 134
      // 118: ifne 135
      // 11b: goto 122
      // 11e: invokestatic qd_.a (Loov;)Loov;
      // 121: athrow
      // 122: aload 1
      // 123: getstatic qd_.oyx Ljava/util/ArrayList;
      // 126: iload 2
      // 127: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 12a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 12d: goto 134
      // 130: invokestatic qd_.a (Loov;)Loov;
      // 133: athrow
      // 134: pop
      // 135: iinc 2 1
      // 138: iload 0
      // 139: ifne 0d0
      // 13c: bipush 0
      // 13d: istore 2
      // 13e: iload 2
      // 13f: aload 1
      // 140: invokevirtual java/util/ArrayList.size ()I
      // 143: if_icmpge 1dc
      // 146: bipush 0
      // 147: iload 0
      // 148: ifeq 1dd
      // 14b: istore 3
      // 14c: iload 3
      // 14d: aload 1
      // 14e: invokevirtual java/util/ArrayList.size ()I
      // 151: if_icmpge 1d5
      // 154: iload 2
      // 155: iload 0
      // 156: ifeq 188
      // 159: iload 3
      // 15a: iload 0
      // 15b: ifeq 143
      // 15e: goto 165
      // 161: invokestatic qd_.a (Loov;)Loov;
      // 164: athrow
      // 165: if_icmpeq 1ce
      // 168: aload 1
      // 169: iload 2
      // 16a: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 16d: checkcast x1l
      // 170: invokevirtual x1l.rii ()Ljava/lang/String;
      // 173: aload 1
      // 174: iload 3
      // 175: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 178: checkcast x1l
      // 17b: invokevirtual x1l.rii ()Ljava/lang/String;
      // 17e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 181: goto 188
      // 184: invokestatic qd_.a (Loov;)Loov;
      // 187: athrow
      // 188: iload 0
      // 189: ifeq 1b3
      // 18c: ifeq 1ce
      // 18f: goto 196
      // 192: invokestatic qd_.a (Loov;)Loov;
      // 195: athrow
      // 196: aload 1
      // 197: iload 2
      // 198: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 19b: checkcast x1l
      // 19e: iload 0
      // 19f: ifeq 1cd
      // 1a2: goto 1a9
      // 1a5: invokestatic qd_.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: invokevirtual x1l.s2l ()Z
      // 1ac: goto 1b3
      // 1af: invokestatic qd_.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 1
      // 1b4: iload 3
      // 1b5: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1b8: checkcast x1l
      // 1bb: invokevirtual x1l.s2l ()Z
      // 1be: if_icmpne 1ce
      // 1c1: aload 1
      // 1c2: iload 3
      // 1c3: invokevirtual java/util/ArrayList.remove (I)Ljava/lang/Object;
      // 1c6: goto 1cd
      // 1c9: invokestatic qd_.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: pop
      // 1ce: iinc 3 1
      // 1d1: iload 0
      // 1d2: ifne 14c
      // 1d5: iinc 2 1
      // 1d8: iload 0
      // 1d9: ifne 13e
      // 1dc: bipush 0
      // 1dd: istore 2
      // 1de: iload 2
      // 1df: aload 1
      // 1e0: invokevirtual java/util/ArrayList.size ()I
      // 1e3: if_icmpge 233
      // 1e6: aload 1
      // 1e7: iload 0
      // 1e8: ifeq 234
      // 1eb: iload 2
      // 1ec: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1ef: checkcast x1l
      // 1f2: invokevirtual x1l.s2l ()Z
      // 1f5: iload 0
      // 1f6: ifeq 229
      // 1f9: goto 200
      // 1fc: invokestatic qd_.a (Loov;)Loov;
      // 1ff: athrow
      // 200: ifeq 21d
      // 203: goto 20a
      // 206: invokestatic qd_.a (Loov;)Loov;
      // 209: athrow
      // 20a: getstatic qd_.bvp I
      // 20d: bipush 1
      // 20e: iadd
      // 20f: putstatic qd_.bvp I
      // 212: iload 0
      // 213: ifne 22c
      // 216: goto 21d
      // 219: invokestatic qd_.a (Loov;)Loov;
      // 21c: athrow
      // 21d: getstatic qd_.k58 I
      // 220: bipush 1
      // 221: iadd
      // 222: goto 229
      // 225: invokestatic qd_.a (Loov;)Loov;
      // 228: athrow
      // 229: putstatic qd_.k58 I
      // 22c: iinc 2 1
      // 22f: iload 0
      // 230: ifne 1de
      // 233: aload 1
      // 234: putstatic qd_.oyx Ljava/util/ArrayList;
      // 237: return
   }

   @Override
   public boolean ie8(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qd_.chy I
      // 08: iload 2
      // 09: ifne 1f
      // 0c: iload 1
      // 0d: if_icmpne 22
      // 10: goto 17
      // 13: invokestatic qd_.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic qd_.a (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   public int mww() {
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
      // 05: getfield qd_.chy I
      // 08: iload 1
      // 09: ifeq 31
      // 0c: getstatic qd_.oyx Ljava/util/ArrayList;
      // 0f: invokevirtual java/util/ArrayList.size ()I
      // 12: if_icmple 2d
      // 15: goto 1c
      // 18: invokestatic qd_.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getstatic qd_.oyx Ljava/util/ArrayList;
      // 20: invokevirtual java/util/ArrayList.size ()I
      // 23: putfield qd_.chy I
      // 26: goto 2d
      // 29: invokestatic qd_.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield qd_.chy I
      // 31: ireturn
   }

   @Override
   public int osm() {
      return oyx.size();
   }

   @Override
   public void f41(int param1, boolean param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifeq 22
      // 0b: iload 1
      // 0c: putfield qd_.chy I
      // 0f: iload 2
      // 10: ifeq 33
      // 13: goto 1a
      // 16: invokestatic qd_.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: goto 22
      // 1e: invokestatic qd_.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield qd_.piy Lnn2;
      // 25: new gt4
      // 28: dup
      // 29: bipush 0
      // 2a: bipush 0
      // 2b: bipush 0
      // 2c: aconst_null
      // 2d: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 30: invokevirtual nn2.actionPerformed (Lgt4;)V
      // 33: return
   }

   @Override
   public void lec() {
   }

   @Override
   public void bct(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qd_.a J
      // 003: ldc2_w 54780639836110
      // 006: lxor
      // 007: lstore 7
      // 009: getstatic qd_.oyx Ljava/util/ArrayList;
      // 00c: iload 1
      // 00d: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 010: checkcast x1l
      // 013: astore 10
      // 015: invokestatic OpaquePredicate.b ()I
      // 018: sipush 3553
      // 01b: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 01e: istore 9
      // 020: sipush 2884
      // 023: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 026: sipush 3042
      // 029: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 02c: invokestatic Minecraft.vz1 ()Lc05;
      // 02f: invokevirtual Minecraft.ee0 ()Lrh0;
      // 032: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 035: aload 10
      // 037: invokevirtual x1l.y0c ()Ljava/lang/String;
      // 03a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03d: iload 9
      // 03f: ifeq 130
      // 042: ifeq 0b8
      // 045: goto 04c
      // 048: invokestatic qd_.a (Loov;)Loov;
      // 04b: athrow
      // 04c: ldc 0.3
      // 04e: nop
      // 04f: invokestatic Minecraft.qgs ()J
      // 052: ldc2_w 10000
      // 055: lrem
      // 056: l2f
      // 057: ldc 10000.0
      // 059: nop
      // 05a: fdiv
      // 05b: ldc 3.1415927
      // 05d: nop
      // 05e: fmul
      // 05f: fconst_2
      // 060: fmul
      // 061: invokestatic fe6.rtn (F)F
      // 064: ldc 0.15
      // 066: nop
      // 067: fmul
      // 068: invokestatic fe6.sqg (F)F
      // 06b: fsub
      // 06c: fstore 11
      // 06e: fconst_0
      // 06f: fconst_1
      // 070: fconst_0
      // 071: fload 11
      // 073: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 076: bipush 7
      // 078: invokestatic org/lwjgl/opengl/GL11.glBegin (I)V
      // 07b: iload 2
      // 07c: bipush 2
      // 07d: isub
      // 07e: i2d
      // 07f: iload 3
      // 080: bipush 2
      // 081: isub
      // 082: i2d
      // 083: invokestatic org/lwjgl/opengl/GL11.glVertex2d (DD)V
      // 086: iload 2
      // 087: bipush 2
      // 088: isub
      // 089: sipush 220
      // 08c: iadd
      // 08d: i2d
      // 08e: iload 3
      // 08f: bipush 2
      // 090: isub
      // 091: i2d
      // 092: invokestatic org/lwjgl/opengl/GL11.glVertex2d (DD)V
      // 095: iload 2
      // 096: bipush 2
      // 097: isub
      // 098: sipush 220
      // 09b: iadd
      // 09c: i2d
      // 09d: iload 3
      // 09e: bipush 2
      // 09f: isub
      // 0a0: bipush 30
      // 0a2: iadd
      // 0a3: i2d
      // 0a4: invokestatic org/lwjgl/opengl/GL11.glVertex2d (DD)V
      // 0a7: iload 2
      // 0a8: bipush 2
      // 0a9: isub
      // 0aa: i2d
      // 0ab: iload 3
      // 0ac: bipush 2
      // 0ad: isub
      // 0ae: bipush 30
      // 0b0: iadd
      // 0b1: i2d
      // 0b2: invokestatic org/lwjgl/opengl/GL11.glVertex2d (DD)V
      // 0b5: invokestatic org/lwjgl/opengl/GL11.glEnd ()V
      // 0b8: sipush 3553
      // 0bb: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 0be: sipush 2884
      // 0c1: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 0c4: sipush 3042
      // 0c7: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 0ca: aload 10
      // 0cc: invokevirtual x1l.wph ()Ljava/lang/String;
      // 0cf: iload 2
      // 0d0: bipush 1
      // 0d1: iadd
      // 0d2: iload 3
      // 0d3: bipush 1
      // 0d4: iadd
      // 0d5: bipush 24
      // 0d7: bipush 24
      // 0d9: getstatic nn2.q92 Lqd_;
      // 0dc: getstatic qd_.oyx Ljava/util/ArrayList;
      // 0df: aload 10
      // 0e1: invokevirtual java/util/ArrayList.indexOf (Ljava/lang/Object;)I
      // 0e4: invokevirtual qd_.ie8 (I)Z
      // 0e7: invokestatic c5d._xi (Ljava/lang/String;IIIIZ)V
      // 0ea: getstatic jsr.yk7 Lcyb;
      // 0ed: new java/lang/StringBuilder
      // 0f0: dup
      // 0f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f4: sipush 31725
      // 0f7: ldc2_w 3711369789034627379
      // 0fa: lload 7
      // 0fc: lxor
      // 0fd: invokedynamic g (IJ)Ljava/lang/String; bsm=qd_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: nop
      // 103: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 106: aload 10
      // 108: invokevirtual x1l.wph ()Ljava/lang/String;
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 111: iload 2
      // 112: bipush 31
      // 114: iadd
      // 115: i2f
      // 116: iload 3
      // 117: bipush 3
      // 118: iadd
      // 119: i2f
      // 11a: new java/awt/Color
      // 11d: dup
      // 11e: ldc 16318208
      // 120: nop
      // 121: invokespecial java/awt/Color.<init> (I)V
      // 124: invokevirtual java/awt/Color.getRGB ()I
      // 127: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 12a: pop
      // 12b: aload 10
      // 12d: invokevirtual x1l.s2l ()Z
      // 130: iload 9
      // 132: ifeq 178
      // 135: ifeq 155
      // 138: goto 13f
      // 13b: invokestatic qd_.a (Loov;)Loov;
      // 13e: athrow
      // 13f: sipush 2328
      // 142: ldc2_w 8479434160720475076
      // 145: lload 7
      // 147: lxor
      // 148: invokedynamic g (IJ)Ljava/lang/String; bsm=qd_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: nop
      // 14e: goto 1a0
      // 151: invokestatic qd_.a (Loov;)Loov;
      // 154: athrow
      // 155: aload 10
      // 157: invokevirtual x1l.rii ()Ljava/lang/String;
      // 15a: iload 9
      // 15c: ifeq 19f
      // 15f: sipush 14833
      // 162: ldc2_w 1267763122504155947
      // 165: lload 7
      // 167: lxor
      // 168: invokedynamic g (IJ)Ljava/lang/String; bsm=qd_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 171: goto 178
      // 174: invokestatic qd_.a (Loov;)Loov;
      // 177: athrow
      // 178: ifeq 191
      // 17b: sipush 24755
      // 17e: ldc2_w 6179700767161096810
      // 181: lload 7
      // 183: lxor
      // 184: invokedynamic g (IJ)Ljava/lang/String; bsm=qd_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: nop
      // 18a: goto 1a0
      // 18d: invokestatic qd_.a (Loov;)Loov;
      // 190: athrow
      // 191: sipush 5213
      // 194: ldc2_w 2807309888787410562
      // 197: lload 7
      // 199: lxor
      // 19a: invokedynamic g (IJ)Ljava/lang/String; bsm=qd_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: nop
      // 1a0: astore 11
      // 1a2: aload 10
      // 1a4: invokevirtual x1l.wvc ()Z
      // 1a7: iload 9
      // 1a9: ifeq 1de
      // 1ac: ifeq 1d9
      // 1af: goto 1b6
      // 1b2: invokestatic qd_.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: new java/lang/StringBuilder
      // 1b9: dup
      // 1ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bd: aload 11
      // 1bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c2: sipush 10414
      // 1c5: ldc2_w 2736642863978730102
      // 1c8: lload 7
      // 1ca: lxor
      // 1cb: invokedynamic g (IJ)Ljava/lang/String; bsm=qd_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: nop
      // 1d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d7: astore 11
      // 1d9: aload 10
      // 1db: invokevirtual x1l.rnb ()Z
      // 1de: iload 9
      // 1e0: ifeq 22f
      // 1e3: ifeq 210
      // 1e6: goto 1ed
      // 1e9: invokestatic qd_.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: new java/lang/StringBuilder
      // 1f0: dup
      // 1f1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f4: aload 11
      // 1f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f9: sipush 3827
      // 1fc: ldc2_w 188747098236711982
      // 1ff: lload 7
      // 201: lxor
      // 202: invokedynamic g (IJ)Ljava/lang/String; bsm=qd_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: nop
      // 208: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20e: astore 11
      // 210: getstatic jsr.yk7 Lcyb;
      // 213: aload 11
      // 215: iload 2
      // 216: bipush 31
      // 218: iadd
      // 219: i2f
      // 21a: iload 3
      // 21b: bipush 15
      // 21d: iadd
      // 21e: i2f
      // 21f: new java/awt/Color
      // 222: dup
      // 223: ldc 16318208
      // 225: nop
      // 226: invokespecial java/awt/Color.<init> (I)V
      // 229: invokevirtual java/awt/Color.getRGB ()I
      // 22c: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 22f: pop
      // 230: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5123350141999347292L, -3335958515073439468L, MethodHandles.lookup().lookupClass()).a(171026709484369L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 21880408822240L;
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
      String var6 = "eößþ\u0085Ä\u000e<¹\u0096²£VÍQç\u0018\u001f\u009dBårùm\u00068Õ²kf\u0088ö(;\u009bË¿ÒÚ~Èfòo\"Øh\u001fú{\u0096%å\u001aÕ®¿\u0010Mç×Ç\u0000½:7tïò\u008fß~æ\u0010\u0097.¹Þ6Ë£¯¯ê+{\u0016\bÀD\u0018k\u0006\t`µùC»)\u0089M<ïr®\u0088(\u008eX5ì\u0086.#\u0018$¨\u0086\t\u000e¡oEb±èFÀ\u0092\u0081\u000bvÙ&'÷ÌÕ{";
      int var8 = "eößþ\u0085Ä\u000e<¹\u0096²£VÍQç\u0018\u001f\u009dBårùm\u00068Õ²kf\u0088ö(;\u009bË¿ÒÚ~Èfòo\"Øh\u001fú{\u0096%å\u001aÕ®¿\u0010Mç×Ç\u0000½:7tïò\u008fß~æ\u0010\u0097.¹Þ6Ë£¯¯ê+{\u0016\bÀD\u0018k\u0006\t`µùC»)\u0089M<ïr®\u0088(\u008eX5ì\u0086.#\u0018$¨\u0086\t\u000e¡oEb±èFÀ\u0092\u0081\u000bvÙ&'÷ÌÕ{"
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
                     c = new String[7];
                     oyx = new ArrayList();
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

                  var6 = "ÿ~è¹F\u0006\u0086!\":ä\rt\u008c\u0082ÌèZ\u0094±.\u0099\u009c\u0010\u009d÷GÄCý\u0015z Ó!»}æ\u0016H\u0088zµ|øWï\u008dM\u0090H\u0018|\u0016\u0083Û\u0019»-<\u0011í9\\¾";
                  var8 = "ÿ~è¹F\u0006\u0086!\":ä\rt\u008c\u0082ÌèZ\u0094±.\u0099\u009c\u0010\u009d÷GÄCý\u0015z Ó!»}æ\u0016H\u0088zµ|øWï\u008dM\u0090H\u0018|\u0016\u0083Û\u0019»-<\u0011í9\\¾"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18211;
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
            throw new RuntimeException("qd_", var10);
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
         throw new RuntimeException("qd_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
