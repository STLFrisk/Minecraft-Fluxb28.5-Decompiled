import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class onUpdate extends mf6 {
   private static final long b;
   private static final String j;

   public onUpdate(ha9 var1) {
      super(var1.fv9);
      this.w2p = true;
   }

   @Override
   public void updateScreen() {
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
      // 05: iload 1
      // 06: ifeq 39
      // 09: getfield onUpdate.f41 Lc05;
      // 0c: getfield Minecraft.l7q Lhh6;
      // 0f: invokevirtual hh6.l2q ()Z
      // 12: ifeq 38
      // 15: goto 1c
      // 18: invokestatic onUpdate.c (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield onUpdate.f41 Lc05;
      // 20: new qpp
      // 23: dup
      // 24: aload 0
      // 25: getfield onUpdate.f41 Lc05;
      // 28: getfield Minecraft.vg8 Ll86;
      // 2b: invokespecial qpp.<init> (Lha9;)V
      // 2e: invokevirtual Minecraft.z2i (Lgbe;)V
      // 31: goto 38
      // 34: invokestatic onUpdate.c (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: invokevirtual onUpdate.tut ()V
      // 3c: return
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield onUpdate.khf Ljava/util/List;
      // 08: invokeinterface java/util/List.clear ()V 1
      // 0d: aload 0
      // 0e: iload 1
      // 0f: ifne 4d
      // 12: getfield onUpdate.f41 Lc05;
      // 15: getfield Minecraft.l7q Lhh6;
      // 18: invokevirtual hh6.l2q ()Z
      // 1b: ifeq 45
      // 1e: goto 25
      // 21: invokestatic onUpdate.c (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield onUpdate.f41 Lc05;
      // 29: new qpp
      // 2c: dup
      // 2d: aload 0
      // 2e: getfield onUpdate.f41 Lc05;
      // 31: getfield Minecraft.vg8 Ll86;
      // 34: invokespecial qpp.<init> (Lha9;)V
      // 37: invokevirtual Minecraft.z2i (Lgbe;)V
      // 3a: iload 1
      // 3b: ifeq 50
      // 3e: goto 45
      // 41: invokestatic onUpdate.c (Loov;)Loov;
      // 44: athrow
      // 45: aload 0
      // 46: goto 4d
      // 49: invokestatic onUpdate.c (Loov;)Loov;
      // 4c: athrow
      // 4d: invokespecial mf6.initGui ()V
      // 50: return
   }

   @Override
   public void qw3(int var1, int var2) {
      long var3 = b ^ 337607368235L;
      jsr.yk7.kkl(fc1.gx1(j, new Object[0]), 86.0F, 14.0F, z7e.kks.k0y);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
      this.hiv = (float)var1;
      this.j6n = (float)var2;
   }

   @Override
   public void cft(float var1, int var2, int var3) {
      hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
      this.f41.l22().anl(w8u);
      int var4 = this.tjm;
      int var5 = this.___;
      this.mt4(var4, var5, 0, 0, this.poy, this.g6l);
      fe8(var4 + 51, var5 + 75, 30, (float)(var4 + 51) - this.hiv, (float)(var5 + 75 - 50) - this.j6n, this.f41.vg8);
   }

   public static void fe8(int var0, int var1, int var2, float var3, float var4, Entity var5) {
      hzu.avm();
      hzu.dp2();
      hzu.a4k((float)var0, (float)var1, 50.0F);
      hzu.syc((float)(-var2), (float)var2, (float)var2);
      hzu.a2h(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = var5.ksw;
      float var7 = var5.x5k;
      float var8 = var5.y2i;
      float var9 = var5.h82;
      float var10 = var5.q6c;
      hzu.a2h(135.0F, 0.0F, 1.0F, 0.0F);
      qpm.ne_();
      hzu.a2h(-135.0F, 0.0F, 1.0F, 0.0F);
      hzu.a2h(-((float)Math.atan((double)(var4 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      var5.ksw = (float)Math.atan((double)(var3 / 40.0F)) * 20.0F;
      var5.x5k = (float)Math.atan((double)(var3 / 40.0F)) * 40.0F;
      var5.y2i = -((float)Math.atan((double)(var4 / 40.0F))) * 20.0F;
      var5.q6c = var5.x5k;
      var5.h82 = var5.x5k;
      hzu.a4k(0.0F, 0.0F, 0.0F);
      hr_ var11 = Minecraft.vz1().ibs();
      var11.y_o(180.0F);
      var11.bbs(false);
      var11.ajg(var5, 0.0, 0.0, 0.0, 0.0F, 1.0F);
      var11.bbs(true);
      var5.ksw = var6;
      var5.x5k = var7;
      var5.y2i = var8;
      var5.h82 = var9;
      var5.q6c = var10;
      hzu.x3w();
      qpm.cng();
      hzu.eiq();
      hzu.qon(gis.exn);
      hzu.m_1();
      hzu.qon(gis.z1w);
   }

   @Override
   public void actionPerformed(gt4 param1) {
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
      // 05: getfield gt4._me I
      // 08: iload 2
      // 09: ifne 3a
      // 0c: ifne 36
      // 0f: goto 16
      // 12: invokestatic onUpdate.c (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield onUpdate.f41 Lc05;
      // 1a: new np1
      // 1d: dup
      // 1e: aload 0
      // 1f: aload 0
      // 20: getfield onUpdate.f41 Lc05;
      // 23: getfield Minecraft.vg8 Ll86;
      // 26: invokevirtual EntityPlayerSP.hgi ()Lik0;
      // 29: invokespecial np1.<init> (Lgbe;Lik0;)V
      // 2c: invokevirtual Minecraft.z2i (Lgbe;)V
      // 2f: goto 36
      // 32: invokestatic onUpdate.c (Loov;)Loov;
      // 35: athrow
      // 36: aload 1
      // 37: getfield gt4._me I
      // 3a: bipush 1
      // 3b: if_icmpne 5e
      // 3e: aload 0
      // 3f: getfield onUpdate.f41 Lc05;
      // 42: new f3x
      // 45: dup
      // 46: aload 0
      // 47: aload 0
      // 48: getfield onUpdate.f41 Lc05;
      // 4b: getfield Minecraft.vg8 Ll86;
      // 4e: invokevirtual EntityPlayerSP.hgi ()Lik0;
      // 51: invokespecial f3x.<init> (Lgbe;Lik0;)V
      // 54: invokevirtual Minecraft.z2i (Lgbe;)V
      // 57: goto 5e
      // 5a: invokestatic onUpdate.c (Loov;)Loov;
      // 5d: athrow
      // 5e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1779688977254649360L, -8861487420227337305L, MethodHandles.lookup().lookupClass()).a(103506993629216L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 9077504474742L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("G\u0018\u009d\u0017@Rz\u0081Vòv\u009a®h@f6£Õ[À¾&\u0091".getBytes("ISO-8859-1"));
      String var6 = e(var4).intern();
      byte var10001 = -1;
      j = var6;
   }

   private static oov c(oov var0) {
      return var0;
   }

   private static String e(byte[] var0) {
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
