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

@dr9$x0j(
   t2u = "tp",
   io4 = {"<Pos>"},
   hjc = "Teleport."
)
public class a6k extends HwidProvider {
   private ArrayList sli = new ArrayList();
   public boolean tyb;
   public mew ous;
   public EntityLivingBase khn;
   public q6h kmy = new q6h();
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @Override
   public void xjl(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a6k.a J
      // 003: ldc2_w 128320292218945
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: new q6h
      // 011: dup
      // 012: invokespecial q6h.<init> ()V
      // 015: putfield a6k.kmy Lq6h;
      // 018: aload 1
      // 019: arraylength
      // 01a: iload 4
      // 01c: ifne 060
      // 01f: bipush 3
      // 020: if_icmpeq 053
      // 023: goto 02a
      // 026: invokestatic a6k.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 1
      // 02b: arraylength
      // 02c: iload 4
      // 02e: ifne 060
      // 031: goto 038
      // 034: invokestatic a6k.a (Loov;)Loov;
      // 037: athrow
      // 038: bipush 1
      // 039: if_icmpeq 053
      // 03c: goto 043
      // 03f: invokestatic a6k.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 0
      // 044: invokevirtual a6k.dhs ()V
      // 047: iload 4
      // 049: ifeq 3ef
      // 04c: goto 053
      // 04f: invokestatic a6k.a (Loov;)Loov;
      // 052: athrow
      // 053: getstatic j83.ef8 Lj83;
      // 056: invokevirtual j83.gln ()Z
      // 059: goto 060
      // 05c: invokestatic a6k.a (Loov;)Loov;
      // 05f: athrow
      // 060: iload 4
      // 062: ifne 0ba
      // 065: ifne 085
      // 068: goto 06f
      // 06b: invokestatic a6k.a (Loov;)Loov;
      // 06e: athrow
      // 06f: sipush 3311
      // 072: ldc2_w 5810130250022229504
      // 075: lload 2
      // 076: lxor
      // 077: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: nop
      // 07d: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 080: return
      // 081: invokestatic a6k.a (Loov;)Loov;
      // 084: athrow
      // 085: sipush 21906
      // 088: ldc2_w 599035834952241014
      // 08b: lload 2
      // 08c: lxor
      // 08d: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: nop
      // 093: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 096: aload 0
      // 097: getfield a6k.kmy Lq6h;
      // 09a: invokevirtual q6h.u1k ()V
      // 09d: aload 0
      // 09e: bipush 0
      // 09f: putfield a6k.tyb Z
      // 0a2: aload 0
      // 0a3: aconst_null
      // 0a4: putfield a6k.khn Li2h;
      // 0a7: aload 0
      // 0a8: iload 4
      // 0aa: ifne 246
      // 0ad: aconst_null
      // 0ae: putfield a6k.ous Lmew;
      // 0b1: aload 1
      // 0b2: arraylength
      // 0b3: goto 0ba
      // 0b6: invokestatic a6k.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: bipush 3
      // 0bb: if_icmpne 23e
      // 0be: aload 0
      // 0bf: new mew
      // 0c2: dup
      // 0c3: aload 1
      // 0c4: bipush 0
      // 0c5: aaload
      // 0c6: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0c9: aload 1
      // 0ca: bipush 1
      // 0cb: aaload
      // 0cc: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0cf: aload 1
      // 0d0: bipush 2
      // 0d1: aaload
      // 0d2: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0d5: invokespecial mew.<init> (III)V
      // 0d8: putfield a6k.ous Lmew;
      // 0db: iload 4
      // 0dd: ifne 154
      // 0e0: goto 0e7
      // 0e3: invokestatic a6k.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield a6k.rpq Lc05;
      // 0eb: getfield Minecraft.tij Lkh3;
      // 0ee: aload 0
      // 0ef: getfield a6k.ous Lmew;
      // 0f2: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0f5: invokeinterface zfz.r_y ()Le0x; 1
      // 0fa: invokevirtual e0x.p1r ()Lp3y;
      // 0fd: getstatic p3y.cei Lp3y;
      // 100: if_acmpne 13c
      // 103: goto 10a
      // 106: invokestatic a6k.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: iload 4
      // 10d: ifne 156
      // 110: goto 117
      // 113: invokestatic a6k.a (Loov;)Loov;
      // 116: athrow
      // 117: getfield a6k.rpq Lc05;
      // 11a: getfield Minecraft.tij Lkh3;
      // 11d: aload 0
      // 11e: getfield a6k.ous Lmew;
      // 121: invokevirtual mew.nuv ()Lmew;
      // 124: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 127: invokeinterface zfz.r_y ()Le0x; 1
      // 12c: invokevirtual e0x.p1r ()Lp3y;
      // 12f: getstatic p3y.cei Lp3y;
      // 132: if_acmpeq 155
      // 135: goto 13c
      // 138: invokestatic a6k.a (Loov;)Loov;
      // 13b: athrow
      // 13c: sipush 30777
      // 13f: ldc2_w 2259268487406281438
      // 142: lload 2
      // 143: lxor
      // 144: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: nop
      // 14a: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 14d: goto 154
      // 150: invokestatic a6k.a (Loov;)Loov;
      // 153: athrow
      // 154: return
      // 155: aload 0
      // 156: iload 4
      // 158: ifne 184
      // 15b: getfield a6k.ous Lmew;
      // 15e: invokevirtual mew.getY ()I
      // 161: bipush 20
      // 163: if_icmpge 183
      // 166: goto 16d
      // 169: invokestatic a6k.a (Loov;)Loov;
      // 16c: athrow
      // 16d: sipush 4409
      // 170: ldc2_w 8917280049868475345
      // 173: lload 2
      // 174: lxor
      // 175: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: nop
      // 17b: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 17e: return
      // 17f: invokestatic a6k.a (Loov;)Loov;
      // 182: athrow
      // 183: aload 0
      // 184: getfield a6k.rpq Lc05;
      // 187: getfield Minecraft.tij Lkh3;
      // 18a: aload 0
      // 18b: getfield a6k.ous Lmew;
      // 18e: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 191: invokeinterface zfz.r_y ()Le0x; 1
      // 196: invokevirtual e0x.p1r ()Lp3y;
      // 199: getstatic p3y.cei Lp3y;
      // 19c: if_acmpne 1e1
      // 19f: aload 0
      // 1a0: iload 4
      // 1a2: ifne 1fa
      // 1a5: goto 1ac
      // 1a8: invokestatic a6k.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: iload 4
      // 1ae: ifne 1fa
      // 1b1: goto 1b8
      // 1b4: invokestatic a6k.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: getfield a6k.ous Lmew;
      // 1bb: invokevirtual mew.getY ()I
      // 1be: bipush -20
      // 1c0: if_icmple 1e1
      // 1c3: goto 1ca
      // 1c6: invokestatic a6k.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: aload 0
      // 1cc: getfield a6k.ous Lmew;
      // 1cf: invokevirtual mew.eve ()Lmew;
      // 1d2: putfield a6k.ous Lmew;
      // 1d5: iload 4
      // 1d7: ifeq 183
      // 1da: goto 1e1
      // 1dd: invokestatic a6k.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: aload 0
      // 1e3: getfield a6k.ous Lmew;
      // 1e6: bipush 2
      // 1e7: invokevirtual mew.z89 (I)Lmew;
      // 1ea: putfield a6k.ous Lmew;
      // 1ed: iload 4
      // 1ef: ifne 341
      // 1f2: aload 0
      // 1f3: goto 1fa
      // 1f6: invokestatic a6k.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: getfield a6k.rpq Lc05;
      // 1fd: getfield Minecraft.tij Lkh3;
      // 200: aload 0
      // 201: getfield a6k.ous Lmew;
      // 204: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 207: invokeinterface zfz.r_y ()Le0x; 1
      // 20c: invokevirtual e0x.p1r ()Lp3y;
      // 20f: getstatic p3y.cei Lp3y;
      // 212: if_acmpne 330
      // 215: aload 0
      // 216: new mew
      // 219: dup
      // 21a: aload 1
      // 21b: bipush 0
      // 21c: aaload
      // 21d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 220: aload 1
      // 221: bipush 1
      // 222: aaload
      // 223: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 226: aload 1
      // 227: bipush 2
      // 228: aaload
      // 229: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 22c: invokespecial mew.<init> (III)V
      // 22f: putfield a6k.ous Lmew;
      // 232: iload 4
      // 234: ifeq 330
      // 237: goto 23e
      // 23a: invokestatic a6k.a (Loov;)Loov;
      // 23d: athrow
      // 23e: aload 0
      // 23f: goto 246
      // 242: invokestatic a6k.a (Loov;)Loov;
      // 245: athrow
      // 246: getfield a6k.rpq Lc05;
      // 249: getfield Minecraft.tij Lkh3;
      // 24c: getfield WorldClient.guf Ljava/util/List;
      // 24f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 254: astore 5
      // 256: aload 5
      // 258: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25d: ifeq 2d2
      // 260: aload 5
      // 262: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 267: checkcast EntityLivingBase
      // 26a: astore 6
      // 26c: aload 6
      // 26e: iload 4
      // 270: ifne 2d6
      // 273: instanceof ha9
      // 276: ifeq 2c6
      // 279: goto 280
      // 27c: invokestatic a6k.a (Loov;)Loov;
      // 27f: athrow
      // 280: aload 0
      // 281: getfield a6k.rpq Lc05;
      // 284: getfield Minecraft.vg8 Ll86;
      // 287: iload 4
      // 289: ifne 2a8
      // 28c: goto 293
      // 28f: invokestatic a6k.a (Loov;)Loov;
      // 292: athrow
      // 293: aload 6
      // 295: if_acmpeq 2c6
      // 298: goto 29f
      // 29b: invokestatic a6k.a (Loov;)Loov;
      // 29e: athrow
      // 29f: aload 6
      // 2a1: goto 2a8
      // 2a4: invokestatic a6k.a (Loov;)Loov;
      // 2a7: athrow
      // 2a8: invokevirtual EntityLivingBase.noc ()Ljava/lang/String;
      // 2ab: aload 1
      // 2ac: bipush 0
      // 2ad: aaload
      // 2ae: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 2b1: ifeq 2c6
      // 2b4: aload 0
      // 2b5: aload 6
      // 2b7: putfield a6k.khn Li2h;
      // 2ba: iload 4
      // 2bc: ifeq 2d2
      // 2bf: goto 2c6
      // 2c2: invokestatic a6k.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: iload 4
      // 2c8: ifeq 256
      // 2cb: goto 2d2
      // 2ce: invokestatic a6k.a (Loov;)Loov;
      // 2d1: athrow
      // 2d2: aload 0
      // 2d3: getfield a6k.khn Li2h;
      // 2d6: ifnonnull 302
      // 2d9: new java/lang/StringBuilder
      // 2dc: dup
      // 2dd: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e0: sipush 27024
      // 2e3: ldc2_w 8339860446550684542
      // 2e6: lload 2
      // 2e7: lxor
      // 2e8: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: nop
      // 2ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f1: aload 1
      // 2f2: bipush 0
      // 2f3: aaload
      // 2f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2fa: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 2fd: return
      // 2fe: invokestatic a6k.a (Loov;)Loov;
      // 301: athrow
      // 302: new java/lang/StringBuilder
      // 305: dup
      // 306: invokespecial java/lang/StringBuilder.<init> ()V
      // 309: sipush 8477
      // 30c: ldc2_w 260699824760470520
      // 30f: lload 2
      // 310: lxor
      // 311: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: nop
      // 317: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31a: aload 0
      // 31b: getfield a6k.khn Li2h;
      // 31e: invokevirtual EntityLivingBase.noc ()Ljava/lang/String;
      // 321: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 324: ldc "!"
      // 326: nop
      // 327: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 32d: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 330: sipush 27904
      // 333: ldc2_w 1871101442168616940
      // 336: lload 2
      // 337: lxor
      // 338: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: nop
      // 33e: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 341: new pj2
      // 344: dup
      // 345: invokespecial pj2.<init> ()V
      // 348: astore 5
      // 34a: aload 5
      // 34c: bipush 1
      // 34d: putfield pj2.wzx Z
      // 350: aload 0
      // 351: getfield a6k.rpq Lc05;
      // 354: invokevirtual Minecraft.c02 ()Lp_k;
      // 357: invokevirtual p_k._m3 ()Lhv0;
      // 35a: new net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 35d: dup
      // 35e: bipush 0
      // 35f: bipush -1
      // 360: bipush 0
      // 361: invokespecial net/minecraft/network/play/client/C0FPacketConfirmTransaction.<init> (ISZ)V
      // 364: invokevirtual hv0.r92 (Lmz2;)V
      // 367: aload 0
      // 368: getfield a6k.rpq Lc05;
      // 36b: invokevirtual Minecraft.c02 ()Lp_k;
      // 36e: invokevirtual p_k._m3 ()Lhv0;
      // 371: new net/minecraft/network/play/client/C13PacketPlayerAbilities
      // 374: dup
      // 375: aload 5
      // 377: invokespecial net/minecraft/network/play/client/C13PacketPlayerAbilities.<init> (Lpj2;)V
      // 37a: invokevirtual hv0.r92 (Lmz2;)V
      // 37d: aload 0
      // 37e: getfield a6k.rpq Lc05;
      // 381: invokevirtual Minecraft.c02 ()Lp_k;
      // 384: invokevirtual p_k._m3 ()Lhv0;
      // 387: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 38a: dup
      // 38b: aload 0
      // 38c: getfield a6k.rpq Lc05;
      // 38f: getfield Minecraft.vg8 Ll86;
      // 392: getfield EntityPlayerSP.o2v D
      // 395: aload 0
      // 396: getfield a6k.rpq Lc05;
      // 399: getfield Minecraft.vg8 Ll86;
      // 39c: getfield EntityPlayerSP.kfp D
      // 39f: ldc2_w 0.41999998688697815
      // 3a2: dadd
      // 3a3: aload 0
      // 3a4: getfield a6k.rpq Lc05;
      // 3a7: getfield Minecraft.vg8 Ll86;
      // 3aa: getfield EntityPlayerSP.vbd D
      // 3ad: bipush 0
      // 3ae: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 3b1: invokevirtual hv0.r92 (Lmz2;)V
      // 3b4: aload 0
      // 3b5: getfield a6k.rpq Lc05;
      // 3b8: invokevirtual Minecraft.c02 ()Lp_k;
      // 3bb: invokevirtual p_k._m3 ()Lhv0;
      // 3be: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 3c1: dup
      // 3c2: aload 0
      // 3c3: getfield a6k.rpq Lc05;
      // 3c6: getfield Minecraft.vg8 Ll86;
      // 3c9: getfield EntityPlayerSP.o2v D
      // 3cc: aload 0
      // 3cd: getfield a6k.rpq Lc05;
      // 3d0: getfield Minecraft.vg8 Ll86;
      // 3d3: getfield EntityPlayerSP.kfp D
      // 3d6: ldc2_w 0.7531999805212015
      // 3d9: dadd
      // 3da: aload 0
      // 3db: getfield a6k.rpq Lc05;
      // 3de: getfield Minecraft.vg8 Ll86;
      // 3e1: getfield EntityPlayerSP.vbd D
      // 3e4: bipush 0
      // 3e5: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 3e8: invokevirtual hv0.r92 (Lmz2;)V
      // 3eb: aload 0
      // 3ec: invokestatic EventBus.register (Ljava/lang/Object;)V
      // 3ef: return
   }

