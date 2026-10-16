import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Keyboard;

public class isValidTarget extends ShaderHelper {
   public static InetSocketAddress hjm;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public isValidTarget(ShaderHelper var1) {
      this.j0c = var1;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 20465021163909L;
      this.khf.clear();
      int var10005 = this.dt7 / 2 - 100;
      (this.nru = new jqk(0, Minecraft.vz1().tx1, var10005, this.o1e / 4 + 20, 200, 20)).z5t(250);
      this.khf.add(new gt4(0, this.dt7 / 2 - 100, this.o1e / 4 + 70, b<"s">(18472, 919037067770123880L ^ var1)));
      this.khf.add(new gt4(2, this.dt7 / 2 - 100, this.o1e / 4 + 95, b<"s">(20729, 1245105808128462527L ^ var1)));
      Keyboard.enableRepeatEvents(true);
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield gt4._me I
      // 08: iload 2
      // 09: ifne 48
      // 0c: lookupswitch 166 2 0 32 2 148
      // 28: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield isValidTarget.nru Ljqk;
      // 30: invokevirtual jqk.xct ()Ljava/lang/String;
      // 33: iload 2
      // 34: ifne 5a
      // 37: goto 3e
      // 3a: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 41: goto 48
      // 44: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: ifne 91
      // 4b: aload 0
      // 4c: getfield isValidTarget.nru Ljqk;
      // 4f: invokevirtual jqk.xct ()Ljava/lang/String;
      // 52: ldc ":"
      // 54: nop
      // 55: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 58: bipush 0
      // 59: aaload
      // 5a: astore 3
      // 5b: aload 0
      // 5c: getfield isValidTarget.nru Ljqk;
      // 5f: invokevirtual jqk.xct ()Ljava/lang/String;
      // 62: ldc ":"
      // 64: nop
      // 65: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 68: bipush 1
      // 69: aaload
      // 6a: astore 4
      // 6c: new java/net/InetSocketAddress
      // 6f: dup
      // 70: aload 3
      // 71: aload 4
      // 73: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 76: invokespecial java/net/InetSocketAddress.<init> (Ljava/lang/String;I)V
      // 79: putstatic isValidTarget.hjm Ljava/net/InetSocketAddress;
      // 7c: aload 0
      // 7d: aconst_null
      // 7e: putfield isValidTarget.sr3 Ljava/lang/String;
      // 81: goto b2
      // 84: astore 3
      // 85: aload 0
      // 86: aload 3
      // 87: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 8a: putfield isValidTarget.sr3 Ljava/lang/String;
      // 8d: iload 2
      // 8e: ifeq b2
      // 91: aconst_null
      // 92: putstatic isValidTarget.hjm Ljava/net/InetSocketAddress;
      // 95: iload 2
      // 96: ifeq b2
      // 99: goto a0
      // 9c: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f: athrow
      // a0: aload 0
      // a1: getfield isValidTarget.f41 Lc05;
      // a4: aload 0
      // a5: getfield isValidTarget.j0c Lgbe;
      // a8: invokevirtual Minecraft.z2i (Lgbe;)V
      // ab: goto b2
      // ae: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b1: athrow
      // b2: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 26
      // 09: getfield isValidTarget.nru Ljqk;
      // 0c: iload 1
      // 0d: iload 2
      // 0e: invokevirtual jqk.pst (CI)Z
      // 11: pop
      // 12: iload 2
      // 13: bipush 1
      // 14: if_icmpne 30
      // 17: goto 1e
      // 1a: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: getfield isValidTarget.f41 Lc05;
      // 29: aload 0
      // 2a: getfield isValidTarget.j0c Lgbe;
      // 2d: invokevirtual Minecraft.z2i (Lgbe;)V
      // 30: return
   }

   @Override
   public void mouseClicked(int var1, int var2, int var3) {
      this.nru.elk(var1, var2, var3);
      super.mouseClicked(var1, var2, var3);
   }

