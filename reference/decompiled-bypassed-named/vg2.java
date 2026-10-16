import com.google.common.collect.Ordering;
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

public class vg2 extends b0t {
   public static final Ordering kq6;
   private final Minecraft cs3;
   private final d1f a7b;
   private ekw e52;
   private ekw qhd;
   public float ssn = 0.0F;
   public boolean o_c = false;
   public float dsd = 0.0F;
   private long eyd;
   public boolean pq8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public vg2(Minecraft var1, d1f var2) {
      this.cs3 = var1;
      this.a7b = var2;
   }

   public String m57(hv2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 27
      // 09: invokevirtual hv2.zyf ()Lekw;
      // 0c: ifnull 26
      // 0f: goto 16
      // 12: invokestatic vg2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual hv2.zyf ()Lekw;
      // 1a: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 1f: goto 34
      // 22: invokestatic vg2.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 1
      // 27: invokevirtual hv2.yym ()Lq2m;
      // 2a: aload 1
      // 2b: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 2e: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 31: invokestatic q2m.x0i (Ln_0;Ljava/lang/String;)Ljava/lang/String;
      // 34: areturn
   }

   public void t9r(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 29
      // 09: ifeq 3a
      // 0c: goto 13
      // 0f: invokestatic vg2.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifeq 3b
      // 18: goto 1f
      // 1b: invokestatic vg2.a (Loov;)Loov;
      // 1e: athrow
      // 1f: getfield vg2.pq8 Z
      // 22: goto 29
      // 25: invokestatic vg2.a (Loov;)Loov;
      // 28: athrow
      // 29: ifne 3a
      // 2c: aload 0
      // 2d: invokestatic Minecraft.qgs ()J
      // 30: putfield vg2.eyd J
      // 33: goto 3a
      // 36: invokestatic vg2.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: putfield vg2.pq8 Z
      // 3f: return
   }

