import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ihc extends ar7 {
   private static final long a;
   private static final String f;

   public ihc() {
      long var1 = a ^ 19011176699704L;
      super(f, _aj.y49, false, new j1s[0]);
   }

   @jev
   public void n5u(ccn param1) {
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
      // 06: getstatic ihc.ek1 Lc05;
      // 09: iload 2
      // 0a: ifne 5e
      // 0d: invokevirtual c05.p9_ ()I
      // 10: bipush 4
      // 11: if_icmplt 52
      // 14: goto 1b
      // 17: invokestatic ihc.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield ihc.ya5 Z
      // 1f: iload 2
      // 20: ifne 4e
      // 23: goto 2a
      // 26: invokestatic ihc.a (Loov;)Loov;
      // 29: athrow
      // 2a: ifeq 7d
      // 2d: goto 34
      // 30: invokestatic ihc.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: pop
      // 36: getstatic ihc.ek1 Lc05;
      // 39: iload 2
      // 3a: ifne 5e
      // 3d: goto 44
      // 40: invokestatic ihc.a (Loov;)Loov;
      // 43: athrow
      // 44: invokevirtual c05.p9_ ()I
      // 47: goto 4e
      // 4a: invokestatic ihc.a (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 5
      // 4f: if_icmpge 7d
      // 52: aload 0
      // 53: pop
      // 54: getstatic ihc.ek1 Lc05;
      // 57: goto 5e
      // 5a: invokestatic ihc.a (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 0
      // 5f: invokevirtual c05.cmp (I)V
      // 62: aload 0
      // 63: aload 0
      // 64: getfield ihc.ya5 Z
      // 67: iload 2
      // 68: ifne 76
      // 6b: ifne 79
      // 6e: goto 75
      // 71: invokestatic ihc.a (Loov;)Loov;
      // 74: athrow
      // 75: bipush 1
      // 76: goto 7a
      // 79: bipush 0
      // 7a: putfield ihc.ya5 Z
      // 7d: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8952413085072253746L, -1876637948936785920L, MethodHandles.lookup().lookupClass()).a(124968966835469L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92458209679628L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("·\u0085$ÑMì»÷¼î\u0019CÙË¨k".getBytes("ISO-8859-1"));
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
