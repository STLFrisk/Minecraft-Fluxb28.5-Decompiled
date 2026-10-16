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

public class rq6 extends u7m {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public rq6() {
      this.qfy(uja.qqf);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic rq6.a J
      // 003: ldc2_w 129759251786560
      // 006: lxor
      // 007: lstore 9
      // 009: invokestatic t9d.c ()I
      // 00c: istore 11
      // 00e: aload 5
      // 010: getstatic vt2.m3r Lvt2;
      // 013: if_acmpne 01c
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic rq6.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 3
      // 01d: aload 4
      // 01f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 022: invokeinterface zfz.r_y ()Le0x; 1
      // 027: aload 3
      // 028: aload 4
      // 02a: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 02d: istore 12
      // 02f: iload 12
      // 031: ifeq 03d
      // 034: aload 4
      // 036: goto 044
      // 039: invokestatic rq6.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 4
      // 03f: aload 5
      // 041: invokevirtual mew.offset (Lvt2;)Lmew;
      // 044: astore 13
      // 046: aload 2
      // 047: aload 13
      // 049: aload 5
      // 04b: aload 1
      // 04c: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 04f: iload 11
      // 051: ifne 05f
      // 054: ifne 060
      // 057: goto 05e
      // 05a: invokestatic rq6.a (Loov;)Loov;
      // 05d: athrow
      // 05e: bipush 0
      // 05f: ireturn
      // 060: aload 13
      // 062: invokevirtual mew.nuv ()Lmew;
      // 065: astore 14
      // 067: aload 3
      // 068: aload 13
      // 06a: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 06d: iload 11
      // 06f: ifne 094
      // 072: ifne 0a7
      // 075: goto 07c
      // 078: invokestatic rq6.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 3
      // 07d: aload 13
      // 07f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 082: invokeinterface zfz.r_y ()Le0x; 1
      // 087: aload 3
      // 088: aload 13
      // 08a: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 08d: goto 094
      // 090: invokestatic rq6.a (Loov;)Loov;
      // 093: athrow
      // 094: iload 11
      // 096: ifne 0a4
      // 099: ifne 0a7
      // 09c: goto 0a3
      // 09f: invokestatic rq6.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: bipush 1
      // 0a4: goto 0a8
      // 0a7: bipush 0
      // 0a8: istore 15
      // 0aa: iload 15
      // 0ac: aload 3
      // 0ad: aload 14
      // 0af: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 0b2: iload 11
      // 0b4: ifne 0d9
      // 0b7: ifne 0ec
      // 0ba: goto 0c1
      // 0bd: invokestatic rq6.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 3
      // 0c2: aload 14
      // 0c4: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c7: invokeinterface zfz.r_y ()Le0x; 1
      // 0cc: aload 3
      // 0cd: aload 14
      // 0cf: invokevirtual e0x.ujd (Lt9d;Lmew;)Z
      // 0d2: goto 0d9
      // 0d5: invokestatic rq6.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iload 11
      // 0db: ifne 0e9
      // 0de: ifne 0ec
      // 0e1: goto 0e8
      // 0e4: invokestatic rq6.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: bipush 1
      // 0e9: goto 0ed
      // 0ec: bipush 0
      // 0ed: ior
      // 0ee: istore 15
      // 0f0: iload 15
      // 0f2: iload 11
      // 0f4: ifne 10c
      // 0f7: ifeq 107
      // 0fa: goto 101
      // 0fd: invokestatic rq6.a (Loov;)Loov;
      // 100: athrow
      // 101: bipush 0
      // 102: ireturn
      // 103: invokestatic rq6.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 13
      // 109: invokevirtual mew.getX ()I
      // 10c: i2d
      // 10d: dstore 16
      // 10f: aload 13
      // 111: invokevirtual mew.getY ()I
      // 114: i2d
      // 115: dstore 18
      // 117: aload 13
      // 119: invokevirtual mew.getZ ()I
      // 11c: i2d
      // 11d: dstore 20
      // 11f: aload 3
      // 120: aconst_null
      // 121: checkcast i2h
      // 124: dload 16
      // 126: dload 18
      // 128: dload 20
      // 12a: dload 16
      // 12c: dconst_1
      // 12d: dadd
      // 12e: dload 18
      // 130: ldc2_w 2.0
      // 133: dadd
      // 134: dload 20
      // 136: dconst_1
      // 137: dadd
      // 138: invokestatic nh4.kje (DDDDDD)Lnh4;
      // 13b: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 13e: astore 22
      // 140: aload 22
      // 142: invokeinterface java/util/List.size ()I 1
      // 147: iload 11
      // 149: ifne 160
      // 14c: ifle 15c
      // 14f: goto 156
      // 152: invokestatic rq6.a (Loov;)Loov;
      // 155: athrow
      // 156: bipush 0
      // 157: ireturn
      // 158: invokestatic rq6.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 3
      // 15d: getfield t9d.v0f Z
      // 160: iload 11
      // 162: ifne 251
      // 165: ifne 246
      // 168: goto 16f
      // 16b: invokestatic rq6.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 3
      // 170: aload 13
      // 172: invokevirtual t9d.i6x (Lmew;)Z
      // 175: pop
      // 176: aload 3
      // 177: aload 14
      // 179: invokevirtual t9d.i6x (Lmew;)Z
      // 17c: pop
      // 17d: new h67
      // 180: dup
      // 181: aload 3
      // 182: dload 16
      // 184: ldc2_w 0.5
      // 187: dadd
      // 188: dload 18
      // 18a: dload 20
      // 18c: ldc2_w 0.5
      // 18f: dadd
      // 190: invokespecial h67.<init> (Lt9d;DDD)V
      // 193: astore 23
      // 195: aload 2
      // 196: getfield ha9.x5k F
      // 199: ldc 180.0
      // 19b: nop
      // 19c: fsub
      // 19d: invokestatic fe6.qsy (F)F
      // 1a0: ldc 22.5
      // 1a2: nop
      // 1a3: fadd
      // 1a4: ldc 45.0
      // 1a6: nop
      // 1a7: fdiv
      // 1a8: invokestatic fe6.tpk (F)I
      // 1ab: i2f
      // 1ac: ldc 45.0
      // 1ae: nop
      // 1af: fmul
      // 1b0: fstore 24
      // 1b2: aload 23
      // 1b4: dload 16
      // 1b6: ldc2_w 0.5
      // 1b9: dadd
      // 1ba: dload 18
      // 1bc: dload 20
      // 1be: ldc2_w 0.5
      // 1c1: dadd
      // 1c2: fload 24
      // 1c4: fconst_0
      // 1c5: invokevirtual h67.x24 (DDDFF)V
      // 1c8: aload 0
      // 1c9: aload 23
      // 1cb: aload 3
      // 1cc: getfield t9d.fsy Ljava/util/Random;
      // 1cf: invokespecial rq6.cts (Lh67;Ljava/util/Random;)V
      // 1d2: aload 1
      // 1d3: invokevirtual erg.zso ()Lbdo;
      // 1d6: astore 25
      // 1d8: aload 25
      // 1da: iload 11
      // 1dc: ifne 1eb
      // 1df: ifnull 23f
      // 1e2: goto 1e9
      // 1e5: invokestatic rq6.a (Loov;)Loov;
      // 1e8: athrow
      // 1e9: aload 25
      // 1eb: sipush 19893
      // 1ee: ldc2_w 271238536664031028
      // 1f1: lload 9
      // 1f3: lxor
      // 1f4: invokedynamic t (IJ)Ljava/lang/String; bsm=rq6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: nop
      // 1fa: bipush 10
      // 1fc: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 1ff: iload 11
      // 201: ifne 245
      // 204: ifeq 23f
      // 207: goto 20e
      // 20a: invokestatic rq6.a (Loov;)Loov;
      // 20d: athrow
      // 20e: new bdo
      // 211: dup
      // 212: invokespecial bdo.<init> ()V
      // 215: astore 26
      // 217: aload 23
      // 219: aload 26
      // 21b: invokevirtual h67.qqt (Lbdo;)Z
      // 21e: pop
      // 21f: aload 26
      // 221: aload 25
      // 223: sipush 24561
      // 226: ldc2_w 532380151864986993
      // 229: lload 9
      // 22b: lxor
      // 22c: invokedynamic t (IJ)Ljava/lang/String; bsm=rq6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: nop
      // 232: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 235: invokevirtual bdo.uhv (Lbdo;)V
      // 238: aload 23
      // 23a: aload 26
      // 23c: invokevirtual h67.a1f (Lbdo;)V
      // 23f: aload 3
      // 240: aload 23
      // 242: invokevirtual t9d.xzq (Li2h;)Z
      // 245: pop
      // 246: aload 1
      // 247: dup
      // 248: getfield erg.qd2 I
      // 24b: bipush 1
      // 24c: isub
      // 24d: putfield erg.qd2 I
      // 250: bipush 1
      // 251: ireturn
   }

