import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ejl extends Module {
   private static final long a;
   private static final String f;

   public ejl() {
      long var1 = a ^ 71108523353698L;
      super(f, _aj.p3z, false, new SubEngine[0]);
   }

   @EventHandler
   public void qef(Event param1) {
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
      // 05: pop
      // 06: getstatic ejl.ek1 Lc05;
      // 09: getfield Minecraft.vg8 Ll86;
      // 0c: getstatic mcs.s19 Lmcs;
      // 0f: invokevirtual mcs.wj9 ()I
      // 12: invokevirtual EntityPlayerSP.vx3 (I)Z
      // 15: iload 2
      // 16: ifne 4c
      // 19: ifeq 3b
      // 1c: goto 23
      // 1f: invokestatic ejl.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: pop
      // 25: getstatic ejl.ek1 Lc05;
      // 28: getfield Minecraft.vg8 Ll86;
      // 2b: getstatic mcs.s19 Lmcs;
      // 2e: invokevirtual mcs.wj9 ()I
      // 31: invokevirtual EntityPlayerSP.zu8 (I)V
      // 34: goto 3b
      // 37: invokestatic ejl.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: pop
      // 3d: getstatic ejl.ek1 Lc05;
      // 40: getfield Minecraft.vg8 Ll86;
      // 43: getstatic mcs.bla Lmcs;
      // 46: invokevirtual mcs.wj9 ()I
      // 49: invokevirtual EntityPlayerSP.vx3 (I)Z
      // 4c: iload 2
      // 4d: ifne 8e
      // 50: ifeq 72
      // 53: goto 5a
      // 56: invokestatic ejl.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: pop
      // 5c: getstatic ejl.ek1 Lc05;
      // 5f: getfield Minecraft.vg8 Ll86;
      // 62: getstatic mcs.bla Lmcs;
      // 65: invokevirtual mcs.wj9 ()I
      // 68: invokevirtual EntityPlayerSP.zu8 (I)V
      // 6b: goto 72
      // 6e: invokestatic ejl.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: pop
      // 74: getstatic ejl.ek1 Lc05;
      // 77: getfield Minecraft.vg8 Ll86;
      // 7a: getstatic mcs._es Lmcs;
      // 7d: invokevirtual mcs.wj9 ()I
      // 80: iload 2
      // 81: ifne a6
      // 84: invokevirtual EntityPlayerSP.vx3 (I)Z
      // 87: goto 8e
      // 8a: invokestatic ejl.a (Loov;)Loov;
      // 8d: athrow
      // 8e: ifeq a9
      // 91: aload 0
      // 92: pop
      // 93: getstatic ejl.ek1 Lc05;
      // 96: getfield Minecraft.vg8 Ll86;
      // 99: getstatic mcs._es Lmcs;
      // 9c: invokevirtual mcs.wj9 ()I
      // 9f: goto a6
      // a2: invokestatic ejl.a (Loov;)Loov;
      // a5: athrow
      // a6: invokevirtual EntityPlayerSP.zu8 (I)V
      // a9: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1442592238264601075L, -920508499973181760L, MethodHandles.lookup().lookupClass()).a(24623973530004L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 72498448894376L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("/\u008dò©Îð\u001d7".getBytes("ISO-8859-1"));
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
