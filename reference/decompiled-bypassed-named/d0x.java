@dr9$x0j(
   t2u = "hclip",
   io4 = {"<distance>"},
   hjc = "Teleport in the horizontal direction"
)
public class d0x extends HwidProvider {
   @Override
   public void xjl(String[] param1) {
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
      // 05: arraylength
      // 06: bipush 1
      // 07: iload 2
      // 08: ifne 39
      // 0b: if_icmple 24
      // 0e: goto 15
      // 11: invokestatic d0x.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual d0x.dhs ()V
      // 19: iload 2
      // 1a: ifeq e5
      // 1d: goto 24
      // 20: invokestatic d0x.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 1
      // 25: arraylength
      // 26: iload 2
      // 27: ifne 54
      // 2a: goto 31
      // 2d: invokestatic d0x.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 39
      // 35: invokestatic d0x.a (Loov;)Loov;
      // 38: athrow
      // 39: if_icmpne da
      // 3c: aload 1
      // 3d: bipush 0
      // 3e: aaload
      // 3f: iload 2
      // 40: ifne 61
      // 43: goto 4a
      // 46: invokestatic d0x.a (Loov;)Loov;
      // 49: athrow
      // 4a: invokestatic rak.fye (Ljava/lang/String;)Z
      // 4d: goto 54
      // 50: invokestatic d0x.a (Loov;)Loov;
      // 53: athrow
      // 54: ifeq cb
      // 57: aload 1
      // 58: bipush 0
      // 59: aaload
      // 5a: goto 61
      // 5d: invokestatic d0x.a (Loov;)Loov;
      // 60: athrow
      // 61: invokestatic java/lang/Float.parseFloat (Ljava/lang/String;)F
      // 64: fstore 3
      // 65: aload 0
      // 66: getfield d0x.rpq Lc05;
      // 69: getfield Minecraft.vg8 Ll86;
      // 6c: getfield EntityPlayerSP.x5k F
      // 6f: ldc 90.0
      // 71: nop
      // 72: fadd
      // 73: f2d
      // 74: invokestatic java/lang/Math.toRadians (D)D
      // 77: invokestatic java/lang/Math.cos (D)D
      // 7a: dstore 4
      // 7c: aload 0
      // 7d: getfield d0x.rpq Lc05;
      // 80: getfield Minecraft.vg8 Ll86;
      // 83: getfield EntityPlayerSP.x5k F
      // 86: ldc 90.0
      // 88: nop
      // 89: fadd
      // 8a: f2d
      // 8b: invokestatic java/lang/Math.toRadians (D)D
      // 8e: invokestatic java/lang/Math.sin (D)D
      // 91: dstore 6
      // 93: fconst_1
      // 94: fload 3
      // 95: fmul
      // 96: f2d
      // 97: dload 4
      // 99: dmul
      // 9a: fconst_0
      // 9b: fload 3
      // 9c: fmul
      // 9d: f2d
      // 9e: dload 6
      // a0: dmul
      // a1: dadd
      // a2: dstore 8
      // a4: fconst_1
      // a5: fload 3
      // a6: fmul
      // a7: f2d
      // a8: dload 6
      // aa: dmul
      // ab: fconst_0
      // ac: fload 3
      // ad: fmul
      // ae: f2d
      // af: dload 4
      // b1: dmul
      // b2: dsub
      // b3: dstore 10
      // b5: aload 0
      // b6: getfield d0x.rpq Lc05;
      // b9: getfield Minecraft.vg8 Ll86;
      // bc: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // bf: dload 8
      // c1: dconst_0
      // c2: dload 10
      // c4: invokevirtual nh4.z6k (DDD)V
      // c7: iload 2
      // c8: ifeq e5
      // cb: aload 0
      // cc: invokevirtual d0x.dhs ()V
      // cf: iload 2
      // d0: ifeq e5
      // d3: goto da
      // d6: invokestatic d0x.a (Loov;)Loov;
      // d9: athrow
      // da: aload 0
      // db: invokevirtual d0x.dhs ()V
      // de: goto e5
      // e1: invokestatic d0x.a (Loov;)Loov;
      // e4: athrow
      // e5: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
