import net.minecraft.network.play.server.S28PacketEffect;

public class xa6 implements u60 {
   public xa6(vr1 var1, dug var2) {
      this.rgl = var1;
      this.s2m = var2;
   }

   @Override
   public void t0e(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int[] var15) {
   }

   @Override
   public void m4f(EntityLivingBase var1) {
      this.s2m.fp4().lyi(var1);
   }

   @Override
   public void fbz(EntityLivingBase var1) {
      this.s2m.fp4().oow(var1);
      this.s2m.fgp().ypb(var1);
   }

   @Override
   public void z24(String param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 10
      // 05: aload 0
      // 06: getfield xa6.rgl Lvr1;
      // 09: invokevirtual vr1.wh3 ()Lwlx;
      // 0c: dload 2
      // 0d: dload 4
      // 0f: dload 6
      // 11: fload 8
      // 13: fconst_1
      // 14: iload 10
      // 16: ifeq 30
      // 19: fcmpl
      // 1a: ifle 35
      // 1d: goto 24
      // 20: invokestatic xa6.a (Loov;)Loov;
      // 23: athrow
      // 24: ldc 16.0
      // 26: nop
      // 27: fload 8
      // 29: goto 30
      // 2c: invokestatic xa6.a (Loov;)Loov;
      // 2f: athrow
      // 30: fmul
      // 31: f2d
      // 32: goto 38
      // 35: ldc2_w 16.0
      // 38: aload 0
      // 39: getfield xa6.s2m Ldug;
      // 3c: getfield dug.vzz Lupn;
      // 3f: invokevirtual upn.gs_ ()I
      // 42: new net/minecraft/network/play/server/S29PacketSoundEffect
      // 45: dup
      // 46: aload 1
      // 47: dload 2
      // 48: dload 4
      // 4a: dload 6
      // 4c: fload 8
      // 4e: fload 9
      // 50: invokespecial net/minecraft/network/play/server/S29PacketSoundEffect.<init> (Ljava/lang/String;DDDFF)V
      // 53: invokevirtual wlx.dyz (DDDDILmz2;)V
      // 56: return
   }

   @Override
   public void jdq(ha9 param1, String param2, double param3, double param5, double param7, float param9, float param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 11
      // 05: aload 0
      // 06: getfield xa6.rgl Lvr1;
      // 09: invokevirtual vr1.wh3 ()Lwlx;
      // 0c: aload 1
      // 0d: dload 3
      // 0e: dload 5
      // 10: dload 7
      // 12: fload 9
      // 14: fconst_1
      // 15: iload 11
      // 17: ifeq 31
      // 1a: fcmpl
      // 1b: ifle 36
      // 1e: goto 25
      // 21: invokestatic xa6.a (Loov;)Loov;
      // 24: athrow
      // 25: ldc 16.0
      // 27: nop
      // 28: fload 9
      // 2a: goto 31
      // 2d: invokestatic xa6.a (Loov;)Loov;
      // 30: athrow
      // 31: fmul
      // 32: f2d
      // 33: goto 39
      // 36: ldc2_w 16.0
      // 39: aload 0
      // 3a: getfield xa6.s2m Ldug;
      // 3d: getfield dug.vzz Lupn;
      // 40: invokevirtual upn.gs_ ()I
      // 43: new net/minecraft/network/play/server/S29PacketSoundEffect
      // 46: dup
      // 47: aload 2
      // 48: dload 3
      // 49: dload 5
      // 4b: dload 7
      // 4d: fload 9
      // 4f: fload 10
      // 51: invokespecial net/minecraft/network/play/server/S29PacketSoundEffect.<init> (Ljava/lang/String;DDDFF)V
      // 54: invokevirtual wlx.zih (Lha9;DDDDILmz2;)V
      // 57: return
   }

   @Override
   public void cy9(int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   @Override
   public void vsk(mew var1) {
      this.s2m.gez().ana(var1);
   }

   @Override
   public void xyy(mew var1) {
   }

   @Override
   public void bs4(String var1, mew var2) {
   }

   @Override
   public void ifl(ha9 var1, int var2, mew var3, int var4) {
      this.rgl
         .wh3()
         .zih(var1, (double)var3.getX(), (double)var3.getY(), (double)var3.getZ(), 64.0, this.s2m.vzz.gs_(), new S28PacketEffect(var2, var3, var4, false));
   }

   @Override
   public void a60(int var1, mew var2, int var3) {
      this.rgl.wh3().v3l(new S28PacketEffect(var1, var2, var3, true));
   }

   @Override
   public void tag(int param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield xa6.rgl Lvr1;
      // 09: invokevirtual vr1.wh3 ()Lwlx;
      // 0c: invokevirtual wlx.tjx ()Ljava/util/List;
      // 0f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 14: astore 5
      // 16: aload 5
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq d5
      // 20: aload 5
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: checkcast z96
      // 2a: astore 6
      // 2c: aload 6
      // 2e: iload 4
      // 30: ifeq 3f
      // 33: ifnull d0
      // 36: goto 3d
      // 39: invokestatic xa6.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 6
      // 3f: iload 4
      // 41: ifeq 5e
      // 44: getfield z96.oay Lt9d;
      // 47: aload 0
      // 48: getfield xa6.s2m Ldug;
      // 4b: if_acmpne d0
      // 4e: goto 55
      // 51: invokestatic xa6.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 6
      // 57: goto 5e
      // 5a: invokestatic xa6.a (Loov;)Loov;
      // 5d: athrow
      // 5e: invokevirtual z96.jwu ()I
      // 61: iload 4
      // 63: ifeq 7c
      // 66: iload 1
      // 67: if_icmpeq d0
      // 6a: goto 71
      // 6d: invokestatic xa6.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 2
      // 72: invokevirtual mew.getX ()I
      // 75: goto 7c
      // 78: invokestatic xa6.a (Loov;)Loov;
      // 7b: athrow
      // 7c: i2d
      // 7d: aload 6
      // 7f: getfield z96.o2v D
      // 82: dsub
      // 83: dstore 7
      // 85: aload 2
      // 86: invokevirtual mew.getY ()I
      // 89: i2d
      // 8a: aload 6
      // 8c: getfield z96.kfp D
      // 8f: dsub
      // 90: dstore 9
      // 92: aload 2
      // 93: invokevirtual mew.getZ ()I
      // 96: i2d
      // 97: aload 6
      // 99: getfield z96.vbd D
      // 9c: dsub
      // 9d: dstore 11
      // 9f: dload 7
      // a1: dload 7
      // a3: dmul
      // a4: dload 9
      // a6: dload 9
      // a8: dmul
      // a9: dadd
      // aa: dload 11
      // ac: dload 11
      // ae: dmul
      // af: dadd
      // b0: ldc2_w 1024.0
      // b3: dcmpg
      // b4: ifge d0
      // b7: aload 6
      // b9: getfield z96.rhh Lmlk;
      // bc: new net/minecraft/network/play/server/S25PacketBlockBreakAnim
      // bf: dup
      // c0: iload 1
      // c1: aload 2
      // c2: iload 3
      // c3: invokespecial net/minecraft/network/play/server/S25PacketBlockBreakAnim.<init> (ILmew;I)V
      // c6: invokevirtual mlk.vnf (Lmz2;)V
      // c9: goto d0
      // cc: invokestatic xa6.a (Loov;)Loov;
      // cf: athrow
      // d0: iload 4
      // d2: ifne 16
      // d5: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
