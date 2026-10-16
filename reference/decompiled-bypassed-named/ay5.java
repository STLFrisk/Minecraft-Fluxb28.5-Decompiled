import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;

public class ay5 {
   public Map a59 = Maps.newHashMap();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public synchronized void at8(y99 var1, List var2) {
      long var3 = a ^ 95764690623894L;
      this.a59.clear();
      int var10000 = OpaquePredicate.b();
      Iterator var6 = var2.iterator();
      int var5 = var10000;

      label40:
      while (true) {
         if (var6.hasNext()) {
            String var7 = (String)var6.next();
            String var8 = String.format(a<"a">(15480, 1703241610451336643L ^ var3), var7);
            if (var5 == 0) {
               break;
            }

            for (String var10 : var1.ugj()) {
               label32: {
                  try {
                     this.yzo(var1.gc4(new gdz(var10, var8)));
                  } catch (IOException var12) {
                     break label32;
                  }

                  if (var5 == 0) {
                     continue label40;
                  }
               }

               if (var5 == 0) {
                  break;
               }
            }

            if (var5 != 0) {
               continue;
            }
         }

         this.gi7();
         break;
      }
   }

   public boolean qzf() {
      return this.a9y;
   }

   private void gi7() {
      this.a9y = false;
      int var10000 = OpaquePredicate.c();
      int var2 = 0;
      int var1 = var10000;
      int var3 = 0;
      Iterator var4 = this.a59.values().iterator();

      label57:
      while (true) {
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            int var6 = var5.length();
            var10000 = var3;
            int var10001 = var6;

            label52:
            while (true) {
               var3 = var10000 + var10001;
               var10000 = 0;
               if (var1 != 0) {
                  break label57;
               }

               int var7 = 0;

               while (true) {
                  if (var7 >= var6) {
                     break label52;
                  }

                  var10000 = var5.charAt(var7);
                  var10001 = 256;
                  if (var1 != 0) {
                     break;
                  }

                  if (var10000 >= 256) {
                     var2++;
                  }

                  var7++;
                  if (var1 != 0) {
                     break label52;
                  }
               }
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      float var9 = (float)var10000 / (float)var3;

      int var13;
      label35: {
         label34: {
            try {
               var12 = this;
               double var14;
               var13 = (var14 = (double)var9 - 0.1) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
               if (var1 != 0) {
                  break label35;
               }

               if (var13 > 0) {
                  break label34;
               }
            } catch (IllegalFormatException var8) {
               throw a(var8);
            }

            var13 = 0;
            break label35;
         }

         var13 = 1;
      }

      var12.a9y = (boolean)var13;
   }

   private void yzo(List var1) {
      int var2 = OpaquePredicate.c();

      for (yaa var4 : var1) {
         InputStream var5 = var4.f_4();

         try {
            this.l6n(var5);
         } finally {
            IOUtils.closeQuietly(var5);
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   private void l6n(InputStream param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic ay5.a J
      // 03: ldc2_w 50010610022141
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: getstatic org/apache/commons/io/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 11: invokestatic org/apache/commons/io/IOUtils.readLines (Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/util/List;
      // 14: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 22: ifeq ce
      // 25: aload 5
      // 27: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c: checkcast java/lang/String
      // 2f: astore 6
      // 31: aload 6
      // 33: invokevirtual java/lang/String.isEmpty ()Z
      // 36: iload 4
      // 38: ifeq 52
      // 3b: ifne c9
      // 3e: goto 45
      // 41: invokestatic ay5.a (Ljava/util/IllegalFormatException;)Ljava/util/IllegalFormatException;
      // 44: athrow
      // 45: aload 6
      // 47: bipush 0
      // 48: invokevirtual java/lang/String.charAt (I)C
      // 4b: goto 52
      // 4e: invokestatic ay5.a (Ljava/util/IllegalFormatException;)Ljava/util/IllegalFormatException;
      // 51: athrow
      // 52: bipush 35
      // 54: if_icmpeq c9
      // 57: getstatic ay5.p6u Lcom/google/common/base/Splitter;
      // 5a: aload 6
      // 5c: invokevirtual com/google/common/base/Splitter.split (Ljava/lang/CharSequence;)Ljava/lang/Iterable;
      // 5f: ldc java/lang/String
      // 61: nop
      // 62: invokestatic com/google/common/collect/Iterables.toArray (Ljava/lang/Iterable;Ljava/lang/Class;)[Ljava/lang/Object;
      // 65: checkcast [Ljava/lang/String;
      // 68: checkcast [Ljava/lang/String;
      // 6b: astore 7
      // 6d: aload 7
      // 6f: iload 4
      // 71: ifeq 80
      // 74: ifnull c9
      // 77: goto 7e
      // 7a: invokestatic ay5.a (Ljava/util/IllegalFormatException;)Ljava/util/IllegalFormatException;
      // 7d: athrow
      // 7e: aload 7
      // 80: iload 4
      // 82: ifeq 9a
      // 85: arraylength
      // 86: bipush 2
      // 87: if_icmpne c9
      // 8a: goto 91
      // 8d: invokestatic ay5.a (Ljava/util/IllegalFormatException;)Ljava/util/IllegalFormatException;
      // 90: athrow
      // 91: aload 7
      // 93: goto 9a
      // 96: invokestatic ay5.a (Ljava/util/IllegalFormatException;)Ljava/util/IllegalFormatException;
      // 99: athrow
      // 9a: bipush 0
      // 9b: aaload
      // 9c: astore 8
      // 9e: getstatic ay5.t_j Ljava/util/regex/Pattern;
      // a1: aload 7
      // a3: bipush 1
      // a4: aaload
      // a5: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // a8: sipush 5670
      // ab: ldc2_w 6520255823315500276
      // ae: lload 2
      // af: lxor
      // b0: invokedynamic a (IJ)Ljava/lang/String; bsm=ay5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: nop
      // b6: invokevirtual java/util/regex/Matcher.replaceAll (Ljava/lang/String;)Ljava/lang/String;
      // b9: astore 9
      // bb: aload 0
      // bc: getfield ay5.a59 Ljava/util/Map;
      // bf: aload 8
      // c1: aload 9
      // c3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // c8: pop
      // c9: iload 4
      // cb: ifne 1b
      // ce: return
   }

   private String _ic(String var1) {
      String var2 = (String)this.a59.get(var1);

      try {
         if (var2 == null) {
            return var1;
         }
      } catch (IllegalFormatException var3) {
         throw a(var3);
      }

      return var2;
   }

   public String ew8(String var1, Object[] var2) {
      long var3 = a ^ 58210996776811L;
      String var5 = this._ic(var1);

      try {
         return String.format(var5, var2);
      } catch (IllegalFormatException var7) {
         return a<"a">(6276, 5281040954971827139L ^ var3) + var5;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-592013215431665326L, 6159072169418329278L, MethodHandles.lookup().lookupClass()).a(109997820463410L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 80784359096321L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "À\u0091^yÅM\u0007qè>°ô^\u001aObiu_¡\u0093\u009e\u0003\u008d\u0018;m\u0093\u0099q\u0080\u001b×ÅB{¥\u0010Gõc\u0002n\u0091(Èíþ\u0094";
      int var6 = "À\u0091^yÅM\u0007qè>°ô^\u001aObiu_¡\u0093\u009e\u0003\u008d\u0018;m\u0093\u0099q\u0080\u001b×ÅB{¥\u0010Gõc\u0002n\u0091(Èíþ\u0094".length();
      char var3 = 24;
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
                     c = new String[4];
                     p6u = Splitter.on('=').limit(2);
                     t_j = Pattern.compile(a<"a">(22214, 2285956645453761257L ^ var9));
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

                  var4 = "\u0017\u00827H®a'¢\u009f¦(I\u00ad!ÉZ(\u009c\u009e°\u0019·÷\u0004\u0090ò(X?ç\u001a¼\u0016®cÍ¢¶àÕ\u00895s¤\u0090ã\u0003\u0003 È\u0014«°f(\u0013+";
                  var6 = "\u0017\u00827H®a'¢\u009f¦(I\u00ad!ÉZ(\u009c\u009e°\u0019·÷\u0004\u0090ò(X?ç\u001a¼\u0016®cÍ¢¶àÕ\u00895s¤\u0090ã\u0003\u0003 È\u0014«°f(\u0013+"
                     .length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static IllegalFormatException a(IllegalFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31108;
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
            throw new RuntimeException("ay5", var10);
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
         throw new RuntimeException("ay5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
