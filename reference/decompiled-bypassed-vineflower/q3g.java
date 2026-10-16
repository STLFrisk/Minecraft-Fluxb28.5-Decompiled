import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.render.RenderEnv;
import net.optifine.shaders.SVertexBuilder;

public class q3g {
   private ByteBuffer lmi;
   public IntBuffer khm;
   private ShortBuffer n5q;
   public FloatBuffer zki;
   public int gb0;
   private n0i p0d;
   private int uwp;
   private boolean q_4;
   public int msu;
   private double eyp;
   private double uu5;
   private double yfg;
   private be7 xfj;
   private boolean af3;
   private w51 k1w = null;
   private boolean[] nhq = new boolean[256];
   private sla[] _vb = null;
   private sla[] cwr = null;
   private sla ob1 = null;
   public SVertexBuilder g84;
   public RenderEnv meu = null;
   public BitSet fho = null;
   public BitSet piy = new BitSet();
   private boolean r7b = false;
   private ByteBuffer kcq;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public q3g(int var1) {
      this.lmi = nkx.eh9(var1 * 4);
      this.khm = this.lmi.asIntBuffer();
      this.n5q = this.lmi.asShortBuffer();
      this.zki = this.lmi.asFloatBuffer();
      SVertexBuilder.initVertexBuilder(this);
   }

   private void duc(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic q3g.a J
      // 003: ldc2_w 108520879293492
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: iload 1
      // 00e: iload 4
      // 010: ifne 032
      // 013: aload 0
      // 014: getfield q3g.khm Ljava/nio/IntBuffer;
      // 017: invokevirtual java/nio/IntBuffer.remaining ()I
      // 01a: if_icmple 158
      // 01d: goto 024
      // 020: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 023: athrow
      // 024: aload 0
      // 025: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 028: invokevirtual java/nio/ByteBuffer.capacity ()I
      // 02b: goto 032
      // 02e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 031: athrow
      // 032: istore 5
      // 034: iload 5
      // 036: ldc 2097152
      // 038: nop
      // 039: irem
      // 03a: istore 6
      // 03c: iload 6
      // 03e: aload 0
      // 03f: getfield q3g.khm Ljava/nio/IntBuffer;
      // 042: invokevirtual java/nio/IntBuffer.position ()I
      // 045: iload 1
      // 046: iadd
      // 047: bipush 4
      // 048: imul
      // 049: iload 6
      // 04b: isub
      // 04c: ldc 2097152
      // 04e: nop
      // 04f: idiv
      // 050: bipush 1
      // 051: iadd
      // 052: ldc 2097152
      // 054: nop
      // 055: imul
      // 056: iadd
      // 057: istore 7
      // 059: invokestatic org/apache/logging/log4j/LogManager.getLogger ()Lorg/apache/logging/log4j/Logger;
      // 05c: new java/lang/StringBuilder
      // 05f: dup
      // 060: invokespecial java/lang/StringBuilder.<init> ()V
      // 063: sipush 26513
      // 066: ldc2_w 7919417279448896190
      // 069: lload 2
      // 06a: lxor
      // 06b: invokedynamic p (IJ)Ljava/lang/String; bsm=q3g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: nop
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: iload 5
      // 076: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 079: sipush 14098
      // 07c: ldc2_w 8330359680043156030
      // 07f: lload 2
      // 080: lxor
      // 081: invokedynamic p (IJ)Ljava/lang/String; bsm=q3g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: nop
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: iload 7
      // 08c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08f: sipush 5200
      // 092: ldc2_w 3805057015120568702
      // 095: lload 2
      // 096: lxor
      // 097: invokedynamic p (IJ)Ljava/lang/String; bsm=q3g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: nop
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a3: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // 0a8: aload 0
      // 0a9: getfield q3g.khm Ljava/nio/IntBuffer;
      // 0ac: invokevirtual java/nio/IntBuffer.position ()I
      // 0af: istore 8
      // 0b1: iload 7
      // 0b3: invokestatic nkx.eh9 (I)Ljava/nio/ByteBuffer;
      // 0b6: astore 9
      // 0b8: aload 0
      // 0b9: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0bc: bipush 0
      // 0bd: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/Buffer;
      // 0c0: pop
      // 0c1: aload 9
      // 0c3: aload 0
      // 0c4: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0c7: invokevirtual java/nio/ByteBuffer.put (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
      // 0ca: pop
      // 0cb: aload 9
      // 0cd: invokevirtual java/nio/ByteBuffer.rewind ()Ljava/nio/Buffer;
      // 0d0: pop
      // 0d1: aload 0
      // 0d2: aload 9
      // 0d4: putfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0d7: aload 0
      // 0d8: aload 0
      // 0d9: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0dc: invokevirtual java/nio/ByteBuffer.asFloatBuffer ()Ljava/nio/FloatBuffer;
      // 0df: putfield q3g.zki Ljava/nio/FloatBuffer;
      // 0e2: aload 0
      // 0e3: aload 0
      // 0e4: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0e7: invokevirtual java/nio/ByteBuffer.asIntBuffer ()Ljava/nio/IntBuffer;
      // 0ea: putfield q3g.khm Ljava/nio/IntBuffer;
      // 0ed: aload 0
      // 0ee: getfield q3g.khm Ljava/nio/IntBuffer;
      // 0f1: iload 8
      // 0f3: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 0f6: pop
      // 0f7: aload 0
      // 0f8: aload 0
      // 0f9: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0fc: invokevirtual java/nio/ByteBuffer.asShortBuffer ()Ljava/nio/ShortBuffer;
      // 0ff: putfield q3g.n5q Ljava/nio/ShortBuffer;
      // 102: aload 0
      // 103: getfield q3g.n5q Ljava/nio/ShortBuffer;
      // 106: iload 8
      // 108: bipush 1
      // 109: ishl
      // 10a: invokevirtual java/nio/ShortBuffer.position (I)Ljava/nio/Buffer;
      // 10d: pop
      // 10e: aload 0
      // 10f: getfield q3g._vb [Lsla;
      // 112: iload 4
      // 114: ifne 12c
      // 117: ifnull 158
      // 11a: goto 121
      // 11d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 120: athrow
      // 121: aload 0
      // 122: getfield q3g._vb [Lsla;
      // 125: goto 12c
      // 128: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 12b: athrow
      // 12c: astore 10
      // 12e: aload 0
      // 12f: invokespecial q3g.xh7 ()I
      // 132: istore 11
      // 134: aload 0
      // 135: iload 11
      // 137: anewarray 194
      // 13a: putfield q3g._vb [Lsla;
      // 13d: aload 10
      // 13f: bipush 0
      // 140: aload 0
      // 141: getfield q3g._vb [Lsla;
      // 144: bipush 0
      // 145: aload 10
      // 147: arraylength
      // 148: aload 0
      // 149: getfield q3g._vb [Lsla;
      // 14c: arraylength
      // 14d: invokestatic java/lang/Math.min (II)I
      // 150: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 153: aload 0
      // 154: aconst_null
      // 155: putfield q3g.cwr [Lsla;
      // 158: return
   }