   @EventHandler
   public void v17(ihr param1) {
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
      // 06: ifeq 21
      // 09: invokevirtual ihr.bbi ()Lmz2;
      // 0c: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 0f: ifeq 3b
      // 12: goto 19
      // 15: invokestatic a6k.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: goto 21
      // 1d: invokestatic a6k.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield a6k.tyb Z
      // 25: iload 2
      // 26: ifeq 34
      // 29: ifne 37
      // 2c: goto 33
      // 2f: invokestatic a6k.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: invokevirtual ihr.wxi (Z)V
      // 3b: return
   }

   @EventHandler
   public void q4w(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a6k.a J
      // 03: ldc2_w 113645383427945
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual wbh.nlg ()Lmz2;
      // 11: instanceof net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 14: iload 4
      // 16: ifne 3a
      // 19: ifeq 5f
      // 1c: goto 23
      // 1f: invokestatic a6k.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: iload 4
      // 26: ifne 56
      // 29: goto 30
      // 2c: invokestatic a6k.a (Loov;)Loov;
      // 2f: athrow
      // 30: getfield a6k.tyb Z
      // 33: goto 3a
      // 36: invokestatic a6k.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifne 5f
      // 3d: sipush 18400
      // 40: ldc2_w 7708027762522001966
      // 43: lload 2
      // 44: lxor
      // 45: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: nop
      // 4b: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 4e: aload 0
      // 4f: goto 56
      // 52: invokestatic a6k.a (Loov;)Loov;
      // 55: athrow
      // 56: bipush 1
      // 57: putfield a6k.tyb Z
      // 5a: aload 1
      // 5b: bipush 1
      // 5c: invokevirtual wbh.wxi (Z)V
      // 5f: return
   }

