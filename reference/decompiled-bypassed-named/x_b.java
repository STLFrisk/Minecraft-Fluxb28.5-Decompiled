import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.login.client.C00PacketLoginStart;
import net.minecraft.network.login.client.C01PacketEncryptionResponse;
import net.minecraft.network.login.server.S00PacketDisconnect;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class x_b implements ccy, xcy {
   private static final AtomicInteger kgh;
   private static final Logger fvl;
   private static final Random a4y;
   private final byte[] itf = new byte[4];
   private final vr1 mcn;
   public final hv0 l0o;
   private x_b$rbt ay7 = x_b$rbt.g1e;
   private int di4;
   private GameProfile djn;
   private String qzc = "";
   private SecretKey pgu;
   private z96 k04;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public x_b(vr1 var1, hv0 var2) {
      this.mcn = var1;
      this.l0o = var2;
      a4y.nextBytes(this.itf);
   }

   @Override
   public void _21() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic x_b.a J
      // 03: ldc2_w 85627036171802
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield x_b.ay7 Lx_b$rbt;
      // 10: getstatic x_b$rbt.m75 Lx_b$rbt;
      // 13: iload 3
      // 14: ifeq 49
      // 17: if_acmpne 30
      // 1a: goto 21
      // 1d: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual x_b.zye ()V
      // 25: iload 3
      // 26: ifne 94
      // 29: goto 30
      // 2c: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2f: athrow
      // 30: aload 0
      // 31: iload 3
      // 32: ifeq 95
      // 35: goto 3c
      // 38: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3b: athrow
      // 3c: getfield x_b.ay7 Lx_b$rbt;
      // 3f: getstatic x_b$rbt.bap Lx_b$rbt;
      // 42: goto 49
      // 45: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 48: athrow
      // 49: if_acmpne 94
      // 4c: aload 0
      // 4d: iload 3
      // 4e: ifeq 95
      // 51: goto 58
      // 54: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 57: athrow
      // 58: getfield x_b.mcn Lvr1;
      // 5b: invokevirtual vr1.wh3 ()Lwlx;
      // 5e: aload 0
      // 5f: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 62: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 65: invokevirtual wlx.fm4 (Ljava/util/UUID;)Lz96;
      // 68: astore 4
      // 6a: aload 4
      // 6c: ifnonnull 94
      // 6f: aload 0
      // 70: getstatic x_b$rbt.m75 Lx_b$rbt;
      // 73: putfield x_b.ay7 Lx_b$rbt;
      // 76: aload 0
      // 77: getfield x_b.mcn Lvr1;
      // 7a: invokevirtual vr1.wh3 ()Lwlx;
      // 7d: aload 0
      // 7e: getfield x_b.l0o Lhv0;
      // 81: aload 0
      // 82: getfield x_b.k04 Lz96;
      // 85: invokevirtual wlx.zp9 (Lhv0;Lz96;)V
      // 88: aload 0
      // 89: aconst_null
      // 8a: putfield x_b.k04 Lz96;
      // 8d: goto 94
      // 90: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 93: athrow
      // 94: aload 0
      // 95: iload 3
      // 96: ifeq b8
      // 99: dup
      // 9a: getfield x_b.di4 I
      // 9d: dup_x1
      // 9e: bipush 1
      // 9f: iadd
      // a0: putfield x_b.di4 I
      // a3: sipush 600
      // a6: if_icmpne c9
      // a9: goto b0
      // ac: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // af: athrow
      // b0: aload 0
      // b1: goto b8
      // b4: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b7: athrow
      // b8: sipush 11026
      // bb: ldc2_w 6245342240971691113
      // be: lload 1
      // bf: lxor
      // c0: invokedynamic z (IJ)Ljava/lang/String; bsm=x_b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: nop
      // c6: invokevirtual x_b.omu (Ljava/lang/String;)V
      // c9: return
   }

   public void omu(String var1) {
      long var2 = a ^ 1718450282922L;

      try {
         fvl.info(a<"z">(3224, 480200164105464914L ^ var2) + this.ie1() + a<"z">(7668, 8420981740391087420L ^ var2) + var1);
         tao var4 = new tao(var1);
         this.l0o.k7f(new S00PacketDisconnect(var4));
         this.l0o.g8c(var4);
      } catch (Exception var5) {
         fvl.error(a<"z">(16916, 5003990666064126683L ^ var2), var5);
      }
   }

   public void zye() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 02d
      // 009: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 00c: invokevirtual com/mojang/authlib/GameProfile.isComplete ()Z
      // 00f: ifne 02c
      // 012: goto 019
      // 015: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 018: athrow
      // 019: aload 0
      // 01a: aload 0
      // 01b: aload 0
      // 01c: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 01f: invokevirtual x_b._t6 (Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 022: putfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 025: goto 02c
      // 028: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield x_b.mcn Lvr1;
      // 030: invokevirtual vr1.wh3 ()Lwlx;
      // 033: aload 0
      // 034: getfield x_b.l0o Lhv0;
      // 037: invokevirtual hv0.pz4 ()Ljava/net/SocketAddress;
      // 03a: aload 0
      // 03b: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 03e: invokevirtual wlx.pjq (Ljava/net/SocketAddress;Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 041: astore 2
      // 042: iload 1
      // 043: ifeq 06f
      // 046: aload 2
      // 047: ifnull 061
      // 04a: goto 051
      // 04d: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 050: athrow
      // 051: aload 0
      // 052: aload 2
      // 053: invokevirtual x_b.omu (Ljava/lang/String;)V
      // 056: iload 1
      // 057: ifne 142
      // 05a: goto 061
      // 05d: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 060: athrow
      // 061: aload 0
      // 062: getstatic x_b$rbt.a5g Lx_b$rbt;
      // 065: putfield x_b.ay7 Lx_b$rbt;
      // 068: goto 06f
      // 06b: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield x_b.mcn Lvr1;
      // 073: iload 1
      // 074: ifeq 0de
      // 077: invokevirtual vr1.t0j ()I
      // 07a: iflt 0c8
      // 07d: goto 084
      // 080: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 083: athrow
      // 084: aload 0
      // 085: getfield x_b.l0o Lhv0;
      // 088: iload 1
      // 089: ifeq 0cc
      // 08c: goto 093
      // 08f: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 092: athrow
      // 093: invokevirtual hv0.mwg ()Z
      // 096: ifne 0c8
      // 099: goto 0a0
      // 09c: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: getfield x_b.l0o Lhv0;
      // 0a4: new net/minecraft/network/login/server/S03PacketEnableCompression
      // 0a7: dup
      // 0a8: aload 0
      // 0a9: getfield x_b.mcn Lvr1;
      // 0ac: invokevirtual vr1.t0j ()I
      // 0af: invokespecial net/minecraft/network/login/server/S03PacketEnableCompression.<init> (I)V
      // 0b2: new x_b$1
      // 0b5: dup
      // 0b6: aload 0
      // 0b7: invokespecial x_b$1.<init> (Lx_b;)V
      // 0ba: bipush 0
      // 0bb: anewarray 202
      // 0be: invokevirtual hv0.pl0 (Lmz2;Lio/netty/util/concurrent/GenericFutureListener;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 0c1: goto 0c8
      // 0c4: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield x_b.l0o Lhv0;
      // 0cc: new net/minecraft/network/login/server/S02PacketLoginSuccess
      // 0cf: dup
      // 0d0: aload 0
      // 0d1: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 0d4: invokespecial net/minecraft/network/login/server/S02PacketLoginSuccess.<init> (Lcom/mojang/authlib/GameProfile;)V
      // 0d7: invokevirtual hv0.k7f (Lmz2;)V
      // 0da: aload 0
      // 0db: getfield x_b.mcn Lvr1;
      // 0de: invokevirtual vr1.wh3 ()Lwlx;
      // 0e1: aload 0
      // 0e2: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 0e5: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 0e8: invokevirtual wlx.fm4 (Ljava/util/UUID;)Lz96;
      // 0eb: astore 3
      // 0ec: iload 1
      // 0ed: ifeq 11b
      // 0f0: aload 3
      // 0f1: ifnull 11f
      // 0f4: goto 0fb
      // 0f7: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getstatic x_b$rbt.bap Lx_b$rbt;
      // 0ff: putfield x_b.ay7 Lx_b$rbt;
      // 102: aload 0
      // 103: aload 0
      // 104: getfield x_b.mcn Lvr1;
      // 107: invokevirtual vr1.wh3 ()Lwlx;
      // 10a: aload 0
      // 10b: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 10e: invokevirtual wlx.ajx (Lcom/mojang/authlib/GameProfile;)Lz96;
      // 111: putfield x_b.k04 Lz96;
      // 114: goto 11b
      // 117: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 11a: athrow
      // 11b: iload 1
      // 11c: ifne 142
      // 11f: aload 0
      // 120: getfield x_b.mcn Lvr1;
      // 123: invokevirtual vr1.wh3 ()Lwlx;
      // 126: aload 0
      // 127: getfield x_b.l0o Lhv0;
      // 12a: aload 0
      // 12b: getfield x_b.mcn Lvr1;
      // 12e: invokevirtual vr1.wh3 ()Lwlx;
      // 131: aload 0
      // 132: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 135: invokevirtual wlx.ajx (Lcom/mojang/authlib/GameProfile;)Lz96;
      // 138: invokevirtual wlx.zp9 (Lhv0;Lz96;)V
      // 13b: goto 142
      // 13e: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 141: athrow
      // 142: return
   }

   @Override
   public void az3(ekw var1) {
      long var2 = a ^ 53973335799767L;
      fvl.info(this.ie1() + a<"z">(16252, 3787491523716843971L ^ var2) + var1.rnh());
   }

   public String ie1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic x_b.a J
      // 03: ldc2_w 79553341069975
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 5e
      // 11: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 14: ifnull 5d
      // 17: goto 1e
      // 1a: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d: athrow
      // 1e: new java/lang/StringBuilder
      // 21: dup
      // 22: invokespecial java/lang/StringBuilder.<init> ()V
      // 25: aload 0
      // 26: getfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 29: invokevirtual com/mojang/authlib/GameProfile.toString ()Ljava/lang/String;
      // 2c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f: sipush 29613
      // 32: ldc2_w 9132089116820613209
      // 35: lload 1
      // 36: lxor
      // 37: invokedynamic z (IJ)Ljava/lang/String; bsm=x_b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: nop
      // 3d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 40: aload 0
      // 41: getfield x_b.l0o Lhv0;
      // 44: invokevirtual hv0.pz4 ()Ljava/net/SocketAddress;
      // 47: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 4a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d: ldc ")"
      // 4f: nop
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 56: goto 67
      // 59: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield x_b.l0o Lhv0;
      // 61: invokevirtual hv0.pz4 ()Ljava/net/SocketAddress;
      // 64: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 67: areturn
   }

   @Override
   public void v1t(C00PacketLoginStart param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic x_b.a J
      // 03: ldc2_w 107663789775048
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield x_b.ay7 Lx_b$rbt;
      // 11: getstatic x_b$rbt.g1e Lx_b$rbt;
      // 14: if_acmpne 1f
      // 17: bipush 1
      // 18: goto 20
      // 1b: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e: athrow
      // 1f: bipush 0
      // 20: sipush 20889
      // 23: ldc2_w 424654654457956405
      // 26: lload 2
      // 27: lxor
      // 28: invokedynamic z (IJ)Ljava/lang/String; bsm=x_b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: nop
      // 2e: bipush 0
      // 2f: anewarray 16
      // 32: invokestatic org/apache/commons/lang3/Validate.validState (ZLjava/lang/String;[Ljava/lang/Object;)V
      // 35: aload 0
      // 36: aload 1
      // 37: invokevirtual net/minecraft/network/login/client/C00PacketLoginStart.zug ()Lcom/mojang/authlib/GameProfile;
      // 3a: putfield x_b.djn Lcom/mojang/authlib/GameProfile;
      // 3d: aload 0
      // 3e: iload 4
      // 40: ifeq ab
      // 43: getfield x_b.mcn Lvr1;
      // 46: invokevirtual vr1.targetsSorted ()Z
      // 49: ifeq a3
      // 4c: goto 53
      // 4f: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 52: athrow
      // 53: aload 0
      // 54: iload 4
      // 56: ifeq ab
      // 59: goto 60
      // 5c: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5f: athrow
      // 60: getfield x_b.l0o Lhv0;
      // 63: invokevirtual hv0.mwg ()Z
      // 66: ifne a3
      // 69: goto 70
      // 6c: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6f: athrow
      // 70: aload 0
      // 71: getstatic x_b$rbt.q1z Lx_b$rbt;
      // 74: putfield x_b.ay7 Lx_b$rbt;
      // 77: aload 0
      // 78: getfield x_b.l0o Lhv0;
      // 7b: new net/minecraft/network/login/server/S01PacketEncryptionRequest
      // 7e: dup
      // 7f: aload 0
      // 80: getfield x_b.qzc Ljava/lang/String;
      // 83: aload 0
      // 84: getfield x_b.mcn Lvr1;
      // 87: invokevirtual vr1.nnq ()Ljava/security/KeyPair;
      // 8a: invokevirtual java/security/KeyPair.getPublic ()Ljava/security/PublicKey;
      // 8d: aload 0
      // 8e: getfield x_b.itf [B
      // 91: invokespecial net/minecraft/network/login/server/S01PacketEncryptionRequest.<init> (Ljava/lang/String;Ljava/security/PublicKey;[B)V
      // 94: invokevirtual hv0.k7f (Lmz2;)V
      // 97: iload 4
      // 99: ifne b1
      // 9c: goto a3
      // 9f: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a2: athrow
      // a3: aload 0
      // a4: goto ab
      // a7: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // aa: athrow
      // ab: getstatic x_b$rbt.m75 Lx_b$rbt;
      // ae: putfield x_b.ay7 Lx_b$rbt;
      // b1: return
   }

   @Override
   public void dmy(C01PacketEncryptionResponse param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic x_b.a J
      // 03: ldc2_w 119401374399836
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield x_b.ay7 Lx_b$rbt;
      // 11: getstatic x_b$rbt.q1z Lx_b$rbt;
      // 14: if_acmpne 1f
      // 17: bipush 1
      // 18: goto 20
      // 1b: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e: athrow
      // 1f: bipush 0
      // 20: sipush 7803
      // 23: ldc2_w 5525895560830214732
      // 26: lload 2
      // 27: lxor
      // 28: invokedynamic z (IJ)Ljava/lang/String; bsm=x_b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: nop
      // 2e: bipush 0
      // 2f: anewarray 16
      // 32: invokestatic org/apache/commons/lang3/Validate.validState (ZLjava/lang/String;[Ljava/lang/Object;)V
      // 35: aload 0
      // 36: getfield x_b.mcn Lvr1;
      // 39: invokevirtual vr1.nnq ()Ljava/security/KeyPair;
      // 3c: invokevirtual java/security/KeyPair.getPrivate ()Ljava/security/PrivateKey;
      // 3f: astore 5
      // 41: aload 0
      // 42: iload 4
      // 44: ifeq 89
      // 47: getfield x_b.itf [B
      // 4a: aload 1
      // 4b: aload 5
      // 4d: invokevirtual net/minecraft/network/login/client/C01PacketEncryptionResponse.ttx (Ljava/security/PrivateKey;)[B
      // 50: invokestatic java/util/Arrays.equals ([B[B)Z
      // 53: ifne 77
      // 56: goto 5d
      // 59: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5c: athrow
      // 5d: new java/lang/IllegalStateException
      // 60: dup
      // 61: sipush 8897
      // 64: ldc2_w 8660100656866615034
      // 67: lload 2
      // 68: lxor
      // 69: invokedynamic z (IJ)Ljava/lang/String; bsm=x_b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: nop
      // 6f: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 72: athrow
      // 73: invokestatic x_b.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 76: athrow
      // 77: aload 0
      // 78: aload 1
      // 79: aload 5
      // 7b: invokevirtual net/minecraft/network/login/client/C01PacketEncryptionResponse.pv8 (Ljava/security/PrivateKey;)Ljavax/crypto/SecretKey;
      // 7e: putfield x_b.pgu Ljavax/crypto/SecretKey;
      // 81: aload 0
      // 82: getstatic x_b$rbt.l3z Lx_b$rbt;
      // 85: putfield x_b.ay7 Lx_b$rbt;
      // 88: aload 0
      // 89: getfield x_b.l0o Lhv0;
      // 8c: aload 0
      // 8d: getfield x_b.pgu Ljavax/crypto/SecretKey;
      // 90: invokevirtual hv0.n62 (Ljavax/crypto/SecretKey;)V
      // 93: new x_b$2
      // 96: dup
      // 97: aload 0
      // 98: new java/lang/StringBuilder
      // 9b: dup
      // 9c: invokespecial java/lang/StringBuilder.<init> ()V
      // 9f: sipush 6588
      // a2: ldc2_w 2772343935910995338
      // a5: lload 2
      // a6: lxor
      // a7: invokedynamic z (IJ)Ljava/lang/String; bsm=x_b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: nop
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0: getstatic x_b.kgh Ljava/util/concurrent/atomic/AtomicInteger;
      // b3: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // b6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // bc: invokespecial x_b$2.<init> (Lx_b;Ljava/lang/String;)V
      // bf: invokevirtual x_b$2.start ()V
      // c2: return
   }

   public GameProfile _t6(GameProfile var1) {
      long var2 = a ^ 7326655916379L;
      UUID var4 = UUID.nameUUIDFromBytes((a<"z">(10925, 157948260789568144L ^ var2) + var1.getName()).getBytes(Charsets.UTF_8));
      return new GameProfile(var4, var1.getName());
   }

   public static vr1 k7_(x_b var0) {
      return var0.mcn;
   }

   public static GameProfile jdc(x_b var0) {
      return var0.djn;
   }

   public static String voh(x_b var0) {
      return var0.qzc;
   }

   public static SecretKey ebb(x_b var0) {
      return var0.pgu;
   }

   public static GameProfile _j2(x_b var0, GameProfile var1) {
      return var0.djn = var1;
   }

   public static Logger nwj() {
      return fvl;
   }

   public static x_b$rbt _fj(x_b var0, x_b$rbt var1) {
      return var0.ay7 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3296663502420810173L, 1585546339870817665L, MethodHandles.lookup().lookupClass()).a(152330456599224L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 123104880338803L;
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
      String var6 = "p{R\u0000V-ðíY\u0091\u008c\nPèçÀ\u0010dûÛ=\u0096>Ò£\f½Á\u00ad®×\u001bL \u001c¨ [[ÇÛ\u0086\u0018Ù÷ð\u0091=aÞé?qíÏo+\u0080¸ñyÎ¦^z\u009b('\u001b\u000f&\u0015\u0019öÍíF.÷bwQb¼\u0093.-ö*-²\t\u0012SP»´n\u0002P@¯i!ti¢ \u0086²8b^I\u0084$\u0005«2\u0099R8\u0082(\u0092Ê\"Ñe\t|dóÊZü\u0086µ!´ `5D®x]PýêcêC\u0080Ë\u008b9 Î\u0017\u0080\u0086~¶\u00admö#¢Þ\u0091\u0080\\(eª\u001b¦ô0,Ú\u0010\u0089\tg\u009fHbÄe.-\u009bÃ\u001d\u0091 \u0005à^ñÿ\u0001_8Z\u0090EÝ¯ý!{H\tÇµ¯Ê\u009d§\u000ejS\f=\u001fV2\u007fæò=¢ºxÔ»\u008bßz\u0007åe\u0004ý\"û«¬\u0082gr\u0096\u0097\u0003à\u0005ÕaG4øX\u0002\u0083¦\t\u0080£wÅ&Ý¯\u0097\u0093EÀ\u0002«5\u0010\u00883ª(\u0006^\u0080\u009cJ\r§Q±âþ\u0011LÀ\f\u0089ß¢/îz¤ÕaÄ\u0094¶>ÿ=\u001fÔ\u0016\u0092!ª¹@uó";
      int var8 = "p{R\u0000V-ðíY\u0091\u008c\nPèçÀ\u0010dûÛ=\u0096>Ò£\f½Á\u00ad®×\u001bL \u001c¨ [[ÇÛ\u0086\u0018Ù÷ð\u0091=aÞé?qíÏo+\u0080¸ñyÎ¦^z\u009b('\u001b\u000f&\u0015\u0019öÍíF.÷bwQb¼\u0093.-ö*-²\t\u0012SP»´n\u0002P@¯i!ti¢ \u0086²8b^I\u0084$\u0005«2\u0099R8\u0082(\u0092Ê\"Ñe\t|dóÊZü\u0086µ!´ `5D®x]PýêcêC\u0080Ë\u008b9 Î\u0017\u0080\u0086~¶\u00admö#¢Þ\u0091\u0080\\(eª\u001b¦ô0,Ú\u0010\u0089\tg\u009fHbÄe.-\u009bÃ\u001d\u0091 \u0005à^ñÿ\u0001_8Z\u0090EÝ¯ý!{H\tÇµ¯Ê\u009d§\u000ejS\f=\u001fV2\u007fæò=¢ºxÔ»\u008bßz\u0007åe\u0004ý\"û«¬\u0082gr\u0096\u0097\u0003à\u0005ÕaG4øX\u0002\u0083¦\t\u0080£wÅ&Ý¯\u0097\u0093EÀ\u0002«5\u0010\u00883ª(\u0006^\u0080\u009cJ\r§Q±âþ\u0011LÀ\f\u0089ß¢/îz¤ÕaÄ\u0094¶>ÿ=\u001fÔ\u0016\u0092!ª¹@uó"
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
                     c = new String[11];
                     kgh = new AtomicInteger(0);
                     fvl = LogManager.getLogger();
                     a4y = new Random();
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

                  var6 = "ö¶8¡Lï:SÈ\u0014^ë\u0001(\u001e©á\u001cm2\u0006¼#¥®X\u0006\u0083µÇ¤\rø\u0000ù\u009eÏÚ\u0087ûoñ²\u0098Ô¡\u0087Þ(\u0011îX)Â\u0012jÇ\u001dÆú\u0089ÝåW\u0087MÅÉú\u001034\u008dj:9\u00060c-»\u0015Í±5ý¿éG";
                  var8 = "ö¶8¡Lï:SÈ\u0014^ë\u0001(\u001e©á\u001cm2\u0006¼#¥®X\u0006\u0083µÇ¤\rø\u0000ù\u009eÏÚ\u0087ûoñ²\u0098Ô¡\u0087Þ(\u0011îX)Â\u0012jÇ\u001dÆú\u0089ÝåW\u0087MÅÉú\u001034\u008dj:9\u00060c-»\u0015Í±5ý¿éG"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16066;
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
            throw new RuntimeException("x_b", var10);
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
         throw new RuntimeException("x_b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
