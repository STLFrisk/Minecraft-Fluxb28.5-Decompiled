package net.minecraft.tileentity;

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
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileEntityFlowerPot extends pyk {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public TileEntityFlowerPot() {
   }

   public TileEntityFlowerPot(u7m var1, int var2) {
      this.yvm = var1;
      this.wf0 = var2;
   }

   @Override
   public void m2a(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityFlowerPot.a J
      // 03: ldc2_w 89624409484328
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial pyk.m2a (Lbdo;)V
      // 0d: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 10: getstatic u7m.p5w Lnga;
      // 13: aload 0
      // 14: getfield net/minecraft/tileentity/TileEntityFlowerPot.yvm Lu7m;
      // 17: invokevirtual nga.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a: checkcast gdz
      // 1d: astore 5
      // 1f: astore 4
      // 21: aload 1
      // 22: sipush 7444
      // 25: ldc2_w 1086868037592843846
      // 28: lload 2
      // 29: lxor
      // 2a: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFlowerPot.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: nop
      // 30: aload 5
      // 32: aload 4
      // 34: ifnonnull 4d
      // 37: ifnonnull 4b
      // 3a: goto 41
      // 3d: invokestatic net/minecraft/tileentity/TileEntityFlowerPot.a (Loov;)Loov;
      // 40: athrow
      // 41: ldc ""
      // 43: nop
      // 44: goto 50
      // 47: invokestatic net/minecraft/tileentity/TileEntityFlowerPot.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 5
      // 4d: invokevirtual gdz.toString ()Ljava/lang/String;
      // 50: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 53: aload 1
      // 54: sipush 6670
      // 57: ldc2_w 3933583947043733854
      // 5a: lload 2
      // 5b: lxor
      // 5c: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFlowerPot.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: aload 0
      // 63: getfield net/minecraft/tileentity/TileEntityFlowerPot.wf0 I
      // 66: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 69: return
   }

   @Override
   public void agl(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntityFlowerPot.a J
      // 03: ldc2_w 42043683522804
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 4
      // 0d: aload 0
      // 0e: aload 1
      // 0f: aload 4
      // 11: ifnonnull 63
      // 14: invokespecial pyk.agl (Lbdo;)V
      // 17: aload 1
      // 18: sipush 11311
      // 1b: ldc2_w 5791959586326270882
      // 1e: lload 2
      // 1f: lxor
      // 20: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFlowerPot.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: nop
      // 26: bipush 8
      // 28: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2b: ifeq 5a
      // 2e: goto 35
      // 31: invokestatic net/minecraft/tileentity/TileEntityFlowerPot.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: sipush 7444
      // 3a: ldc2_w 1086813395966485146
      // 3d: lload 2
      // 3e: lxor
      // 3f: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFlowerPot.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 48: invokestatic u7m.rya (Ljava/lang/String;)Lu7m;
      // 4b: putfield net/minecraft/tileentity/TileEntityFlowerPot.yvm Lu7m;
      // 4e: aload 4
      // 50: ifnull 7a
      // 53: goto 5a
      // 56: invokestatic net/minecraft/tileentity/TileEntityFlowerPot.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 1
      // 5c: goto 63
      // 5f: invokestatic net/minecraft/tileentity/TileEntityFlowerPot.a (Loov;)Loov;
      // 62: athrow
      // 63: sipush 7444
      // 66: ldc2_w 1086813395966485146
      // 69: lload 2
      // 6a: lxor
      // 6b: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFlowerPot.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: nop
      // 71: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 74: invokestatic u7m.ltr (I)Lu7m;
      // 77: putfield net/minecraft/tileentity/TileEntityFlowerPot.yvm Lu7m;
      // 7a: aload 0
      // 7b: aload 1
      // 7c: sipush 17904
      // 7f: ldc2_w 2866788597162982015
      // 82: lload 2
      // 83: lxor
      // 84: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntityFlowerPot.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: nop
      // 8a: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 8d: putfield net/minecraft/tileentity/TileEntityFlowerPot.wf0 I
      // 90: return
   }

   @Override
   public mz2 ptb() {
      long var1 = a ^ 34421291980299L;
      bdo var3 = new bdo();
      this.m2a(var3);
      var3.bkn(b<"p">(7444, 1086803978542660709L ^ var1));
      var3.iin(b<"p">(7444, 1086803978542660709L ^ var1), u7m._lo(this.yvm));
      return new S35PacketUpdateTileEntity(this.al2, 5, var3);
   }

   public void u29(u7m var1, int var2) {
      this.yvm = var1;
      this.wf0 = var2;
   }

   public u7m j59() {
      return this.yvm;
   }

   public int gz_() {
      return this.wf0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3219029978934467584L, -1184276335015891090L, MethodHandles.lookup().lookupClass()).a(69919034648576L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 104594761980415L;
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
      String var6 = "\u009a,Ï\u00042C»\u001d\u0010L\u0011Ó\u0088§=\u0080\u0010#EA,x\u0087@°\\\u0012\u0002(ù\u0017\u001eg";
      int var8 = "\u009a,Ï\u00042C»\u001d\u0010L\u0011Ó\u0088§=\u0080\u0010#EA,x\u0087@°\\\u0012\u0002(ù\u0017\u001eg".length();
      char var5 = 16;
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
                     b = var9;
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

                  var6 = "¨ñ<\u000bÆ1«\u0004bÌ ò\u007fÙÈq\u0010I\u008fâgp\u001fY%Wòâa= 1I";
                  var8 = "¨ñ<\u000bÆ1«\u0004bÌ ò\u007fÙÈq\u0010I\u008fâgp\u001fY%Wòâa= 1I".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2722;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntityFlowerPot", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntityFlowerPot" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
