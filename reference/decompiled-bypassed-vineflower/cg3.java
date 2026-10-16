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

public class cg3 extends ar7 {
   public static c_3 mef;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public cg3() {
      long var1 = a ^ 99178819568175L;
      super(b<"g">(27207, 7511260327485550371L ^ var1), _aj.p3z, mef);
   }

   @jev
   public void eun(ccn param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic cg3.a J
      // 003: ldc2_w 91365943597555
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: pop
      // 00f: getstatic cg3.ek1 Lc05;
      // 012: getfield c05.vg8 Ll86;
      // 015: invokevirtual l86.bbq ()I
      // 018: iload 4
      // 01a: ifeq 068
      // 01d: bipush 14
      // 01f: if_icmpge 056
      // 022: goto 029
      // 025: invokestatic cg3.a (Loov;)Loov;
      // 028: athrow
      // 029: getstatic cg3.mef Lc_3;
      // 02c: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 02f: sipush 23234
      // 032: ldc2_w 4009819683134604411
      // 035: lload 2
      // 036: lxor
      // 037: invokedynamic g (IJ)Ljava/lang/String; bsm=cg3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: nop
      // 03d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 040: iload 4
      // 042: ifeq 068
      // 045: goto 04c
      // 048: invokestatic cg3.a (Loov;)Loov;
      // 04b: athrow
      // 04c: ifeq 10f
      // 04f: goto 056
      // 052: invokestatic cg3.a (Loov;)Loov;
      // 055: athrow
      // 056: aload 0
      // 057: pop
      // 058: getstatic cg3.ek1 Lc05;
      // 05b: getfield c05.vg8 Ll86;
      // 05e: getfield l86.lfk Z
      // 061: goto 068
      // 064: invokestatic cg3.a (Loov;)Loov;
      // 067: athrow
      // 068: iload 4
      // 06a: ifeq 08f
      // 06d: ifeq 10f
      // 070: goto 077
      // 073: invokestatic cg3.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: pop
      // 079: getstatic cg3.ek1 Lc05;
      // 07c: getfield c05.vg8 Ll86;
      // 07f: invokevirtual l86.t_o ()Lerg;
      // 082: invokevirtual erg.gn1 ()Lu7m;
      // 085: instanceof r5m
      // 088: goto 08f
      // 08b: invokestatic cg3.a (Loov;)Loov;
      // 08e: athrow
      // 08f: iload 4
      // 091: ifeq 09f
      // 094: ifeq 10f
      // 097: goto 09e
      // 09a: invokestatic cg3.a (Loov;)Loov;
      // 09d: athrow
      // 09e: bipush 0
      // 09f: istore 5
      // 0a1: iload 5
      // 0a3: getstatic cg3.mef Lc_3;
      // 0a6: invokevirtual c_3.d7c ()Ljava/lang/String;
      // 0a9: sipush 23234
      // 0ac: ldc2_w 4009819683134604411
      // 0af: lload 2
      // 0b0: lxor
      // 0b1: invokedynamic g (IJ)Ljava/lang/String; bsm=cg3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: nop
      // 0b7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ba: ifeq 0cb
      // 0bd: bipush 20
      // 0bf: iload 4
      // 0c1: ifeq 0cd
      // 0c4: goto 0cd
      // 0c7: invokestatic cg3.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: bipush 8
      // 0cd: if_icmpge 0fc
      // 0d0: aload 0
      // 0d1: pop
      // 0d2: getstatic cg3.ek1 Lc05;
      // 0d5: invokevirtual c05.c02 ()Lp_k;
      // 0d8: new net/minecraft/network/play/client/C03PacketPlayer
      // 0db: dup
      // 0dc: aload 0
      // 0dd: pop
      // 0de: getstatic cg3.ek1 Lc05;
      // 0e1: getfield c05.vg8 Ll86;
      // 0e4: getfield l86.lfk Z
      // 0e7: invokespecial net/minecraft/network/play/client/C03PacketPlayer.<init> (Z)V
      // 0ea: invokevirtual p_k.sxi (Lmz2;)V
      // 0ed: iinc 5 1
      // 0f0: iload 4
      // 0f2: ifne 0a1
      // 0f5: goto 0fc
      // 0f8: invokestatic cg3.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 0
      // 0fd: pop
      // 0fe: getstatic cg3.ek1 Lc05;
      // 101: getfield c05.l7q Lhh6;
      // 104: aload 0
      // 105: pop
      // 106: getstatic cg3.ek1 Lc05;
      // 109: getfield c05.vg8 Ll86;
      // 10c: invokevirtual hh6.a0f (Lha9;)V
      // 10f: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4453029042040096332L, 2000011169700755761L, MethodHandles.lookup().lookupClass()).a(239013652563863L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 49638395287586L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "±(\u0098zÈ:DË\fq(JDÕñ)\u0010É\tzG´&ÞÏ¦\u001d\u0001{=.§ \u0010Ã\u0017xc6Z¿¤ì¶\u0006\u0091@\u000e0J\u0010\u000eÌÙóö\u0006\u009b¬\u0016\u0003+\u001d/úè\u0092\u0010\u0082!Äî¯\u0004*Þ\u0083\u0007©zï±}h";
      int var6 = "±(\u0098zÈ:DË\fq(JDÕñ)\u0010É\tzG´&ÞÏ¦\u001d\u0001{=.§ \u0010Ã\u0017xc6Z¿¤ì¶\u0006\u0091@\u000e0J\u0010\u000eÌÙóö\u0006\u009b¬\u0016\u0003+\u001d/úè\u0092\u0010\u0082!Äî¯\u0004*Þ\u0083\u0007©zï±}h"
         .length();
      char var3 = 16;
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
                     f = var7;
                     g = new String[7];
                     mef = new c_3(
                        b<"g">(15646, 7347080040957846129L ^ var9),
                        b<"g">(20139, 6519668577073549765L ^ var9),
                        b<"g">(8492, 9141369364067565126L ^ var9),
                        new String[]{b<"g">(27742, 1553419937727968053L ^ var9), b<"g">(14377, 8231393844261201733L ^ var9)}
                     );
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

                  var4 = "7\u0011«X\u0082\u001b\nË3àN<¤\u009c\u008cB\u0010¤\u0094£¿ iëå5Ñ=¿¿à\u0015\u0084";
                  var6 = "7\u0011«X\u0082\u001b\nË3àN<¤\u009c\u008cB\u0010¤\u0094£¿ iëå5Ñ=¿¿à\u0015\u0084".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19169;
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
            throw new RuntimeException("cg3", var10);
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
         throw new RuntimeException("cg3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
