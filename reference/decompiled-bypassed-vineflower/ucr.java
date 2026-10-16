import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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

public class ucr extends wob {
   public int ukq;
   public int od8;
   public byte d_r;
   public byte rqi;
   public byte[] quz = new byte[16384];
   public List wcn = Lists.newArrayList();
   private Map bf9 = Maps.newHashMap();
   public Map xoj = Maps.newLinkedHashMap();
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ucr(String var1) {
      super(var1);
   }

   public void snl(double var1, double var3, int var5) {
      int var6 = 128 * (1 << var5);
      int var7 = fe6.jqf((var1 + 64.0) / (double)var6);
      int var8 = fe6.jqf((var3 + 64.0) / (double)var6);
      this.ukq = var7 * var6 + var6 / 2 - 64;
      this.od8 = var8 * var6 + var6 / 2 - 64;
   }

   @Override
   public void oo1(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ucr.a J
      // 003: ldc2_w 118038121489466
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 14424
      // 00d: ldc2_w 6010043360073312322
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 01b: putfield ucr.d_r B
      // 01e: invokestatic t9d.c ()I
      // 021: aload 0
      // 022: aload 1
      // 023: sipush 13963
      // 026: ldc2_w 8213528940631680655
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 034: putfield ucr.ukq I
      // 037: istore 4
      // 039: aload 0
      // 03a: aload 1
      // 03b: sipush 24364
      // 03e: ldc2_w 8494199891819335484
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 04c: putfield ucr.od8 I
      // 04f: aload 0
      // 050: aload 1
      // 051: sipush 25144
      // 054: ldc2_w 6971838573206319648
      // 057: lload 2
      // 058: lxor
      // 059: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: nop
      // 05f: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 062: putfield ucr.rqi B
      // 065: aload 0
      // 066: aload 0
      // 067: getfield ucr.rqi B
      // 06a: bipush 0
      // 06b: bipush 4
      // 06c: invokestatic fe6.faa (III)I
      // 06f: i2b
      // 070: putfield ucr.rqi B
      // 073: aload 1
      // 074: sipush 9499
      // 077: ldc2_w 2404013629545837826
      // 07a: lload 2
      // 07b: lxor
      // 07c: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: nop
      // 082: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 085: istore 5
      // 087: aload 1
      // 088: sipush 13520
      // 08b: ldc2_w 9103788886197855431
      // 08e: lload 2
      // 08f: lxor
      // 090: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: nop
      // 096: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 099: istore 6
      // 09b: iload 5
      // 09d: sipush 128
      // 0a0: iload 4
      // 0a2: ifne 0bb
      // 0a5: if_icmpne 0e0
      // 0a8: goto 0af
      // 0ab: invokestatic ucr.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: iload 6
      // 0b1: sipush 128
      // 0b4: goto 0bb
      // 0b7: invokestatic ucr.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: if_icmpne 0e0
      // 0be: aload 0
      // 0bf: aload 1
      // 0c0: sipush 5516
      // 0c3: ldc2_w 1292623370719708570
      // 0c6: lload 2
      // 0c7: lxor
      // 0c8: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: nop
      // 0ce: invokevirtual bdo.waz (Ljava/lang/String;)[B
      // 0d1: putfield ucr.quz [B
      // 0d4: iload 4
      // 0d6: ifeq 1b4
      // 0d9: goto 0e0
      // 0dc: invokestatic ucr.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: aload 1
      // 0e1: sipush 5516
      // 0e4: ldc2_w 1292623370719708570
      // 0e7: lload 2
      // 0e8: lxor
      // 0e9: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: nop
      // 0ef: invokevirtual bdo.waz (Ljava/lang/String;)[B
      // 0f2: astore 7
      // 0f4: aload 0
      // 0f5: sipush 16384
      // 0f8: newarray 8
      // 0fa: putfield ucr.quz [B
      // 0fd: sipush 128
      // 100: iload 5
      // 102: isub
      // 103: bipush 2
      // 104: idiv
      // 105: istore 8
      // 107: sipush 128
      // 10a: iload 6
      // 10c: isub
      // 10d: bipush 2
      // 10e: idiv
      // 10f: istore 9
      // 111: bipush 0
      // 112: istore 10
      // 114: iload 10
      // 116: iload 6
      // 118: if_icmpge 1b4
      // 11b: iload 10
      // 11d: iload 9
      // 11f: iadd
      // 120: istore 11
      // 122: iload 11
      // 124: iload 4
      // 126: ifne 156
      // 129: ifge 14e
      // 12c: goto 133
      // 12f: invokestatic ucr.a (Loov;)Loov;
      // 132: athrow
      // 133: iload 11
      // 135: iload 4
      // 137: ifne 156
      // 13a: goto 141
      // 13d: invokestatic ucr.a (Loov;)Loov;
      // 140: athrow
      // 141: sipush 128
      // 144: if_icmpge 1ac
      // 147: goto 14e
      // 14a: invokestatic ucr.a (Loov;)Loov;
      // 14d: athrow
      // 14e: bipush 0
      // 14f: goto 156
      // 152: invokestatic ucr.a (Loov;)Loov;
      // 155: athrow
      // 156: istore 12
      // 158: iload 12
      // 15a: iload 5
      // 15c: if_icmpge 1ac
      // 15f: iload 12
      // 161: iload 8
      // 163: iadd
      // 164: istore 13
      // 166: iload 13
      // 168: iload 4
      // 16a: ifne 116
      // 16d: iload 4
      // 16f: ifne 17e
      // 172: ifge 184
      // 175: goto 17c
      // 178: invokestatic ucr.a (Loov;)Loov;
      // 17b: athrow
      // 17c: iload 13
      // 17e: sipush 128
      // 181: if_icmpge 1a4
      // 184: aload 0
      // 185: getfield ucr.quz [B
      // 188: iload 13
      // 18a: iload 11
      // 18c: sipush 128
      // 18f: imul
      // 190: iadd
      // 191: aload 7
      // 193: iload 12
      // 195: iload 10
      // 197: iload 5
      // 199: imul
      // 19a: iadd
      // 19b: baload
      // 19c: bastore
      // 19d: goto 1a4
      // 1a0: invokestatic ucr.a (Loov;)Loov;
      // 1a3: athrow
      // 1a4: iinc 12 1
      // 1a7: iload 4
      // 1a9: ifeq 158
      // 1ac: iinc 10 1
      // 1af: iload 4
      // 1b1: ifeq 114
      // 1b4: return
   }

