import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandles;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class arf extends u7m {
   private Set _24;
   public float qng = 4.0F;
   public float mqh;
   public u7m$vz9 yjw;
   private static final long a;
   private static final String b;

   public arf(float var1, u7m$vz9 var2, Set var3) {
      this.yjw = var2;
      this._24 = var3;
      this.vgp = 1;
      this.rlr(var2.sqv());
      this.qng = var2.kv9();
      this.mqh = var1 + var2.zua();
      this.qfy(uja.zip);
   }

   @Override
   public float v1f(erg param1, e0x param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 24
      // 09: getfield arf._24 Ljava/util/Set;
      // 0c: aload 2
      // 0d: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 12: ifeq 2a
      // 15: goto 1c
      // 18: invokestatic arf.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: goto 24
      // 20: invokestatic arf.a (Loov;)Loov;
      // 23: athrow
      // 24: getfield arf.qng F
      // 27: goto 2b
      // 2a: fconst_1
      // 2b: freturn
   }

   @Override
   public boolean gtk(erg var1, g_3 var2, g_3 var3) {
      var1.ybw(2, var3);
      return true;
   }

   @Override
   public boolean ziu(erg param1, t9d param2, e0x param3, mew param4, g_3 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 6
      // 05: aload 3
      // 06: aload 2
      // 07: aload 4
      // 09: invokevirtual e0x.wnt (Lt9d;Lmew;)F
      // 0c: f2d
      // 0d: dconst_0
      // 0e: dcmpl
      // 0f: iload 6
      // 11: ifne 2d
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic arf.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: bipush 1
      // 20: aload 5
      // 22: invokevirtual erg.ybw (ILg_3;)V
      // 25: goto 2c
      // 28: invokestatic arf.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
   }

   @Override
   public boolean t0m() {
      return true;
   }

   public u7m$vz9 mc4() {
      return this.yjw;
   }

   @Override
   public int k7x() {
      return this.yjw.pmc();
   }

   public String y5n() {
      return this.yjw.toString();
   }

   @Override
   public boolean nur(erg param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifeq 26
      // 09: getfield arf.yjw Lu7m$vz9;
      // 0c: invokevirtual u7m$vz9.jw6 ()Lu7m;
      // 0f: aload 2
      // 10: invokevirtual erg.gn1 ()Lu7m;
      // 13: if_acmpne 25
      // 16: goto 1d
      // 19: invokestatic arf.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 2b
      // 21: invokestatic arf.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: aload 2
      // 28: invokespecial u7m.nur (Lerg;Lerg;)Z
      // 2b: ireturn
   }

   @Override
   public Multimap hv4() {
      long var1 = a ^ 106106808786917L;
      Multimap var3 = super.hv4();
      var3.put(m6d.y3f.ugh(), new xk5(lz8, b, (double)this.mqh, 0));
      return var3;
   }

   public float ogh() {
      return this.qng;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7976740200353098594L, -2697215696909819518L, MethodHandles.lookup().lookupClass()).a(66814312700310L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 131683653508089L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("f\u001dÊi\u0016ýK\u001fÌ\u0004#ÚewFè".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      b = var6;
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
