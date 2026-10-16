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

public class x3i extends Module {
   public static BooleanSetting mk9;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public x3i() {
      long var1 = a ^ 26564505082466L;
      super(b<"p">(6573, 1711480629448832062L ^ var1), _aj.i9j, false, new SubEngine[0]);
   }

   public EntityLivingBase pm8(double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 4
      // 03: invokestatic OpaquePredicate.c ()I
      // 06: dload 1
      // 07: dstore 5
      // 09: getstatic x3i.ek1 Lc05;
      // 0c: getfield Minecraft.tij Lkh3;
      // 0f: getfield WorldClient.guf Ljava/util/List;
      // 12: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 17: astore 7
      // 19: istore 3
      // 1a: aload 7
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq b7
      // 24: aload 7
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: astore 8
      // 2d: aload 8
      // 2f: checkcast EntityLivingBase
      // 32: astore 9
      // 34: getstatic x3i.ek1 Lc05;
      // 37: getfield Minecraft.vg8 Ll86;
      // 3a: iload 3
      // 3b: ifne b9
      // 3e: getfield EntityPlayerSP.lfk Z
      // 41: iload 3
      // 42: ifne 66
      // 45: goto 4c
      // 48: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: ifeq b3
      // 4f: goto 56
      // 52: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: getstatic x3i.ek1 Lc05;
      // 59: getfield Minecraft.vg8 Ll86;
      // 5c: getfield EntityPlayerSP.fcv Z
      // 5f: goto 66
      // 62: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: iload 3
      // 67: ifne 80
      // 6a: ifeq b3
      // 6d: goto 74
      // 70: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 73: athrow
      // 74: aload 9
      // 76: instanceof nvf
      // 79: goto 80
      // 7c: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: ifeq b3
      // 83: getstatic x3i.ek1 Lc05;
      // 86: getfield Minecraft.vg8 Ll86;
      // 89: aload 9
      // 8b: invokevirtual EntityPlayerSP.tm6 (Li2h;)F
      // 8e: f2d
      // 8f: dstore 10
      // 91: dload 10
      // 93: iload 3
      // 94: ifne ad
      // 97: dload 5
      // 99: dcmpg
      // 9a: ifgt b3
      // 9d: goto a4
      // a0: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a3: athrow
      // a4: dload 10
      // a6: goto ad
      // a9: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ac: athrow
      // ad: dstore 5
      // af: aload 9
      // b1: astore 4
      // b3: iload 3
      // b4: ifeq 1a
      // b7: aload 4
      // b9: areturn
   }

   @EventHandler
   public void tog(ihr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic x3i.mk9 Lcn7;
      // 07: invokevirtual BooleanSetting.g7m ()Z
      // 0a: iload 2
      // 0b: ifeq 26
      // 0e: ifeq 9c
      // 11: goto 18
      // 14: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: aload 1
      // 19: invokevirtual ihr.bbi ()Lmz2;
      // 1c: instanceof net/minecraft/network/play/client/C02PacketUseEntity
      // 1f: goto 26
      // 22: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: iload 2
      // 27: ifeq 4b
      // 2a: ifeq 9c
      // 2d: goto 34
      // 30: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 1
      // 35: invokevirtual ihr.bbi ()Lmz2;
      // 38: checkcast net/minecraft/network/play/client/C02PacketUseEntity
      // 3b: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity.nf7 ()Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 3e: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.cb5 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 41: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity$_y6.equals (Ljava/lang/Object;)Z
      // 44: goto 4b
      // 47: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: iload 2
      // 4c: ifeq 69
      // 4f: ifeq 9c
      // 52: goto 59
      // 55: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58: athrow
      // 59: getstatic x3i.ek1 Lc05;
      // 5c: getfield Minecraft.vg8 Ll86;
      // 5f: invokevirtual EntityPlayerSP.mwq ()Z
      // 62: goto 69
      // 65: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: iload 2
      // 6a: ifeq 78
      // 6d: ifne 7b
      // 70: goto 77
      // 73: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: bipush 1
      // 78: goto 7c
      // 7b: bipush 0
      // 7c: istore 3
      // 7d: iload 3
      // 7e: ifeq 9c
      // 81: aload 0
      // 82: aload 1
      // 83: invokevirtual ihr.bbi ()Lmz2;
      // 86: checkcast net/minecraft/network/play/client/C02PacketUseEntity
      // 89: getstatic x3i.ek1 Lc05;
      // 8c: getfield Minecraft.tij Lkh3;
      // 8f: invokevirtual net/minecraft/network/play/client/C02PacketUseEntity._nk (Lt9d;)Li2h;
      // 92: invokevirtual x3i.dxa (Li2h;)V
      // 95: goto 9c
      // 98: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: return
   }

