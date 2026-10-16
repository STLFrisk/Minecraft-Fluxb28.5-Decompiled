import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.world.gen.structure.StructureMineshaftStart;

public class xi0 extends fln {
   private double zb_ = 0.004;
   private static final long b;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public xi0() {
   }

   @Override
   public String tqd() {
      long var1 = b ^ 79222169747579L;
      return b<"x">(28653, 2402945449151223256L ^ var1);
   }

   public xi0(Map var1) {
      long var2 = b ^ 126585937613829L;
      super();
      this.zb_ = 0.004;
      int var10000 = t9d.c();
      Iterator var5 = var1.entrySet().iterator();
      int var4 = var10000;

      while (var5.hasNext()) {
         Entry var6 = (Entry)var5.next();

         try {
            if (((String)var6.getKey()).equals(b<"x">(25786, 7069478877376039664L ^ var2))) {
               this.zb_ = fe6.v6n((String)var6.getValue(), this.zb_);
            }
         } catch (oov var7) {
            throw a(var7);
         }

         if (var4 != 0) {
            break;
         }
      }
   }

   @Override
   public boolean ary(int param1, int param2) {
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
      // 05: getfield xi0.a0f Ljava/util/Random;
      // 08: invokevirtual java/util/Random.nextDouble ()D
      // 0b: aload 0
      // 0c: getfield xi0.zb_ D
      // 0f: dcmpg
      // 10: iload 3
      // 11: ifeq 2e
      // 14: ifge 52
      // 17: goto 1e
      // 1a: invokestatic xi0.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield xi0.a0f Ljava/util/Random;
      // 22: bipush 80
      // 24: invokevirtual java/util/Random.nextInt (I)I
      // 27: goto 2e
      // 2a: invokestatic xi0.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 3
      // 2f: ifeq 4f
      // 32: iload 1
      // 33: invokestatic java/lang/Math.abs (I)I
      // 36: iload 2
      // 37: invokestatic java/lang/Math.abs (I)I
      // 3a: invokestatic java/lang/Math.max (II)I
      // 3d: if_icmpge 52
      // 40: goto 47
      // 43: invokestatic xi0.a (Loov;)Loov;
      // 46: athrow
      // 47: bipush 1
      // 48: goto 4f
      // 4b: invokestatic xi0.a (Loov;)Loov;
      // 4e: athrow
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   @Override
   public ijb sph(int var1, int var2) {
      return new StructureMineshaftStart(this.pr9, this.a0f, var1, var2);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4621047410320703669L, 3445611847978055482L, MethodHandles.lookup().lookupClass()).a(249561492065732L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 4696322964473L;
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
      String var6 = "\n_Þ\u0088\u000e%ûç\u0090ôØ\u009e\u0005E\u000f¬s2\u000ec\u0015\u0089§¸Ádè\u0098J\u0005\u000f¥\u0010ß¯±ö\u0007OÝ¡§÷\u00001Sçzé";
      int var8 = "\n_Þ\u0088\u000e%ûç\u0090ôØ\u009e\u0005E\u000f¬s2\u000ec\u0015\u0089§¸Ádè\u0098J\u0005\u000f¥\u0010ß¯±ö\u0007OÝ¡§÷\u00001Sçzé".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 965;
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
            throw new RuntimeException("xi0", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("xi0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
