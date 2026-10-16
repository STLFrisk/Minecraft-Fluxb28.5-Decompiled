import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
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

public class bfw {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static synchronized ylx _cn(File param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic bfw.a J
      // 03: ldc2_w 122751884892957
      // 06: lxor
      // 07: lstore 3
      // 08: new java/io/File
      // 0b: dup
      // 0c: aload 0
      // 0d: sipush 3094
      // 10: ldc2_w 3275498594382544376
      // 13: lload 3
      // 14: lxor
      // 15: invokedynamic b (IJ)Ljava/lang/String; bsm=bfw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 1e: astore 6
      // 20: invokestatic t9d.b ()I
      // 23: new java/io/File
      // 26: dup
      // 27: aload 6
      // 29: new java/lang/StringBuilder
      // 2c: dup
      // 2d: invokespecial java/lang/StringBuilder.<init> ()V
      // 30: sipush 25316
      // 33: ldc2_w 3038283505568289544
      // 36: lload 3
      // 37: lxor
      // 38: invokedynamic b (IJ)Ljava/lang/String; bsm=bfw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: nop
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 41: iload 1
      // 42: bipush 5
      // 43: ishr
      // 44: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 47: ldc "."
      // 49: nop
      // 4a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d: iload 2
      // 4e: bipush 5
      // 4f: ishr
      // 50: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 53: sipush 9121
      // 56: ldc2_w 6580917020748206668
      // 59: lload 3
      // 5a: lxor
      // 5b: invokedynamic b (IJ)Ljava/lang/String; bsm=bfw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 64: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 67: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 6a: astore 7
      // 6c: istore 5
      // 6e: getstatic bfw.u_h Ljava/util/Map;
      // 71: aload 7
      // 73: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 78: checkcast ylx
      // 7b: astore 8
      // 7d: aload 8
      // 7f: iload 5
      // 81: ifeq 90
      // 84: ifnull 91
      // 87: goto 8e
      // 8a: invokestatic bfw.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: aload 8
      // 90: areturn
      // 91: aload 6
      // 93: invokevirtual java/io/File.exists ()Z
      // 96: iload 5
      // 98: ifeq ba
      // 9b: ifne b2
      // 9e: goto a5
      // a1: invokestatic bfw.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a4: athrow
      // a5: aload 6
      // a7: invokevirtual java/io/File.mkdirs ()Z
      // aa: pop
      // ab: goto b2
      // ae: invokestatic bfw.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b1: athrow
      // b2: getstatic bfw.u_h Ljava/util/Map;
      // b5: invokeinterface java/util/Map.size ()I 1
      // ba: sipush 256
      // bd: if_icmplt ca
      // c0: invokestatic bfw.j_n ()V
      // c3: goto ca
      // c6: invokestatic bfw.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: new ylx
      // cd: dup
      // ce: aload 7
      // d0: invokespecial ylx.<init> (Ljava/io/File;)V
      // d3: astore 9
      // d5: getstatic bfw.u_h Ljava/util/Map;
      // d8: aload 7
      // da: aload 9
      // dc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // e1: pop
      // e2: aload 9
      // e4: areturn
   }

   public static synchronized void j_n() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic bfw.u_h Ljava/util/Map;
      // 07: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 11: astore 1
      // 12: aload 1
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 4f
      // 1b: aload 1
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast ylx
      // 24: astore 2
      // 25: iload 0
      // 26: ifne 57
      // 29: aload 2
      // 2a: iload 0
      // 2b: ifne 40
      // 2e: goto 35
      // 31: invokestatic bfw.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: ifnull 43
      // 38: goto 3f
      // 3b: invokestatic bfw.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 2
      // 40: invokevirtual ylx.ain ()V
      // 43: goto 4b
      // 46: astore 3
      // 47: aload 3
      // 48: invokevirtual java/io/IOException.printStackTrace ()V
      // 4b: iload 0
      // 4c: ifeq 12
      // 4f: getstatic bfw.u_h Ljava/util/Map;
      // 52: invokeinterface java/util/Map.clear ()V 1
      // 57: return
   }

   public static DataInputStream p1f(File var0, int var1, int var2) {
      ylx var3 = _cn(var0, var1, var2);
      return var3.ci2(var1 & 31, var2 & 31);
   }

   public static DataOutputStream ay4(File var0, int var1, int var2) {
      ylx var3 = _cn(var0, var1, var2);
      return var3.wfn(var1 & 31, var2 & 31);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4227523630725167043L, 8904836564652897647L, MethodHandles.lookup().lookupClass()).a(256742579282425L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 88575515179490L;
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
      String var6 = "þ©\u0012Û\u001a \u0004¬0B`h\u0010¿vH\u0010\u00169çÌÁMôQ#\u0001\u0002\u0018{þ¨\u0001\u0010ÒK¨*F\u0082 \u008dþ2lc¸wá¾";
      int var8 = "þ©\u0012Û\u001a \u0004¬0B`h\u0010¿vH\u0010\u00169çÌÁMôQ#\u0001\u0002\u0018{þ¨\u0001\u0010ÒK¨*F\u0082 \u008dþ2lc¸wá¾".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            u_h = Maps.newHashMap();
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19704;
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
            throw new RuntimeException("bfw", var10);
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
         throw new RuntimeException("bfw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
