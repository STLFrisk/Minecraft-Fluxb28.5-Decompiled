import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
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
import net.optifine.util.CounterInt;
import net.optifine.util.TextureUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yu2 extends xe9 implements o6y {
   private static final boolean i_l;
   private static final Logger zvd;
   public static final gdz _i5;
   public static final gdz nu_;
   private final List wrh;
   private final Map q05;
   private final Map btf;
   private final String oxc;
   private final d48 yzn;
   private int bz6;
   private final sla euf;
   private boolean _pd;
   private sla[] gts;
   private int gal;
   private int cf2;
   private int hm_;
   private double d_p;
   private double rwe;
   private CounterInt jy_;
   public int wbe;
   public int joj;
   private int l9e;
   private int pr_;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public yu2(String var1) {
      this(var1, (d48)null);
   }

   public yu2(String var1, boolean var2) {
      this(var1, (d48)null, var2);
   }

   public yu2(String var1, d48 var2) {
      this(var1, var2, false);
   }

   public yu2(String var1, d48 var2, boolean var3) {
      long var4 = a ^ 97780998127831L;
      super();
      int var10000 = OpaquePredicate.c();
      this._pd = false;
      this.gts = null;
      this.gal = -1;
      int var6 = var10000;

      boolean var10001;
      label36: {
         label35: {
            label34: {
               label33: {
                  try {
                     this.cf2 = -1;
                     this.hm_ = -1;
                     this.d_p = -1.0;
                     this.rwe = -1.0;
                     this.jy_ = new CounterInt(0);
                     this.wbe = 0;
                     this.joj = 0;
                     this.wrh = Lists.newArrayList();
                     this.q05 = Maps.newHashMap();
                     this.btf = Maps.newHashMap();
                     this.euf = new sla(a<"p">(25624, 4271899869645068393L ^ var4));
                     this.oxc = var1;
                     this.yzn = var2;
                     var9 = this;
                     var10001 = var3;
                     if (var6 != 0) {
                        break label33;
                     }

                     if (!var3) {
                        break label34;
                     }
                  } catch (RuntimeException var8) {
                     throw a(var8);
                  }

                  var10001 = i_l;
               }

               try {
                  if (var6 != 0) {
                     break label36;
                  }

                  if (var10001) {
                     break label35;
                  }
               } catch (RuntimeException var7) {
                  throw a(var7);
               }
            }

            var10001 = false;
            break label36;
         }

         var10001 = true;
      }

      var9._pd = var10001;
   }

   private void klv() {
      int var1 = this.tt5();
      int[] var2 = this.w7q(var1);
      this.euf.opf(var1);
      this.euf.myx(var1);
      int[][] var3 = new int[this.bz6 + 1][];
      var3[0] = var2;
      this.euf.g6q(Lists.newArrayList(new int[][][]{var3}));
      this.euf.n0i(this.jy_.nextValue());
   }

   @Override
   public void loadTexture(y99 param1) {
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
      // 06: ifne 1e
      // 09: getfield yu2.yzn Ld48;
      // 0c: ifnull 26
      // 0f: goto 16
      // 12: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 0
      // 20: getfield yu2.yzn Ld48;
      // 23: invokevirtual yu2.b_c (Ly99;Ld48;)V
      // 26: return
   }

   public void b_c(y99 param1, d48 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yu2.a J
      // 03: ldc2_w 122244524018360
      // 06: lxor
      // 07: lstore 3
      // 08: aload 0
      // 09: getfield yu2.q05 Ljava/util/Map;
      // 0c: invokeinterface java/util/Map.clear ()V 1
      // 11: invokestatic OpaquePredicate.b ()I
      // 14: aload 0
      // 15: getfield yu2.jy_ Lnet/optifine/util/CounterInt;
      // 18: invokevirtual net/optifine/util/CounterInt.reset ()V
      // 1b: istore 5
      // 1d: aload 2
      // 1e: aload 0
      // 1f: invokeinterface d48.qwy (Lyu2;)V 2
      // 24: aload 0
      // 25: iload 5
      // 27: ifeq 7a
      // 2a: getfield yu2.bz6 I
      // 2d: bipush 4
      // 2e: if_icmplt 71
      // 31: goto 38
      // 34: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37: athrow
      // 38: aload 0
      // 39: aload 0
      // 3a: aload 0
      // 3b: getfield yu2.q05 Ljava/util/Map;
      // 3e: aload 1
      // 3f: invokespecial yu2.jj2 (Ljava/util/Map;Ly99;)I
      // 42: putfield yu2.bz6 I
      // 45: new java/lang/StringBuilder
      // 48: dup
      // 49: invokespecial java/lang/StringBuilder.<init> ()V
      // 4c: sipush 28278
      // 4f: ldc2_w 2345492829793261654
      // 52: lload 3
      // 53: lxor
      // 54: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: nop
      // 5a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5d: aload 0
      // 5e: getfield yu2.bz6 I
      // 61: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 64: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 67: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 6a: goto 71
      // 6d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 70: athrow
      // 71: aload 0
      // 72: invokespecial yu2.klv ()V
      // 75: aload 0
      // 76: invokevirtual yu2.wo5 ()V
      // 79: aload 0
      // 7a: aload 1
      // 7b: invokevirtual yu2.ngg (Ly99;)V
      // 7e: return
   }

   public void ngg(y99 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yu2.a J
      // 003: ldc2_w 59878093618510
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: new java/lang/StringBuilder
      // 010: dup
      // 011: invokespecial java/lang/StringBuilder.<init> ()V
      // 014: sipush 4083
      // 017: ldc2_w 5254837172679937595
      // 01a: lload 2
      // 01b: lxor
      // 01c: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 021: nop
      // 022: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 025: invokestatic hxt.jty ()Z
      // 028: invokevirtual java/lang/StringBuilder.append (Z)Ljava/lang/StringBuilder;
      // 02b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 02e: invokestatic hxt.brd (Ljava/lang/String;)V
      // 031: invokestatic hxt.jty ()Z
      // 034: iload 4
      // 036: ifne 087
      // 039: ifeq 078
      // 03c: aload 0
      // 03d: getfield yu2.btf Ljava/util/Map;
      // 040: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 045: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 04a: astore 5
      // 04c: aload 5
      // 04e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 053: ifeq 078
      // 056: aload 5
      // 058: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 05d: checkcast sla
      // 060: astore 6
      // 062: aload 6
      // 064: invokevirtual sla.dva ()V
      // 067: iload 4
      // 069: ifne 084
      // 06c: iload 4
      // 06e: ifeq 04c
      // 071: goto 078
      // 074: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: aload 0
      // 079: invokestatic net/optifine/ConnectedTextures.updateIcons (Lyu2;)V
      // 07c: aload 0
      // 07d: invokestatic net/optifine/CustomItems.updateIcons (Lyu2;)V
      // 080: aload 0
      // 081: invokestatic net/optifine/BetterGrass.updateIcons (Lyu2;)V
      // 084: invokestatic net/optifine/util/TextureUtils.getGLMaximumTextureSize ()I
      // 087: istore 5
      // 089: new rnq
      // 08c: dup
      // 08d: iload 5
      // 08f: iload 5
      // 091: bipush 1
      // 092: bipush 0
      // 093: aload 0
      // 094: getfield yu2.bz6 I
      // 097: invokespecial rnq.<init> (IIZII)V
      // 09a: astore 6
      // 09c: aload 0
      // 09d: getfield yu2.btf Ljava/util/Map;
      // 0a0: invokeinterface java/util/Map.clear ()V 1
      // 0a5: aload 0
      // 0a6: getfield yu2.wrh Ljava/util/List;
      // 0a9: invokeinterface java/util/List.clear ()V 1
      // 0ae: ldc 2147483647
      // 0b0: nop
      // 0b1: istore 7
      // 0b3: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_onTextureStitchedPre Lnet/optifine/reflect/ReflectorMethod;
      // 0b6: bipush 1
      // 0b7: anewarray 292
      // 0ba: dup
      // 0bb: bipush 0
      // 0bc: aload 0
      // 0bd: aastore
      // 0be: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // 0c1: aload 0
      // 0c2: invokespecial yu2.tt5 ()I
      // 0c5: istore 8
      // 0c7: aload 0
      // 0c8: iload 8
      // 0ca: putfield yu2.gal I
      // 0cd: bipush 1
      // 0ce: aload 0
      // 0cf: getfield yu2.bz6 I
      // 0d2: ishl
      // 0d3: istore 9
      // 0d5: bipush 0
      // 0d6: istore 10
      // 0d8: bipush 0
      // 0d9: istore 11
      // 0db: aload 0
      // 0dc: getfield yu2.q05 Ljava/util/Map;
      // 0df: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0e4: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0e9: astore 12
      // 0eb: aload 12
      // 0ed: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f2: ifeq 64f
      // 0f5: aload 12
      // 0f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fc: checkcast java/util/Map$Entry
      // 0ff: astore 13
      // 101: aload 0
      // 102: getfield yu2._pd Z
      // 105: iload 4
      // 107: ifne 651
      // 10a: iload 4
      // 10c: ifne 651
      // 10f: goto 116
      // 112: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 115: athrow
      // 116: ifne 64f
      // 119: goto 120
      // 11c: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11f: athrow
      // 120: aload 13
      // 122: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 127: checkcast sla
      // 12a: astore 14
      // 12c: new gdz
      // 12f: dup
      // 130: aload 14
      // 132: invokevirtual sla.nfl ()Ljava/lang/String;
      // 135: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 138: astore 15
      // 13a: aload 0
      // 13b: aload 15
      // 13d: bipush 0
      // 13e: invokevirtual yu2.cuw (Lgdz;I)Lgdz;
      // 141: astore 16
      // 143: aload 14
      // 145: aload 0
      // 146: getfield yu2.jy_ Lnet/optifine/util/CounterInt;
      // 149: invokevirtual sla.zvx (Lnet/optifine/util/CounterInt;)V
      // 14c: aload 14
      // 14e: aload 1
      // 14f: aload 15
      // 151: invokevirtual sla.x5u (Ly99;Lgdz;)Z
      // 154: iload 4
      // 156: ifne 172
      // 159: ifeq 1f4
      // 15c: goto 163
      // 15f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: aload 14
      // 165: aload 1
      // 166: aload 15
      // 168: invokevirtual sla.mbk (Ly99;Lgdz;)Z
      // 16b: goto 172
      // 16e: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: iload 4
      // 174: ifne 19a
      // 177: ifne 1c9
      // 17a: goto 181
      // 17d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 180: athrow
      // 181: iload 7
      // 183: aload 14
      // 185: invokevirtual sla.jkj ()I
      // 188: aload 14
      // 18a: invokevirtual sla.yva ()I
      // 18d: invokestatic java/lang/Math.min (II)I
      // 190: invokestatic java/lang/Math.min (II)I
      // 193: goto 19a
      // 196: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 199: athrow
      // 19a: istore 7
      // 19c: aload 6
      // 19e: aload 14
      // 1a0: invokevirtual rnq.hmj (Lsla;)V
      // 1a3: new java/lang/StringBuilder
      // 1a6: dup
      // 1a7: invokespecial java/lang/StringBuilder.<init> ()V
      // 1aa: sipush 5197
      // 1ad: ldc2_w 7972412757839615382
      // 1b0: lload 2
      // 1b1: lxor
      // 1b2: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: nop
      // 1b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bb: aload 14
      // 1bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c3: invokestatic hxt.yq3 (Ljava/lang/String;)V
      // 1c6: iinc 11 1
      // 1c9: new java/lang/StringBuilder
      // 1cc: dup
      // 1cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 1d0: sipush 10864
      // 1d3: ldc2_w 7487748478080658305
      // 1d6: lload 2
      // 1d7: lxor
      // 1d8: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: nop
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: aload 14
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1e6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e9: invokestatic hxt.yq3 (Ljava/lang/String;)V
      // 1ec: iinc 10 1
      // 1ef: iload 4
      // 1f1: ifeq 0eb
      // 1f4: aload 1
      // 1f5: aload 16
      // 1f7: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 1fc: astore 17
      // 1fe: bipush 1
      // 1ff: aload 0
      // 200: getfield yu2.bz6 I
      // 203: iadd
      // 204: anewarray 357
      // 207: astore 18
      // 209: aload 18
      // 20b: bipush 0
      // 20c: aload 17
      // 20e: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 213: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 216: aastore
      // 217: aload 18
      // 219: bipush 0
      // 21a: aaload
      // 21b: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 21e: istore 19
      // 220: aload 18
      // 222: bipush 0
      // 223: aaload
      // 224: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 227: istore 20
      // 229: iload 4
      // 22b: ifne 27e
      // 22e: iload 19
      // 230: bipush 1
      // 231: if_icmplt 254
      // 234: goto 23b
      // 237: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23a: athrow
      // 23b: iload 20
      // 23d: bipush 1
      // 23e: iload 4
      // 240: ifne 293
      // 243: goto 24a
      // 246: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 249: athrow
      // 24a: if_icmpge 283
      // 24d: goto 254
      // 250: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 253: athrow
      // 254: new java/lang/StringBuilder
      // 257: dup
      // 258: invokespecial java/lang/StringBuilder.<init> ()V
      // 25b: sipush 10179
      // 25e: ldc2_w 2779303212800484906
      // 261: lload 2
      // 262: lxor
      // 263: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: nop
      // 269: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26c: aload 14
      // 26e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 271: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 274: invokestatic hxt.a2t (Ljava/lang/String;)V
      // 277: goto 27e
      // 27a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27d: athrow
      // 27e: iload 4
      // 280: ifeq 0eb
      // 283: iload 19
      // 285: iload 4
      // 287: ifne 2bb
      // 28a: iload 8
      // 28c: goto 293
      // 28f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 292: athrow
      // 293: if_icmplt 2b0
      // 296: aload 0
      // 297: getfield yu2.bz6 I
      // 29a: iload 4
      // 29c: ifne 2bb
      // 29f: goto 2a6
      // 2a2: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a5: athrow
      // 2a6: ifle 3ca
      // 2a9: goto 2b0
      // 2ac: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2af: athrow
      // 2b0: aload 0
      // 2b1: getfield yu2.bz6 I
      // 2b4: goto 2bb
      // 2b7: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ba: athrow
      // 2bb: iload 4
      // 2bd: ifne 2da
      // 2c0: ifle 2d8
      // 2c3: goto 2ca
      // 2c6: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: iload 19
      // 2cc: iload 8
      // 2ce: invokestatic net/optifine/util/TextureUtils.scaleToGrid (II)I
      // 2d1: goto 2df
      // 2d4: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d7: athrow
      // 2d8: iload 19
      // 2da: iload 8
      // 2dc: invokestatic net/optifine/util/TextureUtils.scaleToMin (II)I
      // 2df: istore 21
      // 2e1: iload 21
      // 2e3: iload 4
      // 2e5: ifne 300
      // 2e8: iload 19
      // 2ea: if_icmpeq 3ca
      // 2ed: goto 2f4
      // 2f0: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f3: athrow
      // 2f4: iload 19
      // 2f6: invokestatic net/optifine/util/TextureUtils.isPowerOfTwo (I)Z
      // 2f9: goto 300
      // 2fc: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ff: athrow
      // 300: ifne 361
      // 303: new java/lang/StringBuilder
      // 306: dup
      // 307: invokespecial java/lang/StringBuilder.<init> ()V
      // 30a: sipush 19449
      // 30d: ldc2_w 5651381653198227970
      // 310: lload 2
      // 311: lxor
      // 312: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: nop
      // 318: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31b: aload 14
      // 31d: invokevirtual sla.nfl ()Ljava/lang/String;
      // 320: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 323: sipush 17430
      // 326: ldc2_w 732474338924217821
      // 329: lload 2
      // 32a: lxor
      // 32b: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: nop
      // 331: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 334: iload 19
      // 336: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 339: sipush 6959
      // 33c: ldc2_w 6766753606092724956
      // 33f: lload 2
      // 340: lxor
      // 341: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: nop
      // 347: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34a: iload 21
      // 34c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 34f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 352: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 355: iload 4
      // 357: ifeq 3b3
      // 35a: goto 361
      // 35d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 360: athrow
      // 361: new java/lang/StringBuilder
      // 364: dup
      // 365: invokespecial java/lang/StringBuilder.<init> ()V
      // 368: sipush 25465
      // 36b: ldc2_w 4390494001406993046
      // 36e: lload 2
      // 36f: lxor
      // 370: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 375: nop
      // 376: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 379: aload 14
      // 37b: invokevirtual sla.nfl ()Ljava/lang/String;
      // 37e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 381: sipush 2806
      // 384: ldc2_w 3368174793720728349
      // 387: lload 2
      // 388: lxor
      // 389: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: nop
      // 38f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 392: iload 19
      // 394: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 397: sipush 29903
      // 39a: ldc2_w 2660004961747629317
      // 39d: lload 2
      // 39e: lxor
      // 39f: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: nop
      // 3a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a8: iload 21
      // 3aa: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b0: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 3b3: iload 20
      // 3b5: iload 21
      // 3b7: imul
      // 3b8: iload 19
      // 3ba: idiv
      // 3bb: istore 22
      // 3bd: aload 18
      // 3bf: bipush 0
      // 3c0: aload 18
      // 3c2: bipush 0
      // 3c3: aaload
      // 3c4: iload 21
      // 3c6: invokestatic net/optifine/util/TextureUtils.scaleImage (Ljava/awt/image/BufferedImage;I)Ljava/awt/image/BufferedImage;
      // 3c9: aastore
      // 3ca: aload 17
      // 3cc: sipush 21558
      // 3cf: ldc2_w 8121862532223915495
      // 3d2: lload 2
      // 3d3: lxor
      // 3d4: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: nop
      // 3da: invokeinterface yaa.yrs (Ljava/lang/String;)Lz08; 2
      // 3df: checkcast yvh
      // 3e2: astore 21
      // 3e4: aload 21
      // 3e6: iload 4
      // 3e8: ifne 520
      // 3eb: ifnull 50b
      // 3ee: goto 3f5
      // 3f1: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f4: athrow
      // 3f5: aload 21
      // 3f7: invokevirtual yvh.az_ ()Ljava/util/List;
      // 3fa: astore 22
      // 3fc: aload 22
      // 3fe: iload 4
      // 400: ifne 467
      // 403: invokeinterface java/util/List.isEmpty ()Z 1
      // 408: ifne 465
      // 40b: goto 412
      // 40e: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 411: athrow
      // 412: aload 18
      // 414: bipush 0
      // 415: aaload
      // 416: invokevirtual java/awt/image/BufferedImage.getWidth ()I
      // 419: istore 23
      // 41b: aload 18
      // 41d: bipush 0
      // 41e: aaload
      // 41f: invokevirtual java/awt/image/BufferedImage.getHeight ()I
      // 422: istore 24
      // 424: iload 23
      // 426: invokestatic fe6.l0o (I)I
      // 429: iload 23
      // 42b: iload 4
      // 42d: ifne 448
      // 430: if_icmpne 44b
      // 433: goto 43a
      // 436: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 439: athrow
      // 43a: iload 24
      // 43c: invokestatic fe6.l0o (I)I
      // 43f: iload 24
      // 441: goto 448
      // 444: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 447: athrow
      // 448: if_icmpeq 465
      // 44b: new java/lang/RuntimeException
      // 44e: dup
      // 44f: sipush 6781
      // 452: ldc2_w 2758055676951534516
      // 455: lload 2
      // 456: lxor
      // 457: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45c: nop
      // 45d: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 460: athrow
      // 461: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 464: athrow
      // 465: aload 22
      // 467: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 46c: astore 23
      // 46e: aload 23
      // 470: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 475: ifeq 50b
      // 478: aload 23
      // 47a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 47f: checkcast java/lang/Integer
      // 482: invokevirtual java/lang/Integer.intValue ()I
      // 485: istore 24
      // 487: iload 24
      // 489: iload 4
      // 48b: ifne 0f2
      // 48e: iload 4
      // 490: ifne 49f
      // 493: ifle 506
      // 496: goto 49d
      // 499: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 49c: athrow
      // 49d: iload 24
      // 49f: aload 18
      // 4a1: arraylength
      // 4a2: bipush 1
      // 4a3: isub
      // 4a4: if_icmpge 506
      // 4a7: aload 18
      // 4a9: iload 24
      // 4ab: aaload
      // 4ac: ifnonnull 506
      // 4af: goto 4b6
      // 4b2: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b5: athrow
      // 4b6: aload 0
      // 4b7: aload 15
      // 4b9: iload 24
      // 4bb: invokevirtual yu2.cuw (Lgdz;I)Lgdz;
      // 4be: astore 25
      // 4c0: aload 18
      // 4c2: iload 24
      // 4c4: aload 1
      // 4c5: aload 25
      // 4c7: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 4cc: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 4d1: invokestatic p9t.h3z (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
      // 4d4: aastore
      // 4d5: goto 506
      // 4d8: astore 26
      // 4da: getstatic yu2.zvd Lorg/apache/logging/log4j/Logger;
      // 4dd: sipush 12471
      // 4e0: ldc2_w 2652499432241606994
      // 4e3: lload 2
      // 4e4: lxor
      // 4e5: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ea: nop
      // 4eb: bipush 3
      // 4ec: anewarray 292
      // 4ef: dup
      // 4f0: bipush 0
      // 4f1: iload 24
      // 4f3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4f6: aastore
      // 4f7: dup
      // 4f8: bipush 1
      // 4f9: aload 25
      // 4fb: aastore
      // 4fc: dup
      // 4fd: bipush 2
      // 4fe: aload 26
      // 500: aastore
      // 501: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 506: iload 4
      // 508: ifeq 46e
      // 50b: aload 17
      // 50d: sipush 6596
      // 510: ldc2_w 8466786690117638166
      // 513: lload 2
      // 514: lxor
      // 515: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51a: nop
      // 51b: invokeinterface yaa.yrs (Ljava/lang/String;)Lz08; 2
      // 520: checkcast v8g
      // 523: astore 22
      // 525: aload 14
      // 527: aload 18
      // 529: aload 22
      // 52b: invokevirtual sla.l3i ([Ljava/awt/image/BufferedImage;Lv8g;)V
      // 52e: goto 5b8
      // 531: astore 17
      // 533: getstatic yu2.zvd Lorg/apache/logging/log4j/Logger;
      // 536: new java/lang/StringBuilder
      // 539: dup
      // 53a: invokespecial java/lang/StringBuilder.<init> ()V
      // 53d: sipush 17400
      // 540: ldc2_w 1979598834669404719
      // 543: lload 2
      // 544: lxor
      // 545: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54a: nop
      // 54b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 54e: aload 16
      // 550: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 553: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 556: aload 17
      // 558: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 55d: aload 16
      // 55f: aload 17
      // 561: invokevirtual java/lang/RuntimeException.getMessage ()Ljava/lang/String;
      // 564: invokestatic net/optifine/reflect/ReflectorForge.FMLClientHandler_trackBrokenTexture (Lgdz;Ljava/lang/String;)V
      // 567: goto 0eb
      // 56a: astore 17
      // 56c: getstatic yu2.zvd Lorg/apache/logging/log4j/Logger;
      // 56f: new java/lang/StringBuilder
      // 572: dup
      // 573: invokespecial java/lang/StringBuilder.<init> ()V
      // 576: sipush 11029
      // 579: ldc2_w 977352482020174567
      // 57c: lload 2
      // 57d: lxor
      // 57e: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 583: nop
      // 584: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 587: aload 16
      // 589: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 58c: sipush 2806
      // 58f: ldc2_w 3368174793720728349
      // 592: lload 2
      // 593: lxor
      // 594: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 599: nop
      // 59a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 59d: aload 17
      // 59f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 5a2: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 5a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5ab: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 5b0: aload 16
      // 5b2: invokestatic net/optifine/reflect/ReflectorForge.FMLClientHandler_trackMissingTexture (Lgdz;)V
      // 5b5: goto 0eb
      // 5b8: iload 7
      // 5ba: aload 14
      // 5bc: invokevirtual sla.jkj ()I
      // 5bf: aload 14
      // 5c1: invokevirtual sla.yva ()I
      // 5c4: invokestatic java/lang/Math.min (II)I
      // 5c7: invokestatic java/lang/Math.min (II)I
      // 5ca: istore 7
      // 5cc: aload 14
      // 5ce: invokevirtual sla.jkj ()I
      // 5d1: invokestatic java/lang/Integer.lowestOneBit (I)I
      // 5d4: aload 14
      // 5d6: invokevirtual sla.yva ()I
      // 5d9: invokestatic java/lang/Integer.lowestOneBit (I)I
      // 5dc: invokestatic java/lang/Math.min (II)I
      // 5df: istore 17
      // 5e1: iload 4
      // 5e3: ifne 64a
      // 5e6: iload 17
      // 5e8: iload 9
      // 5ea: if_icmpge 643
      // 5ed: goto 5f4
      // 5f0: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5f3: athrow
      // 5f4: getstatic yu2.zvd Lorg/apache/logging/log4j/Logger;
      // 5f7: sipush 4532
      // 5fa: ldc2_w 3480071723445227628
      // 5fd: lload 2
      // 5fe: lxor
      // 5ff: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 604: nop
      // 605: bipush 5
      // 606: anewarray 292
      // 609: dup
      // 60a: bipush 0
      // 60b: aload 16
      // 60d: aastore
      // 60e: dup
      // 60f: bipush 1
      // 610: aload 14
      // 612: invokevirtual sla.jkj ()I
      // 615: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 618: aastore
      // 619: dup
      // 61a: bipush 2
      // 61b: aload 14
      // 61d: invokevirtual sla.yva ()I
      // 620: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 623: aastore
      // 624: dup
      // 625: bipush 3
      // 626: iload 9
      // 628: invokestatic fe6.xjr (I)I
      // 62b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 62e: aastore
      // 62f: dup
      // 630: bipush 4
      // 631: iload 17
      // 633: invokestatic fe6.xjr (I)I
      // 636: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 639: aastore
      // 63a: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 63f: iload 17
      // 641: istore 9
      // 643: aload 6
      // 645: aload 14
      // 647: invokevirtual rnq.hmj (Lsla;)V
      // 64a: iload 4
      // 64c: ifeq 0eb
      // 64f: iload 10
      // 651: iload 4
      // 653: ifne 68c
      // 656: ifle 68a
      // 659: goto 660
      // 65c: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 65f: athrow
      // 660: new java/lang/StringBuilder
      // 663: dup
      // 664: invokespecial java/lang/StringBuilder.<init> ()V
      // 667: sipush 19481
      // 66a: ldc2_w 8287975163682868717
      // 66d: lload 2
      // 66e: lxor
      // 66f: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 674: nop
      // 675: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 678: iload 10
      // 67a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 67d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 680: invokestatic hxt.brd (Ljava/lang/String;)V
      // 683: goto 68a
      // 686: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 689: athrow
      // 68a: iload 11
      // 68c: iload 4
      // 68e: ifne 6cc
      // 691: ifle 6c5
      // 694: goto 69b
      // 697: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 69a: athrow
      // 69b: new java/lang/StringBuilder
      // 69e: dup
      // 69f: invokespecial java/lang/StringBuilder.<init> ()V
      // 6a2: sipush 5797
      // 6a5: ldc2_w 5589978851506460504
      // 6a8: lload 2
      // 6a9: lxor
      // 6aa: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6af: nop
      // 6b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b3: iload 11
      // 6b5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6b8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6bb: invokestatic hxt.brd (Ljava/lang/String;)V
      // 6be: goto 6c5
      // 6c1: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c4: athrow
      // 6c5: iload 7
      // 6c7: iload 9
      // 6c9: invokestatic java/lang/Math.min (II)I
      // 6cc: istore 13
      // 6ce: iload 13
      // 6d0: invokestatic fe6.xjr (I)I
      // 6d3: istore 14
      // 6d5: iload 14
      // 6d7: iload 4
      // 6d9: ifne 6eb
      // 6dc: ifge 6e9
      // 6df: goto 6e6
      // 6e2: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e5: athrow
      // 6e6: bipush 0
      // 6e7: istore 14
      // 6e9: iload 14
      // 6eb: aload 0
      // 6ec: getfield yu2.bz6 I
      // 6ef: if_icmpge 73a
      // 6f2: getstatic yu2.zvd Lorg/apache/logging/log4j/Logger;
      // 6f5: sipush 27062
      // 6f8: ldc2_w 5603532817217448023
      // 6fb: lload 2
      // 6fc: lxor
      // 6fd: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 702: nop
      // 703: bipush 4
      // 704: anewarray 292
      // 707: dup
      // 708: bipush 0
      // 709: aload 0
      // 70a: getfield yu2.oxc Ljava/lang/String;
      // 70d: aastore
      // 70e: dup
      // 70f: bipush 1
      // 710: aload 0
      // 711: getfield yu2.bz6 I
      // 714: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 717: aastore
      // 718: dup
      // 719: bipush 2
      // 71a: iload 14
      // 71c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 71f: aastore
      // 720: dup
      // 721: bipush 3
      // 722: iload 13
      // 724: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 727: aastore
      // 728: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 72d: aload 0
      // 72e: iload 14
      // 730: putfield yu2.bz6 I
      // 733: goto 73a
      // 736: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 739: athrow
      // 73a: aload 0
      // 73b: getfield yu2.q05 Ljava/util/Map;
      // 73e: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 743: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 748: astore 15
      // 74a: aload 15
      // 74c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 751: ifeq 83a
      // 754: aload 15
      // 756: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 75b: checkcast sla
      // 75e: astore 16
      // 760: iload 4
      // 762: ifne 78b
      // 765: aload 0
      // 766: getfield yu2._pd Z
      // 769: iload 4
      // 76b: ifne 89a
      // 76e: goto 775
      // 771: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 774: athrow
      // 775: ifeq 782
      // 778: goto 77f
      // 77b: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 77e: athrow
      // 77f: goto 83a
      // 782: aload 16
      // 784: aload 0
      // 785: getfield yu2.bz6 I
      // 788: invokevirtual sla.h1r (I)V
      // 78b: goto 835
      // 78e: astore 17
      // 790: aload 17
      // 792: sipush 28521
      // 795: ldc2_w 7479654401588850361
      // 798: lload 2
      // 799: lxor
      // 79a: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79f: nop
      // 7a0: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 7a3: astore 18
      // 7a5: aload 18
      // 7a7: sipush 17383
      // 7aa: ldc2_w 363748882755666493
      // 7ad: lload 2
      // 7ae: lxor
      // 7af: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b4: nop
      // 7b5: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 7b8: astore 19
      // 7ba: aload 19
      // 7bc: sipush 25563
      // 7bf: ldc2_w 8650326029747610171
      // 7c2: lload 2
      // 7c3: lxor
      // 7c4: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c9: nop
      // 7ca: new yu2$1
      // 7cd: dup
      // 7ce: aload 0
      // 7cf: aload 16
      // 7d1: invokespecial yu2$1.<init> (Lyu2;Lsla;)V
      // 7d4: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 7d7: aload 19
      // 7d9: sipush 6660
      // 7dc: ldc2_w 7071315891077848050
      // 7df: lload 2
      // 7e0: lxor
      // 7e1: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e6: nop
      // 7e7: new yu2$2
      // 7ea: dup
      // 7eb: aload 0
      // 7ec: aload 16
      // 7ee: invokespecial yu2$2.<init> (Lyu2;Lsla;)V
      // 7f1: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 7f4: aload 19
      // 7f6: sipush 20331
      // 7f9: ldc2_w 6793192888763567772
      // 7fc: lload 2
      // 7fd: lxor
      // 7fe: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 803: nop
      // 804: new yu2$3
      // 807: dup
      // 808: aload 0
      // 809: aload 16
      // 80b: invokespecial yu2$3.<init> (Lyu2;Lsla;)V
      // 80e: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 811: aload 19
      // 813: sipush 22394
      // 816: ldc2_w 1133031210472527492
      // 819: lload 2
      // 81a: lxor
      // 81b: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 820: nop
      // 821: aload 0
      // 822: getfield yu2.bz6 I
      // 825: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 828: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 82b: new oov
      // 82e: dup
      // 82f: aload 18
      // 831: invokespecial oov.<init> (Le1i;)V
      // 834: athrow
      // 835: iload 4
      // 837: ifeq 74a
      // 83a: aload 0
      // 83b: getfield yu2.euf Lsla;
      // 83e: aload 0
      // 83f: getfield yu2.bz6 I
      // 842: invokevirtual sla.h1r (I)V
      // 845: aload 6
      // 847: aload 0
      // 848: getfield yu2.euf Lsla;
      // 84b: invokevirtual rnq.hmj (Lsla;)V
      // 84e: aload 0
      // 84f: bipush 0
      // 850: putfield yu2._pd Z
      // 853: aload 6
      // 855: invokevirtual rnq.v7r ()V
      // 858: goto 860
      // 85b: astore 15
      // 85d: aload 15
      // 85f: athrow
      // 860: getstatic yu2.zvd Lorg/apache/logging/log4j/Logger;
      // 863: sipush 31186
      // 866: ldc2_w 8058107652874631198
      // 869: lload 2
      // 86a: lxor
      // 86b: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 870: nop
      // 871: bipush 3
      // 872: anewarray 292
      // 875: dup
      // 876: bipush 0
      // 877: aload 6
      // 879: invokevirtual rnq.zl9 ()I
      // 87c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 87f: aastore
      // 880: dup
      // 881: bipush 1
      // 882: aload 6
      // 884: invokevirtual rnq.x3k ()I
      // 887: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 88a: aastore
      // 88b: dup
      // 88c: bipush 2
      // 88d: aload 0
      // 88e: getfield yu2.oxc Ljava/lang/String;
      // 891: aastore
      // 892: invokeinterface org/apache/logging/log4j/Logger.info (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 897: invokestatic hxt.ly3 ()Z
      // 89a: iload 4
      // 89c: ifne 8d8
      // 89f: ifeq 8cd
      // 8a2: goto 8a9
      // 8a5: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a8: athrow
      // 8a9: aload 0
      // 8aa: invokevirtual yu2.getGlTextureId ()I
      // 8ad: aload 0
      // 8ae: getfield yu2.bz6 I
      // 8b1: aload 6
      // 8b3: invokevirtual rnq.zl9 ()I
      // 8b6: aload 6
      // 8b8: invokevirtual rnq.x3k ()I
      // 8bb: aload 6
      // 8bd: aload 0
      // 8be: invokestatic net/optifine/shaders/ShadersTex.allocateTextureMap (IIIILrnq;Lyu2;)V
      // 8c1: iload 4
      // 8c3: ifeq 8e9
      // 8c6: goto 8cd
      // 8c9: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8cc: athrow
      // 8cd: aload 0
      // 8ce: invokevirtual yu2.getGlTextureId ()I
      // 8d1: goto 8d8
      // 8d4: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8d7: athrow
      // 8d8: aload 0
      // 8d9: getfield yu2.bz6 I
      // 8dc: aload 6
      // 8de: invokevirtual rnq.zl9 ()I
      // 8e1: aload 6
      // 8e3: invokevirtual rnq.x3k ()I
      // 8e6: invokestatic p9t.xed (IIII)V
      // 8e9: aload 0
      // 8ea: getfield yu2.q05 Ljava/util/Map;
      // 8ed: invokestatic com/google/common/collect/Maps.newHashMap (Ljava/util/Map;)Ljava/util/HashMap;
      // 8f0: astore 15
      // 8f2: aload 6
      // 8f4: invokevirtual rnq.jp3 ()Ljava/util/List;
      // 8f7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8fc: astore 16
      // 8fe: aload 16
      // 900: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 905: ifeq a40
      // 908: aload 16
      // 90a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 90f: checkcast sla
      // 912: astore 17
      // 914: aload 17
      // 916: invokevirtual sla.nfl ()Ljava/lang/String;
      // 919: astore 18
      // 91b: aload 15
      // 91d: aload 18
      // 91f: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 924: pop
      // 925: aload 0
      // 926: getfield yu2.btf Ljava/util/Map;
      // 929: aload 18
      // 92b: aload 17
      // 92d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 932: pop
      // 933: iload 4
      // 935: ifne 976
      // 938: invokestatic hxt.ly3 ()Z
      // 93b: iload 4
      // 93d: ifne a55
      // 940: ifeq 97b
      // 943: goto 94a
      // 946: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 949: athrow
      // 94a: aload 0
      // 94b: aload 17
      // 94d: invokevirtual sla.nfl ()Ljava/lang/String;
      // 950: aload 17
      // 952: bipush 0
      // 953: invokevirtual sla.wpv (I)[[I
      // 956: aload 17
      // 958: invokevirtual sla.jkj ()I
      // 95b: aload 17
      // 95d: invokevirtual sla.yva ()I
      // 960: aload 17
      // 962: invokevirtual sla.mpq ()I
      // 965: aload 17
      // 967: invokevirtual sla.prx ()I
      // 96a: bipush 0
      // 96b: bipush 0
      // 96c: invokestatic net/optifine/shaders/ShadersTex.uploadTexSubForLoadAtlas (Lyu2;Ljava/lang/String;[[IIIIIZZ)V
      // 96f: goto 976
      // 972: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 975: athrow
      // 976: iload 4
      // 978: ifeq 9a1
      // 97b: aload 17
      // 97d: bipush 0
      // 97e: invokevirtual sla.wpv (I)[[I
      // 981: aload 17
      // 983: invokevirtual sla.jkj ()I
      // 986: aload 17
      // 988: invokevirtual sla.yva ()I
      // 98b: aload 17
      // 98d: invokevirtual sla.mpq ()I
      // 990: aload 17
      // 992: invokevirtual sla.prx ()I
      // 995: bipush 0
      // 996: bipush 0
      // 997: invokestatic p9t._vm ([[IIIIIZZ)V
      // 99a: goto 9a1
      // 99d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9a0: athrow
      // 9a1: goto a06
      // 9a4: astore 19
      // 9a6: aload 19
      // 9a8: sipush 10368
      // 9ab: ldc2_w 3024888114667170170
      // 9ae: lload 2
      // 9af: lxor
      // 9b0: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b5: nop
      // 9b6: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 9b9: astore 20
      // 9bb: aload 20
      // 9bd: sipush 31642
      // 9c0: ldc2_w 404041876250688111
      // 9c3: lload 2
      // 9c4: lxor
      // 9c5: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9ca: nop
      // 9cb: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 9ce: astore 21
      // 9d0: aload 21
      // 9d2: sipush 665
      // 9d5: ldc2_w 4511460373024932692
      // 9d8: lload 2
      // 9d9: lxor
      // 9da: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9df: nop
      // 9e0: aload 0
      // 9e1: getfield yu2.oxc Ljava/lang/String;
      // 9e4: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 9e7: aload 21
      // 9e9: sipush 16890
      // 9ec: ldc2_w 3672545717689466921
      // 9ef: lload 2
      // 9f0: lxor
      // 9f1: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f6: nop
      // 9f7: aload 17
      // 9f9: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 9fc: new oov
      // 9ff: dup
      // a00: aload 20
      // a02: invokespecial oov.<init> (Le1i;)V
      // a05: athrow
      // a06: aload 17
      // a08: invokevirtual sla.e7f ()Z
      // a0b: iload 4
      // a0d: ifne a3a
      // a10: ifeq a3b
      // a13: goto a1a
      // a16: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a19: athrow
      // a1a: aload 17
      // a1c: aload 0
      // a1d: getfield yu2.wrh Ljava/util/List;
      // a20: invokeinterface java/util/List.size ()I 1
      // a25: invokevirtual sla.tyn (I)V
      // a28: aload 0
      // a29: getfield yu2.wrh Ljava/util/List;
      // a2c: aload 17
      // a2e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a33: goto a3a
      // a36: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a39: athrow
      // a3a: pop
      // a3b: iload 4
      // a3d: ifeq 8fe
      // a40: aload 15
      // a42: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // a47: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // a4c: astore 16
      // a4e: aload 16
      // a50: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a55: ifeq a7e
      // a58: aload 16
      // a5a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a5f: checkcast sla
      // a62: astore 17
      // a64: aload 17
      // a66: aload 0
      // a67: getfield yu2.euf Lsla;
      // a6a: invokevirtual sla.k1h (Lsla;)V
      // a6d: iload 4
      // a6f: ifne aa8
      // a72: iload 4
      // a74: ifeq a4e
      // a77: goto a7e
      // a7a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // a7d: athrow
      // a7e: new java/lang/StringBuilder
      // a81: dup
      // a82: invokespecial java/lang/StringBuilder.<init> ()V
      // a85: sipush 26149
      // a88: ldc2_w 2228180383509899211
      // a8b: lload 2
      // a8c: lxor
      // a8d: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a92: nop
      // a93: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a96: aload 0
      // a97: getfield yu2.wrh Ljava/util/List;
      // a9a: invokeinterface java/util/List.size ()I 1
      // a9f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // aa2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // aa5: invokestatic hxt.t2o (Ljava/lang/String;)V
      // aa8: invokestatic hxt.jty ()Z
      // aab: iload 4
      // aad: ifne c67
      // ab0: ifeq c1d
      // ab3: goto aba
      // ab6: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab9: athrow
      // aba: aload 6
      // abc: invokevirtual rnq.zl9 ()I
      // abf: istore 16
      // ac1: aload 6
      // ac3: invokevirtual rnq.x3k ()I
      // ac6: istore 17
      // ac8: aload 6
      // aca: invokevirtual rnq.jp3 ()Ljava/util/List;
      // acd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // ad2: astore 18
      // ad4: aload 18
      // ad6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // adb: ifeq c11
      // ade: aload 18
      // ae0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // ae5: checkcast sla
      // ae8: astore 19
      // aea: aload 19
      // aec: iload 16
      // aee: putfield sla.raq I
      // af1: aload 19
      // af3: iload 17
      // af5: putfield sla.msv I
      // af8: aload 19
      // afa: aload 0
      // afb: getfield yu2.bz6 I
      // afe: putfield sla.qx2 I
      // b01: aload 19
      // b03: getfield sla.gm7 Lsla;
      // b06: astore 20
      // b08: iload 4
      // b0a: ifne c39
      // b0d: aload 20
      // b0f: iload 4
      // b11: ifne b27
      // b14: goto b1b
      // b17: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b1a: athrow
      // b1b: ifnull c0c
      // b1e: goto b25
      // b21: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b24: athrow
      // b25: aload 20
      // b27: invokevirtual sla.jkj ()I
      // b2a: iload 4
      // b2c: ifne ba3
      // b2f: ifgt b7c
      // b32: goto b39
      // b35: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b38: athrow
      // b39: aload 20
      // b3b: aload 19
      // b3d: invokevirtual sla.jkj ()I
      // b40: invokevirtual sla.opf (I)V
      // b43: aload 20
      // b45: aload 19
      // b47: invokevirtual sla.yva ()I
      // b4a: invokevirtual sla.myx (I)V
      // b4d: aload 20
      // b4f: aload 19
      // b51: invokevirtual sla.jkj ()I
      // b54: aload 19
      // b56: invokevirtual sla.yva ()I
      // b59: bipush 0
      // b5a: bipush 0
      // b5b: bipush 0
      // b5c: invokevirtual sla.f2h (IIIIZ)V
      // b5f: aload 20
      // b61: invokevirtual sla.et2 ()V
      // b64: aload 19
      // b66: invokevirtual sla.z4i ()Ljava/util/List;
      // b69: astore 21
      // b6b: aload 20
      // b6d: aload 21
      // b6f: invokevirtual sla.g6q (Ljava/util/List;)V
      // b72: aload 20
      // b74: aload 19
      // b76: invokevirtual sla.btp ()Lv8g;
      // b79: invokevirtual sla.ecz (Lv8g;)V
      // b7c: aload 20
      // b7e: iload 16
      // b80: putfield sla.raq I
      // b83: aload 20
      // b85: iload 17
      // b87: putfield sla.msv I
      // b8a: aload 20
      // b8c: aload 0
      // b8d: getfield yu2.bz6 I
      // b90: putfield sla.qx2 I
      // b93: aload 20
      // b95: aload 19
      // b97: invokevirtual sla.zrf ()I
      // b9a: invokevirtual sla.tyn (I)V
      // b9d: aload 19
      // b9f: invokevirtual sla.d9n ()V
      // ba2: bipush 0
      // ba3: istore 21
      // ba5: bipush 1
      // ba6: istore 22
      // ba8: aload 20
      // baa: bipush 0
      // bab: invokevirtual sla.wpv (I)[[I
      // bae: aload 20
      // bb0: invokevirtual sla.jkj ()I
      // bb3: aload 20
      // RotationHelper: invokevirtual sla.yva ()I
      // bb8: aload 20
      // bba: invokevirtual sla.mpq ()I
      // bbd: aload 20
      // bbf: invokevirtual sla.prx ()I
      // bc2: iload 21
      // bc4: iload 22
      // bc6: invokestatic p9t._vm ([[IIIIIZZ)V
      // bc9: goto c0c
      // bcc: astore 23
      // bce: new java/lang/StringBuilder
      // bd1: dup
      // bd2: invokespecial java/lang/StringBuilder.<init> ()V
      // bd5: sipush 31497
      // bd8: ldc2_w 1353539420349528804
      // bdb: lload 2
      // bdc: lxor
      // bdd: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be2: nop
      // be3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // be6: aload 20
      // be8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // beb: sipush 5832
      // bee: ldc2_w 6392323441643132695
      // bf1: lload 2
      // bf2: lxor
      // bf3: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf8: nop
      // bf9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bfc: aload 19
      // bfe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // c01: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c04: invokestatic hxt.brd (Ljava/lang/String;)V
      // c07: aload 23
      // c09: invokevirtual java/lang/Exception.printStackTrace ()V
      // c0c: iload 4
      // c0e: ifeq ad4
      // c11: invokestatic hxt.a59 ()Lc05;
      // c14: invokevirtual Minecraft.l22 ()Llc5;
      // c17: getstatic yu2.nu_ Lgdz;
      // c1a: invokevirtual lc5.anl (Lgdz;)V
      // c1d: getstatic net/optifine/reflect/Reflector.ForgeHooksClient_onTextureStitchedPost Lnet/optifine/reflect/ReflectorMethod;
      // c20: bipush 1
      // c21: anewarray 292
      // c24: dup
      // c25: bipush 0
      // c26: aload 0
      // c27: aastore
      // c28: invokestatic net/optifine/reflect/Reflector.callVoid (Lnet/optifine/reflect/ReflectorMethod;[Ljava/lang/Object;)V
      // c2b: aload 0
      // c2c: aload 6
      // c2e: invokevirtual rnq.zl9 ()I
      // c31: aload 6
      // c33: invokevirtual rnq.x3k ()I
      // c36: invokespecial yu2.d5b (II)V
      // c39: sipush 3057
      // c3c: ldc2_w 4949499211360963124
      // c3f: lload 2
      // c40: lxor
      // c41: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c46: nop
      // c47: invokestatic java/lang/System.getProperty (Ljava/lang/String;)Ljava/lang/String;
      // c4a: iload 4
      // c4c: ifne cc1
      // c4f: sipush 25273
      // c52: ldc2_w 4198259953145668422
      // c55: lload 2
      // c56: lxor
      // c57: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5c: nop
      // c5d: invokestatic hxt.r4o (Ljava/lang/Object;Ljava/lang/Object;)Z
      // c60: goto c67
      // c63: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c66: athrow
      // c67: ifeq cd6
      // c6a: new java/lang/StringBuilder
      // c6d: dup
      // c6e: invokespecial java/lang/StringBuilder.<init> ()V
      // c71: sipush 8407
      // c74: ldc2_w 7578998606507188491
      // c77: lload 2
      // c78: lxor
      // c79: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7e: nop
      // c7f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c82: aload 0
      // c83: getfield yu2.oxc Ljava/lang/String;
      // c86: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c89: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c8c: invokestatic hxt.brd (Ljava/lang/String;)V
      // c8f: new java/lang/StringBuilder
      // c92: dup
      // c93: invokespecial java/lang/StringBuilder.<init> ()V
      // c96: sipush 26247
      // c99: ldc2_w 1634042416731252589
      // c9c: lload 2
      // c9d: lxor
      // c9e: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca3: nop
      // ca4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ca7: aload 0
      // ca8: getfield yu2.oxc Ljava/lang/String;
      // cab: ldc "/"
      // cad: nop
      // cae: ldc "_"
      // cb0: nop
      // cb1: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // cb4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cb7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cba: goto cc1
      // cbd: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // cc0: athrow
      // cc1: aload 0
      // cc2: invokevirtual yu2.getGlTextureId ()I
      // cc5: aload 0
      // cc6: getfield yu2.bz6 I
      // cc9: aload 6
      // ccb: invokevirtual rnq.zl9 ()I
      // cce: aload 6
      // cd0: invokevirtual rnq.x3k ()I
      // cd3: invokestatic net/optifine/util/TextureUtils.saveGlTexture (Ljava/lang/String;IIII)V
      // cd6: return
   }

   public gdz ihf(gdz var1) {
      return this.cuw(var1, 0);
   }

   public gdz cuw(gdz param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yu2.a J
      // 03: ldc2_w 30003455489855
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokespecial yu2.vsq (Lgdz;)Z
      // 12: iload 5
      // 14: ifeq 56
      // 17: ifeq 55
      // 1a: goto 21
      // 1d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: new gdz
      // 24: dup
      // 25: aload 1
      // 26: invokevirtual gdz._a7 ()Ljava/lang/String;
      // 29: new java/lang/StringBuilder
      // 2c: dup
      // 2d: invokespecial java/lang/StringBuilder.<init> ()V
      // 30: aload 1
      // 31: invokevirtual gdz.xyp ()Ljava/lang/String;
      // 34: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 37: sipush 4259
      // 3a: ldc2_w 7210442375965973310
      // 3d: lload 3
      // 3e: lxor
      // 3f: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 48: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4b: invokespecial gdz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 4e: goto e5
      // 51: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: iload 2
      // 56: ifne 9f
      // 59: new gdz
      // 5c: dup
      // 5d: aload 1
      // 5e: invokevirtual gdz._a7 ()Ljava/lang/String;
      // 61: sipush 21225
      // 64: ldc2_w 8780061613515397473
      // 67: lload 3
      // 68: lxor
      // 69: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: nop
      // 6f: bipush 3
      // 70: anewarray 292
      // 73: dup
      // 74: bipush 0
      // 75: aload 0
      // 76: getfield yu2.oxc Ljava/lang/String;
      // 79: aastore
      // 7a: dup
      // 7b: bipush 1
      // 7c: aload 1
      // 7d: invokevirtual gdz.xyp ()Ljava/lang/String;
      // 80: aastore
      // 81: dup
      // 82: bipush 2
      // 83: sipush 32146
      // 86: ldc2_w 4993697070309209645
      // 89: lload 3
      // 8a: lxor
      // 8b: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: nop
      // 91: aastore
      // 92: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 95: invokespecial gdz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 98: goto e5
      // 9b: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9e: athrow
      // 9f: new gdz
      // a2: dup
      // a3: aload 1
      // a4: invokevirtual gdz._a7 ()Ljava/lang/String;
      // a7: sipush 22732
      // aa: ldc2_w 5807156422620304205
      // ad: lload 3
      // ae: lxor
      // af: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: nop
      // b5: bipush 4
      // b6: anewarray 292
      // b9: dup
      // ba: bipush 0
      // bb: aload 0
      // bc: getfield yu2.oxc Ljava/lang/String;
      // bf: aastore
      // c0: dup
      // c1: bipush 1
      // c2: aload 1
      // c3: invokevirtual gdz.xyp ()Ljava/lang/String;
      // c6: aastore
      // c7: dup
      // c8: bipush 2
      // c9: iload 2
      // ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // cd: aastore
      // ce: dup
      // cf: bipush 3
      // d0: sipush 32146
      // d3: ldc2_w 4993697070309209645
      // d6: lload 3
      // d7: lxor
      // d8: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: aastore
      // df: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // e2: invokespecial gdz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // e5: areturn
   }

   public sla brw(String var1) {
      int var2 = OpaquePredicate.c();
      sla var3 = (sla)this.btf.get(var1);

      try {
         if (var2 != 0) {
            return var3;
         }

         if (var3 != null) {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw a(var4);
      }

      return this.euf;
   }

   public void iev() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 2
      // 002: invokestatic OpaquePredicate.c ()I
      // 005: bipush 0
      // 006: istore 3
      // 007: istore 1
      // 008: aload 0
      // 009: invokevirtual yu2.getGlTextureId ()I
      // 00c: invokestatic p9t.ugy (I)V
      // 00f: bipush 0
      // 010: istore 4
      // 012: aload 0
      // 013: getfield yu2.wrh Ljava/util/List;
      // 016: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01b: astore 5
      // 01d: aload 5
      // 01f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 024: ifeq 097
      // 027: aload 5
      // 029: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02e: checkcast sla
      // 031: astore 6
      // 033: aload 0
      // 034: aload 6
      // 036: invokespecial yu2.mm2 (Lsla;)Z
      // 039: iload 1
      // 03a: ifne 09a
      // 03d: iload 1
      // 03e: ifne 06e
      // 041: goto 048
      // 044: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: ifeq 093
      // 04b: goto 052
      // 04e: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 051: athrow
      // 052: aload 6
      // 054: invokevirtual sla.jke ()V
      // 057: aload 6
      // 059: iload 1
      // 05a: ifne 079
      // 05d: goto 064
      // 060: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: invokevirtual sla.z8o ()Z
      // 067: goto 06e
      // 06a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: ifeq 074
      // 071: iinc 4 1
      // 074: aload 6
      // 076: getfield sla.uqo Lsla;
      // 079: iload 1
      // 07a: ifne 08e
      // 07d: ifnull 089
      // 080: goto 087
      // 083: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 086: athrow
      // 087: bipush 1
      // 088: istore 2
      // 089: aload 6
      // 08b: getfield sla.phv Lsla;
      // 08e: ifnull 093
      // 091: bipush 1
      // 092: istore 3
      // 093: iload 1
      // 094: ifeq 01d
      // 097: invokestatic hxt.jty ()Z
      // 09a: iload 1
      // 09b: ifne 15c
      // 09e: ifeq 159
      // 0a1: goto 0a8
      // 0a4: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: getfield yu2.wrh Ljava/util/List;
      // 0ac: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b1: astore 5
      // 0b3: aload 5
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 152
      // 0bd: aload 5
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: checkcast sla
      // 0c7: astore 6
      // 0c9: aload 0
      // 0ca: aload 6
      // 0cc: invokespecial yu2.mm2 (Lsla;)Z
      // 0cf: iload 1
      // 0d0: ifne 156
      // 0d3: ifeq 14e
      // 0d6: goto 0dd
      // 0d9: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: aload 6
      // 0df: getfield sla.gm7 Lsla;
      // 0e2: astore 7
      // 0e4: aload 7
      // 0e6: iload 1
      // 0e7: ifne 0f6
      // 0ea: ifnull 14e
      // 0ed: goto 0f4
      // 0f0: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: aload 6
      // 0f6: getstatic net/optifine/util/TextureUtils.iconClock Lsla;
      // 0f9: iload 1
      // 0fa: ifne 12c
      // 0fd: if_acmpeq 121
      // 100: goto 107
      // 103: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 106: athrow
      // 107: aload 6
      // 109: iload 1
      // 10a: ifne 13e
      // 10d: goto 114
      // 110: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: getstatic net/optifine/util/TextureUtils.iconCompass Lsla;
      // 117: if_acmpne 132
      // 11a: goto 121
      // 11d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: aload 7
      // 123: aload 6
      // 125: goto 12c
      // 128: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12b: athrow
      // 12c: getfield sla.v8x I
      // 12f: putfield sla.v8x I
      // 132: aload 6
      // 134: invokevirtual sla.d9n ()V
      // 137: aload 7
      // 139: invokevirtual sla.jke ()V
      // 13c: aload 7
      // 13e: invokevirtual sla.z8o ()Z
      // 141: ifeq 14e
      // 144: iinc 4 1
      // 147: goto 14e
      // 14a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14d: athrow
      // 14e: iload 1
      // 14f: ifeq 0b3
      // 152: aload 0
      // 153: invokevirtual yu2.getGlTextureId ()I
      // 156: invokestatic p9t.ugy (I)V
      // 159: invokestatic hxt.ly3 ()Z
      // 15c: iload 1
      // 15d: ifne 332
      // 160: ifeq 329
      // 163: goto 16a
      // 166: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 169: athrow
      // 16a: iload 2
      // 16b: iload 1
      // 16c: ifne 238
      // 16f: goto 176
      // 172: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 175: athrow
      // 176: ifeq 237
      // 179: goto 180
      // 17c: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17f: athrow
      // 180: aload 0
      // 181: invokevirtual yu2.getMultiTexID ()Lnet/optifine/shaders/MultiTexID;
      // 184: getfield net/optifine/shaders/MultiTexID.norm I
      // 187: invokestatic p9t.ugy (I)V
      // 18a: aload 0
      // 18b: getfield yu2.wrh Ljava/util/List;
      // 18e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 193: astore 5
      // 195: aload 5
      // 197: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19c: ifeq 237
      // 19f: aload 5
      // 1a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a6: checkcast sla
      // 1a9: astore 6
      // 1ab: aload 6
      // 1ad: getfield sla.uqo Lsla;
      // 1b0: iload 1
      // 1b1: ifne 281
      // 1b4: ifnull 233
      // 1b7: goto 1be
      // 1ba: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: aload 6
      // 1c1: invokespecial yu2.mm2 (Lsla;)Z
      // 1c4: ifeq 233
      // 1c7: goto 1ce
      // 1ca: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cd: athrow
      // 1ce: aload 6
      // 1d0: getstatic net/optifine/util/TextureUtils.iconClock Lsla;
      // 1d3: iload 1
      // 1d4: ifne 210
      // 1d7: goto 1de
      // 1da: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1dd: athrow
      // 1de: if_acmpeq 202
      // 1e1: goto 1e8
      // 1e4: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: aload 6
      // 1ea: iload 1
      // 1eb: ifne 223
      // 1ee: goto 1f5
      // 1f1: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f4: athrow
      // 1f5: getstatic net/optifine/util/TextureUtils.iconCompass Lsla;
      // 1f8: if_acmpne 216
      // 1fb: goto 202
      // 1fe: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 201: athrow
      // 202: aload 6
      // 204: getfield sla.uqo Lsla;
      // 207: aload 6
      // 209: goto 210
      // 20c: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20f: athrow
      // 210: getfield sla.v8x I
      // 213: putfield sla.v8x I
      // 216: aload 6
      // 218: getfield sla.uqo Lsla;
      // 21b: invokevirtual sla.jke ()V
      // 21e: aload 6
      // 220: getfield sla.uqo Lsla;
      // 223: invokevirtual sla.z8o ()Z
      // 226: ifeq 233
      // 229: iinc 4 1
      // 22c: goto 233
      // 22f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 232: athrow
      // 233: iload 1
      // 234: ifeq 195
      // 237: iload 3
      // 238: iload 1
      // 239: ifne 2fe
      // 23c: ifeq 2fd
      // 23f: goto 246
      // 242: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 245: athrow
      // 246: aload 0
      // 247: invokevirtual yu2.getMultiTexID ()Lnet/optifine/shaders/MultiTexID;
      // 24a: getfield net/optifine/shaders/MultiTexID.spec I
      // 24d: invokestatic p9t.ugy (I)V
      // 250: aload 0
      // 251: getfield yu2.wrh Ljava/util/List;
      // 254: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 259: astore 5
      // 25b: aload 5
      // 25d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 262: ifeq 2fd
      // 265: aload 5
      // 267: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26c: checkcast sla
      // 26f: astore 6
      // 271: iload 1
      // 272: ifne 322
      // 275: aload 6
      // 277: getfield sla.phv Lsla;
      // 27a: goto 281
      // 27d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 280: athrow
      // 281: ifnull 2f9
      // 284: aload 0
      // 285: aload 6
      // 287: invokespecial yu2.mm2 (Lsla;)Z
      // 28a: ifeq 2f9
      // 28d: goto 294
      // 290: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 293: athrow
      // 294: aload 6
      // 296: getstatic net/optifine/util/TextureUtils.iconClock Lsla;
      // 299: iload 1
      // 29a: ifne 2d6
      // 29d: goto 2a4
      // 2a0: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a3: athrow
      // 2a4: if_acmpeq 2c8
      // 2a7: goto 2ae
      // 2aa: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ad: athrow
      // 2ae: aload 6
      // 2b0: iload 1
      // 2b1: ifne 2e9
      // 2b4: goto 2bb
      // 2b7: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ba: athrow
      // 2bb: getstatic net/optifine/util/TextureUtils.iconCompass Lsla;
      // 2be: if_acmpne 2dc
      // 2c1: goto 2c8
      // 2c4: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c7: athrow
      // 2c8: aload 6
      // 2ca: getfield sla.uqo Lsla;
      // 2cd: aload 6
      // 2cf: goto 2d6
      // 2d2: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: getfield sla.v8x I
      // 2d9: putfield sla.v8x I
      // 2dc: aload 6
      // 2de: getfield sla.phv Lsla;
      // 2e1: invokevirtual sla.jke ()V
      // 2e4: aload 6
      // 2e6: getfield sla.phv Lsla;
      // 2e9: invokevirtual sla.z8o ()Z
      // 2ec: ifeq 2f9
      // 2ef: iinc 4 1
      // 2f2: goto 2f9
      // 2f5: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f8: athrow
      // 2f9: iload 1
      // 2fa: ifeq 25b
      // 2fd: iload 2
      // 2fe: iload 1
      // 2ff: ifne 326
      // 302: ifne 322
      // 305: goto 30c
      // 308: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 30b: athrow
      // 30c: iload 3
      // 30d: iload 1
      // 30e: ifne 332
      // 311: goto 318
      // 314: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: ifeq 329
      // 31b: goto 322
      // 31e: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 321: athrow
      // 322: aload 0
      // 323: invokevirtual yu2.getGlTextureId ()I
      // 326: invokestatic p9t.ugy (I)V
      // 329: invokestatic hxt.a59 ()Lc05;
      // 32c: getfield Minecraft.x0p Lv3i;
      // 32f: getfield v3i.bvo I
      // 332: istore 5
      // 334: iload 5
      // 336: iload 1
      // 337: ifne 35e
      // 33a: aload 0
      // 33b: getfield yu2.pr_ I
      // 33e: if_icmpeq 35b
      // 341: goto 348
      // 344: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 347: athrow
      // 348: aload 0
      // 349: iload 4
      // 34b: putfield yu2.l9e I
      // 34e: aload 0
      // 34f: iload 5
      // 351: putfield yu2.pr_ I
      // 354: goto 35b
      // 357: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35a: athrow
      // 35b: invokestatic net/optifine/SmartAnimations.isActive ()Z
      // 35e: ifeq 364
      // 361: invokestatic net/optifine/SmartAnimations.resetSpritesRendered ()V
      // 364: return
   }

   public sla qlr(gdz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yu2.a J
      // 03: ldc2_w 62685440377024
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: iload 4
      // 10: ifne 44
      // 13: ifnonnull 37
      // 16: goto 1d
      // 19: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: new java/lang/IllegalArgumentException
      // 20: dup
      // 21: sipush 1499
      // 24: ldc2_w 1140897382358776243
      // 27: lload 2
      // 28: lxor
      // 29: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: nop
      // 2f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 32: athrow
      // 33: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36: athrow
      // 37: aload 0
      // 38: getfield yu2.q05 Ljava/util/Map;
      // 3b: aload 1
      // 3c: invokevirtual gdz.toString ()Ljava/lang/String;
      // 3f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 44: checkcast sla
      // 47: astore 5
      // 49: aload 5
      // 4b: iload 4
      // 4d: ifne 9b
      // 50: ifnonnull 99
      // 53: goto 5a
      // 56: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 59: athrow
      // 5a: aload 1
      // 5b: invokestatic sla.x6u (Lgdz;)Lsla;
      // 5e: astore 5
      // 60: aload 0
      // 61: getfield yu2.q05 Ljava/util/Map;
      // 64: aload 1
      // 65: invokevirtual gdz.toString ()Ljava/lang/String;
      // 68: aload 5
      // 6a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 6f: pop
      // 70: aload 5
      // 72: iload 4
      // 74: ifne 9b
      // 77: aload 0
      // 78: getfield yu2.jy_ Lnet/optifine/util/CounterInt;
      // 7b: invokevirtual sla.zvx (Lnet/optifine/util/CounterInt;)V
      // 7e: invokestatic hxt.d8v ()Z
      // 81: ifeq 99
      // 84: goto 8b
      // 87: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 1
      // 8d: aload 5
      // 8f: invokespecial yu2._8y (Lgdz;Lsla;)V
      // 92: goto 99
      // 95: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 98: athrow
      // 99: aload 5
      // 9b: areturn
   }

   @Override
   public void tick() {
      this.iev();
   }

   public void kil(int var1) {
      this.bz6 = var1;
   }

   public sla ssk() {
      return this.euf;
   }

   public sla sy1(String var1) {
      return (sla)this.q05.get(var1);
   }

   public boolean c7c(String param1, sla param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield yu2.q05 Ljava/util/Map;
      // 08: aload 1
      // 09: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0e: iload 3
      // 0f: ifne 37
      // 12: ifne 36
      // 15: goto 1c
      // 18: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield yu2.q05 Ljava/util/Map;
      // 20: aload 1
      // 21: aload 2
      // 22: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 27: pop
      // 28: aload 2
      // 29: aload 0
      // 2a: getfield yu2.jy_ Lnet/optifine/util/CounterInt;
      // 2d: invokevirtual sla.zvx (Lnet/optifine/util/CounterInt;)V
      // 30: bipush 1
      // 31: ireturn
      // 32: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
   }

   public boolean n39(sla var1) {
      return this.c7c(var1.nfl(), var1);
   }

   public String yxx() {
      return this.oxc;
   }

   public int dnu() {
      return this.bz6;
   }

   private boolean vsq(gdz var1) {
      String var2 = var1.xyp();
      return this.gxi(var2);
   }

   private boolean gxi(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic yu2.a J
      // 03: ldc2_w 18589718735203
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 11: astore 5
      // 13: aload 5
      // 15: sipush 19724
      // 18: ldc2_w 5650946797431511234
      // 1b: lload 2
      // 1c: lxor
      // 1d: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: nop
      // 23: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 26: iload 4
      // 28: ifeq 5f
      // 2b: ifne 5e
      // 2e: goto 35
      // 31: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34: athrow
      // 35: aload 5
      // 37: sipush 31479
      // 3a: ldc2_w 2135132051782758159
      // 3d: lload 2
      // 3e: lxor
      // 3f: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: nop
      // 45: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 48: iload 4
      // 4a: ifeq 5f
      // 4d: goto 54
      // 50: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: ifeq 62
      // 57: goto 5e
      // 5a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5d: athrow
      // 5e: bipush 1
      // 5f: goto 63
      // 62: bipush 0
      // 63: ireturn
   }

   public sla tmv(String var1) {
      gdz var2 = new gdz(var1);
      return (sla)this.q05.get(var2.toString());
   }

   public sla q4s(gdz var1) {
      return (sla)this.q05.get(var1.toString());
   }

   private boolean mm2(sla param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic net/optifine/util/TextureUtils.iconWaterStill Lsla;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: if_acmpeq f0
      // 0f: goto 16
      // 12: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: aload 1
      // 17: getstatic net/optifine/util/TextureUtils.iconWaterFlow Lsla;
      // 1a: goto 21
      // 1d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 3a
      // 25: if_acmpeq f0
      // 28: goto 2f
      // 2b: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic net/optifine/util/TextureUtils.iconLavaStill Lsla;
      // 33: goto 3a
      // 36: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39: athrow
      // 3a: iload 2
      // 3b: ifeq 53
      // 3e: if_acmpeq ea
      // 41: goto 48
      // 44: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47: athrow
      // 48: aload 1
      // 49: getstatic net/optifine/util/TextureUtils.iconLavaFlow Lsla;
      // 4c: goto 53
      // 4f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 52: athrow
      // 53: iload 2
      // 54: ifeq 6c
      // 57: if_acmpeq ea
      // 5a: goto 61
      // 5d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60: athrow
      // 61: aload 1
      // 62: getstatic net/optifine/util/TextureUtils.iconFireLayer0 Lsla;
      // 65: goto 6c
      // 68: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b: athrow
      // 6c: iload 2
      // 6d: ifeq 85
      // 70: if_acmpeq e4
      // 73: goto 7a
      // 76: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 79: athrow
      // 7a: aload 1
      // 7b: getstatic net/optifine/util/TextureUtils.iconFireLayer1 Lsla;
      // 7e: goto 85
      // 81: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 84: athrow
      // 85: iload 2
      // 86: ifeq 9e
      // 89: if_acmpeq e4
      // 8c: goto 93
      // 8f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 92: athrow
      // 93: aload 1
      // 94: getstatic net/optifine/util/TextureUtils.iconPortal Lsla;
      // 97: goto 9e
      // 9a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 9d: athrow
      // 9e: iload 2
      // 9f: ifeq ba
      // a2: if_acmpne b6
      // a5: goto ac
      // a8: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ab: athrow
      // ac: invokestatic hxt.o4i ()Z
      // af: goto f3
      // b2: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // b5: athrow
      // b6: aload 1
      // b7: getstatic net/optifine/util/TextureUtils.iconClock Lsla;
      // ba: iload 2
      // bb: ifeq d3
      // be: if_acmpeq e0
      // c1: goto c8
      // c4: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c7: athrow
      // c8: aload 1
      // c9: getstatic net/optifine/util/TextureUtils.iconCompass Lsla;
      // cc: goto d3
      // cf: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d2: athrow
      // d3: if_acmpeq e0
      // d6: invokestatic hxt.ym4 ()Z
      // d9: goto f3
      // dc: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // df: athrow
      // e0: bipush 1
      // e1: goto f3
      // e4: invokestatic hxt.tv0 ()Z
      // e7: goto f3
      // ea: invokestatic hxt.gd5 ()Z
      // ed: goto f3
      // f0: invokestatic hxt.prm ()Z
      // f3: ireturn
   }

   public int qzm() {
      return this.jy_.getValue();
   }

   private int jj2(Map var1, y99 var2) {
      long var3 = a ^ 17682554158835L;
      int var5 = OpaquePredicate.b();
      int var6 = this.fh9(var1, var2, 20);

      int var10000;
      label65: {
         byte var10001;
         label66: {
            label59: {
               try {
                  var10000 = var6;
                  var10001 = 16;
                  if (var5 == 0) {
                     break label66;
                  }

                  if (var6 >= 16) {
                     break label59;
                  }
               } catch (RuntimeException var11) {
                  throw a(var11);
               }

               var6 = 16;
            }

            var6 = fe6.l0o(var6);

            try {
               var10000 = var6;
               if (var5 == 0) {
                  break label65;
               }

               var10001 = 16;
            } catch (RuntimeException var10) {
               throw a(var10);
            }
         }

         try {
            if (var10000 > var10001) {
               hxt.t2o(a<"p">(1475, 6185740626871191426L ^ var3) + var6);
            }
         } catch (RuntimeException var9) {
            throw a(var9);
         }

         var10000 = fe6.xjr(var6);
      }

      int var7 = var10000;

      try {
         if (var5 == 0) {
            return var7;
         }

         if (var7 >= 4) {
            return var7;
         }
      } catch (RuntimeException var8) {
         throw a(var8);
      }

      return 4;
   }

   private int fh9(Map param1, y99 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yu2.a J
      // 003: ldc2_w 113576155764573
      // 006: lxor
      // 007: lstore 4
      // 009: new java/util/HashMap
      // 00c: dup
      // 00d: invokespecial java/util/HashMap.<init> ()V
      // 010: astore 7
      // 012: invokestatic OpaquePredicate.c ()I
      // 015: aload 1
      // 016: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 01b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 020: astore 8
      // 022: istore 6
      // 024: aload 8
      // 026: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02b: ifeq 153
      // 02e: aload 8
      // 030: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 035: checkcast java/util/Map$Entry
      // 038: astore 9
      // 03a: aload 9
      // 03c: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 041: checkcast sla
      // 044: astore 10
      // 046: new gdz
      // 049: dup
      // 04a: aload 10
      // 04c: invokevirtual sla.nfl ()Ljava/lang/String;
      // 04f: invokespecial gdz.<init> (Ljava/lang/String;)V
      // 052: astore 11
      // 054: aload 0
      // 055: aload 11
      // 057: invokevirtual yu2.ihf (Lgdz;)Lgdz;
      // 05a: astore 12
      // 05c: aload 10
      // 05e: aload 2
      // 05f: aload 11
      // 061: invokevirtual sla.x5u (Ly99;Lgdz;)Z
      // 064: iload 6
      // 066: ifne 154
      // 069: ifne 14e
      // 06c: goto 073
      // 06f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 072: athrow
      // 073: aload 2
      // 074: aload 12
      // 076: invokeinterface y99.td5 (Lgdz;)Lyaa; 2
      // 07b: astore 13
      // 07d: aload 13
      // 07f: iload 6
      // 081: ifne 090
      // 084: ifnull 149
      // 087: goto 08e
      // 08a: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08d: athrow
      // 08e: aload 13
      // 090: invokeinterface yaa.f_4 ()Ljava/io/InputStream; 1
      // 095: astore 14
      // 097: aload 14
      // 099: iload 6
      // 09b: ifne 0aa
      // 09e: ifnull 149
      // 0a1: goto 0a8
      // 0a4: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a7: athrow
      // 0a8: aload 14
      // 0aa: sipush 1078
      // 0ad: ldc2_w 63131880049356795
      // 0b0: lload 4
      // 0b2: lxor
      // 0b3: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: invokestatic net/optifine/util/TextureUtils.getImageSize (Ljava/io/InputStream;Ljava/lang/String;)Ljava/awt/Dimension;
      // 0bc: astore 15
      // 0be: aload 14
      // 0c0: invokevirtual java/io/InputStream.close ()V
      // 0c3: aload 15
      // 0c5: iload 6
      // 0c7: ifne 0d6
      // 0ca: ifnull 149
      // 0cd: goto 0d4
      // 0d0: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: aload 15
      // 0d6: getfield java/awt/Dimension.width I
      // 0d9: istore 16
      // 0db: iload 16
      // 0dd: invokestatic fe6.l0o (I)I
      // 0e0: istore 17
      // 0e2: aload 7
      // 0e4: iload 17
      // 0e6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e9: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0ee: iload 6
      // 0f0: ifne 133
      // 0f3: ifne 11a
      // 0f6: goto 0fd
      // 0f9: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 7
      // 0ff: iload 17
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: bipush 1
      // 105: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 108: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 10d: pop
      // 10e: iload 6
      // 110: ifeq 149
      // 113: goto 11a
      // 116: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 7
      // 11c: iload 17
      // 11e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 121: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 126: checkcast java/lang/Integer
      // 129: invokevirtual java/lang/Integer.intValue ()I
      // 12c: goto 133
      // 12f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: istore 18
      // 135: aload 7
      // 137: iload 17
      // 139: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13c: iload 18
      // 13e: bipush 1
      // 13f: iadd
      // 140: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 143: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 148: pop
      // 149: goto 14e
      // 14c: astore 13
      // 14e: iload 6
      // 150: ifeq 024
      // 153: bipush 0
      // 154: istore 8
      // 156: aload 7
      // 158: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 15d: astore 9
      // 15f: new java/util/TreeSet
      // 162: dup
      // 163: aload 9
      // 165: invokespecial java/util/TreeSet.<init> (Ljava/util/Collection;)V
      // 168: astore 10
      // 16a: aload 10
      // 16c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 171: astore 12
      // 173: aload 12
      // 175: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17a: ifeq 1b1
      // 17d: aload 12
      // 17f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 184: checkcast java/lang/Integer
      // 187: invokevirtual java/lang/Integer.intValue ()I
      // 18a: istore 13
      // 18c: aload 7
      // 18e: iload 13
      // 190: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 193: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 198: checkcast java/lang/Integer
      // 19b: invokevirtual java/lang/Integer.intValue ()I
      // 19e: istore 11
      // 1a0: iload 8
      // 1a2: iload 11
      // 1a4: iadd
      // 1a5: iload 6
      // 1a7: ifne 1b3
      // 1aa: istore 8
      // 1ac: iload 6
      // 1ae: ifeq 173
      // 1b1: bipush 16
      // 1b3: istore 12
      // 1b5: bipush 0
      // 1b6: istore 13
      // 1b8: iload 8
      // 1ba: iload 3
      // 1bb: imul
      // 1bc: bipush 100
      // 1be: idiv
      // 1bf: istore 11
      // 1c1: aload 10
      // 1c3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1c8: astore 14
      // 1ca: aload 14
      // 1cc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d1: ifeq 23c
      // 1d4: aload 14
      // 1d6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1db: checkcast java/lang/Integer
      // 1de: invokevirtual java/lang/Integer.intValue ()I
      // 1e1: istore 15
      // 1e3: aload 7
      // 1e5: iload 15
      // 1e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ea: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1ef: checkcast java/lang/Integer
      // 1f2: invokevirtual java/lang/Integer.intValue ()I
      // 1f5: istore 16
      // 1f7: iload 13
      // 1f9: iload 16
      // 1fb: iadd
      // 1fc: istore 13
      // 1fe: iload 15
      // 200: iload 6
      // 202: ifne 23e
      // 205: iload 12
      // 207: iload 6
      // 209: ifne 231
      // 20c: goto 213
      // 20f: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 212: athrow
      // 213: if_icmple 221
      // 216: goto 21d
      // 219: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21c: athrow
      // 21d: iload 15
      // 21f: istore 12
      // 221: iload 13
      // 223: iload 6
      // 225: ifne 236
      // 228: iload 11
      // 22a: goto 231
      // 22d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 230: athrow
      // 231: if_icmple 237
      // 234: iload 12
      // 236: ireturn
      // 237: iload 6
      // 239: ifeq 1ca
      // 23c: iload 12
      // 23e: ireturn
   }

   private int tt5() {
      int var1 = OpaquePredicate.b();
      int var2 = 1 << this.bz6;

      try {
         if (var1 == 0) {
            return var2;
         }

         if (var2 >= 8) {
            return var2;
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return 8;
   }

   private int[] w7q(int var1) {
      BufferedImage var2 = new BufferedImage(16, 16, 2);
      var2.setRGB(0, 0, 16, 16, p9t.dj3, 0, 16);
      BufferedImage var3 = TextureUtils.scaleImage(var2, var1);
      int[] var4 = new int[var1 * var1];
      var3.getRGB(0, 0, var1, var1, var4, 0, var1);
      return var4;
   }

   public boolean fyb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic hzu.dit ()I
      // 03: istore 2
      // 04: invokestatic OpaquePredicate.c ()I
      // 07: aload 0
      // 08: invokevirtual yu2.getGlTextureId ()I
      // 0b: istore 3
      // 0c: istore 1
      // 0d: iload 2
      // 0e: iload 1
      // 0f: ifne 25
      // 12: iload 3
      // 13: if_icmpne 28
      // 16: goto 1d
      // 19: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 25
      // 21: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: goto 29
      // 28: bipush 0
      // 29: ireturn
   }

   private void d5b(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic yu2.a J
      // 003: ldc2_w 45210810792069
      // 006: lxor
      // 007: lstore 3
      // 008: aload 0
      // 009: bipush -1
      // 00a: putfield yu2.cf2 I
      // 00d: aload 0
      // 00e: bipush -1
      // 00f: putfield yu2.hm_ I
      // 012: invokestatic OpaquePredicate.b ()I
      // 015: aload 0
      // 016: aconst_null
      // 017: putfield yu2.gts [Lsla;
      // 01a: istore 5
      // 01c: aload 0
      // 01d: iload 5
      // 01f: ifeq 071
      // 022: getfield yu2.gal I
      // 025: ifle 24e
      // 028: goto 02f
      // 02b: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02e: athrow
      // 02f: aload 0
      // 030: iload 1
      // 031: aload 0
      // 032: getfield yu2.gal I
      // 035: idiv
      // 036: putfield yu2.cf2 I
      // 039: aload 0
      // 03a: iload 2
      // 03b: aload 0
      // 03c: getfield yu2.gal I
      // 03f: idiv
      // 040: putfield yu2.hm_ I
      // 043: aload 0
      // 044: aload 0
      // 045: getfield yu2.cf2 I
      // 048: aload 0
      // 049: getfield yu2.hm_ I
      // 04c: imul
      // 04d: anewarray 126
      // 050: putfield yu2.gts [Lsla;
      // 053: aload 0
      // 054: dconst_1
      // 055: aload 0
      // 056: getfield yu2.cf2 I
      // 059: i2d
      // 05a: ddiv
      // 05b: putfield yu2.d_p D
      // 05e: aload 0
      // 05f: dconst_1
      // 060: aload 0
      // 061: getfield yu2.hm_ I
      // 064: i2d
      // 065: ddiv
      // 066: putfield yu2.rwe D
      // 069: aload 0
      // 06a: goto 071
      // 06d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 070: athrow
      // 071: getfield yu2.btf Ljava/util/Map;
      // 074: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 079: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 07e: astore 6
      // 080: aload 6
      // 082: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 087: ifeq 24e
      // 08a: aload 6
      // 08c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 091: checkcast sla
      // 094: astore 7
      // 096: ldc2_w 0.5
      // 099: iload 1
      // 09a: i2d
      // 09b: ddiv
      // 09c: dstore 8
      // 09e: ldc2_w 0.5
      // 0a1: iload 2
      // 0a2: i2d
      // 0a3: ddiv
      // 0a4: dstore 10
      // 0a6: aload 7
      // 0a8: invokevirtual sla.l3u ()F
      // 0ab: aload 7
      // 0ad: invokevirtual sla.w2b ()F
      // 0b0: invokestatic java/lang/Math.min (FF)F
      // 0b3: f2d
      // 0b4: dload 8
      // 0b6: dadd
      // 0b7: dstore 12
      // 0b9: aload 7
      // 0bb: invokevirtual sla.bhi ()F
      // 0be: aload 7
      // 0c0: invokevirtual sla.e8_ ()F
      // 0c3: invokestatic java/lang/Math.min (FF)F
      // 0c6: f2d
      // 0c7: dload 10
      // 0c9: dadd
      // 0ca: dstore 14
      // 0cc: aload 7
      // 0ce: invokevirtual sla.l3u ()F
      // 0d1: aload 7
      // 0d3: invokevirtual sla.w2b ()F
      // 0d6: invokestatic java/lang/Math.max (FF)F
      // 0d9: f2d
      // 0da: dload 8
      // 0dc: dsub
      // 0dd: dstore 16
      // 0df: aload 7
      // 0e1: invokevirtual sla.bhi ()F
      // 0e4: aload 7
      // 0e6: invokevirtual sla.e8_ ()F
      // 0e9: invokestatic java/lang/Math.max (FF)F
      // 0ec: f2d
      // 0ed: dload 10
      // 0ef: dsub
      // 0f0: dstore 18
      // 0f2: dload 12
      // 0f4: aload 0
      // 0f5: getfield yu2.d_p D
      // 0f8: ddiv
      // 0f9: d2i
      // 0fa: istore 20
      // 0fc: dload 14
      // 0fe: aload 0
      // 0ff: getfield yu2.rwe D
      // 102: ddiv
      // 103: d2i
      // 104: istore 21
      // 106: dload 16
      // 108: aload 0
      // 109: getfield yu2.d_p D
      // 10c: ddiv
      // 10d: d2i
      // 10e: istore 22
      // 110: dload 18
      // 112: aload 0
      // 113: getfield yu2.rwe D
      // 116: ddiv
      // 117: d2i
      // 118: istore 23
      // 11a: iload 20
      // 11c: istore 24
      // 11e: iload 24
      // 120: iload 22
      // 122: if_icmpgt 249
      // 125: iload 24
      // 127: iload 5
      // 129: ifeq 087
      // 12c: iload 5
      // 12e: ifeq 13d
      // 131: iflt 1fe
      // 134: goto 13b
      // 137: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13a: athrow
      // 13b: iload 24
      // 13d: iload 5
      // 13f: ifeq 159
      // 142: aload 0
      // 143: getfield yu2.cf2 I
      // 146: if_icmpge 1fe
      // 149: goto 150
      // 14c: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14f: athrow
      // 150: iload 21
      // 152: goto 159
      // 155: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: istore 25
      // 15b: iload 25
      // 15d: iload 23
      // 15f: if_icmpgt 1f9
      // 162: iload 25
      // 164: iload 5
      // 166: ifeq 120
      // 169: iload 5
      // 16b: ifeq 17a
      // 16e: iflt 1ae
      // 171: goto 178
      // 174: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 177: athrow
      // 178: iload 25
      // 17a: aload 0
      // 17b: getfield yu2.cf2 I
      // 17e: iload 5
      // 180: ifeq 19d
      // 183: if_icmpge 1ae
      // 186: goto 18d
      // 189: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18c: athrow
      // 18d: iload 25
      // 18f: aload 0
      // 190: getfield yu2.cf2 I
      // 193: imul
      // 194: iload 24
      // 196: goto 19d
      // 199: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19c: athrow
      // 19d: iadd
      // 19e: istore 26
      // 1a0: aload 0
      // 1a1: getfield yu2.gts [Lsla;
      // 1a4: iload 26
      // 1a6: aload 7
      // 1a8: aastore
      // 1a9: iload 5
      // 1ab: ifne 1f1
      // 1ae: new java/lang/StringBuilder
      // 1b1: dup
      // 1b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b5: sipush 31420
      // 1b8: ldc2_w 1918120399991717525
      // 1bb: lload 3
      // 1bc: lxor
      // 1bd: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: nop
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c6: iload 25
      // 1c8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1cb: sipush 11353
      // 1ce: ldc2_w 5617397143223298165
      // 1d1: lload 3
      // 1d2: lxor
      // 1d3: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: nop
      // 1d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dc: aload 7
      // 1de: invokevirtual sla.nfl ()Ljava/lang/String;
      // 1e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e7: invokestatic hxt.a2t (Ljava/lang/String;)V
      // 1ea: goto 1f1
      // 1ed: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1f0: athrow
      // 1f1: iinc 25 1
      // 1f4: iload 5
      // 1f6: ifne 15b
      // 1f9: iload 5
      // 1fb: ifne 241
      // 1fe: new java/lang/StringBuilder
      // 201: dup
      // 202: invokespecial java/lang/StringBuilder.<init> ()V
      // 205: sipush 26993
      // 208: ldc2_w 6719536557685615989
      // 20b: lload 3
      // 20c: lxor
      // 20d: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: nop
      // 213: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 216: iload 24
      // 218: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 21b: sipush 6169
      // 21e: ldc2_w 194265164787571723
      // 221: lload 3
      // 222: lxor
      // 223: invokedynamic p (IJ)Ljava/lang/String; bsm=yu2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: nop
      // 229: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22c: aload 7
      // 22e: invokevirtual sla.nfl ()Ljava/lang/String;
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 237: invokestatic hxt.a2t (Ljava/lang/String;)V
      // 23a: goto 241
      // 23d: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 240: athrow
      // 241: iinc 24 1
      // 244: iload 5
      // 246: ifne 11e
      // 249: iload 5
      // 24b: ifne 080
      // 24e: return
   }

   public sla zd9(double var1, double var3) {
      int var5 = OpaquePredicate.b();

      try {
         if (this.gts == null) {
            return null;
         }
      } catch (RuntimeException var11) {
         throw a(var11);
      }

      int var6 = (int)(var1 / this.d_p);
      int var7 = (int)(var3 / this.rwe);
      int var8 = var7 * this.cf2 + var6;

      int var10000;
      label32: {
         try {
            var10000 = var8;
            if (var5 == 0) {
               break label32;
            }

            if (var8 < 0) {
               return null;
            }
         } catch (RuntimeException var10) {
            throw a(var10);
         }

         var10000 = var8;
      }

      try {
         if (var10000 <= this.gts.length) {
            return this.gts[var8];
         }
      } catch (RuntimeException var9) {
         throw a(var9);
      }

      return null;
   }

   private void _8y(gdz param1, sla param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: invokestatic net/optifine/EmissiveTextures.getSuffixEmissive ()Ljava/lang/String;
      // 07: astore 4
      // 09: aload 4
      // 0b: iload 3
      // 0c: ifeq 2f
      // 0f: ifnull 85
      // 12: goto 19
      // 15: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18: athrow
      // 19: aload 1
      // 1a: iload 3
      // 1b: ifeq 5f
      // 1e: goto 25
      // 21: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: invokevirtual gdz.xyp ()Ljava/lang/String;
      // 28: goto 2f
      // 2b: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e: athrow
      // 2f: aload 4
      // 31: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 34: ifne 85
      // 37: new gdz
      // 3a: dup
      // 3b: aload 1
      // 3c: invokevirtual gdz._a7 ()Ljava/lang/String;
      // 3f: new java/lang/StringBuilder
      // 42: dup
      // 43: invokespecial java/lang/StringBuilder.<init> ()V
      // 46: aload 1
      // 47: invokevirtual gdz.xyp ()Ljava/lang/String;
      // 4a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d: aload 4
      // 4f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 52: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 55: invokespecial gdz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 58: goto 5f
      // 5b: invokestatic yu2.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e: athrow
      // 5f: astore 5
      // 61: aload 0
      // 62: aload 5
      // 64: invokevirtual yu2.ihf (Lgdz;)Lgdz;
      // 67: astore 6
      // 69: aload 6
      // 6b: invokestatic hxt._u1 (Lgdz;)Z
      // 6e: ifeq 85
      // 71: aload 0
      // 72: aload 5
      // 74: invokevirtual yu2.qlr (Lgdz;)Lsla;
      // 77: astore 7
      // 79: aload 7
      // 7b: bipush 1
      // 7c: putfield sla.kr7 Z
      // 7f: aload 2
      // 80: aload 7
      // 82: putfield sla.pdf Lsla;
      // 85: return
   }

   public int nse() {
      return this.wrh.size();
   }

   public int zoh() {
      return this.l9e;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(748073283628437985L, 6450389612611761247L, MethodHandles.lookup().lookupClass()).a(198988210964098L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 66329276647202L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[57];
      int var5 = 0;
      String var4 = "@F\b\u001eÑ,SÖ\u009eOÎ\u00029ÁÔD`ÇÛAbê\u0001qÐ7Q4ÁIê1©\u0092¿\u0090íbô.UÊrM\u009aåÏð\u0006Ë§\u0016ð4\u008el\u0087>Ñ¨*ÕèØ È\u00058\u0017t s±ÞçM`\u0018\\1V\u008f\u0089áef\u0096ä%Ô\u008d\"Íp\u009dc¤\u0010\u0093NBV\u008902:%e¦wCt\u001a$ \u001aO[ï\u000e±KÄti\u001a{m\u001c¾\u001c\u008e\u0091\u001f\u0007wD\u0013¿\u00adêÝØ\u0000±\u0001N\u0010\u0002\b1ßP,0#IÄ\niA.ú\u001d8¸\u000bÍ\u008d}d¸þBïvÇ\u0013\u001b\u0095\tÂ\u0002q\u0019Uàá:tùAl\u0080Ðv;©\u0010\u001a\u0098\u00922C\u0084ÊjõkÏk }Y\u0085nxkß\u0012W(7\nå@R¶i\u0015¿ò2\u008aR«\u008d\u0000\u0087.´9lw\u0007wÚKU9H\u009f\u00926Së´î\u001b@,à(\u0017úïÂ\u0098¹'\u0003½Ù5yÌ\u008dÏ,\u0007\u0093²J+±y\u008a#âNì\u0015[©\u0084¼rÖlÌÛÏ20Ó\u008dpL§sB\u008d£\u009bÂnp\u0082~TrÝ!°JrÌkCF\u0002¡\u009b\"ll4èki\u0082%ïQc\u0005ì\u0003½&\u009dÖ0\u009aö&íÌ¬q\u009c\u000büÏ1¨\u0006\rË¹:\u0016RZ\u0089\u00933«'©ýÈOo-\u000fçâ¨\u0000|î«¾t\u0017\u000e\u0013GÛ\u0001 \u0092\u0007o\u00873ì+¨}×<÷\u0010Ë\u00952ù£\u0099ì\u001c²uÉ®Z\u001d4g1n5 µç\u008aSÞB\u000f&ÔµmÜ\u0017)§íÏP¥\u0006\u0095§\u00ad»Ñ|¹Ò\u009e»\u001aÛ\u0018¬ÔhbH\u009e¶ \u0012S7I¼\u0080\u001e®@\u0093ó\u001a4\\\u009bo(íalÓ\u008cP½\u000em\u0083\u0000°¿`/Sj\u0082(U9SÊ,ÚU©>ÒÄsã&A×äQ\u000bÈ\u0083\u0010ÆÇ\u0086Ò°ÁtH\u009cîÃ¤ êQÒ@\u0082ò¦éªÅ\u0019_>?\u00adI¤\nG\u001fw[\u0017\u009c>Øçúo¾µ«êµÓ\u000füî\u0014\u0013ÓÒ©´ÅçBz j\u009d\r\b|ïý\u0005vàÏ)\u0019DÃì\u001c\u001aY8ßn\u0085\u0080NrB¾s\u0019\u009cÛ\u0092è\u0001Íç³ºC¤ÝQ]b>¡=\u000e\u0084\u001e£êÑñ\u0087Î\u0086\"OÆ\u0017\u0093\u007fªï9;I/\u0082wj7Z¸\u0010?.¦OÅï\u0098\u0010\u00812+_¢\u0001ú¾8£àÿ/s{xr\u0014K\u0099Ü2§ù³U+ìÀ½ø_\u008e\u0019\u0086\u0005¶G8\u0099\u001c\u0084:³\u008cáHöÅ\u0019?\u0098òö,g\u0088ª%h\u0001-¯\u0097³(Fç Æ<\u007fR\u0012mëâõ\u0080/Å\u0000Î\u0012`Wfr:²IM\u0089YL\u0085\u0099§ª\u008d¹@¤Y\u0095](nÜ1µÈ&\u008b0â²qeñ\u001a:Qv½8½×üÊy\u001dwË\r£H\r¨\u0088hÏA\u009b\u0088ìê\u0018ÀoP\u0099:\nýÔÌ¸\u009bëË\u0014{fè\u0080½õÿ\u001fWÒ\u0010óëP\u000f\u000bd\u009fòqU\u0099©©\u008ald\u0010¡\u00989ü/ý¡Ëfîl~CJexHÁ8\u00924Ê \u0080\u0007 ³ûm\u009cÃ6:ôçh\u001cÚvè³öÿþq²\u0086\u0097\u0002\u0089L¿F@\u0087è\u0004ÿª'\u0092\u0099#Æ\u0019$\u0095?ôÜJßÛ\u0001Øñ\u000e\u001a<¬ôI8Cú½nÖ&0ùXÉ\u0081¯k~\u0014mcnÐ\u0010§f\u0010§Û\"y<\u009bÓ®|\u008dFÀÿµ(\"\u0011I\u0081\u0016@·\u001eÄ\u009a±´¤×¯=\u0004 E\u0083ÆÐè·â¥È\u0006³xmmyÈÛ2Cð:)\u0001\u0092Û6`Æt\u008e.*0u~1<°â¦©îT8&þz\u001f\u0018õ\u008d\u0080ê\u000bÑnãÈÌ.¯@Á÷\u008f\u0016s$°9JË\u0012î\u001e\u0091éc@ð½\u0080}å¬%#ÖwÈåW\u00ad2T\u0085÷ØMd2¥\u009b\u009a\u008eVQN\u0004ñâcxJÞ\u008b ÛÝGo:«ô ü6Pª÷ÌdÏ&\u008f;GkÇ\u0083\u0019+¹nÈ\u0098Ï\u0095) -\u008a\u001d\u001c>Paxøâ»âh\u0007tU!ew³\u008aüSZü©'Õº\u009a¤ùVå±gè\u00ad/Å\u0087\u009cìý¶äjKà\u0011¾\u0015;¢[O\u001e8Vs\u0018\u0013\\¯u·\u0080WW¯Jð·Ö¬\u0003ë\u001dt\u008bIý\u000f\u0082\u009c Ôk\u00adYÏ \u0087Ì}´e´ e\u0017¨\\\u0000&\u0013%Áæ:\u0003d\u0014q\u0007Ø\u0002¥0×¯\u008e®^V\u007f¼?\u0002\u001dºû)ï¥i2q@2êt;'Óà\u0002d\"wT\u0005N\u0084\u0012÷\u0018\u0006Àajö]\u0095MáÇ\u0010)\u008cC<\u008ca\\OÃoßA¢jv.(\u001f\u001b¥ü Y?Uaéº\u0019\u009c;Ñe&5\u0006 ¦¸¯¿î·ªo\u0091z\u0007\u001b\u0081¿ÄíT\u0016#  #\u0087 \u001báÞqmó\u0086~\u00ad$G?è¼=o/»Ïá\u0013\b\u0087¶E\u0007¥)\u00ad\u0010\u0017áÕ\u0011û±-\u0098\u008dõã\u0093Ù¯\u0099Q\u0018¶¸4¿B7ïvîú5ÞAgLC\u008eÈÜëfS\u0002/X½Vñ\fÊméo\u008d\u0086¾«-_ñ%\u0081E\u0006\u0083¿r\u0011 kû[Kéà\u0002\u0098[\u009buÚ\u0001µûÔp\u0094O\u008c@±5\u0005è8\u0002¥.[Lp\\iøH\u009bÿ\u0091Ï\u009a\u0012\tS\u0092Y£\f\u0018\u009bul?Ùþu>ÙË\u0016Ã\u0018\u001f{0þ\u0095ÑÔ=Ò+\\6Å\u00adN\u007f\u0005áëë\u0080\u0096áàÆf<\u0096\u008aÌ]\u00ada\u008b\u0088\u007fØv\u000fY\u0016\u009cÎ\bY\u009aæâIkï(8\u00167\u0085æéÇ\u0017\u00ad`RFcRxü.\"«°{Òl\u0003\fÁ¤\u001d[n\u008e*\u0081\u008b\u001aºürËQ \u0019?Qä]\u009d\u008b\u0004S@õÚ+k¸[JÂí\u008b\u001c\u0005Ñ}\u0083ãF¯¤+f# Ð\u0099\u008f%\u001aîÎ*¼_\u0001þÍ£\u0006\u0089²ô¸ô\u0098Cï\b°áªÈÒÈ®ñ8Ö*§G\u001b¬6'\u001cÞÀ°\u001dµ1ºUC·Ú¨ãÈ£FUqÖ\"\u0016ëìkEPè££/¸\u0011fbÖ¢\u008a\u007f\u0087\u0002®á2\u009aiË5\u0018\u001bËgÿz¼ËÈ¬\u008aK©½\u0006\u0087Dm\u001aYb¦¬u\u0091\u0010\u007fàXÑC^I`JN\u0014üÅ\u0092^ý\u0018\u009d\ru\u0012<\u008d¶\u001a\u0013.\u0090\u000e\\Öm\u008eò\u000bnâ\u0007³WV\u0010-8°\u0011Ú ]f\u0080Í}\u0089®ðmâ ðÉR\u009e¿\fWsÚp\u0017é×ôàÉ¶¥oÙ\u008ay7;ñÙ\u001eõ\u0003¡®_\u0018¼ø³EÅ¥\u0001ÇÂVò§\tÁ{l\u008eéæCÄu\u0011\u0080(\u0098\u0094¾ñ.ËÙm=W¡ï\r½\u001c\u009e\u0011®£M\u0092s®°_ª_¸DÉ´G\u008c\u0002\u0086\u0088or\u0013¤(Ü¸Á\u0099Ü¨õKó¤\r¥å\u0003\u0091L\u0010\u0087F\u0016¦½ãµEM\u008d\u0002¨\bÐY§uÕPáâ¹á\u0010±\u008b\u0089#È\u0015ÒHÞ´Ñ\u008e+\u00900\u0084p%Éà\u0019ÎIË\u0096i^\u009d\u0094<pvj'XâOf3\u0013a\u008e-ú/\u0017\u0014!\u009fV;°§íÁÇ\u0093\u0002p\u0095¹{Âù'$`¤ù\u0082:cÏÛ\u0016\u0018AÐ\u0080¼É(Ôoí#\u0019A»\u0011õÍp)\u0088ÎºÐ1\u0094a\u0097½M\u0095\u0088u\u008e\u008aSB\u00911Y¨ÁG,\u009e\u0002ò~S²3!Ø\u009f% ô jÛ¸ \u001f$n²\u0015\u0013Û]Â.\u0084)§RÔ\u001cmµÒ\u00125\u001fÚ¶Ð\u007f\u001024³\u008cV\u0080\u0096\u0088N&ßï7`\u0007¬";
      int var6 = "@F\b\u001eÑ,SÖ\u009eOÎ\u00029ÁÔD`ÇÛAbê\u0001qÐ7Q4ÁIê1©\u0092¿\u0090íbô.UÊrM\u009aåÏð\u0006Ë§\u0016ð4\u008el\u0087>Ñ¨*ÕèØ È\u00058\u0017t s±ÞçM`\u0018\\1V\u008f\u0089áef\u0096ä%Ô\u008d\"Íp\u009dc¤\u0010\u0093NBV\u008902:%e¦wCt\u001a$ \u001aO[ï\u000e±KÄti\u001a{m\u001c¾\u001c\u008e\u0091\u001f\u0007wD\u0013¿\u00adêÝØ\u0000±\u0001N\u0010\u0002\b1ßP,0#IÄ\niA.ú\u001d8¸\u000bÍ\u008d}d¸þBïvÇ\u0013\u001b\u0095\tÂ\u0002q\u0019Uàá:tùAl\u0080Ðv;©\u0010\u001a\u0098\u00922C\u0084ÊjõkÏk }Y\u0085nxkß\u0012W(7\nå@R¶i\u0015¿ò2\u008aR«\u008d\u0000\u0087.´9lw\u0007wÚKU9H\u009f\u00926Së´î\u001b@,à(\u0017úïÂ\u0098¹'\u0003½Ù5yÌ\u008dÏ,\u0007\u0093²J+±y\u008a#âNì\u0015[©\u0084¼rÖlÌÛÏ20Ó\u008dpL§sB\u008d£\u009bÂnp\u0082~TrÝ!°JrÌkCF\u0002¡\u009b\"ll4èki\u0082%ïQc\u0005ì\u0003½&\u009dÖ0\u009aö&íÌ¬q\u009c\u000büÏ1¨\u0006\rË¹:\u0016RZ\u0089\u00933«'©ýÈOo-\u000fçâ¨\u0000|î«¾t\u0017\u000e\u0013GÛ\u0001 \u0092\u0007o\u00873ì+¨}×<÷\u0010Ë\u00952ù£\u0099ì\u001c²uÉ®Z\u001d4g1n5 µç\u008aSÞB\u000f&ÔµmÜ\u0017)§íÏP¥\u0006\u0095§\u00ad»Ñ|¹Ò\u009e»\u001aÛ\u0018¬ÔhbH\u009e¶ \u0012S7I¼\u0080\u001e®@\u0093ó\u001a4\\\u009bo(íalÓ\u008cP½\u000em\u0083\u0000°¿`/Sj\u0082(U9SÊ,ÚU©>ÒÄsã&A×äQ\u000bÈ\u0083\u0010ÆÇ\u0086Ò°ÁtH\u009cîÃ¤ êQÒ@\u0082ò¦éªÅ\u0019_>?\u00adI¤\nG\u001fw[\u0017\u009c>Øçúo¾µ«êµÓ\u000füî\u0014\u0013ÓÒ©´ÅçBz j\u009d\r\b|ïý\u0005vàÏ)\u0019DÃì\u001c\u001aY8ßn\u0085\u0080NrB¾s\u0019\u009cÛ\u0092è\u0001Íç³ºC¤ÝQ]b>¡=\u000e\u0084\u001e£êÑñ\u0087Î\u0086\"OÆ\u0017\u0093\u007fªï9;I/\u0082wj7Z¸\u0010?.¦OÅï\u0098\u0010\u00812+_¢\u0001ú¾8£àÿ/s{xr\u0014K\u0099Ü2§ù³U+ìÀ½ø_\u008e\u0019\u0086\u0005¶G8\u0099\u001c\u0084:³\u008cáHöÅ\u0019?\u0098òö,g\u0088ª%h\u0001-¯\u0097³(Fç Æ<\u007fR\u0012mëâõ\u0080/Å\u0000Î\u0012`Wfr:²IM\u0089YL\u0085\u0099§ª\u008d¹@¤Y\u0095](nÜ1µÈ&\u008b0â²qeñ\u001a:Qv½8½×üÊy\u001dwË\r£H\r¨\u0088hÏA\u009b\u0088ìê\u0018ÀoP\u0099:\nýÔÌ¸\u009bëË\u0014{fè\u0080½õÿ\u001fWÒ\u0010óëP\u000f\u000bd\u009fòqU\u0099©©\u008ald\u0010¡\u00989ü/ý¡Ëfîl~CJexHÁ8\u00924Ê \u0080\u0007 ³ûm\u009cÃ6:ôçh\u001cÚvè³öÿþq²\u0086\u0097\u0002\u0089L¿F@\u0087è\u0004ÿª'\u0092\u0099#Æ\u0019$\u0095?ôÜJßÛ\u0001Øñ\u000e\u001a<¬ôI8Cú½nÖ&0ùXÉ\u0081¯k~\u0014mcnÐ\u0010§f\u0010§Û\"y<\u009bÓ®|\u008dFÀÿµ(\"\u0011I\u0081\u0016@·\u001eÄ\u009a±´¤×¯=\u0004 E\u0083ÆÐè·â¥È\u0006³xmmyÈÛ2Cð:)\u0001\u0092Û6`Æt\u008e.*0u~1<°â¦©îT8&þz\u001f\u0018õ\u008d\u0080ê\u000bÑnãÈÌ.¯@Á÷\u008f\u0016s$°9JË\u0012î\u001e\u0091éc@ð½\u0080}å¬%#ÖwÈåW\u00ad2T\u0085÷ØMd2¥\u009b\u009a\u008eVQN\u0004ñâcxJÞ\u008b ÛÝGo:«ô ü6Pª÷ÌdÏ&\u008f;GkÇ\u0083\u0019+¹nÈ\u0098Ï\u0095) -\u008a\u001d\u001c>Paxøâ»âh\u0007tU!ew³\u008aüSZü©'Õº\u009a¤ùVå±gè\u00ad/Å\u0087\u009cìý¶äjKà\u0011¾\u0015;¢[O\u001e8Vs\u0018\u0013\\¯u·\u0080WW¯Jð·Ö¬\u0003ë\u001dt\u008bIý\u000f\u0082\u009c Ôk\u00adYÏ \u0087Ì}´e´ e\u0017¨\\\u0000&\u0013%Áæ:\u0003d\u0014q\u0007Ø\u0002¥0×¯\u008e®^V\u007f¼?\u0002\u001dºû)ï¥i2q@2êt;'Óà\u0002d\"wT\u0005N\u0084\u0012÷\u0018\u0006Àajö]\u0095MáÇ\u0010)\u008cC<\u008ca\\OÃoßA¢jv.(\u001f\u001b¥ü Y?Uaéº\u0019\u009c;Ñe&5\u0006 ¦¸¯¿î·ªo\u0091z\u0007\u001b\u0081¿ÄíT\u0016#  #\u0087 \u001báÞqmó\u0086~\u00ad$G?è¼=o/»Ïá\u0013\b\u0087¶E\u0007¥)\u00ad\u0010\u0017áÕ\u0011û±-\u0098\u008dõã\u0093Ù¯\u0099Q\u0018¶¸4¿B7ïvîú5ÞAgLC\u008eÈÜëfS\u0002/X½Vñ\fÊméo\u008d\u0086¾«-_ñ%\u0081E\u0006\u0083¿r\u0011 kû[Kéà\u0002\u0098[\u009buÚ\u0001µûÔp\u0094O\u008c@±5\u0005è8\u0002¥.[Lp\\iøH\u009bÿ\u0091Ï\u009a\u0012\tS\u0092Y£\f\u0018\u009bul?Ùþu>ÙË\u0016Ã\u0018\u001f{0þ\u0095ÑÔ=Ò+\\6Å\u00adN\u007f\u0005áëë\u0080\u0096áàÆf<\u0096\u008aÌ]\u00ada\u008b\u0088\u007fØv\u000fY\u0016\u009cÎ\bY\u009aæâIkï(8\u00167\u0085æéÇ\u0017\u00ad`RFcRxü.\"«°{Òl\u0003\fÁ¤\u001d[n\u008e*\u0081\u008b\u001aºürËQ \u0019?Qä]\u009d\u008b\u0004S@õÚ+k¸[JÂí\u008b\u001c\u0005Ñ}\u0083ãF¯¤+f# Ð\u0099\u008f%\u001aîÎ*¼_\u0001þÍ£\u0006\u0089²ô¸ô\u0098Cï\b°áªÈÒÈ®ñ8Ö*§G\u001b¬6'\u001cÞÀ°\u001dµ1ºUC·Ú¨ãÈ£FUqÖ\"\u0016ëìkEPè££/¸\u0011fbÖ¢\u008a\u007f\u0087\u0002®á2\u009aiË5\u0018\u001bËgÿz¼ËÈ¬\u008aK©½\u0006\u0087Dm\u001aYb¦¬u\u0091\u0010\u007fàXÑC^I`JN\u0014üÅ\u0092^ý\u0018\u009d\ru\u0012<\u008d¶\u001a\u0013.\u0090\u000e\\Öm\u008eò\u000bnâ\u0007³WV\u0010-8°\u0011Ú ]f\u0080Í}\u0089®ðmâ ðÉR\u009e¿\fWsÚp\u0017é×ôàÉ¶¥oÙ\u008ay7;ñÙ\u001eõ\u0003¡®_\u0018¼ø³EÅ¥\u0001ÇÂVò§\tÁ{l\u008eéæCÄu\u0011\u0080(\u0098\u0094¾ñ.ËÙm=W¡ï\r½\u001c\u009e\u0011®£M\u0092s®°_ª_¸DÉ´G\u008c\u0002\u0086\u0088or\u0013¤(Ü¸Á\u0099Ü¨õKó¤\r¥å\u0003\u0091L\u0010\u0087F\u0016¦½ãµEM\u008d\u0002¨\bÐY§uÕPáâ¹á\u0010±\u008b\u0089#È\u0015ÒHÞ´Ñ\u008e+\u00900\u0084p%Éà\u0019ÎIË\u0096i^\u009d\u0094<pvj'XâOf3\u0013a\u008e-ú/\u0017\u0014!\u009fV;°§íÁÇ\u0093\u0002p\u0095¹{Âù'$`¤ù\u0082:cÏÛ\u0016\u0018AÐ\u0080¼É(Ôoí#\u0019A»\u0011õÍp)\u0088ÎºÐ1\u0094a\u0097½M\u0095\u0088u\u008e\u008aSB\u00911Y¨ÁG,\u009e\u0002ò~S²3!Ø\u009f% ô jÛ¸ \u001f$n²\u0015\u0013Û]Â.\u0084)§RÔ\u001cmµÒ\u00125\u001fÚ¶Ð\u007f\u001024³\u008cV\u0080\u0096\u0088N&ßï7`\u0007¬"
         .length();
      char var3 = '@';
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
                     c = new String[57];
                     i_l = Boolean.parseBoolean(System.getProperty(a<"p">(6970, 4528542669381886126L ^ var9), a<"p">(20223, 105238791633843534L ^ var9)));
                     zvd = LogManager.getLogger();
                     _i5 = new gdz(a<"p">(16417, 6362353172108032921L ^ var9));
                     nu_ = new gdz(a<"p">(29801, 4026074857476886497L ^ var9));
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

                  var4 = "!åËÚB\u0000\u008fHh)¹O\u001f´\u000ep\u0018æ\u008fDi\u00adDê¤·áP\u009a'\u000fÛö0\u001a]´ùÿço";
                  var6 = "!åËÚB\u0000\u008fHh)¹O\u001f´\u000ep\u0018æ\u008fDi\u00adDê¤·áP\u009a'\u000fÛö0\u001a]´ùÿço".length();
                  var3 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17186;
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
            throw new RuntimeException("yu2", var10);
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
         throw new RuntimeException("yu2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
