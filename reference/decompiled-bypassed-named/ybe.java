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

public class ybe extends Module {
   private mew n_2;
   public static NumberSetting ile;
   public static BooleanSetting w4s;
   public static BooleanSetting c8x;
   public static BooleanSetting al2;
   public static BooleanSetting gf1;
   public static BooleanSetting yxe;
   public static q6h klg;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public ybe() {
      long var1 = a ^ 70891590671552L;
      super(b<"r">(29961, 7178532398939168212L ^ var1), _aj.y49, false, new SubEngine[0]);
   }

   @EventHandler(
      jn1 = 3
   )
   private void rv2(PlayerUpdateEvent param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokevirtual PlayerUpdateEvent.lhw ()Z
      // 008: ifeq 015
      // 00b: aload 0
      // 00c: aconst_null
      // 00d: putfield ybe.n_2 Lmew;
      // 010: return
      // 011: invokestatic ybe.a (Loov;)Loov;
      // 014: athrow
      // 015: aload 0
      // 016: aconst_null
      // 017: putfield ybe.n_2 Lmew;
      // 01a: getstatic KillAura.kfa Lg_3;
      // 01d: ifnull 025
      // 020: return
      // 021: invokestatic ybe.a (Loov;)Loov;
      // 024: athrow
      // 025: getstatic ybe.ile Lcrk;
      // 028: invokevirtual NumberSetting.getValue ()Ljava/lang/Float;
      // 02b: invokevirtual java/lang/Float.floatValue ()F
      // 02e: fconst_2
      // 02f: fadd
      // 030: dup
      // 031: fstore 3
      // 032: fstore 4
      // 034: fload 4
      // 036: fload 3
      // 037: fneg
      // 038: fcmpl
      // 039: iflt 181
      // 03c: fload 3
      // 03d: fneg
      // 03e: fstore 5
      // 040: fload 5
      // 042: fload 3
      // 043: fcmpg
      // 044: ifgt 177
      // 047: fload 3
      // 048: fneg
      // 049: iload 2
      // 04a: ifeq 17b
      // 04d: fstore 6
      // 04f: fload 6
      // 051: fload 3
      // 052: fcmpg
      // 053: ifgt 16d
      // 056: new mew
      // 059: dup
      // 05a: getstatic ybe.ek1 Lc05;
      // 05d: getfield Minecraft.vg8 Ll86;
      // 060: getfield EntityPlayerSP.o2v D
      // 063: ldc2_w 0.5
      // 066: dsub
      // 067: fload 5
      // 069: f2d
      // 06a: dadd
      // 06b: getstatic ybe.ek1 Lc05;
      // 06e: getfield Minecraft.vg8 Ll86;
      // 071: getfield EntityPlayerSP.kfp D
      // 074: ldc2_w 0.5
      // 077: dsub
      // 078: fload 4
      // 07a: f2d
      // 07b: dadd
      // 07c: getstatic ybe.ek1 Lc05;
      // 07f: getfield Minecraft.vg8 Ll86;
      // 082: getfield EntityPlayerSP.vbd D
      // 085: ldc2_w 0.5
      // 088: dsub
      // 089: fload 6
      // 08b: f2d
      // 08c: dadd
      // 08d: invokespecial mew.<init> (DDD)V
      // 090: astore 7
      // 092: getstatic ybe.ek1 Lc05;
      // 095: getfield Minecraft.tij Lkh3;
      // 098: aload 7
      // 09a: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 09d: invokeinterface zfz.r_y ()Le0x; 1
      // 0a2: astore 8
      // 0a4: iload 2
      // 0a5: ifeq 173
      // 0a8: iload 2
      // 0a9: ifeq 169
      // 0ac: goto 0b3
      // 0af: invokestatic ybe.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: aload 7
      // 0b6: invokespecial ybe.o7n (Lmew;)Lvt2;
      // 0b9: ifnull 163
      // 0bc: goto 0c3
      // 0bf: invokestatic ybe.a (Loov;)Loov;
      // 0c2: athrow
      // 0c3: getstatic ybe.ek1 Lc05;
      // 0c6: getfield Minecraft.vg8 Ll86;
      // 0c9: getstatic ybe.ek1 Lc05;
      // 0cc: getfield Minecraft.vg8 Ll86;
      // 0cf: getfield EntityPlayerSP.o2v D
      // 0d2: fload 5
      // 0d4: f2d
      // 0d5: dadd
      // 0d6: getstatic ybe.ek1 Lc05;
      // 0d9: getfield Minecraft.vg8 Ll86;
      // 0dc: getfield EntityPlayerSP.kfp D
      // 0df: fload 4
      // 0e1: f2d
      // 0e2: dadd
      // 0e3: getstatic ybe.ek1 Lc05;
      // 0e6: getfield Minecraft.vg8 Ll86;
      // 0e9: getfield EntityPlayerSP.vbd D
      // 0ec: fload 6
      // 0ee: f2d
      // 0ef: dadd
      // 0f0: invokevirtual EntityPlayerSP.qww (DDD)D
      // 0f3: getstatic ybe.ek1 Lc05;
      // 0f6: getfield Minecraft.l7q Lhh6;
      // 0f9: invokevirtual hh6.gxw ()F
      // 0fc: f2d
      // 0fd: dcmpg
      // 0fe: iload 2
      // 0ff: ifeq 120
      // 102: goto 109
      // 105: invokestatic ybe.a (Loov;)Loov;
      // 108: athrow
      // 109: ifge 163
      // 10c: goto 113
      // 10f: invokestatic ybe.a (Loov;)Loov;
      // 112: athrow
      // 113: aload 0
      // 114: aload 8
      // 116: invokespecial ybe.a5s (Le0x;)Z
      // 119: goto 120
      // 11c: invokestatic ybe.a (Loov;)Loov;
      // 11f: athrow
      // 120: iload 2
      // 121: ifeq 13a
      // 124: ifeq 163
      // 127: goto 12e
      // 12a: invokestatic ybe.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 7
      // 130: invokevirtual mew.getX ()I
      // 133: goto 13a
      // 136: invokestatic ybe.a (Loov;)Loov;
      // 139: athrow
      // 13a: i2d
      // 13b: aload 7
      // 13d: invokevirtual mew.getY ()I
      // 140: i2d
      // 141: aload 7
      // 143: invokevirtual mew.getZ ()I
      // 146: i2d
      // 147: invokestatic bk4.cmx (DDD)[F
      // 14a: astore 9
      // 14c: aload 1
      // 14d: aload 9
      // 14f: bipush 0
      // 150: faload
      // 151: invokevirtual PlayerUpdateEvent.h8j (F)V
      // 154: aload 1
      // 155: aload 9
      // 157: bipush 1
      // 158: faload
      // 159: invokevirtual PlayerUpdateEvent.ni7 (F)V
      // 15c: aload 0
      // 15d: aload 7
      // 15f: putfield ybe.n_2 Lmew;
      // 162: return
      // 163: fload 6
      // 165: fconst_1
      // 166: fadd
      // 167: fstore 6
      // 169: iload 2
      // 16a: ifne 04f
      // 16d: fload 5
      // 16f: fconst_1
      // 170: fadd
      // 171: fstore 5
      // 173: iload 2
      // 174: ifne 040
      // 177: fload 4
      // 179: fconst_1
      // 17a: fsub
      // 17b: fstore 4
      // 17d: iload 2
      // 17e: ifne 034
      // 181: return
   }

