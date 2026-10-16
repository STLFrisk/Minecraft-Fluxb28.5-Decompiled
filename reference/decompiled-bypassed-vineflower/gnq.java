import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class gnq extends ar7 {
   public static crk bhu;
   public static q6h hkj;
   public static ArrayList idx;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public gnq() {
      long var1 = a ^ 103156274507175L;
      super(b<"t">(15982, 6292055682617400367L ^ var1), _aj._lm, false, new j1s[0]);
   }

   public static boolean y7v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: bipush 0
      // 05: istore 1
      // 06: iload 1
      // 07: sipush 128
      // 0a: if_icmpgt 34
      // 0d: iload 1
      // 0e: i2d
      // 0f: invokestatic p_c.xec (D)Z
      // 12: iload 0
      // 13: ifne 35
      // 16: iload 0
      // 17: ifne 2c
      // 1a: goto 21
      // 1d: invokestatic gnq.a (Loov;)Loov;
      // 20: athrow
      // 21: ifeq 2d
      // 24: goto 2b
      // 27: invokestatic gnq.a (Loov;)Loov;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: iinc 1 1
      // 30: iload 0
      // 31: ifeq 06
      // 34: bipush 1
      // 35: ireturn
   }

   @jev
   public void slv(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic gnq.a J
      // 003: ldc2_w 93636349488176
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: getstatic gnq.idx Ljava/util/ArrayList;
      // 010: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 013: iload 4
      // 015: ifne 063
      // 018: ifne 050
      // 01b: goto 022
      // 01e: invokestatic gnq.a (Loov;)Loov;
      // 021: athrow
      // 022: getstatic gnq.ek1 Lc05;
      // 025: getfield c05.vg8 Ll86;
      // 028: getfield l86.g25 I
      // 02b: iload 4
      // 02d: ifne 063
      // 030: goto 037
      // 033: invokestatic gnq.a (Loov;)Loov;
      // 036: athrow
      // 037: bipush 100
      // 039: if_icmpge 050
      // 03c: goto 043
      // 03f: invokestatic gnq.a (Loov;)Loov;
      // 042: athrow
      // 043: getstatic gnq.idx Ljava/util/ArrayList;
      // 046: invokevirtual java/util/ArrayList.clear ()V
      // 049: goto 050
      // 04c: invokestatic gnq.a (Loov;)Loov;
      // 04f: athrow
      // 050: aload 1
      // 051: invokevirtual ihr.bbi ()Lmz2;
      // 054: iload 4
      // 056: ifne 071
      // 059: instanceof net/minecraft/network/play/client/C03PacketPlayer
      // 05c: goto 063
      // 05f: invokestatic gnq.a (Loov;)Loov;
      // 062: athrow
      // 063: ifeq 157
      // 066: aload 1
      // 067: invokevirtual ihr.bbi ()Lmz2;
      // 06a: goto 071
      // 06d: invokestatic gnq.a (Loov;)Loov;
      // 070: athrow
      // 071: checkcast net/minecraft/network/play/client/C03PacketPlayer
      // 074: astore 5
      // 076: invokestatic gnq.y7v ()Z
      // 079: iload 4
      // 07b: ifne 0dd
      // 07e: ifeq 0c4
      // 081: goto 088
      // 084: invokestatic gnq.a (Loov;)Loov;
      // 087: athrow
      // 088: getstatic gnq.ek1 Lc05;
      // 08b: getfield c05.vg8 Ll86;
      // 08e: getfield l86.lls Lpj2;
      // 091: getfield pj2.wzx Z
      // 094: iload 4
      // 096: ifne 0dd
      // 099: goto 0a0
      // 09c: invokestatic gnq.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: ifne 0c4
      // 0a3: goto 0aa
      // 0a6: invokestatic gnq.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 1
      // 0ab: bipush 1
      // 0ac: invokevirtual ihr.wxi (Z)V
      // 0af: getstatic gnq.idx Ljava/util/ArrayList;
      // 0b2: aload 5
      // 0b4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0b7: pop
      // 0b8: iload 4
      // 0ba: ifeq 157
      // 0bd: goto 0c4
      // 0c0: invokestatic gnq.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: getstatic gnq.idx Ljava/util/ArrayList;
      // 0c7: iload 4
      // 0c9: ifne 111
      // 0cc: goto 0d3
      // 0cf: invokestatic gnq.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: invokevirtual java/util/ArrayList.isEmpty ()Z
      // 0d6: goto 0dd
      // 0d9: invokestatic gnq.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: ifne 151
      // 0e0: new java/lang/StringBuilder
      // 0e3: dup
      // 0e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e7: sipush 15189
      // 0ea: ldc2_w 3373545996118235271
      // 0ed: lload 2
      // 0ee: lxor
      // 0ef: invokedynamic t (IJ)Ljava/lang/String; bsm=gnq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: nop
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: getstatic gnq.idx Ljava/util/ArrayList;
      // 0fb: invokevirtual java/util/ArrayList.size ()I
      // 0fe: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 101: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 104: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 107: getstatic gnq.idx Ljava/util/ArrayList;
      // 10a: goto 111
      // 10d: invokestatic gnq.a (Loov;)Loov;
      // 110: athrow
      // 111: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 114: astore 6
      // 116: aload 6
      // 118: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11d: ifeq 14b
      // 120: aload 6
      // 122: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 127: checkcast net/minecraft/network/play/client/C03PacketPlayer
      // 12a: astore 7
      // 12c: getstatic gnq.ek1 Lc05;
      // 12f: invokevirtual c05.c02 ()Lp_k;
      // 132: invokevirtual p_k._m3 ()Lhv0;
      // 135: aload 7
      // 137: invokevirtual hv0.r92 (Lmz2;)V
      // 13a: iload 4
      // 13c: ifne 151
      // 13f: iload 4
      // 141: ifeq 116
      // 144: goto 14b
      // 147: invokestatic gnq.a (Loov;)Loov;
      // 14a: athrow
      // 14b: getstatic gnq.idx Ljava/util/ArrayList;
      // 14e: invokevirtual java/util/ArrayList.clear ()V
      // 151: getstatic gnq.hkj Lq6h;
      // 154: invokevirtual q6h.u1k ()V
      // 157: return
   }

   @jev
   public void h_b(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic gnq.a J
      // 03: ldc2_w 53385878142252
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual wbh.nlg ()Lmz2;
      // 11: instanceof net/minecraft/network/play/server/S08PacketPlayerPosLook
      // 14: iload 4
      // 16: ifne 3c
      // 19: ifeq 5e
      // 1c: goto 23
      // 1f: invokestatic gnq.a (Loov;)Loov;
      // 22: athrow
      // 23: getstatic gnq.idx Ljava/util/ArrayList;
      // 26: iload 4
      // 28: ifne 5b
      // 2b: goto 32
      // 2e: invokestatic gnq.a (Loov;)Loov;
      // 31: athrow
      // 32: invokevirtual java/util/ArrayList.size ()I
      // 35: goto 3c
      // 38: invokestatic gnq.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: if_icmple 5e
      // 40: sipush 27536
      // 43: ldc2_w 6414382205839300956
      // 46: lload 2
      // 47: lxor
      // 48: invokedynamic t (IJ)Ljava/lang/String; bsm=gnq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: nop
      // 4e: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 51: getstatic gnq.idx Ljava/util/ArrayList;
      // 54: goto 5b
      // 57: invokestatic gnq.a (Loov;)Loov;
      // 5a: athrow
      // 5b: invokevirtual java/util/ArrayList.clear ()V
      // 5e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5401715086961479155L, 4218988816979984026L, MethodHandles.lookup().lookupClass()).a(244812827415109L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 126888917515420L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "Ä\u001az\u000fU\u0017\"\u008f\u001d\rn\u0081>\u009a\u000e¦\u0013Ð*ó\u0090\u0097\u0096/;\u0016\u0018\b\u0085K5\u0085àïÚ±æ\u0082æ\u0006 }Ö\u001b1\u009cçÔ[Ý\u00adÈÆ<,¹GfqMxéÐ\u0014OÉÝfH\u0081zQÇ@ä*£õ\u0012\u0004tTÛ0ñý\u001cæ\u0085\u0013{\u0006\u008b\u0013_ w¿\u0091\u001bì5\u009bjý¹Ù¦þü\u0088(\u0019ý\u0016NÇ\u0081y:\u0089ñ\u0084àÿ\\MaP\u0081F\u0081¾*º\tìv";
      int var6 = "Ä\u001az\u000fU\u0017\"\u008f\u001d\rn\u0081>\u009a\u000e¦\u0013Ð*ó\u0090\u0097\u0096/;\u0016\u0018\b\u0085K5\u0085àïÚ±æ\u0082æ\u0006 }Ö\u001b1\u009cçÔ[Ý\u00adÈÆ<,¹GfqMxéÐ\u0014OÉÝfH\u0081zQÇ@ä*£õ\u0012\u0004tTÛ0ñý\u001cæ\u0085\u0013{\u0006\u008b\u0013_ w¿\u0091\u001bì5\u009bjý¹Ù¦þü\u0088(\u0019ý\u0016NÇ\u0081y:\u0089ñ\u0084àÿ\\MaP\u0081F\u0081¾*º\tìv"
         .length();
      char var3 = '(';
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
                     g = new String[5];
                     bhu = new crk(b<"t">(19753, 1951050923685396054L ^ var9), b<"t">(10164, 4854349682651845833L ^ var9), 1500.0F, 1000.0F, 2000.0F, 100.0F);
                     hkj = new q6h();
                     idx = new ArrayList();
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

                  var4 = "\u0017<}7ËÕ\u0087Õ9¡<.tA\u008c\u0098q\u001dý¨\u0018ïá4ß%¾õ8J\u0017t \u0083£:¸úÂ¸\u008cÑèÌ÷7\u0096ï\u0093Bq.*Ò\u0013\u0011éo+6Ûy¯¨\u0000";
                  var6 = "\u0017<}7ËÕ\u0087Õ9¡<.tA\u008c\u0098q\u001dý¨\u0018ïá4ß%¾õ8J\u0017t \u0083£:¸úÂ¸\u008cÑèÌ÷7\u0096ï\u0093Bq.*Ò\u0013\u0011éo+6Ûy¯¨\u0000"
                     .length();
                  var3 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25150;
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
            throw new RuntimeException("gnq", var10);
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
         throw new RuntimeException("gnq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
