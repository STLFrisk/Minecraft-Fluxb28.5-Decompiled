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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatEmoticonData;
import tv.twitch.chat.IChatAPIListener;

public class _r7 {
   private static final Logger d90;
   public _r7$ja4 n0t;
   public String gjw;
   public String sst;
   public String ml_;
   public Core rco;
   public Chat j35;
   public _r7$lw7 pq_;
   public AuthToken bzw;
   public HashMap zp8;
   public int j97;
   public _r7$wl_ dgq;
   public _r7$wl_ azf;
   public ChatEmoticonData dvi;
   public int m1i;
   public int _na;
   public IChatAPIListener rr1;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public void zcl(_r7$ja4 var1) {
      this.n0t = var1;
   }

   public void eld(AuthToken var1) {
      this.bzw = var1;
   }

   public void k45(String var1) {
      this.sst = var1;
   }

   public void aqm(String var1) {
      this.gjw = var1;
   }

   public _r7$lw7 tuw() {
      return this.pq_;
   }

   public boolean cm_(String param1) {
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
      // 05: getfield _r7.zp8 Ljava/util/HashMap;
      // 08: aload 1
      // 09: iload 2
      // 0a: ifeq 25
      // 0d: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 10: ifne 20
      // 13: goto 1a
      // 16: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield _r7.zp8 Ljava/util/HashMap;
      // 24: aload 1
      // 25: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 28: checkcast _r7$pg7
      // 2b: astore 3
      // 2c: aload 3
      // 2d: invokevirtual _r7$pg7.ymk ()L_r7$rb4;
      // 30: getstatic _r7$rb4.k3_ L_r7$rb4;
      // 33: if_acmpne 3e
      // 36: bipush 1
      // 37: goto 3f
      // 3a: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   public _r7$rb4 u7c(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield _r7.zp8 Ljava/util/HashMap;
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 27
      // 0d: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 10: ifne 22
      // 13: goto 1a
      // 16: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: getstatic _r7$rb4.p3k L_r7$rb4;
      // 1d: areturn
      // 1e: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: getfield _r7.zp8 Ljava/util/HashMap;
      // 26: aload 1
      // 27: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: checkcast _r7$pg7
      // 2d: astore 3
      // 2e: aload 3
      // 2f: invokevirtual _r7$pg7.ymk ()L_r7$rb4;
      // 32: areturn
   }

