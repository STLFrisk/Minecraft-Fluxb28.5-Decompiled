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

public class j70 extends bc_ {
   private static final long a;
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public String xue() {
      long var1 = a ^ 102787520742371L;
      return b<"u">(7029, 7822518620857094751L ^ var1);
   }

   @Override
   public int bag() {
      return 2;
   }

   @Override
   public String fm7(e7r var1) {
      long var2 = a ^ 91819257765733L;
      return b<"u">(3676, 9221484719824378865L ^ var2);
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
      // 000: getstatic j70.a J
      // 003: ldc2_w 98404820629158
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: invokespecial j70.l1k ()Lef9;
      // 011: astore 6
      // 013: aload 2
      // 014: iload 5
      // 016: ifeq 02c
      // 019: arraylength
      // 01a: ifle 031
      // 01d: goto 024
      // 020: invokestatic j70.a (Loov;)Loov;
      // 023: athrow
      // 024: aload 2
      // 025: goto 02c
      // 028: invokestatic j70.a (Loov;)Loov;
      // 02b: athrow
      // 02c: bipush 0
      // 02d: aaload
      // 02e: goto 034
      // 031: ldc ""
      // 033: nop
      // 034: astore 7
      // 036: aload 2
      // 037: iload 5
      // 039: ifeq 050
      // 03c: arraylength
      // 03d: bipush 1
      // 03e: if_icmple 057
      // 041: goto 048
      // 044: invokestatic j70.a (Loov;)Loov;
      // 047: athrow
      // 048: aload 2
      // 049: goto 050
      // 04c: invokestatic j70.a (Loov;)Loov;
      // 04f: athrow
      // 050: bipush 1
      // 051: invokestatic j70.cai ([Ljava/lang/String;I)Ljava/lang/String;
      // 054: goto 05a
      // 057: ldc ""
      // 059: nop
      // 05a: astore 8
      // 05c: aload 2
      // 05d: arraylength
      // 05e: iload 5
      // 060: ifeq 143
      // 063: lookupswitch 195 2 0 29 1 62
      // 07c: invokestatic j70.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 1
      // 081: new tao
      // 084: dup
      // 085: aload 6
      // 087: invokevirtual ef9.pmi ()[Ljava/lang/String;
      // 08a: invokestatic j70.fgi ([Ljava/lang/Object;)Ljava/lang/String;
      // 08d: invokespecial tao.<init> (Ljava/lang/String;)V
      // 090: invokeinterface e7r.a0d (Lekw;)V 2
      // 095: iload 5
      // 097: ifne 1d6
      // 09a: goto 0a1
      // 09d: invokestatic j70.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 6
      // 0a3: aload 7
      // 0a5: iload 5
      // 0a7: ifeq 0e5
      // 0aa: goto 0b1
      // 0ad: invokestatic j70.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: invokevirtual ef9.xit (Ljava/lang/String;)Z
      // 0b4: ifne 0e1
      // 0b7: goto 0be
      // 0ba: invokestatic j70.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: new uvb
      // 0c1: dup
      // 0c2: sipush 24170
      // 0c5: ldc2_w 7280438787988972040
      // 0c8: lload 3
      // 0c9: lxor
      // 0ca: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: nop
      // 0d0: bipush 1
      // 0d1: anewarray 71
      // 0d4: dup
      // 0d5: bipush 0
      // 0d6: aload 7
      // 0d8: aastore
      // 0d9: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 0dc: athrow
      // 0dd: invokestatic j70.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 6
      // 0e3: aload 7
      // 0e5: invokevirtual ef9.x3n (Ljava/lang/String;)Ljava/lang/String;
      // 0e8: astore 9
      // 0ea: aload 1
      // 0eb: new tao
      // 0ee: dup
      // 0ef: aload 7
      // 0f1: invokespecial tao.<init> (Ljava/lang/String;)V
      // 0f4: sipush 8856
      // 0f7: ldc2_w 6942426213713092347
      // 0fa: lload 3
      // 0fb: lxor
      // 0fc: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: invokevirtual tao.lt8 (Ljava/lang/String;)Lekw;
      // 105: aload 9
      // 107: invokeinterface ekw.lt8 (Ljava/lang/String;)Lekw; 2
      // 10c: invokeinterface e7r.a0d (Lekw;)V 2
      // 111: aload 1
      // 112: getstatic n_k$pbp.t39 Ln_k$pbp;
      // 115: aload 6
      // 117: aload 7
      // 119: invokevirtual ef9.sh0 (Ljava/lang/String;)I
      // 11c: invokeinterface e7r.io9 (Ln_k$pbp;I)V 3
      // 121: iload 5
      // 123: ifne 1d6
      // 126: aload 6
      // 128: aload 7
      // 12a: iload 5
      // 12c: ifeq 1bc
      // 12f: goto 136
      // 132: invokestatic j70.a (Loov;)Loov;
      // 135: athrow
      // 136: getstatic ef9$nbw.blk Lef9$nbw;
      // 139: invokevirtual ef9.t_x (Ljava/lang/String;Lef9$nbw;)Z
      // 13c: goto 143
      // 13f: invokestatic j70.a (Loov;)Loov;
      // 142: athrow
      // 143: ifeq 1af
      // 146: sipush 22764
      // 149: ldc2_w 3224980387605767308
      // 14c: lload 3
      // 14d: lxor
      // 14e: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: nop
      // 154: aload 8
      // 156: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 159: iload 5
      // 15b: ifeq 189
      // 15e: goto 165
      // 161: invokestatic j70.a (Loov;)Loov;
      // 164: athrow
      // 165: ifne 1af
      // 168: goto 16f
      // 16b: invokestatic j70.a (Loov;)Loov;
      // 16e: athrow
      // 16f: sipush 19381
      // 172: ldc2_w 6216542301617584084
      // 175: lload 3
      // 176: lxor
      // 177: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: nop
      // 17d: aload 8
      // 17f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 182: goto 189
      // 185: invokestatic j70.a (Loov;)Loov;
      // 188: athrow
      // 189: ifne 1af
      // 18c: new uvb
      // 18f: dup
      // 190: sipush 17179
      // 193: ldc2_w 3764916972243582845
      // 196: lload 3
      // 197: lxor
      // 198: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: nop
      // 19e: bipush 1
      // 19f: anewarray 71
      // 1a2: dup
      // 1a3: bipush 0
      // 1a4: aload 8
      // 1a6: aastore
      // 1a7: invokespecial uvb.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 1aa: athrow
      // 1ab: invokestatic j70.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 6
      // 1b1: aload 7
      // 1b3: aload 8
      // 1b5: invokevirtual ef9.iqg (Ljava/lang/String;Ljava/lang/String;)V
      // 1b8: aload 6
      // 1ba: aload 7
      // 1bc: invokestatic j70.mz6 (Lef9;Ljava/lang/String;)V
      // 1bf: aload 1
      // 1c0: aload 0
      // 1c1: sipush 21871
      // 1c4: ldc2_w 3580502390846515467
      // 1c7: lload 3
      // 1c8: lxor
      // 1c9: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: nop
      // 1cf: bipush 0
      // 1d0: anewarray 71
      // 1d3: invokestatic j70.wxl (Le7r;Lon1;Ljava/lang/String;[Ljava/lang/Object;)V
      // 1d6: return
   }

