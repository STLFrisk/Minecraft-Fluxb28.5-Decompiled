import com.google.common.base.Splitter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class imx extends snh implements Closeable {
   public static final Splitter lce;
   private static final long a;
   private static final String f;

   public imx(File var1) {
      super(var1);
   }

   private ZipFile _7v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield imx.wpa Ljava/util/zip/ZipFile;
      // 08: iload 1
      // 09: ifne 30
      // 0c: ifnonnull 2c
      // 0f: goto 16
      // 12: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: new java/util/zip/ZipFile
      // 1a: dup
      // 1b: aload 0
      // 1c: getfield imx.bdn Ljava/io/File;
      // 1f: invokespecial java/util/zip/ZipFile.<init> (Ljava/io/File;)V
      // 22: putfield imx.wpa Ljava/util/zip/ZipFile;
      // 25: goto 2c
      // 28: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield imx.wpa Ljava/util/zip/ZipFile;
      // 30: areturn
   }

   @Override
   public InputStream m0v(String var1) {
      ZipFile var2 = this._7v();
      ZipEntry var3 = var2.getEntry(var1);

      try {
         if (var3 == null) {
            throw new dgy(this.bdn, var1);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var2.getInputStream(var3);
   }

   @Override
   public boolean yen(String var1) {
      try {
         try {
            if (this._7v().getEntry(var1) != null) {
               return true;
            }
         } catch (IOException var3) {
            throw a(var3);
         }

         return false;
      } catch (IOException var4) {
         return false;
      }
   }

   @Override
   public Set olh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic imx.a J
      // 03: ldc2_w 11603163022727
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokespecial imx._7v ()Ljava/util/zip/ZipFile;
      // 10: astore 4
      // 12: goto 1b
      // 15: astore 5
      // 17: invokestatic java/util/Collections.emptySet ()Ljava/util/Set;
      // 1a: areturn
      // 1b: aload 4
      // 1d: invokevirtual java/util/zip/ZipFile.entries ()Ljava/util/Enumeration;
      // 20: astore 5
      // 22: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 25: astore 6
      // 27: aload 5
      // 29: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 2e: ifeq c5
      // 31: aload 5
      // 33: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 38: checkcast java/util/zip/ZipEntry
      // 3b: astore 7
      // 3d: aload 7
      // 3f: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 42: astore 8
      // 44: aload 8
      // 46: getstatic imx.f Ljava/lang/String;
      // 49: nop
      // 4a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 4d: ifeq c1
      // 50: getstatic imx.lce Lcom/google/common/base/Splitter;
      // 53: aload 8
      // 55: invokevirtual com/google/common/base/Splitter.split (Ljava/lang/CharSequence;)Ljava/lang/Iterable;
      // 58: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 5b: astore 9
      // 5d: aload 9
      // 5f: iload 3
      // 60: ifne 82
      // 63: invokeinterface java/util/List.size ()I 1
      // 68: bipush 1
      // 69: if_icmple c1
      // 6c: goto 73
      // 6f: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72: athrow
      // 73: aload 9
      // 75: bipush 1
      // 76: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7b: goto 82
      // 7e: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 81: athrow
      // 82: checkcast java/lang/String
      // 85: astore 10
      // 87: aload 10
      // 89: aload 10
      // 8b: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 8e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 91: iload 3
      // 92: ifne c0
      // 95: ifne b0
      // 98: goto 9f
      // 9b: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: aload 0
      // a0: aload 10
      // a2: invokevirtual imx.mcb (Ljava/lang/String;)V
      // a5: iload 3
      // a6: ifeq c1
      // a9: goto b0
      // ac: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af: athrow
      // b0: aload 6
      // b2: aload 10
      // b4: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // b9: goto c0
      // bc: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bf: athrow
      // c0: pop
      // c1: iload 3
      // c2: ifeq 27
      // c5: aload 6
      // c7: areturn
   }

   @Override
   public void finalize() {
      this.close();
      super.finalize();
   }

   @Override
   public void close() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield imx.wpa Ljava/util/zip/ZipFile;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 29
      // 0f: goto 16
      // 12: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield imx.wpa Ljava/util/zip/ZipFile;
      // 1a: goto 21
      // 1d: invokestatic imx.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: invokevirtual java/util/zip/ZipFile.close ()V
      // 24: aload 0
      // 25: aconst_null
      // 26: putfield imx.wpa Ljava/util/zip/ZipFile;
      // 29: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(263551888287642997L, 8471516010527062198L, MethodHandles.lookup().lookupClass()).a(27687199678931L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 132926620175310L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("´»¿VÞ\u009e!½".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
      lce = Splitter.on('/').omitEmptyStrings().limit(3);
   }

   private static Exception a(Exception var0) {
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
}
