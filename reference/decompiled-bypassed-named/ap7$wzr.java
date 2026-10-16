import java.util.List;

public class ap7$wzr implements sjk {
   private final q2m qxr;
   private final gdz bnw;
   private final List ilz;
   public final ap7 dzc;

   public ap7$wzr(ap7 param1, q2m param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: putfield ap7$wzr.dzc Lap7;
      // 05: invokestatic OpaquePredicate.b ()I
      // 08: aload 0
      // 09: invokespecial java/lang/Object.<init> ()V
      // 0c: aload 0
      // 0d: aload 2
      // 0e: putfield ap7$wzr.qxr Lq2m;
      // 11: istore 3
      // 12: aload 0
      // 13: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 16: putfield ap7$wzr.ilz Ljava/util/List;
      // 19: aload 2
      // 1a: invokevirtual q2m.vsw ()Ljava/util/Collection;
      // 1d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 22: astore 4
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b: ifeq 6e
      // 2e: aload 4
      // 30: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35: checkcast java/lang/String
      // 38: astore 5
      // 3a: invokestatic Minecraft.vz1 ()Lc05;
      // 3d: invokevirtual Minecraft.c02 ()Lp_k;
      // 40: aload 5
      // 42: invokevirtual p_k.cj2 (Ljava/lang/String;)Lhv2;
      // 45: astore 6
      // 47: aload 6
      // 49: iload 3
      // 4a: ifeq ab
      // 4d: ifnull 6a
      // 50: goto 57
      // 53: invokestatic ap7$wzr.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: getfield ap7$wzr.ilz Ljava/util/List;
      // 5b: aload 6
      // 5d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 62: pop
      // 63: goto 6a
      // 66: invokestatic ap7$wzr.a (Loov;)Loov;
      // 69: athrow
      // 6a: iload 3
      // 6b: ifne 24
      // 6e: aload 0
      // 6f: iload 3
      // 70: ifeq ca
      // 73: getfield ap7$wzr.ilz Ljava/util/List;
      // 76: invokeinterface java/util/List.isEmpty ()Z 1
      // 7b: ifne c9
      // 7e: goto 85
      // 81: invokestatic ap7$wzr.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: getfield ap7$wzr.ilz Ljava/util/List;
      // 89: new java/util/Random
      // 8c: dup
      // 8d: invokespecial java/util/Random.<init> ()V
      // 90: aload 0
      // 91: getfield ap7$wzr.ilz Ljava/util/List;
      // 94: invokeinterface java/util/List.size ()I 1
      // 99: invokevirtual java/util/Random.nextInt (I)I
      // 9c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // a1: checkcast hv2
      // a4: goto ab
      // a7: invokestatic ap7$wzr.a (Loov;)Loov;
      // aa: athrow
      // ab: invokevirtual hv2.pbs ()Lcom/mojang/authlib/GameProfile;
      // ae: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // b1: astore 4
      // b3: aload 0
      // b4: aload 4
      // b6: invokestatic x0l.to8 (Ljava/lang/String;)Lgdz;
      // b9: putfield ap7$wzr.bnw Lgdz;
      // bc: aload 0
      // bd: getfield ap7$wzr.bnw Lgdz;
      // c0: aload 4
      // c2: invokestatic x0l.m1h (Lgdz;Ljava/lang/String;)Lbhs;
      // c5: pop
      // c6: goto d0
      // c9: aload 0
      // ca: invokestatic wip.s_2 ()Lgdz;
      // cd: putfield ap7$wzr.bnw Lgdz;
      // d0: return
   }

   @Override
   public void z9x(al9 var1) {
      var1.rg3(new gjy(this.ilz));
   }

   @Override
   public ekw s34() {
      return new tao(this.qxr.m6i());
   }

