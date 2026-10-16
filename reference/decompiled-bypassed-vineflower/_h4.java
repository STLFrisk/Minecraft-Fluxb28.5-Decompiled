import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _h4 extends bq2 {
   public static final zb_ msa;

   public _h4() {
      super(p3y.fdu);
      this.i3l(uja.mqu);
      this.q6h(2.0F);
      this.t4k(l18);
   }

   @Override
   public void b8f(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 4
      // 01: istore 5
      // 03: invokestatic t9d.b ()I
      // 06: iload 5
      // 08: bipush 1
      // 09: iadd
      // 0a: istore 6
      // 0c: istore 4
      // 0e: aload 1
      // 0f: aload 2
      // 10: iload 6
      // 12: ineg
      // 13: iload 6
      // 15: ineg
      // 16: iload 6
      // 18: ineg
      // 19: invokevirtual mew.ec4 (III)Lmew;
      // 1c: aload 2
      // 1d: iload 6
      // 1f: iload 6
      // 21: iload 6
      // 23: invokevirtual mew.ec4 (III)Lmew;
      // 26: invokevirtual t9d.o2i (Lmew;Lmew;)Z
      // 29: ifeq cf
      // 2c: aload 2
      // 2d: iload 5
      // 2f: ineg
      // 30: iload 5
      // 32: ineg
      // 33: iload 5
      // 35: ineg
      // 36: invokevirtual mew.ec4 (III)Lmew;
      // 39: aload 2
      // 3a: iload 5
      // 3c: iload 5
      // 3e: iload 5
      // 40: invokevirtual mew.ec4 (III)Lmew;
      // 43: invokestatic mew.kil (Lmew;Lmew;)Ljava/lang/Iterable;
      // 46: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4b: astore 7
      // 4d: aload 7
      // 4f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 54: ifeq cf
      // 57: aload 7
      // 59: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5e: checkcast mew
      // 61: astore 8
      // 63: aload 1
      // 64: aload 8
      // 66: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 69: astore 9
      // 6b: aload 9
      // 6d: iload 4
      // 6f: ifeq 90
      // 72: invokeinterface zfz.r_y ()Le0x; 1
      // 77: invokevirtual e0x.p1r ()Lp3y;
      // 7a: getstatic p3y.hh1 Lp3y;
      // 7d: if_acmpne ca
      // 80: goto 87
      // 83: invokestatic _h4.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 9
      // 89: goto 90
      // 8c: invokestatic _h4.a (Loov;)Loov;
      // 8f: athrow
      // 90: getstatic _cv.sdu Lh76;
      // 93: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 98: checkcast java/lang/Boolean
      // 9b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 9e: iload 4
      // a0: ifeq c9
      // a3: ifne ca
      // a6: goto ad
      // a9: invokestatic _h4.a (Loov;)Loov;
      // ac: athrow
      // ad: aload 1
      // ae: aload 8
      // b0: aload 9
      // b2: getstatic _cv.sdu Lh76;
      // b5: bipush 1
      // b6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // b9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // be: bipush 4
      // bf: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // c2: goto c9
      // c5: invokestatic _h4.a (Loov;)Loov;
      // c8: athrow
      // c9: pop
      // ca: iload 4
      // cc: ifne 4d
      // cf: return
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      return super.qk_(var1, var2, var3, var4, var5, var6, var7, var8).zvi(msa, _h4$i61.ckj(var3.e30()));
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4522512064643258243L, 6669856086607323286L, MethodHandles.lookup().lookupClass()).a(161017178451557L);
      // $VF: monitorexit
      long var4 = var10000 ^ 88592959560904L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(" ÅÊjê\u0088 6".getBytes("ISO-8859-1"));
      String var7 = c(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      msa = zb_.pq4(var0, _h4$i61.class);
   }

   private static oov a(oov var0) {
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
