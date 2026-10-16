import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class n1d extends f7i {
   private static final long a;
   private static final String b;

   public n1d() {
      super(
         3,
         3,
         new erg[]{
            new erg(xbr.y8u),
            new erg(xbr.y8u),
            new erg(xbr.y8u),
            new erg(xbr.y8u),
            new erg(xbr.kdv, 0, 32767),
            new erg(xbr.y8u),
            new erg(xbr.y8u),
            new erg(xbr.y8u),
            new erg(xbr.y8u)
         },
         new erg(xbr.xpe, 0, 0)
      );
   }

   @Override
   public boolean mve(z0_ param1, OpaquePredicate param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial f7i.mve (Lz0_;Lt9d;)Z
      // 0a: iload 3
      // 0b: ifeq 19
      // 0e: ifne 1a
      // 11: goto 18
      // 14: invokestatic n1d.b (Loov;)Loov;
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: aconst_null
      // 1b: astore 4
      // 1d: bipush 0
      // 1e: istore 5
      // 20: iload 5
      // 22: aload 1
      // 23: invokevirtual z0_.opt ()I
      // 26: if_icmpge 8b
      // 29: aload 4
      // 2b: iload 3
      // 2c: ifeq 8d
      // 2f: iload 3
      // 30: ifeq 8d
      // 33: goto 3a
      // 36: invokestatic n1d.b (Loov;)Loov;
      // 39: athrow
      // 3a: ifnonnull 8b
      // 3d: goto 44
      // 40: invokestatic n1d.b (Loov;)Loov;
      // 43: athrow
      // 44: aload 1
      // 45: iload 5
      // 47: invokevirtual z0_.ibn (I)Lerg;
      // 4a: astore 6
      // 4c: iload 3
      // 4d: ifeq 87
      // 50: aload 6
      // 52: ifnull 84
      // 55: goto 5c
      // 58: invokestatic n1d.b (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 6
      // 5e: iload 3
      // 5f: ifeq 82
      // 62: goto 69
      // 65: invokestatic n1d.b (Loov;)Loov;
      // 68: athrow
      // 69: invokevirtual erg.gn1 ()Lu7m;
      // 6c: getstatic xbr.kdv Lf58;
      // 6f: if_acmpne 84
      // 72: goto 79
      // 75: invokestatic n1d.b (Loov;)Loov;
      // 78: athrow
      // 79: aload 6
      // 7b: goto 82
      // 7e: invokestatic n1d.b (Loov;)Loov;
      // 81: athrow
      // 82: astore 4
      // 84: iinc 5 1
      // 87: iload 3
      // 88: ifne 20
      // 8b: aload 4
      // 8d: ifnonnull 96
      // 90: bipush 0
      // 91: ireturn
      // 92: invokestatic n1d.b (Loov;)Loov;
      // 95: athrow
      // 96: getstatic xbr.kdv Lf58;
      // 99: aload 4
      // 9b: aload 2
      // 9c: invokevirtual f58.h9y (Lerg;Lt9d;)Lucr;
      // 9f: astore 5
      // a1: aload 5
      // a3: iload 3
      // a4: ifeq bb
      // a7: ifnonnull b9
      // aa: goto b1
      // ad: invokestatic n1d.b (Loov;)Loov;
      // b0: athrow
      // b1: bipush 0
      // b2: goto d9
      // b5: invokestatic n1d.b (Loov;)Loov;
      // b8: athrow
      // b9: aload 5
      // bb: getfield ucr.rqi B
      // be: iload 3
      // bf: ifeq d5
      // c2: bipush 4
      // c3: if_icmpge d8
      // c6: goto cd
      // c9: invokestatic n1d.b (Loov;)Loov;
      // cc: athrow
      // cd: bipush 1
      // ce: goto d5
      // d1: invokestatic n1d.b (Loov;)Loov;
      // d4: athrow
      // d5: goto d9
      // d8: bipush 0
      // d9: ireturn
   }

   @Override
   public erg hd0(z0_ param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic n1d.a J
      // 03: ldc2_w 31070007224069
      // 06: lxor
      // 07: lstore 2
      // 08: aconst_null
      // 09: astore 5
      // 0b: invokestatic OpaquePredicate.c ()I
      // 0e: bipush 0
      // 0f: istore 6
      // 11: istore 4
      // 13: iload 6
      // 15: aload 1
      // 16: invokevirtual z0_.opt ()I
      // 19: if_icmpge 83
      // 1c: aload 5
      // 1e: iload 4
      // 20: ifne 92
      // 23: iload 4
      // 25: ifne 92
      // 28: goto 2f
      // 2b: invokestatic n1d.b (Loov;)Loov;
      // 2e: athrow
      // 2f: ifnonnull 83
      // 32: goto 39
      // 35: invokestatic n1d.b (Loov;)Loov;
      // 38: athrow
      // 39: aload 1
      // 3a: iload 6
      // 3c: invokevirtual z0_.ibn (I)Lerg;
      // 3f: astore 7
      // 41: iload 4
      // 43: ifne 7e
      // 46: aload 7
      // 48: ifnull 7b
      // 4b: goto 52
      // 4e: invokestatic n1d.b (Loov;)Loov;
      // 51: athrow
      // 52: aload 7
      // 54: iload 4
      // 56: ifne 79
      // 59: goto 60
      // 5c: invokestatic n1d.b (Loov;)Loov;
      // 5f: athrow
      // 60: invokevirtual erg.gn1 ()Lu7m;
      // 63: getstatic xbr.kdv Lf58;
      // 66: if_acmpne 7b
      // 69: goto 70
      // 6c: invokestatic n1d.b (Loov;)Loov;
      // 6f: athrow
      // 70: aload 7
      // 72: goto 79
      // 75: invokestatic n1d.b (Loov;)Loov;
      // 78: athrow
      // 79: astore 5
      // 7b: iinc 6 1
      // 7e: iload 4
      // 80: ifeq 13
      // 83: aload 5
      // 85: invokevirtual erg.yaq ()Lerg;
      // 88: astore 5
      // 8a: aload 5
      // 8c: bipush 1
      // 8d: putfield erg.qd2 I
      // 90: aload 5
      // 92: invokevirtual erg.zso ()Lbdo;
      // 95: iload 4
      // 97: ifne bc
      // 9a: ifnonnull b7
      // 9d: goto a4
      // a0: invokestatic n1d.b (Loov;)Loov;
      // a3: athrow
      // a4: aload 5
      // a6: new bdo
      // a9: dup
      // aa: invokespecial bdo.<init> ()V
      // ad: invokevirtual erg.b67 (Lbdo;)V
      // b0: goto b7
      // b3: invokestatic n1d.b (Loov;)Loov;
      // b6: athrow
      // b7: aload 5
      // b9: invokevirtual erg.zso ()Lbdo;
      // bc: getstatic n1d.b Ljava/lang/String;
      // bf: nop
      // c0: bipush 1
      // c1: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // c4: aload 5
      // c6: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4736736977919375907L, -8449502022952947392L, MethodHandles.lookup().lookupClass()).a(183584743229806L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 56373967446303L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0091\u0000¨ïF/jñ´\u001c\u009d5\u0016úhÄ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static oov b(oov var0) {
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
