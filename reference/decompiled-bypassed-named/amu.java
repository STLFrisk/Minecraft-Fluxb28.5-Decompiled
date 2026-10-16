import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class amu extends f8k {
   public static final h76 znu;
   public static final _ku hec;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public amu(boolean var1) {
      super(var1);
      this.y8l(this._8_.c32().zvi(em9, vt2.z9q).zvi(hec, 1).zvi(znu, false));
   }

   @Override
   public String ieu() {
      long var1 = b ^ 111047629225902L;
      return orr.zgh(b<"d">(19290, 3967854361711589861L ^ var1));
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      return var1.zvi(znu, this.vfl(var2, var3, var1));
   }

   @Override
   public boolean cl2(OpaquePredicate param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 9
      // 05: aload 4
      // 07: getfield ha9.lls Lpj2;
      // 0a: getfield pj2.x4a Z
      // 0d: iload 9
      // 0f: ifne 33
      // 12: ifne 22
      // 15: goto 1c
      // 18: invokestatic amu.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic amu.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 1
      // 23: aload 2
      // 24: aload 3
      // 25: getstatic amu.hec L_ku;
      // 28: invokeinterface zfz.dm4 (Lxny;)Lzfz; 2
      // 2d: bipush 3
      // 2e: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 31: pop
      // 32: bipush 1
      // 33: ireturn
   }

   @Override
   public int hqm(zfz var1) {
      return (Integer)var1.dil(hec) * 2;
   }

   @Override
   public zfz ip_(zfz var1) {
      Integer var2 = (Integer)var1.dil(hec);
      Boolean var3 = (Boolean)var1.dil(znu);
      vt2 var4 = (vt2)var1.dil(em9);
      return ox_.duh.l4i().zvi(em9, var4).zvi(hec, var2).zvi(znu, var3);
   }

   @Override
   public zfz woc(zfz var1) {
      Integer var2 = (Integer)var1.dil(hec);
      Boolean var3 = (Boolean)var1.dil(znu);
      vt2 var4 = (vt2)var1.dil(em9);
      return ox_.r0f.l4i().zvi(em9, var4).zvi(hec, var2).zvi(znu, var3);
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.us0;
   }

   @Override
   public u7m su9(OpaquePredicate var1, mew var2) {
      return xbr.us0;
   }

   @Override
   public boolean vfl(m5n var1, mew var2, zfz var3) {
      int var4 = OpaquePredicate.c();

      try {
         int var10000 = this.snu(var1, var2, var3);
         if (var4 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var5) {
         throw a(var5);
      }

      return (boolean)0;
   }

   @Override
   public boolean qi0(e0x var1) {
      return r25(var1);
   }

   @Override
   public void kyo(OpaquePredicate var1, mew var2, zfz var3, Random var4) {
      int var5 = OpaquePredicate.b();
      if (this.d5w) {
         vt2 var6 = (vt2)var3.dil(em9);
         double var7 = (double)((float)var2.getX() + 0.5F) + (double)(var4.nextFloat() - 0.5F) * 0.2;
         double var9 = (double)((float)var2.getY() + 0.4F) + (double)(var4.nextFloat() - 0.5F) * 0.2;
         double var11 = (double)((float)var2.getZ() + 0.5F) + (double)(var4.nextFloat() - 0.5F) * 0.2;
         float var13 = -5.0F;

         label23: {
            label22: {
               try {
                  if (var5 == 0) {
                     break label23;
                  }

                  if (!var4.nextBoolean()) {
                     break label22;
                  }
               } catch (oov var18) {
                  throw a(var18);
               }

               var13 = (float)((Integer)var3.dil(hec) * 2 - 1);
            }

            var13 /= 16.0F;
         }

         double var14 = (double)(var13 * (float)var6.n67());
         double var16 = (double)(var13 * (float)var6.ozy());
         var1.zvy(w_0.dyc, var7 + var14, var9, var11 + var16, 0.0, 0.0, 0.0, new int[0]);
      }
   }

   @Override
   public void b8f(OpaquePredicate var1, mew var2, zfz var3) {
      super.b8f(var1, var2, var3);
      this.fow(var1, var2, var3);
   }

   @Override
   public zfz kig(int var1) {
      return this.l4i().zvi(em9, vt2.bm6(var1)).zvi(znu, false).zvi(hec, 1 + (var1 >> 2));
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = 0;
      var2 |= ((vt2)var1.dil(em9)).tmy();
      return var2 | (Integer)var1.dil(hec) - 1 << 2;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{em9, hec, znu});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2658771222773621770L, 6678915477070562091L, MethodHandles.lookup().lookupClass()).a(261403592360007L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 30369939076580L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "\u0013×b2£Òå\u009cåØù\u001dÓzxÿ\u0004ð\u001a\u009a\u0017¼æ¤\u0010\u0003×Î\u0090g\u0097÷¿B\\I\u0002ÃPÒ.\u0010¸\u001f#w_¤¤\u0018Ñ¶x\u000b\u0091\u0012gï";
      int var6 = "\u0013×b2£Òå\u009cåØù\u001dÓzxÿ\u0004ð\u001a\u009a\u0017¼æ¤\u0010\u0003×Î\u0090g\u0097÷¿B\\I\u0002ÃPÒ.\u0010¸\u001f#w_¤¤\u0018Ñ¶x\u000b\u0091\u0012gï"
         .length();
      char var3 = 24;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = c(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            znu = h76.d_1(b<"d">(7217, 4091830655777367238L ^ var9));
            hec = _ku.wgl(b<"d">(6759, 407717771046412947L ^ var9), 1, 4);
            return;
         }

         var3 = var4.charAt(var2);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18904;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("amu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         h[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("amu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
