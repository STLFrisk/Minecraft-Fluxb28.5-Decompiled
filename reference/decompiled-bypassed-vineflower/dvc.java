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

public class dvc extends gbe {
   private static final moh$_ru[] ofj;
   private final gbe y5k;
   private final moh xf2;
   private String xgh;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public dvc(gbe var1, moh var2) {
      this.y5k = var1;
      this.xf2 = var2;
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic dvc.a J
      // 003: ldc2_w 101977244205714
      // 006: lxor
      // 007: lstore 1
      // 008: bipush 0
      // 009: istore 4
      // 00b: aload 0
      // 00c: sipush 14698
      // 00f: ldc2_w 9149063206550872468
      // 012: lload 1
      // 013: lxor
      // 014: invokedynamic r (IJ)Ljava/lang/String; bsm=dvc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: nop
      // 01a: bipush 0
      // 01b: anewarray 39
      // 01e: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 021: putfield dvc.xgh Ljava/lang/String;
      // 024: getstatic dvc.ofj [Lmoh$_ru;
      // 027: astore 5
      // 029: aload 5
      // 02b: arraylength
      // 02c: istore 6
      // 02e: invokestatic t9d.c ()I
      // 031: bipush 0
      // 032: istore 7
      // 034: istore 3
      // 035: iload 7
      // 037: iload 6
      // 039: if_icmpge 0fa
      // 03c: aload 5
      // 03e: iload 7
      // 040: aaload
      // 041: astore 8
      // 043: aload 8
      // 045: invokevirtual moh$_ru.on0 ()Z
      // 048: iload 3
      // 049: ifne 135
      // 04c: iload 3
      // 04d: ifne 0ef
      // 050: goto 057
      // 053: invokestatic dvc.a (Loov;)Loov;
      // 056: athrow
      // 057: ifeq 0a6
      // 05a: goto 061
      // 05d: invokestatic dvc.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield dvc.khf Ljava/util/List;
      // 065: new kkh
      // 068: dup
      // 069: aload 8
      // 06b: invokevirtual moh$_ru.ehz ()I
      // 06e: aload 0
      // 06f: getfield dvc.dt7 I
      // 072: bipush 2
      // 073: idiv
      // 074: sipush 155
      // 077: isub
      // 078: iload 4
      // 07a: bipush 2
      // 07b: irem
      // 07c: sipush 160
      // 07f: imul
      // 080: iadd
      // 081: aload 0
      // 082: getfield dvc.o1e I
      // 085: bipush 6
      // 087: idiv
      // 088: bipush 24
      // 08a: iload 4
      // 08c: bipush 1
      // 08d: ishr
      // 08e: imul
      // 08f: iadd
      // 090: aload 8
      // 092: invokespecial kkh.<init> (IIILmoh$_ru;)V
      // 095: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09a: pop
      // 09b: iload 3
      // 09c: ifeq 0f0
      // 09f: goto 0a6
      // 0a2: invokestatic dvc.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getfield dvc.khf Ljava/util/List;
      // 0aa: new cm_
      // 0ad: dup
      // 0ae: aload 8
      // 0b0: invokevirtual moh$_ru.ehz ()I
      // 0b3: aload 0
      // 0b4: getfield dvc.dt7 I
      // 0b7: bipush 2
      // 0b8: idiv
      // 0b9: sipush 155
      // 0bc: isub
      // 0bd: iload 4
      // 0bf: bipush 2
      // 0c0: irem
      // 0c1: sipush 160
      // 0c4: imul
      // 0c5: iadd
      // 0c6: aload 0
      // 0c7: getfield dvc.o1e I
      // 0ca: bipush 6
      // 0cc: idiv
      // 0cd: bipush 24
      // 0cf: iload 4
      // 0d1: bipush 1
      // 0d2: ishr
      // 0d3: imul
      // 0d4: iadd
      // 0d5: aload 8
      // 0d7: aload 0
      // 0d8: getfield dvc.xf2 Lmoh;
      // 0db: aload 8
      // 0dd: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 0e0: invokespecial cm_.<init> (IIILmoh$_ru;Ljava/lang/String;)V
      // 0e3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e8: goto 0ef
      // 0eb: invokestatic dvc.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: pop
      // 0f0: iinc 4 1
      // 0f3: iinc 7 1
      // 0f6: iload 3
      // 0f7: ifeq 035
      // 0fa: aload 0
      // 0fb: getfield dvc.khf Ljava/util/List;
      // 0fe: new gt4
      // 101: dup
      // 102: sipush 200
      // 105: aload 0
      // 106: getfield dvc.dt7 I
      // 109: bipush 2
      // 10a: idiv
      // 10b: bipush 100
      // 10d: isub
      // 10e: aload 0
      // 10f: getfield dvc.o1e I
      // 112: bipush 6
      // 114: idiv
      // 115: bipush 120
      // 117: iadd
      // 118: sipush 8148
      // 11b: ldc2_w 2753193852833957675
      // 11e: lload 1
      // 11f: lxor
      // 120: invokedynamic r (IJ)Ljava/lang/String; bsm=dvc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: nop
      // 126: bipush 0
      // 127: anewarray 39
      // 12a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 12d: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 130: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 135: pop
      // 136: return
   }

