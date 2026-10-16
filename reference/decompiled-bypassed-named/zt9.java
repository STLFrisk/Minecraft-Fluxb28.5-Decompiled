import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zt9 implements Runnable {
   private static final long a;
   private static final String b;

   public static zt9 qxh() {
      return q1e;
   }

   @Override
   public void run() {
      while (true) {
         this._fd();
      }
   }

   private void _fd() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: getfield zt9.szg Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 89
      // 13: aload 0
      // 14: getfield zt9.szg Ljava/util/List;
      // 17: iload 2
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast e76
      // 20: astore 3
      // 21: aload 3
      // 22: invokeinterface e76.vbg ()Z 1
      // 27: istore 4
      // 29: iload 4
      // 2b: iload 1
      // 2c: ifne 92
      // 2f: iload 1
      // 30: ifne 67
      // 33: goto 3a
      // 36: invokestatic zt9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: ifne 63
      // 3d: goto 44
      // 40: invokestatic zt9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield zt9.szg Ljava/util/List;
      // 48: iload 2
      // 49: iinc 2 -1
      // 4c: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 51: pop
      // 52: aload 0
      // 53: dup
      // 54: getfield zt9.f_i J
      // 57: lconst_1
      // 58: ladd
      // 59: putfield zt9.f_i J
      // 5c: goto 63
      // 5f: invokestatic zt9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 0
      // 64: getfield zt9.edm Z
      // 67: ifeq 72
      // 6a: lconst_0
      // 6b: goto 75
      // 6e: invokestatic zt9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: ldc2_w 10
      // 75: invokestatic java/lang/Thread.sleep (J)V
      // 78: goto 82
      // 7b: astore 5
      // 7d: aload 5
      // 7f: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 82: iinc 2 1
      // 85: iload 1
      // 86: ifeq 06
      // 89: aload 0
      // 8a: getfield zt9.szg Ljava/util/List;
      // 8d: invokeinterface java/util/List.isEmpty ()Z 1
      // 92: ifeq a7
      // 95: ldc2_w 25
      // 98: invokestatic java/lang/Thread.sleep (J)V
      // 9b: goto a7
      // 9e: invokestatic zt9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a1: athrow
      // a2: astore 2
      // a3: aload 2
      // a4: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // a7: return
   }

   public void ifj(e76 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield zt9.szg Ljava/util/List;
      // 08: aload 1
      // 09: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0e: iload 2
      // 0f: ifne 37
      // 12: ifne 38
      // 15: goto 1c
      // 18: invokestatic zt9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield zt9.urj J
      // 21: lconst_1
      // 22: ladd
      // 23: putfield zt9.urj J
      // 26: aload 0
      // 27: getfield zt9.szg Ljava/util/List;
      // 2a: aload 1
      // 2b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 30: goto 37
      // 33: invokestatic zt9.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: pop
      // 38: return
   }

   public void i8i() {
      int var1 = OpaquePredicate.b();
      this.edm = true;

      while (true) {
         if (this.urj != this.f_i) {
            try {
               Thread.sleep(10L);
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var2) {
               throw a(var2);
            }
         }

         this.edm = false;
         break;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5237623885578875297L, -7368593918883468138L, MethodHandles.lookup().lookupClass()).a(178208537258549L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 26563202011062L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(")øwü_ÄyõZ2Áóö;º¢".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
      q1e = new zt9();
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
}
