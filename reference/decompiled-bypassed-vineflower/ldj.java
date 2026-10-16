import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ldj extends rrw implements jrp {
   public static final zb_ e6t;
   public static final zb_ mty;
   public static final zb_ kv3;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public ldj() {
      long var1 = b ^ 23126800643146L;
      super(p3y.wui);
      this.y8l(this._8_.c32().zvi(e6t, ldj$vn8.abu).zvi(mty, ldj$nrq.zaq).zvi(kv3, vt2.z9q));
      this.q6h(0.0F);
      this.t4k(_0p);
      this.h2y(b<"f">(20342, 228230238823383925L ^ var1));
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public ldj$vn8 n4v(m5n var1, mew var2) {
      int var3 = t9d.c();
      zfz var4 = var1.getBlockState(var2);

      try {
         if (var3 != 0) {
            return (ldj$vn8)var4.dil(e6t);
         }

         if (var4.r_y() != this) {
            return ldj$vn8.t7o;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      var4 = this.w1b(var4, var1, var2);
      return (ldj$vn8)var4.dil(e6t);
   }

   @Override
   public boolean ctq(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial rrw.ctq (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifne 27
      // 0e: ifeq 39
      // 11: goto 18
      // 14: invokestatic ldj.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: invokevirtual mew.nuv ()Lmew;
      // 1d: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 20: goto 27
      // 23: invokestatic ldj.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 3
      // 28: ifne 36
      // 2b: ifeq 39
      // 2e: goto 35
      // 31: invokestatic ldj.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   @Override
   public boolean ujd(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09: astore 4
      // 0b: aload 4
      // 0d: iload 3
      // 0e: ifeq 2f
      // 11: invokeinterface zfz.r_y ()Le0x; 1
      // 16: aload 0
      // 17: if_acmpeq 27
      // 1a: goto 21
      // 1d: invokestatic ldj.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: ireturn
      // 23: invokestatic ldj.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: aload 4
      // 2a: aload 1
      // 2b: aload 2
      // 2c: invokevirtual ldj.w1b (Lzfz;Lm5n;Lmew;)Lzfz;
      // 2f: getstatic ldj.e6t Lzb_;
      // 32: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 37: checkcast ldj$vn8
      // 3a: astore 5
      // 3c: aload 5
      // 3e: getstatic ldj$vn8.t7o Lldj$vn8;
      // 41: iload 3
      // 42: ifeq 5b
      // 45: if_acmpeq 5e
      // 48: goto 4f
      // 4b: invokestatic ldj.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 5
      // 51: getstatic ldj$vn8.h4k Lldj$vn8;
      // 54: goto 5b
      // 57: invokestatic ldj.a (Loov;)Loov;
      // 5a: athrow
      // 5b: if_acmpne 66
      // 5e: bipush 1
      // 5f: goto 67
      // 62: invokestatic ldj.a (Loov;)Loov;
      // 65: athrow
      // 66: bipush 0
      // 67: ireturn
   }

   @Override
   public void swr(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokevirtual ldj._h0 (Lt9d;Lmew;Lzfz;)Z
      // 0c: ifne e1
      // 0f: aload 3
      // 10: getstatic ldj.mty Lzb_;
      // 13: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 18: getstatic ldj$nrq.zy2 Lldj$nrq;
      // 1b: if_acmpne 2d
      // 1e: goto 25
      // 21: invokestatic ldj.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic ldj.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: istore 5
      // 30: iload 5
      // 32: ifeq 3d
      // 35: aload 2
      // 36: goto 41
      // 39: invokestatic ldj.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 2
      // 3e: invokevirtual mew.nuv ()Lmew;
      // 41: astore 6
      // 43: iload 5
      // 45: ifeq 53
      // 48: aload 2
      // 49: invokevirtual mew.eve ()Lmew;
      // 4c: goto 54
      // 4f: invokestatic ldj.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 2
      // 54: astore 7
      // 56: iload 5
      // 58: ifeq 63
      // 5b: aload 0
      // 5c: goto 6e
      // 5f: invokestatic ldj.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 1
      // 64: aload 6
      // 66: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 69: invokeinterface zfz.r_y ()Le0x; 1
      // 6e: astore 8
      // 70: iload 5
      // 72: ifeq 87
      // 75: aload 1
      // 76: aload 7
      // 78: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7b: invokeinterface zfz.r_y ()Le0x; 1
      // 80: goto 88
      // 83: invokestatic ldj.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 0
      // 88: astore 9
      // 8a: aload 8
      // 8c: aload 0
      // 8d: iload 4
      // 8f: ifne b4
      // 92: if_acmpne b1
      // 95: goto 9c
      // 98: invokestatic ldj.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 1
      // 9d: aload 6
      // 9f: getstatic ox_.ibw Le0x;
      // a2: invokevirtual e0x.l4i ()Lzfz;
      // a5: bipush 2
      // a6: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // a9: pop
      // aa: goto b1
      // ad: invokestatic ldj.a (Loov;)Loov;
      // b0: athrow
      // b1: aload 9
      // b3: aload 0
      // b4: if_acmpne e1
      // b7: aload 1
      // b8: aload 7
      // ba: getstatic ox_.ibw Le0x;
      // bd: invokevirtual e0x.l4i ()Lzfz;
      // c0: bipush 3
      // c1: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // c4: pop
      // c5: iload 5
      // c7: ifne e1
      // ca: goto d1
      // cd: invokestatic ldj.a (Loov;)Loov;
      // d0: athrow
      // d1: aload 0
      // d2: aload 1
      // d3: aload 7
      // d5: aload 3
      // d6: bipush 0
      // d7: invokevirtual ldj.lf0 (Lt9d;Lmew;Lzfz;I)V
      // da: goto e1
      // dd: invokestatic ldj.a (Loov;)Loov;
      // e0: athrow
      // e1: return
   }

   @Override
   public boolean _h0(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifeq 4a
      // 0b: getstatic ldj.mty Lzb_;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: getstatic ldj$nrq.zy2 Lldj$nrq;
      // 16: if_acmpne 42
      // 19: goto 20
      // 1c: invokestatic ldj.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: aload 2
      // 22: invokevirtual mew.eve ()Lmew;
      // 25: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 28: invokeinterface zfz.r_y ()Le0x; 1
      // 2d: aload 0
      // 2e: if_acmpne 40
      // 31: goto 38
      // 34: invokestatic ldj.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 41
      // 3c: invokestatic ldj.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 0
      // 41: ireturn
      // 42: aload 1
      // 43: aload 2
      // 44: invokevirtual mew.nuv ()Lmew;
      // 47: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4a: astore 5
      // 4c: aload 5
      // 4e: invokeinterface zfz.r_y ()Le0x; 1
      // 53: aload 0
      // 54: if_acmpne 79
      // 57: aload 0
      // 58: aload 1
      // 59: aload 2
      // 5a: aload 5
      // 5c: invokespecial rrw._h0 (Lt9d;Lmew;Lzfz;)Z
      // 5f: iload 4
      // 61: ifeq 76
      // 64: goto 6b
      // 67: invokestatic ldj.a (Loov;)Loov;
      // 6a: athrow
      // 6b: ifeq 79
      // 6e: goto 75
      // 71: invokestatic ldj.a (Loov;)Loov;
      // 74: athrow
      // 75: bipush 1
      // 76: goto 7a
      // 79: bipush 0
      // 7a: ireturn
   }

   @Override
   public u7m j39(zfz param1, Random param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getstatic ldj.mty Lzb_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: iload 4
      // 10: ifeq 2f
      // 13: getstatic ldj$nrq.zy2 Lldj$nrq;
      // 16: if_acmpne 26
      // 19: goto 20
      // 1c: invokestatic ldj.a (Loov;)Loov;
      // 1f: athrow
      // 20: aconst_null
      // 21: areturn
      // 22: invokestatic ldj.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 1
      // 27: getstatic ldj.e6t Lzb_;
      // 2a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2f: checkcast ldj$vn8
      // 32: astore 5
      // 34: aload 5
      // 36: getstatic ldj$vn8.t7o Lldj$vn8;
      // 39: iload 4
      // 3b: ifeq 55
      // 3e: if_acmpne 50
      // 41: goto 48
      // 44: invokestatic ldj.a (Loov;)Loov;
      // 47: athrow
      // 48: aconst_null
      // 49: goto 7a
      // 4c: invokestatic ldj.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 5
      // 52: getstatic ldj$vn8.h4k Lldj$vn8;
      // 55: if_acmpne 76
      // 58: aload 2
      // 59: bipush 8
      // 5b: invokevirtual java/util/Random.nextInt (I)I
      // 5e: ifne 72
      // 61: goto 68
      // 64: invokestatic ldj.a (Loov;)Loov;
      // 67: athrow
      // 68: getstatic xbr.gj8 Lu7m;
      // 6b: goto 7a
      // 6e: invokestatic ldj.a (Loov;)Loov;
      // 71: athrow
      // 72: aconst_null
      // 73: goto 7a
      // 76: aload 0
      // 77: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 7a: areturn
   }

   @Override
   public int crg(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic ldj.mty Lzb_;
      // 08: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d: iload 2
      // 0e: ifeq 2e
      // 11: getstatic ldj$nrq.zy2 Lldj$nrq;
      // 14: if_acmpeq 58
      // 17: goto 1e
      // 1a: invokestatic ldj.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getstatic ldj.e6t Lzb_;
      // 22: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 27: goto 2e
      // 2a: invokestatic ldj.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 2
      // 2f: ifeq 4f
      // 32: getstatic ldj$vn8.h4k Lldj$vn8;
      // 35: if_acmpeq 58
      // 38: goto 3f
      // 3b: invokestatic ldj.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 1
      // 40: getstatic ldj.e6t Lzb_;
      // 43: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 48: goto 4f
      // 4b: invokestatic ldj.a (Loov;)Loov;
      // 4e: athrow
      // 4f: checkcast ldj$vn8
      // 52: invokevirtual ldj$vn8.gp7 ()I
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   @Override
   public int j24(m5n param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual ldj.n4v (Lm5n;Lmew;)Lldj$vn8;
      // 0b: astore 5
      // 0d: aload 5
      // 0f: getstatic ldj$vn8.h4k Lldj$vn8;
      // 12: iload 4
      // 14: ifne 2d
      // 17: if_acmpeq 3a
      // 1a: goto 21
      // 1d: invokestatic ldj.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 5
      // 23: getstatic ldj$vn8.t7o Lldj$vn8;
      // 26: goto 2d
      // 29: invokestatic ldj.a (Loov;)Loov;
      // 2c: athrow
      // 2d: if_acmpeq 3a
      // 30: ldc 16777215
      // 32: nop
      // 33: goto 3f
      // 36: invokestatic ldj.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 1
      // 3b: aload 2
      // 3c: invokestatic s4i.mq6 (Lm5n;Lmew;)I
      // 3f: ireturn
   }

   public void opz(t9d var1, mew var2, ldj$vn8 var3, int var4) {
      var1.vct(var2, this.l4i().zvi(mty, ldj$nrq.zaq).zvi(e6t, var3), var4);
      var1.vct(var2.nuv(), this.l4i().zvi(mty, ldj$nrq.zy2), var4);
   }

   @Override
   public void qh0(t9d var1, mew var2, zfz var3, g_3 var4, erg var5) {
      var1.vct(var2.nuv(), this.l4i().zvi(mty, ldj$nrq.zy2), 2);
   }

   @Override
   public void i4u(t9d param1, ha9 param2, mew param3, zfz param4, pyk param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: ifne 70
      // 0c: aload 2
      // 0d: invokevirtual ha9.b5z ()Lerg;
      // 10: iload 6
      // 12: ifeq 31
      // 15: goto 1c
      // 18: invokestatic ldj.a (Loov;)Loov;
      // 1b: athrow
      // 1c: ifnull 70
      // 1f: goto 26
      // 22: invokestatic ldj.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 2
      // 27: invokevirtual ha9.b5z ()Lerg;
      // 2a: goto 31
      // 2d: invokestatic ldj.a (Loov;)Loov;
      // 30: athrow
      // 31: invokevirtual erg.gn1 ()Lu7m;
      // 34: getstatic xbr.qsl Lguw;
      // 37: if_acmpne 70
      // 3a: aload 4
      // 3c: getstatic ldj.mty Lzb_;
      // 3f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 44: getstatic ldj$nrq.zaq Lldj$nrq;
      // 47: if_acmpne 70
      // 4a: goto 51
      // 4d: invokestatic ldj.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: aload 1
      // 53: iload 6
      // 55: ifeq 79
      // 58: goto 5f
      // 5b: invokestatic ldj.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 3
      // 60: aload 4
      // 62: aload 2
      // 63: invokespecial ldj.lz8 (Lt9d;Lmew;Lzfz;Lha9;)Z
      // 66: ifne 82
      // 69: goto 70
      // 6c: invokestatic ldj.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 1
      // 72: goto 79
      // 75: invokestatic ldj.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 2
      // 7a: aload 3
      // 7b: aload 4
      // 7d: aload 5
      // 7f: invokespecial rrw.i4u (Lt9d;Lha9;Lmew;Lzfz;Lpyk;)V
      // 82: return
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: aload 3
      // 006: iload 5
      // 008: ifne 02f
      // 00b: getstatic ldj.mty Lzb_;
      // 00e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 013: getstatic ldj$nrq.zy2 Lldj$nrq;
      // 016: if_acmpne 152
      // 019: goto 020
      // 01c: invokestatic ldj.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 1
      // 021: aload 2
      // 022: invokevirtual mew.eve ()Lmew;
      // 025: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 028: goto 02f
      // 02b: invokestatic ldj.a (Loov;)Loov;
      // 02e: athrow
      // 02f: invokeinterface zfz.r_y ()Le0x; 1
      // 034: aload 0
      // 035: if_acmpne 19f
      // 038: aload 4
      // 03a: getfield ha9.lls Lpj2;
      // 03d: getfield pj2.g40 Z
      // 040: iload 5
      // 042: ifne 14c
      // 045: goto 04c
      // 048: invokestatic ldj.a (Loov;)Loov;
      // 04b: athrow
      // 04c: ifne 13d
      // 04f: goto 056
      // 052: invokestatic ldj.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 1
      // 057: aload 2
      // 058: invokevirtual mew.eve ()Lmew;
      // 05b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 05e: astore 6
      // 060: aload 6
      // 062: getstatic ldj.e6t Lzb_;
      // 065: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 06a: checkcast ldj$vn8
      // 06d: astore 7
      // 06f: aload 7
      // 071: getstatic ldj$vn8.t7o Lldj$vn8;
      // 074: iload 5
      // 076: ifne 08f
      // 079: if_acmpeq 0a8
      // 07c: goto 083
      // 07f: invokestatic ldj.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 7
      // 085: getstatic ldj$vn8.h4k Lldj$vn8;
      // 088: goto 08f
      // 08b: invokestatic ldj.a (Loov;)Loov;
      // 08e: athrow
      // 08f: if_acmpeq 0a8
      // 092: aload 1
      // 093: aload 2
      // 094: invokevirtual mew.eve ()Lmew;
      // 097: bipush 1
      // 098: invokevirtual t9d.yir (Lmew;Z)Z
      // 09b: pop
      // 09c: iload 5
      // 09e: ifeq 138
      // 0a1: goto 0a8
      // 0a4: invokestatic ldj.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 1
      // 0a9: getfield t9d.v0f Z
      // 0ac: iload 5
      // 0ae: ifne 137
      // 0b1: goto 0b8
      // 0b4: invokestatic ldj.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: ifne 128
      // 0bb: goto 0c2
      // 0be: invokestatic ldj.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 4
      // 0c4: invokevirtual ha9.b5z ()Lerg;
      // 0c7: iload 5
      // 0c9: ifne 0e9
      // 0cc: goto 0d3
      // 0cf: invokestatic ldj.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: ifnull 112
      // 0d6: goto 0dd
      // 0d9: invokestatic ldj.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 4
      // 0df: invokevirtual ha9.b5z ()Lerg;
      // 0e2: goto 0e9
      // 0e5: invokestatic ldj.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: invokevirtual erg.gn1 ()Lu7m;
      // 0ec: getstatic xbr.qsl Lguw;
      // 0ef: if_acmpne 112
      // 0f2: aload 0
      // 0f3: aload 1
      // 0f4: aload 2
      // 0f5: aload 6
      // 0f7: aload 4
      // 0f9: invokespecial ldj.lz8 (Lt9d;Lmew;Lzfz;Lha9;)Z
      // 0fc: pop
      // 0fd: aload 1
      // 0fe: aload 2
      // 0ff: invokevirtual mew.eve ()Lmew;
      // 102: invokevirtual t9d.i6x (Lmew;)Z
      // 105: pop
      // 106: iload 5
      // 108: ifeq 138
      // 10b: goto 112
      // 10e: invokestatic ldj.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 1
      // 113: aload 2
      // 114: invokevirtual mew.eve ()Lmew;
      // 117: bipush 1
      // 118: invokevirtual t9d.yir (Lmew;Z)Z
      // 11b: pop
      // 11c: iload 5
      // 11e: ifeq 138
      // 121: goto 128
      // 124: invokestatic ldj.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 1
      // 129: aload 2
      // 12a: invokevirtual mew.eve ()Lmew;
      // 12d: invokevirtual t9d.i6x (Lmew;)Z
      // 130: goto 137
      // 133: invokestatic ldj.a (Loov;)Loov;
      // 136: athrow
      // 137: pop
      // 138: iload 5
      // 13a: ifeq 19f
      // 13d: aload 1
      // 13e: aload 2
      // 13f: invokevirtual mew.eve ()Lmew;
      // 142: invokevirtual t9d.i6x (Lmew;)Z
      // 145: goto 14c
      // 148: invokestatic ldj.a (Loov;)Loov;
      // 14b: athrow
      // 14c: pop
      // 14d: iload 5
      // 14f: ifeq 19f
      // 152: aload 4
      // 154: getfield ha9.lls Lpj2;
      // 157: getfield pj2.g40 Z
      // 15a: ifeq 19f
      // 15d: goto 164
      // 160: invokestatic ldj.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 1
      // 165: aload 2
      // 166: invokevirtual mew.nuv ()Lmew;
      // 169: iload 5
      // 16b: ifne 194
      // 16e: goto 175
      // 171: invokestatic ldj.a (Loov;)Loov;
      // 174: athrow
      // 175: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 178: invokeinterface zfz.r_y ()Le0x; 1
      // 17d: aload 0
      // 17e: if_acmpne 19f
      // 181: goto 188
      // 184: invokestatic ldj.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 1
      // 189: aload 2
      // 18a: invokevirtual mew.nuv ()Lmew;
      // 18d: goto 194
      // 190: invokestatic ldj.a (Loov;)Loov;
      // 193: athrow
      // 194: getstatic ox_.ibw Le0x;
      // 197: invokevirtual e0x.l4i ()Lzfz;
      // 19a: bipush 2
      // 19b: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 19e: pop
      // 19f: aload 0
      // 1a0: aload 1
      // 1a1: aload 2
      // 1a2: aload 3
      // 1a3: aload 4
      // 1a5: invokespecial rrw.f51 (Lt9d;Lmew;Lzfz;Lha9;)V
      // 1a8: return
   }

   private boolean lz8(t9d param1, mew param2, zfz param3, ha9 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic ldj.e6t Lzb_;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast ldj$vn8
      // 11: astore 6
      // 13: aload 6
      // 15: getstatic ldj$vn8.t7o Lldj$vn8;
      // 18: iload 5
      // 1a: ifne 5a
      // 1d: if_acmpeq 48
      // 20: goto 27
      // 23: invokestatic ldj.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 6
      // 29: getstatic ldj$vn8.h4k Lldj$vn8;
      // 2c: iload 5
      // 2e: ifne 5a
      // 31: goto 38
      // 34: invokestatic ldj.a (Loov;)Loov;
      // 37: athrow
      // 38: if_acmpeq 48
      // 3b: goto 42
      // 3e: invokestatic ldj.a (Loov;)Loov;
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
      // 44: invokestatic ldj.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 4
      // 4a: getstatic l9p.hf_ [L_ss;
      // 4d: aload 0
      // 4e: invokestatic e0x.mxb (Le0x;)I
      // 51: aaload
      // 52: invokevirtual ha9.aex (L_ss;)V
      // 55: aload 6
      // 57: getstatic ldj$vn8.h4k Lldj$vn8;
      // 5a: if_acmpne 67
      // 5d: getstatic rh2$j7i.jd3 Lrh2$j7i;
      // 60: goto 6a
      // 63: invokestatic ldj.a (Loov;)Loov;
      // 66: athrow
      // 67: getstatic rh2$j7i.hqk Lrh2$j7i;
      // 6a: invokevirtual rh2$j7i.sqd ()I
      // 6d: istore 7
      // 6f: aload 1
      // 70: aload 2
      // 71: new erg
      // 74: dup
      // 75: getstatic ox_._w6 Lrh2;
      // 78: bipush 2
      // 79: iload 7
      // 7b: invokespecial erg.<init> (Le0x;II)V
      // 7e: invokestatic ldj.ymu (Lt9d;Lmew;Lerg;)V
      // 81: bipush 1
      // 82: ireturn
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      ldj$vn8[] var5 = ldj$vn8.values();
      int var6 = var5.length;
      int var10000 = t9d.b();
      int var7 = 0;
      int var4 = var10000;

      while (var7 < var6) {
         ldj$vn8 var8 = var5[var7];
         var3.add(new erg(var1, 1, var8.gp7()));
         var7++;
         if (var4 == 0) {
            break;
         }
      }
   }

   @Override
   public int qu2(t9d var1, mew var2) {
      return this.n4v(var1, var2).gp7();
   }

   @Override
   public boolean z3t(t9d param1, mew param2, zfz param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual ldj.n4v (Lm5n;Lmew;)Lldj$vn8;
      // 0b: astore 6
      // 0d: aload 6
      // 0f: getstatic ldj$vn8.h4k Lldj$vn8;
      // 12: iload 5
      // 14: ifeq 2d
      // 17: if_acmpeq 38
      // 1a: goto 21
      // 1d: invokestatic ldj.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 6
      // 23: getstatic ldj$vn8.t7o Lldj$vn8;
      // 26: goto 2d
      // 29: invokestatic ldj.a (Loov;)Loov;
      // 2c: athrow
      // 2d: if_acmpeq 38
      // 30: bipush 1
      // 31: goto 39
      // 34: invokestatic ldj.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 0
      // 39: ireturn
   }

   @Override
   public boolean y4n(t9d var1, Random var2, mew var3, zfz var4) {
      return true;
   }

   @Override
   public void tu1(t9d var1, Random var2, mew var3, zfz var4) {
      ymu(var1, var3, new erg(this, 1, this.n4v(var1, var3).gp7()));
   }

   @Override
   public zfz kig(int var1) {
      try {
         if ((var1 & 8) > 0) {
            return this.l4i().zvi(mty, ldj$nrq.zy2);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return this.l4i().zvi(mty, ldj$nrq.zaq).zvi(e6t, ldj$vn8.voe(var1 & 7));
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      int var4 = t9d.c();

      try {
         if (var4 != 0) {
            return var1;
         }

         if (var1.dil(mty) != ldj$nrq.zy2) {
            return var1;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      zfz var5 = var2.getBlockState(var3.eve());

      try {
         if (var4 != 0) {
            return var5;
         }

         if (var5.r_y() != this) {
            return var1;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return var1.zvi(e6t, var5.dil(e6t));
   }

   @Override
   public int hvp(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic ldj.mty Lzb_;
      // 08: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d: iload 2
      // 0e: ifne 40
      // 11: getstatic ldj$nrq.zy2 Lldj$nrq;
      // 14: if_acmpne 37
      // 17: goto 1e
      // 1a: invokestatic ldj.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 8
      // 20: aload 1
      // 21: getstatic ldj.kv3 Lzb_;
      // 24: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 29: checkcast vt2
      // 2c: invokevirtual vt2.tmy ()I
      // 2f: ior
      // 30: goto 46
      // 33: invokestatic ldj.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 1
      // 38: getstatic ldj.e6t Lzb_;
      // 3b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 40: checkcast ldj$vn8
      // 43: invokevirtual ldj$vn8.gp7 ()I
      // 46: ireturn
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{mty, e6t, kv3});
   }

   @Override
   public e0x$hep jkr() {
      return e0x$hep.xah;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3836198483193166202L, 952553837466514909L, MethodHandles.lookup().lookupClass()).a(278181455720503L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 132736918873069L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "yôiìL;\u0094\u009e½BÂ\u0095)$/\u0096 \u008dZ»àI$2Ü÷Ù1p!\u008a_v\u009b\u0012ÖEcïþ\u001c¢äÝ\u009btx+Û\u0010Ñrª?¡¨ö\u0006\u0097¨G\u0088\u0011\u0099ô\u0012";
      int var6 = "yôiìL;\u0094\u009e½BÂ\u0095)$/\u0096 \u008dZ»àI$2Ü÷Ù1p!\u008a_v\u009b\u0012ÖEcïþ\u001c¢äÝ\u009btx+Û\u0010Ñrª?¡¨ö\u0006\u0097¨G\u0088\u0011\u0099ô\u0012"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            e6t = zb_.pq4(b<"f">(12827, 2299559049058167230L ^ var9), ldj$vn8.class);
            mty = zb_.pq4(b<"f">(21486, 4996268169870854217L ^ var9), ldj$nrq.class);
            kv3 = sq9.em9;
            return;
         }

         var3 = var4.charAt(var2);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32261;
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
            throw new RuntimeException("ldj", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("ldj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
