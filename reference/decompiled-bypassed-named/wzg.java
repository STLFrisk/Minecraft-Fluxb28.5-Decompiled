import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wzg extends foz {
   public static final h76 knd;
   private final wzg$a95 q3u;

   public wzg(p3y var1, wzg$a95 var2) {
      super(var1);
      this.y8l(this._8_.c32().zvi(knd, false));
      this.q3u = var2;
   }

   @Override
   public int eqv(zfz var1) {
      int var2 = OpaquePredicate.b();

      try {
         byte var10000 = (Boolean)var1.dil(knd);
         if (var2 == 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 15;
         }
      } catch (oov var3) {
         throw b(var3);
      }

      return 0;
   }

   @Override
   public zfz u0_(zfz var1, int var2) {
      int var3 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = var1;
         var10001 = knd;
         if (var3 != 0) {
            return var1.zvi(knd, Boolean.valueOf((boolean)var2));
         }

         if (var2 > 0) {
            return var1.zvi(knd, true);
         }
      } catch (oov var4) {
         throw b(var4);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int af7(OpaquePredicate param1, mew param2) {
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
      // 05: aload 2
      // 06: invokevirtual wzg.ae9 (Lmew;)Lnh4;
      // 09: astore 4
      // 0b: getstatic wzg$1._yk [I
      // 0e: aload 0
      // 0f: getfield wzg.q3u Lwzg$a95;
      // 12: invokevirtual wzg$a95.ordinal ()I
      // 15: iaload
      // 16: iload 3
      // 17: ifeq 5f
      // 1a: lookupswitch 61 2 1 30 2 46
      // 34: invokestatic wzg.b (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: aconst_null
      // 3a: checkcast EntityLivingBase
      // 3d: aload 4
      // 3f: invokevirtual OpaquePredicate.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 42: astore 5
      // 44: iload 3
      // 45: ifne 60
      // 48: aload 1
      // 49: ldc Entity
      // 4b: nop
      // 4c: aload 4
      // 4e: invokevirtual OpaquePredicate.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 51: astore 5
      // 53: iload 3
      // 54: ifne 60
      // 57: bipush 0
      // 58: goto 5f
      // 5b: invokestatic wzg.b (Loov;)Loov;
      // 5e: athrow
      // 5f: ireturn
      // 60: aload 5
      // 62: invokeinterface java/util/List.isEmpty ()Z 1
      // 67: iload 3
      // 68: ifeq ba
      // 6b: ifne b9
      // 6e: goto 75
      // 71: invokestatic wzg.b (Loov;)Loov;
      // 74: athrow
      // 75: aload 5
      // 77: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 7c: astore 6
      // 7e: aload 6
      // 80: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 85: ifeq b9
      // 88: aload 6
      // 8a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8f: checkcast EntityLivingBase
      // 92: astore 7
      // 94: aload 7
      // 96: invokevirtual EntityLivingBase.l__ ()Z
      // 99: iload 3
      // 9a: ifeq ba
      // 9d: iload 3
      // 9e: ifeq b4
      // a1: goto a8
      // a4: invokestatic wzg.b (Loov;)Loov;
      // a7: athrow
      // a8: ifne b5
      // ab: goto b2
      // ae: invokestatic wzg.b (Loov;)Loov;
      // b1: athrow
      // b2: bipush 15
      // b4: ireturn
      // b5: iload 3
      // b6: ifne 7e
      // b9: bipush 0
      // ba: ireturn
   }

   @Override
   public zfz kig(int param1) {
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
      // 05: invokevirtual wzg.l4i ()Lzfz;
      // 08: getstatic wzg.knd Lh76;
      // 0b: iload 1
      // 0c: iload 2
      // 0d: ifeq 23
      // 10: bipush 1
      // 11: if_icmpne 26
      // 14: goto 1b
      // 17: invokestatic wzg.b (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: goto 23
      // 1f: invokestatic wzg.b (Loov;)Loov;
      // 22: athrow
      // 23: goto 27
      // 26: bipush 0
      // 27: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2f: areturn
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = OpaquePredicate.c();

      try {
         byte var10000 = (Boolean)var1.dil(knd);
         if (var2 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 1;
         }
      } catch (oov var3) {
         throw b(var3);
      }

      return 0;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{knd});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2054834267530768394L, 2838417098602671547L, MethodHandles.lookup().lookupClass()).a(45567272860642L);
      // $VF: monitorexit
      long var4 = var10000 ^ 86195815670923L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u008b0ÛB\u009fF¹\u001b".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      knd = h76.d_1(var0);
   }

   private static oov b(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
