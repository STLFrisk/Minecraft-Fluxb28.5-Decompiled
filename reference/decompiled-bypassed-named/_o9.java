import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _o9 extends wlx {
   private static final long a;
   private static final String f;

   public _o9(iq7 var1) {
      super(var1);
      this.b09(10);
   }

   @Override
   public void vsg(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 33
      // 09: invokevirtual z96.noc ()Ljava/lang/String;
      // 0c: aload 0
      // 0d: invokevirtual _o9.sdn ()Liq7;
      // 10: invokevirtual iq7.p4h ()Ljava/lang/String;
      // 13: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16: ifeq 3a
      // 19: goto 20
      // 1c: invokestatic _o9.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: new bdo
      // 24: dup
      // 25: invokespecial bdo.<init> ()V
      // 28: putfield _o9.bdp Lbdo;
      // 2b: aload 1
      // 2c: goto 33
      // 2f: invokestatic _o9.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield _o9.bdp Lbdo;
      // 37: invokevirtual z96.c97 (Lbdo;)V
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokespecial wlx.vsg (Lz96;)V
      // 3f: return
   }

   @Override
   public String pjq(SocketAddress param1, GameProfile param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _o9.a J
      // 03: ldc2_w 36189155308440
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 11: aload 0
      // 12: invokevirtual _o9.sdn ()Liq7;
      // 15: invokevirtual iq7.p4h ()Ljava/lang/String;
      // 18: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 1b: ifeq 47
      // 1e: aload 0
      // 1f: iload 5
      // 21: ifeq 48
      // 24: goto 2b
      // 27: invokestatic _o9.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 2
      // 2c: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 2f: invokevirtual _o9.f_q (Ljava/lang/String;)Lz96;
      // 32: ifnull 47
      // 35: goto 3c
      // 38: invokestatic _o9.a (Loov;)Loov;
      // 3b: athrow
      // 3c: getstatic _o9.f Ljava/lang/String;
      // 3f: nop
      // 40: goto 4d
      // 43: invokestatic _o9.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: aload 1
      // 49: aload 2
      // 4a: invokespecial wlx.pjq (Ljava/net/SocketAddress;Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 4d: areturn
   }

   public iq7 sdn() {
      return (iq7)super.sdn();
   }

   @Override
   public bdo u2u() {
      return this.bdp;
   }

   @Override
   public vr1 sdn() {
      return this.sdn();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7248489278697408333L, -2398746458586357175L, MethodHandles.lookup().lookupClass()).a(122614240564070L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 91256225915203L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("â\f\u0088J\u0013\u0081Õ\u0082Ã´¨z\u0004\u0004\u0081ë6IjÔ\u000b¼Èv\u0095¨U\u000b¤Þ\u0099\b".getBytes("ISO-8859-1"));
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