   @Override
   public void _j9(bdo var1) {
      long var2 = a ^ 56590539199403L;
      var1.atr(a<"c">(8952, 9113897168649438582L ^ var2), this.d_r);
      var1.iin(a<"c">(8720, 4594348765794780564L ^ var2), this.ukq);
      var1.iin(a<"c">(31386, 4477115318447152407L ^ var2), this.od8);
      var1.atr(a<"c">(30987, 3746292294083911304L ^ var2), this.rqi);
      var1.ge7(a<"c">(5718, 52985215092814278L ^ var2), (short)128);
      var1.ge7(a<"c">(15248, 7398391395624737810L ^ var2), (short)128);
      var1.gd7(a<"c">(13426, 2679032385453609970L ^ var2), this.quz);
   }

   public void obe(ha9 param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ucr.a J
      // 003: ldc2_w 115922232551201
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield ucr.bf9 Ljava/util/Map;
      // 011: aload 1
      // 012: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 017: iload 5
      // 019: ifeq 052
      // 01c: ifne 04a
      // 01f: goto 026
      // 022: invokestatic ucr.a (Loov;)Loov;
      // 025: athrow
      // 026: new ucr$qah
      // 029: dup
      // 02a: aload 0
      // 02b: aload 1
      // 02c: invokespecial ucr$qah.<init> (Lucr;Lha9;)V
      // 02f: astore 6
      // 031: aload 0
      // 032: getfield ucr.bf9 Ljava/util/Map;
      // 035: aload 1
      // 036: aload 6
      // 038: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 03d: pop
      // 03e: aload 0
      // 03f: getfield ucr.wcn Ljava/util/List;
      // 042: aload 6
      // 044: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 049: pop
      // 04a: aload 1
      // 04b: getfield ha9.up_ Ljnq;
      // 04e: aload 2
      // 04f: invokevirtual jnq.kzl (Lerg;)Z
      // 052: iload 5
      // 054: ifeq 077
      // 057: ifne 076
      // 05a: goto 061
      // 05d: invokestatic ucr.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield ucr.xoj Ljava/util/Map;
      // 065: aload 1
      // 066: invokevirtual ha9.noc ()Ljava/lang/String;
      // 069: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 06e: pop
      // 06f: goto 076
      // 072: invokestatic ucr.a (Loov;)Loov;
      // 075: athrow
      // 076: bipush 0
      // 077: istore 6
      // 079: iload 6
      // 07b: aload 0
      // 07c: getfield ucr.wcn Ljava/util/List;
      // 07f: invokeinterface java/util/List.size ()I 1
      // 084: if_icmpge 18a
      // 087: aload 0
      // 088: getfield ucr.wcn Ljava/util/List;
      // 08b: iload 6
      // 08d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 092: checkcast ucr$qah
      // 095: astore 7
      // 097: aload 7
      // 099: getfield ucr$qah.tlp Lha9;
      // 09c: getfield ha9.ma9 Z
      // 09f: iload 5
      // 0a1: ifeq 18e
      // 0a4: iload 5
      // 0a6: ifeq 181
      // 0a9: goto 0b0
      // 0ac: invokestatic ucr.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: ifne 160
      // 0b3: goto 0ba
      // 0b6: invokestatic ucr.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: aload 7
      // 0bc: getfield ucr$qah.tlp Lha9;
      // 0bf: getfield ha9.up_ Ljnq;
      // 0c2: aload 2
      // 0c3: invokevirtual jnq.kzl (Lerg;)Z
      // 0c6: iload 5
      // 0c8: ifeq 101
      // 0cb: goto 0d2
      // 0ce: invokestatic ucr.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: ifne 0f6
      // 0d5: goto 0dc
      // 0d8: invokestatic ucr.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 2
      // 0dd: invokevirtual erg.btl ()Z
      // 0e0: iload 5
      // 0e2: ifeq 181
      // 0e5: goto 0ec
      // 0e8: invokestatic ucr.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: ifeq 160
      // 0ef: goto 0f6
      // 0f2: invokestatic ucr.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: aload 2
      // 0f7: invokevirtual erg.btl ()Z
      // 0fa: goto 101
      // 0fd: invokestatic ucr.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 5
      // 103: ifeq 11f
      // 106: ifne 182
      // 109: goto 110
      // 10c: invokestatic ucr.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 7
      // 112: getfield ucr$qah.tlp Lha9;
      // 115: getfield ha9.ohd I
      // 118: goto 11f
      // 11b: invokestatic ucr.a (Loov;)Loov;
      // 11e: athrow
      // 11f: aload 0
      // 120: getfield ucr.d_r B
      // 123: if_icmpne 182
      // 126: aload 0
      // 127: bipush 0
      // 128: aload 7
      // 12a: getfield ucr$qah.tlp Lha9;
      // 12d: getfield ha9.oay Lt9d;
      // 130: aload 7
      // 132: getfield ucr$qah.tlp Lha9;
      // 135: invokevirtual ha9.noc ()Ljava/lang/String;
      // 138: aload 7
      // 13a: getfield ucr$qah.tlp Lha9;
      // 13d: getfield ha9.o2v D
      // 140: aload 7
      // 142: getfield ucr$qah.tlp Lha9;
      // 145: getfield ha9.vbd D
      // 148: aload 7
      // 14a: getfield ucr$qah.tlp Lha9;
      // 14d: getfield ha9.x5k F
      // 150: f2d
      // 151: invokespecial ucr.ph7 (ILt9d;Ljava/lang/String;DDD)V
      // 154: iload 5
      // 156: ifne 182
      // 159: goto 160
      // 15c: invokestatic ucr.a (Loov;)Loov;
      // 15f: athrow
      // 160: aload 0
      // 161: getfield ucr.bf9 Ljava/util/Map;
      // 164: aload 7
      // 166: getfield ucr$qah.tlp Lha9;
      // 169: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 16e: pop
      // 16f: aload 0
      // 170: getfield ucr.wcn Ljava/util/List;
      // 173: aload 7
      // 175: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 17a: goto 181
      // 17d: invokestatic ucr.a (Loov;)Loov;
      // 180: athrow
      // 181: pop
      // 182: iinc 6 1
      // 185: iload 5
      // 187: ifne 079
      // 18a: aload 2
      // 18b: invokevirtual erg.btl ()Z
      // 18e: iload 5
      // 190: ifeq 1f2
      // 193: ifeq 1ee
      // 196: goto 19d
      // 199: invokestatic ucr.a (Loov;)Loov;
      // 19c: athrow
      // 19d: aload 2
      // 19e: invokevirtual erg.yik ()Lco7;
      // 1a1: astore 6
      // 1a3: aload 6
      // 1a5: invokevirtual co7.liv ()Lmew;
      // 1a8: astore 7
      // 1aa: aload 0
      // 1ab: bipush 1
      // 1ac: aload 1
      // 1ad: getfield ha9.oay Lt9d;
      // 1b0: new java/lang/StringBuilder
      // 1b3: dup
      // 1b4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b7: sipush 2024
      // 1ba: ldc2_w 5083610015325345006
      // 1bd: lload 3
      // 1be: lxor
      // 1bf: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: nop
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: aload 6
      // 1ca: invokevirtual co7.jwu ()I
      // 1cd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d3: aload 7
      // 1d5: invokevirtual mew.getX ()I
      // 1d8: i2d
      // 1d9: aload 7
      // 1db: invokevirtual mew.getZ ()I
      // 1de: i2d
      // 1df: aload 6
      // 1e1: getfield co7.vv_ Lvt2;
      // 1e4: invokevirtual vt2.tmy ()I
      // 1e7: bipush 90
      // 1e9: imul
      // 1ea: i2d
      // 1eb: invokespecial ucr.ph7 (ILt9d;Ljava/lang/String;DDD)V
      // 1ee: aload 2
      // 1ef: invokevirtual erg.w8b ()Z
      // 1f2: iload 5
      // 1f4: ifeq 22b
      // 1f7: ifeq 2ef
      // 1fa: goto 201
      // 1fd: invokestatic ucr.a (Loov;)Loov;
      // 200: athrow
      // 201: aload 2
      // 202: invokevirtual erg.zso ()Lbdo;
      // 205: sipush 30694
      // 208: ldc2_w 6597229541413070075
      // 20b: lload 3
      // 20c: lxor
      // 20d: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: nop
      // 213: bipush 9
      // 215: iload 5
      // 217: ifeq 249
      // 21a: goto 221
      // 21d: invokestatic ucr.a (Loov;)Loov;
      // 220: athrow
      // 221: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 224: goto 22b
      // 227: invokestatic ucr.a (Loov;)Loov;
      // 22a: athrow
      // 22b: ifeq 2ef
      // 22e: aload 2
      // 22f: invokevirtual erg.zso ()Lbdo;
      // 232: sipush 32032
      // 235: ldc2_w 7736423197656329790
      // 238: lload 3
      // 239: lxor
      // 23a: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: nop
      // 240: bipush 10
      // 242: goto 249
      // 245: invokestatic ucr.a (Loov;)Loov;
      // 248: athrow
      // 249: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 24c: astore 6
      // 24e: bipush 0
      // 24f: istore 7
      // 251: iload 7
      // 253: aload 6
      // 255: invokevirtual qhg.vek ()I
      // 258: if_icmpge 2ef
      // 25b: aload 6
      // 25d: iload 7
      // 25f: invokevirtual qhg.kd6 (I)Lbdo;
      // 262: astore 8
      // 264: iload 5
      // 266: ifeq 2ea
      // 269: aload 0
      // 26a: getfield ucr.xoj Ljava/util/Map;
      // 26d: aload 8
      // 26f: sipush 28022
      // 272: ldc2_w 6522106772491583082
      // 275: lload 3
      // 276: lxor
      // 277: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: nop
      // 27d: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 280: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 285: ifne 2e7
      // 288: goto 28f
      // 28b: invokestatic ucr.a (Loov;)Loov;
      // 28e: athrow
      // 28f: aload 0
      // 290: aload 8
      // 292: sipush 32502
      // 295: ldc2_w 7787779810340285942
      // 298: lload 3
      // 299: lxor
      // 29a: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: nop
      // 2a0: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 2a3: aload 1
      // 2a4: getfield ha9.oay Lt9d;
      // 2a7: aload 8
      // 2a9: sipush 5060
      // 2ac: ldc2_w 8969866805512093889
      // 2af: lload 3
      // 2b0: lxor
      // 2b1: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: nop
      // 2b7: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 2ba: aload 8
      // 2bc: ldc "x"
      // 2be: nop
      // 2bf: invokevirtual bdo.m9p (Ljava/lang/String;)D
      // 2c2: aload 8
      // 2c4: ldc "z"
      // 2c6: nop
      // 2c7: invokevirtual bdo.m9p (Ljava/lang/String;)D
      // 2ca: aload 8
      // 2cc: sipush 15826
      // 2cf: ldc2_w 2039102934872649437
      // 2d2: lload 3
      // 2d3: lxor
      // 2d4: invokedynamic c (IJ)Ljava/lang/String; bsm=ucr.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: nop
      // 2da: invokevirtual bdo.m9p (Ljava/lang/String;)D
      // 2dd: invokespecial ucr.ph7 (ILt9d;Ljava/lang/String;DDD)V
      // 2e0: goto 2e7
      // 2e3: invokestatic ucr.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: iinc 7 1
      // 2ea: iload 5
      // 2ec: ifne 251
      // 2ef: return
   }

