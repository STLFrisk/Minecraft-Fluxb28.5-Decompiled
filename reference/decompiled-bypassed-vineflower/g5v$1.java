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
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

public class g5v$1 implements IStreamCallbacks {
   public final g5v lih;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public g5v$1(g5v var1) {
      this.lih = var1;
   }

   public void requestAuthTokenCallback(ErrorCode param1, AuthToken param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 74934147807847
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: iload 5
      // 10: ifne 5d
      // 13: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 3e
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield g5v$1.lih Lg5v;
      // 24: aload 2
      // 25: putfield g5v.vom Ltv/twitch/AuthToken;
      // 28: aload 0
      // 29: getfield g5v$1.lih Lg5v;
      // 2c: getstatic g5v$nin.ns_ Lg5v$nin;
      // 2f: invokevirtual g5v.koi (Lg5v$nin;)V
      // 32: iload 5
      // 34: ifeq 83
      // 37: goto 3e
      // 3a: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield g5v$1.lih Lg5v;
      // 42: getfield g5v.vom Ltv/twitch/AuthToken;
      // 45: ldc ""
      // 47: nop
      // 48: putfield tv/twitch/AuthToken.data Ljava/lang/String;
      // 4b: aload 0
      // 4c: getfield g5v$1.lih Lg5v;
      // 4f: getstatic g5v$nin.tc_ Lg5v$nin;
      // 52: invokevirtual g5v.koi (Lg5v$nin;)V
      // 55: aload 1
      // 56: goto 5d
      // 59: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 60: astore 6
      // 62: aload 0
      // 63: getfield g5v$1.lih Lg5v;
      // 66: sipush 29349
      // 69: ldc2_w 6857691642824804963
      // 6c: lload 3
      // 6d: lxor
      // 6e: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: nop
      // 74: bipush 1
      // 75: anewarray 15
      // 78: dup
      // 79: bipush 0
      // 7a: aload 6
      // 7c: aastore
      // 7d: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 80: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 83: aload 0
      // 84: getfield g5v$1.lih Lg5v;
      // 87: getfield g5v.hpt Lg5v$kot;
      // 8a: iload 5
      // 8c: ifne a7
      // 8f: ifnull ae
      // 92: goto 99
      // 95: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: aload 0
      // 9a: getfield g5v$1.lih Lg5v;
      // 9d: getfield g5v.hpt Lg5v$kot;
      // a0: goto a7
      // a3: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a6: athrow
      // a7: aload 1
      // a8: aload 2
      // a9: invokeinterface g5v$kot.gzd (Ltv/twitch/ErrorCode;Ltv/twitch/AuthToken;)V 3
      // ae: goto bf
      // b1: astore 6
      // b3: aload 0
      // b4: getfield g5v$1.lih Lg5v;
      // b7: aload 6
      // b9: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // bc: invokevirtual g5v.psg (Ljava/lang/String;)V
      // bf: return
   }

