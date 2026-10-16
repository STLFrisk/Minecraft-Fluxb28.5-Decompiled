import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class z83$6 implements Predicate {
   public final Map c96;
   private static final long a;
   private static final String b;

   public z83$6(Map var1) {
      this.c96 = var1;
   }

   public boolean xev(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic z83$6.a J
      // 003: ldc2_w 2420088601176
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic vr1._0v ()Lvr1;
      // 00b: bipush 0
      // 00c: invokevirtual vr1.hrw (I)Ldug;
      // 00f: invokevirtual dug.fgp ()Luci;
      // 012: astore 5
      // 014: invokestatic OpaquePredicate.b ()I
      // 017: aload 0
      // 018: getfield z83$6.c96 Ljava/util/Map;
      // 01b: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 020: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 025: astore 6
      // 027: istore 4
      // 029: aload 6
      // 02b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 030: ifeq 184
      // 033: aload 6
      // 035: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03a: checkcast java/util/Map$Entry
      // 03d: astore 7
      // 03f: aload 7
      // 041: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 046: checkcast java/lang/String
      // 049: astore 8
      // 04b: bipush 0
      // 04c: istore 9
      // 04e: aload 8
      // 050: getstatic z83$6.b Ljava/lang/String;
      // 053: nop
      // 054: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 057: iload 4
      // 059: ifeq 185
      // 05c: iload 4
      // 05e: ifeq 07e
      // 061: goto 068
      // 064: invokestatic z83$6.a (Loov;)Loov;
      // 067: athrow
      // 068: ifeq 0a7
      // 06b: goto 072
      // 06e: invokestatic z83$6.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 8
      // 074: invokevirtual java/lang/String.length ()I
      // 077: goto 07e
      // 07a: invokestatic z83$6.a (Loov;)Loov;
      // 07d: athrow
      // 07e: iload 4
      // 080: ifeq 096
      // 083: bipush 4
      // 084: if_icmple 0a7
      // 087: goto 08e
      // 08a: invokestatic z83$6.a (Loov;)Loov;
      // 08d: athrow
      // 08e: bipush 1
      // 08f: goto 096
      // 092: invokestatic z83$6.a (Loov;)Loov;
      // 095: athrow
      // 096: istore 9
      // 098: aload 8
      // 09a: bipush 0
      // 09b: aload 8
      // 09d: invokevirtual java/lang/String.length ()I
      // 0a0: bipush 4
      // 0a1: isub
      // 0a2: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0a5: astore 8
      // 0a7: aload 5
      // 0a9: aload 8
      // 0ab: invokevirtual uci.vp8 (Ljava/lang/String;)Lsa6;
      // 0ae: astore 10
      // 0b0: aload 10
      // 0b2: ifnonnull 0bb
      // 0b5: bipush 0
      // 0b6: ireturn
      // 0b7: invokestatic z83$6.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: iload 4
      // 0be: ifeq 0da
      // 0c1: instanceof z96
      // 0c4: ifeq 0d9
      // 0c7: goto 0ce
      // 0ca: invokestatic z83$6.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: invokevirtual EntityLivingBase.noc ()Ljava/lang/String;
      // 0d2: goto 0e0
      // 0d5: invokestatic z83$6.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 1
      // 0da: invokevirtual EntityLivingBase.b_q ()Ljava/util/UUID;
      // 0dd: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 0e0: astore 11
      // 0e2: aload 5
      // 0e4: aload 11
      // 0e6: aload 10
      // 0e8: iload 4
      // 0ea: ifeq 106
      // 0ed: invokevirtual uci.g4w (Ljava/lang/String;Lsa6;)Z
      // 0f0: ifne 100
      // 0f3: goto 0fa
      // 0f6: invokestatic z83$6.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: bipush 0
      // 0fb: ireturn
      // 0fc: invokestatic z83$6.a (Loov;)Loov;
      // 0ff: athrow
      // 100: aload 5
      // 102: aload 11
      // 104: aload 10
      // 106: invokevirtual uci.jte (Ljava/lang/String;Lsa6;)Lr11;
      // 109: astore 12
      // 10b: aload 12
      // 10d: invokevirtual r11.fge ()I
      // 110: istore 13
      // 112: iload 13
      // 114: aload 7
      // 116: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 11b: checkcast java/lang/Integer
      // 11e: invokevirtual java/lang/Integer.intValue ()I
      // 121: iload 4
      // 123: ifeq 169
      // 126: if_icmpge 14e
      // 129: goto 130
      // 12c: invokestatic z83$6.a (Loov;)Loov;
      // 12f: athrow
      // 130: iload 9
      // 132: iload 4
      // 134: ifeq 150
      // 137: goto 13e
      // 13a: invokestatic z83$6.a (Loov;)Loov;
      // 13d: athrow
      // 13e: ifeq 14e
      // 141: goto 148
      // 144: invokestatic z83$6.a (Loov;)Loov;
      // 147: athrow
      // 148: bipush 0
      // 149: ireturn
      // 14a: invokestatic z83$6.a (Loov;)Loov;
      // 14d: athrow
      // 14e: iload 13
      // 150: iload 4
      // 152: ifeq 16e
      // 155: aload 7
      // 157: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 15c: checkcast java/lang/Integer
      // 15f: invokevirtual java/lang/Integer.intValue ()I
      // 162: goto 169
      // 165: invokestatic z83$6.a (Loov;)Loov;
      // 168: athrow
      // 169: if_icmple 17f
      // 16c: iload 9
      // 16e: iload 4
      // 170: ifeq 17e
      // 173: ifne 17f
      // 176: goto 17d
      // 179: invokestatic z83$6.a (Loov;)Loov;
      // 17c: athrow
      // 17d: bipush 0
      // 17e: ireturn
      // 17f: iload 4
      // 181: ifne 029
      // 184: bipush 1
      // 185: ireturn
   }

   public boolean apply(Object var1) {
      return this.xev((EntityLivingBase)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6772351918722328364L, 407703163226797039L, MethodHandles.lookup().lookupClass()).a(255677452815578L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 118653487003468L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ªá(.WÞ#\u0000".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
