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

public final class r97$15 extends kea {
   private boolean a3h = true;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public erg lno(sdf param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic r97$15.a J
      // 003: ldc2_w 106635824847512
      // 006: lxor
      // 007: lstore 3
      // 008: aload 1
      // 009: invokeinterface sdf.acz ()Lt9d; 1
      // 00e: astore 6
      // 010: aload 1
      // 011: invokeinterface sdf.lcq ()I 1
      // 016: invokestatic okn.dwc (I)Lvt2;
      // 019: astore 7
      // 01b: invokestatic t9d.b ()I
      // 01e: aload 1
      // 01f: invokeinterface sdf.taq ()Lmew; 1
      // 024: aload 7
      // 026: invokevirtual mew.offset (Lvt2;)Lmew;
      // 029: astore 8
      // 02b: getstatic ox_.hvd Lpld;
      // 02e: astore 9
      // 030: istore 5
      // 032: aload 6
      // 034: aload 8
      // 036: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 039: iload 5
      // 03b: ifeq 059
      // 03e: ifeq 1da
      // 041: goto 048
      // 044: invokestatic r97$15.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 9
      // 04a: aload 6
      // 04c: aload 8
      // 04e: aload 2
      // 04f: invokevirtual pld.hin (Lt9d;Lmew;Lerg;)Z
      // 052: goto 059
      // 055: invokestatic r97$15.a (Loov;)Loov;
      // 058: athrow
      // 059: iload 5
      // 05b: ifeq 074
      // 05e: ifeq 1da
      // 061: goto 068
      // 064: invokestatic r97$15.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 6
      // 06a: getfield t9d.v0f Z
      // 06d: goto 074
      // 070: invokestatic r97$15.a (Loov;)Loov;
      // 073: athrow
      // 074: iload 5
      // 076: ifeq 0a2
      // 079: ifne 1e6
      // 07c: goto 083
      // 07f: invokestatic r97$15.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 6
      // 085: aload 8
      // 087: aload 9
      // 089: invokevirtual pld.l4i ()Lzfz;
      // 08c: getstatic pld.skr Lqx_;
      // 08f: getstatic vt2.rf3 Lvt2;
      // 092: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 097: bipush 3
      // 098: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 09b: goto 0a2
      // 09e: invokestatic r97$15.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: pop
      // 0a3: aload 6
      // 0a5: aload 8
      // 0a7: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 0aa: astore 10
      // 0ac: iload 5
      // 0ae: ifeq 1d5
      // 0b1: aload 10
      // 0b3: instanceof net/minecraft/tileentity/TileEntitySkull
      // 0b6: ifeq 1cb
      // 0b9: goto 0c0
      // 0bc: invokestatic r97$15.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 2
      // 0c1: invokevirtual erg.j6_ ()I
      // 0c4: bipush 3
      // 0c5: if_icmpne 197
      // 0c8: goto 0cf
      // 0cb: invokestatic r97$15.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: aconst_null
      // 0d0: astore 11
      // 0d2: aload 2
      // 0d3: iload 5
      // 0d5: ifeq 0ed
      // 0d8: invokevirtual erg.w8b ()Z
      // 0db: ifeq 188
      // 0de: goto 0e5
      // 0e1: invokestatic r97$15.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 2
      // 0e6: goto 0ed
      // 0e9: invokestatic r97$15.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: invokevirtual erg.zso ()Lbdo;
      // 0f0: astore 12
      // 0f2: aload 12
      // 0f4: sipush 30787
      // 0f7: ldc2_w 834048919455558457
      // 0fa: lload 3
      // 0fb: lxor
      // 0fc: invokedynamic b (IJ)Ljava/lang/String; bsm=r97$15.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: bipush 10
      // 104: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 107: iload 5
      // 109: ifeq 152
      // 10c: ifeq 131
      // 10f: goto 116
      // 112: invokestatic r97$15.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 12
      // 118: sipush 28778
      // 11b: ldc2_w 4788283977592562449
      // 11e: lload 3
      // 11f: lxor
      // 120: invokedynamic b (IJ)Ljava/lang/String; bsm=r97$15.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: nop
      // 126: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 129: invokestatic j44.j31 (Lbdo;)Lcom/mojang/authlib/GameProfile;
      // 12c: astore 11
      // 12e: goto 188
      // 131: aload 12
      // 133: sipush 28778
      // 136: ldc2_w 4788283977592562449
      // 139: lload 3
      // 13a: lxor
      // 13b: invokedynamic b (IJ)Ljava/lang/String; bsm=r97$15.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: nop
      // 141: iload 5
      // 143: ifeq 16c
      // 146: bipush 8
      // 148: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 14b: goto 152
      // 14e: invokestatic r97$15.a (Loov;)Loov;
      // 151: athrow
      // 152: ifeq 188
      // 155: aload 12
      // 157: sipush 28778
      // 15a: ldc2_w 4788283977592562449
      // 15d: lload 3
      // 15e: lxor
      // 15f: invokedynamic b (IJ)Ljava/lang/String; bsm=r97$15.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: nop
      // 165: goto 16c
      // 168: invokestatic r97$15.a (Loov;)Loov;
      // 16b: athrow
      // 16c: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 16f: astore 13
      // 171: aload 13
      // 173: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 176: ifne 188
      // 179: new com/mojang/authlib/GameProfile
      // 17c: dup
      // 17d: aconst_null
      // 17e: checkcast java/util/UUID
      // 181: aload 13
      // 183: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 186: astore 11
      // 188: aload 10
      // 18a: checkcast net/minecraft/tileentity/TileEntitySkull
      // 18d: aload 11
      // 18f: invokevirtual net/minecraft/tileentity/TileEntitySkull.e5x (Lcom/mojang/authlib/GameProfile;)V
      // 192: iload 5
      // 194: ifne 1aa
      // 197: aload 10
      // 199: checkcast net/minecraft/tileentity/TileEntitySkull
      // 19c: aload 2
      // 19d: invokevirtual erg.j6_ ()I
      // 1a0: invokevirtual net/minecraft/tileentity/TileEntitySkull.sjx (I)V
      // 1a3: goto 1aa
      // 1a6: invokestatic r97$15.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: aload 10
      // 1ac: checkcast net/minecraft/tileentity/TileEntitySkull
      // 1af: aload 7
      // 1b1: invokevirtual vt2.b4b ()Lvt2;
      // 1b4: invokevirtual vt2.tmy ()I
      // 1b7: bipush 4
      // 1b8: imul
      // 1b9: invokevirtual net/minecraft/tileentity/TileEntitySkull.koc (I)V
      // 1bc: getstatic ox_.hvd Lpld;
      // 1bf: aload 6
      // 1c1: aload 8
      // 1c3: aload 10
      // 1c5: checkcast net/minecraft/tileentity/TileEntitySkull
      // 1c8: invokevirtual pld.i4n (Lt9d;Lmew;Lnet/minecraft/tileentity/TileEntitySkull;)V
      // 1cb: aload 2
      // 1cc: dup
      // 1cd: getfield erg.qd2 I
      // 1d0: bipush 1
      // 1d1: isub
      // 1d2: putfield erg.qd2 I
      // 1d5: iload 5
      // 1d7: ifne 1e6
      // 1da: aload 0
      // 1db: bipush 0
      // 1dc: putfield r97$15.a3h Z
      // 1df: goto 1e6
      // 1e2: invokestatic r97$15.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: aload 2
      // 1e7: areturn
   }

