import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a_t$vef extends cjm {
   private a_t db4;
   private static final long a;
   private static final String b;

   public a_t$vef(a_t var1) {
      this.db4 = var1;
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
      // 00: getstatic a_t$vef.a J
      // 03: ldc2_w 33034903409913
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield a_t$vef.db4 La_t;
      // 10: iload 3
      // 11: ifeq 37
      // 14: getfield a_t.oay Lt9d;
      // 17: invokevirtual t9d.eir ()Lef9;
      // 1a: getstatic a_t$vef.b Ljava/lang/String;
      // 1d: nop
      // 1e: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 21: ifne 33
      // 24: goto 2b
      // 27: invokestatic a_t$vef.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: goto 7a
      // 2f: invokestatic a_t$vef.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield a_t$vef.db4 La_t;
      // 37: iload 3
      // 38: ifeq 5f
      // 3b: invokevirtual a_t.ejt ()Lzfz;
      // 3e: invokeinterface zfz.r_y ()Le0x; 1
      // 43: invokevirtual e0x.p1r ()Lp3y;
      // 46: getstatic p3y.cei Lp3y;
      // 49: if_acmpeq 5b
      // 4c: goto 53
      // 4f: invokestatic a_t$vef.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 0
      // 54: goto 7a
      // 57: invokestatic a_t$vef.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield a_t$vef.db4 La_t;
      // 5f: invokevirtual a_t.mbr ()Ljava/util/Random;
      // 62: bipush 20
      // 64: invokevirtual java/util/Random.nextInt (I)I
      // 67: iload 3
      // 68: ifeq 76
      // 6b: ifne 79
      // 6e: goto 75
      // 71: invokestatic a_t$vef.a (Loov;)Loov;
      // 74: athrow
      // 75: bipush 1
      // 76: goto 7a
      // 79: bipush 0
      // 7a: ireturn
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
      // 01: getfield a_t$vef.db4 La_t;
      // 04: invokevirtual a_t.mbr ()Ljava/util/Random;
      // 07: astore 2
      // 08: invokestatic t9d.b ()I
      // 0b: aload 0
      // 0c: getfield a_t$vef.db4 La_t;
      // 0f: getfield a_t.oay Lt9d;
      // 12: astore 3
      // 13: istore 1
      // 14: aload 0
      // 15: getfield a_t$vef.db4 La_t;
      // 18: getfield a_t.o2v D
      // 1b: ldc2_w 2.0
      // 1e: dsub
      // 1f: aload 2
      // 20: invokevirtual java/util/Random.nextDouble ()D
      // 23: ldc2_w 4.0
      // 26: dmul
      // 27: dadd
      // 28: invokestatic fe6.jqf (D)I
      // 2b: istore 4
      // 2d: aload 0
      // 2e: getfield a_t$vef.db4 La_t;
      // 31: getfield a_t.kfp D
      // 34: aload 2
      // 35: invokevirtual java/util/Random.nextDouble ()D
      // 38: ldc2_w 3.0
      // 3b: dmul
      // 3c: dadd
      // 3d: invokestatic fe6.jqf (D)I
      // 40: istore 5
      // 42: aload 0
      // 43: getfield a_t$vef.db4 La_t;
      // 46: getfield a_t.vbd D
      // 49: ldc2_w 2.0
      // 4c: dsub
      // 4d: aload 2
      // 4e: invokevirtual java/util/Random.nextDouble ()D
      // 51: ldc2_w 4.0
      // 54: dmul
      // 55: dadd
      // 56: invokestatic fe6.jqf (D)I
      // 59: istore 6
      // 5b: new mew
      // 5e: dup
      // 5f: iload 4
      // 61: iload 5
      // 63: iload 6
      // 65: invokespecial mew.<init> (III)V
      // 68: astore 7
      // 6a: aload 3
      // 6b: aload 7
      // 6d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 70: astore 8
      // 72: aload 8
      // 74: invokeinterface zfz.r_y ()Le0x; 1
      // 79: astore 9
      // 7b: invokestatic a_t.mek ()Ljava/util/Set;
      // 7e: aload 9
      // 80: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 85: iload 1
      // 86: ifeq af
      // 89: ifeq b0
      // 8c: goto 93
      // 8f: invokestatic a_t$vef.a (Loov;)Loov;
      // 92: athrow
      // 93: aload 0
      // 94: getfield a_t$vef.db4 La_t;
      // 97: aload 8
      // 99: invokevirtual a_t.y4i (Lzfz;)V
      // 9c: aload 3
      // 9d: aload 7
      // 9f: getstatic ox_.ibw Le0x;
      // a2: invokevirtual e0x.l4i ()Lzfz;
      // a5: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // a8: goto af
      // ab: invokestatic a_t$vef.a (Loov;)Loov;
      // ae: athrow
      // af: pop
      // b0: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1135476821262514303L, 1566615569514526960L, MethodHandles.lookup().lookupClass()).a(171552205860112L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 74222520469109L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("2\u000fMÝêâ¼\u0012\u0089ÌÊ\\+O\u0088¤".getBytes("ISO-8859-1"));
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
