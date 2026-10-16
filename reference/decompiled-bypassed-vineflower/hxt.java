import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import net.optifine.VersionCheckThread;
import net.optifine.config.GlVersion;
import net.optifine.gui.GuiMessage;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.Shaders;
import net.optifine.util.DisplayModeComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class hxt {
   public static final String zve;
   public static final String yj8;
   public static final String _92;
   public static final String av1;
   public static final String h_7;
   private static String ykr;
   private static String ctr;
   private static boolean r7b;
   public static String pfv;
   public static String po6;
   public static String yt5;
   public static String[] die;
   public static GlVersion hmw;
   public static GlVersion e07;
   public static int bd_;
   public static boolean xbu;
   public static boolean wzj;
   private static moh hih;
   private static c05 oq4;
   private static boolean gp2;
   private static Thread yhh;
   private static DisplayMode uuq;
   private static DisplayMode[] jfb;
   private static int dz3;
   private static int md5;
   public static boolean shm;
   public static boolean g9j;
   private static int v7d;
   public static boolean as6;
   private static boolean _a0;
   private static boolean cwd;
   private static ity y8h;
   public static final Float dxe;
   private static final Logger ntb;
   public static final boolean s9r;
   private static String zn9;
   private static int lhf;
   public static float dhf;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static String _yw() {
      long var0 = a ^ 68584909267247L;
      return a<"r">(16020, 6800584965132953393L ^ var0);
   }

   public static String _cs() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 132452013715082
      // 06: lxor
      // 07: lstore 0
      // 08: invokestatic t9d.c ()I
      // 0b: istore 2
      // 0c: new java/lang/StringBuffer
      // 0f: dup
      // 10: bipush 32
      // 12: invokespecial java/lang/StringBuffer.<init> (I)V
      // 15: astore 3
      // 16: iload 2
      // 17: ifne 72
      // 1a: invokestatic hxt.csr ()Z
      // 1d: ifeq 5f
      // 20: goto 27
      // 23: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 3
      // 28: sipush 12298
      // 2b: ldc2_w 8166408273554630255
      // 2e: lload 0
      // 2f: lxor
      // 30: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 39: pop
      // 3a: aload 3
      // 3b: invokestatic net/optifine/DynamicLights.getCount ()I
      // 3e: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
      // 41: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 44: pop
      // 45: aload 3
      // 46: sipush 26846
      // 49: ldc2_w 4893428025103793911
      // 4c: lload 0
      // 4d: lxor
      // 4e: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 57: pop
      // 58: goto 5f
      // 5b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 3
      // 60: sipush 24270
      // 63: ldc2_w 8683004393990818000
      // 66: lload 0
      // 67: lxor
      // 68: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 71: pop
      // 72: invokestatic net/optifine/shaders/Shaders.getShaderPackName ()Ljava/lang/String;
      // 75: astore 4
      // 77: aload 4
      // 79: iload 2
      // 7a: ifne ac
      // 7d: ifnull a8
      // 80: goto 87
      // 83: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 3
      // 88: sipush 10257
      // 8b: ldc2_w 5977909416619802218
      // 8e: lload 0
      // 8f: lxor
      // 90: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: nop
      // 96: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 99: pop
      // 9a: aload 3
      // 9b: aload 4
      // 9d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // a0: pop
      // a1: goto a8
      // a4: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a7: athrow
      // a8: aload 3
      // a9: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // ac: areturn
   }

   public static void nw2(moh var0) {
      long var1 = a ^ 138868500145147L;
      int var3 = t9d.b();

      moh var10000;
      label20: {
         try {
            var10000 = hih;
            if (var3 == 0) {
               break label20;
            }

            if (hih != null) {
               return;
            }
         } catch (NumberFormatException var4) {
            throw a(var4);
         }

         var10000 = var0;
      }

      hih = var10000;
      uuq = Display.getDesktopDisplayMode();
      long var10001 = 1779844041201671659L ^ var1;
      lxq();
      ReflectorForge.putLaunchBlackboard(a<"r">(1723, var10001), Boolean.TRUE);
   }

   public static void r3t() {
      ils();
      dz3 = hih.bwx;
      ucw();
      tym();
      yhh = Thread.currentThread();
      nt_();
      Shaders.startup(c05.vz1());
   }

   public static void ils() {
      int var0 = t9d.b();

      boolean var10000;
      label34: {
         try {
            var10000 = gp2;
            if (var0 == 0) {
               break label34;
            }

            if (gp2) {
               return;
            }
         } catch (NumberFormatException var2) {
            throw a(var2);
         }

         var10000 = Display.isCreated();
      }

      label26: {
         try {
            if (var0 == 0) {
               break label26;
            }

            if (!var10000) {
               return;
            }
         } catch (NumberFormatException var1) {
            throw a(var1);
         }

         var10000 = true;
      }

      gp2 = var10000;
      fzw();
      t34();
   }

   private static void fzw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hxt.a J
      // 003: ldc2_w 107422296722507
      // 006: lxor
      // 007: lstore 0
      // 008: ldc ""
      // 00a: nop
      // 00b: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 00e: invokestatic t9d.c ()I
      // 011: invokestatic hxt._yw ()Ljava/lang/String;
      // 014: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 017: new java/lang/StringBuilder
      // 01a: dup
      // 01b: invokespecial java/lang/StringBuilder.<init> ()V
      // 01e: sipush 15576
      // 021: ldc2_w 8863127267200534550
      // 024: lload 0
      // 025: lxor
      // 026: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: nop
      // 02c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 02f: invokestatic hxt.cdg ()Ljava/lang/String;
      // 032: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 035: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 038: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 03b: new java/lang/StringBuilder
      // 03e: dup
      // 03f: invokespecial java/lang/StringBuilder.<init> ()V
      // 042: sipush 28695
      // 045: ldc2_w 6855822159035974828
      // 048: lload 0
      // 049: lxor
      // 04a: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: nop
      // 050: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 053: sipush 25377
      // 056: ldc2_w 2878320610535561176
      // 059: lload 0
      // 05a: lxor
      // 05b: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: nop
      // 061: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 064: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 067: sipush 23432
      // 06a: ldc2_w 8503171328050753327
      // 06d: lload 0
      // 06e: lxor
      // 06f: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: nop
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: sipush 5184
      // 07b: ldc2_w 177882040311942
      // 07e: lload 0
      // 07f: lxor
      // 080: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: nop
      // 086: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 089: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08c: sipush 10801
      // 08f: ldc2_w 2014706944037789382
      // 092: lload 0
      // 093: lxor
      // 094: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: nop
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: sipush 865
      // 0a0: ldc2_w 2462722305144567708
      // 0a3: lload 0
      // 0a4: lxor
      // 0a5: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: nop
      // 0ab: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b4: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 0b7: new java/lang/StringBuilder
      // 0ba: dup
      // 0bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0be: sipush 17756
      // 0c1: ldc2_w 8551926238535414186
      // 0c4: lload 0
      // 0c5: lxor
      // 0c6: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: nop
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: sipush 15969
      // 0d2: ldc2_w 395828387035613906
      // 0d5: lload 0
      // 0d6: lxor
      // 0d7: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: nop
      // 0dd: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: sipush 10257
      // 0e6: ldc2_w 5977918503980211371
      // 0e9: lload 0
      // 0ea: lxor
      // 0eb: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: nop
      // 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f4: sipush 9477
      // 0f7: ldc2_w 5633592703583326679
      // 0fa: lload 0
      // 0fb: lxor
      // 0fc: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 105: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 108: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10b: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 10e: new java/lang/StringBuilder
      // 111: dup
      // 112: invokespecial java/lang/StringBuilder.<init> ()V
      // 115: sipush 4029
      // 118: ldc2_w 5850058038886808437
      // 11b: lload 0
      // 11c: lxor
      // 11d: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: nop
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: sipush 15930
      // 129: ldc2_w 5777023981193890435
      // 12c: lload 0
      // 12d: lxor
      // 12e: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: nop
      // 134: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 137: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13a: sipush 6923
      // 13d: ldc2_w 5024680587655622651
      // 140: lload 0
      // 141: lxor
      // 142: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: nop
      // 148: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14b: sipush 2429
      // 14e: ldc2_w 3200318987188419990
      // 151: lload 0
      // 152: lxor
      // 153: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: nop
      // 159: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 15c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15f: sipush 14179
      // 162: ldc2_w 1954199020113298360
      // 165: lload 0
      // 166: lxor
      // 167: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: nop
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: sipush 12100
      // 173: ldc2_w 1845478896377437162
      // 176: lload 0
      // 177: lxor
      // 178: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: nop
      // 17e: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 181: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 184: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 187: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 18a: new java/lang/StringBuilder
      // 18d: dup
      // 18e: invokespecial java/lang/StringBuilder.<init> ()V
      // 191: sipush 32348
      // 194: ldc2_w 4981769914108856975
      // 197: lload 0
      // 198: lxor
      // 199: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: nop
      // 19f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a2: invokestatic org/lwjgl/Sys.getVersion ()Ljava/lang/String;
      // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ab: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 1ae: sipush 7938
      // 1b1: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 1b4: putstatic hxt.pfv Ljava/lang/String;
      // 1b7: sipush 7937
      // 1ba: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 1bd: putstatic hxt.po6 Ljava/lang/String;
      // 1c0: sipush 7936
      // 1c3: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 1c6: putstatic hxt.yt5 Ljava/lang/String;
      // 1c9: new java/lang/StringBuilder
      // 1cc: dup
      // 1cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d0: sipush 16559
      // 1d3: ldc2_w 1869060728514999322
      // 1d6: lload 0
      // 1d7: lxor
      // 1d8: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: nop
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: getstatic hxt.po6 Ljava/lang/String;
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: sipush 31969
      // 1ea: ldc2_w 658712500130007069
      // 1ed: lload 0
      // 1ee: lxor
      // 1ef: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: nop
      // 1f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f8: getstatic hxt.pfv Ljava/lang/String;
      // 1fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fe: sipush 10257
      // 201: ldc2_w 5977918503980211371
      // 204: lload 0
      // 205: lxor
      // 206: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: nop
      // 20c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20f: getstatic hxt.yt5 Ljava/lang/String;
      // 212: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 215: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 218: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 21b: istore 2
      // 21c: new java/lang/StringBuilder
      // 21f: dup
      // 220: invokespecial java/lang/StringBuilder.<init> ()V
      // 223: sipush 1184
      // 226: ldc2_w 163375025493553265
      // 229: lload 0
      // 22a: lxor
      // 22b: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: nop
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: invokestatic hxt.a75 ()Ljava/lang/String;
      // 237: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23d: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 240: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 243: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL12 Z
      // 246: iload 2
      // 247: ifne 271
      // 24a: ifne 265
      // 24d: sipush 23056
      // 250: ldc2_w 2660906772387851944
      // 253: lload 0
      // 254: lxor
      // 255: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: nop
      // 25b: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 25e: goto 265
      // 261: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 264: athrow
      // 265: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 268: getfield org/lwjgl/opengl/ContextCapabilities.GL_NV_fog_distance Z
      // 26b: putstatic hxt.xbu Z
      // 26e: getstatic hxt.xbu Z
      // 271: iload 2
      // 272: ifne 2a3
      // 275: ifne 297
      // 278: goto 27f
      // 27b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27e: athrow
      // 27f: sipush 11315
      // 282: ldc2_w 4809243121828337813
      // 285: lload 0
      // 286: lxor
      // 287: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: nop
      // 28d: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 290: goto 297
      // 293: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 296: athrow
      // 297: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 29a: getfield org/lwjgl/opengl/ContextCapabilities.GL_ARB_occlusion_query Z
      // 29d: putstatic hxt.wzj Z
      // 2a0: getstatic hxt.wzj Z
      // 2a3: iload 2
      // 2a4: ifne 2cc
      // 2a7: ifne 2c9
      // 2aa: goto 2b1
      // 2ad: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b0: athrow
      // 2b1: sipush 14148
      // 2b4: ldc2_w 8950761867121525734
      // 2b7: lload 0
      // 2b8: lxor
      // 2b9: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: nop
      // 2bf: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 2c2: goto 2c9
      // 2c5: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c8: athrow
      // 2c9: invokestatic net/optifine/util/TextureUtils.getGLMaximumTextureSize ()I
      // 2cc: istore 3
      // 2cd: new java/lang/StringBuilder
      // 2d0: dup
      // 2d1: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d4: sipush 24149
      // 2d7: ldc2_w 6535465986593352352
      // 2da: lload 0
      // 2db: lxor
      // 2dc: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: nop
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: iload 3
      // 2e6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2e9: ldc "x"
      // 2eb: nop
      // 2ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ef: iload 3
      // 2f0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2f3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f6: invokestatic hxt.brd (Ljava/lang/String;)V
      // 2f9: return
   }

   public static String cdg() {
      long var0 = a ^ 89365638248064L;
      int var2 = t9d.b();

      try {
         if (var2 == 0) {
            return ykr;
         }

         if (ykr != null) {
            return ykr;
         }
      } catch (Exception var4) {
         throw a(var4);
      }

      try {
         InputStream var3 = hxt.class.getResourceAsStream(a<"r">(16543, 330644169674444454L ^ var0));

         InputStream var7;
         label41: {
            try {
               var7 = var3;
               if (var2 == 0) {
                  break label41;
               }

               if (var3 == null) {
                  return null;
               }
            } catch (Exception var5) {
               throw a(var5);
            }

            var7 = var3;
         }

         ykr = ubf(var7)[0];
      } catch (Exception var6) {
         a2t("" + var6.getClass().getName() + a<"r">(12716, 1304578925832552400L ^ var0) + var6.getMessage());
         ykr = "";
      }

      return ykr;
   }

   public static boolean n0x() {
      return xbu;
   }

   public static boolean tin() {
      return wzj;
   }

   public static int hrc() {
      long var0 = a ^ 2032802258705L;
      int var2 = t9d.b();

      try {
         if (var2 == 0) {
            return bd_;
         }

         if (bd_ >= 0) {
            return bd_;
         }
      } catch (NumberFormatException var8) {
         throw a(var8);
      }

      String[] var3 = l_n(a<"r">(31694, 2503864356810841147L ^ var0), ".");
      int var4 = 0;

      int var9;
      label61: {
         label60: {
            try {
               var9 = var3.length;
               if (var2 == 0) {
                  break label61;
               }

               if (var9 <= 0) {
                  break label60;
               }
            } catch (NumberFormatException var7) {
               throw a(var7);
            }

            var4 += 10000 * koy(var3[0], 0);
         }

         var9 = var3.length;
      }

      label74: {
         byte var10001;
         label51: {
            label50: {
               try {
                  var10001 = 1;
                  if (var2 == 0) {
                     break label51;
                  }

                  if (var9 <= 1) {
                     break label50;
                  }
               } catch (NumberFormatException var6) {
                  throw a(var6);
               }

               var4 += 100 * koy(var3[1], 0);
            }

            try {
               var9 = var3.length;
               if (var2 == 0) {
                  break label74;
               }

               var10001 = 2;
            } catch (NumberFormatException var5) {
               throw a(var5);
            }
         }

         if (var9 > var10001) {
            var4 += 1 * koy(var3[2], 0);
         }

         var9 = var4;
      }

      bd_ = var9;
      return bd_;
   }

   public static String a75() {
      GlVersion var0 = fir();
      return "" + var0.getMajor() + "." + var0.getMinor() + "." + var0.getRelease();
   }

   private static GlVersion v36() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 0
      // 004: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 007: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL44 Z
      // 00a: iload 0
      // 00b: ifeq 02e
      // 00e: ifeq 028
      // 011: goto 018
      // 014: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: new net/optifine/config/GlVersion
      // 01b: dup
      // 01c: bipush 4
      // 01d: bipush 4
      // 01e: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 021: goto 242
      // 024: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 02b: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL43 Z
      // 02e: iload 0
      // 02f: ifeq 052
      // 032: ifeq 04c
      // 035: goto 03c
      // 038: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: new net/optifine/config/GlVersion
      // 03f: dup
      // 040: bipush 4
      // 041: bipush 3
      // 042: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 045: goto 242
      // 048: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 04f: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL42 Z
      // 052: iload 0
      // 053: ifeq 076
      // 056: ifeq 070
      // 059: goto 060
      // 05c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: new net/optifine/config/GlVersion
      // 063: dup
      // 064: bipush 4
      // 065: bipush 2
      // 066: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 069: goto 242
      // 06c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06f: athrow
      // 070: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 073: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL41 Z
      // 076: iload 0
      // 077: ifeq 09a
      // 07a: ifeq 094
      // 07d: goto 084
      // 080: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: new net/optifine/config/GlVersion
      // 087: dup
      // 088: bipush 4
      // 089: bipush 1
      // 08a: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 08d: goto 242
      // 090: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 097: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL40 Z
      // 09a: iload 0
      // 09b: ifeq 0be
      // 09e: ifeq 0b8
      // 0a1: goto 0a8
      // 0a4: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: new net/optifine/config/GlVersion
      // 0ab: dup
      // 0ac: bipush 4
      // 0ad: bipush 0
      // 0ae: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 0b1: goto 242
      // 0b4: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b7: athrow
      // 0b8: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 0bb: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL33 Z
      // 0be: iload 0
      // 0bf: ifeq 0e2
      // 0c2: ifeq 0dc
      // 0c5: goto 0cc
      // 0c8: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0cb: athrow
      // 0cc: new net/optifine/config/GlVersion
      // 0cf: dup
      // 0d0: bipush 3
      // 0d1: bipush 3
      // 0d2: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 0d5: goto 242
      // 0d8: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 0df: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL32 Z
      // 0e2: iload 0
      // 0e3: ifeq 106
      // 0e6: ifeq 100
      // 0e9: goto 0f0
      // 0ec: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ef: athrow
      // 0f0: new net/optifine/config/GlVersion
      // 0f3: dup
      // 0f4: bipush 3
      // 0f5: bipush 2
      // 0f6: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 0f9: goto 242
      // 0fc: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 103: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL31 Z
      // 106: iload 0
      // 107: ifeq 12a
      // 10a: ifeq 124
      // 10d: goto 114
      // 110: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: new net/optifine/config/GlVersion
      // 117: dup
      // 118: bipush 3
      // 119: bipush 1
      // 11a: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 11d: goto 242
      // 120: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 127: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL30 Z
      // 12a: iload 0
      // 12b: ifeq 14e
      // 12e: ifeq 148
      // 131: goto 138
      // 134: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: new net/optifine/config/GlVersion
      // 13b: dup
      // 13c: bipush 3
      // 13d: bipush 0
      // 13e: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 141: goto 242
      // 144: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 147: athrow
      // 148: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 14b: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL21 Z
      // 14e: iload 0
      // 14f: ifeq 172
      // 152: ifeq 16c
      // 155: goto 15c
      // 158: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: new net/optifine/config/GlVersion
      // 15f: dup
      // 160: bipush 2
      // 161: bipush 1
      // 162: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 165: goto 242
      // 168: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 16f: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL20 Z
      // 172: iload 0
      // 173: ifeq 196
      // 176: ifeq 190
      // 179: goto 180
      // 17c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17f: athrow
      // 180: new net/optifine/config/GlVersion
      // 183: dup
      // 184: bipush 2
      // 185: bipush 0
      // 186: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 189: goto 242
      // 18c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18f: athrow
      // 190: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 193: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL15 Z
      // 196: iload 0
      // 197: ifeq 1ba
      // 19a: ifeq 1b4
      // 19d: goto 1a4
      // 1a0: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: new net/optifine/config/GlVersion
      // 1a7: dup
      // 1a8: bipush 1
      // 1a9: bipush 5
      // 1aa: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 1ad: goto 242
      // 1b0: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 1b7: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL14 Z
      // 1ba: iload 0
      // 1bb: ifeq 1de
      // 1be: ifeq 1d8
      // 1c1: goto 1c8
      // 1c4: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c7: athrow
      // 1c8: new net/optifine/config/GlVersion
      // 1cb: dup
      // 1cc: bipush 1
      // 1cd: bipush 4
      // 1ce: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 1d1: goto 242
      // 1d4: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d7: athrow
      // 1d8: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 1db: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL13 Z
      // 1de: iload 0
      // 1df: ifeq 202
      // 1e2: ifeq 1fc
      // 1e5: goto 1ec
      // 1e8: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: new net/optifine/config/GlVersion
      // 1ef: dup
      // 1f0: bipush 1
      // 1f1: bipush 3
      // 1f2: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 1f5: goto 242
      // 1f8: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 1ff: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL12 Z
      // 202: iload 0
      // 203: ifeq 226
      // 206: ifeq 220
      // 209: goto 210
      // 20c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20f: athrow
      // 210: new net/optifine/config/GlVersion
      // 213: dup
      // 214: bipush 1
      // 215: bipush 2
      // 216: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 219: goto 242
      // 21c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21f: athrow
      // 220: invokestatic org/lwjgl/opengl/GLContext.getCapabilities ()Lorg/lwjgl/opengl/ContextCapabilities;
      // 223: getfield org/lwjgl/opengl/ContextCapabilities.OpenGL11 Z
      // 226: ifeq 239
      // 229: new net/optifine/config/GlVersion
      // 22c: dup
      // 22d: bipush 1
      // 22e: bipush 1
      // 22f: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 232: goto 242
      // 235: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 238: athrow
      // 239: new net/optifine/config/GlVersion
      // 23c: dup
      // 23d: bipush 1
      // 23e: bipush 0
      // 23f: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 242: areturn
   }

   public static GlVersion fir() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hmw Lnet/optifine/config/GlVersion;
      // 07: iload 0
      // 08: ifne 6c
      // 0b: ifnonnull 69
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: sipush 7938
      // 18: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 1b: astore 1
      // 1c: aload 1
      // 1d: aconst_null
      // 1e: checkcast net/optifine/config/GlVersion
      // 21: invokestatic hxt.nhq (Ljava/lang/String;Lnet/optifine/config/GlVersion;)Lnet/optifine/config/GlVersion;
      // 24: putstatic hxt.hmw Lnet/optifine/config/GlVersion;
      // 27: getstatic hxt.hmw Lnet/optifine/config/GlVersion;
      // 2a: iload 0
      // 2b: ifne 48
      // 2e: ifnonnull 45
      // 31: goto 38
      // 34: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: invokestatic hxt.v36 ()Lnet/optifine/config/GlVersion;
      // 3b: putstatic hxt.hmw Lnet/optifine/config/GlVersion;
      // 3e: goto 45
      // 41: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: getstatic hxt.hmw Lnet/optifine/config/GlVersion;
      // 48: iload 0
      // 49: ifne 6c
      // 4c: ifnonnull 69
      // 4f: goto 56
      // 52: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: new net/optifine/config/GlVersion
      // 59: dup
      // 5a: bipush 1
      // 5b: bipush 0
      // 5c: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 5f: putstatic hxt.hmw Lnet/optifine/config/GlVersion;
      // 62: goto 69
      // 65: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: getstatic hxt.hmw Lnet/optifine/config/GlVersion;
      // 6c: areturn
   }

   public static GlVersion s2v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.e07 Lnet/optifine/config/GlVersion;
      // 07: iload 0
      // 08: ifeq 4f
      // 0b: ifnonnull 4c
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: ldc 35724
      // 17: nop
      // 18: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 1b: astore 1
      // 1c: aload 1
      // 1d: aconst_null
      // 1e: checkcast net/optifine/config/GlVersion
      // 21: invokestatic hxt.nhq (Ljava/lang/String;Lnet/optifine/config/GlVersion;)Lnet/optifine/config/GlVersion;
      // 24: putstatic hxt.e07 Lnet/optifine/config/GlVersion;
      // 27: getstatic hxt.e07 Lnet/optifine/config/GlVersion;
      // 2a: iload 0
      // 2b: ifeq 4f
      // 2e: ifnonnull 4c
      // 31: goto 38
      // 34: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: new net/optifine/config/GlVersion
      // 3b: dup
      // 3c: bipush 1
      // 3d: bipush 10
      // 3f: invokespecial net/optifine/config/GlVersion.<init> (II)V
      // 42: putstatic hxt.e07 Lnet/optifine/config/GlVersion;
      // 45: goto 4c
      // 48: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: getstatic hxt.e07 Lnet/optifine/config/GlVersion;
      // 4f: areturn
   }

   public static GlVersion nhq(String param0, GlVersion param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 87916404019527
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 2d
      // 13: ifnonnull 1f
      // 16: goto 1d
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 1
      // 1e: areturn
      // 1f: sipush 4755
      // 22: ldc2_w 7645822413109033773
      // 25: lload 2
      // 26: lxor
      // 27: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: nop
      // 2d: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 30: astore 5
      // 32: aload 5
      // 34: aload 0
      // 35: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 38: astore 6
      // 3a: aload 6
      // 3c: invokevirtual java/util/regex/Matcher.matches ()Z
      // 3f: iload 4
      // 41: ifeq 59
      // 44: ifne 50
      // 47: goto 4e
      // 4a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 1
      // 4f: areturn
      // 50: aload 6
      // 52: bipush 1
      // 53: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 56: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 59: istore 7
      // 5b: aload 6
      // 5d: bipush 2
      // 5e: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 61: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 64: istore 8
      // 66: aload 6
      // 68: bipush 4
      // 69: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 6c: iload 4
      // 6e: ifeq 88
      // 71: ifnull 8e
      // 74: goto 7b
      // 77: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: aload 6
      // 7d: bipush 4
      // 7e: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 81: goto 88
      // 84: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 8b: goto 8f
      // 8e: bipush 0
      // 8f: istore 9
      // 91: aload 6
      // 93: bipush 5
      // 94: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 97: astore 10
      // 99: new net/optifine/config/GlVersion
      // 9c: dup
      // 9d: iload 7
      // 9f: iload 8
      // a1: iload 9
      // a3: aload 10
      // a5: invokespecial net/optifine/config/GlVersion.<init> (IIILjava/lang/String;)V
      // a8: areturn
      // a9: astore 5
      // ab: aload 5
      // ad: invokevirtual java/lang/Exception.printStackTrace ()V
      // b0: aload 1
      // b1: areturn
   }

   public static String[] gq8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.die [Ljava/lang/String;
      // 07: iload 0
      // 08: ifne 25
      // 0b: ifnonnull 22
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: invokestatic hxt.q3b ()[Ljava/lang/String;
      // 18: putstatic hxt.die [Ljava/lang/String;
      // 1b: goto 22
      // 1e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: getstatic hxt.die [Ljava/lang/String;
      // 25: areturn
   }

   private static String[] q3b() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.fir ()Lnet/optifine/config/GlVersion;
      // 07: astore 1
      // 08: aload 1
      // 09: invokevirtual net/optifine/config/GlVersion.getMajor ()I
      // 0c: iload 0
      // 0d: ifne 28
      // 10: bipush 3
      // 11: if_icmplt 66
      // 14: goto 1b
      // 17: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: ldc 33309
      // 1d: nop
      // 1e: invokestatic org/lwjgl/opengl/GL11.glGetInteger (I)I
      // 21: goto 28
      // 24: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: istore 2
      // 29: iload 2
      // 2a: iload 0
      // 2b: ifne 39
      // 2e: ifle 66
      // 31: goto 38
      // 34: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: iload 2
      // 39: anewarray 2
      // 3c: astore 3
      // 3d: bipush 0
      // 3e: istore 4
      // 40: iload 4
      // 42: iload 2
      // 43: if_icmpge 64
      // 46: aload 3
      // 47: iload 0
      // 48: ifne 65
      // 4b: iload 4
      // 4d: sipush 7939
      // 50: iload 4
      // 52: invokestatic org/lwjgl/opengl/GL30.glGetStringi (II)Ljava/lang/String;
      // 55: aastore
      // 56: iinc 4 1
      // 59: iload 0
      // 5a: ifeq 40
      // 5d: goto 64
      // 60: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 3
      // 65: areturn
      // 66: goto 6e
      // 69: astore 1
      // 6a: aload 1
      // 6b: invokevirtual java/lang/Exception.printStackTrace ()V
      // 6e: sipush 7939
      // 71: invokestatic org/lwjgl/opengl/GL11.glGetString (I)Ljava/lang/String;
      // 74: astore 1
      // 75: aload 1
      // 76: ldc " "
      // 78: nop
      // 79: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 7c: astore 2
      // 7d: aload 2
      // 7e: areturn
      // 7f: astore 1
      // 80: aload 1
      // 81: invokevirtual java/lang/Exception.printStackTrace ()V
      // 84: bipush 0
      // 85: anewarray 2
      // 88: areturn
   }

   public static void nt_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 6765201697015
      // 06: lxor
      // 07: lstore 0
      // 08: invokestatic t9d.b ()I
      // 0b: istore 2
      // 0c: invokestatic hxt.lxq ()V
      // 0f: bipush 8
      // 11: istore 3
      // 12: iload 2
      // 13: ifeq 88
      // 16: invokestatic hxt.wal ()Z
      // 19: ifeq 79
      // 1c: goto 23
      // 1f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: invokestatic hxt.nib ()Z
      // 26: ifeq 55
      // 29: goto 30
      // 2c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: getstatic hxt.yhh Ljava/lang/Thread;
      // 33: bipush 10
      // 35: invokevirtual java/lang/Thread.setPriority (I)V
      // 38: sipush 2654
      // 3b: ldc2_w 2432343161926146626
      // 3e: lload 0
      // 3f: lxor
      // 40: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: bipush 1
      // 47: invokestatic hxt.epb (Ljava/lang/String;I)V
      // 4a: iload 2
      // 4b: ifne 9a
      // 4e: goto 55
      // 51: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: getstatic hxt.yhh Ljava/lang/Thread;
      // 58: bipush 5
      // 59: invokevirtual java/lang/Thread.setPriority (I)V
      // 5c: sipush 23480
      // 5f: ldc2_w 5296230366532701182
      // 62: lload 0
      // 63: lxor
      // 64: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: bipush 5
      // 6b: invokestatic hxt.epb (Ljava/lang/String;I)V
      // 6e: iload 2
      // 6f: ifne 9a
      // 72: goto 79
      // 75: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: getstatic hxt.yhh Ljava/lang/Thread;
      // 7c: bipush 10
      // 7e: invokevirtual java/lang/Thread.setPriority (I)V
      // 81: goto 88
      // 84: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: sipush 23480
      // 8b: ldc2_w 5296230366532701182
      // 8e: lload 0
      // 8f: lxor
      // 90: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: nop
      // 96: bipush 5
      // 97: invokestatic hxt.epb (Ljava/lang/String;I)V
      // 9a: return
   }

   private static void epb(String param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 42371345886880
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 10: invokevirtual java/lang/Thread.getThreadGroup ()Ljava/lang/ThreadGroup;
      // 13: astore 5
      // 15: aload 5
      // 17: iload 4
      // 19: ifne 29
      // 1c: ifnonnull 27
      // 1f: goto 26
      // 22: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: return
      // 27: aload 5
      // 29: invokevirtual java/lang/ThreadGroup.activeCount ()I
      // 2c: bipush 10
      // 2e: iadd
      // 2f: bipush 2
      // 30: imul
      // 31: istore 6
      // 33: iload 6
      // 35: anewarray 169
      // 38: astore 7
      // 3a: aload 5
      // 3c: aload 7
      // 3e: bipush 0
      // 3f: invokevirtual java/lang/ThreadGroup.enumerate ([Ljava/lang/Thread;Z)I
      // 42: pop
      // 43: bipush 0
      // 44: istore 8
      // 46: iload 8
      // 48: aload 7
      // 4a: arraylength
      // 4b: if_icmpge a6
      // 4e: aload 7
      // 50: iload 8
      // 52: aaload
      // 53: astore 9
      // 55: iload 4
      // 57: ifne dc
      // 5a: iload 4
      // 5c: ifne a1
      // 5f: goto 66
      // 62: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: aload 9
      // 68: ifnull 9e
      // 6b: goto 72
      // 6e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: aload 9
      // 74: iload 4
      // 76: ifne 9a
      // 79: goto 80
      // 7c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: invokevirtual java/lang/Thread.getName ()Ljava/lang/String;
      // 83: aload 0
      // 84: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 87: ifeq 9e
      // 8a: goto 91
      // 8d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: aload 9
      // 93: goto 9a
      // 96: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: iload 1
      // 9b: invokevirtual java/lang/Thread.setPriority (I)V
      // 9e: iinc 8 1
      // a1: iload 4
      // a3: ifeq 46
      // a6: goto dc
      // a9: astore 5
      // ab: new java/lang/StringBuilder
      // ae: dup
      // af: invokespecial java/lang/StringBuilder.<init> ()V
      // b2: aload 5
      // b4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // b7: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bd: sipush 12716
      // c0: ldc2_w 1304562096707463152
      // c3: lload 2
      // c4: lxor
      // c5: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: nop
      // cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ce: aload 5
      // d0: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d9: invokestatic hxt.a2t (Ljava/lang/String;)V
      // dc: return
   }

   public static boolean nzs() {
      try {
         if (Thread.currentThread() == yhh) {
            return true;
         }
      } catch (NumberFormatException var0) {
         throw a(var0);
      }

      return false;
   }

   private static void t34() {
      VersionCheckThread var0 = new VersionCheckThread();
      var0.start();
   }

   public static boolean knk() {
      int var0 = t9d.c();

      try {
         if (var0 != 0) {
            return (boolean)hih.fkx;
         }

         if (hih.fkx > 0) {
            return (boolean)1;
         }
      } catch (NumberFormatException var1) {
         throw a(var1);
      }

      return (boolean)0;
   }

   public static int _u1() {
      return hih.fkx;
   }

   public static int lxd() {
      label33: {
         try {
            switch (hih.ixy) {
               case 0:
                  return 9986;
               case 1:
                  return 9986;
               case 2:
                  break;
               case 3:
                  break label33;
               default:
                  return 9986;
            }
         } catch (NumberFormatException var2) {
            throw a(var2);
         }

         try {
            if (jty()) {
               return 9985;
            }

            return 9986;
         } catch (NumberFormatException var1) {
            throw a(var1);
         }
      }

      try {
         return jty() ? 9987 : 9986;
      } catch (NumberFormatException var0) {
         throw a(var0);
      }
   }

   public static boolean m2h() {
      int var0 = t9d.b();
      float var1 = xli();

      try {
         float var3;
         int var10000 = (var3 = var1 - (dxe + 1.0E-5F)) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
         if (var0 == 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (NumberFormatException var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public static float xli() {
      return dxe;
   }

   public static boolean z2l() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: invokestatic hxt.n0x ()Z
      // 07: iload 0
      // 08: ifeq 23
      // 0b: ifne 1d
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 0
      // 16: goto 3e
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: getstatic hxt.hih Lmoh;
      // 20: getfield moh.ggo I
      // 23: iload 0
      // 24: ifeq 3a
      // 27: bipush 2
      // 28: if_icmpne 3d
      // 2b: goto 32
      // 2e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 3a
      // 36: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public static boolean q34() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.ggo I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 1
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean o2a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.ggo I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 3
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean l76() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.ggo I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 3
      // 0f: if_icmpeq 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static float umt() {
      return hih.h6o;
   }

   public static void yq3(String var0) {
      long var1 = a ^ 63513577976376L;

      try {
         if (s9r) {
            ntb.info(a<"r">(27863, 5971331265153394275L ^ var1) + var0);
         }
      } catch (NumberFormatException var3) {
         throw a(var3);
      }
   }

   public static void brd(String var0) {
      long var1 = a ^ 125817006621470L;
      ntb.info(a<"r">(27863, 5971251422155151173L ^ var1) + var0);
   }

   public static void a2t(String var0) {
      long var1 = a ^ 18662134925897L;
      ntb.warn(a<"r">(19634, 6273653538756984387L ^ var1) + var0);
   }

   public static void ugs(String var0) {
      long var1 = a ^ 117537063926037L;
      ntb.error(a<"r">(27863, 5971277227174096206L ^ var1) + var0);
   }

   public static void t2o(String var0) {
      brd(var0);
   }

   public static int k45() {
      return hih.czj;
   }

   public static boolean t7k() {
      return hih.nk8;
   }

   public static boolean b7f() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.q7m I
      // 0a: iload 0
      // 0b: ifeq 2b
      // 0e: ifne 25
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: getfield moh.i37 Z
      // 1e: goto 46
      // 21: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: getstatic hxt.hih Lmoh;
      // 28: getfield moh.q7m I
      // 2b: iload 0
      // 2c: ifeq 42
      // 2f: bipush 2
      // 30: if_icmpne 45
      // 33: goto 3a
      // 36: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 42
      // 3e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static boolean juu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.q7m I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 3
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean heh() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.cip I
      // 0a: iload 0
      // 0b: ifeq 43
      // 0e: ifeq 40
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: getfield moh.cip I
      // 1e: iload 0
      // 1f: ifeq 3d
      // 22: goto 29
      // 25: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 2
      // 2a: if_icmpne 3c
      // 2d: goto 34
      // 30: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: bipush 1
      // 35: goto ae
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush 0
      // 3d: goto ae
      // 40: invokestatic hxt.ly3 ()Z
      // 43: iload 0
      // 44: ifeq 7c
      // 47: ifeq 79
      // 4a: goto 51
      // 4d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: getstatic net/optifine/shaders/Shaders.shaderPackClouds Lnet/optifine/shaders/config/PropertyDefaultFastFancyOff;
      // 54: invokevirtual net/optifine/shaders/config/PropertyDefaultFastFancyOff.isDefault ()Z
      // 57: iload 0
      // 58: ifeq 7c
      // 5b: goto 62
      // 5e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: ifne 79
      // 65: goto 6c
      // 68: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: getstatic net/optifine/shaders/Shaders.shaderPackClouds Lnet/optifine/shaders/config/PropertyDefaultFastFancyOff;
      // 6f: invokevirtual net/optifine/shaders/config/PropertyDefaultFastFancyOff.isFancy ()Z
      // 72: goto ae
      // 75: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: getstatic hxt.v7d I
      // 7c: iload 0
      // 7d: ifeq 8d
      // 80: ifeq a8
      // 83: goto 8a
      // 86: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: getstatic hxt.v7d I
      // 8d: iload 0
      // 8e: ifeq a5
      // 91: bipush 2
      // 92: if_icmpne a4
      // 95: goto 9c
      // 98: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: bipush 1
      // 9d: goto ae
      // a0: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: bipush 0
      // a5: goto ae
      // a8: getstatic hxt.hih Lmoh;
      // ab: getfield moh.i37 Z
      // ae: ireturn
   }

   public static boolean mdq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.cip I
      // 0a: iload 0
      // 0b: ifne 43
      // 0e: ifeq 40
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: getfield moh.cip I
      // 1e: iload 0
      // 1f: ifne 3d
      // 22: goto 29
      // 25: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 3
      // 2a: if_icmpne 3c
      // 2d: goto 34
      // 30: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: bipush 1
      // 35: goto a9
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush 0
      // 3d: goto a9
      // 40: invokestatic hxt.ly3 ()Z
      // 43: iload 0
      // 44: ifne 7c
      // 47: ifeq 79
      // 4a: goto 51
      // 4d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: getstatic net/optifine/shaders/Shaders.shaderPackClouds Lnet/optifine/shaders/config/PropertyDefaultFastFancyOff;
      // 54: invokevirtual net/optifine/shaders/config/PropertyDefaultFastFancyOff.isDefault ()Z
      // 57: iload 0
      // 58: ifne 7c
      // 5b: goto 62
      // 5e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: ifne 79
      // 65: goto 6c
      // 68: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: getstatic net/optifine/shaders/Shaders.shaderPackClouds Lnet/optifine/shaders/config/PropertyDefaultFastFancyOff;
      // 6f: invokevirtual net/optifine/shaders/config/PropertyDefaultFastFancyOff.isOff ()Z
      // 72: goto a9
      // 75: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 78: athrow
      // 79: getstatic hxt.v7d I
      // 7c: iload 0
      // 7d: ifne 8d
      // 80: ifeq a8
      // 83: goto 8a
      // 86: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 89: athrow
      // 8a: getstatic hxt.v7d I
      // 8d: iload 0
      // 8e: ifne a5
      // 91: bipush 3
      // 92: if_icmpne a4
      // 95: goto 9c
      // 98: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: bipush 1
      // 9d: goto a9
      // a0: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: bipush 0
      // a5: goto a9
      // a8: bipush 0
      // a9: ireturn
   }

   public static void i44() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hxt.a J
      // 003: ldc2_w 56076963903170
      // 006: lxor
      // 007: lstore 0
      // 008: bipush 0
      // 009: putstatic hxt.v7d I
      // 00c: invokestatic t9d.c ()I
      // 00f: invokestatic hxt.q5m ()Ly99;
      // 012: astore 3
      // 013: istore 2
      // 014: aload 3
      // 015: iload 2
      // 016: ifne 024
      // 019: ifnull 132
      // 01c: goto 023
      // 01f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 022: athrow
      // 023: aload 3
      // 024: new gdz
      // 027: dup
      // 028: sipush 11357
      // 02b: ldc2_w 2571577646733926937
      // 02e: lload 0
      // 02f: lxor
      // 030: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 039: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 03e: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 043: astore 4
      // 045: aload 4
      // 047: ifnonnull 04b
      // 04a: return
      // 04b: new net/optifine/util/PropertiesOrdered
      // 04e: dup
      // 04f: invokespecial net/optifine/util/PropertiesOrdered.<init> ()V
      // 052: astore 5
      // 054: aload 5
      // 056: aload 4
      // 058: invokevirtual java/util/Properties.load (Ljava/io/InputStream;)V
      // 05b: aload 4
      // 05d: invokevirtual java/io/InputStream.close ()V
      // 060: aload 5
      // 062: sipush 31658
      // 065: ldc2_w 1761610409413801362
      // 068: lload 0
      // 069: lxor
      // 06a: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: nop
      // 070: invokevirtual java/util/Properties.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 073: astore 6
      // 075: aload 6
      // 077: iload 2
      // 078: ifne 0b2
      // 07b: ifnonnull 086
      // 07e: goto 085
      // 081: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: return
      // 086: new java/lang/StringBuilder
      // 089: dup
      // 08a: invokespecial java/lang/StringBuilder.<init> ()V
      // 08d: sipush 833
      // 090: ldc2_w 2712717561669815564
      // 093: lload 0
      // 094: lxor
      // 095: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: nop
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: aload 6
      // 0a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a6: invokestatic hxt.brd (Ljava/lang/String;)V
      // 0a9: aload 6
      // 0ab: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0ae: astore 6
      // 0b0: aload 6
      // 0b2: sipush 8085
      // 0b5: ldc2_w 8572477825591415262
      // 0b8: lload 0
      // 0b9: lxor
      // 0ba: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: nop
      // 0c0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0c3: iload 2
      // 0c4: ifne 0ef
      // 0c7: ifeq 0dc
      // 0ca: goto 0d1
      // 0cd: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: bipush 1
      // 0d2: putstatic hxt.v7d I
      // 0d5: goto 0dc
      // 0d8: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 6
      // 0de: sipush 11944
      // 0e1: ldc2_w 947589955988234453
      // 0e4: lload 0
      // 0e5: lxor
      // 0e6: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: nop
      // 0ec: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ef: iload 2
      // 0f0: ifne 11b
      // 0f3: ifeq 108
      // 0f6: goto 0fd
      // 0f9: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: bipush 2
      // 0fe: putstatic hxt.v7d I
      // 101: goto 108
      // 104: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 6
      // 10a: sipush 24388
      // 10d: ldc2_w 8817618563243626798
      // 110: lload 0
      // 111: lxor
      // 112: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: nop
      // 118: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 11b: iload 2
      // 11c: ifne 12a
      // 11f: ifeq 12d
      // 122: goto 129
      // 125: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 128: athrow
      // 129: bipush 3
      // 12a: putstatic hxt.v7d I
      // 12d: goto 132
      // 130: astore 4
      // 132: return
   }

   public static v58 l3k() {
      return oq4.jiu().d2b;
   }

   public static boolean hmy() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.bkd I
      // 0a: iload 0
      // 0b: ifne 2b
      // 0e: ifne 25
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: getfield moh.i37 Z
      // 1e: goto 46
      // 21: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: getstatic hxt.hih Lmoh;
      // 28: getfield moh.bkd I
      // 2b: iload 0
      // 2c: ifne 42
      // 2f: bipush 1
      // 30: if_icmpeq 45
      // 33: goto 3a
      // 36: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 42
      // 3e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static boolean vqa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.bkd I
      // 0a: iload 0
      // 0b: ifne 21
      // 0e: bipush 4
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean keq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.bkd I
      // 0a: iload 0
      // 0b: ifne 45
      // 0e: ifne 3f
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: getfield moh.i37 Z
      // 1e: iload 0
      // 1f: ifne 3c
      // 22: goto 29
      // 25: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: ifne 3b
      // 2c: goto 33
      // 2f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 60
      // 37: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: goto 60
      // 3f: getstatic hxt.hih Lmoh;
      // 42: getfield moh.bkd I
      // 45: iload 0
      // 46: ifne 5c
      // 49: bipush 4
      // 4a: if_icmpne 5f
      // 4d: goto 54
      // 50: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: bipush 1
      // 55: goto 5c
      // 58: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: goto 60
      // 5f: bipush 0
      // 60: ireturn
   }

   public static boolean d34() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.p7z I
      // 0a: iload 0
      // 0b: ifeq 2b
      // 0e: ifne 25
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: getfield moh.i37 Z
      // 1e: goto 46
      // 21: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: getstatic hxt.hih Lmoh;
      // 28: getfield moh.p7z I
      // 2b: iload 0
      // 2c: ifeq 42
      // 2f: bipush 2
      // 30: if_icmpne 45
      // 33: goto 3a
      // 36: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 42
      // 3e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static int rut(int var0, int var1, int var2) {
      try {
         if (var0 < var1) {
            return var1;
         }
      } catch (NumberFormatException var4) {
         throw a(var4);
      }

      try {
         if (var0 > var2) {
            return var2;
         }
      } catch (NumberFormatException var3) {
         throw a(var3);
      }

      return var0;
   }

   public static float zkb(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: fload 0
      // 05: fload 1
      // 06: fcmpg
      // 07: iload 3
      // 08: ifeq 2b
      // 0b: ifge 1d
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: fload 1
      // 16: goto 33
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: fload 0
      // 1e: iload 3
      // 1f: ifeq 2f
      // 22: fload 2
      // 23: fcmpl
      // 24: goto 2b
      // 27: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: ifle 32
      // 2e: fload 2
      // 2f: goto 33
      // 32: fload 0
      // 33: freturn
   }

   public static double p2k(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: dload 0
      // 06: dload 2
      // 07: dcmpg
      // 08: iload 6
      // 0a: ifeq 2f
      // 0d: ifge 1f
      // 10: goto 17
      // 13: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: dload 2
      // 18: goto 38
      // 1b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: dload 0
      // 20: iload 6
      // 22: ifeq 34
      // 25: dload 4
      // 27: dcmpl
      // 28: goto 2f
      // 2b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: ifle 37
      // 32: dload 4
      // 34: goto 38
      // 37: dload 0
      // 38: dreturn
   }

   public static float n84(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: fload 0
      // 05: fconst_0
      // 06: fcmpg
      // 07: iload 1
      // 08: ifeq 2b
      // 0b: ifge 1d
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: fconst_0
      // 16: goto 33
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: fload 0
      // 1e: iload 1
      // 1f: ifeq 2f
      // 22: fconst_1
      // 23: fcmpl
      // 24: goto 2b
      // 27: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: ifle 32
      // 2e: fconst_1
      // 2f: goto 33
      // 32: fload 0
      // 33: freturn
   }

   public static boolean prm() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.bdb I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 2
      // 0f: if_icmpeq 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean wnm() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.bdb I
      // 0a: iload 0
      // 0b: ifne 21
      // 0e: bipush 1
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean o4i() {
      return hih.x7p;
   }

   public static boolean gd5() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.hwz I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 2
      // 0f: if_icmpeq 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean aww() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.hwz I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 1
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean tv0() {
      return hih._nt;
   }

   public static boolean g17() {
      return hih.yi7;
   }

   public static boolean ch8() {
      return hih.zvm;
   }

   public static boolean sos() {
      return hih.iuu;
   }

   public static boolean zio() {
      return hih.gqd;
   }

   public static boolean jon() {
      return hih.bhe;
   }

   public static boolean ss5() {
      return hih.c7a;
   }

   public static boolean m9d() {
      return hih.mlq;
   }

   public static boolean _9o() {
      return hih.sab;
   }

   public static boolean aok() {
      return hih.pz2;
   }

   public static boolean s5i() {
      return hih.hsx;
   }

   public static float btr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 0
      // 08: ifne 2c
      // 0b: ifeq 35
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: getstatic net/optifine/shaders/Shaders.aoLevel F
      // 18: iload 0
      // 19: ifne 32
      // 1c: goto 23
      // 1f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: fconst_0
      // 24: fcmpl
      // 25: goto 2c
      // 28: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: iflt 35
      // 2f: getstatic net/optifine/shaders/Shaders.aoLevel F
      // 32: goto 3b
      // 35: getstatic hxt.hih Lmoh;
      // 38: getfield moh.f06 F
      // 3b: freturn
   }

   public static String e_u(List var0) {
      long var1 = a ^ 81881149766237L;
      return j57(var0, a<"r">(10257, 5977964454778219197L ^ var1));
   }

   public static String j57(List param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnonnull 10
      // 08: ldc ""
      // 0a: nop
      // 0b: areturn
      // 0c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: new java/lang/StringBuffer
      // 13: dup
      // 14: aload 0
      // 15: invokeinterface java/util/List.size ()I 1
      // 1a: bipush 5
      // 1b: imul
      // 1c: invokespecial java/lang/StringBuffer.<init> (I)V
      // 1f: astore 3
      // 20: bipush 0
      // 21: istore 4
      // 23: iload 4
      // 25: aload 0
      // 26: invokeinterface java/util/List.size ()I 1
      // 2b: if_icmpge 66
      // 2e: aload 0
      // 2f: iload 4
      // 31: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 36: astore 5
      // 38: iload 2
      // 39: ifeq 62
      // 3c: iload 4
      // 3e: ifle 55
      // 41: goto 48
      // 44: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 3
      // 49: aload 1
      // 4a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 4d: pop
      // 4e: goto 55
      // 51: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 3
      // 56: aload 5
      // 58: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 5b: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 5e: pop
      // 5f: iinc 4 1
      // 62: iload 2
      // 63: ifne 23
      // 66: aload 3
      // 67: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 6a: areturn
   }

   public static String tov(Object[] var0) {
      long var1 = a ^ 70065533934244L;
      return evh(var0, a<"r">(10257, 5977837181650930244L ^ var1));
   }

   public static String evh(Object[] param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnonnull 10
      // 08: ldc ""
      // 0a: nop
      // 0b: areturn
      // 0c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: new java/lang/StringBuffer
      // 13: dup
      // 14: aload 0
      // 15: arraylength
      // 16: bipush 5
      // 17: imul
      // 18: invokespecial java/lang/StringBuffer.<init> (I)V
      // 1b: astore 3
      // 1c: bipush 0
      // 1d: istore 4
      // 1f: iload 4
      // 21: aload 0
      // 22: arraylength
      // 23: if_icmpge 5a
      // 26: aload 0
      // 27: iload 4
      // 29: aaload
      // 2a: astore 5
      // 2c: iload 2
      // 2d: ifne 56
      // 30: iload 4
      // 32: ifle 49
      // 35: goto 3c
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 3
      // 3d: aload 1
      // 3e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 41: pop
      // 42: goto 49
      // 45: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 3
      // 4a: aload 5
      // 4c: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 4f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 52: pop
      // 53: iinc 4 1
      // 56: iload 2
      // 57: ifeq 1f
      // 5a: aload 3
      // 5b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 5e: areturn
   }

   public static String gkh(int[] var0) {
      long var1 = a ^ 71824506716424L;
      return y_k(var0, a<"r">(10257, 5977954376589398504L ^ var1));
   }

   public static String y_k(int[] param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnonnull 10
      // 08: ldc ""
      // 0a: nop
      // 0b: areturn
      // 0c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: new java/lang/StringBuffer
      // 13: dup
      // 14: aload 0
      // 15: arraylength
      // 16: bipush 5
      // 17: imul
      // 18: invokespecial java/lang/StringBuffer.<init> (I)V
      // 1b: astore 3
      // 1c: bipush 0
      // 1d: istore 4
      // 1f: iload 4
      // 21: aload 0
      // 22: arraylength
      // 23: if_icmpge 5a
      // 26: aload 0
      // 27: iload 4
      // 29: iaload
      // 2a: istore 5
      // 2c: iload 2
      // 2d: ifne 56
      // 30: iload 4
      // 32: ifle 49
      // 35: goto 3c
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 3
      // 3d: aload 1
      // 3e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 41: pop
      // 42: goto 49
      // 45: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 3
      // 4a: iload 5
      // 4c: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
      // 4f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 52: pop
      // 53: iinc 4 1
      // 56: iload 2
      // 57: ifeq 1f
      // 5a: aload 3
      // 5b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 5e: areturn
   }

   public static String cf4(float[] var0) {
      long var1 = a ^ 132500335480792L;
      return u27(var0, a<"r">(10257, 5977908406231637816L ^ var1));
   }

   public static String u27(float[] param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnonnull 10
      // 08: ldc ""
      // 0a: nop
      // 0b: areturn
      // 0c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: new java/lang/StringBuffer
      // 13: dup
      // 14: aload 0
      // 15: arraylength
      // 16: bipush 5
      // 17: imul
      // 18: invokespecial java/lang/StringBuffer.<init> (I)V
      // 1b: astore 3
      // 1c: bipush 0
      // 1d: istore 4
      // 1f: iload 4
      // 21: aload 0
      // 22: arraylength
      // 23: if_icmpge 5a
      // 26: aload 0
      // 27: iload 4
      // 29: faload
      // 2a: fstore 5
      // 2c: iload 2
      // 2d: ifeq 56
      // 30: iload 4
      // 32: ifle 49
      // 35: goto 3c
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 3
      // 3d: aload 1
      // 3e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 41: pop
      // 42: goto 49
      // 45: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 3
      // 4a: fload 5
      // 4c: invokestatic java/lang/String.valueOf (F)Ljava/lang/String;
      // 4f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 52: pop
      // 53: iinc 4 1
      // 56: iload 2
      // 57: ifne 1f
      // 5a: aload 3
      // 5b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 5e: areturn
   }

   public static c05 a59() {
      return oq4;
   }

   public static lc5 ibs() {
      return oq4.l22();
   }

   public static y99 q5m() {
      return oq4.mpf();
   }

   public static InputStream cas(gdz var0) {
      return m3b(oq4.mpf(), var0);
   }

   public static InputStream m3b(y99 param0, gdz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 0b: astore 3
      // 0c: aload 3
      // 0d: iload 2
      // 0e: ifne 24
      // 11: ifnonnull 23
      // 14: goto 1b
      // 17: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aconst_null
      // 1c: goto 29
      // 1f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 3
      // 24: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 29: areturn
   }

   public static yaa _is(gdz var0) {
      return oq4.mpf().td5(var0);
   }

   public static boolean _u1(gdz param0) {
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
      // 05: iload 1
      // 06: ifeq 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: invokestatic hxt.ynj (Lgdz;)Lg68;
      // 1d: astore 2
      // 1e: aload 2
      // 1f: ifnull 2a
      // 22: bipush 1
      // 23: goto 2b
      // 26: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
   }

   public static boolean xti(y99 var0, gdz var1) {
      try {
         yaa var2 = var0.td5(var1);

         try {
            if (var2 != null) {
               return true;
            }
         } catch (IOException var3) {
            throw a(var3);
         }

         return false;
      } catch (IOException var4) {
         return false;
      }
   }

   public static g68[] j3z() {
      w69 var1 = oq4.h3p();
      int var10000 = t9d.c();
      List var2 = var1.i4p();
      int var0 = var10000;
      ArrayList var3 = new ArrayList();
      Iterator var4 = var2.iterator();

      while (true) {
         if (var4.hasNext()) {
            w69$s0z var5 = (w69$s0z)var4.next();

            try {
               var3.add(var5.sdn());
               if (var0 != 0) {
                  break;
               }

               if (var0 == 0) {
                  continue;
               }
            } catch (NumberFormatException var7) {
               throw a(var7);
            }
         }

         try {
            if (var1.v2j() != null) {
               var3.add(var1.v2j());
            }
            break;
         } catch (NumberFormatException var6) {
            throw a(var6);
         }
      }

      return var3.toArray(new g68[var3.size()]);
   }

   public static String vx3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.oq4 Lc05;
      // 07: invokevirtual c05.h3p ()Lw69;
      // 0a: ifnonnull 15
      // 0d: ldc ""
      // 0f: nop
      // 10: areturn
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: invokestatic hxt.j3z ()[Lg68;
      // 18: astore 1
      // 19: aload 1
      // 1a: arraylength
      // 1b: iload 0
      // 1c: ifeq 36
      // 1f: ifgt 34
      // 22: goto 29
      // 25: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: invokestatic hxt.bif ()Lity;
      // 2c: invokevirtual ity.qw5 ()Ljava/lang/String;
      // 2f: areturn
      // 30: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 1
      // 35: arraylength
      // 36: anewarray 2
      // 39: astore 2
      // 3a: bipush 0
      // 3b: istore 3
      // 3c: iload 3
      // 3d: aload 1
      // 3e: arraylength
      // 3f: if_icmpge 5f
      // 42: aload 2
      // 43: iload 0
      // 44: ifeq 63
      // 47: iload 3
      // 48: aload 1
      // 49: iload 3
      // 4a: aaload
      // 4b: invokeinterface g68.qw5 ()Ljava/lang/String; 1
      // 50: aastore
      // 51: iinc 3 1
      // 54: iload 0
      // 55: ifne 3c
      // 58: goto 5f
      // 5b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 2
      // 60: checkcast [Ljava/lang/Object;
      // 63: invokestatic hxt.tov ([Ljava/lang/Object;)Ljava/lang/String;
      // 66: astore 3
      // 67: aload 3
      // 68: areturn
   }

   public static ity bif() {
      int var0 = t9d.c();

      try {
         if (var0 != 0) {
            return y8h;
         }

         if (y8h != null) {
            return y8h;
         }
      } catch (NumberFormatException var5) {
         throw a(var5);
      }

      c05 var1 = c05.vz1();

      try {
         y8h = (ity)Reflector.getFieldValue(var1, Reflector.Minecraft_defaultResourcePack);
         if (var0 != 0) {
            return y8h;
         }

         if (y8h != null) {
            return y8h;
         }
      } catch (NumberFormatException var4) {
         throw a(var4);
      }

      w69 var2 = var1.h3p();

      w69 var6;
      label36: {
         try {
            var6 = var2;
            if (var0 != 0) {
               break label36;
            }

            if (var2 == null) {
               return y8h;
            }
         } catch (NumberFormatException var3) {
            throw a(var3);
         }

         var6 = var2;
      }

      y8h = (ity)var6.zkg;
      return y8h;
   }

   public static boolean nmr(gdz var0) {
      g68 var1 = ynj(var0);

      try {
         if (var1 == bif()) {
            return true;
         }
      } catch (NumberFormatException var2) {
         throw a(var2);
      }

      return false;
   }

   public static g68 ynj(gdz param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.oq4 Lc05;
      // 03: invokevirtual c05.h3p ()Lw69;
      // 06: astore 2
      // 07: invokestatic t9d.b ()I
      // 0a: aload 2
      // 0b: invokevirtual w69.v2j ()Lg68;
      // 0e: astore 3
      // 0f: istore 1
      // 10: aload 3
      // 11: iload 1
      // 12: ifeq 20
      // 15: ifnull 3d
      // 18: goto 1f
      // 1b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 3
      // 20: iload 1
      // 21: ifeq 3c
      // 24: aload 0
      // 25: invokeinterface g68.g1w (Lgdz;)Z 2
      // 2a: ifeq 3d
      // 2d: goto 34
      // 30: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: aload 3
      // 35: goto 3c
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: areturn
      // 3d: aload 2
      // 3e: getfield w69.fql Ljava/util/List;
      // 41: astore 4
      // 43: aload 4
      // 45: invokeinterface java/util/List.size ()I 1
      // 4a: bipush 1
      // 4b: isub
      // 4c: istore 5
      // 4e: iload 5
      // 50: iflt 97
      // 53: aload 4
      // 55: iload 5
      // 57: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5c: checkcast w69$s0z
      // 5f: astore 6
      // 61: aload 6
      // 63: invokevirtual w69$s0z.sdn ()Lg68;
      // 66: astore 7
      // 68: iload 1
      // 69: ifeq 93
      // 6c: aload 7
      // 6e: aload 0
      // 6f: invokeinterface g68.g1w (Lgdz;)Z 2
      // 74: iload 1
      // 75: ifeq a9
      // 78: goto 7f
      // 7b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: ifeq 90
      // 82: goto 89
      // 85: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: aload 7
      // 8b: areturn
      // 8c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8f: athrow
      // 90: iinc 5 -1
      // 93: iload 1
      // 94: ifne 4e
      // 97: invokestatic hxt.bif ()Lity;
      // 9a: iload 1
      // 9b: ifeq af
      // 9e: aload 0
      // 9f: invokevirtual ity.g1w (Lgdz;)Z
      // a2: goto a9
      // a5: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8: athrow
      // a9: ifeq b0
      // ac: invokestatic hxt.bif ()Lity;
      // af: areturn
      // b0: aconst_null
      // b1: areturn
   }

   public static crp hm6() {
      return oq4.vsl;
   }

   public static boolean vbi() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.jz4 I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 3
      // 0f: if_icmpeq 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean gm1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.jz4 I
      // 0a: iload 0
      // 0b: ifne 21
      // 0e: bipush 2
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean pay() {
      return hih._6h;
   }

   public static boolean imn() {
      return hih.q5m;
   }

   public static boolean kbg() {
      return hih.f0b;
   }

   public static boolean p9a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.kbg ()Z
      // 07: iload 0
      // 08: ifne 20
      // 0b: ifne 1d
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 0
      // 16: goto 4b
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: invokestatic hxt.ly3 ()Z
      // 20: iload 0
      // 21: ifne 47
      // 24: ifeq 46
      // 27: goto 2e
      // 2a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: invokestatic net/optifine/shaders/Shaders.isSun ()Z
      // 31: iload 0
      // 32: ifne 47
      // 35: goto 3c
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: ifeq 4a
      // 3f: goto 46
      // 42: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   public static boolean jt1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.kbg ()Z
      // 07: iload 0
      // 08: ifne 20
      // 0b: ifne 1d
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 0
      // 16: goto 4b
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: invokestatic hxt.ly3 ()Z
      // 20: iload 0
      // 21: ifne 47
      // 24: ifeq 46
      // 27: goto 2e
      // 2a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: invokestatic net/optifine/shaders/Shaders.isMoon ()Z
      // 31: iload 0
      // 32: ifne 47
      // 35: goto 3c
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: ifeq 4a
      // 3f: goto 46
      // 42: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: bipush 0
      // 4b: ireturn
   }

   public static boolean zb6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 0
      // 08: ifeq 3b
      // 0b: ifeq 35
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: invokestatic net/optifine/shaders/Shaders.isVignette ()Z
      // 18: iload 0
      // 19: ifeq 3b
      // 1c: goto 23
      // 1f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: ifne 35
      // 26: goto 2d
      // 29: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: goto 77
      // 31: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: getstatic hxt.hih Lmoh;
      // 38: getfield moh.o4h I
      // 3b: iload 0
      // 3c: ifeq 5c
      // 3f: ifne 56
      // 42: goto 49
      // 45: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: getstatic hxt.hih Lmoh;
      // 4c: getfield moh.i37 Z
      // 4f: goto 77
      // 52: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: getstatic hxt.hih Lmoh;
      // 59: getfield moh.o4h I
      // 5c: iload 0
      // 5d: ifeq 73
      // 60: bipush 2
      // 61: if_icmpne 76
      // 64: goto 6b
      // 67: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: bipush 1
      // 6c: goto 73
      // 6f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: goto 77
      // 76: bipush 0
      // 77: ireturn
   }

   public static boolean ose() {
      return hih.ibs;
   }

   public static void evm(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }
   }

   public static boolean c_7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.vcf I
      // 0a: iload 0
      // 0b: ifne 21
      // 0e: bipush 1
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean w4e() {
      int var0 = t9d.b();

      try {
         if (var0 == 0) {
            return (boolean)hih.vcf;
         }

         if (hih.vcf == 0) {
            return (boolean)1;
         }
      } catch (NumberFormatException var1) {
         throw a(var1);
      }

      return (boolean)0;
   }

   public static boolean m4q() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.vcf I
      // 0a: iload 0
      // 0b: ifne 21
      // 0e: bipush 2
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean uof() {
      return hih.tkp;
   }

   public static int ndl() {
      return hih.vby;
   }

   public static boolean y_u() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.ndl ()I
      // 07: iload 0
      // 08: ifne 1e
      // 0b: bipush 1
      // 0c: if_icmple 21
      // 0f: goto 16
      // 12: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1e
      // 1a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: goto 22
      // 21: bipush 0
      // 22: ireturn
   }

   public static int i9q() {
      return dz3;
   }

   public static boolean b4a() {
      int var0 = t9d.b();

      try {
         int var10000 = i9q();
         if (var0 == 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (NumberFormatException var1) {
         throw a(var1);
      }

      return (boolean)0;
   }

   public static boolean yfx() {
      int var0 = t9d.c();

      try {
         int var10000 = d9p().bwx;
         if (var0 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (NumberFormatException var1) {
         throw a(var1);
      }

      return (boolean)0;
   }

   public static boolean jty() {
      try {
         if (ndl() > 1) {
            return true;
         }
      } catch (NumberFormatException var1) {
         throw a(var1);
      }

      try {
         if (i9q() > 0) {
            return true;
         }
      } catch (NumberFormatException var0) {
         throw a(var0);
      }

      return false;
   }

   public static boolean yqp(int param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 0
      // 05: iload 1
      // 06: iload 3
      // 07: ifeq 28
      // 0a: if_icmplt 2f
      // 0d: goto 14
      // 10: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: iload 0
      // 15: iload 3
      // 16: ifeq 2c
      // 19: goto 20
      // 1c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: iload 2
      // 21: goto 28
      // 24: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: if_icmpgt 2f
      // 2b: bipush 1
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }

   public static boolean sfi(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: fload 0
      // 05: fload 1
      // 06: fcmpl
      // 07: iload 3
      // 08: ifeq 1f
      // 0b: iflt 31
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: fload 0
      // 16: fload 2
      // 17: fcmpg
      // 18: goto 1f
      // 1b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: iload 3
      // 20: ifeq 2e
      // 23: ifgt 31
      // 26: goto 2d
      // 29: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: bipush 1
      // 2e: goto 32
      // 31: bipush 0
      // 32: ireturn
   }

   public static boolean dhi() {
      return hih.n7r;
   }

   public static boolean h9k() {
      return hih.rap;
   }

   public static Dimension zfk() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 45049698793678
      // 06: lxor
      // 07: lstore 0
      // 08: invokestatic t9d.b ()I
      // 0b: istore 2
      // 0c: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 0f: ifnonnull 18
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: iload 2
      // 1c: ifeq 44
      // 1f: ifnonnull 41
      // 22: goto 29
      // 25: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: new java/awt/Dimension
      // 2c: dup
      // 2d: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 30: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 33: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 36: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 39: invokespecial java/awt/Dimension.<init> (II)V
      // 3c: areturn
      // 3d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: getstatic hxt.hih Lmoh;
      // 44: getfield moh.vk4 Ljava/lang/String;
      // 47: astore 3
      // 48: aload 3
      // 49: sipush 26578
      // 4c: ldc2_w 5489560552475076503
      // 4f: lload 0
      // 50: lxor
      // 51: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: nop
      // 57: iload 2
      // 58: ifeq 8f
      // 5b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5e: ifeq 80
      // 61: goto 68
      // 64: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: new java/awt/Dimension
      // 6b: dup
      // 6c: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 6f: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 72: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 75: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 78: invokespecial java/awt/Dimension.<init> (II)V
      // 7b: areturn
      // 7c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 3
      // 81: sipush 9864
      // 84: ldc2_w 6585914586751526617
      // 87: lload 0
      // 88: lxor
      // 89: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: invokestatic hxt.l_n (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
      // 92: astore 4
      // 94: aload 4
      // 96: arraylength
      // 97: bipush 2
      // 98: if_icmpge b5
      // 9b: new java/awt/Dimension
      // 9e: dup
      // 9f: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // a2: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // a5: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // a8: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // ab: invokespecial java/awt/Dimension.<init> (II)V
      // ae: goto cc
      // b1: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b4: athrow
      // b5: new java/awt/Dimension
      // b8: dup
      // b9: aload 4
      // bb: bipush 0
      // bc: aaload
      // bd: bipush -1
      // be: invokestatic hxt.koy (Ljava/lang/String;I)I
      // c1: aload 4
      // c3: bipush 1
      // c4: aaload
      // c5: bipush -1
      // c6: invokestatic hxt.koy (Ljava/lang/String;I)I
      // c9: invokespecial java/awt/Dimension.<init> (II)V
      // cc: areturn
   }

   public static int koy(String var0, int var1) {
      int var2 = t9d.b();

      try {
         try {
            if (var2 == 0) {
               return Integer.parseInt(var0);
            }

            if (var0 == null) {
               return var1;
            }
         } catch (NumberFormatException var4) {
            throw a(var4);
         }

         var0 = var0.trim();
         return Integer.parseInt(var0);
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static float gkv(String var0, float var1) {
      int var2 = t9d.c();

      try {
         try {
            if (var2 != 0) {
               return Float.parseFloat(var0);
            }

            if (var0 == null) {
               return var1;
            }
         } catch (NumberFormatException var4) {
            throw a(var4);
         }

         var0 = var0.trim();
         return Float.parseFloat(var0);
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static boolean kyn(String var0, boolean var1) {
      int var2 = t9d.b();

      try {
         try {
            if (var2 == 0) {
               return Boolean.parseBoolean(var0);
            }

            if (var0 == null) {
               return var1;
            }
         } catch (NumberFormatException var4) {
            throw a(var4);
         }

         var0 = var0.trim();
         return Boolean.parseBoolean(var0);
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static Boolean r22(String param0, Boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 34160240203941
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 28
      // 13: ifnonnull 1f
      // 16: goto 1d
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 1
      // 1e: areturn
      // 1f: aload 0
      // 20: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 23: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 26: astore 0
      // 27: aload 0
      // 28: sipush 21025
      // 2b: ldc2_w 2017832465408209433
      // 2e: lload 2
      // 2f: lxor
      // 30: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 39: iload 4
      // 3b: ifeq 64
      // 3e: ifeq 52
      // 41: goto 48
      // 44: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 4b: goto 72
      // 4e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: aload 0
      // 53: sipush 21996
      // 56: ldc2_w 4939582588243981818
      // 59: lload 2
      // 5a: lxor
      // 5b: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 64: ifeq 71
      // 67: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 6a: goto 72
      // 6d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: aload 1
      // 72: areturn
      // 73: astore 5
      // 75: aload 1
      // 76: areturn
   }

   public static String[] l_n(String var0, String var1) {
      StringTokenizer var3 = new StringTokenizer(var0, var1);
      int var10000 = t9d.b();
      ArrayList var4 = new ArrayList();
      int var2 = var10000;

      while (true) {
         if (var3.hasMoreTokens()) {
            String var5 = var3.nextToken();

            try {
               var7 = var4;
               if (var2 == 0) {
                  break;
               }

               var4.add(var5);
               if (var2 != 0) {
                  continue;
               }
            } catch (NumberFormatException var6) {
               throw a(var6);
            }
         }

         var7 = var4;
         break;
      }

      return var7.toArray(new String[var4.size()]);
   }

   public static DisplayMode azc() {
      return uuq;
   }

   public static DisplayMode[] aw_() {
      if (jfb == null) {
         try {
            DisplayMode[] var0 = Display.getAvailableDisplayModes();
            Set var1 = ljh(var0);
            ArrayList var2 = new ArrayList();

            for (Dimension var4 : var1) {
               DisplayMode[] var5 = ycf(var0, var4);
               DisplayMode var6 = n17(var5, uuq);

               try {
                  if (var6 != null) {
                     var2.add(var6);
                  }
               } catch (Exception var7) {
                  throw a(var7);
               }
            }

            DisplayMode[] var9 = var2.toArray(new DisplayMode[var2.size()]);
            Arrays.sort(var9, new DisplayModeComparator());
            return var9;
         } catch (Exception var8) {
            var8.printStackTrace();
            jfb = new DisplayMode[]{uuq};
         }
      }

      return jfb;
   }

   public static DisplayMode u26() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.aw_ ()[Lorg/lwjgl/opengl/DisplayMode;
      // 07: astore 1
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 18
      // 0d: ifnull 97
      // 10: goto 17
      // 13: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 1
      // 18: iload 0
      // 19: ifne 30
      // 1c: arraylength
      // 1d: bipush 1
      // 1e: if_icmplt 97
      // 21: goto 28
      // 24: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: goto 30
      // 2c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 1
      // 31: arraylength
      // 32: bipush 1
      // 33: isub
      // 34: aaload
      // 35: astore 2
      // 36: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 39: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 3c: aload 2
      // 3d: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 40: iload 0
      // 41: ifne 62
      // 44: if_icmple 58
      // 47: goto 4e
      // 4a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 51: goto 96
      // 54: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 5b: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 5e: aload 2
      // 5f: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 62: iload 0
      // 63: ifne 8c
      // 66: if_icmpne 95
      // 69: goto 70
      // 6c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 73: iload 0
      // 74: ifne 92
      // 77: goto 7e
      // 7a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 81: aload 2
      // 82: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 85: goto 8c
      // 88: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8b: athrow
      // 8c: if_icmple 95
      // 8f: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 92: goto 96
      // 95: aload 2
      // 96: areturn
      // 97: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 9a: areturn
   }

   private static Set ljh(DisplayMode[] var0) {
      HashSet var1 = new HashSet();

      for (int var2 = 0; var2 < var0.length; var2++) {
         DisplayMode var3 = var0[var2];
         Dimension var4 = new Dimension(var3.getWidth(), var3.getHeight());
         var1.add(var4);
      }

      return var1;
   }

   private static DisplayMode[] ycf(DisplayMode[] param0, Dimension param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 2
      // 08: bipush 0
      // 09: istore 3
      // 0a: iload 3
      // 0b: aload 0
      // 0c: arraylength
      // 0d: if_icmpge 4e
      // 10: aload 0
      // 11: iload 3
      // 12: aaload
      // 13: astore 4
      // 15: aload 4
      // 17: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 1a: i2d
      // 1b: aload 1
      // 1c: invokevirtual java/awt/Dimension.getWidth ()D
      // 1f: dcmpl
      // 20: ifne 48
      // 23: aload 4
      // 25: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 28: i2d
      // 29: aload 1
      // 2a: invokevirtual java/awt/Dimension.getHeight ()D
      // 2d: dcmpl
      // 2e: ifne 48
      // 31: goto 38
      // 34: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 2
      // 39: aload 4
      // 3b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 40: pop
      // 41: goto 48
      // 44: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: iinc 3 1
      // 4b: goto 0a
      // 4e: aload 2
      // 4f: aload 2
      // 50: invokeinterface java/util/List.size ()I 1
      // 55: anewarray 964
      // 58: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 5d: checkcast [Lorg/lwjgl/opengl/DisplayMode;
      // 60: checkcast [Lorg/lwjgl/opengl/DisplayMode;
      // 63: checkcast [Lorg/lwjgl/opengl/DisplayMode;
      // 66: astore 3
      // 67: aload 3
      // 68: areturn
   }

   private static DisplayMode n17(DisplayMode[] param0, DisplayMode param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 39
      // 04: bipush 0
      // 05: istore 2
      // 06: iload 2
      // 07: aload 0
      // 08: arraylength
      // 09: if_icmpge 39
      // 0c: aload 0
      // 0d: iload 2
      // 0e: aaload
      // 0f: astore 3
      // 10: aload 3
      // 11: invokevirtual org/lwjgl/opengl/DisplayMode.getBitsPerPixel ()I
      // 14: aload 1
      // 15: invokevirtual org/lwjgl/opengl/DisplayMode.getBitsPerPixel ()I
      // 18: if_icmpne 33
      // 1b: aload 3
      // 1c: invokevirtual org/lwjgl/opengl/DisplayMode.getFrequency ()I
      // 1f: aload 1
      // 20: invokevirtual org/lwjgl/opengl/DisplayMode.getFrequency ()I
      // 23: if_icmpne 33
      // 26: goto 2d
      // 29: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 3
      // 2e: areturn
      // 2f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: iinc 2 1
      // 36: goto 06
      // 39: aload 0
      // 3a: arraylength
      // 3b: ifgt 44
      // 3e: aconst_null
      // 3f: areturn
      // 40: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: aload 0
      // 45: new net/optifine/util/DisplayModeComparator
      // 48: dup
      // 49: invokespecial net/optifine/util/DisplayModeComparator.<init> ()V
      // 4c: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;Ljava/util/Comparator;)V
      // 4f: aload 0
      // 50: aload 0
      // 51: arraylength
      // 52: bipush 1
      // 53: isub
      // 54: aaload
      // 55: areturn
   }

   public static String[] noe() {
      DisplayMode[] var1 = aw_();
      String[] var2 = new String[var1.length];
      int var10000 = t9d.c();
      int var3 = 0;
      int var0 = var10000;

      while (true) {
         if (var3 < var1.length) {
            DisplayMode var4 = var1[var3];
            String var5 = "" + var4.getWidth() + "x" + var4.getHeight();

            try {
               var7 = var2;
               if (var0 != 0) {
                  break;
               }

               var2[var3] = var5;
               var3++;
               if (var0 == 0) {
                  continue;
               }
            } catch (NumberFormatException var6) {
               throw a(var6);
            }
         }

         var7 = var2;
         break;
      }

      return var7;
   }

   public static DisplayMode bol(Dimension param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic hxt.aw_ ()[Lorg/lwjgl/opengl/DisplayMode;
      // 03: astore 2
      // 04: invokestatic t9d.b ()I
      // 07: bipush 0
      // 08: istore 3
      // 09: istore 1
      // 0a: iload 3
      // 0b: aload 2
      // 0c: arraylength
      // 0d: if_icmpge 66
      // 10: aload 2
      // 11: iload 3
      // 12: aaload
      // 13: astore 4
      // 15: iload 1
      // 16: ifeq 62
      // 19: aload 4
      // 1b: iload 1
      // 1c: ifeq 69
      // 1f: goto 26
      // 22: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 29: aload 0
      // 2a: getfield java/awt/Dimension.width I
      // 2d: if_icmpne 5f
      // 30: goto 37
      // 33: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 4
      // 39: iload 1
      // 3a: ifeq 5e
      // 3d: goto 44
      // 40: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 47: aload 0
      // 48: getfield java/awt/Dimension.height I
      // 4b: if_icmpne 5f
      // 4e: goto 55
      // 51: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 4
      // 57: goto 5e
      // 5a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: areturn
      // 5f: iinc 3 1
      // 62: iload 1
      // 63: ifne 0a
      // 66: getstatic hxt.uuq Lorg/lwjgl/opengl/DisplayMode;
      // 69: areturn
   }

   public static boolean ym4() {
      return hih.o13;
   }

   public static boolean pcv() {
      return hih.e2o;
   }

   public static boolean oou() {
      return hih.ww9;
   }

   public static boolean rj1() {
      return hih.jln;
   }

   public static void xea(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 11295146973492
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: invokestatic hzu.rzm ()I
      // 0f: istore 4
      // 11: iload 4
      // 13: iload 3
      // 14: ifne 2d
      // 17: ifeq e9
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: iload 4
      // 23: invokestatic net/optifine/GlErrors.isEnabled (I)Z
      // 26: goto 2d
      // 29: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: iload 3
      // 2e: ifne 3d
      // 31: ifeq e9
      // 34: goto 3b
      // 37: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: iload 4
      // 3d: invokestatic hxt.de_ (I)Ljava/lang/String;
      // 40: astore 5
      // 42: sipush 736
      // 45: ldc2_w 7092305304448590682
      // 48: lload 1
      // 49: lxor
      // 4a: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: nop
      // 50: bipush 3
      // 51: anewarray 27
      // 54: dup
      // 55: bipush 0
      // 56: iload 4
      // 58: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5b: aastore
      // 5c: dup
      // 5d: bipush 1
      // 5e: aload 5
      // 60: aastore
      // 61: dup
      // 62: bipush 2
      // 63: aload 0
      // 64: aastore
      // 65: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 68: astore 6
      // 6a: aload 6
      // 6c: invokestatic hxt.ugs (Ljava/lang/String;)V
      // 6f: invokestatic hxt.lkm ()Z
      // 72: iload 3
      // 73: ifne a6
      // 76: ifeq e9
      // 79: goto 80
      // 7c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: sipush 3836
      // 83: ldc2_w 5359949169835765618
      // 86: lload 1
      // 87: lxor
      // 88: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: nop
      // 8e: iload 3
      // 8f: ifne d2
      // 92: goto 99
      // 95: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 98: athrow
      // 99: ldc2_w 10000
      // 9c: invokestatic net/optifine/util/TimedEvent.isActive (Ljava/lang/String;J)Z
      // 9f: goto a6
      // a2: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: ifeq e9
      // a9: sipush 20334
      // ac: ldc2_w 7098739329031483102
      // af: lload 1
      // b0: lxor
      // b1: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: nop
      // b7: bipush 2
      // b8: anewarray 27
      // bb: dup
      // bc: bipush 0
      // bd: iload 4
      // bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c2: aastore
      // c3: dup
      // c4: bipush 1
      // c5: aload 5
      // c7: aastore
      // c8: invokestatic fc1.gx1 (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // cb: goto d2
      // ce: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d1: athrow
      // d2: astore 7
      // d4: getstatic hxt.oq4 Lc05;
      // d7: getfield c05.t43 Ld1f;
      // da: invokevirtual d1f.lcg ()Lsxg;
      // dd: new tao
      // e0: dup
      // e1: aload 7
      // e3: invokespecial tao.<init> (Ljava/lang/String;)V
      // e6: invokevirtual sxg.obg (Lekw;)V
      // e9: return
   }

   public static boolean uq7() {
      return hih.gfx;
   }

   public static boolean xe2() {
      return hih._vf;
   }

   public static boolean xtx() {
      return hih.b3f;
   }

   public static boolean _9w() {
      return hih.mr2;
   }

   public static boolean fxq() {
      return hih.hvu;
   }

   public static boolean ar5() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.eka I
      // 0a: iload 0
      // 0b: ifne 21
      // 0e: bipush 3
      // 0f: if_icmpeq 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean krs() {
      return hih.fh4;
   }

   public static boolean d8v() {
      return hih.k8p;
   }

   public static boolean e6x() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.eka I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 2
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean veb() {
      return hih.zgf;
   }

   public static boolean ynp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.urf I
      // 0a: iload 0
      // 0b: ifne 2b
      // 0e: ifne 25
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: getstatic hxt.hih Lmoh;
      // 1b: getfield moh.i37 Z
      // 1e: goto 46
      // 21: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: getstatic hxt.hih Lmoh;
      // 28: getfield moh.urf I
      // 2b: iload 0
      // 2c: ifne 42
      // 2f: bipush 2
      // 30: if_icmpne 45
      // 33: goto 3a
      // 36: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 42
      // 3e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   public static boolean ly3() {
      return Shaders.shaderPackLoaded;
   }

   public static String[] m94(File var0) {
      FileInputStream var1 = new FileInputStream(var0);
      return ubf(var1);
   }

   public static String[] ubf(InputStream var0) {
      long var1 = a ^ 43136881543800L;
      ArrayList var4 = new ArrayList();
      int var10000 = t9d.c();
      InputStreamReader var5 = new InputStreamReader(var0, a<"r">(1203, 8536982854431585880L ^ var1));
      int var3 = var10000;
      BufferedReader var6 = new BufferedReader(var5);

      while (true) {
         String var7 = var6.readLine();
         if (var7 == null) {
            String[] var8 = var4.toArray(new String[var4.size()]);

            try {
               if (var3 == 0) {
                  return var8;
               }
            } catch (NumberFormatException var9) {
               throw a(var9);
            }
         } else {
            var4.add(var7);
         }
      }
   }

   public static String pds(File var0) {
      long var1 = a ^ 53790114793721L;
      FileInputStream var3 = new FileInputStream(var0);
      return vxt(var3, a<"r">(16371, 2325736929662603263L ^ var1));
   }

   public static String yeq(InputStream var0) {
      long var1 = a ^ 51659744085022L;
      return vxt(var0, a<"r">(16371, 2325743595385078552L ^ var1));
   }

   public static String vxt(InputStream param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/io/InputStreamReader
      // 03: dup
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 09: astore 3
      // 0a: invokestatic t9d.b ()I
      // 0d: new java/io/BufferedReader
      // 10: dup
      // 11: aload 3
      // 12: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 15: astore 4
      // 17: istore 2
      // 18: new java/lang/StringBuffer
      // 1b: dup
      // 1c: invokespecial java/lang/StringBuffer.<init> ()V
      // 1f: astore 5
      // 21: aload 4
      // 23: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 26: astore 6
      // 28: aload 6
      // 2a: ifnonnull 42
      // 2d: aload 5
      // 2f: iload 2
      // 30: ifeq 52
      // 33: goto 3a
      // 36: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 3d: areturn
      // 3e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 5
      // 44: aload 6
      // 46: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 49: pop
      // 4a: aload 5
      // 4c: ldc "\n"
      // 4e: nop
      // 4f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 52: pop
      // 53: goto 21
   }

   public static byte[] d2_(InputStream var0) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      int var10000 = t9d.c();
      byte[] var3 = new byte[1024];
      int var1 = var10000;

      while (true) {
         int var4 = var0.read(var3);
         if (var4 < 0) {
            var0.close();
            byte[] var5 = var2.toByteArray();

            try {
               if (var1 == 0) {
                  return var5;
               }
            } catch (NumberFormatException var6) {
               throw a(var6);
            }
         } else {
            var2.write(var3, 0, var4);
         }
      }
   }

   public static moh d9p() {
      return hih;
   }

   public static String ilk() {
      return ctr;
   }

   public static void g6z(String var0) {
      ctr = var0;
   }

   public static int n3q(String param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic hxt.how (Ljava/lang/String;)[Ljava/lang/String;
      // 04: astore 3
      // 05: aload 1
      // 06: invokestatic hxt.how (Ljava/lang/String;)[Ljava/lang/String;
      // 09: astore 4
      // 0b: aload 3
      // 0c: bipush 0
      // 0d: aaload
      // 0e: astore 5
      // 10: invokestatic t9d.c ()I
      // 13: aload 4
      // 15: bipush 0
      // 16: aaload
      // 17: astore 6
      // 19: istore 2
      // 1a: aload 5
      // 1c: aload 6
      // 1e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 21: iload 2
      // 22: ifne 42
      // 25: ifne 3b
      // 28: goto 2f
      // 2b: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 5
      // 31: aload 6
      // 33: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 36: ireturn
      // 37: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 3
      // 3c: bipush 1
      // 3d: aaload
      // 3e: bipush -1
      // 3f: invokestatic hxt.koy (Ljava/lang/String;I)I
      // 42: istore 7
      // 44: aload 4
      // 46: bipush 1
      // 47: aaload
      // 48: bipush -1
      // 49: invokestatic hxt.koy (Ljava/lang/String;I)I
      // 4c: istore 8
      // 4e: iload 7
      // 50: iload 8
      // 52: iload 2
      // 53: ifne 6b
      // 56: if_icmpeq 6d
      // 59: goto 60
      // 5c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: iload 7
      // 62: iload 8
      // 64: goto 6b
      // 67: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: isub
      // 6c: ireturn
      // 6d: aload 3
      // 6e: bipush 2
      // 6f: aaload
      // 70: astore 9
      // 72: aload 4
      // 74: bipush 2
      // 75: aaload
      // 76: astore 10
      // 78: aload 9
      // 7a: aload 10
      // 7c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7f: iload 2
      // 80: ifne cd
      // 83: ifne c6
      // 86: goto 8d
      // 89: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8c: athrow
      // 8d: aload 9
      // 8f: invokevirtual java/lang/String.isEmpty ()Z
      // 92: iload 2
      // 93: ifne b2
      // 96: goto 9d
      // 99: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: ifeq ad
      // a0: goto a7
      // a3: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: bipush 1
      // a8: ireturn
      // a9: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: aload 10
      // af: invokevirtual java/lang/String.isEmpty ()Z
      // b2: iload 2
      // b3: ifne cd
      // b6: ifeq c6
      // b9: goto c0
      // bc: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bf: athrow
      // c0: bipush -1
      // c1: ireturn
      // c2: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c5: athrow
      // c6: aload 9
      // c8: aload 10
      // ca: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // cd: ireturn
   }

   private static String[] how(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 67997022864907
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifne 1c
      // 11: ifnull ab
      // 14: goto 1b
      // 17: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual java/lang/String.length ()I
      // 1f: iload 3
      // 20: ifne ac
      // 23: ifle ab
      // 26: goto 2d
      // 29: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: sipush 2991
      // 30: ldc2_w 4662539895572706638
      // 33: lload 1
      // 34: lxor
      // 35: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: nop
      // 3b: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 3e: astore 4
      // 40: aload 4
      // 42: aload 0
      // 43: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 46: astore 5
      // 48: aload 5
      // 4a: iload 3
      // 4b: ifne 78
      // 4e: invokevirtual java/util/regex/Matcher.matches ()Z
      // 51: ifne 76
      // 54: goto 5b
      // 57: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: bipush 3
      // 5c: anewarray 2
      // 5f: dup
      // 60: bipush 0
      // 61: ldc ""
      // 63: nop
      // 64: aastore
      // 65: dup
      // 66: bipush 1
      // 67: ldc ""
      // 69: nop
      // 6a: aastore
      // 6b: dup
      // 6c: bipush 2
      // 6d: ldc ""
      // 6f: nop
      // 70: aastore
      // 71: areturn
      // 72: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: aload 5
      // 78: bipush 1
      // 79: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 7c: invokestatic hxt.vjq (Ljava/lang/String;)Ljava/lang/String;
      // 7f: astore 6
      // 81: aload 5
      // 83: bipush 2
      // 84: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 87: invokestatic hxt.vjq (Ljava/lang/String;)Ljava/lang/String;
      // 8a: astore 7
      // 8c: aload 5
      // 8e: bipush 3
      // 8f: invokevirtual java/util/regex/Matcher.group (I)Ljava/lang/String;
      // 92: invokestatic hxt.vjq (Ljava/lang/String;)Ljava/lang/String;
      // 95: astore 8
      // 97: bipush 3
      // 98: anewarray 2
      // 9b: dup
      // 9c: bipush 0
      // 9d: aload 6
      // 9f: aastore
      // a0: dup
      // a1: bipush 1
      // a2: aload 7
      // a4: aastore
      // a5: dup
      // a6: bipush 2
      // a7: aload 8
      // a9: aastore
      // aa: areturn
      // ab: bipush 3
      // ac: anewarray 2
      // af: dup
      // b0: bipush 0
      // b1: ldc ""
      // b3: nop
      // b4: aastore
      // b5: dup
      // b6: bipush 1
      // b7: ldc ""
      // b9: nop
      // ba: aastore
      // bb: dup
      // bc: bipush 2
      // bd: ldc ""
      // bf: nop
      // c0: aastore
      // c1: areturn
   }

   public static int zkm(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      return var0 ^ var0 >> 15;
   }

   public static int rra(mew var0, int var1) {
      int var2 = zkm(var1 + 37);
      var2 = zkm(var2 + var0.getX());
      var2 = zkm(var2 + var0.getZ());
      return zkm(var2 + var0.getY());
   }

   public static int qpb() {
      return md5;
   }

   public static void lxq() {
      md5 = Runtime.getRuntime().availableProcessors();
   }

   public static boolean wal() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.qpb ()I
      // 07: iload 0
      // 08: ifne 1e
      // 0b: bipush 1
      // 0c: if_icmpgt 21
      // 0f: goto 16
      // 12: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1e
      // 1a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: goto 22
      // 21: bipush 0
      // 22: ireturn
   }

   public static boolean nib() {
      return hih.js5;
   }

   public static boolean jwp() {
      return hih.uzo;
   }

   public static boolean ptk() {
      return hih.qo7;
   }

   public static boolean mah() {
      return hih.bnn;
   }

   public static int u_7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: iload 0
      // 08: ifeq 1f
      // 0b: ifnonnull 1c
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 10
      // 17: ireturn
      // 18: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: getstatic hxt.hih Lmoh;
      // 1f: getfield moh.gcj I
      // 22: istore 1
      // 23: iload 1
      // 24: ireturn
   }

   public static boolean r4o(Object param0, Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1d
      // 09: aload 1
      // 0a: if_acmpne 1c
      // 0d: goto 14
      // 10: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 38
      // 18: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 2
      // 1e: ifeq 34
      // 21: ifnonnull 33
      // 24: goto 2b
      // 27: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: goto 38
      // 2f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 0
      // 34: aload 1
      // 35: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 38: ireturn
   }

   public static boolean qb6(Object param0, Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: bipush 0
      // 0f: istore 3
      // 10: iload 3
      // 11: aload 1
      // 12: arraylength
      // 13: if_icmpge 47
      // 16: aload 1
      // 17: iload 3
      // 18: aaload
      // 19: astore 4
      // 1b: iload 2
      // 1c: ifne 43
      // 1f: aload 0
      // 20: aload 4
      // 22: invokestatic hxt.r4o (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 25: iload 2
      // 26: ifne 48
      // 29: goto 30
      // 2c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: ifeq 40
      // 33: goto 3a
      // 36: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: bipush 1
      // 3b: ireturn
      // 3c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: iinc 3 1
      // 43: iload 2
      // 44: ifeq 10
      // 47: bipush 0
      // 48: ireturn
   }

   public static boolean nsn(int param0, int[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 1
      // 08: arraylength
      // 09: if_icmpge 39
      // 0c: aload 1
      // 0d: iload 3
      // 0e: iaload
      // 0f: iload 2
      // 10: ifeq 3a
      // 13: iload 2
      // 14: ifeq 31
      // 17: goto 1e
      // 1a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: iload 0
      // 1f: if_icmpne 32
      // 22: goto 29
      // 25: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 31
      // 2d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ireturn
      // 32: iinc 3 1
      // 35: iload 2
      // 36: ifne 06
      // 39: bipush 0
      // 3a: ireturn
   }

   public static boolean rbt(Object param0, Object[] param1) {
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
      // 05: ifnonnull 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: bipush 0
      // 0f: istore 3
      // 10: iload 3
      // 11: aload 1
      // 12: arraylength
      // 13: if_icmpge 39
      // 16: aload 1
      // 17: iload 3
      // 18: aaload
      // 19: astore 4
      // 1b: iload 2
      // 1c: ifeq 35
      // 1f: aload 0
      // 20: aload 4
      // 22: if_acmpne 32
      // 25: goto 2c
      // 28: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
      // 2e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: iinc 3 1
      // 35: iload 2
      // 36: ifne 10
      // 39: bipush 0
      // 3a: ireturn
   }

   public static String vjq(String param0) {
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
      // 05: iload 1
      // 06: ifeq 1d
      // 09: ifnonnull 20
      // 0c: goto 13
      // 0f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: ldc ""
      // 15: nop
      // 16: goto 1d
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: goto 21
      // 20: aload 0
      // 21: areturn
   }

   public static void ucw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hxt.a J
      // 003: ldc2_w 62605542985721
      // 006: lxor
      // 007: lstore 0
      // 008: invokestatic t9d.c ()I
      // 00b: istore 2
      // 00c: invokestatic hxt.i9q ()I
      // 00f: istore 3
      // 010: iload 3
      // 011: ifle 1d6
      // 014: invokestatic org/lwjgl/opengl/Display.getDisplayMode ()Lorg/lwjgl/opengl/DisplayMode;
      // 017: astore 4
      // 019: new java/lang/StringBuilder
      // 01c: dup
      // 01d: invokespecial java/lang/StringBuilder.<init> ()V
      // 020: sipush 9002
      // 023: ldc2_w 134096986366694521
      // 026: lload 0
      // 027: lxor
      // 028: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: nop
      // 02e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 031: iload 3
      // 032: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 035: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 038: invokestatic hxt.brd (Ljava/lang/String;)V
      // 03b: invokestatic org/lwjgl/opengl/Display.destroy ()V
      // 03e: aload 4
      // 040: invokestatic org/lwjgl/opengl/Display.setDisplayMode (Lorg/lwjgl/opengl/DisplayMode;)V
      // 043: new org/lwjgl/opengl/PixelFormat
      // 046: dup
      // 047: invokespecial org/lwjgl/opengl/PixelFormat.<init> ()V
      // 04a: bipush 24
      // 04c: invokevirtual org/lwjgl/opengl/PixelFormat.withDepthBits (I)Lorg/lwjgl/opengl/PixelFormat;
      // 04f: iload 3
      // 050: invokevirtual org/lwjgl/opengl/PixelFormat.withSamples (I)Lorg/lwjgl/opengl/PixelFormat;
      // 053: invokestatic org/lwjgl/opengl/Display.create (Lorg/lwjgl/opengl/PixelFormat;)V
      // 056: bipush 0
      // 057: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 05a: bipush 1
      // 05b: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 05e: goto 0d0
      // 061: astore 5
      // 063: new java/lang/StringBuilder
      // 066: dup
      // 067: invokespecial java/lang/StringBuilder.<init> ()V
      // 06a: sipush 5638
      // 06d: ldc2_w 837503103641510155
      // 070: lload 0
      // 071: lxor
      // 072: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: nop
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: iload 3
      // 07c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 07f: ldc "x"
      // 081: nop
      // 082: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 085: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 088: invokestatic hxt.a2t (Ljava/lang/String;)V
      // 08b: aload 5
      // 08d: invokevirtual org/lwjgl/LWJGLException.printStackTrace ()V
      // 090: aload 4
      // 092: invokestatic org/lwjgl/opengl/Display.setDisplayMode (Lorg/lwjgl/opengl/DisplayMode;)V
      // 095: new org/lwjgl/opengl/PixelFormat
      // 098: dup
      // 099: invokespecial org/lwjgl/opengl/PixelFormat.<init> ()V
      // 09c: bipush 24
      // 09e: invokevirtual org/lwjgl/opengl/PixelFormat.withDepthBits (I)Lorg/lwjgl/opengl/PixelFormat;
      // 0a1: invokestatic org/lwjgl/opengl/Display.create (Lorg/lwjgl/opengl/PixelFormat;)V
      // 0a4: bipush 0
      // 0a5: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 0a8: bipush 1
      // 0a9: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 0ac: goto 0d0
      // 0af: astore 6
      // 0b1: aload 6
      // 0b3: invokevirtual org/lwjgl/LWJGLException.printStackTrace ()V
      // 0b6: aload 4
      // 0b8: invokestatic org/lwjgl/opengl/Display.setDisplayMode (Lorg/lwjgl/opengl/DisplayMode;)V
      // 0bb: invokestatic org/lwjgl/opengl/Display.create ()V
      // 0be: bipush 0
      // 0bf: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 0c2: bipush 1
      // 0c3: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 0c6: goto 0d0
      // 0c9: astore 7
      // 0cb: aload 7
      // 0cd: invokevirtual org/lwjgl/LWJGLException.printStackTrace ()V
      // 0d0: getstatic c05.go6 Z
      // 0d3: ifne 1d6
      // 0d6: invokestatic hxt.bif ()Lity;
      // 0d9: ifnull 1d6
      // 0dc: goto 0e3
      // 0df: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aconst_null
      // 0e4: astore 5
      // 0e6: aconst_null
      // 0e7: astore 6
      // 0e9: invokestatic hxt.bif ()Lity;
      // 0ec: new gdz
      // 0ef: dup
      // 0f0: sipush 15745
      // 0f3: ldc2_w 6498957285796465357
      // 0f6: lload 0
      // 0f7: lxor
      // 0f8: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: nop
      // 0fe: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 101: invokevirtual ity.bxo (Lgdz;)Ljava/io/InputStream;
      // 104: astore 5
      // 106: invokestatic hxt.bif ()Lity;
      // 109: new gdz
      // 10c: dup
      // 10d: sipush 1219
      // 110: ldc2_w 3621164803760976788
      // 113: lload 0
      // 114: lxor
      // 115: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: nop
      // 11b: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 11e: invokevirtual ity.bxo (Lgdz;)Ljava/io/InputStream;
      // 121: astore 6
      // 123: aload 5
      // 125: iload 2
      // 126: ifne 170
      // 129: ifnull 169
      // 12c: goto 133
      // 12f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: aload 6
      // 135: iload 2
      // 136: ifne 170
      // 139: goto 140
      // 13c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13f: athrow
      // 140: ifnull 169
      // 143: goto 14a
      // 146: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 149: athrow
      // 14a: bipush 2
      // 14b: anewarray 1355
      // 14e: dup
      // 14f: bipush 0
      // 150: aload 5
      // 152: invokestatic hxt.sem (Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
      // 155: aastore
      // 156: dup
      // 157: bipush 1
      // 158: aload 6
      // 15a: invokestatic hxt.sem (Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
      // 15d: aastore
      // 15e: invokestatic org/lwjgl/opengl/Display.setIcon ([Ljava/nio/ByteBuffer;)I
      // 161: pop
      // 162: goto 169
      // 165: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 168: athrow
      // 169: aload 5
      // 16b: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 16e: aload 6
      // 170: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 173: goto 1d6
      // 176: astore 7
      // 178: new java/lang/StringBuilder
      // 17b: dup
      // 17c: invokespecial java/lang/StringBuilder.<init> ()V
      // 17f: sipush 10703
      // 182: ldc2_w 728586668554903241
      // 185: lload 0
      // 186: lxor
      // 187: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: nop
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: aload 7
      // 192: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 195: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19b: sipush 32058
      // 19e: ldc2_w 4265832450278885999
      // 1a1: lload 0
      // 1a2: lxor
      // 1a3: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: nop
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: aload 7
      // 1ae: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 1b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b7: invokestatic hxt.a2t (Ljava/lang/String;)V
      // 1ba: aload 5
      // 1bc: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 1bf: aload 6
      // 1c1: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 1c4: goto 1d6
      // 1c7: astore 8
      // 1c9: aload 5
      // 1cb: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 1ce: aload 6
      // 1d0: invokestatic org/apache/commons/io/IOUtils.closeQuietly (Ljava/io/InputStream;)V
      // 1d3: aload 8
      // 1d5: athrow
      // 1d6: return
   }

   private static ByteBuffer sem(InputStream var0) {
      BufferedImage var2 = ImageIO.read(var0);
      int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
      int var10000 = t9d.c();
      ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);
      int var1 = var10000;
      int[] var5 = var3;
      int var6 = var3.length;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            int var8 = var5[var7];

            try {
               var4.putInt(var8 << 8 | var8 >> 24 & 0xFF);
               var7++;
               if (var1 != 0) {
                  break;
               }

               if (var1 == 0) {
                  continue;
               }
            } catch (NumberFormatException var9) {
               throw a(var9);
            }
         }

         ((Buffer)var4).flip();
         break;
      }

      return var4;
   }

   public static void tym() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hxt.a J
      // 003: ldc2_w 133710072993611
      // 006: lxor
      // 007: lstore 0
      // 008: invokestatic t9d.c ()I
      // 00b: istore 2
      // 00c: getstatic hxt.oq4 Lc05;
      // 00f: invokevirtual c05.ofs ()Z
      // 012: iload 2
      // 013: ifne 15e
      // 016: ifeq 154
      // 019: goto 020
      // 01c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01f: athrow
      // 020: getstatic hxt._a0 Z
      // 023: iload 2
      // 024: ifne 03e
      // 027: goto 02e
      // 02a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: ifeq 039
      // 031: goto 038
      // 034: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: return
      // 039: bipush 1
      // 03a: putstatic hxt._a0 Z
      // 03d: bipush 0
      // 03e: putstatic hxt.cwd Z
      // 041: invokestatic org/lwjgl/opengl/Display.getDisplayMode ()Lorg/lwjgl/opengl/DisplayMode;
      // 044: astore 3
      // 045: invokestatic hxt.zfk ()Ljava/awt/Dimension;
      // 048: astore 4
      // 04a: aload 4
      // 04c: ifnonnull 050
      // 04f: return
      // 050: aload 3
      // 051: iload 2
      // 052: ifne 08b
      // 055: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 058: aload 4
      // 05a: getfield java/awt/Dimension.width I
      // 05d: if_icmpne 086
      // 060: goto 067
      // 063: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: aload 3
      // 068: iload 2
      // 069: ifne 08b
      // 06c: goto 073
      // 06f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 076: aload 4
      // 078: getfield java/awt/Dimension.height I
      // 07b: if_icmpne 086
      // 07e: goto 085
      // 081: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 084: athrow
      // 085: return
      // 086: aload 4
      // 088: invokestatic hxt.bol (Ljava/awt/Dimension;)Lorg/lwjgl/opengl/DisplayMode;
      // 08b: astore 5
      // 08d: aload 5
      // 08f: iload 2
      // 090: ifne 0a0
      // 093: ifnonnull 09e
      // 096: goto 09d
      // 099: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: return
      // 09e: aload 5
      // 0a0: invokestatic org/lwjgl/opengl/Display.setDisplayMode (Lorg/lwjgl/opengl/DisplayMode;)V
      // 0a3: getstatic hxt.oq4 Lc05;
      // 0a6: invokestatic org/lwjgl/opengl/Display.getDisplayMode ()Lorg/lwjgl/opengl/DisplayMode;
      // 0a9: invokevirtual org/lwjgl/opengl/DisplayMode.getWidth ()I
      // 0ac: putfield c05.pfr I
      // 0af: getstatic hxt.oq4 Lc05;
      // 0b2: invokestatic org/lwjgl/opengl/Display.getDisplayMode ()Lorg/lwjgl/opengl/DisplayMode;
      // 0b5: invokevirtual org/lwjgl/opengl/DisplayMode.getHeight ()I
      // 0b8: putfield c05.ry7 I
      // 0bb: getstatic hxt.oq4 Lc05;
      // 0be: getfield c05.pfr I
      // 0c1: iload 2
      // 0c2: ifne 0ee
      // 0c5: ifgt 0dd
      // 0c8: goto 0cf
      // 0cb: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ce: athrow
      // 0cf: getstatic hxt.oq4 Lc05;
      // 0d2: bipush 1
      // 0d3: putfield c05.pfr I
      // 0d6: goto 0dd
      // 0d9: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: getstatic hxt.oq4 Lc05;
      // 0e0: iload 2
      // 0e1: ifne 102
      // 0e4: getfield c05.ry7 I
      // 0e7: goto 0ee
      // 0ea: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: ifgt 0ff
      // 0f1: getstatic hxt.oq4 Lc05;
      // 0f4: bipush 1
      // 0f5: putfield c05.ry7 I
      // 0f8: goto 0ff
      // 0fb: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fe: athrow
      // 0ff: getstatic hxt.oq4 Lc05;
      // 102: iload 2
      // 103: ifne 147
      // 106: getfield c05.u0y Lgbe;
      // 109: ifnull 13d
      // 10c: goto 113
      // 10f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: new eka
      // 116: dup
      // 117: getstatic hxt.oq4 Lc05;
      // 11a: invokespecial eka.<init> (Lc05;)V
      // 11d: astore 6
      // 11f: aload 6
      // 121: invokevirtual eka.x05 ()I
      // 124: istore 7
      // 126: aload 6
      // 128: invokevirtual eka.lrx ()I
      // 12b: istore 8
      // 12d: getstatic hxt.oq4 Lc05;
      // 130: getfield c05.u0y Lgbe;
      // 133: getstatic hxt.oq4 Lc05;
      // 136: iload 7
      // 138: iload 8
      // 13a: invokevirtual gbe.kky (Lc05;II)V
      // 13d: invokestatic hxt.tds ()V
      // 140: bipush 1
      // 141: invokestatic org/lwjgl/opengl/Display.setFullscreen (Z)V
      // 144: getstatic hxt.oq4 Lc05;
      // 147: getfield c05.oxn Lmoh;
      // 14a: invokevirtual moh.gpl ()V
      // 14d: invokestatic hzu.rqj ()V
      // 150: iload 2
      // 151: ifeq 18c
      // 154: getstatic hxt.cwd Z
      // 157: goto 15e
      // 15a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: iload 2
      // 15f: ifne 189
      // 162: ifeq 16d
      // 165: goto 16c
      // 168: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: return
      // 16d: bipush 1
      // 16e: putstatic hxt.cwd Z
      // 171: bipush 0
      // 172: putstatic hxt._a0 Z
      // 175: getstatic hxt.oq4 Lc05;
      // 178: getfield c05.oxn Lmoh;
      // 17b: invokevirtual moh.gpl ()V
      // 17e: invokestatic org/lwjgl/opengl/Display.update ()V
      // 181: invokestatic hzu.rqj ()V
      // 184: bipush 0
      // 185: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 188: bipush 1
      // 189: invokestatic org/lwjgl/opengl/Display.setResizable (Z)V
      // 18c: goto 1ae
      // 18f: astore 3
      // 190: aload 3
      // 191: invokevirtual java/lang/Exception.printStackTrace ()V
      // 194: getstatic hxt.hih Lmoh;
      // 197: sipush 9330
      // 19a: ldc2_w 8644572162222525336
      // 19d: lload 0
      // 19e: lxor
      // 19f: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: nop
      // 1a5: putfield moh.vk4 Ljava/lang/String;
      // 1a8: getstatic hxt.hih Lmoh;
      // 1ab: invokevirtual moh.ae5 ()V
      // 1ae: return
   }

   public static void tds() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.oq4 Lc05;
      // 07: invokevirtual c05._d2 ()Loru;
      // 0a: getstatic hxt.oq4 Lc05;
      // 0d: getfield c05.pfr I
      // 10: getstatic hxt.oq4 Lc05;
      // 13: getfield c05.ry7 I
      // 16: invokevirtual oru.mfw (II)V
      // 19: getstatic hxt.oq4 Lc05;
      // 1c: iload 0
      // 1d: ifeq 4c
      // 20: getfield c05.x0p Lv3i;
      // 23: ifnull 49
      // 26: goto 2d
      // 29: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: getstatic hxt.oq4 Lc05;
      // 30: getfield c05.x0p Lv3i;
      // 33: getstatic hxt.oq4 Lc05;
      // 36: getfield c05.pfr I
      // 39: getstatic hxt.oq4 Lc05;
      // 3c: getfield c05.ry7 I
      // 3f: invokevirtual v3i.ppz (II)V
      // 42: goto 49
      // 45: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: getstatic hxt.oq4 Lc05;
      // 4c: new c2o
      // 4f: dup
      // 50: getstatic hxt.oq4 Lc05;
      // 53: invokespecial c2o.<init> (Lc05;)V
      // 56: putfield c05.h8m Lc2o;
      // 59: return
   }

   public static Object[] a46(Object[] param0, Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 7254855344512
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifne 38
      // 13: ifnonnull 37
      // 16: goto 1d
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: new java/lang/NullPointerException
      // 20: dup
      // 21: sipush 6511
      // 24: ldc2_w 314949303323361400
      // 27: lload 2
      // 28: lxor
      // 29: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: nop
      // 2f: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 32: athrow
      // 33: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: arraylength
      // 39: istore 5
      // 3b: iload 5
      // 3d: bipush 1
      // 3e: iadd
      // 3f: istore 6
      // 41: aload 0
      // 42: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 45: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 48: iload 6
      // 4a: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 4d: checkcast [Ljava/lang/Object;
      // 50: checkcast [Ljava/lang/Object;
      // 53: checkcast [Ljava/lang/Object;
      // 56: astore 7
      // 58: aload 0
      // 59: bipush 0
      // 5a: aload 7
      // 5c: bipush 0
      // 5d: iload 5
      // 5f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 62: aload 7
      // 64: iload 5
      // 66: aload 1
      // 67: aastore
      // 68: aload 7
      // 6a: areturn
   }

   public static Object[] yhh(Object[] var0, Object var1, int var2) {
      ArrayList var3 = new ArrayList<>(Arrays.asList(var0));
      var3.add(var2, var1);
      Object[] var4 = (Object[])Array.newInstance(var0.getClass().getComponentType(), var3.size());
      return var3.toArray(var4);
   }

   public static Object[] o_6(Object[] param0, Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 32373799854934
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: iload 4
      // 10: ifeq 38
      // 13: ifnonnull 37
      // 16: goto 1d
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: new java/lang/NullPointerException
      // 20: dup
      // 21: sipush 2499
      // 24: ldc2_w 1832447376186528267
      // 27: lload 2
      // 28: lxor
      // 29: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: nop
      // 2f: invokespecial java/lang/NullPointerException.<init> (Ljava/lang/String;)V
      // 32: athrow
      // 33: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 1
      // 38: arraylength
      // 39: iload 4
      // 3b: ifeq 50
      // 3e: ifne 4e
      // 41: goto 48
      // 44: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: areturn
      // 4a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: aload 0
      // 4f: arraylength
      // 50: istore 5
      // 52: iload 5
      // 54: aload 1
      // 55: arraylength
      // 56: iadd
      // 57: istore 6
      // 59: aload 0
      // 5a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 5d: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 60: iload 6
      // 62: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 65: checkcast [Ljava/lang/Object;
      // 68: checkcast [Ljava/lang/Object;
      // 6b: checkcast [Ljava/lang/Object;
      // 6e: astore 7
      // 70: aload 0
      // 71: bipush 0
      // 72: aload 7
      // 74: bipush 0
      // 75: iload 5
      // 77: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 7a: aload 1
      // 7b: bipush 0
      // 7c: aload 7
      // 7e: iload 5
      // 80: aload 1
      // 81: arraylength
      // 82: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 85: aload 7
      // 87: areturn
   }

   public static Object[] eor(Object[] var0, Object var1) {
      ArrayList var2 = new ArrayList<>(Arrays.asList(var0));
      var2.remove(var1);
      return rj1(var2, var0.getClass().getComponentType());
   }

   public static Object[] rj1(Collection param0, Class param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 46917012926684
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: ifnonnull 17
      // 11: aconst_null
      // 12: areturn
      // 13: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 1
      // 18: iload 4
      // 1a: ifeq 2e
      // 1d: ifnonnull 2d
      // 20: goto 27
      // 23: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aconst_null
      // 28: areturn
      // 29: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 1
      // 2e: iload 4
      // 30: ifeq 75
      // 33: invokevirtual java/lang/Class.isPrimitive ()Z
      // 36: ifeq 6b
      // 39: goto 40
      // 3c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: new java/lang/IllegalArgumentException
      // 43: dup
      // 44: new java/lang/StringBuilder
      // 47: dup
      // 48: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b: sipush 32250
      // 4e: ldc2_w 2264859988604859776
      // 51: lload 2
      // 52: lxor
      // 53: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c: aload 1
      // 5d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 60: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 63: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 66: athrow
      // 67: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 1
      // 6c: aload 0
      // 6d: invokeinterface java/util/Collection.size ()I 1
      // 72: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 75: checkcast [Ljava/lang/Object;
      // 78: checkcast [Ljava/lang/Object;
      // 7b: checkcast [Ljava/lang/Object;
      // 7e: astore 5
      // 80: aload 0
      // 81: aload 5
      // 83: invokeinterface java/util/Collection.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 88: areturn
   }

   public static boolean bdl() {
      return hih.n1e;
   }

   public static void lc5() {
      long var0 = a ^ 80639721003350L;
      int var2 = c05.bdw();
      String var3 = pep(oq4.gak);
      int var4 = oq4.vsl.zpi();
      int var5 = oq4.vsl.q22();
      int var6 = oq4.vsl.tc4();
      String var7 = ""
         + var2
         + "/"
         + tpo()
         + a<"r">(1104, 9194892950764758433L ^ var0)
         + var4
         + a<"r">(17909, 5935421877938644053L ^ var0)
         + var5
         + "+"
         + var6
         + a<"r">(4835, 8091475851003736833L ^ var0)
         + var3;
      oq4.tx1.eh6(var7, 2.0F, 2.0F, -2039584);
   }

   public static int tpo() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: getstatic hxt.oq4 Lc05;
      // 07: getfield c05.gak Ljava/lang/String;
      // 0a: iload 0
      // 0b: ifne 29
      // 0e: getstatic hxt.zn9 Ljava/lang/String;
      // 11: if_acmpne 23
      // 14: goto 1b
      // 17: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: getstatic hxt.lhf I
      // 1e: ireturn
      // 1f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: getstatic hxt.oq4 Lc05;
      // 26: getfield c05.gak Ljava/lang/String;
      // 29: putstatic hxt.zn9 Ljava/lang/String;
      // 2c: getstatic hxt.oq4 Lc05;
      // 2f: invokevirtual c05.ojh ()Loin;
      // 32: astore 1
      // 33: aload 1
      // 34: invokevirtual oin.kll ()[J
      // 37: astore 2
      // 38: aload 1
      // 39: invokevirtual oin.kyn ()I
      // 3c: istore 3
      // 3d: aload 1
      // 3e: invokevirtual oin.qva ()I
      // 41: istore 4
      // 43: iload 3
      // 44: iload 0
      // 45: ifne 5f
      // 48: iload 4
      // 4a: if_icmpne 5c
      // 4d: goto 54
      // 50: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: getstatic hxt.lhf I
      // 57: ireturn
      // 58: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: invokestatic c05.bdw ()I
      // 5f: istore 5
      // 61: iload 5
      // 63: iload 0
      // 64: ifne 72
      // 67: ifgt 74
      // 6a: goto 71
      // 6d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 70: athrow
      // 71: bipush 1
      // 72: istore 5
      // 74: dconst_1
      // 75: iload 5
      // 77: i2d
      // 78: ddiv
      // 79: ldc2_w 1.0E9
      // 7c: dmul
      // 7d: d2l
      // 7e: lstore 6
      // 80: lload 6
      // 82: lstore 8
      // 84: lconst_0
      // 85: lstore 10
      // 87: iload 3
      // 88: bipush 1
      // 89: isub
      // 8a: aload 2
      // 8b: arraylength
      // 8c: invokestatic fe6.ba6 (II)I
      // 8f: istore 12
      // 91: iload 12
      // 93: iload 4
      // 95: if_icmpeq eb
      // 98: lload 10
      // 9a: l2d
      // 9b: ldc2_w 1.0E9
      // 9e: iload 0
      // 9f: ifne f1
      // a2: iload 0
      // a3: ifne f1
      // a6: goto ad
      // a9: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: dcmpg
      // ae: ifge eb
      // b1: goto b8
      // b4: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b7: athrow
      // b8: aload 2
      // b9: iload 12
      // bb: laload
      // bc: lstore 13
      // be: lload 13
      // c0: lload 8
      // c2: lcmp
      // c3: iload 0
      // c4: ifne e5
      // c7: ifle d5
      // ca: goto d1
      // cd: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d0: athrow
      // d1: lload 13
      // d3: lstore 8
      // d5: lload 10
      // d7: lload 13
      // d9: ladd
      // da: lstore 10
      // dc: iload 12
      // de: bipush 1
      // df: isub
      // e0: aload 2
      // e1: arraylength
      // e2: invokestatic fe6.ba6 (II)I
      // e5: istore 12
      // e7: iload 0
      // e8: ifeq 91
      // eb: lload 8
      // ed: l2d
      // ee: ldc2_w 1.0E9
      // f1: ddiv
      // f2: dstore 12
      // f4: dconst_1
      // f5: dload 12
      // f7: ddiv
      // f8: d2i
      // f9: putstatic hxt.lhf I
      // fc: getstatic hxt.lhf I
      // ff: ireturn
   }

   private static String pep(String param0) {
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
      // 05: bipush 40
      // 07: invokevirtual java/lang/String.indexOf (I)I
      // 0a: istore 2
      // 0b: iload 2
      // 0c: iload 1
      // 0d: ifeq 29
      // 10: ifge 22
      // 13: goto 1a
      // 16: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: ldc ""
      // 1c: nop
      // 1d: areturn
      // 1e: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: bipush 32
      // 25: iload 2
      // 26: invokevirtual java/lang/String.indexOf (II)I
      // 29: istore 3
      // 2a: iload 3
      // 2b: ifge 38
      // 2e: ldc ""
      // 30: nop
      // 31: goto 40
      // 34: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 37: athrow
      // 38: aload 0
      // 39: iload 2
      // 3a: bipush 1
      // 3b: iadd
      // 3c: iload 3
      // 3d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 40: areturn
   }

   public static int odz() {
      long var0 = a ^ 132952718532368L;
      String var2 = System.getenv(a<"r">(17327, 4323393694875837527L ^ var0));

      try {
         if (var2 != null) {
            return 64;
         }
      } catch (NumberFormatException var3) {
         throw a(var3);
      }

      return 32;
   }

   public static int kns() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxt.a J
      // 03: ldc2_w 30553487659074
      // 06: lxor
      // 07: lstore 0
      // 08: bipush 3
      // 09: anewarray 2
      // 0c: dup
      // 0d: bipush 0
      // 0e: sipush 21126
      // 11: ldc2_w 8436309526682303010
      // 14: lload 0
      // 15: lxor
      // 16: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: aastore
      // 1d: dup
      // 1e: bipush 1
      // 1f: sipush 22947
      // 22: ldc2_w 826504873006068090
      // 25: lload 0
      // 26: lxor
      // 27: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: nop
      // 2d: aastore
      // 2e: dup
      // 2f: bipush 2
      // 30: sipush 23256
      // 33: ldc2_w 1484391751319646783
      // 36: lload 0
      // 37: lxor
      // 38: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: nop
      // 3e: aastore
      // 3f: astore 3
      // 40: invokestatic t9d.b ()I
      // 43: bipush 0
      // 44: istore 4
      // 46: istore 2
      // 47: iload 4
      // 49: aload 3
      // 4a: arraylength
      // 4b: if_icmpge 9d
      // 4e: aload 3
      // 4f: iload 4
      // 51: aaload
      // 52: astore 5
      // 54: aload 5
      // 56: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // 59: astore 6
      // 5b: iload 2
      // 5c: ifeq 99
      // 5f: aload 6
      // 61: ifnull 96
      // 64: goto 6b
      // 67: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 6
      // 6d: sipush 6426
      // 70: ldc2_w 6589662505855889911
      // 73: lload 0
      // 74: lxor
      // 75: invokedynamic r (IJ)Ljava/lang/String; bsm=hxt.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: nop
      // 7b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 7e: iload 2
      // 7f: ifeq 95
      // 82: goto 89
      // 85: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: ifeq 96
      // 8c: goto 93
      // 8f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: bipush 64
      // 95: ireturn
      // 96: iinc 4 1
      // 99: iload 2
      // 9a: ifne 47
      // 9d: bipush 32
      // 9f: ireturn
   }

   public static boolean m28() {
      return r7b;
   }

   public static void md8(boolean var0) {
      r7b = var0;
   }

   public static boolean t_e() {
      return false;
   }

   public static void vuo(String var0, String var1) {
      GuiMessage var2 = new GuiMessage(oq4.u0y, var0, var1);
      oq4.z2i(var2);
   }

   public static int[] x54(int[] var0, int var1) {
      return u08(var0, new int[]{var1});
   }

   public static int[] u08(int[] var0, int[] var1) {
      long var2 = a ^ 97399786183011L;
      int var4 = t9d.c();

      int[] var10000;
      label52: {
         try {
            var10000 = var0;
            if (var4 != 0) {
               break label52;
            }

            if (var0 == null) {
               throw new NullPointerException(a<"r">(6511, 314885516608927899L ^ var2));
            }
         } catch (NumberFormatException var11) {
            throw a(var11);
         }

         var10000 = var1;
      }

      label46: {
         try {
            if (var4 != 0) {
               break label46;
            }

            if (var10000 == null) {
               throw new NullPointerException(a<"r">(6511, 314885516608927899L ^ var2));
            }
         } catch (NumberFormatException var10) {
            throw a(var10);
         }

         var10000 = var0;
      }

      int var5 = var10000.length;
      int var6 = var5 + var1.length;
      int[] var7 = new int[var6];
      System.arraycopy(var0, 0, var7, 0, var5);
      int var8 = 0;

      while (true) {
         if (var8 < var1.length) {
            try {
               var10000 = var7;
               if (var4 != 0) {
                  break;
               }

               var7[var8 + var5] = var1[var8];
               var8++;
               if (var4 == 0) {
                  continue;
               }
            } catch (NumberFormatException var9) {
               throw a(var9);
            }
         }

         var10000 = var7;
         break;
      }

      return var10000;
   }

   public static p9u vfg(p9u var0) {
      long var1 = a ^ 125015714031380L;
      int var3 = t9d.b();

      try {
         gdz var4 = new gdz(a<"r">(30506, 8348485046603966646L ^ var1));
         InputStream var5 = cas(var4);

         InputStream var10000;
         label33: {
            try {
               var10000 = var5;
               if (var3 == 0) {
                  break label33;
               }

               if (var5 == null) {
                  return var0;
               }
            } catch (Exception var8) {
               throw a(var8);
            }

            var10000 = var5;
         }

         BufferedImage var6 = ImageIO.read(var10000);
         return var6 == null ? var0 : new p9u(var6);
      } catch (Exception var9) {
         a2t(var9.getClass().getName() + a<"r">(12716, 1304613884951473732L ^ var1) + var9.getMessage());
         return var0;
      }
   }

   public static void jl_(File var0, String var1) {
      long var2 = a ^ 125306485533224L;
      FileOutputStream var4 = new FileOutputStream(var0);
      byte[] var5 = var1.getBytes(a<"r">(16371, 2325806251309378862L ^ var2));
      var4.write(var5);
      var4.close();
   }

   public static yu2 _zx() {
      return a59().dd_();
   }

   public static boolean csr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.vff I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 3
      // 0f: if_icmpeq 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean lyl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.hih Lmoh;
      // 07: getfield moh.vff I
      // 0a: iload 0
      // 0b: ifeq 21
      // 0e: bipush 1
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public static boolean s6v() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.csr ()Z
      // 07: iload 0
      // 08: ifne 20
      // 0b: ifne 1d
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 0
      // 16: goto 35
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: invokestatic hxt.ly3 ()Z
      // 20: iload 0
      // 21: ifne 31
      // 24: ifeq 34
      // 27: goto 2e
      // 2a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: invokestatic net/optifine/shaders/Shaders.isDynamicHandLight ()Z
      // 31: goto 35
      // 34: bipush 1
      // 35: ireturn
   }

   public static boolean qlt() {
      return hih.re1;
   }

   public static boolean g73() {
      return hih.w8x;
   }

   public static int o9x() {
      return hih.b0j;
   }

   public static int[] jf0(Integer[] param0) {
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
      // 05: iload 1
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: arraylength
      // 1b: iload 1
      // 1c: ifne 33
      // 1f: ifne 31
      // 22: goto 29
      // 25: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 0
      // 2a: newarray 10
      // 2c: areturn
      // 2d: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 0
      // 32: arraylength
      // 33: newarray 10
      // 35: astore 2
      // 36: bipush 0
      // 37: istore 3
      // 38: iload 3
      // 39: aload 2
      // 3a: arraylength
      // 3b: if_icmpge 59
      // 3e: aload 2
      // 3f: iload 1
      // 40: ifne 5a
      // 43: iload 3
      // 44: aload 0
      // 45: iload 3
      // 46: aaload
      // 47: invokevirtual java/lang/Integer.intValue ()I
      // 4a: iastore
      // 4b: iinc 3 1
      // 4e: iload 1
      // 4f: ifeq 38
      // 52: goto 59
      // 55: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: aload 2
      // 5a: areturn
   }

   public static boolean _al() {
      return hih.oto;
   }

   public static boolean x74() {
      return gis.eyg();
   }

   public static boolean h79() {
      return hih.qqi;
   }

   public static boolean jr0(URI var0) {
      long var1 = a ^ 135404449893591L;

      try {
         Desktop.getDesktop().browse(var0);
         return true;
      } catch (Exception var4) {
         a2t(a<"r">(18184, 1928668910308700968L ^ var1) + var0);
         a2t(var4.getClass().getName() + a<"r">(12716, 1304603530606790023L ^ var1) + var4.getMessage());
         return false;
      }
   }

   public static boolean lkm() {
      return hih.e1t;
   }

   public static String dj2(boolean[] param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnonnull 10
      // 08: ldc ""
      // 0a: nop
      // 0b: areturn
      // 0c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f: athrow
      // 10: new java/lang/StringBuffer
      // 13: dup
      // 14: aload 0
      // 15: arraylength
      // 16: bipush 5
      // 17: imul
      // 18: invokespecial java/lang/StringBuffer.<init> (I)V
      // 1b: astore 3
      // 1c: bipush 0
      // 1d: istore 4
      // 1f: iload 4
      // 21: aload 0
      // 22: arraylength
      // 23: if_icmpge 5a
      // 26: aload 0
      // 27: iload 4
      // 29: baload
      // 2a: istore 5
      // 2c: iload 2
      // 2d: ifne 56
      // 30: iload 4
      // 32: ifle 49
      // 35: goto 3c
      // 38: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 3
      // 3d: aload 1
      // 3e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 41: pop
      // 42: goto 49
      // 45: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 3
      // 4a: iload 5
      // 4c: invokestatic java/lang/String.valueOf (Z)Ljava/lang/String;
      // 4f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 52: pop
      // 53: iinc 4 1
      // 56: iload 2
      // 57: ifeq 1f
      // 5a: aload 3
      // 5b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 5e: areturn
   }

   public static boolean uv_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 0
      // 04: getstatic hxt.oq4 Lc05;
      // 07: iload 0
      // 08: ifeq 23
      // 0b: invokevirtual c05.et4 ()Liq7;
      // 0e: ifnonnull 20
      // 11: goto 18
      // 14: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: bipush 0
      // 19: goto 26
      // 1c: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: getstatic hxt.oq4 Lc05;
      // 23: invokevirtual c05.y8_ ()Z
      // 26: ireturn
   }

   public static IntBuffer ch3(int var0) {
      return nkx.eh9(var0 << 2).asIntBuffer();
   }

   public static String de_(int var0) {
      long var1 = a ^ 117179372225622L;

      try {
         switch (var0) {
            case 0:
               return a<"r">(11398, 4902653839725531223L ^ var1);
            case 1280:
               return a<"r">(2720, 3855589377689171574L ^ var1);
            case 1281:
               return a<"r">(31295, 6496314023672661721L ^ var1);
            case 1282:
               return a<"r">(4704, 3322726395624894115L ^ var1);
            case 1283:
               return a<"r">(27475, 8895245140228822945L ^ var1);
            case 1284:
               return a<"r">(8127, 3910118086982345492L ^ var1);
            case 1285:
               return a<"r">(3701, 7448308101917553368L ^ var1);
            case 1286:
               return a<"r">(4834, 874316298236046938L ^ var1);
         }
      } catch (NumberFormatException var3) {
         throw a(var3);
      }

      return a<"r">(24547, 8777898980581008180L ^ var1);
   }

   public static boolean f91(Boolean var0) {
      int var1 = t9d.b();

      Boolean var10000;
      label33: {
         try {
            var10000 = var0;
            if (var1 == 0) {
               break label33;
            }

            if (var0 == null) {
               return false;
            }
         } catch (NumberFormatException var3) {
            throw a(var3);
         }

         var10000 = var0;
      }

      try {
         boolean var4 = var10000;
         if (var1 == 0) {
            return var4;
         }

         if (var4) {
            return true;
         }
      } catch (NumberFormatException var2) {
         throw a(var2);
      }

      return false;
   }

   public static boolean d9o() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 0
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 0
      // 08: ifne 20
      // 0b: ifne 1d
      // 0e: goto 15
      // 11: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14: athrow
      // 15: bipush 0
      // 16: goto 33
      // 19: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: invokestatic net/optifine/shaders/Shaders.canRenderQuads ()Z
      // 20: iload 0
      // 21: ifne 2f
      // 24: ifne 32
      // 27: goto 2e
      // 2a: invokestatic hxt.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   public static void q8c(Object var0, String var1) {
      try {
         if (var0 == null) {
            throw new NullPointerException(var1);
         }
      } catch (NumberFormatException var2) {
         throw a(var2);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8102622048947319430L, 283082656999002019L, MethodHandles.lookup().lookupClass()).a(232726767653801L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 7979873747109L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[91];
      int var5 = 0;
      String var4 = "pò\u009fK©wB²ÇXjå¹\u009a¼1ÈpY\u0088]Z5×\u0010Eç\u00104\u0080\"èxz>\u0081\u00954R\u0002>(É\u0099 0X\u0099!\u0010\u009dáZ|\u0083Åð\u0013¯õ\b²Ü8\u00806\u0084½ÝN\u0013Xò0Xÿ\u000bß6\u009f\u0087Ó\u0010,oÊñ\u0080*y\b0ù}p°8|Â \u009at\u0000¼\u0082\u0002Uû\u0085ËÔ;êáô) þ\bï¥â3*8^åq\u009e\u0014}O \u009a\b¾\u008c\u008asä¬\u0099©\u0092\u0083?_M\u000bÃÈ\u0001ð½ÓaJ\u000feOðîµJg Ä,ïNáy\nÀ)\u0016\u0082¨|\u0096â8\u0095\u0013NçÚEa\u001ef\u0002!Ë¥\u001a[¥\u0010³Ü\u008f5tL%ø%\u0012,MÁÒ¾Ï\u0010çj\u001a¬Õq\u0084¥ZJiºìP4\u0082(]Éï\u008fHæ å\u0097Bd>\teG±Ö\u0015»oE¯áb\u0081\u008bÁñ¿Èh=Q\u007f»¿\u0013tÛK \u008cs\u0000\fRìcem\u0007\u0085yn9XT«Úìß\u009aa,ô\u0018Ã\u001f\u0090ÛcåH X\u0088`K¿»äVÀp§r\u00adoÈ\u0013å\u0006)bQÞ\fÏ\\\u0093\u0003¥_\u001f\u009a\u0097 lr»ndöPë\u001eÿ;g\u0004ì9Ñ\u007f\u0083\u0083Lo9\u0092¯\nl\u0087uÊdÌ\u0091 â Î\nÀ\b¤$-âVù\u007fHw/z]-\u0014Ê\u0096¹\u0006G;7Ùj'êû\u0010l¡ò½Ë4¿\u008füu\u0007»\u0087Ã\u008eþ\u0010¿õ\u0092ýå¥$\u000b\u000eÒrÔcÇ-¶\u0010á).'E\u000bf®\u0017Ì\u008e:ÿ_ÎÑ\u0010\u0014(å½(Zîú\"ý#»¥´01(H\u0097\u0002\u0017ÀxSw5¸\u001b  t]ÛÛcîvsZl\u00829½\u0007öðwK\u0090$\u0014æcÇÎ\t0\u0010&aÏ+P!º\u008a{\u0084Ö\u009e'ÏËå\u0010\"A\u0085Ð_æôU\u0088æ\b§ïn,¤\u0010xv).\u009eM\bó«ù¦Y²\u0018«¾\u0018ß\u0015\"u¼|×¢A\u009bE \n®Cqù\u009e\u00127£æ³\u001f8]4æíÀ®í_{óÔ®\u0018f\u0006\u008aQ.J\"\u0010u\u008d\u00adsòFÃ¨¬½³3ãüOÞ(\u0019\u0083K=Æ\u0018+\u001f\u0088ÿ±ªáK{RW+\u0018wÉì\u0016\u0010\u001c\u0018:\u0090Å\u0099\u0093\u0016ÞYO\u0011ê£+ú\u0002´M\u0010\u0093ÝÌE¸I6Q«\u009a6 ¦ öl\u00881øªÔ\u000bÇ«^rÙÏ+ljíyò÷>Ye\u0080(¥EM\u0012!¯_\u0086h<[yn\u0097w7\u0094µìè4Áüm9wÛ²ûÂ*òNïñqÍ¬I}þÓ\u0082\u0014\u0019ÓæGç\u0003W\u009bÜ\u000fEd´\u0002ÑãÁ_v$$Û\u0086ñg£/ní\u0000(º[\u0080ÔÒãMÌR\u0087C¸Êa*Á\u0014xÇüÌ\u0003å'Êh\u0087éÓ\u009c\u0003Æ@¯÷\u0086Ä\u0086 \u009f \u0018!\u0004-BfxÝ\u0007\u0087¹æ\u0095\u0017@ÊÔú\u009fÍ¢j\u0083\\\u008c\u0093záÍ\u0005 6#60pJ\u000b6zý5'ÓZÚõåäÙ¿\u0085äóX0þæü\n5\u001eç\u0010a£°²_¥8¡+i\u0087Ká;Ö´\u0010möÀËë\u008b¢åUºè4=Gäe\u0010ÞÌ\u0087É×ã²\u001e\f\u0087îMwPçw ×\u0082ÚÖ\u001e:a\u0011  ãàÇ£\u0093=ìØ¹Tz¹\u0018\u00905\u0005Ñ}|9\u0089'\u0010DXÞ!b¾\r¶Gê\u0083Ü\u0084W\t (hà\u008baeêÕU\u0001åJÙG®\u0005 OZ§õ¬fcHEÌ2\u001bqVGíö\u009d{!|DfA\u0010ÿ\u009ap6÷BøüiP\u001e\u000eÿ\u0007\u009fü\u0010¡\u00153rÒ\u0080\u0086^8QGêR\u0006\u0000& ¥Ï3\u008b-c6LÛüóZpRJéä?{·é,M\u001bºÚã¡Yp\u00120(ì\u0088`\b\u0007¦\u0080$åèk6\u001cÞU\u009dªQ\u0003&z¡læ5ÆÔ `\u008aÄ\u0092O¤ñæ=\\Þ\u00190\u009f¥j?\u001eö[âf§{Ä¼s\u008a\u001dZËïyoØ'&dex\u00131ÎÑüÚ\u008d\fÐ/\u0019t¬,I\u0095\u0091(QÆÃ(«ãÆ§\u001bòN\u000f\u0087:´à#å\u0087w[\u0088\u001aïdµÖÓ\u009fÕ{Tòw\u009f\u0094t'7µ\u0017áÌ\u000e(\"ä7ej\u0080ç\u009dáßä|\u0017¹ÎÚêÀàg¥ôJ»HÉ)\u0001FÂ\u0081 \\ÝÛÎ\u000eÝá¨\u0010C=\u0088Ë´ \u0017¿\u0007\u0098h\u0088\u008cM}\u008d(\u0080E\u00921<ÑVôªµ\u0088\u00ad\u0000\u009f\u008aÜ~Ê¹=Ëi\u0002pÁ\u001bL\u0006±¬\u0097ô\t>g!\u0002¢SY\u0010dE\u009aòN\u0096ó,,h$§'Èg³\u0010\u0015:A6imµny\u0018\u0000Z=\u00ad\u0005\u0004(Ê\u0097é\u0019\u0087Å\u0081Ë\u0095¯\u0092ó±®°\u009d7á@#_Îs\u0092PÝ;\r d4Û+=@\u0012^\u00987\u0097\u0010\u001cßj\u0084®\u001d\u001c\";\u001a11§\u001aH\u0019\u0018è\u0006=@¨\u0087LÌ\u008fV4\u0096R@>\u0010\u0081h<ÂCÿQÓ\u0010Û6Ê\u009a\u0010\\n¿\u0007ÃA6Ó\u0092\\\u00868XXRå°\t\u0003\u0086\u00adà/Ì#R,<\u0005ãíÒD¢\u0088P\u008e7º\u000f:°Q\u00adp$¥ãÇ½¬\u0081ÈAWBÝÝp\u008a/¹\u0014VA¦\u0018þ(\u0089\u0096Í\u0006A`ËÃ\u0005ãÕ0\u009d½1öûYsô¼ñ\\ 6\u00122X\u0006é\u009d\u001aï(%üæ\f\u0004®0¦´dg²Ö¯Å£\u0001æ\u0010¬Ú\u0080\u0001\f\u0080ø5N@[áû\u0089\u0092:ù×\u0094:\u007f\u0090@.\u0002\u009cÕì·D\u0011\u0089Ä\u0082\u0096z\u0010rR Ít-3&d\u008c\u001cõ°Þ\u0013\u007f(\u0086Ýäé\u0082ÿ\u0083R\u0087ç¦Ð\u008d\bY©\u0082WìÍC§\u007fÏNa\u0002\u0019ý¼3³\u007fð´Þ!\u0080b}\u0010¤7¨h&®4W\u0016\u009dÊ@\u0094':²(ñ\u001a¯ý>ÿ\u0090\u001dóæ@î\u0086r¦½ó£B««ûû¥4ð!~\u0010ª2ÉAyRwSü@¨\u0010gú\u009e:\u0096æ\u0092ªPì\u0000\u0081\u0097¥\u000e×0\n~=mÑ\u0004Â\u0006\u007f\u00adG:\u001fbIxG«\u0093]ÓV¯eO¶1ZN2Ï`j\u001b\u009dÛÙ«¾§õ6\u000f¨=>\u001dÜ ë \u008b\u0082¸H£©\u008eÂ\f;äÕ³\u0080ô»!\u0014\u0003·J@pÅÈù_\u0011\u001fH c\u0093ã\u0010+øp\u008c÷IÉTcÝÎ\u0017\\²%ùÎp\u009dI\u001fßZ¼X\u0018\u0082¡\u0010ºÁ®\u0085§û\fJ\u001d\"ì\r\u001cvÌø Dn\u0097 Ñ>adp³\u001b\u0010gñ\u008aô¤,-¦s ·Ò\u009f\u008e<\u001aØ\u001b,Â\u0010lÿ](n\u0095gæ\u0085\u009f\u008cL#\u0093ÅÓ\u0010ò\u001d·\u008f\u008cÿã¶\u0002>\u0095\r¿ÀT]\u0018F\u00804'Z\b¯»¿ÓÐøÀ¼ýA<p\u0090\u0083¥\u0016-0 :Q\bB*#ÀC\u001fêZ[\u0098å²J5'\u008e\u0005\rÑ\u001fa\u001ffa>Ýz6ç8µä\u0095®ß¿ñ#\u0094¸AMÉ\fo\u009f\u008ekEÕ×t\n%\b~IÛ[k\u00adt³Õ¿åU\u008b»DCh<G\u000f;ÿ¹\u0014\u0085¤Q÷n£D FV\u000bÌ¬´OU\u0012@\u0094-ÝvòLÆÍC\u000eÐf,\u0013\u0091t#\u0083>,(ô@y\u0017\"Ö?MÚÓ\"¦úÏ\u001f\b±£ä¯å\u0019@pa¯?\u0093T0)ñ\u000eFY¡dMÞ´wúþý'À%\u0004þ¤P¹\u0091H_ÓS\u001c\u0090Õ\u0007\u0099Vü²Ã\u0010Â\u0086s>\u0017\u0093h\u0017îJÏ\u007f««\n9 ô³W¼îIWÀ\u0096ÝJ~ÓXâO0\u0016\u0091iôÛmêaeã\u0088\u0080[\u0018z(\u009a\u0092?#\u0091äHal\u0094|WnÄ\u0091\u0093ØR\u008dÈY\u0017ùê?ÓùDRWæ\u008e&\u0093Ì\u0081\u0002\u0096Tº\u0010\f°$\u001fà.Êþ¤\u0006Ê<8+¿Í\u0010Ö}:\u0090º3°;!:Ä\b\u0018W`Ð(YV:.\u0017VÚ\u009c\u008a\u0085¼ïÇt¾àÞk=|mèfoi#\u0000`§\u0081¬¤ñ±üVèêI\u008b\u0010q\u00ad:à\u0004\u0017e\u0007uµ¨5û\u008bñu\u0010¦ì\u0086B\u0089~\u0087!\u0005©ØÞ\u0093WÑ\u008f t½\u0089¸\u0088º|Ã©õîº\u0018,´Sì\u0090Ë:\u0089(\"9§<ÃI¦\u0085Õ1hoió\u0082xêP©u:V¡È\u00adëÙ^\u0087âïß¤¿\u0003÷¦¼d\u0099|O4«>&É·M¼$\u0013^V\tµ\u0082Ñe[\u0090\u008f\u0095Âµ^ô\u0006êÅLÀ\u000fÈ Ç\u001e\tð\u008e\u008aFÎÍÔÛ\u0014¹{\u000eK<d°i\u0081aT\u0081\u009bpX\u008fÑªBÝ\u0097ÉBØ\u008dM t\u0010HþÏR\u0092[\u0086É\u000e\u001dËóJá\u008e\u001bPTÝ±ÇbÈ!¹\u008cÝF2]C\u001bdû(É!\u0099K\u0087õÑ\u0001\u0002õüü)i\u0094ÇãW¯ú\b\u0007\u0080\u0014å\tòr\u0082üM\u0093èÒi\u0097W´¨\u009f\u008dgÊ\u0094\u001aÂ{ÊØµ¥¼<*$Û\u0000\u0097j¼Á98Á=N\nøS¿ü,þ\u00ad\u0083K\u008f]nZ¨è\u0087áçÆ¯\u0099EcrÔÇ×9¸þ'.±¶\u0080¡þ!\u008edv1w/Î¤§*Xò9û\u0010Hè`ÜDË\u0083gãñè³¶Ìß\" \u00853\u007f\u0082«¡\u0095\\·×÷p×sÿLû-li\u0011l\u0005\u0003\u0092@\u001c&)®ÒtpsºÌàå\u0000¸=º°b¾ÄSÉÂPáÅ\u0006©\u001d(É\u000e\u001aùôþÅ\u0019XÔä)yË\fç\u008f\u0006\u0006à\u0093INN\u008d\u009a{\u0018g¾cã\u0019\u008f2\r\u0018\u0010\"ö?¿´ùk\u00122ÒµÎ\"«Aê[\u009dfHÄâ|v :Ññ\u0003\u0093E³\u0087\u0000GÏ\u00adÇXý\u000fââ\u008eJL{¥2<q(°^N\u009dzü(\u0001\u0093\u0017Ï\b¦\u0087Å\u0005\u0014Mò¹I\bJ¢\u0015\u0081\u0016«\u008aq¬ë\u000b-\u0093ÈjXðÌ\u0018³X¹§GG\u0094zà\u009dxk6\"\u0018nïxw3%\u0019,\u0099\u0010ZL5nVFØ»\u0083£TV2=Óí";
      int var6 = "pò\u009fK©wB²ÇXjå¹\u009a¼1ÈpY\u0088]Z5×\u0010Eç\u00104\u0080\"èxz>\u0081\u00954R\u0002>(É\u0099 0X\u0099!\u0010\u009dáZ|\u0083Åð\u0013¯õ\b²Ü8\u00806\u0084½ÝN\u0013Xò0Xÿ\u000bß6\u009f\u0087Ó\u0010,oÊñ\u0080*y\b0ù}p°8|Â \u009at\u0000¼\u0082\u0002Uû\u0085ËÔ;êáô) þ\bï¥â3*8^åq\u009e\u0014}O \u009a\b¾\u008c\u008asä¬\u0099©\u0092\u0083?_M\u000bÃÈ\u0001ð½ÓaJ\u000feOðîµJg Ä,ïNáy\nÀ)\u0016\u0082¨|\u0096â8\u0095\u0013NçÚEa\u001ef\u0002!Ë¥\u001a[¥\u0010³Ü\u008f5tL%ø%\u0012,MÁÒ¾Ï\u0010çj\u001a¬Õq\u0084¥ZJiºìP4\u0082(]Éï\u008fHæ å\u0097Bd>\teG±Ö\u0015»oE¯áb\u0081\u008bÁñ¿Èh=Q\u007f»¿\u0013tÛK \u008cs\u0000\fRìcem\u0007\u0085yn9XT«Úìß\u009aa,ô\u0018Ã\u001f\u0090ÛcåH X\u0088`K¿»äVÀp§r\u00adoÈ\u0013å\u0006)bQÞ\fÏ\\\u0093\u0003¥_\u001f\u009a\u0097 lr»ndöPë\u001eÿ;g\u0004ì9Ñ\u007f\u0083\u0083Lo9\u0092¯\nl\u0087uÊdÌ\u0091 â Î\nÀ\b¤$-âVù\u007fHw/z]-\u0014Ê\u0096¹\u0006G;7Ùj'êû\u0010l¡ò½Ë4¿\u008füu\u0007»\u0087Ã\u008eþ\u0010¿õ\u0092ýå¥$\u000b\u000eÒrÔcÇ-¶\u0010á).'E\u000bf®\u0017Ì\u008e:ÿ_ÎÑ\u0010\u0014(å½(Zîú\"ý#»¥´01(H\u0097\u0002\u0017ÀxSw5¸\u001b  t]ÛÛcîvsZl\u00829½\u0007öðwK\u0090$\u0014æcÇÎ\t0\u0010&aÏ+P!º\u008a{\u0084Ö\u009e'ÏËå\u0010\"A\u0085Ð_æôU\u0088æ\b§ïn,¤\u0010xv).\u009eM\bó«ù¦Y²\u0018«¾\u0018ß\u0015\"u¼|×¢A\u009bE \n®Cqù\u009e\u00127£æ³\u001f8]4æíÀ®í_{óÔ®\u0018f\u0006\u008aQ.J\"\u0010u\u008d\u00adsòFÃ¨¬½³3ãüOÞ(\u0019\u0083K=Æ\u0018+\u001f\u0088ÿ±ªáK{RW+\u0018wÉì\u0016\u0010\u001c\u0018:\u0090Å\u0099\u0093\u0016ÞYO\u0011ê£+ú\u0002´M\u0010\u0093ÝÌE¸I6Q«\u009a6 ¦ öl\u00881øªÔ\u000bÇ«^rÙÏ+ljíyò÷>Ye\u0080(¥EM\u0012!¯_\u0086h<[yn\u0097w7\u0094µìè4Áüm9wÛ²ûÂ*òNïñqÍ¬I}þÓ\u0082\u0014\u0019ÓæGç\u0003W\u009bÜ\u000fEd´\u0002ÑãÁ_v$$Û\u0086ñg£/ní\u0000(º[\u0080ÔÒãMÌR\u0087C¸Êa*Á\u0014xÇüÌ\u0003å'Êh\u0087éÓ\u009c\u0003Æ@¯÷\u0086Ä\u0086 \u009f \u0018!\u0004-BfxÝ\u0007\u0087¹æ\u0095\u0017@ÊÔú\u009fÍ¢j\u0083\\\u008c\u0093záÍ\u0005 6#60pJ\u000b6zý5'ÓZÚõåäÙ¿\u0085äóX0þæü\n5\u001eç\u0010a£°²_¥8¡+i\u0087Ká;Ö´\u0010möÀËë\u008b¢åUºè4=Gäe\u0010ÞÌ\u0087É×ã²\u001e\f\u0087îMwPçw ×\u0082ÚÖ\u001e:a\u0011  ãàÇ£\u0093=ìØ¹Tz¹\u0018\u00905\u0005Ñ}|9\u0089'\u0010DXÞ!b¾\r¶Gê\u0083Ü\u0084W\t (hà\u008baeêÕU\u0001åJÙG®\u0005 OZ§õ¬fcHEÌ2\u001bqVGíö\u009d{!|DfA\u0010ÿ\u009ap6÷BøüiP\u001e\u000eÿ\u0007\u009fü\u0010¡\u00153rÒ\u0080\u0086^8QGêR\u0006\u0000& ¥Ï3\u008b-c6LÛüóZpRJéä?{·é,M\u001bºÚã¡Yp\u00120(ì\u0088`\b\u0007¦\u0080$åèk6\u001cÞU\u009dªQ\u0003&z¡læ5ÆÔ `\u008aÄ\u0092O¤ñæ=\\Þ\u00190\u009f¥j?\u001eö[âf§{Ä¼s\u008a\u001dZËïyoØ'&dex\u00131ÎÑüÚ\u008d\fÐ/\u0019t¬,I\u0095\u0091(QÆÃ(«ãÆ§\u001bòN\u000f\u0087:´à#å\u0087w[\u0088\u001aïdµÖÓ\u009fÕ{Tòw\u009f\u0094t'7µ\u0017áÌ\u000e(\"ä7ej\u0080ç\u009dáßä|\u0017¹ÎÚêÀàg¥ôJ»HÉ)\u0001FÂ\u0081 \\ÝÛÎ\u000eÝá¨\u0010C=\u0088Ë´ \u0017¿\u0007\u0098h\u0088\u008cM}\u008d(\u0080E\u00921<ÑVôªµ\u0088\u00ad\u0000\u009f\u008aÜ~Ê¹=Ëi\u0002pÁ\u001bL\u0006±¬\u0097ô\t>g!\u0002¢SY\u0010dE\u009aòN\u0096ó,,h$§'Èg³\u0010\u0015:A6imµny\u0018\u0000Z=\u00ad\u0005\u0004(Ê\u0097é\u0019\u0087Å\u0081Ë\u0095¯\u0092ó±®°\u009d7á@#_Îs\u0092PÝ;\r d4Û+=@\u0012^\u00987\u0097\u0010\u001cßj\u0084®\u001d\u001c\";\u001a11§\u001aH\u0019\u0018è\u0006=@¨\u0087LÌ\u008fV4\u0096R@>\u0010\u0081h<ÂCÿQÓ\u0010Û6Ê\u009a\u0010\\n¿\u0007ÃA6Ó\u0092\\\u00868XXRå°\t\u0003\u0086\u00adà/Ì#R,<\u0005ãíÒD¢\u0088P\u008e7º\u000f:°Q\u00adp$¥ãÇ½¬\u0081ÈAWBÝÝp\u008a/¹\u0014VA¦\u0018þ(\u0089\u0096Í\u0006A`ËÃ\u0005ãÕ0\u009d½1öûYsô¼ñ\\ 6\u00122X\u0006é\u009d\u001aï(%üæ\f\u0004®0¦´dg²Ö¯Å£\u0001æ\u0010¬Ú\u0080\u0001\f\u0080ø5N@[áû\u0089\u0092:ù×\u0094:\u007f\u0090@.\u0002\u009cÕì·D\u0011\u0089Ä\u0082\u0096z\u0010rR Ít-3&d\u008c\u001cõ°Þ\u0013\u007f(\u0086Ýäé\u0082ÿ\u0083R\u0087ç¦Ð\u008d\bY©\u0082WìÍC§\u007fÏNa\u0002\u0019ý¼3³\u007fð´Þ!\u0080b}\u0010¤7¨h&®4W\u0016\u009dÊ@\u0094':²(ñ\u001a¯ý>ÿ\u0090\u001dóæ@î\u0086r¦½ó£B««ûû¥4ð!~\u0010ª2ÉAyRwSü@¨\u0010gú\u009e:\u0096æ\u0092ªPì\u0000\u0081\u0097¥\u000e×0\n~=mÑ\u0004Â\u0006\u007f\u00adG:\u001fbIxG«\u0093]ÓV¯eO¶1ZN2Ï`j\u001b\u009dÛÙ«¾§õ6\u000f¨=>\u001dÜ ë \u008b\u0082¸H£©\u008eÂ\f;äÕ³\u0080ô»!\u0014\u0003·J@pÅÈù_\u0011\u001fH c\u0093ã\u0010+øp\u008c÷IÉTcÝÎ\u0017\\²%ùÎp\u009dI\u001fßZ¼X\u0018\u0082¡\u0010ºÁ®\u0085§û\fJ\u001d\"ì\r\u001cvÌø Dn\u0097 Ñ>adp³\u001b\u0010gñ\u008aô¤,-¦s ·Ò\u009f\u008e<\u001aØ\u001b,Â\u0010lÿ](n\u0095gæ\u0085\u009f\u008cL#\u0093ÅÓ\u0010ò\u001d·\u008f\u008cÿã¶\u0002>\u0095\r¿ÀT]\u0018F\u00804'Z\b¯»¿ÓÐøÀ¼ýA<p\u0090\u0083¥\u0016-0 :Q\bB*#ÀC\u001fêZ[\u0098å²J5'\u008e\u0005\rÑ\u001fa\u001ffa>Ýz6ç8µä\u0095®ß¿ñ#\u0094¸AMÉ\fo\u009f\u008ekEÕ×t\n%\b~IÛ[k\u00adt³Õ¿åU\u008b»DCh<G\u000f;ÿ¹\u0014\u0085¤Q÷n£D FV\u000bÌ¬´OU\u0012@\u0094-ÝvòLÆÍC\u000eÐf,\u0013\u0091t#\u0083>,(ô@y\u0017\"Ö?MÚÓ\"¦úÏ\u001f\b±£ä¯å\u0019@pa¯?\u0093T0)ñ\u000eFY¡dMÞ´wúþý'À%\u0004þ¤P¹\u0091H_ÓS\u001c\u0090Õ\u0007\u0099Vü²Ã\u0010Â\u0086s>\u0017\u0093h\u0017îJÏ\u007f««\n9 ô³W¼îIWÀ\u0096ÝJ~ÓXâO0\u0016\u0091iôÛmêaeã\u0088\u0080[\u0018z(\u009a\u0092?#\u0091äHal\u0094|WnÄ\u0091\u0093ØR\u008dÈY\u0017ùê?ÓùDRWæ\u008e&\u0093Ì\u0081\u0002\u0096Tº\u0010\f°$\u001fà.Êþ¤\u0006Ê<8+¿Í\u0010Ö}:\u0090º3°;!:Ä\b\u0018W`Ð(YV:.\u0017VÚ\u009c\u008a\u0085¼ïÇt¾àÞk=|mèfoi#\u0000`§\u0081¬¤ñ±üVèêI\u008b\u0010q\u00ad:à\u0004\u0017e\u0007uµ¨5û\u008bñu\u0010¦ì\u0086B\u0089~\u0087!\u0005©ØÞ\u0093WÑ\u008f t½\u0089¸\u0088º|Ã©õîº\u0018,´Sì\u0090Ë:\u0089(\"9§<ÃI¦\u0085Õ1hoió\u0082xêP©u:V¡È\u00adëÙ^\u0087âïß¤¿\u0003÷¦¼d\u0099|O4«>&É·M¼$\u0013^V\tµ\u0082Ñe[\u0090\u008f\u0095Âµ^ô\u0006êÅLÀ\u000fÈ Ç\u001e\tð\u008e\u008aFÎÍÔÛ\u0014¹{\u000eK<d°i\u0081aT\u0081\u009bpX\u008fÑªBÝ\u0097ÉBØ\u008dM t\u0010HþÏR\u0092[\u0086É\u000e\u001dËóJá\u008e\u001bPTÝ±ÇbÈ!¹\u008cÝF2]C\u001bdû(É!\u0099K\u0087õÑ\u0001\u0002õüü)i\u0094ÇãW¯ú\b\u0007\u0080\u0014å\tòr\u0082üM\u0093èÒi\u0097W´¨\u009f\u008dgÊ\u0094\u001aÂ{ÊØµ¥¼<*$Û\u0000\u0097j¼Á98Á=N\nøS¿ü,þ\u00ad\u0083K\u008f]nZ¨è\u0087áçÆ¯\u0099EcrÔÇ×9¸þ'.±¶\u0080¡þ!\u008edv1w/Î¤§*Xò9û\u0010Hè`ÜDË\u0083gãñè³¶Ìß\" \u00853\u007f\u0082«¡\u0095\\·×÷p×sÿLû-li\u0011l\u0005\u0003\u0092@\u001c&)®ÒtpsºÌàå\u0000¸=º°b¾ÄSÉÂPáÅ\u0006©\u001d(É\u000e\u001aùôþÅ\u0019XÔä)yË\fç\u008f\u0006\u0006à\u0093INN\u008d\u009a{\u0018g¾cã\u0019\u008f2\r\u0018\u0010\"ö?¿´ùk\u00122ÒµÎ\"«Aê[\u009dfHÄâ|v :Ññ\u0003\u0093E³\u0087\u0000GÏ\u00adÇXý\u000fââ\u008eJL{¥2<q(°^N\u009dzü(\u0001\u0093\u0017Ï\b¦\u0087Å\u0005\u0014Mò¹I\bJ¢\u0015\u0081\u0016«\u008aq¬ë\u000b-\u0093ÈjXðÌ\u0018³X¹§GG\u0094zà\u009dxk6\"\u0018nïxw3%\u0019,\u0099\u0010ZL5nVFØ»\u0083£TV2=Óí"
         .length();
      char var3 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[91];
                     av1 = a<"r">(9249, 6327993493395938345L ^ var9);
                     _92 = a<"r">(31060, 5589647110659883360L ^ var9);
                     h_7 = a<"r">(32603, 2245656421066327916L ^ var9);
                     yj8 = a<"r">(13264, 3070449543079234531L ^ var9);
                     zve = a<"r">(8910, 2858709017591651049L ^ var9);
                     ykr = null;
                     ctr = null;
                     r7b = false;
                     pfv = null;
                     po6 = null;
                     yt5 = null;
                     die = null;
                     hmw = null;
                     e07 = null;
                     bd_ = -1;
                     xbu = false;
                     wzj = false;
                     hih = null;
                     oq4 = c05.vz1();
                     gp2 = false;
                     yhh = null;
                     uuq = null;
                     jfb = null;
                     dz3 = 0;
                     md5 = 0;
                     shm = false;
                     g9j = false;
                     v7d = 0;
                     as6 = false;
                     _a0 = false;
                     cwd = false;
                     y8h = null;
                     dxe = 0.1F;
                     ntb = LogManager.getLogger();
                     s9r = System.getProperty(a<"r">(20257, 1081201122017605400L ^ var9), a<"r">(12558, 5560264375315826946L ^ var9))
                        .equals(a<"r">(7166, 9179695378491646969L ^ var9));
                     zn9 = null;
                     lhf = 0;
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

                  var4 = "¤\u009eÓ\u000fÒð3«þ Póé\u0000\u009b±;bHõz\u00adræ\u0087³Õåý\u0005ðô0\u0095¹¨\u0094\u0088\t²*\u0084q\u0084ý;Þ2Mt\tW\u0018\u009eé>A\u008c\u0013Å¥\u000e\nuÂÕélRúdkH6\u0013³`\u0000\fkÀ";
                  var6 = "¤\u009eÓ\u000fÒð3«þ Póé\u0000\u009b±;bHõz\u00adræ\u0087³Õåý\u0005ðô0\u0095¹¨\u0094\u0088\t²*\u0084q\u0084ý;Þ2Mt\tW\u0018\u009eé>A\u008c\u0013Å¥\u000e\nuÂÕélRúdkH6\u0013³`\u0000\fkÀ"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12124;
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
            throw new RuntimeException("hxt", var10);
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
         throw new RuntimeException("hxt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
