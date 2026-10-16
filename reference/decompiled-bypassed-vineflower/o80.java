import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class o80 extends Thread {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public o80(String var1, String var2) {
      long var3 = a ^ 131739690486635L;
      super(a<"h">(831, 7013956027468735704L ^ var3) + ac_.incrementAndGet());
      this.zod = true;
      this.fwl = var1;
      this.ezx = var2;
      this.setDaemon(true);
      this.u_h = new DatagramSocket();
   }

   @Override
   public void run() {
      long var1 = a ^ 71306602414076L;
      String var4 = n21(this.fwl, this.ezx);
      int var10000 = t9d.c();
      byte[] var5 = var4.getBytes();
      int var3 = var10000;

      while (true) {
         try {
            if (this.isInterrupted() || !this.zod) {
               break;
            }
         } catch (IOException var10) {
            throw a(var10);
         }

         try {
            InetAddress var6 = InetAddress.getByName(a<"h">(25314, 4024385544754803097L ^ var1));
            DatagramPacket var7 = new DatagramPacket(var5, var5.length, var6, 4445);
            this.u_h.send(var7);
         } catch (IOException var9) {
            gni.warn(a<"h">(2805, 2917220136773147023L ^ var1) + var9.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var8) {
            if (var3 != 0) {
               break;
            }
         }
      }
   }

   @Override
   public void interrupt() {
      super.interrupt();
      this.zod = false;
   }

   public static String n21(String var0, String var1) {
      long var2 = a ^ 102930648956431L;
      return a<"h">(7965, 5345214320643001746L ^ var2) + var0 + a<"h">(16740, 1023451545543807968L ^ var2) + var1 + a<"h">(2325, 3507496195271580565L ^ var2);
   }

   public static String zmu(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic o80.a J
      // 03: ldc2_w 89307420539647
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: sipush 10844
      // 10: ldc2_w 3829963332866915362
      // 13: lload 1
      // 14: lxor
      // 15: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: nop
      // 1b: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1e: istore 4
      // 20: iload 4
      // 22: iload 3
      // 23: ifne 69
      // 26: ifge 43
      // 29: goto 30
      // 2c: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: sipush 29760
      // 33: ldc2_w 2719253054510555701
      // 36: lload 1
      // 37: lxor
      // 38: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: nop
      // 3e: areturn
      // 3f: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 0
      // 44: sipush 5370
      // 47: ldc2_w 5173215772942369409
      // 4a: lload 1
      // 4b: lxor
      // 4c: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: nop
      // 52: iload 4
      // 54: sipush 10844
      // 57: ldc2_w 3829963332866915362
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: nop
      // 62: invokevirtual java/lang/String.length ()I
      // 65: iadd
      // 66: invokevirtual java/lang/String.indexOf (Ljava/lang/String;I)I
      // 69: istore 5
      // 6b: iload 5
      // 6d: iload 4
      // 6f: if_icmpge 87
      // 72: sipush 14463
      // 75: ldc2_w 3422833097331781133
      // 78: lload 1
      // 79: lxor
      // 7a: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: nop
      // 80: goto a1
      // 83: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 86: athrow
      // 87: aload 0
      // 88: iload 4
      // 8a: sipush 10844
      // 8d: ldc2_w 3829963332866915362
      // 90: lload 1
      // 91: lxor
      // 92: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: invokevirtual java/lang/String.length ()I
      // 9b: iadd
      // 9c: iload 5
      // 9e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // a1: areturn
   }

   public static String ja3(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic o80.a J
      // 003: ldc2_w 41985130216997
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: sipush 10028
      // 010: ldc2_w 3274225268699313543
      // 013: lload 1
      // 014: lxor
      // 015: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a: nop
      // 01b: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 01e: istore 4
      // 020: iload 4
      // 022: iload 3
      // 023: ifeq 05c
      // 026: ifge 036
      // 029: goto 030
      // 02c: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: aconst_null
      // 031: areturn
      // 032: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aload 0
      // 037: sipush 5370
      // 03a: ldc2_w 5173091436135679579
      // 03d: lload 1
      // 03e: lxor
      // 03f: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: nop
      // 045: iload 4
      // 047: sipush 5370
      // 04a: ldc2_w 5173091436135679579
      // 04d: lload 1
      // 04e: lxor
      // 04f: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: nop
      // 055: invokevirtual java/lang/String.length ()I
      // 058: iadd
      // 059: invokevirtual java/lang/String.indexOf (Ljava/lang/String;I)I
      // 05c: istore 5
      // 05e: iload 5
      // 060: iload 3
      // 061: ifeq 09a
      // 064: iflt 074
      // 067: goto 06e
      // 06a: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: aconst_null
      // 06f: areturn
      // 070: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 0
      // 075: sipush 6940
      // 078: ldc2_w 7835593961855519163
      // 07b: lload 1
      // 07c: lxor
      // 07d: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: nop
      // 083: iload 4
      // 085: sipush 5370
      // 088: ldc2_w 5173091436135679579
      // 08b: lload 1
      // 08c: lxor
      // 08d: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: nop
      // 093: invokevirtual java/lang/String.length ()I
      // 096: iadd
      // 097: invokevirtual java/lang/String.indexOf (Ljava/lang/String;I)I
      // 09a: istore 6
      // 09c: iload 6
      // 09e: iload 3
      // 09f: ifeq 0d8
      // 0a2: ifge 0b2
      // 0a5: goto 0ac
      // 0a8: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: aconst_null
      // 0ad: areturn
      // 0ae: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: sipush 29961
      // 0b6: ldc2_w 5343019738645030831
      // 0b9: lload 1
      // 0ba: lxor
      // 0bb: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: nop
      // 0c1: iload 6
      // 0c3: sipush 21076
      // 0c6: ldc2_w 7702028167608123636
      // 0c9: lload 1
      // 0ca: lxor
      // 0cb: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: invokevirtual java/lang/String.length ()I
      // 0d4: iadd
      // 0d5: invokevirtual java/lang/String.indexOf (Ljava/lang/String;I)I
      // 0d8: istore 7
      // 0da: iload 7
      // 0dc: iload 6
      // 0de: if_icmpge 0e9
      // 0e1: aconst_null
      // 0e2: goto 103
      // 0e5: invokestatic o80.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: iload 6
      // 0ec: sipush 21076
      // 0ef: ldc2_w 7702028167608123636
      // 0f2: lload 1
      // 0f3: lxor
      // 0f4: invokedynamic h (IJ)Ljava/lang/String; bsm=o80.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: nop
      // 0fa: invokevirtual java/lang/String.length ()I
      // 0fd: iadd
      // 0fe: iload 7
      // 100: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 103: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3021069127875821508L, 8030452718500895258L, MethodHandles.lookup().lookupClass()).a(111974913624791L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 100719393343951L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "ÂÅûÁùøò\u00170æDV\u0093uy´\u0089ÄBBà[\u0002I(\u0002\u0000»-ËA§Ê\u0097\u0081\u001dh¬°µCPî]|n9\u001bÕÏÏñj\u001c©\nkR\u001dWÂ\u0083ò¥¶\u0010\u008fÃhR·ÐË\u000fÆ\u0085\u0091ÁNùJÆ\u0010bDR\u009eúÆ{\u001cJØÇ\u0095.ªýÛ\u0010]O\u0098§v&X¼\u0081É\\IÙýo\u0085\u0010OP\u0004Äç\u0092)´Û¾¿H2\u009dØ\t\u0010\u0018½Â\u0012îôSõ\u0003I\u0012ÖÂ¼<ù\u0010½[ò*\u009dX4\u0016S»ã\u0087¹#{m\u0010\u0090³#h\u0085\u008b>!M-\u009c¬@e \u001d\u0010[\u00961Vå\u0004\u009aè½t\u0085·#\u0098\u0010\u008b \u008bU8XUjÝ\u001a=®\u0081\u0084ûß[Ð?%ð\\«7Ûç}Á\"\u0014jåF<0O~àqm\u0093\u0002:\rÚö*©K\u008cðþª+V¢v¼¦N\u0015Êw4\u0004Pe\u0000\u009dp\u0080wvmf.\u008aH8¹\"ðb";
      int var8 = "ÂÅûÁùøò\u00170æDV\u0093uy´\u0089ÄBBà[\u0002I(\u0002\u0000»-ËA§Ê\u0097\u0081\u001dh¬°µCPî]|n9\u001bÕÏÏñj\u001c©\nkR\u001dWÂ\u0083ò¥¶\u0010\u008fÃhR·ÐË\u000fÆ\u0085\u0091ÁNùJÆ\u0010bDR\u009eúÆ{\u001cJØÇ\u0095.ªýÛ\u0010]O\u0098§v&X¼\u0081É\\IÙýo\u0085\u0010OP\u0004Äç\u0092)´Û¾¿H2\u009dØ\t\u0010\u0018½Â\u0012îôSõ\u0003I\u0012ÖÂ¼<ù\u0010½[ò*\u009dX4\u0016S»ã\u0087¹#{m\u0010\u0090³#h\u0085\u008b>!M-\u009c¬@e \u001d\u0010[\u00961Vå\u0004\u009aè½t\u0085·#\u0098\u0010\u008b \u008bU8XUjÝ\u001a=®\u0081\u0084ûß[Ð?%ð\\«7Ûç}Á\"\u0014jåF<0O~àqm\u0093\u0002:\rÚö*©K\u008cðþª+V¢v¼¦N\u0015Êw4\u0004Pe\u0000\u009dp\u0080wvmf.\u008aH8¹\"ðb"
         .length();
      char var5 = 24;
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
                     c = new String[14];
                     ac_ = new AtomicInteger(0);
                     gni = LogManager.getLogger();
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

                  var6 = "ê\u0014<ûæ\u0089¦+Ú1´\u001b\u009aç\u000eOà7Û\u0097Ü\u0004óç`Vý\u00ad¤ÊbN XH\u0098çÐy\u001aLY¼T~Õ\u00adNé½ü\u0007¡û'a\u0004\u0096Ýâ\\\u008d\u00145\u0001";
                  var8 = "ê\u0014<ûæ\u0089¦+Ú1´\u001b\u009aç\u000eOà7Û\u0097Ü\u0004óç`Vý\u00ad¤ÊbN XH\u0098çÐy\u001aLY¼T~Õ\u00adNé½ü\u0007¡û'a\u0004\u0096Ýâ\\\u008d\u00145\u0001"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31710;
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
            throw new RuntimeException("o80", var10);
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
         throw new RuntimeException("o80" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
