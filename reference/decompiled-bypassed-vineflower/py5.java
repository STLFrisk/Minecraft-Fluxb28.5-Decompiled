import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class py5 extends ar7 {
   private static final long a;
   private static final String f;

   public py5() {
      long var1 = a ^ 33754450074312L;
      super(f, _aj.i9j, false, new j1s[0]);
   }

   @jev
   public void p6h(wbh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual wbh.nlg ()Lmz2;
      // 08: iload 2
      // 09: ifeq 24
      // 0c: instanceof net/minecraft/network/play/server/S02PacketChat
      // 0f: ifeq 69
      // 12: goto 19
      // 15: invokestatic py5.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual wbh.nlg ()Lmz2;
      // 1d: goto 24
      // 20: invokestatic py5.a (Loov;)Loov;
      // 23: athrow
      // 24: checkcast net/minecraft/network/play/server/S02PacketChat
      // 27: astore 3
      // 28: aload 3
      // 29: iload 2
      // 2a: ifeq 4d
      // 2d: invokevirtual net/minecraft/network/play/server/S02PacketChat.m4c ()Lekw;
      // 30: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 35: ldc "\u061c"
      // 37: nop
      // 38: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 3b: ifeq 69
      // 3e: goto 45
      // 41: invokestatic py5.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 3
      // 46: goto 4d
      // 49: invokestatic py5.a (Loov;)Loov;
      // 4c: athrow
      // 4d: new tao
      // 50: dup
      // 51: aload 3
      // 52: invokevirtual net/minecraft/network/play/server/S02PacketChat.m4c ()Lekw;
      // 55: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 5a: ldc "\u061c"
      // 5c: nop
      // 5d: ldc ""
      // 5f: nop
      // 60: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 63: invokespecial tao.<init> (Ljava/lang/String;)V
      // 66: putfield net/minecraft/network/play/server/S02PacketChat.yiu Lekw;
      // 69: return
   }

   @jev
   public void we4(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual ihr.bbi ()Lmz2;
      // 08: iload 2
      // 09: ifne 24
      // 0c: instanceof net/minecraft/network/play/client/C01PacketChatMessage
      // 0f: ifeq c0
      // 12: goto 19
      // 15: invokestatic py5.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual ihr.bbi ()Lmz2;
      // 1d: goto 24
      // 20: invokestatic py5.a (Loov;)Loov;
      // 23: athrow
      // 24: checkcast net/minecraft/network/play/client/C01PacketChatMessage
      // 27: astore 3
      // 28: iload 2
      // 29: ifne 4a
      // 2c: aload 3
      // 2d: invokevirtual net/minecraft/network/play/client/C01PacketChatMessage.pw6 ()Ljava/lang/String;
      // 30: ldc "/"
      // 32: nop
      // 33: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 36: ifeq 45
      // 39: goto 40
      // 3c: invokestatic py5.a (Loov;)Loov;
      // 3f: athrow
      // 40: return
      // 41: invokestatic py5.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 1
      // 46: bipush 1
      // 47: invokevirtual ihr.wxi (Z)V
      // 4a: new java/lang/StringBuilder
      // 4d: dup
      // 4e: invokespecial java/lang/StringBuilder.<init> ()V
      // 51: astore 4
      // 53: aload 3
      // 54: invokevirtual net/minecraft/network/play/client/C01PacketChatMessage.pw6 ()Ljava/lang/String;
      // 57: invokevirtual java/lang/String.toCharArray ()[C
      // 5a: astore 5
      // 5c: aload 5
      // 5e: arraylength
      // 5f: istore 6
      // 61: bipush 0
      // 62: istore 7
      // 64: iload 7
      // 66: iload 6
      // 68: if_icmpge 9f
      // 6b: aload 5
      // 6d: iload 7
      // 6f: caload
      // 70: istore 8
      // 72: aload 4
      // 74: new java/lang/StringBuilder
      // 77: dup
      // 78: invokespecial java/lang/StringBuilder.<init> ()V
      // 7b: iload 8
      // 7d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 80: ldc "\u061c"
      // 82: nop
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: pop
      // 8d: iinc 7 1
      // 90: iload 2
      // 91: ifne c0
      // 94: iload 2
      // 95: ifeq 64
      // 98: goto 9f
      // 9b: invokestatic py5.a (Loov;)Loov;
      // 9e: athrow
      // 9f: getstatic py5.ek1 Lc05;
      // a2: invokevirtual c05.c02 ()Lp_k;
      // a5: invokevirtual p_k._m3 ()Lhv0;
      // a8: new net/minecraft/network/play/client/C01PacketChatMessage
      // ab: dup
      // ac: aload 4
      // ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b1: ldc "%"
      // b3: nop
      // b4: ldc ""
      // b6: nop
      // b7: invokevirtual java/lang/String.replaceFirst (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // ba: invokespecial net/minecraft/network/play/client/C01PacketChatMessage.<init> (Ljava/lang/String;)V
      // bd: invokevirtual hv0.r92 (Lmz2;)V
      // c0: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2675373591186159759L, -688506881289406607L, MethodHandles.lookup().lookupClass()).a(148488509623438L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 133977077397667L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¢·ªkV&\u009b6ÑÍ\u000bÙ \u0006Ôw".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
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
}
