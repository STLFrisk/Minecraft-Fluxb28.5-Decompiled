import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.util.vector.Vector3f;

public class sf8 {
   public static final List xsp;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public rqp qn9(yu2 param1, rqp param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic sf8.a J
      // 003: ldc2_w 131711215345338
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 00b: astore 6
      // 00d: invokestatic OpaquePredicate.b ()I
      // 010: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 013: astore 7
      // 015: bipush 0
      // 016: istore 8
      // 018: istore 5
      // 01a: iload 8
      // 01c: getstatic sf8.xsp Ljava/util/List;
      // 01f: invokeinterface java/util/List.size ()I 1
      // 024: if_icmpge 09a
      // 027: getstatic sf8.xsp Ljava/util/List;
      // 02a: iload 8
      // 02c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 031: checkcast java/lang/String
      // 034: astore 9
      // 036: aload 2
      // 037: aload 9
      // 039: iload 5
      // 03b: ifeq 05d
      // 03e: invokevirtual rqp.s_k (Ljava/lang/String;)Z
      // 041: iload 5
      // 043: ifeq 0a1
      // 046: goto 04d
      // 049: invokestatic sf8.a (Loov;)Loov;
      // 04c: athrow
      // 04d: ifne 05a
      // 050: goto 057
      // 053: invokestatic sf8.a (Loov;)Loov;
      // 056: athrow
      // 057: goto 09a
      // 05a: aload 2
      // 05b: aload 9
      // 05d: invokevirtual rqp.gxt (Ljava/lang/String;)Ljava/lang/String;
      // 060: astore 10
      // 062: aload 6
      // 064: aload 9
      // 066: aload 10
      // 068: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 06d: pop
      // 06e: aload 1
      // 06f: new gdz
      // 072: dup
      // 073: aload 10
      // 075: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 078: invokevirtual gdz.toString ()Ljava/lang/String;
      // 07b: invokevirtual yu2.brw (Ljava/lang/String;)Lsla;
      // 07e: astore 11
      // 080: aload 7
      // 082: aload 0
      // 083: iload 8
      // 085: aload 9
      // 087: aload 11
      // 089: invokespecial sf8.jv3 (ILjava/lang/String;Lsla;)Ljava/util/List;
      // 08c: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 091: pop
      // 092: iinc 8 1
      // 095: iload 5
      // 097: ifne 01a
      // 09a: aload 7
      // 09c: invokeinterface java/util/List.isEmpty ()Z 1
      // 0a1: ifeq 0aa
      // 0a4: aconst_null
      // 0a5: areturn
      // 0a6: invokestatic sf8.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 6
      // 0ac: sipush 518
      // 0af: ldc2_w 735956437330503558
      // 0b2: lload 3
      // 0b3: lxor
      // 0b4: invokedynamic d (IJ)Ljava/lang/String; bsm=sf8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: nop
      // 0ba: aload 2
      // 0bb: iload 5
      // 0bd: ifeq 109
      // 0c0: sipush 19584
      // 0c3: ldc2_w 7146480240963283204
      // 0c6: lload 3
      // 0c7: lxor
      // 0c8: invokedynamic d (IJ)Ljava/lang/String; bsm=sf8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: nop
      // 0ce: invokevirtual rqp.s_k (Ljava/lang/String;)Z
      // 0d1: ifeq 0f4
      // 0d4: goto 0db
      // 0d7: invokestatic sf8.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 2
      // 0dc: sipush 19584
      // 0df: ldc2_w 7146480240963283204
      // 0e2: lload 3
      // 0e3: lxor
      // 0e4: invokedynamic d (IJ)Ljava/lang/String; bsm=sf8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: nop
      // 0ea: invokevirtual rqp.gxt (Ljava/lang/String;)Ljava/lang/String;
      // 0ed: goto 10c
      // 0f0: invokestatic sf8.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 6
      // 0f6: sipush 21044
      // 0f9: ldc2_w 4642276485377030067
      // 0fc: lload 3
      // 0fd: lxor
      // 0fe: invokedynamic d (IJ)Ljava/lang/String; bsm=sf8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: nop
      // 104: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 109: checkcast java/lang/String
      // 10c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 111: pop
      // 112: new rqp
      // 115: dup
      // 116: aload 7
      // 118: aload 6
      // 11a: bipush 0
      // 11b: bipush 0
      // 11c: aload 2
      // 11d: invokevirtual rqp.qw6 ()Lflk;
      // 120: invokespecial rqp.<init> (Ljava/util/List;Ljava/util/Map;ZZLflk;)V
      // 123: areturn
   }

