import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import tv.twitch.ErrorCode;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatChannelListener;

public class _r7$pg7 implements IChatChannelListener {
   public String gso;
   public boolean pvr;
   public _r7$rb4 afh;
   public List jbr;
   public LinkedList r04;
   public LinkedList epx;
   public ChatBadgeData s06;
   public final _r7 nvz;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public _r7$pg7(_r7 var1, String var2) {
      this.nvz = var1;
      this.gso = null;
      this.pvr = false;
      this.afh = _r7$rb4.e2e;
      this.jbr = Lists.newArrayList();
      this.r04 = new LinkedList();
      this.epx = new LinkedList();
      this.s06 = null;
      this.gso = var2;
   }

   public _r7$rb4 ymk() {
      return this.afh;
   }

   public boolean qd5(boolean var1) {
      long var2 = a ^ 9337074105718L;
      int var4 = OpaquePredicate.b();
      this.pvr = var1;
      ErrorCode var5 = ErrorCode.TTV_EC_SUCCESS;

      label42: {
         label41: {
            label40: {
               try {
                  if (var4 == 0) {
                     break label40;
                  }

                  if (!var1) {
                     break label41;
                  }
               } catch (oov var8) {
                  throw a(var8);
               }

               var5 = this.nvz.j35.connectAnonymous(this.gso, this);
            }

            if (var4 != 0) {
               break label42;
            }
         }

         var5 = this.nvz.j35.connect(this.gso, this.nvz.gjw, this.nvz.bzw.data, this);
      }

      label47: {
         try {
            boolean var10000 = ErrorCode.failed(var5);
            if (var4 == 0) {
               return var10000;
            }

            if (var10000) {
               break label47;
            }
         } catch (oov var7) {
            throw a(var7);
         }

         this.j15(_r7$rb4.vyb);
         this.d7o();
         return true;
      }

      String var6 = ErrorCode.getString(var5);
      this.nvz.djt(String.format(a<"l">(31950, 8731712877143701140L ^ var2), var6));
      this.rdf(this.gso);
      return false;
   }

   public boolean xdw() {
      long var1 = a ^ 37895936885072L;
      int var3 = OpaquePredicate.c();

      label53: {
         try {
            int var10000 = _r7$2.eq_[this.afh.ordinal()];
            if (var3 != 0) {
               return (boolean)var10000;
            }

            switch (var10000) {
               case 1:
               case 2:
                  break label53;
               case 3:
               case 4:
               case 5:
            }
         } catch (oov var7) {
            throw a(var7);
         }

         return (boolean)0;
      }

      ErrorCode var4 = this.nvz.j35.disconnect(this.gso);

      label54: {
         try {
            boolean var8 = ErrorCode.failed(var4);
            if (var3 != 0) {
               return var8;
            }

            if (var8) {
               break label54;
            }
         } catch (oov var6) {
            throw a(var6);
         }

         this.j15(_r7$rb4.ii5);
         return true;
      }

      String var5 = ErrorCode.getString(var4);
      this.nvz.djt(String.format(a<"l">(19902, 6000661430211279808L ^ var1), var5));
      return false;
   }