   public void n3j(int param1, uci param2, sa6 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic vg2.a J
      // 003: ldc2_w 81155640688487
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 6
      // 00e: getstatic ModuleRegistry.irb Lf5k;
      // 011: invokevirtual Rotation.klu ()Z
      // 014: iload 6
      // 016: ifeq 033
      // 019: ifeq 037
      // 01c: goto 023
      // 01f: invokestatic vg2.a (Loov;)Loov;
      // 022: athrow
      // 023: getstatic Rotation.q0s Lcn7;
      // 026: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 029: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02c: goto 033
      // 02f: invokestatic vg2.a (Loov;)Loov;
      // 032: athrow
      // 033: ifeq 037
      // 036: return
      // 037: aload 0
      // 038: getfield vg2.cs3 Lc05;
      // 03b: getfield Minecraft.vg8 Ll86;
      // 03e: getfield EntityPlayerSP.lq7 Lp_k;
      // 041: astore 7
      // 043: getstatic vg2.kq6 Lcom/google/common/collect/Ordering;
      // 046: aload 7
      // 048: invokevirtual p_k.l0e ()Ljava/util/Collection;
      // 04b: invokevirtual com/google/common/collect/Ordering.sortedCopy (Ljava/lang/Iterable;)Ljava/util/List;
      // 04e: astore 8
      // 050: bipush 0
      // 051: istore 9
      // 053: bipush 0
      // 054: istore 10
      // 056: bipush 0
      // 057: istore 11
      // 059: bipush 0
      // 05a: istore 12
      // 05c: aload 8
      // 05e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 063: astore 13
      // 065: aload 13
      // 067: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06c: ifeq 179
      // 06f: aload 13
      // 071: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 076: checkcast hv2
      // 079: astore 14
      // 07b: aload 14
      // 07d: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 080: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 083: astore 15
      // 085: new s60
      // 088: dup
      // 089: aload 15
      // 08b: invokespecial s60.<init> (Ljava/lang/String;)V
      // 08e: astore 16
      // 090: aload 16
      // 092: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 095: pop
      // 096: aload 0
      // 097: getfield vg2.cs3 Lc05;
      // 09a: getfield Minecraft.tx1 Lowt;
      // 09d: aload 15
      // 09f: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 0a2: istore 17
      // 0a4: aload 0
      // 0a5: getfield vg2.cs3 Lc05;
      // 0a8: getfield Minecraft.tx1 Lowt;
      // 0ab: aload 16
      // 0ad: getfield s60.jcg Ljava/lang/String;
      // 0b0: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 0b3: istore 18
      // 0b5: aload 0
      // 0b6: getfield vg2.cs3 Lc05;
      // 0b9: getfield Minecraft.tx1 Lowt;
      // 0bc: aload 0
      // 0bd: aload 14
      // 0bf: invokevirtual vg2.m57 (Lhv2;)Ljava/lang/String;
      // 0c2: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 0c5: istore 19
      // 0c7: iload 17
      // 0c9: iload 19
      // 0cb: invokestatic java/lang/Math.max (II)I
      // 0ce: istore 17
      // 0d0: iload 17
      // 0d2: iload 18
      // 0d4: invokestatic java/lang/Math.max (II)I
      // 0d7: istore 17
      // 0d9: getstatic ClientState.qkk Lzwr;
      // 0dc: invokevirtual ClientState.zr7 ()Laz4;
      // 0df: astore 20
      // 0e1: aload 20
      // 0e3: aload 15
      // 0e5: invokevirtual az4.ocr (Ljava/lang/String;)Z
      // 0e8: iload 6
      // 0ea: ifeq 196
      // 0ed: iload 6
      // 0ef: ifeq 120
      // 0f2: goto 0f9
      // 0f5: invokestatic vg2.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: ifeq 119
      // 0fc: goto 103
      // 0ff: invokestatic vg2.a (Loov;)Loov;
      // 102: athrow
      // 103: iload 17
      // 105: aload 0
      // 106: getfield vg2.cs3 Lc05;
      // 109: getfield Minecraft.tx1 Lowt;
      // 10c: aload 20
      // 10e: aload 15
      // 110: invokevirtual az4.wu0 (Ljava/lang/String;)Ljava/lang/String;
      // 113: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 116: iadd
      // 117: istore 17
      // 119: iload 9
      // 11b: iload 17
      // 11d: invokestatic java/lang/Math.max (II)I
      // 120: istore 9
      // 122: aload 3
      // 123: iload 6
      // 125: ifeq 133
      // 128: ifnull 174
      // 12b: goto 132
      // 12e: invokestatic vg2.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 3
      // 133: invokevirtual sa6.sns ()Lz0w$enz;
      // 136: getstatic z0w$enz.kr2 Lz0w$enz;
      // 139: if_acmpeq 174
      // 13c: aload 0
      // 13d: getfield vg2.cs3 Lc05;
      // 140: getfield Minecraft.tx1 Lowt;
      // 143: new java/lang/StringBuilder
      // 146: dup
      // 147: invokespecial java/lang/StringBuilder.<init> ()V
      // 14a: ldc " "
      // 14c: nop
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: aload 2
      // 151: aload 14
      // 153: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 156: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 159: aload 3
      // 15a: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 15d: invokevirtual r11.fge ()I
      // 160: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 163: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 166: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 169: istore 17
      // 16b: iload 10
      // 16d: iload 17
      // 16f: invokestatic java/lang/Math.max (II)I
      // 172: istore 10
      // 174: iload 6
      // 176: ifne 065
      // 179: aload 8
      // 17b: bipush 0
      // 17c: aload 8
      // 17e: invokeinterface java/util/List.size ()I 1
      // 183: bipush 80
      // 185: invokestatic java/lang/Math.min (II)I
      // 188: invokeinterface java/util/List.subList (II)Ljava/util/List; 3
      // 18d: astore 8
      // 18f: aload 8
      // 191: invokeinterface java/util/List.size ()I 1
      // 196: istore 13
      // 198: iload 13
      // 19a: istore 14
      // 19c: bipush 1
      // 19d: istore 15
      // 19f: iload 14
      // 1a1: bipush 20
      // 1a3: if_icmple 1c6
      // 1a6: iinc 15 1
      // 1a9: iload 13
      // 1ab: iload 15
      // 1ad: iadd
      // 1ae: bipush 1
      // 1af: isub
      // 1b0: iload 15
      // 1b2: idiv
      // 1b3: istore 14
      // 1b5: iload 6
      // 1b7: ifeq 1ff
      // 1ba: iload 6
      // 1bc: ifne 19f
      // 1bf: goto 1c6
      // 1c2: invokestatic vg2.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: getfield vg2.cs3 Lc05;
      // 1ca: invokevirtual Minecraft.y8_ ()Z
      // 1cd: iload 6
      // 1cf: ifeq 200
      // 1d2: ifne 1ff
      // 1d5: goto 1dc
      // 1d8: invokestatic vg2.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: getfield vg2.cs3 Lc05;
      // 1e0: invokevirtual Minecraft.c02 ()Lp_k;
      // 1e3: invokevirtual p_k._m3 ()Lhv0;
      // 1e6: invokevirtual hv0.rvo ()Z
      // 1e9: iload 6
      // 1eb: ifeq 200
      // 1ee: goto 1f5
      // 1f1: invokestatic vg2.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: ifeq 203
      // 1f8: goto 1ff
      // 1fb: invokestatic vg2.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: bipush 1
      // 200: goto 204
      // 203: bipush 0
      // 204: istore 16
      // 206: aload 3
      // 207: iload 6
      // 209: ifeq 217
      // 20c: ifnull 232
      // 20f: goto 216
      // 212: invokestatic vg2.a (Loov;)Loov;
      // 215: athrow
      // 216: aload 3
      // 217: invokevirtual sa6.sns ()Lz0w$enz;
      // 21a: getstatic z0w$enz.kr2 Lz0w$enz;
      // 21d: if_acmpne 229
      // 220: bipush 90
      // 222: istore 17
      // 224: iload 6
      // 226: ifne 235
      // 229: iload 10
      // 22b: istore 17
      // 22d: iload 6
      // 22f: ifne 235
      // 232: bipush 0
      // 233: istore 17
      // 235: iload 15
      // 237: iload 16
      // 239: iload 6
      // 23b: ifeq 24a
      // 23e: ifeq 24d
      // 241: goto 248
      // 244: invokestatic vg2.a (Loov;)Loov;
      // 247: athrow
      // 248: bipush 9
      // 24a: goto 24e
      // 24d: bipush 0
      // 24e: iload 9
      // 250: iadd
      // 251: iload 17
      // 253: iadd
      // 254: bipush 13
      // 256: iadd
      // 257: imul
      // 258: iload 1
      // 259: bipush 50
      // 25b: isub
      // 25c: invokestatic java/lang/Math.min (II)I
      // 25f: iload 15
      // 261: idiv
      // 262: istore 18
      // 264: iload 1
      // 265: bipush 2
      // 266: idiv
      // 267: iload 18
      // 269: iload 15
      // 26b: imul
      // 26c: iload 15
      // 26e: bipush 1
      // 26f: isub
      // 270: bipush 5
      // 271: imul
      // 272: iadd
      // 273: bipush 2
      // 274: idiv
      // 275: isub
      // 276: istore 19
      // 278: iload 18
      // 27a: iload 15
      // 27c: imul
      // 27d: iload 15
      // 27f: bipush 1
      // 280: isub
      // 281: bipush 5
      // 282: imul
      // 283: iadd
      // 284: istore 20
      // 286: aconst_null
      // 287: astore 21
      // 289: aconst_null
      // 28a: astore 22
      // 28c: aload 0
      // 28d: iload 6
      // 28f: ifeq 2a7
      // 292: getfield vg2.qhd Lekw;
      // 295: ifnull 2f6
      // 298: goto 29f
      // 29b: invokestatic vg2.a (Loov;)Loov;
      // 29e: athrow
      // 29f: aload 0
      // 2a0: goto 2a7
      // 2a3: invokestatic vg2.a (Loov;)Loov;
      // 2a6: athrow
      // 2a7: getfield vg2.cs3 Lc05;
      // 2aa: getfield Minecraft.tx1 Lowt;
      // 2ad: aload 0
      // 2ae: getfield vg2.qhd Lekw;
      // 2b1: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 2b6: iload 1
      // 2b7: bipush 50
      // 2b9: isub
      // 2ba: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 2bd: astore 21
      // 2bf: aload 21
      // 2c1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2c6: astore 23
      // 2c8: aload 23
      // 2ca: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2cf: ifeq 2f6
      // 2d2: aload 23
      // 2d4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d9: checkcast java/lang/String
      // 2dc: astore 24
      // 2de: iload 20
      // 2e0: aload 0
      // 2e1: getfield vg2.cs3 Lc05;
      // 2e4: getfield Minecraft.tx1 Lowt;
      // 2e7: aload 24
      // 2e9: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 2ec: invokestatic java/lang/Math.max (II)I
      // 2ef: istore 20
      // 2f1: iload 6
      // 2f3: ifne 2c8
      // 2f6: aload 0
      // 2f7: iload 6
      // 2f9: ifeq 311
      // 2fc: getfield vg2.e52 Lekw;
      // 2ff: ifnull 36c
      // 302: goto 309
      // 305: invokestatic vg2.a (Loov;)Loov;
      // 308: athrow
      // 309: aload 0
      // 30a: goto 311
      // 30d: invokestatic vg2.a (Loov;)Loov;
      // 310: athrow
      // 311: getfield vg2.cs3 Lc05;
      // 314: getfield Minecraft.tx1 Lowt;
      // 317: aload 0
      // 318: getfield vg2.e52 Lekw;
      // 31b: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 320: iload 1
      // 321: bipush 50
      // 323: isub
      // 324: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 327: astore 22
      // 329: aload 22
      // 32b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 330: astore 23
      // 332: aload 23
      // 334: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 339: ifeq 36c
      // 33c: aload 23
      // 33e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 343: checkcast java/lang/String
      // 346: astore 24
      // 348: iload 20
      // 34a: aload 0
      // 34b: getfield vg2.cs3 Lc05;
      // 34e: getfield Minecraft.tx1 Lowt;
      // 351: aload 24
      // 353: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 356: invokestatic java/lang/Math.max (II)I
      // 359: istore 20
      // 35b: iload 6
      // 35d: ifeq 3ae
      // 360: iload 6
      // 362: ifne 332
      // 365: goto 36c
      // 368: invokestatic vg2.a (Loov;)Loov;
      // 36b: athrow
      // 36c: aload 0
      // 36d: getfield vg2.pq8 Z
      // 370: iload 6
      // 372: ifeq 3bb
      // 375: ifeq 3ae
      // 378: goto 37f
      // 37b: invokestatic vg2.a (Loov;)Loov;
      // 37e: athrow
      // 37f: getstatic ipp.jwf Lc_3;
      // 382: sipush 6684
      // 385: ldc2_w 2248079252292657846
      // 388: lload 4
      // 38a: lxor
      // 38b: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 390: nop
      // 391: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 394: ifeq 3a8
      // 397: goto 39e
      // 39a: invokestatic vg2.a (Loov;)Loov;
      // 39d: athrow
      // 39e: ldc 22.0
      // 3a0: nop
      // 3a1: goto 3fd
      // 3a4: invokestatic vg2.a (Loov;)Loov;
      // 3a7: athrow
      // 3a8: ldc 10.0
      // 3aa: nop
      // 3ab: goto 3fd
      // 3ae: aload 8
      // 3b0: invokeinterface java/util/List.size ()I 1
      // 3b5: iload 15
      // 3b7: idiv
      // 3b8: bipush 10
      // 3ba: imul
      // 3bb: aload 21
      // 3bd: iload 6
      // 3bf: ifeq 3ce
      // 3c2: ifnull 3d9
      // 3c5: goto 3cc
      // 3c8: invokestatic vg2.a (Loov;)Loov;
      // 3cb: athrow
      // 3cc: aload 21
      // 3ce: invokeinterface java/util/List.size ()I 1
      // 3d3: bipush 10
      // 3d5: imul
      // 3d6: goto 3da
      // 3d9: bipush 0
      // 3da: iadd
      // 3db: aload 22
      // 3dd: iload 6
      // 3df: ifeq 3ee
      // 3e2: ifnull 3f9
      // 3e5: goto 3ec
      // 3e8: invokestatic vg2.a (Loov;)Loov;
      // 3eb: athrow
      // 3ec: aload 22
      // 3ee: invokeinterface java/util/List.size ()I 1
      // 3f3: bipush 10
      // 3f5: imul
      // 3f6: goto 3fa
      // 3f9: bipush 0
      // 3fa: iadd
      // 3fb: ineg
      // 3fc: i2f
      // 3fd: fstore 23
      // 3ff: aload 0
      // 400: aload 0
      // 401: getfield vg2.ssn F
      // 404: fload 23
      // 406: ldc 10.0
      // 408: nop
      // 409: aload 0
      // 40a: getfield vg2.ssn F
      // 40d: fload 23
      // 40f: fsub
      // 410: invokestatic java/lang/Math.abs (F)F
      // 413: ldc 35.0
      // 415: nop
      // 416: fmul
      // 417: invokestatic java/lang/Math.max (FF)F
      // 41a: ldc 0.3
      // 41c: nop
      // 41d: fmul
      // 41e: invokestatic InputState.lvf (FFF)F
      // 421: putfield vg2.ssn F
      // 424: getstatic ipp.jwf Lc_3;
      // 427: bipush 79
      // 429: ldc2_w 2371358335661406432
      // 42c: lload 4
      // 42e: lxor
      // 42f: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 434: nop
      // 435: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 438: iload 6
      // 43a: ifeq 757
      // 43d: ifeq 750
      // 440: goto 447
      // 443: invokestatic vg2.a (Loov;)Loov;
      // 446: athrow
      // 447: aload 0
      // 448: getfield vg2.dsd F
      // 44b: iload 6
      // 44d: ifeq 475
      // 450: goto 457
      // 453: invokestatic vg2.a (Loov;)Loov;
      // 456: athrow
      // 457: ldc 255.0
      // 459: nop
      // 45a: fcmpl
      // 45b: ifle 471
      // 45e: goto 465
      // 461: invokestatic vg2.a (Loov;)Loov;
      // 464: athrow
      // 465: aload 0
      // 466: fconst_0
      // 467: putfield vg2.dsd F
      // 46a: goto 471
      // 46d: invokestatic vg2.a (Loov;)Loov;
      // 470: athrow
      // 471: aload 0
      // 472: getfield vg2.dsd F
      // 475: fstore 24
      // 477: aload 0
      // 478: getfield vg2.dsd F
      // 47b: ldc 85.0
      // 47d: nop
      // 47e: fadd
      // 47f: fstore 25
      // 481: aload 0
      // 482: getfield vg2.dsd F
      // 485: ldc 170.0
      // 487: nop
      // 488: fadd
      // 489: fstore 26
      // 48b: fload 24
      // 48d: ldc 255.0
      // 48f: nop
      // 490: fcmpl
      // 491: iload 6
      // 493: ifeq 4a9
      // 496: ifle 4a3
      // 499: goto 4a0
      // 49c: invokestatic vg2.a (Loov;)Loov;
      // 49f: athrow
      // 4a0: fconst_0
      // 4a1: fstore 24
      // 4a3: fload 25
      // 4a5: ldc 255.0
      // 4a7: nop
      // 4a8: fcmpl
      // 4a9: iload 6
      // 4ab: ifeq 4d2
      // 4ae: ifle 4c0
      // 4b1: goto 4b8
      // 4b4: invokestatic vg2.a (Loov;)Loov;
      // 4b7: athrow
      // 4b8: fload 25
      // 4ba: ldc 255.0
      // 4bc: nop
      // 4bd: fsub
      // 4be: fstore 25
      // 4c0: fload 26
      // 4c2: ldc 255.0
      // 4c4: nop
      // 4c5: iload 6
      // 4c7: ifeq 4e6
      // 4ca: fcmpl
      // 4cb: goto 4d2
      // 4ce: invokestatic vg2.a (Loov;)Loov;
      // 4d1: athrow
      // 4d2: ifle 4dd
      // 4d5: fload 26
      // 4d7: ldc 255.0
      // 4d9: nop
      // 4da: fsub
      // 4db: fstore 26
      // 4dd: fload 24
      // 4df: ldc 255.0
      // 4e1: nop
      // 4e2: fdiv
      // 4e3: ldc 0.4
      // 4e5: nop
      // 4e6: fconst_1
      // 4e7: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
      // 4ea: astore 27
      // 4ec: fload 25
      // 4ee: ldc 255.0
      // 4f0: nop
      // 4f1: fdiv
      // 4f2: ldc 0.4
      // 4f4: nop
      // 4f5: fconst_1
      // 4f6: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
      // 4f9: astore 28
      // 4fb: fload 26
      // 4fd: ldc 255.0
      // 4ff: nop
      // 500: fdiv
      // 501: ldc 0.4
      // 503: nop
      // 504: fconst_1
      // 505: invokestatic java/awt/Color.getHSBColor (FFF)Ljava/awt/Color;
      // 508: astore 29
      // 50a: aload 27
      // 50c: invokevirtual java/awt/Color.getRGB ()I
      // 50f: istore 30
      // 511: aload 28
      // 513: invokevirtual java/awt/Color.getRGB ()I
      // 516: istore 31
      // 518: aload 29
      // 51a: invokevirtual java/awt/Color.getRGB ()I
      // 51d: istore 32
      // 51f: aload 0
      // 520: aload 0
      // 521: getfield vg2.dsd F
      // 524: ldc 0.05
      // 526: nop
      // 527: fadd
      // 528: putfield vg2.dsd F
      // 52b: aload 8
      // 52d: invokeinterface java/util/List.size ()I 1
      // 532: iload 15
      // 534: idiv
      // 535: aload 8
      // 537: invokeinterface java/util/List.size ()I 1
      // 53c: iload 15
      // 53e: irem
      // 53f: iadd
      // 540: aload 0
      // 541: getfield vg2.cs3 Lc05;
      // 544: getfield Minecraft.tx1 Lowt;
      // 547: getfield owt.rr7 I
      // 54a: imul
      // 54b: bipush 1
      // 54c: iadd
      // 54d: aload 21
      // 54f: iload 6
      // 551: ifeq 560
      // 554: ifnull 575
      // 557: goto 55e
      // 55a: invokestatic vg2.a (Loov;)Loov;
      // 55d: athrow
      // 55e: aload 21
      // 560: invokeinterface java/util/List.size ()I 1
      // 565: aload 0
      // 566: getfield vg2.cs3 Lc05;
      // 569: getfield Minecraft.tx1 Lowt;
      // 56c: getfield owt.rr7 I
      // 56f: imul
      // 570: bipush 1
      // 571: iadd
      // 572: goto 576
      // 575: bipush 0
      // 576: iadd
      // 577: aload 22
      // 579: iload 6
      // 57b: ifeq 58a
      // 57e: ifnull 59f
      // 581: goto 588
      // 584: invokestatic vg2.a (Loov;)Loov;
      // 587: athrow
      // 588: aload 22
      // 58a: invokeinterface java/util/List.size ()I 1
      // 58f: aload 0
      // 590: getfield vg2.cs3 Lc05;
      // 593: getfield Minecraft.tx1 Lowt;
      // 596: getfield owt.rr7 I
      // 599: imul
      // 59a: bipush 4
      // 59b: iadd
      // 59c: goto 5a0
      // 59f: bipush 0
      // 5a0: iadd
      // 5a1: bipush 1
      // 5a2: iadd
      // 5a3: i2f
      // 5a4: fstore 33
      // 5a6: getstatic d3x.jg8 Ld3x;
      // 5a9: iload 1
      // 5aa: bipush 2
      // 5ab: idiv
      // 5ac: iload 20
      // 5ae: bipush 2
      // 5af: idiv
      // 5b0: isub
      // 5b1: i2f
      // 5b2: ldc 5.5
      // 5b4: nop
      // 5b5: fsub
      // 5b6: f2d
      // 5b7: aload 0
      // 5b8: getfield vg2.ssn F
      // 5bb: ldc 3.5
      // 5bd: nop
      // 5be: fsub
      // 5bf: f2d
      // 5c0: iload 1
      // 5c1: bipush 2
      // 5c2: idiv
      // 5c3: iload 20
      // 5c5: bipush 2
      // 5c6: idiv
      // 5c7: iadd
      // 5c8: i2f
      // 5c9: ldc 5.5
      // 5cb: nop
      // 5cc: fadd
      // 5cd: f2d
      // 5ce: aload 0
      // 5cf: getfield vg2.ssn F
      // 5d2: fload 33
      // 5d4: fadd
      // 5d5: ldc 0.5
      // 5d7: nop
      // 5d8: fsub
      // 5d9: f2d
      // 5da: ldc -14473943
      // 5dc: nop
      // 5dd: invokevirtual d3x.frl (DDDDI)V
      // 5e0: getstatic d3x.jg8 Ld3x;
      // 5e3: iload 1
      // 5e4: bipush 2
      // 5e5: idiv
      // 5e6: iload 20
      // 5e8: bipush 2
      // 5e9: idiv
      // 5ea: isub
      // 5eb: i2f
      // 5ec: ldc 5.5
      // 5ee: nop
      // 5ef: fsub
      // 5f0: f2d
      // 5f1: aload 0
      // 5f2: getfield vg2.ssn F
      // 5f5: ldc 3.5
      // 5f7: nop
      // 5f8: fsub
      // 5f9: f2d
      // 5fa: iload 1
      // 5fb: bipush 2
      // 5fc: idiv
      // 5fd: iload 20
      // 5ff: bipush 2
      // 600: idiv
      // 601: iadd
      // 602: i2f
      // 603: ldc 5.5
      // 605: nop
      // 606: fadd
      // 607: f2d
      // 608: aload 0
      // 609: getfield vg2.ssn F
      // 60c: fload 33
      // 60e: fadd
      // 60f: ldc 0.5
      // 611: nop
      // 612: fsub
      // 613: f2d
      // 614: ldc2_w 0.5
      // 617: ldc 16777215
      // 619: nop
      // 61a: bipush 10
      // 61c: invokestatic z7e._mb (I)I
      // 61f: invokevirtual d3x.wof (DDDDDII)V
      // 622: getstatic d3x.jg8 Ld3x;
      // 625: iload 1
      // 626: bipush 2
      // 627: idiv
      // 628: iload 20
      // 62a: bipush 2
      // 62b: idiv
      // 62c: isub
      // 62d: i2f
      // 62e: ldc 5.0
      // 630: nop
      // 631: fsub
      // 632: f2d
      // 633: aload 0
      // 634: getfield vg2.ssn F
      // 637: ldc 3.0
      // 639: nop
      // 63a: fsub
      // 63b: f2d
      // 63c: iload 1
      // 63d: bipush 2
      // 63e: idiv
      // 63f: iload 20
      // 641: bipush 2
      // 642: idiv
      // 643: iadd
      // 644: i2f
      // 645: ldc 5.0
      // 647: nop
      // 648: fadd
      // 649: f2d
      // 64a: aload 0
      // 64b: getfield vg2.ssn F
      // 64e: fload 33
      // 650: fadd
      // 651: fconst_1
      // 652: fsub
      // 653: f2d
      // 654: ldc2_w 0.5
      // 657: ldc 16777215
      // 659: nop
      // 65a: bipush 100
      // 65c: invokestatic z7e._mb (I)I
      // 65f: invokevirtual d3x.wof (DDDDDII)V
      // 662: getstatic d3x.jg8 Ld3x;
      // 665: iload 1
      // 666: bipush 2
      // 667: idiv
      // 668: iload 20
      // 66a: bipush 2
      // 66b: idiv
      // 66c: isub
      // 66d: i2f
      // 66e: ldc 4.5
      // 670: nop
      // 671: fsub
      // 672: f2d
      // 673: aload 0
      // 674: getfield vg2.ssn F
      // 677: ldc 2.5
      // 679: nop
      // 67a: fsub
      // 67b: f2d
      // 67c: iload 1
      // 67d: bipush 2
      // 67e: idiv
      // 67f: iload 20
      // 681: bipush 2
      // 682: idiv
      // 683: iadd
      // 684: i2f
      // 685: ldc 4.5
      // 687: nop
      // 688: fadd
      // 689: f2d
      // 68a: aload 0
      // 68b: getfield vg2.ssn F
      // 68e: fload 33
      // 690: fadd
      // 691: ldc 1.5
      // 693: nop
      // 694: fsub
      // 695: f2d
      // 696: dconst_1
      // 697: bipush 0
      // 698: bipush 0
      // 699: invokestatic z7e.ynt (II)I
      // 69c: bipush 60
      // 69e: invokestatic z7e._mb (I)I
      // 6a1: invokevirtual d3x.wof (DDDDDII)V
      // 6a4: getstatic d3x.jg8 Ld3x;
      // 6a7: iload 1
      // 6a8: bipush 2
      // 6a9: idiv
      // 6aa: iload 20
      // 6ac: bipush 2
      // 6ad: idiv
      // 6ae: isub
      // 6af: i2f
      // 6b0: ldc 3.5
      // 6b2: nop
      // 6b3: fsub
      // 6b4: f2d
      // 6b5: aload 0
      // 6b6: getfield vg2.ssn F
      // 6b9: ldc 1.5
      // 6bb: nop
      // 6bc: fsub
      // 6bd: f2d
      // 6be: iload 1
      // 6bf: bipush 2
      // 6c0: idiv
      // 6c1: iload 20
      // 6c3: bipush 2
      // 6c4: idiv
      // 6c5: iadd
      // 6c6: i2f
      // 6c7: ldc 3.5
      // 6c9: nop
      // 6ca: fadd
      // 6cb: f2d
      // 6cc: aload 0
      // 6cd: getfield vg2.ssn F
      // 6d0: fload 33
      // 6d2: fadd
      // 6d3: ldc 2.5
      // 6d5: nop
      // 6d6: fsub
      // 6d7: f2d
      // 6d8: ldc2_w 0.5
      // 6db: bipush 0
      // 6dc: bipush 0
      // 6dd: invokestatic z7e.ynt (II)I
      // 6e0: bipush 100
      // 6e2: invokestatic z7e._mb (I)I
      // 6e5: invokevirtual d3x.wof (DDDDDII)V
      // 6e8: aload 0
      // 6e9: pop
      // 6ea: iload 1
      // 6eb: bipush 2
      // 6ec: idiv
      // 6ed: iload 20
      // 6ef: bipush 2
      // 6f0: idiv
      // 6f1: isub
      // 6f2: i2f
      // 6f3: ldc 3.0
      // 6f5: nop
      // 6f6: fsub
      // 6f7: aload 0
      // 6f8: getfield vg2.ssn F
      // 6fb: fload 33
      // 6fd: fadd
      // 6fe: ldc 3.5
      // 700: nop
      // 701: fsub
      // 702: iload 1
      // 703: bipush 2
      // 704: idiv
      // 705: i2f
      // 706: ldc 3.0
      // 708: nop
      // 709: fadd
      // 70a: aload 0
      // 70b: getfield vg2.ssn F
      // 70e: fload 33
      // 710: fadd
      // 711: ldc 3.0
      // 713: nop
      // 714: fsub
      // 715: iload 30
      // 717: iload 31
      // 719: invokestatic vg2.pmr (FFFFII)V
      // 71c: aload 0
      // 71d: pop
      // 71e: iload 1
      // 71f: bipush 2
      // 720: idiv
      // 721: i2f
      // 722: ldc 3.0
      // 724: nop
      // 725: fsub
      // 726: aload 0
      // 727: getfield vg2.ssn F
      // 72a: fload 33
      // 72c: fadd
      // 72d: ldc 3.5
      // 72f: nop
      // 730: fsub
      // 731: iload 1
      // 732: bipush 2
      // 733: idiv
      // 734: iload 20
      // 736: bipush 2
      // 737: idiv
      // 738: iadd
      // 739: i2f
      // 73a: ldc 3.0
      // 73c: nop
      // 73d: fadd
      // 73e: aload 0
      // 73f: getfield vg2.ssn F
      // 742: fload 33
      // 744: fadd
      // 745: ldc 3.0
      // 747: nop
      // 748: fsub
      // 749: iload 31
      // 74b: iload 32
      // 74d: invokestatic vg2.pmr (FFFFII)V
      // 750: fload 23
      // 752: aload 0
      // 753: getfield vg2.ssn F
      // 756: fcmpl
      // 757: iload 6
      // 759: ifeq 771
      // 75c: ifne 785
      // 75f: goto 766
      // 762: invokestatic vg2.a (Loov;)Loov;
      // 765: athrow
      // 766: fload 23
      // 768: fconst_0
      // 769: fcmpg
      // 76a: goto 771
      // 76d: invokestatic vg2.a (Loov;)Loov;
      // 770: athrow
      // 771: ifge 785
      // 774: aload 0
      // 775: bipush 1
      // 776: putfield vg2.o_c Z
      // 779: iload 6
      // 77b: ifne 791
      // 77e: goto 785
      // 781: invokestatic vg2.a (Loov;)Loov;
      // 784: athrow
      // 785: aload 0
      // 786: bipush 0
      // 787: putfield vg2.o_c Z
      // 78a: goto 791
      // 78d: invokestatic vg2.a (Loov;)Loov;
      // 790: athrow
      // 791: aload 0
      // 792: getfield vg2.ssn F
      // 795: fstore 24
      // 797: aload 21
      // 799: ifnull 874
      // 79c: getstatic ipp.jwf Lc_3;
      // 79f: bipush 79
      // 7a1: ldc2_w 2371358335661406432
      // 7a4: lload 4
      // 7a6: lxor
      // 7a7: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ac: nop
      // 7ad: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 7b0: iload 6
      // 7b2: ifeq 7d7
      // 7b5: goto 7bc
      // 7b8: invokestatic vg2.a (Loov;)Loov;
      // 7bb: athrow
      // 7bc: ifne 803
      // 7bf: goto 7c6
      // 7c2: invokestatic vg2.a (Loov;)Loov;
      // 7c5: athrow
      // 7c6: iload 1
      // 7c7: bipush 2
      // 7c8: idiv
      // 7c9: iload 20
      // 7cb: bipush 2
      // 7cc: idiv
      // 7cd: isub
      // 7ce: bipush 2
      // 7cf: isub
      // 7d0: goto 7d7
      // 7d3: invokestatic vg2.a (Loov;)Loov;
      // 7d6: athrow
      // 7d7: i2f
      // 7d8: fload 24
      // 7da: fconst_1
      // 7db: fsub
      // 7dc: iload 1
      // 7dd: bipush 2
      // 7de: idiv
      // 7df: iload 20
      // 7e1: bipush 2
      // 7e2: idiv
      // 7e3: iadd
      // 7e4: bipush 2
      // 7e5: iadd
      // 7e6: i2f
      // 7e7: fload 24
      // 7e9: aload 21
      // 7eb: invokeinterface java/util/List.size ()I 1
      // 7f0: aload 0
      // 7f1: getfield vg2.cs3 Lc05;
      // 7f4: getfield Minecraft.tx1 Lowt;
      // 7f7: getfield owt.rr7 I
      // 7fa: imul
      // 7fb: i2f
      // 7fc: fadd
      // 7fd: ldc -868203445
      // 7ff: nop
      // 800: invokestatic vg2.df9 (FFFFI)V
      // 803: aload 21
      // 805: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 80a: astore 25
      // 80c: aload 25
      // 80e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 813: ifeq 86e
      // 816: aload 25
      // 818: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 81d: checkcast java/lang/String
      // 820: astore 26
      // 822: aload 0
      // 823: getfield vg2.cs3 Lc05;
      // 826: getfield Minecraft.tx1 Lowt;
      // 829: aload 26
      // 82b: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 82e: istore 27
      // 830: aload 0
      // 831: getfield vg2.cs3 Lc05;
      // 834: getfield Minecraft.tx1 Lowt;
      // 837: aload 26
      // 839: iload 1
      // 83a: bipush 2
      // 83b: idiv
      // 83c: iload 27
      // 83e: bipush 2
      // 83f: idiv
      // 840: isub
      // 841: i2f
      // 842: fload 24
      // 844: ldc 0.5
      // 846: nop
      // 847: fadd
      // 848: bipush -1
      // 849: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 84c: pop
      // 84d: fload 24
      // 84f: aload 0
      // 850: getfield vg2.cs3 Lc05;
      // 853: getfield Minecraft.tx1 Lowt;
      // 856: getfield owt.rr7 I
      // 859: i2f
      // 85a: fadd
      // 85b: fstore 24
      // 85d: iload 6
      // 85f: ifeq 874
      // 862: iload 6
      // 864: ifne 80c
      // 867: goto 86e
      // 86a: invokestatic vg2.a (Loov;)Loov;
      // 86d: athrow
      // 86e: fload 24
      // 870: fconst_1
      // 871: fadd
      // 872: fstore 24
      // 874: getstatic ipp.jwf Lc_3;
      // 877: bipush 79
      // 879: ldc2_w 2371358335661406432
      // 87c: lload 4
      // 87e: lxor
      // 87f: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 884: nop
      // 885: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 888: iload 6
      // 88a: ifeq 8c8
      // 88d: ifne 8c7
      // 890: goto 897
      // 893: invokestatic vg2.a (Loov;)Loov;
      // 896: athrow
      // 897: iload 1
      // 898: bipush 2
      // 899: idiv
      // 89a: iload 20
      // 89c: bipush 2
      // 89d: idiv
      // 89e: isub
      // 89f: bipush 2
      // 8a0: isub
      // 8a1: i2f
      // 8a2: fload 24
      // 8a4: fconst_1
      // 8a5: fsub
      // 8a6: iload 1
      // 8a7: bipush 2
      // 8a8: idiv
      // 8a9: iload 20
      // 8ab: bipush 2
      // 8ac: idiv
      // 8ad: iadd
      // 8ae: bipush 2
      // 8af: iadd
      // 8b0: i2f
      // 8b1: fload 24
      // 8b3: iload 14
      // 8b5: bipush 9
      // 8b7: imul
      // 8b8: i2f
      // 8b9: fadd
      // 8ba: ldc -868203445
      // 8bc: nop
      // 8bd: invokestatic vg2.df9 (FFFFI)V
      // 8c0: goto 8c7
      // 8c3: invokestatic vg2.a (Loov;)Loov;
      // 8c6: athrow
      // 8c7: bipush 0
      // 8c8: istore 25
      // 8ca: iload 25
      // 8cc: iload 13
      // 8ce: if_icmpge c8b
      // 8d1: iload 25
      // 8d3: iload 14
      // 8d5: idiv
      // 8d6: istore 26
      // 8d8: iload 25
      // 8da: iload 14
      // 8dc: irem
      // 8dd: istore 27
      // 8df: iload 19
      // 8e1: iload 26
      // 8e3: iload 18
      // 8e5: imul
      // 8e6: iadd
      // 8e7: iload 26
      // 8e9: bipush 5
      // 8ea: imul
      // 8eb: iadd
      // 8ec: istore 28
      // 8ee: fload 24
      // 8f0: iload 27
      // 8f2: bipush 9
      // 8f4: imul
      // 8f5: i2f
      // 8f6: fadd
      // 8f7: fstore 29
      // 8f9: iload 28
      // 8fb: i2f
      // 8fc: fload 29
      // 8fe: iload 28
      // 900: iload 18
      // 902: iadd
      // 903: i2f
      // 904: fload 29
      // 906: ldc 9.0
      // 908: nop
      // 909: fadd
      // 90a: getstatic ipp.jwf Lc_3;
      // 90d: bipush 79
      // 90f: ldc2_w 2371358335661406432
      // 912: lload 4
      // 914: lxor
      // 915: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91a: nop
      // 91b: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // 91e: iload 6
      // 920: ifeq db1
      // 923: iload 6
      // 925: ifeq 945
      // 928: goto 92f
      // 92b: invokestatic vg2.a (Loov;)Loov;
      // 92e: athrow
      // 92f: ifeq 943
      // 932: goto 939
      // 935: invokestatic vg2.a (Loov;)Loov;
      // 938: athrow
      // 939: ldc -12565429
      // 93b: nop
      // 93c: goto 94b
      // 93f: invokestatic vg2.a (Loov;)Loov;
      // 942: athrow
      // 943: bipush 60
      // 945: sipush 150
      // 948: invokestatic z7e.ynt (II)I
      // 94b: invokestatic vg2.df9 (FFFFI)V
      // 94e: fconst_1
      // 94f: fconst_1
      // 950: fconst_1
      // 951: fconst_1
      // 952: invokestatic hzu.wn0 (FFFF)V
      // 955: invokestatic hzu.if9 ()V
      // 958: invokestatic hzu.spd ()V
      // 95b: sipush 770
      // 95e: sipush 771
      // 961: bipush 1
      // 962: bipush 0
      // 963: invokestatic hzu.u39 (IIII)V
      // 966: iload 6
      // 968: ifeq c86
      // 96b: iload 25
      // 96d: aload 8
      // 96f: invokeinterface java/util/List.size ()I 1
      // 974: if_icmpge c83
      // 977: goto 97e
      // 97a: invokestatic vg2.a (Loov;)Loov;
      // 97d: athrow
      // 97e: aload 8
      // 980: iload 25
      // 982: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 987: checkcast hv2
      // 98a: astore 30
      // 98c: aload 0
      // 98d: aload 30
      // 98f: invokevirtual vg2.m57 (Lhv2;)Ljava/lang/String;
      // 992: astore 31
      // 994: new s60
      // 997: dup
      // 998: aload 31
      // 99a: invokespecial s60.<init> (Ljava/lang/String;)V
      // 99d: astore 32
      // 99f: aload 32
      // 9a1: invokestatic EventBus.esg (Lvlc;)Lvlc;
      // 9a4: pop
      // 9a5: getstatic ClientState.qkk Lzwr;
      // 9a8: invokevirtual ClientState.zr7 ()Laz4;
      // 9ab: astore 33
      // 9ad: aload 33
      // 9af: aload 30
      // 9b1: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // 9b4: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 9b7: invokevirtual az4.wu0 (Ljava/lang/String;)Ljava/lang/String;
      // 9ba: astore 34
      // 9bc: aload 34
      // 9be: iload 6
      // 9c0: ifeq 9d7
      // 9c3: ifnonnull 9da
      // 9c6: goto 9cd
      // 9c9: invokestatic vg2.a (Loov;)Loov;
      // 9cc: athrow
      // 9cd: ldc ""
      // 9cf: nop
      // 9d0: goto 9d7
      // 9d3: invokestatic vg2.a (Loov;)Loov;
      // 9d6: athrow
      // 9d7: goto 9f1
      // 9da: new java/lang/StringBuilder
      // 9dd: dup
      // 9de: invokespecial java/lang/StringBuilder.<init> ()V
      // 9e1: aload 34
      // 9e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9e6: aload 32
      // 9e8: getfield s60.jcg Ljava/lang/String;
      // 9eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9f1: astore 31
      // 9f3: aload 31
      // 9f5: sipush 19876
      // 9f8: ldc2_w 9099011048863741196
      // 9fb: lload 4
      // 9fd: lxor
      // 9fe: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a03: nop
      // a04: getstatic ClientState.qkk Lzwr;
      // a07: pop
      // a08: getstatic ClientState.ien Lcn7;
      // a0b: invokevirtual BooleanSetting.g7m ()Z
      // a0e: ifeq a1b
      // a11: ldc ""
      // a13: nop
      // a14: goto a2a
      // a17: invokestatic vg2.a (Loov;)Loov;
      // a1a: athrow
      // a1b: sipush 11730
      // a1e: ldc2_w 7151885461537150331
      // a21: lload 4
      // a23: lxor
      // a24: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a29: nop
      // a2a: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // a2d: astore 31
      // a2f: aload 30
      // a31: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // a34: astore 35
      // a36: iload 16
      // a38: ifeq RotationHelper
      // a3b: aload 0
      // a3c: getfield vg2.cs3 Lc05;
      // a3f: getfield Minecraft.tij Lkh3;
      // a42: aload 35
      // a44: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // a47: invokevirtual WorldClient.hlz (Ljava/util/UUID;)Lha9;
      // a4a: astore 36
      // a4c: aload 36
      // a4e: iload 6
      // a50: ifeq a5f
      // a53: ifnull ad2
      // a56: goto a5d
      // a59: invokestatic vg2.a (Loov;)Loov;
      // a5c: athrow
      // a5d: aload 36
      // a5f: getstatic ulc.zah Lulc;
      // a62: invokevirtual ha9.cuw (Lulc;)Z
      // dispatchTo: iload 6
      // a67: ifeq a92
      // a6a: ifeq ad2
      // a6d: goto a74
      // a70: invokestatic vg2.a (Loov;)Loov;
      // a73: athrow
      // a74: aload 35
      // a76: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // a79: sipush 31341
      // a7c: ldc2_w 3415788807418839745
      // a7f: lload 4
      // a81: lxor
      // a82: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a87: nop
      // a88: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a8b: goto a92
      // a8e: invokestatic vg2.a (Loov;)Loov;
      // a91: athrow
      // a92: iload 6
      // a94: ifeq acf
      // a97: ifne ace
      // a9a: goto aa1
      // a9d: invokestatic vg2.a (Loov;)Loov;
      // aa0: athrow
      // aa1: aload 35
      // aa3: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // aa6: sipush 24338
      // aa9: ldc2_w 4245682053543045049
      // aac: lload 4
      // aae: lxor
      // aaf: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab4: nop
      // ab5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // ab8: iload 6
      // aba: ifeq acf
      // abd: goto ac4
      // ac0: invokestatic vg2.a (Loov;)Loov;
      // ac3: athrow
      // ac4: ifeq ad2
      // ac7: goto ace
      // aca: invokestatic vg2.a (Loov;)Loov;
      // acd: athrow
      // ace: bipush 1
      // acf: goto ad3
      // ad2: bipush 0
      // ad3: istore 37
      // ad5: aload 0
      // ad6: getfield vg2.cs3 Lc05;
      // ad9: invokevirtual Minecraft.l22 ()Llc5;
      // adc: aload 30
      // ade: invokevirtual hv2.dq7 ()Lgdz;
      // ae1: invokevirtual lc5.anl (Lgdz;)V
      // ae4: bipush 8
      // ae6: iload 37
      // ae8: iload 6
      // aea: ifeq af9
      // aed: ifeq afc
      // af0: goto af7
      // af3: invokestatic vg2.a (Loov;)Loov;
      // af6: athrow
      // af7: bipush 8
      // af9: goto afd
      // afc: bipush 0
      // afd: iadd
      // afe: istore 38
      // b00: bipush 8
      // b02: iload 37
      // b04: iload 6
      // b06: ifeq b14
      // b09: ifeq b17
      // b0c: goto b13
      // b0f: invokestatic vg2.a (Loov;)Loov;
      // b12: athrow
      // b13: bipush -1
      // b14: goto b18
      // b17: bipush 1
      // b18: imul
      // b19: istore 39
      // b1b: iload 28
      // b1d: i2f
      // b1e: fload 29
      // b20: ldc 8.0
      // b22: nop
      // b23: iload 38
      // b25: i2f
      // b26: bipush 8
      // b28: iload 39
      // b2a: bipush 9
      // b2c: bipush 9
      // b2e: ldc 64.0
      // b30: nop
      // b31: ldc 64.0
      // b33: nop
      // b34: invokestatic b0t.oc3 (FFFFIIIIFF)V
      // b37: aload 36
      // b39: iload 6
      // b3b: ifeq b4a
      // b3e: ifnull bb2
      // b41: goto b48
      // b44: invokestatic vg2.a (Loov;)Loov;
      // b47: athrow
      // b48: aload 36
      // b4a: getstatic ulc.gn8 Lulc;
      // b4d: invokevirtual ha9.cuw (Lulc;)Z
      // b50: iload 6
      // b52: ifeq b61
      // b55: ifeq bb2
      // b58: goto b5f
      // b5b: invokestatic vg2.a (Loov;)Loov;
      // b5e: athrow
      // b5f: bipush 8
      // b61: iload 37
      // b63: iload 6
      // b65: ifeq b74
      // b68: ifeq b77
      // b6b: goto b72
      // b6e: invokestatic vg2.a (Loov;)Loov;
      // b71: athrow
      // b72: bipush 8
      // b74: goto b78
      // b77: bipush 0
      // b78: iadd
      // b79: istore 40
      // b7b: bipush 8
      // b7d: iload 37
      // b7f: iload 6
      // b81: ifeq b8f
      // b84: ifeq b92
      // b87: goto b8e
      // b8a: invokestatic vg2.a (Loov;)Loov;
      // b8d: athrow
      // b8e: bipush -1
      // b8f: goto b93
      // b92: bipush 1
      // b93: imul
      // b94: istore 41
      // b96: iload 28
      // b98: i2f
      // b99: fload 29
      // b9b: ldc 40.0
      // b9d: nop
      // b9e: iload 40
      // ba0: i2f
      // ba1: bipush 8
      // ba3: iload 41
      // ba5: bipush 9
      // ba7: bipush 9
      // ba9: ldc 64.0
      // bab: nop
      // bac: ldc 64.0
      // bae: nop
      // baf: invokestatic b0t.oc3 (FFFFIIIIFF)V
      // bb2: iinc 28 9
      // RotationHelper: aload 30
      // bb7: invokevirtual hv2.j3n ()Lh50$f05;
      // bba: getstatic h50$f05.l18 Lh50$f05;
      // bbd: if_acmpne bf7
      // bc0: new java/lang/StringBuilder
      // bc3: dup
      // bc4: invokespecial java/lang/StringBuilder.<init> ()V
      // bc7: getstatic syo.zz9 Lsyo;
      // bca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // bcd: aload 31
      // bcf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bd2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // bd5: astore 31
      // bd7: aload 0
      // bd8: getfield vg2.cs3 Lc05;
      // bdb: getfield Minecraft.tx1 Lowt;
      // bde: aload 31
      // be0: iload 28
      // be2: i2f
      // be3: fconst_1
      // be4: fadd
      // be5: fload 29
      // be7: ldc 0.5
      // be9: nop
      // bea: fadd
      // beb: ldc -1862270977
      // bed: nop
      // bee: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // bf1: pop
      // bf2: iload 6
      // bf4: ifne c17
      // bf7: aload 0
      // bf8: getfield vg2.cs3 Lc05;
      // bfb: getfield Minecraft.tx1 Lowt;
      // bfe: aload 31
      // c00: iload 28
      // c02: i2f
      // c03: fconst_1
      // c04: fadd
      // Minecraft: fload 29
      // c07: ldc 0.5
      // c09: nop
      // c0a: fadd
      // c0b: bipush -1
      // c0c: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // c0f: pop
      // c10: goto c17
      // c13: invokestatic vg2.a (Loov;)Loov;
      // c16: athrow
      // c17: aload 3
      // c18: ifnull c5f
      // c1b: aload 30
      // c1d: invokevirtual hv2.j3n ()Lh50$f05;
      // c20: getstatic h50$f05.l18 Lh50$f05;
      // c23: if_acmpeq c5f
      // c26: goto c2d
      // c29: invokestatic vg2.a (Loov;)Loov;
      // c2c: athrow
      // c2d: iload 28
      // c2f: iload 9
      // c31: iadd
      // c32: bipush 1
      // c33: iadd
      // c34: istore 36
      // c36: iload 36
      // c38: iload 17
      // c3a: iadd
      // c3b: istore 37
      // c3d: iload 37
      // c3f: iload 36
      // c41: isub
      // c42: bipush 5
      // c43: if_icmple c5f
      // c46: aload 0
      // c47: aload 3
      // c48: fload 29
      // c4a: aload 35
      // c4c: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // c4f: iload 36
      // c51: iload 37
      // c53: aload 30
      // c55: invokespecial vg2.er9 (Lsa6;FLjava/lang/String;IILhv2;)V
      // c58: goto c5f
      // c5b: invokestatic vg2.a (Loov;)Loov;
      // c5e: athrow
      // c5f: aload 0
      // c60: iload 18
      // c62: iload 28
      // c64: iload 16
      // c66: iload 6
      // c68: ifeq c77
      // c6b: ifeq c7a
      // c6e: goto c75
      // c71: invokestatic vg2.a (Loov;)Loov;
      // c74: athrow
      // c75: bipush 9
      // c77: goto c7b
      // c7a: bipush 0
      // c7b: isub
      // c7c: fload 29
      // c7e: aload 30
      // c80: invokevirtual vg2.kji (IIFLhv2;)V
      // c83: iinc 25 1
      // c86: iload 6
      // c88: ifne 8ca
      // c8b: aload 22
      // c8d: ifnull d66
      // c90: fload 24
      // c92: iload 14
      // c94: bipush 9
      // c96: imul
      // c97: i2f
      // c98: fadd
      // c99: fconst_1
      // c9a: fadd
      // c9b: fstore 24
      // c9d: getstatic ipp.jwf Lc_3;
      // ca0: bipush 79
      // ca2: ldc2_w 2371358335661406432
      // ca5: lload 4
      // ca7: lxor
      // ca8: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cad: nop
      // cae: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // cb1: iload 6
      // cb3: ifeq cd1
      // cb6: ifne cff
      // cb9: goto cc0
      // cbc: invokestatic vg2.a (Loov;)Loov;
      // cbf: athrow
      // cc0: iload 1
      // cc1: bipush 2
      // cc2: idiv
      // cc3: iload 20
      // cc5: bipush 2
      // cc6: idiv
      // cc7: isub
      // cc8: bipush 2
      // cc9: isub
      // cca: goto cd1
      // ccd: invokestatic vg2.a (Loov;)Loov;
      // cd0: athrow
      // cd1: i2f
      // cd2: fload 24
      // cd4: fconst_1
      // cd5: fsub
      // cd6: iload 1
      // cd7: bipush 2
      // cd8: idiv
      // cd9: iload 20
      // cdb: bipush 2
      // cdc: idiv
      // cdd: iadd
      // cde: bipush 2
      // cdf: iadd
      // ce0: i2f
      // ce1: fload 24
      // ce3: aload 22
      // ce5: invokeinterface java/util/List.size ()I 1
      // cea: aload 0
      // ceb: getfield vg2.cs3 Lc05;
      // cee: getfield Minecraft.tx1 Lowt;
      // cf1: getfield owt.rr7 I
      // cf4: imul
      // cf5: i2f
      // cf6: fadd
      // cf7: fconst_2
      // cf8: fadd
      // cf9: ldc -868203445
      // cfb: nop
      // cfc: invokestatic vg2.df9 (FFFFI)V
      // cff: aload 22
      // d01: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // d06: astore 25
      // d08: aload 25
      // d0a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // d0f: ifeq d66
      // d12: aload 25
      // d14: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // d19: checkcast java/lang/String
      // d1c: astore 26
      // d1e: aload 0
      // d1f: getfield vg2.cs3 Lc05;
      // d22: getfield Minecraft.tx1 Lowt;
      // d25: aload 26
      // d27: invokevirtual owt.ezt (Ljava/lang/String;)I
      // d2a: istore 27
      // d2c: aload 0
      // d2d: getfield vg2.cs3 Lc05;
      // d30: getfield Minecraft.tx1 Lowt;
      // d33: aload 26
      // d35: iload 1
      // d36: bipush 2
      // d37: idiv
      // d38: iload 27
      // d3a: bipush 2
      // d3b: idiv
      // d3c: isub
      // d3d: i2f
      // d3e: fload 24
      // d40: bipush -1
      // d41: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // d44: pop
      // d45: fload 24
      // d47: aload 0
      // d48: getfield vg2.cs3 Lc05;
      // d4b: getfield Minecraft.tx1 Lowt;
      // d4e: getfield owt.rr7 I
      // d51: i2f
      // d52: fadd
      // d53: fstore 24
      // d55: iload 6
      // d57: ifeq db4
      // d5a: iload 6
      // d5c: ifne d08
      // d5f: goto d66
      // d62: invokestatic vg2.a (Loov;)Loov;
      // d65: athrow
      // d66: getstatic ipp.jwf Lc_3;
      // d69: bipush 79
      // d6b: ldc2_w 2371358335661406432
      // d6e: lload 4
      // d70: lxor
      // d71: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d76: nop
      // d77: invokevirtual ModeSetting.isAllowedValue (Ljava/lang/String;)Z
      // d7a: iload 6
      // getValue: ifeq d9a
      // d7f: ifne db4
      // d82: goto d89
      // d85: invokestatic vg2.a (Loov;)Loov;
      // d88: athrow
      // d89: iload 1
      // d8a: bipush 2
      // d8b: idiv
      // d8c: iload 20
      // d8e: bipush 2
      // d8f: idiv
      // d90: isub
      // d91: bipush 2
      // d92: isub
      // d93: goto d9a
      // d96: invokestatic vg2.a (Loov;)Loov;
      // d99: athrow
      // d9a: i2f
      // d9b: fload 24
      // d9d: fconst_1
      // d9e: fadd
      // d9f: iload 1
      // da0: bipush 2
      // da1: idiv
      // da2: iload 20
      // da4: bipush 2
      // da5: idiv
      // da6: iadd
      // da7: bipush 2
      // da8: iadd
      // da9: i2f
      // daa: fload 24
      // dac: fconst_2
      // dad: fadd
      // dae: ldc -12417291
      // db0: nop
      // db1: invokestatic vg2.df9 (FFFFI)V
      // db4: return
   }

