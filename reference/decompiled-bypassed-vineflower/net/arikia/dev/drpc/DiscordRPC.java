package net.arikia.dev.drpc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

public final class DiscordRPC {
   private static final String DLL_VERSION;
   private static final String LIB_VERSION;
   private static String[] a;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public static void discordInitialize(String var0, DiscordEventHandlers var1, boolean var2) {
      String[] var3 = b();

      DiscordRPC$DLL var10000;
      String var10001;
      DiscordEventHandlers var10002;
      byte var10003;
      label22: {
         label21: {
            try {
               var10000 = DiscordRPC$DLL.INSTANCE;
               var10001 = var0;
               var10002 = var1;
               var10003 = var2;
               if (var3 == null) {
                  break label22;
               }

               if (var2 != 0) {
                  break label21;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10003 = 0;
            break label22;
         }

         var10003 = 1;
      }

      var10000.Discord_Initialize(var10001, var10002, var10003, null);
   }

   public static void discordRegister(String var0, String var1) {
      DiscordRPC$DLL.INSTANCE.Discord_Register(var0, var1);
   }

   public static void discordInitialize(String var0, DiscordEventHandlers var1, boolean var2, String var3) {
      String[] var4 = b();

      DiscordRPC$DLL var10000;
      String var10001;
      DiscordEventHandlers var10002;
      byte var10003;
      label22: {
         label21: {
            try {
               var10000 = DiscordRPC$DLL.INSTANCE;
               var10001 = var0;
               var10002 = var1;
               var10003 = var2;
               if (var4 == null) {
                  break label22;
               }

               if (var2 != 0) {
                  break label21;
               }
            } catch (oov var5) {
               throw a(var5);
            }

            var10003 = 0;
            break label22;
         }

         var10003 = 1;
      }

      var10000.Discord_Initialize(var10001, var10002, var10003, var3);
   }

   public static void discordRegisterSteam(String var0, String var1) {
      DiscordRPC$DLL.INSTANCE.Discord_RegisterSteamGame(var0, var1);
   }

   public static void discordUpdateEventHandlers(DiscordEventHandlers var0) {
      DiscordRPC$DLL.INSTANCE.Discord_UpdateHandlers(var0);
   }

   public static void discordShutdown() {
      DiscordRPC$DLL.INSTANCE.Discord_Shutdown();
   }

   public static void discordRunCallbacks() {
      DiscordRPC$DLL.INSTANCE.Discord_RunCallbacks();
   }

   public static void discordUpdatePresence(DiscordRichPresence var0) {
      DiscordRPC$DLL.INSTANCE.Discord_UpdatePresence(var0);
   }

   public static void discordClearPresence() {
      DiscordRPC$DLL.INSTANCE.Discord_ClearPresence();
   }

   public static void discordRespond(String var0, DiscordRPC$DiscordReply var1) {
      DiscordRPC$DLL.INSTANCE.Discord_Respond(var0, var1.reply);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void loadDLL() {
      long var0 = b ^ 29693613327514L;
      String var2 = System.mapLibraryName(a<"s">(14440, 1607227141713729071L ^ var0));
      OSUtil var3 = new OSUtil();
      String var6;
      String var7;
      if (var3.isMac()) {
         File var4 = new File(
            System.getProperty(a<"s">(2562, 5391799445698290777L ^ var0))
               + File.separator
               + a<"s">(14372, 1782783387569002086L ^ var0)
               + File.separator
               + a<"s">(25583, 8657681178450709938L ^ var0)
               + File.separator
         );
         var7 = a<"s">(19523, 852873886899659273L ^ var0);
         var6 = var4 + File.separator + a<"s">(29122, 2953246078474116996L ^ var0) + File.separator + var2;
      } else if (var3.isWindows()) {
         File var54 = new File(System.getenv(a<"s">(27100, 3574972473149441943L ^ var0)));
         boolean var8 = System.getProperty(a<"s">(25758, 595521764597385937L ^ var0)).equals(a<"s">(28886, 9092672251729305226L ^ var0));

         String var10000;
         label232: {
            try {
               if (var8) {
                  var10000 = a<"s">(16625, 7900042794711740089L ^ var0);
                  break label232;
               }
            } catch (Throwable var53) {
               throw a(var53);
            }

            var10000 = a<"s">(327, 6129361407390330626L ^ var0);
         }

         var7 = var10000;
         var6 = var54 + File.separator + a<"s">(29122, 2953246078474116996L ^ var0) + File.separator + var2;
      } else {
         File var55 = new File(System.getProperty(a<"s">(3550, 5226224590658642846L ^ var0)), a<"s">(11291, 8312781077856813634L ^ var0));
         var7 = a<"s">(401, 1531924348467720156L ^ var0);
         var6 = var55 + File.separator + var2;
      }

      String var5 = a<"s">(15881, 1522198441367801933L ^ var0) + var7 + "/" + var2;
      File var56 = new File(var6);

      try {
         InputStream var9 = DiscordRPC.class.getResourceAsStream(var5);
         Throwable var10 = null;

         try {
            FileOutputStream var11 = openOutputStream(var56);
            Throwable var12 = null;
            boolean var42 = false /* VF: Semaphore variable */;

            try {
               var42 = true;
               copyFile(var9, var11);
               var56.deleteOnExit();
               var42 = false;
            } catch (Throwable var46) {
               var12 = var46;
               throw var46;
            } finally {
               if (var42) {
                  label215: {
                     label214: {
                        try {
                           if (var11 == null) {
                              break label215;
                           }

                           if (var12 == null) {
                              break label214;
                           }
                        } catch (Throwable var48) {
                           throw a(var48);
                        }

                        try {
                           var11.close();
                        } catch (Throwable var44) {
                           var12.addSuppressed(var44);
                        }
                        break label215;
                     }

                     var11.close();
                  }
               }
            }

            if (var11 != null) {
               if (var12 != null) {
                  try {
                     var11.close();
                  } catch (Throwable var45) {
                     var12.addSuppressed(var45);
                  }
               } else {
                  var11.close();
               }
            }
         } catch (Throwable var50) {
            var10 = var50;
            throw var50;
         } finally {
            label205: {
               label204: {
                  try {
                     if (var9 == null) {
                        break label205;
                     }

                     if (var10 == null) {
                        break label204;
                     }
                  } catch (Throwable var47) {
                     throw a(var47);
                  }

                  try {
                     var9.close();
                  } catch (Throwable var43) {
                     var10.addSuppressed(var43);
                  }
                  break label205;
               }

               var9.close();
            }
         }
      } catch (IOException var52) {
         var52.printStackTrace();
      }

      System.load(var56.getAbsolutePath());
   }

   private static void copyFile(InputStream var0, OutputStream var1) {
      byte[] var2 = new byte[4096];

      while (true) {
         byte var10000 = -1;
         int var3;
         int var10001 = var3 = var0.read(var2);

         try {
            if (var10000 == var10001) {
               return;
            }

            var1.write(var2, 0, var3);
         } catch (oov var4) {
            throw a(var4);
         }
      }
   }

   private static FileOutputStream openOutputStream(File param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic net/arikia/dev/drpc/DiscordRPC.b J
      // 003: ldc2_w 137758713353619
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: invokevirtual java/io/File.exists ()Z
      // 00c: ifeq 09c
      // 00f: aload 0
      // 010: invokevirtual java/io/File.isDirectory ()Z
      // 013: ifeq 059
      // 016: goto 01d
      // 019: invokestatic net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: new java/io/IOException
      // 020: dup
      // 021: new java/lang/StringBuilder
      // 024: dup
      // 025: invokespecial java/lang/StringBuilder.<init> ()V
      // 028: sipush 2827
      // 02b: ldc2_w 3169792179629683800
      // 02e: lload 1
      // 02f: lxor
      // 030: invokedynamic s (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 039: aload 0
      // 03a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 03d: sipush 28381
      // 040: ldc2_w 3592040568754606490
      // 043: lload 1
      // 044: lxor
      // 045: invokedynamic s (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: nop
      // 04b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 051: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 054: athrow
      // 055: invokestatic net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 058: athrow
      // 059: aload 0
      // 05a: invokevirtual java/io/File.canWrite ()Z
      // 05d: ifne 0fd
      // 060: new java/io/IOException
      // 063: dup
      // 064: new java/lang/StringBuilder
      // 067: dup
      // 068: invokespecial java/lang/StringBuilder.<init> ()V
      // 06b: sipush 21294
      // 06e: ldc2_w 6295409739257982052
      // 071: lload 1
      // 072: lxor
      // 073: invokedynamic s (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07c: aload 0
      // 07d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 080: sipush 31606
      // 083: ldc2_w 9202444753557390368
      // 086: lload 1
      // 087: lxor
      // 088: invokedynamic s (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: nop
      // 08e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 091: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 094: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 097: athrow
      // 098: invokestatic net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 0
      // 09d: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 0a0: astore 3
      // 0a1: aload 3
      // 0a2: ifnull 0fd
      // 0a5: aload 3
      // 0a6: invokevirtual java/io/File.mkdirs ()Z
      // 0a9: ifne 0fd
      // 0ac: goto 0b3
      // 0af: invokestatic net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: aload 3
      // 0b4: invokevirtual java/io/File.isDirectory ()Z
      // 0b7: ifne 0fd
      // 0ba: goto 0c1
      // 0bd: invokestatic net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: new java/io/IOException
      // 0c4: dup
      // 0c5: new java/lang/StringBuilder
      // 0c8: dup
      // 0c9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cc: sipush 19253
      // 0cf: ldc2_w 6159005845792896125
      // 0d2: lload 1
      // 0d3: lxor
      // 0d4: invokedynamic s (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: aload 3
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e1: sipush 24520
      // 0e4: ldc2_w 980991872504176793
      // 0e7: lload 1
      // 0e8: lxor
      // 0e9: invokedynamic s (IJ)Ljava/lang/String; bsm=net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: nop
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f5: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 0f8: athrow
      // 0f9: invokestatic net/arikia/dev/drpc/DiscordRPC.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: new java/io/FileOutputStream
      // 100: dup
      // 101: aload 0
      // 102: invokespecial java/io/FileOutputStream.<init> (Ljava/io/File;)V
      // 105: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6259011098152210489L, -1451100210554775258L, MethodHandles.lookup().lookupClass()).a(88552993210932L);
      // $VF: monitorexit
      b = var10000;
      String[] var13 = new String[3];
      long var0 = b ^ 129915442206104L;
      b(var13);
      Cipher var2;
      Cipher var14 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[23];
      int var7 = 0;
      String var6 = "K \u0095{{\u0019\"^Vüì±\u001bVzæ\u00104(ZÄZõêN\u0012\u0007\u0082ýÛ\u009a\u000eÌ\u0010jId@ßdqü\u0089\u0091¢\u00029\u0083\u0087\u0082\u0010\u0096]IbD»\u009cw\u0010-ð\\÷ì©\u0099\u0010Ag\u000e5Þ\u0087Aº\u0011<\u009fl¹\n^\u0001\u0010\u0014º6\t¼\u0014O^Kÿ8¼\u0096¨\u0011Ü(\u009bëg\u000e\u001cn\u008d²TºKÃ(<<\u001a+Y Ì²b-\u0019ªrÄ\u0003\u001dh\u0086U*\u001b;\u000b¶Gï)8¥\u001dÃ°$di÷]ßí¸ö\u009d[Áf\u0003ùJ¹éÞ\u0095\u0012\u0003¦×ý\u0014Új>©\u0000\u0091óåQè\nM\u0006×ß\u000f\u0087\u009f«ÇY\u0018\u0090ØH_ \u0004¢þÔE\u0083Ð\u0014òþB\u0083±Ñ\u001bfð3\u008f\u0001\r\u0003\u009cßV°\u001c\u001eæ\u0091E\u0013 \u0018;8&¶n¢3§\u009a~\u0002×¶¤¢.Æ%m¡\u008ctóTs²XÃæ\u0094¥\u0010\rç:»\u0090G\u009f\u001a\u0001\u0097\u00132óþ\u001cÌ\u0010 }oÙ\nÊeòö¬\u0087«§\u0098ç\u0086\u0010\u008afÉ\u0013VíÊàó;ÈÍrÒº\u0017\u0018Ó£ÄÚ\u009f\u009e>qi}ÜÂÀ\u000eÙ_È^wMw\u0095óh tíÛÀfx\u0097µÓI7Ú¥ÞK\u0014[7R\u0083\u0086u\u0002[äÍÛ¬\u0017Z,\u008d Lïí\u009fÊr\u0002.\u0000\u000b\u001eÁ+Ø¥ékìÂu\u0092\u009a\u0090\u007f\n\u0017§½_\u0098ÿo O\u0012Û§\u0014 \u008bÝv# }\u0013¶Àßx^(\u00ad!ñg²±D\u00ad\u0091¶\u0012|Í(\u009dÌ\u0083\u0096á{ÄV\u0018WhéØ\u0083tn24\u001fñOv@óì[1Åâi\u001eE\u009cË ôû|-z\u0018\u007f5wßr¡ä\u0092ù²p?9~u»ýQ`ÒÃó¬\u0081\u0010\u0089\u0081J|âÞÎ2mèì\u0090FyÕJ(¢ÒzÛA¡¶ñ\u001e\u0088ö\u0011>\b\u0015Ï©\u001fr4\u0003\u008a\u0094\u001eÄ\u0095Ù\u0005ú-Dm\u0082\u0017!\nÌRi\u0087";
      int var8 = "K \u0095{{\u0019\"^Vüì±\u001bVzæ\u00104(ZÄZõêN\u0012\u0007\u0082ýÛ\u009a\u000eÌ\u0010jId@ßdqü\u0089\u0091¢\u00029\u0083\u0087\u0082\u0010\u0096]IbD»\u009cw\u0010-ð\\÷ì©\u0099\u0010Ag\u000e5Þ\u0087Aº\u0011<\u009fl¹\n^\u0001\u0010\u0014º6\t¼\u0014O^Kÿ8¼\u0096¨\u0011Ü(\u009bëg\u000e\u001cn\u008d²TºKÃ(<<\u001a+Y Ì²b-\u0019ªrÄ\u0003\u001dh\u0086U*\u001b;\u000b¶Gï)8¥\u001dÃ°$di÷]ßí¸ö\u009d[Áf\u0003ùJ¹éÞ\u0095\u0012\u0003¦×ý\u0014Új>©\u0000\u0091óåQè\nM\u0006×ß\u000f\u0087\u009f«ÇY\u0018\u0090ØH_ \u0004¢þÔE\u0083Ð\u0014òþB\u0083±Ñ\u001bfð3\u008f\u0001\r\u0003\u009cßV°\u001c\u001eæ\u0091E\u0013 \u0018;8&¶n¢3§\u009a~\u0002×¶¤¢.Æ%m¡\u008ctóTs²XÃæ\u0094¥\u0010\rç:»\u0090G\u009f\u001a\u0001\u0097\u00132óþ\u001cÌ\u0010 }oÙ\nÊeòö¬\u0087«§\u0098ç\u0086\u0010\u008afÉ\u0013VíÊàó;ÈÍrÒº\u0017\u0018Ó£ÄÚ\u009f\u009e>qi}ÜÂÀ\u000eÙ_È^wMw\u0095óh tíÛÀfx\u0097µÓI7Ú¥ÞK\u0014[7R\u0083\u0086u\u0002[äÍÛ¬\u0017Z,\u008d Lïí\u009fÊr\u0002.\u0000\u000b\u001eÁ+Ø¥ékìÂu\u0092\u009a\u0090\u007f\n\u0017§½_\u0098ÿo O\u0012Û§\u0014 \u008bÝv# }\u0013¶Àßx^(\u00ad!ñg²±D\u00ad\u0091¶\u0012|Í(\u009dÌ\u0083\u0096á{ÄV\u0018WhéØ\u0083tn24\u001fñOv@óì[1Åâi\u001eE\u009cË ôû|-z\u0018\u007f5wßr¡ä\u0092ù²p?9~u»ýQ`ÒÃó¬\u0081\u0010\u0089\u0081J|âÞÎ2mèì\u0090FyÕJ(¢ÒzÛA¡¶ñ\u001e\u0088ö\u0011>\b\u0015Ï©\u001fr4\u0003\u008a\u0094\u001eÄ\u0095Ù\u0005ú-Dm\u0082\u0017!\nÌRi\u0087"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var15 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var21;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     d = new String[23];
                     LIB_VERSION = a<"s">(30955, 5575603792924182437L ^ var0);
                     DLL_VERSION = a<"s">(32545, 7458637526746759274L ^ var0);
                     loadDLL();
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var21;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "KPÁ÷ø\u008ay\u009dæ¾cD×áÿ\u000e(*\u007fÑÏiN\u008a|Z9{\u0016z\u009fz\u00adÁØ\u0013¼W'\u0091x¸=s\u009eì`ÝÐì¥\\?êÂÐ\u0006";
                  var8 = "KPÁ÷ø\u008ay\u009dæ¾cD×áÿ\u000e(*\u007fÑÏiN\u008a|Z9{\u0016z\u009fz\u00adÁØ\u0013¼W'\u0091x¸=s\u009eì`ÝÐì¥\\?êÂÐ\u0006".length();
                  var5 = 16;
                  var12 = -1;
            }

            var15 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   public static void b(String[] var0) {
      a = var0;
   }

   public static String[] b() {
      return a;
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25098;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("net/arikia/dev/drpc/DiscordRPC", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("net/arikia/dev/drpc/DiscordRPC" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
