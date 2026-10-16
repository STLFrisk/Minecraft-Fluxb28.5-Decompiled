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

public class xs7 extends gbe {
   private final gbe p1i;
   private final moh yox;
   public String tn9;
   private String ird;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public xs7(gbe var1, moh var2) {
      long var3 = a ^ 41674284128507L;
      super();
      this.tn9 = b<"f">(13839, 8583659984685867547L ^ var3);
      this.p1i = var1;
      this.yox = var2;
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
      // 000: getstatic xs7.a J
      // 003: ldc2_w 63855431439901
      // 006: lxor
      // 007: lstore 1
      // 008: bipush 0
      // 009: istore 4
      // 00b: invokestatic t9d.b ()I
      // 00e: aload 0
      // 00f: sipush 3919
      // 012: ldc2_w 7756517932853269950
      // 015: lload 1
      // 016: lxor
      // 017: invokedynamic f (IJ)Ljava/lang/String; bsm=xs7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01c: nop
      // 01d: bipush 0
      // 01e: anewarray 41
      // 021: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 024: putfield xs7.tn9 Ljava/lang/String;
      // 027: aload 0
      // 028: sipush 12506
      // 02b: ldc2_w 2588530243351063081
      // 02e: lload 1
      // 02f: lxor
      // 030: invokedynamic f (IJ)Ljava/lang/String; bsm=xs7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: bipush 0
      // 037: anewarray 41
      // 03a: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 03d: putfield xs7.ird Ljava/lang/String;
      // 040: aload 0
      // 041: getfield xs7.khf Ljava/util/List;
      // 044: new xs7$ke4
      // 047: dup
      // 048: aload 0
      // 049: getstatic xdt.adu Lxdt;
      // 04c: invokevirtual xdt.a7k ()I
      // 04f: aload 0
      // 050: getfield xs7.dt7 I
      // 053: bipush 2
      // 054: idiv
      // 055: sipush 155
      // 058: isub
      // 059: iload 4
      // 05b: bipush 2
      // 05c: irem
      // 05d: sipush 160
      // 060: imul
      // 061: iadd
      // 062: aload 0
      // 063: getfield xs7.o1e I
      // 066: bipush 6
      // 068: idiv
      // 069: bipush 12
      // 06b: isub
      // 06c: bipush 24
      // 06e: iload 4
      // 070: bipush 1
      // 071: ishr
      // 072: imul
      // 073: iadd
      // 074: getstatic xdt.adu Lxdt;
      // 077: bipush 1
      // 078: invokespecial xs7$ke4.<init> (Lxs7;IIILxdt;Z)V
      // 07b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 080: pop
      // 081: istore 3
      // 082: iload 4
      // 084: bipush 2
      // 085: iadd
      // 086: istore 4
      // 088: invokestatic xdt.values ()[Lxdt;
      // 08b: astore 5
      // 08d: aload 5
      // 08f: arraylength
      // 090: istore 6
      // 092: bipush 0
      // 093: istore 7
      // 095: iload 7
      // 097: iload 6
      // 099: if_icmpge 111
      // 09c: aload 5
      // 09e: iload 7
      // 0a0: aaload
      // 0a1: astore 8
      // 0a3: iload 3
      // 0a4: ifeq 14e
      // 0a7: iload 3
      // 0a8: ifeq 10d
      // 0ab: goto 0b2
      // 0ae: invokestatic xs7.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 8
      // 0b4: getstatic xdt.adu Lxdt;
      // 0b7: if_acmpeq 10a
      // 0ba: goto 0c1
      // 0bd: invokestatic xs7.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield xs7.khf Ljava/util/List;
      // 0c5: new xs7$ke4
      // 0c8: dup
      // 0c9: aload 0
      // 0ca: aload 8
      // 0cc: invokevirtual xdt.a7k ()I
      // 0cf: aload 0
      // 0d0: getfield xs7.dt7 I
      // 0d3: bipush 2
      // 0d4: idiv
      // 0d5: sipush 155
      // 0d8: isub
      // 0d9: iload 4
      // 0db: bipush 2
      // 0dc: irem
      // 0dd: sipush 160
      // 0e0: imul
      // 0e1: iadd
      // 0e2: aload 0
      // 0e3: getfield xs7.o1e I
      // 0e6: bipush 6
      // 0e8: idiv
      // 0e9: bipush 12
      // 0eb: isub
      // 0ec: bipush 24
      // 0ee: iload 4
      // 0f0: bipush 1
      // 0f1: ishr
      // 0f2: imul
      // 0f3: iadd
      // 0f4: aload 8
      // 0f6: bipush 0
      // 0f7: invokespecial xs7$ke4.<init> (Lxs7;IIILxdt;Z)V
      // 0fa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ff: pop
      // 100: iinc 4 1
      // 103: goto 10a
      // 106: invokestatic xs7.a (Loov;)Loov;
      // 109: athrow
      // 10a: iinc 7 1
      // 10d: iload 3
      // 10e: ifne 095
      // 111: aload 0
      // 112: getfield xs7.khf Ljava/util/List;
      // 115: new gt4
      // 118: dup
      // 119: sipush 200
      // 11c: aload 0
      // 11d: getfield xs7.dt7 I
      // 120: bipush 2
      // 121: idiv
      // 122: bipush 100
      // 124: isub
      // 125: aload 0
      // 126: getfield xs7.o1e I
      // 129: bipush 6
      // 12b: idiv
      // 12c: sipush 168
      // 12f: iadd
      // 130: sipush 6087
      // 133: ldc2_w 3755534886479007031
      // 136: lload 1
      // 137: lxor
      // 138: invokedynamic f (IJ)Ljava/lang/String; bsm=xs7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: nop
      // 13e: bipush 0
      // 13f: anewarray 41
      // 142: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 145: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 148: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14d: pop
      // 14e: return
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
      // 0c: ifeq 43
      // 0f: goto 16
      // 12: invokestatic xs7.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic xs7.a (Loov;)Loov;
      // 20: athrow
      // 21: sipush 200
      // 24: if_icmpne 43
      // 27: aload 0
      // 28: getfield xs7.f41 Lc05;
      // 2b: getfield c05.oxn Lmoh;
      // 2e: invokevirtual moh.cmo ()V
      // 31: aload 0
      // 32: getfield xs7.f41 Lc05;
      // 35: aload 0
      // 36: getfield xs7.p1i Lgbe;
      // 39: invokevirtual c05.z2i (Lgbe;)V
      // 3c: goto 43
      // 3f: invokestatic xs7.a (Loov;)Loov;
      // 42: athrow
      // 43: return
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      this.xmz();
      this.poi(this.fex, this.tn9, this.dt7 / 2, 15, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   public String qte(xdt var1) {
      float var2 = this.yox.a8l(var1);

      try {
         if (var2 == 0.0F) {
            return this.ird;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (int)(var2 * 100.0F) + "%";
   }

   public static moh pbt(xs7 var0) {
      return var0.yox;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6403743287876526798L, 1101318895335696419L, MethodHandles.lookup().lookupClass()).a(180820288088098L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 127954472390029L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u000b\"\u0019c^\u001c1ÔfÁ\u00908ÝZÚ}\u001f\u0014´\u008cªåIíóÊ\"Ó'\u0084÷«Ý¥W\u0003ºáàK\u0018/Ò~¯¤ä*fÁã\u0092µ8\u009aÍI\u0081\u000b«\u001d\b´\t9";
      int var8 = "\u000b\"\u0019c^\u001c1ÔfÁ\u00908ÝZÚ}\u001f\u0014´\u008cªåIíóÊ\"Ó'\u0084÷«Ý¥W\u0003ºáàK\u0018/Ò~¯¤ä*fÁã\u0092µ8\u009aÍI\u0081\u000b«\u001d\b´\t9"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     g = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "JØ\u0005\u0093á\u0010\u0090\u0084\u0081¶XU\u0091\u001c,ÏO)]X ÿøû@\u009b:Ü(\u0099ì¢\u0010ÿ¤*ûi~\u0018Zð\u0010\u0087¶ö÷É|";
                  var8 = "JØ\u0005\u0093á\u0010\u0090\u0084\u0081¶XU\u0091\u001c,ÏO)]X ÿøû@\u009b:Ü(\u0099ì¢\u0010ÿ¤*ûi~\u0018Zð\u0010\u0087¶ö÷É|".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25084;
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
            throw new RuntimeException("xs7", var10);
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
         throw new RuntimeException("xs7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