   private void ph7(int param1, t9d param2, String param3, double param4, double param6, double param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: aload 0
      // 002: getfield ucr.rqi B
      // 005: ishl
      // 006: istore 11
      // 008: invokestatic t9d.b ()I
      // 00b: dload 4
      // 00d: aload 0
      // 00e: getfield ucr.ukq I
      // 011: i2d
      // 012: dsub
      // 013: d2f
      // 014: iload 11
      // 016: i2f
      // 017: fdiv
      // 018: fstore 12
      // 01a: istore 10
      // 01c: dload 6
      // 01e: aload 0
      // 01f: getfield ucr.od8 I
      // 022: i2d
      // 023: dsub
      // 024: d2f
      // 025: iload 11
      // 027: i2f
      // 028: fdiv
      // 029: fstore 13
      // 02b: fload 12
      // 02d: fconst_2
      // 02e: fmul
      // 02f: f2d
      // 030: ldc2_w 0.5
      // 033: dadd
      // 034: d2i
      // 035: i2b
      // 036: istore 14
      // 038: fload 13
      // 03a: fconst_2
      // 03b: fmul
      // 03c: f2d
      // 03d: ldc2_w 0.5
      // 040: dadd
      // 041: d2i
      // 042: i2b
      // 043: istore 15
      // 045: bipush 63
      // 047: istore 16
      // 049: fload 12
      // 04b: iload 16
      // 04d: ineg
      // 04e: i2f
      // 04f: fcmpl
      // 050: iload 10
      // 052: ifeq 13f
      // 055: iflt 12f
      // 058: goto 05f
      // 05b: invokestatic ucr.a (Loov;)Loov;
      // 05e: athrow
      // 05f: fload 13
      // 061: iload 16
      // 063: ineg
      // 064: i2f
      // 065: fcmpl
      // 066: iload 10
      // 068: ifeq 13f
      // 06b: goto 072
      // 06e: invokestatic ucr.a (Loov;)Loov;
      // 071: athrow
      // 072: iflt 12f
      // 075: goto 07c
      // 078: invokestatic ucr.a (Loov;)Loov;
      // 07b: athrow
      // 07c: fload 12
      // 07e: iload 16
      // 080: i2f
      // 081: fcmpg
      // 082: iload 10
      // 084: ifeq 13f
      // 087: goto 08e
      // 08a: invokestatic ucr.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ifgt 12f
      // 091: goto 098
      // 094: invokestatic ucr.a (Loov;)Loov;
      // 097: athrow
      // 098: fload 13
      // 09a: iload 16
      // 09c: i2f
      // 09d: fcmpg
      // 09e: iload 10
      // 0a0: ifeq 13f
      // 0a3: goto 0aa
      // 0a6: invokestatic ucr.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: ifgt 12f
      // 0ad: goto 0b4
      // 0b0: invokestatic ucr.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: dload 8
      // 0b6: dload 8
      // 0b8: iload 10
      // 0ba: ifeq 0da
      // 0bd: goto 0c4
      // 0c0: invokestatic ucr.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: dconst_0
      // 0c5: dcmpg
      // 0c6: ifge 0dd
      // 0c9: goto 0d0
      // 0cc: invokestatic ucr.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: ldc2_w -8.0
      // 0d3: goto 0da
      // 0d6: invokestatic ucr.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: goto 0e0
      // 0dd: ldc2_w 8.0
      // 0e0: dadd
      // 0e1: dstore 8
      // 0e3: dload 8
      // 0e5: ldc2_w 16.0
      // 0e8: dmul
      // 0e9: ldc2_w 360.0
      // 0ec: ddiv
      // 0ed: d2i
      // 0ee: i2b
      // 0ef: istore 17
      // 0f1: aload 0
      // 0f2: iload 10
      // 0f4: ifeq 225
      // 0f7: getfield ucr.d_r B
      // 0fa: ifge 20c
      // 0fd: goto 104
      // 100: invokestatic ucr.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 2
      // 105: invokevirtual t9d.r7d ()Lcog;
      // 108: invokevirtual cog.y9w ()J
      // 10b: ldc2_w 10
      // 10e: ldiv
      // 10f: l2i
      // 110: istore 18
      // 112: iload 18
      // 114: iload 18
      // 116: imul
      // 117: ldc 34187121
      // 119: nop
      // 11a: imul
      // 11b: iload 18
      // 11d: bipush 121
      // 11f: imul
      // 120: iadd
      // 121: bipush 15
      // 123: ishr
      // 124: bipush 15
      // 126: iand
      // 127: i2b
      // 128: istore 17
      // 12a: iload 10
      // 12c: ifne 20c
      // 12f: fload 12
      // 131: invokestatic java/lang/Math.abs (F)F
      // 134: ldc 320.0
      // 136: nop
      // 137: fcmpl
      // 138: goto 13f
      // 13b: invokestatic ucr.a (Loov;)Loov;
      // 13e: athrow
      // 13f: iload 10
      // 141: ifeq 15e
      // 144: ifge 16d
      // 147: goto 14e
      // 14a: invokestatic ucr.a (Loov;)Loov;
      // 14d: athrow
      // 14e: fload 13
      // 150: invokestatic java/lang/Math.abs (F)F
      // 153: ldc 320.0
      // 155: nop
      // 156: fcmpl
      // 157: goto 15e
      // 15a: invokestatic ucr.a (Loov;)Loov;
      // 15d: athrow
      // 15e: iload 10
      // 160: ifeq 181
      // 163: iflt 17d
      // 166: goto 16d
      // 169: invokestatic ucr.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aload 0
      // 16e: getfield ucr.xoj Ljava/util/Map;
      // 171: aload 3
      // 172: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 177: pop
      // 178: return
      // 179: invokestatic ucr.a (Loov;)Loov;
      // 17c: athrow
      // 17d: bipush 6
      // 17f: istore 1
      // 180: bipush 0
      // 181: istore 17
      // 183: fload 12
      // 185: iload 16
      // 187: ineg
      // 188: i2f
      // 189: fcmpg
      // 18a: iload 10
      // 18c: ifeq 1ad
      // 18f: ifgt 1a6
      // 192: goto 199
      // 195: invokestatic ucr.a (Loov;)Loov;
      // 198: athrow
      // 199: iload 16
      // 19b: bipush 2
      // 19c: imul
      // 19d: i2d
      // 19e: ldc2_w 2.5
      // 1a1: dadd
      // 1a2: d2i
      // 1a3: i2b
      // 1a4: istore 14
      // 1a6: fload 13
      // 1a8: iload 16
      // 1aa: ineg
      // 1ab: i2f
      // 1ac: fcmpg
      // 1ad: iload 10
      // 1af: ifeq 1cf
      // 1b2: ifgt 1c9
      // 1b5: goto 1bc
      // 1b8: invokestatic ucr.a (Loov;)Loov;
      // 1bb: athrow
      // 1bc: iload 16
      // 1be: bipush 2
      // 1bf: imul
      // 1c0: i2d
      // 1c1: ldc2_w 2.5
      // 1c4: dadd
      // 1c5: d2i
      // 1c6: i2b
      // 1c7: istore 15
      // 1c9: fload 12
      // 1cb: iload 16
      // 1cd: i2f
      // 1ce: fcmpl
      // 1cf: iload 10
      // 1d1: ifeq 1ed
      // 1d4: iflt 1e7
      // 1d7: goto 1de
      // 1da: invokestatic ucr.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: iload 16
      // 1e0: bipush 2
      // 1e1: imul
      // 1e2: bipush 1
      // 1e3: iadd
      // 1e4: i2b
      // 1e5: istore 14
      // 1e7: fload 13
      // 1e9: iload 16
      // 1eb: i2f
      // 1ec: fcmpl
      // 1ed: iload 10
      // 1ef: ifeq 20a
      // 1f2: iflt 20c
      // 1f5: goto 1fc
      // 1f8: invokestatic ucr.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: iload 16
      // 1fe: bipush 2
      // 1ff: imul
      // 200: bipush 1
      // 201: iadd
      // 202: i2b
      // 203: goto 20a
      // 206: invokestatic ucr.a (Loov;)Loov;
      // 209: athrow
      // 20a: istore 15
      // 20c: aload 0
      // 20d: getfield ucr.xoj Ljava/util/Map;
      // 210: aload 3
      // 211: new lib
      // 214: dup
      // 215: iload 1
      // 216: i2b
      // 217: iload 14
      // 219: iload 15
      // 21b: iload 17
      // 21d: invokespecial lib.<init> (BBBB)V
      // 220: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 225: pop
      // 226: return
   }

