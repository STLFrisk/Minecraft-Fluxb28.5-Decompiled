import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C02PacketUseEntity$_y6;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging$pl2;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C11PacketEnchantItem;

public class hh6 {
   private final Minecraft yva;
   private final p_k ip7;
   private mew e1s = new mew(-1, -1, -1);
   private erg kqu;
   private float veg;
   private float kul;
   public int hsn;
   private boolean jar;
   private h50$f05 n_e = h50$f05.pwg;
   private int fj2;

   public hh6(Minecraft var1, p_k var2) {
      this.yva = var1;
      this.ip7 = var2;
   }

   public static void uwf(Minecraft param0, hh6 param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield Minecraft.tij Lkh3;
      // 09: aload 0
      // 0a: getfield Minecraft.vg8 Ll86;
      // 0d: aload 2
      // 0e: aload 3
      // 0f: invokevirtual WorldClient.igu (Lha9;Lmew;Lvt2;)Z
      // 12: iload 4
      // 14: ifeq 2e
      // 17: ifne 2f
      // 1a: goto 21
      // 1d: invokestatic hh6.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: invokevirtual hh6.iix (Lmew;Lvt2;)Z
      // 27: goto 2e
      // 2a: invokestatic hh6.a (Loov;)Loov;
      // 2d: athrow
      // 2e: pop
      // 2f: return
   }

   public void yt3(ha9 var1) {
      this.n_e.zwk(var1.lls);
   }

