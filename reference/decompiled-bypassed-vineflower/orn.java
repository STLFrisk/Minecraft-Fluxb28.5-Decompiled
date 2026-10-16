import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class orn implements q3y {
   private static final Logger q4_;
   private static final Joiner dac;
   private final Map zuo = Maps.newHashMap();
   private final List duu = Lists.newArrayList();
   private final Set o_j = Sets.newLinkedHashSet();
   private final if1 bud;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public orn(if1 var1) {
      this.bud = var1;
   }

   public void h1l(g68 var1) {
      int var2 = t9d.c();

      for (String var4 : var1.olh()) {
         this.o_j.add(var4);
         cn9 var5 = (cn9)this.zuo.get(var4);

         cn9 var10000;
         label28: {
            label27: {
               try {
                  var10000 = var5;
                  if (var2 != 0) {
                     break label28;
                  }

                  if (var5 != null) {
                     break label27;
                  }
               } catch (oov var6) {
                  throw a(var6);
               }

               var5 = new cn9(this.bud);
               this.zuo.put(var4, var5);
            }

            var10000 = var5;
         }

         var10000.vu1(var1);
         if (var2 != 0) {
            break;
         }
      }
   }

   @Override
   public Set ugj() {
      return this.o_j;
   }

   @Override
   public yaa td5(gdz var1) {
      int var2 = t9d.c();
      y99 var3 = (y99)this.zuo.get(var1._a7());

      try {
         if (var2 != 0) {
            return var3.td5(var1);
         }

         if (var3 == null) {
            throw new FileNotFoundException(var1.toString());
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3.td5(var1);
   }

   @Override
   public List gc4(gdz var1) {
      int var2 = t9d.c();
      y99 var3 = (y99)this.zuo.get(var1._a7());

      try {
         if (var2 != 0) {
            return var3.gc4(var1);
         }

         if (var3 == null) {
            throw new FileNotFoundException(var1.toString());
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var3.gc4(var1);
   }

   private void jdp() {
      this.zuo.clear();
      this.o_j.clear();
   }

   @Override
   public void dlz(List var1) {
      long var2 = a ^ 86847757592681L;
      this.jdp();
      int var10000 = t9d.c();
      q4_.info(a<"x">(18137, 8133253152682456807L ^ var2) + dac.join(Iterables.transform(var1, new orn$1(this))));
      Iterator var5 = var1.iterator();
      int var4 = var10000;

      while (true) {
         if (var5.hasNext()) {
            g68 var6 = (g68)var5.next();

            try {
               this.h1l(var6);
               if (var4 != 0) {
                  break;
               }

               if (var4 == 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         this.ips();
         break;
      }
   }

   @Override
   public void x6z(lv1 var1) {
      this.duu.add(var1);
      var1.onResourceManagerReload(this);
   }

   private void ips() {
      int var1 = t9d.b();

      for (lv1 var3 : this.duu) {
         var3.onResourceManagerReload(this);
         if (var1 == 0) {
            break;
         }
      }
   }

   public Map xlg() {
      return this.zuo;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6632173150041855841L, 3992735833802358341L, MethodHandles.lookup().lookupClass()).a(112838610780385L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 63500909591147L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "ÜàáÜeàcpGÈ\u009d\u0011¿9Ú28\u0087\u0016×ÝÂ\u0000LÁ\u0013UD_\u008d#n\n\u0089ØØúsºw\u0011\u0005\u0017\u001eZ³xRkÌ\u0099\u009d \tz\u0096\u0011Û\u0088^r`Ò÷ú·ý\u001b5 %úì";
      int var6 = "ÜàáÜeàcpGÈ\u009d\u0011¿9Ú28\u0087\u0016×ÝÂ\u0000LÁ\u0013UD_\u008d#n\n\u0089ØØúsºw\u0011\u0005\u0017\u001eZ³xRkÌ\u0099\u009d \tz\u0096\u0011Û\u0088^r`Ò÷ú·ý\u001b5 %úì"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            q4_ = LogManager.getLogger();
            dac = Joiner.on(a<"x">(15484, 3325948815218859585L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3421;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("orn", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("orn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
