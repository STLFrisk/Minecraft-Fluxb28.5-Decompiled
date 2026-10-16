import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class k4_ {
   public int d0z;
   public int nmt;
   public int u5t;
   public q6h naj = new q6h();
   public Queue zkp = new ConcurrentLinkedQueue();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @EventHandler
   public void niu(Event var1) {
      this.d0z = 0;
      this.nmt = 0;
      this.u5t = -1;
      this.zkp.clear();
   }

   @EventHandler
   public void m2j(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic k4_.a J
      // 003: ldc2_w 116448356875305
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield k4_.naj Lq6h;
      // 011: ldc2_w 1000
      // 014: invokevirtual q6h.bgq (J)Z
      // 017: iload 4
      // 019: ifeq 0e7
      // 01c: ifeq 0dd
      // 01f: goto 026
      // 022: invokestatic k4_.a (Loov;)Loov;
      // 025: athrow
      // 026: aload 0
      // 027: getfield k4_.d0z I
      // 02a: iload 4
      // 02c: ifeq 0e7
      // 02f: goto 036
      // 032: invokestatic k4_.a (Loov;)Loov;
      // 035: athrow
      // 036: ifle 0dd
      // 039: goto 040
      // 03c: invokestatic k4_.a (Loov;)Loov;
      // 03f: athrow
      // 040: sipush 14833
      // 043: ldc2_w 3594567145087870251
      // 046: lload 2
      // 047: lxor
      // 048: invokedynamic f (IJ)Ljava/lang/String; bsm=k4_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: nop
      // 04e: sipush 14245
      // 051: ldc2_w 6155298541458762620
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic f (IJ)Ljava/lang/String; bsm=k4_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: nop
      // 05c: getstatic jgv$vro.er9 Ljgv$vro;
      // 05f: invokestatic zet.gn0 (Ljava/lang/String;Ljava/lang/String;Ljgv$vro;)V
      // 062: bipush 1
      // 063: putstatic jr9.xev Z
      // 066: bipush 0
      // 067: istore 5
      // 069: aload 0
      // 06a: getfield k4_.zkp Ljava/util/Queue;
      // 06d: invokeinterface java/util/Queue.size ()I 1
      // 072: istore 6
      // 074: aload 0
      // 075: getfield k4_.zkp Ljava/util/Queue;
      // 078: invokeinterface java/util/Queue.peek ()Ljava/lang/Object; 1
      // 07d: ifnull 0d8
      // 080: iload 5
      // 082: iload 6
      // 084: bipush 1
      // 085: isub
      // 086: iload 4
      // 088: ifeq 10e
      // 08b: goto 092
      // 08e: invokestatic k4_.a (Loov;)Loov;
      // 091: athrow
      // 092: if_icmpge 0d8
      // 095: goto 09c
      // 098: invokestatic k4_.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield k4_.zkp Ljava/util/Queue;
      // 0a0: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 0a5: checkcast mz2
      // 0a8: astore 7
      // 0aa: iload 4
      // 0ac: ifeq 0d3
      // 0af: aload 7
      // 0b1: ifnonnull 0c2
      // 0b4: goto 0bb
      // 0b7: invokestatic k4_.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: goto 074
      // 0be: invokestatic k4_.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: iinc 5 1
      // 0c5: invokestatic Minecraft.vz1 ()Lc05;
      // 0c8: invokevirtual Minecraft.c02 ()Lp_k;
      // 0cb: invokevirtual p_k._m3 ()Lhv0;
      // 0ce: aload 7
      // 0d0: invokevirtual hv0.r92 (Lmz2;)V
      // 0d3: iload 4
      // 0d5: ifne 074
      // 0d8: aload 0
      // 0d9: bipush -1
      // 0da: putfield k4_.d0z I
      // 0dd: aload 0
      // 0de: getfield k4_.naj Lq6h;
      // 0e1: ldc2_w 1000
      // 0e4: invokevirtual q6h.bgq (J)Z
      // 0e7: iload 4
      // 0e9: ifeq 12a
      // 0ec: ifeq 123
      // 0ef: goto 0f6
      // 0f2: invokestatic k4_.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: getfield k4_.d0z I
      // 0fa: iload 4
      // 0fc: ifeq 12a
      // 0ff: goto 106
      // 102: invokestatic k4_.a (Loov;)Loov;
      // 105: athrow
      // 106: bipush -1
      // 107: goto 10e
      // 10a: invokestatic k4_.a (Loov;)Loov;
      // 10d: athrow
      // 10e: if_icmpne 123
      // 111: aload 0
      // 112: bipush -2
      // 114: putfield k4_.d0z I
      // 117: aload 0
      // 118: bipush 1
      // 119: putfield k4_.u5t I
      // 11c: goto 123
      // 11f: invokestatic k4_.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 1
      // 124: invokevirtual ihr.bbi ()Lmz2;
      // 127: instanceof net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 12a: ifeq 139
      // 12d: aload 0
      // 12e: aload 1
      // 12f: invokevirtual k4_.og2 (Lihr;)V
      // 132: goto 139
      // 135: invokestatic k4_.a (Loov;)Loov;
      // 138: athrow
      // 139: return
   }

   public void og2(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic k4_.a J
      // 003: ldc2_w 35495744874883
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokevirtual ihr.bbi ()Lmz2;
      // 011: checkcast net/minecraft/network/play/client/C0FPacketConfirmTransaction
      // 014: dup
      // 015: astore 5
      // 017: invokevirtual net/minecraft/network/play/client/C0FPacketConfirmTransaction.x7y ()S
      // 01a: iload 4
      // 01c: ifeq 034
      // 01f: ifge 1de
      // 022: goto 029
      // 025: invokestatic k4_.a (Loov;)Loov;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield k4_.d0z I
      // 02d: goto 034
      // 030: invokestatic k4_.a (Loov;)Loov;
      // 033: athrow
      // 034: iload 4
      // 036: ifeq 075
      // 039: bipush -2
      // 03b: if_icmpne 071
      // 03e: goto 045
      // 041: invokestatic k4_.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: getfield k4_.u5t I
      // 049: iload 4
      // 04b: ifeq 075
      // 04e: goto 055
      // 051: invokestatic k4_.a (Loov;)Loov;
      // 054: athrow
      // 055: bipush -1
      // 056: if_icmpne 071
      // 059: goto 060
      // 05c: invokestatic k4_.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 0
      // 061: invokevirtual k4_.yse ()V
      // 064: aload 0
      // 065: bipush -3
      // 067: putfield k4_.d0z I
      // 06a: goto 071
      // 06d: invokestatic k4_.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 0
      // 072: getfield k4_.d0z I
      // 075: iload 4
      // 077: ifeq 140
      // 07a: iflt 11e
      // 07d: goto 084
      // 080: invokestatic k4_.a (Loov;)Loov;
      // 083: athrow
      // 084: aload 0
      // 085: getfield k4_.d0z I
      // 088: iload 4
      // 08a: ifeq 0e5
      // 08d: goto 094
      // 090: invokestatic k4_.a (Loov;)Loov;
      // 093: athrow
      // 094: ifne 0c4
      // 097: goto 09e
      // 09a: invokestatic k4_.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 0
      // 09f: getfield k4_.u5t I
      // 0a2: iload 4
      // 0a4: ifeq 0e5
      // 0a7: goto 0ae
      // 0aa: invokestatic k4_.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: bipush -1
      // 0af: if_icmpne 0c4
      // 0b2: goto 0b9
      // 0b5: invokestatic k4_.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: invokevirtual k4_.yse ()V
      // 0bd: goto 0c4
      // 0c0: invokestatic k4_.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 1
      // 0c5: bipush 1
      // 0c6: invokevirtual ihr.wxi (Z)V
      // 0c9: aload 0
      // 0ca: getfield k4_.zkp Ljava/util/Queue;
      // 0cd: aload 5
      // 0cf: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 0d4: pop
      // 0d5: aload 0
      // 0d6: iload 4
      // 0d8: ifeq 110
      // 0db: getfield k4_.d0z I
      // 0de: goto 0e5
      // 0e1: invokestatic k4_.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: ifeq 108
      // 0e8: aload 0
      // 0e9: getfield k4_.naj Lq6h;
      // 0ec: iload 4
      // 0ee: ifeq 1db
      // 0f1: goto 0f8
      // 0f4: invokestatic k4_.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: ldc2_w 5
      // 0fb: invokevirtual q6h.bgq (J)Z
      // 0fe: ifne 1d7
      // 101: goto 108
      // 104: invokestatic k4_.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: goto 110
      // 10c: invokestatic k4_.a (Loov;)Loov;
      // 10f: athrow
      // 110: dup
      // 111: getfield k4_.d0z I
      // 114: bipush 1
      // 115: iadd
      // 116: putfield k4_.d0z I
      // 119: iload 4
      // 11b: ifne 1d7
      // 11e: aload 1
      // 11f: bipush 1
      // 120: invokevirtual ihr.wxi (Z)V
      // 123: aload 0
      // 124: iload 4
      // 126: ifeq 1cf
      // 129: goto 130
      // 12c: invokestatic k4_.a (Loov;)Loov;
      // 12f: athrow
      // 130: getfield k4_.naj Lq6h;
      // 133: ldc2_w 1000
      // 136: invokevirtual q6h.bgq (J)Z
      // 139: goto 140
      // 13c: invokestatic k4_.a (Loov;)Loov;
      // 13f: athrow
      // 140: ifeq 1ce
      // 143: aload 0
      // 144: iload 4
      // 146: ifeq 1cf
      // 149: goto 150
      // 14c: invokestatic k4_.a (Loov;)Loov;
      // 14f: athrow
      // 150: getfield k4_.u5t I
      // 153: bipush 3
      // 154: if_icmpeq 1ce
      // 157: goto 15e
      // 15a: invokestatic k4_.a (Loov;)Loov;
      // 15d: athrow
      // 15e: new java/lang/StringBuilder
      // 161: dup
      // 162: invokespecial java/lang/StringBuilder.<init> ()V
      // 165: sipush 31034
      // 168: ldc2_w 8990333840760926283
      // 16b: lload 2
      // 16c: lxor
      // 16d: invokedynamic f (IJ)Ljava/lang/String; bsm=k4_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: nop
      // 173: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 176: aload 5
      // 178: invokevirtual net/minecraft/network/play/client/C0FPacketConfirmTransaction.x7y ()S
      // 17b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 17e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 181: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 184: aload 0
      // 185: getfield k4_.naj Lq6h;
      // 188: invokevirtual q6h.u1k ()V
      // 18b: aload 0
      // 18c: iload 4
      // 18e: ifeq 1c5
      // 191: goto 198
      // 194: invokestatic k4_.a (Loov;)Loov;
      // 197: athrow
      // 198: getfield k4_.u5t I
      // 19b: bipush 2
      // 19c: if_icmpne 1c4
      // 19f: sipush 1128
      // 1a2: ldc2_w 1183534121069481242
      // 1a5: lload 2
      // 1a6: lxor
      // 1a7: invokedynamic f (IJ)Ljava/lang/String; bsm=k4_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: nop
      // 1ad: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 1b0: aload 0
      // 1b1: invokevirtual k4_.yse ()V
      // 1b4: aload 0
      // 1b5: getfield k4_.zkp Ljava/util/Queue;
      // 1b8: invokeinterface java/util/Queue.clear ()V 1
      // 1bd: goto 1c4
      // 1c0: invokestatic k4_.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: dup
      // 1c6: getfield k4_.u5t I
      // 1c9: bipush 1
      // 1ca: iadd
      // 1cb: putfield k4_.u5t I
      // 1ce: aload 0
      // 1cf: aload 5
      // 1d1: invokevirtual net/minecraft/network/play/client/C0FPacketConfirmTransaction.x7y ()S
      // 1d4: putfield k4_.nmt I
      // 1d7: aload 0
      // 1d8: getfield k4_.naj Lq6h;
      // 1db: invokevirtual q6h.u1k ()V
      // 1de: return
   }

   public void yse() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield k4_.zkp Ljava/util/Queue;
      // 08: invokeinterface java/util/Queue.peek ()Ljava/lang/Object; 1
      // 0d: ifnull 4f
      // 10: aload 0
      // 11: getfield k4_.zkp Ljava/util/Queue;
      // 14: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 19: checkcast mz2
      // 1c: astore 2
      // 1d: iload 1
      // 1e: ifne 58
      // 21: iload 1
      // 22: ifne 4b
      // 25: goto 2c
      // 28: invokestatic k4_.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 2
      // 2d: ifnonnull 3e
      // 30: goto 37
      // 33: invokestatic k4_.a (Loov;)Loov;
      // 36: athrow
      // 37: goto 04
      // 3a: invokestatic k4_.a (Loov;)Loov;
      // 3d: athrow
      // 3e: invokestatic Minecraft.vz1 ()Lc05;
      // 41: invokevirtual Minecraft.c02 ()Lp_k;
      // 44: invokevirtual p_k._m3 ()Lhv0;
      // 47: aload 2
      // 48: invokevirtual hv0.r92 (Lmz2;)V
      // 4b: iload 1
      // 4c: ifeq 04
      // 4f: aload 0
      // 50: getfield k4_.zkp Ljava/util/Queue;
      // 53: invokeinterface java/util/Queue.clear ()V 1
      // 58: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3761229870748342344L, 7519227929010102622L, MethodHandles.lookup().lookupClass()).a(162967747664902L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 120328308640063L;
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
      String var6 = "ì*\u0086Q6)»G@ôøË%sÞCAëkN\u0014\u000e\u000fKÚ±\u0006ôµ¯ã\u0017¼RÄò<åÉc(^ÁOuô\u000f\u0003´¨rïDx;4\u0082xT\u001cNªRm\u0015\u000bù·¿ÛÊ¿Àì\u0095©g¿§,\u009e";
      int var8 = "ì*\u0086Q6)»G@ôøË%sÞCAëkN\u0014\u000e\u000fKÚ±\u0006ôµ¯ã\u0017¼RÄò<åÉc(^ÁOuô\u000f\u0003´¨rïDx;4\u0082xT\u001cNªRm\u0015\u000bù·¿ÛÊ¿Àì\u0095©g¿§,\u009e"
         .length();
      char var5 = '(';
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
                     c = new String[4];
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

                  var6 = "çNìù¨ÓÅì \u008fË¿±Ä02»`\u0087}á\u0084\u009f\u001ab\u0097\u0006à\u0096N\u008bÑ\u0006\u0000\u0006Yÿ\u0014R~_\u0006\u00ad|C¶\u0002µ \t´ª\u0003\u00adI\u0016\rÇ\u00865xÕ\u0011\u001fõ7\u0003Ü\tGó'\u0016dO\u00898|J\u0083ê";
                  var8 = "çNìù¨ÓÅì \u008fË¿±Ä02»`\u0087}á\u0084\u009f\u001ab\u0097\u0006à\u0096N\u008bÑ\u0006\u0000\u0006Yÿ\u0014R~_\u0006\u00ad|C¶\u0002µ \t´ª\u0003\u00adI\u0016\rÇ\u00865xÕ\u0011\u001fõ7\u0003Ü\tGó'\u0016dO\u00898|J\u0083ê"
                     .length();
                  var5 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9695;
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
            throw new RuntimeException("k4_", var10);
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
         throw new RuntimeException("k4_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
