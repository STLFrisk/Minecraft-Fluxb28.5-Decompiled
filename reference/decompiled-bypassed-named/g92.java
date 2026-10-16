import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g92 {
   private static final Joiner xfq;
   private static final Function we5;
   private final e0x v1_;
   private final ImmutableList _xg;
   private final ImmutableList gf6;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public g92(e0x var1, xny[] var2) {
      this.v1_ = var1;
      Arrays.sort(var2, new g92$2(this));
      this._xg = ImmutableList.copyOf(var2);
      int var10000 = OpaquePredicate.c();
      LinkedHashMap var4 = Maps.newLinkedHashMap();
      int var3 = var10000;
      ArrayList var5 = Lists.newArrayList();
      Iterator var6 = hdl.ud4(this.fgr()).iterator();

      while (true) {
         if (var6.hasNext()) {
            List var7 = (List)var6.next();
            Map var8 = bpf.pwj(this._xg, var7);
            g92$tt8 var9 = new g92$tt8(var1, ImmutableMap.copyOf(var8), null);

            try {
               var4.put(var8, var9);
               var5.add(var9);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var11) {
               throw a(var11);
            }
         }

         var6 = var5.iterator();
         break;
      }

      while (true) {
         if (var6.hasNext()) {
            g92$tt8 var12 = (g92$tt8)var6.next();

            try {
               var12.ugw(var4);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var10) {
               throw a(var10);
            }
         }

         this.gf6 = ImmutableList.copyOf(var5);
         break;
      }
   }

   public ImmutableList k64() {
      return this.gf6;
   }

   private List fgr() {
      ArrayList var2 = Lists.newArrayList();
      int var10000 = OpaquePredicate.b();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < this._xg.size()) {
            try {
               var5 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.add(((xny)this._xg.get(var3)).isr());
               var3++;
               if (var1 != 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public zfz c32() {
      return (zfz)this.gf6.get(0);
   }

   public e0x m68() {
      return this.v1_;
   }

   public Collection o0r() {
      return this._xg;
   }

   @Override
   public String toString() {
      long var1 = a ^ 75741146791883L;
      return Objects.toStringHelper(this)
         .add(a<"k">(17220, 1732233372998125020L ^ var1), e0x.db8.csx(this.v1_))
         .add(a<"k">(20090, 7337122890868148451L ^ var1), Iterables.transform(this._xg, we5))
         .toString();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1757165737058708452L, -5926559562580882108L, MethodHandles.lookup().lookupClass()).a(34606649924262L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 65395201115051L;
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
      String var4 = "ÂUñ\u0093ìÏô´Ymæ\u0013á\u009e¥«âÜâ®4è9ï\u0014NQ:'ä.ù\u0010}ývFüCz\u0016\u00adá\t>\u0082\u000eÈ6\u0010Ô\u009a¤\u001c}×Fõ×\u0099Àù\tç';";
      int var6 = "ÂUñ\u0093ìÏô´Ymæ\u0013á\u009e¥«âÜâ®4è9ï\u0014NQ:'ä.ù\u0010}ývFüCz\u0016\u00adá\t>\u0082\u000eÈ6\u0010Ô\u009a¤\u001c}×Fõ×\u0099Àù\tç';"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            xfq = Joiner.on(a<"k">(26016, 4851664347467308891L ^ var9));
            we5 = new g92$1();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10528;
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
            throw new RuntimeException("g92", var10);
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
         throw new RuntimeException("g92" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
