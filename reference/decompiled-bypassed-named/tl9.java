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

public class tl9 extends s0i {
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public tl9(OpaquePredicate var1) {
      super(var1);
      this.dlk = 3;
      this.yxc(0.4F, 0.3F);
      this.r1d.tn8(1, new dnq(this));
      this.r1d.tn8(2, new h2d(this, ha9.class, 1.0, false));
      this.r1d.tn8(3, new _tb(this, 1.0));
      this.r1d.tn8(7, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(8, new ov6(this));
      this.g9o.tn8(1, new z7z(this, true, new Class[0]));
      this.g9o.tn8(2, new s24(this, ha9.class, true));
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
      this.dgt(m6d.y3f).zf7(2.0);
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public String _n1() {
      long var1 = c ^ 118934796189748L;
      return e<"k">(9867, 8506217000004697299L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 130338836598604L;
      return e<"k">(9665, 3666438119909929184L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 81347343284482L;
      return e<"k">(7301, 5896933904387522540L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = c ^ 67648013705294L;
      this.lhu(e<"k">(25124, 5105731687820662784L ^ var3), 0.15F, 1.0F);
   }

   @Override
   public u7m q4n() {
      return null;
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 30493083899625L;
      super.cjb(var1);
      this.i7i = var1.uz7(e<"k">(23646, 5670539885790073054L ^ var2));
      this.k5d = var1.dvl(e<"k">(10397, 5591198043893163035L ^ var2));
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 119941192776258L;
      super.srs(var1);
      var1.iin(e<"k">(20517, 7873244272080908297L ^ var2), this.i7i);
      var1.zyu(e<"k">(14217, 1635575502660507555L ^ var2), this.k5d);
   }

   @Override
   public void xx_() {
      this.ksw = this.x5k;
      super.xx_();
   }

   public boolean xrs() {
      return this.k5d;
   }

   public void yxe(boolean var1) {
      this.k5d = var1;
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial s0i.e_a ()V
      // 08: aload 0
      // 09: getfield tl9.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: iload 1
      // 10: ifne b6
      // 13: ifeq ab
      // 16: goto 1d
      // 19: invokestatic tl9.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: istore 2
      // 1f: iload 2
      // 20: bipush 2
      // 21: if_icmpge a7
      // 24: aload 0
      // 25: getfield tl9.oay Lt9d;
      // 28: getstatic w_0.t9k Lw_0;
      // 2b: aload 0
      // 2c: getfield tl9.o2v D
      // 2f: aload 0
      // 30: getfield tl9.z2d Ljava/util/Random;
      // 33: invokevirtual java/util/Random.nextDouble ()D
      // 36: ldc2_w 0.5
      // 39: dsub
      // 3a: aload 0
      // 3b: getfield tl9.uo6 F
      // 3e: f2d
      // 3f: dmul
      // 40: dadd
      // 41: aload 0
      // 42: getfield tl9.kfp D
      // 45: aload 0
      // 46: getfield tl9.z2d Ljava/util/Random;
      // 49: invokevirtual java/util/Random.nextDouble ()D
      // 4c: aload 0
      // 4d: getfield tl9.ikl F
      // 50: f2d
      // 51: dmul
      // 52: dadd
      // 53: aload 0
      // 54: getfield tl9.vbd D
      // 57: aload 0
      // 58: getfield tl9.z2d Ljava/util/Random;
      // 5b: invokevirtual java/util/Random.nextDouble ()D
      // 5e: ldc2_w 0.5
      // 61: dsub
      // 62: aload 0
      // 63: getfield tl9.uo6 F
      // 66: f2d
      // 67: dmul
      // 68: dadd
      // 69: aload 0
      // 6a: getfield tl9.z2d Ljava/util/Random;
      // 6d: invokevirtual java/util/Random.nextDouble ()D
      // 70: ldc2_w 0.5
      // 73: dsub
      // 74: ldc2_w 2.0
      // 77: dmul
      // 78: aload 0
      // 79: getfield tl9.z2d Ljava/util/Random;
      // 7c: invokevirtual java/util/Random.nextDouble ()D
      // 7f: dneg
      // 80: aload 0
      // 81: getfield tl9.z2d Ljava/util/Random;
      // 84: invokevirtual java/util/Random.nextDouble ()D
      // 87: ldc2_w 0.5
      // 8a: dsub
      // 8b: ldc2_w 2.0
      // 8e: dmul
      // 8f: bipush 0
      // 90: newarray 10
      // 92: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 95: iinc 2 1
      // 98: iload 1
      // 99: ifne f5
      // 9c: iload 1
      // 9d: ifeq 1f
      // a0: goto a7
      // a3: invokestatic tl9.a (Loov;)Loov;
      // a6: athrow
      // a7: iload 1
      // a8: ifeq f5
      // ab: aload 0
      // ac: invokevirtual tl9.jx9 ()Z
      // af: goto b6
      // b2: invokestatic tl9.a (Loov;)Loov;
      // b5: athrow
      // b6: iload 1
      // b7: ifne e4
      // ba: ifne d5
      // bd: goto c4
      // c0: invokestatic tl9.a (Loov;)Loov;
      // c3: athrow
      // c4: aload 0
      // c5: dup
      // c6: getfield tl9.i7i I
      // c9: bipush 1
      // ca: iadd
      // cb: putfield tl9.i7i I
      // ce: goto d5
      // d1: invokestatic tl9.a (Loov;)Loov;
      // d4: athrow
      // d5: aload 0
      // d6: iload 1
      // d7: ifne f2
      // da: getfield tl9.i7i I
      // dd: goto e4
      // e0: invokestatic tl9.a (Loov;)Loov;
      // e3: athrow
      // e4: sipush 2400
      // e7: if_icmplt f5
      // ea: aload 0
      // eb: goto f2
      // ee: invokestatic tl9.a (Loov;)Loov;
      // f1: athrow
      // f2: invokevirtual tl9._kl ()V
      // f5: return
   }

   @Override
   public boolean vef() {
      return true;
   }

   @Override
   public boolean iaw() {
      int var1 = OpaquePredicate.b();

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
      long var10000 = c.a(-863891172124456776L, 6662302081934455363L, MethodHandles.lookup().lookupClass()).a(202772264034821L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 52916957311665L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "Ç?Wb\u0093Ã$D\u0001:ÚgÕ?úÛ'×OÎxSÚ¤\u0000´í¸\u0000\u0081 \u0089½\u0086-&¼<Ë±(\u0013~e£\u001eÒªïk\u0091Å¹¨\f\u0003sDÑ0\u0083°Ý×ì}zy«ü\u0000E\u007fÙ!\u000bËiµ¹\u0017\u0018\u001d\u0088¶kWÙ\u008bç\u0099ÏÙ6T\u009b>¾\tÒ\u0010\u0094ýJ\u0006k ²Ê\u00ad\u0097&u\nh\u0096\u0086¨$æÂ\u001bç\u0091ÏÂf\u0094Æ\u0098Í°Û½ðôëèª L\\\u0090NÇÄÜ½Um\u0001=ô\u0086C®ZJff\tª£QùÚy5À\b´\u008c #Àmwt7æ\u0081FRÈFE%\"\u008c»5\u008c\u0099½@$£ÍÊ\u0083\u0019\u0083M\u008c\u001d";
      int var8 = "Ç?Wb\u0093Ã$D\u0001:ÚgÕ?úÛ'×OÎxSÚ¤\u0000´í¸\u0000\u0081 \u0089½\u0086-&¼<Ë±(\u0013~e£\u001eÒªïk\u0091Å¹¨\f\u0003sDÑ0\u0083°Ý×ì}zy«ü\u0000E\u007fÙ!\u000bËiµ¹\u0017\u0018\u001d\u0088¶kWÙ\u008bç\u0099ÏÙ6T\u009b>¾\tÒ\u0010\u0094ýJ\u0006k ²Ê\u00ad\u0097&u\nh\u0096\u0086¨$æÂ\u001bç\u0091ÏÂf\u0094Æ\u0098Í°Û½ðôëèª L\\\u0090NÇÄÜ½Um\u0001=ô\u0086C®ZJff\tª£QùÚy5À\b´\u008c #Àmwt7æ\u0081FRÈFE%\"\u008c»5\u008c\u0099½@$£ÍÊ\u0083\u0019\u0083M\u008c\u001d"
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
                     u = new String[8];
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

                  var6 = "Ô\u009eöÎÜ\u001b9·\u009dæ\u009096Å)I¼8²þh\u0096&qí\u008ft\u008aÈ´]\u00adù¤Ío¥W\u009aÑ ¢'V-Ò\u001a\u0007¿ö5Kÿ\nÕÄy\n,'ò\u0007ß×¼$ì\u0002¹\u001c;H±";
                  var8 = "Ô\u009eöÎÜ\u001b9·\u009dæ\u009096Å)I¼8²þh\u0096&qí\u008ft\u008aÈ´]\u00adù¤Ío¥W\u009aÑ ¢'V-Ò\u001a\u0007¿ö5Kÿ\nÕÄy\n,'ò\u0007ß×¼$ì\u0002¹\u001c;H±"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7237;
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
            throw new RuntimeException("tl9", var10);
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
         throw new RuntimeException("tl9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