   @EventHandler
   public void a91(Event param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield ybe.n_2 Lmew;
      // 08: ifnull ec
      // 0b: getstatic ybe.ek1 Lc05;
      // 0e: getfield Minecraft.u0y Lgbe;
      // 11: instanceof zg9
      // 14: ifne ec
      // 17: goto 1e
      // 1a: invokestatic ybe.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic ModuleRegistry.nd5 Lfyk;
      // 21: getfield KillAura.kl3 Lnhs;
      // 24: invokevirtual Timer.zay ()V
      // 27: aload 0
      // 28: aload 0
      // 29: getfield ybe.n_2 Lmew;
      // 2c: invokespecial ybe.o7n (Lmew;)Lvt2;
      // 2f: dup
      // 30: astore 3
      // 31: ifnull ec
      // 34: aload 0
      // 35: pop
      // 36: getstatic ybe.ek1 Lc05;
      // 39: getfield Minecraft.l7q Lhh6;
      // 3c: invokevirtual hh6.t5_ ()I
      // 3f: iload 2
      // 40: ifeq 7c
      // 43: goto 4a
      // 46: invokestatic ybe.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 1
      // 4b: if_icmple 68
      // 4e: goto 55
      // 51: invokestatic ybe.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: pop
      // 57: getstatic ybe.ek1 Lc05;
      // 5a: getfield Minecraft.l7q Lhh6;
      // 5d: bipush 1
      // 5e: invokevirtual hh6.zrs (I)V
      // 61: goto 68
      // 64: invokestatic ybe.a (Loov;)Loov;
      // 67: athrow
      // 68: getstatic ybe.klg Lq6h;
      // 6b: iload 2
      // 6c: ifeq e9
      // 6f: ldc2_w 500.0
      // 72: invokevirtual q6h.hqu (D)Z
      // 75: goto 7c
      // 78: invokestatic ybe.a (Loov;)Loov;
      // 7b: athrow
      // 7c: ifeq ec
      // 7f: getstatic ybe.ek1 Lc05;
      // 82: getfield Minecraft.vg8 Ll86;
      // 85: getfield EntityPlayerSP.lq7 Lp_k;
      // 88: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 8b: dup
      // 8c: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.gi_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 8f: aload 0
      // 90: getfield ybe.n_2 Lmew;
      // 93: getstatic vt2.m3r Lvt2;
      // 96: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 99: invokevirtual p_k.sxi (Lmz2;)V
      // 9c: getstatic ybe.ek1 Lc05;
      // 9f: getfield Minecraft.vg8 Ll86;
      // a2: getfield EntityPlayerSP.lq7 Lp_k;
      // a5: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // a8: dup
      // a9: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.x56 Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // ac: aload 0
      // ad: getfield ybe.n_2 Lmew;
      // b0: getstatic vt2.m3r Lvt2;
      // b3: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // b6: invokevirtual p_k.sxi (Lmz2;)V
      // b9: getstatic ybe.ek1 Lc05;
      // bc: getfield Minecraft.vg8 Ll86;
      // bf: getfield EntityPlayerSP.lq7 Lp_k;
      // c2: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // c5: dup
      // c6: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.gi_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // c9: aload 0
      // ca: getfield ybe.n_2 Lmew;
      // cd: getstatic vt2.m3r Lvt2;
      // d0: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // d3: invokevirtual p_k.sxi (Lmz2;)V
      // d6: getstatic ybe.ek1 Lc05;
      // d9: getfield Minecraft.vg8 Ll86;
      // dc: invokevirtual EntityPlayerSP.hgb ()V
      // df: getstatic ybe.klg Lq6h;
      // e2: goto e9
      // e5: invokestatic ybe.a (Loov;)Loov;
      // e8: athrow
      // e9: invokevirtual q6h.u1k ()V
      // ec: return
   }

