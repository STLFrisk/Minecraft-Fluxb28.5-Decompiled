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
import org.lwjgl.input.Mouse;

public abstract class ak9 {
   public int koa;
   public int mff;
   public int vms;
   public int c1c;
   public int lze;
   public int ijd;
   public String vy4;
   public boolean yu6;
   public boolean u_u;
   public nm6 loa;
   public String bqh;
   public boolean n0w;
   public String q4d;
   public tne git;
   private static final long b;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public ak9(nm6 var1, int var2, int var3, String var4) {
      long var5 = b ^ 99672915825548L;
      super();
      this.g7x = true;
      this.bqh = a<"q">(15041, 5180884678387445888L ^ var5);
      this.n0w = true;
      this.q4d = a<"q">(29974, 5986002951036698452L ^ var5);
      this.jfr = true;
      this.git = null;
      this.loa = var1;
      this.lze = var2;
      this.ijd = var3;
      this.vy4 = var4;
   }

   public void q_0() {
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
      // 05: getfield ak9.git Ltne;
      // 08: iload 1
      // 09: ifeq 49
      // 0c: ifnull 31
      // 0f: goto 16
      // 12: invokestatic ak9.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield ak9.mff I
      // 1b: aload 0
      // 1c: getfield ak9.loa Lnm6;
      // 1f: getfield nm6.mut I
      // 22: isub
      // 23: putfield ak9.mff I
      // 26: iload 1
      // 27: ifne 60
      // 2a: goto 31
      // 2d: invokestatic ak9.b (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: aload 0
      // 33: getfield ak9.loa Lnm6;
      // 36: getfield nm6.ait I
      // 39: aload 0
      // 3a: getfield ak9.lze I
      // 3d: iadd
      // 3e: putfield ak9.koa I
      // 41: aload 0
      // 42: goto 49
      // 45: invokestatic ak9.b (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield ak9.loa Lnm6;
      // 4d: getfield nm6.po6 I
      // 50: aload 0
      // 51: getfield ak9.ijd I
      // 54: iadd
      // 55: aload 0
      // 56: getfield ak9.loa Lnm6;
      // 59: getfield nm6.mut I
      // 5c: isub
      // 5d: putfield ak9.mff I
      // 60: return
   }

   public boolean nxv(int var1, int var2) {
      long var3 = b ^ 40693505371343L;

      float var10000;
      label17: {
         try {
            if (this.q4d.contains(a<"q">(13975, 6953857014687482775L ^ var3))) {
               var10000 = 5.0F;
               break label17;
            }
         } catch (oov var6) {
            throw b(var6);
         }

         var10000 = 0.0F;
      }

      float var5 = var10000;
      return rak.c38((float)var1, (float)var2, (float)this.koa + var5, (float)this.mff, (float)(this.koa + this.vms) - var5, (float)(this.mff + this.c1c));
   }

   public void vx9() {
      this.yu6 = false;
      this.u_u = Mouse.isButtonDown(0);
   }

   public void fc9(boolean param1) {
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
      // 05: iload 1
      // 06: putfield ak9.jfr Z
      // 09: iload 1
      // 0a: iload 2
      // 0b: ifne 2e
      // 0e: ifne 36
      // 11: goto 18
      // 14: invokestatic ak9.b (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 2
      // 1a: ifne 32
      // 1d: goto 24
      // 20: invokestatic ak9.b (Loov;)Loov;
      // 23: athrow
      // 24: instanceof tne
      // 27: goto 2e
      // 2a: invokestatic ak9.b (Loov;)Loov;
      // 2d: athrow
      // 2e: ifeq 36
      // 31: aload 0
      // 32: bipush 0
      // 33: putfield ak9.c1c I
      // 36: return
   }

   public void c2n(int var1, int var2) {
      this.q_0();
   }

   public void ta0(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 1c
      // 09: getfield ak9.jfr Z
      // 0c: ifne 1b
      // 0f: goto 16
      // 12: invokestatic ak9.b (Loov;)Loov;
      // 15: athrow
      // 16: return
      // 17: invokestatic ak9.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 1
      // 1d: iload 2
      // 1e: invokevirtual ak9.g1p (II)V
      // 21: return
   }

   public abstract void g1p(int var1, int var2);

   public abstract void x6o(int var1, int var2, boolean var3);

   public boolean kt6() {
      return this.g7x;
   }

   public void ez7(boolean var1) {
      this.g7x = var1;
   }

   public boolean eke() {
      return this.jfr;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7794397690904024803L, -3141104594050792597L, MethodHandles.lookup().lookupClass()).a(27831155937295L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 17198961019430L;
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
      String var6 = "^h¨³\u008c>½µ\u001fÎL)M^ºE`ïÄÛÎ2P?»È\u0082Fÿ,\u0012À\u0010[\u0096Qü$±qx\nÃz\u00ad<û\u0096s Ó&üs\u0083d:½=/ùØ{=a¾W\u0084å¿Ï\u009c$Kx^ü\u0082E'O\u0006";
      int var8 = "^h¨³\u008c>½µ\u001fÎL)M^ºE`ïÄÛÎ2P?»È\u0082Fÿ,\u0012À\u0010[\u0096Qü$±qx\nÃz\u00ad<û\u0096s Ó&üs\u0083d:½=/ùØ{=a¾W\u0084å¿Ï\u009c$Kx^ü\u0082E'O\u0006"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24286;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ak9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("ak9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
