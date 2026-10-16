import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;
import us.myles.ViaVersion.api.protocol.ProtocolVersion;

public class n_l extends gbe {
   public n_l$cl5 a9s;
   private gbe _sw;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public n_l(gbe var1) {
      this._sw = var1;
   }

   @Override
   public void initGui() {
      long var1 = a ^ 99295449371043L;
      super.initGui();
      this.khf.add(new gt4(1, this.dt7 / 2 - 100, this.o1e - 27, 200, 20, b<"h">(15805, 8776194919255597391L ^ var1)));
      this.a9s = new n_l$cl5(this, this.f41, this.dt7, this.o1e, 32, this.o1e - 32, 10);
   }

   @Override
   public void actionPerformed(gt4 param1) {
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
      // 06: ifeq 27
      // 09: getfield n_l.a9s Ln_l$cl5;
      // 0c: aload 1
      // 0d: invokevirtual n_l$cl5.ncl (Lgt4;)V
      // 10: aload 1
      // 11: getfield gt4._me I
      // 14: bipush 1
      // 15: if_icmpne 31
      // 18: goto 1f
      // 1b: invokestatic n_l.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 27
      // 23: invokestatic n_l.a (Loov;)Loov;
      // 26: athrow
      // 27: getfield n_l.f41 Lc05;
      // 2a: aload 0
      // 2b: getfield n_l._sw Lgbe;
      // 2e: invokevirtual c05.z2i (Lgbe;)V
      // 31: return
   }

   @Override
   public void handleMouseInput() {
      this.a9s.gzb();
      super.handleMouseInput();
   }

   @Override
   public void drawScreen(int var1, int var2, float var3) {
      long var4 = a ^ 72659498961564L;
      this.xmz();
      this.a9s.j46(var1, var2, var3);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      jsr.yk7.lt2(syo.u4m.toString() + b<"h">(5113, 5504838220551001141L ^ var4), (float)(this.dt7 / 4), 6.0F, 16777215);
      GL11.glPopMatrix();
      super.drawScreen(var1, var2, var3);
   }

   public static void wvk(int var0, boolean var1) {
      try {
         uy1.al8 = ((ProtocolVersion)sot.pem().get(var0)).getVersion();
         if (var1) {
            zwr.o04.ms1((float)var0);
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2233794590980777531L, -6257413212746099115L, MethodHandles.lookup().lookupClass()).a(242124702425173L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 121234903475359L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u0018ã~\u0087é\u0098\u0089 î9ÁY\u0082:\nVF\t» \u0090þ?\u007f\u0010\u008a[|\u009fjÄ\u0005æä4ð\u001fcò÷Ã";
      int var8 = "\u0018ã~\u0087é\u0098\u0089 î9ÁY\u0082:\nVF\t» \u0090þ?\u007f\u0010\u008a[|\u009fjÄ\u0005æä4ð\u001fcò÷Ã".length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            g = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10238;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("n_l", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("n_l" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