   public boolean umf() {
      try {
         if (this.n_e == h50$f05.l18) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public void qm5(h50$f05 var1) {
      this.n_e = var1;
      this.n_e.zwk(this.yva.vg8.lls);
   }

   public void wlc(ha9 var1) {
      var1.x5k = -180.0F;
   }

   public boolean stg() {
      return this.n_e.wdc();
   }

   public boolean iix(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield hh6.n_e Lh50$f05;
      // 008: invokevirtual h50$f05.p98 ()Z
      // 00b: iload 3
      // 00c: ifne 0b4
      // 00f: ifeq 0a2
      // 012: goto 019
      // 015: invokestatic hh6.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 3
      // 01b: ifne 03c
      // 01e: goto 025
      // 021: invokestatic hh6.a (Loov;)Loov;
      // 024: athrow
      // 025: getfield hh6.n_e Lh50$f05;
      // 028: getstatic h50$f05.l18 Lh50$f05;
      // 02b: if_acmpne 03b
      // 02e: goto 035
      // 031: invokestatic hh6.a (Loov;)Loov;
      // 034: athrow
      // 035: bipush 0
      // 036: ireturn
      // 037: invokestatic hh6.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield hh6.yva Lc05;
      // 03f: getfield Minecraft.vg8 Ll86;
      // 042: invokevirtual EntityPlayerSP.gt3 ()Z
      // 045: iload 3
      // 046: ifne 0b4
      // 049: ifne 0a2
      // 04c: goto 053
      // 04f: invokestatic hh6.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: getfield hh6.yva Lc05;
      // 057: getfield Minecraft.tij Lkh3;
      // 05a: aload 1
      // 05b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 05e: invokeinterface zfz.r_y ()Le0x; 1
      // 063: astore 4
      // 065: aload 0
      // 066: getfield hh6.yva Lc05;
      // 069: getfield Minecraft.vg8 Ll86;
      // 06c: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 06f: astore 5
      // 071: aload 5
      // 073: iload 3
      // 074: ifne 089
      // 077: ifnonnull 087
      // 07a: goto 081
      // 07d: invokestatic hh6.a (Loov;)Loov;
      // 080: athrow
      // 081: bipush 0
      // 082: ireturn
      // 083: invokestatic hh6.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 5
      // 089: aload 4
      // 08b: invokevirtual erg.pgf (Le0x;)Z
      // 08e: iload 3
      // 08f: ifne 0b4
      // 092: ifne 0a2
      // 095: goto 09c
      // 098: invokestatic hh6.a (Loov;)Loov;
      // 09b: athrow
      // 09c: bipush 0
      // 09d: ireturn
      // 09e: invokestatic hh6.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: iload 3
      // 0a4: ifne 102
      // 0a7: getfield hh6.n_e Lh50$f05;
      // 0aa: invokevirtual h50$f05.zlv ()Z
      // 0ad: goto 0b4
      // 0b0: invokestatic hh6.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: ifeq 101
      // 0b7: aload 0
      // 0b8: getfield hh6.yva Lc05;
      // 0bb: iload 3
      // 0bc: ifne 105
      // 0bf: goto 0c6
      // 0c2: invokestatic hh6.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: getfield Minecraft.vg8 Ll86;
      // 0c9: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 0cc: ifnull 101
      // 0cf: goto 0d6
      // 0d2: invokestatic hh6.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: getfield hh6.yva Lc05;
      // 0da: iload 3
      // 0db: ifne 105
      // 0de: goto 0e5
      // 0e1: invokestatic hh6.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: getfield Minecraft.vg8 Ll86;
      // 0e8: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 0eb: invokevirtual erg.gn1 ()Lu7m;
      // 0ee: instanceof za6
      // 0f1: ifeq 101
      // 0f4: goto 0fb
      // 0f7: invokestatic hh6.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: bipush 0
      // 0fc: ireturn
      // 0fd: invokestatic hh6.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: getfield hh6.yva Lc05;
      // 105: getfield Minecraft.tij Lkh3;
      // 108: astore 4
      // 10a: aload 4
      // 10c: aload 1
      // 10d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 110: astore 5
      // 112: aload 5
      // 114: invokeinterface zfz.r_y ()Le0x; 1
      // 119: astore 6
      // 11b: iload 3
      // 11c: ifne 145
      // 11f: aload 6
      // 121: invokevirtual e0x.p1r ()Lp3y;
      // 124: getstatic p3y.cei Lp3y;
      // 127: if_acmpne 137
      // 12a: goto 131
      // 12d: invokestatic hh6.a (Loov;)Loov;
      // 130: athrow
      // 131: bipush 0
      // 132: ireturn
      // 133: invokestatic hh6.a (Loov;)Loov;
      // 136: athrow
      // 137: aload 4
      // 139: sipush 2001
      // 13c: aload 1
      // 13d: aload 5
      // 13f: invokestatic e0x.r2y (Lzfz;)I
      // 142: invokevirtual OpaquePredicate.qca (ILmew;I)V
      // 145: aload 4
      // 147: aload 1
      // 148: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 14b: istore 7
      // 14d: iload 7
      // 14f: iload 3
      // 150: ifne 18f
      // 153: ifeq 16e
      // 156: goto 15d
      // 159: invokestatic hh6.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 6
      // 15f: aload 4
      // 161: aload 1
      // 162: aload 5
      // 164: invokevirtual e0x.bf0 (Lt9d;Lmew;Lzfz;)V
      // 167: goto 16e
      // 16a: invokestatic hh6.a (Loov;)Loov;
      // 16d: athrow
      // 16e: aload 0
      // 16f: new mew
      // 172: dup
      // 173: aload 0
      // 174: getfield hh6.e1s Lmew;
      // 177: invokevirtual mew.getX ()I
      // 17a: bipush -1
      // 17b: aload 0
      // 17c: getfield hh6.e1s Lmew;
      // 17f: invokevirtual mew.getZ ()I
      // 182: invokespecial mew.<init> (III)V
      // 185: putfield hh6.e1s Lmew;
      // 188: aload 0
      // 189: getfield hh6.n_e Lh50$f05;
      // 18c: invokevirtual h50$f05.zlv ()Z
      // 18f: iload 3
      // 190: ifne 1f7
      // 193: ifne 1f5
      // 196: goto 19d
      // 199: invokestatic hh6.a (Loov;)Loov;
      // 19c: athrow
      // 19d: aload 0
      // 19e: getfield hh6.yva Lc05;
      // 1a1: getfield Minecraft.vg8 Ll86;
      // 1a4: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 1a7: astore 8
      // 1a9: aload 8
      // 1ab: iload 3
      // 1ac: ifne 1d3
      // 1af: ifnull 1f5
      // 1b2: goto 1b9
      // 1b5: invokestatic hh6.a (Loov;)Loov;
      // 1b8: athrow
      // 1b9: aload 8
      // 1bb: aload 4
      // 1bd: aload 6
      // 1bf: aload 1
      // 1c0: aload 0
      // 1c1: getfield hh6.yva Lc05;
      // 1c4: getfield Minecraft.vg8 Ll86;
      // 1c7: invokevirtual erg.yu9 (Lt9d;Le0x;Lmew;Lha9;)V
      // 1ca: aload 8
      // 1cc: goto 1d3
      // 1cf: invokestatic hh6.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: getfield erg.qd2 I
      // 1d6: iload 3
      // 1d7: ifne 1f7
      // 1da: ifne 1f5
      // 1dd: goto 1e4
      // 1e0: invokestatic hh6.a (Loov;)Loov;
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: getfield hh6.yva Lc05;
      // 1e8: getfield Minecraft.vg8 Ll86;
      // 1eb: invokevirtual EntityPlayerSP.gwo ()V
      // 1ee: goto 1f5
      // 1f1: invokestatic hh6.a (Loov;)Loov;
      // 1f4: athrow
      // 1f5: iload 7
      // 1f7: ireturn
   }

   public boolean clickBlock(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield hh6.n_e Lh50$f05;
      // 008: invokevirtual h50$f05.p98 ()Z
      // 00b: iload 3
      // 00c: ifne 0b0
      // 00f: ifeq 0a2
      // 012: goto 019
      // 015: invokestatic hh6.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 3
      // 01b: ifne 03c
      // 01e: goto 025
      // 021: invokestatic hh6.a (Loov;)Loov;
      // 024: athrow
      // 025: getfield hh6.n_e Lh50$f05;
      // 028: getstatic h50$f05.l18 Lh50$f05;
      // 02b: if_acmpne 03b
      // 02e: goto 035
      // 031: invokestatic hh6.a (Loov;)Loov;
      // 034: athrow
      // 035: bipush 0
      // 036: ireturn
      // 037: invokestatic hh6.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield hh6.yva Lc05;
      // 03f: getfield Minecraft.vg8 Ll86;
      // 042: invokevirtual EntityPlayerSP.gt3 ()Z
      // 045: iload 3
      // 046: ifne 0b0
      // 049: ifne 0a2
      // 04c: goto 053
      // 04f: invokestatic hh6.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: getfield hh6.yva Lc05;
      // 057: getfield Minecraft.tij Lkh3;
      // 05a: aload 1
      // 05b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 05e: invokeinterface zfz.r_y ()Le0x; 1
      // 063: astore 4
      // 065: aload 0
      // 066: getfield hh6.yva Lc05;
      // 069: getfield Minecraft.vg8 Ll86;
      // 06c: invokevirtual EntityPlayerSP.b5z ()Lerg;
      // 06f: astore 5
      // 071: aload 5
      // 073: iload 3
      // 074: ifne 089
      // 077: ifnonnull 087
      // 07a: goto 081
      // 07d: invokestatic hh6.a (Loov;)Loov;
      // 080: athrow
      // 081: bipush 0
      // 082: ireturn
      // 083: invokestatic hh6.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 5
      // 089: aload 4
      // 08b: invokevirtual erg.pgf (Le0x;)Z
      // 08e: iload 3
      // 08f: ifne 0b0
      // 092: ifne 0a2
      // 095: goto 09c
      // 098: invokestatic hh6.a (Loov;)Loov;
      // 09b: athrow
      // 09c: bipush 0
      // 09d: ireturn
      // 09e: invokestatic hh6.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield hh6.yva Lc05;
      // 0a6: getfield Minecraft.tij Lkh3;
      // 0a9: invokevirtual WorldClient.fve ()Lw5i;
      // 0ac: aload 1
      // 0ad: invokevirtual w5i.hka (Lmew;)Z
      // 0b0: iload 3
      // 0b1: ifne 0cb
      // 0b4: ifne 0c4
      // 0b7: goto 0be
      // 0ba: invokestatic hh6.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: bipush 0
      // 0bf: ireturn
      // 0c0: invokestatic hh6.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield hh6.n_e Lh50$f05;
      // 0c8: invokevirtual h50$f05.zlv ()Z
      // 0cb: iload 3
      // 0cc: ifne 111
      // 0cf: ifeq 106
      // 0d2: goto 0d9
      // 0d5: invokestatic hh6.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield hh6.ip7 Lp_k;
      // 0dd: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 0e0: dup
      // 0e1: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.gi_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 0e4: aload 1
      // 0e5: aload 2
      // 0e6: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 0e9: invokevirtual p_k.sxi (Lmz2;)V
      // 0ec: aload 0
      // 0ed: getfield hh6.yva Lc05;
      // 0f0: aload 0
      // 0f1: aload 1
      // 0f2: aload 2
      // 0f3: invokestatic hh6.uwf (Lc05;Lhh6;Lmew;Lvt2;)V
      // 0f6: aload 0
      // 0f7: bipush 5
      // 0f8: putfield hh6.hsn I
      // 0fb: iload 3
      // 0fc: ifeq 28c
      // 0ff: goto 106
      // 102: invokestatic hh6.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: getfield hh6.jar Z
      // 10a: goto 111
      // 10d: invokestatic hh6.a (Loov;)Loov;
      // 110: athrow
      // 111: iload 3
      // 112: ifne 14f
      // 115: ifeq 139
      // 118: goto 11f
      // 11b: invokestatic hh6.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 0
      // 120: aload 1
      // 121: invokespecial hh6.brf (Lmew;)Z
      // 124: iload 3
      // 125: ifne 28d
      // 128: goto 12f
      // 12b: invokestatic hh6.a (Loov;)Loov;
      // 12e: athrow
      // 12f: ifne 28c
      // 132: goto 139
      // 135: invokestatic hh6.a (Loov;)Loov;
      // 138: athrow
      // 139: aload 0
      // 13a: iload 3
      // 13b: ifne 183
      // 13e: goto 145
      // 141: invokestatic hh6.a (Loov;)Loov;
      // 144: athrow
      // 145: getfield hh6.jar Z
      // 148: goto 14f
      // 14b: invokestatic hh6.a (Loov;)Loov;
      // 14e: athrow
      // 14f: ifeq 16f
      // 152: aload 0
      // 153: getfield hh6.ip7 Lp_k;
      // 156: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 159: dup
      // 15a: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.t2e Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 15d: aload 0
      // 15e: getfield hh6.e1s Lmew;
      // 161: aload 2
      // 162: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 165: invokevirtual p_k.sxi (Lmz2;)V
      // 168: goto 16f
      // 16b: invokestatic hh6.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 0
      // 170: getfield hh6.ip7 Lp_k;
      // 173: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 176: dup
      // 177: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.gi_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 17a: aload 1
      // 17b: aload 2
      // 17c: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 17f: invokevirtual p_k.sxi (Lmz2;)V
      // 182: aload 0
      // 183: getfield hh6.yva Lc05;
      // 186: getfield Minecraft.tij Lkh3;
      // 189: aload 1
      // 18a: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 18d: invokeinterface zfz.r_y ()Le0x; 1
      // 192: astore 4
      // 194: aload 4
      // 196: invokevirtual e0x.p1r ()Lp3y;
      // 199: getstatic p3y.cei Lp3y;
      // 19c: if_acmpeq 1a7
      // 19f: bipush 1
      // 1a0: goto 1a8
      // 1a3: invokestatic hh6.a (Loov;)Loov;
      // 1a6: athrow
      // 1a7: bipush 0
      // 1a8: istore 5
      // 1aa: iload 5
      // 1ac: iload 3
      // 1ad: ifne 1f2
      // 1b0: ifeq 1f0
      // 1b3: goto 1ba
      // 1b6: invokestatic hh6.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: aload 0
      // 1bb: getfield hh6.veg F
      // 1be: fconst_0
      // 1bf: fcmpl
      // 1c0: iload 3
      // 1c1: ifne 1f2
      // 1c4: goto 1cb
      // 1c7: invokestatic hh6.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: ifne 1f0
      // 1ce: goto 1d5
      // 1d1: invokestatic hh6.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: aload 4
      // 1d7: aload 0
      // 1d8: getfield hh6.yva Lc05;
      // 1db: getfield Minecraft.tij Lkh3;
      // 1de: aload 1
      // 1df: aload 0
      // 1e0: getfield hh6.yva Lc05;
      // 1e3: getfield Minecraft.vg8 Ll86;
      // 1e6: invokevirtual e0x.uqb (Lt9d;Lmew;Lha9;)V
      // 1e9: goto 1f0
      // 1ec: invokestatic hh6.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: iload 5
      // 1f2: iload 3
      // 1f3: ifne 220
      // 1f6: ifeq 240
      // 1f9: goto 200
      // 1fc: invokestatic hh6.a (Loov;)Loov;
      // 1ff: athrow
      // 200: aload 4
      // 202: aload 0
      // 203: getfield hh6.yva Lc05;
      // 206: getfield Minecraft.vg8 Ll86;
      // 209: aload 0
      // 20a: getfield hh6.yva Lc05;
      // 20d: getfield Minecraft.vg8 Ll86;
      // 210: getfield EntityPlayerSP.oay Lt9d;
      // 213: aload 1
      // 214: invokevirtual e0x.lf9 (Lha9;Lt9d;Lmew;)F
      // 217: fconst_1
      // 218: fcmpl
      // 219: goto 220
      // 21c: invokestatic hh6.a (Loov;)Loov;
      // 21f: athrow
      // 220: iload 3
      // 221: ifne 23b
      // 224: iflt 240
      // 227: goto 22e
      // 22a: invokestatic hh6.a (Loov;)Loov;
      // 22d: athrow
      // 22e: aload 0
      // 22f: aload 1
      // 230: aload 2
      // 231: invokevirtual hh6.iix (Lmew;Lvt2;)Z
      // 234: goto 23b
      // 237: invokestatic hh6.a (Loov;)Loov;
      // 23a: athrow
      // 23b: pop
      // 23c: iload 3
      // 23d: ifeq 28c
      // 240: aload 0
      // 241: bipush 1
      // 242: putfield hh6.jar Z
      // 245: aload 0
      // 246: aload 1
      // 247: putfield hh6.e1s Lmew;
      // 24a: aload 0
      // 24b: aload 0
      // 24c: getfield hh6.yva Lc05;
      // 24f: getfield Minecraft.vg8 Ll86;
      // 252: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 255: putfield hh6.kqu Lerg;
      // 258: aload 0
      // 259: fconst_0
      // 25a: putfield hh6.veg F
      // 25d: aload 0
      // 25e: fconst_0
      // 25f: putfield hh6.kul F
      // 262: aload 0
      // 263: getfield hh6.yva Lc05;
      // 266: getfield Minecraft.tij Lkh3;
      // 269: aload 0
      // 26a: getfield hh6.yva Lc05;
      // 26d: getfield Minecraft.vg8 Ll86;
      // 270: invokevirtual EntityPlayerSP.jwu ()I
      // 273: aload 0
      // 274: getfield hh6.e1s Lmew;
      // 277: aload 0
      // 278: getfield hh6.veg F
      // 27b: ldc 10.0
      // 27d: nop
      // 27e: fmul
      // 27f: f2i
      // 280: bipush 1
      // 281: isub
      // 282: invokevirtual WorldClient.vn_ (ILmew;I)V
      // 285: goto 28c
      // 288: invokestatic hh6.a (Loov;)Loov;
      // 28b: athrow
      // 28c: bipush 1
      // 28d: ireturn
   }

   public void _6i() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 40
      // 09: getfield hh6.jar Z
      // 0c: ifeq 58
      // 0f: goto 16
      // 12: invokestatic hh6.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield hh6.ip7 Lp_k;
      // 1a: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 1d: dup
      // 1e: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.t2e Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 21: aload 0
      // 22: getfield hh6.e1s Lmew;
      // 25: getstatic vt2.m3r Lvt2;
      // 28: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 2b: invokevirtual p_k.sxi (Lmz2;)V
      // 2e: aload 0
      // 2f: bipush 0
      // 30: putfield hh6.jar Z
      // 33: aload 0
      // 34: fconst_0
      // 35: putfield hh6.veg F
      // 38: aload 0
      // 39: goto 40
      // 3c: invokestatic hh6.a (Loov;)Loov;
      // 3f: athrow
      // 40: getfield hh6.yva Lc05;
      // 43: getfield Minecraft.tij Lkh3;
      // 46: aload 0
      // 47: getfield hh6.yva Lc05;
      // 4a: getfield Minecraft.vg8 Ll86;
      // 4d: invokevirtual EntityPlayerSP.jwu ()I
      // 50: aload 0
      // 51: getfield hh6.e1s Lmew;
      // 54: bipush -1
      // 55: invokevirtual WorldClient.vn_ (ILmew;I)V
      // 58: return
   }

   public boolean onPlayerDamageBlock(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: invokespecial hh6.v_p ()V
      // 008: aload 0
      // 009: getfield hh6.hsn I
      // 00c: iload 3
      // 00d: ifeq 031
      // 010: ifle 02a
      // 013: goto 01a
      // 016: invokestatic hh6.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: dup
      // 01c: getfield hh6.hsn I
      // 01f: bipush 1
      // 020: isub
      // 021: putfield hh6.hsn I
      // 024: bipush 1
      // 025: ireturn
      // 026: invokestatic hh6.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield hh6.n_e Lh50$f05;
      // 02e: invokevirtual h50$f05.zlv ()Z
      // 031: iload 3
      // 032: ifeq 08f
      // 035: ifeq 08a
      // 038: goto 03f
      // 03b: invokestatic hh6.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield hh6.yva Lc05;
      // 043: getfield Minecraft.tij Lkh3;
      // 046: invokevirtual WorldClient.fve ()Lw5i;
      // 049: aload 1
      // 04a: invokevirtual w5i.hka (Lmew;)Z
      // 04d: iload 3
      // 04e: ifeq 08f
      // 051: goto 058
      // 054: invokestatic hh6.a (Loov;)Loov;
      // 057: athrow
      // 058: ifeq 08a
      // 05b: goto 062
      // 05e: invokestatic hh6.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: bipush 5
      // 064: putfield hh6.hsn I
      // 067: aload 0
      // 068: getfield hh6.ip7 Lp_k;
      // 06b: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 06e: dup
      // 06f: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.gi_ Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 072: aload 1
      // 073: aload 2
      // 074: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 077: invokevirtual p_k.sxi (Lmz2;)V
      // 07a: aload 0
      // 07b: getfield hh6.yva Lc05;
      // 07e: aload 0
      // 07f: aload 1
      // 080: aload 2
      // 081: invokestatic hh6.uwf (Lc05;Lhh6;Lmew;Lvt2;)V
      // 084: bipush 1
      // 085: ireturn
      // 086: invokestatic hh6.a (Loov;)Loov;
      // 089: athrow
      // 08a: aload 0
      // 08b: aload 1
      // 08c: invokespecial hh6.brf (Lmew;)Z
      // 08f: iload 3
      // 090: ifeq 1e2
      // 093: ifeq 1dc
      // 096: goto 09d
      // 099: invokestatic hh6.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield hh6.yva Lc05;
      // 0a1: getfield Minecraft.tij Lkh3;
      // 0a4: aload 1
      // 0a5: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0a8: invokeinterface zfz.r_y ()Le0x; 1
      // 0ad: astore 4
      // 0af: iload 3
      // 0b0: ifeq 0f0
      // 0b3: aload 4
      // 0b5: invokevirtual e0x.p1r ()Lp3y;
      // 0b8: getstatic p3y.cei Lp3y;
      // 0bb: if_acmpne 0d0
      // 0be: goto 0c5
      // 0c1: invokestatic hh6.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: bipush 0
      // 0c7: putfield hh6.jar Z
      // 0ca: bipush 0
      // 0cb: ireturn
      // 0cc: invokestatic hh6.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: dup
      // 0d2: getfield hh6.veg F
      // 0d5: aload 4
      // 0d7: aload 0
      // 0d8: getfield hh6.yva Lc05;
      // 0db: getfield Minecraft.vg8 Ll86;
      // 0de: aload 0
      // 0df: getfield hh6.yva Lc05;
      // 0e2: getfield Minecraft.vg8 Ll86;
      // 0e5: getfield EntityPlayerSP.oay Lt9d;
      // 0e8: aload 1
      // 0e9: invokevirtual e0x.lf9 (Lha9;Lt9d;Lmew;)F
      // 0ec: fadd
      // 0ed: putfield hh6.veg F
      // 0f0: aload 0
      // 0f1: getfield hh6.kul F
      // 0f4: ldc 4.0
      // 0f6: nop
      // 0f7: frem
      // 0f8: fconst_0
      // 0f9: fcmpl
      // 0fa: iload 3
      // 0fb: ifeq 174
      // 0fe: ifne 164
      // 101: goto 108
      // 104: invokestatic hh6.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: getfield hh6.yva Lc05;
      // 10c: invokevirtual Minecraft.yp9 ()Ldbu;
      // 10f: new vs1
      // 112: dup
      // 113: new gdz
      // 116: dup
      // 117: aload 4
      // 119: getfield e0x.zu6 Le0x$zvv;
      // 11c: invokevirtual e0x$zvv.i3r ()Ljava/lang/String;
      // 11f: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 122: aload 4
      // 124: getfield e0x.zu6 Le0x$zvv;
      // 127: invokevirtual e0x$zvv.dnt ()F
      // 12a: fconst_1
      // 12b: fadd
      // 12c: ldc 8.0
      // 12e: nop
      // 12f: fdiv
      // 130: aload 4
      // 132: getfield e0x.zu6 Le0x$zvv;
      // 135: invokevirtual e0x$zvv.kjj ()F
      // 138: ldc 0.5
      // 13a: nop
      // 13b: fmul
      // 13c: aload 1
      // 13d: invokevirtual mew.getX ()I
      // 140: i2f
      // 141: ldc 0.5
      // 143: nop
      // 144: fadd
      // 145: aload 1
      // 146: invokevirtual mew.getY ()I
      // 149: i2f
      // 14a: ldc 0.5
      // 14c: nop
      // 14d: fadd
      // 14e: aload 1
      // 14f: invokevirtual mew.getZ ()I
      // 152: i2f
      // 153: ldc 0.5
      // 155: nop
      // 156: fadd
      // 157: invokespecial vs1.<init> (Lgdz;FFFFF)V
      // 15a: invokevirtual dbu.mak (Ljp4;)V
      // 15d: goto 164
      // 160: invokestatic hh6.a (Loov;)Loov;
      // 163: athrow
      // 164: aload 0
      // 165: dup
      // 166: getfield hh6.kul F
      // 169: fconst_1
      // 16a: fadd
      // 16b: putfield hh6.kul F
      // 16e: aload 0
      // 16f: getfield hh6.veg F
      // 172: fconst_1
      // 173: fcmpl
      // 174: iload 3
      // 175: ifeq 1db
      // 178: iflt 1b7
      // 17b: goto 182
      // 17e: invokestatic hh6.a (Loov;)Loov;
      // 181: athrow
      // 182: aload 0
      // 183: bipush 0
      // 184: putfield hh6.jar Z
      // 187: aload 0
      // 188: getfield hh6.ip7 Lp_k;
      // 18b: new net/minecraft/network/play/client/C07PacketPlayerDigging
      // 18e: dup
      // 18f: getstatic net/minecraft/network/play/client/C07PacketPlayerDigging$pl2.x56 Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;
      // 192: aload 1
      // 193: aload 2
      // 194: invokespecial net/minecraft/network/play/client/C07PacketPlayerDigging.<init> (Lnet/minecraft/network/play/client/C07PacketPlayerDigging$pl2;Lmew;Lvt2;)V
      // 197: invokevirtual p_k.sxi (Lmz2;)V
      // 19a: aload 0
      // 19b: aload 1
      // 19c: aload 2
      // 19d: invokevirtual hh6.iix (Lmew;Lvt2;)Z
      // 1a0: pop
      // 1a1: aload 0
      // 1a2: fconst_0
      // 1a3: putfield hh6.veg F
      // 1a6: aload 0
      // 1a7: fconst_0
      // 1a8: putfield hh6.kul F
      // 1ab: aload 0
      // 1ac: bipush 5
      // 1ad: putfield hh6.hsn I
      // 1b0: goto 1b7
      // 1b3: invokestatic hh6.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: getfield hh6.yva Lc05;
      // 1bb: getfield Minecraft.tij Lkh3;
      // 1be: aload 0
      // 1bf: getfield hh6.yva Lc05;
      // 1c2: getfield Minecraft.vg8 Ll86;
      // 1c5: invokevirtual EntityPlayerSP.jwu ()I
      // 1c8: aload 0
      // 1c9: getfield hh6.e1s Lmew;
      // 1cc: aload 0
      // 1cd: getfield hh6.veg F
      // 1d0: ldc 10.0
      // 1d2: nop
      // 1d3: fmul
      // 1d4: f2i
      // 1d5: bipush 1
      // 1d6: isub
      // 1d7: invokevirtual WorldClient.vn_ (ILmew;I)V
      // 1da: bipush 1
      // 1db: ireturn
      // 1dc: aload 0
      // 1dd: aload 1
      // 1de: aload 2
      // 1df: invokevirtual hh6.clickBlock (Lmew;Lvt2;)Z
      // 1e2: ireturn
   }

   public float gxw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: getstatic ModuleRegistry.vb_ Lee_;
      // 07: invokevirtual ee_.klu ()Z
      // 0a: iload 1
      // 0b: ifne 47
      // 0e: ifeq 40
      // 11: goto 18
      // 14: invokestatic hh6.a (Loov;)Loov;
      // 17: athrow
      // 18: getstatic ee_.liz Lcn7;
      // 1b: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 1e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 21: iload 1
      // 22: ifne 47
      // 25: goto 2c
      // 28: invokestatic hh6.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifeq 40
      // 2f: goto 36
      // 32: invokestatic hh6.a (Loov;)Loov;
      // 35: athrow
      // 36: ldc 5.0
      // 38: nop
      // 39: goto 57
      // 3c: invokestatic hh6.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield hh6.n_e Lh50$f05;
      // 44: invokevirtual h50$f05.zlv ()Z
      // 47: ifeq 54
      // 4a: ldc 5.0
      // 4c: nop
      // 4d: goto 57
      // 50: invokestatic hh6.a (Loov;)Loov;
      // 53: athrow
      // 54: ldc 4.5
      // 56: nop
      // 57: freturn
   }

