import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class p8d extends cjm {
   private static final long a;
   private static final String b;

   public p8d(laq var1) {
      long var2 = a ^ 81370446656453L;
      super();
      this.eob = var1;
      if (!(var1.zq2() instanceof zvv)) {
         throw new IllegalArgumentException(b);
      }
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield p8d.eob Llaq;
      // 08: getfield laq.oay Lt9d;
      // 0b: invokevirtual t9d.m40 ()Z
      // 0e: iload 1
      // 0f: ifeq 1d
      // 12: ifeq 1e
      // 15: goto 1c
      // 18: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: new mew
      // 21: dup
      // 22: aload 0
      // 23: getfield p8d.eob Llaq;
      // 26: invokespecial mew.<init> (Li2h;)V
      // 29: astore 2
      // 2a: aload 0
      // 2b: getfield p8d.eob Llaq;
      // 2e: getfield laq.oay Lt9d;
      // 31: invokevirtual t9d.hd9 ()Lbg8;
      // 34: aload 2
      // 35: bipush 16
      // 37: invokevirtual bg8.pom (Lmew;I)Lj7z;
      // 3a: astore 3
      // 3b: iload 1
      // 3c: ifeq 59
      // 3f: aload 3
      // 40: ifnonnull 50
      // 43: goto 4a
      // 46: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 3
      // 52: aload 2
      // 53: invokevirtual j7z.cab (Lmew;)Lwdx;
      // 56: putfield p8d.qil Lwdx;
      // 59: aload 0
      // 5a: getfield p8d.qil Lwdx;
      // 5d: iload 1
      // 5e: ifeq 77
      // 61: ifnonnull 73
      // 64: goto 6b
      // 67: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: goto 93
      // 6f: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 72: athrow
      // 73: aload 0
      // 74: getfield p8d.qil Lwdx;
      // 77: aload 2
      // 78: invokevirtual wdx.qhc (Lmew;)I
      // 7b: i2d
      // 7c: ldc2_w 2.25
      // 7f: dcmpg
      // 80: iload 1
      // 81: ifeq 8f
      // 84: ifge 92
      // 87: goto 8e
      // 8a: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 8d: athrow
      // 8e: bipush 1
      // 8f: goto 93
      // 92: bipush 0
      // 93: ireturn
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield p8d.eob Llaq;
      // 08: getfield laq.oay Lt9d;
      // 0b: invokevirtual t9d.m40 ()Z
      // 0e: iload 1
      // 0f: ifeq 2b
      // 12: ifeq 24
      // 15: goto 1c
      // 18: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: goto 65
      // 20: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield p8d.qil Lwdx;
      // 28: invokevirtual wdx.ker ()Z
      // 2b: iload 1
      // 2c: ifeq 52
      // 2f: ifne 64
      // 32: goto 39
      // 35: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield p8d.qil Lwdx;
      // 3d: new mew
      // 40: dup
      // 41: aload 0
      // 42: getfield p8d.eob Llaq;
      // 45: invokespecial mew.<init> (Li2h;)V
      // 48: invokevirtual wdx.d6z (Lmew;)Z
      // 4b: goto 52
      // 4e: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51: athrow
      // 52: iload 1
      // 53: ifeq 61
      // 56: ifeq 64
      // 59: goto 60
      // 5c: invokestatic p8d.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 65
      // 64: bipush 0
      // 65: ireturn
   }

   @Override
   public void mnp() {
      ((zvv)this.eob.zq2()).w2o(false);
      ((zvv)this.eob.zq2()).ahp(false);
   }

   @Override
   public void zly() {
      ((zvv)this.eob.zq2()).w2o(true);
      ((zvv)this.eob.zq2()).ahp(true);
      this.qil = null;
   }

   @Override
   public void iad() {
      this.qil.ikc();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3119359139323809033L, -8949248967077888789L, MethodHandles.lookup().lookupClass()).a(237492713509212L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 131988611536745L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "h\u008f¿Y2\u0018\u0014Ãk 8\u0011-Ä Êù\u0017[tÁiz\u0001\u001bâFÕPÐ\u008c?;\u0082Eû&{°v\u00adÜÏ\u0006ÿMFü".getBytes("ISO-8859-1")
      );
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
