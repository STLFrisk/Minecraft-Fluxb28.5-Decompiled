import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class b7b extends izd {
   public static final h76 z1p;
   public static final zb_ qyo;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public b7b() {
      int var1 = t9d.c();
      super(p3y.zs8);
      zfz var2 = this._8_.c32();

      label25: {
         label24: {
            label23: {
               try {
                  if (var1 != 0) {
                     break label23;
                  }

                  if (!this.t7p()) {
                     break label24;
                  }
               } catch (oov var3) {
                  throw a(var3);
               }

               var2 = var2.zvi(z1p, false);
            }

            if (var1 == 0) {
               break label25;
            }
         }

         var2 = var2.zvi(_9x, izd$jc0.ct4);
      }

      this.y8l(var2.zvi(qyo, b7b$op3.sm3));
      this.i3l(uja.mqu);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 20112631840043L;
      return orr.zgh(this.abc() + b<"h">(25240, 989544404926742376L ^ var1));
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.ip2);
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return u7m.gfm(ox_.ip2);
   }

   @Override
   public String uud(int var1) {
      return super.abc() + "." + b7b$op3.wc8(var1).usc();
   }

   @Override
   public xny ptp() {
      return qyo;
   }

   @Override
   public Object ulk(erg var1) {
      return b7b$op3.wc8(var1.j6_() & 7);
   }

   @Override
   public void m1q(u7m var1, uja var2, List var3) {
      int var4 = t9d.c();
      if (var1 != u7m.gfm(ox_.k_0)) {
         for (b7b$op3 var8 : b7b$op3.values()) {
            var3.add(new erg(var1, 1, var8.tn1()));
            if (var4 != 0) {
               break;
            }
         }
      }
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual b7b.l4i ()Lzfz;
      // 08: getstatic b7b.qyo Lzb_;
      // 0b: iload 1
      // 0c: bipush 7
      // 0e: iand
      // 0f: invokestatic b7b$op3.wc8 (I)Lb7b$op3;
      // 12: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 17: astore 3
      // 18: aload 0
      // 19: invokevirtual b7b.t7p ()Z
      // 1c: ifeq 4e
      // 1f: aload 3
      // 20: getstatic b7b.z1p Lh76;
      // 23: iload 1
      // 24: bipush 8
      // 26: iand
      // 27: iload 2
      // 28: ifeq 3d
      // 2b: goto 32
      // 2e: invokestatic b7b.a (Loov;)Loov;
      // 31: athrow
      // 32: ifeq 40
      // 35: goto 3c
      // 38: invokestatic b7b.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 41
      // 40: bipush 0
      // 41: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 49: astore 3
      // 4a: iload 2
      // 4b: ifne 73
      // 4e: aload 3
      // 4f: getstatic b7b._9x Lzb_;
      // 52: iload 1
      // 53: bipush 8
      // 55: iand
      // 56: ifne 6a
      // 59: goto 60
      // 5c: invokestatic b7b.a (Loov;)Loov;
      // 5f: athrow
      // 60: getstatic izd$jc0.ct4 Lizd$jc0;
      // 63: goto 6d
      // 66: invokestatic b7b.a (Loov;)Loov;
      // 69: athrow
      // 6a: getstatic izd$jc0.l7i Lizd$jc0;
      // 6d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 72: astore 3
      // 73: aload 3
      // 74: areturn
   }

   @Override
   public int hvp(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic t9d.c ()I
      // 05: iload 3
      // 06: aload 1
      // 07: getstatic b7b.qyo Lzb_;
      // 0a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0f: checkcast b7b$op3
      // 12: invokevirtual b7b$op3.tn1 ()I
      // 15: ior
      // 16: istore 3
      // 17: istore 2
      // 18: aload 0
      // 19: invokevirtual b7b.t7p ()Z
      // 1c: iload 2
      // 1d: ifne 40
      // 20: ifeq 57
      // 23: goto 2a
      // 26: invokestatic b7b.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: getstatic b7b.z1p Lh76;
      // 2e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 33: checkcast java/lang/Boolean
      // 36: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 39: goto 40
      // 3c: invokestatic b7b.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 2
      // 41: ifne 73
      // 44: ifeq 72
      // 47: goto 4e
      // 4a: invokestatic b7b.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 3
      // 4f: bipush 8
      // 51: ior
      // 52: istore 3
      // 53: iload 2
      // 54: ifeq 72
      // 57: aload 1
      // 58: getstatic b7b._9x Lzb_;
      // 5b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 60: getstatic izd$jc0.l7i Lizd$jc0;
      // 63: if_acmpne 72
      // 66: goto 6d
      // 69: invokestatic b7b.a (Loov;)Loov;
      // 6c: athrow
      // 6d: iload 3
      // 6e: bipush 8
      // 70: ior
      // 71: istore 3
      // 72: iload 3
      // 73: ireturn
   }

   @Override
   public g92 oz5() {
      try {
         if (this.t7p()) {
            return new g92(this, new xny[]{z1p, qyo});
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return new g92(this, new xny[]{_9x, qyo});
   }

   @Override
   public _mi uoz(zfz var1) {
      return ((b7b$op3)var1.dil(qyo)).lk1();
   }

   @Override
   public int crg(zfz var1) {
      return ((b7b$op3)var1.dil(qyo)).tn1();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4609649948552845519L, -3450676196349035673L, MethodHandles.lookup().lookupClass()).a(158863100263768L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 82313470834994L;
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
      String var4 = "\u0011&\u0096æp\u008e\u0000þHÄ¨~§ÚYÄ\u0098ÊZp¥\u0003}#ñÔ\u0086à\u0006½ã\u0004\u008d>S\u0003\u0097°\u001bW ¥ôJ:QYë\u0018ó=ãÿ¿R\u008b£W\u0092¬ZsR+\u0085O\u0088Ì\u008e\u0002ô»ú\u0010m¦Ö;°Ó\u0006#QYl\u0002ôw\u000e0";
      int var6 = "\u0011&\u0096æp\u008e\u0000þHÄ¨~§ÚYÄ\u0098ÊZp¥\u0003}#ñÔ\u0086à\u0006½ã\u0004\u008d>S\u0003\u0097°\u001bW ¥ôJ:QYë\u0018ó=ãÿ¿R\u008b£W\u0092¬ZsR+\u0085O\u0088Ì\u008e\u0002ô»ú\u0010m¦Ö;°Ó\u0006#QYl\u0002ôw\u000e0"
         .length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = c(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            z1p = h76.d_1(b<"h">(19081, 2520687162530616161L ^ var9));
            qyo = zb_.pq4(b<"h">(16706, 8082244882829203625L ^ var9), b7b$op3.class);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26263;
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
            throw new RuntimeException("b7b", var10);
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
         throw new RuntimeException("b7b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
