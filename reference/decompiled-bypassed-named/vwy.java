import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vwy extends snh {
   private static final long a;
   private static final String f;

   public vwy(File var1) {
      super(var1);
   }

   @Override
   public InputStream m0v(String var1) {
      return new BufferedInputStream(new FileInputStream(new File(this.bdn, var1)));
   }

   @Override
   public boolean yen(String var1) {
      return new File(this.bdn, var1).isFile();
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
      // 00: getstatic vwy.a J
      // 03: ldc2_w 74490765355240
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 0b: astore 4
      // 0d: invokestatic OpaquePredicate.c ()I
      // 10: new java/io/File
      // 13: dup
      // 14: aload 0
      // 15: getfield vwy.bdn Ljava/io/File;
      // 18: getstatic vwy.f Ljava/lang/String;
      // 1b: nop
      // 1c: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 1f: astore 5
      // 21: istore 3
      // 22: aload 5
      // 24: iload 3
      // 25: ifne 3e
      // 28: invokevirtual java/io/File.isDirectory ()Z
      // 2b: ifeq b1
      // 2e: goto 35
      // 31: invokestatic vwy.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 5
      // 37: goto 3e
      // 3a: invokestatic vwy.a (Loov;)Loov;
      // 3d: athrow
      // 3e: getstatic org/apache/commons/io/filefilter/DirectoryFileFilter.DIRECTORY Lorg/apache/commons/io/filefilter/IOFileFilter;
      // 41: invokevirtual java/io/File.listFiles (Ljava/io/FileFilter;)[Ljava/io/File;
      // 44: astore 6
      // 46: aload 6
      // 48: arraylength
      // 49: istore 7
      // 4b: bipush 0
      // 4c: istore 8
      // 4e: iload 8
      // 50: iload 7
      // 52: if_icmpge b1
      // 55: aload 6
      // 57: iload 8
      // 59: aaload
      // 5a: astore 9
      // 5c: aload 5
      // 5e: aload 9
      // 60: invokestatic vwy.cla (Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
      // 63: astore 10
      // 65: aload 10
      // 67: aload 10
      // 69: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 6c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6f: iload 3
      // 70: ifne a9
      // 73: ifne 8e
      // 76: goto 7d
      // 79: invokestatic vwy.a (Loov;)Loov;
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 10
      // 80: invokevirtual vwy.mcb (Ljava/lang/String;)V
      // 83: iload 3
      // 84: ifeq aa
      // 87: goto 8e
      // 8a: invokestatic vwy.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 4
      // 90: aload 10
      // 92: bipush 0
      // 93: aload 10
      // 95: invokevirtual java/lang/String.length ()I
      // 98: bipush 1
      // 99: isub
      // 9a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 9d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // a2: goto a9
      // a5: invokestatic vwy.a (Loov;)Loov;
      // a8: athrow
      // a9: pop
      // aa: iinc 8 1
      // ad: iload 3
      // ae: ifeq 4e
      // b1: aload 4
      // b3: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-227429949321987097L, -4934689678464294619L, MethodHandles.lookup().lookupClass()).a(157920284158319L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 112925186792778L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("z\u0087-\fî½Îç".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
}