   @Override
   public void actionPerformed(gt4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4.c9a Z
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq 98
      // 0f: goto 16
      // 12: invokestatic dvc.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic dvc.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 100
      // 23: iload 2
      // 24: ifeq 79
      // 27: if_icmpge 72
      // 2a: goto 31
      // 2d: invokestatic dvc.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 1
      // 32: instanceof cm_
      // 35: iload 2
      // 36: ifeq 76
      // 39: goto 40
      // 3c: invokestatic dvc.a (Loov;)Loov;
      // 3f: athrow
      // 40: ifeq 72
      // 43: goto 4a
      // 46: invokestatic dvc.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield dvc.xf2 Lmoh;
      // 4e: aload 1
      // 4f: checkcast cm_
      // 52: invokevirtual cm_.t4j ()Lmoh$_ru;
      // 55: bipush 1
      // 56: invokevirtual moh.d13 (Lmoh$_ru;I)V
      // 59: aload 1
      // 5a: aload 0
      // 5b: getfield dvc.xf2 Lmoh;
      // 5e: aload 1
      // 5f: getfield gt4._me I
      // 62: invokestatic moh$_ru.jit (I)Lmoh$_ru;
      // 65: invokevirtual moh.ycx (Lmoh$_ru;)Ljava/lang/String;
      // 68: putfield gt4.frg Ljava/lang/String;
      // 6b: goto 72
      // 6e: invokestatic dvc.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 1
      // 73: getfield gt4._me I
      // 76: sipush 200
      // 79: if_icmpne 98
      // 7c: aload 0
      // 7d: getfield dvc.f41 Lc05;
      // 80: getfield c05.oxn Lmoh;
      // 83: invokevirtual moh.cmo ()V
      // 86: aload 0
      // 87: getfield dvc.f41 Lc05;
      // 8a: aload 0
      // 8b: getfield dvc.y5k Lgbe;
      // 8e: invokevirtual c05.z2i (Lgbe;)V
      // 91: goto 98
      // 94: invokestatic dvc.a (Loov;)Loov;
      // 97: athrow
      // 98: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.poi(this.fex, this.xgh, this.dt7 / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9050505523244471475L, -6374397672753786372L, MethodHandles.lookup().lookupClass()).a(205426886437127L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 34459501126909L;
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
      String var6 = "4?\u0014Ñ¾$ødÊF\u0088on\u008e²\u009b¹ëd,ã¹\u001c¯&:,\u007flû.£(\u0086O\u0013> ê³\u0095ÝÏ\u0097ð°&\nÄ{¤Ï\u0083\u0000°XÆÓáò~\u009b\u0014¢|24\r;\b\bµ\u0011";
      int var8 = "4?\u0014Ñ¾$ødÊF\u0088on\u008e²\u009b¹ëd,ã¹\u001c¯&:,\u007flû.£(\u0086O\u0013> ê³\u0095ÝÏ\u0097ð°&\nÄ{¤Ï\u0083\u0000°XÆÓáò~\u009b\u0014¢|24\r;\b\bµ\u0011"
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
            g = new String[2];
            ofj = new moh$_ru[]{
               moh$_ru.sdf, moh$_ru.xtm, moh$_ru.dm2, moh$_ru.o_c, moh$_ru.zef, moh$_ru.re8, moh$_ru.mzt, moh$_ru.lvc, moh$_ru.zro, moh$_ru.jqz
            };
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25586;
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
            throw new RuntimeException("dvc", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("dvc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