   private List jv3(int var1, String var2, sla var3) {
      HashMap var4 = Maps.newHashMap();
      var4.put(vt2.mxp, new e97((vt2)null, var1, var2, new y3k(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0)));
      var4.put(vt2.z9q, new e97((vt2)null, var1, var2, new y3k(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, 0)));
      ArrayList var5 = Lists.newArrayList();
      var5.add(new lcz(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), var4, (qoi)null, true));
      var5.addAll(this.l7d(var3, var2, var1));
      return var5;
   }

   private List l7d(sla param1, String param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual sla.jkj ()I
      // 004: i2f
      // 005: fstore 5
      // 007: aload 1
      // 008: invokevirtual sla.yva ()I
      // 00b: i2f
      // 00c: fstore 6
      // 00e: invokestatic OpaquePredicate.b ()I
      // 011: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 014: astore 7
      // 016: istore 4
      // 018: aload 0
      // 019: aload 1
      // 01a: invokespecial sf8.ksf (Lsla;)Ljava/util/List;
      // 01d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 022: astore 8
      // 024: aload 8
      // 026: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02b: ifeq 348
      // 02e: aload 8
      // 030: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 035: checkcast sf8$jrb
      // 038: astore 9
      // 03a: fconst_0
      // 03b: fstore 10
      // 03d: fconst_0
      // 03e: fstore 11
      // 040: fconst_0
      // 041: fstore 12
      // 043: fconst_0
      // 044: fstore 13
      // 046: fconst_0
      // 047: fstore 14
      // 049: fconst_0
      // 04a: fstore 15
      // 04c: fconst_0
      // 04d: fstore 16
      // 04f: fconst_0
      // 050: fstore 17
      // 052: fconst_0
      // 053: fstore 18
      // 055: fconst_0
      // 056: fstore 19
      // 058: aload 9
      // 05a: invokevirtual sf8$jrb.vzk ()I
      // 05d: i2f
      // 05e: fstore 20
      // 060: aload 9
      // 062: invokevirtual sf8$jrb.dxx ()I
      // 065: i2f
      // 066: fstore 21
      // 068: aload 9
      // 06a: invokevirtual sf8$jrb.oz8 ()I
      // 06d: i2f
      // 06e: fstore 22
      // 070: aload 9
      // 072: invokevirtual sf8$jrb.kf1 ()Lsf8$hj6;
      // 075: astore 23
      // 077: iload 4
      // 079: ifeq 0db
      // 07c: getstatic sf8$1.jin [I
      // 07f: aload 23
      // 081: invokevirtual sf8$hj6.ordinal ()I
      // 084: iaload
      // 085: tableswitch 262 1 4 35 91 151 207
      // 0a4: invokestatic sf8.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: fload 20
      // 0aa: fstore 14
      // 0ac: fload 20
      // 0ae: fstore 10
      // 0b0: fload 21
      // 0b2: fconst_1
      // 0b3: fadd
      // 0b4: dup
      // 0b5: fstore 15
      // 0b7: fstore 12
      // 0b9: fload 22
      // 0bb: fstore 16
      // 0bd: fload 22
      // 0bf: fstore 11
      // 0c1: fload 22
      // 0c3: fstore 17
      // 0c5: fload 22
      // 0c7: fstore 13
      // 0c9: ldc 16.0
      // 0cb: nop
      // 0cc: fload 5
      // 0ce: fdiv
      // 0cf: fstore 18
      // 0d1: ldc 16.0
      // 0d3: nop
      // 0d4: fload 6
      // 0d6: fconst_1
      // 0d7: fsub
      // 0d8: fdiv
      // 0d9: fstore 19
      // 0db: iload 4
      // 0dd: ifne 18b
      // 0e0: fload 22
      // 0e2: fstore 17
      // 0e4: fload 22
      // 0e6: fstore 16
      // 0e8: fload 20
      // 0ea: fstore 14
      // 0ec: fload 20
      // 0ee: fstore 10
      // 0f0: fload 21
      // 0f2: fconst_1
      // 0f3: fadd
      // 0f4: dup
      // 0f5: fstore 15
      // 0f7: fstore 12
      // 0f9: fload 22
      // 0fb: fconst_1
      // 0fc: fadd
      // 0fd: fstore 11
      // 0ff: fload 22
      // 101: fconst_1
      // 102: fadd
      // 103: fstore 13
      // 105: ldc 16.0
      // 107: nop
      // 108: fload 5
      // 10a: fdiv
      // 10b: fstore 18
      // 10d: ldc 16.0
      // 10f: nop
      // 110: fload 6
      // 112: fconst_1
      // 113: fsub
      // 114: fdiv
      // 115: fstore 19
      // 117: iload 4
      // 119: ifne 18b
      // 11c: fload 22
      // 11e: fstore 14
      // 120: fload 22
      // 122: fstore 10
      // 124: fload 22
      // 126: fstore 15
      // 128: fload 22
      // 12a: fstore 12
      // 12c: fload 20
      // 12e: fstore 17
      // 130: fload 20
      // 132: fstore 11
      // 134: fload 21
      // 136: fconst_1
      // 137: fadd
      // 138: dup
      // 139: fstore 16
      // 13b: fstore 13
      // 13d: ldc 16.0
      // 13f: nop
      // 140: fload 5
      // 142: fconst_1
      // 143: fsub
      // 144: fdiv
      // 145: fstore 18
      // 147: ldc 16.0
      // 149: nop
      // 14a: fload 6
      // 14c: fdiv
      // 14d: fstore 19
      // 14f: iload 4
      // 151: ifne 18b
      // 154: fload 22
      // 156: fstore 15
      // 158: fload 22
      // 15a: fstore 14
      // 15c: fload 22
      // 15e: fconst_1
      // 15f: fadd
      // 160: fstore 10
      // 162: fload 22
      // 164: fconst_1
      // 165: fadd
      // 166: fstore 12
      // 168: fload 20
      // 16a: fstore 17
      // 16c: fload 20
      // 16e: fstore 11
      // 170: fload 21
      // 172: fconst_1
      // 173: fadd
      // 174: dup
      // 175: fstore 16
      // 177: fstore 13
      // 179: ldc 16.0
      // 17b: nop
      // 17c: fload 5
      // 17e: fconst_1
      // 17f: fsub
      // 180: fdiv
      // 181: fstore 18
      // 183: ldc 16.0
      // 185: nop
      // 186: fload 6
      // 188: fdiv
      // 189: fstore 19
      // 18b: ldc 16.0
      // 18d: nop
      // 18e: fload 5
      // 190: fdiv
      // 191: fstore 24
      // 193: ldc 16.0
      // 195: nop
      // 196: fload 6
      // 198: fdiv
      // 199: fstore 25
      // 19b: fload 10
      // 19d: fload 24
      // 19f: fmul
      // 1a0: fstore 10
      // 1a2: fload 12
      // 1a4: fload 24
      // 1a6: fmul
      // 1a7: fstore 12
      // 1a9: fload 11
      // 1ab: fload 25
      // 1ad: fmul
      // 1ae: fstore 11
      // 1b0: fload 13
      // 1b2: fload 25
      // 1b4: fmul
      // 1b5: fstore 13
      // 1b7: ldc 16.0
      // 1b9: nop
      // 1ba: fload 11
      // 1bc: fsub
      // 1bd: fstore 11
      // 1bf: ldc 16.0
      // 1c1: nop
      // 1c2: fload 13
      // 1c4: fsub
      // 1c5: fstore 13
      // 1c7: fload 14
      // 1c9: fload 18
      // 1cb: fmul
      // 1cc: fstore 14
      // 1ce: fload 15
      // 1d0: fload 18
      // 1d2: fmul
      // 1d3: fstore 15
      // 1d5: fload 16
      // 1d7: fload 19
      // 1d9: fmul
      // 1da: fstore 16
      // 1dc: fload 17
      // 1de: fload 19
      // 1e0: fmul
      // 1e1: fstore 17
      // 1e3: invokestatic com/google/common/collect/Maps.newHashMap ()Ljava/util/HashMap;
      // 1e6: astore 26
      // 1e8: aload 26
      // 1ea: aload 23
      // 1ec: invokevirtual sf8$hj6.hgq ()Lvt2;
      // 1ef: new e97
      // 1f2: dup
      // 1f3: aconst_null
      // 1f4: checkcast vt2
      // 1f7: iload 3
      // 1f8: aload 2
      // 1f9: new y3k
      // 1fc: dup
      // 1fd: bipush 4
      // 1fe: newarray 6
      // 200: dup
      // 201: bipush 0
      // 202: fload 14
      // 204: fastore
      // 205: dup
      // 206: bipush 1
      // 207: fload 16
      // 209: fastore
      // 20a: dup
      // 20b: bipush 2
      // 20c: fload 15
      // 20e: fastore
      // 20f: dup
      // 210: bipush 3
      // 211: fload 17
      // 213: fastore
      // 214: bipush 0
      // 215: invokespecial y3k.<init> ([FI)V
      // 218: invokespecial e97.<init> (Lvt2;ILjava/lang/String;Ly3k;)V
      // 21b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 220: pop
      // 221: getstatic sf8$1.jin [I
      // 224: aload 23
      // 226: invokevirtual sf8$hj6.ordinal ()I
      // 229: iaload
      // 22a: iload 4
      // 22c: ifeq 288
      // 22f: tableswitch 276 1 4 33 95 157 219
      // 24c: invokestatic sf8.a (Loov;)Loov;
      // 24f: athrow
      // 250: aload 7
      // 252: new lcz
      // 255: dup
      // 256: new org/lwjgl/util/vector/Vector3f
      // 259: dup
      // 25a: fload 10
      // 25c: fload 11
      // 25e: ldc 7.5
      // 260: nop
      // 261: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 264: new org/lwjgl/util/vector/Vector3f
      // 267: dup
      // 268: fload 12
      // 26a: fload 11
      // 26c: ldc 8.5
      // 26e: nop
      // 26f: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 272: aload 26
      // 274: aconst_null
      // 275: checkcast qoi
      // 278: bipush 1
      // 279: invokespecial lcz.<init> (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Ljava/util/Map;Lqoi;Z)V
      // 27c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 281: goto 288
      // 284: invokestatic sf8.a (Loov;)Loov;
      // 287: athrow
      // 288: pop
      // 289: iload 4
      // 28b: ifne 343
      // 28e: aload 7
      // 290: new lcz
      // 293: dup
      // 294: new org/lwjgl/util/vector/Vector3f
      // 297: dup
      // 298: fload 10
      // 29a: fload 13
      // 29c: ldc 7.5
      // 29e: nop
      // 29f: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 2a2: new org/lwjgl/util/vector/Vector3f
      // 2a5: dup
      // 2a6: fload 12
      // 2a8: fload 13
      // 2aa: ldc 8.5
      // 2ac: nop
      // 2ad: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 2b0: aload 26
      // 2b2: aconst_null
      // 2b3: checkcast qoi
      // 2b6: bipush 1
      // 2b7: invokespecial lcz.<init> (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Ljava/util/Map;Lqoi;Z)V
      // 2ba: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2bf: pop
      // 2c0: iload 4
      // 2c2: ifne 343
      // 2c5: goto 2cc
      // 2c8: invokestatic sf8.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: aload 7
      // 2ce: new lcz
      // 2d1: dup
      // 2d2: new org/lwjgl/util/vector/Vector3f
      // 2d5: dup
      // 2d6: fload 10
      // 2d8: fload 11
      // 2da: ldc 7.5
      // 2dc: nop
      // 2dd: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 2e0: new org/lwjgl/util/vector/Vector3f
      // 2e3: dup
      // 2e4: fload 10
      // 2e6: fload 13
      // 2e8: ldc 8.5
      // 2ea: nop
      // 2eb: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 2ee: aload 26
      // 2f0: aconst_null
      // 2f1: checkcast qoi
      // 2f4: bipush 1
      // 2f5: invokespecial lcz.<init> (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Ljava/util/Map;Lqoi;Z)V
      // 2f8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2fd: pop
      // 2fe: iload 4
      // 300: ifne 343
      // 303: goto 30a
      // 306: invokestatic sf8.a (Loov;)Loov;
      // 309: athrow
      // 30a: aload 7
      // 30c: new lcz
      // 30f: dup
      // 310: new org/lwjgl/util/vector/Vector3f
      // 313: dup
      // 314: fload 12
      // 316: fload 11
      // 318: ldc 7.5
      // 31a: nop
      // 31b: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 31e: new org/lwjgl/util/vector/Vector3f
      // 321: dup
      // 322: fload 12
      // 324: fload 13
      // 326: ldc 8.5
      // 328: nop
      // 329: invokespecial org/lwjgl/util/vector/Vector3f.<init> (FFF)V
      // 32c: aload 26
      // 32e: aconst_null
      // 32f: checkcast qoi
      // 332: bipush 1
      // 333: invokespecial lcz.<init> (Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Ljava/util/Map;Lqoi;Z)V
      // 336: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 33b: pop
      // 33c: goto 343
      // 33f: invokestatic sf8.a (Loov;)Loov;
      // 342: athrow
      // 343: iload 4
      // 345: ifne 024
      // 348: aload 7
      // 34a: areturn
   }

   private List ksf(sla var1) {
      int var3 = var1.jkj();
      int var4 = var1.yva();
      int var10000 = OpaquePredicate.b();
      ArrayList var5 = Lists.newArrayList();
      int var2 = var10000;
      int var6 = 0;

      label64:
      while (true) {
         var10000 = var6;

         label62:
         while (var10000 < var1.d3x()) {
            int[] var7 = var1.wpv(var6)[0];
            int var8 = 0;

            label59:
            while (true) {
               var10000 = var8;

               label57:
               while (true) {
                  if (var10000 >= var4) {
                     break label59;
                  }

                  var10000 = 0;
                  if (var2 == 0) {
                     continue label62;
                  }

                  int var9 = 0;

                  while (var9 < var3) {
                     var10000 = this.pd_(var7, var9, var8, var3, var4);
                     if (var2 == 0) {
                        continue label57;
                     }

                     label51: {
                        label50: {
                           try {
                              if (var2 == 0) {
                                 break label51;
                              }

                              if (var10000 == 0) {
                                 break label50;
                              }
                           } catch (oov var11) {
                              throw a(var11);
                           }

                           var10000 = 0;
                           break label51;
                        }

                        var10000 = 1;
                     }

                     int var10 = var10000;
                     this.y3c(sf8$hj6.kxa, var5, var7, var9, var8, var3, var4, (boolean)var10);
                     this.y3c(sf8$hj6.c2q, var5, var7, var9, var8, var3, var4, (boolean)var10);
                     this.y3c(sf8$hj6.lh2, var5, var7, var9, var8, var3, var4, (boolean)var10);
                     this.y3c(sf8$hj6.p46, var5, var7, var9, var8, var3, var4, (boolean)var10);
                     var9++;
                     if (var2 == 0) {
                        break;
                     }
                  }

                  var8++;
                  if (var2 == 0) {
                     break label59;
                  }
                  break;
               }
            }

            var6++;
            if (var2 == 0) {
               return var5;
            }
            continue label64;
         }

         return var5;
      }
   }

   private void y3c(sf8$hj6 var1, List var2, int[] var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = OpaquePredicate.c();

      boolean var10000;
      label46: {
         label45: {
            label44: {
               label43: {
                  try {
                     var10000 = this.pd_(var3, var4 + var1.imb(), var5 + var1.lpr(), var6, var7);
                     if (var9 != 0) {
                        break label43;
                     }

                     if (!var10000) {
                        break label44;
                     }
                  } catch (oov var13) {
                     throw a(var13);
                  }

                  var10000 = var8;
               }

               try {
                  if (var9 != 0) {
                     break label46;
                  }

                  if (var10000) {
                     break label45;
                  }
               } catch (oov var12) {
                  throw a(var12);
               }
            }

            var10000 = false;
            break label46;
         }

         var10000 = true;
      }

      boolean var10 = var10000;

      try {
         if (var10) {
            this.y1f(var2, var1, var4, var5);
         }
      } catch (oov var11) {
         throw a(var11);
      }
   }

   private void y1f(List param1, sf8$hj6 param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 6
      // 03: invokestatic OpaquePredicate.c ()I
      // 06: aload 1
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 7
      // 0e: istore 5
      // 10: aload 7
      // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17: ifeq 84
      // 1a: aload 7
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast sf8$jrb
      // 24: astore 8
      // 26: aload 8
      // 28: invokevirtual sf8$jrb.kf1 ()Lsf8$hj6;
      // 2b: iload 5
      // 2d: ifne 43
      // 30: aload 2
      // 31: if_acmpne 81
      // 34: goto 3b
      // 37: invokestatic sf8.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 2
      // 3c: goto 43
      // 3f: invokestatic sf8.a (Loov;)Loov;
      // 42: athrow
      // 43: invokestatic sf8$hj6.ms3 (Lsf8$hj6;)Z
      // 46: iload 5
      // 48: ifne 57
      // 4b: ifeq 5a
      // 4e: goto 55
      // 51: invokestatic sf8.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 4
      // 57: goto 5b
      // 5a: iload 3
      // 5b: istore 9
      // 5d: aload 8
      // 5f: iload 5
      // 61: ifne 7c
      // 64: invokevirtual sf8$jrb.oz8 ()I
      // 67: iload 9
      // 69: if_icmpne 81
      // 6c: goto 73
      // 6f: invokestatic sf8.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 8
      // 75: goto 7c
      // 78: invokestatic sf8.a (Loov;)Loov;
      // 7b: athrow
      // 7c: astore 6
      // 7e: goto 84
      // 81: goto 10
      // 84: aload 2
      // 85: invokestatic sf8$hj6.ms3 (Lsf8$hj6;)Z
      // 88: iload 5
      // 8a: ifne 99
      // 8d: ifeq 9c
      // 90: goto 97
      // 93: invokestatic sf8.a (Loov;)Loov;
      // 96: athrow
      // 97: iload 4
      // 99: goto 9d
      // 9c: iload 3
      // 9d: istore 7
      // 9f: aload 2
      // a0: invokestatic sf8$hj6.ms3 (Lsf8$hj6;)Z
      // a3: iload 5
      // a5: ifne b3
      // a8: ifeq b6
      // ab: goto b2
      // ae: invokestatic sf8.a (Loov;)Loov;
      // b1: athrow
      // b2: iload 3
      // b3: goto b8
      // b6: iload 4
      // b8: istore 8
      // ba: aload 6
      // bc: iload 5
      // be: ifne f3
      // c1: ifnonnull ea
      // c4: goto cb
      // c7: invokestatic sf8.a (Loov;)Loov;
      // ca: athrow
      // cb: aload 1
      // cc: new sf8$jrb
      // cf: dup
      // d0: aload 2
      // d1: iload 8
      // d3: iload 7
      // d5: invokespecial sf8$jrb.<init> (Lsf8$hj6;II)V
      // d8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // dd: pop
      // de: iload 5
      // e0: ifeq f8
      // e3: goto ea
      // e6: invokestatic sf8.a (Loov;)Loov;
      // e9: athrow
      // ea: aload 6
      // ec: goto f3
      // ef: invokestatic sf8.a (Loov;)Loov;
      // f2: athrow
      // f3: iload 8
      // f5: invokevirtual sf8$jrb.akb (I)V
      // f8: return
   }

   private boolean pd_(int[] param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 6
      // 05: iload 2
      // 06: iload 6
      // 08: ifne 16
      // 0b: iflt 81
      // 0e: goto 15
      // 11: invokestatic sf8.a (Loov;)Loov;
      // 14: athrow
      // 15: iload 3
      // 16: iload 6
      // 18: ifne 26
      // 1b: iflt 81
      // 1e: goto 25
      // 21: invokestatic sf8.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 2
      // 26: iload 4
      // 28: iload 6
      // 2a: ifne 41
      // 2d: if_icmpge 81
      // 30: goto 37
      // 33: invokestatic sf8.a (Loov;)Loov;
      // 36: athrow
      // 37: iload 3
      // 38: iload 5
      // 3a: goto 41
      // 3d: invokestatic sf8.a (Loov;)Loov;
      // 40: athrow
      // 41: iload 6
      // 43: ifne 65
      // 46: if_icmpge 81
      // 49: goto 50
      // 4c: invokestatic sf8.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: iload 3
      // 52: iload 4
      // 54: imul
      // 55: iload 2
      // 56: iadd
      // 57: iaload
      // 58: bipush 24
      // 5a: ishr
      // 5b: sipush 255
      // 5e: goto 65
      // 61: invokestatic sf8.a (Loov;)Loov;
      // 64: athrow
      // 65: iand
      // 66: iload 6
      // 68: ifne 7e
      // 6b: ifne 7d
      // 6e: goto 75
      // 71: invokestatic sf8.a (Loov;)Loov;
      // 74: athrow
      // 75: bipush 1
      // 76: goto 82
      // 79: invokestatic sf8.a (Loov;)Loov;
      // 7c: athrow
      // 7d: bipush 0
      // 7e: goto 82
      // 81: bipush 1
      // 82: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5643964738179951013L, 8996103225411176965L, MethodHandles.lookup().lookupClass()).a(127647711726142L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 43586573904979L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "\u008cK\u001f¿\u0085/{ }W«è\u0094íºó\u0010®\u0018oï©\u0083Ý\u009e¢þ\u0092\u0095ä%¹Õ LÊ ÝX\u0083µ\u00ad%\u0086ã\u0013\n\u0000cÅzéoD×RlGL\u0000\u00957¢ô\u009fj\u0010²\u00886>÷V+\u00194x\u000eÔ¬¤®Ä\u0010å\r²ò²#97Õ\u0005±j]\\9a\u0010MmwDoy\u0091/DÑ{*>\u001aîh";
      int var6 = "\u008cK\u001f¿\u0085/{ }W«è\u0094íºó\u0010®\u0018oï©\u0083Ý\u009e¢þ\u0092\u0095ä%¹Õ LÊ ÝX\u0083µ\u00ad%\u0086ã\u0013\n\u0000cÅzéoD×RlGL\u0000\u00957¢ô\u009fj\u0010²\u00886>÷V+\u00194x\u000eÔ¬¤®Ä\u0010å\r²ò²#97Õ\u0005±j]\\9a\u0010MmwDoy\u0091/DÑ{*>\u001aîh"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[8];
                     xsp = Lists.newArrayList(
                        new String[]{
                           a<"d">(9325, 6382003294746555143L ^ var9),
                           a<"d">(32496, 6589310903877167519L ^ var9),
                           a<"d">(27018, 6636386090110484194L ^ var9),
                           a<"d">(17230, 7146150444782933029L ^ var9),
                           a<"d">(20539, 5659974940452669271L ^ var9)
                        }
                     );
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

                  var4 = "@Í\u009d¦y\")£\u008d½ÃeÉºæ\u00930çÿ\u009a\u0089\u0019\u0019S\u009d#6kF+\u00849\u0010EgµF\u0090J|\u0082\u0014Rs=P\fR\u0010";
                  var6 = "@Í\u009d¦y\")£\u008d½ÃeÉºæ\u00930çÿ\u009a\u0089\u0019\u0019S\u009d#6kF+\u00849\u0010EgµF\u0090J|\u0082\u0014Rs=P\fR\u0010".length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15633;
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
            throw new RuntimeException("sf8", var10);
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
         throw new RuntimeException("sf8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
