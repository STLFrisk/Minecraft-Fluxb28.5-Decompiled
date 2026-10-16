import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

public class g5v {
   private static final Logger tvj;
   public final int uka;
   public final int pet;
   private static final kja tsu;
   private String la0;
   public g5v$kot hpt;
   public String hkt;
   public String kax;
   public String y3t;
   public boolean dro;
   public Core b6y;
   public Stream ejo;
   public List yjv;
   public List x1b;
   public boolean zeh;
   public boolean vwt;
   public boolean blz;
   public g5v$nin w9p;
   public String ua5;
   public VideoParams _l3;
   public AudioParams g08;
   public IngestList j3g;
   public IngestServer u5w;
   public AuthToken vom;
   public ChannelInfo cf6;
   public UserInfo rke;
   public StreamInfo bh1;
   public ArchivingState z5y;
   public long d5l;
   public sso i2x;
   private ErrorCode vpx;
   public IStreamCallbacks x1d;
   public IStatCallbacks x__;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void df2(g5v$kot var1) {
      this.hpt = var1;
   }

   public boolean nag() {
      return this.zeh;
   }

   public void eqz(String var1) {
      this.hkt = var1;
   }

   public StreamInfo w4e() {
      return this.bh1;
   }

   public ChannelInfo cjy() {
      return this.cf6;
   }

   public boolean nzv() {
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
      // 05: getfield g5v.w9p Lg5v$nin;
      // 08: getstatic g5v$nin.jcl Lg5v$nin;
      // 0b: iload 1
      // 0c: ifeq 27
      // 0f: if_acmpeq 2a
      // 12: goto 19
      // 15: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield g5v.w9p Lg5v$nin;
      // 1d: getstatic g5v$nin.c8e Lg5v$nin;
      // 20: goto 27
      // 23: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: if_acmpne 32
      // 2a: bipush 1
      // 2b: goto 33
      // 2e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   public boolean bdw() {
      try {
         if (this.w9p == g5v$nin.a_4) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean lsr() {
      try {
         if (this.w9p == g5v$nin.ttb) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean smq() {
      try {
         if (this.w9p == g5v$nin.c8e) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean uyw() {
      return this.vwt;
   }

   public IngestServer qfa() {
      return this.u5w;
   }

   public void fp1(IngestServer var1) {
      this.u5w = var1;
   }

   public IngestList zs3() {
      return this.j3g;
   }

   public void hll(float var1) {
      this.ejo.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, var1);
   }

   public void d7g(float var1) {
      this.ejo.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, var1);
   }

   public sso gek() {
      return this.i2x;
   }

   public long o4w() {
      return this.ejo.getStreamTime();
   }

   public boolean gjl() {
      return true;
   }

   public ErrorCode s94() {
      return this.vpx;
   }

   public g5v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: aload 0
      // 005: bipush 30
      // 007: putfield g5v.uka I
      // 00a: aload 0
      // 00b: bipush 3
      // 00c: putfield g5v.pet I
      // 00f: aload 0
      // 010: aconst_null
      // 011: putfield g5v.la0 Ljava/lang/String;
      // 014: invokestatic OpaquePredicate.b ()I
      // 017: aload 0
      // 018: aconst_null
      // 019: putfield g5v.hpt Lg5v$kot;
      // 01c: aload 0
      // 01d: ldc ""
      // 01f: nop
      // 020: putfield g5v.hkt Ljava/lang/String;
      // 023: istore 1
      // 024: aload 0
      // 025: ldc ""
      // 027: nop
      // 028: putfield g5v.kax Ljava/lang/String;
      // 02b: aload 0
      // 02c: ldc ""
      // 02e: nop
      // 02f: putfield g5v.y3t Ljava/lang/String;
      // 032: aload 0
      // 033: bipush 1
      // 034: putfield g5v.dro Z
      // 037: aload 0
      // 038: aconst_null
      // 039: putfield g5v.b6y Ltv/twitch/Core;
      // 03c: aload 0
      // 03d: aconst_null
      // 03e: putfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 041: aload 0
      // 042: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 045: putfield g5v.yjv Ljava/util/List;
      // 048: aload 0
      // 049: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 04c: putfield g5v.x1b Ljava/util/List;
      // 04f: aload 0
      // 050: bipush 0
      // 051: putfield g5v.zeh Z
      // 054: aload 0
      // 055: bipush 0
      // 056: putfield g5v.vwt Z
      // 059: aload 0
      // 05a: bipush 0
      // 05b: putfield g5v.blz Z
      // 05e: aload 0
      // 05f: getstatic g5v$nin.yv2 Lg5v$nin;
      // 062: putfield g5v.w9p Lg5v$nin;
      // 065: aload 0
      // 066: aconst_null
      // 067: putfield g5v.ua5 Ljava/lang/String;
      // 06a: aload 0
      // 06b: aconst_null
      // 06c: putfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 06f: aload 0
      // 070: aconst_null
      // 071: putfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 074: aload 0
      // 075: new tv/twitch/broadcast/IngestList
      // 078: dup
      // 079: bipush 0
      // 07a: anewarray 214
      // 07d: invokespecial tv/twitch/broadcast/IngestList.<init> ([Ltv/twitch/broadcast/IngestServer;)V
      // 080: putfield g5v.j3g Ltv/twitch/broadcast/IngestList;
      // 083: aload 0
      // 084: aconst_null
      // 085: putfield g5v.u5w Ltv/twitch/broadcast/IngestServer;
      // 088: aload 0
      // 089: new tv/twitch/AuthToken
      // 08c: dup
      // 08d: invokespecial tv/twitch/AuthToken.<init> ()V
      // 090: putfield g5v.vom Ltv/twitch/AuthToken;
      // 093: aload 0
      // 094: new tv/twitch/broadcast/ChannelInfo
      // 097: dup
      // 098: invokespecial tv/twitch/broadcast/ChannelInfo.<init> ()V
      // 09b: putfield g5v.cf6 Ltv/twitch/broadcast/ChannelInfo;
      // 09e: aload 0
      // 09f: new tv/twitch/broadcast/UserInfo
      // 0a2: dup
      // 0a3: invokespecial tv/twitch/broadcast/UserInfo.<init> ()V
      // 0a6: putfield g5v.rke Ltv/twitch/broadcast/UserInfo;
      // 0a9: aload 0
      // 0aa: new tv/twitch/broadcast/StreamInfo
      // 0ad: dup
      // 0ae: invokespecial tv/twitch/broadcast/StreamInfo.<init> ()V
      // 0b1: putfield g5v.bh1 Ltv/twitch/broadcast/StreamInfo;
      // 0b4: aload 0
      // 0b5: new tv/twitch/broadcast/ArchivingState
      // 0b8: dup
      // 0b9: invokespecial tv/twitch/broadcast/ArchivingState.<init> ()V
      // 0bc: putfield g5v.z5y Ltv/twitch/broadcast/ArchivingState;
      // 0bf: aload 0
      // 0c0: lconst_0
      // 0c1: putfield g5v.d5l J
      // 0c4: aload 0
      // 0c5: aconst_null
      // 0c6: putfield g5v.i2x Lsso;
      // 0c9: aload 0
      // 0ca: new g5v$1
      // 0cd: dup
      // 0ce: aload 0
      // 0cf: invokespecial g5v$1.<init> (Lg5v;)V
      // 0d2: putfield g5v.x1d Ltv/twitch/broadcast/IStreamCallbacks;
      // 0d5: aload 0
      // 0d6: new g5v$2
      // 0d9: dup
      // 0da: aload 0
      // 0db: invokespecial g5v$2.<init> (Lg5v;)V
      // 0de: putfield g5v.x__ Ltv/twitch/broadcast/IStatCallbacks;
      // 0e1: aload 0
      // 0e2: invokestatic tv/twitch/Core.getInstance ()Ltv/twitch/Core;
      // 0e5: putfield g5v.b6y Ltv/twitch/Core;
      // 0e8: iload 1
      // 0e9: ifeq 124
      // 0ec: invokestatic tv/twitch/Core.getInstance ()Ltv/twitch/Core;
      // 0ef: ifnonnull 112
      // 0f2: goto 0f9
      // 0f5: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: new tv/twitch/Core
      // 0fd: dup
      // 0fe: new tv/twitch/StandardCoreAPI
      // 101: dup
      // 102: invokespecial tv/twitch/StandardCoreAPI.<init> ()V
      // 105: invokespecial tv/twitch/Core.<init> (Ltv/twitch/CoreAPI;)V
      // 108: putfield g5v.b6y Ltv/twitch/Core;
      // 10b: goto 112
      // 10e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: aload 0
      // 113: new tv/twitch/broadcast/Stream
      // 116: dup
      // 117: new tv/twitch/broadcast/DesktopStreamAPI
      // 11a: dup
      // 11b: invokespecial tv/twitch/broadcast/DesktopStreamAPI.<init> ()V
      // 11e: invokespecial tv/twitch/broadcast/Stream.<init> (Ltv/twitch/broadcast/StreamAPI;)V
      // 121: putfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 124: return
   }

   public PixelFormat kv3() {
      return PixelFormat.TTV_PF_RGBA;
   }

   public boolean i0i() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 54611913926702
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 30
      // 11: getfield g5v.zeh Z
      // 14: ifeq 24
      // 17: goto 1e
      // 1a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 28: aload 0
      // 29: getfield g5v.x1d Ltv/twitch/broadcast/IStreamCallbacks;
      // 2c: invokevirtual tv/twitch/broadcast/Stream.setStreamCallbacks (Ltv/twitch/broadcast/IStreamCallbacks;)V
      // 2f: aload 0
      // 30: getfield g5v.b6y Ltv/twitch/Core;
      // 33: aload 0
      // 34: getfield g5v.hkt Ljava/lang/String;
      // 37: sipush 32194
      // 3a: ldc2_w 3434102808415372960
      // 3d: lload 1
      // 3e: lxor
      // 3f: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 48: invokevirtual tv/twitch/Core.initialize (Ljava/lang/String;Ljava/lang/String;)Ltv/twitch/ErrorCode;
      // 4b: astore 4
      // 4d: aload 0
      // 4e: aload 4
      // 50: invokevirtual g5v.uw7 (Ltv/twitch/ErrorCode;)Z
      // 53: iload 3
      // 54: ifne 8a
      // 57: ifne 78
      // 5a: goto 61
      // 5d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 65: aconst_null
      // 66: checkcast tv/twitch/broadcast/IStreamCallbacks
      // 69: invokevirtual tv/twitch/broadcast/Stream.setStreamCallbacks (Ltv/twitch/broadcast/IStreamCallbacks;)V
      // 6c: aload 0
      // 6d: aload 4
      // 6f: putfield g5v.vpx Ltv/twitch/ErrorCode;
      // 72: bipush 0
      // 73: ireturn
      // 74: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: aload 0
      // 79: getfield g5v.b6y Ltv/twitch/Core;
      // 7c: getstatic tv/twitch/MessageLevel.TTV_ML_ERROR Ltv/twitch/MessageLevel;
      // 7f: invokevirtual tv/twitch/Core.setTraceLevel (Ltv/twitch/MessageLevel;)Ltv/twitch/ErrorCode;
      // 82: astore 4
      // 84: aload 0
      // 85: aload 4
      // 87: invokevirtual g5v.uw7 (Ltv/twitch/ErrorCode;)Z
      // 8a: iload 3
      // 8b: ifne bc
      // 8e: ifne b7
      // 91: goto 98
      // 94: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 97: athrow
      // 98: aload 0
      // 99: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 9c: aconst_null
      // 9d: checkcast tv/twitch/broadcast/IStreamCallbacks
      // a0: invokevirtual tv/twitch/broadcast/Stream.setStreamCallbacks (Ltv/twitch/broadcast/IStreamCallbacks;)V
      // a3: aload 0
      // a4: getfield g5v.b6y Ltv/twitch/Core;
      // a7: invokevirtual tv/twitch/Core.shutdown ()Ltv/twitch/ErrorCode;
      // aa: pop
      // ab: aload 0
      // ac: aload 4
      // ae: putfield g5v.vpx Ltv/twitch/ErrorCode;
      // b1: bipush 0
      // b2: ireturn
      // b3: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b6: athrow
      // b7: aload 4
      // b9: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // bc: iload 3
      // bd: ifne eb
      // c0: ifeq dc
      // c3: goto ca
      // c6: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c9: athrow
      // ca: aload 0
      // cb: bipush 1
      // cc: putfield g5v.zeh Z
      // cf: aload 0
      // d0: getstatic g5v$nin.tc_ Lg5v$nin;
      // d3: invokevirtual g5v.koi (Lg5v$nin;)V
      // d6: bipush 1
      // d7: ireturn
      // d8: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // db: athrow
      // dc: aload 0
      // dd: aload 4
      // df: putfield g5v.vpx Ltv/twitch/ErrorCode;
      // e2: aload 0
      // e3: getfield g5v.b6y Ltv/twitch/Core;
      // e6: invokevirtual tv/twitch/Core.shutdown ()Ltv/twitch/ErrorCode;
      // e9: pop
      // ea: bipush 0
      // eb: ireturn
   }

   public boolean z0e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield g5v.zeh Z
      // 08: iload 1
      // 09: ifne 20
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 1
      // 17: ireturn
      // 18: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual g5v.lsr ()Z
      // 20: iload 1
      // 21: ifne 3d
      // 24: ifeq 34
      // 27: goto 2e
      // 2a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 0
      // 35: bipush 1
      // 36: putfield g5v.blz Z
      // 39: aload 0
      // 3a: invokevirtual g5v.ce8 ()Z
      // 3d: pop
      // 3e: aload 0
      // 3f: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 42: aconst_null
      // 43: checkcast tv/twitch/broadcast/IStreamCallbacks
      // 46: invokevirtual tv/twitch/broadcast/Stream.setStreamCallbacks (Ltv/twitch/broadcast/IStreamCallbacks;)V
      // 49: aload 0
      // 4a: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 4d: aconst_null
      // 4e: checkcast tv/twitch/broadcast/IStatCallbacks
      // 51: invokevirtual tv/twitch/broadcast/Stream.setStatCallbacks (Ltv/twitch/broadcast/IStatCallbacks;)V
      // 54: aload 0
      // 55: getfield g5v.b6y Ltv/twitch/Core;
      // 58: invokevirtual tv/twitch/Core.shutdown ()Ltv/twitch/ErrorCode;
      // 5b: astore 2
      // 5c: aload 0
      // 5d: aload 2
      // 5e: invokevirtual g5v.uw7 (Ltv/twitch/ErrorCode;)Z
      // 61: pop
      // 62: aload 0
      // 63: bipush 0
      // 64: putfield g5v.zeh Z
      // 67: aload 0
      // 68: bipush 0
      // 69: putfield g5v.blz Z
      // 6c: aload 0
      // 6d: getstatic g5v$nin.yv2 Lg5v$nin;
      // 70: invokevirtual g5v.koi (Lg5v$nin;)V
      // 73: bipush 1
      // 74: ireturn
   }

   public void aer() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 21
      // 09: getfield g5v.w9p Lg5v$nin;
      // 0c: getstatic g5v$nin.yv2 Lg5v$nin;
      // 0f: if_acmpeq 6a
      // 12: goto 19
      // 15: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: goto 21
      // 1d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: getfield g5v.i2x Lsso;
      // 24: iload 1
      // 25: ifne 44
      // 28: ifnull 40
      // 2b: goto 32
      // 2e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: getfield g5v.i2x Lsso;
      // 36: invokevirtual sso.t1b ()V
      // 39: goto 40
      // 3c: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield g5v.i2x Lsso;
      // 44: ifnull 65
      // 47: ldc2_w 200
      // 4a: invokestatic java/lang/Thread.sleep (J)V
      // 4d: iload 1
      // 4e: ifne 6a
      // 51: goto 5d
      // 54: astore 2
      // 55: aload 0
      // 56: aload 2
      // 57: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 5a: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 5d: aload 0
      // 5e: invokevirtual g5v.peh ()V
      // 61: iload 1
      // 62: ifeq 40
      // 65: aload 0
      // 66: invokevirtual g5v.z0e ()Z
      // 69: pop
      // 6a: return
   }

