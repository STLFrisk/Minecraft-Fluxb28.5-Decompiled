import com.google.gson.JsonObject;
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

public class la7 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public la7() {
      this(false, true, 1, 0, 1, 0, 32774);
   }

   public la7(int var1, int var2, int var3) {
      this(false, false, var1, var2, var1, var2, var3);
   }

   public la7(int var1, int var2, int var3, int var4, int var5) {
      this(true, false, var1, var2, var3, var4, var5);
   }

   public void bsl() {
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
      // 06: ifeq 23
      // 09: getstatic la7.l_3 Lla7;
      // 0c: invokevirtual la7.equals (Ljava/lang/Object;)Z
      // 0f: ifne c4
      // 12: goto 19
      // 15: invokestatic la7.a (Loov;)Loov;
      // 18: athrow
      // 19: getstatic la7.l_3 Lla7;
      // 1c: goto 23
      // 1f: invokestatic la7.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 1
      // 24: ifeq 67
      // 27: ifnull 50
      // 2a: goto 31
      // 2d: invokestatic la7.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield la7.y6a Z
      // 35: iload 1
      // 36: ifeq 86
      // 39: goto 40
      // 3c: invokestatic la7.a (Loov;)Loov;
      // 3f: athrow
      // 40: getstatic la7.l_3 Lla7;
      // 43: invokevirtual la7.i9_ ()Z
      // 46: if_icmpeq 7b
      // 49: goto 50
      // 4c: invokestatic la7.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: putstatic la7.l_3 Lla7;
      // 54: iload 1
      // 55: ifeq 77
      // 58: goto 5f
      // 5b: invokestatic la7.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: goto 67
      // 63: invokestatic la7.a (Loov;)Loov;
      // 66: athrow
      // 67: getfield la7.y6a Z
      // 6a: ifeq 78
      // 6d: invokestatic hzu.ux6 ()V
      // 70: goto 77
      // 73: invokestatic la7.a (Loov;)Loov;
      // 76: athrow
      // 77: return
      // 78: invokestatic hzu.spd ()V
      // 7b: aload 0
      // 7c: getfield la7.qgd I
      // 7f: invokestatic org/lwjgl/opengl/GL14.glBlendEquation (I)V
      // 82: aload 0
      // 83: getfield la7.n6j Z
      // 86: iload 1
      // 87: ifeq bd
      // 8a: ifeq b2
      // 8d: goto 94
      // 90: invokestatic la7.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: getfield la7.dwi I
      // 98: aload 0
      // 99: getfield la7.hfd I
      // 9c: aload 0
      // 9d: getfield la7.yy5 I
      // a0: aload 0
      // a1: getfield la7.mjx I
      // a4: invokestatic hzu.u39 (IIII)V
      // a7: iload 1
      // a8: ifne c4
      // ab: goto b2
      // ae: invokestatic la7.a (Loov;)Loov;
      // b1: athrow
      // b2: aload 0
      // b3: getfield la7.dwi I
      // b6: goto bd
      // b9: invokestatic la7.a (Loov;)Loov;
      // bc: athrow
      // bd: aload 0
      // be: getfield la7.hfd I
      // c1: invokestatic hzu.ru7 (II)V
      // c4: return
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 01b
      // 009: aload 1
      // 00a: if_acmpne 01a
      // 00d: goto 014
      // 010: invokestatic la7.a (Loov;)Loov;
      // 013: athrow
      // 014: bipush 1
      // 015: ireturn
      // 016: invokestatic la7.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 1
      // 01b: iload 2
      // 01c: ifne 033
      // 01f: instanceof la7
      // 022: ifne 032
      // 025: goto 02c
      // 028: invokestatic la7.a (Loov;)Loov;
      // 02b: athrow
      // 02c: bipush 0
      // 02d: ireturn
      // 02e: invokestatic la7.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 1
      // 033: checkcast la7
      // 036: astore 3
      // 037: aload 0
      // 038: getfield la7.qgd I
      // 03b: aload 3
      // 03c: getfield la7.qgd I
      // 03f: iload 2
      // 040: ifne 05d
      // 043: if_icmpeq 055
      // 046: goto 04d
      // 049: invokestatic la7.a (Loov;)Loov;
      // 04c: athrow
      // 04d: bipush 0
      // 04e: goto 106
      // 051: invokestatic la7.a (Loov;)Loov;
      // 054: athrow
      // 055: aload 0
      // 056: getfield la7.mjx I
      // 059: aload 3
      // 05a: getfield la7.mjx I
      // 05d: iload 2
      // 05e: ifne 07b
      // 061: if_icmpeq 073
      // 064: goto 06b
      // 067: invokestatic la7.a (Loov;)Loov;
      // 06a: athrow
      // 06b: bipush 0
      // 06c: goto 106
      // 06f: invokestatic la7.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield la7.hfd I
      // 077: aload 3
      // 078: getfield la7.hfd I
      // 07b: iload 2
      // 07c: ifne 099
      // 07f: if_icmpeq 091
      // 082: goto 089
      // 085: invokestatic la7.a (Loov;)Loov;
      // 088: athrow
      // 089: bipush 0
      // 08a: goto 106
      // 08d: invokestatic la7.a (Loov;)Loov;
      // 090: athrow
      // 091: aload 0
      // 092: getfield la7.y6a Z
      // 095: aload 3
      // 096: getfield la7.y6a Z
      // 099: iload 2
      // 09a: ifne 0b7
      // 09d: if_icmpeq 0af
      // 0a0: goto 0a7
      // 0a3: invokestatic la7.a (Loov;)Loov;
      // 0a6: athrow
      // 0a7: bipush 0
      // 0a8: goto 106
      // 0ab: invokestatic la7.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield la7.n6j Z
      // 0b3: aload 3
      // 0b4: getfield la7.n6j Z
      // 0b7: iload 2
      // 0b8: ifne 0d5
      // 0bb: if_icmpeq 0cd
      // 0be: goto 0c5
      // 0c1: invokestatic la7.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: bipush 0
      // 0c6: goto 106
      // 0c9: invokestatic la7.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: getfield la7.yy5 I
      // 0d1: aload 3
      // 0d2: getfield la7.yy5 I
      // 0d5: iload 2
      // 0d6: ifne 0fe
      // 0d9: if_icmpeq 0eb
      // 0dc: goto 0e3
      // 0df: invokestatic la7.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: bipush 0
      // 0e4: goto 106
      // 0e7: invokestatic la7.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield la7.dwi I
      // 0ef: iload 2
      // 0f0: ifne 102
      // 0f3: aload 3
      // 0f4: getfield la7.dwi I
      // 0f7: goto 0fe
      // 0fa: invokestatic la7.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: if_icmpne 105
      // 101: bipush 1
      // 102: goto 106
      // 105: bipush 0
      // 106: ireturn
   }

   @Override
   public int hashCode() {
      int var2 = this.dwi;
      int var10000 = OpaquePredicate.c();
      var2 = 31 * var2 + this.yy5;
      var2 = 31 * var2 + this.hfd;
      var2 = 31 * var2 + this.mjx;
      int var1 = var10000;
      var2 = 31 * var2 + this.qgd;

      byte var10001;
      label41: {
         label40: {
            try {
               var10000 = 31 * var2;
               var10001 = this.n6j;
               if (var1 != 0) {
                  break label41;
               }

               if (this.n6j) {
                  break label40;
               }
            } catch (oov var4) {
               throw a(var4);
            }

            var10001 = 0;
            break label41;
         }

         var10001 = 1;
      }

      var2 = var10000 + var10001;

      try {
         var10000 = 31 * var2;
         if (var1 != 0) {
            return var10000 + this.y6a;
         }

         if (this.y6a) {
            return var10000 + 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000 + 0;
   }

   public boolean i9_() {
      return this.y6a;
   }

   public static la7 muj(JsonObject param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic la7.a J
      // 003: ldc2_w 102811097215360
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: ifnonnull 01c
      // 010: new la7
      // 013: dup
      // 014: invokespecial la7.<init> ()V
      // 017: areturn
      // 018: invokestatic la7.a (Loov;)Loov;
      // 01b: athrow
      // 01c: ldc 32774
      // 01e: nop
      // 01f: istore 4
      // 021: bipush 1
      // 022: istore 5
      // 024: bipush 0
      // 025: istore 6
      // 027: bipush 1
      // 028: istore 7
      // 02a: bipush 0
      // 02b: istore 8
      // 02d: bipush 1
      // 02e: istore 9
      // 030: bipush 0
      // 031: istore 10
      // 033: aload 0
      // 034: sipush 12126
      // 037: ldc2_w 2786281893164212793
      // 03a: lload 1
      // 03b: lxor
      // 03c: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: nop
      // 042: invokestatic f83.g_w (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 045: iload 3
      // 046: ifeq 095
      // 049: ifeq 083
      // 04c: goto 053
      // 04f: invokestatic la7.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: sipush 21418
      // 057: ldc2_w 7734540672035299019
      // 05a: lload 1
      // 05b: lxor
      // 05c: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 065: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 068: invokestatic la7.uq7 (Ljava/lang/String;)I
      // 06b: istore 4
      // 06d: iload 4
      // 06f: iload 3
      // 070: ifeq 095
      // 073: ldc 32774
      // 075: nop
      // 076: if_icmpeq 083
      // 079: goto 080
      // 07c: invokestatic la7.a (Loov;)Loov;
      // 07f: athrow
      // 080: bipush 0
      // 081: istore 9
      // 083: aload 0
      // 084: sipush 11013
      // 087: ldc2_w 204052184882996851
      // 08a: lload 1
      // 08b: lxor
      // 08c: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: nop
      // 092: invokestatic f83.g_w (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 095: iload 3
      // 096: ifeq 0e3
      // 099: ifeq 0d1
      // 09c: goto 0a3
      // 09f: invokestatic la7.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: sipush 17268
      // 0a7: ldc2_w 5627502184742719001
      // 0aa: lload 1
      // 0ab: lxor
      // 0ac: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: nop
      // 0b2: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0b5: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0b8: invokestatic la7._f1 (Ljava/lang/String;)I
      // 0bb: istore 5
      // 0bd: iload 5
      // 0bf: iload 3
      // 0c0: ifeq 0e3
      // 0c3: bipush 1
      // 0c4: if_icmpeq 0d1
      // 0c7: goto 0ce
      // 0ca: invokestatic la7.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: bipush 0
      // 0cf: istore 9
      // 0d1: aload 0
      // 0d2: sipush 27838
      // 0d5: ldc2_w 1029753674841334228
      // 0d8: lload 1
      // 0d9: lxor
      // 0da: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: nop
      // 0e0: invokestatic f83.g_w (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 0e3: iload 3
      // 0e4: ifeq 130
      // 0e7: ifeq 11e
      // 0ea: goto 0f1
      // 0ed: invokestatic la7.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: sipush 3859
      // 0f5: ldc2_w 2680119099578106480
      // 0f8: lload 1
      // 0f9: lxor
      // 0fa: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 103: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 106: invokestatic la7._f1 (Ljava/lang/String;)I
      // 109: istore 6
      // 10b: iload 6
      // 10d: iload 3
      // 10e: ifeq 130
      // 111: ifeq 11e
      // 114: goto 11b
      // 117: invokestatic la7.a (Loov;)Loov;
      // 11a: athrow
      // 11b: bipush 0
      // 11c: istore 9
      // 11e: aload 0
      // 11f: sipush 29524
      // 122: ldc2_w 8599830906435485242
      // 125: lload 1
      // 126: lxor
      // 127: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: nop
      // 12d: invokestatic f83.g_w (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 130: iload 3
      // 131: ifeq 181
      // 134: ifeq 16f
      // 137: goto 13e
      // 13a: invokestatic la7.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: sipush 29524
      // 142: ldc2_w 8599830906435485242
      // 145: lload 1
      // 146: lxor
      // 147: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: nop
      // 14d: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 150: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 153: invokestatic la7._f1 (Ljava/lang/String;)I
      // 156: istore 7
      // 158: iload 7
      // 15a: iload 3
      // 15b: ifeq 16d
      // 15e: bipush 1
      // 15f: if_icmpeq 16c
      // 162: goto 169
      // 165: invokestatic la7.a (Loov;)Loov;
      // 168: athrow
      // 169: bipush 0
      // 16a: istore 9
      // 16c: bipush 1
      // 16d: istore 10
      // 16f: aload 0
      // 170: sipush 2496
      // 173: ldc2_w 7607066623979734181
      // 176: lload 1
      // 177: lxor
      // 178: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: nop
      // 17e: invokestatic f83.g_w (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 181: iload 3
      // 182: ifeq 1c1
      // 185: ifeq 1bf
      // 188: goto 18f
      // 18b: invokestatic la7.a (Loov;)Loov;
      // 18e: athrow
      // 18f: aload 0
      // 190: sipush 2496
      // 193: ldc2_w 7607066623979734181
      // 196: lload 1
      // 197: lxor
      // 198: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: nop
      // 19e: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1a1: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1a4: invokestatic la7._f1 (Ljava/lang/String;)I
      // 1a7: istore 8
      // 1a9: iload 8
      // 1ab: iload 3
      // 1ac: ifeq 1bd
      // 1af: ifeq 1bc
      // 1b2: goto 1b9
      // 1b5: invokestatic la7.a (Loov;)Loov;
      // 1b8: athrow
      // 1b9: bipush 0
      // 1ba: istore 9
      // 1bc: bipush 1
      // 1bd: istore 10
      // 1bf: iload 9
      // 1c1: iload 3
      // 1c2: ifeq 1df
      // 1c5: ifeq 1dd
      // 1c8: goto 1cf
      // 1cb: invokestatic la7.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: new la7
      // 1d2: dup
      // 1d3: invokespecial la7.<init> ()V
      // 1d6: goto 207
      // 1d9: invokestatic la7.a (Loov;)Loov;
      // 1dc: athrow
      // 1dd: iload 10
      // 1df: ifeq 1fa
      // 1e2: new la7
      // 1e5: dup
      // 1e6: iload 5
      // 1e8: iload 6
      // 1ea: iload 7
      // 1ec: iload 8
      // 1ee: iload 4
      // 1f0: invokespecial la7.<init> (IIIII)V
      // 1f3: goto 207
      // 1f6: invokestatic la7.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: new la7
      // 1fd: dup
      // 1fe: iload 5
      // 200: iload 6
      // 202: iload 4
      // 204: invokespecial la7.<init> (III)V
      // 207: areturn
   }

   private static int uq7(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic la7.a J
      // 003: ldc2_w 120824063056841
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 010: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 013: astore 4
      // 015: aload 4
      // 017: sipush 15046
      // 01a: ldc2_w 2609450717330709988
      // 01d: lload 1
      // 01e: lxor
      // 01f: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: nop
      // 025: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 028: iload 3
      // 029: ifne 053
      // 02c: ifeq 040
      // 02f: goto 036
      // 032: invokestatic la7.a (Loov;)Loov;
      // 035: athrow
      // 036: ldc 32774
      // 038: nop
      // 039: goto 11a
      // 03c: invokestatic la7.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 4
      // 042: sipush 2150
      // 045: ldc2_w 6066376208295243590
      // 048: lload 1
      // 049: lxor
      // 04a: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: nop
      // 050: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 053: iload 3
      // 054: ifne 07e
      // 057: ifeq 06b
      // 05a: goto 061
      // 05d: invokestatic la7.a (Loov;)Loov;
      // 060: athrow
      // 061: ldc 32778
      // 063: nop
      // 064: goto 11a
      // 067: invokestatic la7.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 4
      // 06d: sipush 25575
      // 070: ldc2_w 5102390667545232599
      // 073: lload 1
      // 074: lxor
      // 075: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: nop
      // 07b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07e: iload 3
      // 07f: ifne 0a9
      // 082: ifeq 096
      // 085: goto 08c
      // 088: invokestatic la7.a (Loov;)Loov;
      // 08b: athrow
      // 08c: ldc 32779
      // 08e: nop
      // 08f: goto 11a
      // 092: invokestatic la7.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 4
      // 098: sipush 10028
      // 09b: ldc2_w 6302899714565341197
      // 09e: lload 1
      // 09f: lxor
      // 0a0: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: nop
      // 0a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a9: iload 3
      // 0aa: ifne 0d4
      // 0ad: ifeq 0c1
      // 0b0: goto 0b7
      // 0b3: invokestatic la7.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: ldc 32779
      // 0b9: nop
      // 0ba: goto 11a
      // 0bd: invokestatic la7.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 4
      // 0c3: sipush 17836
      // 0c6: ldc2_w 4702105783891583623
      // 0c9: lload 1
      // 0ca: lxor
      // 0cb: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d4: iload 3
      // 0d5: ifne 0ff
      // 0d8: ifeq 0ec
      // 0db: goto 0e2
      // 0de: invokestatic la7.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ldc 32775
      // 0e4: nop
      // 0e5: goto 11a
      // 0e8: invokestatic la7.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 4
      // 0ee: sipush 16599
      // 0f1: ldc2_w 2283122979094849509
      // 0f4: lload 1
      // 0f5: lxor
      // 0f6: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: nop
      // 0fc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ff: iload 3
      // 100: ifne 119
      // 103: ifeq 117
      // 106: goto 10d
      // 109: invokestatic la7.a (Loov;)Loov;
      // 10c: athrow
      // 10d: ldc 32776
      // 10f: nop
      // 110: goto 11a
      // 113: invokestatic la7.a (Loov;)Loov;
      // 116: athrow
      // 117: ldc 32774
      // 119: nop
      // 11a: ireturn
   }

   private static int _f1(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic la7.a J
      // 003: ldc2_w 114458802538688
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 00c: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 00f: astore 4
      // 011: aload 4
      // 013: ldc "_"
      // 015: nop
      // 016: ldc ""
      // 018: nop
      // 019: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 01c: astore 4
      // 01e: invokestatic OpaquePredicate.c ()I
      // 021: aload 4
      // 023: sipush 10323
      // 026: ldc2_w 2891623761216019583
      // 029: lload 1
      // 02a: lxor
      // 02b: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: ldc "1"
      // 033: nop
      // 034: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 037: astore 4
      // 039: istore 3
      // 03a: aload 4
      // 03c: sipush 14790
      // 03f: ldc2_w 8784292370055532000
      // 042: lload 1
      // 043: lxor
      // 044: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: nop
      // 04a: ldc "0"
      // 04c: nop
      // 04d: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 050: astore 4
      // 052: aload 4
      // 054: sipush 29799
      // 057: ldc2_w 5136193535974981699
      // 05a: lload 1
      // 05b: lxor
      // 05c: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: nop
      // 062: ldc "-"
      // 064: nop
      // 065: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 068: astore 4
      // 06a: aload 4
      // 06c: ldc "0"
      // 06e: nop
      // 06f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 072: iload 3
      // 073: ifne 090
      // 076: ifeq 088
      // 079: goto 080
      // 07c: invokestatic la7.a (Loov;)Loov;
      // 07f: athrow
      // 080: bipush 0
      // 081: goto 1fb
      // 084: invokestatic la7.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 4
      // 08a: ldc "1"
      // 08c: nop
      // 08d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 090: iload 3
      // 091: ifne 0b9
      // 094: ifeq 0a6
      // 097: goto 09e
      // 09a: invokestatic la7.a (Loov;)Loov;
      // 09d: athrow
      // 09e: bipush 1
      // 09f: goto 1fb
      // 0a2: invokestatic la7.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 4
      // 0a8: sipush 30996
      // 0ab: ldc2_w 6930140887373204782
      // 0ae: lload 1
      // 0af: lxor
      // 0b0: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: nop
      // 0b6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b9: iload 3
      // 0ba: ifne 0e4
      // 0bd: ifeq 0d1
      // 0c0: goto 0c7
      // 0c3: invokestatic la7.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: sipush 768
      // 0ca: goto 1fb
      // 0cd: invokestatic la7.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 4
      // 0d3: sipush 23958
      // 0d6: ldc2_w 1735989298004519337
      // 0d9: lload 1
      // 0da: lxor
      // 0db: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: nop
      // 0e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e4: iload 3
      // 0e5: ifne 10f
      // 0e8: ifeq 0fc
      // 0eb: goto 0f2
      // 0ee: invokestatic la7.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: sipush 769
      // 0f5: goto 1fb
      // 0f8: invokestatic la7.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 4
      // 0fe: sipush 17299
      // 101: ldc2_w 8552490643006224303
      // 104: lload 1
      // 105: lxor
      // 106: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10f: iload 3
      // 110: ifne 13a
      // 113: ifeq 127
      // 116: goto 11d
      // 119: invokestatic la7.a (Loov;)Loov;
      // 11c: athrow
      // 11d: sipush 774
      // 120: goto 1fb
      // 123: invokestatic la7.a (Loov;)Loov;
      // 126: athrow
      // 127: aload 4
      // 129: sipush 15829
      // 12c: ldc2_w 2080256217763711467
      // 12f: lload 1
      // 130: lxor
      // 131: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: nop
      // 137: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 13a: iload 3
      // 13b: ifne 165
      // 13e: ifeq 152
      // 141: goto 148
      // 144: invokestatic la7.a (Loov;)Loov;
      // 147: athrow
      // 148: sipush 775
      // 14b: goto 1fb
      // 14e: invokestatic la7.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 4
      // 154: sipush 7316
      // 157: ldc2_w 1497562197426055337
      // 15a: lload 1
      // 15b: lxor
      // 15c: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: nop
      // 162: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 165: iload 3
      // 166: ifne 190
      // 169: ifeq 17d
      // 16c: goto 173
      // 16f: invokestatic la7.a (Loov;)Loov;
      // 172: athrow
      // 173: sipush 770
      // 176: goto 1fb
      // 179: invokestatic la7.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 4
      // 17f: sipush 10003
      // 182: ldc2_w 5804105523532993340
      // 185: lload 1
      // 186: lxor
      // 187: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: nop
      // 18d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 190: iload 3
      // 191: ifne 1bb
      // 194: ifeq 1a8
      // 197: goto 19e
      // 19a: invokestatic la7.a (Loov;)Loov;
      // 19d: athrow
      // 19e: sipush 771
      // 1a1: goto 1fb
      // 1a4: invokestatic la7.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 4
      // 1aa: sipush 10468
      // 1ad: ldc2_w 3706553340595379420
      // 1b0: lload 1
      // 1b1: lxor
      // 1b2: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: nop
      // 1b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bb: iload 3
      // 1bc: ifne 1e6
      // 1bf: ifeq 1d3
      // 1c2: goto 1c9
      // 1c5: invokestatic la7.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: sipush 772
      // 1cc: goto 1fb
      // 1cf: invokestatic la7.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: aload 4
      // 1d5: sipush 4102
      // 1d8: ldc2_w 4165856642181538854
      // 1db: lload 1
      // 1dc: lxor
      // 1dd: invokedynamic p (IJ)Ljava/lang/String; bsm=la7.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: nop
      // 1e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e6: iload 3
      // 1e7: ifne 1f7
      // 1ea: ifeq 1fa
      // 1ed: goto 1f4
      // 1f0: invokestatic la7.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: sipush 773
      // 1f7: goto 1fb
      // 1fa: bipush -1
      // 1fb: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-706561891212997292L, 7895036171551907028L, MethodHandles.lookup().lookupClass()).a(256842901530364L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 26309221609644L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[25];
      int var7 = 0;
      String var6 = "o¸Z®êUpOÀ\u0086Bå\u0011\u0086 \u008c\b²\u0098Ó.xy\u0093 \u0017\u0005¡\b!\u0001m\u009a±|\u0097\u000bÌÉ>ªKûx3ÍÁÑë\u001bÈ$TX\u0000¹\u009c\u0010b\u008e\u0002)Ë:\u0018¯ý¯&Ö\u0096ªg\u0006\u0010,Ðþ)+\u009a\u0006s>«\u008e\u0081ÄØ²j\u0010åÀ¼Þ\u0080\"câùpxsù\r\u000e_\u0010\u008b\u0087)z|\u0004*4\u0014Ôxãôe0\u0080(\u0085öz¨\u008dtÈ|\nÁÖê\fÜF%y\u00990:\u0018DXf²\u009cuB\u001a÷læêô&u°Û4\u008d \u0014¹\u001fÿ&½\tn\u0002Q{·U<TÂ³Þ}&Ôi\u001d¹üßí\u000125U\\\u0010b\u0004õçUÆ\u001c+¢\u0081\u0012±e\u0017Eð\u0010±Z\"ý¥\u0094¨í!\u0091ÔOA\u009b\u0098x\u0010Ï\u000b·QrEa\u0088=âp\u009fïÐ`¦\u0018zä=ô®s\u0097cÑ\u0086-È\u0093¾)\u008f+³\rÓ\u0098\u0013\u001cK\u0010\u00ad&\u000e\u0001uà¹&\u0088\u00ad&}\fÄE\u0011\u0010\u000bÍ\u009aè\u008fÂðñ\u0090Q\u0085§\u0094nçì L8£W·|·¿\u0019\u0001\u0012\u0016K\"\u0093Ê_\u000f%7Ä \u008e\u008b«;\u008f\u0082\u0005°b\u001e\u0010/ÂY`Û¼Â)\u0080\u0001\u007f\u0002Ù\u0014\u000f\u0001 Ú1ß\u008cÌB\u009fÓ\u008b |\u008c®&\u0088ï\u0098¨f\u0096¹\u0098+ÊÆ\u0005rdñsÚò \n\u0097\u0090Ñ-ÒÅõ\u0017ì'Ú:Ë\\l9\u000fWCý÷KS6\u009aío1\u007f÷/ j\u0015RI\bÈ!7¼\\¨õQ?»\u0006ÁÃ\u0002\u001atúÐ¿À\u0089~\u0090\u009f¯\u00919 \u000eé\u0095\u0092\u008a\u0000°ÄoQ³Wì\u0084µtö¥\u0013\u0016\u0080\u00ad\u000e\u0007ü\fO1¿<ë\u0082\u0018®m@è®P\u0016sQÇ:Nì}@³#6Á\u001eÔNúN\u0010¬ÈB\u0001ñ+´Ä÷u/ik\nÀ\u0004\u0018e8-$Bçéß\u0000\u0083ªr\u0095Ã´Ý.ü\b{ë0\u0001¨";
      int var8 = "o¸Z®êUpOÀ\u0086Bå\u0011\u0086 \u008c\b²\u0098Ó.xy\u0093 \u0017\u0005¡\b!\u0001m\u009a±|\u0097\u000bÌÉ>ªKûx3ÍÁÑë\u001bÈ$TX\u0000¹\u009c\u0010b\u008e\u0002)Ë:\u0018¯ý¯&Ö\u0096ªg\u0006\u0010,Ðþ)+\u009a\u0006s>«\u008e\u0081ÄØ²j\u0010åÀ¼Þ\u0080\"câùpxsù\r\u000e_\u0010\u008b\u0087)z|\u0004*4\u0014Ôxãôe0\u0080(\u0085öz¨\u008dtÈ|\nÁÖê\fÜF%y\u00990:\u0018DXf²\u009cuB\u001a÷læêô&u°Û4\u008d \u0014¹\u001fÿ&½\tn\u0002Q{·U<TÂ³Þ}&Ôi\u001d¹üßí\u000125U\\\u0010b\u0004õçUÆ\u001c+¢\u0081\u0012±e\u0017Eð\u0010±Z\"ý¥\u0094¨í!\u0091ÔOA\u009b\u0098x\u0010Ï\u000b·QrEa\u0088=âp\u009fïÐ`¦\u0018zä=ô®s\u0097cÑ\u0086-È\u0093¾)\u008f+³\rÓ\u0098\u0013\u001cK\u0010\u00ad&\u000e\u0001uà¹&\u0088\u00ad&}\fÄE\u0011\u0010\u000bÍ\u009aè\u008fÂðñ\u0090Q\u0085§\u0094nçì L8£W·|·¿\u0019\u0001\u0012\u0016K\"\u0093Ê_\u000f%7Ä \u008e\u008b«;\u008f\u0082\u0005°b\u001e\u0010/ÂY`Û¼Â)\u0080\u0001\u007f\u0002Ù\u0014\u000f\u0001 Ú1ß\u008cÌB\u009fÓ\u008b |\u008c®&\u0088ï\u0098¨f\u0096¹\u0098+ÊÆ\u0005rdñsÚò \n\u0097\u0090Ñ-ÒÅõ\u0017ì'Ú:Ë\\l9\u000fWCý÷KS6\u009aío1\u007f÷/ j\u0015RI\bÈ!7¼\\¨õQ?»\u0006ÁÃ\u0002\u001atúÐ¿À\u0089~\u0090\u009f¯\u00919 \u000eé\u0095\u0092\u008a\u0000°ÄoQ³Wì\u0084µtö¥\u0013\u0016\u0080\u00ad\u000e\u0007ü\fO1¿<ë\u0082\u0018®m@è®P\u0016sQÇ:Nì}@³#6Á\u001eÔNúN\u0010¬ÈB\u0001ñ+´Ä÷u/ik\nÀ\u0004\u0018e8-$Bçéß\u0000\u0083ªr\u0095Ã´Ý.ü\b{ë0\u0001¨"
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
                     c = new String[25];
                     l_3 = null;
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

                  var6 = "6*¡RÆçFÈâq²Q¯±\u0094ðýy]çÙ/\u0098\u009c/Uëýè\u0004\u008a¢\u00106æs~\u009fn2þ\u0098ÛLOï²V\u001a";
                  var8 = "6*¡RÆçFÈâq²Q¯±\u0094ðýy]çÙ/\u0098\u009c/Uëýè\u0004\u008a¢\u00106æs~\u009fn2þ\u0098ÛLOï²V\u001a".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9372;
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
            throw new RuntimeException("la7", var10);
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
         throw new RuntimeException("la7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