   public void j15(_r7$rb4 var1) {
      try {
         if (var1 != this.afh) {
            this.afh = var1;
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   public void law(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 03d
      // 009: getfield _r7$pg7.nvz L_r7;
      // 00c: getfield _r7.azf L_r7$wl_;
      // 00f: getstatic _r7$wl_.ora L_r7$wl_;
      // 012: if_acmpne 035
      // 015: goto 01c
      // 018: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01b: athrow
      // 01c: aload 0
      // 01d: getfield _r7$pg7.r04 Ljava/util/LinkedList;
      // 020: invokevirtual java/util/LinkedList.clear ()V
      // 023: aload 0
      // 024: getfield _r7$pg7.epx Ljava/util/LinkedList;
      // 027: invokevirtual java/util/LinkedList.clear ()V
      // 02a: iload 2
      // 02b: ifeq 0ee
      // 02e: goto 035
      // 031: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: aload 0
      // 036: goto 03d
      // 039: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: getfield _r7$pg7.r04 Ljava/util/LinkedList;
      // 040: invokevirtual java/util/LinkedList.size ()I
      // 043: iload 2
      // 044: ifne 0a7
      // 047: ifle 095
      // 04a: goto 051
      // 04d: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 0
      // 052: getfield _r7$pg7.r04 Ljava/util/LinkedList;
      // 055: invokevirtual java/util/LinkedList.listIterator ()Ljava/util/ListIterator;
      // 058: astore 3
      // 059: aload 3
      // 05a: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 05f: ifeq 095
      // 062: aload 3
      // 063: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 068: checkcast tv/twitch/chat/ChatRawMessage
      // 06b: astore 4
      // 06d: aload 4
      // 06f: getfield tv/twitch/chat/ChatRawMessage.userName Ljava/lang/String;
      // 072: aload 1
      // 073: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 076: iload 2
      // 077: ifne 0a7
      // 07a: ifeq 091
      // 07d: goto 084
      // 080: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: aload 3
      // 085: invokeinterface java/util/ListIterator.remove ()V 1
      // 08a: goto 091
      // 08d: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: iload 2
      // 092: ifeq 059
      // 095: aload 0
      // 096: iload 2
      // 097: ifne 0ef
      // 09a: getfield _r7$pg7.epx Ljava/util/LinkedList;
      // 09d: invokevirtual java/util/LinkedList.size ()I
      // 0a0: goto 0a7
      // 0a3: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: ifle 0ee
      // 0aa: aload 0
      // 0ab: getfield _r7$pg7.epx Ljava/util/LinkedList;
      // 0ae: invokevirtual java/util/LinkedList.listIterator ()Ljava/util/ListIterator;
      // 0b1: astore 3
      // 0b2: aload 3
      // 0b3: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 0b8: ifeq 0ee
      // 0bb: aload 3
      // 0bc: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 0c1: checkcast tv/twitch/chat/ChatTokenizedMessage
      // 0c4: astore 4
      // 0c6: iload 2
      // 0c7: ifne 11b
      // 0ca: aload 4
      // 0cc: getfield tv/twitch/chat/ChatTokenizedMessage.displayName Ljava/lang/String;
      // 0cf: aload 1
      // 0d0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d3: ifeq 0ea
      // 0d6: goto 0dd
      // 0d9: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 3
      // 0de: invokeinterface java/util/ListIterator.remove ()V 1
      // 0e3: goto 0ea
      // 0e6: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: iload 2
      // 0eb: ifeq 0b2
      // 0ee: aload 0
      // 0ef: getfield _r7$pg7.nvz L_r7;
      // 0f2: getfield _r7.n0t L_r7$ja4;
      // 0f5: iload 2
      // 0f6: ifne 111
      // 0f9: ifnull 11b
      // 0fc: goto 103
      // 0ff: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: aload 0
      // 104: getfield _r7$pg7.nvz L_r7;
      // 107: getfield _r7.n0t L_r7$ja4;
      // 10a: goto 111
      // 10d: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: aload 0
      // 112: getfield _r7$pg7.gso Ljava/lang/String;
      // 115: aload 1
      // 116: invokeinterface _r7$ja4.h4v (Ljava/lang/String;Ljava/lang/String;)V 3
      // 11b: goto 12a
      // 11e: astore 3
      // 11f: aload 0
      // 120: getfield _r7$pg7.nvz L_r7;
      // 123: aload 3
      // 124: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 127: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 12a: return
   }

   public boolean fxn(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7$pg7.a J
      // 03: ldc2_w 27450464264871
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 2a
      // 13: getfield _r7$pg7.afh L_r7$rb4;
      // 16: getstatic _r7$rb4.k3_ L_r7$rb4;
      // 19: if_acmpeq 29
      // 1c: goto 23
      // 1f: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield _r7$pg7.nvz L_r7;
      // 2d: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 30: aload 0
      // 31: getfield _r7$pg7.gso Ljava/lang/String;
      // 34: aload 1
      // 35: invokevirtual tv/twitch/chat/Chat.sendMessage (Ljava/lang/String;Ljava/lang/String;)Ltv/twitch/ErrorCode;
      // 38: astore 5
      // 3a: aload 5
      // 3c: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 3f: iload 4
      // 41: ifne 79
      // 44: ifeq 78
      // 47: goto 4e
      // 4a: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 5
      // 50: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 53: astore 6
      // 55: aload 0
      // 56: getfield _r7$pg7.nvz L_r7;
      // 59: sipush 15129
      // 5c: ldc2_w 8176896612990758545
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic l (IJ)Ljava/lang/String; bsm=_r7$pg7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: bipush 1
      // 68: anewarray 14
      // 6b: dup
      // 6c: bipush 0
      // 6d: aload 6
      // 6f: aastore
      // 70: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 73: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 76: bipush 0
      // 77: ireturn
      // 78: bipush 1
      // 79: ireturn
   }

   public void d7o() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7$pg7.a J
      // 03: ldc2_w 79638990330992
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 2c
      // 11: getfield _r7$pg7.nvz L_r7;
      // 14: getfield _r7.azf L_r7$wl_;
      // 17: getstatic _r7$wl_.ora L_r7$wl_;
      // 1a: if_acmpeq 96
      // 1d: goto 24
      // 20: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: goto 2c
      // 28: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: iload 3
      // 2d: ifeq 45
      // 30: getfield _r7$pg7.s06 Ltv/twitch/chat/ChatBadgeData;
      // 33: ifnonnull 96
      // 36: goto 3d
      // 39: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c: athrow
      // 3d: aload 0
      // 3e: goto 45
      // 41: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 44: athrow
      // 45: getfield _r7$pg7.nvz L_r7;
      // 48: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 4b: aload 0
      // 4c: getfield _r7$pg7.gso Ljava/lang/String;
      // 4f: invokevirtual tv/twitch/chat/Chat.downloadBadgeData (Ljava/lang/String;)Ltv/twitch/ErrorCode;
      // 52: astore 4
      // 54: aload 4
      // 56: iload 3
      // 57: ifeq 70
      // 5a: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 5d: ifeq 96
      // 60: goto 67
      // 63: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 66: athrow
      // 67: aload 4
      // 69: goto 70
      // 6c: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 73: astore 5
      // 75: aload 0
      // 76: getfield _r7$pg7.nvz L_r7;
      // 79: sipush 21872
      // 7c: ldc2_w 1575486903896522280
      // 7f: lload 1
      // 80: lxor
      // 81: invokedynamic l (IJ)Ljava/lang/String; bsm=_r7$pg7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: nop
      // 87: bipush 1
      // 88: anewarray 14
      // 8b: dup
      // 8c: bipush 0
      // 8d: aload 5
      // 8f: aastore
      // 90: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 93: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 96: return
   }

   public void jsi() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7$pg7.a J
      // 03: ldc2_w 42397074920083
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 31
      // 11: getfield _r7$pg7.s06 Ltv/twitch/chat/ChatBadgeData;
      // 14: ifnonnull be
      // 17: goto 1e
      // 1a: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: new tv/twitch/chat/ChatBadgeData
      // 22: dup
      // 23: invokespecial tv/twitch/chat/ChatBadgeData.<init> ()V
      // 26: putfield _r7$pg7.s06 Ltv/twitch/chat/ChatBadgeData;
      // 29: aload 0
      // 2a: goto 31
      // 2d: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: getfield _r7$pg7.nvz L_r7;
      // 34: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 37: aload 0
      // 38: getfield _r7$pg7.gso Ljava/lang/String;
      // 3b: aload 0
      // 3c: getfield _r7$pg7.s06 Ltv/twitch/chat/ChatBadgeData;
      // 3f: invokevirtual tv/twitch/chat/Chat.getBadgeData (Ljava/lang/String;Ltv/twitch/chat/ChatBadgeData;)Ltv/twitch/ErrorCode;
      // 42: astore 4
      // 44: aload 4
      // 46: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 49: ifeq 8d
      // 4c: aload 0
      // 4d: getfield _r7$pg7.nvz L_r7;
      // 50: getfield _r7.n0t L_r7$ja4;
      // 53: iload 3
      // 54: ifne 6f
      // 57: ifnull 78
      // 5a: goto 61
      // 5d: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 0
      // 62: getfield _r7$pg7.nvz L_r7;
      // 65: getfield _r7.n0t L_r7$ja4;
      // 68: goto 6f
      // 6b: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: aload 0
      // 70: getfield _r7$pg7.gso Ljava/lang/String;
      // 73: invokeinterface _r7$ja4.qyx (Ljava/lang/String;)V 2
      // 78: goto be
      // 7b: astore 5
      // 7d: aload 0
      // 7e: getfield _r7$pg7.nvz L_r7;
      // 81: aload 5
      // 83: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 86: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 89: iload 3
      // 8a: ifeq be
      // 8d: aload 0
      // 8e: getfield _r7$pg7.nvz L_r7;
      // 91: new java/lang/StringBuilder
      // 94: dup
      // 95: invokespecial java/lang/StringBuilder.<init> ()V
      // 98: sipush 18014
      // 9b: ldc2_w 4549647657223332836
      // 9e: lload 1
      // 9f: lxor
      // a0: invokedynamic l (IJ)Ljava/lang/String; bsm=_r7$pg7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: nop
      // a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a9: aload 4
      // ab: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b4: invokevirtual _r7.djt (Ljava/lang/String;)V
      // b7: goto be
      // ba: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bd: athrow
      // be: return
   }

   public void rsp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _r7$pg7.a J
      // 03: ldc2_w 26849670035323
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 26
      // 11: getfield _r7$pg7.s06 Ltv/twitch/chat/ChatBadgeData;
      // 14: ifnull c6
      // 17: goto 1e
      // 1a: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: getfield _r7$pg7.nvz L_r7;
      // 29: getfield _r7.j35 Ltv/twitch/chat/Chat;
      // 2c: aload 0
      // 2d: getfield _r7$pg7.gso Ljava/lang/String;
      // 30: invokevirtual tv/twitch/chat/Chat.clearBadgeData (Ljava/lang/String;)Ltv/twitch/ErrorCode;
      // 33: astore 4
      // 35: iload 3
      // 36: ifne 54
      // 39: aload 4
      // 3b: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 3e: ifeq 95
      // 41: goto 48
      // 44: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 0
      // 49: aconst_null
      // 4a: putfield _r7$pg7.s06 Ltv/twitch/chat/ChatBadgeData;
      // 4d: goto 54
      // 50: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: aload 0
      // 55: getfield _r7$pg7.nvz L_r7;
      // 58: getfield _r7.n0t L_r7$ja4;
      // 5b: iload 3
      // 5c: ifne 77
      // 5f: ifnull 80
      // 62: goto 69
      // 65: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 0
      // 6a: getfield _r7$pg7.nvz L_r7;
      // 6d: getfield _r7.n0t L_r7$ja4;
      // 70: goto 77
      // 73: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: aload 0
      // 78: getfield _r7$pg7.gso Ljava/lang/String;
      // 7b: invokeinterface _r7$ja4.vd8 (Ljava/lang/String;)V 2
      // 80: goto c6
      // 83: astore 5
      // 85: aload 0
      // 86: getfield _r7$pg7.nvz L_r7;
      // 89: aload 5
      // 8b: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 8e: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 91: iload 3
      // 92: ifeq c6
      // 95: aload 0
      // 96: getfield _r7$pg7.nvz L_r7;
      // 99: new java/lang/StringBuilder
      // 9c: dup
      // 9d: invokespecial java/lang/StringBuilder.<init> ()V
      // a0: sipush 860
      // a3: ldc2_w 7126094311857816330
      // a6: lload 1
      // a7: lxor
      // a8: invokedynamic l (IJ)Ljava/lang/String; bsm=_r7$pg7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: nop
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: aload 4
      // b3: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // bc: invokevirtual _r7.djt (Ljava/lang/String;)V
      // bf: goto c6
      // c2: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c5: athrow
      // c6: return
   }

