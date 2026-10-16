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

@dr9$x0j(
   t2u = "hide",
   io4 = {"<module> | clear"},
   hjc = "Hide the specified module from Arraylist"
)
public class ih8 extends dr9 {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   @Override
   public void xjl(String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ih8.a J
      // 003: ldc2_w 12951550916010
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: arraylength
      // 00f: iload 4
      // 011: ifeq 046
      // 014: bipush 1
      // 015: if_icmplt 146
      // 018: goto 01f
      // 01b: invokestatic ih8.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 1
      // 020: bipush 0
      // 021: aaload
      // 022: iload 4
      // 024: ifeq 066
      // 027: goto 02e
      // 02a: invokestatic ih8.a (Loov;)Loov;
      // 02d: athrow
      // 02e: sipush 2213
      // 031: ldc2_w 6593370701630220972
      // 034: lload 2
      // 035: lxor
      // 036: invokedynamic v (IJ)Ljava/lang/String; bsm=ih8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: nop
      // 03c: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 03f: goto 046
      // 042: invokestatic ih8.a (Loov;)Loov;
      // 045: athrow
      // 046: ifeq 072
      // 049: invokestatic jej.tty ()Ljava/util/List;
      // 04c: invokeinterface java/util/List.clear ()V 1
      // 051: sipush 29167
      // 054: ldc2_w 5673235816435831778
      // 057: lload 2
      // 058: lxor
      // 059: invokedynamic v (IJ)Ljava/lang/String; bsm=ih8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: nop
      // 05f: goto 066
      // 062: invokestatic ih8.a (Loov;)Loov;
      // 065: athrow
      // 066: invokestatic ncl.dob (Ljava/lang/String;)V
      // 069: getstatic zwr.qkk Lzwr;
      // 06c: invokevirtual zwr.up0 ()Lszk;
      // 06f: invokevirtual szk.ece ()V
      // 072: getstatic zwr.qkk Lzwr;
      // 075: invokevirtual zwr.zj2 ()Lkgt;
      // 078: aload 1
      // 079: bipush 0
      // 07a: aaload
      // 07b: invokevirtual kgt.wv4 (Ljava/lang/String;)Lar7;
      // 07e: astore 5
      // 080: aload 5
      // 082: ifnull 110
      // 085: invokestatic jej.tty ()Ljava/util/List;
      // 088: aload 5
      // 08a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 08d: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 092: iload 4
      // 094: ifeq 0f0
      // 097: goto 09e
      // 09a: invokestatic ih8.a (Loov;)Loov;
      // 09d: athrow
      // 09e: ifeq 0dc
      // 0a1: goto 0a8
      // 0a4: invokestatic ih8.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: invokestatic jej.tty ()Ljava/util/List;
      // 0ab: aload 5
      // 0ad: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0b0: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 0b5: pop
      // 0b6: sipush 28349
      // 0b9: ldc2_w 7847606576076147889
      // 0bc: lload 2
      // 0bd: lxor
      // 0be: invokedynamic v (IJ)Ljava/lang/String; bsm=ih8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: nop
      // 0c4: invokestatic ncl.dob (Ljava/lang/String;)V
      // 0c7: getstatic zwr.qkk Lzwr;
      // 0ca: invokevirtual zwr.up0 ()Lszk;
      // 0cd: invokevirtual szk.ece ()V
      // 0d0: iload 4
      // 0d2: ifne 141
      // 0d5: goto 0dc
      // 0d8: invokestatic ih8.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: invokestatic jej.tty ()Ljava/util/List;
      // 0df: aload 5
      // 0e1: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0e4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e9: goto 0f0
      // 0ec: invokestatic ih8.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: pop
      // 0f1: sipush 32295
      // 0f4: ldc2_w 2960224470254345256
      // 0f7: lload 2
      // 0f8: lxor
      // 0f9: invokedynamic v (IJ)Ljava/lang/String; bsm=ih8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: nop
      // 0ff: invokestatic ncl.dob (Ljava/lang/String;)V
      // 102: getstatic zwr.qkk Lzwr;
      // 105: invokevirtual zwr.up0 ()Lszk;
      // 108: invokevirtual szk.ece ()V
      // 10b: iload 4
      // 10d: ifne 141
      // 110: new java/lang/StringBuilder
      // 113: dup
      // 114: invokespecial java/lang/StringBuilder.<init> ()V
      // 117: sipush 8730
      // 11a: ldc2_w 8211269051325251604
      // 11d: lload 2
      // 11e: lxor
      // 11f: invokedynamic v (IJ)Ljava/lang/String; bsm=ih8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: nop
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 128: aload 1
      // 129: bipush 0
      // 12a: aaload
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: ldc ")"
      // 130: nop
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 137: invokestatic ncl.dob (Ljava/lang/String;)V
      // 13a: goto 141
      // 13d: invokestatic ih8.a (Loov;)Loov;
      // 140: athrow
      // 141: iload 4
      // 143: ifne 151
      // 146: aload 0
      // 147: invokevirtual ih8.dhs ()V
      // 14a: goto 151
      // 14d: invokestatic ih8.a (Loov;)Loov;
      // 150: athrow
      // 151: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7457514878970543677L, -7774220717284053138L, MethodHandles.lookup().lookupClass()).a(214125517776194L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 91153680180191L;
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
      String var6 = "àö dCÂP\u0007ÆÁÎ)kQå<µ\u008fÑÇ:¬\u001cb\"^\u0088ÌMÌ\u0091ö2nµ\u0087Cq7ù(á½-¯9\u0015iuÁð\u0014Ä\u0000A_Ó>\u0087Ï4ØeÿI5\u0003òwàÙZo¬çöh\u009aôtR(Ø7\u0013.[\u0097m$\u001dÀ9\u0083Q±5·´¼ÓmÊéÛ¦ç²Ïb\u001aM\u0016#\\Ï\u0001\u0093Õ¢ÿÌ";
      int var8 = "àö dCÂP\u0007ÆÁÎ)kQå<µ\u008fÑÇ:¬\u001cb\"^\u0088ÌMÌ\u0091ö2nµ\u0087Cq7ù(á½-¯9\u0015iuÁð\u0014Ä\u0000A_Ó>\u0087Ï4ØeÿI5\u0003òwàÙZo¬çöh\u009aôtR(Ø7\u0013.[\u0097m$\u001dÀ9\u0083Q±5·´¼ÓmÊéÛ¦ç²Ïb\u001aM\u0016#\\Ï\u0001\u0093Õ¢ÿÌ"
         .length();
      char var5 = '(';
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
                     d = var9;
                     e = new String[5];
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

                  var6 = "\\¾Pç\u0001ìØ\u0004+6ïm·`±ï\u0007\u0000R_x¾\u008d2¦p\u0016Ki9/`ZÙê\u0004\u0086\"Óº\u0010\u0091\u0002ðï\u00192\u001dÐ\u008dUV\u0096Ü(îj";
                  var8 = "\\¾Pç\u0001ìØ\u0004+6ïm·`±ï\u0007\u0000R_x¾\u008d2¦p\u0016Ki9/`ZÙê\u0004\u0086\"Óº\u0010\u0091\u0002ðï\u00192\u001dÐ\u008dUV\u0096Ü(îj"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5391;
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
            throw new RuntimeException("ih8", var10);
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
         throw new RuntimeException("ih8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
