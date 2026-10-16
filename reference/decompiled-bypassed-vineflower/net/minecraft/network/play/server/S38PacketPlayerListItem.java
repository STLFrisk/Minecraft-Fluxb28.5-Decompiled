package net.minecraft.network.play.server;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
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

public class S38PacketPlayerListItem implements mz2 {
   private S38PacketPlayerListItem$a1f maa;
   private final List zac;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public S38PacketPlayerListItem() {
      this.zac = Lists.newArrayList();
   }

   public S38PacketPlayerListItem(S38PacketPlayerListItem$a1f var1, z96[] var2) {
      this.zac = Lists.newArrayList();
      String var10000 = S14PacketEntity.b();
      this.maa = var1;
      String var3 = var10000;

      for (z96 var7 : var2) {
         this.zac.add(new S38PacketPlayerListItem$b1f(this, var7.x6l(), var7.f3h, var7._am.tmw(), var7.von()));
         if (var3 == null) {
            break;
         }
      }
   }

   public S38PacketPlayerListItem(S38PacketPlayerListItem$a1f var1, Iterable var2) {
      String var10000 = S14PacketEntity.b();
      this.zac = Lists.newArrayList();
      String var3 = var10000;
      this.maa = var1;

      for (z96 var5 : var2) {
         this.zac.add(new S38PacketPlayerListItem$b1f(this, var5.x6l(), var5.f3h, var5._am.tmw(), var5.von()));
         if (var3 == null) {
            break;
         }
      }
   }

