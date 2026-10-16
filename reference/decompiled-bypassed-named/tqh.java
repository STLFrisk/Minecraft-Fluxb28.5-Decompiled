import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntitySkull;

public class tqh extends q9h {
   private static final gdz scw;
   private static final gdz z0a;
   private static final gdz i4g;
   private static final gdz zep;
   public static tqh mzj;
   private final mtg a96 = new mtg(0, 0, 64, 32);
   private final mtg tnu = new vtn();

   public void kvk(TileEntitySkull var1, double var2, double var4, double var6, float var8, int var9) {
      vt2 var10 = vt2.jw6(var1.hvh() & 7);
      this.ykr((float)var2, (float)var4, (float)var6, var10, (float)(var1.fqk() * 360) / 16.0F, var1.o4i(), var1.j34(), var9);
   }

   @Override
   public void q02(xv4 var1) {
      super.q02(var1);
      mzj = this;
   }

   public void ykr(float param1, float param2, float param3, vt2 param4, float param5, int param6, GameProfile param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 9
      // 005: aload 0
      // 006: getfield tqh.a96 Lmtg;
      // 009: astore 10
      // 00b: iload 8
      // 00d: iload 9
      // 00f: ifeq 05e
      // 012: iflt 055
      // 015: goto 01c
      // 018: invokestatic tqh.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getstatic tqh._oj [Lgdz;
      // 020: iload 8
      // 022: aaload
      // 023: invokevirtual tqh.g3j (Lgdz;)V
      // 026: sipush 5890
      // 029: invokestatic hzu.ah8 (I)V
      // 02c: invokestatic hzu.dp2 ()V
      // 02f: ldc 4.0
      // 031: nop
      // 032: fconst_2
      // 033: fconst_1
      // 034: invokestatic hzu.syc (FFF)V
      // 037: ldc 0.0625
      // 039: nop
      // 03a: ldc 0.0625
      // 03c: nop
      // 03d: ldc 0.0625
      // 03f: nop
      // 040: invokestatic hzu.a4k (FFF)V
      // 043: sipush 5888
      // 046: invokestatic hzu.ah8 (I)V
      // 049: iload 9
      // 04b: ifne 144
      // 04e: goto 055
      // 051: invokestatic tqh.a (Loov;)Loov;
      // 054: athrow
      // 055: iload 6
      // 057: goto 05e
      // 05a: invokestatic tqh.a (Loov;)Loov;
      // 05d: athrow
      // 05e: tableswitch 34 0 4 34 53 72 90 216
      // 080: aload 0
      // 081: getstatic tqh.scw Lgdz;
      // 084: invokevirtual tqh.g3j (Lgdz;)V
      // 087: iload 9
      // 089: ifne 144
      // 08c: goto 093
      // 08f: invokestatic tqh.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: getstatic tqh.z0a Lgdz;
      // 097: invokevirtual tqh.g3j (Lgdz;)V
      // 09a: iload 9
      // 09c: ifne 144
      // 09f: goto 0a6
      // 0a2: invokestatic tqh.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getstatic tqh.i4g Lgdz;
      // 0aa: invokevirtual tqh.g3j (Lgdz;)V
      // 0ad: aload 0
      // 0ae: getfield tqh.tnu Lmtg;
      // 0b1: astore 10
      // 0b3: iload 9
      // 0b5: ifne 144
      // 0b8: aload 0
      // 0b9: getfield tqh.tnu Lmtg;
      // 0bc: astore 10
      // 0be: invokestatic wip.s_2 ()Lgdz;
      // 0c1: astore 11
      // 0c3: iload 9
      // 0c5: ifeq 131
      // 0c8: aload 7
      // 0ca: ifnull 12b
      // 0cd: goto 0d4
      // 0d0: invokestatic tqh.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: invokestatic Minecraft.vz1 ()Lc05;
      // 0d7: astore 12
      // 0d9: aload 12
      // 0db: invokevirtual Minecraft.jsi ()Lyoe;
      // 0de: aload 7
      // 0e0: invokevirtual yoe.evg (Lcom/mojang/authlib/GameProfile;)Ljava/util/Map;
      // 0e3: astore 13
      // 0e5: iload 9
      // 0e7: ifeq 118
      // 0ea: aload 13
      // 0ec: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.SKIN Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 0ef: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0f4: ifeq 11d
      // 0f7: goto 0fe
      // 0fa: invokestatic tqh.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: aload 12
      // 100: invokevirtual Minecraft.jsi ()Lyoe;
      // 103: aload 13
      // 105: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.SKIN Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 108: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 10d: checkcast com/mojang/authlib/minecraft/MinecraftProfileTexture
      // 110: getstatic com/mojang/authlib/minecraft/MinecraftProfileTexture$Type.SKIN Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;
      // 113: invokevirtual yoe.a1t (Lcom/mojang/authlib/minecraft/MinecraftProfileTexture;Lcom/mojang/authlib/minecraft/MinecraftProfileTexture$Type;)Lgdz;
      // 116: astore 11
      // 118: iload 9
      // 11a: ifne 12b
      // 11d: aload 7
      // 11f: invokestatic ha9.z05 (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 122: astore 14
      // 124: aload 14
      // 126: invokestatic wip.lnt (Ljava/util/UUID;)Lgdz;
      // 129: astore 11
      // 12b: aload 0
      // 12c: aload 11
      // 12e: invokevirtual tqh.g3j (Lgdz;)V
      // 131: iload 9
      // 133: ifne 144
      // 136: aload 0
      // 137: getstatic tqh.zep Lgdz;
      // 13a: invokevirtual tqh.g3j (Lgdz;)V
      // 13d: goto 144
      // 140: invokestatic tqh.a (Loov;)Loov;
      // 143: athrow
      // 144: invokestatic hzu.dp2 ()V
      // 147: invokestatic hzu.o1b ()V
      // 14a: aload 4
      // 14c: getstatic vt2.rf3 Lvt2;
      // 14f: if_acmpeq 1ee
      // 152: getstatic tqh$1.znf [I
      // 155: aload 4
      // 157: invokevirtual vt2.ordinal ()I
      // 15a: iaload
      // 15b: tableswitch 119 1 4 33 63 91 119
      // 178: invokestatic tqh.a (Loov;)Loov;
      // 17b: athrow
      // 17c: fload 1
      // 17d: ldc 0.5
      // 17f: nop
      // 180: fadd
      // 181: fload 2
      // 182: ldc 0.25
      // 184: nop
      // 185: fadd
      // 186: fload 3
      // 187: ldc 0.74
      // 189: nop
      // 18a: fadd
      // 18b: invokestatic hzu.a4k (FFF)V
      // 18e: iload 9
      // 190: ifne 203
      // 193: goto 19a
      // 196: invokestatic tqh.a (Loov;)Loov;
      // 199: athrow
      // 19a: fload 1
      // 19b: ldc 0.5
      // 19d: nop
      // 19e: fadd
      // 19f: fload 2
      // 1a0: ldc 0.25
      // 1a2: nop
      // 1a3: fadd
      // 1a4: fload 3
      // 1a5: ldc 0.26
      // 1a7: nop
      // 1a8: fadd
      // 1a9: invokestatic hzu.a4k (FFF)V
      // 1ac: ldc 180.0
      // 1ae: nop
      // 1af: fstore 5
      // 1b1: iload 9
      // 1b3: ifne 203
      // 1b6: fload 1
      // 1b7: ldc 0.74
      // 1b9: nop
      // 1ba: fadd
      // 1bb: fload 2
      // 1bc: ldc 0.25
      // 1be: nop
      // 1bf: fadd
      // 1c0: fload 3
      // 1c1: ldc 0.5
      // 1c3: nop
      // 1c4: fadd
      // 1c5: invokestatic hzu.a4k (FFF)V
      // 1c8: ldc 270.0
      // 1ca: nop
      // 1cb: fstore 5
      // 1cd: iload 9
      // 1cf: ifne 203
      // 1d2: fload 1
      // 1d3: ldc 0.26
      // 1d5: nop
      // 1d6: fadd
      // 1d7: fload 2
      // 1d8: ldc 0.25
      // 1da: nop
      // 1db: fadd
      // 1dc: fload 3
      // 1dd: ldc 0.5
      // 1df: nop
      // 1e0: fadd
      // 1e1: invokestatic hzu.a4k (FFF)V
      // 1e4: ldc 90.0
      // 1e6: nop
      // 1e7: fstore 5
      // 1e9: iload 9
      // 1eb: ifne 203
      // 1ee: fload 1
      // 1ef: ldc 0.5
      // 1f1: nop
      // 1f2: fadd
      // 1f3: fload 2
      // 1f4: fload 3
      // 1f5: ldc 0.5
      // 1f7: nop
      // 1f8: fadd
      // 1f9: invokestatic hzu.a4k (FFF)V
      // 1fc: goto 203
      // 1ff: invokestatic tqh.a (Loov;)Loov;
      // 202: athrow
      // 203: ldc 0.0625
      // 205: nop
      // 206: fstore 11
      // 208: invokestatic hzu.ixc ()V
      // 20b: ldc -1.0
      // 20d: nop
      // 20e: ldc -1.0
      // 210: nop
      // 211: fconst_1
      // 212: invokestatic hzu.syc (FFF)V
      // 215: invokestatic hzu.if9 ()V
      // 218: aload 10
      // 21a: aconst_null
      // 21b: checkcast EntityLivingBase
      // 21e: fconst_0
      // 21f: fconst_0
      // 220: fconst_0
      // 221: fload 5
      // 223: fconst_0
      // 224: fload 11
      // 226: invokevirtual g6r.s_q (Li2h;FFFFFF)V
      // 229: invokestatic hzu.x3w ()V
      // 22c: iload 8
      // 22e: iload 9
      // 230: ifeq 250
      // 233: iflt 253
      // 236: goto 23d
      // 239: invokestatic tqh.a (Loov;)Loov;
      // 23c: athrow
      // 23d: sipush 5890
      // 240: invokestatic hzu.ah8 (I)V
      // 243: invokestatic hzu.x3w ()V
      // 246: sipush 5888
      // 249: goto 250
      // 24c: invokestatic tqh.a (Loov;)Loov;
      // 24f: athrow
      // 250: invokestatic hzu.ah8 (I)V
      // 253: return
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.kvk((TileEntitySkull)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1882415526140492444L, -757206584366258454L, MethodHandles.lookup().lookupClass()).a(194964872367427L);
      // $VF: monitorexit
      long var10 = var10000 ^ 88190446741370L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0016\u001d\u0011íá\u00035tùÄ\u008c\u0099c¾¦\u009c\u009aÁ1U®éÛù(+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0003(©,D´\u0018`{\u00137¡Ú`¿\tÙ\u0014~\u007f\u0081WªL";
      int var7 = "+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0016\u001d\u0011íá\u00035tùÄ\u008c\u0099c¾¦\u009c\u009aÁ1U®éÛù(+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0003(©,D´\u0018`{\u00137¡Ú`¿\tÙ\u0014~\u007f\u0081WªL"
         .length();
      char var4 = '(';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = b(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     scw = new gdz(var8[2]);
                     z0a = new gdz(var8[3]);
                     i4g = new gdz(var8[0]);
                     zep = new gdz(var8[1]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0002`.\u0002Û\u0082õm»\u0003o\u0081W\f¨wàÓ!é\u0018<r\u00100+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0002`.\u0002Û\u0082õm\u001e\u008cQàÓ\u0013õä\u0087W@ q*ÞU.e /2|\u008e°";
                  var7 = "+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0002`.\u0002Û\u0082õm»\u0003o\u0081W\f¨wàÓ!é\u0018<r\u00100+·\fê º\u0017Ì·t¿Ó¦É\u0087;\u0002`.\u0002Û\u0082õm\u001e\u008cQàÓ\u0013õä\u0087W@ q*ÞU.e /2|\u008e°"
                     .length();
                  var4 = '(';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
}