   @Override
   public void updateScreen() {
      this.nru.zf9();
      super.updateScreen();
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic isValidTarget.a J
      // 003: ldc2_w 11848674820794
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: invokevirtual isValidTarget.xmz ()V
      // 00d: invokestatic OpaquePredicate.c ()I
      // 010: aload 0
      // 011: invokestatic Minecraft.vz1 ()Lc05;
      // 014: getfield Minecraft.tx1 Lowt;
      // 017: sipush 9535
      // 01a: ldc2_w 7057441257742557249
      // 01d: lload 4
      // 01f: lxor
      // 020: invokedynamic s (IJ)Ljava/lang/String; bsm=isValidTarget.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: nop
      // 026: aload 0
      // 027: getfield isValidTarget.dt7 I
      // 02a: bipush 2
      // 02b: idiv
      // 02c: bipush 48
      // 02e: bipush -1
      // 02f: invokevirtual isValidTarget.poi (Lowt;Ljava/lang/String;III)V
      // 032: istore 6
      // 034: aload 0
      // 035: getfield isValidTarget.nru Ljqk;
      // 038: invokevirtual jqk.dy2 ()V
      // 03b: aload 0
      // 03c: invokestatic Minecraft.vz1 ()Lc05;
      // 03f: getfield Minecraft.tx1 Lowt;
      // 042: sipush 8194
      // 045: ldc2_w 6807666779942217082
      // 048: lload 4
      // 04a: lxor
      // 04b: invokedynamic s (IJ)Ljava/lang/String; bsm=isValidTarget.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: nop
      // 051: aload 0
      // 052: getfield isValidTarget.dt7 I
      // 055: bipush 2
      // 056: idiv
      // 057: bipush 100
      // 059: isub
      // 05a: aload 0
      // 05b: getfield isValidTarget.o1e I
      // 05e: bipush 4
      // 05f: idiv
      // 060: bipush 8
      // 062: iadd
      // 063: bipush -1
      // 064: invokevirtual isValidTarget.c_t (Lowt;Ljava/lang/String;III)V
      // 067: getstatic isValidTarget.hjm Ljava/net/InetSocketAddress;
      // 06a: ifnonnull 083
      // 06d: sipush 22280
      // 070: ldc2_w 2206828697923261044
      // 073: lload 4
      // 075: lxor
      // 076: invokedynamic s (IJ)Ljava/lang/String; bsm=isValidTarget.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: nop
      // 07c: goto 0a5
      // 07f: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: new java/lang/StringBuilder
      // 086: dup
      // 087: invokespecial java/lang/StringBuilder.<init> ()V
      // 08a: getstatic isValidTarget.hjm Ljava/net/InetSocketAddress;
      // 08d: invokevirtual java/net/InetSocketAddress.getHostString ()Ljava/lang/String;
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: ldc ":"
      // 095: nop
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: getstatic isValidTarget.hjm Ljava/net/InetSocketAddress;
      // 09c: invokevirtual java/net/InetSocketAddress.getPort ()I
      // 09f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a5: astore 7
      // 0a7: aload 0
      // 0a8: invokestatic Minecraft.vz1 ()Lc05;
      // 0ab: getfield Minecraft.tx1 Lowt;
      // 0ae: new java/lang/StringBuilder
      // 0b1: dup
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: sipush 10261
      // 0b8: ldc2_w 3977246534704852328
      // 0bb: lload 4
      // 0bd: lxor
      // 0be: invokedynamic s (IJ)Ljava/lang/String; bsm=isValidTarget.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: nop
      // 0c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c7: aload 7
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cf: aload 0
      // 0d0: getfield isValidTarget.dt7 I
      // 0d3: bipush 2
      // 0d4: idiv
      // 0d5: bipush 12
      // 0d7: bipush -1
      // 0d8: invokevirtual isValidTarget.poi (Lowt;Ljava/lang/String;III)V
      // 0db: aload 0
      // 0dc: iload 6
      // 0de: ifne 112
      // 0e1: getfield isValidTarget.sr3 Ljava/lang/String;
      // 0e4: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 0e7: ifne 111
      // 0ea: goto 0f1
      // 0ed: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: invokestatic Minecraft.vz1 ()Lc05;
      // 0f5: getfield Minecraft.tx1 Lowt;
      // 0f8: aload 0
      // 0f9: getfield isValidTarget.sr3 Ljava/lang/String;
      // 0fc: aload 0
      // 0fd: getfield isValidTarget.dt7 I
      // 100: bipush 2
      // 101: idiv
      // 102: bipush 24
      // 104: ldc 16711680
      // 106: nop
      // 107: invokevirtual isValidTarget.poi (Lowt;Ljava/lang/String;III)V
      // 10a: goto 111
      // 10d: invokestatic isValidTarget.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 0
      // 112: iload 1
      // 113: iload 2
      // 114: fload 3
      // 115: invokespecial ShaderHelper.drawScreen (IIF)V
      // 118: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5460021618912408782L, 4906817706083025125L, MethodHandles.lookup().lookupClass()).a(239520593228957L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 1431990701826L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "\u00165Û5_\u0002¹]åO¡\u008c÷¡<Â(Íµ\u0019\u0017\u008f;0\u0081\u008a8\u0084\u0006¨?\u00adûo\u000e\u009d9\u0098òÎ«Åt\u0007¢O^\u0090e°Ã\u009a)[e070?Íû\u009f¯B\u0010AÑ:3å4§E¡úlÐ²0ne]0Ãá¢I<YÆ\u0005\u0091ÿ@\n0\u0003µ\u0096ÿßD\r\u0015Ý\u0089\u0010\u000båZ¿ú³\u0082\u001eÆ\u0001Y¯\u009cßÁ\u008a";
      int var8 = "\u00165Û5_\u0002¹]åO¡\u008c÷¡<Â(Íµ\u0019\u0017\u008f;0\u0081\u008a8\u0084\u0006¨?\u00adûo\u000e\u009d9\u0098òÎ«Åt\u0007¢O^\u0090e°Ã\u009a)[e070?Íû\u009f¯B\u0010AÑ:3å4§E¡úlÐ²0ne]0Ãá¢I<YÆ\u0005\u0091ÿ@\n0\u0003µ\u0096ÿßD\r\u0015Ý\u0089\u0010\u000båZ¿ú³\u0082\u001eÆ\u0001Y¯\u009cßÁ\u008a"
         .length();
      char var5 = 16;
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
                     g = new String[6];
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

                  var6 = "D!\u0015Ñç\u0095¿ÉH\u009eù¾÷\b\u009b\u008c\u0010\u008c\u008f}Ý©·l-§A\u0092Õç ;\u0016";
                  var8 = "D!\u0015Ñç\u0095¿ÉH\u009eù¾÷\b\u009b\u008c\u0010\u008c\u008f}Ý©·l-§A\u0092Õç ;\u0016".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25934;
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
            throw new RuntimeException("isValidTarget", var10);
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
         throw new RuntimeException("isValidTarget" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
