import java.lang.invoke.MethodHandles;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _h2 extends Logger {
   private static final long a;
   private static final String b;

   public _h2(org.apache.logging.log4j.Logger var1) {
      long var2 = a ^ 3792309860753L;
      super(b, null);
      this.u3f = var1;
   }

   @Override
   public void log(LogRecord var1) {
      this.log(var1.getLevel(), var1.getMessage());
   }

   @Override
   public void log(Level param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: getstatic java/util/logging/Level.FINE Ljava/util/logging/Level;
      // 08: iload 3
      // 09: ifne 36
      // 0c: if_acmpne 2b
      // 0f: goto 16
      // 12: invokestatic _h2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 1a: aload 2
      // 1b: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;)V 2
      // 20: iload 3
      // 21: ifeq bb
      // 24: goto 2b
      // 27: invokestatic _h2.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 1
      // 2c: getstatic java/util/logging/Level.WARNING Ljava/util/logging/Level;
      // 2f: goto 36
      // 32: invokestatic _h2.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 3
      // 37: ifne 64
      // 3a: if_acmpne 59
      // 3d: goto 44
      // 40: invokestatic _h2.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 48: aload 2
      // 49: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 4e: iload 3
      // 4f: ifeq bb
      // 52: goto 59
      // 55: invokestatic _h2.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 1
      // 5a: getstatic java/util/logging/Level.SEVERE Ljava/util/logging/Level;
      // 5d: goto 64
      // 60: invokestatic _h2.a (Loov;)Loov;
      // 63: athrow
      // 64: iload 3
      // 65: ifne 92
      // 68: if_acmpne 87
      // 6b: goto 72
      // 6e: invokestatic _h2.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 76: aload 2
      // 77: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 7c: iload 3
      // 7d: ifeq bb
      // 80: goto 87
      // 83: invokestatic _h2.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 1
      // 88: getstatic java/util/logging/Level.INFO Ljava/util/logging/Level;
      // 8b: goto 92
      // 8e: invokestatic _h2.a (Loov;)Loov;
      // 91: athrow
      // 92: if_acmpne aa
      // 95: aload 0
      // 96: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 99: aload 2
      // 9a: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;)V 2
      // 9f: iload 3
      // a0: ifeq bb
      // a3: goto aa
      // a6: invokestatic _h2.a (Loov;)Loov;
      // a9: athrow
      // aa: aload 0
      // ab: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // ae: aload 2
      // af: invokeinterface org/apache/logging/log4j/Logger.trace (Ljava/lang/String;)V 2
      // b4: goto bb
      // b7: invokestatic _h2.a (Loov;)Loov;
      // ba: athrow
      // bb: return
   }

   @Override
   public void log(Level param1, String param2, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getstatic java/util/logging/Level.FINE Ljava/util/logging/Level;
      // 09: iload 4
      // 0b: ifeq 3a
      // 0e: if_acmpne 2f
      // 11: goto 18
      // 14: invokestatic _h2.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 1c: aload 2
      // 1d: aload 3
      // 1e: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;Ljava/lang/Object;)V 3
      // 23: iload 4
      // 25: ifne c8
      // 28: goto 2f
      // 2b: invokestatic _h2.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic java/util/logging/Level.WARNING Ljava/util/logging/Level;
      // 33: goto 3a
      // 36: invokestatic _h2.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 4
      // 3c: ifeq 6b
      // 3f: if_acmpne 60
      // 42: goto 49
      // 45: invokestatic _h2.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 4d: aload 2
      // 4e: aload 3
      // 4f: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Object;)V 3
      // 54: iload 4
      // 56: ifne c8
      // 59: goto 60
      // 5c: invokestatic _h2.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 1
      // 61: getstatic java/util/logging/Level.SEVERE Ljava/util/logging/Level;
      // 64: goto 6b
      // 67: invokestatic _h2.a (Loov;)Loov;
      // 6a: athrow
      // 6b: iload 4
      // 6d: ifeq 9c
      // 70: if_acmpne 91
      // 73: goto 7a
      // 76: invokestatic _h2.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 7e: aload 2
      // 7f: aload 3
      // 80: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Object;)V 3
      // 85: iload 4
      // 87: ifne c8
      // 8a: goto 91
      // 8d: invokestatic _h2.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 1
      // 92: getstatic java/util/logging/Level.INFO Ljava/util/logging/Level;
      // 95: goto 9c
      // 98: invokestatic _h2.a (Loov;)Loov;
      // 9b: athrow
      // 9c: if_acmpne b6
      // 9f: aload 0
      // a0: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // a3: aload 2
      // a4: aload 3
      // a5: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;Ljava/lang/Object;)V 3
      // aa: iload 4
      // ac: ifne c8
      // af: goto b6
      // b2: invokestatic _h2.a (Loov;)Loov;
      // b5: athrow
      // b6: aload 0
      // b7: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // ba: aload 2
      // bb: aload 3
      // bc: invokeinterface org/apache/logging/log4j/Logger.trace (Ljava/lang/String;Ljava/lang/Object;)V 3
      // c1: goto c8
      // c4: invokestatic _h2.a (Loov;)Loov;
      // c7: athrow
      // c8: return
   }

   @Override
   public void log(Level var1, String var2, Object[] var3) {
      this.log(var1, MessageFormat.format(var2, var3));
   }

   @Override
   public void log(Level param1, String param2, Throwable param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: getstatic java/util/logging/Level.FINE Ljava/util/logging/Level;
      // 09: iload 4
      // 0b: ifne 3a
      // 0e: if_acmpne 2f
      // 11: goto 18
      // 14: invokestatic _h2.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 1c: aload 2
      // 1d: aload 3
      // 1e: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 23: iload 4
      // 25: ifeq c8
      // 28: goto 2f
      // 2b: invokestatic _h2.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic java/util/logging/Level.WARNING Ljava/util/logging/Level;
      // 33: goto 3a
      // 36: invokestatic _h2.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 4
      // 3c: ifne 6b
      // 3f: if_acmpne 60
      // 42: goto 49
      // 45: invokestatic _h2.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 4d: aload 2
      // 4e: aload 3
      // 4f: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 54: iload 4
      // 56: ifeq c8
      // 59: goto 60
      // 5c: invokestatic _h2.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 1
      // 61: getstatic java/util/logging/Level.SEVERE Ljava/util/logging/Level;
      // 64: goto 6b
      // 67: invokestatic _h2.a (Loov;)Loov;
      // 6a: athrow
      // 6b: iload 4
      // 6d: ifne 9c
      // 70: if_acmpne 91
      // 73: goto 7a
      // 76: invokestatic _h2.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // 7e: aload 2
      // 7f: aload 3
      // 80: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 85: iload 4
      // 87: ifeq c8
      // 8a: goto 91
      // 8d: invokestatic _h2.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 1
      // 92: getstatic java/util/logging/Level.INFO Ljava/util/logging/Level;
      // 95: goto 9c
      // 98: invokestatic _h2.a (Loov;)Loov;
      // 9b: athrow
      // 9c: if_acmpne b6
      // 9f: aload 0
      // a0: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // a3: aload 2
      // a4: aload 3
      // a5: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // aa: iload 4
      // ac: ifeq c8
      // af: goto b6
      // b2: invokestatic _h2.a (Loov;)Loov;
      // b5: athrow
      // b6: aload 0
      // b7: getfield _h2.u3f Lorg/apache/logging/log4j/Logger;
      // ba: aload 2
      // bb: aload 3
      // bc: invokeinterface org/apache/logging/log4j/Logger.trace (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // c1: goto c8
      // c4: invokestatic _h2.a (Loov;)Loov;
      // c7: athrow
      // c8: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8302705637926717851L, -8935032207508999849L, MethodHandles.lookup().lookupClass()).a(102121988380049L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 86076629151347L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¨5w|lZà\u0011".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
