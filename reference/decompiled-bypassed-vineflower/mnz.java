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
import org.lwjgl.input.Keyboard;

public class mnz extends gbe {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public mnz(gbe var1, r1l var2) {
      this.kml = var1;
      this.s03 = var2;
   }

   @Override
   public void updateScreen() {
      this.meu.zf9();
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
      // 000: getstatic mnz.a J
      // 003: ldc2_w 15105496098780
      // 006: lxor
      // 007: lstore 1
      // 008: bipush 1
      // 009: invokestatic org/lwjgl/input/Keyboard.enableRepeatEvents (Z)V
      // 00c: aload 0
      // 00d: getfield mnz.khf Ljava/util/List;
      // 010: invokeinterface java/util/List.clear ()V 1
      // 015: invokestatic t9d.c ()I
      // 018: aload 0
      // 019: getfield mnz.khf Ljava/util/List;
      // 01c: new gt4
      // 01f: dup
      // 020: bipush 0
      // 021: aload 0
      // 022: getfield mnz.dt7 I
      // 025: bipush 2
      // 026: idiv
      // 027: bipush 100
      // 029: isub
      // 02a: aload 0
      // 02b: getfield mnz.o1e I
      // 02e: bipush 4
      // 02f: idiv
      // 030: bipush 96
      // 032: iadd
      // 033: bipush 12
      // 035: iadd
      // 036: sipush 18362
      // 039: ldc2_w 7359367683250478086
      // 03c: lload 1
      // 03d: lxor
      // 03e: invokedynamic m (IJ)Ljava/lang/String; bsm=mnz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: nop
      // 044: bipush 0
      // 045: anewarray 67
      // 048: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 04b: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 04e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 053: pop
      // 054: istore 3
      // 055: aload 0
      // 056: getfield mnz.khf Ljava/util/List;
      // 059: new gt4
      // 05c: dup
      // 05d: bipush 1
      // 05e: aload 0
      // 05f: getfield mnz.dt7 I
      // 062: bipush 2
      // 063: idiv
      // 064: bipush 100
      // 066: isub
      // 067: aload 0
      // 068: getfield mnz.o1e I
      // 06b: bipush 4
      // 06c: idiv
      // 06d: bipush 120
      // 06f: iadd
      // 070: bipush 12
      // 072: iadd
      // 073: sipush 3288
      // 076: ldc2_w 1667973412817803109
      // 079: lload 1
      // 07a: lxor
      // 07b: invokedynamic m (IJ)Ljava/lang/String; bsm=mnz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: nop
      // 081: bipush 0
      // 082: anewarray 67
      // 085: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 088: invokespecial gt4.<init> (IIILjava/lang/String;)V
      // 08b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 090: pop
      // 091: aload 0
      // 092: new jqk
      // 095: dup
      // 096: bipush 2
      // 097: aload 0
      // 098: getfield mnz.fex Lowt;
      // 09b: aload 0
      // 09c: getfield mnz.dt7 I
      // 09f: bipush 2
      // 0a0: idiv
      // 0a1: bipush 100
      // 0a3: isub
      // 0a4: bipush 116
      // 0a6: sipush 200
      // 0a9: bipush 20
      // 0ab: invokespecial jqk.<init> (ILowt;IIII)V
      // 0ae: putfield mnz.meu Ljqk;
      // 0b1: aload 0
      // 0b2: getfield mnz.meu Ljqk;
      // 0b5: sipush 128
      // 0b8: invokevirtual jqk.z5t (I)V
      // 0bb: aload 0
      // 0bc: getfield mnz.meu Ljqk;
      // 0bf: bipush 1
      // 0c0: invokevirtual jqk._c6 (Z)V
      // 0c3: aload 0
      // 0c4: getfield mnz.meu Ljqk;
      // 0c7: aload 0
      // 0c8: getfield mnz.f41 Lc05;
      // 0cb: getfield c05.oxn Lmoh;
      // 0ce: getfield moh._2y Ljava/lang/String;
      // 0d1: invokevirtual jqk.nrl (Ljava/lang/String;)V
      // 0d4: aload 0
      // 0d5: getfield mnz.khf Ljava/util/List;
      // 0d8: bipush 0
      // 0d9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0de: checkcast gt4
      // 0e1: aload 0
      // 0e2: getfield mnz.meu Ljqk;
      // 0e5: invokevirtual jqk.xct ()Ljava/lang/String;
      // 0e8: invokevirtual java/lang/String.length ()I
      // 0eb: iload 3
      // 0ec: ifne 10e
      // 0ef: ifle 120
      // 0f2: goto 0f9
      // 0f5: invokestatic mnz.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: getfield mnz.meu Ljqk;
      // 0fd: invokevirtual jqk.xct ()Ljava/lang/String;
      // 100: ldc ":"
      // 102: nop
      // 103: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 106: arraylength
      // 107: goto 10e
      // 10a: invokestatic mnz.a (Loov;)Loov;
      // 10d: athrow
      // 10e: iload 3
      // 10f: ifne 11d
      // 112: ifle 120
      // 115: goto 11c
      // 118: invokestatic mnz.a (Loov;)Loov;
      // 11b: athrow
      // 11c: bipush 1
      // 11d: goto 121
      // 120: bipush 0
      // 121: putfield gt4.c9a Z
      // 124: return
   }

