import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vc3 extends Module {
   private static final long a;
   private static final String f;

   public vc3() {
      long var1 = a ^ 108530230743150L;
      super(f, _aj.z3a, false, new SubEngine[0]);
   }

   @Override
   public void onEnable() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: getstatic ClientState.qkk Lzwr;
      // 07: invokevirtual ClientState.getModuleRegistry ()Lkgt;
      // 0a: invokevirtual ModuleRegistry.wau ()Ljava/util/ArrayList;
      // 0d: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 10: astore 2
      // 11: aload 2
      // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17: ifeq 46
      // 1a: aload 2
      // 1b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 20: checkcast Module
      // 23: astore 3
      // 24: aload 3
      // 25: iload 1
      // 26: ifeq 3e
      // 29: invokevirtual Module.isEnabled ()Z
      // 2c: ifeq 42
      // 2f: goto 36
      // 32: invokestatic vc3.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 3
      // 37: goto 3e
      // 3a: invokestatic vc3.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: invokevirtual Module.onEnabledChanged (Z)V
      // 42: iload 1
      // 43: ifne 11
      // 46: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7219822629944575755L, 766957628337651541L, MethodHandles.lookup().lookupClass()).a(168615508494962L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 16925354494014L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0087>\u009f±È\b i".getBytes("ISO-8859-1"));
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
