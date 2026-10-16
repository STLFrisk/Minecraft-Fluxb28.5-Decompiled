import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kf9 extends ShaderHelper {
   public ha_ dj4;
   public String von;
   public String zde;
   public String _m_;
   public int w7d;
   private static final long a;
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public kf9(ha_ var1, String var2, String var3, int var4) {
      long var5 = a ^ 80209547253381L;
      super();
      this.fx_ = Lists.newArrayList();
      this.dj4 = var1;
      this.von = var2;
      this.mve = var3;
      this.w7d = var4;
      this.zde = fc1.gx1(b<"l">(6262, 5878847361352174116L ^ var5), new Object[0]);
      this._m_ = fc1.gx1(b<"l">(14210, 5550344486293186001L ^ var5), new Object[0]);
   }

   public kf9(ha_ var1, String var2, String var3, String var4, String var5, int var6) {
      this.dj4 = var1;
      this.von = var2;
      this.mve = var3;
      this.zde = var4;
      this._m_ = var5;
      this.w7d = var6;
   }

   @Override
   public void initGui() {
      this.khf.add(new cm_(0, this.dt7 / 2 - 155, this.o1e / 6 + 96, this.zde));
      this.khf.add(new cm_(1, this.dt7 / 2 - 155 + 160, this.o1e / 6 + 96, this._m_));
      this.fx_.clear();
      this.fx_.addAll(this.fex.g8u(this.mve, this.dt7 - 50));
   }

   @Override
   public void actionPerformed(gt4 var1) {
      int var2 = OpaquePredicate.b();

      ha_ var10000;
      int var10001;
      label22: {
         label21: {
            try {
               var10000 = this.dj4;
               var10001 = var1._me;
               if (var2 == 0) {
                  break label22;
               }

               if (var1._me == 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 1;
      }

      var10000.confirmClicked((boolean)var10001, this.w7d);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.poi(this.fex, this.von, this.dt7 / 2, 70, -1);
      int var10000 = OpaquePredicate.c();
      int var5 = 90;
      int var4 = var10000;
      Iterator var6 = this.fx_.iterator();

      while (true) {
         if (var6.hasNext()) {
            String var7 = (String)var6.next();
            this.poi(this.fex, var7, this.dt7 / 2, var5, -1);
            var5 += this.fex.rr7;

            try {
               if (var4 != 0) {
                  break;
               }

               if (var4 == 0) {
                  continue;
               }
            } catch (oov var8) {
               throw a(var8);
            }
         }

         super.drawScreen(var1, var2, var3);
         break;
      }
   }

   public void g_0(int var1) {
      this.n3b = var1;
      int var10000 = OpaquePredicate.b();
      Iterator var3 = this.khf.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         gt4 var4 = (gt4)var3.next();
         var4.c9a = false;
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public void updateScreen() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial ShaderHelper.updateScreen ()V
      // 08: aload 0
      // 09: iload 1
      // 0a: ifeq 29
      // 0d: dup
      // 0e: getfield kf9.n3b I
      // 11: bipush 1
      // 12: isub
      // 13: dup_x1
      // 14: putfield kf9.n3b I
      // 17: ifne 4e
      // 1a: goto 21
      // 1d: invokestatic kf9.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: goto 29
      // 25: invokestatic kf9.a (Loov;)Loov;
      // 28: athrow
      // 29: getfield kf9.khf Ljava/util/List;
      // 2c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 31: astore 2
      // 32: aload 2
      // 33: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 38: ifeq 4e
      // 3b: aload 2
      // 3c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 41: checkcast gt4
      // 44: astore 3
      // 45: aload 3
      // 46: bipush 1
      // 47: putfield gt4.c9a Z
      // 4a: iload 1
      // 4b: ifne 32
      // 4e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7480657169266419276L, 5896615176920348123L, MethodHandles.lookup().lookupClass()).a(195839853164756L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 67442544036572L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "7\u0082U\u000e\u001f\b¸Àå;³\u0002.\u0081;®\u0010\n»Æ+«ã\u0086\u0002ê\u009eËÁ\u0099L¸f";
      int var8 = "7\u0082U\u000e\u001f\b¸Àå;³\u0002.\u0081;®\u0010\n»Æ+«ã\u0086\u0002ê\u009eËÁ\u0099L¸f".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12761;
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
            throw new RuntimeException("kf9", var10);
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
         h[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("kf9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
