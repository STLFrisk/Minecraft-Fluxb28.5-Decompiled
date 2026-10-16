import com.google.common.base.Charsets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;
import org.lwjgl.util.vector.Matrix4f;

public class qn4 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public qn4(lc5 var1, y99 var2, oru var3, gdz var4) {
      this.omd = var2;
      this._px = var3;
      this.xx5 = 0.0F;
      this.mas = 0.0F;
      this.nww = var3.r_a;
      this.btl = var3.s1h;
      this.cdk = var4.toString();
      this.ctg();
      this.ndq(var1, var4);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void ndq(lc5 var1, gdz var2) {
      long var3 = a ^ 82898723300103L;
      JsonParser var6 = new JsonParser();
      int var10000 = t9d.c();
      InputStream var7 = null;
      int var5 = var10000;
      boolean var24 = false /* VF: Semaphore variable */;

      try {
         label156: {
            var24 = true;
            yaa var8 = this.omd.td5(var2);
            var7 = var8.f_4();
            JsonObject var32 = var6.parse(IOUtils.toString(var7, Charsets.UTF_8)).getAsJsonObject();

            String var10001;
            label147: {
               label146: {
                  label157: {
                     try {
                        var44 = f83.yrq(var32, a<"w">(3417, 6059541176656382574L ^ var3));
                        if (var5 != 0) {
                           break label146;
                        }

                        if (!var44) {
                           break label157;
                        }
                     } catch (Exception var29) {
                        throw a(var29);
                     }

                     JsonArray var10 = var32.getAsJsonArray(a<"w">(13234, 1224815896175047835L ^ var3));
                     int var11 = 0;

                     for (JsonElement var13 : var10) {
                        try {
                           this.kxu(var13);
                        } catch (Exception var26) {
                           kcc var15 = kcc.slw(var26);
                           var15.n8f(a<"w">(1408, 8389140307971490454L ^ var3) + var11 + "]");
                           throw var15;
                        }

                        if (var5 != 0) {
                           var24 = false;
                           return;
                        }

                        var11++;
                        if (var5 != 0) {
                           break;
                        }
                     }
                  }

                  try {
                     var45 = var32;
                     var10001 = a<"w">(23248, 6072808197317008895L ^ var3);
                     if (var5 != 0) {
                        break label147;
                     }

                     var44 = f83.yrq(var32, var10001);
                  } catch (Exception var28) {
                     throw a(var28);
                  }
               }

               try {
                  if (!var44) {
                     var24 = false;
                     break label156;
                  }

                  var45 = var32;
                  var10001 = a<"w">(14767, 1337347737407061651L ^ var3);
               } catch (Exception var27) {
                  throw a(var27);
               }
            }

            JsonArray var33 = var45.getAsJsonArray(var10001);
            int var34 = 0;

            for (JsonElement var36 : var33) {
               try {
                  this.l5e(var1, var36);
               } catch (Exception var25) {
                  kcc var37 = kcc.slw(var25);
                  var37.n8f(a<"w">(3304, 1530991453209185227L ^ var3) + var34 + "]");
                  throw var37;
               }

               if (var5 != 0) {
                  var24 = false;
                  return;
               }

               var34++;
               if (var5 != 0) {
                  var24 = false;
                  break label156;
               }
            }

            var24 = false;
         }
      } catch (Exception var30) {
         kcc var9 = kcc.slw(var30);
         var9.oic(var2.xyp());
         throw var9;
      } finally {
         if (var24) {
            IOUtils.closeQuietly(var7);
         }
      }

      IOUtils.closeQuietly(var7);
   }

   private void kxu(JsonElement param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qn4.a J
      // 03: ldc2_w 96064027854635
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifeq 44
      // 13: invokestatic f83.ndv (Lcom/google/gson/JsonElement;)Z
      // 16: ifeq 3c
      // 19: goto 20
      // 1c: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 25: aload 0
      // 26: getfield qn4.nww I
      // 29: aload 0
      // 2a: getfield qn4.btl I
      // 2d: invokevirtual qn4.eng (Ljava/lang/String;II)V
      // 30: iload 4
      // 32: ifne ee
      // 35: goto 3c
      // 38: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 1
      // 3d: goto 44
      // 40: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: sipush 8575
      // 47: ldc2_w 7450828593169859192
      // 4a: lload 2
      // 4b: lxor
      // 4c: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: nop
      // 52: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 55: astore 5
      // 57: aload 5
      // 59: sipush 20934
      // 5c: ldc2_w 9041978844764893918
      // 5f: lload 2
      // 60: lxor
      // 61: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 6a: astore 6
      // 6c: aload 5
      // 6e: sipush 19739
      // 71: ldc2_w 3284033722643672613
      // 74: lload 2
      // 75: lxor
      // 76: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: nop
      // 7c: aload 0
      // 7d: getfield qn4.nww I
      // 80: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 83: istore 7
      // 85: aload 5
      // 87: sipush 4439
      // 8a: ldc2_w 7088133762769728074
      // 8d: lload 2
      // 8e: lxor
      // 8f: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: nop
      // 95: aload 0
      // 96: getfield qn4.btl I
      // 99: invokestatic f83.wt9 (Lcom/google/gson/JsonObject;Ljava/lang/String;I)I
      // 9c: istore 8
      // 9e: aload 0
      // 9f: iload 4
      // a1: ifeq e5
      // a4: getfield qn4.we5 Ljava/util/Map;
      // a7: aload 6
      // a9: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // ae: ifeq e4
      // b1: goto b8
      // b4: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b7: athrow
      // b8: new kcc
      // bb: dup
      // bc: new java/lang/StringBuilder
      // bf: dup
      // c0: invokespecial java/lang/StringBuilder.<init> ()V
      // c3: aload 6
      // c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c8: sipush 31958
      // cb: ldc2_w 143716377474588615
      // ce: lload 2
      // cf: lxor
      // d0: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: nop
      // d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // dc: invokespecial kcc.<init> (Ljava/lang/String;)V
      // df: athrow
      // e0: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // e3: athrow
      // e4: aload 0
      // e5: aload 6
      // e7: iload 7
      // e9: iload 8
      // eb: invokevirtual qn4.eng (Ljava/lang/String;II)V
      // ee: return
   }

