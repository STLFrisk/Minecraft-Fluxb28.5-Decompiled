import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a_t$vbq extends cjm {
   private a_t wue;
   private static final long a;
   private static final String b;

   public a_t$vbq(a_t var1) {
      this.wue = var1;
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
      // 00: getstatic a_t$vbq.a J
      // 03: ldc2_w 69357662905459
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield a_t$vbq.wue La_t;
      // 10: iload 3
      // 11: ifeq 37
      // 14: getfield a_t.oay Lt9d;
      // 17: invokevirtual t9d.eir ()Lef9;
      // 1a: getstatic a_t$vbq.b Ljava/lang/String;
      // 1d: nop
      // 1e: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 21: ifne 33
      // 24: goto 2b
      // 27: invokestatic a_t$vbq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: goto 7b
      // 2f: invokestatic a_t$vbq.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield a_t$vbq.wue La_t;
      // 37: iload 3
      // 38: ifeq 5f
      // 3b: invokevirtual a_t.ejt ()Lzfz;
      // 3e: invokeinterface zfz.r_y ()Le0x; 1
      // 43: invokevirtual e0x.p1r ()Lp3y;
      // 46: getstatic p3y.cei Lp3y;
      // 49: if_acmpne 5b
      // 4c: goto 53
      // 4f: invokestatic a_t$vbq.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 0
      // 54: goto 7b
      // 57: invokestatic a_t$vbq.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield a_t$vbq.wue La_t;
      // 5f: invokevirtual a_t.mbr ()Ljava/util/Random;
      // 62: sipush 2000
      // 65: invokevirtual java/util/Random.nextInt (I)I
      // 68: iload 3
      // 69: ifeq 77
      // 6c: ifne 7a
      // 6f: goto 76
      // 72: invokestatic a_t$vbq.a (Loov;)Loov;
      // 75: athrow
      // 76: bipush 1
      // 77: goto 7b
      // 7a: bipush 0
      // 7b: ireturn
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
      // 01: getfield a_t$vbq.wue La_t;
      // 04: invokevirtual a_t.mbr ()Ljava/util/Random;
      // 07: astore 2
      // 08: invokestatic t9d.c ()I
      // 0b: aload 0
      // 0c: getfield a_t$vbq.wue La_t;
      // 0f: getfield a_t.oay Lt9d;
      // 12: astore 3
      // 13: aload 0
      // 14: getfield a_t$vbq.wue La_t;
      // 17: getfield a_t.o2v D
      // 1a: dconst_1
      // 1b: dsub
      // 1c: aload 2
      // 1d: invokevirtual java/util/Random.nextDouble ()D
      // 20: ldc2_w 2.0
      // 23: dmul
      // 24: dadd
      // 25: invokestatic fe6.jqf (D)I
      // 28: istore 4
      // 2a: aload 0
      // 2b: getfield a_t$vbq.wue La_t;
      // 2e: getfield a_t.kfp D
      // 31: aload 2
      // 32: invokevirtual java/util/Random.nextDouble ()D
      // 35: ldc2_w 2.0
      // 38: dmul
      // 39: dadd
      // 3a: invokestatic fe6.jqf (D)I
      // 3d: istore 5
      // 3f: istore 1
      // 40: aload 0
      // 41: getfield a_t$vbq.wue La_t;
      // 44: getfield a_t.vbd D
      // 47: dconst_1
      // 48: dsub
      // 49: aload 2
      // 4a: invokevirtual java/util/Random.nextDouble ()D
      // 4d: ldc2_w 2.0
      // 50: dmul
      // 51: dadd
      // 52: invokestatic fe6.jqf (D)I
      // 55: istore 6
      // 57: new mew
      // 5a: dup
      // 5b: iload 4
      // 5d: iload 5
      // 5f: iload 6
      // 61: invokespecial mew.<init> (III)V
      // 64: astore 7
      // 66: aload 3
      // 67: aload 7
      // 69: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 6c: invokeinterface zfz.r_y ()Le0x; 1
      // 71: astore 8
      // 73: aload 3
      // 74: aload 7
      // 76: invokevirtual mew.eve ()Lmew;
      // 79: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7c: invokeinterface zfz.r_y ()Le0x; 1
      // 81: astore 9
      // 83: aload 0
      // 84: aload 3
      // 85: aload 7
      // 87: aload 0
      // 88: getfield a_t$vbq.wue La_t;
      // 8b: invokevirtual a_t.ejt ()Lzfz;
      // 8e: invokeinterface zfz.r_y ()Le0x; 1
      // 93: aload 8
      // 95: aload 9
      // 97: invokespecial a_t$vbq.mrn (Lt9d;Lmew;Le0x;Le0x;Le0x;)Z
      // 9a: iload 1
      // 9b: ifne bd
      // 9e: ifeq cb
      // a1: goto a8
      // a4: invokestatic a_t$vbq.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 3
      // a9: aload 7
      // ab: aload 0
      // ac: getfield a_t$vbq.wue La_t;
      // af: invokevirtual a_t.ejt ()Lzfz;
      // b2: bipush 3
      // b3: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // b6: goto bd
      // b9: invokestatic a_t$vbq.a (Loov;)Loov;
      // bc: athrow
      // bd: pop
      // be: aload 0
      // bf: getfield a_t$vbq.wue La_t;
      // c2: getstatic ox_.ibw Le0x;
      // c5: invokevirtual e0x.l4i ()Lzfz;
      // c8: invokevirtual a_t.y4i (Lzfz;)V
      // cb: return
   }

   private boolean mrn(t9d param1, mew param2, e0x param3, e0x param4, e0x param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: aload 3
      // 06: iload 6
      // 08: ifne 24
      // 0b: aload 1
      // 0c: aload 2
      // 0d: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 10: ifne 22
      // 13: goto 1a
      // 16: invokestatic a_t$vbq.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 0
      // 1b: goto 65
      // 1e: invokestatic a_t$vbq.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 4
      // 24: invokevirtual e0x.p1r ()Lp3y;
      // 27: getstatic p3y.cei Lp3y;
      // 2a: iload 6
      // 2c: ifne 55
      // 2f: if_acmpeq 41
      // 32: goto 39
      // 35: invokestatic a_t$vbq.a (Loov;)Loov;
      // 38: athrow
      // 39: bipush 0
      // 3a: goto 65
      // 3d: invokestatic a_t$vbq.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 5
      // 43: iload 6
      // 45: ifne 62
      // 48: invokevirtual e0x.p1r ()Lp3y;
      // 4b: getstatic p3y.cei Lp3y;
      // 4e: goto 55
      // 51: invokestatic a_t$vbq.a (Loov;)Loov;
      // 54: athrow
      // 55: if_acmpne 60
      // 58: bipush 0
      // 59: goto 65
      // 5c: invokestatic a_t$vbq.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 5
      // 62: invokevirtual e0x.gck ()Z
      // 65: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5854210142288093349L, -4790501268049710139L, MethodHandles.lookup().lookupClass()).a(85594910172541L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 46637766732069L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("_ï\u0012©\u001dH·Ã\u0014W:±p*]\t".getBytes("ISO-8859-1"));
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
