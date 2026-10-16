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
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging$pl2;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.client.C0BPacketEntityAction$ck7;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus$v78;
import net.minecraft.tileentity.TileEntitySign;

public class l86 extends x0l {
   public final p_k lq7;
   private final ik0 d9k;
   private double g6_;
   public double b_6;
   private double sw3;
   private float r13;
   private float thm;
   private boolean jm1;
   private boolean uxf;
   private int fb1;
   private boolean _dy;
   private String _cx;
   public boa g9g;
   public c05 oh6;
   public int kzu;
   public int yah;
   public float yfu;
   public float dd5;
   public float txh;
   public float opd;
   private int lms;
   private float wn1;
   public float u3f;
   public float u57;
   private static final long d;
   private static final String[] t;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public l86(c05 var1, t9d var2, p_k var3, ik0 var4) {
      super(var2, var3.w29());
      this.lq7 = var3;
      this.d9k = var4;
      this.oh6 = var1;
      this.ohd = 0;
   }

   @Override
   public boolean m1t(ofh var1, float var2) {
      return false;
   }

   @Override
   public void rwd(float var1) {
   }

   @Override
   public void nw9(i2h param1) {
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
      // 05: iload 2
      // 06: ifne 23
      // 09: aload 1
      // 0a: invokespecial x0l.nw9 (Li2h;)V
      // 0d: aload 1
      // 0e: instanceof _f3
      // 11: ifeq 38
      // 14: goto 1b
      // 17: invokestatic l86.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic l86.b (Loov;)Loov;
      // 22: athrow
      // 23: getfield l86.oh6 Lc05;
      // 26: invokevirtual c05.yp9 ()Ldbu;
      // 29: new s8o
      // 2c: dup
      // 2d: aload 0
      // 2e: aload 1
      // 2f: checkcast _f3
      // 32: invokespecial s8o.<init> (Lha9;L_f3;)V
      // 35: invokevirtual dbu.mak (Ljp4;)V
      // 38: return
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield l86.oay Lt9d;
      // 08: new mew
      // 0b: dup
      // 0c: aload 0
      // 0d: getfield l86.o2v D
      // 10: dconst_0
      // 11: aload 0
      // 12: getfield l86.vbd D
      // 15: invokespecial mew.<init> (DDD)V
      // 18: invokevirtual t9d.xjm (Lmew;)Z
      // 1b: iload 1
      // 1c: ifne 47
      // 1f: ifeq 9e
      // 22: goto 29
      // 25: invokestatic l86.b (Loov;)Loov;
      // 28: athrow
      // 29: new edg
      // 2c: dup
      // 2d: invokespecial edg.<init> ()V
      // 30: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 33: pop
      // 34: aload 0
      // 35: invokespecial x0l.xx_ ()V
      // 38: aload 0
      // 39: iload 1
      // 3a: ifne 9b
      // 3d: goto 44
      // 40: invokestatic l86.b (Loov;)Loov;
      // 43: athrow
      // 44: invokevirtual l86.i0e ()Z
      // 47: ifeq 93
      // 4a: aload 0
      // 4b: getfield l86.lq7 Lp_k;
      // 4e: new net/minecraft/network/play/client/C03PacketPlayer$C05PacketPlayerLook
      // 51: dup
      // 52: aload 0
      // 53: getfield l86.x5k F
      // 56: aload 0
      // 57: getfield l86.y2i F
      // 5a: aload 0
      // 5b: getfield l86.lfk Z
      // 5e: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C05PacketPlayerLook.<init> (FFZ)V
      // 61: invokevirtual p_k.sxi (Lmz2;)V
      // 64: aload 0
      // 65: getfield l86.lq7 Lp_k;
      // 68: new net/minecraft/network/play/client/C0CPacketInput
      // 6b: dup
      // 6c: aload 0
      // 6d: getfield l86.z66 F
      // 70: aload 0
      // 71: getfield l86.ooc F
      // 74: aload 0
      // 75: getfield l86.g9g Lboa;
      // 78: getfield boa.s0a Z
      // 7b: aload 0
      // 7c: getfield l86.g9g Lboa;
      // 7f: getfield boa.k5u Z
      // 82: invokespecial net/minecraft/network/play/client/C0CPacketInput.<init> (FFZZ)V
      // 85: invokevirtual p_k.sxi (Lmz2;)V
      // 88: iload 1
      // 89: ifeq 9e
      // 8c: goto 93
      // 8f: invokestatic l86.b (Loov;)Loov;
      // 92: athrow
      // 93: aload 0
      // 94: goto 9b
      // 97: invokestatic l86.b (Loov;)Loov;
      // 9a: athrow
      // 9b: invokevirtual l86.na8 ()V
      // 9e: return
   }