   public _r7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: aconst_null
      // 06: putfield _r7.n0t L_r7$ja4;
      // 09: aload 0
      // 0a: ldc ""
      // 0c: nop
      // 0d: putfield _r7.gjw Ljava/lang/String;
      // 10: invokestatic OpaquePredicate.b ()I
      // 13: aload 0
      // 14: ldc ""
      // 16: nop
      // 17: putfield _r7.sst Ljava/lang/String;
      // 1a: aload 0
      // 1b: ldc ""
      // 1d: nop
      // 1e: putfield _r7.ml_ Ljava/lang/String;
      // 21: istore 1
      // 22: aload 0
      // 23: aconst_null
      // 24: putfield _r7.rco Ltv/twitch/Core;
      // 27: aload 0
      // 28: aconst_null
      // 29: putfield _r7.j35 Ltv/twitch/chat/Chat;
      // 2c: aload 0
      // 2d: getstatic _r7$lw7.hec L_r7$lw7;
      // 30: putfield _r7.pq_ L_r7$lw7;
      // 33: aload 0
      // 34: new tv/twitch/AuthToken
      // 37: dup
      // 38: invokespecial tv/twitch/AuthToken.<init> ()V
      // 3b: putfield _r7.bzw Ltv/twitch/AuthToken;
      // 3e: aload 0
      // 3f: new java/util/HashMap
      // 42: dup
      // 43: invokespecial java/util/HashMap.<init> ()V
      // 46: putfield _r7.zp8 Ljava/util/HashMap;
      // 49: aload 0
      // 4a: sipush 128
      // 4d: putfield _r7.j97 I
      // 50: aload 0
      // 51: getstatic _r7$wl_.ora L_r7$wl_;
      // 54: putfield _r7.dgq L_r7$wl_;
      // 57: aload 0
      // 58: getstatic _r7$wl_.ora L_r7$wl_;
      // 5b: putfield _r7.azf L_r7$wl_;
      // 5e: aload 0
      // 5f: aconst_null
      // 60: putfield _r7.dvi Ltv/twitch/chat/ChatEmoticonData;
      // 63: aload 0
      // 64: sipush 500
      // 67: putfield _r7.m1i I
      // 6a: aload 0
      // 6b: sipush 2000
      // 6e: putfield _r7._na I
      // 71: aload 0
      // 72: new _r7$1
      // 75: dup
      // 76: aload 0
      // 77: invokespecial _r7$1.<init> (L_r7;)V
      // 7a: putfield _r7.rr1 Ltv/twitch/chat/IChatAPIListener;
      // 7d: aload 0
      // 7e: invokestatic tv/twitch/Core.getInstance ()Ltv/twitch/Core;
      // 81: putfield _r7.rco Ltv/twitch/Core;
      // 84: aload 0
      // 85: iload 1
      // 86: ifeq b0
      // 89: getfield _r7.rco Ltv/twitch/Core;
      // 8c: ifnonnull af
      // 8f: goto 96
      // 92: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: aload 0
      // 97: new tv/twitch/Core
      // 9a: dup
      // 9b: new tv/twitch/StandardCoreAPI
      // 9e: dup
      // 9f: invokespecial tv/twitch/StandardCoreAPI.<init> ()V
      // a2: invokespecial tv/twitch/Core.<init> (Ltv/twitch/CoreAPI;)V
      // a5: putfield _r7.rco Ltv/twitch/Core;
      // a8: goto af
      // ab: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: aload 0
      // b0: new tv/twitch/chat/Chat
      // b3: dup
      // b4: new tv/twitch/chat/StandardChatAPI
      // b7: dup
      // b8: invokespecial tv/twitch/chat/StandardChatAPI.<init> ()V
      // bb: invokespecial tv/twitch/chat/Chat.<init> (Ltv/twitch/chat/ChatAPI;)V
      // be: putfield _r7.j35 Ltv/twitch/chat/Chat;
      // c1: return
   }

   public boolean w33() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic _r7.a J
      // 003: ldc2_w 137183673349272
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: iload 3
      // 00e: ifne 02f
      // 011: getfield _r7.pq_ L_r7$lw7;
      // 014: getstatic _r7$lw7.hec L_r7$lw7;
      // 017: if_acmpeq 027
      // 01a: goto 021
      // 01d: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: bipush 0
      // 022: ireturn
      // 023: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 0
      // 028: getstatic _r7$lw7.a1d L_r7$lw7;
      // 02b: invokevirtual _r7.feh (L_r7$lw7;)V
      // 02e: aload 0
      // 02f: getfield _r7.rco Ltv/twitch/Core;
      // 032: aload 0
      // 033: getfield _r7.sst Ljava/lang/String;
      // 036: aconst_null
      // 037: checkcast java/lang/String
      // 03a: invokevirtual tv/twitch/Core.initialize (Ljava/lang/String;Ljava/lang/String;)Ltv/twitch/ErrorCode;
      // 03d: astore 4
      // 03f: iload 3
      // 040: ifne 088
      // 043: aload 4
      // 045: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 048: ifeq 080
      // 04b: goto 052
      // 04e: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: aload 0
      // 053: getstatic _r7$lw7.hec L_r7$lw7;
      // 056: invokevirtual _r7.feh (L_r7$lw7;)V
      // 059: aload 4
      // 05b: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 05e: astore 5
      // 060: aload 0
      // 061: sipush 23937
      // 064: ldc2_w 8279745204646973481
      // 067: lload 1
      // 068: lxor
      // 069: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: nop
      // 06f: bipush 1
      // 070: anewarray 15
      // 073: dup
      // 074: bipush 0
      // 075: aload 5
      // 077: aastore
      // 078: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 07b: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 07e: bipush 0
      // 07f: ireturn
      // 080: aload 0
      // 081: aload 0
      // 082: getfield _r7.dgq L_r7$wl_;
      // 085: putfield _r7.azf L_r7$wl_;
      // 088: new java/util/HashSet
      // 08b: dup
      // 08c: invokespecial java/util/HashSet.<init> ()V
      // 08f: astore 5
      // 091: getstatic _r7$2.c7v [I
      // 094: aload 0
      // 095: getfield _r7.dgq L_r7$wl_;
      // 098: invokevirtual _r7$wl_.ordinal ()I
      // 09b: iaload
      // 09c: iload 3
      // 09d: ifne 10c
      // 0a0: tableswitch 88 1 3 32 52 72
      // 0bc: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: aload 5
      // 0c2: getstatic tv/twitch/chat/ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE Ltv/twitch/chat/ChatTokenizationOption;
      // 0c5: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0c8: pop
      // 0c9: iload 3
      // 0ca: ifeq 0f8
      // 0cd: goto 0d4
      // 0d0: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: aload 5
      // 0d6: getstatic tv/twitch/chat/ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS Ltv/twitch/chat/ChatTokenizationOption;
      // 0d9: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0dc: pop
      // 0dd: iload 3
      // 0de: ifeq 0f8
      // 0e1: goto 0e8
      // 0e4: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 5
      // 0ea: getstatic tv/twitch/chat/ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES Ltv/twitch/chat/ChatTokenizationOption;
      // 0ed: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 0f0: pop
      // 0f1: goto 0f8
      // 0f4: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 0fc: aload 5
      // 0fe: aload 0
      // 0ff: getfield _r7.rr1 Ltv/twitch/chat/IChatAPIListener;
      // 102: invokevirtual tv/twitch/chat/Chat.initialize (Ljava/util/HashSet;Ltv/twitch/chat/IChatAPIListener;)Ltv/twitch/ErrorCode;
      // 105: astore 4
      // 107: aload 4
      // 109: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 10c: iload 3
      // 10d: ifne 158
      // 110: ifeq 150
      // 113: goto 11a
      // 116: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 0
      // 11b: getfield _r7.rco Ltv/twitch/Core;
      // 11e: invokevirtual tv/twitch/Core.shutdown ()Ltv/twitch/ErrorCode;
      // 121: pop
      // 122: aload 0
      // 123: getstatic _r7$lw7.hec L_r7$lw7;
      // 126: invokevirtual _r7.feh (L_r7$lw7;)V
      // 129: aload 4
      // 12b: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 12e: astore 6
      // 130: aload 0
      // 131: sipush 6449
      // 134: ldc2_w 6888697810529571991
      // 137: lload 1
      // 138: lxor
      // 139: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: nop
      // 13f: bipush 1
      // 140: anewarray 15
      // 143: dup
      // 144: bipush 0
      // 145: aload 6
      // 147: aastore
      // 148: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 14b: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 14e: bipush 0
      // 14f: ireturn
      // 150: aload 0
      // 151: getstatic _r7$lw7.g2t L_r7$lw7;
      // 154: invokevirtual _r7.feh (L_r7$lw7;)V
      // 157: bipush 1
      // 158: ireturn
   }

   public boolean jip(String var1) {
      return this.pj0(var1, false);
   }

   public boolean pj0(String param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 82065190625654
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: iload 5
      // 10: ifeq 2a
      // 13: getfield _r7.pq_ L_r7$lw7;
      // 16: getstatic _r7$lw7.g2t L_r7$lw7;
      // 19: if_acmpeq 29
      // 1c: goto 23
      // 1f: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield _r7.zp8 Ljava/util/HashMap;
      // 2d: aload 1
      // 2e: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 31: iload 5
      // 33: ifeq 6b
      // 36: ifeq 6c
      // 39: goto 40
      // 3c: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: new java/lang/StringBuilder
      // 44: dup
      // 45: invokespecial java/lang/StringBuilder.<init> ()V
      // 48: sipush 27052
      // 4b: ldc2_w 2008816079952966119
      // 4e: lload 3
      // 4f: lxor
      // 50: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: nop
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 1
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 63: bipush 0
      // 64: goto 6b
      // 67: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: ireturn
      // 6c: aload 1
      // 6d: iload 5
      // 6f: ifeq 7d
      // 72: ifnull d4
      // 75: goto 7c
      // 78: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7b: athrow
      // 7c: aload 1
      // 7d: ldc ""
      // 7f: nop
      // 80: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 83: iload 5
      // 85: ifeq d5
      // 88: ifne d4
      // 8b: goto 92
      // 8e: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 91: athrow
      // 92: new _r7$pg7
      // 95: dup
      // 96: aload 0
      // 97: aload 1
      // 98: invokespecial _r7$pg7.<init> (L_r7;Ljava/lang/String;)V
      // 9b: astore 6
      // 9d: aload 0
      // 9e: getfield _r7.zp8 Ljava/util/HashMap;
      // a1: aload 1
      // a2: aload 6
      // a4: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // a7: pop
      // a8: aload 6
      // aa: iload 2
      // ab: invokevirtual _r7$pg7.qd5 (Z)Z
      // ae: istore 7
      // b0: iload 7
      // b2: iload 5
      // b4: ifeq d3
      // b7: ifne d1
      // ba: goto c1
      // bd: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c0: athrow
      // c1: aload 0
      // c2: getfield _r7.zp8 Ljava/util/HashMap;
      // c5: aload 1
      // c6: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // c9: pop
      // ca: goto d1
      // cd: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d0: athrow
      // d1: iload 7
      // d3: ireturn
      // d4: bipush 0
      // d5: ireturn
   }

   public boolean kta(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 52574867319890
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 2a
      // 13: getfield _r7.pq_ L_r7$lw7;
      // 16: getstatic _r7$lw7.g2t L_r7$lw7;
      // 19: if_acmpeq 29
      // 1c: goto 23
      // 1f: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield _r7.zp8 Ljava/util/HashMap;
      // 2d: aload 1
      // 2e: iload 4
      // 30: ifne 6e
      // 33: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 36: ifne 69
      // 39: goto 40
      // 3c: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: new java/lang/StringBuilder
      // 44: dup
      // 45: invokespecial java/lang/StringBuilder.<init> ()V
      // 48: sipush 27956
      // 4b: ldc2_w 8543317437362223194
      // 4e: lload 2
      // 4f: lxor
      // 50: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: nop
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 1
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 63: bipush 0
      // 64: ireturn
      // 65: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield _r7.zp8 Ljava/util/HashMap;
      // 6d: aload 1
      // 6e: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 71: checkcast _r7$pg7
      // 74: astore 5
      // 76: aload 5
      // 78: invokevirtual _r7$pg7.xdw ()Z
      // 7b: ireturn
   }

   public boolean jsz() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 127438941047280
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 28
      // 11: getfield _r7.pq_ L_r7$lw7;
      // 14: getstatic _r7$lw7.g2t L_r7$lw7;
      // 17: if_acmpeq 27
      // 1a: goto 21
      // 1d: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 0
      // 28: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 2b: invokevirtual tv/twitch/chat/Chat.shutdown ()Ltv/twitch/ErrorCode;
      // 2e: astore 4
      // 30: aload 4
      // 32: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 35: iload 3
      // 36: ifne 76
      // 39: ifeq 6a
      // 3c: goto 43
      // 3f: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 4
      // 45: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 48: astore 5
      // 4a: aload 0
      // 4b: sipush 14015
      // 4e: ldc2_w 2728892002418738810
      // 51: lload 1
      // 52: lxor
      // 53: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: bipush 1
      // 5a: anewarray 15
      // 5d: dup
      // 5e: bipush 0
      // 5f: aload 5
      // 61: aastore
      // 62: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 65: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 68: bipush 0
      // 69: ireturn
      // 6a: aload 0
      // 6b: invokevirtual _r7.ibg ()V
      // 6e: aload 0
      // 6f: getstatic _r7$lw7.w4b L_r7$lw7;
      // 72: invokevirtual _r7.feh (L_r7$lw7;)V
      // 75: bipush 1
      // 76: ireturn
   }

   public void d9z() {
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
      // 05: invokevirtual _r7.tuw ()L_r7$lw7;
      // 08: getstatic _r7$lw7.hec L_r7$lw7;
      // 0b: iload 1
      // 0c: ifne 2c
      // 0f: if_acmpeq 61
      // 12: goto 19
      // 15: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: invokevirtual _r7.jsz ()Z
      // 1d: pop
      // 1e: aload 0
      // 1f: invokevirtual _r7.tuw ()L_r7$lw7;
      // 22: getstatic _r7$lw7.w4b L_r7$lw7;
      // 25: goto 2c
      // 28: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: iload 1
      // 2d: ifne 48
      // 30: if_acmpne 61
      // 33: goto 3a
      // 36: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 0
      // 3b: invokevirtual _r7.tuw ()L_r7$lw7;
      // 3e: getstatic _r7$lw7.hec L_r7$lw7;
      // 41: goto 48
      // 44: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: if_acmpeq 61
      // 4b: ldc2_w 200
      // 4e: invokestatic java/lang/Thread.sleep (J)V
      // 51: aload 0
      // 52: invokevirtual _r7.kqa ()V
      // 55: goto 3a
      // 58: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b: athrow
      // 5c: astore 2
      // 5d: iload 1
      // 5e: ifeq 3a
      // 61: return
   }

   public void kqa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 61791377921190
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 29
      // 11: getfield _r7.pq_ L_r7$lw7;
      // 14: getstatic _r7$lw7.hec L_r7$lw7;
      // 17: if_acmpeq 70
      // 1a: goto 21
      // 1d: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: goto 29
      // 25: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 2c: invokevirtual tv/twitch/chat/Chat.flushEvents ()Ltv/twitch/ErrorCode;
      // 2f: astore 4
      // 31: aload 4
      // 33: iload 3
      // 34: ifeq 4d
      // 37: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 3a: ifeq 70
      // 3d: goto 44
      // 40: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 4
      // 46: goto 4d
      // 49: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 50: astore 5
      // 52: aload 0
      // 53: sipush 10086
      // 56: ldc2_w 4853017533320989428
      // 59: lload 1
      // 5a: lxor
      // 5b: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: bipush 1
      // 62: anewarray 15
      // 65: dup
      // 66: bipush 0
      // 67: aload 5
      // 69: aastore
      // 6a: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 6d: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 70: return
   }

   public boolean uyk(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 7493174816614
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: iload 5
      // 10: ifeq 2a
      // 13: getfield _r7.pq_ L_r7$lw7;
      // 16: getstatic _r7$lw7.g2t L_r7$lw7;
      // 19: if_acmpeq 29
      // 1c: goto 23
      // 1f: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield _r7.zp8 Ljava/util/HashMap;
      // 2d: aload 1
      // 2e: iload 5
      // 30: ifeq 6e
      // 33: invokevirtual java/util/HashMap.containsKey (Ljava/lang/Object;)Z
      // 36: ifne 69
      // 39: goto 40
      // 3c: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: new java/lang/StringBuilder
      // 44: dup
      // 45: invokespecial java/lang/StringBuilder.<init> ()V
      // 48: sipush 8102
      // 4b: ldc2_w 4565346536208026102
      // 4e: lload 3
      // 4f: lxor
      // 50: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: nop
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59: aload 1
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 60: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 63: bipush 0
      // 64: ireturn
      // 65: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield _r7.zp8 Ljava/util/HashMap;
      // 6d: aload 1
      // 6e: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 71: checkcast _r7$pg7
      // 74: astore 6
      // 76: aload 6
      // 78: aload 2
      // 79: invokevirtual _r7$pg7.fxn (Ljava/lang/String;)Z
      // 7c: ireturn
   }

   public void feh(_r7$lw7 var1) {
      int var2 = OpaquePredicate.c();
      if (var1 != this.pq_) {
         this.pq_ = var1;

         try {
            _r7$ja4 var10000 = this.n0t;
            if (var2 == 0) {
               try {
                  if (var10000 == null) {
                     return;
                  }

                  var10000 = this.n0t;
               } catch (Exception var4) {
                  throw a(var4);
               }
            }

            var10000.yyl(var1);
         } catch (Exception var5) {
            this.djt(var5.toString());
         }
      }
   }

   public void _ct() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 104195960642427
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 29
      // 11: getfield _r7.azf L_r7$wl_;
      // 14: getstatic _r7$wl_.ora L_r7$wl_;
      // 17: if_acmpeq 89
      // 1a: goto 21
      // 1d: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: goto 29
      // 25: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: iload 3
      // 2a: ifne 42
      // 2d: getfield _r7.dvi Ltv/twitch/chat/ChatEmoticonData;
      // 30: ifnonnull 89
      // 33: goto 3a
      // 36: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 42
      // 3e: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 45: invokevirtual tv/twitch/chat/Chat.downloadEmoticonData ()Ltv/twitch/ErrorCode;
      // 48: astore 4
      // 4a: aload 4
      // 4c: iload 3
      // 4d: ifne 66
      // 50: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 53: ifeq 89
      // 56: goto 5d
      // 59: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: aload 4
      // 5f: goto 66
      // 62: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 69: astore 5
      // 6b: aload 0
      // 6c: sipush 2886
      // 6f: ldc2_w 8429121640376281356
      // 72: lload 1
      // 73: lxor
      // 74: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: nop
      // 7a: bipush 1
      // 7b: anewarray 15
      // 7e: dup
      // 7f: bipush 0
      // 80: aload 5
      // 82: aastore
      // 83: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 86: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 89: return
   }

   public void kng() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 7295132313528
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 31
      // 11: getfield _r7.dvi Ltv/twitch/chat/ChatEmoticonData;
      // 14: ifnonnull a7
      // 17: goto 1e
      // 1a: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: new tv/twitch/chat/ChatEmoticonData
      // 22: dup
      // 23: invokespecial tv/twitch/chat/ChatEmoticonData.<init> ()V
      // 26: putfield _r7.dvi Ltv/twitch/chat/ChatEmoticonData;
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 34: aload 0
      // 35: getfield _r7.dvi Ltv/twitch/chat/ChatEmoticonData;
      // 38: invokevirtual tv/twitch/chat/Chat.getEmoticonData (Ltv/twitch/chat/ChatEmoticonData;)Ltv/twitch/ErrorCode;
      // 3b: astore 4
      // 3d: aload 4
      // 3f: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 42: ifeq 79
      // 45: aload 0
      // 46: getfield _r7.n0t L_r7$ja4;
      // 49: iload 3
      // 4a: ifne 62
      // 4d: ifnull 67
      // 50: goto 57
      // 53: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: aload 0
      // 58: getfield _r7.n0t L_r7$ja4;
      // 5b: goto 62
      // 5e: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61: athrow
      // 62: invokeinterface _r7$ja4.zo_ ()V 1
      // 67: goto a7
      // 6a: astore 5
      // 6c: aload 0
      // 6d: aload 5
      // 6f: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 72: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 75: iload 3
      // 76: ifeq a7
      // 79: aload 0
      // 7a: new java/lang/StringBuilder
      // 7d: dup
      // 7e: invokespecial java/lang/StringBuilder.<init> ()V
      // 81: sipush 6073
      // 84: ldc2_w 1814654290098063667
      // 87: lload 1
      // 88: lxor
      // 89: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 92: aload 4
      // 94: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 9d: invokevirtual _r7.djt (Ljava/lang/String;)V
      // a0: goto a7
      // a3: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a6: athrow
      // a7: return
   }

   public void ibg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7.a J
      // 03: ldc2_w 82964257357822
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 26
      // 11: getfield _r7.dvi Ltv/twitch/chat/ChatEmoticonData;
      // 14: ifnull af
      // 17: goto 1e
      // 1a: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 29: invokevirtual tv/twitch/chat/Chat.clearEmoticonData ()Ltv/twitch/ErrorCode;
      // 2c: astore 4
      // 2e: iload 3
      // 2f: ifeq 4d
      // 32: aload 4
      // 34: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 37: ifeq 81
      // 3a: goto 41
      // 3d: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: aconst_null
      // 43: putfield _r7.dvi Ltv/twitch/chat/ChatEmoticonData;
      // 46: goto 4d
      // 49: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield _r7.n0t L_r7$ja4;
      // 51: iload 3
      // 52: ifeq 6a
      // 55: ifnull 6f
      // 58: goto 5f
      // 5b: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield _r7.n0t L_r7$ja4;
      // 63: goto 6a
      // 66: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69: athrow
      // 6a: invokeinterface _r7$ja4.xkh ()V 1
      // 6f: goto af
      // 72: astore 5
      // 74: aload 0
      // 75: aload 5
      // 77: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 7a: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 7d: iload 3
      // 7e: ifne af
      // 81: aload 0
      // 82: new java/lang/StringBuilder
      // 85: dup
      // 86: invokespecial java/lang/StringBuilder.<init> ()V
      // 89: sipush 25447
      // 8c: ldc2_w 2940875244399486378
      // 8f: lload 1
      // 90: lxor
      // 91: invokedynamic x (IJ)Ljava/lang/String; bsm=_r7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: nop
      // 97: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9a: aload 4
      // 9c: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 9f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a5: invokevirtual _r7.djt (Ljava/lang/String;)V
      // a8: goto af
      // ab: invokestatic _r7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: return
   }

   public void djt(String var1) {
      long var2 = a ^ 57066538759842L;
      d90.error(gwo.fd3, a<"x">(5247, 656303658198916074L ^ var2), new Object[]{var1});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1122244088455526165L, -146352126526911454L, MethodHandles.lookup().lookupClass()).a(129616215006460L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 123028614751088L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "\u0099\u009f\u001cê@ü\r[.9)×ág\u001a$Ø\u008e\u009dãjï·È\u0089\u008cOz5\u001d(½i\u0017h¸ù?oqkVº(ôÉuä0üÚ1+\u00039»ûo©C\n^ûï°\u0004\u0096¤l¢v*\u0099Iû>4\u0018,\u0093Þ\u007f3,ãRVVö\u0014\u009f\\µA\u0083ì\u0016(\u008b\u009eñm$\u0016âªÅ\u0001\u007f}4\u0090\u009b`ä\u0007IÇ\u0014rsÌ\tÎÖ\n&½\u008f3\u0092ê\u0005yá\u009b\u0088O(VõÌ*%ÿ}Ç¡»¨ÖJ:\u008e«Éu\u0005\n\u0093r\u001b\u001c[ò\n¾ª\u0093Ú¢\u008b\twÃX\u0095\u0007T@\u000f\u0006g?\u0092\u0092^ÍÁ³káh9$\u009aV e èí\u008d\fZ\u0092]P©!ê\u0082\u000e6ø¦H0ÃÜ1Ë\n½ü}}\u0007\\öB²\u001cà\u008c\u0081«ÈüC\u0091c®(P¤BÒÙ\u001b`\u008bÜÑ°j\u0000\u0012\u008d¹Tzí\u0019©\u001f Ô\u008cH\u008a¦¬!Çà¢\u000eðR8\u008d\u0080\nãA\u0004Ä-B¢\nxS0\u001cP\u0081b\u0096Ù\u0091øþï#\u0014\u008f((_\u0018!\u001d'\u0007Dø\u0004Iãµ \tÏ8¦\u007f\u009e\\j ÷6\u0087\u009ff²å\b$\u0014}\u009a\f,\u008aw\u0092ë3¾SäÖér\u0017µõj\r£ ØÊï±\u0097\u0011\u001e¨ÌY\u0091ÀCO\u001b\u009c\"K8Â'\u009f5Cý³=iÔ<Çs\u0012Ä#\u001fTÄR¤á\u001a\b¯é'8\u008e¼!<qXí{èÒû6a%\u0013\u0001 \u0005|·\u009c\u00972È\u008e\u009e\u0006£( :Û\u0092o¹\u001aLR#-Ü\u009e=(ÅëÄxÆ\u00925ÔÅü\u001dÃKã¤Ú\u0014{mP\u009a´ÜC9";
      int var8 = "\u0099\u009f\u001cê@ü\r[.9)×ág\u001a$Ø\u008e\u009dãjï·È\u0089\u008cOz5\u001d(½i\u0017h¸ù?oqkVº(ôÉuä0üÚ1+\u00039»ûo©C\n^ûï°\u0004\u0096¤l¢v*\u0099Iû>4\u0018,\u0093Þ\u007f3,ãRVVö\u0014\u009f\\µA\u0083ì\u0016(\u008b\u009eñm$\u0016âªÅ\u0001\u007f}4\u0090\u009b`ä\u0007IÇ\u0014rsÌ\tÎÖ\n&½\u008f3\u0092ê\u0005yá\u009b\u0088O(VõÌ*%ÿ}Ç¡»¨ÖJ:\u008e«Éu\u0005\n\u0093r\u001b\u001c[ò\n¾ª\u0093Ú¢\u008b\twÃX\u0095\u0007T@\u000f\u0006g?\u0092\u0092^ÍÁ³káh9$\u009aV e èí\u008d\fZ\u0092]P©!ê\u0082\u000e6ø¦H0ÃÜ1Ë\n½ü}}\u0007\\öB²\u001cà\u008c\u0081«ÈüC\u0091c®(P¤BÒÙ\u001b`\u008bÜÑ°j\u0000\u0012\u008d¹Tzí\u0019©\u001f Ô\u008cH\u008a¦¬!Çà¢\u000eðR8\u008d\u0080\nãA\u0004Ä-B¢\nxS0\u001cP\u0081b\u0096Ù\u0091øþï#\u0014\u008f((_\u0018!\u001d'\u0007Dø\u0004Iãµ \tÏ8¦\u007f\u009e\\j ÷6\u0087\u009ff²å\b$\u0014}\u009a\f,\u008aw\u0092ë3¾SäÖér\u0017µõj\r£ ØÊï±\u0097\u0011\u001e¨ÌY\u0091ÀCO\u001b\u009c\"K8Â'\u009f5Cý³=iÔ<Çs\u0012Ä#\u001fTÄR¤á\u001a\b¯é'8\u008e¼!<qXí{èÒû6a%\u0013\u0001 \u0005|·\u009c\u00972È\u008e\u009e\u0006£( :Û\u0092o¹\u001aLR#-Ü\u009e=(ÅëÄxÆ\u00925ÔÅü\u001dÃKã¤Ú\u0014{mP\u009a´ÜC9"
         .length();
      char var5 = '0';
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
                     c = new String[11];
                     d90 = LogManager.getLogger();
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

                  var6 = "¬Çm°8U{Ö-I'{»\u0004à%\u009b\u0083\u0010¤§\u0095öA6\u0003¬-P)k\u0098ØwÈ¦c\"t$@#\u0084{ÜP°[Ças\n·\u0087ÿ\u0094«áÃ\u009aÑ>'q«Ø\u0086x©¹\u001e\u0087zñ\u0002\u008dµà·]Úø3\u0003Ë\u00001Ee\u0093K\f$\u0094ÄNú¤EW\u0018\u00927?Ø";
                  var8 = "¬Çm°8U{Ö-I'{»\u0004à%\u009b\u0083\u0010¤§\u0095öA6\u0003¬-P)k\u0098ØwÈ¦c\"t$@#\u0084{ÜP°[Ças\n·\u0087ÿ\u0094«áÃ\u009aÑ>'q«Ø\u0086x©¹\u001e\u0087zñ\u0002\u008dµà·]Úø3\u0003Ë\u00001Ee\u0093K\f$\u0094ÄNú¤EW\u0018\u00927?Ø"
                     .length();
                  var5 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31579;
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
            throw new RuntimeException("_r7", var10);
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
         throw new RuntimeException("_r7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
