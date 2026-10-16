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

public class rnq$p7s {
   private final int ygh;
   private final int s3s;
   private final int _3x;
   private final int nj9;
   private List g3p;
   private rnq$ffv spa;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public rnq$p7s(int var1, int var2, int var3, int var4) {
      this.ygh = var1;
      this.s3s = var2;
      this._3x = var3;
      this.nj9 = var4;
   }

   public rnq$ffv rm0() {
      return this.spa;
   }

   public int ybe() {
      return this.ygh;
   }

   public int cqo() {
      return this.s3s;
   }

   public boolean _1f(rnq$ffv param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield rnq$p7s.spa Lrnq$ffv;
      // 008: iload 2
      // 009: ifeq 01d
      // 00c: ifnull 01c
      // 00f: goto 016
      // 012: invokestatic rnq$p7s.a (Loov;)Loov;
      // 015: athrow
      // 016: bipush 0
      // 017: ireturn
      // 018: invokestatic rnq$p7s.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 1
      // 01d: invokevirtual rnq$ffv.fsh ()I
      // 020: istore 3
      // 021: aload 1
      // 022: invokevirtual rnq$ffv.smw ()I
      // 025: istore 4
      // 027: iload 3
      // 028: iload 2
      // 029: ifeq 28c
      // 02c: aload 0
      // 02d: getfield rnq$p7s._3x I
      // 030: if_icmpgt 28b
      // 033: goto 03a
      // 036: invokestatic rnq$p7s.a (Loov;)Loov;
      // 039: athrow
      // 03a: iload 4
      // 03c: iload 2
      // 03d: ifeq 28c
      // 040: goto 047
      // 043: invokestatic rnq$p7s.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield rnq$p7s.nj9 I
      // 04b: if_icmpgt 28b
      // 04e: goto 055
      // 051: invokestatic rnq$p7s.a (Loov;)Loov;
      // 054: athrow
      // 055: iload 3
      // 056: aload 0
      // 057: getfield rnq$p7s._3x I
      // 05a: iload 2
      // 05b: ifeq 087
      // 05e: goto 065
      // 061: invokestatic rnq$p7s.a (Loov;)Loov;
      // 064: athrow
      // 065: if_icmpne 098
      // 068: goto 06f
      // 06b: invokestatic rnq$p7s.a (Loov;)Loov;
      // 06e: athrow
      // 06f: iload 4
      // 071: iload 2
      // 072: ifeq 097
      // 075: goto 07c
      // 078: invokestatic rnq$p7s.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield rnq$p7s.nj9 I
      // 080: goto 087
      // 083: invokestatic rnq$p7s.a (Loov;)Loov;
      // 086: athrow
      // 087: if_icmpne 098
      // 08a: aload 0
      // 08b: aload 1
      // 08c: putfield rnq$p7s.spa Lrnq$ffv;
      // 08f: bipush 1
      // 090: goto 097
      // 093: invokestatic rnq$p7s.a (Loov;)Loov;
      // 096: athrow
      // 097: ireturn
      // 098: aload 0
      // 099: getfield rnq$p7s.g3p Ljava/util/List;
      // 09c: iload 2
      // 09d: ifeq 247
      // 0a0: ifnonnull 243
      // 0a3: goto 0aa
      // 0a6: invokestatic rnq$p7s.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: bipush 1
      // 0ac: invokestatic com/google/common/collect/Lists.newArrayListWithCapacity (I)Ljava/util/ArrayList;
      // 0af: putfield rnq$p7s.g3p Ljava/util/List;
      // 0b2: aload 0
      // 0b3: getfield rnq$p7s.g3p Ljava/util/List;
      // 0b6: new rnq$p7s
      // 0b9: dup
      // 0ba: aload 0
      // 0bb: getfield rnq$p7s.ygh I
      // 0be: aload 0
      // 0bf: getfield rnq$p7s.s3s I
      // 0c2: iload 3
      // 0c3: iload 4
      // 0c5: invokespecial rnq$p7s.<init> (IIII)V
      // 0c8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cd: pop
      // 0ce: aload 0
      // 0cf: getfield rnq$p7s._3x I
      // 0d2: iload 3
      // 0d3: isub
      // 0d4: istore 5
      // 0d6: aload 0
      // 0d7: getfield rnq$p7s.nj9 I
      // 0da: iload 4
      // 0dc: isub
      // 0dd: istore 6
      // 0df: iload 6
      // 0e1: iload 2
      // 0e2: ifeq 1ce
      // 0e5: ifle 1c5
      // 0e8: goto 0ef
      // 0eb: invokestatic rnq$p7s.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: iload 5
      // 0f1: iload 2
      // 0f2: ifeq 1ce
      // 0f5: goto 0fc
      // 0f8: invokestatic rnq$p7s.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: ifle 1c5
      // 0ff: goto 106
      // 102: invokestatic rnq$p7s.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield rnq$p7s.nj9 I
      // 10a: iload 5
      // 10c: invokestatic java/lang/Math.max (II)I
      // 10f: istore 7
      // 111: aload 0
      // 112: getfield rnq$p7s._3x I
      // 115: iload 6
      // 117: invokestatic java/lang/Math.max (II)I
      // 11a: istore 8
      // 11c: iload 7
      // 11e: iload 2
      // 11f: ifeq 1c0
      // 122: iload 8
      // 124: if_icmplt 179
      // 127: goto 12e
      // 12a: invokestatic rnq$p7s.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 0
      // 12f: getfield rnq$p7s.g3p Ljava/util/List;
      // 132: new rnq$p7s
      // 135: dup
      // 136: aload 0
      // 137: getfield rnq$p7s.ygh I
      // 13a: aload 0
      // 13b: getfield rnq$p7s.s3s I
      // 13e: iload 4
      // 140: iadd
      // 141: iload 3
      // 142: iload 6
      // 144: invokespecial rnq$p7s.<init> (IIII)V
      // 147: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14c: pop
      // 14d: aload 0
      // 14e: getfield rnq$p7s.g3p Ljava/util/List;
      // 151: new rnq$p7s
      // 154: dup
      // 155: aload 0
      // 156: getfield rnq$p7s.ygh I
      // 159: iload 3
      // 15a: iadd
      // 15b: aload 0
      // 15c: getfield rnq$p7s.s3s I
      // 15f: iload 5
      // 161: aload 0
      // 162: getfield rnq$p7s.nj9 I
      // 165: invokespecial rnq$p7s.<init> (IIII)V
      // 168: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16d: pop
      // 16e: iload 2
      // 16f: ifne 1c1
      // 172: goto 179
      // 175: invokestatic rnq$p7s.a (Loov;)Loov;
      // 178: athrow
      // 179: aload 0
      // 17a: getfield rnq$p7s.g3p Ljava/util/List;
      // 17d: new rnq$p7s
      // 180: dup
      // 181: aload 0
      // 182: getfield rnq$p7s.ygh I
      // 185: iload 3
      // 186: iadd
      // 187: aload 0
      // 188: getfield rnq$p7s.s3s I
      // 18b: iload 5
      // 18d: iload 4
      // 18f: invokespecial rnq$p7s.<init> (IIII)V
      // 192: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 197: pop
      // 198: aload 0
      // 199: getfield rnq$p7s.g3p Ljava/util/List;
      // 19c: new rnq$p7s
      // 19f: dup
      // 1a0: aload 0
      // 1a1: getfield rnq$p7s.ygh I
      // 1a4: aload 0
      // 1a5: getfield rnq$p7s.s3s I
      // 1a8: iload 4
      // 1aa: iadd
      // 1ab: aload 0
      // 1ac: getfield rnq$p7s._3x I
      // 1af: iload 6
      // 1b1: invokespecial rnq$p7s.<init> (IIII)V
      // 1b4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1b9: goto 1c0
      // 1bc: invokestatic rnq$p7s.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: pop
      // 1c1: iload 2
      // 1c2: ifne 243
      // 1c5: iload 5
      // 1c7: goto 1ce
      // 1ca: invokestatic rnq$p7s.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: iload 2
      // 1cf: ifeq 20f
      // 1d2: ifne 206
      // 1d5: goto 1dc
      // 1d8: invokestatic rnq$p7s.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: aload 0
      // 1dd: getfield rnq$p7s.g3p Ljava/util/List;
      // 1e0: new rnq$p7s
      // 1e3: dup
      // 1e4: aload 0
      // 1e5: getfield rnq$p7s.ygh I
      // 1e8: aload 0
      // 1e9: getfield rnq$p7s.s3s I
      // 1ec: iload 4
      // 1ee: iadd
      // 1ef: iload 3
      // 1f0: iload 6
      // 1f2: invokespecial rnq$p7s.<init> (IIII)V
      // 1f5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1fa: pop
      // 1fb: iload 2
      // 1fc: ifne 243
      // 1ff: goto 206
      // 202: invokestatic rnq$p7s.a (Loov;)Loov;
      // 205: athrow
      // 206: iload 6
      // 208: goto 20f
      // 20b: invokestatic rnq$p7s.a (Loov;)Loov;
      // 20e: athrow
      // 20f: iload 2
      // 210: ifeq 242
      // 213: ifne 243
      // 216: goto 21d
      // 219: invokestatic rnq$p7s.a (Loov;)Loov;
      // 21c: athrow
      // 21d: aload 0
      // 21e: getfield rnq$p7s.g3p Ljava/util/List;
      // 221: new rnq$p7s
      // 224: dup
      // 225: aload 0
      // 226: getfield rnq$p7s.ygh I
      // 229: iload 3
      // 22a: iadd
      // 22b: aload 0
      // 22c: getfield rnq$p7s.s3s I
      // 22f: iload 5
      // 231: iload 4
      // 233: invokespecial rnq$p7s.<init> (IIII)V
      // 236: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 23b: goto 242
      // 23e: invokestatic rnq$p7s.a (Loov;)Loov;
      // 241: athrow
      // 242: pop
      // 243: aload 0
      // 244: getfield rnq$p7s.g3p Ljava/util/List;
      // 247: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 24c: astore 5
      // 24e: aload 5
      // 250: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 255: ifeq 289
      // 258: aload 5
      // 25a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25f: checkcast rnq$p7s
      // 262: astore 6
      // 264: aload 6
      // 266: aload 1
      // 267: invokevirtual rnq$p7s._1f (Lrnq$ffv;)Z
      // 26a: iload 2
      // 26b: ifeq 28a
      // 26e: iload 2
      // 26f: ifeq 284
      // 272: goto 279
      // 275: invokestatic rnq$p7s.a (Loov;)Loov;
      // 278: athrow
      // 279: ifeq 285
      // 27c: goto 283
      // 27f: invokestatic rnq$p7s.a (Loov;)Loov;
      // 282: athrow
      // 283: bipush 1
      // 284: ireturn
      // 285: iload 2
      // 286: ifne 24e
      // 289: bipush 0
      // 28a: ireturn
      // 28b: bipush 0
      // 28c: ireturn
   }

