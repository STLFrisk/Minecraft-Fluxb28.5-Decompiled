import com.google.common.collect.Lists;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kcc extends IOException {
   private final List sxf = Lists.newArrayList();
   private final String _yu;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public kcc(String var1) {
      this.sxf.add(new kcc$x7y(null));
      this._yu = var1;
   }

   public kcc(String var1, Throwable var2) {
      super(var2);
      this.sxf.add(new kcc$x7y(null));
      this._yu = var1;
   }

   public void n8f(String var1) {
      kcc$x7y.y4r((kcc$x7y)this.sxf.get(0), var1);
   }

   public void oic(String var1) {
      kcc$x7y.anc((kcc$x7y)this.sxf.get(0), var1);
      this.sxf.add(0, new kcc$x7y(null));
   }

   @Override
   public String getMessage() {
      long var1 = a ^ 99919827662760L;
      return a<"p">(23, 5265940691098175133L ^ var1)
         + ((kcc$x7y)this.sxf.get(this.sxf.size() - 1)).toString()
         + a<"p">(7783, 6552414173522565356L ^ var1)
         + this._yu;
   }

   public static kcc slw(Exception param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic kcc.a J
      // 03: ldc2_w 44590779134929
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 28
      // 11: instanceof kcc
      // 14: ifeq 27
      // 17: goto 1e
      // 1a: invokestatic kcc.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: checkcast kcc
      // 22: areturn
      // 23: invokestatic kcc.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 2b: astore 4
      // 2d: aload 0
      // 2e: instanceof java/io/FileNotFoundException
      // 31: ifeq 44
      // 34: sipush 12460
      // 37: ldc2_w 8206012801415328348
      // 3a: lload 1
      // 3b: lxor
      // 3c: invokedynamic p (IJ)Ljava/lang/String; bsm=kcc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: nop
      // 42: astore 4
      // 44: new kcc
      // 47: dup
      // 48: aload 4
      // 4a: aload 0
      // 4b: invokespecial kcc.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4e: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3093779807353556799L, 1975081552096216603L, MethodHandles.lookup().lookupClass()).a(195053668701035L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 11426395831097L;
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
      String var6 = "7¨°\u001cèý\u0000¢%«\r4\u009aHÕh \u001c3ýíÝ\u0089I¡ ¥O\u0002\u000f¬\u0086´þ?kËx\u008e¨¡ÂÖMÍ}\fË\u009a EÞÈPÓ\u0094n\u0015°Y*\u008eì\f2þ69l/N\rÅ\u0000\u0017Ï4HvÕRh";
      int var8 = "7¨°\u001cèý\u0000¢%«\r4\u009aHÕh \u001c3ýíÝ\u0089I¡ ¥O\u0002\u000f¬\u0086´þ?kËx\u008e¨¡ÂÖMÍ}\fË\u009a EÞÈPÓ\u0094n\u0015°Y*\u008eì\f2þ69l/N\rÅ\u0000\u0017Ï4HvÕRh"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14928;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("kcc", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("kcc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
