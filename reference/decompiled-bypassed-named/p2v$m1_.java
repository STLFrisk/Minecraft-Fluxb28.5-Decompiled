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

public class p2v$m1_ extends ed7 {
   public final p2v j2o;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public p2v$m1_(p2v var1, Minecraft var2) {
      super(var2, var1.dt7, var1.o1e, 32, var1.o1e - 35, (int)((double)var2.tx1.rr7 * 3.5));
      this.j2o = var1;
      this.fai(false);
   }

   @Override
   public int getSize() {
      return this.gk_.vnk().pjx().length;
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
      this.gk_.oxn.qqs = this.gk_.vnk().pjx()[var1].serverUrl;
      this.gk_.oxn.cmo();
   }

   @Override
   public boolean isSelected(int var1) {
      return this.gk_.vnk().pjx()[var1].serverUrl.equals(this.gk_.oxn.qqs);
   }

   @Override
   public void drawBackground() {
   }

   @Override
   public void drawSlot(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p2v$m1_.a J
      // 003: ldc2_w 109899366669648
      // 006: lxor
      // 007: lstore 7
      // 009: aload 0
      // 00a: getfield p2v$m1_.gk_ Lc05;
      // 00d: invokevirtual Minecraft.vnk ()Ltyh;
      // 010: invokeinterface tyh.pjx ()[Ltv/twitch/broadcast/IngestServer; 1
      // 015: iload 1
      // 016: aaload
      // 017: astore 10
      // 019: invokestatic OpaquePredicate.b ()I
      // 01c: aload 10
      // 01e: getfield tv/twitch/broadcast/IngestServer.serverUrl Ljava/lang/String;
      // 021: sipush 29641
      // 024: ldc2_w 5910505026830169739
      // 027: lload 7
      // 029: lxor
      // 02a: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: nop
      // 030: ldc ""
      // 032: nop
      // 033: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 036: astore 11
      // 038: istore 9
      // 03a: new java/lang/StringBuilder
      // 03d: dup
      // 03e: invokespecial java/lang/StringBuilder.<init> ()V
      // 041: aload 10
      // 043: getfield tv/twitch/broadcast/IngestServer.bitrateKbps F
      // 046: f2i
      // 047: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 04a: sipush 31882
      // 04d: ldc2_w 2659986371875764687
      // 050: lload 7
      // 052: lxor
      // 053: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: nop
      // 059: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 05c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 05f: astore 12
      // 061: aconst_null
      // 062: astore 13
      // 064: aload 0
      // 065: getfield p2v$m1_.gk_ Lc05;
      // 068: invokevirtual Minecraft.vnk ()Ltyh;
      // 06b: invokeinterface tyh.fsy ()Lsso; 1
      // 070: astore 14
      // 072: aload 14
      // 074: ifnull 166
      // 077: aload 10
      // 079: aload 14
      // 07b: invokevirtual sso.u9q ()Ltv/twitch/broadcast/IngestServer;
      // 07e: if_acmpne 0c3
      // 081: goto 088
      // 084: invokestatic p2v$m1_.a (Loov;)Loov;
      // 087: athrow
      // 088: new java/lang/StringBuilder
      // 08b: dup
      // 08c: invokespecial java/lang/StringBuilder.<init> ()V
      // 08f: getstatic syo.qjc Lsyo;
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 095: aload 11
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: astore 11
      // 09f: new java/lang/StringBuilder
      // 0a2: dup
      // 0a3: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a6: aload 14
      // 0a8: invokevirtual sso.np3 ()F
      // 0ab: ldc 100.0
      // 0ad: nop
      // 0ae: fmul
      // 0af: f2i
      // 0b0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0b3: ldc "%"
      // 0b5: nop
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0bc: astore 12
      // 0be: iload 9
      // 0c0: ifne 1a7
      // 0c3: iload 1
      // 0c4: iload 9
      // 0c6: ifeq 0ed
      // 0c9: goto 0d0
      // 0cc: invokestatic p2v$m1_.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 14
      // 0d2: invokevirtual sso.y3d ()I
      // 0d5: if_icmpge 125
      // 0d8: goto 0df
      // 0db: invokestatic p2v$m1_.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 10
      // 0e1: getfield tv/twitch/broadcast/IngestServer.bitrateKbps F
      // 0e4: fconst_0
      // 0e5: fcmpl
      // 0e6: goto 0ed
      // 0e9: invokestatic p2v$m1_.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: iload 9
      // 0ef: ifeq 1b1
      // 0f2: ifne 1a7
      // 0f5: goto 0fc
      // 0f8: invokestatic p2v$m1_.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: new java/lang/StringBuilder
      // 0ff: dup
      // 100: invokespecial java/lang/StringBuilder.<init> ()V
      // 103: getstatic syo.aez Lsyo;
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 109: sipush 17670
      // 10c: ldc2_w 2057836421688606790
      // 10f: lload 7
      // 111: lxor
      // 112: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: nop
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11e: astore 12
      // 120: iload 9
      // 122: ifne 1a7
      // 125: new java/lang/StringBuilder
      // 128: dup
      // 129: invokespecial java/lang/StringBuilder.<init> ()V
      // 12c: getstatic syo.sxj Lsyo;
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 132: sipush 21346
      // 135: ldc2_w 6107903212236002853
      // 138: lload 7
      // 13a: lxor
      // 13b: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: nop
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: getstatic syo.w29 Lsyo;
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14a: sipush 10432
      // 14d: ldc2_w 957081988129107331
      // 150: lload 7
      // 152: lxor
      // 153: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: nop
      // 159: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15f: astore 12
      // 161: iload 9
      // 163: ifne 1a7
      // 166: aload 10
      // 168: getfield tv/twitch/broadcast/IngestServer.bitrateKbps F
      // 16b: fconst_0
      // 16c: fcmpl
      // 16d: iload 9
      // 16f: ifeq 1b1
      // 172: goto 179
      // 175: invokestatic p2v$m1_.a (Loov;)Loov;
      // 178: athrow
      // 179: ifne 1a7
      // 17c: goto 183
      // 17f: invokestatic p2v$m1_.a (Loov;)Loov;
      // 182: athrow
      // 183: new java/lang/StringBuilder
      // 186: dup
      // 187: invokespecial java/lang/StringBuilder.<init> ()V
      // 18a: getstatic syo.aez Lsyo;
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 190: sipush 15500
      // 193: ldc2_w 388390941847435722
      // 196: lload 7
      // 198: lxor
      // 199: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: nop
      // 19f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a5: astore 12
      // 1a7: iload 2
      // 1a8: bipush 15
      // 1aa: isub
      // 1ab: istore 2
      // 1ac: aload 0
      // 1ad: iload 1
      // 1ae: invokevirtual p2v$m1_.isSelected (I)Z
      // 1b1: iload 9
      // 1b3: ifeq 1ec
      // 1b6: ifeq 1e7
      // 1b9: goto 1c0
      // 1bc: invokestatic p2v$m1_.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: new java/lang/StringBuilder
      // 1c3: dup
      // 1c4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c7: getstatic syo.jkd Lsyo;
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1cd: sipush 11386
      // 1d0: ldc2_w 3416702704780388670
      // 1d3: lload 7
      // 1d5: lxor
      // 1d6: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: nop
      // 1dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1df: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e2: astore 13
      // 1e4: goto 213
      // 1e7: aload 10
      // 1e9: getfield tv/twitch/broadcast/IngestServer.defaultServer Z
      // 1ec: ifeq 213
      // 1ef: new java/lang/StringBuilder
      // 1f2: dup
      // 1f3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f6: getstatic syo.qjc Lsyo;
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1fc: sipush 11336
      // 1ff: ldc2_w 1119745363443198217
      // 202: lload 7
      // 204: lxor
      // 205: invokedynamic k (IJ)Ljava/lang/String; bsm=p2v$m1_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: nop
      // 20b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 211: astore 13
      // 213: aload 0
      // 214: getfield p2v$m1_.j2o Lp2v;
      // 217: aload 0
      // 218: getfield p2v$m1_.j2o Lp2v;
      // 21b: invokestatic p2v._0w (Lp2v;)Lowt;
      // 21e: aload 10
      // 220: getfield tv/twitch/broadcast/IngestServer.serverName Ljava/lang/String;
      // 223: iload 2
      // 224: bipush 2
      // 225: iadd
      // 226: iload 3
      // 227: bipush 5
      // 228: iadd
      // 229: ldc 16777215
      // 22b: nop
      // 22c: invokevirtual p2v.c_t (Lowt;Ljava/lang/String;III)V
      // 22f: aload 0
      // 230: getfield p2v$m1_.j2o Lp2v;
      // 233: aload 0
      // 234: getfield p2v$m1_.j2o Lp2v;
      // 237: invokestatic p2v.k6o (Lp2v;)Lowt;
      // 23a: aload 11
      // 23c: iload 2
      // 23d: bipush 2
      // 23e: iadd
      // 23f: iload 3
      // 240: aload 0
      // 241: getfield p2v$m1_.j2o Lp2v;
      // 244: invokestatic p2v.v2r (Lp2v;)Lowt;
      // 247: getfield owt.rr7 I
      // 24a: iadd
      // 24b: bipush 5
      // 24c: iadd
      // 24d: bipush 3
      // 24e: iadd
      // 24f: ldc 3158064
      // 251: nop
      // 252: invokevirtual p2v.c_t (Lowt;Ljava/lang/String;III)V
      // 255: aload 0
      // 256: getfield p2v$m1_.j2o Lp2v;
      // 259: aload 0
      // 25a: getfield p2v$m1_.j2o Lp2v;
      // 25d: invokestatic p2v.jtu (Lp2v;)Lowt;
      // 260: aload 12
      // 262: aload 0
      // 263: invokevirtual p2v$m1_.getScrollBarX ()I
      // 266: bipush 5
      // 267: isub
      // 268: aload 0
      // 269: getfield p2v$m1_.j2o Lp2v;
      // 26c: invokestatic p2v.gbs (Lp2v;)Lowt;
      // 26f: aload 12
      // 271: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 274: isub
      // 275: iload 3
      // 276: bipush 5
      // 277: iadd
      // 278: ldc 8421504
      // 27a: nop
      // 27b: iload 9
      // 27d: ifeq 2c9
      // 280: invokevirtual p2v.c_t (Lowt;Ljava/lang/String;III)V
      // 283: aload 13
      // 285: ifnull 2cc
      // 288: goto 28f
      // 28b: invokestatic p2v$m1_.a (Loov;)Loov;
      // 28e: athrow
      // 28f: aload 0
      // 290: getfield p2v$m1_.j2o Lp2v;
      // 293: aload 0
      // 294: getfield p2v$m1_.j2o Lp2v;
      // 297: invokestatic p2v._vh (Lp2v;)Lowt;
      // 29a: aload 13
      // 29c: aload 0
      // 29d: invokevirtual p2v$m1_.getScrollBarX ()I
      // 2a0: bipush 5
      // 2a1: isub
      // 2a2: aload 0
      // 2a3: getfield p2v$m1_.j2o Lp2v;
      // 2a6: invokestatic p2v.et9 (Lp2v;)Lowt;
      // 2a9: aload 13
      // 2ab: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 2ae: isub
      // 2af: iload 3
      // 2b0: bipush 5
      // 2b1: iadd
      // 2b2: bipush 3
      // 2b3: iadd
      // 2b4: aload 0
      // 2b5: getfield p2v$m1_.j2o Lp2v;
      // 2b8: invokestatic p2v.n_6 (Lp2v;)Lowt;
      // 2bb: getfield owt.rr7 I
      // 2be: iadd
      // 2bf: ldc 8421504
      // 2c1: nop
      // 2c2: goto 2c9
      // 2c5: invokestatic p2v$m1_.a (Loov;)Loov;
      // 2c8: athrow
      // 2c9: invokevirtual p2v.c_t (Lowt;Ljava/lang/String;III)V
      // 2cc: return
   }

