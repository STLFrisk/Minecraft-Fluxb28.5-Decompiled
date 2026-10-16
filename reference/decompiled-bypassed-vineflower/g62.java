import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g62 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static bdo xe6(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)));

      bdo var2;
      try {
         var2 = z3b(var1, btc.pzg);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void bhd(bdo var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)));

      try {
         ehq(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static void uhp(bdo param0, File param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g62.a J
      // 03: ldc2_w 79492228850859
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: new java/io/File
      // 10: dup
      // 11: new java/lang/StringBuilder
      // 14: dup
      // 15: invokespecial java/lang/StringBuilder.<init> ()V
      // 18: aload 1
      // 19: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 1c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f: sipush 276
      // 22: ldc2_w 7281462471239799146
      // 25: lload 2
      // 26: lxor
      // 27: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: nop
      // 2d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 33: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 36: astore 5
      // 38: aload 5
      // 3a: invokevirtual java/io/File.exists ()Z
      // 3d: iload 4
      // 3f: ifeq 63
      // 42: ifeq 59
      // 45: goto 4c
      // 48: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: aload 5
      // 4e: invokevirtual java/io/File.delete ()Z
      // 51: pop
      // 52: goto 59
      // 55: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: aload 0
      // 5a: aload 5
      // 5c: invokestatic g62.ekq (Lbdo;Ljava/io/File;)V
      // 5f: aload 1
      // 60: invokevirtual java/io/File.exists ()Z
      // 63: iload 4
      // 65: ifeq 82
      // 68: ifeq 7e
      // 6b: goto 72
      // 6e: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: aload 1
      // 73: invokevirtual java/io/File.delete ()Z
      // 76: pop
      // 77: goto 7e
      // 7a: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: aload 1
      // 7f: invokevirtual java/io/File.exists ()Z
      // 82: iload 4
      // 84: ifeq c2
      // 87: ifeq bc
      // 8a: goto 91
      // 8d: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: new java/io/IOException
      // 94: dup
      // 95: new java/lang/StringBuilder
      // 98: dup
      // 99: invokespecial java/lang/StringBuilder.<init> ()V
      // 9c: sipush 26765
      // 9f: ldc2_w 3024338509423376626
      // a2: lload 2
      // a3: lxor
      // a4: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: nop
      // aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ad: aload 1
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b4: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // b7: athrow
      // b8: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bb: athrow
      // bc: aload 5
      // be: aload 1
      // bf: invokevirtual java/io/File.renameTo (Ljava/io/File;)Z
      // c2: pop
      // c3: return
   }

   public static void ekq(bdo var0, File var1) {
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         ehq(var0, var2);
      } finally {
         var2.close();
      }
   }

   public static bdo zgm(File var0) {
      try {
         if (!var0.exists()) {
            return null;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

      bdo var2;
      try {
         var2 = z3b(var1, btc.pzg);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static bdo za6(DataInputStream var0) {
      return z3b(var0, btc.pzg);
   }

   public static bdo z3b(DataInput param0, btc param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g62.a J
      // 03: ldc2_w 112984795773844
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: bipush 0
      // 0f: aload 1
      // 10: invokestatic g62._m8 (Ljava/io/DataInput;ILbtc;)Lgdw;
      // 13: astore 5
      // 15: aload 5
      // 17: iload 4
      // 19: ifeq 32
      // 1c: instanceof bdo
      // 1f: ifeq 36
      // 22: goto 29
      // 25: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 5
      // 2b: goto 32
      // 2e: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: checkcast bdo
      // 35: areturn
      // 36: new java/io/IOException
      // 39: dup
      // 3a: sipush 29377
      // 3d: ldc2_w 5785432532709129604
      // 40: lload 2
      // 41: lxor
      // 42: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 4b: athrow
   }

   public static void ehq(bdo var0, DataOutput var1) {
      elg(var0, var1);
   }

   private static void elg(gdw param0, DataOutput param1) {
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
      // 05: aload 0
      // 06: invokevirtual gdw.ky0 ()B
      // 09: invokeinterface java/io/DataOutput.writeByte (I)V 2
      // 0e: aload 0
      // 0f: iload 2
      // 10: ifeq 31
      // 13: invokevirtual gdw.ky0 ()B
      // 16: ifeq 35
      // 19: goto 20
      // 1c: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: ldc ""
      // 23: nop
      // 24: invokeinterface java/io/DataOutput.writeUTF (Ljava/lang/String;)V 2
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 1
      // 32: invokevirtual gdw.b_8 (Ljava/io/DataOutput;)V
      // 35: return
   }

   private static gdw _m8(DataInput param0, int param1, btc param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g62.a J
      // 03: ldc2_w 90199218900236
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: invokeinterface java/io/DataInput.readByte ()B 1
      // 13: istore 6
      // 15: iload 6
      // 17: iload 5
      // 19: ifne 3b
      // 1c: ifne 32
      // 1f: goto 26
      // 22: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: new zv6
      // 29: dup
      // 2a: invokespecial zv6.<init> ()V
      // 2d: areturn
      // 2e: invokestatic g62.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: invokeinterface java/io/DataInput.readUTF ()Ljava/lang/String; 1
      // 38: pop
      // 39: iload 6
      // 3b: invokestatic gdw.nt6 (B)Lgdw;
      // 3e: astore 7
      // 40: aload 7
      // 42: aload 0
      // 43: iload 1
      // 44: aload 2
      // 45: invokevirtual gdw.zwk (Ljava/io/DataInput;ILbtc;)V
      // 48: aload 7
      // 4a: areturn
      // 4b: astore 8
      // 4d: aload 8
      // 4f: sipush 30133
      // 52: ldc2_w 1405303818054437993
      // 55: lload 3
      // 56: lxor
      // 57: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 60: astore 9
      // 62: aload 9
      // 64: sipush 626
      // 67: ldc2_w 4671804694750985128
      // 6a: lload 3
      // 6b: lxor
      // 6c: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: nop
      // 72: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 75: astore 10
      // 77: aload 10
      // 79: sipush 10496
      // 7c: ldc2_w 5452327906413498590
      // 7f: lload 3
      // 80: lxor
      // 81: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: nop
      // 87: sipush 17088
      // 8a: ldc2_w 4309968743256406815
      // 8d: lload 3
      // 8e: lxor
      // 8f: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: nop
      // 95: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 98: aload 10
      // 9a: sipush 23925
      // 9d: ldc2_w 805399381565973678
      // a0: lload 3
      // a1: lxor
      // a2: invokedynamic s (IJ)Ljava/lang/String; bsm=g62.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: nop
      // a8: iload 6
      // aa: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // ad: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // b0: new oov
      // b3: dup
      // b4: aload 9
      // b6: invokespecial oov.<init> (Le1i;)V
      // b9: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(453911054115543001L, -5336497493629356114L, MethodHandles.lookup().lookupClass()).a(95037916815575L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 4663580111489L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u001eÕ¤¯\u0080À\u0088\u008d\u0012´v\u0087\u0019¶\u0090\u0003\u0018 í&a7\u009480\u0092§|°²\u0083\u009d*q\u001aü«\u0010\u008f\u00888(òø!©û\u001c\u0012\u0003o²\u0088 '#Ð&f þmtyGñêG\u0017[§\u001bP\u0092æ\u001a+ã\u0011\u0018â<\u0010\u0017YÁwK\u009cÎÖG ¦o¤Þû\u0017 ó\u0087,»;D\u0004\u0091{ãÖTÕ\u0002Ç\u001551;íd\u001b3oe\u0011W\u0098_\u008fZp\u0018l}w\u0091dÉ~Q4:\u0018Ó\u009d`I±\u0083Pã\u0006ÓÞ\u001aê";
      int var8 = "\u001eÕ¤¯\u0080À\u0088\u008d\u0012´v\u0087\u0019¶\u0090\u0003\u0018 í&a7\u009480\u0092§|°²\u0083\u009d*q\u001aü«\u0010\u008f\u00888(òø!©û\u001c\u0012\u0003o²\u0088 '#Ð&f þmtyGñêG\u0017[§\u001bP\u0092æ\u001a+ã\u0011\u0018â<\u0010\u0017YÁwK\u009cÎÖG ¦o¤Þû\u0017 ó\u0087,»;D\u0004\u0091{ãÖTÕ\u0002Ç\u001551;íd\u001b3oe\u0011W\u0098_\u008fZp\u0018l}w\u0091dÉ~Q4:\u0018Ó\u009d`I±\u0083Pã\u0006ÓÞ\u001aê"
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
                     c = new String[8];
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

                  var6 = "á:yU»ï+Qöx\u0005\u0088Ú¶N\u009fÆ2oÃoö²gX¼Z}\u0082/Ã,pÝÌ \rH\u0017\u0094@3\u0088\u0094}×>R5\u0092J\u008e#}5æSéRl¡eG\u00111ÊÀK-b\u0011\u008b\u0091ÿ\\_\u0018\u0098¾|±\u0007\u0003e\u0086\u0007HÀK7z\u0097?\u000f~\\¬Y¸ÿn\u001c,9¿";
                  var8 = "á:yU»ï+Qöx\u0005\u0088Ú¶N\u009fÆ2oÃoö²gX¼Z}\u0082/Ã,pÝÌ \rH\u0017\u0094@3\u0088\u0094}×>R5\u0092J\u008e#}5æSéRl¡eG\u00111ÊÀK-b\u0011\u008b\u0091ÿ\\_\u0018\u0098¾|±\u0007\u0003e\u0086\u0007HÀK7z\u0097?\u000f~\\¬Y¸ÿn\u001c,9¿"
                     .length();
                  var5 = '(';
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14069;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("g62", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("g62" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
