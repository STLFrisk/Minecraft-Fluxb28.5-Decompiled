import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mwn extends um3 {
   private static Map hp0;
   private final boolean xvi;
   private static final long b;
   private static final String d;

   private boolean kfc(OpaquePredicate param1, mew param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: getstatic mwn.hp0 Ljava/util/Map;
      // 08: aload 1
      // 09: iload 4
      // 0b: ifne 35
      // 0e: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 13: ifne 31
      // 16: goto 1d
      // 19: invokestatic mwn.a (Loov;)Loov;
      // 1c: athrow
      // 1d: getstatic mwn.hp0 Ljava/util/Map;
      // 20: aload 1
      // 21: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 24: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 29: pop
      // 2a: goto 31
      // 2d: invokestatic mwn.a (Loov;)Loov;
      // 30: athrow
      // 31: getstatic mwn.hp0 Ljava/util/Map;
      // 34: aload 1
      // 35: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3a: checkcast java/util/List
      // 3d: astore 5
      // 3f: iload 3
      // 40: iload 4
      // 42: ifne 6b
      // 45: ifeq 6a
      // 48: goto 4f
      // 4b: invokestatic mwn.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 5
      // 51: new mwn$pt6
      // 54: dup
      // 55: aload 2
      // 56: aload 1
      // 57: invokevirtual OpaquePredicate.p2b ()J
      // 5a: invokespecial mwn$pt6.<init> (Lmew;J)V
      // 5d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 62: pop
      // 63: goto 6a
      // 66: invokestatic mwn.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 0
      // 6b: istore 6
      // 6d: bipush 0
      // 6e: istore 7
      // 70: iload 7
      // 72: aload 5
      // 74: invokeinterface java/util/List.size ()I 1
      // 79: if_icmpge d9
      // 7c: aload 5
      // 7e: iload 7
      // 80: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 85: checkcast mwn$pt6
      // 88: astore 8
      // 8a: iload 4
      // 8c: ifne d4
      // 8f: aload 8
      // 91: getfield mwn$pt6.u34 Lmew;
      // 94: aload 2
      // 95: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 98: iload 4
      // 9a: ifne da
      // 9d: goto a4
      // a0: invokestatic mwn.a (Loov;)Loov;
      // a3: athrow
      // a4: ifeq d1
      // a7: goto ae
      // aa: invokestatic mwn.a (Loov;)Loov;
      // ad: athrow
      // ae: iinc 6 1
      // b1: iload 4
      // b3: ifne d4
      // b6: goto bd
      // b9: invokestatic mwn.a (Loov;)Loov;
      // bc: athrow
      // bd: iload 6
      // bf: bipush 8
      // c1: if_icmplt d1
      // c4: goto cb
      // c7: invokestatic mwn.a (Loov;)Loov;
      // ca: athrow
      // cb: bipush 1
      // cc: ireturn
      // cd: invokestatic mwn.a (Loov;)Loov;
      // d0: athrow
      // d1: iinc 7 1
      // d4: iload 4
      // d6: ifeq 70
      // d9: bipush 0
      // da: ireturn
   }

   public mwn(boolean var1) {
      this.xvi = var1;
      this._p_(true);
      this.i3l((uja)null);
   }

   @Override
   public int odp(OpaquePredicate var1) {
      return 2;
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      int var4 = OpaquePredicate.c();
      if (this.xvi) {
         for (vt2 var8 : vt2.values()) {
            var1._0o(var2.offset(var8), this);
            if (var4 != 0) {
               break;
            }
         }
      }
   }

   @Override
   public void b8f(OpaquePredicate var1, mew var2, zfz var3) {
      int var4 = OpaquePredicate.c();
      if (this.xvi) {
         for (vt2 var8 : vt2.values()) {
            var1._0o(var2.offset(var8), this);
            if (var4 != 0) {
               break;
            }
         }
      }
   }

   @Override
   public int gpi(m5n param1, mew param2, zfz param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield mwn.xvi Z
      // 04: ifeq 25
      // 07: aload 3
      // 08: getstatic mwn.go7 Lqx_;
      // 0b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 10: aload 4
      // 12: if_acmpeq 25
      // 15: goto 1c
      // 18: invokestatic mwn.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 15
      // 1e: goto 26
      // 21: invokestatic mwn.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
   }

   private boolean kmv(OpaquePredicate var1, mew var2, zfz var3) {
      vt2 var4 = ((vt2)var3.dil(go7)).b4b();
      return var1.rjp(var2.offset(var4), var4);
   }

   @Override
   public void ff3(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
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
      // 000: getstatic mwn.b J
      // 003: ldc2_w 11839803449542
      // 006: lxor
      // 007: lstore 5
      // 009: aload 0
      // 00a: aload 1
      // 00b: aload 2
      // 00c: aload 3
      // 00d: invokespecial mwn.kmv (Lt9d;Lmew;Lzfz;)Z
      // 010: istore 8
      // 012: invokestatic OpaquePredicate.b ()I
      // 015: getstatic mwn.hp0 Ljava/util/Map;
      // 018: aload 1
      // 019: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 01e: checkcast java/util/List
      // 021: astore 9
      // 023: istore 7
      // 025: aload 9
      // 027: ifnull 08e
      // 02a: aload 9
      // 02c: invokeinterface java/util/List.isEmpty ()Z 1
      // 031: iload 7
      // 033: ifeq 092
      // 036: iload 7
      // 038: ifeq 092
      // 03b: goto 042
      // 03e: invokestatic mwn.a (Loov;)Loov;
      // 041: athrow
      // 042: ifne 08e
      // 045: goto 04c
      // 048: invokestatic mwn.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 1
      // 04d: invokevirtual OpaquePredicate.p2b ()J
      // 050: aload 9
      // 052: bipush 0
      // 053: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 058: checkcast mwn$pt6
      // 05b: getfield mwn$pt6.chc J
      // 05e: lsub
      // 05f: ldc2_w 60
      // 062: lcmp
      // 063: iload 7
      // 065: ifeq 092
      // 068: goto 06f
      // 06b: invokestatic mwn.a (Loov;)Loov;
      // 06e: athrow
      // 06f: ifle 08e
      // 072: goto 079
      // 075: invokestatic mwn.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 9
      // 07b: bipush 0
      // 07c: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 081: pop
      // 082: iload 7
      // 084: ifne 025
      // 087: goto 08e
      // 08a: invokestatic mwn.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield mwn.xvi Z
      // 092: iload 7
      // 094: ifeq 1ca
      // 097: ifeq 1c1
      // 09a: goto 0a1
      // 09d: invokestatic mwn.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: iload 8
      // 0a3: iload 7
      // 0a5: ifeq 0e5
      // 0a8: goto 0af
      // 0ab: invokestatic mwn.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: ifeq 21b
      // 0b2: goto 0b9
      // 0b5: invokestatic mwn.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 1
      // 0ba: aload 2
      // 0bb: getstatic ox_.wfw Le0x;
      // 0be: invokevirtual e0x.l4i ()Lzfz;
      // 0c1: getstatic mwn.go7 Lqx_;
      // 0c4: aload 3
      // 0c5: getstatic mwn.go7 Lqx_;
      // 0c8: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0cd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0d2: bipush 3
      // 0d3: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0d6: pop
      // 0d7: aload 0
      // 0d8: aload 1
      // 0d9: aload 2
      // 0da: bipush 1
      // 0db: invokespecial mwn.kfc (Lt9d;Lmew;Z)Z
      // 0de: goto 0e5
      // 0e1: invokestatic mwn.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: iload 7
      // 0e7: ifeq 13c
      // 0ea: ifeq 21b
      // 0ed: goto 0f4
      // 0f0: invokestatic mwn.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 1
      // 0f5: aload 2
      // 0f6: invokevirtual mew.getX ()I
      // 0f9: i2f
      // 0fa: ldc 0.5
      // 0fc: nop
      // 0fd: fadd
      // 0fe: f2d
      // 0ff: aload 2
      // 100: invokevirtual mew.getY ()I
      // 103: i2f
      // 104: ldc 0.5
      // 106: nop
      // 107: fadd
      // 108: f2d
      // 109: aload 2
      // 10a: invokevirtual mew.getZ ()I
      // 10d: i2f
      // 10e: ldc 0.5
      // 110: nop
      // 111: fadd
      // 112: f2d
      // 113: getstatic mwn.d Ljava/lang/String;
      // 116: nop
      // 117: ldc 0.5
      // 119: nop
      // 11a: ldc 2.6
      // 11c: nop
      // 11d: aload 1
      // 11e: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 121: invokevirtual java/util/Random.nextFloat ()F
      // 124: aload 1
      // 125: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 128: invokevirtual java/util/Random.nextFloat ()F
      // 12b: fsub
      // 12c: ldc 0.8
      // 12e: nop
      // 12f: fmul
      // 130: fadd
      // 131: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 134: bipush 0
      // 135: goto 13c
      // 138: invokestatic mwn.a (Loov;)Loov;
      // 13b: athrow
      // 13c: istore 10
      // 13e: iload 10
      // 140: bipush 5
      // 141: if_icmpge 1aa
      // 144: aload 2
      // 145: invokevirtual mew.getX ()I
      // 148: i2d
      // 149: aload 4
      // 14b: invokevirtual java/util/Random.nextDouble ()D
      // 14e: ldc2_w 0.6
      // 151: dmul
      // 152: dadd
      // 153: ldc2_w 0.2
      // 156: dadd
      // 157: dstore 11
      // 159: aload 2
      // 15a: invokevirtual mew.getY ()I
      // 15d: i2d
      // 15e: aload 4
      // 160: invokevirtual java/util/Random.nextDouble ()D
      // 163: ldc2_w 0.6
      // 166: dmul
      // 167: dadd
      // 168: ldc2_w 0.2
      // 16b: dadd
      // 16c: dstore 13
      // 16e: aload 2
      // 16f: invokevirtual mew.getZ ()I
      // 172: i2d
      // 173: aload 4
      // 175: invokevirtual java/util/Random.nextDouble ()D
      // 178: ldc2_w 0.6
      // 17b: dmul
      // 17c: dadd
      // 17d: ldc2_w 0.2
      // 180: dadd
      // 181: dstore 15
      // 183: aload 1
      // 184: getstatic w_0.bac Lw_0;
      // 187: dload 11
      // 189: dload 13
      // 18b: dload 15
      // 18d: dconst_0
      // 18e: dconst_0
      // 18f: dconst_0
      // 190: bipush 0
      // 191: newarray 10
      // 193: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 196: iinc 10 1
      // 199: iload 7
      // 19b: ifeq 1bc
      // 19e: iload 7
      // 1a0: ifne 13e
      // 1a3: goto 1aa
      // 1a6: invokestatic mwn.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: aload 1
      // 1ab: aload 2
      // 1ac: aload 1
      // 1ad: aload 2
      // 1ae: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1b1: invokeinterface zfz.r_y ()Le0x; 1
      // 1b6: sipush 160
      // 1b9: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 1bc: iload 7
      // 1be: ifne 21b
      // 1c1: iload 8
      // 1c3: goto 1ca
      // 1c6: invokestatic mwn.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: iload 7
      // 1cc: ifeq 1e7
      // 1cf: ifne 21b
      // 1d2: goto 1d9
      // 1d5: invokestatic mwn.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: aload 1
      // 1db: aload 2
      // 1dc: bipush 0
      // 1dd: invokespecial mwn.kfc (Lt9d;Lmew;Z)Z
      // 1e0: goto 1e7
      // 1e3: invokestatic mwn.a (Loov;)Loov;
      // 1e6: athrow
      // 1e7: iload 7
      // 1e9: ifeq 21a
      // 1ec: ifne 21b
      // 1ef: goto 1f6
      // 1f2: invokestatic mwn.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: aload 1
      // 1f7: aload 2
      // 1f8: getstatic ox_.b3k Le0x;
      // 1fb: invokevirtual e0x.l4i ()Lzfz;
      // 1fe: getstatic mwn.go7 Lqx_;
      // 201: aload 3
      // 202: getstatic mwn.go7 Lqx_;
      // 205: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 20a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 20f: bipush 3
      // 210: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 213: goto 21a
      // 216: invokestatic mwn.a (Loov;)Loov;
      // 219: athrow
      // 21a: pop
      // 21b: return
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
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
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokevirtual mwn._zm (Lt9d;Lmew;Lzfz;)Z
      // 0c: iload 5
      // 0e: ifeq 26
      // 11: ifne 42
      // 14: goto 1b
      // 17: invokestatic mwn.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield mwn.xvi Z
      // 1f: goto 26
      // 22: invokestatic mwn.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: aload 2
      // 29: aload 3
      // 2a: invokespecial mwn.kmv (Lt9d;Lmew;Lzfz;)Z
      // 2d: if_icmpne 42
      // 30: aload 1
      // 31: aload 2
      // 32: aload 0
      // 33: aload 0
      // 34: aload 1
      // 35: invokevirtual mwn.odp (Lt9d;)I
      // 38: invokevirtual OpaquePredicate.cjk (Lmew;Le0x;I)V
      // 3b: goto 42
      // 3e: invokestatic mwn.a (Loov;)Loov;
      // 41: athrow
      // 42: return
   }

   @Override
   public int sqt(m5n var1, mew var2, zfz var3, vt2 var4) {
      try {
         if (var4 == vt2.m3r) {
            return this.gpi(var1, var2, var3, var4);
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return 0;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.b3k);
   }

   @Override
   public boolean scl() {
      return true;
   }

   @Override
   public void kyo(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
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
      // 06: getfield mwn.xvi Z
      // 09: iload 5
      // 0b: ifeq 23
      // 0e: ifeq db
      // 11: goto 18
      // 14: invokestatic mwn.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 2
      // 19: invokevirtual mew.getX ()I
      // 1c: goto 23
      // 1f: invokestatic mwn.a (Loov;)Loov;
      // 22: athrow
      // 23: i2d
      // 24: ldc2_w 0.5
      // 27: dadd
      // 28: aload 4
      // 2a: invokevirtual java/util/Random.nextDouble ()D
      // 2d: ldc2_w 0.5
      // 30: dsub
      // 31: ldc2_w 0.2
      // 34: dmul
      // 35: dadd
      // 36: dstore 6
      // 38: aload 2
      // 39: invokevirtual mew.getY ()I
      // 3c: i2d
      // 3d: ldc2_w 0.7
      // 40: dadd
      // 41: aload 4
      // 43: invokevirtual java/util/Random.nextDouble ()D
      // 46: ldc2_w 0.5
      // 49: dsub
      // 4a: ldc2_w 0.2
      // 4d: dmul
      // 4e: dadd
      // 4f: dstore 8
      // 51: aload 2
      // 52: invokevirtual mew.getZ ()I
      // 55: i2d
      // 56: ldc2_w 0.5
      // 59: dadd
      // 5a: aload 4
      // 5c: invokevirtual java/util/Random.nextDouble ()D
      // 5f: ldc2_w 0.5
      // 62: dsub
      // 63: ldc2_w 0.2
      // 66: dmul
      // 67: dadd
      // 68: dstore 10
      // 6a: aload 3
      // 6b: getstatic mwn.go7 Lqx_;
      // 6e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 73: checkcast vt2
      // 76: astore 12
      // 78: aload 12
      // 7a: iload 5
      // 7c: ifeq 9b
      // 7f: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 82: invokevirtual vt2$y0s.pyt ()Z
      // 85: ifeq c8
      // 88: goto 8f
      // 8b: invokestatic mwn.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 12
      // 91: invokevirtual vt2.b4b ()Lvt2;
      // 94: goto 9b
      // 97: invokestatic mwn.a (Loov;)Loov;
      // 9a: athrow
      // 9b: astore 13
      // 9d: ldc2_w 0.27
      // a0: dstore 14
      // a2: dload 6
      // a4: ldc2_w 0.27
      // a7: aload 13
      // a9: invokevirtual vt2.n67 ()I
      // ac: i2d
      // ad: dmul
      // ae: dadd
      // af: dstore 6
      // b1: dload 8
      // b3: ldc2_w 0.22
      // b6: dadd
      // b7: dstore 8
      // b9: dload 10
      // bb: ldc2_w 0.27
      // be: aload 13
      // c0: invokevirtual vt2.ozy ()I
      // c3: i2d
      // c4: dmul
      // c5: dadd
      // c6: dstore 10
      // c8: aload 1
      // c9: getstatic w_0.dyc Lw_0;
      // cc: dload 6
      // ce: dload 8
      // d0: dload 10
      // d2: dconst_0
      // d3: dconst_0
      // d4: dconst_0
      // d5: bipush 0
      // d6: newarray 10
      // d8: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // db: return
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return u7m.gfm(ox_.b3k);
   }

   @Override
   public boolean ct_(e0x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic ox_.wfw Le0x;
      // 08: iload 2
      // 09: ifne 21
      // 0c: if_acmpeq 24
      // 0f: goto 16
      // 12: invokestatic mwn.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getstatic ox_.b3k Le0x;
      // 1a: goto 21
      // 1d: invokestatic mwn.a (Loov;)Loov;
      // 20: athrow
      // 21: if_acmpne 2c
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic mwn.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2777236966422912385L, 2900599632065793925L, MethodHandles.lookup().lookupClass()).a(76873983011504L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 5037902142990L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("L\u0013\"É\u000e?]¼®'wJB\u0015úk".getBytes("ISO-8859-1"));
      String var6 = c(var4).intern();
      byte var10001 = -1;
      d = var6;
      hp0 = Maps.newHashMap();
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
}
