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

public class ixd extends ar7 {
   public static boolean rje;
   public static cn7 agy;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ixd() {
      long var1 = a ^ 57475513303526L;
      super(b<"q">(25540, 4673949721336667249L ^ var1), _aj._lm, false, new j1s[0]);
   }

   @jev
   public void cn2(gnk param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual gnk.pms ()Z
      // 008: iload 2
      // 009: ifeq 070
      // 00c: ifeq 065
      // 00f: goto 016
      // 012: invokestatic ixd.a (Loov;)Loov;
      // 015: athrow
      // 016: getstatic ixd.ek1 Lc05;
      // 019: getfield c05.vg8 Ll86;
      // 01c: getfield l86.g9g Lboa;
      // 01f: getfield boa.s0a Z
      // 022: iload 2
      // 023: ifeq 070
      // 026: goto 02d
      // 029: invokestatic ixd.a (Loov;)Loov;
      // 02c: athrow
      // 02d: ifne 065
      // 030: goto 037
      // 033: invokestatic ixd.a (Loov;)Loov;
      // 036: athrow
      // 037: getstatic ixd.ek1 Lc05;
      // 03a: getfield c05.vg8 Ll86;
      // 03d: getfield l86.fcv Z
      // 040: iload 2
      // 041: ifeq 070
      // 044: goto 04b
      // 047: invokestatic ixd.a (Loov;)Loov;
      // 04a: athrow
      // 04b: ifeq 065
      // 04e: goto 055
      // 051: invokestatic ixd.a (Loov;)Loov;
      // 054: athrow
      // 055: aload 1
      // 056: dconst_1
      // 057: invokevirtual gnk.p1a (D)V
      // 05a: iload 2
      // 05b: ifne 1e2
      // 05e: goto 065
      // 061: invokestatic ixd.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 1
      // 066: invokevirtual gnk.pms ()Z
      // 069: goto 070
      // 06c: invokestatic ixd.a (Loov;)Loov;
      // 06f: athrow
      // 070: iload 2
      // 071: ifeq 08d
      // 074: ifne 1e2
      // 077: goto 07e
      // 07a: invokestatic ixd.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 1
      // 07f: invokevirtual gnk.eh2 ()D
      // 082: ldc2_w 0.5
      // 085: dcmpl
      // 086: goto 08d
      // 089: invokestatic ixd.a (Loov;)Loov;
      // 08c: athrow
      // 08d: iload 2
      // 08e: ifeq 0a8
      // 091: ifle 1e2
      // 094: goto 09b
      // 097: invokestatic ixd.a (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 1
      // 09c: invokevirtual gnk.spj ()D
      // 09f: dconst_0
      // 0a0: dcmpl
      // 0a1: goto 0a8
      // 0a4: invokestatic ixd.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: iload 2
      // 0a9: ifeq 0c9
      // 0ac: ifle 1e2
      // 0af: goto 0b6
      // 0b2: invokestatic ixd.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: getstatic ixd.ek1 Lc05;
      // 0b9: getfield c05.vg8 Ll86;
      // 0bc: getfield l86.g9g Lboa;
      // 0bf: getfield boa.s0a Z
      // 0c2: goto 0c9
      // 0c5: invokestatic ixd.a (Loov;)Loov;
      // 0c8: athrow
      // 0c9: iload 2
      // 0ca: ifeq 0e7
      // 0cd: ifne 1e2
      // 0d0: goto 0d7
      // 0d3: invokestatic ixd.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: getstatic ixd.ek1 Lc05;
      // 0da: getfield c05.vg8 Ll86;
      // 0dd: getfield l86.fcv Z
      // 0e0: goto 0e7
      // 0e3: invokestatic ixd.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: iload 2
      // 0e8: ifeq 108
      // 0eb: ifeq 1e2
      // 0ee: goto 0f5
      // 0f1: invokestatic ixd.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: bipush 1
      // 0f6: putstatic ixd.rje Z
      // 0f9: aload 1
      // 0fa: invokevirtual gnk.eh2 ()D
      // 0fd: ldc2_w 0.87
      // 100: dcmpl
      // 101: goto 108
      // 104: invokestatic ixd.a (Loov;)Loov;
      // 107: athrow
      // 108: iload 2
      // 109: ifeq 1a3
      // 10c: iflt 19d
      // 10f: goto 116
      // 112: invokestatic ixd.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 1
      // 117: invokevirtual gnk.eh2 ()D
      // 11a: dstore 3
      // 11b: dload 3
      // 11c: ldc2_w 0.42
      // 11f: dmul
      // 120: dstore 5
      // 122: dload 3
      // 123: ldc2_w 0.75
      // 126: dmul
      // 127: dstore 7
      // 129: getstatic ixd.ek1 Lc05;
      // 12c: getfield c05.vg8 Ll86;
      // 12f: getfield l86.lq7 Lp_k;
      // 132: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 135: dup
      // 136: getstatic ixd.ek1 Lc05;
      // 139: getfield c05.vg8 Ll86;
      // 13c: getfield l86.o2v D
      // 13f: getstatic ixd.ek1 Lc05;
      // 142: getfield c05.vg8 Ll86;
      // 145: getfield l86.kfp D
      // 148: dload 5
      // 14a: dadd
      // 14b: getstatic ixd.ek1 Lc05;
      // 14e: getfield c05.vg8 Ll86;
      // 151: getfield l86.vbd D
      // 154: getstatic ixd.ek1 Lc05;
      // 157: getfield c05.vg8 Ll86;
      // 15a: getfield l86.lfk Z
      // 15d: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 160: invokevirtual p_k.sxi (Lmz2;)V
      // 163: getstatic ixd.ek1 Lc05;
      // 166: getfield c05.vg8 Ll86;
      // 169: getfield l86.lq7 Lp_k;
      // 16c: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 16f: dup
      // 170: getstatic ixd.ek1 Lc05;
      // 173: getfield c05.vg8 Ll86;
      // 176: getfield l86.o2v D
      // 179: getstatic ixd.ek1 Lc05;
      // 17c: getfield c05.vg8 Ll86;
      // 17f: getfield l86.kfp D
      // 182: dload 7
      // 184: dadd
      // 185: getstatic ixd.ek1 Lc05;
      // 188: getfield c05.vg8 Ll86;
      // 18b: getfield l86.vbd D
      // 18e: getstatic ixd.ek1 Lc05;
      // 191: getfield c05.vg8 Ll86;
      // 194: getfield l86.lfk Z
      // 197: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 19a: invokevirtual p_k.sxi (Lmz2;)V
      // 19d: getstatic ixd.agy Lcn7;
      // 1a0: invokevirtual cn7.g7m ()Z
      // 1a3: iload 2
      // 1a4: ifeq 1df
      // 1a7: ifeq 1d7
      // 1aa: goto 1b1
      // 1ad: invokestatic ixd.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: getstatic ixd.ek1 Lc05;
      // 1b4: getfield c05.gze Laba;
      // 1b7: ldc 0.55
      // 1b9: nop
      // 1ba: putfield aba.qeu F
      // 1bd: new java/lang/Thread
      // 1c0: dup
      // 1c1: invokedynamic run ()Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, ixd.jqs ()V, ()V ]
      // 1c6: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 1c9: invokevirtual java/lang/Thread.start ()V
      // 1cc: iload 2
      // 1cd: ifne 1e2
      // 1d0: goto 1d7
      // 1d3: invokestatic ixd.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: bipush 0
      // 1d8: goto 1df
      // 1db: invokestatic ixd.a (Loov;)Loov;
      // 1de: athrow
      // 1df: putstatic ixd.rje Z
      // 1e2: return
   }

   private static void jqs() {
      try {
         Thread.sleep(100L);
      } catch (InterruptedException var1) {
      }

      rje = false;
      ek1.gze.qeu = 1.0F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7774622238231215826L, -1884534240903034612L, MethodHandles.lookup().lookupClass()).a(32207322346868L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 33576932572594L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "v\u0082÷:e¿\u009füêr\u0080pË\u0099z\u009d\u0010\u000f\u0016ÛePÁ{e·\u0086>\r¤Fõõ\u0010\u001fÔCÀX\u009d¯1\u001f\u008d*ºXã!M";
      int var6 = "v\u0082÷:e¿\u009füêr\u0080pË\u0099z\u009d\u0010\u000f\u0016ÛePÁ{e·\u0086>\r¤Fõõ\u0010\u001fÔCÀX\u009d¯1\u001f\u008d*ºXã!M".length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            f = var7;
            g = new String[3];
            rje = false;
            agy = new cn7(b<"q">(27301, 2971290566826387781L ^ var9), b<"q">(3906, 7739381047865347232L ^ var9), false);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2030;
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
            throw new RuntimeException("ixd", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("ixd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
