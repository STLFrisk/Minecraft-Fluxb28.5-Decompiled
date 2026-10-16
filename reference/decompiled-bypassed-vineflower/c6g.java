import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.MalformedURLException;
import java.net.URL;
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
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class c6g {
   private static final Marker brq;
   private static final Logger so4;
   private final dbu xfu;
   private final moh ue1;
   private c6g$p0f tli;
   private boolean q70;
   private int jm5;
   private final Map khm;
   private final Map eel;
   private Map wlh;
   private final Multimap qh8;
   private final List q8v;
   private final Map ift;
   private final Map mi5;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public c6g(dbu var1, moh var2) {
      long var3 = a ^ 122202868408943L;
      super();
      this.jm5 = 0;
      this.khm = HashBiMap.create();
      this.eel = ((BiMap)this.khm).inverse();
      this.wlh = Maps.newHashMap();
      this.qh8 = HashMultimap.create();
      this.q8v = Lists.newArrayList();
      this.ift = Maps.newHashMap();
      this.mi5 = Maps.newHashMap();
      this.xfu = var1;
      this.ue1 = var2;

      try {
         SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
         SoundSystemConfig.setCodec(a<"h">(3034, 525467211316492875L ^ var3), CodecJOrbis.class);
      } catch (SoundSystemException var6) {
         so4.error(brq, a<"h">(22501, 8030043384396097150L ^ var3), var6);
      }
   }

   public void x6t() {
      this.vg1();
      this.__v();
   }

   private synchronized void __v() {
      long var1 = a ^ 58838945816316L;
      if (!this.q70) {
         try {
            new Thread(new c6g$1(this), a<"h">(6261, 1527090134230619516L ^ var1)).start();
         } catch (RuntimeException var4) {
            so4.error(brq, a<"h">(884, 1958084271655014015L ^ var1), var4);
            this.ue1.sr7(xdt.adu, 0.0F);
            this.ue1.cmo();
         }
      }
   }

   private float j6s(xdt var1) {
      int var2 = t9d.c();

      xdt var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 == null) {
               return 1.0F;
            }
         } catch (RuntimeException var4) {
            throw a(var4);
         }

         var10000 = var1;
      }

      try {
         if (var10000 != xdt.adu) {
            return this.ue1.a8l(var1);
         }
      } catch (RuntimeException var3) {
         throw a(var3);
      }

      return 1.0F;
   }

   public void zdh(xdt param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield c6g.q70 Z
      // 08: ifeq b3
      // 0b: aload 1
      // 0c: getstatic xdt.adu Lxdt;
      // 0f: if_acmpne 2c
      // 12: goto 19
      // 15: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield c6g.tli Lc6g$p0f;
      // 1d: fload 2
      // 1e: invokevirtual c6g$p0f.setMasterVolume (F)V
      // 21: iload 3
      // 22: ifne b3
      // 25: goto 2c
      // 28: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield c6g.qh8 Lcom/google/common/collect/Multimap;
      // 30: aload 1
      // 31: invokeinterface com/google/common/collect/Multimap.get (Ljava/lang/Object;)Ljava/util/Collection; 2
      // 36: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 3b: astore 4
      // 3d: aload 4
      // 3f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 44: ifeq b3
      // 47: aload 4
      // 49: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4e: checkcast java/lang/String
      // 51: astore 5
      // 53: aload 0
      // 54: getfield c6g.khm Ljava/util/Map;
      // 57: aload 5
      // 59: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5e: checkcast jp4
      // 61: astore 6
      // 63: aload 0
      // 64: aload 6
      // 66: aload 0
      // 67: getfield c6g.wlh Ljava/util/Map;
      // 6a: aload 6
      // 6c: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 71: checkcast vas
      // 74: aload 1
      // 75: invokespecial c6g.vvn (Ljp4;Lvas;Lxdt;)F
      // 78: fstore 7
      // 7a: iload 3
      // 7b: ifeq 99
      // 7e: fload 7
      // 80: fconst_0
      // 81: fcmpg
      // 82: ifgt 9d
      // 85: goto 8c
      // 88: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8b: athrow
      // 8c: aload 0
      // 8d: aload 6
      // 8f: invokevirtual c6g.voc (Ljp4;)V
      // 92: goto 99
      // 95: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 98: athrow
      // 99: iload 3
      // 9a: ifne af
      // 9d: aload 0
      // 9e: getfield c6g.tli Lc6g$p0f;
      // a1: aload 5
      // a3: fload 7
      // a5: invokevirtual c6g$p0f.setVolume (Ljava/lang/String;F)V
      // a8: goto af
      // ab: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ae: athrow
      // af: iload 3
      // b0: ifne 3d
      // b3: return
   }

   public void vg1() {
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
      // 05: iload 1
      // 06: ifeq 29
      // 09: getfield c6g.q70 Z
      // 0c: ifeq 2d
      // 0f: goto 16
      // 12: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual c6g.u5s ()V
      // 1a: aload 0
      // 1b: getfield c6g.tli Lc6g$p0f;
      // 1e: invokevirtual c6g$p0f.cleanup ()V
      // 21: aload 0
      // 22: goto 29
      // 25: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 28: athrow
      // 29: bipush 0
      // 2a: putfield c6g.q70 Z
      // 2d: return
   }

   public void u5s() {
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
      // 05: iload 1
      // 06: ifeq 1e
      // 09: getfield c6g.q70 Z
      // 0c: ifeq 8c
      // 0f: goto 16
      // 12: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: getfield c6g.khm Ljava/util/Map;
      // 21: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 26: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2b: astore 2
      // 2c: aload 2
      // 2d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 32: ifeq 56
      // 35: aload 2
      // 36: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b: checkcast java/lang/String
      // 3e: astore 3
      // 3f: aload 0
      // 40: getfield c6g.tli Lc6g$p0f;
      // 43: aload 3
      // 44: invokevirtual c6g$p0f.stop (Ljava/lang/String;)V
      // 47: iload 1
      // 48: ifeq 83
      // 4b: iload 1
      // 4c: ifne 2c
      // 4f: goto 56
      // 52: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 0
      // 57: getfield c6g.khm Ljava/util/Map;
      // 5a: invokeinterface java/util/Map.clear ()V 1
      // 5f: aload 0
      // 60: getfield c6g.ift Ljava/util/Map;
      // 63: invokeinterface java/util/Map.clear ()V 1
      // 68: aload 0
      // 69: getfield c6g.q8v Ljava/util/List;
      // 6c: invokeinterface java/util/List.clear ()V 1
      // 71: aload 0
      // 72: getfield c6g.qh8 Lcom/google/common/collect/Multimap;
      // 75: invokeinterface com/google/common/collect/Multimap.clear ()V 1
      // 7a: aload 0
      // 7b: getfield c6g.wlh Ljava/util/Map;
      // 7e: invokeinterface java/util/Map.clear ()V 1
      // 83: aload 0
      // 84: getfield c6g.mi5 Ljava/util/Map;
      // 87: invokeinterface java/util/Map.clear ()V 1
      // 8c: return
   }

   public void nf4() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic c6g.a J
      // 003: ldc2_w 11259196203101
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: dup
      // 00e: getfield c6g.jm5 I
      // 011: bipush 1
      // 012: iadd
      // 013: putfield c6g.jm5 I
      // 016: aload 0
      // 017: getfield c6g.q8v Ljava/util/List;
      // 01a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01f: astore 4
      // 021: aload 4
      // 023: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 028: ifeq 0f3
      // 02b: aload 4
      // 02d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 032: checkcast jzl
      // 035: astore 5
      // 037: aload 5
      // 039: invokeinterface jzl._21 ()V 1
      // 03e: aload 5
      // 040: iload 3
      // 041: ifne 081
      // 044: invokeinterface jzl.hku ()Z 1
      // 049: iload 3
      // 04a: ifne 10a
      // 04d: goto 054
      // 050: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 053: athrow
      // 054: ifeq 06f
      // 057: goto 05e
      // 05a: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 05d: athrow
      // 05e: aload 0
      // 05f: aload 5
      // 061: invokevirtual c6g.voc (Ljp4;)V
      // 064: iload 3
      // 065: ifeq 0ef
      // 068: goto 06f
      // 06b: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield c6g.eel Ljava/util/Map;
      // 073: aload 5
      // 075: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 07a: goto 081
      // 07d: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 080: athrow
      // 081: checkcast java/lang/String
      // 084: astore 6
      // 086: aload 0
      // 087: getfield c6g.tli Lc6g$p0f;
      // 08a: aload 6
      // 08c: aload 0
      // 08d: aload 5
      // 08f: aload 0
      // 090: getfield c6g.wlh Ljava/util/Map;
      // 093: aload 5
      // 095: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 09a: checkcast vas
      // 09d: aload 0
      // 09e: getfield c6g.xfu Ldbu;
      // 0a1: aload 5
      // 0a3: invokeinterface jzl.nbp ()Lgdz; 1
      // 0a8: invokevirtual dbu.q79 (Lgdz;)Lz7p;
      // 0ab: invokevirtual z7p.w1m ()Lxdt;
      // 0ae: invokespecial c6g.vvn (Ljp4;Lvas;Lxdt;)F
      // 0b1: invokevirtual c6g$p0f.setVolume (Ljava/lang/String;F)V
      // 0b4: aload 0
      // 0b5: getfield c6g.tli Lc6g$p0f;
      // 0b8: aload 6
      // 0ba: aload 0
      // 0bb: aload 5
      // 0bd: aload 0
      // 0be: getfield c6g.wlh Ljava/util/Map;
      // 0c1: aload 5
      // 0c3: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c8: checkcast vas
      // 0cb: invokespecial c6g.guc (Ljp4;Lvas;)F
      // 0ce: invokevirtual c6g$p0f.setPitch (Ljava/lang/String;F)V
      // 0d1: aload 0
      // 0d2: getfield c6g.tli Lc6g$p0f;
      // 0d5: aload 6
      // 0d7: aload 5
      // 0d9: invokeinterface jzl.wq_ ()F 1
      // 0de: aload 5
      // 0e0: invokeinterface jzl.rh5 ()F 1
      // 0e5: aload 5
      // 0e7: invokeinterface jzl.tm3 ()F 1
      // 0ec: invokevirtual c6g$p0f.setPosition (Ljava/lang/String;FFF)V
      // 0ef: iload 3
      // 0f0: ifeq 021
      // 0f3: aload 0
      // 0f4: getfield c6g.khm Ljava/util/Map;
      // 0f7: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0fc: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 101: astore 4
      // 103: aload 4
      // 105: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10a: ifeq 270
      // 10d: aload 4
      // 10f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 114: checkcast java/util/Map$Entry
      // 117: astore 5
      // 119: aload 5
      // 11b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 120: checkcast java/lang/String
      // 123: astore 6
      // 125: aload 5
      // 127: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 12c: checkcast jp4
      // 12f: astore 7
      // 131: aload 0
      // 132: iload 3
      // 133: ifne 271
      // 136: getfield c6g.tli Lc6g$p0f;
      // 139: aload 6
      // 13b: invokevirtual c6g$p0f.playing (Ljava/lang/String;)Z
      // 13e: iload 3
      // 13f: ifne 16b
      // 142: goto 149
      // 145: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 148: athrow
      // 149: ifne 26c
      // 14c: goto 153
      // 14f: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 152: athrow
      // 153: aload 0
      // 154: getfield c6g.mi5 Ljava/util/Map;
      // 157: aload 6
      // 159: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 15e: checkcast java/lang/Integer
      // 161: invokevirtual java/lang/Integer.intValue ()I
      // 164: goto 16b
      // 167: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16a: athrow
      // 16b: istore 8
      // 16d: iload 8
      // 16f: iload 3
      // 170: ifne 18f
      // 173: aload 0
      // 174: getfield c6g.jm5 I
      // 177: if_icmpgt 26c
      // 17a: goto 181
      // 17d: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 180: athrow
      // 181: aload 7
      // 183: invokeinterface jp4.n_s ()I 1
      // 188: goto 18f
      // 18b: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18e: athrow
      // 18f: istore 9
      // 191: aload 7
      // 193: invokeinterface jp4.ozu ()Z 1
      // 198: iload 3
      // 199: ifne 240
      // 19c: ifeq 1da
      // 19f: goto 1a6
      // 1a2: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a5: athrow
      // 1a6: iload 9
      // 1a8: iload 3
      // 1a9: ifne 240
      // 1ac: goto 1b3
      // 1af: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b2: athrow
      // 1b3: ifle 1da
      // 1b6: goto 1bd
      // 1b9: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1bc: athrow
      // 1bd: aload 0
      // 1be: getfield c6g.ift Ljava/util/Map;
      // 1c1: aload 7
      // 1c3: aload 0
      // 1c4: getfield c6g.jm5 I
      // 1c7: iload 9
      // 1c9: iadd
      // 1ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1cd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1d2: pop
      // 1d3: goto 1da
      // 1d6: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d9: athrow
      // 1da: aload 4
      // 1dc: invokeinterface java/util/Iterator.remove ()V 1
      // 1e1: getstatic c6g.so4 Lorg/apache/logging/log4j/Logger;
      // 1e4: getstatic c6g.brq Lorg/apache/logging/log4j/Marker;
      // 1e7: sipush 9413
      // 1ea: ldc2_w 3061080951046821737
      // 1ed: lload 1
      // 1ee: lxor
      // 1ef: invokedynamic h (IJ)Ljava/lang/String; bsm=c6g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: nop
      // 1f5: bipush 1
      // 1f6: anewarray 19
      // 1f9: dup
      // 1fa: bipush 0
      // 1fb: aload 6
      // 1fd: aastore
      // 1fe: invokeinterface org/apache/logging/log4j/Logger.debug (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 203: aload 0
      // 204: getfield c6g.tli Lc6g$p0f;
      // 207: aload 6
      // 209: invokevirtual c6g$p0f.removeSource (Ljava/lang/String;)V
      // 20c: aload 0
      // 20d: getfield c6g.mi5 Ljava/util/Map;
      // 210: aload 6
      // 212: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 217: pop
      // 218: aload 0
      // 219: getfield c6g.wlh Ljava/util/Map;
      // 21c: aload 7
      // 21e: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 223: pop
      // 224: aload 0
      // 225: getfield c6g.qh8 Lcom/google/common/collect/Multimap;
      // 228: aload 0
      // 229: getfield c6g.xfu Ldbu;
      // 22c: aload 7
      // 22e: invokeinterface jp4.nbp ()Lgdz; 1
      // 233: invokevirtual dbu.q79 (Lgdz;)Lz7p;
      // 236: invokevirtual z7p.w1m ()Lxdt;
      // 239: aload 6
      // 23b: invokeinterface com/google/common/collect/Multimap.remove (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 240: pop
      // 241: goto 246
      // 244: astore 10
      // 246: aload 7
      // 248: instanceof jzl
      // 24b: iload 3
      // 24c: ifne 26b
      // 24f: ifeq 26c
      // 252: goto 259
      // 255: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 258: athrow
      // 259: aload 0
      // 25a: getfield c6g.q8v Ljava/util/List;
      // 25d: aload 7
      // 25f: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 264: goto 26b
      // 267: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26a: athrow
      // 26b: pop
      // 26c: iload 3
      // 26d: ifeq 103
      // 270: aload 0
      // 271: getfield c6g.ift Ljava/util/Map;
      // 274: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 279: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 27e: astore 5
      // 280: aload 5
      // 282: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 287: ifeq 308
      // 28a: aload 5
      // 28c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 291: checkcast java/util/Map$Entry
      // 294: astore 6
      // 296: iload 3
      // 297: ifne 312
      // 29a: aload 0
      // 29b: iload 3
      // 29c: ifne 2ce
      // 29f: goto 2a6
      // 2a2: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a5: athrow
      // 2a6: getfield c6g.jm5 I
      // 2a9: aload 6
      // 2ab: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2b0: checkcast java/lang/Integer
      // 2b3: invokevirtual java/lang/Integer.intValue ()I
      // 2b6: if_icmplt 304
      // 2b9: goto 2c0
      // 2bc: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2bf: athrow
      // 2c0: aload 6
      // 2c2: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2c7: goto 2ce
      // 2ca: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2cd: athrow
      // 2ce: checkcast jp4
      // 2d1: astore 7
      // 2d3: iload 3
      // 2d4: ifne 2fd
      // 2d7: aload 7
      // 2d9: instanceof jzl
      // 2dc: ifeq 2f7
      // 2df: goto 2e6
      // 2e2: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e5: athrow
      // 2e6: aload 7
      // 2e8: checkcast jzl
      // 2eb: invokeinterface jzl._21 ()V 1
      // 2f0: goto 2f7
      // 2f3: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f6: athrow
      // 2f7: aload 0
      // 2f8: aload 7
      // 2fa: invokevirtual c6g.pnz (Ljp4;)V
      // 2fd: aload 5
      // 2ff: invokeinterface java/util/Iterator.remove ()V 1
      // 304: iload 3
      // 305: ifeq 280
      // 308: goto 312
      // 30b: astore 4
      // 30d: aload 4
      // 30f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 312: return
   }

   public boolean cr5(jp4 param1) {
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
      // 05: iload 2
      // 06: ifeq 26
      // 09: getfield c6g.q70 Z
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield c6g.eel Ljava/util/Map;
      // 20: aload 1
      // 21: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 26: checkcast java/lang/String
      // 29: astore 3
      // 2a: aload 3
      // 2b: ifnonnull 36
      // 2e: bipush 0
      // 2f: goto a0
      // 32: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 35: athrow
      // 36: aload 0
      // 37: getfield c6g.tli Lc6g$p0f;
      // 3a: aload 3
      // 3b: invokevirtual c6g$p0f.playing (Ljava/lang/String;)Z
      // 3e: iload 2
      // 3f: ifeq 9c
      // 42: ifne 94
      // 45: goto 4c
      // 48: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: getfield c6g.mi5 Ljava/util/Map;
      // 50: aload 3
      // 51: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 56: iload 2
      // 57: ifeq 82
      // 5a: goto 61
      // 5d: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 60: athrow
      // 61: ifeq 9f
      // 64: goto 6b
      // 67: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield c6g.mi5 Ljava/util/Map;
      // 6f: aload 3
      // 70: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 75: checkcast java/lang/Integer
      // 78: invokevirtual java/lang/Integer.intValue ()I
      // 7b: goto 82
      // 7e: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 81: athrow
      // 82: iload 2
      // 83: ifeq 9c
      // 86: aload 0
      // 87: getfield c6g.jm5 I
      // 8a: if_icmpgt 9f
      // 8d: goto 94
      // 90: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 93: athrow
      // 94: bipush 1
      // 95: goto 9c
      // 98: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9b: athrow
      // 9c: goto a0
      // 9f: bipush 0
      // a0: ireturn
   }

   public void voc(jp4 param1) {
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
      // 05: iload 2
      // 06: ifeq 27
      // 09: getfield c6g.q70 Z
      // 0c: ifeq 3e
      // 0f: goto 16
      // 12: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield c6g.eel Ljava/util/Map;
      // 1a: aload 1
      // 1b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 20: goto 27
      // 23: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: checkcast java/lang/String
      // 2a: astore 3
      // 2b: aload 3
      // 2c: ifnull 3e
      // 2f: aload 0
      // 30: getfield c6g.tli Lc6g$p0f;
      // 33: aload 3
      // 34: invokevirtual c6g$p0f.stop (Ljava/lang/String;)V
      // 37: goto 3e
      // 3a: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: return
   }

   public void pnz(jp4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic c6g.a J
      // 003: ldc2_w 131701048017884
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield c6g.q70 Z
      // 011: iload 4
      // 013: ifne 03c
      // 016: ifeq 359
      // 019: goto 020
      // 01c: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01f: athrow
      // 020: aload 0
      // 021: iload 4
      // 023: ifne 079
      // 026: goto 02d
      // 029: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02c: athrow
      // 02d: getfield c6g.tli Lc6g$p0f;
      // 030: invokevirtual c6g$p0f.getMasterVolume ()F
      // 033: fconst_0
      // 034: fcmpg
      // 035: goto 03c
      // 038: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: ifgt 071
      // 03f: getstatic c6g.so4 Lorg/apache/logging/log4j/Logger;
      // 042: getstatic c6g.brq Lorg/apache/logging/log4j/Marker;
      // 045: sipush 26178
      // 048: ldc2_w 8741557713011766892
      // 04b: lload 2
      // 04c: lxor
      // 04d: invokedynamic h (IJ)Ljava/lang/String; bsm=c6g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: nop
      // 053: bipush 1
      // 054: anewarray 19
      // 057: dup
      // 058: bipush 0
      // 059: aload 1
      // 05a: invokeinterface jp4.nbp ()Lgdz; 1
      // 05f: aastore
      // 060: invokeinterface org/apache/logging/log4j/Logger.debug (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 065: iload 4
      // 067: ifeq 359
      // 06a: goto 071
      // 06d: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 070: athrow
      // 071: aload 0
      // 072: goto 079
      // 075: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 078: athrow
      // 079: getfield c6g.xfu Ldbu;
      // 07c: aload 1
      // 07d: invokeinterface jp4.nbp ()Lgdz; 1
      // 082: invokevirtual dbu.q79 (Lgdz;)Lz7p;
      // 085: astore 5
      // 087: aload 5
      // 089: iload 4
      // 08b: ifne 0d3
      // 08e: ifnonnull 0ca
      // 091: goto 098
      // 094: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 097: athrow
      // 098: getstatic c6g.so4 Lorg/apache/logging/log4j/Logger;
      // 09b: getstatic c6g.brq Lorg/apache/logging/log4j/Marker;
      // 09e: sipush 25605
      // 0a1: ldc2_w 6547770876145890336
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic h (IJ)Ljava/lang/String; bsm=c6g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: nop
      // 0ac: bipush 1
      // 0ad: anewarray 19
      // 0b0: dup
      // 0b1: bipush 0
      // 0b2: aload 1
      // 0b3: invokeinterface jp4.nbp ()Lgdz; 1
      // 0b8: aastore
      // 0b9: invokeinterface org/apache/logging/log4j/Logger.warn (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 0be: iload 4
      // 0c0: ifeq 359
      // 0c3: goto 0ca
      // 0c6: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c9: athrow
      // 0ca: aload 5
      // 0cc: goto 0d3
      // 0cf: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0d2: athrow
      // 0d3: invokevirtual z7p.npr ()Lvas;
      // 0d6: astore 6
      // 0d8: iload 4
      // 0da: ifne 118
      // 0dd: aload 6
      // 0df: getstatic dbu.e5c Lvas;
      // 0e2: if_acmpne 11d
      // 0e5: goto 0ec
      // 0e8: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0eb: athrow
      // 0ec: getstatic c6g.so4 Lorg/apache/logging/log4j/Logger;
      // 0ef: getstatic c6g.brq Lorg/apache/logging/log4j/Marker;
      // 0f2: sipush 10871
      // 0f5: ldc2_w 992226750983354961
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic h (IJ)Ljava/lang/String; bsm=c6g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: bipush 1
      // 101: anewarray 19
      // 104: dup
      // 105: bipush 0
      // 106: aload 5
      // 108: invokevirtual z7p.b0n ()Lgdz;
      // 10b: aastore
      // 10c: invokeinterface org/apache/logging/log4j/Logger.warn (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 111: goto 118
      // 114: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 117: athrow
      // 118: iload 4
      // 11a: ifeq 359
      // 11d: aload 1
      // 11e: invokeinterface jp4.p4p ()F 1
      // 123: fstore 7
      // 125: ldc 16.0
      // 127: nop
      // 128: fstore 8
      // 12a: fload 7
      // 12c: fconst_1
      // 12d: iload 4
      // 12f: ifne 148
      // 132: fcmpl
      // 133: ifle 14b
      // 136: goto 13d
      // 139: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13c: athrow
      // 13d: fload 8
      // 13f: fload 7
      // 141: goto 148
      // 144: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 147: athrow
      // 148: fmul
      // 149: fstore 8
      // 14b: aload 5
      // 14d: invokevirtual z7p.w1m ()Lxdt;
      // 150: astore 9
      // 152: aload 0
      // 153: aload 1
      // 154: aload 6
      // 156: aload 9
      // 158: invokespecial c6g.vvn (Ljp4;Lvas;Lxdt;)F
      // 15b: fstore 10
      // 15d: aload 0
      // 15e: aload 1
      // 15f: aload 6
      // 161: invokespecial c6g.guc (Ljp4;Lvas;)F
      // 164: f2d
      // 165: dstore 11
      // 167: aload 6
      // 169: invokevirtual vas._23 ()Lgdz;
      // 16c: astore 13
      // 16e: fload 10
      // 170: fconst_0
      // 171: fcmpl
      // 172: iload 4
      // 174: ifne 1bc
      // 177: ifne 1af
      // 17a: goto 181
      // 17d: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 180: athrow
      // 181: getstatic c6g.so4 Lorg/apache/logging/log4j/Logger;
      // 184: getstatic c6g.brq Lorg/apache/logging/log4j/Marker;
      // 187: sipush 29024
      // 18a: ldc2_w 8923609220168573252
      // 18d: lload 2
      // 18e: lxor
      // 18f: invokedynamic h (IJ)Ljava/lang/String; bsm=c6g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: nop
      // 195: bipush 1
      // 196: anewarray 19
      // 199: dup
      // 19a: bipush 0
      // 19b: aload 13
      // 19d: aastore
      // 19e: invokeinterface org/apache/logging/log4j/Logger.debug (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 1a3: iload 4
      // 1a5: ifeq 359
      // 1a8: goto 1af
      // 1ab: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ae: athrow
      // 1af: aload 1
      // 1b0: invokeinterface jp4.ozu ()Z 1
      // 1b5: goto 1bc
      // 1b8: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1bb: athrow
      // 1bc: iload 4
      // 1be: ifne 1d8
      // 1c1: ifeq 1eb
      // 1c4: goto 1cb
      // 1c7: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1ca: athrow
      // 1cb: aload 1
      // 1cc: invokeinterface jp4.n_s ()I 1
      // 1d1: goto 1d8
      // 1d4: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d7: athrow
      // 1d8: iload 4
      // 1da: ifne 1e8
      // 1dd: ifne 1eb
      // 1e0: goto 1e7
      // 1e3: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e6: athrow
      // 1e7: bipush 1
      // 1e8: goto 1ec
      // 1eb: bipush 0
      // 1ec: istore 14
      // 1ee: invokestatic io/netty/util/internal/ThreadLocalRandom.current ()Lio/netty/util/internal/ThreadLocalRandom;
      // 1f1: invokestatic fe6._g4 (Ljava/util/Random;)Ljava/util/UUID;
      // 1f4: invokevirtual java/util/UUID.toString ()Ljava/lang/String;
      // 1f7: astore 15
      // 1f9: iload 4
      // 1fb: ifne 247
      // 1fe: aload 6
      // 200: invokevirtual vas.m7k ()Z
      // 203: ifeq 24c
      // 206: goto 20d
      // 209: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20c: athrow
      // 20d: aload 0
      // 20e: getfield c6g.tli Lc6g$p0f;
      // 211: bipush 0
      // 212: aload 15
      // 214: aload 13
      // 216: invokestatic c6g.uu1 (Lgdz;)Ljava/net/URL;
      // 219: aload 13
      // 21b: invokevirtual gdz.toString ()Ljava/lang/String;
      // 21e: iload 14
      // 220: aload 1
      // 221: invokeinterface jp4.wq_ ()F 1
      // 226: aload 1
      // 227: invokeinterface jp4.rh5 ()F 1
      // 22c: aload 1
      // 22d: invokeinterface jp4.tm3 ()F 1
      // 232: aload 1
      // 233: invokeinterface jp4.iyl ()Ljp4$y3u; 1
      // 238: invokevirtual jp4$y3u.kgd ()I
      // 23b: fload 8
      // 23d: invokevirtual c6g$p0f.newStreamingSource (ZLjava/lang/String;Ljava/net/URL;Ljava/lang/String;ZFFFIF)V
      // 240: goto 247
      // 243: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 246: athrow
      // 247: iload 4
      // 249: ifeq 286
      // 24c: aload 0
      // 24d: getfield c6g.tli Lc6g$p0f;
      // 250: bipush 0
      // 251: aload 15
      // 253: aload 13
      // 255: invokestatic c6g.uu1 (Lgdz;)Ljava/net/URL;
      // 258: aload 13
      // 25a: invokevirtual gdz.toString ()Ljava/lang/String;
      // 25d: iload 14
      // 25f: aload 1
      // 260: invokeinterface jp4.wq_ ()F 1
      // 265: aload 1
      // 266: invokeinterface jp4.rh5 ()F 1
      // 26b: aload 1
      // 26c: invokeinterface jp4.tm3 ()F 1
      // 271: aload 1
      // 272: invokeinterface jp4.iyl ()Ljp4$y3u; 1
      // 277: invokevirtual jp4$y3u.kgd ()I
      // 27a: fload 8
      // 27c: invokevirtual c6g$p0f.newSource (ZLjava/lang/String;Ljava/net/URL;Ljava/lang/String;ZFFFIF)V
      // 27f: goto 286
      // 282: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 285: athrow
      // 286: getstatic c6g.so4 Lorg/apache/logging/log4j/Logger;
      // 289: getstatic c6g.brq Lorg/apache/logging/log4j/Marker;
      // 28c: sipush 14326
      // 28f: ldc2_w 3107299850501203932
      // 292: lload 2
      // 293: lxor
      // 294: invokedynamic h (IJ)Ljava/lang/String; bsm=c6g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: nop
      // 29a: bipush 3
      // 29b: anewarray 19
      // 29e: dup
      // 29f: bipush 0
      // 2a0: aload 6
      // 2a2: invokevirtual vas._23 ()Lgdz;
      // 2a5: aastore
      // 2a6: dup
      // 2a7: bipush 1
      // 2a8: aload 5
      // 2aa: invokevirtual z7p.b0n ()Lgdz;
      // 2ad: aastore
      // 2ae: dup
      // 2af: bipush 2
      // 2b0: aload 15
      // 2b2: aastore
      // 2b3: invokeinterface org/apache/logging/log4j/Logger.debug (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 2b8: aload 0
      // 2b9: getfield c6g.tli Lc6g$p0f;
      // 2bc: aload 15
      // 2be: dload 11
      // 2c0: d2f
      // 2c1: invokevirtual c6g$p0f.setPitch (Ljava/lang/String;F)V
      // 2c4: aload 0
      // 2c5: getfield c6g.tli Lc6g$p0f;
      // 2c8: aload 15
      // 2ca: fload 10
      // 2cc: invokevirtual c6g$p0f.setVolume (Ljava/lang/String;F)V
      // 2cf: aload 0
      // 2d0: getfield c6g.tli Lc6g$p0f;
      // 2d3: aload 15
      // 2d5: invokevirtual c6g$p0f.play (Ljava/lang/String;)V
      // 2d8: aload 0
      // 2d9: getfield c6g.mi5 Ljava/util/Map;
      // 2dc: aload 15
      // 2de: aload 0
      // 2df: getfield c6g.jm5 I
      // 2e2: bipush 20
      // 2e4: iadd
      // 2e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e8: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2ed: pop
      // 2ee: aload 0
      // 2ef: getfield c6g.khm Ljava/util/Map;
      // 2f2: aload 15
      // 2f4: aload 1
      // 2f5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2fa: pop
      // 2fb: aload 0
      // 2fc: iload 4
      // 2fe: ifne 324
      // 301: getfield c6g.wlh Ljava/util/Map;
      // 304: aload 1
      // 305: aload 6
      // 307: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 30c: pop
      // 30d: aload 9
      // 30f: getstatic xdt.adu Lxdt;
      // 312: if_acmpeq 331
      // 315: goto 31c
      // 318: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31b: athrow
      // 31c: aload 0
      // 31d: goto 324
      // 320: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 323: athrow
      // 324: getfield c6g.qh8 Lcom/google/common/collect/Multimap;
      // 327: aload 9
      // 329: aload 15
      // 32b: invokeinterface com/google/common/collect/Multimap.put (Ljava/lang/Object;Ljava/lang/Object;)Z 3
      // 330: pop
      // 331: aload 1
      // 332: instanceof jzl
      // 335: iload 4
      // 337: ifne 358
      // 33a: ifeq 359
      // 33d: goto 344
      // 340: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 343: athrow
      // 344: aload 0
      // 345: getfield c6g.q8v Ljava/util/List;
      // 348: aload 1
      // 349: checkcast jzl
      // 34c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 351: goto 358
      // 354: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 357: athrow
      // 358: pop
      // 359: return
   }

   private float guc(jp4 var1, vas var2) {
      return (float)fe6.lft((double)var1.uei() * var2.bjy(), 0.5, 2.0);
   }

   private float vvn(jp4 var1, vas var2, xdt var3) {
      return (float)fe6.lft((double)var1.p4p() * var2.z3o(), 0.0, 1.0) * this.j6s(var3);
   }

   public void p3x() {
      long var1 = a ^ 37073902924015L;
      int var3 = t9d.c();

      for (String var5 : this.khm.keySet()) {
         so4.debug(brq, a<"h">(9125, 8420717163620876465L ^ var1), new Object[]{var5});
         this.tli.pause(var5);
         if (var3 != 0) {
            break;
         }
      }
   }

   public void szs() {
      long var1 = a ^ 123083352344421L;
      int var3 = t9d.c();

      for (String var5 : this.khm.keySet()) {
         so4.debug(brq, a<"h">(802, 393181722334500788L ^ var1), new Object[]{var5});
         this.tli.play(var5);
         if (var3 != 0) {
            break;
         }
      }
   }

   public void syd(jp4 var1, int var2) {
      this.ift.put(var1, this.jm5 + var2);
   }

   private static URL uu1(gdz var0) {
      long var1 = a ^ 90561202687512L;
      String var3 = String.format(a<"h">(5593, 4423701559800170558L ^ var1), a<"h">(29212, 5028723580526358516L ^ var1), var0._a7(), var0.xyp());
      c6g$2 var4 = new c6g$2(var0);

      try {
         return new URL((URL)null, var3, var4);
      } catch (MalformedURLException var6) {
         throw new Error(a<"h">(9885, 5836828701515561848L ^ var1));
      }
   }

   public void xvu(ha9 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield c6g.q70 Z
      // 008: ifeq 119
      // 00b: aload 1
      // 00c: iload 3
      // 00d: ifne 022
      // 010: goto 017
      // 013: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 016: athrow
      // 017: ifnull 119
      // 01a: goto 021
      // 01d: invokestatic c6g.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 020: athrow
      // 021: aload 1
      // 022: getfield ha9.j25 F
      // 025: aload 1
      // 026: getfield ha9.y2i F
      // 029: aload 1
      // 02a: getfield ha9.j25 F
      // 02d: fsub
      // 02e: fload 2
      // 02f: fmul
      // 030: fadd
      // 031: fstore 4
      // 033: aload 1
      // 034: getfield ha9.p3h F
      // 037: aload 1
      // 038: getfield ha9.x5k F
      // 03b: aload 1
      // 03c: getfield ha9.p3h F
      // 03f: fsub
      // 040: fload 2
      // 041: fmul
      // 042: fadd
      // 043: fstore 5
      // 045: aload 1
      // 046: getfield ha9.bc1 D
      // 049: aload 1
      // 04a: getfield ha9.o2v D
      // 04d: aload 1
      // 04e: getfield ha9.bc1 D
      // 051: dsub
      // 052: fload 2
      // 053: f2d
      // 054: dmul
      // 055: dadd
      // 056: dstore 6
      // 058: aload 1
      // 059: getfield ha9.o_z D
      // 05c: aload 1
      // 05d: getfield ha9.kfp D
      // 060: aload 1
      // 061: getfield ha9.o_z D
      // 064: dsub
      // 065: fload 2
      // 066: f2d
      // 067: dmul
      // 068: dadd
      // 069: aload 1
      // 06a: invokevirtual ha9.c5y ()F
      // 06d: f2d
      // 06e: dadd
      // 06f: dstore 8
      // 071: aload 1
      // 072: getfield ha9.a4d D
      // 075: aload 1
      // 076: getfield ha9.vbd D
      // 079: aload 1
      // 07a: getfield ha9.a4d D
      // 07d: dsub
      // 07e: fload 2
      // 07f: f2d
      // 080: dmul
      // 081: dadd
      // 082: dstore 10
      // 084: fload 5
      // 086: ldc 90.0
      // 088: nop
      // 089: fadd
      // 08a: ldc 0.017453292
      // 08c: nop
      // 08d: fmul
      // 08e: invokestatic fe6.ssk (F)F
      // 091: fstore 12
      // 093: fload 5
      // 095: ldc 90.0
      // 097: nop
      // 098: fadd
      // 099: ldc 0.017453292
      // 09b: nop
      // 09c: fmul
      // 09d: invokestatic fe6.rtn (F)F
      // 0a0: fstore 13
      // 0a2: fload 4
      // 0a4: fneg
      // 0a5: ldc 0.017453292
      // 0a7: nop
      // 0a8: fmul
      // 0a9: invokestatic fe6.ssk (F)F
      // 0ac: fstore 14
      // 0ae: fload 4
      // 0b0: fneg
      // 0b1: ldc 0.017453292
      // 0b3: nop
      // 0b4: fmul
      // 0b5: invokestatic fe6.rtn (F)F
      // 0b8: fstore 15
      // 0ba: fload 4
      // 0bc: fneg
      // 0bd: ldc 90.0
      // 0bf: nop
      // 0c0: fadd
      // 0c1: ldc 0.017453292
      // 0c3: nop
      // 0c4: fmul
      // 0c5: invokestatic fe6.ssk (F)F
      // 0c8: fstore 16
      // 0ca: fload 4
      // 0cc: fneg
      // 0cd: ldc 90.0
      // 0cf: nop
      // 0d0: fadd
      // 0d1: ldc 0.017453292
      // 0d3: nop
      // 0d4: fmul
      // 0d5: invokestatic fe6.rtn (F)F
      // 0d8: fstore 17
      // 0da: fload 12
      // 0dc: fload 14
      // 0de: fmul
      // 0df: fstore 18
      // 0e1: fload 13
      // 0e3: fload 14
      // 0e5: fmul
      // 0e6: fstore 19
      // 0e8: fload 12
      // 0ea: fload 16
      // 0ec: fmul
      // 0ed: fstore 20
      // 0ef: fload 13
      // 0f1: fload 16
      // 0f3: fmul
      // 0f4: fstore 21
      // 0f6: aload 0
      // 0f7: getfield c6g.tli Lc6g$p0f;
      // 0fa: dload 6
      // 0fc: d2f
      // 0fd: dload 8
      // 0ff: d2f
      // 100: dload 10
      // 102: d2f
      // 103: invokevirtual c6g$p0f.setListenerPosition (FFF)V
      // 106: aload 0
      // 107: getfield c6g.tli Lc6g$p0f;
      // 10a: fload 18
      // 10c: fload 15
      // 10e: fload 19
      // 110: fload 20
      // 112: fload 17
      // 114: fload 21
      // 116: invokevirtual c6g$p0f.setListenerOrientation (FFFFFF)V
      // 119: return
   }

   public static Logger s4b() {
      return so4;
   }

   public static c6g$p0f xys(c6g var0, c6g$p0f var1) {
      return var0.tli = var1;
   }

   public static boolean oic(c6g var0, boolean var1) {
      return var0.q70 = var1;
   }

   public static moh yo_(c6g var0) {
      return var0.ue1;
   }

   public static c6g$p0f b7d(c6g var0) {
      return var0.tli;
   }

   public static Marker n1u() {
      return brq;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(638478651511827815L, -9111673334028698599L, MethodHandles.lookup().lookupClass()).a(85304018209430L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 43767243702877L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[16];
      int var5 = 0;
      String var4 = "h\u001a\u00896\u0097\u0083\u000eXÄfý²Ö\"ÅO\u0001^JºE\u0090ìéñ·f\t&zÂ0õ\u0091¬7^ª\u009e?m?%Æ³\u009cQ\u000e\nT\u0090-\u0084J6B\u008a,tÂË?õKÜ\u008aÓê]ê\u0093üvrð*r\u000f¿À\f\u0087\u0010 \u008f=üõH¹\u0084l\u009bÀk¼;\u0097 \u0091ÆwùyDérÍ\u009c\u0014 Rd·|`D\u0007\u001e¹sþr\u00ad±íßh\u0097\u009f}Þ`·ÓÐ¸|=Bj©\fM\fØ|¶d\u0016ÿjí\u001bç\u0014\"ÖKñø0\u0095'H\u001f?ùÊ\u009f4U8å\u009cR8Mä$z\u000f\u0015ÅM~Ñ7&8íÍ´W\u0000c\u000f)+\u001ci6\u0092Ä``\u0003ß`SPH¼/þ\u0018³ÁÀùe·ïÕ\u0083°\u0086ÌÐð\u0089Û\n\u0095è ²J¡|Ùêp\u000f$À@) ½@\u0084Ue\u0019cVÀ(ð>\u009d\u0004\u0099íñÊSà\u00887¡ÿm!Q©äË\u0000æVl¦\u00195«\u0098¼\u0016\u0082 Ònµfj\u0086\u008eÂ~I\n1çö\u008f\u001dÂº!N¹\u0003\u0001b\u0090e§^ÿ\b\u009f^X\u009cÉ`\u001e¦\u009fÈ«¦Q«T\u0002\u0099\u0081{\u0004\u000fôÓ\u007f\u0084q¶\u0090Ñ\u0085\f@i½·ë´ºq5×\u0005)q!nÚ¥è´ü=³_\u009aOð*¸\u0094b\u009aÛ<\u009a0§\u000b\u0091@\u001fÀAÙ\u009eP+à¶\u001a%_T.\u0087h±?\u0083ìBX/ófoÊCsù©Î7ó\u0012~¤t;Å\u0011ì\u001a\u0085\"ô®GÎº\u0095uz\u0015v<õÑ¯sÉ\u008b2ä\u0096áv?\u0003\u0006@\u0001ÑEg\u00004\u0084,Y\u008bîÏÑµ\u0002ªPëÛpnà;Û£\u0082Ø\u000e~\u0019Fi¦Óç-ëê% |î\u009dÊÜÚî?f\u008b{ÔÂÕÿ®tc¯ü\u0089\u0010\u0088S¼@\u0011Gm&Ó[\u0018)5\b\u0004Ê¸n\u000b:\u001f\u008aõQÌ\u0087ì\u001e\u0095V\f¨Ù\u008c=\u0010\n\u0094%\u0086ì \u000f¯¿YTM\u0095Ä§s@\u000fæ{\u009e¾d\u0014~\n\u0017«#î·¨Î,ç\u0015/XQ\u0081\u0084ú{6j,\"E,\u000b.g>¡p¿Ð·ùl{\u008fò\u008eCÊ\u0002\u0081Ó\"\u0019\u008cî\n\u0001aÙV\u000fA0\u0010`fDR\u000396îlqiÏ8ØF\u0007(¬\u0084ûËÕ\u008ck#p/È`µg\u0091F\u0003%=ê\u008e`ÿ\u0080&ï¬B¦\u001d-\u0010ó2A\u0000h$9øH±\u0082Ø\t\u0000âÅ13\u0007y^NÓ\u0099µÒ»c\u0080\u0007y*æ\u0082¡e{Ö°a\r\u0081®õd\u0088\u009f´ïí\u000ep<«g\u008b'(\u000f?cï({Qõ\u0092\u00848\u0093$óíb.\u008bþ#Í3\u007f";
      int var6 = "h\u001a\u00896\u0097\u0083\u000eXÄfý²Ö\"ÅO\u0001^JºE\u0090ìéñ·f\t&zÂ0õ\u0091¬7^ª\u009e?m?%Æ³\u009cQ\u000e\nT\u0090-\u0084J6B\u008a,tÂË?õKÜ\u008aÓê]ê\u0093üvrð*r\u000f¿À\f\u0087\u0010 \u008f=üõH¹\u0084l\u009bÀk¼;\u0097 \u0091ÆwùyDérÍ\u009c\u0014 Rd·|`D\u0007\u001e¹sþr\u00ad±íßh\u0097\u009f}Þ`·ÓÐ¸|=Bj©\fM\fØ|¶d\u0016ÿjí\u001bç\u0014\"ÖKñø0\u0095'H\u001f?ùÊ\u009f4U8å\u009cR8Mä$z\u000f\u0015ÅM~Ñ7&8íÍ´W\u0000c\u000f)+\u001ci6\u0092Ä``\u0003ß`SPH¼/þ\u0018³ÁÀùe·ïÕ\u0083°\u0086ÌÐð\u0089Û\n\u0095è ²J¡|Ùêp\u000f$À@) ½@\u0084Ue\u0019cVÀ(ð>\u009d\u0004\u0099íñÊSà\u00887¡ÿm!Q©äË\u0000æVl¦\u00195«\u0098¼\u0016\u0082 Ònµfj\u0086\u008eÂ~I\n1çö\u008f\u001dÂº!N¹\u0003\u0001b\u0090e§^ÿ\b\u009f^X\u009cÉ`\u001e¦\u009fÈ«¦Q«T\u0002\u0099\u0081{\u0004\u000fôÓ\u007f\u0084q¶\u0090Ñ\u0085\f@i½·ë´ºq5×\u0005)q!nÚ¥è´ü=³_\u009aOð*¸\u0094b\u009aÛ<\u009a0§\u000b\u0091@\u001fÀAÙ\u009eP+à¶\u001a%_T.\u0087h±?\u0083ìBX/ófoÊCsù©Î7ó\u0012~¤t;Å\u0011ì\u001a\u0085\"ô®GÎº\u0095uz\u0015v<õÑ¯sÉ\u008b2ä\u0096áv?\u0003\u0006@\u0001ÑEg\u00004\u0084,Y\u008bîÏÑµ\u0002ªPëÛpnà;Û£\u0082Ø\u000e~\u0019Fi¦Óç-ëê% |î\u009dÊÜÚî?f\u008b{ÔÂÕÿ®tc¯ü\u0089\u0010\u0088S¼@\u0011Gm&Ó[\u0018)5\b\u0004Ê¸n\u000b:\u001f\u008aõQÌ\u0087ì\u001e\u0095V\f¨Ù\u008c=\u0010\n\u0094%\u0086ì \u000f¯¿YTM\u0095Ä§s@\u000fæ{\u009e¾d\u0014~\n\u0017«#î·¨Î,ç\u0015/XQ\u0081\u0084ú{6j,\"E,\u000b.g>¡p¿Ð·ùl{\u008fò\u008eCÊ\u0002\u0081Ó\"\u0019\u008cî\n\u0001aÙV\u000fA0\u0010`fDR\u000396îlqiÏ8ØF\u0007(¬\u0084ûËÕ\u008ck#p/È`µg\u0091F\u0003%=ê\u008e`ÿ\u0080&ï¬B¦\u001d-\u0010ó2A\u0000h$9øH±\u0082Ø\t\u0000âÅ13\u0007y^NÓ\u0099µÒ»c\u0080\u0007y*æ\u0082¡e{Ö°a\r\u0081®õd\u0088\u009f´ïí\u000ep<«g\u008b'(\u000f?cï({Qõ\u0092\u00848\u0093$óíb.\u008bþ#Í3\u007f"
         .length();
      char var3 = 'X';
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
                     c = new String[16];
                     brq = MarkerManager.getMarker(a<"h">(27354, 4104002480813439867L ^ var9));
                     so4 = LogManager.getLogger();
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

                  var4 = "æ¡TZu\b\u001arf\u000bö\u001c\u0081+\u0092¨Þ{üS®Dw¿Ðñ+Ù\u009f?T^ S¸å<XØÄ\u0010Î\u001d\u009d\u0017\u0097¡3\u007f¬\u0001ÕÔoD\u0087=ÁøÖIãI0\u0092Ý\u0083¶ÌÆ\u0006ýH\n\u0006 ¡yüÊ´Ï\fÄÏ\u0012½\u0093n.hÒ\u0013ï2u\u001c«iQñ\u001f=ñô|A\u0019©¼\u0012\u0005Tñ\u0011´õvÂ(ûúGgÂRée\"\u001e?&!\u0010\u0006òI\u0012+×)A$)ï";
                  var6 = "æ¡TZu\b\u001arf\u000bö\u001c\u0081+\u0092¨Þ{üS®Dw¿Ðñ+Ù\u009f?T^ S¸å<XØÄ\u0010Î\u001d\u009d\u0017\u0097¡3\u007f¬\u0001ÕÔoD\u0087=ÁøÖIãI0\u0092Ý\u0083¶ÌÆ\u0006ýH\n\u0006 ¡yüÊ´Ï\fÄÏ\u0012½\u0093n.hÒ\u0013ï2u\u001c«iQñ\u001f=ñô|A\u0019©¼\u0012\u0005Tñ\u0011´õvÂ(ûúGgÂRée\"\u001e?&!\u0010\u0006òI\u0012+×)A$)ï"
                     .length();
                  var3 = 'H';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2388;
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
            throw new RuntimeException("c6g", var10);
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
         throw new RuntimeException("c6g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
