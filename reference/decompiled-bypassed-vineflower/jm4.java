import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.status.client.C00PacketServerQuery;
import net.minecraft.network.status.client.C01PacketPing;
import net.minecraft.network.status.server.S01PacketPong;

public class jm4 implements tcf {
   public jm4(vr1 var1, hv0 var2) {
      this.q4f = var1;
      this.atn = var2;
   }

   @Override
   public void az3(ekw var1) {
   }

   @Override
   public void gow(C00PacketServerQuery param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 38
      // 09: getfield jm4.ksu Z
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic jm4.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield jm4.atn Lhv0;
      // 1a: getstatic jm4.odp Lekw;
      // 1d: invokevirtual hv0.g8c (Lekw;)V
      // 20: iload 2
      // 21: ifne 4c
      // 24: goto 2b
      // 27: invokestatic jm4.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: bipush 1
      // 2d: putfield jm4.ksu Z
      // 30: aload 0
      // 31: goto 38
      // 34: invokestatic jm4.a (Loov;)Loov;
      // 37: athrow
      // 38: getfield jm4.atn Lhv0;
      // 3b: new net/minecraft/network/status/server/S00PacketServerInfo
      // 3e: dup
      // 3f: aload 0
      // 40: getfield jm4.q4f Lvr1;
      // 43: invokevirtual vr1.wkq ()Lzuz;
      // 46: invokespecial net/minecraft/network/status/server/S00PacketServerInfo.<init> (Lzuz;)V
      // 49: invokevirtual hv0.k7f (Lmz2;)V
      // 4c: return
   }

   @Override
   public void _qg(C01PacketPing var1) {
      this.atn.k7f(new S01PacketPong(var1.q7m()));
      this.atn.g8c(odp);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4828330775599397206L, -6810123867780129014L, MethodHandles.lookup().lookupClass()).a(7431185365021L);
      // $VF: monitorexit
      long var4 = var10000 ^ 11489412992171L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("TWá\u0015sg½\u0012vD£\u0095{à´\u0098¶¨¯¿e\u009e\u008a\u0082\u0006\u0003\tÕ\u001cuµ3sè\u008c\u0097Å2tº".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      odp = new tao(var0);
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
