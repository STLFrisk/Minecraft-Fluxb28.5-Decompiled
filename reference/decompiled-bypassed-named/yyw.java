import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yyw extends u7m {
   private static final long a;
   private static final String b;

   public yyw() {
      this.qfy(uja.kdm);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yyw.a J
      // 03: ldc2_w 129178572590191
      // 06: lxor
      // 07: lstore 9
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 11
      // 0e: aload 3
      // 0f: getfield OpaquePredicate.v0f Z
      // 12: iload 11
      // 14: ifne 39
      // 17: ifeq 27
      // 1a: goto 21
      // 1d: invokestatic yyw.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: ireturn
      // 23: invokestatic yyw.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 4
      // 29: aload 5
      // 2b: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2e: astore 4
      // 30: aload 2
      // 31: aload 4
      // 33: aload 5
      // 35: aload 1
      // 36: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 39: iload 11
      // 3b: ifne 49
      // 3e: ifne 4a
      // 41: goto 48
      // 44: invokestatic yyw.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
      // 4a: aload 3
      // 4b: aload 4
      // 4d: iload 11
      // 4f: ifne ae
      // 52: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 55: invokeinterface zfz.r_y ()Le0x; 1
      // 5a: invokevirtual e0x.p1r ()Lp3y;
      // 5d: getstatic p3y.cei Lp3y;
      // 60: if_acmpne b8
      // 63: goto 6a
      // 66: invokestatic yyw.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 3
      // 6b: aload 4
      // 6d: invokevirtual mew.getX ()I
      // 70: i2d
      // 71: ldc2_w 0.5
      // 74: dadd
      // 75: aload 4
      // 77: invokevirtual mew.getY ()I
      // 7a: i2d
      // 7b: ldc2_w 0.5
      // 7e: dadd
      // 7f: aload 4
      // 81: invokevirtual mew.getZ ()I
      // 84: i2d
      // 85: ldc2_w 0.5
      // 88: dadd
      // 89: getstatic yyw.b Ljava/lang/String;
      // 8c: nop
      // 8d: fconst_1
      // 8e: getstatic yyw.pq6 Ljava/util/Random;
      // 91: invokevirtual java/util/Random.nextFloat ()F
      // 94: getstatic yyw.pq6 Ljava/util/Random;
      // 97: invokevirtual java/util/Random.nextFloat ()F
      // 9a: fsub
      // 9b: ldc 0.2
      // 9d: nop
      // 9e: fmul
      // 9f: fconst_1
      // a0: fadd
      // a1: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // a4: aload 3
      // a5: aload 4
      // a7: goto ae
      // aa: invokestatic yyw.a (Loov;)Loov;
      // ad: athrow
      // ae: getstatic ox_._0u Lwuo;
      // b1: invokevirtual wuo.l4i ()Lzfz;
      // b4: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // b7: pop
      // b8: aload 2
      // b9: getfield ha9.lls Lpj2;
      // bc: getfield pj2.g40 Z
      // bf: iload 11
      // c1: ifne e0
      // c4: ifne df
      // c7: goto ce
      // ca: invokestatic yyw.a (Loov;)Loov;
      // cd: athrow
      // ce: aload 1
      // cf: dup
      // d0: getfield erg.qd2 I
      // d3: bipush 1
      // d4: isub
      // d5: putfield erg.qd2 I
      // d8: goto df
      // db: invokestatic yyw.a (Loov;)Loov;
      // de: athrow
      // df: bipush 1
      // e0: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5112368363681122166L, -2047977512106350851L, MethodHandles.lookup().lookupClass()).a(131904794390776L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 96916976147908L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("òx¡\u0010é·éDZ´\u0013Tm8\u0094ìc®\u0018%\u000b\u007f\u001e&".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