   @EventHandler
   public void z3c(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic a6k.a J
      // 003: ldc2_w 20750033477075
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield a6k.kmy Lq6h;
      // 011: ldc2_w 8500.0
      // 014: invokevirtual q6h.hqu (D)Z
      // 017: iload 4
      // 019: ifne 052
      // 01c: ifeq 042
      // 01f: goto 026
      // 022: invokestatic a6k.a (Loov;)Loov;
      // 025: athrow
      // 026: sipush 3950
      // 029: ldc2_w 4798221868904718353
      // 02c: lload 2
      // 02d: lxor
      // 02e: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: nop
      // 034: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 037: aload 0
      // 038: invokestatic EventBus.unregister (Ljava/lang/Object;)V
      // 03b: goto 042
      // 03e: invokestatic a6k.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: iload 4
      // 045: ifne 056
      // 048: getfield a6k.tyb Z
      // 04b: goto 052
      // 04e: invokestatic a6k.a (Loov;)Loov;
      // 051: athrow
      // 052: ifeq 157
      // 055: aload 0
      // 056: bipush 0
      // 057: putfield a6k.tyb Z
      // 05a: new ue5
      // 05d: dup
      // 05e: aload 0
      // 05f: getfield a6k.rpq Lc05;
      // 062: getfield Minecraft.vg8 Ll86;
      // 065: getfield EntityPlayerSP.o2v D
      // 068: aload 0
      // 069: getfield a6k.rpq Lc05;
      // 06c: getfield Minecraft.vg8 Ll86;
      // 06f: getfield EntityPlayerSP.kfp D
      // 072: aload 0
      // 073: getfield a6k.rpq Lc05;
      // 076: getfield Minecraft.vg8 Ll86;
      // 079: getfield EntityPlayerSP.vbd D
      // 07c: invokespecial ue5.<init> (DDD)V
      // 07f: astore 5
      // 081: aload 0
      // 082: iload 4
      // 084: ifne 09c
      // 087: getfield a6k.ous Lmew;
      // 08a: ifnonnull 0bd
      // 08d: goto 094
      // 090: invokestatic a6k.a (Loov;)Loov;
      // 093: athrow
      // 094: aload 0
      // 095: goto 09c
      // 098: invokestatic a6k.a (Loov;)Loov;
      // 09b: athrow
      // 09c: new mew
      // 09f: dup
      // 0a0: aload 0
      // 0a1: getfield a6k.khn Li2h;
      // 0a4: getfield EntityLivingBase.o2v D
      // 0a7: aload 0
      // 0a8: getfield a6k.khn Li2h;
      // 0ab: getfield EntityLivingBase.kfp D
      // 0ae: dconst_1
      // 0af: dadd
      // 0b0: aload 0
      // 0b1: getfield a6k.khn Li2h;
      // 0b4: getfield EntityLivingBase.vbd D
      // 0b7: invokespecial mew.<init> (DDD)V
      // 0ba: putfield a6k.ous Lmew;
      // 0bd: new ue5
      // 0c0: dup
      // 0c1: aload 0
      // 0c2: getfield a6k.ous Lmew;
      // 0c5: invokevirtual mew.getX ()I
      // 0c8: i2d
      // 0c9: aload 0
      // 0ca: getfield a6k.ous Lmew;
      // 0cd: invokevirtual mew.getY ()I
      // 0d0: i2d
      // 0d1: aload 0
      // 0d2: getfield a6k.ous Lmew;
      // 0d5: invokevirtual mew.getZ ()I
      // 0d8: i2d
      // 0d9: invokespecial ue5.<init> (DDD)V
      // 0dc: astore 6
      // 0de: aload 0
      // 0df: aload 0
      // 0e0: aload 5
      // 0e2: aload 6
      // 0e4: invokespecial a6k.ta5 (Lue5;Lue5;)Ljava/util/ArrayList;
      // 0e7: putfield a6k.sli Ljava/util/ArrayList;
      // 0ea: new java/lang/StringBuilder
      // 0ed: dup
      // 0ee: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f1: sipush 21225
      // 0f4: ldc2_w 7387621444044488080
      // 0f7: lload 2
      // 0f8: lxor
      // 0f9: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: nop
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: aload 0
      // 103: getfield a6k.ous Lmew;
      // 106: invokevirtual mew.getX ()I
      // 109: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 10c: sipush 30243
      // 10f: ldc2_w 8564946471367792984
      // 112: lload 2
      // 113: lxor
      // 114: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: nop
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: aload 0
      // 11e: getfield a6k.ous Lmew;
      // 121: invokevirtual mew.getY ()I
      // 124: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 127: sipush 30089
      // 12a: ldc2_w 5309948708956494577
      // 12d: lload 2
      // 12e: lxor
      // 12f: invokedynamic n (IJ)Ljava/lang/String; bsm=a6k.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: nop
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: aload 0
      // 139: getfield a6k.ous Lmew;
      // 13c: invokevirtual mew.getZ ()I
      // 13f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 142: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 145: invokestatic q0r.tq3 (Ljava/lang/String;)V
      // 148: aload 0
      // 149: invokestatic EventBus.unregister (Ljava/lang/Object;)V
      // 14c: new a6k$1
      // 14f: dup
      // 150: aload 0
      // 151: invokespecial a6k$1.<init> (La6k;)V
      // 154: invokevirtual a6k$1.start ()V
      // 157: return
   }