   @EventHandler
   public void xf3(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: getstatic x3i.ek1 Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: invokevirtual EntityPlayerSP.mwq ()Z
      // 0d: iload 2
      // 0e: ifeq 1c
      // 11: ifne 1f
      // 14: goto 1b
      // 17: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: goto 20
      // 1f: bipush 0
      // 20: istore 3
      // 21: iload 3
      // 22: iload 2
      // 23: ifeq 40
      // 26: ifeq 93
      // 29: goto 30
      // 2c: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: getstatic x3i.ek1 Lc05;
      // 33: getfield Minecraft.l7q Lhh6;
      // 36: invokevirtual hh6.rq9 ()Z
      // 39: goto 40
      // 3c: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: iload 2
      // 41: ifeq 61
      // 44: ifeq 93
      // 47: goto 4e
      // 4a: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: getstatic x3i.ek1 Lc05;
      // 51: getfield Minecraft.dzk Lakm;
      // 54: invokevirtual akm._uf ()Lmew;
      // 57: invokestatic java/util/Objects.isNull (Ljava/lang/Object;)Z
      // 5a: goto 61
      // 5d: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: ifne 93
      // 64: aload 0
      // 65: getstatic x3i.ek1 Lc05;
      // 68: getfield Minecraft.dzk Lakm;
      // 6b: invokevirtual akm._uf ()Lmew;
      // 6e: invokevirtual mew.getX ()I
      // 71: getstatic x3i.ek1 Lc05;
      // 74: getfield Minecraft.dzk Lakm;
      // 77: invokevirtual akm._uf ()Lmew;
      // 7a: invokevirtual mew.getY ()I
      // 7d: getstatic x3i.ek1 Lc05;
      // 80: getfield Minecraft.dzk Lakm;
      // 83: invokevirtual akm._uf ()Lmew;
      // 86: invokevirtual mew.getZ ()I
      // 89: invokevirtual x3i.hj9 (III)V
      // 8c: goto 93
      // 8f: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: return
   }

   public void dxa(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic OpaquePredicate.c ()I
      // 05: ldc -1.0
      // 07: nop
      // 08: fstore 4
      // 0a: istore 2
      // 0b: bipush 36
      // 0d: istore 5
      // 0f: iload 5
      // 11: bipush 45
      // 13: if_icmpge c9
      // 16: getstatic x3i.ek1 Lc05;
      // 19: getfield Minecraft.vg8 Ll86;
      // 1c: iload 2
      // 1d: ifne df
      // 20: iload 2
      // 21: ifne 4b
      // 24: goto 2b
      // 27: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: getfield EntityPlayerSP.fv9 L_jc;
      // 2e: getfield _jc.wjd Ljava/util/List;
      // 31: invokeinterface java/util/List.toArray ()[Ljava/lang/Object; 1
      // 36: iload 5
      // 38: aaload
      // 39: ifnull c2
      // 3c: goto 43
      // 3f: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 1
      // 44: goto 4b
      // 47: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: ifnull c2
      // 4e: getstatic x3i.ek1 Lc05;
      // 51: getfield Minecraft.vg8 Ll86;
      // 54: getfield EntityPlayerSP.fv9 L_jc;
      // 57: iload 5
      // 59: invokevirtual _jc.ajr (I)Lvrx;
      // 5c: invokevirtual vrx.x4s ()Lerg;
      // 5f: astore 6
      // 61: iload 2
      // 62: ifne c5
      // 65: aload 6
      // 67: ifnull c2
      // 6a: goto 71
      // 6d: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 6
      // 73: invokevirtual erg.gn1 ()Lu7m;
      // 76: iload 2
      // 77: ifne 9a
      // 7a: goto 81
      // 7d: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: instanceof za6
      // 84: ifeq c2
      // 87: goto 8e
      // 8a: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: aload 6
      // 90: invokevirtual erg.gn1 ()Lu7m;
      // 93: goto 9a
      // 96: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 99: athrow
      // 9a: checkcast za6
      // 9d: astore 7
      // 9f: iload 2
      // a0: ifne c5
      // a3: aload 7
      // a5: invokevirtual za6.ngv ()F
      // a8: fload 4
      // aa: fcmpl
      // ab: ifle c2
      // ae: goto b5
      // b1: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b4: athrow
      // b5: iload 5
      // b7: bipush 36
      // b9: isub
      // ba: istore 3
      // bb: aload 7
      // bd: invokevirtual za6.ngv ()F
      // c0: fstore 4
      // c2: iinc 5 1
      // c5: iload 2
      // c6: ifeq 0f
      // c9: fload 4
      // cb: ldc -1.0
      // cd: nop
      // ce: fcmpl
      // cf: ifle ef
      // d2: getstatic x3i.ek1 Lc05;
      // d5: getfield Minecraft.vg8 Ll86;
      // d8: goto df
      // db: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // de: athrow
      // df: getfield EntityPlayerSP.up_ Ljnq;
      // e2: iload 3
      // e3: putfield jnq.nb5 I
      // e6: getstatic x3i.ek1 Lc05;
      // e9: getfield Minecraft.l7q Lhh6;
      // ec: invokevirtual hh6.fpm ()V
      // ef: return
   }

