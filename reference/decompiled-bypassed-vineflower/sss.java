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

public class sss extends j37 {
   private static final long h;
   private static final String[] y;
   private static final String[] z;
   private static final Map A = new HashMap(13);

   public sss(t9d var1) {
      super(var1);
      this.yxc(0.9F, 1.3F);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(1, new p1g(this, 2.0));
      this.r1d.tn8(2, new rg_(this, 1.0));
      this.r1d.tn8(3, new ttn(this, 1.25, xbr.iqq, false));
      this.r1d.tn8(4, new bun(this, 1.25));
      this.r1d.tn8(5, new _tb(this, 1.0));
      this.r1d.tn8(6, new bdq(this, ha9.class, 6.0F));
      this.r1d.tn8(7, new ov6(this));
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(10.0);
      this.dgt(m6d.w7i).zf7(0.2F);
   }

   @Override
   public String _n1() {
      long var1 = h ^ 108273865072111L;
      return f<"r">(1965, 8057728318702168917L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = h ^ 132869964763799L;
      return f<"r">(11677, 4799392514122583583L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = h ^ 78816751690969L;
      return f<"r">(15910, 3222883478053432297L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = h ^ 56987049065877L;
      this.lhu(f<"r">(17952, 6535115119857601185L ^ var3), 0.15F, 1.0F);
   }

   @Override
   public float o23() {
      return 0.4F;
   }

   @Override
   public u7m q4n() {
      return xbr.i8v;
   }

   @Override
   public void ir3(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield sss.z2d Ljava/util/Random;
      // 04: bipush 3
      // 05: invokevirtual java/util/Random.nextInt (I)I
      // 08: aload 0
      // 09: getfield sss.z2d Ljava/util/Random;
      // 0c: bipush 1
      // 0d: iload 2
      // 0e: iadd
      // 0f: invokevirtual java/util/Random.nextInt (I)I
      // 12: iadd
      // 13: istore 4
      // 15: invokestatic t9d.b ()I
      // 18: bipush 0
      // 19: istore 5
      // 1b: istore 3
      // 1c: iload 5
      // 1e: iload 4
      // 20: if_icmpge 3e
      // 23: aload 0
      // 24: getstatic xbr.i8v Lu7m;
      // 27: bipush 1
      // 28: invokevirtual sss.e70 (Lu7m;I)Lnvf;
      // 2b: pop
      // 2c: iinc 5 1
      // 2f: iload 3
      // 30: ifeq 55
      // 33: iload 3
      // 34: ifne 1c
      // 37: goto 3e
      // 3a: invokestatic sss.f (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield sss.z2d Ljava/util/Random;
      // 42: bipush 3
      // 43: invokevirtual java/util/Random.nextInt (I)I
      // 46: bipush 1
      // 47: iadd
      // 48: aload 0
      // 49: getfield sss.z2d Ljava/util/Random;
      // 4c: bipush 1
      // 4d: iload 2
      // 4e: iadd
      // 4f: invokevirtual java/util/Random.nextInt (I)I
      // 52: iadd
      // 53: istore 4
      // 55: bipush 0
      // 56: istore 5
      // 58: iload 5
      // 5a: iload 4
      // 5c: if_icmpge 9c
      // 5f: aload 0
      // 60: iload 3
      // 61: ifeq 8d
      // 64: invokevirtual sss.agj ()Z
      // 67: ifeq 85
      // 6a: goto 71
      // 6d: invokestatic sss.f (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: getstatic xbr.lzo Lu7m;
      // 75: bipush 1
      // 76: invokevirtual sss.e70 (Lu7m;I)Lnvf;
      // 79: pop
      // 7a: iload 3
      // 7b: ifne 95
      // 7e: goto 85
      // 81: invokestatic sss.f (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: goto 8d
      // 89: invokestatic sss.f (Loov;)Loov;
      // 8c: athrow
      // 8d: getstatic xbr.v8v Lu7m;
      // 90: bipush 1
      // 91: invokevirtual sss.e70 (Lu7m;I)Lnvf;
      // 94: pop
      // 95: iinc 5 1
      // 98: iload 3
      // 99: ifne 58
      // 9c: return
   }

   @Override
   public boolean hp6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield ha9.up_ Ljnq;
      // 08: invokevirtual jnq.dxs ()Lerg;
      // 0b: astore 3
      // 0c: aload 3
      // 0d: iload 2
      // 0e: ifeq 1c
      // 11: ifnull df
      // 14: goto 1b
      // 17: invokestatic sss.f (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 3
      // 1c: invokevirtual erg.gn1 ()Lu7m;
      // 1f: getstatic xbr.xxz Lu7m;
      // 22: if_acmpne df
      // 25: aload 1
      // 26: getfield ha9.lls Lpj2;
      // 29: getfield pj2.g40 Z
      // 2c: iload 2
      // 2d: ifeq e4
      // 30: goto 37
      // 33: invokestatic sss.f (Loov;)Loov;
      // 36: athrow
      // 37: ifne df
      // 3a: goto 41
      // 3d: invokestatic sss.f (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: invokevirtual sss.ejl ()Z
      // 45: iload 2
      // 46: ifeq e4
      // 49: goto 50
      // 4c: invokestatic sss.f (Loov;)Loov;
      // 4f: athrow
      // 50: ifne df
      // 53: goto 5a
      // 56: invokestatic sss.f (Loov;)Loov;
      // 59: athrow
      // 5a: aload 3
      // 5b: dup
      // 5c: getfield erg.qd2 I
      // 5f: dup_x1
      // 60: bipush 1
      // 61: isub
      // 62: putfield erg.qd2 I
      // 65: iload 2
      // 66: ifeq b6
      // 69: goto 70
      // 6c: invokestatic sss.f (Loov;)Loov;
      // 6f: athrow
      // 70: bipush 1
      // 71: if_icmpne 9e
      // 74: goto 7b
      // 77: invokestatic sss.f (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 1
      // 7c: getfield ha9.up_ Ljnq;
      // 7f: aload 1
      // 80: getfield ha9.up_ Ljnq;
      // 83: getfield jnq.nb5 I
      // 86: new erg
      // 89: dup
      // 8a: getstatic xbr.l9k Lu7m;
      // 8d: invokespecial erg.<init> (Lu7m;)V
      // 90: invokevirtual jnq.cxl (ILerg;)V
      // 93: iload 2
      // 94: ifne dd
      // 97: goto 9e
      // 9a: invokestatic sss.f (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 1
      // 9f: getfield ha9.up_ Ljnq;
      // a2: new erg
      // a5: dup
      // a6: getstatic xbr.l9k Lu7m;
      // a9: invokespecial erg.<init> (Lu7m;)V
      // ac: invokevirtual jnq.phd (Lerg;)Z
      // af: goto b6
      // b2: invokestatic sss.f (Loov;)Loov;
      // b5: athrow
      // b6: iload 2
      // b7: ifeq de
      // ba: ifne dd
      // bd: goto c4
      // c0: invokestatic sss.f (Loov;)Loov;
      // c3: athrow
      // c4: aload 1
      // c5: new erg
      // c8: dup
      // c9: getstatic xbr.l9k Lu7m;
      // cc: bipush 1
      // cd: bipush 0
      // ce: invokespecial erg.<init> (Lu7m;II)V
      // d1: bipush 0
      // d2: invokevirtual ha9.ejq (Lerg;Z)Lnvf;
      // d5: pop
      // d6: goto dd
      // d9: invokestatic sss.f (Loov;)Loov;
      // dc: athrow
      // dd: bipush 1
      // de: ireturn
      // df: aload 0
      // e0: aload 1
      // e1: invokespecial j37.hp6 (Lha9;)Z
      // e4: ireturn
   }

   public sss kv0(dms var1) {
      return new sss(this.oay);
   }

   @Override
   public float c5y() {
      return this.ikl;
   }

   @Override
   public dms kv0(dms var1) {
      return this.kv0(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7587930726915558528L, 8140700784012784121L, MethodHandles.lookup().lookupClass()).a(260472759171649L);
      // $VF: monitorexit
      h = var10000;
      long var0 = h ^ 132413750726451L;
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
      String var6 = "\u007f(fsWüü3ÌífÎÔ\u0091®6ô\u007f\u0019Va%ãP pÉ¦\u0094=3xÆ;þ2«WQF:»)fa>Ðø\t¼B²\u0004Ø¦ø_";
      int var8 = "\u007f(fsWüü3ÌífÎÔ\u0091®6ô\u007f\u0019Va%ãP pÉ¦\u0094=3xÆ;þ2«WQF:»)fa>Ðø\t¼B²\u0004Ø¦ø_".length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = g(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     y = var9;
                     z = new String[4];
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

                  var6 = "/0x\u0003\u0001ÑR&³y,s3\nP¨\u0080õ,@#\u0012Ì¼\u0018ÌÚ\u0018»Þ¾\u0090Ã.ñ\u001c£ft\u008d\u0084n±?$MúÔ¬";
                  var8 = "/0x\u0003\u0001ÑR&³y,s3\nP¨\u0080õ,@#\u0012Ì¼\u0018ÌÚ\u0018»Þ¾\u0090Ã.ñ\u001c£ft\u008d\u0084n±?$MúÔ¬".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov f(oov var0) {
      return var0;
   }

   private static String g(byte[] var0) {
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

   private static String f(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10979;
      if (z[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])A.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               A.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("sss", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = y[var5].getBytes("ISO-8859-1");
         z[var5] = g(((Cipher)var4[0]).doFinal(var9));
      }

      return z[var5];
   }

   private static Object f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("sss" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
