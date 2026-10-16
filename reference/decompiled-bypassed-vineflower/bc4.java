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

public class bc4 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 97632979458681L;
      return b<"d">(27087, 3025373333345635846L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 94788596025087L;
      return b<"d">(16007, 3893296825574131146L ^ var2);
   }

   @Override
   public void l3z(e7r param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bc4.a J
      // 003: ldc2_w 102015384874812
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 1
      // 010: if_icmpge 031
      // 013: new w57
      // 016: dup
      // 017: sipush 6538
      // 01a: ldc2_w 7691744349268577029
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic d (IJ)Ljava/lang/String; bsm=bc4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 32
      // 029: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02c: athrow
      // 02d: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: aload 2
      // 033: bipush 0
      // 034: aaload
      // 035: invokestatic bc4.kot (Le7r;Ljava/lang/String;)Li2h;
      // 038: astore 6
      // 03a: aconst_null
      // 03b: astore 7
      // 03d: aload 2
      // 03e: iload 5
      // 040: ifne 050
      // 043: arraylength
      // 044: bipush 2
      // 045: if_icmplt 080
      // 048: goto 04f
      // 04b: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: aload 2
      // 050: bipush 1
      // 051: invokestatic bc4.cai ([Ljava/lang/String;I)Ljava/lang/String;
      // 054: invokestatic sza.mft (Ljava/lang/String;)Lbdo;
      // 057: astore 7
      // 059: goto 080
      // 05c: astore 8
      // 05e: new uvb
      // 061: dup
      // 062: sipush 19161
      // 065: ldc2_w 2409890033973418067
      // 068: lload 3
      // 069: lxor
      // 06a: invokedynamic d (IJ)Ljava/lang/String; bsm=bc4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: nop
      // 070: bipush 1
      // 071: anewarray 32
      // 074: dup
      // 075: bipush 0
      // 076: aload 8
      // 078: invokevirtual npr.getMessage ()Ljava/lang/String;
      // 07b: aastore
      // 07c: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 07f: athrow
      // 080: aload 7
      // 082: iload 5
      // 084: ifne 09f
      // 087: ifnull 0e5
      // 08a: goto 091
      // 08d: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: new bdo
      // 094: dup
      // 095: invokespecial bdo.<init> ()V
      // 098: goto 09f
      // 09b: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09e: athrow
      // 09f: astore 8
      // 0a1: aload 6
      // 0a3: aload 8
      // 0a5: invokevirtual i2h.c97 (Lbdo;)V
      // 0a8: iload 5
      // 0aa: ifne 104
      // 0ad: aload 7
      // 0af: aload 8
      // 0b1: bipush 1
      // 0b2: invokestatic j44.z3c (Lgdw;Lgdw;Z)Z
      // 0b5: ifne 0e5
      // 0b8: goto 0bf
      // 0bb: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: new uvb
      // 0c2: dup
      // 0c3: sipush 29537
      // 0c6: ldc2_w 5914085090625839596
      // 0c9: lload 3
      // 0ca: lxor
      // 0cb: invokedynamic d (IJ)Ljava/lang/String; bsm=bc4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: bipush 1
      // 0d2: anewarray 32
      // 0d5: dup
      // 0d6: bipush 0
      // 0d7: aload 6
      // 0d9: invokevirtual i2h.noc ()Ljava/lang/String;
      // 0dc: aastore
      // 0dd: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0e0: athrow
      // 0e1: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 1
      // 0e6: aload 0
      // 0e7: sipush 19807
      // 0ea: ldc2_w 6767461241404579796
      // 0ed: lload 3
      // 0ee: lxor
      // 0ef: invokedynamic d (IJ)Ljava/lang/String; bsm=bc4.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: nop
      // 0f5: bipush 1
      // 0f6: anewarray 32
      // 0f9: dup
      // 0fa: bipush 0
      // 0fb: aload 6
      // 0fd: invokevirtual i2h.noc ()Ljava/lang/String;
      // 100: aastore
      // 101: invokestatic bc4.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 104: return
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = t9d.c();

      try {
         if (var3 != 0) {
            return (boolean)var2;
         }

         if (var2 == 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
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
      // 13: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic bc4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: invokestatic vr1._0v ()Lvr1;
      // 22: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 25: invokestatic bc4.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2045557322874872728L, 895165804189896512L, MethodHandles.lookup().lookupClass()).a(174765611917761L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 130163184854731L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "\u009c\"ß\r9,Õ½¿æQ#$\u007fæN^\u0001éD¡r\u0096WPj(´\u0083Ç\u0086÷\u0088Vl÷!L×\u0089(O`\u0088\u001d\u0004öOÕNÙæÌ³v¡Ï4æB:ÎLB:\u0094\u000fÚUÒ®ï\u009c\"³1{D%á\u0012\u0010ã¦^\u008b\u009b[SW\u0096nßF6ô.ü8\u009cÝ*VF¢áõ\u0017½ÅàBä\u008a\u0017¾À¸Ã>Ï\u0002-Gð\u0016!â\u0006\u001a0¤|FäR¿I\u001bF¨=j²Ö\u009f·?Ê\u0018?º\u00100Õ";
      int var8 = "\u009c\"ß\r9,Õ½¿æQ#$\u007fæN^\u0001éD¡r\u0096WPj(´\u0083Ç\u0086÷\u0088Vl÷!L×\u0089(O`\u0088\u001d\u0004öOÕNÙæÌ³v¡Ï4æB:ÎLB:\u0094\u000fÚUÒ®ï\u009c\"³1{D%á\u0012\u0010ã¦^\u008b\u009b[SW\u0096nßF6ô.ü8\u009cÝ*VF¢áõ\u0017½ÅàBä\u008a\u0017¾À¸Ã>Ï\u0002-Gð\u0016!â\u0006\u001a0¤|FäR¿I\u001bF¨=j²Ö\u009f·?Ê\u0018?º\u00100Õ"
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
                     c = var9;
                     g = new String[6];
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

                  var6 = "«éÙµ`!Åûá\r\u0003\":s\u0019\u008aÐc\u001c6Ïz\u009cÒ\u008a\u009bãàK÷P]j>&ýú\u009btRgê\u0090þØ|:íDa\u0095§ t\u0082\u001f8\r\u001cfÎ\u0086ÿ\u0014`¾zûÇRf4çY§\u007f=tòÞV÷»\u0015\u0083}\u0012Ã¥\u0094y\u0094s¢ÿÎ\u0006û\u0006\u001bA=}Nù\u0001\féÞ\u0085Íº\u001f";
                  var8 = "«éÙµ`!Åûá\r\u0003\":s\u0019\u008aÐc\u001c6Ïz\u009cÒ\u008a\u009bãàK÷P]j>&ýú\u009btRgê\u0090þØ|:íDa\u0095§ t\u0082\u001f8\r\u001cfÎ\u0086ÿ\u0014`¾zûÇRf4çY§\u007f=tòÞV÷»\u0015\u0083}\u0012Ã¥\u0094y\u0094s¢ÿÎ\u0006û\u0006\u001bA=}Nù\u0001\féÞ\u0085Íº\u001f"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16080;
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
            throw new RuntimeException("bc4", var10);
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
         throw new RuntimeException("bc4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