   public void c7x(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield q3g.gb0 I
      // 004: bipush 4
      // 005: idiv
      // 006: istore 5
      // 008: invokestatic t9d.b ()I
      // 00b: iload 5
      // 00d: newarray 6
      // 00f: astore 6
      // 011: istore 4
      // 013: bipush 0
      // 014: istore 7
      // 016: iload 7
      // 018: iload 5
      // 01a: if_icmpge 05a
      // 01d: aload 6
      // 01f: iload 7
      // 021: aload 0
      // 022: getfield q3g.zki Ljava/nio/FloatBuffer;
      // 025: fload 1
      // 026: f2d
      // 027: aload 0
      // 028: getfield q3g.eyp D
      // 02b: dadd
      // 02c: d2f
      // 02d: fload 2
      // 02e: f2d
      // 02f: aload 0
      // 030: getfield q3g.uu5 D
      // 033: dadd
      // 034: d2f
      // 035: fload 3
      // 036: f2d
      // 037: aload 0
      // 038: getfield q3g.yfg D
      // 03b: dadd
      // 03c: d2f
      // 03d: aload 0
      // 03e: getfield q3g.xfj Lbe7;
      // 041: invokevirtual be7.olc ()I
      // 044: iload 7
      // 046: aload 0
      // 047: getfield q3g.xfj Lbe7;
      // 04a: invokevirtual be7.vy7 ()I
      // 04d: imul
      // 04e: invokestatic q3g.qek (Ljava/nio/FloatBuffer;FFFII)F
      // 051: fastore
      // 052: iinc 7 1
      // 055: iload 4
      // 057: ifne 016
      // 05a: iload 5
      // 05c: anewarray 234
      // 05f: astore 7
      // 061: bipush 0
      // 062: istore 8
      // 064: iload 8
      // 066: aload 7
      // 068: arraylength
      // 069: if_icmpge 08a
      // 06c: aload 7
      // 06e: iload 8
      // 070: iload 8
      // 072: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 075: aastore
      // 076: iinc 8 1
      // 079: iload 4
      // 07b: ifeq 099
      // 07e: iload 4
      // 080: ifne 064
      // 083: goto 08a
      // 086: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: aload 7
      // 08c: new q3g$1
      // 08f: dup
      // 090: aload 0
      // 091: aload 6
      // 093: invokespecial q3g$1.<init> (Lq3g;[F)V
      // 096: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;Ljava/util/Comparator;)V
      // 099: new java/util/BitSet
      // 09c: dup
      // 09d: invokespecial java/util/BitSet.<init> ()V
      // 0a0: astore 8
      // 0a2: aload 0
      // 0a3: getfield q3g.xfj Lbe7;
      // 0a6: invokevirtual be7.vy7 ()I
      // 0a9: istore 9
      // 0ab: iload 9
      // 0ad: newarray 10
      // 0af: astore 10
      // 0b1: bipush 0
      // 0b2: istore 11
      // 0b4: aload 8
      // 0b6: iload 11
      // 0b8: invokevirtual java/util/BitSet.nextClearBit (I)I
      // 0bb: dup
      // 0bc: istore 11
      // 0be: aload 7
      // 0c0: arraylength
      // 0c1: if_icmpge 1d2
      // 0c4: aload 7
      // 0c6: iload 11
      // 0c8: aaload
      // 0c9: invokevirtual java/lang/Integer.intValue ()I
      // 0cc: istore 12
      // 0ce: iload 4
      // 0d0: ifeq 1cd
      // 0d3: iload 12
      // 0d5: iload 11
      // 0d7: iload 4
      // 0d9: ifeq 20c
      // 0dc: goto 0e3
      // 0df: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e2: athrow
      // 0e3: if_icmpeq 1c3
      // 0e6: goto 0ed
      // 0e9: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield q3g.khm Ljava/nio/IntBuffer;
      // 0f1: iload 12
      // 0f3: iload 9
      // 0f5: imul
      // 0f6: iload 9
      // 0f8: iadd
      // 0f9: invokevirtual java/nio/IntBuffer.limit (I)Ljava/nio/Buffer;
      // 0fc: pop
      // 0fd: aload 0
      // 0fe: getfield q3g.khm Ljava/nio/IntBuffer;
      // 101: iload 12
      // 103: iload 9
      // 105: imul
      // 106: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 109: pop
      // 10a: aload 0
      // 10b: getfield q3g.khm Ljava/nio/IntBuffer;
      // 10e: aload 10
      // 110: invokevirtual java/nio/IntBuffer.get ([I)Ljava/nio/IntBuffer;
      // 113: pop
      // 114: iload 12
      // 116: istore 13
      // 118: aload 7
      // 11a: iload 12
      // 11c: aaload
      // 11d: invokevirtual java/lang/Integer.intValue ()I
      // 120: istore 14
      // 122: iload 13
      // 124: iload 11
      // 126: if_icmpeq 19c
      // 129: aload 0
      // 12a: getfield q3g.khm Ljava/nio/IntBuffer;
      // 12d: iload 14
      // 12f: iload 9
      // 131: imul
      // 132: iload 9
      // 134: iadd
      // 135: invokevirtual java/nio/IntBuffer.limit (I)Ljava/nio/Buffer;
      // 138: pop
      // 139: aload 0
      // 13a: getfield q3g.khm Ljava/nio/IntBuffer;
      // 13d: iload 14
      // 13f: iload 9
      // 141: imul
      // 142: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 145: pop
      // 146: aload 0
      // 147: getfield q3g.khm Ljava/nio/IntBuffer;
      // 14a: invokevirtual java/nio/IntBuffer.slice ()Ljava/nio/IntBuffer;
      // 14d: astore 15
      // 14f: aload 0
      // 150: getfield q3g.khm Ljava/nio/IntBuffer;
      // 153: iload 13
      // 155: iload 9
      // 157: imul
      // 158: iload 9
      // 15a: iadd
      // 15b: invokevirtual java/nio/IntBuffer.limit (I)Ljava/nio/Buffer;
      // 15e: pop
      // 15f: aload 0
      // 160: getfield q3g.khm Ljava/nio/IntBuffer;
      // 163: iload 13
      // 165: iload 9
      // 167: imul
      // 168: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 16b: pop
      // 16c: aload 0
      // 16d: getfield q3g.khm Ljava/nio/IntBuffer;
      // 170: aload 15
      // 172: invokevirtual java/nio/IntBuffer.put (Ljava/nio/IntBuffer;)Ljava/nio/IntBuffer;
      // 175: pop
      // 176: aload 8
      // 178: iload 13
      // 17a: invokevirtual java/util/BitSet.set (I)V
      // 17d: iload 14
      // 17f: istore 13
      // 181: aload 7
      // 183: iload 14
      // 185: aaload
      // 186: invokevirtual java/lang/Integer.intValue ()I
      // 189: istore 14
      // 18b: iload 4
      // 18d: ifeq 1b9
      // 190: iload 4
      // 192: ifne 122
      // 195: goto 19c
      // 198: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 19b: athrow
      // 19c: aload 0
      // 19d: getfield q3g.khm Ljava/nio/IntBuffer;
      // 1a0: iload 11
      // 1a2: iload 9
      // 1a4: imul
      // 1a5: iload 9
      // 1a7: iadd
      // 1a8: invokevirtual java/nio/IntBuffer.limit (I)Ljava/nio/Buffer;
      // 1ab: pop
      // 1ac: aload 0
      // 1ad: getfield q3g.khm Ljava/nio/IntBuffer;
      // 1b0: iload 11
      // 1b2: iload 9
      // 1b4: imul
      // 1b5: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 1b8: pop
      // 1b9: aload 0
      // 1ba: getfield q3g.khm Ljava/nio/IntBuffer;
      // 1bd: aload 10
      // 1bf: invokevirtual java/nio/IntBuffer.put ([I)Ljava/nio/IntBuffer;
      // 1c2: pop
      // 1c3: aload 8
      // 1c5: iload 11
      // 1c7: invokevirtual java/util/BitSet.set (I)V
      // 1ca: iinc 11 1
      // 1cd: iload 4
      // 1cf: ifne 0b4
      // 1d2: aload 0
      // 1d3: getfield q3g.khm Ljava/nio/IntBuffer;
      // 1d6: aload 0
      // 1d7: getfield q3g.khm Ljava/nio/IntBuffer;
      // 1da: invokevirtual java/nio/IntBuffer.capacity ()I
      // 1dd: invokevirtual java/nio/IntBuffer.limit (I)Ljava/nio/Buffer;
      // 1e0: pop
      // 1e1: aload 0
      // 1e2: getfield q3g.khm Ljava/nio/IntBuffer;
      // 1e5: aload 0
      // 1e6: invokevirtual q3g.py3 ()I
      // 1e9: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 1ec: pop
      // 1ed: aload 0
      // 1ee: getfield q3g._vb [Lsla;
      // 1f1: iload 4
      // 1f3: ifeq 210
      // 1f6: ifnull 262
      // 1f9: goto 200
      // 1fc: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1ff: athrow
      // 200: aload 0
      // 201: getfield q3g.gb0 I
      // 204: bipush 4
      // 205: goto 20c
      // 208: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20b: athrow
      // 20c: idiv
      // 20d: anewarray 194
      // 210: astore 11
      // 212: aload 0
      // 213: getfield q3g.xfj Lbe7;
      // 216: invokevirtual be7.vy7 ()I
      // 219: bipush 4
      // 21a: idiv
      // 21b: bipush 4
      // 21c: imul
      // 21d: istore 12
      // 21f: bipush 0
      // 220: istore 13
      // 222: iload 13
      // 224: aload 7
      // 226: arraylength
      // 227: if_icmpge 254
      // 22a: aload 7
      // 22c: iload 13
      // 22e: aaload
      // 22f: invokevirtual java/lang/Integer.intValue ()I
      // 232: istore 14
      // 234: aload 11
      // 236: iload 13
      // 238: aload 0
      // 239: getfield q3g._vb [Lsla;
      // 23c: iload 14
      // 23e: aaload
      // 23f: aastore
      // 240: iinc 13 1
      // 243: iload 4
      // 245: ifeq 262
      // 248: iload 4
      // 24a: ifne 222
      // 24d: goto 254
      // 250: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 253: athrow
      // 254: aload 11
      // 256: bipush 0
      // 257: aload 0
      // 258: getfield q3g._vb [Lsla;
      // 25b: bipush 0
      // 25c: aload 11
      // 25e: arraylength
      // 25f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 262: return
   }