   private void l5e(lc5 param1, JsonElement param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qn4.a J
      // 003: ldc2_w 104886835043269
      // 006: lxor
      // 007: lstore 3
      // 008: aload 2
      // 009: sipush 3557
      // 00c: ldc2_w 3202068460401193497
      // 00f: lload 3
      // 010: lxor
      // 011: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 01a: astore 6
      // 01c: aload 6
      // 01e: sipush 8081
      // 021: ldc2_w 888408538898063468
      // 024: lload 3
      // 025: lxor
      // 026: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: nop
      // 02c: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 02f: astore 7
      // 031: aload 6
      // 033: sipush 24948
      // 036: ldc2_w 8482829947986026112
      // 039: lload 3
      // 03a: lxor
      // 03b: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: nop
      // 041: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 044: astore 8
      // 046: aload 6
      // 048: sipush 26199
      // 04b: ldc2_w 1148716634954209696
      // 04e: lload 3
      // 04f: lxor
      // 050: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: nop
      // 056: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 059: astore 9
      // 05b: aload 0
      // 05c: aload 8
      // 05e: invokespecial qn4.pq2 (Ljava/lang/String;)Loru;
      // 061: astore 10
      // 063: invokestatic t9d.b ()I
      // 066: aload 0
      // 067: aload 9
      // 069: invokespecial qn4.pq2 (Ljava/lang/String;)Loru;
      // 06c: astore 11
      // 06e: istore 5
      // 070: aload 10
      // 072: iload 5
      // 074: ifeq 0c0
      // 077: ifnonnull 0be
      // 07a: goto 081
      // 07d: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 080: athrow
      // 081: new kcc
      // 084: dup
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: sipush 25760
      // 08f: ldc2_w 8896692978503686976
      // 092: lload 3
      // 093: lxor
      // 094: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: nop
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: aload 8
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: sipush 6441
      // 0a5: ldc2_w 7885975258704963267
      // 0a8: lload 3
      // 0a9: lxor
      // 0aa: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: nop
      // 0b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b6: invokespecial kcc.<init> (Ljava/lang/String;)V
      // 0b9: athrow
      // 0ba: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 11
      // 0c0: ifnonnull 100
      // 0c3: new kcc
      // 0c6: dup
      // 0c7: new java/lang/StringBuilder
      // 0ca: dup
      // 0cb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ce: sipush 1521
      // 0d1: ldc2_w 1016619032845220382
      // 0d4: lload 3
      // 0d5: lxor
      // 0d6: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: nop
      // 0dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0df: aload 9
      // 0e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e4: sipush 10949
      // 0e7: ldc2_w 3683304254292841767
      // 0ea: lload 3
      // 0eb: lxor
      // 0ec: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: nop
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f8: invokespecial kcc.<init> (Ljava/lang/String;)V
      // 0fb: athrow
      // 0fc: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 0
      // 101: aload 7
      // 103: aload 10
      // 105: aload 11
      // 107: invokevirtual qn4.j4i (Ljava/lang/String;Loru;Loru;)Luix;
      // 10a: astore 12
      // 10c: aload 6
      // 10e: sipush 292
      // 111: ldc2_w 3761933040613457630
      // 114: lload 3
      // 115: lxor
      // 116: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: nop
      // 11c: aconst_null
      // 11d: checkcast com/google/gson/JsonArray
      // 120: invokestatic f83.zf2 (Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonArray;)Lcom/google/gson/JsonArray;
      // 123: astore 13
      // 125: aload 13
      // 127: iload 5
      // 129: ifeq 359
      // 12c: ifnull 342
      // 12f: goto 136
      // 132: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: bipush 0
      // 137: istore 14
      // 139: aload 13
      // 13b: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 13e: astore 15
      // 140: aload 15
      // 142: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 147: ifeq 342
      // 14a: aload 15
      // 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 151: checkcast com/google/gson/JsonElement
      // 154: astore 16
      // 156: aload 16
      // 158: sipush 28999
      // 15b: ldc2_w 449488945127067296
      // 15e: lload 3
      // 15f: lxor
      // 160: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: nop
      // 166: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 169: astore 17
      // 16b: aload 17
      // 16d: sipush 8081
      // 170: ldc2_w 888408538898063468
      // 173: lload 3
      // 174: lxor
      // 175: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: nop
      // 17b: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 17e: astore 18
      // 180: aload 17
      // 182: sipush 12770
      // 185: ldc2_w 5682109257371045382
      // 188: lload 3
      // 189: lxor
      // 18a: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: nop
      // 190: iload 5
      // 192: ifeq 352
      // 195: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 198: astore 19
      // 19a: aload 0
      // 19b: aload 19
      // 19d: invokespecial qn4.pq2 (Ljava/lang/String;)Loru;
      // 1a0: astore 20
      // 1a2: aload 20
      // 1a4: ifnonnull 2e6
      // 1a7: new gdz
      // 1aa: dup
      // 1ab: new java/lang/StringBuilder
      // 1ae: dup
      // 1af: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b2: sipush 28912
      // 1b5: ldc2_w 6563234086347771650
      // 1b8: lload 3
      // 1b9: lxor
      // 1ba: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: nop
      // 1c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c3: aload 19
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: sipush 25591
      // 1cb: ldc2_w 5215755557072313369
      // 1ce: lload 3
      // 1cf: lxor
      // 1d0: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: nop
      // 1d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1dc: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 1df: astore 21
      // 1e1: aload 0
      // 1e2: getfield qn4.omd Ly99;
      // 1e5: aload 21
      // 1e7: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 1ec: pop
      // 1ed: goto 22b
      // 1f0: astore 22
      // 1f2: new kcc
      // 1f5: dup
      // 1f6: new java/lang/StringBuilder
      // 1f9: dup
      // 1fa: invokespecial java/lang/StringBuilder.<init> ()V
      // 1fd: sipush 28727
      // 200: ldc2_w 4641791409313157087
      // 203: lload 3
      // 204: lxor
      // 205: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: nop
      // 20b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20e: aload 19
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: sipush 10949
      // 216: ldc2_w 3683304254292841767
      // 219: lload 3
      // 21a: lxor
      // 21b: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: nop
      // 221: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 224: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 227: invokespecial kcc.<init> (Ljava/lang/String;)V
      // 22a: athrow
      // 22b: aload 1
      // 22c: aload 21
      // 22e: invokevirtual lc5.anl (Lgdz;)V
      // 231: aload 1
      // 232: aload 21
      // 234: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 237: astore 22
      // 239: aload 17
      // 23b: sipush 24735
      // 23e: ldc2_w 58531734755319655
      // 241: lload 3
      // 242: lxor
      // 243: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: nop
      // 249: invokestatic f83.z2p (Lcom/google/gson/JsonObject;Ljava/lang/String;)I
      // 24c: istore 23
      // 24e: aload 17
      // 250: sipush 25721
      // 253: ldc2_w 4130767936098311080
      // 256: lload 3
      // 257: lxor
      // 258: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: nop
      // 25e: invokestatic f83.z2p (Lcom/google/gson/JsonObject;Ljava/lang/String;)I
      // 261: istore 24
      // 263: aload 17
      // 265: sipush 5009
      // 268: ldc2_w 2848795415092227191
      // 26b: lload 3
      // 26c: lxor
      // 26d: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: nop
      // 273: invokestatic f83.f68 (Lcom/google/gson/JsonObject;Ljava/lang/String;)Z
      // 276: istore 25
      // 278: iload 25
      // 27a: iload 5
      // 27c: ifeq 2c3
      // 27f: ifeq 2ad
      // 282: goto 289
      // 285: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 288: athrow
      // 289: sipush 3553
      // 28c: sipush 10241
      // 28f: sipush 9729
      // 292: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 295: sipush 3553
      // 298: sipush 10240
      // 29b: sipush 9729
      // 29e: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 2a1: iload 5
      // 2a3: ifne 2cc
      // 2a6: goto 2ad
      // 2a9: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: sipush 3553
      // 2b0: sipush 10241
      // 2b3: sipush 9728
      // 2b6: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 2b9: sipush 3553
      // 2bc: goto 2c3
      // 2bf: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c2: athrow
      // 2c3: sipush 10240
      // 2c6: sipush 9728
      // 2c9: invokestatic org/lwjgl/opengl/GL11.glTexParameteri (III)V
      // 2cc: aload 12
      // 2ce: aload 18
      // 2d0: aload 22
      // 2d2: invokeinterface sm5.getGlTextureId ()I 1
      // 2d7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2da: iload 23
      // 2dc: iload 24
      // 2de: invokevirtual uix.edt (Ljava/lang/String;Ljava/lang/Object;II)V
      // 2e1: iload 5
      // 2e3: ifne 300
      // 2e6: aload 12
      // 2e8: aload 18
      // 2ea: aload 20
      // 2ec: aload 20
      // 2ee: getfield oru.ntc I
      // 2f1: aload 20
      // 2f3: getfield oru.f86 I
      // 2f6: invokevirtual uix.edt (Ljava/lang/String;Ljava/lang/Object;II)V
      // 2f9: goto 300
      // 2fc: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ff: athrow
      // 300: goto 33a
      // 303: astore 17
      // 305: aload 17
      // 307: invokestatic kcc.slw (Ljava/lang/Exception;)Lkcc;
      // 30a: astore 18
      // 30c: aload 18
      // 30e: new java/lang/StringBuilder
      // 311: dup
      // 312: invokespecial java/lang/StringBuilder.<init> ()V
      // 315: sipush 4278
      // 318: ldc2_w 7412114343906471780
      // 31b: lload 3
      // 31c: lxor
      // 31d: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: nop
      // 323: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 326: iload 14
      // 328: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 32b: ldc "]"
      // 32d: nop
      // 32e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 331: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 334: invokevirtual kcc.n8f (Ljava/lang/String;)V
      // 337: aload 18
      // 339: athrow
      // 33a: iinc 14 1
      // 33d: iload 5
      // 33f: ifne 140
      // 342: aload 6
      // 344: sipush 22127
      // 347: ldc2_w 1344805530945595788
      // 34a: lload 3
      // 34b: lxor
      // 34c: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: nop
      // 352: aconst_null
      // 353: checkcast com/google/gson/JsonArray
      // 356: invokestatic f83.zf2 (Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonArray;)Lcom/google/gson/JsonArray;
      // 359: astore 14
      // 35b: aload 14
      // 35d: ifnull 3c8
      // 360: bipush 0
      // 361: istore 15
      // 363: aload 14
      // 365: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 368: astore 16
      // 36a: aload 16
      // 36c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 371: ifeq 3c8
      // 374: aload 16
      // 376: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 37b: checkcast com/google/gson/JsonElement
      // 37e: astore 17
      // 380: aload 0
      // 381: aload 17
      // 383: invokespecial qn4.t02 (Lcom/google/gson/JsonElement;)V
      // 386: goto 3c0
      // 389: astore 18
      // 38b: aload 18
      // 38d: invokestatic kcc.slw (Ljava/lang/Exception;)Lkcc;
      // 390: astore 19
      // 392: aload 19
      // 394: new java/lang/StringBuilder
      // 397: dup
      // 398: invokespecial java/lang/StringBuilder.<init> ()V
      // 39b: sipush 10177
      // 39e: ldc2_w 475100252166740004
      // 3a1: lload 3
      // 3a2: lxor
      // 3a3: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: nop
      // 3a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ac: iload 15
      // 3ae: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3b1: ldc "]"
      // 3b3: nop
      // 3b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ba: invokevirtual kcc.n8f (Ljava/lang/String;)V
      // 3bd: aload 19
      // 3bf: athrow
      // 3c0: iinc 15 1
      // 3c3: iload 5
      // 3c5: ifne 36a
      // 3c8: return
   }