   public void na8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new fz2
      // 003: dup
      // 004: aload 0
      // 005: getfield l86.o2v D
      // 008: aload 0
      // 009: invokevirtual l86.aaw ()Lnh4;
      // 00c: getfield nh4.bx_ D
      // 00f: aload 0
      // 010: getfield l86.vbd D
      // 013: aload 0
      // 014: getfield l86.x5k F
      // 017: aload 0
      // 018: getfield l86.y2i F
      // 01b: aload 0
      // 01c: getfield l86.lfk Z
      // 01f: invokespecial fz2.<init> (DDDFFZ)V
      // 022: astore 2
      // 023: invokestatic t9d.b ()I
      // 026: aload 2
      // 027: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 02a: pop
      // 02b: istore 1
      // 02c: aload 2
      // 02d: invokevirtual fz2.elp ()Z
      // 030: iload 1
      // 031: ifeq 058
      // 034: ifeq 054
      // 037: goto 03e
      // 03a: invokestatic l86.b (Loov;)Loov;
      // 03d: athrow
      // 03e: new q8e
      // 041: dup
      // 042: aload 2
      // 043: invokevirtual fz2.m1r ()F
      // 046: aload 2
      // 047: invokevirtual fz2.d9n ()F
      // 04a: invokespecial q8e.<init> (FF)V
      // 04d: astore 3
      // 04e: aload 3
      // 04f: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 052: pop
      // 053: return
      // 054: aload 0
      // 055: invokevirtual l86.ew1 ()Z
      // 058: istore 3
      // 059: iload 3
      // 05a: iload 1
      // 05b: ifeq 0b6
      // 05e: aload 0
      // 05f: getfield l86.uxf Z
      // 062: if_icmpeq 0b2
      // 065: goto 06c
      // 068: invokestatic l86.b (Loov;)Loov;
      // 06b: athrow
      // 06c: iload 3
      // 06d: ifeq 094
      // 070: goto 077
      // 073: invokestatic l86.b (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: getfield l86.lq7 Lp_k;
      // 07b: new net/minecraft/network/play/client/C0BPacketEntityAction
      // 07e: dup
      // 07f: aload 0
      // 080: getstatic net/minecraft/network/play/client/C0BPacketEntityAction$ck7.mft Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;
      // 083: invokespecial net/minecraft/network/play/client/C0BPacketEntityAction.<init> (Li2h;Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;)V
      // 086: invokevirtual p_k.sxi (Lmz2;)V
      // 089: iload 1
      // 08a: ifne 0ad
      // 08d: goto 094
      // 090: invokestatic l86.b (Loov;)Loov;
      // 093: athrow
      // 094: aload 0
      // 095: getfield l86.lq7 Lp_k;
      // 098: new net/minecraft/network/play/client/C0BPacketEntityAction
      // 09b: dup
      // 09c: aload 0
      // 09d: getstatic net/minecraft/network/play/client/C0BPacketEntityAction$ck7.dbx Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;
      // 0a0: invokespecial net/minecraft/network/play/client/C0BPacketEntityAction.<init> (Li2h;Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;)V
      // 0a3: invokevirtual p_k.sxi (Lmz2;)V
      // 0a6: goto 0ad
      // 0a9: invokestatic l86.b (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: iload 3
      // 0af: putfield l86.uxf Z
      // 0b2: aload 0
      // 0b3: invokevirtual l86.hzv ()Z
      // 0b6: istore 4
      // 0b8: iload 4
      // 0ba: iload 1
      // 0bb: ifeq 118
      // 0be: aload 0
      // 0bf: getfield l86.jm1 Z
      // 0c2: if_icmpeq 114
      // 0c5: goto 0cc
      // 0c8: invokestatic l86.b (Loov;)Loov;
      // 0cb: athrow
      // 0cc: iload 4
      // 0ce: ifeq 0f5
      // 0d1: goto 0d8
      // 0d4: invokestatic l86.b (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: getfield l86.lq7 Lp_k;
      // 0dc: new net/minecraft/network/play/client/C0BPacketEntityAction
      // 0df: dup
      // 0e0: aload 0
      // 0e1: getstatic net/minecraft/network/play/client/C0BPacketEntityAction$ck7.cqg Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;
      // 0e4: invokespecial net/minecraft/network/play/client/C0BPacketEntityAction.<init> (Li2h;Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;)V
      // 0e7: invokevirtual p_k.sxi (Lmz2;)V
      // 0ea: iload 1
      // 0eb: ifne 10e
      // 0ee: goto 0f5
      // 0f1: invokestatic l86.b (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield l86.lq7 Lp_k;
      // 0f9: new net/minecraft/network/play/client/C0BPacketEntityAction
      // 0fc: dup
      // 0fd: aload 0
      // 0fe: getstatic net/minecraft/network/play/client/C0BPacketEntityAction$ck7.lxs Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;
      // 101: invokespecial net/minecraft/network/play/client/C0BPacketEntityAction.<init> (Li2h;Lnet/minecraft/network/play/client/C0BPacketEntityAction$ck7;)V
      // 104: invokevirtual p_k.sxi (Lmz2;)V
      // 107: goto 10e
      // 10a: invokestatic l86.b (Loov;)Loov;
      // 10d: athrow
      // 10e: aload 0
      // 10f: iload 4
      // 111: putfield l86.jm1 Z
      // 114: aload 0
      // 115: invokevirtual l86.zc_ ()Z
      // 118: ifeq 35a
      // 11b: aload 2
      // 11c: invokevirtual fz2.e8j ()D
      // 11f: aload 0
      // 120: getfield l86.g6_ D
      // 123: dsub
      // 124: dstore 5
      // 126: aload 2
      // 127: invokevirtual fz2.fk0 ()D
      // 12a: aload 0
      // 12b: getfield l86.b_6 D
      // 12e: dsub
      // 12f: dstore 7
      // 131: aload 2
      // 132: invokevirtual fz2.ean ()D
      // 135: aload 0
      // 136: getfield l86.sw3 D
      // 139: dsub
      // 13a: dstore 9
      // 13c: aload 2
      // 13d: invokevirtual fz2.m1r ()F
      // 140: aload 0
      // 141: getfield l86.r13 F
      // 144: fsub
      // 145: f2d
      // 146: dstore 11
      // 148: aload 2
      // 149: invokevirtual fz2.d9n ()F
      // 14c: aload 0
      // 14d: getfield l86.thm F
      // 150: fsub
      // 151: f2d
      // 152: dstore 13
      // 154: dload 5
      // 156: dload 5
      // 158: dmul
      // 159: dload 7
      // 15b: dload 7
      // 15d: dmul
      // 15e: dadd
      // 15f: dload 9
      // 161: dload 9
      // 163: dmul
      // 164: dadd
      // 165: ldc2_w 9.0E-4
      // 168: dcmpl
      // 169: iload 1
      // 16a: ifeq 19a
      // 16d: ifgt 192
      // 170: goto 177
      // 173: invokestatic l86.b (Loov;)Loov;
      // 176: athrow
      // 177: aload 0
      // 178: getfield l86.fb1 I
      // 17b: iload 1
      // 17c: ifeq 19a
      // 17f: goto 186
      // 182: invokestatic l86.b (Loov;)Loov;
      // 185: athrow
      // 186: bipush 20
      // 188: if_icmplt 19d
      // 18b: goto 192
      // 18e: invokestatic l86.b (Loov;)Loov;
      // 191: athrow
      // 192: bipush 1
      // 193: goto 19a
      // 196: invokestatic l86.b (Loov;)Loov;
      // 199: athrow
      // 19a: goto 19e
      // 19d: bipush 0
      // 19e: istore 15
      // 1a0: dload 11
      // 1a2: dconst_0
      // 1a3: dcmpl
      // 1a4: iload 1
      // 1a5: ifeq 1cc
      // 1a8: ifne 1cb
      // 1ab: goto 1b2
      // 1ae: invokestatic l86.b (Loov;)Loov;
      // 1b1: athrow
      // 1b2: dload 13
      // 1b4: dconst_0
      // 1b5: dcmpl
      // 1b6: iload 1
      // 1b7: ifeq 1cc
      // 1ba: goto 1c1
      // 1bd: invokestatic l86.b (Loov;)Loov;
      // 1c0: athrow
      // 1c1: ifeq 1cf
      // 1c4: goto 1cb
      // 1c7: invokestatic l86.b (Loov;)Loov;
      // 1ca: athrow
      // 1cb: bipush 1
      // 1cc: goto 1d0
      // 1cf: bipush 0
      // 1d0: istore 16
      // 1d2: aload 0
      // 1d3: iload 1
      // 1d4: ifeq 2d9
      // 1d7: getfield l86.hzp Li2h;
      // 1da: ifnonnull 2d1
      // 1dd: goto 1e4
      // 1e0: invokestatic l86.b (Loov;)Loov;
      // 1e3: athrow
      // 1e4: iload 15
      // 1e6: iload 1
      // 1e7: ifeq 24c
      // 1ea: goto 1f1
      // 1ed: invokestatic l86.b (Loov;)Loov;
      // 1f0: athrow
      // 1f1: ifeq 243
      // 1f4: goto 1fb
      // 1f7: invokestatic l86.b (Loov;)Loov;
      // 1fa: athrow
      // 1fb: iload 16
      // 1fd: iload 1
      // 1fe: ifeq 24c
      // 201: goto 208
      // 204: invokestatic l86.b (Loov;)Loov;
      // 207: athrow
      // 208: ifeq 243
      // 20b: goto 212
      // 20e: invokestatic l86.b (Loov;)Loov;
      // 211: athrow
      // 212: aload 0
      // 213: getfield l86.lq7 Lp_k;
      // 216: new net/minecraft/network/play/client/C03PacketPlayer$C06PacketPlayerPosLook
      // 219: dup
      // 21a: aload 2
      // 21b: invokevirtual fz2.e8j ()D
      // 21e: aload 2
      // 21f: invokevirtual fz2.fk0 ()D
      // 222: aload 2
      // 223: invokevirtual fz2.ean ()D
      // 226: aload 2
      // 227: invokevirtual fz2.m1r ()F
      // 22a: aload 2
      // 22b: invokevirtual fz2.d9n ()F
      // 22e: aload 2
      // 22f: invokevirtual fz2.upz ()Z
      // 232: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C06PacketPlayerPosLook.<init> (DDDFFZ)V
      // 235: invokevirtual p_k.sxi (Lmz2;)V
      // 238: iload 1
      // 239: ifne 300
      // 23c: goto 243
      // 23f: invokestatic l86.b (Loov;)Loov;
      // 242: athrow
      // 243: iload 15
      // 245: goto 24c
      // 248: invokestatic l86.b (Loov;)Loov;
      // 24b: athrow
      // 24c: iload 1
      // 24d: ifeq 28c
      // 250: ifeq 283
      // 253: goto 25a
      // 256: invokestatic l86.b (Loov;)Loov;
      // 259: athrow
      // 25a: aload 0
      // 25b: getfield l86.lq7 Lp_k;
      // 25e: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 261: dup
      // 262: aload 2
      // 263: invokevirtual fz2.e8j ()D
      // 266: aload 2
      // 267: invokevirtual fz2.fk0 ()D
      // 26a: aload 2
      // 26b: invokevirtual fz2.ean ()D
      // 26e: aload 2
      // 26f: invokevirtual fz2.upz ()Z
      // 272: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 275: invokevirtual p_k.sxi (Lmz2;)V
      // 278: iload 1
      // 279: ifne 300
      // 27c: goto 283
      // 27f: invokestatic l86.b (Loov;)Loov;
      // 282: athrow
      // 283: iload 16
      // 285: goto 28c
      // 288: invokestatic l86.b (Loov;)Loov;
      // 28b: athrow
      // 28c: ifeq 2b4
      // 28f: aload 0
      // 290: getfield l86.lq7 Lp_k;
      // 293: new net/minecraft/network/play/client/C03PacketPlayer$C05PacketPlayerLook
      // 296: dup
      // 297: aload 2
      // 298: invokevirtual fz2.m1r ()F
      // 29b: aload 2
      // 29c: invokevirtual fz2.d9n ()F
      // 29f: aload 2
      // 2a0: invokevirtual fz2.upz ()Z
      // 2a3: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C05PacketPlayerLook.<init> (FFZ)V
      // 2a6: invokevirtual p_k.sxi (Lmz2;)V
      // 2a9: iload 1
      // 2aa: ifne 300
      // 2ad: goto 2b4
      // 2b0: invokestatic l86.b (Loov;)Loov;
      // 2b3: athrow
      // 2b4: aload 0
      // 2b5: getfield l86.lq7 Lp_k;
      // 2b8: new net/minecraft/network/play/client/C03PacketPlayer
      // 2bb: dup
      // 2bc: aload 2
      // 2bd: invokevirtual fz2.upz ()Z
      // 2c0: invokespecial net/minecraft/network/play/client/C03PacketPlayer.<init> (Z)V
      // 2c3: invokevirtual p_k.sxi (Lmz2;)V
      // 2c6: iload 1
      // 2c7: ifne 300
      // 2ca: goto 2d1
      // 2cd: invokestatic l86.b (Loov;)Loov;
      // 2d0: athrow
      // 2d1: aload 0
      // 2d2: goto 2d9
      // 2d5: invokestatic l86.b (Loov;)Loov;
      // 2d8: athrow
      // 2d9: getfield l86.lq7 Lp_k;
      // 2dc: new net/minecraft/network/play/client/C03PacketPlayer$C06PacketPlayerPosLook
      // 2df: dup
      // 2e0: aload 0
      // 2e1: getfield l86.icv D
      // 2e4: ldc2_w -999.0
      // 2e7: aload 0
      // 2e8: getfield l86.bw4 D
      // 2eb: aload 2
      // 2ec: invokevirtual fz2.m1r ()F
      // 2ef: aload 2
      // 2f0: invokevirtual fz2.d9n ()F
      // 2f3: aload 2
      // 2f4: invokevirtual fz2.upz ()Z
      // 2f7: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C06PacketPlayerPosLook.<init> (DDDFFZ)V
      // 2fa: invokevirtual p_k.sxi (Lmz2;)V
      // 2fd: bipush 0
      // 2fe: istore 15
      // 300: aload 0
      // 301: dup
      // 302: getfield l86.fb1 I
      // 305: bipush 1
      // 306: iadd
      // 307: putfield l86.fb1 I
      // 30a: iload 15
      // 30c: iload 1
      // 30d: ifeq 340
      // 310: ifeq 33e
      // 313: goto 31a
      // 316: invokestatic l86.b (Loov;)Loov;
      // 319: athrow
      // 31a: aload 0
      // 31b: aload 2
      // 31c: invokevirtual fz2.e8j ()D
      // 31f: putfield l86.g6_ D
      // 322: aload 0
      // 323: aload 2
      // 324: invokevirtual fz2.fk0 ()D
      // 327: putfield l86.b_6 D
      // 32a: aload 0
      // 32b: aload 2
      // 32c: invokevirtual fz2.ean ()D
      // 32f: putfield l86.sw3 D
      // 332: aload 0
      // 333: bipush 0
      // 334: putfield l86.fb1 I
      // 337: goto 33e
      // 33a: invokestatic l86.b (Loov;)Loov;
      // 33d: athrow
      // 33e: iload 16
      // 340: ifeq 35a
      // 343: aload 0
      // 344: aload 2
      // 345: invokevirtual fz2.m1r ()F
      // 348: putfield l86.r13 F
      // 34b: aload 0
      // 34c: aload 2
      // 34d: invokevirtual fz2.d9n ()F
      // 350: putfield l86.thm F
      // 353: goto 35a
      // 356: invokestatic l86.b (Loov;)Loov;
      // 359: athrow
      // 35a: new q8e
      // 35d: dup
      // 35e: aload 2
      // 35f: invokevirtual fz2.m1r ()F
      // 362: aload 2
      // 363: invokevirtual fz2.d9n ()F
      // 366: invokespecial q8e.<init> (FF)V
      // 369: astore 5
      // 36b: aload 5
      // 36d: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 370: pop
      // 371: return
   }

   @Override
   public nvf e07(boolean var1) {
      C07PacketPlayerDigging$pl2 var10000;
      label16: {
         try {
            if (var1) {
               var10000 = C07PacketPlayerDigging$pl2.r69;
               break label16;
            }
         } catch (oov var3) {
            throw b(var3);
         }

         var10000 = C07PacketPlayerDigging$pl2.etu;
      }

      C07PacketPlayerDigging$pl2 var2 = var10000;
      this.lq7.sxi(new C07PacketPlayerDigging(var2, mew._9b, vt2.m3r));
      return null;
   }

   @Override
   public void ys6(nvf var1) {
   }

   public void vf0(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new u30
      // 03: dup
      // 04: aload 1
      // 05: invokespecial u30.<init> (Ljava/lang/String;)V
      // 08: astore 3
      // 09: invokestatic t9d.b ()I
      // 0c: aload 3
      // 0d: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 10: pop
      // 11: istore 2
      // 12: aload 3
      // 13: invokevirtual u30.elp ()Z
      // 16: iload 2
      // 17: ifeq 2b
      // 1a: ifeq 25
      // 1d: goto 24
      // 20: invokestatic l86.b (Loov;)Loov;
      // 23: athrow
      // 24: return
      // 25: getstatic kgt.pc_ Lpy5;
      // 28: invokevirtual py5.klu ()Z
      // 2b: iload 2
      // 2c: ifeq 47
      // 2f: ifeq b1
      // 32: goto 39
      // 35: invokestatic l86.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: ldc "/"
      // 3c: nop
      // 3d: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 40: goto 47
      // 43: invokestatic l86.b (Loov;)Loov;
      // 46: athrow
      // 47: ifne b1
      // 4a: new java/lang/StringBuilder
      // 4d: dup
      // 4e: invokespecial java/lang/StringBuilder.<init> ()V
      // 51: astore 4
      // 53: aload 3
      // 54: getfield u30.nqy Ljava/lang/String;
      // 57: invokevirtual java/lang/String.toCharArray ()[C
      // 5a: astore 5
      // 5c: aload 5
      // 5e: arraylength
      // 5f: istore 6
      // 61: bipush 0
      // 62: istore 7
      // 64: iload 7
      // 66: iload 6
      // 68: if_icmpge 9f
      // 6b: aload 5
      // 6d: iload 7
      // 6f: caload
      // 70: istore 8
      // 72: aload 4
      // 74: new java/lang/StringBuilder
      // 77: dup
      // 78: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b: iload 8
      // 7d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 80: ldc "\u061d"
      // 82: nop
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: pop
      // 8d: iinc 7 1
      // 90: iload 2
      // 91: ifeq c3
      // 94: iload 2
      // 95: ifne 64
      // 98: goto 9f
      // 9b: invokestatic l86.b (Loov;)Loov;
      // 9e: athrow
      // 9f: aload 3
      // a0: aload 4
      // a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a5: ldc "%"
      // a7: nop
      // a8: ldc ""
      // aa: nop
      // ab: invokevirtual java/lang/String.replaceFirst (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // ae: putfield u30.nqy Ljava/lang/String;
      // b1: aload 0
      // b2: getfield l86.lq7 Lp_k;
      // b5: new net/minecraft/network/play/client/C01PacketChatMessage
      // b8: dup
      // b9: aload 3
      // ba: getfield u30.nqy Ljava/lang/String;
      // bd: invokespecial net/minecraft/network/play/client/C01PacketChatMessage.<init> (Ljava/lang/String;)V
      // c0: invokevirtual p_k.sxi (Lmz2;)V
      // c3: return
   }

   @Override
   public void hgb() {
      super.hgb();
      this.lq7.sxi(new C0APacketAnimation());
   }

   @Override
   public void iau() {
      this.lq7.sxi(new C16PacketClientStatus(C16PacketClientStatus$v78.ggv));
   }

   @Override
   public void vza(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 1f
      // 09: aload 1
      // 0a: invokevirtual l86.nss (Lofh;)Z
      // 0d: ifne 28
      // 10: goto 17
      // 13: invokestatic l86.b (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: goto 1f
      // 1b: invokestatic l86.b (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual l86.i55 ()F
      // 23: fload 2
      // 24: fsub
      // 25: invokevirtual l86.uh3 (F)V
      // 28: return
   }

   @Override
   public void gph() {
      this.lq7.sxi(new C0DPacketCloseWindow(this.daw.h7l));
      this.n9l();
   }

   public void n9l() {
      this.up_.uej((erg)null);
      super.gph();
      this.oh6.z2i((gbe)null);
   }

   public void y11(float param1) {
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
      // 05: iload 2
      // 06: ifeq a0
      // 09: getfield l86._dy Z
      // 0c: ifeq 93
      // 0f: goto 16
      // 12: invokestatic l86.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual l86.i55 ()F
      // 1a: fload 1
      // 1b: fsub
      // 1c: fstore 3
      // 1d: iload 2
      // 1e: ifeq 84
      // 21: fload 3
      // 22: fconst_0
      // 23: fcmpg
      // 24: ifgt 60
      // 27: goto 2e
      // 2a: invokestatic l86.b (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: fload 1
      // 30: invokevirtual l86.uh3 (F)V
      // 33: iload 2
      // 34: ifeq 5c
      // 37: goto 3e
      // 3a: invokestatic l86.b (Loov;)Loov;
      // 3d: athrow
      // 3e: fload 3
      // 3f: fconst_0
      // 40: fcmpg
      // 41: ifge 8f
      // 44: goto 4b
      // 47: invokestatic l86.b (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 0
      // 4d: getfield l86.g9w I
      // 50: bipush 2
      // 51: idiv
      // 52: putfield l86.qqi I
      // 55: goto 5c
      // 58: invokestatic l86.b (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 2
      // 5d: ifne 8f
      // 60: aload 0
      // 61: fload 3
      // 62: putfield l86.g0x F
      // 65: aload 0
      // 66: aload 0
      // 67: invokevirtual l86.i55 ()F
      // 6a: invokevirtual l86.uh3 (F)V
      // 6d: aload 0
      // 6e: aload 0
      // 6f: getfield l86.g9w I
      // 72: putfield l86.qqi I
      // 75: aload 0
      // 76: getstatic ofh.f27 Lofh;
      // 79: fload 3
      // 7a: invokevirtual l86.vza (Lofh;F)V
      // 7d: goto 84
      // 80: invokestatic l86.b (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: aload 0
      // 86: bipush 10
      // 88: dup_x1
      // 89: putfield l86.x_3 I
      // 8c: putfield l86.gx0 I
      // 8f: iload 2
      // 90: ifne a4
      // 93: aload 0
      // 94: fload 1
      // 95: invokevirtual l86.uh3 (F)V
      // 98: aload 0
      // 99: goto a0
      // 9c: invokestatic l86.b (Loov;)Loov;
      // 9f: athrow
      // a0: bipush 1
      // a1: putfield l86._dy Z
      // a4: return
   }

   @Override
   public void qcw(_ss var1, int var2) {
      int var3 = t9d.b();

      _ss var10000;
      label26: {
         try {
            var10000 = var1;
            if (var3 == 0) {
               break label26;
            }

            if (var1 == null) {
               return;
            }
         } catch (oov var5) {
            throw b(var5);
         }

         var10000 = var1;
      }

      try {
         if (var10000.qy7) {
            super.qcw(var1, var2);
         }
      } catch (oov var4) {
         throw b(var4);
      }
   }

   @Override
   public void gow() {
      this.lq7.sxi(new C13PacketPlayerAbilities(this.lls));
   }

   @Override
   public boolean jvr() {
      return true;
   }

   public void asl() {
      this.lq7.sxi(new C0BPacketEntityAction(this, C0BPacketEntityAction$ck7.y56, (int)(this.cwn() * 100.0F)));
   }

   public void ahq() {
      this.lq7.sxi(new C0BPacketEntityAction(this, C0BPacketEntityAction$ck7.lqv));
   }

   public void r0f(String var1) {
      this._cx = var1;
   }

   public String v6e() {
      return this._cx;
   }

   public ik0 hgi() {
      return this.d9k;
   }

   @Override
   public void tog(ekw var1) {
      this.oh6.t43.lcg().obg(var1);
   }

   @Override
   public boolean vwl(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 7
      // 005: aload 0
      // 006: getfield l86.kvx Z
      // 009: iload 7
      // 00b: ifne 019
      // 00e: ifeq 01a
      // 011: goto 018
      // 014: invokestatic l86.b (Loov;)Loov;
      // 017: athrow
      // 018: bipush 0
      // 019: ireturn
      // 01a: new mew
      // 01d: dup
      // 01e: dload 1
      // 01f: dload 3
      // 020: dload 5
      // 022: invokespecial mew.<init> (DDD)V
      // 025: astore 8
      // 027: dload 1
      // 028: aload 8
      // 02a: invokevirtual mew.getX ()I
      // 02d: i2d
      // 02e: dsub
      // 02f: dstore 9
      // 031: dload 5
      // 033: aload 8
      // 035: invokevirtual mew.getZ ()I
      // 038: i2d
      // 039: dsub
      // 03a: dstore 11
      // 03c: aload 0
      // 03d: aload 8
      // 03f: invokespecial l86.b8r (Lmew;)Z
      // 042: iload 7
      // 044: ifne 1d0
      // 047: ifne 1cf
      // 04a: goto 051
      // 04d: invokestatic l86.b (Loov;)Loov;
      // 050: athrow
      // 051: bipush -1
      // 052: istore 13
      // 054: ldc2_w 9999.0
      // 057: dstore 14
      // 059: aload 0
      // 05a: aload 8
      // 05c: invokevirtual mew.y8e ()Lmew;
      // 05f: invokespecial l86.b8r (Lmew;)Z
      // 062: iload 7
      // 064: ifne 09c
      // 067: ifeq 093
      // 06a: goto 071
      // 06d: invokestatic l86.b (Loov;)Loov;
      // 070: athrow
      // 071: dload 9
      // 073: dload 14
      // 075: dcmpg
      // 076: iload 7
      // 078: ifne 09c
      // 07b: goto 082
      // 07e: invokestatic l86.b (Loov;)Loov;
      // 081: athrow
      // 082: ifge 093
      // 085: goto 08c
      // 088: invokestatic l86.b (Loov;)Loov;
      // 08b: athrow
      // 08c: dload 9
      // 08e: dstore 14
      // 090: bipush 0
      // 091: istore 13
      // 093: aload 0
      // 094: aload 8
      // 096: invokevirtual mew.o_8 ()Lmew;
      // 099: invokespecial l86.b8r (Lmew;)Z
      // 09c: iload 7
      // 09e: ifne 0da
      // 0a1: ifeq 0d1
      // 0a4: goto 0ab
      // 0a7: invokestatic l86.b (Loov;)Loov;
      // 0aa: athrow
      // 0ab: dconst_1
      // 0ac: dload 9
      // 0ae: dsub
      // 0af: dload 14
      // 0b1: dcmpg
      // 0b2: iload 7
      // 0b4: ifne 0da
      // 0b7: goto 0be
      // 0ba: invokestatic l86.b (Loov;)Loov;
      // 0bd: athrow
      // 0be: ifge 0d1
      // 0c1: goto 0c8
      // 0c4: invokestatic l86.b (Loov;)Loov;
      // 0c7: athrow
      // 0c8: dconst_1
      // 0c9: dload 9
      // 0cb: dsub
      // 0cc: dstore 14
      // 0ce: bipush 1
      // 0cf: istore 13
      // 0d1: aload 0
      // 0d2: aload 8
      // 0d4: invokevirtual mew.idu ()Lmew;
      // 0d7: invokespecial l86.b8r (Lmew;)Z
      // 0da: iload 7
      // 0dc: ifne 114
      // 0df: ifeq 10b
      // 0e2: goto 0e9
      // 0e5: invokestatic l86.b (Loov;)Loov;
      // 0e8: athrow
      // 0e9: dload 11
      // 0eb: dload 14
      // 0ed: dcmpg
      // 0ee: iload 7
      // 0f0: ifne 114
      // 0f3: goto 0fa
      // 0f6: invokestatic l86.b (Loov;)Loov;
      // 0f9: athrow
      // 0fa: ifge 10b
      // 0fd: goto 104
      // 100: invokestatic l86.b (Loov;)Loov;
      // 103: athrow
      // 104: dload 11
      // 106: dstore 14
      // 108: bipush 4
      // 109: istore 13
      // 10b: aload 0
      // 10c: aload 8
      // 10e: invokevirtual mew.z6x ()Lmew;
      // 111: invokespecial l86.b8r (Lmew;)Z
      // 114: iload 7
      // 116: ifne 131
      // 119: ifeq 149
      // 11c: goto 123
      // 11f: invokestatic l86.b (Loov;)Loov;
      // 122: athrow
      // 123: dconst_1
      // 124: dload 11
      // 126: dsub
      // 127: dload 14
      // 129: dcmpg
      // 12a: goto 131
      // 12d: invokestatic l86.b (Loov;)Loov;
      // 130: athrow
      // 131: iload 7
      // 133: ifne 147
      // 136: ifge 149
      // 139: goto 140
      // 13c: invokestatic l86.b (Loov;)Loov;
      // 13f: athrow
      // 140: dconst_1
      // 141: dload 11
      // 143: dsub
      // 144: dstore 14
      // 146: bipush 5
      // 147: istore 13
      // 149: ldc 0.1
      // 14b: nop
      // 14c: fstore 16
      // 14e: iload 13
      // 150: iload 7
      // 152: ifne 170
      // 155: ifne 16e
      // 158: goto 15f
      // 15b: invokestatic l86.b (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: fload 16
      // 162: fneg
      // 163: f2d
      // 164: putfield l86.icv D
      // 167: goto 16e
      // 16a: invokestatic l86.b (Loov;)Loov;
      // 16d: athrow
      // 16e: iload 13
      // 170: bipush 1
      // 171: iload 7
      // 173: ifne 191
      // 176: if_icmpne 18e
      // 179: goto 180
      // 17c: invokestatic l86.b (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: fload 16
      // 183: f2d
      // 184: putfield l86.icv D
      // 187: goto 18e
      // 18a: invokestatic l86.b (Loov;)Loov;
      // 18d: athrow
      // 18e: iload 13
      // 190: bipush 4
      // 191: iload 7
      // 193: ifne 1be
      // 196: if_icmpne 1af
      // 199: goto 1a0
      // 19c: invokestatic l86.b (Loov;)Loov;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: fload 16
      // 1a3: fneg
      // 1a4: f2d
      // 1a5: putfield l86.bw4 D
      // 1a8: goto 1af
      // 1ab: invokestatic l86.b (Loov;)Loov;
      // 1ae: athrow
      // 1af: iload 13
      // 1b1: iload 7
      // 1b3: ifne 1d0
      // 1b6: bipush 5
      // 1b7: goto 1be
      // 1ba: invokestatic l86.b (Loov;)Loov;
      // 1bd: athrow
      // 1be: if_icmpne 1cf
      // 1c1: aload 0
      // 1c2: fload 16
      // 1c4: f2d
      // 1c5: putfield l86.bw4 D
      // 1c8: goto 1cf
      // 1cb: invokestatic l86.b (Loov;)Loov;
      // 1ce: athrow
      // 1cf: bipush 0
      // 1d0: ireturn
   }

   private boolean b8r(mew param1) {
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
      // 05: getfield l86.oay Lt9d;
      // 08: aload 1
      // 09: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: invokevirtual e0x.y0n ()Z
      // 14: iload 2
      // 15: ifne 3c
      // 18: ifne 4e
      // 1b: goto 22
      // 1e: invokestatic l86.b (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield l86.oay Lt9d;
      // 26: aload 1
      // 27: invokevirtual mew.nuv ()Lmew;
      // 2a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2d: invokeinterface zfz.r_y ()Le0x; 1
      // 32: invokevirtual e0x.y0n ()Z
      // 35: goto 3c
      // 38: invokestatic l86.b (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 2
      // 3d: ifne 4b
      // 40: ifne 4e
      // 43: goto 4a
      // 46: invokestatic l86.b (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   @Override
   public void fqc(boolean var1) {
      int var2 = t9d.c();

      l86 var10000;
      short var10001;
      label22: {
         label21: {
            try {
               super.fqc((boolean)var1);
               var10000 = this;
               var10001 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw b(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 600;
      }

      var10000.yah = var10001;
   }

   public void jnt(float var1, int var2, int var3) {
      this.ey9 = var1;
      this.nk0 = var2;
      this.op5 = var3;
   }

   @Override
   public void a0d(ekw var1) {
      this.oh6.t43.lcg().obg(var1);
   }

   @Override
   public boolean ge4(int var1, String var2) {
      int var3 = t9d.c();

      try {
         if (var3 != 0) {
            return (boolean)var1;
         }

         if (var1 <= 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw b(var4);
      }

      return (boolean)0;
   }

   @Override
   public mew d3d() {
      return new mew(this.o2v + 0.5, this.kfp + 0.5, this.vbd + 0.5);
   }

   @Override
   public void lhu(String var1, float var2, float var3) {
      this.oay.wd_(this.o2v, this.kfp, this.vbd, var1, var2, var3, false);
   }

   @Override
   public boolean de5() {
      return true;
   }

   public boolean _wy() {
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
      // 05: getfield l86.hzp Li2h;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 55
      // 0f: goto 16
      // 12: invokestatic l86.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield l86.hzp Li2h;
      // 1a: goto 21
      // 1d: invokestatic l86.b (Loov;)Loov;
      // 20: athrow
      // 21: instanceof zfo
      // 24: iload 1
      // 25: ifne 43
      // 28: ifeq 55
      // 2b: goto 32
      // 2e: invokestatic l86.b (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield l86.hzp Li2h;
      // 36: checkcast zfo
      // 39: invokevirtual zfo.cbz ()Z
      // 3c: goto 43
      // 3f: invokestatic l86.b (Loov;)Loov;
      // 42: athrow
      // 43: iload 1
      // 44: ifne 52
      // 47: ifeq 55
      // 4a: goto 51
      // 4d: invokestatic l86.b (Loov;)Loov;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   public float cwn() {
      return this.wn1;
   }

   @Override
   public void v6x(TileEntitySign var1) {
      this.oh6.z2i(new ptg(var1));
   }

   @Override
   public void mmg(k6s var1) {
      this.oh6.z2i(new toy(var1));
   }

   @Override
   public void rlk(erg var1) {
      u7m var2 = var1.gn1();

      try {
         if (var2 == xbr.u0_) {
            this.oh6.z2i(new y3n(this, var1, true));
         }
      } catch (oov var3) {
         throw b(var3);
      }
   }

   @Override
   public void a_o(rsi param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic l86.d J
      // 003: ldc2_w 90342948575994
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: iload 4
      // 010: ifne 028
      // 013: instanceof _83
      // 016: ifeq 033
      // 019: goto 020
      // 01c: invokestatic l86.b (Loov;)Loov;
      // 01f: athrow
      // 020: aload 1
      // 021: goto 028
      // 024: invokestatic l86.b (Loov;)Loov;
      // 027: athrow
      // 028: checkcast _83
      // 02b: invokeinterface _83.q4l ()Ljava/lang/String; 1
      // 030: goto 041
      // 033: sipush 11661
      // 036: ldc2_w 5811703786077198563
      // 039: lload 2
      // 03a: lxor
      // 03b: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: nop
      // 041: astore 5
      // 043: sipush 18979
      // 046: ldc2_w 2763892337161666376
      // 049: lload 2
      // 04a: lxor
      // 04b: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: nop
      // 051: aload 5
      // 053: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 056: iload 4
      // 058: ifne 09e
      // 05b: ifeq 084
      // 05e: goto 065
      // 061: invokestatic l86.b (Loov;)Loov;
      // 064: athrow
      // 065: aload 0
      // 066: getfield l86.oh6 Lc05;
      // 069: new skj
      // 06c: dup
      // 06d: aload 0
      // 06e: getfield l86.up_ Ljnq;
      // 071: aload 1
      // 072: invokespecial skj.<init> (Lrsi;Lrsi;)V
      // 075: invokevirtual c05.z2i (Lgbe;)V
      // 078: iload 4
      // 07a: ifeq 223
      // 07d: goto 084
      // 080: invokestatic l86.b (Loov;)Loov;
      // 083: athrow
      // 084: sipush 28844
      // 087: ldc2_w 4566738788282484168
      // 08a: lload 2
      // 08b: lxor
      // 08c: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: nop
      // 092: aload 5
      // 094: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 097: goto 09e
      // 09a: invokestatic l86.b (Loov;)Loov;
      // 09d: athrow
      // 09e: iload 4
      // 0a0: ifne 0e6
      // 0a3: ifeq 0cc
      // 0a6: goto 0ad
      // 0a9: invokestatic l86.b (Loov;)Loov;
      // 0ac: athrow
      // 0ad: aload 0
      // 0ae: getfield l86.oh6 Lc05;
      // 0b1: new vj3
      // 0b4: dup
      // 0b5: aload 0
      // 0b6: getfield l86.up_ Ljnq;
      // 0b9: aload 1
      // 0ba: invokespecial vj3.<init> (Ljnq;Lrsi;)V
      // 0bd: invokevirtual c05.z2i (Lgbe;)V
      // 0c0: iload 4
      // 0c2: ifeq 223
      // 0c5: goto 0cc
      // 0c8: invokestatic l86.b (Loov;)Loov;
      // 0cb: athrow
      // 0cc: sipush 184
      // 0cf: ldc2_w 3317823513844889055
      // 0d2: lload 2
      // 0d3: lxor
      // 0d4: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: aload 5
      // 0dc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0df: goto 0e6
      // 0e2: invokestatic l86.b (Loov;)Loov;
      // 0e5: athrow
      // 0e6: iload 4
      // 0e8: ifne 12e
      // 0eb: ifeq 114
      // 0ee: goto 0f5
      // 0f1: invokestatic l86.b (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield l86.oh6 Lc05;
      // 0f9: new saq
      // 0fc: dup
      // 0fd: aload 0
      // 0fe: getfield l86.up_ Ljnq;
      // 101: aload 1
      // 102: invokespecial saq.<init> (Ljnq;Lrsi;)V
      // 105: invokevirtual c05.z2i (Lgbe;)V
      // 108: iload 4
      // 10a: ifeq 223
      // 10d: goto 114
      // 110: invokestatic l86.b (Loov;)Loov;
      // 113: athrow
      // 114: sipush 3179
      // 117: ldc2_w 8539277195939395844
      // 11a: lload 2
      // 11b: lxor
      // 11c: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: nop
      // 122: aload 5
      // 124: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 127: goto 12e
      // 12a: invokestatic l86.b (Loov;)Loov;
      // 12d: athrow
      // 12e: iload 4
      // 130: ifne 176
      // 133: ifeq 15c
      // 136: goto 13d
      // 139: invokestatic l86.b (Loov;)Loov;
      // 13c: athrow
      // 13d: aload 0
      // 13e: getfield l86.oh6 Lc05;
      // 141: new cmk
      // 144: dup
      // 145: aload 0
      // 146: getfield l86.up_ Ljnq;
      // 149: aload 1
      // 14a: invokespecial cmk.<init> (Ljnq;Lrsi;)V
      // 14d: invokevirtual c05.z2i (Lgbe;)V
      // 150: iload 4
      // 152: ifeq 223
      // 155: goto 15c
      // 158: invokestatic l86.b (Loov;)Loov;
      // 15b: athrow
      // 15c: sipush 18097
      // 15f: ldc2_w 2143493126482228185
      // 162: lload 2
      // 163: lxor
      // 164: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: nop
      // 16a: aload 5
      // 16c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16f: goto 176
      // 172: invokestatic l86.b (Loov;)Loov;
      // 175: athrow
      // 176: iload 4
      // 178: ifne 1be
      // 17b: ifeq 1a4
      // 17e: goto 185
      // 181: invokestatic l86.b (Loov;)Loov;
      // 184: athrow
      // 185: aload 0
      // 186: getfield l86.oh6 Lc05;
      // 189: new nrk
      // 18c: dup
      // 18d: aload 0
      // 18e: getfield l86.up_ Ljnq;
      // 191: aload 1
      // 192: invokespecial nrk.<init> (Ljnq;Lrsi;)V
      // 195: invokevirtual c05.z2i (Lgbe;)V
      // 198: iload 4
      // 19a: ifeq 223
      // 19d: goto 1a4
      // 1a0: invokestatic l86.b (Loov;)Loov;
      // 1a3: athrow
      // 1a4: sipush 18702
      // 1a7: ldc2_w 8100789772437748834
      // 1aa: lload 2
      // 1ab: lxor
      // 1ac: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: nop
      // 1b2: aload 5
      // 1b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b7: goto 1be
      // 1ba: invokestatic l86.b (Loov;)Loov;
      // 1bd: athrow
      // 1be: iload 4
      // 1c0: ifne 1e7
      // 1c3: ifne 209
      // 1c6: goto 1cd
      // 1c9: invokestatic l86.b (Loov;)Loov;
      // 1cc: athrow
      // 1cd: sipush 27188
      // 1d0: ldc2_w 6669277066501644126
      // 1d3: lload 2
      // 1d4: lxor
      // 1d5: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: nop
      // 1db: aload 5
      // 1dd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e0: goto 1e7
      // 1e3: invokestatic l86.b (Loov;)Loov;
      // 1e6: athrow
      // 1e7: ifne 209
      // 1ea: aload 0
      // 1eb: getfield l86.oh6 Lc05;
      // 1ee: new skj
      // 1f1: dup
      // 1f2: aload 0
      // 1f3: getfield l86.up_ Ljnq;
      // 1f6: aload 1
      // 1f7: invokespecial skj.<init> (Lrsi;Lrsi;)V
      // 1fa: invokevirtual c05.z2i (Lgbe;)V
      // 1fd: iload 4
      // 1ff: ifeq 223
      // 202: goto 209
      // 205: invokestatic l86.b (Loov;)Loov;
      // 208: athrow
      // 209: aload 0
      // 20a: getfield l86.oh6 Lc05;
      // 20d: new ra2
      // 210: dup
      // 211: aload 0
      // 212: getfield l86.up_ Ljnq;
      // 215: aload 1
      // 216: invokespecial ra2.<init> (Ljnq;Lrsi;)V
      // 219: invokevirtual c05.z2i (Lgbe;)V
      // 21c: goto 223
      // 21f: invokestatic l86.b (Loov;)Loov;
      // 222: athrow
      // 223: return
   }

   @Override
   public void b_m(zfo var1, rsi var2) {
      this.oh6.z2i(new ga5(this.up_, var2, var1));
   }

   @Override
   public void xz_(_83 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic l86.d J
      // 03: ldc2_w 2328713224972
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokeinterface _83.q4l ()Ljava/lang/String; 1
      // 13: astore 5
      // 15: sipush 32527
      // 18: ldc2_w 3937998581724918684
      // 1b: lload 2
      // 1c: lxor
      // 1d: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: nop
      // 23: aload 5
      // 25: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28: iload 4
      // 2a: ifne 73
      // 2d: ifeq 59
      // 30: goto 37
      // 33: invokestatic l86.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield l86.oh6 Lc05;
      // 3b: new th8
      // 3e: dup
      // 3f: aload 0
      // 40: getfield l86.up_ Ljnq;
      // 43: aload 0
      // 44: getfield l86.oay Lt9d;
      // 47: invokespecial th8.<init> (Ljnq;Lt9d;)V
      // 4a: invokevirtual c05.z2i (Lgbe;)V
      // 4d: iload 4
      // 4f: ifeq df
      // 52: goto 59
      // 55: invokestatic l86.b (Loov;)Loov;
      // 58: athrow
      // 59: sipush 30299
      // 5c: ldc2_w 5339838631563475659
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: aload 5
      // 69: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6c: goto 73
      // 6f: invokestatic l86.b (Loov;)Loov;
      // 72: athrow
      // 73: iload 4
      // 75: ifne bf
      // 78: ifeq a5
      // 7b: goto 82
      // 7e: invokestatic l86.b (Loov;)Loov;
      // 81: athrow
      // 82: aload 0
      // 83: getfield l86.oh6 Lc05;
      // 86: new zb0
      // 89: dup
      // 8a: aload 0
      // 8b: getfield l86.up_ Ljnq;
      // 8e: aload 0
      // 8f: getfield l86.oay Lt9d;
      // 92: aload 1
      // 93: invokespecial zb0.<init> (Ljnq;Lt9d;Lj9i;)V
      // 96: invokevirtual c05.z2i (Lgbe;)V
      // 99: iload 4
      // 9b: ifeq df
      // 9e: goto a5
      // a1: invokestatic l86.b (Loov;)Loov;
      // a4: athrow
      // a5: sipush 18751
      // a8: ldc2_w 6185585268070712736
      // ab: lload 2
      // ac: lxor
      // ad: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: nop
      // b3: aload 5
      // b5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // b8: goto bf
      // bb: invokestatic l86.b (Loov;)Loov;
      // be: athrow
      // bf: ifeq df
      // c2: aload 0
      // c3: getfield l86.oh6 Lc05;
      // c6: new szw
      // c9: dup
      // ca: aload 0
      // cb: getfield l86.up_ Ljnq;
      // ce: aload 0
      // cf: getfield l86.oay Lt9d;
      // d2: invokespecial szw.<init> (Ljnq;Lt9d;)V
      // d5: invokevirtual c05.z2i (Lgbe;)V
      // d8: goto df
      // db: invokestatic l86.b (Loov;)Loov;
      // de: athrow
      // df: return
   }

   @Override
   public void vhi(a7q var1) {
      this.oh6.z2i(new qyg(this.up_, var1, this.oay));
   }

   @Override
   public void glv(i2h var1) {
      this.oh6.i4p.hro(var1, w_0.fzw);
   }

   @Override
   public void eej(i2h var1) {
      this.oh6.i4p.hro(var1, w_0.k6p);
   }

   @Override
   public boolean hzv() {
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
      // 05: getfield l86.g9g Lboa;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 27
      // 0f: goto 16
      // 12: invokestatic l86.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield l86.g9g Lboa;
      // 1a: goto 21
      // 1d: invokestatic l86.b (Loov;)Loov;
      // 20: athrow
      // 21: getfield boa.k5u Z
      // 24: goto 28
      // 27: bipush 0
      // 28: istore 2
      // 29: iload 2
      // 2a: iload 1
      // 2b: ifne 43
      // 2e: ifeq 55
      // 31: goto 38
      // 34: invokestatic l86.b (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield l86.asp Z
      // 3c: goto 43
      // 3f: invokestatic l86.b (Loov;)Loov;
      // 42: athrow
      // 43: iload 1
      // 44: ifne 52
      // 47: ifne 55
      // 4a: goto 51
      // 4d: invokestatic l86.b (Loov;)Loov;
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   @Override
   public void nd9() {
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
      // 05: invokespecial x0l.nd9 ()V
      // 08: aload 0
      // 09: iload 1
      // 0a: ifeq 6c
      // 0d: invokevirtual l86.zc_ ()Z
      // 10: ifeq 84
      // 13: goto 1a
      // 16: invokestatic l86.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 0
      // 1c: getfield l86.g9g Lboa;
      // 1f: getfield boa.lrp F
      // 22: putfield l86.z66 F
      // 25: aload 0
      // 26: aload 0
      // 27: getfield l86.g9g Lboa;
      // 2a: getfield boa._mw F
      // 2d: putfield l86.ooc F
      // 30: aload 0
      // 31: aload 0
      // 32: getfield l86.g9g Lboa;
      // 35: getfield boa.s0a Z
      // 38: putfield l86.e1f Z
      // 3b: aload 0
      // 3c: aload 0
      // 3d: getfield l86.yfu F
      // 40: putfield l86.txh F
      // 43: aload 0
      // 44: aload 0
      // 45: getfield l86.dd5 F
      // 48: putfield l86.opd F
      // 4b: aload 0
      // 4c: aload 0
      // 4d: getfield l86.dd5 F
      // 50: f2d
      // 51: aload 0
      // 52: getfield l86.y2i F
      // 55: aload 0
      // 56: getfield l86.dd5 F
      // 59: fsub
      // 5a: f2d
      // 5b: ldc2_w 0.5
      // 5e: dmul
      // 5f: dadd
      // 60: d2f
      // 61: putfield l86.dd5 F
      // 64: aload 0
      // 65: goto 6c
      // 68: invokestatic l86.b (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield l86.yfu F
      // 70: f2d
      // 71: aload 0
      // 72: getfield l86.x5k F
      // 75: aload 0
      // 76: getfield l86.yfu F
      // 79: fsub
      // 7a: f2d
      // 7b: ldc2_w 0.5
      // 7e: dmul
      // 7f: dadd
      // 80: d2f
      // 81: putfield l86.yfu F
      // 84: return
   }

   public boolean zc_() {
      try {
         if (this.oh6.nsd() == this) {
            return true;
         }
      } catch (oov var1) {
         throw b(var1);
      }

      return false;
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic l86.d J
      // 003: ldc2_w 80530257148439
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield l86.yah I
      // 010: iload 3
      // 011: ifne 051
      // 014: ifle 04d
      // 017: goto 01e
      // 01a: invokestatic l86.b (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: dup
      // 020: getfield l86.yah I
      // 023: bipush 1
      // 024: isub
      // 025: putfield l86.yah I
      // 028: aload 0
      // 029: getfield l86.yah I
      // 02c: iload 3
      // 02d: ifne 051
      // 030: goto 037
      // 033: invokestatic l86.b (Loov;)Loov;
      // 036: athrow
      // 037: ifne 04d
      // 03a: goto 041
      // 03d: invokestatic l86.b (Loov;)Loov;
      // 040: athrow
      // 041: aload 0
      // 042: bipush 0
      // 043: invokevirtual l86.fqc (Z)V
      // 046: goto 04d
      // 049: invokestatic l86.b (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield l86.kzu I
      // 051: iload 3
      // 052: ifne 07c
      // 055: ifle 070
      // 058: goto 05f
      // 05b: invokestatic l86.b (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: dup
      // 061: getfield l86.kzu I
      // 064: bipush 1
      // 065: isub
      // 066: putfield l86.kzu I
      // 069: goto 070
      // 06c: invokestatic l86.b (Loov;)Loov;
      // 06f: athrow
      // 070: aload 0
      // 071: aload 0
      // 072: getfield l86.u3f F
      // 075: putfield l86.u57 F
      // 078: aload 0
      // 079: getfield l86.jjl Z
      // 07c: iload 3
      // 07d: ifne 181
      // 080: ifeq 173
      // 083: goto 08a
      // 086: invokestatic l86.b (Loov;)Loov;
      // 089: athrow
      // 08a: aload 0
      // 08b: iload 3
      // 08c: ifne 0f3
      // 08f: goto 096
      // 092: invokestatic l86.b (Loov;)Loov;
      // 095: athrow
      // 096: getfield l86.oh6 Lc05;
      // 099: getfield c05.u0y Lgbe;
      // 09c: ifnull 0f2
      // 09f: goto 0a6
      // 0a2: invokestatic l86.b (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getfield l86.oh6 Lc05;
      // 0aa: getfield c05.u0y Lgbe;
      // 0ad: invokevirtual gbe.a99 ()Z
      // 0b0: iload 3
      // 0b1: ifne 0f8
      // 0b4: goto 0bb
      // 0b7: invokestatic l86.b (Loov;)Loov;
      // 0ba: athrow
      // 0bb: ifne 0f2
      // 0be: goto 0c5
      // 0c1: invokestatic l86.b (Loov;)Loov;
      // 0c4: athrow
      // 0c5: getstatic kgt.edy Lz_e;
      // 0c8: invokevirtual z_e.klu ()Z
      // 0cb: iload 3
      // 0cc: ifne 0f8
      // 0cf: goto 0d6
      // 0d2: invokestatic l86.b (Loov;)Loov;
      // 0d5: athrow
      // 0d6: ifne 0f2
      // 0d9: goto 0e0
      // 0dc: invokestatic l86.b (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: getfield l86.oh6 Lc05;
      // 0e4: aconst_null
      // 0e5: checkcast gbe
      // 0e8: invokevirtual c05.z2i (Lgbe;)V
      // 0eb: goto 0f2
      // 0ee: invokestatic l86.b (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield l86.u3f F
      // 0f6: fconst_0
      // 0f7: fcmpl
      // 0f8: iload 3
      // 0f9: ifne 15b
      // 0fc: ifne 13e
      // 0ff: goto 106
      // 102: invokestatic l86.b (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield l86.oh6 Lc05;
      // 10a: invokevirtual c05.yp9 ()Ldbu;
      // 10d: new gdz
      // 110: dup
      // 111: sipush 3809
      // 114: ldc2_w 3932150800397163361
      // 117: lload 1
      // 118: lxor
      // 119: invokedynamic r (IJ)Ljava/lang/String; bsm=l86.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: nop
      // 11f: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 122: aload 0
      // 123: getfield l86.z2d Ljava/util/Random;
      // 126: invokevirtual java/util/Random.nextFloat ()F
      // 129: ldc 0.4
      // 12b: nop
      // 12c: fmul
      // 12d: ldc 0.8
      // 12f: nop
      // 130: fadd
      // 131: invokestatic vs1._e_ (Lgdz;F)Lvs1;
      // 134: invokevirtual dbu.mak (Ljp4;)V
      // 137: goto 13e
      // 13a: invokestatic l86.b (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: dup
      // 140: getfield l86.u3f F
      // 143: ldc 0.0125
      // 145: nop
      // 146: fadd
      // 147: putfield l86.u3f F
      // 14a: aload 0
      // 14b: iload 3
      // 14c: ifne 16b
      // 14f: getfield l86.u3f F
      // 152: fconst_1
      // 153: fcmpl
      // 154: goto 15b
      // 157: invokestatic l86.b (Loov;)Loov;
      // 15a: athrow
      // 15b: iflt 16a
      // 15e: aload 0
      // 15f: fconst_1
      // 160: putfield l86.u3f F
      // 163: goto 16a
      // 166: invokestatic l86.b (Loov;)Loov;
      // 169: athrow
      // 16a: aload 0
      // 16b: bipush 0
      // 16c: putfield l86.jjl Z
      // 16f: iload 3
      // 170: ifeq 235
      // 173: aload 0
      // 174: getstatic mcs.bla Lmcs;
      // 177: invokevirtual l86.cab (Lmcs;)Z
      // 17a: goto 181
      // 17d: invokestatic l86.b (Loov;)Loov;
      // 180: athrow
      // 181: iload 3
      // 182: ifne 1f4
      // 185: ifeq 1e7
      // 188: goto 18f
      // 18b: invokestatic l86.b (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 0
      // 190: getstatic mcs.bla Lmcs;
      // 193: invokevirtual l86.dhd (Lmcs;)Lsdj;
      // 196: invokevirtual sdj.ltp ()I
      // 199: iload 3
      // 19a: ifne 1f4
      // 19d: goto 1a4
      // 1a0: invokestatic l86.b (Loov;)Loov;
      // 1a3: athrow
      // 1a4: bipush 60
      // 1a6: if_icmple 1e7
      // 1a9: goto 1b0
      // 1ac: invokestatic l86.b (Loov;)Loov;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: dup
      // 1b2: getfield l86.u3f F
      // 1b5: ldc 0.006666667
      // 1b7: nop
      // 1b8: fadd
      // 1b9: putfield l86.u3f F
      // 1bc: aload 0
      // 1bd: getfield l86.u3f F
      // 1c0: fconst_1
      // 1c1: fcmpl
      // 1c2: iload 3
      // 1c3: ifne 239
      // 1c6: goto 1cd
      // 1c9: invokestatic l86.b (Loov;)Loov;
      // 1cc: athrow
      // 1cd: ifle 235
      // 1d0: goto 1d7
      // 1d3: invokestatic l86.b (Loov;)Loov;
      // 1d6: athrow
      // 1d7: aload 0
      // 1d8: fconst_1
      // 1d9: putfield l86.u3f F
      // 1dc: iload 3
      // 1dd: ifeq 235
      // 1e0: goto 1e7
      // 1e3: invokestatic l86.b (Loov;)Loov;
      // 1e6: athrow
      // 1e7: aload 0
      // 1e8: getfield l86.u3f F
      // 1eb: fconst_0
      // 1ec: fcmpl
      // 1ed: goto 1f4
      // 1f0: invokestatic l86.b (Loov;)Loov;
      // 1f3: athrow
      // 1f4: iload 3
      // 1f5: ifne 21b
      // 1f8: ifle 215
      // 1fb: goto 202
      // 1fe: invokestatic l86.b (Loov;)Loov;
      // 201: athrow
      // 202: aload 0
      // 203: dup
      // 204: getfield l86.u3f F
      // 207: ldc 0.05
      // 209: nop
      // 20a: fsub
      // 20b: putfield l86.u3f F
      // 20e: goto 215
      // 211: invokestatic l86.b (Loov;)Loov;
      // 214: athrow
      // 215: aload 0
      // 216: getfield l86.u3f F
      // 219: fconst_0
      // 21a: fcmpg
      // 21b: iload 3
      // 21c: ifne 239
      // 21f: ifge 235
      // 222: goto 229
      // 225: invokestatic l86.b (Loov;)Loov;
      // 228: athrow
      // 229: aload 0
      // 22a: fconst_0
      // 22b: putfield l86.u3f F
      // 22e: goto 235
      // 231: invokestatic l86.b (Loov;)Loov;
      // 234: athrow
      // 235: aload 0
      // 236: getfield l86.rr6 I
      // 239: iload 3
      // 23a: ifne 25f
      // 23d: ifle 258
      // 240: goto 247
      // 243: invokestatic l86.b (Loov;)Loov;
      // 246: athrow
      // 247: aload 0
      // 248: dup
      // 249: getfield l86.rr6 I
      // 24c: bipush 1
      // 24d: isub
      // 24e: putfield l86.rr6 I
      // 251: goto 258
      // 254: invokestatic l86.b (Loov;)Loov;
      // 257: athrow
      // 258: aload 0
      // 259: getfield l86.g9g Lboa;
      // 25c: getfield boa.s0a Z
      // 25f: istore 4
      // 261: aload 0
      // 262: getfield l86.g9g Lboa;
      // 265: getfield boa.k5u Z
      // 268: istore 5
      // 26a: ldc 0.8
      // 26c: nop
      // 26d: fstore 6
      // 26f: aload 0
      // 270: getfield l86.g9g Lboa;
      // 273: getfield boa._mw F
      // 276: fload 6
      // 278: fcmpl
      // 279: iload 3
      // 27a: ifne 288
      // 27d: iflt 28b
      // 280: goto 287
      // 283: invokestatic l86.b (Loov;)Loov;
      // 286: athrow
      // 287: bipush 1
      // 288: goto 28c
      // 28b: bipush 0
      // 28c: istore 7
      // 28e: aload 0
      // 28f: getfield l86.g9g Lboa;
      // 292: invokevirtual boa.s66 ()V
      // 295: aload 0
      // 296: invokevirtual l86.kqa ()Z
      // 299: iload 3
      // 29a: ifne 3dc
      // 29d: ifeq 320
      // 2a0: goto 2a7
      // 2a3: invokestatic l86.b (Loov;)Loov;
      // 2a6: athrow
      // 2a7: aload 0
      // 2a8: invokevirtual l86.i0e ()Z
      // 2ab: iload 3
      // 2ac: ifne 3dc
      // 2af: goto 2b6
      // 2b2: invokestatic l86.b (Loov;)Loov;
      // 2b5: athrow
      // 2b6: ifne 320
      // 2b9: goto 2c0
      // 2bc: invokestatic l86.b (Loov;)Loov;
      // 2bf: athrow
      // 2c0: getstatic kgt.rtu Ljqz;
      // 2c3: invokevirtual jqz.klu ()Z
      // 2c6: iload 3
      // 2c7: ifne 3dc
      // 2ca: goto 2d1
      // 2cd: invokestatic l86.b (Loov;)Loov;
      // 2d0: athrow
      // 2d1: ifne 320
      // 2d4: goto 2db
      // 2d7: invokestatic l86.b (Loov;)Loov;
      // 2da: athrow
      // 2db: aload 0
      // 2dc: getfield l86.g9g Lboa;
      // 2df: dup
      // 2e0: getfield boa.lrp F
      // 2e3: ldc 0.2
      // 2e5: nop
      // 2e6: fmul
      // 2e7: putfield boa.lrp F
      // 2ea: aload 0
      // 2eb: getfield l86.g9g Lboa;
      // 2ee: dup
      // 2ef: getfield boa._mw F
      // 2f2: ldc 0.2
      // 2f4: nop
      // 2f5: fmul
      // 2f6: putfield boa._mw F
      // 2f9: getstatic kgt.hbd Lj7s;
      // 2fc: invokevirtual j7s.klu ()Z
      // 2ff: iload 3
      // 300: ifne 3dc
      // 303: goto 30a
      // 306: invokestatic l86.b (Loov;)Loov;
      // 309: athrow
      // 30a: ifne 320
      // 30d: goto 314
      // 310: invokestatic l86.b (Loov;)Loov;
      // 313: athrow
      // 314: aload 0
      // 315: bipush 0
      // 316: putfield l86.kzu I
      // 319: goto 320
      // 31c: invokestatic l86.b (Loov;)Loov;
      // 31f: athrow
      // 320: aload 0
      // 321: aload 0
      // 322: getfield l86.o2v D
      // 325: aload 0
      // 326: getfield l86.uo6 F
      // 329: f2d
      // 32a: ldc2_w 0.35
      // 32d: dmul
      // 32e: dsub
      // 32f: aload 0
      // 330: invokevirtual l86.aaw ()Lnh4;
      // 333: getfield nh4.bx_ D
      // 336: ldc2_w 0.5
      // 339: dadd
      // 33a: aload 0
      // 33b: getfield l86.vbd D
      // 33e: aload 0
      // 33f: getfield l86.uo6 F
      // 342: f2d
      // 343: ldc2_w 0.35
      // 346: dmul
      // 347: dadd
      // 348: invokevirtual l86.vwl (DDD)Z
      // 34b: pop
      // 34c: aload 0
      // 34d: aload 0
      // 34e: getfield l86.o2v D
      // 351: aload 0
      // 352: getfield l86.uo6 F
      // 355: f2d
      // 356: ldc2_w 0.35
      // 359: dmul
      // 35a: dsub
      // 35b: aload 0
      // 35c: invokevirtual l86.aaw ()Lnh4;
      // 35f: getfield nh4.bx_ D
      // 362: ldc2_w 0.5
      // 365: dadd
      // 366: aload 0
      // 367: getfield l86.vbd D
      // 36a: aload 0
      // 36b: getfield l86.uo6 F
      // 36e: f2d
      // 36f: ldc2_w 0.35
      // 372: dmul
      // 373: dsub
      // 374: invokevirtual l86.vwl (DDD)Z
      // 377: pop
      // 378: aload 0
      // 379: aload 0
      // 37a: getfield l86.o2v D
      // 37d: aload 0
      // 37e: getfield l86.uo6 F
      // 381: f2d
      // 382: ldc2_w 0.35
      // 385: dmul
      // 386: dadd
      // 387: aload 0
      // 388: invokevirtual l86.aaw ()Lnh4;
      // 38b: getfield nh4.bx_ D
      // 38e: ldc2_w 0.5
      // 391: dadd
      // 392: aload 0
      // 393: getfield l86.vbd D
      // 396: aload 0
      // 397: getfield l86.uo6 F
      // 39a: f2d
      // 39b: ldc2_w 0.35
      // 39e: dmul
      // 39f: dsub
      // 3a0: invokevirtual l86.vwl (DDD)Z
      // 3a3: pop
      // 3a4: aload 0
      // 3a5: aload 0
      // 3a6: getfield l86.o2v D
      // 3a9: aload 0
      // 3aa: getfield l86.uo6 F
      // 3ad: f2d
      // 3ae: ldc2_w 0.35
      // 3b1: dmul
      // 3b2: dadd
      // 3b3: aload 0
      // 3b4: invokevirtual l86.aaw ()Lnh4;
      // 3b7: getfield nh4.bx_ D
      // 3ba: ldc2_w 0.5
      // 3bd: dadd
      // 3be: aload 0
      // 3bf: getfield l86.vbd D
      // 3c2: aload 0
      // 3c3: getfield l86.uo6 F
      // 3c6: f2d
      // 3c7: ldc2_w 0.35
      // 3ca: dmul
      // 3cb: dadd
      // 3cc: invokevirtual l86.vwl (DDD)Z
      // 3cf: pop
      // 3d0: aload 0
      // 3d1: invokevirtual l86.wvq ()Lwkk;
      // 3d4: invokevirtual wkk.f1i ()I
      // 3d7: i2f
      // 3d8: ldc 6.0
      // 3da: nop
      // 3db: fcmpl
      // 3dc: iload 3
      // 3dd: ifne 407
      // 3e0: ifgt 406
      // 3e3: goto 3ea
      // 3e6: invokestatic l86.b (Loov;)Loov;
      // 3e9: athrow
      // 3ea: aload 0
      // 3eb: getfield l86.lls Lpj2;
      // 3ee: getfield pj2.wvp Z
      // 3f1: iload 3
      // 3f2: ifne 407
      // 3f5: goto 3fc
      // 3f8: invokestatic l86.b (Loov;)Loov;
      // 3fb: athrow
      // 3fc: ifeq 40a
      // 3ff: goto 406
      // 402: invokestatic l86.b (Loov;)Loov;
      // 405: athrow
      // 406: bipush 1
      // 407: goto 40b
      // 40a: bipush 0
      // 40b: istore 8
      // 40d: aload 0
      // 40e: getfield l86.lfk Z
      // 411: iload 3
      // 412: ifne 52d
      // 415: ifeq 529
      // 418: goto 41f
      // 41b: invokestatic l86.b (Loov;)Loov;
      // 41e: athrow
      // 41f: iload 5
      // 421: iload 3
      // 422: ifne 52d
      // 425: goto 42c
      // 428: invokestatic l86.b (Loov;)Loov;
      // 42b: athrow
      // 42c: ifne 529
      // 42f: goto 436
      // 432: invokestatic l86.b (Loov;)Loov;
      // 435: athrow
      // 436: iload 7
      // 438: iload 3
      // 439: ifne 52d
      // 43c: goto 443
      // 43f: invokestatic l86.b (Loov;)Loov;
      // 442: athrow
      // 443: ifne 529
      // 446: goto 44d
      // 449: invokestatic l86.b (Loov;)Loov;
      // 44c: athrow
      // 44d: aload 0
      // 44e: getfield l86.g9g Lboa;
      // 451: getfield boa._mw F
      // 454: fload 6
      // 456: fcmpl
      // 457: iload 3
      // 458: ifne 52d
      // 45b: goto 462
      // 45e: invokestatic l86.b (Loov;)Loov;
      // 461: athrow
      // 462: iflt 529
      // 465: goto 46c
      // 468: invokestatic l86.b (Loov;)Loov;
      // 46b: athrow
      // 46c: aload 0
      // 46d: invokevirtual l86.ew1 ()Z
      // 470: iload 3
      // 471: ifne 52d
      // 474: goto 47b
      // 477: invokestatic l86.b (Loov;)Loov;
      // 47a: athrow
      // 47b: ifne 529
      // 47e: goto 485
      // 481: invokestatic l86.b (Loov;)Loov;
      // 484: athrow
      // 485: iload 8
      // 487: iload 3
      // 488: ifne 52d
      // 48b: goto 492
      // 48e: invokestatic l86.b (Loov;)Loov;
      // 491: athrow
      // 492: ifeq 529
      // 495: goto 49c
      // 498: invokestatic l86.b (Loov;)Loov;
      // 49b: athrow
      // 49c: aload 0
      // 49d: invokevirtual l86.kqa ()Z
      // 4a0: iload 3
      // 4a1: ifne 52d
      // 4a4: goto 4ab
      // 4a7: invokestatic l86.b (Loov;)Loov;
      // 4aa: athrow
      // 4ab: ifne 529
      // 4ae: goto 4b5
      // 4b1: invokestatic l86.b (Loov;)Loov;
      // 4b4: athrow
      // 4b5: aload 0
      // 4b6: getstatic mcs.s19 Lmcs;
      // 4b9: invokevirtual l86.cab (Lmcs;)Z
      // 4bc: iload 3
      // 4bd: ifne 52d
      // 4c0: goto 4c7
      // 4c3: invokestatic l86.b (Loov;)Loov;
      // 4c6: athrow
      // 4c7: ifne 529
      // 4ca: goto 4d1
      // 4cd: invokestatic l86.b (Loov;)Loov;
      // 4d0: athrow
      // 4d1: aload 0
      // 4d2: iload 3
      // 4d3: ifne 525
      // 4d6: goto 4dd
      // 4d9: invokestatic l86.b (Loov;)Loov;
      // 4dc: athrow
      // 4dd: getfield l86.kzu I
      // 4e0: ifgt 51d
      // 4e3: goto 4ea
      // 4e6: invokestatic l86.b (Loov;)Loov;
      // 4e9: athrow
      // 4ea: aload 0
      // 4eb: iload 3
      // 4ec: ifne 525
      // 4ef: goto 4f6
      // 4f2: invokestatic l86.b (Loov;)Loov;
      // 4f5: athrow
      // 4f6: getfield l86.oh6 Lc05;
      // 4f9: getfield c05.oxn Lmoh;
      // 4fc: getfield moh.om6 Lm7l;
      // 4ff: invokevirtual m7l.t9w ()Z
      // 502: ifne 51d
      // 505: goto 50c
      // 508: invokestatic l86.b (Loov;)Loov;
      // 50b: athrow
      // 50c: aload 0
      // 50d: bipush 7
      // 50f: putfield l86.kzu I
      // 512: iload 3
      // 513: ifeq 529
      // 516: goto 51d
      // 519: invokestatic l86.b (Loov;)Loov;
      // 51c: athrow
      // 51d: aload 0
      // 51e: goto 525
      // 521: invokestatic l86.b (Loov;)Loov;
      // 524: athrow
      // 525: bipush 1
      // 526: invokevirtual l86.fqc (Z)V
      // 529: aload 0
      // 52a: invokevirtual l86.ew1 ()Z
      // 52d: iload 3
      // 52e: ifne 5d8
      // 531: ifne 5d4
      // 534: goto 53b
      // 537: invokestatic l86.b (Loov;)Loov;
      // 53a: athrow
      // 53b: aload 0
      // 53c: getfield l86.g9g Lboa;
      // 53f: getfield boa._mw F
      // 542: fload 6
      // 544: fcmpl
      // 545: iload 3
      // 546: ifne 5d8
      // 549: goto 550
      // 54c: invokestatic l86.b (Loov;)Loov;
      // 54f: athrow
      // 550: iflt 5d4
      // 553: goto 55a
      // 556: invokestatic l86.b (Loov;)Loov;
      // 559: athrow
      // 55a: iload 8
      // 55c: iload 3
      // 55d: ifne 5d8
      // 560: goto 567
      // 563: invokestatic l86.b (Loov;)Loov;
      // 566: athrow
      // 567: ifeq 5d4
      // 56a: goto 571
      // 56d: invokestatic l86.b (Loov;)Loov;
      // 570: athrow
      // 571: aload 0
      // 572: invokevirtual l86.kqa ()Z
      // 575: iload 3
      // 576: ifne 5d8
      // 579: goto 580
      // 57c: invokestatic l86.b (Loov;)Loov;
      // 57f: athrow
      // 580: ifne 5d4
      // 583: goto 58a
      // 586: invokestatic l86.b (Loov;)Loov;
      // 589: athrow
      // 58a: aload 0
      // 58b: getstatic mcs.s19 Lmcs;
      // 58e: invokevirtual l86.cab (Lmcs;)Z
      // 591: iload 3
      // 592: ifne 5d8
      // 595: goto 59c
      // 598: invokestatic l86.b (Loov;)Loov;
      // 59b: athrow
      // 59c: ifne 5d4
      // 59f: goto 5a6
      // 5a2: invokestatic l86.b (Loov;)Loov;
      // 5a5: athrow
      // 5a6: aload 0
      // 5a7: getfield l86.oh6 Lc05;
      // 5aa: getfield c05.oxn Lmoh;
      // 5ad: getfield moh.om6 Lm7l;
      // 5b0: invokevirtual m7l.t9w ()Z
      // 5b3: iload 3
      // 5b4: ifne 5d8
      // 5b7: goto 5be
      // 5ba: invokestatic l86.b (Loov;)Loov;
      // 5bd: athrow
      // 5be: ifeq 5d4
      // 5c1: goto 5c8
      // 5c4: invokestatic l86.b (Loov;)Loov;
      // 5c7: athrow
      // 5c8: aload 0
      // 5c9: bipush 1
      // 5ca: invokevirtual l86.fqc (Z)V
      // 5cd: goto 5d4
      // 5d0: invokestatic l86.b (Loov;)Loov;
      // 5d3: athrow
      // 5d4: aload 0
      // 5d5: invokevirtual l86.ew1 ()Z
      // 5d8: iload 3
      // 5d9: ifne 64f
      // 5dc: ifeq 63a
      // 5df: goto 5e6
      // 5e2: invokestatic l86.b (Loov;)Loov;
      // 5e5: athrow
      // 5e6: aload 0
      // 5e7: iload 3
      // 5e8: ifne 636
      // 5eb: goto 5f2
      // 5ee: invokestatic l86.b (Loov;)Loov;
      // 5f1: athrow
      // 5f2: getfield l86.g9g Lboa;
      // 5f5: getfield boa._mw F
      // 5f8: fload 6
      // 5fa: fcmpg
      // 5fb: iflt 635
      // 5fe: goto 605
      // 601: invokestatic l86.b (Loov;)Loov;
      // 604: athrow
      // 605: aload 0
      // 606: iload 3
      // 607: ifne 636
      // 60a: goto 611
      // 60d: invokestatic l86.b (Loov;)Loov;
      // 610: athrow
      // 611: getfield l86.cbi Z
      // 614: ifne 635
      // 617: goto 61e
      // 61a: invokestatic l86.b (Loov;)Loov;
      // 61d: athrow
      // 61e: iload 8
      // 620: iload 3
      // 621: ifne 64f
      // 624: goto 62b
      // 627: invokestatic l86.b (Loov;)Loov;
      // 62a: athrow
      // 62b: ifne 63a
      // 62e: goto 635
      // 631: invokestatic l86.b (Loov;)Loov;
      // 634: athrow
      // 635: aload 0
      // 636: bipush 0
      // 637: invokevirtual l86.fqc (Z)V
      // 63a: new ut6
      // 63d: dup
      // 63e: getstatic o3g.hac Lo3g;
      // 641: invokespecial ut6.<init> (Lo3g;)V
      // 644: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 647: pop
      // 648: aload 0
      // 649: getfield l86.lls Lpj2;
      // 64c: getfield pj2.wvp Z
      // 64f: iload 3
      // 650: ifne 744
      // 653: ifeq 73d
      // 656: goto 65d
      // 659: invokestatic l86.b (Loov;)Loov;
      // 65c: athrow
      // 65d: aload 0
      // 65e: getfield l86.oh6 Lc05;
      // 661: getfield c05.l7q Lhh6;
      // 664: invokevirtual hh6.be4 ()Z
      // 667: iload 3
      // 668: ifne 6b8
      // 66b: goto 672
      // 66e: invokestatic l86.b (Loov;)Loov;
      // 671: athrow
      // 672: ifeq 6af
      // 675: goto 67c
      // 678: invokestatic l86.b (Loov;)Loov;
      // 67b: athrow
      // 67c: aload 0
      // 67d: getfield l86.lls Lpj2;
      // 680: getfield pj2.wzx Z
      // 683: iload 3
      // 684: ifne 744
      // 687: goto 68e
      // 68a: invokestatic l86.b (Loov;)Loov;
      // 68d: athrow
      // 68e: ifne 73d
      // 691: goto 698
      // 694: invokestatic l86.b (Loov;)Loov;
      // 697: athrow
      // 698: aload 0
      // 699: getfield l86.lls Lpj2;
      // 69c: bipush 1
      // 69d: putfield pj2.wzx Z
      // 6a0: aload 0
      // 6a1: invokevirtual l86.gow ()V
      // 6a4: iload 3
      // 6a5: ifeq 73d
      // 6a8: goto 6af
      // 6ab: invokestatic l86.b (Loov;)Loov;
      // 6ae: athrow
      // 6af: iload 4
      // 6b1: goto 6b8
      // 6b4: invokestatic l86.b (Loov;)Loov;
      // 6b7: athrow
      // 6b8: iload 3
      // 6b9: ifne 744
      // 6bc: ifne 73d
      // 6bf: goto 6c6
      // 6c2: invokestatic l86.b (Loov;)Loov;
      // 6c5: athrow
      // 6c6: aload 0
      // 6c7: getfield l86.g9g Lboa;
      // 6ca: getfield boa.s0a Z
      // 6cd: iload 3
      // 6ce: ifne 744
      // 6d1: goto 6d8
      // 6d4: invokestatic l86.b (Loov;)Loov;
      // 6d7: athrow
      // 6d8: ifeq 73d
      // 6db: goto 6e2
      // 6de: invokestatic l86.b (Loov;)Loov;
      // 6e1: athrow
      // 6e2: aload 0
      // 6e3: iload 3
      // 6e4: ifne 714
      // 6e7: goto 6ee
      // 6ea: invokestatic l86.b (Loov;)Loov;
      // 6ed: athrow
      // 6ee: getfield l86.xzr I
      // 6f1: ifne 70c
      // 6f4: goto 6fb
      // 6f7: invokestatic l86.b (Loov;)Loov;
      // 6fa: athrow
      // 6fb: aload 0
      // 6fc: bipush 7
      // 6fe: putfield l86.xzr I
      // 701: iload 3
      // 702: ifeq 73d
      // 705: goto 70c
      // 708: invokestatic l86.b (Loov;)Loov;
      // 70b: athrow
      // 70c: aload 0
      // 70d: goto 714
      // 710: invokestatic l86.b (Loov;)Loov;
      // 713: athrow
      // 714: getfield l86.lls Lpj2;
      // 717: aload 0
      // 718: getfield l86.lls Lpj2;
      // 71b: getfield pj2.wzx Z
      // 71e: iload 3
      // 71f: ifne 72d
      // 722: ifne 730
      // 725: goto 72c
      // 728: invokestatic l86.b (Loov;)Loov;
      // 72b: athrow
      // 72c: bipush 1
      // 72d: goto 731
      // 730: bipush 0
      // 731: putfield pj2.wzx Z
      // 734: aload 0
      // 735: invokevirtual l86.gow ()V
      // 738: aload 0
      // 739: bipush 0
      // 73a: putfield l86.xzr I
      // 73d: aload 0
      // 73e: getfield l86.lls Lpj2;
      // 741: getfield pj2.wzx Z
      // 744: iload 3
      // 745: ifne 7e3
      // 748: ifeq 7d4
      // 74b: goto 752
      // 74e: invokestatic l86.b (Loov;)Loov;
      // 751: athrow
      // 752: aload 0
      // 753: invokevirtual l86.zc_ ()Z
      // 756: iload 3
      // 757: ifne 7e3
      // 75a: goto 761
      // 75d: invokestatic l86.b (Loov;)Loov;
      // 760: athrow
      // 761: ifeq 7d4
      // 764: goto 76b
      // 767: invokestatic l86.b (Loov;)Loov;
      // 76a: athrow
      // 76b: aload 0
      // 76c: getfield l86.g9g Lboa;
      // 76f: getfield boa.k5u Z
      // 772: iload 3
      // 773: ifne 7aa
      // 776: goto 77d
      // 779: invokestatic l86.b (Loov;)Loov;
      // 77c: athrow
      // 77d: ifeq 7a3
      // 780: goto 787
      // 783: invokestatic l86.b (Loov;)Loov;
      // 786: athrow
      // 787: aload 0
      // 788: dup
      // 789: getfield l86.mop D
      // 78c: aload 0
      // 78d: getfield l86.lls Lpj2;
      // 790: invokevirtual pj2.eay ()F
      // 793: ldc 3.0
      // 795: nop
      // 796: fmul
      // 797: f2d
      // 798: dsub
      // 799: putfield l86.mop D
      // 79c: goto 7a3
      // 79f: invokestatic l86.b (Loov;)Loov;
      // 7a2: athrow
      // 7a3: aload 0
      // 7a4: getfield l86.g9g Lboa;
      // 7a7: getfield boa.s0a Z
      // 7aa: iload 3
      // 7ab: ifne 7e3
      // 7ae: ifeq 7d4
      // 7b1: goto 7b8
      // 7b4: invokestatic l86.b (Loov;)Loov;
      // 7b7: athrow
      // 7b8: aload 0
      // 7b9: dup
      // 7ba: getfield l86.mop D
      // 7bd: aload 0
      // 7be: getfield l86.lls Lpj2;
      // 7c1: invokevirtual pj2.eay ()F
      // 7c4: ldc 3.0
      // 7c6: nop
      // 7c7: fmul
      // 7c8: f2d
      // 7c9: dadd
      // 7ca: putfield l86.mop D
      // 7cd: goto 7d4
      // 7d0: invokestatic l86.b (Loov;)Loov;
      // 7d3: athrow
      // 7d4: aload 0
      // 7d5: iload 3
      // 7d6: ifne 934
      // 7d9: invokevirtual l86._wy ()Z
      // 7dc: goto 7e3
      // 7df: invokestatic l86.b (Loov;)Loov;
      // 7e2: athrow
      // 7e3: ifeq 92c
      // 7e6: aload 0
      // 7e7: getfield l86.lms I
      // 7ea: iload 3
      // 7eb: ifne 830
      // 7ee: goto 7f5
      // 7f1: invokestatic l86.b (Loov;)Loov;
      // 7f4: athrow
      // 7f5: ifge 82e
      // 7f8: goto 7ff
      // 7fb: invokestatic l86.b (Loov;)Loov;
      // 7fe: athrow
      // 7ff: aload 0
      // 800: dup
      // 801: getfield l86.lms I
      // 804: bipush 1
      // 805: iadd
      // 806: putfield l86.lms I
      // 809: aload 0
      // 80a: getfield l86.lms I
      // 80d: iload 3
      // 80e: ifne 830
      // 811: goto 818
      // 814: invokestatic l86.b (Loov;)Loov;
      // 817: athrow
      // 818: ifne 82e
      // 81b: goto 822
      // 81e: invokestatic l86.b (Loov;)Loov;
      // 821: athrow
      // 822: aload 0
      // 823: fconst_0
      // 824: putfield l86.wn1 F
      // 827: goto 82e
      // 82a: invokestatic l86.b (Loov;)Loov;
      // 82d: athrow
      // 82e: iload 4
      // 830: iload 3
      // 831: ifne 878
      // 834: ifeq 86f
      // 837: goto 83e
      // 83a: invokestatic l86.b (Loov;)Loov;
      // 83d: athrow
      // 83e: aload 0
      // 83f: getfield l86.g9g Lboa;
      // 842: getfield boa.s0a Z
      // 845: iload 3
      // 846: ifne 878
      // 849: goto 850
      // 84c: invokestatic l86.b (Loov;)Loov;
      // 84f: athrow
      // 850: ifne 86f
      // 853: goto 85a
      // 856: invokestatic l86.b (Loov;)Loov;
      // 859: athrow
      // 85a: aload 0
      // 85b: bipush -10
      // 85d: putfield l86.lms I
      // 860: aload 0
      // 861: invokevirtual l86.asl ()V
      // 864: iload 3
      // 865: ifeq 938
      // 868: goto 86f
      // 86b: invokestatic l86.b (Loov;)Loov;
      // 86e: athrow
      // 86f: iload 4
      // 871: goto 878
      // 874: invokestatic l86.b (Loov;)Loov;
      // 877: athrow
      // 878: iload 3
      // 879: ifne 8c0
      // 87c: ifne 8b7
      // 87f: goto 886
      // 882: invokestatic l86.b (Loov;)Loov;
      // 885: athrow
      // 886: aload 0
      // 887: getfield l86.g9g Lboa;
      // 88a: getfield boa.s0a Z
      // 88d: iload 3
      // 88e: ifne 8c0
      // 891: goto 898
      // 894: invokestatic l86.b (Loov;)Loov;
      // 897: athrow
      // 898: ifeq 8b7
      // 89b: goto 8a2
      // 89e: invokestatic l86.b (Loov;)Loov;
      // 8a1: athrow
      // 8a2: aload 0
      // 8a3: bipush 0
      // 8a4: putfield l86.lms I
      // 8a7: aload 0
      // 8a8: fconst_0
      // 8a9: putfield l86.wn1 F
      // 8ac: iload 3
      // 8ad: ifeq 938
      // 8b0: goto 8b7
      // 8b3: invokestatic l86.b (Loov;)Loov;
      // 8b6: athrow
      // 8b7: iload 4
      // 8b9: goto 8c0
      // 8bc: invokestatic l86.b (Loov;)Loov;
      // 8bf: athrow
      // 8c0: iload 3
      // 8c1: ifne 94e
      // 8c4: ifeq 938
      // 8c7: goto 8ce
      // 8ca: invokestatic l86.b (Loov;)Loov;
      // 8cd: athrow
      // 8ce: aload 0
      // 8cf: dup
      // 8d0: getfield l86.lms I
      // 8d3: bipush 1
      // 8d4: iadd
      // 8d5: putfield l86.lms I
      // 8d8: aload 0
      // 8d9: iload 3
      // 8da: ifne 913
      // 8dd: goto 8e4
      // 8e0: invokestatic l86.b (Loov;)Loov;
      // 8e3: athrow
      // 8e4: getfield l86.lms I
      // 8e7: bipush 10
      // 8e9: if_icmpge 90b
      // 8ec: goto 8f3
      // 8ef: invokestatic l86.b (Loov;)Loov;
      // 8f2: athrow
      // 8f3: aload 0
      // 8f4: aload 0
      // 8f5: getfield l86.lms I
      // 8f8: i2f
      // 8f9: ldc 0.1
      // 8fb: nop
      // 8fc: fmul
      // 8fd: putfield l86.wn1 F
      // 900: iload 3
      // 901: ifeq 938
      // 904: goto 90b
      // 907: invokestatic l86.b (Loov;)Loov;
      // 90a: athrow
      // 90b: aload 0
      // 90c: goto 913
      // 90f: invokestatic l86.b (Loov;)Loov;
      // 912: athrow
      // 913: ldc 0.8
      // 915: nop
      // 916: fconst_2
      // 917: aload 0
      // 918: getfield l86.lms I
      // 91b: bipush 9
      // 91d: isub
      // 91e: i2f
      // 91f: fdiv
      // 920: ldc 0.1
      // 922: nop
      // 923: fmul
      // 924: fadd
      // 925: putfield l86.wn1 F
      // 928: iload 3
      // 929: ifeq 938
      // 92c: aload 0
      // 92d: goto 934
      // 930: invokestatic l86.b (Loov;)Loov;
      // 933: athrow
      // 934: fconst_0
      // 935: putfield l86.wn1 F
      // 938: aload 0
      // 939: invokespecial x0l.e_a ()V
      // 93c: new ut6
      // 93f: dup
      // 940: getstatic o3g.ga7 Lo3g;
      // 943: invokespecial ut6.<init> (Lo3g;)V
      // 946: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 949: pop
      // 94a: aload 0
      // 94b: getfield l86.lfk Z
      // 94e: iload 3
      // 94f: ifne 96a
      // 952: ifeq 9aa
      // 955: goto 95c
      // 958: invokestatic l86.b (Loov;)Loov;
      // 95b: athrow
      // 95c: aload 0
      // 95d: getfield l86.lls Lpj2;
      // 960: getfield pj2.wzx Z
      // 963: goto 96a
      // 966: invokestatic l86.b (Loov;)Loov;
      // 969: athrow
      // 96a: iload 3
      // 96b: ifne 994
      // 96e: ifeq 9aa
      // 971: goto 978
      // 974: invokestatic l86.b (Loov;)Loov;
      // 977: athrow
      // 978: aload 0
      // 979: iload 3
      // 97a: ifne 9a7
      // 97d: goto 984
      // 980: invokestatic l86.b (Loov;)Loov;
      // 983: athrow
      // 984: getfield l86.oh6 Lc05;
      // 987: getfield c05.l7q Lhh6;
      // 98a: invokevirtual hh6.be4 ()Z
      // 98d: goto 994
      // 990: invokestatic l86.b (Loov;)Loov;
      // 993: athrow
      // 994: ifne 9aa
      // 997: aload 0
      // 998: getfield l86.lls Lpj2;
      // 99b: bipush 0
      // 99c: putfield pj2.wzx Z
      // 99f: aload 0
      // 9a0: goto 9a7
      // 9a3: invokestatic l86.b (Loov;)Loov;
      // 9a6: athrow
      // 9a7: invokevirtual l86.gow ()V
      // 9aa: return
   }

   @Override
   public void zrt(int var1) {
      try {
         if (var1 == mcs.bla.zr9) {
            this.u57 = 0.0F;
            this.u3f = 0.0F;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      this.zu8(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7097277360198473450L, 2184684574767661238L, MethodHandles.lookup().lookupClass()).a(82120144871594L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 26847354498761L;
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
      String var6 = "Û\u008d8~á1\u0006Ïî\u0004\u0092¤\u0005q\u009e\u001cíwë\u0015ø\u0084ëx«(;\u008e©7\u0089z\r¿\u0099\u0083{^\u008c\u0085(à\u0085¬\u009c>rn-fù[º1e+AZ(\u009c5l\u008cIPPÇÒî\u0015]»Ý\u0004\u0081G\u0081Ç«\u0018Ë ke\u008fÉs\u00ad/nhø\u0013,&Ë*^\rÙ%\u0014\u000fÇxFW\u000e\"!d©\u009c\u009b(ÀÌ\u00857ØêêÆCå\u0002x\"v?\u0006¦Ø¸ðÉÚ\u0089Ï¹\n\u0083ËÔ/ÎîU¹ÞÍ\u000eó\u000f½ »\u0000*\u009b\u0082&\u0012}(0\u0097åÎN\fq\u0006\u0086´\r@\u0095vÇP\u0086\u0005ÚÔÌ_\u00930\u001fÝ}\u0088\u00ad[\u001e\u0005J¼\u009aél\u0097s\u0087FÀ\u001b%\u00012Ã½Ð\u0096üm\u0080eÑ0à\u0099ß*}\u0016\u0006h¬*R+öB^î\u0018|¾ÿð\b¶mT#ïÕ\u001f\u0014½\u001bD¤Ç\u0012\u0093uw47(\u0002\u00135Õ/Ô\u001f\u0005\t\u00ad¦¾\u009d«\u0093Älv¡H\u0083\u0013F¶\u001d\u0012\"¯º\u0082Yå\u0011<ú\u00040\u0016nÓ(ýlØ\u0080\u0002>\u001d2\"\u009b\u0005µF8è=\u0094ÅÈ@Ì\u001b!\u0005\u0003e\u0083\u0092GeEüÀd6]|\u008e÷^0BÇo\u0082ûr1\u001e1îÖrµ\u0086\u0094\u001bò\u0087oþv²îä¿®\u009býSuÿMEëg¢\u0019\u0097\u007foÌ\u009c\u008a\u009e\u008ev¦\u0086";
      int var8 = "Û\u008d8~á1\u0006Ïî\u0004\u0092¤\u0005q\u009e\u001cíwë\u0015ø\u0084ëx«(;\u008e©7\u0089z\r¿\u0099\u0083{^\u008c\u0085(à\u0085¬\u009c>rn-fù[º1e+AZ(\u009c5l\u008cIPPÇÒî\u0015]»Ý\u0004\u0081G\u0081Ç«\u0018Ë ke\u008fÉs\u00ad/nhø\u0013,&Ë*^\rÙ%\u0014\u000fÇxFW\u000e\"!d©\u009c\u009b(ÀÌ\u00857ØêêÆCå\u0002x\"v?\u0006¦Ø¸ðÉÚ\u0089Ï¹\n\u0083ËÔ/ÎîU¹ÞÍ\u000eó\u000f½ »\u0000*\u009b\u0082&\u0012}(0\u0097åÎN\fq\u0006\u0086´\r@\u0095vÇP\u0086\u0005ÚÔÌ_\u00930\u001fÝ}\u0088\u00ad[\u001e\u0005J¼\u009aél\u0097s\u0087FÀ\u001b%\u00012Ã½Ð\u0096üm\u0080eÑ0à\u0099ß*}\u0016\u0006h¬*R+öB^î\u0018|¾ÿð\b¶mT#ïÕ\u001f\u0014½\u001bD¤Ç\u0012\u0093uw47(\u0002\u00135Õ/Ô\u001f\u0005\t\u00ad¦¾\u009d«\u0093Älv¡H\u0083\u0013F¶\u001d\u0012\"¯º\u0082Yå\u0011<ú\u00040\u0016nÓ(ýlØ\u0080\u0002>\u001d2\"\u009b\u0005µF8è=\u0094ÅÈ@Ì\u001b!\u0005\u0003e\u0083\u0092GeEüÀd6]|\u008e÷^0BÇo\u0082ûr1\u001e1îÖrµ\u0086\u0094\u001bò\u0087oþv²îä¿®\u009býSuÿMEëg¢\u0019\u0097\u007foÌ\u009c\u008a\u009e\u008ev¦\u0086"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = e(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     t = var9;
                     u = new String[12];
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

                  var6 = "\u0099u\u0090{\u00adI\u0006 ÚQ\u0003\u001d%ÆDàLyõð¯èº\u0006ûm\u008dãT\u001aln\u0093\u0083Ö&K\u0087Y\b\u0005\u00009[\u001aê'ê\u0098GYÍ\u008c=ïG03ú\u009da\u0083w°!;?\u009d\u0088Ç\u0089z}àx\u0014ý¶Ä\u0091\u0080û«É{·C\u0097\u0086\u0099Û[\u0017ºÁ\r\u0017å\n\u0007\u0010\u0001(¼ì";
                  var8 = "\u0099u\u0090{\u00adI\u0006 ÚQ\u0003\u001d%ÆDàLyõð¯èº\u0006ûm\u008dãT\u001aln\u0093\u0083Ö&K\u0087Y\b\u0005\u00009[\u001aê'ê\u0098GYÍ\u008c=ïG03ú\u009da\u0083w°!;?\u009d\u0088Ç\u0089z}àx\u0014ý¶Ä\u0091\u0080û«É{·C\u0097\u0086\u0099Û[\u0017ºÁ\r\u0017å\n\u0007\u0010\u0001(¼ì"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String e(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30071;
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
            throw new RuntimeException("l86", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = t[var5].getBytes("ISO-8859-1");
         u[var5] = e(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("l86" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
