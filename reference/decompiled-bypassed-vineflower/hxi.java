import java.io.Serializable;
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

public class hxi implements Serializable, Cloneable {
   public double[] ch5;
   public static final long serialVersionUID = 1398850036893875112L;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hxi(int var1) {
      int var10000 = t9d.b();
      this.mpd = var1;
      int var2 = var10000;
      this.ch5 = new double[var1];
      int var3 = 0;

      while (var3 < var1) {
         this.ch5[var3] = 0.0;
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public hxi(double[] var1) {
      this.mpd = var1.length;
      int var10000 = t9d.b();
      this.ch5 = new double[var1.length];
      int var3 = 0;
      int var2 = var10000;

      while (var3 < this.mpd) {
         this.ch5[var3] = var1[var3];
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public hxi(hxi var1) {
      int var10000 = t9d.b();
      this.ch5 = new double[var1.mpd];
      int var2 = var10000;
      this.mpd = var1.mpd;
      int var3 = 0;

      while (var3 < this.mpd) {
         this.ch5[var3] = var1.ch5[var3];
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public hxi(mdx var1) {
      this.ch5 = new double[2];
      this.ch5[0] = (double)var1.n7d;
      this.ch5[1] = (double)var1.wfr;
      this.mpd = 2;
   }

   public hxi(ry6 var1) {
      this.ch5 = new double[3];
      this.ch5[0] = (double)var1.yiu;
      this.ch5[1] = (double)var1.q6o;
      this.ch5[2] = (double)var1.n_d;
      this.mpd = 3;
   }

   public hxi(g5s var1) {
      this.ch5 = new double[3];
      this.ch5[0] = var1.v54;
      this.ch5[1] = var1.g0w;
      this.ch5[2] = var1.mu9;
      this.mpd = 3;
   }

   public hxi(rkj var1) {
      this.ch5 = new double[4];
      this.ch5[0] = (double)var1.hp2;
      this.ch5[1] = (double)var1.nc_;
      this.ch5[2] = (double)var1.ax5;
      this.ch5[3] = (double)var1.ck3;
      this.mpd = 4;
   }

   public hxi(xv0 var1) {
      this.ch5 = new double[4];
      this.ch5[0] = var1.yme;
      this.ch5[1] = var1.pf8;
      this.ch5[2] = var1.jfe;
      this.ch5[3] = var1.ggc;
      this.mpd = 4;
   }

   public hxi(double[] var1, int var2) {
      int var10000 = t9d.b();
      this.mpd = var2;
      this.ch5 = new double[var2];
      int var4 = 0;
      int var3 = var10000;

      while (var4 < var2) {
         this.ch5[var4] = var1[var4];
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   public final double xwp() {
      double var2 = 0.0;
      int var10000 = t9d.b();
      int var4 = 0;
      int var1 = var10000;

      while (true) {
         if (var4 < this.mpd) {
            var5 = var2 + this.ch5[var4] * this.ch5[var4];
            if (var1 == 0) {
               break;
            }

            var2 = var5;
            var4++;
            if (var1 != 0) {
               continue;
            }
         }

         var5 = Math.sqrt(var2);
         break;
      }

      return var5;
   }

   public final double t6i() {
      double var2 = 0.0;
      int var10000 = t9d.c();
      int var4 = 0;
      int var1 = var10000;

      while (true) {
         if (var4 < this.mpd) {
            var5 = var2 + this.ch5[var4] * this.ch5[var4];
            if (var1 != 0) {
               break;
            }

            var2 = var5;
            var4++;
            if (var1 == 0) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public final void pq9(hxi param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 47598522966898
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: dconst_0
      // 0e: dstore 5
      // 10: aload 0
      // 11: getfield hxi.mpd I
      // 14: iload 4
      // 16: ifeq 45
      // 19: aload 1
      // 1a: getfield hxi.mpd I
      // 1d: if_icmpeq 44
      // 20: goto 27
      // 23: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26: athrow
      // 27: new vam
      // 2a: dup
      // 2b: sipush 12735
      // 2e: ldc2_w 6185457309362935446
      // 31: lload 2
      // 32: lxor
      // 33: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: nop
      // 39: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 3c: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3f: athrow
      // 40: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: bipush 0
      // 45: istore 7
      // 47: iload 7
      // 49: aload 0
      // 4a: getfield hxi.mpd I
      // 4d: if_icmpge 71
      // 50: dload 5
      // 52: aload 1
      // 53: getfield hxi.ch5 [D
      // 56: iload 7
      // 58: daload
      // 59: aload 1
      // 5a: getfield hxi.ch5 [D
      // 5d: iload 7
      // 5f: daload
      // 60: dmul
      // 61: dadd
      // 62: iload 4
      // 64: ifeq 78
      // 67: dstore 5
      // 69: iinc 7 1
      // 6c: iload 4
      // 6e: ifne 47
      // 71: dconst_1
      // 72: dload 5
      // 74: invokestatic java/lang/Math.sqrt (D)D
      // 77: ddiv
      // 78: dstore 8
      // 7a: bipush 0
      // 7b: istore 7
      // 7d: iload 7
      // 7f: aload 0
      // 80: getfield hxi.mpd I
      // 83: if_icmpge 9f
      // 86: aload 0
      // 87: getfield hxi.ch5 [D
      // 8a: iload 7
      // 8c: aload 1
      // 8d: getfield hxi.ch5 [D
      // 90: iload 7
      // 92: daload
      // 93: dload 8
      // 95: dmul
      // 96: dastore
      // 97: iinc 7 1
      // 9a: iload 4
      // 9c: ifne 7d
      // 9f: return
   }

   public final void xi_() {
      double var2 = 0.0;
      int var10000 = t9d.b();
      int var4 = 0;
      int var1 = var10000;

      while (true) {
         if (var4 < this.mpd) {
            var8 = var2 + this.ch5[var4] * this.ch5[var4];
            if (var1 == 0) {
               break;
            }

            var2 = var8;
            var4++;
            if (var1 != 0) {
               continue;
            }
         }

         var8 = 1.0 / Math.sqrt(var2);
         break;
      }

      double var5 = var8;
      var4 = 0;

      while (var4 < this.mpd) {
         this.ch5[var4] = this.ch5[var4] * var5;
         var4++;
         if (var1 == 0) {
            break;
         }
      }
   }

   public final void n1c(double param1, hxi param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 140147913561834
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.c ()I
      // 0c: istore 6
      // 0e: aload 0
      // 0f: getfield hxi.mpd I
      // 12: iload 6
      // 14: ifne 44
      // 17: aload 3
      // 18: getfield hxi.mpd I
      // 1b: if_icmpeq 43
      // 1e: goto 25
      // 21: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new vam
      // 28: dup
      // 29: sipush 14151
      // 2c: ldc2_w 1747395626746406378
      // 2f: lload 4
      // 31: lxor
      // 32: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: nop
      // 38: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 3b: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3e: athrow
      // 3f: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: bipush 0
      // 44: istore 7
      // 46: iload 7
      // 48: aload 0
      // 49: getfield hxi.mpd I
      // 4c: if_icmpge 67
      // 4f: aload 0
      // 50: getfield hxi.ch5 [D
      // 53: iload 7
      // 55: aload 3
      // 56: getfield hxi.ch5 [D
      // 59: iload 7
      // 5b: daload
      // 5c: dload 1
      // 5d: dmul
      // 5e: dastore
      // 5f: iinc 7 1
      // 62: iload 6
      // 64: ifeq 46
      // 67: return
   }

   public final void rwf(double var1) {
      int var3 = t9d.c();
      int var4 = 0;

      while (var4 < this.mpd) {
         this.ch5[var4] = this.ch5[var4] * var1;
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public final void t9a(double param1, hxi param3, hxi param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 9674558861995
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic t9d.c ()I
      // 0c: istore 7
      // 0e: aload 4
      // 10: getfield hxi.mpd I
      // 13: aload 3
      // 14: getfield hxi.mpd I
      // 17: iload 7
      // 19: ifne 58
      // 1c: if_icmpeq 44
      // 1f: goto 26
      // 22: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: new vam
      // 29: dup
      // 2a: sipush 1455
      // 2d: ldc2_w 7519201425768821570
      // 30: lload 5
      // 32: lxor
      // 33: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: nop
      // 39: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 3c: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3f: athrow
      // 40: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: aload 0
      // 45: getfield hxi.mpd I
      // 48: iload 7
      // 4a: ifne 7a
      // 4d: aload 3
      // 4e: getfield hxi.mpd I
      // 51: goto 58
      // 54: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 57: athrow
      // 58: if_icmpeq 79
      // 5b: new vam
      // 5e: dup
      // 5f: sipush 8318
      // 62: ldc2_w 4919479085404591761
      // 65: lload 5
      // 67: lxor
      // 68: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: nop
      // 6e: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 71: invokespecial vam.<init> (Ljava/lang/String;)V
      // 74: athrow
      // 75: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: bipush 0
      // 7a: istore 8
      // 7c: iload 8
      // 7e: aload 0
      // 7f: getfield hxi.mpd I
      // 82: if_icmpge a6
      // 85: aload 0
      // 86: getfield hxi.ch5 [D
      // 89: iload 8
      // 8b: aload 3
      // 8c: getfield hxi.ch5 [D
      // 8f: iload 8
      // 91: daload
      // 92: dload 1
      // 93: dmul
      // 94: aload 4
      // 96: getfield hxi.ch5 [D
      // 99: iload 8
      // 9b: daload
      // 9c: dadd
      // 9d: dastore
      // 9e: iinc 8 1
      // a1: iload 7
      // a3: ifeq 7c
      // a6: return
   }

   public final void sa1(hxi param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 8522489990806
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield hxi.mpd I
      // 11: iload 4
      // 13: ifeq 42
      // 16: aload 1
      // 17: getfield hxi.mpd I
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 12580
      // 2b: ldc2_w 2015570076660595696
      // 2e: lload 2
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: bipush 0
      // 42: istore 5
      // 44: iload 5
      // 46: aload 0
      // 47: getfield hxi.mpd I
      // 4a: if_icmpge 66
      // 4d: aload 0
      // 4e: getfield hxi.ch5 [D
      // 51: iload 5
      // 53: dup2
      // 54: daload
      // 55: aload 1
      // 56: getfield hxi.ch5 [D
      // 59: iload 5
      // 5b: daload
      // 5c: dadd
      // 5d: dastore
      // 5e: iinc 5 1
      // 61: iload 4
      // 63: ifne 44
      // 66: return
   }

   public final void waq(hxi param1, hxi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 43962142353510
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: getfield hxi.mpd I
      // 11: aload 2
      // 12: getfield hxi.mpd I
      // 15: iload 5
      // 17: ifeq 55
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 5016
      // 2b: ldc2_w 8118665070895873965
      // 2e: lload 3
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: getfield hxi.mpd I
      // 45: iload 5
      // 47: ifeq 76
      // 4a: aload 1
      // 4b: getfield hxi.mpd I
      // 4e: goto 55
      // 51: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpeq 75
      // 58: new vam
      // 5b: dup
      // 5c: sipush 1637
      // 5f: ldc2_w 7377290066614987349
      // 62: lload 3
      // 63: lxor
      // 64: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 6d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: bipush 0
      // 76: istore 6
      // 78: iload 6
      // 7a: aload 0
      // 7b: getfield hxi.mpd I
      // 7e: if_icmpge 9f
      // 81: aload 0
      // 82: getfield hxi.ch5 [D
      // 85: iload 6
      // 87: aload 1
      // 88: getfield hxi.ch5 [D
      // 8b: iload 6
      // 8d: daload
      // 8e: aload 2
      // 8f: getfield hxi.ch5 [D
      // 92: iload 6
      // 94: daload
      // 95: dadd
      // 96: dastore
      // 97: iinc 6 1
      // 9a: iload 5
      // 9c: ifne 78
      // 9f: return
   }

   public final void vzd(hxi param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 76387742717992
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield hxi.mpd I
      // 11: iload 4
      // 13: ifeq 42
      // 16: aload 1
      // 17: getfield hxi.mpd I
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 5425
      // 2b: ldc2_w 6903050344828422477
      // 2e: lload 2
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: bipush 0
      // 42: istore 5
      // 44: iload 5
      // 46: aload 0
      // 47: getfield hxi.mpd I
      // 4a: if_icmpge 66
      // 4d: aload 0
      // 4e: getfield hxi.ch5 [D
      // 51: iload 5
      // 53: dup2
      // 54: daload
      // 55: aload 1
      // 56: getfield hxi.ch5 [D
      // 59: iload 5
      // 5b: daload
      // 5c: dsub
      // 5d: dastore
      // 5e: iinc 5 1
      // 61: iload 4
      // 63: ifne 44
      // 66: return
   }

   public final void ifc(hxi param1, hxi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 51501216512361
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: getfield hxi.mpd I
      // 11: aload 2
      // 12: getfield hxi.mpd I
      // 15: iload 5
      // 17: ifne 55
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 26124
      // 2b: ldc2_w 5930872515495303996
      // 2e: lload 3
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: getfield hxi.mpd I
      // 45: iload 5
      // 47: ifne 76
      // 4a: aload 1
      // 4b: getfield hxi.mpd I
      // 4e: goto 55
      // 51: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpeq 75
      // 58: new vam
      // 5b: dup
      // 5c: sipush 7928
      // 5f: ldc2_w 7024480034396234692
      // 62: lload 3
      // 63: lxor
      // 64: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 6d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: bipush 0
      // 76: istore 6
      // 78: iload 6
      // 7a: aload 0
      // 7b: getfield hxi.mpd I
      // 7e: if_icmpge 9f
      // 81: aload 0
      // 82: getfield hxi.ch5 [D
      // 85: iload 6
      // 87: aload 1
      // 88: getfield hxi.ch5 [D
      // 8b: iload 6
      // 8d: daload
      // 8e: aload 2
      // 8f: getfield hxi.ch5 [D
      // 92: iload 6
      // 94: daload
      // 95: dsub
      // 96: dastore
      // 97: iinc 6 1
      // 9a: iload 5
      // 9c: ifeq 78
      // 9f: return
   }

   public final void ld_(yb6 param1, hxi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 82659049780728
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 1
      // 0e: invokevirtual yb6.ijc ()I
      // 11: aload 2
      // 12: getfield hxi.mpd I
      // 15: iload 5
      // 17: ifeq 55
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 20991
      // 2b: ldc2_w 7733861599991406682
      // 2e: lload 3
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: iload 5
      // 44: ifeq 76
      // 47: getfield hxi.mpd I
      // 4a: aload 1
      // 4b: invokevirtual yb6.bmr ()I
      // 4e: goto 55
      // 51: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpeq 75
      // 58: new vam
      // 5b: dup
      // 5c: sipush 2606
      // 5f: ldc2_w 7529668536008080262
      // 62: lload 3
      // 63: lxor
      // 64: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 6d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 2
      // 76: iload 5
      // 78: ifeq 9f
      // 7b: aload 0
      // 7c: if_acmpeq 91
      // 7f: goto 86
      // 82: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 2
      // 87: getfield hxi.ch5 [D
      // 8a: astore 6
      // 8c: iload 5
      // 8e: ifne a7
      // 91: aload 0
      // 92: getfield hxi.ch5 [D
      // 95: invokevirtual [D.clone ()Ljava/lang/Object;
      // 98: goto 9f
      // 9b: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: checkcast [D
      // a2: checkcast [D
      // a5: astore 6
      // a7: aload 0
      // a8: getfield hxi.mpd I
      // ab: bipush 1
      // ac: isub
      // ad: istore 7
      // af: iload 7
      // b1: iflt ff
      // b4: aload 0
      // b5: getfield hxi.ch5 [D
      // b8: iload 7
      // ba: dconst_0
      // bb: dastore
      // bc: aload 2
      // bd: getfield hxi.mpd I
      // c0: bipush 1
      // c1: isub
      // c2: istore 8
      // c4: iload 8
      // c6: iflt f7
      // c9: aload 0
      // ca: getfield hxi.ch5 [D
      // cd: iload 7
      // cf: dup2
      // d0: daload
      // d1: aload 1
      // d2: getfield yb6.zk2 [[D
      // d5: iload 7
      // d7: aaload
      // d8: iload 8
      // da: daload
      // db: aload 6
      // dd: iload 8
      // df: daload
      // e0: dmul
      // e1: dadd
      // e2: dastore
      // e3: iinc 8 -1
      // e6: iload 5
      // e8: ifeq fa
      // eb: iload 5
      // ed: ifne c4
      // f0: goto f7
      // f3: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f6: athrow
      // f7: iinc 7 -1
      // fa: iload 5
      // fc: ifne af
      // ff: return
   }

   public final void q8g(hxi param1, yb6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 84772483876302
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 2
      // 0e: invokevirtual yb6.bmr ()I
      // 11: aload 1
      // 12: getfield hxi.mpd I
      // 15: iload 5
      // 17: ifeq 55
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 4471
      // 2b: ldc2_w 28128618639823096
      // 2e: lload 3
      // 2f: lxor
      // 30: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: iload 5
      // 44: ifeq 76
      // 47: getfield hxi.mpd I
      // 4a: aload 2
      // 4b: invokevirtual yb6.ijc ()I
      // 4e: goto 55
      // 51: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpeq 75
      // 58: new vam
      // 5b: dup
      // 5c: sipush 8459
      // 5f: ldc2_w 3341618857059295378
      // 62: lload 3
      // 63: lxor
      // 64: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 6d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: aload 1
      // 76: iload 5
      // 78: ifeq 9f
      // 7b: aload 0
      // 7c: if_acmpeq 91
      // 7f: goto 86
      // 82: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85: athrow
      // 86: aload 1
      // 87: getfield hxi.ch5 [D
      // 8a: astore 6
      // 8c: iload 5
      // 8e: ifne a7
      // 91: aload 0
      // 92: getfield hxi.ch5 [D
      // 95: invokevirtual [D.clone ()Ljava/lang/Object;
      // 98: goto 9f
      // 9b: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: checkcast [D
      // a2: checkcast [D
      // a5: astore 6
      // a7: aload 0
      // a8: getfield hxi.mpd I
      // ab: bipush 1
      // ac: isub
      // ad: istore 7
      // af: iload 7
      // b1: iflt ff
      // b4: aload 0
      // b5: getfield hxi.ch5 [D
      // b8: iload 7
      // ba: dconst_0
      // bb: dastore
      // bc: aload 1
      // bd: getfield hxi.mpd I
      // c0: bipush 1
      // c1: isub
      // c2: istore 8
      // c4: iload 8
      // c6: iflt f7
      // c9: aload 0
      // ca: getfield hxi.ch5 [D
      // cd: iload 7
      // cf: dup2
      // d0: daload
      // d1: aload 2
      // d2: getfield yb6.zk2 [[D
      // d5: iload 8
      // d7: aaload
      // d8: iload 7
      // da: daload
      // db: aload 6
      // dd: iload 8
      // df: daload
      // e0: dmul
      // e1: dadd
      // e2: dastore
      // e3: iinc 8 -1
      // e6: iload 5
      // e8: ifeq fa
      // eb: iload 5
      // ed: ifne c4
      // f0: goto f7
      // f3: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // f6: athrow
      // f7: iinc 7 -1
      // fa: iload 5
      // fc: ifne af
      // ff: return
   }

   public final void yjd() {
      int var1 = t9d.c();
      int var2 = this.mpd - 1;

      while (var2 >= 0) {
         this.ch5[var2] = this.ch5[var2] * -1.0;
         var2--;
         if (var1 != 0) {
            break;
         }
      }
   }

   public final void bab() {
      int var1 = t9d.b();
      int var2 = 0;

      while (var2 < this.mpd) {
         this.ch5[var2] = 0.0;
         var2++;
         if (var1 == 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void c6b(int var1) {
      int var2 = t9d.b();
      double[] var3 = new double[var1];

      int var5;
      label55: {
         int var10000;
         label62: {
            label59: {
               try {
                  var10000 = this.mpd;
                  if (var2 == 0) {
                     break label62;
                  }

                  if (this.mpd >= var1) {
                     break label59;
                  }
               } catch (vam var9) {
                  throw a(var9);
               }

               var5 = this.mpd;

               try {
                  if (var2 != 0) {
                     break label55;
                  }
               } catch (vam var8) {
                  boolean var10001 = false;
                  throw a(var8);
               }
            }

            try {
               var10000 = var1;
            } catch (vam var7) {
               boolean var11 = false;
               throw a(var7);
            }
         }

         var5 = var10000;
      }

      int var4 = 0;

      while (true) {
         if (var4 < var5) {
            try {
               var3[var4] = this.ch5[var4];
               var4++;
               if (var2 == 0) {
                  break;
               }

               if (var2 != 0) {
                  continue;
               }
            } catch (vam var6) {
               throw a(var6);
            }
         }

         this.mpd = var1;
         this.ch5 = var3;
         break;
      }
   }

   public final void gxa(double[] var1) {
      int var2 = t9d.b();
      int var3 = this.mpd - 1;

      while (var3 >= 0) {
         this.ch5[var3] = var1[var3];
         var3--;
         if (var2 == 0) {
            break;
         }
      }
   }

   public final void x2n(hxi var1) {
      int var2 = t9d.b();

      int var10000;
      label61: {
         label67: {
            try {
               var10000 = this.mpd;
               if (var2 == 0) {
                  break label61;
               }

               if (this.mpd >= var1.mpd) {
                  break label67;
               }
            } catch (vam var6) {
               throw a(var6);
            }

            this.mpd = var1.mpd;
            this.ch5 = new double[this.mpd];
            int var3 = 0;

            do {
               if (var3 >= this.mpd) {
                  return;
               }

               this.ch5[var3] = var1.ch5[var3];
               var3++;
            } while (var2 != 0);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      label38: {
         while (var7 < var1.mpd) {
            try {
               this.ch5[var7] = var1.ch5[var7];
               var7++;
               if (var2 == 0) {
                  break label38;
               }

               if (var2 == 0) {
                  break;
               }
            } catch (vam var4) {
               throw a(var4);
            }
         }

         var7 = var1.mpd;
      }

      try {
         while (var7 < this.mpd) {
            this.ch5[var7] = 0.0;
            var7++;
            if (var2 == 0) {
               break;
            }
         }
      } catch (vam var5) {
         throw a(var5);
      }
   }

   public final void b4f(mdx param1) {
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
      // 05: getfield hxi.mpd I
      // 08: iload 2
      // 09: ifne 41
      // 0c: bipush 2
      // 0d: if_icmpge 2a
      // 10: goto 17
      // 13: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: bipush 2
      // 19: putfield hxi.mpd I
      // 1c: aload 0
      // 1d: bipush 2
      // 1e: newarray 7
      // 20: putfield hxi.ch5 [D
      // 23: goto 2a
      // 26: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield hxi.ch5 [D
      // 2e: bipush 0
      // 2f: aload 1
      // 30: getfield mdx.n7d F
      // 33: f2d
      // 34: dastore
      // 35: aload 0
      // 36: getfield hxi.ch5 [D
      // 39: bipush 1
      // 3a: aload 1
      // 3b: getfield mdx.wfr F
      // 3e: f2d
      // 3f: dastore
      // 40: bipush 2
      // 41: istore 3
      // 42: iload 3
      // 43: aload 0
      // 44: getfield hxi.mpd I
      // 47: if_icmpge 58
      // 4a: aload 0
      // 4b: getfield hxi.ch5 [D
      // 4e: iload 3
      // 4f: dconst_0
      // 50: dastore
      // 51: iinc 3 1
      // 54: iload 2
      // 55: ifeq 42
      // 58: return
   }

   public final void hot(ry6 param1) {
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
      // 05: getfield hxi.mpd I
      // 08: iload 2
      // 09: ifne 4c
      // 0c: bipush 3
      // 0d: if_icmpge 2a
      // 10: goto 17
      // 13: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: bipush 3
      // 19: putfield hxi.mpd I
      // 1c: aload 0
      // 1d: bipush 3
      // 1e: newarray 7
      // 20: putfield hxi.ch5 [D
      // 23: goto 2a
      // 26: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield hxi.ch5 [D
      // 2e: bipush 0
      // 2f: aload 1
      // 30: getfield ry6.yiu F
      // 33: f2d
      // 34: dastore
      // 35: aload 0
      // 36: getfield hxi.ch5 [D
      // 39: bipush 1
      // 3a: aload 1
      // 3b: getfield ry6.q6o F
      // 3e: f2d
      // 3f: dastore
      // 40: aload 0
      // 41: getfield hxi.ch5 [D
      // 44: bipush 2
      // 45: aload 1
      // 46: getfield ry6.n_d F
      // 49: f2d
      // 4a: dastore
      // 4b: bipush 3
      // 4c: istore 3
      // 4d: iload 3
      // 4e: aload 0
      // 4f: getfield hxi.mpd I
      // 52: if_icmpge 63
      // 55: aload 0
      // 56: getfield hxi.ch5 [D
      // 59: iload 3
      // 5a: dconst_0
      // 5b: dastore
      // 5c: iinc 3 1
      // 5f: iload 2
      // 60: ifeq 4d
      // 63: return
   }

   public final void snx(g5s param1) {
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
      // 05: getfield hxi.mpd I
      // 08: iload 2
      // 09: ifeq 49
      // 0c: bipush 3
      // 0d: if_icmpge 2a
      // 10: goto 17
      // 13: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: bipush 3
      // 19: putfield hxi.mpd I
      // 1c: aload 0
      // 1d: bipush 3
      // 1e: newarray 7
      // 20: putfield hxi.ch5 [D
      // 23: goto 2a
      // 26: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield hxi.ch5 [D
      // 2e: bipush 0
      // 2f: aload 1
      // 30: getfield g5s.v54 D
      // 33: dastore
      // 34: aload 0
      // 35: getfield hxi.ch5 [D
      // 38: bipush 1
      // 39: aload 1
      // 3a: getfield g5s.g0w D
      // 3d: dastore
      // 3e: aload 0
      // 3f: getfield hxi.ch5 [D
      // 42: bipush 2
      // 43: aload 1
      // 44: getfield g5s.mu9 D
      // 47: dastore
      // 48: bipush 3
      // 49: istore 3
      // 4a: iload 3
      // 4b: aload 0
      // 4c: getfield hxi.mpd I
      // 4f: if_icmpge 60
      // 52: aload 0
      // 53: getfield hxi.ch5 [D
      // 56: iload 3
      // 57: dconst_0
      // 58: dastore
      // 59: iinc 3 1
      // 5c: iload 2
      // 5d: ifne 4a
      // 60: return
   }

   public final void l5t(rkj param1) {
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
      // 05: getfield hxi.mpd I
      // 08: iload 2
      // 09: ifne 57
      // 0c: bipush 4
      // 0d: if_icmpge 2a
      // 10: goto 17
      // 13: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: bipush 4
      // 19: putfield hxi.mpd I
      // 1c: aload 0
      // 1d: bipush 4
      // 1e: newarray 7
      // 20: putfield hxi.ch5 [D
      // 23: goto 2a
      // 26: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield hxi.ch5 [D
      // 2e: bipush 0
      // 2f: aload 1
      // 30: getfield rkj.hp2 F
      // 33: f2d
      // 34: dastore
      // 35: aload 0
      // 36: getfield hxi.ch5 [D
      // 39: bipush 1
      // 3a: aload 1
      // 3b: getfield rkj.nc_ F
      // 3e: f2d
      // 3f: dastore
      // 40: aload 0
      // 41: getfield hxi.ch5 [D
      // 44: bipush 2
      // 45: aload 1
      // 46: getfield rkj.ax5 F
      // 49: f2d
      // 4a: dastore
      // 4b: aload 0
      // 4c: getfield hxi.ch5 [D
      // 4f: bipush 3
      // 50: aload 1
      // 51: getfield rkj.ck3 F
      // 54: f2d
      // 55: dastore
      // 56: bipush 4
      // 57: istore 3
      // 58: iload 3
      // 59: aload 0
      // 5a: getfield hxi.mpd I
      // 5d: if_icmpge 6e
      // 60: aload 0
      // 61: getfield hxi.ch5 [D
      // 64: iload 3
      // 65: dconst_0
      // 66: dastore
      // 67: iinc 3 1
      // 6a: iload 2
      // 6b: ifeq 58
      // 6e: return
   }

   public final void srr(xv0 param1) {
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
      // 05: getfield hxi.mpd I
      // 08: iload 2
      // 09: ifne 53
      // 0c: bipush 4
      // 0d: if_icmpge 2a
      // 10: goto 17
      // 13: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: bipush 4
      // 19: putfield hxi.mpd I
      // 1c: aload 0
      // 1d: bipush 4
      // 1e: newarray 7
      // 20: putfield hxi.ch5 [D
      // 23: goto 2a
      // 26: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield hxi.ch5 [D
      // 2e: bipush 0
      // 2f: aload 1
      // 30: getfield xv0.yme D
      // 33: dastore
      // 34: aload 0
      // 35: getfield hxi.ch5 [D
      // 38: bipush 1
      // 39: aload 1
      // 3a: getfield xv0.pf8 D
      // 3d: dastore
      // 3e: aload 0
      // 3f: getfield hxi.ch5 [D
      // 42: bipush 2
      // 43: aload 1
      // 44: getfield xv0.jfe D
      // 47: dastore
      // 48: aload 0
      // 49: getfield hxi.ch5 [D
      // 4c: bipush 3
      // 4d: aload 1
      // 4e: getfield xv0.ggc D
      // 51: dastore
      // 52: bipush 4
      // 53: istore 3
      // 54: iload 3
      // 55: aload 0
      // 56: getfield hxi.mpd I
      // 59: if_icmpge 6a
      // 5c: aload 0
      // 5d: getfield hxi.ch5 [D
      // 60: iload 3
      // 61: dconst_0
      // 62: dastore
      // 63: iinc 3 1
      // 66: iload 2
      // 67: ifeq 54
      // 6a: return
   }

   public final int ud2() {
      return this.ch5.length;
   }

   public final double dkp(int var1) {
      return this.ch5[var1];
   }

   public final void u5b(int var1, double var2) {
      this.ch5[var1] = var2;
   }

   @Override
   public String toString() {
      StringBuffer var2 = new StringBuffer(this.mpd * 8);
      int var10000 = t9d.c();
      int var3 = 0;
      int var1 = var10000;

      while (true) {
         if (var3 < this.mpd) {
            try {
               var5 = var2.append(this.ch5[var3]).append(" ");
               if (var1 != 0) {
                  break;
               }

               var3++;
               if (var1 == 0) {
                  continue;
               }
            } catch (vam var4) {
               throw a(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5.toString();
   }

   @Override
   public int hashCode() {
      long var2 = 1L;
      int var10000 = t9d.b();
      int var4 = 0;
      int var1 = var10000;

      while (true) {
         if (var4 < this.mpd) {
            var5 = get.mql(var2, this.ch5[var4]);
            if (var1 == 0) {
               break;
            }

            var2 = var5;
            var4++;
            if (var1 != 0) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return get.p05(var5);
   }

   public boolean ukz(hxi param1) {
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
      // 05: getfield hxi.mpd I
      // 08: iload 2
      // 09: ifne 1d
      // 0c: aload 1
      // 0d: getfield hxi.mpd I
      // 10: if_icmpeq 1c
      // 13: goto 1a
      // 16: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: bipush 0
      // 1d: istore 3
      // 1e: iload 3
      // 1f: aload 0
      // 20: getfield hxi.mpd I
      // 23: if_icmpge 55
      // 26: aload 0
      // 27: getfield hxi.ch5 [D
      // 2a: iload 3
      // 2b: daload
      // 2c: aload 1
      // 2d: getfield hxi.ch5 [D
      // 30: iload 3
      // 31: daload
      // 32: dcmpl
      // 33: iload 2
      // 34: ifne 56
      // 37: iload 2
      // 38: ifne 4d
      // 3b: goto 42
      // 3e: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: ifeq 4e
      // 45: goto 4c
      // 48: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: iinc 3 1
      // 51: iload 2
      // 52: ifeq 1e
      // 55: bipush 1
      // 56: ireturn
      // 57: astore 3
      // 58: bipush 0
      // 59: ireturn
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: checkcast hxi
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield hxi.mpd I
      // 0d: iload 2
      // 0e: ifne 22
      // 11: aload 3
      // 12: getfield hxi.mpd I
      // 15: if_icmpeq 21
      // 18: goto 1f
      // 1b: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: bipush 0
      // 22: istore 4
      // 24: iload 4
      // 26: aload 0
      // 27: getfield hxi.mpd I
      // 2a: if_icmpge 5e
      // 2d: aload 0
      // 2e: getfield hxi.ch5 [D
      // 31: iload 4
      // 33: daload
      // 34: aload 3
      // 35: getfield hxi.ch5 [D
      // 38: iload 4
      // 3a: daload
      // 3b: dcmpl
      // 3c: iload 2
      // 3d: ifne 5f
      // 40: iload 2
      // 41: ifne 56
      // 44: goto 4b
      // 47: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a: athrow
      // 4b: ifeq 57
      // 4e: goto 55
      // 51: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: iinc 4 1
      // 5a: iload 2
      // 5b: ifeq 24
      // 5e: bipush 1
      // 5f: ireturn
      // 60: astore 3
      // 61: bipush 0
      // 62: ireturn
      // 63: astore 3
      // 64: bipush 0
      // 65: ireturn
   }

   public boolean cis(hxi param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield hxi.mpd I
      // 09: iload 4
      // 0b: ifeq 23
      // 0e: aload 1
      // 0f: getfield hxi.mpd I
      // 12: if_icmpeq 22
      // 15: goto 1c
      // 18: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: bipush 0
      // 23: istore 7
      // 25: iload 7
      // 27: aload 0
      // 28: getfield hxi.mpd I
      // 2b: if_icmpge 88
      // 2e: aload 0
      // 2f: getfield hxi.ch5 [D
      // 32: iload 7
      // 34: daload
      // 35: aload 1
      // 36: getfield hxi.ch5 [D
      // 39: iload 7
      // 3b: daload
      // 3c: dsub
      // 3d: dstore 5
      // 3f: dload 5
      // 41: iload 4
      // 43: ifeq 68
      // 46: dconst_0
      // 47: dcmpg
      // 48: iload 4
      // 4a: ifeq 89
      // 4d: goto 54
      // 50: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: ifge 6b
      // 57: goto 5e
      // 5a: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: dload 5
      // 60: dneg
      // 61: goto 68
      // 64: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: goto 6d
      // 6b: dload 5
      // 6d: dload 2
      // 6e: dcmpl
      // 6f: iload 4
      // 71: ifeq 7f
      // 74: ifle 80
      // 77: goto 7e
      // 7a: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7d: athrow
      // 7e: bipush 0
      // 7f: ireturn
      // 80: iinc 7 1
      // 83: iload 4
      // 85: ifne 25
      // 88: bipush 1
      // 89: ireturn
   }

   public final double s3s(hxi var1) {
      long var2 = a ^ 100668147364994L;
      int var4 = t9d.b();

      try {
         if (this.mpd != var1.mpd) {
            throw new vam(_fg.agj(a<"b">(19210, 1604180125340695514L ^ var2)));
         }
      } catch (vam var8) {
         throw a(var8);
      }

      double var5 = 0.0;
      int var7 = 0;

      double var10000;
      while (true) {
         if (var7 < this.mpd) {
            var10000 = var5 + this.ch5[var7] * var1.ch5[var7];
            if (var4 == 0) {
               break;
            }

            var5 = var10000;
            var7++;
            if (var4 != 0) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   public final void _ik(yb6 param1, yb6 param2, yb6 param3, hxi param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hxi.a J
      // 003: ldc2_w 84751151249918
      // 006: lxor
      // 007: lstore 5
      // 009: invokestatic t9d.c ()I
      // 00c: istore 7
      // 00e: aload 1
      // 00f: getfield yb6.dir I
      // 012: aload 4
      // 014: invokevirtual hxi.ud2 ()I
      // 017: iload 7
      // 019: ifne 035
      // 01c: if_icmpne 062
      // 01f: goto 026
      // 022: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: aload 1
      // 027: getfield yb6.dir I
      // 02a: aload 1
      // 02b: getfield yb6.bg8 I
      // 02e: goto 035
      // 031: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 034: athrow
      // 035: iload 7
      // 037: ifne 053
      // 03a: if_icmpne 062
      // 03d: goto 044
      // 040: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: aload 1
      // 045: getfield yb6.dir I
      // 048: aload 2
      // 049: getfield yb6.dir I
      // 04c: goto 053
      // 04f: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: iload 7
      // 055: ifne 089
      // 058: if_icmpeq 080
      // 05b: goto 062
      // 05e: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: new vam
      // 065: dup
      // 066: sipush 29471
      // 069: ldc2_w 2882904882575117986
      // 06c: lload 5
      // 06e: lxor
      // 06f: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: nop
      // 075: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 078: invokespecial vam.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: aload 2
      // 081: getfield yb6.bg8 I
      // 084: aload 0
      // 085: getfield hxi.ch5 [D
      // 088: arraylength
      // 089: iload 7
      // 08b: ifne 0a7
      // 08e: if_icmpne 0d4
      // 091: goto 098
      // 094: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 097: athrow
      // 098: aload 2
      // 099: getfield yb6.bg8 I
      // 09c: aload 3
      // 09d: getfield yb6.bg8 I
      // 0a0: goto 0a7
      // 0a3: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: iload 7
      // 0a9: ifne 0d1
      // 0ac: if_icmpne 0d4
      // 0af: goto 0b6
      // 0b2: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: aload 2
      // 0b7: iload 7
      // 0b9: ifne 101
      // 0bc: goto 0c3
      // 0bf: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: getfield yb6.bg8 I
      // 0c6: aload 3
      // 0c7: getfield yb6.dir I
      // 0ca: goto 0d1
      // 0cd: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: if_icmpeq 0f2
      // 0d4: new vam
      // 0d7: dup
      // 0d8: sipush 18309
      // 0db: ldc2_w 7081279881943497253
      // 0de: lload 5
      // 0e0: lxor
      // 0e1: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: nop
      // 0e7: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0ea: invokespecial vam.<init> (Ljava/lang/String;)V
      // 0ed: athrow
      // 0ee: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: new yb6
      // 0f5: dup
      // 0f6: aload 1
      // 0f7: getfield yb6.dir I
      // 0fa: aload 2
      // 0fb: getfield yb6.bg8 I
      // 0fe: invokespecial yb6.<init> (II)V
      // 101: astore 8
      // 103: aload 8
      // 105: aload 1
      // 106: aload 3
      // 107: invokevirtual yb6.h5m (Lyb6;Lyb6;)V
      // 10a: aload 8
      // 10c: aload 1
      // 10d: aload 2
      // 10e: invokevirtual yb6.oir (Lyb6;Lyb6;)V
      // 111: aload 8
      // 113: invokevirtual yb6.k9e ()V
      // 116: aload 0
      // 117: aload 8
      // 119: aload 4
      // 11b: invokevirtual hxi.ld_ (Lyb6;Lhxi;)V
      // 11e: return
   }

   public final void yz8(yb6 param1, hxi param2, hxi param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hxi.a J
      // 003: ldc2_w 133713914059328
      // 006: lxor
      // 007: lstore 4
      // 009: aload 1
      // 00a: getfield yb6.dir I
      // 00d: aload 1
      // 00e: getfield yb6.bg8 I
      // 011: imul
      // 012: istore 7
      // 014: invokestatic t9d.b ()I
      // 017: iload 7
      // 019: newarray 7
      // 01b: astore 8
      // 01d: iload 7
      // 01f: newarray 7
      // 021: astore 9
      // 023: aload 2
      // 024: invokevirtual hxi.ud2 ()I
      // 027: newarray 10
      // 029: astore 10
      // 02b: istore 6
      // 02d: aload 1
      // 02e: getfield yb6.dir I
      // 031: aload 2
      // 032: invokevirtual hxi.ud2 ()I
      // 035: iload 6
      // 037: ifeq 06a
      // 03a: if_icmpeq 062
      // 03d: goto 044
      // 040: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: new vam
      // 047: dup
      // 048: sipush 13196
      // 04b: ldc2_w 8806465135990222227
      // 04e: lload 4
      // 050: lxor
      // 051: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: nop
      // 057: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 05a: invokespecial vam.<init> (Ljava/lang/String;)V
      // 05d: athrow
      // 05e: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 1
      // 063: getfield yb6.dir I
      // 066: aload 3
      // 067: invokevirtual hxi.ud2 ()I
      // 06a: iload 6
      // 06c: ifeq 0ab
      // 06f: if_icmpeq 097
      // 072: goto 079
      // 075: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 078: athrow
      // 079: new vam
      // 07c: dup
      // 07d: sipush 7484
      // 080: ldc2_w 5950327083129013049
      // 083: lload 4
      // 085: lxor
      // 086: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: nop
      // 08c: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 08f: invokespecial vam.<init> (Ljava/lang/String;)V
      // 092: athrow
      // 093: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 1
      // 098: getfield yb6.dir I
      // 09b: iload 6
      // 09d: ifeq 0cd
      // 0a0: aload 1
      // 0a1: getfield yb6.bg8 I
      // 0a4: goto 0ab
      // 0a7: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: if_icmpeq 0cc
      // 0ae: new vam
      // 0b1: dup
      // 0b2: sipush 17308
      // 0b5: ldc2_w 8931334510779587972
      // 0b8: lload 4
      // 0ba: lxor
      // 0bb: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: nop
      // 0c1: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0c4: invokespecial vam.<init> (Ljava/lang/String;)V
      // 0c7: athrow
      // 0c8: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: istore 11
      // 0cf: iload 11
      // 0d1: aload 1
      // 0d2: getfield yb6.dir I
      // 0d5: if_icmpge 11c
      // 0d8: bipush 0
      // 0d9: iload 6
      // 0db: ifeq 11d
      // 0de: istore 12
      // 0e0: iload 12
      // 0e2: aload 1
      // 0e3: getfield yb6.bg8 I
      // 0e6: if_icmpge 114
      // 0e9: aload 8
      // 0eb: iload 11
      // 0ed: aload 1
      // 0ee: getfield yb6.bg8 I
      // 0f1: imul
      // 0f2: iload 12
      // 0f4: iadd
      // 0f5: aload 1
      // 0f6: getfield yb6.zk2 [[D
      // 0f9: iload 11
      // 0fb: aaload
      // 0fc: iload 12
      // 0fe: daload
      // 0ff: dastore
      // 100: iinc 12 1
      // 103: iload 6
      // 105: ifeq 117
      // 108: iload 6
      // 10a: ifne 0e0
      // 10d: goto 114
      // 110: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: iinc 11 1
      // 117: iload 6
      // 119: ifne 0cf
      // 11c: bipush 0
      // 11d: istore 11
      // 11f: iload 11
      // 121: iload 7
      // 123: if_icmpge 140
      // 126: aload 9
      // 128: iload 11
      // 12a: dconst_0
      // 12b: dastore
      // 12c: iinc 11 1
      // 12f: iload 6
      // 131: ifeq 143
      // 134: iload 6
      // 136: ifne 11f
      // 139: goto 140
      // 13c: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: bipush 0
      // 141: istore 11
      // 143: iload 11
      // 145: aload 1
      // 146: getfield yb6.dir I
      // 149: if_icmpge 178
      // 14c: aload 9
      // 14e: iload 11
      // 150: aload 1
      // 151: getfield yb6.bg8 I
      // 154: imul
      // 155: aload 2
      // 156: getfield hxi.ch5 [D
      // 159: iload 11
      // 15b: daload
      // 15c: dastore
      // 15d: iinc 11 1
      // 160: iload 6
      // 162: ifeq 17b
      // 165: goto 16c
      // 168: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: iload 6
      // 16e: ifne 143
      // 171: goto 178
      // 174: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: bipush 0
      // 179: istore 11
      // 17b: iload 11
      // 17d: aload 1
      // 17e: getfield yb6.bg8 I
      // 181: if_icmpge 1ac
      // 184: aload 10
      // 186: iload 11
      // 188: aload 3
      // 189: getfield hxi.ch5 [D
      // 18c: iload 11
      // 18e: daload
      // 18f: d2i
      // 190: iastore
      // 191: iinc 11 1
      // 194: iload 6
      // 196: ifeq 1b9
      // 199: goto 1a0
      // 19c: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: iload 6
      // 1a2: ifne 17b
      // 1a5: goto 1ac
      // 1a8: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ab: athrow
      // 1ac: aload 1
      // 1ad: getfield yb6.dir I
      // 1b0: aload 8
      // 1b2: aload 10
      // 1b4: aload 9
      // 1b6: invokestatic yb6.r3x (I[D[I[D)V
      // 1b9: bipush 0
      // 1ba: istore 11
      // 1bc: iload 11
      // 1be: aload 1
      // 1bf: getfield yb6.dir I
      // 1c2: if_icmpge 1de
      // 1c5: aload 0
      // 1c6: getfield hxi.ch5 [D
      // 1c9: iload 11
      // 1cb: aload 9
      // 1cd: iload 11
      // 1cf: aload 1
      // 1d0: getfield yb6.bg8 I
      // 1d3: imul
      // 1d4: daload
      // 1d5: dastore
      // 1d6: iinc 11 1
      // 1d9: iload 6
      // 1db: ifne 1bc
      // 1de: return
   }

   public final double xqw(hxi var1) {
      return Math.acos(this.s3s(var1) / (this.xwp() * var1.xwp()));
   }

   public final void caq(hxi var1, hxi var2, float var3) {
      this.d5a(var1, var2, (double)var3);
   }

   public final void q3z(hxi var1, float var2) {
      this.kn9(var1, (double)var2);
   }

   public final void d5a(hxi param1, hxi param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 106625983090694
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic t9d.b ()I
      // 0c: istore 7
      // 0e: aload 2
      // 0f: getfield hxi.mpd I
      // 12: aload 1
      // 13: getfield hxi.mpd I
      // 16: iload 7
      // 18: ifeq 57
      // 1b: if_icmpeq 43
      // 1e: goto 25
      // 21: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new vam
      // 28: dup
      // 29: sipush 10795
      // 2c: ldc2_w 1572511667294207601
      // 2f: lload 5
      // 31: lxor
      // 32: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: nop
      // 38: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 3b: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3e: athrow
      // 3f: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: aload 0
      // 44: getfield hxi.mpd I
      // 47: iload 7
      // 49: ifeq 79
      // 4c: aload 1
      // 4d: getfield hxi.mpd I
      // 50: goto 57
      // 53: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 56: athrow
      // 57: if_icmpeq 78
      // 5a: new vam
      // 5d: dup
      // 5e: sipush 9334
      // 61: ldc2_w 3204986170272313377
      // 64: lload 5
      // 66: lxor
      // 67: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: nop
      // 6d: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 70: invokespecial vam.<init> (Ljava/lang/String;)V
      // 73: athrow
      // 74: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77: athrow
      // 78: bipush 0
      // 79: istore 8
      // 7b: iload 8
      // 7d: aload 0
      // 7e: getfield hxi.mpd I
      // 81: if_icmpge a8
      // 84: aload 0
      // 85: getfield hxi.ch5 [D
      // 88: iload 8
      // 8a: dconst_1
      // 8b: dload 3
      // 8c: dsub
      // 8d: aload 1
      // 8e: getfield hxi.ch5 [D
      // 91: iload 8
      // 93: daload
      // 94: dmul
      // 95: dload 3
      // 96: aload 2
      // 97: getfield hxi.ch5 [D
      // 9a: iload 8
      // 9c: daload
      // 9d: dmul
      // 9e: dadd
      // 9f: dastore
      // a0: iinc 8 1
      // a3: iload 7
      // a5: ifne 7b
      // a8: return
   }

   public final void kn9(hxi param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hxi.a J
      // 03: ldc2_w 31954176265053
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 1
      // 0f: getfield hxi.mpd I
      // 12: iload 6
      // 14: ifeq 44
      // 17: aload 0
      // 18: getfield hxi.mpd I
      // 1b: if_icmpeq 43
      // 1e: goto 25
      // 21: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: new vam
      // 28: dup
      // 29: sipush 19401
      // 2c: ldc2_w 4939296645491344590
      // 2f: lload 4
      // 31: lxor
      // 32: invokedynamic b (IJ)Ljava/lang/String; bsm=hxi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: nop
      // 38: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 3b: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3e: athrow
      // 3f: invokestatic hxi.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42: athrow
      // 43: bipush 0
      // 44: istore 7
      // 46: iload 7
      // 48: aload 0
      // 49: getfield hxi.mpd I
      // 4c: if_icmpge 73
      // 4f: aload 0
      // 50: getfield hxi.ch5 [D
      // 53: iload 7
      // 55: dconst_1
      // 56: dload 2
      // 57: dsub
      // 58: aload 0
      // 59: getfield hxi.ch5 [D
      // 5c: iload 7
      // 5e: daload
      // 5f: dmul
      // 60: dload 2
      // 61: aload 1
      // 62: getfield hxi.ch5 [D
      // 65: iload 7
      // 67: daload
      // 68: dmul
      // 69: dadd
      // 6a: dastore
      // 6b: iinc 7 1
      // 6e: iload 6
      // 70: ifne 46
      // 73: return
   }

   @Override
   public Object clone() {
      int var1 = t9d.b();
      hxi var2 = null;

      try {
         var2 = (hxi)super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError();
      }

      var2.ch5 = new double[this.mpd];
      int var3 = 0;

      hxi var10000;
      while (true) {
         if (var3 < this.mpd) {
            try {
               var10000 = var2;
               if (var1 == 0) {
                  break;
               }

               var2.ch5[var3] = this.ch5[var3];
               var3++;
               if (var1 != 0) {
                  continue;
               }
            } catch (CloneNotSupportedException var5) {
               throw a(var5);
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2228376220727158929L, 6732111186767696047L, MethodHandles.lookup().lookupClass()).a(235570036359666L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 93162774743158L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[23];
      int var7 = 0;
      String var6 = "\u0096w ÜöGeí¬Ë}\u008fÞ\u0012¹\u0090'ÍÅî\u001fØþ¿ utº\u0003¤\u0019\u0084çÙ\u001e^Pk\u009a^+÷ä<\u001c\u0085%uº\u0096ñW®\u0006?ÆÝ u\u0096·Ê4S\u00072°±·Ø\u009cú+4Ê\u001bõo¹A¯\u0093ì\u008d\u0085`E²ú-\u0018«S\u0018\u0097ä`Xé³\u0081ý5\u0096qW\u008ejN\u001c¸bÓ¼\u0019 ¿°\u0012ê\u0082úï\u0007¥Ø\u008a¶\u0014Oã®\u000fRû\u0019Ú#a´:ûbî3¾,\u001f PûÆoN\u000fö7\u007fr0 o,0\u008cÆ\u001e4\u0095òOlô\u0001\u0014Où§\"\u0000\u00ad \u009a\u0007ÂEÌ0 [¹2\u009bØ\"ÿøçÖ\nk×Åä\u0003Ï\b©CUÿ\u001e\u00ad¬\u0018\n\u007fß6ï£\u0082J\u0017~k§®2c{4Ïl®|T¶° \u0083Ç\rãË¼\u0085\u0083 ñål\u0018æ\u0087\u008d\u008bX$#ú\u0084 ñ\u0092«\u001fî\u0087ýáF\u0018\u0013\u0015\u0097\u0011r\u0080ùj§\u0082Õ\u0001V\u001c\u008fYõ\u0001\u00983\u001añl× Ó\u00ad\u009c\u001aq\u0018*Hm*\u0001VB\u0004²Û[É\u0014¢Ågg\"¼H\bøÑÇ-\u0011\u0018d¤\u0012Êq\u0093Df\u0000\u000fS½\u008d¢\u0012\u000büt'\\cÖ±© 2µx\u000b\u009dÑÃ\u008b`ÔOdWM2_9X·}\u0097Ã\u0007ø\n}t¦a¨\u0090\u008c 5f\u0096N;Þ»£À\u0081ÕëÕz\u001c\f4>ã\u0090ò\u0085U§\u009b\u0086úqÆ¦Mè ÄÉ6\u0018$y¡Å\u0088\u00038Z0×q-\u0084\u0017z6!i «\u0005\u0002DO\u0001Í\u0080#\u0018(Èêù'T[s7hð\u008a>\b¯\u0017_fµ\u0088Þ_n× \u0011,\u001b\u0083Ur6åT\u0096i¡C\u009eÇBÖÕ\u007f\u001bYP\u009aF×9\u0092þ±\b\u0081_\u0018è4÷õ×\u009dy9Ï\u00024¤Oõ1Ý\u009fDU%÷¯\u0099\u009d\u0018¶\fË»M\u008a\\\u001eWU;¸ná\u001cùk\u00020\u0080m\u0092B/ VZI\u0002Õ\u0017\u0007ì7o\u00158\u001cTBÐóþYÊãZ>1ï²\u0001ÕsÐ\u0006{\u0018¢¦\"¼Ô¬P\u0007ÕÈSò\u0016ï:\u0091ãÄ:Äe94\u0007";
      int var8 = "\u0096w ÜöGeí¬Ë}\u008fÞ\u0012¹\u0090'ÍÅî\u001fØþ¿ utº\u0003¤\u0019\u0084çÙ\u001e^Pk\u009a^+÷ä<\u001c\u0085%uº\u0096ñW®\u0006?ÆÝ u\u0096·Ê4S\u00072°±·Ø\u009cú+4Ê\u001bõo¹A¯\u0093ì\u008d\u0085`E²ú-\u0018«S\u0018\u0097ä`Xé³\u0081ý5\u0096qW\u008ejN\u001c¸bÓ¼\u0019 ¿°\u0012ê\u0082úï\u0007¥Ø\u008a¶\u0014Oã®\u000fRû\u0019Ú#a´:ûbî3¾,\u001f PûÆoN\u000fö7\u007fr0 o,0\u008cÆ\u001e4\u0095òOlô\u0001\u0014Où§\"\u0000\u00ad \u009a\u0007ÂEÌ0 [¹2\u009bØ\"ÿøçÖ\nk×Åä\u0003Ï\b©CUÿ\u001e\u00ad¬\u0018\n\u007fß6ï£\u0082J\u0017~k§®2c{4Ïl®|T¶° \u0083Ç\rãË¼\u0085\u0083 ñål\u0018æ\u0087\u008d\u008bX$#ú\u0084 ñ\u0092«\u001fî\u0087ýáF\u0018\u0013\u0015\u0097\u0011r\u0080ùj§\u0082Õ\u0001V\u001c\u008fYõ\u0001\u00983\u001añl× Ó\u00ad\u009c\u001aq\u0018*Hm*\u0001VB\u0004²Û[É\u0014¢Ågg\"¼H\bøÑÇ-\u0011\u0018d¤\u0012Êq\u0093Df\u0000\u000fS½\u008d¢\u0012\u000büt'\\cÖ±© 2µx\u000b\u009dÑÃ\u008b`ÔOdWM2_9X·}\u0097Ã\u0007ø\n}t¦a¨\u0090\u008c 5f\u0096N;Þ»£À\u0081ÕëÕz\u001c\f4>ã\u0090ò\u0085U§\u009b\u0086úqÆ¦Mè ÄÉ6\u0018$y¡Å\u0088\u00038Z0×q-\u0084\u0017z6!i «\u0005\u0002DO\u0001Í\u0080#\u0018(Èêù'T[s7hð\u008a>\b¯\u0017_fµ\u0088Þ_n× \u0011,\u001b\u0083Ur6åT\u0096i¡C\u009eÇBÖÕ\u007f\u001bYP\u009aF×9\u0092þ±\b\u0081_\u0018è4÷õ×\u009dy9Ï\u00024¤Oõ1Ý\u009fDU%÷¯\u0099\u009d\u0018¶\fË»M\u008a\\\u001eWU;¸ná\u001cùk\u00020\u0080m\u0092B/ VZI\u0002Õ\u0017\u0007ì7o\u00158\u001cTBÐóþYÊãZ>1ï²\u0001ÕsÐ\u0006{\u0018¢¦\"¼Ô¬P\u0007ÕÈSò\u0016ï:\u0091ãÄ:Äe94\u0007"
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
                     c = new String[23];
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

                  var6 = "\u008eæÀvÚ\u0014\u0095Ý;'Odé\bv\u00adB2\u0087n-á¤¯Ç2ÈÔã¬V\u0016\u0018\u0099%úÎ\u0005\u0000ÓW#ÂD\n(üojá\u0088Ñ:!fù}";
                  var8 = "\u008eæÀvÚ\u0014\u0095Ý;'Odé\bv\u00adB2\u0087n-á¤¯Ç2ÈÔã¬V\u0016\u0018\u0099%úÎ\u0005\u0000ÓW#ÂD\n(üojá\u0088Ñ:!fù}".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22781;
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
            throw new RuntimeException("hxi", var10);
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
         throw new RuntimeException("hxi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
