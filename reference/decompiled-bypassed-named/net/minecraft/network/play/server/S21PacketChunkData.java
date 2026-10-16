package net.minecraft.network.play.server;

public class S21PacketChunkData implements mz2 {
   private int a7s;
   private int rad;
   private S21PacketChunkData$qjp gs0;
   private boolean spj;

   public S21PacketChunkData() {
   }

   public S21PacketChunkData(tts var1, boolean var2, int var3) {
      this.a7s = var1.nzx;
      String var10000 = S14PacketEntity.b();
      this.rad = var1.yxl;
      String var4 = var10000;

      tts var10001;
      boolean var10002;
      boolean var10003;
      label22: {
         label21: {
            try {
               this.spj = var2;
               var6 = this;
               var10001 = var1;
               var10002 = var2;
               var10003 = var1.v8m().vzz.qyc();
               if (var4 == null) {
                  break label22;
               }

               if (!var10003) {
                  break label21;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10003 = false;
            break label22;
         }

         var10003 = true;
      }

      var6.gs0 = d_9(var10001, var10002, var10003, var3);
   }

   @Override
   public void ajj(nfj var1) {
      this.a7s = var1.readInt();
      this.rad = var1.readInt();
      this.spj = var1.readBoolean();
      this.gs0 = new S21PacketChunkData$qjp();
      this.gs0.kvj = var1.readShort();
      this.gs0.rww = var1.z7_();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeInt(this.a7s);
      var1.writeInt(this.rad);
      var1.writeBoolean(this.spj);
      var1.writeShort((short)(this.gs0.kvj & 65535));
      var1.a4q(this.gs0.rww);
   }

   public void msa(jsv var1) {
      var1.zxk(this);
   }

   public byte[] uph() {
      return this.gs0.rww;
   }

   public static int m6n(int param0, boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 0
      // 01: bipush 2
      // 02: imul
      // 03: bipush 16
      // 05: imul
      // 06: bipush 16
      // 08: imul
      // 09: bipush 16
      // 0b: imul
      // 0c: istore 4
      // 0e: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 11: iload 0
      // 12: bipush 16
      // 14: imul
      // 15: bipush 16
      // 17: imul
      // 18: bipush 16
      // 1a: imul
      // 1b: bipush 2
      // 1c: idiv
      // 1d: istore 5
      // 1f: astore 3
      // 20: iload 1
      // 21: aload 3
      // 22: ifnull 42
      // 25: ifeq 45
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 2e: athrow
      // 2f: iload 0
      // 30: bipush 16
      // 32: imul
      // 33: bipush 16
      // 35: imul
      // 36: bipush 16
      // 38: imul
      // 39: bipush 2
      // 3a: idiv
      // 3b: goto 42
      // 3e: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 41: athrow
      // 42: goto 46
      // 45: bipush 0
      // 46: istore 6
      // 48: iload 2
      // 49: aload 3
      // 4a: ifnull 5a
      // 4d: ifeq 5d
      // 50: goto 57
      // 53: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 56: athrow
      // 57: sipush 256
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: istore 7
      // 60: iload 4
      // 62: iload 5
      // 64: iadd
      // 65: iload 6
      // 67: iadd
      // 68: iload 7
      // 6a: iadd
      // 6b: ireturn
   }

   public static S21PacketChunkData$qjp d_9(tts param0, boolean param1, boolean param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual tts.azq ()[Lk7x;
      // 004: astore 5
      // 006: new net/minecraft/network/play/server/S21PacketChunkData$qjp
      // 009: dup
      // 00a: invokespecial net/minecraft/network/play/server/S21PacketChunkData$qjp.<init> ()V
      // 00d: astore 6
      // 00f: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 012: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 015: astore 7
      // 017: bipush 0
      // 018: istore 8
      // 01a: astore 4
      // 01c: iload 8
      // 01e: aload 5
      // 020: arraylength
      // 021: if_icmpge 0bd
      // 024: aload 5
      // 026: iload 8
      // 028: aaload
      // 029: astore 9
      // 02b: aload 4
      // 02d: ifnull 0d4
      // 030: aload 4
      // 032: ifnull 0b8
      // 035: goto 03c
      // 038: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 9
      // 03e: ifnull 0b5
      // 041: goto 048
      // 044: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 1
      // 049: aload 4
      // 04b: ifnull 087
      // 04e: goto 055
      // 051: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 054: athrow
      // 055: ifeq 07a
      // 058: goto 05f
      // 05b: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 9
      // 061: invokevirtual k7x.z71 ()Z
      // 064: aload 4
      // 066: ifnull 087
      // 069: goto 070
      // 06c: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 06f: athrow
      // 070: ifne 0b5
      // 073: goto 07a
      // 076: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 079: athrow
      // 07a: iload 3
      // 07b: bipush 1
      // 07c: iload 8
      // 07e: ishl
      // 07f: iand
      // 080: goto 087
      // 083: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 4
      // 089: ifnull 0b4
      // 08c: ifeq 0b5
      // 08f: goto 096
      // 092: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 6
      // 098: dup
      // 099: getfield net/minecraft/network/play/server/S21PacketChunkData$qjp.kvj I
      // 09c: bipush 1
      // 09d: iload 8
      // 09f: ishl
      // 0a0: ior
      // 0a1: putfield net/minecraft/network/play/server/S21PacketChunkData$qjp.kvj I
      // 0a4: aload 7
      // 0a6: aload 9
      // 0a8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ad: goto 0b4
      // 0b0: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: pop
      // 0b5: iinc 8 1
      // 0b8: aload 4
      // 0ba: ifnonnull 01c
      // 0bd: aload 6
      // 0bf: aload 6
      // 0c1: getfield net/minecraft/network/play/server/S21PacketChunkData$qjp.kvj I
      // 0c4: invokestatic java/lang/Integer.bitCount (I)I
      // 0c7: iload 2
      // 0c8: iload 1
      // 0c9: invokestatic net/minecraft/network/play/server/S21PacketChunkData.m6n (IZZ)I
      // 0cc: newarray 8
      // 0ce: putfield net/minecraft/network/play/server/S21PacketChunkData$qjp.rww [B
      // 0d1: bipush 0
      // 0d2: istore 8
      // 0d4: aload 7
      // 0d6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0db: astore 9
      // 0dd: aload 9
      // 0df: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e4: ifeq 152
      // 0e7: aload 9
      // 0e9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ee: checkcast k7x
      // 0f1: astore 10
      // 0f3: aload 10
      // 0f5: invokevirtual k7x.v_d ()[C
      // 0f8: astore 11
      // 0fa: aload 11
      // 0fc: astore 12
      // 0fe: aload 12
      // 100: arraylength
      // 101: istore 13
      // 103: bipush 0
      // 104: aload 4
      // 106: ifnull 162
      // 109: istore 14
      // 10b: iload 14
      // 10d: iload 13
      // 10f: if_icmpge 14d
      // 112: aload 12
      // 114: iload 14
      // 116: caload
      // 117: istore 15
      // 119: aload 6
      // 11b: getfield net/minecraft/network/play/server/S21PacketChunkData$qjp.rww [B
      // 11e: iload 8
      // 120: iinc 8 1
      // 123: iload 15
      // 125: sipush 255
      // 128: iand
      // 129: i2b
      // 12a: bastore
      // 12b: aload 6
      // 12d: getfield net/minecraft/network/play/server/S21PacketChunkData$qjp.rww [B
      // 130: iload 8
      // 132: iinc 8 1
      // 135: iload 15
      // 137: bipush 8
      // 139: ishr
      // 13a: sipush 255
      // 13d: iand
      // 13e: i2b
      // 13f: bastore
      // 140: iinc 14 1
      // 143: aload 4
      // 145: ifnull 0dd
      // 148: aload 4
      // 14a: ifnonnull 10b
      // 14d: aload 4
      // 14f: ifnonnull 0dd
      // 152: aload 7
      // 154: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 159: astore 9
      // 15b: aload 9
      // 15d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 162: ifeq 196
      // 165: aload 9
      // 167: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 16c: checkcast k7x
      // 16f: astore 10
      // 171: aload 10
      // 173: invokevirtual k7x.plx ()Ls46;
      // 176: invokevirtual s46.rl3 ()[B
      // 179: aload 6
      // 17b: getfield net/minecraft/network/play/server/S21PacketChunkData$qjp.rww [B
      // 17e: iload 8
      // 180: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a4v ([B[BI)I
      // 183: istore 8
      // 185: aload 4
      // 187: ifnull 1ea
      // 18a: aload 4
      // 18c: ifnonnull 15b
      // 18f: goto 196
      // 192: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 195: athrow
      // 196: iload 2
      // 197: aload 4
      // 199: ifnull 1eb
      // 19c: ifeq 1ea
      // 19f: goto 1a6
      // 1a2: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 1a5: athrow
      // 1a6: aload 7
      // 1a8: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1ad: astore 9
      // 1af: aload 9
      // 1b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b6: ifeq 1ea
      // 1b9: aload 9
      // 1bb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c0: checkcast k7x
      // 1c3: astore 10
      // 1c5: aload 10
      // 1c7: invokevirtual k7x.vbf ()Ls46;
      // 1ca: invokevirtual s46.rl3 ()[B
      // 1cd: aload 6
      // 1cf: getfield net/minecraft/network/play/server/S21PacketChunkData$qjp.rww [B
      // 1d2: iload 8
      // 1d4: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a4v ([B[BI)I
      // 1d7: istore 8
      // 1d9: aload 4
      // 1db: ifnull 210
      // 1de: aload 4
      // 1e0: ifnonnull 1af
      // 1e3: goto 1ea
      // 1e6: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: iload 1
      // 1eb: aload 4
      // 1ed: ifnull 20f
      // 1f0: ifeq 210
      // 1f3: goto 1fa
      // 1f6: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: invokevirtual tts.xtk ()[B
      // 1fe: aload 6
      // 200: getfield net/minecraft/network/play/server/S21PacketChunkData$qjp.rww [B
      // 203: iload 8
      // 205: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a4v ([B[BI)I
      // 208: goto 20f
      // 20b: invokestatic net/minecraft/network/play/server/S21PacketChunkData.a (Loov;)Loov;
      // 20e: athrow
      // 20f: pop
      // 210: aload 6
      // 212: areturn
   }

   private static int a4v(byte[] var0, byte[] var1, int var2) {
      System.arraycopy(var0, 0, var1, var2, var0.length);
      return var2 + var0.length;
   }

   public int f4z() {
      return this.a7s;
   }

   public int h_1() {
      return this.rad;
   }

   public int n9c() {
      return this.gs0.kvj;
   }

   public boolean imn() {
      return this.spj;
   }

   @Override
   public void ito(yw3 var1) {
      this.msa((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
