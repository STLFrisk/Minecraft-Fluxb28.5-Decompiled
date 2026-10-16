import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.VideoParams;

public class sso {
   public sso$s4o kie = null;
   public Stream prd = null;
   public IngestList i9g = null;
   public sso$s79 usd = sso$s79.un4;
   public long co4 = 8000L;
   public long asj = 2000L;
   public long jgd = 0L;
   public RTMPState err = RTMPState.Invalid;
   public VideoParams smf = null;
   public AudioParams nwn = null;
   public long a7h = 0L;
   public List hng = null;
   public boolean or4 = false;
   public IStreamCallbacks wxg = null;
   public IStatCallbacks c3w = null;
   public IngestServer y8b = null;
   public boolean f_k = false;
   public boolean y93 = false;
   public int ay_ = -1;
   public int cnj = 0;
   public long gke = 0L;
   public float sj4 = 0.0F;
   public float jx0 = 0.0F;
   public boolean jli = false;
   public boolean tsu = false;
   public boolean d55 = false;
   public IStreamCallbacks wd7 = new sso$1(this);
   public IStatCallbacks d1_ = new sso$2(this);
   private static final long a;
   private static final String b;

   public void _o6(sso$s4o var1) {
      this.kie = var1;
   }

   public IngestServer u9q() {
      return this.y8b;
   }

   public int y3d() {
      return this.ay_;
   }