   private void t02(JsonElement param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qn4.a J
      // 003: ldc2_w 46316853294200
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: sipush 17918
      // 00c: ldc2_w 5563833509808936336
      // 00f: lload 2
      // 010: lxor
      // 011: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: invokestatic f83._yv (Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 01a: astore 5
      // 01c: aload 5
      // 01e: sipush 8081
      // 021: ldc2_w 888396190413770705
      // 024: lload 2
      // 025: lxor
      // 026: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: nop
      // 02c: invokestatic f83.sjp (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;
      // 02f: astore 6
      // 031: invokestatic t9d.c ()I
      // 034: aload 0
      // 035: getfield qn4.jvt Ljava/util/List;
      // 038: aload 0
      // 039: getfield qn4.jvt Ljava/util/List;
      // 03c: invokeinterface java/util/List.size ()I 1
      // 041: bipush 1
      // 042: isub
      // 043: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 048: checkcast uix
      // 04b: invokevirtual uix.q5g ()Ljn3;
      // 04e: aload 6
      // 050: invokevirtual jn3.h1q (Ljava/lang/String;)Lboo;
      // 053: astore 7
      // 055: istore 4
      // 057: aload 7
      // 059: ifnonnull 099
      // 05c: new kcc
      // 05f: dup
      // 060: new java/lang/StringBuilder
      // 063: dup
      // 064: invokespecial java/lang/StringBuilder.<init> ()V
      // 067: sipush 28915
      // 06a: ldc2_w 6943214364590448802
      // 06d: lload 2
      // 06e: lxor
      // 06f: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: nop
      // 075: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 078: aload 6
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07d: sipush 10949
      // 080: ldc2_w 3683325261464631962
      // 083: lload 2
      // 084: lxor
      // 085: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: nop
      // 08b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 091: invokespecial kcc.<init> (Ljava/lang/String;)V
      // 094: athrow
      // 095: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 098: athrow
      // 099: bipush 4
      // 09a: newarray 6
      // 09c: astore 8
      // 09e: bipush 0
      // 09f: istore 9
      // 0a1: aload 5
      // 0a3: sipush 15110
      // 0a6: ldc2_w 6889871882877528906
      // 0a9: lload 2
      // 0aa: lxor
      // 0ab: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: nop
      // 0b1: invokestatic f83.k68 (Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 0b4: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 0b7: astore 10
      // 0b9: aload 10
      // 0bb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c0: ifeq 12e
      // 0c3: aload 10
      // 0c5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ca: checkcast com/google/gson/JsonElement
      // 0cd: astore 11
      // 0cf: aload 8
      // 0d1: iload 9
      // 0d3: aload 11
      // 0d5: sipush 5887
      // 0d8: ldc2_w 4632715091565987506
      // 0db: lload 2
      // 0dc: lxor
      // 0dd: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: nop
      // 0e3: invokestatic f83.f_y (Lcom/google/gson/JsonElement;Ljava/lang/String;)F
      // 0e6: fastore
      // 0e7: iload 4
      // 0e9: ifne 170
      // 0ec: goto 126
      // 0ef: astore 12
      // 0f1: aload 12
      // 0f3: invokestatic kcc.slw (Ljava/lang/Exception;)Lkcc;
      // 0f6: astore 13
      // 0f8: aload 13
      // 0fa: new java/lang/StringBuilder
      // 0fd: dup
      // 0fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 101: sipush 23060
      // 104: ldc2_w 8639517036730485328
      // 107: lload 2
      // 108: lxor
      // 109: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: nop
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: iload 9
      // 114: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 117: ldc "]"
      // 119: nop
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 120: invokevirtual kcc.n8f (Ljava/lang/String;)V
      // 123: aload 13
      // 125: athrow
      // 126: iinc 9 1
      // 129: iload 4
      // 12b: ifeq 0b9
      // 12e: iload 9
      // 130: tableswitch 36 0 4 36 48 69 94 123
      // 154: iload 4
      // 156: ifeq 1c7
      // 159: goto 160
      // 15c: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: aload 7
      // 162: aload 8
      // 164: bipush 0
      // 165: faload
      // 166: invokevirtual boo.scn (F)V
      // 169: goto 170
      // 16c: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: iload 4
      // 172: ifeq 1c7
      // 175: aload 7
      // 177: aload 8
      // 179: bipush 0
      // 17a: faload
      // 17b: aload 8
      // 17d: bipush 1
      // 17e: faload
      // 17f: invokevirtual boo.utn (FF)V
      // 182: iload 4
      // 184: ifeq 1c7
      // 187: goto 18e
      // 18a: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18d: athrow
      // 18e: aload 7
      // 190: aload 8
      // 192: bipush 0
      // 193: faload
      // 194: aload 8
      // 196: bipush 1
      // 197: faload
      // 198: aload 8
      // 19a: bipush 2
      // 19b: faload
      // 19c: invokevirtual boo.otp (FFF)V
      // 19f: iload 4
      // 1a1: ifeq 1c7
      // 1a4: goto 1ab
      // 1a7: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1aa: athrow
      // 1ab: aload 7
      // 1ad: aload 8
      // 1af: bipush 0
      // 1b0: faload
      // 1b1: aload 8
      // 1b3: bipush 1
      // 1b4: faload
      // 1b5: aload 8
      // 1b7: bipush 2
      // 1b8: faload
      // 1b9: aload 8
      // 1bb: bipush 3
      // 1bc: faload
      // 1bd: invokevirtual boo.hej (FFFF)V
      // 1c0: goto 1c7
      // 1c3: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6: athrow
      // 1c7: return
   }

