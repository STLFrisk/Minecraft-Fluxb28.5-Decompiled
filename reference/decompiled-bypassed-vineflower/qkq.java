import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qkq extends ar7 {
   private static final long a;
   private static final String f;

   public qkq() {
      long var1 = a ^ 11394355883989L;
      super(f, _aj._lm, false, new j1s[0]);
   }

   @jev
   public void y21(fha param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: pop
      // 06: getstatic qkq.ek1 Lc05;
      // 09: getfield c05.u0y Lgbe;
      // 0c: iload 2
      // 0d: ifne 34
      // 10: ifnull dc
      // 13: goto 1a
      // 16: invokestatic qkq.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: pop
      // 1c: getstatic qkq.ek1 Lc05;
      // 1f: iload 2
      // 20: ifne c2
      // 23: goto 2a
      // 26: invokestatic qkq.a (Loov;)Loov;
      // 29: athrow
      // 2a: getfield c05.u0y Lgbe;
      // 2d: goto 34
      // 30: invokestatic qkq.a (Loov;)Loov;
      // 33: athrow
      // 34: instanceof _ov
      // 37: ifne dc
      // 3a: aload 0
      // 3b: pop
      // 3c: getstatic qkq.ek1 Lc05;
      // 3f: getfield c05.oxn Lmoh;
      // 42: getfield moh.mn1 Lm7l;
      // 45: aload 0
      // 46: pop
      // 47: getstatic qkq.ek1 Lc05;
      // 4a: getfield c05.oxn Lmoh;
      // 4d: getfield moh.mn1 Lm7l;
      // 50: invokevirtual m7l.xbs ()I
      // 53: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 56: invokevirtual m7l.xdn (Z)V
      // 59: aload 0
      // 5a: pop
      // 5b: getstatic qkq.ek1 Lc05;
      // 5e: getfield c05.oxn Lmoh;
      // 61: getfield moh.tup Lm7l;
      // 64: aload 0
      // 65: pop
      // 66: getstatic qkq.ek1 Lc05;
      // 69: getfield c05.oxn Lmoh;
      // 6c: getfield moh.tup Lm7l;
      // 6f: invokevirtual m7l.xbs ()I
      // 72: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 75: invokevirtual m7l.xdn (Z)V
      // 78: aload 0
      // 79: pop
      // 7a: getstatic qkq.ek1 Lc05;
      // 7d: getfield c05.oxn Lmoh;
      // 80: getfield moh._70 Lm7l;
      // 83: aload 0
      // 84: pop
      // 85: getstatic qkq.ek1 Lc05;
      // 88: getfield c05.oxn Lmoh;
      // 8b: getfield moh._70 Lm7l;
      // 8e: invokevirtual m7l.xbs ()I
      // 91: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 94: invokevirtual m7l.xdn (Z)V
      // 97: aload 0
      // 98: pop
      // 99: getstatic qkq.ek1 Lc05;
      // 9c: getfield c05.oxn Lmoh;
      // 9f: getfield moh.asx Lm7l;
      // a2: aload 0
      // a3: pop
      // a4: getstatic qkq.ek1 Lc05;
      // a7: getfield c05.oxn Lmoh;
      // aa: getfield moh.asx Lm7l;
      // ad: invokevirtual m7l.xbs ()I
      // b0: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // b3: invokevirtual m7l.xdn (Z)V
      // b6: aload 0
      // b7: pop
      // b8: getstatic qkq.ek1 Lc05;
      // bb: goto c2
      // be: invokestatic qkq.a (Loov;)Loov;
      // c1: athrow
      // c2: getfield c05.oxn Lmoh;
      // c5: getfield moh.nfb Lm7l;
      // c8: aload 0
      // c9: pop
      // ca: getstatic qkq.ek1 Lc05;
      // cd: getfield c05.oxn Lmoh;
      // d0: getfield moh.nfb Lm7l;
      // d3: invokevirtual m7l.xbs ()I
      // d6: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // d9: invokevirtual m7l.xdn (Z)V
      // dc: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2244437384422133032L, -2942660719863058925L, MethodHandles.lookup().lookupClass()).a(207520565032897L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 140244823520642L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("gøÔ!ðþö¡".getBytes("ISO-8859-1"));
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