   public void loginCallback(ErrorCode param1, ChannelInfo param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 90686151281863
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: iload 5
      // 10: ifeq 60
      // 13: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 46
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield g5v$1.lih Lg5v;
      // 24: aload 2
      // 25: putfield g5v.cf6 Ltv/twitch/broadcast/ChannelInfo;
      // 28: aload 0
      // 29: getfield g5v$1.lih Lg5v;
      // 2c: getstatic g5v$nin.dgt Lg5v$nin;
      // 2f: invokevirtual g5v.koi (Lg5v$nin;)V
      // 32: aload 0
      // 33: getfield g5v$1.lih Lg5v;
      // 36: bipush 1
      // 37: putfield g5v.vwt Z
      // 3a: iload 5
      // 3c: ifne 86
      // 3f: goto 46
      // 42: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 0
      // 47: getfield g5v$1.lih Lg5v;
      // 4a: getstatic g5v$nin.tc_ Lg5v$nin;
      // 4d: invokevirtual g5v.koi (Lg5v$nin;)V
      // 50: aload 0
      // 51: getfield g5v$1.lih Lg5v;
      // 54: bipush 0
      // 55: putfield g5v.vwt Z
      // 58: aload 1
      // 59: goto 60
      // 5c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 63: astore 6
      // 65: aload 0
      // 66: getfield g5v$1.lih Lg5v;
      // 69: sipush 14621
      // 6c: ldc2_w 8367701652580120437
      // 6f: lload 3
      // 70: lxor
      // 71: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: nop
      // 77: bipush 1
      // 78: anewarray 15
      // 7b: dup
      // 7c: bipush 0
      // 7d: aload 6
      // 7f: aastore
      // 80: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 83: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 86: aload 0
      // 87: getfield g5v$1.lih Lg5v;
      // 8a: getfield g5v.hpt Lg5v$kot;
      // 8d: iload 5
      // 8f: ifeq aa
      // 92: ifnull b0
      // 95: goto 9c
      // 98: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9b: athrow
      // 9c: aload 0
      // 9d: getfield g5v$1.lih Lg5v;
      // a0: getfield g5v.hpt Lg5v$kot;
      // a3: goto aa
      // a6: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: aload 1
      // ab: invokeinterface g5v$kot.nyt (Ltv/twitch/ErrorCode;)V 2
      // b0: goto c1
      // b3: astore 6
      // b5: aload 0
      // b6: getfield g5v$1.lih Lg5v;
      // b9: aload 6
      // bb: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // be: invokevirtual g5v.psg (Ljava/lang/String;)V
      // c1: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void getIngestServersCallback(ErrorCode var1, IngestList var2) {
      long var3 = a ^ 29640852335205L;
      int var5 = t9d.b();

      ErrorCode var10000;
      label67: {
         label59: {
            try {
               var10000 = var1;
               if (var5 == 0) {
                  break label67;
               }

               if (!ErrorCode.succeeded(var1)) {
                  break label59;
               }
            } catch (Exception var11) {
               throw a(var11);
            }

            this.lih.j3g = var2;
            this.lih.u5w = this.lih.j3g.getDefaultServer();
            this.lih.koi(g5v$nin.s0o);

            Exception var6;
            try {
               g5v$kot var14 = this.lih.hpt;
               if (var5 != 0) {
                  try {
                     if (var14 == null) {
                        return;
                     }

                     var14 = this.lih.hpt;
                  } catch (Exception var7) {
                     throw a(var7);
                  }
               }

               var14.y8h(var2);
               return;
            } catch (Exception var8) {
               var6 = var8;
            }

            try {
               this.lih.psg(var6.toString());
               if (var5 != 0) {
                  return;
               }
            } catch (Exception var10) {
               boolean var10001 = false;
               throw a(var10);
            }
         }

         try {
            var10000 = var1;
         } catch (Exception var9) {
            boolean var15 = false;
            throw a(var9);
         }
      }

      String var12 = ErrorCode.getString(var10000);
      this.lih.psg(String.format(a<"y">(3685, 7499555996119967402L ^ var3), var12));
      this.lih.koi(g5v$nin.zw2);
   }

   public void getUserInfoCallback(ErrorCode param1, UserInfo param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 100654852934463
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: getfield g5v$1.lih Lg5v;
      // 11: aload 2
      // 12: putfield g5v.rke Ltv/twitch/broadcast/UserInfo;
      // 15: aload 1
      // 16: iload 5
      // 18: ifne 30
      // 1b: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 1e: ifeq 56
      // 21: goto 28
      // 24: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: aload 1
      // 29: goto 30
      // 2c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 33: astore 6
      // 35: aload 0
      // 36: getfield g5v$1.lih Lg5v;
      // 39: sipush 13147
      // 3c: ldc2_w 3060237608368405190
      // 3f: lload 3
      // 40: lxor
      // 41: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: bipush 1
      // 48: anewarray 15
      // 4b: dup
      // 4c: bipush 0
      // 4d: aload 6
      // 4f: aastore
      // 50: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 53: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 56: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void getStreamInfoCallback(ErrorCode var1, StreamInfo var2) {
      long var3 = a ^ 140214236032872L;
      int var5 = t9d.c();

      ErrorCode var10000;
      label67: {
         label59: {
            try {
               var10000 = var1;
               if (var5 != 0) {
                  break label67;
               }

               if (!ErrorCode.succeeded(var1)) {
                  break label59;
               }
            } catch (Exception var11) {
               throw a(var11);
            }

            this.lih.bh1 = var2;

            Exception var6;
            try {
               g5v$kot var14 = this.lih.hpt;
               if (var5 == 0) {
                  try {
                     if (var14 == null) {
                        return;
                     }

                     var14 = this.lih.hpt;
                  } catch (Exception var7) {
                     throw a(var7);
                  }
               }

               var14.yf4(var2);
               return;
            } catch (Exception var8) {
               var6 = var8;
            }

            try {
               this.lih.psg(var6.toString());
               if (var5 == 0) {
                  return;
               }
            } catch (Exception var10) {
               boolean var10001 = false;
               throw a(var10);
            }
         }

         try {
            var10000 = var1;
         } catch (Exception var9) {
            boolean var15 = false;
            throw a(var9);
         }
      }

      String var12 = ErrorCode.getString(var10000);
      this.lih.yli(String.format(a<"y">(28797, 8057651523829276086L ^ var3), var12));
   }