   public oru hvg(String var1) {
      return (oru)this.we5.get(var1);
   }

   public void eng(String param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new oru
      // 03: dup
      // 04: iload 2
      // 05: iload 3
      // 06: bipush 1
      // 07: invokespecial oru.<init> (IIZ)V
      // 0a: astore 5
      // 0c: invokestatic t9d.b ()I
      // 0f: aload 5
      // 11: fconst_0
      // 12: fconst_0
      // 13: fconst_0
      // 14: fconst_0
      // 15: invokevirtual oru.dty (FFFF)V
      // 18: istore 4
      // 1a: aload 0
      // 1b: getfield qn4.we5 Ljava/util/Map;
      // 1e: aload 1
      // 1f: aload 5
      // 21: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 26: pop
      // 27: iload 2
      // 28: aload 0
      // 29: getfield qn4.nww I
      // 2c: iload 4
      // 2e: ifeq 53
      // 31: if_icmpne 69
      // 34: goto 3b
      // 37: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: iload 3
      // 3c: iload 4
      // 3e: ifeq 68
      // 41: goto 48
      // 44: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 0
      // 49: getfield qn4.btl I
      // 4c: goto 53
      // 4f: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: if_icmpne 69
      // 56: aload 0
      // 57: getfield qn4.upl Ljava/util/List;
      // 5a: aload 5
      // 5c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 61: goto 68
      // 64: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 67: athrow
      // 68: pop
      // 69: return
   }

