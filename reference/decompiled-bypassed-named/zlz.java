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
import org.apache.commons.lang3.StringUtils;

public class zlz extends gdz {
   private static final long b;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public zlz(int var1, String[] var2) {
      long var3 = b ^ 69629981361216L;
      super(0, new String[]{var2[0], var2[1]});
      this.zn5 = StringUtils.isEmpty(var2[2]) ? a<"z">(31249, 7796386508788921232L ^ var3) : var2[2].toLowerCase();
   }

   public zlz(String var1) {
      this(0, u9g(var1));
   }

   public zlz(gdz var1, String var2) {
      this(var1.toString(), var2);
   }

   public zlz(String var1, String var2) {
      long var3 = b ^ 53595656198651L;
      this(0, u9g(var1 + '#' + (var2 == null ? a<"z">(19178, 8538659118158831313L ^ var3) : var2)));
   }

   public static String[] u9g(String var0) {
      String[] var1 = new String[]{null, var0, null};
      int var2 = var0.indexOf(35);
      String var3 = var0;

      label18: {
         try {
            if (var2 < 0) {
               break label18;
            }

            var1[2] = var0.substring(var2 + 1, var0.length());
            if (var2 <= 1) {
               break label18;
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var3 = var0.substring(0, var2);
      }

      System.arraycopy(gdz.n17(var3), 0, var1, 0, 2);
      return var1;
   }

   public String qek() {
      return this.zn5;
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic zlz.b (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic zlz.b (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: instanceof zlz
      // 1e: iload 2
      // 1f: ifne 58
      // 22: ifeq 57
      // 25: goto 2c
      // 28: invokestatic zlz.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 1
      // 2e: invokespecial gdz.equals (Ljava/lang/Object;)Z
      // 31: iload 2
      // 32: ifne 58
      // 35: goto 3c
      // 38: invokestatic zlz.b (Loov;)Loov;
      // 3b: athrow
      // 3c: ifeq 57
      // 3f: goto 46
      // 42: invokestatic zlz.b (Loov;)Loov;
      // 45: athrow
      // 46: aload 1
      // 47: checkcast zlz
      // 4a: astore 3
      // 4b: aload 0
      // 4c: getfield zlz.zn5 Ljava/lang/String;
      // 4f: aload 3
      // 50: getfield zlz.zn5 Ljava/lang/String;
      // 53: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 56: ireturn
      // 57: bipush 0
      // 58: ireturn
   }

   @Override
   public int hashCode() {
      return 31 * super.hashCode() + this.zn5.hashCode();
   }

   @Override
   public String toString() {
      return super.toString() + '#' + this.zn5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4186317970347089942L, -5480411806763612599L, MethodHandles.lookup().lookupClass()).a(13223887341069L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 60419736915417L;
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
      String var6 = "I¬]\u0019Ì-\u009f\u0088A\u0081ÔràTÐ\u009b\u0018C¢BP³;æx/'\u001bèåE\u008e\u00add©?ÓÃú§l";
      int var8 = "I¬]\u0019Ì-\u009f\u0088A\u0081ÔràTÐ\u009b\u0018C¢BP³;æx/'\u001bèåE\u008e\u00add©?ÓÃú§l".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov b(oov var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17823;
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
            throw new RuntimeException("zlz", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("zlz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
