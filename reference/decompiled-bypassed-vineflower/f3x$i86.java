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

public class f3x$i86 extends ed7 {
   private final List eh1;
   public final f3x qss;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public f3x$i86(f3x param1, c05 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: putfield f3x$i86.qss Lf3x;
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: aload 2
      // 0a: aload 1
      // 0b: getfield f3x.dt7 I
      // 0e: aload 1
      // 0f: getfield f3x.o1e I
      // 12: bipush 32
      // 14: aload 1
      // 15: getfield f3x.o1e I
      // 18: bipush 64
      // 1a: isub
      // 1b: aload 1
      // 1c: invokestatic f3x.uw2 (Lf3x;)Lowt;
      // 1f: getfield owt.rr7 I
      // 22: bipush 4
      // 23: imul
      // 24: invokespecial ed7.<init> (Lc05;IIIII)V
      // 27: aload 0
      // 28: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 2b: putfield f3x$i86.eh1 Ljava/util/List;
      // 2e: istore 3
      // 2f: aload 0
      // 30: bipush 0
      // 31: invokevirtual f3x$i86.fai (Z)V
      // 34: getstatic y65._n6 Ljava/util/Map;
      // 37: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 3c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 41: astore 4
      // 43: aload 4
      // 45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a: ifeq ab
      // 4d: aload 4
      // 4f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54: checkcast y65$p2a
      // 57: astore 5
      // 59: aload 1
      // 5a: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 5d: aload 5
      // 5f: getfield y65$p2a.ke4 L_ss;
      // 62: invokevirtual ik0.zgq (L_ss;)I
      // 65: iload 3
      // 66: ifne a6
      // 69: ifgt 94
      // 6c: goto 73
      // 6f: invokestatic f3x$i86.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 1
      // 74: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 77: aload 5
      // 79: getfield y65$p2a.qsl L_ss;
      // 7c: invokevirtual ik0.zgq (L_ss;)I
      // 7f: iload 3
      // 80: ifne a6
      // 83: goto 8a
      // 86: invokestatic f3x$i86.a (Loov;)Loov;
      // 89: athrow
      // 8a: ifle a7
      // 8d: goto 94
      // 90: invokestatic f3x$i86.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: getfield f3x$i86.eh1 Ljava/util/List;
      // 98: aload 5
      // 9a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9f: goto a6
      // a2: invokestatic f3x$i86.a (Loov;)Loov;
      // a5: athrow
      // a6: pop
      // a7: iload 3
      // a8: ifeq 43
      // ab: return
   }

   @Override
   public int getSize() {
      return this.eh1.size();
   }

   @Override
   public void elementClicked(int var1, boolean var2, int var3, int var4) {
   }

   @Override
   public boolean isSelected(int var1) {
      return false;
   }

   @Override
   public int getContentHeight() {
      return this.getSize() * f3x.bu9(this.qss).rr7 * 4;
   }

