import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class rtf extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 117320580930899L;
      return b<"w">(24068, 4563110854943516957L ^ var1);
   }

   @Override
   public int bag() {
      return 0;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 110284292899285L;
      return b<"w">(4117, 3997793801023732617L ^ var2);
   }

   @Override
   public List dnz() {
      return Arrays.asList("?");
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
      // 000: getstatic rtf.a J
      // 003: ldc2_w 121704043309078
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: aload 1
      // 00a: invokevirtual rtf.seb (Le7r;)Ljava/util/List;
      // 00d: astore 6
      // 00f: bipush 7
      // 011: istore 7
      // 013: aload 6
      // 015: invokeinterface java/util/List.size ()I 1
      // 01a: bipush 1
      // 01b: isub
      // 01c: bipush 7
      // 01e: idiv
      // 01f: istore 8
      // 021: invokestatic t9d.b ()I
      // 024: bipush 0
      // 025: istore 9
      // 027: istore 5
      // 029: aload 2
      // 02a: arraylength
      // 02b: iload 5
      // 02d: ifeq 04d
      // 030: ifne 042
      // 033: goto 03a
      // 036: invokestatic rtf.a (Lcco;)Lcco;
      // 039: athrow
      // 03a: bipush 0
      // 03b: goto 04f
      // 03e: invokestatic rtf.a (Lcco;)Lcco;
      // 041: athrow
      // 042: aload 2
      // 043: bipush 0
      // 044: aaload
      // 045: bipush 1
      // 046: iload 8
      // 048: bipush 1
      // 049: iadd
      // 04a: invokestatic rtf.fzm (Ljava/lang/String;II)I
      // 04d: bipush 1
      // 04e: isub
      // 04f: istore 9
      // 051: goto 0a2
      // 054: astore 10
      // 056: aload 0
      // 057: invokevirtual rtf.xxj ()Ljava/util/Map;
      // 05a: astore 11
      // 05c: aload 11
      // 05e: aload 2
      // 05f: bipush 0
      // 060: aaload
      // 061: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 066: checkcast on1
      // 069: astore 12
      // 06b: aload 12
      // 06d: ifnull 088
      // 070: new w57
      // 073: dup
      // 074: aload 12
      // 076: aload 1
      // 077: invokeinterface on1.fm7 (Le7r;)Ljava/lang/String; 2
      // 07c: bipush 0
      // 07d: anewarray 81
      // 080: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 083: athrow
      // 084: invokestatic rtf.a (Lcco;)Lcco;
      // 087: athrow
      // 088: aload 2
      // 089: bipush 0
      // 08a: aaload
      // 08b: bipush -1
      // 08c: invokestatic fe6.e9x (Ljava/lang/String;I)I
      // 08f: bipush -1
      // 090: if_icmpeq 09a
      // 093: aload 10
      // 095: athrow
      // 096: invokestatic rtf.a (Lcco;)Lcco;
      // 099: athrow
      // 09a: new ira
      // 09d: dup
      // 09e: invokespecial ira.<init> ()V
      // 0a1: athrow
      // 0a2: iload 9
      // 0a4: bipush 1
      // 0a5: iadd
      // 0a6: bipush 7
      // 0a8: imul
      // 0a9: aload 6
      // 0ab: invokeinterface java/util/List.size ()I 1
      // 0b0: invokestatic java/lang/Math.min (II)I
      // 0b3: istore 10
      // 0b5: new hsu
      // 0b8: dup
      // 0b9: sipush 15068
      // 0bc: ldc2_w 8561733378344794241
      // 0bf: lload 3
      // 0c0: lxor
      // 0c1: invokedynamic w (IJ)Ljava/lang/String; bsm=rtf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: nop
      // 0c7: bipush 2
      // 0c8: anewarray 81
      // 0cb: dup
      // 0cc: bipush 0
      // 0cd: iload 9
      // 0cf: bipush 1
      // 0d0: iadd
      // 0d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d4: aastore
      // 0d5: dup
      // 0d6: bipush 1
      // 0d7: iload 8
      // 0d9: bipush 1
      // 0da: iadd
      // 0db: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0de: aastore
      // 0df: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0e2: astore 11
      // 0e4: aload 11
      // 0e6: invokevirtual hsu.f4q ()Lpoy;
      // 0e9: getstatic syo.w9t Lsyo;
      // 0ec: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 0ef: pop
      // 0f0: aload 1
      // 0f1: aload 11
      // 0f3: invokeinterface e7r.a0d (Lekw;)V 2
      // 0f8: iload 9
      // 0fa: bipush 7
      // 0fc: imul
      // 0fd: istore 12
      // 0ff: iload 12
      // 101: iload 10
      // 103: if_icmpge 178
      // 106: aload 6
      // 108: iload 12
      // 10a: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10f: checkcast on1
      // 112: astore 13
      // 114: new hsu
      // 117: dup
      // 118: aload 13
      // 11a: aload 1
      // 11b: invokeinterface on1.fm7 (Le7r;)Ljava/lang/String; 2
      // 120: bipush 0
      // 121: anewarray 81
      // 124: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 127: astore 14
      // 129: aload 14
      // 12b: invokevirtual hsu.f4q ()Lpoy;
      // 12e: new tgr
      // 131: dup
      // 132: getstatic tgr$a3_.y5i Ltgr$a3_;
      // 135: new java/lang/StringBuilder
      // 138: dup
      // 139: invokespecial java/lang/StringBuilder.<init> ()V
      // 13c: ldc "/"
      // 13e: nop
      // 13f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 142: aload 13
      // 144: invokeinterface on1.xue ()Ljava/lang/String; 1
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c: ldc " "
      // 14e: nop
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 152: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 155: invokespecial tgr.<init> (Ltgr$a3_;Ljava/lang/String;)V
      // 158: invokevirtual poy.bpc (Ltgr;)Lpoy;
      // 15b: pop
      // 15c: aload 1
      // 15d: aload 14
      // 15f: invokeinterface e7r.a0d (Lekw;)V 2
      // 164: iinc 12 1
      // 167: iload 5
      // 169: ifeq 1c6
      // 16c: iload 5
      // 16e: ifne 0ff
      // 171: goto 178
      // 174: invokestatic rtf.a (Lcco;)Lcco;
      // 177: athrow
      // 178: iload 9
      // 17a: iload 5
      // 17c: ifeq 194
      // 17f: ifne 1c6
      // 182: goto 189
      // 185: invokestatic rtf.a (Lcco;)Lcco;
      // 188: athrow
      // 189: aload 1
      // 18a: instanceof ha9
      // 18d: goto 194
      // 190: invokestatic rtf.a (Lcco;)Lcco;
      // 193: athrow
      // 194: ifeq 1c6
      // 197: new hsu
      // 19a: dup
      // 19b: sipush 2043
      // 19e: ldc2_w 3888944061852419493
      // 1a1: lload 3
      // 1a2: lxor
      // 1a3: invokedynamic w (IJ)Ljava/lang/String; bsm=rtf.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: nop
      // 1a9: bipush 0
      // 1aa: anewarray 81
      // 1ad: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1b0: astore 12
      // 1b2: aload 12
      // 1b4: invokevirtual hsu.f4q ()Lpoy;
      // 1b7: getstatic syo.qjc Lsyo;
      // 1ba: invokevirtual poy.vyb (Lsyo;)Lpoy;
      // 1bd: pop
      // 1be: aload 1
      // 1bf: aload 12
      // 1c1: invokeinterface e7r.a0d (Lekw;)V 2
      // 1c6: return
   }

   public List seb(e7r var1) {
      List var2 = vr1._0v().rns().ic2(var1);
      Collections.sort(var2);
      return var2;
   }

   public Map xxj() {
      return vr1._0v().rns().bef();
   }

   @Override
   public List ggu(e7r var1, String[] var2, mew var3) {
      if (var2.length == 1) {
         Set var4 = this.xxj().keySet();
         return cqo(var2, var4.toArray(new String[var4.size()]));
      } else {
         return null;
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5010031544551287329L, -526366797894186567L, MethodHandles.lookup().lookupClass()).a(57821709980246L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 110319609302539L;
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
      String var6 = "B}\u0092o:Lt\u00153\u0095W\u0085Çx\u0001k¿öj¾[Ï]ÆÐ\u0004\u0084p\u0094×EÐ\bùWÇ¨¥ëa(\u001b.\u0002+ôö\u0088Ï°b½Û«L¯Â\u001eWó¡´Ø\u0018=Ù&Ðezo½\u0000þxÐ&\u000fÃj\u0082";
      int var8 = "B}\u0092o:Lt\u00153\u0095W\u0085Çx\u0001k¿öj¾[Ï]ÆÐ\u0004\u0084p\u0094×EÐ\bùWÇ¨¥ëa(\u001b.\u0002+ôö\u0088Ï°b½Û«L¯Â\u001eWó¡´Ø\u0018=Ù&Ðezo½\u0000þxÐ&\u000fÃj\u0082"
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

                  var6 = "_\u0005ò\u001aøWËáEY«¾\n\u0097Ò·(\u0016ÓM%Ò\u0006\u0088?\u0094Æ+b\u009c Pxõ¯OZ\u0084!\r\u0011%5´\r\u0014¾Ñã·\u0082Ç\u0000ØÛ+¢";
                  var8 = "_\u0005ò\u001aøWËáEY«¾\n\u0097Ò·(\u0016ÓM%Ò\u0006\u0088?\u0094Æ+b\u009c Pxõ¯OZ\u0084!\r\u0011%5´\r\u0014¾Ñã·\u0082Ç\u0000ØÛ+¢"
                     .length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static cco a(cco var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11776;
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
            throw new RuntimeException("rtf", var10);
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
         throw new RuntimeException("rtf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
