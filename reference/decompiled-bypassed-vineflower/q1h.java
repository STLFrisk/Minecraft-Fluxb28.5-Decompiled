import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class q1h extends s0i {
   private q1h$_7g yh7;
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public q1h(t9d var1) {
      super(var1);
      this.yxc(0.4F, 0.3F);
      this.r1d.tn8(1, new dnq(this));
      this.r1d.tn8(3, this.yh7 = new q1h$_7g(this));
      this.r1d.tn8(4, new h2d(this, ha9.class, 1.0, false));
      this.r1d.tn8(5, new q1h$z5s(this));
      this.g9o.tn8(1, new z7z(this, true, new Class[0]));
      this.g9o.tn8(2, new s24(this, ha9.class, true));
   }

   @Override
   public double g4y() {
      return 0.2;
   }

   @Override
   public float c5y() {
      return 0.1F;
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(8.0);
      this.dgt(m6d.w7i).zf7(0.25);
      this.dgt(m6d.y3f).zf7(1.0);
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public String _n1() {
      long var1 = c ^ 102815427661631L;
      return e<"w">(29370, 1332132498591702813L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 78219395072071L;
      return e<"w">(26763, 8657901525677853269L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 132306873595401L;
      return e<"w">(158, 6323077567377970189L ^ var1);
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual q1h.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifeq 2c
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic q1h.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic q1h.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: iload 3
      // 1f: ifeq 30
      // 22: instanceof c7o
      // 25: goto 2c
      // 28: invokestatic q1h.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifne 36
      // 2f: aload 1
      // 30: getstatic ofh.isz Lofh;
      // 33: if_acmpne 44
      // 36: aload 0
      // 37: getfield q1h.yh7 Lq1h$_7g;
      // 3a: invokevirtual q1h$_7g.uyh ()V
      // 3d: goto 44
      // 40: invokestatic q1h.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: aload 1
      // 46: fload 2
      // 47: invokespecial s0i.m1t (Lofh;F)Z
      // 4a: ireturn
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = c ^ 13399100485445L;
      this.lhu(e<"w">(18443, 2064002231864067541L ^ var3), 0.15F, 1.0F);
   }

   @Override
   public u7m q4n() {
      return null;
   }

   @Override
   public void xx_() {
      this.ksw = this.x5k;
      super.xx_();
   }

   @Override
   public float ncy(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 30
      // 09: getfield q1h.oay Lt9d;
      // 0c: aload 1
      // 0d: invokevirtual mew.eve ()Lmew;
      // 10: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 13: invokeinterface zfz.r_y ()Le0x; 1
      // 18: getstatic ox_.pu8 Le0x;
      // 1b: if_acmpne 2f
      // 1e: goto 25
      // 21: invokestatic q1h.a (Loov;)Loov;
      // 24: athrow
      // 25: ldc 10.0
      // 27: nop
      // 28: goto 34
      // 2b: invokestatic q1h.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 1
      // 31: invokespecial s0i.ncy (Lmew;)F
      // 34: freturn
   }

   @Override
   public boolean vef() {
      return true;
   }

   @Override
   public boolean iaw() {
      int var1 = t9d.b();

      label47: {
         try {
            boolean var10000 = super.iaw();
            if (var1 == 0) {
               return var10000;
            }

            if (var10000) {
               break label47;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         return false;
      }

      ha9 var2 = this.oay.a_q(this, 5.0);

      try {
         if (var2 == null) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   @Override
   public n1e fhc() {
      return n1e.mw4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8711673840123211509L, -6733669632623146193L, MethodHandles.lookup().lookupClass()).a(164890753724862L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 62123378560670L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "T0\u0017-\u009e^¢¾ý7Àwh\u001b\u00894Ñá\u009c\n@=vÍ\u0019IÉ\u0090¤bfþû\u0011\u001al\u0014¬ßû(\u0002S\u008f> AË\u008d~þÿ]ÛKòË:Ï\u00adÉ,'û\u009e\u00981§ZåÃ#)\u0099gô\u00192xÏ!";
      int var8 = "T0\u0017-\u009e^¢¾ý7Àwh\u001b\u00894Ñá\u009c\n@=vÍ\u0019IÉ\u0090¤bfþû\u0011\u001al\u0014¬ßû(\u0002S\u008f> AË\u008d~þÿ]ÛKòË:Ï\u00adÉ,'û\u009e\u00981§ZåÃ#)\u0099gô\u00192xÏ!"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = f(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     g = var9;
                     u = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "=åÌçìKü=\u009d\u0017ÔÓ\u0084Ô~Z?\u008fo\u00ad\u008cÎ\\<®Ë\u0013\r\u009aåÑÜ(Ç\u0092\u0005·N}\u0098a\u0089¾qõHðtMK0M\u009aÒ\u0005\u008a°S\u0003\u0098\n\u0005·ú}E\u001a\u0089\u0001U}ûc";
                  var8 = "=åÌçìKü=\u009d\u0017ÔÓ\u0084Ô~Z?\u008fo\u00ad\u008cÎ\\<®Ë\u0013\r\u009aåÑÜ(Ç\u0092\u0005·N}\u0098a\u0089¾qõHðtMK0M\u009aÒ\u0005\u008a°S\u0003\u0098\n\u0005·ú}E\u001a\u0089\u0001U}ûc"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String f(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11198;
      if (u[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("q1h", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         u[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return u[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("q1h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
