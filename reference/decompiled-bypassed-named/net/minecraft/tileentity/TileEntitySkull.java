package net.minecraft.tileentity;

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
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileEntitySkull extends pyk {
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void m2a(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntitySkull.a J
      // 03: ldc2_w 72748767246284
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokespecial pyk.m2a (Lbdo;)V
      // 0d: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 10: aload 1
      // 11: sipush 32740
      // 14: ldc2_w 8655466496440300720
      // 17: lload 2
      // 18: lxor
      // 19: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: nop
      // 1f: aload 0
      // 20: getfield net/minecraft/tileentity/TileEntitySkull.xl9 I
      // 23: sipush 255
      // 26: iand
      // 27: i2b
      // 28: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 2b: astore 4
      // 2d: aload 1
      // 2e: aload 4
      // 30: ifnonnull 69
      // 33: sipush 7073
      // 36: ldc2_w 4247869360711536880
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: nop
      // 41: aload 0
      // 42: getfield net/minecraft/tileentity/TileEntitySkull.lqe I
      // 45: sipush 255
      // 48: iand
      // 49: i2b
      // 4a: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 4d: aload 0
      // 4e: getfield net/minecraft/tileentity/TileEntitySkull.utx Lcom/mojang/authlib/GameProfile;
      // 51: ifnull 89
      // 54: goto 5b
      // 57: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 5a: athrow
      // 5b: new bdo
      // 5e: dup
      // 5f: invokespecial bdo.<init> ()V
      // 62: goto 69
      // 65: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 68: athrow
      // 69: astore 5
      // 6b: aload 5
      // 6d: aload 0
      // 6e: getfield net/minecraft/tileentity/TileEntitySkull.utx Lcom/mojang/authlib/GameProfile;
      // 71: invokestatic j44.f9e (Lbdo;Lcom/mojang/authlib/GameProfile;)Lbdo;
      // 74: pop
      // 75: aload 1
      // 76: sipush 1787
      // 79: ldc2_w 1330899649046842793
      // 7c: lload 2
      // 7d: lxor
      // 7e: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: nop
      // 84: aload 5
      // 86: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 89: return
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
      // 000: getstatic net/minecraft/tileentity/TileEntitySkull.a J
      // 003: ldc2_w 58911476978448
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial pyk.agl (Lbdo;)V
      // 00d: aload 0
      // 00e: aload 1
      // 00f: sipush 21844
      // 012: ldc2_w 5723274799706585816
      // 015: lload 2
      // 016: lxor
      // 017: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01c: nop
      // 01d: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 020: putfield net/minecraft/tileentity/TileEntitySkull.xl9 I
      // 023: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 026: aload 0
      // 027: aload 1
      // 028: sipush 30882
      // 02b: ldc2_w 5892921348284553003
      // 02e: lload 2
      // 02f: lxor
      // 030: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 039: putfield net/minecraft/tileentity/TileEntitySkull.lqe I
      // 03c: astore 4
      // 03e: aload 0
      // 03f: getfield net/minecraft/tileentity/TileEntitySkull.xl9 I
      // 042: aload 4
      // 044: ifnonnull 06d
      // 047: bipush 3
      // 048: if_icmpne 116
      // 04b: goto 052
      // 04e: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 051: athrow
      // 052: aload 1
      // 053: sipush 14869
      // 056: ldc2_w 8077885142938867098
      // 059: lload 2
      // 05a: lxor
      // 05b: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: bipush 10
      // 063: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 066: goto 06d
      // 069: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 06c: athrow
      // 06d: aload 4
      // 06f: ifnonnull 0c8
      // 072: ifeq 0a1
      // 075: goto 07c
      // 078: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: aload 1
      // 07e: sipush 14869
      // 081: ldc2_w 8077885142938867098
      // 084: lload 2
      // 085: lxor
      // 086: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: nop
      // 08c: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 08f: invokestatic j44.j31 (Lbdo;)Lcom/mojang/authlib/GameProfile;
      // 092: putfield net/minecraft/tileentity/TileEntitySkull.utx Lcom/mojang/authlib/GameProfile;
      // 095: aload 4
      // 097: ifnull 116
      // 09a: goto 0a1
      // 09d: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 1
      // 0a2: sipush 17433
      // 0a5: ldc2_w 2954282628951485330
      // 0a8: lload 2
      // 0a9: lxor
      // 0aa: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: nop
      // 0b0: aload 4
      // 0b2: ifnonnull 0e1
      // 0b5: goto 0bc
      // 0b8: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: bipush 8
      // 0be: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0c1: goto 0c8
      // 0c4: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: ifeq 116
      // 0cb: aload 1
      // 0cc: sipush 32504
      // 0cf: ldc2_w 648569025377309048
      // 0d2: lload 2
      // 0d3: lxor
      // 0d4: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: goto 0e1
      // 0dd: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0e4: astore 5
      // 0e6: aload 4
      // 0e8: ifnonnull 112
      // 0eb: aload 5
      // 0ed: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 0f0: ifne 116
      // 0f3: goto 0fa
      // 0f6: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: new com/mojang/authlib/GameProfile
      // 0fe: dup
      // 0ff: aconst_null
      // 100: checkcast java/util/UUID
      // 103: aload 5
      // 105: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 108: putfield net/minecraft/tileentity/TileEntitySkull.utx Lcom/mojang/authlib/GameProfile;
      // 10b: goto 112
      // 10e: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: invokespecial net/minecraft/tileentity/TileEntitySkull.ttz ()V
      // 116: return
   }

   public GameProfile j34() {
      return this.utx;
   }

   @Override
   public mz2 ptb() {
      bdo var1 = new bdo();
      this.m2a(var1);
      return new S35PacketUpdateTileEntity(this.al2, 4, var1);
   }

   public void sjx(int var1) {
      this.xl9 = var1;
      this.utx = null;
   }

   public void e5x(GameProfile var1) {
      this.xl9 = 3;
      this.utx = var1;
      this.ttz();
   }

   private void ttz() {
      this.utx = cms(this.utx);
      this.r5t();
   }

   public static GameProfile cms(GameProfile param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/tileentity/TileEntitySkull.a J
      // 03: ldc2_w 61749234030710
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic net/minecraft/tileentity/TileEntityBeacon$yv7.b ()[I
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 3
      // 0e: ifnonnull f0
      // 11: ifnull ef
      // 14: goto 1b
      // 17: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 3
      // 1d: ifnonnull f0
      // 20: goto 27
      // 23: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 26: athrow
      // 27: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 2a: invokestatic jfy.hez (Ljava/lang/String;)Z
      // 2d: ifne ef
      // 30: goto 37
      // 33: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: invokevirtual com/mojang/authlib/GameProfile.isComplete ()Z
      // 3b: aload 3
      // 3c: ifnonnull 77
      // 3f: goto 46
      // 42: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 45: athrow
      // 46: ifeq 7c
      // 49: goto 50
      // 4c: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 3
      // 52: ifnonnull 7b
      // 55: goto 5c
      // 58: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 5b: athrow
      // 5c: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 5f: sipush 24579
      // 62: ldc2_w 642047472199353572
      // 65: lload 1
      // 66: lxor
      // 67: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: nop
      // 6d: invokevirtual com/mojang/authlib/properties/PropertyMap.containsKey (Ljava/lang/Object;)Z
      // 70: goto 77
      // 73: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 76: athrow
      // 77: ifeq 7c
      // 7a: aload 0
      // 7b: areturn
      // 7c: invokestatic vr1._0v ()Lvr1;
      // 7f: aload 3
      // 80: ifnonnull 96
      // 83: ifnonnull 93
      // 86: goto 8d
      // 89: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 8c: athrow
      // 8d: aload 0
      // 8e: areturn
      // 8f: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // 92: athrow
      // 93: invokestatic vr1._0v ()Lvr1;
      // 96: invokevirtual vr1.y71 ()Lkr3;
      // 99: aload 0
      // 9a: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 9d: invokevirtual kr3.wjp (Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;
      // a0: astore 4
      // a2: aload 4
      // a4: aload 3
      // a5: ifnonnull d2
      // a8: ifnonnull b8
      // ab: goto b2
      // ae: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // b1: athrow
      // b2: aload 0
      // b3: areturn
      // b4: invokestatic net/minecraft/tileentity/TileEntitySkull.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 4
      // ba: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // bd: sipush 30558
      // c0: ldc2_w 4253299239044535218
      // c3: lload 1
      // c4: lxor
      // c5: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/tileentity/TileEntitySkull.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: nop
      // cb: invokevirtual com/mojang/authlib/properties/PropertyMap.get (Ljava/lang/Object;)Ljava/util/Collection;
      // ce: aconst_null
      // cf: invokestatic com/google/common/collect/Iterables.getFirst (Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;
      // d2: checkcast com/mojang/authlib/properties/Property
      // d5: astore 5
      // d7: aload 5
      // d9: ifnonnull ec
      // dc: invokestatic vr1._0v ()Lvr1;
      // df: invokevirtual vr1.qrh ()Lcom/mojang/authlib/minecraft/MinecraftSessionService;
      // e2: aload 4
      // e4: bipush 1
      // e5: invokeinterface com/mojang/authlib/minecraft/MinecraftSessionService.fillProfileProperties (Lcom/mojang/authlib/GameProfile;Z)Lcom/mojang/authlib/GameProfile; 3
      // ea: astore 4
      // ec: aload 4
      // ee: areturn
      // ef: aload 0
      // f0: areturn
   }

   public int o4i() {
      return this.xl9;
   }

   public int fqk() {
      return this.lqe;
   }

   public void koc(int var1) {
      this.lqe = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-765541265176964422L, -5781085678290010585L, MethodHandles.lookup().lookupClass()).a(206614950325574L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 3191285199621L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "¸xq\u009bÀ\u0003ô\u008cN\u0005²QÞÔ\u0081^ \u0081T¥¡Ü~¯A÷øç2ÓÛ\bË¢{²³\"_\u0013ðàmÝÂø t\u001d )¿'ë&\u0010Ë\u0014B\u009d;W\u0010\u000f>·\u000eEF\u008d\u0004\u0012\u009búÄü\u0014õ}Jñæ é3# Xù\r>(óÇ\"\u0096T¦Ý\u0013ê¸V8t\fd»¦4Å\u009a×Û¶\u0010C`\u0088\n\u008dè\u001f\\\u00ad\fº§(\u0007°\u0099\u0018ë\u00ad\u0082È\u0017\u008eÓ\u0004\u0014å\u001cB)x¬ú\u0001¸¼¡úÌû¿\u0010Ôcø4úÖ\u0080åÃHu\u0013\f\u0095\u009dm\u0010Åô R¶+øÖÀ\u0082ëÔ\u0093Øe\u001a";
      int var8 = "¸xq\u009bÀ\u0003ô\u008cN\u0005²QÞÔ\u0081^ \u0081T¥¡Ü~¯A÷øç2ÓÛ\bË¢{²³\"_\u0013ðàmÝÂø t\u001d )¿'ë&\u0010Ë\u0014B\u009d;W\u0010\u000f>·\u000eEF\u008d\u0004\u0012\u009búÄü\u0014õ}Jñæ é3# Xù\r>(óÇ\"\u0096T¦Ý\u0013ê¸V8t\fd»¦4Å\u009a×Û¶\u0010C`\u0088\n\u008dè\u001f\\\u00ad\fº§(\u0007°\u0099\u0018ë\u00ad\u0082È\u0017\u008eÓ\u0004\u0014å\u001cB)x¬ú\u0001¸¼¡úÌû¿\u0010Ôcø4úÖ\u0080åÃHu\u0013\f\u0095\u009dm\u0010Åô R¶+øÖÀ\u0082ëÔ\u0093Øe\u001a"
         .length();
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
                     g = new String[10];
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

                  var6 = "µé¯\u0002c\u0091¥\u0018â\u009a\u008c¬Ù\u000eÀVqF®qRL\u0015yLeµ·¹}{í\u0018\u0017×BEíxa¿ï\u009c+\u000eU\u008e§¢ö_Èy©P\u0081\u0002";
                  var8 = "µé¯\u0002c\u0091¥\u0018â\u009a\u008c¬Ù\u000eÀVqF®qRL\u0015yLeµ·¹}{í\u0018\u0017×BEíxa¿ï\u009c+\u000eU\u008e§¢ö_Èy©P\u0081\u0002"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6823;
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
            throw new RuntimeException("net/minecraft/tileentity/TileEntitySkull", var10);
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
         throw new RuntimeException("net/minecraft/tileentity/TileEntitySkull" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
