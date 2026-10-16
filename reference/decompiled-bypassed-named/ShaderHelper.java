import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ShaderHelper extends b0t implements ha_ {
   private static final Logger v3_;
   private static final Set __6;
   private static final Splitter oaz;
   public Minecraft f41;
   public y1w vs5;
   public int dt7;
   public int o1e;
   public List khf = Lists.newArrayList();
   public List onk = Lists.newArrayList();
   public boolean w2p;
   public owt fex;
   public cyb r_w = jsr.yk7;
   private gt4 xug;
   private int h47;
   private long x0j;
   private int kkb;
   private URI jrh;
   public boolean qaf = false;
   private static final long c;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: bipush 0
      // 06: istore 5
      // 08: iload 5
      // 0a: aload 0
      // 0b: getfield ShaderHelper.khf Ljava/util/List;
      // 0e: invokeinterface java/util/List.size ()I 1
      // 13: if_icmpge 41
      // 16: aload 0
      // 17: getfield ShaderHelper.khf Ljava/util/List;
      // 1a: iload 5
      // 1c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21: checkcast gt4
      // 24: aload 0
      // 25: getfield ShaderHelper.f41 Lc05;
      // 28: iload 1
      // 29: iload 2
      // 2a: invokevirtual gt4.drawButton (Lc05;II)V
      // 2d: iinc 5 1
      // 30: iload 4
      // 32: ifeq 44
      // 35: iload 4
      // 37: ifne 08
      // 3a: goto 41
      // 3d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: bipush 0
      // 42: istore 5
      // 44: iload 5
      // 46: aload 0
      // 47: getfield ShaderHelper.onk Ljava/util/List;
      // 4a: invokeinterface java/util/List.size ()I 1
      // 4f: if_icmpge 84
      // 52: aload 0
      // 53: getfield ShaderHelper.onk Ljava/util/List;
      // 56: iload 5
      // 58: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5d: checkcast p6a
      // 60: aload 0
      // 61: getfield ShaderHelper.f41 Lc05;
      // 64: iload 1
      // 65: iload 2
      // 66: invokevirtual p6a.bij (Lc05;II)V
      // 69: iinc 5 1
      // 6c: iload 4
      // 6e: ifeq 9b
      // 71: goto 78
      // 74: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: iload 4
      // 7a: ifne 44
      // 7d: goto 84
      // 80: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 83: athrow
      // 84: getstatic jsr.yk7 Lcyb;
      // 87: ldc ""
      // 89: nop
      // 8a: aload 0
      // 8b: getfield ShaderHelper.dt7 I
      // 8e: bipush 2
      // 8f: idiv
      // 90: i2f
      // 91: ldc 18.0
      // 93: nop
      // 94: bipush -1
      // 95: ldc 0.5
      // 97: nop
      // 98: invokevirtual cyb.amd (Ljava/lang/String;FFIF)V
      // 9b: return
   }

   public void dig(char param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: bipush 1
      // 06: if_icmpne 37
      // 09: aload 0
      // 0a: getfield ShaderHelper.f41 Lc05;
      // 0d: aconst_null
      // 0e: checkcast ShaderHelper
      // 11: invokevirtual Minecraft.z2i (Lgbe;)V
      // 14: aload 0
      // 15: getfield ShaderHelper.f41 Lc05;
      // 18: getfield Minecraft.u0y Lgbe;
      // 1b: iload 3
      // 1c: ifeq 31
      // 1f: goto 26
      // 22: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: ifnonnull 37
      // 29: goto 30
      // 2c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield ShaderHelper.f41 Lc05;
      // 34: invokevirtual Minecraft.aa4 ()V
      // 37: return
   }

   public static String b0r() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: invokestatic java/awt/Toolkit.getDefaultToolkit ()Ljava/awt/Toolkit;
      // 07: invokevirtual java/awt/Toolkit.getSystemClipboard ()Ljava/awt/datatransfer/Clipboard;
      // 0a: aconst_null
      // 0b: invokevirtual java/awt/datatransfer/Clipboard.getContents (Ljava/lang/Object;)Ljava/awt/datatransfer/Transferable;
      // 0e: astore 1
      // 0f: aload 1
      // 10: iload 0
      // 11: ifne 1f
      // 14: ifnull 49
      // 17: goto 1e
      // 1a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 22: iload 0
      // 23: ifne 40
      // 26: invokeinterface java/awt/datatransfer/Transferable.isDataFlavorSupported (Ljava/awt/datatransfer/DataFlavor;)Z 2
      // 2b: ifeq 49
      // 2e: goto 35
      // 31: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 1
      // 36: getstatic java/awt/datatransfer/DataFlavor.stringFlavor Ljava/awt/datatransfer/DataFlavor;
      // 39: goto 40
      // 3c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: invokeinterface java/awt/datatransfer/Transferable.getTransferData (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object; 2
      // 45: checkcast java/lang/String
      // 48: areturn
      // 49: goto 4d
      // 4c: astore 1
      // 4d: ldc ""
      // 4f: nop
      // 50: areturn
   }

   public static void vjv(String var0) {
      if (!StringUtils.isEmpty(var0)) {
         try {
            StringSelection var1 = new StringSelection(var0);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, (ClipboardOwner)null);
         } catch (Exception var2) {
         }
      }
   }

   public void i5k(erg param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: getfield ShaderHelper.f41 Lc05;
      // 05: getfield Minecraft.vg8 Ll86;
      // 08: aload 0
      // 09: getfield ShaderHelper.f41 Lc05;
      // 0c: getfield Minecraft.oxn Lmoh;
      // 0f: getfield moh.dvp Z
      // 12: invokevirtual erg.rlk (Lha9;Z)Ljava/util/List;
      // 15: astore 5
      // 17: invokestatic OpaquePredicate.b ()I
      // 1a: bipush 0
      // 1b: istore 6
      // 1d: istore 4
      // 1f: iload 6
      // 21: aload 5
      // 23: invokeinterface java/util/List.size ()I 1
      // 28: if_icmpge a1
      // 2b: iload 6
      // 2d: ifne 69
      // 30: aload 5
      // 32: iload 6
      // 34: new java/lang/StringBuilder
      // 37: dup
      // 38: invokespecial java/lang/StringBuilder.<init> ()V
      // 3b: aload 1
      // 3c: invokevirtual erg.tu8 ()Lb64;
      // 3f: getfield b64.j0k Lsyo;
      // 42: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 45: aload 5
      // 47: iload 6
      // 49: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4e: checkcast java/lang/String
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 57: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 5c: pop
      // 5d: iload 4
      // 5f: ifne 99
      // 62: goto 69
      // 65: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 5
      // 6b: iload 6
      // 6d: new java/lang/StringBuilder
      // 70: dup
      // 71: invokespecial java/lang/StringBuilder.<init> ()V
      // 74: getstatic syo.qiz Lsyo;
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7a: aload 5
      // 7c: iload 6
      // 7e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 83: checkcast java/lang/String
      // 86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8c: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 91: pop
      // 92: goto 99
      // 95: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: iinc 6 1
      // 9c: iload 4
      // 9e: ifne 1f
      // a1: aload 0
      // a2: aload 5
      // a4: iload 2
      // a5: iload 3
      // a6: invokevirtual ShaderHelper.rxr (Ljava/util/List;II)V
      // a9: return
   }

   public void xhs(String var1, int var2, int var3) {
      this.rxr(Arrays.asList(var1), var2, var3);
   }

   public void rxr(List param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: invokeinterface java/util/List.isEmpty ()Z 1
      // 00b: iload 4
      // 00d: ifeq 02e
      // 010: ifne 2bf
      // 013: goto 01a
      // 016: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 019: athrow
      // 01a: invokestatic hzu.eiq ()V
      // 01d: invokestatic qpm.cng ()V
      // 020: invokestatic hzu.fpt ()V
      // 023: invokestatic hzu._o4 ()V
      // 026: bipush 0
      // 027: goto 02e
      // 02a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02d: athrow
      // 02e: istore 5
      // 030: aload 1
      // 031: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 036: astore 6
      // 038: aload 6
      // 03a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03f: ifeq 081
      // 042: aload 6
      // 044: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 049: checkcast java/lang/String
      // 04c: astore 7
      // 04e: aload 0
      // 04f: getfield ShaderHelper.fex Lowt;
      // 052: aload 7
      // 054: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 057: istore 8
      // 059: iload 8
      // 05b: iload 4
      // 05d: ifeq 07a
      // 060: iload 5
      // 062: iload 4
      // 064: ifeq 084
      // 067: goto 06e
      // 06a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: if_icmple 07c
      // 071: goto 078
      // 074: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: iload 8
      // 07a: istore 5
      // 07c: iload 4
      // 07e: ifne 038
      // 081: iload 2
      // 082: bipush 12
      // 084: iadd
      // 085: istore 6
      // 087: iload 3
      // 088: bipush 12
      // 08a: isub
      // 08b: istore 7
      // 08d: bipush 8
      // 08f: istore 8
      // 091: aload 1
      // 092: invokeinterface java/util/List.size ()I 1
      // 097: bipush 1
      // 098: iload 4
      // 09a: ifeq 0c2
      // 09d: if_icmple 0b9
      // 0a0: goto 0a7
      // 0a3: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: iload 8
      // 0a9: bipush 2
      // 0aa: aload 1
      // 0ab: invokeinterface java/util/List.size ()I 1
      // 0b0: bipush 1
      // 0b1: isub
      // 0b2: bipush 10
      // 0b4: imul
      // 0b5: iadd
      // 0b6: iadd
      // 0b7: istore 8
      // 0b9: iload 6
      // 0bb: iload 5
      // 0bd: iadd
      // 0be: aload 0
      // 0bf: getfield ShaderHelper.dt7 I
      // 0c2: iload 4
      // 0c4: ifeq 0f3
      // 0c7: if_icmple 0db
      // 0ca: goto 0d1
      // 0cd: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: iload 6
      // 0d3: bipush 28
      // 0d5: iload 5
      // 0d7: iadd
      // 0d8: isub
      // 0d9: istore 6
      // 0db: iload 7
      // 0dd: iload 8
      // 0df: iadd
      // 0e0: bipush 6
      // 0e2: iadd
      // 0e3: iload 4
      // 0e5: ifeq 116
      // 0e8: aload 0
      // 0e9: getfield ShaderHelper.o1e I
      // 0ec: goto 0f3
      // 0ef: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: if_icmple 102
      // 0f6: aload 0
      // 0f7: getfield ShaderHelper.o1e I
      // 0fa: iload 8
      // 0fc: isub
      // 0fd: bipush 6
      // 0ff: isub
      // 100: istore 7
      // 102: aload 0
      // 103: ldc 300.0
      // 105: nop
      // 106: putfield ShaderHelper.o3s F
      // 109: aload 0
      // 10a: getfield ShaderHelper.vs5 Ly1w;
      // 10d: ldc 300.0
      // 10f: nop
      // 110: putfield y1w.b3l F
      // 113: ldc -267386864
      // 115: nop
      // 116: istore 9
      // 118: aload 0
      // 119: iload 6
      // 11b: bipush 3
      // 11c: isub
      // 11d: iload 7
      // 11f: bipush 4
      // 120: isub
      // 121: iload 6
      // 123: iload 5
      // 125: iadd
      // 126: bipush 3
      // 127: iadd
      // 128: iload 7
      // 12a: bipush 3
      // 12b: isub
      // 12c: iload 9
      // 12e: iload 9
      // 130: invokevirtual ShaderHelper.flp (IIIIII)V
      // 133: aload 0
      // 134: iload 6
      // 136: bipush 3
      // 137: isub
      // 138: iload 7
      // 13a: iload 8
      // 13c: iadd
      // 13d: bipush 3
      // 13e: iadd
      // 13f: iload 6
      // 141: iload 5
      // 143: iadd
      // 144: bipush 3
      // 145: iadd
      // 146: iload 7
      // 148: iload 8
      // 14a: iadd
      // 14b: bipush 4
      // 14c: iadd
      // 14d: iload 9
      // 14f: iload 9
      // 151: invokevirtual ShaderHelper.flp (IIIIII)V
      // 154: aload 0
      // 155: iload 6
      // 157: bipush 3
      // 158: isub
      // 159: iload 7
      // 15b: bipush 3
      // 15c: isub
      // 15d: iload 6
      // 15f: iload 5
      // 161: iadd
      // 162: bipush 3
      // 163: iadd
      // 164: iload 7
      // 166: iload 8
      // 168: iadd
      // 169: bipush 3
      // 16a: iadd
      // 16b: iload 9
      // 16d: iload 9
      // 16f: invokevirtual ShaderHelper.flp (IIIIII)V
      // 172: aload 0
      // 173: iload 6
      // 175: bipush 4
      // 176: isub
      // 177: iload 7
      // 179: bipush 3
      // 17a: isub
      // 17b: iload 6
      // 17d: bipush 3
      // 17e: isub
      // 17f: iload 7
      // 181: iload 8
      // 183: iadd
      // 184: bipush 3
      // 185: iadd
      // 186: iload 9
      // 188: iload 9
      // 18a: invokevirtual ShaderHelper.flp (IIIIII)V
      // 18d: aload 0
      // 18e: iload 6
      // 190: iload 5
      // 192: iadd
      // 193: bipush 3
      // 194: iadd
      // 195: iload 7
      // 197: bipush 3
      // 198: isub
      // 199: iload 6
      // 19b: iload 5
      // 19d: iadd
      // 19e: bipush 4
      // 19f: iadd
      // 1a0: iload 7
      // 1a2: iload 8
      // 1a4: iadd
      // 1a5: bipush 3
      // 1a6: iadd
      // 1a7: iload 9
      // 1a9: iload 9
      // 1ab: invokevirtual ShaderHelper.flp (IIIIII)V
      // 1ae: ldc 1347420415
      // 1b0: nop
      // 1b1: istore 10
      // 1b3: iload 10
      // 1b5: ldc 16711422
      // 1b7: nop
      // 1b8: iand
      // 1b9: bipush 1
      // 1ba: ishr
      // 1bb: iload 10
      // 1bd: ldc -16777216
      // 1bf: nop
      // 1c0: iand
      // 1c1: ior
      // 1c2: istore 11
      // 1c4: aload 0
      // 1c5: iload 6
      // 1c7: bipush 3
      // 1c8: isub
      // 1c9: iload 7
      // 1cb: bipush 3
      // 1cc: isub
      // 1cd: bipush 1
      // 1ce: iadd
      // 1cf: iload 6
      // 1d1: bipush 3
      // 1d2: isub
      // 1d3: bipush 1
      // 1d4: iadd
      // 1d5: iload 7
      // 1d7: iload 8
      // 1d9: iadd
      // 1da: bipush 3
      // 1db: iadd
      // 1dc: bipush 1
      // 1dd: isub
      // 1de: iload 10
      // 1e0: iload 11
      // 1e2: invokevirtual ShaderHelper.flp (IIIIII)V
      // 1e5: aload 0
      // 1e6: iload 6
      // 1e8: iload 5
      // 1ea: iadd
      // 1eb: bipush 2
      // 1ec: iadd
      // 1ed: iload 7
      // 1ef: bipush 3
      // 1f0: isub
      // 1f1: bipush 1
      // 1f2: iadd
      // 1f3: iload 6
      // 1f5: iload 5
      // 1f7: iadd
      // 1f8: bipush 3
      // 1f9: iadd
      // 1fa: iload 7
      // 1fc: iload 8
      // 1fe: iadd
      // 1ff: bipush 3
      // 200: iadd
      // 201: bipush 1
      // 202: isub
      // 203: iload 10
      // 205: iload 11
      // 207: invokevirtual ShaderHelper.flp (IIIIII)V
      // 20a: aload 0
      // 20b: iload 6
      // 20d: bipush 3
      // 20e: isub
      // 20f: iload 7
      // 211: bipush 3
      // 212: isub
      // 213: iload 6
      // 215: iload 5
      // 217: iadd
      // 218: bipush 3
      // 219: iadd
      // 21a: iload 7
      // 21c: bipush 3
      // 21d: isub
      // 21e: bipush 1
      // 21f: iadd
      // 220: iload 10
      // 222: iload 10
      // 224: invokevirtual ShaderHelper.flp (IIIIII)V
      // 227: aload 0
      // 228: iload 6
      // 22a: bipush 3
      // 22b: isub
      // 22c: iload 7
      // 22e: iload 8
      // 230: iadd
      // 231: bipush 2
      // 232: iadd
      // 233: iload 6
      // 235: iload 5
      // 237: iadd
      // 238: bipush 3
      // 239: iadd
      // 23a: iload 7
      // 23c: iload 8
      // 23e: iadd
      // 23f: bipush 3
      // 240: iadd
      // 241: iload 11
      // 243: iload 11
      // 245: invokevirtual ShaderHelper.flp (IIIIII)V
      // 248: bipush 0
      // 249: istore 12
      // 24b: iload 12
      // 24d: aload 1
      // 24e: invokeinterface java/util/List.size ()I 1
      // 253: if_icmpge 2a6
      // 256: aload 1
      // 257: iload 12
      // 259: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 25e: checkcast java/lang/String
      // 261: astore 13
      // 263: aload 0
      // 264: getfield ShaderHelper.fex Lowt;
      // 267: aload 13
      // 269: iload 6
      // 26b: i2f
      // 26c: iload 7
      // 26e: i2f
      // 26f: bipush -1
      // 270: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 273: pop
      // 274: iload 4
      // 276: ifeq 2bc
      // 279: iload 4
      // 27b: ifeq 2a1
      // 27e: goto 285
      // 281: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 284: athrow
      // 285: iload 12
      // 287: ifne 29b
      // 28a: goto 291
      // 28d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 290: athrow
      // 291: iinc 7 2
      // 294: goto 29b
      // 297: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29a: athrow
      // 29b: iinc 7 10
      // 29e: iinc 12 1
      // 2a1: iload 4
      // 2a3: ifne 24b
      // 2a6: aload 0
      // 2a7: fconst_0
      // 2a8: putfield ShaderHelper.o3s F
      // 2ab: aload 0
      // 2ac: getfield ShaderHelper.vs5 Ly1w;
      // 2af: fconst_0
      // 2b0: putfield y1w.b3l F
      // 2b3: invokestatic hzu.s7q ()V
      // 2b6: invokestatic hzu.m45 ()V
      // 2b9: invokestatic qpm.ne_ ()V
      // 2bc: invokestatic hzu.ixc ()V
      // 2bf: return
   }

   public void p0k(ekw param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ShaderHelper.c J
      // 003: ldc2_w 21325126377410
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: aload 1
      // 00f: iload 6
      // 011: ifne 01f
      // 014: ifnull 405
      // 017: goto 01e
      // 01a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 1
      // 01f: invokeinterface ekw.f4q ()Lpoy; 1
      // 024: invokevirtual poy.rmx ()Lxq3;
      // 027: iload 6
      // 029: ifne 046
      // 02c: ifnull 405
      // 02f: goto 036
      // 032: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 035: athrow
      // 036: aload 1
      // 037: invokeinterface ekw.f4q ()Lpoy; 1
      // 03c: invokevirtual poy.rmx ()Lxq3;
      // 03f: goto 046
      // 042: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: astore 7
      // 048: aload 7
      // 04a: invokevirtual xq3.q2q ()Lxq3$e6b;
      // 04d: getstatic xq3$e6b.m2u Lxq3$e6b;
      // 050: iload 6
      // 052: ifne 0f7
      // 055: if_acmpne 0e8
      // 058: goto 05f
      // 05b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aconst_null
      // 060: astore 8
      // 062: aload 7
      // 064: invokevirtual xq3.ejk ()Lekw;
      // 067: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 06c: invokestatic sza.mft (Ljava/lang/String;)Lbdo;
      // 06f: astore 9
      // 071: aload 9
      // 073: iload 6
      // 075: ifne 091
      // 078: instanceof bdo
      // 07b: ifeq 096
      // 07e: goto 085
      // 081: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 084: athrow
      // 085: aload 9
      // 087: checkcast bdo
      // 08a: goto 091
      // 08d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: invokestatic erg.qog (Lbdo;)Lerg;
      // 094: astore 8
      // 096: goto 09b
      // 099: astore 9
      // 09b: aload 8
      // 09d: ifnull 0b4
      // 0a0: aload 0
      // 0a1: aload 8
      // 0a3: iload 2
      // 0a4: iload 3
      // 0a5: invokevirtual ShaderHelper.i5k (Lerg;II)V
      // 0a8: iload 6
      // 0aa: ifeq 0e3
      // 0ad: goto 0b4
      // 0b0: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: new java/lang/StringBuilder
      // 0b8: dup
      // 0b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bc: getstatic syo.aez Lsyo;
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c2: sipush 30548
      // 0c5: ldc2_w 7199117320126418956
      // 0c8: lload 4
      // 0ca: lxor
      // 0cb: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d7: iload 2
      // 0d8: iload 3
      // 0d9: invokevirtual ShaderHelper.xhs (Ljava/lang/String;II)V
      // 0dc: goto 0e3
      // 0df: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e2: athrow
      // 0e3: iload 6
      // 0e5: ifeq 402
      // 0e8: aload 7
      // 0ea: invokevirtual xq3.q2q ()Lxq3$e6b;
      // 0ed: getstatic xq3$e6b.p4n Lxq3$e6b;
      // 0f0: goto 0f7
      // 0f3: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: iload 6
      // 0f9: ifne 276
      // 0fc: if_acmpne 267
      // 0ff: goto 106
      // 102: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 105: athrow
      // 106: aload 0
      // 107: getfield ShaderHelper.f41 Lc05;
      // 10a: getfield Minecraft.oxn Lmoh;
      // 10d: getfield moh.dvp Z
      // 110: ifeq 402
      // 113: goto 11a
      // 116: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 7
      // 11c: invokevirtual xq3.ejk ()Lekw;
      // 11f: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 124: invokestatic sza.mft (Ljava/lang/String;)Lbdo;
      // 127: astore 8
      // 129: aload 8
      // 12b: instanceof bdo
      // 12e: ifeq 206
      // 131: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 134: astore 9
      // 136: aload 8
      // 138: checkcast bdo
      // 13b: astore 10
      // 13d: aload 9
      // 13f: aload 10
      // 141: sipush 9669
      // 144: ldc2_w 8799393738374611597
      // 147: lload 4
      // 149: lxor
      // 14a: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: nop
      // 150: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 153: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 158: pop
      // 159: aload 10
      // 15b: sipush 28892
      // 15e: ldc2_w 2382944543878502293
      // 161: lload 4
      // 163: lxor
      // 164: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: nop
      // 16a: bipush 8
      // 16c: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 16f: iload 6
      // 171: ifne 1f8
      // 174: ifeq 1dd
      // 177: goto 17e
      // 17a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: aload 10
      // 180: sipush 16387
      // 183: ldc2_w 7225064492869510997
      // 186: lload 4
      // 188: lxor
      // 189: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: nop
      // 18f: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 192: astore 11
      // 194: aload 9
      // 196: new java/lang/StringBuilder
      // 199: dup
      // 19a: invokespecial java/lang/StringBuilder.<init> ()V
      // 19d: sipush 25648
      // 1a0: ldc2_w 7271860412991128428
      // 1a3: lload 4
      // 1a5: lxor
      // 1a6: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: nop
      // 1ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1af: aload 11
      // 1b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b4: sipush 28798
      // 1b7: ldc2_w 2176879302857217828
      // 1ba: lload 4
      // 1bc: lxor
      // 1bd: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: nop
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c6: aload 11
      // 1c8: invokestatic y65.cff (Ljava/lang/String;)I
      // 1cb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ce: ldc ")"
      // 1d0: nop
      // 1d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1dc: pop
      // 1dd: aload 9
      // 1df: aload 10
      // 1e1: sipush 15333
      // 1e4: ldc2_w 7167917600905567409
      // 1e7: lload 4
      // 1e9: lxor
      // 1ea: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: nop
      // 1f0: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 1f3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1f8: pop
      // 1f9: aload 0
      // 1fa: aload 9
      // 1fc: iload 2
      // 1fd: iload 3
      // 1fe: invokevirtual ShaderHelper.rxr (Ljava/util/List;II)V
      // 201: iload 6
      // 203: ifeq 235
      // 206: aload 0
      // 207: new java/lang/StringBuilder
      // 20a: dup
      // 20b: invokespecial java/lang/StringBuilder.<init> ()V
      // 20e: getstatic syo.aez Lsyo;
      // 211: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 214: sipush 14309
      // 217: ldc2_w 4833920400215740599
      // 21a: lload 4
      // 21c: lxor
      // 21d: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: nop
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 226: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 229: iload 2
      // 22a: iload 3
      // 22b: invokevirtual ShaderHelper.xhs (Ljava/lang/String;II)V
      // 22e: goto 235
      // 231: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 234: athrow
      // 235: goto 402
      // 238: astore 8
      // 23a: aload 0
      // 23b: new java/lang/StringBuilder
      // 23e: dup
      // 23f: invokespecial java/lang/StringBuilder.<init> ()V
      // 242: getstatic syo.aez Lsyo;
      // 245: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 248: sipush 10479
      // 24b: ldc2_w 8032358147664023461
      // 24e: lload 4
      // 250: lxor
      // 251: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: nop
      // 257: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 25d: iload 2
      // 25e: iload 3
      // 25f: invokevirtual ShaderHelper.xhs (Ljava/lang/String;II)V
      // 262: iload 6
      // 264: ifeq 402
      // 267: aload 7
      // 269: invokevirtual xq3.q2q ()Lxq3$e6b;
      // 26c: getstatic xq3$e6b.yh_ Lxq3$e6b;
      // 26f: goto 276
      // 272: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 275: athrow
      // 276: iload 6
      // 278: ifne 2c2
      // 27b: if_acmpne 2a7
      // 27e: goto 285
      // 281: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 284: athrow
      // 285: aload 0
      // 286: getstatic ShaderHelper.oaz Lcom/google/common/base/Splitter;
      // 289: aload 7
      // 28b: invokevirtual xq3.ejk ()Lekw;
      // 28e: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 293: invokevirtual com/google/common/base/Splitter.splitToList (Ljava/lang/CharSequence;)Ljava/util/List;
      // 296: iload 2
      // 297: iload 3
      // 298: invokevirtual ShaderHelper.rxr (Ljava/util/List;II)V
      // 29b: iload 6
      // 29d: ifeq 402
      // 2a0: goto 2a7
      // 2a3: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a6: athrow
      // 2a7: aload 7
      // 2a9: iload 6
      // 2ab: ifne 2c7
      // 2ae: goto 2b5
      // 2b1: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b4: athrow
      // 2b5: invokevirtual xq3.q2q ()Lxq3$e6b;
      // 2b8: getstatic xq3$e6b.igw Lxq3$e6b;
      // 2bb: goto 2c2
      // 2be: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: if_acmpne 402
      // 2c5: aload 7
      // 2c7: invokevirtual xq3.ejk ()Lekw;
      // 2ca: invokeinterface ekw.rnh ()Ljava/lang/String; 1
      // 2cf: invokestatic l9p._02 (Ljava/lang/String;)L_ss;
      // 2d2: astore 8
      // 2d4: aload 8
      // 2d6: iload 6
      // 2d8: ifne 2e7
      // 2db: ifnull 3d3
      // 2de: goto 2e5
      // 2e1: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e4: athrow
      // 2e5: aload 8
      // 2e7: invokevirtual _ss.xn7 ()Lekw;
      // 2ea: astore 9
      // 2ec: new hsu
      // 2ef: dup
      // 2f0: new java/lang/StringBuilder
      // 2f3: dup
      // 2f4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f7: sipush 24971
      // 2fa: ldc2_w 7860419803303790279
      // 2fd: lload 4
      // 2ff: lxor
      // 300: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: nop
      // 306: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 309: aload 8
      // 30b: invokevirtual _ss.koi ()Z
      // 30e: ifeq 327
      // 311: sipush 24799
      // 314: ldc2_w 654191362026915727
      // 317: lload 4
      // 319: lxor
      // 31a: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: nop
      // 320: goto 336
      // 323: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 326: athrow
      // 327: sipush 2848
      // 32a: ldc2_w 5896419813655522411
      // 32d: lload 4
      // 32f: lxor
      // 330: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: nop
      // 336: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 339: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 33c: bipush 0
      // 33d: anewarray 182
      // 340: invokespecial hsu.<init> (Ljava/lang/String;[Ljava/lang/Object;)V
      // 343: astore 10
      // 345: aload 10
      // 347: invokeinterface ekw.f4q ()Lpoy; 1
      // 34c: bipush 1
      // 34d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 350: invokevirtual poy.e53 (Ljava/lang/Boolean;)Lpoy;
      // 353: pop
      // 354: aload 8
      // 356: iload 6
      // 358: ifne 371
      // 35b: instanceof l7l
      // 35e: ifeq 37a
      // 361: goto 368
      // 364: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 367: athrow
      // 368: aload 8
      // 36a: goto 371
      // 36d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 370: athrow
      // 371: checkcast l7l
      // 374: invokevirtual l7l.h7c ()Ljava/lang/String;
      // 377: goto 37b
      // 37a: aconst_null
      // 37b: astore 11
      // 37d: bipush 2
      // 37e: anewarray 4
      // 381: dup
      // 382: bipush 0
      // 383: aload 9
      // 385: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 38a: aastore
      // 38b: dup
      // 38c: bipush 1
      // 38d: aload 10
      // 38f: invokeinterface ekw._2o ()Ljava/lang/String; 1
      // 394: aastore
      // 395: invokestatic com/google/common/collect/Lists.newArrayList ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 398: astore 12
      // 39a: iload 6
      // 39c: ifne 3ce
      // 39f: aload 11
      // 3a1: ifnull 3c6
      // 3a4: goto 3ab
      // 3a7: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3aa: athrow
      // 3ab: aload 12
      // 3ad: aload 0
      // 3ae: getfield ShaderHelper.fex Lowt;
      // 3b1: aload 11
      // 3b3: sipush 150
      // 3b6: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 3b9: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 3be: pop
      // 3bf: goto 3c6
      // 3c2: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c5: athrow
      // 3c6: aload 0
      // 3c7: aload 12
      // 3c9: iload 2
      // 3ca: iload 3
      // 3cb: invokevirtual ShaderHelper.rxr (Ljava/util/List;II)V
      // 3ce: iload 6
      // 3d0: ifeq 402
      // 3d3: aload 0
      // 3d4: new java/lang/StringBuilder
      // 3d7: dup
      // 3d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 3db: getstatic syo.aez Lsyo;
      // 3de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3e1: sipush 28406
      // 3e4: ldc2_w 6039705578410494393
      // 3e7: lload 4
      // 3e9: lxor
      // 3ea: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ef: nop
      // 3f0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f6: iload 2
      // 3f7: iload 3
      // 3f8: invokevirtual ShaderHelper.xhs (Ljava/lang/String;II)V
      // 3fb: goto 402
      // 3fe: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 401: athrow
      // 402: invokestatic hzu.fpt ()V
      // 405: return
   }

   public void rzw(String var1, boolean var2) {
   }

   public boolean owq(ekw param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ShaderHelper.c J
      // 003: ldc2_w 88915482791991
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: iload 4
      // 010: ifeq 024
      // 013: ifnonnull 023
      // 016: goto 01d
      // 019: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01c: athrow
      // 01d: bipush 0
      // 01e: ireturn
      // 01f: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: aload 1
      // 024: invokeinterface ekw.f4q ()Lpoy; 1
      // 029: invokevirtual poy.d6b ()Ltgr;
      // 02c: astore 5
      // 02e: invokestatic ShaderHelper.dmk ()Z
      // 031: ifeq 061
      // 034: aload 1
      // 035: invokeinterface ekw.f4q ()Lpoy; 1
      // 03a: invokevirtual poy.r7b ()Ljava/lang/String;
      // 03d: ifnull 30d
      // 040: goto 047
      // 043: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: aload 0
      // 048: aload 1
      // 049: invokeinterface ekw.f4q ()Lpoy; 1
      // 04e: invokevirtual poy.r7b ()Ljava/lang/String;
      // 051: bipush 0
      // 052: invokevirtual ShaderHelper.rzw (Ljava/lang/String;Z)V
      // 055: iload 4
      // 057: ifne 30d
      // 05a: goto 061
      // 05d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 5
      // 063: iload 4
      // 065: ifeq 07b
      // 068: goto 06f
      // 06b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: ifnull 30d
      // 072: goto 079
      // 075: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: aload 5
      // 07b: invokevirtual tgr.vex ()Ltgr$a3_;
      // 07e: getstatic tgr$a3_.nk6 Ltgr$a3_;
      // 081: iload 4
      // 083: ifeq 1ce
      // 086: if_acmpne 1bf
      // 089: goto 090
      // 08c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield ShaderHelper.f41 Lc05;
      // 094: getfield Minecraft.oxn Lmoh;
      // 097: getfield moh.oz3 Z
      // 09a: iload 4
      // 09c: ifeq 0b1
      // 09f: goto 0a6
      // 0a2: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: ifne 0b2
      // 0a9: goto 0b0
      // 0ac: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0af: athrow
      // 0b0: bipush 0
      // 0b1: ireturn
      // 0b2: new java/net/URI
      // 0b5: dup
      // 0b6: aload 5
      // 0b8: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 0bb: invokespecial java/net/URI.<init> (Ljava/lang/String;)V
      // 0be: astore 6
      // 0c0: aload 6
      // 0c2: invokevirtual java/net/URI.getScheme ()Ljava/lang/String;
      // 0c5: astore 7
      // 0c7: aload 7
      // 0c9: ifnonnull 0eb
      // 0cc: new java/net/URISyntaxException
      // 0cf: dup
      // 0d0: aload 5
      // 0d2: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 0d5: sipush 24736
      // 0d8: ldc2_w 594738164616693764
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: invokespecial java/net/URISyntaxException.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0e6: athrow
      // 0e7: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: getstatic ShaderHelper.__6 Ljava/util/Set;
      // 0ee: aload 7
      // 0f0: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 0f3: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0f8: iload 4
      // 0fa: ifeq 151
      // 0fd: ifne 13b
      // 100: goto 107
      // 103: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: new java/net/URISyntaxException
      // 10a: dup
      // 10b: aload 5
      // 10d: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 110: new java/lang/StringBuilder
      // 113: dup
      // 114: invokespecial java/lang/StringBuilder.<init> ()V
      // 117: sipush 5477
      // 11a: ldc2_w 451843715171712455
      // 11d: lload 2
      // 11e: lxor
      // 11f: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: nop
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 128: aload 7
      // 12a: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 133: invokespecial java/net/URISyntaxException.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 136: athrow
      // 137: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: aload 0
      // 13c: iload 4
      // 13e: ifeq 186
      // 141: getfield ShaderHelper.f41 Lc05;
      // 144: getfield Minecraft.oxn Lmoh;
      // 147: getfield moh._ip Z
      // 14a: goto 151
      // 14d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: ifeq 17e
      // 154: aload 0
      // 155: aload 6
      // 157: putfield ShaderHelper.jrh Ljava/net/URI;
      // 15a: aload 0
      // 15b: getfield ShaderHelper.f41 Lc05;
      // 15e: new rt5
      // 161: dup
      // 162: aload 0
      // 163: aload 5
      // 165: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 168: ldc 31102009
      // 16a: nop
      // 16b: bipush 0
      // 16c: invokespecial rt5.<init> (Lha_;Ljava/lang/String;IZ)V
      // 16f: invokevirtual Minecraft.z2i (Lgbe;)V
      // 172: iload 4
      // 174: ifne 18b
      // 177: goto 17e
      // 17a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: aload 0
      // 17f: goto 186
      // 182: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: aload 6
      // 188: invokespecial ShaderHelper._7t (Ljava/net/URI;)V
      // 18b: goto 30b
      // 18e: astore 6
      // 190: getstatic ShaderHelper.v3_ Lorg/apache/logging/log4j/Logger;
      // 193: new java/lang/StringBuilder
      // 196: dup
      // 197: invokespecial java/lang/StringBuilder.<init> ()V
      // 19a: sipush 23819
      // 19d: ldc2_w 8059480072608789923
      // 1a0: lload 2
      // 1a1: lxor
      // 1a2: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: nop
      // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ab: aload 5
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b3: aload 6
      // 1b5: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 1ba: iload 4
      // 1bc: ifne 30b
      // 1bf: aload 5
      // 1c1: invokevirtual tgr.vex ()Ltgr$a3_;
      // 1c4: getstatic tgr$a3_.r71 Ltgr$a3_;
      // 1c7: goto 1ce
      // 1ca: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: iload 4
      // 1d0: ifeq 208
      // 1d3: if_acmpne 1f9
      // 1d6: goto 1dd
      // 1d9: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dc: athrow
      // 1dd: new java/io/File
      // 1e0: dup
      // 1e1: aload 5
      // 1e3: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 1e6: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 1e9: invokevirtual java/io/File.toURI ()Ljava/net/URI;
      // 1ec: astore 6
      // 1ee: aload 0
      // 1ef: aload 6
      // 1f1: invokespecial ShaderHelper._7t (Ljava/net/URI;)V
      // 1f4: iload 4
      // 1f6: ifne 30b
      // 1f9: aload 5
      // 1fb: invokevirtual tgr.vex ()Ltgr$a3_;
      // 1fe: getstatic tgr$a3_.y5i Ltgr$a3_;
      // 201: goto 208
      // 204: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 207: athrow
      // 208: iload 4
      // 20a: ifeq 23c
      // 20d: if_acmpne 22d
      // 210: goto 217
      // 213: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: aload 0
      // 218: aload 5
      // 21a: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 21d: bipush 1
      // 21e: invokevirtual ShaderHelper.rzw (Ljava/lang/String;Z)V
      // 221: iload 4
      // 223: ifne 30b
      // 226: goto 22d
      // 229: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: aload 5
      // 22f: invokevirtual tgr.vex ()Ltgr$a3_;
      // 232: getstatic tgr$a3_.qms Ltgr$a3_;
      // 235: goto 23c
      // 238: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: iload 4
      // 23e: ifeq 270
      // 241: if_acmpne 261
      // 244: goto 24b
      // 247: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24a: athrow
      // 24b: aload 0
      // 24c: aload 5
      // 24e: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 251: bipush 0
      // 252: invokevirtual ShaderHelper.k1_ (Ljava/lang/String;Z)V
      // 255: iload 4
      // 257: ifne 30b
      // 25a: goto 261
      // 25d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 260: athrow
      // 261: aload 5
      // 263: invokevirtual tgr.vex ()Ltgr$a3_;
      // 266: getstatic tgr$a3_.m_f Ltgr$a3_;
      // 269: goto 270
      // 26c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26f: athrow
      // 270: if_acmpne 2dc
      // 273: aload 0
      // 274: getfield ShaderHelper.f41 Lc05;
      // 277: invokevirtual Minecraft.vnk ()Ltyh;
      // 27a: aload 5
      // 27c: invokevirtual tgr.uxt ()Ljava/lang/String;
      // 27f: invokeinterface tyh.tmi (Ljava/lang/String;)Ltv/twitch/chat/ChatUserInfo; 2
      // 284: astore 6
      // 286: iload 4
      // 288: ifeq 2b5
      // 28b: aload 6
      // 28d: ifnull 2ba
      // 290: goto 297
      // 293: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 296: athrow
      // 297: aload 0
      // 298: getfield ShaderHelper.f41 Lc05;
      // 29b: new ger
      // 29e: dup
      // 29f: aload 0
      // 2a0: getfield ShaderHelper.f41 Lc05;
      // 2a3: invokevirtual Minecraft.vnk ()Ltyh;
      // 2a6: aload 6
      // 2a8: invokespecial ger.<init> (Ltyh;Ltv/twitch/chat/ChatUserInfo;)V
      // 2ab: invokevirtual Minecraft.z2i (Lgbe;)V
      // 2ae: goto 2b5
      // 2b1: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b4: athrow
      // 2b5: iload 4
      // 2b7: ifne 2d7
      // 2ba: getstatic ShaderHelper.v3_ Lorg/apache/logging/log4j/Logger;
      // 2bd: sipush 20556
      // 2c0: ldc2_w 3617544432044882144
      // 2c3: lload 2
      // 2c4: lxor
      // 2c5: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: nop
      // 2cb: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 2d0: goto 2d7
      // 2d3: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d6: athrow
      // 2d7: iload 4
      // 2d9: ifne 30b
      // 2dc: getstatic ShaderHelper.v3_ Lorg/apache/logging/log4j/Logger;
      // 2df: new java/lang/StringBuilder
      // 2e2: dup
      // 2e3: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e6: sipush 24745
      // 2e9: ldc2_w 5441297599892490249
      // 2ec: lload 2
      // 2ed: lxor
      // 2ee: invokedynamic d (IJ)Ljava/lang/String; bsm=ShaderHelper.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: nop
      // 2f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f7: aload 5
      // 2f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ff: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 304: goto 30b
      // 307: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30a: athrow
      // 30b: bipush 1
      // 30c: ireturn
      // 30d: bipush 0
      // 30e: ireturn
   }

   public void sendChatMessage(String var1) {
      this.k1_(var1, true);
   }

   public void k1_(String var1, boolean var2) {
      try {
         if (var2) {
            this.f41.t43.lcg().k3x(var1);
         }
      } catch (oov var3) {
         throw b(var3);
      }

      this.f41.vg8.vf0(var1);
   }

   public void mouseClicked(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: iload 3
      // 06: iload 4
      // 08: ifeq 16
      // 0b: ifne 77
      // 0e: goto 15
      // 11: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: bipush 0
      // 16: istore 5
      // 18: iload 5
      // 1a: aload 0
      // 1b: getfield ShaderHelper.khf Ljava/util/List;
      // 1e: invokeinterface java/util/List.size ()I 1
      // 23: if_icmpge 77
      // 26: aload 0
      // 27: getfield ShaderHelper.khf Ljava/util/List;
      // 2a: iload 5
      // 2c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 31: checkcast gt4
      // 34: astore 6
      // 36: iload 4
      // 38: ifeq 72
      // 3b: aload 6
      // 3d: aload 0
      // 3e: getfield ShaderHelper.f41 Lc05;
      // 41: iload 1
      // 42: iload 2
      // 43: invokevirtual gt4.mousePressed (Lc05;II)Z
      // 46: ifeq 6f
      // 49: goto 50
      // 4c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 6
      // 53: putfield ShaderHelper.xug Lgt4;
      // 56: aload 6
      // 58: aload 0
      // 59: getfield ShaderHelper.f41 Lc05;
      // 5c: invokevirtual Minecraft.yp9 ()Ldbu;
      // 5f: invokevirtual gt4.f06 (Ldbu;)V
      // 62: aload 0
      // 63: aload 6
      // 65: invokevirtual ShaderHelper.actionPerformed (Lgt4;)V
      // 68: goto 6f
      // 6b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e: athrow
      // 6f: iinc 5 1
      // 72: iload 4
      // 74: ifne 18
      // 77: return
   }

   public void w1m(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield ShaderHelper.xug Lgt4;
      // 04: ifnull 27
      // 07: iload 3
      // 08: ifne 27
      // 0b: goto 12
      // 0e: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11: athrow
      // 12: aload 0
      // 13: getfield ShaderHelper.xug Lgt4;
      // 16: iload 1
      // 17: iload 2
      // 18: invokevirtual gt4.mouseReleased (II)V
      // 1b: aload 0
      // 1c: aconst_null
      // 1d: putfield ShaderHelper.xug Lgt4;
      // 20: goto 27
      // 23: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: return
   }

   public void i_r(int var1, int var2, int var3, long var4) {
   }

   public void actionPerformed(gt4 var1) {
   }

   public void kky(Minecraft var1, int var2, int var3) {
      this.f41 = var1;
      this.vs5 = var1.jiu();
      this.fex = var1.tx1;
      this.dt7 = var2;
      this.o1e = var3;
      this.khf.clear();
      this.initGui();
   }

   public void ymj(int var1, int var2) {
      this.dt7 = var1;
      this.o1e = var2;
   }

   public void initGui() {
   }

   public void r1_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic org/lwjgl/input/Mouse.isCreated ()Z
      // 07: iload 1
      // 08: ifeq 38
      // 0b: ifeq 35
      // 0e: goto 15
      // 11: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: invokestatic org/lwjgl/input/Mouse.next ()Z
      // 18: ifeq 35
      // 1b: goto 22
      // 1e: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual ShaderHelper.handleMouseInput ()V
      // 26: iload 1
      // 27: ifeq 5b
      // 2a: iload 1
      // 2b: ifne 15
      // 2e: goto 35
      // 31: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: invokestatic org/lwjgl/input/Keyboard.isCreated ()Z
      // 38: iload 1
      // 39: ifeq 49
      // 3c: ifeq 5b
      // 3f: goto 46
      // 42: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: invokestatic org/lwjgl/input/Keyboard.next ()Z
      // 49: ifeq 5b
      // 4c: aload 0
      // 4d: invokevirtual ShaderHelper.tvr ()V
      // 50: iload 1
      // 51: ifne 46
      // 54: goto 5b
      // 57: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: return
   }

   public void handleMouseInput() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic org/lwjgl/input/Mouse.getEventX ()I
      // 003: aload 0
      // 004: getfield ShaderHelper.dt7 I
      // 007: imul
      // 008: aload 0
      // 009: getfield ShaderHelper.f41 Lc05;
      // 00c: getfield Minecraft.pfr I
      // 00f: idiv
      // 010: istore 2
      // 011: invokestatic OpaquePredicate.b ()I
      // 014: aload 0
      // 015: getfield ShaderHelper.o1e I
      // 018: invokestatic org/lwjgl/input/Mouse.getEventY ()I
      // 01b: aload 0
      // 01c: getfield ShaderHelper.o1e I
      // 01f: imul
      // 020: aload 0
      // 021: getfield ShaderHelper.f41 Lc05;
      // 024: getfield Minecraft.ry7 I
      // 027: idiv
      // 028: isub
      // 029: bipush 1
      // 02a: isub
      // 02b: istore 3
      // 02c: istore 1
      // 02d: invokestatic org/lwjgl/input/Mouse.getEventButton ()I
      // 030: istore 4
      // 032: invokestatic org/lwjgl/input/Mouse.getEventButtonState ()Z
      // 035: iload 1
      // 036: ifeq 0ab
      // 039: ifeq 0a2
      // 03c: goto 043
      // 03f: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: aload 0
      // 044: iload 1
      // 045: ifeq 095
      // 048: goto 04f
      // 04b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: getfield ShaderHelper.f41 Lc05;
      // 052: getfield Minecraft.oxn Lmoh;
      // 055: getfield moh.mg8 Z
      // 058: ifeq 087
      // 05b: goto 062
      // 05e: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 0
      // 063: dup
      // 064: getfield ShaderHelper.kkb I
      // 067: iload 1
      // 068: ifeq 096
      // 06b: goto 072
      // 06e: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 071: athrow
      // 072: dup_x1
      // 073: bipush 1
      // 074: iadd
      // 075: putfield ShaderHelper.kkb I
      // 078: ifle 087
      // 07b: goto 082
      // 07e: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: return
      // 083: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: aload 0
      // 088: iload 4
      // 08a: putfield ShaderHelper.h47 I
      // 08d: aload 0
      // 08e: invokestatic Minecraft.qgs ()J
      // 091: putfield ShaderHelper.x0j J
      // 094: aload 0
      // 095: iload 2
      // 096: iload 3
      // 097: aload 0
      // 098: getfield ShaderHelper.h47 I
      // 09b: invokevirtual ShaderHelper.mouseClicked (III)V
      // 09e: iload 1
      // 09f: ifne 161
      // 0a2: iload 4
      // 0a4: goto 0ab
      // 0a7: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: bipush -1
      // 0ac: iload 1
      // 0ad: ifeq 126
      // 0b0: if_icmpeq 10f
      // 0b3: goto 0ba
      // 0b6: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: iload 1
      // 0bc: ifeq 104
      // 0bf: goto 0c6
      // 0c2: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: getfield ShaderHelper.f41 Lc05;
      // 0c9: getfield Minecraft.oxn Lmoh;
      // 0cc: getfield moh.mg8 Z
      // 0cf: ifeq 0fe
      // 0d2: goto 0d9
      // 0d5: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield ShaderHelper.kkb I
      // 0de: bipush 1
      // 0df: isub
      // 0e0: iload 1
      // 0e1: ifeq 105
      // 0e4: goto 0eb
      // 0e7: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: dup_x1
      // 0ec: putfield ShaderHelper.kkb I
      // 0ef: ifle 0fe
      // 0f2: goto 0f9
      // 0f5: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: return
      // 0fa: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: bipush -1
      // 100: putfield ShaderHelper.h47 I
      // 103: aload 0
      // 104: iload 2
      // 105: iload 3
      // 106: iload 4
      // 108: invokevirtual ShaderHelper.w1m (III)V
      // 10b: iload 1
      // 10c: ifne 161
      // 10f: aload 0
      // 110: getfield ShaderHelper.h47 I
      // 113: iload 1
      // 114: ifeq 141
      // 117: goto 11e
      // 11a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: bipush -1
      // 11f: goto 126
      // 122: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 125: athrow
      // 126: if_icmpeq 161
      // 129: aload 0
      // 12a: getfield ShaderHelper.x0j J
      // 12d: lconst_0
      // 12e: iload 1
      // 12f: ifeq 152
      // 132: goto 139
      // 135: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: lcmp
      // 13a: goto 141
      // 13d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: ifle 161
      // 144: invokestatic Minecraft.qgs ()J
      // 147: aload 0
      // 148: getfield ShaderHelper.x0j J
      // 14b: goto 152
      // 14e: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 151: athrow
      // 152: lsub
      // 153: lstore 5
      // 155: aload 0
      // 156: iload 2
      // 157: iload 3
      // 158: aload 0
      // 159: getfield ShaderHelper.h47 I
      // 15c: lload 5
      // 15e: invokevirtual ShaderHelper.i_r (IIIJ)V
      // 161: return
   }

   public void tvr() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic org/lwjgl/input/Keyboard.getEventCharacter ()C
      // 07: istore 2
      // 08: invokestatic org/lwjgl/input/Keyboard.getEventKey ()I
      // 0b: iload 1
      // 0c: ifeq 3b
      // 0f: ifne 31
      // 12: goto 19
      // 15: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: iload 2
      // 1a: iload 1
      // 1b: ifeq 3b
      // 1e: goto 25
      // 21: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: bipush 32
      // 27: if_icmpge 3e
      // 2a: goto 31
      // 2d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: invokestatic org/lwjgl/input/Keyboard.getEventKeyState ()Z
      // 34: goto 3b
      // 37: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: ifeq 4d
      // 3e: aload 0
      // 3f: iload 2
      // 40: invokestatic org/lwjgl/input/Keyboard.getEventKey ()I
      // 43: invokevirtual ShaderHelper.dig (CI)V
      // 46: goto 4d
      // 49: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield ShaderHelper.f41 Lc05;
      // 51: invokevirtual Minecraft.vef ()V
      // 54: return
   }

   public void updateScreen() {
   }

   public void onGuiClosed() {
   }

   public void xmz() {
      this.wpw(0);
   }

   public void wpw(int param1) {
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
      // 05: iload 2
      // 06: ifne 40
      // 09: getfield ShaderHelper.f41 Lc05;
      // 0c: getfield Minecraft.tij Lkh3;
      // 0f: ifnull 38
      // 12: goto 19
      // 15: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 0
      // 1a: bipush 0
      // 1b: bipush 0
      // 1c: aload 0
      // 1d: getfield ShaderHelper.dt7 I
      // 20: aload 0
      // 21: getfield ShaderHelper.o1e I
      // 24: ldc -1072689136
      // 26: nop
      // 27: ldc -804253680
      // 29: nop
      // 2a: invokevirtual ShaderHelper.flp (IIIIII)V
      // 2d: iload 2
      // 2e: ifeq 44
      // 31: goto 38
      // 34: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 0
      // 39: goto 40
      // 3c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f: athrow
      // 40: iload 1
      // 41: invokevirtual ShaderHelper.g76 (I)V
      // 44: return
   }

   public void g76(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: getstatic ClientState.vnx Lcn7;
      // 007: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 00a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00d: ifne 070
      // 010: getstatic ClientState.qkk Lzwr;
      // 013: iload 2
      // 014: ifeq 02b
      // 017: goto 01e
      // 01a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: ifnull 070
      // 021: goto 028
      // 024: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: getstatic ClientState.qkk Lzwr;
      // 02b: getfield ClientState.cw_ Lg5m;
      // 02e: ifnull 070
      // 031: aload 0
      // 032: getfield ShaderHelper.qaf Z
      // 035: ifne 070
      // 038: goto 03f
      // 03b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03e: athrow
      // 03f: getstatic ClientState.qkk Lzwr;
      // 042: getfield ClientState.cw_ Lg5m;
      // 045: aload 0
      // 046: getfield ShaderHelper.dt7 I
      // 049: aload 0
      // 04a: getfield ShaderHelper.o1e I
      // 04d: invokevirtual ShaderProgram.iyv (II)V
      // 050: fconst_0
      // 051: fconst_0
      // 052: aload 0
      // 053: getfield ShaderHelper.dt7 I
      // 056: i2f
      // 057: aload 0
      // 058: getfield ShaderHelper.o1e I
      // 05b: i2f
      // 05c: getstatic z7e.ret Lz7e;
      // 05f: getfield z7e.k0y I
      // 062: ldc 0.1
      // 064: nop
      // 065: invokestatic hhf.kjo (IF)I
      // 068: invokestatic hhf.cuu (FFFFI)V
      // 06b: return
      // 06c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: invokestatic hzu.fpt ()V
      // 073: invokestatic hzu.gcp ()V
      // 076: invokestatic jom.yut ()Ljom;
      // 079: astore 3
      // 07a: aload 3
      // 07b: invokevirtual jom.zuq ()Lq3g;
      // 07e: astore 4
      // 080: aload 0
      // 081: getfield ShaderHelper.f41 Lc05;
      // 084: invokevirtual Minecraft.l22 ()Llc5;
      // 087: getstatic ShaderHelper.yby Lgdz;
      // 08a: invokevirtual lc5.anl (Lgdz;)V
      // 08d: fconst_1
      // 08e: fconst_1
      // 08f: fconst_1
      // 090: fconst_1
      // 091: invokestatic hzu.wn0 (FFFF)V
      // 094: ldc 32.0
      // 096: nop
      // 097: fstore 5
      // 099: aload 4
      // 09b: bipush 7
      // 09d: getstatic gnl.rad Lbe7;
      // 0a0: invokevirtual q3g.ezr (ILbe7;)V
      // 0a3: aload 4
      // 0a5: dconst_0
      // 0a6: aload 0
      // 0a7: getfield ShaderHelper.o1e I
      // 0aa: i2d
      // 0ab: dconst_0
      // 0ac: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0af: dconst_0
      // 0b0: aload 0
      // 0b1: getfield ShaderHelper.o1e I
      // 0b4: i2f
      // 0b5: ldc 32.0
      // 0b7: nop
      // 0b8: fdiv
      // 0b9: iload 1
      // 0ba: i2f
      // 0bb: fadd
      // 0bc: f2d
      // 0bd: invokevirtual q3g.h0a (DD)Lq3g;
      // 0c0: bipush 64
      // 0c2: bipush 64
      // 0c4: bipush 64
      // 0c6: sipush 255
      // 0c9: invokevirtual q3g.fje (IIII)Lq3g;
      // 0cc: invokevirtual q3g.pzw ()V
      // 0cf: aload 4
      // 0d1: aload 0
      // 0d2: getfield ShaderHelper.dt7 I
      // 0d5: i2d
      // 0d6: aload 0
      // 0d7: getfield ShaderHelper.o1e I
      // 0da: i2d
      // 0db: dconst_0
      // 0dc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0df: aload 0
      // 0e0: getfield ShaderHelper.dt7 I
      // 0e3: i2f
      // 0e4: ldc 32.0
      // 0e6: nop
      // 0e7: fdiv
      // 0e8: f2d
      // 0e9: aload 0
      // 0ea: getfield ShaderHelper.o1e I
      // 0ed: i2f
      // 0ee: ldc 32.0
      // 0f0: nop
      // 0f1: fdiv
      // 0f2: iload 1
      // 0f3: i2f
      // 0f4: fadd
      // 0f5: f2d
      // 0f6: invokevirtual q3g.h0a (DD)Lq3g;
      // 0f9: bipush 64
      // 0fb: bipush 64
      // 0fd: bipush 64
      // 0ff: sipush 255
      // 102: invokevirtual q3g.fje (IIII)Lq3g;
      // 105: invokevirtual q3g.pzw ()V
      // 108: aload 4
      // 10a: aload 0
      // 10b: getfield ShaderHelper.dt7 I
      // 10e: i2d
      // 10f: dconst_0
      // 110: dconst_0
      // 111: invokevirtual q3g.g5o (DDD)Lq3g;
      // 114: aload 0
      // 115: getfield ShaderHelper.dt7 I
      // 118: i2f
      // 119: ldc 32.0
      // 11b: nop
      // 11c: fdiv
      // 11d: f2d
      // 11e: iload 1
      // 11f: i2d
      // 120: invokevirtual q3g.h0a (DD)Lq3g;
      // 123: bipush 64
      // 125: bipush 64
      // 127: bipush 64
      // 129: sipush 255
      // 12c: invokevirtual q3g.fje (IIII)Lq3g;
      // 12f: invokevirtual q3g.pzw ()V
      // 132: aload 4
      // 134: dconst_0
      // 135: dconst_0
      // 136: dconst_0
      // 137: invokevirtual q3g.g5o (DDD)Lq3g;
      // 13a: dconst_0
      // 13b: iload 1
      // 13c: i2d
      // 13d: invokevirtual q3g.h0a (DD)Lq3g;
      // 140: bipush 64
      // 142: bipush 64
      // 144: bipush 64
      // 146: sipush 255
      // 149: invokevirtual q3g.fje (IIII)Lq3g;
      // 14c: invokevirtual q3g.pzw ()V
      // 14f: aload 3
      // 150: invokevirtual jom.q7g ()V
      // 153: return
   }

   public boolean a99() {
      return true;
   }

   @Override
   public void confirmClicked(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifeq 1e
      // 09: ldc 31102009
      // 0b: nop
      // 0c: if_icmpne 3d
      // 0f: goto 16
      // 12: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: iload 1
      // 17: goto 1e
      // 1a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: ifeq 30
      // 21: aload 0
      // 22: aload 0
      // 23: getfield ShaderHelper.jrh Ljava/net/URI;
      // 26: invokespecial ShaderHelper._7t (Ljava/net/URI;)V
      // 29: goto 30
      // 2c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: aload 0
      // 31: aconst_null
      // 32: putfield ShaderHelper.jrh Ljava/net/URI;
      // 35: aload 0
      // 36: getfield ShaderHelper.f41 Lc05;
      // 39: aload 0
      // 3a: invokevirtual Minecraft.z2i (Lgbe;)V
      // 3d: return
   }

   private void _7t(URI var1) {
      long var2 = c ^ 113722149222733L;

      try {
         Class var4 = Class.forName(a<"d">(27905, 6498170531599019203L ^ var2));
         Object var5 = var4.getMethod(a<"d">(14856, 6035547530811259868L ^ var2)).invoke(null);
         var4.getMethod(a<"d">(5437, 8411440110025413869L ^ var2), URI.class).invoke(var5, var1);
      } catch (Throwable var6) {
         v3_.error(a<"d">(3814, 1611529710506741562L ^ var2), var6);
      }
   }

   public static boolean t_s() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: getstatic Minecraft.go6 Z
      // 07: iload 0
      // 08: ifne 58
      // 0b: ifeq 53
      // 0e: goto 15
      // 11: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: sipush 219
      // 18: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 1b: iload 0
      // 1c: ifne 4c
      // 1f: goto 26
      // 22: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: ifne 4b
      // 29: goto 30
      // 2c: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f: athrow
      // 30: sipush 220
      // 33: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 36: iload 0
      // 37: ifne 50
      // 3a: goto 41
      // 3d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: ifeq 4f
      // 44: goto 4b
      // 47: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 86
      // 4f: bipush 0
      // 50: goto 86
      // 53: bipush 29
      // 55: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 58: iload 0
      // 59: ifne 82
      // 5c: ifne 81
      // 5f: goto 66
      // 62: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65: athrow
      // 66: sipush 157
      // 69: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 6c: iload 0
      // 6d: ifne 82
      // 70: goto 77
      // 73: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 76: athrow
      // 77: ifeq 85
      // 7a: goto 81
      // 7d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   public static boolean dmk() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: bipush 42
      // 06: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 09: iload 0
      // 0a: ifne 32
      // 0d: ifne 31
      // 10: goto 17
      // 13: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: bipush 54
      // 19: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 1c: iload 0
      // 1d: ifne 32
      // 20: goto 27
      // 23: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: ifeq 35
      // 2a: goto 31
      // 2d: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   public static boolean zwv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: bipush 56
      // 06: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 09: iload 0
      // 0a: ifne 33
      // 0d: ifne 32
      // 10: goto 17
      // 13: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: sipush 184
      // 1a: invokestatic org/lwjgl/input/Keyboard.isKeyDown (I)Z
      // 1d: iload 0
      // 1e: ifne 33
      // 21: goto 28
      // 24: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27: athrow
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public static boolean uqk(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 1f
      // 09: bipush 45
      // 0b: if_icmpne 53
      // 0e: goto 15
      // 11: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: invokestatic ShaderHelper.t_s ()Z
      // 18: goto 1f
      // 1b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: iload 1
      // 20: ifeq 30
      // 23: ifeq 53
      // 26: goto 2d
      // 29: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic ShaderHelper.dmk ()Z
      // 30: iload 1
      // 31: ifeq 41
      // 34: ifne 53
      // 37: goto 3e
      // 3a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: invokestatic ShaderHelper.zwv ()Z
      // 41: iload 1
      // 42: ifeq 50
      // 45: ifne 53
      // 48: goto 4f
      // 4b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   public static boolean foo(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 1f
      // 09: bipush 47
      // 0b: if_icmpne 53
      // 0e: goto 15
      // 11: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: invokestatic ShaderHelper.t_s ()Z
      // 18: goto 1f
      // 1b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: iload 1
      // 20: ifne 30
      // 23: ifeq 53
      // 26: goto 2d
      // 29: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic ShaderHelper.dmk ()Z
      // 30: iload 1
      // 31: ifne 41
      // 34: ifne 53
      // 37: goto 3e
      // 3a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: invokestatic ShaderHelper.zwv ()Z
      // 41: iload 1
      // 42: ifne 50
      // 45: ifne 53
      // 48: goto 4f
      // 4b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   public static boolean y4j(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 1f
      // 09: bipush 46
      // 0b: if_icmpne 53
      // 0e: goto 15
      // 11: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: invokestatic ShaderHelper.t_s ()Z
      // 18: goto 1f
      // 1b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: iload 1
      // 20: ifeq 30
      // 23: ifeq 53
      // 26: goto 2d
      // 29: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic ShaderHelper.dmk ()Z
      // 30: iload 1
      // 31: ifeq 41
      // 34: ifne 53
      // 37: goto 3e
      // 3a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: invokestatic ShaderHelper.zwv ()Z
      // 41: iload 1
      // 42: ifeq 50
      // 45: ifne 53
      // 48: goto 4f
      // 4b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   public static boolean ul2(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifne 1f
      // 09: bipush 30
      // 0b: if_icmpne 53
      // 0e: goto 15
      // 11: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: invokestatic ShaderHelper.t_s ()Z
      // 18: goto 1f
      // 1b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: iload 1
      // 20: ifne 30
      // 23: ifeq 53
      // 26: goto 2d
      // 29: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: invokestatic ShaderHelper.dmk ()Z
      // 30: iload 1
      // 31: ifne 41
      // 34: ifne 53
      // 37: goto 3e
      // 3a: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: invokestatic ShaderHelper.zwv ()Z
      // 41: iload 1
      // 42: ifne 50
      // 45: ifne 53
      // 48: goto 4f
      // 4b: invokestatic ShaderHelper.b (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   public void scw(Minecraft var1, int var2, int var3) {
      this.kky(var1, var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6720658882070982854L, -2618426089970512196L, MethodHandles.lookup().lookupClass()).a(153382870606547L);
      // $VF: monitorexit
      c = var10000;
      long var9 = c ^ 67844544528035L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[24];
      int var5 = 0;
      String var4 = "I*\u0015tæ)ÀàY\u0081M\u0091Ó-ç2ÍbÞÀÆ\u0013\u009ad[ì\u001d¿J¦\u0001z\u000b\u0018Qs\u0096·\u00ad\u0095\u00103:\u001fóTàlâ\u0015ç%\u001dàÓ\u0092@\u0010Û<\u009d²¥#«þ\u0015\u0097Û\u0014\u008e\u0099´\u0087\u0010È6ºº/ç<½(\u0011EÇR@\u0089ÑX\u0087é¯ã\u009bÕ\u009d\u009d\u0017\u0080÷\nxÃ\u009a\u007fS\u0080ÙàÌr×ÙÃ½ü\u008a&Y6P\n\u0082LøÐ\n'6\u008aö\t#ãþ\"@¹á7Üj>Nv\u0098\fÅµÂ\\ÇGÊÜv\u0087¤\u0099\u00adçùÕ\u008cæIÛEø>ôéÀæ£\u0093ñ\u0018\u0091Ò÷\u00809Ñ-t\u0081z\u0013#\u0001'H\u0083à7\u0000\nUÙ¸{ 0\u0005¬»ëï#ë¶Õs_ñ\u000fã_\tJëçBN?SJÛTZÔ\u008flì\u0010ÓIóQ]_¹\u001fì%õ~\u000f\u0087\u0085Ï8Âcæ|\u008d\u0003\u0084\u0090x\u0019\u001d\u0016\u0001fn\u0092·AEdó\u0015Çª\u0000ØÝòVÈ\u0098Iê´a\u0084èú=\\à\u001b\u0010\rCiÑfí\u001fx\u0089\u008cô\u001a\u0006\u0010o;])\u0094\u0090\u009c'LJY³ñÚV£0ùj¤±|q\u0092úÌ;ÖX0\u009fd6çè\u0081êá±\u00144xÐ\u000f¦¨ö¯\fÈÍY\u0089u¨ó\u0010ñéÅþY\b_³\u0010G\u0086\u0082\u000bHî$\u0003©\u0091ºÄñyÎv(ü.ítÇôk«\"íf\n\u0094\t\u009dõ£DEÀ\u0006y\u0001±ÓIi\u0095æ«ø¯Fd¥^uw²)  vÑ\u0010Ý2Ó|/H¦l\u0082nî+ðä\b\u0081\u008f\u008e(l\u009b|\u0012^a°;²(dATY¢k,\u0084«¹5-×I\u009cÛ\u0004äíJ\u009a\u0092øã+;©Â]U`¾Î\b2¤·\u001c9û \u008d\u008fÞà\u001aÚ\u0095¸\u0005ÿð5´¯6ÓV²¯ö\u0097\u0093=¿0%\u000e/õ¬:¨(Ë{äeV6ï.K\u0004ñ\u0001i\u0081$8\u0096\u001adù¾\u00135q,\u0019\u009a}\u001bCè\u0085aà±2\u0010i\u0089È(Kþ¬Ù£\u001d§Vw\u0010öq÷ëñ³\u009e!l8\u0084~Á#Ó\u0002Êã^qX\u008a\"p{ S^Bw0\u0012à<P\u0013\u000b \u0095ó\u0013\u0092Êï\u001a\u0005Þ8%F\u009e®²Mv\u0092dI¹\u0094DèÔ<\u009eúM°¬,»º\u00849A¨<©·\u0010\u009bxæ%®\u0083\u0085÷öI\u001eÆS\u0086(\u0097\u0010ÿ[V/,øÆ\u0018\u000e\\\u0001I.-9¥\u0010Ýdc U~ýn\\\u009d\u0087%w»wÄ";
      int var6 = "I*\u0015tæ)ÀàY\u0081M\u0091Ó-ç2ÍbÞÀÆ\u0013\u009ad[ì\u001d¿J¦\u0001z\u000b\u0018Qs\u0096·\u00ad\u0095\u00103:\u001fóTàlâ\u0015ç%\u001dàÓ\u0092@\u0010Û<\u009d²¥#«þ\u0015\u0097Û\u0014\u008e\u0099´\u0087\u0010È6ºº/ç<½(\u0011EÇR@\u0089ÑX\u0087é¯ã\u009bÕ\u009d\u009d\u0017\u0080÷\nxÃ\u009a\u007fS\u0080ÙàÌr×ÙÃ½ü\u008a&Y6P\n\u0082LøÐ\n'6\u008aö\t#ãþ\"@¹á7Üj>Nv\u0098\fÅµÂ\\ÇGÊÜv\u0087¤\u0099\u00adçùÕ\u008cæIÛEø>ôéÀæ£\u0093ñ\u0018\u0091Ò÷\u00809Ñ-t\u0081z\u0013#\u0001'H\u0083à7\u0000\nUÙ¸{ 0\u0005¬»ëï#ë¶Õs_ñ\u000fã_\tJëçBN?SJÛTZÔ\u008flì\u0010ÓIóQ]_¹\u001fì%õ~\u000f\u0087\u0085Ï8Âcæ|\u008d\u0003\u0084\u0090x\u0019\u001d\u0016\u0001fn\u0092·AEdó\u0015Çª\u0000ØÝòVÈ\u0098Iê´a\u0084èú=\\à\u001b\u0010\rCiÑfí\u001fx\u0089\u008cô\u001a\u0006\u0010o;])\u0094\u0090\u009c'LJY³ñÚV£0ùj¤±|q\u0092úÌ;ÖX0\u009fd6çè\u0081êá±\u00144xÐ\u000f¦¨ö¯\fÈÍY\u0089u¨ó\u0010ñéÅþY\b_³\u0010G\u0086\u0082\u000bHî$\u0003©\u0091ºÄñyÎv(ü.ítÇôk«\"íf\n\u0094\t\u009dõ£DEÀ\u0006y\u0001±ÓIi\u0095æ«ø¯Fd¥^uw²)  vÑ\u0010Ý2Ó|/H¦l\u0082nî+ðä\b\u0081\u008f\u008e(l\u009b|\u0012^a°;²(dATY¢k,\u0084«¹5-×I\u009cÛ\u0004äíJ\u009a\u0092øã+;©Â]U`¾Î\b2¤·\u001c9û \u008d\u008fÞà\u001aÚ\u0095¸\u0005ÿð5´¯6ÓV²¯ö\u0097\u0093=¿0%\u000e/õ¬:¨(Ë{äeV6ï.K\u0004ñ\u0001i\u0081$8\u0096\u001adù¾\u00135q,\u0019\u009a}\u001bCè\u0085aà±2\u0010i\u0089È(Kþ¬Ù£\u001d§Vw\u0010öq÷ëñ³\u009e!l8\u0084~Á#Ó\u0002Êã^qX\u008a\"p{ S^Bw0\u0012à<P\u0013\u000b \u0095ó\u0013\u0092Êï\u001a\u0005Þ8%F\u009e®²Mv\u0092dI¹\u0094DèÔ<\u009eúM°¬,»º\u00849A¨<©·\u0010\u009bxæ%®\u0083\u0085÷öI\u001eÆS\u0086(\u0097\u0010ÿ[V/,øÆ\u0018\u000e\\\u0001I.-9¥\u0010Ýdc U~ýn\\\u009d\u0087%w»wÄ"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     e = new String[24];
                     v3_ = LogManager.getLogger();
                     __6 = Sets.newHashSet(new String[]{a<"d">(29010, 2413336464025892717L ^ var9), a<"d">(23679, 5457176798490335824L ^ var9)});
                     oaz = Splitter.on('\n');
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

                  var4 = "\u0092éJ\u0085\u0014\n\u0094Òú _²\u0087¡MH\u007fyth\\ c f\u0007ï\u00ad\u0004\u0007t¼ ~ËF¬Íø\u008a\u0001aÀ¦\u009dsR\u008c\u001d7eÔÔ\u008fejMî®GzP\u001f¯D";
                  var6 = "\u0092éJ\u0085\u0014\n\u0094Òú _²\u0087¡MH\u007fyth\\ c f\u0007ï\u00ad\u0004\u0007t¼ ~ËF¬Íø\u008a\u0001aÀ¦\u009dsR\u008c\u001d7eÔÔ\u008fejMî®GzP\u001f¯D"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception b(Exception var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6288;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ShaderHelper", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("ShaderHelper" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