   private ArrayList ta5(ue5 param1, ue5 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: new mew
      // 008: dup
      // 009: aload 1
      // 00a: invokevirtual ue5.ptb ()Lfqr;
      // 00d: invokespecial mew.<init> (Lfqr;)V
      // 010: invokespecial a6k.vz_ (Lmew;)Z
      // 013: ifne 01e
      // 016: aload 1
      // 017: dconst_0
      // 018: dconst_1
      // 019: dconst_0
      // 01a: invokevirtual ue5.cdr (DDD)Lue5;
      // 01d: astore 1
      // 01e: new qbw
      // 021: dup
      // 022: aload 1
      // 023: aload 2
      // 024: invokespecial qbw.<init> (Lue5;Lue5;)V
      // 027: astore 4
      // 029: aload 4
      // 02b: invokevirtual qbw.pvm ()V
      // 02e: bipush 0
      // 02f: istore 5
      // 031: aconst_null
      // 032: astore 6
      // 034: aconst_null
      // 035: astore 7
      // 037: new java/util/ArrayList
      // 03a: dup
      // 03b: invokespecial java/util/ArrayList.<init> ()V
      // 03e: astore 8
      // 040: aload 4
      // 042: invokevirtual qbw.cl7 ()Ljava/util/ArrayList;
      // 045: astore 9
      // 047: aload 9
      // 049: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 04c: astore 10
      // 04e: aload 10
      // 050: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 055: ifeq 209
      // 058: aload 10
      // 05a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05f: checkcast ue5
      // 062: astore 11
      // 064: iload 5
      // 066: iload 3
      // 067: ifeq 076
      // 06a: ifeq 08b
      // 06d: goto 074
      // 070: invokestatic a6k.a (Loov;)Loov;
      // 073: athrow
      // 074: iload 5
      // 076: iload 3
      // 077: ifeq 0dd
      // 07a: aload 9
      // 07c: invokevirtual java/util/ArrayList.size ()I
      // 07f: bipush 1
      // 080: isub
      // 081: if_icmpne 0d5
      // 084: goto 08b
      // 087: invokestatic a6k.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 6
      // 08d: iload 3
      // 08e: ifeq 0cf
      // 091: goto 098
      // 094: invokestatic a6k.a (Loov;)Loov;
      // 097: athrow
      // 098: ifnull 0bb
      // 09b: goto 0a2
      // 09e: invokestatic a6k.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 8
      // 0a4: aload 6
      // 0a6: ldc2_w 0.5
      // 0a9: dconst_0
      // 0aa: ldc2_w 0.5
      // 0ad: invokevirtual ue5.cdr (DDD)Lue5;
      // 0b0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0b3: pop
      // 0b4: goto 0bb
      // 0b7: invokestatic a6k.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 8
      // 0bd: aload 11
      // 0bf: ldc2_w 0.5
      // 0c2: dconst_0
      // 0c3: ldc2_w 0.5
      // 0c6: invokevirtual ue5.cdr (DDD)Lue5;
      // 0c9: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0cc: pop
      // 0cd: aload 11
      // 0cf: astore 7
      // 0d1: iload 3
      // 0d2: ifne 1fe
      // 0d5: bipush 1
      // 0d6: goto 0dd
      // 0d9: invokestatic a6k.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: istore 12
      // 0df: aload 11
      // 0e1: aload 7
      // 0e3: invokevirtual ue5.glf (Lue5;)D
      // 0e6: ldc2_w 25.0
      // 0e9: iload 3
      // 0ea: ifeq 110
      // 0ed: dcmpl
      // 0ee: ifle 0ff
      // 0f1: goto 0f8
      // 0f4: invokestatic a6k.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: bipush 0
      // 0f9: istore 12
      // 0fb: iload 3
      // 0fc: ifne 1d1
      // 0ff: aload 7
      // 101: invokevirtual ue5.h25 ()D
      // 104: aload 11
      // 106: invokevirtual ue5.h25 ()D
      // 109: goto 110
      // 10c: invokestatic a6k.a (Loov;)Loov;
      // 10f: athrow
      // 110: invokestatic java/lang/Math.min (DD)D
      // 113: dstore 13
      // 115: aload 7
      // 117: invokevirtual ue5.mji ()D
      // 11a: aload 11
      // 11c: invokevirtual ue5.mji ()D
      // 11f: invokestatic java/lang/Math.min (DD)D
      // 122: dstore 15
      // 124: aload 7
      // 126: invokevirtual ue5.va0 ()D
      // 129: aload 11
      // 12b: invokevirtual ue5.va0 ()D
      // 12e: invokestatic java/lang/Math.min (DD)D
      // 131: dstore 17
      // 133: aload 7
      // 135: invokevirtual ue5.h25 ()D
      // 138: aload 11
      // 13a: invokevirtual ue5.h25 ()D
      // 13d: invokestatic java/lang/Math.max (DD)D
      // 140: dstore 19
      // 142: aload 7
      // 144: invokevirtual ue5.mji ()D
      // 147: aload 11
      // 149: invokevirtual ue5.mji ()D
      // 14c: invokestatic java/lang/Math.max (DD)D
      // 14f: dstore 21
      // 151: aload 7
      // 153: invokevirtual ue5.va0 ()D
      // 156: aload 11
      // 158: invokevirtual ue5.va0 ()D
      // 15b: invokestatic java/lang/Math.max (DD)D
      // 15e: dstore 23
      // 160: dload 13
      // 162: d2i
      // 163: istore 25
      // 165: iload 25
      // 167: i2d
      // 168: dload 19
      // 16a: dcmpg
      // 16b: ifgt 1d1
      // 16e: dload 15
      // 170: d2i
      // 171: iload 3
      // 172: ifeq 1d3
      // 175: istore 26
      // 177: iload 26
      // 179: i2d
      // 17a: dload 21
      // 17c: dcmpg
      // 17d: ifgt 1ca
      // 180: dload 17
      // 182: d2i
      // 183: iload 3
      // 184: ifeq 16b
      // 187: istore 27
      // 189: iload 27
      // 18b: i2d
      // 18c: dload 23
      // 18e: dcmpg
      // 18f: ifgt 1c3
      // 192: iload 25
      // 194: iload 26
      // 196: iload 27
      // 198: bipush 0
      // 199: invokestatic qbw.sif (IIIZ)Z
      // 19c: iload 3
      // 19d: ifeq 17d
      // 1a0: iload 3
      // 1a1: ifeq 1af
      // 1a4: ifne 1b5
      // 1a7: goto 1ae
      // 1aa: invokestatic a6k.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: bipush 0
      // 1af: istore 12
      // 1b1: iload 3
      // 1b2: ifne 1d1
      // 1b5: iinc 27 1
      // 1b8: iload 3
      // 1b9: ifne 189
      // 1bc: goto 1c3
      // 1bf: invokestatic a6k.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: iinc 26 1
      // 1c6: iload 3
      // 1c7: ifne 177
      // 1ca: iinc 25 1
      // 1cd: iload 3
      // 1ce: ifne 165
      // 1d1: iload 12
      // 1d3: iload 3
      // 1d4: ifeq 1f9
      // 1d7: ifne 1fe
      // 1da: goto 1e1
      // 1dd: invokestatic a6k.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: aload 8
      // 1e3: aload 6
      // 1e5: ldc2_w 0.5
      // 1e8: dconst_0
      // 1e9: ldc2_w 0.5
      // 1ec: invokevirtual ue5.cdr (DDD)Lue5;
      // 1ef: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1f2: goto 1f9
      // 1f5: invokestatic a6k.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: pop
      // 1fa: aload 6
      // 1fc: astore 7
      // 1fe: aload 11
      // 200: astore 6
      // 202: iinc 5 1
      // 205: iload 3
      // 206: ifne 04e
      // 209: aload 8
      // 20b: areturn
   }