   @Override
   public void drawBackground() {
      this.qss.xmz();
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
      // 000: getstatic f3x$i86.a J
      // 003: ldc2_w 138254569392532
      // 006: lxor
      // 007: lstore 7
      // 009: aload 0
      // 00a: getfield f3x$i86.eh1 Ljava/util/List;
      // 00d: iload 1
      // 00e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 013: checkcast y65$p2a
      // 016: astore 10
      // 018: new java/lang/StringBuilder
      // 01b: dup
      // 01c: invokespecial java/lang/StringBuilder.<init> ()V
      // 01f: sipush 9498
      // 022: ldc2_w 6380381563824679239
      // 025: lload 7
      // 027: lxor
      // 028: invokedynamic a (IJ)Ljava/lang/String; bsm=f3x$i86.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: nop
      // 02e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 031: aload 10
      // 033: getfield y65$p2a.hgl I
      // 036: invokestatic y65.jue (I)Ljava/lang/String;
      // 039: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03c: sipush 3586
      // 03f: ldc2_w 6621522393190531678
      // 042: lload 7
      // 044: lxor
      // 045: invokedynamic a (IJ)Ljava/lang/String; bsm=f3x$i86.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: nop
      // 04b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 051: bipush 0
      // 052: anewarray 161
      // 055: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 058: astore 11
      // 05a: invokestatic t9d.c ()I
      // 05d: aload 0
      // 05e: getfield f3x$i86.qss Lf3x;
      // 061: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 064: aload 10
      // 066: getfield y65$p2a.ke4 L_ss;
      // 069: invokevirtual ik0.zgq (L_ss;)I
      // 06c: istore 12
      // 06e: aload 0
      // 06f: getfield f3x$i86.qss Lf3x;
      // 072: invokestatic f3x.h5z (Lf3x;)Lik0;
      // 075: aload 10
      // 077: getfield y65$p2a.qsl L_ss;
      // 07a: invokevirtual ik0.zgq (L_ss;)I
      // 07d: istore 13
      // 07f: sipush 8181
      // 082: ldc2_w 5024603770801787822
      // 085: lload 7
      // 087: lxor
      // 088: invokedynamic a (IJ)Ljava/lang/String; bsm=f3x$i86.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: nop
      // 08e: bipush 2
      // 08f: anewarray 161
      // 092: dup
      // 093: bipush 0
      // 094: iload 12
      // 096: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 099: aastore
      // 09a: dup
      // 09b: bipush 1
      // 09c: aload 11
      // 09e: aastore
      // 09f: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0a2: astore 14
      // 0a4: sipush 1137
      // 0a7: ldc2_w 5209228998926567467
      // 0aa: lload 7
      // 0ac: lxor
      // 0ad: invokedynamic a (IJ)Ljava/lang/String; bsm=f3x$i86.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: bipush 2
      // 0b4: anewarray 161
      // 0b7: dup
      // 0b8: bipush 0
      // 0b9: aload 11
      // 0bb: aastore
      // 0bc: dup
      // 0bd: bipush 1
      // 0be: iload 13
      // 0c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c3: aastore
      // 0c4: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0c7: astore 15
      // 0c9: istore 9
      // 0cb: iload 12
      // 0cd: iload 9
      // 0cf: ifne 0fb
      // 0d2: ifne 0f9
      // 0d5: goto 0dc
      // 0d8: invokestatic f3x$i86.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: sipush 12564
      // 0df: ldc2_w 5640799878794296651
      // 0e2: lload 7
      // 0e4: lxor
      // 0e5: invokedynamic a (IJ)Ljava/lang/String; bsm=f3x$i86.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: nop
      // 0eb: bipush 1
      // 0ec: anewarray 161
      // 0ef: dup
      // 0f0: bipush 0
      // 0f1: aload 11
      // 0f3: aastore
      // 0f4: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0f7: astore 14
      // 0f9: iload 13
      // 0fb: ifne 11b
      // 0fe: sipush 11253
      // 101: ldc2_w 537479265052272555
      // 104: lload 7
      // 106: lxor
      // 107: invokedynamic a (IJ)Ljava/lang/String; bsm=f3x$i86.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: nop
      // 10d: bipush 1
      // 10e: anewarray 161
      // 111: dup
      // 112: bipush 0
      // 113: aload 11
      // 115: aastore
      // 116: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 119: astore 15
      // 11b: aload 0
      // 11c: getfield f3x$i86.qss Lf3x;
      // 11f: aload 0
      // 120: getfield f3x$i86.qss Lf3x;
      // 123: invokestatic f3x.z2i (Lf3x;)Lowt;
      // 126: aload 11
      // 128: iload 2
      // 129: bipush 2
      // 12a: iadd
      // 12b: bipush 10
      // 12d: isub
      // 12e: iload 3
      // 12f: bipush 1
      // 130: iadd
      // 131: ldc 16777215
      // 133: nop
      // 134: invokevirtual f3x.c_t (Lowt;Ljava/lang/String;III)V
      // 137: aload 0
      // 138: getfield f3x$i86.qss Lf3x;
      // 13b: aload 0
      // 13c: getfield f3x$i86.qss Lf3x;
      // 13f: invokestatic f3x.nqw (Lf3x;)Lowt;
      // 142: aload 14
      // 144: iload 2
      // 145: bipush 2
      // 146: iadd
      // 147: iload 3
      // 148: bipush 1
      // 149: iadd
      // 14a: aload 0
      // 14b: getfield f3x$i86.qss Lf3x;
      // 14e: invokestatic f3x.cq3 (Lf3x;)Lowt;
      // 151: getfield owt.rr7 I
      // 154: iadd
      // 155: iload 12
      // 157: iload 9
      // 159: ifne 172
      // 15c: ifne 170
      // 15f: goto 166
      // 162: invokestatic f3x$i86.a (Loov;)Loov;
      // 165: athrow
      // 166: ldc 6316128
      // 168: nop
      // 169: goto 173
      // 16c: invokestatic f3x$i86.a (Loov;)Loov;
      // 16f: athrow
      // 170: ldc 9474192
      // 172: nop
      // 173: invokevirtual f3x.c_t (Lowt;Ljava/lang/String;III)V
      // 176: aload 0
      // 177: getfield f3x$i86.qss Lf3x;
      // 17a: aload 0
      // 17b: getfield f3x$i86.qss Lf3x;
      // 17e: invokestatic f3x.gou (Lf3x;)Lowt;
      // 181: aload 15
      // 183: iload 2
      // 184: bipush 2
      // 185: iadd
      // 186: iload 3
      // 187: bipush 1
      // 188: iadd
      // 189: aload 0
      // 18a: getfield f3x$i86.qss Lf3x;
      // 18d: invokestatic f3x.z6d (Lf3x;)Lowt;
      // 190: getfield owt.rr7 I
      // 193: bipush 2
      // 194: imul
      // 195: iadd
      // 196: iload 13
      // 198: iload 9
      // 19a: ifne 1b3
      // 19d: ifne 1b1
      // 1a0: goto 1a7
      // 1a3: invokestatic f3x$i86.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: ldc 6316128
      // 1a9: nop
      // 1aa: goto 1b4
      // 1ad: invokestatic f3x$i86.a (Loov;)Loov;
      // 1b0: athrow
      // 1b1: ldc 9474192
      // 1b3: nop
      // 1b4: invokevirtual f3x.c_t (Lowt;Ljava/lang/String;III)V
      // 1b7: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-806076076715388394L, 7199503056909440585L, MethodHandles.lookup().lookupClass()).a(135595409046466L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 127422695374584L;
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
      String var6 = "\u0011oF\u0003©\u0098iÂÀ3\u0096Ä¿\u0014\u0094\u0016$D\u0012ÕFÇ¯\u008b\fòvíÓJ\u0091bÔ\u008cÃ!ð¦\u009bÚ\u0086\u009c¿\u0090Ë3:N(¢\u009d\u0093Ôf\u0086\u00937D~\u008a\u001b±ÃLçW\u0005xÁ\u008b-\u0090Yí\r .>:}`;dc\u0088\u0080\u009d\u0085N\u00104\u0003ð(Æ\u0089¶°\u0013\u008b/,)z¾Û\u0010G)C^¥}æj\u001b~°ì£\nèW";
      int var8 = "\u0011oF\u0003©\u0098iÂÀ3\u0096Ä¿\u0014\u0094\u0016$D\u0012ÕFÇ¯\u008b\fòvíÓJ\u0091bÔ\u008cÃ!ð¦\u009bÚ\u0086\u009c¿\u0090Ë3:N(¢\u009d\u0093Ôf\u0086\u00937D~\u008a\u001b±ÃLçW\u0005xÁ\u008b-\u0090Yí\r .>:}`;dc\u0088\u0080\u009d\u0085N\u00104\u0003ð(Æ\u0089¶°\u0013\u008b/,)z¾Û\u0010G)C^¥}æj\u001b~°ì£\nèW"
         .length();
      char var5 = '0';
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

                  var6 = "r+;äM]ã\u0000\u00111Nrp\u0006g\u00180\u0080\u0081ÙÃw\u0014ãRÓ\u0004/Ï\u008dN'\u009dõ£\u0090EÐÎ$(\u0099_oÀO®\f\u0088pÝï\u0013\u0081÷º=\u0093\u00036ñ\u0090´=´\u0004\u001e\u0097(«\u0090\u0003HE_\u001c\u009fÂa÷Ù";
                  var8 = "r+;äM]ã\u0000\u00111Nrp\u0006g\u00180\u0080\u0081ÙÃw\u0014ãRÓ\u0004/Ï\u008dN'\u009dõ£\u0090EÐÎ$(\u0099_oÀO®\f\u0088pÝï\u0013\u0081÷º=\u0093\u00036ñ\u0090´=´\u0004\u001e\u0097(«\u0090\u0003HE_\u001c\u009fÂa÷Ù"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15503;
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
            throw new RuntimeException("f3x$i86", var10);
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
         throw new RuntimeException("f3x$i86" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