   public void kji(int param1, int param2, float param3, hv2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: fconst_1
      // 001: fconst_1
      // 002: fconst_1
      // 003: fconst_1
      // 004: invokestatic hzu.wn0 (FFFF)V
      // 007: aload 0
      // 008: getfield vg2.cs3 Lc05;
      // 00b: invokevirtual Minecraft.l22 ()Llc5;
      // 00e: getstatic vg2.rt2 Lgdz;
      // 011: invokevirtual lc5.anl (Lgdz;)V
      // 014: invokestatic OpaquePredicate.c ()I
      // 017: bipush 0
      // 018: istore 6
      // 01a: bipush 0
      // 01b: istore 7
      // 01d: istore 5
      // 01f: aload 4
      // 021: invokevirtual hv2.n6d ()I
      // 024: iload 5
      // 026: ifne 047
      // 029: ifge 03b
      // 02c: goto 033
      // 02f: invokestatic vg2.a (Loov;)Loov;
      // 032: athrow
      // 033: bipush 5
      // 034: istore 7
      // 036: iload 5
      // 038: ifeq 0dd
      // 03b: aload 4
      // 03d: invokevirtual hv2.n6d ()I
      // 040: goto 047
      // 043: invokestatic vg2.a (Loov;)Loov;
      // 046: athrow
      // 047: sipush 150
      // 04a: iload 5
      // 04c: ifne 070
      // 04f: if_icmpge 061
      // 052: goto 059
      // 055: invokestatic vg2.a (Loov;)Loov;
      // 058: athrow
      // 059: bipush 0
      // 05a: istore 7
      // 05c: iload 5
      // 05e: ifeq 0dd
      // 061: aload 4
      // 063: invokevirtual hv2.n6d ()I
      // 066: sipush 300
      // 069: goto 070
      // 06c: invokestatic vg2.a (Loov;)Loov;
      // 06f: athrow
      // 070: iload 5
      // 072: ifne 096
      // 075: if_icmpge 087
      // 078: goto 07f
      // 07b: invokestatic vg2.a (Loov;)Loov;
      // 07e: athrow
      // 07f: bipush 1
      // 080: istore 7
      // 082: iload 5
      // 084: ifeq 0dd
      // 087: aload 4
      // 089: invokevirtual hv2.n6d ()I
      // 08c: sipush 600
      // 08f: goto 096
      // 092: invokestatic vg2.a (Loov;)Loov;
      // 095: athrow
      // 096: iload 5
      // 098: ifne 0c8
      // 09b: if_icmpge 0ad
      // 09e: goto 0a5
      // 0a1: invokestatic vg2.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: bipush 2
      // 0a6: istore 7
      // 0a8: iload 5
      // 0aa: ifeq 0dd
      // 0ad: aload 4
      // 0af: invokevirtual hv2.n6d ()I
      // 0b2: iload 5
      // 0b4: ifne 0db
      // 0b7: goto 0be
      // 0ba: invokestatic vg2.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: sipush 1000
      // 0c1: goto 0c8
      // 0c4: invokestatic vg2.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: if_icmpge 0d3
      // 0cb: bipush 3
      // 0cc: istore 7
      // 0ce: iload 5
      // 0d0: ifeq 0dd
      // 0d3: bipush 4
      // 0d4: goto 0db
      // 0d7: invokestatic vg2.a (Loov;)Loov;
      // 0da: athrow
      // 0db: istore 7
      // 0dd: aload 0
      // 0de: dup
      // 0df: getfield vg2.o3s F
      // 0e2: ldc 100.0
      // 0e4: nop
      // 0e5: fadd
      // 0e6: putfield vg2.o3s F
      // 0e9: aload 0
      // 0ea: iload 2
      // 0eb: iload 1
      // 0ec: iadd
      // 0ed: bipush 11
      // 0ef: isub
      // 0f0: i2f
      // 0f1: fload 3
      // 0f2: bipush 0
      // 0f3: iload 6
      // 0f5: bipush 10
      // 0f7: imul
      // 0f8: iadd
      // 0f9: sipush 176
      // 0fc: iload 7
      // 0fe: bipush 8
      // 100: imul
      // 101: iadd
      // 102: bipush 10
      // 104: bipush 8
      // 106: invokevirtual vg2.j7o (FFIIII)V
      // 109: aload 0
      // 10a: dup
      // 10b: getfield vg2.o3s F
      // 10e: ldc 100.0
      // 110: nop
      // 111: fsub
      // 112: putfield vg2.o3s F
      // 115: return
   }