   public void fpm() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial hh6.v_p ()V
      // 08: aload 0
      // 09: getfield hh6.ip7 Lp_k;
      // 0c: invokevirtual p_k._m3 ()Lhv0;
      // 0f: iload 1
      // 10: ifeq 43
      // 13: invokevirtual hv0.jy3 ()Z
      // 16: ifeq 35
      // 19: goto 20
      // 1c: invokestatic hh6.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield hh6.ip7 Lp_k;
      // 24: invokevirtual p_k._m3 ()Lhv0;
      // 27: invokevirtual hv0.v2s ()V
      // 2a: iload 1
      // 2b: ifne 46
      // 2e: goto 35
      // 31: invokestatic hh6.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield hh6.ip7 Lp_k;
      // 39: invokevirtual p_k._m3 ()Lhv0;
      // 3c: goto 43
      // 3f: invokestatic hh6.a (Loov;)Loov;
      // 42: athrow
      // 43: invokevirtual hv0.kh8 ()V
      // 46: return
   }

   private boolean brf(mew param1) {
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
      // 05: getfield hh6.yva Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 0e: astore 3
      // 0f: aload 0
      // 10: getfield hh6.kqu Lerg;
      // 13: iload 2
      // 14: ifeq 22
      // 17: ifnonnull 2d
      // 1a: goto 21
      // 1d: invokestatic hh6.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: ifnonnull 2d
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic hh6.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: istore 4
      // 30: aload 0
      // 31: getfield hh6.kqu Lerg;
      // 34: iload 2
      // 35: ifeq 43
      // 38: ifnull ce
      // 3b: goto 42
      // 3e: invokestatic hh6.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 3
      // 43: iload 2
      // 44: ifeq 52
      // 47: ifnull ce
      // 4a: goto 51
      // 4d: invokestatic hh6.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 3
      // 52: iload 2
      // 53: ifeq 72
      // 56: invokevirtual erg.gn1 ()Lu7m;
      // 59: aload 0
      // 5a: getfield hh6.kqu Lerg;
      // 5d: invokevirtual erg.gn1 ()Lu7m;
      // 60: if_acmpne cb
      // 63: goto 6a
      // 66: invokestatic hh6.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 3
      // 6b: goto 72
      // 6e: invokestatic hh6.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 0
      // 73: getfield hh6.kqu Lerg;
      // 76: invokestatic erg.gjp (Lerg;Lerg;)Z
      // 79: iload 2
      // 7a: ifeq 92
      // 7d: ifeq cb
      // 80: goto 87
      // 83: invokestatic hh6.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 3
      // 88: invokevirtual erg.dw2 ()Z
      // 8b: goto 92
      // 8e: invokestatic hh6.a (Loov;)Loov;
      // 91: athrow
      // 92: iload 2
      // 93: ifeq c8
      // 96: ifne c0
      // 99: goto a0
      // 9c: invokestatic hh6.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 3
      // a1: invokevirtual erg.j6_ ()I
      // a4: iload 2
      // a5: ifeq c8
      // a8: goto af
      // ab: invokestatic hh6.a (Loov;)Loov;
      // ae: athrow
      // af: aload 0
      // b0: getfield hh6.kqu Lerg;
      // b3: invokevirtual erg.j6_ ()I
      // b6: if_icmpne cb
      // b9: goto c0
      // bc: invokestatic hh6.a (Loov;)Loov;
      // bf: athrow
      // c0: bipush 1
      // c1: goto c8
      // c4: invokestatic hh6.a (Loov;)Loov;
      // c7: athrow
      // c8: goto cc
      // cb: bipush 0
      // cc: istore 4
      // ce: aload 1
      // cf: aload 0
      // d0: getfield hh6.e1s Lmew;
      // d3: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // d6: iload 2
      // d7: ifeq e6
      // da: ifeq f8
      // dd: goto e4
      // e0: invokestatic hh6.a (Loov;)Loov;
      // e3: athrow
      // e4: iload 4
      // e6: iload 2
      // e7: ifeq f5
      // ea: ifeq f8
      // ed: goto f4
      // f0: invokestatic hh6.a (Loov;)Loov;
      // f3: athrow
      // f4: bipush 1
      // f5: goto f9
      // f8: bipush 0
      // f9: ireturn
   }

   private void v_p() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hh6.yva Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: getfield EntityPlayerSP.up_ Ljnq;
      // 0e: getfield jnq.nb5 I
      // 11: istore 2
      // 12: iload 1
      // 13: ifeq 31
      // 16: iload 2
      // 17: aload 0
      // 18: getfield hh6.fj2 I
      // 1b: if_icmpeq 43
      // 1e: goto 25
      // 21: invokestatic hh6.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: iload 2
      // 27: putfield hh6.fj2 I
      // 2a: goto 31
      // 2d: invokestatic hh6.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield hh6.ip7 Lp_k;
      // 35: new net/minecraft/network/play/client/C09PacketHeldItemChange
      // 38: dup
      // 39: aload 0
      // 3a: getfield hh6.fj2 I
      // 3d: invokespecial net/minecraft/network/play/client/C09PacketHeldItemChange.<init> (I)V
      // 40: invokevirtual p_k.sxi (Lmz2;)V
      // 43: return
   }

   public boolean onPlayerRightClick(EntityPlayerSP param1, WorldClient param2, erg param3, mew param4, vt2 param5, fqr param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 6
      // 002: invokestatic ncl.zpu (Ljava/lang/Object;)V
      // 005: aload 0
      // 006: invokespecial hh6.v_p ()V
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: aload 6
      // 00e: getfield fqr.lvi D
      // 011: aload 4
      // 013: invokevirtual mew.getX ()I
      // 016: i2d
      // 017: dsub
      // 018: d2f
      // 019: fstore 8
      // 01b: aload 6
      // 01d: getfield fqr.gn5 D
      // 020: aload 4
      // 022: invokevirtual mew.getY ()I
      // 025: i2d
      // 026: dsub
      // 027: d2f
      // 028: fstore 9
      // 02a: aload 6
      // 02c: getfield fqr.bn2 D
      // 02f: aload 4
      // 031: invokevirtual mew.getZ ()I
      // 034: i2d
      // 035: dsub
      // 036: d2f
      // 037: fstore 10
      // 039: istore 7
      // 03b: bipush 0
      // 03c: istore 11
      // 03e: aload 0
      // 03f: iload 7
      // 041: ifne 063
      // 044: getfield hh6.yva Lc05;
      // 047: getfield Minecraft.tij Lkh3;
      // 04a: invokevirtual WorldClient.fve ()Lw5i;
      // 04d: aload 4
      // 04f: invokevirtual w5i.hka (Lmew;)Z
      // 052: ifne 062
      // 055: goto 05c
      // 058: invokestatic hh6.a (Loov;)Loov;
      // 05b: athrow
      // 05c: bipush 0
      // 05d: ireturn
      // 05e: invokestatic hh6.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: iload 7
      // 065: ifne 13b
      // 068: getfield hh6.n_e Lh50$f05;
      // 06b: getstatic h50$f05.l18 Lh50$f05;
      // 06e: if_acmpeq 13a
      // 071: goto 078
      // 074: invokestatic hh6.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 2
      // 079: aload 4
      // 07b: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 07e: astore 12
      // 080: aload 1
      // 081: invokevirtual EntityPlayerSP.hzv ()Z
      // 084: iload 7
      // 086: ifne 0c0
      // 089: ifeq 0a1
      // 08c: goto 093
      // 08f: invokestatic hh6.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 1
      // 094: invokevirtual EntityPlayerSP.tsc ()Lerg;
      // 097: ifnonnull 0d2
      // 09a: goto 0a1
      // 09d: invokestatic hh6.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 12
      // 0a3: invokeinterface zfz.r_y ()Le0x; 1
      // 0a8: aload 2
      // 0a9: aload 4
      // 0ab: aload 12
      // 0ad: aload 1
      // 0ae: aload 5
      // 0b0: fload 8
      // 0b2: fload 9
      // 0b4: fload 10
      // 0b6: invokevirtual e0x.cl2 (Lt9d;Lmew;Lzfz;Lha9;Lvt2;FFF)Z
      // 0b9: goto 0c0
      // 0bc: invokestatic hh6.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 7
      // 0c2: ifne 0d4
      // 0c5: ifeq 0d2
      // 0c8: goto 0cf
      // 0cb: invokestatic hh6.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: bipush 1
      // 0d0: istore 11
      // 0d2: iload 11
      // 0d4: iload 7
      // 0d6: ifne 15e
      // 0d9: ifne 13a
      // 0dc: goto 0e3
      // 0df: invokestatic hh6.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 3
      // 0e4: iload 7
      // 0e6: ifne 0fb
      // 0e9: goto 0f0
      // 0ec: invokestatic hh6.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: ifnull 13a
      // 0f3: goto 0fa
      // 0f6: invokestatic hh6.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 3
      // 0fb: invokevirtual erg.gn1 ()Lu7m;
      // 0fe: instanceof gun
      // 101: iload 7
      // 103: ifne 15e
      // 106: ifeq 13a
      // 109: goto 110
      // 10c: invokestatic hh6.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 3
      // 111: invokevirtual erg.gn1 ()Lu7m;
      // 114: checkcast gun
      // 117: astore 13
      // 119: aload 13
      // 11b: aload 2
      // 11c: aload 4
      // 11e: aload 5
      // 120: aload 1
      // 121: aload 3
      // 122: invokevirtual gun.hty (Lt9d;Lmew;Lvt2;Lha9;Lerg;)Z
      // 125: iload 7
      // 127: ifne 15e
      // 12a: ifne 13a
      // 12d: goto 134
      // 130: invokestatic hh6.a (Loov;)Loov;
      // 133: athrow
      // 134: bipush 0
      // 135: ireturn
      // 136: invokestatic hh6.a (Loov;)Loov;
      // 139: athrow
      // 13a: aload 0
      // 13b: getfield hh6.ip7 Lp_k;
      // 13e: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
      // 141: dup
      // 142: aload 4
      // 144: aload 5
      // 146: invokevirtual vt2.c3s ()I
      // 149: aload 1
      // 14a: getfield EntityPlayerSP.up_ Ljnq;
      // 14d: invokevirtual jnq.dxs ()Lerg;
      // 150: fload 8
      // 152: fload 9
      // 154: fload 10
      // 156: invokespecial net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.<init> (Lmew;ILerg;FFF)V
      // 159: invokevirtual p_k.sxi (Lmz2;)V
      // 15c: iload 11
      // 15e: iload 7
      // 160: ifne 1e4
      // 163: ifne 1e3
      // 166: goto 16d
      // 169: invokestatic hh6.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aload 0
      // 16e: getfield hh6.n_e Lh50$f05;
      // 171: getstatic h50$f05.l18 Lh50$f05;
      // 174: if_acmpeq 1e3
      // 177: goto 17e
      // 17a: invokestatic hh6.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 3
      // 17f: ifnonnull 18f
      // 182: goto 189
      // 185: invokestatic hh6.a (Loov;)Loov;
      // 188: athrow
      // 189: bipush 0
      // 18a: ireturn
      // 18b: invokestatic hh6.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 0
      // 190: getfield hh6.n_e Lh50$f05;
      // 193: invokevirtual h50$f05.zlv ()Z
      // 196: iload 7
      // 198: ifne 1e2
      // 19b: ifeq 1d2
      // 19e: goto 1a5
      // 1a1: invokestatic hh6.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: aload 3
      // 1a6: invokevirtual erg.j6_ ()I
      // 1a9: istore 12
      // 1ab: aload 3
      // 1ac: getfield erg.qd2 I
      // 1af: istore 13
      // 1b1: aload 3
      // 1b2: aload 1
      // 1b3: aload 2
      // 1b4: aload 4
      // 1b6: aload 5
      // 1b8: fload 8
      // 1ba: fload 9
      // 1bc: fload 10
      // 1be: invokevirtual erg.l3w (Lha9;Lt9d;Lmew;Lvt2;FFF)Z
      // 1c1: istore 14
      // 1c3: aload 3
      // 1c4: iload 12
      // 1c6: invokevirtual erg.awe (I)V
      // 1c9: aload 3
      // 1ca: iload 13
      // 1cc: putfield erg.qd2 I
      // 1cf: iload 14
      // 1d1: ireturn
      // 1d2: aload 3
      // 1d3: aload 1
      // 1d4: aload 2
      // 1d5: aload 4
      // 1d7: aload 5
      // 1d9: fload 8
      // 1db: fload 9
      // 1dd: fload 10
      // 1df: invokevirtual erg.l3w (Lha9;Lt9d;Lmew;Lvt2;FFF)Z
      // 1e2: ireturn
      // 1e3: bipush 1
      // 1e4: ireturn
   }

   public boolean sendUseItem(ha9 param1, OpaquePredicate param2, erg param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 26
      // 0b: getfield hh6.n_e Lh50$f05;
      // 0e: getstatic h50$f05.l18 Lh50$f05;
      // 11: if_acmpne 21
      // 14: goto 1b
      // 17: invokestatic hh6.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic hh6.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: invokespecial hh6.v_p ()V
      // 25: aload 0
      // 26: getfield hh6.ip7 Lp_k;
      // 29: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
      // 2c: dup
      // 2d: aload 1
      // 2e: getfield ha9.up_ Ljnq;
      // 31: invokevirtual jnq.dxs ()Lerg;
      // 34: invokespecial net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.<init> (Lerg;)V
      // 37: invokevirtual p_k.sxi (Lmz2;)V
      // 3a: aload 3
      // 3b: getfield erg.qd2 I
      // 3e: istore 5
      // 40: aload 3
      // 41: aload 2
      // 42: aload 1
      // 43: invokevirtual erg.vwi (Lt9d;Lha9;)Lerg;
      // 46: astore 6
      // 48: aload 6
      // 4a: iload 4
      // 4c: ifne a2
      // 4f: aload 3
      // 50: if_acmpne 88
      // 53: goto 5a
      // 56: invokestatic hh6.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 6
      // 5c: iload 4
      // 5e: ifne 74
      // 61: goto 68
      // 64: invokestatic hh6.a (Loov;)Loov;
      // 67: athrow
      // 68: ifnull cd
      // 6b: goto 72
      // 6e: invokestatic hh6.a (Loov;)Loov;
      // 71: athrow
      // 72: aload 6
      // 74: getfield erg.qd2 I
      // 77: iload 4
      // 79: ifne ce
      // 7c: iload 5
      // 7e: if_icmpeq cd
      // 81: goto 88
      // 84: invokestatic hh6.a (Loov;)Loov;
      // 87: athrow
      // 88: aload 1
      // 89: getfield ha9.up_ Ljnq;
      // 8c: getfield jnq.c41 [Lerg;
      // 8f: aload 1
      // 90: getfield ha9.up_ Ljnq;
      // 93: getfield jnq.nb5 I
      // 96: aload 6
      // 98: aastore
      // 99: aload 6
      // 9b: goto a2
      // 9e: invokestatic hh6.a (Loov;)Loov;
      // a1: athrow
      // a2: getfield erg.qd2 I
      // a5: iload 4
      // a7: ifne cc
      // aa: ifne cb
      // ad: goto b4
      // b0: invokestatic hh6.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 1
      // b5: getfield ha9.up_ Ljnq;
      // b8: getfield jnq.c41 [Lerg;
      // bb: aload 1
      // bc: getfield ha9.up_ Ljnq;
      // bf: getfield jnq.nb5 I
      // c2: aconst_null
      // c3: aastore
      // c4: goto cb
      // c7: invokestatic hh6.a (Loov;)Loov;
      // ca: athrow
      // cb: bipush 1
      // cc: ireturn
      // cd: bipush 0
      // ce: ireturn
   }

   public EntityPlayerSP whz(OpaquePredicate var1, ik0 var2) {
      return new EntityPlayerSP(this.yva, var1, this.ip7, var2);
   }

   public void lp9(ha9 var1, EntityLivingBase var2) {
      try {
         this.v_p();
         this.ip7.sxi(new C02PacketUseEntity(var2, C02PacketUseEntity$_y6.cb5));
         if (this.n_e != h50$f05.l18) {
            var1.v2x(var2);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   public boolean interactWithEntitySendPacket(ha9 param1, EntityLivingBase param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial hh6.v_p ()V
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 0
      // 08: getfield hh6.ip7 Lp_k;
      // 0b: new net/minecraft/network/play/client/C02PacketUseEntity
      // 0e: dup
      // 0f: aload 2
      // 10: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.wc3 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 13: invokespecial net/minecraft/network/play/client/C02PacketUseEntity.<init> (Li2h;Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;)V
      // 16: invokevirtual p_k.sxi (Lmz2;)V
      // 19: istore 3
      // 1a: aload 0
      // 1b: getfield hh6.n_e Lh50$f05;
      // 1e: getstatic h50$f05.l18 Lh50$f05;
      // 21: if_acmpeq 42
      // 24: aload 1
      // 25: aload 2
      // 26: invokevirtual ha9.gve (Li2h;)Z
      // 29: iload 3
      // 2a: ifne 3f
      // 2d: goto 34
      // 30: invokestatic hh6.a (Loov;)Loov;
      // 33: athrow
      // 34: ifeq 42
      // 37: goto 3e
      // 3a: invokestatic hh6.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
   }

   public boolean isPlayerRightClickingOnEntity(ha9 param1, EntityLivingBase param2, akm param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial hh6.v_p ()V
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: new fqr
      // 0a: dup
      // 0b: aload 3
      // 0c: getfield akm.jhn Lfqr;
      // 0f: getfield fqr.lvi D
      // 12: aload 2
      // 13: getfield EntityLivingBase.o2v D
      // 16: dsub
      // 17: aload 3
      // 18: getfield akm.jhn Lfqr;
      // 1b: getfield fqr.gn5 D
      // 1e: aload 2
      // 1f: getfield EntityLivingBase.kfp D
      // 22: dsub
      // 23: aload 3
      // 24: getfield akm.jhn Lfqr;
      // 27: getfield fqr.bn2 D
      // 2a: aload 2
      // 2b: getfield EntityLivingBase.vbd D
      // 2e: dsub
      // 2f: invokespecial fqr.<init> (DDD)V
      // 32: astore 5
      // 34: aload 0
      // 35: getfield hh6.ip7 Lp_k;
      // 38: new net/minecraft/network/play/client/C02PacketUseEntity
      // 3b: dup
      // 3c: aload 2
      // 3d: aload 5
      // 3f: invokespecial net/minecraft/network/play/client/C02PacketUseEntity.<init> (Li2h;Lfqr;)V
      // 42: invokevirtual p_k.sxi (Lmz2;)V
      // 45: istore 4
      // 47: aload 0
      // 48: getfield hh6.n_e Lh50$f05;
      // 4b: getstatic h50$f05.l18 Lh50$f05;
      // 4e: if_acmpeq 72
      // 51: aload 2
      // 52: aload 1
      // 53: aload 5
      // 55: invokevirtual EntityLivingBase.rc1 (Lha9;Lfqr;)Z
      // 58: iload 4
      // 5a: ifeq 6f
      // 5d: goto 64
      // 60: invokestatic hh6.a (Loov;)Loov;
      // 63: athrow
      // 64: ifeq 72
      // 67: goto 6e
      // 6a: invokestatic hh6.a (Loov;)Loov;
      // 6d: athrow
      // 6e: bipush 1
      // 6f: goto 73
      // 72: bipush 0
      // 73: ireturn
   }

   public erg efg(int var1, int var2, int var3, int var4, ha9 var5) {
      short var6 = var5.daw.x7q(var5.up_);
      erg var7 = var5.daw.b7m(var2, var3, var4, var5);
      this.ip7.sxi(new C0EPacketClickWindow(var1, var2, var3, var4, var7, var6));
      return var7;
   }

   public void j_y(int var1, int var2) {
      this.ip7.sxi(new C11PacketEnchantItem(var1, var2));
   }

   public void h68(erg param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 21
      // 09: getfield hh6.n_e Lh50$f05;
      // 0c: invokevirtual h50$f05.zlv ()Z
      // 0f: ifeq 30
      // 12: goto 19
      // 15: invokestatic hh6.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: goto 21
      // 1d: invokestatic hh6.a (Loov;)Loov;
      // 20: athrow
      // 21: getfield hh6.ip7 Lp_k;
      // 24: new net/minecraft/network/play/client/C10PacketCreativeInventoryAction
      // 27: dup
      // 28: iload 2
      // 29: aload 1
      // 2a: invokespecial net/minecraft/network/play/client/C10PacketCreativeInventoryAction.<init> (ILerg;)V
      // 2d: invokevirtual p_k.sxi (Lmz2;)V
      // 30: return
   }

   public void oxh(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield hh6.n_e Lh50$f05;
      // 04: invokevirtual h50$f05.zlv ()Z
      // 07: ifeq 2c
      // 0a: aload 1
      // 0b: ifnull 2c
      // 0e: goto 15
      // 11: invokestatic hh6.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: getfield hh6.ip7 Lp_k;
      // 19: new net/minecraft/network/play/client/C10PacketCreativeInventoryAction
      // 1c: dup
      // 1d: bipush -1
      // 1e: aload 1
      // 1f: invokespecial net/minecraft/network/play/client/C10PacketCreativeInventoryAction.<init> (ILerg;)V
      // 22: invokevirtual p_k.sxi (Lmz2;)V
      // 25: goto 2c
      // 28: invokestatic hh6.a (Loov;)Loov;
      // 2b: athrow
      // 2c: return
   }

   public void a0f(ha9 var1) {
      this.v_p();
      this.ip7.sxi(new C07PacketPlayerDigging(C07PacketPlayerDigging$pl2.md_, mew._9b, vt2.m3r));
      var1.puk();
   }

   public boolean ohd() {
      return this.n_e.wdc();
   }

   public boolean rgg() {
      int var1 = OpaquePredicate.b();

      try {
         boolean var10000 = this.n_e.zlv();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public boolean l2q() {
      return this.n_e.zlv();
   }

   public boolean p65() {
      return this.n_e.zlv();
   }

   public boolean p0g() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hh6.yva Lc05;
      // 08: getfield Minecraft.vg8 Ll86;
      // 0b: invokevirtual EntityPlayerSP.i0e ()Z
      // 0e: iload 1
      // 0f: ifeq 30
      // 12: ifeq 42
      // 15: goto 1c
      // 18: invokestatic hh6.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield hh6.yva Lc05;
      // 20: getfield Minecraft.vg8 Ll86;
      // 23: getfield EntityPlayerSP.hzp Li2h;
      // 26: instanceof zfo
      // 29: goto 30
      // 2c: invokestatic hh6.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 1
      // 31: ifeq 3f
      // 34: ifeq 42
      // 37: goto 3e
      // 3a: invokestatic hh6.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: ireturn
   }

   public boolean be4() {
      try {
         if (this.n_e == h50$f05.l18) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public h50$f05 fdl() {
      return this.n_e;
   }

   public boolean rq9() {
      return this.jar;
   }

   public int t5_() {
      return this.hsn;
   }

   public void zrs(int var1) {
      this.hsn = var1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
