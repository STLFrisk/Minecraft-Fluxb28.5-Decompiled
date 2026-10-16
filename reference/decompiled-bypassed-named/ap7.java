import com.google.common.collect.Lists;
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

public class ap7 implements wra, sjk {
   private final List lct;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ap7() {
      int var10000 = OpaquePredicate.b();
      this.lct = Lists.newArrayList();
      int var1 = var10000;
      Minecraft var2 = Minecraft.vz1();

      for (q2m var4 : var2.tij.fgp().yhf()) {
         this.lct.add(new ap7$wzr(this, var4));
         if (var1 == 0) {
            break;
         }
      }
   }

   @Override
   public List _ec() {
      return this.lct;
   }

   @Override
   public ekw iuh() {
      long var1 = a ^ 133499319425396L;
      return new tao(a<"r">(30037, 5624538241698862163L ^ var1));
   }

   @Override
   public void z9x(al9 var1) {
      var1.rg3(this);
   }

   @Override
   public ekw s34() {
      long var1 = a ^ 71656292297142L;
      return new tao(a<"r">(19962, 2354468990461811775L ^ var1));
   }

   @Override
   public void b6x(float var1, int var2) {
      Minecraft.vz1().l22().anl(akr._rg);
      b0t.vfo(0, 0, 16.0F, 0.0F, 16, 16, 256.0F, 256.0F);
   }

   @Override
   public boolean v4p() {
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
      // 05: getfield ap7.lct Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 2
      // 0e: aload 2
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 46
      // 17: aload 2
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast sjk
      // 20: astore 3
      // 21: aload 3
      // 22: invokeinterface sjk.v4p ()Z 1
      // 27: iload 1
      // 28: ifeq 47
      // 2b: iload 1
      // 2c: ifeq 41
      // 2f: goto 36
      // 32: invokestatic ap7.a (Loov;)Loov;
      // 35: athrow
      // 36: ifeq 42
      // 39: goto 40
      // 3c: invokestatic ap7.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 1
      // 41: ireturn
      // 42: iload 1
      // 43: ifne 0e
      // 46: bipush 0
      // 47: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1209661284354416663L, -3763648811248451323L, MethodHandles.lookup().lookupClass()).a(35947894160156L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 35871031941278L;
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
      String var6 = "L\u0012\u0018\fÝç¹³aé\u008e;©\u0010\u008béöÐ·\u000e: Ó©\u000elZ>£õ*O`¯z\u0007QL[xFÉ·ö\f%\u008dù:\u0006PÕH0ô\u0010(7j1O Ã\u009a¨öt4%4Q\u001cY\bü\u009f\u0097ÒS\u0089\u0087\u0004-Ü®³öaw=ìMsU\u0084ä\u009f";
      int var8 = "L\u0012\u0018\fÝç¹³aé\u008e;©\u0010\u008béöÐ·\u000e: Ó©\u000elZ>£õ*O`¯z\u0007QL[xFÉ·ö\f%\u008dù:\u0006PÕH0ô\u0010(7j1O Ã\u009a¨öt4%4Q\u001cY\bü\u009f\u0097ÒS\u0089\u0087\u0004-Ü®³öaw=ìMsU\u0084ä\u009f"
         .length();
      char var5 = '8';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17955;
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
            throw new RuntimeException("ap7", var10);
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
         throw new RuntimeException("ap7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