   public void lo7(String param1) {
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
      // 05: getfield _r7$pg7.nvz L_r7;
      // 08: getfield _r7.n0t L_r7$ja4;
      // 0b: iload 2
      // 0c: ifeq 27
      // 0f: ifnull 2d
      // 12: goto 19
      // 15: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield _r7$pg7.nvz L_r7;
      // 1d: getfield _r7.n0t L_r7$ja4;
      // 20: goto 27
      // 23: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 1
      // 28: invokeinterface _r7$ja4.u8d (Ljava/lang/String;)V 2
      // 2d: goto 3c
      // 30: astore 3
      // 31: aload 0
      // 32: getfield _r7$pg7.nvz L_r7;
      // 35: aload 3
      // 36: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 39: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 3c: return
   }

   public void rdf(String param1) {
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
      // 05: getfield _r7$pg7.nvz L_r7;
      // 08: getfield _r7.n0t L_r7$ja4;
      // 0b: iload 2
      // 0c: ifne 27
      // 0f: ifnull 2d
      // 12: goto 19
      // 15: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield _r7$pg7.nvz L_r7;
      // 1d: getfield _r7.n0t L_r7$ja4;
      // 20: goto 27
      // 23: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: aload 1
      // 28: invokeinterface _r7$ja4.pvc (Ljava/lang/String;)V 2
      // 2d: goto 3c
      // 30: astore 3
      // 31: aload 0
      // 32: getfield _r7$pg7.nvz L_r7;
      // 35: aload 3
      // 36: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 39: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 3c: return
   }

