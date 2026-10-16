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

public class yz4 extends SubEngine {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public yz4() {
      long var1 = a ^ 100119249138082L;
      super(a<"d">(8810, 1387878248330040056L ^ var1), a<"d">(16801, 2477337766485684530L ^ var1));
   }

   @EventHandler
   public void jp7(edg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield yz4.wyl Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: getfield EntityPlayerSP.hzp Li2h;
      // 0e: astore 3
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne 9b
      // 14: ifnull 8c
      // 17: goto 1e
      // 1a: invokestatic yz4.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield yz4.wyl Lc05;
      // 22: getfield Minecraft.oxn Lmoh;
      // 25: getfield moh.nfb Lm7l;
      // 28: getfield m7l.m7n Z
      // 2b: iload 2
      // 2c: ifne 75
      // 2f: goto 36
      // 32: invokestatic yz4.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 5d
      // 39: goto 40
      // 3c: invokestatic yz4.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 3
      // 41: getstatic Fly.ewf Lcrk;
      // 44: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 47: invokevirtual java/lang/Float.floatValue ()F
      // 4a: f2d
      // 4b: ldc2_w 0.5
      // 4e: dmul
      // 4f: putfield EntityLivingBase.mop D
      // 52: iload 2
      // 53: ifeq 8c
      // 56: goto 5d
      // 59: invokestatic yz4.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 3
      // 5e: iload 2
      // 5f: ifne 9b
      // 62: goto 69
      // 65: invokestatic yz4.a (Loov;)Loov;
      // 68: athrow
      // 69: getfield EntityLivingBase.mop D
      // 6c: dconst_0
      // 6d: dcmpg
      // 6e: goto 75
      // 71: invokestatic yz4.a (Loov;)Loov;
      // 74: athrow
      // 75: ifge 8c
      // 78: aload 3
      // 79: aload 3
      // 7a: getfield EntityLivingBase.mop D
      // 7d: dneg
      // 7e: ldc2_w 2.0
      // 81: ddiv
      // 82: putfield EntityLivingBase.mop D
      // 85: goto 8c
      // 88: invokestatic yz4.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 3
      // 8d: aload 0
      // 8e: getfield yz4.wyl Lc05;
      // 91: getfield Minecraft.vg8 Ll86;
      // 94: getfield EntityPlayerSP.x5k F
      // 97: putfield EntityLivingBase.x5k F
      // 9a: aload 3
      // 9b: dup
      // 9c: getfield EntityLivingBase.icv D
      // 9f: ldc2_w 10.0
      // a2: dadd
      // a3: putfield EntityLivingBase.icv D
      // a6: return
   }

