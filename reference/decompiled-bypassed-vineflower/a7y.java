import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a7y extends u7m {
   private static final long a;
   private static final String b;

   public a7y() {
      this.vgp = 1;
      this.rlr(64);
      this.qfy(uja.zip);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic a7y.a J
      // 03: ldc2_w 46283704002269
      // 06: lxor
      // 07: lstore 9
      // 09: invokestatic t9d.b ()I
      // 0c: istore 11
      // 0e: aload 4
      // 10: aload 5
      // 12: invokevirtual mew.offset (Lvt2;)Lmew;
      // 15: astore 4
      // 17: aload 2
      // 18: aload 4
      // 1a: aload 5
      // 1c: aload 1
      // 1d: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 20: iload 11
      // 22: ifeq 30
      // 25: ifne 31
      // 28: goto 2f
      // 2b: invokestatic a7y.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 0
      // 30: ireturn
      // 31: aload 3
      // 32: aload 4
      // 34: iload 11
      // 36: ifeq 90
      // 39: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3c: invokeinterface zfz.r_y ()Le0x; 1
      // 41: invokevirtual e0x.p1r ()Lp3y;
      // 44: getstatic p3y.cei Lp3y;
      // 47: if_acmpne 9a
      // 4a: goto 51
      // 4d: invokestatic a7y.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 3
      // 52: aload 4
      // 54: invokevirtual mew.getX ()I
      // 57: i2d
      // 58: ldc2_w 0.5
      // 5b: dadd
      // 5c: aload 4
      // 5e: invokevirtual mew.getY ()I
      // 61: i2d
      // 62: ldc2_w 0.5
      // 65: dadd
      // 66: aload 4
      // 68: invokevirtual mew.getZ ()I
      // 6b: i2d
      // 6c: ldc2_w 0.5
      // 6f: dadd
      // 70: getstatic a7y.b Ljava/lang/String;
      // 73: nop
      // 74: fconst_1
      // 75: getstatic a7y.pq6 Ljava/util/Random;
      // 78: invokevirtual java/util/Random.nextFloat ()F
      // 7b: ldc 0.4
      // 7d: nop
      // 7e: fmul
      // 7f: ldc 0.8
      // 81: nop
      // 82: fadd
      // 83: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 86: aload 3
      // 87: aload 4
      // 89: goto 90
      // 8c: invokestatic a7y.a (Loov;)Loov;
      // 8f: athrow
      // 90: getstatic ox_._0u Lwuo;
      // 93: invokevirtual wuo.l4i ()Lzfz;
      // 96: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 99: pop
      // 9a: aload 1
      // 9b: bipush 1
      // 9c: aload 2
      // 9d: invokevirtual erg.ybw (ILg_3;)V
      // a0: bipush 1
      // a1: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2723446982723913124L, 6951524850359568736L, MethodHandles.lookup().lookupClass()).a(215627785743634L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100929183328985L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0007Id\u0085\u0015-å\u0083)¶}I:×\u0018\u0093".getBytes("ISO-8859-1"));
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