   @Override
   public void d_l(sdf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield r97$15.a3h Z
      // 08: ifeq 29
      // 0b: aload 1
      // 0c: invokeinterface sdf.acz ()Lt9d; 1
      // 11: sipush 1000
      // 14: aload 1
      // 15: invokeinterface sdf.taq ()Lmew; 1
      // 1a: bipush 0
      // 1b: invokevirtual t9d.qca (ILmew;I)V
      // 1e: iload 2
      // 1f: ifeq 43
      // 22: goto 29
      // 25: invokestatic r97$15.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 1
      // 2a: invokeinterface sdf.acz ()Lt9d; 1
      // 2f: sipush 1001
      // 32: aload 1
      // 33: invokeinterface sdf.taq ()Lmew; 1
      // 38: bipush 0
      // 39: invokevirtual t9d.qca (ILmew;I)V
      // 3c: goto 43
      // 3f: invokestatic r97$15.a (Loov;)Loov;
      // 42: athrow
      // 43: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6512861940039130231L, 3951128559132660632L, MethodHandles.lookup().lookupClass()).a(50826727629489L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 86734805488551L;
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
      String var6 = "\u0010f÷çh\u008b\u009cp¿2v\u0083;\u008b\u0084Ò)àg©\u0014NÁÇE\u00ad3\u0082þñ\u008fc \u009e«Q+B«ßù\u00842ïßÈÖã6¤Ö¸N\u0003u\u0087²ý\u0095ïa\u0012\u008fÞb";
      int var8 = "\u0010f÷çh\u008b\u009cp¿2v\u0083;\u008b\u0084Ò)àg©\u0014NÁÇE\u00ad3\u0082þñ\u008fc \u009e«Q+B«ßù\u00842ïßÈÖã6¤Ö¸N\u0003u\u0087²ý\u0095ïa\u0012\u008fÞb"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6148;
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
            throw new RuntimeException("r97$15", var10);
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
         throw new RuntimeException("r97$15" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
