import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.render.GlAlphaState;
import net.optifine.render.GlBlendState;
import net.optifine.util.LockCounter;
import org.lwjgl.opengl.GL11;

public class hzu {
   private static hzu$igu n7g;
   private static hzu$win cnk;
   private static hzu$win[] feo;
   private static hzu$jkh tre;
   private static hzu$_0v fz_;
   private static hzu$nhz p4y;
   private static hzu$amh nvq;
   private static hzu$sog gad;
   private static hzu$iia s_z;
   private static hzu$oe1 ax9;
   private static hzu$loj zzp;
   private static hzu$odz jrq;
   private static hzu$n87 ul8;
   private static hzu$win wux;
   private static int i98;
   private static hzu$w2h[] i20;
   private static int zh_;
   private static hzu$win cnc;
   private static hzu$i8u jti;
   private static hzu$v9h faq;
   public static boolean w2k;
   private static LockCounter a7x;
   private static GlAlphaState z6w;
   private static LockCounter ojx;
   private static GlBlendState lh9;
   private static boolean iqv;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static void kxu() {
      GL11.glPushAttrib(8256);
   }

   public static void ich() {
      GL11.glPopAttrib();
   }

   public static void vtj() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic hzu.a7x Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: ifeq 1e
      // 0d: getstatic hzu.z6w Lnet/optifine/render/GlAlphaState;
      // 10: invokevirtual net/optifine/render/GlAlphaState.setDisabled ()V
      // 13: iload 0
      // 14: ifne 2e
      // 17: goto 1e
      // 1a: invokestatic hzu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic hzu.n7g Lhzu$igu;
      // 21: getfield hzu$igu.xvk Lhzu$win;
      // 24: invokevirtual hzu$win.iiq ()V
      // 27: goto 2e
      // 2a: invokestatic hzu.a (Loov;)Loov;
      // 2d: athrow
      // 2e: return
   }

   public static void if9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic hzu.a7x Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: ifeq 1e
      // 0d: getstatic hzu.z6w Lnet/optifine/render/GlAlphaState;
      // 10: invokevirtual net/optifine/render/GlAlphaState.setEnabled ()V
      // 13: iload 0
      // 14: ifne 2e
      // 17: goto 1e
      // 1a: invokestatic hzu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic hzu.n7g Lhzu$igu;
      // 21: getfield hzu$igu.xvk Lhzu$win;
      // 24: invokevirtual hzu$win.mdn ()V
      // 27: goto 2e
      // 2a: invokestatic hzu.a (Loov;)Loov;
      // 2d: athrow
      // 2e: return
   }

   public static void fak(int param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: getstatic hzu.a7x Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: iload 2
      // 0b: ifne 33
      // 0e: ifeq 2b
      // 11: goto 18
      // 14: invokestatic hzu.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic hzu.z6w Lnet/optifine/render/GlAlphaState;
      // 1b: iload 0
      // 1c: fload 1
      // 1d: invokevirtual net/optifine/render/GlAlphaState.setFuncRef (IF)V
      // 20: iload 2
      // 21: ifeq 7e
      // 24: goto 2b
      // 27: invokestatic hzu.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 0
      // 2c: goto 33
      // 2f: invokestatic hzu.a (Loov;)Loov;
      // 32: athrow
      // 33: iload 2
      // 34: ifne 7a
      // 37: getstatic hzu.n7g Lhzu$igu;
      // 3a: getfield hzu$igu.csu I
      // 3d: if_icmpne 64
      // 40: goto 47
      // 43: invokestatic hzu.a (Loov;)Loov;
      // 46: athrow
      // 47: fload 1
      // 48: getstatic hzu.n7g Lhzu$igu;
      // 4b: getfield hzu$igu.qjy F
      // 4e: fcmpl
      // 4f: iload 2
      // 50: ifne 7a
      // 53: goto 5a
      // 56: invokestatic hzu.a (Loov;)Loov;
      // 59: athrow
      // 5a: ifeq 7e
      // 5d: goto 64
      // 60: invokestatic hzu.a (Loov;)Loov;
      // 63: athrow
      // 64: getstatic hzu.n7g Lhzu$igu;
      // 67: iload 0
      // 68: putfield hzu$igu.csu I
      // 6b: getstatic hzu.n7g Lhzu$igu;
      // 6e: fload 1
      // 6f: putfield hzu$igu.qjy F
      // 72: iload 0
      // 73: goto 7a
      // 76: invokestatic hzu.a (Loov;)Loov;
      // 79: athrow
      // 7a: fload 1
      // 7b: invokestatic org/lwjgl/opengl/GL11.glAlphaFunc (IF)V
      // 7e: return
   }

   public static void s7q() {
      cnk.mdn();
   }

   public static void fpt() {
      cnk.iiq();
   }

   public static void tzg(int var0) {
      feo[var0].mdn();
   }

   public static void w60(int var0) {
      feo[var0].iiq();
   }

   public static void avm() {
      tre.q94.mdn();
   }

   public static void ync() {
      tre.q94.iiq();
   }

   public static void p8z(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 0
      // 05: getstatic hzu.tre Lhzu$jkh;
      // 08: getfield hzu$jkh.zth I
      // 0b: iload 2
      // 0c: ifne 4c
      // 0f: if_icmpne 35
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: iload 1
      // 1a: getstatic hzu.tre Lhzu$jkh;
      // 1d: getfield hzu$jkh.mtj I
      // 20: iload 2
      // 21: ifne 4c
      // 24: goto 2b
      // 27: invokestatic hzu.a (Loov;)Loov;
      // 2a: athrow
      // 2b: if_icmpeq 4f
      // 2e: goto 35
      // 31: invokestatic hzu.a (Loov;)Loov;
      // 34: athrow
      // 35: getstatic hzu.tre Lhzu$jkh;
      // 38: iload 0
      // 39: putfield hzu$jkh.zth I
      // 3c: getstatic hzu.tre Lhzu$jkh;
      // 3f: iload 1
      // 40: putfield hzu$jkh.mtj I
      // 43: iload 0
      // 44: iload 1
      // 45: goto 4c
      // 48: invokestatic hzu.a (Loov;)Loov;
      // 4b: athrow
      // 4c: invokestatic org/lwjgl/opengl/GL11.glColorMaterial (II)V
      // 4f: return
   }

   public static void _o4() {
      p4y.e_4.iiq();
   }

   public static void m45() {
      p4y.e_4.mdn();
   }

   public static void d14(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 28
      // 09: getstatic hzu.p4y Lhzu$nhz;
      // 0c: getfield hzu$nhz.u2a I
      // 0f: if_icmpeq 2b
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic hzu.p4y Lhzu$nhz;
      // 1c: iload 0
      // 1d: putfield hzu$nhz.u2a I
      // 20: iload 0
      // 21: goto 28
      // 24: invokestatic hzu.a (Loov;)Loov;
      // 27: athrow
      // 28: invokestatic org/lwjgl/opengl/GL11.glDepthFunc (I)V
      // 2b: return
   }

   public static void jun(boolean param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 28
      // 09: getstatic hzu.p4y Lhzu$nhz;
      // 0c: getfield hzu$nhz.fts Z
      // 0f: if_icmpeq 2b
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic hzu.p4y Lhzu$nhz;
      // 1c: iload 0
      // 1d: putfield hzu$nhz.fts Z
      // 20: iload 0
      // 21: goto 28
      // 24: invokestatic hzu.a (Loov;)Loov;
      // 27: athrow
      // 28: invokestatic org/lwjgl/opengl/GL11.glDepthMask (Z)V
      // 2b: return
   }

   public static void ux6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: ifeq 1e
      // 0d: getstatic hzu.lh9 Lnet/optifine/render/GlBlendState;
      // 10: invokevirtual net/optifine/render/GlBlendState.setDisabled ()V
      // 13: iload 0
      // 14: ifne 2e
      // 17: goto 1e
      // 1a: invokestatic hzu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic hzu.fz_ Lhzu$_0v;
      // 21: getfield hzu$_0v.ig9 Lhzu$win;
      // 24: invokevirtual hzu$win.iiq ()V
      // 27: goto 2e
      // 2a: invokestatic hzu.a (Loov;)Loov;
      // 2d: athrow
      // 2e: return
   }

   public static void spd() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: ifeq 1e
      // 0d: getstatic hzu.lh9 Lnet/optifine/render/GlBlendState;
      // 10: invokevirtual net/optifine/render/GlBlendState.setEnabled ()V
      // 13: iload 0
      // 14: ifeq 2e
      // 17: goto 1e
      // 1a: invokestatic hzu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic hzu.fz_ Lhzu$_0v;
      // 21: getfield hzu$_0v.ig9 Lhzu$win;
      // 24: invokevirtual hzu$win.mdn ()V
      // 27: goto 2e
      // 2a: invokestatic hzu.a (Loov;)Loov;
      // 2d: athrow
      // 2e: return
   }

   public static void ru7(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: iload 2
      // 0b: ifeq 33
      // 0e: ifeq 2b
      // 11: goto 18
      // 14: invokestatic hzu.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic hzu.lh9 Lnet/optifine/render/GlBlendState;
      // 1b: iload 0
      // 1c: iload 1
      // 1d: invokevirtual net/optifine/render/GlBlendState.setFactors (II)V
      // 20: iload 2
      // 21: ifne e5
      // 24: goto 2b
      // 27: invokestatic hzu.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 0
      // 2c: goto 33
      // 2f: invokestatic hzu.a (Loov;)Loov;
      // 32: athrow
      // 33: iload 2
      // 34: ifeq c1
      // 37: getstatic hzu.fz_ Lhzu$_0v;
      // 3a: getfield hzu$_0v.gx3 I
      // 3d: if_icmpne 9b
      // 40: goto 47
      // 43: invokestatic hzu.a (Loov;)Loov;
      // 46: athrow
      // 47: iload 1
      // 48: iload 2
      // 49: ifeq c1
      // 4c: goto 53
      // 4f: invokestatic hzu.a (Loov;)Loov;
      // 52: athrow
      // 53: getstatic hzu.fz_ Lhzu$_0v;
      // 56: getfield hzu$_0v.h_g I
      // 59: if_icmpne 9b
      // 5c: goto 63
      // 5f: invokestatic hzu.a (Loov;)Loov;
      // 62: athrow
      // 63: iload 0
      // 64: iload 2
      // 65: ifeq c1
      // 68: goto 6f
      // 6b: invokestatic hzu.a (Loov;)Loov;
      // 6e: athrow
      // 6f: getstatic hzu.fz_ Lhzu$_0v;
      // 72: getfield hzu$_0v.s92 I
      // 75: if_icmpne 9b
      // 78: goto 7f
      // 7b: invokestatic hzu.a (Loov;)Loov;
      // 7e: athrow
      // 7f: iload 1
      // 80: iload 2
      // 81: ifeq c1
      // 84: goto 8b
      // 87: invokestatic hzu.a (Loov;)Loov;
      // 8a: athrow
      // 8b: getstatic hzu.fz_ Lhzu$_0v;
      // 8e: getfield hzu$_0v.__z I
      // 91: if_icmpeq e5
      // 94: goto 9b
      // 97: invokestatic hzu.a (Loov;)Loov;
      // 9a: athrow
      // 9b: getstatic hzu.fz_ Lhzu$_0v;
      // 9e: iload 0
      // 9f: putfield hzu$_0v.gx3 I
      // a2: getstatic hzu.fz_ Lhzu$_0v;
      // a5: iload 1
      // a6: putfield hzu$_0v.h_g I
      // a9: getstatic hzu.fz_ Lhzu$_0v;
      // ac: iload 0
      // ad: putfield hzu$_0v.s92 I
      // b0: getstatic hzu.fz_ Lhzu$_0v;
      // b3: iload 1
      // b4: putfield hzu$_0v.__z I
      // b7: invokestatic hxt.ly3 ()Z
      // ba: goto c1
      // bd: invokestatic hzu.a (Loov;)Loov;
      // c0: athrow
      // c1: iload 2
      // c2: ifeq e1
      // c5: ifeq e0
      // c8: goto cf
      // cb: invokestatic hzu.a (Loov;)Loov;
      // ce: athrow
      // cf: getstatic net/optifine/shaders/Shaders.uniform_blendFunc Lnet/optifine/shaders/uniform/ShaderUniform4i;
      // d2: iload 0
      // d3: iload 1
      // d4: iload 0
      // d5: iload 1
      // d6: invokevirtual net/optifine/shaders/uniform/ShaderUniform4i.setValue (IIII)V
      // d9: goto e0
      // dc: invokestatic hzu.a (Loov;)Loov;
      // df: athrow
      // e0: iload 0
      // e1: iload 1
      // e2: invokestatic org/lwjgl/opengl/GL11.glBlendFunc (II)V
      // e5: return
   }

   public static void u39(int param0, int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 08: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0b: iload 4
      // 0d: ifne 38
      // 10: ifeq 30
      // 13: goto 1a
      // 16: invokestatic hzu.a (Loov;)Loov;
      // 19: athrow
      // 1a: getstatic hzu.lh9 Lnet/optifine/render/GlBlendState;
      // 1d: iload 0
      // 1e: iload 1
      // 1f: iload 2
      // 20: iload 3
      // 21: invokevirtual net/optifine/render/GlBlendState.setFactors (IIII)V
      // 24: iload 4
      // 26: ifeq f1
      // 29: goto 30
      // 2c: invokestatic hzu.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 0
      // 31: goto 38
      // 34: invokestatic hzu.a (Loov;)Loov;
      // 37: athrow
      // 38: iload 4
      // 3a: ifne ca
      // 3d: getstatic hzu.fz_ Lhzu$_0v;
      // 40: getfield hzu$_0v.gx3 I
      // 43: if_icmpne a4
      // 46: goto 4d
      // 49: invokestatic hzu.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 1
      // 4e: iload 4
      // 50: ifne ca
      // 53: goto 5a
      // 56: invokestatic hzu.a (Loov;)Loov;
      // 59: athrow
      // 5a: getstatic hzu.fz_ Lhzu$_0v;
      // 5d: getfield hzu$_0v.h_g I
      // 60: if_icmpne a4
      // 63: goto 6a
      // 66: invokestatic hzu.a (Loov;)Loov;
      // 69: athrow
      // 6a: iload 2
      // 6b: iload 4
      // 6d: ifne ca
      // 70: goto 77
      // 73: invokestatic hzu.a (Loov;)Loov;
      // 76: athrow
      // 77: getstatic hzu.fz_ Lhzu$_0v;
      // 7a: getfield hzu$_0v.s92 I
      // 7d: if_icmpne a4
      // 80: goto 87
      // 83: invokestatic hzu.a (Loov;)Loov;
      // 86: athrow
      // 87: iload 3
      // 88: iload 4
      // 8a: ifne ca
      // 8d: goto 94
      // 90: invokestatic hzu.a (Loov;)Loov;
      // 93: athrow
      // 94: getstatic hzu.fz_ Lhzu$_0v;
      // 97: getfield hzu$_0v.__z I
      // 9a: if_icmpeq f1
      // 9d: goto a4
      // a0: invokestatic hzu.a (Loov;)Loov;
      // a3: athrow
      // a4: getstatic hzu.fz_ Lhzu$_0v;
      // a7: iload 0
      // a8: putfield hzu$_0v.gx3 I
      // ab: getstatic hzu.fz_ Lhzu$_0v;
      // ae: iload 1
      // af: putfield hzu$_0v.h_g I
      // b2: getstatic hzu.fz_ Lhzu$_0v;
      // b5: iload 2
      // b6: putfield hzu$_0v.s92 I
      // b9: getstatic hzu.fz_ Lhzu$_0v;
      // bc: iload 3
      // bd: putfield hzu$_0v.__z I
      // c0: invokestatic hxt.ly3 ()Z
      // c3: goto ca
      // c6: invokestatic hzu.a (Loov;)Loov;
      // c9: athrow
      // ca: iload 4
      // cc: ifne eb
      // cf: ifeq ea
      // d2: goto d9
      // d5: invokestatic hzu.a (Loov;)Loov;
      // d8: athrow
      // d9: getstatic net/optifine/shaders/Shaders.uniform_blendFunc Lnet/optifine/shaders/uniform/ShaderUniform4i;
      // dc: iload 0
      // dd: iload 1
      // de: iload 2
      // df: iload 3
      // e0: invokevirtual net/optifine/shaders/uniform/ShaderUniform4i.setValue (IIII)V
      // e3: goto ea
      // e6: invokestatic hzu.a (Loov;)Loov;
      // e9: athrow
      // ea: iload 0
      // eb: iload 1
      // ec: iload 2
      // ed: iload 3
      // ee: invokestatic gis.y03 (IIII)V
      // f1: return
   }

   public static void xmh() {
      nvq.cgd.mdn();
   }

   public static void gcp() {
      nvq.cgd.iiq();
   }

   public static void _om(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: getstatic hzu.nvq Lhzu$amh;
      // 08: getfield hzu$amh.q2h I
      // 0b: iload 1
      // 0c: ifeq 2b
      // 0f: if_icmpeq 43
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic hzu.nvq Lhzu$amh;
      // 1c: iload 0
      // 1d: putfield hzu$amh.q2h I
      // 20: sipush 2917
      // 23: iload 0
      // 24: goto 2b
      // 27: invokestatic hzu.a (Loov;)Loov;
      // 2a: athrow
      // 2b: invokestatic org/lwjgl/opengl/GL11.glFogi (II)V
      // 2e: invokestatic hxt.ly3 ()Z
      // 31: iload 1
      // 32: ifeq 40
      // 35: ifeq 43
      // 38: goto 3f
      // 3b: invokestatic hzu.a (Loov;)Loov;
      // 3e: athrow
      // 3f: iload 0
      // 40: invokestatic net/optifine/shaders/Shaders.setFogMode (I)V
      // 43: return
   }

   public static void wz1(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: fload 0
      // 05: fconst_0
      // 06: fcmpg
      // 07: iload 1
      // 08: ifeq 1f
      // 0b: ifge 17
      // 0e: goto 15
      // 11: invokestatic hzu.a (Loov;)Loov;
      // 14: athrow
      // 15: fconst_0
      // 16: fstore 0
      // 17: fload 0
      // 18: getstatic hzu.nvq Lhzu$amh;
      // 1b: getfield hzu$amh.x4u F
      // 1e: fcmpl
      // 1f: iload 1
      // 20: ifeq 45
      // 23: ifeq 53
      // 26: goto 2d
      // 29: invokestatic hzu.a (Loov;)Loov;
      // 2c: athrow
      // 2d: getstatic hzu.nvq Lhzu$amh;
      // 30: fload 0
      // 31: putfield hzu$amh.x4u F
      // 34: sipush 2914
      // 37: fload 0
      // 38: invokestatic org/lwjgl/opengl/GL11.glFogf (IF)V
      // 3b: invokestatic hxt.ly3 ()Z
      // 3e: goto 45
      // 41: invokestatic hzu.a (Loov;)Loov;
      // 44: athrow
      // 45: ifeq 53
      // 48: fload 0
      // 49: invokestatic net/optifine/shaders/Shaders.setFogDensity (F)V
      // 4c: goto 53
      // 4f: invokestatic hzu.a (Loov;)Loov;
      // 52: athrow
      // 53: return
   }

   public static void j68(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: fload 0
      // 05: getstatic hzu.nvq Lhzu$amh;
      // 08: getfield hzu$amh.zzl F
      // 0b: fcmpl
      // 0c: iload 1
      // 0d: ifne 2b
      // 10: ifeq 2f
      // 13: goto 1a
      // 16: invokestatic hzu.a (Loov;)Loov;
      // 19: athrow
      // 1a: getstatic hzu.nvq Lhzu$amh;
      // 1d: fload 0
      // 1e: putfield hzu$amh.zzl F
      // 21: sipush 2915
      // 24: goto 2b
      // 27: invokestatic hzu.a (Loov;)Loov;
      // 2a: athrow
      // 2b: fload 0
      // 2c: invokestatic org/lwjgl/opengl/GL11.glFogf (IF)V
      // 2f: return
   }

   public static void cax(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: fload 0
      // 05: getstatic hzu.nvq Lhzu$amh;
      // 08: getfield hzu$amh._v3 F
      // 0b: fcmpl
      // 0c: iload 1
      // 0d: ifeq 2b
      // 10: ifeq 2f
      // 13: goto 1a
      // 16: invokestatic hzu.a (Loov;)Loov;
      // 19: athrow
      // 1a: getstatic hzu.nvq Lhzu$amh;
      // 1d: fload 0
      // 1e: putfield hzu$amh._v3 F
      // 21: sipush 2916
      // 24: goto 2b
      // 27: invokestatic hzu.a (Loov;)Loov;
      // 2a: athrow
      // 2b: fload 0
      // 2c: invokestatic org/lwjgl/opengl/GL11.glFogf (IF)V
      // 2f: return
   }

   public static void xwl(int var0, FloatBuffer var1) {
      GL11.glFog(var0, var1);
   }

   public static void tl6(int var0, int var1) {
      GL11.glFogi(var0, var1);
   }

   public static void gp4() {
      gad.idz.mdn();
   }

   public static void o1b() {
      gad.idz.iiq();
   }

   public static void cf8(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 28
      // 09: getstatic hzu.gad Lhzu$sog;
      // 0c: getfield hzu$sog.xqa I
      // 0f: if_icmpeq 2b
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic hzu.gad Lhzu$sog;
      // 1c: iload 0
      // 1d: putfield hzu$sog.xqa I
      // 20: iload 0
      // 21: goto 28
      // 24: invokestatic hzu.a (Loov;)Loov;
      // 27: athrow
      // 28: invokestatic org/lwjgl/opengl/GL11.glCullFace (I)V
      // 2b: return
   }

   public static void ktr() {
      s_z.c96.mdn();
   }

   public static void q6d() {
      s_z.c96.iiq();
   }

   public static void fex(float param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: fload 0
      // 05: getstatic hzu.s_z Lhzu$iia;
      // 08: getfield hzu$iia.c5i F
      // 0b: iload 2
      // 0c: ifeq 4e
      // 0f: fcmpl
      // 10: ifne 37
      // 13: goto 1a
      // 16: invokestatic hzu.a (Loov;)Loov;
      // 19: athrow
      // 1a: fload 1
      // 1b: getstatic hzu.s_z Lhzu$iia;
      // 1e: getfield hzu$iia.cv1 F
      // 21: iload 2
      // 22: ifeq 4e
      // 25: goto 2c
      // 28: invokestatic hzu.a (Loov;)Loov;
      // 2b: athrow
      // 2c: fcmpl
      // 2d: ifeq 51
      // 30: goto 37
      // 33: invokestatic hzu.a (Loov;)Loov;
      // 36: athrow
      // 37: getstatic hzu.s_z Lhzu$iia;
      // 3a: fload 0
      // 3b: putfield hzu$iia.c5i F
      // 3e: getstatic hzu.s_z Lhzu$iia;
      // 41: fload 1
      // 42: putfield hzu$iia.cv1 F
      // 45: fload 0
      // 46: fload 1
      // 47: goto 4e
      // 4a: invokestatic hzu.a (Loov;)Loov;
      // 4d: athrow
      // 4e: invokestatic org/lwjgl/opengl/GL11.glPolygonOffset (FF)V
      // 51: return
   }

   public static void mib() {
      ax9.e04.mdn();
   }

   public static void gyq() {
      ax9.e04.iiq();
   }

   public static void njz(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 28
      // 09: getstatic hzu.ax9 Lhzu$oe1;
      // 0c: getfield hzu$oe1.f6i I
      // 0f: if_icmpeq 2b
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic hzu.ax9 Lhzu$oe1;
      // 1c: iload 0
      // 1d: putfield hzu$oe1.f6i I
      // 20: iload 0
      // 21: goto 28
      // 24: invokestatic hzu.a (Loov;)Loov;
      // 27: athrow
      // 28: invokestatic org/lwjgl/opengl/GL11.glLogicOp (I)V
      // 2b: return
   }

   public static void bwb(hzu$lzb var0) {
      ko9(var0).zqd.mdn();
   }

   public static void ea_(hzu$lzb var0) {
      ko9(var0).zqd.iiq();
   }

   public static void _z3(hzu$lzb param0, int param1) {
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
      // 05: invokestatic hzu.ko9 (Lhzu$lzb;)Lhzu$mcs;
      // 08: astore 3
      // 09: iload 1
      // 0a: aload 3
      // 0b: getfield hzu$mcs.kry I
      // 0e: iload 2
      // 0f: ifne 2f
      // 12: if_icmpeq 33
      // 15: goto 1c
      // 18: invokestatic hzu.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 3
      // 1d: iload 1
      // 1e: putfield hzu$mcs.kry I
      // 21: aload 3
      // 22: getfield hzu$mcs.p9_ I
      // 25: sipush 9472
      // 28: goto 2f
      // 2b: invokestatic hzu.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 1
      // 30: invokestatic org/lwjgl/opengl/GL11.glTexGeni (III)V
      // 33: return
   }

   public static void _p4(hzu$lzb var0, int var1, FloatBuffer var2) {
      GL11.glTexGen(ko9(var0).p9_, var1, var2);
   }

   private static hzu$mcs ko9(hzu$lzb var0) {
      try {
         switch (hzu$1.ho0[var0.ordinal()]) {
            case 1:
               return zzp.zmf;
            case 2:
               return zzp.azb;
            case 3:
               return zzp.vam;
            case 4:
               return zzp.mxb;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return zzp.zmf;
   }

   public static void qon(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic hzu.i98 I
      // 07: iload 0
      // 08: getstatic gis.z1w I
      // 0b: isub
      // 0c: iload 1
      // 0d: ifne 25
      // 10: if_icmpeq 2d
      // 13: goto 1a
      // 16: invokestatic hzu.a (Loov;)Loov;
      // 19: athrow
      // 1a: iload 0
      // 1b: getstatic gis.z1w I
      // 1e: goto 25
      // 21: invokestatic hzu.a (Loov;)Loov;
      // 24: athrow
      // 25: isub
      // 26: putstatic hzu.i98 I
      // 29: iload 0
      // 2a: invokestatic gis.k6v (I)V
      // 2d: return
   }

   public static void rqj() {
      i20[i98]._57.mdn();
   }

   public static void m_1() {
      i20[i98]._57.iiq();
   }

   public static int vat() {
      return GL11.glGenTextures();
   }

   public static void r22(int var0) {
      if (var0 != 0) {
         GL11.glDeleteTextures(var0);

         for (hzu$w2h var4 : i20) {
            try {
               if (var4.fb0 == var0) {
                  var4.fb0 = 0;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }
      }
   }

   public static void t30(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 0
      // 01: getstatic hzu.i20 [Lhzu$w2h;
      // 04: getstatic hzu.i98 I
      // 07: aaload
      // 08: getfield hzu$w2h.fb0 I
      // 0b: if_icmpeq 38
      // 0e: getstatic hzu.i20 [Lhzu$w2h;
      // 11: getstatic hzu.i98 I
      // 14: aaload
      // 15: iload 0
      // 16: putfield hzu$w2h.fb0 I
      // 19: sipush 3553
      // 1c: iload 0
      // 1d: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 20: invokestatic net/optifine/SmartAnimations.isActive ()Z
      // 23: ifeq 38
      // 26: goto 2d
      // 29: invokestatic hzu.a (Loov;)Loov;
      // 2c: athrow
      // 2d: iload 0
      // 2e: invokestatic net/optifine/SmartAnimations.textureRendered (I)V
      // 31: goto 38
      // 34: invokestatic hzu.a (Loov;)Loov;
      // 37: athrow
      // 38: return
   }

   public static void j6u() {
      wux.mdn();
   }

   public static void piz() {
      wux.iiq();
   }

   public static void nn9(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 22
      // 09: getstatic hzu.zh_ I
      // 0c: if_icmpeq 25
      // 0f: goto 16
      // 12: invokestatic hzu.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 0
      // 17: putstatic hzu.zh_ I
      // 1a: iload 0
      // 1b: goto 22
      // 1e: invokestatic hzu.a (Loov;)Loov;
      // 21: athrow
      // 22: invokestatic org/lwjgl/opengl/GL11.glShadeModel (I)V
      // 25: return
   }

   public static void ixc() {
      cnc.mdn();
   }

   public static void eiq() {
      cnc.iiq();
   }

   public static void fb6(int var0, int var1, int var2, int var3) {
      GL11.glViewport(var0, var1, var2, var3);
   }

   public static void y4q(boolean param0, boolean param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: iload 0
      // 06: getstatic hzu.jti Lhzu$i8u;
      // 09: getfield hzu$i8u.myx Z
      // 0c: iload 4
      // 0e: ifne 97
      // 11: if_icmpne 72
      // 14: goto 1b
      // 17: invokestatic hzu.a (Loov;)Loov;
      // 1a: athrow
      // 1b: iload 1
      // 1c: getstatic hzu.jti Lhzu$i8u;
      // 1f: getfield hzu$i8u.ktk Z
      // 22: iload 4
      // 24: ifne 97
      // 27: goto 2e
      // 2a: invokestatic hzu.a (Loov;)Loov;
      // 2d: athrow
      // 2e: if_icmpne 72
      // 31: goto 38
      // 34: invokestatic hzu.a (Loov;)Loov;
      // 37: athrow
      // 38: iload 2
      // 39: getstatic hzu.jti Lhzu$i8u;
      // 3c: getfield hzu$i8u.ohi Z
      // 3f: iload 4
      // 41: ifne 97
      // 44: goto 4b
      // 47: invokestatic hzu.a (Loov;)Loov;
      // 4a: athrow
      // 4b: if_icmpne 72
      // 4e: goto 55
      // 51: invokestatic hzu.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 3
      // 56: getstatic hzu.jti Lhzu$i8u;
      // 59: getfield hzu$i8u.k8d Z
      // 5c: iload 4
      // 5e: ifne 97
      // 61: goto 68
      // 64: invokestatic hzu.a (Loov;)Loov;
      // 67: athrow
      // 68: if_icmpeq 9c
      // 6b: goto 72
      // 6e: invokestatic hzu.a (Loov;)Loov;
      // 71: athrow
      // 72: getstatic hzu.jti Lhzu$i8u;
      // 75: iload 0
      // 76: putfield hzu$i8u.myx Z
      // 79: getstatic hzu.jti Lhzu$i8u;
      // 7c: iload 1
      // 7d: putfield hzu$i8u.ktk Z
      // 80: getstatic hzu.jti Lhzu$i8u;
      // 83: iload 2
      // 84: putfield hzu$i8u.ohi Z
      // 87: getstatic hzu.jti Lhzu$i8u;
      // 8a: iload 3
      // 8b: putfield hzu$i8u.k8d Z
      // 8e: iload 0
      // 8f: iload 1
      // 90: goto 97
      // 93: invokestatic hzu.a (Loov;)Loov;
      // 96: athrow
      // 97: iload 2
      // 98: iload 3
      // 99: invokestatic org/lwjgl/opengl/GL11.glColorMask (ZZZZ)V
      // 9c: return
   }

   public static void kc_(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: dload 0
      // 05: iload 2
      // 06: ifne 29
      // 09: getstatic hzu.jrq Lhzu$odz;
      // 0c: getfield hzu$odz.eb4 D
      // 0f: dcmpl
      // 10: ifeq 2c
      // 13: goto 1a
      // 16: invokestatic hzu.a (Loov;)Loov;
      // 19: athrow
      // 1a: getstatic hzu.jrq Lhzu$odz;
      // 1d: dload 0
      // 1e: putfield hzu$odz.eb4 D
      // 21: dload 0
      // 22: goto 29
      // 25: invokestatic hzu.a (Loov;)Loov;
      // 28: athrow
      // 29: invokestatic org/lwjgl/opengl/GL11.glClearDepth (D)V
      // 2c: return
   }

   public static void ejn(float param0, float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: fload 0
      // 06: getstatic hzu.jrq Lhzu$odz;
      // 09: getfield hzu$odz.__l Lhzu$v9h;
      // 0c: getfield hzu$v9h.jua F
      // 0f: iload 4
      // 11: ifeq b3
      // 14: fcmpl
      // 15: ifne 82
      // 18: goto 1f
      // 1b: invokestatic hzu.a (Loov;)Loov;
      // 1e: athrow
      // 1f: fload 1
      // 20: getstatic hzu.jrq Lhzu$odz;
      // 23: getfield hzu$odz.__l Lhzu$v9h;
      // 26: getfield hzu$v9h.xtj F
      // 29: iload 4
      // 2b: ifeq b3
      // 2e: goto 35
      // 31: invokestatic hzu.a (Loov;)Loov;
      // 34: athrow
      // 35: fcmpl
      // 36: ifne 82
      // 39: goto 40
      // 3c: invokestatic hzu.a (Loov;)Loov;
      // 3f: athrow
      // 40: fload 2
      // 41: getstatic hzu.jrq Lhzu$odz;
      // 44: getfield hzu$odz.__l Lhzu$v9h;
      // 47: getfield hzu$v9h.zms F
      // 4a: iload 4
      // 4c: ifeq b3
      // 4f: goto 56
      // 52: invokestatic hzu.a (Loov;)Loov;
      // 55: athrow
      // 56: fcmpl
      // 57: ifne 82
      // 5a: goto 61
      // 5d: invokestatic hzu.a (Loov;)Loov;
      // 60: athrow
      // 61: fload 3
      // 62: getstatic hzu.jrq Lhzu$odz;
      // 65: getfield hzu$odz.__l Lhzu$v9h;
      // 68: getfield hzu$v9h.fdy F
      // 6b: iload 4
      // 6d: ifeq b3
      // 70: goto 77
      // 73: invokestatic hzu.a (Loov;)Loov;
      // 76: athrow
      // 77: fcmpl
      // 78: ifeq b8
      // 7b: goto 82
      // 7e: invokestatic hzu.a (Loov;)Loov;
      // 81: athrow
      // 82: getstatic hzu.jrq Lhzu$odz;
      // 85: getfield hzu$odz.__l Lhzu$v9h;
      // 88: fload 0
      // 89: putfield hzu$v9h.jua F
      // 8c: getstatic hzu.jrq Lhzu$odz;
      // 8f: getfield hzu$odz.__l Lhzu$v9h;
      // 92: fload 1
      // 93: putfield hzu$v9h.xtj F
      // 96: getstatic hzu.jrq Lhzu$odz;
      // 99: getfield hzu$odz.__l Lhzu$v9h;
      // 9c: fload 2
      // 9d: putfield hzu$v9h.zms F
      // a0: getstatic hzu.jrq Lhzu$odz;
      // a3: getfield hzu$odz.__l Lhzu$v9h;
      // a6: fload 3
      // a7: putfield hzu$v9h.fdy F
      // aa: fload 0
      // ab: fload 1
      // ac: goto b3
      // af: invokestatic hzu.a (Loov;)Loov;
      // b2: athrow
      // b3: fload 2
      // b4: fload 3
      // b5: invokestatic org/lwjgl/opengl/GL11.glClearColor (FFFF)V
      // b8: return
   }

   public static void yg5(int var0) {
      int var1 = OpaquePredicate.b();

      int var10000;
      label20: {
         try {
            var10000 = w2k;
            if (var1 == 0) {
               break label20;
            }

            if (!w2k) {
               return;
            }
         } catch (oov var2) {
            throw a(var2);
         }

         var10000 = var0;
      }

      GL11.glClear(var10000);
   }

   public static void ah8(int var0) {
      GL11.glMatrixMode(var0);
   }

   public static void zwy() {
      GL11.glLoadIdentity();
   }

   public static void dp2() {
      GL11.glPushMatrix();
   }

   public static void x3w() {
      GL11.glPopMatrix();
   }

   public static void i56(int var0, FloatBuffer var1) {
      GL11.glGetFloat(var0, var1);
   }

   public static void bj8(double var0, double var2, double var4, double var6, double var8, double var10) {
      GL11.glOrtho(var0, var2, var4, var6, var8, var10);
   }

   public static void a2h(float var0, float var1, float var2, float var3) {
      GL11.glRotatef(var0, var1, var2, var3);
   }

   public static void syc(float var0, float var1, float var2) {
      GL11.glScalef(var0, var1, var2);
   }

   public static void bvy(double var0, double var2, double var4) {
      GL11.glScaled(var0, var2, var4);
   }

   public static void a4k(float var0, float var1, float var2) {
      GL11.glTranslatef(var0, var1, var2);
   }

   public static void hsv(double var0, double var2, double var4) {
      GL11.glTranslated(var0, var2, var4);
   }

   public static void rwd(FloatBuffer var0) {
      GL11.glMultMatrix(var0);
   }

   public static void wn0(float param0, float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: fload 0
      // 06: getstatic hzu.faq Lhzu$v9h;
      // 09: getfield hzu$v9h.jua F
      // 0c: iload 4
      // 0e: ifne 9b
      // 11: fcmpl
      // 12: ifne 76
      // 15: goto 1c
      // 18: invokestatic hzu.a (Loov;)Loov;
      // 1b: athrow
      // 1c: fload 1
      // 1d: getstatic hzu.faq Lhzu$v9h;
      // 20: getfield hzu$v9h.xtj F
      // 23: iload 4
      // 25: ifne 9b
      // 28: goto 2f
      // 2b: invokestatic hzu.a (Loov;)Loov;
      // 2e: athrow
      // 2f: fcmpl
      // 30: ifne 76
      // 33: goto 3a
      // 36: invokestatic hzu.a (Loov;)Loov;
      // 39: athrow
      // 3a: fload 2
      // 3b: getstatic hzu.faq Lhzu$v9h;
      // 3e: getfield hzu$v9h.zms F
      // 41: iload 4
      // 43: ifne 9b
      // 46: goto 4d
      // 49: invokestatic hzu.a (Loov;)Loov;
      // 4c: athrow
      // 4d: fcmpl
      // 4e: ifne 76
      // 51: goto 58
      // 54: invokestatic hzu.a (Loov;)Loov;
      // 57: athrow
      // 58: fload 3
      // 59: getstatic hzu.faq Lhzu$v9h;
      // 5c: getfield hzu$v9h.fdy F
      // 5f: iload 4
      // 61: ifne 9b
      // 64: goto 6b
      // 67: invokestatic hzu.a (Loov;)Loov;
      // 6a: athrow
      // 6b: fcmpl
      // 6c: ifeq a0
      // 6f: goto 76
      // 72: invokestatic hzu.a (Loov;)Loov;
      // 75: athrow
      // 76: getstatic hzu.faq Lhzu$v9h;
      // 79: fload 0
      // 7a: putfield hzu$v9h.jua F
      // 7d: getstatic hzu.faq Lhzu$v9h;
      // 80: fload 1
      // 81: putfield hzu$v9h.xtj F
      // 84: getstatic hzu.faq Lhzu$v9h;
      // 87: fload 2
      // 88: putfield hzu$v9h.zms F
      // 8b: getstatic hzu.faq Lhzu$v9h;
      // 8e: fload 3
      // 8f: putfield hzu$v9h.fdy F
      // 92: fload 0
      // 93: fload 1
      // 94: goto 9b
      // 97: invokestatic hzu.a (Loov;)Loov;
      // 9a: athrow
      // 9b: fload 2
      // 9c: fload 3
      // 9d: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // a0: return
   }

   public static void oxa(float var0, float var1, float var2) {
      wn0(var0, var1, var2, 1.0F);
   }

   public static void u49() {
      faq.jua = faq.xtj = faq.zms = faq.fdy = -1.0F;
   }

   public static void h1k(int var0, int var1, ByteBuffer var2) {
      GL11.glNormalPointer(var0, var1, var2);
   }

   public static void a9p(int var0, int var1, int var2, int var3) {
      GL11.glTexCoordPointer(var0, var1, var2, (long)var3);
   }

   public static void tr1(int var0, int var1, int var2, ByteBuffer var3) {
      GL11.glTexCoordPointer(var0, var1, var2, var3);
   }

   public static void x4r(int var0, int var1, int var2, int var3) {
      GL11.glVertexPointer(var0, var1, var2, (long)var3);
   }

   public static void jvb(int var0, int var1, int var2, ByteBuffer var3) {
      GL11.glVertexPointer(var0, var1, var2, var3);
   }

   public static void a27(int var0, int var1, int var2, int var3) {
      GL11.glColorPointer(var0, var1, var2, (long)var3);
   }

   public static void s7z(int var0, int var1, int var2, ByteBuffer var3) {
      GL11.glColorPointer(var0, var1, var2, var3);
   }

   public static void cwt(int var0) {
      GL11.glDisableClientState(var0);
   }

   public static void k4h(int var0) {
      GL11.glEnableClientState(var0);
   }

   public static void fbb(int var0) {
      GL11.glBegin(var0);
   }

   public static void i10() {
      GL11.glEnd();
   }

   public static void dtm(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 0
      // 05: iload 1
      // 06: iload 2
      // 07: invokestatic org/lwjgl/opengl/GL11.glDrawArrays (III)V
      // 0a: invokestatic hxt.ly3 ()Z
      // 0d: iload 3
      // 0e: ifeq 1e
      // 11: ifeq 84
      // 14: goto 1b
      // 17: invokestatic hzu.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic hzu.iqv Z
      // 1e: iload 3
      // 1f: ifeq 39
      // 22: ifne 84
      // 25: goto 2c
      // 28: invokestatic hzu.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic net/optifine/shaders/Shaders.activeProgram Lnet/optifine/shaders/Program;
      // 2f: invokevirtual net/optifine/shaders/Program.getCountInstances ()I
      // 32: goto 39
      // 35: invokestatic hzu.a (Loov;)Loov;
      // 38: athrow
      // 39: istore 4
      // 3b: iload 4
      // 3d: iload 3
      // 3e: ifeq 54
      // 41: bipush 1
      // 42: if_icmple 84
      // 45: goto 4c
      // 48: invokestatic hzu.a (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 54
      // 50: invokestatic hzu.a (Loov;)Loov;
      // 53: athrow
      // 54: istore 5
      // 56: iload 5
      // 58: iload 4
      // 5a: if_icmpge 7d
      // 5d: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 60: iload 5
      // 62: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 65: iload 0
      // 66: iload 1
      // 67: iload 2
      // 68: invokestatic org/lwjgl/opengl/GL11.glDrawArrays (III)V
      // 6b: iinc 5 1
      // 6e: iload 3
      // 6f: ifeq 84
      // 72: iload 3
      // 73: ifne 56
      // 76: goto 7d
      // 79: invokestatic hzu.a (Loov;)Loov;
      // 7c: athrow
      // 7d: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 80: bipush 0
      // 81: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 84: return
   }

   public static void bcf(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: invokestatic org/lwjgl/opengl/GL11.glCallList (I)V
      // 08: invokestatic hxt.ly3 ()Z
      // 0b: iload 1
      // 0c: ifeq 1c
      // 0f: ifeq 7a
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic hzu.iqv Z
      // 1c: iload 1
      // 1d: ifeq 37
      // 20: ifne 7a
      // 23: goto 2a
      // 26: invokestatic hzu.a (Loov;)Loov;
      // 29: athrow
      // 2a: getstatic net/optifine/shaders/Shaders.activeProgram Lnet/optifine/shaders/Program;
      // 2d: invokevirtual net/optifine/shaders/Program.getCountInstances ()I
      // 30: goto 37
      // 33: invokestatic hzu.a (Loov;)Loov;
      // 36: athrow
      // 37: istore 2
      // 38: iload 2
      // 39: iload 1
      // 3a: ifeq 50
      // 3d: bipush 1
      // 3e: if_icmple 7a
      // 41: goto 48
      // 44: invokestatic hzu.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 50
      // 4c: invokestatic hzu.a (Loov;)Loov;
      // 4f: athrow
      // 50: istore 3
      // 51: iload 3
      // 52: iload 2
      // 53: if_icmpge 73
      // 56: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 59: iload 3
      // 5a: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 5d: iload 0
      // 5e: invokestatic org/lwjgl/opengl/GL11.glCallList (I)V
      // 61: iinc 3 1
      // 64: iload 1
      // 65: ifeq 7a
      // 68: iload 1
      // 69: ifne 51
      // 6c: goto 73
      // 6f: invokestatic hzu.a (Loov;)Loov;
      // 72: athrow
      // 73: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 76: bipush 0
      // 77: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 7a: return
   }

   public static void jzt(IntBuffer param0) {
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
      // 05: invokestatic org/lwjgl/opengl/GL11.glCallLists (Ljava/nio/IntBuffer;)V
      // 08: invokestatic hxt.ly3 ()Z
      // 0b: iload 1
      // 0c: ifeq 1c
      // 0f: ifeq 7a
      // 12: goto 19
      // 15: invokestatic hzu.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic hzu.iqv Z
      // 1c: iload 1
      // 1d: ifeq 37
      // 20: ifne 7a
      // 23: goto 2a
      // 26: invokestatic hzu.a (Loov;)Loov;
      // 29: athrow
      // 2a: getstatic net/optifine/shaders/Shaders.activeProgram Lnet/optifine/shaders/Program;
      // 2d: invokevirtual net/optifine/shaders/Program.getCountInstances ()I
      // 30: goto 37
      // 33: invokestatic hzu.a (Loov;)Loov;
      // 36: athrow
      // 37: istore 2
      // 38: iload 2
      // 39: iload 1
      // 3a: ifeq 50
      // 3d: bipush 1
      // 3e: if_icmple 7a
      // 41: goto 48
      // 44: invokestatic hzu.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 50
      // 4c: invokestatic hzu.a (Loov;)Loov;
      // 4f: athrow
      // 50: istore 3
      // 51: iload 3
      // 52: iload 2
      // 53: if_icmpge 73
      // 56: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 59: iload 3
      // 5a: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 5d: aload 0
      // 5e: invokestatic org/lwjgl/opengl/GL11.glCallLists (Ljava/nio/IntBuffer;)V
      // 61: iinc 3 1
      // 64: iload 1
      // 65: ifeq 7a
      // 68: iload 1
      // 69: ifne 51
      // 6c: goto 73
      // 6f: invokestatic hzu.a (Loov;)Loov;
      // 72: athrow
      // 73: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 76: bipush 0
      // 77: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 7a: return
   }

   public static void q8_(int var0, int var1) {
      GL11.glDeleteLists(var0, var1);
   }

   public static void qsg(int var0, int var1) {
      GL11.glNewList(var0, var1);
      iqv = true;
   }

   public static void qkq() {
      GL11.glEndList();
      iqv = false;
   }

   public static int rzm() {
      return GL11.glGetError();
   }

   public static void kjf(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      GL11.glTexImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void un9(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, IntBuffer var8) {
      GL11.glTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void pdl(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      GL11.glCopyTexSubImage2D(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public static void vj8(int var0, int var1, int var2, int var3, IntBuffer var4) {
      GL11.glGetTexImage(var0, var1, var2, var3, var4);
   }

   public static void nsg(int var0, int var1, float var2) {
      GL11.glTexParameterf(var0, var1, var2);
   }

   public static void zp6(int var0, int var1, int var2) {
      GL11.glTexParameteri(var0, var1, var2);
   }

   public static int f9e(int var0, int var1, int var2) {
      return GL11.glGetTexLevelParameteri(var0, var1, var2);
   }

   public static int hs6() {
      return gis.z1w + i98;
   }

   public static void s_l() {
      GL11.glBindTexture(3553, i20[i98].fb0);
   }

   public static int dit() {
      return i20[i98].fb0;
   }

   public static void i8x() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hzu.a J
      // 03: ldc2_w 17365804651677
      // 06: lxor
      // 07: lstore 0
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 2
      // 0c: invokestatic hxt.nzs ()Z
      // 0f: iload 2
      // 10: ifeq 2a
      // 13: ifeq d7
      // 16: goto 1d
      // 19: invokestatic hzu.a (Loov;)Loov;
      // 1c: athrow
      // 1d: ldc 34016
      // 1f: nop
      // 20: invokestatic org/lwjgl/opengl/GL11.glGetInteger (I)I
      // 23: goto 2a
      // 26: invokestatic hzu.a (Loov;)Loov;
      // 29: athrow
      // 2a: istore 3
      // 2b: ldc 32873
      // 2d: nop
      // 2e: invokestatic org/lwjgl/opengl/GL11.glGetInteger (I)I
      // 31: istore 4
      // 33: invokestatic hzu.hs6 ()I
      // 36: istore 5
      // 38: invokestatic hzu.dit ()I
      // 3b: istore 6
      // 3d: iload 6
      // 3f: iload 2
      // 40: ifeq 4e
      // 43: ifle d7
      // 46: goto 4d
      // 49: invokestatic hzu.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 3
      // 4e: iload 5
      // 50: iload 2
      // 51: ifeq 69
      // 54: if_icmpne 6c
      // 57: goto 5e
      // 5a: invokestatic hzu.a (Loov;)Loov;
      // 5d: athrow
      // 5e: iload 4
      // 60: iload 6
      // 62: goto 69
      // 65: invokestatic hzu.a (Loov;)Loov;
      // 68: athrow
      // 69: if_icmpeq d7
      // 6c: new java/lang/StringBuilder
      // 6f: dup
      // 70: invokespecial java/lang/StringBuilder.<init> ()V
      // 73: sipush 20821
      // 76: ldc2_w 80226240027969115
      // 79: lload 0
      // 7a: lxor
      // 7b: invokedynamic o (IJ)Ljava/lang/String; bsm=hzu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: nop
      // 81: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 84: iload 5
      // 86: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 89: sipush 32132
      // 8c: ldc2_w 4130111143553100427
      // 8f: lload 0
      // 90: lxor
      // 91: invokedynamic o (IJ)Ljava/lang/String; bsm=hzu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: nop
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: iload 3
      // 9b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9e: sipush 23710
      // a1: ldc2_w 5152636420907682706
      // a4: lload 0
      // a5: lxor
      // a6: invokedynamic o (IJ)Ljava/lang/String; bsm=hzu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: nop
      // ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // af: iload 6
      // b1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b4: sipush 22342
      // b7: ldc2_w 1544948917277245515
      // ba: lload 0
      // bb: lxor
      // bc: invokedynamic o (IJ)Ljava/lang/String; bsm=hzu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: nop
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: iload 4
      // c7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // ca: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cd: invokestatic hxt.brd (Ljava/lang/String;)V
      // d0: goto d7
      // d3: invokestatic hzu.a (Loov;)Loov;
      // d6: athrow
      // d7: return
   }

   public static void ija(IntBuffer var0) {
      int var1 = OpaquePredicate.c();
      ((Buffer)var0).rewind();

      while (true) {
         if (var0.position() < var0.limit()) {
            int var2 = var0.get();

            try {
               r22(var2);
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (oov var3) {
               throw a(var3);
            }
         }

         ((Buffer)var0).rewind();
         break;
      }
   }

   public static boolean d_k() {
      return hzu$win.c8k(nvq.cgd);
   }

   public static void nrf(boolean var0) {
      nvq.cgd.awg(var0);
   }

   public static void _3o(GlAlphaState param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic hzu.a7x Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: iload 1
      // 0b: ifne 2f
      // 0e: ifne 30
      // 11: goto 18
      // 14: invokestatic hzu.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic hzu.z6w Lnet/optifine/render/GlAlphaState;
      // 1b: invokestatic hzu.qwh (Lnet/optifine/render/GlAlphaState;)V
      // 1e: aload 0
      // 1f: invokestatic hzu.nzc (Lnet/optifine/render/GlAlphaState;)V
      // 22: getstatic hzu.a7x Lnet/optifine/util/LockCounter;
      // 25: invokevirtual net/optifine/util/LockCounter.lock ()Z
      // 28: goto 2f
      // 2b: invokestatic hzu.a (Loov;)Loov;
      // 2e: athrow
      // 2f: pop
      // 30: return
   }

   public static void elt() {
      try {
         if (a7x.unlock()) {
            nzc(z6w);
         }
      } catch (oov var0) {
         throw a(var0);
      }
   }

   public static void qwh(GlAlphaState param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic hzu.a7x Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: ifeq 1f
      // 0d: aload 0
      // 0e: getstatic hzu.z6w Lnet/optifine/render/GlAlphaState;
      // 11: invokevirtual net/optifine/render/GlAlphaState.setState (Lnet/optifine/render/GlAlphaState;)V
      // 14: iload 1
      // 15: ifne 3f
      // 18: goto 1f
      // 1b: invokestatic hzu.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getstatic hzu.n7g Lhzu$igu;
      // 23: getfield hzu$igu.xvk Lhzu$win;
      // 26: invokestatic hzu$win.c8k (Lhzu$win;)Z
      // 29: getstatic hzu.n7g Lhzu$igu;
      // 2c: getfield hzu$igu.csu I
      // 2f: getstatic hzu.n7g Lhzu$igu;
      // 32: getfield hzu$igu.qjy F
      // 35: invokevirtual net/optifine/render/GlAlphaState.setState (ZIF)V
      // 38: goto 3f
      // 3b: invokestatic hzu.a (Loov;)Loov;
      // 3e: athrow
      // 3f: return
   }

   public static void nzc(GlAlphaState param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic hzu.a7x Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: iload 1
      // 0b: ifne 42
      // 0e: ifeq 2a
      // 11: goto 18
      // 14: invokestatic hzu.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic hzu.z6w Lnet/optifine/render/GlAlphaState;
      // 1b: aload 0
      // 1c: invokevirtual net/optifine/render/GlAlphaState.setState (Lnet/optifine/render/GlAlphaState;)V
      // 1f: iload 1
      // 20: ifeq 49
      // 23: goto 2a
      // 26: invokestatic hzu.a (Loov;)Loov;
      // 29: athrow
      // 2a: getstatic hzu.n7g Lhzu$igu;
      // 2d: getfield hzu$igu.xvk Lhzu$win;
      // 30: aload 0
      // 31: invokevirtual net/optifine/render/GlAlphaState.isEnabled ()Z
      // 34: invokevirtual hzu$win.awg (Z)V
      // 37: aload 0
      // 38: invokevirtual net/optifine/render/GlAlphaState.getFunc ()I
      // 3b: goto 42
      // 3e: invokestatic hzu.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: invokevirtual net/optifine/render/GlAlphaState.getRef ()F
      // 46: invokestatic hzu.fak (IF)V
      // 49: return
   }

   public static void h94(GlBlendState param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: iload 1
      // 0b: ifeq 2f
      // 0e: ifne 30
      // 11: goto 18
      // 14: invokestatic hzu.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic hzu.lh9 Lnet/optifine/render/GlBlendState;
      // 1b: invokestatic hzu.s4c (Lnet/optifine/render/GlBlendState;)V
      // 1e: aload 0
      // 1f: invokestatic hzu._wk (Lnet/optifine/render/GlBlendState;)V
      // 22: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 25: invokevirtual net/optifine/util/LockCounter.lock ()Z
      // 28: goto 2f
      // 2b: invokestatic hzu.a (Loov;)Loov;
      // 2e: athrow
      // 2f: pop
      // 30: return
   }

   public static void byl() {
      try {
         if (ojx.unlock()) {
            _wk(lh9);
         }
      } catch (oov var0) {
         throw a(var0);
      }
   }

   public static void s4c(GlBlendState param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: ifeq 1f
      // 0d: aload 0
      // 0e: getstatic hzu.lh9 Lnet/optifine/render/GlBlendState;
      // 11: invokevirtual net/optifine/render/GlBlendState.setState (Lnet/optifine/render/GlBlendState;)V
      // 14: iload 1
      // 15: ifeq 4b
      // 18: goto 1f
      // 1b: invokestatic hzu.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getstatic hzu.fz_ Lhzu$_0v;
      // 23: getfield hzu$_0v.ig9 Lhzu$win;
      // 26: invokestatic hzu$win.c8k (Lhzu$win;)Z
      // 29: getstatic hzu.fz_ Lhzu$_0v;
      // 2c: getfield hzu$_0v.gx3 I
      // 2f: getstatic hzu.fz_ Lhzu$_0v;
      // 32: getfield hzu$_0v.h_g I
      // 35: getstatic hzu.fz_ Lhzu$_0v;
      // 38: getfield hzu$_0v.s92 I
      // 3b: getstatic hzu.fz_ Lhzu$_0v;
      // 3e: getfield hzu$_0v.__z I
      // 41: invokevirtual net/optifine/render/GlBlendState.setState (ZIIII)V
      // 44: goto 4b
      // 47: invokestatic hzu.a (Loov;)Loov;
      // 4a: athrow
      // 4b: return
   }

   public static void _wk(GlBlendState param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic hzu.ojx Lnet/optifine/util/LockCounter;
      // 07: invokevirtual net/optifine/util/LockCounter.isLocked ()Z
      // 0a: iload 1
      // 0b: ifeq 42
      // 0e: ifeq 2a
      // 11: goto 18
      // 14: invokestatic hzu.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic hzu.lh9 Lnet/optifine/render/GlBlendState;
      // 1b: aload 0
      // 1c: invokevirtual net/optifine/render/GlBlendState.setState (Lnet/optifine/render/GlBlendState;)V
      // 1f: iload 1
      // 20: ifne 80
      // 23: goto 2a
      // 26: invokestatic hzu.a (Loov;)Loov;
      // 29: athrow
      // 2a: getstatic hzu.fz_ Lhzu$_0v;
      // 2d: getfield hzu$_0v.ig9 Lhzu$win;
      // 30: aload 0
      // 31: invokevirtual net/optifine/render/GlBlendState.isEnabled ()Z
      // 34: invokevirtual hzu$win.awg (Z)V
      // 37: aload 0
      // 38: invokevirtual net/optifine/render/GlBlendState.isSeparate ()Z
      // 3b: goto 42
      // 3e: invokestatic hzu.a (Loov;)Loov;
      // 41: athrow
      // 42: iload 1
      // 43: ifeq 71
      // 46: ifne 66
      // 49: goto 50
      // 4c: invokestatic hzu.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: invokevirtual net/optifine/render/GlBlendState.getSrcFactor ()I
      // 54: aload 0
      // 55: invokevirtual net/optifine/render/GlBlendState.getDstFactor ()I
      // 58: invokestatic hzu.ru7 (II)V
      // 5b: iload 1
      // 5c: ifne 80
      // 5f: goto 66
      // 62: invokestatic hzu.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: invokevirtual net/optifine/render/GlBlendState.getSrcFactor ()I
      // 6a: goto 71
      // 6d: invokestatic hzu.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: invokevirtual net/optifine/render/GlBlendState.getDstFactor ()I
      // 75: aload 0
      // 76: invokevirtual net/optifine/render/GlBlendState.getSrcFactorAlpha ()I
      // 79: aload 0
      // 7a: invokevirtual net/optifine/render/GlBlendState.getDstFactorAlpha ()I
      // 7d: invokestatic hzu.u39 (IIII)V
      // 80: return
   }

   public static void pz8(int param0, IntBuffer param1, IntBuffer param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokestatic org/lwjgl/opengl/GL14.glMultiDrawArrays (ILjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
      // 0a: invokestatic hxt.ly3 ()Z
      // 0d: iload 3
      // 0e: ifeq 1e
      // 11: ifeq 84
      // 14: goto 1b
      // 17: invokestatic hzu.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic hzu.iqv Z
      // 1e: iload 3
      // 1f: ifeq 39
      // 22: ifne 84
      // 25: goto 2c
      // 28: invokestatic hzu.a (Loov;)Loov;
      // 2b: athrow
      // 2c: getstatic net/optifine/shaders/Shaders.activeProgram Lnet/optifine/shaders/Program;
      // 2f: invokevirtual net/optifine/shaders/Program.getCountInstances ()I
      // 32: goto 39
      // 35: invokestatic hzu.a (Loov;)Loov;
      // 38: athrow
      // 39: istore 4
      // 3b: iload 4
      // 3d: iload 3
      // 3e: ifeq 54
      // 41: bipush 1
      // 42: if_icmple 84
      // 45: goto 4c
      // 48: invokestatic hzu.a (Loov;)Loov;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 54
      // 50: invokestatic hzu.a (Loov;)Loov;
      // 53: athrow
      // 54: istore 5
      // 56: iload 5
      // 58: iload 4
      // 5a: if_icmpge 7d
      // 5d: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 60: iload 5
      // 62: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 65: iload 0
      // 66: aload 1
      // 67: aload 2
      // 68: invokestatic org/lwjgl/opengl/GL14.glMultiDrawArrays (ILjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
      // 6b: iinc 5 1
      // 6e: iload 3
      // 6f: ifeq 84
      // 72: iload 3
      // 73: ifne 56
      // 76: goto 7d
      // 79: invokestatic hzu.a (Loov;)Loov;
      // 7c: athrow
      // 7d: getstatic net/optifine/shaders/Shaders.uniform_instanceId Lnet/optifine/shaders/uniform/ShaderUniform1i;
      // 80: bipush 0
      // 81: invokevirtual net/optifine/shaders/uniform/ShaderUniform1i.setValue (I)V
      // 84: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7973271621801637893L, 3440811384504682645L, MethodHandles.lookup().lookupClass()).a(91663945269941L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 47129279457522L;
      Cipher var2;
      Cipher var17 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var17.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "îJÀ\u0088\f\u008e\u0006AùEðÝ>\u0081M/\u0018ùÛû\u0086\u001dØh,â\u0081oµpoÐ\u0000\u0080XQúGò¼õ";
      int var8 = "îJÀ\u0088\f\u008e\u0006AùEðÝ>\u0081M/\u0018ùÛû\u0086\u001dØh,â\u0081oµpoÐ\u0000\u0080XQúGò¼õ".length();
      char var5 = 16;
      int var15 = -1;

      label53:
      while (true) {
         String var18 = var6.substring(++var15, var15 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var18.getBytes("ISO-8859-1"));
            String var24 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var24;
                  if ((var15 += var5) >= var8) {
                     b = var9;
                     c = new String[4];
                     n7g = new hzu$igu(null);
                     cnk = new hzu$win(2896);
                     feo = new hzu$win[8];
                     tre = new hzu$jkh(null);
                     fz_ = new hzu$_0v(null);
                     p4y = new hzu$nhz(null);
                     nvq = new hzu$amh(null);
                     gad = new hzu$sog(null);
                     s_z = new hzu$iia(null);
                     ax9 = new hzu$oe1(null);
                     zzp = new hzu$loj(null);
                     jrq = new hzu$odz(null);
                     ul8 = new hzu$n87(null);
                     wux = new hzu$win(2977);
                     i98 = 0;
                     i20 = new hzu$w2h[32];
                     zh_ = 7425;
                     cnc = new hzu$win(32826);
                     jti = new hzu$i8u(null);
                     faq = new hzu$v9h();
                     w2k = true;
                     a7x = new LockCounter();
                     z6w = new GlAlphaState();
                     ojx = new LockCounter();
                     lh9 = new GlBlendState();
                     iqv = false;
                     int var11 = 0;

                     try {
                        while (var11 < 8) {
                           feo[var11] = new hzu$win(16384 + var11);
                           var11++;
                        }
                     } catch (oov var13) {
                        throw a(var13);
                     }

                     var11 = 0;

                     try {
                        while (var11 < i20.length) {
                           i20[var11] = new hzu$w2h(null);
                           var11++;
                        }

                        return;
                     } catch (oov var12) {
                        throw a(var12);
                     }
                  }

                  var5 = var6.charAt(var15);
                  break;
               default:
                  var9[var7++] = var24;
                  if ((var15 += var5) < var8) {
                     var5 = var6.charAt(var15);
                     continue label53;
                  }

                  var6 = "\u0099G\u001e#Ä+á.#\u009c\u0002@÷<Z?\u0095\u0095¸Ø¬Ä\u0090¦\u001e\u009d-aØ¹|OØ\u0011ë×\u001cs\u008do\u0018Ä\u0081\u000bd?`!\u000fù)Ð¶Ó\u009c¤OHñxCÄýQ\u0089";
                  var8 = "\u0099G\u001e#Ä+á.#\u009c\u0002@÷<Z?\u0095\u0095¸Ø¬Ä\u0090¦\u001e\u009d-aØ¹|OØ\u0011ë×\u001cs\u008do\u0018Ä\u0081\u000bd?`!\u000fù)Ð¶Ó\u009c¤OHñxCÄýQ\u0089"
                     .length();
                  var5 = '(';
                  var15 = -1;
            }

            var18 = var6.substring(++var15, var15 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28136;
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
            throw new RuntimeException("hzu", var10);
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
         throw new RuntimeException("hzu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
