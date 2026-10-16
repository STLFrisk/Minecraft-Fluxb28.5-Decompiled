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
import net.minecraft.tileentity.TileEntityBanner;

public class esx extends rw8 {
   public static final qx_ enk;
   public static final _ku t4h;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public esx() {
      super(p3y.fdu);
      float var1 = 0.25F;
      float var2 = 1.0F;
      this.xl4(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var2, 0.5F + var1);
   }

   @Override
   public String ieu() {
      long var1 = b ^ 55232512325334L;
      return orr.zgh(b<"c">(29578, 8974049616053979516L ^ var1));
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public nh4 j54(t9d var1, mew var2) {
      this.c7i(var1, var2);
      return super.j54(var1, var2);
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean iwf(m5n var1, mew var2) {
      return true;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean jdk() {
      return true;
   }

   @Override
   public pyk ie9(t9d var1, int var2) {
      return new TileEntityBanner();
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return xbr.ogp;
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      return xbr.ogp;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void ix7(t9d var1, mew var2, zfz var3, float var4, int var5) {
      label25: {
         long var6 = b ^ 40796168898169L;
         int var8 = t9d.b();
         pyk var9 = var1.getTileEntity(var2);
         if (var9 instanceof TileEntityBanner) {
            erg var10 = new erg(xbr.ogp, 1, ((TileEntityBanner)var9).s29());
            bdo var11 = new bdo();

            try {
               var9.m2a(var11);
               var11.bkn("x");
               var11.bkn("y");
               var11.bkn("z");
               var11.bkn(b<"c">(31225, 2358724612261835681L ^ var6));
               var10.fvt(b<"c">(15253, 1215117010188513738L ^ var6), var11);
               ymu(var1, var2, var10);
               if (var8 != 0) {
                  break label25;
               }
            } catch (oov var14) {
               boolean var10001 = false;
               throw a(var14);
            }
         }

         try {
            super.ix7(var1, var2, var3, var4, var5);
         } catch (oov var13) {
            boolean var15 = false;
            throw a(var13);
         }
      }

      try {
         ;
      } catch (oov var12) {
         boolean var16 = false;
         throw a(var12);
      }
   }

   @Override
   public boolean ctq(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual esx.vpo (Lt9d;Lmew;)Z
      // 0a: iload 3
      // 0b: ifeq 25
      // 0e: ifne 37
      // 11: goto 18
      // 14: invokestatic esx.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokespecial rw8.ctq (Lt9d;Lmew;)Z
      // 1e: goto 25
      // 21: invokestatic esx.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 3
      // 26: ifeq 34
      // 29: ifeq 37
      // 2c: goto 33
      // 2f: invokestatic esx.a (Loov;)Loov;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 38
      // 37: bipush 0
      // 38: ireturn
   }

   @Override
   public void i4u(t9d param1, ha9 param2, mew param3, zfz param4, pyk param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic esx.b J
      // 03: ldc2_w 137839249243129
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic t9d.c ()I
      // 0c: istore 8
      // 0e: aload 5
      // 10: iload 8
      // 12: ifne 2b
      // 15: instanceof net/minecraft/tileentity/TileEntityBanner
      // 18: ifeq 7f
      // 1b: goto 22
      // 1e: invokestatic esx.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 5
      // 24: goto 2b
      // 27: invokestatic esx.a (Loov;)Loov;
      // 2a: athrow
      // 2b: checkcast net/minecraft/tileentity/TileEntityBanner
      // 2e: astore 9
      // 30: new erg
      // 33: dup
      // 34: getstatic xbr.ogp Lu7m;
      // 37: bipush 1
      // 38: aload 5
      // 3a: checkcast net/minecraft/tileentity/TileEntityBanner
      // 3d: invokevirtual net/minecraft/tileentity/TileEntityBanner.s29 ()I
      // 40: invokespecial erg.<init> (Lu7m;II)V
      // 43: astore 10
      // 45: new bdo
      // 48: dup
      // 49: invokespecial bdo.<init> ()V
      // 4c: astore 11
      // 4e: aload 11
      // 50: aload 9
      // 52: invokevirtual net/minecraft/tileentity/TileEntityBanner.s29 ()I
      // 55: aload 9
      // 57: invokevirtual net/minecraft/tileentity/TileEntityBanner.jj8 ()Lqhg;
      // 5a: invokestatic net/minecraft/tileentity/TileEntityBanner.ds4 (Lbdo;ILqhg;)V
      // 5d: aload 10
      // 5f: sipush 23117
      // 62: ldc2_w 7840597011088584080
      // 65: lload 6
      // 67: lxor
      // 68: invokedynamic c (IJ)Ljava/lang/String; bsm=esx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: aload 11
      // 70: invokevirtual erg.fvt (Ljava/lang/String;Lgdw;)V
      // 73: aload 1
      // 74: aload 3
      // 75: aload 10
      // 77: invokestatic esx.ymu (Lt9d;Lmew;Lerg;)V
      // 7a: iload 8
      // 7c: ifeq 93
      // 7f: aload 0
      // 80: aload 1
      // 81: aload 2
      // 82: aload 3
      // 83: aload 4
      // 85: aconst_null
      // 86: checkcast pyk
      // 89: invokespecial rw8.i4u (Lt9d;Lha9;Lmew;Lzfz;Lpyk;)V
      // 8c: goto 93
      // 8f: invokestatic esx.a (Loov;)Loov;
      // 92: athrow
      // 93: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8251209693072799741L, -868990705531815589L, MethodHandles.lookup().lookupClass()).a(264998511244096L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 67041445099246L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "P±\u0093ø\u0017n6\u0005H\t\u001aô{¾Ø.Êhµ?\u0017[Þ\u008bmt\u0093\u008d\u0017á\u0090\u008f\u0018\u008f}[=¾uÚ\u0018³ÏÚÝò×\u0092oCÚpÇIJoS\u0010½\u0083¿ë4ä1uc\u0010\u007f@yudê Ðå\u001côQPÞÈr\u008ar_^\nÉ\u008c\u009b\u0095+ÜôxKså\u0004ìiS\u0096²p";
      int var6 = "P±\u0093ø\u0017n6\u0005H\t\u001aô{¾Ø.Êhµ?\u0017[Þ\u008bmt\u0093\u008d\u0017á\u0090\u008f\u0018\u008f}[=¾uÚ\u0018³ÏÚÝò×\u0092oCÚpÇIJoS\u0010½\u0083¿ë4ä1uc\u0010\u007f@yudê Ðå\u001côQPÞÈr\u008ar_^\nÉ\u008c\u009b\u0095+ÜôxKså\u0004ìiS\u0096²p"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[6];
                     enk = qx_.q0o(b<"c">(20939, 1848216401376946946L ^ var9), vt2$unz.fzl);
                     t4h = _ku.wgl(b<"c">(13864, 7555376718839467235L ^ var9), 0, 15);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Mj\u0099?(\u009a\u001b\u0089#èCÃ\u0003-FI(ì-¶\fiñKØ\u008a¸WÙ\u0016íf\u009f\u001bÒÈk±³\u001bøCù`'Xb\u00adÒø=ÉÉËgâv";
                  var6 = "Mj\u0099?(\u009a\u001b\u0089#èCÃ\u0003-FI(ì-¶\fiñKØ\u008a¸WÙ\u0016íf\u009f\u001bÒÈk±³\u001bøCù`'Xb\u00adÒø=ÉÉËgâv".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 404;
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
            throw new RuntimeException("esx", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("esx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