   public boolean mny(String param1, AuthToken param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 105456959445887
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: invokevirtual g5v.lsr ()Z
      // 11: iload 5
      // 13: ifne 2a
      // 16: ifeq 26
      // 19: goto 20
      // 1c: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 0
      // 27: invokevirtual g5v.ce8 ()Z
      // 2a: pop
      // 2b: iload 5
      // 2d: ifne f6
      // 30: aload 1
      // 31: ifnull e4
      // 34: goto 3b
      // 37: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: aload 1
      // 3c: invokevirtual java/lang/String.isEmpty ()Z
      // 3f: iload 5
      // 41: ifne f7
      // 44: goto 4b
      // 47: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: ifne e4
      // 4e: goto 55
      // 51: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: aload 2
      // 56: iload 5
      // 58: ifne 6d
      // 5b: goto 62
      // 5e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: ifnull d0
      // 65: goto 6c
      // 68: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 2
      // 6d: getfield tv/twitch/AuthToken.data Ljava/lang/String;
      // 70: iload 5
      // 72: ifne 8a
      // 75: ifnull d0
      // 78: goto 7f
      // 7b: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 2
      // 80: getfield tv/twitch/AuthToken.data Ljava/lang/String;
      // 83: goto 8a
      // 86: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 89: athrow
      // 8a: invokevirtual java/lang/String.isEmpty ()Z
      // 8d: iload 5
      // 8f: ifne e3
      // 92: ifne d0
      // 95: goto 9c
      // 98: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: aload 0
      // 9d: aload 1
      // 9e: putfield g5v.ua5 Ljava/lang/String;
      // a1: aload 0
      // a2: aload 2
      // a3: putfield g5v.vom Ltv/twitch/AuthToken;
      // a6: aload 0
      // a7: invokevirtual g5v.nag ()Z
      // aa: iload 5
      // ac: ifne cf
      // af: goto b6
      // b2: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: athrow
      // b6: ifeq ce
      // b9: goto c0
      // bc: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bf: athrow
      // c0: aload 0
      // c1: getstatic g5v$nin.ns_ Lg5v$nin;
      // c4: invokevirtual g5v.koi (Lg5v$nin;)V
      // c7: goto ce
      // ca: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cd: athrow
      // ce: bipush 1
      // cf: ireturn
      // d0: aload 0
      // d1: sipush 5392
      // d4: ldc2_w 9137217797382888754
      // d7: lload 3
      // d8: lxor
      // d9: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: nop
      // df: invokevirtual g5v.psg (Ljava/lang/String;)V
      // e2: bipush 0
      // e3: ireturn
      // e4: aload 0
      // e5: sipush 14312
      // e8: ldc2_w 2366869585142579162
      // eb: lload 3
      // ec: lxor
      // ed: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f2: nop
      // f3: invokevirtual g5v.psg (Ljava/lang/String;)V
      // f6: bipush 0
      // f7: ireturn
   }

