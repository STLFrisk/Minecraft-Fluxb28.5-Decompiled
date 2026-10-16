import com.google.common.collect.Sets;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class j09 implements lv1 {
   public static final ay5 mg4;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public j09(if1 var1, String var2) {
      this.o_0 = var1;
      this.xro = var2;
      fc1.zb2(mg4);
   }

   public void ljm(List var1) {
      long var2 = a ^ 121735698525174L;
      this.a4f.clear();
      int var10000 = OpaquePredicate.b();
      Iterator var5 = var1.iterator();
      int var4 = var10000;

      label77:
      while (true) {
         boolean var15 = var5.hasNext();

         label75:
         while (var15) {
            g68 var6 = (g68)var5.next();

            try {
               label82: {
                  ero var7 = (ero)var6.ui7(this.o_0, a<"y">(16028, 6237685317366187003L ^ var2));

                  label69: {
                     try {
                        var16 = var7;
                        if (var4 == 0) {
                           break label69;
                        }

                        if (var7 == null) {
                           break label82;
                        }
                     } catch (RuntimeException var12) {
                        throw a(var12);
                     }

                     var16 = var7;
                  }

                  for (jlc var9 : var16.scu()) {
                     label58: {
                        String var10001;
                        label57: {
                           try {
                              var17 = this.a4f;
                              var10001 = var9.emt();
                              if (var4 == 0) {
                                 break label57;
                              }

                              var15 = var17.containsKey(var10001);
                              if (var4 == 0) {
                                 continue label75;
                              }
                           } catch (RuntimeException var11) {
                              throw a(var11);
                           }

                           try {
                              if (var15) {
                                 break label58;
                              }

                              var17 = this.a4f;
                              var10001 = var9.emt();
                           } catch (RuntimeException var10) {
                              throw a(var10);
                           }
                        }

                        var17.put(var10001, var9);
                     }

                     if (var4 == 0) {
                        break;
                     }
                  }
               }
            } catch (RuntimeException var13) {
               rr7.warn(a<"y">(27529, 1868622122320058091L ^ var2) + var6.qw5(), var13);
            } catch (IOException var14) {
               rr7.warn(a<"y">(29719, 2506531554107836786L ^ var2) + var6.qw5(), var14);
            }

            if (var4 == 0) {
               return;
            }
            continue label77;
         }

         return;
      }
   }

   @Override
   public void onResourceManagerReload(y99 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic j09.a J
      // 03: ldc2_w 34632604918860
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: bipush 1
      // 0e: anewarray 1
      // 11: dup
      // 12: bipush 0
      // 13: sipush 12017
      // 16: ldc2_w 3344264674201115693
      // 19: lload 2
      // 1a: lxor
      // 1b: invokedynamic y (IJ)Ljava/lang/String; bsm=j09.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: aastore
      // 22: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 25: astore 5
      // 27: iload 4
      // 29: ifne 70
      // 2c: sipush 1722
      // 2f: ldc2_w 8505843218478937188
      // 32: lload 2
      // 33: lxor
      // 34: invokedynamic y (IJ)Ljava/lang/String; bsm=j09.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: nop
      // 3a: aload 0
      // 3b: getfield j09.xro Ljava/lang/String;
      // 3e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 41: ifne 5e
      // 44: goto 4b
      // 47: invokestatic j09.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a: athrow
      // 4b: aload 5
      // 4d: aload 0
      // 4e: getfield j09.xro Ljava/lang/String;
      // 51: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 56: pop
      // 57: goto 5e
      // 5a: invokestatic j09.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5d: athrow
      // 5e: getstatic j09.mg4 Lay5;
      // 61: aload 1
      // 62: aload 5
      // 64: invokevirtual ay5.at8 (Ly99;Ljava/util/List;)V
      // 67: getstatic j09.mg4 Lay5;
      // 6a: getfield ay5.a59 Ljava/util/Map;
      // 6d: invokestatic lpw.xti (Ljava/util/Map;)V
      // 70: return
   }

   public boolean s86() {
      return mg4.qzf();
   }

   public boolean j77() {
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
      // 05: invokevirtual j09.o0m ()Ljlc;
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifnull 36
      // 0f: goto 16
      // 12: invokestatic j09.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual j09.o0m ()Ljlc;
      // 1a: goto 21
      // 1d: invokestatic j09.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: invokevirtual jlc.qga ()Z
      // 24: iload 1
      // 25: ifeq 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic j09.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public void no3(jlc var1) {
      this.xro = var1.emt();
   }

   public jlc o0m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic j09.a J
      // 03: ldc2_w 78516439818304
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield j09.a4f Ljava/util/Map;
      // 10: aload 0
      // 11: getfield j09.xro Ljava/lang/String;
      // 14: iload 3
      // 15: ifne 50
      // 18: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 1d: ifeq 3e
      // 20: goto 27
      // 23: invokestatic j09.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: aload 0
      // 28: getfield j09.a4f Ljava/util/Map;
      // 2b: aload 0
      // 2c: getfield j09.xro Ljava/lang/String;
      // 2f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 34: checkcast jlc
      // 37: goto 58
      // 3a: invokestatic j09.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield j09.a4f Ljava/util/Map;
      // 42: sipush 1722
      // 45: ldc2_w 8505763961290240104
      // 48: lload 1
      // 49: lxor
      // 4a: invokedynamic y (IJ)Ljava/lang/String; bsm=j09.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 55: checkcast jlc
      // 58: areturn
   }

   public SortedSet no8() {
      return Sets.newTreeSet(this.a4f.values());
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5572930199792502504L, 1746584926397103603L, MethodHandles.lookup().lookupClass()).a(75864265574844L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 66716455935383L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "!ÀÞ¤ãÐ\u0015\u008a\u008d\u0017\u0004c\u0098\u0016Ö\"\u00180n\u0004J\u0001E³K@Ô\rë\u0096ª\r9\u0001iQ{ÐÆ\u0091~\u0010\u0017I>L¥ì\u0011\u000b\u0095^»=\u0090'f\u007f";
      int var8 = "!ÀÞ¤ãÐ\u0015\u008a\u008d\u0017\u0004c\u0098\u0016Ö\"\u00180n\u0004J\u0001E³K@Ô\rë\u0096ª\r9\u0001iQ{ÐÆ\u0091~\u0010\u0017I>L¥ì\u0011\u000b\u0095^»=\u0090'f\u007f"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[5];
                     rr7 = LogManager.getLogger();
                     mg4 = new ay5();
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

                  var6 = "1\u001e_ ûõUÿ\\Â\u008dÅÛ\u009bUà+`Í®jÒÐÚ×\u008b\r\u00adõú\u008dI¼Ñ\u001d8\u0093\u001dÖ\u0099I\u008dÞÉS\u009d\u0087d¸\u0094\u000eð÷\u000f\u0000\u0006ZÍj/ë\u0005U\u0013õDÁÂÈü=²¡scòËXÌ4è\u008b=\u0017¸\u00026\u008eX·Üã\u000e£@pæ\u007f\u0082'$Jgµn@ÿ<\\/#\u009a¸¬ã·Õ\u008aà\u0012h\u0003\u0016Ë\u0099³´(þ\u0004\t\u009bä`à}¨\u008fPÔkT'\rà_WyµPk\bìw\u000f%4qÁ\u000bâ\u00adª#\u001eH\u0088î\u0091¢\u0096Y/÷JÖ{";
                  var8 = "1\u001e_ ûõUÿ\\Â\u008dÅÛ\u009bUà+`Í®jÒÐÚ×\u008b\r\u00adõú\u008dI¼Ñ\u001d8\u0093\u001dÖ\u0099I\u008dÞÉS\u009d\u0087d¸\u0094\u000eð÷\u000f\u0000\u0006ZÍj/ë\u0005U\u0013õDÁÂÈü=²¡scòËXÌ4è\u008b=\u0017¸\u00026\u008eX·Üã\u000e£@pæ\u007f\u0082'$Jgµn@ÿ<\\/#\u009a¸¬ã·Õ\u008aà\u0012h\u0003\u0016Ë\u0099³´(þ\u0004\t\u009bä`à}¨\u008fPÔkT'\rà_WyµPk\bìw\u000f%4qÁ\u000bâ\u00adª#\u001eH\u0088î\u0091¢\u0096Y/÷JÖ{"
                     .length();
                  var5 = 'X';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11827;
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
            throw new RuntimeException("j09", var10);
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
         throw new RuntimeException("j09" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
