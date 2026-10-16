package net.minecraft.tileentity;

import com.google.gson.JsonParseException;
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
import net.minecraft.network.play.server.S33PacketUpdateSign;

public class TileEntitySign extends pyk {
   public final ekw[] lvt = new ekw[]{new tao(""), new tao(""), new tao(""), new tao("")};
   public int mjm = -1;
   private boolean l7v = true;
   private ha9 s8b;
   private final n_k q__ = new n_k();
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void m2a(bdo var1) {
      long var2 = a ^ 49027205700022L;
      super.m2a(var1);
      int[] var10000 = TileEntityBeacon$yv7.b();
      int var5 = 0;
      int[] var4 = var10000;

      while (true) {
         if (var5 < 4) {
            String var6 = ekw$szt.odg(this.lvt[var5]);

            try {
               var1.rjq(b<"w">(11363, 7294976492295318845L ^ var2) + (var5 + 1), var6);
               var5++;
               if (var4 != null) {
                  break;
               }

               if (var4 == null) {
                  continue;
               }
            } catch (JsonParseException var7) {
               throw a(var7);
            }
         }

         this.q__.xmn(var1);
         break;
      }
   }

   @Override
   public void agl(bdo var1) {
      long var2 = a ^ 100232875179370L;
      this.l7v = false;
      int[] var10000 = TileEntityBeacon$yv7.b();
      super.agl(var1);
      TileEntitySign$1 var5 = new TileEntitySign$1(this);
      int[] var4 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < 4) {
            String var7 = var1.u14(b<"w">(7320, 6487701574493419803L ^ var2) + (var6 + 1));

            try {
               label44: {
                  ekw var8 = ekw$szt.wnw(var7);

                  try {
                     label30: {
                        try {
                           this.lvt[var6] = ipm.yam(var5, var8, (EntityLivingBase)null);
                        } catch (uvb var10) {
                           break label30;
                        }

                        if (var4 != null) {
                           break;
                        }
                        break label44;
                     }
                  } catch (JsonParseException var11) {
                     throw a(var11);
                  }

                  this.lvt[var6] = var8;
               }
            } catch (JsonParseException var12) {
               this.lvt[var6] = new tao(var7);
            }

            var6++;
            if (var4 == null) {
               continue;
            }
         }

         this.q__.irz(var1);
         break;
      }
   }

   @Override
   public mz2 ptb() {
      ekw[] var1 = new ekw[4];
      System.arraycopy(this.lvt, 0, var1, 0, 4);
      return new S33PacketUpdateSign(this.yh_, this.al2, var1);
   }

   @Override
   public boolean v3u() {
      return true;
   }

   public boolean z41() {
      return this.l7v;
   }

   public void bf1(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 03: astore 2
      // 04: aload 0
      // 05: aload 2
      // 06: ifnonnull 20
      // 09: iload 1
      // 0a: putfield net/minecraft/tileentity/TileEntitySign.l7v Z
      // 0d: iload 1
      // 0e: ifne 24
      // 11: goto 18
      // 14: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1f: athrow
      // 20: aconst_null
      // 21: putfield net/minecraft/tileentity/TileEntitySign.s8b Lha9;
      // 24: return
   }

   public void hzf(ha9 var1) {
      this.s8b = var1;
   }

   public ha9 y37() {
      return this.s8b;
   }

   public boolean krq(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new net/minecraft/tileentity/TileEntitySign$2
      // 03: dup
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial net/minecraft/tileentity/TileEntitySign$2.<init> (Lnet/minecraft/tileentity/TileEntitySign;Lha9;)V
      // 09: astore 3
      // 0a: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0d: bipush 0
      // 0e: istore 4
      // 10: astore 2
      // 11: iload 4
      // 13: aload 0
      // 14: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 17: arraylength
      // 18: if_icmpge b4
      // 1b: aload 0
      // 1c: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 1f: iload 4
      // 21: aaload
      // 22: aload 2
      // 23: ifnonnull 3f
      // 26: ifnonnull 38
      // 29: goto 30
      // 2c: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 2f: athrow
      // 30: aconst_null
      // 31: goto 44
      // 34: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 37: athrow
      // 38: aload 0
      // 39: getfield net/minecraft/tileentity/TileEntitySign.lvt [Lekw;
      // 3c: iload 4
      // 3e: aaload
      // 3f: invokeinterface ekw.f4q ()Lpoy; 1
      // 44: astore 5
      // 46: aload 2
      // 47: ifnonnull b0
      // 4a: aload 5
      // 4c: ifnull ad
      // 4f: goto 56
      // 52: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 55: athrow
      // 56: aload 5
      // 58: invokevirtual poy.d6b ()Ltgr;
      // 5b: aload 2
      // 5c: ifnonnull 7c
      // 5f: goto 66
      // 62: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 65: athrow
      // 66: ifnull ad
      // 69: goto 70
      // 6c: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 6f: athrow
      // 70: aload 5
      // 72: invokevirtual poy.d6b ()Ltgr;
      // 75: goto 7c
      // 78: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 7b: athrow
      // 7c: astore 6
      // 7e: aload 2
      // 7f: ifnonnull b0
      // 82: aload 6
      // 84: invokevirtual tgr.vex ()Ltgr$a3_;
      // 87: getstatic tgr$a3_.qms Ltgr$a3_;
      // 8a: if_acmpne ad
      // 8d: goto 94
      // 90: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 93: athrow
      // 94: invokestatic vr1._0v ()Lvr1;
      // 97: invokevirtual vr1.rns ()Lb9a;
      // 9a: aload 3
      // 9b: aload 6
      // 9d: invokevirtual tgr.uxt ()Ljava/lang/String;
      // a0: invokeinterface b9a.q2n (Le7r;Ljava/lang/String;)I 3
      // a5: pop
      // a6: goto ad
      // a9: invokestatic net/minecraft/tileentity/TileEntitySign.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // ac: athrow
      // ad: iinc 4 1
      // b0: aload 2
      // b1: ifnull 11
      // b4: bipush 1
      // b5: ireturn
   }

   public n_k d2u() {
      return this.q__;
   }

   public static n_k hq1(TileEntitySign var0) {
      return var0.q__;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6293965919978968709L, -1192292801275638016L, MethodHandles.lookup().lookupClass()).a(213656165023283L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 69859339226074L;
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
      String var6 = "\u007f\rß,¼\u0000xaÔÞ\u0087W\u008d÷S:\u0010ï`ò)TãÙÅå\u008d\u0092<\u0085`×é";
      int var8 = "\u007f\rß,¼\u0000xaÔÞ\u0087W\u008d÷S:\u0010ï`ò)TãÙÅå\u008d\u0092<\u0085`×é".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static JsonParseException a(JsonParseException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20652;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntitySign", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntitySign" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