   private boolean a5s(e0x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: invokestatic e0x.mxb (Le0x;)I
      // 008: bipush 121
      // 00a: iload 2
      // 00b: ifne 04d
      // 00e: if_icmpne 03c
      // 011: goto 018
      // 014: invokestatic ybe.a (Loov;)Loov;
      // 017: athrow
      // 018: getstatic ybe.w4s Lcn7;
      // 01b: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 01e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 021: iload 2
      // 022: ifne 040
      // 025: goto 02c
      // 028: invokestatic ybe.a (Loov;)Loov;
      // 02b: athrow
      // 02c: ifeq 03c
      // 02f: goto 036
      // 032: invokestatic ybe.a (Loov;)Loov;
      // 035: athrow
      // 036: bipush 1
      // 037: ireturn
      // 038: invokestatic ybe.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 1
      // 03d: invokestatic e0x.mxb (Le0x;)I
      // 040: iload 2
      // 041: ifne 078
      // 044: bipush 26
      // 046: goto 04d
      // 049: invokestatic ybe.a (Loov;)Loov;
      // 04c: athrow
      // 04d: if_icmpne 074
      // 050: getstatic ybe.c8x Lcn7;
      // 053: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 056: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 059: iload 2
      // 05a: ifne 078
      // 05d: goto 064
      // 060: invokestatic ybe.a (Loov;)Loov;
      // 063: athrow
      // 064: ifeq 074
      // 067: goto 06e
      // 06a: invokestatic ybe.a (Loov;)Loov;
      // 06d: athrow
      // 06e: bipush 1
      // 06f: ireturn
      // 070: invokestatic ybe.a (Loov;)Loov;
      // 073: athrow
      // 074: aload 1
      // 075: instanceof syn
      // 078: iload 2
      // 079: ifne 0ae
      // 07c: ifeq 0aa
      // 07f: goto 086
      // 082: invokestatic ybe.a (Loov;)Loov;
      // 085: athrow
      // 086: getstatic ybe.al2 Lcn7;
      // 089: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 08c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 08f: iload 2
      // 090: ifne 0ae
      // 093: goto 09a
      // 096: invokestatic ybe.a (Loov;)Loov;
      // 099: athrow
      // 09a: ifeq 0aa
      // 09d: goto 0a4
      // 0a0: invokestatic ybe.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: bipush 1
      // 0a5: ireturn
      // 0a6: invokestatic ybe.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 1
      // 0ab: instanceof vk3
      // 0ae: iload 2
      // 0af: ifne 0e4
      // 0b2: ifeq 0e0
      // 0b5: goto 0bc
      // 0b8: invokestatic ybe.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: getstatic ybe.yxe Lcn7;
      // 0bf: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0c2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c5: iload 2
      // 0c6: ifne 0e4
      // 0c9: goto 0d0
      // 0cc: invokestatic ybe.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: ifeq 0e0
      // 0d3: goto 0da
      // 0d6: invokestatic ybe.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: bipush 1
      // 0db: ireturn
      // 0dc: invokestatic ybe.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 1
      // 0e1: instanceof hrd
      // 0e4: iload 2
      // 0e5: ifne 117
      // 0e8: ifeq 116
      // 0eb: goto 0f2
      // 0ee: invokestatic ybe.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: getstatic ybe.gf1 Lcn7;
      // 0f5: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 0f8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0fb: iload 2
      // 0fc: ifne 117
      // 0ff: goto 106
      // 102: invokestatic ybe.a (Loov;)Loov;
      // 105: athrow
      // 106: ifeq 116
      // 109: goto 110
      // 10c: invokestatic ybe.a (Loov;)Loov;
      // 10f: athrow
      // 110: bipush 1
      // 111: ireturn
      // 112: invokestatic ybe.a (Loov;)Loov;
      // 115: athrow
      // 116: bipush 0
      // 117: ireturn
   }

