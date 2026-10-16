package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class S20PacketEntityProperties implements mz2 {
   private int jsz;
   private final List lia = Lists.newArrayList();
   private static final long a;
   private static final String b;

   public S20PacketEntityProperties() {
   }

   public S20PacketEntityProperties(int var1, Collection var2) {
      this.jsz = var1;
      String var10000 = S14PacketEntity.b();
      Iterator var4 = var2.iterator();
      String var3 = var10000;

      while (var4.hasNext()) {
         _4o var5 = (_4o)var4.next();
         this.lia.add(new S20PacketEntityProperties$bw1(this, var5.vyz().ugh(), var5.zdx(), var5.mid()));
         if (var3 == null) {
            break;
         }
      }
   }

   @Override
   public void ajj(nfj var1) {
      long var2 = a ^ 49929397536798L;
      this.jsz = var1.gux();
      String var10000 = S14PacketEntity.b();
      int var5 = var1.readInt();
      String var4 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         String var7 = var1.oa5(64);
         double var8 = var1.readDouble();
         ArrayList var10 = Lists.newArrayList();
         int var11 = var1.gux();
         int var12 = 0;

         while (true) {
            if (var12 < var11) {
               UUID var13 = var1.ac2();

               try {
                  var10.add(new xk5(var13, b, var1.readDouble(), var1.readByte()));
                  var12++;
                  if (var4 == null) {
                     break;
                  }

                  if (var4 != null) {
                     continue;
                  }
               } catch (oov var14) {
                  throw a(var14);
               }
            }

            this.lia.add(new S20PacketEntityProperties$bw1(this, var7, var8, var10));
            var6++;
            break;
         }

         if (var4 == null) {
            break;
         }
      }
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.jsz);
      String var10000 = S14PacketEntity.b();
      var1.writeInt(this.lia.size());
      Iterator var3 = this.lia.iterator();
      String var2 = var10000;

      while (var3.hasNext()) {
         S20PacketEntityProperties$bw1 var4 = (S20PacketEntityProperties$bw1)var3.next();
         var1.p3z(var4.zpz());
         var1.writeDouble(var4.p76());
         var1.tao(var4.wa2().size());
         Iterator var5 = var4.wa2().iterator();

         while (true) {
            if (var5.hasNext()) {
               xk5 var6 = (xk5)var5.next();
               var1.n5q(var6.gac());
               var1.writeDouble(var6._2u());
               var1.writeByte(var6.zdp());
               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  continue;
               }
            }

            if (var2 == null) {
               return;
            }
            break;
         }
      }
   }

   public void o6f(jsv var1) {
      var1.zip(this);
   }

   public int kmq() {
      return this.jsz;
   }

   public List nev() {
      return this.lia;
   }

   @Override
   public void ito(yw3 var1) {
      this.o6f((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2804331383808581405L, 2176739567878183916L, MethodHandles.lookup().lookupClass()).a(226147661143599L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 112582688211295L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0094ª\u0018¤ßFýÉ,î36TÅ\u008f\u0000ìP\u0082È\u0018åLÆ\t«J8>+\u009e\u001e\u0080æÚu¦f\u0084$".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
