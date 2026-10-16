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
import net.minecraft.network.handshake.client.C00Handshake;

public class jou implements hp4 {
   private final vr1 cw9;
   private final hv0 gh8;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public jou(vr1 var1, hv0 var2) {
      this.cw9 = var1;
      this.gh8 = var2;
   }

   @Override
   public void cpq(C00Handshake param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic jou.a J
      // 003: ldc2_w 123842797319449
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: getstatic jou$1.cnu [I
      // 010: aload 1
      // 011: invokevirtual net/minecraft/network/handshake/client/C00Handshake.l4u ()La0t;
      // 014: invokevirtual a0t.ordinal ()I
      // 017: iaload
      // 018: iload 4
      // 01a: ifeq 051
      // 01d: lookupswitch 269 2 1 31 2 225
      // 038: invokestatic jou.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 03b: athrow
      // 03c: aload 0
      // 03d: getfield jou.gh8 Lhv0;
      // 040: getstatic a0t.le5 La0t;
      // 043: invokevirtual hv0.hlc (La0t;)V
      // 046: aload 1
      // 047: invokevirtual net/minecraft/network/handshake/client/C00Handshake.o3k ()I
      // 04a: goto 051
      // 04d: invokestatic jou.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 050: athrow
      // 051: bipush 47
      // 053: iload 4
      // 055: ifeq 0a4
      // 058: if_icmple 097
      // 05b: goto 062
      // 05e: invokestatic jou.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 061: athrow
      // 062: new tao
      // 065: dup
      // 066: sipush 14840
      // 069: ldc2_w 3797957461468250370
      // 06c: lload 2
      // 06d: lxor
      // 06e: invokedynamic v (IJ)Ljava/lang/String; bsm=jou.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: invokespecial tao.<init> (Ljava/lang/String;)V
      // 077: astore 5
      // 079: aload 0
      // 07a: getfield jou.gh8 Lhv0;
      // 07d: new net/minecraft/network/login/server/S00PacketDisconnect
      // 080: dup
      // 081: aload 5
      // 083: invokespecial net/minecraft/network/login/server/S00PacketDisconnect.<init> (Lekw;)V
      // 086: invokevirtual hv0.k7f (Lmz2;)V
      // 089: aload 0
      // 08a: getfield jou.gh8 Lhv0;
      // 08d: aload 5
      // 08f: invokevirtual hv0.g8c (Lekw;)V
      // 092: iload 4
      // 094: ifne 158
      // 097: aload 1
      // 098: invokevirtual net/minecraft/network/handshake/client/C00Handshake.o3k ()I
      // 09b: bipush 47
      // 09d: goto 0a4
      // 0a0: invokestatic jou.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0a3: athrow
      // 0a4: if_icmpge 0dc
      // 0a7: new tao
      // 0aa: dup
      // 0ab: sipush 5609
      // 0ae: ldc2_w 5052164328840867088
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic v (IJ)Ljava/lang/String; bsm=jou.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: invokespecial tao.<init> (Ljava/lang/String;)V
      // 0bc: astore 5
      // 0be: aload 0
      // 0bf: getfield jou.gh8 Lhv0;
      // 0c2: new net/minecraft/network/login/server/S00PacketDisconnect
      // 0c5: dup
      // 0c6: aload 5
      // 0c8: invokespecial net/minecraft/network/login/server/S00PacketDisconnect.<init> (Lekw;)V
      // 0cb: invokevirtual hv0.k7f (Lmz2;)V
      // 0ce: aload 0
      // 0cf: getfield jou.gh8 Lhv0;
      // 0d2: aload 5
      // 0d4: invokevirtual hv0.g8c (Lekw;)V
      // 0d7: iload 4
      // 0d9: ifne 158
      // 0dc: aload 0
      // 0dd: getfield jou.gh8 Lhv0;
      // 0e0: new x_b
      // 0e3: dup
      // 0e4: aload 0
      // 0e5: getfield jou.cw9 Lvr1;
      // 0e8: aload 0
      // 0e9: getfield jou.gh8 Lhv0;
      // 0ec: invokespecial x_b.<init> (Lvr1;Lhv0;)V
      // 0ef: invokevirtual hv0.kbj (Lyw3;)V
      // 0f2: iload 4
      // 0f4: ifne 158
      // 0f7: goto 0fe
      // 0fa: invokestatic jou.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: getfield jou.gh8 Lhv0;
      // 102: getstatic a0t.nil La0t;
      // 105: invokevirtual hv0.hlc (La0t;)V
      // 108: aload 0
      // 109: getfield jou.gh8 Lhv0;
      // 10c: new jm4
      // 10f: dup
      // 110: aload 0
      // 111: getfield jou.cw9 Lvr1;
      // 114: aload 0
      // 115: getfield jou.gh8 Lhv0;
      // 118: invokespecial jm4.<init> (Lvr1;Lhv0;)V
      // 11b: invokevirtual hv0.kbj (Lyw3;)V
      // 11e: iload 4
      // 120: ifne 158
      // 123: goto 12a
      // 126: invokestatic jou.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 129: athrow
      // 12a: new java/lang/UnsupportedOperationException
      // 12d: dup
      // 12e: new java/lang/StringBuilder
      // 131: dup
      // 132: invokespecial java/lang/StringBuilder.<init> ()V
      // 135: sipush 19607
      // 138: ldc2_w 5159979877353485420
      // 13b: lload 2
      // 13c: lxor
      // 13d: invokedynamic v (IJ)Ljava/lang/String; bsm=jou.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: nop
      // 143: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 146: aload 1
      // 147: invokevirtual net/minecraft/network/handshake/client/C00Handshake.l4u ()La0t;
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 150: invokespecial java/lang/UnsupportedOperationException.<init> (Ljava/lang/String;)V
      // 153: athrow
      // 154: invokestatic jou.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 157: athrow
      // 158: return
   }

   @Override
   public void az3(ekw var1) {
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3411082898747394422L, 8795717457746107218L, MethodHandles.lookup().lookupClass()).a(88081166996225L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100593839440068L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "Ì_\u009c©\u0018½\u0094ê½á \u007f\u001csÞ®\u0018êUâ\u0080\u001b¡Í'\u0007ñÓ\u0091'ó\u009c@\u007f\u0093\u008d\u0001òãóÅë5÷7\u0083&p\u0086D\t,Û¶ 8\u0005\b\u0094A\u008d\u009b\r!,a\u008a\u008f/c\u001dñsË¤C\u0088¶\u0096IÐü\u009fìÁÇ;PYÒüÝ\u0017bà¤\n@G9ÔJ\u0082\u0081Û¥Á»OË\u000228A]4\u0096ö$Z®\u001dK\u0016:\u0014)\u000eæ\u0016\u0010¬\u0082|×\\°â\u008d\u008d³£c\u0088\t\u0019`á¤\u008cI@Ã{²>\n\u0092\u008dBØa";
      int var8 = "Ì_\u009c©\u0018½\u0094ê½á \u007f\u001csÞ®\u0018êUâ\u0080\u001b¡Í'\u0007ñÓ\u0091'ó\u009c@\u007f\u0093\u008d\u0001òãóÅë5÷7\u0083&p\u0086D\t,Û¶ 8\u0005\b\u0094A\u008d\u009b\r!,a\u008a\u008f/c\u001dñsË¤C\u0088¶\u0096IÐü\u009fìÁÇ;PYÒüÝ\u0017bà¤\n@G9ÔJ\u0082\u0081Û¥Á»OË\u000228A]4\u0096ö$Z®\u001dK\u0016:\u0014)\u000eæ\u0016\u0010¬\u0082|×\\°â\u008d\u008d³£c\u0088\t\u0019`á¤\u008cI@Ã{²>\n\u0092\u008dBØa"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11945;
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
            throw new RuntimeException("jou", var10);
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
         throw new RuntimeException("jou" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
