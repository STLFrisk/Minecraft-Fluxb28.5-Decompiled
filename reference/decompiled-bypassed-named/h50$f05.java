import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum h50$f05 {
   public static final h50$f05 ay6;
   public static final h50$f05 pwg;
   public static final h50$f05 _nr;
   public static final h50$f05 uq7;
   public static final h50$f05 l18;
   public int fgl;
   public String w3b;
   private static final h50$f05[] m88;

   private h50$f05(int var3, String var4) {
      this.fgl = var3;
      this.w3b = var4;
   }

   public int xzh() {
      return this.fgl;
   }

   public String bw5() {
      return this.w3b;
   }

   public void zwk(pj2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getstatic h50$f05._nr Lh50$f05;
      // 08: iload 2
      // 09: ifeq 3b
      // 0c: if_acmpne 30
      // 0f: goto 16
      // 12: invokestatic h50$f05.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: bipush 1
      // 18: putfield pj2.wvp Z
      // 1b: aload 1
      // 1c: bipush 1
      // 1d: putfield pj2.g40 Z
      // 20: aload 1
      // 21: bipush 1
      // 22: putfield pj2.lez Z
      // 25: iload 2
      // 26: ifne 78
      // 29: goto 30
      // 2c: invokestatic h50$f05.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getstatic h50$f05.l18 Lh50$f05;
      // 34: goto 3b
      // 37: invokestatic h50$f05.a (Loov;)Loov;
      // 3a: athrow
      // 3b: if_acmpne 5d
      // 3e: aload 1
      // 3f: bipush 1
      // 40: putfield pj2.wvp Z
      // 43: aload 1
      // 44: bipush 0
      // 45: putfield pj2.g40 Z
      // 48: aload 1
      // 49: bipush 1
      // 4a: putfield pj2.lez Z
      // 4d: aload 1
      // 4e: bipush 1
      // 4f: putfield pj2.wzx Z
      // 52: iload 2
      // 53: ifne 78
      // 56: goto 5d
      // 59: invokestatic h50$f05.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 1
      // 5e: bipush 0
      // 5f: putfield pj2.wvp Z
      // 62: aload 1
      // 63: bipush 0
      // 64: putfield pj2.g40 Z
      // 67: aload 1
      // 68: bipush 0
      // 69: putfield pj2.lez Z
      // 6c: aload 1
      // 6d: bipush 0
      // 6e: putfield pj2.wzx Z
      // 71: goto 78
      // 74: invokestatic h50$f05.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 1
      // 79: aload 0
      // 7a: invokevirtual h50$f05.p98 ()Z
      // 7d: iload 2
      // 7e: ifeq 8c
      // 81: ifne 8f
      // 84: goto 8b
      // 87: invokestatic h50$f05.a (Loov;)Loov;
      // 8a: athrow
      // 8b: bipush 1
      // 8c: goto 90
      // 8f: bipush 0
      // 90: putfield pj2.x4a Z
      // 93: return
   }

   public boolean p98() {
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
      // 05: getstatic h50$f05.uq7 Lh50$f05;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: if_acmpeq 24
      // 0f: goto 16
      // 12: invokestatic h50$f05.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic h50$f05.l18 Lh50$f05;
      // 1a: goto 21
      // 1d: invokestatic h50$f05.a (Loov;)Loov;
      // 20: athrow
      // 21: if_acmpne 2c
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic h50$f05.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   public boolean zlv() {
      try {
         if (this == _nr) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean wdc() {
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
      // 05: getstatic h50$f05.pwg Lh50$f05;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: if_acmpeq 24
      // 0f: goto 16
      // 12: invokestatic h50$f05.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic h50$f05.uq7 Lh50$f05;
      // 1a: goto 21
      // 1d: invokestatic h50$f05.a (Loov;)Loov;
      // 20: athrow
      // 21: if_acmpne 2c
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic h50$f05.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   public static h50$f05 e9x(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic h50$f05.values ()[Lh50$f05;
      // 03: astore 2
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: bipush 0
      // 0b: istore 4
      // 0d: istore 1
      // 0e: iload 4
      // 10: iload 3
      // 11: if_icmpge 47
      // 14: aload 2
      // 15: iload 4
      // 17: aaload
      // 18: astore 5
      // 1a: iload 1
      // 1b: ifne 43
      // 1e: aload 5
      // 20: iload 1
      // 21: ifne 4a
      // 24: goto 2b
      // 27: invokestatic h50$f05.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield h50$f05.fgl I
      // 2e: iload 0
      // 2f: if_icmpne 40
      // 32: goto 39
      // 35: invokestatic h50$f05.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 5
      // 3b: areturn
      // 3c: invokestatic h50$f05.a (Loov;)Loov;
      // 3f: athrow
      // 40: iinc 4 1
      // 43: iload 1
      // 44: ifeq 0e
      // 47: getstatic h50$f05.pwg Lh50$f05;
      // 4a: areturn
   }

   public static h50$f05 ww5(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic h50$f05.values ()[Lh50$f05;
      // 03: astore 2
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: aload 2
      // 08: arraylength
      // 09: istore 3
      // 0a: istore 1
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: iload 4
      // 10: iload 3
      // 11: if_icmpge 4a
      // 14: aload 2
      // 15: iload 4
      // 17: aaload
      // 18: astore 5
      // 1a: iload 1
      // 1b: ifeq 46
      // 1e: aload 5
      // 20: iload 1
      // 21: ifeq 4d
      // 24: goto 2b
      // 27: invokestatic h50$f05.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield h50$f05.w3b Ljava/lang/String;
      // 2e: aload 0
      // 2f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 32: ifeq 43
      // 35: goto 3c
      // 38: invokestatic h50$f05.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 5
      // 3e: areturn
      // 3f: invokestatic h50$f05.a (Loov;)Loov;
      // 42: athrow
      // 43: iinc 4 1
      // 46: iload 1
      // 47: ifne 0e
      // 4a: getstatic h50$f05.pwg Lh50$f05;
      // 4d: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7362975855593442105L, -3659932597142111800L, MethodHandles.lookup().lookupClass()).a(153274123902947L);
      // $VF: monitorexit
      long var10 = var10000 ^ 137952150699831L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[9];
      int var6 = 0;
      String var5 = "¿\t\u008f«\u008f&\u0003ç\u0010Qò\u0014\u009d\u001a]~Pn«ë±Edk\u0000\u0010Bí\u009bh±meC¦¼\f\u0087\u0013i¹\u008e\u0010Ø\u0016\u0015í=%\u001dÑv5\u0007J\u0004TËÞ\u0010\u0006\u000b;ò\u009d×h·~ÕxîØÜ\u001dù\u0010\u008a\u001f$\u0093²-ÜËÝ;\u009fçJ°\n@\u0010 ´¢Éc\u00adIÂ\t\u0081lg\u0086D)1";
      int var7 = "¿\t\u008f«\u008f&\u0003ç\u0010Qò\u0014\u009d\u001a]~Pn«ë±Edk\u0000\u0010Bí\u009bh±meC¦¼\f\u0087\u0013i¹\u008e\u0010Ø\u0016\u0015í=%\u001dÑv5\u0007J\u0004TËÞ\u0010\u0006\u000b;ò\u009d×h·~ÕxîØÜ\u001dù\u0010\u008a\u001f$\u0093²-ÜËÝ;\u009fçJ°\n@\u0010 ´¢Éc\u00adIÂ\t\u0081lg\u0086D)1"
         .length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     ay6 = new h50$f05(-1, "");
                     pwg = new h50$f05(0, var8[1]);
                     _nr = new h50$f05(1, var8[5]);
                     uq7 = new h50$f05(2, var8[6]);
                     l18 = new h50$f05(3, var8[8]);
                     m88 = new h50$f05[]{ay6, pwg, _nr, uq7, l18};
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "¤$$\u00051ø\u009f`3îs¡l©t\u0096\u0010ÛÞ \u0085°\u0014Ñþf?\n\u0088¼nÚ&";
                  var7 = "¤$$\u00051ø\u009f`3îs¡l©t\u0096\u0010ÛÞ \u0085°\u0014Ñþf?\n\u0088¼nÚ&".length();
                  var4 = 16;
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
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
