import java.io.IOException;
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

public class nn2$2 implements Runnable {
   public final nn2 bd0;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public nn2$2(nn2 var1) {
      this.bd0 = var1;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic nn2$2.a J
      // 03: ldc2_w 126224057560280
      // 06: lxor
      // 07: lstore 1
      // 08: new nn2$2$1
      // 0b: dup
      // 0c: aload 0
      // 0d: invokespecial nn2$2$1.<init> (Lnn2$2;)V
      // 10: astore 4
      // 12: aload 4
      // 14: bipush 0
      // 15: invokevirtual javax/swing/JFileChooser.setFileSelectionMode (I)V
      // 18: aload 4
      // 1a: bipush 0
      // 1b: invokevirtual javax/swing/JFileChooser.setAcceptAllFileFilterUsed (Z)V
      // 1e: invokestatic t9d.c ()I
      // 21: aload 4
      // 23: new javax/swing/filechooser/FileNameExtensionFilter
      // 26: dup
      // 27: sipush 25077
      // 2a: ldc2_w 4347469786977303362
      // 2d: lload 1
      // 2e: lxor
      // 2f: invokedynamic p (IJ)Ljava/lang/String; bsm=nn2$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: nop
      // 35: bipush 1
      // 36: anewarray 1
      // 39: dup
      // 3a: bipush 0
      // 3b: sipush 9238
      // 3e: ldc2_w 7553403269726256800
      // 41: lload 1
      // 42: lxor
      // 43: invokedynamic p (IJ)Ljava/lang/String; bsm=nn2$2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: nop
      // 49: aastore
      // 4a: invokespecial javax/swing/filechooser/FileNameExtensionFilter.<init> (Ljava/lang/String;[Ljava/lang/String;)V
      // 4d: invokevirtual javax/swing/JFileChooser.addChoosableFileFilter (Ljavax/swing/filechooser/FileFilter;)V
      // 50: istore 3
      // 51: aload 4
      // 53: invokestatic enq._et ()Ljavax/swing/JFrame;
      // 56: invokevirtual javax/swing/JFileChooser.showOpenDialog (Ljava/awt/Component;)I
      // 59: istore 5
      // 5b: iload 5
      // 5d: ifne e6
      // 60: aload 4
      // 62: invokevirtual javax/swing/JFileChooser.getSelectedFile ()Ljava/io/File;
      // 65: astore 6
      // 67: new java/io/BufferedReader
      // 6a: dup
      // 6b: new java/io/FileReader
      // 6e: dup
      // 6f: aload 6
      // 71: invokespecial java/io/FileReader.<init> (Ljava/io/File;)V
      // 74: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 77: astore 7
      // 79: ldc ""
      // 7b: nop
      // 7c: astore 8
      // 7e: aload 7
      // 80: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 83: dup
      // 84: astore 8
      // 86: ifnull cb
      // 89: aload 8
      // 8b: ldc ":"
      // 8d: nop
      // 8e: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 91: astore 9
      // 93: iload 3
      // 94: ifne dc
      // 97: getstatic qd_.oyx Ljava/util/ArrayList;
      // 9a: new x1l
      // 9d: dup
      // 9e: aload 9
      // a0: bipush 0
      // a1: aaload
      // a2: aload 9
      // a4: bipush 1
      // a5: aaload
      // a6: aload 9
      // a8: arraylength
      // a9: bipush 3
      // aa: if_icmpne bf
      // ad: goto b4
      // b0: invokestatic nn2$2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // b3: athrow
      // b4: aload 9
      // b6: bipush 2
      // b7: aaload
      // b8: goto c0
      // bb: invokestatic nn2$2.a (Ljava/io/IOException;)Ljava/io/IOException;
      // be: athrow
      // bf: aconst_null
      // c0: invokespecial x1l.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // c3: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // c6: pop
      // c7: iload 3
      // c8: ifeq 7e
      // cb: aload 7
      // cd: invokevirtual java/io/BufferedReader.close ()V
      // d0: invokestatic qd_.mpj ()V
      // d3: getstatic zwr.qkk Lzwr;
      // d6: invokevirtual zwr.up0 ()Lszk;
      // d9: invokevirtual szk.p5g ()V
      // dc: goto e6
      // df: astore 6
      // e1: aload 6
      // e3: invokevirtual java/io/IOException.printStackTrace ()V
      // e6: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4068551761319242490L, 2630329151508584091L, MethodHandles.lookup().lookupClass()).a(25553218124158L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 135158657040978L;
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
      String var6 = "\u0080\u0007\u008an¦\u009a\u0090·äÿ\u0087~\u0010ý³Î02:ñNyìád(\u0000\u0011¸²î\u009d1À\u0000ß\b\u0093w»\u00adêónâ\u0093l>ä84Éµ»Ü~¬Ô\u0087)9½\u000b!ÿ";
      int var8 = "\u0080\u0007\u008an¦\u009a\u0090·äÿ\u0087~\u0010ý³Î02:ñNyìád(\u0000\u0011¸²î\u009d1À\u0000ß\b\u0093w»\u00adêónâ\u0093l>ä84Éµ»Ü~¬Ô\u0087)9½\u000b!ÿ"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IOException a(IOException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9769;
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
            throw new RuntimeException("nn2$2", var10);
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
         throw new RuntimeException("nn2$2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