   @Override
   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
      this.f41.oxn._2y = this.meu.xct();
      this.f41.oxn.cmo();
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
      // 0c: ifeq 70
      // 0f: goto 16
      // 12: invokestatic mnz.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield gt4._me I
      // 1a: goto 21
      // 1d: invokestatic mnz.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 4f
      // 25: bipush 1
      // 26: if_icmpne 44
      // 29: goto 30
      // 2c: invokestatic mnz.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield mnz.kml Lgbe;
      // 34: bipush 0
      // 35: bipush 0
      // 36: invokevirtual gbe.confirmClicked (ZI)V
      // 39: iload 2
      // 3a: ifne 70
      // 3d: goto 44
      // 40: invokestatic mnz.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 1
      // 45: getfield gt4._me I
      // 48: goto 4f
      // 4b: invokestatic mnz.a (Loov;)Loov;
      // 4e: athrow
      // 4f: ifne 70
      // 52: aload 0
      // 53: getfield mnz.s03 Lr1l;
      // 56: aload 0
      // 57: getfield mnz.meu Ljqk;
      // 5a: invokevirtual jqk.xct ()Ljava/lang/String;
      // 5d: putfield r1l.s4c Ljava/lang/String;
      // 60: aload 0
      // 61: getfield mnz.kml Lgbe;
      // 64: bipush 1
      // 65: bipush 0
      // 66: invokevirtual gbe.confirmClicked (ZI)V
      // 69: goto 70
      // 6c: invokestatic mnz.a (Loov;)Loov;
      // 6f: athrow
      // 70: return
   }

   @Override
   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield mnz.meu Ljqk;
      // 08: iload 1
      // 09: iload 2
      // 0a: invokevirtual jqk.pst (CI)Z
      // 0d: iload 3
      // 0e: ifeq 7e
      // 11: ifeq 76
      // 14: goto 1b
      // 17: invokestatic mnz.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield mnz.khf Ljava/util/List;
      // 1f: bipush 0
      // 20: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 25: checkcast gt4
      // 28: aload 0
      // 29: getfield mnz.meu Ljqk;
      // 2c: invokevirtual jqk.xct ()Ljava/lang/String;
      // 2f: invokevirtual java/lang/String.length ()I
      // 32: iload 3
      // 33: ifeq 5c
      // 36: goto 3d
      // 39: invokestatic mnz.a (Loov;)Loov;
      // 3c: athrow
      // 3d: ifle 6e
      // 40: goto 47
      // 43: invokestatic mnz.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: getfield mnz.meu Ljqk;
      // 4b: invokevirtual jqk.xct ()Ljava/lang/String;
      // 4e: ldc ":"
      // 50: nop
      // 51: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 54: arraylength
      // 55: goto 5c
      // 58: invokestatic mnz.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 3
      // 5d: ifeq 6b
      // 60: ifle 6e
      // 63: goto 6a
      // 66: invokestatic mnz.a (Loov;)Loov;
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 6f
      // 6e: bipush 0
      // 6f: putfield gt4.c9a Z
      // 72: iload 3
      // 73: ifne b4
      // 76: iload 2
      // 77: goto 7e
      // 7a: invokestatic mnz.a (Loov;)Loov;
      // 7d: athrow
      // 7e: bipush 28
      // 80: iload 3
      // 81: ifeq 99
      // 84: if_icmpeq 9c
      // 87: goto 8e
      // 8a: invokestatic mnz.a (Loov;)Loov;
      // 8d: athrow
      // 8e: iload 2
      // 8f: sipush 156
      // 92: goto 99
      // 95: invokestatic mnz.a (Loov;)Loov;
      // 98: athrow
      // 99: if_icmpne b4
      // 9c: aload 0
      // 9d: aload 0
      // 9e: getfield mnz.khf Ljava/util/List;
      // a1: bipush 0
      // a2: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // a7: checkcast gt4
      // aa: invokevirtual mnz.actionPerformed (Lgt4;)V
      // ad: goto b4
      // b0: invokestatic mnz.a (Loov;)Loov;
      // b3: athrow
      // b4: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      super.mouseClicked(var1, var2, var3);
      this.meu.elk(var1, var2, var3);
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 24083423460579L;
      this.xmz();
      this.poi(this.fex, fc1.gx1(b<"m">(7009, 4474154934381861856L ^ var4), new Object[0]), this.dt7 / 2, 20, 16777215);
      this.c_t(this.fex, fc1.gx1(b<"m">(5924, 6043135972001634212L ^ var4), new Object[0]), this.dt7 / 2 - 100, 100, 10526880);
      this.meu.dy2();
      super.drawScreen(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2457540423506159258L, 3750500170010204680L, MethodHandles.lookup().lookupClass()).a(80202037351280L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 124462708230431L;
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
      String var6 = "\u0010°¤\u0005\u0013ü@KD<¨¯\u0000»ç\u00071W\u0005\"mmZA½æ´\u0016\u00adÐd](-\u000eðpË\u001c5\u0017ÄÔ\u00814\u008eÖò*\u0099÷R<û\u0081rÝ\u0000:-¼¡ú,\rvõ¥*õÅÒÔ";
      int var8 = "\u0010°¤\u0005\u0013ü@KD<¨¯\u0000»ç\u00071W\u0005\"mmZA½æ´\u0016\u00adÐd](-\u000eðpË\u001c5\u0017ÄÔ\u00814\u008eÖò*\u0099÷R<û\u0081rÝ\u0000:-¼¡ú,\rvõ¥*õÅÒÔ"
         .length();
      char var5 = ' ';
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

                  var6 = "h\u0001àöõð\u0017ÀÑ^c6\u00adå\u0004ÉåßE/G\u0088ÿÉÆ×¶y ¹HµvWk\u0012í}\u000eü(öÜ\\iõë\u008bª\u008aê¡¯>\u0012{ÑÜ¹¢u;ïz\u009eíÚú\u0096\u0013Ü²$\u0004WÑ\u0084+W©å";
                  var8 = "h\u0001àöõð\u0017ÀÑ^c6\u00adå\u0004ÉåßE/G\u0088ÿÉÆ×¶y ¹HµvWk\u0012í}\u000eü(öÜ\\iõë\u008bª\u008aê¡¯>\u0012{ÑÜ¹¢u;ïz\u009eíÚú\u0096\u0013Ü²$\u0004WÑ\u0084+W©å"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24752;
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
            throw new RuntimeException("mnz", var10);
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
         throw new RuntimeException("mnz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
