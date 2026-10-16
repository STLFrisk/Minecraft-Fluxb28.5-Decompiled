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

public class jhy extends gt4 {
   private boolean hmv;
   private String rnm;
   private final gkx$lpc vdq;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public jhy(gkx$lpc var1, int var2, int var3, int var4, String var5, boolean var6) {
      super(var2, var3, var4, 150, 20, "");
      this.rnm = var5;
      this.hmv = var6;
      this.frg = this.ncx();
      this.vdq = var1;
   }

   private String ncx() {
      long var1 = b ^ 71264674033653L;
      int var3 = OpaquePredicate.b();
      StringBuilder var10000 = new StringBuilder().append(fc1.gx1(this.rnm, new Object[0]));
      String var10001 = b<"y">(1324, 2507607709061390532L ^ var1);
      if (var3 != 0) {
         try {
            var10000 = var10000.append(var10001);
            if (this.hmv) {
               return var10000.append(fc1.gx1(b<"y">(29907, 3571199997751808313L ^ var1), new Object[0])).toString();
            }
         } catch (oov var4) {
            throw c(var4);
         }

         var10001 = b<"y">(27654, 7440411974380210671L ^ var1);
      }

      return var10000.append(fc1.gx1(var10001, new Object[0])).toString();
   }

   public void ogq(boolean var1) {
      this.hmv = var1;
      this.frg = this.ncx();
      this.vdq.spf(this._me, var1);
   }

   @Override
   public boolean mousePressed(Minecraft param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: iload 2
      // 08: iload 3
      // 09: invokespecial gt4.mousePressed (Lc05;II)Z
      // 0c: iload 4
      // 0e: ifne 5a
      // 11: ifeq 59
      // 14: goto 1b
      // 17: invokestatic jhy.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getfield jhy.hmv Z
      // 20: iload 4
      // 22: ifne 37
      // 25: goto 2c
      // 28: invokestatic jhy.c (Loov;)Loov;
      // 2b: athrow
      // 2c: ifne 3a
      // 2f: goto 36
      // 32: invokestatic jhy.c (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: putfield jhy.hmv Z
      // 3e: aload 0
      // 3f: aload 0
      // 40: invokespecial jhy.ncx ()Ljava/lang/String;
      // 43: putfield jhy.frg Ljava/lang/String;
      // 46: aload 0
      // 47: getfield jhy.vdq Lgkx$lpc;
      // 4a: aload 0
      // 4b: getfield jhy._me I
      // 4e: aload 0
      // 4f: getfield jhy.hmv Z
      // 52: invokeinterface gkx$lpc.spf (IZ)V 3
      // 57: bipush 1
      // 58: ireturn
      // 59: bipush 0
      // 5a: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7563348372951843577L, 3633484067892004021L, MethodHandles.lookup().lookupClass()).a(121734910405114L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 137673203507054L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "K\u008döô£\u009dõ\u008d¾\u0091\u0083ÞHÚ¾d\u0010¶V\u0092DbD÷(S/\u0092\u0002Há\u0010r\u0010êþ\u001epB´U\u009a\u008f\f¬¥×\u0004\u00ad?";
      int var8 = "K\u008döô£\u009dõ\u008d¾\u0091\u0083ÞHÚ¾d\u0010¶V\u0092DbD÷(S/\u0092\u0002Há\u0010r\u0010êþ\u001epB´U\u009a\u008f\f¬¥×\u0004\u00ad?".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov c(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11265;
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
            throw new RuntimeException("jhy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = c(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("jhy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
