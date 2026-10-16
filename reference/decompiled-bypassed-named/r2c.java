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

public class r2c extends ShaderHelper {
   public ShaderHelper f7d;
   private r2c$kgm oot;
   private final moh o8f;
   private final j09 t1d;
   private cm_ cxm;
   private cm_ b9v;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public r2c(ShaderHelper var1, moh var2, j09 var3) {
      this.f7d = var1;
      this.o8f = var2;
      this.t1d = var3;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 103011189269979L;
      this.khf.add(this.cxm = new cm_(100, this.dt7 / 2 - 155, this.o1e - 38, moh$_ru.ety, this.o8f.ycx(moh$_ru.ety)));
      this.khf.add(this.b9v = new cm_(6, this.dt7 / 2 - 155 + 160, this.o1e - 38, fc1.gx1(b<"r">(2056, 5392706906599434428L ^ var1), new Object[0])));
      this.oot = new r2c$kgm(this, this.f41);
      this.oot.x9x(7, 8);
   }

   @Override
   public void handleMouseInput() {
      super.handleMouseInput();
      this.oot.gzb();
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq d9
      // 0f: goto 16
      // 12: invokestatic r2c.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic r2c.a (Loov;)Loov;
      // 20: athrow
      // 21: lookupswitch 169 3 5 35 6 46 100 68
      // 44: iload 2
      // 45: ifeq d9
      // 48: goto 4f
      // 4b: invokestatic r2c.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield r2c.f41 Lc05;
      // 53: aload 0
      // 54: getfield r2c.f7d Lgbe;
      // 57: invokevirtual Minecraft.z2i (Lgbe;)V
      // 5a: iload 2
      // 5b: ifeq d9
      // 5e: goto 65
      // 61: invokestatic r2c.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 1
      // 66: iload 2
      // 67: ifne 95
      // 6a: goto 71
      // 6d: invokestatic r2c.a (Loov;)Loov;
      // 70: athrow
      // 71: instanceof cm_
      // 74: ifeq d9
      // 77: goto 7e
      // 7a: invokestatic r2c.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield r2c.o8f Lmoh;
      // 82: aload 1
      // 83: checkcast cm_
      // 86: invokevirtual cm_.t4j ()Lmoh$_ru;
      // 89: bipush 1
      // 8a: invokevirtual moh.d13 (Lmoh$_ru;I)V
      // 8d: aload 1
      // 8e: goto 95
      // 91: invokestatic r2c.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 0
      // 96: getfield r2c.o8f Lmoh;
      // 99: getstatic moh$_ru.ety Lmoh$_ru;
      // 9c: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 9f: putfield gt4.frg Ljava/lang/String;
      // a2: new eka
      // a5: dup
      // a6: aload 0
      // a7: getfield r2c.f41 Lc05;
      // aa: invokespecial eka.<init> (Lc05;)V
      // ad: astore 3
      // ae: aload 3
      // af: invokevirtual eka.x05 ()I
      // b2: istore 4
      // b4: aload 3
      // b5: invokevirtual eka.lrx ()I
      // b8: istore 5
      // ba: aload 0
      // bb: aload 0
      // bc: getfield r2c.f41 Lc05;
      // bf: iload 4
      // c1: iload 5
      // c3: invokevirtual r2c.kky (Lc05;II)V
      // c6: iload 2
      // c7: ifeq d9
      // ca: aload 0
      // cb: getfield r2c.oot Lr2c$kgm;
      // ce: aload 1
      // cf: invokevirtual r2c$kgm.ncl (Lgt4;)V
      // d2: goto d9
      // d5: invokestatic r2c.a (Loov;)Loov;
      // d8: athrow
      // d9: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 76873321479908L;
      this.oot.j46(var1, var2, var3);
      this.poi(this.fex, fc1.gx1(b<"r">(6535, 7273144619470184975L ^ var4), new Object[0]), this.dt7 / 2, 16, 16777215);
      this.poi(this.fex, "(" + fc1.gx1(b<"r">(1323, 5110834107896659618L ^ var4), new Object[0]) + ")", this.dt7 / 2, this.o1e - 56, 8421504);
      super.drawScreen(var1, var2, var3);
   }

   public static j09 gm9(r2c var0) {
      return var0.t1d;
   }

   public static moh i2o(r2c var0) {
      return var0.o8f;
   }

   public static cm_ at6(r2c var0) {
      return var0.b9v;
   }

   public static cm_ rvj(r2c var0) {
      return var0.cxm;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1783205657411620464L, -4361460607591560226L, MethodHandles.lookup().lookupClass()).a(232739493926267L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130415388292718L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "qª=G\u001a\u0092ÿ7n\u008c\u0085\u0019Zt2N0DÂÇ®\u000f\u0001ãx$\u0082òvpÙ\u008eyïô\u0088¼²\f9(²ÓóÞåÇ<àÌSi\rx\u008dÉÚÄHíòKjº\u001cXgöö%bËÈïó\u000f8\u0087\u0081 Ê\u0018¤Ë\u009a_óç\u0004¸~ç\u009aTRè\u0018\u000b7¶pÅÜxý\t";
      int var8 = "qª=G\u001a\u0092ÿ7n\u008c\u0085\u0019Zt2N0DÂÇ®\u000f\u0001ãx$\u0082òvpÙ\u008eyïô\u0088¼²\f9(²ÓóÞåÇ<àÌSi\rx\u008dÉÚÄHíòKjº\u001cXgöö%bËÈïó\u000f8\u0087\u0081 Ê\u0018¤Ë\u009a_óç\u0004¸~ç\u009aTRè\u0018\u000b7¶pÅÜxý\t"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23483;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("r2c", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("r2c" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