   private void cts(h67 var1, Random var2) {
      wis var3 = var1.l6k();
      float var4 = var2.nextFloat() * 5.0F;
      float var5 = var2.nextFloat() * 20.0F - 10.0F;
      wis var6 = new wis(var3.ins() + var4, var3.t9l() + var5, var3.pic());
      var1.zn5(var6);
      var3 = var1.pfz();
      var4 = var2.nextFloat() * 10.0F - 5.0F;
      var6 = new wis(var3.ins(), var3.t9l() + var4, var3.pic());
      var1.lcd(var6);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6056738435543117374L, 3393625609754805769L, MethodHandles.lookup().lookupClass()).a(26296971999282L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 20284095516314L;
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
      String var6 = "e\u0017î\u0098ØJ¬«4\u0087\u007fb«\u0080w\u0087PH\u001b$\u000e-Háeù¹\u0090õ³×\u0015 Æo^>.Ü·¼\u009b\u0098²\u0003\u009c\u0012Mv¹\u0004ÿA\u0093\u0005bÀ{Ù\u009fÐ\u007föÅÕ";
      int var8 = "e\u0017î\u0098ØJ¬«4\u0087\u007fb«\u0080w\u0087PH\u001b$\u000e-Háeù¹\u0090õ³×\u0015 Æo^>.Ü·¼\u009b\u0098²\u0003\u009c\u0012Mv¹\u0004ÿA\u0093\u0005bÀ{Ù\u009fÐ\u007föÅÕ"
         .length();
      char var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18730;
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
            throw new RuntimeException("rq6", var10);
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
         throw new RuntimeException("rq6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