   public void getArchivingStateCallback(ErrorCode var1, ArchivingState var2) {
      this.lih.z5y = var2;
      if (ErrorCode.failed(var1)) {
      }
   }

   public void runCommercialCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 128887069950127
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifne 28
      // 13: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 4e
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 2b: astore 5
      // 2d: aload 0
      // 2e: getfield g5v$1.lih Lg5v;
      // 31: sipush 702
      // 34: ldc2_w 4021837283887415487
      // 37: lload 2
      // 38: lxor
      // 39: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: bipush 1
      // 40: anewarray 15
      // 43: dup
      // 44: bipush 0
      // 45: aload 5
      // 47: aastore
      // 48: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4b: invokevirtual g5v.yli (Ljava/lang/String;)V
      // 4e: return
   }

   public void setStreamInfoCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 95607133565350
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifne 28
      // 13: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 4e
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 2b: astore 5
      // 2d: aload 0
      // 2e: getfield g5v$1.lih Lg5v;
      // 31: sipush 22942
      // 34: ldc2_w 4209204575936899731
      // 37: lload 2
      // 38: lxor
      // 39: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: bipush 1
      // 40: anewarray 15
      // 43: dup
      // 44: bipush 0
      // 45: aload 5
      // 47: aastore
      // 48: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4b: invokevirtual g5v.yli (Ljava/lang/String;)V
      // 4e: return
   }

   public void getGameNameListCallback(ErrorCode param1, GameInfoList param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 137725426662668
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: iload 5
      // 10: ifne 28
      // 13: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 4e
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 2b: astore 6
      // 2d: aload 0
      // 2e: getfield g5v$1.lih Lg5v;
      // 31: sipush 20648
      // 34: ldc2_w 219765667315085064
      // 37: lload 3
      // 38: lxor
      // 39: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: bipush 1
      // 40: anewarray 15
      // 43: dup
      // 44: bipush 0
      // 45: aload 6
      // 47: aastore
      // 48: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4b: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 4e: aload 0
      // 4f: getfield g5v$1.lih Lg5v;
      // 52: getfield g5v.hpt Lg5v$kot;
      // 55: iload 5
      // 57: ifne 72
      // 5a: ifnull 97
      // 5d: goto 64
      // 60: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 63: athrow
      // 64: aload 0
      // 65: getfield g5v$1.lih Lg5v;
      // 68: getfield g5v.hpt Lg5v$kot;
      // 6b: goto 72
      // 6e: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: aload 1
      // 73: aload 2
      // 74: iload 5
      // 76: ifne 8f
      // 79: ifnonnull 8e
      // 7c: goto 83
      // 7f: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 82: athrow
      // 83: bipush 0
      // 84: anewarray 166
      // 87: goto 92
      // 8a: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d: athrow
      // 8e: aload 2
      // 8f: getfield tv/twitch/broadcast/GameInfoList.list [Ltv/twitch/broadcast/GameInfo;
      // 92: invokeinterface g5v$kot.q5h (Ltv/twitch/ErrorCode;[Ltv/twitch/broadcast/GameInfo;)V 3
      // 97: goto a8
      // 9a: astore 6
      // 9c: aload 0
      // 9d: getfield g5v$1.lih Lg5v;
      // a0: aload 6
      // a2: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // a5: invokevirtual g5v.psg (Ljava/lang/String;)V
      // a8: return
   }

   public void bufferUnlockCallback(long var1) {
      FrameBuffer var3 = FrameBuffer.lookupBuffer(var1);
      this.lih.x1b.add(var3);
   }

   public void startCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 39830235055349
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 11: ifeq 5d
      // 14: aload 0
      // 15: getfield g5v$1.lih Lg5v;
      // 18: getfield g5v.hpt Lg5v$kot;
      // 1b: iload 4
      // 1d: ifne 38
      // 20: ifnull 3d
      // 23: goto 2a
      // 26: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield g5v$1.lih Lg5v;
      // 2e: getfield g5v.hpt Lg5v$kot;
      // 31: goto 38
      // 34: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: invokeinterface g5v$kot.e3p ()V 1
      // 3d: goto 4e
      // 40: astore 5
      // 42: aload 0
      // 43: getfield g5v$1.lih Lg5v;
      // 46: aload 5
      // 48: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 4b: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 4e: aload 0
      // 4f: getfield g5v$1.lih Lg5v;
      // 52: getstatic g5v$nin.jcl Lg5v$nin;
      // 55: invokevirtual g5v.koi (Lg5v$nin;)V
      // 58: iload 4
      // 5a: ifeq d2
      // 5d: aload 0
      // 5e: getfield g5v$1.lih Lg5v;
      // 61: aconst_null
      // 62: putfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 65: aload 0
      // 66: getfield g5v$1.lih Lg5v;
      // 69: aconst_null
      // 6a: putfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 6d: aload 0
      // 6e: getfield g5v$1.lih Lg5v;
      // 71: getstatic g5v$nin.a_4 Lg5v$nin;
      // 74: invokevirtual g5v.koi (Lg5v$nin;)V
      // 77: aload 0
      // 78: getfield g5v$1.lih Lg5v;
      // 7b: getfield g5v.hpt Lg5v$kot;
      // 7e: iload 4
      // 80: ifne 94
      // 83: ifnull 9a
      // 86: aload 0
      // 87: getfield g5v$1.lih Lg5v;
      // 8a: getfield g5v.hpt Lg5v$kot;
      // 8d: goto 94
      // 90: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 93: athrow
      // 94: aload 1
      // 95: invokeinterface g5v$kot.b2c (Ltv/twitch/ErrorCode;)V 2
      // 9a: goto ab
      // 9d: astore 5
      // 9f: aload 0
      // a0: getfield g5v$1.lih Lg5v;
      // a3: aload 5
      // a5: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // a8: invokevirtual g5v.psg (Ljava/lang/String;)V
      // ab: aload 1
      // ac: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // af: astore 5
      // b1: aload 0
      // b2: getfield g5v$1.lih Lg5v;
      // b5: sipush 28880
      // b8: ldc2_w 5294785840221730444
      // bb: lload 2
      // bc: lxor
      // bd: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: nop
      // c3: bipush 1
      // c4: anewarray 15
      // c7: dup
      // c8: bipush 0
      // c9: aload 5
      // cb: aastore
      // cc: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // cf: invokevirtual g5v.psg (Ljava/lang/String;)V
      // d2: return
   }

   public void stopCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 8538987230406
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq be
      // 13: invokestatic tv/twitch/ErrorCode.succeeded (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq ac
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield g5v$1.lih Lg5v;
      // 24: aconst_null
      // 25: putfield g5v._l3 Ltv/twitch/broadcast/VideoParams;
      // 28: aload 0
      // 29: getfield g5v$1.lih Lg5v;
      // 2c: aconst_null
      // 2d: putfield g5v.g08 Ltv/twitch/broadcast/AudioParams;
      // 30: aload 0
      // 31: getfield g5v$1.lih Lg5v;
      // 34: invokevirtual g5v.z71 ()V
      // 37: aload 0
      // 38: getfield g5v$1.lih Lg5v;
      // 3b: getfield g5v.hpt Lg5v$kot;
      // 3e: iload 4
      // 40: ifeq 54
      // 43: ifnull 59
      // 46: aload 0
      // 47: getfield g5v$1.lih Lg5v;
      // 4a: getfield g5v.hpt Lg5v$kot;
      // 4d: goto 54
      // 50: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: invokeinterface g5v$kot.n0l ()V 1
      // 59: goto 6a
      // 5c: astore 5
      // 5e: aload 0
      // 5f: getfield g5v$1.lih Lg5v;
      // 62: aload 5
      // 64: invokevirtual java/lang/Exception.toString ()Ljava/lang/String;
      // 67: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 6a: aload 0
      // 6b: getfield g5v$1.lih Lg5v;
      // 6e: iload 4
      // 70: ifeq a1
      // 73: getfield g5v.vwt Z
      // 76: ifeq 96
      // 79: goto 80
      // 7c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f: athrow
      // 80: aload 0
      // 81: getfield g5v$1.lih Lg5v;
      // 84: getstatic g5v$nin.a_4 Lg5v$nin;
      // 87: invokevirtual g5v.koi (Lg5v$nin;)V
      // 8a: iload 4
      // 8c: ifne e4
      // 8f: goto 96
      // 92: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 95: athrow
      // 96: aload 0
      // 97: getfield g5v$1.lih Lg5v;
      // 9a: goto a1
      // 9d: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a0: athrow
      // a1: getstatic g5v$nin.tc_ Lg5v$nin;
      // a4: invokevirtual g5v.koi (Lg5v$nin;)V
      // a7: iload 4
      // a9: ifne e4
      // ac: aload 0
      // ad: getfield g5v$1.lih Lg5v;
      // b0: getstatic g5v$nin.a_4 Lg5v$nin;
      // b3: invokevirtual g5v.koi (Lg5v$nin;)V
      // b6: aload 1
      // b7: goto be
      // ba: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bd: athrow
      // be: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // c1: astore 5
      // c3: aload 0
      // c4: getfield g5v$1.lih Lg5v;
      // c7: sipush 15269
      // ca: ldc2_w 3305260214570192331
      // cd: lload 2
      // ce: lxor
      // cf: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: nop
      // d5: bipush 1
      // d6: anewarray 15
      // d9: dup
      // da: bipush 0
      // db: aload 5
      // dd: aastore
      // de: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // e1: invokevirtual g5v.psg (Ljava/lang/String;)V
      // e4: return
   }

   public void sendActionMetaDataCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 91007687868768
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq 28
      // 13: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 4e
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 2b: astore 5
      // 2d: aload 0
      // 2e: getfield g5v$1.lih Lg5v;
      // 31: sipush 17636
      // 34: ldc2_w 3582218785877673769
      // 37: lload 2
      // 38: lxor
      // 39: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: bipush 1
      // 40: anewarray 15
      // 43: dup
      // 44: bipush 0
      // 45: aload 5
      // 47: aastore
      // 48: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4b: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 4e: return
   }

   public void sendStartSpanMetaDataCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 47683094534555
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq 28
      // 13: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 4e
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 2b: astore 5
      // 2d: aload 0
      // 2e: getfield g5v$1.lih Lg5v;
      // 31: sipush 18037
      // 34: ldc2_w 7222936120757149006
      // 37: lload 2
      // 38: lxor
      // 39: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: bipush 1
      // 40: anewarray 15
      // 43: dup
      // 44: bipush 0
      // 45: aload 5
      // 47: aastore
      // 48: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4b: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 4e: return
   }

   public void sendEndSpanMetaDataCallback(ErrorCode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic g5v$1.a J
      // 03: ldc2_w 138094612583137
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq 28
      // 13: invokestatic tv/twitch/ErrorCode.failed (Ltv/twitch/ErrorCode;)Z
      // 16: ifeq 4e
      // 19: goto 20
      // 1c: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 1
      // 21: goto 28
      // 24: invokestatic g5v$1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: invokestatic tv/twitch/ErrorCode.getString (Ltv/twitch/ErrorCode;)Ljava/lang/String;
      // 2b: astore 5
      // 2d: aload 0
      // 2e: getfield g5v$1.lih Lg5v;
      // 31: sipush 4100
      // 34: ldc2_w 6140972061901963328
      // 37: lload 2
      // 38: lxor
      // 39: invokedynamic y (IJ)Ljava/lang/String; bsm=g5v$1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: nop
      // 3f: bipush 1
      // 40: anewarray 15
      // 43: dup
      // 44: bipush 0
      // 45: aload 5
      // 47: aastore
      // 48: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 4b: invokevirtual g5v.psg (Ljava/lang/String;)V
      // 4e: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8472400883002180364L, -474817525647012178L, MethodHandles.lookup().lookupClass()).a(35223568931492L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 14245999829430L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "Ö4dcé\u0093hLÛÆë63ÿ.®Ýä\u0096\u008c(jW¨r¢Ô\u0080¡¶®sv\u0092\u0005OC\u0093\u001c\f#DcÜ\u008a£î+8G~Jq\u009e0¡\u001d\u0087kP\u0006H\f8IÅ%F\f¡Á\u00183êx¤xö:\u0001\u0011\u0004no·\u0091¢KBBú¼ã\u0010\u008c®§O>\u0010\u008a?%¦\u0080@]J\u0087yfn]b\u0083nkéà,»8s\u008aÔìèA\u0018$PnÊ´\t¶B\u0015àËý©N\u0010úå8-/+ü\u0093i\u008aÔ\\\u0083 3ìA\u0019l6\u0096ü¬,Ü\u000f@¸Ñ°H\u0005ÊrÍ)ÐÏÖé%¼H\n\u009a\u000e\u0015À¡÷\u001f\u008bú\u009f *\u009dÃ\u00813T\u0093ìÝÕa,6Ì\u001eI¬{Î\u0015\u009b\u0001á\u008brÆÉ\r\u0010®)çü\u0089ÜcPìqö\u0015\r#*\u0081\u008cÑ\u0019ñ\u0099Ø\u000ec\u0094ôS)\u00adá3ñ\u00ad+jPÿ\u000eÕ½@(áRçzÄ\u0007Ô\u008e_r\t\u0017W\u009f1Ö@R\u009b-S(\u0098\r¨Ð*ÊDÃ\u0090H×£\u0012¬Þu*÷TFVý¾\u000b@çÊÀî¦\u000fKÕ\u0088B\f\u009cÎ$/H\u009cA!Ñå\u0082ró/Ö*7Þ\u0089Àñ\t \u008c\b\u00936>»ÃWÖCÙ\u0082\u009f\rÃ´í&ØÑ-Ííú\t\u0087èX¹Ò8\u001bqÔ1-à,nó\u008f\u008fe®¹Fb|\u0098?fT\u0080'1\f%'¿'e\u001dÀd97éî4\u0098kmK\u001b=\u0006°\u0094\u0001öBéN|\"Ùà@©MáÂcbÇm\u0005\u0098±©í\u0097©Ðô\u000ec×ÞÜ%,ç\u0012\u0002\rªíñ\u0016X.i\u007f0Ò>éNú\u009a\u0096ç7:2G®\u0082 ã\\>R\u00ad°cN\u001c\u0087¿\u0011Hk\u0010\u0086ÿkâ¯¶»+\\\u0014Åi\u0087\u008c\u0087 ]²ñ×aÐ\u0019r\u008fBåR\u0099@vGåìÖ¸dS7\u0003b\u008eÅDúéï\u0089ÓEyâ@X¢\u008eÉH³<æ»\r\f\fè\u0012\u0018_ßH´\u0097Ýí\u0003´ÿÕÁõÜ²\u001a}\u0016uì\n\nVh]\u0012\u0004\u008eT6ÿ\u008cøØ\u0081ë\u00956vá$\u0094)\u0004LúÝ;Ë\u0099V\u0096H©Õ§¦rÂ\u0092%Ãñ\u0099æ)È¡¦KbÚ§\bû@kÇÜóî\u009cmíÜÖÕãEÏ\u001fcñ2r \u009c£\u008c]À\u0099zµÁ\u00127N/\u00818\u0098\u0004½xÄ~\u0012\u00adE\u0098Y«¹æ\u0090~½\u009fz§/f%êMùe\"ª";
      int var8 = "Ö4dcé\u0093hLÛÆë63ÿ.®Ýä\u0096\u008c(jW¨r¢Ô\u0080¡¶®sv\u0092\u0005OC\u0093\u001c\f#DcÜ\u008a£î+8G~Jq\u009e0¡\u001d\u0087kP\u0006H\f8IÅ%F\f¡Á\u00183êx¤xö:\u0001\u0011\u0004no·\u0091¢KBBú¼ã\u0010\u008c®§O>\u0010\u008a?%¦\u0080@]J\u0087yfn]b\u0083nkéà,»8s\u008aÔìèA\u0018$PnÊ´\t¶B\u0015àËý©N\u0010úå8-/+ü\u0093i\u008aÔ\\\u0083 3ìA\u0019l6\u0096ü¬,Ü\u000f@¸Ñ°H\u0005ÊrÍ)ÐÏÖé%¼H\n\u009a\u000e\u0015À¡÷\u001f\u008bú\u009f *\u009dÃ\u00813T\u0093ìÝÕa,6Ì\u001eI¬{Î\u0015\u009b\u0001á\u008brÆÉ\r\u0010®)çü\u0089ÜcPìqö\u0015\r#*\u0081\u008cÑ\u0019ñ\u0099Ø\u000ec\u0094ôS)\u00adá3ñ\u00ad+jPÿ\u000eÕ½@(áRçzÄ\u0007Ô\u008e_r\t\u0017W\u009f1Ö@R\u009b-S(\u0098\r¨Ð*ÊDÃ\u0090H×£\u0012¬Þu*÷TFVý¾\u000b@çÊÀî¦\u000fKÕ\u0088B\f\u009cÎ$/H\u009cA!Ñå\u0082ró/Ö*7Þ\u0089Àñ\t \u008c\b\u00936>»ÃWÖCÙ\u0082\u009f\rÃ´í&ØÑ-Ííú\t\u0087èX¹Ò8\u001bqÔ1-à,nó\u008f\u008fe®¹Fb|\u0098?fT\u0080'1\f%'¿'e\u001dÀd97éî4\u0098kmK\u001b=\u0006°\u0094\u0001öBéN|\"Ùà@©MáÂcbÇm\u0005\u0098±©í\u0097©Ðô\u000ec×ÞÜ%,ç\u0012\u0002\rªíñ\u0016X.i\u007f0Ò>éNú\u009a\u0096ç7:2G®\u0082 ã\\>R\u00ad°cN\u001c\u0087¿\u0011Hk\u0010\u0086ÿkâ¯¶»+\\\u0014Åi\u0087\u008c\u0087 ]²ñ×aÐ\u0019r\u008fBåR\u0099@vGåìÖ¸dS7\u0003b\u008eÅDúéï\u0089ÓEyâ@X¢\u008eÉH³<æ»\r\f\fè\u0012\u0018_ßH´\u0097Ýí\u0003´ÿÕÁõÜ²\u001a}\u0016uì\n\nVh]\u0012\u0004\u008eT6ÿ\u008cøØ\u0081ë\u00956vá$\u0094)\u0004LúÝ;Ë\u0099V\u0096H©Õ§¦rÂ\u0092%Ãñ\u0099æ)È¡¦KbÚ§\bû@kÇÜóî\u009cmíÜÖÕãEÏ\u001fcñ2r \u009c£\u008c]À\u0099zµÁ\u00127N/\u00818\u0098\u0004½xÄ~\u0012\u00adE\u0098Y«¹æ\u0090~½\u009fz§/f%êMùe\"ª"
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
                     c = new String[13];
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

                  var6 = "IÒ\"!ÁjÌiÜÆx\u0010kÃ\u007f0;mfÔ\u0093\u008fÒRx\u0094%F\u009c]zÚ,£4¸£óë\u0080ÕÙÏ²PëÁùÈÇAìãÛ\u0004¢hEãít\u0087ú\u0018Ph/ñT\u0099\u001f\u0012°à9\u0097ìvp\b%-üÑH6½_ººTbÏ- Å:W\u0082\u0099\u009f\u001c\u008bQ\u008e\u009b\u000eýB;\u0092Â\u001bU¶â©9L\u0091?~K\u008e×¨\u0015(ÅÅgrð\nØd\u001a¡\u0001!ö\u008dZ\u0085ª";
                  var8 = "IÒ\"!ÁjÌiÜÆx\u0010kÃ\u007f0;mfÔ\u0093\u008fÒRx\u0094%F\u009c]zÚ,£4¸£óë\u0080ÕÙÏ²PëÁùÈÇAìãÛ\u0004¢hEãít\u0087ú\u0018Ph/ñT\u0099\u001f\u0012°à9\u0097ìvp\b%-üÑH6½_ººTbÏ- Å:W\u0082\u0099\u009f\u001c\u008bQ\u008e\u009b\u000eýB;\u0092Â\u001bU¶â©9L\u0091?~K\u008e×¨\u0015(ÅÅgrð\nØd\u001a¡\u0001!ö\u008dZ\u0085ª"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28198;
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
            throw new RuntimeException("g5v$1", var10);
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
         throw new RuntimeException("g5v$1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
