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

public class uxj {
   public static uxj ogj;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void xeq(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic uxj.a J
      // 003: ldc2_w 96148252450301
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual erg.gn1 ()Lu7m;
      // 011: getstatic xbr.ogp Lu7m;
      // 014: iload 4
      // 016: ifeq 05f
      // 019: if_acmpne 045
      // 01c: goto 023
      // 01f: invokestatic uxj.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 0
      // 024: getfield uxj.gxl Lnet/minecraft/tileentity/TileEntityBanner;
      // 027: aload 1
      // 028: invokevirtual net/minecraft/tileentity/TileEntityBanner.m2b (Lerg;)V
      // 02b: getstatic xv4.b2r Lxv4;
      // 02e: aload 0
      // 02f: getfield uxj.gxl Lnet/minecraft/tileentity/TileEntityBanner;
      // 032: dconst_0
      // 033: dconst_0
      // 034: dconst_0
      // 035: fconst_0
      // 036: invokevirtual xv4.h74 (Lpyk;DDDF)V
      // 039: iload 4
      // 03b: ifne 22b
      // 03e: goto 045
      // 041: invokestatic uxj.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 1
      // 046: invokevirtual erg.gn1 ()Lu7m;
      // 049: iload 4
      // 04b: ifeq 1ba
      // 04e: goto 055
      // 051: invokestatic uxj.a (Loov;)Loov;
      // 054: athrow
      // 055: getstatic xbr.r9n Lu7m;
      // 058: goto 05f
      // 05b: invokestatic uxj.a (Loov;)Loov;
      // 05e: athrow
      // 05f: if_acmpne 1af
      // 062: aconst_null
      // 063: astore 5
      // 065: aload 1
      // 066: iload 4
      // 068: ifeq 080
      // 06b: invokevirtual erg.w8b ()Z
      // 06e: ifeq 161
      // 071: goto 078
      // 074: invokestatic uxj.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 1
      // 079: goto 080
      // 07c: invokestatic uxj.a (Loov;)Loov;
      // 07f: athrow
      // 080: invokevirtual erg.zso ()Lbdo;
      // 083: astore 6
      // 085: aload 6
      // 087: sipush 3169
      // 08a: ldc2_w 1932721722940969466
      // 08d: lload 2
      // 08e: lxor
      // 08f: invokedynamic j (IJ)Ljava/lang/String; bsm=uxj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: nop
      // 095: bipush 10
      // 097: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 09a: iload 4
      // 09c: ifeq 0d9
      // 09f: ifeq 0c4
      // 0a2: goto 0a9
      // 0a5: invokestatic uxj.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 6
      // 0ab: sipush 15073
      // 0ae: ldc2_w 3527464491510392699
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic j (IJ)Ljava/lang/String; bsm=uxj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 0bc: invokestatic j44.j31 (Lbdo;)Lcom/mojang/authlib/GameProfile;
      // 0bf: astore 5
      // 0c1: goto 161
      // 0c4: aload 6
      // 0c6: sipush 15073
      // 0c9: ldc2_w 3527464491510392699
      // 0cc: lload 2
      // 0cd: lxor
      // 0ce: invokedynamic j (IJ)Ljava/lang/String; bsm=uxj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: nop
      // 0d4: bipush 8
      // 0d6: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0d9: iload 4
      // 0db: ifeq 105
      // 0de: ifeq 161
      // 0e1: goto 0e8
      // 0e4: invokestatic uxj.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: aload 6
      // 0ea: sipush 15073
      // 0ed: ldc2_w 3527464491510392699
      // 0f0: lload 2
      // 0f1: lxor
      // 0f2: invokedynamic j (IJ)Ljava/lang/String; bsm=uxj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: nop
      // 0f8: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0fb: invokevirtual java/lang/String.length ()I
      // 0fe: goto 105
      // 101: invokestatic uxj.a (Loov;)Loov;
      // 104: athrow
      // 105: ifle 161
      // 108: new com/mojang/authlib/GameProfile
      // 10b: dup
      // 10c: aconst_null
      // 10d: checkcast java/util/UUID
      // 110: aload 6
      // 112: sipush 15073
      // 115: ldc2_w 3527464491510392699
      // 118: lload 2
      // 119: lxor
      // 11a: invokedynamic j (IJ)Ljava/lang/String; bsm=uxj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: nop
      // 120: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 123: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 126: astore 5
      // 128: aload 5
      // 12a: invokestatic net/minecraft/tileentity/TileEntitySkull.cms (Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;
      // 12d: astore 5
      // 12f: aload 6
      // 131: sipush 15073
      // 134: ldc2_w 3527464491510392699
      // 137: lload 2
      // 138: lxor
      // 139: invokedynamic j (IJ)Ljava/lang/String; bsm=uxj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: nop
      // 13f: invokevirtual bdo.bkn (Ljava/lang/String;)V
      // 142: aload 6
      // 144: sipush 15073
      // 147: ldc2_w 3527464491510392699
      // 14a: lload 2
      // 14b: lxor
      // 14c: invokedynamic j (IJ)Ljava/lang/String; bsm=uxj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: nop
      // 152: new bdo
      // 155: dup
      // 156: invokespecial bdo.<init> ()V
      // 159: aload 5
      // 15b: invokestatic j44.f9e (Lbdo;Lcom/mojang/authlib/GameProfile;)Lbdo;
      // 15e: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 161: getstatic tqh.mzj Ltqh;
      // 164: iload 4
      // 166: ifeq 193
      // 169: ifnull 1aa
      // 16c: goto 173
      // 16f: invokestatic uxj.a (Loov;)Loov;
      // 172: athrow
      // 173: invokestatic hzu.dp2 ()V
      // 176: ldc -0.5
      // 178: nop
      // 179: fconst_0
      // 17a: ldc -0.5
      // 17c: nop
      // 17d: invokestatic hzu.a4k (FFF)V
      // 180: fconst_2
      // 181: fconst_2
      // 182: fconst_2
      // 183: invokestatic hzu.syc (FFF)V
      // 186: invokestatic hzu.o1b ()V
      // 189: getstatic tqh.mzj Ltqh;
      // 18c: goto 193
      // 18f: invokestatic uxj.a (Loov;)Loov;
      // 192: athrow
      // 193: fconst_0
      // 194: fconst_0
      // 195: fconst_0
      // 196: getstatic vt2.rf3 Lvt2;
      // 199: fconst_0
      // 19a: aload 1
      // 19b: invokevirtual erg.j6_ ()I
      // 19e: aload 5
      // 1a0: bipush -1
      // 1a1: invokevirtual tqh.ykr (FFFLvt2;FILcom/mojang/authlib/GameProfile;I)V
      // 1a4: invokestatic hzu.gp4 ()V
      // 1a7: invokestatic hzu.x3w ()V
      // 1aa: iload 4
      // 1ac: ifne 22b
      // 1af: aload 1
      // 1b0: invokevirtual erg.gn1 ()Lu7m;
      // 1b3: goto 1ba
      // 1b6: invokestatic uxj.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 1bd: astore 5
      // 1bf: aload 5
      // 1c1: getstatic ox_.xoy Le0x;
      // 1c4: iload 4
      // 1c6: ifeq 1f9
      // 1c9: if_acmpne 1ed
      // 1cc: goto 1d3
      // 1cf: invokestatic uxj.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: getstatic xv4.b2r Lxv4;
      // 1d6: aload 0
      // 1d7: getfield uxj.ott Lnet/minecraft/tileentity/TileEntityEnderChest;
      // 1da: dconst_0
      // 1db: dconst_0
      // 1dc: dconst_0
      // 1dd: fconst_0
      // 1de: invokevirtual xv4.h74 (Lpyk;DDDF)V
      // 1e1: iload 4
      // 1e3: ifne 22b
      // 1e6: goto 1ed
      // 1e9: invokestatic uxj.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: aload 5
      // 1ef: getstatic ox_.wpv Le0x;
      // 1f2: goto 1f9
      // 1f5: invokestatic uxj.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: if_acmpne 216
      // 1fc: getstatic xv4.b2r Lxv4;
      // 1ff: aload 0
      // 200: getfield uxj.n_9 Lnet/minecraft/tileentity/TileEntityChest;
      // 203: dconst_0
      // 204: dconst_0
      // 205: dconst_0
      // 206: fconst_0
      // 207: invokevirtual xv4.h74 (Lpyk;DDDF)V
      // 20a: iload 4
      // 20c: ifne 22b
      // 20f: goto 216
      // 212: invokestatic uxj.a (Loov;)Loov;
      // 215: athrow
      // 216: getstatic xv4.b2r Lxv4;
      // 219: aload 0
      // 21a: getfield uxj.tzk Lnet/minecraft/tileentity/TileEntityChest;
      // 21d: dconst_0
      // 21e: dconst_0
      // 21f: dconst_0
      // 220: fconst_0
      // 221: invokevirtual xv4.h74 (Lpyk;DDDF)V
      // 224: goto 22b
      // 227: invokestatic uxj.a (Loov;)Loov;
      // 22a: athrow
      // 22b: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2535061731664350563L, -1960779075761685748L, MethodHandles.lookup().lookupClass()).a(23059925823762L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 74210164242075L;
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
      String var6 = "ú@å_Ðß@è\bX\u009c\u0018\u001bµ\u0011+*¾\u0000\u0002-õa·\u0018æëÓ´\u008b:R\"d¹\u0001¤.óUªµîÞ\u0013Î\u00871\u009e";
      int var8 = "ú@å_Ðß@è\bX\u009c\u0018\u001bµ\u0011+*¾\u0000\u0002-õa·\u0018æëÓ´\u008b:R\"d¹\u0001¤.óUªµîÞ\u0013Î\u00871\u009e".length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            ogj = new uxj();
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22136;
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
            throw new RuntimeException("uxj", var10);
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
         throw new RuntimeException("uxj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
