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

public class s90 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 138678106683379L;
      return b<"e">(17133, 7551479815760467360L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 124102020836213L;
      return b<"e">(15404, 3571634663434844132L ^ var2);
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
      // 000: getstatic s90.a J
      // 003: ldc2_w 134291791053494
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: iload 5
      // 010: ifne 03d
      // 013: arraylength
      // 014: ifgt 03c
      // 017: goto 01e
      // 01a: invokestatic s90.a (Loov;)Loov;
      // 01d: athrow
      // 01e: new w57
      // 021: dup
      // 022: sipush 1578
      // 025: ldc2_w 7419735676709790756
      // 028: lload 3
      // 029: lxor
      // 02a: invokedynamic e (IJ)Ljava/lang/String; bsm=s90.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: nop
      // 030: bipush 0
      // 031: anewarray 35
      // 034: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 037: athrow
      // 038: invokestatic s90.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 2
      // 03d: bipush 0
      // 03e: aaload
      // 03f: astore 6
      // 041: aload 6
      // 043: ldc "l"
      // 045: nop
      // 046: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 049: iload 5
      // 04b: ifne 077
      // 04e: ifne 076
      // 051: goto 058
      // 054: invokestatic s90.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 6
      // 05a: ldc "L"
      // 05c: nop
      // 05d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 060: iload 5
      // 062: ifne 077
      // 065: goto 06c
      // 068: invokestatic s90.a (Loov;)Loov;
      // 06b: athrow
      // 06c: ifeq 07a
      // 06f: goto 076
      // 072: invokestatic s90.a (Loov;)Loov;
      // 075: athrow
      // 076: bipush 1
      // 077: goto 07b
      // 07a: bipush 0
      // 07b: istore 7
      // 07d: iload 7
      // 07f: iload 5
      // 081: ifne 0be
      // 084: ifeq 0b9
      // 087: goto 08e
      // 08a: invokestatic s90.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 6
      // 090: invokevirtual java/lang/String.length ()I
      // 093: iload 5
      // 095: ifne 0be
      // 098: goto 09f
      // 09b: invokestatic s90.a (Loov;)Loov;
      // 09e: athrow
      // 09f: bipush 1
      // 0a0: if_icmple 0b9
      // 0a3: goto 0aa
      // 0a6: invokestatic s90.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 6
      // 0ac: bipush 0
      // 0ad: aload 6
      // 0af: invokevirtual java/lang/String.length ()I
      // 0b2: bipush 1
      // 0b3: isub
      // 0b4: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0b7: astore 6
      // 0b9: aload 6
      // 0bb: invokestatic s90.ll_ (Ljava/lang/String;)I
      // 0be: istore 8
      // 0c0: iload 8
      // 0c2: iload 5
      // 0c4: ifne 0d2
      // 0c7: ifge 0d5
      // 0ca: goto 0d1
      // 0cd: invokestatic s90.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: bipush 1
      // 0d2: goto 0d6
      // 0d5: bipush 0
      // 0d6: istore 9
      // 0d8: iload 9
      // 0da: iload 5
      // 0dc: ifne 0f1
      // 0df: ifeq 0ef
      // 0e2: goto 0e9
      // 0e5: invokestatic s90.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iload 8
      // 0eb: bipush -1
      // 0ec: imul
      // 0ed: istore 8
      // 0ef: aload 2
      // 0f0: arraylength
      // 0f1: bipush 1
      // 0f2: if_icmple 103
      // 0f5: aload 1
      // 0f6: aload 2
      // 0f7: bipush 1
      // 0f8: aaload
      // 0f9: invokestatic s90.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 0fc: goto 107
      // 0ff: invokestatic s90.a (Loov;)Loov;
      // 102: athrow
      // 103: aload 1
      // 104: invokestatic s90.cfc (Le7r;)Lz96;
      // 107: astore 10
      // 109: iload 7
      // 10b: iload 5
      // 10d: ifne 1d8
      // 110: ifeq 1b5
      // 113: goto 11a
      // 116: invokestatic s90.a (Loov;)Loov;
      // 119: athrow
      // 11a: aload 1
      // 11b: getstatic n_k$pbp.t39 Ln_k$pbp;
      // 11e: aload 10
      // 120: getfield ha9.op5 I
      // 123: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 128: iload 5
      // 12a: ifne 1b0
      // 12d: goto 134
      // 130: invokestatic s90.a (Loov;)Loov;
      // 133: athrow
      // 134: iload 9
      // 136: ifeq 17b
      // 139: goto 140
      // 13c: invokestatic s90.a (Loov;)Loov;
      // 13f: athrow
      // 140: aload 10
      // 142: iload 8
      // 144: ineg
      // 145: invokevirtual ha9.odj (I)V
      // 148: aload 1
      // 149: aload 0
      // 14a: sipush 31305
      // 14d: ldc2_w 2091866105642326085
      // 150: lload 3
      // 151: lxor
      // 152: invokedynamic e (IJ)Ljava/lang/String; bsm=s90.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: nop
      // 158: bipush 2
      // 159: anewarray 35
      // 15c: dup
      // 15d: bipush 0
      // 15e: iload 8
      // 160: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 163: aastore
      // 164: dup
      // 165: bipush 1
      // 166: aload 10
      // 168: invokevirtual ha9.noc ()Ljava/lang/String;
      // 16b: aastore
      // 16c: invokestatic s90.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 16f: iload 5
      // 171: ifeq 227
      // 174: goto 17b
      // 177: invokestatic s90.a (Loov;)Loov;
      // 17a: athrow
      // 17b: aload 10
      // 17d: iload 8
      // 17f: invokevirtual ha9.odj (I)V
      // 182: aload 1
      // 183: aload 0
      // 184: sipush 10353
      // 187: ldc2_w 7877848408902257275
      // 18a: lload 3
      // 18b: lxor
      // 18c: invokedynamic e (IJ)Ljava/lang/String; bsm=s90.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: nop
      // 192: bipush 2
      // 193: anewarray 35
      // 196: dup
      // 197: bipush 0
      // 198: iload 8
      // 19a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19d: aastore
      // 19e: dup
      // 19f: bipush 1
      // 1a0: aload 10
      // 1a2: invokevirtual ha9.noc ()Ljava/lang/String;
      // 1a5: aastore
      // 1a6: invokestatic s90.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1a9: goto 1b0
      // 1ac: invokestatic s90.a (Loov;)Loov;
      // 1af: athrow
      // 1b0: iload 5
      // 1b2: ifeq 227
      // 1b5: aload 1
      // 1b6: getstatic n_k$pbp.t39 Ln_k$pbp;
      // 1b9: aload 10
      // 1bb: getfield ha9.nk0 I
      // 1be: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 1c3: iload 5
      // 1c5: ifne 200
      // 1c8: goto 1cf
      // 1cb: invokestatic s90.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: iload 9
      // 1d1: goto 1d8
      // 1d4: invokestatic s90.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: ifeq 1f9
      // 1db: new uvb
      // 1de: dup
      // 1df: sipush 15722
      // 1e2: ldc2_w 111077215320629091
      // 1e5: lload 3
      // 1e6: lxor
      // 1e7: invokedynamic e (IJ)Ljava/lang/String; bsm=s90.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: nop
      // 1ed: bipush 0
      // 1ee: anewarray 35
      // 1f1: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1f4: athrow
      // 1f5: invokestatic s90.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: aload 10
      // 1fb: iload 8
      // 1fd: invokevirtual ha9.nli (I)V
      // 200: aload 1
      // 201: aload 0
      // 202: sipush 25511
      // 205: ldc2_w 5666309602217525672
      // 208: lload 3
      // 209: lxor
      // 20a: invokedynamic e (IJ)Ljava/lang/String; bsm=s90.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: nop
      // 210: bipush 2
      // 211: anewarray 35
      // 214: dup
      // 215: bipush 0
      // 216: iload 8
      // 218: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21b: aastore
      // 21c: dup
      // 21d: bipush 1
      // 21e: aload 10
      // 220: invokevirtual ha9.noc ()Ljava/lang/String;
      // 223: aastore
      // 224: invokestatic s90.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 227: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: iload 4
      // 08: ifne 1f
      // 0b: arraylength
      // 0c: bipush 2
      // 0d: if_icmpne 29
      // 10: goto 17
      // 13: invokestatic s90.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: goto 1f
      // 1b: invokestatic s90.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual s90._ej ()[Ljava/lang/String;
      // 23: invokestatic s90.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 26: goto 2a
      // 29: aconst_null
      // 2a: areturn
   }

   public String[] _ej() {
      return vr1._0v().p14();
   }

   @Override
   public boolean mp9(String[] param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 1c
      // 09: bipush 1
      // 0a: if_icmpne 1f
      // 0d: goto 14
      // 10: invokestatic s90.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 1c
      // 18: invokestatic s90.a (Loov;)Loov;
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 0
      // 20: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1464485452309060941L, -7396830267525486394L, MethodHandles.lookup().lookupClass()).a(151894175151166L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 128282674570427L;
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
      String var6 = "àYk\u0083¤\u009edz\f÷þ6\u008c\u0089Ö<¬B\u0015\u001d\u0089½½[©å\u0010V\u009a5K\u0082ÓgB\u009c¤(-ÍAè\r]>·æÉ(²hº×{Ô(M¯\u0013ä\u0099E\u0099Ö^Lg\u0094_}q\u0080J3&\"¸«ä\u0012°\u009dwm\u0099N§\u0099Ä\u0010°Ì\u0016^ìñY×`)%\u008fðäéþ8'\u0096'ª//\u0012\u0018\u008c\u0093-¾ÊI×>ø¤eùq9£>¯B§f»\u00872ãØòÃT\u0007ÜU\u0017Aåª\u0002ë?~ú\u0098À§\u0007\u009b¬Ðã(\u0089Ýº::Ã×D§Â<(ÛÓè\u001b3 úÂuSV\u008e'\u0007bBÕY\u008b\u00052ûN\u008cmtªd";
      int var8 = "àYk\u0083¤\u009edz\f÷þ6\u008c\u0089Ö<¬B\u0015\u001d\u0089½½[©å\u0010V\u009a5K\u0082ÓgB\u009c¤(-ÍAè\r]>·æÉ(²hº×{Ô(M¯\u0013ä\u0099E\u0099Ö^Lg\u0094_}q\u0080J3&\"¸«ä\u0012°\u009dwm\u0099N§\u0099Ä\u0010°Ì\u0016^ìñY×`)%\u008fðäéþ8'\u0096'ª//\u0012\u0018\u008c\u0093-¾ÊI×>ø¤eùq9£>¯B§f»\u00872ãØòÃT\u0007ÜU\u0017Aåª\u0002ë?~ú\u0098À§\u0007\u009b¬Ðã(\u0089Ýº::Ã×D§Â<(ÛÓè\u001b3 úÂuSV\u008e'\u0007bBÕY\u008b\u00052ûN\u008cmtªd"
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

                  var6 = "\u009f\u0099Á\u0000u\u0017\u008e\u0002Ë_Õÿ\níéÀ\u001b\"\u0001/uO!Zõ®Ã\u0082\u009bë×ã_¹H\u0017×\t\u0083.@£G^\u001cê|up÷\u0013\u00adì°j\u0097D\u0015§\u008b\\Í\u009fy¤ä\u009aW/óO\u0099`\u001b\u008d\u0006*°d2Ó&\u0007¨°òªþóè\u008eä\\«Ýd.Ê\u0083[áaª@3";
                  var8 = "\u009f\u0099Á\u0000u\u0017\u008e\u0002Ë_Õÿ\níéÀ\u001b\"\u0001/uO!Zõ®Ã\u0082\u009bë×ã_¹H\u0017×\t\u0083.@£G^\u001cê|up÷\u0013\u00adì°j\u0097D\u0015§\u008b\\Í\u009fy¤ä\u009aW/óO\u0099`\u001b\u008d\u0006*°d2Ó&\u0007¨°òªþóè\u008eä\\«Ýd.Ê\u0083[áaª@3"
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20052;
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
            throw new RuntimeException("s90", var10);
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
         throw new RuntimeException("s90" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