   private boolean vz_(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: getfield Minecraft.tij Lkh3;
      // 0a: new mew
      // 0d: dup
      // 0e: aload 1
      // 0f: invokevirtual mew.getX ()I
      // 12: aload 1
      // 13: invokevirtual mew.getY ()I
      // 16: aload 1
      // 17: invokevirtual mew.getZ ()I
      // 1a: invokespecial mew.<init> (III)V
      // 1d: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 20: invokeinterface zfz.r_y ()Le0x; 1
      // 25: astore 3
      // 26: aload 3
      // 27: invokevirtual e0x.p1r ()Lp3y;
      // 2a: getstatic p3y.cei Lp3y;
      // 2d: iload 2
      // 2e: ifne 49
      // 31: if_acmpeq de
      // 34: goto 3b
      // 37: invokestatic a6k.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 3
      // 3c: invokevirtual e0x.p1r ()Lp3y;
      // 3f: getstatic p3y.nc7 Lp3y;
      // 42: goto 49
      // 45: invokestatic a6k.a (Loov;)Loov;
      // 48: athrow
      // 49: iload 2
      // 4a: ifne 70
      // 4d: if_acmpeq de
      // 50: goto 57
      // 53: invokestatic a6k.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 3
      // 58: iload 2
      // 59: ifne 74
      // 5c: goto 63
      // 5f: invokestatic a6k.a (Loov;)Loov;
      // 62: athrow
      // 63: invokevirtual e0x.p1r ()Lp3y;
      // 66: getstatic p3y.wui Lp3y;
      // 69: goto 70
      // 6c: invokestatic a6k.a (Loov;)Loov;
      // 6f: athrow
      // 70: if_acmpeq de
      // 73: aload 3
      // 74: iload 2
      // 75: ifne 8d
      // 78: getstatic ox_.h49 Le0x;
      // 7b: if_acmpeq de
      // 7e: goto 85
      // 81: invokestatic a6k.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 3
      // 86: goto 8d
      // 89: invokestatic a6k.a (Loov;)Loov;
      // 8c: athrow
      // 8d: iload 2
      // 8e: ifne a6
      // 91: getstatic ox_.gdz Les2;
      // 94: if_acmpeq de
      // 97: goto 9e
      // 9a: invokestatic a6k.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 3
      // 9f: goto a6
      // a2: invokestatic a6k.a (Loov;)Loov;
      // a5: athrow
      // a6: getstatic ox_.whp L_13;
      // a9: iload 2
      // aa: ifne c2
      // ad: if_acmpeq de
      // b0: goto b7
      // b3: invokestatic a6k.a (Loov;)Loov;
      // b6: athrow
      // b7: aload 3
      // b8: getstatic ox_.kng Le0x;
      // bb: goto c2
      // be: invokestatic a6k.a (Loov;)Loov;
      // c1: athrow
      // c2: iload 2
      // c3: ifne db
      // c6: if_acmpeq de
      // c9: goto d0
      // cc: invokestatic a6k.a (Loov;)Loov;
      // cf: athrow
      // d0: aload 3
      // d1: getstatic ox_.w0z Le0x;
      // d4: goto db
      // d7: invokestatic a6k.a (Loov;)Loov;
      // da: athrow
      // db: if_acmpne e6
      // de: bipush 1
      // df: goto e7
      // e2: invokestatic a6k.a (Loov;)Loov;
      // e5: athrow
      // e6: bipush 0
      // e7: ireturn
   }