   public void fzs() {
      int var1 = t9d.b();
      Iterator var2 = this.we5.values().iterator();

      while (true) {
         if (var2.hasNext()) {
            oru var3 = (oru)var2.next();

            try {
               var3.qxv();
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var5) {
               throw a(var5);
            }
         }

         var2 = this.jvt.iterator();
         break;
      }

      while (true) {
         if (var2.hasNext()) {
            uix var6 = (uix)var2.next();

            try {
               var6.l53();
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var4) {
               throw a(var4);
            }
         }

         this.jvt.clear();
         break;
      }
   }

   public uix j4i(String var1, oru var2, oru var3) {
      uix var4 = new uix(this.omd, var1, var2, var3);
      this.jvt.add(this.jvt.size(), var4);
      return var4;
   }

   private void ctg() {
      this.yyf = new Matrix4f();
      this.yyf.setIdentity();
      this.yyf.m00 = 2.0F / (float)this._px.ntc;
      this.yyf.m11 = 2.0F / (float)(-this._px.f86);
      this.yyf.m22 = -0.0020001999F;
      this.yyf.m33 = 1.0F;
      this.yyf.m03 = -1.0F;
      this.yyf.m13 = 1.0F;
      this.yyf.m23 = -1.0001999F;
   }

   public void s_6(int var1, int var2) {
      this.nww = this._px.ntc;
      this.btl = this._px.f86;
      this.ctg();
      int var10000 = t9d.b();
      Iterator var4 = this.jvt.iterator();
      int var3 = var10000;

      while (var4.hasNext()) {
         uix var5 = (uix)var4.next();

         try {
            var5.cv2(this.yyf);
            if (var3 != 0 && var3 != 0) {
               continue;
            }
            break;
         } catch (oov var6) {
            throw a(var6);
         }
      }

      for (oru var7 : this.upl) {
         var7.mfw(var1, var2);
         if (var3 == 0) {
            break;
         }
      }
   }

