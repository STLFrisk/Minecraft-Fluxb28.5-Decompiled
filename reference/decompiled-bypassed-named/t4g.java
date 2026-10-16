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

@dr9$x0j(
   t2u = "enchant",
   io4 = {"<list/EnchantName> [level]"},
   hjc = "Add enchantments to items you have in hand."
)
public class t4g extends HwidProvider {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @Override
   public void xjl(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t4g.a J
      // 003: ldc2_w 112663043557530
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: arraylength
      // 00f: bipush 1
      // 010: iload 4
      // 012: ifeq 06f
      // 015: if_icmpne 059
      // 018: goto 01f
      // 01b: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 01e: athrow
      // 01f: aload 1
      // 020: bipush 0
      // 021: aaload
      // 022: sipush 3232
      // 025: ldc2_w 2603503647071918443
      // 028: lload 2
      // 029: lxor
      // 02a: invokedynamic j (IJ)Ljava/lang/String; bsm=t4g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: nop
      // 030: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 033: iload 4
      // 035: ifeq 06e
      // 038: goto 03f
      // 03b: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 03e: athrow
      // 03f: ifeq 059
      // 042: goto 049
      // 045: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 048: athrow
      // 049: aload 0
      // 04a: invokespecial t4g.y2g ()V
      // 04d: iload 4
      // 04f: ifne 120
      // 052: goto 059
      // 055: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 058: athrow
      // 059: aload 1
      // 05a: iload 4
      // 05c: ifeq 073
      // 05f: goto 066
      // 062: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 065: athrow
      // 066: arraylength
      // 067: goto 06e
      // 06a: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 06d: athrow
      // 06e: bipush 2
      // 06f: if_icmpne 115
      // 072: aload 1
      // 073: bipush 0
      // 074: aaload
      // 075: invokestatic vef.w19 (Ljava/lang/String;)Lvef;
      // 078: ifnonnull 084
      // 07b: aload 0
      // 07c: invokespecial t4g.y2g ()V
      // 07f: return
      // 080: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 083: athrow
      // 084: aload 0
      // 085: iload 4
      // 087: ifeq 0c1
      // 08a: aload 1
      // 08b: bipush 1
      // 08c: aaload
      // 08d: invokespecial t4g.qzh (Ljava/lang/String;)Z
      // 090: ifeq 0b9
      // 093: goto 09a
      // 096: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 099: athrow
      // 09a: aload 1
      // 09b: bipush 1
      // 09c: aaload
      // 09d: iload 4
      // 09f: ifeq 0c8
      // 0a2: goto 0a9
      // 0a5: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0a8: athrow
      // 0a9: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0ac: sipush 32767
      // 0af: if_icmple 0c5
      // 0b2: goto 0b9
      // 0b5: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: goto 0c1
      // 0bd: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 0c0: athrow
      // 0c1: invokevirtual t4g.dhs ()V
      // 0c4: return
      // 0c5: aload 1
      // 0c6: bipush 0
      // 0c7: aaload
      // 0c8: astore 5
      // 0ca: aload 1
      // 0cb: bipush 1
      // 0cc: aaload
      // 0cd: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0d0: istore 6
      // 0d2: aload 0
      // 0d3: getfield t4g.rpq Lc05;
      // 0d6: getfield Minecraft.vg8 Ll86;
      // 0d9: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 0dc: astore 7
      // 0de: aload 7
      // 0e0: aload 5
      // 0e2: invokestatic vef.w19 (Ljava/lang/String;)Lvef;
      // 0e5: iload 6
      // 0e7: invokevirtual erg.g7b (Lvef;I)V
      // 0ea: aload 0
      // 0eb: getfield t4g.rpq Lc05;
      // 0ee: getfield Minecraft.vg8 Ll86;
      // 0f1: getfield EntityPlayerSP.lq7 Lp_k;
      // 0f4: new net/minecraft/network/play/client/C10PacketCreativeInventoryAction
      // 0f7: dup
      // 0f8: bipush 36
      // 0fa: aload 0
      // 0fb: getfield t4g.rpq Lc05;
      // 0fe: getfield Minecraft.vg8 Ll86;
      // 101: getfield EntityPlayerSP.up_ Ljnq;
      // 104: getfield jnq.nb5 I
      // 107: iadd
      // 108: aload 7
      // 10a: invokespecial net/minecraft/network/play/client/C10PacketCreativeInventoryAction.<init> (ILerg;)V
      // 10d: invokevirtual p_k.sxi (Lmz2;)V
      // 110: iload 4
      // 112: ifne 120
      // 115: aload 0
      // 116: invokevirtual t4g.dhs ()V
      // 119: goto 120
      // 11c: invokestatic t4g.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 11f: athrow
      // 120: return
   }

   private void y2g() {
      long var1 = a ^ 107786339387312L;
      String var4 = "";
      int var10000 = OpaquePredicate.b();
      vef[] var5 = vef.ql6;
      int var6 = var5.length;
      int var3 = var10000;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            vef var8 = var5[var7];
            var4 = var4 + a<"j">(24297, 1544525817822168075L ^ var1) + var8.d8j() + a<"j">(21306, 3934548482405616089L ^ var1);

            try {
               var7++;
               if (var3 == 0) {
                  break;
               }

               if (var3 != 0) {
                  continue;
               }
            } catch (NumberFormatException var9) {
               throw a(var9);
            }
         }

         ncl.dob(var4);
         break;
      }
   }

   private boolean qzh(String var1) {
      try {
         Integer.parseInt(var1);
         return true;
      } catch (NumberFormatException var3) {
         return false;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5454987582491124571L, -2227660209844275786L, MethodHandles.lookup().lookupClass()).a(245097558409227L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4203274717988L;
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
      String var6 = "iGWñË;\u009a\u0019ð\u0080Ú|£¹'\u0082\u0010\u0096\u001864z\u001cïN\u009cR¾x\u0004:\u008aÆ\u0010\u0006\u009d´üÒ*9\u0082Ô\u0004½!2NðG";
      int var8 = "iGWñË;\u009a\u0019ð\u0080Ú|£¹'\u0082\u0010\u0096\u001864z\u001cïN\u009cR¾x\u0004:\u008aÆ\u0010\u0006\u009d´üÒ*9\u0082Ô\u0004½!2NðG".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25291;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("t4g", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("t4g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
