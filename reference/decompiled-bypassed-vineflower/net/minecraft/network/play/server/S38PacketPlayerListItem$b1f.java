package net.minecraft.network.play.server;

import com.mojang.authlib.GameProfile;
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

public class S38PacketPlayerListItem$b1f {
   private final int s79;
   private final h50$f05 pot;
   private final GameProfile clm;
   private final ekw ue0;
   public final S38PacketPlayerListItem f6y;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public S38PacketPlayerListItem$b1f(S38PacketPlayerListItem var1, GameProfile var2, int var3, h50$f05 var4, ekw var5) {
      this.f6y = var1;
      this.clm = var2;
      this.s79 = var3;
      this.pot = var4;
      this.ue0 = var5;
   }

   public GameProfile duk() {
      return this.clm;
   }

   public int pst() {
      return this.s79;
   }

   public h50$f05 izc() {
      return this.pot;
   }

   public ekw bek() {
      return this.ue0;
   }

   @Override
   public String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.a J
      // 03: ldc2_w 17753645969657
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0b: astore 3
      // 0c: aload 0
      // 0d: invokestatic com/google/common/base/Objects.toStringHelper (Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;
      // 10: sipush 4918
      // 13: ldc2_w 3826355951249525577
      // 16: lload 1
      // 17: lxor
      // 18: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: nop
      // 1e: aload 0
      // 1f: getfield net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.s79 I
      // 22: invokevirtual com/google/common/base/Objects$ToStringHelper.add (Ljava/lang/String;I)Lcom/google/common/base/Objects$ToStringHelper;
      // 25: sipush 31034
      // 28: ldc2_w 7712962275093799239
      // 2b: lload 1
      // 2c: lxor
      // 2d: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: nop
      // 33: aload 0
      // 34: getfield net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.pot Lh50$f05;
      // 37: invokevirtual com/google/common/base/Objects$ToStringHelper.add (Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;
      // 3a: sipush 4374
      // 3d: ldc2_w 2420359594180282728
      // 40: lload 1
      // 41: lxor
      // 42: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: aload 0
      // 49: getfield net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.clm Lcom/mojang/authlib/GameProfile;
      // 4c: invokevirtual com/google/common/base/Objects$ToStringHelper.add (Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;
      // 4f: sipush 6311
      // 52: ldc2_w 4639559405982482651
      // 55: lload 1
      // 56: lxor
      // 57: invokedynamic y (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: aload 0
      // 5e: getfield net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.ue0 Lekw;
      // 61: aload 3
      // 62: ifnull 7b
      // 65: ifnonnull 77
      // 68: goto 6f
      // 6b: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aconst_null
      // 70: goto 7e
      // 73: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.a (Loov;)Loov;
      // 76: athrow
      // 77: aload 0
      // 78: getfield net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.ue0 Lekw;
      // 7b: invokestatic ekw$szt.odg (Lekw;)Ljava/lang/String;
      // 7e: invokevirtual com/google/common/base/Objects$ToStringHelper.add (Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;
      // 81: invokevirtual com/google/common/base/Objects$ToStringHelper.toString ()Ljava/lang/String;
      // 84: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6137441282573620713L, 6979645543272605748L, MethodHandles.lookup().lookupClass()).a(264660933510889L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 77565094490502L;
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
      String var6 = "ÊI>\u0086§0ò¯¤ñ\n\u0095m\u0092\u0004®\u0010\u0095S¤\u0003\u0080\u0089MT\u001e¿Yáî÷2ý";
      int var8 = "ÊI>\u0086§0ò¯¤ñ\n\u0095m\u0092\u0004®\u0010\u0095S¤\u0003\u0080\u0089MT\u001e¿Yáî÷2ý".length();
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

                  var6 = "¨\u0018Ôr)«î¦\u001f¤¶Ù\u0001±Ø\u00ad¹uÍe;ÔtG/=üÝxHøô ©¨s\u008a¸ÂX\u0090¹ç\u0014ÖâÝO\u001f¢\u0081^\u001ckN\u0083\u0011UÊ¯~ÚJ\u0018\u0011";
                  var8 = "¨\u0018Ôr)«î¦\u001f¤¶Ù\u0001±Ø\u00ad¹uÍe;ÔtG/=üÝxHøô ©¨s\u008a¸ÂX\u0090¹ç\u0014ÖâÝO\u001f¢\u0081^\u001ckN\u0083\u0011UÊ¯~ÚJ\u0018\u0011"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26495;
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
            throw new RuntimeException("net/minecraft/network/play/server/S38PacketPlayerListItem$b1f", var10);
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
         throw new RuntimeException("net/minecraft/network/play/server/S38PacketPlayerListItem$b1f" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