   @Override
   public void ajj(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: ldc net/minecraft/network/play/server/S38PacketPlayerListItem$a1f
      // 004: nop
      // 005: invokevirtual nfj.e0h (Ljava/lang/Class;)Ljava/lang/Enum;
      // 008: checkcast net/minecraft/network/play/server/S38PacketPlayerListItem$a1f
      // 00b: putfield net/minecraft/network/play/server/S38PacketPlayerListItem.maa Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 00e: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 011: aload 1
      // 012: invokevirtual nfj.gux ()I
      // 015: istore 3
      // 016: astore 2
      // 017: bipush 0
      // 018: istore 4
      // 01a: iload 4
      // 01c: iload 3
      // 01d: if_icmpge 1c3
      // 020: aconst_null
      // 021: astore 5
      // 023: bipush 0
      // 024: istore 6
      // 026: aconst_null
      // 027: astore 7
      // 029: aconst_null
      // 02a: astore 8
      // 02c: getstatic net/minecraft/network/play/server/S38PacketPlayerListItem$1.sfd [I
      // 02f: aload 0
      // 030: getfield net/minecraft/network/play/server/S38PacketPlayerListItem.maa Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 033: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$a1f.ordinal ()I
      // 036: iaload
      // 037: tableswitch 363 1 5 33 240 269 295 346
      // 058: new com/mojang/authlib/GameProfile
      // 05b: dup
      // 05c: aload 1
      // 05d: invokevirtual nfj.ac2 ()Ljava/util/UUID;
      // 060: aload 1
      // 061: bipush 16
      // 063: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 066: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 069: astore 5
      // 06b: aload 1
      // 06c: invokevirtual nfj.gux ()I
      // 06f: istore 9
      // 071: bipush 0
      // 072: istore 10
      // 074: iload 10
      // 076: iload 9
      // 078: if_icmpge 0f6
      // 07b: aload 1
      // 07c: sipush 32767
      // 07f: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 082: astore 11
      // 084: aload 1
      // 085: sipush 32767
      // 088: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 08b: astore 12
      // 08d: aload 1
      // 08e: invokevirtual nfj.readBoolean ()Z
      // 091: aload 2
      // 092: ifnull 0fa
      // 095: aload 2
      // 096: ifnull 0ee
      // 099: goto 0a0
      // 09c: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: ifeq 0d2
      // 0a3: goto 0aa
      // 0a6: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 5
      // 0ac: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 0af: aload 11
      // 0b1: new com/mojang/authlib/properties/Property
      // 0b4: dup
      // 0b5: aload 11
      // 0b7: aload 12
      // 0b9: aload 1
      // 0ba: sipush 32767
      // 0bd: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 0c0: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 0c3: invokevirtual com/mojang/authlib/properties/PropertyMap.put (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0c6: pop
      // 0c7: aload 2
      // 0c8: ifnonnull 0ef
      // 0cb: goto 0d2
      // 0ce: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 5
      // 0d4: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 0d7: aload 11
      // 0d9: new com/mojang/authlib/properties/Property
      // 0dc: dup
      // 0dd: aload 11
      // 0df: aload 12
      // 0e1: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0e4: invokevirtual com/mojang/authlib/properties/PropertyMap.put (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0e7: goto 0ee
      // 0ea: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: pop
      // 0ef: iinc 10 1
      // 0f2: aload 2
      // 0f3: ifnonnull 074
      // 0f6: aload 1
      // 0f7: invokevirtual nfj.gux ()I
      // 0fa: invokestatic h50$f05.e9x (I)Lh50$f05;
      // 0fd: astore 7
      // 0ff: aload 1
      // 100: invokevirtual nfj.gux ()I
      // 103: istore 6
      // 105: aload 1
      // 106: aload 2
      // 107: ifnull 11f
      // 10a: invokevirtual nfj.readBoolean ()Z
      // 10d: ifeq 1a2
      // 110: goto 117
      // 113: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 116: athrow
      // 117: aload 1
      // 118: goto 11f
      // 11b: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 11e: athrow
      // 11f: invokevirtual nfj.wdz ()Lekw;
      // 122: astore 8
      // 124: goto 1a2
      // 127: new com/mojang/authlib/GameProfile
      // 12a: dup
      // 12b: aload 1
      // 12c: invokevirtual nfj.ac2 ()Ljava/util/UUID;
      // 12f: aconst_null
      // 130: checkcast java/lang/String
      // 133: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 136: astore 5
      // 138: aload 1
      // 139: invokevirtual nfj.gux ()I
      // 13c: invokestatic h50$f05.e9x (I)Lh50$f05;
      // 13f: astore 7
      // 141: goto 1a2
      // 144: new com/mojang/authlib/GameProfile
      // 147: dup
      // 148: aload 1
      // 149: invokevirtual nfj.ac2 ()Ljava/util/UUID;
      // 14c: aconst_null
      // 14d: checkcast java/lang/String
      // 150: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 153: astore 5
      // 155: aload 1
      // 156: invokevirtual nfj.gux ()I
      // 159: istore 6
      // 15b: goto 1a2
      // 15e: new com/mojang/authlib/GameProfile
      // 161: dup
      // 162: aload 1
      // 163: invokevirtual nfj.ac2 ()Ljava/util/UUID;
      // 166: aconst_null
      // 167: checkcast java/lang/String
      // 16a: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 16d: astore 5
      // 16f: aload 1
      // 170: aload 2
      // 171: ifnull 189
      // 174: invokevirtual nfj.readBoolean ()Z
      // 177: ifeq 1a2
      // 17a: goto 181
      // 17d: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 180: athrow
      // 181: aload 1
      // 182: goto 189
      // 185: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 188: athrow
      // 189: invokevirtual nfj.wdz ()Lekw;
      // 18c: astore 8
      // 18e: goto 1a2
      // 191: new com/mojang/authlib/GameProfile
      // 194: dup
      // 195: aload 1
      // 196: invokevirtual nfj.ac2 ()Ljava/util/UUID;
      // 199: aconst_null
      // 19a: checkcast java/lang/String
      // 19d: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 1a0: astore 5
      // 1a2: aload 0
      // 1a3: getfield net/minecraft/network/play/server/S38PacketPlayerListItem.zac Ljava/util/List;
      // 1a6: new net/minecraft/network/play/server/S38PacketPlayerListItem$b1f
      // 1a9: dup
      // 1aa: aload 0
      // 1ab: aload 5
      // 1ad: iload 6
      // 1af: aload 7
      // 1b1: aload 8
      // 1b3: invokespecial net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.<init> (Lnet/minecraft/network/play/server/S38PacketPlayerListItem;Lcom/mojang/authlib/GameProfile;ILh50$f05;Lekw;)V
      // 1b6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1bb: pop
      // 1bc: iinc 4 1
      // 1bf: aload 2
      // 1c0: ifnonnull 01a
      // 1c3: return
   }

