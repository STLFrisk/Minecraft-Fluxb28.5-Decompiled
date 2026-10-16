import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lc5 implements de5, lv1 {
   private static final Logger pke;
   private final Map xdt = Maps.newHashMap();
   private final List nxp = Lists.newArrayList();
   private final Map baa = Maps.newHashMap();
   private y99 tqw;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public lc5(y99 var1) {
      this.tqw = var1;
   }

   public void anl(gdz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: invokestatic hxt.rj1 ()Z
      // 07: iload 2
      // 08: ifeq 1d
      // 0b: ifeq 1a
      // 0e: goto 15
      // 11: invokestatic lc5.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 1
      // 16: invokestatic net/optifine/RandomEntities.getTextureLocation (Lgdz;)Lgdz;
      // 19: astore 1
      // 1a: invokestatic hxt.g73 ()Z
      // 1d: ifeq 25
      // 20: aload 1
      // 21: invokestatic net/optifine/CustomGuis.getTextureLocation (Lgdz;)Lgdz;
      // 24: astore 1
      // 25: aload 0
      // 26: getfield lc5.xdt Ljava/util/Map;
      // 29: aload 1
      // 2a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2f: checkcast sm5
      // 32: astore 3
      // 33: invokestatic net/optifine/EmissiveTextures.isActive ()Z
      // 36: ifeq 42
      // 39: aload 3
      // 3a: aload 0
      // 3b: getfield lc5.xdt Ljava/util/Map;
      // 3e: invokestatic net/optifine/EmissiveTextures.getEmissiveTexture (Lsm5;Ljava/util/Map;)Lsm5;
      // 41: astore 3
      // 42: aload 3
      // 43: ifnonnull 56
      // 46: new xfj
      // 49: dup
      // 4a: aload 1
      // 4b: invokespecial xfj.<init> (Lgdz;)V
      // 4e: astore 3
      // 4f: aload 0
      // 50: aload 1
      // 51: aload 3
      // 52: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 55: pop
      // 56: invokestatic hxt.ly3 ()Z
      // 59: iload 2
      // 5a: ifeq 83
      // 5d: ifeq 76
      // 60: goto 67
      // 63: invokestatic lc5.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 3
      // 68: invokestatic net/optifine/shaders/ShadersTex.bindTexture (Lsm5;)V
      // 6b: iload 2
      // 6c: ifne 86
      // 6f: goto 76
      // 72: invokestatic lc5.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 3
      // 77: invokeinterface sm5.getGlTextureId ()I 1
      // 7c: goto 83
      // 7f: invokestatic lc5.a (Loov;)Loov;
      // 82: athrow
      // 83: invokestatic p9t.ugy (I)V
      // 86: return
   }

   public boolean gzh(gdz param1, o6y param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 0a: iload 3
      // 0b: ifeq 2a
      // 0e: ifeq 29
      // 11: goto 18
      // 14: invokestatic lc5.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield lc5.nxp Ljava/util/List;
      // 1c: aload 2
      // 1d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 22: pop
      // 23: bipush 1
      // 24: ireturn
      // 25: invokestatic lc5.a (Loov;)Loov;
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
   }

   public boolean pc2(gdz var1, sm5 var2) {
      long var3 = a ^ 23608925553722L;
      boolean var5 = true;

      try {
         ((sm5)var2).loadTexture(this.tqw);
      } catch (IOException var10) {
         pke.warn(a<"z">(25974, 5662235616757038667L ^ var3) + var1, var10);
         var2 = p9t.ywc;
         this.xdt.put(var1, var2);
         var5 = false;
      } catch (Throwable var11) {
         e1i var8 = e1i.cor(var11, a<"z">(6205, 4512450515536560910L ^ var3));
         wsc var9 = var8.i_r(a<"z">(25, 4571306444124936999L ^ var3));
         var9._0p(a<"z">(8054, 8759860628296451149L ^ var3), var1);
         var9.h1o(a<"z">(17020, 8918991316632312134L ^ var3), new lc5$1(this, (sm5)var2));
         throw new oov(var8);
      }

      this.xdt.put(var1, var2);
      return var5;
   }

   public sm5 dry(gdz var1) {
      return (sm5)this.xdt.get(var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public gdz v5m(String var1, p9u var2) {
      long var3 = a ^ 79693376157849L;
      int var5 = OpaquePredicate.b();

      Object var10000;
      label55: {
         label54: {
            try {
               var10000 = var1;
               if (var5 == 0) {
                  break label55;
               }

               if (!var1.equals(a<"z">(15704, 7038793846168558281L ^ var3))) {
                  break label54;
               }
            } catch (oov var11) {
               throw a(var11);
            }

            var2 = hxt.vfg(var2);
         }

         var10000 = this.baa.get(var1);
      }

      Integer var6 = (Integer)var10000;

      label45: {
         label62: {
            label59: {
               try {
                  var10000 = var6;
                  if (var5 == 0) {
                     break label62;
                  }

                  if (var6 != null) {
                     break label59;
                  }
               } catch (oov var10) {
                  throw a(var10);
               }

               var6 = 1;

               try {
                  if (var5 != 0) {
                     break label45;
                  }
               } catch (oov var9) {
                  boolean var10001 = false;
                  throw a(var9);
               }
            }

            try {
               var10000 = var6 + 1;
            } catch (oov var8) {
               boolean var14 = false;
               throw a(var8);
            }
         }

         var6 = (Integer)var10000;
      }

      this.baa.put(var1, var6);
      gdz var7 = new gdz(String.format(a<"z">(25565, 1628724783965094983L ^ var3), var1, var6));
      this.pc2(var7, var2);
      return var7;
   }

   @Override
   public void tick() {
      int var1 = OpaquePredicate.b();

      for (de5 var3 : this.nxp) {
         var3.tick();
         if (var1 == 0) {
            break;
         }
      }
   }

   public void cez(gdz param1) {
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
      // 05: aload 1
      // 06: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 2c
      // 0f: ifnull 34
      // 12: goto 19
      // 15: invokestatic lc5.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield lc5.xdt Ljava/util/Map;
      // 1d: aload 1
      // 1e: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 23: pop
      // 24: aload 3
      // 25: goto 2c
      // 28: invokestatic lc5.a (Loov;)Loov;
      // 2b: athrow
      // 2c: invokeinterface sm5.getGlTextureId ()I 1
      // 31: invokestatic p9t.d23 (I)V
      // 34: return
   }

   @Override
   public void onResourceManagerReload(y99 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic lc5.a J
      // 003: ldc2_w 82634868346487
      // 006: lxor
      // 007: lstore 2
      // 008: sipush 24945
      // 00b: ldc2_w 6929497493156884480
      // 00e: lload 2
      // 00f: lxor
      // 010: invokedynamic z (IJ)Ljava/lang/String; bsm=lc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 015: nop
      // 016: invokestatic hxt.brd (Ljava/lang/String;)V
      // 019: invokestatic OpaquePredicate.c ()I
      // 01c: new java/lang/StringBuilder
      // 01f: dup
      // 020: invokespecial java/lang/StringBuilder.<init> ()V
      // 023: sipush 8638
      // 026: ldc2_w 4138662401606561996
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic z (IJ)Ljava/lang/String; bsm=lc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 034: invokestatic hxt.vx3 ()Ljava/lang/String;
      // 037: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 03d: invokestatic hxt.t2o (Ljava/lang/String;)V
      // 040: istore 4
      // 042: aload 0
      // 043: getfield lc5.xdt Ljava/util/Map;
      // 046: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 04b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 050: astore 5
      // 052: aload 5
      // 054: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 059: ifeq 12b
      // 05c: aload 5
      // 05e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 063: checkcast gdz
      // 066: astore 6
      // 068: aload 6
      // 06a: invokevirtual gdz.xyp ()Ljava/lang/String;
      // 06d: astore 7
      // 06f: iload 4
      // 071: ifne 12e
      // 074: aload 7
      // 076: iload 4
      // 078: ifne 0f3
      // 07b: goto 082
      // 07e: invokestatic lc5.a (Loov;)Loov;
      // 081: athrow
      // 082: sipush 20743
      // 085: ldc2_w 3250779478227239035
      // 088: lload 2
      // 089: lxor
      // 08a: invokedynamic z (IJ)Ljava/lang/String; bsm=lc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: nop
      // 090: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 093: ifne 0e1
      // 096: goto 09d
      // 099: invokestatic lc5.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 7
      // 09f: iload 4
      // 0a1: ifne 0f3
      // 0a4: goto 0ab
      // 0a7: invokestatic lc5.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: sipush 32370
      // 0ae: ldc2_w 8955943479974555399
      // 0b1: lload 2
      // 0b2: lxor
      // 0b3: invokedynamic z (IJ)Ljava/lang/String; bsm=lc5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: nop
      // 0b9: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0bc: ifne 0e1
      // 0bf: goto 0c6
      // 0c2: invokestatic lc5.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 6
      // 0c8: iload 4
      // 0ca: ifne 0f3
      // 0cd: goto 0d4
      // 0d0: invokestatic lc5.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: invokestatic net/optifine/EmissiveTextures.isEmissive (Lgdz;)Z
      // 0d7: ifeq 126
      // 0da: goto 0e1
      // 0dd: invokestatic lc5.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield lc5.xdt Ljava/util/Map;
      // 0e5: aload 6
      // 0e7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0ec: goto 0f3
      // 0ef: invokestatic lc5.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: checkcast sm5
      // 0f6: astore 8
      // 0f8: aload 8
      // 0fa: iload 4
      // 0fc: ifne 115
      // 0ff: instanceof xe9
      // 102: ifeq 11f
      // 105: goto 10c
      // 108: invokestatic lc5.a (Loov;)Loov;
      // 10b: athrow
      // 10c: aload 8
      // 10e: goto 115
      // 111: invokestatic lc5.a (Loov;)Loov;
      // 114: athrow
      // 115: checkcast xe9
      // 118: astore 9
      // 11a: aload 9
      // 11c: invokevirtual xe9.wo5 ()V
      // 11f: aload 5
      // 121: invokeinterface java/util/Iterator.remove ()V 1
      // 126: iload 4
      // 128: ifeq 052
      // 12b: invokestatic net/optifine/EmissiveTextures.update ()V
      // 12e: new java/util/HashSet
      // 131: dup
      // 132: aload 0
      // 133: getfield lc5.xdt Ljava/util/Map;
      // 136: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 13b: invokespecial java/util/HashSet.<init> (Ljava/util/Collection;)V
      // 13e: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 141: astore 6
      // 143: aload 6
      // 145: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14a: ifeq 17a
      // 14d: aload 6
      // 14f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 154: astore 7
      // 156: aload 0
      // 157: aload 7
      // 159: checkcast java/util/Map$Entry
      // 15c: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 161: checkcast gdz
      // 164: aload 7
      // 166: checkcast java/util/Map$Entry
      // 169: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 16e: checkcast sm5
      // 171: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 174: pop
      // 175: iload 4
      // 177: ifeq 143
      // 17a: return
   }

   public void bwg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: new java/util/HashSet
      // 07: dup
      // 08: aload 0
      // 09: getfield lc5.xdt Ljava/util/Map;
      // 0c: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 11: invokespecial java/util/HashSet.<init> (Ljava/util/Collection;)V
      // 14: invokevirtual java/util/HashSet.iterator ()Ljava/util/Iterator;
      // 17: astore 2
      // 18: aload 2
      // 19: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e: ifeq 6b
      // 21: aload 2
      // 22: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27: astore 3
      // 28: aload 3
      // 29: checkcast java/util/Map$Entry
      // 2c: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 31: checkcast gdz
      // 34: astore 4
      // 36: aload 3
      // 37: checkcast java/util/Map$Entry
      // 3a: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 3f: checkcast sm5
      // 42: astore 5
      // 44: aload 5
      // 46: instanceof ia_
      // 49: iload 1
      // 4a: ifeq 66
      // 4d: ifeq 67
      // 50: goto 57
      // 53: invokestatic lc5.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 0
      // 58: aload 4
      // 5a: aload 5
      // 5c: invokevirtual lc5.pc2 (Lgdz;Lsm5;)Z
      // 5f: goto 66
      // 62: invokestatic lc5.a (Loov;)Loov;
      // 65: athrow
      // 66: pop
      // 67: iload 1
      // 68: ifne 18
      // 6b: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2505924676250344318L, 6444936282130945844L, MethodHandles.lookup().lookupClass()).a(31074896355940L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 93456834427708L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "É\u009bl\u001eÓ\u0013©òy³`\u0005¼\u001f¿à\u0099Å\u0088eë/«Ïe6Åý \u001a¸\u0094a;{ÃU&.\u0091(I¹Gjü\u008eyi\fbúuK${Nd\u0084_Ø±/æ\u008dÅ\u0018\u00adn´z¥\u0089\u000erHÆÔD·C\u0018\u0094êg\f¹iùåq#9\u0016¾QÀ\u0014\u0091\u008f7\u0004j\u0084\u0014A\u0018Â\u009d\u0018f\u0016ª|¼ãb\u0013Å¾ÜL°1áÖ½«Ëä\u000b(¶ò\u0018\u009f 4Þ\u0093è]@Æl\u0087£\u007f²ÌA{\u009b+¼3TÆû\u00129\u0093]ÊÔ\u0019\u0090\u0014\u0098$v\\@=^¦õÅ¥áè\u001f\u008b§.Ó«\u0095\u00adhHáß\u009e\u0089]´\u0086#|iÀ\u0087\u0097\u0093üþ\u0095×\u0097r;\u009az\u008d@«¤í\u0089¼pÑò°>×w\u0001Ñ·:tÍ\u008f¯\t8ô³b\u0016\u0001²üzá\u0003fæ\u008eÏÊäfñBÚ\u001b\u0085£gÐ\u0087\báwå\u001e7þ`\u0081@`*³ýô&\u0097£Á'£X \u008a\u0010Ñ}MÇò8\u0087©\u007f9¡, \"çª¾¤Gþ\u00ad×Ô\u0004Í\u0001Õ\nïÙ¤$\u0083\u0010Ù¨\u001f©\u0018\u0001\u0084\u001b\u0094\u001cÄ;Ä,$S®« ntõ¿Á§¿uQ(\u00adlY¥,Ø9Û4`ÆZúÀK\u0017PÆ\u0016\u009fê±¸ùAÜ\u001e\u001f\u0015\u0012¡\u008c\rCvÒhZ\u0081\u0088";
      int var8 = "É\u009bl\u001eÓ\u0013©òy³`\u0005¼\u001f¿à\u0099Å\u0088eë/«Ïe6Åý \u001a¸\u0094a;{ÃU&.\u0091(I¹Gjü\u008eyi\fbúuK${Nd\u0084_Ø±/æ\u008dÅ\u0018\u00adn´z¥\u0089\u000erHÆÔD·C\u0018\u0094êg\f¹iùåq#9\u0016¾QÀ\u0014\u0091\u008f7\u0004j\u0084\u0014A\u0018Â\u009d\u0018f\u0016ª|¼ãb\u0013Å¾ÜL°1áÖ½«Ëä\u000b(¶ò\u0018\u009f 4Þ\u0093è]@Æl\u0087£\u007f²ÌA{\u009b+¼3TÆû\u00129\u0093]ÊÔ\u0019\u0090\u0014\u0098$v\\@=^¦õÅ¥áè\u001f\u008b§.Ó«\u0095\u00adhHáß\u009e\u0089]´\u0086#|iÀ\u0087\u0097\u0093üþ\u0095×\u0097r;\u009az\u008d@«¤í\u0089¼pÑò°>×w\u0001Ñ·:tÍ\u008f¯\t8ô³b\u0016\u0001²üzá\u0003fæ\u008eÏÊäfñBÚ\u001b\u0085£gÐ\u0087\báwå\u001e7þ`\u0081@`*³ýô&\u0097£Á'£X \u008a\u0010Ñ}MÇò8\u0087©\u007f9¡, \"çª¾¤Gþ\u00ad×Ô\u0004Í\u0001Õ\nïÙ¤$\u0083\u0010Ù¨\u001f©\u0018\u0001\u0084\u001b\u0094\u001cÄ;Ä,$S®« ntõ¿Á§¿uQ(\u00adlY¥,Ø9Û4`ÆZúÀK\u0017PÆ\u0016\u009fê±¸ùAÜ\u001e\u001f\u0015\u0012¡\u008c\rCvÒhZ\u0081\u0088"
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
                     c = new String[11];
                     pke = LogManager.getLogger();
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

                  var6 = "µfª[\u0012\u0086\u0019Ýõ\u0098àº¢\u0099\u0010;\u0018ç-ç 4Î[\u001cc£UÙ&E\u0000JëÑ^ó\u0096\u0081Ã\u0003";
                  var8 = "µfª[\u0012\u0086\u0019Ýõ\u0098àº¢\u0099\u0010;\u0018ç-ç 4Î[\u001cc£UÙ&E\u0000JëÑ^ó\u0096\u0081Ã\u0003".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3481;
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
            throw new RuntimeException("lc5", var10);
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
         throw new RuntimeException("lc5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
