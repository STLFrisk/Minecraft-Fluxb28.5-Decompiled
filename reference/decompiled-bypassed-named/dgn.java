import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dgn extends u7m {
   private Map o2v = Maps.newHashMap();
   private static final Map c8y;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public dgn() {
      this.cb3(1);
      this.oml(true);
      this.rlr(0);
      this.qfy(uja.wog);
   }

   public List cf0(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic dgn.a J
      // 03: ldc2_w 58181359410187
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq c5
      // 13: invokevirtual erg.w8b ()Z
      // 16: ifeq b5
      // 19: goto 20
      // 1c: invokestatic dgn.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: invokevirtual erg.zso ()Lbdo;
      // 24: iload 4
      // 26: ifeq c5
      // 29: goto 30
      // 2c: invokestatic dgn.a (Loov;)Loov;
      // 2f: athrow
      // 30: sipush 10210
      // 33: ldc2_w 4839135193780522920
      // 36: lload 2
      // 37: lxor
      // 38: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: nop
      // 3e: bipush 9
      // 40: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 43: ifeq b5
      // 46: goto 4d
      // 49: invokestatic dgn.a (Loov;)Loov;
      // 4c: athrow
      // 4d: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 50: astore 5
      // 52: aload 1
      // 53: invokevirtual erg.zso ()Lbdo;
      // 56: sipush 27911
      // 59: ldc2_w 7288445919061689676
      // 5c: lload 2
      // 5d: lxor
      // 5e: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: bipush 10
      // 66: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 69: astore 6
      // 6b: bipush 0
      // 6c: istore 7
      // 6e: iload 7
      // 70: aload 6
      // 72: invokevirtual qhg.vek ()I
      // 75: if_icmpge b2
      // 78: aload 6
      // 7a: iload 7
      // 7c: invokevirtual qhg.kd6 (I)Lbdo;
      // 7f: astore 8
      // 81: aload 8
      // 83: invokestatic sdj.a1a (Lbdo;)Lsdj;
      // 86: astore 9
      // 88: iload 4
      // 8a: ifeq ad
      // 8d: aload 9
      // 8f: ifnull aa
      // 92: goto 99
      // 95: invokestatic dgn.a (Loov;)Loov;
      // 98: athrow
      // 99: aload 5
      // 9b: aload 9
      // 9d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a2: pop
      // a3: goto aa
      // a6: invokestatic dgn.a (Loov;)Loov;
      // a9: athrow
      // aa: iinc 7 1
      // ad: iload 4
      // af: ifne 6e
      // b2: aload 5
      // b4: areturn
      // b5: aload 0
      // b6: getfield dgn.o2v Ljava/util/Map;
      // b9: aload 1
      // ba: invokevirtual erg.j6_ ()I
      // bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c0: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // c5: checkcast java/util/List
      // c8: astore 5
      // ca: aload 5
      // cc: iload 4
      // ce: ifeq fa
      // d1: ifnonnull f8
      // d4: goto db
      // d7: invokestatic dgn.a (Loov;)Loov;
      // da: athrow
      // db: aload 1
      // dc: invokevirtual erg.j6_ ()I
      // df: bipush 0
      // e0: invokestatic ksn.b_j (IZ)Ljava/util/List;
      // e3: astore 5
      // e5: aload 0
      // e6: getfield dgn.o2v Ljava/util/Map;
      // e9: aload 1
      // ea: invokevirtual erg.j6_ ()I
      // ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // f0: aload 5
      // f2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f7: pop
      // f8: aload 5
      // fa: areturn
   }

   public List pcg(int var1) {
      int var2 = OpaquePredicate.b();
      List var3 = (List)this.o2v.get(var1);

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 != null) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 = ksn.b_j(var1, false);
      this.o2v.put(var1, var3);
      return var3;
   }

   @Override
   public erg q20(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: getfield ha9.lls Lpj2;
      // 09: getfield pj2.g40 Z
      // 0c: iload 4
      // 0e: ifeq 30
      // 11: ifne 2c
      // 14: goto 1b
      // 17: invokestatic dgn.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: dup
      // 1d: getfield erg.qd2 I
      // 20: bipush 1
      // 21: isub
      // 22: putfield erg.qd2 I
      // 25: goto 2c
      // 28: invokestatic dgn.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 2
      // 2d: getfield OpaquePredicate.v0f Z
      // 30: iload 4
      // 32: ifeq a7
      // 35: ifne 94
      // 38: goto 3f
      // 3b: invokestatic dgn.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: aload 1
      // 41: invokevirtual dgn.cf0 (Lerg;)Ljava/util/List;
      // 44: astore 5
      // 46: iload 4
      // 48: ifeq a0
      // 4b: aload 5
      // 4d: ifnull 94
      // 50: goto 57
      // 53: invokestatic dgn.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 5
      // 59: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 5e: astore 6
      // 60: aload 6
      // 62: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 67: ifeq 94
      // 6a: aload 6
      // 6c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 71: checkcast sdj
      // 74: astore 7
      // 76: aload 3
      // 77: new sdj
      // 7a: dup
      // 7b: aload 7
      // 7d: invokespecial sdj.<init> (Lsdj;)V
      // 80: invokevirtual ha9.gmn (Lsdj;)V
      // 83: iload 4
      // 85: ifeq a0
      // 88: iload 4
      // 8a: ifne 60
      // 8d: goto 94
      // 90: invokestatic dgn.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 3
      // 95: getstatic l9p.foo [L_ss;
      // 98: aload 0
      // 99: invokestatic u7m._lo (Lu7m;)I
      // 9c: aaload
      // 9d: invokevirtual ha9.aex (L_ss;)V
      // a0: aload 3
      // a1: getfield ha9.lls Lpj2;
      // a4: getfield pj2.g40 Z
      // a7: iload 4
      // a9: ifeq c1
      // ac: ifne f1
      // af: goto b6
      // b2: invokestatic dgn.a (Loov;)Loov;
      // b5: athrow
      // b6: aload 1
      // b7: getfield erg.qd2 I
      // ba: goto c1
      // bd: invokestatic dgn.a (Loov;)Loov;
      // c0: athrow
      // c1: iload 4
      // c3: ifeq f0
      // c6: ifgt df
      // c9: goto d0
      // cc: invokestatic dgn.a (Loov;)Loov;
      // cf: athrow
      // d0: new erg
      // d3: dup
      // d4: getstatic xbr.fvb Lu7m;
      // d7: invokespecial erg.<init> (Lu7m;)V
      // da: areturn
      // db: invokestatic dgn.a (Loov;)Loov;
      // de: athrow
      // df: aload 3
      // e0: getfield ha9.up_ Ljnq;
      // e3: new erg
      // e6: dup
      // e7: getstatic xbr.fvb Lu7m;
      // ea: invokespecial erg.<init> (Lu7m;)V
      // ed: invokevirtual jnq.phd (Lerg;)Z
      // f0: pop
      // f1: aload 1
      // f2: areturn
   }

   @Override
   public int hdm(erg var1) {
      return 32;
   }

   @Override
   public ce2 uf6(erg var1) {
      return ce2.wtv;
   }

   @Override
   public erg r__(erg param1, OpaquePredicate param2, ha9 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic dgn.a J
      // 03: ldc2_w 36924493486347
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: istore 6
      // 0e: aload 1
      // 0f: iload 6
      // 11: ifeq bd
      // 14: invokevirtual erg.j6_ ()I
      // 17: invokestatic dgn.rri (I)Z
      // 1a: ifeq b2
      // 1d: goto 24
      // 20: invokestatic dgn.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 3
      // 25: getfield ha9.lls Lpj2;
      // 28: getfield pj2.g40 Z
      // 2b: iload 6
      // 2d: ifeq 8b
      // 30: goto 37
      // 33: invokestatic dgn.a (Loov;)Loov;
      // 36: athrow
      // 37: ifne 52
      // 3a: goto 41
      // 3d: invokestatic dgn.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 1
      // 42: dup
      // 43: getfield erg.qd2 I
      // 46: bipush 1
      // 47: isub
      // 48: putfield erg.qd2 I
      // 4b: goto 52
      // 4e: invokestatic dgn.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 2
      // 53: aload 3
      // 54: sipush 296
      // 57: ldc2_w 449096233403378789
      // 5a: lload 4
      // 5c: lxor
      // 5d: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: nop
      // 63: ldc 0.5
      // 65: nop
      // 66: ldc 0.4
      // 68: nop
      // 69: getstatic dgn.pq6 Ljava/util/Random;
      // 6c: invokevirtual java/util/Random.nextFloat ()F
      // 6f: ldc 0.4
      // 71: nop
      // 72: fmul
      // 73: ldc 0.8
      // 75: nop
      // 76: fadd
      // 77: fdiv
      // 78: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // 7b: iload 6
      // 7d: ifeq b0
      // 80: aload 2
      // 81: getfield OpaquePredicate.v0f Z
      // 84: goto 8b
      // 87: invokestatic dgn.a (Loov;)Loov;
      // 8a: athrow
      // 8b: ifne a4
      // 8e: aload 2
      // 8f: new nuq
      // 92: dup
      // 93: aload 2
      // 94: aload 3
      // 95: aload 1
      // 96: invokespecial nuq.<init> (Lt9d;Lg_3;Lerg;)V
      // 99: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 9c: pop
      // 9d: goto a4
      // a0: invokestatic dgn.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 3
      // a5: getstatic l9p.foo [L_ss;
      // a8: aload 0
      // a9: invokestatic u7m._lo (Lu7m;)I
      // ac: aaload
      // ad: invokevirtual ha9.aex (L_ss;)V
      // b0: aload 1
      // b1: areturn
      // b2: aload 3
      // b3: aload 1
      // b4: aload 0
      // b5: aload 1
      // b6: invokevirtual dgn.hdm (Lerg;)I
      // b9: invokevirtual ha9.qez (Lerg;I)V
      // bc: aload 1
      // bd: areturn
   }

   public static boolean rri(int var0) {
      int var1 = OpaquePredicate.c();

      try {
         int var10000 = var0 & 16384;
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public int ex2(int var1) {
      return ksn.qkv(var1, false);
   }

   @Override
   public int bu9(erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifeq 1d
      // 09: ifle 20
      // 0c: goto 13
      // 0f: invokestatic dgn.a (Loov;)Loov;
      // 12: athrow
      // 13: ldc 16777215
      // 15: nop
      // 16: goto 1d
      // 19: invokestatic dgn.a (Loov;)Loov;
      // 1c: athrow
      // 1d: goto 28
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual erg.j6_ ()I
      // 25: invokevirtual dgn.ex2 (I)I
      // 28: ireturn
   }

   public boolean ou3(int param1) {
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
      // 05: iload 1
      // 06: invokevirtual dgn.pcg (I)Ljava/util/List;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 1a
      // 0f: ifnull 78
      // 12: goto 19
      // 15: invokestatic dgn.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 3
      // 1a: invokeinterface java/util/List.isEmpty ()Z 1
      // 1f: iload 2
      // 20: ifeq 79
      // 23: ifne 78
      // 26: goto 2d
      // 29: invokestatic dgn.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 3
      // 2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 33: astore 4
      // 35: aload 4
      // 37: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c: ifeq 76
      // 3f: aload 4
      // 41: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 46: checkcast sdj
      // 49: astore 5
      // 4b: getstatic mcs.ip9 [Lmcs;
      // 4e: aload 5
      // 50: invokevirtual sdj._na ()I
      // 53: aaload
      // 54: invokevirtual mcs.jee ()Z
      // 57: iload 2
      // 58: ifeq 77
      // 5b: iload 2
      // 5c: ifeq 71
      // 5f: goto 66
      // 62: invokestatic dgn.a (Loov;)Loov;
      // 65: athrow
      // 66: ifeq 72
      // 69: goto 70
      // 6c: invokestatic dgn.a (Loov;)Loov;
      // 6f: athrow
      // 70: bipush 1
      // 71: ireturn
      // 72: iload 2
      // 73: ifne 35
      // 76: bipush 0
      // 77: ireturn
      // 78: bipush 0
      // 79: ireturn
   }

   @Override
   public String ily(erg var1) {
      long var2 = a ^ 86743777516129L;
      int var4 = OpaquePredicate.c();

      try {
         if (var1.j6_() == 0) {
            return orr.zgh(b<"b">(2979, 1657878791280076170L ^ var2)).trim();
         }
      } catch (oov var8) {
         throw a(var8);
      }

      String var5 = "";
      if (rri(var1.j6_())) {
         var5 = orr.zgh(b<"b">(27775, 4476207686546244187L ^ var2)).trim() + " ";
      }

      List var6 = xbr.ik6.cf0(var1);

      label46: {
         int var13;
         label45: {
            label44: {
               label43: {
                  try {
                     var10000 = var6;
                     if (var4 != 0) {
                        break label43;
                     }

                     if (var6 == null) {
                        break label44;
                     }
                  } catch (oov var10) {
                     throw a(var10);
                  }

                  var10000 = var6;
               }

               try {
                  var13 = var10000.isEmpty();
                  if (var4 != 0) {
                     break label45;
                  }

                  if (var13 == 0) {
                     break label46;
                  }
               } catch (oov var9) {
                  throw a(var9);
               }
            }

            var13 = var1.j6_();
         }

         String var12 = ksn.zvo(var13);
         return orr.zgh(var12).trim() + " " + super.ily(var1);
      }

      String var7 = ((sdj)var6.get(0)).imc();
      var7 = var7 + b<"b">(19554, 7587682371586318926L ^ var2);
      return var5 + orr.zgh(var7).trim();
   }

   @Override
   public void wra(erg param1, ha9 param2, List param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dgn.a J
      // 003: ldc2_w 35045762655010
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 7
      // 00e: aload 1
      // 00f: invokevirtual erg.j6_ ()I
      // 012: ifeq 493
      // 015: getstatic xbr.ik6 Ldgn;
      // 018: aload 1
      // 019: invokevirtual dgn.cf0 (Lerg;)Ljava/util/List;
      // 01c: astore 8
      // 01e: invokestatic com/google/common/collect/HashMultimap.create ()Lcom/google/common/collect/HashMultimap;
      // 021: astore 9
      // 023: aload 8
      // 025: iload 7
      // 027: ifne 036
      // 02a: ifnull 243
      // 02d: goto 034
      // 030: invokestatic dgn.a (Loov;)Loov;
      // 033: athrow
      // 034: aload 8
      // 036: iload 7
      // 038: ifne 053
      // 03b: invokeinterface java/util/List.isEmpty ()Z 1
      // 040: ifne 243
      // 043: goto 04a
      // 046: invokestatic dgn.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 8
      // 04c: goto 053
      // 04f: invokestatic dgn.a (Loov;)Loov;
      // 052: athrow
      // 053: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 058: astore 10
      // 05a: aload 10
      // 05c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 061: ifeq 23e
      // 064: aload 10
      // 066: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06b: checkcast sdj
      // 06e: astore 11
      // 070: aload 11
      // 072: invokevirtual sdj.imc ()Ljava/lang/String;
      // 075: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 078: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 07b: astore 12
      // 07d: getstatic mcs.ip9 [Lmcs;
      // 080: aload 11
      // 082: invokevirtual sdj._na ()I
      // 085: aaload
      // 086: astore 13
      // 088: aload 13
      // 08a: invokevirtual mcs.iok ()Ljava/util/Map;
      // 08d: astore 14
      // 08f: aload 14
      // 091: iload 7
      // 093: ifne 2e8
      // 096: iload 7
      // 098: ifne 0ae
      // 09b: goto 0a2
      // 09e: invokestatic dgn.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: ifnull 13b
      // 0a5: goto 0ac
      // 0a8: invokestatic dgn.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: aload 14
      // 0ae: invokeinterface java/util/Map.size ()I 1
      // 0b3: iload 7
      // 0b5: ifne 140
      // 0b8: ifle 13b
      // 0bb: goto 0c2
      // 0be: invokestatic dgn.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 14
      // 0c4: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0c9: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0ce: astore 15
      // 0d0: aload 15
      // 0d2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d7: ifeq 13b
      // 0da: aload 15
      // 0dc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e1: checkcast java/util/Map$Entry
      // 0e4: astore 16
      // 0e6: aload 16
      // 0e8: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0ed: checkcast xk5
      // 0f0: astore 17
      // 0f2: new xk5
      // 0f5: dup
      // 0f6: aload 17
      // 0f8: invokevirtual xk5.jhj ()Ljava/lang/String;
      // 0fb: aload 13
      // 0fd: aload 11
      // 0ff: invokevirtual sdj.tus ()I
      // 102: aload 17
      // 104: invokevirtual mcs.mgu (ILxk5;)D
      // 107: aload 17
      // 109: invokevirtual xk5.zdp ()I
      // 10c: invokespecial xk5.<init> (Ljava/lang/String;DI)V
      // 10f: astore 18
      // 111: aload 9
      // 113: aload 16
      // 115: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 11a: checkcast w9p
      // 11d: invokeinterface w9p.ugh ()Ljava/lang/String; 1
      // 122: aload 18
      // 124: invokeinterface com/google/common/collect/Multimap.put (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 129: pop
      // 12a: iload 7
      // 12c: ifne 193
      // 12f: iload 7
      // 131: ifeq 0d0
      // 134: goto 13b
      // 137: invokestatic dgn.a (Loov;)Loov;
      // 13a: athrow
      // 13b: aload 11
      // 13d: invokevirtual sdj.tus ()I
      // 140: iload 7
      // 142: ifne 198
      // 145: ifle 193
      // 148: goto 14f
      // 14b: invokestatic dgn.a (Loov;)Loov;
      // 14e: athrow
      // 14f: new java/lang/StringBuilder
      // 152: dup
      // 153: invokespecial java/lang/StringBuilder.<init> ()V
      // 156: aload 12
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15b: ldc " "
      // 15d: nop
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: new java/lang/StringBuilder
      // 164: dup
      // 165: invokespecial java/lang/StringBuilder.<init> ()V
      // 168: sipush 4920
      // 16b: ldc2_w 1522726473073509462
      // 16e: lload 5
      // 170: lxor
      // 171: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: nop
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: aload 11
      // 17c: invokevirtual sdj.tus ()I
      // 17f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 182: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 185: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 188: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 18b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 191: astore 12
      // 193: aload 11
      // 195: invokevirtual sdj.ltp ()I
      // 198: iload 7
      // 19a: ifne 1df
      // 19d: bipush 20
      // 19f: if_icmple 1da
      // 1a2: goto 1a9
      // 1a5: invokestatic dgn.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: new java/lang/StringBuilder
      // 1ac: dup
      // 1ad: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b0: aload 12
      // 1b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b5: sipush 311
      // 1b8: ldc2_w 5926242290630940252
      // 1bb: lload 5
      // 1bd: lxor
      // 1be: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: nop
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: aload 11
      // 1c9: invokestatic mcs.pvn (Lsdj;)Ljava/lang/String;
      // 1cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cf: ldc ")"
      // 1d1: nop
      // 1d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d8: astore 12
      // 1da: aload 13
      // 1dc: invokevirtual mcs.kmi ()Z
      // 1df: iload 7
      // 1e1: ifne 238
      // 1e4: ifeq 216
      // 1e7: goto 1ee
      // 1ea: invokestatic dgn.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 3
      // 1ef: new java/lang/StringBuilder
      // 1f2: dup
      // 1f3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f6: getstatic syo.aez Lsyo;
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1fc: aload 12
      // 1fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 201: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 204: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 209: pop
      // 20a: iload 7
      // 20c: ifeq 239
      // 20f: goto 216
      // 212: invokestatic dgn.a (Loov;)Loov;
      // 215: athrow
      // 216: aload 3
      // 217: new java/lang/StringBuilder
      // 21a: dup
      // 21b: invokespecial java/lang/StringBuilder.<init> ()V
      // 21e: getstatic syo.qiz Lsyo;
      // 221: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 224: aload 12
      // 226: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 229: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 231: goto 238
      // 234: invokestatic dgn.a (Loov;)Loov;
      // 237: athrow
      // 238: pop
      // 239: iload 7
      // 23b: ifeq 05a
      // 23e: iload 7
      // 240: ifeq 276
      // 243: sipush 13597
      // 246: ldc2_w 2440947032705753717
      // 249: lload 5
      // 24b: lxor
      // 24c: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: nop
      // 252: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 255: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 258: astore 10
      // 25a: aload 3
      // 25b: new java/lang/StringBuilder
      // 25e: dup
      // 25f: invokespecial java/lang/StringBuilder.<init> ()V
      // 262: getstatic syo.qiz Lsyo;
      // 265: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 268: aload 10
      // 26a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 270: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 275: pop
      // 276: aload 9
      // 278: invokeinterface com/google/common/collect/Multimap.isEmpty ()Z 1
      // 27d: iload 7
      // 27f: ifne 2c8
      // 282: ifne 493
      // 285: goto 28c
      // 288: invokestatic dgn.a (Loov;)Loov;
      // 28b: athrow
      // 28c: aload 3
      // 28d: ldc ""
      // 28f: nop
      // 290: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 295: pop
      // 296: aload 3
      // 297: new java/lang/StringBuilder
      // 29a: dup
      // 29b: invokespecial java/lang/StringBuilder.<init> ()V
      // 29e: getstatic syo.iis Lsyo;
      // 2a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2a4: sipush 12837
      // 2a7: ldc2_w 6330092530796291395
      // 2aa: lload 5
      // 2ac: lxor
      // 2ad: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: nop
      // 2b3: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 2b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2bc: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2c1: goto 2c8
      // 2c4: invokestatic dgn.a (Loov;)Loov;
      // 2c7: athrow
      // 2c8: pop
      // 2c9: aload 9
      // 2cb: invokeinterface com/google/common/collect/Multimap.entries ()Ljava/util/Collection; 1
      // 2d0: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 2d5: astore 10
      // 2d7: aload 10
      // 2d9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2de: ifeq 493
      // 2e1: aload 10
      // 2e3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e8: checkcast java/util/Map$Entry
      // 2eb: astore 11
      // 2ed: aload 11
      // 2ef: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2f4: checkcast xk5
      // 2f7: astore 12
      // 2f9: aload 12
      // 2fb: invokevirtual xk5._2u ()D
      // 2fe: dstore 13
      // 300: aload 12
      // 302: iload 7
      // 304: ifne 346
      // 307: invokevirtual xk5.zdp ()I
      // 30a: bipush 1
      // 30b: if_icmpeq 33d
      // 30e: goto 315
      // 311: invokestatic dgn.a (Loov;)Loov;
      // 314: athrow
      // 315: aload 12
      // 317: iload 7
      // 319: ifne 346
      // 31c: goto 323
      // 31f: invokestatic dgn.a (Loov;)Loov;
      // 322: athrow
      // 323: invokevirtual xk5.zdp ()I
      // 326: bipush 2
      // 327: if_icmpeq 33d
      // 32a: goto 331
      // 32d: invokestatic dgn.a (Loov;)Loov;
      // 330: athrow
      // 331: aload 12
      // 333: invokevirtual xk5._2u ()D
      // 336: dstore 15
      // 338: iload 7
      // 33a: ifeq 34f
      // 33d: aload 12
      // 33f: goto 346
      // 342: invokestatic dgn.a (Loov;)Loov;
      // 345: athrow
      // 346: invokevirtual xk5._2u ()D
      // 349: ldc2_w 100.0
      // 34c: dmul
      // 34d: dstore 15
      // 34f: dload 13
      // 351: dconst_0
      // 352: dcmpl
      // 353: iload 7
      // 355: ifne 3f8
      // 358: ifle 3ed
      // 35b: goto 362
      // 35e: invokestatic dgn.a (Loov;)Loov;
      // 361: athrow
      // 362: aload 3
      // 363: new java/lang/StringBuilder
      // 366: dup
      // 367: invokespecial java/lang/StringBuilder.<init> ()V
      // 36a: getstatic syo.jkd Lsyo;
      // 36d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 370: new java/lang/StringBuilder
      // 373: dup
      // 374: invokespecial java/lang/StringBuilder.<init> ()V
      // 377: sipush 24210
      // 37a: ldc2_w 6193454838616001010
      // 37d: lload 5
      // 37f: lxor
      // 380: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: nop
      // 386: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 389: aload 12
      // 38b: invokevirtual xk5.zdp ()I
      // 38e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 391: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 394: bipush 2
      // 395: anewarray 413
      // 398: dup
      // 399: bipush 0
      // 39a: getstatic erg.ilh Ljava/text/DecimalFormat;
      // 39d: dload 15
      // 39f: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 3a2: aastore
      // 3a3: dup
      // 3a4: bipush 1
      // 3a5: new java/lang/StringBuilder
      // 3a8: dup
      // 3a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ac: sipush 3189
      // 3af: ldc2_w 3577514019403619092
      // 3b2: lload 5
      // 3b4: lxor
      // 3b5: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ba: nop
      // 3bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3be: aload 11
      // 3c0: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 3c5: checkcast java/lang/String
      // 3c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3cb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ce: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 3d1: aastore
      // 3d2: invokestatic orr.x19 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 3d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3db: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3e0: pop
      // 3e1: iload 7
      // 3e3: ifeq 48e
      // 3e6: goto 3ed
      // 3e9: invokestatic dgn.a (Loov;)Loov;
      // 3ec: athrow
      // 3ed: dload 13
      // 3ef: dconst_0
      // 3f0: dcmpg
      // 3f1: goto 3f8
      // 3f4: invokestatic dgn.a (Loov;)Loov;
      // 3f7: athrow
      // 3f8: iload 7
      // 3fa: ifne 48d
      // 3fd: ifge 48e
      // 400: goto 407
      // 403: invokestatic dgn.a (Loov;)Loov;
      // 406: athrow
      // 407: dload 15
      // 409: ldc2_w -1.0
      // 40c: dmul
      // 40d: dstore 15
      // 40f: aload 3
      // 410: new java/lang/StringBuilder
      // 413: dup
      // 414: invokespecial java/lang/StringBuilder.<init> ()V
      // 417: getstatic syo.aez Lsyo;
      // 41a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 41d: new java/lang/StringBuilder
      // 420: dup
      // 421: invokespecial java/lang/StringBuilder.<init> ()V
      // 424: sipush 26339
      // 427: ldc2_w 5563449935131980166
      // 42a: lload 5
      // 42c: lxor
      // 42d: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 432: nop
      // 433: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 436: aload 12
      // 438: invokevirtual xk5.zdp ()I
      // 43b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 43e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 441: bipush 2
      // 442: anewarray 413
      // 445: dup
      // 446: bipush 0
      // 447: getstatic erg.ilh Ljava/text/DecimalFormat;
      // 44a: dload 15
      // 44c: invokevirtual java/text/DecimalFormat.format (D)Ljava/lang/String;
      // 44f: aastore
      // 450: dup
      // 451: bipush 1
      // 452: new java/lang/StringBuilder
      // 455: dup
      // 456: invokespecial java/lang/StringBuilder.<init> ()V
      // 459: sipush 16663
      // 45c: ldc2_w 2974519027145610878
      // 45f: lload 5
      // 461: lxor
      // 462: invokedynamic b (IJ)Ljava/lang/String; bsm=dgn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 467: nop
      // 468: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46b: aload 11
      // 46d: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 472: checkcast java/lang/String
      // 475: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 478: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 47b: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 47e: aastore
      // 47f: invokestatic orr.x19 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 482: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 485: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 488: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 48d: pop
      // 48e: iload 7
      // 490: ifeq 2d7
      // 493: return
   }

   @Override
   public boolean lsj(erg var1) {
      int var2 = OpaquePredicate.c();
      List var3 = this.cf0(var1);

      List var10000;
      label33: {
         try {
            var10000 = var3;
            if (var2 != 0) {
               break label33;
            }

            if (var3 == null) {
               return false;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var3;
      }

      try {
         boolean var6 = var10000.isEmpty();
         if (var2 != 0) {
            return var6;
         }

         if (!var6) {
            return true;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return false;
   }

   @Override
   public void jlj(u7m param1, uja param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: aload 1
      // 007: aload 2
      // 008: aload 3
      // 009: invokespecial u7m.jlj (Lu7m;Luja;Ljava/util/List;)V
      // 00c: getstatic dgn.c8y Ljava/util/Map;
      // 00f: iload 4
      // 011: ifeq 138
      // 014: invokeinterface java/util/Map.isEmpty ()Z 1
      // 019: ifeq 135
      // 01c: goto 023
      // 01f: invokestatic dgn.a (Loov;)Loov;
      // 022: athrow
      // 023: bipush 0
      // 024: istore 5
      // 026: iload 5
      // 028: bipush 15
      // 02a: if_icmpgt 135
      // 02d: bipush 0
      // 02e: istore 6
      // 030: iload 6
      // 032: bipush 1
      // 033: if_icmpgt 12d
      // 036: iload 6
      // 038: iload 4
      // 03a: ifeq 028
      // 03d: iload 4
      // 03f: ifeq 066
      // 042: ifne 059
      // 045: goto 04c
      // 048: invokestatic dgn.a (Loov;)Loov;
      // 04b: athrow
      // 04c: iload 5
      // 04e: sipush 8192
      // 051: ior
      // 052: istore 7
      // 054: iload 4
      // 056: ifne 068
      // 059: iload 5
      // 05b: sipush 16384
      // 05e: ior
      // 05f: goto 066
      // 062: invokestatic dgn.a (Loov;)Loov;
      // 065: athrow
      // 066: istore 7
      // 068: bipush 0
      // 069: istore 8
      // 06b: iload 8
      // 06d: bipush 2
      // 06e: if_icmpgt 125
      // 071: iload 7
      // 073: istore 9
      // 075: iload 8
      // 077: iload 4
      // 079: ifeq 032
      // 07c: iload 4
      // 07e: ifeq 0d2
      // 081: ifeq 0d0
      // 084: goto 08b
      // 087: invokestatic dgn.a (Loov;)Loov;
      // 08a: athrow
      // 08b: iload 8
      // 08d: bipush 1
      // 08e: iload 4
      // 090: ifeq 0ba
      // 093: goto 09a
      // 096: invokestatic dgn.a (Loov;)Loov;
      // 099: athrow
      // 09a: if_icmpne 0b0
      // 09d: goto 0a4
      // 0a0: invokestatic dgn.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: iload 7
      // 0a6: bipush 32
      // 0a8: ior
      // 0a9: istore 9
      // 0ab: iload 4
      // 0ad: ifne 0d0
      // 0b0: iload 8
      // 0b2: bipush 2
      // 0b3: goto 0ba
      // 0b6: invokestatic dgn.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: iload 4
      // 0bc: ifeq 0d3
      // 0bf: if_icmpne 0d0
      // 0c2: goto 0c9
      // 0c5: invokestatic dgn.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: iload 7
      // 0cb: bipush 64
      // 0cd: ior
      // 0ce: istore 9
      // 0d0: iload 9
      // 0d2: bipush 0
      // 0d3: invokestatic ksn.b_j (IZ)Ljava/util/List;
      // 0d6: astore 10
      // 0d8: iload 4
      // 0da: ifeq 120
      // 0dd: aload 10
      // 0df: ifnull 11d
      // 0e2: goto 0e9
      // 0e5: invokestatic dgn.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 10
      // 0eb: iload 4
      // 0ed: ifeq 11c
      // 0f0: goto 0f7
      // 0f3: invokestatic dgn.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: invokeinterface java/util/List.isEmpty ()Z 1
      // 0fc: ifne 11d
      // 0ff: goto 106
      // 102: invokestatic dgn.a (Loov;)Loov;
      // 105: athrow
      // 106: getstatic dgn.c8y Ljava/util/Map;
      // 109: aload 10
      // 10b: iload 9
      // 10d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 110: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 115: goto 11c
      // 118: invokestatic dgn.a (Loov;)Loov;
      // 11b: athrow
      // 11c: pop
      // 11d: iinc 8 1
      // 120: iload 4
      // 122: ifne 06b
      // 125: iinc 6 1
      // 128: iload 4
      // 12a: ifne 030
      // 12d: iinc 5 1
      // 130: iload 4
      // 132: ifne 026
      // 135: getstatic dgn.c8y Ljava/util/Map;
      // 138: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 13d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 142: astore 5
      // 144: aload 5
      // 146: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14b: ifeq 174
      // 14e: aload 5
      // 150: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 155: checkcast java/lang/Integer
      // 158: invokevirtual java/lang/Integer.intValue ()I
      // 15b: istore 6
      // 15d: aload 3
      // 15e: new erg
      // 161: dup
      // 162: aload 1
      // 163: bipush 1
      // 164: iload 6
      // 166: invokespecial erg.<init> (Lu7m;II)V
      // 169: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16e: pop
      // 16f: iload 4
      // 171: ifne 144
      // 174: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2434210186395063781L, -3249997523752891740L, MethodHandles.lookup().lookupClass()).a(99705640473891L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 10715352775901L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = " òdþ\u0019\u009b>\u001b®å6\u0088Ô\u0083\u0082BÇÍÁà>\u001c÷TAûã&®\u0014Ò\u0093q\u0087\u00979!\u000ben(fB\u009d{^·\u008a]\u0086¹¹÷2ý462%\u009bî\u0095º\u0096úëäã\u001c\u0012\u001bm²V\u009aw\u0098¤'½ì8Sv.iÃ\u0082Ø=j_é^¦;GóBj%i\u0095jk´iÂh©z,àE\u0087ßù\u008a\u0083\u000b´?\u0013èM÷DYý]pêä\u0010¡P\u009eÜ \u0014è\u009b~¬\u008f²\u0001FÚ\f\u0012h\fh¬¯ÖùW+~P£\u009eq\u0007\u0087Ì%ô\t0R\t+\u0018Áßå=ä ¾Þõg·ÄGÃ\u000bõÈ(uy\u0013\u008cÀé+\u00074\u0012ÈQÃf¼2\u009ey«º\u0092úJ|2,(w\u0007\u009f}\u0092ø\u0018I\u0083X¦\u001eí`S\u0090Å\u0087õÓc^\u009bÅÜá\u0000ÃÆ\u001fM\u0006i\u008d\u009c\u009a\n>½*\u0018\u001a\u000fá#ò¿Ø÷é8A\u0090\u0007ÄÄ\u0087·D¾§\u0081|E^8´á\u0015\u009c\u000fG\u0080öJ\"T³í\u0082)B¶X\u008cÔã\n´ñ$Hþ«¡½Ê\täx\u009b»]x¬\u000fk\u0016ÆõásKC§\u0000ó6tÉ¡Î(!Eæ\u008eÀoäd\u009cÛ=ð\u0016§\u0080\u0012H[^\u0089\u008d\u000bþY8ñß]çY\u001e\u0091#9üs\u001c/ãú\u0010z:[\u009f\u0002{\u0007\u009bùT\u0019ñ~\u0086²d ?ÂÙ^F3\u009fó\u008bce«0\u001cA\u0000Ökö1È$Zà9á}EãbË,\u0018\u0017Z¨\u008a\"¸\u0098#º\u0092Ý³ôí`\u001fìÐ\u0087\u0088\u0099àÙ ";
      int var8 = " òdþ\u0019\u009b>\u001b®å6\u0088Ô\u0083\u0082BÇÍÁà>\u001c÷TAûã&®\u0014Ò\u0093q\u0087\u00979!\u000ben(fB\u009d{^·\u008a]\u0086¹¹÷2ý462%\u009bî\u0095º\u0096úëäã\u001c\u0012\u001bm²V\u009aw\u0098¤'½ì8Sv.iÃ\u0082Ø=j_é^¦;GóBj%i\u0095jk´iÂh©z,àE\u0087ßù\u008a\u0083\u000b´?\u0013èM÷DYý]pêä\u0010¡P\u009eÜ \u0014è\u009b~¬\u008f²\u0001FÚ\f\u0012h\fh¬¯ÖùW+~P£\u009eq\u0007\u0087Ì%ô\t0R\t+\u0018Áßå=ä ¾Þõg·ÄGÃ\u000bõÈ(uy\u0013\u008cÀé+\u00074\u0012ÈQÃf¼2\u009ey«º\u0092úJ|2,(w\u0007\u009f}\u0092ø\u0018I\u0083X¦\u001eí`S\u0090Å\u0087õÓc^\u009bÅÜá\u0000ÃÆ\u001fM\u0006i\u008d\u009c\u009a\n>½*\u0018\u001a\u000fá#ò¿Ø÷é8A\u0090\u0007ÄÄ\u0087·D¾§\u0081|E^8´á\u0015\u009c\u000fG\u0080öJ\"T³í\u0082)B¶X\u008cÔã\n´ñ$Hþ«¡½Ê\täx\u009b»]x¬\u000fk\u0016ÆõásKC§\u0000ó6tÉ¡Î(!Eæ\u008eÀoäd\u009cÛ=ð\u0016§\u0080\u0012H[^\u0089\u008d\u000bþY8ñß]çY\u001e\u0091#9üs\u001c/ãú\u0010z:[\u009f\u0002{\u0007\u009bùT\u0019ñ~\u0086²d ?ÂÙ^F3\u009fó\u008bce«0\u001cA\u0000Ökö1È$Zà9á}EãbË,\u0018\u0017Z¨\u008a\"¸\u0098#º\u0092Ý³ôí`\u001fìÐ\u0087\u0088\u0099àÙ "
         .length();
      char var5 = '(';
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
                     b = var9;
                     g = new String[14];
                     c8y = Maps.newLinkedHashMap();
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

                  var6 = "èÝ\u001b\u001c\u0000·qñ]äy\u0094lç\u008eÐLÏ\u008a¤Bº\u009agç¡Æ¡´¾õ( Hâ\u0004\u009e]\u0086Zº²P\u0096\u0018O¦ØåÜÕÞ¹-9QiG;qW¹b\u009aú";
                  var8 = "èÝ\u001b\u001c\u0000·qñ]äy\u0094lç\u008eÐLÏ\u008a¤Bº\u009agç¡Æ¡´¾õ( Hâ\u0004\u009e]\u0086Zº²P\u0096\u0018O¦ØåÜÕÞ¹-9QiG;qW¹b\u009aú"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13216;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("dgn", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("dgn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