   public static void pmr(float var0, float var1, float var2, float var3, int var4, int var5) {
      float var6 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var7 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(var4 & 0xFF) / 255.0F;
      float var10 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var11 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var12 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var13 = (float)(var5 & 0xFF) / 255.0F;
      hzu.m_1();
      hzu.spd();
      hzu.vtj();
      hzu.u39(770, 771, 1, 0);
      hzu.nn9(7425);
      q3g var14 = jom.yut().zuq();
      var14.ezr(7, gnl.gec);
      var14.g5o((double)var2, (double)var1, 0.0).gs4(var11, var12, var13, var10).pzw();
      var14.g5o((double)var0, (double)var1, 0.0).gs4(var7, var8, var9, var6).pzw();
      var14.g5o((double)var0, (double)var3, 0.0).gs4(var7, var8, var9, var6).pzw();
      var14.g5o((double)var2, (double)var3, 0.0).gs4(var11, var12, var13, var10).pzw();
      jom.yut().q7g();
      hzu.nn9(7424);
      hzu.ux6();
      hzu.if9();
      hzu.rqj();
   }

   private void er9(sa6 param1, float param2, String param3, int param4, int param5, hv2 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic vg2.a J
      // 003: ldc2_w 46412016023790
      // 006: lxor
      // 007: lstore 7
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 9
      // 00e: aload 1
      // 00f: invokevirtual sa6.doy ()Luci;
      // 012: aload 3
      // 013: aload 1
      // 014: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 017: invokevirtual r11.fge ()I
      // 01a: istore 10
      // 01c: iload 9
      // 01e: ifeq 046
      // 021: aload 1
      // 022: invokevirtual sa6.sns ()Lz0w$enz;
      // 025: getstatic z0w$enz.kr2 Lz0w$enz;
      // 028: if_acmpne 48d
      // 02b: goto 032
      // 02e: invokestatic vg2.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: getfield vg2.cs3 Lc05;
      // 036: invokevirtual Minecraft.l22 ()Llc5;
      // 039: getstatic vg2.rt2 Lgdz;
      // 03c: invokevirtual lc5.anl (Lgdz;)V
      // 03f: goto 046
      // 042: invokestatic vg2.a (Loov;)Loov;
      // 045: athrow
      // 046: aload 0
      // 047: getfield vg2.eyd J
      // 04a: aload 6
      // 04c: invokevirtual hv2.ukp ()J
      // 04f: lcmp
      // 050: iload 9
      // 052: ifeq 0e9
      // 055: ifne 0dc
      // 058: goto 05f
      // 05b: invokestatic vg2.a (Loov;)Loov;
      // 05e: athrow
      // 05f: iload 10
      // 061: aload 6
      // 063: invokevirtual hv2.pju ()I
      // 066: iload 9
      // 068: ifeq 0ba
      // 06b: goto 072
      // 06e: invokestatic vg2.a (Loov;)Loov;
      // 071: athrow
      // 072: if_icmpge 0a0
      // 075: goto 07c
      // 078: invokestatic vg2.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 6
      // 07e: invokestatic Minecraft.qgs ()J
      // 081: invokevirtual hv2.j8d (J)V
      // 084: aload 6
      // 086: aload 0
      // 087: getfield vg2.a7b Ld1f;
      // 08a: invokevirtual d1f._ti ()I
      // 08d: bipush 20
      // 08f: iadd
      // 090: i2l
      // 091: invokevirtual hv2.tpv (J)V
      // 094: iload 9
      // 096: ifne 0dc
      // 099: goto 0a0
      // 09c: invokestatic vg2.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: iload 10
      // 0a2: iload 9
      // 0a4: ifeq 0e9
      // 0a7: goto 0ae
      // 0aa: invokestatic vg2.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 6
      // 0b0: invokevirtual hv2.pju ()I
      // 0b3: goto 0ba
      // 0b6: invokestatic vg2.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: if_icmple 0dc
      // 0bd: aload 6
      // 0bf: invokestatic Minecraft.qgs ()J
      // 0c2: invokevirtual hv2.j8d (J)V
      // 0c5: aload 6
      // 0c7: aload 0
      // 0c8: getfield vg2.a7b Ld1f;
      // 0cb: invokevirtual d1f._ti ()I
      // 0ce: bipush 10
      // 0d0: iadd
      // 0d1: i2l
      // 0d2: invokevirtual hv2.tpv (J)V
      // 0d5: goto 0dc
      // 0d8: invokestatic vg2.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: invokestatic Minecraft.qgs ()J
      // 0df: aload 6
      // 0e1: invokevirtual hv2.b4s ()J
      // 0e4: lsub
      // 0e5: ldc2_w 1000
      // 0e8: lcmp
      // 0e9: iload 9
      // 0eb: ifeq 109
      // 0ee: ifgt 118
      // 0f1: goto 0f8
      // 0f4: invokestatic vg2.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: getfield vg2.eyd J
      // 0fc: aload 6
      // 0fe: invokevirtual hv2.ukp ()J
      // 101: lcmp
      // 102: goto 109
      // 105: invokestatic vg2.a (Loov;)Loov;
      // 108: athrow
      // 109: iload 9
      // 10b: ifeq 155
      // 10e: ifeq 135
      // 111: goto 118
      // 114: invokestatic vg2.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 6
      // 11a: iload 10
      // 11c: invokevirtual hv2.hpr (I)V
      // 11f: aload 6
      // 121: iload 10
      // 123: invokevirtual hv2.h6e (I)V
      // 126: aload 6
      // 128: invokestatic Minecraft.qgs ()J
      // 12b: invokevirtual hv2.j8d (J)V
      // 12e: goto 135
      // 131: invokestatic vg2.a (Loov;)Loov;
      // 134: athrow
      // 135: aload 6
      // 137: aload 0
      // 138: getfield vg2.eyd J
      // 13b: invokevirtual hv2.f9w (J)V
      // 13e: aload 6
      // 140: iload 10
      // 142: invokevirtual hv2.hpr (I)V
      // 145: iload 10
      // 147: aload 6
      // 149: invokevirtual hv2.u5n ()I
      // 14c: invokestatic java/lang/Math.max (II)I
      // 14f: i2f
      // 150: fconst_2
      // 151: fdiv
      // 152: invokestatic fe6.v1i (F)I
      // 155: istore 11
      // 157: iload 10
      // 159: bipush 2
      // 15a: idiv
      // 15b: i2f
      // 15c: invokestatic fe6.v1i (F)I
      // 15f: aload 6
      // 161: invokevirtual hv2.u5n ()I
      // 164: bipush 2
      // 165: idiv
      // 166: i2f
      // 167: invokestatic fe6.v1i (F)I
      // 16a: bipush 10
      // 16c: invokestatic java/lang/Math.max (II)I
      // 16f: invokestatic java/lang/Math.max (II)I
      // 172: istore 12
      // 174: aload 6
      // 176: invokevirtual hv2.k1_ ()J
      // 179: aload 0
      // 17a: getfield vg2.a7b Ld1f;
      // 17d: invokevirtual d1f._ti ()I
      // 180: i2l
      // 181: lcmp
      // 182: iload 9
      // 184: ifeq 1b0
      // 187: ifle 1c3
      // 18a: goto 191
      // 18d: invokestatic vg2.a (Loov;)Loov;
      // 190: athrow
      // 191: aload 6
      // 193: invokevirtual hv2.k1_ ()J
      // 196: aload 0
      // 197: getfield vg2.a7b Ld1f;
      // 19a: invokevirtual d1f._ti ()I
      // 19d: i2l
      // 19e: lsub
      // 19f: ldc2_w 3
      // 1a2: ldiv
      // 1a3: ldc2_w 2
      // 1a6: lrem
      // 1a7: lconst_1
      // 1a8: lcmp
      // 1a9: goto 1b0
      // 1ac: invokestatic vg2.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: iload 9
      // 1b2: ifeq 1c0
      // 1b5: ifne 1c3
      // 1b8: goto 1bf
      // 1bb: invokestatic vg2.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: bipush 1
      // 1c0: goto 1c4
      // 1c3: bipush 0
      // 1c4: istore 13
      // 1c6: iload 11
      // 1c8: iload 9
      // 1ca: ifeq 1e5
      // 1cd: ifle 488
      // 1d0: goto 1d7
      // 1d3: invokestatic vg2.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: iload 5
      // 1d9: iload 4
      // 1db: isub
      // 1dc: bipush 4
      // 1dd: isub
      // 1de: goto 1e5
      // 1e1: invokestatic vg2.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: i2f
      // 1e6: iload 12
      // 1e8: i2f
      // 1e9: fdiv
      // 1ea: ldc 9.0
      // 1ec: nop
      // 1ed: invokestatic java/lang/Math.min (FF)F
      // 1f0: fstore 14
      // 1f2: fload 14
      // 1f4: ldc 3.0
      // 1f6: nop
      // 1f7: fcmpl
      // 1f8: iload 9
      // 1fa: ifeq 3c0
      // 1fd: ifle 3b7
      // 200: goto 207
      // 203: invokestatic vg2.a (Loov;)Loov;
      // 206: athrow
      // 207: iload 11
      // 209: istore 15
      // 20b: iload 15
      // 20d: iload 12
      // 20f: if_icmpge 252
      // 212: aload 0
      // 213: iload 4
      // 215: i2f
      // 216: iload 15
      // 218: i2f
      // 219: fload 14
      // 21b: fmul
      // 21c: fadd
      // 21d: fload 2
      // 21e: iload 13
      // 220: iload 9
      // 222: ifeq 26a
      // 225: iload 9
      // 227: ifeq 23d
      // 22a: goto 231
      // 22d: invokestatic vg2.a (Loov;)Loov;
      // 230: athrow
      // 231: ifeq 240
      // 234: goto 23b
      // 237: invokestatic vg2.a (Loov;)Loov;
      // 23a: athrow
      // 23b: bipush 25
      // 23d: goto 242
      // 240: bipush 16
      // 242: bipush 0
      // 243: bipush 9
      // 245: bipush 9
      // 247: invokevirtual vg2.j7o (FFIIII)V
      // 24a: iinc 15 1
      // 24d: iload 9
      // 24f: ifne 20b
      // 252: bipush 0
      // 253: istore 15
      // 255: iload 15
      // 257: iload 11
      // 259: if_icmpge 3b2
      // 25c: aload 0
      // 25d: iload 4
      // 25f: i2f
      // 260: iload 15
      // 262: i2f
      // 263: fload 14
      // 265: fmul
      // 266: fadd
      // 267: fload 2
      // 268: iload 13
      // 26a: iload 9
      // 26c: ifeq 27b
      // 26f: ifeq 27e
      // 272: goto 279
      // 275: invokestatic vg2.a (Loov;)Loov;
      // 278: athrow
      // 279: bipush 25
      // 27b: goto 280
      // 27e: bipush 16
      // 280: bipush 0
      // 281: bipush 9
      // 283: bipush 9
      // 285: invokevirtual vg2.j7o (FFIIII)V
      // 288: iload 13
      // 28a: iload 9
      // 28c: ifeq 314
      // 28f: ifeq 30e
      // 292: goto 299
      // 295: invokestatic vg2.a (Loov;)Loov;
      // 298: athrow
      // 299: iload 15
      // 29b: bipush 2
      // 29c: imul
      // 29d: bipush 1
      // 29e: iadd
      // 29f: aload 6
      // 2a1: invokevirtual hv2.u5n ()I
      // 2a4: iload 9
      // 2a6: ifeq 2e2
      // 2a9: goto 2b0
      // 2ac: invokestatic vg2.a (Loov;)Loov;
      // 2af: athrow
      // 2b0: if_icmpge 2d7
      // 2b3: goto 2ba
      // 2b6: invokestatic vg2.a (Loov;)Loov;
      // 2b9: athrow
      // 2ba: aload 0
      // 2bb: iload 4
      // 2bd: i2f
      // 2be: iload 15
      // 2c0: i2f
      // 2c1: fload 14
      // 2c3: fmul
      // 2c4: fadd
      // 2c5: fload 2
      // 2c6: bipush 70
      // 2c8: bipush 0
      // 2c9: bipush 9
      // 2cb: bipush 9
      // 2cd: invokevirtual vg2.j7o (FFIIII)V
      // 2d0: goto 2d7
      // 2d3: invokestatic vg2.a (Loov;)Loov;
      // 2d6: athrow
      // 2d7: iload 15
      // 2d9: bipush 2
      // 2da: imul
      // 2db: bipush 1
      // 2dc: iadd
      // 2dd: aload 6
      // 2df: invokevirtual hv2.u5n ()I
      // 2e2: iload 9
      // 2e4: ifeq 316
      // 2e7: if_icmpne 30e
      // 2ea: goto 2f1
      // 2ed: invokestatic vg2.a (Loov;)Loov;
      // 2f0: athrow
      // 2f1: aload 0
      // 2f2: iload 4
      // 2f4: i2f
      // 2f5: iload 15
      // 2f7: i2f
      // 2f8: fload 14
      // 2fa: fmul
      // 2fb: fadd
      // 2fc: fload 2
      // 2fd: bipush 79
      // 2ff: bipush 0
      // 300: bipush 9
      // 302: bipush 9
      // 304: invokevirtual vg2.j7o (FFIIII)V
      // 307: goto 30e
      // 30a: invokestatic vg2.a (Loov;)Loov;
      // 30d: athrow
      // 30e: iload 15
      // 310: bipush 2
      // 311: imul
      // 312: bipush 1
      // 313: iadd
      // 314: iload 10
      // 316: iload 9
      // 318: ifeq 36a
      // 31b: if_icmpge 362
      // 31e: goto 325
      // 321: invokestatic vg2.a (Loov;)Loov;
      // 324: athrow
      // 325: aload 0
      // 326: iload 4
      // 328: i2f
      // 329: iload 15
      // 32b: i2f
      // 32c: fload 14
      // 32e: fmul
      // 32f: fadd
      // 330: fload 2
      // 331: iload 15
      // 333: iload 9
      // 335: ifeq 355
      // 338: goto 33f
      // 33b: invokestatic vg2.a (Loov;)Loov;
      // 33e: athrow
      // 33f: bipush 10
      // 341: if_icmplt 358
      // 344: goto 34b
      // 347: invokestatic vg2.a (Loov;)Loov;
      // 34a: athrow
      // 34b: sipush 160
      // 34e: goto 355
      // 351: invokestatic vg2.a (Loov;)Loov;
      // 354: athrow
      // 355: goto 35a
      // 358: bipush 52
      // 35a: bipush 0
      // 35b: bipush 9
      // 35d: bipush 9
      // 35f: invokevirtual vg2.j7o (FFIIII)V
      // 362: iload 15
      // 364: bipush 2
      // 365: imul
      // 366: bipush 1
      // 367: iadd
      // 368: iload 10
      // 36a: if_icmpne 3aa
      // 36d: aload 0
      // 36e: iload 4
      // 370: i2f
      // 371: iload 15
      // 373: i2f
      // 374: fload 14
      // 376: fmul
      // 377: fadd
      // 378: fload 2
      // 379: iload 15
      // 37b: iload 9
      // 37d: ifeq 39d
      // 380: goto 387
      // 383: invokestatic vg2.a (Loov;)Loov;
      // 386: athrow
      // 387: bipush 10
      // 389: if_icmplt 3a0
      // 38c: goto 393
      // 38f: invokestatic vg2.a (Loov;)Loov;
      // 392: athrow
      // 393: sipush 169
      // 396: goto 39d
      // 399: invokestatic vg2.a (Loov;)Loov;
      // 39c: athrow
      // 39d: goto 3a2
      // 3a0: bipush 61
      // 3a2: bipush 0
      // 3a3: bipush 9
      // 3a5: bipush 9
      // 3a7: invokevirtual vg2.j7o (FFIIII)V
      // 3aa: iinc 15 1
      // 3ad: iload 9
      // 3af: ifne 255
      // 3b2: iload 9
      // 3b4: ifne 488
      // 3b7: iload 10
      // 3b9: goto 3c0
      // 3bc: invokestatic vg2.a (Loov;)Loov;
      // 3bf: athrow
      // 3c0: i2f
      // 3c1: ldc 20.0
      // 3c3: nop
      // 3c4: fdiv
      // 3c5: fconst_0
      // 3c6: fconst_1
      // 3c7: invokestatic fe6._f3 (FFF)F
      // 3ca: fstore 15
      // 3cc: fconst_1
      // 3cd: fload 15
      // 3cf: fsub
      // 3d0: ldc 255.0
      // 3d2: nop
      // 3d3: fmul
      // 3d4: f2i
      // 3d5: bipush 16
      // 3d7: ishl
      // 3d8: fload 15
      // 3da: ldc 255.0
      // 3dc: nop
      // 3dd: fmul
      // 3de: f2i
      // 3df: bipush 8
      // 3e1: ishl
      // 3e2: ior
      // 3e3: istore 16
      // 3e5: new java/lang/StringBuilder
      // 3e8: dup
      // 3e9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ec: ldc ""
      // 3ee: nop
      // 3ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f2: iload 10
      // 3f4: i2f
      // 3f5: fconst_2
      // 3f6: fdiv
      // 3f7: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 3fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3fd: astore 17
      // 3ff: iload 5
      // 401: aload 0
      // 402: getfield vg2.cs3 Lc05;
      // 405: getfield Minecraft.tx1 Lowt;
      // 408: new java/lang/StringBuilder
      // 40b: dup
      // 40c: invokespecial java/lang/StringBuilder.<init> ()V
      // 40f: aload 17
      // 411: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 414: sipush 7904
      // 417: ldc2_w 8380136000974578119
      // 41a: lload 7
      // 41c: lxor
      // 41d: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 422: nop
      // 423: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 426: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 429: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 42c: isub
      // 42d: iload 9
      // 42f: ifeq 487
      // 432: iload 4
      // 434: if_icmplt 461
      // 437: goto 43e
      // 43a: invokestatic vg2.a (Loov;)Loov;
      // 43d: athrow
      // 43e: new java/lang/StringBuilder
      // 441: dup
      // 442: invokespecial java/lang/StringBuilder.<init> ()V
      // 445: aload 17
      // 447: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 44a: sipush 16933
      // 44d: ldc2_w 6523904080984653057
      // 450: lload 7
      // 452: lxor
      // 453: invokedynamic v (IJ)Ljava/lang/String; bsm=vg2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 458: nop
      // 459: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 45c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 45f: astore 17
      // 461: aload 0
      // 462: getfield vg2.cs3 Lc05;
      // 465: getfield Minecraft.tx1 Lowt;
      // 468: aload 17
      // 46a: iload 5
      // 46c: iload 4
      // 46e: iadd
      // 46f: bipush 2
      // 470: idiv
      // 471: aload 0
      // 472: getfield vg2.cs3 Lc05;
      // 475: getfield Minecraft.tx1 Lowt;
      // 478: aload 17
      // 47a: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 47d: bipush 2
      // 47e: idiv
      // 47f: isub
      // 480: i2f
      // 481: fload 2
      // 482: iload 16
      // 484: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 487: pop
      // 488: iload 9
      // 48a: ifne 4cf
      // 48d: new java/lang/StringBuilder
      // 490: dup
      // 491: invokespecial java/lang/StringBuilder.<init> ()V
      // 494: getstatic syo.iyk Lsyo;
      // 497: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 49a: ldc ""
      // 49c: nop
      // 49d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a0: iload 10
      // 4a2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4a8: astore 11
      // 4aa: aload 0
      // 4ab: getfield vg2.cs3 Lc05;
      // 4ae: getfield Minecraft.tx1 Lowt;
      // 4b1: aload 11
      // 4b3: iload 5
      // 4b5: aload 0
      // 4b6: getfield vg2.cs3 Lc05;
      // 4b9: getfield Minecraft.tx1 Lowt;
      // 4bc: aload 11
      // 4be: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 4c1: isub
      // 4c2: i2f
      // 4c3: fload 2
      // 4c4: ldc 0.5
      // 4c6: nop
      // 4c7: fadd
      // 4c8: ldc 16777215
      // 4ca: nop
      // 4cb: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 4ce: pop
      // 4cf: return
   }