   private void o63() {
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
      // 06: ifeq 30
      // 09: getfield _r7$pg7.afh L_r7$rb4;
      // 0c: getstatic _r7$rb4.p3k L_r7$rb4;
      // 0f: if_acmpeq 33
      // 12: goto 19
      // 15: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: getstatic _r7$rb4.p3k L_r7$rb4;
      // 1d: invokevirtual _r7$pg7.j15 (L_r7$rb4;)V
      // 20: aload 0
      // 21: aload 0
      // 22: getfield _r7$pg7.gso Ljava/lang/String;
      // 25: invokevirtual _r7$pg7.rdf (Ljava/lang/String;)V
      // 28: aload 0
      // 29: goto 30
      // 2c: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: invokevirtual _r7$pg7.rsp ()V
      // 33: return
   }

   public void chatStatusCallback(String param1, ErrorCode param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 28
      // 09: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 0c: ifne 2d
      // 0f: goto 16
      // 12: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield _r7$pg7.nvz L_r7;
      // 1a: getfield _r7.zp8 Ljava/util/HashMap;
      // 1d: aload 1
      // 1e: invokevirtual java/util/HashMap.remove (Ljava/lang/Object;)Ljava/lang/Object;
      // 21: goto 28
      // 24: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: pop
      // 29: aload 0
      // 2a: invokespecial _r7$pg7.o63 ()V
      // 2d: return
   }