   public void zzf(EntityLivingBase param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield yz4.wyl Lc05;
      // 004: getfield Minecraft.vg8 Ll86;
      // 007: getfield EntityPlayerSP.g9g Lboa;
      // 00a: getfield boa._mw F
      // 00d: f2d
      // 00e: dstore 5
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: aload 0
      // 014: getfield yz4.wyl Lc05;
      // 017: getfield Minecraft.vg8 Ll86;
      // 01a: getfield EntityPlayerSP.g9g Lboa;
      // 01d: getfield boa.lrp F
      // 020: f2d
      // 021: dstore 7
      // 023: istore 4
      // 025: aload 1
      // 026: getfield EntityLivingBase.x5k F
      // 029: fstore 9
      // 02b: dload 5
      // 02d: dconst_0
      // 02e: dcmpl
      // 02f: iload 4
      // 031: ifne 085
      // 034: ifne 06e
      // 037: goto 03e
      // 03a: invokestatic yz4.a (Loov;)Loov;
      // 03d: athrow
      // 03e: dload 7
      // 040: dconst_0
      // 041: dcmpl
      // 042: iload 4
      // 044: ifne 085
      // 047: goto 04e
      // 04a: invokestatic yz4.a (Loov;)Loov;
      // 04d: athrow
      // 04e: ifne 06e
      // 051: goto 058
      // 054: invokestatic yz4.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 1
      // 059: aload 1
      // 05a: dconst_0
      // 05b: dup2_x1
      // 05c: putfield EntityLivingBase.bw4 D
      // 05f: putfield EntityLivingBase.icv D
      // 062: iload 4
      // 064: ifeq 190
      // 067: goto 06e
      // 06a: invokestatic yz4.a (Loov;)Loov;
      // 06d: athrow
      // 06e: dload 5
      // 070: iload 4
      // 072: ifne 159
      // 075: goto 07c
      // 078: invokestatic yz4.a (Loov;)Loov;
      // 07b: athrow
      // 07c: dconst_0
      // 07d: dcmpl
      // 07e: goto 085
      // 081: invokestatic yz4.a (Loov;)Loov;
      // 084: athrow
      // 085: ifeq 14c
      // 088: dload 7
      // 08a: dconst_0
      // 08b: dcmpl
      // 08c: iload 4
      // 08e: ifne 0d9
      // 091: goto 098
      // 094: invokestatic yz4.a (Loov;)Loov;
      // 097: athrow
      // 098: ifle 0ce
      // 09b: goto 0a2
      // 09e: invokestatic yz4.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: fload 9
      // 0a4: dload 5
      // 0a6: dconst_0
      // 0a7: dcmpl
      // 0a8: iload 4
      // 0aa: ifne 0c0
      // 0ad: goto 0b4
      // 0b0: invokestatic yz4.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: ifle 0c3
      // 0b7: goto 0be
      // 0ba: invokestatic yz4.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: bipush -45
      // 0c0: goto 0c5
      // 0c3: bipush 45
      // 0c5: i2f
      // 0c6: fadd
      // 0c7: fstore 9
      // 0c9: iload 4
      // 0cb: ifeq 10f
      // 0ce: dload 7
      // 0d0: dconst_0
      // 0d1: dcmpg
      // 0d2: goto 0d9
      // 0d5: invokestatic yz4.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iload 4
      // 0db: ifne 116
      // 0de: ifge 10f
      // 0e1: goto 0e8
      // 0e4: invokestatic yz4.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: fload 9
      // 0ea: dload 5
      // 0ec: dconst_0
      // 0ed: dcmpl
      // 0ee: iload 4
      // 0f0: ifne 106
      // 0f3: goto 0fa
      // 0f6: invokestatic yz4.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: ifle 109
      // 0fd: goto 104
      // 100: invokestatic yz4.a (Loov;)Loov;
      // 103: athrow
      // 104: bipush 45
      // 106: goto 10b
      // 109: bipush -45
      // 10b: i2f
      // 10c: fadd
      // 10d: fstore 9
      // 10f: dconst_0
      // 110: dstore 7
      // 112: dload 5
      // 114: dconst_0
      // 115: dcmpl
      // 116: iload 4
      // 118: ifne 144
      // 11b: ifle 12d
      // 11e: goto 125
      // 121: invokestatic yz4.a (Loov;)Loov;
      // 124: athrow
      // 125: dconst_1
      // 126: dstore 5
      // 128: iload 4
      // 12a: ifeq 14c
      // 12d: dload 5
      // 12f: iload 4
      // 131: ifne 159
      // 134: goto 13b
      // 137: invokestatic yz4.a (Loov;)Loov;
      // 13a: athrow
      // 13b: dconst_0
      // 13c: dcmpg
      // 13d: goto 144
      // 140: invokestatic yz4.a (Loov;)Loov;
      // 143: athrow
      // 144: ifge 14c
      // 147: ldc2_w -1.0
      // 14a: dstore 5
      // 14c: fload 9
      // 14e: ldc 90.0
      // 150: nop
      // 151: fadd
      // 152: f2d
      // 153: invokestatic java/lang/Math.toRadians (D)D
      // 156: invokestatic java/lang/Math.cos (D)D
      // 159: dstore 10
      // 15b: fload 9
      // 15d: ldc 90.0
      // 15f: nop
      // 160: fadd
      // 161: f2d
      // 162: invokestatic java/lang/Math.toRadians (D)D
      // 165: invokestatic java/lang/Math.sin (D)D
      // 168: dstore 12
      // 16a: aload 1
      // 16b: dload 5
      // 16d: dload 2
      // 16e: dmul
      // 16f: dload 10
      // 171: dmul
      // 172: dload 7
      // 174: dload 2
      // 175: dmul
      // 176: dload 12
      // 178: dmul
      // 179: dadd
      // 17a: putfield EntityLivingBase.icv D
      // 17d: aload 1
      // 17e: dload 5
      // 180: dload 2
      // 181: dmul
      // 182: dload 12
      // 184: dmul
      // 185: dload 7
      // 187: dload 2
      // 188: dmul
      // 189: dload 10
      // 18b: dmul
      // 18c: dsub
      // 18d: putfield EntityLivingBase.bw4 D
      // 190: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6799277631748636838L, 6886380076386404440L, MethodHandles.lookup().lookupClass()).a(192851495216046L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 15819252098738L;
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
      String var6 = "´¡Î\u0097TZ)>}3\u0085\u0092ú^\u00847\u0010qäH\"\u0083}Ì7Wv\u009a9\u0094Ø\u0013Ò";
      int var8 = "´¡Î\u0097TZ)>}3\u0085\u0092ú^\u00847\u0010qäH\"\u0083}Ì7Wv\u009a9\u0094Ø\u0013Ò".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 856;
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
            throw new RuntimeException("yz4", var10);
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
         throw new RuntimeException("yz4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