   @Override
   public void ddd(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 0
      // 002: getfield net/minecraft/network/play/server/S38PacketPlayerListItem.maa Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 005: invokevirtual nfj.p9c (Ljava/lang/Enum;)Lnfj;
      // 008: pop
      // 009: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 00c: aload 1
      // 00d: aload 0
      // 00e: getfield net/minecraft/network/play/server/S38PacketPlayerListItem.zac Ljava/util/List;
      // 011: invokeinterface java/util/List.size ()I 1
      // 016: invokevirtual nfj.tao (I)Lnfj;
      // 019: pop
      // 01a: aload 0
      // 01b: getfield net/minecraft/network/play/server/S38PacketPlayerListItem.zac Ljava/util/List;
      // 01e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 023: astore 3
      // 024: astore 2
      // 025: aload 3
      // 026: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02b: ifeq 226
      // 02e: aload 3
      // 02f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 034: checkcast net/minecraft/network/play/server/S38PacketPlayerListItem$b1f
      // 037: astore 4
      // 039: aload 2
      // 03a: ifnull 0a1
      // 03d: getstatic net/minecraft/network/play/server/S38PacketPlayerListItem$1.sfd [I
      // 040: aload 0
      // 041: getfield net/minecraft/network/play/server/S38PacketPlayerListItem.maa Lnet/minecraft/network/play/server/S38PacketPlayerListItem$a1f;
      // 044: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$a1f.ordinal ()I
      // 047: iaload
      // 048: tableswitch 474 1 5 40 301 338 372 454
      // 06c: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 06f: athrow
      // 070: aload 1
      // 071: aload 4
      // 073: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 076: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 079: invokevirtual nfj.n5q (Ljava/util/UUID;)Lnfj;
      // 07c: pop
      // 07d: aload 1
      // 07e: aload 4
      // 080: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 083: invokevirtual com/mojang/authlib/GameProfile.getName ()Ljava/lang/String;
      // 086: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 089: pop
      // 08a: aload 1
      // 08b: aload 4
      // 08d: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 090: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 093: invokevirtual com/mojang/authlib/properties/PropertyMap.size ()I
      // 096: invokevirtual nfj.tao (I)Lnfj;
      // 099: pop
      // 09a: goto 0a1
      // 09d: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 4
      // 0a3: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 0a6: invokevirtual com/mojang/authlib/GameProfile.getProperties ()Lcom/mojang/authlib/properties/PropertyMap;
      // 0a9: invokevirtual com/mojang/authlib/properties/PropertyMap.values ()Ljava/util/Collection;
      // 0ac: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0b1: astore 5
      // 0b3: aload 5
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 120
      // 0bd: aload 5
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: checkcast com/mojang/authlib/properties/Property
      // 0c7: astore 6
      // 0c9: aload 1
      // 0ca: aload 6
      // 0cc: invokevirtual com/mojang/authlib/properties/Property.getName ()Ljava/lang/String;
      // 0cf: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 0d2: pop
      // 0d3: aload 1
      // 0d4: aload 6
      // 0d6: invokevirtual com/mojang/authlib/properties/Property.getValue ()Ljava/lang/String;
      // 0d9: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 0dc: aload 2
      // 0dd: ifnull 11b
      // 0e0: pop
      // 0e1: aload 6
      // 0e3: invokevirtual com/mojang/authlib/properties/Property.hasSignature ()Z
      // 0e6: aload 2
      // 0e7: ifnull 02b
      // 0ea: goto 0f1
      // 0ed: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: ifeq 10f
      // 0f4: aload 1
      // 0f5: bipush 1
      // 0f6: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 0f9: pop
      // 0fa: aload 1
      // 0fb: aload 6
      // 0fd: invokevirtual com/mojang/authlib/properties/Property.getSignature ()Ljava/lang/String;
      // 100: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 103: pop
      // 104: aload 2
      // 105: ifnonnull 11c
      // 108: goto 10f
      // 10b: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 1
      // 110: bipush 0
      // 111: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 114: goto 11b
      // 117: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 11a: athrow
      // 11b: pop
      // 11c: aload 2
      // 11d: ifnonnull 0b3
      // 120: aload 1
      // 121: aload 4
      // 123: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.izc ()Lh50$f05;
      // 126: invokevirtual h50$f05.xzh ()I
      // 129: invokevirtual nfj.tao (I)Lnfj;
      // 12c: pop
      // 12d: aload 1
      // 12e: aload 4
      // 130: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.pst ()I
      // 133: invokevirtual nfj.tao (I)Lnfj;
      // 136: pop
      // 137: aload 2
      // 138: ifnull 171
      // 13b: aload 4
      // 13d: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.bek ()Lekw;
      // 140: ifnonnull 15b
      // 143: goto 14a
      // 146: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 149: athrow
      // 14a: aload 1
      // 14b: bipush 0
      // 14c: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 14f: pop
      // 150: aload 2
      // 151: ifnonnull 222
      // 154: goto 15b
      // 157: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 1
      // 15c: bipush 1
      // 15d: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 160: pop
      // 161: aload 1
      // 162: aload 4
      // 164: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.bek ()Lekw;
      // 167: invokevirtual nfj.v7d (Lekw;)V
      // 16a: goto 171
      // 16d: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 2
      // 172: ifnonnull 222
      // 175: aload 1
      // 176: aload 4
      // 178: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 17b: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 17e: invokevirtual nfj.n5q (Ljava/util/UUID;)Lnfj;
      // 181: pop
      // 182: aload 1
      // 183: aload 4
      // 185: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.izc ()Lh50$f05;
      // 188: invokevirtual h50$f05.xzh ()I
      // 18b: invokevirtual nfj.tao (I)Lnfj;
      // 18e: pop
      // 18f: aload 2
      // 190: ifnonnull 222
      // 193: goto 19a
      // 196: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 1
      // 19b: aload 4
      // 19d: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 1a0: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 1a3: invokevirtual nfj.n5q (Ljava/util/UUID;)Lnfj;
      // 1a6: pop
      // 1a7: aload 1
      // 1a8: aload 4
      // 1aa: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.pst ()I
      // 1ad: invokevirtual nfj.tao (I)Lnfj;
      // 1b0: pop
      // 1b1: aload 2
      // 1b2: ifnonnull 222
      // 1b5: goto 1bc
      // 1b8: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: aload 1
      // 1bd: aload 4
      // 1bf: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 1c2: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 1c5: invokevirtual nfj.n5q (Ljava/util/UUID;)Lnfj;
      // 1c8: pop
      // 1c9: aload 2
      // 1ca: ifnull 20a
      // 1cd: goto 1d4
      // 1d0: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: aload 4
      // 1d6: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.bek ()Lekw;
      // 1d9: ifnonnull 1f4
      // 1dc: goto 1e3
      // 1df: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: aload 1
      // 1e4: bipush 0
      // 1e5: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 1e8: pop
      // 1e9: aload 2
      // 1ea: ifnonnull 222
      // 1ed: goto 1f4
      // 1f0: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: aload 1
      // 1f5: bipush 1
      // 1f6: invokevirtual nfj.writeBoolean (Z)Lio/netty/buffer/ByteBuf;
      // 1f9: pop
      // 1fa: aload 1
      // 1fb: aload 4
      // 1fd: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.bek ()Lekw;
      // 200: invokevirtual nfj.v7d (Lekw;)V
      // 203: goto 20a
      // 206: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 209: athrow
      // 20a: aload 2
      // 20b: ifnonnull 222
      // 20e: aload 1
      // 20f: aload 4
      // 211: invokevirtual net/minecraft/network/play/server/S38PacketPlayerListItem$b1f.duk ()Lcom/mojang/authlib/GameProfile;
      // 214: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 217: invokevirtual nfj.n5q (Ljava/util/UUID;)Lnfj;
      // 21a: pop
      // 21b: goto 222
      // 21e: invokestatic net/minecraft/network/play/server/S38PacketPlayerListItem.a (Loov;)Loov;
      // 221: athrow
      // 222: aload 2
      // 223: ifnonnull 025
      // 226: return
   }

