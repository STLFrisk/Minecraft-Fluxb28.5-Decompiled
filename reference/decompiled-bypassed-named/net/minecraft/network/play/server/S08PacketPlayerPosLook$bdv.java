package net.minecraft.network.play.server;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum S08PacketPlayerPosLook$bdv {
   public static final S08PacketPlayerPosLook$bdv uws;
   public static final S08PacketPlayerPosLook$bdv yu5;
   public static final S08PacketPlayerPosLook$bdv qh1;
   public static final S08PacketPlayerPosLook$bdv a76;
   public static final S08PacketPlayerPosLook$bdv ybj;
   private int abo;
   private static final S08PacketPlayerPosLook$bdv[] mib;

   private S08PacketPlayerPosLook$bdv(int var3) {
      this.abo = var3;
   }

   private int jwi() {
      return 1 << this.abo;
   }

   private boolean kr0(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: iload 1
      // 05: aload 0
      // 06: invokespecial net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.jwi ()I
      // 09: iand
      // 0a: aload 2
      // 0b: ifnull 24
      // 0e: aload 0
      // 0f: invokespecial net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.jwi ()I
      // 12: if_icmpne 27
      // 15: goto 1c
      // 18: invokestatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.a (Loov;)Loov;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 24
      // 20: invokestatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.a (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: bipush 0
      // 28: ireturn
   }

   public static Set x1l(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv
      // 02: nop
      // 03: invokestatic java/util/EnumSet.noneOf (Ljava/lang/Class;)Ljava/util/EnumSet;
      // 06: astore 2
      // 07: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0a: invokestatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.values ()[Lnet/minecraft/network/play/server/S08PacketPlayerPosLook$bdv;
      // 0d: astore 3
      // 0e: astore 1
      // 0f: aload 3
      // 10: arraylength
      // 11: istore 4
      // 13: bipush 0
      // 14: istore 5
      // 16: iload 5
      // 18: iload 4
      // 1a: if_icmpge 4e
      // 1d: aload 3
      // 1e: iload 5
      // 20: aaload
      // 21: astore 6
      // 23: aload 1
      // 24: ifnull 4a
      // 27: aload 6
      // 29: iload 0
      // 2a: invokespecial net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.kr0 (I)Z
      // 2d: ifeq 47
      // 30: goto 37
      // 33: invokestatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 2
      // 38: aload 6
      // 3a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 3f: pop
      // 40: goto 47
      // 43: invokestatic net/minecraft/network/play/server/S08PacketPlayerPosLook$bdv.a (Loov;)Loov;
      // 46: athrow
      // 47: iinc 5 1
      // 4a: aload 1
      // 4b: ifnonnull 16
      // 4e: aload 2
      // 4f: areturn
   }

   public static int xz5(Set var0) {
      int var2 = 0;
      String var10000 = S14PacketEntity.b();
      Iterator var3 = var0.iterator();
      String var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            S08PacketPlayerPosLook$bdv var4 = (S08PacketPlayerPosLook$bdv)var3.next();
            var5 = var2 | var4.jwi();
            if (var1 == null) {
               break;
            }

            var2 = var5;
            if (var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(619465848107445502L, 5665984978181719456L, MethodHandles.lookup().lookupClass()).a(242715570560096L);
      // $VF: monitorexit
      long var10 = var10000 ^ 1093791375804L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "PU¡\u009a8híÎ\bR !·'$Z«";
      int var7 = "PU¡\u009a8híÎ\bR !·'$Z«".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = a(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            uws = new S08PacketPlayerPosLook$bdv(0);
            yu5 = new S08PacketPlayerPosLook$bdv(1);
            qh1 = new S08PacketPlayerPosLook$bdv(2);
            a76 = new S08PacketPlayerPosLook$bdv(3);
            ybj = new S08PacketPlayerPosLook$bdv(4);
            mib = new S08PacketPlayerPosLook$bdv[]{uws, yu5, qh1, a76, ybj};
            return;
         }

         var4 = var5.charAt(var3);
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
}