   public void hii(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: fload 1
      // 05: aload 0
      // 06: getfield qn4.mas F
      // 09: fcmpg
      // 0a: ifge 31
      // 0d: aload 0
      // 0e: dup
      // 0f: getfield qn4.xx5 F
      // 12: fconst_1
      // 13: aload 0
      // 14: getfield qn4.mas F
      // 17: fsub
      // 18: fadd
      // 19: putfield qn4.xx5 F
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield qn4.xx5 F
      // 21: fload 1
      // 22: fadd
      // 23: putfield qn4.xx5 F
      // 26: iload 2
      // 27: ifne 47
      // 2a: goto 31
      // 2d: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30: athrow
      // 31: aload 0
      // 32: dup
      // 33: getfield qn4.xx5 F
      // 36: fload 1
      // 37: aload 0
      // 38: getfield qn4.mas F
      // 3b: fsub
      // 3c: fadd
      // 3d: putfield qn4.xx5 F
      // 40: goto 47
      // 43: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46: athrow
      // 47: aload 0
      // 48: fload 1
      // 49: putfield qn4.mas F
      // 4c: aload 0
      // 4d: getfield qn4.xx5 F
      // 50: ldc 20.0
      // 52: nop
      // 53: fcmpl
      // 54: ifle 72
      // 57: aload 0
      // 58: iload 2
      // 59: ifeq 73
      // 5c: dup
      // 5d: getfield qn4.xx5 F
      // 60: ldc 20.0
      // 62: nop
      // 63: fsub
      // 64: putfield qn4.xx5 F
      // 67: iload 2
      // 68: ifne 4c
      // 6b: goto 72
      // 6e: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 71: athrow
      // 72: aload 0
      // 73: getfield qn4.jvt Ljava/util/List;
      // 76: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 7b: astore 3
      // 7c: aload 3
      // 7d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 82: ifeq a1
      // 85: aload 3
      // 86: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 8b: checkcast uix
      // 8e: astore 4
      // 90: aload 4
      // 92: aload 0
      // 93: getfield qn4.xx5 F
      // 96: ldc 20.0
      // 98: nop
      // 99: fdiv
      // 9a: invokevirtual uix.dk4 (F)V
      // 9d: iload 2
      // 9e: ifne 7c
      // a1: return
   }

   public final String dry() {
      return this.cdk;
   }

   private oru pq2(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qn4.a J
      // 03: ldc2_w 110456674995037
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifne 26
      // 13: ifnonnull 25
      // 16: goto 1d
      // 19: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: aconst_null
      // 1e: goto 5e
      // 21: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 1
      // 26: iload 4
      // 28: ifne 5b
      // 2b: sipush 18587
      // 2e: ldc2_w 4999973040506808312
      // 31: lload 2
      // 32: lxor
      // 33: invokedynamic w (IJ)Ljava/lang/String; bsm=qn4.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: nop
      // 39: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3c: ifeq 51
      // 3f: goto 46
      // 42: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45: athrow
      // 46: aload 0
      // 47: getfield qn4._px Loru;
      // 4a: goto 5e
      // 4d: invokestatic qn4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50: athrow
      // 51: aload 0
      // 52: getfield qn4.we5 Ljava/util/Map;
      // 55: aload 1
      // 56: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5b: checkcast oru
      // 5e: areturn
   }

