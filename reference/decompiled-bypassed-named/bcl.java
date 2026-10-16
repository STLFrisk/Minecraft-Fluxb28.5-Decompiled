import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bcl extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public List dnz() {
      long var1 = a ^ 43943202738834L;
      return Arrays.asList("w", b<"l">(16709, 8450690418304610399L ^ var1));
   }

   @Override
   public String xue() {
      long var1 = a ^ 68927290105752L;
      return b<"l">(2373, 4132850333735957846L ^ var1);
   }

   @Override
   public int bag() {
      return 0;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 53112122573598L;
      return b<"l">(22884, 8268516082044287477L ^ var2);
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
      // 000: getstatic bcl.a J
      // 003: ldc2_w 64544222063325
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: bipush 2
      // 010: if_icmpge 031
      // 013: new w57
      // 016: dup
      // 017: sipush 9725
      // 01a: ldc2_w 6601173362749172908
      // 01d: lload 3
      // 01e: lxor
      // 01f: invokedynamic l (IJ)Ljava/lang/String; bsm=bcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: bipush 0
      // 026: anewarray 42
      // 029: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02c: athrow
      // 02d: invokestatic bcl.a (Loov;)Loov;
      // 030: athrow
      // 031: aload 1
      // 032: aload 2
      // 033: bipush 0
      // 034: aaload
      // 035: invokestatic bcl.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 038: astore 6
      // 03a: aload 6
      // 03c: iload 5
      // 03e: ifne 06b
      // 041: aload 1
      // 042: if_acmpne 06a
      // 045: goto 04c
      // 048: invokestatic bcl.a (Loov;)Loov;
      // 04b: athrow
      // 04c: new iez
      // 04f: dup
      // 050: sipush 11930
      // 053: ldc2_w 665373706492864462
      // 056: lload 3
      // 057: lxor
      // 058: invokedynamic l (IJ)Ljava/lang/String; bsm=bcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: nop
      // 05e: bipush 0
      // 05f: anewarray 42
      // 062: invokespecial iez.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 065: athrow
      // 066: invokestatic bcl.a (Loov;)Loov;
      // 069: athrow
      // 06a: aload 1
      // 06b: aload 2
      // 06c: bipush 1
      // 06d: aload 1
      // 06e: instanceof ha9
      // 071: iload 5
      // 073: ifne 081
      // 076: ifne 084
      // 079: goto 080
      // 07c: invokestatic bcl.a (Loov;)Loov;
      // 07f: athrow
      // 080: bipush 1
      // 081: goto 085
      // 084: bipush 0
      // 085: invokestatic bcl.h1l (Le7r;[Ljava/lang/String;IZ)Lekw;
      // 088: astore 7
      // 08a: new hsu
      // 08d: dup
      // 08e: sipush 29202
      // 091: ldc2_w 1990045269774580545
      // 094: lload 3
      // 095: lxor
      // 096: invokedynamic l (IJ)Ljava/lang/String; bsm=bcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: nop
      // 09c: bipush 2
      // 09d: anewarray 42
      // 0a0: dup
      // 0a1: bipush 0
      // 0a2: aload 1
      // 0a3: invokeinterface e7r.xyw ()Lekw; 1
      // 0a8: aastore
      // 0a9: dup
      // 0aa: bipush 1
      // 0ab: aload 7
      // 0ad: invokeinterface ekw.qy8 ()Lekw; 1
      // 0b2: aastore
      // 0b3: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0b6: astore 8
      // 0b8: new hsu
      // 0bb: dup
      // 0bc: sipush 6063
      // 0bf: ldc2_w 2327417703615291135
      // 0c2: lload 3
      // 0c3: lxor
      // 0c4: invokedynamic l (IJ)Ljava/lang/String; bsm=bcl.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: nop
      // 0ca: bipush 2
      // 0cb: anewarray 42
      // 0ce: dup
      // 0cf: bipush 0
      // 0d0: aload 6
      // 0d2: invokevirtual ha9.xyw ()Lekw;
      // 0d5: aastore
      // 0d6: dup
      // 0d7: bipush 1
      // 0d8: aload 7
      // 0da: invokeinterface ekw.qy8 ()Lekw; 1
      // 0df: aastore
      // 0e0: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0e3: astore 9
      // 0e5: aload 8
      // 0e7: invokevirtual hsu.f4q ()Lpoy;
      // 0ea: getstatic syo.qiz Lsyo;
      // 0ed: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 0f0: bipush 1
      // 0f1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f4: invokevirtual poy.e53 (Ljava/lang/Boolean;)Lpoy;
      // 0f7: pop
      // 0f8: aload 9
      // 0fa: invokevirtual hsu.f4q ()Lpoy;
      // 0fd: getstatic syo.qiz Lsyo;
      // 100: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 103: bipush 1
      // 104: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 107: invokevirtual poy.e53 (Ljava/lang/Boolean;)Lpoy;
      // 10a: pop
      // 10b: aload 6
      // 10d: aload 8
      // 10f: invokevirtual ha9.a0d (Lekw;)V
      // 112: aload 1
      // 113: aload 9
      // 115: invokeinterface e7r.a0d (Lekw;)V 2
      // 11a: return
   }

   @Override
   public List ggu(e7r var1, String[] var2, mew var3) {
      return cqo(var2, vr1._0v().p14());
   }

   @Override
   public boolean mp9(String[] var1, int var2) {
      int var3 = OpaquePredicate.c();

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

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3039533279141468405L, -8807434148200897146L, MethodHandles.lookup().lookupClass()).a(125055130871411L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 2031279009044L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "Ð\u00ad:\u009b\u0084\u000fjg\u008b\u0092\u001a\u0017ê\u001c\u0098\u0087¢®A}¤\u0011µ\u0016Ë\u0014ôÅ\u009c\r\u008fÂ\u0084\u0081\b³ô+®\u0093J\u0080ó\u0096.Ü(*5<vø*§ô\u0091ãÔ\u008e\u0091¨//\u0017(â\u0001\u0083Òè\u007f4¡»ù\u0098ç¶zwX\u0088\u0015\u0087¹\u0010Êª$\n\u0004\u008eÑ4Pã\u001ag÷\u001b\u001c,ÅÕÝ(WÉ4ÝÍ\u00893\u000føV`\u0016\u0011Ç[þ\u0080-\u008b,8·ï¹\u0014/ém\u001e!ñ¥æ\u009d\u0095á~Ï¨6@ªí\u0091Ê%¹¶32Þ\u008f9¸\u0001¨Ào=+È\u0012\u000e\u008ag\u00adV[±\u009f4W±\u0001P³\u008a\u0017\u000e\u000b\u00adÊyÖ\u009e,µ\u009e]\u0094\u0007 \u0083rJ\u0095£TÁ\u009d×Ñ\u0095ö\u00920\u0090TÉøúì¶\u009c³¥ÚC\u001e\u0011DwË\u001fß¸v G\u009cºæB¿¤ÉJMõ©\u0090hå!'P\u0081Ä*yÿ\u0015£\u0086";
      int var8 = "Ð\u00ad:\u009b\u0084\u000fjg\u008b\u0092\u001a\u0017ê\u001c\u0098\u0087¢®A}¤\u0011µ\u0016Ë\u0014ôÅ\u009c\r\u008fÂ\u0084\u0081\b³ô+®\u0093J\u0080ó\u0096.Ü(*5<vø*§ô\u0091ãÔ\u008e\u0091¨//\u0017(â\u0001\u0083Òè\u007f4¡»ù\u0098ç¶zwX\u0088\u0015\u0087¹\u0010Êª$\n\u0004\u008eÑ4Pã\u001ag÷\u001b\u001c,ÅÕÝ(WÉ4ÝÍ\u00893\u000føV`\u0016\u0011Ç[þ\u0080-\u008b,8·ï¹\u0014/ém\u001e!ñ¥æ\u009d\u0095á~Ï¨6@ªí\u0091Ê%¹¶32Þ\u008f9¸\u0001¨Ào=+È\u0012\u000e\u008ag\u00adV[±\u009f4W±\u0001P³\u008a\u0017\u000e\u000b\u00adÊyÖ\u009e,µ\u009e]\u0094\u0007 \u0083rJ\u0095£TÁ\u009d×Ñ\u0095ö\u00920\u0090TÉøúì¶\u009c³¥ÚC\u001e\u0011DwË\u001fß¸v G\u009cºæB¿¤ÉJMõ©\u0090hå!'P\u0081Ä*yÿ\u0015£\u0086"
         .length();
      char var5 = '@';
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
                     g = new String[7];
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

                  var6 = "9\r±\u008a\u0087ø¤+ÚsÛÖ£3¸¦\u0010\u009efæãZñ$\u0089ÓKóáá½Ø\"";
                  var8 = "9\r±\u008a\u0087ø¤+ÚsÛÖ£3¸¦\u0010\u009efæãZñ$\u0089ÓKóáá½Ø\"".length();
                  var5 = 16;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25870;
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
            throw new RuntimeException("bcl", var10);
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
         throw new RuntimeException("bcl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
