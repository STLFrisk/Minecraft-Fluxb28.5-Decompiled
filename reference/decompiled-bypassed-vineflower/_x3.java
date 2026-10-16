import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _x3 {
   public static ArrayList wig;
   private static final long a;
   private static final String b;

   public static dzm xki(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: getstatic _x3.wig Ljava/util/ArrayList;
      // 07: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0a: astore 2
      // 0b: aload 2
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 41
      // 14: aload 2
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast dzm
      // 1d: astore 3
      // 1e: aload 3
      // 1f: iload 1
      // 20: ifeq 3c
      // 23: invokevirtual dzm.o7h ()Ljava/lang/String;
      // 26: aload 0
      // 27: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 2a: ifeq 3d
      // 2d: goto 34
      // 30: invokestatic _x3.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 3
      // 35: goto 3c
      // 38: invokestatic _x3.a (Loov;)Loov;
      // 3b: athrow
      // 3c: areturn
      // 3d: iload 1
      // 3e: ifne 0b
      // 41: aconst_null
      // 42: areturn
   }

   public static dzm sbx(String var0) {
      long var1 = a ^ 133081384015226L;
      int var3 = t9d.c();

      for (dzm var5 : wig) {
         try {
            if (var0.toLowerCase().equals(var5.l08().toLowerCase() + b + var5.o7h().toLowerCase())) {
               return var5;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         if (var3 != 0) {
            break;
         }
      }

      return null;
   }

   public static void d7l() {
   }

   public static List faw(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 2
      // 08: invokestatic t9d.c ()I
      // 0b: getstatic _x3.wig Ljava/util/ArrayList;
      // 0e: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 11: astore 3
      // 12: istore 1
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 52
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast dzm
      // 25: astore 4
      // 27: aload 4
      // 29: invokevirtual dzm.l08 ()Ljava/lang/String;
      // 2c: aload 0
      // 2d: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 30: iload 1
      // 31: ifne 4d
      // 34: ifeq 4e
      // 37: goto 3e
      // 3a: invokestatic _x3.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 2
      // 3f: aload 4
      // 41: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 46: goto 4d
      // 49: invokestatic _x3.a (Loov;)Loov;
      // 4c: athrow
      // 4d: pop
      // 4e: iload 1
      // 4f: ifeq 13
      // 52: aload 2
      // 53: areturn
   }

   public static dzm fv0(String param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: getstatic _x3.wig Ljava/util/ArrayList;
      // 07: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0a: astore 3
      // 0b: aload 3
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 5b
      // 14: aload 3
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast dzm
      // 1d: astore 4
      // 1f: aload 4
      // 21: invokevirtual dzm.l08 ()Ljava/lang/String;
      // 24: aload 0
      // 25: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 28: iload 2
      // 29: ifne 51
      // 2c: ifeq 57
      // 2f: goto 36
      // 32: invokestatic _x3.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 4
      // 38: iload 2
      // 39: ifne 56
      // 3c: goto 43
      // 3f: invokestatic _x3.a (Loov;)Loov;
      // 42: athrow
      // 43: invokevirtual dzm.o7h ()Ljava/lang/String;
      // 46: aload 1
      // 47: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a: goto 51
      // 4d: invokestatic _x3.a (Loov;)Loov;
      // 50: athrow
      // 51: ifeq 57
      // 54: aload 4
      // 56: areturn
      // 57: iload 2
      // 58: ifeq 0b
      // 5b: aconst_null
      // 5c: areturn
   }

   public static List hgl(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 2
      // 08: invokestatic t9d.c ()I
      // 0b: getstatic _x3.wig Ljava/util/ArrayList;
      // 0e: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 11: astore 3
      // 12: istore 1
      // 13: aload 3
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq 52
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast dzm
      // 25: astore 4
      // 27: aload 4
      // 29: invokevirtual dzm.l08 ()Ljava/lang/String;
      // 2c: aload 0
      // 2d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 30: iload 1
      // 31: ifne 4d
      // 34: ifeq 4e
      // 37: goto 3e
      // 3a: invokestatic _x3.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 2
      // 3f: aload 4
      // 41: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 46: goto 4d
      // 49: invokestatic _x3.a (Loov;)Loov;
      // 4c: athrow
      // 4d: pop
      // 4e: iload 1
      // 4f: ifeq 13
      // 52: aload 2
      // 53: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5835994299124956870L, 7308642608608209740L, MethodHandles.lookup().lookupClass()).a(253934133698783L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 44634205495894L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("e\u0019W\u001c$\u0002.\u008c".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      wig = new ArrayList();
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
}