   public static ArrayList jmd(a6k var0) {
      return var0.sli;
   }

   public static Minecraft jnd(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft ljj(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft dm5(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft Event(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft thp(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft _9h(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft t6e(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft svl(a6k var0) {
      return var0.rpq;
   }

   public static Minecraft clw(a6k var0) {
      return var0.rpq;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1835744061930157521L, 1560760488739116434L, MethodHandles.lookup().lookupClass()).a(21111251341704L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 107463210831966L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "Íÿ\u0093\u0019ôæ ·ý~h\u0005`¥;¿\u000e\u0017 \u009fã\u0018Ï\u009c²\u009f²Q/I$¿0}8v(i¼ÝDÎé\u008a^8³G8süð\u0014¶ZPUÑY3\u0010ú9\u0004áû\n!>HÛá&£Æ8-\u009b·Ò\u007f fXýì»\u0013\u0082\u0018\u0083ÚCÐÊ~e´âx[\tÿÚN\u0016\u009bb7>]P[ßhÇIyÄ/£\u009aµG\nx¯OÈ\u008f\u0087¶bÌ97\u0007±\u0019Á|d\u0094\u0006Àì£Ö<t\u009e\u0019\u001a\u008fß{À\u0002ø1\u0010ïJ\"\u0019u\u0080_¨õ\u008d\u0019\t\bº®\u0000»7âì`\u0007E8Ú£\u0015äú$o\u008f&N\\\u0000sM\u0093\u0084½Q¦\u0016î¼\u009a¿7\u0002£\u009dÔõÉÆLÖ\u0010x\u0011\u008dè\u0098\u0012J\u0093Á97/¡\u008dÓh(<ÃE{öRa¡\u001e\u007f¿ãþ\fÍËmÚês#ÌÕr\u0090ØX2Þ}*ëÁ+2Á1ßÜ\u001a0Ë ¬~Ð\u0090Ê'sè\u0084\u0083¾uÆ÷ó÷9S\u0085þ\u001dÄ4l¹0·E?\u008eYjî«éR \u0096D\u0094öH\u0018\u009e\u001bË\u0010\u0088Ñp|»ò\u000fßýÇ\u0019ZxÍkn\u0018\u0089î\u00ad\u009a\nF\u009d·\u001e\u0097¦[Û¾ü\u0097Þµ{'Û§´îpò\u0003·\u0089\u0015U|«[eE¾þ¸ï\u00ad \u008a\u0080ëq\u0004Þ\u009d3¹¿½kmóÓí.c$-ï\u0006þ6à\u0004¯§öÂ\u007f\u008a+ÔÚ¢æú\":B\u0015p\u0001\u0014\u00adTs²\u001d\u0087{{ ®`Mp¾w\u0084|UÞË\u0000\u001eí\u000fíj}\u008dføJ\u0000I,&LJ¢Ata¤OW\u0017Ú(\u0093\u0087\u009b";
      int var8 = "Íÿ\u0093\u0019ôæ ·ý~h\u0005`¥;¿\u000e\u0017 \u009fã\u0018Ï\u009c²\u009f²Q/I$¿0}8v(i¼ÝDÎé\u008a^8³G8süð\u0014¶ZPUÑY3\u0010ú9\u0004áû\n!>HÛá&£Æ8-\u009b·Ò\u007f fXýì»\u0013\u0082\u0018\u0083ÚCÐÊ~e´âx[\tÿÚN\u0016\u009bb7>]P[ßhÇIyÄ/£\u009aµG\nx¯OÈ\u008f\u0087¶bÌ97\u0007±\u0019Á|d\u0094\u0006Àì£Ö<t\u009e\u0019\u001a\u008fß{À\u0002ø1\u0010ïJ\"\u0019u\u0080_¨õ\u008d\u0019\t\bº®\u0000»7âì`\u0007E8Ú£\u0015äú$o\u008f&N\\\u0000sM\u0093\u0084½Q¦\u0016î¼\u009a¿7\u0002£\u009dÔõÉÆLÖ\u0010x\u0011\u008dè\u0098\u0012J\u0093Á97/¡\u008dÓh(<ÃE{öRa¡\u001e\u007f¿ãþ\fÍËmÚês#ÌÕr\u0090ØX2Þ}*ëÁ+2Á1ßÜ\u001a0Ë ¬~Ð\u0090Ê'sè\u0084\u0083¾uÆ÷ó÷9S\u0085þ\u001dÄ4l¹0·E?\u008eYjî«éR \u0096D\u0094öH\u0018\u009e\u001bË\u0010\u0088Ñp|»ò\u000fßýÇ\u0019ZxÍkn\u0018\u0089î\u00ad\u009a\nF\u009d·\u001e\u0097¦[Û¾ü\u0097Þµ{'Û§´îpò\u0003·\u0089\u0015U|«[eE¾þ¸ï\u00ad \u008a\u0080ëq\u0004Þ\u009d3¹¿½kmóÓí.c$-ï\u0006þ6à\u0004¯§öÂ\u007f\u008a+ÔÚ¢æú\":B\u0015p\u0001\u0014\u00adTs²\u001d\u0087{{ ®`Mp¾w\u0084|UÞË\u0000\u001eí\u000fíj}\u008dføJ\u0000I,&LJ¢Ata¤OW\u0017Ú(\u0093\u0087\u009b"
         .length();
      char var5 = ' ';
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
                     e = new String[12];
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

                  var6 = ":\u009e']²ÉºWÃ\u0007b\u0092[jk,\u0015Â?\u0084~Ø|/\u0018ÔÌ>VàuÅ6<Ú\u001fb:\u000fÕ¹£Q´\u0081Ê\u007f¨ä";
                  var8 = ":\u009e']²ÉºWÃ\u0007b\u0092[jk,\u0015Â?\u0084~Ø|/\u0018ÔÌ>VàuÅ6<Ú\u001fb:\u000fÕ¹£Q´\u0081Ê\u007f¨ä".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11756;
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
            throw new RuntimeException("a6k", var10);
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
         throw new RuntimeException("a6k" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
