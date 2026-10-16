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

public class m6w extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 105771713098211L;
      return b<"s">(14446, 4533675440735270056L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 121825253502309L;
      return b<"s">(2252, 190725192360220814L ^ var2);
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
      // 000: getstatic m6w.a J
      // 003: ldc2_w 110163103777958
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: arraylength
      // 00f: iload 5
      // 011: ifeq 035
      // 014: bipush 2
      // 015: if_icmpge 034
      // 018: goto 01f
      // 01b: invokestatic m6w.a (Loov;)Loov;
      // 01e: athrow
      // 01f: new w57
      // 022: dup
      // 023: aload 0
      // 024: aload 1
      // 025: invokevirtual m6w.fm7 (Le7r;)Ljava/lang/String;
      // 028: bipush 0
      // 029: anewarray 32
      // 02c: invokespecial w57.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 02f: athrow
      // 030: invokestatic m6w.a (Loov;)Loov;
      // 033: athrow
      // 034: bipush 0
      // 035: istore 6
      // 037: aload 2
      // 038: iload 6
      // 03a: iinc 6 1
      // 03d: aaload
      // 03e: astore 7
      // 040: aload 1
      // 041: aload 2
      // 042: iload 6
      // 044: iinc 6 1
      // 047: aaload
      // 048: invokestatic m6w.h32 (Le7r;Ljava/lang/String;)Lz96;
      // 04b: astore 8
      // 04d: aload 1
      // 04e: invokeinterface e7r.i15 ()Lfqr; 1
      // 053: astore 9
      // 055: aload 9
      // 057: getfield fqr.lvi D
      // 05a: dstore 10
      // 05c: aload 2
      // 05d: arraylength
      // 05e: iload 6
      // 060: if_icmple 072
      // 063: dload 10
      // 065: aload 2
      // 066: iload 6
      // 068: iinc 6 1
      // 06b: aaload
      // 06c: bipush 1
      // 06d: invokestatic m6w.d80 (DLjava/lang/String;Z)D
      // 070: dstore 10
      // 072: aload 9
      // 074: getfield fqr.gn5 D
      // 077: dstore 12
      // 079: aload 2
      // 07a: arraylength
      // 07b: iload 6
      // 07d: if_icmple 091
      // 080: dload 12
      // 082: aload 2
      // 083: iload 6
      // 085: iinc 6 1
      // 088: aaload
      // 089: bipush 0
      // 08a: bipush 0
      // 08b: bipush 0
      // 08c: invokestatic m6w.bll (DLjava/lang/String;IIZ)D
      // 08f: dstore 12
      // 091: aload 9
      // 093: getfield fqr.bn2 D
      // 096: dstore 14
      // 098: aload 2
      // 099: arraylength
      // 09a: iload 6
      // 09c: if_icmple 0ae
      // 09f: dload 14
      // 0a1: aload 2
      // 0a2: iload 6
      // 0a4: iinc 6 1
      // 0a7: aaload
      // 0a8: bipush 1
      // 0a9: invokestatic m6w.d80 (DLjava/lang/String;Z)D
      // 0ac: dstore 14
      // 0ae: dconst_1
      // 0af: dstore 16
      // 0b1: aload 2
      // 0b2: iload 5
      // 0b4: ifeq 0cc
      // 0b7: arraylength
      // 0b8: iload 6
      // 0ba: if_icmple 0db
      // 0bd: goto 0c4
      // 0c0: invokestatic m6w.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 2
      // 0c5: goto 0cc
      // 0c8: invokestatic m6w.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: iload 6
      // 0ce: iinc 6 1
      // 0d1: aaload
      // 0d2: dconst_0
      // 0d3: ldc2_w 3.4028234663852886E38
      // 0d6: invokestatic m6w.mfx (Ljava/lang/String;DD)D
      // 0d9: dstore 16
      // 0db: dconst_1
      // 0dc: dstore 18
      // 0de: aload 2
      // 0df: iload 5
      // 0e1: ifeq 0f9
      // 0e4: arraylength
      // 0e5: iload 6
      // 0e7: if_icmple 108
      // 0ea: goto 0f1
      // 0ed: invokestatic m6w.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: goto 0f9
      // 0f5: invokestatic m6w.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: iload 6
      // 0fb: iinc 6 1
      // 0fe: aaload
      // 0ff: dconst_0
      // 100: ldc2_w 2.0
      // 103: invokestatic m6w.mfx (Ljava/lang/String;DD)D
      // 106: dstore 18
      // 108: dconst_0
      // 109: dstore 20
      // 10b: aload 2
      // 10c: arraylength
      // 10d: iload 5
      // 10f: ifeq 139
      // 112: iload 6
      // 114: if_icmple 129
      // 117: goto 11e
      // 11a: invokestatic m6w.a (Loov;)Loov;
      // 11d: athrow
      // 11e: aload 2
      // 11f: iload 6
      // 121: aaload
      // 122: dconst_0
      // 123: dconst_1
      // 124: invokestatic m6w.mfx (Ljava/lang/String;DD)D
      // 127: dstore 20
      // 129: dload 16
      // 12b: dconst_1
      // 12c: iload 5
      // 12e: ifeq 148
      // 131: dcmpl
      // 132: goto 139
      // 135: invokestatic m6w.a (Loov;)Loov;
      // 138: athrow
      // 139: ifle 14c
      // 13c: dload 16
      // 13e: ldc2_w 16.0
      // 141: goto 148
      // 144: invokestatic m6w.a (Loov;)Loov;
      // 147: athrow
      // 148: dmul
      // 149: goto 14f
      // 14c: ldc2_w 16.0
      // 14f: dstore 22
      // 151: aload 8
      // 153: dload 10
      // 155: dload 12
      // 157: dload 14
      // 159: invokevirtual z96.qww (DDD)D
      // 15c: dstore 24
      // 15e: iload 5
      // 160: ifeq 271
      // 163: dload 24
      // 165: dload 22
      // 167: dcmpl
      // 168: ifle 230
      // 16b: goto 172
      // 16e: invokestatic m6w.a (Loov;)Loov;
      // 171: athrow
      // 172: dload 20
      // 174: dconst_0
      // 175: iload 5
      // 177: ifeq 1b9
      // 17a: goto 181
      // 17d: invokestatic m6w.a (Loov;)Loov;
      // 180: athrow
      // 181: dcmpg
      // 182: ifgt 1b2
      // 185: goto 18c
      // 188: invokestatic m6w.a (Loov;)Loov;
      // 18b: athrow
      // 18c: new uvb
      // 18f: dup
      // 190: sipush 25741
      // 193: ldc2_w 3424675689696861455
      // 196: lload 3
      // 197: lxor
      // 198: invokedynamic s (IJ)Ljava/lang/String; bsm=m6w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: nop
      // 19e: bipush 1
      // 19f: anewarray 32
      // 1a2: dup
      // 1a3: bipush 0
      // 1a4: aload 8
      // 1a6: invokevirtual z96.noc ()Ljava/lang/String;
      // 1a9: aastore
      // 1aa: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1ad: athrow
      // 1ae: invokestatic m6w.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: dload 10
      // 1b4: aload 8
      // 1b6: getfield z96.o2v D
      // 1b9: dsub
      // 1ba: dstore 26
      // 1bc: dload 12
      // 1be: aload 8
      // 1c0: getfield z96.kfp D
      // 1c3: dsub
      // 1c4: dstore 28
      // 1c6: dload 14
      // 1c8: aload 8
      // 1ca: getfield z96.vbd D
      // 1cd: dsub
      // 1ce: dstore 30
      // 1d0: dload 26
      // 1d2: dload 26
      // 1d4: dmul
      // 1d5: dload 28
      // 1d7: dload 28
      // 1d9: dmul
      // 1da: dadd
      // 1db: dload 30
      // 1dd: dload 30
      // 1df: dmul
      // 1e0: dadd
      // 1e1: invokestatic java/lang/Math.sqrt (D)D
      // 1e4: dstore 32
      // 1e6: dload 32
      // 1e8: iload 5
      // 1ea: ifeq 22e
      // 1ed: dconst_0
      // 1ee: dcmpl
      // 1ef: ifle 22c
      // 1f2: goto 1f9
      // 1f5: invokestatic m6w.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: aload 8
      // 1fb: getfield z96.o2v D
      // 1fe: dload 26
      // 200: dload 32
      // 202: ddiv
      // 203: ldc2_w 2.0
      // 206: dmul
      // 207: dadd
      // 208: dstore 10
      // 20a: aload 8
      // 20c: getfield z96.kfp D
      // 20f: dload 28
      // 211: dload 32
      // 213: ddiv
      // 214: ldc2_w 2.0
      // 217: dmul
      // 218: dadd
      // 219: dstore 12
      // 21b: aload 8
      // 21d: getfield z96.vbd D
      // 220: dload 30
      // 222: dload 32
      // 224: ddiv
      // 225: ldc2_w 2.0
      // 228: dmul
      // 229: dadd
      // 22a: dstore 14
      // 22c: dload 20
      // 22e: dstore 16
      // 230: aload 8
      // 232: getfield z96.rhh Lmlk;
      // 235: new net/minecraft/network/play/server/S29PacketSoundEffect
      // 238: dup
      // 239: aload 7
      // 23b: dload 10
      // 23d: dload 12
      // 23f: dload 14
      // 241: dload 16
      // 243: d2f
      // 244: dload 18
      // 246: d2f
      // 247: invokespecial net/minecraft/network/play/server/S29PacketSoundEffect.<init> (Ljava/lang/String;DDDFF)V
      // 24a: invokevirtual mlk.vnf (Lmz2;)V
      // 24d: aload 1
      // 24e: aload 0
      // 24f: sipush 24893
      // 252: ldc2_w 1116463451627821245
      // 255: lload 3
      // 256: lxor
      // 257: invokedynamic s (IJ)Ljava/lang/String; bsm=m6w.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: nop
      // 25d: bipush 2
      // 25e: anewarray 32
      // 261: dup
      // 262: bipush 0
      // 263: aload 7
      // 265: aastore
      // 266: dup
      // 267: bipush 1
      // 268: aload 8
      // 26a: invokevirtual z96.noc ()Ljava/lang/String;
      // 26d: aastore
      // 26e: invokestatic m6w.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 271: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 2
      // 06: arraylength
      // 07: bipush 2
      // 08: iload 4
      // 0a: ifeq 2b
      // 0d: if_icmpne 28
      // 10: goto 17
      // 13: invokestatic m6w.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: invokestatic vr1._0v ()Lvr1;
      // 1b: invokevirtual vr1.p14 ()[Ljava/lang/String;
      // 1e: invokestatic m6w.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 21: goto 5d
      // 24: invokestatic m6w.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 2
      // 29: arraylength
      // 2a: bipush 2
      // 2b: iload 4
      // 2d: ifeq 50
      // 30: if_icmple 5c
      // 33: goto 3a
      // 36: invokestatic m6w.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 2
      // 3b: iload 4
      // 3d: ifeq 54
      // 40: goto 47
      // 43: invokestatic m6w.a (Loov;)Loov;
      // 46: athrow
      // 47: arraylength
      // 48: bipush 5
      // 49: goto 50
      // 4c: invokestatic m6w.a (Loov;)Loov;
      // 4f: athrow
      // 50: if_icmpgt 5c
      // 53: aload 2
      // 54: bipush 2
      // 55: aload 3
      // 56: invokestatic m6w.aqt ([Ljava/lang/String;ILmew;)Ljava/util/List;
      // 59: goto 5d
      // 5c: aconst_null
      // 5d: areturn
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifeq 1c
      // 09: bipush 1
      // 0a: if_icmpne 1f
      // 0d: goto 14
      // 10: invokestatic m6w.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 1c
      // 18: invokestatic m6w.a (Loov;)Loov;
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 0
      // 20: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7687647389603899331L, 8364536738155711950L, MethodHandles.lookup().lookupClass()).a(85247414901575L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 125205581807387L;
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
      String var6 = "ïÀÌÂUz?QÛ¡Ò\u0016Ê\u0096ý\u0017¸Øo@þmO\u0087èqèíø\u001aïô8\\æqòy\u001céîåÙ$LR±\u0012öJÕ\u0010PA©Ú½îo\u007f\u0084ï\u0091\u009e(Ç¹5êgyP\u00871Ä\u0094`S(p[0Ï¶Pò\u0092¥a";
      int var8 = "ïÀÌÂUz?QÛ¡Ò\u0016Ê\u0096ý\u0017¸Øo@þmO\u0087èqèíø\u001aïô8\\æqòy\u001céîåÙ$LR±\u0012öJÕ\u0010PA©Ú½îo\u007f\u0084ï\u0091\u009e(Ç¹5êgyP\u00871Ä\u0094`S(p[0Ï¶Pò\u0092¥a"
         .length();
      char var5 = ' ';
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

                  var6 = "\u0012\u009d\u0001@\u009a\u0086¤«#m}Í¨©D\u0000\u008dèRr\u0080\u000e\u008eæjSÓý·Z\u008d\u008a\u0083I£G\u0080hé;sñÃ)\u009a@æ¦ã\u009a±±÷\u0018\u009eé8\u000bç¢\u0016u\u000e2Lþ\u00ad\u009d\rB×\"\\\u0092[ÌÀÉP\u0019)\u0005ë§yù\u008dÄyd²Ì\u008fZ\u0012\u001eFÑS×1²\u000eòFÌbºé©\u001fCO";
                  var8 = "\u0012\u009d\u0001@\u009a\u0086¤«#m}Í¨©D\u0000\u008dèRr\u0080\u000e\u008eæjSÓý·Z\u008d\u008a\u0083I£G\u0080hé;sñÃ)\u009a@æ¦ã\u009a±±÷\u0018\u009eé8\u000bç¢\u0016u\u000e2Lþ\u00ad\u009d\rB×\"\\\u0092[ÌÀÉP\u0019)\u0005ë§yù\u008dÄyd²Ì\u008fZ\u0012\u001eFÑS×1²\u000eòFÌbºé©\u001fCO"
                     .length();
                  var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21981;
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
            throw new RuntimeException("m6w", var10);
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
         throw new RuntimeException("m6w" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