   @Override
   public int getScrollBarX() {
      return super.getScrollBarX() + 15;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1270951899910772230L, 1094549157182542005L, MethodHandles.lookup().lookupClass()).a(249370442491362L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92324072085399L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "û\u0001B \u001cW.\u008f¡úbQ\u0096Ë1F\u00100\u009aMx\u0014\u0016Y\u00ad=\u0019ô\u00941ïôÅ ã\u0003¦Óï\u001d¡ó\"M\rUÒ\u0081N¹ÙD\u0012\u008eÝÎ\u0016z%íØaç\u00adëÙ\u0010åQ\f\u0004Rv/\u009a\u0084\noC±o\u0007÷ }.k\u008dB¢ã8@J¨4\\\u008e\u0099§Ì\u008aL¸ÛåÒwy\u0088\u0016fõ\u0099\f\u0007\u0010á\téZGÃq¨T\u0094L`VsÐÊ";
      int var8 = "û\u0001B \u001cW.\u008f¡úbQ\u0096Ë1F\u00100\u009aMx\u0014\u0016Y\u00ad=\u0019ô\u00941ïôÅ ã\u0003¦Óï\u001d¡ó\"M\rUÒ\u0081N¹ÙD\u0012\u008eÝÎ\u0016z%íØaç\u00adëÙ\u0010åQ\f\u0004Rv/\u009a\u0084\noC±o\u0007÷ }.k\u008dB¢ã8@J¨4\\\u008e\u0099§Ì\u008aL¸ÛåÒwy\u0088\u0016fõ\u0099\f\u0007\u0010á\téZGÃq¨T\u0094L`VsÐÊ"
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
                     c = new String[8];
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

                  var6 = "û½ø÷ä\u0098\u0086\u001bG\f*ª3UjI\u0018ë²\u000eF\u0002µìÌç³EQ\u008a¹\u0015ïCÂ\u0091À\u009c\u009d¦\u0018";
                  var8 = "û½ø÷ä\u0098\u0086\u001bG\f*ª3UjI\u0018ë²\u000eF\u0002µìÌç³EQ\u008a¹\u0015ïCÂ\u0091À\u009c\u009d¦\u0018".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13719;
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
            throw new RuntimeException("p2v$m1_", var10);
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
         throw new RuntimeException("p2v$m1_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