   @Override
   public void b6x(float param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush -1
      // 01: istore 4
      // 03: invokestatic OpaquePredicate.c ()I
      // 06: aload 0
      // 07: getfield ap7$wzr.qxr Lq2m;
      // 0a: invokevirtual q2m.wyj ()Ljava/lang/String;
      // 0d: invokestatic owt.pkg (Ljava/lang/String;)Ljava/lang/String;
      // 10: astore 5
      // 12: istore 3
      // 13: aload 5
      // 15: invokevirtual java/lang/String.length ()I
      // 18: iload 3
      // 19: ifne 3a
      // 1c: bipush 2
      // 1d: if_icmplt 38
      // 20: goto 27
      // 23: invokestatic ap7$wzr.a (Loov;)Loov;
      // 26: athrow
      // 27: invokestatic Minecraft.vz1 ()Lc05;
      // 2a: getfield Minecraft.tx1 Lowt;
      // 2d: aload 5
      // 2f: bipush 1
      // 30: invokevirtual java/lang/String.charAt (I)C
      // 33: invokevirtual owt.squ (C)I
      // 36: istore 4
      // 38: iload 4
      // 3a: iload 3
      // 3b: ifne 58
      // 3e: iflt 9b
      // 41: goto 48
      // 44: invokestatic ap7$wzr.a (Loov;)Loov;
      // 47: athrow
      // 48: iload 4
      // 4a: bipush 16
      // 4c: ishr
      // 4d: sipush 255
      // 50: iand
      // 51: goto 58
      // 54: invokestatic ap7$wzr.a (Loov;)Loov;
      // 57: athrow
      // 58: i2f
      // 59: ldc 255.0
      // 5b: nop
      // 5c: fdiv
      // 5d: fstore 6
      // 5f: iload 4
      // 61: bipush 8
      // 63: ishr
      // 64: sipush 255
      // 67: iand
      // 68: i2f
      // 69: ldc 255.0
      // 6b: nop
      // 6c: fdiv
      // 6d: fstore 7
      // 6f: iload 4
      // 71: sipush 255
      // 74: iand
      // 75: i2f
      // 76: ldc 255.0
      // 78: nop
      // 79: fdiv
      // 7a: fstore 8
      // 7c: fconst_1
      // 7d: fconst_1
      // 7e: ldc 15.0
      // 80: nop
      // 81: ldc 15.0
      // 83: nop
      // 84: fload 6
      // 86: fload 1
      // 87: fmul
      // 88: fload 7
      // 8a: fload 1
      // 8b: fmul
      // 8c: fload 8
      // 8e: fload 1
      // 8f: fmul
      // 90: invokestatic fe6.__u (FFF)I
      // 93: iload 2
      // 94: bipush 24
      // 96: ishl
      // 97: ior
      // 98: invokestatic b0t.df9 (FFFFI)V
      // 9b: invokestatic Minecraft.vz1 ()Lc05;
      // 9e: invokevirtual Minecraft.l22 ()Llc5;
      // a1: aload 0
      // a2: getfield ap7$wzr.bnw Lgdz;
      // a5: invokevirtual lc5.anl (Lgdz;)V
      // a8: fload 1
      // a9: fload 1
      // aa: fload 1
      // ab: iload 2
      // ac: i2f
      // ad: ldc 255.0
      // af: nop
      // b0: fdiv
      // b1: invokestatic hzu.wn0 (FFFF)V
      // b4: fconst_2
      // b5: fconst_2
      // b6: ldc 8.0
      // b8: nop
      // b9: ldc 8.0
      // bb: nop
      // bc: bipush 8
      // be: bipush 8
      // c0: bipush 12
      // c2: bipush 12
      // c4: ldc 64.0
      // c6: nop
      // c7: ldc 64.0
      // c9: nop
      // ca: invokestatic b0t.oc3 (FFFFIIIIFF)V
      // cd: fconst_2
      // ce: fconst_2
      // cf: ldc 40.0
      // d1: nop
      // d2: ldc 8.0
      // d4: nop
      // d5: bipush 8
      // d7: bipush 8
      // d9: bipush 12
      // db: bipush 12
      // dd: ldc 64.0
      // df: nop
      // e0: ldc 64.0
      // e2: nop
      // e3: invokestatic b0t.oc3 (FFFFIIIIFF)V
      // e6: return
   }

   @Override
   public boolean v4p() {
      int var1 = OpaquePredicate.c();

      try {
         boolean var10000 = this.ilz.isEmpty();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