   public void qz0(jsv var1) {
      var1.oon(this);
   }

   public List hyk() {
      return this.zac;
   }

   public S38PacketPlayerListItem$a1f _7a() {
      return this.maa;
   }

   @Override
   public String toString() {
      long var1 = a ^ 46957377852557L;
      return Objects.toStringHelper(this)
         .add(a<"u">(28012, 3420212307391722139L ^ var1), this.maa)
         .add(a<"u">(15858, 3964056575179874820L ^ var1), this.zac)
         .toString();
   }

   @Override
   public void ito(yw3 var1) {
      this.qz0((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5474994486499377519L, -4993970026601561439L, MethodHandles.lookup().lookupClass()).a(31188086303072L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 111122778646973L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "ñ\u0004\u0013Åë\u009d6ºUc\u0081\u000fvNÑÔ\u00102AíÐx¢Ìø<\u0093·2·Ô)¹";
      int var8 = "ñ\u0004\u0013Åë\u009d6ºUc\u0081\u000fvNÑÔ\u00102AíÐx¢Ìø<\u0093·2·Ô)¹".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32147;
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
            throw new RuntimeException("net/minecraft/network/play/server/S38PacketPlayerListItem", var10);
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
         throw new RuntimeException("net/minecraft/network/play/server/S38PacketPlayerListItem" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
