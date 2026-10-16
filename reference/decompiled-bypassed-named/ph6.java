import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ph6 extends ShaderHelper {
   private static final long a;
   private static final String b;

   public ph6(p_k var1) {
      this.fvk = var1;
   }

   @Override
   public void dig(char var1, int var2) {
   }

   @Override
   public void initGui() {
      this.khf.clear();
   }

   @Override
   public void updateScreen() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: dup
      // 06: getfield ph6.hjt I
      // 09: bipush 1
      // 0a: iadd
      // 0b: putfield ph6.hjt I
      // 0e: aload 0
      // 0f: iload 1
      // 10: ifeq 2b
      // 13: getfield ph6.hjt I
      // 16: bipush 20
      // 18: irem
      // 19: ifne 38
      // 1c: goto 23
      // 1f: invokestatic ph6.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: goto 2b
      // 27: invokestatic ph6.a (Loov;)Loov;
      // 2a: athrow
      // 2b: getfield ph6.fvk Lp_k;
      // 2e: new net/minecraft/network/play/client/C00PacketKeepAlive
      // 31: dup
      // 32: invokespecial net/minecraft/network/play/client/C00PacketKeepAlive.<init> ()V
      // 35: invokevirtual p_k.sxi (Lmz2;)V
      // 38: return
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ph6.a J
      // 03: ldc2_w 39697106282950
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: iload 6
      // 11: ifne 44
      // 14: getfield ph6.wd1 Lnet/optifine/CustomLoadingScreen;
      // 17: ifnull 3c
      // 1a: goto 21
      // 1d: invokestatic ph6.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield ph6.wd1 Lnet/optifine/CustomLoadingScreen;
      // 25: aload 0
      // 26: getfield ph6.dt7 I
      // 29: aload 0
      // 2a: getfield ph6.o1e I
      // 2d: invokevirtual net/optifine/CustomLoadingScreen.drawBackground (II)V
      // 30: iload 6
      // 32: ifeq 48
      // 35: goto 3c
      // 38: invokestatic ph6.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: goto 44
      // 40: invokestatic ph6.a (Loov;)Loov;
      // 43: athrow
      // 44: bipush 0
      // 45: invokevirtual ph6.g76 (I)V
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield ph6.fex Lowt;
      // 4d: getstatic ph6.b Ljava/lang/String;
      // 50: nop
      // 51: bipush 0
      // 52: anewarray 79
      // 55: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 58: aload 0
      // 59: getfield ph6.dt7 I
      // 5c: bipush 2
      // 5d: idiv
      // 5e: aload 0
      // 5f: getfield ph6.o1e I
      // 62: bipush 2
      // 63: idiv
      // 64: bipush 50
      // 66: isub
      // 67: ldc 16777215
      // 69: nop
      // 6a: invokevirtual ph6.poi (Lowt;Ljava/lang/String;III)V
      // 6d: aload 0
      // 6e: iload 1
      // 6f: iload 2
      // 70: fload 3
      // 71: invokespecial ShaderHelper.drawScreen (IIF)V
      // 74: return
   }

   @Override
   public boolean a99() {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4076403576784928590L, -7468018137441500995L, MethodHandles.lookup().lookupClass()).a(81303600053557L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130711624254497L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0013É\u0087\u0004ß\rBW \u001b³\u008f}\u001d\u009bk©\n/\u0017Ù\u0080Kr\u0092}9Y\u0094æVL".getBytes("ISO-8859-1"));
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