   public void x_v(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 31
      // 09: getfield rnq$p7s.spa Lrnq$ffv;
      // 0c: ifnull 29
      // 0f: goto 16
      // 12: invokestatic rnq$p7s.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: aload 0
      // 18: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d: pop
      // 1e: iload 2
      // 1f: ifne 71
      // 22: goto 29
      // 25: invokestatic rnq$p7s.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic rnq$p7s.a (Loov;)Loov;
      // 30: athrow
      // 31: getfield rnq$p7s.g3p Ljava/util/List;
      // 34: iload 2
      // 35: ifeq 4d
      // 38: ifnull 71
      // 3b: goto 42
      // 3e: invokestatic rnq$p7s.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getfield rnq$p7s.g3p Ljava/util/List;
      // 46: goto 4d
      // 49: invokestatic rnq$p7s.a (Loov;)Loov;
      // 4c: athrow
      // 4d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 52: astore 3
      // 53: aload 3
      // 54: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 59: ifeq 71
      // 5c: aload 3
      // 5d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 62: checkcast rnq$p7s
      // 65: astore 4
      // 67: aload 4
      // 69: aload 1
      // 6a: invokevirtual rnq$p7s.x_v (Ljava/util/List;)V
      // 6d: iload 2
      // 6e: ifne 53
      // 71: return
   }