   public boolean ce8() {
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
      // 05: invokevirtual g5v.lsr ()Z
      // 08: iload 1
      // 09: ifeq 20
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual g5v.nzv ()Z
      // 20: iload 1
      // 21: ifeq 54
      // 24: ifeq 3e
      // 27: goto 2e
      // 2a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 32: bipush 0
      // 33: invokevirtual tv/twitch/broadcast/Stream.stop (Z)Ltv/twitch/ErrorCode;
      // 36: pop
      // 37: goto 3e
      // 3a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc ""
      // 41: nop
      // 42: putfield g5v.ua5 Ljava/lang/String;
      // 45: aload 0
      // 46: new tv/twitch/AuthToken
      // 49: dup
      // 4a: invokespecial tv/twitch/AuthToken.<init> ()V
      // 4d: putfield g5v.vom Ltv/twitch/AuthToken;
      // 50: aload 0
      // 51: getfield g5v.vwt Z
      // 54: iload 1
      // 55: ifeq 71
      // 58: ifne 68
      // 5b: goto 62
      // 5e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
      // 64: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: aload 0
      // 69: bipush 0
      // 6a: putfield g5v.vwt Z
      // 6d: aload 0
      // 6e: getfield g5v.blz Z
      // 71: iload 1
      // 72: ifeq b5
      // 75: ifne ad
      // 78: goto 7f
      // 7b: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield g5v.hpt Lg5v$kot;
      // 83: iload 1
      // 84: ifeq 9c
      // 87: ifnull a1
      // 8a: goto 91
      // 8d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 90: athrow
      // 91: aload 0
      // 92: getfield g5v.hpt Lg5v$kot;
      // 95: goto 9c
      // 98: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: invokeinterface g5v$kot.a6u ()V 1
      // a1: goto ad
      // a4: astore 2
      // a5: aload 0
      // a6: aload 2
      // a7: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // aa: invokevirtual g5v.psg (Ljava/lang/String;)V
      // ad: aload 0
      // ae: getstatic g5v$nin.tc_ Lg5v$nin;
      // b1: invokevirtual g5v.koi (Lg5v$nin;)V
      // b4: bipush 1
      // b5: ireturn
   }

   public boolean plf(String param1, String param2, String param3) {
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
      // 06: getfield g5v.vwt Z
      // 09: iload 4
      // 0b: ifne 19
      // 0e: ifne 1a
      // 11: goto 18
      // 14: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: aload 1
      // 1b: iload 4
      // 1d: ifne 52
      // 20: ifnull 47
      // 23: goto 2a
      // 26: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 1
      // 2b: iload 4
      // 2d: ifne 54
      // 30: goto 37
      // 33: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: ldc ""
      // 39: nop
      // 3a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3d: ifeq 53
      // 40: goto 47
      // 43: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 0
      // 48: getfield g5v.ua5 Ljava/lang/String;
      // 4b: goto 52
      // 4e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51: athrow
      // 52: astore 1
      // 53: aload 2
      // 54: iload 4
      // 56: ifne 68
      // 59: ifnonnull 67
      // 5c: goto 63
      // 5f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: ldc ""
      // 65: nop
      // 66: astore 2
      // 67: aload 3
      // 68: iload 4
      // 6a: ifne 81
      // 6d: ifnonnull 82
      // 70: goto 77
      // 73: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: ldc ""
      // 79: nop
      // 7a: goto 81
      // 7d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: astore 3
      // 82: new tv/twitch/broadcast/StreamInfoForSetting
      // 85: dup
      // 86: invokespecial tv/twitch/broadcast/StreamInfoForSetting.<init> ()V
      // 89: astore 5
      // 8b: aload 5
      // 8d: aload 3
      // 8e: putfield tv/twitch/broadcast/StreamInfoForSetting.streamTitle Ljava/lang/String;
      // 91: aload 5
      // 93: aload 2
      // 94: putfield tv/twitch/broadcast/StreamInfoForSetting.gameName Ljava/lang/String;
      // 97: aload 0
      // 98: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 9b: aload 0
      // 9c: getfield g5v.vom Ltv/twitch/AuthToken;
      // 9f: aload 1
      // a0: aload 5
      // a2: invokevirtual tv/twitch/broadcast/Stream.setStreamInfo (Ltv/twitch/AuthToken;Ljava/lang/String;Ltv/twitch/broadcast/StreamInfoForSetting;)Ltv/twitch/ErrorCode;
      // a5: astore 6
      // a7: aload 0
      // a8: aload 6
      // aa: invokevirtual g5v.uw7 (Ltv/twitch/ErrorCode;)Z
      // ad: pop
      // ae: aload 6
      // b0: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // b3: ireturn
   }

   public boolean v4w() {
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
      // 06: ifeq 1d
      // 09: invokevirtual g5v.nzv ()Z
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 20: aload 0
      // 21: getfield g5v.vom Ltv/twitch/AuthToken;
      // 24: invokevirtual tv/twitch/broadcast/Stream.runCommercial (Ltv/twitch/AuthToken;)Ltv/twitch/ErrorCode;
      // 27: astore 2
      // 28: aload 0
      // 29: aload 2
      // 2a: invokevirtual g5v.uw7 (Ltv/twitch/ErrorCode;)Z
      // 2d: pop
      // 2e: aload 2
      // 2f: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 32: ireturn
   }

   public VideoParams utf(int var1, int var2, float var3, float var4) {
      int[] var5 = this.ejo.getMaxResolution(var1, var2, var3, var4);
      VideoParams var6 = new VideoParams();
      var6.maxKbps = var1;
      var6.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
      var6.pixelFormat = this.kv3();
      var6.targetFps = var2;
      var6.outputWidth = var5[0];
      var6.outputHeight = var5[1];
      var6.disableAdaptiveBitrate = false;
      var6.verticalFlip = false;
      return var6;
   }

