import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kxi$qhn extends lhq {
   private final kxi z0d;
   private boolean y2s;
   private boolean bho = false;
   private static final long a;
   private static final String b;

   public kxi$qhn(kxi var1) {
      super(var1, 0.7F, 16);
      this.z0d = var1;
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic kxi$qhn.a J
      // 03: ldc2_w 54059184374752
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield kxi$qhn.i1n I
      // 10: iload 3
      // 11: ifeq 5e
      // 14: ifgt 5a
      // 17: goto 1e
      // 1a: invokestatic kxi$qhn.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: iload 3
      // 20: ifeq 50
      // 23: goto 2a
      // 26: invokestatic kxi$qhn.a (Loov;)Loov;
      // 29: athrow
      // 2a: getfield kxi$qhn.z0d Lkxi;
      // 2d: getfield kxi.oay Lt9d;
      // 30: invokevirtual OpaquePredicate.eir ()Lef9;
      // 33: getstatic kxi$qhn.b Ljava/lang/String;
      // 36: nop
      // 37: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 3a: ifne 4a
      // 3d: goto 44
      // 40: invokestatic kxi$qhn.a (Loov;)Loov;
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
      // 46: invokestatic kxi$qhn.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: bipush 0
      // 4c: putfield kxi$qhn.bho Z
      // 4f: aload 0
      // 50: aload 0
      // 51: getfield kxi$qhn.z0d Lkxi;
      // 54: invokestatic kxi.l_2 (Lkxi;)Z
      // 57: putfield kxi$qhn.y2s Z
      // 5a: aload 0
      // 5b: invokespecial lhq.vle ()Z
      // 5e: ireturn
   }

   @Override
   public boolean wh3() {
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
      // 05: getfield kxi$qhn.bho Z
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic kxi$qhn.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial lhq.wh3 ()Z
      // 1a: goto 21
      // 1d: invokestatic kxi$qhn.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic kxi$qhn.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   @Override
   public void mnp() {
      super.mnp();
   }

   @Override
   public void zly() {
      super.zly();
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial lhq.iad ()V
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 0
      // 08: getfield kxi$qhn.z0d Lkxi;
      // 0b: invokevirtual kxi.ph8 ()Lknw;
      // 0e: aload 0
      // 0f: getfield kxi$qhn.yiq Lmew;
      // 12: invokevirtual mew.getX ()I
      // 15: i2d
      // 16: ldc2_w 0.5
      // 19: dadd
      // 1a: aload 0
      // 1b: getfield kxi$qhn.yiq Lmew;
      // 1e: invokevirtual mew.getY ()I
      // 21: bipush 1
      // 22: iadd
      // 23: i2d
      // 24: aload 0
      // 25: getfield kxi$qhn.yiq Lmew;
      // 28: invokevirtual mew.getZ ()I
      // 2b: i2d
      // 2c: ldc2_w 0.5
      // 2f: dadd
      // 30: ldc 10.0
      // 32: nop
      // 33: aload 0
      // 34: getfield kxi$qhn.z0d Lkxi;
      // 37: invokevirtual kxi.d1r ()I
      // 3a: i2f
      // 3b: invokevirtual knw.c2i (DDDFF)V
      // 3e: istore 1
      // 3f: aload 0
      // 40: iload 1
      // 41: ifne 59
      // 44: invokevirtual kxi$qhn.p38 ()Z
      // 47: ifeq f8
      // 4a: goto 51
      // 4d: invokestatic kxi$qhn.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: goto 59
      // 55: invokestatic kxi$qhn.a (Loov;)Loov;
      // 58: athrow
      // 59: getfield kxi$qhn.z0d Lkxi;
      // 5c: getfield kxi.oay Lt9d;
      // 5f: astore 2
      // 60: aload 0
      // 61: getfield kxi$qhn.yiq Lmew;
      // 64: invokevirtual mew.nuv ()Lmew;
      // 67: astore 3
      // 68: aload 2
      // 69: aload 3
      // 6a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 6d: astore 4
      // 6f: aload 4
      // 71: invokeinterface zfz.r_y ()Le0x; 1
      // 76: astore 5
      // 78: aload 0
      // 79: iload 1
      // 7a: ifne f3
      // 7d: getfield kxi$qhn.bho Z
      // 80: ifeq ed
      // 83: goto 8a
      // 86: invokestatic kxi$qhn.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 5
      // 8c: instanceof lq7
      // 8f: iload 1
      // 90: ifne bb
      // 93: goto 9a
      // 96: invokestatic kxi$qhn.a (Loov;)Loov;
      // 99: athrow
      // 9a: ifeq ed
      // 9d: goto a4
      // a0: invokestatic kxi$qhn.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 4
      // a6: getstatic lq7.ul6 L_ku;
      // a9: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // ae: checkcast java/lang/Integer
      // b1: invokevirtual java/lang/Integer.intValue ()I
      // b4: goto bb
      // b7: invokestatic kxi$qhn.a (Loov;)Loov;
      // ba: athrow
      // bb: iload 1
      // bc: ifne e5
      // bf: bipush 7
      // c1: if_icmpne ed
      // c4: goto cb
      // c7: invokestatic kxi$qhn.a (Loov;)Loov;
      // ca: athrow
      // cb: aload 2
      // cc: aload 3
      // cd: getstatic ox_.ibw Le0x;
      // d0: invokevirtual e0x.l4i ()Lzfz;
      // d3: bipush 2
      // d4: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // d7: pop
      // d8: aload 2
      // d9: aload 3
      // da: bipush 1
      // db: invokevirtual OpaquePredicate.yir (Lmew;Z)Z
      // de: goto e5
      // e1: invokestatic kxi$qhn.a (Loov;)Loov;
      // e4: athrow
      // e5: pop
      // e6: aload 0
      // e7: getfield kxi$qhn.z0d Lkxi;
      // ea: invokevirtual kxi.uj9 ()V
      // ed: aload 0
      // ee: bipush 0
      // ef: putfield kxi$qhn.bho Z
      // f2: aload 0
      // f3: bipush 10
      // f5: putfield kxi$qhn.i1n I
      // f8: return
   }

   @Override
   public boolean c0f(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 09: invokeinterface zfz.r_y ()Le0x; 1
      // 0e: astore 4
      // 10: iload 3
      // 11: ifeq 28
      // 14: aload 4
      // 16: getstatic ox_._5i Le0x;
      // 19: if_acmpne af
      // 1c: goto 23
      // 1f: invokestatic kxi$qhn.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 2
      // 24: invokevirtual mew.nuv ()Lmew;
      // 27: astore 2
      // 28: aload 1
      // 29: aload 2
      // 2a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2d: astore 5
      // 2f: aload 5
      // 31: invokeinterface zfz.r_y ()Le0x; 1
      // 36: astore 4
      // 38: aload 4
      // 3a: instanceof lq7
      // 3d: iload 3
      // 3e: ifeq b0
      // 41: ifeq af
      // 44: goto 4b
      // 47: invokestatic kxi$qhn.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 5
      // 4d: getstatic lq7.ul6 L_ku;
      // 50: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 55: checkcast java/lang/Integer
      // 58: invokevirtual java/lang/Integer.intValue ()I
      // 5b: iload 3
      // 5c: ifeq b0
      // 5f: goto 66
      // 62: invokestatic kxi$qhn.a (Loov;)Loov;
      // 65: athrow
      // 66: bipush 7
      // 68: if_icmpne af
      // 6b: goto 72
      // 6e: invokestatic kxi$qhn.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: getfield kxi$qhn.y2s Z
      // 76: iload 3
      // 77: ifeq b0
      // 7a: goto 81
      // 7d: invokestatic kxi$qhn.a (Loov;)Loov;
      // 80: athrow
      // 81: ifeq af
      // 84: goto 8b
      // 87: invokestatic kxi$qhn.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 0
      // 8c: getfield kxi$qhn.bho Z
      // 8f: iload 3
      // 90: ifeq b0
      // 93: goto 9a
      // 96: invokestatic kxi$qhn.a (Loov;)Loov;
      // 99: athrow
      // 9a: ifne af
      // 9d: goto a4
      // a0: invokestatic kxi$qhn.a (Loov;)Loov;
      // a3: athrow
      // a4: aload 0
      // a5: bipush 1
      // a6: putfield kxi$qhn.bho Z
      // a9: bipush 1
      // aa: ireturn
      // ab: invokestatic kxi$qhn.a (Loov;)Loov;
      // ae: athrow
      // af: bipush 0
      // b0: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4199828522936455748L, 43300720672520869L, MethodHandles.lookup().lookupClass()).a(74436687784689L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 61217183968558L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ú*,&3µ\t\u009d¬\u0001*Ø©ÅÀå".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