   public void chatChannelMembershipCallback(String param1, ChatEvent param2, ChatChannelInfo param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: getstatic _r7$2.vi4 [I
      // 08: aload 2
      // 09: invokevirtual tv/twitch/chat/ChatEvent.ordinal ()I
      // 0c: iaload
      // 0d: lookupswitch 62 2 1 27 2 51
      // 28: aload 0
      // 29: getstatic _r7$rb4.k3_ L_r7$rb4;
      // 2c: invokevirtual _r7$pg7.j15 (L_r7$rb4;)V
      // 2f: aload 0
      // 30: aload 1
      // 31: invokevirtual _r7$pg7.lo7 (Ljava/lang/String;)V
      // 34: iload 4
      // 36: ifne 4b
      // 39: goto 40
      // 3c: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: invokespecial _r7$pg7.o63 ()V
      // 44: goto 4b
      // 47: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: return
   }

   public void chatChannelUserChangeCallback(String param1, ChatUserInfo[] param2, ChatUserInfo[] param3, ChatUserInfo[] param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 5
      // 005: bipush 0
      // 006: istore 6
      // 008: iload 6
      // 00a: aload 3
      // 00b: arraylength
      // 00c: if_icmpge 056
      // 00f: aload 0
      // 010: getfield _r7$pg7.jbr Ljava/util/List;
      // 013: aload 3
      // 014: iload 6
      // 016: aaload
      // 017: invokeinterface java/util/List.indexOf (Ljava/lang/Object;)I 2
      // 01c: istore 7
      // 01e: iload 5
      // 020: ifeq 051
      // 023: iload 7
      // 025: iload 5
      // 027: ifeq 057
      // 02a: goto 031
      // 02d: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: iflt 04e
      // 034: goto 03b
      // 037: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield _r7$pg7.jbr Ljava/util/List;
      // 03f: iload 7
      // 041: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 046: pop
      // 047: goto 04e
      // 04a: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: iinc 6 1
      // 051: iload 5
      // 053: ifne 008
      // 056: bipush 0
      // 057: istore 6
      // 059: iload 6
      // 05b: aload 4
      // 05d: arraylength
      // 05e: if_icmpge 0b8
      // 061: aload 0
      // 062: getfield _r7$pg7.jbr Ljava/util/List;
      // 065: aload 4
      // 067: iload 6
      // 069: aaload
      // 06a: invokeinterface java/util/List.indexOf (Ljava/lang/Object;)I 2
      // 06f: istore 7
      // 071: iload 7
      // 073: iload 5
      // 075: ifeq 0b9
      // 078: iload 5
      // 07a: ifeq 0af
      // 07d: goto 084
      // 080: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: iflt 0a1
      // 087: goto 08e
      // 08a: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield _r7$pg7.jbr Ljava/util/List;
      // 092: iload 7
      // 094: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 099: pop
      // 09a: goto 0a1
      // 09d: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield _r7$pg7.jbr Ljava/util/List;
      // 0a5: aload 4
      // 0a7: iload 6
      // 0a9: aaload
      // 0aa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0af: pop
      // 0b0: iinc 6 1
      // 0b3: iload 5
      // 0b5: ifne 059
      // 0b8: bipush 0
      // 0b9: istore 6
      // 0bb: iload 6
      // 0bd: aload 2
      // 0be: arraylength
      // 0bf: if_icmpge 0e4
      // 0c2: aload 0
      // 0c3: getfield _r7$pg7.jbr Ljava/util/List;
      // 0c6: aload 2
      // 0c7: iload 6
      // 0c9: aaload
      // 0ca: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cf: pop
      // 0d0: iinc 6 1
      // 0d3: iload 5
      // 0d5: ifeq 115
      // 0d8: iload 5
      // 0da: ifne 0bb
      // 0dd: goto 0e4
      // 0e0: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield _r7$pg7.nvz L_r7;
      // 0e8: getfield _r7.n0t L_r7$ja4;
      // 0eb: iload 5
      // 0ed: ifeq 108
      // 0f0: ifnull 115
      // 0f3: goto 0fa
      // 0f6: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: getfield _r7$pg7.nvz L_r7;
      // 0fe: getfield _r7.n0t L_r7$ja4;
      // 101: goto 108
      // 104: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 0
      // 109: getfield _r7$pg7.gso Ljava/lang/String;
      // 10c: aload 2
      // 10d: aload 3
      // 10e: aload 4
      // 110: invokeinterface _r7$ja4.hv_ (Ljava/lang/String;[Ltv/twitch/chat/ChatUserInfo;[Ltv/twitch/chat/ChatUserInfo;[Ltv/twitch/chat/ChatUserInfo;)V 5
      // 115: goto 126
      // 118: astore 6
      // 11a: aload 0
      // 11b: getfield _r7$pg7.nvz L_r7;
      // 11e: aload 6
      // 120: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 123: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 126: return
   }

   public void chatChannelRawMessageCallback(String param1, ChatRawMessage[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: aload 2
      // 0a: arraylength
      // 0b: if_icmpge 2b
      // 0e: aload 0
      // 0f: getfield _r7$pg7.r04 Ljava/util/LinkedList;
      // 12: aload 2
      // 13: iload 4
      // 15: aaload
      // 16: invokevirtual java/util/LinkedList.addLast (Ljava/lang/Object;)V
      // 19: iinc 4 1
      // 1c: iload 3
      // 1d: ifne 58
      // 20: iload 3
      // 21: ifeq 07
      // 24: goto 2b
      // 27: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield _r7$pg7.nvz L_r7;
      // 2f: getfield _r7.n0t L_r7$ja4;
      // 32: iload 3
      // 33: ifne 4e
      // 36: ifnull 58
      // 39: goto 40
      // 3c: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield _r7$pg7.nvz L_r7;
      // 44: getfield _r7.n0t L_r7$ja4;
      // 47: goto 4e
      // 4a: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield _r7$pg7.gso Ljava/lang/String;
      // 52: aload 2
      // 53: invokeinterface _r7$ja4.v_8 (Ljava/lang/String;[Ltv/twitch/chat/ChatRawMessage;)V 3
      // 58: goto 69
      // 5b: astore 4
      // 5d: aload 0
      // 5e: getfield _r7$pg7.nvz L_r7;
      // 61: aload 4
      // 63: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 66: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 69: aload 0
      // 6a: getfield _r7$pg7.r04 Ljava/util/LinkedList;
      // 6d: invokevirtual java/util/LinkedList.size ()I
      // 70: aload 0
      // 71: getfield _r7$pg7.nvz L_r7;
      // 74: getfield _r7.j97 I
      // 77: if_icmple 86
      // 7a: aload 0
      // 7b: getfield _r7$pg7.r04 Ljava/util/LinkedList;
      // 7e: invokevirtual java/util/LinkedList.removeFirst ()Ljava/lang/Object;
      // 81: pop
      // 82: iload 3
      // 83: ifeq 69
      // 86: return
   }

   public void chatChannelTokenizedMessageCallback(String param1, ChatTokenizedMessage[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: aload 2
      // 0a: arraylength
      // 0b: if_icmpge 2b
      // 0e: aload 0
      // 0f: getfield _r7$pg7.epx Ljava/util/LinkedList;
      // 12: aload 2
      // 13: iload 4
      // 15: aaload
      // 16: invokevirtual java/util/LinkedList.addLast (Ljava/lang/Object;)V
      // 19: iinc 4 1
      // 1c: iload 3
      // 1d: ifeq 58
      // 20: iload 3
      // 21: ifne 07
      // 24: goto 2b
      // 27: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield _r7$pg7.nvz L_r7;
      // 2f: getfield _r7.n0t L_r7$ja4;
      // 32: iload 3
      // 33: ifeq 4e
      // 36: ifnull 58
      // 39: goto 40
      // 3c: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield _r7$pg7.nvz L_r7;
      // 44: getfield _r7.n0t L_r7$ja4;
      // 47: goto 4e
      // 4a: invokestatic _r7$pg7.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d: athrow
      // 4e: aload 0
      // 4f: getfield _r7$pg7.gso Ljava/lang/String;
      // 52: aload 2
      // 53: invokeinterface _r7$ja4.e5d (Ljava/lang/String;[Ltv/twitch/chat/ChatTokenizedMessage;)V 3
      // 58: goto 69
      // 5b: astore 4
      // 5d: aload 0
      // 5e: getfield _r7$pg7.nvz L_r7;
      // 61: aload 4
      // 63: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 66: invokevirtual _r7.djt (Ljava/lang/String;)V
      // 69: aload 0
      // 6a: getfield _r7$pg7.epx Ljava/util/LinkedList;
      // 6d: invokevirtual java/util/LinkedList.size ()I
      // 70: aload 0
      // 71: getfield _r7$pg7.nvz L_r7;
      // 74: getfield _r7.j97 I
      // 77: if_icmple 86
      // 7a: aload 0
      // 7b: getfield _r7$pg7.epx Ljava/util/LinkedList;
      // 7e: invokevirtual java/util/LinkedList.removeFirst ()Ljava/lang/Object;
      // 81: pop
      // 82: iload 3
      // 83: ifne 69
      // 86: return
   }

   public void chatClearCallback(String var1, String var2) {
      this.law(var2);
   }

   public void chatBadgeDataDownloadCallback(String var1, ErrorCode var2) {
      try {
         if (ErrorCode.succeeded(var2)) {
            this.jsi();
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7625580580616518718L, -5695414132264609520L, MethodHandles.lookup().lookupClass()).a(222111141517405L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 80769974103517L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "YGÿÛSXÀ\u001d 4Æo\u0085\n§\u0017\\IÑZ\u0086\u007fUþ¾1ú'Ô\u0089U{Ë{\u00ad\u008d\bW\u000e[0\u0086±\r\baû5q?\u001eÒó¹¥AæXý¤çC!êaóóïöéb3Î\u001dðè\u0015a\u0086\u000fRÌ!\u0091#\u009eX¹?(ezÇ9yþw\u0081ÙÂø§PÞÓ\u0099ìÃ\u008eùÝæb\u0004ÕPÚ3]\u000bÓ\u00ad8\u008bOÖ3u\u0092Û8\u0012¿Vçú\u0093A\u0082\u0000;ñ=¯\u0005\u0010±²ñ0\u008dô*J\u0001ÐL#Z÷Ó¦]SIîÃÆ\u0003ZlS\\Ç\u000e\u0099\u001f©çíè\u0090l¹UÍè";
      int var8 = "YGÿÛSXÀ\u001d 4Æo\u0085\n§\u0017\\IÑZ\u0086\u007fUþ¾1ú'Ô\u0089U{Ë{\u00ad\u008d\bW\u000e[0\u0086±\r\baû5q?\u001eÒó¹¥AæXý¤çC!êaóóïöéb3Î\u001dðè\u0015a\u0086\u000fRÌ!\u0091#\u009eX¹?(ezÇ9yþw\u0081ÙÂø§PÞÓ\u0099ìÃ\u008eùÝæb\u0004ÕPÚ3]\u000bÓ\u00ad8\u008bOÖ3u\u0092Û8\u0012¿Vçú\u0093A\u0082\u0000;ñ=¯\u0005\u0010±²ñ0\u008dô*J\u0001ÐL#Z÷Ó¦]SIîÃÆ\u0003ZlS\\Ç\u000e\u0099\u001f©çíè\u0090l¹UÍè"
         .length();
      char var5 = '(';
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
                     c = new String[6];
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

                  var6 = "c\u0012`\u0015Ë£¤fw\u0080\u0017É©ÅÒ|nôø\u0012(\u0012\u008b\u0093\u0003À\njK^8D¸\u0000¼AÖ!ZÎÕ\u0006:öB\u0087è·\u000b{\u008fñ¢~r¨¢ÏØ¹bIÖ`8\bZEX v\u008b7'Õ\u0018HÍ\u0095\u0005 \u0087\u001e^Ä.\u0000giV\u0086«×\u0091ê \u009cÂ¨ªÓ+\u008bÓ!¯\u001eô\u0086×\u009c\u0002\u0006WÂ3Z²Kwm";
                  var8 = "c\u0012`\u0015Ë£¤fw\u0080\u0017É©ÅÒ|nôø\u0012(\u0012\u008b\u0093\u0003À\njK^8D¸\u0000¼AÖ!ZÎÕ\u0006:öB\u0087è·\u000b{\u008fñ¢~r¨¢ÏØ¹bIÖ`8\bZEX v\u008b7'Õ\u0018HÍ\u0095\u0005 \u0087\u001e^Ä.\u0000giV\u0086«×\u0091ê \u009cÂ¨ªÓ+\u008bÓ!¯\u001eô\u0086×\u009c\u0002\u0006WÂ3Z²Kwm"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20816;
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
            throw new RuntimeException("_r7$pg7", var10);
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
         throw new RuntimeException("_r7$pg7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