   public boolean kir() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield sso.usd Lsso$s79;
      // 08: getstatic sso$s79.wih Lsso$s79;
      // 0b: iload 1
      // 0c: ifeq 27
      // 0f: if_acmpeq 46
      // 12: goto 19
      // 15: invokestatic sso.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield sso.usd Lsso$s79;
      // 1d: getstatic sso$s79.xpo Lsso$s79;
      // 20: goto 27
      // 23: invokestatic sso.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 1
      // 28: ifeq 43
      // 2b: if_acmpeq 46
      // 2e: goto 35
      // 31: invokestatic sso.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield sso.usd Lsso$s79;
      // 39: getstatic sso$s79.xuy Lsso$s79;
      // 3c: goto 43
      // 3f: invokestatic sso.a (Loov;)Loov;
      // 42: athrow
      // 43: if_acmpne 4e
      // 46: bipush 1
      // 47: goto 4f
      // 4a: invokestatic sso.a (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
   }

   public float np3() {
      return this.jx0;
   }

   public sso(Stream var1, IngestList var2) {
      this.prd = var1;
      this.i9g = var2;
   }

   public void plk() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 0f8
      // 009: getfield sso.usd Lsso$s79;
      // 00c: getstatic sso$s79.un4 Lsso$s79;
      // 00f: if_acmpne 17a
      // 012: goto 019
      // 015: invokestatic sso.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: bipush 0
      // 01b: putfield sso.ay_ I
      // 01e: aload 0
      // 01f: bipush 0
      // 020: putfield sso.f_k Z
      // 023: aload 0
      // 024: bipush 0
      // 025: putfield sso.y93 Z
      // 028: aload 0
      // 029: bipush 0
      // 02a: putfield sso.jli Z
      // 02d: aload 0
      // 02e: bipush 0
      // 02f: putfield sso.tsu Z
      // 032: aload 0
      // 033: bipush 0
      // 034: putfield sso.d55 Z
      // 037: aload 0
      // 038: aload 0
      // 039: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 03c: invokevirtual tv/twitch/broadcast/Stream.getStatCallbacks ()Ltv/twitch/broadcast/IStatCallbacks;
      // 03f: putfield sso.c3w Ltv/twitch/broadcast/IStatCallbacks;
      // 042: aload 0
      // 043: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 046: aload 0
      // 047: getfield sso.d1_ Ltv/twitch/broadcast/IStatCallbacks;
      // 04a: invokevirtual tv/twitch/broadcast/Stream.setStatCallbacks (Ltv/twitch/broadcast/IStatCallbacks;)V
      // 04d: aload 0
      // 04e: aload 0
      // 04f: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 052: invokevirtual tv/twitch/broadcast/Stream.getStreamCallbacks ()Ltv/twitch/broadcast/IStreamCallbacks;
      // 055: putfield sso.wxg Ltv/twitch/broadcast/IStreamCallbacks;
      // 058: aload 0
      // 059: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 05c: aload 0
      // 05d: getfield sso.wd7 Ltv/twitch/broadcast/IStreamCallbacks;
      // 060: invokevirtual tv/twitch/broadcast/Stream.setStreamCallbacks (Ltv/twitch/broadcast/IStreamCallbacks;)V
      // 063: aload 0
      // 064: new tv/twitch/broadcast/VideoParams
      // 067: dup
      // 068: invokespecial tv/twitch/broadcast/VideoParams.<init> ()V
      // 06b: putfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 06e: aload 0
      // 06f: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 072: bipush 60
      // 074: putfield tv/twitch/broadcast/VideoParams.targetFps I
      // 077: aload 0
      // 078: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 07b: sipush 3500
      // 07e: putfield tv/twitch/broadcast/VideoParams.maxKbps I
      // 081: aload 0
      // 082: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 085: sipush 1280
      // 088: putfield tv/twitch/broadcast/VideoParams.outputWidth I
      // 08b: aload 0
      // 08c: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 08f: sipush 720
      // 092: putfield tv/twitch/broadcast/VideoParams.outputHeight I
      // 095: aload 0
      // 096: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 099: getstatic tv/twitch/broadcast/PixelFormat.TTV_PF_BGRA Ltv/twitch/broadcast/PixelFormat;
      // 09c: putfield tv/twitch/broadcast/VideoParams.pixelFormat Ltv/twitch/broadcast/PixelFormat;
      // 09f: aload 0
      // 0a0: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 0a3: getstatic tv/twitch/broadcast/EncodingCpuUsage.TTV_ECU_HIGH Ltv/twitch/broadcast/EncodingCpuUsage;
      // 0a6: putfield tv/twitch/broadcast/VideoParams.encodingCpuUsage Ltv/twitch/broadcast/EncodingCpuUsage;
      // 0a9: aload 0
      // 0aa: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 0ad: bipush 1
      // 0ae: putfield tv/twitch/broadcast/VideoParams.disableAdaptiveBitrate Z
      // 0b1: aload 0
      // 0b2: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 0b5: bipush 0
      // 0b6: putfield tv/twitch/broadcast/VideoParams.verticalFlip Z
      // 0b9: aload 0
      // 0ba: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 0bd: aload 0
      // 0be: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 0c1: invokevirtual tv/twitch/broadcast/Stream.getDefaultParams (Ltv/twitch/broadcast/VideoParams;)Ltv/twitch/ErrorCode;
      // 0c4: pop
      // 0c5: aload 0
      // 0c6: new tv/twitch/broadcast/AudioParams
      // 0c9: dup
      // 0ca: invokespecial tv/twitch/broadcast/AudioParams.<init> ()V
      // 0cd: putfield sso.nwn Ltv/twitch/broadcast/AudioParams;
      // 0d0: aload 0
      // 0d1: getfield sso.nwn Ltv/twitch/broadcast/AudioParams;
      // 0d4: bipush 0
      // 0d5: putfield tv/twitch/broadcast/AudioParams.audioEnabled Z
      // 0d8: aload 0
      // 0d9: getfield sso.nwn Ltv/twitch/broadcast/AudioParams;
      // 0dc: bipush 0
      // 0dd: putfield tv/twitch/broadcast/AudioParams.enableMicCapture Z
      // 0e0: aload 0
      // 0e1: getfield sso.nwn Ltv/twitch/broadcast/AudioParams;
      // 0e4: bipush 0
      // 0e5: putfield tv/twitch/broadcast/AudioParams.enablePlaybackCapture Z
      // 0e8: aload 0
      // 0e9: getfield sso.nwn Ltv/twitch/broadcast/AudioParams;
      // 0ec: bipush 0
      // 0ed: putfield tv/twitch/broadcast/AudioParams.enablePassthroughAudio Z
      // 0f0: aload 0
      // 0f1: goto 0f8
      // 0f4: invokestatic sso.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 0fb: putfield sso.hng Ljava/util/List;
      // 0fe: bipush 3
      // 0ff: istore 2
      // 100: bipush 0
      // 101: istore 3
      // 102: iload 3
      // 103: iload 2
      // 104: if_icmpge 16c
      // 107: aload 0
      // 108: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 10b: aload 0
      // 10c: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 10f: getfield tv/twitch/broadcast/VideoParams.outputWidth I
      // 112: aload 0
      // 113: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 116: getfield tv/twitch/broadcast/VideoParams.outputHeight I
      // 119: imul
      // 11a: bipush 4
      // 11b: imul
      // 11c: invokevirtual tv/twitch/broadcast/Stream.allocateFrameBuffer (I)Ltv/twitch/broadcast/FrameBuffer;
      // 11f: astore 4
      // 121: iload 1
      // 122: ifne 173
      // 125: aload 4
      // 127: invokevirtual tv/twitch/broadcast/FrameBuffer.getIsValid ()Z
      // 12a: iload 1
      // 12b: ifne 15a
      // 12e: goto 135
      // 131: invokestatic sso.a (Loov;)Loov;
      // 134: athrow
      // 135: ifne 14f
      // 138: goto 13f
      // 13b: invokestatic sso.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: invokevirtual sso.r9d ()V
      // 143: aload 0
      // 144: getstatic sso$s79.xuy Lsso$s79;
      // 147: invokevirtual sso.bj4 (Lsso$s79;)V
      // 14a: return
      // 14b: invokestatic sso.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 0
      // 150: getfield sso.hng Ljava/util/List;
      // 153: aload 4
      // 155: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 15a: pop
      // 15b: aload 0
      // 15c: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 15f: aload 4
      // 161: invokevirtual tv/twitch/broadcast/Stream.randomizeFrameBuffer (Ltv/twitch/broadcast/FrameBuffer;)Ltv/twitch/ErrorCode;
      // 164: pop
      // 165: iinc 3 1
      // 168: iload 1
      // 169: ifeq 102
      // 16c: aload 0
      // 16d: getstatic sso$s79.dp_ Lsso$s79;
      // 170: invokevirtual sso.bj4 (Lsso$s79;)V
      // 173: aload 0
      // 174: invokestatic java/lang/System.currentTimeMillis ()J
      // 177: putfield sso.a7h J
      // 17a: return
   }

   public void lfg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 01e
      // 009: invokevirtual sso.kir ()Z
      // 00c: ifne 1ec
      // 00f: goto 016
      // 012: invokestatic sso.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic sso.a (Loov;)Loov;
      // 01d: athrow
      // 01e: iload 1
      // 01f: ifeq 03a
      // 022: getfield sso.usd Lsso$s79;
      // 025: getstatic sso$s79.un4 Lsso$s79;
      // 028: if_acmpeq 1ec
      // 02b: goto 032
      // 02e: invokestatic sso.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: goto 03a
      // 036: invokestatic sso.a (Loov;)Loov;
      // 039: athrow
      // 03a: getfield sso.tsu Z
      // 03d: iload 1
      // 03e: ifeq 056
      // 041: ifne 1ec
      // 044: goto 04b
      // 047: invokestatic sso.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield sso.d55 Z
      // 04f: goto 056
      // 052: invokestatic sso.a (Loov;)Loov;
      // 055: athrow
      // 056: iload 1
      // 057: ifeq 076
      // 05a: ifne 1ec
      // 05d: goto 064
      // 060: invokestatic sso.a (Loov;)Loov;
      // 063: athrow
      // 064: getstatic sso$3.rwr [I
      // 067: aload 0
      // 068: getfield sso.usd Lsso$s79;
      // 06b: invokevirtual sso$s79.ordinal ()I
      // 06e: iaload
      // 06f: goto 076
      // 072: invokestatic sso.a (Loov;)Loov;
      // 075: athrow
      // 076: tableswitch 310 1 5 34 34 276 276 296
      // 098: aload 0
      // 099: iload 1
      // 09a: ifeq 115
      // 09d: goto 0a4
      // 0a0: invokestatic sso.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 0a7: ifnull 0fe
      // 0aa: goto 0b1
      // 0ad: invokestatic sso.a (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: iload 1
      // 0b3: ifeq 0eb
      // 0b6: goto 0bd
      // 0b9: invokestatic sso.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: getfield sso.y93 Z
      // 0c0: ifne 0e3
      // 0c3: goto 0ca
      // 0c6: invokestatic sso.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: iload 1
      // 0cc: ifeq 0f3
      // 0cf: goto 0d6
      // 0d2: invokestatic sso.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: getfield sso.or4 Z
      // 0d9: ifne 0f2
      // 0dc: goto 0e3
      // 0df: invokestatic sso.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: goto 0eb
      // 0e7: invokestatic sso.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 0ee: fconst_0
      // 0ef: putfield tv/twitch/broadcast/IngestServer.bitrateKbps F
      // 0f2: aload 0
      // 0f3: aload 0
      // 0f4: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 0f7: invokevirtual sso._p8 (Ltv/twitch/broadcast/IngestServer;)V
      // 0fa: iload 1
      // 0fb: ifne 1ac
      // 0fe: aload 0
      // 0ff: lconst_0
      // 100: putfield sso.a7h J
      // 103: aload 0
      // 104: bipush 0
      // 105: putfield sso.y93 Z
      // 108: aload 0
      // 109: bipush 1
      // 10a: putfield sso.or4 Z
      // 10d: aload 0
      // 10e: goto 115
      // 111: invokestatic sso.a (Loov;)Loov;
      // 114: athrow
      // 115: iload 1
      // 116: ifeq 13b
      // 119: getfield sso.usd Lsso$s79;
      // 11c: getstatic sso$s79.dp_ Lsso$s79;
      // 11f: if_acmpeq 13a
      // 122: goto 129
      // 125: invokestatic sso.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: dup
      // 12b: getfield sso.ay_ I
      // 12e: bipush 1
      // 12f: iadd
      // 130: putfield sso.ay_ I
      // 133: goto 13a
      // 136: invokestatic sso.a (Loov;)Loov;
      // 139: athrow
      // 13a: aload 0
      // 13b: iload 1
      // 13c: ifeq 180
      // 13f: getfield sso.ay_ I
      // 142: aload 0
      // 143: getfield sso.i9g Ltv/twitch/broadcast/IngestList;
      // 146: invokevirtual tv/twitch/broadcast/IngestList.getServers ()[Ltv/twitch/broadcast/IngestServer;
      // 149: arraylength
      // 14a: if_icmpge 178
      // 14d: goto 154
      // 150: invokestatic sso.a (Loov;)Loov;
      // 153: athrow
      // 154: aload 0
      // 155: aload 0
      // 156: getfield sso.i9g Ltv/twitch/broadcast/IngestList;
      // 159: invokevirtual tv/twitch/broadcast/IngestList.getServers ()[Ltv/twitch/broadcast/IngestServer;
      // 15c: aload 0
      // 15d: getfield sso.ay_ I
      // 160: aaload
      // 161: putfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 164: aload 0
      // 165: aload 0
      // 166: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 169: invokevirtual sso.w10 (Ltv/twitch/broadcast/IngestServer;)Z
      // 16c: pop
      // 16d: iload 1
      // 16e: ifne 1ac
      // 171: goto 178
      // 174: invokestatic sso.a (Loov;)Loov;
      // 177: athrow
      // 178: aload 0
      // 179: goto 180
      // 17c: invokestatic sso.a (Loov;)Loov;
      // 17f: athrow
      // 180: getstatic sso$s79.wih Lsso$s79;
      // 183: invokevirtual sso.bj4 (Lsso$s79;)V
      // 186: iload 1
      // 187: ifne 1ac
      // 18a: aload 0
      // 18b: aload 0
      // 18c: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 18f: invokevirtual sso.krl (Ltv/twitch/broadcast/IngestServer;)Z
      // 192: pop
      // 193: iload 1
      // 194: ifne 1ac
      // 197: goto 19e
      // 19a: invokestatic sso.a (Loov;)Loov;
      // 19d: athrow
      // 19e: aload 0
      // 19f: getstatic sso$s79.xpo Lsso$s79;
      // 1a2: invokevirtual sso.bj4 (Lsso$s79;)V
      // 1a5: goto 1ac
      // 1a8: invokestatic sso.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: aload 0
      // 1ad: invokevirtual sso.trz ()V
      // 1b0: aload 0
      // 1b1: iload 1
      // 1b2: ifeq 1e9
      // 1b5: getfield sso.usd Lsso$s79;
      // 1b8: getstatic sso$s79.xpo Lsso$s79;
      // 1bb: if_acmpeq 1e1
      // 1be: goto 1c5
      // 1c1: invokestatic sso.a (Loov;)Loov;
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: iload 1
      // 1c7: ifeq 1e9
      // 1ca: goto 1d1
      // 1cd: invokestatic sso.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: getfield sso.usd Lsso$s79;
      // 1d4: getstatic sso$s79.wih Lsso$s79;
      // 1d7: if_acmpne 1ec
      // 1da: goto 1e1
      // 1dd: invokestatic sso.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: aload 0
      // 1e2: goto 1e9
      // 1e5: invokestatic sso.a (Loov;)Loov;
      // 1e8: athrow
      // 1e9: invokevirtual sso.r9d ()V
      // 1ec: return
   }

   public void t1b() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual sso.kir ()Z
      // 08: iload 1
      // 09: ifne 2c
      // 0c: ifne 5c
      // 0f: goto 16
      // 12: invokestatic sso.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 3c
      // 1b: goto 22
      // 1e: invokestatic sso.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield sso.f_k Z
      // 25: goto 2c
      // 28: invokestatic sso.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifne 5c
      // 2f: aload 0
      // 30: bipush 1
      // 31: putfield sso.f_k Z
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic sso.a (Loov;)Loov;
      // 3b: athrow
      // 3c: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 3f: iload 1
      // 40: ifne 58
      // 43: ifnull 5c
      // 46: goto 4d
      // 49: invokestatic sso.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 51: goto 58
      // 54: invokestatic sso.a (Loov;)Loov;
      // 57: athrow
      // 58: fconst_0
      // 59: putfield tv/twitch/broadcast/IngestServer.bitrateKbps F
      // 5c: return
   }

   public boolean w10(IngestServer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 1
      // 02: putfield sso.or4 Z
      // 05: aload 0
      // 06: lconst_0
      // 07: putfield sso.jgd J
      // 0a: aload 0
      // 0b: getstatic tv/twitch/broadcast/RTMPState.Idle Ltv/twitch/broadcast/RTMPState;
      // 0e: putfield sso.err Ltv/twitch/broadcast/RTMPState;
      // 11: aload 0
      // 12: aload 1
      // 13: putfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 16: invokestatic t9d.b ()I
      // 19: aload 0
      // 1a: bipush 1
      // 1b: putfield sso.tsu Z
      // 1e: istore 2
      // 1f: aload 0
      // 20: getstatic sso$s79.khy Lsso$s79;
      // 23: invokevirtual sso.bj4 (Lsso$s79;)V
      // 26: aload 0
      // 27: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 2a: aload 0
      // 2b: getfield sso.smf Ltv/twitch/broadcast/VideoParams;
      // 2e: aload 0
      // 2f: getfield sso.nwn Ltv/twitch/broadcast/AudioParams;
      // 32: aload 1
      // 33: getstatic tv/twitch/broadcast/StartFlags.TTV_Start_BandwidthTest Ltv/twitch/broadcast/StartFlags;
      // 36: bipush 1
      // 37: invokevirtual tv/twitch/broadcast/Stream.start (Ltv/twitch/broadcast/VideoParams;Ltv/twitch/broadcast/AudioParams;Ltv/twitch/broadcast/IngestServer;Ltv/twitch/broadcast/StartFlags;Z)Ltv/twitch/ErrorCode;
      // 3a: astore 3
      // 3b: aload 3
      // 3c: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 3f: iload 2
      // 40: ifeq 77
      // 43: ifeq 64
      // 46: goto 4d
      // 49: invokestatic sso.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: putfield sso.tsu Z
      // 52: aload 0
      // 53: bipush 0
      // 54: putfield sso.or4 Z
      // 57: aload 0
      // 58: getstatic sso$s79.hgo Lsso$s79;
      // 5b: invokevirtual sso.bj4 (Lsso$s79;)V
      // 5e: bipush 0
      // 5f: ireturn
      // 60: invokestatic sso.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: aload 0
      // 66: getfield sso.jgd J
      // 69: putfield sso.gke J
      // 6c: aload 1
      // 6d: fconst_0
      // 6e: putfield tv/twitch/broadcast/IngestServer.bitrateKbps F
      // 71: aload 0
      // 72: bipush 0
      // 73: putfield sso.cnj I
      // 76: bipush 1
      // 77: ireturn
   }

   public void _p8(IngestServer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic sso.a J
      // 03: ldc2_w 125512806100977
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield sso.tsu Z
      // 11: iload 4
      // 13: ifeq 48
      // 16: ifeq 31
      // 19: goto 20
      // 1c: invokestatic sso.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: bipush 1
      // 22: putfield sso.y93 Z
      // 25: iload 4
      // 27: ifne c0
      // 2a: goto 31
      // 2d: invokestatic sso.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: iload 4
      // 34: ifeq b5
      // 37: goto 3e
      // 3a: invokestatic sso.a (Loov;)Loov;
      // 3d: athrow
      // 3e: getfield sso.jli Z
      // 41: goto 48
      // 44: invokestatic sso.a (Loov;)Loov;
      // 47: athrow
      // 48: ifeq ad
      // 4b: aload 0
      // 4c: bipush 1
      // 4d: putfield sso.d55 Z
      // 50: aload 0
      // 51: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 54: bipush 1
      // 55: invokevirtual tv/twitch/broadcast/Stream.stop (Z)Ltv/twitch/ErrorCode;
      // 58: astore 5
      // 5a: aload 5
      // 5c: iload 4
      // 5e: ifeq a7
      // 61: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 64: ifeq a0
      // 67: goto 6e
      // 6a: invokestatic sso.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 0
      // 6f: getfield sso.wd7 Ltv/twitch/broadcast/IStreamCallbacks;
      // 72: getstatic tv/twitch/ErrorCode.TTV_EC_SUCCESS Ltv/twitch/ErrorCode;
      // 75: invokeinterface tv/twitch/broadcast/IStreamCallbacks.stopCallback (Ltv/twitch/ErrorCode;)V 2
      // 7a: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 7d: new java/lang/StringBuilder
      // 80: dup
      // 81: invokespecial java/lang/StringBuilder.<init> ()V
      // 84: getstatic sso.b Ljava/lang/String;
      // 87: nop
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: aload 5
      // 8d: invokevirtual tv/twitch/ErrorCode.toString ()Ljava/lang/String;
      // 90: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 93: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 96: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 99: goto a0
      // 9c: invokestatic sso.a (Loov;)Loov;
      // 9f: athrow
      // a0: aload 0
      // a1: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // a4: invokevirtual tv/twitch/broadcast/Stream.pollStats ()Ltv/twitch/ErrorCode;
      // a7: pop
      // a8: iload 4
      // aa: ifne c0
      // ad: aload 0
      // ae: goto b5
      // b1: invokestatic sso.a (Loov;)Loov;
      // b4: athrow
      // b5: getfield sso.wd7 Ltv/twitch/broadcast/IStreamCallbacks;
      // b8: getstatic tv/twitch/ErrorCode.TTV_EC_SUCCESS Ltv/twitch/ErrorCode;
      // bb: invokeinterface tv/twitch/broadcast/IStreamCallbacks.stopCallback (Ltv/twitch/ErrorCode;)V 2
      // c0: return
   }

   public long xix() {
      return System.currentTimeMillis() - this.a7h;
   }

   public void trz() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual sso.xix ()J
      // 08: l2f
      // 09: fstore 2
      // 0a: iload 1
      // 0b: ifeq 5c
      // 0e: getstatic sso$3.rwr [I
      // 11: aload 0
      // 12: getfield sso.usd Lsso$s79;
      // 15: invokevirtual sso$s79.ordinal ()I
      // 18: iaload
      // 19: tableswitch 87 1 9 55 71 55 87 87 55 55 55 55
      // 4c: invokestatic sso.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: fconst_0
      // 52: putfield sso.jx0 F
      // 55: goto 5c
      // 58: invokestatic sso.a (Loov;)Loov;
      // 5b: athrow
      // 5c: iload 1
      // 5d: ifne 82
      // 60: aload 0
      // 61: fconst_1
      // 62: putfield sso.jx0 F
      // 65: iload 1
      // 66: ifne 82
      // 69: goto 70
      // 6c: invokestatic sso.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: fload 2
      // 72: aload 0
      // 73: getfield sso.co4 J
      // 76: l2f
      // 77: fdiv
      // 78: putfield sso.jx0 F
      // 7b: goto 82
      // 7e: invokestatic sso.a (Loov;)Loov;
      // 81: athrow
      // 82: getstatic sso$3.rwr [I
      // 85: aload 0
      // 86: getfield sso.usd Lsso$s79;
      // 89: invokevirtual sso$s79.ordinal ()I
      // 8c: iaload
      // 8d: tableswitch 43 7 9 27 27 27
      // a8: aload 0
      // a9: fconst_1
      // aa: putfield sso.sj4 F
      // ad: iload 1
      // ae: ifne e9
      // b1: goto b8
      // b4: invokestatic sso.a (Loov;)Loov;
      // b7: athrow
      // b8: aload 0
      // b9: aload 0
      // ba: getfield sso.ay_ I
      // bd: i2f
      // be: aload 0
      // bf: getfield sso.i9g Ltv/twitch/broadcast/IngestList;
      // c2: invokevirtual tv/twitch/broadcast/IngestList.getServers ()[Ltv/twitch/broadcast/IngestServer;
      // c5: arraylength
      // c6: i2f
      // c7: fdiv
      // c8: putfield sso.sj4 F
      // cb: aload 0
      // cc: dup
      // cd: getfield sso.sj4 F
      // d0: aload 0
      // d1: getfield sso.jx0 F
      // d4: aload 0
      // d5: getfield sso.i9g Ltv/twitch/broadcast/IngestList;
      // d8: invokevirtual tv/twitch/broadcast/IngestList.getServers ()[Ltv/twitch/broadcast/IngestServer;
      // db: arraylength
      // dc: i2f
      // dd: fdiv
      // de: fadd
      // df: putfield sso.sj4 F
      // e2: goto e9
      // e5: invokestatic sso.a (Loov;)Loov;
      // e8: athrow
      // e9: return
   }

   public boolean krl(IngestServer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield sso.y93 Z
      // 008: iload 2
      // 009: ifeq 15e
      // 00c: ifne 156
      // 00f: goto 016
      // 012: invokestatic sso.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield sso.f_k Z
      // 01a: iload 2
      // 01b: ifeq 15e
      // 01e: goto 025
      // 021: invokestatic sso.a (Loov;)Loov;
      // 024: athrow
      // 025: ifne 156
      // 028: goto 02f
      // 02b: invokestatic sso.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokevirtual sso.xix ()J
      // 033: aload 0
      // 034: getfield sso.co4 J
      // 037: lcmp
      // 038: iload 2
      // 039: ifeq 15e
      // 03c: goto 043
      // 03f: invokestatic sso.a (Loov;)Loov;
      // 042: athrow
      // 043: ifge 156
      // 046: goto 04d
      // 049: invokestatic sso.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 0
      // 04e: getfield sso.tsu Z
      // 051: iload 2
      // 052: ifeq 155
      // 055: goto 05c
      // 058: invokestatic sso.a (Loov;)Loov;
      // 05b: athrow
      // 05c: ifne 154
      // 05f: goto 066
      // 062: invokestatic sso.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: getfield sso.d55 Z
      // 06a: iload 2
      // 06b: ifeq 155
      // 06e: goto 075
      // 071: invokestatic sso.a (Loov;)Loov;
      // 074: athrow
      // 075: ifne 154
      // 078: goto 07f
      // 07b: invokestatic sso.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 083: aload 0
      // 084: getfield sso.hng Ljava/util/List;
      // 087: aload 0
      // 088: getfield sso.cnj I
      // 08b: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 090: checkcast tv/twitch/broadcast/FrameBuffer
      // 093: invokevirtual tv/twitch/broadcast/Stream.submitVideoFrame (Ltv/twitch/broadcast/FrameBuffer;)Ltv/twitch/ErrorCode;
      // 096: astore 3
      // 097: aload 3
      // 098: iload 2
      // 099: ifeq 0d6
      // 09c: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 09f: ifeq 0bb
      // 0a2: goto 0a9
      // 0a5: invokestatic sso.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: bipush 0
      // 0ab: putfield sso.or4 Z
      // 0ae: aload 0
      // 0af: getstatic sso$s79.hgo Lsso$s79;
      // 0b2: invokevirtual sso.bj4 (Lsso$s79;)V
      // 0b5: bipush 0
      // 0b6: ireturn
      // 0b7: invokestatic sso.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: aload 0
      // 0bd: getfield sso.cnj I
      // 0c0: bipush 1
      // 0c1: iadd
      // 0c2: aload 0
      // 0c3: getfield sso.hng Ljava/util/List;
      // 0c6: invokeinterface java/util/List.size ()I 1
      // 0cb: irem
      // 0cc: putfield sso.cnj I
      // 0cf: aload 0
      // 0d0: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 0d3: invokevirtual tv/twitch/broadcast/Stream.pollStats ()Ltv/twitch/ErrorCode;
      // 0d6: pop
      // 0d7: aload 0
      // 0d8: iload 2
      // 0d9: ifeq 0fb
      // 0dc: getfield sso.err Ltv/twitch/broadcast/RTMPState;
      // 0df: getstatic tv/twitch/broadcast/RTMPState.SendVideo Ltv/twitch/broadcast/RTMPState;
      // 0e2: if_acmpne 152
      // 0e5: goto 0ec
      // 0e8: invokestatic sso.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getstatic sso$s79.wwr Lsso$s79;
      // 0f0: invokevirtual sso.bj4 (Lsso$s79;)V
      // 0f3: aload 0
      // 0f4: goto 0fb
      // 0f7: invokestatic sso.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: invokevirtual sso.xix ()J
      // 0fe: lstore 4
      // 100: lload 4
      // 102: lconst_0
      // 103: lcmp
      // 104: iload 2
      // 105: ifeq 153
      // 108: ifle 152
      // 10b: goto 112
      // 10e: invokestatic sso.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: getfield sso.jgd J
      // 116: aload 0
      // 117: getfield sso.gke J
      // 11a: lcmp
      // 11b: iload 2
      // 11c: ifeq 153
      // 11f: goto 126
      // 122: invokestatic sso.a (Loov;)Loov;
      // 125: athrow
      // 126: ifle 152
      // 129: goto 130
      // 12c: invokestatic sso.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 1
      // 131: aload 0
      // 132: getfield sso.jgd J
      // 135: ldc2_w 8
      // 138: lmul
      // 139: l2f
      // 13a: aload 0
      // 13b: invokevirtual sso.xix ()J
      // 13e: l2f
      // 13f: fdiv
      // 140: putfield tv/twitch/broadcast/IngestServer.bitrateKbps F
      // 143: aload 0
      // 144: aload 0
      // 145: getfield sso.jgd J
      // 148: putfield sso.gke J
      // 14b: goto 152
      // 14e: invokestatic sso.a (Loov;)Loov;
      // 151: athrow
      // 152: bipush 1
      // 153: ireturn
      // 154: bipush 1
      // 155: ireturn
      // 156: aload 0
      // 157: getstatic sso$s79.hgo Lsso$s79;
      // 15a: invokevirtual sso.bj4 (Lsso$s79;)V
      // 15d: bipush 1
      // 15e: ireturn
   }

   public void r9d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: aconst_null
      // 06: putfield sso.y8b Ltv/twitch/broadcast/IngestServer;
      // 09: aload 0
      // 0a: iload 1
      // 0b: ifeq 52
      // 0e: getfield sso.hng Ljava/util/List;
      // 11: ifnull 51
      // 14: goto 1b
      // 17: invokestatic sso.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: istore 2
      // 1d: iload 2
      // 1e: aload 0
      // 1f: getfield sso.hng Ljava/util/List;
      // 22: invokeinterface java/util/List.size ()I 1
      // 27: if_icmpge 4c
      // 2a: aload 0
      // 2b: getfield sso.hng Ljava/util/List;
      // 2e: iload 2
      // 2f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 34: checkcast tv/twitch/broadcast/FrameBuffer
      // 37: invokevirtual tv/twitch/broadcast/FrameBuffer.free ()V
      // 3a: iinc 2 1
      // 3d: iload 1
      // 3e: ifeq 51
      // 41: iload 1
      // 42: ifne 1d
      // 45: goto 4c
      // 48: invokestatic sso.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aconst_null
      // 4e: putfield sso.hng Ljava/util/List;
      // 51: aload 0
      // 52: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 55: iload 1
      // 56: ifeq 85
      // 59: invokevirtual tv/twitch/broadcast/Stream.getStatCallbacks ()Ltv/twitch/broadcast/IStatCallbacks;
      // 5c: aload 0
      // 5d: getfield sso.d1_ Ltv/twitch/broadcast/IStatCallbacks;
      // 60: if_acmpne 81
      // 63: goto 6a
      // 66: invokestatic sso.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 6e: aload 0
      // 6f: getfield sso.c3w Ltv/twitch/broadcast/IStatCallbacks;
      // 72: invokevirtual tv/twitch/broadcast/Stream.setStatCallbacks (Ltv/twitch/broadcast/IStatCallbacks;)V
      // 75: aload 0
      // 76: aconst_null
      // 77: putfield sso.c3w Ltv/twitch/broadcast/IStatCallbacks;
      // 7a: goto 81
      // 7d: invokestatic sso.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 0
      // 82: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 85: iload 1
      // 86: ifeq a5
      // 89: invokevirtual tv/twitch/broadcast/Stream.getStreamCallbacks ()Ltv/twitch/broadcast/IStreamCallbacks;
      // 8c: aload 0
      // 8d: getfield sso.wd7 Ltv/twitch/broadcast/IStreamCallbacks;
      // 90: if_acmpne b1
      // 93: goto 9a
      // 96: invokestatic sso.a (Loov;)Loov;
      // 99: athrow
      // 9a: aload 0
      // 9b: getfield sso.prd Ltv/twitch/broadcast/Stream;
      // 9e: goto a5
      // a1: invokestatic sso.a (Loov;)Loov;
      // a4: athrow
      // a5: aload 0
      // a6: getfield sso.wxg Ltv/twitch/broadcast/IStreamCallbacks;
      // a9: invokevirtual tv/twitch/broadcast/Stream.setStreamCallbacks (Ltv/twitch/broadcast/IStreamCallbacks;)V
      // ac: aload 0
      // ad: aconst_null
      // ae: putfield sso.wxg Ltv/twitch/broadcast/IStreamCallbacks;
      // b1: return
   }

   public void bj4(sso$s79 param1) {
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
      // 05: aload 0
      // 06: getfield sso.usd Lsso$s79;
      // 09: if_acmpeq 3c
      // 0c: aload 0
      // 0d: aload 1
      // 0e: putfield sso.usd Lsso$s79;
      // 11: aload 0
      // 12: getfield sso.kie Lsso$s4o;
      // 15: iload 2
      // 16: ifeq 35
      // 19: goto 20
      // 1c: invokestatic sso.a (Loov;)Loov;
      // 1f: athrow
      // 20: ifnull 3c
      // 23: goto 2a
      // 26: invokestatic sso.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield sso.kie Lsso$s4o;
      // 2e: goto 35
      // 31: invokestatic sso.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: invokeinterface sso$s4o.asx (Lsso;Lsso$s79;)V 3
      // 3c: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6919889662412971557L, -7354102901040292703L, MethodHandles.lookup().lookupClass()).a(231250728103247L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 89534710935694L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u000bìz$\u0087\u0084\u0013;\u0094\u007fV\tË\u007f\u0096¾".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
