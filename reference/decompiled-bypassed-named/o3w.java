public class o3w extends sla {
   public double dgl;
   public double z7d;
   public static String zf_;

   public o3w(String var1) {
      super(var1);
      zf_ = var1;
   }

   @Override
   public void jke() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: astore 2
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 22
      // 0d: getfield Minecraft.tij Lkh3;
      // 10: ifnull 53
      // 13: goto 1a
      // 16: invokestatic o3w.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 2
      // 1b: goto 22
      // 1e: invokestatic o3w.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield Minecraft.vg8 Ll86;
      // 25: ifnull 53
      // 28: aload 0
      // 29: aload 2
      // 2a: getfield Minecraft.tij Lkh3;
      // 2d: aload 2
      // 2e: getfield Minecraft.vg8 Ll86;
      // 31: getfield EntityPlayerSP.o2v D
      // 34: aload 2
      // 35: getfield Minecraft.vg8 Ll86;
      // 38: getfield EntityPlayerSP.vbd D
      // 3b: aload 2
      // 3c: getfield Minecraft.vg8 Ll86;
      // 3f: getfield EntityPlayerSP.x5k F
      // 42: f2d
      // 43: bipush 0
      // 44: bipush 0
      // 45: invokevirtual o3w.jiz (Lt9d;DDDZZ)V
      // 48: iload 1
      // 49: ifeq 67
      // 4c: goto 53
      // 4f: invokestatic o3w.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: aconst_null
      // 55: checkcast OpaquePredicate
      // 58: dconst_0
      // 59: dconst_0
      // 5a: dconst_0
      // 5b: bipush 1
      // 5c: bipush 0
      // 5d: invokevirtual o3w.jiz (Lt9d;DDDZZ)V
      // 60: goto 67
      // 63: invokestatic o3w.a (Loov;)Loov;
      // 66: athrow
      // 67: return
   }

   public void TokenGuard(OpaquePredicate param1, double param2, double param4, double param6, boolean param8, boolean param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 10
      // 005: aload 0
      // 006: getfield o3w.vyr Ljava/util/List;
      // 009: invokeinterface java/util/List.isEmpty ()Z 1
      // 00e: ifne 1b4
      // 011: dconst_0
      // 012: dstore 11
      // 014: aload 1
      // 015: ifnull 08f
      // 018: iload 8
      // 01a: iload 10
      // 01c: ifeq 091
      // 01f: goto 026
      // 022: invokestatic o3w.a (Loov;)Loov;
      // 025: athrow
      // 026: ifne 08f
      // 029: goto 030
      // 02c: invokestatic o3w.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 1
      // 031: invokevirtual OpaquePredicate.suq ()Lmew;
      // 034: astore 13
      // 036: aload 13
      // 038: invokevirtual mew.getX ()I
      // 03b: i2d
      // 03c: dload 2
      // 03d: dsub
      // 03e: dstore 14
      // 040: aload 13
      // 042: invokevirtual mew.getZ ()I
      // 045: i2d
      // 046: dload 4
      // 048: dsub
      // 049: dstore 16
      // 04b: dload 6
      // 04d: ldc2_w 360.0
      // 050: drem
      // 051: dstore 6
      // 053: dload 6
      // 055: ldc2_w 90.0
      // 058: dsub
      // 059: ldc2_w 3.141592653589793
      // 05c: dmul
      // 05d: ldc2_w 180.0
      // 060: ddiv
      // 061: dload 16
      // 063: dload 14
      // 065: invokestatic java/lang/Math.atan2 (DD)D
      // 068: dsub
      // 069: dneg
      // 06a: dstore 11
      // 06c: aload 1
      // 06d: getfield OpaquePredicate.vzz Lupn;
      // 070: invokevirtual upn.cws ()Z
      // 073: iload 10
      // 075: ifeq 091
      // 078: ifne 08f
      // 07b: goto 082
      // 07e: invokestatic o3w.a (Loov;)Loov;
      // 081: athrow
      // 082: invokestatic java/lang/Math.random ()D
      // 085: ldc2_w 3.141592653589793
      // 088: dmul
      // 089: ldc2_w 2.0
      // 08c: dmul
      // 08d: dstore 11
      // 08f: iload 9
      // 091: ifeq 0a6
      // 094: aload 0
      // 095: dload 11
      // 097: putfield o3w.dgl D
      // 09a: iload 10
      // 09c: ifne 126
      // 09f: goto 0a6
      // 0a2: invokestatic o3w.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: dload 11
      // 0a8: aload 0
      // 0a9: getfield o3w.dgl D
      // 0ac: dsub
      // 0ad: dstore 13
      // 0af: dload 13
      // 0b1: ldc2_w -3.141592653589793
      // 0b4: dcmpg
      // 0b5: ifge 0d1
      // 0b8: dload 13
      // 0ba: ldc2_w 6.283185307179586
      // 0bd: dadd
      // 0be: dstore 13
      // 0c0: iload 10
      // 0c2: ifeq 119
      // 0c5: iload 10
      // 0c7: ifne 0af
      // 0ca: goto 0d1
      // 0cd: invokestatic o3w.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: dload 13
      // 0d3: ldc2_w 3.141592653589793
      // 0d6: dcmpl
      // 0d7: iflt 0f3
      // 0da: dload 13
      // 0dc: ldc2_w 6.283185307179586
      // 0df: dsub
      // 0e0: dstore 13
      // 0e2: iload 10
      // 0e4: ifeq 119
      // 0e7: iload 10
      // 0e9: ifne 0d1
      // 0ec: goto 0f3
      // 0ef: invokestatic o3w.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: dload 13
      // 0f5: ldc2_w -1.0
      // 0f8: dconst_1
      // 0f9: invokestatic fe6.lft (DDD)D
      // 0fc: dstore 13
      // 0fe: aload 0
      // 0ff: dup
      // 100: getfield o3w.z7d D
      // 103: dload 13
      // 105: ldc2_w 0.1
      // 108: dmul
      // 109: dadd
      // 10a: putfield o3w.z7d D
      // 10d: aload 0
      // 10e: dup
      // 10f: getfield o3w.z7d D
      // 112: ldc2_w 0.8
      // 115: dmul
      // 116: putfield o3w.z7d D
      // 119: aload 0
      // 11a: dup
      // 11b: getfield o3w.dgl D
      // 11e: aload 0
      // 11f: getfield o3w.z7d D
      // 122: dadd
      // 123: putfield o3w.dgl D
      // 126: aload 0
      // 127: getfield o3w.dgl D
      // 12a: ldc2_w 6.283185307179586
      // 12d: ddiv
      // 12e: dconst_1
      // 12f: dadd
      // 130: aload 0
      // 131: getfield o3w.vyr Ljava/util/List;
      // 134: invokeinterface java/util/List.size ()I 1
      // 139: i2d
      // 13a: dmul
      // 13b: d2i
      // 13c: aload 0
      // 13d: getfield o3w.vyr Ljava/util/List;
      // 140: invokeinterface java/util/List.size ()I 1
      // 145: irem
      // 146: istore 13
      // 148: iload 13
      // 14a: ifge 176
      // 14d: iload 13
      // 14f: aload 0
      // 150: getfield o3w.vyr Ljava/util/List;
      // 153: invokeinterface java/util/List.size ()I 1
      // 158: iadd
      // 159: aload 0
      // 15a: getfield o3w.vyr Ljava/util/List;
      // 15d: invokeinterface java/util/List.size ()I 1
      // 162: irem
      // 163: istore 13
      // 165: iload 10
      // 167: ifeq 1b4
      // 16a: iload 10
      // 16c: ifne 148
      // 16f: goto 176
      // 172: invokestatic o3w.a (Loov;)Loov;
      // 175: athrow
      // 176: iload 13
      // 178: aload 0
      // 179: getfield o3w.v8x I
      // 17c: if_icmpeq 1b4
      // 17f: aload 0
      // 180: iload 13
      // 182: putfield o3w.v8x I
      // 185: aload 0
      // 186: getfield o3w.vyr Ljava/util/List;
      // 189: aload 0
      // 18a: getfield o3w.v8x I
      // 18d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 192: checkcast [[I
      // 195: checkcast [[I
      // 198: aload 0
      // 199: getfield o3w.gbb I
      // 19c: aload 0
      // 19d: getfield o3w.oy_ I
      // 1a0: aload 0
      // 1a1: getfield o3w.q5c I
      // 1a4: aload 0
      // 1a5: getfield o3w.kjo I
      // 1a8: bipush 0
      // 1a9: bipush 0
      // 1aa: invokestatic p9t._vm ([[IIIIIZZ)V
      // 1ad: goto 1b4
      // 1b0: invokestatic o3w.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
