import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vd3 {
   public static final Logger aja;
   public final Gson o11;
   private final File sgs;
   private final Map f6m = Maps.newHashMap();
   private boolean tyy = true;
   private static final ParameterizedType ghq;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public vd3(File var1) {
      this.sgs = var1;
      GsonBuilder var2 = new GsonBuilder().setPrettyPrinting();
      var2.registerTypeHierarchyAdapter(syv.class, new vd3$y_1(this, null));
      this.o11 = var2.create();
   }

   public boolean dc3() {
      return this.tyy;
   }

   public void gb3(boolean var1) {
      this.tyy = var1;
   }

   public void g7w(syv var1) {
      long var2 = a ^ 101568458097507L;
      this.f6m.put(this.j6t(var1.gma()), var1);

      try {
         this.lil();
      } catch (IOException var5) {
         aja.warn(a<"f">(1608, 548032703367579075L ^ var2), var5);
      }
   }

   public syv fsa(Object var1) {
      this.gj6();
      return (syv)this.f6m.get(this.j6t(var1));
   }

   public void qwz(Object var1) {
      long var2 = a ^ 123585889129929L;
      this.f6m.remove(this.j6t(var1));

      try {
         this.lil();
      } catch (IOException var5) {
         aja.warn(a<"f">(12417, 4999202458308404641L ^ var2), var5);
      }
   }

   public String[] zim() {
      return this.f6m.keySet().toArray(new String[this.f6m.size()]);
   }

   public String j6t(Object var1) {
      return var1.toString();
   }

   public boolean vb_(Object var1) {
      return this.f6m.containsKey(this.j6t(var1));
   }

   private void gj6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 2
      // 04: invokestatic t9d.c ()I
      // 07: aload 0
      // 08: getfield vd3.f6m Ljava/util/Map;
      // 0b: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 10: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 15: astore 3
      // 16: istore 1
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d: ifeq 60
      // 20: aload 3
      // 21: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26: checkcast syv
      // 29: astore 4
      // 2b: aload 4
      // 2d: invokevirtual syv.z6q ()Z
      // 30: iload 1
      // 31: ifne 6d
      // 34: iload 1
      // 35: ifne 5b
      // 38: goto 3f
      // 3b: invokestatic vd3.b (Loov;)Loov;
      // 3e: athrow
      // 3f: ifeq 5c
      // 42: goto 49
      // 45: invokestatic vd3.b (Loov;)Loov;
      // 48: athrow
      // 49: aload 2
      // 4a: aload 4
      // 4c: invokevirtual syv.gma ()Ljava/lang/Object;
      // 4f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 54: goto 5b
      // 57: invokestatic vd3.b (Loov;)Loov;
      // 5a: athrow
      // 5b: pop
      // 5c: iload 1
      // 5d: ifeq 17
      // 60: aload 2
      // 61: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 66: astore 3
      // 67: aload 3
      // 68: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6d: ifeq 88
      // 70: aload 3
      // 71: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 76: astore 4
      // 78: aload 0
      // 79: getfield vd3.f6m Ljava/util/Map;
      // 7c: aload 4
      // 7e: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 83: pop
      // 84: iload 1
      // 85: ifeq 67
      // 88: return
   }

   public syv fna(JsonObject var1) {
      return new syv(null, var1);
   }

   public Map tko() {
      return this.f6m;
   }

   public void lil() {
      Collection var1 = this.f6m.values();
      String var2 = this.o11.toJson(var1);
      BufferedWriter var3 = null;

      try {
         var3 = Files.newWriter(this.sgs, Charsets.UTF_8);
         var3.write(var2);
      } finally {
         IOUtils.closeQuietly(var3);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2988912362265089788L, -7245005251066729453L, MethodHandles.lookup().lookupClass()).a(217998536833392L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 83566475131295L;
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
      String var6 = "\u008eù\n\"³\u0089åá\u0083m>¡ú;\u007fÇ\u008f\u0000\u0082oAù\u0088ä\u0010$Q\u0004\u0098¸\u0013ÝÒ©òïí¾\u0095\r\u0004\u0080ß[@_þ/M,LD)@\u0083@*@,\u008a\u000e@Ò»\u0019M\u0010|¥\u00000=P\u0019áP\u000bÚh\u0012S\u008b7\u0000gÇ\u0083l¯í\rÌN<\u008f¦\u008b»çY«\fÒ\u00ad~\u0082\u0089×.\u008aß¸)\u009a0\u0015ß\u0091\u0014ÐjÁXa\u00996F\u008aÕ6Ã\u0012\u0012èãÀ\u001d_\f\u000f\u0017fBÃ\u0001»g]ëX)rÞ";
      int var8 = "\u008eù\n\"³\u0089åá\u0083m>¡ú;\u007fÇ\u008f\u0000\u0082oAù\u0088ä\u0010$Q\u0004\u0098¸\u0013ÝÒ©òïí¾\u0095\r\u0004\u0080ß[@_þ/M,LD)@\u0083@*@,\u008a\u000e@Ò»\u0019M\u0010|¥\u00000=P\u0019áP\u000bÚh\u0012S\u008b7\u0000gÇ\u0083l¯í\rÌN<\u008f¦\u008b»çY«\fÒ\u00ad~\u0082\u0089×.\u008aß¸)\u009a0\u0015ß\u0091\u0014ÐjÁXa\u00996F\u008aÕ6Ã\u0012\u0012èãÀ\u001d_\f\u000f\u0017fBÃ\u0001»g]ëX)rÞ"
         .length();
      char var5 = 'H';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            aja = LogManager.getLogger();
            ghq = new vd3$1();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7124;
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
            throw new RuntimeException("vd3", var10);
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
         throw new RuntimeException("vd3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
