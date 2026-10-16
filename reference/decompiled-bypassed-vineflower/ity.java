import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.reflect.ReflectorForge;

public class ity implements g68 {
   public static final Set cxb;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ity(Map var1) {
      this.md0 = var1;
   }

   @Override
   public InputStream e77(gdz param1) {
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
      // 05: aload 1
      // 06: invokespecial ity.jyh (Lgdz;)Ljava/io/InputStream;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 24
      // 0f: ifnull 1f
      // 12: goto 19
      // 15: invokestatic ity.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: aload 3
      // 1a: areturn
      // 1b: invokestatic ity.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 1
      // 21: invokevirtual ity.bxo (Lgdz;)Ljava/io/InputStream;
      // 24: astore 4
      // 26: aload 4
      // 28: iload 2
      // 29: ifeq 38
      // 2c: ifnull 39
      // 2f: goto 36
      // 32: invokestatic ity.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 35: athrow
      // 36: aload 4
      // 38: areturn
      // 39: new java/io/FileNotFoundException
      // 3c: dup
      // 3d: aload 1
      // 3e: invokevirtual gdz.xyp ()Ljava/lang/String;
      // 41: invokespecial java/io/FileNotFoundException.<init> (Ljava/lang/String;)V
      // 44: athrow
   }

   public InputStream bxo(gdz var1) {
      int var2 = t9d.b();
      File var3 = (File)this.md0.get(var1.toString());

      File var10000;
      label27: {
         try {
            var10000 = var3;
            if (var2 == 0) {
               break label27;
            }

            if (var3 == null) {
               return null;
            }
         } catch (RuntimeException var5) {
            throw a(var5);
         }

         var10000 = var3;
      }

      try {
         if (var10000.isFile()) {
            return new FileInputStream(var3);
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return null;
   }

   private InputStream jyh(gdz var1) {
      long var2 = a ^ 73051449885041L;
      String var5 = a<"f">(2119, 1633882360606598092L ^ var2) + var1._a7() + "/" + var1.xyp();
      int var10000 = t9d.c();
      InputStream var6 = ReflectorForge.getOptiFineResourceStream(var5);
      int var4 = var10000;

      try {
         if (var4 != 0) {
            return var6;
         }

         if (var6 != null) {
            return var6;
         }
      } catch (RuntimeException var7) {
         throw a(var7);
      }

      return ity.class.getResourceAsStream(var5);
   }

   @Override
   public boolean g1w(gdz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1f
      // 09: aload 1
      // 0a: invokespecial ity.jyh (Lgdz;)Ljava/io/InputStream;
      // 0d: ifnonnull 39
      // 10: goto 17
      // 13: invokestatic ity.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: aload 0
      // 18: goto 1f
      // 1b: invokestatic ity.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: getfield ity.md0 Ljava/util/Map;
      // 22: aload 1
      // 23: invokevirtual gdz.toString ()Ljava/lang/String;
      // 26: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2b: iload 2
      // 2c: ifne 3a
      // 2f: ifeq 3d
      // 32: goto 39
      // 35: invokestatic ity.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   @Override
   public Set olh() {
      return cxb;
   }

   @Override
   public z08 ui7(if1 var1, String var2) {
      long var3 = a ^ 2389499922675L;

      try {
         FileInputStream var5 = new FileInputStream((File)this.md0.get(a<"f">(11017, 2102993567598332162L ^ var3)));
         return snh.xey(var1, var5, var2);
      } catch (RuntimeException var6) {
         return (z08)null;
      } catch (FileNotFoundException var7) {
         return (z08)null;
      }
   }

   @Override
   public BufferedImage rry() {
      long var1 = a ^ 108513762885461L;
      return p9t.h3z(ity.class.getResourceAsStream("/" + new gdz(a<"f">(28964, 1450644893499155597L ^ var1)).xyp()));
   }

   @Override
   public String qw5() {
      long var1 = a ^ 81215367810169L;
      return a<"f">(24872, 7951085117284239276L ^ var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9190134343195071925L, -2883055750096356813L, MethodHandles.lookup().lookupClass()).a(28647785755127L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 70051069415851L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "éZô-ß\u0004\u001e£ß1S\u0097\u0006nDð£ä7\u0010hOâT½ô/#-G]Å\u0010\u0003ÿ¢õ25\u008fkCªhæ!öµ\u0000\u0018\nË\\\u001fú5§=ºD4\u0017}T6îé`\u0007¶\u0012¹L\u0018\u0018Ê\u0011260½ËzmÙûDÚ\u008duÑ>Ü\u0016\u0014\u0010g)\u0003";
      int var6 = "éZô-ß\u0004\u001e£ß1S\u0097\u0006nDð£ä7\u0010hOâT½ô/#-G]Å\u0010\u0003ÿ¢õ25\u008fkCªhæ!öµ\u0000\u0018\nË\\\u001fú5§=ºD4\u0017}T6îé`\u0007¶\u0012¹L\u0018\u0018Ê\u0011260½ËzmÙûDÚ\u008duÑ>Ü\u0016\u0014\u0010g)\u0003"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[6];
                     cxb = ImmutableSet.of(a<"f">(11573, 5797387540320540261L ^ var9), a<"f">(5682, 2406480307193933152L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "FqD\u009dÖ¨;¾¡\u0012evà½ùd` \u0013\u008d9ra¦\u0010\u0085¾¯e\u0094c/\u009a\u000bó!.83\u0096\u0007";
                  var6 = "FqD\u009dÖ¨;¾¡\u0012evà½ùd` \u0013\u008d9ra¦\u0010\u0085¾¯e\u0094c/\u009a\u000bó!.83\u0096\u0007".length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24425;
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
            throw new RuntimeException("ity", var10);
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
         throw new RuntimeException("ity" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
