import com.google.common.collect.Lists;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gvi implements g6k {
   private static final Logger _k5;
   private Set k4u = Collections.newSetFromMap(new ConcurrentHashMap());
   private tts yti;
   private g6k ktn;
   private oza ga3;
   public boolean _yh = true;
   private yo9 ov5 = new yo9();
   private List op1 = Lists.newArrayList();
   private dug v4u;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public gvi(dug var1, oza var2, g6k var3) {
      this.yti = new tkg(var1, 0, 0);
      this.v4u = var1;
      this.ga3 = var2;
      this.ktn = var3;
   }

   @Override
   public boolean pnt(int var1, int var2) {
      return this.ov5.s3y(h2f.fcz(var1, var2));
   }

   public List vrp() {
      return this.op1;
   }

   public void ztg(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield gvi.v4u Ldug;
      // 08: getfield dug.vzz Lupn;
      // 0b: invokevirtual upn.vm6 ()Z
      // 0e: iload 3
      // 0f: ifne 6f
      // 12: ifeq 57
      // 15: goto 1c
      // 18: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield gvi.v4u Ldug;
      // 20: iload 1
      // 21: iload 2
      // 22: invokevirtual dug.j1j (II)Z
      // 25: iload 3
      // 26: ifne 52
      // 29: goto 30
      // 2c: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: ifne 70
      // 33: goto 3a
      // 36: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield gvi.k4u Ljava/util/Set;
      // 3e: iload 1
      // 3f: iload 2
      // 40: invokestatic h2f.fcz (II)J
      // 43: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 46: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 4b: goto 52
      // 4e: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: pop
      // 53: iload 3
      // 54: ifeq 70
      // 57: aload 0
      // 58: getfield gvi.k4u Ljava/util/Set;
      // 5b: iload 1
      // 5c: iload 2
      // 5d: invokestatic h2f.fcz (II)J
      // 60: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 68: goto 6f
      // 6b: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: pop
      // 70: return
   }

   public void hps() {
      int var1 = t9d.c();

      for (tts var3 : this.op1) {
         this.ztg(var3.nzx, var3.yxl);
         if (var1 != 0) {
            break;
         }
      }
   }

   public tts xw9(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic gvi.a J
      // 003: ldc2_w 64373033164376
      // 006: lxor
      // 007: lstore 3
      // 008: iload 1
      // 009: iload 2
      // 00a: invokestatic h2f.fcz (II)J
      // 00d: lstore 6
      // 00f: invokestatic t9d.b ()I
      // 012: aload 0
      // 013: getfield gvi.k4u Ljava/util/Set;
      // 016: lload 6
      // 018: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 01b: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 020: pop
      // 021: istore 5
      // 023: aload 0
      // 024: getfield gvi.ov5 Lyo9;
      // 027: lload 6
      // 029: invokevirtual yo9.hhm (J)Ljava/lang/Object;
      // 02c: checkcast tts
      // 02f: astore 8
      // 031: aload 8
      // 033: iload 5
      // 035: ifeq 157
      // 038: ifnonnull 155
      // 03b: goto 042
      // 03e: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 041: athrow
      // 042: aload 0
      // 043: iload 1
      // 044: iload 2
      // 045: invokespecial gvi.jve (II)Ltts;
      // 048: astore 8
      // 04a: aload 8
      // 04c: iload 5
      // 04e: ifeq 14e
      // 051: ifnonnull 130
      // 054: goto 05b
      // 057: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: getfield gvi.ktn Lg6k;
      // 05f: iload 5
      // 061: ifeq 084
      // 064: goto 06b
      // 067: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06a: athrow
      // 06b: ifnonnull 080
      // 06e: goto 075
      // 071: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: aload 0
      // 076: getfield gvi.yti Ltts;
      // 079: astore 8
      // 07b: iload 5
      // 07d: ifne 130
      // 080: aload 0
      // 081: getfield gvi.ktn Lg6k;
      // 084: iload 1
      // 085: iload 2
      // 086: invokeinterface g6k.et2 (II)Ltts; 3
      // 08b: astore 8
      // 08d: goto 130
      // 090: astore 9
      // 092: aload 9
      // 094: sipush 14627
      // 097: ldc2_w 7623632032715253662
      // 09a: lload 3
      // 09b: lxor
      // 09c: invokedynamic g (IJ)Ljava/lang/String; bsm=gvi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: nop
      // 0a2: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 0a5: astore 10
      // 0a7: aload 10
      // 0a9: sipush 18807
      // 0ac: ldc2_w 7531637196148037574
      // 0af: lload 3
      // 0b0: lxor
      // 0b1: invokedynamic g (IJ)Ljava/lang/String; bsm=gvi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: nop
      // 0b7: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 0ba: astore 11
      // 0bc: aload 11
      // 0be: sipush 6399
      // 0c1: ldc2_w 5481904239819163210
      // 0c4: lload 3
      // 0c5: lxor
      // 0c6: invokedynamic g (IJ)Ljava/lang/String; bsm=gvi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: nop
      // 0cc: sipush 5089
      // 0cf: ldc2_w 1213754628257451346
      // 0d2: lload 3
      // 0d3: lxor
      // 0d4: invokedynamic g (IJ)Ljava/lang/String; bsm=gvi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: nop
      // 0da: bipush 2
      // 0db: anewarray 14
      // 0de: dup
      // 0df: bipush 0
      // 0e0: iload 1
      // 0e1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e4: aastore
      // 0e5: dup
      // 0e6: bipush 1
      // 0e7: iload 2
      // 0e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0eb: aastore
      // 0ec: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0ef: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0f2: aload 11
      // 0f4: sipush 31462
      // 0f7: ldc2_w 8545848107778270294
      // 0fa: lload 3
      // 0fb: lxor
      // 0fc: invokedynamic g (IJ)Ljava/lang/String; bsm=gvi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: nop
      // 102: lload 6
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 10a: aload 11
      // 10c: sipush 5485
      // 10f: ldc2_w 7422791276708989906
      // 112: lload 3
      // 113: lxor
      // 114: invokedynamic g (IJ)Ljava/lang/String; bsm=gvi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: nop
      // 11a: aload 0
      // 11b: getfield gvi.ktn Lg6k;
      // 11e: invokeinterface g6k.y2l ()Ljava/lang/String; 1
      // 123: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 126: new oov
      // 129: dup
      // 12a: aload 10
      // 12c: invokespecial oov.<init> (Le1i;)V
      // 12f: athrow
      // 130: aload 0
      // 131: getfield gvi.ov5 Lyo9;
      // 134: lload 6
      // 136: aload 8
      // 138: invokevirtual yo9.pab (JLjava/lang/Object;)V
      // 13b: aload 0
      // 13c: getfield gvi.op1 Ljava/util/List;
      // 13f: aload 8
      // 141: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 146: pop
      // 147: aload 8
      // 149: invokevirtual tts.uvo ()V
      // 14c: aload 8
      // 14e: aload 0
      // 14f: aload 0
      // 150: iload 1
      // 151: iload 2
      // 152: invokevirtual tts.dlt (Lg6k;Lg6k;II)V
      // 155: aload 8
      // 157: areturn
   }

   @Override
   public tts et2(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield gvi.ov5 Lyo9;
      // 08: iload 1
      // 09: iload 2
      // 0a: invokestatic h2f.fcz (II)J
      // 0d: invokevirtual yo9.hhm (J)Ljava/lang/Object;
      // 10: checkcast tts
      // 13: astore 4
      // 15: aload 4
      // 17: ifnonnull 63
      // 1a: aload 0
      // 1b: iload 3
      // 1c: ifne 5b
      // 1f: goto 26
      // 22: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: getfield gvi.v4u Ldug;
      // 29: invokevirtual dug.a2y ()Z
      // 2c: ifne 5a
      // 2f: goto 36
      // 32: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: aload 0
      // 37: iload 3
      // 38: ifne 5b
      // 3b: goto 42
      // 3e: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: getfield gvi._yh Z
      // 45: ifne 5a
      // 48: goto 4f
      // 4b: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield gvi.yti Ltts;
      // 53: goto 65
      // 56: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 0
      // 5b: iload 1
      // 5c: iload 2
      // 5d: invokevirtual gvi.xw9 (II)Ltts;
      // 60: goto 65
      // 63: aload 4
      // 65: areturn
   }

   private tts jve(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic gvi.a J
      // 03: ldc2_w 40268049384576
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: getfield gvi.ga3 Loza;
      // 11: iload 5
      // 13: ifeq 2a
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aconst_null
      // 21: areturn
      // 22: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25: athrow
      // 26: aload 0
      // 27: getfield gvi.ga3 Loza;
      // 2a: aload 0
      // 2b: getfield gvi.v4u Ldug;
      // 2e: iload 1
      // 2f: iload 2
      // 30: invokeinterface oza.mx5 (Lt9d;II)Ltts; 4
      // 35: astore 6
      // 37: aload 6
      // 39: iload 5
      // 3b: ifeq 84
      // 3e: ifnull 82
      // 41: goto 48
      // 44: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 6
      // 4a: iload 5
      // 4c: ifeq 84
      // 4f: goto 56
      // 52: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55: athrow
      // 56: aload 0
      // 57: getfield gvi.v4u Ldug;
      // 5a: invokevirtual dug.p2b ()J
      // 5d: invokevirtual tts.jwc (J)V
      // 60: aload 0
      // 61: getfield gvi.ktn Lg6k;
      // 64: ifnull 82
      // 67: goto 6e
      // 6a: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: aload 0
      // 6f: getfield gvi.ktn Lg6k;
      // 72: aload 6
      // 74: iload 1
      // 75: iload 2
      // 76: invokeinterface g6k.nw5 (Ltts;II)V 4
      // 7b: goto 82
      // 7e: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: aload 6
      // 84: areturn
      // 85: astore 6
      // 87: getstatic gvi._k5 Lorg/apache/logging/log4j/Logger;
      // 8a: sipush 18773
      // 8d: ldc2_w 6177464534732606777
      // 90: lload 3
      // 91: lxor
      // 92: invokedynamic g (IJ)Ljava/lang/String; bsm=gvi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: aload 6
      // 9a: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 9f: aconst_null
      // a0: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void gum(tts var1) {
      long var2 = a ^ 127567445260869L;
      int var4 = t9d.c();

      Exception var9;
      label30: {
         label29: {
            try {
               var10000 = this.ga3;
               if (var4 != 0) {
                  break label29;
               }

               if (this.ga3 == null) {
                  return;
               }
            } catch (Exception var8) {
               throw a(var8);
            }

            try {
               var10000 = this.ga3;
            } catch (Exception var7) {
               var9 = var7;
               boolean var10001 = false;
               break label30;
            }
         }

         try {
            var10000.fq8(this.v4u, var1);
            return;
         } catch (Exception var6) {
            var9 = var6;
            boolean var10 = false;
         }
      }

      Exception var5 = var9;
      _k5.error(a<"g">(10366, 7643273037993054941L ^ var2), var5);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private void op9(tts var1) {
      long var2 = a ^ 25482609696927L;
      int var4 = t9d.c();

      IOException var13;
      label47: {
         label35: {
            label34: {
               try {
                  var10000 = this.ga3;
                  if (var4 != 0) {
                     break label34;
                  }

                  if (this.ga3 == null) {
                     return;
                  }
               } catch (IOException var10) {
                  throw a(var10);
               }

               try {
                  var1.jwc(this.v4u.p2b());
                  var10000 = this.ga3;
               } catch (IOException var8) {
                  var13 = var8;
                  boolean var14 = false;
                  break label47;
               } catch (d3f var9) {
                  var12 = var9;
                  boolean var10001 = false;
                  break label35;
               }
            }

            try {
               var10000._2n(this.v4u, var1);
               return;
            } catch (IOException var6) {
               var13 = var6;
               boolean var16 = false;
               break label47;
            } catch (d3f var7) {
               var12 = var7;
               boolean var15 = false;
            }
         }

         d3f var5 = var12;
         _k5.error(a<"g">(23167, 2672828413786733066L ^ var2), var5);
         return;
      }

      IOException var11 = var13;
      _k5.error(a<"g">(27020, 8520804126890101239L ^ var2), var11);
   }

   @Override
   public void fbq(g6k param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 2
      // 07: iload 3
      // 08: invokevirtual gvi.et2 (II)Ltts;
      // 0b: astore 5
      // 0d: aload 5
      // 0f: iload 4
      // 11: ifne 2a
      // 14: invokevirtual tts.qeg ()Z
      // 17: ifne 58
      // 1a: goto 21
      // 1d: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: aload 5
      // 23: goto 2a
      // 26: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: invokevirtual tts.m5i ()V
      // 2d: aload 0
      // 2e: getfield gvi.ktn Lg6k;
      // 31: iload 4
      // 33: ifne 4b
      // 36: ifnull 58
      // 39: goto 40
      // 3c: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield gvi.ktn Lg6k;
      // 44: goto 4b
      // 47: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 1
      // 4c: iload 2
      // 4d: iload 3
      // 4e: invokeinterface g6k.fbq (Lg6k;II)V 4
      // 53: aload 5
      // 55: invokevirtual tts.j0q ()V
      // 58: return
   }

   @Override
   public boolean zzc(g6k param1, tts param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: getfield gvi.ktn Lg6k;
      // 09: iload 5
      // 0b: ifeq 23
      // 0e: ifnull 4c
      // 11: goto 18
      // 14: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: getfield gvi.ktn Lg6k;
      // 1c: goto 23
      // 1f: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 1
      // 24: aload 2
      // 25: iload 3
      // 26: iload 4
      // 28: invokeinterface g6k.zzc (Lg6k;Ltts;II)Z 5
      // 2d: iload 5
      // 2f: ifeq 4d
      // 32: ifeq 4c
      // 35: goto 3c
      // 38: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 0
      // 3d: iload 3
      // 3e: iload 4
      // 40: invokevirtual gvi.et2 (II)Ltts;
      // 43: astore 6
      // 45: aload 6
      // 47: invokevirtual tts.j0q ()V
      // 4a: bipush 1
      // 4b: ireturn
      // 4c: bipush 0
      // 4d: ireturn
   }

   @Override
   public boolean va4(boolean param1, sw6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 4
      // 03: aload 0
      // 04: getfield gvi.op1 Ljava/util/List;
      // 07: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 0a: astore 5
      // 0c: invokestatic t9d.c ()I
      // 0f: bipush 0
      // 10: istore 6
      // 12: istore 3
      // 13: iload 6
      // 15: aload 5
      // 17: invokeinterface java/util/List.size ()I 1
      // 1c: if_icmpge af
      // 1f: aload 5
      // 21: iload 6
      // 23: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 28: checkcast tts
      // 2b: astore 7
      // 2d: iload 1
      // 2e: iload 3
      // 2f: ifne b0
      // 32: iload 3
      // 33: ifne 5a
      // 36: goto 3d
      // 39: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: ifeq 54
      // 40: goto 47
      // 43: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: aload 0
      // 48: aload 7
      // 4a: invokespecial gvi.gum (Ltts;)V
      // 4d: goto 54
      // 50: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 7
      // 56: iload 1
      // 57: invokevirtual tts.rmi (Z)Z
      // 5a: iload 3
      // 5b: ifne 8b
      // 5e: ifeq a8
      // 61: goto 68
      // 64: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 0
      // 69: aload 7
      // 6b: invokespecial gvi.op9 (Ltts;)V
      // 6e: aload 7
      // 70: bipush 0
      // 71: invokevirtual tts.r5m (Z)V
      // 74: iinc 4 1
      // 77: iload 3
      // 78: ifne ab
      // 7b: goto 82
      // 7e: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 81: athrow
      // 82: iload 4
      // 84: goto 8b
      // 87: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8a: athrow
      // 8b: bipush 24
      // 8d: if_icmpne a8
      // 90: iload 1
      // 91: iload 3
      // 92: ifne a7
      // 95: goto 9c
      // 98: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: ifne a8
      // 9f: goto a6
      // a2: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: bipush 0
      // a7: ireturn
      // a8: iinc 6 1
      // ab: iload 3
      // ac: ifeq 13
      // af: bipush 1
      // b0: ireturn
   }

   @Override
   public void hua() {
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
      // 05: getfield gvi.ga3 Loza;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 26
      // 0f: goto 16
      // 12: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield gvi.ga3 Loza;
      // 1a: goto 21
      // 1d: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: invokeinterface oza.kap ()V 1
      // 26: return
   }

   @Override
   public boolean p68() {
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
      // 05: getfield gvi.v4u Ldug;
      // 08: getfield dug.b4a Z
      // 0b: iload 1
      // 0c: ifne e9
      // 0f: ifne e0
      // 12: goto 19
      // 15: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: bipush 0
      // 1a: istore 2
      // 1b: iload 2
      // 1c: bipush 100
      // 1e: if_icmpge be
      // 21: aload 0
      // 22: getfield gvi.k4u Ljava/util/Set;
      // 25: iload 1
      // 26: ifne 58
      // 29: invokeinterface java/util/Set.isEmpty ()Z 1
      // 2e: iload 1
      // 2f: ifne e9
      // 32: goto 39
      // 35: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: ifne b7
      // 3c: goto 43
      // 3f: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 0
      // 44: getfield gvi.k4u Ljava/util/Set;
      // 47: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 4c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 51: goto 58
      // 54: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: checkcast java/lang/Long
      // 5b: astore 3
      // 5c: aload 0
      // 5d: getfield gvi.ov5 Lyo9;
      // 60: aload 3
      // 61: invokevirtual java/lang/Long.longValue ()J
      // 64: invokevirtual yo9.hhm (J)Ljava/lang/Object;
      // 67: checkcast tts
      // 6a: astore 4
      // 6c: aload 4
      // 6e: iload 1
      // 6f: ifne 9f
      // 72: ifnull ac
      // 75: goto 7c
      // 78: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 4
      // 7e: invokevirtual tts.lg_ ()V
      // 81: aload 0
      // 82: aload 4
      // 84: invokespecial gvi.op9 (Ltts;)V
      // 87: aload 0
      // 88: aload 4
      // 8a: invokespecial gvi.gum (Ltts;)V
      // 8d: aload 0
      // 8e: getfield gvi.ov5 Lyo9;
      // 91: aload 3
      // 92: invokevirtual java/lang/Long.longValue ()J
      // 95: invokevirtual yo9.wsz (J)Ljava/lang/Object;
      // 98: goto 9f
      // 9b: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9e: athrow
      // 9f: pop
      // a0: aload 0
      // a1: getfield gvi.op1 Ljava/util/List;
      // a4: aload 4
      // a6: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // ab: pop
      // ac: aload 0
      // ad: getfield gvi.k4u Ljava/util/Set;
      // b0: aload 3
      // b1: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // b6: pop
      // b7: iinc 2 1
      // ba: iload 1
      // bb: ifeq 1b
      // be: aload 0
      // bf: iload 1
      // c0: ifne e4
      // c3: getfield gvi.ga3 Loza;
      // c6: ifnull e0
      // c9: goto d0
      // cc: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cf: athrow
      // d0: aload 0
      // d1: getfield gvi.ga3 Loza;
      // d4: invokeinterface oza.w26 ()V 1
      // d9: goto e0
      // dc: invokestatic gvi.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // df: athrow
      // e0: aload 0
      // e1: getfield gvi.ktn Lg6k;
      // e4: invokeinterface g6k.p68 ()Z 1
      // e9: ireturn
   }

   @Override
   public boolean pj4() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return this.v4u.b4a;
         }

         if (!this.v4u.b4a) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public String y2l() {
      long var1 = a ^ 110522401316110L;
      return a<"g">(9324, 2404049849263864205L ^ var1) + this.ov5.iz6() + a<"g">(9346, 6540282099602012514L ^ var1) + this.k4u.size();
   }

   @Override
   public List sbk(ek6 var1, mew var2) {
      return this.ktn.sbk(var1, var2);
   }

   @Override
   public mew epl(t9d var1, String var2, mew var3) {
      return this.ktn.epl(var1, var2, var3);
   }

   @Override
   public int gkt() {
      return this.ov5.iz6();
   }

   @Override
   public void nw5(tts var1, int var2, int var3) {
   }

   @Override
   public tts iqa(mew var1) {
      return this.et2(var1.getX() >> 4, var1.getZ() >> 4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7173358002325599011L, 8856853668151206455L, MethodHandles.lookup().lookupClass()).a(207671355808828L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 26818158247075L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "¦ÅÄ\b\u0014\u009d²Ø÷¯Î:k\u0094AÜA\u009a®®\u0001³´aí5^ÁWøCÒ\u0005\u0017Ø¸±Áû\u007f\u0010ÖXU ÿªÏéÖF>QaÎ°¢\u0018\"\u001e\u008b4£\u008f%1\n\u008d\u0094å\u000f§4K®²N-à]\u008f (\u001cU\u0093{ült%üÏ=[ÉéR£\u0012Ù\u007f/\u0083F<õ¼\u000e\u0089v6\u000e\u0003Õ÷½Û\u009b\u0099ÊÛ{\u0010Zp\u008fÇP\u00ad\u000eØX<t5«3\fèpÃ\u009fó\u001fÒ5\u0018ÅµPÃ\u0004B7F\u000fP6C\u0092\u008a5A\u0011\u0019]Ø@ès\u0007\\ÞK\u0014Tcsç§mÝÑ\u000b|üz\u0083búÁ¥´ü·yCí\u0015\trpLÚz¸Ø\u0085\u00892¤~)\u009c\rn\u0011B\u000bµ©S\u0088çåi©èT\u0004ÛTòHQóà©åß(\\\u0001\u001a\u0006\u0084ñ*\u000bá\u0089Ö(8+·®R\u001d/\u0001ùJvDfÝ'\u000b\u0080\u0012ó\u0007X¨)L_í\u0085»ôÉßZ\u0000\u009e:I{ãs\u0096\u0018\nþâÉ³'U¸¢û\u0093\u0019\u0005Öì\u0012¾«þe\u0013vÕ\r Õ*Pq{*ê¬\n´9$\u0007\u0011èóZG\u0086ÆÀ¹Ç\u0003\u008eô\u0001\u0092¥DÕÝ(H\u0018\u008dT\u008b{`\u0013Hîí\u008cîßôM\u008fþò\u0016\u0081Î\u001cÏ\u0087\u0016>d!q\u0015Ñ\u001dÆ\u009b)Ä\u008d\u009a\u001d";
      int var8 = "¦ÅÄ\b\u0014\u009d²Ø÷¯Î:k\u0094AÜA\u009a®®\u0001³´aí5^ÁWøCÒ\u0005\u0017Ø¸±Áû\u007f\u0010ÖXU ÿªÏéÖF>QaÎ°¢\u0018\"\u001e\u008b4£\u008f%1\n\u008d\u0094å\u000f§4K®²N-à]\u008f (\u001cU\u0093{ült%üÏ=[ÉéR£\u0012Ù\u007f/\u0083F<õ¼\u000e\u0089v6\u000e\u0003Õ÷½Û\u009b\u0099ÊÛ{\u0010Zp\u008fÇP\u00ad\u000eØX<t5«3\fèpÃ\u009fó\u001fÒ5\u0018ÅµPÃ\u0004B7F\u000fP6C\u0092\u008a5A\u0011\u0019]Ø@ès\u0007\\ÞK\u0014Tcsç§mÝÑ\u000b|üz\u0083búÁ¥´ü·yCí\u0015\trpLÚz¸Ø\u0085\u00892¤~)\u009c\rn\u0011B\u000bµ©S\u0088çåi©èT\u0004ÛTòHQóà©åß(\\\u0001\u001a\u0006\u0084ñ*\u000bá\u0089Ö(8+·®R\u001d/\u0001ùJvDfÝ'\u000b\u0080\u0012ó\u0007X¨)L_í\u0085»ôÉßZ\u0000\u009e:I{ãs\u0096\u0018\nþâÉ³'U¸¢û\u0093\u0019\u0005Öì\u0012¾«þe\u0013vÕ\r Õ*Pq{*ê¬\n´9$\u0007\u0011èóZG\u0086ÆÀ¹Ç\u0003\u008eô\u0001\u0092¥DÕÝ(H\u0018\u008dT\u008b{`\u0013Hîí\u008cîßôM\u008fþò\u0016\u0081Î\u001cÏ\u0087\u0016>d!q\u0015Ñ\u001dÆ\u009b)Ä\u008d\u009a\u001d"
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
                     c = new String[12];
                     _k5 = LogManager.getLogger();
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

                  var6 = "¾Û\u0010\u009c\u0018û\u0089¡\u001e´`\u00036@\u0096Ü\u008cÿ§uÌp°·\u0002åîî\u001a.ÉÃÂ5%¾¼d0Ê,ã\u0000¤VI\u009a³(]ûV\u0007Å\u0012{èÅ\bÃßäþå\u0096\u008f\u001d\"ãÄ\u0080á\\\u0003\u0091ñ\u0096áö\u0081Ð\bø_ðó¬\bü";
                  var8 = "¾Û\u0010\u009c\u0018û\u0089¡\u001e´`\u00036@\u0096Ü\u008cÿ§uÌp°·\u0002åîî\u001a.ÉÃÂ5%¾¼d0Ê,ã\u0000¤VI\u009a³(]ûV\u0007Å\u0012{èÅ\bÃßäþå\u0096\u008f\u001d\"ãÄ\u0080á\\\u0003\u0091ñ\u0096áö\u0081Ð\bø_ðó¬\bü"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18888;
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
            throw new RuntimeException("gvi", var10);
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
         throw new RuntimeException("gvi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