   private vt2 o7n(mew var1) {
      int var2 = OpaquePredicate.c();
      vt2 var3 = null;

      boolean var10000;
      label92: {
         try {
            var10000 = ek1.tij.getBlockState(var1.ec4(0, 1, 0)).r_y().lj1();
            if (var2 != 0) {
               break label92;
            }

            if (!var10000) {
               return vt2.rf3;
            }
         } catch (oov var8) {
            throw a(var8);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(0, -1, 0)).r_y().lj1();
      }

      label82: {
         try {
            if (var2 != 0) {
               break label82;
            }

            if (!var10000) {
               return vt2.m3r;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(1, 0, 0)).r_y().lj1();
      }

      label72: {
         try {
            if (var2 != 0) {
               break label72;
            }

            if (!var10000) {
               return vt2.zk4;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(-1, 0, 0)).r_y().lj1();
      }

      label62: {
         try {
            if (var2 != 0) {
               break label62;
            }

            if (!var10000) {
               return vt2.te4;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(0, 0, 1)).r_y().lj1();
      }

      label52: {
         try {
            if (var2 != 0) {
               break label52;
            }

            if (!var10000) {
               return vt2.mxp;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = ek1.tij.getBlockState(var1.ec4(0, 0, 1)).r_y().lj1();
      }

      if (!var10000) {
         var3 = vt2.z9q;
      }

      return var3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7090505942201307285L, -113554007823396423L, MethodHandles.lookup().lookupClass()).a(161174719427777L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 57358535811254L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "¥öîÕêoµlàïß\u0011\u009bàV_â\u0005g(Fey\u0099\u0010\bGOÆZ=Qi\u008f\u001bo\u008d¾ùTj ¶\u001b\u008cê8ä[Êmx\u0086\u008c\u0090ð-l'ÏRµôÀ\u000b¶\u0096\u0096\u0012\u0098ó\u0082Ã\\\u0010\u008d\u009ejÂ\u00935õ\t\u0019O\u0088^!4]\u001f\u0010>\u0007\u0006£\u00979â4d\u0093ï\u0002ªwÑ\u0012\u0010J7C\b\u0018×\u0001êt®\u0092Ú\\b\u0088P";
      int var6 = "¥öîÕêoµlàïß\u0011\u009bàV_â\u0005g(Fey\u0099\u0010\bGOÆZ=Qi\u008f\u001bo\u008d¾ùTj ¶\u001b\u008cê8ä[Êmx\u0086\u008c\u0090ð-l'ÏRµôÀ\u000b¶\u0096\u0096\u0012\u0098ó\u0082Ã\\\u0010\u008d\u009ejÂ\u00935õ\t\u0019O\u0088^!4]\u001f\u0010>\u0007\u0006£\u00979â4d\u0093ï\u0002ªwÑ\u0012\u0010J7C\b\u0018×\u0001êt®\u0092Ú\\b\u0088P"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     f = var7;
                     g = new String[8];
                     ile = new NumberSetting(b<"r">(21272, 8132353069882132401L ^ var9), b<"r">(23034, 234758953068481877L ^ var9), 4.0F, 1.0F, 6.0F, 1.0F);
                     w4s = new BooleanSetting(b<"r">(29961, 7178510746145546658L ^ var9), b<"r">(29603, 1987414212299679502L ^ var9), false);
                     c8x = new BooleanSetting(b<"r">(29961, 7178510746145546658L ^ var9), b<"r">(7700, 2057703498658941630L ^ var9), false);
                     al2 = new BooleanSetting(b<"r">(29961, 7178510746145546658L ^ var9), b<"r">(18731, 1968175413783354759L ^ var9), false);
                     gf1 = new BooleanSetting(b<"r">(29961, 7178510746145546658L ^ var9), b<"r">(30299, 4681181010177745653L ^ var9), false);
                     yxe = new BooleanSetting(b<"r">(29961, 7178510746145546658L ^ var9), b<"r">(20013, 6915350748824787589L ^ var9), false);
                     klg = new q6h();
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "á¾Ï\u000fî\u0080\u001bÇ\u0081\u0084\u00adK¥ó\u000egpC=\u0001¶Î!Û\u0018\u000bÂùÃôý\u0091¾rãj\u009aìE%QT\u008c%\u009a¦Ó\u0093\u0084";
                  var6 = "á¾Ï\u000fî\u0080\u001bÇ\u0081\u0084\u00adK¥ó\u000egpC=\u0001¶Î!Û\u0018\u000bÂùÃôý\u0091¾rãj\u009aìE%QT\u008c%\u009a¦Ó\u0093\u0084"
                     .length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26586;
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
            throw new RuntimeException("ybe", var10);
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
         throw new RuntimeException("ybe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