   public static void mz6(ef9 param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic j70.a J
      // 03: ldc2_w 110220541650679
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: sipush 27090
      // 10: ldc2_w 2529836126958519791
      // 13: lload 2
      // 14: lxor
      // 15: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: aload 1
      // 1c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f: iload 4
      // 21: ifeq 3a
      // 24: ifeq 91
      // 27: goto 2e
      // 2a: invokestatic j70.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: aload 1
      // 30: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 33: goto 3a
      // 36: invokestatic j70.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 4
      // 3c: ifeq 4b
      // 3f: ifeq 4e
      // 42: goto 49
      // 45: invokestatic j70.a (Loov;)Loov;
      // 48: athrow
      // 49: bipush 22
      // 4b: goto 50
      // 4e: bipush 23
      // 50: i2b
      // 51: istore 5
      // 53: invokestatic vr1._0v ()Lvr1;
      // 56: invokevirtual vr1.wh3 ()Lwlx;
      // 59: invokevirtual wlx.tjx ()Ljava/util/List;
      // 5c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 61: astore 6
      // 63: aload 6
      // 65: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6a: ifeq 91
      // 6d: aload 6
      // 6f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 74: checkcast z96
      // 77: astore 7
      // 79: aload 7
      // 7b: getfield z96.rhh Lmlk;
      // 7e: new net/minecraft/network/play/server/S19PacketEntityStatus
      // 81: dup
      // 82: aload 7
      // 84: iload 5
      // 86: invokespecial net/minecraft/network/play/server/S19PacketEntityStatus.<init> (Li2h;B)V
      // 89: invokevirtual mlk.vnf (Lmz2;)V
      // 8c: iload 4
      // 8e: ifne 63
      // 91: return
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
      // 00: getstatic j70.a J
      // 03: ldc2_w 129231978097494
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 2
      // 0f: arraylength
      // 10: bipush 1
      // 11: iload 6
      // 13: ifeq 33
      // 16: if_icmpne 30
      // 19: goto 20
      // 1c: invokestatic j70.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 2
      // 21: aload 0
      // 22: invokespecial j70.l1k ()Lef9;
      // 25: invokevirtual ef9.pmi ()[Ljava/lang/String;
      // 28: invokestatic j70.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 2b: areturn
      // 2c: invokestatic j70.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 2
      // 31: arraylength
      // 32: bipush 2
      // 33: if_icmpne 7b
      // 36: aload 0
      // 37: invokespecial j70.l1k ()Lef9;
      // 3a: astore 7
      // 3c: aload 7
      // 3e: aload 2
      // 3f: bipush 0
      // 40: aaload
      // 41: getstatic ef9$nbw.blk Lef9$nbw;
      // 44: invokevirtual ef9.t_x (Ljava/lang/String;Lef9$nbw;)Z
      // 47: ifeq 7b
      // 4a: aload 2
      // 4b: bipush 2
      // 4c: anewarray 2
      // 4f: dup
      // 50: bipush 0
      // 51: sipush 30153
      // 54: ldc2_w 8886467851511927900
      // 57: lload 4
      // 59: lxor
      // 5a: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: nop
      // 60: aastore
      // 61: dup
      // 62: bipush 1
      // 63: sipush 23221
      // 66: ldc2_w 3006486497064434466
      // 69: lload 4
      // 6b: lxor
      // 6c: invokedynamic u (IJ)Ljava/lang/String; bsm=j70.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: nop
      // 72: aastore
      // 73: invokestatic j70.cqo ([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
      // 76: areturn
      // 77: invokestatic j70.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aconst_null
      // 7c: areturn
   }