   public mz2 j0m(erg param1, t9d param2, ha9 param3) {
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
      // 06: getfield ucr.bf9 Ljava/util/Map;
      // 09: aload 3
      // 0a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f: checkcast ucr$qah
      // 12: astore 5
      // 14: aload 5
      // 16: iload 4
      // 18: ifne 2f
      // 1b: ifnonnull 2d
      // 1e: goto 25
      // 21: invokestatic ucr.a (Loov;)Loov;
      // 24: athrow
      // 25: aconst_null
      // 26: goto 33
      // 29: invokestatic ucr.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 5
      // 2f: aload 1
      // 30: invokevirtual ucr$qah.g1z (Lerg;)Lmz2;
      // 33: areturn
   }

   public void zeq(int var1, int var2) {
      super.hcs();
      int var10000 = t9d.c();
      Iterator var4 = this.wcn.iterator();
      int var3 = var10000;

      while (var4.hasNext()) {
         ucr$qah var5 = (ucr$qah)var4.next();
         var5.c7b(var1, var2);
         if (var3 != 0) {
            break;
         }
      }
   }

   public ucr$qah _5y(ha9 var1) {
      int var2 = t9d.b();
      ucr$qah var3 = (ucr$qah)this.bf9.get(var1);

      try {
         if (var2 == 0) {
            return var3;
         }

         if (var3 != null) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 = new ucr$qah(this, var1);
      this.bf9.put(var1, var3);
      this.wcn.add(var3);
      return var3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8386817910766335966L, -41192374077387448L, MethodHandles.lookup().lookupClass()).a(249920484856152L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 29311644492393L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[21];
      int var7 = 0;
      String var6 = "v\u0091½>\u0091¨7\u0085Ý/\u007f\u0005o¯ü\u0086\u0010FÏn\u0099\u0091{\u0099\\\u001f¿\u009f`¶\u0006õ\u008c\u0010 ¯ÏÙ3ÿÖ|Â\u0091Vwyç\u00ad¢\u0010Ç&gÝ½¥ùj2Îz$E\u0095\u001bk\u0010Vè»#7a\u009dý\fÄfÍk\u008a¤5\u0010D\u0001\u001ed¨\u000bº/\u009båWé:¡=)\u0010½\u0004\u0001(Z\u009c]\u0088\u001d\u001c\u000e\u0002YK\u0098¤\u0010Õ1Ô*\u0004\u001eÿøÛ6#\u0093j©, \u0010iÅ±\u0091®\u0088<7í/\u001c\u0095ö\u008dÍ\u0096\u0010\"|\u0088¬ÞSr>`4iWì5 S UÏçãà]äìy÷\u0095µÍ8¥ÜÇ\u0002)ø_`oDÐ'\bÒ\u0000\u0085\u00908\u0010&Á\u001dp\u0080\u0014ðr«ðTqóV&Ú\u0010B.ýÃ\u0081ñ\u001f\u000e\u000b¦5;Ý÷¿Ê\u0010Óc¥Nð#\u0000·\u0019ý*Êã\u0013Ýô\u0010É¸k-ÙQ\u000bH@@JÐ<|×P ©ÓhðHn*Õ\u0015\u0017ad\u0098ìªõÛ*»f\u001a\u000eHE\u008f÷à\u000bfëÜ3 \u0017D\u000e«KYý\u0010PCC¤?\u001av\b\u008e\u009eXý>|\u0011\u0014øè93Ûá,1\u0010¿Wô¥rÑ\u009aFc}I=\u009a=\u0003t\u0010iÍQáI\u0004ÌR)wï\u0015I\u000emí";
      int var8 = "v\u0091½>\u0091¨7\u0085Ý/\u007f\u0005o¯ü\u0086\u0010FÏn\u0099\u0091{\u0099\\\u001f¿\u009f`¶\u0006õ\u008c\u0010 ¯ÏÙ3ÿÖ|Â\u0091Vwyç\u00ad¢\u0010Ç&gÝ½¥ùj2Îz$E\u0095\u001bk\u0010Vè»#7a\u009dý\fÄfÍk\u008a¤5\u0010D\u0001\u001ed¨\u000bº/\u009båWé:¡=)\u0010½\u0004\u0001(Z\u009c]\u0088\u001d\u001c\u000e\u0002YK\u0098¤\u0010Õ1Ô*\u0004\u001eÿøÛ6#\u0093j©, \u0010iÅ±\u0091®\u0088<7í/\u001c\u0095ö\u008dÍ\u0096\u0010\"|\u0088¬ÞSr>`4iWì5 S UÏçãà]äìy÷\u0095µÍ8¥ÜÇ\u0002)ø_`oDÐ'\bÒ\u0000\u0085\u00908\u0010&Á\u001dp\u0080\u0014ðr«ðTqóV&Ú\u0010B.ýÃ\u0081ñ\u001f\u000e\u000b¦5;Ý÷¿Ê\u0010Óc¥Nð#\u0000·\u0019ý*Êã\u0013Ýô\u0010É¸k-ÙQ\u000bH@@JÐ<|×P ©ÓhðHn*Õ\u0015\u0017ad\u0098ìªõÛ*»f\u001a\u000eHE\u008f÷à\u000bfëÜ3 \u0017D\u000e«KYý\u0010PCC¤?\u001av\b\u008e\u009eXý>|\u0011\u0014øè93Ûá,1\u0010¿Wô¥rÑ\u009aFc}I=\u009a=\u0003t\u0010iÍQáI\u0004ÌR)wï\u0015I\u000emí"
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
                     c = new String[21];
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

                  var6 = "\u008bgïâ\u0007¥\u0018Ë\u001d\u0081n-\u008a\u0012è\u009eá¯t\u0090®Ø¼5\u0010\u0002\u001c7eo7mÔKw\u007f]gK\u0007v";
                  var8 = "\u008bgïâ\u0007¥\u0018Ë\u001d\u0081n-\u008a\u0012è\u009eá¯t\u0090®Ø¼5\u0010\u0002\u001c7eo7mÔKw\u007f]gK\u0007v".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27747;
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
            throw new RuntimeException("ucr", var10);
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
         throw new RuntimeException("ucr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
