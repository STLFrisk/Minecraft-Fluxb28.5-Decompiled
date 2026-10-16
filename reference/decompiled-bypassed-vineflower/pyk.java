import com.google.common.collect.Maps;
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
import net.minecraft.block.BlockJukebox$TileEntityJukebox;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.tileentity.TileEntityComparator;
import net.minecraft.tileentity.TileEntityDaylightDetector;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.tileentity.TileEntityEndPortal;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.tileentity.TileEntitySkull;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class pyk {
   private static final Logger a4e;
   private static Map je8;
   private static Map mis;
   public t9d yh_;
   public mew al2 = mew._9b;
   public boolean hn_;
   private int a_s = -1;
   public e0x j8_;
   private static final long c;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   private static void rb3(Class var0, String var1) {
      long var2 = c ^ 29379024775387L;

      try {
         if (je8.containsKey(var1)) {
            throw new IllegalArgumentException(a<"m">(2081, 2309634917178579535L ^ var2) + var1);
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      je8.put(var1, var0);
      mis.put(var0, var1);
   }

   public t9d yi7() {
      return this.yh_;
   }

   public void _cg(t9d var1) {
      this.yh_ = var1;
   }

   public boolean g8i() {
      try {
         if (this.yh_ != null) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw a(var1);
      }

      return false;
   }

   public void agl(bdo var1) {
      this.al2 = new mew(var1.uz7("x"), var1.uz7("y"), var1.uz7("z"));
   }

   public void m2a(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pyk.c J
      // 03: ldc2_w 198173207897
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: getstatic pyk.mis Ljava/util/Map;
      // 10: aload 0
      // 11: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 14: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 19: checkcast java/lang/String
      // 1c: astore 5
      // 1e: iload 4
      // 20: ifeq 9b
      // 23: aload 5
      // 25: ifnonnull 5d
      // 28: goto 2f
      // 2b: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: new java/lang/RuntimeException
      // 32: dup
      // 33: new java/lang/StringBuilder
      // 36: dup
      // 37: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a: aload 0
      // 3b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 3e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 41: sipush 7473
      // 44: ldc2_w 4753453655189080776
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: nop
      // 4f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 52: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 55: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 58: athrow
      // 59: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: aload 1
      // 5e: sipush 10362
      // 61: ldc2_w 3957261724367421318
      // 64: lload 2
      // 65: lxor
      // 66: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: nop
      // 6c: aload 5
      // 6e: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 71: aload 1
      // 72: ldc "x"
      // 74: nop
      // 75: aload 0
      // 76: getfield pyk.al2 Lmew;
      // 79: invokevirtual mew.getX ()I
      // 7c: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 7f: aload 1
      // 80: ldc "y"
      // 82: nop
      // 83: aload 0
      // 84: getfield pyk.al2 Lmew;
      // 87: invokevirtual mew.getY ()I
      // 8a: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 8d: aload 1
      // 8e: ldc "z"
      // 90: nop
      // 91: aload 0
      // 92: getfield pyk.al2 Lmew;
      // 95: invokevirtual mew.getZ ()I
      // 98: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 9b: return
   }

   public static pyk nq2(bdo param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pyk.c J
      // 03: ldc2_w 20476943945995
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aconst_null
      // 0d: astore 4
      // 0f: getstatic pyk.je8 Ljava/util/Map;
      // 12: aload 0
      // 13: sipush 2788
      // 16: ldc2_w 7728213054203404616
      // 19: lload 1
      // 1a: lxor
      // 1b: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: nop
      // 21: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 24: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 29: checkcast java/lang/Class
      // 2c: astore 5
      // 2e: aload 5
      // 30: iload 3
      // 31: ifne 4a
      // 34: ifnull 4f
      // 37: goto 3e
      // 3a: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: aload 5
      // 40: invokevirtual java/lang/Class.newInstance ()Ljava/lang/Object;
      // 43: goto 4a
      // 46: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49: athrow
      // 4a: checkcast pyk
      // 4d: astore 4
      // 4f: goto 59
      // 52: astore 5
      // 54: aload 5
      // 56: invokevirtual java/lang/Exception.printStackTrace ()V
      // 59: aload 4
      // 5b: iload 3
      // 5c: ifne 6b
      // 5f: ifnull 73
      // 62: goto 69
      // 65: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 68: athrow
      // 69: aload 4
      // 6b: aload 0
      // 6c: invokevirtual pyk.agl (Lbdo;)V
      // 6f: iload 3
      // 70: ifeq b2
      // 73: getstatic pyk.a4e Lorg/apache/logging/log4j/Logger;
      // 76: new java/lang/StringBuilder
      // 79: dup
      // 7a: invokespecial java/lang/StringBuilder.<init> ()V
      // 7d: sipush 8170
      // 80: ldc2_w 3117298978847372373
      // 83: lload 1
      // 84: lxor
      // 85: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: nop
      // 8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8e: aload 0
      // 8f: sipush 10362
      // 92: ldc2_w 3957281041061250004
      // 95: lload 1
      // 96: lxor
      // 97: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: nop
      // 9d: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a6: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // ab: goto b2
      // ae: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b1: athrow
      // b2: aload 4
      // b4: areturn
   }

   public int hvh() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return this.a_s;
         }

         if (this.a_s != -1) {
            return this.a_s;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      zfz var2 = this.yh_.getBlockState(this.al2);
      this.a_s = var2.r_y().hvp(var2);
      return this.a_s;
   }

   public void r5t() {
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
      // 05: getfield pyk.yh_ Lt9d;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 6e
      // 0f: goto 16
      // 12: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: getfield pyk.yh_ Lt9d;
      // 1a: goto 21
      // 1d: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: aload 0
      // 22: getfield pyk.al2 Lmew;
      // 25: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 28: astore 2
      // 29: aload 0
      // 2a: aload 2
      // 2b: invokeinterface zfz.r_y ()Le0x; 1
      // 30: aload 2
      // 31: invokevirtual e0x.hvp (Lzfz;)I
      // 34: putfield pyk.a_s I
      // 37: aload 0
      // 38: getfield pyk.yh_ Lt9d;
      // 3b: aload 0
      // 3c: getfield pyk.al2 Lmew;
      // 3f: aload 0
      // 40: invokevirtual t9d.xt0 (Lmew;Lpyk;)V
      // 43: aload 0
      // 44: iload 1
      // 45: ifne 60
      // 48: invokevirtual pyk.qwl ()Le0x;
      // 4b: getstatic ox_.ibw Le0x;
      // 4e: if_acmpeq 6e
      // 51: goto 58
      // 54: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: aload 0
      // 59: goto 60
      // 5c: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f: athrow
      // 60: getfield pyk.yh_ Lt9d;
      // 63: aload 0
      // 64: getfield pyk.al2 Lmew;
      // 67: aload 0
      // 68: invokevirtual pyk.qwl ()Le0x;
      // 6b: invokevirtual t9d.lw8 (Lmew;Le0x;)V
      // 6e: return
   }

   public double vor(double var1, double var3, double var5) {
      double var7 = (double)this.al2.getX() + 0.5 - var1;
      double var9 = (double)this.al2.getY() + 0.5 - var3;
      double var11 = (double)this.al2.getZ() + 0.5 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double g2f() {
      return 4096.0;
   }

   public mew y8_() {
      return this.al2;
   }

   public e0x qwl() {
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
      // 05: getfield pyk.j8_ Le0x;
      // 08: iload 1
      // 09: ifeq 35
      // 0c: ifnonnull 31
      // 0f: goto 16
      // 12: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield pyk.yh_ Lt9d;
      // 1b: aload 0
      // 1c: getfield pyk.al2 Lmew;
      // 1f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 22: invokeinterface zfz.r_y ()Le0x; 1
      // 27: putfield pyk.j8_ Le0x;
      // 2a: goto 31
      // 2d: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: getfield pyk.j8_ Le0x;
      // 35: areturn
   }

   public mz2 ptb() {
      return null;
   }

   public boolean fyn() {
      return this.hn_;
   }

   public void whd() {
      this.hn_ = true;
   }

   public void o26() {
      this.hn_ = false;
   }

   public boolean hjo(int var1, int var2) {
      return false;
   }

   public void xur() {
      this.j8_ = null;
      this.a_s = -1;
   }

   public void h3j(wsc param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic pyk.c J
      // 03: ldc2_w 44943925707960
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: sipush 14283
      // 11: ldc2_w 1541874538636790216
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: new pyk$1
      // 1f: dup
      // 20: aload 0
      // 21: invokespecial pyk$1.<init> (Lpyk;)V
      // 24: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 27: iload 4
      // 29: ifne 6b
      // 2c: aload 0
      // 2d: getfield pyk.yh_ Lt9d;
      // 30: ifnull 85
      // 33: goto 3a
      // 36: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: aload 1
      // 3b: aload 0
      // 3c: getfield pyk.al2 Lmew;
      // 3f: aload 0
      // 40: invokevirtual pyk.qwl ()Le0x;
      // 43: aload 0
      // 44: invokevirtual pyk.hvh ()I
      // 47: invokestatic wsc.kyk (Lwsc;Lmew;Le0x;I)V
      // 4a: aload 1
      // 4b: sipush 5165
      // 4e: ldc2_w 7760463918229776953
      // 51: lload 2
      // 52: lxor
      // 53: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: nop
      // 59: new pyk$2
      // 5c: dup
      // 5d: aload 0
      // 5e: invokespecial pyk$2.<init> (Lpyk;)V
      // 61: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 64: goto 6b
      // 67: invokestatic pyk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6a: athrow
      // 6b: aload 1
      // 6c: sipush 14664
      // 6f: ldc2_w 6984735393307739970
      // 72: lload 2
      // 73: lxor
      // 74: invokedynamic m (IJ)Ljava/lang/String; bsm=pyk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: nop
      // 7a: new pyk$3
      // 7d: dup
      // 7e: aload 0
      // 7f: invokespecial pyk$3.<init> (Lpyk;)V
      // 82: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 85: return
   }

   public void xej(mew var1) {
      this.al2 = var1;
   }

   public boolean v3u() {
      return false;
   }

   public static Map ywl() {
      return mis;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(227785606913754609L, -8745497380389465283L, MethodHandles.lookup().lookupClass()).a(110341781960714L);
      // $VF: monitorexit
      c = var10000;
      long var9 = c ^ 92743702743767L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[29];
      int var5 = 0;
      String var4 = "öànIôæv\u0088\u0098r,Ýq\u0010\u000elE¾=yWËûK\u0086jrÑµ\u0015\u0087\u008c)}¼+-åÙQß(ã\u0083\u0094S¡Å\"¦C1\u000f\u0088~\u0016 \u008bÓm\u0001Ú\u0099cä%é\u0097Ç®Ï>%×²ÿ^²\u001dAcx\u0085\u0099ÂìÈ/[\u0010Å\u009eç\u009bÐb4\u009c)\u0082'T×À\u001b\u0013\u0010m\u0085\u008a`\u0095æ\u0092\u0093\u0007g!jálìÖ \u009fíd\u0012\u0011\u0087ðk\u009c\u0000]\u009d§\u0095/´!<Ý\u0001\u0007«Ôwÿ[æ\u001f\u0007d¸t\u0010Æ9ßÔ\u0001«f\u0083¸\u008d\u009co\u0004C\u00ad³(\u0087¤\u0083\u0094ø\\_\u001aÿP}è\u0013L\u00adÄ\u0083[\u0083sýÅ[\u0091\u009eT0:9á£k\u001f\u0011S\u0011{\u0014d6\u00104\\3 º±¯Qà<°\u0015Àox¶\u0010è\u0082ìk>¹à\u0083\u0003\u0098?\u0018\u001d\u001d\u009dZ\u0010&ã\tzè°N±\u0000¡peÖ\u008a½m \u0018<««\u001b\u0096ÝÓ\u0016\u0095\u0080þ\u001cà\u0013\u0012\u008a\rb\u0012¦§Åa/\u008dF,ÇÝÌ¡\u0010GM×Â)û!\u001aI\u0004*2«\u0094ùó ¨ªa\u0002¡C\t\u0089ç\u0017Üo*XNò}§¦-\u001eÛzT¬$fT\u0014UÈ± \u0081júäeô\u0086Kí\u001f\u0019¾\u0081\u007fî5\u0012a,M\u0088«\u0080Ã\u0096l²¤[·éÏ\u00186Ð<É\u0006á-åü\u000b%CiIÍ\u001a3\u0012ÙnÞ§qK\u0010ÌS^h\u0007o\u0004\u0006Éâp\u0012 è\u0017Ê\u0010¯þ\u0099\u001e\u0098DénÀ\u008eÂ¨\u0099H\u0005\u0014\u0010Ô\u0089]y³$ß\u0086\\¸X\u0018p\u001bï\u009b\u0010÷\u0085Äû¬øøþsY½ Í\tÄ4\u0010\u001fö é1B\u0094\u0092s\u0099Þ)A1ªû@\u0006Z½×Å\u00ad+s¾*cß\u0092Ú·úêß°Â(¶WÖk\u0014cÜ°\u0012½G»\u00ad#zYãêÔ\u0087¶IJ.rýîu\u0088â\u0005T%É\u0080Bó×><\u0017®\u0092\u0018:c\u008fìùt-@MØ\u0001G,µ4¹5X\u0096¬9\u0092\u0001> âD«ªpC\u0080\u00addàt|Ó\u0004Çc\u0084\u008fX\u009a*;4Z\u001bÏ\u008buÇâîf\u0010)÷«ð¤\u0093\u0005Ü\u008f¼É\u0093ÿ\"³Õ(ÕPÇ1_ÄÛT\u008dòîn]y(õÎj0jõéÎ\nrðÔþ·[\u001fDâÁÁW\u0097\u008c\u0004w\u0010\u001boD\u0090õÜ1|Ì8ç\u008dJ{\u0096H\u00185\u0085ý{Ä¹u°jßÓó\u009dYì\u0080\u0090³\u00956ÖeÐ\u001b";
      int var6 = "öànIôæv\u0088\u0098r,Ýq\u0010\u000elE¾=yWËûK\u0086jrÑµ\u0015\u0087\u008c)}¼+-åÙQß(ã\u0083\u0094S¡Å\"¦C1\u000f\u0088~\u0016 \u008bÓm\u0001Ú\u0099cä%é\u0097Ç®Ï>%×²ÿ^²\u001dAcx\u0085\u0099ÂìÈ/[\u0010Å\u009eç\u009bÐb4\u009c)\u0082'T×À\u001b\u0013\u0010m\u0085\u008a`\u0095æ\u0092\u0093\u0007g!jálìÖ \u009fíd\u0012\u0011\u0087ðk\u009c\u0000]\u009d§\u0095/´!<Ý\u0001\u0007«Ôwÿ[æ\u001f\u0007d¸t\u0010Æ9ßÔ\u0001«f\u0083¸\u008d\u009co\u0004C\u00ad³(\u0087¤\u0083\u0094ø\\_\u001aÿP}è\u0013L\u00adÄ\u0083[\u0083sýÅ[\u0091\u009eT0:9á£k\u001f\u0011S\u0011{\u0014d6\u00104\\3 º±¯Qà<°\u0015Àox¶\u0010è\u0082ìk>¹à\u0083\u0003\u0098?\u0018\u001d\u001d\u009dZ\u0010&ã\tzè°N±\u0000¡peÖ\u008a½m \u0018<««\u001b\u0096ÝÓ\u0016\u0095\u0080þ\u001cà\u0013\u0012\u008a\rb\u0012¦§Åa/\u008dF,ÇÝÌ¡\u0010GM×Â)û!\u001aI\u0004*2«\u0094ùó ¨ªa\u0002¡C\t\u0089ç\u0017Üo*XNò}§¦-\u001eÛzT¬$fT\u0014UÈ± \u0081júäeô\u0086Kí\u001f\u0019¾\u0081\u007fî5\u0012a,M\u0088«\u0080Ã\u0096l²¤[·éÏ\u00186Ð<É\u0006á-åü\u000b%CiIÍ\u001a3\u0012ÙnÞ§qK\u0010ÌS^h\u0007o\u0004\u0006Éâp\u0012 è\u0017Ê\u0010¯þ\u0099\u001e\u0098DénÀ\u008eÂ¨\u0099H\u0005\u0014\u0010Ô\u0089]y³$ß\u0086\\¸X\u0018p\u001bï\u009b\u0010÷\u0085Äû¬øøþsY½ Í\tÄ4\u0010\u001fö é1B\u0094\u0092s\u0099Þ)A1ªû@\u0006Z½×Å\u00ad+s¾*cß\u0092Ú·úêß°Â(¶WÖk\u0014cÜ°\u0012½G»\u00ad#zYãêÔ\u0087¶IJ.rýîu\u0088â\u0005T%É\u0080Bó×><\u0017®\u0092\u0018:c\u008fìùt-@MØ\u0001G,µ4¹5X\u0096¬9\u0092\u0001> âD«ªpC\u0080\u00addàt|Ó\u0004Çc\u0084\u008fX\u009a*;4Z\u001bÏ\u008buÇâîf\u0010)÷«ð¤\u0093\u0005Ü\u008f¼É\u0093ÿ\"³Õ(ÕPÇ1_ÄÛT\u008dòîn]y(õÎj0jõéÎ\nrðÔþ·[\u001fDâÁÁW\u0097\u008c\u0004w\u0010\u001boD\u0090õÜ1|Ì8ç\u008dJ{\u0096H\u00185\u0085ý{Ä¹u°jßÓó\u009dYì\u0080\u0090³\u00956ÖeÐ\u001b"
         .length();
      char var3 = '8';
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
                     d = var7;
                     e = new String[29];
                     a4e = LogManager.getLogger();
                     je8 = Maps.newHashMap();
                     mis = Maps.newHashMap();
                     rb3(TileEntityFurnace.class, a<"m">(14045, 3875998398316332725L ^ var9));
                     rb3(TileEntityChest.class, a<"m">(14194, 6934825012070237974L ^ var9));
                     rb3(TileEntityEnderChest.class, a<"m">(24089, 4890967420726849120L ^ var9));
                     rb3(BlockJukebox$TileEntityJukebox.class, a<"m">(26266, 6251516881318057708L ^ var9));
                     rb3(TileEntityDispenser.class, a<"m">(15766, 906749166612172284L ^ var9));
                     rb3(TileEntityDropper.class, a<"m">(22087, 4228079074087282237L ^ var9));
                     rb3(TileEntitySign.class, a<"m">(5147, 1978262358094963812L ^ var9));
                     rb3(TileEntityMobSpawner.class, a<"m">(3359, 2919891376409869681L ^ var9));
                     rb3(TileEntityNote.class, a<"m">(21014, 986306070013813367L ^ var9));
                     rb3(TileEntityPiston.class, a<"m">(8769, 932040499521933863L ^ var9));
                     rb3(TileEntityBrewingStand.class, a<"m">(20241, 7133282181441044329L ^ var9));
                     rb3(TileEntityEnchantmentTable.class, a<"m">(24899, 5520458168549511470L ^ var9));
                     rb3(TileEntityEndPortal.class, a<"m">(25008, 7222762721028313561L ^ var9));
                     rb3(TileEntityCommandBlock.class, a<"m">(10437, 6623944665803118757L ^ var9));
                     rb3(TileEntityBeacon.class, a<"m">(30954, 8695154008758618267L ^ var9));
                     rb3(TileEntitySkull.class, a<"m">(4361, 893766151411491194L ^ var9));
                     rb3(TileEntityDaylightDetector.class, a<"m">(27863, 541276370295561400L ^ var9));
                     rb3(TileEntityHopper.class, a<"m">(21271, 8800168145748468604L ^ var9));
                     rb3(TileEntityComparator.class, a<"m">(15573, 9119862000874179762L ^ var9));
                     rb3(TileEntityFlowerPot.class, a<"m">(11637, 5375234446866341120L ^ var9));
                     rb3(TileEntityBanner.class, a<"m">(2844, 5357970295936351080L ^ var9));
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

                  var4 = "y\u0081($8i\u0085ÔU¶¨\u008f$>\u0086\u008fÔºM¤~Àïsi4ú/üè\u009eN\u0010`ü\f÷3¯ m\u007fc@Æ\\)å\u0019";
                  var6 = "y\u0081($8i\u0085ÔU¶¨\u008f$>\u0086\u008fÔºM¤~Àïsi4ú/üè\u009eN\u0010`ü\f÷3¯ m\u007fc@Æ\\)å\u0019".length();
                  var3 = ' ';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17951;
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
            throw new RuntimeException("pyk", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("pyk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
