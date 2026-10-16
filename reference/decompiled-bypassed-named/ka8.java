import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ka8 extends c5x {
   private static final long c;
   private static final String h;

   public ka8(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.3125F, 0.3125F);
   }

   public ka8(OpaquePredicate var1, Entity var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.yxc(0.3125F, 0.3125F);
   }

   public ka8(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.yxc(0.3125F, 0.3125F);
   }

   @Override
   public void f7x(akm param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ka8.c J
      // 003: ldc2_w 23319342553537
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: iload 4
      // 010: ifne 02e
      // 013: getfield ka8.oay Lt9d;
      // 016: getfield OpaquePredicate.v0f Z
      // 019: ifne 12e
      // 01c: goto 023
      // 01f: invokestatic ka8.b (Loov;)Loov;
      // 022: athrow
      // 023: aload 1
      // 024: getfield akm.sc8 Li2h;
      // 027: goto 02e
      // 02a: invokestatic ka8.b (Loov;)Loov;
      // 02d: athrow
      // 02e: iload 4
      // 030: ifne 048
      // 033: ifnull 0a6
      // 036: goto 03d
      // 039: invokestatic ka8.b (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 1
      // 03e: getfield akm.sc8 Li2h;
      // 041: goto 048
      // 044: invokestatic ka8.b (Loov;)Loov;
      // 047: athrow
      // 048: aload 0
      // 049: aload 0
      // 04a: getfield ka8.gen Lg_3;
      // 04d: invokestatic ofh.dop (Lc5x;Li2h;)Lofh;
      // 050: ldc 5.0
      // 052: nop
      // 053: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 056: istore 5
      // 058: iload 5
      // 05a: iload 4
      // 05c: ifne 08f
      // 05f: ifeq 0a1
      // 062: goto 069
      // 065: invokestatic ka8.b (Loov;)Loov;
      // 068: athrow
      // 069: aload 0
      // 06a: aload 0
      // 06b: getfield ka8.gen Lg_3;
      // 06e: aload 1
      // 06f: getfield akm.sc8 Li2h;
      // 072: invokevirtual ka8.wm5 (Lg_3;Li2h;)V
      // 075: aload 1
      // 076: getfield akm.sc8 Li2h;
      // 079: iload 4
      // 07b: ifne 09d
      // 07e: goto 085
      // 081: invokestatic ka8.b (Loov;)Loov;
      // 084: athrow
      // 085: invokevirtual EntityLivingBase.xgj ()Z
      // 088: goto 08f
      // 08b: invokestatic ka8.b (Loov;)Loov;
      // 08e: athrow
      // 08f: ifne 0a1
      // 092: aload 1
      // 093: getfield akm.sc8 Li2h;
      // 096: goto 09d
      // 099: invokestatic ka8.b (Loov;)Loov;
      // 09c: athrow
      // 09d: bipush 5
      // 09e: invokevirtual EntityLivingBase.k03 (I)V
      // 0a1: iload 4
      // 0a3: ifeq 12a
      // 0a6: bipush 1
      // 0a7: istore 5
      // 0a9: aload 0
      // 0aa: getfield ka8.gen Lg_3;
      // 0ad: iload 4
      // 0af: ifne 0c7
      // 0b2: ifnull 0e9
      // 0b5: goto 0bc
      // 0b8: invokestatic ka8.b (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield ka8.gen Lg_3;
      // 0c0: goto 0c7
      // 0c3: invokestatic ka8.b (Loov;)Loov;
      // 0c6: athrow
      // 0c7: instanceof yqv
      // 0ca: iload 4
      // 0cc: ifne 0eb
      // 0cf: ifeq 0e9
      // 0d2: goto 0d9
      // 0d5: invokestatic ka8.b (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield ka8.oay Lt9d;
      // 0dd: invokevirtual OpaquePredicate.eir ()Lef9;
      // 0e0: getstatic ka8.h Ljava/lang/String;
      // 0e3: nop
      // 0e4: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0e7: istore 5
      // 0e9: iload 5
      // 0eb: ifeq 12a
      // 0ee: aload 1
      // 0ef: invokevirtual akm._uf ()Lmew;
      // 0f2: aload 1
      // 0f3: getfield akm.m_f Lvt2;
      // 0f6: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0f9: astore 6
      // 0fb: aload 0
      // 0fc: iload 4
      // 0fe: ifne 12b
      // 101: getfield ka8.oay Lt9d;
      // 104: aload 6
      // 106: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 109: ifeq 12a
      // 10c: goto 113
      // 10f: invokestatic ka8.b (Loov;)Loov;
      // 112: athrow
      // 113: aload 0
      // 114: getfield ka8.oay Lt9d;
      // 117: aload 6
      // 119: getstatic ox_._0u Lwuo;
      // 11c: invokevirtual wuo.l4i ()Lzfz;
      // 11f: invokevirtual OpaquePredicate.gfy (Lmew;Lzfz;)Z
      // 122: pop
      // 123: goto 12a
      // 126: invokestatic ka8.b (Loov;)Loov;
      // 129: athrow
      // 12a: aload 0
      // 12b: invokevirtual ka8._kl ()V
      // 12e: return
   }

   @Override
   public boolean mzu() {
      return false;
   }

   @Override
   public boolean m1t(ofh var1, float var2) {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3155415646760059266L, 1701761049547886209L, MethodHandles.lookup().lookupClass()).a(33714000912753L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 94485711933381L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("dZ\u0080#©yk\u0006üÖß¾¬ur©".getBytes("ISO-8859-1"));
      String var6 = c(var4).intern();
      byte var10001 = -1;
      h = var6;
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
