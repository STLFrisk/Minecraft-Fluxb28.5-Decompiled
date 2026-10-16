import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class c8g implements a83 {
   public final Map jvn = this.tn6();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public Map tn6() {
      return Maps.newHashMap();
   }

   @Override
   public Object _gz(Object var1) {
      return this.jvn.get(var1);
   }

   @Override
   public void emn(Object param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c8g.a J
      // 03: ldc2_w 63915925212972
      // 06: lxor
      // 07: lstore 3
      // 08: aload 1
      // 09: invokestatic org/apache/commons/lang3/Validate.notNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c: pop
      // 0d: invokestatic t9d.b ()I
      // 10: aload 2
      // 11: invokestatic org/apache/commons/lang3/Validate.notNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 14: pop
      // 15: istore 5
      // 17: aload 0
      // 18: getfield c8g.jvn Ljava/util/Map;
      // 1b: aload 1
      // 1c: iload 5
      // 1e: ifeq 74
      // 21: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 26: ifeq 6f
      // 29: goto 30
      // 2c: invokestatic c8g.b (Loov;)Loov;
      // 2f: athrow
      // 30: getstatic c8g.oy9 Lorg/apache/logging/log4j/Logger;
      // 33: new java/lang/StringBuilder
      // 36: dup
      // 37: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a: sipush 3091
      // 3d: ldc2_w 2783484100826646341
      // 40: lload 3
      // 41: lxor
      // 42: invokedynamic y (IJ)Ljava/lang/String; bsm=c8g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b: aload 1
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4f: sipush 18472
      // 52: ldc2_w 997328273134093183
      // 55: lload 3
      // 56: lxor
      // 57: invokedynamic y (IJ)Ljava/lang/String; bsm=c8g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 63: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;)V 2
      // 68: goto 6f
      // 6b: invokestatic c8g.b (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield c8g.jvn Ljava/util/Map;
      // 73: aload 1
      // 74: aload 2
      // 75: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7a: pop
      // 7b: return
   }

   public Set kqi() {
      return Collections.unmodifiableSet(this.jvn.keySet());
   }

   public boolean vqt(Object var1) {
      return this.jvn.containsKey(var1);
   }

   @Override
   public Iterator iterator() {
      return this.jvn.values().iterator();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2336228177698099490L, -6932048266343034138L, MethodHandles.lookup().lookupClass()).a(113970655362100L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 67867776116527L;
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
      String var6 = "1^\u0080³\u0013J\u000e\t<\u0006\u008a¬ÎH\u00adm$\u0002,u \u008d\u0006º(I6Á® \u001f«U\fÁ\"\u001a0g\u0091\u0017\u000f\u008aA\u001açú%å1\u001dßP^lÄlÕÐe~]Gê©";
      int var8 = "1^\u0080³\u0013J\u000e\t<\u0006\u008a¬ÎH\u00adm$\u0002,u \u008d\u0006º(I6Á® \u001f«U\fÁ\"\u001a0g\u0091\u0017\u000f\u008aA\u001açú%å1\u001dßP^lÄlÕÐe~]Gê©"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            oy9 = LogManager.getLogger();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26231;
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
            throw new RuntimeException("c8g", var10);
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
         throw new RuntimeException("c8g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
