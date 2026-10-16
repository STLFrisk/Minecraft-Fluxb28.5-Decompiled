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

public class xt9 extends SubEngine {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public xt9() {
      long var1 = a ^ 33527206514769L;
      super(a<"u">(25412, 4641265877187195532L ^ var1), a<"u">(9929, 5102239266613114624L ^ var1));
      this.gpi = 5.0;
      this.w4l = 1;
      this.h92 = 0.1873;
   }

   @Override
   public void onUpdate() {
      super.onUpdate();
      this.w4l = 1;
      this.h92 = 0.1873;
      this.z0z = false;
      this.wyl.z8v().qeu = 1.0F;
   }

   @Override
   public void onRender() {
      super.onRender();
      this.wyl.gze.qeu = 1.0F;
      this.h92 = 0.1873;
      this.rhi = 0.0;
      this.w4l = 4;
      this.z0z = false;
      this.wyl.z8v().qeu = 1.0F;
   }

   @EventHandler
   public void tdw(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield xt9.wyl Lc05;
      // 008: invokevirtual Minecraft.z8v ()Laba;
      // 00b: fconst_1
      // 00c: putfield aba.qeu F
      // 00f: aload 0
      // 010: getfield xt9.wyl Lc05;
      // 013: getfield Minecraft.vg8 Ll86;
      // 016: getfield EntityPlayerSP.kfp D
      // 019: aload 0
      // 01a: getfield xt9.wyl Lc05;
      // 01d: getfield Minecraft.vg8 Ll86;
      // 020: getfield EntityPlayerSP.kfp D
      // 023: d2i
      // 024: i2d
      // 025: dsub
      // 026: bipush 3
      // 027: invokestatic rak.meb (DI)D
      // 02a: ldc2_w 0.41
      // 02d: bipush 3
      // 02e: invokestatic rak.meb (DI)D
      // 031: dcmpl
      // 032: iload 2
      // 033: ifne 05e
      // 036: ifne 052
      // 039: goto 040
      // 03c: invokestatic xt9.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield xt9.wyl Lc05;
      // 044: getfield Minecraft.vg8 Ll86;
      // 047: dconst_0
      // 048: putfield EntityPlayerSP.mop D
      // 04b: goto 052
      // 04e: invokestatic xt9.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 0
      // 053: getfield xt9.wyl Lc05;
      // 056: getfield Minecraft.vg8 Ll86;
      // 059: getfield EntityPlayerSP.z66 F
      // 05c: fconst_0
      // 05d: fcmpg
      // 05e: iload 2
      // 05f: ifne 0bc
      // 062: ifge 099
      // 065: goto 06c
      // 068: invokestatic xt9.a (Loov;)Loov;
      // 06b: athrow
      // 06c: aload 0
      // 06d: getfield xt9.wyl Lc05;
      // 070: getfield Minecraft.vg8 Ll86;
      // 073: getfield EntityPlayerSP.ooc F
      // 076: fconst_0
      // 077: fcmpg
      // 078: iload 2
      // 079: ifne 0bc
      // 07c: goto 083
      // 07f: invokestatic xt9.a (Loov;)Loov;
      // 082: athrow
      // 083: ifge 099
      // 086: goto 08d
      // 089: invokestatic xt9.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: bipush 1
      // 08f: putfield xt9.w4l I
      // 092: goto 099
      // 095: invokestatic xt9.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 0
      // 09a: getfield xt9.wyl Lc05;
      // 09d: getfield Minecraft.vg8 Ll86;
      // 0a0: getfield EntityPlayerSP.kfp D
      // 0a3: aload 0
      // 0a4: getfield xt9.wyl Lc05;
      // 0a7: getfield Minecraft.vg8 Ll86;
      // 0aa: getfield EntityPlayerSP.kfp D
      // 0ad: d2i
      // 0ae: i2d
      // 0af: dsub
      // 0b0: bipush 3
      // 0b1: invokestatic rak.b5b (DI)D
      // 0b4: ldc2_w 0.943
      // 0b7: bipush 3
      // 0b8: invokestatic rak.b5b (DI)D
      // 0bb: dcmpl
      // 0bc: iload 2
      // 0bd: ifne 0e0
      // 0c0: ifne 0dc
      // 0c3: goto 0ca
      // 0c6: invokestatic xt9.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: getfield xt9.wyl Lc05;
      // 0ce: getfield Minecraft.vg8 Ll86;
      // 0d1: dconst_0
      // 0d2: putfield EntityPlayerSP.mop D
      // 0d5: goto 0dc
      // 0d8: invokestatic xt9.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: getfield xt9.w4l I
      // 0e0: bipush 1
      // 0e1: iload 2
      // 0e2: ifne 17c
      // 0e5: if_icmpne 170
      // 0e8: goto 0ef
      // 0eb: invokestatic xt9.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield xt9.wyl Lc05;
      // 0f3: getfield Minecraft.vg8 Ll86;
      // 0f6: getfield EntityPlayerSP.ooc F
      // 0f9: fconst_0
      // 0fa: fcmpl
      // 0fb: iload 2
      // 0fc: ifne 142
      // 0ff: goto 106
      // 102: invokestatic xt9.a (Loov;)Loov;
      // 105: athrow
      // 106: ifne 131
      // 109: goto 110
      // 10c: invokestatic xt9.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: getfield xt9.wyl Lc05;
      // 114: getfield Minecraft.vg8 Ll86;
      // 117: getfield EntityPlayerSP.z66 F
      // 11a: fconst_0
      // 11b: fcmpl
      // 11c: iload 2
      // 11d: ifne 17b
      // 120: goto 127
      // 123: invokestatic xt9.a (Loov;)Loov;
      // 126: athrow
      // 127: ifeq 170
      // 12a: goto 131
      // 12d: invokestatic xt9.a (Loov;)Loov;
      // 130: athrow
      // 131: aload 0
      // 132: getfield xt9.wyl Lc05;
      // 135: getfield Minecraft.vg8 Ll86;
      // 138: getfield EntityPlayerSP.fcv Z
      // 13b: goto 142
      // 13e: invokestatic xt9.a (Loov;)Loov;
      // 141: athrow
      // 142: iload 2
      // 143: ifne 17b
      // 146: ifeq 170
      // 149: goto 150
      // 14c: invokestatic xt9.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 0
      // 151: bipush 2
      // 152: putfield xt9.w4l I
      // 155: aload 0
      // 156: aload 0
      // 157: getfield xt9.gpi D
      // 15a: ldc2_w 0.1873
      // 15d: dmul
      // 15e: ldc2_w 0.01
      // 161: dsub
      // 162: putfield xt9.h92 D
      // 165: iload 2
      // 166: ifeq 304
      // 169: goto 170
      // 16c: invokestatic xt9.a (Loov;)Loov;
      // 16f: athrow
      // 170: aload 0
      // 171: getfield xt9.w4l I
      // 174: goto 17b
      // 177: invokestatic xt9.a (Loov;)Loov;
      // 17a: athrow
      // 17b: bipush 2
      // 17c: iload 2
      // 17d: ifne 1cb
      // 180: if_icmpne 1bf
      // 183: goto 18a
      // 186: invokestatic xt9.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 0
      // 18b: bipush 3
      // 18c: putfield xt9.w4l I
      // 18f: aload 0
      // 190: getfield xt9.wyl Lc05;
      // 193: getfield Minecraft.vg8 Ll86;
      // 196: ldc2_w 0.399
      // 199: putfield EntityPlayerSP.mop D
      // 19c: aload 1
      // 19d: ldc2_w 0.399
      // 1a0: putfield _qa.wam D
      // 1a3: aload 0
      // 1a4: dup
      // 1a5: getfield xt9.h92 D
      // 1a8: ldc2_w 2.149802
      // 1ab: dmul
      // 1ac: putfield xt9.h92 D
      // 1af: aload 0
      // 1b0: bipush 1
      // 1b1: putfield xt9.z0z Z
      // 1b4: iload 2
      // 1b5: ifeq 304
      // 1b8: goto 1bf
      // 1bb: invokestatic xt9.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield xt9.w4l I
      // 1c3: bipush 3
      // 1c4: goto 1cb
      // 1c7: invokestatic xt9.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: iload 2
      // 1cc: ifne 210
      // 1cf: if_icmpne 1f9
      // 1d2: goto 1d9
      // 1d5: invokestatic xt9.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: bipush 4
      // 1db: putfield xt9.w4l I
      // 1de: ldc2_w 0.66
      // 1e1: aload 0
      // 1e2: getfield xt9.rhi D
      // 1e5: ldc2_w 0.1873
      // 1e8: dsub
      // 1e9: dmul
      // 1ea: dstore 3
      // 1eb: aload 0
      // 1ec: aload 0
      // 1ed: getfield xt9.rhi D
      // 1f0: dload 3
      // 1f1: dsub
      // 1f2: putfield xt9.h92 D
      // 1f5: iload 2
      // 1f6: ifeq 304
      // 1f9: aload 0
      // 1fa: iload 2
      // 1fb: ifne 31b
      // 1fe: goto 205
      // 201: invokestatic xt9.a (Loov;)Loov;
      // 204: athrow
      // 205: getfield xt9.w4l I
      // 208: bipush 4
      // 209: goto 210
      // 20c: invokestatic xt9.a (Loov;)Loov;
      // 20f: athrow
      // 210: if_icmpne 304
      // 213: aload 0
      // 214: getfield xt9.wyl Lc05;
      // 217: invokevirtual Minecraft.z8v ()Laba;
      // 21a: ldc 0.7
      // 21c: nop
      // 21d: putfield aba.qeu F
      // 220: aload 0
      // 221: aload 0
      // 222: getfield xt9.rhi D
      // 225: aload 0
      // 226: getfield xt9.rhi D
      // 229: ldc2_w 159.0
      // 22c: ddiv
      // 22d: dsub
      // 22e: putfield xt9.h92 D
      // 231: aload 0
      // 232: getfield xt9.wyl Lc05;
      // 235: getfield Minecraft.tij Lkh3;
      // 238: aload 0
      // 239: getfield xt9.wyl Lc05;
      // 23c: getfield Minecraft.vg8 Ll86;
      // 23f: aload 0
      // 240: getfield xt9.wyl Lc05;
      // 243: getfield Minecraft.vg8 Ll86;
      // 246: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 249: dconst_0
      // 24a: aload 0
      // 24b: getfield xt9.wyl Lc05;
      // 24e: getfield Minecraft.vg8 Ll86;
      // 251: getfield EntityPlayerSP.mop D
      // 254: dconst_0
      // 255: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 258: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 25b: invokeinterface java/util/List.size ()I 1
      // 260: iload 2
      // 261: ifne 2a9
      // 264: goto 26b
      // 267: invokestatic xt9.a (Loov;)Loov;
      // 26a: athrow
      // 26b: ifgt 294
      // 26e: goto 275
      // 271: invokestatic xt9.a (Loov;)Loov;
      // 274: athrow
      // 275: aload 0
      // 276: iload 2
      // 277: ifne 31b
      // 27a: goto 281
      // 27d: invokestatic xt9.a (Loov;)Loov;
      // 280: athrow
      // 281: getfield xt9.wyl Lc05;
      // 284: getfield Minecraft.vg8 Ll86;
      // 287: getfield EntityPlayerSP.fcv Z
      // 28a: ifeq 304
      // 28d: goto 294
      // 290: invokestatic xt9.a (Loov;)Loov;
      // 293: athrow
      // 294: aload 0
      // 295: bipush 1
      // 296: putfield xt9.w4l I
      // 299: getstatic iri.o89 Lcn7;
      // 29c: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 29f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a2: goto 2a9
      // 2a5: invokestatic xt9.a (Loov;)Loov;
      // 2a8: athrow
      // 2a9: iload 2
      // 2aa: ifne 2ee
      // 2ad: ifeq 2dd
      // 2b0: goto 2b7
      // 2b3: invokestatic xt9.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: aload 0
      // 2b8: getfield xt9.z0z Z
      // 2bb: iload 2
      // 2bc: ifne 2ee
      // 2bf: goto 2c6
      // 2c2: invokestatic xt9.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: ifeq 2dd
      // 2c9: goto 2d0
      // 2cc: invokestatic xt9.a (Loov;)Loov;
      // 2cf: athrow
      // 2d0: getstatic ModuleRegistry.ce6 Liri;
      // 2d3: invokevirtual iri.toggle ()V
      // 2d6: goto 2dd
      // 2d9: invokestatic xt9.a (Loov;)Loov;
      // 2dc: athrow
      // 2dd: aload 1
      // 2de: getfield _qa.wam D
      // 2e1: iload 2
      // 2e2: ifne 31e
      // 2e5: dconst_0
      // 2e6: dcmpg
      // 2e7: goto 2ee
      // 2ea: invokestatic xt9.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: ifge 304
      // 2f1: aload 1
      // 2f2: dup
      // 2f3: getfield _qa.wam D
      // 2f6: ldc2_w 0.5
      // 2f9: dmul
      // 2fa: putfield _qa.wam D
      // 2fd: goto 304
      // 300: invokestatic xt9.a (Loov;)Loov;
      // 303: athrow
      // 304: aload 0
      // 305: aload 0
      // 306: getfield xt9.h92 D
      // 309: ldc2_w 0.1873
      // 30c: invokestatic java/lang/Math.max (DD)D
      // 30f: putfield xt9.h92 D
      // 312: aload 1
      // 313: aload 0
      // 314: getfield xt9.h92 D
      // 317: invokestatic Speed.qjs (L_qa;D)V
      // 31a: aload 0
      // 31b: getfield xt9.h92 D
      // 31e: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 321: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 324: return
   }

   @EventHandler
   public void ilu(Event var1) {
      double var2 = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
      double var4 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
      this.rhi = Math.sqrt(var2 * var2 + var4 * var4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5903989780872683621L, -6821671620339280565L, MethodHandles.lookup().lookupClass()).a(281363422220094L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 87252145493814L;
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
      String var6 = "Ds\u0093\u0093 O\u0000\u0099@¸Pv;_<À)aòÄ}\u007fãc\u0010g:Ç¼¿\u0087\u0084æFçK[üÂ\u009b1";
      int var8 = "Ds\u0093\u0093 O\u0000\u0099@¸Pv;_<À)aòÄ}\u007fãc\u0010g:Ç¼¿\u0087\u0084æFçK[üÂ\u009b1".length();
      char var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4848;
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
            throw new RuntimeException("xt9", var10);
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
         throw new RuntimeException("xt9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
