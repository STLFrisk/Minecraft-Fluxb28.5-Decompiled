import com.google.gson.JsonParseException;
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
import org.apache.commons.lang3.exception.ExceptionUtils;

public class j2h extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 19303263630917L;
      return b<"c">(28690, 23457673605294311L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 34566563474115L;
      return b<"c">(30152, 3832761516582302137L ^ var2);
   }

   @Override
   public void l3z(e7r var1, String[] var2) {
      long var3 = a ^ 23698990039808L;

      try {
         if (var2.length < 2) {
            throw new w57(b<"c">(17432, 3853200533848189353L ^ var3), new Object[0]);
         }
      } catch (JsonParseException var11) {
         throw a(var11);
      }

      z96 var5 = h32(var1, var2[0]);
      String var6 = cai(var2, 1);

      try {
         ekw var7 = ekw$szt.wnw(var6);
         var5.a0d(ipm.yam(var1, var7, var5));
      } catch (JsonParseException var10) {
         Throwable var8 = ExceptionUtils.getRootCause(var10);

         dxs var10000;
         dxs var10001;
         String var10002;
         Object[] var10003;
         Object[] var10004;
         byte var10005;
         String var10006;
         label27: {
            try {
               var10000 = new dxs;
               var10001 = var10000;
               var10002 = b<"c">(12273, 7768611009737949762L ^ var3);
               var10003 = new Object[1];
               var10004 = var10003;
               var10005 = 0;
               if (var8 == null) {
                  var10006 = "";
                  break label27;
               }
            } catch (JsonParseException var9) {
               throw a(var9);
            }

            var10006 = var8.getMessage();
         }

         var10004[var10005] = var10006;
         var10001./* $VF: Unable to resugar constructor */<init>(var10002, var10003);
         throw var10000;
      }
   }

   @Override
   public List ggu(e7r param1, String[] param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 1
      // 0d: if_icmpne 2b
      // 10: goto 17
      // 13: invokestatic j2h.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic j2h.a (Lcom/google/gson/JsonParseException;)Lcom/google/gson/JsonParseException;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 25: invokestatic j2h.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.b();

      try {
         if (var3 == 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (JsonParseException var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1692135158844324685L, -5294876118945036301L, MethodHandles.lookup().lookupClass()).a(93523352420937L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 66246791936995L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "\u0016#C\tn\u0086üÿ\u0005\u0085FÁÈ´\u0019\u0006Q\u0094Ô\u009aN\u0087\u0013ÊHþyÝ\u009dy\u007f*i¶îd°{ðY\t+ßó\u0094Ò\u007f\u0087\u0010'e\u0018À\u0094GAúý@ÐÜ¡\u0081\u008f1";
      int var8 = "\u0016#C\tn\u0086üÿ\u0005\u0085FÁÈ´\u0019\u0006Q\u0094Ô\u009aN\u0087\u0013ÊHþyÝ\u009dy\u007f*i¶îd°{ðY\t+ßó\u0094Ò\u007f\u0087\u0010'e\u0018À\u0094GAúý@ÐÜ¡\u0081\u008f1"
         .length();
      char var5 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     g = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "mãþ¡æõäè\u0012;\u0081\u001bùm4ÐsÁË\u007f\u0084T\u007f»¡£ÀM\u001bÆ\u0014qn¤X,\u0013xUCG¥\u00adþ\u0092ou\u000fELoI¼³½Æ(GìXô¶Éd©\u00105ñr.íÖ÷\u0016ÐÚt\u001f\u0095\u0005xR·Oo1)\\îh ÀH¢FyK";
                  var8 = "mãþ¡æõäè\u0012;\u0081\u001bùm4ÐsÁË\u007f\u0084T\u007f»¡£ÀM\u001bÆ\u0014qn¤X,\u0013xUCG¥\u00adþ\u0092ou\u000fELoI¼³½Æ(GìXô¶Éd©\u00105ñr.íÖ÷\u0016ÐÚt\u001f\u0095\u0005xR·Oo1)\\îh ÀH¢FyK"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static JsonParseException a(JsonParseException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 495;
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
            throw new RuntimeException("j2h", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("j2h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