   @Override
   public String toString() {
      long var1 = a ^ 111639226491581L;
      return a<"i">(16913, 1641837741773187233L ^ var1)
         + this.ygh
         + a<"i">(10914, 5140986226726141971L ^ var1)
         + this.s3s
         + a<"i">(14931, 6468670085221191908L ^ var1)
         + this._3x
         + a<"i">(4606, 6198880154061945672L ^ var1)
         + this.nj9
         + a<"i">(23935, 7779529509129582540L ^ var1)
         + this.spa
         + a<"i">(20816, 431820528047782882L ^ var1)
         + this.g3p
         + '}';
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8321273886501168745L, -4728758043195102513L, MethodHandles.lookup().lookupClass()).a(219612143904411L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 51502028249454L;
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
      String var6 = "\u009d\u0091\u0010à-9¹\u00013g5ESð\u0005¨Nã\u0006|:»ã-Ü\u001e5Û_µÏ¬\u0018\u0012çÂ¼Ëââ(ñ¤3?\u001a¤s\u0081ÐR×X¢\u008aã¶ ÿcàÑnSØH¾3ø\u0002\u0002\n»Óecs\u0019ÁÐ X·\u0088æ\u0096\u0002\u001b¥» e\u0018/Ê\u0098\u0099%;{¨Ã<õ÷ü¢\u0085\u0088\u0084GQÁ\u009fXuçréPâ(\u0099";
      int var8 = "\u009d\u0091\u0010à-9¹\u00013g5ESð\u0005¨Nã\u0006|:»ã-Ü\u001e5Û_µÏ¬\u0018\u0012çÂ¼Ëââ(ñ¤3?\u001a¤s\u0081ÐR×X¢\u008aã¶ ÿcàÑnSØH¾3ø\u0002\u0002\n»Óecs\u0019ÁÐ X·\u0088æ\u0096\u0002\u001b¥» e\u0018/Ê\u0098\u0099%;{¨Ã<õ÷ü¢\u0085\u0088\u0084GQÁ\u009fXuçréPâ(\u0099"
         .length();
      char var5 = ' ';
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
                     c = new String[6];
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

                  var6 = "G\u0094¹\u0018p\u001934n(\u0093«Úí\u0098;èm9Fì=Ùè@§uÖøòJk ±¯\u0091B\u0015#¾$\u0089b\u008d\u0090J\u0099\u001f=â\u008fz§@3¿²\u0091ßq¸K¢\u0004)";
                  var8 = "G\u0094¹\u0018p\u001934n(\u0093«Úí\u0098;èm9Fì=Ùè@§uÖøòJk ±¯\u0091B\u0015#¾$\u0089b\u008d\u0090J\u0099\u001f=â\u008fz§@3¿²\u0091ßq¸K¢\u0004)"
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10021;
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
            throw new RuntimeException("rnq$p7s", var10);
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
         throw new RuntimeException("rnq$p7s" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
