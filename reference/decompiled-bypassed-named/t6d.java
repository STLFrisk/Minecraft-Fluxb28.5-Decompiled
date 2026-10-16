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
import net.minecraft.tileentity.TileEntityComparator;

public class t6d extends f8k implements adf {
   public static final h76 b95;
   public static final zb_ fyu;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public t6d(boolean var1) {
      super(var1);
      this.y8l(this._8_.c32().zvi(em9, vt2.z9q).zvi(b95, false).zvi(fyu, t6d$ulc.ysa));
      this.d90 = true;
   }

   @Override
   public String ieu() {
      long var1 = b ^ 3512713563743L;
      return orr.zgh(b<"t">(11155, 224069103275687557L ^ var1));
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.wv8;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.wv8;
   }

   @Override
   public int hqm(zfz var1) {
      return 2;
   }

   @Override
   public zfz ip_(zfz var1) {
      Boolean var2 = (Boolean)var1.dil(b95);
      t6d$ulc var3 = (t6d$ulc)var1.dil(fyu);
      vt2 var4 = (vt2)var1.dil(em9);
      return ox_.jm8.l4i().zvi(em9, var4).zvi(b95, var2).zvi(fyu, var3);
   }

   @Override
   public zfz woc(zfz var1) {
      Boolean var2 = (Boolean)var1.dil(b95);
      t6d$ulc var3 = (t6d$ulc)var1.dil(fyu);
      vt2 var4 = (vt2)var1.dil(em9);
      return ox_.k2w.l4i().zvi(em9, var4).zvi(b95, var2).zvi(fyu, var3);
   }