   public q3g$szd rh0() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield q3g.khm Ljava/nio/IntBuffer;
      // 04: invokevirtual java/nio/IntBuffer.rewind ()Ljava/nio/Buffer;
      // 07: pop
      // 08: invokestatic t9d.c ()I
      // 0b: aload 0
      // 0c: invokevirtual q3g.py3 ()I
      // 0f: istore 2
      // 10: aload 0
      // 11: getfield q3g.khm Ljava/nio/IntBuffer;
      // 14: iload 2
      // 15: invokevirtual java/nio/IntBuffer.limit (I)Ljava/nio/Buffer;
      // 18: pop
      // 19: istore 1
      // 1a: iload 2
      // 1b: newarray 10
      // 1d: astore 3
      // 1e: aload 0
      // 1f: getfield q3g.khm Ljava/nio/IntBuffer;
      // 22: aload 3
      // 23: invokevirtual java/nio/IntBuffer.get ([I)Ljava/nio/IntBuffer;
      // 26: pop
      // 27: aload 0
      // 28: getfield q3g.khm Ljava/nio/IntBuffer;
      // 2b: aload 0
      // 2c: getfield q3g.khm Ljava/nio/IntBuffer;
      // 2f: invokevirtual java/nio/IntBuffer.capacity ()I
      // 32: invokevirtual java/nio/IntBuffer.limit (I)Ljava/nio/Buffer;
      // 35: pop
      // 36: aload 0
      // 37: getfield q3g.khm Ljava/nio/IntBuffer;
      // 3a: iload 2
      // 3b: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 3e: pop
      // 3f: aconst_null
      // 40: astore 4
      // 42: aload 0
      // 43: iload 1
      // 44: ifne 5c
      // 47: getfield q3g._vb [Lsla;
      // 4a: ifnull 77
      // 4d: goto 54
      // 50: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 53: athrow
      // 54: aload 0
      // 55: goto 5c
      // 58: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5b: athrow
      // 5c: getfield q3g.gb0 I
      // 5f: bipush 4
      // 60: idiv
      // 61: istore 5
      // 63: iload 5
      // 65: anewarray 194
      // 68: astore 4
      // 6a: aload 0
      // 6b: getfield q3g._vb [Lsla;
      // 6e: bipush 0
      // 6f: aload 4
      // 71: bipush 0
      // 72: iload 5
      // 74: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 77: new q3g$szd
      // 7a: dup
      // 7b: aload 0
      // 7c: aload 3
      // 7d: new be7
      // 80: dup
      // 81: aload 0
      // 82: getfield q3g.xfj Lbe7;
      // 85: invokespecial be7.<init> (Lbe7;)V
      // 88: aload 4
      // 8a: invokespecial q3g$szd.<init> (Lq3g;[ILbe7;[Lsla;)V
      // 8d: areturn
   }

   public int py3() {
      return this.gb0 * this.xfj.olc();
   }

   private static float qek(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5) {
      float var6 = var0.get(var5 + var4 * 0 + 0);
      float var7 = var0.get(var5 + var4 * 0 + 1);
      float var8 = var0.get(var5 + var4 * 0 + 2);
      float var9 = var0.get(var5 + var4 * 1 + 0);
      float var10 = var0.get(var5 + var4 * 1 + 1);
      float var11 = var0.get(var5 + var4 * 1 + 2);
      float var12 = var0.get(var5 + var4 * 2 + 0);
      float var13 = var0.get(var5 + var4 * 2 + 1);
      float var14 = var0.get(var5 + var4 * 2 + 2);
      float var15 = var0.get(var5 + var4 * 3 + 0);
      float var16 = var0.get(var5 + var4 * 3 + 1);
      float var17 = var0.get(var5 + var4 * 3 + 2);
      float var18 = (var6 + var9 + var12 + var15) * 0.25F - var1;
      float var19 = (var7 + var10 + var13 + var16) * 0.25F - var2;
      float var20 = (var8 + var11 + var14 + var17) * 0.25F - var3;
      return var18 * var18 + var19 * var19 + var20 * var20;
   }

   public void v1_(q3g$szd param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield q3g.khm Ljava/nio/IntBuffer;
      // 04: invokevirtual java/nio/IntBuffer.clear ()Ljava/nio/Buffer;
      // 07: pop
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual q3g$szd.afe ()[I
      // 0d: arraylength
      // 0e: invokespecial q3g.duc (I)V
      // 11: invokestatic t9d.b ()I
      // 14: aload 0
      // 15: getfield q3g.khm Ljava/nio/IntBuffer;
      // 18: aload 1
      // 19: invokevirtual q3g$szd.afe ()[I
      // 1c: invokevirtual java/nio/IntBuffer.put ([I)Ljava/nio/IntBuffer;
      // 1f: pop
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual q3g$szd.ap4 ()I
      // 25: putfield q3g.gb0 I
      // 28: aload 0
      // 29: new be7
      // 2c: dup
      // 2d: aload 1
      // 2e: invokevirtual q3g$szd.fii ()Lbe7;
      // 31: invokespecial be7.<init> (Lbe7;)V
      // 34: putfield q3g.xfj Lbe7;
      // 37: istore 2
      // 38: aload 1
      // 39: invokestatic q3g$szd.pil (Lq3g$szd;)[Lsla;
      // 3c: iload 2
      // 3d: ifeq df
      // 40: ifnull c9
      // 43: goto 4a
      // 46: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield q3g._vb [Lsla;
      // 4e: iload 2
      // 4f: ifeq 81
      // 52: goto 59
      // 55: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 58: athrow
      // 59: ifnonnull 72
      // 5c: goto 63
      // 5f: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 62: athrow
      // 63: aload 0
      // 64: aload 0
      // 65: getfield q3g.cwr [Lsla;
      // 68: putfield q3g._vb [Lsla;
      // 6b: goto 72
      // 6e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 71: athrow
      // 72: aload 0
      // 73: iload 2
      // 74: ifeq aa
      // 77: getfield q3g._vb [Lsla;
      // 7a: goto 81
      // 7d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 80: athrow
      // 81: ifnull a2
      // 84: aload 0
      // 85: getfield q3g._vb [Lsla;
      // 88: iload 2
      // 89: ifeq b8
      // 8c: goto 93
      // 8f: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 92: athrow
      // 93: arraylength
      // 94: aload 0
      // 95: invokespecial q3g.xh7 ()I
      // 98: if_icmpge b4
      // 9b: goto a2
      // 9e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a1: athrow
      // a2: aload 0
      // a3: goto aa
      // a6: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a9: athrow
      // aa: aload 0
      // ab: invokespecial q3g.xh7 ()I
      // ae: anewarray 194
      // b1: putfield q3g._vb [Lsla;
      // b4: aload 1
      // b5: invokestatic q3g$szd.pil (Lq3g$szd;)[Lsla;
      // b8: astore 3
      // b9: aload 3
      // ba: bipush 0
      // bb: aload 0
      // bc: getfield q3g._vb [Lsla;
      // bf: bipush 0
      // c0: aload 3
      // c1: arraylength
      // c2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // c5: iload 2
      // c6: ifne f6
      // c9: aload 0
      // ca: iload 2
      // cb: ifeq f2
      // ce: goto d5
      // d1: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // d4: athrow
      // d5: getfield q3g._vb [Lsla;
      // d8: goto df
      // db: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // de: athrow
      // df: ifnull f1
      // e2: aload 0
      // e3: aload 0
      // e4: getfield q3g._vb [Lsla;
      // e7: putfield q3g.cwr [Lsla;
      // ea: goto f1
      // ed: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // f0: athrow
      // f1: aload 0
      // f2: aconst_null
      // f3: putfield q3g._vb [Lsla;
      // f6: return
   }

   public void wcp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: putfield q3g.gb0 I
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: aconst_null
      // 0a: putfield q3g.p0d Ln0i;
      // 0d: aload 0
      // 0e: bipush 0
      // 0f: putfield q3g.uwp I
      // 12: istore 1
      // 13: aload 0
      // 14: iload 1
      // 15: ifne 64
      // 18: aconst_null
      // 19: putfield q3g.ob1 Lsla;
      // 1c: invokestatic net/optifine/SmartAnimations.isActive ()Z
      // 1f: ifeq 5c
      // 22: goto 29
      // 25: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 28: athrow
      // 29: aload 0
      // 2a: getfield q3g.fho Ljava/util/BitSet;
      // 2d: iload 1
      // 2e: ifne 55
      // 31: goto 38
      // 34: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 37: athrow
      // 38: ifnonnull 51
      // 3b: goto 42
      // 3e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 41: athrow
      // 42: aload 0
      // 43: aload 0
      // 44: getfield q3g.piy Ljava/util/BitSet;
      // 47: putfield q3g.fho Ljava/util/BitSet;
      // 4a: goto 51
      // 4d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 50: athrow
      // 51: aload 0
      // 52: getfield q3g.fho Ljava/util/BitSet;
      // 55: invokevirtual java/util/BitSet.clear ()V
      // 58: iload 1
      // 59: ifeq 81
      // 5c: aload 0
      // 5d: goto 64
      // 60: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 63: athrow
      // 64: iload 1
      // 65: ifne 82
      // 68: getfield q3g.fho Ljava/util/BitSet;
      // 6b: ifnull 81
      // 6e: goto 75
      // 71: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 74: athrow
      // 75: aload 0
      // 76: aconst_null
      // 77: putfield q3g.fho Ljava/util/BitSet;
      // 7a: goto 81
      // 7d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 80: athrow
      // 81: aload 0
      // 82: bipush 0
      // 83: putfield q3g.r7b Z
      // 86: return
   }

   public void ezr(int param1, be7 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic q3g.a J
      // 003: ldc2_w 12658345109486
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: getfield q3g.af3 Z
      // 011: iload 5
      // 013: ifne 070
      // 016: ifeq 03a
      // 019: goto 020
      // 01c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 01f: athrow
      // 020: new java/lang/IllegalStateException
      // 023: dup
      // 024: sipush 21675
      // 027: ldc2_w 1427047181830423131
      // 02a: lload 3
      // 02b: lxor
      // 02c: invokedynamic p (IJ)Ljava/lang/String; bsm=q3g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 035: athrow
      // 036: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 039: athrow
      // 03a: aload 0
      // 03b: bipush 1
      // 03c: putfield q3g.af3 Z
      // 03f: aload 0
      // 040: invokevirtual q3g.wcp ()V
      // 043: aload 0
      // 044: iload 1
      // 045: putfield q3g.msu I
      // 048: aload 0
      // 049: aload 2
      // 04a: putfield q3g.xfj Lbe7;
      // 04d: aload 0
      // 04e: aload 2
      // 04f: aload 0
      // 050: getfield q3g.uwp I
      // 053: invokevirtual be7.c8h (I)Ln0i;
      // 056: putfield q3g.p0d Ln0i;
      // 059: aload 0
      // 05a: bipush 0
      // 05b: putfield q3g.q_4 Z
      // 05e: aload 0
      // 05f: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 062: aload 0
      // 063: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 066: invokevirtual java/nio/ByteBuffer.capacity ()I
      // 069: invokevirtual java/nio/ByteBuffer.limit (I)Ljava/nio/Buffer;
      // 06c: pop
      // 06d: invokestatic hxt.ly3 ()Z
      // 070: iload 5
      // 072: ifne 08d
      // 075: ifeq 08a
      // 078: goto 07f
      // 07b: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07e: athrow
      // 07f: aload 0
      // 080: invokestatic net/optifine/shaders/SVertexBuilder.endSetVertexFormat (Lq3g;)V
      // 083: goto 08a
      // 086: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 089: athrow
      // 08a: invokestatic hxt.jty ()Z
      // 08d: ifeq 11c
      // 090: aload 0
      // 091: iload 5
      // 093: ifne 0b2
      // 096: goto 09d
      // 099: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 09c: athrow
      // 09d: getfield q3g.k1w Lw51;
      // 0a0: ifnull 14a
      // 0a3: goto 0aa
      // 0a6: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: goto 0b2
      // 0ae: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b1: athrow
      // 0b2: getfield q3g._vb [Lsla;
      // 0b5: iload 5
      // 0b7: ifne 0e3
      // 0ba: ifnonnull 0d3
      // 0bd: goto 0c4
      // 0c0: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: aload 0
      // 0c6: getfield q3g.cwr [Lsla;
      // 0c9: putfield q3g._vb [Lsla;
      // 0cc: goto 0d3
      // 0cf: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: iload 5
      // 0d6: ifne 10d
      // 0d9: getfield q3g._vb [Lsla;
      // 0dc: goto 0e3
      // 0df: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e2: athrow
      // 0e3: ifnull 105
      // 0e6: aload 0
      // 0e7: iload 5
      // 0e9: ifne 10d
      // 0ec: goto 0f3
      // 0ef: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f2: athrow
      // 0f3: getfield q3g._vb [Lsla;
      // 0f6: arraylength
      // 0f7: aload 0
      // 0f8: invokespecial q3g.xh7 ()I
      // 0fb: if_icmpge 14a
      // 0fe: goto 105
      // 101: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 104: athrow
      // 105: aload 0
      // 106: goto 10d
      // 109: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10c: athrow
      // 10d: aload 0
      // 10e: invokespecial q3g.xh7 ()I
      // 111: anewarray 194
      // 114: putfield q3g._vb [Lsla;
      // 117: iload 5
      // 119: ifeq 14a
      // 11c: aload 0
      // 11d: iload 5
      // 11f: ifne 146
      // 122: goto 129
      // 125: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 128: athrow
      // 129: getfield q3g._vb [Lsla;
      // 12c: ifnull 145
      // 12f: goto 136
      // 132: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 135: athrow
      // 136: aload 0
      // 137: aload 0
      // 138: getfield q3g._vb [Lsla;
      // 13b: putfield q3g.cwr [Lsla;
      // 13e: goto 145
      // 141: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 144: athrow
      // 145: aload 0
      // 146: aconst_null
      // 147: putfield q3g._vb [Lsla;
      // 14a: return
   }

   public q3g h0a(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: aload 0
      // 006: iload 5
      // 008: ifne 058
      // 00b: getfield q3g.ob1 Lsla;
      // 00e: ifnull 057
      // 011: goto 018
      // 014: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 017: athrow
      // 018: aload 0
      // 019: iload 5
      // 01b: ifne 058
      // 01e: goto 025
      // 021: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 024: athrow
      // 025: getfield q3g._vb [Lsla;
      // 028: ifnull 057
      // 02b: goto 032
      // 02e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 031: athrow
      // 032: aload 0
      // 033: getfield q3g.ob1 Lsla;
      // 036: dload 1
      // 037: d2f
      // 038: invokevirtual sla.hs3 (F)F
      // 03b: f2d
      // 03c: dstore 1
      // 03d: aload 0
      // 03e: getfield q3g.ob1 Lsla;
      // 041: dload 3
      // 042: d2f
      // 043: invokevirtual sla.nkj (F)F
      // 046: f2d
      // 047: dstore 3
      // 048: aload 0
      // 049: getfield q3g._vb [Lsla;
      // 04c: aload 0
      // 04d: getfield q3g.gb0 I
      // 050: bipush 4
      // 051: idiv
      // 052: aload 0
      // 053: getfield q3g.ob1 Lsla;
      // 056: aastore
      // 057: aload 0
      // 058: getfield q3g.gb0 I
      // 05b: aload 0
      // 05c: getfield q3g.xfj Lbe7;
      // 05f: invokevirtual be7.vy7 ()I
      // 062: imul
      // 063: aload 0
      // 064: getfield q3g.xfj Lbe7;
      // 067: aload 0
      // 068: getfield q3g.uwp I
      // 06b: invokevirtual be7.ydd (I)I
      // 06e: iadd
      // 06f: istore 6
      // 071: iload 5
      // 073: ifne 14f
      // 076: getstatic q3g$2.bfl [I
      // 079: aload 0
      // 07a: getfield q3g.p0d Ln0i;
      // 07d: invokevirtual n0i.__g ()Ln0i$p_w;
      // 080: invokevirtual n0i$p_w.ordinal ()I
      // 083: iaload
      // 084: tableswitch 199 1 7 48 86 86 124 124 164 164
      // 0b0: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0b8: iload 6
      // 0ba: dload 1
      // 0bb: d2f
      // 0bc: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0bf: pop
      // 0c0: aload 0
      // 0c1: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0c4: iload 6
      // 0c6: bipush 4
      // 0c7: iadd
      // 0c8: dload 3
      // 0c9: d2f
      // 0ca: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0cd: pop
      // 0ce: iload 5
      // 0d0: ifeq 14b
      // 0d3: goto 0da
      // 0d6: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0de: iload 6
      // 0e0: dload 1
      // 0e1: d2i
      // 0e2: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 0e5: pop
      // 0e6: aload 0
      // 0e7: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0ea: iload 6
      // 0ec: bipush 4
      // 0ed: iadd
      // 0ee: dload 3
      // 0ef: d2i
      // 0f0: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 0f3: pop
      // 0f4: iload 5
      // 0f6: ifeq 14b
      // 0f9: goto 100
      // 0fc: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0ff: athrow
      // 100: aload 0
      // 101: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 104: iload 6
      // 106: dload 3
      // 107: d2i
      // 108: i2s
      // 109: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 10c: pop
      // 10d: aload 0
      // 10e: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 111: iload 6
      // 113: bipush 2
      // 114: iadd
      // 115: dload 1
      // 116: d2i
      // 117: i2s
      // 118: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 11b: pop
      // 11c: iload 5
      // 11e: ifeq 14b
      // 121: goto 128
      // 124: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 127: athrow
      // 128: aload 0
      // 129: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 12c: iload 6
      // 12e: dload 3
      // 12f: d2i
      // 130: i2b
      // 131: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 134: pop
      // 135: aload 0
      // 136: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 139: iload 6
      // 13b: bipush 1
      // 13c: iadd
      // 13d: dload 1
      // 13e: d2i
      // 13f: i2b
      // 140: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 143: pop
      // 144: goto 14b
      // 147: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 14a: athrow
      // 14b: aload 0
      // 14c: invokespecial q3g.izw ()V
      // 14f: aload 0
      // 150: areturn
   }

   public q3g iu0(int param1, int param2) {
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
      // 05: getfield q3g.gb0 I
      // 08: aload 0
      // 09: getfield q3g.xfj Lbe7;
      // 0c: invokevirtual be7.vy7 ()I
      // 0f: imul
      // 10: aload 0
      // 11: getfield q3g.xfj Lbe7;
      // 14: aload 0
      // 15: getfield q3g.uwp I
      // 18: invokevirtual be7.ydd (I)I
      // 1b: iadd
      // 1c: istore 4
      // 1e: iload 3
      // 1f: ifeq f2
      // 22: getstatic q3g$2.bfl [I
      // 25: aload 0
      // 26: getfield q3g.p0d Ln0i;
      // 29: invokevirtual n0i.__g ()Ln0i$p_w;
      // 2c: invokevirtual n0i$p_w.ordinal ()I
      // 2f: iaload
      // 30: tableswitch 190 1 7 48 85 85 120 120 157 157
      // 5c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5f: athrow
      // 60: aload 0
      // 61: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 64: iload 4
      // 66: iload 1
      // 67: i2f
      // 68: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 6b: pop
      // 6c: aload 0
      // 6d: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 70: iload 4
      // 72: bipush 4
      // 73: iadd
      // 74: iload 2
      // 75: i2f
      // 76: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 79: pop
      // 7a: iload 3
      // 7b: ifne ee
      // 7e: goto 85
      // 81: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 84: athrow
      // 85: aload 0
      // 86: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 89: iload 4
      // 8b: iload 1
      // 8c: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 8f: pop
      // 90: aload 0
      // 91: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 94: iload 4
      // 96: bipush 4
      // 97: iadd
      // 98: iload 2
      // 99: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 9c: pop
      // 9d: iload 3
      // 9e: ifne ee
      // a1: goto a8
      // a4: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a7: athrow
      // a8: aload 0
      // a9: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // ac: iload 4
      // ae: iload 2
      // af: i2s
      // b0: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // b3: pop
      // b4: aload 0
      // b5: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // b8: iload 4
      // ba: bipush 2
      // bb: iadd
      // bc: iload 1
      // bd: i2s
      // be: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // c1: pop
      // c2: iload 3
      // c3: ifne ee
      // c6: goto cd
      // c9: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // cc: athrow
      // cd: aload 0
      // ce: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // d1: iload 4
      // d3: iload 2
      // d4: i2b
      // d5: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // d8: pop
      // d9: aload 0
      // da: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // dd: iload 4
      // df: bipush 1
      // e0: iadd
      // e1: iload 1
      // e2: i2b
      // e3: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // e6: pop
      // e7: goto ee
      // ea: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // ed: athrow
      // ee: aload 0
      // ef: invokespecial q3g.izw ()V
      // f2: aload 0
      // f3: areturn
   }

   public void hic(int var1, int var2, int var3, int var4) {
      int var5 = (this.gb0 - 4) * this.xfj.olc() + this.xfj._b0(1) / 4;
      int var6 = this.xfj.vy7() >> 2;
      this.khm.put(var5, var1);
      this.khm.put(var5 + var6, var2);
      this.khm.put(var5 + var6 * 2, var3);
      this.khm.put(var5 + var6 * 3, var4);
   }

   public void em3(double var1, double var3, double var5) {
      int var8 = this.xfj.olc();
      int var10000 = t9d.c();
      int var9 = (this.gb0 - 4) * var8;
      int var7 = var10000;
      int var10 = 0;

      while (var10 < 4) {
         int var11 = var9 + var10 * var8;
         int var12 = var11 + 1;
         int var13 = var12 + 1;
         this.khm.put(var11, Float.floatToRawIntBits((float)(var1 + this.eyp) + Float.intBitsToFloat(this.khm.get(var11))));
         this.khm.put(var12, Float.floatToRawIntBits((float)(var3 + this.uu5) + Float.intBitsToFloat(this.khm.get(var12))));
         this.khm.put(var13, Float.floatToRawIntBits((float)(var5 + this.yfg) + Float.intBitsToFloat(this.khm.get(var13))));
         var10++;
         if (var7 != 0) {
            break;
         }
      }
   }

   public int a7k(int var1) {
      return ((this.gb0 - var1) * this.xfj.vy7() + this.xfj.t3m()) / 4;
   }

   public void m95(float param1, float param2, float param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 4
      // 03: invokevirtual q3g.a7k (I)I
      // 06: istore 6
      // 08: invokestatic t9d.c ()I
      // 0b: bipush -1
      // 0c: istore 7
      // 0e: istore 5
      // 10: aload 0
      // 11: iload 5
      // 13: ifne e0
      // 16: getfield q3g.q_4 Z
      // 19: ifne df
      // 1c: goto 23
      // 1f: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield q3g.khm Ljava/nio/IntBuffer;
      // 27: iload 6
      // 29: invokevirtual java/nio/IntBuffer.get (I)I
      // 2c: iload 5
      // 2e: ifne a1
      // 31: goto 38
      // 34: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 37: athrow
      // 38: istore 7
      // 3a: invokestatic java/nio/ByteOrder.nativeOrder ()Ljava/nio/ByteOrder;
      // 3d: getstatic java/nio/ByteOrder.LITTLE_ENDIAN Ljava/nio/ByteOrder;
      // 40: if_acmpne 8d
      // 43: iload 7
      // 45: sipush 255
      // 48: iand
      // 49: i2f
      // 4a: fload 1
      // 4b: fmul
      // 4c: f2i
      // 4d: istore 8
      // 4f: iload 7
      // 51: bipush 8
      // 53: ishr
      // 54: sipush 255
      // 57: iand
      // 58: i2f
      // 59: fload 2
      // 5a: fmul
      // 5b: f2i
      // 5c: istore 9
      // 5e: iload 7
      // 60: bipush 16
      // 62: ishr
      // 63: sipush 255
      // 66: iand
      // 67: i2f
      // 68: fload 3
      // 69: fmul
      // 6a: f2i
      // 6b: istore 10
      // 6d: iload 7
      // 6f: ldc -16777216
      // 71: nop
      // 72: iand
      // 73: istore 7
      // 75: iload 7
      // 77: iload 10
      // 79: bipush 16
      // 7b: ishl
      // 7c: ior
      // 7d: iload 9
      // 7f: bipush 8
      // 81: ishl
      // 82: ior
      // 83: iload 8
      // 85: ior
      // 86: istore 7
      // 88: iload 5
      // 8a: ifeq df
      // 8d: iload 7
      // 8f: bipush 24
      // 91: ishr
      // 92: sipush 255
      // 95: iand
      // 96: i2f
      // 97: fload 1
      // 98: fmul
      // 99: f2i
      // 9a: goto a1
      // 9d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a0: athrow
      // a1: istore 8
      // a3: iload 7
      // a5: bipush 16
      // a7: ishr
      // a8: sipush 255
      // ab: iand
      // ac: i2f
      // ad: fload 2
      // ae: fmul
      // af: f2i
      // b0: istore 9
      // b2: iload 7
      // b4: bipush 8
      // b6: ishr
      // b7: sipush 255
      // ba: iand
      // bb: i2f
      // bc: fload 3
      // bd: fmul
      // be: f2i
      // bf: istore 10
      // c1: iload 7
      // c3: sipush 255
      // c6: iand
      // c7: istore 7
      // c9: iload 7
      // cb: iload 8
      // cd: bipush 24
      // cf: ishl
      // d0: ior
      // d1: iload 9
      // d3: bipush 16
      // d5: ishl
      // d6: ior
      // d7: iload 10
      // d9: bipush 8
      // db: ishl
      // dc: ior
      // dd: istore 7
      // df: aload 0
      // e0: getfield q3g.khm Ljava/nio/IntBuffer;
      // e3: iload 6
      // e5: iload 7
      // e7: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // ea: pop
      // eb: return
   }

   private void id5(int var1, int var2) {
      int var3 = this.a7k(var2);
      int var4 = var1 >> 16 & 0xFF;
      int var5 = var1 >> 8 & 0xFF;
      int var6 = var1 & 0xFF;
      int var7 = var1 >> 24 & 0xFF;
      this.ixl(var3, var4, var5, var6, var7);
   }

   public void qx9(float var1, float var2, float var3, int var4) {
      int var5 = this.a7k(var4);
      int var6 = fe6.faa((int)(var1 * 255.0F), 0, 255);
      int var7 = fe6.faa((int)(var2 * 255.0F), 0, 255);
      int var8 = fe6.faa((int)(var3 * 255.0F), 0, 255);
      this.ixl(var5, var6, var7, var8, 255);
   }

   public void ixl(int param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 6
      // 05: invokestatic java/nio/ByteOrder.nativeOrder ()Ljava/nio/ByteOrder;
      // 08: getstatic java/nio/ByteOrder.LITTLE_ENDIAN Ljava/nio/ByteOrder;
      // 0b: if_acmpne 35
      // 0e: aload 0
      // 0f: getfield q3g.khm Ljava/nio/IntBuffer;
      // 12: iload 1
      // 13: iload 5
      // 15: bipush 24
      // 17: ishl
      // 18: iload 4
      // 1a: bipush 16
      // 1c: ishl
      // 1d: ior
      // 1e: iload 3
      // 1f: bipush 8
      // 21: ishl
      // 22: ior
      // 23: iload 2
      // 24: ior
      // 25: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // 28: pop
      // 29: iload 6
      // 2b: ifne 57
      // 2e: goto 35
      // 31: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 34: athrow
      // 35: aload 0
      // 36: getfield q3g.khm Ljava/nio/IntBuffer;
      // 39: iload 1
      // 3a: iload 2
      // 3b: bipush 24
      // 3d: ishl
      // 3e: iload 3
      // 3f: bipush 16
      // 41: ishl
      // 42: ior
      // 43: iload 4
      // 45: bipush 8
      // 47: ishl
      // 48: ior
      // 49: iload 5
      // 4b: ior
      // 4c: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // 4f: pop
      // 50: goto 57
      // 53: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 56: athrow
      // 57: return
   }

   public void ndp() {
      this.q_4 = true;
   }

   public q3g gs4(float var1, float var2, float var3, float var4) {
      return this.fje((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   public q3g fje(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 5
      // 005: aload 0
      // 006: getfield q3g.q_4 Z
      // 009: iload 5
      // 00b: ifne 036
      // 00e: ifeq 01e
      // 011: goto 018
      // 014: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 017: athrow
      // 018: aload 0
      // 019: areturn
      // 01a: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 01d: athrow
      // 01e: aload 0
      // 01f: getfield q3g.gb0 I
      // 022: aload 0
      // 023: getfield q3g.xfj Lbe7;
      // 026: invokevirtual be7.vy7 ()I
      // 029: imul
      // 02a: aload 0
      // 02b: getfield q3g.xfj Lbe7;
      // 02e: aload 0
      // 02f: getfield q3g.uwp I
      // 032: invokevirtual be7.ydd (I)I
      // 035: iadd
      // 036: istore 6
      // 038: iload 5
      // 03a: ifne 1eb
      // 03d: getstatic q3g$2.bfl [I
      // 040: aload 0
      // 041: getfield q3g.p0d Ln0i;
      // 044: invokevirtual n0i.__g ()Ln0i$p_w;
      // 047: invokevirtual n0i$p_w.ordinal ()I
      // 04a: iaload
      // 04b: tableswitch 412 1 7 45 130 130 199 199 267 267
      // 074: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 077: athrow
      // 078: aload 0
      // 079: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 07c: iload 6
      // 07e: iload 1
      // 07f: i2f
      // 080: ldc 255.0
      // 082: nop
      // 083: fdiv
      // 084: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 087: pop
      // 088: aload 0
      // 089: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 08c: iload 6
      // 08e: bipush 4
      // 08f: iadd
      // 090: iload 2
      // 091: i2f
      // 092: ldc 255.0
      // 094: nop
      // 095: fdiv
      // 096: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 099: pop
      // 09a: aload 0
      // 09b: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 09e: iload 6
      // 0a0: bipush 8
      // 0a2: iadd
      // 0a3: iload 3
      // 0a4: i2f
      // 0a5: ldc 255.0
      // 0a7: nop
      // 0a8: fdiv
      // 0a9: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0ac: pop
      // 0ad: aload 0
      // 0ae: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0b1: iload 6
      // 0b3: bipush 12
      // 0b5: iadd
      // 0b6: iload 4
      // 0b8: i2f
      // 0b9: ldc 255.0
      // 0bb: nop
      // 0bc: fdiv
      // 0bd: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0c0: pop
      // 0c1: iload 5
      // 0c3: ifeq 1e7
      // 0c6: goto 0cd
      // 0c9: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0d1: iload 6
      // 0d3: iload 1
      // 0d4: i2f
      // 0d5: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0d8: pop
      // 0d9: aload 0
      // 0da: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0dd: iload 6
      // 0df: bipush 4
      // 0e0: iadd
      // 0e1: iload 2
      // 0e2: i2f
      // 0e3: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0e6: pop
      // 0e7: aload 0
      // 0e8: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0eb: iload 6
      // 0ed: bipush 8
      // 0ef: iadd
      // 0f0: iload 3
      // 0f1: i2f
      // 0f2: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0f5: pop
      // 0f6: aload 0
      // 0f7: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0fa: iload 6
      // 0fc: bipush 12
      // 0fe: iadd
      // 0ff: iload 4
      // 101: i2f
      // 102: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 105: pop
      // 106: iload 5
      // 108: ifeq 1e7
      // 10b: goto 112
      // 10e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 111: athrow
      // 112: aload 0
      // 113: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 116: iload 6
      // 118: iload 1
      // 119: i2s
      // 11a: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 11d: pop
      // 11e: aload 0
      // 11f: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 122: iload 6
      // 124: bipush 2
      // 125: iadd
      // 126: iload 2
      // 127: i2s
      // 128: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 12b: pop
      // 12c: aload 0
      // 12d: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 130: iload 6
      // 132: bipush 4
      // 133: iadd
      // 134: iload 3
      // 135: i2s
      // 136: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 139: pop
      // 13a: aload 0
      // 13b: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 13e: iload 6
      // 140: bipush 6
      // 142: iadd
      // 143: iload 4
      // 145: i2s
      // 146: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 149: pop
      // 14a: iload 5
      // 14c: ifeq 1e7
      // 14f: goto 156
      // 152: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 155: athrow
      // 156: invokestatic java/nio/ByteOrder.nativeOrder ()Ljava/nio/ByteOrder;
      // 159: getstatic java/nio/ByteOrder.LITTLE_ENDIAN Ljava/nio/ByteOrder;
      // 15c: if_acmpne 1a9
      // 15f: goto 166
      // 162: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 165: athrow
      // 166: aload 0
      // 167: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 16a: iload 6
      // 16c: iload 1
      // 16d: i2b
      // 16e: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 171: pop
      // 172: aload 0
      // 173: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 176: iload 6
      // 178: bipush 1
      // 179: iadd
      // 17a: iload 2
      // 17b: i2b
      // 17c: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 17f: pop
      // 180: aload 0
      // 181: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 184: iload 6
      // 186: bipush 2
      // 187: iadd
      // 188: iload 3
      // 189: i2b
      // 18a: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 18d: pop
      // 18e: aload 0
      // 18f: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 192: iload 6
      // 194: bipush 3
      // 195: iadd
      // 196: iload 4
      // 198: i2b
      // 199: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 19c: pop
      // 19d: iload 5
      // 19f: ifeq 1e7
      // 1a2: goto 1a9
      // 1a5: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 1ad: iload 6
      // 1af: iload 4
      // 1b1: i2b
      // 1b2: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 1b5: pop
      // 1b6: aload 0
      // 1b7: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 1ba: iload 6
      // 1bc: bipush 1
      // 1bd: iadd
      // 1be: iload 3
      // 1bf: i2b
      // 1c0: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 1c3: pop
      // 1c4: aload 0
      // 1c5: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 1c8: iload 6
      // 1ca: bipush 2
      // 1cb: iadd
      // 1cc: iload 2
      // 1cd: i2b
      // 1ce: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 1d1: pop
      // 1d2: aload 0
      // 1d3: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 1d6: iload 6
      // 1d8: bipush 3
      // 1d9: iadd
      // 1da: iload 1
      // 1db: i2b
      // 1dc: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 1df: pop
      // 1e0: goto 1e7
      // 1e3: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1e6: athrow
      // 1e7: aload 0
      // 1e8: invokespecial q3g.izw ()V
      // 1eb: aload 0
      // 1ec: areturn
   }

   public void sug(int[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: invokestatic hxt.ly3 ()Z
      // 07: iload 2
      // 08: ifne 5d
      // 0b: ifeq 21
      // 0e: goto 15
      // 11: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: invokestatic net/optifine/shaders/SVertexBuilder.beginAddVertexData (Lq3g;[I)V
      // 1a: goto 21
      // 1d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20: athrow
      // 21: aload 0
      // 22: aload 1
      // 23: arraylength
      // 24: invokespecial q3g.duc (I)V
      // 27: aload 0
      // 28: getfield q3g.khm Ljava/nio/IntBuffer;
      // 2b: aload 0
      // 2c: invokevirtual q3g.py3 ()I
      // 2f: invokevirtual java/nio/IntBuffer.position (I)Ljava/nio/Buffer;
      // 32: pop
      // 33: aload 0
      // 34: getfield q3g.khm Ljava/nio/IntBuffer;
      // 37: aload 1
      // 38: invokevirtual java/nio/IntBuffer.put ([I)Ljava/nio/IntBuffer;
      // 3b: pop
      // 3c: aload 0
      // 3d: iload 2
      // 3e: ifne 61
      // 41: dup
      // 42: getfield q3g.gb0 I
      // 45: aload 1
      // 46: arraylength
      // 47: aload 0
      // 48: getfield q3g.xfj Lbe7;
      // 4b: invokevirtual be7.olc ()I
      // 4e: idiv
      // 4f: iadd
      // 50: putfield q3g.gb0 I
      // 53: invokestatic hxt.ly3 ()Z
      // 56: goto 5d
      // 59: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5c: athrow
      // 5d: ifeq 64
      // 60: aload 0
      // 61: invokestatic net/optifine/shaders/SVertexBuilder.endAddVertexData (Lq3g;)V
      // 64: return
   }

   public void pzw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: getfield q3g.gb0 I
      // 05: bipush 1
      // 06: iadd
      // 07: putfield q3g.gb0 I
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 0
      // 0e: aload 0
      // 0f: getfield q3g.xfj Lbe7;
      // 12: invokevirtual be7.olc ()I
      // 15: invokespecial q3g.duc (I)V
      // 18: aload 0
      // 19: bipush 0
      // 1a: putfield q3g.uwp I
      // 1d: istore 1
      // 1e: aload 0
      // 1f: iload 1
      // 20: ifeq 46
      // 23: aload 0
      // 24: getfield q3g.xfj Lbe7;
      // 27: aload 0
      // 28: getfield q3g.uwp I
      // 2b: invokevirtual be7.c8h (I)Ln0i;
      // 2e: putfield q3g.p0d Ln0i;
      // 31: invokestatic hxt.ly3 ()Z
      // 34: ifeq 49
      // 37: goto 3e
      // 3a: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: goto 46
      // 42: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 45: athrow
      // 46: invokestatic net/optifine/shaders/SVertexBuilder.endAddVertex (Lq3g;)V
      // 49: return
   }

   public q3g g5o(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 7
      // 005: invokestatic hxt.ly3 ()Z
      // 008: iload 7
      // 00a: ifne 03a
      // 00d: ifeq 022
      // 010: goto 017
      // 013: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 016: athrow
      // 017: aload 0
      // 018: invokestatic net/optifine/shaders/SVertexBuilder.beginAddVertex (Lq3g;)V
      // 01b: goto 022
      // 01e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 021: athrow
      // 022: aload 0
      // 023: getfield q3g.gb0 I
      // 026: aload 0
      // 027: getfield q3g.xfj Lbe7;
      // 02a: invokevirtual be7.vy7 ()I
      // 02d: imul
      // 02e: aload 0
      // 02f: getfield q3g.xfj Lbe7;
      // 032: aload 0
      // 033: getfield q3g.uwp I
      // 036: invokevirtual be7.ydd (I)I
      // 039: iadd
      // 03a: istore 8
      // 03c: iload 7
      // 03e: ifne 19c
      // 041: getstatic q3g$2.bfl [I
      // 044: aload 0
      // 045: getfield q3g.p0d Ln0i;
      // 048: invokevirtual n0i.__g ()Ln0i$p_w;
      // 04b: invokevirtual n0i$p_w.ordinal ()I
      // 04e: iaload
      // 04f: tableswitch 329 1 7 45 114 114 192 192 263 263
      // 078: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 080: iload 8
      // 082: dload 1
      // 083: aload 0
      // 084: getfield q3g.eyp D
      // 087: dadd
      // 088: d2f
      // 089: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 08c: pop
      // 08d: aload 0
      // 08e: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 091: iload 8
      // 093: bipush 4
      // 094: iadd
      // 095: dload 3
      // 096: aload 0
      // 097: getfield q3g.uu5 D
      // 09a: dadd
      // 09b: d2f
      // 09c: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 09f: pop
      // 0a0: aload 0
      // 0a1: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0a4: iload 8
      // 0a6: bipush 8
      // 0a8: iadd
      // 0a9: dload 5
      // 0ab: aload 0
      // 0ac: getfield q3g.yfg D
      // 0af: dadd
      // 0b0: d2f
      // 0b1: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 0b4: pop
      // 0b5: iload 7
      // 0b7: ifeq 198
      // 0ba: goto 0c1
      // 0bd: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0c5: iload 8
      // 0c7: dload 1
      // 0c8: aload 0
      // 0c9: getfield q3g.eyp D
      // 0cc: dadd
      // 0cd: d2f
      // 0ce: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 0d1: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 0d4: pop
      // 0d5: aload 0
      // 0d6: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0d9: iload 8
      // 0db: bipush 4
      // 0dc: iadd
      // 0dd: dload 3
      // 0de: aload 0
      // 0df: getfield q3g.uu5 D
      // 0e2: dadd
      // 0e3: d2f
      // 0e4: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 0e7: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 0ea: pop
      // 0eb: aload 0
      // 0ec: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0ef: iload 8
      // 0f1: bipush 8
      // 0f3: iadd
      // 0f4: dload 5
      // 0f6: aload 0
      // 0f7: getfield q3g.yfg D
      // 0fa: dadd
      // 0fb: d2f
      // 0fc: invokestatic java/lang/Float.floatToRawIntBits (F)I
      // 0ff: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 102: pop
      // 103: iload 7
      // 105: ifeq 198
      // 108: goto 10f
      // 10b: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 113: iload 8
      // 115: dload 1
      // 116: aload 0
      // 117: getfield q3g.eyp D
      // 11a: dadd
      // 11b: d2i
      // 11c: i2s
      // 11d: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 120: pop
      // 121: aload 0
      // 122: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 125: iload 8
      // 127: bipush 2
      // 128: iadd
      // 129: dload 3
      // 12a: aload 0
      // 12b: getfield q3g.uu5 D
      // 12e: dadd
      // 12f: d2i
      // 130: i2s
      // 131: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 134: pop
      // 135: aload 0
      // 136: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 139: iload 8
      // 13b: bipush 4
      // 13c: iadd
      // 13d: dload 5
      // 13f: aload 0
      // 140: getfield q3g.yfg D
      // 143: dadd
      // 144: d2i
      // 145: i2s
      // 146: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 149: pop
      // 14a: iload 7
      // 14c: ifeq 198
      // 14f: goto 156
      // 152: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 155: athrow
      // 156: aload 0
      // 157: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 15a: iload 8
      // 15c: dload 1
      // 15d: aload 0
      // 15e: getfield q3g.eyp D
      // 161: dadd
      // 162: d2i
      // 163: i2b
      // 164: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 167: pop
      // 168: aload 0
      // 169: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 16c: iload 8
      // 16e: bipush 1
      // 16f: iadd
      // 170: dload 3
      // 171: aload 0
      // 172: getfield q3g.uu5 D
      // 175: dadd
      // 176: d2i
      // 177: i2b
      // 178: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 17b: pop
      // 17c: aload 0
      // 17d: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 180: iload 8
      // 182: bipush 2
      // 183: iadd
      // 184: dload 5
      // 186: aload 0
      // 187: getfield q3g.yfg D
      // 18a: dadd
      // 18b: d2i
      // 18c: i2b
      // 18d: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 190: pop
      // 191: goto 198
      // 194: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 197: athrow
      // 198: aload 0
      // 199: invokespecial q3g.izw ()V
      // 19c: aload 0
      // 19d: areturn
   }

   public void sk4(float var1, float var2, float var3) {
      int var4 = (byte)((int)(var1 * 127.0F)) & 255;
      int var5 = (byte)((int)(var2 * 127.0F)) & 255;
      int var6 = (byte)((int)(var3 * 127.0F)) & 255;
      int var7 = var4 | var5 << 8 | var6 << 16;
      int var8 = this.xfj.vy7() >> 2;
      int var9 = (this.gb0 - 4) * var8 + this.xfj.tab() / 4;
      this.khm.put(var9, var7);
      this.khm.put(var9 + var8, var7);
      this.khm.put(var9 + var8 * 2, var7);
      this.khm.put(var9 + var8 * 3, var7);
   }

   private void izw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: getfield q3g.uwp I
      // 05: bipush 1
      // 06: iadd
      // 07: putfield q3g.uwp I
      // 0a: aload 0
      // 0b: dup
      // 0c: getfield q3g.uwp I
      // 0f: aload 0
      // 10: getfield q3g.xfj Lbe7;
      // 13: invokevirtual be7.pua ()I
      // 16: irem
      // 17: putfield q3g.uwp I
      // 1a: invokestatic t9d.c ()I
      // 1d: aload 0
      // 1e: aload 0
      // 1f: getfield q3g.xfj Lbe7;
      // 22: aload 0
      // 23: getfield q3g.uwp I
      // 26: invokevirtual be7.c8h (I)Ln0i;
      // 29: putfield q3g.p0d Ln0i;
      // 2c: istore 1
      // 2d: aload 0
      // 2e: iload 1
      // 2f: ifne 4d
      // 32: getfield q3g.p0d Ln0i;
      // 35: invokevirtual n0i.rk2 ()Ln0i$pto;
      // 38: getstatic n0i$pto.ci3 Ln0i$pto;
      // 3b: if_acmpne 50
      // 3e: goto 45
      // 41: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 44: athrow
      // 45: aload 0
      // 46: goto 4d
      // 49: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4c: athrow
      // 4d: invokespecial q3g.izw ()V
      // 50: return
   }

   public q3g h3y(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield q3g.gb0 I
      // 009: aload 0
      // 00a: getfield q3g.xfj Lbe7;
      // 00d: invokevirtual be7.vy7 ()I
      // 010: imul
      // 011: aload 0
      // 012: getfield q3g.xfj Lbe7;
      // 015: aload 0
      // 016: getfield q3g.uwp I
      // 019: invokevirtual be7.ydd (I)I
      // 01c: iadd
      // 01d: istore 5
      // 01f: iload 4
      // 021: ifeq 164
      // 024: getstatic q3g$2.bfl [I
      // 027: aload 0
      // 028: getfield q3g.p0d Ln0i;
      // 02b: invokevirtual n0i.__g ()Ln0i$p_w;
      // 02e: invokevirtual n0i$p_w.ordinal ()I
      // 031: iaload
      // 032: tableswitch 302 1 7 46 96 96 149 149 228 228
      // 05c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 064: iload 5
      // 066: fload 1
      // 067: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 06a: pop
      // 06b: aload 0
      // 06c: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 06f: iload 5
      // 071: bipush 4
      // 072: iadd
      // 073: fload 2
      // 074: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 077: pop
      // 078: aload 0
      // 079: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 07c: iload 5
      // 07e: bipush 8
      // 080: iadd
      // 081: fload 3
      // 082: invokevirtual java/nio/ByteBuffer.putFloat (IF)Ljava/nio/ByteBuffer;
      // 085: pop
      // 086: iload 4
      // 088: ifne 160
      // 08b: goto 092
      // 08e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 091: athrow
      // 092: aload 0
      // 093: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 096: iload 5
      // 098: fload 1
      // 099: f2i
      // 09a: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 09d: pop
      // 09e: aload 0
      // 09f: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0a2: iload 5
      // 0a4: bipush 4
      // 0a5: iadd
      // 0a6: fload 2
      // 0a7: f2i
      // 0a8: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 0ab: pop
      // 0ac: aload 0
      // 0ad: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0b0: iload 5
      // 0b2: bipush 8
      // 0b4: iadd
      // 0b5: fload 3
      // 0b6: f2i
      // 0b7: invokevirtual java/nio/ByteBuffer.putInt (II)Ljava/nio/ByteBuffer;
      // 0ba: pop
      // 0bb: iload 4
      // 0bd: ifne 160
      // 0c0: goto 0c7
      // 0c3: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0cb: iload 5
      // 0cd: fload 1
      // 0ce: ldc 32767.0
      // 0d0: nop
      // 0d1: fmul
      // 0d2: f2i
      // 0d3: ldc 65535
      // 0d5: nop
      // 0d6: iand
      // 0d7: i2s
      // 0d8: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 0db: pop
      // 0dc: aload 0
      // 0dd: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0e0: iload 5
      // 0e2: bipush 2
      // 0e3: iadd
      // 0e4: fload 2
      // 0e5: ldc 32767.0
      // 0e7: nop
      // 0e8: fmul
      // 0e9: f2i
      // 0ea: ldc 65535
      // 0ec: nop
      // 0ed: iand
      // 0ee: i2s
      // 0ef: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 0f2: pop
      // 0f3: aload 0
      // 0f4: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0f7: iload 5
      // 0f9: bipush 4
      // 0fa: iadd
      // 0fb: fload 3
      // 0fc: ldc 32767.0
      // 0fe: nop
      // 0ff: fmul
      // 100: f2i
      // 101: ldc 65535
      // 103: nop
      // 104: iand
      // 105: i2s
      // 106: invokevirtual java/nio/ByteBuffer.putShort (IS)Ljava/nio/ByteBuffer;
      // 109: pop
      // 10a: iload 4
      // 10c: ifne 160
      // 10f: goto 116
      // 112: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 115: athrow
      // 116: aload 0
      // 117: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 11a: iload 5
      // 11c: fload 1
      // 11d: ldc 127.0
      // 11f: nop
      // 120: fmul
      // 121: f2i
      // 122: sipush 255
      // 125: iand
      // 126: i2b
      // 127: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 12a: pop
      // 12b: aload 0
      // 12c: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 12f: iload 5
      // 131: bipush 1
      // 132: iadd
      // 133: fload 2
      // 134: ldc 127.0
      // 136: nop
      // 137: fmul
      // 138: f2i
      // 139: sipush 255
      // 13c: iand
      // 13d: i2b
      // 13e: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 141: pop
      // 142: aload 0
      // 143: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 146: iload 5
      // 148: bipush 2
      // 149: iadd
      // 14a: fload 3
      // 14b: ldc 127.0
      // 14d: nop
      // 14e: fmul
      // 14f: f2i
      // 150: sipush 255
      // 153: iand
      // 154: i2b
      // 155: invokevirtual java/nio/ByteBuffer.put (IB)Ljava/nio/ByteBuffer;
      // 158: pop
      // 159: goto 160
      // 15c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15f: athrow
      // 160: aload 0
      // 161: invokespecial q3g.izw ()V
      // 164: aload 0
      // 165: areturn
   }

   public void nbz(double var1, double var3, double var5) {
      this.eyp = var1;
      this.uu5 = var3;
      this.yfg = var5;
   }

   public void xku() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic q3g.a J
      // 03: ldc2_w 109430074378978
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: iload 3
      // 0e: ifeq 47
      // 11: getfield q3g.af3 Z
      // 14: ifne 38
      // 17: goto 1e
      // 1a: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d: athrow
      // 1e: new java/lang/IllegalStateException
      // 21: dup
      // 22: sipush 30075
      // 25: ldc2_w 3934742525717728896
      // 28: lload 1
      // 29: lxor
      // 2a: invokedynamic p (IJ)Ljava/lang/String; bsm=q3g.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: nop
      // 30: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 33: athrow
      // 34: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 37: athrow
      // 38: aload 0
      // 39: bipush 0
      // 3a: putfield q3g.af3 Z
      // 3d: aload 0
      // 3e: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 41: bipush 0
      // 42: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/Buffer;
      // 45: pop
      // 46: aload 0
      // 47: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 4a: aload 0
      // 4b: invokevirtual q3g.py3 ()I
      // 4e: bipush 4
      // 4f: imul
      // 50: invokevirtual java/nio/ByteBuffer.limit (I)Ljava/nio/Buffer;
      // 53: pop
      // 54: return
   }

   public ByteBuffer m24() {
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
      // 06: ifeq 22
      // 09: getfield q3g.r7b Z
      // 0c: ifeq 21
      // 0f: goto 16
      // 12: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 1a: goto 25
      // 1d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 25: areturn
   }

   public be7 du6() {
      return this.xfj;
   }

   public int yk6() {
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
      // 06: ifeq 27
      // 09: getfield q3g.r7b Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield q3g.gb0 I
      // 1a: bipush 4
      // 1b: idiv
      // 1c: bipush 6
      // 1e: imul
      // 1f: goto 2a
      // 22: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25: athrow
      // 26: aload 0
      // 27: getfield q3g.gb0 I
      // 2a: ireturn
   }

   public int xw4() {
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
      // 05: iload 1
      // 06: ifne 1f
      // 09: getfield q3g.r7b Z
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15: athrow
      // 16: bipush 4
      // 17: goto 22
      // 1a: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield q3g.msu I
      // 22: ireturn
   }

   public void lwd(int var1) {
      int var2 = t9d.b();
      int var3 = 0;

      while (var3 < 4) {
         this.id5(var1, var3 + 1);
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public void ql7(float var1, float var2, float var3) {
      int var4 = t9d.b();
      int var5 = 0;

      while (var5 < 4) {
         this.qx9(var1, var2, var3, var5 + 1);
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   public void kpp(sla param1) {
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
      // 05: iload 2
      // 06: ifne 46
      // 09: getfield q3g.fho Ljava/util/BitSet;
      // 0c: ifnull 45
      // 0f: goto 16
      // 12: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15: athrow
      // 16: aload 1
      // 17: iload 2
      // 18: ifne 2d
      // 1b: goto 22
      // 1e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 21: athrow
      // 22: ifnull 45
      // 25: goto 2c
      // 28: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b: athrow
      // 2c: aload 1
      // 2d: invokevirtual sla.zrf ()I
      // 30: iflt 45
      // 33: aload 0
      // 34: getfield q3g.fho Ljava/util/BitSet;
      // 37: aload 1
      // 38: invokevirtual sla.zrf ()I
      // 3b: invokevirtual java/util/BitSet.set (I)V
      // 3e: goto 45
      // 41: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 44: athrow
      // 45: aload 0
      // 46: iload 2
      // 47: ifne 5f
      // 4a: getfield q3g._vb [Lsla;
      // 4d: ifnull 6e
      // 50: goto 57
      // 53: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 56: athrow
      // 57: aload 0
      // 58: goto 5f
      // 5b: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5e: athrow
      // 5f: getfield q3g.gb0 I
      // 62: bipush 4
      // 63: idiv
      // 64: istore 3
      // 65: aload 0
      // 66: getfield q3g._vb [Lsla;
      // 69: iload 3
      // 6a: bipush 1
      // 6b: isub
      // 6c: aload 1
      // 6d: aastore
      // 6e: return
   }

   public void z_s(sla param1) {
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
      // 06: ifeq 46
      // 09: getfield q3g.fho Ljava/util/BitSet;
      // 0c: ifnull 45
      // 0f: goto 16
      // 12: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15: athrow
      // 16: aload 1
      // 17: iload 2
      // 18: ifeq 2d
      // 1b: goto 22
      // 1e: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 21: athrow
      // 22: ifnull 45
      // 25: goto 2c
      // 28: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b: athrow
      // 2c: aload 1
      // 2d: invokevirtual sla.zrf ()I
      // 30: iflt 45
      // 33: aload 0
      // 34: getfield q3g.fho Ljava/util/BitSet;
      // 37: aload 1
      // 38: invokevirtual sla.zrf ()I
      // 3b: invokevirtual java/util/BitSet.set (I)V
      // 3e: goto 45
      // 41: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 44: athrow
      // 45: aload 0
      // 46: iload 2
      // 47: ifeq 5f
      // 4a: getfield q3g._vb [Lsla;
      // 4d: ifnull 63
      // 50: goto 57
      // 53: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 56: athrow
      // 57: aload 0
      // 58: goto 5f
      // 5b: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 5e: athrow
      // 5f: aload 1
      // 60: putfield q3g.ob1 Lsla;
      // 63: return
   }

   public boolean qq_() {
      try {
         if (this._vb != null) {
            return true;
         }
      } catch (IllegalStateException var1) {
         throw a(var1);
      }

      return false;
   }

   public void max() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield q3g._vb [Lsla;
      // 008: ifnull 128
      // 00b: invokestatic hxt.a59 ()Lc05;
      // 00e: invokevirtual c05.dd_ ()Lyu2;
      // 011: invokevirtual yu2.qzm ()I
      // 014: istore 2
      // 015: aload 0
      // 016: getfield q3g.nhq [Z
      // 019: arraylength
      // 01a: iload 1
      // 01b: ifeq 042
      // 01e: iload 2
      // 01f: if_icmpgt 039
      // 022: goto 029
      // 025: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 028: athrow
      // 029: aload 0
      // 02a: iload 2
      // 02b: bipush 1
      // 02c: iadd
      // 02d: newarray 4
      // 02f: putfield q3g.nhq [Z
      // 032: goto 039
      // 035: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield q3g.nhq [Z
      // 03d: bipush 0
      // 03e: invokestatic java/util/Arrays.fill ([ZZ)V
      // 041: bipush 0
      // 042: istore 3
      // 043: bipush -1
      // 044: istore 4
      // 046: aload 0
      // 047: getfield q3g.gb0 I
      // 04a: bipush 4
      // 04b: idiv
      // 04c: istore 5
      // 04e: bipush 0
      // 04f: istore 6
      // 051: iload 6
      // 053: iload 5
      // 055: if_icmpge 100
      // 058: aload 0
      // 059: getfield q3g._vb [Lsla;
      // 05c: iload 6
      // 05e: aaload
      // 05f: astore 7
      // 061: iload 1
      // 062: ifeq 124
      // 065: iload 1
      // 066: ifeq 0fc
      // 069: goto 070
      // 06c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 06f: athrow
      // 070: aload 7
      // 072: ifnull 0f9
      // 075: goto 07c
      // 078: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07b: athrow
      // 07c: aload 7
      // 07e: invokevirtual sla.y7f ()I
      // 081: istore 8
      // 083: iload 1
      // 084: ifeq 0fc
      // 087: aload 0
      // 088: getfield q3g.nhq [Z
      // 08b: iload 8
      // 08d: baload
      // 08e: ifne 0f9
      // 091: goto 098
      // 094: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 097: athrow
      // 098: aload 7
      // 09a: getstatic net/optifine/util/TextureUtils.iconGrassSideOverlay Lsla;
      // 09d: if_acmpne 0c6
      // 0a0: goto 0a7
      // 0a3: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a6: athrow
      // 0a7: iload 4
      // 0a9: iload 1
      // 0aa: ifeq 0c0
      // 0ad: goto 0b4
      // 0b0: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b3: athrow
      // 0b4: ifge 0f9
      // 0b7: goto 0be
      // 0ba: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0bd: athrow
      // 0be: iload 6
      // 0c0: istore 4
      // 0c2: iload 1
      // 0c3: ifne 0f9
      // 0c6: aload 0
      // 0c7: aload 7
      // 0c9: iload 6
      // 0cb: invokespecial q3g.yzh (Lsla;I)I
      // 0ce: bipush 1
      // 0cf: isub
      // 0d0: istore 6
      // 0d2: iinc 3 1
      // 0d5: iload 1
      // 0d6: ifeq 0fc
      // 0d9: aload 0
      // 0da: getfield q3g.k1w Lw51;
      // 0dd: getstatic w51.mem Lw51;
      // 0e0: if_acmpeq 0f9
      // 0e3: goto 0ea
      // 0e6: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0e9: athrow
      // 0ea: aload 0
      // 0eb: getfield q3g.nhq [Z
      // 0ee: iload 8
      // 0f0: bipush 1
      // 0f1: bastore
      // 0f2: goto 0f9
      // 0f5: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0f8: athrow
      // 0f9: iinc 6 1
      // 0fc: iload 1
      // 0fd: ifne 051
      // 100: iload 4
      // 102: iload 1
      // 103: ifeq 125
      // 106: iflt 124
      // 109: goto 110
      // 10c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 10f: athrow
      // 110: aload 0
      // 111: getstatic net/optifine/util/TextureUtils.iconGrassSideOverlay Lsla;
      // 114: iload 4
      // 116: invokespecial q3g.yzh (Lsla;I)I
      // 119: pop
      // 11a: iinc 3 1
      // 11d: goto 124
      // 120: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 123: athrow
      // 124: iload 3
      // 125: ifle 128
      // 128: return
   }

   private int yzh(sla param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: sipush 3553
      // 03: aload 1
      // 04: getfield sla.rgj I
      // 07: invokestatic org/lwjgl/opengl/GL11.glBindTexture (II)V
      // 0a: invokestatic t9d.c ()I
      // 0d: bipush -1
      // 0e: istore 4
      // 10: bipush -1
      // 11: istore 5
      // 13: aload 0
      // 14: getfield q3g.gb0 I
      // 17: bipush 4
      // 18: idiv
      // 19: istore 6
      // 1b: iload 2
      // 1c: istore 7
      // 1e: istore 3
      // 1f: iload 7
      // 21: iload 6
      // 23: if_icmpge b4
      // 26: aload 0
      // 27: getfield q3g._vb [Lsla;
      // 2a: iload 7
      // 2c: aaload
      // 2d: astore 8
      // 2f: iload 3
      // 30: ifne d3
      // 33: aload 8
      // 35: aload 1
      // 36: if_acmpne 5f
      // 39: goto 40
      // 3c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3f: athrow
      // 40: iload 5
      // 42: iload 3
      // 43: ifne 59
      // 46: goto 4d
      // 49: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4c: athrow
      // 4d: ifge ad
      // 50: goto 57
      // 53: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 56: athrow
      // 57: iload 7
      // 59: istore 5
      // 5b: iload 3
      // 5c: ifeq ad
      // 5f: iload 5
      // 61: iflt ad
      // 64: goto 6b
      // 67: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 6a: athrow
      // 6b: aload 0
      // 6c: iload 5
      // 6e: iload 7
      // 70: invokespecial q3g.eeo (II)V
      // 73: iload 3
      // 74: ifne 99
      // 77: goto 7e
      // 7a: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield q3g.k1w Lw51;
      // 82: getstatic w51.mem Lw51;
      // 85: if_acmpne 96
      // 88: goto 8f
      // 8b: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 8e: athrow
      // 8f: iload 7
      // 91: ireturn
      // 92: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 95: athrow
      // 96: bipush -1
      // 97: istore 5
      // 99: iload 3
      // 9a: ifne b0
      // 9d: iload 4
      // 9f: ifge ad
      // a2: goto a9
      // a5: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // a8: athrow
      // a9: iload 7
      // ab: istore 4
      // ad: iinc 7 1
      // b0: iload 3
      // b1: ifeq 1f
      // b4: iload 5
      // b6: iload 3
      // b7: ifne d5
      // ba: iflt d3
      // bd: goto c4
      // c0: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // c3: athrow
      // c4: aload 0
      // c5: iload 5
      // c7: iload 6
      // c9: invokespecial q3g.eeo (II)V
      // cc: goto d3
      // cf: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // d2: athrow
      // d3: iload 4
      // d5: iload 3
      // d6: ifne e9
      // d9: ifge e7
      // dc: goto e3
      // df: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // e2: athrow
      // e3: iload 6
      // e5: istore 4
      // e7: iload 4
      // e9: ireturn
   }

   private void eeo(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 1
      // 06: isub
      // 07: istore 4
      // 09: iload 4
      // 0b: iload 3
      // 0c: ifeq 23
      // 0f: ifle 36
      // 12: goto 19
      // 15: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 18: athrow
      // 19: iload 1
      // 1a: bipush 4
      // 1b: imul
      // 1c: goto 23
      // 1f: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 22: athrow
      // 23: istore 5
      // 25: iload 4
      // 27: bipush 4
      // 28: imul
      // 29: istore 6
      // 2b: aload 0
      // 2c: getfield q3g.msu I
      // 2f: iload 5
      // 31: iload 6
      // 33: invokestatic org/lwjgl/opengl/GL11.glDrawArrays (III)V
      // 36: return
   }

   public void _8s(w51 param1) {
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
      // 05: iload 2
      // 06: ifne 20
      // 09: aload 1
      // 0a: putfield q3g.k1w Lw51;
      // 0d: aload 1
      // 0e: ifnonnull 4a
      // 11: goto 18
      // 14: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 17: athrow
      // 18: aload 0
      // 19: goto 20
      // 1c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f: athrow
      // 20: iload 2
      // 21: ifne 46
      // 24: getfield q3g._vb [Lsla;
      // 27: ifnull 40
      // 2a: goto 31
      // 2d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 30: athrow
      // 31: aload 0
      // 32: aload 0
      // 33: getfield q3g._vb [Lsla;
      // 36: putfield q3g.cwr [Lsla;
      // 39: goto 40
      // 3c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3f: athrow
      // 40: aload 0
      // 41: aconst_null
      // 42: putfield q3g._vb [Lsla;
      // 45: aload 0
      // 46: aconst_null
      // 47: putfield q3g.ob1 Lsla;
      // 4a: return
   }

   private int xh7() {
      return this.khm.capacity() * 4 / (this.xfj.olc() * 4);
   }

   public RenderEnv xgm(zfz param1, mew param2) {
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
      // 05: getfield q3g.meu Lnet/optifine/render/RenderEnv;
      // 08: iload 3
      // 09: ifeq 39
      // 0c: ifnonnull 2c
      // 0f: goto 16
      // 12: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 15: athrow
      // 16: aload 0
      // 17: new net/optifine/render/RenderEnv
      // 1a: dup
      // 1b: aload 1
      // 1c: aload 2
      // 1d: invokespecial net/optifine/render/RenderEnv.<init> (Lzfz;Lmew;)V
      // 20: putfield q3g.meu Lnet/optifine/render/RenderEnv;
      // 23: aload 0
      // 24: getfield q3g.meu Lnet/optifine/render/RenderEnv;
      // 27: areturn
      // 28: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield q3g.meu Lnet/optifine/render/RenderEnv;
      // 30: aload 1
      // 31: aload 2
      // 32: invokevirtual net/optifine/render/RenderEnv.reset (Lzfz;Lmew;)V
      // 35: aload 0
      // 36: getfield q3g.meu Lnet/optifine/render/RenderEnv;
      // 39: areturn
   }

   public boolean rbv() {
      return this.af3;
   }

   public double _7s() {
      return this.eyp;
   }

   public double m6k() {
      return this.uu5;
   }

   public double tvo() {
      return this.yfg;
   }

   public w51 o9k() {
      return this.k1w;
   }

   public void e9w(float param1, float param2, float param3, float param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: iload 5
      // 03: invokevirtual q3g.a7k (I)I
      // 06: istore 7
      // 08: invokestatic t9d.c ()I
      // 0b: bipush -1
      // 0c: istore 8
      // 0e: istore 6
      // 10: aload 0
      // 11: iload 6
      // 13: ifne f0
      // 16: getfield q3g.q_4 Z
      // 19: ifne ef
      // 1c: goto 23
      // 1f: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield q3g.khm Ljava/nio/IntBuffer;
      // 27: iload 7
      // 29: invokevirtual java/nio/IntBuffer.get (I)I
      // 2c: iload 6
      // 2e: ifne ac
      // 31: goto 38
      // 34: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 37: athrow
      // 38: istore 8
      // 3a: invokestatic java/nio/ByteOrder.nativeOrder ()Ljava/nio/ByteOrder;
      // 3d: getstatic java/nio/ByteOrder.LITTLE_ENDIAN Ljava/nio/ByteOrder;
      // 40: if_acmpne 98
      // 43: iload 8
      // 45: sipush 255
      // 48: iand
      // 49: i2f
      // 4a: fload 1
      // 4b: fmul
      // 4c: f2i
      // 4d: istore 9
      // 4f: iload 8
      // 51: bipush 8
      // 53: ishr
      // 54: sipush 255
      // 57: iand
      // 58: i2f
      // 59: fload 2
      // 5a: fmul
      // 5b: f2i
      // 5c: istore 10
      // 5e: iload 8
      // 60: bipush 16
      // 62: ishr
      // 63: sipush 255
      // 66: iand
      // 67: i2f
      // 68: fload 3
      // 69: fmul
      // 6a: f2i
      // 6b: istore 11
      // 6d: iload 8
      // 6f: bipush 24
      // 71: ishr
      // 72: sipush 255
      // 75: iand
      // 76: i2f
      // 77: fload 4
      // 79: fmul
      // 7a: f2i
      // 7b: istore 12
      // 7d: iload 12
      // 7f: bipush 24
      // 81: ishl
      // 82: iload 11
      // 84: bipush 16
      // 86: ishl
      // 87: ior
      // 88: iload 10
      // 8a: bipush 8
      // 8c: ishl
      // 8d: ior
      // 8e: iload 9
      // 90: ior
      // 91: istore 8
      // 93: iload 6
      // 95: ifeq ef
      // 98: iload 8
      // 9a: bipush 24
      // 9c: ishr
      // 9d: sipush 255
      // a0: iand
      // a1: i2f
      // a2: fload 1
      // a3: fmul
      // a4: f2i
      // a5: goto ac
      // a8: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // ab: athrow
      // ac: istore 9
      // ae: iload 8
      // b0: bipush 16
      // b2: ishr
      // b3: sipush 255
      // b6: iand
      // b7: i2f
      // b8: fload 2
      // b9: fmul
      // ba: f2i
      // bb: istore 10
      // bd: iload 8
      // bf: bipush 8
      // c1: ishr
      // c2: sipush 255
      // c5: iand
      // c6: i2f
      // c7: fload 3
      // c8: fmul
      // c9: f2i
      // ca: istore 11
      // cc: iload 8
      // ce: sipush 255
      // d1: iand
      // d2: i2f
      // d3: fload 4
      // d5: fmul
      // d6: f2i
      // d7: istore 12
      // d9: iload 9
      // db: bipush 24
      // dd: ishl
      // de: iload 10
      // e0: bipush 16
      // e2: ishl
      // e3: ior
      // e4: iload 11
      // e6: bipush 8
      // e8: ishl
      // e9: ior
      // ea: iload 12
      // ec: ior
      // ed: istore 8
      // ef: aload 0
      // f0: getfield q3g.khm Ljava/nio/IntBuffer;
      // f3: iload 7
      // f5: iload 8
      // f7: invokevirtual java/nio/IntBuffer.put (II)Ljava/nio/IntBuffer;
      // fa: pop
      // fb: return
   }

   public void xqp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 020
      // 009: getfield q3g.msu I
      // 00c: bipush 7
      // 00e: if_icmpne 14f
      // 011: goto 018
      // 014: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 017: athrow
      // 018: aload 0
      // 019: goto 020
      // 01c: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 01f: athrow
      // 020: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 023: iload 1
      // 024: ifne 04c
      // 027: ifnonnull 048
      // 02a: goto 031
      // 02d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 030: athrow
      // 031: aload 0
      // 032: aload 0
      // 033: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 036: invokevirtual java/nio/ByteBuffer.capacity ()I
      // 039: bipush 2
      // 03a: imul
      // 03b: invokestatic nkx.eh9 (I)Ljava/nio/ByteBuffer;
      // 03e: putfield q3g.kcq Ljava/nio/ByteBuffer;
      // 041: goto 048
      // 044: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 047: athrow
      // 048: aload 0
      // 049: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 04c: invokevirtual java/nio/ByteBuffer.capacity ()I
      // 04f: iload 1
      // 050: ifne 084
      // 053: aload 0
      // 054: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 057: invokevirtual java/nio/ByteBuffer.capacity ()I
      // 05a: bipush 2
      // 05b: imul
      // 05c: if_icmpge 07d
      // 05f: goto 066
      // 062: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 065: athrow
      // 066: aload 0
      // 067: aload 0
      // 068: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 06b: invokevirtual java/nio/ByteBuffer.capacity ()I
      // 06e: bipush 2
      // 06f: imul
      // 070: invokestatic nkx.eh9 (I)Ljava/nio/ByteBuffer;
      // 073: putfield q3g.kcq Ljava/nio/ByteBuffer;
      // 076: goto 07d
      // 079: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 07c: athrow
      // 07d: aload 0
      // 07e: getfield q3g.xfj Lbe7;
      // 081: invokevirtual be7.vy7 ()I
      // 084: istore 2
      // 085: aload 0
      // 086: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 089: invokevirtual java/nio/ByteBuffer.limit ()I
      // 08c: istore 3
      // 08d: aload 0
      // 08e: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 091: invokevirtual java/nio/ByteBuffer.rewind ()Ljava/nio/Buffer;
      // 094: pop
      // 095: aload 0
      // 096: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 099: invokevirtual java/nio/ByteBuffer.clear ()Ljava/nio/Buffer;
      // 09c: pop
      // 09d: bipush 0
      // 09e: istore 4
      // 0a0: iload 4
      // 0a2: aload 0
      // 0a3: getfield q3g.gb0 I
      // 0a6: if_icmpge 131
      // 0a9: aload 0
      // 0aa: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0ad: iload 4
      // 0af: bipush 3
      // 0b0: iadd
      // 0b1: iload 2
      // 0b2: imul
      // 0b3: invokevirtual java/nio/ByteBuffer.limit (I)Ljava/nio/Buffer;
      // 0b6: pop
      // 0b7: aload 0
      // 0b8: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0bb: iload 4
      // 0bd: iload 2
      // 0be: imul
      // 0bf: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/Buffer;
      // 0c2: pop
      // 0c3: aload 0
      // 0c4: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 0c7: aload 0
      // 0c8: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0cb: invokevirtual java/nio/ByteBuffer.put (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
      // 0ce: pop
      // 0cf: aload 0
      // 0d0: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0d3: iload 4
      // 0d5: bipush 1
      // 0d6: iadd
      // 0d7: iload 2
      // 0d8: imul
      // 0d9: invokevirtual java/nio/ByteBuffer.limit (I)Ljava/nio/Buffer;
      // 0dc: pop
      // 0dd: aload 0
      // 0de: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0e1: iload 4
      // 0e3: iload 2
      // 0e4: imul
      // 0e5: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/Buffer;
      // 0e8: pop
      // 0e9: aload 0
      // 0ea: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 0ed: aload 0
      // 0ee: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0f1: invokevirtual java/nio/ByteBuffer.put (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
      // 0f4: pop
      // 0f5: aload 0
      // 0f6: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 0f9: iload 4
      // 0fb: bipush 2
      // 0fc: iadd
      // 0fd: bipush 2
      // 0fe: iadd
      // 0ff: iload 2
      // 100: imul
      // 101: invokevirtual java/nio/ByteBuffer.limit (I)Ljava/nio/Buffer;
      // 104: pop
      // 105: aload 0
      // 106: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 109: iload 4
      // 10b: bipush 2
      // 10c: iadd
      // 10d: iload 2
      // 10e: imul
      // 10f: invokevirtual java/nio/ByteBuffer.position (I)Ljava/nio/Buffer;
      // 112: pop
      // 113: aload 0
      // 114: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 117: aload 0
      // 118: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 11b: invokevirtual java/nio/ByteBuffer.put (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
      // 11e: pop
      // 11f: iinc 4 4
      // 122: iload 1
      // 123: ifne 14a
      // 126: iload 1
      // 127: ifeq 0a0
      // 12a: goto 131
      // 12d: invokestatic q3g.a (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 130: athrow
      // 131: aload 0
      // 132: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 135: iload 3
      // 136: invokevirtual java/nio/ByteBuffer.limit (I)Ljava/nio/Buffer;
      // 139: pop
      // 13a: aload 0
      // 13b: getfield q3g.lmi Ljava/nio/ByteBuffer;
      // 13e: invokevirtual java/nio/ByteBuffer.rewind ()Ljava/nio/Buffer;
      // 141: pop
      // 142: aload 0
      // 143: getfield q3g.kcq Ljava/nio/ByteBuffer;
      // 146: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/Buffer;
      // 149: pop
      // 14a: aload 0
      // 14b: bipush 1
      // 14c: putfield q3g.r7b Z
      // 14f: return
   }

   public boolean _l4() {
      return this.q_4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1120280641084021616L, -6148500054457341683L, MethodHandles.lookup().lookupClass()).a(56494923320391L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 40231492226199L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "í¼'ë\u0081úåÇÔci³\u0010§\u0012\u0084P\u0019ªnú\u0005\u001ciÝ0¾ÄA\"e\u00977ïpUrY°tw\u008aÎ÷\tSk]×së\u0019æ\u0015\u0095\u008b\u0002,½\u0082j\u009b;lùÖÆ²,ªhZ\u0084:ç\u00923Y£-Ñ\u008e8\u0080ó\u0081Ää X<IÎ#»äÑ(\u0081iiÇÒHs\u008d\u001d\u0091\u0088ú\u0016;PÀLû>2Áh\u0098:*Î\u0015c\u000f¨\u0081w\\õ>ÞNÆ.\u0014";
      int var8 = "í¼'ë\u0081úåÇÔci³\u0010§\u0012\u0084P\u0019ªnú\u0005\u001ciÝ0¾ÄA\"e\u00977ïpUrY°tw\u008aÎ÷\tSk]×së\u0019æ\u0015\u0095\u008b\u0002,½\u0082j\u009b;lùÖÆ²,ªhZ\u0084:ç\u00923Y£-Ñ\u008e8\u0080ó\u0081Ää X<IÎ#»äÑ(\u0081iiÇÒHs\u008d\u001d\u0091\u0088ú\u0016;PÀLû>2Áh\u0098:*Î\u0015c\u000f¨\u0081w\\õ>ÞNÆ.\u0014"
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
                     c = new String[5];
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

                  var6 = "Î\u0088\u008b\u0097\u0083íóYn\b\u009aã\u009c_¸Âi\u009c\u0081I#q¸#ÚstmÏ´\u009cë(\u0004P\u0090Ï4ùú\u000e^4ýî\nªÇ~\u0018Ú(ÒÕ·O¥®9\u0003\u0083´(ü\u001dÿ&Á¸\u008dý\u0095C";
                  var8 = "Î\u0088\u008b\u0097\u0083íóYn\b\u009aã\u009c_¸Âi\u009c\u0081I#q¸#ÚstmÏ´\u009cë(\u0004P\u0090Ï4ùú\u000e^4ýî\nªÇ~\u0018Ú(ÒÕ·O¥®9\u0003\u0083´(ü\u001dÿ&Á¸\u008dý\u0095C"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalStateException a(IllegalStateException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30944;
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
            throw new RuntimeException("q3g", var10);
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
         throw new RuntimeException("q3g" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