   public List w5k() {
      return this.jvt;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7024649593922460584L, 8958858534913131489L, MethodHandles.lookup().lookupClass()).a(40038385071841L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 49598033180550L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[37];
      int var7 = 0;
      String var6 = "áÖ?\u0085«3}±\u0014î´LýÐqÙ\u0010\u0095yç\u009dª\u0098#$³\u0082ïÓ#äÐ&(ås/ñ¡óÆÑ`¥ö®\u008bok¶]N\tÝá:±BY\u0090|Tö\u008b >M\u001d\u0018?\u00811\u0095¦\u0010ð\u0094j\u0088ä§sð\t \u0016û9y«R 5>5çÒþxóxM¡Vòï\u00930]Ü\u0080ÝáA\u0005\u0096\u009cÀº*fYcÉ\u0010\u0083\u0083bVËýÏæ\u009e¼\\\u00832Ö\b,\u0010Q\u009b÷Ý\u0005RSÓ\u0007\u0017\u001fQî\u008a\fÌ \u008c_;,¯_\btúã\u0003Ô`c<sý\u001a<\u009e\u008dâ\u0012\nÀ?\u0013© \u0004Çß\u0010§-n\u001e\u009a3h¡²\u0017\u0084\u00110Ýì\u008a\u0010EÎ\u001d]?K\u0006ÐÑá\u001e\u0083\u000b^;Æ \u008cë\u0098¬÷¦\u008eÜ\u0007Ó0Ë;ª\u0091üg¸(N½Bë\u009bÒ´ 7\u0018ÄOx\u0018\u0015ó(\u008d\u0004\u0087\u0080\u009cQ\u0083Â·Iî¯Ù©åöwÕØ\u009f\u00ad\u0010}U\u0090+\u001d\u0012d÷|ÚÖ\u001b{Ë5\u008f\u0010Õ\u001c)ß[ª¥\u009eXôÆ¾që\n\u0004\u0010M(T\u008c5ª¹ËÒ}ùÚÊ\fIº À\u001e°\u0019ïð\u0006#ßHm\u0003R!(&lÐä?Ë%=oBË\u0091ò\u0085kÈ\u0014 ¥ûïøÈ\nj¨+tc\u0094'ÖÙ?-â!Ç¯ò¥Ggý¾4\u0007;Å7\u0010\f6\u0099M*\u001f,\u0085j¨W\u008c\u0014\u0010î.(\u00006\u0081UÐÌÔºêFîS\u008dÞã\u0093\u0095µ$\u0090\u009dá\u001eúgõrRûå3 \u0090Î\u009eÄ2ßÛò k*\u0019\u0086÷\u0004øºØ\\8õ@u\u0018§N)$sÊ%§&AqÊäÉÓ=Ò\u0010D8átÉ¾(ë§7}\u0085\tðé-\u0018^\u0012Rn|\u001f¾\u0093è\u0010\u0087j§u\u009e¡\fñDîè¶ñ7 \u009eWÌµ&-\u0016ÓÆ7/\u0001W^6\u0087ý\u0082\u000e§·\u008eÎ½ë\u0015Þ=gÐ¼4 =>\f\u001d\u0019YâQ\u0091\u0015aü\u001a@\u0095D\u009e\u0011Ã{¢+Ø\u0018á¼X\u000b rPæ0\u0012p9*Ñ\u0016Jsió\u007f\u0088ÉaÌ\u0080×\u0087]²t#öÎ§C\\$\u0088BÏ£ô\u0098ÝÂmç?\u00115-\u0085Óò\u001aáð\u0010]ÉM\u009fº2¾L½G}Êãg\u0011\u001a(\u0082:K\u0000C\\\u0006æÐ\u0016YT\u0094&ÕÌ·x\u0015Ç-,\u009fê\u008bÔç`1Mõø¯ZLß®²ÎÑ\u0010A\u001a\u008eªÚçº\u0084O\u000bÃQaëï\u0005\u0018Þ\u001b©JÀ\u001a\u0018ºª:\u0083\u0080÷\u000eB0\"Wo\u0093Ä\\\u00ad|\u0010¢f¤ß))M\u0005\u001a¹Ô½B\u00039]\u0010\u0099ÒYÅéïì\u0010¸\u008fM\u0007e,²}\u0018u\u0010\u009f\u0088Úiî\u0011}\u0099zHw2ÿ1\u0096ÿ®¼3À\u008b\u0014\u0010sQc\u0081Ë#f\u0006@\"\u009f\u0080\u008f{ú«\u0010ÕZÌÑ:\f*8\f\tÉå[üÒÈ k}õK<ãQ&\u009a»\u0088\u0093{\u0010øô*\u001fýùèÈ\u0001\u0090â^!\u0094¹Ç\u009a\u0099";
      int var8 = "áÖ?\u0085«3}±\u0014î´LýÐqÙ\u0010\u0095yç\u009dª\u0098#$³\u0082ïÓ#äÐ&(ås/ñ¡óÆÑ`¥ö®\u008bok¶]N\tÝá:±BY\u0090|Tö\u008b >M\u001d\u0018?\u00811\u0095¦\u0010ð\u0094j\u0088ä§sð\t \u0016û9y«R 5>5çÒþxóxM¡Vòï\u00930]Ü\u0080ÝáA\u0005\u0096\u009cÀº*fYcÉ\u0010\u0083\u0083bVËýÏæ\u009e¼\\\u00832Ö\b,\u0010Q\u009b÷Ý\u0005RSÓ\u0007\u0017\u001fQî\u008a\fÌ \u008c_;,¯_\btúã\u0003Ô`c<sý\u001a<\u009e\u008dâ\u0012\nÀ?\u0013© \u0004Çß\u0010§-n\u001e\u009a3h¡²\u0017\u0084\u00110Ýì\u008a\u0010EÎ\u001d]?K\u0006ÐÑá\u001e\u0083\u000b^;Æ \u008cë\u0098¬÷¦\u008eÜ\u0007Ó0Ë;ª\u0091üg¸(N½Bë\u009bÒ´ 7\u0018ÄOx\u0018\u0015ó(\u008d\u0004\u0087\u0080\u009cQ\u0083Â·Iî¯Ù©åöwÕØ\u009f\u00ad\u0010}U\u0090+\u001d\u0012d÷|ÚÖ\u001b{Ë5\u008f\u0010Õ\u001c)ß[ª¥\u009eXôÆ¾që\n\u0004\u0010M(T\u008c5ª¹ËÒ}ùÚÊ\fIº À\u001e°\u0019ïð\u0006#ßHm\u0003R!(&lÐä?Ë%=oBË\u0091ò\u0085kÈ\u0014 ¥ûïøÈ\nj¨+tc\u0094'ÖÙ?-â!Ç¯ò¥Ggý¾4\u0007;Å7\u0010\f6\u0099M*\u001f,\u0085j¨W\u008c\u0014\u0010î.(\u00006\u0081UÐÌÔºêFîS\u008dÞã\u0093\u0095µ$\u0090\u009dá\u001eúgõrRûå3 \u0090Î\u009eÄ2ßÛò k*\u0019\u0086÷\u0004øºØ\\8õ@u\u0018§N)$sÊ%§&AqÊäÉÓ=Ò\u0010D8átÉ¾(ë§7}\u0085\tðé-\u0018^\u0012Rn|\u001f¾\u0093è\u0010\u0087j§u\u009e¡\fñDîè¶ñ7 \u009eWÌµ&-\u0016ÓÆ7/\u0001W^6\u0087ý\u0082\u000e§·\u008eÎ½ë\u0015Þ=gÐ¼4 =>\f\u001d\u0019YâQ\u0091\u0015aü\u001a@\u0095D\u009e\u0011Ã{¢+Ø\u0018á¼X\u000b rPæ0\u0012p9*Ñ\u0016Jsió\u007f\u0088ÉaÌ\u0080×\u0087]²t#öÎ§C\\$\u0088BÏ£ô\u0098ÝÂmç?\u00115-\u0085Óò\u001aáð\u0010]ÉM\u009fº2¾L½G}Êãg\u0011\u001a(\u0082:K\u0000C\\\u0006æÐ\u0016YT\u0094&ÕÌ·x\u0015Ç-,\u009fê\u008bÔç`1Mõø¯ZLß®²ÎÑ\u0010A\u001a\u008eªÚçº\u0084O\u000bÃQaëï\u0005\u0018Þ\u001b©JÀ\u001a\u0018ºª:\u0083\u0080÷\u000eB0\"Wo\u0093Ä\\\u00ad|\u0010¢f¤ß))M\u0005\u001a¹Ô½B\u00039]\u0010\u0099ÒYÅéïì\u0010¸\u008fM\u0007e,²}\u0018u\u0010\u009f\u0088Úiî\u0011}\u0099zHw2ÿ1\u0096ÿ®¼3À\u008b\u0014\u0010sQc\u0081Ë#f\u0006@\"\u009f\u0080\u008f{ú«\u0010ÕZÌÑ:\f*8\f\tÉå[üÒÈ k}õK<ãQ&\u009a»\u0088\u0093{\u0010øô*\u001fýùèÈ\u0001\u0090â^!\u0094¹Ç\u009a\u0099"
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
                     c = new String[37];
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

                  var6 = "Øí¾nN¿\u009e«õÄ½ð\u0018ÅN+ Ð8\u0003&L*|PÅES©ëØJj®J§ZÍ\rã\u0099\ràU¤Æ@~»";
                  var8 = "Øí¾nN¿\u009e«õÄ½ð\u0018ÅN+ Ð8\u0003&L*|PÅES©ëØJj®J§ZÍ\rã\u0099\ràU¤Æ@~»".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24399;
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
            throw new RuntimeException("qn4", var10);
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
         throw new RuntimeException("qn4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