   public boolean ulg(VideoParams param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g5v.a J
      // 003: ldc2_w 59514524931284
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: ifnull 12d
      // 011: aload 0
      // 012: invokevirtual g5v.bdw ()Z
      // 015: iload 4
      // 017: ifeq 12e
      // 01a: goto 021
      // 01d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: ifeq 12d
      // 024: goto 02b
      // 027: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02a: athrow
      // 02b: aload 0
      // 02c: aload 1
      // 02d: invokevirtual tv/twitch/broadcast/VideoParams.clone ()Ltv/twitch/broadcast/VideoParams;
      // 030: putfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 033: aload 0
      // 034: new tv/twitch/broadcast/AudioParams
      // 037: dup
      // 038: invokespecial tv/twitch/broadcast/AudioParams.<init> ()V
      // 03b: putfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 03e: aload 0
      // 03f: getfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 042: aload 0
      // 043: getfield g5v.dro Z
      // 046: iload 4
      // 048: ifeq 067
      // 04b: goto 052
      // 04e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: ifeq 07a
      // 055: goto 05c
      // 058: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05b: athrow
      // 05c: aload 0
      // 05d: invokevirtual g5v.gjl ()Z
      // 060: goto 067
      // 063: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: iload 4
      // 069: ifeq 077
      // 06c: ifeq 07a
      // 06f: goto 076
      // 072: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: bipush 1
      // 077: goto 07b
      // 07a: bipush 0
      // 07b: putfield tv/twitch/broadcast/AudioParams.audioEnabled Z
      // 07e: aload 0
      // 07f: getfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 082: aload 0
      // 083: getfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 086: getfield tv/twitch/broadcast/AudioParams.audioEnabled Z
      // 089: putfield tv/twitch/broadcast/AudioParams.enableMicCapture Z
      // 08c: aload 0
      // 08d: getfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 090: aload 0
      // 091: getfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 094: getfield tv/twitch/broadcast/AudioParams.audioEnabled Z
      // 097: putfield tv/twitch/broadcast/AudioParams.enablePlaybackCapture Z
      // 09a: aload 0
      // 09b: getfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 09e: bipush 0
      // 09f: putfield tv/twitch/broadcast/AudioParams.enablePassthroughAudio Z
      // 0a2: aload 0
      // 0a3: iload 4
      // 0a5: ifeq 0c6
      // 0a8: invokevirtual g5v.hkp ()Z
      // 0ab: ifne 0c5
      // 0ae: goto 0b5
      // 0b1: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: aconst_null
      // 0b7: putfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 0ba: aload 0
      // 0bb: aconst_null
      // 0bc: putfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 0bf: bipush 0
      // 0c0: ireturn
      // 0c1: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 0c9: aload 1
      // 0ca: aload 0
      // 0cb: getfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 0ce: aload 0
      // 0cf: getfield g5v.u5w Ltv/twitch/broadcast/IngestServer;
      // 0d2: getstatic tv/twitch/broadcast/StartFlags.None Ltv/twitch/broadcast/StartFlags;
      // 0d5: bipush 1
      // 0d6: invokevirtual tv/twitch/broadcast/Stream.start (Ltv/twitch/broadcast/VideoParams;Ltv/twitch/broadcast/AudioParams;Ltv/twitch/broadcast/IngestServer;Ltv/twitch/broadcast/StartFlags;Z)Ltv/twitch/ErrorCode;
      // 0d9: astore 5
      // 0db: aload 5
      // 0dd: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 0e0: iload 4
      // 0e2: ifeq 12c
      // 0e5: ifeq 124
      // 0e8: goto 0ef
      // 0eb: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: invokevirtual g5v.z71 ()V
      // 0f3: aload 5
      // 0f5: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 0f8: astore 6
      // 0fa: aload 0
      // 0fb: sipush 805
      // 0fe: ldc2_w 1879285997089227960
      // 101: lload 2
      // 102: lxor
      // 103: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: nop
      // 109: bipush 1
      // 10a: anewarray 15
      // 10d: dup
      // 10e: bipush 0
      // 10f: aload 6
      // 111: aastore
      // 112: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 115: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 118: aload 0
      // 119: aconst_null
      // 11a: putfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 11d: aload 0
      // 11e: aconst_null
      // 11f: putfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 122: bipush 0
      // 123: ireturn
      // 124: aload 0
      // 125: getstatic g5v$nin.hcq Lg5v$nin;
      // 128: invokevirtual g5v.koi (Lg5v$nin;)V
      // 12b: bipush 1
      // 12c: ireturn
      // 12d: bipush 0
      // 12e: ireturn
   }

