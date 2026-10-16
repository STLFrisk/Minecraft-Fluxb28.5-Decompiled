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

public class yb6 implements Serializable, Cloneable {
   public static final long serialVersionUID = 2777097312029690941L;
   public int dir;
   public int bg8;
   public double[][] zk2;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public yb6(int var1, int var2) {
      int var10000 = OpaquePredicate.c();
      this.zk2 = new double[var1][var2];
      int var3 = var10000;
      this.dir = var1;
      this.bg8 = var2;
      int var4 = 0;

      while (true) {
         if (var4 < var1) {
            var10000 = 0;
            if (var3 != 0) {
               break;
            }

            int var5 = 0;

            label74: {
               while (var5 < var2) {
                  try {
                     this.zk2[var4][var5] = 0.0;
                     var5++;
                     if (var3 != 0) {
                        break label74;
                     }

                     if (var3 != 0) {
                        break;
                     }
                  } catch (vam var10) {
                     throw a(var10);
                  }
               }

               var4++;
            }

            if (var3 == 0) {
               continue;
            }
         }

         var10000 = var1;
         break;
      }

      int var6;
      label59: {
         label87: {
            label84: {
               try {
                  if (var3 != 0) {
                     break label87;
                  }

                  if (var10000 >= var2) {
                     break label84;
                  }
               } catch (vam var9) {
                  throw a(var9);
               }

               var6 = var1;

               try {
                  if (var3 == 0) {
                     break label59;
                  }
               } catch (vam var8) {
                  boolean var10001 = false;
                  throw a(var8);
               }
            }

            try {
               var10000 = var2;
            } catch (vam var7) {
               boolean var14 = false;
               throw a(var7);
            }
         }

         var6 = var10000;
      }

      var4 = 0;

      while (var4 < var6) {
         this.zk2[var4][var4] = 1.0;
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public yb6(int var1, int var2, double[] var3) {
      this.zk2 = new double[var1][var2];
      this.dir = var1;
      this.bg8 = var2;
      int var10000 = OpaquePredicate.c();
      int var5 = 0;
      int var4 = var10000;

      while (var5 < var1) {
         int var6 = 0;

         while (true) {
            if (var6 < var2) {
               try {
                  this.zk2[var5][var6] = var3[var5 * var2 + var6];
                  var6++;
                  if (var4 != 0) {
                     break;
                  }

                  if (var4 == 0) {
                     continue;
                  }
               } catch (vam var7) {
                  throw a(var7);
               }
            }

            var5++;
            break;
         }

         if (var4 != 0) {
            break;
         }
      }
   }

   public yb6(yb6 var1) {
      this.dir = var1.dir;
      int var10000 = OpaquePredicate.b();
      this.bg8 = var1.bg8;
      int var2 = var10000;
      this.zk2 = new double[this.dir][this.bg8];
      int var3 = 0;

      while (var3 < this.dir) {
         int var4 = 0;

         while (true) {
            if (var4 < this.bg8) {
               try {
                  this.zk2[var3][var4] = var1.zk2[var3][var4];
                  var4++;
                  if (var2 == 0) {
                     break;
                  }

                  if (var2 != 0) {
                     continue;
                  }
               } catch (vam var5) {
                  throw a(var5);
               }
            }

            var3++;
            break;
         }

         if (var2 == 0) {
            break;
         }
      }
   }

   public final void alt(yb6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 140417088009990
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield yb6.bg8 I
      // 11: aload 1
      // 12: getfield yb6.dir I
      // 15: iload 4
      // 17: ifne 33
      // 1a: if_icmpne 42
      // 1d: goto 24
      // 20: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield yb6.bg8 I
      // 28: aload 1
      // 29: getfield yb6.bg8 I
      // 2c: goto 33
      // 2f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32: athrow
      // 33: iload 4
      // 35: ifne 67
      // 38: if_icmpeq 5f
      // 3b: goto 42
      // 3e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: new vam
      // 45: dup
      // 46: sipush 19134
      // 49: ldc2_w 4730042374183165419
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 57: invokespecial vam.<init> (Ljava/lang/String;)V
      // 5a: athrow
      // 5b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield yb6.dir I
      // 63: aload 0
      // 64: getfield yb6.bg8 I
      // 67: multianewarray 42 2
      // 6b: astore 8
      // 6d: bipush 0
      // 6e: istore 5
      // 70: iload 5
      // 72: aload 0
      // 73: getfield yb6.dir I
      // 76: if_icmpge e3
      // 79: bipush 0
      // 7a: istore 6
      // 7c: iload 6
      // 7e: aload 0
      // 7f: getfield yb6.bg8 I
      // 82: if_icmpge db
      // 85: aload 8
      // 87: iload 5
      // 89: aaload
      // 8a: iload 6
      // 8c: dconst_0
      // 8d: dastore
      // 8e: bipush 0
      // 8f: iload 4
      // 91: ifne 72
      // 94: istore 7
      // 96: iload 7
      // 98: aload 0
      // 99: getfield yb6.bg8 I
      // 9c: if_icmpge d3
      // 9f: aload 8
      // a1: iload 5
      // a3: aaload
      // a4: iload 6
      // a6: dup2
      // a7: daload
      // a8: aload 0
      // a9: getfield yb6.zk2 [[D
      // ac: iload 5
      // ae: aaload
      // af: iload 7
      // b1: daload
      // b2: aload 1
      // b3: getfield yb6.zk2 [[D
      // b6: iload 7
      // b8: aaload
      // b9: iload 6
      // bb: daload
      // bc: dmul
      // bd: dadd
      // be: dastore
      // bf: iinc 7 1
      // c2: iload 4
      // c4: ifne d6
      // c7: iload 4
      // c9: ifeq 96
      // cc: goto d3
      // cf: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: iinc 6 1
      // d6: iload 4
      // d8: ifeq 7c
      // db: iinc 5 1
      // de: iload 4
      // e0: ifeq 70
      // e3: aload 0
      // e4: aload 8
      // e6: putfield yb6.zk2 [[D
      // e9: return
   }

   public final void h5m(yb6 param1, yb6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 107163155878832
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: getfield yb6.bg8 I
      // 011: aload 2
      // 012: getfield yb6.dir I
      // 015: iload 5
      // 017: ifeq 033
      // 01a: if_icmpne 060
      // 01d: goto 024
      // 020: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 0
      // 025: getfield yb6.dir I
      // 028: aload 1
      // 029: getfield yb6.dir I
      // 02c: goto 033
      // 02f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: iload 5
      // 035: ifeq 051
      // 038: if_icmpne 060
      // 03b: goto 042
      // 03e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 0
      // 043: getfield yb6.bg8 I
      // 046: aload 2
      // 047: getfield yb6.bg8 I
      // 04a: goto 051
      // 04d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: iload 5
      // 053: ifeq 085
      // 056: if_icmpeq 07d
      // 059: goto 060
      // 05c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: new vam
      // 063: dup
      // 064: sipush 14009
      // 067: ldc2_w 4679581218633024851
      // 06a: lload 3
      // 06b: lxor
      // 06c: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: nop
      // 072: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 075: invokespecial vam.<init> (Ljava/lang/String;)V
      // 078: athrow
      // 079: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield yb6.dir I
      // 081: aload 0
      // 082: getfield yb6.bg8 I
      // 085: multianewarray 42 2
      // 089: astore 9
      // 08b: bipush 0
      // 08c: istore 6
      // 08e: iload 6
      // 090: aload 1
      // 091: getfield yb6.dir I
      // 094: if_icmpge 101
      // 097: bipush 0
      // 098: istore 7
      // 09a: iload 7
      // 09c: aload 2
      // 09d: getfield yb6.bg8 I
      // 0a0: if_icmpge 0f9
      // 0a3: aload 9
      // 0a5: iload 6
      // 0a7: aaload
      // 0a8: iload 7
      // 0aa: dconst_0
      // 0ab: dastore
      // 0ac: bipush 0
      // 0ad: iload 5
      // 0af: ifeq 090
      // 0b2: istore 8
      // 0b4: iload 8
      // 0b6: aload 1
      // 0b7: getfield yb6.bg8 I
      // 0ba: if_icmpge 0f1
      // 0bd: aload 9
      // 0bf: iload 6
      // 0c1: aaload
      // 0c2: iload 7
      // 0c4: dup2
      // 0c5: daload
      // 0c6: aload 1
      // 0c7: getfield yb6.zk2 [[D
      // 0ca: iload 6
      // 0cc: aaload
      // 0cd: iload 8
      // 0cf: daload
      // 0d0: aload 2
      // 0d1: getfield yb6.zk2 [[D
      // 0d4: iload 8
      // 0d6: aaload
      // 0d7: iload 7
      // 0d9: daload
      // 0da: dmul
      // 0db: dadd
      // 0dc: dastore
      // 0dd: iinc 8 1
      // 0e0: iload 5
      // 0e2: ifeq 0f4
      // 0e5: iload 5
      // 0e7: ifne 0b4
      // 0ea: goto 0f1
      // 0ed: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f0: athrow
      // 0f1: iinc 7 1
      // 0f4: iload 5
      // 0f6: ifne 09a
      // 0f9: iinc 6 1
      // 0fc: iload 5
      // 0fe: ifne 08e
      // 101: aload 0
      // 102: aload 9
      // 104: putfield yb6.zk2 [[D
      // 107: return
   }

   public final void d8s(hxi param1, hxi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 16078195127553
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: getfield yb6.dir I
      // 11: aload 1
      // 12: invokevirtual hxi.ud2 ()I
      // 15: iload 5
      // 17: ifeq 55
      // 1a: if_icmpge 41
      // 1d: goto 24
      // 20: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 12411
      // 2b: ldc2_w 5677200056481359114
      // 2e: lload 3
      // 2f: lxor
      // 30: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: getfield yb6.bg8 I
      // 45: iload 5
      // 47: ifeq 76
      // 4a: aload 2
      // 4b: invokevirtual hxi.ud2 ()I
      // 4e: goto 55
      // 51: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpge 75
      // 58: new vam
      // 5b: dup
      // 5c: sipush 24492
      // 5f: ldc2_w 5631628359482952407
      // 62: lload 3
      // 63: lxor
      // 64: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 6d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: bipush 0
      // 76: istore 6
      // 78: iload 6
      // 7a: aload 1
      // 7b: invokevirtual hxi.ud2 ()I
      // 7e: if_icmpge c2
      // 81: bipush 0
      // 82: istore 7
      // 84: iload 7
      // 86: aload 2
      // 87: invokevirtual hxi.ud2 ()I
      // 8a: if_icmpge ba
      // 8d: aload 0
      // 8e: getfield yb6.zk2 [[D
      // 91: iload 6
      // 93: aaload
      // 94: iload 7
      // 96: aload 1
      // 97: getfield hxi.ch5 [D
      // 9a: iload 6
      // 9c: daload
      // 9d: aload 2
      // 9e: getfield hxi.ch5 [D
      // a1: iload 7
      // a3: daload
      // a4: dmul
      // a5: dastore
      // a6: iinc 7 1
      // a9: iload 5
      // ab: ifeq bd
      // ae: iload 5
      // b0: ifne 84
      // b3: goto ba
      // b6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b9: athrow
      // ba: iinc 6 1
      // bd: iload 5
      // bf: ifne 78
      // c2: return
   }

   public final void r5j(yb6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 65784600512096
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield yb6.dir I
      // 11: aload 1
      // 12: getfield yb6.dir I
      // 15: iload 4
      // 17: ifne 55
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 12204
      // 2b: ldc2_w 2421430562929707439
      // 2e: lload 2
      // 2f: lxor
      // 30: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: getfield yb6.bg8 I
      // 45: iload 4
      // 47: ifne 76
      // 4a: aload 1
      // 4b: getfield yb6.bg8 I
      // 4e: goto 55
      // 51: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpeq 75
      // 58: new vam
      // 5b: dup
      // 5c: sipush 7040
      // 5f: ldc2_w 4863250745208061337
      // 62: lload 2
      // 63: lxor
      // 64: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 6d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: bipush 0
      // 76: istore 5
      // 78: iload 5
      // 7a: aload 0
      // 7b: getfield yb6.dir I
      // 7e: if_icmpge c8
      // 81: bipush 0
      // 82: istore 6
      // 84: iload 6
      // 86: aload 0
      // 87: getfield yb6.bg8 I
      // 8a: if_icmpge c0
      // 8d: aload 0
      // 8e: getfield yb6.zk2 [[D
      // 91: iload 5
      // 93: aaload
      // 94: iload 6
      // 96: aload 0
      // 97: getfield yb6.zk2 [[D
      // 9a: iload 5
      // 9c: aaload
      // 9d: iload 6
      // 9f: daload
      // a0: aload 1
      // a1: getfield yb6.zk2 [[D
      // a4: iload 5
      // a6: aaload
      // a7: iload 6
      // a9: daload
      // aa: dadd
      // ab: dastore
      // ac: iinc 6 1
      // af: iload 4
      // b1: ifne c3
      // b4: iload 4
      // b6: ifeq 84
      // b9: goto c0
      // bc: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bf: athrow
      // c0: iinc 5 1
      // c3: iload 4
      // c5: ifeq 78
      // c8: return
   }

   public final void rcv(yb6 param1, yb6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 41037482867798
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: getfield yb6.dir I
      // 011: aload 1
      // 012: getfield yb6.dir I
      // 015: iload 5
      // 017: ifne 048
      // 01a: if_icmpeq 040
      // 01d: goto 024
      // 020: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: new vam
      // 027: dup
      // 028: bipush 90
      // 02a: ldc2_w 5440748715600043092
      // 02d: lload 3
      // 02e: lxor
      // 02f: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: nop
      // 035: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 038: invokespecial vam.<init> (Ljava/lang/String;)V
      // 03b: athrow
      // 03c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: aload 2
      // 041: getfield yb6.bg8 I
      // 044: aload 1
      // 045: getfield yb6.bg8 I
      // 048: iload 5
      // 04a: ifne 07c
      // 04d: if_icmpeq 074
      // 050: goto 057
      // 053: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: new vam
      // 05a: dup
      // 05b: sipush 3754
      // 05e: ldc2_w 160882178436878997
      // 061: lload 3
      // 062: lxor
      // 063: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: nop
      // 069: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 06c: invokespecial vam.<init> (Ljava/lang/String;)V
      // 06f: athrow
      // 070: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: aload 0
      // 075: getfield yb6.bg8 I
      // 078: aload 1
      // 079: getfield yb6.bg8 I
      // 07c: iload 5
      // 07e: ifne 0a6
      // 081: if_icmpne 0a9
      // 084: goto 08b
      // 087: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08a: athrow
      // 08b: aload 0
      // 08c: getfield yb6.dir I
      // 08f: iload 5
      // 091: ifne 0c7
      // 094: goto 09b
      // 097: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: aload 1
      // 09c: getfield yb6.dir I
      // 09f: goto 0a6
      // 0a2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: if_icmpeq 0c6
      // 0a9: new vam
      // 0ac: dup
      // 0ad: sipush 23217
      // 0b0: ldc2_w 4434670285196560038
      // 0b3: lload 3
      // 0b4: lxor
      // 0b5: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: nop
      // 0bb: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0be: invokespecial vam.<init> (Ljava/lang/String;)V
      // 0c1: athrow
      // 0c2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: bipush 0
      // 0c7: istore 6
      // 0c9: iload 6
      // 0cb: aload 0
      // 0cc: getfield yb6.dir I
      // 0cf: if_icmpge 119
      // 0d2: bipush 0
      // 0d3: istore 7
      // 0d5: iload 7
      // 0d7: aload 0
      // 0d8: getfield yb6.bg8 I
      // 0db: if_icmpge 111
      // 0de: aload 0
      // 0df: getfield yb6.zk2 [[D
      // 0e2: iload 6
      // 0e4: aaload
      // 0e5: iload 7
      // 0e7: aload 1
      // 0e8: getfield yb6.zk2 [[D
      // 0eb: iload 6
      // 0ed: aaload
      // 0ee: iload 7
      // 0f0: daload
      // 0f1: aload 2
      // 0f2: getfield yb6.zk2 [[D
      // 0f5: iload 6
      // 0f7: aaload
      // 0f8: iload 7
      // 0fa: daload
      // 0fb: dadd
      // 0fc: dastore
      // 0fd: iinc 7 1
      // 100: iload 5
      // 102: ifne 114
      // 105: iload 5
      // 107: ifeq 0d5
      // 10a: goto 111
      // 10d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 110: athrow
      // 111: iinc 6 1
      // 114: iload 5
      // 116: ifeq 0c9
      // 119: return
   }

   public final void z4t(yb6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 70931956863731
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield yb6.dir I
      // 11: aload 1
      // 12: getfield yb6.dir I
      // 15: iload 4
      // 17: ifne 55
      // 1a: if_icmpeq 41
      // 1d: goto 24
      // 20: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: new vam
      // 27: dup
      // 28: sipush 7121
      // 2b: ldc2_w 6782509921300179284
      // 2e: lload 2
      // 2f: lxor
      // 30: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: nop
      // 36: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 39: invokespecial vam.<init> (Ljava/lang/String;)V
      // 3c: athrow
      // 3d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40: athrow
      // 41: aload 0
      // 42: getfield yb6.bg8 I
      // 45: iload 4
      // 47: ifne 76
      // 4a: aload 1
      // 4b: getfield yb6.bg8 I
      // 4e: goto 55
      // 51: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: if_icmpeq 75
      // 58: new vam
      // 5b: dup
      // 5c: sipush 17177
      // 5f: ldc2_w 5312293860253774239
      // 62: lload 2
      // 63: lxor
      // 64: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: nop
      // 6a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 6d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 70: athrow
      // 71: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 74: athrow
      // 75: bipush 0
      // 76: istore 5
      // 78: iload 5
      // 7a: aload 0
      // 7b: getfield yb6.dir I
      // 7e: if_icmpge c8
      // 81: bipush 0
      // 82: istore 6
      // 84: iload 6
      // 86: aload 0
      // 87: getfield yb6.bg8 I
      // 8a: if_icmpge c0
      // 8d: aload 0
      // 8e: getfield yb6.zk2 [[D
      // 91: iload 5
      // 93: aaload
      // 94: iload 6
      // 96: aload 0
      // 97: getfield yb6.zk2 [[D
      // 9a: iload 5
      // 9c: aaload
      // 9d: iload 6
      // 9f: daload
      // a0: aload 1
      // a1: getfield yb6.zk2 [[D
      // a4: iload 5
      // a6: aaload
      // a7: iload 6
      // a9: daload
      // aa: dsub
      // ab: dastore
      // ac: iinc 6 1
      // af: iload 4
      // b1: ifne c3
      // b4: iload 4
      // b6: ifeq 84
      // b9: goto c0
      // bc: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // bf: athrow
      // c0: iinc 5 1
      // c3: iload 4
      // c5: ifeq 78
      // c8: return
   }

   public final void ecm(yb6 param1, yb6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 55130194269228
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: getfield yb6.dir I
      // 011: aload 1
      // 012: getfield yb6.dir I
      // 015: iload 5
      // 017: ifne 049
      // 01a: if_icmpeq 041
      // 01d: goto 024
      // 020: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: new vam
      // 027: dup
      // 028: sipush 20910
      // 02b: ldc2_w 8328488269317268963
      // 02e: lload 3
      // 02f: lxor
      // 030: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 039: invokespecial vam.<init> (Ljava/lang/String;)V
      // 03c: athrow
      // 03d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 040: athrow
      // 041: aload 2
      // 042: getfield yb6.bg8 I
      // 045: aload 1
      // 046: getfield yb6.bg8 I
      // 049: iload 5
      // 04b: ifne 07d
      // 04e: if_icmpeq 075
      // 051: goto 058
      // 054: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: new vam
      // 05b: dup
      // 05c: sipush 22461
      // 05f: ldc2_w 4643656048101319677
      // 062: lload 3
      // 063: lxor
      // 064: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: nop
      // 06a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 06d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 070: athrow
      // 071: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: aload 0
      // 076: getfield yb6.dir I
      // 079: aload 1
      // 07a: getfield yb6.dir I
      // 07d: iload 5
      // 07f: ifne 0a7
      // 082: if_icmpne 0aa
      // 085: goto 08c
      // 088: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: aload 0
      // 08d: getfield yb6.bg8 I
      // 090: iload 5
      // 092: ifne 0c8
      // 095: goto 09c
      // 098: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09b: athrow
      // 09c: aload 1
      // 09d: getfield yb6.bg8 I
      // 0a0: goto 0a7
      // 0a3: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a6: athrow
      // 0a7: if_icmpeq 0c7
      // 0aa: new vam
      // 0ad: dup
      // 0ae: sipush 25800
      // 0b1: ldc2_w 2620357185158336694
      // 0b4: lload 3
      // 0b5: lxor
      // 0b6: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0bf: invokespecial vam.<init> (Ljava/lang/String;)V
      // 0c2: athrow
      // 0c3: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: bipush 0
      // 0c8: istore 6
      // 0ca: iload 6
      // 0cc: aload 0
      // 0cd: getfield yb6.dir I
      // 0d0: if_icmpge 11a
      // 0d3: bipush 0
      // 0d4: istore 7
      // 0d6: iload 7
      // 0d8: aload 0
      // 0d9: getfield yb6.bg8 I
      // 0dc: if_icmpge 112
      // 0df: aload 0
      // 0e0: getfield yb6.zk2 [[D
      // 0e3: iload 6
      // 0e5: aaload
      // 0e6: iload 7
      // 0e8: aload 1
      // 0e9: getfield yb6.zk2 [[D
      // 0ec: iload 6
      // 0ee: aaload
      // 0ef: iload 7
      // 0f1: daload
      // 0f2: aload 2
      // 0f3: getfield yb6.zk2 [[D
      // 0f6: iload 6
      // 0f8: aaload
      // 0f9: iload 7
      // 0fb: daload
      // 0fc: dsub
      // 0fd: dastore
      // 0fe: iinc 7 1
      // 101: iload 5
      // 103: ifne 115
      // 106: iload 5
      // 108: ifeq 0d6
      // 10b: goto 112
      // 10e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: iinc 6 1
      // 115: iload 5
      // 117: ifeq 0ca
      // 11a: return
   }

   public final void _rw() {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      while (var2 < this.dir) {
         int var3 = 0;

         while (true) {
            if (var3 < this.bg8) {
               try {
                  this.zk2[var2][var3] = -this.zk2[var2][var3];
                  var3++;
                  if (var1 != 0) {
                     break;
                  }

                  if (var1 == 0) {
                     continue;
                  }
               } catch (vam var4) {
                  throw a(var4);
               }
            }

            var2++;
            break;
         }

         if (var1 != 0) {
            break;
         }
      }
   }

   public final void ur6(yb6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 8201057736311
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield yb6.dir I
      // 11: aload 1
      // 12: getfield yb6.dir I
      // 15: iload 4
      // 17: ifeq 3f
      // 1a: if_icmpne 42
      // 1d: goto 24
      // 20: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: getfield yb6.bg8 I
      // 28: iload 4
      // 2a: ifeq 60
      // 2d: goto 34
      // 30: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33: athrow
      // 34: aload 1
      // 35: getfield yb6.bg8 I
      // 38: goto 3f
      // 3b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: if_icmpeq 5f
      // 42: new vam
      // 45: dup
      // 46: sipush 29593
      // 49: ldc2_w 2350120536291542419
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 57: invokespecial vam.<init> (Ljava/lang/String;)V
      // 5a: athrow
      // 5b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: bipush 0
      // 60: istore 5
      // 62: iload 5
      // 64: aload 0
      // 65: getfield yb6.dir I
      // 68: if_icmpge a8
      // 6b: bipush 0
      // 6c: istore 6
      // 6e: iload 6
      // 70: aload 0
      // 71: getfield yb6.bg8 I
      // 74: if_icmpge a0
      // 77: aload 0
      // 78: getfield yb6.zk2 [[D
      // 7b: iload 5
      // 7d: aaload
      // 7e: iload 6
      // 80: aload 1
      // 81: getfield yb6.zk2 [[D
      // 84: iload 5
      // 86: aaload
      // 87: iload 6
      // 89: daload
      // 8a: dneg
      // 8b: dastore
      // 8c: iinc 6 1
      // 8f: iload 4
      // 91: ifeq a3
      // 94: iload 4
      // 96: ifne 6e
      // 99: goto a0
      // 9c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9f: athrow
      // a0: iinc 5 1
      // a3: iload 4
      // a5: ifne 62
      // a8: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void rtk() {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 < this.dir) {
            var10000 = 0;
            if (var1 != 0) {
               break;
            }

            int var3 = 0;

            label74: {
               while (var3 < this.bg8) {
                  try {
                     this.zk2[var2][var3] = 0.0;
                     var3++;
                     if (var1 != 0) {
                        break label74;
                     }

                     if (var1 != 0) {
                        break;
                     }
                  } catch (vam var8) {
                     throw a(var8);
                  }
               }

               var2++;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10000 = this.dir;
         break;
      }

      int var4;
      label59: {
         label87: {
            label84: {
               try {
                  if (var1 != 0) {
                     break label87;
                  }

                  if (var10000 >= this.bg8) {
                     break label84;
                  }
               } catch (vam var7) {
                  throw a(var7);
               }

               var4 = this.dir;

               try {
                  if (var1 == 0) {
                     break label59;
                  }
               } catch (vam var6) {
                  boolean var10001 = false;
                  throw a(var6);
               }
            }

            try {
               var10000 = this.bg8;
            } catch (vam var5) {
               boolean var11 = false;
               throw a(var5);
            }
         }

         var4 = var10000;
      }

      var2 = 0;

      while (var2 < var4) {
         this.zk2[var2][var2] = 1.0;
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   public final void qkf() {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      while (var2 < this.dir) {
         int var3 = 0;

         while (true) {
            if (var3 < this.bg8) {
               try {
                  this.zk2[var2][var3] = 0.0;
                  var3++;
                  if (var1 != 0) {
                     break;
                  }

                  if (var1 == 0) {
                     continue;
                  }
               } catch (vam var4) {
                  throw a(var4);
               }
            }

            var2++;
            break;
         }

         if (var1 != 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void gex() {
      int var1 = OpaquePredicate.c();
      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 < this.dir) {
            var10000 = 0;
            if (var1 != 0) {
               break;
            }

            int var3 = 0;

            label74: {
               while (var3 < this.bg8) {
                  try {
                     this.zk2[var2][var3] = -this.zk2[var2][var3];
                     var3++;
                     if (var1 != 0) {
                        break label74;
                     }

                     if (var1 != 0) {
                        break;
                     }
                  } catch (vam var8) {
                     throw a(var8);
                  }
               }

               var2++;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10000 = this.dir;
         break;
      }

      int var4;
      label59: {
         label87: {
            label84: {
               try {
                  if (var1 != 0) {
                     break label87;
                  }

                  if (var10000 >= this.bg8) {
                     break label84;
                  }
               } catch (vam var7) {
                  throw a(var7);
               }

               var4 = this.dir;

               try {
                  if (var1 == 0) {
                     break label59;
                  }
               } catch (vam var6) {
                  boolean var10001 = false;
                  throw a(var6);
               }
            }

            try {
               var10000 = this.bg8;
            } catch (vam var5) {
               boolean var11 = false;
               throw a(var5);
            }
         }

         var4 = var10000;
      }

      var2 = 0;

      while (var2 < var4) {
         this.zk2[var2][var2]++;
         var2++;
         if (var1 != 0) {
            break;
         }
      }
   }

   public final void k9e() {
      this.jni(this);
   }

   public final void jid(yb6 var1) {
      this.jni(var1);
   }

   public final void j1l(int var1, int var2, int var3, int var4, int var5, int var6, yb6 var7) {
      int var8 = OpaquePredicate.b();
      if (this != var7) {
         int var9 = 0;

         label99:
         do {
            if (var9 >= var3) {
               return;
            }

            int var10 = 0;

            while (var10 < var4) {
               try {
                  var7.zk2[var5 + var9][var6 + var10] = this.zk2[var1 + var9][var2 + var10];
                  var10++;
                  if (var8 == 0) {
                     continue label99;
                  }

                  if (var8 == 0) {
                     break;
                  }
               } catch (vam var14) {
                  throw a(var14);
               }
            }

            var9++;
         } while (var8 != 0);
      }

      double[][] var11 = new double[var3][var4];
      int var15 = 0;

      byte var10000;
      label79: {
         while (var15 < var3) {
            var10000 = 0;
            if (var8 == 0) {
               break label79;
            }

            int var17 = 0;

            while (true) {
               if (var17 < var4) {
                  try {
                     var11[var15][var17] = this.zk2[var1 + var15][var2 + var17];
                     var17++;
                     if (var8 == 0) {
                        break;
                     }

                     if (var8 != 0) {
                        continue;
                     }
                  } catch (vam var13) {
                     throw a(var13);
                  }
               }

               var15++;
               break;
            }

            if (var8 == 0) {
               break;
            }
         }

         var10000 = 0;
      }

      var15 = var10000;

      while (var15 < var3) {
         int var18 = 0;

         label55: {
            while (var18 < var4) {
               try {
                  var7.zk2[var5 + var15][var6 + var18] = var11[var15][var18];
                  var18++;
                  if (var8 == 0) {
                     break label55;
                  }

                  if (var8 == 0) {
                     break;
                  }
               } catch (vam var12) {
                  throw a(var12);
               }
            }

            var15++;
         }

         if (var8 == 0) {
            break;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void is9(int var1, int var2) {
      int var3 = OpaquePredicate.c();
      double[][] var4 = new double[var1][var2];

      int var7;
      label98: {
         int var10000;
         label109: {
            label102: {
               try {
                  var10000 = this.dir;
                  if (var3 != 0) {
                     break label109;
                  }

                  if (this.dir >= var1) {
                     break label102;
                  }
               } catch (vam var15) {
                  throw a(var15);
               }

               var7 = this.dir;

               try {
                  if (var3 == 0) {
                     break label98;
                  }
               } catch (vam var14) {
                  boolean var10001 = false;
                  throw a(var14);
               }
            }

            try {
               var10000 = var1;
            } catch (vam var13) {
               boolean var19 = false;
               throw a(var13);
            }
         }

         var7 = var10000;
      }

      int var8;
      label80: {
         int var17;
         label110: {
            label103: {
               try {
                  var17 = this.bg8;
                  if (var3 != 0) {
                     break label110;
                  }

                  if (this.bg8 >= var2) {
                     break label103;
                  }
               } catch (vam var12) {
                  throw a(var12);
               }

               var8 = this.bg8;

               try {
                  if (var3 == 0) {
                     break label80;
                  }
               } catch (vam var11) {
                  boolean var20 = false;
                  throw a(var11);
               }
            }

            try {
               var17 = var2;
            } catch (vam var10) {
               boolean var21 = false;
               throw a(var10);
            }
         }

         var8 = var17;
      }

      int var5 = 0;

      while (var5 < var7) {
         int var6 = 0;

         while (true) {
            if (var6 < var8) {
               try {
                  var4[var5][var6] = this.zk2[var5][var6];
                  var6++;
                  if (var3 != 0) {
                     break;
                  }

                  if (var3 == 0) {
                     continue;
                  }
               } catch (vam var9) {
                  throw a(var9);
               }
            }

            var5++;
            break;
         }

         if (var3 != 0) {
            break;
         }
      }

      this.dir = var1;
      this.bg8 = var2;
      this.zk2 = var4;
   }

   public final void cfq(double[] var1) {
      int var2 = OpaquePredicate.b();
      int var3 = 0;

      while (var3 < this.dir) {
         int var4 = 0;

         while (true) {
            if (var4 < this.bg8) {
               try {
                  this.zk2[var3][var4] = var1[this.bg8 * var3 + var4];
                  var4++;
                  if (var2 == 0) {
                     break;
                  }

                  if (var2 != 0) {
                     continue;
                  }
               } catch (vam var5) {
                  throw a(var5);
               }
            }

            var3++;
            break;
         }

         if (var2 == 0) {
            break;
         }
      }
   }

   public final void dbu(nvj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 043
      // 009: getfield yb6.bg8 I
      // 00c: bipush 3
      // 00d: if_icmplt 031
      // 010: goto 017
      // 013: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield yb6.dir I
      // 01b: iload 2
      // 01c: ifeq 0c8
      // 01f: goto 026
      // 022: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush 3
      // 027: if_icmpge 052
      // 02a: goto 031
      // 02d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 0
      // 032: bipush 3
      // 033: putfield yb6.bg8 I
      // 036: aload 0
      // 037: bipush 3
      // 038: putfield yb6.dir I
      // 03b: aload 0
      // 03c: goto 043
      // 03f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: aload 0
      // 044: getfield yb6.dir I
      // 047: aload 0
      // 048: getfield yb6.bg8 I
      // 04b: multianewarray 42 2
      // 04f: putfield yb6.zk2 [[D
      // 052: aload 0
      // 053: getfield yb6.zk2 [[D
      // 056: bipush 0
      // 057: aaload
      // 058: bipush 0
      // 059: aload 1
      // 05a: getfield nvj.i2i F
      // 05d: f2d
      // 05e: dastore
      // 05f: aload 0
      // 060: getfield yb6.zk2 [[D
      // 063: bipush 0
      // 064: aaload
      // 065: bipush 1
      // 066: aload 1
      // 067: getfield nvj.k12 F
      // 06a: f2d
      // 06b: dastore
      // 06c: aload 0
      // 06d: getfield yb6.zk2 [[D
      // 070: bipush 0
      // 071: aaload
      // 072: bipush 2
      // 073: aload 1
      // 074: getfield nvj.xu6 F
      // 077: f2d
      // 078: dastore
      // 079: aload 0
      // 07a: getfield yb6.zk2 [[D
      // 07d: bipush 1
      // 07e: aaload
      // 07f: bipush 0
      // 080: aload 1
      // 081: getfield nvj._id F
      // 084: f2d
      // 085: dastore
      // 086: aload 0
      // 087: getfield yb6.zk2 [[D
      // 08a: bipush 1
      // 08b: aaload
      // 08c: bipush 1
      // 08d: aload 1
      // 08e: getfield nvj.aoj F
      // 091: f2d
      // 092: dastore
      // 093: aload 0
      // 094: getfield yb6.zk2 [[D
      // 097: bipush 1
      // 098: aaload
      // 099: bipush 2
      // 09a: aload 1
      // 09b: getfield nvj.zk_ F
      // 09e: f2d
      // 09f: dastore
      // 0a0: aload 0
      // 0a1: getfield yb6.zk2 [[D
      // 0a4: bipush 2
      // 0a5: aaload
      // 0a6: bipush 0
      // 0a7: aload 1
      // 0a8: getfield nvj.aqg F
      // 0ab: f2d
      // 0ac: dastore
      // 0ad: aload 0
      // 0ae: getfield yb6.zk2 [[D
      // 0b1: bipush 2
      // 0b2: aaload
      // 0b3: bipush 1
      // 0b4: aload 1
      // 0b5: getfield nvj.wdt F
      // 0b8: f2d
      // 0b9: dastore
      // 0ba: aload 0
      // 0bb: getfield yb6.zk2 [[D
      // 0be: bipush 2
      // 0bf: aaload
      // 0c0: bipush 2
      // 0c1: aload 1
      // 0c2: getfield nvj.jr8 F
      // 0c5: f2d
      // 0c6: dastore
      // 0c7: bipush 3
      // 0c8: istore 3
      // 0c9: iload 3
      // 0ca: aload 0
      // 0cb: getfield yb6.dir I
      // 0ce: if_icmpge 100
      // 0d1: bipush 3
      // 0d2: istore 4
      // 0d4: iload 4
      // 0d6: aload 0
      // 0d7: getfield yb6.bg8 I
      // 0da: if_icmpge 0f9
      // 0dd: aload 0
      // 0de: getfield yb6.zk2 [[D
      // 0e1: iload 3
      // 0e2: aaload
      // 0e3: iload 4
      // 0e5: dconst_0
      // 0e6: dastore
      // 0e7: iinc 4 1
      // 0ea: iload 2
      // 0eb: ifeq 0fc
      // 0ee: iload 2
      // 0ef: ifne 0d4
      // 0f2: goto 0f9
      // 0f5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f8: athrow
      // 0f9: iinc 3 1
      // 0fc: iload 2
      // 0fd: ifne 0c9
      // 100: return
   }

   public final void dyf(iww param1) {
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
      // 05: iload 2
      // 06: ifeq 48
      // 09: getfield yb6.dir I
      // 0c: bipush 3
      // 0d: if_icmplt 31
      // 10: goto 17
      // 13: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: aload 0
      // 18: getfield yb6.bg8 I
      // 1b: iload 2
      // 1c: ifeq b9
      // 1f: goto 26
      // 22: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: bipush 3
      // 27: if_icmpge 4c
      // 2a: goto 31
      // 2d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: bipush 3
      // 33: bipush 3
      // 34: multianewarray 42 2
      // 38: putfield yb6.zk2 [[D
      // 3b: aload 0
      // 3c: bipush 3
      // 3d: putfield yb6.dir I
      // 40: aload 0
      // 41: goto 48
      // 44: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: bipush 3
      // 49: putfield yb6.bg8 I
      // 4c: aload 0
      // 4d: getfield yb6.zk2 [[D
      // 50: bipush 0
      // 51: aaload
      // 52: bipush 0
      // 53: aload 1
      // 54: getfield iww.lxb D
      // 57: dastore
      // 58: aload 0
      // 59: getfield yb6.zk2 [[D
      // 5c: bipush 0
      // 5d: aaload
      // 5e: bipush 1
      // 5f: aload 1
      // 60: getfield iww.y3c D
      // 63: dastore
      // 64: aload 0
      // 65: getfield yb6.zk2 [[D
      // 68: bipush 0
      // 69: aaload
      // 6a: bipush 2
      // 6b: aload 1
      // 6c: getfield iww.bhd D
      // 6f: dastore
      // 70: aload 0
      // 71: getfield yb6.zk2 [[D
      // 74: bipush 1
      // 75: aaload
      // 76: bipush 0
      // 77: aload 1
      // 78: getfield iww.get D
      // 7b: dastore
      // 7c: aload 0
      // 7d: getfield yb6.zk2 [[D
      // 80: bipush 1
      // 81: aaload
      // 82: bipush 1
      // 83: aload 1
      // 84: getfield iww.pwn D
      // 87: dastore
      // 88: aload 0
      // 89: getfield yb6.zk2 [[D
      // 8c: bipush 1
      // 8d: aaload
      // 8e: bipush 2
      // 8f: aload 1
      // 90: getfield iww.c84 D
      // 93: dastore
      // 94: aload 0
      // 95: getfield yb6.zk2 [[D
      // 98: bipush 2
      // 99: aaload
      // 9a: bipush 0
      // 9b: aload 1
      // 9c: getfield iww.y7q D
      // 9f: dastore
      // a0: aload 0
      // a1: getfield yb6.zk2 [[D
      // a4: bipush 2
      // a5: aaload
      // a6: bipush 1
      // a7: aload 1
      // a8: getfield iww._o7 D
      // ab: dastore
      // ac: aload 0
      // ad: getfield yb6.zk2 [[D
      // b0: bipush 2
      // b1: aaload
      // b2: bipush 2
      // b3: aload 1
      // b4: getfield iww.ffq D
      // b7: dastore
      // b8: bipush 3
      // b9: istore 3
      // ba: iload 3
      // bb: aload 0
      // bc: getfield yb6.dir I
      // bf: if_icmpge f1
      // c2: bipush 3
      // c3: istore 4
      // c5: iload 4
      // c7: aload 0
      // c8: getfield yb6.bg8 I
      // cb: if_icmpge ea
      // ce: aload 0
      // cf: getfield yb6.zk2 [[D
      // d2: iload 3
      // d3: aaload
      // d4: iload 4
      // d6: dconst_0
      // d7: dastore
      // d8: iinc 4 1
      // db: iload 2
      // dc: ifeq ed
      // df: iload 2
      // e0: ifne c5
      // e3: goto ea
      // e6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e9: athrow
      // ea: iinc 3 1
      // ed: iload 2
      // ee: ifne ba
      // f1: return
   }

   public final void rqj(krg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifeq 048
      // 009: getfield yb6.dir I
      // 00c: bipush 4
      // 00d: if_icmplt 031
      // 010: goto 017
      // 013: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield yb6.bg8 I
      // 01b: iload 2
      // 01c: ifeq 11d
      // 01f: goto 026
      // 022: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush 4
      // 027: if_icmpge 04c
      // 02a: goto 031
      // 02d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 0
      // 032: bipush 4
      // 033: bipush 4
      // 034: multianewarray 42 2
      // 038: putfield yb6.zk2 [[D
      // 03b: aload 0
      // 03c: bipush 4
      // 03d: putfield yb6.dir I
      // 040: aload 0
      // 041: goto 048
      // 044: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: bipush 4
      // 049: putfield yb6.bg8 I
      // 04c: aload 0
      // 04d: getfield yb6.zk2 [[D
      // 050: bipush 0
      // 051: aaload
      // 052: bipush 0
      // 053: aload 1
      // 054: getfield krg.j8s F
      // 057: f2d
      // 058: dastore
      // 059: aload 0
      // 05a: getfield yb6.zk2 [[D
      // 05d: bipush 0
      // 05e: aaload
      // 05f: bipush 1
      // 060: aload 1
      // 061: getfield krg.f28 F
      // 064: f2d
      // 065: dastore
      // 066: aload 0
      // 067: getfield yb6.zk2 [[D
      // 06a: bipush 0
      // 06b: aaload
      // 06c: bipush 2
      // 06d: aload 1
      // 06e: getfield krg.vwt F
      // 071: f2d
      // 072: dastore
      // 073: aload 0
      // 074: getfield yb6.zk2 [[D
      // 077: bipush 0
      // 078: aaload
      // 079: bipush 3
      // 07a: aload 1
      // 07b: getfield krg.ygn F
      // 07e: f2d
      // 07f: dastore
      // 080: aload 0
      // 081: getfield yb6.zk2 [[D
      // 084: bipush 1
      // 085: aaload
      // 086: bipush 0
      // 087: aload 1
      // 088: getfield krg.fno F
      // 08b: f2d
      // 08c: dastore
      // 08d: aload 0
      // 08e: getfield yb6.zk2 [[D
      // 091: bipush 1
      // 092: aaload
      // 093: bipush 1
      // 094: aload 1
      // 095: getfield krg.rqb F
      // 098: f2d
      // 099: dastore
      // 09a: aload 0
      // 09b: getfield yb6.zk2 [[D
      // 09e: bipush 1
      // 09f: aaload
      // 0a0: bipush 2
      // 0a1: aload 1
      // 0a2: getfield krg.sjv F
      // 0a5: f2d
      // 0a6: dastore
      // 0a7: aload 0
      // 0a8: getfield yb6.zk2 [[D
      // 0ab: bipush 1
      // 0ac: aaload
      // 0ad: bipush 3
      // 0ae: aload 1
      // 0af: getfield krg.ttd F
      // 0b2: f2d
      // 0b3: dastore
      // 0b4: aload 0
      // 0b5: getfield yb6.zk2 [[D
      // 0b8: bipush 2
      // 0b9: aaload
      // 0ba: bipush 0
      // 0bb: aload 1
      // 0bc: getfield krg.zcz F
      // 0bf: f2d
      // 0c0: dastore
      // 0c1: aload 0
      // 0c2: getfield yb6.zk2 [[D
      // 0c5: bipush 2
      // 0c6: aaload
      // 0c7: bipush 1
      // 0c8: aload 1
      // 0c9: getfield krg.w4_ F
      // 0cc: f2d
      // 0cd: dastore
      // 0ce: aload 0
      // 0cf: getfield yb6.zk2 [[D
      // 0d2: bipush 2
      // 0d3: aaload
      // 0d4: bipush 2
      // 0d5: aload 1
      // 0d6: getfield krg.fmx F
      // 0d9: f2d
      // 0da: dastore
      // 0db: aload 0
      // 0dc: getfield yb6.zk2 [[D
      // 0df: bipush 2
      // 0e0: aaload
      // 0e1: bipush 3
      // 0e2: aload 1
      // 0e3: getfield krg.f46 F
      // 0e6: f2d
      // 0e7: dastore
      // 0e8: aload 0
      // 0e9: getfield yb6.zk2 [[D
      // 0ec: bipush 3
      // 0ed: aaload
      // 0ee: bipush 0
      // 0ef: aload 1
      // 0f0: getfield krg.g7m F
      // 0f3: f2d
      // 0f4: dastore
      // 0f5: aload 0
      // 0f6: getfield yb6.zk2 [[D
      // 0f9: bipush 3
      // 0fa: aaload
      // 0fb: bipush 1
      // 0fc: aload 1
      // 0fd: getfield krg.i5l F
      // 100: f2d
      // 101: dastore
      // 102: aload 0
      // 103: getfield yb6.zk2 [[D
      // 106: bipush 3
      // 107: aaload
      // 108: bipush 2
      // 109: aload 1
      // 10a: getfield krg.sk9 F
      // 10d: f2d
      // 10e: dastore
      // 10f: aload 0
      // 110: getfield yb6.zk2 [[D
      // 113: bipush 3
      // 114: aaload
      // 115: bipush 3
      // 116: aload 1
      // 117: getfield krg._40 F
      // 11a: f2d
      // 11b: dastore
      // 11c: bipush 4
      // 11d: istore 3
      // 11e: iload 3
      // 11f: aload 0
      // 120: getfield yb6.dir I
      // 123: if_icmpge 155
      // 126: bipush 4
      // 127: istore 4
      // 129: iload 4
      // 12b: aload 0
      // 12c: getfield yb6.bg8 I
      // 12f: if_icmpge 14e
      // 132: aload 0
      // 133: getfield yb6.zk2 [[D
      // 136: iload 3
      // 137: aaload
      // 138: iload 4
      // 13a: dconst_0
      // 13b: dastore
      // 13c: iinc 4 1
      // 13f: iload 2
      // 140: ifeq 151
      // 143: iload 2
      // 144: ifne 129
      // 147: goto 14e
      // 14a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: iinc 3 1
      // 151: iload 2
      // 152: ifne 11e
      // 155: return
   }

   public final void u2k(onPlayerUpdate param1) {
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
      // 006: ifne 048
      // 009: getfield yb6.dir I
      // 00c: bipush 4
      // 00d: if_icmplt 031
      // 010: goto 017
      // 013: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield yb6.bg8 I
      // 01b: iload 2
      // 01c: ifne 10d
      // 01f: goto 026
      // 022: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush 4
      // 027: if_icmpge 04c
      // 02a: goto 031
      // 02d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 0
      // 032: bipush 4
      // 033: bipush 4
      // 034: multianewarray 42 2
      // 038: putfield yb6.zk2 [[D
      // 03b: aload 0
      // 03c: bipush 4
      // 03d: putfield yb6.dir I
      // 040: aload 0
      // 041: goto 048
      // 044: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: bipush 4
      // 049: putfield yb6.bg8 I
      // 04c: aload 0
      // 04d: getfield yb6.zk2 [[D
      // 050: bipush 0
      // 051: aaload
      // 052: bipush 0
      // 053: aload 1
      // 054: getfield onPlayerUpdate.jf3 D
      // 057: dastore
      // 058: aload 0
      // 059: getfield yb6.zk2 [[D
      // 05c: bipush 0
      // 05d: aaload
      // 05e: bipush 1
      // 05f: aload 1
      // 060: getfield onPlayerUpdate.o1a D
      // 063: dastore
      // 064: aload 0
      // 065: getfield yb6.zk2 [[D
      // 068: bipush 0
      // 069: aaload
      // 06a: bipush 2
      // 06b: aload 1
      // 06c: getfield onPlayerUpdate.j_n D
      // 06f: dastore
      // 070: aload 0
      // 071: getfield yb6.zk2 [[D
      // 074: bipush 0
      // 075: aaload
      // 076: bipush 3
      // 077: aload 1
      // 078: getfield onPlayerUpdate.uwn D
      // 07b: dastore
      // 07c: aload 0
      // 07d: getfield yb6.zk2 [[D
      // 080: bipush 1
      // 081: aaload
      // 082: bipush 0
      // 083: aload 1
      // 084: getfield onPlayerUpdate.sgz D
      // 087: dastore
      // 088: aload 0
      // 089: getfield yb6.zk2 [[D
      // 08c: bipush 1
      // 08d: aaload
      // 08e: bipush 1
      // 08f: aload 1
      // 090: getfield onPlayerUpdate._6_ D
      // 093: dastore
      // 094: aload 0
      // 095: getfield yb6.zk2 [[D
      // 098: bipush 1
      // 099: aaload
      // 09a: bipush 2
      // 09b: aload 1
      // 09c: getfield onPlayerUpdate.m10 D
      // 09f: dastore
      // 0a0: aload 0
      // 0a1: getfield yb6.zk2 [[D
      // 0a4: bipush 1
      // 0a5: aaload
      // 0a6: bipush 3
      // 0a7: aload 1
      // 0a8: getfield onPlayerUpdate.g_y D
      // 0ab: dastore
      // 0ac: aload 0
      // 0ad: getfield yb6.zk2 [[D
      // 0b0: bipush 2
      // 0b1: aaload
      // 0b2: bipush 0
      // 0b3: aload 1
      // 0b4: getfield onPlayerUpdate.ji8 D
      // 0b7: dastore
      // 0b8: aload 0
      // 0b9: getfield yb6.zk2 [[D
      // 0bc: bipush 2
      // 0bd: aaload
      // 0be: bipush 1
      // 0bf: aload 1
      // 0c0: getfield onPlayerUpdate.nqj D
      // 0c3: dastore
      // 0c4: aload 0
      // 0c5: getfield yb6.zk2 [[D
      // 0c8: bipush 2
      // 0c9: aaload
      // 0ca: bipush 2
      // 0cb: aload 1
      // 0cc: getfield onPlayerUpdate.o_8 D
      // 0cf: dastore
      // 0d0: aload 0
      // 0d1: getfield yb6.zk2 [[D
      // 0d4: bipush 2
      // 0d5: aaload
      // 0d6: bipush 3
      // 0d7: aload 1
      // 0d8: getfield onPlayerUpdate.na1 D
      // 0db: dastore
      // 0dc: aload 0
      // 0dd: getfield yb6.zk2 [[D
      // 0e0: bipush 3
      // 0e1: aaload
      // 0e2: bipush 0
      // 0e3: aload 1
      // 0e4: getfield onPlayerUpdate.ye8 D
      // 0e7: dastore
      // 0e8: aload 0
      // 0e9: getfield yb6.zk2 [[D
      // 0ec: bipush 3
      // 0ed: aaload
      // 0ee: bipush 1
      // 0ef: aload 1
      // 0f0: getfield onPlayerUpdate.h_8 D
      // 0f3: dastore
      // 0f4: aload 0
      // 0f5: getfield yb6.zk2 [[D
      // 0f8: bipush 3
      // 0f9: aaload
      // 0fa: bipush 2
      // 0fb: aload 1
      // 0fc: getfield onPlayerUpdate.twh D
      // 0ff: dastore
      // 100: aload 0
      // 101: getfield yb6.zk2 [[D
      // 104: bipush 3
      // 105: aaload
      // 106: bipush 3
      // 107: aload 1
      // 108: getfield onPlayerUpdate.f36 D
      // 10b: dastore
      // 10c: bipush 4
      // 10d: istore 3
      // 10e: iload 3
      // 10f: aload 0
      // 110: getfield yb6.dir I
      // 113: if_icmpge 145
      // 116: bipush 4
      // 117: istore 4
      // 119: iload 4
      // 11b: aload 0
      // 11c: getfield yb6.bg8 I
      // 11f: if_icmpge 13e
      // 122: aload 0
      // 123: getfield yb6.zk2 [[D
      // 126: iload 3
      // 127: aaload
      // 128: iload 4
      // 12a: dconst_0
      // 12b: dastore
      // 12c: iinc 4 1
      // 12f: iload 2
      // 130: ifne 141
      // 133: iload 2
      // 134: ifeq 119
      // 137: goto 13e
      // 13a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: iinc 3 1
      // 141: iload 2
      // 142: ifeq 10e
      // 145: return
   }

   public final void phz(yb6 param1) {
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
      // 05: iload 2
      // 06: ifeq 4f
      // 09: getfield yb6.dir I
      // 0c: aload 1
      // 0d: getfield yb6.dir I
      // 10: if_icmplt 37
      // 13: goto 1a
      // 16: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield yb6.bg8 I
      // 1e: iload 2
      // 1f: ifeq 5f
      // 22: goto 29
      // 25: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 1
      // 2a: getfield yb6.bg8 I
      // 2d: if_icmpge 5e
      // 30: goto 37
      // 33: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: getfield yb6.dir I
      // 3c: putfield yb6.dir I
      // 3f: aload 0
      // 40: aload 1
      // 41: getfield yb6.bg8 I
      // 44: putfield yb6.bg8 I
      // 47: aload 0
      // 48: goto 4f
      // 4b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield yb6.dir I
      // 53: aload 0
      // 54: getfield yb6.bg8 I
      // 57: multianewarray 42 2
      // 5b: putfield yb6.zk2 [[D
      // 5e: bipush 0
      // 5f: istore 3
      // 60: iload 3
      // 61: aload 0
      // 62: getfield yb6.dir I
      // 65: aload 1
      // 66: getfield yb6.dir I
      // 69: invokestatic java/lang/Math.min (II)I
      // 6c: if_icmpge b1
      // 6f: bipush 0
      // 70: iload 2
      // 71: ifeq b5
      // 74: istore 4
      // 76: iload 4
      // 78: aload 0
      // 79: getfield yb6.bg8 I
      // 7c: aload 1
      // 7d: getfield yb6.bg8 I
      // 80: invokestatic java/lang/Math.min (II)I
      // 83: if_icmpge aa
      // 86: aload 0
      // 87: getfield yb6.zk2 [[D
      // 8a: iload 3
      // 8b: aaload
      // 8c: iload 4
      // 8e: aload 1
      // 8f: getfield yb6.zk2 [[D
      // 92: iload 3
      // 93: aaload
      // 94: iload 4
      // 96: daload
      // 97: dastore
      // 98: iinc 4 1
      // 9b: iload 2
      // 9c: ifeq ad
      // 9f: iload 2
      // a0: ifne 76
      // a3: goto aa
      // a6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a9: athrow
      // aa: iinc 3 1
      // ad: iload 2
      // ae: ifne 60
      // b1: aload 1
      // b2: getfield yb6.dir I
      // b5: istore 3
      // b6: iload 3
      // b7: aload 0
      // b8: getfield yb6.dir I
      // bb: if_icmpge f0
      // be: aload 1
      // bf: getfield yb6.bg8 I
      // c2: istore 4
      // c4: iload 4
      // c6: aload 0
      // c7: getfield yb6.bg8 I
      // ca: if_icmpge e9
      // cd: aload 0
      // ce: getfield yb6.zk2 [[D
      // d1: iload 3
      // d2: aaload
      // d3: iload 4
      // d5: dconst_0
      // d6: dastore
      // d7: iinc 4 1
      // da: iload 2
      // db: ifeq ec
      // de: iload 2
      // df: ifne c4
      // e2: goto e9
      // e5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e8: athrow
      // e9: iinc 3 1
      // ec: iload 2
      // ed: ifne b6
      // f0: return
   }

   public final int bmr() {
      return this.dir;
   }

   public final int ijc() {
      return this.bg8;
   }

   public final double das(int var1, int var2) {
      return this.zk2[var1][var2];
   }

   public final void rds(int var1, int var2, double var3) {
      this.zk2[var1][var2] = var3;
   }

   public final void n6l(int var1, double[] var2) {
      int var3 = OpaquePredicate.b();
      int var4 = 0;

      while (var4 < this.bg8) {
         var2[var4] = this.zk2[var1][var4];
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   public final void a69(int param1, hxi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual hxi.ud2 ()I
      // 08: iload 3
      // 09: ifeq 2a
      // 0c: aload 0
      // 0d: getfield yb6.bg8 I
      // 10: if_icmpge 29
      // 13: goto 1a
      // 16: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 2
      // 1b: aload 0
      // 1c: getfield yb6.bg8 I
      // 1f: invokevirtual hxi.c6b (I)V
      // 22: goto 29
      // 25: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: bipush 0
      // 2a: istore 4
      // 2c: iload 4
      // 2e: aload 0
      // 2f: getfield yb6.bg8 I
      // 32: if_icmpge 4c
      // 35: aload 2
      // 36: getfield hxi.ch5 [D
      // 39: iload 4
      // 3b: aload 0
      // 3c: getfield yb6.zk2 [[D
      // 3f: iload 1
      // 40: aaload
      // 41: iload 4
      // 43: daload
      // 44: dastore
      // 45: iinc 4 1
      // 48: iload 3
      // 49: ifne 2c
      // 4c: return
   }

   public final void ytt(int var1, double[] var2) {
      int var3 = OpaquePredicate.b();
      int var4 = 0;

      while (var4 < this.dir) {
         var2[var4] = this.zk2[var4][var1];
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   public final void wdo(int param1, hxi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual hxi.ud2 ()I
      // 08: iload 3
      // 09: ifeq 2a
      // 0c: aload 0
      // 0d: getfield yb6.dir I
      // 10: if_icmpge 29
      // 13: goto 1a
      // 16: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 2
      // 1b: aload 0
      // 1c: getfield yb6.dir I
      // 1f: invokevirtual hxi.c6b (I)V
      // 22: goto 29
      // 25: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: bipush 0
      // 2a: istore 4
      // 2c: iload 4
      // 2e: aload 0
      // 2f: getfield yb6.dir I
      // 32: if_icmpge 4c
      // 35: aload 2
      // 36: getfield hxi.ch5 [D
      // 39: iload 4
      // 3b: aload 0
      // 3c: getfield yb6.zk2 [[D
      // 3f: iload 4
      // 41: aaload
      // 42: iload 1
      // 43: daload
      // 44: dastore
      // 45: iinc 4 1
      // 48: iload 3
      // 49: ifne 2c
      // 4c: return
   }

   public final void x32(iww param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield yb6.dir I
      // 008: iload 2
      // 009: ifeq 040
      // 00c: bipush 3
      // 00d: if_icmplt 031
      // 010: goto 017
      // 013: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield yb6.bg8 I
      // 01b: iload 2
      // 01c: ifeq 040
      // 01f: goto 026
      // 022: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush 3
      // 027: if_icmpge 1e0
      // 02a: goto 031
      // 02d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: invokevirtual iww.jbq ()V
      // 035: aload 0
      // 036: getfield yb6.bg8 I
      // 039: goto 040
      // 03c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: iload 2
      // 041: ifeq 059
      // 044: ifle 253
      // 047: goto 04e
      // 04a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield yb6.dir I
      // 052: goto 059
      // 055: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: iload 2
      // 05a: ifeq 0ca
      // 05d: ifle 0c6
      // 060: goto 067
      // 063: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 1
      // 068: aload 0
      // 069: getfield yb6.zk2 [[D
      // 06c: bipush 0
      // 06d: aaload
      // 06e: bipush 0
      // 06f: daload
      // 070: putfield iww.lxb D
      // 073: aload 0
      // 074: getfield yb6.dir I
      // 077: bipush 1
      // 078: iload 2
      // 079: ifeq 0d6
      // 07c: goto 083
      // 07f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: if_icmple 0c6
      // 086: goto 08d
      // 089: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: aload 1
      // 08e: aload 0
      // 08f: getfield yb6.zk2 [[D
      // 092: bipush 1
      // 093: aaload
      // 094: bipush 0
      // 095: daload
      // 096: putfield iww.get D
      // 099: aload 0
      // 09a: getfield yb6.dir I
      // 09d: bipush 2
      // 09e: iload 2
      // 09f: ifeq 0d6
      // 0a2: goto 0a9
      // 0a5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: if_icmple 0c6
      // 0ac: goto 0b3
      // 0af: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: aload 0
      // 0b5: getfield yb6.zk2 [[D
      // 0b8: bipush 2
      // 0b9: aaload
      // 0ba: bipush 0
      // 0bb: daload
      // 0bc: putfield iww.y7q D
      // 0bf: goto 0c6
      // 0c2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield yb6.bg8 I
      // 0ca: iload 2
      // 0cb: ifeq 0e4
      // 0ce: bipush 1
      // 0cf: goto 0d6
      // 0d2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d5: athrow
      // 0d6: if_icmple 253
      // 0d9: aload 0
      // 0da: getfield yb6.dir I
      // 0dd: goto 0e4
      // 0e0: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e3: athrow
      // 0e4: iload 2
      // 0e5: ifeq 155
      // 0e8: ifle 151
      // 0eb: goto 0f2
      // 0ee: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f1: athrow
      // 0f2: aload 1
      // 0f3: aload 0
      // 0f4: getfield yb6.zk2 [[D
      // 0f7: bipush 0
      // 0f8: aaload
      // 0f9: bipush 1
      // 0fa: daload
      // 0fb: putfield iww.y3c D
      // 0fe: aload 0
      // 0ff: getfield yb6.dir I
      // 102: bipush 1
      // 103: iload 2
      // 104: ifeq 161
      // 107: goto 10e
      // 10a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: if_icmple 151
      // 111: goto 118
      // 114: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: aload 1
      // 119: aload 0
      // 11a: getfield yb6.zk2 [[D
      // 11d: bipush 1
      // 11e: aaload
      // 11f: bipush 1
      // 120: daload
      // 121: putfield iww.pwn D
      // 124: aload 0
      // 125: getfield yb6.dir I
      // 128: bipush 2
      // 129: iload 2
      // 12a: ifeq 161
      // 12d: goto 134
      // 130: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: if_icmple 151
      // 137: goto 13e
      // 13a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 1
      // 13f: aload 0
      // 140: getfield yb6.zk2 [[D
      // 143: bipush 2
      // 144: aaload
      // 145: bipush 1
      // 146: daload
      // 147: putfield iww._o7 D
      // 14a: goto 151
      // 14d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 150: athrow
      // 151: aload 0
      // 152: getfield yb6.bg8 I
      // 155: iload 2
      // 156: ifeq 16f
      // 159: bipush 2
      // 15a: goto 161
      // 15d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 160: athrow
      // 161: if_icmple 253
      // 164: aload 0
      // 165: getfield yb6.dir I
      // 168: goto 16f
      // 16b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: iload 2
      // 170: ifeq 194
      // 173: ifle 253
      // 176: goto 17d
      // 179: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: aload 1
      // 17e: aload 0
      // 17f: getfield yb6.zk2 [[D
      // 182: bipush 0
      // 183: aaload
      // 184: bipush 2
      // 185: daload
      // 186: putfield iww.bhd D
      // 189: aload 0
      // 18a: getfield yb6.dir I
      // 18d: goto 194
      // 190: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 193: athrow
      // 194: bipush 1
      // 195: iload 2
      // 196: ifeq 1c6
      // 199: if_icmple 253
      // 19c: goto 1a3
      // 19f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a2: athrow
      // 1a3: aload 1
      // 1a4: aload 0
      // 1a5: getfield yb6.zk2 [[D
      // 1a8: bipush 1
      // 1a9: aaload
      // 1aa: bipush 2
      // 1ab: daload
      // 1ac: putfield iww.c84 D
      // 1af: iload 2
      // 1b0: ifeq 1dc
      // 1b3: goto 1ba
      // 1b6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: aload 0
      // 1bb: getfield yb6.dir I
      // 1be: bipush 2
      // 1bf: goto 1c6
      // 1c2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c5: athrow
      // 1c6: if_icmple 253
      // 1c9: aload 1
      // 1ca: aload 0
      // 1cb: getfield yb6.zk2 [[D
      // 1ce: bipush 2
      // 1cf: aaload
      // 1d0: bipush 2
      // 1d1: daload
      // 1d2: putfield iww.ffq D
      // 1d5: goto 1dc
      // 1d8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1db: athrow
      // 1dc: iload 2
      // 1dd: ifne 253
      // 1e0: aload 1
      // 1e1: aload 0
      // 1e2: getfield yb6.zk2 [[D
      // 1e5: bipush 0
      // 1e6: aaload
      // 1e7: bipush 0
      // 1e8: daload
      // 1e9: putfield iww.lxb D
      // 1ec: aload 1
      // 1ed: aload 0
      // 1ee: getfield yb6.zk2 [[D
      // 1f1: bipush 0
      // 1f2: aaload
      // 1f3: bipush 1
      // 1f4: daload
      // 1f5: putfield iww.y3c D
      // 1f8: aload 1
      // 1f9: aload 0
      // 1fa: getfield yb6.zk2 [[D
      // 1fd: bipush 0
      // 1fe: aaload
      // 1ff: bipush 2
      // 200: daload
      // 201: putfield iww.bhd D
      // 204: aload 1
      // 205: aload 0
      // 206: getfield yb6.zk2 [[D
      // 209: bipush 1
      // 20a: aaload
      // 20b: bipush 0
      // 20c: daload
      // 20d: putfield iww.get D
      // 210: aload 1
      // 211: aload 0
      // 212: getfield yb6.zk2 [[D
      // 215: bipush 1
      // 216: aaload
      // 217: bipush 1
      // 218: daload
      // 219: putfield iww.pwn D
      // 21c: aload 1
      // 21d: aload 0
      // 21e: getfield yb6.zk2 [[D
      // 221: bipush 1
      // 222: aaload
      // 223: bipush 2
      // 224: daload
      // 225: putfield iww.c84 D
      // 228: aload 1
      // 229: aload 0
      // 22a: getfield yb6.zk2 [[D
      // 22d: bipush 2
      // 22e: aaload
      // 22f: bipush 0
      // 230: daload
      // 231: putfield iww.y7q D
      // 234: aload 1
      // 235: aload 0
      // 236: getfield yb6.zk2 [[D
      // 239: bipush 2
      // 23a: aaload
      // 23b: bipush 1
      // 23c: daload
      // 23d: putfield iww._o7 D
      // 240: aload 1
      // 241: aload 0
      // 242: getfield yb6.zk2 [[D
      // 245: bipush 2
      // 246: aaload
      // 247: bipush 2
      // 248: daload
      // 249: putfield iww.ffq D
      // 24c: goto 253
      // 24f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: return
   }

   public final void gz_(nvj param1) {
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
      // 005: getfield yb6.dir I
      // 008: iload 2
      // 009: ifne 040
      // 00c: bipush 3
      // 00d: if_icmplt 031
      // 010: goto 017
      // 013: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield yb6.bg8 I
      // 01b: iload 2
      // 01c: ifne 040
      // 01f: goto 026
      // 022: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush 3
      // 027: if_icmpge 1e9
      // 02a: goto 031
      // 02d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: invokevirtual nvj.qkz ()V
      // 035: aload 0
      // 036: getfield yb6.bg8 I
      // 039: goto 040
      // 03c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: iload 2
      // 041: ifne 059
      // 044: ifle 265
      // 047: goto 04e
      // 04a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield yb6.dir I
      // 052: goto 059
      // 055: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: iload 2
      // 05a: ifne 0cd
      // 05d: ifle 0c9
      // 060: goto 067
      // 063: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 1
      // 068: aload 0
      // 069: getfield yb6.zk2 [[D
      // 06c: bipush 0
      // 06d: aaload
      // 06e: bipush 0
      // 06f: daload
      // 070: d2f
      // 071: putfield nvj.i2i F
      // 074: aload 0
      // 075: getfield yb6.dir I
      // 078: bipush 1
      // 079: iload 2
      // 07a: ifne 0d9
      // 07d: goto 084
      // 080: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: if_icmple 0c9
      // 087: goto 08e
      // 08a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 1
      // 08f: aload 0
      // 090: getfield yb6.zk2 [[D
      // 093: bipush 1
      // 094: aaload
      // 095: bipush 0
      // 096: daload
      // 097: d2f
      // 098: putfield nvj._id F
      // 09b: aload 0
      // 09c: getfield yb6.dir I
      // 09f: bipush 2
      // 0a0: iload 2
      // 0a1: ifne 0d9
      // 0a4: goto 0ab
      // 0a7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: if_icmple 0c9
      // 0ae: goto 0b5
      // 0b1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: aload 1
      // 0b6: aload 0
      // 0b7: getfield yb6.zk2 [[D
      // 0ba: bipush 2
      // 0bb: aaload
      // 0bc: bipush 0
      // 0bd: daload
      // 0be: d2f
      // 0bf: putfield nvj.aqg F
      // 0c2: goto 0c9
      // 0c5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: getfield yb6.bg8 I
      // 0cd: iload 2
      // 0ce: ifne 0e7
      // 0d1: bipush 1
      // 0d2: goto 0d9
      // 0d5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: if_icmple 265
      // 0dc: aload 0
      // 0dd: getfield yb6.dir I
      // 0e0: goto 0e7
      // 0e3: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e6: athrow
      // 0e7: iload 2
      // 0e8: ifne 15b
      // 0eb: ifle 157
      // 0ee: goto 0f5
      // 0f1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f4: athrow
      // 0f5: aload 1
      // 0f6: aload 0
      // 0f7: getfield yb6.zk2 [[D
      // 0fa: bipush 0
      // 0fb: aaload
      // 0fc: bipush 1
      // 0fd: daload
      // 0fe: d2f
      // 0ff: putfield nvj.k12 F
      // 102: aload 0
      // 103: getfield yb6.dir I
      // 106: bipush 1
      // 107: iload 2
      // 108: ifne 167
      // 10b: goto 112
      // 10e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: if_icmple 157
      // 115: goto 11c
      // 118: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: aload 1
      // 11d: aload 0
      // 11e: getfield yb6.zk2 [[D
      // 121: bipush 1
      // 122: aaload
      // 123: bipush 1
      // 124: daload
      // 125: d2f
      // 126: putfield nvj.aoj F
      // 129: aload 0
      // 12a: getfield yb6.dir I
      // 12d: bipush 2
      // 12e: iload 2
      // 12f: ifne 167
      // 132: goto 139
      // 135: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: if_icmple 157
      // 13c: goto 143
      // 13f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: aload 1
      // 144: aload 0
      // 145: getfield yb6.zk2 [[D
      // 148: bipush 2
      // 149: aaload
      // 14a: bipush 1
      // 14b: daload
      // 14c: d2f
      // 14d: putfield nvj.wdt F
      // 150: goto 157
      // 153: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: aload 0
      // 158: getfield yb6.bg8 I
      // 15b: iload 2
      // 15c: ifne 175
      // 15f: bipush 2
      // 160: goto 167
      // 163: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: if_icmple 265
      // 16a: aload 0
      // 16b: getfield yb6.dir I
      // 16e: goto 175
      // 171: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 174: athrow
      // 175: iload 2
      // 176: ifne 19b
      // 179: ifle 265
      // 17c: goto 183
      // 17f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182: athrow
      // 183: aload 1
      // 184: aload 0
      // 185: getfield yb6.zk2 [[D
      // 188: bipush 0
      // 189: aaload
      // 18a: bipush 2
      // 18b: daload
      // 18c: d2f
      // 18d: putfield nvj.xu6 F
      // 190: aload 0
      // 191: getfield yb6.dir I
      // 194: goto 19b
      // 197: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19a: athrow
      // 19b: bipush 1
      // 19c: iload 2
      // 19d: ifne 1ce
      // 1a0: if_icmple 265
      // 1a3: goto 1aa
      // 1a6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: aload 1
      // 1ab: aload 0
      // 1ac: getfield yb6.zk2 [[D
      // 1af: bipush 1
      // 1b0: aaload
      // 1b1: bipush 2
      // 1b2: daload
      // 1b3: d2f
      // 1b4: putfield nvj.zk_ F
      // 1b7: iload 2
      // 1b8: ifne 1e5
      // 1bb: goto 1c2
      // 1be: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: getfield yb6.dir I
      // 1c6: bipush 2
      // 1c7: goto 1ce
      // 1ca: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: if_icmple 265
      // 1d1: aload 1
      // 1d2: aload 0
      // 1d3: getfield yb6.zk2 [[D
      // 1d6: bipush 2
      // 1d7: aaload
      // 1d8: bipush 2
      // 1d9: daload
      // 1da: d2f
      // 1db: putfield nvj.jr8 F
      // 1de: goto 1e5
      // 1e1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e4: athrow
      // 1e5: iload 2
      // 1e6: ifeq 265
      // 1e9: aload 1
      // 1ea: aload 0
      // 1eb: getfield yb6.zk2 [[D
      // 1ee: bipush 0
      // 1ef: aaload
      // 1f0: bipush 0
      // 1f1: daload
      // 1f2: d2f
      // 1f3: putfield nvj.i2i F
      // 1f6: aload 1
      // 1f7: aload 0
      // 1f8: getfield yb6.zk2 [[D
      // 1fb: bipush 0
      // 1fc: aaload
      // 1fd: bipush 1
      // 1fe: daload
      // 1ff: d2f
      // 200: putfield nvj.k12 F
      // 203: aload 1
      // 204: aload 0
      // 205: getfield yb6.zk2 [[D
      // 208: bipush 0
      // 209: aaload
      // 20a: bipush 2
      // 20b: daload
      // 20c: d2f
      // 20d: putfield nvj.xu6 F
      // 210: aload 1
      // 211: aload 0
      // 212: getfield yb6.zk2 [[D
      // 215: bipush 1
      // 216: aaload
      // 217: bipush 0
      // 218: daload
      // 219: d2f
      // 21a: putfield nvj._id F
      // 21d: aload 1
      // 21e: aload 0
      // 21f: getfield yb6.zk2 [[D
      // 222: bipush 1
      // 223: aaload
      // 224: bipush 1
      // 225: daload
      // 226: d2f
      // 227: putfield nvj.aoj F
      // 22a: aload 1
      // 22b: aload 0
      // 22c: getfield yb6.zk2 [[D
      // 22f: bipush 1
      // 230: aaload
      // 231: bipush 2
      // 232: daload
      // 233: d2f
      // 234: putfield nvj.zk_ F
      // 237: aload 1
      // 238: aload 0
      // 239: getfield yb6.zk2 [[D
      // 23c: bipush 2
      // 23d: aaload
      // 23e: bipush 0
      // 23f: daload
      // 240: d2f
      // 241: putfield nvj.aqg F
      // 244: aload 1
      // 245: aload 0
      // 246: getfield yb6.zk2 [[D
      // 249: bipush 2
      // 24a: aaload
      // 24b: bipush 1
      // 24c: daload
      // 24d: d2f
      // 24e: putfield nvj.wdt F
      // 251: aload 1
      // 252: aload 0
      // 253: getfield yb6.zk2 [[D
      // 256: bipush 2
      // 257: aaload
      // 258: bipush 2
      // 259: daload
      // 25a: d2f
      // 25b: putfield nvj.jr8 F
      // 25e: goto 265
      // 261: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 264: athrow
      // 265: return
   }

   public final void xds(onPlayerUpdate param1) {
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
      // 005: getfield yb6.dir I
      // 008: iload 2
      // 009: ifne 040
      // 00c: bipush 4
      // 00d: if_icmplt 031
      // 010: goto 017
      // 013: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield yb6.bg8 I
      // 01b: iload 2
      // 01c: ifne 040
      // 01f: goto 026
      // 022: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush 4
      // 027: if_icmpge 303
      // 02a: goto 031
      // 02d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: invokevirtual onPlayerUpdate.b3c ()V
      // 035: aload 0
      // 036: getfield yb6.bg8 I
      // 039: goto 040
      // 03c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: iload 2
      // 041: ifne 059
      // 044: ifle 3ca
      // 047: goto 04e
      // 04a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield yb6.dir I
      // 052: goto 059
      // 055: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: iload 2
      // 05a: ifne 0f0
      // 05d: ifle 0ec
      // 060: goto 067
      // 063: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 1
      // 068: aload 0
      // 069: getfield yb6.zk2 [[D
      // 06c: bipush 0
      // 06d: aaload
      // 06e: bipush 0
      // 06f: daload
      // 070: putfield onPlayerUpdate.jf3 D
      // 073: aload 0
      // 074: getfield yb6.dir I
      // 077: bipush 1
      // 078: iload 2
      // 079: ifne 0fc
      // 07c: goto 083
      // 07f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 082: athrow
      // 083: if_icmple 0ec
      // 086: goto 08d
      // 089: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: aload 1
      // 08e: aload 0
      // 08f: getfield yb6.zk2 [[D
      // 092: bipush 1
      // 093: aaload
      // 094: bipush 0
      // 095: daload
      // 096: putfield onPlayerUpdate.sgz D
      // 099: aload 0
      // 09a: getfield yb6.dir I
      // 09d: bipush 2
      // 09e: iload 2
      // 09f: ifne 0fc
      // 0a2: goto 0a9
      // 0a5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: if_icmple 0ec
      // 0ac: goto 0b3
      // 0af: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: aload 1
      // 0b4: aload 0
      // 0b5: getfield yb6.zk2 [[D
      // 0b8: bipush 2
      // 0b9: aaload
      // 0ba: bipush 0
      // 0bb: daload
      // 0bc: putfield onPlayerUpdate.ji8 D
      // 0bf: aload 0
      // 0c0: getfield yb6.dir I
      // 0c3: bipush 3
      // 0c4: iload 2
      // 0c5: ifne 0fc
      // 0c8: goto 0cf
      // 0cb: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ce: athrow
      // 0cf: if_icmple 0ec
      // 0d2: goto 0d9
      // 0d5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: aload 1
      // 0da: aload 0
      // 0db: getfield yb6.zk2 [[D
      // 0de: bipush 3
      // 0df: aaload
      // 0e0: bipush 0
      // 0e1: daload
      // 0e2: putfield onPlayerUpdate.ye8 D
      // 0e5: goto 0ec
      // 0e8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: getfield yb6.bg8 I
      // 0f0: iload 2
      // 0f1: ifne 10a
      // 0f4: bipush 1
      // 0f5: goto 0fc
      // 0f8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: if_icmple 3ca
      // 0ff: aload 0
      // 100: getfield yb6.dir I
      // 103: goto 10a
      // 106: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 109: athrow
      // 10a: iload 2
      // 10b: ifne 1a1
      // 10e: ifle 19d
      // 111: goto 118
      // 114: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: aload 1
      // 119: aload 0
      // 11a: getfield yb6.zk2 [[D
      // 11d: bipush 0
      // 11e: aaload
      // 11f: bipush 1
      // 120: daload
      // 121: putfield onPlayerUpdate.o1a D
      // 124: aload 0
      // 125: getfield yb6.dir I
      // 128: bipush 1
      // 129: iload 2
      // 12a: ifne 1ad
      // 12d: goto 134
      // 130: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: if_icmple 19d
      // 137: goto 13e
      // 13a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13d: athrow
      // 13e: aload 1
      // 13f: aload 0
      // 140: getfield yb6.zk2 [[D
      // 143: bipush 1
      // 144: aaload
      // 145: bipush 1
      // 146: daload
      // 147: putfield onPlayerUpdate._6_ D
      // 14a: aload 0
      // 14b: getfield yb6.dir I
      // 14e: bipush 2
      // 14f: iload 2
      // 150: ifne 1ad
      // 153: goto 15a
      // 156: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 159: athrow
      // 15a: if_icmple 19d
      // 15d: goto 164
      // 160: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: aload 1
      // 165: aload 0
      // 166: getfield yb6.zk2 [[D
      // 169: bipush 2
      // 16a: aaload
      // 16b: bipush 1
      // 16c: daload
      // 16d: putfield onPlayerUpdate.nqj D
      // 170: aload 0
      // 171: getfield yb6.dir I
      // 174: bipush 3
      // 175: iload 2
      // 176: ifne 1ad
      // 179: goto 180
      // 17c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: if_icmple 19d
      // 183: goto 18a
      // 186: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 189: athrow
      // 18a: aload 1
      // 18b: aload 0
      // 18c: getfield yb6.zk2 [[D
      // 18f: bipush 3
      // 190: aaload
      // 191: bipush 1
      // 192: daload
      // 193: putfield onPlayerUpdate.h_8 D
      // 196: goto 19d
      // 199: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: aload 0
      // 19e: getfield yb6.bg8 I
      // 1a1: iload 2
      // 1a2: ifne 1bb
      // 1a5: bipush 2
      // 1a6: goto 1ad
      // 1a9: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ac: athrow
      // 1ad: if_icmple 3ca
      // 1b0: aload 0
      // 1b1: getfield yb6.dir I
      // 1b4: goto 1bb
      // 1b7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ba: athrow
      // 1bb: iload 2
      // 1bc: ifne 252
      // 1bf: ifle 24e
      // 1c2: goto 1c9
      // 1c5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c8: athrow
      // 1c9: aload 1
      // 1ca: aload 0
      // 1cb: getfield yb6.zk2 [[D
      // 1ce: bipush 0
      // 1cf: aaload
      // 1d0: bipush 2
      // 1d1: daload
      // 1d2: putfield onPlayerUpdate.j_n D
      // 1d5: aload 0
      // 1d6: getfield yb6.dir I
      // 1d9: bipush 1
      // 1da: iload 2
      // 1db: ifne 25e
      // 1de: goto 1e5
      // 1e1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e4: athrow
      // 1e5: if_icmple 24e
      // 1e8: goto 1ef
      // 1eb: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ee: athrow
      // 1ef: aload 1
      // 1f0: aload 0
      // 1f1: getfield yb6.zk2 [[D
      // 1f4: bipush 1
      // 1f5: aaload
      // 1f6: bipush 2
      // 1f7: daload
      // 1f8: putfield onPlayerUpdate.m10 D
      // 1fb: aload 0
      // 1fc: getfield yb6.dir I
      // 1ff: bipush 2
      // 200: iload 2
      // 201: ifne 25e
      // 204: goto 20b
      // 207: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20a: athrow
      // 20b: if_icmple 24e
      // 20e: goto 215
      // 211: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 214: athrow
      // 215: aload 1
      // 216: aload 0
      // 217: getfield yb6.zk2 [[D
      // 21a: bipush 2
      // 21b: aaload
      // 21c: bipush 2
      // 21d: daload
      // 21e: putfield onPlayerUpdate.o_8 D
      // 221: aload 0
      // 222: getfield yb6.dir I
      // 225: bipush 3
      // 226: iload 2
      // 227: ifne 25e
      // 22a: goto 231
      // 22d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: if_icmple 24e
      // 234: goto 23b
      // 237: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23a: athrow
      // 23b: aload 1
      // 23c: aload 0
      // 23d: getfield yb6.zk2 [[D
      // 240: bipush 3
      // 241: aaload
      // 242: bipush 2
      // 243: daload
      // 244: putfield onPlayerUpdate.twh D
      // 247: goto 24e
      // 24a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: aload 0
      // 24f: getfield yb6.bg8 I
      // 252: iload 2
      // 253: ifne 26c
      // 256: bipush 3
      // 257: goto 25e
      // 25a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25d: athrow
      // 25e: if_icmple 3ca
      // 261: aload 0
      // 262: getfield yb6.dir I
      // 265: goto 26c
      // 268: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 26b: athrow
      // 26c: iload 2
      // 26d: ifne 291
      // 270: ifle 3ca
      // 273: goto 27a
      // 276: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 279: athrow
      // 27a: aload 1
      // 27b: aload 0
      // 27c: getfield yb6.zk2 [[D
      // 27f: bipush 0
      // 280: aaload
      // 281: bipush 3
      // 282: daload
      // 283: putfield onPlayerUpdate.uwn D
      // 286: aload 0
      // 287: getfield yb6.dir I
      // 28a: goto 291
      // 28d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 290: athrow
      // 291: bipush 1
      // 292: iload 2
      // 293: ifne 2b8
      // 296: if_icmple 3ca
      // 299: goto 2a0
      // 29c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29f: athrow
      // 2a0: aload 1
      // 2a1: aload 0
      // 2a2: getfield yb6.zk2 [[D
      // 2a5: bipush 1
      // 2a6: aaload
      // 2a7: bipush 3
      // 2a8: daload
      // 2a9: putfield onPlayerUpdate.g_y D
      // 2ac: aload 0
      // 2ad: getfield yb6.dir I
      // 2b0: bipush 2
      // 2b1: goto 2b8
      // 2b4: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b7: athrow
      // 2b8: iload 2
      // 2b9: ifne 2e9
      // 2bc: if_icmple 3ca
      // 2bf: goto 2c6
      // 2c2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c5: athrow
      // 2c6: aload 1
      // 2c7: aload 0
      // 2c8: getfield yb6.zk2 [[D
      // 2cb: bipush 2
      // 2cc: aaload
      // 2cd: bipush 3
      // 2ce: daload
      // 2cf: putfield onPlayerUpdate.na1 D
      // 2d2: iload 2
      // 2d3: ifne 2ff
      // 2d6: goto 2dd
      // 2d9: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2dc: athrow
      // 2dd: aload 0
      // 2de: getfield yb6.dir I
      // 2e1: bipush 3
      // 2e2: goto 2e9
      // 2e5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e8: athrow
      // 2e9: if_icmple 3ca
      // 2ec: aload 1
      // 2ed: aload 0
      // 2ee: getfield yb6.zk2 [[D
      // 2f1: bipush 3
      // 2f2: aaload
      // 2f3: bipush 3
      // 2f4: daload
      // 2f5: putfield onPlayerUpdate.f36 D
      // 2f8: goto 2ff
      // 2fb: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fe: athrow
      // 2ff: iload 2
      // 300: ifeq 3ca
      // 303: aload 1
      // 304: aload 0
      // 305: getfield yb6.zk2 [[D
      // 308: bipush 0
      // 309: aaload
      // 30a: bipush 0
      // 30b: daload
      // 30c: putfield onPlayerUpdate.jf3 D
      // 30f: aload 1
      // 310: aload 0
      // 311: getfield yb6.zk2 [[D
      // 314: bipush 0
      // 315: aaload
      // 316: bipush 1
      // 317: daload
      // 318: putfield onPlayerUpdate.o1a D
      // 31b: aload 1
      // 31c: aload 0
      // 31d: getfield yb6.zk2 [[D
      // 320: bipush 0
      // 321: aaload
      // 322: bipush 2
      // 323: daload
      // 324: putfield onPlayerUpdate.j_n D
      // 327: aload 1
      // 328: aload 0
      // 329: getfield yb6.zk2 [[D
      // 32c: bipush 0
      // 32d: aaload
      // 32e: bipush 3
      // 32f: daload
      // 330: putfield onPlayerUpdate.uwn D
      // 333: aload 1
      // 334: aload 0
      // 335: getfield yb6.zk2 [[D
      // 338: bipush 1
      // 339: aaload
      // 33a: bipush 0
      // 33b: daload
      // 33c: putfield onPlayerUpdate.sgz D
      // 33f: aload 1
      // 340: aload 0
      // 341: getfield yb6.zk2 [[D
      // 344: bipush 1
      // 345: aaload
      // 346: bipush 1
      // 347: daload
      // 348: putfield onPlayerUpdate._6_ D
      // 34b: aload 1
      // 34c: aload 0
      // 34d: getfield yb6.zk2 [[D
      // 350: bipush 1
      // 351: aaload
      // 352: bipush 2
      // 353: daload
      // 354: putfield onPlayerUpdate.m10 D
      // 357: aload 1
      // 358: aload 0
      // 359: getfield yb6.zk2 [[D
      // 35c: bipush 1
      // 35d: aaload
      // 35e: bipush 3
      // 35f: daload
      // 360: putfield onPlayerUpdate.g_y D
      // 363: aload 1
      // 364: aload 0
      // 365: getfield yb6.zk2 [[D
      // 368: bipush 2
      // 369: aaload
      // 36a: bipush 0
      // 36b: daload
      // 36c: putfield onPlayerUpdate.ji8 D
      // 36f: aload 1
      // 370: aload 0
      // 371: getfield yb6.zk2 [[D
      // 374: bipush 2
      // 375: aaload
      // 376: bipush 1
      // 377: daload
      // 378: putfield onPlayerUpdate.nqj D
      // 37b: aload 1
      // 37c: aload 0
      // 37d: getfield yb6.zk2 [[D
      // 380: bipush 2
      // 381: aaload
      // 382: bipush 2
      // 383: daload
      // 384: putfield onPlayerUpdate.o_8 D
      // 387: aload 1
      // 388: aload 0
      // 389: getfield yb6.zk2 [[D
      // 38c: bipush 2
      // 38d: aaload
      // 38e: bipush 3
      // 38f: daload
      // 390: putfield onPlayerUpdate.na1 D
      // 393: aload 1
      // 394: aload 0
      // 395: getfield yb6.zk2 [[D
      // 398: bipush 3
      // 399: aaload
      // 39a: bipush 0
      // 39b: daload
      // 39c: putfield onPlayerUpdate.ye8 D
      // 39f: aload 1
      // 3a0: aload 0
      // 3a1: getfield yb6.zk2 [[D
      // 3a4: bipush 3
      // 3a5: aaload
      // 3a6: bipush 1
      // 3a7: daload
      // 3a8: putfield onPlayerUpdate.h_8 D
      // 3ab: aload 1
      // 3ac: aload 0
      // 3ad: getfield yb6.zk2 [[D
      // 3b0: bipush 3
      // 3b1: aaload
      // 3b2: bipush 2
      // 3b3: daload
      // 3b4: putfield onPlayerUpdate.twh D
      // 3b7: aload 1
      // 3b8: aload 0
      // 3b9: getfield yb6.zk2 [[D
      // 3bc: bipush 3
      // 3bd: aaload
      // 3be: bipush 3
      // 3bf: daload
      // 3c0: putfield onPlayerUpdate.f36 D
      // 3c3: goto 3ca
      // 3c6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c9: athrow
      // 3ca: return
   }

   public final void xvl(krg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield yb6.dir I
      // 008: iload 2
      // 009: ifeq 040
      // 00c: bipush 4
      // 00d: if_icmplt 031
      // 010: goto 017
      // 013: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 016: athrow
      // 017: aload 0
      // 018: getfield yb6.bg8 I
      // 01b: iload 2
      // 01c: ifeq 040
      // 01f: goto 026
      // 022: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: bipush 4
      // 027: if_icmpge 313
      // 02a: goto 031
      // 02d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 030: athrow
      // 031: aload 1
      // 032: invokevirtual krg.f13 ()V
      // 035: aload 0
      // 036: getfield yb6.bg8 I
      // 039: goto 040
      // 03c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03f: athrow
      // 040: iload 2
      // 041: ifeq 059
      // 044: ifle 3ea
      // 047: goto 04e
      // 04a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield yb6.dir I
      // 052: goto 059
      // 055: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 058: athrow
      // 059: iload 2
      // 05a: ifeq 0f4
      // 05d: ifle 0f0
      // 060: goto 067
      // 063: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 066: athrow
      // 067: aload 1
      // 068: aload 0
      // 069: getfield yb6.zk2 [[D
      // 06c: bipush 0
      // 06d: aaload
      // 06e: bipush 0
      // 06f: daload
      // 070: d2f
      // 071: putfield krg.j8s F
      // 074: aload 0
      // 075: getfield yb6.dir I
      // 078: bipush 1
      // 079: iload 2
      // 07a: ifeq 100
      // 07d: goto 084
      // 080: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: if_icmple 0f0
      // 087: goto 08e
      // 08a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 1
      // 08f: aload 0
      // 090: getfield yb6.zk2 [[D
      // 093: bipush 1
      // 094: aaload
      // 095: bipush 0
      // 096: daload
      // 097: d2f
      // 098: putfield krg.fno F
      // 09b: aload 0
      // 09c: getfield yb6.dir I
      // 09f: bipush 2
      // 0a0: iload 2
      // 0a1: ifeq 100
      // 0a4: goto 0ab
      // 0a7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0aa: athrow
      // 0ab: if_icmple 0f0
      // 0ae: goto 0b5
      // 0b1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b4: athrow
      // 0b5: aload 1
      // 0b6: aload 0
      // 0b7: getfield yb6.zk2 [[D
      // 0ba: bipush 2
      // 0bb: aaload
      // 0bc: bipush 0
      // 0bd: daload
      // 0be: d2f
      // 0bf: putfield krg.zcz F
      // 0c2: aload 0
      // 0c3: getfield yb6.dir I
      // 0c6: bipush 3
      // 0c7: iload 2
      // 0c8: ifeq 100
      // 0cb: goto 0d2
      // 0ce: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d1: athrow
      // 0d2: if_icmple 0f0
      // 0d5: goto 0dc
      // 0d8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: aload 0
      // 0de: getfield yb6.zk2 [[D
      // 0e1: bipush 3
      // 0e2: aaload
      // 0e3: bipush 0
      // 0e4: daload
      // 0e5: d2f
      // 0e6: putfield krg.g7m F
      // 0e9: goto 0f0
      // 0ec: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: getfield yb6.bg8 I
      // 0f4: iload 2
      // 0f5: ifeq 10e
      // 0f8: bipush 1
      // 0f9: goto 100
      // 0fc: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: if_icmple 3ea
      // 103: aload 0
      // 104: getfield yb6.dir I
      // 107: goto 10e
      // 10a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: iload 2
      // 10f: ifeq 1a9
      // 112: ifle 1a5
      // 115: goto 11c
      // 118: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11b: athrow
      // 11c: aload 1
      // 11d: aload 0
      // 11e: getfield yb6.zk2 [[D
      // 121: bipush 0
      // 122: aaload
      // 123: bipush 1
      // 124: daload
      // 125: d2f
      // 126: putfield krg.f28 F
      // 129: aload 0
      // 12a: getfield yb6.dir I
      // 12d: bipush 1
      // 12e: iload 2
      // 12f: ifeq 1b5
      // 132: goto 139
      // 135: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: if_icmple 1a5
      // 13c: goto 143
      // 13f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: aload 1
      // 144: aload 0
      // 145: getfield yb6.zk2 [[D
      // 148: bipush 1
      // 149: aaload
      // 14a: bipush 1
      // 14b: daload
      // 14c: d2f
      // 14d: putfield krg.rqb F
      // 150: aload 0
      // 151: getfield yb6.dir I
      // 154: bipush 2
      // 155: iload 2
      // 156: ifeq 1b5
      // 159: goto 160
      // 15c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: if_icmple 1a5
      // 163: goto 16a
      // 166: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aload 1
      // 16b: aload 0
      // 16c: getfield yb6.zk2 [[D
      // 16f: bipush 2
      // 170: aaload
      // 171: bipush 1
      // 172: daload
      // 173: d2f
      // 174: putfield krg.w4_ F
      // 177: aload 0
      // 178: getfield yb6.dir I
      // 17b: bipush 3
      // 17c: iload 2
      // 17d: ifeq 1b5
      // 180: goto 187
      // 183: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 186: athrow
      // 187: if_icmple 1a5
      // 18a: goto 191
      // 18d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 190: athrow
      // 191: aload 1
      // 192: aload 0
      // 193: getfield yb6.zk2 [[D
      // 196: bipush 3
      // 197: aaload
      // 198: bipush 1
      // 199: daload
      // 19a: d2f
      // 19b: putfield krg.i5l F
      // 19e: goto 1a5
      // 1a1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: getfield yb6.bg8 I
      // 1a9: iload 2
      // 1aa: ifeq 1c3
      // 1ad: bipush 2
      // 1ae: goto 1b5
      // 1b1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b4: athrow
      // 1b5: if_icmple 3ea
      // 1b8: aload 0
      // 1b9: getfield yb6.dir I
      // 1bc: goto 1c3
      // 1bf: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c2: athrow
      // 1c3: iload 2
      // 1c4: ifeq 25e
      // 1c7: ifle 25a
      // 1ca: goto 1d1
      // 1cd: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d0: athrow
      // 1d1: aload 1
      // 1d2: aload 0
      // 1d3: getfield yb6.zk2 [[D
      // 1d6: bipush 0
      // 1d7: aaload
      // 1d8: bipush 2
      // 1d9: daload
      // 1da: d2f
      // 1db: putfield krg.vwt F
      // 1de: aload 0
      // 1df: getfield yb6.dir I
      // 1e2: bipush 1
      // 1e3: iload 2
      // 1e4: ifeq 26a
      // 1e7: goto 1ee
      // 1ea: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: if_icmple 25a
      // 1f1: goto 1f8
      // 1f4: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f7: athrow
      // 1f8: aload 1
      // 1f9: aload 0
      // 1fa: getfield yb6.zk2 [[D
      // 1fd: bipush 1
      // 1fe: aaload
      // 1ff: bipush 2
      // 200: daload
      // 201: d2f
      // 202: putfield krg.sjv F
      // 205: aload 0
      // 206: getfield yb6.dir I
      // 209: bipush 2
      // 20a: iload 2
      // 20b: ifeq 26a
      // 20e: goto 215
      // 211: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 214: athrow
      // 215: if_icmple 25a
      // 218: goto 21f
      // 21b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21e: athrow
      // 21f: aload 1
      // 220: aload 0
      // 221: getfield yb6.zk2 [[D
      // 224: bipush 2
      // 225: aaload
      // 226: bipush 2
      // 227: daload
      // 228: d2f
      // 229: putfield krg.fmx F
      // 22c: aload 0
      // 22d: getfield yb6.dir I
      // 230: bipush 3
      // 231: iload 2
      // 232: ifeq 26a
      // 235: goto 23c
      // 238: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: if_icmple 25a
      // 23f: goto 246
      // 242: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: aload 1
      // 247: aload 0
      // 248: getfield yb6.zk2 [[D
      // 24b: bipush 3
      // 24c: aaload
      // 24d: bipush 2
      // 24e: daload
      // 24f: d2f
      // 250: putfield krg.sk9 F
      // 253: goto 25a
      // 256: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 259: athrow
      // 25a: aload 0
      // 25b: getfield yb6.bg8 I
      // 25e: iload 2
      // 25f: ifeq 278
      // 262: bipush 3
      // 263: goto 26a
      // 266: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 269: athrow
      // 26a: if_icmple 3ea
      // 26d: aload 0
      // 26e: getfield yb6.dir I
      // 271: goto 278
      // 274: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 277: athrow
      // 278: iload 2
      // 279: ifeq 29e
      // 27c: ifle 3ea
      // 27f: goto 286
      // 282: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: aload 1
      // 287: aload 0
      // 288: getfield yb6.zk2 [[D
      // 28b: bipush 0
      // 28c: aaload
      // 28d: bipush 3
      // 28e: daload
      // 28f: d2f
      // 290: putfield krg.ygn F
      // 293: aload 0
      // 294: getfield yb6.dir I
      // 297: goto 29e
      // 29a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29d: athrow
      // 29e: bipush 1
      // 29f: iload 2
      // 2a0: ifeq 2c6
      // 2a3: if_icmple 3ea
      // 2a6: goto 2ad
      // 2a9: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: aload 1
      // 2ae: aload 0
      // 2af: getfield yb6.zk2 [[D
      // 2b2: bipush 1
      // 2b3: aaload
      // 2b4: bipush 3
      // 2b5: daload
      // 2b6: d2f
      // 2b7: putfield krg.ttd F
      // 2ba: aload 0
      // 2bb: getfield yb6.dir I
      // 2be: bipush 2
      // 2bf: goto 2c6
      // 2c2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c5: athrow
      // 2c6: iload 2
      // 2c7: ifeq 2f8
      // 2ca: if_icmple 3ea
      // 2cd: goto 2d4
      // 2d0: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d3: athrow
      // 2d4: aload 1
      // 2d5: aload 0
      // 2d6: getfield yb6.zk2 [[D
      // 2d9: bipush 2
      // 2da: aaload
      // 2db: bipush 3
      // 2dc: daload
      // 2dd: d2f
      // 2de: putfield krg.f46 F
      // 2e1: iload 2
      // 2e2: ifeq 30f
      // 2e5: goto 2ec
      // 2e8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2eb: athrow
      // 2ec: aload 0
      // 2ed: getfield yb6.dir I
      // 2f0: bipush 3
      // 2f1: goto 2f8
      // 2f4: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f7: athrow
      // 2f8: if_icmple 3ea
      // 2fb: aload 1
      // 2fc: aload 0
      // 2fd: getfield yb6.zk2 [[D
      // 300: bipush 3
      // 301: aaload
      // 302: bipush 3
      // 303: daload
      // 304: d2f
      // 305: putfield krg._40 F
      // 308: goto 30f
      // 30b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30e: athrow
      // 30f: iload 2
      // 310: ifne 3ea
      // 313: aload 1
      // 314: aload 0
      // 315: getfield yb6.zk2 [[D
      // 318: bipush 0
      // 319: aaload
      // 31a: bipush 0
      // 31b: daload
      // 31c: d2f
      // 31d: putfield krg.j8s F
      // 320: aload 1
      // 321: aload 0
      // 322: getfield yb6.zk2 [[D
      // 325: bipush 0
      // 326: aaload
      // 327: bipush 1
      // 328: daload
      // 329: d2f
      // 32a: putfield krg.f28 F
      // 32d: aload 1
      // 32e: aload 0
      // 32f: getfield yb6.zk2 [[D
      // 332: bipush 0
      // 333: aaload
      // 334: bipush 2
      // 335: daload
      // 336: d2f
      // 337: putfield krg.vwt F
      // 33a: aload 1
      // 33b: aload 0
      // 33c: getfield yb6.zk2 [[D
      // 33f: bipush 0
      // 340: aaload
      // 341: bipush 3
      // 342: daload
      // 343: d2f
      // 344: putfield krg.ygn F
      // 347: aload 1
      // 348: aload 0
      // 349: getfield yb6.zk2 [[D
      // 34c: bipush 1
      // 34d: aaload
      // 34e: bipush 0
      // 34f: daload
      // 350: d2f
      // 351: putfield krg.fno F
      // 354: aload 1
      // 355: aload 0
      // 356: getfield yb6.zk2 [[D
      // 359: bipush 1
      // 35a: aaload
      // 35b: bipush 1
      // 35c: daload
      // 35d: d2f
      // 35e: putfield krg.rqb F
      // 361: aload 1
      // 362: aload 0
      // 363: getfield yb6.zk2 [[D
      // 366: bipush 1
      // 367: aaload
      // 368: bipush 2
      // 369: daload
      // 36a: d2f
      // 36b: putfield krg.sjv F
      // 36e: aload 1
      // 36f: aload 0
      // 370: getfield yb6.zk2 [[D
      // 373: bipush 1
      // 374: aaload
      // 375: bipush 3
      // 376: daload
      // 377: d2f
      // 378: putfield krg.ttd F
      // 37b: aload 1
      // 37c: aload 0
      // 37d: getfield yb6.zk2 [[D
      // 380: bipush 2
      // 381: aaload
      // 382: bipush 0
      // 383: daload
      // 384: d2f
      // 385: putfield krg.zcz F
      // 388: aload 1
      // 389: aload 0
      // 38a: getfield yb6.zk2 [[D
      // 38d: bipush 2
      // 38e: aaload
      // 38f: bipush 1
      // 390: daload
      // 391: d2f
      // 392: putfield krg.w4_ F
      // 395: aload 1
      // 396: aload 0
      // 397: getfield yb6.zk2 [[D
      // 39a: bipush 2
      // 39b: aaload
      // 39c: bipush 2
      // 39d: daload
      // 39e: d2f
      // 39f: putfield krg.fmx F
      // 3a2: aload 1
      // 3a3: aload 0
      // 3a4: getfield yb6.zk2 [[D
      // 3a7: bipush 2
      // 3a8: aaload
      // 3a9: bipush 3
      // 3aa: daload
      // 3ab: d2f
      // 3ac: putfield krg.f46 F
      // 3af: aload 1
      // 3b0: aload 0
      // 3b1: getfield yb6.zk2 [[D
      // 3b4: bipush 3
      // 3b5: aaload
      // 3b6: bipush 0
      // 3b7: daload
      // 3b8: d2f
      // 3b9: putfield krg.g7m F
      // 3bc: aload 1
      // 3bd: aload 0
      // 3be: getfield yb6.zk2 [[D
      // 3c1: bipush 3
      // 3c2: aaload
      // 3c3: bipush 1
      // 3c4: daload
      // 3c5: d2f
      // 3c6: putfield krg.i5l F
      // 3c9: aload 1
      // 3ca: aload 0
      // 3cb: getfield yb6.zk2 [[D
      // 3ce: bipush 3
      // 3cf: aaload
      // 3d0: bipush 2
      // 3d1: daload
      // 3d2: d2f
      // 3d3: putfield krg.sk9 F
      // 3d6: aload 1
      // 3d7: aload 0
      // 3d8: getfield yb6.zk2 [[D
      // 3db: bipush 3
      // 3dc: aaload
      // 3dd: bipush 3
      // 3de: daload
      // 3df: d2f
      // 3e0: putfield krg._40 F
      // 3e3: goto 3ea
      // 3e6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e9: athrow
      // 3ea: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void apb(yb6 var1) {
      int var2 = OpaquePredicate.c();

      int var5;
      label166: {
         int var10000;
         label179: {
            label170: {
               try {
                  var10000 = this.bg8;
                  if (var2 != 0) {
                     break label179;
                  }

                  if (this.bg8 >= var1.bg8) {
                     break label170;
                  }
               } catch (vam var15) {
                  throw a(var15);
               }

               var5 = this.bg8;

               try {
                  if (var2 == 0) {
                     break label166;
                  }
               } catch (vam var14) {
                  boolean var10001 = false;
                  throw a(var14);
               }
            }

            try {
               var10000 = var1.bg8;
            } catch (vam var13) {
               boolean var25 = false;
               throw a(var13);
            }
         }

         var5 = var10000;
      }

      int var6;
      label148: {
         int var21;
         label180: {
            label171: {
               try {
                  var21 = this.dir;
                  if (var2 != 0) {
                     break label180;
                  }

                  if (this.dir >= var1.dir) {
                     break label171;
                  }
               } catch (vam var12) {
                  throw a(var12);
               }

               var6 = this.dir;

               try {
                  if (var2 == 0) {
                     break label148;
                  }
               } catch (vam var11) {
                  boolean var26 = false;
                  throw a(var11);
               }
            }

            try {
               var21 = var1.dir;
            } catch (vam var10) {
               boolean var27 = false;
               throw a(var10);
            }
         }

         var6 = var21;
      }

      int var3 = 0;

      int var23;
      while (true) {
         if (var3 < var6) {
            var23 = 0;
            if (var2 != 0) {
               break;
            }

            int var4 = 0;

            label124: {
               while (var4 < var5) {
                  try {
                     var1.zk2[var3][var4] = this.zk2[var3][var4];
                     var4++;
                     if (var2 != 0) {
                        break label124;
                     }

                     if (var2 != 0) {
                        break;
                     }
                  } catch (vam var9) {
                     throw a(var9);
                  }
               }

               var3++;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var23 = var6;
         break;
      }

      var3 = var23;

      while (true) {
         if (var3 < var1.dir) {
            var23 = 0;
            if (var2 != 0) {
               break;
            }

            int var18 = 0;

            label103: {
               while (var18 < var1.bg8) {
                  try {
                     var1.zk2[var3][var18] = 0.0;
                     var18++;
                     if (var2 != 0) {
                        break label103;
                     }

                     if (var2 != 0) {
                        break;
                     }
                  } catch (vam var8) {
                     throw a(var8);
                  }
               }

               var3++;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var23 = var5;
         break;
      }

      int var19 = var23;

      while (var19 < var1.bg8) {
         var3 = 0;

         while (true) {
            if (var3 < var6) {
               try {
                  var1.zk2[var3][var19] = 0.0;
                  var3++;
                  if (var2 != 0) {
                     break;
                  }

                  if (var2 == 0) {
                     continue;
                  }
               } catch (vam var7) {
                  throw a(var7);
               }
            }

            var19++;
            break;
         }

         if (var2 != 0) {
            break;
         }
      }
   }

   public final void zte(int var1, double[] var2) {
      int var3 = OpaquePredicate.c();
      int var4 = 0;

      while (var4 < this.bg8) {
         this.zk2[var1][var4] = var2[var4];
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public final void sfw(int var1, hxi var2) {
      int var3 = OpaquePredicate.b();
      int var4 = 0;

      while (var4 < this.bg8) {
         this.zk2[var1][var4] = var2.ch5[var4];
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   public final void _ox(int var1, double[] var2) {
      int var3 = OpaquePredicate.c();
      int var4 = 0;

      while (var4 < this.dir) {
         this.zk2[var4][var1] = var2[var4];
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public final void y4e(int var1, hxi var2) {
      int var3 = OpaquePredicate.c();
      int var4 = 0;

      while (var4 < this.dir) {
         this.zk2[var4][var1] = var2.ch5[var4];
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public final void bne(yb6 param1, yb6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 46887554939030
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: getfield yb6.dir I
      // 011: aload 2
      // 012: getfield yb6.bg8 I
      // 015: iload 5
      // 017: ifne 033
      // 01a: if_icmpne 060
      // 01d: goto 024
      // 020: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 0
      // 025: getfield yb6.dir I
      // 028: aload 1
      // 029: getfield yb6.bg8 I
      // 02c: goto 033
      // 02f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: iload 5
      // 035: ifne 05d
      // 038: if_icmpne 060
      // 03b: goto 042
      // 03e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 0
      // 043: iload 5
      // 045: ifne 07e
      // 048: goto 04f
      // 04b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: getfield yb6.bg8 I
      // 052: aload 2
      // 053: getfield yb6.dir I
      // 056: goto 05d
      // 059: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: if_icmpeq 07d
      // 060: new vam
      // 063: dup
      // 064: sipush 9516
      // 067: ldc2_w 9221372098408332759
      // 06a: lload 3
      // 06b: lxor
      // 06c: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: nop
      // 072: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 075: invokespecial vam.<init> (Ljava/lang/String;)V
      // 078: athrow
      // 079: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: aload 1
      // 07e: iload 5
      // 080: ifne 0ae
      // 083: aload 0
      // 084: if_acmpeq 0a6
      // 087: goto 08e
      // 08a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 2
      // 08f: iload 5
      // 091: ifne 0ae
      // 094: goto 09b
      // 097: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: aload 0
      // 09c: if_acmpne 13c
      // 09f: goto 0a6
      // 0a2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: goto 0ae
      // 0aa: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: getfield yb6.dir I
      // 0b1: aload 0
      // 0b2: getfield yb6.bg8 I
      // 0b5: multianewarray 42 2
      // 0b9: astore 9
      // 0bb: bipush 0
      // 0bc: istore 6
      // 0be: iload 6
      // 0c0: aload 0
      // 0c1: getfield yb6.dir I
      // 0c4: if_icmpge 131
      // 0c7: bipush 0
      // 0c8: istore 7
      // 0ca: iload 7
      // 0cc: aload 0
      // 0cd: getfield yb6.bg8 I
      // 0d0: if_icmpge 129
      // 0d3: aload 9
      // 0d5: iload 6
      // 0d7: aaload
      // 0d8: iload 7
      // 0da: dconst_0
      // 0db: dastore
      // 0dc: bipush 0
      // 0dd: iload 5
      // 0df: ifne 0c0
      // 0e2: istore 8
      // 0e4: iload 8
      // 0e6: aload 1
      // 0e7: getfield yb6.dir I
      // 0ea: if_icmpge 121
      // 0ed: aload 9
      // 0ef: iload 6
      // 0f1: aaload
      // 0f2: iload 7
      // 0f4: dup2
      // 0f5: daload
      // 0f6: aload 1
      // 0f7: getfield yb6.zk2 [[D
      // 0fa: iload 8
      // 0fc: aaload
      // 0fd: iload 6
      // 0ff: daload
      // 100: aload 2
      // 101: getfield yb6.zk2 [[D
      // 104: iload 7
      // 106: aaload
      // 107: iload 8
      // 109: daload
      // 10a: dmul
      // 10b: dadd
      // 10c: dastore
      // 10d: iinc 8 1
      // 110: iload 5
      // 112: ifne 124
      // 115: iload 5
      // 117: ifeq 0e4
      // 11a: goto 121
      // 11d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: iinc 7 1
      // 124: iload 5
      // 126: ifeq 0ca
      // 129: iinc 6 1
      // 12c: iload 5
      // 12e: ifeq 0be
      // 131: aload 0
      // 132: aload 9
      // 134: putfield yb6.zk2 [[D
      // 137: iload 5
      // 139: ifeq 1b6
      // 13c: bipush 0
      // 13d: istore 6
      // 13f: iload 6
      // 141: aload 0
      // 142: getfield yb6.dir I
      // 145: if_icmpge 1b6
      // 148: bipush 0
      // 149: istore 7
      // 14b: iload 7
      // 14d: aload 0
      // 14e: getfield yb6.bg8 I
      // 151: if_icmpge 1ae
      // 154: aload 0
      // 155: getfield yb6.zk2 [[D
      // 158: iload 6
      // 15a: aaload
      // 15b: iload 7
      // 15d: dconst_0
      // 15e: dastore
      // 15f: bipush 0
      // 160: iload 5
      // 162: ifne 141
      // 165: istore 8
      // 167: iload 8
      // 169: aload 1
      // 16a: getfield yb6.dir I
      // 16d: if_icmpge 1a6
      // 170: aload 0
      // 171: getfield yb6.zk2 [[D
      // 174: iload 6
      // 176: aaload
      // 177: iload 7
      // 179: dup2
      // 17a: daload
      // 17b: aload 1
      // 17c: getfield yb6.zk2 [[D
      // 17f: iload 8
      // 181: aaload
      // 182: iload 6
      // 184: daload
      // 185: aload 2
      // 186: getfield yb6.zk2 [[D
      // 189: iload 7
      // 18b: aaload
      // 18c: iload 8
      // 18e: daload
      // 18f: dmul
      // 190: dadd
      // 191: dastore
      // 192: iinc 8 1
      // 195: iload 5
      // 197: ifne 1a9
      // 19a: iload 5
      // 19c: ifeq 167
      // 19f: goto 1a6
      // 1a2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: iinc 7 1
      // 1a9: iload 5
      // 1ab: ifeq 14b
      // 1ae: iinc 6 1
      // 1b1: iload 5
      // 1b3: ifeq 13f
      // 1b6: return
   }

   public final void oir(yb6 param1, yb6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 75252573072371
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: getfield yb6.bg8 I
      // 011: aload 2
      // 012: getfield yb6.bg8 I
      // 015: iload 5
      // 017: ifne 033
      // 01a: if_icmpne 060
      // 01d: goto 024
      // 020: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 0
      // 025: getfield yb6.bg8 I
      // 028: aload 2
      // 029: getfield yb6.dir I
      // 02c: goto 033
      // 02f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: iload 5
      // 035: ifne 05d
      // 038: if_icmpne 060
      // 03b: goto 042
      // 03e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 0
      // 043: iload 5
      // 045: ifne 07e
      // 048: goto 04f
      // 04b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: getfield yb6.dir I
      // 052: aload 1
      // 053: getfield yb6.dir I
      // 056: goto 05d
      // 059: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: if_icmpeq 07d
      // 060: new vam
      // 063: dup
      // 064: sipush 8827
      // 067: ldc2_w 256457161865669113
      // 06a: lload 3
      // 06b: lxor
      // 06c: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: nop
      // 072: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 075: invokespecial vam.<init> (Ljava/lang/String;)V
      // 078: athrow
      // 079: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: aload 1
      // 07e: iload 5
      // 080: ifne 0ae
      // 083: aload 0
      // 084: if_acmpeq 0a6
      // 087: goto 08e
      // 08a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 2
      // 08f: iload 5
      // 091: ifne 0ae
      // 094: goto 09b
      // 097: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: aload 0
      // 09c: if_acmpne 13c
      // 09f: goto 0a6
      // 0a2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: goto 0ae
      // 0aa: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: getfield yb6.dir I
      // 0b1: aload 0
      // 0b2: getfield yb6.bg8 I
      // 0b5: multianewarray 42 2
      // 0b9: astore 9
      // 0bb: bipush 0
      // 0bc: istore 6
      // 0be: iload 6
      // 0c0: aload 0
      // 0c1: getfield yb6.dir I
      // 0c4: if_icmpge 131
      // 0c7: bipush 0
      // 0c8: istore 7
      // 0ca: iload 7
      // 0cc: aload 0
      // 0cd: getfield yb6.bg8 I
      // 0d0: if_icmpge 129
      // 0d3: aload 9
      // 0d5: iload 6
      // 0d7: aaload
      // 0d8: iload 7
      // 0da: dconst_0
      // 0db: dastore
      // 0dc: bipush 0
      // 0dd: iload 5
      // 0df: ifne 0c0
      // 0e2: istore 8
      // 0e4: iload 8
      // 0e6: aload 1
      // 0e7: getfield yb6.bg8 I
      // 0ea: if_icmpge 121
      // 0ed: aload 9
      // 0ef: iload 6
      // 0f1: aaload
      // 0f2: iload 7
      // 0f4: dup2
      // 0f5: daload
      // 0f6: aload 1
      // 0f7: getfield yb6.zk2 [[D
      // 0fa: iload 6
      // 0fc: aaload
      // 0fd: iload 8
      // 0ff: daload
      // 100: aload 2
      // 101: getfield yb6.zk2 [[D
      // 104: iload 7
      // 106: aaload
      // 107: iload 8
      // 109: daload
      // 10a: dmul
      // 10b: dadd
      // 10c: dastore
      // 10d: iinc 8 1
      // 110: iload 5
      // 112: ifne 124
      // 115: iload 5
      // 117: ifeq 0e4
      // 11a: goto 121
      // 11d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: iinc 7 1
      // 124: iload 5
      // 126: ifeq 0ca
      // 129: iinc 6 1
      // 12c: iload 5
      // 12e: ifeq 0be
      // 131: aload 0
      // 132: aload 9
      // 134: putfield yb6.zk2 [[D
      // 137: iload 5
      // 139: ifeq 1b6
      // 13c: bipush 0
      // 13d: istore 6
      // 13f: iload 6
      // 141: aload 0
      // 142: getfield yb6.dir I
      // 145: if_icmpge 1b6
      // 148: bipush 0
      // 149: istore 7
      // 14b: iload 7
      // 14d: aload 0
      // 14e: getfield yb6.bg8 I
      // 151: if_icmpge 1ae
      // 154: aload 0
      // 155: getfield yb6.zk2 [[D
      // 158: iload 6
      // 15a: aaload
      // 15b: iload 7
      // 15d: dconst_0
      // 15e: dastore
      // 15f: bipush 0
      // 160: iload 5
      // 162: ifne 141
      // 165: istore 8
      // 167: iload 8
      // 169: aload 1
      // 16a: getfield yb6.bg8 I
      // 16d: if_icmpge 1a6
      // 170: aload 0
      // 171: getfield yb6.zk2 [[D
      // 174: iload 6
      // 176: aaload
      // 177: iload 7
      // 179: dup2
      // 17a: daload
      // 17b: aload 1
      // 17c: getfield yb6.zk2 [[D
      // 17f: iload 6
      // 181: aaload
      // 182: iload 8
      // 184: daload
      // 185: aload 2
      // 186: getfield yb6.zk2 [[D
      // 189: iload 7
      // 18b: aaload
      // 18c: iload 8
      // 18e: daload
      // 18f: dmul
      // 190: dadd
      // 191: dastore
      // 192: iinc 8 1
      // 195: iload 5
      // 197: ifne 1a9
      // 19a: iload 5
      // 19c: ifeq 167
      // 19f: goto 1a6
      // 1a2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: iinc 7 1
      // 1a9: iload 5
      // 1ab: ifeq 14b
      // 1ae: iinc 6 1
      // 1b1: iload 5
      // 1b3: ifeq 13f
      // 1b6: return
   }

   public final void wao(yb6 param1, yb6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 520364603161
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: getfield yb6.dir I
      // 011: aload 2
      // 012: getfield yb6.dir I
      // 015: iload 5
      // 017: ifeq 033
      // 01a: if_icmpne 060
      // 01d: goto 024
      // 020: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 023: athrow
      // 024: aload 0
      // 025: getfield yb6.bg8 I
      // 028: aload 2
      // 029: getfield yb6.bg8 I
      // 02c: goto 033
      // 02f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: iload 5
      // 035: ifeq 05d
      // 038: if_icmpne 060
      // 03b: goto 042
      // 03e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 0
      // 043: iload 5
      // 045: ifeq 07e
      // 048: goto 04f
      // 04b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: getfield yb6.dir I
      // 052: aload 1
      // 053: getfield yb6.bg8 I
      // 056: goto 05d
      // 059: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: if_icmpeq 07d
      // 060: new vam
      // 063: dup
      // 064: sipush 881
      // 067: ldc2_w 7709068355136017416
      // 06a: lload 3
      // 06b: lxor
      // 06c: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: nop
      // 072: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 075: invokespecial vam.<init> (Ljava/lang/String;)V
      // 078: athrow
      // 079: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07c: athrow
      // 07d: aload 1
      // 07e: iload 5
      // 080: ifeq 0ae
      // 083: aload 0
      // 084: if_acmpeq 0a6
      // 087: goto 08e
      // 08a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 2
      // 08f: iload 5
      // 091: ifeq 0ae
      // 094: goto 09b
      // 097: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09a: athrow
      // 09b: aload 0
      // 09c: if_acmpne 13c
      // 09f: goto 0a6
      // 0a2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: goto 0ae
      // 0aa: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: getfield yb6.dir I
      // 0b1: aload 0
      // 0b2: getfield yb6.bg8 I
      // 0b5: multianewarray 42 2
      // 0b9: astore 9
      // 0bb: bipush 0
      // 0bc: istore 6
      // 0be: iload 6
      // 0c0: aload 0
      // 0c1: getfield yb6.dir I
      // 0c4: if_icmpge 131
      // 0c7: bipush 0
      // 0c8: istore 7
      // 0ca: iload 7
      // 0cc: aload 0
      // 0cd: getfield yb6.bg8 I
      // 0d0: if_icmpge 129
      // 0d3: aload 9
      // 0d5: iload 6
      // 0d7: aaload
      // 0d8: iload 7
      // 0da: dconst_0
      // 0db: dastore
      // 0dc: bipush 0
      // 0dd: iload 5
      // 0df: ifeq 0c0
      // 0e2: istore 8
      // 0e4: iload 8
      // 0e6: aload 1
      // 0e7: getfield yb6.dir I
      // 0ea: if_icmpge 121
      // 0ed: aload 9
      // 0ef: iload 6
      // 0f1: aaload
      // 0f2: iload 7
      // 0f4: dup2
      // 0f5: daload
      // 0f6: aload 1
      // 0f7: getfield yb6.zk2 [[D
      // 0fa: iload 8
      // 0fc: aaload
      // 0fd: iload 6
      // 0ff: daload
      // 100: aload 2
      // 101: getfield yb6.zk2 [[D
      // 104: iload 8
      // 106: aaload
      // 107: iload 7
      // 109: daload
      // 10a: dmul
      // 10b: dadd
      // 10c: dastore
      // 10d: iinc 8 1
      // 110: iload 5
      // 112: ifeq 124
      // 115: iload 5
      // 117: ifne 0e4
      // 11a: goto 121
      // 11d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: iinc 7 1
      // 124: iload 5
      // 126: ifne 0ca
      // 129: iinc 6 1
      // 12c: iload 5
      // 12e: ifne 0be
      // 131: aload 0
      // 132: aload 9
      // 134: putfield yb6.zk2 [[D
      // 137: iload 5
      // 139: ifne 1b6
      // 13c: bipush 0
      // 13d: istore 6
      // 13f: iload 6
      // 141: aload 0
      // 142: getfield yb6.dir I
      // 145: if_icmpge 1b6
      // 148: bipush 0
      // 149: istore 7
      // 14b: iload 7
      // 14d: aload 0
      // 14e: getfield yb6.bg8 I
      // 151: if_icmpge 1ae
      // 154: aload 0
      // 155: getfield yb6.zk2 [[D
      // 158: iload 6
      // 15a: aaload
      // 15b: iload 7
      // 15d: dconst_0
      // 15e: dastore
      // 15f: bipush 0
      // 160: iload 5
      // 162: ifeq 141
      // 165: istore 8
      // 167: iload 8
      // 169: aload 1
      // 16a: getfield yb6.dir I
      // 16d: if_icmpge 1a6
      // 170: aload 0
      // 171: getfield yb6.zk2 [[D
      // 174: iload 6
      // 176: aaload
      // 177: iload 7
      // 179: dup2
      // 17a: daload
      // 17b: aload 1
      // 17c: getfield yb6.zk2 [[D
      // 17f: iload 8
      // 181: aaload
      // 182: iload 6
      // 184: daload
      // 185: aload 2
      // 186: getfield yb6.zk2 [[D
      // 189: iload 8
      // 18b: aaload
      // 18c: iload 7
      // 18e: daload
      // 18f: dmul
      // 190: dadd
      // 191: dastore
      // 192: iinc 8 1
      // 195: iload 5
      // 197: ifeq 1a9
      // 19a: iload 5
      // 19c: ifne 167
      // 19f: goto 1a6
      // 1a2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a5: athrow
      // 1a6: iinc 7 1
      // 1a9: iload 5
      // 1ab: ifne 14b
      // 1ae: iinc 6 1
      // 1b1: iload 5
      // 1b3: ifne 13f
      // 1b6: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void u75() {
      int var1 = OpaquePredicate.b();

      int var10000;
      label107: {
         label99: {
            try {
               var10000 = this.dir;
               if (var1 == 0) {
                  break label107;
               }

               if (this.dir == this.bg8) {
                  break label99;
               }
            } catch (vam var9) {
               throw a(var9);
            }

            int var2 = this.dir;
            this.dir = this.bg8;
            this.bg8 = var2;
            double[][] var4 = new double[this.dir][this.bg8];
            var2 = 0;

            while (true) {
               if (var2 < this.dir) {
                  int var3 = 0;

                  label85: {
                     while (var3 < this.bg8) {
                        try {
                           var4[var2][var3] = this.zk2[var3][var2];
                           var3++;
                           if (var1 == 0) {
                              break label85;
                           }

                           if (var1 == 0) {
                              break;
                           }
                        } catch (vam var10) {
                           throw a(var10);
                        }
                     }

                     var2++;
                  }

                  if (var1 != 0) {
                     continue;
                  }
               }

               try {
                  this.zk2 = var4;
                  if (var1 != 0) {
                     return;
                  }
                  break;
               } catch (vam var8) {
                  boolean var10001 = false;
                  throw a(var8);
               }
            }
         }

         try {
            var10000 = 0;
         } catch (vam var7) {
            boolean var16 = false;
            throw a(var7);
         }
      }

      int var12 = var10000;

      while (var12 < this.dir) {
         int var13 = 0;

         label56: {
            while (var13 < var12) {
               double var14 = this.zk2[var12][var13];

               try {
                  this.zk2[var12][var13] = this.zk2[var13][var12];
                  this.zk2[var13][var12] = var14;
                  var13++;
                  if (var1 == 0) {
                     break label56;
                  }

                  if (var1 == 0) {
                     break;
                  }
               } catch (vam var6) {
                  throw a(var6);
               }
            }

            var12++;
         }

         if (var1 == 0) {
            break;
         }
      }
   }

   public final void nwx(yb6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 38434275277559
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield yb6.dir I
      // 11: aload 1
      // 12: getfield yb6.bg8 I
      // 15: iload 4
      // 17: ifne 3f
      // 1a: if_icmpne 42
      // 1d: goto 24
      // 20: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: iload 4
      // 27: ifne 60
      // 2a: goto 31
      // 2d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: getfield yb6.bg8 I
      // 34: aload 1
      // 35: getfield yb6.dir I
      // 38: goto 3f
      // 3b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: if_icmpeq 5f
      // 42: new vam
      // 45: dup
      // 46: sipush 24888
      // 49: ldc2_w 5372453155014589343
      // 4c: lload 2
      // 4d: lxor
      // 4e: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: nop
      // 54: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 57: invokespecial vam.<init> (Ljava/lang/String;)V
      // 5a: athrow
      // 5b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: aload 1
      // 60: iload 4
      // 62: ifne b9
      // 65: aload 0
      // 66: if_acmpeq b8
      // 69: goto 70
      // 6c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: bipush 0
      // 71: istore 5
      // 73: iload 5
      // 75: aload 0
      // 76: getfield yb6.dir I
      // 79: if_icmpge bc
      // 7c: bipush 0
      // 7d: istore 6
      // 7f: iload 6
      // 81: aload 0
      // 82: getfield yb6.bg8 I
      // 85: if_icmpge b0
      // 88: aload 0
      // 89: getfield yb6.zk2 [[D
      // 8c: iload 5
      // 8e: aaload
      // 8f: iload 6
      // 91: aload 1
      // 92: getfield yb6.zk2 [[D
      // 95: iload 6
      // 97: aaload
      // 98: iload 5
      // 9a: daload
      // 9b: dastore
      // 9c: iinc 6 1
      // 9f: iload 4
      // a1: ifne b3
      // a4: iload 4
      // a6: ifeq 7f
      // a9: goto b0
      // ac: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // af: athrow
      // b0: iinc 5 1
      // b3: iload 4
      // b5: ifeq 73
      // b8: aload 0
      // b9: invokevirtual yb6.u75 ()V
      // bc: return
   }

   @Override
   public String toString() {
      StringBuffer var2 = new StringBuffer(this.dir * this.bg8 * 8);
      int var10000 = OpaquePredicate.c();
      int var3 = 0;
      int var1 = var10000;

      while (var3 < this.dir) {
         int var4 = 0;

         while (true) {
            if (var4 < this.bg8) {
               try {
                  var2.append(this.zk2[var3][var4]).append(" ");
                  var4++;
                  if (var1 != 0) {
                     break;
                  }

                  if (var1 == 0) {
                     continue;
                  }
               } catch (vam var5) {
                  throw a(var5);
               }
            }

            var2.append("\n");
            var3++;
            break;
         }

         if (var1 != 0) {
            break;
         }
      }

      return var2.toString();
   }

   private static void fyb(yb6 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 127177855346224
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: bipush 0
      // 0d: istore 4
      // 0f: iload 4
      // 11: aload 0
      // 12: getfield yb6.dir I
      // 15: if_icmpge 9c
      // 18: bipush 0
      // 19: istore 5
      // 1b: iload 5
      // 1d: aload 0
      // 1e: getfield yb6.bg8 I
      // 21: if_icmpge 8c
      // 24: aload 0
      // 25: getfield yb6.zk2 [[D
      // 28: iload 4
      // 2a: aaload
      // 2b: iload 5
      // 2d: daload
      // 2e: invokestatic java/lang/Math.abs (D)D
      // 31: ldc2_w 1.0E-10
      // 34: dcmpg
      // 35: iload 3
      // 36: ifeq 11
      // 39: ifge 5b
      // 3c: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 3f: sipush 4209
      // 42: ldc2_w 3880265710349080084
      // 45: lload 1
      // 46: lxor
      // 47: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: nop
      // 4d: invokevirtual java/io/PrintStream.print (Ljava/lang/String;)V
      // 50: iload 3
      // 51: ifne 85
      // 54: goto 5b
      // 57: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a: athrow
      // 5b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 5e: new java/lang/StringBuilder
      // 61: dup
      // 62: invokespecial java/lang/StringBuilder.<init> ()V
      // 65: ldc " "
      // 67: nop
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b: aload 0
      // 6c: getfield yb6.zk2 [[D
      // 6f: iload 4
      // 71: aaload
      // 72: iload 5
      // 74: daload
      // 75: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 78: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7b: invokevirtual java/io/PrintStream.print (Ljava/lang/String;)V
      // 7e: goto 85
      // 81: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: iinc 5 1
      // 88: iload 3
      // 89: ifne 1b
      // 8c: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 8f: ldc "\n"
      // 91: nop
      // 92: invokevirtual java/io/PrintStream.print (Ljava/lang/String;)V
      // 95: iinc 4 1
      // 98: iload 3
      // 99: ifne 0f
      // 9c: return
   }

   @Override
   public int hashCode() {
      long var2 = 1L;
      int var10000 = OpaquePredicate.b();
      var2 = get.bbh(var2, (long)this.dir);
      var2 = get.bbh(var2, (long)this.bg8);
      int var1 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < this.dir) {
            var10000 = 0;
            if (var1 == 0) {
               break;
            }

            int var5 = 0;

            label34: {
               while (var5 < this.bg8) {
                  var2 = get.mql(var2, this.zk2[var4][var5]);

                  try {
                     var5++;
                     if (var1 == 0) {
                        break label34;
                     }

                     if (var1 == 0) {
                        break;
                     }
                  } catch (vam var6) {
                     throw a(var6);
                  }
               }

               var4++;
            }

            if (var1 != 0) {
               continue;
            }
         }

         var10000 = get.p05(var2);
         break;
      }

      return var10000;
   }

   public boolean ihl(yb6 param1) {
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
      // 05: getfield yb6.dir I
      // 08: iload 2
      // 09: ifeq 3f
      // 0c: aload 1
      // 0d: getfield yb6.dir I
      // 10: if_icmpne 37
      // 13: goto 1a
      // 16: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield yb6.bg8 I
      // 1e: iload 2
      // 1f: ifeq 41
      // 22: goto 29
      // 25: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 28: athrow
      // 29: aload 1
      // 2a: getfield yb6.bg8 I
      // 2d: if_icmpeq 40
      // 30: goto 37
      // 33: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: bipush 0
      // 38: goto 3f
      // 3b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e: athrow
      // 3f: ireturn
      // 40: bipush 0
      // 41: istore 3
      // 42: iload 3
      // 43: aload 0
      // 44: getfield yb6.dir I
      // 47: if_icmpge 8f
      // 4a: bipush 0
      // 4b: iload 2
      // 4c: ifeq 90
      // 4f: istore 4
      // 51: iload 4
      // 53: aload 0
      // 54: getfield yb6.bg8 I
      // 57: if_icmpge 88
      // 5a: aload 0
      // 5b: getfield yb6.zk2 [[D
      // 5e: iload 3
      // 5f: aaload
      // 60: iload 4
      // 62: daload
      // 63: aload 1
      // 64: getfield yb6.zk2 [[D
      // 67: iload 3
      // 68: aaload
      // 69: iload 4
      // 6b: daload
      // 6c: dcmpl
      // 6d: iload 2
      // 6e: ifeq 43
      // 71: iload 2
      // 72: ifeq 80
      // 75: ifeq 81
      // 78: goto 7f
      // 7b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7e: athrow
      // 7f: bipush 0
      // 80: ireturn
      // 81: iinc 4 1
      // 84: iload 2
      // 85: ifne 51
      // 88: iinc 3 1
      // 8b: iload 2
      // 8c: ifne 42
      // 8f: bipush 1
      // 90: ireturn
      // 91: astore 3
      // 92: bipush 0
      // 93: ireturn
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: checkcast yb6
      // 08: astore 3
      // 09: aload 0
      // 0a: getfield yb6.dir I
      // 0d: iload 2
      // 0e: ifne 44
      // 11: aload 3
      // 12: getfield yb6.dir I
      // 15: if_icmpne 3c
      // 18: goto 1f
      // 1b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield yb6.bg8 I
      // 23: iload 2
      // 24: ifne 46
      // 27: goto 2e
      // 2a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d: athrow
      // 2e: aload 3
      // 2f: getfield yb6.bg8 I
      // 32: if_icmpeq 45
      // 35: goto 3c
      // 38: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: bipush 0
      // 3d: goto 44
      // 40: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: ireturn
      // 45: bipush 0
      // 46: istore 4
      // 48: iload 4
      // 4a: aload 0
      // 4b: getfield yb6.dir I
      // 4e: if_icmpge 98
      // 51: bipush 0
      // 52: iload 2
      // 53: ifne 99
      // 56: istore 5
      // 58: iload 5
      // 5a: aload 0
      // 5b: getfield yb6.bg8 I
      // 5e: if_icmpge 91
      // 61: aload 0
      // 62: getfield yb6.zk2 [[D
      // 65: iload 4
      // 67: aaload
      // 68: iload 5
      // 6a: daload
      // 6b: aload 3
      // 6c: getfield yb6.zk2 [[D
      // 6f: iload 4
      // 71: aaload
      // 72: iload 5
      // 74: daload
      // 75: dcmpl
      // 76: iload 2
      // 77: ifne 4a
      // 7a: iload 2
      // 7b: ifne 89
      // 7e: ifeq 8a
      // 81: goto 88
      // 84: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 87: athrow
      // 88: bipush 0
      // 89: ireturn
      // 8a: iinc 5 1
      // 8d: iload 2
      // 8e: ifeq 58
      // 91: iinc 4 1
      // 94: iload 2
      // 95: ifeq 48
      // 98: bipush 1
      // 99: ireturn
      // 9a: astore 3
      // 9b: bipush 0
      // 9c: ireturn
      // 9d: astore 3
      // 9e: bipush 0
      // 9f: ireturn
   }

   public boolean fhw(yb6 var1, float var2) {
      return this.p71(var1, (double)var2);
   }

   public boolean p71(yb6 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield yb6.dir I
      // 09: iload 4
      // 0b: ifeq 42
      // 0e: aload 1
      // 0f: getfield yb6.dir I
      // 12: if_icmpne 3a
      // 15: goto 1c
      // 18: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield yb6.bg8 I
      // 20: iload 4
      // 22: ifeq 44
      // 25: goto 2c
      // 28: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b: athrow
      // 2c: aload 1
      // 2d: getfield yb6.bg8 I
      // 30: if_icmpeq 43
      // 33: goto 3a
      // 36: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: bipush 0
      // 3b: goto 42
      // 3e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41: athrow
      // 42: ireturn
      // 43: bipush 0
      // 44: istore 5
      // 46: iload 5
      // 48: aload 0
      // 49: getfield yb6.dir I
      // 4c: if_icmpge c1
      // 4f: bipush 0
      // 50: iload 4
      // 52: ifeq c2
      // 55: istore 6
      // 57: iload 6
      // 59: aload 0
      // 5a: getfield yb6.bg8 I
      // 5d: if_icmpge b9
      // 60: aload 0
      // 61: getfield yb6.zk2 [[D
      // 64: iload 5
      // 66: aaload
      // 67: iload 6
      // 69: daload
      // 6a: aload 1
      // 6b: getfield yb6.zk2 [[D
      // 6e: iload 5
      // 70: aaload
      // 71: iload 6
      // 73: daload
      // 74: dsub
      // 75: dstore 7
      // 77: dload 7
      // 79: iload 4
      // 7b: ifeq 99
      // 7e: dconst_0
      // 7f: dcmpg
      // 80: iload 4
      // 82: ifeq 48
      // 85: goto 8c
      // 88: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8b: athrow
      // 8c: ifge 9c
      // 8f: dload 7
      // 91: dneg
      // 92: goto 99
      // 95: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: goto 9e
      // 9c: dload 7
      // 9e: dload 2
      // 9f: dcmpl
      // a0: iload 4
      // a2: ifeq b0
      // a5: ifle b1
      // a8: goto af
      // ab: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ae: athrow
      // af: bipush 0
      // b0: ireturn
      // b1: iinc 6 1
      // b4: iload 4
      // b6: ifne 57
      // b9: iinc 5 1
      // bc: iload 4
      // be: ifne 46
      // c1: bipush 1
      // c2: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final double kxi() {
      int var1 = OpaquePredicate.b();

      int var3;
      label51: {
         int var10000;
         label58: {
            label55: {
               try {
                  var10000 = this.dir;
                  if (var1 == 0) {
                     break label58;
                  }

                  if (this.dir >= this.bg8) {
                     break label55;
                  }
               } catch (vam var8) {
                  throw a(var8);
               }

               var3 = this.dir;

               try {
                  if (var1 != 0) {
                     break label51;
                  }
               } catch (vam var7) {
                  boolean var10001 = false;
                  throw a(var7);
               }
            }

            try {
               var10000 = this.bg8;
            } catch (vam var6) {
               boolean var11 = false;
               throw a(var6);
            }
         }

         var3 = var10000;
      }

      double var4 = 0.0;
      int var2 = 0;

      double var10;
      while (true) {
         if (var2 < var3) {
            var10 = var4 + this.zk2[var2][var2];
            if (var1 == 0) {
               break;
            }

            var4 = var10;
            var2++;
            if (var1 != 0) {
               continue;
            }
         }

         var10 = var4;
         break;
      }

      return var10;
   }

   public final int on9(yb6 param1, yb6 param2, yb6 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 114309550068979
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: istore 6
      // 00e: aload 0
      // 00f: getfield yb6.bg8 I
      // 012: aload 3
      // 013: getfield yb6.bg8 I
      // 016: iload 6
      // 018: ifne 034
      // 01b: if_icmpne 043
      // 01e: goto 025
      // 021: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 0
      // 026: getfield yb6.bg8 I
      // 029: aload 3
      // 02a: getfield yb6.dir I
      // 02d: goto 034
      // 030: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: iload 6
      // 036: ifne 069
      // 039: if_icmpeq 061
      // 03c: goto 043
      // 03f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 042: athrow
      // 043: new vam
      // 046: dup
      // 047: sipush 23575
      // 04a: ldc2_w 3308910881374103702
      // 04d: lload 4
      // 04f: lxor
      // 050: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: nop
      // 056: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 059: invokespecial vam.<init> (Ljava/lang/String;)V
      // 05c: athrow
      // 05d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 0
      // 062: getfield yb6.dir I
      // 065: aload 1
      // 066: getfield yb6.dir I
      // 069: iload 6
      // 06b: ifne 087
      // 06e: if_icmpne 096
      // 071: goto 078
      // 074: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: getfield yb6.dir I
      // 07c: aload 1
      // 07d: getfield yb6.bg8 I
      // 080: goto 087
      // 083: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: iload 6
      // 089: ifne 0bc
      // 08c: if_icmpeq 0b4
      // 08f: goto 096
      // 092: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 095: athrow
      // 096: new vam
      // 099: dup
      // 09a: sipush 15465
      // 09d: ldc2_w 891340869459380450
      // 0a0: lload 4
      // 0a2: lxor
      // 0a3: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: nop
      // 0a9: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0ac: invokespecial vam.<init> (Ljava/lang/String;)V
      // 0af: athrow
      // 0b0: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: getfield yb6.dir I
      // 0b8: aload 2
      // 0b9: getfield yb6.dir I
      // 0bc: iload 6
      // 0be: ifne 0da
      // 0c1: if_icmpne 0e9
      // 0c4: goto 0cb
      // 0c7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: getfield yb6.bg8 I
      // 0cf: aload 2
      // 0d0: getfield yb6.bg8 I
      // 0d3: goto 0da
      // 0d6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: iload 6
      // 0dc: ifne 118
      // 0df: if_icmpeq 107
      // 0e2: goto 0e9
      // 0e5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e8: athrow
      // 0e9: new vam
      // 0ec: dup
      // 0ed: sipush 28106
      // 0f0: ldc2_w 4683592373968263518
      // 0f3: lload 4
      // 0f5: lxor
      // 0f6: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: nop
      // 0fc: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0ff: invokespecial vam.<init> (Ljava/lang/String;)V
      // 102: athrow
      // 103: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: aload 0
      // 108: getfield yb6.dir I
      // 10b: iload 6
      // 10d: ifne 1f7
      // 110: bipush 2
      // 111: goto 118
      // 114: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: if_icmpne 1f0
      // 11b: aload 0
      // 11c: getfield yb6.bg8 I
      // 11f: iload 6
      // 121: ifne 1f7
      // 124: goto 12b
      // 127: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12a: athrow
      // 12b: bipush 2
      // 12c: if_icmpne 1f0
      // 12f: goto 136
      // 132: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: aload 0
      // 137: getfield yb6.zk2 [[D
      // 13a: bipush 1
      // 13b: aaload
      // 13c: bipush 0
      // 13d: daload
      // 13e: dconst_0
      // 13f: dcmpl
      // 140: iload 6
      // 142: ifne 1f7
      // 145: goto 14c
      // 148: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14b: athrow
      // 14c: ifne 1f0
      // 14f: goto 156
      // 152: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 155: athrow
      // 156: aload 1
      // 157: invokevirtual yb6.rtk ()V
      // 15a: aload 3
      // 15b: invokevirtual yb6.rtk ()V
      // 15e: aload 0
      // 15f: getfield yb6.zk2 [[D
      // 162: bipush 0
      // 163: aaload
      // 164: bipush 1
      // 165: daload
      // 166: dconst_0
      // 167: dcmpl
      // 168: iload 6
      // 16a: ifne 185
      // 16d: goto 174
      // 170: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 173: athrow
      // 174: ifne 184
      // 177: goto 17e
      // 17a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17d: athrow
      // 17e: bipush 2
      // 17f: ireturn
      // 180: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: bipush 1
      // 185: newarray 7
      // 187: astore 7
      // 189: bipush 1
      // 18a: newarray 7
      // 18c: astore 8
      // 18e: bipush 1
      // 18f: newarray 7
      // 191: astore 9
      // 193: bipush 1
      // 194: newarray 7
      // 196: astore 10
      // 198: bipush 2
      // 199: newarray 7
      // 19b: astore 11
      // 19d: aload 11
      // 19f: bipush 0
      // 1a0: aload 0
      // 1a1: getfield yb6.zk2 [[D
      // 1a4: bipush 0
      // 1a5: aaload
      // 1a6: bipush 0
      // 1a7: daload
      // 1a8: dastore
      // 1a9: aload 11
      // 1ab: bipush 1
      // 1ac: aload 0
      // 1ad: getfield yb6.zk2 [[D
      // 1b0: bipush 1
      // 1b1: aaload
      // 1b2: bipush 1
      // 1b3: daload
      // 1b4: dastore
      // 1b5: aload 0
      // 1b6: getfield yb6.zk2 [[D
      // 1b9: bipush 0
      // 1ba: aaload
      // 1bb: bipush 0
      // 1bc: daload
      // 1bd: aload 0
      // 1be: getfield yb6.zk2 [[D
      // 1c1: bipush 0
      // 1c2: aaload
      // 1c3: bipush 1
      // 1c4: daload
      // 1c5: aload 0
      // 1c6: getfield yb6.zk2 [[D
      // 1c9: bipush 1
      // 1ca: aaload
      // 1cb: bipush 1
      // 1cc: daload
      // 1cd: aload 11
      // 1cf: aload 7
      // 1d1: aload 9
      // 1d3: aload 8
      // 1d5: aload 10
      // 1d7: bipush 0
      // 1d8: invokestatic yb6.g6z (DDD[D[D[D[D[DI)I
      // 1db: pop
      // 1dc: bipush 0
      // 1dd: aload 1
      // 1de: aload 9
      // 1e0: aload 7
      // 1e2: invokestatic yb6.lyq (ILyb6;[D[D)V
      // 1e5: bipush 0
      // 1e6: aload 3
      // 1e7: aload 10
      // 1e9: aload 8
      // 1eb: invokestatic yb6.cst (ILyb6;[D[D)V
      // 1ee: bipush 2
      // 1ef: ireturn
      // 1f0: aload 0
      // 1f1: aload 1
      // 1f2: aload 2
      // 1f3: aload 3
      // 1f4: invokestatic yb6.flf (Lyb6;Lyb6;Lyb6;Lyb6;)I
      // 1f7: ireturn
   }

   public final int _nm(yb6 param1, hxi param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 129600934623311
      // 006: lxor
      // 007: lstore 3
      // 008: aload 1
      // 009: getfield yb6.dir I
      // 00c: aload 1
      // 00d: getfield yb6.bg8 I
      // 010: imul
      // 011: istore 6
      // 013: invokestatic OpaquePredicate.b ()I
      // 016: iload 6
      // 018: newarray 7
      // 01a: astore 7
      // 01c: istore 5
      // 01e: bipush 1
      // 01f: newarray 10
      // 021: astore 8
      // 023: aload 1
      // 024: getfield yb6.dir I
      // 027: newarray 10
      // 029: astore 9
      // 02b: aload 0
      // 02c: getfield yb6.dir I
      // 02f: aload 0
      // 030: getfield yb6.bg8 I
      // 033: iload 5
      // 035: ifeq 067
      // 038: if_icmpeq 05f
      // 03b: goto 042
      // 03e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: new vam
      // 045: dup
      // 046: sipush 4470
      // 049: ldc2_w 2652798159067335035
      // 04c: lload 3
      // 04d: lxor
      // 04e: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: nop
      // 054: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 057: invokespecial vam.<init> (Ljava/lang/String;)V
      // 05a: athrow
      // 05b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield yb6.dir I
      // 063: aload 1
      // 064: getfield yb6.dir I
      // 067: iload 5
      // 069: ifeq 09b
      // 06c: if_icmpeq 093
      // 06f: goto 076
      // 072: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 075: athrow
      // 076: new vam
      // 079: dup
      // 07a: sipush 7368
      // 07d: ldc2_w 7283256672774866137
      // 080: lload 3
      // 081: lxor
      // 082: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: nop
      // 088: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 08b: invokespecial vam.<init> (Ljava/lang/String;)V
      // 08e: athrow
      // 08f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: aload 0
      // 094: getfield yb6.bg8 I
      // 097: aload 1
      // 098: getfield yb6.bg8 I
      // 09b: iload 5
      // 09d: ifeq 0db
      // 0a0: if_icmpeq 0c7
      // 0a3: goto 0aa
      // 0a6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: new vam
      // 0ad: dup
      // 0ae: sipush 9201
      // 0b1: ldc2_w 7890355050249485274
      // 0b4: lload 3
      // 0b5: lxor
      // 0b6: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0bf: invokespecial vam.<init> (Ljava/lang/String;)V
      // 0c2: athrow
      // 0c3: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c6: athrow
      // 0c7: aload 1
      // 0c8: getfield yb6.dir I
      // 0cb: iload 5
      // 0cd: ifeq 0fc
      // 0d0: aload 2
      // 0d1: invokevirtual hxi.ud2 ()I
      // 0d4: goto 0db
      // 0d7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: if_icmpeq 0fb
      // 0de: new vam
      // 0e1: dup
      // 0e2: sipush 9820
      // 0e5: ldc2_w 2263689846976642660
      // 0e8: lload 3
      // 0e9: lxor
      // 0ea: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: nop
      // 0f0: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0f3: invokespecial vam.<init> (Ljava/lang/String;)V
      // 0f6: athrow
      // 0f7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fa: athrow
      // 0fb: bipush 0
      // 0fc: istore 10
      // 0fe: iload 10
      // 100: aload 0
      // 101: getfield yb6.dir I
      // 104: if_icmpge 14b
      // 107: bipush 0
      // 108: iload 5
      // 10a: ifeq 158
      // 10d: istore 11
      // 10f: iload 11
      // 111: aload 0
      // 112: getfield yb6.bg8 I
      // 115: if_icmpge 143
      // 118: aload 7
      // 11a: iload 10
      // 11c: aload 0
      // 11d: getfield yb6.bg8 I
      // 120: imul
      // 121: iload 11
      // 123: iadd
      // 124: aload 0
      // 125: getfield yb6.zk2 [[D
      // 128: iload 10
      // 12a: aaload
      // 12b: iload 11
      // 12d: daload
      // 12e: dastore
      // 12f: iinc 11 1
      // 132: iload 5
      // 134: ifeq 146
      // 137: iload 5
      // 139: ifne 10f
      // 13c: goto 143
      // 13f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: iinc 10 1
      // 146: iload 5
      // 148: ifne 0fe
      // 14b: aload 1
      // 14c: getfield yb6.dir I
      // 14f: aload 7
      // 151: aload 9
      // 153: aload 8
      // 155: invokestatic yb6.zof (I[D[I[I)Z
      // 158: iload 5
      // 15a: ifeq 185
      // 15d: ifne 184
      // 160: goto 167
      // 163: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 166: athrow
      // 167: new fgk
      // 16a: dup
      // 16b: sipush 6554
      // 16e: ldc2_w 1733198247444070842
      // 171: lload 3
      // 172: lxor
      // 173: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: nop
      // 179: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 17c: invokespecial fgk.<init> (Ljava/lang/String;)V
      // 17f: athrow
      // 180: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: bipush 0
      // 185: istore 10
      // 187: iload 10
      // 189: aload 0
      // 18a: getfield yb6.dir I
      // 18d: if_icmpge 1d4
      // 190: bipush 0
      // 191: iload 5
      // 193: ifeq 1d5
      // 196: istore 11
      // 198: iload 11
      // 19a: aload 0
      // 19b: getfield yb6.bg8 I
      // 19e: if_icmpge 1cc
      // 1a1: aload 1
      // 1a2: getfield yb6.zk2 [[D
      // 1a5: iload 10
      // 1a7: aaload
      // 1a8: iload 11
      // 1aa: aload 7
      // 1ac: iload 10
      // 1ae: aload 0
      // 1af: getfield yb6.bg8 I
      // 1b2: imul
      // 1b3: iload 11
      // 1b5: iadd
      // 1b6: daload
      // 1b7: dastore
      // 1b8: iinc 11 1
      // 1bb: iload 5
      // 1bd: ifeq 1cf
      // 1c0: iload 5
      // 1c2: ifne 198
      // 1c5: goto 1cc
      // 1c8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cb: athrow
      // 1cc: iinc 10 1
      // 1cf: iload 5
      // 1d1: ifne 187
      // 1d4: bipush 0
      // 1d5: istore 10
      // 1d7: iload 10
      // 1d9: aload 1
      // 1da: getfield yb6.dir I
      // 1dd: if_icmpge 1f5
      // 1e0: aload 2
      // 1e1: getfield hxi.ch5 [D
      // 1e4: iload 10
      // 1e6: aload 9
      // 1e8: iload 10
      // 1ea: iaload
      // 1eb: i2d
      // 1ec: dastore
      // 1ed: iinc 10 1
      // 1f0: iload 5
      // 1f2: ifne 1d7
      // 1f5: aload 8
      // 1f7: bipush 0
      // 1f8: iaload
      // 1f9: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void z6b(double var1) {
      int var3 = OpaquePredicate.b();

      int var6;
      label81: {
         int var10000;
         label89: {
            label85: {
               try {
                  var10000 = this.dir;
                  if (var3 == 0) {
                     break label89;
                  }

                  if (this.dir >= this.bg8) {
                     break label85;
                  }
               } catch (vam var10) {
                  throw a(var10);
               }

               var6 = this.dir;

               try {
                  if (var3 != 0) {
                     break label81;
                  }
               } catch (vam var9) {
                  boolean var10001 = false;
                  throw a(var9);
               }
            }

            try {
               var10000 = this.bg8;
            } catch (vam var8) {
               boolean var14 = false;
               throw a(var8);
            }
         }

         var6 = var10000;
      }

      int var4 = 0;

      byte var13;
      while (true) {
         if (var4 < this.dir) {
            var13 = 0;
            if (var3 == 0) {
               break;
            }

            int var5 = 0;

            label57: {
               while (var5 < this.bg8) {
                  try {
                     this.zk2[var4][var5] = 0.0;
                     var5++;
                     if (var3 == 0) {
                        break label57;
                     }

                     if (var3 == 0) {
                        break;
                     }
                  } catch (vam var7) {
                     throw a(var7);
                  }
               }

               var4++;
            }

            if (var3 != 0) {
               continue;
            }
         }

         var13 = 0;
         break;
      }

      var4 = var13;

      while (var4 < var6) {
         this.zk2[var4][var4] = var1;
         var4++;
         if (var3 == 0) {
            break;
         }
      }
   }

   public final void jni(yb6 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 106493307316704
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: getfield yb6.dir I
      // 00c: aload 1
      // 00d: getfield yb6.bg8 I
      // 010: imul
      // 011: istore 5
      // 013: invokestatic OpaquePredicate.c ()I
      // 016: iload 5
      // 018: newarray 7
      // 01a: astore 6
      // 01c: iload 5
      // 01e: newarray 7
      // 020: astore 7
      // 022: istore 4
      // 024: aload 1
      // 025: getfield yb6.dir I
      // 028: newarray 10
      // 02a: astore 8
      // 02c: bipush 1
      // 02d: newarray 10
      // 02f: astore 9
      // 031: aload 1
      // 032: getfield yb6.dir I
      // 035: iload 4
      // 037: ifne 066
      // 03a: aload 1
      // 03b: getfield yb6.bg8 I
      // 03e: if_icmpeq 065
      // 041: goto 048
      // 044: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: new vam
      // 04b: dup
      // 04c: sipush 20625
      // 04f: ldc2_w 5688135613432715559
      // 052: lload 2
      // 053: lxor
      // 054: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: nop
      // 05a: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 05d: invokespecial vam.<init> (Ljava/lang/String;)V
      // 060: athrow
      // 061: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: bipush 0
      // 066: istore 10
      // 068: iload 10
      // 06a: aload 0
      // 06b: getfield yb6.dir I
      // 06e: if_icmpge 0b5
      // 071: bipush 0
      // 072: iload 4
      // 074: ifne 0c2
      // 077: istore 11
      // 079: iload 11
      // 07b: aload 0
      // 07c: getfield yb6.bg8 I
      // 07f: if_icmpge 0ad
      // 082: aload 6
      // 084: iload 10
      // 086: aload 0
      // 087: getfield yb6.bg8 I
      // 08a: imul
      // 08b: iload 11
      // 08d: iadd
      // 08e: aload 1
      // 08f: getfield yb6.zk2 [[D
      // 092: iload 10
      // 094: aaload
      // 095: iload 11
      // 097: daload
      // 098: dastore
      // 099: iinc 11 1
      // 09c: iload 4
      // 09e: ifne 0b0
      // 0a1: iload 4
      // 0a3: ifeq 079
      // 0a6: goto 0ad
      // 0a9: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ac: athrow
      // 0ad: iinc 10 1
      // 0b0: iload 4
      // 0b2: ifeq 068
      // 0b5: aload 1
      // 0b6: getfield yb6.dir I
      // 0b9: aload 6
      // 0bb: aload 8
      // 0bd: aload 9
      // 0bf: invokestatic yb6.zof (I[D[I[I)Z
      // 0c2: iload 4
      // 0c4: ifne 0ef
      // 0c7: ifne 0ee
      // 0ca: goto 0d1
      // 0cd: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d0: athrow
      // 0d1: new fgk
      // 0d4: dup
      // 0d5: sipush 13244
      // 0d8: ldc2_w 4332341782224681527
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 0e6: invokespecial fgk.<init> (Ljava/lang/String;)V
      // 0e9: athrow
      // 0ea: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: bipush 0
      // 0ef: istore 10
      // 0f1: iload 10
      // 0f3: iload 5
      // 0f5: if_icmpge 112
      // 0f8: aload 7
      // 0fa: iload 10
      // 0fc: dconst_0
      // 0fd: dastore
      // 0fe: iinc 10 1
      // 101: iload 4
      // 103: ifne 115
      // 106: iload 4
      // 108: ifeq 0f1
      // 10b: goto 112
      // 10e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: bipush 0
      // 113: istore 10
      // 115: iload 10
      // 117: aload 0
      // 118: getfield yb6.bg8 I
      // 11b: if_icmpge 147
      // 11e: aload 7
      // 120: iload 10
      // 122: iload 10
      // 124: aload 0
      // 125: getfield yb6.bg8 I
      // 128: imul
      // 129: iadd
      // 12a: dconst_1
      // 12b: dastore
      // 12c: iinc 10 1
      // 12f: iload 4
      // 131: ifne 154
      // 134: goto 13b
      // 137: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: iload 4
      // 13d: ifeq 115
      // 140: goto 147
      // 143: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: aload 1
      // 148: getfield yb6.dir I
      // 14b: aload 6
      // 14d: aload 8
      // 14f: aload 7
      // 151: invokestatic yb6.r3x (I[D[I[D)V
      // 154: bipush 0
      // 155: istore 10
      // 157: iload 10
      // 159: aload 0
      // 15a: getfield yb6.dir I
      // 15d: if_icmpge 19f
      // 160: bipush 0
      // 161: istore 11
      // 163: iload 11
      // 165: aload 0
      // 166: getfield yb6.bg8 I
      // 169: if_icmpge 197
      // 16c: aload 0
      // 16d: getfield yb6.zk2 [[D
      // 170: iload 10
      // 172: aaload
      // 173: iload 11
      // 175: aload 7
      // 177: iload 10
      // 179: aload 0
      // 17a: getfield yb6.bg8 I
      // 17d: imul
      // 17e: iload 11
      // 180: iadd
      // 181: daload
      // 182: dastore
      // 183: iinc 11 1
      // 186: iload 4
      // 188: ifne 19a
      // 18b: iload 4
      // 18d: ifeq 163
      // 190: goto 197
      // 193: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 196: athrow
      // 197: iinc 10 1
      // 19a: iload 4
      // 19c: ifeq 157
      // 19f: return
   }

   public static boolean zof(int param0, double[] param1, int[] param2, int[] param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 44549084053160
      // 006: lxor
      // 007: lstore 4
      // 009: iload 0
      // 00a: newarray 7
      // 00c: astore 7
      // 00e: bipush 0
      // 00f: istore 10
      // 011: bipush 0
      // 012: istore 11
      // 014: aload 3
      // 015: bipush 0
      // 016: bipush 1
      // 017: iastore
      // 018: invokestatic OpaquePredicate.c ()I
      // 01b: iload 0
      // 01c: istore 8
      // 01e: istore 6
      // 020: iload 8
      // 022: iinc 8 -1
      // 025: ifeq 09a
      // 028: dconst_0
      // 029: dstore 13
      // 02b: iload 0
      // 02c: iload 6
      // 02e: ifne 09b
      // 031: istore 9
      // 033: iload 9
      // 035: iinc 9 -1
      // 038: ifeq 074
      // 03b: aload 1
      // 03c: iload 10
      // 03e: iinc 10 1
      // 041: daload
      // 042: dstore 15
      // 044: dload 15
      // 046: invokestatic java/lang/Math.abs (D)D
      // 049: dstore 15
      // 04b: dload 15
      // 04d: iload 6
      // 04f: ifne 06d
      // 052: dload 13
      // 054: dcmpl
      // 055: iload 6
      // 057: ifne 078
      // 05a: goto 061
      // 05d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: ifle 033
      // 064: goto 06b
      // 067: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: dload 15
      // 06d: dstore 13
      // 06f: iload 6
      // 071: ifeq 033
      // 074: dload 13
      // 076: dconst_0
      // 077: dcmpl
      // 078: iload 6
      // 07a: ifne 088
      // 07d: ifne 089
      // 080: goto 087
      // 083: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: bipush 0
      // 088: ireturn
      // 089: aload 7
      // 08b: iload 11
      // 08d: iinc 11 1
      // 090: dconst_1
      // 091: dload 13
      // 093: ddiv
      // 094: dastore
      // 095: iload 6
      // 097: ifeq 020
      // 09a: bipush 0
      // 09b: istore 12
      // 09d: bipush 0
      // 09e: istore 9
      // 0a0: iload 9
      // 0a2: iload 0
      // 0a3: if_icmpge 2e1
      // 0a6: bipush 0
      // 0a7: iload 6
      // 0a9: ifne 2e2
      // 0ac: istore 8
      // 0ae: iload 8
      // 0b0: iload 9
      // 0b2: if_icmpge 11e
      // 0b5: iload 12
      // 0b7: iload 0
      // 0b8: iload 8
      // 0ba: imul
      // 0bb: iadd
      // 0bc: iload 9
      // 0be: iadd
      // 0bf: istore 19
      // 0c1: aload 1
      // 0c2: iload 19
      // 0c4: daload
      // 0c5: dstore 22
      // 0c7: iload 8
      // 0c9: istore 18
      // 0cb: iload 12
      // 0cd: iload 0
      // 0ce: iload 8
      // 0d0: imul
      // 0d1: iadd
      // 0d2: istore 20
      // 0d4: iload 12
      // 0d6: iload 9
      // 0d8: iadd
      // 0d9: iload 6
      // 0db: ifne 0a2
      // 0de: istore 21
      // 0e0: iload 18
      // 0e2: iinc 18 -1
      // 0e5: ifeq 110
      // 0e8: dload 22
      // 0ea: aload 1
      // 0eb: iload 20
      // 0ed: daload
      // 0ee: aload 1
      // 0ef: iload 21
      // 0f1: daload
      // 0f2: dmul
      // 0f3: dsub
      // 0f4: dstore 22
      // 0f6: iinc 20 1
      // 0f9: iload 21
      // 0fb: iload 0
      // 0fc: iadd
      // 0fd: istore 21
      // 0ff: iload 6
      // 101: ifne 119
      // 104: iload 6
      // 106: ifeq 0e0
      // 109: goto 110
      // 10c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10f: athrow
      // 110: aload 1
      // 111: iload 19
      // 113: dload 22
      // 115: dastore
      // 116: iinc 8 1
      // 119: iload 6
      // 11b: ifeq 0ae
      // 11e: dconst_0
      // 11f: dstore 13
      // 121: bipush -1
      // 122: istore 17
      // 124: iload 9
      // 126: istore 8
      // 128: iload 8
      // 12a: iload 0
      // 12b: if_icmpge 1bf
      // 12e: iload 12
      // 130: iload 0
      // 131: iload 8
      // 133: imul
      // 134: iadd
      // 135: iload 9
      // 137: iadd
      // 138: istore 19
      // 13a: aload 1
      // 13b: iload 19
      // 13d: daload
      // 13e: dstore 22
      // 140: iload 9
      // 142: istore 18
      // 144: iload 12
      // 146: iload 0
      // 147: iload 8
      // 149: imul
      // 14a: iadd
      // 14b: istore 20
      // 14d: iload 12
      // 14f: iload 9
      // 151: iadd
      // 152: iload 6
      // 154: ifne 1c1
      // 157: istore 21
      // 159: iload 18
      // 15b: iinc 18 -1
      // 15e: ifeq 189
      // 161: dload 22
      // 163: aload 1
      // 164: iload 20
      // 166: daload
      // 167: aload 1
      // 168: iload 21
      // 16a: daload
      // 16b: dmul
      // 16c: dsub
      // 16d: dstore 22
      // 16f: iinc 20 1
      // 172: iload 21
      // 174: iload 0
      // 175: iadd
      // 176: istore 21
      // 178: iload 6
      // 17a: ifne 18f
      // 17d: iload 6
      // 17f: ifeq 159
      // 182: goto 189
      // 185: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: aload 1
      // 18a: iload 19
      // 18c: dload 22
      // 18e: dastore
      // 18f: aload 7
      // 191: iload 8
      // 193: daload
      // 194: dload 22
      // 196: invokestatic java/lang/Math.abs (D)D
      // 199: dmul
      // 19a: dup2
      // 19b: dstore 15
      // 19d: dload 13
      // 19f: dcmpl
      // 1a0: iload 6
      // 1a2: ifne 1b5
      // 1a5: iflt 1b7
      // 1a8: goto 1af
      // 1ab: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ae: athrow
      // 1af: dload 15
      // 1b1: dstore 13
      // 1b3: iload 8
      // 1b5: istore 17
      // 1b7: iinc 8 1
      // 1ba: iload 6
      // 1bc: ifeq 128
      // 1bf: iload 17
      // 1c1: iload 6
      // 1c3: ifne 1f0
      // 1c6: ifge 1ee
      // 1c9: goto 1d0
      // 1cc: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: new java/lang/RuntimeException
      // 1d3: dup
      // 1d4: sipush 31568
      // 1d7: ldc2_w 7566465426983249284
      // 1da: lload 4
      // 1dc: lxor
      // 1dd: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: nop
      // 1e3: invokestatic _fg.agj (Ljava/lang/String;)Ljava/lang/String;
      // 1e6: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 1e9: athrow
      // 1ea: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: iload 9
      // 1f0: iload 6
      // 1f2: ifne 26e
      // 1f5: iload 17
      // 1f7: if_icmpeq 25a
      // 1fa: goto 201
      // 1fd: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 200: athrow
      // 201: iload 0
      // 202: istore 18
      // 204: iload 12
      // 206: iload 0
      // 207: iload 17
      // 209: imul
      // 20a: iadd
      // 20b: istore 20
      // 20d: iload 12
      // 20f: iload 0
      // 210: iload 9
      // 212: imul
      // 213: iadd
      // 214: istore 21
      // 216: iload 18
      // 218: iinc 18 -1
      // 21b: ifeq 249
      // 21e: aload 1
      // 21f: iload 20
      // 221: daload
      // 222: dstore 15
      // 224: aload 1
      // 225: iload 20
      // 227: iinc 20 1
      // 22a: aload 1
      // 22b: iload 21
      // 22d: daload
      // 22e: dastore
      // 22f: aload 1
      // 230: iload 21
      // 232: iinc 21 1
      // 235: dload 15
      // 237: dastore
      // 238: iload 6
      // 23a: ifne 253
      // 23d: iload 6
      // 23f: ifeq 216
      // 242: goto 249
      // 245: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 248: athrow
      // 249: aload 7
      // 24b: iload 17
      // 24d: aload 7
      // 24f: iload 9
      // 251: daload
      // 252: dastore
      // 253: aload 3
      // 254: bipush 0
      // 255: aload 3
      // 256: bipush 0
      // 257: iaload
      // 258: ineg
      // 259: iastore
      // 25a: aload 2
      // 25b: iload 9
      // 25d: iload 17
      // 25f: iastore
      // 260: aload 1
      // 261: iload 12
      // 263: iload 0
      // 264: iload 9
      // 266: imul
      // 267: iadd
      // 268: iload 9
      // 26a: iadd
      // 26b: daload
      // 26c: dconst_0
      // 26d: dcmpl
      // 26e: iload 6
      // 270: ifne 285
      // 273: ifne 283
      // 276: goto 27d
      // 279: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27c: athrow
      // 27d: bipush 0
      // 27e: ireturn
      // 27f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 282: athrow
      // 283: iload 9
      // 285: iload 0
      // 286: bipush 1
      // 287: isub
      // 288: if_icmpeq 2d9
      // 28b: dconst_1
      // 28c: aload 1
      // 28d: iload 12
      // 28f: iload 0
      // 290: iload 9
      // 292: imul
      // 293: iadd
      // 294: iload 9
      // 296: iadd
      // 297: daload
      // 298: ddiv
      // 299: dstore 15
      // 29b: iload 12
      // 29d: iload 0
      // 29e: iload 9
      // 2a0: bipush 1
      // 2a1: iadd
      // 2a2: imul
      // 2a3: iadd
      // 2a4: iload 9
      // 2a6: iadd
      // 2a7: istore 19
      // 2a9: iload 0
      // 2aa: bipush 1
      // 2ab: isub
      // 2ac: iload 9
      // 2ae: isub
      // 2af: istore 8
      // 2b1: iload 8
      // 2b3: iinc 8 -1
      // 2b6: ifeq 2d9
      // 2b9: aload 1
      // 2ba: iload 19
      // 2bc: dup2
      // 2bd: daload
      // 2be: dload 15
      // 2c0: dmul
      // 2c1: dastore
      // 2c2: iload 19
      // 2c4: iload 0
      // 2c5: iadd
      // 2c6: istore 19
      // 2c8: iload 6
      // 2ca: ifne 2dc
      // 2cd: iload 6
      // 2cf: ifeq 2b1
      // 2d2: goto 2d9
      // 2d5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d8: athrow
      // 2d9: iinc 9 1
      // 2dc: iload 6
      // 2de: ifeq 0a0
      // 2e1: bipush 1
      // 2e2: ireturn
   }

   public static void r3x(int param0, double[] param1, int[] param2, double[] param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 10
      // 003: invokestatic OpaquePredicate.b ()I
      // 006: bipush 0
      // 007: istore 9
      // 009: istore 4
      // 00b: iload 9
      // 00d: iload 0
      // 00e: if_icmpge 14f
      // 011: iload 9
      // 013: istore 11
      // 015: bipush -1
      // 016: istore 6
      // 018: bipush 0
      // 019: istore 5
      // 01b: iload 5
      // 01d: iload 0
      // 01e: if_icmpge 0cb
      // 021: aload 2
      // 022: iload 10
      // 024: iload 5
      // 026: iadd
      // 027: iaload
      // 028: istore 7
      // 02a: aload 3
      // 02b: iload 11
      // 02d: iload 0
      // 02e: iload 7
      // 030: imul
      // 031: iadd
      // 032: daload
      // 033: dstore 16
      // 035: aload 3
      // 036: iload 11
      // 038: iload 0
      // 039: iload 7
      // 03b: imul
      // 03c: iadd
      // 03d: aload 3
      // 03e: iload 11
      // 040: iload 0
      // 041: iload 5
      // 043: imul
      // 044: iadd
      // 045: daload
      // 046: dastore
      // 047: iload 6
      // 049: iload 4
      // 04b: ifeq 0cc
      // 04e: iload 4
      // 050: ifeq 0a5
      // 053: goto 05a
      // 056: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: iflt 0a1
      // 05d: goto 064
      // 060: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: iload 5
      // 066: iload 0
      // 067: imul
      // 068: istore 12
      // 06a: iload 6
      // 06c: istore 8
      // 06e: iload 8
      // 070: iload 5
      // 072: bipush 1
      // 073: isub
      // 074: if_icmpgt 0b8
      // 077: dload 16
      // 079: aload 1
      // 07a: iload 12
      // 07c: iload 8
      // 07e: iadd
      // 07f: daload
      // 080: aload 3
      // 081: iload 11
      // 083: iload 0
      // 084: iload 8
      // 086: imul
      // 087: iadd
      // 088: daload
      // 089: dmul
      // 08a: dsub
      // 08b: dstore 16
      // 08d: iinc 8 1
      // 090: iload 4
      // 092: ifeq 0c6
      // 095: iload 4
      // 097: ifne 06e
      // 09a: goto 0a1
      // 09d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: dload 16
      // 0a3: dconst_0
      // 0a4: dcmpl
      // 0a5: iload 4
      // 0a7: ifeq 0b6
      // 0aa: ifeq 0b8
      // 0ad: goto 0b4
      // 0b0: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b3: athrow
      // 0b4: iload 5
      // 0b6: istore 6
      // 0b8: aload 3
      // 0b9: iload 11
      // 0bb: iload 0
      // 0bc: iload 5
      // 0be: imul
      // 0bf: iadd
      // 0c0: dload 16
      // 0c2: dastore
      // 0c3: iinc 5 1
      // 0c6: iload 4
      // 0c8: ifne 01b
      // 0cb: bipush 0
      // 0cc: istore 5
      // 0ce: iload 5
      // 0d0: iload 0
      // 0d1: if_icmpge 147
      // 0d4: iload 0
      // 0d5: bipush 1
      // 0d6: isub
      // 0d7: iload 5
      // 0d9: isub
      // 0da: istore 13
      // 0dc: iload 0
      // 0dd: iload 13
      // 0df: imul
      // 0e0: istore 12
      // 0e2: dconst_0
      // 0e3: dstore 14
      // 0e5: bipush 1
      // 0e6: iload 4
      // 0e8: ifeq 00d
      // 0eb: istore 8
      // 0ed: iload 8
      // 0ef: iload 5
      // 0f1: if_icmpgt 122
      // 0f4: dload 14
      // 0f6: aload 1
      // 0f7: iload 12
      // 0f9: iload 0
      // 0fa: iadd
      // 0fb: iload 8
      // 0fd: isub
      // 0fe: daload
      // 0ff: aload 3
      // 100: iload 11
      // 102: iload 0
      // 103: iload 0
      // 104: iload 8
      // 106: isub
      // 107: imul
      // 108: iadd
      // 109: daload
      // 10a: dmul
      // 10b: dadd
      // 10c: dstore 14
      // 10e: iinc 8 1
      // 111: iload 4
      // 113: ifeq 142
      // 116: iload 4
      // 118: ifne 0ed
      // 11b: goto 122
      // 11e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: aload 3
      // 123: iload 11
      // 125: iload 0
      // 126: iload 13
      // 128: imul
      // 129: iadd
      // 12a: aload 3
      // 12b: iload 11
      // 12d: iload 0
      // 12e: iload 13
      // 130: imul
      // 131: iadd
      // 132: daload
      // 133: dload 14
      // 135: dsub
      // 136: aload 1
      // 137: iload 12
      // 139: iload 13
      // 13b: iadd
      // 13c: daload
      // 13d: ddiv
      // 13e: dastore
      // 13f: iinc 5 1
      // 142: iload 4
      // 144: ifne 0ce
      // 147: iinc 9 1
      // 14a: iload 4
      // 14c: ifne 00b
      // 14f: return
   }

   public static int flf(yb6 param0, yb6 param1, yb6 param2, yb6 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new yb6
      // 003: dup
      // 004: aload 0
      // 005: getfield yb6.dir I
      // 008: aload 0
      // 009: getfield yb6.bg8 I
      // 00c: invokespecial yb6.<init> (II)V
      // 00f: astore 28
      // 011: new yb6
      // 014: dup
      // 015: aload 0
      // 016: getfield yb6.dir I
      // 019: aload 0
      // 01a: getfield yb6.bg8 I
      // 01d: invokespecial yb6.<init> (II)V
      // 020: astore 29
      // 022: invokestatic OpaquePredicate.c ()I
      // 025: new yb6
      // 028: dup
      // 029: aload 0
      // 02a: getfield yb6.dir I
      // 02d: aload 0
      // 02e: getfield yb6.bg8 I
      // 031: invokespecial yb6.<init> (II)V
      // 034: astore 30
      // 036: istore 4
      // 038: new yb6
      // 03b: dup
      // 03c: aload 0
      // 03d: invokespecial yb6.<init> (Lyb6;)V
      // 040: astore 31
      // 042: aload 31
      // 044: getfield yb6.dir I
      // 047: iload 4
      // 049: ifne 07c
      // 04c: aload 31
      // 04e: getfield yb6.bg8 I
      // 051: if_icmplt 070
      // 054: goto 05b
      // 057: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05a: athrow
      // 05b: aload 31
      // 05d: getfield yb6.bg8 I
      // 060: istore 26
      // 062: aload 31
      // 064: getfield yb6.bg8 I
      // 067: bipush 1
      // 068: isub
      // 069: istore 25
      // 06b: iload 4
      // 06d: ifeq 085
      // 070: aload 31
      // 072: getfield yb6.dir I
      // 075: goto 07c
      // 078: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07b: athrow
      // 07c: istore 26
      // 07e: aload 31
      // 080: getfield yb6.dir I
      // 083: istore 25
      // 085: aload 31
      // 087: getfield yb6.dir I
      // 08a: iload 4
      // 08c: ifne 0b6
      // 08f: aload 31
      // 091: getfield yb6.bg8 I
      // 094: if_icmple 0aa
      // 097: goto 09e
      // 09a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09d: athrow
      // 09e: aload 31
      // 0a0: getfield yb6.dir I
      // 0a3: istore 27
      // 0a5: iload 4
      // 0a7: ifeq 0b8
      // 0aa: aload 31
      // 0ac: getfield yb6.bg8 I
      // 0af: goto 0b6
      // 0b2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b5: athrow
      // 0b6: istore 27
      // 0b8: iload 27
      // 0ba: newarray 7
      // 0bc: astore 32
      // 0be: iload 26
      // 0c0: newarray 7
      // 0c2: astore 33
      // 0c4: iload 25
      // 0c6: newarray 7
      // 0c8: astore 34
      // 0ca: bipush 0
      // 0cb: istore 12
      // 0cd: aload 1
      // 0ce: invokevirtual yb6.rtk ()V
      // 0d1: aload 3
      // 0d2: invokevirtual yb6.rtk ()V
      // 0d5: aload 31
      // 0d7: getfield yb6.dir I
      // 0da: istore 8
      // 0dc: aload 31
      // 0de: getfield yb6.bg8 I
      // 0e1: istore 9
      // 0e3: bipush 0
      // 0e4: istore 10
      // 0e6: iload 10
      // 0e8: iload 26
      // 0ea: if_icmpge 87c
      // 0ed: iload 8
      // 0ef: iload 4
      // 0f1: ifne 87d
      // 0f4: bipush 1
      // 0f5: iload 4
      // 0f7: ifne 4ae
      // 0fa: goto 101
      // 0fd: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: if_icmple 4ab
      // 104: goto 10b
      // 107: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: dconst_0
      // 10c: dstore 19
      // 10e: bipush 0
      // 10f: istore 5
      // 111: iload 5
      // 113: iload 8
      // 115: if_icmpge 14e
      // 118: dload 19
      // 11a: aload 31
      // 11c: getfield yb6.zk2 [[D
      // 11f: iload 5
      // 121: iload 10
      // 123: iadd
      // 124: aaload
      // 125: iload 10
      // 127: daload
      // 128: aload 31
      // 12a: getfield yb6.zk2 [[D
      // 12d: iload 5
      // 12f: iload 10
      // 131: iadd
      // 132: aaload
      // 133: iload 10
      // 135: daload
      // 136: dmul
      // 137: dadd
      // 138: dstore 19
      // 13a: iinc 5 1
      // 13d: iload 4
      // 13f: ifne 155
      // 142: iload 4
      // 144: ifeq 111
      // 147: goto 14e
      // 14a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: dload 19
      // 150: invokestatic java/lang/Math.sqrt (D)D
      // 153: dstore 19
      // 155: aload 31
      // 157: getfield yb6.zk2 [[D
      // 15a: iload 10
      // 15c: aaload
      // 15d: iload 10
      // 15f: iload 4
      // 161: ifne 18d
      // 164: daload
      // 165: dconst_0
      // 166: dcmpl
      // 167: ifne 183
      // 16a: goto 171
      // 16d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 170: athrow
      // 171: aload 32
      // 173: bipush 0
      // 174: dload 19
      // 176: dastore
      // 177: iload 4
      // 179: ifeq 1aa
      // 17c: goto 183
      // 17f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182: athrow
      // 183: aload 32
      // 185: bipush 0
      // 186: goto 18d
      // 189: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: aload 31
      // 18f: getfield yb6.zk2 [[D
      // 192: iload 10
      // 194: aaload
      // 195: iload 10
      // 197: daload
      // 198: dload 19
      // 19a: aload 31
      // 19c: getfield yb6.zk2 [[D
      // 19f: iload 10
      // 1a1: aaload
      // 1a2: iload 10
      // 1a4: daload
      // 1a5: invokestatic yb6.ikt (DD)D
      // 1a8: dadd
      // 1a9: dastore
      // 1aa: bipush 1
      // 1ab: istore 5
      // 1ad: iload 5
      // 1af: iload 8
      // 1b1: if_icmpge 1db
      // 1b4: aload 32
      // 1b6: iload 5
      // 1b8: aload 31
      // 1ba: getfield yb6.zk2 [[D
      // 1bd: iload 10
      // 1bf: iload 5
      // 1c1: iadd
      // 1c2: aaload
      // 1c3: iload 10
      // 1c5: daload
      // 1c6: dastore
      // 1c7: iinc 5 1
      // 1ca: iload 4
      // 1cc: ifne 4ab
      // 1cf: iload 4
      // 1d1: ifeq 1ad
      // 1d4: goto 1db
      // 1d7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1da: athrow
      // 1db: dconst_0
      // 1dc: dstore 21
      // 1de: bipush 0
      // 1df: istore 5
      // 1e1: iload 5
      // 1e3: iload 8
      // 1e5: if_icmpge 20c
      // 1e8: dload 21
      // 1ea: aload 32
      // 1ec: iload 5
      // 1ee: daload
      // 1ef: aload 32
      // 1f1: iload 5
      // 1f3: daload
      // 1f4: dmul
      // 1f5: dadd
      // 1f6: dstore 21
      // 1f8: iinc 5 1
      // 1fb: iload 4
      // 1fd: ifne 214
      // 200: iload 4
      // 202: ifeq 1e1
      // 205: goto 20c
      // 208: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: ldc2_w 2.0
      // 20f: dload 21
      // 211: ddiv
      // 212: dstore 21
      // 214: iload 10
      // 216: istore 6
      // 218: iload 6
      // 21a: aload 31
      // 21c: getfield yb6.dir I
      // 21f: if_icmpge 271
      // 222: iload 10
      // 224: iload 4
      // 226: ifne 273
      // 229: istore 7
      // 22b: iload 7
      // 22d: aload 31
      // 22f: getfield yb6.dir I
      // 232: if_icmpge 269
      // 235: aload 29
      // 237: getfield yb6.zk2 [[D
      // 23a: iload 6
      // 23c: aaload
      // 23d: iload 7
      // 23f: dload 21
      // 241: dneg
      // 242: aload 32
      // 244: iload 6
      // 246: iload 10
      // 248: isub
      // 249: daload
      // 24a: dmul
      // 24b: aload 32
      // 24d: iload 7
      // 24f: iload 10
      // 251: isub
      // 252: daload
      // 253: dmul
      // 254: dastore
      // 255: iinc 7 1
      // 258: iload 4
      // 25a: ifne 26c
      // 25d: iload 4
      // 25f: ifeq 22b
      // 262: goto 269
      // 265: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: iinc 6 1
      // 26c: iload 4
      // 26e: ifeq 218
      // 271: iload 10
      // 273: istore 5
      // 275: iload 5
      // 277: aload 31
      // 279: getfield yb6.dir I
      // 27c: if_icmpge 2a2
      // 27f: aload 29
      // 281: getfield yb6.zk2 [[D
      // 284: iload 5
      // 286: aaload
      // 287: iload 5
      // 289: dup2
      // 28a: daload
      // 28b: dconst_1
      // 28c: dadd
      // 28d: dastore
      // 28e: iinc 5 1
      // 291: iload 4
      // 293: ifne 4ab
      // 296: iload 4
      // 298: ifeq 275
      // 29b: goto 2a2
      // 29e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a1: athrow
      // 2a2: dconst_0
      // 2a3: dstore 23
      // 2a5: iload 10
      // 2a7: istore 5
      // 2a9: iload 5
      // 2ab: aload 31
      // 2ad: getfield yb6.dir I
      // 2b0: if_icmpge 2e3
      // 2b3: dload 23
      // 2b5: aload 29
      // 2b7: getfield yb6.zk2 [[D
      // 2ba: iload 10
      // 2bc: aaload
      // 2bd: iload 5
      // 2bf: daload
      // 2c0: aload 31
      // 2c2: getfield yb6.zk2 [[D
      // 2c5: iload 5
      // 2c7: aaload
      // 2c8: iload 10
      // 2ca: daload
      // 2cb: dmul
      // 2cc: dadd
      // 2cd: dstore 23
      // 2cf: iinc 5 1
      // 2d2: iload 4
      // 2d4: ifne 2f0
      // 2d7: iload 4
      // 2d9: ifeq 2a9
      // 2dc: goto 2e3
      // 2df: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e2: athrow
      // 2e3: aload 31
      // 2e5: getfield yb6.zk2 [[D
      // 2e8: iload 10
      // 2ea: aaload
      // 2eb: iload 10
      // 2ed: dload 23
      // 2ef: dastore
      // 2f0: iload 10
      // 2f2: istore 6
      // 2f4: iload 6
      // 2f6: aload 31
      // 2f8: getfield yb6.dir I
      // 2fb: if_icmpge 37b
      // 2fe: iload 10
      // 300: bipush 1
      // 301: iadd
      // 302: iload 4
      // 304: ifne 37d
      // 307: istore 7
      // 309: iload 7
      // 30b: aload 31
      // 30d: getfield yb6.bg8 I
      // 310: if_icmpge 373
      // 313: aload 28
      // 315: getfield yb6.zk2 [[D
      // 318: iload 6
      // 31a: aaload
      // 31b: iload 7
      // 31d: dconst_0
      // 31e: dastore
      // 31f: iload 10
      // 321: iload 4
      // 323: ifne 2f6
      // 326: istore 5
      // 328: iload 5
      // 32a: aload 31
      // 32c: getfield yb6.bg8 I
      // 32f: if_icmpge 36b
      // 332: aload 28
      // 334: getfield yb6.zk2 [[D
      // 337: iload 6
      // 339: aaload
      // 33a: iload 7
      // 33c: dup2
      // 33d: daload
      // 33e: aload 29
      // 340: getfield yb6.zk2 [[D
      // 343: iload 6
      // 345: aaload
      // 346: iload 5
      // 348: daload
      // 349: aload 31
      // 34b: getfield yb6.zk2 [[D
      // 34e: iload 5
      // 350: aaload
      // 351: iload 7
      // 353: daload
      // 354: dmul
      // 355: dadd
      // 356: dastore
      // 357: iinc 5 1
      // 35a: iload 4
      // 35c: ifne 36e
      // 35f: iload 4
      // 361: ifeq 328
      // 364: goto 36b
      // 367: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36a: athrow
      // 36b: iinc 7 1
      // 36e: iload 4
      // 370: ifeq 309
      // 373: iinc 6 1
      // 376: iload 4
      // 378: ifeq 2f4
      // 37b: iload 10
      // 37d: istore 6
      // 37f: iload 6
      // 381: aload 31
      // 383: getfield yb6.dir I
      // 386: if_icmpge 3d0
      // 389: iload 10
      // 38b: bipush 1
      // 38c: iadd
      // 38d: iload 4
      // 38f: ifne 3d2
      // 392: istore 7
      // 394: iload 7
      // 396: aload 31
      // 398: getfield yb6.bg8 I
      // 39b: if_icmpge 3c8
      // 39e: aload 31
      // 3a0: getfield yb6.zk2 [[D
      // 3a3: iload 6
      // 3a5: aaload
      // 3a6: iload 7
      // 3a8: aload 28
      // 3aa: getfield yb6.zk2 [[D
      // 3ad: iload 6
      // 3af: aaload
      // 3b0: iload 7
      // 3b2: daload
      // 3b3: dastore
      // 3b4: iinc 7 1
      // 3b7: iload 4
      // 3b9: ifne 3cb
      // 3bc: iload 4
      // 3be: ifeq 394
      // 3c1: goto 3c8
      // 3c4: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c7: athrow
      // 3c8: iinc 6 1
      // 3cb: iload 4
      // 3cd: ifeq 37f
      // 3d0: iload 10
      // 3d2: istore 6
      // 3d4: iload 6
      // 3d6: aload 31
      // 3d8: getfield yb6.dir I
      // 3db: if_icmpge 457
      // 3de: bipush 0
      // 3df: iload 4
      // 3e1: ifne 459
      // 3e4: istore 7
      // 3e6: iload 7
      // 3e8: aload 31
      // 3ea: getfield yb6.bg8 I
      // 3ed: if_icmpge 44f
      // 3f0: aload 28
      // 3f2: getfield yb6.zk2 [[D
      // 3f5: iload 6
      // 3f7: aaload
      // 3f8: iload 7
      // 3fa: dconst_0
      // 3fb: dastore
      // 3fc: iload 10
      // 3fe: iload 4
      // 400: ifne 3d6
      // 403: istore 5
      // 405: iload 5
      // 407: aload 31
      // 409: getfield yb6.bg8 I
      // 40c: if_icmpge 447
      // 40f: aload 28
      // 411: getfield yb6.zk2 [[D
      // 414: iload 6
      // 416: aaload
      // 417: iload 7
      // 419: dup2
      // 41a: daload
      // 41b: aload 29
      // 41d: getfield yb6.zk2 [[D
      // 420: iload 6
      // 422: aaload
      // 423: iload 5
      // 425: daload
      // 426: aload 1
      // 427: getfield yb6.zk2 [[D
      // 42a: iload 5
      // 42c: aaload
      // 42d: iload 7
      // 42f: daload
      // 430: dmul
      // 431: dadd
      // 432: dastore
      // 433: iinc 5 1
      // 436: iload 4
      // 438: ifne 44a
      // 43b: iload 4
      // 43d: ifeq 405
      // 440: goto 447
      // 443: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 446: athrow
      // 447: iinc 7 1
      // 44a: iload 4
      // 44c: ifeq 3e6
      // 44f: iinc 6 1
      // 452: iload 4
      // 454: ifeq 3d4
      // 457: iload 10
      // 459: istore 6
      // 45b: iload 6
      // 45d: aload 31
      // 45f: getfield yb6.dir I
      // 462: if_icmpge 4a8
      // 465: bipush 0
      // 466: iload 4
      // 468: ifne 4ad
      // 46b: istore 7
      // 46d: iload 7
      // 46f: aload 31
      // 471: getfield yb6.bg8 I
      // 474: if_icmpge 4a0
      // 477: aload 1
      // 478: getfield yb6.zk2 [[D
      // 47b: iload 6
      // 47d: aaload
      // 47e: iload 7
      // 480: aload 28
      // 482: getfield yb6.zk2 [[D
      // 485: iload 6
      // 487: aaload
      // 488: iload 7
      // 48a: daload
      // 48b: dastore
      // 48c: iinc 7 1
      // 48f: iload 4
      // 491: ifne 4a3
      // 494: iload 4
      // 496: ifeq 46d
      // 499: goto 4a0
      // 49c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49f: athrow
      // 4a0: iinc 6 1
      // 4a3: iload 4
      // 4a5: ifeq 45b
      // 4a8: iinc 8 -1
      // 4ab: iload 9
      // 4ad: bipush 2
      // 4ae: if_icmple 874
      // 4b1: dconst_0
      // 4b2: dstore 19
      // 4b4: bipush 1
      // 4b5: istore 5
      // 4b7: iload 5
      // 4b9: iload 9
      // 4bb: if_icmpge 4f4
      // 4be: dload 19
      // 4c0: aload 31
      // 4c2: getfield yb6.zk2 [[D
      // 4c5: iload 10
      // 4c7: aaload
      // 4c8: iload 10
      // 4ca: iload 5
      // 4cc: iadd
      // 4cd: daload
      // 4ce: aload 31
      // 4d0: getfield yb6.zk2 [[D
      // 4d3: iload 10
      // 4d5: aaload
      // 4d6: iload 10
      // 4d8: iload 5
      // 4da: iadd
      // 4db: daload
      // 4dc: dmul
      // 4dd: dadd
      // 4de: dstore 19
      // 4e0: iinc 5 1
      // 4e3: iload 4
      // 4e5: ifne 4fb
      // 4e8: iload 4
      // 4ea: ifeq 4b7
      // 4ed: goto 4f4
      // 4f0: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f3: athrow
      // 4f4: dload 19
      // 4f6: invokestatic java/lang/Math.sqrt (D)D
      // 4f9: dstore 19
      // 4fb: aload 31
      // 4fd: getfield yb6.zk2 [[D
      // 500: iload 10
      // 502: aaload
      // 503: iload 10
      // 505: bipush 1
      // 506: iadd
      // 507: iload 4
      // 509: ifne 535
      // 50c: daload
      // 50d: dconst_0
      // 50e: dcmpl
      // 50f: ifne 52b
      // 512: goto 519
      // 515: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 518: athrow
      // 519: aload 32
      // 51b: bipush 0
      // 51c: dload 19
      // 51e: dastore
      // 51f: iload 4
      // 521: ifeq 556
      // 524: goto 52b
      // 527: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52a: athrow
      // 52b: aload 32
      // 52d: bipush 0
      // 52e: goto 535
      // 531: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 534: athrow
      // 535: aload 31
      // 537: getfield yb6.zk2 [[D
      // 53a: iload 10
      // 53c: aaload
      // 53d: iload 10
      // 53f: bipush 1
      // 540: iadd
      // 541: daload
      // 542: dload 19
      // 544: aload 31
      // 546: getfield yb6.zk2 [[D
      // 549: iload 10
      // 54b: aaload
      // 54c: iload 10
      // 54e: bipush 1
      // 54f: iadd
      // 550: daload
      // 551: invokestatic yb6.ikt (DD)D
      // 554: dadd
      // 555: dastore
      // 556: bipush 1
      // 557: istore 5
      // 559: iload 5
      // 55b: iload 9
      // 55d: bipush 1
      // 55e: isub
      // 55f: if_icmpge 58b
      // 562: aload 32
      // 564: iload 5
      // 566: aload 31
      // 568: getfield yb6.zk2 [[D
      // 56b: iload 10
      // 56d: aaload
      // 56e: iload 10
      // 570: iload 5
      // 572: iadd
      // 573: bipush 1
      // 574: iadd
      // 575: daload
      // 576: dastore
      // 577: iinc 5 1
      // 57a: iload 4
      // 57c: ifne 877
      // 57f: iload 4
      // 581: ifeq 559
      // 584: goto 58b
      // 587: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 58a: athrow
      // 58b: dconst_0
      // 58c: dstore 21
      // 58e: bipush 0
      // 58f: istore 5
      // 591: iload 5
      // 593: iload 9
      // 595: bipush 1
      // 596: isub
      // 597: if_icmpge 5be
      // 59a: dload 21
      // 59c: aload 32
      // 59e: iload 5
      // 5a0: daload
      // 5a1: aload 32
      // 5a3: iload 5
      // 5a5: daload
      // 5a6: dmul
      // 5a7: dadd
      // 5a8: dstore 21
      // 5aa: iinc 5 1
      // 5ad: iload 4
      // 5af: ifne 5c6
      // 5b2: iload 4
      // 5b4: ifeq 591
      // 5b7: goto 5be
      // 5ba: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5bd: athrow
      // 5be: ldc2_w 2.0
      // 5c1: dload 21
      // 5c3: ddiv
      // 5c4: dstore 21
      // 5c6: iload 10
      // 5c8: bipush 1
      // 5c9: iadd
      // 5ca: istore 6
      // 5cc: iload 6
      // 5ce: iload 9
      // 5d0: if_icmpge 628
      // 5d3: iload 10
      // 5d5: bipush 1
      // 5d6: iadd
      // 5d7: iload 4
      // 5d9: ifne 62c
      // 5dc: istore 7
      // 5de: iload 7
      // 5e0: aload 31
      // 5e2: getfield yb6.bg8 I
      // 5e5: if_icmpge 620
      // 5e8: aload 30
      // 5ea: getfield yb6.zk2 [[D
      // 5ed: iload 6
      // 5ef: aaload
      // 5f0: iload 7
      // 5f2: dload 21
      // 5f4: dneg
      // 5f5: aload 32
      // 5f7: iload 6
      // 5f9: iload 10
      // 5fb: isub
      // 5fc: bipush 1
      // 5fd: isub
      // 5fe: daload
      // 5ff: dmul
      // 600: aload 32
      // 602: iload 7
      // 604: iload 10
      // 606: isub
      // 607: bipush 1
      // 608: isub
      // 609: daload
      // 60a: dmul
      // 60b: dastore
      // 60c: iinc 7 1
      // 60f: iload 4
      // 611: ifne 623
      // 614: iload 4
      // 616: ifeq 5de
      // 619: goto 620
      // 61c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61f: athrow
      // 620: iinc 6 1
      // 623: iload 4
      // 625: ifeq 5cc
      // 628: iload 10
      // 62a: bipush 1
      // 62b: iadd
      // 62c: istore 5
      // 62e: iload 5
      // 630: aload 31
      // 632: getfield yb6.bg8 I
      // 635: if_icmpge 65b
      // 638: aload 30
      // 63a: getfield yb6.zk2 [[D
      // 63d: iload 5
      // 63f: aaload
      // 640: iload 5
      // 642: dup2
      // 643: daload
      // 644: dconst_1
      // 645: dadd
      // 646: dastore
      // 647: iinc 5 1
      // 64a: iload 4
      // 64c: ifne 877
      // 64f: iload 4
      // 651: ifeq 62e
      // 654: goto 65b
      // 657: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65a: athrow
      // 65b: dconst_0
      // 65c: dstore 23
      // 65e: iload 10
      // 660: istore 5
      // 662: iload 5
      // 664: aload 31
      // 666: getfield yb6.bg8 I
      // 669: if_icmpge 69e
      // 66c: dload 23
      // 66e: aload 30
      // 670: getfield yb6.zk2 [[D
      // 673: iload 5
      // 675: aaload
      // 676: iload 10
      // 678: bipush 1
      // 679: iadd
      // 67a: daload
      // 67b: aload 31
      // 67d: getfield yb6.zk2 [[D
      // 680: iload 10
      // 682: aaload
      // 683: iload 5
      // 685: daload
      // 686: dmul
      // 687: dadd
      // 688: dstore 23
      // 68a: iinc 5 1
      // 68d: iload 4
      // 68f: ifne 6ad
      // 692: iload 4
      // 694: ifeq 662
      // 697: goto 69e
      // 69a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69d: athrow
      // 69e: aload 31
      // 6a0: getfield yb6.zk2 [[D
      // 6a3: iload 10
      // 6a5: aaload
      // 6a6: iload 10
      // 6a8: bipush 1
      // 6a9: iadd
      // 6aa: dload 23
      // 6ac: dastore
      // 6ad: iload 10
      // 6af: bipush 1
      // 6b0: iadd
      // 6b1: istore 6
      // 6b3: iload 6
      // 6b5: aload 31
      // 6b7: getfield yb6.dir I
      // 6ba: if_icmpge 73c
      // 6bd: iload 10
      // 6bf: bipush 1
      // 6c0: iadd
      // 6c1: iload 4
      // 6c3: ifne 740
      // 6c6: istore 7
      // 6c8: iload 7
      // 6ca: aload 31
      // 6cc: getfield yb6.bg8 I
      // 6cf: if_icmpge 734
      // 6d2: aload 28
      // 6d4: getfield yb6.zk2 [[D
      // 6d7: iload 6
      // 6d9: aaload
      // 6da: iload 7
      // 6dc: dconst_0
      // 6dd: dastore
      // 6de: iload 10
      // 6e0: bipush 1
      // 6e1: iadd
      // 6e2: iload 4
      // 6e4: ifne 6b5
      // 6e7: istore 5
      // 6e9: iload 5
      // 6eb: aload 31
      // 6ed: getfield yb6.bg8 I
      // 6f0: if_icmpge 72c
      // 6f3: aload 28
      // 6f5: getfield yb6.zk2 [[D
      // 6f8: iload 6
      // 6fa: aaload
      // 6fb: iload 7
      // 6fd: dup2
      // 6fe: daload
      // 6ff: aload 30
      // 701: getfield yb6.zk2 [[D
      // 704: iload 5
      // 706: aaload
      // 707: iload 7
      // 709: daload
      // 70a: aload 31
      // 70c: getfield yb6.zk2 [[D
      // 70f: iload 6
      // 711: aaload
      // 712: iload 5
      // 714: daload
      // 715: dmul
      // 716: dadd
      // 717: dastore
      // 718: iinc 5 1
      // 71b: iload 4
      // 71d: ifne 72f
      // 720: iload 4
      // 722: ifeq 6e9
      // 725: goto 72c
      // 728: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 72b: athrow
      // 72c: iinc 7 1
      // 72f: iload 4
      // 731: ifeq 6c8
      // 734: iinc 6 1
      // 737: iload 4
      // 739: ifeq 6b3
      // 73c: iload 10
      // 73e: bipush 1
      // 73f: iadd
      // 740: istore 6
      // 742: iload 6
      // 744: aload 31
      // 746: getfield yb6.dir I
      // 749: if_icmpge 793
      // 74c: iload 10
      // 74e: bipush 1
      // 74f: iadd
      // 750: iload 4
      // 752: ifne 794
      // 755: istore 7
      // 757: iload 7
      // 759: aload 31
      // 75b: getfield yb6.bg8 I
      // 75e: if_icmpge 78b
      // 761: aload 31
      // 763: getfield yb6.zk2 [[D
      // 766: iload 6
      // 768: aaload
      // 769: iload 7
      // 76b: aload 28
      // 76d: getfield yb6.zk2 [[D
      // 770: iload 6
      // 772: aaload
      // 773: iload 7
      // 775: daload
      // 776: dastore
      // 777: iinc 7 1
      // 77a: iload 4
      // 77c: ifne 78e
      // 77f: iload 4
      // 781: ifeq 757
      // 784: goto 78b
      // 787: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78a: athrow
      // 78b: iinc 6 1
      // 78e: iload 4
      // 790: ifeq 742
      // 793: bipush 0
      // 794: istore 6
      // 796: iload 6
      // 798: aload 31
      // 79a: getfield yb6.dir I
      // 79d: if_icmpge 81e
      // 7a0: iload 10
      // 7a2: bipush 1
      // 7a3: iadd
      // 7a4: iload 4
      // 7a6: ifne 81f
      // 7a9: istore 7
      // 7ab: iload 7
      // 7ad: aload 31
      // 7af: getfield yb6.bg8 I
      // 7b2: if_icmpge 816
      // 7b5: aload 28
      // 7b7: getfield yb6.zk2 [[D
      // 7ba: iload 6
      // 7bc: aaload
      // 7bd: iload 7
      // 7bf: dconst_0
      // 7c0: dastore
      // 7c1: iload 10
      // 7c3: bipush 1
      // 7c4: iadd
      // 7c5: iload 4
      // 7c7: ifne 798
      // 7ca: istore 5
      // 7cc: iload 5
      // 7ce: aload 31
      // 7d0: getfield yb6.bg8 I
      // 7d3: if_icmpge 80e
      // 7d6: aload 28
      // 7d8: getfield yb6.zk2 [[D
      // 7db: iload 6
      // 7dd: aaload
      // 7de: iload 7
      // 7e0: dup2
      // 7e1: daload
      // 7e2: aload 30
      // 7e4: getfield yb6.zk2 [[D
      // 7e7: iload 5
      // 7e9: aaload
      // 7ea: iload 7
      // 7ec: daload
      // 7ed: aload 3
      // 7ee: getfield yb6.zk2 [[D
      // 7f1: iload 6
      // 7f3: aaload
      // 7f4: iload 5
      // 7f6: daload
      // 7f7: dmul
      // 7f8: dadd
      // 7f9: dastore
      // 7fa: iinc 5 1
      // 7fd: iload 4
      // 7ff: ifne 811
      // 802: iload 4
      // 804: ifeq 7cc
      // 807: goto 80e
      // 80a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80d: athrow
      // 80e: iinc 7 1
      // 811: iload 4
      // 813: ifeq 7ab
      // 816: iinc 6 1
      // 819: iload 4
      // 81b: ifeq 796
      // 81e: bipush 0
      // 81f: istore 6
      // 821: iload 6
      // 823: aload 31
      // 825: getfield yb6.dir I
      // 828: if_icmpge 871
      // 82b: iload 10
      // 82d: bipush 1
      // 82e: iadd
      // 82f: iload 4
      // 831: ifne 0e8
      // 834: istore 7
      // 836: iload 7
      // 838: aload 31
      // 83a: getfield yb6.bg8 I
      // 83d: if_icmpge 869
      // 840: aload 3
      // 841: getfield yb6.zk2 [[D
      // 844: iload 6
      // 846: aaload
      // 847: iload 7
      // 849: aload 28
      // 84b: getfield yb6.zk2 [[D
      // 84e: iload 6
      // 850: aaload
      // 851: iload 7
      // 853: daload
      // 854: dastore
      // 855: iinc 7 1
      // 858: iload 4
      // 85a: ifne 86c
      // 85d: iload 4
      // 85f: ifeq 836
      // 862: goto 869
      // 865: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 868: athrow
      // 869: iinc 6 1
      // 86c: iload 4
      // 86e: ifeq 821
      // 871: iinc 9 -1
      // 874: iinc 10 1
      // 877: iload 4
      // 879: ifeq 0e6
      // 87c: bipush 0
      // 87d: istore 5
      // 87f: iload 5
      // 881: iload 26
      // 883: if_icmpge 8aa
      // 886: aload 33
      // 888: iload 5
      // 88a: aload 31
      // 88c: getfield yb6.zk2 [[D
      // 88f: iload 5
      // 891: aaload
      // 892: iload 5
      // 894: daload
      // 895: dastore
      // 896: iinc 5 1
      // 899: iload 4
      // 89b: ifne 8ad
      // 89e: iload 4
      // 8a0: ifeq 87f
      // 8a3: goto 8aa
      // 8a6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a9: athrow
      // 8aa: bipush 0
      // 8ab: istore 5
      // 8ad: iload 5
      // 8af: iload 25
      // 8b1: if_icmpge 8e1
      // 8b4: aload 34
      // 8b6: iload 5
      // 8b8: aload 31
      // 8ba: getfield yb6.zk2 [[D
      // 8bd: iload 5
      // 8bf: aaload
      // 8c0: iload 5
      // 8c2: bipush 1
      // 8c3: iadd
      // 8c4: daload
      // 8c5: dastore
      // 8c6: iinc 5 1
      // 8c9: iload 4
      // 8cb: ifne 969
      // 8ce: goto 8d5
      // 8d1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d4: athrow
      // 8d5: iload 4
      // 8d7: ifeq 8ad
      // 8da: goto 8e1
      // 8dd: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8e0: athrow
      // 8e1: aload 31
      // 8e3: getfield yb6.dir I
      // 8e6: bipush 2
      // 8e7: iload 4
      // 8e9: ifne 95b
      // 8ec: if_icmpne 955
      // 8ef: goto 8f6
      // 8f2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8f5: athrow
      // 8f6: aload 31
      // 8f8: getfield yb6.bg8 I
      // 8fb: bipush 2
      // 8fc: iload 4
      // 8fe: ifne 95b
      // 901: goto 908
      // 904: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 907: athrow
      // 908: if_icmpne 955
      // 90b: goto 912
      // 90e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 911: athrow
      // 912: bipush 1
      // 913: newarray 7
      // 915: astore 35
      // 917: bipush 1
      // 918: newarray 7
      // 91a: astore 36
      // 91c: bipush 1
      // 91d: newarray 7
      // 91f: astore 37
      // 921: bipush 1
      // 922: newarray 7
      // 924: astore 38
      // 926: aload 33
      // 928: bipush 0
      // 929: daload
      // 92a: aload 34
      // 92c: bipush 0
      // 92d: daload
      // 92e: aload 33
      // 930: bipush 1
      // 931: daload
      // 932: aload 33
      // 934: aload 37
      // 936: aload 35
      // 938: aload 38
      // 93a: aload 36
      // 93c: bipush 0
      // 93d: invokestatic yb6.g6z (DDD[D[D[D[D[DI)I
      // 940: pop
      // 941: bipush 0
      // 942: aload 1
      // 943: aload 35
      // 945: aload 37
      // 947: invokestatic yb6.lyq (ILyb6;[D[D)V
      // 94a: bipush 0
      // 94b: aload 3
      // 94c: aload 36
      // 94e: aload 38
      // 950: invokestatic yb6.cst (ILyb6;[D[D)V
      // 953: bipush 2
      // 954: ireturn
      // 955: bipush 0
      // 956: aload 34
      // 958: arraylength
      // 959: bipush 1
      // 95a: isub
      // 95b: aload 33
      // 95d: aload 34
      // 95f: aload 1
      // 960: aload 3
      // 961: invokestatic yb6.b84 (II[D[DLyb6;Lyb6;)V
      // 964: aload 33
      // 966: arraylength
      // 967: istore 12
      // 969: iload 12
      // 96b: ireturn
   }

   public static void b84(int param0, int param1, double[] param2, double[] param3, yb6 param4, yb6 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: newarray 7
      // 003: astore 25
      // 005: bipush 1
      // 006: newarray 7
      // 008: astore 26
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: bipush 1
      // 00e: newarray 7
      // 010: astore 27
      // 012: bipush 1
      // 013: newarray 7
      // 015: astore 28
      // 017: new yb6
      // 01a: dup
      // 01b: aload 4
      // 01d: getfield yb6.bg8 I
      // 020: aload 5
      // 022: getfield yb6.dir I
      // 025: invokespecial yb6.<init> (II)V
      // 028: astore 29
      // 02a: bipush 2
      // 02b: istore 30
      // 02d: ldc2_w 4.89E-15
      // 030: dstore 31
      // 032: dconst_1
      // 033: dstore 33
      // 035: ldc2_w -1.0
      // 038: dstore 35
      // 03a: bipush 0
      // 03b: istore 12
      // 03d: dconst_0
      // 03e: dstore 21
      // 040: istore 6
      // 042: dconst_0
      // 043: dstore 23
      // 045: bipush 0
      // 046: istore 9
      // 048: iload 9
      // 04a: bipush 2
      // 04b: if_icmpge 366
      // 04e: iload 12
      // 050: iload 6
      // 052: ifeq 370
      // 055: iload 6
      // 057: ifeq 370
      // 05a: goto 061
      // 05d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: ifne 366
      // 064: goto 06b
      // 067: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06a: athrow
      // 06b: iload 0
      // 06c: istore 7
      // 06e: iload 7
      // 070: iload 1
      // 071: if_icmpgt 201
      // 074: iload 7
      // 076: iload 0
      // 077: iload 6
      // 079: ifeq 205
      // 07c: iload 6
      // 07e: ifeq 09d
      // 081: goto 088
      // 084: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: if_icmpne 0f6
      // 08b: goto 092
      // 08e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 091: athrow
      // 092: aload 3
      // 093: arraylength
      // 094: aload 2
      // 095: arraylength
      // 096: goto 09d
      // 099: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: iload 6
      // 09f: ifeq 0bd
      // 0a2: if_icmpne 0b4
      // 0a5: goto 0ac
      // 0a8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ab: athrow
      // 0ac: iload 1
      // 0ad: istore 11
      // 0af: iload 6
      // 0b1: ifne 0c0
      // 0b4: iload 1
      // 0b5: bipush 1
      // 0b6: goto 0bd
      // 0b9: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bc: athrow
      // 0bd: iadd
      // 0be: istore 11
      // 0c0: aload 2
      // 0c1: iload 11
      // 0c3: bipush 1
      // 0c4: isub
      // 0c5: daload
      // 0c6: aload 3
      // 0c7: iload 1
      // 0c8: daload
      // 0c9: aload 2
      // 0ca: iload 11
      // 0cc: daload
      // 0cd: invokestatic yb6.k0n (DDD)D
      // 0d0: dstore 13
      // 0d2: aload 2
      // 0d3: iload 7
      // 0d5: daload
      // 0d6: invokestatic java/lang/Math.abs (D)D
      // 0d9: dload 13
      // 0db: dsub
      // 0dc: dload 33
      // 0de: aload 2
      // 0df: iload 7
      // 0e1: daload
      // 0e2: invokestatic yb6.ikt (DD)D
      // 0e5: dload 13
      // 0e7: aload 2
      // 0e8: iload 7
      // 0ea: daload
      // 0eb: ddiv
      // 0ec: dadd
      // 0ed: dmul
      // 0ee: dstore 21
      // 0f0: aload 3
      // 0f1: iload 7
      // 0f3: daload
      // 0f4: dstore 23
      // 0f6: dload 21
      // 0f8: dload 23
      // 0fa: aload 28
      // 0fc: aload 26
      // 0fe: invokestatic yb6.e3a (DD[D[D)D
      // 101: dstore 15
      // 103: iload 7
      // 105: iload 0
      // 106: iload 6
      // 108: ifeq 1cd
      // 10b: if_icmpeq 124
      // 10e: goto 115
      // 111: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: aload 3
      // 116: iload 7
      // 118: bipush 1
      // 119: isub
      // 11a: dload 15
      // 11c: dastore
      // 11d: goto 124
      // 120: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 123: athrow
      // 124: aload 26
      // 126: bipush 0
      // 127: daload
      // 128: aload 2
      // 129: iload 7
      // 12b: daload
      // 12c: dmul
      // 12d: aload 28
      // 12f: bipush 0
      // 130: daload
      // 131: aload 3
      // 132: iload 7
      // 134: daload
      // 135: dmul
      // 136: dadd
      // 137: dstore 21
      // 139: aload 3
      // 13a: iload 7
      // 13c: aload 26
      // 13e: bipush 0
      // 13f: daload
      // 140: aload 3
      // 141: iload 7
      // 143: daload
      // 144: dmul
      // 145: aload 28
      // 147: bipush 0
      // 148: daload
      // 149: aload 2
      // 14a: iload 7
      // 14c: daload
      // 14d: dmul
      // 14e: dsub
      // 14f: dastore
      // 150: aload 28
      // 152: bipush 0
      // 153: daload
      // 154: aload 2
      // 155: iload 7
      // 157: bipush 1
      // 158: iadd
      // 159: daload
      // 15a: dmul
      // 15b: dstore 23
      // 15d: aload 2
      // 15e: iload 7
      // 160: bipush 1
      // 161: iadd
      // 162: aload 26
      // 164: bipush 0
      // 165: daload
      // 166: aload 2
      // 167: iload 7
      // 169: bipush 1
      // 16a: iadd
      // 16b: daload
      // 16c: dmul
      // 16d: dastore
      // 16e: iload 7
      // 170: aload 5
      // 172: aload 26
      // 174: aload 28
      // 176: invokestatic yb6.cst (ILyb6;[D[D)V
      // 179: dload 21
      // 17b: dload 23
      // 17d: aload 27
      // 17f: aload 25
      // 181: invokestatic yb6.e3a (DD[D[D)D
      // 184: dstore 15
      // 186: aload 2
      // 187: iload 7
      // 189: dload 15
      // 18b: dastore
      // 18c: aload 25
      // 18e: bipush 0
      // 18f: daload
      // 190: aload 3
      // 191: iload 7
      // 193: daload
      // 194: dmul
      // 195: aload 27
      // 197: bipush 0
      // 198: daload
      // 199: aload 2
      // 19a: iload 7
      // 19c: bipush 1
      // 19d: iadd
      // 19e: daload
      // 19f: dmul
      // 1a0: dadd
      // 1a1: dstore 21
      // 1a3: aload 2
      // 1a4: iload 7
      // 1a6: bipush 1
      // 1a7: iadd
      // 1a8: aload 25
      // 1aa: bipush 0
      // 1ab: daload
      // 1ac: aload 2
      // 1ad: iload 7
      // 1af: bipush 1
      // 1b0: iadd
      // 1b1: daload
      // 1b2: dmul
      // 1b3: aload 27
      // 1b5: bipush 0
      // 1b6: daload
      // 1b7: aload 3
      // 1b8: iload 7
      // 1ba: daload
      // 1bb: dmul
      // 1bc: dsub
      // 1bd: dastore
      // 1be: iload 7
      // 1c0: iload 6
      // 1c2: ifeq 1f0
      // 1c5: iload 1
      // 1c6: goto 1cd
      // 1c9: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cc: athrow
      // 1cd: if_icmpge 1ee
      // 1d0: aload 27
      // 1d2: bipush 0
      // 1d3: daload
      // 1d4: aload 3
      // 1d5: iload 7
      // 1d7: bipush 1
      // 1d8: iadd
      // 1d9: daload
      // 1da: dmul
      // 1db: dstore 23
      // 1dd: aload 3
      // 1de: iload 7
      // 1e0: bipush 1
      // 1e1: iadd
      // 1e2: aload 25
      // 1e4: bipush 0
      // 1e5: daload
      // 1e6: aload 3
      // 1e7: iload 7
      // 1e9: bipush 1
      // 1ea: iadd
      // 1eb: daload
      // 1ec: dmul
      // 1ed: dastore
      // 1ee: iload 7
      // 1f0: aload 4
      // 1f2: aload 25
      // 1f4: aload 27
      // 1f6: invokestatic yb6.lyq (ILyb6;[D[D)V
      // 1f9: iinc 7 1
      // 1fc: iload 6
      // 1fe: ifne 06e
      // 201: aload 2
      // 202: arraylength
      // 203: aload 3
      // 204: arraylength
      // 205: iload 6
      // 207: ifeq 26d
      // 20a: if_icmpne 269
      // 20d: goto 214
      // 210: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 213: athrow
      // 214: dload 21
      // 216: dload 23
      // 218: aload 28
      // 21a: aload 26
      // 21c: invokestatic yb6.e3a (DD[D[D)D
      // 21f: dstore 15
      // 221: aload 26
      // 223: bipush 0
      // 224: daload
      // 225: aload 2
      // 226: iload 7
      // 228: daload
      // 229: dmul
      // 22a: aload 28
      // 22c: bipush 0
      // 22d: daload
      // 22e: aload 3
      // 22f: iload 7
      // 231: daload
      // 232: dmul
      // 233: dadd
      // 234: dstore 21
      // 236: aload 3
      // 237: iload 7
      // 239: aload 26
      // 23b: bipush 0
      // 23c: daload
      // 23d: aload 3
      // 23e: iload 7
      // 240: daload
      // 241: dmul
      // 242: aload 28
      // 244: bipush 0
      // 245: daload
      // 246: aload 2
      // 247: iload 7
      // 249: daload
      // 24a: dmul
      // 24b: dsub
      // 24c: dastore
      // 24d: aload 2
      // 24e: iload 7
      // 250: bipush 1
      // 251: iadd
      // 252: aload 26
      // 254: bipush 0
      // 255: daload
      // 256: aload 2
      // 257: iload 7
      // 259: bipush 1
      // 25a: iadd
      // 25b: daload
      // 25c: dmul
      // 25d: dastore
      // 25e: iload 7
      // 260: aload 5
      // 262: aload 26
      // 264: aload 28
      // 266: invokestatic yb6.cst (ILyb6;[D[D)V
      // 269: iload 1
      // 26a: iload 0
      // 26b: isub
      // 26c: bipush 1
      // 26d: if_icmple 2ab
      // 270: aload 3
      // 271: iload 1
      // 272: daload
      // 273: invokestatic java/lang/Math.abs (D)D
      // 276: ldc2_w 4.89E-15
      // 279: dcmpg
      // 27a: iload 6
      // 27c: ifeq 2ae
      // 27f: goto 286
      // 282: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 285: athrow
      // 286: iload 6
      // 288: ifeq 2ae
      // 28b: goto 292
      // 28e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 291: athrow
      // 292: ifge 2ab
      // 295: goto 29c
      // 298: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29b: athrow
      // 29c: iinc 1 -1
      // 29f: iload 6
      // 2a1: ifne 269
      // 2a4: goto 2ab
      // 2a7: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: iload 1
      // 2ac: bipush 2
      // 2ad: isub
      // 2ae: istore 10
      // 2b0: iload 10
      // 2b2: iload 0
      // 2b3: if_icmple 326
      // 2b6: aload 3
      // 2b7: iload 10
      // 2b9: daload
      // 2ba: invokestatic java/lang/Math.abs (D)D
      // 2bd: ldc2_w 4.89E-15
      // 2c0: dcmpg
      // 2c1: iload 6
      // 2c3: ifeq 329
      // 2c6: iload 6
      // 2c8: ifeq 2f5
      // 2cb: goto 2d2
      // 2ce: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d1: athrow
      // 2d2: ifge 31e
      // 2d5: goto 2dc
      // 2d8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2db: athrow
      // 2dc: iload 10
      // 2de: bipush 1
      // 2df: iadd
      // 2e0: iload 1
      // 2e1: aload 2
      // 2e2: aload 3
      // 2e3: aload 4
      // 2e5: aload 5
      // 2e7: invokestatic yb6.b84 (II[D[DLyb6;Lyb6;)V
      // 2ea: iload 10
      // 2ec: bipush 1
      // 2ed: isub
      // 2ee: goto 2f5
      // 2f1: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f4: athrow
      // 2f5: istore 1
      // 2f6: iload 1
      // 2f7: iload 0
      // 2f8: isub
      // 2f9: bipush 1
      // 2fa: if_icmple 31e
      // 2fd: aload 3
      // 2fe: iload 1
      // 2ff: daload
      // 300: invokestatic java/lang/Math.abs (D)D
      // 303: ldc2_w 4.89E-15
      // 306: dcmpg
      // 307: iload 6
      // 309: ifeq 2b2
      // 30c: ifge 31e
      // 30f: iinc 1 -1
      // 312: iload 6
      // 314: ifne 2f6
      // 317: goto 31e
      // 31a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31d: athrow
      // 31e: iinc 10 -1
      // 321: iload 6
      // 323: ifne 2b0
      // 326: iload 1
      // 327: iload 0
      // 328: isub
      // 329: iload 6
      // 32b: ifeq 34c
      // 32e: bipush 1
      // 32f: if_icmpgt 35e
      // 332: goto 339
      // 335: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 338: athrow
      // 339: aload 3
      // 33a: iload 0
      // 33b: bipush 1
      // 33c: iadd
      // 33d: daload
      // 33e: invokestatic java/lang/Math.abs (D)D
      // 341: ldc2_w 4.89E-15
      // 344: dcmpg
      // 345: goto 34c
      // 348: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34b: athrow
      // 34c: iload 6
      // 34e: ifeq 35c
      // 351: ifge 35e
      // 354: goto 35b
      // 357: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35a: athrow
      // 35b: bipush 1
      // 35c: istore 12
      // 35e: iinc 9 1
      // 361: iload 6
      // 363: ifne 048
      // 366: aload 3
      // 367: bipush 1
      // 368: daload
      // 369: invokestatic java/lang/Math.abs (D)D
      // 36c: ldc2_w 4.89E-15
      // 36f: dcmpg
      // 370: iload 6
      // 372: ifeq 3aa
      // 375: ifge 3a9
      // 378: goto 37f
      // 37b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37e: athrow
      // 37f: aload 2
      // 380: iload 0
      // 381: daload
      // 382: aload 3
      // 383: iload 0
      // 384: daload
      // 385: aload 2
      // 386: iload 0
      // 387: bipush 1
      // 388: iadd
      // 389: daload
      // 38a: aload 2
      // 38b: aload 27
      // 38d: aload 25
      // 38f: aload 28
      // 391: aload 26
      // 393: bipush 0
      // 394: invokestatic yb6.g6z (DDD[D[D[D[D[DI)I
      // 397: pop
      // 398: aload 3
      // 399: iload 0
      // 39a: dconst_0
      // 39b: dastore
      // 39c: aload 3
      // 39d: iload 0
      // 39e: bipush 1
      // 39f: iadd
      // 3a0: dconst_0
      // 3a1: dastore
      // 3a2: goto 3a9
      // 3a5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a8: athrow
      // 3a9: iload 0
      // 3aa: istore 7
      // 3ac: iload 7
      // 3ae: aload 4
      // 3b0: aload 25
      // 3b2: aload 27
      // 3b4: invokestatic yb6.lyq (ILyb6;[D[D)V
      // 3b7: iload 7
      // 3b9: aload 5
      // 3bb: aload 26
      // 3bd: aload 28
      // 3bf: invokestatic yb6.cst (ILyb6;[D[D)V
      // 3c2: return
   }

   private static void ki7(double[] var0, double[] var1) {
      long var2 = a ^ 21180379262297L;
      System.out.println(a<"r">(1107, 9028717624480565602L ^ var2) + var0[0] + " " + var0[1] + " " + var0[2]);
      System.out.println(a<"r">(25485, 7715286253170519688L ^ var2) + var1[0] + " " + var1[1]);
   }

   private static void cst(int var0, yb6 var1, double[] var2, double[] var3) {
      int var4 = OpaquePredicate.b();
      int var5 = 0;

      while (var5 < var1.dir) {
         double var6 = var1.zk2[var5][var0];
         var1.zk2[var5][var0] = var2[0] * var6 + var3[0] * var1.zk2[var5][var0 + 1];
         var1.zk2[var5][var0 + 1] = -var3[0] * var6 + var2[0] * var1.zk2[var5][var0 + 1];
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   private static void cov(double[] var0, double[] var1, int var2, yb6 var3) {
      double[] var11 = new double[1];
      double[] var12 = new double[1];
      yb6 var14 = new yb6(var3.dir, var3.bg8);
      int var10000 = OpaquePredicate.b();
      yb6 var15 = new yb6(var3.dir, var3.bg8);
      int var4 = var10000;
      double var5 = var1[var2];
      double var7 = var0[var2];
      int var13 = var2;

      while (true) {
         if (var13 > 0) {
            double var9 = e3a(var5, var7, var12, var11);
            var5 = -var1[var13 - 1] * var12[0];
            var7 = var0[var13 - 1];

            try {
               var0[var13] = var9;
               var1[var13 - 1] = var1[var13 - 1] * var11[0];
               ot8(var13, var2 + 1, var3, var11, var12, var14, var15);
               var13--;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (vam var16) {
               throw a(var16);
            }
         }

         var0[var13 + 1] = e3a(var5, var7, var12, var11);
         ot8(var13, var2 + 1, var3, var11, var12, var14, var15);
         break;
      }
   }

   private static void n5w(double[] var0, double[] var1, int var2, yb6 var3) {
      double[] var11 = new double[1];
      int var10000 = OpaquePredicate.b();
      double[] var12 = new double[1];
      yb6 var14 = new yb6(var3.dir, var3.bg8);
      int var4 = var10000;
      yb6 var15 = new yb6(var3.dir, var3.bg8);
      double var7 = var1[var2];
      double var5 = var0[var2 + 1];
      int var13 = var2;

      while (true) {
         if (var13 < var3.bg8 - 2) {
            double var9 = e3a(var5, var7, var12, var11);
            var7 = -var1[var13 + 1] * var12[0];
            var5 = var0[var13 + 2];

            try {
               var0[var13 + 1] = var9;
               var1[var13 + 1] = var1[var13 + 1] * var11[0];
               xid(var2, var13 + 1, var3, var11, var12, var14, var15);
               var13++;
               if (var4 == 0) {
                  break;
               }

               if (var4 != 0) {
                  continue;
               }
            } catch (vam var16) {
               throw a(var16);
            }
         }

         var0[var13 + 1] = e3a(var5, var7, var12, var11);
         xid(var2, var13 + 1, var3, var11, var12, var14, var15);
         break;
      }
   }

   private static void ot8(int var0, int var1, yb6 var2, double[] var3, double[] var4, yb6 var5, yb6 var6) {
      long var7 = a ^ 115516883618058L;
      int var9 = OpaquePredicate.b();
      int var10 = 0;

      while (true) {
         if (var10 < var2.dir) {
            double var11 = var2.zk2[var10][var0];

            try {
               var2.zk2[var10][var0] = var3[0] * var11 - var4[0] * var2.zk2[var10][var1];
               var2.zk2[var10][var1] = var4[0] * var11 + var3[0] * var2.zk2[var10][var1];
               var10++;
               if (var9 == 0) {
                  break;
               }

               if (var9 != 0) {
                  continue;
               }
            } catch (vam var13) {
               throw a(var13);
            }
         }

         System.out.println(a<"r">(25996, 758074030315654371L ^ var7) + var0);
         System.out.println(a<"r">(23496, 6665407317594665619L ^ var7) + var1);
         System.out.println(a<"r">(7433, 5351008418898162778L ^ var7) + var3[0]);
         System.out.println(a<"r">(12494, 4133837166211668377L ^ var7) + var4[0]);
         System.out.println(a<"r">(5147, 1145383647853395270L ^ var7));
         fyb(var6);
         System.out.println(a<"r">(29907, 933195395525434803L ^ var7));
         fyb(var5);
         var6.h5m(var6, var5);
         System.out.println(a<"r">(3762, 1099369142368643019L ^ var7));
         fyb(var6);
         break;
      }
   }

   private static void xid(int var0, int var1, yb6 var2, double[] var3, double[] var4, yb6 var5, yb6 var6) {
      long var7 = a ^ 17064624733017L;
      int var9 = OpaquePredicate.b();
      int var10 = 0;

      while (true) {
         if (var10 < var2.bg8) {
            double var11 = var2.zk2[var0][var10];

            try {
               var2.zk2[var0][var10] = var3[0] * var11 - var4[0] * var2.zk2[var1][var10];
               var2.zk2[var1][var10] = var4[0] * var11 + var3[0] * var2.zk2[var1][var10];
               var10++;
               if (var9 == 0) {
                  break;
               }

               if (var9 != 0) {
                  continue;
               }
            } catch (vam var13) {
               throw a(var13);
            }
         }

         System.out.println(a<"r">(17995, 9040798788252310865L ^ var7));
         fyb(var6);
         System.out.println(a<"r">(14729, 1806275908921746052L ^ var7));
         fyb(var5);
         var6.h5m(var5, var6);
         System.out.println(a<"r">(13839, 6521211600895962381L ^ var7));
         fyb(var6);
         break;
      }
   }

   private static void lyq(int var0, yb6 var1, double[] var2, double[] var3) {
      int var4 = OpaquePredicate.b();
      int var5 = 0;

      while (var5 < var1.bg8) {
         double var6 = var1.zk2[var0][var5];
         var1.zk2[var0][var5] = var2[0] * var6 + var3[0] * var1.zk2[var0 + 1][var5];
         var1.zk2[var0 + 1][var5] = -var3[0] * var6 + var2[0] * var1.zk2[var0 + 1][var5];
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   private static void mbp(yb6 var0, yb6 var1, yb6 var2) {
      long var3 = a ^ 52972670842888L;
      yb6 var5 = new yb6(var0.bg8, var0.dir);
      var5.h5m(var1, var5);
      var5.h5m(var5, var2);
      System.out.println(a<"r">(22861, 2305982161349296443L ^ var3) + q00(var5));
   }

   private static String q00(yb6 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yb6.a J
      // 03: ldc2_w 19117183574647
      // 06: lxor
      // 07: lstore 1
      // 08: new java/lang/StringBuffer
      // 0b: dup
      // 0c: aload 0
      // 0d: getfield yb6.dir I
      // 10: aload 0
      // 11: getfield yb6.bg8 I
      // 14: imul
      // 15: bipush 8
      // 17: imul
      // 18: invokespecial java/lang/StringBuffer.<init> (I)V
      // 1b: astore 4
      // 1d: invokestatic OpaquePredicate.c ()I
      // 20: bipush 0
      // 21: istore 5
      // 23: istore 3
      // 24: iload 5
      // 26: aload 0
      // 27: getfield yb6.dir I
      // 2a: if_icmpge a4
      // 2d: bipush 0
      // 2e: istore 6
      // 30: iload 6
      // 32: aload 0
      // 33: getfield yb6.bg8 I
      // 36: if_icmpge 94
      // 39: aload 0
      // 3a: getfield yb6.zk2 [[D
      // 3d: iload 5
      // 3f: aaload
      // 40: iload 6
      // 42: daload
      // 43: invokestatic java/lang/Math.abs (D)D
      // 46: ldc2_w 1.0E-9
      // 49: dcmpg
      // 4a: iload 3
      // 4b: ifne 26
      // 4e: ifge 70
      // 51: aload 4
      // 53: sipush 26608
      // 56: ldc2_w 1245389403421058556
      // 59: lload 1
      // 5a: lxor
      // 5b: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 64: pop
      // 65: iload 3
      // 66: ifeq 8d
      // 69: goto 70
      // 6c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f: athrow
      // 70: aload 4
      // 72: aload 0
      // 73: getfield yb6.zk2 [[D
      // 76: iload 5
      // 78: aaload
      // 79: iload 6
      // 7b: daload
      // 7c: invokevirtual java/lang/StringBuffer.append (D)Ljava/lang/StringBuffer;
      // 7f: ldc " "
      // 81: nop
      // 82: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 85: pop
      // 86: goto 8d
      // 89: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8c: athrow
      // 8d: iinc 6 1
      // 90: iload 3
      // 91: ifeq 30
      // 94: aload 4
      // 96: ldc "\n"
      // 98: nop
      // 99: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 9c: pop
      // 9d: iinc 5 1
      // a0: iload 3
      // a1: ifeq 24
      // a4: aload 4
      // a6: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // a9: areturn
   }

   private static void hj4(double[] param0, double[] param1, yb6 param2, yb6 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yb6.a J
      // 003: ldc2_w 76208934778212
      // 006: lxor
      // 007: lstore 4
      // 009: new yb6
      // 00c: dup
      // 00d: aload 2
      // 00e: getfield yb6.bg8 I
      // 011: aload 3
      // 012: getfield yb6.dir I
      // 015: invokespecial yb6.<init> (II)V
      // 018: astore 8
      // 01a: invokestatic OpaquePredicate.b ()I
      // 01d: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 020: sipush 19999
      // 023: ldc2_w 3557188005926132509
      // 026: lload 4
      // 028: lxor
      // 029: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: nop
      // 02f: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 032: istore 6
      // 034: bipush 0
      // 035: istore 7
      // 037: iload 7
      // 039: aload 0
      // 03a: arraylength
      // 03b: if_icmpge 06f
      // 03e: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 041: new java/lang/StringBuilder
      // 044: dup
      // 045: invokespecial java/lang/StringBuilder.<init> ()V
      // 048: ldc " "
      // 04a: nop
      // 04b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04e: aload 0
      // 04f: iload 7
      // 051: daload
      // 052: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 055: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 058: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 05b: iinc 7 1
      // 05e: iload 6
      // 060: ifeq 084
      // 063: iload 6
      // 065: ifne 037
      // 068: goto 06f
      // 06b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06e: athrow
      // 06f: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 072: sipush 28762
      // 075: ldc2_w 6968772035749078346
      // 078: lload 4
      // 07a: lxor
      // 07b: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: nop
      // 081: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 084: bipush 0
      // 085: istore 7
      // 087: iload 7
      // 089: aload 1
      // 08a: arraylength
      // 08b: if_icmpge 0bf
      // 08e: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 091: new java/lang/StringBuilder
      // 094: dup
      // 095: invokespecial java/lang/StringBuilder.<init> ()V
      // 098: ldc " "
      // 09a: nop
      // 09b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09e: aload 1
      // 09f: iload 7
      // 0a1: daload
      // 0a2: invokevirtual java/lang/StringBuilder.append (D)Ljava/lang/StringBuilder;
      // 0a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a8: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0ab: iinc 7 1
      // 0ae: iload 6
      // 0b0: ifeq 116
      // 0b3: iload 6
      // 0b5: ifne 087
      // 0b8: goto 0bf
      // 0bb: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0c2: new java/lang/StringBuilder
      // 0c5: dup
      // 0c6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c9: sipush 22126
      // 0cc: ldc2_w 206805453484311396
      // 0cf: lload 4
      // 0d1: lxor
      // 0d2: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: nop
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: aload 2
      // 0dc: invokevirtual yb6.toString ()Ljava/lang/String;
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e5: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 0e8: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0eb: new java/lang/StringBuilder
      // 0ee: dup
      // 0ef: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f2: sipush 4296
      // 0f5: ldc2_w 51152648944584179
      // 0f8: lload 4
      // 0fa: lxor
      // 0fb: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: nop
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: aload 3
      // 105: invokevirtual yb6.toString ()Ljava/lang/String;
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10e: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 111: aload 8
      // 113: invokevirtual yb6.rtk ()V
      // 116: bipush 0
      // 117: istore 7
      // 119: iload 7
      // 11b: aload 0
      // 11c: arraylength
      // 11d: if_icmpge 143
      // 120: aload 8
      // 122: getfield yb6.zk2 [[D
      // 125: iload 7
      // 127: aaload
      // 128: iload 7
      // 12a: aload 0
      // 12b: iload 7
      // 12d: daload
      // 12e: dastore
      // 12f: iinc 7 1
      // 132: iload 6
      // 134: ifeq 146
      // 137: iload 6
      // 139: ifne 119
      // 13c: goto 143
      // 13f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: bipush 0
      // 144: istore 7
      // 146: iload 7
      // 148: aload 1
      // 149: arraylength
      // 14a: if_icmpge 179
      // 14d: aload 8
      // 14f: getfield yb6.zk2 [[D
      // 152: iload 7
      // 154: aaload
      // 155: iload 7
      // 157: bipush 1
      // 158: iadd
      // 159: aload 1
      // 15a: iload 7
      // 15c: daload
      // 15d: dastore
      // 15e: iinc 7 1
      // 161: iload 6
      // 163: ifeq 1dd
      // 166: goto 16d
      // 169: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16c: athrow
      // 16d: iload 6
      // 16f: ifne 146
      // 172: goto 179
      // 175: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 178: athrow
      // 179: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 17c: new java/lang/StringBuilder
      // 17f: dup
      // 180: invokespecial java/lang/StringBuilder.<init> ()V
      // 183: sipush 9586
      // 186: ldc2_w 5095014499124228212
      // 189: lload 4
      // 18b: lxor
      // 18c: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: nop
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 195: aload 8
      // 197: invokevirtual yb6.toString ()Ljava/lang/String;
      // 19a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a0: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1a3: aload 8
      // 1a5: aload 2
      // 1a6: aload 8
      // 1a8: invokevirtual yb6.wao (Lyb6;Lyb6;)V
      // 1ab: aload 8
      // 1ad: aload 8
      // 1af: aload 3
      // 1b0: invokevirtual yb6.oir (Lyb6;Lyb6;)V
      // 1b3: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 1b6: new java/lang/StringBuilder
      // 1b9: dup
      // 1ba: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bd: sipush 7530
      // 1c0: ldc2_w 9023525960838219889
      // 1c3: lload 4
      // 1c5: lxor
      // 1c6: invokedynamic r (IJ)Ljava/lang/String; bsm=yb6.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: nop
      // 1cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cf: aload 8
      // 1d1: invokevirtual yb6.toString ()Ljava/lang/String;
      // 1d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1da: invokevirtual java/io/PrintStream.println (Ljava/lang/String;)V
      // 1dd: return
   }

   public static double r2t(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifeq 1e
      // 0b: dload 2
      // 0c: dcmpl
      // 0d: ifle 1d
      // 10: goto 17
      // 13: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: dload 0
      // 18: dreturn
      // 19: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: dload 2
      // 1e: dreturn
   }

   public static double azu(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifne 1e
      // 0b: dload 2
      // 0c: dcmpg
      // 0d: ifge 1d
      // 10: goto 17
      // 13: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: dload 0
      // 18: dreturn
      // 19: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: dload 2
      // 1e: dreturn
   }

   public static double k0n(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dload 0
      // 001: invokestatic java/lang/Math.abs (D)D
      // 004: dstore 17
      // 006: dload 2
      // 007: invokestatic java/lang/Math.abs (D)D
      // 00a: dstore 19
      // 00c: invokestatic OpaquePredicate.c ()I
      // 00f: dload 4
      // 011: invokestatic java/lang/Math.abs (D)D
      // 014: dstore 21
      // 016: istore 6
      // 018: dload 17
      // 01a: dload 21
      // 01c: invokestatic yb6.azu (DD)D
      // 01f: dstore 11
      // 021: dload 17
      // 023: dload 21
      // 025: invokestatic yb6.r2t (DD)D
      // 028: dstore 13
      // 02a: dload 11
      // 02c: dconst_0
      // 02d: dcmpl
      // 02e: iload 6
      // 030: ifne 088
      // 033: ifne 070
      // 036: goto 03d
      // 039: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03c: athrow
      // 03d: dconst_0
      // 03e: dstore 29
      // 040: dload 13
      // 042: dconst_0
      // 043: iload 6
      // 045: ifne 068
      // 048: dcmpl
      // 049: ifne 05a
      // 04c: goto 053
      // 04f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: goto 157
      // 056: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 059: athrow
      // 05a: dload 13
      // 05c: dload 19
      // 05e: invokestatic yb6.azu (DD)D
      // 061: dload 13
      // 063: dload 19
      // 065: invokestatic yb6.r2t (DD)D
      // 068: ddiv
      // 069: dstore 7
      // 06b: iload 6
      // 06d: ifeq 157
      // 070: dload 19
      // 072: dload 13
      // 074: iload 6
      // 076: ifne 0e0
      // 079: goto 080
      // 07c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07f: athrow
      // 080: dcmpg
      // 081: goto 088
      // 084: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 087: athrow
      // 088: ifge 0d5
      // 08b: dload 11
      // 08d: dload 13
      // 08f: ddiv
      // 090: dconst_1
      // 091: dadd
      // 092: dstore 23
      // 094: dload 13
      // 096: dload 11
      // 098: dsub
      // 099: dload 13
      // 09b: ddiv
      // 09c: dstore 25
      // 09e: dload 19
      // 0a0: dload 13
      // 0a2: ddiv
      // 0a3: dstore 7
      // 0a5: dload 7
      // 0a7: dload 7
      // 0a9: dmul
      // 0aa: dstore 27
      // 0ac: ldc2_w 2.0
      // 0af: dload 23
      // 0b1: dload 23
      // 0b3: dmul
      // 0b4: dload 27
      // 0b6: dadd
      // 0b7: invokestatic java/lang/Math.sqrt (D)D
      // 0ba: dload 25
      // 0bc: dload 25
      // 0be: dmul
      // 0bf: dload 27
      // 0c1: dadd
      // 0c2: invokestatic java/lang/Math.sqrt (D)D
      // 0c5: dadd
      // 0c6: ddiv
      // 0c7: dstore 15
      // 0c9: dload 11
      // 0cb: dload 15
      // 0cd: dmul
      // 0ce: dstore 29
      // 0d0: iload 6
      // 0d2: ifeq 157
      // 0d5: dload 13
      // 0d7: dload 19
      // 0d9: goto 0e0
      // 0dc: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: ddiv
      // 0e1: dstore 27
      // 0e3: dload 27
      // 0e5: dconst_0
      // 0e6: iload 6
      // 0e8: ifne 112
      // 0eb: dcmpl
      // 0ec: ifne 105
      // 0ef: goto 0f6
      // 0f2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: dload 11
      // 0f8: dload 13
      // 0fa: dmul
      // 0fb: dload 19
      // 0fd: ddiv
      // 0fe: dstore 29
      // 100: iload 6
      // 102: ifeq 157
      // 105: dload 11
      // 107: dload 13
      // 109: ddiv
      // 10a: dconst_1
      // 10b: goto 112
      // 10e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 111: athrow
      // 112: dadd
      // 113: dstore 23
      // 115: dload 13
      // 117: dload 11
      // 119: dsub
      // 11a: dload 13
      // 11c: ddiv
      // 11d: dstore 25
      // 11f: dload 23
      // 121: dload 27
      // 123: dmul
      // 124: dstore 7
      // 126: dload 25
      // 128: dload 27
      // 12a: dmul
      // 12b: dstore 9
      // 12d: dconst_1
      // 12e: dload 7
      // 130: dload 7
      // 132: dmul
      // 133: dconst_1
      // 134: dadd
      // 135: invokestatic java/lang/Math.sqrt (D)D
      // 138: dload 9
      // 13a: dload 9
      // 13c: dmul
      // 13d: dconst_1
      // 13e: dadd
      // 13f: invokestatic java/lang/Math.sqrt (D)D
      // 142: dadd
      // 143: ddiv
      // 144: dstore 15
      // 146: dload 11
      // 148: dload 15
      // 14a: dmul
      // 14b: dload 27
      // 14d: dmul
      // 14e: dstore 29
      // 150: dload 29
      // 152: dload 29
      // 154: dadd
      // 155: dstore 29
      // 157: dload 29
      // 159: dreturn
   }

   public static int g6z(
      double param0, double param2, double param4, double[] param6, double[] param7, double[] param8, double[] param9, double[] param10, int param11
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 2.0
      // 003: dstore 13
      // 005: dconst_1
      // 006: dstore 15
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: aload 6
      // 00d: bipush 0
      // 00e: daload
      // 00f: dstore 66
      // 011: aload 6
      // 013: bipush 1
      // 014: daload
      // 015: dstore 64
      // 017: dconst_0
      // 018: dstore 56
      // 01a: istore 12
      // 01c: dconst_0
      // 01d: dstore 58
      // 01f: dconst_0
      // 020: dstore 60
      // 022: dconst_0
      // 023: dstore 62
      // 025: dconst_0
      // 026: dstore 37
      // 028: dload 0
      // 029: dstore 45
      // 02b: dload 45
      // 02d: invokestatic java/lang/Math.abs (D)D
      // 030: dstore 39
      // 032: dload 4
      // 034: dstore 49
      // 036: dload 4
      // 038: invokestatic java/lang/Math.abs (D)D
      // 03b: dstore 43
      // 03d: bipush 1
      // 03e: istore 19
      // 040: dload 43
      // 042: dload 39
      // 044: dcmpl
      // 045: iload 12
      // 047: ifne 064
      // 04a: ifle 05c
      // 04d: goto 054
      // 050: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: bipush 1
      // 055: istore 22
      // 057: iload 12
      // 059: ifeq 066
      // 05c: bipush 0
      // 05d: goto 064
      // 060: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: istore 22
      // 066: iload 22
      // 068: iload 12
      // 06a: ifne 078
      // 06d: ifeq 092
      // 070: goto 077
      // 073: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 076: athrow
      // 077: bipush 3
      // 078: istore 19
      // 07a: dload 45
      // 07c: dstore 20
      // 07e: dload 49
      // 080: dstore 45
      // 082: dload 20
      // 084: dstore 49
      // 086: dload 39
      // 088: dstore 20
      // 08a: dload 43
      // 08c: dstore 39
      // 08e: dload 20
      // 090: dstore 43
      // 092: dload 2
      // 093: dstore 47
      // 095: dload 47
      // 097: invokestatic java/lang/Math.abs (D)D
      // 09a: dstore 41
      // 09c: dload 41
      // 09e: dconst_0
      // 09f: dcmpl
      // 0a0: iload 12
      // 0a2: ifne 0d4
      // 0a5: ifne 0cc
      // 0a8: goto 0af
      // 0ab: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ae: athrow
      // 0af: aload 6
      // 0b1: bipush 1
      // 0b2: dload 43
      // 0b4: dastore
      // 0b5: aload 6
      // 0b7: bipush 0
      // 0b8: dload 39
      // 0ba: dastore
      // 0bb: dconst_1
      // 0bc: dstore 56
      // 0be: dconst_1
      // 0bf: dstore 58
      // 0c1: dconst_0
      // 0c2: dstore 60
      // 0c4: dconst_0
      // 0c5: dstore 62
      // 0c7: iload 12
      // 0c9: ifeq 4d7
      // 0cc: bipush 1
      // 0cd: goto 0d4
      // 0d0: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: istore 53
      // 0d6: dload 41
      // 0d8: dload 39
      // 0da: dcmpl
      // 0db: iload 12
      // 0dd: ifne 155
      // 0e0: ifle 153
      // 0e3: goto 0ea
      // 0e6: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e9: athrow
      // 0ea: bipush 2
      // 0eb: istore 19
      // 0ed: dload 39
      // 0ef: dload 41
      // 0f1: ddiv
      // 0f2: ldc2_w 1.0E-10
      // 0f5: dcmpg
      // 0f6: iload 12
      // 0f8: ifne 155
      // 0fb: ifge 153
      // 0fe: goto 105
      // 101: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 104: athrow
      // 105: bipush 0
      // 106: istore 53
      // 108: dload 41
      // 10a: dstore 66
      // 10c: dload 43
      // 10e: dconst_1
      // 10f: iload 12
      // 111: ifne 13c
      // 114: dcmpl
      // 115: ifle 12e
      // 118: goto 11f
      // 11b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11e: athrow
      // 11f: dload 39
      // 121: dload 41
      // 123: dload 43
      // 125: ddiv
      // 126: ddiv
      // 127: dstore 64
      // 129: iload 12
      // 12b: ifeq 13f
      // 12e: dload 39
      // 130: dload 41
      // 132: ddiv
      // 133: dload 43
      // 135: goto 13c
      // 138: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13b: athrow
      // 13c: dmul
      // 13d: dstore 64
      // 13f: dconst_1
      // 140: dstore 56
      // 142: dload 49
      // 144: dload 47
      // 146: ddiv
      // 147: dstore 60
      // 149: dconst_1
      // 14a: dstore 62
      // 14c: dload 45
      // 14e: dload 47
      // 150: ddiv
      // 151: dstore 58
      // 153: iload 53
      // 155: iload 12
      // 157: ifne 3e5
      // 15a: ifeq 3e3
      // 15d: goto 164
      // 160: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 163: athrow
      // 164: dload 39
      // 166: dload 43
      // 168: dsub
      // 169: dstore 25
      // 16b: dload 25
      // 16d: dload 39
      // 16f: iload 12
      // 171: ifne 192
      // 174: dcmpl
      // 175: ifne 187
      // 178: goto 17f
      // 17b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17e: athrow
      // 17f: dconst_1
      // 180: dstore 27
      // 182: iload 12
      // 184: ifeq 195
      // 187: dload 25
      // 189: dload 39
      // 18b: goto 192
      // 18e: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 191: athrow
      // 192: ddiv
      // 193: dstore 27
      // 195: dload 47
      // 197: dload 45
      // 199: ddiv
      // 19a: dstore 29
      // 19c: ldc2_w 2.0
      // 19f: dload 27
      // 1a1: dsub
      // 1a2: dstore 35
      // 1a4: dload 29
      // 1a6: dload 29
      // 1a8: dmul
      // 1a9: dstore 51
      // 1ab: dload 35
      // 1ad: dload 35
      // 1af: dmul
      // 1b0: dstore 54
      // 1b2: dload 54
      // 1b4: dload 51
      // 1b6: dadd
      // 1b7: invokestatic java/lang/Math.sqrt (D)D
      // 1ba: dstore 33
      // 1bc: dload 27
      // 1be: dconst_0
      // 1bf: iload 12
      // 1c1: ifne 1e9
      // 1c4: dcmpl
      // 1c5: ifne 1db
      // 1c8: goto 1cf
      // 1cb: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ce: athrow
      // 1cf: dload 29
      // 1d1: invokestatic java/lang/Math.abs (D)D
      // 1d4: dstore 31
      // 1d6: iload 12
      // 1d8: ifeq 1ef
      // 1db: dload 27
      // 1dd: dload 27
      // 1df: dmul
      // 1e0: dload 51
      // 1e2: goto 1e9
      // 1e5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e8: athrow
      // 1e9: dadd
      // 1ea: invokestatic java/lang/Math.sqrt (D)D
      // 1ed: dstore 31
      // 1ef: dload 33
      // 1f1: dload 31
      // 1f3: dadd
      // 1f4: ldc2_w 0.5
      // 1f7: dmul
      // 1f8: dstore 23
      // 1fa: dload 41
      // 1fc: dload 39
      // 1fe: dcmpl
      // 1ff: iload 12
      // 201: ifne 279
      // 204: ifle 277
      // 207: goto 20e
      // 20a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20d: athrow
      // 20e: bipush 2
      // 20f: istore 19
      // 211: dload 39
      // 213: dload 41
      // 215: ddiv
      // 216: ldc2_w 1.0E-10
      // 219: dcmpg
      // 21a: iload 12
      // 21c: ifne 279
      // 21f: ifge 277
      // 222: goto 229
      // 225: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 228: athrow
      // 229: bipush 0
      // 22a: istore 53
      // 22c: dload 41
      // 22e: dstore 66
      // 230: dload 43
      // 232: dconst_1
      // 233: iload 12
      // 235: ifne 260
      // 238: dcmpl
      // 239: ifle 252
      // 23c: goto 243
      // 23f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 242: athrow
      // 243: dload 39
      // 245: dload 41
      // 247: dload 43
      // 249: ddiv
      // 24a: ddiv
      // 24b: dstore 64
      // 24d: iload 12
      // 24f: ifeq 263
      // 252: dload 39
      // 254: dload 41
      // 256: ddiv
      // 257: dload 43
      // 259: goto 260
      // 25c: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25f: athrow
      // 260: dmul
      // 261: dstore 64
      // 263: dconst_1
      // 264: dstore 56
      // 266: dload 49
      // 268: dload 47
      // 26a: ddiv
      // 26b: dstore 60
      // 26d: dconst_1
      // 26e: dstore 62
      // 270: dload 45
      // 272: dload 47
      // 274: ddiv
      // 275: dstore 58
      // 277: iload 53
      // 279: iload 12
      // 27b: ifne 3e5
      // 27e: ifeq 3e3
      // 281: goto 288
      // 284: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 287: athrow
      // 288: dload 39
      // 28a: dload 43
      // 28c: dsub
      // 28d: dstore 25
      // 28f: dload 25
      // 291: dload 39
      // 293: iload 12
      // 295: ifne 2b6
      // 298: dcmpl
      // 299: ifne 2ab
      // 29c: goto 2a3
      // 29f: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a2: athrow
      // 2a3: dconst_1
      // 2a4: dstore 27
      // 2a6: iload 12
      // 2a8: ifeq 2b9
      // 2ab: dload 25
      // 2ad: dload 39
      // 2af: goto 2b6
      // 2b2: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b5: athrow
      // 2b6: ddiv
      // 2b7: dstore 27
      // 2b9: dload 47
      // 2bb: dload 45
      // 2bd: ddiv
      // 2be: dstore 29
      // 2c0: ldc2_w 2.0
      // 2c3: dload 27
      // 2c5: dsub
      // 2c6: dstore 35
      // 2c8: dload 29
      // 2ca: dload 29
      // 2cc: dmul
      // 2cd: dstore 51
      // 2cf: dload 35
      // 2d1: dload 35
      // 2d3: dmul
      // 2d4: dstore 54
      // 2d6: dload 54
      // 2d8: dload 51
      // 2da: dadd
      // 2db: invokestatic java/lang/Math.sqrt (D)D
      // 2de: dstore 33
      // 2e0: dload 27
      // 2e2: dconst_0
      // 2e3: iload 12
      // 2e5: ifne 30d
      // 2e8: dcmpl
      // 2e9: ifne 2ff
      // 2ec: goto 2f3
      // 2ef: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f2: athrow
      // 2f3: dload 29
      // 2f5: invokestatic java/lang/Math.abs (D)D
      // 2f8: dstore 31
      // 2fa: iload 12
      // 2fc: ifeq 313
      // 2ff: dload 27
      // 301: dload 27
      // 303: dmul
      // 304: dload 51
      // 306: goto 30d
      // 309: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30c: athrow
      // 30d: dadd
      // 30e: invokestatic java/lang/Math.sqrt (D)D
      // 311: dstore 31
      // 313: dload 33
      // 315: dload 31
      // 317: dadd
      // 318: ldc2_w 0.5
      // 31b: dmul
      // 31c: dstore 23
      // 31e: dload 43
      // 320: dload 23
      // 322: ddiv
      // 323: dstore 64
      // 325: dload 39
      // 327: dload 23
      // 329: dmul
      // 32a: dstore 66
      // 32c: dload 51
      // 32e: dconst_0
      // 32f: iload 12
      // 331: ifne 3a9
      // 334: dcmpl
      // 335: ifne 38d
      // 338: goto 33f
      // 33b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33e: athrow
      // 33f: dload 27
      // 341: dconst_0
      // 342: iload 12
      // 344: ifne 385
      // 347: goto 34e
      // 34a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34d: athrow
      // 34e: dcmpl
      // 34f: ifne 36f
      // 352: goto 359
      // 355: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 358: athrow
      // 359: dload 13
      // 35b: dload 45
      // 35d: invokestatic yb6.ikt (DD)D
      // 360: dload 15
      // 362: dload 47
      // 364: invokestatic yb6.ikt (DD)D
      // 367: dmul
      // 368: dstore 35
      // 36a: iload 12
      // 36c: ifeq 3ac
      // 36f: dload 47
      // 371: dload 25
      // 373: dload 45
      // 375: invokestatic yb6.ikt (DD)D
      // 378: ddiv
      // 379: dload 29
      // 37b: dload 35
      // 37d: ddiv
      // 37e: goto 385
      // 381: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 384: athrow
      // 385: dadd
      // 386: dstore 35
      // 388: iload 12
      // 38a: ifeq 3ac
      // 38d: dload 29
      // 38f: dload 33
      // 391: dload 35
      // 393: dadd
      // 394: ddiv
      // 395: dload 29
      // 397: dload 31
      // 399: dload 27
      // 39b: dadd
      // 39c: ddiv
      // 39d: dadd
      // 39e: dload 23
      // 3a0: dconst_1
      // 3a1: dadd
      // 3a2: goto 3a9
      // 3a5: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a8: athrow
      // 3a9: dmul
      // 3aa: dstore 35
      // 3ac: dload 35
      // 3ae: dload 35
      // 3b0: dmul
      // 3b1: ldc2_w 4.0
      // 3b4: dadd
      // 3b5: invokestatic java/lang/Math.sqrt (D)D
      // 3b8: dstore 27
      // 3ba: ldc2_w 2.0
      // 3bd: dload 27
      // 3bf: ddiv
      // 3c0: dstore 58
      // 3c2: dload 35
      // 3c4: dload 27
      // 3c6: ddiv
      // 3c7: dstore 62
      // 3c9: dload 58
      // 3cb: dload 62
      // 3cd: dload 29
      // 3cf: dmul
      // 3d0: dadd
      // 3d1: dload 23
      // 3d3: ddiv
      // 3d4: dstore 56
      // 3d6: dload 49
      // 3d8: dload 45
      // 3da: ddiv
      // 3db: dload 62
      // 3dd: dmul
      // 3de: dload 23
      // 3e0: ddiv
      // 3e1: dstore 60
      // 3e3: iload 22
      // 3e5: ifeq 40c
      // 3e8: aload 8
      // 3ea: bipush 0
      // 3eb: dload 62
      // 3ed: dastore
      // 3ee: aload 7
      // 3f0: bipush 0
      // 3f1: dload 58
      // 3f3: dastore
      // 3f4: aload 10
      // 3f6: bipush 0
      // 3f7: dload 60
      // 3f9: dastore
      // 3fa: aload 9
      // 3fc: bipush 0
      // 3fd: dload 56
      // 3ff: dastore
      // 400: iload 12
      // 402: ifeq 42b
      // 405: goto 40c
      // 408: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40b: athrow
      // 40c: aload 8
      // 40e: bipush 0
      // 40f: dload 56
      // 411: dastore
      // 412: aload 7
      // 414: bipush 0
      // 415: dload 60
      // 417: dastore
      // 418: aload 10
      // 41a: bipush 0
      // 41b: dload 58
      // 41d: dastore
      // 41e: aload 9
      // 420: bipush 0
      // 421: dload 62
      // 423: dastore
      // 424: goto 42b
      // 427: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 42a: athrow
      // 42b: iload 19
      // 42d: bipush 1
      // 42e: iload 12
      // 430: ifne 45c
      // 433: if_icmpne 459
      // 436: goto 43d
      // 439: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43c: athrow
      // 43d: dload 15
      // 43f: aload 10
      // 441: bipush 0
      // 442: daload
      // 443: invokestatic yb6.ikt (DD)D
      // 446: dload 15
      // 448: aload 8
      // 44a: bipush 0
      // 44b: daload
      // 44c: invokestatic yb6.ikt (DD)D
      // 44f: dmul
      // 450: dload 15
      // 452: dload 0
      // 453: invokestatic yb6.ikt (DD)D
      // 456: dmul
      // 457: dstore 37
      // 459: iload 19
      // 45b: bipush 2
      // 45c: iload 12
      // 45e: ifne 48a
      // 461: if_icmpne 487
      // 464: goto 46b
      // 467: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46a: athrow
      // 46b: dload 15
      // 46d: aload 9
      // 46f: bipush 0
      // 470: daload
      // 471: invokestatic yb6.ikt (DD)D
      // 474: dload 15
      // 476: aload 8
      // 478: bipush 0
      // 479: daload
      // 47a: invokestatic yb6.ikt (DD)D
      // 47d: dmul
      // 47e: dload 15
      // 480: dload 2
      // 481: invokestatic yb6.ikt (DD)D
      // 484: dmul
      // 485: dstore 37
      // 487: iload 19
      // 489: bipush 3
      // 48a: if_icmpne 4aa
      // 48d: dload 15
      // 48f: aload 9
      // 491: bipush 0
      // 492: daload
      // 493: invokestatic yb6.ikt (DD)D
      // 496: dload 15
      // 498: aload 7
      // 49a: bipush 0
      // 49b: daload
      // 49c: invokestatic yb6.ikt (DD)D
      // 49f: dmul
      // 4a0: dload 15
      // 4a2: dload 4
      // 4a4: invokestatic yb6.ikt (DD)D
      // 4a7: dmul
      // 4a8: dstore 37
      // 4aa: aload 6
      // 4ac: iload 11
      // 4ae: dload 66
      // 4b0: dload 37
      // 4b2: invokestatic yb6.ikt (DD)D
      // 4b5: dastore
      // 4b6: dload 37
      // 4b8: dload 15
      // 4ba: dload 0
      // 4bb: invokestatic yb6.ikt (DD)D
      // 4be: dmul
      // 4bf: dload 15
      // 4c1: dload 4
      // 4c3: invokestatic yb6.ikt (DD)D
      // 4c6: dmul
      // 4c7: dstore 17
      // 4c9: aload 6
      // 4cb: iload 11
      // 4cd: bipush 1
      // 4ce: iadd
      // 4cf: dload 64
      // 4d1: dload 17
      // 4d3: invokestatic yb6.ikt (DD)D
      // 4d6: dastore
      // 4d7: bipush 0
      // 4d8: ireturn
   }

   public static double e3a(double param0, double param2, double[] param4, double[] param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 2.002083095183101E-146
      // 003: dstore 26
      // 005: invokestatic OpaquePredicate.b ()I
      // 008: ldc2_w 4.9947976805055876E145
      // 00b: dstore 28
      // 00d: istore 6
      // 00f: dload 2
      // 010: dconst_0
      // 011: dcmpl
      // 012: iload 6
      // 014: ifeq 045
      // 017: ifne 02f
      // 01a: goto 021
      // 01d: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: dconst_1
      // 022: dstore 12
      // 024: dconst_0
      // 025: dstore 14
      // 027: dload 0
      // 028: dstore 24
      // 02a: iload 6
      // 02c: ifne 1fb
      // 02f: dload 0
      // 030: iload 6
      // 032: ifeq 05e
      // 035: goto 03c
      // 038: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 03b: athrow
      // 03c: dconst_0
      // 03d: dcmpl
      // 03e: goto 045
      // 041: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: ifne 056
      // 048: dconst_0
      // 049: dstore 12
      // 04b: dconst_1
      // 04c: dstore 14
      // 04e: dload 2
      // 04f: dstore 24
      // 051: iload 6
      // 053: ifne 1fb
      // 056: dload 0
      // 057: goto 05e
      // 05a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05d: athrow
      // 05e: dstore 20
      // 060: dload 2
      // 061: dstore 22
      // 063: dload 20
      // 065: invokestatic java/lang/Math.abs (D)D
      // 068: dload 22
      // 06a: invokestatic java/lang/Math.abs (D)D
      // 06d: invokestatic yb6.r2t (DD)D
      // 070: dstore 17
      // 072: dload 17
      // 074: ldc2_w 4.9947976805055876E145
      // 077: dcmpl
      // 078: iload 6
      // 07a: ifeq 119
      // 07d: iflt 107
      // 080: goto 087
      // 083: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: bipush 0
      // 088: istore 19
      // 08a: dload 17
      // 08c: ldc2_w 4.9947976805055876E145
      // 08f: dcmpl
      // 090: iflt 0bf
      // 093: iinc 19 1
      // 096: dload 20
      // 098: ldc2_w 2.002083095183101E-146
      // 09b: dmul
      // 09c: dstore 20
      // 09e: dload 22
      // 0a0: ldc2_w 2.002083095183101E-146
      // 0a3: dmul
      // 0a4: dstore 22
      // 0a6: dload 20
      // 0a8: invokestatic java/lang/Math.abs (D)D
      // 0ab: dload 22
      // 0ad: invokestatic java/lang/Math.abs (D)D
      // 0b0: invokestatic yb6.r2t (DD)D
      // 0b3: iload 6
      // 0b5: ifeq 0cd
      // 0b8: dstore 17
      // 0ba: iload 6
      // 0bc: ifne 08a
      // 0bf: dload 20
      // 0c1: dload 20
      // 0c3: dmul
      // 0c4: dload 22
      // 0c6: dload 22
      // 0c8: dmul
      // 0c9: dadd
      // 0ca: invokestatic java/lang/Math.sqrt (D)D
      // 0cd: dstore 24
      // 0cf: dload 20
      // 0d1: dload 24
      // 0d3: ddiv
      // 0d4: dstore 12
      // 0d6: dload 22
      // 0d8: dload 24
      // 0da: ddiv
      // 0db: dstore 14
      // 0dd: iload 19
      // 0df: istore 7
      // 0e1: bipush 1
      // 0e2: istore 16
      // 0e4: iload 16
      // 0e6: iload 19
      // 0e8: if_icmpgt 1ba
      // 0eb: dload 24
      // 0ed: ldc2_w 4.9947976805055876E145
      // 0f0: dmul
      // 0f1: dstore 24
      // 0f3: iinc 16 1
      // 0f6: iload 6
      // 0f8: ifeq 207
      // 0fb: iload 6
      // 0fd: ifne 0e4
      // 100: goto 107
      // 103: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: dload 17
      // 109: ldc2_w 2.002083095183101E-146
      // 10c: iload 6
      // 10e: ifeq 1a6
      // 111: dcmpg
      // 112: goto 119
      // 115: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: ifgt 19c
      // 11c: bipush 0
      // 11d: istore 19
      // 11f: dload 17
      // 121: ldc2_w 2.002083095183101E-146
      // 124: dcmpg
      // 125: ifgt 154
      // 128: iinc 19 1
      // 12b: dload 20
      // 12d: ldc2_w 4.9947976805055876E145
      // 130: dmul
      // 131: dstore 20
      // 133: dload 22
      // 135: ldc2_w 4.9947976805055876E145
      // 138: dmul
      // 139: dstore 22
      // 13b: dload 20
      // 13d: invokestatic java/lang/Math.abs (D)D
      // 140: dload 22
      // 142: invokestatic java/lang/Math.abs (D)D
      // 145: invokestatic yb6.r2t (DD)D
      // 148: iload 6
      // 14a: ifeq 162
      // 14d: dstore 17
      // 14f: iload 6
      // 151: ifne 11f
      // 154: dload 20
      // 156: dload 20
      // 158: dmul
      // 159: dload 22
      // 15b: dload 22
      // 15d: dmul
      // 15e: dadd
      // 15f: invokestatic java/lang/Math.sqrt (D)D
      // 162: dstore 24
      // 164: dload 20
      // 166: dload 24
      // 168: ddiv
      // 169: dstore 12
      // 16b: dload 22
      // 16d: dload 24
      // 16f: ddiv
      // 170: dstore 14
      // 172: iload 19
      // 174: istore 7
      // 176: bipush 1
      // 177: istore 16
      // 179: iload 16
      // 17b: iload 19
      // 17d: if_icmpgt 1ba
      // 180: dload 24
      // 182: ldc2_w 2.002083095183101E-146
      // 185: dmul
      // 186: dstore 24
      // 188: iinc 16 1
      // 18b: iload 6
      // 18d: ifeq 207
      // 190: iload 6
      // 192: ifne 179
      // 195: goto 19c
      // 198: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19b: athrow
      // 19c: dload 20
      // 19e: dload 20
      // 1a0: dmul
      // 1a1: dload 22
      // 1a3: dload 22
      // 1a5: dmul
      // 1a6: dadd
      // 1a7: invokestatic java/lang/Math.sqrt (D)D
      // 1aa: dstore 24
      // 1ac: dload 20
      // 1ae: dload 24
      // 1b0: ddiv
      // 1b1: dstore 12
      // 1b3: dload 22
      // 1b5: dload 24
      // 1b7: ddiv
      // 1b8: dstore 14
      // 1ba: dload 0
      // 1bb: invokestatic java/lang/Math.abs (D)D
      // 1be: iload 6
      // 1c0: ifeq 209
      // 1c3: dload 2
      // 1c4: invokestatic java/lang/Math.abs (D)D
      // 1c7: dcmpl
      // 1c8: ifle 1fb
      // 1cb: goto 1d2
      // 1ce: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: dload 12
      // 1d4: iload 6
      // 1d6: ifeq 209
      // 1d9: goto 1e0
      // 1dc: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1df: athrow
      // 1e0: dconst_0
      // 1e1: dcmpg
      // 1e2: ifge 1fb
      // 1e5: goto 1ec
      // 1e8: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: dload 12
      // 1ee: dneg
      // 1ef: dstore 12
      // 1f1: dload 14
      // 1f3: dneg
      // 1f4: dstore 14
      // 1f6: dload 24
      // 1f8: dneg
      // 1f9: dstore 24
      // 1fb: aload 4
      // 1fd: bipush 0
      // 1fe: dload 14
      // 200: dastore
      // 201: aload 5
      // 203: bipush 0
      // 204: dload 12
      // 206: dastore
      // 207: dload 24
      // 209: dreturn
   }

   public static double ikt(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifeq 20
      // 0b: dconst_0
      // 0c: dcmpl
      // 0d: iflt 1f
      // 10: goto 17
      // 13: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16: athrow
      // 17: dload 0
      // 18: goto 21
      // 1b: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: dload 0
      // 20: dneg
      // 21: dstore 5
      // 23: dload 2
      // 24: iload 4
      // 26: ifeq 40
      // 29: dconst_0
      // 2a: dcmpl
      // 2b: iflt 3e
      // 2e: goto 35
      // 31: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: dload 5
      // 37: goto 41
      // 3a: invokestatic yb6.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d: athrow
      // 3e: dload 5
      // 40: dneg
      // 41: dreturn
   }

   @Override
   public Object clone() {
      int var1 = OpaquePredicate.c();
      yb6 var2 = null;

      try {
         var2 = (yb6)super.clone();
      } catch (CloneNotSupportedException var5) {
         throw new InternalError();
      }

      var2.zk2 = new double[this.dir][this.bg8];
      int var3 = 0;

      while (var3 < this.dir) {
         int var4 = 0;

         while (true) {
            if (var4 < this.bg8) {
               try {
                  var2.zk2[var3][var4] = this.zk2[var3][var4];
                  var4++;
                  if (var1 != 0) {
                     break;
                  }

                  if (var1 == 0) {
                     continue;
                  }
               } catch (CloneNotSupportedException var6) {
                  throw a(var6);
               }
            }

            var3++;
            break;
         }

         if (var1 != 0) {
            break;
         }
      }

      return var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-937693905294167439L, -2856207552736949553L, MethodHandles.lookup().lookupClass()).a(28888045919803L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 63619407611177L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[51];
      int var7 = 0;
      String var6 = "C®8üD*Ý({\u008dW\u008e¤G£D\u0018úJºw\u0095©®\u0000\u0006\u0084æh\u0015æ\u009cµ\u0011\u0095é©g¹3n\u0018L>*\u009chù-|à8ëÐ/òHUÆÖQ1:\u001ap\t \u0011ÁÚAR\u0007\u0092O\u0096\n\u0000·b\u0001\u008b]+\u0091\u00032\u0012\tTB»\u0012\u0003\u0012då\u008cã\u0018½\u0011Ç6\"ò\u001f«\u0097=<ónQá\u0088ã\u0085\u0086ã|hè4\u0018º¶Cdsw¢ál\u00056çUÉ&\u0005Ê\u0090\u0086G¨C\u0004þ â*Ë0ê`+·\u0006á%^\u0000\u0085\u0092B\u0099Ý9[Ô¤+²]G\u007f.¹Í\u008f(\u0010\u0003\u008côÝ¡%ÃåY÷e¢\u0017$42\u0010\u0007nÖywìHÈZ\u0007=n\u0000\u001d\f\u0003 g½çV*p\u009fÓiöòyJ¶¾A\bV_©S\\YýdÍ£BÖ³TL\u0018ãþ\u0014h^@_ígîæds\u0015\u0018a\u0088\u0000º+È&ú[ \u000bÜõíÉ\u001b¹\u0098\u0007ß²ÖÇ·+\u0004B\u008ar<ì1\u009a\u000f\u001cØxÓÎ?15@\u0011\u0002ó\u008dB%Ã¼\u0000ä\u0099¡ûM§¦ò{sZ\u0085Vvt\u0083·ê\u000246<ÉEkQ\u0087n\u008e\u0005?(n\u0001K6¿\u0086«±¯Ñ\u0083Òxg\u009deZ{\u0098e\u009b´`\u0010EºÓGÏ<àÓ?A\u009eðPPÈU\u0018\u0097\u0013¥|H³¯\u000bE}\u0098!»ïZ)\tì\u0085sØ\u0005Z\u0000 \r\bYÿ\u0086F\u0083!ÓiÝ\u0094\u001fbøÝ¦µse¯>»\u0090´¯Æ§gW\u0081ñ 5\u0001i\u008c\u0012×\u0095Á;ÎI\u001aú\u001a\u0018I\u0088\u0011\f\n7c|êlÂ\u0089á§û¦¡\u0018\u0013\u00000\u0081Z\u0088l\bB\u0001¦\u0087\u0086\u0016þ\u0018û\u0084\u0000ov¾¦\t óª\\¼C¶¼MP\u001d%\u0086kû;£ #Ue\u0019f\u0013\u000f\tó\u0088©-â\u009aI a\u0018Agx½ÀRÓØL0~F¡>4îµX\u008a^\u0087Û»õly`É\u008fK \\¥UeÀíÎLàø]²í\u0013sõ\u0093ÚÄ\u0017\u0014YIø·©¼@¶cZj\u0010Ë¿(\u0014\u0005\u0080Dã\u007fQ\u008e\u0005\u009c;ï\u0007\u0018\u009bî}\u0091&\u0098A\u0092ã¼\u008a\u0087fÕC5ü=>þ@¹\u0083Ð\u0018\u0082Æ`\u009c\u009dz\u001b\\V}>\"\u00042H½ÐG\u008f\u0006aÚ\u008fÿ\u0018\u0001@ªHfëØÈâ?}\u0092Ò\u009b&4{\u008eÅ¦YöÓ³\u0010\u0012)\u009cî1Qn\u0097é &-<\u0014·Z ¦M\u001a¥Wç´Gë|¶Ï\u0001º°qÈ/_ñf0Î\u009aÛ,vâ\u009b2Ë\u008e\u0010zæ\u0099\u0086YeIÛØ\u009eP\u0086\u0091at\u008b\u0018ød\u0014q|â*j\rìî\u0016w°¤i\u0019¤\r6ò+®G \tv3(ÆÀ4\u0086\u000e\u0094ß\u0015·E\u000bE\u001f\b$soû¬9\\d>\u0006Æ¨T²\u0018\u0006*\u0004ÀÁw¾\u001fHB;\u008f\u0081ßû%È\u0098\u009bz\u009e\u0080 \u0080 õí\u0006\u008fnj\u0095SoºåAäM=î\u0015óJ\u0092\u001bÍ¾LÈZ\u008b¬\"/u\u0005 \u0003\u000bn\\v?Ó½\u0017R:3¦tß6\\_Zñ\u001eõÁÝ6W\u009c*k\u0006\u0088¨ %Ò\u0087\u0017¤\u0088\u0014\u0003ÍÚ'm\u009dé\u00167\u000f\u008f\u000fø,\tÙ\u0018w \u0000\u0082ËV\u0093  Éí,\u0013\u008fU\u009dÆÜ\u0011µV\u0002\u0005g\u0091®6ní9!\u0096À\u00052sÜ,Z5\u001f Id\u001a%\u0091PÊ\u0097\u008bA½¤\u009cv*\u0081¾-3÷U¼Ü\u009b³\u001eóÄT\u009de\u009b\u0010\u007fÔúþ·\u0090#\n9\u0011ÂD^à\u000eâ ÿ\u000e\u0089ês´Îè,å\u001dobµ\u0019V ß¾öK2\u009c\tè~`_ë¤§ø \"ÿu\u0094\u001c\u008fÉczt\u0095\u000f!´`ò\u001e\u001bÿ\u0090î`\u0013ù@\u00965Á¦¤\u0006µ\u0010ê âô\u008d\u009fn\u009fG_\u008cSûZ¢H\u0010nÀO\u0093\u0010ÝD'v\"çw\u0004ÙMñ ®\u008b1\u001bÐ«X;< Àô`\u0013.Ê4<K\u0013\u008aw[\u009e\u0012t§è\u008cçRü\u0010lé\nîëv\u0095\u0005÷,=Æ°@À\u008f\u0018\u008bI¥¹\u000eÛø\u00961ëV\u0092rP\u0082yà\u0005\u0083Å\u0010ÙF¥ ãÚe÷nÞ£~>t\u0001\u001e\u0080ùQ¡éL\u0004\u001a¡\\í¦rÈO\u0086GÂ¨s \u008fh8¯\u0001Æûâÿç§&f4\"Ç«×eyÇE$á0\u009c\u0002\u0007%Æ¿±\u0010é{W¤[º·¹·\u009bÙÞt\u0006ÿ5\u0010ÐP7X\u0011u´éºº\\Ñ\u008ab\u0000ü\u0018\u0007%Ì:R$ Ô\nÞù¾qÖ\u008a\u0016åîÐ²\u001dXo\n";
      int var8 = "C®8üD*Ý({\u008dW\u008e¤G£D\u0018úJºw\u0095©®\u0000\u0006\u0084æh\u0015æ\u009cµ\u0011\u0095é©g¹3n\u0018L>*\u009chù-|à8ëÐ/òHUÆÖQ1:\u001ap\t \u0011ÁÚAR\u0007\u0092O\u0096\n\u0000·b\u0001\u008b]+\u0091\u00032\u0012\tTB»\u0012\u0003\u0012då\u008cã\u0018½\u0011Ç6\"ò\u001f«\u0097=<ónQá\u0088ã\u0085\u0086ã|hè4\u0018º¶Cdsw¢ál\u00056çUÉ&\u0005Ê\u0090\u0086G¨C\u0004þ â*Ë0ê`+·\u0006á%^\u0000\u0085\u0092B\u0099Ý9[Ô¤+²]G\u007f.¹Í\u008f(\u0010\u0003\u008côÝ¡%ÃåY÷e¢\u0017$42\u0010\u0007nÖywìHÈZ\u0007=n\u0000\u001d\f\u0003 g½çV*p\u009fÓiöòyJ¶¾A\bV_©S\\YýdÍ£BÖ³TL\u0018ãþ\u0014h^@_ígîæds\u0015\u0018a\u0088\u0000º+È&ú[ \u000bÜõíÉ\u001b¹\u0098\u0007ß²ÖÇ·+\u0004B\u008ar<ì1\u009a\u000f\u001cØxÓÎ?15@\u0011\u0002ó\u008dB%Ã¼\u0000ä\u0099¡ûM§¦ò{sZ\u0085Vvt\u0083·ê\u000246<ÉEkQ\u0087n\u008e\u0005?(n\u0001K6¿\u0086«±¯Ñ\u0083Òxg\u009deZ{\u0098e\u009b´`\u0010EºÓGÏ<àÓ?A\u009eðPPÈU\u0018\u0097\u0013¥|H³¯\u000bE}\u0098!»ïZ)\tì\u0085sØ\u0005Z\u0000 \r\bYÿ\u0086F\u0083!ÓiÝ\u0094\u001fbøÝ¦µse¯>»\u0090´¯Æ§gW\u0081ñ 5\u0001i\u008c\u0012×\u0095Á;ÎI\u001aú\u001a\u0018I\u0088\u0011\f\n7c|êlÂ\u0089á§û¦¡\u0018\u0013\u00000\u0081Z\u0088l\bB\u0001¦\u0087\u0086\u0016þ\u0018û\u0084\u0000ov¾¦\t óª\\¼C¶¼MP\u001d%\u0086kû;£ #Ue\u0019f\u0013\u000f\tó\u0088©-â\u009aI a\u0018Agx½ÀRÓØL0~F¡>4îµX\u008a^\u0087Û»õly`É\u008fK \\¥UeÀíÎLàø]²í\u0013sõ\u0093ÚÄ\u0017\u0014YIø·©¼@¶cZj\u0010Ë¿(\u0014\u0005\u0080Dã\u007fQ\u008e\u0005\u009c;ï\u0007\u0018\u009bî}\u0091&\u0098A\u0092ã¼\u008a\u0087fÕC5ü=>þ@¹\u0083Ð\u0018\u0082Æ`\u009c\u009dz\u001b\\V}>\"\u00042H½ÐG\u008f\u0006aÚ\u008fÿ\u0018\u0001@ªHfëØÈâ?}\u0092Ò\u009b&4{\u008eÅ¦YöÓ³\u0010\u0012)\u009cî1Qn\u0097é &-<\u0014·Z ¦M\u001a¥Wç´Gë|¶Ï\u0001º°qÈ/_ñf0Î\u009aÛ,vâ\u009b2Ë\u008e\u0010zæ\u0099\u0086YeIÛØ\u009eP\u0086\u0091at\u008b\u0018ød\u0014q|â*j\rìî\u0016w°¤i\u0019¤\r6ò+®G \tv3(ÆÀ4\u0086\u000e\u0094ß\u0015·E\u000bE\u001f\b$soû¬9\\d>\u0006Æ¨T²\u0018\u0006*\u0004ÀÁw¾\u001fHB;\u008f\u0081ßû%È\u0098\u009bz\u009e\u0080 \u0080 õí\u0006\u008fnj\u0095SoºåAäM=î\u0015óJ\u0092\u001bÍ¾LÈZ\u008b¬\"/u\u0005 \u0003\u000bn\\v?Ó½\u0017R:3¦tß6\\_Zñ\u001eõÁÝ6W\u009c*k\u0006\u0088¨ %Ò\u0087\u0017¤\u0088\u0014\u0003ÍÚ'm\u009dé\u00167\u000f\u008f\u000fø,\tÙ\u0018w \u0000\u0082ËV\u0093  Éí,\u0013\u008fU\u009dÆÜ\u0011µV\u0002\u0005g\u0091®6ní9!\u0096À\u00052sÜ,Z5\u001f Id\u001a%\u0091PÊ\u0097\u008bA½¤\u009cv*\u0081¾-3÷U¼Ü\u009b³\u001eóÄT\u009de\u009b\u0010\u007fÔúþ·\u0090#\n9\u0011ÂD^à\u000eâ ÿ\u000e\u0089ês´Îè,å\u001dobµ\u0019V ß¾öK2\u009c\tè~`_ë¤§ø \"ÿu\u0094\u001c\u008fÉczt\u0095\u000f!´`ò\u001e\u001bÿ\u0090î`\u0013ù@\u00965Á¦¤\u0006µ\u0010ê âô\u008d\u009fn\u009fG_\u008cSûZ¢H\u0010nÀO\u0093\u0010ÝD'v\"çw\u0004ÙMñ ®\u008b1\u001bÐ«X;< Àô`\u0013.Ê4<K\u0013\u008aw[\u009e\u0012t§è\u008cçRü\u0010lé\nîëv\u0095\u0005÷,=Æ°@À\u008f\u0018\u008bI¥¹\u000eÛø\u00961ëV\u0092rP\u0082yà\u0005\u0083Å\u0010ÙF¥ ãÚe÷nÞ£~>t\u0001\u001e\u0080ùQ¡éL\u0004\u001a¡\\í¦rÈO\u0086GÂ¨s \u008fh8¯\u0001Æûâÿç§&f4\"Ç«×eyÇE$á0\u009c\u0002\u0007%Æ¿±\u0010é{W¤[º·¹·\u009bÙÞt\u0006ÿ5\u0010ÐP7X\u0011u´éºº\\Ñ\u008ab\u0000ü\u0018\u0007%Ì:R$ Ô\nÞù¾qÖ\u008a\u0016åîÐ²\u001dXo\n"
         .length();
      char var5 = 16;
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
                     c = new String[51];
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

                  var6 = "IEìW½M\r\t5ñ\u000fåÁ¦<ÿ\f\u001f:.^:F¤\u0018\u0005¤¨!tdþ1\u0092\u0089©\\\u0019gºN\u0096!aBþznc";
                  var8 = "IEìW½M\r\t5ñ\u000fåÁ¦<ÿ\f\u001f:.^:F¤\u0018\u0005¤¨!tdþ1\u0092\u0089©\\\u0019gºN\u0096!aBþznc".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8072;
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
            throw new RuntimeException("yb6", var10);
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
         throw new RuntimeException("yb6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
