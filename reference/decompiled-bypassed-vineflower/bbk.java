import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.network.play.client.C16PacketClientStatus$v78;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bbk extends gbe {
   private static final Logger kmy;
   private static final gdz zcg;
   private static final gdz _oq;
   private int dse;
   private List r_6;
   private int a_l;
   private float eim = 0.5F;
   private static final long a;
   private static final String[] b;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   @Override
   public void updateScreen() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield bbk.f41 Lc05;
      // 04: invokevirtual c05.ail ()Lxw1;
      // 07: astore 2
      // 08: invokestatic t9d.c ()I
      // 0b: aload 0
      // 0c: getfield bbk.f41 Lc05;
      // 0f: invokevirtual c05.yp9 ()Ldbu;
      // 12: astore 3
      // 13: istore 1
      // 14: aload 0
      // 15: getfield bbk.dse I
      // 18: iload 1
      // 19: ifne 5b
      // 1c: ifne 3c
      // 1f: goto 26
      // 22: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25: athrow
      // 26: aload 2
      // 27: invokevirtual xw1.jnm ()V
      // 2a: aload 2
      // 2b: getstatic xw1$ial.k0h Lxw1$ial;
      // 2e: invokevirtual xw1.jjv (Lxw1$ial;)V
      // 31: aload 3
      // 32: invokevirtual dbu.llt ()V
      // 35: goto 3c
      // 38: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b: athrow
      // 3c: aload 3
      // 3d: invokevirtual dbu._21 ()V
      // 40: aload 0
      // 41: dup
      // 42: getfield bbk.dse I
      // 45: bipush 1
      // 46: iadd
      // 47: putfield bbk.dse I
      // 4a: aload 0
      // 4b: getfield bbk.a_l I
      // 4e: aload 0
      // 4f: getfield bbk.o1e I
      // 52: iadd
      // 53: aload 0
      // 54: getfield bbk.o1e I
      // 57: iadd
      // 58: bipush 24
      // 5a: iadd
      // 5b: i2f
      // 5c: aload 0
      // 5d: getfield bbk.eim F
      // 60: fdiv
      // 61: fstore 4
      // 63: aload 0
      // 64: iload 1
      // 65: ifne 81
      // 68: getfield bbk.dse I
      // 6b: i2f
      // 6c: fload 4
      // 6e: fcmpl
      // 6f: ifle 84
      // 72: goto 79
      // 75: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 78: athrow
      // 79: aload 0
      // 7a: goto 81
      // 7d: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 80: athrow
      // 81: invokespecial bbk.op2 ()V
      // 84: return
   }

   @Override
   public void dig(char var1, int var2) {
      try {
         if (var2 == 1) {
            this.op2();
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   private void op2() {
      this.f41.vg8.lq7.sxi(new C16PacketClientStatus(C16PacketClientStatus$v78.ggv));
      this.f41.z2i((gbe)null);
   }

   @Override
   public boolean a99() {
      return true;
   }

   @Override
   public void initGui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bbk.a J
      // 003: ldc2_w 18293227834276
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: iload 3
      // 00e: ifeq 026
      // 011: getfield bbk.r_6 Ljava/util/List;
      // 014: ifnonnull 289
      // 017: goto 01e
      // 01a: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01d: athrow
      // 01e: aload 0
      // 01f: goto 026
      // 022: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 025: athrow
      // 026: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 029: putfield bbk.r_6 Ljava/util/List;
      // 02c: ldc ""
      // 02e: nop
      // 02f: astore 4
      // 031: new java/lang/StringBuilder
      // 034: dup
      // 035: invokespecial java/lang/StringBuilder.<init> ()V
      // 038: ldc ""
      // 03a: nop
      // 03b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03e: getstatic syo.rl1 Lsyo;
      // 041: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 044: getstatic syo.sxj Lsyo;
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 04a: getstatic syo.qjc Lsyo;
      // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 050: getstatic syo.c8f Lsyo;
      // 053: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 056: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 059: astore 5
      // 05b: sipush 274
      // 05e: istore 6
      // 060: aload 0
      // 061: getfield bbk.f41 Lc05;
      // 064: invokevirtual c05.mpf ()Ly99;
      // 067: new gdz
      // 06a: dup
      // 06b: sipush 1230
      // 06e: ldc2_w 8432897304852302591
      // 071: lload 1
      // 072: lxor
      // 073: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 07c: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 081: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 086: astore 7
      // 088: new java/io/BufferedReader
      // 08b: dup
      // 08c: new java/io/InputStreamReader
      // 08f: dup
      // 090: aload 7
      // 092: getstatic org/apache/commons/io/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 095: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 098: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 09b: astore 8
      // 09d: new java/util/Random
      // 0a0: dup
      // 0a1: ldc2_w 8124371
      // 0a4: invokespecial java/util/Random.<init> (J)V
      // 0a7: astore 9
      // 0a9: aload 8
      // 0ab: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 0ae: dup
      // 0af: astore 4
      // 0b1: ifnull 176
      // 0b4: aload 4
      // 0b6: sipush 6658
      // 0b9: ldc2_w 2724683411289379900
      // 0bc: lload 1
      // 0bd: lxor
      // 0be: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: nop
      // 0c4: aload 0
      // 0c5: getfield bbk.f41 Lc05;
      // 0c8: invokevirtual c05.ee0 ()Lrh0;
      // 0cb: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 0ce: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 0d1: astore 4
      // 0d3: aload 4
      // 0d5: aload 5
      // 0d7: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 0da: ifeq 14d
      // 0dd: aload 4
      // 0df: aload 5
      // 0e1: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0e4: istore 12
      // 0e6: aload 4
      // 0e8: bipush 0
      // 0e9: iload 12
      // 0eb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ee: astore 10
      // 0f0: aload 4
      // 0f2: iload 12
      // 0f4: aload 5
      // 0f6: invokevirtual java/lang/String.length ()I
      // 0f9: iadd
      // 0fa: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0fd: astore 11
      // 0ff: new java/lang/StringBuilder
      // 102: dup
      // 103: invokespecial java/lang/StringBuilder.<init> ()V
      // 106: aload 10
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10b: getstatic syo.rl1 Lsyo;
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 111: getstatic syo.sxj Lsyo;
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 117: sipush 18863
      // 11a: ldc2_w 7340015761694410642
      // 11d: lload 1
      // 11e: lxor
      // 11f: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: nop
      // 125: bipush 0
      // 126: aload 9
      // 128: bipush 4
      // 129: invokevirtual java/util/Random.nextInt (I)I
      // 12c: bipush 3
      // 12d: iadd
      // 12e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: aload 11
      // 136: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 139: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13c: astore 4
      // 13e: iload 3
      // 13f: ifeq 172
      // 142: iload 3
      // 143: ifne 0d3
      // 146: goto 14d
      // 149: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: aload 0
      // 14e: getfield bbk.r_6 Ljava/util/List;
      // 151: aload 0
      // 152: getfield bbk.f41 Lc05;
      // 155: getfield c05.tx1 Lowt;
      // 158: aload 4
      // 15a: iload 6
      // 15c: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 15f: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 164: pop
      // 165: aload 0
      // 166: getfield bbk.r_6 Ljava/util/List;
      // 169: ldc ""
      // 16b: nop
      // 16c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 171: pop
      // 172: iload 3
      // 173: ifne 0a9
      // 176: aload 7
      // 178: invokevirtual java/io/InputStream.close ()V
      // 17b: bipush 0
      // 17c: istore 10
      // 17e: iload 10
      // 180: bipush 8
      // 182: if_icmpge 1a4
      // 185: aload 0
      // 186: getfield bbk.r_6 Ljava/util/List;
      // 189: ldc ""
      // 18b: nop
      // 18c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 191: pop
      // 192: iinc 10 1
      // 195: iload 3
      // 196: ifeq 1cc
      // 199: iload 3
      // 19a: ifne 17e
      // 19d: goto 1a4
      // 1a0: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: getfield bbk.f41 Lc05;
      // 1a8: invokevirtual c05.mpf ()Ly99;
      // 1ab: new gdz
      // 1ae: dup
      // 1af: sipush 16801
      // 1b2: ldc2_w 6530473851166511005
      // 1b5: lload 1
      // 1b6: lxor
      // 1b7: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: nop
      // 1bd: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 1c0: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 1c5: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 1ca: astore 7
      // 1cc: new java/io/BufferedReader
      // 1cf: dup
      // 1d0: new java/io/InputStreamReader
      // 1d3: dup
      // 1d4: aload 7
      // 1d6: getstatic org/apache/commons/io/Charsets.UTF_8 Ljava/nio/charset/Charset;
      // 1d9: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 1dc: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 1df: astore 8
      // 1e1: aload 8
      // 1e3: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 1e6: dup
      // 1e7: astore 4
      // 1e9: ifnull 257
      // 1ec: aload 4
      // 1ee: sipush 24332
      // 1f1: ldc2_w 8939352129896403253
      // 1f4: lload 1
      // 1f5: lxor
      // 1f6: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: nop
      // 1fc: aload 0
      // 1fd: getfield bbk.f41 Lc05;
      // 200: invokevirtual c05.ee0 ()Lrh0;
      // 203: invokevirtual rh0.z2u ()Ljava/lang/String;
      // 206: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 209: astore 4
      // 20b: aload 4
      // 20d: ldc "\t"
      // 20f: nop
      // 210: sipush 11609
      // 213: ldc2_w 2946199396188005218
      // 216: lload 1
      // 217: lxor
      // 218: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: nop
      // 21e: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 221: astore 4
      // 223: aload 0
      // 224: getfield bbk.r_6 Ljava/util/List;
      // 227: aload 0
      // 228: getfield bbk.f41 Lc05;
      // 22b: getfield c05.tx1 Lowt;
      // 22e: aload 4
      // 230: iload 6
      // 232: invokevirtual owt.g8u (Ljava/lang/String;I)Ljava/util/List;
      // 235: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 23a: pop
      // 23b: aload 0
      // 23c: getfield bbk.r_6 Ljava/util/List;
      // 23f: ldc ""
      // 241: nop
      // 242: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 247: pop
      // 248: iload 3
      // 249: ifeq 26c
      // 24c: iload 3
      // 24d: ifne 1e1
      // 250: goto 257
      // 253: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 256: athrow
      // 257: aload 7
      // 259: invokevirtual java/io/InputStream.close ()V
      // 25c: aload 0
      // 25d: aload 0
      // 25e: getfield bbk.r_6 Ljava/util/List;
      // 261: invokeinterface java/util/List.size ()I 1
      // 266: bipush 12
      // 268: imul
      // 269: putfield bbk.a_l I
      // 26c: goto 289
      // 26f: astore 4
      // 271: getstatic bbk.kmy Lorg/apache/logging/log4j/Logger;
      // 274: sipush 11204
      // 277: ldc2_w 3914229598027851259
      // 27a: lload 1
      // 27b: lxor
      // 27c: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: nop
      // 282: aload 4
      // 284: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 289: return
   }

   private void dvl(int var1, int var2, float var3) {
      jom var5 = jom.yut();
      q3g var6 = var5.zuq();
      this.f41.l22().anl(b0t.yby);
      int var10000 = t9d.b();
      var6.ezr(7, gnl.rad);
      int var4 = var10000;
      int var7 = this.dt7;
      float var8 = 0.0F - ((float)this.dse + var3) * 0.5F * this.eim;
      float var9 = (float)this.o1e - ((float)this.dse + var3) * 0.5F * this.eim;
      float var10 = 0.015625F;
      float var11 = ((float)this.dse + var3 - 0.0F) * 0.02F;
      float var12 = (float)(this.a_l + this.o1e + this.o1e + 24) / this.eim;
      float var13 = (var12 - 20.0F - ((float)this.dse + var3)) * 0.005F;

      float var10001;
      label39: {
         label34: {
            label33: {
               try {
                  float var20;
                  var10000 = (var20 = var13 - var11) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
                  if (var4 == 0) {
                     break label34;
                  }

                  if (var10000 >= 0) {
                     break label33;
                  }
               } catch (oov var15) {
                  throw a(var15);
               }

               var11 = var13;
            }

            try {
               var19 = var11;
               var10001 = 1.0F;
               if (var4 == 0) {
                  break label39;
               }

               float var21;
               var10000 = (var21 = var11 - 1.0F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
            } catch (oov var14) {
               throw a(var14);
            }
         }

         if (var10000 > 0) {
            var11 = 1.0F;
         }

         var11 *= var11;
         var19 = var11 * 96.0F;
         var10001 = 255.0F;
      }

      var11 = var19 / var10001;
      var6.g5o(0.0, (double)this.o1e, (double)this.o3s).h0a(0.0, (double)(var8 * var10)).gs4(var11, var11, var11, 1.0F).pzw();
      var6.g5o((double)var7, (double)this.o1e, (double)this.o3s)
         .h0a((double)((float)var7 * var10), (double)(var8 * var10))
         .gs4(var11, var11, var11, 1.0F)
         .pzw();
      var6.g5o((double)var7, 0.0, (double)this.o3s).h0a((double)((float)var7 * var10), (double)(var9 * var10)).gs4(var11, var11, var11, 1.0F).pzw();
      var6.g5o(0.0, 0.0, (double)this.o3s).h0a(0.0, (double)(var9 * var10)).gs4(var11, var11, var11, 1.0F).pzw();
      var5.q7g();
   }

   @Override
   public void drawScreen(int param1, int param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic bbk.a J
      // 003: ldc2_w 9867268198555
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: iload 1
      // 00b: iload 2
      // 00c: fload 3
      // 00d: invokespecial bbk.dvl (IIF)V
      // 010: invokestatic t9d.b ()I
      // 013: invokestatic jom.yut ()Ljom;
      // 016: astore 7
      // 018: istore 6
      // 01a: aload 7
      // 01c: invokevirtual jom.zuq ()Lq3g;
      // 01f: astore 8
      // 021: sipush 274
      // 024: istore 9
      // 026: aload 0
      // 027: getfield bbk.dt7 I
      // 02a: bipush 2
      // 02b: idiv
      // 02c: iload 9
      // 02e: bipush 2
      // 02f: idiv
      // 030: isub
      // 031: istore 10
      // 033: aload 0
      // 034: getfield bbk.o1e I
      // 037: bipush 50
      // 039: iadd
      // 03a: istore 11
      // 03c: aload 0
      // 03d: getfield bbk.dse I
      // 040: i2f
      // 041: fload 3
      // 042: fadd
      // 043: fneg
      // 044: aload 0
      // 045: getfield bbk.eim F
      // 048: fmul
      // 049: fstore 12
      // 04b: invokestatic hzu.dp2 ()V
      // 04e: fconst_0
      // 04f: fload 12
      // 051: fconst_0
      // 052: invokestatic hzu.a4k (FFF)V
      // 055: aload 0
      // 056: getfield bbk.f41 Lc05;
      // 059: invokevirtual c05.l22 ()Llc5;
      // 05c: getstatic bbk.zcg Lgdz;
      // 05f: invokevirtual lc5.anl (Lgdz;)V
      // 062: fconst_1
      // 063: fconst_1
      // 064: fconst_1
      // 065: fconst_1
      // 066: invokestatic hzu.wn0 (FFFF)V
      // 069: aload 0
      // 06a: iload 10
      // 06c: iload 11
      // 06e: bipush 0
      // 06f: bipush 0
      // 070: sipush 155
      // 073: bipush 44
      // 075: invokevirtual bbk.mt4 (IIIIII)V
      // 078: aload 0
      // 079: iload 10
      // 07b: sipush 155
      // 07e: iadd
      // 07f: iload 11
      // 081: bipush 0
      // 082: bipush 45
      // 084: sipush 155
      // 087: bipush 44
      // 089: invokevirtual bbk.mt4 (IIIIII)V
      // 08c: iload 11
      // 08e: sipush 200
      // 091: iadd
      // 092: istore 13
      // 094: bipush 0
      // 095: istore 14
      // 097: iload 14
      // 099: aload 0
      // 09a: getfield bbk.r_6 Ljava/util/List;
      // 09d: invokeinterface java/util/List.size ()I 1
      // 0a2: if_icmpge 1de
      // 0a5: iload 14
      // 0a7: iload 6
      // 0a9: ifeq 112
      // 0ac: aload 0
      // 0ad: getfield bbk.r_6 Ljava/util/List;
      // 0b0: invokeinterface java/util/List.size ()I 1
      // 0b5: bipush 1
      // 0b6: isub
      // 0b7: iload 6
      // 0b9: ifeq 1f5
      // 0bc: goto 0c3
      // 0bf: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c2: athrow
      // 0c3: if_icmpne 102
      // 0c6: goto 0cd
      // 0c9: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cc: athrow
      // 0cd: iload 13
      // 0cf: i2f
      // 0d0: fload 12
      // 0d2: fadd
      // 0d3: aload 0
      // 0d4: getfield bbk.o1e I
      // 0d7: bipush 2
      // 0d8: idiv
      // 0d9: bipush 6
      // 0db: isub
      // 0dc: i2f
      // 0dd: fsub
      // 0de: fstore 15
      // 0e0: fload 15
      // 0e2: fconst_0
      // 0e3: fcmpg
      // 0e4: iload 6
      // 0e6: ifeq 112
      // 0e9: ifge 102
      // 0ec: goto 0f3
      // 0ef: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f2: athrow
      // 0f3: fconst_0
      // 0f4: fload 15
      // 0f6: fneg
      // 0f7: fconst_0
      // 0f8: invokestatic hzu.a4k (FFF)V
      // 0fb: goto 102
      // 0fe: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 101: athrow
      // 102: iload 13
      // 104: i2f
      // 105: fload 12
      // 107: fadd
      // 108: ldc 12.0
      // 10a: nop
      // 10b: fadd
      // 10c: ldc 8.0
      // 10e: nop
      // 10f: fadd
      // 110: fconst_0
      // 111: fcmpl
      // 112: iload 6
      // 114: ifeq 134
      // 117: ifle 1d3
      // 11a: goto 121
      // 11d: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: iload 13
      // 123: i2f
      // 124: fload 12
      // 126: fadd
      // 127: aload 0
      // 128: getfield bbk.o1e I
      // 12b: i2f
      // 12c: fcmpg
      // 12d: goto 134
      // 130: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 133: athrow
      // 134: ifge 1d3
      // 137: aload 0
      // 138: getfield bbk.r_6 Ljava/util/List;
      // 13b: iload 14
      // 13d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 142: checkcast java/lang/String
      // 145: astore 15
      // 147: aload 15
      // 149: sipush 6565
      // 14c: ldc2_w 7955036237194710186
      // 14f: lload 4
      // 151: lxor
      // 152: invokedynamic n (IJ)Ljava/lang/String; bsm=bbk.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: nop
      // 158: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 15b: iload 6
      // 15d: ifeq 1d2
      // 160: ifeq 1a0
      // 163: goto 16a
      // 166: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield bbk.fex Lowt;
      // 16e: aload 15
      // 170: bipush 3
      // 171: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 174: iload 10
      // 176: iload 9
      // 178: aload 0
      // 179: getfield bbk.fex Lowt;
      // 17c: aload 15
      // 17e: bipush 3
      // 17f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 182: invokevirtual owt.ezt (Ljava/lang/String;)I
      // 185: isub
      // 186: bipush 2
      // 187: idiv
      // 188: iadd
      // 189: i2f
      // 18a: iload 13
      // 18c: i2f
      // 18d: ldc 16777215
      // 18f: nop
      // 190: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 193: pop
      // 194: iload 6
      // 196: ifne 1d3
      // 199: goto 1a0
      // 19c: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield bbk.fex Lowt;
      // 1a4: getfield owt.l0s Ljava/util/Random;
      // 1a7: iload 14
      // 1a9: i2l
      // 1aa: ldc2_w 4238972211
      // 1ad: lmul
      // 1ae: aload 0
      // 1af: getfield bbk.dse I
      // 1b2: bipush 4
      // 1b3: idiv
      // 1b4: i2l
      // 1b5: ladd
      // 1b6: invokevirtual java/util/Random.setSeed (J)V
      // 1b9: aload 0
      // 1ba: getfield bbk.fex Lowt;
      // 1bd: aload 15
      // 1bf: iload 10
      // 1c1: i2f
      // 1c2: iload 13
      // 1c4: i2f
      // 1c5: ldc 16777215
      // 1c7: nop
      // 1c8: invokevirtual owt.km1 (Ljava/lang/String;FFI)I
      // 1cb: goto 1d2
      // 1ce: invokestatic bbk.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: pop
      // 1d3: iinc 13 12
      // 1d6: iinc 14 1
      // 1d9: iload 6
      // 1db: ifne 097
      // 1de: invokestatic hzu.x3w ()V
      // 1e1: aload 0
      // 1e2: getfield bbk.f41 Lc05;
      // 1e5: invokevirtual c05.l22 ()Llc5;
      // 1e8: getstatic bbk._oq Lgdz;
      // 1eb: invokevirtual lc5.anl (Lgdz;)V
      // 1ee: invokestatic hzu.spd ()V
      // 1f1: bipush 0
      // 1f2: sipush 769
      // 1f5: invokestatic hzu.ru7 (II)V
      // 1f8: aload 0
      // 1f9: getfield bbk.dt7 I
      // 1fc: istore 14
      // 1fe: aload 0
      // 1ff: getfield bbk.o1e I
      // 202: istore 15
      // 204: aload 8
      // 206: bipush 7
      // 208: getstatic gnl.rad Lbe7;
      // 20b: invokevirtual q3g.ezr (ILbe7;)V
      // 20e: aload 8
      // 210: dconst_0
      // 211: iload 15
      // 213: i2d
      // 214: aload 0
      // 215: getfield bbk.o3s F
      // 218: f2d
      // 219: invokevirtual q3g.g5o (DDD)Lq3g;
      // 21c: dconst_0
      // 21d: dconst_1
      // 21e: invokevirtual q3g.h0a (DD)Lq3g;
      // 221: fconst_1
      // 222: fconst_1
      // 223: fconst_1
      // 224: fconst_1
      // 225: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 228: invokevirtual q3g.pzw ()V
      // 22b: aload 8
      // 22d: iload 14
      // 22f: i2d
      // 230: iload 15
      // 232: i2d
      // 233: aload 0
      // 234: getfield bbk.o3s F
      // 237: f2d
      // 238: invokevirtual q3g.g5o (DDD)Lq3g;
      // 23b: dconst_1
      // 23c: dconst_1
      // 23d: invokevirtual q3g.h0a (DD)Lq3g;
      // 240: fconst_1
      // 241: fconst_1
      // 242: fconst_1
      // 243: fconst_1
      // 244: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 247: invokevirtual q3g.pzw ()V
      // 24a: aload 8
      // 24c: iload 14
      // 24e: i2d
      // 24f: dconst_0
      // 250: aload 0
      // 251: getfield bbk.o3s F
      // 254: f2d
      // 255: invokevirtual q3g.g5o (DDD)Lq3g;
      // 258: dconst_1
      // 259: dconst_0
      // 25a: invokevirtual q3g.h0a (DD)Lq3g;
      // 25d: fconst_1
      // 25e: fconst_1
      // 25f: fconst_1
      // 260: fconst_1
      // 261: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 264: invokevirtual q3g.pzw ()V
      // 267: aload 8
      // 269: dconst_0
      // 26a: dconst_0
      // 26b: aload 0
      // 26c: getfield bbk.o3s F
      // 26f: f2d
      // 270: invokevirtual q3g.g5o (DDD)Lq3g;
      // 273: dconst_0
      // 274: dconst_0
      // 275: invokevirtual q3g.h0a (DD)Lq3g;
      // 278: fconst_1
      // 279: fconst_1
      // 27a: fconst_1
      // 27b: fconst_1
      // 27c: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 27f: invokevirtual q3g.pzw ()V
      // 282: aload 7
      // 284: invokevirtual jom.q7g ()V
      // 287: invokestatic hzu.ux6 ()V
      // 28a: aload 0
      // 28b: iload 1
      // 28c: iload 2
      // 28d: fload 3
      // 28e: invokespecial gbe.drawScreen (IIF)V
      // 291: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1146452377443368703L, 251458952407923802L, MethodHandles.lookup().lookupClass()).a(19873698816536L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 77929218395157L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var5 = 0;
      String var4 = "j\u008bé*¬ÁõñR¶Þ£\u008b\u0010ó Õ¸«å\u0097¨ô«@¼¹ªo~\u0018)\u001b¢ÍÕ\f!\u000e× ¾\u009fø\u0094\u0081\u0091Ï\u0015\u008a\u0094½ëCó\u0018w]\u0084Rê\u008b\u0083\u0000]\u0016\u00ad ïZC\u000fKU\u0001ÐÛ\u008a{\u0019?Üª\u000bî{È\u009cµ\u0010\u008frBM(CP\u0093üs£¨\u001dÀÖ>0áÆ\u000e\u001c2[´)Ã¤\u001e\t·}©üâ¶\tñ9EPqÎ`ô§`X³\u0085aÄé´ \u008a\u0000\u001býÉ\u0098e\u0084(=+ £É£\u0000\u0002\u0002ì<1\u0003\u0087¹)k\u0099ê)\u0089þLt|\u009c\u000eÓ»\u0018¤\u0015\u001ed÷(\u0006\u009b>¨Ä:>Ê/çpp÷7ÄòZz)\u0007õ=¬\u0099i\u001dp*{½\u0099«[À¶×\u0010K\u009f4(àf<.`Ëù¡>Û¬}\u0085VY\u0097+ÉÕ\u0000\u0015\u00adæ\u0099\u0082I\u0090ò\u0081i8°\u0002{§\u000eþÍ\u009f½\u0018d\u0088$\u008døË~\u0086\u0082¥M\u001bp0ÿ\u008e|¹ÕÑ\u0015\u001cÏ\u008c";
      int var6 = "j\u008bé*¬ÁõñR¶Þ£\u008b\u0010ó Õ¸«å\u0097¨ô«@¼¹ªo~\u0018)\u001b¢ÍÕ\f!\u000e× ¾\u009fø\u0094\u0081\u0091Ï\u0015\u008a\u0094½ëCó\u0018w]\u0084Rê\u008b\u0083\u0000]\u0016\u00ad ïZC\u000fKU\u0001ÐÛ\u008a{\u0019?Üª\u000bî{È\u009cµ\u0010\u008frBM(CP\u0093üs£¨\u001dÀÖ>0áÆ\u000e\u001c2[´)Ã¤\u001e\t·}©üâ¶\tñ9EPqÎ`ô§`X³\u0085aÄé´ \u008a\u0000\u001býÉ\u0098e\u0084(=+ £É£\u0000\u0002\u0002ì<1\u0003\u0087¹)k\u0099ê)\u0089þLt|\u009c\u000eÓ»\u0018¤\u0015\u001ed÷(\u0006\u009b>¨Ä:>Ê/çpp÷7ÄòZz)\u0007õ=¬\u0099i\u001dp*{½\u0099«[À¶×\u0010K\u009f4(àf<.`Ëù¡>Û¬}\u0085VY\u0097+ÉÕ\u0000\u0015\u00adæ\u0099\u0082I\u0090ò\u0081i8°\u0002{§\u000eþÍ\u009f½\u0018d\u0088$\u008døË~\u0086\u0082¥M\u001bp0ÿ\u008e|¹ÕÑ\u0015\u001cÏ\u008c"
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
                     g = new String[10];
                     kmy = LogManager.getLogger();
                     zcg = new gdz(b<"n">(21675, 769868574304951586L ^ var9));
                     _oq = new gdz(b<"n">(2165, 732938464288637438L ^ var9));
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

                  var4 = "3\u008eRÌt¸{\u001b¶Gó`\nçÔhUD)M\u0015w\u009fWã`\u0081\u0006.ÿ=à\u0010Ü\u001aoÎ;#ñþa\u001e3ÅQ¾hÓ";
                  var6 = "3\u008eRÌt¸{\u001b¶Gó`\nçÔhUD)M\u0015w\u009fWã`\u0081\u0006.ÿ=à\u0010Ü\u001aoÎ;#ñþa\u001e3ÅQ¾hÓ".length();
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30004;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("bbk", var10);
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
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("bbk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