   public void sid(ekw var1) {
      this.e52 = var1;
   }

   public void b8o(ekw var1) {
      this.qhd = var1;
   }

   public void x6h() {
      this.qhd = null;
      this.e52 = null;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2808500251755226831L, 8912638237663412312L, MethodHandles.lookup().lookupClass()).a(89244948288775L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 27346561212869L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u009a\u0084c\u0093á&¯ì\u009bäR¾\u000bË'd\u0010\u000b\u0001Rð\fUã.!DýããIó\u0083\u0018ô<(\b®k\u0082Ý2¼Ü\u0091æ¦Ã\u001e\u001e\u0010ñfc{D^\u0010\u0012\u009aî\u0083\u000e\u0096Â~\\\n \u0012nÅ\u0014¢ ø¶\u0007*Q\u0093ôA\u0083\"7~AcÙNæé¥}î÷\u0017\fñ^Æ,ùï\t\u0004\u0010\u009e++r¿ï«Itc/ëoYgÊ";
      int var8 = "\u009a\u0084c\u0093á&¯ì\u009bäR¾\u000bË'd\u0010\u000b\u0001Rð\fUã.!DýããIó\u0083\u0018ô<(\b®k\u0082Ý2¼Ü\u0091æ¦Ã\u001e\u001e\u0010ñfc{D^\u0010\u0012\u009aî\u0083\u000e\u0096Â~\\\n \u0012nÅ\u0014¢ ø¶\u0007*Q\u0093ôA\u0083\"7~AcÙNæé¥}î÷\u0017\fñ^Æ,ùï\t\u0004\u0010\u009e++r¿ï«Itc/ëoYgÊ"
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
                     c = new String[8];
                     kq6 = Ordering.from(new vg2$m1e(null));
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

                  var6 = ".`ºþüÀ\u0081V§¨\u0004\u0090\u001bI\u0099\u0083 0&^¤È>M#\u008f|Ä\u0004sïg\u0089º\u0003\u009dqÏæ\u008aS\u000fF\u0084ê\u0092_~Þ";
                  var8 = ".`ºþüÀ\u0081V§¨\u0004\u0090\u001bI\u0099\u0083 0&^¤È>M#\u008f|Ä\u0004sïg\u0089º\u0003\u009dqÏæ\u008aS\u000fF\u0084ê\u0092_~Þ"
                     .length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31162;
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
            throw new RuntimeException("vg2", var10);
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
         throw new RuntimeException("vg2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