   public boolean l0r() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 22762566075933
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 25
      // 11: invokevirtual g5v.nzv ()Z
      // 14: ifne 24
      // 17: goto 1e
      // 1a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 28: bipush 1
      // 29: invokevirtual tv/twitch/broadcast/Stream.stop (Z)Ltv/twitch/ErrorCode;
      // 2c: astore 4
      // 2e: aload 4
      // 30: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 33: iload 3
      // 34: ifne 74
      // 37: ifeq 68
      // 3a: goto 41
      // 3d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 4
      // 43: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 46: astore 5
      // 48: aload 0
      // 49: sipush 31890
      // 4c: ldc2_w 4667339107939461593
      // 4f: lload 1
      // 50: lxor
      // 51: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: nop
      // 57: bipush 1
      // 58: anewarray 15
      // 5b: dup
      // 5c: bipush 0
      // 5d: aload 5
      // 5f: aastore
      // 60: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 63: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 66: bipush 0
      // 67: ireturn
      // 68: aload 0
      // 69: getstatic g5v$nin.vri Lg5v$nin;
      // 6c: invokevirtual g5v.koi (Lg5v$nin;)V
      // 6f: aload 4
      // 71: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 74: ireturn
   }

   public boolean v8g() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 11546621142738
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 25
      // 11: invokevirtual g5v.nzv ()Z
      // 14: ifne 24
      // 17: goto 1e
      // 1a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 28: invokevirtual tv/twitch/broadcast/Stream.pauseVideo ()Ltv/twitch/ErrorCode;
      // 2b: astore 4
      // 2d: aload 4
      // 2f: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 32: iload 3
      // 33: ifeq 4b
      // 36: ifeq 75
      // 39: goto 40
      // 3c: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: invokevirtual g5v.l0r ()Z
      // 44: goto 4b
      // 47: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: pop
      // 4c: aload 4
      // 4e: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 51: astore 5
      // 53: aload 0
      // 54: sipush 8878
      // 57: ldc2_w 4190080745479165736
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: bipush 1
      // 63: anewarray 15
      // 66: dup
      // 67: bipush 0
      // 68: aload 5
      // 6a: aastore
      // 6b: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 6e: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 71: iload 3
      // 72: ifne 83
      // 75: aload 0
      // 76: getstatic g5v$nin.c8e Lg5v$nin;
      // 79: invokevirtual g5v.koi (Lg5v$nin;)V
      // 7c: goto 83
      // 7f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: aload 4
      // 85: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 88: ireturn
   }

   public boolean y7p() {
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
      // 05: invokevirtual g5v.smq ()Z
      // 08: iload 1
      // 09: ifeq 24
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getstatic g5v$nin.jcl Lg5v$nin;
      // 20: invokevirtual g5v.koi (Lg5v$nin;)V
      // 23: bipush 1
      // 24: ireturn
   }

   public boolean wrf(String var1, long var2, String var4, String var5) {
      long var6 = a ^ 30993628766482L;
      int var8 = OpaquePredicate.c();
      ErrorCode var9 = this.ejo.sendActionMetaData(this.vom, var1, var2, var4, var5);

      label27: {
         try {
            boolean var10000 = ErrorCode.failed(var9);
            if (var8 != 0) {
               return var10000;
            }

            if (var10000) {
               break label27;
            }
         } catch (oov var11) {
            throw a(var11);
         }

         return true;
      }

      String var10 = ErrorCode.getString(var9);
      this.psg(String.format(a<"s">(12226, 7285283943420829061L ^ var6), var10));
      return false;
   }

   public long xd9(String param1, long param2, String param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 102409124629434
      // 06: lxor
      // 07: lstore 6
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 8
      // 0e: aload 0
      // 0f: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 12: aload 0
      // 13: getfield g5v.vom Ltv/twitch/AuthToken;
      // 16: aload 1
      // 17: lload 2
      // 18: aload 4
      // 1a: aload 5
      // 1c: invokevirtual tv/twitch/broadcast/Stream.sendStartSpanMetaData (Ltv/twitch/AuthToken;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)J
      // 1f: lstore 9
      // 21: lload 9
      // 23: iload 8
      // 25: ifne 59
      // 28: ldc2_w -1
      // 2b: lcmp
      // 2c: ifne 57
      // 2f: goto 36
      // 32: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: aload 0
      // 37: sipush 10450
      // 3a: ldc2_w 6147830479893491753
      // 3d: lload 6
      // 3f: lxor
      // 40: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: bipush 0
      // 47: anewarray 15
      // 4a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4d: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 50: goto 57
      // 53: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: lload 9
      // 59: lreturn
   }

   public boolean ba5(String param1, long param2, long param4, String param6, String param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 61120715444661
      // 06: lxor
      // 07: lstore 8
      // 09: invokestatic OpaquePredicate.c ()I
      // 0c: istore 10
      // 0e: lload 4
      // 10: ldc2_w -1
      // 13: lcmp
      // 14: iload 10
      // 16: ifne 4d
      // 19: ifne 4e
      // 1c: goto 23
      // 1f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: sipush 3056
      // 27: ldc2_w 6064407747686418698
      // 2a: lload 8
      // 2c: lxor
      // 2d: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: nop
      // 33: bipush 1
      // 34: anewarray 15
      // 37: dup
      // 38: bipush 0
      // 39: lload 4
      // 3b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e: aastore
      // 3f: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 42: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 45: bipush 0
      // 46: goto 4d
      // 49: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: ireturn
      // 4e: aload 0
      // 4f: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 52: aload 0
      // 53: getfield g5v.vom Ltv/twitch/AuthToken;
      // 56: aload 1
      // 57: lload 2
      // 58: lload 4
      // 5a: aload 6
      // 5c: aload 7
      // 5e: invokevirtual tv/twitch/broadcast/Stream.sendEndSpanMetaData (Ltv/twitch/AuthToken;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Ltv/twitch/ErrorCode;
      // 61: astore 11
      // 63: aload 11
      // 65: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 68: iload 10
      // 6a: ifne a0
      // 6d: ifeq 9f
      // 70: goto 77
      // 73: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 11
      // 79: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 7c: astore 12
      // 7e: aload 0
      // 7f: sipush 28285
      // 82: ldc2_w 9037027265821781122
      // 85: lload 8
      // 87: lxor
      // 88: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: nop
      // 8e: bipush 1
      // 8f: anewarray 15
      // 92: dup
      // 93: bipush 0
      // 94: aload 12
      // 96: aastore
      // 97: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 9a: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 9d: bipush 0
      // 9e: ireturn
      // 9f: bipush 1
      // a0: ireturn
   }

   public void koi(g5v$nin var1) {
      int var2 = OpaquePredicate.c();
      if (var1 != this.w9p) {
         this.w9p = var1;

         try {
            g5v$kot var10000 = this.hpt;
            if (var2 == 0) {
               try {
                  if (var10000 == null) {
                     return;
                  }

                  var10000 = this.hpt;
               } catch (Exception var4) {
                  throw a(var4);
               }
            }

            var10000.l74(var1);
         } catch (Exception var5) {
            this.psg(var5.toString());
         }
      }
   }

   public void peh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g5v.a J
      // 003: ldc2_w 130349611299987
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: iload 3
      // 00e: ifeq 026
      // 011: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 014: ifnull 23a
      // 017: goto 01e
      // 01a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 0
      // 01f: goto 026
      // 022: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: iload 3
      // 027: ifeq 03f
      // 02a: getfield g5v.zeh Z
      // 02d: ifeq 23a
      // 030: goto 037
      // 033: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: aload 0
      // 038: goto 03f
      // 03b: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 042: invokevirtual tv/twitch/broadcast/Stream.pollTasks ()Ltv/twitch/ErrorCode;
      // 045: astore 4
      // 047: aload 0
      // 048: aload 4
      // 04a: invokevirtual g5v.uw7 (Ltv/twitch/ErrorCode;)Z
      // 04d: pop
      // 04e: aload 0
      // 04f: invokevirtual g5v.lsr ()Z
      // 052: iload 3
      // 053: ifeq 0a1
      // 056: ifeq 096
      // 059: goto 060
      // 05c: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield g5v.i2x Lsso;
      // 064: invokevirtual sso.lfg ()V
      // 067: aload 0
      // 068: getfield g5v.i2x Lsso;
      // 06b: invokevirtual sso.kir ()Z
      // 06e: iload 3
      // 06f: ifeq 0a1
      // 072: goto 079
      // 075: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: ifeq 096
      // 07c: goto 083
      // 07f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: aload 0
      // 084: aconst_null
      // 085: putfield g5v.i2x Lsso;
      // 088: aload 0
      // 089: getstatic g5v$nin.a_4 Lg5v$nin;
      // 08c: invokevirtual g5v.koi (Lg5v$nin;)V
      // 08f: goto 096
      // 092: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: getstatic g5v$3.i8m [I
      // 099: aload 0
      // 09a: getfield g5v.w9p Lg5v$nin;
      // 09d: invokevirtual g5v$nin.ordinal ()I
      // 0a0: iaload
      // 0a1: iload 3
      // 0a2: ifeq 10c
      // 0a5: tableswitch 390 1 12 67 147 241 390 390 390 390 390 390 390 394 394
      // 0e4: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: getstatic g5v$nin.zw2 Lg5v$nin;
      // 0ec: invokevirtual g5v.koi (Lg5v$nin;)V
      // 0ef: aload 0
      // 0f0: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 0f3: aload 0
      // 0f4: getfield g5v.vom Ltv/twitch/AuthToken;
      // 0f7: invokevirtual tv/twitch/broadcast/Stream.login (Ltv/twitch/AuthToken;)Ltv/twitch/ErrorCode;
      // 0fa: astore 4
      // 0fc: aload 4
      // 0fe: iload 3
      // 0ff: ifeq 111
      // 102: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 105: goto 10c
      // 108: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10b: athrow
      // 10c: ifeq 23a
      // 10f: aload 4
      // 111: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 114: astore 5
      // 116: aload 0
      // 117: sipush 2726
      // 11a: ldc2_w 2113315510754913644
      // 11d: lload 1
      // 11e: lxor
      // 11f: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: nop
      // 125: bipush 1
      // 126: anewarray 15
      // 129: dup
      // 12a: bipush 0
      // 12b: aload 5
      // 12d: aastore
      // 12e: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 131: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 134: iload 3
      // 135: ifne 23a
      // 138: aload 0
      // 139: getstatic g5v$nin.hc4 Lg5v$nin;
      // 13c: invokevirtual g5v.koi (Lg5v$nin;)V
      // 13f: aload 0
      // 140: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 143: aload 0
      // 144: getfield g5v.vom Ltv/twitch/AuthToken;
      // 147: invokevirtual tv/twitch/broadcast/Stream.getIngestServers (Ltv/twitch/AuthToken;)Ltv/twitch/ErrorCode;
      // 14a: astore 4
      // 14c: aload 4
      // 14e: iload 3
      // 14f: ifeq 16f
      // 152: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 155: ifeq 23a
      // 158: goto 15f
      // 15b: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15e: athrow
      // 15f: aload 0
      // 160: getstatic g5v$nin.dgt Lg5v$nin;
      // 163: invokevirtual g5v.koi (Lg5v$nin;)V
      // 166: aload 4
      // 168: goto 16f
      // 16b: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 172: astore 5
      // 174: aload 0
      // 175: sipush 10193
      // 178: ldc2_w 7482303706337148935
      // 17b: lload 1
      // 17c: lxor
      // 17d: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: nop
      // 183: bipush 1
      // 184: anewarray 15
      // 187: dup
      // 188: bipush 0
      // 189: aload 5
      // 18b: aastore
      // 18c: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 18f: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 192: iload 3
      // 193: ifne 23a
      // 196: aload 0
      // 197: getstatic g5v$nin.a_4 Lg5v$nin;
      // 19a: invokevirtual g5v.koi (Lg5v$nin;)V
      // 19d: aload 0
      // 19e: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 1a1: aload 0
      // 1a2: getfield g5v.vom Ltv/twitch/AuthToken;
      // 1a5: invokevirtual tv/twitch/broadcast/Stream.getUserInfo (Ltv/twitch/AuthToken;)Ltv/twitch/ErrorCode;
      // 1a8: astore 4
      // 1aa: aload 4
      // 1ac: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 1af: iload 3
      // 1b0: ifeq 203
      // 1b3: ifeq 1e2
      // 1b6: goto 1bd
      // 1b9: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bc: athrow
      // 1bd: aload 4
      // 1bf: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 1c2: astore 5
      // 1c4: aload 0
      // 1c5: sipush 27064
      // 1c8: ldc2_w 2001394625367656
      // 1cb: lload 1
      // 1cc: lxor
      // 1cd: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: nop
      // 1d3: bipush 1
      // 1d4: anewarray 15
      // 1d7: dup
      // 1d8: bipush 0
      // 1d9: aload 5
      // 1db: aastore
      // 1dc: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1df: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 1e2: aload 0
      // 1e3: invokevirtual g5v.mze ()V
      // 1e6: aload 0
      // 1e7: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 1ea: aload 0
      // 1eb: getfield g5v.vom Ltv/twitch/AuthToken;
      // 1ee: invokevirtual tv/twitch/broadcast/Stream.getArchivingState (Ltv/twitch/AuthToken;)Ltv/twitch/ErrorCode;
      // 1f1: astore 4
      // 1f3: aload 4
      // 1f5: iload 3
      // 1f6: ifeq 208
      // 1f9: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 1fc: goto 203
      // 1ff: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 202: athrow
      // 203: ifeq 22b
      // 206: aload 4
      // 208: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 20b: astore 5
      // 20d: aload 0
      // 20e: sipush 32390
      // 211: ldc2_w 9037721657763027273
      // 214: lload 1
      // 215: lxor
      // 216: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: nop
      // 21c: bipush 1
      // 21d: anewarray 15
      // 220: dup
      // 221: bipush 0
      // 222: aload 5
      // 224: aastore
      // 225: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 228: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 22b: iload 3
      // 22c: ifne 23a
      // 22f: aload 0
      // 230: invokevirtual g5v.mze ()V
      // 233: goto 23a
      // 236: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 239: athrow
      // 23a: return
   }

   public void mze() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 138111317095844
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: invokestatic java/lang/System.nanoTime ()J
      // 0f: lstore 4
      // 11: lload 4
      // 13: aload 0
      // 14: getfield g5v.d5l J
      // 17: lsub
      // 18: ldc2_w 1000000000
      // 1b: ldiv
      // 1c: lstore 6
      // 1e: iload 3
      // 1f: ifne 3f
      // 22: lload 6
      // 24: ldc2_w 30
      // 27: lcmp
      // 28: iflt 8f
      // 2b: goto 32
      // 2e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 0
      // 33: lload 4
      // 35: putfield g5v.d5l J
      // 38: goto 3f
      // 3b: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 43: aload 0
      // 44: getfield g5v.vom Ltv/twitch/AuthToken;
      // 47: aload 0
      // 48: getfield g5v.ua5 Ljava/lang/String;
      // 4b: invokevirtual tv/twitch/broadcast/Stream.getStreamInfo (Ltv/twitch/AuthToken;Ljava/lang/String;)Ltv/twitch/ErrorCode;
      // 4e: astore 8
      // 50: aload 8
      // 52: iload 3
      // 53: ifne 6c
      // 56: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 59: ifeq 8f
      // 5c: goto 63
      // 5f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62: athrow
      // 63: aload 8
      // 65: goto 6c
      // 68: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 6f: astore 9
      // 71: aload 0
      // 72: sipush 24436
      // 75: ldc2_w 3693415685531597206
      // 78: lload 1
      // 79: lxor
      // 7a: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: bipush 1
      // 81: anewarray 15
      // 84: dup
      // 85: bipush 0
      // 86: aload 9
      // 88: aastore
      // 89: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 8c: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 8f: return
   }

   public sso d9k() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1e
      // 09: invokevirtual g5v.bdw ()Z
      // 0c: ifeq 74
      // 0f: goto 16
      // 12: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: iload 1
      // 1f: ifne 37
      // 22: getfield g5v.j3g Ltv/twitch/broadcast/IngestList;
      // 25: ifnull 74
      // 28: goto 2f
      // 2b: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 0
      // 30: goto 37
      // 33: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: iload 1
      // 38: ifne 70
      // 3b: invokevirtual g5v.lsr ()Z
      // 3e: ifeq 4e
      // 41: goto 48
      // 44: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aconst_null
      // 49: areturn
      // 4a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 0
      // 4f: new sso
      // 52: dup
      // 53: aload 0
      // 54: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 57: aload 0
      // 58: getfield g5v.j3g Ltv/twitch/broadcast/IngestList;
      // 5b: invokespecial sso.<init> (Ltv/twitch/broadcast/Stream;Ltv/twitch/broadcast/IngestList;)V
      // 5e: putfield g5v.i2x Lsso;
      // 61: aload 0
      // 62: getfield g5v.i2x Lsso;
      // 65: invokevirtual sso.plk ()V
      // 68: aload 0
      // 69: getstatic g5v$nin.ttb Lg5v$nin;
      // 6c: invokevirtual g5v.koi (Lg5v$nin;)V
      // 6f: aload 0
      // 70: getfield g5v.i2x Lsso;
      // 73: areturn
      // 74: aconst_null
      // 75: areturn
   }

   public boolean hkp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 24668204273185
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: bipush 3
      // 12: if_icmpge 8b
      // 15: aload 0
      // 16: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 19: aload 0
      // 1a: getfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 1d: getfield tv/twitch/broadcast/VideoParams.outputWidth I
      // 20: aload 0
      // 21: getfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 24: getfield tv/twitch/broadcast/VideoParams.outputHeight I
      // 27: imul
      // 28: bipush 4
      // 29: imul
      // 2a: invokevirtual tv/twitch/broadcast/Stream.allocateFrameBuffer (I)Ltv/twitch/broadcast/FrameBuffer;
      // 2d: astore 5
      // 2f: aload 5
      // 31: invokevirtual tv/twitch/broadcast/FrameBuffer.getIsValid ()Z
      // 34: iload 3
      // 35: ifeq 8c
      // 38: iload 3
      // 39: ifeq 83
      // 3c: goto 43
      // 3f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: ifne 6c
      // 46: goto 4d
      // 49: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: sipush 4640
      // 51: ldc2_w 2265512359628803913
      // 54: lload 1
      // 55: lxor
      // 56: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: nop
      // 5c: bipush 0
      // 5d: anewarray 15
      // 60: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 63: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 66: bipush 0
      // 67: ireturn
      // 68: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield g5v.yjv Ljava/util/List;
      // 70: aload 5
      // 72: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 77: pop
      // 78: aload 0
      // 79: getfield g5v.x1b Ljava/util/List;
      // 7c: aload 5
      // 7e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 83: pop
      // 84: iinc 4 1
      // 87: iload 3
      // 88: ifne 0f
      // 8b: bipush 1
      // 8c: ireturn
   }

   public void z71() {
      int var1 = OpaquePredicate.b();
      int var2 = 0;

      while (true) {
         if (var2 < this.yjv.size()) {
            FrameBuffer var3 = (FrameBuffer)this.yjv.get(var2);

            try {
               var3.free();
               var2++;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         this.x1b.clear();
         this.yjv.clear();
         break;
      }
   }

   public FrameBuffer cso() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v.a J
      // 03: ldc2_w 138408764455882
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield g5v.x1b Ljava/util/List;
      // 10: iload 3
      // 11: ifne 56
      // 14: invokeinterface java/util/List.size ()I 1
      // 19: ifne 42
      // 1c: goto 23
      // 1f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: aload 0
      // 24: sipush 9163
      // 27: ldc2_w 4618361924595387201
      // 2a: lload 1
      // 2b: lxor
      // 2c: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: bipush 0
      // 33: anewarray 15
      // 36: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 39: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 3c: aconst_null
      // 3d: areturn
      // 3e: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: aload 0
      // 43: getfield g5v.x1b Ljava/util/List;
      // 46: aload 0
      // 47: getfield g5v.x1b Ljava/util/List;
      // 4a: invokeinterface java/util/List.size ()I 1
      // 4f: bipush 1
      // 50: isub
      // 51: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 56: checkcast tv/twitch/broadcast/FrameBuffer
      // 59: astore 4
      // 5b: aload 0
      // 5c: getfield g5v.x1b Ljava/util/List;
      // 5f: aload 0
      // 60: getfield g5v.x1b Ljava/util/List;
      // 63: invokeinterface java/util/List.size ()I 1
      // 68: bipush 1
      // 69: isub
      // 6a: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 6f: pop
      // 70: aload 4
      // 72: areturn
   }

   public void k_8(FrameBuffer var1) {
      long var2 = a ^ 2804937899071L;

      try {
         this.ejo.captureFrameBuffer_ReadPixels(var1);
      } catch (Throwable var7) {
         e1i var5 = e1i.cor(var7, a<"s">(32166, 6316413463082685147L ^ var2));
         wsc var6 = var5.i_r(a<"s">(13906, 6794607137141922090L ^ var2));
         var6._0p(a<"s">(5856, 6894777141791439247L ^ var2), Arrays.toString(tsu.fqw()));
         var6._0p(a<"s">(11458, 7521384898538800046L ^ var2), var1);
         var6._0p(a<"s">(209, 2744582763238993849L ^ var2), this.x1b.size());
         var6._0p(a<"s">(25786, 5451901643581017038L ^ var2), this.yjv.size());
         throw new oov(var5);
      }
   }

   public ErrorCode og6(FrameBuffer param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic g5v.a J
      // 003: ldc2_w 122953817216758
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: invokevirtual g5v.smq ()Z
      // 011: iload 4
      // 013: ifeq 048
      // 016: ifeq 031
      // 019: goto 020
      // 01c: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01f: athrow
      // 020: aload 0
      // 021: invokevirtual g5v.y7p ()Z
      // 024: pop
      // 025: iload 4
      // 027: ifne 053
      // 02a: goto 031
      // 02d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 0
      // 032: iload 4
      // 034: ifeq 054
      // 037: goto 03e
      // 03a: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03d: athrow
      // 03e: invokevirtual g5v.nzv ()Z
      // 041: goto 048
      // 044: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: ifne 053
      // 04b: getstatic tv/twitch/ErrorCode.TTV_EC_STREAM_NOT_STARTED Ltv/twitch/ErrorCode;
      // 04e: areturn
      // 04f: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 0
      // 054: getfield g5v.ejo Ltv/twitch/broadcast/Stream;
      // 057: aload 1
      // 058: invokevirtual tv/twitch/broadcast/Stream.submitVideoFrame (Ltv/twitch/broadcast/FrameBuffer;)Ltv/twitch/ErrorCode;
      // 05b: astore 5
      // 05d: aload 5
      // 05f: iload 4
      // 061: ifeq 107
      // 064: getstatic tv/twitch/ErrorCode.TTV_EC_SUCCESS Ltv/twitch/ErrorCode;
      // 067: if_acmpeq 105
      // 06a: goto 071
      // 06d: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: aload 5
      // 073: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 076: astore 6
      // 078: aload 5
      // 07a: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 07d: iload 4
      // 07f: ifeq 0df
      // 082: ifeq 0b6
      // 085: goto 08c
      // 088: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: aload 0
      // 08d: sipush 3607
      // 090: ldc2_w 6020713864535526320
      // 093: lload 2
      // 094: lxor
      // 095: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: nop
      // 09b: bipush 1
      // 09c: anewarray 15
      // 09f: dup
      // 0a0: bipush 0
      // 0a1: aload 6
      // 0a3: aastore
      // 0a4: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0a7: invokevirtual g5v.yli (Ljava/lang/String;)V
      // 0aa: iload 4
      // 0ac: ifne 0e0
      // 0af: goto 0b6
      // 0b2: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: sipush 8790
      // 0ba: ldc2_w 2424226574875355122
      // 0bd: lload 2
      // 0be: lxor
      // 0bf: invokedynamic s (IJ)Ljava/lang/String; bsm=g5v.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: nop
      // 0c5: bipush 1
      // 0c6: anewarray 15
      // 0c9: dup
      // 0ca: bipush 0
      // 0cb: aload 6
      // 0cd: aastore
      // 0ce: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0d1: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 0d4: aload 0
      // 0d5: invokevirtual g5v.l0r ()Z
      // 0d8: goto 0df
      // 0db: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: pop
      // 0e0: aload 0
      // 0e1: getfield g5v.hpt Lg5v$kot;
      // 0e4: iload 4
      // 0e6: ifeq 0fe
      // 0e9: ifnull 105
      // 0ec: goto 0f3
      // 0ef: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: getfield g5v.hpt Lg5v$kot;
      // 0f7: goto 0fe
      // 0fa: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 5
      // 100: invokeinterface g5v$kot.jdi (Ltv/twitch/ErrorCode;)V 2
      // 105: aload 5
      // 107: areturn
   }

   public boolean uw7(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 08: iload 2
      // 09: ifne 25
      // 0c: ifeq 24
      // 0f: goto 16
      // 12: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 1b: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic g5v.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: bipush 1
      // 25: ireturn
   }

   public void psg(String var1) {
      long var2 = a ^ 45985007475442L;
      this.la0 = var1;
      tsu.u1p(a<"s">(1585, 5066552116488179613L ^ var2) + var1);
      tvj.error(gwo.fd3, a<"s">(13794, 3928878808384257118L ^ var2), new Object[]{var1});
   }

   public void yli(String var1) {
      long var2 = a ^ 43241997772978L;
      tsu.u1p(a<"s">(195, 4822442130030967598L ^ var2) + var1);
      tvj.warn(gwo.fd3, a<"s">(2779, 5255768370015678765L ^ var2), new Object[]{var1});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8391726036445074484L, -914073563663177309L, MethodHandles.lookup().lookupClass()).a(91094408942150L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 17277536555681L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[29];
      int var7 = 0;
      String var6 = "m\u008dúX\u00ad¥\u0096\u0096>\u0007úëj¢·Èöbë\u000e#\u0001Õb\u001eWÌ8EÌ)j\u001d\u0093Ø\u0016õ¿iö§ÿ\u0096HWåÏó¯g\u0081Kí\\\u0017PÙ\u007f\u0017;©E·\u00008ÑÆåÛ\nÊZê×#¾ÇÅåÝ5M]K»¶M©¿0¡Ì\u008c\u0019j\u000fÚÍ×âB=J\u009d=6\u001f£ÊFJÝ%G9çè\u0087^OF Â\u0002«\u0098ÑC\u000eÕ¤\u0084@%íMöÈ´1î\u009cßYâ\u00adHÁ\u009bqV¯ói8Î$Ë\u0007¼æ·lX\u0088\fÈ÷í\b\r\u0091-\u0092K³\u0005mñ®é9pí\u009fÿ]ÒWöCÂ\u0016g\u0083,\u0092\u0090\u000fðz.sÅ\u0005~.\u008bV\u0082Ã8\u0093Y6Î½ç(ñ\b`\bN|ª$é\u0005o¢\u009eü2\u0007\u0090ª'9ÛÈÅÂç\u007f\u00073\u001d)v®é\u0096cÇ\u0094\u0096ß¿~!Ñs-Î\u0098PsP§\u008e,i%,ß8ä\u0004«\u0011\u0011B\u009fE4ó¿NÒ~}`\u0004Y>þ©æ\u0096ª\u009f\u0097\u009a-µ_ÃJ\u0081}dH\u0019\u009e¸\u001eëÇw\u009a\n|\u008b>¬¥\f8)\bîA>¹sÛÇ\u0080þ\u0084\u001fcXèr !\u00980Ûâ~\u0013nZr]«FÞÚ\u008d©+Äo\u00165\u0014×Âó% ÈmZ ûzÊ\"'Ï\u0004ó?3÷2\u0007¬À\bF[W@P\u0002p\u0097Ëw\u0006Ft¯\u001aÀ\u0003Â\bG\rÖÌ\u0014\u007f\u001aR~§Ü\u001eµ\u009f\u009b\u009f®Ñè\u0080\u008e\u009d#NÛáFC/É\f1àæ/cü\u009f¦¨m¶Ø;\u0014V@åc0\u0093æ/rÉ\u0004\u008c\u008au¸âÒþ|\u0019½ä\u001d>öp0Hbµ\u000b\u001e\u0005B½QÁÊ>\u008fÌÆ¡O\u0082:jñ:1S¸;(\u001d\u0005ú\u0087q3å\u00821\\\u0095$Ëw\u008d0\u0002Q\u0013\u008d\u0002ö¬¨\\\u0013¬GÜ=YO\u0015v\u000b#\u0001L¦T8>Äis\u00917\u0087\u008a8l¢@\u0098¤\u0016lH-\u0086+ÈÊ Z\u0094ú_z\u0006b[´S/¨©|ÎýM\u001cäø\u0007×Fò17uMÿ\u00109\u0019Y8\u000e7Ì~ÛY\u001a\u000e\u000eº¯Óidv%T\u008eàÁÁVÁ\u0097ºl\u0010#¬\u0010âc\u001dCL©³R¾\u0084&V\u0011¬@@\u0001ê÷}|\u008cIø=6@\u0017ëo\u008f d\u0017;~ÿL\u0012\u009aá\u0084\u0098Ù\u0017\u00075\u0003ÈÒ®^²\u0082\u001e¿Ã¢£x\u0019EüÒ\u0080N\u009f\u0019T0½ÂRûk\u009cÉ\u0001<=\f\fs\u0097!³\u00179*ã\u009e@ì}Ï²¥K[¿Ý¬\u0086ô\u0004X\u001d&\u007f÷2vA\u0088\u0002WÄ\rÓy1Y\u0011·6egH\u0015Ê\u0001¶NÕ/9\u0010\u0092BN \u009f4ØÁ@S@3B£O¼úÞl(p\u0081V\u0087\u007f-þ,6\u009cb\u0006¤\u0016I%#\u0096\u0000ï³\u0006¾\u0095ùe\u0003qþ\u0092\u000e¾ÙÜ%g\u008fØWu@Ï@`,AõÔ\u0016[\u0004\bÏM\u0002\u0018¡Äúx\u0097o\u0089\u009b¡\u009b6ªþÓmª.xRÍ¨OÅôSY$+ñéÃiÄ\u0099\rÔúµÄXg(¡®l°!ÄÅ@üz\u0092µ\u0085X#o¹\u008eóô\u0089¸Ø\u0018®ªtç\u0099\u0013á¼\u0091\fE\u0010fxÌ¡Ü?-\u0013\u0004\bxÆ«]ü,!T¨ØºÃ\u008ff-U\u0086ý8ðÜ\u0018m7\u0006ø8\u0012SÀ\u0080ðÛ\u0080}ã~ÿ\u0015}{\u0097þZ\u0015æ\f\nN\u0088sêhÉ:~Mç\n»\u001f%Å;NF\u0081\\·½\u009a\u0011çiðò\nA\u0093V¥¯\u0086(GK\u000eC¨X\u0010¨'\n(\u0006MjIe¾¾\u0088\u0013dP©\u0088S\u00ad\u0003vv!Ó9ï¦»\u0014²\u00136\u0010H\u0007\u0002mi\u0080\u00adí·CQUs\n\u0093Õ\\\u0086)\u0007\u0000³\u0006©\u0084<©\u0081\u0017b@UZó½ÏsÊ\u001el\u0095SR,\u001fIá!ØY[ÏÕ\\i\u0006Fóåðð[Ëú\u009c\u0011\u009fÐ\u0015VD}ï@\u0089ãoÈ\u0012\u000bA'\u0018\u0018q4Pë\u0005q \\\u008a³\u001e»+\u009c»7\u009d+sX}ÆÿU\u0015J\r17\u0092¾/\u001aJ\\Þ×\u0005`Óìòµ¯EE¨Ø0§~0\u001f\u0006( ÑØ:_!ñ\u0093\u0010¹ \u0097¶5\u000eË\u001eª\u008e¶ñä\u008e\u0080Î$Uµ\u001e¦~^¦\u0006\u0096\u008c]SêÎ\u0010\u0085-¢âtD\u0014R¾Ê\u0002Ý/ÓËãH÷>\u0088ã·;ï\u0099ý\u0088\u0003\u009e6gÈ\u0084¸ÏhIÁH\u0016¶g4\u0015Þ(B~õØl©\u0004.\u001a\\o\u0098Kåî`±N\n¢\u009e§®\u009dfB\\}Úú\u0006P{ÀJ²ÉÖ\u0085\f°ë\u00890l\u001b¼\u0093ã ¸\u00119óÃ\u008dµ\u0013-tøJ\u00123\u008cO\u0006îè\"w\u0085!û!ãýêq\u0001ß\u000e=·{¼gcëüF§@¾-\u000e\u001dÇÏÜè\u0000~F)mbÎb¢Vre\u009c,\u0016\u0011¾\u0007A¯?\u001fD\u0007PË\u0010+EÕe½£h\u001fËU7U¦\u0083Ì\u0094ÈåCÜ\u000e¦¿\u008dó/ë\u0094\u0007 è\u0014bP,bçeþXó[/@Á»%8þM\u009bý\u000f\th\u0018ÿ\u0092ßÔhG";
      int var8 = "m\u008dúX\u00ad¥\u0096\u0096>\u0007úëj¢·Èöbë\u000e#\u0001Õb\u001eWÌ8EÌ)j\u001d\u0093Ø\u0016õ¿iö§ÿ\u0096HWåÏó¯g\u0081Kí\\\u0017PÙ\u007f\u0017;©E·\u00008ÑÆåÛ\nÊZê×#¾ÇÅåÝ5M]K»¶M©¿0¡Ì\u008c\u0019j\u000fÚÍ×âB=J\u009d=6\u001f£ÊFJÝ%G9çè\u0087^OF Â\u0002«\u0098ÑC\u000eÕ¤\u0084@%íMöÈ´1î\u009cßYâ\u00adHÁ\u009bqV¯ói8Î$Ë\u0007¼æ·lX\u0088\fÈ÷í\b\r\u0091-\u0092K³\u0005mñ®é9pí\u009fÿ]ÒWöCÂ\u0016g\u0083,\u0092\u0090\u000fðz.sÅ\u0005~.\u008bV\u0082Ã8\u0093Y6Î½ç(ñ\b`\bN|ª$é\u0005o¢\u009eü2\u0007\u0090ª'9ÛÈÅÂç\u007f\u00073\u001d)v®é\u0096cÇ\u0094\u0096ß¿~!Ñs-Î\u0098PsP§\u008e,i%,ß8ä\u0004«\u0011\u0011B\u009fE4ó¿NÒ~}`\u0004Y>þ©æ\u0096ª\u009f\u0097\u009a-µ_ÃJ\u0081}dH\u0019\u009e¸\u001eëÇw\u009a\n|\u008b>¬¥\f8)\bîA>¹sÛÇ\u0080þ\u0084\u001fcXèr !\u00980Ûâ~\u0013nZr]«FÞÚ\u008d©+Äo\u00165\u0014×Âó% ÈmZ ûzÊ\"'Ï\u0004ó?3÷2\u0007¬À\bF[W@P\u0002p\u0097Ëw\u0006Ft¯\u001aÀ\u0003Â\bG\rÖÌ\u0014\u007f\u001aR~§Ü\u001eµ\u009f\u009b\u009f®Ñè\u0080\u008e\u009d#NÛáFC/É\f1àæ/cü\u009f¦¨m¶Ø;\u0014V@åc0\u0093æ/rÉ\u0004\u008c\u008au¸âÒþ|\u0019½ä\u001d>öp0Hbµ\u000b\u001e\u0005B½QÁÊ>\u008fÌÆ¡O\u0082:jñ:1S¸;(\u001d\u0005ú\u0087q3å\u00821\\\u0095$Ëw\u008d0\u0002Q\u0013\u008d\u0002ö¬¨\\\u0013¬GÜ=YO\u0015v\u000b#\u0001L¦T8>Äis\u00917\u0087\u008a8l¢@\u0098¤\u0016lH-\u0086+ÈÊ Z\u0094ú_z\u0006b[´S/¨©|ÎýM\u001cäø\u0007×Fò17uMÿ\u00109\u0019Y8\u000e7Ì~ÛY\u001a\u000e\u000eº¯Óidv%T\u008eàÁÁVÁ\u0097ºl\u0010#¬\u0010âc\u001dCL©³R¾\u0084&V\u0011¬@@\u0001ê÷}|\u008cIø=6@\u0017ëo\u008f d\u0017;~ÿL\u0012\u009aá\u0084\u0098Ù\u0017\u00075\u0003ÈÒ®^²\u0082\u001e¿Ã¢£x\u0019EüÒ\u0080N\u009f\u0019T0½ÂRûk\u009cÉ\u0001<=\f\fs\u0097!³\u00179*ã\u009e@ì}Ï²¥K[¿Ý¬\u0086ô\u0004X\u001d&\u007f÷2vA\u0088\u0002WÄ\rÓy1Y\u0011·6egH\u0015Ê\u0001¶NÕ/9\u0010\u0092BN \u009f4ØÁ@S@3B£O¼úÞl(p\u0081V\u0087\u007f-þ,6\u009cb\u0006¤\u0016I%#\u0096\u0000ï³\u0006¾\u0095ùe\u0003qþ\u0092\u000e¾ÙÜ%g\u008fØWu@Ï@`,AõÔ\u0016[\u0004\bÏM\u0002\u0018¡Äúx\u0097o\u0089\u009b¡\u009b6ªþÓmª.xRÍ¨OÅôSY$+ñéÃiÄ\u0099\rÔúµÄXg(¡®l°!ÄÅ@üz\u0092µ\u0085X#o¹\u008eóô\u0089¸Ø\u0018®ªtç\u0099\u0013á¼\u0091\fE\u0010fxÌ¡Ü?-\u0013\u0004\bxÆ«]ü,!T¨ØºÃ\u008ff-U\u0086ý8ðÜ\u0018m7\u0006ø8\u0012SÀ\u0080ðÛ\u0080}ã~ÿ\u0015}{\u0097þZ\u0015æ\f\nN\u0088sêhÉ:~Mç\n»\u001f%Å;NF\u0081\\·½\u009a\u0011çiðò\nA\u0093V¥¯\u0086(GK\u000eC¨X\u0010¨'\n(\u0006MjIe¾¾\u0088\u0013dP©\u0088S\u00ad\u0003vv!Ó9ï¦»\u0014²\u00136\u0010H\u0007\u0002mi\u0080\u00adí·CQUs\n\u0093Õ\\\u0086)\u0007\u0000³\u0006©\u0084<©\u0081\u0017b@UZó½ÏsÊ\u001el\u0095SR,\u001fIá!ØY[ÏÕ\\i\u0006Fóåðð[Ëú\u009c\u0011\u009fÐ\u0015VD}ï@\u0089ãoÈ\u0012\u000bA'\u0018\u0018q4Pë\u0005q \\\u008a³\u001e»+\u009c»7\u009d+sX}ÆÿU\u0015J\r17\u0092¾/\u001aJ\\Þ×\u0005`Óìòµ¯EE¨Ø0§~0\u001f\u0006( ÑØ:_!ñ\u0093\u0010¹ \u0097¶5\u000eË\u001eª\u008e¶ñä\u008e\u0080Î$Uµ\u001e¦~^¦\u0006\u0096\u008c]SêÎ\u0010\u0085-¢âtD\u0014R¾Ê\u0002Ý/ÓËãH÷>\u0088ã·;ï\u0099ý\u0088\u0003\u009e6gÈ\u0084¸ÏhIÁH\u0016¶g4\u0015Þ(B~õØl©\u0004.\u001a\\o\u0098Kåî`±N\n¢\u009e§®\u009dfB\\}Úú\u0006P{ÀJ²ÉÖ\u0085\f°ë\u00890l\u001b¼\u0093ã ¸\u00119óÃ\u008dµ\u0013-tøJ\u00123\u008cO\u0006îè\"w\u0085!û!ãýêq\u0001ß\u000e=·{¼gcëüF§@¾-\u000e\u001dÇÏÜè\u0000~F)mbÎb¢Vre\u009c,\u0016\u0011¾\u0007A¯?\u001fD\u0007PË\u0010+EÕe½£h\u001fËU7U¦\u0083Ì\u0094ÈåCÜ\u000e¦¿\u008dó/ë\u0094\u0007 è\u0014bP,bçeþXó[/@Á»%8þM\u009bý\u000f\th\u0018ÿ\u0092ßÔhG"
         .length();
      char var5 = '@';
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
                     c = new String[29];
                     tvj = LogManager.getLogger();
                     tsu = new kja(String.class, 50);
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

                  var6 = ":=õ>\u0094/Õ>N^ñ2IÓs\u0007Ýv\u0091Câo\u0081>®0U¡\u008aÎ\u009c\u0093(\u0017·Ý±-Ï:\u008f\u0092\u00121å ±3â\u001bÓ\u00005ºõ3ÇÓþ¶òsÌRªÍcH\t\\aè\u000b";
                  var8 = ":=õ>\u0094/Õ>N^ñ2IÓs\u0007Ýv\u0091Câo\u0081>®0U¡\u008aÎ\u009c\u0093(\u0017·Ý±-Ï:\u008f\u0092\u00121å ±3â\u001bÓ\u00005ºõ3ÇÓþ¶òsÌRªÍcH\t\\aè\u000b"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12392;
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
            throw new RuntimeException("g5v", var10);
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
         throw new RuntimeException("g5v" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
