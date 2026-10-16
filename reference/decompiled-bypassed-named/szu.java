import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class szu extends Module {
   private static final long a;
   private static final String f;

   public szu() {
      long var1 = a ^ 53040752561134L;
      super(f, _aj._lm, false, new SubEngine[0]);
      this.llc = new ArrayList();
   }

   @Override
   public void onEnable() {
      super.onEnable();
      (this.y48 = new hpk(ek1.tij, ek1.vg8.x6l())).moc(ek1.vg8, true);
      this.y48.m6_(ek1.vg8.o2v, ek1.vg8.kfp, ek1.vg8.vbd);
      this.y48.q6c = ek1.vg8.x5k;
      this.y48.y2i = ek1.vg8.y2i;
      this.y48.rh_(ek1.vg8.hzv());
      ek1.tij.fih(-1337, this.y48);
   }

   @EventHandler
   public void djw(ihr var1) {
      var1.wxi(true);
      this.llc.add(var1.bbi());
   }

   @Override
   public void onDisable() {
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
      // 05: invokespecial Module.onDisable ()V
      // 08: aload 0
      // 09: iload 1
      // 0a: ifeq 24
      // 0d: pop
      // 0e: getstatic szu.ek1 Lc05;
      // 11: getfield Minecraft.tij Lkh3;
      // 14: ifnonnull 23
      // 17: goto 1e
      // 1a: invokestatic szu.a (Loov;)Loov;
      // 1d: athrow
      // 1e: return
      // 1f: invokestatic szu.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: iload 1
      // 25: ifeq 4c
      // 28: getfield szu.y48 Lhpk;
      // 2b: ifnull 4b
      // 2e: goto 35
      // 31: invokestatic szu.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: pop
      // 37: getstatic szu.ek1 Lc05;
      // 3a: getfield Minecraft.tij Lkh3;
      // 3d: aload 0
      // 3e: getfield szu.y48 Lhpk;
      // 41: invokevirtual WorldClient.rqa (Li2h;)V
      // 44: goto 4b
      // 47: invokestatic szu.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield szu.llc Ljava/util/ArrayList;
      // 4f: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 52: astore 2
      // 53: aload 2
      // 54: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 59: ifeq 79
      // 5c: aload 2
      // 5d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 62: checkcast mz2
      // 65: astore 3
      // 66: aload 0
      // 67: pop
      // 68: getstatic szu.ek1 Lc05;
      // 6b: invokevirtual Minecraft.c02 ()Lp_k;
      // 6e: invokevirtual p_k._m3 ()Lhv0;
      // 71: aload 3
      // 72: invokevirtual hv0.k7f (Lmz2;)V
      // 75: iload 1
      // 76: ifne 53
      // 79: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9156938230718387470L, -1453032578299142188L, MethodHandles.lookup().lookupClass()).a(129887811270283L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 116916180733181L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("y²\u008d/\u0013\u0087R¼".getBytes("ISO-8859-1"));
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