   @Override
   public boolean tt9(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield t6d.d5w Z
      // 08: iload 2
      // 09: ifeq 3b
      // 0c: ifne 3a
      // 0f: goto 16
      // 12: invokestatic t6d.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getstatic t6d.b95 Lh76;
      // 1a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1f: checkcast java/lang/Boolean
      // 22: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 25: iload 2
      // 26: ifeq 3b
      // 29: goto 30
      // 2c: invokestatic t6d.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifeq 3e
      // 33: goto 3a
      // 36: invokestatic t6d.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   @Override
   public int ft0(m5n param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: invokeinterface m5n.getTileEntity (Lmew;)Lpyk; 2
      // 0c: astore 5
      // 0e: aload 5
      // 10: instanceof net/minecraft/tileentity/TileEntityComparator
      // 13: iload 4
      // 15: ifne 31
      // 18: ifeq 34
      // 1b: goto 22
      // 1e: invokestatic t6d.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 5
      // 24: checkcast net/minecraft/tileentity/TileEntityComparator
      // 27: invokevirtual net/minecraft/tileentity/TileEntityComparator.cy3 ()I
      // 2a: goto 31
      // 2d: invokestatic t6d.a (Loov;)Loov;
      // 30: athrow
      // 31: goto 35
      // 34: bipush 0
      // 35: ireturn
   }

   private int x1s(OpaquePredicate var1, mew var2, zfz var3) {
      try {
         if (var3.dil(fyu) == t6d$ulc.d_v) {
            return Math.max(this.qqr(var1, var2, var3) - this.snu(var1, var2, var3), 0);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return this.qqr(var1, var2, var3);
   }

   @Override
   public boolean qd6(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokevirtual t6d.qqr (Lt9d;Lmew;Lzfz;)I
      // 0c: istore 5
      // 0e: iload 5
      // 10: iload 4
      // 12: ifne 29
      // 15: bipush 15
      // 17: if_icmplt 27
      // 1a: goto 21
      // 1d: invokestatic t6d.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: ireturn
      // 23: invokestatic t6d.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 5
      // 29: iload 4
      // 2b: ifne 45
      // 2e: ifne 3e
      // 31: goto 38
      // 34: invokestatic t6d.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 0
      // 39: ireturn
      // 3a: invokestatic t6d.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 1
      // 40: aload 2
      // 41: aload 3
      // 42: invokevirtual t6d.snu (Lm5n;Lmew;Lzfz;)I
      // 45: istore 6
      // 47: iload 6
      // 49: iload 4
      // 4b: ifne 62
      // 4e: ifne 60
      // 51: goto 58
      // 54: invokestatic t6d.a (Loov;)Loov;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 7f
      // 5c: invokestatic t6d.a (Loov;)Loov;
      // 5f: athrow
      // 60: iload 5
      // 62: iload 4
      // 64: ifne 7b
      // 67: iload 6
      // 69: if_icmplt 7e
      // 6c: goto 73
      // 6f: invokestatic t6d.a (Loov;)Loov;
      // 72: athrow
      // 73: bipush 1
      // 74: goto 7b
      // 77: invokestatic t6d.a (Loov;)Loov;
      // 7a: athrow
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: ireturn
   }

   @Override
   public int qqr(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: invokespecial f8k.qqr (Lt9d;Lmew;Lzfz;)I
      // 07: istore 5
      // 09: aload 3
      // 0a: getstatic t6d.em9 Lqx_;
      // 0d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 12: checkcast vt2
      // 15: astore 6
      // 17: invokestatic OpaquePredicate.c ()I
      // 1a: aload 2
      // 1b: aload 6
      // 1d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 20: astore 7
      // 22: istore 4
      // 24: aload 1
      // 25: aload 7
      // 27: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2a: invokeinterface zfz.r_y ()Le0x; 1
      // 2f: astore 8
      // 31: aload 8
      // 33: invokevirtual e0x.ge5 ()Z
      // 36: iload 4
      // 38: ifne 5d
      // 3b: ifeq 54
      // 3e: goto 45
      // 41: invokestatic t6d.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 8
      // 47: aload 1
      // 48: aload 7
      // 4a: invokevirtual e0x.mya (Lt9d;Lmew;)I
      // 4d: istore 5
      // 4f: iload 4
      // 51: ifeq f7
      // 54: iload 5
      // 56: goto 5d
      // 59: invokestatic t6d.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 4
      // 5f: ifne f9
      // 62: bipush 15
      // 64: if_icmpge f7
      // 67: goto 6e
      // 6a: invokestatic t6d.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 8
      // 70: invokevirtual e0x.y0n ()Z
      // 73: iload 4
      // 75: ifne f9
      // 78: goto 7f
      // 7b: invokestatic t6d.a (Loov;)Loov;
      // 7e: athrow
      // 7f: ifeq f7
      // 82: goto 89
      // 85: invokestatic t6d.a (Loov;)Loov;
      // 88: athrow
      // 89: aload 7
      // 8b: aload 6
      // 8d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 90: astore 7
      // 92: aload 1
      // 93: aload 7
      // 95: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 98: invokeinterface zfz.r_y ()Le0x; 1
      // 9d: astore 8
      // 9f: aload 8
      // a1: iload 4
      // a3: ifne cb
      // a6: invokevirtual e0x.ge5 ()Z
      // a9: ifeq c2
      // ac: goto b3
      // af: invokestatic t6d.a (Loov;)Loov;
      // b2: athrow
      // b3: aload 8
      // b5: aload 1
      // b6: aload 7
      // b8: invokevirtual e0x.mya (Lt9d;Lmew;)I
      // bb: istore 5
      // bd: iload 4
      // bf: ifeq f7
      // c2: aload 8
      // c4: goto cb
      // c7: invokestatic t6d.a (Loov;)Loov;
      // ca: athrow
      // cb: invokevirtual e0x.p1r ()Lp3y;
      // ce: getstatic p3y.cei Lp3y;
      // d1: if_acmpne f7
      // d4: aload 0
      // d5: aload 1
      // d6: aload 6
      // d8: aload 7
      // da: invokespecial t6d.ijw (Lt9d;Lvt2;Lmew;)Lco7;
      // dd: astore 9
      // df: aload 9
      // e1: iload 4
      // e3: ifne f2
      // e6: ifnull f7
      // e9: goto f0
      // ec: invokestatic t6d.a (Loov;)Loov;
      // ef: athrow
      // f0: aload 9
      // f2: invokevirtual co7.mqa ()I
      // f5: istore 5
      // f7: iload 5
      // f9: ireturn
   }

   private co7 ijw(OpaquePredicate param1, vt2 param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: ldc co7
      // 08: nop
      // 09: new nh4
      // 0c: dup
      // 0d: aload 3
      // 0e: invokevirtual mew.getX ()I
      // 11: i2d
      // 12: aload 3
      // 13: invokevirtual mew.getY ()I
      // 16: i2d
      // 17: aload 3
      // 18: invokevirtual mew.getZ ()I
      // 1b: i2d
      // 1c: aload 3
      // 1d: invokevirtual mew.getX ()I
      // 20: bipush 1
      // 21: iadd
      // 22: i2d
      // 23: aload 3
      // 24: invokevirtual mew.getY ()I
      // 27: bipush 1
      // 28: iadd
      // 29: i2d
      // 2a: aload 3
      // 2b: invokevirtual mew.getZ ()I
      // 2e: bipush 1
      // 2f: iadd
      // 30: i2d
      // 31: invokespecial nh4.<init> (DDDDDD)V
      // 34: new t6d$1
      // 37: dup
      // 38: aload 0
      // 39: aload 2
      // 3a: invokespecial t6d$1.<init> (Lt6d;Lvt2;)V
      // 3d: invokevirtual OpaquePredicate.vie (Ljava/lang/Class;Lnh4;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 40: astore 5
      // 42: aload 5
      // 44: iload 4
      // 46: ifne 68
      // 49: invokeinterface java/util/List.size ()I 1
      // 4e: bipush 1
      // 4f: if_icmpne 6e
      // 52: goto 59
      // 55: invokestatic t6d.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 5
      // 5b: bipush 0
      // 5c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 61: goto 68
      // 64: invokestatic t6d.a (Loov;)Loov;
      // 67: athrow
      // 68: checkcast co7
      // 6b: goto 6f
      // 6e: aconst_null
      // 6f: areturn
   }

   @Override
   public boolean cl2(OpaquePredicate var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      long var9 = b ^ 6300682476941L;
      int var11 = OpaquePredicate.b();

      label45: {
         try {
            if (var11 == 0) {
               return var4.lls.x4a;
            }

            if (var4.lls.x4a) {
               break label45;
            }
         } catch (oov var13) {
            throw a(var13);
         }

         return false;
      }

      var3 = var3.dm4(fyu);

      OpaquePredicate var15;
      double var10001;
      double var10002;
      double var10003;
      String var10004;
      float var10005;
      float var10006;
      label25: {
         try {
            var15 = var1;
            var10001 = (double)var2.getX() + 0.5;
            var10002 = (double)var2.getY() + 0.5;
            var10003 = (double)var2.getZ() + 0.5;
            var10004 = b<"t">(21791, 1517438301725250521L ^ var9);
            var10005 = 0.3F;
            if (var3.dil(fyu) == t6d$ulc.d_v) {
               var10006 = 0.55F;
               break label25;
            }
         } catch (oov var12) {
            throw a(var12);
         }

         var10006 = 0.5F;
      }

      var15.amg(var10001, var10002, var10003, var10004, var10005, var10006);
      var1.vct(var2, var3, 2);
      this.odg(var1, var2, var3);
      return true;
   }

   @Override
   public void rsi(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 2
      // 07: aload 0
      // 08: invokevirtual OpaquePredicate.h11 (Lmew;Le0x;)Z
      // 0b: iload 4
      // 0d: ifne 28
      // 10: ifne c3
      // 13: goto 1a
      // 16: invokestatic t6d.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: invokespecial t6d.x1s (Lt9d;Lmew;Lzfz;)I
      // 21: goto 28
      // 24: invokestatic t6d.a (Loov;)Loov;
      // 27: athrow
      // 28: istore 5
      // 2a: aload 1
      // 2b: aload 2
      // 2c: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 2f: astore 6
      // 31: aload 6
      // 33: instanceof net/minecraft/tileentity/TileEntityComparator
      // 36: iload 4
      // 38: ifne 54
      // 3b: ifeq 57
      // 3e: goto 45
      // 41: invokestatic t6d.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 6
      // 47: checkcast net/minecraft/tileentity/TileEntityComparator
      // 4a: invokevirtual net/minecraft/tileentity/TileEntityComparator.cy3 ()I
      // 4d: goto 54
      // 50: invokestatic t6d.a (Loov;)Loov;
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: istore 7
      // 5a: iload 5
      // 5c: iload 4
      // 5e: ifne 9d
      // 61: iload 7
      // 63: if_icmpne 8f
      // 66: goto 6d
      // 69: invokestatic t6d.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 3
      // 6f: invokevirtual t6d.tt9 (Lzfz;)Z
      // 72: iload 4
      // 74: ifne 9d
      // 77: goto 7e
      // 7a: invokestatic t6d.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 1
      // 80: aload 2
      // 81: aload 3
      // 82: invokevirtual t6d.qd6 (Lt9d;Lmew;Lzfz;)Z
      // 85: if_icmpeq c3
      // 88: goto 8f
      // 8b: invokestatic t6d.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 0
      // 90: aload 1
      // 91: aload 2
      // 92: aload 3
      // 93: invokevirtual t6d.l94 (Lt9d;Lmew;Lzfz;)Z
      // 96: goto 9d
      // 99: invokestatic t6d.a (Loov;)Loov;
      // 9c: athrow
      // 9d: ifeq b4
      // a0: aload 1
      // a1: aload 2
      // a2: aload 0
      // a3: bipush 2
      // a4: bipush -1
      // a5: invokevirtual OpaquePredicate.hba (Lmew;Le0x;II)V
      // a8: iload 4
      // aa: ifeq c3
      // ad: goto b4
      // b0: invokestatic t6d.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 1
      // b5: aload 2
      // b6: aload 0
      // b7: bipush 2
      // b8: bipush 0
      // b9: invokevirtual OpaquePredicate.hba (Lmew;Le0x;II)V
      // bc: goto c3
      // bf: invokestatic t6d.a (Loov;)Loov;
      // c2: athrow
      // c3: return
   }

   private void odg(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 2
      // 003: aload 3
      // 004: invokespecial t6d.x1s (Lt9d;Lmew;Lzfz;)I
      // 007: istore 5
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: aload 1
      // 00d: aload 2
      // 00e: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 011: astore 6
      // 013: bipush 0
      // 014: istore 7
      // 016: istore 4
      // 018: aload 6
      // 01a: instanceof net/minecraft/tileentity/TileEntityComparator
      // 01d: iload 4
      // 01f: ifeq 043
      // 022: ifeq 041
      // 025: goto 02c
      // 028: invokestatic t6d.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 6
      // 02e: checkcast net/minecraft/tileentity/TileEntityComparator
      // 031: astore 8
      // 033: aload 8
      // 035: invokevirtual net/minecraft/tileentity/TileEntityComparator.cy3 ()I
      // 038: istore 7
      // 03a: aload 8
      // 03c: iload 5
      // 03e: invokevirtual net/minecraft/tileentity/TileEntityComparator.zyh (I)V
      // 041: iload 7
      // 043: iload 4
      // 045: ifeq 078
      // 048: iload 5
      // 04a: if_icmpne 06a
      // 04d: goto 054
      // 050: invokestatic t6d.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 3
      // 055: getstatic t6d.fyu Lzb_;
      // 058: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 05d: getstatic t6d$ulc.ysa Lt6d$ulc;
      // 060: if_acmpne 115
      // 063: goto 06a
      // 066: invokestatic t6d.a (Loov;)Loov;
      // 069: athrow
      // 06a: aload 0
      // 06b: aload 1
      // 06c: aload 2
      // 06d: aload 3
      // 06e: invokevirtual t6d.qd6 (Lt9d;Lmew;Lzfz;)Z
      // 071: goto 078
      // 074: invokestatic t6d.a (Loov;)Loov;
      // 077: athrow
      // 078: istore 8
      // 07a: aload 0
      // 07b: aload 3
      // 07c: invokevirtual t6d.tt9 (Lzfz;)Z
      // 07f: istore 9
      // 081: iload 9
      // 083: iload 4
      // 085: ifeq 0d3
      // 088: ifeq 0ca
      // 08b: goto 092
      // 08e: invokestatic t6d.a (Loov;)Loov;
      // 091: athrow
      // 092: iload 8
      // 094: iload 4
      // 096: ifeq 0d3
      // 099: goto 0a0
      // 09c: invokestatic t6d.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: ifne 0ca
      // 0a3: goto 0aa
      // 0a6: invokestatic t6d.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 1
      // 0ab: aload 2
      // 0ac: aload 3
      // 0ad: getstatic t6d.b95 Lh76;
      // 0b0: bipush 0
      // 0b1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0b4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0b9: bipush 2
      // 0ba: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0bd: pop
      // 0be: iload 4
      // 0c0: ifne 10e
      // 0c3: goto 0ca
      // 0c6: invokestatic t6d.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: iload 9
      // 0cc: goto 0d3
      // 0cf: invokestatic t6d.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 4
      // 0d5: ifeq 0e4
      // 0d8: ifne 10e
      // 0db: goto 0e2
      // 0de: invokestatic t6d.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: iload 8
      // 0e4: iload 4
      // 0e6: ifeq 10d
      // 0e9: ifeq 10e
      // 0ec: goto 0f3
      // 0ef: invokestatic t6d.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: aload 2
      // 0f5: aload 3
      // 0f6: getstatic t6d.b95 Lh76;
      // 0f9: bipush 1
      // 0fa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0fd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 102: bipush 2
      // 103: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 106: goto 10d
      // 109: invokestatic t6d.a (Loov;)Loov;
      // 10c: athrow
      // 10d: pop
      // 10e: aload 0
      // 10f: aload 1
      // 110: aload 2
      // 111: aload 3
      // 112: invokevirtual t6d.fow (Lt9d;Lmew;Lzfz;)V
      // 115: return
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
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
      // 08: ifeq 38
      // 0b: getfield t6d.d5w Z
      // 0e: ifeq 37
      // 11: goto 18
      // 14: invokestatic t6d.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 1
      // 19: aload 2
      // 1a: aload 0
      // 1b: aload 3
      // 1c: invokevirtual t6d.woc (Lzfz;)Lzfz;
      // 1f: getstatic t6d.b95 Lh76;
      // 22: bipush 1
      // 23: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 26: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2b: bipush 4
      // 2c: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 2f: pop
      // 30: goto 37
      // 33: invokestatic t6d.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: aload 2
      // 3a: aload 3
      // 3b: invokespecial t6d.odg (Lt9d;Lmew;Lzfz;)V
      // 3e: return
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      super.tfc(var1, var2, var3);
      var1.a_h(var2, this.ie9(var1, 0));
   }

   @Override
   public void b8f(OpaquePredicate var1, mew var2, zfz var3) {
      super.b8f(var1, var2, var3);
      var1._jj(var2);
      this.fow(var1, var2, var3);
   }

   @Override
   public boolean ng5(OpaquePredicate param1, mew param2, zfz param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: iload 4
      // 06: iload 5
      // 08: invokespecial f8k.ng5 (Lt9d;Lmew;Lzfz;II)Z
      // 0b: pop
      // 0c: invokestatic OpaquePredicate.c ()I
      // 0f: aload 1
      // 10: aload 2
      // 11: invokevirtual OpaquePredicate.getTileEntity (Lmew;)Lpyk;
      // 14: astore 7
      // 16: istore 6
      // 18: aload 7
      // 1a: iload 6
      // 1c: ifne 33
      // 1f: ifnonnull 31
      // 22: goto 29
      // 25: invokestatic t6d.a (Loov;)Loov;
      // 28: athrow
      // 29: bipush 0
      // 2a: goto 3a
      // 2d: invokestatic t6d.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 7
      // 33: iload 4
      // 35: iload 5
      // 37: invokevirtual pyk.hjo (II)Z
      // 3a: ireturn
   }

   @Override
   public pyk ie9(OpaquePredicate var1, int var2) {
      return new TileEntityComparator();
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      int var10002;
      label34: {
         label33: {
            try {
               var10000 = this.l4i().zvi(em9, vt2.bm6(var1));
               var10001 = b95;
               var10002 = var1 & 8;
               if (var2 != 0) {
                  break label34;
               }

               if (var10002 > 0) {
                  break label33;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10002 = 0;
            break label34;
         }

         var10002 = 1;
      }

      try {
         var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
         var6 = fyu;
         if ((var1 & 4) > 0) {
            return var10000.zvi(fyu, t6d$ulc.d_v);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var6, t6d$ulc.ysa);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = OpaquePredicate.c();
      var3 |= ((vt2)var1.dil(em9)).tmy();
      int var2 = var10000;

      label25: {
         label24: {
            try {
               var6 = (Boolean)var1.dil(b95);
               if (var2 != 0) {
                  break label25;
               }

               if (!var6) {
                  break label24;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var3 |= 8;
         }

         var6 = var1.dil(fyu);
      }

      if (var6 == t6d$ulc.d_v) {
         var3 |= 4;
      }

      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{em9, fyu, b95});
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      return this.l4i().zvi(em9, var8.u0f().b4b()).zvi(b95, false).zvi(fyu, t6d$ulc.ysa);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7435832625814097542L, -5034803649293828730L, MethodHandles.lookup().lookupClass()).a(263995224152065L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 104432038534007L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "î\u0003rÖD\u000fpôõ\u0097÷MÐÔñÅ\u0018ËÄÒ3(\u0006:D¢¼ó6\"\u0094º\u0006ÇÔAî%\u008c8ü";
      int var6 = "î\u0003rÖD\u000fpôõ\u0097÷MÐÔñÅ\u0018ËÄÒ3(\u0006:D¢¼ó6\"\u0094º\u0006ÇÔAî%\u008c8ü".length();
      char var3 = 16;
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
                     h = new String[4];
                     b95 = h76.d_1(b<"t">(11649, 8973629109458611644L ^ var9));
                     fyu = zb_.pq4(b<"t">(24004, 4700940941493820923L ^ var9), t6d$ulc.class);
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

                  var4 = "O5<eFZ\u0013,KÅ\u008c¥'¨\u009a\u001e(ç¡¢\u0016b'R÷\u007fà¼á\u008c\u0082¢\u0011E.\bº6p»¨Å\u009a\u0015®G\u001cß\u008e\u000b\u009f\u0010\u001b #¾È";
                  var6 = "O5<eFZ\u0013,KÅ\u008c¥'¨\u009a\u001e(ç¡¢\u0016b'R÷\u007fà¼á\u008c\u0082¢\u0011E.\bº6p»¨Å\u009a\u0015®G\u001cß\u008e\u000b\u009f\u0010\u001b #¾È"
                     .length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11890;
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
            throw new RuntimeException("t6d", var10);
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
         throw new RuntimeException("t6d" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