   public void hj9(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic x3i.ek1 Lc05;
      // 003: getfield Minecraft.tij Lkh3;
      // 006: new mew
      // 009: dup
      // 00a: iload 1
      // 00b: iload 2
      // 00c: iload 3
      // 00d: invokespecial mew.<init> (III)V
      // 010: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 013: invokeinterface zfz.r_y ()Le0x; 1
      // 018: invokestatic e0x.mxb (Le0x;)I
      // 01b: istore 5
      // 01d: bipush 0
      // 01e: istore 6
      // 020: invokestatic OpaquePredicate.c ()I
      // 023: ldc -1.0
      // 025: nop
      // 026: fstore 7
      // 028: istore 4
      // 02a: bipush 36
      // 02c: istore 8
      // 02e: iload 8
      // 030: bipush 45
      // 032: if_icmpge 0f1
      // 035: getstatic x3i.ek1 Lc05;
      // 038: getfield Minecraft.vg8 Ll86;
      // 03b: getfield EntityPlayerSP.fv9 L_jc;
      // 03e: iload 8
      // 040: invokevirtual _jc.ajr (I)Lvrx;
      // 043: invokevirtual vrx.x4s ()Lerg;
      // 046: astore 9
      // 048: aload 9
      // 04a: invokevirtual erg.gn1 ()Lu7m;
      // 04d: instanceof arf
      // 050: iload 4
      // 052: ifne 0f7
      // 055: iload 4
      // 057: ifne 0bb
      // 05a: goto 061
      // 05d: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: ifne 0a7
      // 064: goto 06b
      // 067: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: aload 9
      // 06d: invokevirtual erg.gn1 ()Lu7m;
      // 070: instanceof za6
      // 073: iload 4
      // 075: ifne 0bb
      // 078: goto 07f
      // 07b: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07e: athrow
      // 07f: ifne 0a7
      // 082: goto 089
      // 085: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 088: athrow
      // 089: aload 9
      // 08b: invokevirtual erg.gn1 ()Lu7m;
      // 08e: instanceof guw
      // 091: iload 4
      // 093: ifne 0bb
      // 096: goto 09d
      // 099: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: ifeq 0e4
      // 0a0: goto 0a7
      // 0a3: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: aload 9
      // 0a9: iload 5
      // 0ab: invokestatic e0x.csc (I)Le0x;
      // 0ae: invokevirtual erg.q6_ (Le0x;)F
      // 0b1: fload 7
      // 0b3: fcmpl
      // 0b4: goto 0bb
      // 0b7: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: iload 4
      // 0bd: ifne 0d6
      // 0c0: ifle 0e4
      // 0c3: goto 0ca
      // 0c6: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: iload 8
      // 0cc: bipush 36
      // 0ce: isub
      // 0cf: goto 0d6
      // 0d2: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: istore 6
      // 0d8: aload 9
      // 0da: iload 5
      // 0dc: invokestatic e0x.csc (I)Le0x;
      // 0df: invokevirtual erg.q6_ (Le0x;)F
      // 0e2: fstore 7
      // 0e4: goto 0e9
      // 0e7: astore 9
      // 0e9: iinc 8 1
      // 0ec: iload 4
      // 0ee: ifeq 02e
      // 0f1: fload 7
      // 0f3: ldc -1.0
      // 0f5: nop
      // 0f6: fcmpl
      // 0f7: ifeq 118
      // 0fa: getstatic x3i.ek1 Lc05;
      // 0fd: getfield Minecraft.vg8 Ll86;
      // 100: getfield EntityPlayerSP.up_ Ljnq;
      // 103: iload 6
      // 105: putfield jnq.nb5 I
      // 108: getstatic x3i.ek1 Lc05;
      // 10b: getfield Minecraft.l7q Lhh6;
      // 10e: invokevirtual hh6.fpm ()V
      // 111: goto 118
      // 114: invokestatic x3i.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(9118304443876158742L, -1740324575340389269L, MethodHandles.lookup().lookupClass()).a(216272172195587L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 131955488106653L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "2\u001b#6l\u008cYNý?æÍ\u008aø2Y\u0002ÆI\u0093¦w\u0003\u0001@\u0080I\u0000GE²\u0083 \u0095\u009cÂ;Ý\f8«\t`ð¨ÐO0JÆCq¹\u000eOi»\u001dÛ\r|)\u0091×o\u0010_P\u000euý\u0088\nÚ\u0004ºc{\u0017 ³Ó";
      int var6 = "2\u001b#6l\u008cYNý?æÍ\u008aø2Y\u0002ÆI\u0093¦w\u0003\u0001@\u0080I\u0000GE²\u0083 \u0095\u009cÂ;Ý\f8«\t`ð¨ÐO0JÆCq¹\u000eOi»\u001dÛ\r|)\u0091×o\u0010_P\u000euý\u0088\nÚ\u0004ºc{\u0017 ³Ó"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            f = var7;
            g = new String[3];
            mk9 = new BooleanSetting(b<"p">(1859, 685931973945743406L ^ var9), b<"p">(21744, 6670089899330571167L ^ var9), true);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   private static Exception b(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18228;
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
            throw new RuntimeException("x3i", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("x3i" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
