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
   t2u = "friend",
   io4 = {"add <name> | del <name> | clear | list"},
   hjc = "Edit friends list"
)
public class uon extends HwidProvider {
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
      // 000: getstatic uon.a J
      // 003: ldc2_w 66200914152982
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: arraylength
      // 00f: bipush 2
      // 010: iload 4
      // 012: ifeq 039
      // 015: if_icmple 02f
      // 018: goto 01f
      // 01b: invokestatic uon.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: invokevirtual uon.dhs ()V
      // 023: iload 4
      // 025: ifne 280
      // 028: goto 02f
      // 02b: invokestatic uon.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 1
      // 030: arraylength
      // 031: bipush 2
      // 032: goto 039
      // 035: invokestatic uon.a (Loov;)Loov;
      // 038: athrow
      // 039: iload 4
      // 03b: ifeq 174
      // 03e: if_icmpne 15e
      // 041: goto 048
      // 044: invokestatic uon.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 1
      // 049: bipush 0
      // 04a: aaload
      // 04b: sipush 12380
      // 04e: ldc2_w 7479411478259309018
      // 051: lload 2
      // 052: lxor
      // 053: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: nop
      // 059: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 05c: iload 4
      // 05e: ifeq 0f2
      // 061: goto 068
      // 064: invokestatic uon.a (Loov;)Loov;
      // 067: athrow
      // 068: ifeq 0cb
      // 06b: goto 072
      // 06e: invokestatic uon.a (Loov;)Loov;
      // 071: athrow
      // 072: getstatic ClientState.qkk Lzwr;
      // 075: invokevirtual ClientState.w34 ()Lf62;
      // 078: aload 1
      // 079: bipush 1
      // 07a: aaload
      // 07b: invokevirtual f62.fu7 (Ljava/lang/String;)V
      // 07e: new java/lang/StringBuilder
      // 081: dup
      // 082: invokespecial java/lang/StringBuilder.<init> ()V
      // 085: sipush 10089
      // 088: ldc2_w 8960993502591946472
      // 08b: lload 2
      // 08c: lxor
      // 08d: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: nop
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: getstatic syo.u4m Lsyo;
      // 099: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 09c: aload 1
      // 09d: bipush 1
      // 09e: aaload
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: getstatic syo.w29 Lsyo;
      // 0a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a8: sipush 32491
      // 0ab: ldc2_w 760862432833099631
      // 0ae: lload 2
      // 0af: lxor
      // 0b0: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: nop
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bc: invokestatic ncl.dob (Ljava/lang/String;)V
      // 0bf: iload 4
      // 0c1: ifne 280
      // 0c4: goto 0cb
      // 0c7: invokestatic uon.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: bipush 0
      // 0cd: aaload
      // 0ce: iload 4
      // 0d0: ifeq 146
      // 0d3: goto 0da
      // 0d6: invokestatic uon.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: sipush 30554
      // 0dd: ldc2_w 7436686839362870993
      // 0e0: lload 2
      // 0e1: lxor
      // 0e2: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: nop
      // 0e8: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0eb: goto 0f2
      // 0ee: invokestatic uon.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: ifeq 14e
      // 0f5: getstatic ClientState.qkk Lzwr;
      // 0f8: invokevirtual ClientState.w34 ()Lf62;
      // 0fb: aload 1
      // 0fc: bipush 1
      // 0fd: aaload
      // 0fe: invokevirtual f62.vca (Ljava/lang/String;)V
      // 101: new java/lang/StringBuilder
      // 104: dup
      // 105: invokespecial java/lang/StringBuilder.<init> ()V
      // 108: sipush 27870
      // 10b: ldc2_w 6851951115130357081
      // 10e: lload 2
      // 10f: lxor
      // 110: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: nop
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: getstatic syo.u4m Lsyo;
      // 11c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11f: aload 1
      // 120: bipush 1
      // 121: aaload
      // 122: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 125: getstatic syo.w29 Lsyo;
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12b: sipush 26527
      // 12e: ldc2_w 5199363780985146906
      // 131: lload 2
      // 132: lxor
      // 133: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: nop
      // 139: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13f: goto 146
      // 142: invokestatic uon.a (Loov;)Loov;
      // 145: athrow
      // 146: invokestatic ncl.dob (Ljava/lang/String;)V
      // 149: iload 4
      // 14b: ifne 280
      // 14e: aload 0
      // 14f: invokevirtual uon.dhs ()V
      // 152: iload 4
      // 154: ifne 280
      // 157: goto 15e
      // 15a: invokestatic uon.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 1
      // 15f: arraylength
      // 160: iload 4
      // 162: ifeq 192
      // 165: goto 16c
      // 168: invokestatic uon.a (Loov;)Loov;
      // 16b: athrow
      // 16c: bipush 1
      // 16d: goto 174
      // 170: invokestatic uon.a (Loov;)Loov;
      // 173: athrow
      // 174: if_icmpne 275
      // 177: aload 1
      // 178: bipush 0
      // 179: aaload
      // 17a: sipush 7095
      // 17d: ldc2_w 6768821826878583351
      // 180: lload 2
      // 181: lxor
      // 182: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: nop
      // 188: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 18b: goto 192
      // 18e: invokestatic uon.a (Loov;)Loov;
      // 191: athrow
      // 192: iload 4
      // 194: ifeq 20c
      // 197: ifeq 1f1
      // 19a: goto 1a1
      // 19d: invokestatic uon.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: sipush 7801
      // 1a4: ldc2_w 2142981531175237626
      // 1a7: lload 2
      // 1a8: lxor
      // 1a9: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: nop
      // 1af: invokestatic ncl.dob (Ljava/lang/String;)V
      // 1b2: getstatic ClientState.qkk Lzwr;
      // 1b5: invokevirtual ClientState.w34 ()Lf62;
      // 1b8: invokevirtual f62.dy5 ()Ljava/util/ArrayList;
      // 1bb: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 1be: astore 5
      // 1c0: aload 5
      // 1c2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c7: ifeq 1ec
      // 1ca: aload 5
      // 1cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d1: checkcast java/lang/String
      // 1d4: astore 6
      // 1d6: aload 6
      // 1d8: invokestatic ncl.dob (Ljava/lang/String;)V
      // 1db: iload 4
      // 1dd: ifeq 280
      // 1e0: iload 4
      // 1e2: ifne 1c0
      // 1e5: goto 1ec
      // 1e8: invokestatic uon.a (Loov;)Loov;
      // 1eb: athrow
      // 1ec: iload 4
      // 1ee: ifne 280
      // 1f1: aload 1
      // 1f2: bipush 0
      // 1f3: aaload
      // 1f4: sipush 21717
      // 1f7: ldc2_w 70542714109230423
      // 1fa: lload 2
      // 1fb: lxor
      // 1fc: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: nop
      // 202: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 205: goto 20c
      // 208: invokestatic uon.a (Loov;)Loov;
      // 20b: athrow
      // 20c: ifeq 265
      // 20f: getstatic ClientState.qkk Lzwr;
      // 212: invokevirtual ClientState.w34 ()Lf62;
      // 215: invokevirtual f62.dy5 ()Ljava/util/ArrayList;
      // 218: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 21b: astore 5
      // 21d: aload 5
      // 21f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 224: ifeq 24f
      // 227: aload 5
      // 229: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22e: checkcast java/lang/String
      // 231: astore 6
      // 233: getstatic ClientState.qkk Lzwr;
      // 236: invokevirtual ClientState.w34 ()Lf62;
      // 239: aload 6
      // 23b: invokevirtual f62.vca (Ljava/lang/String;)V
      // 23e: iload 4
      // 240: ifeq 260
      // 243: iload 4
      // 245: ifne 21d
      // 248: goto 24f
      // 24b: invokestatic uon.a (Loov;)Loov;
      // 24e: athrow
      // 24f: sipush 22063
      // 252: ldc2_w 5176673456671653797
      // 255: lload 2
      // 256: lxor
      // 257: invokedynamic z (IJ)Ljava/lang/String; bsm=uon.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: nop
      // 25d: invokestatic ncl.dob (Ljava/lang/String;)V
      // 260: iload 4
      // 262: ifne 280
      // 265: aload 0
      // 266: invokevirtual uon.dhs ()V
      // 269: iload 4
      // 26b: ifne 280
      // 26e: goto 275
      // 271: invokestatic uon.a (Loov;)Loov;
      // 274: athrow
      // 275: aload 0
      // 276: invokevirtual uon.dhs ()V
      // 279: goto 280
      // 27c: invokestatic uon.a (Loov;)Loov;
      // 27f: athrow
      // 280: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(621349619000903640L, -2811140859769201499L, MethodHandles.lookup().lookupClass()).a(126379624997708L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 114522809816418L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "ÞrOÍC\u0097\u008b\u0091\u0091\u0090=.§d\u008bø\u009dWOÚZé9\u008bN\u008a\u0094µ\u0019Îm7zý3^\u0081\u009b\u0081ö\u0010#ÂP$À'PÜ\u001bÅõP\fF9\u009f\u0010\u0088t\u0086Õ\u0087·öÁwa7\u0097\u008dN\u0099å\u0010zµ\u0081\b\nYø\u008c \u0096\u0017\u0014\u0087mPU é§\u0003\u009d·tkÒ4HETõB\u0002\u0006O\fÃS\u009c=´>Ëã\u0085\u0016nÈ£Ò\u0010\u009b½®5\u0012<%\u0083Î\u0095ç\u0018f\u009d3®\u0018Ñ\u0005\u0080__\u009d+)¹b¡Ò~4\u0082\u0018¹½U\u0001u¸Óô W(³§¿\u00155ú\u0017%â3a\u009e\u0089K\u0017à©\u0097Ò£\u0013«\u0097\u00adâ¶þÐìà";
      int var8 = "ÞrOÍC\u0097\u008b\u0091\u0091\u0090=.§d\u008bø\u009dWOÚZé9\u008bN\u008a\u0094µ\u0019Îm7zý3^\u0081\u009b\u0081ö\u0010#ÂP$À'PÜ\u001bÅõP\fF9\u009f\u0010\u0088t\u0086Õ\u0087·öÁwa7\u0097\u008dN\u0099å\u0010zµ\u0081\b\nYø\u008c \u0096\u0017\u0014\u0087mPU é§\u0003\u009d·tkÒ4HETõB\u0002\u0006O\fÃS\u009c=´>Ëã\u0085\u0016nÈ£Ò\u0010\u009b½®5\u0012<%\u0083Î\u0095ç\u0018f\u009d3®\u0018Ñ\u0005\u0080__\u009d+)¹b¡Ò~4\u0082\u0018¹½U\u0001u¸Óô W(³§¿\u00155ú\u0017%â3a\u009e\u0089K\u0017à©\u0097Ò£\u0013«\u0097\u00adâ¶þÐìà"
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
                     e = new String[10];
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

                  var6 = ">X\u009aþäë1qö/N\u0091ã\u0083\u001eÁ ÅÞ^Þ[\u0099\r\u0000\u000fÕ\u008b\u008akfN\u0001\u0092Þòh)\u0090\u0013\u0092M\u0096\u0012p\u00924&\u0015";
                  var8 = ">X\u009aþäë1qö/N\u0091ã\u0083\u001eÁ ÅÞ^Þ[\u0099\r\u0000\u000fÕ\u008b\u008akfN\u0001\u0092Þòh)\u0090\u0013\u0092M\u0096\u0012p\u00924&\u0015"
                     .length();
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7809;
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
            throw new RuntimeException("uon", var10);
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
         throw new RuntimeException("uon" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