   private ef9 l1k() {
      return vr1._0v().hrw(0).eir();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1413198432814329312L, -6849506403275964586L, MethodHandles.lookup().lookupClass()).a(107477399805381L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 29037734722112L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "\u0013\u0086\u008d¦\u0094\u0004å/Å\tÝ\\k*¸.k\u001eU\u009a\u0093B\r5O\u0007\u0003éu?\u000ez+¹\u0092\u00ad>\u001a©ùO¥gPd+-sÙ\u009e&\u0006vââêÚ6Ê1\u0001-ö\u001b\u0010\u008btDyÅjI\u0007\b\u008cæõmc÷¬0´\u001aõXË¥vªm\u001d°Ã\u001f\u0094þÓæ{¬Ö³\u0002©¬ö\u0010ÁÜIê\bp´\u001fì\u0019\t\u0099j\u0097,VR<ñKA%\u0010ö\\x\u0090ôpY\nô@ô7ìýt\u00950´\u009dävç3b¤[\u0018\nr\u008eÿ\u008c×Á\u001fom½E¿¢xµ\u008fò*\u0081G[¶)½¯\u0087\u0089\u0003\u0001U\u0098ÕclÉ\u0000]\u0010*§<i\u001d7õßIºD\u0005\u0003»@Ï\u0010D²\u0086Ïît\u0091Å\u009cQëÝªüí*\u0010¥\t\u0013q6%³t2·8¨´Pz\u0091(èA\u0010W\u00950Ò?\r±-=A{þ7eµ\u0018ØÙÜ=¿¨\u0081ÇBÓV>Û¼\u000e>$\u009c\u0086-\u000f";
      int var8 = "\u0013\u0086\u008d¦\u0094\u0004å/Å\tÝ\\k*¸.k\u001eU\u009a\u0093B\r5O\u0007\u0003éu?\u000ez+¹\u0092\u00ad>\u001a©ùO¥gPd+-sÙ\u009e&\u0006vââêÚ6Ê1\u0001-ö\u001b\u0010\u008btDyÅjI\u0007\b\u008cæõmc÷¬0´\u001aõXË¥vªm\u001d°Ã\u001f\u0094þÓæ{¬Ö³\u0002©¬ö\u0010ÁÜIê\bp´\u001fì\u0019\t\u0099j\u0097,VR<ñKA%\u0010ö\\x\u0090ôpY\nô@ô7ìýt\u00950´\u009dävç3b¤[\u0018\nr\u008eÿ\u008c×Á\u001fom½E¿¢xµ\u008fò*\u0081G[¶)½¯\u0087\u0089\u0003\u0001U\u0098ÕclÉ\u0000]\u0010*§<i\u001d7õßIºD\u0005\u0003»@Ï\u0010D²\u0086Ïît\u0091Å\u009cQëÝªüí*\u0010¥\t\u0013q6%³t2·8¨´Pz\u0091(èA\u0010W\u00950Ò?\r±-=A{þ7eµ\u0018ØÙÜ=¿¨\u0081ÇBÓV>Û¼\u000e>$\u009c\u0086-\u000f"
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
                     g = new String[11];
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

                  var6 = "¾[Òò°F\u00ad\né\u008d\u001böé\u0018\u0012?hå\u0002Q»G9[\u00983ÉÃÿ\u0083\u0018\u0085(â\u0012lÞÊ\by»ùä\u0000QA\u001f\u0086Ò¡ÿ\u0019\u0012Æ$\"ük¿M8L\u001b\u000bý\nïlÀMìY*";
                  var8 = "¾[Òò°F\u00ad\né\u008d\u001böé\u0018\u0012?hå\u0002Q»G9[\u00983ÉÃÿ\u0083\u0018\u0085(â\u0012lÞÊ\by»ùä\u0000QA\u001f\u0086Ò¡ÿ\u0019\u0012Æ$\"ük¿M8L\u001b\u000bý\nïlÀMìY*"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4152;
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
            throw new RuntimeException("j70", var10);
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
         throw new RuntimeException("j70" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
